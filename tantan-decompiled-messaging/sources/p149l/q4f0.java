package p149l;

import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.live.base.view.DialogTitleBar;
import com.p046p1.mobile.putong.live.base.webview.LiveMkWebView;
import com.p046p1.mobile.putong.live.livingroom.common.signin.rule.SignInRuleFrame;

/* JADX INFO: loaded from: classes4.dex */
public class q4f0 {
    /* JADX INFO: renamed from: a */
    public static void m172933a(SignInRuleFrame signInRuleFrame, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        signInRuleFrame.f49381a = (DialogTitleBar) viewGroup.getChildAt(0);
        signInRuleFrame.f49382b = (LiveMkWebView) viewGroup.getChildAt(1);
    }
}
