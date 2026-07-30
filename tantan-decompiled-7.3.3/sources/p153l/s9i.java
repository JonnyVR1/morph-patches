package p153l;

import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.feed.newui.view.FeedUserSexAndAgeView;

/* JADX INFO: loaded from: classes13.dex */
public class s9i implements z9i<FeedUserSexAndAgeView> {
    @Override // p153l.z9i
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void mo171362a(FeedUserSexAndAgeView feedUserSexAndAgeView, User user) {
        bnl0.m105524M(feedUserSexAndAgeView, cmg.m111203d());
        bnl0.m105505C0(feedUserSexAndAgeView.f44277a, qa00.m175859d(14.0f));
        if (mrb0.m159668v(user)) {
            bnl0.m105558h0(feedUserSexAndAgeView.f44277a, 0);
            bnl0.m105507D0(qa00.m175859d(14.0f), feedUserSexAndAgeView.f44277a);
        } else {
            feedUserSexAndAgeView.f44279c.setTextSize(9.0f);
            bnl0.m105550d0(feedUserSexAndAgeView.f44277a, qa00.m175859d(2.0f));
            bnl0.m105552e0(feedUserSexAndAgeView.f44277a, qa00.m175859d(5.0f));
        }
        bnl0.m105540X(feedUserSexAndAgeView.f44279c, qa00.m175859d(0.5f));
        bnl0.m105538V(feedUserSexAndAgeView.f44279c, qa00.m175859d(1.5f));
    }
}
