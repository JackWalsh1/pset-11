import java.util.ArrayList;
import java.util.*;

public class Exercises {

  public int findMe(int[] list, int target) {
    if (list == null || list.length == 0) {
      return -1;
    }

    for (int i = 0; i < list.length; i++) {
      if (list[i] == target) {
        return i;
      }
    }

    return -1;
  }

  public int findMe(ArrayList<String> list, String target) {
    if (list == null || list.size() == 0) {
      return -1;
    }

    for (String item : list) {
      if (item.equals(target)) {
        return list.indexOf(item);
      }
    }

    return -1;
  }

  public int findMeFaster(ArrayList<Integer> list, int target) {
    if (list == null || list.size() == 0) {
        return -1;
    }

    Collections.sort(list);

    int startIndex = 0;
    int endIndex = list.size() - 1;
    int midIndex = 0;

    while (startIndex <= endIndex) {
      midIndex = (startIndex + endIndex) / 2;

      if (list.get(midIndex) < target) {
        startIndex = midIndex + 1;
      } else if (list.get(midIndex) > target) {
        endIndex = midIndex - 1;
      } else {
        return midIndex;
      }
    }

    return -1;
  }

  public int findMeFaster(String[] list, String target) {
    if (list == null || list.length == 0) {
      return -1;
    }

    Arrays.sort(list);

    int startIndex = 0;
    int endIndex = list.length - 1;
    int midIndex = 0;

    while (startIndex <= endIndex) {
      midIndex = (startIndex + endIndex) / 2;

      if (list[midIndex].compareTo(target) < 0) {
        startIndex = midIndex + 1;
      } else if (list[midIndex].compareTo(target) > 0) {
        endIndex = midIndex - 1;
      } else {
        return midIndex;
      }
    }

    return -1;
  }

  public int[] bubble(int[] list, boolean ascending) {
    
    if (list == null || list.length == 0) {
      return null;
    }

    boolean changesMade = true;

    while(changesMade) {
      changesMade = false;
      for (int i = 0; i < list.length - 1; i++) {
        if (ascending) { //ascending
          if (list[i] > list[i + 1]) {
            int temp = list[i];
            list[i] = list[i + 1];
            list[i + 1] = temp;
            changesMade = true;
          }
        } else { //descending
          if (list[i] < list[i + 1]) {
            int temp = list[i];
            list[i] = list[i + 1];
            list[i + 1] = temp;
            changesMade = true;
          }
        }
      }
    }
    return list;
  }

  public ArrayList<String> bubble(ArrayList<String> list, boolean ascending) {
    if (list == null || list.size() == 0) {
      return null;
    }

    int nullCounter = 0;
    ArrayList<String> noNullList = new ArrayList<String>();
    
    for (int i = 0; i < list.size(); i++) {
      if (list.get(i) == null) {
        nullCounter++;
      } else {
        noNullList.add(list.get(i));
      }
    }

    boolean changesMade = true;

    while(changesMade) {
      changesMade = false;
      for (int i = 0; i < noNullList.size() - 1; i++) {
        if (ascending) { //ascending
          if (noNullList.get(i).compareTo(noNullList.get(i + 1)) > 0) {
            String temp = noNullList.get(i);
            noNullList.set(i, noNullList.get(i + 1));
            noNullList.set((i + 1), temp);
            changesMade = true;
          }
        } else { //descending
          if (noNullList.get(i).compareTo(noNullList.get(i + 1)) < 0) {
            String temp = noNullList.get(i);
            noNullList.set(i, noNullList.get(i + 1));
            noNullList.set((i + 1), temp);
            changesMade = true;
          }
        }
      }
    }

    for (int i = 0; i < nullCounter; i++) {
      noNullList.add(null);
    }

    return noNullList;
  }

  public ArrayList<Integer> insertion(ArrayList<Integer> list, boolean ascending) {
    if (list == null) {
      return null;
    }

    int nullCounter = 0;
    ArrayList<Integer> goodList = new ArrayList<Integer>();
    for (int i = 0; i < list.size(); i++) {
        if (list.get(i) == null) {
            nullCounter++;
        } else {
            goodList.add(list.get(i));
        }
    }

    if (ascending) {
        int i = 0; 
        while (i < goodList.size()) {
            int j = i;
            while (j > 0 && goodList.get(j - 1) > goodList.get(j)) {
                int temp = goodList.get(j - 1);
                goodList.set((j - 1), goodList.get(j));
                goodList.set(j , temp);
                j--;
            }
            i++;
        }
    } else {
        int i = 0; 
        while (i < goodList.size()) {
            int j = i;
            while (j > 0 && goodList.get(j - 1) < goodList.get(j)) {
                int temp = goodList.get(j - 1);
                goodList.set((j - 1), goodList.get(j));
                goodList.set(j , temp);
                j--;
            }
            i++;
        }
    }

    for (int i = 0; i < nullCounter; i++) {
        goodList.add(null);
    }

    return goodList;
  }
  

  public String[] insertion(String[] list, boolean ascending) {
    if (list == null || list.length == 0) {
      return null;
    }
	  
	  for (int j = 1; j < list.length; j++) {
			String current = list[j];
			int i = j - 1;
			while ((i > -1) && (list[i].compareTo(current) > 0)) {
				list[i + 1] = list[i];
				i--;
			}
			list[i + 1] = current;
		}

		if (!ascending) {
			int i;
			String t;
			int n = list.length;
			for (i = 0; i < n / 2; i++) {
				t = list[i];
				list[i] = list[n - i - 1];
				list[n - i - 1] = t;
			}
		}
		return list; 
  }

