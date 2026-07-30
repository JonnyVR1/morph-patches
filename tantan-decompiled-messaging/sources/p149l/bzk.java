package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.core.p053ui.helpcenter.HelpCenterFrag;
import p147v.VFrame;
import p147v.VList;

/* JADX INFO: loaded from: classes10.dex */
public class bzk {
    /* JADX INFO: renamed from: a */
    public static void m104621a(HelpCenterFrag helpCenterFrag, View view) {
        helpCenterFrag.f29583F = (VFrame) view;
        helpCenterFrag.f29584G = (VList) ((ViewGroup) view).getChildAt(0);
    }

    /* JADX INFO: renamed from: b */
    public static View m104622b(HelpCenterFrag helpCenterFrag, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(f6c0.f95950pd, viewGroup, false);
        m104621a(helpCenterFrag, viewInflate);
        return viewInflate;
    }

    /* JADX INFO: renamed from: c */
    public static void m104623c(HelpCenterFrag helpCenterFrag) {
        helpCenterFrag.f29583F = null;
        helpCenterFrag.f29584G = null;
    }
}
