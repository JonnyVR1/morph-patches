package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import p147v.VFrame_Anim;
import p147v.VProgressBar;
import p147v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class vtw {
    /* JADX INFO: renamed from: a */
    public static void m200052a(ttw ttwVar, View view) {
        ttwVar.f172071c = (LinearLayout) view;
        ViewGroup viewGroup = (ViewGroup) view;
        ttwVar.f172072d = (VFrame_Anim) viewGroup.getChildAt(0);
        ttwVar.f172073e = (VProgressBar) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        ttwVar.f172074f = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m200053b(ttw ttwVar, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(f6c0.f95440Kd, viewGroup, false);
        m200052a(ttwVar, viewInflate);
        return viewInflate;
    }
}
