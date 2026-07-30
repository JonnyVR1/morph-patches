package p002l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class vzr {
    /* JADX INFO: renamed from: a */
    public static void m24235a(uzr uzrVar, View view) {
        uzrVar.f20891k = (ConstraintLayout) view;
        ViewGroup viewGroup = (ViewGroup) view;
        uzrVar.f20892l = viewGroup.getChildAt(0);
        uzrVar.f20893m = viewGroup.getChildAt(1);
        uzrVar.f20894n = viewGroup.getChildAt(2);
        uzrVar.f20895o = viewGroup.getChildAt(3);
        uzrVar.f20896p = viewGroup.getChildAt(4);
        uzrVar.f20897q = (TextView) viewGroup.getChildAt(5);
        uzrVar.f20898r = viewGroup.getChildAt(6);
        uzrVar.f20899s = viewGroup.getChildAt(7);
        uzrVar.f20900t = (TextView) viewGroup.getChildAt(8);
    }

    /* JADX INFO: renamed from: b */
    public static View m24236b(uzr uzrVar, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(t6c0.f19503E, viewGroup, false);
        m24235a(uzrVar, viewInflate);
        return viewInflate;
    }
}
