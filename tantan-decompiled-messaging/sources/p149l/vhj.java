package p149l;

import com.p046p1.mobile.putong.live.base.data.BLiveEffect;
import com.p046p1.mobile.putong.live.base.data.Priority;

/* JADX INFO: loaded from: classes4.dex */
public class vhj extends AbstractC18387m4 {
    @Override // p149l.AbstractC18387m4
    /* JADX INFO: renamed from: b */
    public String mo107443b(BLiveEffect bLiveEffect) {
        return bLiveEffect == null ? "" : this.f131211a.m217259p(bLiveEffect.f44359id, bLiveEffect.hdType, bLiveEffect.zip);
    }

    @Override // p149l.AbstractC18387m4
    /* JADX INFO: renamed from: d */
    public boolean mo107444d(BLiveEffect bLiveEffect) {
        if (!this.f131211a.mo179248i(bLiveEffect.f44359id, bLiveEffect.hdType, bLiveEffect.zip)) {
            return false;
        }
        aqe.m98261i().m98263e(bLiveEffect.f44359id);
        return true;
    }

    @Override // p149l.AbstractC18387m4
    /* JADX INFO: renamed from: f */
    public boolean mo107445f(String str, boolean z, h7e h7eVar, bwc0 bwc0Var) {
        BLiveEffect bLiveEffectM152981c = m152981c(str);
        if (bLiveEffectM152981c == null) {
            return false;
        }
        if (this.f131211a.mo179248i(bLiveEffectM152981c.f44359id, bLiveEffectM152981c.hdType, bLiveEffectM152981c.zip)) {
            aqe.m98261i().m98263e(str);
            return true;
        }
        if (z) {
            this.f131211a.m217251f(bLiveEffectM152981c.f44359id, bLiveEffectM152981c.hdType, bLiveEffectM152981c.zip, bLiveEffectM152981c.md5, Priority.get("IMMEDIATE"), h7eVar, bwc0Var);
        }
        return false;
    }
}
