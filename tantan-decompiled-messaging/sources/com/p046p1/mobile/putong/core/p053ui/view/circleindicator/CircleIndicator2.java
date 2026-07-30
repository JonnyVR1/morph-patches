package com.p046p1.mobile.putong.core.p053ui.view.circleindicator;

import android.annotation.TargetApi;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.ColorInt;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.AbstractC0617w;
import androidx.recyclerview.widget.RecyclerView;
import p149l.nu5;

/* JADX INFO: loaded from: classes9.dex */
public class CircleIndicator2 extends BaseCircleIndicator {

    /* JADX INFO: renamed from: m */
    public RecyclerView f36937m;

    /* JADX INFO: renamed from: n */
    public AbstractC0617w f36938n;

    /* JADX INFO: renamed from: o */
    public final RecyclerView.AbstractC0582t f36939o;

    /* JADX INFO: renamed from: p */
    public final RecyclerView.AbstractC0571i f36940p;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.view.circleindicator.CircleIndicator2$a */
    public class C8940a extends RecyclerView.AbstractC0582t {
        public C8940a() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0582t
        public void onScrolled(@NonNull RecyclerView recyclerView, int i, int i2) {
            super.onScrolled(recyclerView, i, i2);
            int iM56216p = CircleIndicator2.this.m56216p(recyclerView.getLayoutManager());
            if (iM56216p == -1) {
                return;
            }
            CircleIndicator2.this.mo56199b(iM56216p);
        }
    }

    public CircleIndicator2(Context context) {
        super(context);
        this.f36939o = new C8940a();
        this.f36940p = new C8941b();
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
        return this.f36940p;
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

    /* JADX INFO: renamed from: n */
    public void m56214n(@NonNull RecyclerView recyclerView, @NonNull AbstractC0617w abstractC0617w) {
        this.f36937m = recyclerView;
        this.f36938n = abstractC0617w;
        this.f36931l = -1;
        m56215o();
        recyclerView.removeOnScrollListener(this.f36939o);
        recyclerView.addOnScrollListener(this.f36939o);
    }

    /* JADX INFO: renamed from: o */
    public final void m56215o() {
        RecyclerView.Adapter adapter = this.f36937m.getAdapter();
        mo56204g(adapter == null ? 0 : adapter.getItemCount(), m56216p(this.f36937m.getLayoutManager()));
    }

    /* JADX INFO: renamed from: p */
    public int m56216p(@Nullable RecyclerView.AbstractC0577o abstractC0577o) {
        View viewMo3811h;
        if (abstractC0577o == null || (viewMo3811h = this.f36938n.mo3811h(abstractC0577o)) == null) {
            return -1;
        }
        return abstractC0577o.getPosition(viewMo3811h);
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.view.circleindicator.BaseCircleIndicator
    public /* bridge */ /* synthetic */ void setIndicatorCreatedListener(@Nullable BaseCircleIndicator.InterfaceC8936a interfaceC8936a) {
        super.setIndicatorCreatedListener(interfaceC8936a);
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.view.circleindicator.CircleIndicator2$b */
    public class C8941b extends RecyclerView.AbstractC0571i {
        public C8941b() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0571i
        public void onChanged() {
            super.onChanged();
            if (CircleIndicator2.this.f36937m == null) {
                return;
            }
            RecyclerView.Adapter adapter = CircleIndicator2.this.f36937m.getAdapter();
            int itemCount = adapter != null ? adapter.getItemCount() : 0;
            if (itemCount == CircleIndicator2.this.getChildCount()) {
                return;
            }
            CircleIndicator2 circleIndicator2 = CircleIndicator2.this;
            if (circleIndicator2.f36931l < itemCount) {
                circleIndicator2.f36931l = circleIndicator2.m56216p(circleIndicator2.f36937m.getLayoutManager());
            } else {
                circleIndicator2.f36931l = -1;
            }
            CircleIndicator2.this.m56215o();
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

    public CircleIndicator2(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f36939o = new C8940a();
        this.f36940p = new C8941b();
    }

    public CircleIndicator2(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f36939o = new C8940a();
        this.f36940p = new C8941b();
    }

    @TargetApi(21)
    public CircleIndicator2(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.f36939o = new C8940a();
        this.f36940p = new C8941b();
    }
}
