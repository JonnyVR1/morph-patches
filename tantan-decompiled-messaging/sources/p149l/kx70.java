package p149l;

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
import com.p046p1.mobile.putong.live.base.data.BLiveAnchor;
import com.p046p1.mobile.putong.live.base.data.BLiveCommonViewConfig;
import com.p046p1.mobile.putong.live.base.data.BLiveEnvelope;
import com.p046p1.mobile.putong.live.base.data.BLivePkSummary;
import com.p046p1.mobile.putong.live.base.data.BLivePkTimeRange;
import com.p046p1.mobile.putong.live.base.data.BLivePkTimeRangeInfo;
import com.p046p1.mobile.putong.live.base.data.BLiveSettings;
import com.p046p1.mobile.putong.live.livingroom.R$string;
import com.p046p1.mobile.putong.live.livingroom.api.LivingNormalApiProvider;
import com.p046p1.mobile.putong.live.livingroom.archi.dialogcenter.DialogC12611a;
import com.p046p1.mobile.putong.live.livingroom.recreation.p062pk.view.PkUpDownScorllView;
import com.p046p1.mobile.putong.p065ui.webview.p068mk.CommonH5Builder;
import java.util.Calendar;
import java.util.List;
import p147v.VImage;
import p147v.VText;

/* JADX INFO: loaded from: classes5.dex */
public class kx70 extends pat<ho2> {

    /* JADX INFO: renamed from: A */
    public Animator f125068A;

    /* JADX INFO: renamed from: i */
    public View f125069i;

    /* JADX INFO: renamed from: j */
    public FrameLayout f125070j;

    /* JADX INFO: renamed from: k */
    public VImage f125071k;

    /* JADX INFO: renamed from: l */
    public VImage f125072l;

    /* JADX INFO: renamed from: m */
    public LinearLayout f125073m;

    /* JADX INFO: renamed from: n */
    public PkUpDownScorllView f125074n;

    /* JADX INFO: renamed from: o */
    public LinearLayout f125075o;

    /* JADX INFO: renamed from: p */
    public VImage f125076p;

    /* JADX INFO: renamed from: q */
    public VImage f125077q;

    /* JADX INFO: renamed from: r */
    public VText f125078r;

    /* JADX INFO: renamed from: s */
    public VText f125079s;

    /* JADX INFO: renamed from: t */
    public LinearLayout f125080t;

    /* JADX INFO: renamed from: u */
    public VImage f125081u;

    /* JADX INFO: renamed from: v */
    public TextView f125082v;

    /* JADX INFO: renamed from: w */
    public VText f125083w;

    /* JADX INFO: renamed from: x */
    public DialogC12611a f125084x;

    /* JADX INFO: renamed from: y */
    public String f125085y;

    /* JADX INFO: renamed from: z */
    public String f125086z;

    public kx70(bsm bsmVar) {
        super(bsmVar);
        this.f125085y = "valid_time";
        this.f125086z = "invalid_time";
        this.f125068A = null;
    }

    /* JADX INFO: renamed from: A4 */
    private void m147682A4(List<BLiveAnchor> list) {
        DialogC12611a dialogC12611a = this.f125084x;
        if (dialogC12611a == null || !dialogC12611a.isShowing()) {
            return;
        }
        int size = list == null ? 0 : list.size();
        xdl0.m208344M(this.f125082v, size > 0);
        this.f125082v.setText(size >= 50 ? "50+" : String.valueOf(size));
    }

    /* JADX INFO: renamed from: C4 */
    private void m147683C4(d30 d30Var) {
        if (d30Var != null) {
            d30Var.call();
        }
    }

    /* JADX INFO: renamed from: D4 */
    private void m147684D4() {
        m206028F2().OpenH5Event.open().mo172463j(jp50.m142568c(600).m142598B(ddv.f85659i).m142609z(1.0d, 0.4d).m142603t(80).m142599p(CommonH5Builder.BgType.DEFAULT_BG).m142600q());
    }

