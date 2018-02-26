package net.keepsmilingproject.members;

import net.keepsmilingproject.GradeLevel;

public class BobMember extends BaseMember {
    @Override
    public String getName() {
        return "Bob";
    }

    @Override
    public GradeLevel getGradeLevel() {
        return GradeLevel.FRESHMAN;
    }
}
