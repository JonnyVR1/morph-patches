package com.p000p1.mobile.putong.core.p004ui.vip.greet;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.core.ui.match.b;
import com.p1.mobile.putong.data.User;
import com.tantanapp.common.data.DbObject;
import l.e30;
import l.j760;
import l.v9j;
import l.vwb;
import l.xdl0;
import l.zoa0;
import l.zvf0;
import p006l.c1m;
import v.VImage;
import v.VLinear;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class ProfileOneBtnMatchSendView extends VLinear implements c1m {

    /* JADX INFO: renamed from: c */
    public VImage f6850c;

    /* JADX INFO: renamed from: d */
    public TextView f6851d;

    /* JADX INFO: renamed from: e */
    public TextView f6852e;

    /* JADX INFO: renamed from: f */
    public Act f6853f;

    /* JADX INFO: renamed from: g */
    public User f6854g;

    /* JADX INFO: renamed from: h */
    public boolean f6855h;

    public ProfileOneBtnMatchSendView(Context context) {
        super(context);
        this.f6855h = true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p006l.c1m
    /* JADX INFO: renamed from: H */
    public void mo9718H(final User user, boolean z, e30<String> e30Var, v9j<String> v9jVar, final String str) {
        if (user == null) {
            return;
        }
        xdl0.E0(this, new View.OnClickListener() { // from class: l.yoa0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f28319a.m9720R(user, str, view);
            }
        });
    }

    /* JADX INFO: renamed from: Q */
    public final void m9719Q(View view) {
        zoa0.a(this, view);
    }

    /* JADX INFO: renamed from: R */
    public final /* synthetic */ void m9720R(User user, String str, View view) {
        b.m(this.f6853f, user, "");
        zvf0.u("e_odiamond_sayhi", "p_suggest_user_profile_info_view", new j760[]{vwb.Y("showfrom_sayhi", b.C(str)), vwb.Y("other_user_id", ((DbObject) user).id)});
    }

    @Override // p006l.c1m
    public TextView getEnvelopSayHai() {
        return this.f6851d;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onFinishInflate() {
        super/*android.view.View*/.onFinishInflate();
        m9719Q(this);
    }

    @Override // p006l.c1m
    /* JADX INFO: renamed from: q */
    public void mo9721q(Act act, String str, User user, v9j<String> v9jVar, String str2) {
        this.f6853f = act;
        this.f6854g = user;
        if (this.f6855h) {
            zvf0.A("e_odiamond_sayhi", "p_suggest_user_profile_info_view", new j760[]{vwb.Y("showfrom_sayhi", b.C(str)), vwb.Y("other_user_id", user == null ? "" : ((DbObject) user).id)});
            this.f6855h = false;
        }
    }

    public ProfileOneBtnMatchSendView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f6855h = true;
    }
}
