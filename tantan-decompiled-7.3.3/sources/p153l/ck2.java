package p153l;

import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import p153l.iam;
import p153l.oo2;

/* JADX INFO: loaded from: classes4.dex */
public abstract class ck2<D extends oo2, V extends iam> extends i6t<D, V> {

    /* JADX INFO: renamed from: i */
    public static final int f82255i = mdc0.f136330w3;

    public ck2(dum<D> dumVar) {
        super(dumVar);
    }

    /* JADX INFO: renamed from: L3 */
    public void m110323L3(View view) {
        ViewGroup viewGroupMo130467T3;
        if (view == null || m153101w2() == null || !(m153101w2() instanceof yj2) || (viewGroupMo130467T3 = ((yj2) m153101w2()).mo130467T3()) == null || viewGroupMo130467T3.indexOfChild(view) >= 0) {
            return;
        }
        view.setTag(f82255i, Integer.valueOf(getOrder()));
        for (int i = 0; i < viewGroupMo130467T3.getChildCount(); i++) {
            Object tag = viewGroupMo130467T3.getChildAt(i).getTag(f82255i);
            if (tag != null && (tag instanceof Integer)) {
                Integer num = (Integer) tag;
                if (num.intValue() != -1) {
                    if (getOrder() < num.intValue()) {
                        viewGroupMo130467T3.addView(view, i);
                        return;
                    }
                }
            }
            viewGroupMo130467T3.addView(view);
            return;
        }
        viewGroupMo130467T3.addView(view);
    }

    /* JADX INFO: renamed from: M3 */
    public abstract String mo110324M3();

    /* JADX INFO: renamed from: N3 */
    public final /* synthetic */ void m110325N3() {
        if (m153101w2() == null || !(m153101w2() instanceof yj2)) {
            return;
        }
        m153101w2().m153097C2(this);
        ((yj2) m153101w2()).mo210883U3(mo110324M3());
    }

    /* JADX INFO: renamed from: O3 */
    public final /* synthetic */ void m110326O3(View view) {
        ViewGroup viewGroupMo130467T3;
        if (view == null || m153101w2() == null || !(m153101w2() instanceof yj2) || (viewGroupMo130467T3 = ((yj2) m153101w2()).mo130467T3()) == null || viewGroupMo130467T3.indexOfChild(view) < 0) {
            return;
        }
        viewGroupMo130467T3.removeView(view);
    }

    /* JADX INFO: renamed from: P3 */
    public void m110327P3() {
        m110329S3(new x20() { // from class: l.bk2
            @Override // p153l.x20
            public final void call() {
                this.f77037a.m110325N3();
            }
        });
    }

    /* JADX INFO: renamed from: R3 */
    public void m110328R3(final View view) {
        m110329S3(new x20() { // from class: l.ak2
            @Override // p153l.x20
            public final void call() {
                this.f71951a.m110326O3(view);
            }
        });
    }

    /* JADX INFO: renamed from: S3 */
    public final void m110329S3(x20 x20Var) {
        if (x20Var == null) {
            return;
        }
        if (Looper.getMainLooper() != Looper.myLooper()) {
            l51.m152893M(new bri0(x20Var));
        } else {
            x20Var.call();
        }
    }

    public int getOrder() {
        return -1;
    }
}
