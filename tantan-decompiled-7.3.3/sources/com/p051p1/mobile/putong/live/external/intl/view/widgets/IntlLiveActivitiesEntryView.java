package com.p051p1.mobile.putong.live.external.intl.view.widgets;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.net.Uri;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.PathInterpolator;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p051p1.mobile.putong.live.base.data.BLiveActivitySummary;
import com.p051p1.mobile.putong.live.base.data.BLiveActivitySummaryCounters;
import com.p051p1.mobile.putong.live.base.data.BLiveConfig;
import com.p051p1.mobile.putong.live.base.data.BLiveEntranceSummary;
import com.p051p1.mobile.putong.live.base.data.BLiveSquareDetailCounters;
import com.p051p1.mobile.putong.live.base.data.BLiveUnreadTypeEnum;
import com.p051p1.mobile.putong.live.external.internal.live.square.activities.LiveActivitiesAct;
import com.p051p1.mobile.putong.live.external.intl.module.api.IntlLiveSquareApi;
import p151v.VFrame;
import p151v.VImage;
import p151v.VText;
import p153l.bnl0;
import p153l.ftn;
import p153l.fvn;
import p153l.iam;
import p153l.nsh0;
import p153l.oun;
import p153l.ppi0;
import p153l.qa00;
import p153l.qrr;
import p153l.sft;
import p153l.t4u;
import p153l.tbs;
import p153l.ujt;
import p153l.x20;
import p153l.y6u;

/* JADX INFO: loaded from: classes9.dex */
public class IntlLiveActivitiesEntryView extends RelativeLayout implements iam<oun> {

    /* JADX INFO: renamed from: a */
    public VFrame f46616a;

    /* JADX INFO: renamed from: b */
    public IntlLiveActivitiesEntryAnimBackground f46617b;

    /* JADX INFO: renamed from: c */
    public IntlLiveActivitiesEntryOrigin f46618c;

    /* JADX INFO: renamed from: d */
    public IntlLiveActivitiesEntryRead f46619d;

    /* JADX INFO: renamed from: e */
    public IntlLiveActivitiesEntryUnRead f46620e;

    /* JADX INFO: renamed from: f */
    public IntlLiveActivitiesEntrySignIn f46621f;

    /* JADX INFO: renamed from: g */
    public IntlLiveEntranceStartLiveView f46622g;

    /* JADX INFO: renamed from: h */
    public VText f46623h;

    /* JADX INFO: renamed from: i */
    public VImage f46624i;

    /* JADX INFO: renamed from: j */
    public boolean f46625j;

    /* JADX INFO: renamed from: k */
    public boolean f46626k;

    /* JADX INFO: renamed from: l */
    public int f46627l;

    /* JADX INFO: renamed from: m */
    public qrr f46628m;

    /* JADX INFO: renamed from: n */
    public oun f46629n;

    /* JADX INFO: renamed from: o */
    public String f46630o;

    /* JADX INFO: renamed from: p */
    public x20 f46631p;

    /* JADX INFO: renamed from: q */
    public AnimatorSet f46632q;

