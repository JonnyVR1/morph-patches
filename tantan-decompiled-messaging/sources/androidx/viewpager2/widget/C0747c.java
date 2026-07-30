package androidx.viewpager2.widget;

import android.view.View;
import android.view.ViewParent;
import androidx.annotation.NonNull;
import androidx.annotation.Px;
import androidx.recyclerview.widget.RecyclerView;
import p149l.qkq0;
import p149l.tf80;

/* JADX INFO: renamed from: androidx.viewpager2.widget.c */
/* JADX INFO: loaded from: classes.dex */
public final class C0747c implements ViewPager2.InterfaceC0742k {

    /* JADX INFO: renamed from: a */
    public final int f3369a;

    public C0747c(@Px int i) {
        tf80.m188657d(i, "Margin must be non-negative");
        this.f3369a = i;
    }

    @Override // androidx.viewpager2.widget.ViewPager2.InterfaceC0742k
    /* JADX INFO: renamed from: a */
    public void mo4285a(@NonNull View view, float f) {
        ViewPager2 viewPager2M4290b = m4290b(view);
        float f2 = this.f3369a * f;
        if (viewPager2M4290b.getOrientation() != 0) {
            view.setTranslationY(f2);
            return;
        }
        if (viewPager2M4290b.m4244d()) {
            f2 = -f2;
        }
        view.setTranslationX(f2);
    }

    /* JADX INFO: renamed from: b */
    public final ViewPager2 m4290b(@NonNull View view) {
        ViewParent parent = view.getParent();
        ViewParent parent2 = parent.getParent();
        if ((parent instanceof RecyclerView) && (parent2 instanceof ViewPager2)) {
            return (ViewPager2) parent2;
        }
        qkq0.m175383a("Expected the page view to be managed by a ViewPager2 instance.");
        return null;
    }
}
