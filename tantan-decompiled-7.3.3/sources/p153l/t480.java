package p153l;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.DialogInterface;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p051p1.mobile.putong.live.base.data.BLiveAnchor;
import com.p051p1.mobile.putong.live.base.data.BLiveCommonViewConfig;
import com.p051p1.mobile.putong.live.base.data.BLiveEnvelope;
import com.p051p1.mobile.putong.live.base.data.BLivePkSummary;
import com.p051p1.mobile.putong.live.base.data.BLivePkSummaryTab;
import com.p051p1.mobile.putong.live.base.data.BLivePkTimeRange;
import com.p051p1.mobile.putong.live.base.data.BLivePkTimeRangeInfo;
import com.p051p1.mobile.putong.live.base.data.BLiveSettings;
import com.p051p1.mobile.putong.live.livingroom.R$string;
import com.p051p1.mobile.putong.live.livingroom.api.LivingNormalApiProvider;
import com.p051p1.mobile.putong.live.livingroom.archi.dialogcenter.DialogC12774a;
import com.p051p1.mobile.putong.live.livingroom.recreation.p067pk.view.PkUpDownScorllView;
import com.p051p1.mobile.putong.p070ui.webview.p073mk.CommonH5Builder;
import java.util.Calendar;
import java.util.List;
import p151v.VImage;
import p151v.VText;

/* JADX INFO: loaded from: classes5.dex */
public class t480 extends qct<oo2> {

    /* JADX INFO: renamed from: A */
    public VImage f172029A;

    /* JADX INFO: renamed from: B */
    public TextView f172030B;

    /* JADX INFO: renamed from: C */
    public VText f172031C;

    /* JADX INFO: renamed from: D */
    public DialogC12774a f172032D;

    /* JADX INFO: renamed from: E */
    public String f172033E;

    /* JADX INFO: renamed from: F */
    public String f172034F;

    /* JADX INFO: renamed from: G */
    public Animator f172035G;

    /* JADX INFO: renamed from: i */
    public View f172036i;

    /* JADX INFO: renamed from: j */
    public VImage f172037j;

    /* JADX INFO: renamed from: k */
    public TextView f172038k;

    /* JADX INFO: renamed from: l */
    public VImage f172039l;

    /* JADX INFO: renamed from: m */
    public View f172040m;

    /* JADX INFO: renamed from: n */
    public LinearLayout f172041n;

    /* JADX INFO: renamed from: o */
    public PkUpDownScorllView f172042o;

    /* JADX INFO: renamed from: p */
    public LinearLayout f172043p;

    /* JADX INFO: renamed from: q */
    public ConstraintLayout f172044q;

    /* JADX INFO: renamed from: r */
    public VImage f172045r;

    /* JADX INFO: renamed from: s */
    public VText f172046s;

    /* JADX INFO: renamed from: t */
    public VText f172047t;

    /* JADX INFO: renamed from: u */
    public ConstraintLayout f172048u;

    /* JADX INFO: renamed from: v */
    public VImage f172049v;

    /* JADX INFO: renamed from: w */
    public VImage f172050w;

    /* JADX INFO: renamed from: x */
    public VText f172051x;

    /* JADX INFO: renamed from: y */
    public VText f172052y;

    /* JADX INFO: renamed from: z */
    public ConstraintLayout f172053z;

