package p153l;

import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.Merchandise;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public class tqi {

    /* JADX INFO: renamed from: i */
    public static tqi f175733i;

    /* JADX INFO: renamed from: a */
    public byd0 f175734a = new byd0("firstShowLowPriceTime" + CoreModule.m30929H().userId(), 0L);

    /* JADX INFO: renamed from: b */
    public jxd0 f175735b;

    /* JADX INFO: renamed from: c */
    public jxd0 f175736c;

    /* JADX INFO: renamed from: d */
    public jxd0 f175737d;

    /* JADX INFO: renamed from: e */
    public jxd0 f175738e;

    /* JADX INFO: renamed from: f */
    public byd0 f175739f;

    /* JADX INFO: renamed from: g */
    public byd0 f175740g;

    /* JADX INFO: renamed from: h */
    public boolean f175741h;

    public tqi() {
        String str = "showFirstRedPointMyTab" + CoreModule.m30929H().userId();
        Boolean bool = Boolean.FALSE;
        this.f175735b = new jxd0(str, bool);
        this.f175736c = new jxd0("showEndRedPointMyTab" + CoreModule.m30929H().userId(), bool);
        this.f175737d = new jxd0("showFirstRedPointMyPrivilege" + CoreModule.m30929H().userId(), bool);
        this.f175738e = new jxd0("showEndRedPointMyPrivilege" + CoreModule.m30929H().userId(), bool);
        this.f175739f = new byd0("firstShowLowPriceDialogTime" + CoreModule.m30929H().userId(), 0L);
        this.f175740g = new byd0("endShowLowPriceDialogTime" + CoreModule.m30929H().userId(), 0L);
        this.f175741h = false;
    }

    /* JADX INFO: renamed from: a */
    public static tqi m192301a() {
        if (f175733i == null) {
            synchronized (tqi.class) {
                try {
                    if (f175733i == null) {
                        f175733i = new tqi();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f175733i;
    }

    /* JADX INFO: renamed from: b */
    public static List<String> m192302b(Merchandise merchandise) {
        return pzi0.m174450k(jyb.m147479J(merchandise.localCoupons) ? 0L : ((long) merchandise.localCoupons.get(0).endTime) - pzi0.m174454o());
    }

    /* JADX INFO: renamed from: c */
    public static boolean m192303c() {
        return !CoreModule.f18264c.f20381e0.m116600p9().isVIP() && CoreModule.m30933P().m143405a().mo34492e2() && !CoreModule.m30933P().m143405a().mo34637z9() && joa.m146386f4();
    }

    /* JADX INFO: renamed from: d */
    public void m192304d(long j) {
        if (((int) ((j - pzi0.m174454o()) / 86400000)) == 0) {
            this.f175736c.put(Boolean.TRUE);
        }
        this.f175735b.put(Boolean.TRUE);
    }

    /* JADX INFO: renamed from: e */
    public void m192305e() {
        this.f175736c.put(Boolean.TRUE);
    }

    /* JADX INFO: renamed from: f */
    public boolean m192306f(long j) {
        return ((int) ((j - pzi0.m174454o()) / 86400000)) == 0 && !this.f175736c.get().booleanValue();
    }
}
