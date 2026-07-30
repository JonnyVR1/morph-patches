package p002l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p000p1.mobile.putong.core.p001ui.purchase.C0190d;
import com.p000p1.mobile.putong.core.p001ui.purchase.CoinPurchaseSheetItemView;
import com.p1.mobile.android.app.Act;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import l.a;
import l.e30;
import l.f30;
import l.m6c0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class od5 extends a<C0190d> {

    /* JADX INFO: renamed from: c */
    public C0190d f16537c;

    /* JADX INFO: renamed from: d */
    public final List<C0190d> f16538d = new ArrayList();

    /* JADX INFO: renamed from: e */
    public final Act f16539e;

    /* JADX INFO: renamed from: f */
    public final f30<C0190d, Boolean> f16540f;

    /* JADX INFO: renamed from: g */
    public final int f16541g;

    public od5(Act act, List<C0190d> list, f30<C0190d, Boolean> f30Var, int i) {
        this.f16539e = act;
        this.f16541g = i;
        m19416y(list);
        this.f16540f = f30Var;
    }

    /* JADX INFO: renamed from: m */
    public View m19412m(ViewGroup viewGroup, int i) {
        return LayoutInflater.from(this.f16539e).inflate(m6c0.f3, viewGroup, false);
    }

    /* JADX INFO: renamed from: p */
    public List<C0190d> m19413p() {
        return this.f16538d;
    }

    /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
    public void m19411j(View view, C0190d c0190d, int i, int i2) {
        if (c0190d.m4096l()) {
            this.f16537c = c0190d;
        }
        ((CoinPurchaseSheetItemView) view).m3665d(c0190d, i2, new e30() { // from class: l.nd5
            public final void call(Object obj) {
                this.f15958a.m19415w((C0190d) obj);
            }
        });
        if (NullChecker.a(this.f16537c)) {
            this.f16540f.call(this.f16537c, Boolean.TRUE);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: w */
    public final /* synthetic */ void m19415w(C0190d c0190d) {
        if (NullChecker.a(this.f16537c)) {
            this.f16537c.m4106v(false);
        }
        this.f16537c = c0190d;
        c0190d.m4106v(true);
        this.f16540f.call(this.f16537c, Boolean.FALSE);
        notifyDataSetChanged();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: y */
    public void m19416y(List<C0190d> list) {
        this.f16538d.clear();
        this.f16538d.addAll(list);
        notifyDataSetChanged();
    }
}
