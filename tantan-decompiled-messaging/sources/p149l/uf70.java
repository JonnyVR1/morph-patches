package p149l;

import android.text.TextUtils;
import com.p046p1.mobile.putong.core.data.Conversation;
import com.p046p1.mobile.putong.core.p053ui.profile.profilelist.buttons.LayoutDesc;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.NullChecker;

/* JADX INFO: loaded from: classes4.dex */
public class uf70 extends fl5 {
    public uf70(vi90 vi90Var) {
        super(vi90Var);
    }

    @Override // p149l.fl5, com.p046p1.mobile.putong.core.p053ui.profile.profilelist.buttons.InterfaceC8723b
    /* JADX INFO: renamed from: a */
    public boolean mo52395a(vi90 vi90Var) {
        return vi90Var.m198503D();
    }

    @Override // p149l.fl5, com.p046p1.mobile.putong.core.p053ui.profile.profilelist.buttons.InterfaceC8723b
    /* JADX INFO: renamed from: b */
    public LayoutDesc.ComboType mo52396b(int i) {
        LayoutDesc.ComboType comboType;
        if (TextUtils.equals(this.f98119a.f181562b, "p_picks_profile_card")) {
            comboType = LayoutDesc.ComboType.Dislike_Like_SuperLike_Match;
        } else {
            boolean z = xma.m210044G3() || b1c.m99817f();
            Conversation conversationM198527b = this.f98119a.m198527b();
            if (NullChecker.m81303a(conversationM198527b) && !TEnum.equals(conversationM198527b.status, "dismissed")) {
                comboType = LayoutDesc.ComboType.Chat_Single;
            } else if (this.f98119a.m198513N()) {
                comboType = z ? LayoutDesc.ComboType.Like_SuperLike_Match : LayoutDesc.ComboType.Like_Single;
            } else {
                comboType = (this.f98119a.m198518S() || this.f98119a.m198512M()) ? LayoutDesc.ComboType.Match : LayoutDesc.ComboType.SuperLike_Match;
            }
        }
        if (NullChecker.m81303a(this.f98125g)) {
            this.f98125g.m130945l(comboType.getLayoutDesc());
            if (i == 0 && !this.f98126h) {
                m121961r(comboType.getLayoutDesc());
                this.f98126h = true;
            }
        }
        return comboType;
    }

    @Override // p149l.fl5, com.p046p1.mobile.putong.core.p053ui.profile.profilelist.buttons.InterfaceC8723b
    /* JADX INFO: renamed from: d */
    public void mo52398d(hh90 hh90Var) {
        super.mo52398d(hh90Var);
    }
}
