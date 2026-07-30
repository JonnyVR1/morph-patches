package p002l;

import com.p000p1.mobile.putong.core.p001ui.messages.recycler.opt.AbstractC0004b;
import com.p000p1.mobile.putong.core.p001ui.messages.recycler.opt.AbstractC0005c;
import com.p000p1.mobile.putong.core.p001ui.messages.recycler.opt.AbstractRunnableC0006d;
import com.p000p1.mobile.putong.core.p001ui.messages.recycler.opt.TantanListView;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class x4i0 extends AbstractC0004b {

    /* JADX INFO: renamed from: v */
    public boolean f22113v = false;

    @Override // com.p000p1.mobile.putong.core.p001ui.messages.recycler.opt.AbstractC0003a
    /* JADX INFO: renamed from: A */
    public boolean mo59A() {
        boolean zMo59A = super.mo59A();
        int renderContentHeight = this.f46k.getRenderContentHeight();
        int realWidth = this.f46k.getRealWidth();
        if (NullChecker.a(this.f47l.f13823p) && this.f47l.f13818k < this.f43h.mo11202m() - 1 && !this.f44i.isEmpty()) {
            ArrayList arrayList = new ArrayList();
            List<hjc0> list = this.f44i;
            hjc0 hjc0Var = list.get(list.size() - 1);
            int i = hjc0Var.f12070a + hjc0Var.f12072c;
            int i2 = 0;
            for (int iMo11202m = this.f43h.mo11202m() - 1; i2 < renderContentHeight && iMo11202m > this.f47l.f13818k && iMo11202m > hjc0Var.f12075f; iMo11202m--) {
                hjc0 hjc0VarM62D = m62D(iMo11202m, realWidth, renderContentHeight);
                hjc0VarM62D.f12075f = iMo11202m;
                arrayList.add(0, hjc0VarM62D);
                i2 += hjc0VarM62D.f12072c;
            }
            if (!arrayList.isEmpty()) {
                xmr.m26035b("TantanListView", "额外补充数据" + arrayList.size());
                for (int i3 = 0; i3 < arrayList.size(); i3++) {
                    hjc0 hjc0Var2 = (hjc0) arrayList.get(i3);
                    hjc0Var2.f12071b = 0;
                    hjc0Var2.f12070a = i;
                    i += hjc0Var2.f12072c;
                    int i4 = hjc0Var2.f12077h;
                    if (i4 == 1) {
                        this.f46k.addView(hjc0Var2.f12076g.f22421a);
                    } else if (i4 == 2) {
                        TantanListView tantanListView = this.f46k;
                        tantanListView.attachViewToParent(hjc0Var2.f12076g.f22421a, tantanListView.getChildCount(), hjc0Var2.f12076g.f22421a.getLayoutParams());
                    }
                    hjc0Var2.f12077h = 3;
                    this.f44i.add(hjc0Var2);
                }
                return true;
            }
            int i5 = this.f47l.f13818k;
            this.f43h.mo11202m();
        }
        return zMo59A;
    }

    /* JADX INFO: renamed from: E0 */
    public void m25681E0(boolean z) {
        if (this.f43h == null) {
            return;
        }
        if (!z) {
            xmr.m26035b("TantanListView", "onMeasure 变化位置 = " + m135l());
            m74P();
            return;
        }
        m136m(AbstractRunnableC0006d.f60f);
        xmr.m26035b("TantanListView", "onMeasure 清空notify size = " + m135l());
        m76R(null, "onMeasure");
    }

    /* JADX INFO: renamed from: F0 */
    public int m25682F0() {
        List<hjc0> list = this.f44i;
        if (list == null || list.size() <= 0) {
            return 0;
        }
        List<hjc0> list2 = this.f44i;
        hjc0 hjc0Var = list2.get(list2.size() - 1);
        int i = hjc0Var.f12070a + hjc0Var.f12072c + this.f52q;
        return i >= this.f46k.getRealHeight() ? this.f46k.getRealHeight() : i;
    }

    @Override // com.p000p1.mobile.putong.core.p001ui.messages.recycler.opt.AbstractC0003a
    /* JADX INFO: renamed from: U */
    public void mo79U() {
        super.mo79U();
    }

    @Override // com.p000p1.mobile.putong.core.p001ui.messages.recycler.opt.AbstractRunnableC0006d
    /* JADX INFO: renamed from: g */
    public boolean mo131g() {
        if (this.f46k.m48q()) {
            return false;
        }
        return super.mo131g();
    }

    @Override // com.p000p1.mobile.putong.core.p001ui.messages.recycler.opt.AbstractC0004b, com.p000p1.mobile.putong.core.p001ui.messages.recycler.opt.AbstractC0003a, com.p000p1.mobile.putong.core.p001ui.messages.recycler.opt.AbstractRunnableC0006d
    /* JADX INFO: renamed from: j */
    public void mo93j(AbstractC0005c abstractC0005c) {
        super.mo93j(abstractC0005c);
    }
}
