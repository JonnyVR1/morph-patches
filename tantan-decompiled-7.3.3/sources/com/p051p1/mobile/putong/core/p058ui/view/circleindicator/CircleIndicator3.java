package com.p051p1.mobile.putong.core.p058ui.view.circleindicator;

import android.annotation.TargetApi;
import android.content.Context;
import android.util.AttributeSet;
import androidx.annotation.ColorInt;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import p153l.rv5;

/* JADX INFO: loaded from: classes12.dex */
public class CircleIndicator3 extends BaseCircleIndicator {

    /* JADX INFO: renamed from: m */
    public ViewPager2 f37791m;

    /* JADX INFO: renamed from: n */
    public final ViewPager2.AbstractC0742i f37792n;

    /* JADX INFO: renamed from: o */
    public final RecyclerView.AbstractC0573i f37793o;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.view.circleindicator.CircleIndicator3$a */
    public class C9105a extends ViewPager2.AbstractC0742i {
        public C9105a() {
        }

        @Override // androidx.viewpager2.widget.ViewPager2.AbstractC0742i
        public void onPageSelected(int i) {
            CircleIndicator3 circleIndicator3 = CircleIndicator3.this;
            if (i == circleIndicator3.f37779l || circleIndicator3.f37791m.getAdapter() == null || CircleIndicator3.this.f37791m.getAdapter().getItemCount() <= 0) {
                return;
            }
            CircleIndicator3.this.mo57382b(i);
        }
    }

    public CircleIndicator3(Context context) {
        super(context);
        this.f37792n = new C9105a();
        this.f37793o = new C9106b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n */
    public void m57402n() {
        RecyclerView.Adapter adapter = this.f37791m.getAdapter();
        mo57387g(adapter == null ? 0 : adapter.getItemCount(), this.f37791m.getCurrentItem());
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.view.circleindicator.BaseCircleIndicator
    /* JADX INFO: renamed from: b */
    public /* bridge */ /* synthetic */ void mo57382b(int i) {
        super.mo57382b(i);
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.view.circleindicator.BaseCircleIndicator
    /* JADX INFO: renamed from: g */
    public /* bridge */ /* synthetic */ void mo57387g(int i, int i2) {
        super.mo57387g(i, i2);
    }

    public RecyclerView.AbstractC0573i getAdapterDataObserver() {
        return this.f37793o;
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.view.circleindicator.BaseCircleIndicator
    /* JADX INFO: renamed from: j */
    public /* bridge */ /* synthetic */ void mo57390j(rv5 rv5Var) {
        super.mo57390j(rv5Var);
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.view.circleindicator.BaseCircleIndicator
    /* JADX INFO: renamed from: k */
    public /* bridge */ /* synthetic */ void mo57391k(@ColorInt int i, @ColorInt int i2) {
        super.mo57391k(i, i2);
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.view.circleindicator.BaseCircleIndicator
    public /* bridge */ /* synthetic */ void setIndicatorCreatedListener(@Nullable BaseCircleIndicator.InterfaceC9099a interfaceC9099a) {
        super.setIndicatorCreatedListener(interfaceC9099a);
    }

    public void setViewPager(@Nullable ViewPager2 viewPager2) {
        this.f37791m = viewPager2;
        if (viewPager2 == null || viewPager2.getAdapter() == null) {
            return;
        }
        this.f37779l = -1;
        m57402n();
        this.f37791m.m4256n(this.f37792n);
        this.f37791m.m4249g(this.f37792n);
        this.f37792n.onPageSelected(this.f37791m.getCurrentItem());
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.view.circleindicator.CircleIndicator3$b */
    public class C9106b extends RecyclerView.AbstractC0573i {
        public C9106b() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0573i
        public void onChanged() {
            super.onChanged();
            if (CircleIndicator3.this.f37791m == null) {
                return;
            }
            RecyclerView.Adapter adapter = CircleIndicator3.this.f37791m.getAdapter();
            int itemCount = adapter != null ? adapter.getItemCount() : 0;
            if (itemCount == CircleIndicator3.this.getChildCount()) {
                return;
            }
            CircleIndicator3 circleIndicator3 = CircleIndicator3.this;
            if (circleIndicator3.f37779l < itemCount) {
                circleIndicator3.f37779l = circleIndicator3.f37791m.getCurrentItem();
            } else {
                circleIndicator3.f37779l = -1;
            }
            CircleIndicator3.this.m57402n();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0573i
        public void onItemRangeChanged(int i, int i2) {
            super.onItemRangeChanged(i, i2);
            onChanged();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0573i
        public void onItemRangeInserted(int i, int i2) {
            super.onItemRangeInserted(i, i2);
            onChanged();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0573i
        public void onItemRangeMoved(int i, int i2, int i3) {
            super.onItemRangeMoved(i, i2, i3);
            onChanged();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0573i
        public void onItemRangeRemoved(int i, int i2) {
            super.onItemRangeRemoved(i, i2);
            onChanged();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0573i
        public void onItemRangeChanged(int i, int i2, @Nullable Object obj) {
            super.onItemRangeChanged(i, i2, obj);
            onChanged();
        }
    }

    public CircleIndicator3(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f37792n = new C9105a();
        this.f37793o = new C9106b();
    }

    public CircleIndicator3(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f37792n = new C9105a();
        this.f37793o = new C9106b();
    }

    @TargetApi(21)
    public CircleIndicator3(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.f37792n = new C9105a();
        this.f37793o = new C9106b();
    }
}
