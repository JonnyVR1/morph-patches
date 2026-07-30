package com.p051p1.mobile.putong.core.newui.meet.likers.items;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.member.R$string;
import com.p051p1.mobile.putong.data.User;
import p151v.VDraweeView;
import p151v.VIcon;
import p151v.VLinear;
import p151v.VText;
import p153l.bnl0;
import p153l.fsb0;
import p153l.gbc0;
import p153l.jcy;
import p153l.jyb;
import p153l.pzi0;
import p153l.q8g0;
import p153l.qa00;
import p153l.uqb0;

/* JADX INFO: loaded from: classes11.dex */
public class MeetLikersNewLikersItem extends VLinear {

    /* JADX INFO: renamed from: c */
    public VDraweeView f25296c;

    /* JADX INFO: renamed from: d */
    public VIcon f25297d;

    /* JADX INFO: renamed from: e */
    public VText f25298e;

    public MeetLikersNewLikersItem(Context context) {
        this(context, null);
    }

    private Act act() {
        return (Act) getContext();
    }

    /* JADX INFO: renamed from: Q */
    public final void m41520Q(View view) {
        jcy.m144396a(this, view);
    }

    /* JADX INFO: renamed from: R */
    public final boolean m41521R(User user) {
        return TextUtils.equals(act().getString(R$string.f21419q1), pzi0.m174442G(user.location.updatedTime));
    }

    /* JADX INFO: renamed from: S */
    public final /* synthetic */ void m41522S(boolean z, User user, View view) {
        if (z) {
            CoreModule.m30933P().m143405a().mo34380Nn(act(), user.f56859id, this, true);
        } else {
            act().startActivityWithCustomTransition(CoreModule.m30933P().m143405a().mo34554n8(act(), jyb.m147507f0(user.f56859id), CoreModule.m30933P().m143405a().mo34511h7(), null, "p_meet_see,newlike"), CoreModule.m30933P().m143405a().mo34515hg(act()));
        }
    }

    /* JADX INFO: renamed from: T */
    public void m41523T(final User user) {
        boolean zMo34492e2 = CoreModule.f18273l.m143405a().mo34492e2();
        final boolean z = !zMo34492e2;
        int i = user.location.distance;
        String strM175805k0 = q8g0.m175805k0(user.profile.zodiac, false);
        String str = user.hasPic() ? user.m61308fp().profile180().formatted() : null;
        if (!TextUtils.isEmpty(str)) {
            if (zMo34492e2) {
                uqb0.f180374G.m127120O(this.f25296c, str, 2, 8);
            } else {
                fsb0 fsb0Var = uqb0.f180374G;
                VDraweeView vDraweeView = this.f25296c;
                int i2 = qa00.f156291D;
                fsb0Var.m127109I0(vDraweeView, str, i2, i2);
            }
        }
        if (m41521R(user)) {
            bnl0.m105524M(this.f25297d, true);
            this.f25297d.setImageResource(gbc0.f103319i1);
            this.f25298e.setText("当前在线");
        } else {
            if (CoreModule.f18264c.f20303E0.m141060B3(user) || i > 10000) {
                this.f25298e.setText(strM175805k0);
            } else {
                this.f25298e.setText("距离" + q8g0.m175812q(user.location, true));
            }
            bnl0.m105524M(this.f25297d, false);
        }
        bnl0.m105509E0(this, new View.OnClickListener() { // from class: l.icy
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f114450a.m41522S(z, user, view);
            }
        });
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m41520Q(this);
    }

    public MeetLikersNewLikersItem(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public MeetLikersNewLikersItem(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
