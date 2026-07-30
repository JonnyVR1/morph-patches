package com.p046p1.mobile.putong.core.p053ui.vip.greet;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.data.User;
import p149l.bsa0;
import p149l.c1m;
import p149l.e30;
import p149l.v9j;
import p149l.xdl0;

/* JADX INFO: loaded from: classes9.dex */
public class ProfileSendGrentAndLetterView extends FrameLayout implements c1m {

    /* JADX INFO: renamed from: a */
    public ProfileSendGreetView f37087a;

    /* JADX INFO: renamed from: b */
    public ProfileSendLetterView f37088b;

    public ProfileSendGrentAndLetterView(Context context) {
        super(context);
    }

    @Override // p149l.c1m
    /* JADX INFO: renamed from: H */
    public void mo56284H(User user, boolean z, e30<String> e30Var, v9j<String> v9jVar, String str) {
        if (xdl0.m208349O0(this.f37087a)) {
            this.f37087a.mo56284H(user, z, e30Var, v9jVar, str);
        } else {
            this.f37088b.mo56284H(user, z, e30Var, v9jVar, str);
        }
    }

    @Override // p149l.c1m
    /* JADX INFO: renamed from: I */
    public void mo56292I(boolean z) {
        if (xdl0.m208349O0(this.f37087a)) {
            this.f37087a.mo56292I(z);
        } else {
            this.f37088b.mo56292I(z);
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m56309a(View view) {
        bsa0.m103659a(this, view);
    }

    @Override // p149l.c1m
    public TextView getEnvelopSayHai() {
        return xdl0.m208349O0(this.f37087a) ? this.f37087a.getEnvelopSayHai() : this.f37088b.getEnvelopSayHai();
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m56309a(this);
    }

    @Override // p149l.c1m
    /* JADX INFO: renamed from: q */
    public void mo56287q(Act act, String str, User user, v9j<String> v9jVar, String str2) {
        if (xdl0.m208349O0(this.f37087a)) {
            this.f37087a.mo56287q(act, str, user, v9jVar, str2);
        } else {
            this.f37088b.mo56287q(act, str, user, v9jVar, str2);
        }
    }

    public ProfileSendGrentAndLetterView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ProfileSendGrentAndLetterView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
