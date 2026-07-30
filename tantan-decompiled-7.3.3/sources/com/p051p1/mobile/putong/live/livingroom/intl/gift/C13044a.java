package com.p051p1.mobile.putong.live.livingroom.intl.gift;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.util.Property;
import android.view.View;
import com.p051p1.mobile.putong.live.base.data.BLiveGiftCombosGears;
import com.p051p1.mobile.putong.live.livingroom.increment.gift.LiveGiftItemView;
import com.p051p1.mobile.putong.live.livingroom.increment.gift.operation.multiple.LiveMultipleGiftView;
import java.util.List;
import java.util.Objects;
import p153l.bnl0;
import p153l.bri0;
import p153l.gt0;
import p153l.it0;
import p153l.jjs;
import p153l.jne0;
import p153l.kyb;
import p153l.qa00;
import p153l.x20;

/* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.intl.gift.a */
/* JADX INFO: loaded from: classes5.dex */
public class C13044a {

    /* JADX INFO: renamed from: a */
    public IntlMultipleGiftItemView f51895a;

    /* JADX INFO: renamed from: b */
    public IntlMultipleGiftItemView f51896b;

    /* JADX INFO: renamed from: c */
    public IntlMultipleGiftItemView f51897c;

    /* JADX INFO: renamed from: d */
    public jjs f51898d;

    /* JADX INFO: renamed from: e */
    public LiveGiftItemView f51899e;

    /* JADX INFO: renamed from: f */
    public int f51900f;

    /* JADX INFO: renamed from: g */
    public AnimatorSet f51901g;

    /* JADX INFO: renamed from: h */
    public AnimatorSet f51902h;

    /* JADX INFO: renamed from: i */
    public boolean f51903i = false;

    /* JADX INFO: renamed from: j */
    public LiveMultipleGiftView.InterfaceC12974a f51904j;

    public C13044a(IntlMultipleGiftItemView intlMultipleGiftItemView, IntlMultipleGiftItemView intlMultipleGiftItemView2, IntlMultipleGiftItemView intlMultipleGiftItemView3) {
        this.f51895a = intlMultipleGiftItemView;
        this.f51896b = intlMultipleGiftItemView2;
        this.f51897c = intlMultipleGiftItemView3;
        m76542f();
    }

    /* JADX INFO: renamed from: c */
    public final BLiveGiftCombosGears m76539c(int i) {
        List<BLiveGiftCombosGears> list = this.f51898d.m145122h().interactRules.click.combosGears;
        if (kyb.m151952a(list)) {
            return BLiveGiftCombosGears.new_();
        }
        return (i < 0 || i >= list.size()) ? BLiveGiftCombosGears.new_() : list.get(i);
    }

    /* JADX INFO: renamed from: d */
    public final AnimatorSet m76540d(View view) {
        Animator animatorM132168n = gt0.m132168n(view, View.ALPHA, 1.0f, 0.0f);
        animatorM132168n.setDuration(180L);
        animatorM132168n.setInterpolator(null);
        Animator animatorM132168n2 = gt0.m132168n(view, gt0.f106354i, 1.0f, 0.0f);
        animatorM132168n2.setDuration(180L);
        animatorM132168n2.setInterpolator(null);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(animatorM132168n, animatorM132168n2);
        return animatorSet;
    }

