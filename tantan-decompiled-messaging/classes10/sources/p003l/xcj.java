package p003l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.p1.mobile.putong.core.ui.account.GPBindPhoneNumberInputAct;
import l.n6c0;
import v.VLinear;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class xcj {
    /* JADX INFO: renamed from: a */
    public static void m10784a(GPBindPhoneNumberInputAct gPBindPhoneNumberInputAct, View view) {
        gPBindPhoneNumberInputAct.c = (VLinear) view;
        ViewGroup viewGroup = (ViewGroup) view;
        gPBindPhoneNumberInputAct.d = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(2);
        gPBindPhoneNumberInputAct.e = (LinearLayout) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(3);
        gPBindPhoneNumberInputAct.f = ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(3)).getChildAt(0);
        gPBindPhoneNumberInputAct.g = ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(3)).getChildAt(1);
        gPBindPhoneNumberInputAct.h = viewGroup.getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m10785b(GPBindPhoneNumberInputAct gPBindPhoneNumberInputAct, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(n6c0.c, viewGroup, false);
        m10784a(gPBindPhoneNumberInputAct, viewInflate);
        return viewInflate;
    }
}
