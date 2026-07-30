package com.p046p1.mobile.putong.core.p053ui.diamond.match;

import android.animation.Animator;
import android.content.Intent;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.app.PutongMvpAct;
import com.p046p1.mobile.putong.core.CoreModule;
import p149l.pv40;
import p149l.vv40;

/* JADX INFO: loaded from: classes10.dex */
public class ODiamondFakeMatchAct extends PutongMvpAct<pv40, vv40> {
    /* JADX INFO: renamed from: a2 */
    public static <T extends Act> void m44964a2(T t, String str, String str2) {
        Intent intent = new Intent(t, (Class<?>) ODiamondFakeMatchAct.class);
        intent.putExtra("user", str);
        intent.putExtra("from", str2);
        t.startActivityWithCustomTransition(intent, CoreModule.m29935P().m94651a().mo33512hg(t));
    }

    @Override // com.p046p1.mobile.putong.app.PutongMvpAct
    /* JADX INFO: renamed from: Y1, reason: merged with bridge method [inline-methods] */
    public pv40 mo28672V1() {
        return new pv40(this);
    }

    @Override // com.p046p1.mobile.putong.app.PutongMvpAct
    /* JADX INFO: renamed from: Z1, reason: merged with bridge method [inline-methods] */
    public vv40 mo28673X1() {
        return new vv40(this);
    }

    @Override // com.p046p1.mobile.android.app.Act
    public Animator enterAnimation() {
        return ((vv40) this.f17173d).enterAnimation();
    }

    @Override // com.p046p1.mobile.android.app.Act
    public Animator exitAnimation() {
        return ((vv40) this.f17173d).exitAnimation();
    }

    @Override // com.p046p1.mobile.android.app.Act
    public void initAnimationState() {
        ((vv40) this.f17173d).initAnimationState();
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct
    public boolean needBindBillingService() {
        return true;
    }
}
