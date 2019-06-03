package tdd.demo;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class LeepYearTest {
    @Test
    public void _年歴が2001の時にfalseを返す() {
        LeapYear leapYear;
        assertThat(LeapYear.isLeep(2001), is(false));
    }

    @Test
    public void _年歴が2004の時にtrueを返す() {
        assertThat(LeapYear.isLeep(2004), is(true));
    }

    @Test
    public void _年歴が2000の時にtrueを返す() {
        assertThat(LeapYear.isLeep(2000), is(true));
    }

    @Test
    public void _年歴が1900の時にfalseを返す() {
        assertThat(LeapYear.isLeep(1900), is(false));
    }
}
