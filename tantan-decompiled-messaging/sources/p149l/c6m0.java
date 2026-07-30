package p149l;

import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.p053ui.profile.profilelist.buttons.LayoutDesc;
import com.p046p1.mobile.putong.data.Relationship;
import com.p046p1.mobile.putong.data.RelationshipStatus;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class c6m0 extends fl5 {
    public c6m0(vi90 vi90Var) {
        super(vi90Var);
    }

    @Override // p149l.fl5, com.p046p1.mobile.putong.core.p053ui.profile.profilelist.buttons.InterfaceC8723b
    /* JADX INFO: renamed from: a */
    public boolean mo52395a(vi90 vi90Var) {
        return vi90Var.m198520U();
    }

    @Override // p149l.fl5, com.p046p1.mobile.putong.core.p053ui.profile.profilelist.buttons.InterfaceC8723b
    /* JADX INFO: renamed from: b */
    public LayoutDesc.ComboType mo52396b(int i) {
        LayoutDesc.ComboType comboType = LayoutDesc.ComboType.None;
        List<Relationship> list = this.f98119a.f181575o;
        if (list != null) {
            if (!vwb.m200296J(list)) {
                for (Relationship relationship : this.f98119a.f181575o) {
                    if (CoreModule.m29932K().mo30819sg(this.f98119a.f181564d) || User.isMatched(this.f98119a.f181561a)) {
                        comboType = LayoutDesc.ComboType.Chat_Single;
                    } else if (TEnum.equals(relationship.state, "liked")) {
                        if (!NullChecker.m81303a(relationship.relationshipExtensions) || !TEnum.equals(relationship.relationshipExtensions.relationType, RelationshipStatus.SUPERLIKED)) {
                            comboType = this.f98119a.m198517R() ? LayoutDesc.ComboType.SuperLike_Match : LayoutDesc.ComboType.SuperLike;
                        } else if (this.f98119a.m198517R()) {
                            comboType = LayoutDesc.ComboType.Match;
                        }
                    } else if (TEnum.equals(relationship.state, "superliked")) {
                        if (this.f98119a.m198517R()) {
                            comboType = LayoutDesc.ComboType.Match;
                        }
                    } else if (TEnum.equals(relationship.state, RelationshipStatus.disliked) || TEnum.equals(relationship.state, "blocked")) {
                        comboType = LayoutDesc.ComboType.None;
                    } else {
                        comboType = this.f98119a.m198517R() ? LayoutDesc.ComboType.Dislike_Like_SuperLike_Match : LayoutDesc.ComboType.Dislike_Like_SuperLike;
                    }
                }
            } else if (CoreModule.m29932K().mo30819sg(this.f98119a.f181564d) || User.isMatched(this.f98119a.f181561a)) {
                comboType = LayoutDesc.ComboType.Chat_Single;
            } else {
                comboType = this.f98119a.m198517R() ? LayoutDesc.ComboType.Dislike_Like_SuperLike_Match : LayoutDesc.ComboType.Dislike_Like_SuperLike;
            }
        }
        if (NullChecker.m81303a(this.f98125g)) {
            this.f98125g.m130945l(comboType.getLayoutDesc());
        }
        return comboType;
    }
}
