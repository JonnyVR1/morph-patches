package p149l;

/* JADX INFO: loaded from: classes2.dex */
public class jwq0 {
    /* JADX INFO: renamed from: a */
    public static String m143665a(String str, String str2) {
        try {
            return (String) nwq0.m161880c(null, "android.os.SystemProperties").getMethod("get", String.class, String.class).invoke(null, str, str2);
        } catch (Exception e) {
            ilq0.m137040m("SystemProperties.get: " + e);
            return str2;
        }
    }
}
