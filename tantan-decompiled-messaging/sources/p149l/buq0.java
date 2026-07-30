package p149l;

import android.content.Context;
import com.apm.lite.nativecrash.NativeImpl;

/* JADX INFO: loaded from: classes.dex */
public final class buq0 implements Runnable {

    /* JADX INFO: renamed from: a */
    private Context f77365a;

    private buq0(Context context) {
        this.f77365a = context;
    }

    /* JADX INFO: renamed from: a */
    public static void m103989a(Context context) {
        m103990b(context, 0);
    }

    /* JADX INFO: renamed from: b */
    public static void m103990b(Context context, int i) {
        wvq0.m205758b().m151993f(new buq0(context), i);
    }

    /* JADX INFO: renamed from: c */
    public static boolean m103991c() {
        return alq0.m97416a().m97440s() || !giq0.m126395j(hrq0.m132700i());
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            poq0.m170638f();
        } catch (Throwable unused) {
        }
        try {
            if (giq0.m126395j(this.f77365a)) {
                alq0.m97416a().m97438k(fwq0.m123554c(this.f77365a));
            } else {
                NativeImpl.m5173u();
            }
            ewq0.m118487c().m118498f(hrq0.m132693b().m194561d(), plq0.m170250i());
            if (wvq0.m205758b().m151990a() == null || woq0.m204854a() == null) {
            }
        } catch (Throwable th) {
            try {
                kwq0.m147634g(th);
            } finally {
                ewq0.m118487c().m118498f(hrq0.m132693b().m194561d(), plq0.m170250i());
                if (wvq0.m205758b().m151990a() != null && woq0.m204854a() != null) {
                    roq0.m180245a(wvq0.m205758b().m151990a(), this.f77365a).m180246b();
                }
            }
        }
    }
}
