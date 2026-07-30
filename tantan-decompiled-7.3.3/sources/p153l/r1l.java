package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.core.p058ui.helpcenter.HelpCenterFrag;
import p151v.VFrame;
import p151v.VList;

/* JADX INFO: loaded from: classes10.dex */
public class r1l {
    /* JADX INFO: renamed from: a */
    public static void m179423a(HelpCenterFrag helpCenterFrag, View view) {
        helpCenterFrag.f30431F = (VFrame) view;
        helpCenterFrag.f30432G = (VList) ((ViewGroup) view).getChildAt(0);
    }

    /* JADX INFO: renamed from: b */
    public static View m179424b(HelpCenterFrag helpCenterFrag, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(kec0.f126123wd, viewGroup, false);
        m179423a(helpCenterFrag, viewInflate);
        return viewInflate;
    }

    /* JADX INFO: renamed from: c */
    public static void m179425c(HelpCenterFrag helpCenterFrag) {
        helpCenterFrag.f30431F = null;
        helpCenterFrag.f30432G = null;
    }
}
