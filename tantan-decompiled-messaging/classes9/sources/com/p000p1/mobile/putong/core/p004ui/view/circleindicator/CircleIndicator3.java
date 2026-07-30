package com.p000p1.mobile.putong.core.p004ui.view.circleindicator;

import android.annotation.TargetApi;
import android.content.Context;
import android.util.AttributeSet;
import androidx.annotation.ColorInt;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import p006l.nu5;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class CircleIndicator3 extends BaseCircleIndicator {

    /* JADX INFO: renamed from: m */
    public ViewPager2 f6724m;

    /* JADX INFO: renamed from: n */
    public final ViewPager2.i f6725n;

    /* JADX INFO: renamed from: o */
    public final RecyclerView.i f6726o;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.view.circleindicator.CircleIndicator3$a */
    public class C0378a extends ViewPager2.i {
        public C0378a() {
        }

        public void onPageSelected(int i) {
            CircleIndicator3 circleIndicator3 = CircleIndicator3.this;
            if (i == circleIndicator3.f6712l || circleIndicator3.f6724m.getAdapter() == null || CircleIndicator3.this.f6724m.getAdapter().getItemCount() <= 0) {
                return;
            }
            CircleIndicator3.this.mo9632b(i);
        }
    }

    public CircleIndicator3(Context context) {
        super(context);
        this.f6725n = new C0378a();
        this.f6726o = new C0379b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n */
    public void m9652n() {
        RecyclerView.Adapter adapter = this.f6724m.getAdapter();
        mo9637g(adapter == null ? 0 : adapter.getItemCount(), this.f6724m.getCurrentItem());
    }

    @Override // com.p000p1.mobile.putong.core.p004ui.view.circleindicator.BaseCircleIndicator
    /* JADX INFO: renamed from: b */
    public /* bridge */ /* synthetic */ void mo9632b(int i) {
        super.mo9632b(i);
    }

    @Override // com.p000p1.mobile.putong.core.p004ui.view.circleindicator.BaseCircleIndicator
    /* JADX INFO: renamed from: g */
    public /* bridge */ /* synthetic */ void mo9637g(int i, int i2) {
        super.mo9637g(i, i2);
    }

    public RecyclerView.i getAdapterDataObserver() {
        return this.f6726o;
    }

    @Override // com.p000p1.mobile.putong.core.p004ui.view.circleindicator.BaseCircleIndicator
    /* JADX INFO: renamed from: j */
    public /* bridge */ /* synthetic */ void mo9640j(nu5 nu5Var) {
        super.mo9640j(nu5Var);
    }

    @Override // com.p000p1.mobile.putong.core.p004ui.view.circleindicator.BaseCircleIndicator
    /* JADX INFO: renamed from: k */
    public /* bridge */ /* synthetic */ void mo9641k(@ColorInt int i, @ColorInt int i2) {
        super.mo9641k(i, i2);
    }

    @Override // com.p000p1.mobile.putong.core.p004ui.view.circleindicator.BaseCircleIndicator
    public /* bridge */ /* synthetic */ void setIndicatorCreatedListener(@Nullable BaseCircleIndicator.InterfaceC0372a interfaceC0372a) {
        super.setIndicatorCreatedListener(interfaceC0372a);
    }

    public void setViewPager(@Nullable ViewPager2 viewPager2) {
        this.f6724m = viewPager2;
        if (viewPager2 == null || viewPager2.getAdapter() == null) {
            return;
        }
        this.f6712l = -1;
        m9652n();
        this.f6724m.n(this.f6725n);
        this.f6724m.g(this.f6725n);
        this.f6725n.onPageSelected(this.f6724m.getCurrentItem());
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.view.circleindicator.CircleIndicator3$b */
    public class C0379b extends RecyclerView.i {
        public C0379b() {
        }

        public void onChanged() {
            super.onChanged();
            if (CircleIndicator3.this.f6724m == null) {
                return;
            }
            RecyclerView.Adapter adapter = CircleIndicator3.this.f6724m.getAdapter();
            int itemCount = adapter != null ? adapter.getItemCount() : 0;
            if (itemCount == CircleIndicator3.this.getChildCount()) {
                return;
            }
            CircleIndicator3 circleIndicator3 = CircleIndicator3.this;
            if (circleIndicator3.f6712l < itemCount) {
                circleIndicator3.f6712l = circleIndicator3.f6724m.getCurrentItem();
            } else {
                circleIndicator3.f6712l = -1;
            }
            CircleIndicator3.this.m9652n();
        }

        public void onItemRangeChanged(int i, int i2) {
            super.onItemRangeChanged(i, i2);
            onChanged();
        }

        public void onItemRangeInserted(int i, int i2) {
            super.onItemRangeInserted(i, i2);
            onChanged();
        }

        public void onItemRangeMoved(int i, int i2, int i3) {
            super.onItemRangeMoved(i, i2, i3);
            onChanged();
        }

        public void onItemRangeRemoved(int i, int i2) {
            super.onItemRangeRemoved(i, i2);
            onChanged();
        }

        public void onItemRangeChanged(int i, int i2, @Nullable Object obj) {
            super.onItemRangeChanged(i, i2, obj);
            onChanged();
        }
    }

    public CircleIndicator3(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f6725n = new C0378a();
        this.f6726o = new C0379b();
    }

    public CircleIndicator3(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f6725n = new C0378a();
        this.f6726o = new C0379b();
    }

    @TargetApi(21)
    public CircleIndicator3(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.f6725n = new C0378a();
        this.f6726o = new C0379b();
    }
}
