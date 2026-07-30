package com.p046p1.mobile.putong.live.external.view.widgets;

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
import com.p046p1.mobile.putong.live.base.data.BLiveActivitySummary;
import com.p046p1.mobile.putong.live.base.data.BLiveEntranceSummary;
import com.p046p1.mobile.putong.live.external.internal.live.square.api.LiveActivitiesEntry;
import java.util.concurrent.TimeUnit;
import p133rx.C22306c;
import p147v.VFrame;
import p147v.VImage;
import p147v.VText;
import p149l.brr;
import p149l.bt0;
import p149l.c4g0;
import p149l.d30;
import p149l.e30;
import p149l.esr;
import p149l.ffw;
import p149l.fpr;
import p149l.jo0;
import p149l.l9s;
import p149l.lqr;
import p149l.mep0;
import p149l.mkd0;
import p149l.mqi0;
import p149l.opr;
import p149l.oqr;
import p149l.pgi0;
import p149l.rdt;
import p149l.s7m;
import p149l.s9s;
import p149l.t100;
import p149l.upr;
import p149l.uqr;
import p149l.xdl0;

/* JADX INFO: loaded from: classes13.dex */
public class LiveActivitiesEntryView extends FrameLayout implements s7m<lqr> {

    /* JADX INFO: renamed from: a */
    public VFrame f46273a;

    /* JADX INFO: renamed from: b */
    public LiveActivitiesEntryAll f46274b;

    /* JADX INFO: renamed from: c */
    public LiveActivitiesEntrySignIn f46275c;

    /* JADX INFO: renamed from: d */
    public LiveEntranceStartLiveView f46276d;

    /* JADX INFO: renamed from: e */
    public VText f46277e;

    /* JADX INFO: renamed from: f */
    public VImage f46278f;

    /* JADX INFO: renamed from: g */
    public boolean f46279g;

    /* JADX INFO: renamed from: h */
    public c4g0 f46280h;

    /* JADX INFO: renamed from: i */
    public int f46281i;

    /* JADX INFO: renamed from: j */
    public LiveActivitiesEntry f46282j;

    /* JADX INFO: renamed from: k */
    public lqr f46283k;

    /* JADX INFO: renamed from: l */
    public String f46284l;

    /* JADX INFO: renamed from: m */
    public d30 f46285m;

    /* JADX INFO: renamed from: n */
    public AnimatorSet f46286n;

    /* JADX INFO: renamed from: o */
    public oqr f46287o;

    /* JADX INFO: renamed from: p */
    public uqr f46288p;

    /* JADX INFO: renamed from: q */
    public upr f46289q;

    /* JADX INFO: renamed from: r */
    public opr f46290r;

    /* JADX INFO: renamed from: s */
    public esr f46291s;

