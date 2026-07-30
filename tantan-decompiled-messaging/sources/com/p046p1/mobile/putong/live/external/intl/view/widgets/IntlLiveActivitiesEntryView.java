package com.p046p1.mobile.putong.live.external.intl.view.widgets;

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
import com.p046p1.mobile.putong.live.base.data.BLiveActivitySummary;
import com.p046p1.mobile.putong.live.base.data.BLiveActivitySummaryCounters;
import com.p046p1.mobile.putong.live.base.data.BLiveConfig;
import com.p046p1.mobile.putong.live.base.data.BLiveEntranceSummary;
import com.p046p1.mobile.putong.live.base.data.BLiveSquareDetailCounters;
import com.p046p1.mobile.putong.live.base.data.BLiveUnreadTypeEnum;
import com.p046p1.mobile.putong.live.external.internal.live.square.activities.LiveActivitiesAct;
import com.p046p1.mobile.putong.live.external.intl.module.api.IntlLiveSquareApi;
import p147v.VFrame;
import p147v.VImage;
import p147v.VText;
import p149l.d30;
import p149l.frn;
import p149l.ftn;
import p149l.gkh0;
import p149l.osn;
import p149l.pgi0;
import p149l.ppr;
import p149l.rdt;
import p149l.s2u;
import p149l.s7m;
import p149l.s9s;
import p149l.t100;
import p149l.tht;
import p149l.x4u;
import p149l.xdl0;

/* JADX INFO: loaded from: classes13.dex */
public class IntlLiveActivitiesEntryView extends RelativeLayout implements s7m<osn> {

    /* JADX INFO: renamed from: a */
    public VFrame f45768a;

    /* JADX INFO: renamed from: b */
    public IntlLiveActivitiesEntryAnimBackground f45769b;

    /* JADX INFO: renamed from: c */
    public IntlLiveActivitiesEntryOrigin f45770c;

    /* JADX INFO: renamed from: d */
    public IntlLiveActivitiesEntryRead f45771d;

    /* JADX INFO: renamed from: e */
    public IntlLiveActivitiesEntryUnRead f45772e;

    /* JADX INFO: renamed from: f */
    public IntlLiveActivitiesEntrySignIn f45773f;

    /* JADX INFO: renamed from: g */
    public IntlLiveEntranceStartLiveView f45774g;

    /* JADX INFO: renamed from: h */
    public VText f45775h;

    /* JADX INFO: renamed from: i */
    public VImage f45776i;

    /* JADX INFO: renamed from: j */
    public boolean f45777j;

    /* JADX INFO: renamed from: k */
    public boolean f45778k;

    /* JADX INFO: renamed from: l */
    public int f45779l;

    /* JADX INFO: renamed from: m */
    public ppr f45780m;

    /* JADX INFO: renamed from: n */
    public osn f45781n;

    /* JADX INFO: renamed from: o */
    public String f45782o;

    /* JADX INFO: renamed from: p */
    public d30 f45783p;

    /* JADX INFO: renamed from: q */
    public AnimatorSet f45784q;

