package p002l;

import com.p1.mobile.putong.live.base.data.BLiveEffect;

/* JADX INFO: renamed from: l.m4 */
/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public abstract class AbstractC0675m4 {

    /* JADX INFO: renamed from: a */
    public final rgq0 f15228a = new rgq0(voe.m24084b());

    /* JADX INFO: renamed from: a */
    public rgq0 m17693a() {
        return this.f15228a;
    }

    /* JADX INFO: renamed from: b */
    public abstract String mo11105b(BLiveEffect bLiveEffect);

    /* JADX INFO: renamed from: c */
    public BLiveEffect m17694c(String str) {
        return aqe.m10039i().m10044h(str);
    }

    /* JADX INFO: renamed from: d */
    public abstract boolean mo11106d(BLiveEffect bLiveEffect);

    /* JADX INFO: renamed from: e */
    public boolean m17695e(String str, boolean z, h7e h7eVar) {
        return mo11107f(str, z, h7eVar, null);
    }

    /* JADX INFO: renamed from: f */
    public abstract boolean mo11107f(String str, boolean z, h7e h7eVar, bwc0 bwc0Var);

    /* JADX INFO: renamed from: g */
    public boolean m17696g(String str) {
        return m17695e(str, false, null);
    }
}
