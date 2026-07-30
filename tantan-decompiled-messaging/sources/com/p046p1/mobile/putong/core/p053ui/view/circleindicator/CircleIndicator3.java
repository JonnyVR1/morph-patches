package com.p046p1.mobile.putong.core.p053ui.view.circleindicator;

import android.annotation.TargetApi;
import android.content.Context;
import android.util.AttributeSet;
import androidx.annotation.ColorInt;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import p149l.nu5;

/* JADX INFO: loaded from: classes9.dex */
public class CircleIndicator3 extends BaseCircleIndicator {

    /* JADX INFO: renamed from: m */
    public ViewPager2 f36943m;

    /* JADX INFO: renamed from: n */
    public final ViewPager2.AbstractC0740i f36944n;

    /* JADX INFO: renamed from: o */
    public final RecyclerView.AbstractC0571i f36945o;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.view.circleindicator.CircleIndicator3$a */
    public class C8942a extends ViewPager2.AbstractC0740i {
        public C8942a() {
        }

        @Override // androidx.viewpager2.widget.ViewPager2.AbstractC0740i
        public void onPageSelected(int i) {
            CircleIndicator3 circleIndicator3 = CircleIndicator3.this;
            if (i == circleIndicator3.f36931l || circleIndicator3.f36943m.getAdapter() == null || CircleIndicator3.this.f36943m.getAdapter().getItemCount() <= 0) {
                return;
            }
            CircleIndicator3.this.mo56199b(i);
        }
    }

    public CircleIndicator3(Context context) {
        super(context);
        this.f36944n = new C8942a();
        this.f36945o = new C8943b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n */
    public void m56219n() {
        RecyclerView.Adapter adapter = this.f36943m.getAdapter();
        mo56204g(adapter == null ? 0 : adapter.getItemCount(), this.f36943m.getCurrentItem());
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.view.circleindicator.BaseCircleIndicator
    /* JADX INFO: renamed from: b */
    public /* bridge */ /* synthetic */ void mo56199b(int i) {
        super.mo56199b(i);
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.view.circleindicator.BaseCircleIndicator
    /* JADX INFO: renamed from: g */
    public /* bridge */ /* synthetic */ void mo56204g(int i, int i2) {
        super.mo56204g(i, i2);
    }

    public RecyclerView.AbstractC0571i getAdapterDataObserver() {
        return this.f36945o;
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.view.circleindicator.BaseCircleIndicator
    /* JADX INFO: renamed from: j */
    public /* bridge */ /* synthetic */ void mo56207j(nu5 nu5Var) {
        super.mo56207j(nu5Var);
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.view.circleindicator.BaseCircleIndicator
    /* JADX INFO: renamed from: k */
    public /* bridge */ /* synthetic */ void mo56208k(@ColorInt int i, @ColorInt int i2) {
        super.mo56208k(i, i2);
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.view.circleindicator.BaseCircleIndicator
    public /* bridge */ /* synthetic */ void setIndicatorCreatedListener(@Nullable BaseCircleIndicator.InterfaceC8936a interfaceC8936a) {
        super.setIndicatorCreatedListener(interfaceC8936a);
    }

    public void setViewPager(@Nullable ViewPager2 viewPager2) {
        this.f36943m = viewPager2;
        if (viewPager2 == null || viewPager2.getAdapter() == null) {
            return;
        }
        this.f36931l = -1;
        m56219n();
        this.f36943m.m4254n(this.f36944n);
        this.f36943m.m4247g(this.f36944n);
        this.f36944n.onPageSelected(this.f36943m.getCurrentItem());
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.view.circleindicator.CircleIndicator3$b */
    public class C8943b extends RecyclerView.AbstractC0571i {
        public C8943b() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0571i
        public void onChanged() {
            super.onChanged();
            if (CircleIndicator3.this.f36943m == null) {
                return;
            }
            RecyclerView.Adapter adapter = CircleIndicator3.this.f36943m.getAdapter();
            int itemCount = adapter != null ? adapter.getItemCount() : 0;
            if (itemCount == CircleIndicator3.this.getChildCount()) {
                return;
            }
            CircleIndicator3 circleIndicator3 = CircleIndicator3.this;
            if (circleIndicator3.f36931l < itemCount) {
                circleIndicator3.f36931l = circleIndicator3.f36943m.getCurrentItem();
            } else {
                circleIndicator3.f36931l = -1;
            }
            CircleIndicator3.this.m56219n();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0571i
        public void onItemRangeChanged(int i, int i2) {
            super.onItemRangeChanged(i, i2);
            onChanged();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0571i
        public void onItemRangeInserted(int i, int i2) {
            super.onItemRangeInserted(i, i2);
            onChanged();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0571i
        public void onItemRangeMoved(int i, int i2, int i3) {
            super.onItemRangeMoved(i, i2, i3);
            onChanged();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0571i
        public void onItemRangeRemoved(int i, int i2) {
            super.onItemRangeRemoved(i, i2);
            onChanged();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0571i
        public void onItemRangeChanged(int i, int i2, @Nullable Object obj) {
            super.onItemRangeChanged(i, i2, obj);
            onChanged();
        }
    }

    public CircleIndicator3(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f36944n = new C8942a();
        this.f36945o = new C8943b();
    }

    public CircleIndicator3(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f36944n = new C8942a();
        this.f36945o = new C8943b();
    }

    @TargetApi(21)
    public CircleIndicator3(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.f36944n = new C8942a();
        this.f36945o = new C8943b();
    }
}
