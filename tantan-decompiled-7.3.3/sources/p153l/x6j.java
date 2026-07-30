package p153l;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import com.p051p1.mobile.putong.core.R$string;
import com.p051p1.mobile.putong.core.newui.home.base.impl.cardbottom.opt.C8021d;
import com.p051p1.mobile.putong.core.newui.home.base.impl.cardbottom.opt.CardBottomFrame;
import com.p051p1.mobile.putong.core.newui.home.views.CardBottomLetterLayout;
import com.p051p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;

/* JADX INFO: loaded from: classes11.dex */
public class x6j extends em2 {
    @Override // p153l.em2
    /* JADX INFO: renamed from: c */
    public void mo96365c(C8021d c8021d, View view, FrameLayout frameLayout, int i, Context context) {
        super.mo96365c(c8021d, view, frameLayout, i, context);
        CardBottomLetterLayout cardBottomLetterLayout = (CardBottomLetterLayout) view;
        m121321k(cardBottomLetterLayout.f24252c, c8021d, i);
        m209503o(c8021d, c8021d.getUser(), cardBottomLetterLayout);
    }

    /* JADX INFO: renamed from: o */
    public final void m209503o(C8021d c8021d, User user, CardBottomLetterLayout cardBottomLetterLayout) {
        String str = (NullChecker.m82486a(user.localRelationship) && NullChecker.m82486a(user.localRelationship.relationshipExtensions)) ? user.localRelationship.relationshipExtensions.otherLetter : null;
        if (TextUtils.isEmpty(str)) {
            bnl0.m105524M(cardBottomLetterLayout.f24254e, false);
            return;
        }
        bnl0.m105524M(cardBottomLetterLayout.f24254e, true);
        cardBottomLetterLayout.f24255f.setText(user.isFemale() ? R$string.f18899U2 : R$string.f18929V2);
        cardBottomLetterLayout.f24256g.setText(String.format("“%s”", str));
        vnb.m201952l1(cardBottomLetterLayout.f24256g, "“%s”", 2);
        if (c8021d.m38487l()) {
            i4g0.m138492A("e_letter_text", "p_suggest_users_home_view", jyb.m147494Y("receiver_user_id", user.f56859id));
        }
    }

    @Override // p153l.qql
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public boolean mo96364a(C8021d c8021d, int i, CardBottomFrame cardBottomFrame, Context context) {
        return c8021d.getUser().letter();
    }
}
