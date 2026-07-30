package p002l;

import com.p1.mobile.putong.live.base.data.BLiveEffect;
import com.p1.mobile.putong.live.base.data.Priority;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class vhj extends AbstractC0675m4 {
    @Override // p002l.AbstractC0675m4
    /* JADX INFO: renamed from: b */
    public String mo11105b(BLiveEffect bLiveEffect) {
        return bLiveEffect == null ? "" : this.f15228a.m27091p(bLiveEffect.id, bLiveEffect.hdType, bLiveEffect.zip);
    }

    @Override // p002l.AbstractC0675m4
    /* JADX INFO: renamed from: d */
    public boolean mo11106d(BLiveEffect bLiveEffect) {
        if (!this.f15228a.mo21928i(bLiveEffect.id, bLiveEffect.hdType, bLiveEffect.zip)) {
            return false;
        }
        aqe.m10039i().m10041e(bLiveEffect.id);
        return true;
    }

    @Override // p002l.AbstractC0675m4
    /* JADX INFO: renamed from: f */
    public boolean mo11107f(String str, boolean z, h7e h7eVar, bwc0 bwc0Var) {
        BLiveEffect bLiveEffectM17694c = m17694c(str);
        if (bLiveEffectM17694c == null) {
            return false;
        }
        if (this.f15228a.mo21928i(bLiveEffectM17694c.id, bLiveEffectM17694c.hdType, bLiveEffectM17694c.zip)) {
            aqe.m10039i().m10041e(str);
            return true;
        }
        if (z) {
            this.f15228a.m27083f(bLiveEffectM17694c.id, bLiveEffectM17694c.hdType, bLiveEffectM17694c.zip, bLiveEffectM17694c.md5, Priority.get("IMMEDIATE"), h7eVar, bwc0Var);
        }
        return false;
    }
}
