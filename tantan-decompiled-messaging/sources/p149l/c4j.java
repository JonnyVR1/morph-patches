package p149l;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import com.p046p1.mobile.putong.core.R$string;
import com.p046p1.mobile.putong.core.newui.home.base.impl.cardbottom.opt.C7870d;
import com.p046p1.mobile.putong.core.newui.home.base.impl.cardbottom.opt.CardBottomFrame;
import com.p046p1.mobile.putong.core.newui.home.views.CardBottomLetterLayout;
import com.p046p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;

/* JADX INFO: loaded from: classes11.dex */
public class c4j extends wl2 {
    @Override // p149l.wl2
    /* JADX INFO: renamed from: c */
    public void mo100261c(C7870d c7870d, View view, FrameLayout frameLayout, int i, Context context) {
        super.mo100261c(c7870d, view, frameLayout, i, context);
        CardBottomLetterLayout cardBottomLetterLayout = (CardBottomLetterLayout) view;
        m203741k(cardBottomLetterLayout.f23510c, c7870d, i);
        m105219o(c7870d, c7870d.getUser(), cardBottomLetterLayout);
    }

    /* JADX INFO: renamed from: o */
    public final void m105219o(C7870d c7870d, User user, CardBottomLetterLayout cardBottomLetterLayout) {
        String str = (NullChecker.m81303a(user.localRelationship) && NullChecker.m81303a(user.localRelationship.relationshipExtensions)) ? user.localRelationship.relationshipExtensions.otherLetter : null;
        if (TextUtils.isEmpty(str)) {
            xdl0.m208344M(cardBottomLetterLayout.f23512e, false);
            return;
        }
        xdl0.m208344M(cardBottomLetterLayout.f23512e, true);
        cardBottomLetterLayout.f23513f.setText(user.isFemale() ? R$string.f18109S2 : R$string.f18139T2);
        cardBottomLetterLayout.f23514g.setText(String.format("“%s”", str));
        hmb.m131707l1(cardBottomLetterLayout.f23514g, "“%s”", 2);
        if (c7870d.m37484l()) {
            zvf0.m220368A("e_letter_text", "p_suggest_users_home_view", vwb.m200311Y("receiver_user_id", user.f56011id));
        }
    }

    @Override // p149l.fol
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public boolean mo100260a(C7870d c7870d, int i, CardBottomFrame cardBottomFrame, Context context) {
        return c7870d.getUser().letter();
    }
}
