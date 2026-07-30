package com.p051p1.mobile.putong.live.livingroom.increment.leaderboard.hourleaderboard.entry;

import android.animation.Animator;
import android.content.Context;
import android.graphics.Color;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import androidx.annotation.Nullable;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.p051p1.mobile.putong.live.base.data.BLiveHourLeaderBoardItem;
import com.p051p1.mobile.putong.live.base.data.BLiveRankingMsgType;
import com.p051p1.mobile.putong.live.livingroom.R$string;
import com.p051p1.mobile.putong.live.livingroom.increment.leaderboard.hourleaderboard.intl.HourBoardProgressViewNew;
import com.p051p1.mobile.putong.live.livingroom.view.rollview.LiveTextRollView;
import com.tantanapp.common.utils.NullChecker;
import p151v.VImage;
import p153l.bnl0;
import p153l.byd0;
import p153l.fyr;
import p153l.gil;
import p153l.gt0;
import p153l.iam;
import p153l.icr;
import p153l.it0;
import p153l.pzi0;
import p153l.qa00;
import p153l.qnp0;
import p153l.vjl;
import p153l.vxr;
import p153l.xau;
import p153l.zrv;

/* JADX INFO: loaded from: classes4.dex */
public class HourBoardNewEntryView extends RelativeLayout implements iam<gil> {

    /* JADX INFO: renamed from: o */
    public static final String f51379o = zrv.f205803e.getString(R$string.f48231m6);

    /* JADX INFO: renamed from: a */
    public HourBoardNewEntryView f51380a;

    /* JADX INFO: renamed from: b */
    public View f51381b;

    /* JADX INFO: renamed from: c */
    public HourBoardProgressViewNew f51382c;

    /* JADX INFO: renamed from: d */
    public VImage f51383d;

    /* JADX INFO: renamed from: e */
    public LiveTextRollView f51384e;

    /* JADX INFO: renamed from: f */
    public gil f51385f;

    /* JADX INFO: renamed from: g */
    public long f51386g;

    /* JADX INFO: renamed from: h */
    public byd0 f51387h;

    /* JADX INFO: renamed from: i */
    public BLiveHourLeaderBoardItem f51388i;

    /* JADX INFO: renamed from: j */
    public BLiveHourLeaderBoardItem f51389j;

    /* JADX INFO: renamed from: k */
    public boolean f51390k;

    /* JADX INFO: renamed from: l */
    public Animator f51391l;

    /* JADX INFO: renamed from: m */
    public Animator f51392m;

    /* JADX INFO: renamed from: n */
    public BgShowType f51393n;

    public enum BgShowType {
        SHOW,
        HIDE,
        OTHER
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.increment.leaderboard.hourleaderboard.entry.HourBoardNewEntryView$a */
    public class C13013a extends fyr {
        public C13013a() {
        }

        @Override // p153l.fyr, p153l.ezs
        /* JADX INFO: renamed from: a */
        public void mo75929a() {
            HourBoardNewEntryView.this.m75910H();
        }
    }

    public HourBoardNewEntryView(Context context) {
        super(context);
        this.f51386g = -1L;
        this.f51387h = new byd0("show_hint_time_" + zrv.f205799a.m207631D0(), 0L);
    }

    /* JADX INFO: renamed from: E */
    private void m75897E() {
        this.f51381b.setAlpha(0.0f);
        this.f51386g = -1L;
        it0.m142007A(this.f51391l);
        it0.m142007A(this.f51392m);
    }

