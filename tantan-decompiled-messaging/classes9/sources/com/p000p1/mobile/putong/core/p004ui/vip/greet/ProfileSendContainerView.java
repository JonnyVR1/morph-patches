package com.p000p1.mobile.putong.core.p004ui.vip.greet;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.TextView;
import com.p000p1.mobile.putong.core.CoreModule;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.data.User;
import l.e30;
import l.j760;
import l.mkd0;
import l.o6j0;
import l.o7r;
import l.ura0;
import l.v9j;
import l.xdl0;
import p006l.c1m;
import p006l.f6c0;
import v.VFrame;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class ProfileSendContainerView extends VFrame implements c1m {

    /* JADX INFO: renamed from: a */
    public ViewStub f6856a;

    /* JADX INFO: renamed from: b */
    public ViewStub f6857b;

    /* JADX INFO: renamed from: c */
    public c1m f6858c;

    /* JADX INFO: renamed from: d */
    public View f6859d;

    /* JADX INFO: renamed from: e */
    public int f6860e;

    /* JADX INFO: renamed from: f */
    public boolean f6861f;

    /* JADX WARN: Multi-variable type inference failed */
    public ProfileSendContainerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f6860e = 2;
        this.f6861f = true;
        m9727u(o7r.a(context), this);
        m9728v();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: B */
    public final /* synthetic */ void m9724B(Throwable th) {
        xdl0.M(this, false);
    }

    /* JADX INFO: renamed from: C */
    public void m9725C(Act act, String str, String str2, v9j<String> v9jVar, String str3) {
        if (this.f6860e == 3) {
            m9729w(act, str2, str, v9jVar, str3);
            return;
        }
        if (CoreModule.m1853N().Co()) {
            ProfileSendGrentAndLetterView profileSendGrentAndLetterView = (ProfileSendGrentAndLetterView) this.f6858c;
            xdl0.M(profileSendGrentAndLetterView.f6868a, true);
            xdl0.M(profileSendGrentAndLetterView.f6869b, false);
            if (this.f6861f) {
                this.f6861f = false;
                o6j0.l("e_send_message", "p_suggest_user_profile_info_view", new j760[]{j760.a("is_reply", 0), j760.a("is_match", 0), j760.a("owner_id", str2)});
            }
        }
        m9729w(act, str2, str, v9jVar, str3);
    }

    @Override // p006l.c1m
    /* JADX INFO: renamed from: H */
    public void mo9718H(User user, boolean z, e30<String> e30Var, v9j<String> v9jVar, String str) {
        this.f6858c.mo9718H(user, z, e30Var, v9jVar, str);
    }

    @Override // p006l.c1m
    /* JADX INFO: renamed from: I */
    public void mo9726I(boolean z) {
        this.f6858c.mo9726I(z);
    }

    @Override // p006l.c1m
    public TextView getEnvelopSayHai() {
        return this.f6858c.getEnvelopSayHai();
    }

    @Override // p006l.c1m
    @Deprecated
    /* JADX INFO: renamed from: q */
    public void mo9721q(Act act, String str, User user, v9j<String> v9jVar, String str2) {
        this.f6858c.mo9721q(act, str, user, v9jVar, str2);
    }

    public void setViewLayoutType(int i) {
        this.f6860e = i;
        if (i == 3) {
            xdl0.M(this.f6856a, false);
            if (this.f6859d == null) {
                this.f6859d = this.f6857b.inflate();
            }
            xdl0.M(this.f6859d, true);
            this.f6858c = (c1m) this.f6859d;
        }
    }

    /* JADX INFO: renamed from: u */
    public View m9727u(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return ura0.b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: v */
    public final void m9728v() {
        if (this.f6858c == null) {
            boolean zCo = CoreModule.m1853N().Co();
            ViewStub viewStub = this.f6856a;
            if (zCo) {
                viewStub.setLayoutResource(f6c0.f11979Sa);
            } else {
                viewStub.setLayoutResource(f6c0.f11995Ta);
            }
            this.f6858c = (c1m) this.f6856a.inflate();
        }
    }

    /* JADX INFO: renamed from: w */
    public final void m9729w(final Act act, String str, final String str2, final v9j<String> v9jVar, final String str3) {
        act.duringCreated(CoreModule.m1851K().userObsById(str)).take(1).subscribe(mkd0.H(new e30() { // from class: l.sra0
            public final void call(Object obj) {
                this.f21609a.m9730z(act, str2, v9jVar, str3, (User) obj);
            }
        }, new e30() { // from class: l.tra0
            public final void call(Object obj) {
                this.f22246a.m9724B((Throwable) obj);
            }
        }));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: z */
    public final /* synthetic */ void m9730z(Act act, String str, v9j v9jVar, String str2, User user) {
        xdl0.M(this, true);
        c1m c1mVar = this.f6858c;
        if (TextUtils.isEmpty(str2)) {
            str2 = "";
        }
        c1mVar.mo9721q(act, str, user, v9jVar, str2);
    }

    public ProfileSendContainerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ProfileSendContainerView(Context context) {
        this(context, null);
    }
}
