package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.hellogroup.p036mk.business.base.p037ui.MKWebView;
import p151v.VLinear;
import p151v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class b5j0 {
    /* JADX INFO: renamed from: a */
    public static void m102616a(a5j0 a5j0Var, View view) {
        a5j0Var.f68614a = (VLinear) view;
        ViewGroup viewGroup = (ViewGroup) view;
        a5j0Var.f68615b = (RelativeLayout) viewGroup.getChildAt(0);
        a5j0Var.f68616c = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        a5j0Var.f68617d = (MKWebView) viewGroup.getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m102617b(a5j0 a5j0Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(kec0.f125525Mc, viewGroup, false);
        m102616a(a5j0Var, viewInflate);
        return viewInflate;
    }
}
