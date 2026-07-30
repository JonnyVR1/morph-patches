package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import p151v.VList;

/* JADX INFO: loaded from: classes13.dex */
public class d110 {
    /* JADX INFO: renamed from: a */
    public static void m113475a(c110 c110Var, View view) {
        c110Var.f79314a = (FrameLayout) view;
        ViewGroup viewGroup = (ViewGroup) view;
        c110Var.f79315b = (VList) viewGroup.getChildAt(0);
        c110Var.f79316c = (FloatingActionButton) viewGroup.getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m113476b(c110 c110Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(tec0.f173801z4, viewGroup, false);
        m113475a(c110Var, viewInflate);
        return viewInflate;
    }
}
