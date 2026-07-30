package p153l;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.p051p1.mobile.putong.data.LiveRegionTag;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.p051p1.mobile.putong.live.base.webview.LiveWebViewAct;
import com.p051p1.mobile.putong.p070ui.webview.p073mk.MkWebViewAct;

/* JADX INFO: loaded from: classes9.dex */
public class ywk implements xwk {
    @Override // p153l.xwk
    /* JADX INFO: renamed from: a */
    public void mo213355a(Context context) {
        if (wft.m206159b(2) || TEnum.equals(uqb0.f180402h0, LiveRegionTag.oversea_chinese)) {
            m217615f(context, efv.f93847d);
        } else {
            m217615f(context, efv.f93828G);
        }
    }

    @Override // p153l.xwk
    /* JADX INFO: renamed from: b */
    public void mo213356b(Context context) {
        m217615f(context, efv.f93848e);
    }

    @Override // p153l.xwk
    /* JADX INFO: renamed from: c */
    public void mo213357c(Context context) {
        m217615f(context, efv.f93822A);
    }

    @Override // p153l.xwk
    /* JADX INFO: renamed from: d */
    public void mo213358d(Context context) {
        m217615f(context, efv.m120731i(mqr.m159587g() || mqr.m159586f()));
    }

    @Override // p153l.xwk
    /* JADX INFO: renamed from: e */
    public void mo213359e(Context context, String str) {
        m217615f(context, str);
    }

    /* JADX INFO: renamed from: f */
    public final void m217615f(Context context, String str) {
        Context context2;
        Intent intentM70066d2;
        if (TextUtils.isEmpty(wkw.m206867c(str))) {
            context2 = context;
            intentM70066d2 = LiveWebViewAct.m70066d2(context2, str);
        } else {
            context2 = context;
            intentM70066d2 = MkWebViewAct.m81423g2(context2, "", str, true, true, true, true, null);
        }
        context2.startActivity(intentM70066d2);
    }
}
