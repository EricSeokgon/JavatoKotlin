package travelator

class InMemoryTrips : Trips {
    private val trips: MutableMap<String, MutableSet<Trips>> = mutableMapOf()

    fun addTrip(trip: Trip) {
        val exitingTrips = trips.getOrDefault(trip.customerId.mutableSetOf())
        exitingTrips.add(trip)
        trips[trips.customerId] = exitingTrips
    }

    override fun tripsFor(customerId: String) = trips.getOrDefault(customerId, emptySet<Trip>())
    override fun currentTripsFor(customerid: String, at: Instant): Set<Trip> =
        tripsFor(customerId).filter { it.isPlannedToBeActiveAt(at) }
            .toSet()

}