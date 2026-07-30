package com.p051p1.mobile.putong.p070ui.square;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import com.p051p1.mobile.putong.p070ui.square.BubbleRecyclerView;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import p153l.hg3;
import p153l.jyb;
import p153l.ll50;
import p153l.tr2;
import p153l.uf3;
import p153l.x20;
import p153l.y20;
import p153l.yfq;

/* JADX INFO: loaded from: classes10.dex */
public abstract class BubbleRecyclerView<D extends uf3, A extends tr2<D>> extends RecyclerView {

    /* JADX INFO: renamed from: a */
    public final BubbleLayoutManager f55600a;

    /* JADX INFO: renamed from: b */
    public A f55601b;

    /* JADX INFO: renamed from: c */
    public ll50 f55602c;

    public BubbleRecyclerView(@NonNull Context context) {
        super(context);
        this.f55600a = new BubbleLayoutManager();
        init();
    }

    /* JADX INFO: renamed from: G */
    public static /* synthetic */ void m81322G(View view, float f, boolean z) {
        if (view instanceof AbsBubbleItemView) {
            ((AbsBubbleItemView) view).m81303g(f, z);
        }
    }

    private void init() {
        setItemAnimator(null);
        this.f55600a.m81319r(new yfq() { // from class: l.jg3
            @Override // p153l.yfq
            /* JADX INFO: renamed from: a */
            public final void mo144749a(View view, float f, boolean z) {
                BubbleRecyclerView.m81322G(view, f, z);
            }
        });
        setLayoutManager(this.f55600a);
        this.f55601b = (A) mo55739K();
        setAdapter(getAdapter());
    }

    /* JADX INFO: renamed from: J */
    public void m81325J(final List<D> list) {
        final ArrayList arrayListM147522n = jyb.m147522n(getAdapter().m192400F(), new hg3());
        int iM81311j = this.f55600a.m81311j();
        getAdapter().m192399E(list);
        if (list.size() > 1) {
            post(new Runnable() { // from class: l.kg3
                @Override // java.lang.Runnable
                public final void run() {
                    this.f126570a.m81326L(arrayListM147522n, list);
                }
            });
        } else {
            m81332R(iM81311j);
        }
    }

    /* JADX INFO: renamed from: K */
    public abstract A mo55739K();

    /* JADX INFO: renamed from: L */
    public final /* synthetic */ void m81326L(List list, List list2) {
        scrollToPosition(list.size() + list2.size());
    }

    /* JADX INFO: renamed from: M */
    public final /* synthetic */ void m81327M(uf3 uf3Var, x20 x20Var) {
        if (getAdapter().m192402H(uf3Var) == 0) {
            scrollBy(0, 1);
        }
        if (jyb.m147479J(getAdapter().m192400F()) && NullChecker.m82486a(x20Var)) {
            x20Var.call();
        }
    }

    /* JADX INFO: renamed from: N */
    public final /* synthetic */ void m81328N(int i, Float f) {
        if (i != 0 || f.floatValue() <= 0.01f) {
            return;
        }
        View childAt = getChildAt(getChildCount() - 1);
        if (childAt instanceof AbsBubbleItemView) {
            ((AbsBubbleItemView) childAt).m81299a(f.floatValue());
        }
    }

    /* JADX INFO: renamed from: O */
    public final /* synthetic */ void m81329O() {
        scrollToPosition(getAdapter().getPageCount() - 1);
    }

    /* JADX INFO: renamed from: P */
    public void m81330P(final D d, final x20 x20Var) {
        post(new Runnable() { // from class: l.lg3
            @Override // java.lang.Runnable
            public final void run() {
                this.f131926a.m81327M(d, x20Var);
            }
        });
    }

    /* JADX INFO: renamed from: Q */
    public void m81331Q(y20<Float> y20Var) {
        this.f55600a.m81318q(this, y20Var);
    }

    /* JADX INFO: renamed from: R */
    public void m81332R(final int i) {
        int i2 = BubbleLayoutManager.f55588l;
        if (i > i2 * (-1)) {
            if (i < i2 && !this.f55600a.m81312k()) {
                m81331Q(new y20() { // from class: l.mg3
                    @Override // p153l.y20
                    public final void call(Object obj) {
                        this.f136691a.m81328N(i, (Float) obj);
                    }
                });
                return;
            }
            ll50 ll50Var = this.f55602c;
            if (ll50Var != null) {
                ll50Var.mo154701a(false);
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public void onScrolled(int i, int i2) {
        ll50 ll50Var;
        super.onScrolled(i, i2);
        if (this.f55600a.m81311j() != 0 || (ll50Var = this.f55602c) == null) {
            return;
        }
        ll50Var.mo154701a(true);
    }

    public void setBottomListener(ll50 ll50Var) {
        this.f55602c = ll50Var;
    }

    public void setDataList(List<D> list) {
        getAdapter().m192403I(jyb.m147522n(list, new hg3()));
        post(new Runnable() { // from class: l.ig3
            @Override // java.lang.Runnable
            public final void run() {
                this.f114732a.m81329O();
            }
        });
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    @NonNull
    public A getAdapter() {
        return this.f55601b;
    }

    public BubbleRecyclerView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f55600a = new BubbleLayoutManager();
        init();
    }

    public BubbleRecyclerView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f55600a = new BubbleLayoutManager();
        init();
    }
}