    public t480(dum dumVar) {
        super(dumVar);
        this.f172033E = "valid_time";
        this.f172034F = "invalid_time";
        this.f172035G = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: F4 */
    public /* synthetic */ void m189192F4(Throwable th) {
        m189226J4(m189234i4());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: G4 */
    public /* synthetic */ void m189193G4(Throwable th) {
        m189225I4(null);
    }

    /* JADX INFO: renamed from: S3 */
    public static /* synthetic */ void m189202S3(Throwable th) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x4 */
    public /* synthetic */ void m189217x4(View view) {
        if (!a9g0.m96577l((String) view.getTag(), this.f172033E)) {
            o1j0.m165649w(fct.f98273m);
        } else {
            m213811F2().LivePkEvent.startRandomSeek().mo199273j(4);
            this.f172032D.dismiss();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y4 */
    public /* synthetic */ void m189218y4(final View view) {
        m189230N4(new x20() { // from class: l.k480
            @Override // p153l.x20
            public final void call() {
                this.f123867a.m189217x4(view);
            }
        });
    }

    /* JADX INFO: renamed from: A4 */
    public final /* synthetic */ void m189219A4(final View view) {
        m189230N4(new x20() { // from class: l.j480
            @Override // p153l.x20
            public final void call() {
                this.f118273a.m189249z4(view);
            }
        });
    }

    /* JADX INFO: renamed from: B4 */
    public final /* synthetic */ void m189220B4(View view) {
        if (!a9g0.m96577l((String) view.getTag(), this.f172033E)) {
            o1j0.m165649w(fct.f98273m);
        } else {
            su70.m187994b(this, true);
            this.f172032D.dismiss();
        }
    }

    /* JADX INFO: renamed from: C4 */
    public final /* synthetic */ void m189221C4(ValueAnimator valueAnimator, ValueAnimator valueAnimator2) {
        this.f172041n.getLayoutParams().height = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        this.f172041n.requestLayout();
    }

    /* JADX INFO: renamed from: E4 */
    public final /* synthetic */ void m189223E4(List list) {
        if (this.f172042o == null || list.size() <= 1) {
            return;
        }
        this.f172042o.setBroadCastInfos(list);
    }

    /* JADX INFO: renamed from: H4 */
    public final /* synthetic */ void m189224H4(hct hctVar) {
        if (!hctVar.f108746b) {
            m189235j4();
            return;
        }
        m189229M4();
        duringCreated(LivingNormalApiProvider.m72694l7()).subscribe(dhw.m115826e(new y20() { // from class: l.l480
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f129949a.m189226J4((BLivePkSummary) obj);
            }
        }, new y20() { // from class: l.m480
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f134774a.m189192F4((Throwable) obj);
            }
        }));
        duringCreated(LivingNormalApiProvider.m72685k7()).subscribe(dhw.m115826e(new y20() { // from class: l.n480
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f140210a.m189225I4((List) obj);
            }
        }, new y20() { // from class: l.o480
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f144952a.m189193G4((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: I4 */
    public void m189225I4(List<BLiveCommonViewConfig> list) {
        if (this.f172041n == null || jyb.m147479J(list)) {
            return;
        }
        m189232P4(list);
    }

    /* JADX INFO: renamed from: J4 */
    public void m189226J4(BLivePkSummary bLivePkSummary) {
        if (bLivePkSummary.canJoinBountyPk) {
            bnl0.m105524M(this.f172052y, true);
            bnl0.m105524M(this.f172050w, true);
            this.f172052y.setText(R$string.f47613Ja);
        } else if (zrv.m221193k().m203539V4()) {
            bnl0.m105524M(this.f172052y, true);
            this.f172052y.setText(String.format(zrv.f205803e.getString(R$string.f47825Ta), Long.valueOf(bLivePkSummary.winTimes)));
        }
        if (bLivePkSummary.tabs.size() == 0) {
            BLivePkSummaryTab bLivePkSummaryTabNew_ = BLivePkSummaryTab.new_();
            bLivePkSummaryTabNew_.type = "pk-ranks";
            bLivePkSummary.tabs.add(bLivePkSummaryTabNew_);
            BLivePkSummaryTab bLivePkSummaryTabNew_2 = BLivePkSummaryTab.new_();
            bLivePkSummaryTabNew_2.type = "pk-seeks";
            bLivePkSummary.tabs.add(bLivePkSummaryTabNew_2);
            BLivePkSummaryTab bLivePkSummaryTabNew_3 = BLivePkSummaryTab.new_();
            bLivePkSummaryTabNew_3.type = "pk-invites";
            bLivePkSummary.tabs.add(bLivePkSummaryTabNew_3);
        }
        jyb.m147537z(bLivePkSummary.tabs, new y20() { // from class: l.s480
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f166181a.m189243r4((BLivePkSummaryTab) obj);
            }
        });
        qa00.m175859d(156.0f);
        int iM175859d = qa00.m175859d(140.0f);
        if (bLivePkSummary.tabs.size() == 1) {
            iM175859d = qa00.m175859d(290.0f);
        } else if (bLivePkSummary.tabs.size() == 2) {
            iM175859d = qa00.m175859d(140.0f);
        } else if (bLivePkSummary.tabs.size() == 3) {
            iM175859d = qa00.m175859d(105.0f);
        }
        ViewGroup.LayoutParams layoutParams = this.f172044q.getLayoutParams();
        layoutParams.width = iM175859d;
        this.f172044q.setLayoutParams(layoutParams);
        ViewGroup.LayoutParams layoutParams2 = this.f172048u.getLayoutParams();
        layoutParams2.width = iM175859d;
        this.f172048u.setLayoutParams(layoutParams2);
        ViewGroup.LayoutParams layoutParams3 = this.f172053z.getLayoutParams();
        layoutParams3.width = iM175859d;
        this.f172053z.setLayoutParams(layoutParams3);
    }

    /* JADX INFO: renamed from: K4 */
    public final void m189227K4(int i) {
        DialogC12774a dialogC12774a = this.f172032D;
        if (dialogC12774a == null || !dialogC12774a.isShowing()) {
            return;
        }
        bnl0.m105524M(this.f172030B, i > 0);
        this.f172030B.setText(i >= 50 ? "50+" : String.valueOf(i));
    }

    /* JADX INFO: renamed from: L4 */
    public final void m189228L4(List<BLiveAnchor> list) {
        DialogC12774a dialogC12774a = this.f172032D;
        if (dialogC12774a == null || !dialogC12774a.isShowing()) {
            return;
        }
        int size = list == null ? 0 : list.size();
        bnl0.m105524M(this.f172030B, size > 0);
        this.f172030B.setText(size >= 50 ? "50+" : String.valueOf(size));
    }

    /* JADX INFO: renamed from: M4 */
    public void m189229M4() {
        boolean zM189239n4 = m189239n4();
        if (this.f172032D == null) {
            c0s c0sVar = new c0s(this, m189233h4(this.f196919f.inflater(), null));
            this.f172032D = c0sVar;
            c0sVar.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: l.v380
                @Override // android.content.DialogInterface.OnDismissListener
                public final void onDismiss(DialogInterface dialogInterface) {
                    this.f182171a.m189248w4(dialogInterface);
                }
            });
            this.f172044q.setOnClickListener(new View.OnClickListener() { // from class: l.w380
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f187111a.m189218y4(view);
                }
            });
            this.f172048u.setOnClickListener(new View.OnClickListener() { // from class: l.x380
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f192236a.m189219A4(view);
                }
            });
            this.f172053z.setOnClickListener(new View.OnClickListener() { // from class: l.y380
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f197329a.m189244s4(view);
                }
            });
            this.f172036i.setOnClickListener(new View.OnClickListener() { // from class: l.z380
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f202806a.m189245t4(view);
                }
            });
            this.f172037j.setOnClickListener(new View.OnClickListener() { // from class: l.a480
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f68365a.m189246u4(view);
                }
            });
            this.f172039l.setOnClickListener(new View.OnClickListener() { // from class: l.b480
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f74888a.m189247v4(view);
                }
            });
            bnl0.m105524M(this.f172030B, false);
        }
        bnl0.m105524M(this.f172044q, false);
        bnl0.m105524M(this.f172048u, false);
        bnl0.m105524M(this.f172053z, false);
        bnl0.m105524M(this.f172041n, false);
        bnl0.m105524M(this.f172052y, false);
        bnl0.m105524M(this.f172050w, false);
        this.f172044q.setTag(zM189239n4 ? this.f172033E : this.f172034F);
        this.f172048u.setTag(zM189239n4 ? this.f172033E : this.f172034F);
        this.f172053z.setTag(zM189239n4 ? this.f172033E : this.f172034F);
        if (zM189239n4) {
            m189236k4();
        }
        this.f172042o.m77419l();
        this.f172032D.show();
    }

    /* JADX INFO: renamed from: N4 */
    public final void m189230N4(x20 x20Var) {
        if (x20Var != null) {
            x20Var.call();
        }
    }

    /* JADX INFO: renamed from: O4 */
    public final void m189231O4() {
        m213811F2().OpenH5Event.open().mo199273j(px50.m174112c(600).m174141B(efv.f93852i).m174152z(1.0d, 0.4d).m174146t(80).m174142p(CommonH5Builder.BgType.DEFAULT_BG).m174143q());
    }

    /* JADX INFO: renamed from: P4 */
    public void m189232P4(final List<BLiveCommonViewConfig> list) {
        Animator animatorM132170p = gt0.m132170p(this.f172041n, "alpha", 0L, 300L, new AccelerateInterpolator(), 0.0f, 1.0f);
        final ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(0, qa00.m175859d(42.0f));
        this.f172035G = gt0.m132180z(valueAnimatorOfInt, animatorM132170p);
        valueAnimatorOfInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.p480
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.f150511a.m189221C4(valueAnimatorOfInt, valueAnimator);
            }
        });
        gt0.m132176v(this.f172035G, new Runnable() { // from class: l.q480
            @Override // java.lang.Runnable
            public final void run() {
                this.f155541a.m189222D4(list);
            }
        });
        gt0.m132160f(this.f172035G, new Runnable() { // from class: l.r480
            @Override // java.lang.Runnable
            public final void run() {
                this.f161156a.m189223E4(list);
            }
        });
        this.f172035G.start();
    }

    /* JADX INFO: renamed from: h4 */
    public View m189233h4(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return u480.m194467b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: i4 */
    public final BLivePkSummary m189234i4() {
        BLivePkSummary bLivePkSummaryNew_ = BLivePkSummary.new_();
        BLivePkSummaryTab bLivePkSummaryTabNew_ = BLivePkSummaryTab.new_();
        bLivePkSummaryTabNew_.type = "pk-seeks";
        bLivePkSummaryNew_.tabs.add(bLivePkSummaryTabNew_);
        BLivePkSummaryTab bLivePkSummaryTabNew_2 = BLivePkSummaryTab.new_();
        bLivePkSummaryTabNew_2.type = "pk-invites";
        bLivePkSummaryNew_.tabs.add(bLivePkSummaryTabNew_2);
        return bLivePkSummaryNew_;
    }

    /* JADX INFO: renamed from: j4 */
    public void m189235j4() {
        DialogC12774a dialogC12774a = this.f172032D;
        if (dialogC12774a == null || !dialogC12774a.isShowing()) {
            return;
        }
        this.f172032D.dismiss();
    }

    /* JADX INFO: renamed from: k4 */
    public final void m189236k4() {
        if (wft.m206159b(2)) {
            LivingNormalApiProvider.m72395E5().subscribe(dhw.m115829h(new y20() { // from class: l.h480
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f107767a.m189227K4(((Integer) obj).intValue());
                }
            }));
        } else {
            LivingNormalApiProvider.m72386D5("", 50).subscribe(dhw.m115826e(new y20() { // from class: l.e480
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f92073a.m189240o4((BLiveEnvelope) obj);
                }
            }, new y20() { // from class: l.g480
                @Override // p153l.y20
                public final void call(Object obj) {
                    t480.m189202S3((Throwable) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: l4, reason: merged with bridge method [inline-methods] */
    public final void m189222D4(List<BLiveCommonViewConfig> list) {
        if (!jyb.m147479J(list)) {
            this.f172042o.m77415h(list.get(0), new y20() { // from class: l.c480
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f79679a.m189241p4((String) obj);
                }
            });
        }
        bnl0.m105524M(this.f172041n, true);
    }

    /* JADX INFO: renamed from: m4 */
    public final boolean m189238m4(int i, int i2, int i3, int i4) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(pzi0.m174454o());
        Calendar calendar2 = (Calendar) calendar.clone();
        calendar2.set(11, i);
        calendar2.set(12, i2);
        calendar2.set(13, 0);
        Calendar calendar3 = (Calendar) calendar.clone();
        calendar3.set(11, i3);
        calendar3.set(12, i4);
        calendar3.set(13, 0);
        if (i <= i3) {
            return calendar.after(calendar2) && calendar.before(calendar3);
        }
        return calendar.after(calendar2) || calendar.before(calendar3);
    }

    @Override // p153l.i6t, p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: n */
    public void mo70300n() {
        super.mo70300n();
        Animator animator = this.f172035G;
        if (animator != null && animator.isStarted()) {
            this.f172035G.removeAllListeners();
            this.f172035G.cancel();
        }
        if (this.f172041n != null) {
            this.f172042o.m77413f();
        }
    }

    /* JADX INFO: renamed from: n4 */
    public final boolean m189239n4() {
        BLiveSettings bLiveSettingsM203370A3 = zrv.m221193k().m203370A3();
        if (bLiveSettingsM203370A3 != null) {
            return jyb.m147520m(bLiveSettingsM203370A3.liveConfig.f45200pk.entranceShowLimit.timeRanges, new qcj() { // from class: l.d480
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return this.f85011a.m189242q4((BLivePkTimeRange) obj);
                }
            });
        }
        return true;
    }

    /* JADX INFO: renamed from: o4 */
    public final /* synthetic */ void m189240o4(BLiveEnvelope bLiveEnvelope) {
        m189228L4(bLiveEnvelope.data.anchors);
    }

    /* JADX INFO: renamed from: p4 */
    public final /* synthetic */ void m189241p4(String str) {
        m213811F2().SchemeHandleEvent.handleScheme().mo199273j(new bae0.C15953a(600).m103154e(str).m103152c());
    }

    /* JADX INFO: renamed from: q4 */
    public final /* synthetic */ Boolean m189242q4(BLivePkTimeRange bLivePkTimeRange) {
        BLivePkTimeRangeInfo bLivePkTimeRangeInfo = bLivePkTimeRange.from;
        int i = bLivePkTimeRangeInfo.hour;
        int i2 = bLivePkTimeRangeInfo.minute;
        BLivePkTimeRangeInfo bLivePkTimeRangeInfo2 = bLivePkTimeRange.f45277to;
        return Boolean.valueOf(m189238m4(i, i2, bLivePkTimeRangeInfo2.hour, bLivePkTimeRangeInfo2.minute));
    }

    /* JADX INFO: renamed from: r4 */
    public final /* synthetic */ void m189243r4(BLivePkSummaryTab bLivePkSummaryTab) {
        if (TextUtils.equals(bLivePkSummaryTab.type, "pk-ranks")) {
            bnl0.m105524M(this.f172044q, true);
        } else if (TextUtils.equals(bLivePkSummaryTab.type, "pk-seeks")) {
            bnl0.m105524M(this.f172048u, true);
        } else if (TextUtils.equals(bLivePkSummaryTab.type, "pk-invites")) {
            bnl0.m105524M(this.f172053z, true);
        }
    }

    /* JADX INFO: renamed from: s4 */
    public final /* synthetic */ void m189244s4(final View view) {
        m189230N4(new x20() { // from class: l.i480
            @Override // p153l.x20
            public final void call() {
                this.f112849a.m189220B4(view);
            }
        });
    }

    @Override // p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: t */
    public void mo73648t() {
        super.mo73648t();
        duringCreated(m213811F2().LivePkEvent.showPkDialog().m199270g()).filter(new qcj() { // from class: l.u380
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(((hct) obj).f108745a == 1);
            }
        }).subscribe(dhw.m115825d(new y20() { // from class: l.f480
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f97063a.m189224H4((hct) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: t4 */
    public final /* synthetic */ void m189245t4(View view) {
        this.f172032D.dismiss();
    }

    /* JADX INFO: renamed from: u4 */
    public final /* synthetic */ void m189246u4(View view) {
        this.f172032D.dismiss();
    }

    /* JADX INFO: renamed from: v4 */
    public final /* synthetic */ void m189247v4(View view) {
        m189231O4();
    }

    /* JADX INFO: renamed from: w4 */
    public final /* synthetic */ void m189248w4(DialogInterface dialogInterface) {
        Animator animator = this.f172035G;
        if (animator != null && animator.isRunning()) {
            this.f172035G.removeAllListeners();
            this.f172035G.cancel();
        }
        if (this.f172041n != null) {
            this.f172042o.m77413f();
        }
    }

    /* JADX INFO: renamed from: z4 */
    public final /* synthetic */ void m189249z4(View view) {
        if (!a9g0.m96577l((String) view.getTag(), this.f172033E)) {
            o1j0.m165649w(fct.f98273m);
            return;
        }
        if (bnl0.m105529O0(this.f172050w)) {
            m213811F2().LivePkEvent.startRandomSeek().mo199273j(3);
        } else {
            m213811F2().LivePkEvent.startRandomSeek().mo199273j(1);
        }
        this.f172032D.dismiss();
    }
}
