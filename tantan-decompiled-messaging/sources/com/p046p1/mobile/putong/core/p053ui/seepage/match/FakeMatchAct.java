package com.p046p1.mobile.putong.core.p053ui.seepage.match;

import android.animation.Animator;
import android.content.Intent;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.app.PutongMvpAct;
import com.p046p1.mobile.putong.core.CoreModule;
import p149l.n1g;
import p149l.t1g;

/* JADX INFO: loaded from: classes9.dex */
public class FakeMatchAct extends PutongMvpAct<n1g, t1g> {
    /* JADX INFO: renamed from: a2 */
    public static <T extends Act> void m54986a2(T t, String str, String str2) {
        Intent intent = new Intent(t, (Class<?>) FakeMatchAct.class);
        intent.putExtra("user", str);
        intent.putExtra("from", str2);
        t.startActivityWithCustomTransition(intent, CoreModule.m29935P().m94651a().mo33512hg(t));
    }

    /* JADX INFO: renamed from: b2 */
    public static <T extends Act> void m54987b2(String str, T t) {
        Intent intent = new Intent(t, (Class<?>) FakeMatchAct.class);
        intent.putExtra("user", str);
        t.startActivityWithCustomTransition(intent, CoreModule.m29935P().m94651a().mo33512hg(t));
    }

    @Override // com.p046p1.mobile.putong.app.PutongMvpAct
    /* JADX INFO: renamed from: Y1, reason: merged with bridge method [inline-methods] */
    public n1g mo28672V1() {
        return new n1g(this);
    }

    @Override // com.p046p1.mobile.putong.app.PutongMvpAct
    /* JADX INFO: renamed from: Z1, reason: merged with bridge method [inline-methods] */
    public t1g mo28673X1() {
        return new t1g(this);
    }

    @Override // com.p046p1.mobile.android.app.Act
    public Animator enterAnimation() {
        return ((t1g) this.f17173d).enterAnimation();
    }

    @Override // com.p046p1.mobile.android.app.Act
    public Animator exitAnimation() {
        return ((t1g) this.f17173d).exitAnimation();
    }

    @Override // com.p046p1.mobile.android.app.Act
    public void initAnimationState() {
        ((t1g) this.f17173d).initAnimationState();
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct
    public boolean needBindBillingService() {
        return true;
    }
}
