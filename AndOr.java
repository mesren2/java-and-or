public class AndOr {

    private final boolean result;

    /**
     * Constructor that evaluates (!q &| !w) logic:
     * Returns true if any flag is false.
     *
     * @param flags array of boolean flags
     */
    public AndOr(boolean... flags) {
        if (flags == null || flags.length == 0) {
            throw new IllegalArgumentException("At least one flag must be provided.");
        }

        // Combined logic: true if any flag is false
        boolean temp = false;
        for (boolean flag : flags) {
            if (!flag) {
                temp = true;
                break;
            }
        }
        this.result = temp;
    }

    /**
     * Gets the result of the logic evaluation.
     *
     * @return the result
     */
    public boolean get() {
        return result;
    }
}
