package p153l;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.DialogInterface;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.p051p1.mobile.putong.live.base.data.BLiveAnchor;
import com.p051p1.mobile.putong.live.base.data.BLiveCommonViewConfig;
import com.p051p1.mobile.putong.live.base.data.BLiveEnvelope;
import com.p051p1.mobile.putong.live.base.data.BLivePkSummary;
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
public class q580 extends qct<oo2> {

    /* JADX INFO: renamed from: A */
    public Animator f155677A;

    /* JADX INFO: renamed from: i */
    public View f155678i;

    /* JADX INFO: renamed from: j */
    public FrameLayout f155679j;

    /* JADX INFO: renamed from: k */
    public VImage f155680k;

    /* JADX INFO: renamed from: l */
    public VImage f155681l;

    /* JADX INFO: renamed from: m */
    public LinearLayout f155682m;

    /* JADX INFO: renamed from: n */
    public PkUpDownScorllView f155683n;

    /* JADX INFO: renamed from: o */
    public LinearLayout f155684o;

    /* JADX INFO: renamed from: p */
    public VImage f155685p;

    /* JADX INFO: renamed from: q */
    public VImage f155686q;

    /* JADX INFO: renamed from: r */
    public VText f155687r;

    /* JADX INFO: renamed from: s */
    public VText f155688s;

    /* JADX INFO: renamed from: t */
    public LinearLayout f155689t;

    /* JADX INFO: renamed from: u */
    public VImage f155690u;

    /* JADX INFO: renamed from: v */
    public TextView f155691v;

    /* JADX INFO: renamed from: w */
    public VText f155692w;

    /* JADX INFO: renamed from: x */
    public DialogC12774a f155693x;

    /* JADX INFO: renamed from: y */
    public String f155694y;

    /* JADX INFO: renamed from: z */
    public String f155695z;

    public q580(dum dumVar) {
        super(dumVar);
        this.f155694y = "valid_time";
        this.f155695z = "invalid_time";
        this.f155677A = null;
    }

    /* JADX INFO: renamed from: A4 */
    private void m175300A4(List<BLiveAnchor> list) {
        DialogC12774a dialogC12774a = this.f155693x;
        if (dialogC12774a == null || !dialogC12774a.isShowing()) {
            return;
        }
        int size = list == null ? 0 : list.size();
        bnl0.m105524M(this.f155691v, size > 0);
        this.f155691v.setText(size >= 50 ? "50+" : String.valueOf(size));
    }

    /* JADX INFO: renamed from: C4 */
    private void m175301C4(x20 x20Var) {
        if (x20Var != null) {
            x20Var.call();
        }
    }

    /* JADX INFO: renamed from: D4 */
    private void m175302D4() {
        m213811F2().OpenH5Event.open().mo199273j(px50.m174112c(600).m174141B(efv.f93852i).m174152z(1.0d, 0.4d).m174146t(80).m174142p(CommonH5Builder.BgType.DEFAULT_BG).m174143q());
    }

    /* JADX INFO: renamed from: K3 */
    public static /* synthetic */ void m175304K3(Throwable th) {
    }

    /* JADX INFO: renamed from: O3 */
    public static /* synthetic */ void m175308O3(Throwable th) {
    }

    /* JADX INFO: renamed from: R3 */
    public static /* synthetic */ void m175310R3(Throwable th) {
    }

