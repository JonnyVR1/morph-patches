package p149l;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.p046p1.mobile.putong.data.LiveRegionTag;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.p046p1.mobile.putong.live.base.webview.LiveWebViewAct;
import com.p046p1.mobile.putong.p065ui.webview.p068mk.MkWebViewAct;

/* JADX INFO: loaded from: classes13.dex */
public class iuk implements huk {
    @Override // p149l.huk
    /* JADX INFO: renamed from: a */
    public void mo133115a(Context context) {
        if (vdt.m198092b(2) || TEnum.equals(qib0.f154719h0, LiveRegionTag.oversea_chinese)) {
            m138408f(context, ddv.f85654d);
        } else {
            m138408f(context, ddv.f85635G);
        }
    }

    @Override // p149l.huk
    /* JADX INFO: renamed from: b */
    public void mo133116b(Context context) {
        m138408f(context, ddv.f85655e);
    }

    @Override // p149l.huk
    /* JADX INFO: renamed from: c */
    public void mo133117c(Context context) {
        m138408f(context, ddv.f85629A);
    }

    @Override // p149l.huk
    /* JADX INFO: renamed from: d */
    public void mo133118d(Context context) {
        m138408f(context, ddv.m111076i(lor.m150802g() || lor.m150801f()));
    }

    @Override // p149l.huk
    /* JADX INFO: renamed from: e */
    public void mo133119e(Context context, String str) {
        m138408f(context, str);
    }

    /* JADX INFO: renamed from: f */
    public final void m138408f(Context context, String str) {
        Context context2;
        Intent intentM68883c2;
        if (TextUtils.isEmpty(zhw.m218869b(str))) {
            context2 = context;
            intentM68883c2 = LiveWebViewAct.m68883c2(context2, str);
        } else {
            context2 = context;
            intentM68883c2 = MkWebViewAct.m80240e2(context2, "", str, true, true, true, true, null);
        }
        context2.startActivity(intentM68883c2);
    }
}
