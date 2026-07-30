package androidx.viewpager2.widget;

import android.view.View;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.LinearLayoutManager;
import java.util.Locale;
import p153l.wtq0;

/* JADX INFO: renamed from: androidx.viewpager2.widget.d */
/* JADX INFO: loaded from: classes.dex */
public final class C0750d extends ViewPager2.AbstractC0742i {

    /* JADX INFO: renamed from: a */
    public final LinearLayoutManager f3370a;

    /* JADX INFO: renamed from: b */
    public ViewPager2.InterfaceC0744k f3371b;

    public C0750d(LinearLayoutManager linearLayoutManager) {
        this.f3370a = linearLayoutManager;
    }

    /* JADX INFO: renamed from: a */
    public ViewPager2.InterfaceC0744k m4293a() {
        return this.f3371b;
    }

    /* JADX INFO: renamed from: b */
    public void m4294b(@Nullable ViewPager2.InterfaceC0744k interfaceC0744k) {
        this.f3371b = interfaceC0744k;
    }

    @Override // androidx.viewpager2.widget.ViewPager2.AbstractC0742i
    public void onPageScrollStateChanged(int i) {
    }

    @Override // androidx.viewpager2.widget.ViewPager2.AbstractC0742i
    public void onPageScrolled(int i, float f, int i2) {
        if (this.f3371b == null) {
            return;
        }
        float f2 = -f;
        for (int i3 = 0; i3 < this.f3370a.getChildCount(); i3++) {
            View childAt = this.f3370a.getChildAt(i3);
            if (childAt == null) {
                wtq0.m207906a(String.format(Locale.US, "LayoutManager returned a null child at pos %d/%d while transforming pages", Integer.valueOf(i3), Integer.valueOf(this.f3370a.getChildCount())));
                return;
            }
            this.f3371b.mo4287a(childAt, (this.f3370a.getPosition(childAt) - i) + f2);
        }
    }

    @Override // androidx.viewpager2.widget.ViewPager2.AbstractC0742i
    public void onPageSelected(int i) {
    }
}
