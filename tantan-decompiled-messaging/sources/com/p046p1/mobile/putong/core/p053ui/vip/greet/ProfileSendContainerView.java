package com.p046p1.mobile.putong.core.p053ui.vip.greet;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.TextView;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.data.OMSDialogPositon;
import com.p046p1.mobile.putong.data.User;
import p147v.VFrame;
import p149l.c1m;
import p149l.e30;
import p149l.f6c0;
import p149l.j760;
import p149l.mkd0;
import p149l.o6j0;
import p149l.o7r;
import p149l.ura0;
import p149l.v9j;
import p149l.xdl0;

/* JADX INFO: loaded from: classes9.dex */
public class ProfileSendContainerView extends VFrame implements c1m {

    /* JADX INFO: renamed from: a */
    public ViewStub f37075a;

    /* JADX INFO: renamed from: b */
    public ViewStub f37076b;

    /* JADX INFO: renamed from: c */
    public c1m f37077c;

    /* JADX INFO: renamed from: d */
    public View f37078d;

    /* JADX INFO: renamed from: e */
    public int f37079e;

    /* JADX INFO: renamed from: f */
    public boolean f37080f;

    public ProfileSendContainerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f37079e = 2;
        this.f37080f = true;
        m56293u(o7r.m163037a(context), this);
        m56294v();
    }

    /* JADX INFO: renamed from: B */
    public final /* synthetic */ void m56290B(Throwable th) {
        xdl0.m208344M(this, false);
    }

    /* JADX INFO: renamed from: C */
    public void m56291C(Act act, String str, String str2, v9j<String> v9jVar, String str3) {
        if (this.f37079e == 3) {
            m56295w(act, str2, str, v9jVar, str3);
            return;
        }
        if (CoreModule.m29934N().mo60267Co()) {
            ProfileSendGrentAndLetterView profileSendGrentAndLetterView = (ProfileSendGrentAndLetterView) this.f37077c;
            xdl0.m208344M(profileSendGrentAndLetterView.f37087a, true);
            xdl0.m208344M(profileSendGrentAndLetterView.f37088b, false);
            if (this.f37080f) {
                this.f37080f = false;
                o6j0.m162868l("e_send_message", OMSDialogPositon.p_suggest_user_profile_info_view, j760.m140076a("is_reply", 0), j760.m140076a("is_match", 0), j760.m140076a("owner_id", str2));
            }
        }
        m56295w(act, str2, str, v9jVar, str3);
    }

    @Override // p149l.c1m
    /* JADX INFO: renamed from: H */
    public void mo56284H(User user, boolean z, e30<String> e30Var, v9j<String> v9jVar, String str) {
        this.f37077c.mo56284H(user, z, e30Var, v9jVar, str);
    }

    @Override // p149l.c1m
    /* JADX INFO: renamed from: I */
    public void mo56292I(boolean z) {
        this.f37077c.mo56292I(z);
    }

    @Override // p149l.c1m
    public TextView getEnvelopSayHai() {
        return this.f37077c.getEnvelopSayHai();
    }

    @Override // p149l.c1m
    @Deprecated
    /* JADX INFO: renamed from: q */
    public void mo56287q(Act act, String str, User user, v9j<String> v9jVar, String str2) {
        this.f37077c.mo56287q(act, str, user, v9jVar, str2);
    }

    public void setViewLayoutType(int i) {
        this.f37079e = i;
        if (i == 3) {
            xdl0.m208344M(this.f37075a, false);
            if (this.f37078d == null) {
                this.f37078d = this.f37076b.inflate();
            }
            xdl0.m208344M(this.f37078d, true);
            this.f37077c = (c1m) this.f37078d;
        }
    }

    /* JADX INFO: renamed from: u */
    public View m56293u(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return ura0.m195059b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: v */
    public final void m56294v() {
        if (this.f37077c == null) {
            boolean zMo60267Co = CoreModule.m29934N().mo60267Co();
            ViewStub viewStub = this.f37075a;
            if (zMo60267Co) {
                viewStub.setLayoutResource(f6c0.f95565Sa);
            } else {
                viewStub.setLayoutResource(f6c0.f95581Ta);
            }
            this.f37077c = (c1m) this.f37075a.inflate();
        }
    }

    /* JADX INFO: renamed from: w */
    public final void m56295w(final Act act, String str, final String str2, final v9j<String> v9jVar, final String str3) {
        act.duringCreated(CoreModule.m29932K().userObsById(str)).take(1).subscribe(mkd0.m154956H(new e30() { // from class: l.sra0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f166060a.m56296z(act, str2, v9jVar, str3, (User) obj);
            }
        }, new e30() { // from class: l.tra0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f171797a.m56290B((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ void m56296z(Act act, String str, v9j v9jVar, String str2, User user) {
        xdl0.m208344M(this, true);
        c1m c1mVar = this.f37077c;
        if (TextUtils.isEmpty(str2)) {
            str2 = "";
        }
        c1mVar.mo56287q(act, str, user, v9jVar, str2);
    }

    public ProfileSendContainerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ProfileSendContainerView(Context context) {
        this(context, null);
    }
}
