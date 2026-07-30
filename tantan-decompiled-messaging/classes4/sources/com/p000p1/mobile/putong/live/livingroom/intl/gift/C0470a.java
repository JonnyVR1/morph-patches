package com.p000p1.mobile.putong.live.livingroom.intl.gift;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.util.Property;
import android.view.View;
import com.p000p1.mobile.putong.live.livingroom.increment.gift.LiveGiftItemView;
import com.p000p1.mobile.putong.live.livingroom.increment.gift.operation.multiple.LiveMultipleGiftView;
import com.p1.mobile.putong.live.base.data.BLiveGiftCombosGears;
import java.util.List;
import java.util.Objects;
import l.bii0;
import l.bt0;
import l.d30;
import l.dt0;
import l.t100;
import l.wwb;
import l.xdl0;
import p002l.efe0;
import p002l.ihs;

/* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.intl.gift.a */
/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class C0470a {

    /* JADX INFO: renamed from: a */
    public IntlMultipleGiftItemView f7089a;

    /* JADX INFO: renamed from: b */
    public IntlMultipleGiftItemView f7090b;

    /* JADX INFO: renamed from: c */
    public IntlMultipleGiftItemView f7091c;

    /* JADX INFO: renamed from: d */
    public ihs f7092d;

    /* JADX INFO: renamed from: e */
    public LiveGiftItemView f7093e;

    /* JADX INFO: renamed from: f */
    public int f7094f;

    /* JADX INFO: renamed from: g */
    public AnimatorSet f7095g;

    /* JADX INFO: renamed from: h */
    public AnimatorSet f7096h;

    /* JADX INFO: renamed from: i */
    public boolean f7097i = false;

    /* JADX INFO: renamed from: j */
    public LiveMultipleGiftView.InterfaceC0400a f7098j;

    public C0470a(IntlMultipleGiftItemView intlMultipleGiftItemView, IntlMultipleGiftItemView intlMultipleGiftItemView2, IntlMultipleGiftItemView intlMultipleGiftItemView3) {
        this.f7089a = intlMultipleGiftItemView;
        this.f7090b = intlMultipleGiftItemView2;
        this.f7091c = intlMultipleGiftItemView3;
        m8982f();
    }

    /* JADX INFO: renamed from: c */
    public final BLiveGiftCombosGears m8979c(int i) {
        List list = this.f7092d.m15160h().interactRules.click.combosGears;
        if (wwb.a(list)) {
            return BLiveGiftCombosGears.new_();
        }
        return (i < 0 || i >= list.size()) ? BLiveGiftCombosGears.new_() : (BLiveGiftCombosGears) list.get(i);
    }

    /* JADX INFO: renamed from: d */
    public final AnimatorSet m8980d(View view) {
        Animator animatorN = bt0.n(view, View.ALPHA, new float[]{1.0f, 0.0f});
        animatorN.setDuration(180L);
        animatorN.setInterpolator(null);
        Animator animatorN2 = bt0.n(view, bt0.i, new float[]{1.0f, 0.0f});
        animatorN2.setDuration(180L);
        animatorN2.setInterpolator(null);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(animatorN, animatorN2);
        return animatorSet;
    }

    /* JADX INFO: renamed from: e */
    public final AnimatorSet m8981e(View view, int i) {
        Animator animatorN = bt0.n(view, View.ALPHA, new float[]{0.0f, 1.0f});
        animatorN.setDuration(230L);
        animatorN.setInterpolator(null);
        Animator animatorN2 = bt0.n(view, bt0.i, new float[]{0.0f, 1.1f});
        animatorN2.setDuration(180L);
        animatorN2.setInterpolator(null);
        Animator animatorN3 = bt0.n(view, bt0.i, new float[]{1.1f, 1.0f});
        animatorN3.setDuration(120L);
        animatorN3.setInterpolator(null);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playSequentially(animatorN2, animatorN3);
        Property property = View.TRANSLATION_X;
        Animator animatorN4 = bt0.n(view, property, new float[]{t100.d(200.0f), -t100.d(10.0f)});
        animatorN4.setDuration(180L);
        animatorN4.setInterpolator(null);
        Animator animatorN5 = bt0.n(view, property, new float[]{-t100.d(10.0f), 0.0f});
        animatorN5.setDuration(120L);
        animatorN5.setInterpolator(null);
        new AnimatorSet().playSequentially(animatorN4, animatorN5);
        if (view == this.f7089a) {
            bt0.n(view, View.TRANSLATION_Y, new float[]{t100.d(60.0f), 0.0f});
        } else if (view == this.f7091c) {
            bt0.n(view, View.TRANSLATION_Y, new float[]{-t100.d(80.0f), 0.0f});
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        Animator animatorJ = bt0.j(i);
        animatorSet2.setStartDelay(i);
        animatorSet2.play(animatorN).with(animatorSet).after(animatorJ);
        return animatorSet2;
    }

    /* JADX INFO: renamed from: f */
    public final void m8982f() {
        m8990n(this.f7089a, 0);
        m8990n(this.f7090b, 1);
        m8990n(this.f7091c, 2);
        this.f7089a.m8970b(IntlMultipleGiftItemView.IntlContinueType.SMALL);
        this.f7090b.m8970b(IntlMultipleGiftItemView.IntlContinueType.MIDDLE);
        this.f7091c.m8970b(IntlMultipleGiftItemView.IntlContinueType.LARGE);
    }

    /* JADX INFO: renamed from: g */
    public final boolean m8983g(ihs ihsVar) {
        ihs ihsVar2 = this.f7092d;
        return (ihsVar2 == null || ihsVar.m15169q(ihsVar2)) ? false : true;
    }

    /* JADX INFO: renamed from: h */
    public boolean m8984h() {
        return xdl0.O0(this.f7089a) && xdl0.O0(this.f7090b) && xdl0.O0(this.f7091c);
    }

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ void m8985i(IntlMultipleGiftItemView intlMultipleGiftItemView, int i, View view) {
        if (this.f7098j != null) {
            this.f7098j.mo7443a(new efe0(this.f7092d, this.f7093e, i, this.f7094f, (int) intlMultipleGiftItemView.getGears().combosHitNum));
        }
    }

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ void m8986j() {
        m8991o(0);
    }

    /* JADX INFO: renamed from: k */
    public void m8987k() {
        dt0.A(this.f7095g);
        dt0.A(this.f7096h);
        this.f7092d = null;
        this.f7097i = false;
    }

    /* JADX INFO: renamed from: l */
    public final void m8988l(ihs ihsVar) {
        this.f7089a.m8971c(m8979c(0), ihsVar);
        this.f7090b.m8971c(m8979c(1), ihsVar);
        this.f7091c.m8971c(m8979c(2), ihsVar);
    }

    /* JADX INFO: renamed from: m */
    public void m8989m(LiveGiftItemView liveGiftItemView, ihs ihsVar, int i, LiveMultipleGiftView.InterfaceC0400a interfaceC0400a) {
        dt0.A(this.f7096h);
        if (m8983g(ihsVar)) {
            this.f7097i = false;
        }
        this.f7093e = liveGiftItemView;
        this.f7092d = ihsVar;
        this.f7098j = interfaceC0400a;
        this.f7094f = i;
        m8988l(ihsVar);
        if (this.f7097i) {
            m8991o(0);
        } else {
            m8993q();
        }
    }

    /* JADX INFO: renamed from: n */
    public final void m8990n(final IntlMultipleGiftItemView intlMultipleGiftItemView, final int i) {
        intlMultipleGiftItemView.setOnClickListener(new View.OnClickListener() { // from class: l.plo
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f17529a.m8985i(intlMultipleGiftItemView, i, view);
            }
        });
    }

    /* JADX INFO: renamed from: o */
    public void m8991o(int i) {
        if (i == 8 || i == 4) {
            this.f7097i = false;
        }
        xdl0.M(this.f7089a, i == 0);
        xdl0.M(this.f7090b, i == 0);
        xdl0.M(this.f7091c, i == 0);
    }

    /* JADX INFO: renamed from: p */
    public void m8992p(d30 d30Var) {
        dt0.C(this.f7096h);
        if (this.f7096h == null) {
            AnimatorSet animatorSetM8980d = m8980d(this.f7089a);
            AnimatorSet animatorSetM8980d2 = m8980d(this.f7090b);
            AnimatorSet animatorSetM8980d3 = m8980d(this.f7091c);
            AnimatorSet animatorSet = new AnimatorSet();
            this.f7096h = animatorSet;
            animatorSet.playTogether(animatorSetM8980d, animatorSetM8980d2, animatorSetM8980d3);
        }
        AnimatorSet animatorSet2 = this.f7096h;
        Objects.requireNonNull(d30Var);
        bt0.f(animatorSet2, new bii0(d30Var));
        this.f7096h.start();
        this.f7097i = false;
    }

    /* JADX INFO: renamed from: q */
    public final void m8993q() {
        this.f7089a.setAlpha(0.0f);
        this.f7090b.setAlpha(0.0f);
        this.f7091c.setAlpha(0.0f);
        if (this.f7095g == null) {
            AnimatorSet animatorSetM8981e = m8981e(this.f7089a, 100);
            AnimatorSet animatorSetM8981e2 = m8981e(this.f7090b, 140);
            AnimatorSet animatorSetM8981e3 = m8981e(this.f7091c, 180);
            AnimatorSet animatorSet = new AnimatorSet();
            this.f7095g = animatorSet;
            animatorSet.playTogether(animatorSetM8981e, animatorSetM8981e2, animatorSetM8981e3);
        }
        bt0.v(this.f7095g, new Runnable() { // from class: l.qlo
            @Override // java.lang.Runnable
            public final void run() {
                this.f18085a.m8986j();
            }
        });
        this.f7095g.start();
        this.f7097i = true;
    }
}
