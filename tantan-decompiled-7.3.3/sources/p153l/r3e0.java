package p153l;

import android.content.Intent;
import android.net.Uri;
import androidx.annotation.Nullable;
import java.util.Map;

/* JADX INFO: loaded from: classes9.dex */
public class r3e0 extends o5e0 {
    @Override // p153l.o5e0
    @Nullable
    /* JADX INFO: renamed from: c */
    public Intent mo95799c(abe0 abe0Var, z20<String, String> z20Var) {
        return new Intent("android.intent.action.VIEW", Uri.parse(m179603e(abe0Var)));
    }

    /* JADX INFO: renamed from: e */
    public final String m179603e(abe0 abe0Var) {
        Map<String, String> mapM96743f = abe0Var.m96743f();
        return mapM96743f.containsKey("url") ? mapM96743f.get("url") : "";
    }
}
