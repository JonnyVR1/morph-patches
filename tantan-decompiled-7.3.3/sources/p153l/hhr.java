package p153l;

import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.LikedUser;
import com.p051p1.mobile.putong.core.p058ui.profile.profilelist.buttons.LayoutDesc;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.NullChecker;

/* JADX INFO: loaded from: classes4.dex */
public class hhr extends im5 {
    public hhr(zq90 zq90Var) {
        super(zq90Var);
    }

    @Override // p153l.im5, com.p051p1.mobile.putong.core.p058ui.profile.profilelist.buttons.InterfaceC8886b
    /* JADX INFO: renamed from: a */
    public boolean mo53578a(zq90 zq90Var) {
        return zq90Var.m220990r();
    }

    @Override // p153l.im5, com.p051p1.mobile.putong.core.p058ui.profile.profilelist.buttons.InterfaceC8886b
    /* JADX INFO: renamed from: c */
    public LayoutDesc.ComboType mo53580c() {
        LikedUser likedUserM210760C3 = CoreModule.f18264c.f20367Z0.m210760C3(this.f115652a.f205579d);
        if (likedUserM210760C3 == null && NullChecker.m82486a(this.f115652a.f205580e.f205605o)) {
            likedUserM210760C3 = this.f115652a.f205580e.f205605o;
        }
        return (NullChecker.m82486a(likedUserM210760C3) && (TEnum.equals(likedUserM210760C3.status, "superliked") || TEnum.equals(likedUserM210760C3.status, "lettered"))) ? LayoutDesc.ComboType.Match : LayoutDesc.ComboType.SuperLike_Match;
    }
}
