package com.p046p1.mobile.putong.live.external.voiceslipcard.chatroom;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.PathInterpolator;
import android.widget.RelativeLayout;
import androidx.annotation.Nullable;
import com.p046p1.mobile.putong.live.external.voiceslipcard.activity.LiveVoiceActivitiesAct;
import java.util.concurrent.TimeUnit;
import p133rx.C22306c;
import p147v.VFrame;
import p147v.VImage;
import p147v.VText;
import p149l.a4v;
import p149l.amo0;
import p149l.c4g0;
import p149l.d30;
import p149l.e30;
import p149l.ffw;
import p149l.fpn0;
import p149l.g0v;
import p149l.iyu;
import p149l.jo0;
import p149l.mkd0;
import p149l.pgi0;
import p149l.s7m;
import p149l.u3v;
import p149l.xdl0;

/* JADX INFO: loaded from: classes13.dex */
public class LiveVoiceEntryView extends RelativeLayout implements s7m<u3v> {

    /* JADX INFO: renamed from: a */
    public VFrame f46511a;

    /* JADX INFO: renamed from: b */
    public LiveVoiceActivitiesEntryOriginStyleOne f46512b;

    /* JADX INFO: renamed from: c */
    public LiveVoiceActivitiesEntryOriginStyleTwo f46513c;

    /* JADX INFO: renamed from: d */
    public LiveVoiceActivitiesEntryRead f46514d;

    /* JADX INFO: renamed from: e */
    public LiveVoiceActivitiesEntryUnRead f46515e;

    /* JADX INFO: renamed from: f */
    public VFrame f46516f;

    /* JADX INFO: renamed from: g */
    public VText f46517g;

    /* JADX INFO: renamed from: h */
    public VImage f46518h;

    /* JADX INFO: renamed from: i */
    public u3v f46519i;

    /* JADX INFO: renamed from: j */
    public iyu f46520j;

    /* JADX INFO: renamed from: k */
    public d30 f46521k;

    /* JADX INFO: renamed from: l */
    public AnimatorSet f46522l;

    /* JADX INFO: renamed from: m */
    public c4g0 f46523m;

    /* JADX INFO: renamed from: n */
    public c4g0 f46524n;

    /* JADX INFO: renamed from: o */
    public boolean f46525o;

