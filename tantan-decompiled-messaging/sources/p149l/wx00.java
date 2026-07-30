package p149l;

import android.content.Context;

/* JADX INFO: loaded from: classes7.dex */
public class wx00 {

    /* JADX INFO: renamed from: a */
    private static boolean f188423a = false;

    /* JADX INFO: renamed from: a */
    public static void m205895a(Context context) {
        if (f188423a) {
            return;
        }
        f188423a = true;
        o50.m162747c().m162748d(context);
        akq.m97169b().m97172d(context);
    }

    /* JADX INFO: renamed from: b */
    public static void m205896b() {
        f188423a = false;
        if (o50.m162747c() != null) {
            o50.m162747c().m162749e();
        }
        akq.m97169b().m97173e();
    }
}
