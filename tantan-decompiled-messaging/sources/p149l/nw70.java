package p149l;

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
import com.p046p1.mobile.putong.live.base.data.BLiveAnchor;
import com.p046p1.mobile.putong.live.base.data.BLiveCommonViewConfig;
import com.p046p1.mobile.putong.live.base.data.BLiveEnvelope;
import com.p046p1.mobile.putong.live.base.data.BLivePkSummary;
import com.p046p1.mobile.putong.live.base.data.BLivePkSummaryTab;
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
public class nw70 extends pat<ho2> {

    /* JADX INFO: renamed from: A */
    public VImage f140899A;

    /* JADX INFO: renamed from: B */
    public TextView f140900B;

    /* JADX INFO: renamed from: C */
    public VText f140901C;

    /* JADX INFO: renamed from: D */
    public DialogC12611a f140902D;

    /* JADX INFO: renamed from: E */
    public String f140903E;

    /* JADX INFO: renamed from: F */
    public String f140904F;

    /* JADX INFO: renamed from: G */
    public Animator f140905G;

    /* JADX INFO: renamed from: i */
    public View f140906i;

    /* JADX INFO: renamed from: j */
    public VImage f140907j;

    /* JADX INFO: renamed from: k */
    public TextView f140908k;

    /* JADX INFO: renamed from: l */
    public VImage f140909l;

    /* JADX INFO: renamed from: m */
    public View f140910m;

    /* JADX INFO: renamed from: n */
    public LinearLayout f140911n;

    /* JADX INFO: renamed from: o */
    public PkUpDownScorllView f140912o;

    /* JADX INFO: renamed from: p */
    public LinearLayout f140913p;

    /* JADX INFO: renamed from: q */
    public ConstraintLayout f140914q;

    /* JADX INFO: renamed from: r */
    public VImage f140915r;

    /* JADX INFO: renamed from: s */
    public VText f140916s;

    /* JADX INFO: renamed from: t */
    public VText f140917t;

    /* JADX INFO: renamed from: u */
    public ConstraintLayout f140918u;

    /* JADX INFO: renamed from: v */
    public VImage f140919v;

    /* JADX INFO: renamed from: w */
    public VImage f140920w;

    /* JADX INFO: renamed from: x */
    public VText f140921x;

    /* JADX INFO: renamed from: y */
    public VText f140922y;

    /* JADX INFO: renamed from: z */
    public ConstraintLayout f140923z;

