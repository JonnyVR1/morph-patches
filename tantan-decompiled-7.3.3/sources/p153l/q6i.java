package p153l;

import androidx.viewpager.widget.ViewPager;
import com.p051p1.mobile.putong.feed.newui.group.groupdetail.module.FeedGroupTab;
import java.util.List;

/* JADX INFO: loaded from: classes13.dex */
public class q6i implements okh {

    /* JADX INFO: renamed from: a */
    public FeedGroupTab f155816a;

    public q6i(FeedGroupTab feedGroupTab) {
        this.f155816a = feedGroupTab;
    }

    @Override // p153l.okh
    /* JADX INFO: renamed from: a */
    public void mo168009a(List<o7h> list, ViewPager viewPager) {
        m175594b(list, viewPager);
    }

    /* JADX INFO: renamed from: b */
    public void m175594b(List<o7h> list, ViewPager viewPager) {
        if (this.f155816a == null || list == null) {
            return;
        }
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).mo108365e() == this.f155816a) {
                viewPager.setCurrentItem(i);
                return;
            }
        }
    }
}
