package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import p151v.VImage;

/* JADX INFO: loaded from: classes10.dex */
public class aqa0 {
    /* JADX INFO: renamed from: a */
    public static void m99441a(zpa0 zpa0Var, View view) {
        zpa0Var.f205440a = (FrameLayout) view;
        ViewGroup viewGroup = (ViewGroup) view;
        zpa0Var.f205441b = (VImage) viewGroup.getChildAt(0);
        zpa0Var.f205442c = (FrameLayout) viewGroup.getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m99442b(zpa0 zpa0Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(sec0.f167504C0, viewGroup, false);
        m99441a(zpa0Var, viewInflate);
        return viewInflate;
    }
}
