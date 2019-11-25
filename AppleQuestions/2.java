
// Write a function to check if array has duplicates or not 
public static boolean isDublicate(int[] arr){
    Set<Integer> set = new HashSet<>(Arrays.asList(arr));
    if (set.size() < arr.length() ) return true;

    return false;

}

// Write a function returns duplicates of an array. 

public static List isDublicate(int[] arr){
		
    Set<Integer> set = new HashSet<Integer>(arr.length);
    for (int i : arr)
    {
        set.add(i);
    }
    
    List<Integer> duplicates = new ArrayList<Integer>();
    int index = 0;
  for (int i : arr)
  {
    if (set.contains(i)){
        duplicates.add(i);
        index++;
    }
   
  }
  return duplicates;

}