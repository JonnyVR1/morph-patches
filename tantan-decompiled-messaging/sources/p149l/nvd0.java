package p149l;

import android.content.Intent;
import android.net.Uri;
import androidx.annotation.Nullable;
import java.util.Map;

/* JADX INFO: loaded from: classes9.dex */
public class nvd0 extends kxd0 {
    @Override // p149l.kxd0
    @Nullable
    /* JADX INFO: renamed from: c */
    public Intent mo94422c(w2e0 w2e0Var, f30<String, String> f30Var) {
        return new Intent("android.intent.action.VIEW", Uri.parse(m161592e(w2e0Var)));
    }

    /* JADX INFO: renamed from: e */
    public final String m161592e(w2e0 w2e0Var) {
        Map<String, String> mapM201098f = w2e0Var.m201098f();
        return mapM201098f.containsKey("url") ? mapM201098f.get("url") : "";
    }
}
