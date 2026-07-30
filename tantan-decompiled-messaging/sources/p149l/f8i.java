package p149l;

import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.feed.newui.view.FeedUserSexAndAgeView;
import p147v.VLinear;

/* JADX INFO: loaded from: classes12.dex */
public class f8i implements k8i<FeedUserSexAndAgeView> {
    @Override // p149l.k8i
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void mo95347a(FeedUserSexAndAgeView feedUserSexAndAgeView, User user) {
        xdl0.m208325C0(feedUserSexAndAgeView.f43429a, t100.m186890d(20.0f));
        boolean zM136582v = ijb0.m136582v(user);
        VLinear vLinear = feedUserSexAndAgeView.f43429a;
        if (zM136582v) {
            xdl0.m208378h0(vLinear, 0);
            xdl0.m208327D0(t100.m186890d(20.0f), feedUserSexAndAgeView.f43429a);
        } else {
            xdl0.m208370d0(vLinear, t100.m186890d(5.0f));
            xdl0.m208372e0(feedUserSexAndAgeView.f43429a, t100.m186890d(6.0f));
        }
        xdl0.m208358V(feedUserSexAndAgeView.f43429a, t100.m186890d(4.0f));
    }
}
