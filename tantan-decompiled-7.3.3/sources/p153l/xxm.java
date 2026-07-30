package p153l;

import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.p058ui.purchase.C8928d;
import com.p051p1.mobile.putong.core.p058ui.purchase.intlInstantChat.InstantMatchPurchaseSheetItemView;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class xxm extends jic0<C8928d> {

    /* JADX INFO: renamed from: c */
    public C8928d f196660c;

    /* JADX INFO: renamed from: e */
    public final Act f196662e;

    /* JADX INFO: renamed from: f */
    public final z20<C8928d, Boolean> f196663f;

    /* JADX INFO: renamed from: d */
    public final List<C8928d> f196661d = new ArrayList();

    /* JADX INFO: renamed from: g */
    public int f196664g = -1;

    /* JADX INFO: renamed from: h */
    public int f196665h = -1;

    public xxm(Act act, List<C8928d> list, z20<C8928d, Boolean> z20Var) {
        m213554I(list);
        this.f196662e = act;
        this.f196663f = z20Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: H */
    public /* synthetic */ void m213551H(C8928d c8928d) {
        if (NullChecker.m82486a(this.f196660c)) {
            this.f196660c.m54723v(false);
        }
        this.f196660c = c8928d;
        c8928d.m54723v(true);
        notifyDataSetChanged();
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: C */
    public int getPageCount() {
        return this.f196661d.size();
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: D */
    public View mo29824D(ViewGroup viewGroup, int i) {
        return this.f196662e.inflater().inflate(rec0.f162621x, viewGroup, false);
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
    public void mo29822A(View view, C8928d c8928d, int i, int i2) {
        if (c8928d.m54713l()) {
            this.f196660c = c8928d;
            if (this.f196664g == -1) {
                this.f196664g = i2;
            }
        }
        if (this.f196665h == -1) {
            this.f196665h = getPageCount() - 1;
        }
        ((InstantMatchPurchaseSheetItemView) view).m54896c(c8928d, i2, new y20() { // from class: l.wxm
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f191502a.m213551H((C8928d) obj);
            }
        }, this.f196664g, this.f196665h);
        if (NullChecker.m82486a(this.f196660c)) {
            this.f196663f.call(this.f196660c, Boolean.TRUE);
        }
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: G, reason: merged with bridge method [inline-methods] */
    public C8928d getItem(int i) {
        return this.f196661d.get(i);
    }

    /* JADX INFO: renamed from: I */
    public void m213554I(List<C8928d> list) {
        this.f196661d.clear();
        this.f196661d.addAll(list);
        notifyDataSetChanged();
    }
}
