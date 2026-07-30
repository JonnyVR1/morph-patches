package p149l;

import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.feed.newui.view.FeedUserSexAndAgeView;

/* JADX INFO: loaded from: classes12.dex */
public class d8i implements k8i<FeedUserSexAndAgeView> {
    @Override // p149l.k8i
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void mo95347a(FeedUserSexAndAgeView feedUserSexAndAgeView, User user) {
        xdl0.m208344M(feedUserSexAndAgeView, nkg.m159874d());
        xdl0.m208325C0(feedUserSexAndAgeView.f43429a, t100.m186890d(14.0f));
        if (ijb0.m136582v(user)) {
            xdl0.m208378h0(feedUserSexAndAgeView.f43429a, 0);
            xdl0.m208327D0(t100.m186890d(14.0f), feedUserSexAndAgeView.f43429a);
        } else {
            feedUserSexAndAgeView.f43431c.setTextSize(9.0f);
            xdl0.m208370d0(feedUserSexAndAgeView.f43429a, t100.m186890d(2.0f));
            xdl0.m208372e0(feedUserSexAndAgeView.f43429a, t100.m186890d(5.0f));
        }
        xdl0.m208360X(feedUserSexAndAgeView.f43431c, t100.m186890d(0.5f));
        xdl0.m208358V(feedUserSexAndAgeView.f43431c, t100.m186890d(1.5f));
    }
}
