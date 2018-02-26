package net.keepsmilingproject;

import net.keepsmilingproject.members.BaseMember;

import java.util.ArrayList;
import java.util.List;

public class Main {
    private static MembersManager s_membersManager = null;

    public static void main(String[] args) {

        // Print Initial Greeting
        System.out.println("Hi~~  This is Simple Test.");

        // Get a list of all members
        List<String> messages = getAllMemberMessages();

        // Check number of registered members.
        if (messages.size() <= 0) {
            System.out.println("There is no member in this club.");
        } else {
            int id = 0;
            for (String message : messages) {
                System.out.println(String.format("ID: %3d - %s", id, message));
                id++;
            }
        }
    }

    /**
     *
     * @return a list of all members.
     */
    public static List<String> getAllMemberMessages() {
        if (null == s_membersManager) {
            s_membersManager = new MembersManager();
        }

        List<BaseMember> members = s_membersManager.getMemberList();
        List<String> messages = new ArrayList<>();

        for (BaseMember member : members) {
            messages.add(member.getMemberDescription());
        }

        return messages;
    }
}
