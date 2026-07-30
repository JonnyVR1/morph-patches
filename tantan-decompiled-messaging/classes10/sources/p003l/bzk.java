package p003l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p000p1.mobile.putong.core.p001ui.helpcenter.HelpCenterFrag;
import l.f6c0;
import v.VFrame;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class bzk {
    /* JADX INFO: renamed from: a */
    public static void m5830a(HelpCenterFrag helpCenterFrag, View view) {
        helpCenterFrag.f1977F = (VFrame) view;
        helpCenterFrag.f1978G = ((ViewGroup) view).getChildAt(0);
    }

    /* JADX INFO: renamed from: b */
    public static View m5831b(HelpCenterFrag helpCenterFrag, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(f6c0.pd, viewGroup, false);
        m5830a(helpCenterFrag, viewInflate);
        return viewInflate;
    }

    /* JADX INFO: renamed from: c */
    public static void m5832c(HelpCenterFrag helpCenterFrag) {
        helpCenterFrag.f1977F = null;
        helpCenterFrag.f1978G = null;
    }
}
