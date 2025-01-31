import java.time.LocalDate;

enum Month {
    JANUARY,
    FEBRUARY,
    MARCH,
    APRIL,
    MAY,
    JUNE,
    JULY,
    AUGUST,
    SEPTEMBER,
    OCTOBER,
    NOVEMBER,
    DECEMBER
}

public class Date {

    private byte day;
    private Month month;
    private int year;
    private byte maxDaysInMonth;

    public Date(byte day, Month month, int year){

        switch(month) {
            case FEBRUARY:
                maxDaysInMonth = 29; break;
            case APRIL: case JUNE: case SEPTEMBER: case NOVEMBER:
                maxDaysInMonth = 30; break;
            default:
                maxDaysInMonth = 31; break;
        }

        if (day < 1 || day > maxDaysInMonth) {
            throw new IllegalArgumentException("Invalid day number for the given month.");
        } else{
            this.day = day;
        }
        this.month = month;
        if (year<0) {
            throw new IllegalArgumentException("Year should not be negative.");
        } else {
            this.year = year;
        }
    }

    public byte getDay() { return day; }
    public Month getMonth() { return month; }
    public int getYear() { return  year; }

    /*
     At this stage I don't need to have different setter methods for day month and year,
     because it's simpler to replace data with new Day(dd, mmmm, yyyy)
     This feature could be implemented later if needed
     */
}
