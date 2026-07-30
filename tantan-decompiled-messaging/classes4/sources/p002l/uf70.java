package p002l;

import android.text.TextUtils;
import com.p000p1.mobile.putong.core.p001ui.profile.profilelist.buttons.LayoutDesc;
import com.p1.mobile.putong.core.data.Conversation;
import com.p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.NullChecker;
import l.b1c;
import l.xma;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class uf70 extends fl5 {
    public uf70(vi90 vi90Var) {
        super(vi90Var);
    }

    @Override // p002l.fl5, com.p000p1.mobile.putong.core.p001ui.profile.profilelist.buttons.InterfaceC0148b
    /* JADX INFO: renamed from: a */
    public boolean mo2929a(vi90 vi90Var) {
        return vi90Var.m23956D();
    }

    @Override // p002l.fl5, com.p000p1.mobile.putong.core.p001ui.profile.profilelist.buttons.InterfaceC0148b
    /* JADX INFO: renamed from: b */
    public LayoutDesc.ComboType mo2930b(int i) {
        LayoutDesc.ComboType comboType;
        if (TextUtils.equals(this.f10448a.f21138b, "p_picks_profile_card")) {
            comboType = LayoutDesc.ComboType.Dislike_Like_SuperLike_Match;
        } else {
            boolean z = xma.G3() || b1c.f();
            Conversation conversationM23980b = this.f10448a.m23980b();
            if (NullChecker.a(conversationM23980b) && !TEnum.equals(conversationM23980b.status, "dismissed")) {
                comboType = LayoutDesc.ComboType.Chat_Single;
            } else if (this.f10448a.m23966N()) {
                comboType = z ? LayoutDesc.ComboType.Like_SuperLike_Match : LayoutDesc.ComboType.Like_Single;
            } else {
                comboType = (this.f10448a.m23971S() || this.f10448a.m23965M()) ? LayoutDesc.ComboType.Match : LayoutDesc.ComboType.SuperLike_Match;
            }
        }
        if (NullChecker.a(this.f10454g)) {
            this.f10454g.m14371l(comboType.getLayoutDesc());
            if (i == 0 && !this.f10455h) {
                m13286r(comboType.getLayoutDesc());
                this.f10455h = true;
            }
        }
        return comboType;
    }

    @Override // p002l.fl5, com.p000p1.mobile.putong.core.p001ui.profile.profilelist.buttons.InterfaceC0148b
    /* JADX INFO: renamed from: d */
    public void mo2932d(hh90 hh90Var) {
        super.mo2932d(hh90Var);
    }
}
