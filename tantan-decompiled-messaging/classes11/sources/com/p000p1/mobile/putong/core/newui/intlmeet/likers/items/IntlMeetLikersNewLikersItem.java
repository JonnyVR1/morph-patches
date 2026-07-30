package com.p000p1.mobile.putong.core.newui.intlmeet.likers.items;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.member.R;
import com.p1.mobile.putong.data.User;
import com.tantanapp.common.data.DbObject;
import java.util.HashSet;
import l.b3c0;
import l.bkb0;
import l.cfo;
import l.j760;
import l.qib0;
import l.t100;
import l.vwb;
import l.xdl0;
import l.xma;
import l.zvf0;
import p009l.i0g0;
import p009l.mqi0;
import v.VDraweeView;
import v.VIcon;
import v.VLinear;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class IntlMeetLikersNewLikersItem extends VLinear {

    /* JADX INFO: renamed from: c */
    public VDraweeView f3029c;

    /* JADX INFO: renamed from: d */
    public VIcon f3030d;

    /* JADX INFO: renamed from: e */
    public VText f3031e;

    /* JADX INFO: renamed from: f */
    public HashSet<String> f3032f;

    public IntlMeetLikersNewLikersItem(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f3032f = new HashSet<>();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private Act act() {
        return getContext();
    }

    /* JADX INFO: renamed from: Q */
    public final void m3469Q(View view) {
        cfo.a(this, view);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: R */
    public final /* synthetic */ void m3470R(User user, boolean z, View view) {
        zvf0.u("e_intl_meet_tab_see_new_like", "p_intl_meet_view", new j760[]{vwb.Y("other_user_id", ((DbObject) user).id)});
        zvf0.u("e_intl_meet_avatar_click", "p_intl_meet_view", new j760[]{vwb.Y("avatar_click_from", "see_new_like")});
        if (z) {
            CoreModule.P().a().pl(act(), ((DbObject) user).id, this, true);
        } else {
            CoreModule.P().a().l1(act(), "p_intl_meet_view,e_intl_meet_see_users,click");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: S */
    public void m3471S(final User user) {
        if (!this.f3032f.contains(((DbObject) user).id)) {
            this.f3032f.add(((DbObject) user).id);
            zvf0.A("e_intl_meet_tab_see_new_like", "p_intl_meet_view", new j760[]{vwb.Y("other_user_id", ((DbObject) user).id)});
        }
        xma xmaVar = CoreModule.c.C0;
        boolean zH4 = xma.h4();
        final boolean z = !zH4;
        getContext().getString(R.string.t);
        int i = user.location.distance;
        String strM16138k0 = i0g0.m16138k0(user.profile.zodiac, false);
        String str = user.hasPic() ? user.fp().profile180().formatted() : null;
        if (!TextUtils.isEmpty(str)) {
            if (zH4) {
                qib0.G.O(this.f3029c, str, 2, 8);
            } else {
                bkb0 bkb0Var = qib0.G;
                VDraweeView vDraweeView = this.f3029c;
                int i2 = t100.D;
                bkb0Var.I0(vDraweeView, str, i2, i2);
            }
        }
        long jGuessedCurrentServerTime = (qib0.H.guessedCurrentServerTime() - ((long) user.location.updatedTime)) / 1000;
        if (jGuessedCurrentServerTime < 3600) {
            xdl0.M(this.f3030d, jGuessedCurrentServerTime < 60);
            this.f3030d.setImageResource(b3c0.L);
            this.f3031e.setText(mqi0.m18541J(user.location.updatedTime, false));
        } else {
            if (!CoreModule.c.E0.B3(user) && i <= 10000) {
                this.f3031e.setText(CoreModule.P().a().mi(user.location.distance));
            } else if (TextUtils.isEmpty(strM16138k0) || TextUtils.equals(strM16138k0, getContext().getString(R.string.L1))) {
                this.f3031e.setText(R.string.X);
            } else {
                this.f3031e.setText(strM16138k0);
            }
            xdl0.M(this.f3030d, false);
        }
        xdl0.L(this, new View.OnClickListener() { // from class: l.bfo
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f10048a.m3470R(user, z, view);
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onFinishInflate() {
        super/*android.view.View*/.onFinishInflate();
        m3469Q(this);
    }

    public IntlMeetLikersNewLikersItem(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public IntlMeetLikersNewLikersItem(Context context) {
        this(context, null);
    }
}
