package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import immomo.com.mklibrary.core.base.p115ui.MKWebView;

/* JADX INFO: loaded from: classes4.dex */
public class ve4 {
    /* JADX INFO: renamed from: a */
    public static void m198154a(ue4 ue4Var, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        ue4Var.f175997a = (MKWebView) viewGroup.getChildAt(0);
        ue4Var.f175998b = viewGroup.getChildAt(1);
        ue4Var.f175999c = (ImageView) viewGroup.getChildAt(2);
    }

    /* JADX INFO: renamed from: b */
    public static View m198155b(ue4 ue4Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(t6c0.f167978B6, viewGroup, false);
        m198154a(ue4Var, viewInflate);
        return viewInflate;
    }
}
