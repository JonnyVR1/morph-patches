package p006l;

import android.content.Intent;
import androidx.annotation.Nullable;
import com.p000p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.data.NavigationIntent;
import com.p1.mobile.putong.data.tenum.TEnum;
import l.f30;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class zzd0 extends kxd0 {
    @Override // p006l.kxd0
    @Nullable
    /* JADX INFO: renamed from: c */
    public Intent mo11682c(w2e0 w2e0Var, f30<String, String> f30Var) {
        if (TEnum.equals(CoreModule.f1534c.f3628e0.m21490p9().source, "facebook")) {
            return null;
        }
        return lva.m19032k(w2e0Var.m26156b(), NavigationIntent.get("secret crush"));
    }
}
