package com.p046p1.mobile.putong.p065ui.square;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import com.p046p1.mobile.putong.p065ui.square.BubbleRecyclerView;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import p149l.d30;
import p149l.dr2;
import p149l.e30;
import p149l.ed50;
import p149l.gf3;
import p149l.tf3;
import p149l.vwb;
import p149l.ydq;

/* JADX INFO: loaded from: classes11.dex */
public abstract class BubbleRecyclerView<D extends gf3, A extends dr2<D>> extends RecyclerView {

    /* JADX INFO: renamed from: a */
    public final BubbleLayoutManager f54752a;

    /* JADX INFO: renamed from: b */
    public A f54753b;

    /* JADX INFO: renamed from: c */
    public ed50 f54754c;

    public BubbleRecyclerView(@NonNull Context context) {
        super(context);
        this.f54752a = new BubbleLayoutManager();
        init();
    }

    /* JADX INFO: renamed from: G */
    public static /* synthetic */ void m80139G(View view, float f, boolean z) {
        if (view instanceof AbsBubbleItemView) {
            ((AbsBubbleItemView) view).m80120g(f, z);
        }
    }

    private void init() {
        setItemAnimator(null);
        this.f54752a.m80136r(new ydq() { // from class: l.vf3
            @Override // p149l.ydq
            /* JADX INFO: renamed from: a */
            public final void mo198263a(View view, float f, boolean z) {
                BubbleRecyclerView.m80139G(view, f, z);
            }
        });
        setLayoutManager(this.f54752a);
        this.f54753b = (A) mo54556K();
        setAdapter(getAdapter());
    }

    /* JADX INFO: renamed from: J */
    public void m80142J(final List<D> list) {
        final ArrayList arrayListM200339n = vwb.m200339n(getAdapter().m113265F(), new tf3());
        int iM80128j = this.f54752a.m80128j();
        getAdapter().m113264E(list);
        if (list.size() > 1) {
            post(new Runnable() { // from class: l.wf3
                @Override // java.lang.Runnable
                public final void run() {
                    this.f186007a.m80143L(arrayListM200339n, list);
                }
            });
        } else {
            m80149R(iM80128j);
        }
    }

    /* JADX INFO: renamed from: K */
    public abstract A mo54556K();

    /* JADX INFO: renamed from: L */
    public final /* synthetic */ void m80143L(List list, List list2) {
        scrollToPosition(list.size() + list2.size());
    }

    /* JADX INFO: renamed from: M */
    public final /* synthetic */ void m80144M(gf3 gf3Var, d30 d30Var) {
        if (getAdapter().m113267H(gf3Var) == 0) {
            scrollBy(0, 1);
        }
        if (vwb.m200296J(getAdapter().m113265F()) && NullChecker.m81303a(d30Var)) {
            d30Var.call();
        }
    }

    /* JADX INFO: renamed from: N */
    public final /* synthetic */ void m80145N(int i, Float f) {
        if (i != 0 || f.floatValue() <= 0.01f) {
            return;
        }
        View childAt = getChildAt(getChildCount() - 1);
        if (childAt instanceof AbsBubbleItemView) {
            ((AbsBubbleItemView) childAt).m80116a(f.floatValue());
        }
    }

    /* JADX INFO: renamed from: O */
    public final /* synthetic */ void m80146O() {
        scrollToPosition(getAdapter().getPageCount() - 1);
    }

    /* JADX INFO: renamed from: P */
    public void m80147P(final D d, final d30 d30Var) {
        post(new Runnable() { // from class: l.xf3
            @Override // java.lang.Runnable
            public final void run() {
                this.f192646a.m80144M(d, d30Var);
            }
        });
    }

    /* JADX INFO: renamed from: Q */
    public void m80148Q(e30<Float> e30Var) {
        this.f54752a.m80135q(this, e30Var);
    }

    /* JADX INFO: renamed from: R */
    public void m80149R(final int i) {
        int i2 = BubbleLayoutManager.f54740l;
        if (i > i2 * (-1)) {
            if (i < i2 && !this.f54752a.m80129k()) {
                m80148Q(new e30() { // from class: l.yf3
                    @Override // p149l.e30
                    public final void call(Object obj) {
                        this.f197976a.m80145N(i, (Float) obj);
                    }
                });
                return;
            }
            ed50 ed50Var = this.f54754c;
            if (ed50Var != null) {
                ed50Var.mo115787a(false);
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public void onScrolled(int i, int i2) {
        ed50 ed50Var;
        super.onScrolled(i, i2);
        if (this.f54752a.m80128j() != 0 || (ed50Var = this.f54754c) == null) {
            return;
        }
        ed50Var.mo115787a(true);
    }

    public void setBottomListener(ed50 ed50Var) {
        this.f54754c = ed50Var;
    }

    public void setDataList(List<D> list) {
        getAdapter().m113268I(vwb.m200339n(list, new tf3()));
        post(new Runnable() { // from class: l.uf3
            @Override // java.lang.Runnable
            public final void run() {
                this.f176226a.m80146O();
            }
        });
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    @NonNull
    public A getAdapter() {
        return this.f54753b;
    }

    public BubbleRecyclerView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f54752a = new BubbleLayoutManager();
        init();
    }

    public BubbleRecyclerView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f54752a = new BubbleLayoutManager();
        init();
    }
}
