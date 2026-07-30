package com.p051p1.mobile.putong.live.livingroom.increment.recharge;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.LinearInterpolator;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p051p1.mobile.putong.live.base.data.BLiveBonus;
import com.p051p1.mobile.putong.live.livingroom.increment.recharge.LocalFirstRechargeGiftItemView;
import p151v.VDraweeView;
import p151v.VImage;
import p151v.VText;
import p153l.bae0;
import p153l.bnl0;
import p153l.gt0;
import p153l.i6t;
import p153l.it0;
import p153l.izs;
import p153l.lpc0;
import p153l.n3d0;
import p153l.n9c0;
import p153l.obc0;
import p153l.qa00;
import p153l.rvv;
import p153l.x20;
import p153l.zrv;

/* JADX INFO: loaded from: classes4.dex */
public class LocalFirstRechargeGiftItemView extends ConstraintLayout {

    /* JADX INFO: renamed from: d */
    public VText f51733d;

    /* JADX INFO: renamed from: e */
    public VDraweeView f51734e;

    /* JADX INFO: renamed from: f */
    public VImage f51735f;

    /* JADX INFO: renamed from: g */
    public VText f51736g;

    /* JADX INFO: renamed from: h */
    public VText f51737h;

    /* JADX INFO: renamed from: i */
    public ConstraintLayout f51738i;

    /* JADX INFO: renamed from: j */
    public VText f51739j;

    /* JADX INFO: renamed from: k */
    public VImage f51740k;

    /* JADX INFO: renamed from: l */
    public VImage f51741l;

    /* JADX INFO: renamed from: m */
    public Animator f51742m;

    /* JADX INFO: renamed from: n */
    public ObjectAnimator f51743n;

    /* JADX INFO: renamed from: o */
    public ObjectAnimator f51744o;

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.increment.recharge.LocalFirstRechargeGiftItemView$a */
    public class C13029a extends gt0.C17308j {
        public C13029a() {
        }

        @Override // p153l.gt0.C17308j, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            bnl0.m105524M(LocalFirstRechargeGiftItemView.this.f51741l, false);
        }

