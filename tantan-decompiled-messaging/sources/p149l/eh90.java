package p149l;

import com.p046p1.mobile.putong.core.data.SwipeDirection;
import com.p046p1.mobile.putong.core.p053ui.profile.profilelist.imp.ProfileListFragExpandedImpl;

/* JADX INFO: loaded from: classes4.dex */
public class eh90 implements dh90 {

    /* JADX INFO: renamed from: a */
    public ProfileListFragExpandedImpl f91311a;

    public eh90(ProfileListFragExpandedImpl profileListFragExpandedImpl) {
        this.f91311a = profileListFragExpandedImpl;
    }

    @Override // p149l.dh90
    /* JADX INFO: renamed from: a */
    public void mo111811a(SwipeDirection swipeDirection) {
        this.f91311a.m52413V4().m109227n1(swipeDirection.getValue());
    }

    @Override // p149l.dh90
    /* JADX INFO: renamed from: b */
    public void mo111812b(SwipeDirection swipeDirection) {
        this.f91311a.m52413V4().m109235r1(swipeDirection == SwipeDirection.UP);
    }

    @Override // p149l.dh90
    /* JADX INFO: renamed from: c */
    public void mo111813c(boolean z) {
        this.f91311a.m52417Z4().m152138L(z);
    }

    @Override // p149l.dh90
    /* JADX INFO: renamed from: d */
    public void mo111814d(boolean z) {
        this.f91311a.f33892F = z;
    }
}