    private void setRankTextWithAni(BLiveHourLeaderBoardItem bLiveHourLeaderBoardItem) {
        long j = bLiveHourLeaderBoardItem.rank;
        Pair<String, String> pairM75918l = m75918l(bLiveHourLeaderBoardItem);
        if (!this.f51390k) {
            this.f51390k = true;
            this.f51388i = bLiveHourLeaderBoardItem;
            if (TextUtils.isEmpty((CharSequence) pairM75918l.second)) {
                long j2 = this.f51386g;
                if (j2 == j || j2 == -1 || (j2 >= 100 && j >= 100)) {
                    m75905A(j, pairM75918l);
                    this.f51381b.setAlpha(m75917k(bLiveHourLeaderBoardItem.rank));
                    this.f51384e.m77884s();
                    this.f51390k = false;
                } else {
                    m75907C(j);
                }
            } else {
                m75906B(bLiveHourLeaderBoardItem, pairM75918l);
            }
        }
        this.f51386g = j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u */
    public /* synthetic */ void m75904u(View view) {
        this.f51385f.m130337P3();
    }

    /* JADX INFO: renamed from: A */
    public final void m75905A(long j, Pair<String, String> pair) {
        if (j != this.f51386g) {
            this.f51384e.m77895D((String) pair.first);
        }
    }

    /* JADX INFO: renamed from: B */
    public final void m75906B(final BLiveHourLeaderBoardItem bLiveHourLeaderBoardItem, final Pair<String, String> pair) {
        this.f51388i = bLiveHourLeaderBoardItem;
        this.f51384e.setRollAction(new C13013a());
        final Runnable runnable = new Runnable() { // from class: l.qjl
            @Override // java.lang.Runnable
            public final void run() {
                this.f157996a.m75925w(bLiveHourLeaderBoardItem);
            }
        };
        this.f51385f.m138879z3(500L, new Runnable() { // from class: l.rjl
            @Override // java.lang.Runnable
            public final void run() {
                this.f163464a.m75927y(pair, runnable);
            }
        });
    }

    /* JADX INFO: renamed from: C */
    public final void m75907C(final long j) {
        long j2 = this.f51386g;
        LiveTextRollView liveTextRollView = this.f51384e;
        if (j > j2) {
            liveTextRollView.setNextAnim(400L);
        } else {
            liveTextRollView.setPreAnim(400L);
        }
        m75909G(this.f51388i.msgType, false);
        String strM75921p = m75921p(j);
        this.f51384e.setRollAction(null);
        this.f51384e.m77898G(strM75921p, new Runnable() { // from class: l.pjl
            @Override // java.lang.Runnable
            public final void run() {
                this.f152710a.m75928z(j);
            }
        });
    }

    @Override // p153l.iam
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return getContext();
    }

    /* JADX INFO: renamed from: F */
    public void m75908F(float f, float f2) {
        Animator animatorM132166l = gt0.m132166l(this.f51381b, View.ALPHA, 0L, 200L, new LinearInterpolator(), f, f2);
        this.f51391l = animatorM132166l;
        animatorM132166l.start();
    }

    /* JADX INFO: renamed from: G */
    public final void m75909G(BLiveRankingMsgType bLiveRankingMsgType, boolean z) {
        BgShowType bgShowType;
        if (TEnum.equals(bLiveRankingMsgType, "progress")) {
            bgShowType = z ? BgShowType.SHOW : BgShowType.HIDE;
        } else {
            bgShowType = BgShowType.OTHER;
        }
        this.f51393n = bgShowType;
    }

    /* JADX INFO: renamed from: H */
    public void m75910H() {
        BgShowType bgShowType = this.f51393n;
        if (bgShowType == BgShowType.SHOW) {
            m75914L();
            m75923s();
        } else if (bgShowType == BgShowType.HIDE) {
            m75911I();
            m75913K();
        }
    }

    /* JADX INFO: renamed from: I */
    public void m75911I() {
        Animator animatorM132166l = gt0.m132166l(this.f51382c, View.ALPHA, 0L, 200L, new LinearInterpolator(), 1.0f, 0.0f);
        this.f51392m = animatorM132166l;
        animatorM132166l.start();
    }

    /* JADX INFO: renamed from: J */
    public void m75912J(boolean z) {
        bnl0.m105524M(this, z);
    }

    /* JADX INFO: renamed from: K */
    public void m75913K() {
        m75908F(0.0f, m75917k((int) (NullChecker.m82486a(this.f51389j) ? this.f51389j.rank : this.f51386g)));
    }

