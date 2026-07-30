package com.p051p1.mobile.putong.core.p058ui.diamond.match;

import android.animation.Animator;
import android.content.Intent;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.app.PutongMvpAct;
import com.p051p1.mobile.putong.core.CoreModule;
import p153l.e450;
import p153l.k450;

/* JADX INFO: loaded from: classes11.dex */
public class ODiamondFakeMatchAct extends PutongMvpAct<e450, k450> {
    /* JADX INFO: renamed from: b2 */
    public static <T extends Act> void m46147b2(T t, String str, String str2) {
        Intent intent = new Intent(t, (Class<?>) ODiamondFakeMatchAct.class);
        intent.putExtra("user", str);
        intent.putExtra("from", str2);
        t.startActivityWithCustomTransition(intent, CoreModule.m30933P().m143405a().mo34515hg(t));
    }

    @Override // com.p051p1.mobile.putong.app.PutongMvpAct
    /* JADX INFO: renamed from: Z1, reason: merged with bridge method [inline-methods] */
    public e450 mo29671X1() {
        return new e450(this);
    }

    @Override // com.p051p1.mobile.putong.app.PutongMvpAct
    /* JADX INFO: renamed from: a2, reason: merged with bridge method [inline-methods] */
    public k450 mo29672Y1() {
        return new k450(this);
    }

    @Override // com.p051p1.mobile.android.app.Act
    public Animator enterAnimation() {
        return ((k450) this.f17892d).enterAnimation();
    }

    @Override // com.p051p1.mobile.android.app.Act
    public Animator exitAnimation() {
        return ((k450) this.f17892d).exitAnimation();
    }

    @Override // com.p051p1.mobile.android.app.Act
    public void initAnimationState() {
        ((k450) this.f17892d).initAnimationState();
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct
    public boolean needBindBillingService() {
        return true;
    }
}
