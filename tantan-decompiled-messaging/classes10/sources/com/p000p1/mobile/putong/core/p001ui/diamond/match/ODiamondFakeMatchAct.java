package com.p000p1.mobile.putong.core.p001ui.diamond.match;

import android.animation.Animator;
import android.content.Context;
import android.content.Intent;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.app.PutongMvpAct;
import com.p1.mobile.putong.core.CoreModule;
import p003l.pv40;
import p003l.vv40;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class ODiamondFakeMatchAct extends PutongMvpAct<pv40, vv40> {
    /* JADX INFO: renamed from: a2 */
    public static <T extends Act> void m2278a2(T t, String str, String str2) {
        Intent intent = new Intent((Context) t, (Class<?>) ODiamondFakeMatchAct.class);
        intent.putExtra("user", str);
        intent.putExtra("from", str2);
        t.startActivityWithCustomTransition(intent, CoreModule.P().a().hg(t));
    }

    /* JADX INFO: renamed from: Y1, reason: merged with bridge method [inline-methods] */
    public pv40 m2279V1() {
        return new pv40(this);
    }

    /* JADX INFO: renamed from: Z1, reason: merged with bridge method [inline-methods] */
    public vv40 m2280X1() {
        return new vv40(this);
    }

    public Animator enterAnimation() {
        return ((vv40) ((PutongMvpAct) this).d).enterAnimation();
    }

    public Animator exitAnimation() {
        return ((vv40) ((PutongMvpAct) this).d).exitAnimation();
    }

    public void initAnimationState() {
        ((vv40) ((PutongMvpAct) this).d).initAnimationState();
    }

    public boolean needBindBillingService() {
        return true;
    }
}
