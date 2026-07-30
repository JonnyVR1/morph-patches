package androidx.viewpager2.widget;

import android.view.View;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.LinearLayoutManager;
import java.util.Locale;
import p149l.qkq0;

/* JADX INFO: renamed from: androidx.viewpager2.widget.d */
/* JADX INFO: loaded from: classes.dex */
public final class C0748d extends ViewPager2.AbstractC0740i {

    /* JADX INFO: renamed from: a */
    public final LinearLayoutManager f3370a;

    /* JADX INFO: renamed from: b */
    public ViewPager2.InterfaceC0742k f3371b;

    public C0748d(LinearLayoutManager linearLayoutManager) {
        this.f3370a = linearLayoutManager;
    }

    /* JADX INFO: renamed from: a */
    public ViewPager2.InterfaceC0742k m4291a() {
        return this.f3371b;
    }

    /* JADX INFO: renamed from: b */
    public void m4292b(@Nullable ViewPager2.InterfaceC0742k interfaceC0742k) {
        this.f3371b = interfaceC0742k;
    }

    @Override // androidx.viewpager2.widget.ViewPager2.AbstractC0740i
    public void onPageScrollStateChanged(int i) {
    }

    @Override // androidx.viewpager2.widget.ViewPager2.AbstractC0740i
    public void onPageScrolled(int i, float f, int i2) {
        if (this.f3371b == null) {
            return;
        }
        float f2 = -f;
        for (int i3 = 0; i3 < this.f3370a.getChildCount(); i3++) {
            View childAt = this.f3370a.getChildAt(i3);
            if (childAt == null) {
                qkq0.m175383a(String.format(Locale.US, "LayoutManager returned a null child at pos %d/%d while transforming pages", Integer.valueOf(i3), Integer.valueOf(this.f3370a.getChildCount())));
                return;
            }
            this.f3371b.mo4285a(childAt, (this.f3370a.getPosition(childAt) - i) + f2);
        }
    }

    @Override // androidx.viewpager2.widget.ViewPager2.AbstractC0740i
    public void onPageSelected(int i) {
    }
}
