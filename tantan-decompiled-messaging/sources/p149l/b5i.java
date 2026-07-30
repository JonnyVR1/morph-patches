package p149l;

import androidx.viewpager.widget.ViewPager;
import com.p046p1.mobile.putong.feed.newui.group.groupdetail.module.FeedGroupTab;
import java.util.List;

/* JADX INFO: loaded from: classes12.dex */
public class b5i implements zih {

    /* JADX INFO: renamed from: a */
    public FeedGroupTab f73664a;

    public b5i(FeedGroupTab feedGroupTab) {
        this.f73664a = feedGroupTab;
    }

    @Override // p149l.zih
    /* JADX INFO: renamed from: a */
    public void mo100336a(List<z5h> list, ViewPager viewPager) {
        m100337b(list, viewPager);
    }

    /* JADX INFO: renamed from: b */
    public void m100337b(List<z5h> list, ViewPager viewPager) {
        if (this.f73664a == null || list == null) {
            return;
        }
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).mo95139e() == this.f73664a) {
                viewPager.setCurrentItem(i);
                return;
            }
        }
    }
}
