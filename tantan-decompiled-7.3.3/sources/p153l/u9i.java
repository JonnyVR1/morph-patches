package p153l;

import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.feed.newui.view.FeedUserSexAndAgeView;
import p151v.VLinear;

/* JADX INFO: loaded from: classes13.dex */
public class u9i implements z9i<FeedUserSexAndAgeView> {
    @Override // p153l.z9i
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void mo171362a(FeedUserSexAndAgeView feedUserSexAndAgeView, User user) {
        bnl0.m105505C0(feedUserSexAndAgeView.f44277a, qa00.m175859d(20.0f));
        boolean zM159668v = mrb0.m159668v(user);
        VLinear vLinear = feedUserSexAndAgeView.f44277a;
        if (zM159668v) {
            bnl0.m105558h0(vLinear, 0);
            bnl0.m105507D0(qa00.m175859d(20.0f), feedUserSexAndAgeView.f44277a);
        } else {
            bnl0.m105550d0(vLinear, qa00.m175859d(5.0f));
            bnl0.m105552e0(feedUserSexAndAgeView.f44277a, qa00.m175859d(6.0f));
        }
        bnl0.m105538V(feedUserSexAndAgeView.f44277a, qa00.m175859d(4.0f));
    }
}
