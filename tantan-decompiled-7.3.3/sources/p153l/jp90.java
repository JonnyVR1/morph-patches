package p153l;

import com.p051p1.mobile.putong.core.data.SwipeDirection;
import com.p051p1.mobile.putong.core.p058ui.profile.profilelist.imp.ProfileListFragLocalImpl;

/* JADX INFO: loaded from: classes4.dex */
public class jp90 implements hp90 {

    /* JADX INFO: renamed from: a */
    public ProfileListFragLocalImpl f122083a;

    public jp90(ProfileListFragLocalImpl profileListFragLocalImpl) {
        this.f122083a = profileListFragLocalImpl;
    }

    @Override // p153l.hp90
    /* JADX INFO: renamed from: a */
    public void mo113389a(SwipeDirection swipeDirection) {
        this.f122083a.m53852c5().m110534E1(swipeDirection.getValue());
    }

    @Override // p153l.hp90
    /* JADX INFO: renamed from: b */
    public void mo113390b(SwipeDirection swipeDirection) {
        this.f122083a.m53852c5().m110540J1(swipeDirection == SwipeDirection.UP);
    }

    @Override // p153l.hp90
    /* JADX INFO: renamed from: c */
    public void mo113391c(boolean z) {
        this.f122083a.m53856g5().m140866S0(z);
    }

    @Override // p153l.hp90
    /* JADX INFO: renamed from: d */
    public void mo113392d(boolean z) {
        this.f122083a.f34825D = z;
    }
}
