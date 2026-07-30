package com.p046p1.mobile.putong.core.newui.discovery;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.Privilege;
import com.p046p1.mobile.putong.core.p053ui.messages.MessagesAct;
import com.p046p1.mobile.putong.data.SuperlikeReason;
import com.p046p1.mobile.putong.data.User;
import p147v.VDraweeView;
import p147v.VImage;
import p147v.VText;
import p149l.e30;
import p149l.i0g0;
import p149l.mqi0;
import p149l.qib0;
import p149l.rgj;
import p149l.vwb;
import p149l.x2c0;
import p149l.xdl0;
import p149l.xtg0;

/* JADX INFO: loaded from: classes11.dex */
public class SuggestUserItem extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public VDraweeView f21367a;

    /* JADX INFO: renamed from: b */
    public VText f21368b;

    /* JADX INFO: renamed from: c */
    public VImage f21369c;

    /* JADX INFO: renamed from: d */
    public VText f21370d;

    /* JADX INFO: renamed from: e */
    public VText f21371e;

    public SuggestUserItem(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: c */
    public final void m36293c(View view) {
        xtg0.m210971a(this, view);
    }

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ void m36294d(String str, Act act, User user, View view) {
        String str2;
        if (!rgj.m179167a(str)) {
            act.startActivity(MessagesAct.m48940e2(getContext(), user.f56011id, 25, vwb.m200311Y("theme_type", str), vwb.m200311Y("greet_from", "card")));
            return;
        }
        Privilege privilege = Privilege.see_theme_unlock_online;
        if (TextUtils.equals(str, SuperlikeReason.popular)) {
            privilege = Privilege.see_theme_unlock_pop;
            str2 = "unlock_popular";
        } else {
            str2 = "unlock_online";
        }
        CoreModule.m29935P().m94651a().mo33622wr(act, str2, privilege);
    }

    /* JADX INFO: renamed from: e */
    public void m36295e(final Act act, final String str, final User user, final e30<User> e30Var) {
        this.f21371e.setText(user.name + ",\t" + user.age);
        this.f21370d.setText(i0g0.m133876p(user.location.distance, true));
        if (rgj.m179167a(str)) {
            qib0.f154691G.m102336O(this.f21367a, user.picture(0).url, 2, 20);
        } else {
            qib0.f154691G.m102331L0(this.f21367a, user.picture(0).url);
        }
        xdl0.m208344M(this.f21368b, ((double) mqi0.m155944o()) - user.location.updatedTime < 1.202E7d);
        setOnClickListener(new View.OnClickListener() { // from class: l.vtg0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                e30Var.call(user);
            }
        });
        xdl0.m208329E0(this.f21369c, new View.OnClickListener() { // from class: l.wtg0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f188017a.m36294d(str, act, user, view);
            }
        });
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m36293c(this);
        setBackgroundDrawable(getResources().getDrawable(x2c0.f189499Kt));
    }

    public SuggestUserItem(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public SuggestUserItem(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