    /* JADX INFO: renamed from: L */
    public void m75914L() {
        if (!NullChecker.m82486a(this.f51388i) || !TEnum.equals(this.f51388i.msgType, "progress")) {
            bnl0.m105524M(this.f51382c, false);
            this.f51382c.m75982m();
            return;
        }
        bnl0.m105524M(this.f51382c, true);
        this.f51382c.m75983n(0.0f, 0, 0);
        this.f51382c.m75984o();
        Animator animatorM132166l = gt0.m132166l(this.f51382c, View.ALPHA, 0L, 200L, new LinearInterpolator(), 0.0f, 1.0f);
        this.f51392m = animatorM132166l;
        animatorM132166l.start();
        BLiveHourLeaderBoardItem bLiveHourLeaderBoardItem = this.f51388i;
        int i = bLiveHourLeaderBoardItem.currentHourSuggestConfig.target;
        float f = i > 0 ? (bLiveHourLeaderBoardItem.amount * 1.0f) / i : 0.0f;
        this.f51382c.m75983n(f <= 1.0f ? f : 1.0f, 200, 100);
    }

    @Override // p153l.iam
    @Nullable
    public Act act() {
        return this.f51385f.act();
    }

    @Override // p153l.iam
    public void destroy() {
        m75912J(false);
        m75897E();
        this.f51382c.m75982m();
        bnl0.m105524M(this.f51382c, false);
        this.f51384e.reset();
        this.f51390k = false;
    }

    /* JADX INFO: renamed from: i */
    public final void m75915i(View view) {
        vjl.m201526a(this, view);
    }

