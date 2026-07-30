package p153l;

import android.content.Context;
import com.apm.lite.nativecrash.NativeImpl;

/* JADX INFO: loaded from: classes.dex */
public final class h3r0 implements Runnable {

    /* JADX INFO: renamed from: a */
    private Context f107684a;

    private h3r0(Context context) {
        this.f107684a = context;
    }

    /* JADX INFO: renamed from: a */
    public static void m133518a(Context context) {
        m133519b(context, 0);
    }

    /* JADX INFO: renamed from: b */
    public static void m133519b(Context context, int i) {
        c5r0.m108080b().m179946f(new h3r0(context), i);
    }

    /* JADX INFO: renamed from: c */
    public static boolean m133520c() {
        return guq0.m132359a().m132383s() || !lrq0.m155646j(n0r0.m161022i());
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            vxq0.m203873f();
        } catch (Throwable unused) {
        }
        try {
            if (lrq0.m155646j(this.f107684a)) {
                guq0.m132359a().m132381k(l5r0.m152978c(this.f107684a));
            } else {
                NativeImpl.m5183u();
            }
            k5r0.m148477c().m148488f(n0r0.m161015b().m100918d(), vuq0.m202885i());
            if (c5r0.m108080b().m179943a() == null || cyq0.m113207a() == null) {
            }
        } catch (Throwable th) {
            try {
                q5r0.m175517g(th);
            } finally {
                k5r0.m148477c().m148488f(n0r0.m161015b().m100918d(), vuq0.m202885i());
                if (c5r0.m108080b().m179943a() != null && cyq0.m113207a() != null) {
                    xxq0.m213555a(c5r0.m108080b().m179943a(), this.f107684a).m213556b();
                }
            }
        }
    }
}
