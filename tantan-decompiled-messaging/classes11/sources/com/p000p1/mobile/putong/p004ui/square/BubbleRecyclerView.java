package com.p000p1.mobile.putong.p004ui.square;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import com.p000p1.mobile.putong.p004ui.square.BubbleRecyclerView;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import l.d30;
import l.e30;
import l.vwb;
import p009l.dr2;
import p009l.ed50;
import p009l.gf3;
import p009l.tf3;
import p009l.ydq;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public abstract class BubbleRecyclerView<D extends gf3, A extends dr2<D>> extends RecyclerView {

    /* JADX INFO: renamed from: a */
    public final BubbleLayoutManager f8358a;

    /* JADX INFO: renamed from: b */
    public A f8359b;

    /* JADX INFO: renamed from: c */
    public ed50 f8360c;

    public BubbleRecyclerView(@NonNull Context context) {
        super(context);
        this.f8358a = new BubbleLayoutManager();
        init();
    }

    /* JADX INFO: renamed from: G */
    public static /* synthetic */ void m10470G(View view, float f, boolean z) {
        if (view instanceof AbsBubbleItemView) {
            ((AbsBubbleItemView) view).m10451g(f, z);
        }
    }

    private void init() {
        setItemAnimator((RecyclerView.l) null);
        this.f8358a.m10467r(new ydq() { // from class: l.vf3
            @Override // p009l.ydq
            /* JADX INFO: renamed from: a */
            public final void mo23374a(View view, float f, boolean z) {
                BubbleRecyclerView.m10470G(view, f, z);
            }
        });
        setLayoutManager(this.f8358a);
        this.f8359b = (A) m10474K();
        setAdapter(getAdapter());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: J */
    public void m10473J(final List<D> list) {
        final ArrayList arrayListN = vwb.n(getAdapter().m13444F(), new tf3());
        int iM10459j = this.f8358a.m10459j();
        getAdapter().m13443E(list);
        if (list.size() > 1) {
            post(new Runnable() { // from class: l.wf3
                @Override // java.lang.Runnable
                public final void run() {
                    this.f22073a.m10475L(arrayListN, list);
                }
            });
        } else {
            m10481R(iM10459j);
        }
    }

    /* JADX INFO: renamed from: K */
    public abstract A m10474K();

    /* JADX INFO: renamed from: L */
    public final /* synthetic */ void m10475L(List list, List list2) {
        scrollToPosition(list.size() + list2.size());
    }

    /* JADX INFO: renamed from: M */
    public final /* synthetic */ void m10476M(gf3 gf3Var, d30 d30Var) {
        if (getAdapter().m13446H(gf3Var) == 0) {
            scrollBy(0, 1);
        }
        if (vwb.J(getAdapter().m13444F()) && NullChecker.a(d30Var)) {
            d30Var.call();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: N */
    public final /* synthetic */ void m10477N(int i, Float f) {
        if (i != 0 || f.floatValue() <= 0.01f) {
            return;
        }
        View childAt = getChildAt(getChildCount() - 1);
        if (childAt instanceof AbsBubbleItemView) {
            ((AbsBubbleItemView) childAt).m10445a(f.floatValue());
        }
    }

    /* JADX INFO: renamed from: O */
    public final /* synthetic */ void m10478O() {
        scrollToPosition(getAdapter().m13442C() - 1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: P */
    public void m10479P(final D d, final d30 d30Var) {
        post(new Runnable() { // from class: l.xf3
            @Override // java.lang.Runnable
            public final void run() {
                this.f22582a.m10476M(d, d30Var);
            }
        });
    }

    /* JADX INFO: renamed from: Q */
    public void m10480Q(e30<Float> e30Var) {
        this.f8358a.m10466q(this, e30Var);
    }

    /* JADX INFO: renamed from: R */
    public void m10481R(final int i) {
        int i2 = BubbleLayoutManager.f8346l;
        if (i > i2 * (-1)) {
            if (i < i2 && !this.f8358a.m10460k()) {
                m10480Q(new e30() { // from class: l.yf3
                    public final void call(Object obj) {
                        this.f23028a.m10477N(i, (Float) obj);
                    }
                });
                return;
            }
            ed50 ed50Var = this.f8360c;
            if (ed50Var != null) {
                ed50Var.m13830a(false);
            }
        }
    }

    public void onScrolled(int i, int i2) {
        ed50 ed50Var;
        super.onScrolled(i, i2);
        if (this.f8358a.m10459j() != 0 || (ed50Var = this.f8360c) == null) {
            return;
        }
        ed50Var.m13830a(true);
    }

    public void setBottomListener(ed50 ed50Var) {
        this.f8360c = ed50Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setDataList(List<D> list) {
        getAdapter().m13447I(vwb.n(list, new tf3()));
        post(new Runnable() { // from class: l.uf3
            @Override // java.lang.Runnable
            public final void run() {
                this.f21104a.m10478O();
            }
        });
    }

    @NonNull
    public A getAdapter() {
        return this.f8359b;
    }

    public BubbleRecyclerView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f8358a = new BubbleLayoutManager();
        init();
    }

    public BubbleRecyclerView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f8358a = new BubbleLayoutManager();
        init();
    }
}
