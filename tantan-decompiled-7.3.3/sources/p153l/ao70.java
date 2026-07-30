package p153l;

import android.text.TextUtils;
import com.p051p1.mobile.putong.core.data.Conversation;
import com.p051p1.mobile.putong.core.p058ui.profile.profilelist.buttons.LayoutDesc;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.NullChecker;

/* JADX INFO: loaded from: classes4.dex */
public class ao70 extends im5 {
    public ao70(zq90 zq90Var) {
        super(zq90Var);
    }

    @Override // p153l.im5, com.p051p1.mobile.putong.core.p058ui.profile.profilelist.buttons.InterfaceC8886b
    /* JADX INFO: renamed from: a */
    public boolean mo53578a(zq90 zq90Var) {
        return zq90Var.m220951D();
    }

    @Override // p153l.im5, com.p051p1.mobile.putong.core.p058ui.profile.profilelist.buttons.InterfaceC8886b
    /* JADX INFO: renamed from: b */
    public LayoutDesc.ComboType mo53579b(int i) {
        LayoutDesc.ComboType comboType;
        if (TextUtils.equals(this.f115652a.f205577b, "p_picks_profile_card")) {
            comboType = LayoutDesc.ComboType.Dislike_Like_SuperLike_Match;
        } else {
            boolean z = joa.m146358H3() || o2c.m165708f();
            Conversation conversationM220975b = this.f115652a.m220975b();
            if (NullChecker.m82486a(conversationM220975b) && !TEnum.equals(conversationM220975b.status, "dismissed")) {
                comboType = LayoutDesc.ComboType.Chat_Single;
            } else if (this.f115652a.m220961N()) {
                comboType = z ? LayoutDesc.ComboType.Like_SuperLike_Match : LayoutDesc.ComboType.Like_Single;
            } else {
                comboType = (this.f115652a.m220966S() || this.f115652a.m220960M()) ? LayoutDesc.ComboType.Match : LayoutDesc.ComboType.SuperLike_Match;
            }
        }
        if (NullChecker.m82486a(this.f115658g)) {
            this.f115658g.m155170l(comboType.getLayoutDesc());
            if (i == 0 && !this.f115659h) {
                m140740r(comboType.getLayoutDesc());
                this.f115659h = true;
            }
        }
        return comboType;
    }

    @Override // p153l.im5, com.p051p1.mobile.putong.core.p058ui.profile.profilelist.buttons.InterfaceC8886b
    /* JADX INFO: renamed from: d */
    public void mo53581d(lp90 lp90Var) {
        super.mo53581d(lp90Var);
    }
}
