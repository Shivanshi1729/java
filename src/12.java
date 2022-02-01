/*
    Write a java program to take input as a command line argument. Your name,
    course, university roll no and semester. Display the information. Name:
    University: RollNo: Course: Semester:
*/

 class clis {
    public static void main(String[] args) {
        if (args.length != 4) {
            System.out.println("Invalid parameters.");
            System.exit(1);
        }

        String name = args[0];
        String course = args[1];
        String univ_roll = args[2];
        String sem = args[3];

        System.out.println(
                "Name: " + name + "\nCourse: " + course + "\nUniversity Roll no: " + univ_roll + "\nSemester: " + sem);

        System.exit(0);
    }
}