package p002l;

import com.p000p1.mobile.putong.core.p001ui.profile.profilelist.imp.ProfileListFragLocalImpl;
import com.p1.mobile.putong.core.data.SwipeDirection;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class fh90 implements dh90 {

    /* JADX INFO: renamed from: a */
    public ProfileListFragLocalImpl f10353a;

    public fh90(ProfileListFragLocalImpl profileListFragLocalImpl) {
        this.f10353a = profileListFragLocalImpl;
    }

    @Override // p002l.dh90
    /* JADX INFO: renamed from: a */
    public void mo11883a(SwipeDirection swipeDirection) {
        this.f10353a.m3217c5().m26589E1(swipeDirection.getValue());
    }

    @Override // p002l.dh90
    /* JADX INFO: renamed from: b */
    public void mo11884b(SwipeDirection swipeDirection) {
        this.f10353a.m3217c5().m26595J1(swipeDirection == SwipeDirection.UP);
    }

    @Override // p002l.dh90
    /* JADX INFO: renamed from: c */
    public void mo11885c(boolean z) {
        this.f10353a.m3223g5().m12395S0(z);
    }

    @Override // p002l.dh90
    /* JADX INFO: renamed from: d */
    public void mo11886d(boolean z) {
        this.f10353a.f1799D = z;
    }
}
