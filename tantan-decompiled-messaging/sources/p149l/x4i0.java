package p149l;

import com.p046p1.mobile.putong.core.p053ui.messages.recycler.opt.AbstractC8579b;
import com.p046p1.mobile.putong.core.p053ui.messages.recycler.opt.AbstractC8580c;
import com.p046p1.mobile.putong.core.p053ui.messages.recycler.opt.AbstractRunnableC8581d;
import com.p046p1.mobile.putong.core.p053ui.messages.recycler.opt.TantanListView;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class x4i0 extends AbstractC8579b {

    /* JADX INFO: renamed from: v */
    public boolean f191036v = false;

    @Override // com.p046p1.mobile.putong.core.p053ui.messages.recycler.opt.AbstractC8578a
    /* JADX INFO: renamed from: A */
    public boolean mo49645A() {
        boolean zMo49645A = super.mo49645A();
        int renderContentHeight = this.f32224k.getRenderContentHeight();
        int realWidth = this.f32224k.getRealWidth();
        if (NullChecker.m81303a(this.f32225l.f118272p) && this.f32225l.f118267k < this.f32221h.mo108013m() - 1 && !this.f32222i.isEmpty()) {
            ArrayList arrayList = new ArrayList();
            List<hjc0> list = this.f32222i;
            hjc0 hjc0Var = list.get(list.size() - 1);
            int i = hjc0Var.f108060a + hjc0Var.f108062c;
            int i2 = 0;
            for (int iMo108013m = this.f32221h.mo108013m() - 1; i2 < renderContentHeight && iMo108013m > this.f32225l.f118267k && iMo108013m > hjc0Var.f108065f; iMo108013m--) {
                hjc0 hjc0VarM49648D = m49648D(iMo108013m, realWidth, renderContentHeight);
                hjc0VarM49648D.f108065f = iMo108013m;
                arrayList.add(0, hjc0VarM49648D);
                i2 += hjc0VarM49648D.f108062c;
            }
            if (!arrayList.isEmpty()) {
                xmr.m210146b("TantanListView", "额外补充数据" + arrayList.size());
                for (int i3 = 0; i3 < arrayList.size(); i3++) {
                    hjc0 hjc0Var2 = (hjc0) arrayList.get(i3);
                    hjc0Var2.f108061b = 0;
                    hjc0Var2.f108060a = i;
                    i += hjc0Var2.f108062c;
                    int i4 = hjc0Var2.f108067h;
                    if (i4 == 1) {
                        this.f32224k.addView(hjc0Var2.f108066g.f194078a);
                    } else if (i4 == 2) {
                        TantanListView tantanListView = this.f32224k;
                        tantanListView.attachViewToParent(hjc0Var2.f108066g.f194078a, tantanListView.getChildCount(), hjc0Var2.f108066g.f194078a.getLayoutParams());
                    }
                    hjc0Var2.f108067h = 3;
                    this.f32222i.add(hjc0Var2);
                }
                return true;
            }
            int i5 = this.f32225l.f118267k;
            this.f32221h.mo108013m();
        }
        return zMo49645A;
    }

    /* JADX INFO: renamed from: E0 */
    public void m206983E0(boolean z) {
        if (this.f32221h == null) {
            return;
        }
        if (!z) {
            xmr.m210146b("TantanListView", "onMeasure 变化位置 = " + m49721l());
            m49660P();
            return;
        }
        m49722m(AbstractRunnableC8581d.f32238f);
        xmr.m210146b("TantanListView", "onMeasure 清空notify size = " + m49721l());
        m49662R(null, "onMeasure");
    }

    /* JADX INFO: renamed from: F0 */
    public int m206984F0() {
        List<hjc0> list = this.f32222i;
        if (list == null || list.size() <= 0) {
            return 0;
        }
        List<hjc0> list2 = this.f32222i;
        hjc0 hjc0Var = list2.get(list2.size() - 1);
        int i = hjc0Var.f108060a + hjc0Var.f108062c + this.f32230q;
        return i >= this.f32224k.getRealHeight() ? this.f32224k.getRealHeight() : i;
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.messages.recycler.opt.AbstractC8578a
    /* JADX INFO: renamed from: U */
    public void mo49665U() {
        super.mo49665U();
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.messages.recycler.opt.AbstractRunnableC8581d
    /* JADX INFO: renamed from: g */
    public boolean mo49717g() {
        if (this.f32224k.m49634q()) {
            return false;
        }
        return super.mo49717g();
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.messages.recycler.opt.AbstractC8579b, com.p046p1.mobile.putong.core.p053ui.messages.recycler.opt.AbstractC8578a, com.p046p1.mobile.putong.core.p053ui.messages.recycler.opt.AbstractRunnableC8581d
    /* JADX INFO: renamed from: j */
    public void mo49679j(AbstractC8580c abstractC8580c) {
        super.mo49679j(abstractC8580c);
    }
}
