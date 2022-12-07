public class inMemoryTrips implements Trips {
    @Override
    public Set<Trip> currentTripsFor(String customerId) {
        return tripsFor(customerId).stream().filter(trips -> trips.isPlannedToBeActiveAt(clock.instant())).collect(toSet());
    }
}