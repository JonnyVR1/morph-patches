package com.p046p1.mobile.putong.core.p053ui.messages.recycler.wrap;

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
import p147v.VRecyclerView;
import p149l.j760;
import p149l.jf50;
import p149l.l000;
import p149l.o000;
import p149l.utl;
import p149l.vwb;

/* JADX INFO: loaded from: classes4.dex */
public class MessageRecyclerView extends VRecyclerView implements utl {

    /* JADX INFO: renamed from: c */
    public l000 f32262c;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.messages.recycler.wrap.MessageRecyclerView$a */
    public class C8583a extends RecyclerView.AbstractC0582t {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ jf50 f32263a;

        public C8583a(jf50 jf50Var) {
            this.f32263a = jf50Var;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0582t
        public void onScrollStateChanged(@NonNull @NotNull RecyclerView recyclerView, int i) {
            super.onScrollStateChanged(recyclerView, i);
            this.f32263a.mo141174a(i);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0582t
        public void onScrolled(@NonNull @NotNull RecyclerView recyclerView, int i, int i2) {
            super.onScrolled(recyclerView, i, i2);
            this.f32263a.mo48377b(i, i2);
        }
    }

    public MessageRecyclerView(Context context, @Nullable @org.jetbrains.annotations.Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m49735r();
    }

    private int getPaddingSize() {
        return getPaddingBottom() + getPaddingTop();
    }

    /* JADX INFO: renamed from: r */
    private void m49735r() {
        setOverScrollMode(2);
        setItemAnimator(null);
    }

    @Override // p149l.utl
    /* JADX INFO: renamed from: C */
    public View mo49611C(int i) {
        return getChildAt(i);
    }

    /* JADX INFO: renamed from: G */
    public boolean m49736G() {
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
    public boolean m49737H() {
        return computeVerticalScrollExtent() + computeVerticalScrollOffset() >= computeVerticalScrollRange();
    }

    /* JADX INFO: renamed from: I */
    public void m49738I() {
        ((LinearLayoutManager) getLayoutManager()).scrollToPositionWithOffset(Math.max(getCount() - 1, 0), -1000);
    }

    @Override // p149l.utl
    /* JADX INFO: renamed from: e */
    public void mo49613e() {
        m49738I();
    }

    public int getCount() {
        if (NullChecker.m81303a(this.f32262c)) {
            return this.f32262c.getItemCount();
        }
        return 0;
    }

    @Override // p149l.utl
    public int getCountHook() {
        return getCount();
    }

    public int getFirstVisiblePosition() {
        if (getLayoutManager() instanceof LinearLayoutManager) {
            return Math.max(0, ((LinearLayoutManager) getLayoutManager()).findFirstVisibleItemPosition());
        }
        return 0;
    }

    @Override // p149l.utl
    public int getFirstVisiblePositionHook() {
        return getFirstVisiblePosition();
    }

    public int getFooterViewCount() {
        if (NullChecker.m81303a(this.f32262c)) {
            return this.f32262c.m147977c0();
        }
        return 0;
    }

    public int getHeaderViewsCount() {
        if (NullChecker.m81303a(this.f32262c)) {
            return this.f32262c.m147978d0();
        }
        return 0;
    }

    @Override // p149l.utl
    public int getHeaderViewsCountHook() {
        return getHeaderViewsCount();
    }

    public int getLastVisiblePosition() {
        if (getLayoutManager() instanceof LinearLayoutManager) {
            return ((LinearLayoutManager) getLayoutManager()).findLastVisibleItemPosition();
        }
        return 0;
    }

    @Override // p149l.utl
    public int getLastVisiblePositionHook() {
        return getLastVisiblePosition();
    }

    @Override // p149l.utl
    public int getListRenderHeight() {
        return getHeight();
    }

    @Override // p149l.utl
    public ViewGroup getRealView() {
        return this;
    }

    @Override // p149l.utl
    /* JADX INFO: renamed from: j */
    public void mo49614j(int i, int i2) {
        smoothScrollBy(i, i2);
    }

    @Override // p149l.utl
    /* JADX INFO: renamed from: m */
    public boolean mo49616m() {
        return m49736G();
    }

    @Override // p149l.utl
    /* JADX INFO: renamed from: n */
    public void mo49617n(jf50 jf50Var) {
        addOnScrollListener(new C8583a(jf50Var));
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
    }

    @Override // p149l.utl
    /* JADX INFO: renamed from: p */
    public void mo49618p(int i) {
        scrollToPosition(i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public void scrollToPosition(int i) {
        int headerViewsCount = getHeaderViewsCount() + i;
        if (NullChecker.m81303a(this.f32262c) && (i < 0 || i >= this.f32262c.getItemCount())) {
            headerViewsCount = this.f32262c.getItemCount() + (-1) >= 0 ? this.f32262c.getItemCount() - 1 : 0;
        }
        ((LinearLayoutManager) getLayoutManager()).scrollToPositionWithOffset(headerViewsCount, 0);
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public final void setAdapter(@Nullable RecyclerView.Adapter adapter) {
    }

    public void setMessageAdapter(o000 o000Var) {
        List<j760<Integer, Integer>> listMo139121s = o000Var.mo139121s();
        if (!vwb.m200296J(listMo139121s)) {
            for (j760<Integer, Integer> j760Var : listMo139121s) {
                getRecycledViewPool().m3431m(j760Var.f116564a.intValue(), j760Var.f116565b.intValue());
            }
        }
        l000 l000Var = new l000(this, o000Var);
        this.f32262c = l000Var;
        o000Var.m162102b(l000Var);
        super.setAdapter(this.f32262c);
        this.f32262c.mo147985n();
    }

    @Override // p149l.utl
    public void setMessageAdapterHook(o000 o000Var) {
        setMessageAdapter(o000Var);
    }

    public void setSelection(int i) {
        scrollToPosition(i);
    }

    @Override // p149l.utl
    public void setSelectionHook(int i) {
        setSelection(i);
    }

    @Override // p149l.utl
    /* JADX INFO: renamed from: u */
    public void mo49620u() {
        requestLayout();
    }

    @Override // p149l.utl
    /* JADX INFO: renamed from: x */
    public void mo49622x(int i) {
        smoothScrollToPosition(i);
    }

    public MessageRecyclerView(Context context, @Nullable @org.jetbrains.annotations.Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public MessageRecyclerView(Context context) {
        this(context, null);
    }
}
