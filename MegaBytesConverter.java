public class MegaBytesConverter {
    public static void printMegaBytesAndKiloBytes(int kiloBytes) {
        if (kiloBytes < 0) {
            System.out.println("Invalid Value");
            return;
        }
        int MegaBytes = kiloBytes / 1024;
        int LeftOverKB = kiloBytes % 1024;
        System.out.println(kiloBytes + " KB = " + MegaBytes + " MB and " + LeftOverKB + " KB");
    }
}