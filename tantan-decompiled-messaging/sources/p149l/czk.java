package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.core.p053ui.helpcenter.HelpCenterFrag;
import p147v.VLinear;
import p147v.VText;
import p147v.navigationbar.VNavigationBar;

/* JADX INFO: loaded from: classes10.dex */
public class czk {
    /* JADX INFO: renamed from: a */
    public static void m109422a(HelpCenterFrag helpCenterFrag, View view) {
        helpCenterFrag.f29588z = (VLinear) view;
        ViewGroup viewGroup = (ViewGroup) view;
        helpCenterFrag.f29578A = (VNavigationBar) viewGroup.getChildAt(0);
        helpCenterFrag.f29579B = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        helpCenterFrag.f29580C = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2);
        helpCenterFrag.f29581D = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(3);
        helpCenterFrag.f29582E = (VText) viewGroup.getChildAt(2);
    }

    /* JADX INFO: renamed from: b */
    public static View m109423b(HelpCenterFrag helpCenterFrag, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(f6c0.f95967qd, viewGroup, false);
        m109422a(helpCenterFrag, viewInflate);
        return viewInflate;
    }
}
