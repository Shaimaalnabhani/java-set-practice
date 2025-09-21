import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.Arrays;

class UserManagement {
    private Set<String> approvedUsers = new HashSet<>(Arrays.asList("a@test.com", "b@test.com", "c@test.com"));

    /**
     * TO-DO: Remove all emails from the 'emailsToRemove' list from the 'approvedUsers' set.
     \*
     * @param emailsToRemove A list of email strings to be removed.
     */
    public void removeUsers(List<String> emailsToRemove) {
        for (String email : emailsToRemove) {
            approvedUsers.remove(email);
        }
    }
    public Set<String> getApprovedUsers() {
        return approvedUsers;
    }
    public static void main(String[] args) {
        UserManagement userManager = new UserManagement();

        System.out.println("Approved users before removal: " + userManager.getApprovedUsers());

        // Emails we want to remove
        List<String> emailsToRemove = Arrays.asList("b@test.com", "d@test.com");

        // Call the method (currently does nothing)
        userManager.removeUsers(emailsToRemove);

        System.out.println("Approved users after removal: " + userManager.getApprovedUsers());
    }
}