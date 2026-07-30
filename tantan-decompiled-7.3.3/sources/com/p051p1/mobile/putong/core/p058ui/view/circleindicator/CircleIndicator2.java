package com.p051p1.mobile.putong.core.p058ui.view.circleindicator;

import android.annotation.TargetApi;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.ColorInt;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.AbstractC0619w;
import androidx.recyclerview.widget.RecyclerView;
import p153l.rv5;

/* JADX INFO: loaded from: classes12.dex */
public class CircleIndicator2 extends BaseCircleIndicator {

    /* JADX INFO: renamed from: m */
    public RecyclerView f37785m;

    /* JADX INFO: renamed from: n */
    public AbstractC0619w f37786n;

    /* JADX INFO: renamed from: o */
    public final RecyclerView.AbstractC0584t f37787o;

    /* JADX INFO: renamed from: p */
    public final RecyclerView.AbstractC0573i f37788p;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.view.circleindicator.CircleIndicator2$a */
    public class C9103a extends RecyclerView.AbstractC0584t {
        public C9103a() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0584t
        public void onScrolled(@NonNull RecyclerView recyclerView, int i, int i2) {
            super.onScrolled(recyclerView, i, i2);
            int iM57399p = CircleIndicator2.this.m57399p(recyclerView.getLayoutManager());
            if (iM57399p == -1) {
                return;
            }
            CircleIndicator2.this.mo57382b(iM57399p);
        }
    }

    public CircleIndicator2(Context context) {
        super(context);
        this.f37787o = new C9103a();
        this.f37788p = new C9104b();
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
        return this.f37788p;
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

    /* JADX INFO: renamed from: n */
    public void m57397n(@NonNull RecyclerView recyclerView, @NonNull AbstractC0619w abstractC0619w) {
        this.f37785m = recyclerView;
        this.f37786n = abstractC0619w;
        this.f37779l = -1;
        m57398o();
        recyclerView.removeOnScrollListener(this.f37787o);
        recyclerView.addOnScrollListener(this.f37787o);
    }

    /* JADX INFO: renamed from: o */
    public final void m57398o() {
        RecyclerView.Adapter adapter = this.f37785m.getAdapter();
        mo57387g(adapter == null ? 0 : adapter.getItemCount(), m57399p(this.f37785m.getLayoutManager()));
    }

    /* JADX INFO: renamed from: p */
    public int m57399p(@Nullable RecyclerView.AbstractC0579o abstractC0579o) {
        View viewMo3812h;
        if (abstractC0579o == null || (viewMo3812h = this.f37786n.mo3812h(abstractC0579o)) == null) {
            return -1;
        }
        return abstractC0579o.getPosition(viewMo3812h);
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.view.circleindicator.BaseCircleIndicator
    public /* bridge */ /* synthetic */ void setIndicatorCreatedListener(@Nullable BaseCircleIndicator.InterfaceC9099a interfaceC9099a) {
        super.setIndicatorCreatedListener(interfaceC9099a);
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.view.circleindicator.CircleIndicator2$b */
    public class C9104b extends RecyclerView.AbstractC0573i {
        public C9104b() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0573i
        public void onChanged() {
            super.onChanged();
            if (CircleIndicator2.this.f37785m == null) {
                return;
            }
            RecyclerView.Adapter adapter = CircleIndicator2.this.f37785m.getAdapter();
            int itemCount = adapter != null ? adapter.getItemCount() : 0;
            if (itemCount == CircleIndicator2.this.getChildCount()) {
                return;
            }
            CircleIndicator2 circleIndicator2 = CircleIndicator2.this;
            if (circleIndicator2.f37779l < itemCount) {
                circleIndicator2.f37779l = circleIndicator2.m57399p(circleIndicator2.f37785m.getLayoutManager());
            } else {
                circleIndicator2.f37779l = -1;
            }
            CircleIndicator2.this.m57398o();
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

    public CircleIndicator2(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f37787o = new C9103a();
        this.f37788p = new C9104b();
    }

    public CircleIndicator2(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f37787o = new C9103a();
        this.f37788p = new C9104b();
    }

    @TargetApi(21)
    public CircleIndicator2(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.f37787o = new C9103a();
        this.f37788p = new C9104b();
    }
}
