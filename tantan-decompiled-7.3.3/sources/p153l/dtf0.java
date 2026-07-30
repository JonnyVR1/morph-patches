package p153l;

import android.content.Context;
import android.text.TextUtils;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.R$string;
import com.p051p1.mobile.putong.p054ab.IntlCountryCodeController;
import com.p051p1.mobile.putong.p070ui.webview.p073mk.AccessTokenMkWebViewAct;

/* JADX INFO: loaded from: classes12.dex */
public class dtf0 {

    /* JADX INFO: renamed from: a */
    public Act f90567a;

    public dtf0(Context context) {
        this.f90567a = (Act) context;
    }

    /* JADX INFO: renamed from: a */
    public void m117853a() {
        if (TextUtils.isEmpty(d79.m114645D())) {
            return;
        }
        Act act = this.f90567a;
        act.startActivity(AccessTokenMkWebViewAct.m81363q2(act, act.getString(R$string.f19780wo), d79.m114645D(), true, !IntlCountryCodeController.m29125v(), false));
    }
}
