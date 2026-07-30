package com.p000p1.mobile.putong.live.livingroom.increment.recharge;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p000p1.mobile.putong.live.livingroom.increment.recharge.LocalFirstRechargeGiftItemView;
import com.p1.mobile.putong.live.base.data.BLiveBonus;
import l.bt0;
import l.d30;
import l.dt0;
import l.hxs;
import l.kvc0;
import l.t100;
import l.xdl0;
import l.ypv;
import p002l.ehc0;
import p002l.h1c0;
import p002l.h4t;
import p002l.i3c0;
import p002l.qtv;
import p002l.x1e0;
import v.VDraweeView;
import v.VImage;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class LocalFirstRechargeGiftItemView extends ConstraintLayout {

    /* JADX INFO: renamed from: d */
    public VText f6927d;

    /* JADX INFO: renamed from: e */
    public VDraweeView f6928e;

    /* JADX INFO: renamed from: f */
    public VImage f6929f;

    /* JADX INFO: renamed from: g */
    public VText f6930g;

    /* JADX INFO: renamed from: h */
    public VText f6931h;

    /* JADX INFO: renamed from: i */
    public ConstraintLayout f6932i;

    /* JADX INFO: renamed from: j */
    public VText f6933j;

    /* JADX INFO: renamed from: k */
    public VImage f6934k;

    /* JADX INFO: renamed from: l */
    public VImage f6935l;

    /* JADX INFO: renamed from: m */
    public Animator f6936m;

    /* JADX INFO: renamed from: n */
    public ObjectAnimator f6937n;

    /* JADX INFO: renamed from: o */
    public ObjectAnimator f6938o;

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.increment.recharge.LocalFirstRechargeGiftItemView$a */
    public class C0455a extends bt0.j {
        public C0455a() {
        }

        public void onAnimationEnd(Animator animator) {
            xdl0.M(LocalFirstRechargeGiftItemView.this.f6935l, false);
        }

        public void onAnimationStart(Animator animator) {
            xdl0.M(LocalFirstRechargeGiftItemView.this.f6935l, true);
        }
    }

    public LocalFirstRechargeGiftItemView(@NonNull Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: h0 */
    public static /* synthetic */ void m8753h0(d30 d30Var, h4t h4tVar, BLiveBonus bLiveBonus, View view) {
        d30Var.call();
        h4tVar.m25548F2().SchemeHandleEvent.handleScheme().j(new x1e0.C0891a(3000).m25610e(bLiveBonus.schema).m25608c());
    }

    /* JADX INFO: renamed from: i0 */
    public static /* synthetic */ void m8754i0(String str, h4t h4tVar, BLiveBonus bLiveBonus, View view) {
        str.getClass();
        if (str.equals("notice")) {
            ehc0.m12539g(h4tVar.act(), bLiveBonus.noticeText, null);
        } else if (str.equals("animation")) {
            ehc0.m12539g(h4tVar.act(), bLiveBonus.noticeText, bLiveBonus.resourceId);
        }
    }

    /* JADX INFO: renamed from: j0 */
    public final void m8755j0(View view) {
        qtv.m21557a(this, view);
    }

    /* JADX INFO: renamed from: k0 */
    public final void m8756k0() {
        if (this.f6937n == null) {
            ObjectAnimator objectAnimator = (ObjectAnimator) bt0.l(this.f6935l, View.TRANSLATION_X, 400L, 800L, (Interpolator) null, new float[]{-t100.d(38.0f), t100.d(132.0f)});
            this.f6937n = objectAnimator;
            objectAnimator.setRepeatCount(1);
        }
        if (this.f6938o == null) {
            ObjectAnimator objectAnimator2 = (ObjectAnimator) bt0.l(this.f6935l, View.ALPHA, 400L, 800L, (Interpolator) null, new float[]{1.0f, 0.0f});
            this.f6938o = objectAnimator2;
            objectAnimator2.setRepeatCount(1);
        }
        Animator animatorT = bt0.t(true, new LinearInterpolator(), 800L, new C0455a(), new Animator[]{this.f6938o, this.f6937n});
        this.f6936m = animatorT;
        animatorT.start();
    }

    /* JADX INFO: renamed from: l0 */
    public void m8757l0(h4t h4tVar, BLiveBonus bLiveBonus, boolean z, d30 d30Var) {
        this.f6930g.setText(bLiveBonus.title);
        this.f6930g.setTextColor(z ? kvc0.a(h1c0.f11755T0) : kvc0.a(h1c0.f11722D));
        xdl0.M(this.f6932i, z);
        xdl0.M(this.f6931h, !z);
        xdl0.U(this.f6931h, t100.d(z ? 8.0f : 2.0f));
        xdl0.M(this.f6927d, !TextUtils.isEmpty(bLiveBonus.banner));
        if (!TextUtils.isEmpty(bLiveBonus.banner)) {
            this.f6927d.setText(bLiveBonus.banner);
        }
        if (z) {
            m8758m0(h4tVar, bLiveBonus, d30Var);
        } else {
            m8759n0(h4tVar, bLiveBonus);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: m0 */
    public final void m8758m0(final h4t h4tVar, final BLiveBonus bLiveBonus, final d30 d30Var) {
        setBackground(kvc0.b(i3c0.f12519I0));
        hxs.s("context_livingAct", this.f6928e, bLiveBonus.bonusIcon);
        boolean zIsEmpty = TextUtils.isEmpty(bLiveBonus.schema);
        boolean z = !zIsEmpty;
        this.f6933j.setText(bLiveBonus.bonusDescription);
        this.f6933j.setTextColor(!zIsEmpty ? kvc0.a(h1c0.f11722D) : kvc0.a(h1c0.f11755T0));
        xdl0.M(this.f6934k, z);
        xdl0.c0(this.f6930g, t100.d(8.0f));
        this.f6932i.setBackground(!zIsEmpty ? ypv.e.getResources().getDrawable(i3c0.f12495G0) : ypv.e.getResources().getDrawable(i3c0.f12507H0));
        if (zIsEmpty) {
            return;
        }
        m8756k0();
        xdl0.E0(this.f6932i, new View.OnClickListener() { // from class: l.otv
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LocalFirstRechargeGiftItemView.m8753h0(d30Var, h4tVar, bLiveBonus, view);
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: n0 */
    public final void m8759n0(final h4t h4tVar, final BLiveBonus bLiveBonus) {
        setBackground(kvc0.b(i3c0.f12543K0));
        hxs.s("context_livingAct", this.f6928e, bLiveBonus.icon);
        this.f6931h.setText(bLiveBonus.description);
        xdl0.U(this.f6931h, t100.d(10.0f));
        final String str = bLiveBonus.clickAction;
        boolean zIsEmpty = TextUtils.isEmpty(str);
        VImage vImage = this.f6929f;
        if (zIsEmpty) {
            xdl0.M(vImage, false);
        } else {
            xdl0.M(vImage, true);
            if (str.equals("animation")) {
                this.f6929f.setImageDrawable(kvc0.b(i3c0.f12691X1));
            } else if (str.equals("notice")) {
                this.f6929f.setImageDrawable(kvc0.b(i3c0.f12702Y1));
            }
        }
        xdl0.E0(this, new View.OnClickListener() { // from class: l.ptv
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LocalFirstRechargeGiftItemView.m8754i0(str, h4tVar, bLiveBonus, view);
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onDetachedFromWindow() {
        dt0.C(this.f6936m);
        super/*android.view.View*/.onDetachedFromWindow();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onFinishInflate() {
        super/*android.view.View*/.onFinishInflate();
        m8755j0(this);
    }

    public LocalFirstRechargeGiftItemView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public LocalFirstRechargeGiftItemView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
