package com.p046p1.mobile.putong.core.p053ui.vip.greet;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.p053ui.match.C8456b;
import com.p046p1.mobile.putong.data.OMSDialogPositon;
import com.p046p1.mobile.putong.data.User;
import p147v.VImage;
import p147v.VLinear;
import p149l.c1m;
import p149l.e30;
import p149l.v9j;
import p149l.vwb;
import p149l.xdl0;
import p149l.zoa0;
import p149l.zvf0;

/* JADX INFO: loaded from: classes9.dex */
public class ProfileOneBtnMatchSendView extends VLinear implements c1m {

    /* JADX INFO: renamed from: c */
    public VImage f37069c;

    /* JADX INFO: renamed from: d */
    public TextView f37070d;

    /* JADX INFO: renamed from: e */
    public TextView f37071e;

    /* JADX INFO: renamed from: f */
    public Act f37072f;

    /* JADX INFO: renamed from: g */
    public User f37073g;

    /* JADX INFO: renamed from: h */
    public boolean f37074h;

    public ProfileOneBtnMatchSendView(Context context) {
        super(context);
        this.f37074h = true;
    }

    @Override // p149l.c1m
    /* JADX INFO: renamed from: H */
    public void mo56284H(final User user, boolean z, e30<String> e30Var, v9j<String> v9jVar, final String str) {
        if (user == null) {
            return;
        }
        xdl0.m208329E0(this, new View.OnClickListener() { // from class: l.yoa0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f199280a.m56286R(user, str, view);
            }
        });
    }

    /* JADX INFO: renamed from: Q */
    public final void m56285Q(View view) {
        zoa0.m219557a(this, view);
    }

    /* JADX INFO: renamed from: R */
    public final /* synthetic */ void m56286R(User user, String str, View view) {
        C8456b.m47634m(this.f37072f, user, "");
        zvf0.m220399u("e_odiamond_sayhi", OMSDialogPositon.p_suggest_user_profile_info_view, vwb.m200311Y("showfrom_sayhi", C8456b.m47622C(str)), vwb.m200311Y("other_user_id", user.f56011id));
    }

    @Override // p149l.c1m
    public TextView getEnvelopSayHai() {
        return this.f37070d;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m56285Q(this);
    }

    @Override // p149l.c1m
    /* JADX INFO: renamed from: q */
    public void mo56287q(Act act, String str, User user, v9j<String> v9jVar, String str2) {
        this.f37072f = act;
        this.f37073g = user;
        if (this.f37074h) {
            zvf0.m220368A("e_odiamond_sayhi", OMSDialogPositon.p_suggest_user_profile_info_view, vwb.m200311Y("showfrom_sayhi", C8456b.m47622C(str)), vwb.m200311Y("other_user_id", user == null ? "" : user.f56011id));
            this.f37074h = false;
        }
    }

    public ProfileOneBtnMatchSendView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f37074h = true;
    }
}
