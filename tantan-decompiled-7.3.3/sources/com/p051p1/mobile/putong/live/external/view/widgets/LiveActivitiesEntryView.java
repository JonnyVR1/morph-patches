package com.p051p1.mobile.putong.live.external.view.widgets;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.PathInterpolator;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p051p1.mobile.putong.live.base.data.BLiveActivitySummary;
import com.p051p1.mobile.putong.live.base.data.BLiveEntranceSummary;
import com.p051p1.mobile.putong.live.external.internal.live.square.api.LiveActivitiesEntry;
import java.util.concurrent.TimeUnit;
import p137rx.C22421c;
import p151v.VFrame;
import p151v.VImage;
import p151v.VText;
import p153l.bnl0;
import p153l.ctr;
import p153l.dhw;
import p153l.fo0;
import p153l.fur;
import p153l.grr;
import p153l.gt0;
import p153l.iam;
import p153l.kcg0;
import p153l.mbs;
import p153l.msr;
import p153l.ppi0;
import p153l.prr;
import p153l.psd0;
import p153l.psr;
import p153l.pzi0;
import p153l.qa00;
import p153l.qnp0;
import p153l.sft;
import p153l.tbs;
import p153l.vrr;
import p153l.vsr;
import p153l.x20;
import p153l.y20;

/* JADX INFO: loaded from: classes9.dex */
public class LiveActivitiesEntryView extends FrameLayout implements iam<msr> {

    /* JADX INFO: renamed from: a */
    public VFrame f47121a;

    /* JADX INFO: renamed from: b */
    public LiveActivitiesEntryAll f47122b;

    /* JADX INFO: renamed from: c */
    public LiveActivitiesEntrySignIn f47123c;

    /* JADX INFO: renamed from: d */
    public LiveEntranceStartLiveView f47124d;

    /* JADX INFO: renamed from: e */
    public VText f47125e;

    /* JADX INFO: renamed from: f */
    public VImage f47126f;

    /* JADX INFO: renamed from: g */
    public boolean f47127g;

    /* JADX INFO: renamed from: h */
    public kcg0 f47128h;

    /* JADX INFO: renamed from: i */
    public int f47129i;

    /* JADX INFO: renamed from: j */
    public LiveActivitiesEntry f47130j;

    /* JADX INFO: renamed from: k */
    public msr f47131k;

    /* JADX INFO: renamed from: l */
    public String f47132l;

    /* JADX INFO: renamed from: m */
    public x20 f47133m;

    /* JADX INFO: renamed from: n */
    public AnimatorSet f47134n;

    /* JADX INFO: renamed from: o */
    public psr f47135o;

    /* JADX INFO: renamed from: p */
    public vsr f47136p;

    /* JADX INFO: renamed from: q */
    public vrr f47137q;

    /* JADX INFO: renamed from: r */
    public prr f47138r;

    /* JADX INFO: renamed from: s */
    public fur f47139s;

