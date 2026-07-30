package com.p051p1.mobile.putong.core.p058ui.seepage.match;

import android.animation.Animator;
import android.content.Intent;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.app.PutongMvpAct;
import com.p051p1.mobile.putong.core.CoreModule;
import p153l.b3g;
import p153l.h3g;

/* JADX INFO: loaded from: classes12.dex */
public class FakeMatchAct extends PutongMvpAct<b3g, h3g> {
    /* JADX INFO: renamed from: b2 */
    public static <T extends Act> void m56169b2(T t, String str, String str2) {
        Intent intent = new Intent(t, (Class<?>) FakeMatchAct.class);
        intent.putExtra("user", str);
        intent.putExtra("from", str2);
        t.startActivityWithCustomTransition(intent, CoreModule.m30933P().m143405a().mo34515hg(t));
    }

    /* JADX INFO: renamed from: c2 */
    public static <T extends Act> void m56170c2(String str, T t) {
        Intent intent = new Intent(t, (Class<?>) FakeMatchAct.class);
        intent.putExtra("user", str);
        t.startActivityWithCustomTransition(intent, CoreModule.m30933P().m143405a().mo34515hg(t));
    }

    @Override // com.p051p1.mobile.putong.app.PutongMvpAct
    /* JADX INFO: renamed from: Z1, reason: merged with bridge method [inline-methods] */
    public b3g mo29671X1() {
        return new b3g(this);
    }

    @Override // com.p051p1.mobile.putong.app.PutongMvpAct
    /* JADX INFO: renamed from: a2, reason: merged with bridge method [inline-methods] */
    public h3g mo29672Y1() {
        return new h3g(this);
    }

    @Override // com.p051p1.mobile.android.app.Act
    public Animator enterAnimation() {
        return ((h3g) this.f17892d).enterAnimation();
    }

    @Override // com.p051p1.mobile.android.app.Act
    public Animator exitAnimation() {
        return ((h3g) this.f17892d).exitAnimation();
    }

    @Override // com.p051p1.mobile.android.app.Act
    public void initAnimationState() {
        ((h3g) this.f17892d).initAnimationState();
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct
    public boolean needBindBillingService() {
        return true;
    }
}
