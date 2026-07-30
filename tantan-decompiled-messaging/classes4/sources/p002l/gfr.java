package p002l;

import com.p000p1.mobile.putong.core.p001ui.profile.profilelist.buttons.LayoutDesc;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.data.LikedUser;
import com.p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.NullChecker;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class gfr extends fl5 {
    public gfr(vi90 vi90Var) {
        super(vi90Var);
    }

    @Override // p002l.fl5, com.p000p1.mobile.putong.core.p001ui.profile.profilelist.buttons.InterfaceC0148b
    /* JADX INFO: renamed from: a */
    public boolean mo2929a(vi90 vi90Var) {
        return vi90Var.m23995r();
    }

    @Override // p002l.fl5, com.p000p1.mobile.putong.core.p001ui.profile.profilelist.buttons.InterfaceC0148b
    /* JADX INFO: renamed from: c */
    public LayoutDesc.ComboType mo2931c() {
        LikedUser likedUserC3 = CoreModule.c.Z0.C3(this.f10448a.f21140d);
        if (likedUserC3 == null && NullChecker.a(this.f10448a.f21141e.f21166o)) {
            likedUserC3 = this.f10448a.f21141e.f21166o;
        }
        return (NullChecker.a(likedUserC3) && (TEnum.equals(likedUserC3.status, "superliked") || TEnum.equals(likedUserC3.status, "lettered"))) ? LayoutDesc.ComboType.Match : LayoutDesc.ComboType.SuperLike_Match;
    }
}
