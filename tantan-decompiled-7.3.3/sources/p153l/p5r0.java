package p153l;

/* JADX INFO: loaded from: classes2.dex */
public class p5r0 {
    /* JADX INFO: renamed from: a */
    public static String m170679a(String str, String str2) {
        try {
            return (String) t5r0.m189419c(null, "android.os.SystemProperties").getMethod("get", String.class, String.class).invoke(null, str, str2);
        } catch (Exception e) {
            ouq0.m169393m("SystemProperties.get: " + e);
            return str2;
        }
    }
}
