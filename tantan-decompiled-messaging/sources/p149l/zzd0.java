package p149l;

import android.content.Intent;
import androidx.annotation.Nullable;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.data.NavigationIntent;
import com.p046p1.mobile.putong.data.tenum.TEnum;

/* JADX INFO: loaded from: classes9.dex */
public class zzd0 extends kxd0 {
    @Override // p149l.kxd0
    @Nullable
    /* JADX INFO: renamed from: c */
    public Intent mo94422c(w2e0 w2e0Var, f30<String, String> f30Var) {
        if (TEnum.equals(CoreModule.f17545c.f19639e0.m169527p9().source, "facebook")) {
            return null;
        }
        return lva.m151855k(w2e0Var.m201094b(), NavigationIntent.get(NavigationIntent.secret_crush));
    }
}