    /* JADX INFO: renamed from: r */
    public int f46633r;

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.external.intl.view.widgets.IntlLiveActivitiesEntryView$a */
    public class C12721a extends AnimatorListenerAdapter {
        public C12721a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            IntlLiveActivitiesEntryView.this.m71497F();
        }
    }

    public IntlLiveActivitiesEntryView(Context context) {
        super(context);
        this.f46627l = -1;
        this.f46632q = new AnimatorSet();
    }

    /* JADX INFO: renamed from: G */
    private void m71486G() {
        if (this.f46626k) {
            boolean zM71505p = m71505p();
            if (m71506q() || zM71505p) {
                sft.m185668f(this.f46629n.m169356j3(), zM71505p);
            }
        }
    }

    private void setBadgeNum(int i) {
        GradientDrawable gradientDrawable = (GradientDrawable) this.f46623h.getBackground();
        if (i >= 0 && i <= 99) {
            boolean z = i < 10;
            gradientDrawable.setCornerRadius(z ? qa00.f156323j : qa00.m175859d(9.0f));
            this.f46623h.setPadding(z ? qa00.m175859d(9.0f) : qa00.f156321h, this.f46623h.getPaddingTop(), z ? qa00.m175859d(9.0f) : qa00.f156321h, this.f46623h.getPaddingBottom());
            this.f46623h.setText(String.valueOf(i));
            return;
        }
        if (i <= 99) {
            this.f46623h.setVisibility(8);
            return;
        }
        gradientDrawable.setCornerRadius(qa00.m175859d(9.0f));
        VText vText = this.f46623h;
        int i2 = qa00.f156321h;
        vText.setPadding(i2, vText.getPaddingTop(), i2, this.f46623h.getPaddingBottom());
        this.f46623h.setText("99+");
    }

    /* JADX INFO: renamed from: A */
    public void m71493A(boolean z) {
        this.f46626k = z;
        m71486G();
    }

    /* JADX INFO: renamed from: B */
    public final void m71494B(int i, int i2) {
        if (i == 2 || i == 1) {
            boolean zNeedShowActivitiesRedDot = IntlLiveSquareApi.needShowActivitiesRedDot();
            this.f46625j = zNeedShowActivitiesRedDot;
            if (zNeedShowActivitiesRedDot) {
                m71498H(false);
            }
            bnl0.m105524M(this.f46624i, this.f46625j);
            return;
        }
        BLiveConfig bLiveConfigM214501e = y6u.m214501e();
        BLiveUnreadTypeEnum bLiveUnreadTypeEnumM203724s3 = tbs.f172989b.m203724s3();
        if (bLiveConfigM214501e == null || bLiveUnreadTypeEnumM203724s3 == null) {
            bnl0.m105524M(this.f46623h, false);
            bnl0.m105524M(this.f46624i, false);
            this.f46629n.m169348D3(bLiveUnreadTypeEnumM203724s3, 0);
            return;
        }
        boolean z = i2 > 0;
        String string = bLiveUnreadTypeEnumM203724s3.toString();
        string.getClass();
        switch (string) {
            case "number":
                if (z) {
                    m71498H(true);
                }
                bnl0.m105524M(this.f46623h, z);
                setBadgeNum(i2);
                bnl0.m105524M(this.f46624i, false);
                break;
            case "redDot":
                if (z) {
                    m71498H(false);
                }
                bnl0.m105524M(this.f46624i, z);
                bnl0.m105524M(this.f46623h, false);
                break;
            case "liveIcon":
                bnl0.m105524M(this.f46623h, z);
                if (z) {
                    this.f46623h.setText("LIVE");
                }
                bnl0.m105524M(this.f46624i, false);
                break;
        }
        this.f46629n.m169348D3(bLiveUnreadTypeEnumM203724s3, i2);
        if (i == 0 && !z && IntlLiveSquareApi.needShowActivitiesRedDot()) {
            this.f46625j = true;
            m71498H(false);
            bnl0.m105524M(this.f46624i, true);
        }
    }

    /* JADX INFO: renamed from: C */
    public final void m71495C(int i, int i2, final BLiveActivitySummary bLiveActivitySummary, BLiveEntranceSummary bLiveEntranceSummary, boolean z) {
        final ftn ftnVarM71504n = m71504n(i2);
        final ftn ftnVarM71504n2 = m71504n(i);
        if (i == 0) {
            this.f46631p = new x20() { // from class: l.cvn
                @Override // p153l.x20
                public final void call() {
                    this.f84018a.m71509v(bLiveActivitySummary);
                }
            };
            this.f46620e.m71485Q(bLiveActivitySummary, this.f46628m);
        } else if (i == 1) {
            m71494B(1, -1);
            this.f46619d.m71471T(bLiveActivitySummary, this.f46629n, this.f46628m);
        } else if (i == 2) {
            this.f46631p = new x20() { // from class: l.dvn
                @Override // p153l.x20
                public final void call() {
                    this.f90934a.m71510w();
                }
            };
        } else if (i == 3) {
            this.f46621f.m71474s(this.f46629n, bLiveEntranceSummary);
            if (!TextUtils.isEmpty(bLiveEntranceSummary.scheme)) {
                this.f46630o = bLiveEntranceSummary.scheme;
            }
        } else if (i == 4) {
            this.f46622g.m71515Q(this.f46629n, bLiveEntranceSummary);
            if (!TextUtils.isEmpty(bLiveEntranceSummary.scheme)) {
                this.f46630o = bLiveEntranceSummary.scheme;
            }
        }
        AnimatorSet animatorSet = this.f46632q;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.f46632q = animatorSet2;
        animatorSet2.setInterpolator(new PathInterpolator(0.42f, 0.0f, 0.01f, 1.0f));
        if (!z || ftnVarM71504n == null || ftnVarM71504n2 == null) {
            m71497F();
        } else {
            post(new Runnable() { // from class: l.evn
                @Override // java.lang.Runnable
                public final void run() {
                    this.f96012a.m71511x(ftnVarM71504n, ftnVarM71504n2);
                }
            });
        }
    }

    @Override // p153l.iam
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return getContext();
    }

    /* JADX INFO: renamed from: E */
    public void m71496E(@NonNull qrr qrrVar) {
        boolean zM71512y = m71512y(this.f46628m, qrrVar);
        this.f46628m = qrrVar;
        if (ppi0.m173207l().m173228x()) {
            bnl0.m105525M0(this, false);
            return;
        }
        int iM177601g = qrrVar.m177601g();
        this.f46633r = iM177601g;
        m71500j(iM177601g, zM71512y ? this.f46627l : -1);
        m71495C(iM177601g, this.f46627l, qrrVar.m177598d(), qrrVar.m177599e(), zM71512y);
        this.f46629n.m169352I3(qrrVar);
        this.f46627l = iM177601g;
    }

    /* JADX INFO: renamed from: F */
    public final void m71497F() {
        x20 x20Var = this.f46631p;
        if (x20Var != null) {
            x20Var.call();
            this.f46631p = null;
        }
    }

    /* JADX INFO: renamed from: H */
    public final void m71498H(boolean z) {
        if (this.f46626k) {
            boolean zM71506q = m71506q();
            boolean zM71505p = m71505p();
            boolean z2 = false;
            boolean z3 = (zM71506q || zM71505p) ? false : true;
            boolean z4 = z && !zM71505p;
            if (!z && !zM71506q) {
                z2 = true;
            }
            if (z3 || z4 || z2) {
                sft.m185668f(this.f46629n.m169356j3(), z);
            }
        }
    }

    @Override // p153l.iam
    public void destroy() {
    }

    public int getState() {
        qrr qrrVar = this.f46628m;
        if (qrrVar == null) {
            return 2;
        }
        return qrrVar.m177601g();
    }

    /* JADX INFO: renamed from: i */
    public final void m71499i(View view) {
        fvn.m127677a(this, view);
    }

    @Override // p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    /* JADX INFO: renamed from: j */
    public final void m71500j(int i, int i2) {
        if (i2 == -1) {
            bnl0.m105524M(this.f46620e, i == 0);
            bnl0.m105524M(this.f46619d, i == 1);
            bnl0.m105524M(this.f46618c, i == 2);
            bnl0.m105524M(this.f46621f, i == 3);
            bnl0.m105524M(this.f46622g, i == 4);
        } else {
            Object objM71504n = m71504n(i);
            if (objM71504n instanceof View) {
                ((View) objM71504n).setVisibility(4);
            }
        }
        bnl0.m105524M(this.f46623h, false);
        bnl0.m105524M(this.f46624i, false);
        bnl0.m105507D0(bnl0.f77545f, this.f46616a);
    }

    /* JADX INFO: renamed from: k */
    public final void m71501k() {
        this.f46620e.setOnCloseButtonClickListener(new View.OnClickListener() { // from class: l.avn
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f73632a.m71507s(view);
            }
        });
        bnl0.m105509E0(this, new View.OnClickListener() { // from class: l.bvn
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f78612a.m71508u(view);
            }
        });
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(oun ounVar) {
        this.f46629n = ounVar;
    }

    /* JADX INFO: renamed from: m */
    public boolean m71503m(qrr qrrVar) {
        if (qrrVar == null) {
            return false;
        }
        int iM177601g = qrrVar.m177601g();
        if (iM177601g == 0) {
            return qrrVar.m177598d().counters.squareDetail.unreadCount > 0;
        }
        if (iM177601g != 2) {
            return false;
        }
        return IntlLiveSquareApi.needShowActivitiesRedDot();
    }

    @Nullable
    /* JADX INFO: renamed from: n */
    public final ftn m71504n(int i) {
        if (i == 0) {
            return this.f46620e;
        }
        if (i == 1) {
            return this.f46619d;
        }
        if (i != 2) {
            return null;
        }
        return this.f46618c;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m71499i(this);
        m71501k();
    }

    /* JADX INFO: renamed from: p */
    public final boolean m71505p() {
        return bnl0.m105529O0(this.f46623h) && !TextUtils.isEmpty(this.f46623h.getText());
    }

    /* JADX INFO: renamed from: q */
    public final boolean m71506q() {
        return bnl0.m105529O0(this.f46624i);
    }

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ void m71507s(View view) {
        oun ounVar = this.f46629n;
        if (ounVar != null) {
            ounVar.m169350F3(true, this.f46625j);
            sft.m185666d(this.f46629n.m169356j3());
        }
    }

    /* JADX INFO: renamed from: u */
    public final /* synthetic */ void m71508u(View view) {
        qrr qrrVar;
        StringBuilder sb = new StringBuilder("clicked, presenter is null :");
        sb.append(this.f46629n == null);
        sb.append(",EntryInfo is null ");
        sb.append(this.f46628m == null);
        nsh0.m164608j("[live]activityEntry", sb.toString());
        oun ounVar = this.f46629n;
        if (ounVar == null || (qrrVar = this.f46628m) == null) {
            return;
        }
        ounVar.m169351H3(qrrVar);
        if (getState() == 3) {
            this.f46629n.m169358m3(this.f46630o);
            return;
        }
        if (getState() == 4) {
            this.f46629n.m169354K3();
            ujt.m196460b(getAct(), Uri.parse(this.f46630o));
            return;
        }
        t4u.m189325n(3);
        getAct().startActivity(LiveActivitiesAct.m70138g2(getAct()));
        if (m71505p()) {
            sft.m185667e(this.f46629n.m169356j3(), true);
        } else if (m71506q()) {
            sft.m185667e(this.f46629n.m169356j3(), false);
        }
        this.f46629n.m169350F3(false, this.f46625j);
    }

    /* JADX INFO: renamed from: v */
    public final /* synthetic */ void m71509v(BLiveActivitySummary bLiveActivitySummary) {
        BLiveSquareDetailCounters bLiveSquareDetailCounters;
        BLiveActivitySummaryCounters bLiveActivitySummaryCounters = bLiveActivitySummary.counters;
        if (bLiveActivitySummaryCounters == null || (bLiveSquareDetailCounters = bLiveActivitySummaryCounters.squareDetail) == null) {
            return;
        }
        m71494B(0, bLiveSquareDetailCounters.unreadCount);
    }

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ void m71510w() {
        m71494B(2, -1);
        this.f46618c.m71450Z(this.f46625j, this.f46629n);
    }

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ void m71511x(ftn ftnVar, ftn ftnVar2) {
        Animator animatorM71435d = this.f46617b.m71435d(ftnVar, ftnVar2);
        Animator animatorMo71457v = ftnVar.mo71457v(ftnVar2);
        this.f46632q.playTogether(animatorM71435d, ftnVar2.mo71456s(ftnVar), animatorMo71457v);
        this.f46632q.addListener(new C12721a());
        this.f46632q.start();
    }

    /* JADX INFO: renamed from: y */
    public final boolean m71512y(qrr qrrVar, qrr qrrVar2) {
        int i;
        return (qrrVar == null || (i = this.f46627l) == -1 || i == 3 || qrrVar2.m177601g() == 3 || this.f46627l == 4 || qrrVar2.m177601g() == 4 || this.f46627l == qrrVar2.m177601g()) ? false : true;
    }

    /* JADX INFO: renamed from: z */
    public void m71513z() {
        m71486G();
    }

    public IntlLiveActivitiesEntryView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f46627l = -1;
        this.f46632q = new AnimatorSet();
    }

    public IntlLiveActivitiesEntryView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f46627l = -1;
        this.f46632q = new AnimatorSet();
    }
}
