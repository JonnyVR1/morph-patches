package com.p046p1.mobile.putong.core.newui.intlmeet.likers.items;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.member.R$string;
import com.p046p1.mobile.putong.data.User;
import java.util.HashSet;
import p147v.VDraweeView;
import p147v.VIcon;
import p147v.VLinear;
import p147v.VText;
import p149l.b3c0;
import p149l.bkb0;
import p149l.cfo;
import p149l.i0g0;
import p149l.mqi0;
import p149l.qib0;
import p149l.t100;
import p149l.vwb;
import p149l.xdl0;
import p149l.xma;
import p149l.zvf0;

/* JADX INFO: loaded from: classes11.dex */
public class IntlMeetLikersNewLikersItem extends VLinear {

    /* JADX INFO: renamed from: c */
    public VDraweeView f24251c;

    /* JADX INFO: renamed from: d */
    public VIcon f24252d;

    /* JADX INFO: renamed from: e */
    public VText f24253e;

    /* JADX INFO: renamed from: f */
    public HashSet<String> f24254f;

    public IntlMeetLikersNewLikersItem(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f24254f = new HashSet<>();
    }

    private Act act() {
        return (Act) getContext();
    }

    /* JADX INFO: renamed from: Q */
    public final void m39422Q(View view) {
        cfo.m106596a(this, view);
    }

    /* JADX INFO: renamed from: R */
    public final /* synthetic */ void m39423R(User user, boolean z, View view) {
        zvf0.m220399u("e_intl_meet_tab_see_new_like", "p_intl_meet_view", vwb.m200311Y("other_user_id", user.f56011id));
        zvf0.m220399u("e_intl_meet_avatar_click", "p_intl_meet_view", vwb.m200311Y("avatar_click_from", "see_new_like"));
        if (z) {
            CoreModule.m29935P().m94651a().mo33563pl(act(), user.f56011id, this, true);
        } else {
            CoreModule.m29935P().m94651a().mo33534l1(act(), "p_intl_meet_view,e_intl_meet_see_users,click");
        }
    }

    /* JADX INFO: renamed from: S */
    public void m39424S(final User user) {
        if (!this.f24254f.contains(user.f56011id)) {
            this.f24254f.add(user.f56011id);
            zvf0.m220368A("e_intl_meet_tab_see_new_like", "p_intl_meet_view", vwb.m200311Y("other_user_id", user.f56011id));
        }
        xma xmaVar = CoreModule.f17545c.f19555C0;
        boolean zM210077h4 = xma.m210077h4();
        final boolean z = !zM210077h4;
        getContext().getString(R$string.f20684t);
        int i = user.location.distance;
        String strM133870k0 = i0g0.m133870k0(user.profile.zodiac, false);
        String str = user.hasPic() ? user.m60124fp().profile180().formatted() : null;
        if (!TextUtils.isEmpty(str)) {
            if (zM210077h4) {
                qib0.f154691G.m102336O(this.f24251c, str, 2, 8);
            } else {
                bkb0 bkb0Var = qib0.f154691G;
                VDraweeView vDraweeView = this.f24251c;
                int i2 = t100.f167229D;
                bkb0Var.m102325I0(vDraweeView, str, i2, i2);
            }
        }
        long jGuessedCurrentServerTime = (qib0.f154693H.guessedCurrentServerTime() - ((long) user.location.updatedTime)) / 1000;
        if (jGuessedCurrentServerTime < 3600) {
            xdl0.m208344M(this.f24252d, jGuessedCurrentServerTime < 60);
            this.f24252d.setImageResource(b3c0.f72897L);
            this.f24253e.setText(mqi0.m155935J(user.location.updatedTime, false));
        } else {
            if (!CoreModule.f17545c.f19561E0.m203772B3(user) && i <= 10000) {
                this.f24253e.setText(CoreModule.m29935P().m94651a().mo33548mi(user.location.distance));
            } else if (TextUtils.isEmpty(strM133870k0) || TextUtils.equals(strM133870k0, getContext().getString(R$string.f20598L1))) {
                this.f24253e.setText(R$string.f20621X);
            } else {
                this.f24253e.setText(strM133870k0);
            }
            xdl0.m208344M(this.f24252d, false);
        }
        xdl0.m208342L(this, new View.OnClickListener() { // from class: l.bfo
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f75336a.m39423R(user, z, view);
            }
        });
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m39422Q(this);
    }

    public IntlMeetLikersNewLikersItem(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public IntlMeetLikersNewLikersItem(Context context) {
        this(context, null);
    }
}
