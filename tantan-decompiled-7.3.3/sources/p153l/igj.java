package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.core.p058ui.account.GPBindVerifyCodeInputAct;
import com.p051p1.mobile.putong.core.p058ui.account.view.VerifyCodeView;
import p151v.VButton_FakeShadow;
import p151v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class igj {
    /* JADX INFO: renamed from: a */
    public static void m139927a(GPBindVerifyCodeInputAct gPBindVerifyCodeInputAct, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        gPBindVerifyCodeInputAct.f29077c = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(1);
        gPBindVerifyCodeInputAct.f29078d = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(2);
        gPBindVerifyCodeInputAct.f29079e = (VerifyCodeView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(3);
        gPBindVerifyCodeInputAct.f29080f = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(4)).getChildAt(0);
        gPBindVerifyCodeInputAct.f29081g = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(4)).getChildAt(1);
        gPBindVerifyCodeInputAct.f29082h = (VButton_FakeShadow) viewGroup.getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m139928b(GPBindVerifyCodeInputAct gPBindVerifyCodeInputAct, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(sec0.f167560d, viewGroup, false);
        m139927a(gPBindVerifyCodeInputAct, viewInflate);
        return viewInflate;
    }
}
