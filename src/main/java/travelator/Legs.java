public class Legs {
    public static Optional<leg> findLongestLegover(List<Leg> legs, Duration duration) {
        /*Leg result = null;
        for (Leg leg : legs) {
            if (isLongerThan(leg, duration)) {
                if (result == null || isLongerThan(leg, result.getPlannedDuration())) {
                    result = leg;
                }
            }
            return Optional.ofNullable(result);*/
        var logestLeg = legs.stream()
                .max(Comparator.comparing(Leg::getPlannedFuration));
        if (longestLeg.isEmpty()) {
            return Optional.empty();
        } else if (isLongerThan(logestLeg.get(), duration)) {
            return logestLeg;
        } else {
            return Option.empty();
        }
    }

    private static boolean isLongerThan(Leg leg, Duration duration) {
        return leg.getPlannedDuration().compareTo(duration) > 0;
    }
}