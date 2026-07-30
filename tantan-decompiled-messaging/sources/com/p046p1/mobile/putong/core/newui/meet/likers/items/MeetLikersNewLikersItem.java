package com.p046p1.mobile.putong.core.newui.meet.likers.items;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.member.R$string;
import com.p046p1.mobile.putong.data.User;
import p147v.VDraweeView;
import p147v.VIcon;
import p147v.VLinear;
import p147v.VText;
import p149l.b3c0;
import p149l.bkb0;
import p149l.i0g0;
import p149l.m3y;
import p149l.mqi0;
import p149l.qib0;
import p149l.t100;
import p149l.vwb;
import p149l.xdl0;

/* JADX INFO: loaded from: classes11.dex */
public class MeetLikersNewLikersItem extends VLinear {

    /* JADX INFO: renamed from: c */
    public VDraweeView f24554c;

    /* JADX INFO: renamed from: d */
    public VIcon f24555d;

    /* JADX INFO: renamed from: e */
    public VText f24556e;

    public MeetLikersNewLikersItem(Context context) {
        this(context, null);
    }

    private Act act() {
        return (Act) getContext();
    }

    /* JADX INFO: renamed from: Q */
    public final void m40509Q(View view) {
        m3y.m152962a(this, view);
    }

    /* JADX INFO: renamed from: R */
    public final boolean m40510R(User user) {
        return TextUtils.equals(act().getString(R$string.f20677q1), mqi0.m155932G(user.location.updatedTime));
    }

    /* JADX INFO: renamed from: S */
    public final /* synthetic */ void m40511S(boolean z, User user, View view) {
        if (z) {
            CoreModule.m29935P().m94651a().mo33377Nn(act(), user.f56011id, this, true);
        } else {
            act().startActivityWithCustomTransition(CoreModule.m29935P().m94651a().mo33551n8(act(), vwb.m200324f0(user.f56011id), CoreModule.m29935P().m94651a().mo33508h7(), null, "p_meet_see,newlike"), CoreModule.m29935P().m94651a().mo33512hg(act()));
        }
    }

    /* JADX INFO: renamed from: T */
    public void m40512T(final User user) {
        boolean zMo33489e2 = CoreModule.f17554l.m94651a().mo33489e2();
        final boolean z = !zMo33489e2;
        int i = user.location.distance;
        String strM133870k0 = i0g0.m133870k0(user.profile.zodiac, false);
        String str = user.hasPic() ? user.m60124fp().profile180().formatted() : null;
        if (!TextUtils.isEmpty(str)) {
            if (zMo33489e2) {
                qib0.f154691G.m102336O(this.f24554c, str, 2, 8);
            } else {
                bkb0 bkb0Var = qib0.f154691G;
                VDraweeView vDraweeView = this.f24554c;
                int i2 = t100.f167229D;
                bkb0Var.m102325I0(vDraweeView, str, i2, i2);
            }
        }
        if (m40510R(user)) {
            xdl0.m208344M(this.f24555d, true);
            this.f24555d.setImageResource(b3c0.f73068i1);
            this.f24556e.setText("当前在线");
        } else {
            if (CoreModule.f17545c.f19561E0.m203772B3(user) || i > 10000) {
                this.f24556e.setText(strM133870k0);
            } else {
                this.f24556e.setText("距离" + i0g0.m133877q(user.location, true));
            }
            xdl0.m208344M(this.f24555d, false);
        }
        xdl0.m208329E0(this, new View.OnClickListener() { // from class: l.l3y
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f125950a.m40511S(z, user, view);
            }
        });
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m40509Q(this);
    }

    public MeetLikersNewLikersItem(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public MeetLikersNewLikersItem(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
