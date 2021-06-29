public enum Day {
        MONDAY("понедельник","работать и тренировка"),
        TUESDAY("вторник","работа и прогулка"),
        WEDNESDAY("среда","работа и конференция"),
        THURSDAY("четверг","работа и английский"),
        FRIDAY("пятница","работа и футбол"),
        SATURDAY("суббота","отдых на пляже"),
        SUNDAY("воскресенье","отдых в горах");
        private final String name;
        private final String dayPlan;
        Day(String n,String p){
            this.name =n;
            this.dayPlan = p;
        }

        public String getName() {
            return name;
        }

        public String getDayPlan() {
            return dayPlan;
        }

}