    @Override // p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    public void init() {
        bnl0.m105509E0(this, new View.OnClickListener() { // from class: l.ujl
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f179223a.m75904u(view);
            }
        });
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -1);
        layoutParams.gravity = 8388627;
        this.f51384e.setContentLayoutGravity(layoutParams);
        this.f51384e.m77895D(xau.m209910t(R$string.f48231m6));
        this.f51384e.setMarqueeTime(1200);
        this.f51384e.setMarqueeDelayTime(500);
        this.f51382c.setColors(new int[]{Color.parseColor("#ff539c"), Color.parseColor("#ff539c")});
        qnp0.m177261d1(this.f51382c, qa00.m175859d(8.0f));
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(gil gilVar) {
        this.f51385f = gilVar;
    }

    /* JADX INFO: renamed from: k */
    public final float m75917k(long j) {
        return (j >= 11 || j <= 0) ? 0.0f : 1.0f;
    }

    /* JADX INFO: renamed from: l */
    public final Pair<String, String> m75918l(BLiveHourLeaderBoardItem bLiveHourLeaderBoardItem) {
        String strM75920n;
        long j = bLiveHourLeaderBoardItem.rank;
        BLiveRankingMsgType bLiveRankingMsgType = bLiveHourLeaderBoardItem.msgType;
        String strM75921p = m75921p(j);
        if (!pzi0.m174439D(this.f51387h.get().longValue()) && bLiveHourLeaderBoardItem.currentHourSuggestConfig.scrollTexts.size() > 0) {
            strM75920n = bLiveHourLeaderBoardItem.currentHourSuggestConfig.scrollTexts.get(0);
            this.f51387h.put(Long.valueOf(pzi0.m174454o()));
        } else if (TEnum.equals(bLiveRankingMsgType, "sprint")) {
            strM75920n = m75922q((int) bLiveHourLeaderBoardItem.gap, j);
        } else if (TEnum.equals(bLiveRankingMsgType, "start")) {
            strM75920n = zrv.f205803e.getString(R$string.f48385t6, icr.m139458a(vxr.m203876d().m171022s0(), bLiveHourLeaderBoardItem.currentHourSuggestConfig.target));
        } else if (TEnum.equals(bLiveRankingMsgType, "progress")) {
            strM75920n = m75919m(bLiveHourLeaderBoardItem);
        } else {
            strM75920n = ((TEnum.equals(bLiveRankingMsgType, "normal") || TEnum.equals(bLiveRankingMsgType, "unknown_")) && this.f51386g > 0) ? m75920n(j) : "";
        }
        return Pair.create(strM75921p, strM75920n);
    }

    /* JADX INFO: renamed from: m */
    public final String m75919m(BLiveHourLeaderBoardItem bLiveHourLeaderBoardItem) {
        long j = bLiveHourLeaderBoardItem.amount;
        int i = bLiveHourLeaderBoardItem.currentHourSuggestConfig.target;
        return j >= ((long) i) ? xau.m209910t(R$string.f48319q6) : icr.m139461d((int) j, i);
    }

    /* JADX INFO: renamed from: n */
    public final String m75920n(long j) {
        if (j <= 10 || this.f51386g > 10) {
            return (j > 10 || this.f51386g <= 10) ? "" : zrv.f205803e.getString(R$string.f48275o6);
        }
        return zrv.f205803e.getString(R$string.f48297p6);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m75915i(this);
    }

    /* JADX INFO: renamed from: p */
    public final String m75921p(long j) {
        return (j <= 0 || j > 100) ? f51379o : String.format(zrv.f205803e.getString(R$string.f48363s6), Long.valueOf(j));
    }

    /* JADX INFO: renamed from: q */
    public final String m75922q(int i, long j) {
        String strM139458a = icr.m139458a(vxr.m203876d().m171022s0(), i);
        if (j == 1) {
            return xau.m209911u(R$string.f48253n6, strM139458a);
        }
        if (j <= 10) {
            return zrv.f205803e.getString(R$string.f48495y6, String.valueOf(1), strM139458a);
        }
        return j <= 20 ? zrv.f205803e.getString(R$string.f48495y6, String.valueOf(10), strM139458a) : "";
    }

    /* JADX INFO: renamed from: s */
    public void m75923s() {
        m75908F(m75917k(this.f51386g), 0.0f);
    }

    public void setNewRank(BLiveHourLeaderBoardItem bLiveHourLeaderBoardItem) {
        this.f51389j = bLiveHourLeaderBoardItem;
        setRankTextWithAni(bLiveHourLeaderBoardItem);
    }

    /* JADX INFO: renamed from: v */
    public final /* synthetic */ void m75924v() {
        this.f51384e.mo77885t();
        BLiveHourLeaderBoardItem bLiveHourLeaderBoardItem = this.f51389j;
        m75905A(bLiveHourLeaderBoardItem.rank, m75918l(bLiveHourLeaderBoardItem));
        this.f51381b.setAlpha(m75917k(this.f51389j.rank));
        this.f51390k = false;
    }

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ void m75925w(BLiveHourLeaderBoardItem bLiveHourLeaderBoardItem) {
        this.f51384e.setPreAnim(400L);
        m75909G(bLiveHourLeaderBoardItem.msgType, false);
        this.f51384e.m77898G((String) m75918l(this.f51389j).first, new Runnable() { // from class: l.tjl
            @Override // java.lang.Runnable
            public final void run() {
                this.f174595a.m75924v();
            }
        });
    }

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ void m75926x(Runnable runnable) {
        if (this.f51385f == null) {
            return;
        }
        bnl0.m105564k0(this.f51384e.getCurrentView());
        this.f51385f.m138879z3(2000L, runnable);
    }

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ void m75927y(Pair pair, final Runnable runnable) {
        this.f51384e.setNextAnim(400L);
        this.f51384e.setGap(5);
        m75909G(this.f51388i.msgType, true);
        this.f51384e.m77898G((String) pair.second, new Runnable() { // from class: l.sjl
            @Override // java.lang.Runnable
            public final void run() {
                this.f169027a.m75926x(runnable);
            }
        });
    }

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ void m75928z(long j) {
        if (NullChecker.m82486a(this.f51389j)) {
            BLiveHourLeaderBoardItem bLiveHourLeaderBoardItem = this.f51389j;
            long j2 = bLiveHourLeaderBoardItem.rank;
            if (j2 != j) {
                m75905A(j2, m75918l(bLiveHourLeaderBoardItem));
            }
        }
        this.f51381b.setAlpha(m75917k(this.f51389j.rank));
        icr.m139463f(this.f51384e.getCurrentView());
        this.f51390k = false;
    }

    public HourBoardNewEntryView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f51386g = -1L;
        this.f51387h = new byd0("show_hint_time_" + zrv.f205799a.m207631D0(), 0L);
    }

    public HourBoardNewEntryView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f51386g = -1L;
        this.f51387h = new byd0("show_hint_time_" + zrv.f205799a.m207631D0(), 0L);
    }
}
