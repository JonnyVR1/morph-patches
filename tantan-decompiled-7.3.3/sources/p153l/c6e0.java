package p153l;

import android.content.Intent;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.p051p1.mobile.putong.core.data.KnowMyselfShareParams;
import com.p051p1.mobile.putong.core.newui.profile.understandme.BusinessWebViewAct;

/* JADX INFO: loaded from: classes9.dex */
public class c6e0 extends o5e0 {
    @Override // p153l.o5e0
    /* JADX INFO: renamed from: a */
    public void mo95798a(abe0 abe0Var, z20<String, String> z20Var) {
        String str = abe0Var.m96743f().get("url");
        String str2 = abe0Var.m96743f().get("title");
        String str3 = abe0Var.m96743f().get(KnowMyselfShareParams.PARAMS_TPID);
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str3) || !TextUtils.isDigitsOnly(str3)) {
            return;
        }
        abe0Var.m96739b().startActivity(BusinessWebViewAct.m44718Y1(abe0Var.m96739b(), str2, Long.parseLong(str3), str, "webview_load_type_knowme"));
    }

    @Override // p153l.o5e0
    @Nullable
    /* JADX INFO: renamed from: c */
    public Intent mo95799c(abe0 abe0Var, z20<String, String> z20Var) {
        return null;
    }
}
