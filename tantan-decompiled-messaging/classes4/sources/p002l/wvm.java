package p002l;

import android.view.View;
import android.view.ViewGroup;
import com.p000p1.mobile.putong.core.p001ui.purchase.C0190d;
import com.p000p1.mobile.putong.core.p001ui.purchase.intlInstantChat.InstantMatchPurchaseSheetItemView;
import com.p1.mobile.android.app.Act;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import l.dac0;
import l.e30;
import l.f30;
import l.m6c0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class wvm extends dac0<C0190d> {

    /* JADX INFO: renamed from: c */
    public C0190d f22002c;

    /* JADX INFO: renamed from: e */
    public final Act f22004e;

    /* JADX INFO: renamed from: f */
    public final f30<C0190d, Boolean> f22005f;

    /* JADX INFO: renamed from: d */
    public final List<C0190d> f22003d = new ArrayList();

    /* JADX INFO: renamed from: g */
    public int f22006g = -1;

    /* JADX INFO: renamed from: h */
    public int f22007h = -1;

    public wvm(Act act, List<C0190d> list, f30<C0190d, Boolean> f30Var) {
        m25514I(list);
        this.f22004e = act;
        this.f22005f = f30Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: H */
    public /* synthetic */ void m25508H(C0190d c0190d) {
        if (NullChecker.a(this.f22002c)) {
            this.f22002c.m4106v(false);
        }
        this.f22002c = c0190d;
        c0190d.m4106v(true);
        notifyDataSetChanged();
    }

    /* JADX INFO: renamed from: C */
    public int m25510C() {
        return this.f22003d.size();
    }

    /* JADX INFO: renamed from: D */
    public View m25511D(ViewGroup viewGroup, int i) {
        return this.f22004e.inflater().inflate(m6c0.x, viewGroup, false);
    }

    /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
    public void m25509A(View view, C0190d c0190d, int i, int i2) {
        if (c0190d.m4096l()) {
            this.f22002c = c0190d;
            if (this.f22006g == -1) {
                this.f22006g = i2;
            }
        }
        if (this.f22007h == -1) {
            this.f22007h = m25510C() - 1;
        }
        ((InstantMatchPurchaseSheetItemView) view).m4279c(c0190d, i2, new e30() { // from class: l.vvm
            public final void call(Object obj) {
                this.f21347a.m25508H((C0190d) obj);
            }
        }, this.f22006g, this.f22007h);
        if (NullChecker.a(this.f22002c)) {
            this.f22005f.call(this.f22002c, Boolean.TRUE);
        }
    }

    /* JADX INFO: renamed from: G, reason: merged with bridge method [inline-methods] */
    public C0190d getItem(int i) {
        return this.f22003d.get(i);
    }

    /* JADX INFO: renamed from: I */
    public void m25514I(List<C0190d> list) {
        this.f22003d.clear();
        this.f22003d.addAll(list);
        notifyDataSetChanged();
    }
}
