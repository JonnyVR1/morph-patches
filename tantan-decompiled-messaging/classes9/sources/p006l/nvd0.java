package p006l;

import android.content.Intent;
import android.net.Uri;
import androidx.annotation.Nullable;
import java.util.Map;
import l.f30;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class nvd0 extends kxd0 {
    @Override // p006l.kxd0
    @Nullable
    /* JADX INFO: renamed from: c */
    public Intent mo11682c(w2e0 w2e0Var, f30<String, String> f30Var) {
        return new Intent("android.intent.action.VIEW", Uri.parse(m20223e(w2e0Var)));
    }

    /* JADX INFO: renamed from: e */
    public final String m20223e(w2e0 w2e0Var) {
        Map<String, String> mapM26160f = w2e0Var.m26160f();
        return mapM26160f.containsKey("url") ? mapM26160f.get("url") : "";
    }
}
