package p149l;

import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.LikedUser;
import com.p046p1.mobile.putong.core.p053ui.profile.profilelist.buttons.LayoutDesc;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.NullChecker;

/* JADX INFO: loaded from: classes4.dex */
public class gfr extends fl5 {
    public gfr(vi90 vi90Var) {
        super(vi90Var);
    }

    @Override // p149l.fl5, com.p046p1.mobile.putong.core.p053ui.profile.profilelist.buttons.InterfaceC8723b
    /* JADX INFO: renamed from: a */
    public boolean mo52395a(vi90 vi90Var) {
        return vi90Var.m198542r();
    }

    @Override // p149l.fl5, com.p046p1.mobile.putong.core.p053ui.profile.profilelist.buttons.InterfaceC8723b
    /* JADX INFO: renamed from: c */
    public LayoutDesc.ComboType mo52397c() {
        LikedUser likedUserM163902C3 = CoreModule.f17545c.f19625Z0.m163902C3(this.f98119a.f181564d);
        if (likedUserM163902C3 == null && NullChecker.m81303a(this.f98119a.f181565e.f181590o)) {
            likedUserM163902C3 = this.f98119a.f181565e.f181590o;
        }
        return (NullChecker.m81303a(likedUserM163902C3) && (TEnum.equals(likedUserM163902C3.status, "superliked") || TEnum.equals(likedUserM163902C3.status, "lettered"))) ? LayoutDesc.ComboType.Match : LayoutDesc.ComboType.SuperLike_Match;
    }
}
