import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

class ProductTagger {
    /**
     * TO-DO: Check if 'setA' is a subset of 'setB'.
     * For example, if setA is {"electronics", "sale"} and setB is {"electronics", "sale", "new"},
     * then the method should return true.
     \*
     * @param setA The potential subset.
     * @param setB The potential superset.
     * @return true if all elements of setA are in setB, false otherwise.
     */
    public boolean isSubset(Set<String> setA, Set<String> setB) {
      if(setB.containsAll(setA)){
       return true;
      }
      return false;
    }
    public static void main(String[] args) {
        ProductTagger tagger = new ProductTagger();

        Set<String> tagsA = new HashSet<>(Arrays.asList("electronics", "sale"));
        Set<String> tagsB = new HashSet<>(Arrays.asList("electronics", "sale", "new"));
        Set<String> tagsC = new HashSet<>(Arrays.asList("sale", "furniture"));

        System.out.println("Is A subset of B? " + tagger.isSubset(tagsA, tagsB)); // true
        System.out.println("Is C subset of B? " + tagger.isSubset(tagsC, tagsB)); // false
    }
}