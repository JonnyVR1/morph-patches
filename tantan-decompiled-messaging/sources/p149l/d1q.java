package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.CallSuper;
import androidx.annotation.LayoutRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.List;

/* JADX INFO: loaded from: classes13.dex */
public abstract class d1q<V extends View> implements qlf0, wnk {
    private static long counter;
    private boolean bound;
    private boolean mIsFirst;
    protected Runnable onBindRunnable;
    protected View.OnClickListener onItemClick;

    @Nullable
    private String pageId;
    public final String uniqueId;

    public d1q() {
        long j = counter;
        counter = 1 + j;
        this.uniqueId = String.valueOf(j);
        this.bound = false;
    }

    /* JADX INFO: renamed from: A */
    public void mo109662A(View.OnClickListener onClickListener) {
        this.onItemClick = onClickListener;
    }

    /* JADX INFO: renamed from: B */
    public void m109663B(@Nullable String str) {
        this.pageId = str;
    }

    /* JADX INFO: renamed from: C */
    public String m109664C() {
        return getClass().getSimpleName();
    }

    /* JADX INFO: renamed from: F */
    public boolean mo101239F(n80 n80Var) {
        return false;
    }

    @Override // p149l.wnk
    /* JADX INFO: renamed from: X1 */
    public int mo109665X1() {
        return 0;
    }

    @Override // p149l.qlf0
    public int getOrder() {
        return 0;
    }

    @Override // p149l.wnk
    public boolean isFirst() {
        return this.mIsFirst;
    }

    @Nullable
    /* JADX INFO: renamed from: n */
    public Object mo109666n() {
        return null;
    }

    @LayoutRes
    /* JADX INFO: renamed from: o */
    public abstract int mo70565o();

    @NonNull
    /* JADX INFO: renamed from: p */
    public String mo109667p() {
        String str = this.pageId;
        return str != null ? str : "";
    }

    /* JADX INFO: renamed from: q */
    public int mo95844q() {
        return 1;
    }

    /* JADX INFO: renamed from: r */
    public int mo109066r() {
        return mo70565o();
    }

    @Override // p149l.wnk
    /* JADX INFO: renamed from: r1 */
    public String mo109668r1() {
        return "";
    }

    /* JADX INFO: renamed from: s */
    public final View m109669s(@NonNull ViewGroup viewGroup) {
        View viewInflate = LayoutInflater.from(viewGroup.getContext()).inflate(mo70565o(), viewGroup, false);
        mo70999m(viewInflate);
        return viewInflate;
    }

    /* JADX INFO: renamed from: t */
    public final boolean m109670t() {
        return this.bound;
    }

    public String toString() {
        return getClass().getSimpleName() + "uniqueId='" + this.uniqueId + "', pageId='" + this.pageId + "'}";
    }

    @CallSuper
    /* JADX INFO: renamed from: u */
    public void mo70566u(V v2) {
        this.bound = true;
        View.OnClickListener onClickListener = this.onItemClick;
        if (onClickListener != null) {
            xdl0.m208329E0(v2, onClickListener);
        }
        Runnable runnable = this.onBindRunnable;
        if (runnable != null) {
            runnable.run();
        }
    }

    @CallSuper
    /* JADX INFO: renamed from: w */
    public void mo71000w(V v2) {
        this.bound = false;
        xdl0.m208329E0(v2, null);
    }

    /* JADX INFO: renamed from: z */
    public void m109673z(Runnable runnable) {
        this.onBindRunnable = runnable;
    }

    @Override // p149l.wnk
    /* JADX INFO: renamed from: z0 */
    public void mo109674z0(boolean z) {
        this.mIsFirst = z;
    }

    /* JADX INFO: renamed from: m */
    public void mo70999m(V v2) {
    }

    /* JADX INFO: renamed from: x */
    public void m109671x(V v2) {
    }

    /* JADX INFO: renamed from: y */
    public void mo109672y(V v2) {
    }

    /* JADX INFO: renamed from: v */
    public void mo70759v(V v2, @NonNull List<Object> list) {
    }
}
