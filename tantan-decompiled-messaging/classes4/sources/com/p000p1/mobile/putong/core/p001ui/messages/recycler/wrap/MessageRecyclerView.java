package com.p000p1.mobile.putong.core.p001ui.messages.recycler.wrap;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import l.j760;
import l.vwb;
import org.jetbrains.annotations.NotNull;
import p002l.jf50;
import p002l.l000;
import p002l.o000;
import p002l.utl;
import v.VRecyclerView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class MessageRecyclerView extends VRecyclerView implements utl {

    /* JADX INFO: renamed from: c */
    public l000 f84c;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.messages.recycler.wrap.MessageRecyclerView$a */
    public class C0008a extends RecyclerView.t {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ jf50 f85a;

        public C0008a(jf50 jf50Var) {
            this.f85a = jf50Var;
        }

        public void onScrollStateChanged(@NonNull @NotNull RecyclerView recyclerView, int i) {
            super.onScrollStateChanged(recyclerView, i);
            this.f85a.m15879a(i);
        }

        public void onScrolled(@NonNull @NotNull RecyclerView recyclerView, int i, int i2) {
            super.onScrolled(recyclerView, i, i2);
            this.f85a.m15880b(i, i2);
        }
    }

    public MessageRecyclerView(Context context, @Nullable @org.jetbrains.annotations.Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m149r();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private int getPaddingSize() {
        return getPaddingBottom() + getPaddingTop();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: r */
    private void m149r() {
        setOverScrollMode(2);
        setItemAnimator((RecyclerView.l) null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p002l.utl
    /* JADX INFO: renamed from: C */
    public View mo25C(int i) {
        return getChildAt(i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: G */
    public boolean m150G() {
        if (getLastVisiblePosition() != getCount() - 1) {
            return false;
        }
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            if (getChildAt(childCount).getBottom() - getPaddingTop() == getHeight() - getPaddingSize()) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: H */
    public boolean m151H() {
        return computeVerticalScrollExtent() + computeVerticalScrollOffset() >= computeVerticalScrollRange();
    }

    /* JADX INFO: renamed from: I */
    public void m152I() {
        getLayoutManager().scrollToPositionWithOffset(Math.max(getCount() - 1, 0), -1000);
    }

    @Override // p002l.utl
    /* JADX INFO: renamed from: e */
    public void mo27e() {
        m152I();
    }

    public int getCount() {
        if (NullChecker.a(this.f84c)) {
            return this.f84c.getItemCount();
        }
        return 0;
    }

    @Override // p002l.utl
    public int getCountHook() {
        return getCount();
    }

    public int getFirstVisiblePosition() {
        if (getLayoutManager() instanceof LinearLayoutManager) {
            return Math.max(0, getLayoutManager().findFirstVisibleItemPosition());
        }
        return 0;
    }

    @Override // p002l.utl
    public int getFirstVisiblePositionHook() {
        return getFirstVisiblePosition();
    }

    public int getFooterViewCount() {
        if (NullChecker.a(this.f84c)) {
            return this.f84c.m16911c0();
        }
        return 0;
    }

    public int getHeaderViewsCount() {
        if (NullChecker.a(this.f84c)) {
            return this.f84c.m16912d0();
        }
        return 0;
    }

    @Override // p002l.utl
    public int getHeaderViewsCountHook() {
        return getHeaderViewsCount();
    }

    public int getLastVisiblePosition() {
        if (getLayoutManager() instanceof LinearLayoutManager) {
            return getLayoutManager().findLastVisibleItemPosition();
        }
        return 0;
    }

    @Override // p002l.utl
    public int getLastVisiblePositionHook() {
        return getLastVisiblePosition();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p002l.utl
    public int getListRenderHeight() {
        return getHeight();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p002l.utl
    public ViewGroup getRealView() {
        return this;
    }

    @Override // p002l.utl
    /* JADX INFO: renamed from: j */
    public void mo28j(int i, int i2) {
        smoothScrollBy(i, i2);
    }

    @Override // p002l.utl
    /* JADX INFO: renamed from: m */
    public boolean mo30m() {
        return m150G();
    }

    @Override // p002l.utl
    /* JADX INFO: renamed from: n */
    public void mo31n(jf50 jf50Var) {
        addOnScrollListener(new C0008a(jf50Var));
    }

    public void onMeasure(int i, int i2) {
        super/*androidx.recyclerview.widget.RecyclerView*/.onMeasure(i, i2);
    }

    @Override // p002l.utl
    /* JADX INFO: renamed from: p */
    public void mo32p(int i) {
        scrollToPosition(i);
    }

    public void scrollToPosition(int i) {
        int headerViewsCount = getHeaderViewsCount() + i;
        if (NullChecker.a(this.f84c) && (i < 0 || i >= this.f84c.getItemCount())) {
            headerViewsCount = this.f84c.getItemCount() + (-1) >= 0 ? this.f84c.getItemCount() - 1 : 0;
        }
        getLayoutManager().scrollToPositionWithOffset(headerViewsCount, 0);
    }

    public final void setAdapter(@Nullable RecyclerView.Adapter adapter) {
    }

    public void setMessageAdapter(o000 o000Var) {
        List<j760<Integer, Integer>> listM19179s = o000Var.m19179s();
        if (!vwb.J(listM19179s)) {
            for (j760<Integer, Integer> j760Var : listM19179s) {
                getRecycledViewPool().m(((Integer) j760Var.a).intValue(), ((Integer) j760Var.b).intValue());
            }
        }
        l000 l000Var = new l000(this, o000Var);
        this.f84c = l000Var;
        o000Var.m19172b(l000Var);
        super/*androidx.recyclerview.widget.RecyclerView*/.setAdapter(this.f84c);
        this.f84c.mo16919n();
    }

    @Override // p002l.utl
    public void setMessageAdapterHook(o000 o000Var) {
        setMessageAdapter(o000Var);
    }

    public void setSelection(int i) {
        scrollToPosition(i);
    }

    @Override // p002l.utl
    public void setSelectionHook(int i) {
        setSelection(i);
    }

    @Override // p002l.utl
    /* JADX INFO: renamed from: u */
    public void mo34u() {
        requestLayout();
    }

    @Override // p002l.utl
    /* JADX INFO: renamed from: x */
    public void mo36x(int i) {
        smoothScrollToPosition(i);
    }

    public MessageRecyclerView(Context context, @Nullable @org.jetbrains.annotations.Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public MessageRecyclerView(Context context) {
        this(context, null);
    }
}
