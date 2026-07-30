package p002l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import l.ue4;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class ve4 {
    /* JADX INFO: renamed from: a */
    public static void m23888a(ue4 ue4Var, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        ue4Var.a = viewGroup.getChildAt(0);
        ue4Var.b = viewGroup.getChildAt(1);
        ue4Var.c = (ImageView) viewGroup.getChildAt(2);
    }

    /* JADX INFO: renamed from: b */
    public static View m23889b(ue4 ue4Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(t6c0.f19474B6, viewGroup, false);
        m23888a(ue4Var, viewInflate);
        return viewInflate;
    }
}
