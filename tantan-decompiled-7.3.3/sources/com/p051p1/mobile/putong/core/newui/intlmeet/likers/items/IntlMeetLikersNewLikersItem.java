package com.p051p1.mobile.putong.core.newui.intlmeet.likers.items;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.member.R$string;
import com.p051p1.mobile.putong.data.User;
import java.util.HashSet;
import p151v.VDraweeView;
import p151v.VIcon;
import p151v.VLinear;
import p151v.VText;
import p153l.bnl0;
import p153l.cho;
import p153l.fsb0;
import p153l.gbc0;
import p153l.i4g0;
import p153l.joa;
import p153l.jyb;
import p153l.pzi0;
import p153l.q8g0;
import p153l.qa00;
import p153l.uqb0;

/* JADX INFO: loaded from: classes11.dex */
public class IntlMeetLikersNewLikersItem extends VLinear {

    /* JADX INFO: renamed from: c */
    public VDraweeView f24993c;

    /* JADX INFO: renamed from: d */
    public VIcon f24994d;

    /* JADX INFO: renamed from: e */
    public VText f24995e;

    /* JADX INFO: renamed from: f */
    public HashSet<String> f24996f;

    public IntlMeetLikersNewLikersItem(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f24996f = new HashSet<>();
    }

    private Act act() {
        return (Act) getContext();
    }

    /* JADX INFO: renamed from: Q */
    public final void m40425Q(View view) {
        cho.m109840a(this, view);
    }

    /* JADX INFO: renamed from: R */
    public final /* synthetic */ void m40426R(User user, boolean z, View view) {
        i4g0.m138523u("e_intl_meet_tab_see_new_like", "p_intl_meet_view", jyb.m147494Y("other_user_id", user.f56859id));
        i4g0.m138523u("e_intl_meet_avatar_click", "p_intl_meet_view", jyb.m147494Y("avatar_click_from", "see_new_like"));
        if (z) {
            CoreModule.m30933P().m143405a().mo34566pl(act(), user.f56859id, this, true);
        } else {
            CoreModule.m30933P().m143405a().mo34537l1(act(), "p_intl_meet_view,e_intl_meet_see_users,click");
        }
    }

    /* JADX INFO: renamed from: S */
    public void m40427S(final User user) {
        if (!this.f24996f.contains(user.f56859id)) {
            this.f24996f.add(user.f56859id);
            i4g0.m138492A("e_intl_meet_tab_see_new_like", "p_intl_meet_view", jyb.m147494Y("other_user_id", user.f56859id));
        }
        joa joaVar = CoreModule.f18264c.f20297C0;
        boolean zM146392i4 = joa.m146392i4();
        final boolean z = !zM146392i4;
        getContext().getString(R$string.f21426t);
        int i = user.location.distance;
        String strM175805k0 = q8g0.m175805k0(user.profile.zodiac, false);
        String str = user.hasPic() ? user.m61308fp().profile180().formatted() : null;
        if (!TextUtils.isEmpty(str)) {
            if (zM146392i4) {
                uqb0.f180374G.m127120O(this.f24993c, str, 2, 8);
            } else {
                fsb0 fsb0Var = uqb0.f180374G;
                VDraweeView vDraweeView = this.f24993c;
                int i2 = qa00.f156291D;
                fsb0Var.m127109I0(vDraweeView, str, i2, i2);
            }
        }
        long jGuessedCurrentServerTime = (uqb0.f180376H.guessedCurrentServerTime() - ((long) user.location.updatedTime)) / 1000;
        if (jGuessedCurrentServerTime < 3600) {
            bnl0.m105524M(this.f24994d, jGuessedCurrentServerTime < 60);
            this.f24994d.setImageResource(gbc0.f103148L);
            this.f24995e.setText(pzi0.m174445J(user.location.updatedTime, false));
        } else {
            if (!CoreModule.f18264c.f20303E0.m141060B3(user) && i <= 10000) {
                this.f24995e.setText(CoreModule.m30933P().m143405a().mo34551mi(user.location.distance));
            } else if (TextUtils.isEmpty(strM175805k0) || TextUtils.equals(strM175805k0, getContext().getString(R$string.f21340L1))) {
                this.f24995e.setText(R$string.f21363X);
            } else {
                this.f24995e.setText(strM175805k0);
            }
            bnl0.m105524M(this.f24994d, false);
        }
        bnl0.m105522L(this, new View.OnClickListener() { // from class: l.bho
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f76798a.m40426R(user, z, view);
            }
        });
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m40425Q(this);
    }

    public IntlMeetLikersNewLikersItem(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public IntlMeetLikersNewLikersItem(Context context) {
        this(context, null);
    }
}
