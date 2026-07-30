package p149l;

import com.p046p1.mobile.putong.core.data.SwipeDirection;
import com.p046p1.mobile.putong.core.p053ui.profile.profilelist.imp.ProfileListFragLocalImpl;

/* JADX INFO: loaded from: classes4.dex */
public class fh90 implements dh90 {

    /* JADX INFO: renamed from: a */
    public ProfileListFragLocalImpl f97490a;

    public fh90(ProfileListFragLocalImpl profileListFragLocalImpl) {
        this.f97490a = profileListFragLocalImpl;
    }

    @Override // p149l.dh90
    /* JADX INFO: renamed from: a */
    public void mo111811a(SwipeDirection swipeDirection) {
        this.f97490a.m52669c5().m214089E1(swipeDirection.getValue());
    }

    @Override // p149l.dh90
    /* JADX INFO: renamed from: b */
    public void mo111812b(SwipeDirection swipeDirection) {
        this.f97490a.m52669c5().m214095J1(swipeDirection == SwipeDirection.UP);
    }

    @Override // p149l.dh90
    /* JADX INFO: renamed from: c */
    public void mo111813c(boolean z) {
        this.f97490a.m52673g5().m115927S0(z);
    }

    @Override // p149l.dh90
    /* JADX INFO: renamed from: d */
    public void mo111814d(boolean z) {
        this.f97490a.f33977D = z;
    }
}
