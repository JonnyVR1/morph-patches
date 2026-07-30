package p153l;

import com.p051p1.mobile.putong.live.base.data.BLiveEffect;
import com.p051p1.mobile.putong.live.base.data.Priority;
import java.io.File;

/* JADX INFO: loaded from: classes5.dex */
public class xuf extends AbstractC18340l4 {
    @Override // p153l.AbstractC18340l4
    /* JADX INFO: renamed from: b */
    public String mo144686b(BLiveEffect bLiveEffect) {
        return bLiveEffect == null ? "" : this.f129922a.m204921p(bLiveEffect.f45207id, bLiveEffect.hdType, bLiveEffect.zip);
    }

    @Override // p153l.AbstractC18340l4
    /* JADX INFO: renamed from: d */
    public boolean mo144687d(BLiveEffect bLiveEffect) {
        if (bLiveEffect == null || !this.f129922a.mo204914i(bLiveEffect.f45207id, bLiveEffect.hdType, bLiveEffect.zip) || !m213132h(bLiveEffect)) {
            return false;
        }
        ere.m122146i().m122148e(bLiveEffect.f45207id);
        return true;
    }

    @Override // p153l.AbstractC18340l4
    /* JADX INFO: renamed from: f */
    public boolean mo144688f(String str, boolean z, w8e w8eVar, e4d0 e4d0Var) {
        BLiveEffect bLiveEffectM152743c = m152743c(str);
        if (bLiveEffectM152743c == null) {
            return false;
        }
        if (this.f129922a.mo204914i(bLiveEffectM152743c.f45207id, bLiveEffectM152743c.hdType, bLiveEffectM152743c.zip) && m213132h(bLiveEffectM152743c)) {
            ere.m122146i().m122148e(str);
            return true;
        }
        if (z) {
            this.f129922a.m204911f(bLiveEffectM152743c.f45207id, bLiveEffectM152743c.hdType, bLiveEffectM152743c.zip, bLiveEffectM152743c.md5, Priority.get("IMMEDIATE"), w8eVar, e4d0Var);
        }
        return false;
    }

    /* JADX INFO: renamed from: h */
    public final boolean m213132h(BLiveEffect bLiveEffect) {
        return new File(this.f129922a.m204921p(bLiveEffect.f45207id, bLiveEffect.hdType, bLiveEffect.zip) + "/params.txt").exists();
    }
}
