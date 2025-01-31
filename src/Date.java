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

    public Date(byte day, Month month, int year){

        byte maxDaysInMonth;
        switch(month) {
            case FEBRUARY:
                maxDaysInMonth = 29; break;
            case APRIL: case JUNE: case SEPTEMBER: case NOVEMBER:
                maxDaysInMonth = 30; break;
            default:
                maxDaysInMonth = 31; break;
        }




    }

}
