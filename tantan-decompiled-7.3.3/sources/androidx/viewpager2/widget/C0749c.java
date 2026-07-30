package androidx.viewpager2.widget;

import android.view.View;
import android.view.ViewParent;
import androidx.annotation.NonNull;
import androidx.annotation.Px;
import androidx.recyclerview.widget.RecyclerView;
import p153l.wtq0;
import p153l.yn80;

/* JADX INFO: renamed from: androidx.viewpager2.widget.c */
/* JADX INFO: loaded from: classes.dex */
public final class C0749c implements ViewPager2.InterfaceC0744k {

    /* JADX INFO: renamed from: a */
    public final int f3369a;

    public C0749c(@Px int i) {
        yn80.m216774d(i, "Margin must be non-negative");
        this.f3369a = i;
    }

    @Override // androidx.viewpager2.widget.ViewPager2.InterfaceC0744k
    /* JADX INFO: renamed from: a */
    public void mo4287a(@NonNull View view, float f) {
        ViewPager2 viewPager2M4292b = m4292b(view);
        float f2 = this.f3369a * f;
        if (viewPager2M4292b.getOrientation() != 0) {
            view.setTranslationY(f2);
            return;
        }
        if (viewPager2M4292b.m4246d()) {
            f2 = -f2;
        }
        view.setTranslationX(f2);
    }

    /* JADX INFO: renamed from: b */
    public final ViewPager2 m4292b(@NonNull View view) {
        ViewParent parent = view.getParent();
        ViewParent parent2 = parent.getParent();
        if ((parent instanceof RecyclerView) && (parent2 instanceof ViewPager2)) {
            return (ViewPager2) parent2;
        }
        wtq0.m207906a("Expected the page view to be managed by a ViewPager2 instance.");
        return null;
    }
}
