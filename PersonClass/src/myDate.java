public class myDate {
    private int month;
    private int day;
    private int year;
    myDate( int _month, int _day, int _year){
        this.day = _day;
        this.month = _month;
        this.year = _year;
    }
    myDate(myDate _date) {
        this.day = _date.day;
        this.month = _date.month;
        this.year = _date.year;
    }
    @Override
    public String toString() {
        String date = this.month + "/"+ this.day + "/"+ year;
        return date;
    }
    @Override
    protected myDate clone() throws CloneNotSupportedException {
        myDate obj = new myDate(this.day,this.month,this.year);
        return obj;
    }
    public boolean equals(myDate obj) {
        return (obj.day == this.day &&
                obj.month == this.month &&
                obj.year == this.year);
    }
}
