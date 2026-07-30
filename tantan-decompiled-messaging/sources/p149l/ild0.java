package p149l;

import android.text.TextUtils;
import com.p046p1.mobile.putong.live.base.data.BLiveEffect;
import com.p046p1.mobile.putong.live.base.data.Priority;
import java.io.File;

/* JADX INFO: loaded from: classes4.dex */
public class ild0 extends AbstractC18387m4 {
    @Override // p149l.AbstractC18387m4
    /* JADX INFO: renamed from: b */
    public String mo107443b(BLiveEffect bLiveEffect) {
        if (bLiveEffect == null) {
            return "";
        }
        File fileM217258o = this.f131211a.m217258o(bLiveEffect.f44359id, bLiveEffect.hdType, bLiveEffect.zip);
        if (fileM217258o.isDirectory()) {
            for (File file : fileM217258o.listFiles()) {
                if (file.getName().endsWith(".svga")) {
                    return file.getAbsolutePath();
                }
            }
        }
        return "";
    }

    @Override // p149l.AbstractC18387m4
    /* JADX INFO: renamed from: d */
    public boolean mo107444d(BLiveEffect bLiveEffect) {
        if (bLiveEffect == null || !this.f131211a.mo179248i(bLiveEffect.f44359id, bLiveEffect.hdType, bLiveEffect.zip) || TextUtils.isEmpty(mo107443b(bLiveEffect))) {
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
        if (this.f131211a.mo179248i(bLiveEffectM152981c.f44359id, bLiveEffectM152981c.hdType, bLiveEffectM152981c.zip) && !TextUtils.isEmpty(mo107443b(bLiveEffectM152981c))) {
            aqe.m98261i().m98263e(str);
            return true;
        }
        if (z) {
            this.f131211a.m217251f(bLiveEffectM152981c.f44359id, bLiveEffectM152981c.hdType, bLiveEffectM152981c.zip, bLiveEffectM152981c.md5, Priority.get("IMMEDIATE"), h7eVar, bwc0Var);
        }
        return false;
    }
}
