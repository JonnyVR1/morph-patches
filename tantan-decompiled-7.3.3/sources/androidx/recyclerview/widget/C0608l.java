package androidx.recyclerview.widget;

import android.graphics.Canvas;
import android.view.View;
import androidx.annotation.NonNull;
import p153l.ecc0;
import p153l.jjq;
import p153l.kkl0;

/* JADX INFO: renamed from: androidx.recyclerview.widget.l */
/* JADX INFO: loaded from: classes.dex */
public class C0608l implements jjq {
    static final jjq INSTANCE = new C0608l();

    /* JADX INFO: renamed from: e */
    public static float m3804e(RecyclerView recyclerView, View view) {
        int childCount = recyclerView.getChildCount();
        float f = 0.0f;
        for (int i = 0; i < childCount; i++) {
            View childAt = recyclerView.getChildAt(i);
            if (childAt != view) {
                float fM150183t = kkl0.m150183t(childAt);
                if (fM150183t > f) {
                    f = fM150183t;
                }
            }
        }
        return f;
    }

    @Override // p153l.jjq
    /* JADX INFO: renamed from: a */
    public void mo3805a(@NonNull View view) {
    }

    @Override // p153l.jjq
    /* JADX INFO: renamed from: b */
    public void mo3806b(@NonNull Canvas canvas, @NonNull RecyclerView recyclerView, @NonNull View view, float f, float f2, int i, boolean z) {
        if (z && view.getTag(ecc0.f93027a) == null) {
            Float fValueOf = Float.valueOf(kkl0.m150183t(view));
            kkl0.m150178q0(view, m3804e(recyclerView, view) + 1.0f);
            view.setTag(ecc0.f93027a, fValueOf);
        }
        view.setTranslationX(f);
        view.setTranslationY(f2);
    }

    @Override // p153l.jjq
    /* JADX INFO: renamed from: c */
    public void mo3807c(@NonNull View view) {
        Object tag = view.getTag(ecc0.f93027a);
        if (tag instanceof Float) {
            kkl0.m150178q0(view, ((Float) tag).floatValue());
        }
        view.setTag(ecc0.f93027a, null);
        view.setTranslationX(0.0f);
        view.setTranslationY(0.0f);
    }

    @Override // p153l.jjq
    /* JADX INFO: renamed from: d */
    public void mo3808d(@NonNull Canvas canvas, @NonNull RecyclerView recyclerView, @NonNull View view, float f, float f2, int i, boolean z) {
    }
}
