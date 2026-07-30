package com.p046p1.mobile.putong.live.livingroom.intl.gift;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.util.Property;
import android.view.View;
import com.p046p1.mobile.putong.live.base.data.BLiveGiftCombosGears;
import com.p046p1.mobile.putong.live.livingroom.increment.gift.LiveGiftItemView;
import com.p046p1.mobile.putong.live.livingroom.increment.gift.operation.multiple.LiveMultipleGiftView;
import java.util.List;
import java.util.Objects;
import p149l.bii0;
import p149l.bt0;
import p149l.d30;
import p149l.dt0;
import p149l.efe0;
import p149l.ihs;
import p149l.t100;
import p149l.wwb;
import p149l.xdl0;

/* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.intl.gift.a */
/* JADX INFO: loaded from: classes4.dex */
public class C12881a {

    /* JADX INFO: renamed from: a */
    public IntlMultipleGiftItemView f51047a;

    /* JADX INFO: renamed from: b */
    public IntlMultipleGiftItemView f51048b;

    /* JADX INFO: renamed from: c */
    public IntlMultipleGiftItemView f51049c;

    /* JADX INFO: renamed from: d */
    public ihs f51050d;

    /* JADX INFO: renamed from: e */
    public LiveGiftItemView f51051e;

    /* JADX INFO: renamed from: f */
    public int f51052f;

    /* JADX INFO: renamed from: g */
    public AnimatorSet f51053g;

    /* JADX INFO: renamed from: h */
    public AnimatorSet f51054h;

    /* JADX INFO: renamed from: i */
    public boolean f51055i = false;

    /* JADX INFO: renamed from: j */
    public LiveMultipleGiftView.InterfaceC12811a f51056j;

    public C12881a(IntlMultipleGiftItemView intlMultipleGiftItemView, IntlMultipleGiftItemView intlMultipleGiftItemView2, IntlMultipleGiftItemView intlMultipleGiftItemView3) {
        this.f51047a = intlMultipleGiftItemView;
        this.f51048b = intlMultipleGiftItemView2;
        this.f51049c = intlMultipleGiftItemView3;
        m75359f();
    }

    /* JADX INFO: renamed from: c */
    public final BLiveGiftCombosGears m75356c(int i) {
        List<BLiveGiftCombosGears> list = this.f51050d.m136283h().interactRules.click.combosGears;
        if (wwb.m205852a(list)) {
            return BLiveGiftCombosGears.new_();
        }
        return (i < 0 || i >= list.size()) ? BLiveGiftCombosGears.new_() : list.get(i);
    }

    /* JADX INFO: renamed from: d */
    public final AnimatorSet m75357d(View view) {
        Animator animatorM103741n = bt0.m103741n(view, View.ALPHA, 1.0f, 0.0f);
        animatorM103741n.setDuration(180L);
        animatorM103741n.setInterpolator(null);
        Animator animatorM103741n2 = bt0.m103741n(view, bt0.f77162i, 1.0f, 0.0f);
        animatorM103741n2.setDuration(180L);
        animatorM103741n2.setInterpolator(null);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(animatorM103741n, animatorM103741n2);
        return animatorSet;
    }

