package p007l;

import android.view.View;
import com.p000p1.mobile.putong.data.User;
import com.p000p1.mobile.putong.feed.newui.view.FeedUserSexAndAgeView;
import l.t100;
import l.xdl0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class e8i implements k8i<FeedUserSexAndAgeView> {
    @Override // p007l.k8i
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void mo8460a(FeedUserSexAndAgeView feedUserSexAndAgeView, User user) {
        xdl0.C0(feedUserSexAndAgeView.f4890a, t100.d(15.0f));
        if (ijb0.m10935v(user)) {
            xdl0.h0(feedUserSexAndAgeView.f4890a, 0);
            xdl0.D0(t100.d(15.0f), new View[]{feedUserSexAndAgeView.f4890a});
        } else {
            feedUserSexAndAgeView.f4892c.setTextSize(9.0f);
            xdl0.d0(feedUserSexAndAgeView.f4890a, t100.d(2.0f));
            xdl0.e0(feedUserSexAndAgeView.f4890a, t100.d(5.0f));
        }
        xdl0.X(feedUserSexAndAgeView.f4892c, t100.d(0.5f));
        xdl0.V(feedUserSexAndAgeView.f4892c, t100.d(1.5f));
    }
}
