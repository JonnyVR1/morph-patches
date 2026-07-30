package p009l;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import com.p000p1.mobile.putong.core.newui.home.base.impl.cardbottom.opt.C0034d;
import com.p000p1.mobile.putong.core.newui.home.base.impl.cardbottom.opt.CardBottomFrame;
import com.p000p1.mobile.putong.core.newui.home.views.CardBottomLetterLayout;
import com.p1.mobile.putong.core.R;
import com.p1.mobile.putong.data.User;
import com.tantanapp.common.data.DbObject;
import com.tantanapp.common.utils.NullChecker;
import l.hmb;
import l.j760;
import l.vwb;
import l.xdl0;
import l.zvf0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class c4j extends wl2 {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // p009l.wl2
    /* JADX INFO: renamed from: c */
    public void mo11838c(C0034d c0034d, View view, FrameLayout frameLayout, int i, Context context) {
        super.mo11838c(c0034d, view, frameLayout, i, context);
        CardBottomLetterLayout cardBottomLetterLayout = (CardBottomLetterLayout) view;
        m24310k(cardBottomLetterLayout.f2288c, c0034d, i);
        m12352o(c0034d, c0034d.getUser(), cardBottomLetterLayout);
    }

    /* JADX INFO: renamed from: o */
    public final void m12352o(C0034d c0034d, User user, CardBottomLetterLayout cardBottomLetterLayout) {
        String str = (NullChecker.a(user.localRelationship) && NullChecker.a(user.localRelationship.relationshipExtensions)) ? user.localRelationship.relationshipExtensions.otherLetter : null;
        if (TextUtils.isEmpty(str)) {
            xdl0.M(cardBottomLetterLayout.f2290e, false);
            return;
        }
        xdl0.M(cardBottomLetterLayout.f2290e, true);
        cardBottomLetterLayout.f2291f.setText(user.isFemale() ? R.string.S2 : R.string.T2);
        cardBottomLetterLayout.f2292g.setText(String.format("“%s”", str));
        hmb.l1(cardBottomLetterLayout.f2292g, "“%s”", 2);
        if (c0034d.m1455l()) {
            zvf0.A("e_letter_text", "p_suggest_users_home_view", new j760[]{vwb.Y("receiver_user_id", ((DbObject) user).id)});
        }
    }

    @Override // p009l.fol
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public boolean mo11837a(C0034d c0034d, int i, CardBottomFrame cardBottomFrame, Context context) {
        return c0034d.getUser().letter();
    }
}
