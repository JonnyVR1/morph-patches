package com.p051p1.mobile.putong.core.p058ui.messages.recycler.wrap;

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
import org.jetbrains.annotations.NotNull;
import p151v.VRecyclerView;
import p153l.i900;
import p153l.iwl;
import p153l.jyb;
import p153l.l900;
import p153l.pf60;
import p153l.pn50;

/* JADX INFO: loaded from: classes4.dex */
public class MessageRecyclerView extends VRecyclerView implements iwl {

    /* JADX INFO: renamed from: c */
    public i900 f33110c;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.messages.recycler.wrap.MessageRecyclerView$a */
    public class C8746a extends RecyclerView.AbstractC0584t {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ pn50 f33111a;

        public C8746a(pn50 pn50Var) {
            this.f33111a = pn50Var;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0584t
        public void onScrollStateChanged(@NonNull @NotNull RecyclerView recyclerView, int i) {
            super.onScrollStateChanged(recyclerView, i);
            this.f33111a.mo173031a(i);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0584t
        public void onScrolled(@NonNull @NotNull RecyclerView recyclerView, int i, int i2) {
            super.onScrolled(recyclerView, i, i2);
            this.f33111a.mo49560b(i, i2);
        }
    }

    public MessageRecyclerView(Context context, @Nullable @org.jetbrains.annotations.Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m50918r();
    }

    private int getPaddingSize() {
        return getPaddingBottom() + getPaddingTop();
    }

    /* JADX INFO: renamed from: r */
    private void m50918r() {
        setOverScrollMode(2);
        setItemAnimator(null);
    }

    @Override // p153l.iwl
    /* JADX INFO: renamed from: C */
    public View mo50794C(int i) {
        return getChildAt(i);
    }

    /* JADX INFO: renamed from: G */
    public boolean m50919G() {
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
    public boolean m50920H() {
        return computeVerticalScrollExtent() + computeVerticalScrollOffset() >= computeVerticalScrollRange();
    }

    /* JADX INFO: renamed from: I */
    public void m50921I() {
        ((LinearLayoutManager) getLayoutManager()).scrollToPositionWithOffset(Math.max(getCount() - 1, 0), -1000);
    }

    @Override // p153l.iwl
    /* JADX INFO: renamed from: e */
    public void mo50796e() {
        m50921I();
    }

    public int getCount() {
        if (NullChecker.m82486a(this.f33110c)) {
            return this.f33110c.getItemCount();
        }
        return 0;
    }

    @Override // p153l.iwl
    public int getCountHook() {
        return getCount();
    }

    public int getFirstVisiblePosition() {
        if (getLayoutManager() instanceof LinearLayoutManager) {
            return Math.max(0, ((LinearLayoutManager) getLayoutManager()).findFirstVisibleItemPosition());
        }
        return 0;
    }

    @Override // p153l.iwl
    public int getFirstVisiblePositionHook() {
        return getFirstVisiblePosition();
    }

    public int getFooterViewCount() {
        if (NullChecker.m82486a(this.f33110c)) {
            return this.f33110c.m139050c0();
        }
        return 0;
    }

    public int getHeaderViewsCount() {
        if (NullChecker.m82486a(this.f33110c)) {
            return this.f33110c.m139051d0();
        }
        return 0;
    }

    @Override // p153l.iwl
    public int getHeaderViewsCountHook() {
        return getHeaderViewsCount();
    }

    public int getLastVisiblePosition() {
        if (getLayoutManager() instanceof LinearLayoutManager) {
            return ((LinearLayoutManager) getLayoutManager()).findLastVisibleItemPosition();
        }
        return 0;
    }

    @Override // p153l.iwl
    public int getLastVisiblePositionHook() {
        return getLastVisiblePosition();
    }

    @Override // p153l.iwl
    public int getListRenderHeight() {
        return getHeight();
    }

    @Override // p153l.iwl
    public ViewGroup getRealView() {
        return this;
    }

    @Override // p153l.iwl
    /* JADX INFO: renamed from: j */
    public void mo50797j(int i, int i2) {
        smoothScrollBy(i, i2);
    }

    @Override // p153l.iwl
    /* JADX INFO: renamed from: m */
    public boolean mo50799m() {
        return m50919G();
    }

    @Override // p153l.iwl
    /* JADX INFO: renamed from: n */
    public void mo50800n(pn50 pn50Var) {
        addOnScrollListener(new C8746a(pn50Var));
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
    }

    @Override // p153l.iwl
    /* JADX INFO: renamed from: p */
    public void mo50801p(int i) {
        scrollToPosition(i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public void scrollToPosition(int i) {
        int headerViewsCount = getHeaderViewsCount() + i;
        if (NullChecker.m82486a(this.f33110c) && (i < 0 || i >= this.f33110c.getItemCount())) {
            headerViewsCount = this.f33110c.getItemCount() + (-1) >= 0 ? this.f33110c.getItemCount() - 1 : 0;
        }
        ((LinearLayoutManager) getLayoutManager()).scrollToPositionWithOffset(headerViewsCount, 0);
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public final void setAdapter(@Nullable RecyclerView.Adapter adapter) {
    }

    public void setMessageAdapter(l900 l900Var) {
        List<pf60<Integer, Integer>> listMo129508s = l900Var.mo129508s();
        if (!jyb.m147479J(listMo129508s)) {
            for (pf60<Integer, Integer> pf60Var : listMo129508s) {
                getRecycledViewPool().m3440m(pf60Var.f152156a.intValue(), pf60Var.f152157b.intValue());
            }
        }
        i900 i900Var = new i900(this, l900Var);
        this.f33110c = i900Var;
        l900Var.m153305b(i900Var);
        super.setAdapter(this.f33110c);
        this.f33110c.mo139058n();
    }

    @Override // p153l.iwl
    public void setMessageAdapterHook(l900 l900Var) {
        setMessageAdapter(l900Var);
    }

    public void setSelection(int i) {
        scrollToPosition(i);
    }

    @Override // p153l.iwl
    public void setSelectionHook(int i) {
        setSelection(i);
    }

    @Override // p153l.iwl
    /* JADX INFO: renamed from: u */
    public void mo50803u() {
        requestLayout();
    }

    @Override // p153l.iwl
    /* JADX INFO: renamed from: x */
    public void mo50805x(int i) {
        smoothScrollToPosition(i);
    }

    public MessageRecyclerView(Context context, @Nullable @org.jetbrains.annotations.Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public MessageRecyclerView(Context context) {
        this(context, null);
    }
}
