package p149l;

import android.content.Context;
import android.text.TextUtils;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.R$string;
import com.p046p1.mobile.putong.p049ab.IntlCountryCodeController;
import com.p046p1.mobile.putong.p065ui.webview.p068mk.AccessTokenMkWebViewAct;

/* JADX INFO: loaded from: classes10.dex */
public class ukf0 {

    /* JADX INFO: renamed from: a */
    public Act f176921a;

    public ukf0(Context context) {
        this.f176921a = (Act) context;
    }

    /* JADX INFO: renamed from: a */
    public void m194154a() {
        if (TextUtils.isEmpty(u59.m191794C())) {
            return;
        }
        Act act = this.f176921a;
        act.startActivity(AccessTokenMkWebViewAct.m80180p2(act, act.getString(R$string.f18340Zn), u59.m191794C(), true, !IntlCountryCodeController.m28126v(), false));
    }
}
