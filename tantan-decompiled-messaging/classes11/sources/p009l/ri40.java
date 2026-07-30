package p009l;

import com.p000p1.mobile.putong.oms.view.OmsViewPager;
import com.p1.mobile.putong.data.OMSAction;
import com.tantanapp.common.utils.NullChecker;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class ri40 extends zuj0 {
    @Override // p009l.zuj0
    /* JADX INFO: renamed from: c */
    public boolean mo11784c(OMSAction oMSAction) {
        if (NullChecker.a(this.f23916a.f7831e) && NullChecker.a(this.f23916a.f7831e.getAdapter()) && this.f23916a.f7831e.getCurrentItem() < this.f23916a.f7831e.getAdapter().getCount() - 1) {
            OmsViewPager omsViewPager = this.f23916a.f7831e;
            omsViewPager.setCurrentItem(omsViewPager.getCurrentItem() + 1);
        }
        return true;
    }

    @Override // p009l.zuj0
    /* JADX INFO: renamed from: d */
    public String mo11785d() {
        return "dialog/next";
    }
}
