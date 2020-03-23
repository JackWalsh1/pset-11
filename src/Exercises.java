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
    return null;
  }

  public ArrayList<Integer> insertion(ArrayList<Integer> list, boolean ascending) {
    return null;
  }

  public String[] insertion(String[] list, boolean ascending) {
    return null;
  }

  public int[] selection(int[] list, boolean ascending) {
    return null;
  }

  public ArrayList<String> selection(ArrayList<String> list, boolean ascending) {
    return null;
  }

  public ArrayList<Integer> merge(ArrayList<Integer> list, boolean ascending) {
    return null;
  }

  public String[] merge(String[] list, boolean ascending) {
    return null;
  }
}