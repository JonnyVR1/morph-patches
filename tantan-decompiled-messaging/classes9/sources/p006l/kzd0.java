package p006l;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.p000p1.mobile.putong.core.p004ui.quickaudio.DropDownAct;
import java.util.Map;
import l.f30;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class kzd0 extends kxd0 {
    @Override // p006l.kxd0
    @Nullable
    /* JADX INFO: renamed from: c */
    public Intent mo11682c(w2e0 w2e0Var, f30<String, String> f30Var) {
        Map<String, String> mapM26160f = w2e0Var.m26160f();
        String str = mapM26160f.get("active");
        String str2 = mapM26160f.get("from");
        Context contextM26156b = w2e0Var.m26156b();
        if (TextUtils.isEmpty(str2)) {
            str2 = "push_quickchat";
        }
        return DropDownAct.m7782a2(contextM26156b, str, str2);
    }
}