    public nw70(bsm bsmVar) {
        super(bsmVar);
        this.f140903E = "valid_time";
        this.f140904F = "invalid_time";
        this.f140905G = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: F4 */
    public /* synthetic */ void m161807F4(Throwable th) {
        m161841J4(m161849i4());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: G4 */
    public /* synthetic */ void m161808G4(Throwable th) {
        m161840I4(null);
    }

    /* JADX INFO: renamed from: S3 */
    public static /* synthetic */ void m161817S3(Throwable th) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x4 */
    public /* synthetic */ void m161832x4(View view) {
        if (!t0g0.m186871l((String) view.getTag(), this.f140903E)) {
            lsi0.m151593w(eat.f90255m);
        } else {
            m206028F2().LivePkEvent.startRandomSeek().mo172463j(4);
            this.f140902D.dismiss();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y4 */
    public /* synthetic */ void m161833y4(final View view) {
        m161845N4(new d30() { // from class: l.ew70
            @Override // p149l.d30
            public final void call() {
                this.f93468a.m161832x4(view);
            }
        });
    }

    /* JADX INFO: renamed from: A4 */
    public final /* synthetic */ void m161834A4(final View view) {
        m161845N4(new d30() { // from class: l.dw70
            @Override // p149l.d30
            public final void call() {
                this.f88152a.m161864z4(view);
            }
        });
    }

    /* JADX INFO: renamed from: B4 */
    public final /* synthetic */ void m161835B4(View view) {
        if (!t0g0.m186871l((String) view.getTag(), this.f140903E)) {
            lsi0.m151593w(eat.f90255m);
        } else {
            mm70.m155306b(this, true);
            this.f140902D.dismiss();
        }
    }

    /* JADX INFO: renamed from: C4 */
    public final /* synthetic */ void m161836C4(ValueAnimator valueAnimator, ValueAnimator valueAnimator2) {
        this.f140911n.getLayoutParams().height = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        this.f140911n.requestLayout();
    }

    /* JADX INFO: renamed from: E4 */
    public final /* synthetic */ void m161838E4(List list) {
        if (this.f140912o == null || list.size() <= 1) {
            return;
        }
        this.f140912o.setBroadCastInfos(list);
    }

    /* JADX INFO: renamed from: H4 */
    public final /* synthetic */ void m161839H4(gat gatVar) {
        if (!gatVar.f101704b) {
            m161850j4();
            return;
        }
        m161844M4();
        duringCreated(LivingNormalApiProvider.m71511l7()).subscribe(ffw.m121194e(new e30() { // from class: l.fw70
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f99625a.m161841J4((BLivePkSummary) obj);
            }
        }, new e30() { // from class: l.gw70
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f104683a.m161807F4((Throwable) obj);
            }
        }));
        duringCreated(LivingNormalApiProvider.m71502k7()).subscribe(ffw.m121194e(new e30() { // from class: l.hw70
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f109736a.m161840I4((List) obj);
            }
        }, new e30() { // from class: l.iw70
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f115235a.m161808G4((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: I4 */
    public void m161840I4(List<BLiveCommonViewConfig> list) {
        if (this.f140911n == null || vwb.m200296J(list)) {
            return;
        }
        m161847P4(list);
    }

    /* JADX INFO: renamed from: J4 */
    public void m161841J4(BLivePkSummary bLivePkSummary) {
        if (bLivePkSummary.canJoinBountyPk) {
            xdl0.m208344M(this.f140922y, true);
            xdl0.m208344M(this.f140920w, true);
            this.f140922y.setText(R$string.f46765Ja);
        } else if (ypv.m215672k().m195752V4()) {
            xdl0.m208344M(this.f140922y, true);
            this.f140922y.setText(String.format(ypv.f199497e.getString(R$string.f46977Ta), Long.valueOf(bLivePkSummary.winTimes)));
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
        vwb.m200354z(bLivePkSummary.tabs, new e30() { // from class: l.mw70
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f136025a.m161858r4((BLivePkSummaryTab) obj);
            }
        });
        t100.m186890d(156.0f);
        int iM186890d = t100.m186890d(140.0f);
        if (bLivePkSummary.tabs.size() == 1) {
            iM186890d = t100.m186890d(290.0f);
        } else if (bLivePkSummary.tabs.size() == 2) {
            iM186890d = t100.m186890d(140.0f);
        } else if (bLivePkSummary.tabs.size() == 3) {
            iM186890d = t100.m186890d(105.0f);
        }
        ViewGroup.LayoutParams layoutParams = this.f140914q.getLayoutParams();
        layoutParams.width = iM186890d;
        this.f140914q.setLayoutParams(layoutParams);
        ViewGroup.LayoutParams layoutParams2 = this.f140918u.getLayoutParams();
        layoutParams2.width = iM186890d;
        this.f140918u.setLayoutParams(layoutParams2);
        ViewGroup.LayoutParams layoutParams3 = this.f140923z.getLayoutParams();
        layoutParams3.width = iM186890d;
        this.f140923z.setLayoutParams(layoutParams3);
    }

    /* JADX INFO: renamed from: K4 */
    public final void m161842K4(int i) {
        DialogC12611a dialogC12611a = this.f140902D;
        if (dialogC12611a == null || !dialogC12611a.isShowing()) {
            return;
        }
        xdl0.m208344M(this.f140900B, i > 0);
        this.f140900B.setText(i >= 50 ? "50+" : String.valueOf(i));
    }

    /* JADX INFO: renamed from: L4 */
    public final void m161843L4(List<BLiveAnchor> list) {
        DialogC12611a dialogC12611a = this.f140902D;
        if (dialogC12611a == null || !dialogC12611a.isShowing()) {
            return;
        }
        int size = list == null ? 0 : list.size();
        xdl0.m208344M(this.f140900B, size > 0);
        this.f140900B.setText(size >= 50 ? "50+" : String.valueOf(size));
    }

    /* JADX INFO: renamed from: M4 */
    public void m161844M4() {
        boolean zM161854n4 = m161854n4();
        if (this.f140902D == null) {
            byr byrVar = new byr(this, m161848h4(this.f188513f.inflater(), null));
            this.f140902D = byrVar;
            byrVar.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: l.pv70
                @Override // android.content.DialogInterface.OnDismissListener
                public final void onDismiss(DialogInterface dialogInterface) {
                    this.f151426a.m161863w4(dialogInterface);
                }
            });
            this.f140914q.setOnClickListener(new View.OnClickListener() { // from class: l.qv70
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f156587a.m161833y4(view);
                }
            });
            this.f140918u.setOnClickListener(new View.OnClickListener() { // from class: l.rv70
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f161177a.m161834A4(view);
                }
            });
            this.f140923z.setOnClickListener(new View.OnClickListener() { // from class: l.sv70
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f166545a.m161859s4(view);
                }
            });
            this.f140906i.setOnClickListener(new View.OnClickListener() { // from class: l.tv70
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f172269a.m161860t4(view);
                }
            });
            this.f140907j.setOnClickListener(new View.OnClickListener() { // from class: l.uv70
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f178509a.m161861u4(view);
                }
            });
            this.f140909l.setOnClickListener(new View.OnClickListener() { // from class: l.vv70
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f183200a.m161862v4(view);
                }
            });
            xdl0.m208344M(this.f140900B, false);
        }
        xdl0.m208344M(this.f140914q, false);
        xdl0.m208344M(this.f140918u, false);
        xdl0.m208344M(this.f140923z, false);
        xdl0.m208344M(this.f140911n, false);
        xdl0.m208344M(this.f140922y, false);
        xdl0.m208344M(this.f140920w, false);
        this.f140914q.setTag(zM161854n4 ? this.f140903E : this.f140904F);
        this.f140918u.setTag(zM161854n4 ? this.f140903E : this.f140904F);
        this.f140923z.setTag(zM161854n4 ? this.f140903E : this.f140904F);
        if (zM161854n4) {
            m161851k4();
        }
        this.f140912o.m76236l();
        this.f140902D.show();
    }

    /* JADX INFO: renamed from: N4 */
    public final void m161845N4(d30 d30Var) {
        if (d30Var != null) {
            d30Var.call();
        }
    }

    /* JADX INFO: renamed from: O4 */
    public final void m161846O4() {
        m206028F2().OpenH5Event.open().mo172463j(jp50.m142568c(600).m142598B(ddv.f85659i).m142609z(1.0d, 0.4d).m142603t(80).m142599p(CommonH5Builder.BgType.DEFAULT_BG).m142600q());
    }

    /* JADX INFO: renamed from: P4 */
    public void m161847P4(final List<BLiveCommonViewConfig> list) {
        Animator animatorM103743p = bt0.m103743p(this.f140911n, "alpha", 0L, 300L, new AccelerateInterpolator(), 0.0f, 1.0f);
        final ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(0, t100.m186890d(42.0f));
        this.f140905G = bt0.m103753z(valueAnimatorOfInt, animatorM103743p);
        valueAnimatorOfInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.jw70
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.f120060a.m161836C4(valueAnimatorOfInt, valueAnimator);
            }
        });
        bt0.m103749v(this.f140905G, new Runnable() { // from class: l.kw70
            @Override // java.lang.Runnable
            public final void run() {
                this.f124938a.m161837D4(list);
            }
        });
        bt0.m103733f(this.f140905G, new Runnable() { // from class: l.lw70
            @Override // java.lang.Runnable
            public final void run() {
                this.f130251a.m161838E4(list);
            }
        });
        this.f140905G.start();
    }

    /* JADX INFO: renamed from: h4 */
    public View m161848h4(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return ow70.m166289b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: i4 */
    public final BLivePkSummary m161849i4() {
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
    public void m161850j4() {
        DialogC12611a dialogC12611a = this.f140902D;
        if (dialogC12611a == null || !dialogC12611a.isShowing()) {
            return;
        }
        this.f140902D.dismiss();
    }

    /* JADX INFO: renamed from: k4 */
    public final void m161851k4() {
        if (vdt.m198092b(2)) {
            LivingNormalApiProvider.m71212E5().subscribe(ffw.m121197h(new e30() { // from class: l.bw70
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f77594a.m161842K4(((Integer) obj).intValue());
                }
            }));
        } else {
            LivingNormalApiProvider.m71203D5("", 50).subscribe(ffw.m121194e(new e30() { // from class: l.yv70
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f200240a.m161855o4((BLiveEnvelope) obj);
                }
            }, new e30() { // from class: l.aw70
                @Override // p149l.e30
                public final void call(Object obj) {
                    nw70.m161817S3((Throwable) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: l4, reason: merged with bridge method [inline-methods] */
    public final void m161837D4(List<BLiveCommonViewConfig> list) {
        if (!vwb.m200296J(list)) {
            this.f140912o.m76232h(list.get(0), new e30() { // from class: l.wv70
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f188220a.m161856p4((String) obj);
                }
            });
        }
        xdl0.m208344M(this.f140911n, true);
    }

    /* JADX INFO: renamed from: m4 */
    public final boolean m161853m4(int i, int i2, int i3, int i4) {
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

    @Override // p149l.h4t, p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: n */
    public void mo69117n() {
        super.mo69117n();
        Animator animator = this.f140905G;
        if (animator != null && animator.isStarted()) {
            this.f140905G.removeAllListeners();
            this.f140905G.cancel();
        }
        if (this.f140911n != null) {
            this.f140912o.m76230f();
        }
    }

    /* JADX INFO: renamed from: n4 */
    public final boolean m161854n4() {
        BLiveSettings bLiveSettingsM195583A3 = ypv.m215672k().m195583A3();
        if (bLiveSettingsM195583A3 != null) {
            return vwb.m200337m(bLiveSettingsM195583A3.liveConfig.f44352pk.entranceShowLimit.timeRanges, new w9j() { // from class: l.xv70
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return this.f194585a.m161857q4((BLivePkTimeRange) obj);
                }
            });
        }
        return true;
    }

    /* JADX INFO: renamed from: o4 */
    public final /* synthetic */ void m161855o4(BLiveEnvelope bLiveEnvelope) {
        m161843L4(bLiveEnvelope.data.anchors);
    }

    /* JADX INFO: renamed from: p4 */
    public final /* synthetic */ void m161856p4(String str) {
        m206028F2().SchemeHandleEvent.handleScheme().mo172463j(new x1e0.C21018a(600).m206701e(str).m206699c());
    }

    /* JADX INFO: renamed from: q4 */
    public final /* synthetic */ Boolean m161857q4(BLivePkTimeRange bLivePkTimeRange) {
        BLivePkTimeRangeInfo bLivePkTimeRangeInfo = bLivePkTimeRange.from;
        int i = bLivePkTimeRangeInfo.hour;
        int i2 = bLivePkTimeRangeInfo.minute;
        BLivePkTimeRangeInfo bLivePkTimeRangeInfo2 = bLivePkTimeRange.f44429to;
        return Boolean.valueOf(m161853m4(i, i2, bLivePkTimeRangeInfo2.hour, bLivePkTimeRangeInfo2.minute));
    }

    /* JADX INFO: renamed from: r4 */
    public final /* synthetic */ void m161858r4(BLivePkSummaryTab bLivePkSummaryTab) {
        if (TextUtils.equals(bLivePkSummaryTab.type, "pk-ranks")) {
            xdl0.m208344M(this.f140914q, true);
        } else if (TextUtils.equals(bLivePkSummaryTab.type, "pk-seeks")) {
            xdl0.m208344M(this.f140918u, true);
        } else if (TextUtils.equals(bLivePkSummaryTab.type, "pk-invites")) {
            xdl0.m208344M(this.f140923z, true);
        }
    }

    /* JADX INFO: renamed from: s4 */
    public final /* synthetic */ void m161859s4(final View view) {
        m161845N4(new d30() { // from class: l.cw70
            @Override // p149l.d30
            public final void call() {
                this.f82755a.m161835B4(view);
            }
        });
    }

    @Override // p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: t */
    public void mo72465t() {
        super.mo72465t();
        duringCreated(m206028F2().LivePkEvent.showPkDialog().m172460g()).filter(new w9j() { // from class: l.ov70
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(((gat) obj).f101703a == 1);
            }
        }).subscribe(ffw.m121193d(new e30() { // from class: l.zv70
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f204976a.m161839H4((gat) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: t4 */
    public final /* synthetic */ void m161860t4(View view) {
        this.f140902D.dismiss();
    }

    /* JADX INFO: renamed from: u4 */
    public final /* synthetic */ void m161861u4(View view) {
        this.f140902D.dismiss();
    }

    /* JADX INFO: renamed from: v4 */
    public final /* synthetic */ void m161862v4(View view) {
        m161846O4();
    }

    /* JADX INFO: renamed from: w4 */
    public final /* synthetic */ void m161863w4(DialogInterface dialogInterface) {
        Animator animator = this.f140905G;
        if (animator != null && animator.isRunning()) {
            this.f140905G.removeAllListeners();
            this.f140905G.cancel();
        }
        if (this.f140911n != null) {
            this.f140912o.m76230f();
        }
    }

    /* JADX INFO: renamed from: z4 */
    public final /* synthetic */ void m161864z4(View view) {
        if (!t0g0.m186871l((String) view.getTag(), this.f140903E)) {
            lsi0.m151593w(eat.f90255m);
            return;
        }
        if (xdl0.m208349O0(this.f140920w)) {
            m206028F2().LivePkEvent.startRandomSeek().mo172463j(3);
        } else {
            m206028F2().LivePkEvent.startRandomSeek().mo172463j(1);
        }
        this.f140902D.dismiss();
    }
}
