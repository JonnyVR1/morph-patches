package org.seamless.util;

/* JADX INFO: renamed from: org.seamless.util.OS */
/* JADX INFO: loaded from: classes3.dex */
public class C22141OS {
    public static boolean checkForHp() {
        return checkForPresence("os.name", "hp");
    }

    public static boolean checkForLinux() {
        return checkForPresence("os.name", "linux");
    }

    public static boolean checkForMac() {
        return checkForPresence("os.name", "mac");
    }

    private static boolean checkForPresence(String str, String str2) {
        try {
            String property = System.getProperty(str);
            return property != null && property.trim().toLowerCase().startsWith(str2);
        } catch (Throwable unused) {
        }
    }

    public static boolean checkForSolaris() {
        return checkForPresence("os.name", "sun");
    }

    public static boolean checkForWindows() {
        return checkForPresence("os.name", "win");
    }
}
