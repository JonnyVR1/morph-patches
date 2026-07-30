package p002l;

import android.view.View;
import android.view.ViewGroup;
import com.p000p1.mobile.putong.core.p001ui.purchase.C0190d;
import com.p000p1.mobile.putong.core.p001ui.purchase.IntlCoinPurchaseSheetItemView;
import com.p1.mobile.android.app.Act;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import l.dac0;
import l.e30;
import l.f30;
import l.m6c0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class y5n extends dac0<C0190d> {

    /* JADX INFO: renamed from: c */
    public C0190d f22671c;

    /* JADX INFO: renamed from: e */
    public final Act f22673e;

    /* JADX INFO: renamed from: f */
    public final f30<C0190d, Boolean> f22674f;

    /* JADX INFO: renamed from: d */
    public final List<C0190d> f22672d = new ArrayList();

    /* JADX INFO: renamed from: g */
    public int f22675g = -1;

    public y5n(Act act, List<C0190d> list, f30<C0190d, Boolean> f30Var) {
        m26362I(list);
        this.f22673e = act;
        this.f22674f = f30Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: H */
    public /* synthetic */ void m26356H(C0190d c0190d) {
        if (NullChecker.a(this.f22671c)) {
            this.f22671c.m4106v(false);
        }
        this.f22671c = c0190d;
        c0190d.m4106v(true);
        notifyDataSetChanged();
    }

    /* JADX INFO: renamed from: C */
    public int m26358C() {
        return this.f22672d.size();
    }

    /* JADX INFO: renamed from: D */
    public View m26359D(ViewGroup viewGroup, int i) {
        return this.f22673e.inflater().inflate(m6c0.q, viewGroup, false);
    }

    /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
    public void m26357A(View view, C0190d c0190d, int i, int i2) {
        if (c0190d.m4096l()) {
            this.f22671c = c0190d;
            if (this.f22675g == -1) {
                this.f22675g = i2;
            }
        }
        ((IntlCoinPurchaseSheetItemView) view).m3669c(c0190d, i2, new e30() { // from class: l.x5n
            public final void call(Object obj) {
                this.f22130a.m26356H((C0190d) obj);
            }
        }, this.f22675g);
        if (NullChecker.a(this.f22671c)) {
            this.f22674f.call(this.f22671c, Boolean.TRUE);
        }
    }

    /* JADX INFO: renamed from: G, reason: merged with bridge method [inline-methods] */
    public C0190d getItem(int i) {
        return this.f22672d.get(i);
    }

    /* JADX INFO: renamed from: I */
    public void m26362I(List<C0190d> list) {
        this.f22672d.clear();
        this.f22672d.addAll(list);
        notifyDataSetChanged();
    }
}
