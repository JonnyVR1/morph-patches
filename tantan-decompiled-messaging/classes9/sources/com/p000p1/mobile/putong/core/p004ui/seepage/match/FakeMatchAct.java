package com.p000p1.mobile.putong.core.p004ui.seepage.match;

import android.animation.Animator;
import android.content.Context;
import android.content.Intent;
import com.p000p1.mobile.putong.app.PutongMvpAct;
import com.p000p1.mobile.putong.core.CoreModule;
import com.p1.mobile.android.app.Act;
import p006l.n1g;
import p006l.t1g;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class FakeMatchAct extends PutongMvpAct<n1g, t1g> {
    /* JADX INFO: renamed from: a2 */
    public static <T extends Act> void m8352a2(T t, String str, String str2) {
        Intent intent = new Intent((Context) t, (Class<?>) FakeMatchAct.class);
        intent.putExtra("user", str);
        intent.putExtra("from", str2);
        t.startActivityWithCustomTransition(intent, CoreModule.m1854P().m11706a().m5449hg(t));
    }

    /* JADX INFO: renamed from: b2 */
    public static <T extends Act> void m8353b2(String str, T t) {
        Intent intent = new Intent((Context) t, (Class<?>) FakeMatchAct.class);
        intent.putExtra("user", str);
        t.startActivityWithCustomTransition(intent, CoreModule.m1854P().m11706a().m5449hg(t));
    }

    @Override // com.p000p1.mobile.putong.app.PutongMvpAct
    /* JADX INFO: renamed from: Y1, reason: merged with bridge method [inline-methods] */
    public n1g mo571V1() {
        return new n1g(this);
    }

    @Override // com.p000p1.mobile.putong.app.PutongMvpAct
    /* JADX INFO: renamed from: Z1, reason: merged with bridge method [inline-methods] */
    public t1g mo572X1() {
        return new t1g(this);
    }

    public Animator enterAnimation() {
        return ((t1g) this.f1162d).enterAnimation();
    }

    public Animator exitAnimation() {
        return ((t1g) this.f1162d).exitAnimation();
    }

    public void initAnimationState() {
        ((t1g) this.f1162d).initAnimationState();
    }

    @Override // com.p000p1.mobile.putong.app.PutongAct
    public boolean needBindBillingService() {
        return true;
    }
}