    /* JADX INFO: renamed from: f4 */
    private void m175322f4() {
        if (wft.m206159b(2)) {
            LivingNormalApiProvider.m72395E5().subscribe(dhw.m115829h(new y20() { // from class: l.f580
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f97204a.m175334z4(((Integer) obj).intValue());
                }
            }));
        } else {
            LivingNormalApiProvider.m72386D5("", 50).subscribe(dhw.m115826e(new y20() { // from class: l.d580
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f85139a.m175339j4((BLiveEnvelope) obj);
                }
            }, new y20() { // from class: l.e580
                @Override // p153l.y20
                public final void call(Object obj) {
                    q580.m175304K3((Throwable) obj);
                }
            }));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g4, reason: merged with bridge method [inline-methods] */
    public void m175343u4(List<BLiveCommonViewConfig> list) {
        if (!jyb.m147479J(list)) {
            this.f155683n.m77415h(list.get(0), new y20() { // from class: l.b580
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f75040a.m175340k4((String) obj);
                }
            });
        }
        bnl0.m105524M(this.f155682m, true);
    }

    /* JADX INFO: renamed from: h4 */
    private boolean m175324h4(int i, int i2, int i3, int i4) {
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

    /* JADX INFO: renamed from: i4 */
    private boolean m175325i4() {
        BLiveSettings bLiveSettingsM203370A3 = zrv.m221193k().m203370A3();
        if (bLiveSettingsM203370A3 != null) {
            return jyb.m147520m(bLiveSettingsM203370A3.liveConfig.f45200pk.entranceShowLimit.timeRanges, new qcj() { // from class: l.c580
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return this.f79812a.m175341l4((BLivePkTimeRange) obj);
                }
            });
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m4 */
    public /* synthetic */ void m175326m4(View view) {
        m175302D4();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n4 */
    public /* synthetic */ void m175327n4(DialogInterface dialogInterface) {
        Animator animator = this.f155677A;
        if (animator != null && animator.isRunning()) {
            this.f155677A.removeAllListeners();
            this.f155677A.cancel();
        }
        if (this.f155682m != null) {
            this.f155683n.m77413f();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o4 */
    public /* synthetic */ void m175328o4(View view) {
        if (!a9g0.m96577l((String) view.getTag(), this.f155694y)) {
            o1j0.m165649w(fct.f98273m);
            return;
        }
        if (bnl0.m105529O0(this.f155686q)) {
            m213811F2().LivePkEvent.startRandomSeek().mo199273j(3);
        } else {
            m213811F2().LivePkEvent.startRandomSeek().mo199273j(1);
        }
        this.f155693x.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p4 */
    public /* synthetic */ void m175329p4(final View view) {
        m175301C4(new x20() { // from class: l.a580
            @Override // p153l.x20
            public final void call() {
                this.f68516a.m175328o4(view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q4 */
    public /* synthetic */ void m175330q4(View view) {
        if (!a9g0.m96577l((String) view.getTag(), this.f155694y)) {
            o1j0.m165649w(fct.f98273m);
        } else {
            su70.m187994b(this, true);
            this.f155693x.dismiss();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r4 */
    public /* synthetic */ void m175331r4(final View view) {
        m175301C4(new x20() { // from class: l.h580
            @Override // p153l.x20
            public final void call() {
                this.f107930a.m175330q4(view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s4 */
    public /* synthetic */ void m175332s4(View view) {
        this.f155693x.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w4 */
    public /* synthetic */ void m175333w4(hct hctVar) {
        if (!hctVar.f108746b) {
            m175338e4();
            return;
        }
        m175335B4();
        duringCreated(LivingNormalApiProvider.m72694l7()).subscribe(dhw.m115826e(new y20() { // from class: l.i580
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f113017a.m175346y4((BLivePkSummary) obj);
            }
        }, new y20() { // from class: l.j580
            @Override // p153l.y20
            public final void call(Object obj) {
                q580.m175308O3((Throwable) obj);
            }
        }));
        duringCreated(LivingNormalApiProvider.m72685k7()).subscribe(dhw.m115826e(new y20() { // from class: l.k580
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f123986a.m175345x4((List) obj);
            }
        }, new y20() { // from class: l.l580
            @Override // p153l.y20
            public final void call(Object obj) {
                q580.m175310R3((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: z4 */
    public void m175334z4(int i) {
        DialogC12774a dialogC12774a = this.f155693x;
        if (dialogC12774a == null || !dialogC12774a.isShowing()) {
            return;
        }
        bnl0.m105524M(this.f155691v, i > 0);
        this.f155691v.setText(i >= 50 ? "50+" : String.valueOf(i));
    }

    /* JADX INFO: renamed from: B4 */
    public void m175335B4() {
        boolean zM175325i4 = m175325i4();
        if (this.f155693x == null) {
            c0s c0sVar = new c0s(this, m175337d4(this.f196919f.inflater(), null));
            this.f155693x = c0sVar;
            c0sVar.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: l.m580
                @Override // android.content.DialogInterface.OnDismissListener
                public final void onDismiss(DialogInterface dialogInterface) {
                    this.f134880a.m175327n4(dialogInterface);
                }
            });
            this.f155684o.setOnClickListener(new View.OnClickListener() { // from class: l.n580
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f140317a.m175329p4(view);
                }
            });
            this.f155689t.setOnClickListener(new View.OnClickListener() { // from class: l.o580
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f145041a.m175331r4(view);
                }
            });
            this.f155678i.setOnClickListener(new View.OnClickListener() { // from class: l.p580
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f150626a.m175332s4(view);
                }
            });
            this.f155681l.setOnClickListener(new View.OnClickListener() { // from class: l.w480
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f187361a.m175326m4(view);
                }
            });
            bnl0.m105524M(this.f155691v, false);
        }
        bnl0.m105524M(this.f155682m, false);
        bnl0.m105524M(this.f155688s, false);
        bnl0.m105524M(this.f155686q, false);
        this.f155685p.setBackgroundResource(zM175325i4 ? obc0.f146103L5 : obc0.f146091K5);
        this.f155690u.setBackgroundResource(zM175325i4 ? obc0.f146259Z4 : obc0.f146248Y4);
        this.f155684o.setTag(zM175325i4 ? this.f155694y : this.f155695z);
        this.f155687r.setTextColor(Color.parseColor(zM175325i4 ? "#f57c00" : "#80f57c00"));
        this.f155692w.setTextColor(Color.parseColor(zM175325i4 ? "#923bff" : "#80923bff"));
        this.f155689t.setTag(zM175325i4 ? this.f155694y : this.f155695z);
        if (zM175325i4) {
            m175322f4();
        }
        this.f155693x.show();
    }

    /* JADX INFO: renamed from: E4 */
    public void m175336E4(final List<BLiveCommonViewConfig> list) {
        Animator animatorM132170p = gt0.m132170p(this.f155682m, "alpha", 0L, 300L, new AccelerateInterpolator(), 0.0f, 1.0f);
        final ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(0, qa00.m175859d(24.0f));
        this.f155677A = gt0.m132180z(valueAnimatorOfInt, animatorM132170p);
        valueAnimatorOfInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.x480
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.f192354a.m175342t4(valueAnimatorOfInt, valueAnimator);
            }
        });
        gt0.m132176v(this.f155677A, new Runnable() { // from class: l.y480
            @Override // java.lang.Runnable
            public final void run() {
                this.f197436a.m175343u4(list);
            }
        });
        gt0.m132160f(this.f155677A, new Runnable() { // from class: l.z480
            @Override // java.lang.Runnable
            public final void run() {
                this.f202916a.m175344v4(list);
            }
        });
        this.f155677A.start();
    }

    /* JADX INFO: renamed from: d4 */
    public View m175337d4(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return r580.m179849b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: e4 */
    public void m175338e4() {
        DialogC12774a dialogC12774a = this.f155693x;
        if (dialogC12774a == null || !dialogC12774a.isShowing()) {
            return;
        }
        this.f155693x.dismiss();
    }

    /* JADX INFO: renamed from: j4 */
    public final /* synthetic */ void m175339j4(BLiveEnvelope bLiveEnvelope) {
        m175300A4(bLiveEnvelope.data.anchors);
    }

    /* JADX INFO: renamed from: k4 */
    public final /* synthetic */ void m175340k4(String str) {
        m213811F2().SchemeHandleEvent.handleScheme().mo199273j(new bae0.C15953a(600).m103154e(str).m103152c());
    }

    /* JADX INFO: renamed from: l4 */
    public final /* synthetic */ Boolean m175341l4(BLivePkTimeRange bLivePkTimeRange) {
        BLivePkTimeRangeInfo bLivePkTimeRangeInfo = bLivePkTimeRange.from;
        int i = bLivePkTimeRangeInfo.hour;
        int i2 = bLivePkTimeRangeInfo.minute;
        BLivePkTimeRangeInfo bLivePkTimeRangeInfo2 = bLivePkTimeRange.f45277to;
        return Boolean.valueOf(m175324h4(i, i2, bLivePkTimeRangeInfo2.hour, bLivePkTimeRangeInfo2.minute));
    }

    @Override // p153l.i6t, p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: n */
    public void mo70300n() {
        super.mo70300n();
        Animator animator = this.f155677A;
        if (animator != null && animator.isStarted()) {
            this.f155677A.removeAllListeners();
            this.f155677A.cancel();
        }
        if (this.f155682m != null) {
            this.f155683n.m77413f();
        }
    }

    @Override // p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: t */
    public void mo73648t() {
        super.mo73648t();
        duringCreated(m213811F2().LivePkEvent.showPkDialog().m199270g()).filter(new qcj() { // from class: l.v480
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(((hct) obj).f108745a == 1);
            }
        }).subscribe(dhw.m115825d(new y20() { // from class: l.g580
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f102296a.m175333w4((hct) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: t4 */
    public final /* synthetic */ void m175342t4(ValueAnimator valueAnimator, ValueAnimator valueAnimator2) {
        this.f155682m.getLayoutParams().height = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        this.f155682m.requestLayout();
    }

    /* JADX INFO: renamed from: v4 */
    public final /* synthetic */ void m175344v4(List list) {
        if (this.f155683n == null || list.size() <= 1) {
            return;
        }
        this.f155683n.setBroadCastInfos(list);
    }

    /* JADX INFO: renamed from: x4 */
    public void m175345x4(List<BLiveCommonViewConfig> list) {
        if (this.f155682m == null || jyb.m147479J(list)) {
            return;
        }
        m175336E4(list);
    }

    /* JADX INFO: renamed from: y4 */
    public void m175346y4(BLivePkSummary bLivePkSummary) {
        if (bLivePkSummary.canJoinBountyPk) {
            bnl0.m105524M(this.f155688s, true);
            bnl0.m105524M(this.f155686q, true);
            this.f155688s.setText(R$string.f47613Ja);
        } else if (zrv.m221193k().m203539V4()) {
            bnl0.m105524M(this.f155688s, true);
            this.f155688s.setText(String.format(zrv.f205803e.getString(R$string.f47825Ta), Long.valueOf(bLivePkSummary.winTimes)));
        }
    }
}
