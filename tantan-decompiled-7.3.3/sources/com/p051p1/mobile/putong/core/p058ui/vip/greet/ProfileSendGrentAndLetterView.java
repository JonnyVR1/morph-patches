package com.p051p1.mobile.putong.core.p058ui.vip.greet;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.data.User;
import p153l.bnl0;
import p153l.f0b0;
import p153l.pcj;
import p153l.v3m;
import p153l.y20;

/* JADX INFO: loaded from: classes12.dex */
public class ProfileSendGrentAndLetterView extends FrameLayout implements v3m {

    /* JADX INFO: renamed from: a */
    public ProfileSendGreetView f37935a;

    /* JADX INFO: renamed from: b */
    public ProfileSendLetterView f37936b;

    public ProfileSendGrentAndLetterView(Context context) {
        super(context);
    }

    @Override // p153l.v3m
    /* JADX INFO: renamed from: H */
    public void mo57467H(User user, boolean z, y20<String> y20Var, pcj<String> pcjVar, String str) {
        if (bnl0.m105529O0(this.f37935a)) {
            this.f37935a.mo57467H(user, z, y20Var, pcjVar, str);
        } else {
            this.f37936b.mo57467H(user, z, y20Var, pcjVar, str);
        }
    }

    @Override // p153l.v3m
    /* JADX INFO: renamed from: I */
    public void mo57475I(boolean z) {
        if (bnl0.m105529O0(this.f37935a)) {
            this.f37935a.mo57475I(z);
        } else {
            this.f37936b.mo57475I(z);
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m57492a(View view) {
        f0b0.m123477a(this, view);
    }

    @Override // p153l.v3m
    public TextView getEnvelopSayHai() {
        return bnl0.m105529O0(this.f37935a) ? this.f37935a.getEnvelopSayHai() : this.f37936b.getEnvelopSayHai();
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m57492a(this);
    }

    @Override // p153l.v3m
    /* JADX INFO: renamed from: q */
    public void mo57470q(Act act, String str, User user, pcj<String> pcjVar, String str2) {
        if (bnl0.m105529O0(this.f37935a)) {
            this.f37935a.mo57470q(act, str, user, pcjVar, str2);
        } else {
            this.f37936b.mo57470q(act, str, user, pcjVar, str2);
        }
    }

    public ProfileSendGrentAndLetterView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ProfileSendGrentAndLetterView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
