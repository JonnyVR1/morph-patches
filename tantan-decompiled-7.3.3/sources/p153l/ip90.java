package p153l;

import com.p051p1.mobile.putong.core.data.SwipeDirection;
import com.p051p1.mobile.putong.core.p058ui.profile.profilelist.imp.ProfileListFragExpandedImpl;

/* JADX INFO: loaded from: classes4.dex */
public class ip90 implements hp90 {

    /* JADX INFO: renamed from: a */
    public ProfileListFragExpandedImpl f116264a;

    public ip90(ProfileListFragExpandedImpl profileListFragExpandedImpl) {
        this.f116264a = profileListFragExpandedImpl;
    }

    @Override // p153l.hp90
    /* JADX INFO: renamed from: a */
    public void mo113389a(SwipeDirection swipeDirection) {
        this.f116264a.m53596V4().m129190n1(swipeDirection.getValue());
    }

    @Override // p153l.hp90
    /* JADX INFO: renamed from: b */
    public void mo113390b(SwipeDirection swipeDirection) {
        this.f116264a.m53596V4().m129198r1(swipeDirection == SwipeDirection.UP);
    }

    @Override // p153l.hp90
    /* JADX INFO: renamed from: c */
    public void mo113391c(boolean z) {
        this.f116264a.m53600Z4().m170754L(z);
    }

    @Override // p153l.hp90
    /* JADX INFO: renamed from: d */
    public void mo113392d(boolean z) {
        this.f116264a.f34740F = z;
    }
}
