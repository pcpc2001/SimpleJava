package net.keepsmilingproject;

import net.keepsmilingproject.members.BaseMember;
import net.keepsmilingproject.members.BobMember;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MembersManager {
    private final List<BaseMember> m_memberList = new ArrayList<>();


    /**
     * constructor
     */
    public MembersManager() {
        this.initMembers();
    }

    /**
     *
     * @return an unmodifiable member list.
     */
    public List<BaseMember> getMemberList() {
        return Collections.unmodifiableList(this.m_memberList);
    }

    /**
     * Add a member to the list (There is no duplication check).
     * @param member to be added
     */
    private void addMember(BaseMember member) {
        this.m_memberList.add(member);
    }

    private void initMembers() {

        // Member init example
        // 1) create new instance of the member:
        BobMember bob = new BobMember();
        // 2) add member to the list:
        this.addMember(bob);


        //TODO Add your member init here...

    }
}
