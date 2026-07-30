package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.hellogroup.p036mk.business.base.p037ui.MKWebView;

/* JADX INFO: loaded from: classes4.dex */
public class uf4 {
    /* JADX INFO: renamed from: a */
    public static void m195820a(tf4 tf4Var, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        tf4Var.f173918a = (MKWebView) viewGroup.getChildAt(0);
        tf4Var.f173919b = viewGroup.getChildAt(1);
        tf4Var.f173920c = (ImageView) viewGroup.getChildAt(2);
    }

    /* JADX INFO: renamed from: b */
    public static View m195821b(tf4 tf4Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(yec0.f198710B6, viewGroup, false);
        m195820a(tf4Var, viewInflate);
        return viewInflate;
    }
}