    /* JADX INFO: renamed from: p */
    public boolean f46526p;

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.external.voiceslipcard.chatroom.LiveVoiceEntryView$a */
    public class C12607a extends AnimatorListenerAdapter {
        public C12607a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            LiveVoiceEntryView.this.m71107F();
        }
    }

    public LiveVoiceEntryView(Context context) {
        super(context);
        this.f46522l = new AnimatorSet();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: F */
    public void m71107F() {
        d30 d30Var = this.f46521k;
        if (d30Var != null) {
            d30Var.call();
            this.f46521k = null;
        }
    }

    /* JADX INFO: renamed from: j */
    private void m71114j(int i, int i2) {
        if (i2 == -1) {
            xdl0.m208344M(this.f46515e, i == 0);
            xdl0.m208344M(this.f46514d, i == 1);
            xdl0.m208344M(this.f46512b, i == 2);
            xdl0.m208344M(this.f46513c, i == 3);
        }
        xdl0.m208344M(this.f46516f, false);
        xdl0.m208344M(this.f46517g, false);
        xdl0.m208344M(this.f46518h, false);
        xdl0.m208327D0(xdl0.f192404f, this.f46511a);
    }

    /* JADX INFO: renamed from: k */
    private void m71115k() {
        this.f46515e.setOnCloseButtonClickListener(new View.OnClickListener() { // from class: l.v3v
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f179850a.m71131u(view);
            }
        });
        xdl0.m208329E0(this, new View.OnClickListener() { // from class: l.w3v
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f184446a.m71132v(view);
            }
        });
    }

    private void setNumText(int i) {
        if (i >= 0 && i <= 99) {
            this.f46517g.setText(String.valueOf(i));
        } else if (i > 99) {
            this.f46517g.setText("99+");
        }
    }

    /* JADX INFO: renamed from: A */
    public void m71116A() {
        g0v g0vVarM71129q;
        if (this.f46520j == null) {
            return;
        }
        AnimatorSet animatorSet = this.f46522l;
        if ((animatorSet == null || !animatorSet.isRunning()) && (g0vVarM71129q = m71129q(this.f46520j.m139016e())) != null) {
            m71127n();
            g0vVarM71129q.mo71039F();
            this.f46525o = true;
            m71122I();
        }
    }

    /* JADX INFO: renamed from: B */
    public final void m71117B(int i, String str) {
        if (i <= 0) {
            if (TextUtils.equals(str, "dot")) {
                m71120G(true, false);
                return;
            } else {
                m71120G(false, false);
                return;
            }
        }
        if (!TextUtils.equals(str, "number")) {
            m71120G(true, false);
        } else {
            setNumText(i);
            m71120G(true, true);
        }
    }

    /* JADX INFO: renamed from: C */
    public final void m71118C(int i, int i2, boolean z) {
        g0v g0vVarM71128p = m71128p(i2);
        g0v g0vVarM71128p2 = m71128p(i);
        if (z) {
            this.f46515e.m71102Q();
            this.f46514d.m71078Q();
            this.f46512b.m71044f0();
            this.f46513c.m71062W();
        }
        this.f46521k = new d30() { // from class: l.y3v
            @Override // p149l.d30
            public final void call() {
                this.f195856a.m71133w();
            }
        };
        int iM139016e = this.f46520j.m139016e();
        if (iM139016e == 0) {
            this.f46515e.m71106Y(this.f46520j, this.f46519i, this.f46525o);
        } else if (iM139016e == 1) {
            this.f46514d.m71083Y(this.f46520j, this.f46519i);
        } else if (iM139016e == 2) {
            this.f46512b.m71043b0(this.f46520j);
        } else if (iM139016e == 3) {
            this.f46513c.m71058R(this.f46520j);
        }
        AnimatorSet animatorSet = this.f46522l;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.f46522l = animatorSet2;
        animatorSet2.setInterpolator(new PathInterpolator(0.42f, 0.0f, 0.01f, 1.0f));
        if (!z || g0vVarM71128p == null || g0vVarM71128p2 == null) {
            m71107F();
            return;
        }
        Animator animatorMo71037C = g0vVarM71128p.mo71037C(g0vVarM71128p2, this.f46525o);
        this.f46522l.playTogether(g0vVarM71128p2.mo71038E(g0vVarM71128p, this.f46525o), animatorMo71037C);
        this.f46522l.addListener(new C12607a());
        this.f46522l.start();
    }

    @Override // p149l.s7m
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return getContext();
    }

    /* JADX INFO: renamed from: E */
    public void m71119E(iyu iyuVar) {
        m71126m();
        if (iyuVar == null) {
            xdl0.m208344M(this, false);
            return;
        }
        iyu iyuVar2 = this.f46520j;
        if (iyuVar2 != null && m71129q(iyuVar2.m139016e()) != null && (g0v.f100089t0.isRunning() || g0v.f100090u0.isRunning())) {
            m71121H(iyuVar);
            return;
        }
        AnimatorSet animatorSet = this.f46522l;
        if (animatorSet != null && animatorSet.isRunning()) {
            m71121H(iyuVar);
            return;
        }
        boolean zM71136z = m71136z(this.f46520j, iyuVar);
        int iM139016e = zM71136z ? this.f46520j.m139016e() : -1;
        this.f46520j = iyuVar;
        if (pgi0.m168730l().m168751x()) {
            xdl0.m208345M0(this, false);
            return;
        }
        int iM139016e2 = iyuVar.m139016e();
        m71114j(iM139016e2, iM139016e);
        m71118C(iM139016e2, iM139016e, zM71136z);
    }

    /* JADX INFO: renamed from: G */
    public final void m71120G(boolean z, boolean z2) {
        VFrame vFrame = this.f46516f;
        if (z) {
            xdl0.m208344M(vFrame, true);
            xdl0.m208344M(this.f46518h, !z2);
            xdl0.m208344M(this.f46517g, z2);
        } else {
            xdl0.m208344M(vFrame, false);
            xdl0.m208344M(this.f46518h, false);
            xdl0.m208344M(this.f46517g, false);
        }
    }

    /* JADX INFO: renamed from: H */
    public final void m71121H(final iyu iyuVar) {
        m71126m();
        this.f46524n = C22306c.timer(400L, TimeUnit.MILLISECONDS).observeOn(jo0.m142408a()).subscribe(ffw.m121197h(new e30() { // from class: l.z3v
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f201412a.m71134x(iyuVar, (Long) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: I */
    public final void m71122I() {
        m71127n();
        this.f46523m = C22306c.timer(3000L, TimeUnit.MILLISECONDS).observeOn(jo0.m142408a()).subscribe(ffw.m121197h(new e30() { // from class: l.x3v
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f190919a.m71135y((Long) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: J */
    public void m71123J(iyu iyuVar, boolean z) {
        amo0.m97569f(iyuVar, true, this.f46525o, z);
    }

    @Override // p149l.s7m
    public void destroy() {
        m71127n();
        m71126m();
    }

    /* JADX INFO: renamed from: i */
    public final void m71124i(View view) {
        a4v.m94929a(this, view);
    }

    @Override // p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(u3v u3vVar) {
        this.f46519i = u3vVar;
    }

    /* JADX INFO: renamed from: m */
    public final void m71126m() {
        mkd0.m154992z(this.f46524n);
    }

    /* JADX INFO: renamed from: n */
    public final void m71127n() {
        mkd0.m154992z(this.f46523m);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m71124i(this);
        m71115k();
        m71130s(false);
    }

    @Nullable
    /* JADX INFO: renamed from: p */
    public final g0v m71128p(int i) {
        if (i == 0) {
            return this.f46515e;
        }
        if (i == 1) {
            return this.f46514d;
        }
        if (i == 2) {
            return this.f46512b;
        }
        if (i != 3) {
            return null;
        }
        return this.f46513c;
    }

    @Nullable
    /* JADX INFO: renamed from: q */
    public final g0v m71129q(int i) {
        if (i == 0) {
            return this.f46515e;
        }
        if (i == 1) {
            return this.f46514d;
        }
        if (i == 2) {
            return this.f46512b;
        }
        if (i != 3) {
            return null;
        }
        return this.f46513c;
    }

    /* JADX INFO: renamed from: s */
    public void m71130s(boolean z) {
        this.f46526p = z;
        this.f46512b.setBackgroundResource(fpn0.m122612b(z).mo108473m());
        this.f46512b.m71042Y(z);
        this.f46513c.setBackgroundResource(fpn0.m122612b(z).mo108473m());
        this.f46513c.m71055O(z);
        this.f46514d.setBackgroundResource(fpn0.m122612b(z).mo108467g());
        this.f46514d.m71079R(z);
        this.f46515e.setBackgroundResource(fpn0.m122612b(z).mo108467g());
        this.f46515e.m71103R(z);
        this.f46517g.setBackgroundResource(fpn0.m122612b(z).mo108468h());
        this.f46518h.setBackgroundResource(fpn0.m122612b(z).mo108472l());
    }

    public void setLiveVoiceEntryViewVis(boolean z) {
        xdl0.m208344M(this, z);
    }

    /* JADX INFO: renamed from: u */
    public final /* synthetic */ void m71131u(View view) {
        if (this.f46519i != null) {
            m71123J(this.f46520j, true);
            this.f46519i.m191642x0();
        }
    }

    /* JADX INFO: renamed from: v */
    public final /* synthetic */ void m71132v(View view) {
        if (this.f46519i == null || this.f46520j == null) {
            return;
        }
        getAct().startActivity(LiveVoiceActivitiesAct.m70976X1(getAct(), this.f46526p));
        m71123J(this.f46520j, false);
        if (this.f46520j.m139016e() == 0) {
            this.f46519i.m191642x0();
        }
    }

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ void m71133w() {
        m71117B(this.f46520j.m139017f(), this.f46520j.m139015d());
    }

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ void m71134x(iyu iyuVar, Long l2) {
        m71119E(iyuVar);
    }

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ void m71135y(Long l2) {
        AnimatorSet animatorSet = this.f46522l;
        if (animatorSet != null && animatorSet.isRunning()) {
            m71122I();
            return;
        }
        g0v g0vVarM71129q = m71129q(this.f46520j.m139016e());
        if (g0vVarM71129q != null) {
            g0vVarM71129q.mo71045j();
        }
        this.f46525o = false;
    }

    /* JADX INFO: renamed from: z */
    public final boolean m71136z(iyu iyuVar, iyu iyuVar2) {
        return (iyuVar == null || iyuVar.m139016e() == iyuVar2.m139016e()) ? false : true;
    }

    public LiveVoiceEntryView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f46522l = new AnimatorSet();
    }

    public LiveVoiceEntryView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f46522l = new AnimatorSet();
    }
}
