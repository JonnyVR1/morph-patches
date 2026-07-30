package p002l;

import com.p000p1.mobile.putong.core.p001ui.profile.profilelist.imp.ProfileListFragExpandedImpl;
import com.p1.mobile.putong.core.data.SwipeDirection;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class eh90 implements dh90 {

    /* JADX INFO: renamed from: a */
    public ProfileListFragExpandedImpl f9789a;

    public eh90(ProfileListFragExpandedImpl profileListFragExpandedImpl) {
        this.f9789a = profileListFragExpandedImpl;
    }

    @Override // p002l.dh90
    /* JADX INFO: renamed from: a */
    public void mo11883a(SwipeDirection swipeDirection) {
        this.f9789a.m2950V4().m11504n1(swipeDirection.getValue());
    }

    @Override // p002l.dh90
    /* JADX INFO: renamed from: b */
    public void mo11884b(SwipeDirection swipeDirection) {
        this.f9789a.m2950V4().m11512r1(swipeDirection == SwipeDirection.UP);
    }

    @Override // p002l.dh90
    /* JADX INFO: renamed from: c */
    public void mo11885c(boolean z) {
        this.f9789a.m2954Z4().m17528L(z);
    }

    @Override // p002l.dh90
    /* JADX INFO: renamed from: d */
    public void mo11886d(boolean z) {
        this.f9789a.f1714F = z;
    }
}
