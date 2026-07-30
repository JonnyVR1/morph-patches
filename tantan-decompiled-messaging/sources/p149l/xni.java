package p149l;

import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.Merchandise;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public class xni {

    /* JADX INFO: renamed from: i */
    public static xni f193688i;

    /* JADX INFO: renamed from: a */
    public zpd0 f193689a = new zpd0("firstShowLowPriceTime" + CoreModule.m29931H().userId(), 0L);

    /* JADX INFO: renamed from: b */
    public hpd0 f193690b;

    /* JADX INFO: renamed from: c */
    public hpd0 f193691c;

    /* JADX INFO: renamed from: d */
    public hpd0 f193692d;

    /* JADX INFO: renamed from: e */
    public hpd0 f193693e;

    /* JADX INFO: renamed from: f */
    public zpd0 f193694f;

    /* JADX INFO: renamed from: g */
    public zpd0 f193695g;

    /* JADX INFO: renamed from: h */
    public boolean f193696h;

    public xni() {
        String str = "showFirstRedPointMyTab" + CoreModule.m29931H().userId();
        Boolean bool = Boolean.FALSE;
        this.f193690b = new hpd0(str, bool);
        this.f193691c = new hpd0("showEndRedPointMyTab" + CoreModule.m29931H().userId(), bool);
        this.f193692d = new hpd0("showFirstRedPointMyPrivilege" + CoreModule.m29931H().userId(), bool);
        this.f193693e = new hpd0("showEndRedPointMyPrivilege" + CoreModule.m29931H().userId(), bool);
        this.f193694f = new zpd0("firstShowLowPriceDialogTime" + CoreModule.m29931H().userId(), 0L);
        this.f193695g = new zpd0("endShowLowPriceDialogTime" + CoreModule.m29931H().userId(), 0L);
        this.f193696h = false;
    }

    /* JADX INFO: renamed from: a */
    public static xni m210163a() {
        if (f193688i == null) {
            synchronized (xni.class) {
                try {
                    if (f193688i == null) {
                        f193688i = new xni();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f193688i;
    }

    /* JADX INFO: renamed from: b */
    public static List<String> m210164b(Merchandise merchandise) {
        return mqi0.m155940k(vwb.m200296J(merchandise.localCoupons) ? 0L : ((long) merchandise.localCoupons.get(0).endTime) - mqi0.m155944o());
    }

    /* JADX INFO: renamed from: c */
    public static boolean m210165c() {
        return !CoreModule.f17545c.f19639e0.m169527p9().isVIP() && CoreModule.m29935P().m94651a().mo33489e2() && !CoreModule.m29935P().m94651a().mo33634z9() && xma.m210071e4();
    }

    /* JADX INFO: renamed from: d */
    public void m210166d(long j) {
        if (((int) ((j - mqi0.m155944o()) / 86400000)) == 0) {
            this.f193691c.put(Boolean.TRUE);
        }
        this.f193690b.put(Boolean.TRUE);
    }

    /* JADX INFO: renamed from: e */
    public void m210167e() {
        this.f193691c.put(Boolean.TRUE);
    }

    /* JADX INFO: renamed from: f */
    public boolean m210168f(long j) {
        return ((int) ((j - mqi0.m155944o()) / 86400000)) == 0 && !this.f193691c.get().booleanValue();
    }
}
