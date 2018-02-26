package net.keepsmilingproject;

public enum GradeLevel {
    FRESHMAN("Freshman"),
    SOPHOMORE("Sophomore"),
    JUNIOR("Junior"),
    SENIOR("Senior");

    private final String m_legend;

    private GradeLevel(final String legend) {
        this.m_legend = legend;
    }

    /**
     *
     * @return a text representation of the enum value.  First letter would be upper case.
     */
    public String getLegend() {
        return this.m_legend;
    }
}
