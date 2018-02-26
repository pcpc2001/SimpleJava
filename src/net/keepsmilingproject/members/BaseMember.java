package net.keepsmilingproject.members;

import net.keepsmilingproject.GradeLevel;

/**
 * An abstract base class for all members
 */
public abstract class BaseMember {

    /**
     *
     * @return a formatted message "My name is <Name>".
     */
    public String getMemberDescription() {
        return String.format("My name is %s and I am a %s.", this.getName(),
                this.getGradeLevel().getLegend());
    }

    /**
     *
     * @return the name of the member.
     */
    public abstract String getName();

    /**
     *
     * @return the grade level of the member.
     */
    public abstract GradeLevel getGradeLevel();
}
