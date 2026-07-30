package p153l;

import com.p051p1.mobile.putong.data.OMSAction;
import com.p051p1.mobile.putong.oms.view.OmsViewPager;
import com.tantanapp.common.utils.NullChecker;

/* JADX INFO: loaded from: classes11.dex */
public class fr40 extends c4k0 {
    @Override // p153l.c4k0
    /* JADX INFO: renamed from: c */
    public boolean mo106291c(OMSAction oMSAction) {
        if (NullChecker.m82486a(this.f79710a.f55073e) && NullChecker.m82486a(this.f79710a.f55073e.getAdapter()) && this.f79710a.f55073e.getCurrentItem() < this.f79710a.f55073e.getAdapter().getCount() - 1) {
            OmsViewPager omsViewPager = this.f79710a.f55073e;
            omsViewPager.setCurrentItem(omsViewPager.getCurrentItem() + 1);
        }
        return true;
    }

    @Override // p153l.c4k0
    /* JADX INFO: renamed from: d */
    public String mo106292d() {
        return "dialog/next";
    }
}
