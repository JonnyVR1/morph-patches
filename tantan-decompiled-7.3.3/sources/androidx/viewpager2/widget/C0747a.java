package androidx.viewpager2.widget;

import androidx.annotation.NonNull;
import androidx.annotation.Px;
import java.util.ArrayList;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: androidx.viewpager2.widget.a */
/* JADX INFO: loaded from: classes.dex */
public final class C0747a extends ViewPager2.AbstractC0742i {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final List<ViewPager2.AbstractC0742i> f3367a;

    public C0747a(int i) {
        this.f3367a = new ArrayList(i);
    }

    /* JADX INFO: renamed from: a */
    public void m4288a(ViewPager2.AbstractC0742i abstractC0742i) {
        this.f3367a.add(abstractC0742i);
    }

    /* JADX INFO: renamed from: b */
    public void m4289b(ViewPager2.AbstractC0742i abstractC0742i) {
        this.f3367a.remove(abstractC0742i);
    }

    /* JADX INFO: renamed from: c */
    public final void m4290c(ConcurrentModificationException concurrentModificationException) {
        throw new IllegalStateException("Adding and removing callbacks during dispatch to callbacks is not supported", concurrentModificationException);
    }

    @Override // androidx.viewpager2.widget.ViewPager2.AbstractC0742i
    public void onPageScrollStateChanged(int i) {
        try {
            Iterator<ViewPager2.AbstractC0742i> it = this.f3367a.iterator();
            while (it.hasNext()) {
                it.next().onPageScrollStateChanged(i);
            }
        } catch (ConcurrentModificationException e) {
            m4290c(e);
        }
    }

    @Override // androidx.viewpager2.widget.ViewPager2.AbstractC0742i
    public void onPageScrolled(int i, float f, @Px int i2) {
        try {
            Iterator<ViewPager2.AbstractC0742i> it = this.f3367a.iterator();
            while (it.hasNext()) {
                it.next().onPageScrolled(i, f, i2);
            }
        } catch (ConcurrentModificationException e) {
            m4290c(e);
        }
    }

    @Override // androidx.viewpager2.widget.ViewPager2.AbstractC0742i
    public void onPageSelected(int i) {
        try {
            Iterator<ViewPager2.AbstractC0742i> it = this.f3367a.iterator();
            while (it.hasNext()) {
                it.next().onPageSelected(i);
            }
        } catch (ConcurrentModificationException e) {
            m4290c(e);
        }
    }
}
