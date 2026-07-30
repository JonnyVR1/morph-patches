package com.p000p1.mobile.putong.core.p004ui.view.circleindicator;

import android.annotation.TargetApi;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.ColorInt;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.w;
import p006l.nu5;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class CircleIndicator2 extends BaseCircleIndicator {

    /* JADX INFO: renamed from: m */
    public RecyclerView f6718m;

    /* JADX INFO: renamed from: n */
    public w f6719n;

    /* JADX INFO: renamed from: o */
    public final RecyclerView.t f6720o;

    /* JADX INFO: renamed from: p */
    public final RecyclerView.i f6721p;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.view.circleindicator.CircleIndicator2$a */
    public class C0376a extends RecyclerView.t {
        public C0376a() {
        }

        public void onScrolled(@NonNull RecyclerView recyclerView, int i, int i2) {
            super.onScrolled(recyclerView, i, i2);
            int iM9649p = CircleIndicator2.this.m9649p(recyclerView.getLayoutManager());
            if (iM9649p == -1) {
                return;
            }
            CircleIndicator2.this.mo9632b(iM9649p);
        }
    }

    public CircleIndicator2(Context context) {
        super(context);
        this.f6720o = new C0376a();
        this.f6721p = new C0377b();
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
        return this.f6721p;
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

    /* JADX INFO: renamed from: n */
    public void m9647n(@NonNull RecyclerView recyclerView, @NonNull w wVar) {
        this.f6718m = recyclerView;
        this.f6719n = wVar;
        this.f6712l = -1;
        m9648o();
        recyclerView.removeOnScrollListener(this.f6720o);
        recyclerView.addOnScrollListener(this.f6720o);
    }

    /* JADX INFO: renamed from: o */
    public final void m9648o() {
        RecyclerView.Adapter adapter = this.f6718m.getAdapter();
        mo9637g(adapter == null ? 0 : adapter.getItemCount(), m9649p(this.f6718m.getLayoutManager()));
    }

    /* JADX INFO: renamed from: p */
    public int m9649p(@Nullable RecyclerView.o oVar) {
        View viewH;
        if (oVar == null || (viewH = this.f6719n.h(oVar)) == null) {
            return -1;
        }
        return oVar.getPosition(viewH);
    }

    @Override // com.p000p1.mobile.putong.core.p004ui.view.circleindicator.BaseCircleIndicator
    public /* bridge */ /* synthetic */ void setIndicatorCreatedListener(@Nullable BaseCircleIndicator.InterfaceC0372a interfaceC0372a) {
        super.setIndicatorCreatedListener(interfaceC0372a);
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.view.circleindicator.CircleIndicator2$b */
    public class C0377b extends RecyclerView.i {
        public C0377b() {
        }

        public void onChanged() {
            super.onChanged();
            if (CircleIndicator2.this.f6718m == null) {
                return;
            }
            RecyclerView.Adapter adapter = CircleIndicator2.this.f6718m.getAdapter();
            int itemCount = adapter != null ? adapter.getItemCount() : 0;
            if (itemCount == CircleIndicator2.this.getChildCount()) {
                return;
            }
            CircleIndicator2 circleIndicator2 = CircleIndicator2.this;
            if (circleIndicator2.f6712l < itemCount) {
                circleIndicator2.f6712l = circleIndicator2.m9649p(circleIndicator2.f6718m.getLayoutManager());
            } else {
                circleIndicator2.f6712l = -1;
            }
            CircleIndicator2.this.m9648o();
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

    public CircleIndicator2(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f6720o = new C0376a();
        this.f6721p = new C0377b();
    }

    public CircleIndicator2(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f6720o = new C0376a();
        this.f6721p = new C0377b();
    }

    @TargetApi(21)
    public CircleIndicator2(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.f6720o = new C0376a();
        this.f6721p = new C0377b();
    }
}
