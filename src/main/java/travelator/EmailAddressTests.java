public class EmailAddressTests {

    @Test
    public void parsing() {
        assertEquals(
                new EmailAddress("fred", "example.com"),
                EmailAddress.parse("fred@example.com")

        );
    }

    public void parsingFailures() {
        assertThrows(
                IllegalArgumentException.class, () -> EmailAddress.parse("@")
        );
    }
}