    public LiveActivitiesEntryView(Context context) {
        super(context);
        this.f47129i = 2;
        this.f47134n = new AnimatorSet();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: C */
    public void m72042C() {
        x20 x20Var = this.f47133m;
        if (x20Var != null) {
            x20Var.call();
            this.f47133m = null;
        }
    }

    /* JADX INFO: renamed from: k */
    private void m72049k() {
        bnl0.m105509E0(this.f47122b.f47105k, new View.OnClickListener() { // from class: l.wsr
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f190668a.m72050p(view);
            }
        });
        bnl0.m105509E0(this, new View.OnClickListener() { // from class: l.xsr
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f196121a.m72051q(view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p */
    public /* synthetic */ void m72050p(View view) {
        if (this.f47131k == null || getEntryInfo() == null) {
            return;
        }
        this.f47131k.m159919k3(getEntryInfo());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q */
    public /* synthetic */ void m72051q(View view) {
        msr msrVar = this.f47131k;
        if (msrVar != null) {
            msrVar.m159918j3();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s */
    public /* synthetic */ void m72052s() {
        this.f47139s.m127537d(this.f47131k, this.f47130j, this.f47127g);
    }

    /* JADX INFO: renamed from: A */
    public final void m72053A(int i, BLiveEntranceSummary bLiveEntranceSummary) {
        if (bLiveEntranceSummary != null) {
            if (i == 3) {
                this.f47123c.m72041s(this.f47131k, bLiveEntranceSummary);
                if (TextUtils.isEmpty(bLiveEntranceSummary.scheme)) {
                    return;
                }
                this.f47132l = bLiveEntranceSummary.scheme;
                return;
            }
            if (i != 4) {
                return;
            }
            this.f47124d.m72087Q(this.f47131k, bLiveEntranceSummary);
            if (TextUtils.isEmpty(bLiveEntranceSummary.scheme)) {
                return;
            }
            this.f47132l = bLiveEntranceSummary.scheme;
        }
    }

    /* JADX INFO: renamed from: B */
    public void m72054B(@NonNull final LiveActivitiesEntry liveActivitiesEntry) {
        boolean zM72059m = m72059m(liveActivitiesEntry);
        final boolean zM72063w = m72063w(this.f47130j, liveActivitiesEntry);
        this.f47130j = liveActivitiesEntry;
        final int i = this.f47129i;
        if (zM72059m && this.f47127g) {
            this.f47128h = C22421c.timer(4L, TimeUnit.SECONDS).take(1).observeOn(fo0.m126432a()).subscribe(dhw.m115825d(new y20() { // from class: l.ysr
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f201440a.m72062v(liveActivitiesEntry, i, zM72063w, (Long) obj);
                }
            }));
        } else {
            m72065y(liveActivitiesEntry, i, zM72063w);
        }
        this.f47129i = this.f47130j.getState();
    }

    @Override // p153l.iam
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return getContext();
    }

    /* JADX INFO: renamed from: E */
    public void m72055E() {
        if (this.f47127g) {
            boolean zM127535b = this.f47139s.m127535b();
            if (this.f47139s.m127536c() || zM127535b) {
                sft.m185668f(this.f47131k.m159916h3(), zM127535b);
            }
        }
    }

    @Override // p153l.iam
    public void destroy() {
    }

    public LiveActivitiesEntry getEntryInfo() {
        return this.f47130j;
    }

    public String getScheme() {
        return this.f47132l;
    }

    public int getState() {
        LiveActivitiesEntry liveActivitiesEntry = this.f47130j;
        if (liveActivitiesEntry == null) {
            return 2;
        }
        return liveActivitiesEntry.getState();
    }

    /* JADX INFO: renamed from: i */
    public final void m72056i(View view) {
        ctr.m112549a(this, view);
    }

    @Override // p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    /* JADX INFO: renamed from: j */
    public final void m72057j(int i, boolean z) {
        this.f47139s.m127534a();
        bnl0.m105507D0(bnl0.f77545f, this.f47121a);
        bnl0.m105524M(this.f47123c, i == 3);
        bnl0.m105524M(this.f47124d, i == 4);
        bnl0.m105524M(this.f47122b, (i == 3 || i == 4) ? false : true);
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(msr msrVar) {
        this.f47131k = msrVar;
    }

    /* JADX INFO: renamed from: m */
    public final boolean m72059m(LiveActivitiesEntry liveActivitiesEntry) {
        LiveActivitiesEntry liveActivitiesEntry2 = this.f47130j;
        if (liveActivitiesEntry2 == null) {
            return false;
        }
        if ((!this.f47127g && liveActivitiesEntry2.getState() != 5) || pzi0.m174439D(tbs.f172993f.m143705g()) || liveActivitiesEntry.getLiveActivitySummary().cardLives.size() == 0) {
            return false;
        }
        liveActivitiesEntry.forceState(5);
        return true;
    }

    @Nullable
    /* JADX INFO: renamed from: n */
    public final grr m72060n(int i) {
        if (i == 0) {
            return this.f47136p;
        }
        if (i == 1) {
            return this.f47135o;
        }
        if (i == 2) {
            return this.f47137q;
        }
        if (i != 5) {
            return null;
        }
        return this.f47138r;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m72056i(this);
        this.f47135o = new psr(this.f47122b);
        this.f47136p = new vsr(this.f47122b);
        this.f47137q = new vrr(this.f47122b);
        this.f47138r = new prr(this.f47122b);
        this.f47139s = new fur(this.f47125e, this.f47126f);
        if (mbs.m157855h()) {
            qnp0.m177261d1(this, qa00.f156322i);
        }
        m72049k();
    }

    /* JADX INFO: renamed from: u */
    public final /* synthetic */ void m72061u(grr grrVar, grr grrVar2) {
        ValueAnimator valueAnimatorM72032b = this.f47122b.f47095a.m72032b(grrVar, grrVar2);
        grrVar2.mo131867j(valueAnimatorM72032b, grrVar);
        grrVar.mo131865h(valueAnimatorM72032b, grrVar2);
        this.f47134n.playTogether(valueAnimatorM72032b);
        gt0.m132160f(this.f47134n, new Runnable() { // from class: l.btr
            @Override // java.lang.Runnable
            public final void run() {
                this.f78392a.m72042C();
            }
        });
        this.f47134n.start();
    }

    /* JADX INFO: renamed from: v */
    public final /* synthetic */ void m72062v(LiveActivitiesEntry liveActivitiesEntry, int i, boolean z, Long l2) {
        m72065y(liveActivitiesEntry, i, z);
    }

    /* JADX INFO: renamed from: w */
    public final boolean m72063w(LiveActivitiesEntry liveActivitiesEntry, LiveActivitiesEntry liveActivitiesEntry2) {
        return (liveActivitiesEntry == null || liveActivitiesEntry.getState() == 3 || liveActivitiesEntry.getState() == 4 || liveActivitiesEntry2.getState() == 3 || liveActivitiesEntry2.getState() == 4 || this.f47129i == liveActivitiesEntry2.getState()) ? false : true;
    }

    /* JADX INFO: renamed from: x */
    public void m72064x(boolean z) {
        this.f47127g = z;
        m72055E();
        if (z) {
            return;
        }
        psd0.m173633z(this.f47128h);
    }

    /* JADX INFO: renamed from: y */
    public void m72065y(@NonNull LiveActivitiesEntry liveActivitiesEntry, int i, boolean z) {
        if (ppi0.m173207l().m173228x()) {
            bnl0.m105525M0(this, false);
            return;
        }
        int state = liveActivitiesEntry.getState();
        m72057j(state, z);
        if (state == 3 || state == 4) {
            m72053A(state, liveActivitiesEntry.getLiveEntranceSummary());
        } else {
            m72066z(state, i, liveActivitiesEntry.getLiveActivitySummary(), z);
        }
    }

    /* JADX INFO: renamed from: z */
    public final void m72066z(int i, int i2, BLiveActivitySummary bLiveActivitySummary, boolean z) {
        this.f47133m = new x20() { // from class: l.zsr
            @Override // p153l.x20
            public final void call() {
                this.f205890a.m72052s();
            }
        };
        grr grrVarM72060n = m72060n(this.f47130j.getState());
        this.f47122b.m72030b(i2, i);
        this.f47122b.f47103i.setText(bLiveActivitySummary.description.title);
        this.f47122b.f47104j.setText(bLiveActivitySummary.description.desc);
        if (grrVarM72060n != null) {
            grrVarM72060n.mo131859b(this.f47131k, bLiveActivitySummary);
            this.f47131k.m159913G3(this.f47130j);
        }
        AnimatorSet animatorSet = this.f47134n;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        final grr grrVarM72060n2 = m72060n(i2);
        final grr grrVarM72060n3 = m72060n(i);
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.f47134n = animatorSet2;
        animatorSet2.setInterpolator(new PathInterpolator(0.42f, 0.0f, 0.01f, 1.0f));
        if (z && grrVarM72060n2 != null && grrVarM72060n3 != null) {
            post(new Runnable() { // from class: l.atr
                @Override // java.lang.Runnable
                public final void run() {
                    this.f73396a.m72061u(grrVarM72060n2, grrVarM72060n3);
                }
            });
            return;
        }
        if (grrVarM72060n3 != null) {
            this.f47122b.f47095a.m72035e(grrVarM72060n3);
            grrVarM72060n3.mo131860c();
        }
        m72042C();
    }

    public LiveActivitiesEntryView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f47129i = 2;
        this.f47134n = new AnimatorSet();
    }

    public LiveActivitiesEntryView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f47129i = 2;
        this.f47134n = new AnimatorSet();
    }
}
