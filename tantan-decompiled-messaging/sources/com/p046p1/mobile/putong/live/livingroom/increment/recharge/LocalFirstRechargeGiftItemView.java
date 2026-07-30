package com.p046p1.mobile.putong.live.livingroom.increment.recharge;

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
import com.p046p1.mobile.putong.live.base.data.BLiveBonus;
import com.p046p1.mobile.putong.live.livingroom.increment.recharge.LocalFirstRechargeGiftItemView;
import p147v.VDraweeView;
import p147v.VImage;
import p147v.VText;
import p149l.bt0;
import p149l.d30;
import p149l.dt0;
import p149l.ehc0;
import p149l.h1c0;
import p149l.h4t;
import p149l.hxs;
import p149l.i3c0;
import p149l.kvc0;
import p149l.qtv;
import p149l.t100;
import p149l.x1e0;
import p149l.xdl0;
import p149l.ypv;

/* JADX INFO: loaded from: classes4.dex */
public class LocalFirstRechargeGiftItemView extends ConstraintLayout {

    /* JADX INFO: renamed from: d */
    public VText f50885d;

    /* JADX INFO: renamed from: e */
    public VDraweeView f50886e;

    /* JADX INFO: renamed from: f */
    public VImage f50887f;

    /* JADX INFO: renamed from: g */
    public VText f50888g;

    /* JADX INFO: renamed from: h */
    public VText f50889h;

    /* JADX INFO: renamed from: i */
    public ConstraintLayout f50890i;

    /* JADX INFO: renamed from: j */
    public VText f50891j;

    /* JADX INFO: renamed from: k */
    public VImage f50892k;

    /* JADX INFO: renamed from: l */
    public VImage f50893l;

    /* JADX INFO: renamed from: m */
    public Animator f50894m;

    /* JADX INFO: renamed from: n */
    public ObjectAnimator f50895n;

    /* JADX INFO: renamed from: o */
    public ObjectAnimator f50896o;

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.increment.recharge.LocalFirstRechargeGiftItemView$a */
    public class C12866a extends bt0.C15966j {
        public C12866a() {
        }

        @Override // p149l.bt0.C15966j, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            xdl0.m208344M(LocalFirstRechargeGiftItemView.this.f50893l, false);
        }

