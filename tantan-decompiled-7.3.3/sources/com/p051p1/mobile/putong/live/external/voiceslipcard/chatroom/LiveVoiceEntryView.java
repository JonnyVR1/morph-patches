package com.p051p1.mobile.putong.live.external.voiceslipcard.chatroom;

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
import com.p051p1.mobile.putong.live.external.voiceslipcard.activity.LiveVoiceActivitiesAct;
import java.util.concurrent.TimeUnit;
import p137rx.C22421c;
import p151v.VFrame;
import p151v.VImage;
import p151v.VText;
import p153l.b6v;
import p153l.bnl0;
import p153l.dhw;
import p153l.evo0;
import p153l.fo0;
import p153l.h2v;
import p153l.iam;
import p153l.j0v;
import p153l.jyn0;
import p153l.kcg0;
import p153l.ppi0;
import p153l.psd0;
import p153l.v5v;
import p153l.x20;
import p153l.y20;

/* JADX INFO: loaded from: classes9.dex */
public class LiveVoiceEntryView extends RelativeLayout implements iam<v5v> {

    /* JADX INFO: renamed from: a */
    public VFrame f47359a;

    /* JADX INFO: renamed from: b */
    public LiveVoiceActivitiesEntryOriginStyleOne f47360b;

    /* JADX INFO: renamed from: c */
    public LiveVoiceActivitiesEntryOriginStyleTwo f47361c;

    /* JADX INFO: renamed from: d */
    public LiveVoiceActivitiesEntryRead f47362d;

    /* JADX INFO: renamed from: e */
    public LiveVoiceActivitiesEntryUnRead f47363e;

    /* JADX INFO: renamed from: f */
    public VFrame f47364f;

    /* JADX INFO: renamed from: g */
    public VText f47365g;

    /* JADX INFO: renamed from: h */
    public VImage f47366h;

    /* JADX INFO: renamed from: i */
    public v5v f47367i;

    /* JADX INFO: renamed from: j */
    public j0v f47368j;

    /* JADX INFO: renamed from: k */
    public x20 f47369k;

    /* JADX INFO: renamed from: l */
    public AnimatorSet f47370l;

    /* JADX INFO: renamed from: m */
    public kcg0 f47371m;

    /* JADX INFO: renamed from: n */
    public kcg0 f47372n;

    /* JADX INFO: renamed from: o */
    public boolean f47373o;

