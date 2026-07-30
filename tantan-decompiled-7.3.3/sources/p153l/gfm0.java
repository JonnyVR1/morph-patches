package p153l;

import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.p058ui.profile.profilelist.buttons.LayoutDesc;
import com.p051p1.mobile.putong.data.Relationship;
import com.p051p1.mobile.putong.data.RelationshipStatus;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class gfm0 extends im5 {
    public gfm0(zq90 zq90Var) {
        super(zq90Var);
    }

    @Override // p153l.im5, com.p051p1.mobile.putong.core.p058ui.profile.profilelist.buttons.InterfaceC8886b
    /* JADX INFO: renamed from: a */
    public boolean mo53578a(zq90 zq90Var) {
        return zq90Var.m220968U();
    }

    @Override // p153l.im5, com.p051p1.mobile.putong.core.p058ui.profile.profilelist.buttons.InterfaceC8886b
    /* JADX INFO: renamed from: b */
    public LayoutDesc.ComboType mo53579b(int i) {
        LayoutDesc.ComboType comboType = LayoutDesc.ComboType.None;
        List<Relationship> list = this.f115652a.f205590o;
        if (list != null) {
            if (!jyb.m147479J(list)) {
                for (Relationship relationship : this.f115652a.f205590o) {
                    if (CoreModule.m30930K().mo31822sg(this.f115652a.f205579d) || User.isMatched(this.f115652a.f205576a)) {
                        comboType = LayoutDesc.ComboType.Chat_Single;
                    } else if (TEnum.equals(relationship.state, "liked")) {
                        if (!NullChecker.m82486a(relationship.relationshipExtensions) || !TEnum.equals(relationship.relationshipExtensions.relationType, RelationshipStatus.SUPERLIKED)) {
                            comboType = this.f115652a.m220965R() ? LayoutDesc.ComboType.SuperLike_Match : LayoutDesc.ComboType.SuperLike;
                        } else if (this.f115652a.m220965R()) {
                            comboType = LayoutDesc.ComboType.Match;
                        }
                    } else if (TEnum.equals(relationship.state, "superliked")) {
                        if (this.f115652a.m220965R()) {
                            comboType = LayoutDesc.ComboType.Match;
                        }
                    } else if (TEnum.equals(relationship.state, RelationshipStatus.disliked) || TEnum.equals(relationship.state, "blocked")) {
                        comboType = LayoutDesc.ComboType.None;
                    } else {
                        comboType = this.f115652a.m220965R() ? LayoutDesc.ComboType.Dislike_Like_SuperLike_Match : LayoutDesc.ComboType.Dislike_Like_SuperLike;
                    }
                }
            } else if (CoreModule.m30930K().mo31822sg(this.f115652a.f205579d) || User.isMatched(this.f115652a.f205576a)) {
                comboType = LayoutDesc.ComboType.Chat_Single;
            } else {
                comboType = this.f115652a.m220965R() ? LayoutDesc.ComboType.Dislike_Like_SuperLike_Match : LayoutDesc.ComboType.Dislike_Like_SuperLike;
            }
        }
        if (NullChecker.m82486a(this.f115658g)) {
            this.f115658g.m155170l(comboType.getLayoutDesc());
        }
        return comboType;
    }
}