        @Override // p153l.gt0.C17308j, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            bnl0.m105524M(LocalFirstRechargeGiftItemView.this.f51741l, true);
        }
    }

    public LocalFirstRechargeGiftItemView(@NonNull Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: h0 */
    public static /* synthetic */ void m76320h0(x20 x20Var, i6t i6tVar, BLiveBonus bLiveBonus, View view) {
        x20Var.call();
        i6tVar.m213811F2().SchemeHandleEvent.handleScheme().mo199273j(new bae0.C15953a(3000).m103154e(bLiveBonus.schema).m103152c());
    }

    /* JADX INFO: renamed from: i0 */
    public static /* synthetic */ void m76321i0(String str, i6t i6tVar, BLiveBonus bLiveBonus, View view) {
        str.getClass();
        if (str.equals("notice")) {
            lpc0.m155177g(i6tVar.act(), bLiveBonus.noticeText, null);
        } else if (str.equals("animation")) {
            lpc0.m155177g(i6tVar.act(), bLiveBonus.noticeText, bLiveBonus.resourceId);
        }
    }

    /* JADX INFO: renamed from: j0 */
    public final void m76322j0(View view) {
        rvv.m183319a(this, view);
    }

    /* JADX INFO: renamed from: k0 */
    public final void m76323k0() {
        if (this.f51743n == null) {
            ObjectAnimator objectAnimator = (ObjectAnimator) gt0.m132166l(this.f51741l, View.TRANSLATION_X, 400L, 800L, null, -qa00.m175859d(38.0f), qa00.m175859d(132.0f));
            this.f51743n = objectAnimator;
            objectAnimator.setRepeatCount(1);
        }
        if (this.f51744o == null) {
            ObjectAnimator objectAnimator2 = (ObjectAnimator) gt0.m132166l(this.f51741l, View.ALPHA, 400L, 800L, null, 1.0f, 0.0f);
            this.f51744o = objectAnimator2;
            objectAnimator2.setRepeatCount(1);
        }
        Animator animatorM132174t = gt0.m132174t(true, new LinearInterpolator(), 800L, new C13029a(), this.f51744o, this.f51743n);
        this.f51742m = animatorM132174t;
        animatorM132174t.start();
    }

    /* JADX INFO: renamed from: l0 */
    public void m76324l0(i6t i6tVar, BLiveBonus bLiveBonus, boolean z, x20 x20Var) {
        this.f51736g.setText(bLiveBonus.title);
        this.f51736g.setTextColor(z ? n3d0.m161277a(n9c0.f140796T0) : n3d0.m161277a(n9c0.f140763D));
        bnl0.m105524M(this.f51738i, z);
        bnl0.m105524M(this.f51737h, !z);
        bnl0.m105537U(this.f51737h, qa00.m175859d(z ? 8.0f : 2.0f));
        bnl0.m105524M(this.f51733d, !TextUtils.isEmpty(bLiveBonus.banner));
        if (!TextUtils.isEmpty(bLiveBonus.banner)) {
            this.f51733d.setText(bLiveBonus.banner);
        }
        if (z) {
            m76325m0(i6tVar, bLiveBonus, x20Var);
        } else {
            m76326n0(i6tVar, bLiveBonus);
        }
    }

    /* JADX INFO: renamed from: m0 */
    public final void m76325m0(final i6t i6tVar, final BLiveBonus bLiveBonus, final x20 x20Var) {
        setBackground(n3d0.m161278b(obc0.f146062I0));
        izs.m142868s("context_livingAct", this.f51734e, bLiveBonus.bonusIcon);
        boolean zIsEmpty = TextUtils.isEmpty(bLiveBonus.schema);
        boolean z = !zIsEmpty;
        this.f51739j.setText(bLiveBonus.bonusDescription);
        this.f51739j.setTextColor(!zIsEmpty ? n3d0.m161277a(n9c0.f140763D) : n3d0.m161277a(n9c0.f140796T0));
        bnl0.m105524M(this.f51740k, z);
        bnl0.m105548c0(this.f51736g, qa00.m175859d(8.0f));
        this.f51738i.setBackground(!zIsEmpty ? zrv.f205803e.getResources().getDrawable(obc0.f146038G0) : zrv.f205803e.getResources().getDrawable(obc0.f146050H0));
        if (zIsEmpty) {
            return;
        }
        m76323k0();
        bnl0.m105509E0(this.f51738i, new View.OnClickListener() { // from class: l.pvv
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LocalFirstRechargeGiftItemView.m76320h0(x20Var, i6tVar, bLiveBonus, view);
            }
        });
    }

    /* JADX INFO: renamed from: n0 */
    public final void m76326n0(final i6t i6tVar, final BLiveBonus bLiveBonus) {
        setBackground(n3d0.m161278b(obc0.f146086K0));
        izs.m142868s("context_livingAct", this.f51734e, bLiveBonus.icon);
        this.f51737h.setText(bLiveBonus.description);
        bnl0.m105537U(this.f51737h, qa00.m175859d(10.0f));
        final String str = bLiveBonus.clickAction;
        boolean zIsEmpty = TextUtils.isEmpty(str);
        VImage vImage = this.f51735f;
        if (zIsEmpty) {
            bnl0.m105524M(vImage, false);
        } else {
            bnl0.m105524M(vImage, true);
            if (str.equals("animation")) {
                this.f51735f.setImageDrawable(n3d0.m161278b(obc0.f146234X1));
            } else if (str.equals("notice")) {
                this.f51735f.setImageDrawable(n3d0.m161278b(obc0.f146245Y1));
            }
        }
        bnl0.m105509E0(this, new View.OnClickListener() { // from class: l.qvv
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LocalFirstRechargeGiftItemView.m76321i0(str, i6tVar, bLiveBonus, view);
            }
        });
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        it0.m142009C(this.f51742m);
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m76322j0(this);
    }

    public LocalFirstRechargeGiftItemView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public LocalFirstRechargeGiftItemView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
