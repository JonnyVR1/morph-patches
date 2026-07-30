package p003l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p000p1.mobile.putong.core.p001ui.helpcenter.HelpCenterFrag;
import l.f6c0;
import v.VLinear;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class czk {
    /* JADX INFO: renamed from: a */
    public static void m6026a(HelpCenterFrag helpCenterFrag, View view) {
        helpCenterFrag.f1982z = (VLinear) view;
        ViewGroup viewGroup = (ViewGroup) view;
        helpCenterFrag.f1972A = viewGroup.getChildAt(0);
        helpCenterFrag.f1973B = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        helpCenterFrag.f1974C = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2);
        helpCenterFrag.f1975D = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(3);
        helpCenterFrag.f1976E = viewGroup.getChildAt(2);
    }

    /* JADX INFO: renamed from: b */
    public static View m6027b(HelpCenterFrag helpCenterFrag, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(f6c0.qd, viewGroup, false);
        m6026a(helpCenterFrag, viewInflate);
        return viewInflate;
    }
}
