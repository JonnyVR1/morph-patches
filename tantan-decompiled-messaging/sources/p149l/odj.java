package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.core.p053ui.account.GPBindVerifyCodeInputAct;
import com.p046p1.mobile.putong.core.p053ui.account.view.VerifyCodeView;
import p147v.VButton_FakeShadow;
import p147v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class odj {
    /* JADX INFO: renamed from: a */
    public static void m163666a(GPBindVerifyCodeInputAct gPBindVerifyCodeInputAct, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        gPBindVerifyCodeInputAct.f28229c = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(1);
        gPBindVerifyCodeInputAct.f28230d = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(2);
        gPBindVerifyCodeInputAct.f28231e = (VerifyCodeView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(3);
        gPBindVerifyCodeInputAct.f28232f = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(4)).getChildAt(0);
        gPBindVerifyCodeInputAct.f28233g = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(4)).getChildAt(1);
        gPBindVerifyCodeInputAct.f28234h = (VButton_FakeShadow) viewGroup.getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m163667b(GPBindVerifyCodeInputAct gPBindVerifyCodeInputAct, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(n6c0.f137346d, viewGroup, false);
        m163666a(gPBindVerifyCodeInputAct, viewInflate);
        return viewInflate;
    }
}