        @Override // p149l.bt0.C15966j, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            xdl0.m208344M(LocalFirstRechargeGiftItemView.this.f50893l, true);
        }
    }

    public LocalFirstRechargeGiftItemView(@NonNull Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: h0 */
    public static /* synthetic */ void m75137h0(d30 d30Var, h4t h4tVar, BLiveBonus bLiveBonus, View view) {
        d30Var.call();
        h4tVar.m206028F2().SchemeHandleEvent.handleScheme().mo172463j(new x1e0.C21018a(3000).m206701e(bLiveBonus.schema).m206699c());
    }

    /* JADX INFO: renamed from: i0 */
    public static /* synthetic */ void m75138i0(String str, h4t h4tVar, BLiveBonus bLiveBonus, View view) {
        str.getClass();
        if (str.equals("notice")) {
            ehc0.m116450g(h4tVar.act(), bLiveBonus.noticeText, null);
        } else if (str.equals("animation")) {
            ehc0.m116450g(h4tVar.act(), bLiveBonus.noticeText, bLiveBonus.resourceId);
        }
    }

    /* JADX INFO: renamed from: j0 */
    public final void m75139j0(View view) {
        qtv.m176486a(this, view);
    }

    /* JADX INFO: renamed from: k0 */
    public final void m75140k0() {
        if (this.f50895n == null) {
            ObjectAnimator objectAnimator = (ObjectAnimator) bt0.m103739l(this.f50893l, View.TRANSLATION_X, 400L, 800L, null, -t100.m186890d(38.0f), t100.m186890d(132.0f));
            this.f50895n = objectAnimator;
            objectAnimator.setRepeatCount(1);
        }
        if (this.f50896o == null) {
            ObjectAnimator objectAnimator2 = (ObjectAnimator) bt0.m103739l(this.f50893l, View.ALPHA, 400L, 800L, null, 1.0f, 0.0f);
            this.f50896o = objectAnimator2;
            objectAnimator2.setRepeatCount(1);
        }
        Animator animatorM103747t = bt0.m103747t(true, new LinearInterpolator(), 800L, new C12866a(), this.f50896o, this.f50895n);
        this.f50894m = animatorM103747t;
        animatorM103747t.start();
    }

    /* JADX INFO: renamed from: l0 */
    public void m75141l0(h4t h4tVar, BLiveBonus bLiveBonus, boolean z, d30 d30Var) {
        this.f50888g.setText(bLiveBonus.title);
        this.f50888g.setTextColor(z ? kvc0.m147352a(h1c0.f105335T0) : kvc0.m147352a(h1c0.f105302D));
        xdl0.m208344M(this.f50890i, z);
        xdl0.m208344M(this.f50889h, !z);
        xdl0.m208357U(this.f50889h, t100.m186890d(z ? 8.0f : 2.0f));
        xdl0.m208344M(this.f50885d, !TextUtils.isEmpty(bLiveBonus.banner));
        if (!TextUtils.isEmpty(bLiveBonus.banner)) {
            this.f50885d.setText(bLiveBonus.banner);
        }
        if (z) {
            m75142m0(h4tVar, bLiveBonus, d30Var);
        } else {
            m75143n0(h4tVar, bLiveBonus);
        }
    }

    /* JADX INFO: renamed from: m0 */
    public final void m75142m0(final h4t h4tVar, final BLiveBonus bLiveBonus, final d30 d30Var) {
        setBackground(kvc0.m147353b(i3c0.f110734I0));
        hxs.m133406s("context_livingAct", this.f50886e, bLiveBonus.bonusIcon);
        boolean zIsEmpty = TextUtils.isEmpty(bLiveBonus.schema);
        boolean z = !zIsEmpty;
        this.f50891j.setText(bLiveBonus.bonusDescription);
        this.f50891j.setTextColor(!zIsEmpty ? kvc0.m147352a(h1c0.f105302D) : kvc0.m147352a(h1c0.f105335T0));
        xdl0.m208344M(this.f50892k, z);
        xdl0.m208368c0(this.f50888g, t100.m186890d(8.0f));
        this.f50890i.setBackground(!zIsEmpty ? ypv.f199497e.getResources().getDrawable(i3c0.f110710G0) : ypv.f199497e.getResources().getDrawable(i3c0.f110722H0));
        if (zIsEmpty) {
            return;
        }
        m75140k0();
        xdl0.m208329E0(this.f50890i, new View.OnClickListener() { // from class: l.otv
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LocalFirstRechargeGiftItemView.m75137h0(d30Var, h4tVar, bLiveBonus, view);
            }
        });
    }

    /* JADX INFO: renamed from: n0 */
    public final void m75143n0(final h4t h4tVar, final BLiveBonus bLiveBonus) {
        setBackground(kvc0.m147353b(i3c0.f110758K0));
        hxs.m133406s("context_livingAct", this.f50886e, bLiveBonus.icon);
        this.f50889h.setText(bLiveBonus.description);
        xdl0.m208357U(this.f50889h, t100.m186890d(10.0f));
        final String str = bLiveBonus.clickAction;
        boolean zIsEmpty = TextUtils.isEmpty(str);
        VImage vImage = this.f50887f;
        if (zIsEmpty) {
            xdl0.m208344M(vImage, false);
        } else {
            xdl0.m208344M(vImage, true);
            if (str.equals("animation")) {
                this.f50887f.setImageDrawable(kvc0.m147353b(i3c0.f110906X1));
            } else if (str.equals("notice")) {
                this.f50887f.setImageDrawable(kvc0.m147353b(i3c0.f110917Y1));
            }
        }
        xdl0.m208329E0(this, new View.OnClickListener() { // from class: l.ptv
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LocalFirstRechargeGiftItemView.m75138i0(str, h4tVar, bLiveBonus, view);
            }
        });
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        dt0.m113503C(this.f50894m);
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m75139j0(this);
    }

    public LocalFirstRechargeGiftItemView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public LocalFirstRechargeGiftItemView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