    /* JADX INFO: renamed from: p */
    public boolean f47374p;

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.external.voiceslipcard.chatroom.LiveVoiceEntryView$a */
    public class C12770a extends AnimatorListenerAdapter {
        public C12770a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            LiveVoiceEntryView.this.m72290F();
        }
    }

    public LiveVoiceEntryView(Context context) {
        super(context);
        this.f47370l = new AnimatorSet();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: F */
    public void m72290F() {
        x20 x20Var = this.f47369k;
        if (x20Var != null) {
            x20Var.call();
            this.f47369k = null;
        }
    }

    /* JADX INFO: renamed from: j */
    private void m72297j(int i, int i2) {
        if (i2 == -1) {
            bnl0.m105524M(this.f47363e, i == 0);
            bnl0.m105524M(this.f47362d, i == 1);
            bnl0.m105524M(this.f47360b, i == 2);
            bnl0.m105524M(this.f47361c, i == 3);
        }
        bnl0.m105524M(this.f47364f, false);
        bnl0.m105524M(this.f47365g, false);
        bnl0.m105524M(this.f47366h, false);
        bnl0.m105507D0(bnl0.f77545f, this.f47359a);
    }

    /* JADX INFO: renamed from: k */
    private void m72298k() {
        this.f47363e.setOnCloseButtonClickListener(new View.OnClickListener() { // from class: l.w5v
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f187561a.m72314u(view);
            }
        });
        bnl0.m105509E0(this, new View.OnClickListener() { // from class: l.x5v
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f192530a.m72315v(view);
            }
        });
    }

    private void setNumText(int i) {
        if (i >= 0 && i <= 99) {
            this.f47365g.setText(String.valueOf(i));
        } else if (i > 99) {
            this.f47365g.setText("99+");
        }
    }

    /* JADX INFO: renamed from: A */
    public void m72299A() {
        h2v h2vVarM72312q;
        if (this.f47368j == null) {
            return;
        }
        AnimatorSet animatorSet = this.f47370l;
        if ((animatorSet == null || !animatorSet.isRunning()) && (h2vVarM72312q = m72312q(this.f47368j.m143031e())) != null) {
            m72310n();
            h2vVarM72312q.mo72222F();
            this.f47373o = true;
            m72305I();
        }
    }

    /* JADX INFO: renamed from: B */
    public final void m72300B(int i, String str) {
        if (i <= 0) {
            if (TextUtils.equals(str, "dot")) {
                m72303G(true, false);
                return;
            } else {
                m72303G(false, false);
                return;
            }
        }
        if (!TextUtils.equals(str, "number")) {
            m72303G(true, false);
        } else {
            setNumText(i);
            m72303G(true, true);
        }
    }

    /* JADX INFO: renamed from: C */
    public final void m72301C(int i, int i2, boolean z) {
        h2v h2vVarM72311p = m72311p(i2);
        h2v h2vVarM72311p2 = m72311p(i);
        if (z) {
            this.f47363e.m72285Q();
            this.f47362d.m72261Q();
            this.f47360b.m72227f0();
            this.f47361c.m72245W();
        }
        this.f47369k = new x20() { // from class: l.z5v
            @Override // p153l.x20
            public final void call() {
                this.f203087a.m72316w();
            }
        };
        int iM143031e = this.f47368j.m143031e();
        if (iM143031e == 0) {
            this.f47363e.m72289Y(this.f47368j, this.f47367i, this.f47373o);
        } else if (iM143031e == 1) {
            this.f47362d.m72266Y(this.f47368j, this.f47367i);
        } else if (iM143031e == 2) {
            this.f47360b.m72226b0(this.f47368j);
        } else if (iM143031e == 3) {
            this.f47361c.m72241R(this.f47368j);
        }
        AnimatorSet animatorSet = this.f47370l;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.f47370l = animatorSet2;
        animatorSet2.setInterpolator(new PathInterpolator(0.42f, 0.0f, 0.01f, 1.0f));
        if (!z || h2vVarM72311p == null || h2vVarM72311p2 == null) {
            m72290F();
            return;
        }
        Animator animatorMo72220C = h2vVarM72311p.mo72220C(h2vVarM72311p2, this.f47373o);
        this.f47370l.playTogether(h2vVarM72311p2.mo72221E(h2vVarM72311p, this.f47373o), animatorMo72220C);
        this.f47370l.addListener(new C12770a());
        this.f47370l.start();
    }

    @Override // p153l.iam
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return getContext();
    }

    /* JADX INFO: renamed from: E */
    public void m72302E(j0v j0vVar) {
        m72309m();
        if (j0vVar == null) {
            bnl0.m105524M(this, false);
            return;
        }
        j0v j0vVar2 = this.f47368j;
        if (j0vVar2 != null && m72312q(j0vVar2.m143031e()) != null && (h2v.f107593t0.isRunning() || h2v.f107594u0.isRunning())) {
            m72304H(j0vVar);
            return;
        }
        AnimatorSet animatorSet = this.f47370l;
        if (animatorSet != null && animatorSet.isRunning()) {
            m72304H(j0vVar);
            return;
        }
        boolean zM72319z = m72319z(this.f47368j, j0vVar);
        int iM143031e = zM72319z ? this.f47368j.m143031e() : -1;
        this.f47368j = j0vVar;
        if (ppi0.m173207l().m173228x()) {
            bnl0.m105525M0(this, false);
            return;
        }
        int iM143031e2 = j0vVar.m143031e();
        m72297j(iM143031e2, iM143031e);
        m72301C(iM143031e2, iM143031e, zM72319z);
    }

    /* JADX INFO: renamed from: G */
    public final void m72303G(boolean z, boolean z2) {
        VFrame vFrame = this.f47364f;
        if (z) {
            bnl0.m105524M(vFrame, true);
            bnl0.m105524M(this.f47366h, !z2);
            bnl0.m105524M(this.f47365g, z2);
        } else {
            bnl0.m105524M(vFrame, false);
            bnl0.m105524M(this.f47366h, false);
            bnl0.m105524M(this.f47365g, false);
        }
    }

    /* JADX INFO: renamed from: H */
    public final void m72304H(final j0v j0vVar) {
        m72309m();
        this.f47372n = C22421c.timer(400L, TimeUnit.MILLISECONDS).observeOn(fo0.m126432a()).subscribe(dhw.m115829h(new y20() { // from class: l.a6v
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f68762a.m72317x(j0vVar, (Long) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: I */
    public final void m72305I() {
        m72310n();
        this.f47371m = C22421c.timer(3000L, TimeUnit.MILLISECONDS).observeOn(fo0.m126432a()).subscribe(dhw.m115829h(new y20() { // from class: l.y5v
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f197588a.m72318y((Long) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: J */
    public void m72306J(j0v j0vVar, boolean z) {
        evo0.m122808f(j0vVar, true, this.f47373o, z);
    }

    @Override // p153l.iam
    public void destroy() {
        m72310n();
        m72309m();
    }

    /* JADX INFO: renamed from: i */
    public final void m72307i(View view) {
        b6v.m102797a(this, view);
    }

    @Override // p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(v5v v5vVar) {
        this.f47367i = v5vVar;
    }

    /* JADX INFO: renamed from: m */
    public final void m72309m() {
        psd0.m173633z(this.f47372n);
    }

    /* JADX INFO: renamed from: n */
    public final void m72310n() {
        psd0.m173633z(this.f47371m);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m72307i(this);
        m72298k();
        m72313s(false);
    }

    @Nullable
    /* JADX INFO: renamed from: p */
    public final h2v m72311p(int i) {
        if (i == 0) {
            return this.f47363e;
        }
        if (i == 1) {
            return this.f47362d;
        }
        if (i == 2) {
            return this.f47360b;
        }
        if (i != 3) {
            return null;
        }
        return this.f47361c;
    }

    @Nullable
    /* JADX INFO: renamed from: q */
    public final h2v m72312q(int i) {
        if (i == 0) {
            return this.f47363e;
        }
        if (i == 1) {
            return this.f47362d;
        }
        if (i == 2) {
            return this.f47360b;
        }
        if (i != 3) {
            return null;
        }
        return this.f47361c;
    }

    /* JADX INFO: renamed from: s */
    public void m72313s(boolean z) {
        this.f47374p = z;
        this.f47360b.setBackgroundResource(jyn0.m147605b(z).mo187683m());
        this.f47360b.m72225Y(z);
        this.f47361c.setBackgroundResource(jyn0.m147605b(z).mo187683m());
        this.f47361c.m72238O(z);
        this.f47362d.setBackgroundResource(jyn0.m147605b(z).mo187677g());
        this.f47362d.m72262R(z);
        this.f47363e.setBackgroundResource(jyn0.m147605b(z).mo187677g());
        this.f47363e.m72286R(z);
        this.f47365g.setBackgroundResource(jyn0.m147605b(z).mo187678h());
        this.f47366h.setBackgroundResource(jyn0.m147605b(z).mo187682l());
    }

    public void setLiveVoiceEntryViewVis(boolean z) {
        bnl0.m105524M(this, z);
    }

    /* JADX INFO: renamed from: u */
    public final /* synthetic */ void m72314u(View view) {
        if (this.f47367i != null) {
            m72306J(this.f47368j, true);
            this.f47367i.m199943x0();
        }
    }

    /* JADX INFO: renamed from: v */
    public final /* synthetic */ void m72315v(View view) {
        if (this.f47367i == null || this.f47368j == null) {
            return;
        }
        getAct().startActivity(LiveVoiceActivitiesAct.m72159Y1(getAct(), this.f47374p));
        m72306J(this.f47368j, false);
        if (this.f47368j.m143031e() == 0) {
            this.f47367i.m199943x0();
        }
    }

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ void m72316w() {
        m72300B(this.f47368j.m143032f(), this.f47368j.m143030d());
    }

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ void m72317x(j0v j0vVar, Long l2) {
        m72302E(j0vVar);
    }

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ void m72318y(Long l2) {
        AnimatorSet animatorSet = this.f47370l;
        if (animatorSet != null && animatorSet.isRunning()) {
            m72305I();
            return;
        }
        h2v h2vVarM72312q = m72312q(this.f47368j.m143031e());
        if (h2vVarM72312q != null) {
            h2vVarM72312q.mo72228j();
        }
        this.f47373o = false;
    }

    /* JADX INFO: renamed from: z */
    public final boolean m72319z(j0v j0vVar, j0v j0vVar2) {
        return (j0vVar == null || j0vVar.m143031e() == j0vVar2.m143031e()) ? false : true;
    }

    public LiveVoiceEntryView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f47370l = new AnimatorSet();
    }

    public LiveVoiceEntryView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f47370l = new AnimatorSet();
    }
}
