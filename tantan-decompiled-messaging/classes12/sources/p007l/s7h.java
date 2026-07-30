package p007l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class s7h {
    /* JADX INFO: renamed from: a */
    public static void m14033a(r7h r7hVar, View view) {
        r7hVar.f12503a = (ConstraintLayout) view;
        ViewGroup viewGroup = (ViewGroup) view;
        r7hVar.f12504b = viewGroup.getChildAt(0);
        r7hVar.f12505c = (FrameLayout) viewGroup.getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m14034b(r7h r7hVar, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(o6c0.f11094N0, viewGroup, false);
        m14033a(r7hVar, viewInflate);
        return viewInflate;
    }
}
