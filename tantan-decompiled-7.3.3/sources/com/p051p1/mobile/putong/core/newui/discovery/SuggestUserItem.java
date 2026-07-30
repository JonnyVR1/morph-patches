package com.p051p1.mobile.putong.core.newui.discovery;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.Privilege;
import com.p051p1.mobile.putong.core.p058ui.messages.MessagesAct;
import com.p051p1.mobile.putong.data.SuperlikeReason;
import com.p051p1.mobile.putong.data.User;
import p151v.VDraweeView;
import p151v.VImage;
import p151v.VText;
import p153l.bnl0;
import p153l.dbc0;
import p153l.f2h0;
import p153l.jyb;
import p153l.ljj;
import p153l.pzi0;
import p153l.q8g0;
import p153l.uqb0;
import p153l.y20;

/* JADX INFO: loaded from: classes11.dex */
public class SuggestUserItem extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public VDraweeView f22109a;

    /* JADX INFO: renamed from: b */
    public VText f22110b;

    /* JADX INFO: renamed from: c */
    public VImage f22111c;

    /* JADX INFO: renamed from: d */
    public VText f22112d;

    /* JADX INFO: renamed from: e */
    public VText f22113e;

    public SuggestUserItem(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: c */
    public final void m37296c(View view) {
        f2h0.m123616a(this, view);
    }

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ void m37297d(String str, Act act, User user, View view) {
        String str2;
        if (!ljj.m154509a(str)) {
            act.startActivity(MessagesAct.m50123g2(getContext(), user.f56859id, 25, jyb.m147494Y("theme_type", str), jyb.m147494Y("greet_from", "card")));
            return;
        }
        Privilege privilege = Privilege.see_theme_unlock_online;
        if (TextUtils.equals(str, SuperlikeReason.popular)) {
            privilege = Privilege.see_theme_unlock_pop;
            str2 = "unlock_popular";
        } else {
            str2 = "unlock_online";
        }
        CoreModule.m30933P().m143405a().mo34625wr(act, str2, privilege);
    }

    /* JADX INFO: renamed from: e */
    public void m37298e(final Act act, final String str, final User user, final y20<User> y20Var) {
        this.f22113e.setText(user.name + ",\t" + user.age);
        this.f22112d.setText(q8g0.m175811p(user.location.distance, true));
        if (ljj.m154509a(str)) {
            uqb0.f180374G.m127120O(this.f22109a, user.picture(0).url, 2, 20);
        } else {
            uqb0.f180374G.m127115L0(this.f22109a, user.picture(0).url);
        }
        bnl0.m105524M(this.f22110b, ((double) pzi0.m174454o()) - user.location.updatedTime < 1.202E7d);
        setOnClickListener(new View.OnClickListener() { // from class: l.d2h0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                y20Var.call(user);
            }
        });
        bnl0.m105509E0(this.f22111c, new View.OnClickListener() { // from class: l.e2h0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f91762a.m37297d(str, act, user, view);
            }
        });
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m37296c(this);
        setBackgroundDrawable(getResources().getDrawable(dbc0.f87624yu));
    }

    public SuggestUserItem(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public SuggestUserItem(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
