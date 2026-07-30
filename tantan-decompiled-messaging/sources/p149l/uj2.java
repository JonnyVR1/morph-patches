package p149l;

import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import p149l.ho2;
import p149l.s7m;

/* JADX INFO: loaded from: classes4.dex */
public abstract class uj2<D extends ho2, V extends s7m> extends h4t<D, V> {

    /* JADX INFO: renamed from: i */
    public static final int f176731i = g5c0.f101085w3;

    public uj2(bsm<D> bsmVar) {
        super(bsmVar);
    }

    /* JADX INFO: renamed from: L3 */
    public void m193995L3(View view) {
        ViewGroup viewGroupMo104532T3;
        if (view == null || m144510w2() == null || !(m144510w2() instanceof qj2) || (viewGroupMo104532T3 = ((qj2) m144510w2()).mo104532T3()) == null || viewGroupMo104532T3.indexOfChild(view) >= 0) {
            return;
        }
        view.setTag(f176731i, Integer.valueOf(getOrder()));
        for (int i = 0; i < viewGroupMo104532T3.getChildCount(); i++) {
            Object tag = viewGroupMo104532T3.getChildAt(i).getTag(f176731i);
            if (tag != null && (tag instanceof Integer)) {
                Integer num = (Integer) tag;
                if (num.intValue() != -1) {
                    if (getOrder() < num.intValue()) {
                        viewGroupMo104532T3.addView(view, i);
                        return;
                    }
                }
            }
            viewGroupMo104532T3.addView(view);
            return;
        }
        viewGroupMo104532T3.addView(view);
    }

    /* JADX INFO: renamed from: M3 */
    public abstract String mo95286M3();

    /* JADX INFO: renamed from: N3 */
    public final /* synthetic */ void m193996N3() {
        if (m144510w2() == null || !(m144510w2() instanceof qj2)) {
            return;
        }
        m144510w2().m144506C2(this);
        ((qj2) m144510w2()).mo174925U3(mo95286M3());
    }

    /* JADX INFO: renamed from: O3 */
    public final /* synthetic */ void m193997O3(View view) {
        ViewGroup viewGroupMo104532T3;
        if (view == null || m144510w2() == null || !(m144510w2() instanceof qj2) || (viewGroupMo104532T3 = ((qj2) m144510w2()).mo104532T3()) == null || viewGroupMo104532T3.indexOfChild(view) < 0) {
            return;
        }
        viewGroupMo104532T3.removeView(view);
    }

    /* JADX INFO: renamed from: P3 */
    public void m193998P3() {
        m194000S3(new d30() { // from class: l.tj2
            @Override // p149l.d30
            public final void call() {
                this.f170644a.m193996N3();
            }
        });
    }

    /* JADX INFO: renamed from: R3 */
    public void m193999R3(final View view) {
        m194000S3(new d30() { // from class: l.sj2
            @Override // p149l.d30
            public final void call() {
                this.f164774a.m193997O3(view);
            }
        });
    }

    /* JADX INFO: renamed from: S3 */
    public final void m194000S3(d30 d30Var) {
        if (d30Var == null) {
            return;
        }
        if (Looper.getMainLooper() != Looper.myLooper()) {
            e51.m114748M(new bii0(d30Var));
        } else {
            d30Var.call();
        }
    }

    public int getOrder() {
        return -1;
    }
}
