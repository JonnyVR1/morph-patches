package p002l;

import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import l.bii0;
import l.d30;
import l.e51;
import l.s7m;
import p002l.ho2;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public abstract class uj2<D extends ho2, V extends s7m> extends h4t<D, V> {

    /* JADX INFO: renamed from: i */
    public static final int f20671i = g5c0.f11235w3;

    public uj2(bsm<D> bsmVar) {
        super(bsmVar);
    }

    /* JADX INFO: renamed from: L3 */
    public void m23501L3(View view) {
        ViewGroup viewGroupMo10687T3;
        if (view == null || w2() == null || !(w2() instanceof qj2) || (viewGroupMo10687T3 = ((qj2) w2()).mo10687T3()) == null || viewGroupMo10687T3.indexOfChild(view) >= 0) {
            return;
        }
        view.setTag(f20671i, Integer.valueOf(getOrder()));
        for (int i = 0; i < viewGroupMo10687T3.getChildCount(); i++) {
            Object tag = viewGroupMo10687T3.getChildAt(i).getTag(f20671i);
            if (tag != null && (tag instanceof Integer)) {
                Integer num = (Integer) tag;
                if (num.intValue() != -1) {
                    if (getOrder() < num.intValue()) {
                        viewGroupMo10687T3.addView(view, i);
                        return;
                    }
                }
            }
            viewGroupMo10687T3.addView(view);
            return;
        }
        viewGroupMo10687T3.addView(view);
    }

    /* JADX INFO: renamed from: M3 */
    public abstract String mo9446M3();

    /* JADX INFO: renamed from: N3 */
    public final /* synthetic */ void m23502N3() {
        if (w2() == null || !(w2() instanceof qj2)) {
            return;
        }
        w2().C2(this);
        ((qj2) w2()).mo21291U3(mo9446M3());
    }

    /* JADX INFO: renamed from: O3 */
    public final /* synthetic */ void m23503O3(View view) {
        ViewGroup viewGroupMo10687T3;
        if (view == null || w2() == null || !(w2() instanceof qj2) || (viewGroupMo10687T3 = ((qj2) w2()).mo10687T3()) == null || viewGroupMo10687T3.indexOfChild(view) < 0) {
            return;
        }
        viewGroupMo10687T3.removeView(view);
    }

    /* JADX INFO: renamed from: P3 */
    public void m23504P3() {
        m23506S3(new d30() { // from class: l.tj2
            public final void call() {
                this.f20274a.m23502N3();
            }
        });
    }

    /* JADX INFO: renamed from: R3 */
    public void m23505R3(final View view) {
        m23506S3(new d30() { // from class: l.sj2
            public final void call() {
                this.f19051a.m23503O3(view);
            }
        });
    }

    /* JADX INFO: renamed from: S3 */
    public final void m23506S3(d30 d30Var) {
        if (d30Var == null) {
            return;
        }
        if (Looper.getMainLooper() != Looper.myLooper()) {
            e51.M(new bii0(d30Var));
        } else {
            d30Var.call();
        }
    }

    public int getOrder() {
        return -1;
    }
}
