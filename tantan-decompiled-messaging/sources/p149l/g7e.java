package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import p147v.VDraweeView;

/* JADX INFO: loaded from: classes4.dex */
public class g7e {
    /* JADX INFO: renamed from: a */
    public static void m124688a(f7e f7eVar, View view) {
        f7eVar.f96239a = (ConstraintLayout) view;
        ViewGroup viewGroup = (ViewGroup) view;
        f7eVar.f96240b = (VDraweeView) viewGroup.getChildAt(0);
        f7eVar.f96241c = (VDraweeView) viewGroup.getChildAt(1);
        f7eVar.f96242d = (VDraweeView) viewGroup.getChildAt(2);
    }

    /* JADX INFO: renamed from: b */
    public static View m124689b(f7e f7eVar, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(t6c0.f168584y0, viewGroup, false);
        m124688a(f7eVar, viewInflate);
        return viewInflate;
    }
}
