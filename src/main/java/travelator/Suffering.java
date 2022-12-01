public class Suffering {
    public static int sufferScoreFor(List<Joutney> route) {
        Location start = getDepartsFrom(rote);
        List<Joureny> longestJourneys = longestJourneysIn(route, 3)
        return sufferScore(longestJourneys, start);

    }

    public static List<Journey> longestJourneysIn(
            List<Journey> journeys,
            int limit
    ) {
        journeys.sort(comparing(Journey::getDuration).reversed());
        var actualLimt = Math.min(journeys.size(), limit);
        return journeys.subList(0, actualLimt);
    }

    public static List<List<Journey>> routesToShowFor(String, itineraryId) {
        var routes = routesFor(itineraryId);
        removeUnbearableRoutes(routes);
        return routes;
    }

    private static void removeUnbearableRoutes(List<List<Journey>> routes) {
        routes.removeIf(route -> sufferScoreFor(route) > 10);
    }

    private static int sufferScore(
            List<Joutney> longestjourneys,
            Location start
    ) {
        return SOME_COMPLICATED_RESULT();
    }
}



