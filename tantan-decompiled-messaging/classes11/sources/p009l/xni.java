package p009l;

import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.data.Coupon;
import com.p1.mobile.putong.core.data.Merchandise;
import java.util.List;
import l.hpd0;
import l.vwb;
import l.xma;
import l.zpd0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class xni {

    /* JADX INFO: renamed from: i */
    public static xni f22664i;

    /* JADX INFO: renamed from: a */
    public zpd0 f22665a = new zpd0("firstShowLowPriceTime" + CoreModule.H().userId(), 0L);

    /* JADX INFO: renamed from: b */
    public hpd0 f22666b;

    /* JADX INFO: renamed from: c */
    public hpd0 f22667c;

    /* JADX INFO: renamed from: d */
    public hpd0 f22668d;

    /* JADX INFO: renamed from: e */
    public hpd0 f22669e;

    /* JADX INFO: renamed from: f */
    public zpd0 f22670f;

    /* JADX INFO: renamed from: g */
    public zpd0 f22671g;

    /* JADX INFO: renamed from: h */
    public boolean f22672h;

    public xni() {
        String str = "showFirstRedPointMyTab" + CoreModule.H().userId();
        Boolean bool = Boolean.FALSE;
        this.f22666b = new hpd0(str, bool);
        this.f22667c = new hpd0("showEndRedPointMyTab" + CoreModule.H().userId(), bool);
        this.f22668d = new hpd0("showFirstRedPointMyPrivilege" + CoreModule.H().userId(), bool);
        this.f22669e = new hpd0("showEndRedPointMyPrivilege" + CoreModule.H().userId(), bool);
        this.f22670f = new zpd0("firstShowLowPriceDialogTime" + CoreModule.H().userId(), 0L);
        this.f22671g = new zpd0("endShowLowPriceDialogTime" + CoreModule.H().userId(), 0L);
        this.f22672h = false;
    }

    /* JADX INFO: renamed from: a */
    public static xni m24946a() {
        if (f22664i == null) {
            synchronized (xni.class) {
                try {
                    if (f22664i == null) {
                        f22664i = new xni();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f22664i;
    }

    /* JADX INFO: renamed from: b */
    public static List<String> m24947b(Merchandise merchandise) {
        return mqi0.m18546k(vwb.J(merchandise.localCoupons) ? 0L : ((long) ((Coupon) merchandise.localCoupons.get(0)).endTime) - mqi0.m18550o());
    }

    /* JADX INFO: renamed from: c */
    public static boolean m24948c() {
        return !CoreModule.c.e0.p9().isVIP() && CoreModule.P().a().e2() && !CoreModule.P().a().z9() && xma.e4();
    }

    /* JADX INFO: renamed from: d */
    public void m24949d(long j) {
        if (((int) ((j - mqi0.m18550o()) / 86400000)) == 0) {
            this.f22667c.put(Boolean.TRUE);
        }
        this.f22666b.put(Boolean.TRUE);
    }

    /* JADX INFO: renamed from: e */
    public void m24950e() {
        this.f22667c.put(Boolean.TRUE);
    }

    /* JADX INFO: renamed from: f */
    public boolean m24951f(long j) {
        return ((int) ((j - mqi0.m18550o()) / 86400000)) == 0 && !((Boolean) this.f22667c.get()).booleanValue();
    }
}
