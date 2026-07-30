package p153l;

import com.p051p1.mobile.putong.core.p058ui.messages.recycler.opt.AbstractC8742b;
import com.p051p1.mobile.putong.core.p058ui.messages.recycler.opt.AbstractC8743c;
import com.p051p1.mobile.putong.core.p058ui.messages.recycler.opt.AbstractRunnableC8744d;
import com.p051p1.mobile.putong.core.p058ui.messages.recycler.opt.TantanListView;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class idi0 extends AbstractC8742b {

    /* JADX INFO: renamed from: v */
    public boolean f114505v = false;

    @Override // com.p051p1.mobile.putong.core.p058ui.messages.recycler.opt.AbstractC8741a
    /* JADX INFO: renamed from: A */
    public boolean mo50828A() {
        boolean zMo50828A = super.mo50828A();
        int renderContentHeight = this.f33072k.getRenderContentHeight();
        int realWidth = this.f33072k.getRealWidth();
        if (NullChecker.m82486a(this.f33073l.f159102p) && this.f33073l.f159097k < this.f33069h.mo118497m() - 1 && !this.f33070i.isEmpty()) {
            ArrayList arrayList = new ArrayList();
            List<orc0> list = this.f33070i;
            orc0 orc0Var = list.get(list.size() - 1);
            int i = orc0Var.f148688a + orc0Var.f148690c;
            int i2 = 0;
            for (int iMo118497m = this.f33069h.mo118497m() - 1; i2 < renderContentHeight && iMo118497m > this.f33073l.f159097k && iMo118497m > orc0Var.f148693f; iMo118497m--) {
                orc0 orc0VarM50831D = m50831D(iMo118497m, realWidth, renderContentHeight);
                orc0VarM50831D.f148693f = iMo118497m;
                arrayList.add(0, orc0VarM50831D);
                i2 += orc0VarM50831D.f148690c;
            }
            if (!arrayList.isEmpty()) {
                yor.m216991b("TantanListView", "额外补充数据" + arrayList.size());
                for (int i3 = 0; i3 < arrayList.size(); i3++) {
                    orc0 orc0Var2 = (orc0) arrayList.get(i3);
                    orc0Var2.f148689b = 0;
                    orc0Var2.f148688a = i;
                    i += orc0Var2.f148690c;
                    int i4 = orc0Var2.f148695h;
                    if (i4 == 1) {
                        this.f33072k.addView(orc0Var2.f148694g.f143454a);
                    } else if (i4 == 2) {
                        TantanListView tantanListView = this.f33072k;
                        tantanListView.attachViewToParent(orc0Var2.f148694g.f143454a, tantanListView.getChildCount(), orc0Var2.f148694g.f143454a.getLayoutParams());
                    }
                    orc0Var2.f148695h = 3;
                    this.f33070i.add(orc0Var2);
                }
                return true;
            }
            int i5 = this.f33073l.f159097k;
            this.f33069h.mo118497m();
        }
        return zMo50828A;
    }

    /* JADX INFO: renamed from: E0 */
    public void m139535E0(boolean z) {
        if (this.f33069h == null) {
            return;
        }
        if (!z) {
            yor.m216991b("TantanListView", "onMeasure 变化位置 = " + m50904l());
            m50843P();
            return;
        }
        m50905m(AbstractRunnableC8744d.f33086f);
        yor.m216991b("TantanListView", "onMeasure 清空notify size = " + m50904l());
        m50845R(null, "onMeasure");
    }

    /* JADX INFO: renamed from: F0 */
    public int m139536F0() {
        List<orc0> list = this.f33070i;
        if (list == null || list.size() <= 0) {
            return 0;
        }
        List<orc0> list2 = this.f33070i;
        orc0 orc0Var = list2.get(list2.size() - 1);
        int i = orc0Var.f148688a + orc0Var.f148690c + this.f33078q;
        return i >= this.f33072k.getRealHeight() ? this.f33072k.getRealHeight() : i;
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.messages.recycler.opt.AbstractC8741a
    /* JADX INFO: renamed from: U */
    public void mo50848U() {
        super.mo50848U();
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.messages.recycler.opt.AbstractRunnableC8744d
    /* JADX INFO: renamed from: g */
    public boolean mo50900g() {
        if (this.f33072k.m50817q()) {
            return false;
        }
        return super.mo50900g();
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.messages.recycler.opt.AbstractC8742b, com.p051p1.mobile.putong.core.p058ui.messages.recycler.opt.AbstractC8741a, com.p051p1.mobile.putong.core.p058ui.messages.recycler.opt.AbstractRunnableC8744d
    /* JADX INFO: renamed from: j */
    public void mo50862j(AbstractC8743c abstractC8743c) {
        super.mo50862j(abstractC8743c);
    }
}
