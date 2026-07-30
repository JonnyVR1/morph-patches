package com.p000p1.mobile.putong.core.p004ui.vip.greet;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.data.User;
import l.bsa0;
import l.e30;
import l.v9j;
import l.xdl0;
import p006l.c1m;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class ProfileSendGrentAndLetterView extends FrameLayout implements c1m {

    /* JADX INFO: renamed from: a */
    public ProfileSendGreetView f6868a;

    /* JADX INFO: renamed from: b */
    public ProfileSendLetterView f6869b;

    public ProfileSendGrentAndLetterView(Context context) {
        super(context);
    }

    @Override // p006l.c1m
    /* JADX INFO: renamed from: H */
    public void mo9718H(User user, boolean z, e30<String> e30Var, v9j<String> v9jVar, String str) {
        if (xdl0.O0(this.f6868a)) {
            this.f6868a.mo9718H(user, z, e30Var, v9jVar, str);
        } else {
            this.f6869b.mo9718H(user, z, e30Var, v9jVar, str);
        }
    }

    @Override // p006l.c1m
    /* JADX INFO: renamed from: I */
    public void mo9726I(boolean z) {
        if (xdl0.O0(this.f6868a)) {
            this.f6868a.mo9726I(z);
        } else {
            this.f6869b.mo9726I(z);
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m9743a(View view) {
        bsa0.a(this, view);
    }

    @Override // p006l.c1m
    public TextView getEnvelopSayHai() {
        return xdl0.O0(this.f6868a) ? this.f6868a.getEnvelopSayHai() : this.f6869b.getEnvelopSayHai();
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m9743a(this);
    }

    @Override // p006l.c1m
    /* JADX INFO: renamed from: q */
    public void mo9721q(Act act, String str, User user, v9j<String> v9jVar, String str2) {
        if (xdl0.O0(this.f6868a)) {
            this.f6868a.mo9721q(act, str, user, v9jVar, str2);
        } else {
            this.f6869b.mo9721q(act, str, user, v9jVar, str2);
        }
    }

    public ProfileSendGrentAndLetterView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ProfileSendGrentAndLetterView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