    /* JADX INFO: renamed from: e */
    public final AnimatorSet m75358e(View view, int i) {
        Animator animatorM103741n = bt0.m103741n(view, View.ALPHA, 0.0f, 1.0f);
        animatorM103741n.setDuration(230L);
        animatorM103741n.setInterpolator(null);
        Animator animatorM103741n2 = bt0.m103741n(view, bt0.f77162i, 0.0f, 1.1f);
        animatorM103741n2.setDuration(180L);
        animatorM103741n2.setInterpolator(null);
        Animator animatorM103741n3 = bt0.m103741n(view, bt0.f77162i, 1.1f, 1.0f);
        animatorM103741n3.setDuration(120L);
        animatorM103741n3.setInterpolator(null);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playSequentially(animatorM103741n2, animatorM103741n3);
        Property property = View.TRANSLATION_X;
        Animator animatorM103741n4 = bt0.m103741n(view, property, t100.m186890d(200.0f), -t100.m186890d(10.0f));
        animatorM103741n4.setDuration(180L);
        animatorM103741n4.setInterpolator(null);
        Animator animatorM103741n5 = bt0.m103741n(view, property, -t100.m186890d(10.0f), 0.0f);
        animatorM103741n5.setDuration(120L);
        animatorM103741n5.setInterpolator(null);
        new AnimatorSet().playSequentially(animatorM103741n4, animatorM103741n5);
        if (view == this.f51047a) {
            bt0.m103741n(view, View.TRANSLATION_Y, t100.m186890d(60.0f), 0.0f);
        } else if (view == this.f51049c) {
            bt0.m103741n(view, View.TRANSLATION_Y, -t100.m186890d(80.0f), 0.0f);
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        Animator animatorM103737j = bt0.m103737j(i);
        animatorSet2.setStartDelay(i);
        animatorSet2.play(animatorM103741n).with(animatorSet).after(animatorM103737j);
        return animatorSet2;
    }

    /* JADX INFO: renamed from: f */
    public final void m75359f() {
        m75367n(this.f51047a, 0);
        m75367n(this.f51048b, 1);
        m75367n(this.f51049c, 2);
        this.f51047a.m75347b(IntlMultipleGiftItemView.IntlContinueType.SMALL);
        this.f51048b.m75347b(IntlMultipleGiftItemView.IntlContinueType.MIDDLE);
        this.f51049c.m75347b(IntlMultipleGiftItemView.IntlContinueType.LARGE);
    }

    /* JADX INFO: renamed from: g */
    public final boolean m75360g(ihs ihsVar) {
        ihs ihsVar2 = this.f51050d;
        return (ihsVar2 == null || ihsVar.m136292q(ihsVar2)) ? false : true;
    }

    /* JADX INFO: renamed from: h */
    public boolean m75361h() {
        return xdl0.m208349O0(this.f51047a) && xdl0.m208349O0(this.f51048b) && xdl0.m208349O0(this.f51049c);
    }

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ void m75362i(IntlMultipleGiftItemView intlMultipleGiftItemView, int i, View view) {
        if (this.f51056j != null) {
            this.f51056j.mo73887a(new efe0(this.f51050d, this.f51051e, i, this.f51052f, (int) intlMultipleGiftItemView.getGears().combosHitNum));
        }
    }

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ void m75363j() {
        m75368o(0);
    }

    /* JADX INFO: renamed from: k */
    public void m75364k() {
        dt0.m113501A(this.f51053g);
        dt0.m113501A(this.f51054h);
        this.f51050d = null;
        this.f51055i = false;
    }

    /* JADX INFO: renamed from: l */
    public final void m75365l(ihs ihsVar) {
        this.f51047a.m75348c(m75356c(0), ihsVar);
        this.f51048b.m75348c(m75356c(1), ihsVar);
        this.f51049c.m75348c(m75356c(2), ihsVar);
    }

    /* JADX INFO: renamed from: m */
    public void m75366m(LiveGiftItemView liveGiftItemView, ihs ihsVar, int i, LiveMultipleGiftView.InterfaceC12811a interfaceC12811a) {
        dt0.m113501A(this.f51054h);
        if (m75360g(ihsVar)) {
            this.f51055i = false;
        }
        this.f51051e = liveGiftItemView;
        this.f51050d = ihsVar;
        this.f51056j = interfaceC12811a;
        this.f51052f = i;
        m75365l(ihsVar);
        if (this.f51055i) {
            m75368o(0);
        } else {
            m75370q();
        }
    }

    /* JADX INFO: renamed from: n */
    public final void m75367n(final IntlMultipleGiftItemView intlMultipleGiftItemView, final int i) {
        intlMultipleGiftItemView.setOnClickListener(new View.OnClickListener() { // from class: l.plo
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f150154a.m75362i(intlMultipleGiftItemView, i, view);
            }
        });
    }

    /* JADX INFO: renamed from: o */
    public void m75368o(int i) {
        if (i == 8 || i == 4) {
            this.f51055i = false;
        }
        xdl0.m208344M(this.f51047a, i == 0);
        xdl0.m208344M(this.f51048b, i == 0);
        xdl0.m208344M(this.f51049c, i == 0);
    }

    /* JADX INFO: renamed from: p */
    public void m75369p(d30 d30Var) {
        dt0.m113503C(this.f51054h);
        if (this.f51054h == null) {
            AnimatorSet animatorSetM75357d = m75357d(this.f51047a);
            AnimatorSet animatorSetM75357d2 = m75357d(this.f51048b);
            AnimatorSet animatorSetM75357d3 = m75357d(this.f51049c);
            AnimatorSet animatorSet = new AnimatorSet();
            this.f51054h = animatorSet;
            animatorSet.playTogether(animatorSetM75357d, animatorSetM75357d2, animatorSetM75357d3);
        }
        AnimatorSet animatorSet2 = this.f51054h;
        Objects.requireNonNull(d30Var);
        bt0.m103733f(animatorSet2, new bii0(d30Var));
        this.f51054h.start();
        this.f51055i = false;
    }

    /* JADX INFO: renamed from: q */
    public final void m75370q() {
        this.f51047a.setAlpha(0.0f);
        this.f51048b.setAlpha(0.0f);
        this.f51049c.setAlpha(0.0f);
        if (this.f51053g == null) {
            AnimatorSet animatorSetM75358e = m75358e(this.f51047a, 100);
            AnimatorSet animatorSetM75358e2 = m75358e(this.f51048b, 140);
            AnimatorSet animatorSetM75358e3 = m75358e(this.f51049c, 180);
            AnimatorSet animatorSet = new AnimatorSet();
            this.f51053g = animatorSet;
            animatorSet.playTogether(animatorSetM75358e, animatorSetM75358e2, animatorSetM75358e3);
        }
        bt0.m103749v(this.f51053g, new Runnable() { // from class: l.qlo
            @Override // java.lang.Runnable
            public final void run() {
                this.f155248a.m75363j();
            }
        });
        this.f51053g.start();
        this.f51055i = true;
    }
}
