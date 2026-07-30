package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.CallSuper;
import androidx.annotation.LayoutRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.List;

/* JADX INFO: loaded from: classes13.dex */
public abstract class d3q<V extends View> implements ztf0, mqk {
    private static long counter;
    private boolean bound;
    private boolean mIsFirst;
    protected Runnable onBindRunnable;
    protected View.OnClickListener onItemClick;

    @Nullable
    private String pageId;
    public final String uniqueId;

    public d3q() {
        long j = counter;
        counter = 1 + j;
        this.uniqueId = String.valueOf(j);
        this.bound = false;
    }

    /* JADX INFO: renamed from: A */
    public void mo113881A(View.OnClickListener onClickListener) {
        this.onItemClick = onClickListener;
    }

    /* JADX INFO: renamed from: B */
    public void m113882B(@Nullable String str) {
        this.pageId = str;
    }

    /* JADX INFO: renamed from: C */
    public String m113883C() {
        return getClass().getSimpleName();
    }

    /* JADX INFO: renamed from: F */
    public boolean mo96605F(j80 j80Var) {
        return false;
    }

    @Override // p153l.mqk
    /* JADX INFO: renamed from: X1 */
    public int mo113884X1() {
        return 0;
    }

    @Override // p153l.ztf0
    public int getOrder() {
        return 0;
    }

    @Override // p153l.mqk
    public boolean isFirst() {
        return this.mIsFirst;
    }

    @Nullable
    /* JADX INFO: renamed from: n */
    public Object mo107030n() {
        return null;
    }

    @LayoutRes
    /* JADX INFO: renamed from: o */
    public abstract int mo71748o();

    @NonNull
    /* JADX INFO: renamed from: p */
    public String mo113885p() {
        String str = this.pageId;
        return str != null ? str : "";
    }

    /* JADX INFO: renamed from: q */
    public int mo96608q() {
        return 1;
    }

    /* JADX INFO: renamed from: r */
    public int mo95343r() {
        return mo71748o();
    }

    @Override // p153l.mqk
    /* JADX INFO: renamed from: r1 */
    public String mo113886r1() {
        return "";
    }

    /* JADX INFO: renamed from: s */
    public final View m113887s(@NonNull ViewGroup viewGroup) {
        View viewInflate = LayoutInflater.from(viewGroup.getContext()).inflate(mo71748o(), viewGroup, false);
        mo72182m(viewInflate);
        return viewInflate;
    }

    /* JADX INFO: renamed from: t */
    public final boolean m113888t() {
        return this.bound;
    }

    public String toString() {
        return getClass().getSimpleName() + "uniqueId='" + this.uniqueId + "', pageId='" + this.pageId + "'}";
    }

    @CallSuper
    /* JADX INFO: renamed from: u */
    public void mo71749u(V v2) {
        this.bound = true;
        View.OnClickListener onClickListener = this.onItemClick;
        if (onClickListener != null) {
            bnl0.m105509E0(v2, onClickListener);
        }
        Runnable runnable = this.onBindRunnable;
        if (runnable != null) {
            runnable.run();
        }
    }

    @CallSuper
    /* JADX INFO: renamed from: w */
    public void mo72183w(V v2) {
        this.bound = false;
        bnl0.m105509E0(v2, null);
    }

    /* JADX INFO: renamed from: z */
    public void m113891z(Runnable runnable) {
        this.onBindRunnable = runnable;
    }

    @Override // p153l.mqk
    /* JADX INFO: renamed from: z0 */
    public void mo113892z0(boolean z) {
        this.mIsFirst = z;
    }

    /* JADX INFO: renamed from: m */
    public void mo72182m(V v2) {
    }

    /* JADX INFO: renamed from: x */
    public void m113889x(V v2) {
    }

    /* JADX INFO: renamed from: y */
    public void mo113890y(V v2) {
    }

    /* JADX INFO: renamed from: v */
    public void mo71942v(V v2, @NonNull List<Object> list) {
    }
}
