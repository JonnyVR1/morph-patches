package p002l;

import com.p000p1.mobile.putong.core.p001ui.profile.profilelist.buttons.LayoutDesc;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.data.Relationship;
import com.p1.mobile.putong.data.User;
import com.p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import l.vwb;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class c6m0 extends fl5 {
    public c6m0(vi90 vi90Var) {
        super(vi90Var);
    }

    @Override // p002l.fl5, com.p000p1.mobile.putong.core.p001ui.profile.profilelist.buttons.InterfaceC0148b
    /* JADX INFO: renamed from: a */
    public boolean mo2929a(vi90 vi90Var) {
        return vi90Var.m23973U();
    }

    @Override // p002l.fl5, com.p000p1.mobile.putong.core.p001ui.profile.profilelist.buttons.InterfaceC0148b
    /* JADX INFO: renamed from: b */
    public LayoutDesc.ComboType mo2930b(int i) {
        LayoutDesc.ComboType comboType = LayoutDesc.ComboType.None;
        List<Relationship> list = this.f10448a.f21151o;
        if (list != null) {
            if (!vwb.J(list)) {
                for (Relationship relationship : this.f10448a.f21151o) {
                    if (CoreModule.K().sg(this.f10448a.f21140d) || User.isMatched(this.f10448a.f21137a)) {
                        comboType = LayoutDesc.ComboType.Chat_Single;
                    } else if (TEnum.equals(relationship.state, "liked")) {
                        if (!NullChecker.a(relationship.relationshipExtensions) || !TEnum.equals(relationship.relationshipExtensions.relationType, "SUPERLIKED")) {
                            comboType = this.f10448a.m23970R() ? LayoutDesc.ComboType.SuperLike_Match : LayoutDesc.ComboType.SuperLike;
                        } else if (this.f10448a.m23970R()) {
                            comboType = LayoutDesc.ComboType.Match;
                        }
                    } else if (TEnum.equals(relationship.state, "superliked")) {
                        if (this.f10448a.m23970R()) {
                            comboType = LayoutDesc.ComboType.Match;
                        }
                    } else if (TEnum.equals(relationship.state, "disliked") || TEnum.equals(relationship.state, "blocked")) {
                        comboType = LayoutDesc.ComboType.None;
                    } else {
                        comboType = this.f10448a.m23970R() ? LayoutDesc.ComboType.Dislike_Like_SuperLike_Match : LayoutDesc.ComboType.Dislike_Like_SuperLike;
                    }
                }
            } else if (CoreModule.K().sg(this.f10448a.f21140d) || User.isMatched(this.f10448a.f21137a)) {
                comboType = LayoutDesc.ComboType.Chat_Single;
            } else {
                comboType = this.f10448a.m23970R() ? LayoutDesc.ComboType.Dislike_Like_SuperLike_Match : LayoutDesc.ComboType.Dislike_Like_SuperLike;
            }
        }
        if (NullChecker.a(this.f10454g)) {
            this.f10454g.m14371l(comboType.getLayoutDesc());
        }
        return comboType;
    }
}
