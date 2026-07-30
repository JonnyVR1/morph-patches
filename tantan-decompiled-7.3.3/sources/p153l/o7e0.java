package p153l;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.p051p1.mobile.putong.core.data.Active;
import com.p051p1.mobile.putong.core.p058ui.quickaudio.DropDownAct;
import java.util.Map;

/* JADX INFO: loaded from: classes9.dex */
public class o7e0 extends o5e0 {
    @Override // p153l.o5e0
    @Nullable
    /* JADX INFO: renamed from: c */
    public Intent mo95799c(abe0 abe0Var, z20<String, String> z20Var) {
        Map<String, String> mapM96743f = abe0Var.m96743f();
        String str = mapM96743f.get(Active.TYPE);
        String str2 = mapM96743f.get("from");
        Context contextM96739b = abe0Var.m96739b();
        if (TextUtils.isEmpty(str2)) {
            str2 = "push_quickchat";
        }
        return DropDownAct.m55630b2(contextM96739b, str, str2);
    }
}
