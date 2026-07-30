package com.p051p1.mobile.putong.core.p058ui.vip.greet;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.TextView;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.data.OMSDialogPositon;
import com.p051p1.mobile.putong.data.User;
import p151v.VFrame;
import p153l.bnl0;
import p153l.kec0;
import p153l.p9r;
import p153l.pcj;
import p153l.pf60;
import p153l.psd0;
import p153l.sfj0;
import p153l.v3m;
import p153l.y20;
import p153l.yza0;

/* JADX INFO: loaded from: classes12.dex */
public class ProfileSendContainerView extends VFrame implements v3m {

    /* JADX INFO: renamed from: a */
    public ViewStub f37923a;

    /* JADX INFO: renamed from: b */
    public ViewStub f37924b;

    /* JADX INFO: renamed from: c */
    public v3m f37925c;

    /* JADX INFO: renamed from: d */
    public View f37926d;

    /* JADX INFO: renamed from: e */
    public int f37927e;

    /* JADX INFO: renamed from: f */
    public boolean f37928f;

    public ProfileSendContainerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f37927e = 2;
        this.f37928f = true;
        m57476u(p9r.m171370a(context), this);
        m57477v();
    }

    /* JADX INFO: renamed from: B */
    public final /* synthetic */ void m57473B(Throwable th) {
        bnl0.m105524M(this, false);
    }

    /* JADX INFO: renamed from: C */
    public void m57474C(Act act, String str, String str2, pcj<String> pcjVar, String str3) {
        if (this.f37927e == 3) {
            m57478w(act, str2, str, pcjVar, str3);
            return;
        }
        if (CoreModule.m30932N().mo61451Co()) {
            ProfileSendGrentAndLetterView profileSendGrentAndLetterView = (ProfileSendGrentAndLetterView) this.f37925c;
            bnl0.m105524M(profileSendGrentAndLetterView.f37935a, true);
            bnl0.m105524M(profileSendGrentAndLetterView.f37936b, false);
            if (this.f37928f) {
                this.f37928f = false;
                sfj0.m185605l("e_send_message", OMSDialogPositon.p_suggest_user_profile_info_view, pf60.m172085a("is_reply", 0), pf60.m172085a("is_match", 0), pf60.m172085a("owner_id", str2));
            }
        }
        m57478w(act, str2, str, pcjVar, str3);
    }

    @Override // p153l.v3m
    /* JADX INFO: renamed from: H */
    public void mo57467H(User user, boolean z, y20<String> y20Var, pcj<String> pcjVar, String str) {
        this.f37925c.mo57467H(user, z, y20Var, pcjVar, str);
    }

    @Override // p153l.v3m
    /* JADX INFO: renamed from: I */
    public void mo57475I(boolean z) {
        this.f37925c.mo57475I(z);
    }

    @Override // p153l.v3m
    public TextView getEnvelopSayHai() {
        return this.f37925c.getEnvelopSayHai();
    }

    @Override // p153l.v3m
    @Deprecated
    /* JADX INFO: renamed from: q */
    public void mo57470q(Act act, String str, User user, pcj<String> pcjVar, String str2) {
        this.f37925c.mo57470q(act, str, user, pcjVar, str2);
    }

    public void setViewLayoutType(int i) {
        this.f37927e = i;
        if (i == 3) {
            bnl0.m105524M(this.f37923a, false);
            if (this.f37926d == null) {
                this.f37926d = this.f37924b.inflate();
            }
            bnl0.m105524M(this.f37926d, true);
            this.f37925c = (v3m) this.f37926d;
        }
    }

    /* JADX INFO: renamed from: u */
    public View m57476u(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return yza0.m218011b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: v */
    public final void m57477v() {
        if (this.f37925c == null) {
            boolean zMo61451Co = CoreModule.m30932N().mo61451Co();
            ViewStub viewStub = this.f37923a;
            if (zMo61451Co) {
                viewStub.setLayoutResource(kec0.f125731Za);
            } else {
                viewStub.setLayoutResource(kec0.f125748ab);
            }
            this.f37925c = (v3m) this.f37923a.inflate();
        }
    }

    /* JADX INFO: renamed from: w */
    public final void m57478w(final Act act, String str, final String str2, final pcj<String> pcjVar, final String str3) {
        act.duringCreated(CoreModule.m30930K().userObsById(str)).take(1).subscribe(psd0.m173597H(new y20() { // from class: l.wza0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f191738a.m57479z(act, str2, pcjVar, str3, (User) obj);
            }
        }, new y20() { // from class: l.xza0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f196842a.m57473B((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ void m57479z(Act act, String str, pcj pcjVar, String str2, User user) {
        bnl0.m105524M(this, true);
        v3m v3mVar = this.f37925c;
        if (TextUtils.isEmpty(str2)) {
            str2 = "";
        }
        v3mVar.mo57470q(act, str, user, pcjVar, str2);
    }

    public ProfileSendContainerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ProfileSendContainerView(Context context) {
        this(context, null);
    }
}