  public int[] selection(int[] list, boolean ascending) {
    if (list == null || list.length == 0) {
      return null;
    }

    if (ascending) {
        for (int i = 0; i < list.length - 1; i++) {
            int index = i;
            for (int j = i + 1; j < list.length; j++) {
                if (list[j] < list[index]) {
                    index = j;
                }
            }
            int smallerNumber = list[index];
            list[index] = list[i];
            list[i] = smallerNumber;
        }
    } else if (!ascending) {
        for (int i = 0; i < list.length - 1; i++) {
            int index = i;
            for (int j = i + 1; j < list.length; j++) {
                if (list[j] > list[index]) {
                    index = j;
                }
            }
            int smallerNumber = list[index];
            list[index] = list[i];
            list[i] = smallerNumber;
        }
    }
    return list;
  }

  public ArrayList<String> selection(ArrayList<String> list, boolean ascending) {
	  if (list == null || list.size() == 0) {
          return null;
      }

      for (int i = 0; i < list.size(); i++) {
          String smallest = list.get(i);
          int smallestIndex = i;
          for (int j = i; j < list.size(); j++) {
              String value = list.get(j);
              if (value.compareTo(smallest) < 0) {
                  smallest = value;
                  smallestIndex = j;
              }
          }
          if (smallestIndex != i) {
              String head = list.get(i);
              list.set(i, smallest);
              list.set(smallestIndex, head);
          }
      }
    return list; 
  }

  public ArrayList<Integer> merge(ArrayList<Integer> list, boolean ascending) {        
    if (list == null) {
        return null;
    }

    if (list.size() == 1) {
        return list;
    }

    int nullCounter = 0;
    ArrayList<Integer> goodList = new ArrayList<Integer>();
    for (int i = 0; i < list.size(); i++) {
        if (list.get(i) == null) {
            nullCounter++;
        } else {
            goodList.add(list.get(i));
        }
    }

    ArrayList<Integer> firstList = new ArrayList<Integer>();
    ArrayList<Integer> secondList = new ArrayList<Integer>();

    for (int i = 0; i < (goodList.size()/2); i++) {
        firstList.add(goodList.get(i));
    }
    for (int i = (goodList.size()/2); i < goodList.size(); i++) {
        secondList.add(goodList.get(i));
    }

    ArrayList<Integer> combined = combine(merge(firstList, ascending), merge(secondList, ascending), ascending);

    for (int i = 0; i < nullCounter; i++) {
        combined.add(null);
    }
    
    return combined;
}

public ArrayList<Integer> combine(ArrayList<Integer> firstList, ArrayList<Integer> secondList, boolean ascending) {
    ArrayList<Integer> combination = new ArrayList<Integer>();
    int firstLocation = 0;
    int secondLocation = 0;
  
    while (firstLocation < firstList.size() && secondLocation < secondList.size()) {
        if (ascending) {
            if (firstList.get(firstLocation) < secondList.get(secondLocation)) {
                combination.add(firstList.get(firstLocation));
                firstLocation++;
            } else {
                combination.add(secondList.get(secondLocation));
                secondLocation++;
            }
        } else {
            if (firstList.get(firstLocation) > secondList.get(secondLocation)) {
                combination.add(firstList.get(firstLocation));
                firstLocation++;
            } else {
                combination.add(secondList.get(secondLocation));
                secondLocation++;
            }
        }
    }        

    while (firstLocation == firstList.size() && secondLocation != secondList.size()) {
        combination.add(secondList.get(secondLocation));
        secondLocation++;
    }

    while (secondLocation == secondList.size() && firstLocation != firstList.size()) {
        combination.add(firstList.get(firstLocation));
        firstLocation++;
    }
    return combination;
  }

  public String[] merge(String[] list, boolean ascending) {
    if (list == null) {
        return null;
    }

    if (list.length == 1) {
        return list;
    }

    String[] firstList = new String[list.length/2];
    String[] secondList = new String[(list.length - (list.length/2))];

    for (int i = 0; i < (list.length/2); i++) {
        firstList[i] = list[i];
    }
    for (int i = 0; i < secondList.length; i++) {
        secondList[i] = list[i + (list.length/2)];
    }

    String[] combined = combine(merge(firstList, ascending), merge(secondList, ascending), ascending);
    return combined;
  }

  public String[] combine(String[] firstList, String[] secondList, boolean ascending) {
    String[] combination = new String[firstList.length + secondList.length];
    int firstLocation = 0;
    int secondLocation = 0;
    int combineLocation = 0;

    while (firstLocation < firstList.length && secondLocation < secondList.length) {
        if (ascending) {
            if (firstList[firstLocation].compareTo(secondList[secondLocation]) < 0) {
                combination[combineLocation] = firstList[firstLocation];
                firstLocation++;
                combineLocation++;
            } else {
                combination[combineLocation] = secondList[secondLocation];
                secondLocation++;
                combineLocation++;
            }
        } else {
            if (firstList[firstLocation].compareTo(secondList[secondLocation]) > 0) {
                combination[combineLocation] = firstList[firstLocation];
                firstLocation++;
                combineLocation++;
            } else {
                combination[combineLocation] = secondList[secondLocation];
                secondLocation++;
                combineLocation++;
            }
        }
    }        

    while (firstLocation == firstList.length && secondLocation != secondList.length) {
        combination[combineLocation] = secondList[secondLocation];
        secondLocation++;
        combineLocation++;
    }

    while (secondLocation == secondList.length && firstLocation != firstList.length) {
        combination[combineLocation] = firstList[firstLocation];
        firstLocation++;
        combineLocation++;
    }

    return combination;
  }
}