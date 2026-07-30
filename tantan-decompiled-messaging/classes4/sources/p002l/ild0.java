package p002l;

import android.text.TextUtils;
import com.p1.mobile.putong.live.base.data.BLiveEffect;
import com.p1.mobile.putong.live.base.data.Priority;
import java.io.File;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class ild0 extends AbstractC0675m4 {
    @Override // p002l.AbstractC0675m4
    /* JADX INFO: renamed from: b */
    public String mo11105b(BLiveEffect bLiveEffect) {
        if (bLiveEffect == null) {
            return "";
        }
        File fileM27090o = this.f15228a.m27090o(bLiveEffect.id, bLiveEffect.hdType, bLiveEffect.zip);
        if (fileM27090o.isDirectory()) {
            for (File file : fileM27090o.listFiles()) {
                if (file.getName().endsWith(".svga")) {
                    return file.getAbsolutePath();
                }
            }
        }
        return "";
    }

    @Override // p002l.AbstractC0675m4
    /* JADX INFO: renamed from: d */
    public boolean mo11106d(BLiveEffect bLiveEffect) {
        if (bLiveEffect == null || !this.f15228a.mo21928i(bLiveEffect.id, bLiveEffect.hdType, bLiveEffect.zip) || TextUtils.isEmpty(mo11105b(bLiveEffect))) {
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
        if (this.f15228a.mo21928i(bLiveEffectM17694c.id, bLiveEffectM17694c.hdType, bLiveEffectM17694c.zip) && !TextUtils.isEmpty(mo11105b(bLiveEffectM17694c))) {
            aqe.m10039i().m10041e(str);
            return true;
        }
        if (z) {
            this.f15228a.m27083f(bLiveEffectM17694c.id, bLiveEffectM17694c.hdType, bLiveEffectM17694c.zip, bLiveEffectM17694c.md5, Priority.get("IMMEDIATE"), h7eVar, bwc0Var);
        }
        return false;
    }
}
