package com.p051p1.mobile.putong.core.p058ui.vip.greet;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.p058ui.match.C8619b;
import com.p051p1.mobile.putong.data.OMSDialogPositon;
import com.p051p1.mobile.putong.data.User;
import p151v.VImage;
import p151v.VLinear;
import p153l.bnl0;
import p153l.dxa0;
import p153l.i4g0;
import p153l.jyb;
import p153l.pcj;
import p153l.v3m;
import p153l.y20;

/* JADX INFO: loaded from: classes12.dex */
public class ProfileOneBtnMatchSendView extends VLinear implements v3m {

    /* JADX INFO: renamed from: c */
    public VImage f37917c;

    /* JADX INFO: renamed from: d */
    public TextView f37918d;

    /* JADX INFO: renamed from: e */
    public TextView f37919e;

    /* JADX INFO: renamed from: f */
    public Act f37920f;

    /* JADX INFO: renamed from: g */
    public User f37921g;

    /* JADX INFO: renamed from: h */
    public boolean f37922h;

    public ProfileOneBtnMatchSendView(Context context) {
        super(context);
        this.f37922h = true;
    }

    @Override // p153l.v3m
    /* JADX INFO: renamed from: H */
    public void mo57467H(final User user, boolean z, y20<String> y20Var, pcj<String> pcjVar, final String str) {
        if (user == null) {
            return;
        }
        bnl0.m105509E0(this, new View.OnClickListener() { // from class: l.cxa0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f84192a.m57469R(user, str, view);
            }
        });
    }

    /* JADX INFO: renamed from: Q */
    public final void m57468Q(View view) {
        dxa0.m118462a(this, view);
    }

    /* JADX INFO: renamed from: R */
    public final /* synthetic */ void m57469R(User user, String str, View view) {
        C8619b.m48817m(this.f37920f, user, "");
        i4g0.m138523u("e_odiamond_sayhi", OMSDialogPositon.p_suggest_user_profile_info_view, jyb.m147494Y("showfrom_sayhi", C8619b.m48805C(str)), jyb.m147494Y("other_user_id", user.f56859id));
    }

    @Override // p153l.v3m
    public TextView getEnvelopSayHai() {
        return this.f37918d;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m57468Q(this);
    }

    @Override // p153l.v3m
    /* JADX INFO: renamed from: q */
    public void mo57470q(Act act, String str, User user, pcj<String> pcjVar, String str2) {
        this.f37920f = act;
        this.f37921g = user;
        if (this.f37922h) {
            i4g0.m138492A("e_odiamond_sayhi", OMSDialogPositon.p_suggest_user_profile_info_view, jyb.m147494Y("showfrom_sayhi", C8619b.m48805C(str)), jyb.m147494Y("other_user_id", user == null ? "" : user.f56859id));
            this.f37922h = false;
        }
    }

    public ProfileOneBtnMatchSendView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f37922h = true;
    }
}