    public LiveActivitiesEntryView(Context context) {
        super(context);
        this.f46281i = 2;
        this.f46286n = new AnimatorSet();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: C */
    public void m70859C() {
        d30 d30Var = this.f46285m;
        if (d30Var != null) {
            d30Var.call();
            this.f46285m = null;
        }
    }

    /* JADX INFO: renamed from: k */
    private void m70866k() {
        xdl0.m208329E0(this.f46274b.f46257k, new View.OnClickListener() { // from class: l.vqr
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f182671a.m70867p(view);
            }
        });
        xdl0.m208329E0(this, new View.OnClickListener() { // from class: l.wqr
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f187719a.m70868q(view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p */
    public /* synthetic */ void m70867p(View view) {
        if (this.f46283k == null || getEntryInfo() == null) {
            return;
        }
        this.f46283k.m151077k3(getEntryInfo());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q */
    public /* synthetic */ void m70868q(View view) {
        lqr lqrVar = this.f46283k;
        if (lqrVar != null) {
            lqrVar.m151076j3();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s */
    public /* synthetic */ void m70869s() {
        this.f46291s.m117953d(this.f46283k, this.f46282j, this.f46279g);
    }

    /* JADX INFO: renamed from: A */
    public final void m70870A(int i, BLiveEntranceSummary bLiveEntranceSummary) {
        if (bLiveEntranceSummary != null) {
            if (i == 3) {
                this.f46275c.m70858s(this.f46283k, bLiveEntranceSummary);
                if (TextUtils.isEmpty(bLiveEntranceSummary.scheme)) {
                    return;
                }
                this.f46284l = bLiveEntranceSummary.scheme;
                return;
            }
            if (i != 4) {
                return;
            }
            this.f46276d.m70904Q(this.f46283k, bLiveEntranceSummary);
            if (TextUtils.isEmpty(bLiveEntranceSummary.scheme)) {
                return;
            }
            this.f46284l = bLiveEntranceSummary.scheme;
        }
    }

    /* JADX INFO: renamed from: B */
    public void m70871B(@NonNull final LiveActivitiesEntry liveActivitiesEntry) {
        boolean zM70876m = m70876m(liveActivitiesEntry);
        final boolean zM70880w = m70880w(this.f46282j, liveActivitiesEntry);
        this.f46282j = liveActivitiesEntry;
        final int i = this.f46281i;
        if (zM70876m && this.f46279g) {
            this.f46280h = C22306c.timer(4L, TimeUnit.SECONDS).take(1).observeOn(jo0.m142408a()).subscribe(ffw.m121193d(new e30() { // from class: l.xqr
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f194031a.m70879v(liveActivitiesEntry, i, zM70880w, (Long) obj);
                }
            }));
        } else {
            m70882y(liveActivitiesEntry, i, zM70880w);
        }
        this.f46281i = this.f46282j.getState();
    }

    @Override // p149l.s7m
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return getContext();
    }

    /* JADX INFO: renamed from: E */
    public void m70872E() {
        if (this.f46279g) {
            boolean zM117951b = this.f46291s.m117951b();
            if (this.f46291s.m117952c() || zM117951b) {
                rdt.m179011f(this.f46283k.m151074h3(), zM117951b);
            }
        }
    }

    @Override // p149l.s7m
    public void destroy() {
    }

    public LiveActivitiesEntry getEntryInfo() {
        return this.f46282j;
    }

    public String getScheme() {
        return this.f46284l;
    }

    public int getState() {
        LiveActivitiesEntry liveActivitiesEntry = this.f46282j;
        if (liveActivitiesEntry == null) {
            return 2;
        }
        return liveActivitiesEntry.getState();
    }

    /* JADX INFO: renamed from: i */
    public final void m70873i(View view) {
        brr.m103598a(this, view);
    }

    @Override // p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    /* JADX INFO: renamed from: j */
    public final void m70874j(int i, boolean z) {
        this.f46291s.m117950a();
        xdl0.m208327D0(xdl0.f192404f, this.f46273a);
        xdl0.m208344M(this.f46275c, i == 3);
        xdl0.m208344M(this.f46276d, i == 4);
        xdl0.m208344M(this.f46274b, (i == 3 || i == 4) ? false : true);
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(lqr lqrVar) {
        this.f46283k = lqrVar;
    }

    /* JADX INFO: renamed from: m */
    public final boolean m70876m(LiveActivitiesEntry liveActivitiesEntry) {
        LiveActivitiesEntry liveActivitiesEntry2 = this.f46282j;
        if (liveActivitiesEntry2 == null) {
            return false;
        }
        if ((!this.f46279g && liveActivitiesEntry2.getState() != 5) || mqi0.m155929D(s9s.f163232f.m134374g()) || liveActivitiesEntry.getLiveActivitySummary().cardLives.size() == 0) {
            return false;
        }
        liveActivitiesEntry.forceState(5);
        return true;
    }

    @Nullable
    /* JADX INFO: renamed from: n */
    public final fpr m70877n(int i) {
        if (i == 0) {
            return this.f46288p;
        }
        if (i == 1) {
            return this.f46287o;
        }
        if (i == 2) {
            return this.f46289q;
        }
        if (i != 5) {
            return null;
        }
        return this.f46290r;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m70873i(this);
        this.f46287o = new oqr(this.f46274b);
        this.f46288p = new uqr(this.f46274b);
        this.f46289q = new upr(this.f46274b);
        this.f46290r = new opr(this.f46274b);
        this.f46291s = new esr(this.f46277e, this.f46278f);
        if (l9s.m149078h()) {
            mep0.m154302d1(this, t100.f167260i);
        }
        m70866k();
    }

    /* JADX INFO: renamed from: u */
    public final /* synthetic */ void m70878u(fpr fprVar, fpr fprVar2) {
        ValueAnimator valueAnimatorM70849b = this.f46274b.f46247a.m70849b(fprVar, fprVar2);
        fprVar2.mo122638j(valueAnimatorM70849b, fprVar);
        fprVar.mo122636h(valueAnimatorM70849b, fprVar2);
        this.f46286n.playTogether(valueAnimatorM70849b);
        bt0.m103733f(this.f46286n, new Runnable() { // from class: l.arr
            @Override // java.lang.Runnable
            public final void run() {
                this.f71337a.m70859C();
            }
        });
        this.f46286n.start();
    }

    /* JADX INFO: renamed from: v */
    public final /* synthetic */ void m70879v(LiveActivitiesEntry liveActivitiesEntry, int i, boolean z, Long l2) {
        m70882y(liveActivitiesEntry, i, z);
    }

    /* JADX INFO: renamed from: w */
    public final boolean m70880w(LiveActivitiesEntry liveActivitiesEntry, LiveActivitiesEntry liveActivitiesEntry2) {
        return (liveActivitiesEntry == null || liveActivitiesEntry.getState() == 3 || liveActivitiesEntry.getState() == 4 || liveActivitiesEntry2.getState() == 3 || liveActivitiesEntry2.getState() == 4 || this.f46281i == liveActivitiesEntry2.getState()) ? false : true;
    }

    /* JADX INFO: renamed from: x */
    public void m70881x(boolean z) {
        this.f46279g = z;
        m70872E();
        if (z) {
            return;
        }
        mkd0.m154992z(this.f46280h);
    }

    /* JADX INFO: renamed from: y */
    public void m70882y(@NonNull LiveActivitiesEntry liveActivitiesEntry, int i, boolean z) {
        if (pgi0.m168730l().m168751x()) {
            xdl0.m208345M0(this, false);
            return;
        }
        int state = liveActivitiesEntry.getState();
        m70874j(state, z);
        if (state == 3 || state == 4) {
            m70870A(state, liveActivitiesEntry.getLiveEntranceSummary());
        } else {
            m70883z(state, i, liveActivitiesEntry.getLiveActivitySummary(), z);
        }
    }

    /* JADX INFO: renamed from: z */
    public final void m70883z(int i, int i2, BLiveActivitySummary bLiveActivitySummary, boolean z) {
        this.f46285m = new d30() { // from class: l.yqr
            @Override // p149l.d30
            public final void call() {
                this.f199612a.m70869s();
            }
        };
        fpr fprVarM70877n = m70877n(this.f46282j.getState());
        this.f46274b.m70847b(i2, i);
        this.f46274b.f46255i.setText(bLiveActivitySummary.description.title);
        this.f46274b.f46256j.setText(bLiveActivitySummary.description.desc);
        if (fprVarM70877n != null) {
            fprVarM70877n.mo122630b(this.f46283k, bLiveActivitySummary);
            this.f46283k.m151071G3(this.f46282j);
        }
        AnimatorSet animatorSet = this.f46286n;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        final fpr fprVarM70877n2 = m70877n(i2);
        final fpr fprVarM70877n3 = m70877n(i);
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.f46286n = animatorSet2;
        animatorSet2.setInterpolator(new PathInterpolator(0.42f, 0.0f, 0.01f, 1.0f));
        if (z && fprVarM70877n2 != null && fprVarM70877n3 != null) {
            post(new Runnable() { // from class: l.zqr
                @Override // java.lang.Runnable
                public final void run() {
                    this.f204410a.m70878u(fprVarM70877n2, fprVarM70877n3);
                }
            });
            return;
        }
        if (fprVarM70877n3 != null) {
            this.f46274b.f46247a.m70852e(fprVarM70877n3);
            fprVarM70877n3.mo122631c();
        }
        m70859C();
    }

    public LiveActivitiesEntryView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f46281i = 2;
        this.f46286n = new AnimatorSet();
    }

    public LiveActivitiesEntryView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f46281i = 2;
        this.f46286n = new AnimatorSet();
    }
}
