package p003l;

import android.content.Context;
import android.text.TextUtils;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.ab.IntlCountryCodeController;
import com.p1.mobile.putong.core.R;
import com.p1.mobile.putong.ui.webview.mk.AccessTokenMkWebViewAct;
import l.u59;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class ukf0 {

    /* JADX INFO: renamed from: a */
    public Act f7760a;

    public ukf0(Context context) {
        this.f7760a = (Act) context;
    }

    /* JADX INFO: renamed from: a */
    public void m9745a() {
        if (TextUtils.isEmpty(u59.C())) {
            return;
        }
        Act act = this.f7760a;
        act.startActivity(AccessTokenMkWebViewAct.p2(act, act.getString(R.string.Zn), u59.C(), true, !IntlCountryCodeController.v(), false));
    }
}
