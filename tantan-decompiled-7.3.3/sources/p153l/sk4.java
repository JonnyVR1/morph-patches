package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;

/* JADX INFO: loaded from: classes10.dex */
public class sk4 {
    /* JADX INFO: renamed from: a */
    public static void m186400a(rk4 rk4Var, View view) {
        rk4Var.f163540a = (FrameLayout) view;
        rk4Var.f163541b = (TextView) ((ViewGroup) view).getChildAt(0);
    }

    /* JADX INFO: renamed from: b */
    public static View m186401b(rk4 rk4Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(nec0.f141637v, viewGroup, false);
        m186400a(rk4Var, viewInflate);
        return viewInflate;
    }
}
