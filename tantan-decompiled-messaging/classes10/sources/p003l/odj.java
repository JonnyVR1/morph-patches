package p003l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p1.mobile.putong.core.ui.account.GPBindVerifyCodeInputAct;
import l.n6c0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class odj {
    /* JADX INFO: renamed from: a */
    public static void m8441a(GPBindVerifyCodeInputAct gPBindVerifyCodeInputAct, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        gPBindVerifyCodeInputAct.c = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(1);
        gPBindVerifyCodeInputAct.d = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(2);
        gPBindVerifyCodeInputAct.e = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(3);
        gPBindVerifyCodeInputAct.f = ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(4)).getChildAt(0);
        gPBindVerifyCodeInputAct.g = ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(4)).getChildAt(1);
        gPBindVerifyCodeInputAct.h = viewGroup.getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m8442b(GPBindVerifyCodeInputAct gPBindVerifyCodeInputAct, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(n6c0.d, viewGroup, false);
        m8441a(gPBindVerifyCodeInputAct, viewInflate);
        return viewInflate;
    }
}
