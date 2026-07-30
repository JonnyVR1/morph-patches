package p149l;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.p046p1.mobile.putong.core.data.Active;
import com.p046p1.mobile.putong.core.p053ui.quickaudio.DropDownAct;
import java.util.Map;

/* JADX INFO: loaded from: classes9.dex */
public class kzd0 extends kxd0 {
    @Override // p149l.kxd0
    @Nullable
    /* JADX INFO: renamed from: c */
    public Intent mo94422c(w2e0 w2e0Var, f30<String, String> f30Var) {
        Map<String, String> mapM201098f = w2e0Var.m201098f();
        String str = mapM201098f.get(Active.TYPE);
        String str2 = mapM201098f.get("from");
        Context contextM201094b = w2e0Var.m201094b();
        if (TextUtils.isEmpty(str2)) {
            str2 = "push_quickchat";
        }
        return DropDownAct.m54447a2(contextM201094b, str, str2);
    }
}
