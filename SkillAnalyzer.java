import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

class SkillAnalyzer {
    /**
     * TO-DO: Find skills present in one set but not both.
     * For example, if candidateA has {Java, Python} and candidateB has {Python, SQL},
     * the result should be {Java, SQL}.
     \*
     * @param candidateASkills The skills of the first candidate.
     * @param candidateBSkills The skills of the second candidate.
     * @return A new HashSet containing only the unique skills for each candidate.
     */
    public Set<String> findUniqueSkills(Set<String> candidateASkills, Set<String> candidateBSkills) {
        Set<String> union = new HashSet<>(candidateASkills);
        union.addAll(candidateBSkills);

        Set<String> intersection = new HashSet<>(candidateASkills); // start with A
        intersection.retainAll(candidateBSkills);

        union.removeAll(intersection);
        return union; // Placeholder
    }
    public static void main(String[] args) {
        SkillAnalyzer analyzer = new SkillAnalyzer();

        Set<String> candidateA = new HashSet<>(Arrays.asList("Java", "Python"));
        Set<String> candidateB = new HashSet<>(Arrays.asList("Python", "SQL"));
        System.out.println("Unique skills between A and B: " + analyzer.findUniqueSkills(candidateA, candidateB));
    }
}