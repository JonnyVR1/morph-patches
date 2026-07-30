package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.core.p058ui.helpcenter.HelpCenterFrag;
import p151v.VLinear;
import p151v.VText;
import p151v.navigationbar.VNavigationBar;

/* JADX INFO: loaded from: classes10.dex */
public class s1l {
    /* JADX INFO: renamed from: a */
    public static void m184053a(HelpCenterFrag helpCenterFrag, View view) {
        helpCenterFrag.f30436z = (VLinear) view;
        ViewGroup viewGroup = (ViewGroup) view;
        helpCenterFrag.f30426A = (VNavigationBar) viewGroup.getChildAt(0);
        helpCenterFrag.f30427B = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        helpCenterFrag.f30428C = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2);
        helpCenterFrag.f30429D = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(3);
        helpCenterFrag.f30430E = (VText) viewGroup.getChildAt(2);
    }

    /* JADX INFO: renamed from: b */
    public static View m184054b(HelpCenterFrag helpCenterFrag, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(kec0.f126140xd, viewGroup, false);
        m184053a(helpCenterFrag, viewInflate);
        return viewInflate;
    }
}