    /* JADX INFO: renamed from: r */
    public int f45785r;

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.external.intl.view.widgets.IntlLiveActivitiesEntryView$a */
    public class C12558a extends AnimatorListenerAdapter {
        public C12558a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            IntlLiveActivitiesEntryView.this.m70314F();
        }
    }

    public IntlLiveActivitiesEntryView(Context context) {
        super(context);
        this.f45779l = -1;
        this.f45784q = new AnimatorSet();
    }

    /* JADX INFO: renamed from: G */
    private void m70303G() {
        if (this.f45778k) {
            boolean zM70322p = m70322p();
            if (m70323q() || zM70322p) {
                rdt.m179011f(this.f45781n.m165862j3(), zM70322p);
            }
        }
    }

    private void setBadgeNum(int i) {
        GradientDrawable gradientDrawable = (GradientDrawable) this.f45775h.getBackground();
        if (i >= 0 && i <= 99) {
            boolean z = i < 10;
            gradientDrawable.setCornerRadius(z ? t100.f167261j : t100.m186890d(9.0f));
            this.f45775h.setPadding(z ? t100.m186890d(9.0f) : t100.f167259h, this.f45775h.getPaddingTop(), z ? t100.m186890d(9.0f) : t100.f167259h, this.f45775h.getPaddingBottom());
            this.f45775h.setText(String.valueOf(i));
            return;
        }
        if (i <= 99) {
            this.f45775h.setVisibility(8);
            return;
        }
        gradientDrawable.setCornerRadius(t100.m186890d(9.0f));
        VText vText = this.f45775h;
        int i2 = t100.f167259h;
        vText.setPadding(i2, vText.getPaddingTop(), i2, this.f45775h.getPaddingBottom());
        this.f45775h.setText("99+");
    }

    /* JADX INFO: renamed from: A */
    public void m70310A(boolean z) {
        this.f45778k = z;
        m70303G();
    }

    /* JADX INFO: renamed from: B */
    public final void m70311B(int i, int i2) {
        if (i == 2 || i == 1) {
            boolean zNeedShowActivitiesRedDot = IntlLiveSquareApi.needShowActivitiesRedDot();
            this.f45777j = zNeedShowActivitiesRedDot;
            if (zNeedShowActivitiesRedDot) {
                m70315H(false);
            }
            xdl0.m208344M(this.f45776i, this.f45777j);
            return;
        }
        BLiveConfig bLiveConfigM207019e = x4u.m207019e();
        BLiveUnreadTypeEnum bLiveUnreadTypeEnumM195937s3 = s9s.f163228b.m195937s3();
        if (bLiveConfigM207019e == null || bLiveUnreadTypeEnumM195937s3 == null) {
            xdl0.m208344M(this.f45775h, false);
            xdl0.m208344M(this.f45776i, false);
            this.f45781n.m165854D3(bLiveUnreadTypeEnumM195937s3, 0);
            return;
        }
        boolean z = i2 > 0;
        String string = bLiveUnreadTypeEnumM195937s3.toString();
        string.getClass();
        switch (string) {
            case "number":
                if (z) {
                    m70315H(true);
                }
                xdl0.m208344M(this.f45775h, z);
                setBadgeNum(i2);
                xdl0.m208344M(this.f45776i, false);
                break;
            case "redDot":
                if (z) {
                    m70315H(false);
                }
                xdl0.m208344M(this.f45776i, z);
                xdl0.m208344M(this.f45775h, false);
                break;
            case "liveIcon":
                xdl0.m208344M(this.f45775h, z);
                if (z) {
                    this.f45775h.setText("LIVE");
                }
                xdl0.m208344M(this.f45776i, false);
                break;
        }
        this.f45781n.m165854D3(bLiveUnreadTypeEnumM195937s3, i2);
        if (i == 0 && !z && IntlLiveSquareApi.needShowActivitiesRedDot()) {
            this.f45777j = true;
            m70315H(false);
            xdl0.m208344M(this.f45776i, true);
        }
    }

    /* JADX INFO: renamed from: C */
    public final void m70312C(int i, int i2, final BLiveActivitySummary bLiveActivitySummary, BLiveEntranceSummary bLiveEntranceSummary, boolean z) {
        final frn frnVarM70321n = m70321n(i2);
        final frn frnVarM70321n2 = m70321n(i);
        if (i == 0) {
            this.f45783p = new d30() { // from class: l.ctn
                @Override // p149l.d30
                public final void call() {
                    this.f82490a.m70326v(bLiveActivitySummary);
                }
            };
            this.f45772e.m70302Q(bLiveActivitySummary, this.f45780m);
        } else if (i == 1) {
            m70311B(1, -1);
            this.f45771d.m70288T(bLiveActivitySummary, this.f45781n, this.f45780m);
        } else if (i == 2) {
            this.f45783p = new d30() { // from class: l.dtn
                @Override // p149l.d30
                public final void call() {
                    this.f87861a.m70327w();
                }
            };
        } else if (i == 3) {
            this.f45773f.m70291s(this.f45781n, bLiveEntranceSummary);
            if (!TextUtils.isEmpty(bLiveEntranceSummary.scheme)) {
                this.f45782o = bLiveEntranceSummary.scheme;
            }
        } else if (i == 4) {
            this.f45774g.m70332Q(this.f45781n, bLiveEntranceSummary);
            if (!TextUtils.isEmpty(bLiveEntranceSummary.scheme)) {
                this.f45782o = bLiveEntranceSummary.scheme;
            }
        }
        AnimatorSet animatorSet = this.f45784q;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.f45784q = animatorSet2;
        animatorSet2.setInterpolator(new PathInterpolator(0.42f, 0.0f, 0.01f, 1.0f));
        if (!z || frnVarM70321n == null || frnVarM70321n2 == null) {
            m70314F();
        } else {
            post(new Runnable() { // from class: l.etn
                @Override // java.lang.Runnable
                public final void run() {
                    this.f93161a.m70328x(frnVarM70321n, frnVarM70321n2);
                }
            });
        }
    }

    @Override // p149l.s7m
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return getContext();
    }

    /* JADX INFO: renamed from: E */
    public void m70313E(@NonNull ppr pprVar) {
        boolean zM70329y = m70329y(this.f45780m, pprVar);
        this.f45780m = pprVar;
        if (pgi0.m168730l().m168751x()) {
            xdl0.m208345M0(this, false);
            return;
        }
        int iM170765g = pprVar.m170765g();
        this.f45785r = iM170765g;
        m70317j(iM170765g, zM70329y ? this.f45779l : -1);
        m70312C(iM170765g, this.f45779l, pprVar.m170762d(), pprVar.m170763e(), zM70329y);
        this.f45781n.m165858I3(pprVar);
        this.f45779l = iM170765g;
    }

    /* JADX INFO: renamed from: F */
    public final void m70314F() {
        d30 d30Var = this.f45783p;
        if (d30Var != null) {
            d30Var.call();
            this.f45783p = null;
        }
    }

    /* JADX INFO: renamed from: H */
    public final void m70315H(boolean z) {
        if (this.f45778k) {
            boolean zM70323q = m70323q();
            boolean zM70322p = m70322p();
            boolean z2 = false;
            boolean z3 = (zM70323q || zM70322p) ? false : true;
            boolean z4 = z && !zM70322p;
            if (!z && !zM70323q) {
                z2 = true;
            }
            if (z3 || z4 || z2) {
                rdt.m179011f(this.f45781n.m165862j3(), z);
            }
        }
    }

    @Override // p149l.s7m
    public void destroy() {
    }

    public int getState() {
        ppr pprVar = this.f45780m;
        if (pprVar == null) {
            return 2;
        }
        return pprVar.m170765g();
    }

    /* JADX INFO: renamed from: i */
    public final void m70316i(View view) {
        ftn.m123065a(this, view);
    }

    @Override // p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    /* JADX INFO: renamed from: j */
    public final void m70317j(int i, int i2) {
        if (i2 == -1) {
            xdl0.m208344M(this.f45772e, i == 0);
            xdl0.m208344M(this.f45771d, i == 1);
            xdl0.m208344M(this.f45770c, i == 2);
            xdl0.m208344M(this.f45773f, i == 3);
            xdl0.m208344M(this.f45774g, i == 4);
        } else {
            Object objM70321n = m70321n(i);
            if (objM70321n instanceof View) {
                ((View) objM70321n).setVisibility(4);
            }
        }
        xdl0.m208344M(this.f45775h, false);
        xdl0.m208344M(this.f45776i, false);
        xdl0.m208327D0(xdl0.f192404f, this.f45768a);
    }

    /* JADX INFO: renamed from: k */
    public final void m70318k() {
        this.f45772e.setOnCloseButtonClickListener(new View.OnClickListener() { // from class: l.atn
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f71635a.m70324s(view);
            }
        });
        xdl0.m208329E0(this, new View.OnClickListener() { // from class: l.btn
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f77249a.m70325u(view);
            }
        });
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(osn osnVar) {
        this.f45781n = osnVar;
    }

    /* JADX INFO: renamed from: m */
    public boolean m70320m(ppr pprVar) {
        if (pprVar == null) {
            return false;
        }
        int iM170765g = pprVar.m170765g();
        if (iM170765g == 0) {
            return pprVar.m170762d().counters.squareDetail.unreadCount > 0;
        }
        if (iM170765g != 2) {
            return false;
        }
        return IntlLiveSquareApi.needShowActivitiesRedDot();
    }

    @Nullable
    /* JADX INFO: renamed from: n */
    public final frn m70321n(int i) {
        if (i == 0) {
            return this.f45772e;
        }
        if (i == 1) {
            return this.f45771d;
        }
        if (i != 2) {
            return null;
        }
        return this.f45770c;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m70316i(this);
        m70318k();
    }

    /* JADX INFO: renamed from: p */
    public final boolean m70322p() {
        return xdl0.m208349O0(this.f45775h) && !TextUtils.isEmpty(this.f45775h.getText());
    }

    /* JADX INFO: renamed from: q */
    public final boolean m70323q() {
        return xdl0.m208349O0(this.f45776i);
    }

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ void m70324s(View view) {
        osn osnVar = this.f45781n;
        if (osnVar != null) {
            osnVar.m165856F3(true, this.f45777j);
            rdt.m179009d(this.f45781n.m165862j3());
        }
    }

    /* JADX INFO: renamed from: u */
    public final /* synthetic */ void m70325u(View view) {
        ppr pprVar;
        StringBuilder sb = new StringBuilder("clicked, presenter is null :");
        sb.append(this.f45781n == null);
        sb.append(",EntryInfo is null ");
        sb.append(this.f45780m == null);
        gkh0.m126627j("[live]activityEntry", sb.toString());
        osn osnVar = this.f45781n;
        if (osnVar == null || (pprVar = this.f45780m) == null) {
            return;
        }
        osnVar.m165857H3(pprVar);
        if (getState() == 3) {
            this.f45781n.m165864m3(this.f45782o);
            return;
        }
        if (getState() == 4) {
            this.f45781n.m165860K3();
            tht.m188929b(getAct(), Uri.parse(this.f45782o));
            return;
        }
        s2u.m182082n(3);
        getAct().startActivity(LiveActivitiesAct.m68954e2(getAct()));
        if (m70322p()) {
            rdt.m179010e(this.f45781n.m165862j3(), true);
        } else if (m70323q()) {
            rdt.m179010e(this.f45781n.m165862j3(), false);
        }
        this.f45781n.m165856F3(false, this.f45777j);
    }

    /* JADX INFO: renamed from: v */
    public final /* synthetic */ void m70326v(BLiveActivitySummary bLiveActivitySummary) {
        BLiveSquareDetailCounters bLiveSquareDetailCounters;
        BLiveActivitySummaryCounters bLiveActivitySummaryCounters = bLiveActivitySummary.counters;
        if (bLiveActivitySummaryCounters == null || (bLiveSquareDetailCounters = bLiveActivitySummaryCounters.squareDetail) == null) {
            return;
        }
        m70311B(0, bLiveSquareDetailCounters.unreadCount);
    }

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ void m70327w() {
        m70311B(2, -1);
        this.f45770c.m70267Z(this.f45777j, this.f45781n);
    }

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ void m70328x(frn frnVar, frn frnVar2) {
        Animator animatorM70252d = this.f45769b.m70252d(frnVar, frnVar2);
        Animator animatorMo70274v = frnVar.mo70274v(frnVar2);
        this.f45784q.playTogether(animatorM70252d, frnVar2.mo70273s(frnVar), animatorMo70274v);
        this.f45784q.addListener(new C12558a());
        this.f45784q.start();
    }

    /* JADX INFO: renamed from: y */
    public final boolean m70329y(ppr pprVar, ppr pprVar2) {
        int i;
        return (pprVar == null || (i = this.f45779l) == -1 || i == 3 || pprVar2.m170765g() == 3 || this.f45779l == 4 || pprVar2.m170765g() == 4 || this.f45779l == pprVar2.m170765g()) ? false : true;
    }

    /* JADX INFO: renamed from: z */
    public void m70330z() {
        m70303G();
    }

    public IntlLiveActivitiesEntryView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f45779l = -1;
        this.f45784q = new AnimatorSet();
    }

    public IntlLiveActivitiesEntryView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f45779l = -1;
        this.f45784q = new AnimatorSet();
    }
}