    /* JADX INFO: renamed from: e */
    public final AnimatorSet m76541e(View view, int i) {
        Animator animatorM132168n = gt0.m132168n(view, View.ALPHA, 0.0f, 1.0f);
        animatorM132168n.setDuration(230L);
        animatorM132168n.setInterpolator(null);
        Animator animatorM132168n2 = gt0.m132168n(view, gt0.f106354i, 0.0f, 1.1f);
        animatorM132168n2.setDuration(180L);
        animatorM132168n2.setInterpolator(null);
        Animator animatorM132168n3 = gt0.m132168n(view, gt0.f106354i, 1.1f, 1.0f);
        animatorM132168n3.setDuration(120L);
        animatorM132168n3.setInterpolator(null);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playSequentially(animatorM132168n2, animatorM132168n3);
        Property property = View.TRANSLATION_X;
        Animator animatorM132168n4 = gt0.m132168n(view, property, qa00.m175859d(200.0f), -qa00.m175859d(10.0f));
        animatorM132168n4.setDuration(180L);
        animatorM132168n4.setInterpolator(null);
        Animator animatorM132168n5 = gt0.m132168n(view, property, -qa00.m175859d(10.0f), 0.0f);
        animatorM132168n5.setDuration(120L);
        animatorM132168n5.setInterpolator(null);
        new AnimatorSet().playSequentially(animatorM132168n4, animatorM132168n5);
        if (view == this.f51895a) {
            gt0.m132168n(view, View.TRANSLATION_Y, qa00.m175859d(60.0f), 0.0f);
        } else if (view == this.f51897c) {
            gt0.m132168n(view, View.TRANSLATION_Y, -qa00.m175859d(80.0f), 0.0f);
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        Animator animatorM132164j = gt0.m132164j(i);
        animatorSet2.setStartDelay(i);
        animatorSet2.play(animatorM132168n).with(animatorSet).after(animatorM132164j);
        return animatorSet2;
    }

    /* JADX INFO: renamed from: f */
    public final void m76542f() {
        m76550n(this.f51895a, 0);
        m76550n(this.f51896b, 1);
        m76550n(this.f51897c, 2);
        this.f51895a.m76530b(IntlMultipleGiftItemView.IntlContinueType.SMALL);
        this.f51896b.m76530b(IntlMultipleGiftItemView.IntlContinueType.MIDDLE);
        this.f51897c.m76530b(IntlMultipleGiftItemView.IntlContinueType.LARGE);
    }

    /* JADX INFO: renamed from: g */
    public final boolean m76543g(jjs jjsVar) {
        jjs jjsVar2 = this.f51898d;
        return (jjsVar2 == null || jjsVar.m145131q(jjsVar2)) ? false : true;
    }

    /* JADX INFO: renamed from: h */
    public boolean m76544h() {
        return bnl0.m105529O0(this.f51895a) && bnl0.m105529O0(this.f51896b) && bnl0.m105529O0(this.f51897c);
    }

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ void m76545i(IntlMultipleGiftItemView intlMultipleGiftItemView, int i, View view) {
        if (this.f51904j != null) {
            this.f51904j.mo75070a(new jne0(this.f51898d, this.f51899e, i, this.f51900f, (int) intlMultipleGiftItemView.getGears().combosHitNum));
        }
    }

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ void m76546j() {
        m76551o(0);
    }

    /* JADX INFO: renamed from: k */
    public void m76547k() {
        it0.m142007A(this.f51901g);
        it0.m142007A(this.f51902h);
        this.f51898d = null;
        this.f51903i = false;
    }

    /* JADX INFO: renamed from: l */
    public final void m76548l(jjs jjsVar) {
        this.f51895a.m76531c(m76539c(0), jjsVar);
        this.f51896b.m76531c(m76539c(1), jjsVar);
        this.f51897c.m76531c(m76539c(2), jjsVar);
    }

    /* JADX INFO: renamed from: m */
    public void m76549m(LiveGiftItemView liveGiftItemView, jjs jjsVar, int i, LiveMultipleGiftView.InterfaceC12974a interfaceC12974a) {
        it0.m142007A(this.f51902h);
        if (m76543g(jjsVar)) {
            this.f51903i = false;
        }
        this.f51899e = liveGiftItemView;
        this.f51898d = jjsVar;
        this.f51904j = interfaceC12974a;
        this.f51900f = i;
        m76548l(jjsVar);
        if (this.f51903i) {
            m76551o(0);
        } else {
            m76553q();
        }
    }

    /* JADX INFO: renamed from: n */
    public final void m76550n(final IntlMultipleGiftItemView intlMultipleGiftItemView, final int i) {
        intlMultipleGiftItemView.setOnClickListener(new View.OnClickListener() { // from class: l.pno
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f153317a.m76545i(intlMultipleGiftItemView, i, view);
            }
        });
    }

    /* JADX INFO: renamed from: o */
    public void m76551o(int i) {
        if (i == 8 || i == 4) {
            this.f51903i = false;
        }
        bnl0.m105524M(this.f51895a, i == 0);
        bnl0.m105524M(this.f51896b, i == 0);
        bnl0.m105524M(this.f51897c, i == 0);
    }

    /* JADX INFO: renamed from: p */
    public void m76552p(x20 x20Var) {
        it0.m142009C(this.f51902h);
        if (this.f51902h == null) {
            AnimatorSet animatorSetM76540d = m76540d(this.f51895a);
            AnimatorSet animatorSetM76540d2 = m76540d(this.f51896b);
            AnimatorSet animatorSetM76540d3 = m76540d(this.f51897c);
            AnimatorSet animatorSet = new AnimatorSet();
            this.f51902h = animatorSet;
            animatorSet.playTogether(animatorSetM76540d, animatorSetM76540d2, animatorSetM76540d3);
        }
        AnimatorSet animatorSet2 = this.f51902h;
        Objects.requireNonNull(x20Var);
        gt0.m132160f(animatorSet2, new bri0(x20Var));
        this.f51902h.start();
        this.f51903i = false;
    }

    /* JADX INFO: renamed from: q */
    public final void m76553q() {
        this.f51895a.setAlpha(0.0f);
        this.f51896b.setAlpha(0.0f);
        this.f51897c.setAlpha(0.0f);
        if (this.f51901g == null) {
            AnimatorSet animatorSetM76541e = m76541e(this.f51895a, 100);
            AnimatorSet animatorSetM76541e2 = m76541e(this.f51896b, 140);
            AnimatorSet animatorSetM76541e3 = m76541e(this.f51897c, 180);
            AnimatorSet animatorSet = new AnimatorSet();
            this.f51901g = animatorSet;
            animatorSet.playTogether(animatorSetM76541e, animatorSetM76541e2, animatorSetM76541e3);
        }
        gt0.m132176v(this.f51901g, new Runnable() { // from class: l.qno
            @Override // java.lang.Runnable
            public final void run() {
                this.f158509a.m76546j();
            }
        });
        this.f51901g.start();
        this.f51903i = true;
    }
}
