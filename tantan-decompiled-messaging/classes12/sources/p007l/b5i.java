package p007l;

import androidx.viewpager.widget.ViewPager;
import com.p000p1.mobile.putong.feed.newui.group.groupdetail.module.FeedGroupTab;
import java.util.List;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class b5i implements zih {

    /* JADX INFO: renamed from: a */
    public FeedGroupTab f6112a;

    public b5i(FeedGroupTab feedGroupTab) {
        this.f6112a = feedGroupTab;
    }

    @Override // p007l.zih
    /* JADX INFO: renamed from: a */
    public void mo8640a(List<z5h> list, ViewPager viewPager) {
        m8641b(list, viewPager);
    }

    /* JADX INFO: renamed from: b */
    public void m8641b(List<z5h> list, ViewPager viewPager) {
        if (this.f6112a == null || list == null) {
            return;
        }
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).mo8422e() == this.f6112a) {
                viewPager.setCurrentItem(i);
                return;
            }
        }
    }
}
