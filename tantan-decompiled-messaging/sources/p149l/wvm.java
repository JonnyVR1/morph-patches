package p149l;

import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.p053ui.purchase.C8765d;
import com.p046p1.mobile.putong.core.p053ui.purchase.intlInstantChat.InstantMatchPurchaseSheetItemView;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class wvm extends dac0<C8765d> {

    /* JADX INFO: renamed from: c */
    public C8765d f188265c;

    /* JADX INFO: renamed from: e */
    public final Act f188267e;

    /* JADX INFO: renamed from: f */
    public final f30<C8765d, Boolean> f188268f;

    /* JADX INFO: renamed from: d */
    public final List<C8765d> f188266d = new ArrayList();

    /* JADX INFO: renamed from: g */
    public int f188269g = -1;

    /* JADX INFO: renamed from: h */
    public int f188270h = -1;

    public wvm(Act act, List<C8765d> list, f30<C8765d, Boolean> f30Var) {
        m205753I(list);
        this.f188267e = act;
        this.f188268f = f30Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: H */
    public /* synthetic */ void m205750H(C8765d c8765d) {
        if (NullChecker.m81303a(this.f188265c)) {
            this.f188265c.m53540v(false);
        }
        this.f188265c = c8765d;
        c8765d.m53540v(true);
        notifyDataSetChanged();
    }

    @Override // p149l.dac0
    /* JADX INFO: renamed from: C */
    public int getPageCount() {
        return this.f188266d.size();
    }

    @Override // p149l.dac0
    /* JADX INFO: renamed from: D */
    public View mo28825D(ViewGroup viewGroup, int i) {
        return this.f188267e.inflater().inflate(m6c0.f131661x, viewGroup, false);
    }

    @Override // p149l.dac0
    /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
    public void mo28823A(View view, C8765d c8765d, int i, int i2) {
        if (c8765d.m53530l()) {
            this.f188265c = c8765d;
            if (this.f188269g == -1) {
                this.f188269g = i2;
            }
        }
        if (this.f188270h == -1) {
            this.f188270h = getPageCount() - 1;
        }
        ((InstantMatchPurchaseSheetItemView) view).m53713c(c8765d, i2, new e30() { // from class: l.vvm
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f183241a.m205750H((C8765d) obj);
            }
        }, this.f188269g, this.f188270h);
        if (NullChecker.m81303a(this.f188265c)) {
            this.f188268f.call(this.f188265c, Boolean.TRUE);
        }
    }

    @Override // p149l.dac0
    /* JADX INFO: renamed from: G, reason: merged with bridge method [inline-methods] */
    public C8765d getItem(int i) {
        return this.f188266d.get(i);
    }

    /* JADX INFO: renamed from: I */
    public void m205753I(List<C8765d> list) {
        this.f188266d.clear();
        this.f188266d.addAll(list);
        notifyDataSetChanged();
    }
}
