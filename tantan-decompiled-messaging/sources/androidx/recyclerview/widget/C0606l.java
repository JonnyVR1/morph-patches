package androidx.recyclerview.widget;

import android.graphics.Canvas;
import android.view.View;
import androidx.annotation.NonNull;
import p149l.gbl0;
import p149l.jhq;
import p149l.y3c0;

/* JADX INFO: renamed from: androidx.recyclerview.widget.l */
/* JADX INFO: loaded from: classes.dex */
public class C0606l implements jhq {
    static final jhq INSTANCE = new C0606l();

    /* JADX INFO: renamed from: e */
    public static float m3803e(RecyclerView recyclerView, View view) {
        int childCount = recyclerView.getChildCount();
        float f = 0.0f;
        for (int i = 0; i < childCount; i++) {
            View childAt = recyclerView.getChildAt(i);
            if (childAt != view) {
                float fM125220t = gbl0.m125220t(childAt);
                if (fM125220t > f) {
                    f = fM125220t;
                }
            }
        }
        return f;
    }

    @Override // p149l.jhq
    /* JADX INFO: renamed from: a */
    public void mo3804a(@NonNull View view) {
    }

    @Override // p149l.jhq
    /* JADX INFO: renamed from: b */
    public void mo3805b(@NonNull Canvas canvas, @NonNull RecyclerView recyclerView, @NonNull View view, float f, float f2, int i, boolean z) {
        if (z && view.getTag(y3c0.f195791a) == null) {
            Float fValueOf = Float.valueOf(gbl0.m125220t(view));
            gbl0.m125215q0(view, m3803e(recyclerView, view) + 1.0f);
            view.setTag(y3c0.f195791a, fValueOf);
        }
        view.setTranslationX(f);
        view.setTranslationY(f2);
    }

    @Override // p149l.jhq
    /* JADX INFO: renamed from: c */
    public void mo3806c(@NonNull View view) {
        Object tag = view.getTag(y3c0.f195791a);
        if (tag instanceof Float) {
            gbl0.m125215q0(view, ((Float) tag).floatValue());
        }
        view.setTag(y3c0.f195791a, null);
        view.setTranslationX(0.0f);
        view.setTranslationY(0.0f);
    }

    @Override // p149l.jhq
    /* JADX INFO: renamed from: d */
    public void mo3807d(@NonNull Canvas canvas, @NonNull RecyclerView recyclerView, @NonNull View view, float f, float f2, int i, boolean z) {
    }
}
