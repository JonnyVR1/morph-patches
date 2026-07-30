package com.p000p1.mobile.putong.core.newui.meet.likers.items;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.member.R;
import com.p1.mobile.putong.data.User;
import com.tantanapp.common.data.DbObject;
import java.util.ArrayList;
import l.b3c0;
import l.bkb0;
import l.m3y;
import l.qib0;
import l.t100;
import l.vwb;
import l.xdl0;
import p009l.i0g0;
import p009l.mqi0;
import v.VDraweeView;
import v.VIcon;
import v.VLinear;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class MeetLikersNewLikersItem extends VLinear {

    /* JADX INFO: renamed from: c */
    public VDraweeView f3332c;

    /* JADX INFO: renamed from: d */
    public VIcon f3333d;

    /* JADX INFO: renamed from: e */
    public VText f3334e;

    public MeetLikersNewLikersItem(Context context) {
        this(context, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private Act act() {
        return getContext();
    }

    /* JADX INFO: renamed from: Q */
    public final void m4600Q(View view) {
        m3y.a(this, view);
    }

    /* JADX INFO: renamed from: R */
    public final boolean m4601R(User user) {
        return TextUtils.equals(act().getString(R.string.q1), mqi0.m18538G(user.location.updatedTime));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: S */
    public final /* synthetic */ void m4602S(boolean z, User user, View view) {
        if (z) {
            CoreModule.P().a().Nn(act(), ((DbObject) user).id, this, true);
        } else {
            act().startActivityWithCustomTransition(CoreModule.P().a().n8(act(), vwb.f0(new String[]{((DbObject) user).id}), CoreModule.P().a().h7(), (ArrayList) null, "p_meet_see,newlike"), CoreModule.P().a().hg(act()));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: T */
    public void m4603T(final User user) {
        boolean zE2 = CoreModule.l.a().e2();
        final boolean z = !zE2;
        int i = user.location.distance;
        String strM16138k0 = i0g0.m16138k0(user.profile.zodiac, false);
        String str = user.hasPic() ? user.fp().profile180().formatted() : null;
        if (!TextUtils.isEmpty(str)) {
            if (zE2) {
                qib0.G.O(this.f3332c, str, 2, 8);
            } else {
                bkb0 bkb0Var = qib0.G;
                VDraweeView vDraweeView = this.f3332c;
                int i2 = t100.D;
                bkb0Var.I0(vDraweeView, str, i2, i2);
            }
        }
        if (m4601R(user)) {
            xdl0.M(this.f3333d, true);
            this.f3333d.setImageResource(b3c0.i1);
            this.f3334e.setText("当前在线");
        } else {
            if (CoreModule.c.E0.B3(user) || i > 10000) {
                this.f3334e.setText(strM16138k0);
            } else {
                this.f3334e.setText("距离" + i0g0.m16145q(user.location, true));
            }
            xdl0.M(this.f3333d, false);
        }
        xdl0.E0(this, new View.OnClickListener() { // from class: l.l3y
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f15926a.m4602S(z, user, view);
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onFinishInflate() {
        super/*android.view.View*/.onFinishInflate();
        m4600Q(this);
    }

    public MeetLikersNewLikersItem(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public MeetLikersNewLikersItem(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
