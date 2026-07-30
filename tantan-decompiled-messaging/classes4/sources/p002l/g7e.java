package p002l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class g7e {
    /* JADX INFO: renamed from: a */
    public static void m13648a(f7e f7eVar, View view) {
        f7eVar.f10165a = (ConstraintLayout) view;
        ViewGroup viewGroup = (ViewGroup) view;
        f7eVar.f10166b = viewGroup.getChildAt(0);
        f7eVar.f10167c = viewGroup.getChildAt(1);
        f7eVar.f10168d = viewGroup.getChildAt(2);
    }

    /* JADX INFO: renamed from: b */
    public static View m13649b(f7e f7eVar, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(t6c0.f20080y0, viewGroup, false);
        m13648a(f7eVar, viewInflate);
        return viewInflate;
    }
}
