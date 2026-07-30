package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.p053ui.purchase.C8765d;
import com.p046p1.mobile.putong.core.p053ui.purchase.CoinPurchaseSheetItemView;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class od5 extends AbstractC15503a<C8765d> {

    /* JADX INFO: renamed from: c */
    public C8765d f143172c;

    /* JADX INFO: renamed from: d */
    public final List<C8765d> f143173d = new ArrayList();

    /* JADX INFO: renamed from: e */
    public final Act f143174e;

    /* JADX INFO: renamed from: f */
    public final f30<C8765d, Boolean> f143175f;

    /* JADX INFO: renamed from: g */
    public final int f143176g;

    public od5(Act act, List<C8765d> list, f30<C8765d, Boolean> f30Var, int i) {
        this.f143174e = act;
        this.f143176g = i;
        m163650y(list);
        this.f143175f = f30Var;
    }

    @Override // p149l.wp1
    /* JADX INFO: renamed from: m */
    public View mo20403m(ViewGroup viewGroup, int i) {
        return LayoutInflater.from(this.f143174e).inflate(m6c0.f131590f3, viewGroup, false);
    }

    @Override // p149l.AbstractC15503a
    /* JADX INFO: renamed from: p */
    public List<C8765d> mo20404p() {
        return this.f143173d;
    }

    @Override // p149l.wp1
    /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
    public void mo20402j(View view, C8765d c8765d, int i, int i2) {
        if (c8765d.m53530l()) {
            this.f143172c = c8765d;
        }
        ((CoinPurchaseSheetItemView) view).m53099d(c8765d, i2, new e30() { // from class: l.nd5
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f138265a.m163649w((C8765d) obj);
            }
        });
        if (NullChecker.m81303a(this.f143172c)) {
            this.f143175f.call(this.f143172c, Boolean.TRUE);
        }
    }

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ void m163649w(C8765d c8765d) {
        if (NullChecker.m81303a(this.f143172c)) {
            this.f143172c.m53540v(false);
        }
        this.f143172c = c8765d;
        c8765d.m53540v(true);
        this.f143175f.call(this.f143172c, Boolean.FALSE);
        notifyDataSetChanged();
    }

    /* JADX INFO: renamed from: y */
    public void m163650y(List<C8765d> list) {
        this.f143173d.clear();
        this.f143173d.addAll(list);
        notifyDataSetChanged();
    }
}
