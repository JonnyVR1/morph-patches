package com.p000p1.mobile.putong.core.newui.discovery;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.data.Privilege;
import com.p1.mobile.putong.core.ui.messages.MessagesAct;
import com.p1.mobile.putong.data.Media;
import com.p1.mobile.putong.data.User;
import com.tantanapp.common.data.DbObject;
import l.e30;
import l.j760;
import l.qib0;
import l.vwb;
import l.x2c0;
import l.xdl0;
import l.xtg0;
import p009l.i0g0;
import p009l.mqi0;
import p009l.rgj;
import v.VDraweeView;
import v.VImage;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class SuggestUserItem extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public VDraweeView f145a;

    /* JADX INFO: renamed from: b */
    public VText f146b;

    /* JADX INFO: renamed from: c */
    public VImage f147c;

    /* JADX INFO: renamed from: d */
    public VText f148d;

    /* JADX INFO: renamed from: e */
    public VText f149e;

    public SuggestUserItem(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: c */
    public final void m211c(View view) {
        xtg0.a(this, view);
    }

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ void m212d(String str, Act act, User user, View view) {
        String str2;
        if (!rgj.m21658a(str)) {
            act.startActivity(MessagesAct.e2(getContext(), ((DbObject) user).id, 25, new j760[]{vwb.Y("theme_type", str), vwb.Y("greet_from", "card")}));
            return;
        }
        Privilege privilege = Privilege.see_theme_unlock_online;
        if (TextUtils.equals(str, "popular")) {
            privilege = Privilege.see_theme_unlock_pop;
            str2 = "unlock_popular";
        } else {
            str2 = "unlock_online";
        }
        CoreModule.P().a().wr(act, str2, privilege);
    }

    /* JADX INFO: renamed from: e */
    public void m213e(final Act act, final String str, final User user, final e30<User> e30Var) {
        this.f149e.setText(user.name + ",\t" + user.age);
        this.f148d.setText(i0g0.m16144p(user.location.distance, true));
        if (rgj.m21658a(str)) {
            qib0.G.O(this.f145a, ((Media) user.picture(0)).url, 2, 20);
        } else {
            qib0.G.L0(this.f145a, ((Media) user.picture(0)).url);
        }
        xdl0.M(this.f146b, ((double) mqi0.m18550o()) - user.location.updatedTime < 1.202E7d);
        setOnClickListener(new View.OnClickListener() { // from class: l.vtg0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                e30Var.call(user);
            }
        });
        xdl0.E0(this.f147c, new View.OnClickListener() { // from class: l.wtg0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f22313a.m212d(str, act, user, view);
            }
        });
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m211c(this);
        setBackgroundDrawable(getResources().getDrawable(x2c0.Kt));
    }

    public SuggestUserItem(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public SuggestUserItem(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
