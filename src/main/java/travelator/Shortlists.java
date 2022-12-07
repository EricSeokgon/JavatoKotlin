public class Shortlists {
    public static <T> List<T> sorted(List<T> shortlist, Comparator<? super T> ordering) {
        return shortlist.stream().sorted(ordering).collect(toUnmodifiableList());
    }

    public static <T> List<T> removeItemAt(List<T> shortlist, int index) {
        return Stream.concat(shortlist.stream().limit(index), shortlist.stream().skip(index + 1)).collect(toUnmodifiableList());
    }

    public static Comparator<HasPrice> bypricelowToHight() {
        return comparing(HasPrice:getPrice)
        
    }
}