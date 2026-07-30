package p153l;

import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.live.base.view.DialogTitleBar;
import com.p051p1.mobile.putong.live.base.webview.LiveMkWebView;
import com.p051p1.mobile.putong.live.livingroom.common.signin.rule.SignInRuleFrame;

/* JADX INFO: loaded from: classes4.dex */
public class xcf0 {
    /* JADX INFO: renamed from: a */
    public static void m210147a(SignInRuleFrame signInRuleFrame, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        signInRuleFrame.f50229a = (DialogTitleBar) viewGroup.getChildAt(0);
        signInRuleFrame.f50230b = (LiveMkWebView) viewGroup.getChildAt(1);
    }
}
