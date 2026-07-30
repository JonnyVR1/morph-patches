package p149l;

import com.p046p1.mobile.putong.data.OMSAction;
import com.p046p1.mobile.putong.oms.view.OmsViewPager;
import com.tantanapp.common.utils.NullChecker;

/* JADX INFO: loaded from: classes11.dex */
public class ri40 extends zuj0 {
    @Override // p149l.zuj0
    /* JADX INFO: renamed from: c */
    public boolean mo99645c(OMSAction oMSAction) {
        if (NullChecker.m81303a(this.f204856a.f54225e) && NullChecker.m81303a(this.f204856a.f54225e.getAdapter()) && this.f204856a.f54225e.getCurrentItem() < this.f204856a.f54225e.getAdapter().getCount() - 1) {
            OmsViewPager omsViewPager = this.f204856a.f54225e;
            omsViewPager.setCurrentItem(omsViewPager.getCurrentItem() + 1);
        }
        return true;
    }

    @Override // p149l.zuj0
    /* JADX INFO: renamed from: d */
    public String mo99646d() {
        return "dialog/next";
    }
}