    /* JADX INFO: renamed from: K3 */
    public static /* synthetic */ void m147686K3(Throwable th) {
    }

    /* JADX INFO: renamed from: O3 */
    public static /* synthetic */ void m147690O3(Throwable th) {
    }

    /* JADX INFO: renamed from: R3 */
    public static /* synthetic */ void m147692R3(Throwable th) {
    }

    /* JADX INFO: renamed from: f4 */
    private void m147704f4() {
        if (vdt.m198092b(2)) {
            LivingNormalApiProvider.m71212E5().subscribe(ffw.m121197h(new e30() { // from class: l.zw70
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f205159a.m147716z4(((Integer) obj).intValue());
                }
            }));
        } else {
            LivingNormalApiProvider.m71203D5("", 50).subscribe(ffw.m121194e(new e30() { // from class: l.xw70
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f194708a.m147721j4((BLiveEnvelope) obj);
                }
            }, new e30() { // from class: l.yw70
                @Override // p149l.e30
                public final void call(Object obj) {
                    kx70.m147686K3((Throwable) obj);
                }
            }));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g4, reason: merged with bridge method [inline-methods] */
    public void m147725u4(List<BLiveCommonViewConfig> list) {
        if (!vwb.m200296J(list)) {
            this.f125074n.m76232h(list.get(0), new e30() { // from class: l.vw70
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f183317a.m147722k4((String) obj);
                }
            });
        }
        xdl0.m208344M(this.f125073m, true);
    }

    /* JADX INFO: renamed from: h4 */
    private boolean m147706h4(int i, int i2, int i3, int i4) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(mqi0.m155944o());
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
    private boolean m147707i4() {
        BLiveSettings bLiveSettingsM195583A3 = ypv.m215672k().m195583A3();
        if (bLiveSettingsM195583A3 != null) {
            return vwb.m200337m(bLiveSettingsM195583A3.liveConfig.f44352pk.entranceShowLimit.timeRanges, new w9j() { // from class: l.ww70
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return this.f188343a.m147723l4((BLivePkTimeRange) obj);
                }
            });
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m4 */
    public /* synthetic */ void m147708m4(View view) {
        m147684D4();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n4 */
    public /* synthetic */ void m147709n4(DialogInterface dialogInterface) {
        Animator animator = this.f125068A;
        if (animator != null && animator.isRunning()) {
            this.f125068A.removeAllListeners();
            this.f125068A.cancel();
        }
        if (this.f125073m != null) {
            this.f125074n.m76230f();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o4 */
    public /* synthetic */ void m147710o4(View view) {
        if (!t0g0.m186871l((String) view.getTag(), this.f125085y)) {
            lsi0.m151593w(eat.f90255m);
            return;
        }
        if (xdl0.m208349O0(this.f125077q)) {
            m206028F2().LivePkEvent.startRandomSeek().mo172463j(3);
        } else {
            m206028F2().LivePkEvent.startRandomSeek().mo172463j(1);
        }
        this.f125084x.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p4 */
    public /* synthetic */ void m147711p4(final View view) {
        m147683C4(new d30() { // from class: l.uw70
            @Override // p149l.d30
            public final void call() {
                this.f178628a.m147710o4(view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q4 */
    public /* synthetic */ void m147712q4(View view) {
        if (!t0g0.m186871l((String) view.getTag(), this.f125085y)) {
            lsi0.m151593w(eat.f90255m);
        } else {
            mm70.m155306b(this, true);
            this.f125084x.dismiss();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r4 */
    public /* synthetic */ void m147713r4(final View view) {
        m147683C4(new d30() { // from class: l.bx70
            @Override // p149l.d30
            public final void call() {
                this.f77770a.m147712q4(view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s4 */
    public /* synthetic */ void m147714s4(View view) {
        this.f125084x.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w4 */
    public /* synthetic */ void m147715w4(gat gatVar) {
        if (!gatVar.f101704b) {
            m147720e4();
            return;
        }
        m147717B4();
        duringCreated(LivingNormalApiProvider.m71511l7()).subscribe(ffw.m121194e(new e30() { // from class: l.cx70
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f82851a.m147728y4((BLivePkSummary) obj);
            }
        }, new e30() { // from class: l.dx70
            @Override // p149l.e30
            public final void call(Object obj) {
                kx70.m147690O3((Throwable) obj);
            }
        }));
        duringCreated(LivingNormalApiProvider.m71502k7()).subscribe(ffw.m121194e(new e30() { // from class: l.ex70
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f93583a.m147727x4((List) obj);
            }
        }, new e30() { // from class: l.fx70
            @Override // p149l.e30
            public final void call(Object obj) {
                kx70.m147692R3((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: z4 */
    public void m147716z4(int i) {
        DialogC12611a dialogC12611a = this.f125084x;
        if (dialogC12611a == null || !dialogC12611a.isShowing()) {
            return;
        }
        xdl0.m208344M(this.f125082v, i > 0);
        this.f125082v.setText(i >= 50 ? "50+" : String.valueOf(i));
    }

    /* JADX INFO: renamed from: B4 */
    public void m147717B4() {
        boolean zM147707i4 = m147707i4();
        if (this.f125084x == null) {
            byr byrVar = new byr(this, m147719d4(this.f188513f.inflater(), null));
            this.f125084x = byrVar;
            byrVar.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: l.gx70
                @Override // android.content.DialogInterface.OnDismissListener
                public final void onDismiss(DialogInterface dialogInterface) {
                    this.f104835a.m147709n4(dialogInterface);
                }
            });
            this.f125075o.setOnClickListener(new View.OnClickListener() { // from class: l.hx70
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f109837a.m147711p4(view);
                }
            });
            this.f125080t.setOnClickListener(new View.OnClickListener() { // from class: l.ix70
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f115334a.m147713r4(view);
                }
            });
            this.f125069i.setOnClickListener(new View.OnClickListener() { // from class: l.jx70
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f120203a.m147714s4(view);
                }
            });
            this.f125072l.setOnClickListener(new View.OnClickListener() { // from class: l.qw70
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f156664a.m147708m4(view);
                }
            });
            xdl0.m208344M(this.f125082v, false);
        }
        xdl0.m208344M(this.f125073m, false);
        xdl0.m208344M(this.f125079s, false);
        xdl0.m208344M(this.f125077q, false);
        this.f125076p.setBackgroundResource(zM147707i4 ? i3c0.f110775L5 : i3c0.f110763K5);
        this.f125081u.setBackgroundResource(zM147707i4 ? i3c0.f110931Z4 : i3c0.f110920Y4);
        this.f125075o.setTag(zM147707i4 ? this.f125085y : this.f125086z);
        this.f125078r.setTextColor(Color.parseColor(zM147707i4 ? "#f57c00" : "#80f57c00"));
        this.f125083w.setTextColor(Color.parseColor(zM147707i4 ? "#923bff" : "#80923bff"));
        this.f125080t.setTag(zM147707i4 ? this.f125085y : this.f125086z);
        if (zM147707i4) {
            m147704f4();
        }
        this.f125084x.show();
    }

    /* JADX INFO: renamed from: E4 */
    public void m147718E4(final List<BLiveCommonViewConfig> list) {
        Animator animatorM103743p = bt0.m103743p(this.f125073m, "alpha", 0L, 300L, new AccelerateInterpolator(), 0.0f, 1.0f);
        final ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(0, t100.m186890d(24.0f));
        this.f125068A = bt0.m103753z(valueAnimatorOfInt, animatorM103743p);
        valueAnimatorOfInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.rw70
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.f161319a.m147724t4(valueAnimatorOfInt, valueAnimator);
            }
        });
        bt0.m103749v(this.f125068A, new Runnable() { // from class: l.sw70
            @Override // java.lang.Runnable
            public final void run() {
                this.f166637a.m147725u4(list);
            }
        });
        bt0.m103733f(this.f125068A, new Runnable() { // from class: l.tw70
            @Override // java.lang.Runnable
            public final void run() {
                this.f172374a.m147726v4(list);
            }
        });
        this.f125068A.start();
    }

    /* JADX INFO: renamed from: d4 */
    public View m147719d4(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return lx70.m152046b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: e4 */
    public void m147720e4() {
        DialogC12611a dialogC12611a = this.f125084x;
        if (dialogC12611a == null || !dialogC12611a.isShowing()) {
            return;
        }
        this.f125084x.dismiss();
    }

    /* JADX INFO: renamed from: j4 */
    public final /* synthetic */ void m147721j4(BLiveEnvelope bLiveEnvelope) {
        m147682A4(bLiveEnvelope.data.anchors);
    }

    /* JADX INFO: renamed from: k4 */
    public final /* synthetic */ void m147722k4(String str) {
        m206028F2().SchemeHandleEvent.handleScheme().mo172463j(new x1e0.C21018a(600).m206701e(str).m206699c());
    }

    /* JADX INFO: renamed from: l4 */
    public final /* synthetic */ Boolean m147723l4(BLivePkTimeRange bLivePkTimeRange) {
        BLivePkTimeRangeInfo bLivePkTimeRangeInfo = bLivePkTimeRange.from;
        int i = bLivePkTimeRangeInfo.hour;
        int i2 = bLivePkTimeRangeInfo.minute;
        BLivePkTimeRangeInfo bLivePkTimeRangeInfo2 = bLivePkTimeRange.f44429to;
        return Boolean.valueOf(m147706h4(i, i2, bLivePkTimeRangeInfo2.hour, bLivePkTimeRangeInfo2.minute));
    }

    @Override // p149l.h4t, p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: n */
    public void mo69117n() {
        super.mo69117n();
        Animator animator = this.f125068A;
        if (animator != null && animator.isStarted()) {
            this.f125068A.removeAllListeners();
            this.f125068A.cancel();
        }
        if (this.f125073m != null) {
            this.f125074n.m76230f();
        }
    }

    @Override // p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: t */
    public void mo72465t() {
        super.mo72465t();
        duringCreated(m206028F2().LivePkEvent.showPkDialog().m172460g()).filter(new w9j() { // from class: l.pw70
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(((gat) obj).f101703a == 1);
            }
        }).subscribe(ffw.m121193d(new e30() { // from class: l.ax70
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f72129a.m147715w4((gat) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: t4 */
    public final /* synthetic */ void m147724t4(ValueAnimator valueAnimator, ValueAnimator valueAnimator2) {
        this.f125073m.getLayoutParams().height = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        this.f125073m.requestLayout();
    }

    /* JADX INFO: renamed from: v4 */
    public final /* synthetic */ void m147726v4(List list) {
        if (this.f125074n == null || list.size() <= 1) {
            return;
        }
        this.f125074n.setBroadCastInfos(list);
    }

    /* JADX INFO: renamed from: x4 */
    public void m147727x4(List<BLiveCommonViewConfig> list) {
        if (this.f125073m == null || vwb.m200296J(list)) {
            return;
        }
        m147718E4(list);
    }

    /* JADX INFO: renamed from: y4 */
    public void m147728y4(BLivePkSummary bLivePkSummary) {
        if (bLivePkSummary.canJoinBountyPk) {
            xdl0.m208344M(this.f125079s, true);
            xdl0.m208344M(this.f125077q, true);
            this.f125079s.setText(R$string.f46765Ja);
        } else if (ypv.m215672k().m195752V4()) {
            xdl0.m208344M(this.f125079s, true);
            this.f125079s.setText(String.format(ypv.f199497e.getString(R$string.f46977Ta), Long.valueOf(bLivePkSummary.winTimes)));
        }
    }
}
