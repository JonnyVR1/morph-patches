package com.p046p1.mobile.putong.live.livingroom.increment.leaderboard.hourleaderboard.entry;

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
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.p046p1.mobile.putong.live.base.data.BLiveHourLeaderBoardItem;
import com.p046p1.mobile.putong.live.base.data.BLiveRankingMsgType;
import com.p046p1.mobile.putong.live.livingroom.R$string;
import com.p046p1.mobile.putong.live.livingroom.increment.leaderboard.hourleaderboard.intl.HourBoardProgressViewNew;
import com.p046p1.mobile.putong.live.livingroom.view.rollview.LiveTextRollView;
import com.tantanapp.common.utils.NullChecker;
import p147v.VImage;
import p149l.bt0;
import p149l.dt0;
import p149l.ehl;
import p149l.ewr;
import p149l.gar;
import p149l.mep0;
import p149l.mqi0;
import p149l.pfl;
import p149l.s7m;
import p149l.t100;
import p149l.uvr;
import p149l.w8u;
import p149l.xdl0;
import p149l.ypv;
import p149l.zpd0;

/* JADX INFO: loaded from: classes4.dex */
public class HourBoardNewEntryView extends RelativeLayout implements s7m<pfl> {

    /* JADX INFO: renamed from: o */
    public static final String f50531o = ypv.f199497e.getString(R$string.f47383m6);

    /* JADX INFO: renamed from: a */
    public HourBoardNewEntryView f50532a;

    /* JADX INFO: renamed from: b */
    public View f50533b;

    /* JADX INFO: renamed from: c */
    public HourBoardProgressViewNew f50534c;

    /* JADX INFO: renamed from: d */
    public VImage f50535d;

    /* JADX INFO: renamed from: e */
    public LiveTextRollView f50536e;

    /* JADX INFO: renamed from: f */
    public pfl f50537f;

    /* JADX INFO: renamed from: g */
    public long f50538g;

    /* JADX INFO: renamed from: h */
    public zpd0 f50539h;

    /* JADX INFO: renamed from: i */
    public BLiveHourLeaderBoardItem f50540i;

    /* JADX INFO: renamed from: j */
    public BLiveHourLeaderBoardItem f50541j;

    /* JADX INFO: renamed from: k */
    public boolean f50542k;

    /* JADX INFO: renamed from: l */
    public Animator f50543l;

    /* JADX INFO: renamed from: m */
    public Animator f50544m;

    /* JADX INFO: renamed from: n */
    public BgShowType f50545n;

    public enum BgShowType {
        SHOW,
        HIDE,
        OTHER
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.increment.leaderboard.hourleaderboard.entry.HourBoardNewEntryView$a */
    public class C12850a extends ewr {
        public C12850a() {
        }

        @Override // p149l.ewr, p149l.dxs
        /* JADX INFO: renamed from: a */
        public void mo74746a() {
            HourBoardNewEntryView.this.m74727H();
        }
    }

    public HourBoardNewEntryView(Context context) {
        super(context);
        this.f50538g = -1L;
        this.f50539h = new zpd0("show_hint_time_" + ypv.f199493a.m199309D0(), 0L);
    }

    /* JADX INFO: renamed from: E */
    private void m74714E() {
        this.f50533b.setAlpha(0.0f);
        this.f50538g = -1L;
        dt0.m113501A(this.f50543l);
        dt0.m113501A(this.f50544m);
    }

    private void setRankTextWithAni(BLiveHourLeaderBoardItem bLiveHourLeaderBoardItem) {
        long j = bLiveHourLeaderBoardItem.rank;
        Pair<String, String> pairM74735l = m74735l(bLiveHourLeaderBoardItem);
        if (!this.f50542k) {
            this.f50542k = true;
            this.f50540i = bLiveHourLeaderBoardItem;
            if (TextUtils.isEmpty((CharSequence) pairM74735l.second)) {
                long j2 = this.f50538g;
                if (j2 == j || j2 == -1 || (j2 >= 100 && j >= 100)) {
                    m74722A(j, pairM74735l);
                    this.f50533b.setAlpha(m74734k(bLiveHourLeaderBoardItem.rank));
                    this.f50536e.m76701s();
                    this.f50542k = false;
                } else {
                    m74724C(j);
                }
            } else {
                m74723B(bLiveHourLeaderBoardItem, pairM74735l);
            }
        }
        this.f50538g = j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u */
    public /* synthetic */ void m74721u(View view) {
        this.f50537f.m168648P3();
    }

    /* JADX INFO: renamed from: A */
    public final void m74722A(long j, Pair<String, String> pair) {
        if (j != this.f50538g) {
            this.f50536e.m76712D((String) pair.first);
        }
    }

    /* JADX INFO: renamed from: B */
    public final void m74723B(final BLiveHourLeaderBoardItem bLiveHourLeaderBoardItem, final Pair<String, String> pair) {
        this.f50540i = bLiveHourLeaderBoardItem;
        this.f50536e.setRollAction(new C12850a());
        final Runnable runnable = new Runnable() { // from class: l.zgl
            @Override // java.lang.Runnable
            public final void run() {
                this.f203053a.m74742w(bLiveHourLeaderBoardItem);
            }
        };
        this.f50537f.m129320z3(500L, new Runnable() { // from class: l.ahl
            @Override // java.lang.Runnable
            public final void run() {
                this.f69611a.m74744y(pair, runnable);
            }
        });
    }

    /* JADX INFO: renamed from: C */
    public final void m74724C(final long j) {
        long j2 = this.f50538g;
        LiveTextRollView liveTextRollView = this.f50536e;
        if (j > j2) {
            liveTextRollView.setNextAnim(400L);
        } else {
            liveTextRollView.setPreAnim(400L);
        }
        m74726G(this.f50540i.msgType, false);
        String strM74738p = m74738p(j);
        this.f50536e.setRollAction(null);
        this.f50536e.m76715G(strM74738p, new Runnable() { // from class: l.ygl
            @Override // java.lang.Runnable
            public final void run() {
                this.f198205a.m74745z(j);
            }
        });
    }

    @Override // p149l.s7m
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return getContext();
    }

    /* JADX INFO: renamed from: F */
    public void m74725F(float f, float f2) {
        Animator animatorM103739l = bt0.m103739l(this.f50533b, View.ALPHA, 0L, 200L, new LinearInterpolator(), f, f2);
        this.f50543l = animatorM103739l;
        animatorM103739l.start();
    }

    /* JADX INFO: renamed from: G */
    public final void m74726G(BLiveRankingMsgType bLiveRankingMsgType, boolean z) {
        BgShowType bgShowType;
        if (TEnum.equals(bLiveRankingMsgType, "progress")) {
            bgShowType = z ? BgShowType.SHOW : BgShowType.HIDE;
        } else {
            bgShowType = BgShowType.OTHER;
        }
        this.f50545n = bgShowType;
    }

    /* JADX INFO: renamed from: H */
    public void m74727H() {
        BgShowType bgShowType = this.f50545n;
        if (bgShowType == BgShowType.SHOW) {
            m74731L();
            m74740s();
        } else if (bgShowType == BgShowType.HIDE) {
            m74728I();
            m74730K();
        }
    }

    /* JADX INFO: renamed from: I */
    public void m74728I() {
        Animator animatorM103739l = bt0.m103739l(this.f50534c, View.ALPHA, 0L, 200L, new LinearInterpolator(), 1.0f, 0.0f);
        this.f50544m = animatorM103739l;
        animatorM103739l.start();
    }

    /* JADX INFO: renamed from: J */
    public void m74729J(boolean z) {
        xdl0.m208344M(this, z);
    }

    /* JADX INFO: renamed from: K */
    public void m74730K() {
        m74725F(0.0f, m74734k((int) (NullChecker.m81303a(this.f50541j) ? this.f50541j.rank : this.f50538g)));
    }

    /* JADX INFO: renamed from: L */
    public void m74731L() {
        if (!NullChecker.m81303a(this.f50540i) || !TEnum.equals(this.f50540i.msgType, "progress")) {
            xdl0.m208344M(this.f50534c, false);
            this.f50534c.m74799m();
            return;
        }
        xdl0.m208344M(this.f50534c, true);
        this.f50534c.m74800n(0.0f, 0, 0);
        this.f50534c.m74801o();
        Animator animatorM103739l = bt0.m103739l(this.f50534c, View.ALPHA, 0L, 200L, new LinearInterpolator(), 0.0f, 1.0f);
        this.f50544m = animatorM103739l;
        animatorM103739l.start();
        BLiveHourLeaderBoardItem bLiveHourLeaderBoardItem = this.f50540i;
        int i = bLiveHourLeaderBoardItem.currentHourSuggestConfig.target;
        float f = i > 0 ? (bLiveHourLeaderBoardItem.amount * 1.0f) / i : 0.0f;
        this.f50534c.m74800n(f <= 1.0f ? f : 1.0f, 200, 100);
    }

    @Override // p149l.s7m
    @Nullable
    public Act act() {
        return this.f50537f.act();
    }

    @Override // p149l.s7m
    public void destroy() {
        m74729J(false);
        m74714E();
        this.f50534c.m74799m();
        xdl0.m208344M(this.f50534c, false);
        this.f50536e.reset();
        this.f50542k = false;
    }

    /* JADX INFO: renamed from: i */
    public final void m74732i(View view) {
        ehl.m116475a(this, view);
    }

    @Override // p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    public void init() {
        xdl0.m208329E0(this, new View.OnClickListener() { // from class: l.dhl
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f86308a.m74721u(view);
            }
        });
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -1);
        layoutParams.gravity = 8388627;
        this.f50536e.setContentLayoutGravity(layoutParams);
        this.f50536e.m76712D(w8u.m202217t(R$string.f47383m6));
        this.f50536e.setMarqueeTime(1200);
        this.f50536e.setMarqueeDelayTime(500);
        this.f50534c.setColors(new int[]{Color.parseColor("#ff539c"), Color.parseColor("#ff539c")});
        mep0.m154302d1(this.f50534c, t100.m186890d(8.0f));
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(pfl pflVar) {
        this.f50537f = pflVar;
    }

    /* JADX INFO: renamed from: k */
    public final float m74734k(long j) {
        return (j >= 11 || j <= 0) ? 0.0f : 1.0f;
    }

    /* JADX INFO: renamed from: l */
    public final Pair<String, String> m74735l(BLiveHourLeaderBoardItem bLiveHourLeaderBoardItem) {
        String strM74737n;
        long j = bLiveHourLeaderBoardItem.rank;
        BLiveRankingMsgType bLiveRankingMsgType = bLiveHourLeaderBoardItem.msgType;
        String strM74738p = m74738p(j);
        if (!mqi0.m155929D(this.f50539h.get().longValue()) && bLiveHourLeaderBoardItem.currentHourSuggestConfig.scrollTexts.size() > 0) {
            strM74737n = bLiveHourLeaderBoardItem.currentHourSuggestConfig.scrollTexts.get(0);
            this.f50539h.put(Long.valueOf(mqi0.m155944o()));
        } else if (TEnum.equals(bLiveRankingMsgType, "sprint")) {
            strM74737n = m74739q((int) bLiveHourLeaderBoardItem.gap, j);
        } else if (TEnum.equals(bLiveRankingMsgType, "start")) {
            strM74737n = ypv.f199497e.getString(R$string.f47537t6, gar.m125007a(uvr.m196087d().m162715s0(), bLiveHourLeaderBoardItem.currentHourSuggestConfig.target));
        } else if (TEnum.equals(bLiveRankingMsgType, "progress")) {
            strM74737n = m74736m(bLiveHourLeaderBoardItem);
        } else {
            strM74737n = ((TEnum.equals(bLiveRankingMsgType, "normal") || TEnum.equals(bLiveRankingMsgType, "unknown_")) && this.f50538g > 0) ? m74737n(j) : "";
        }
        return Pair.create(strM74738p, strM74737n);
    }

    /* JADX INFO: renamed from: m */
    public final String m74736m(BLiveHourLeaderBoardItem bLiveHourLeaderBoardItem) {
        long j = bLiveHourLeaderBoardItem.amount;
        int i = bLiveHourLeaderBoardItem.currentHourSuggestConfig.target;
        return j >= ((long) i) ? w8u.m202217t(R$string.f47471q6) : gar.m125010d((int) j, i);
    }

    /* JADX INFO: renamed from: n */
    public final String m74737n(long j) {
        if (j <= 10 || this.f50538g > 10) {
            return (j > 10 || this.f50538g <= 10) ? "" : ypv.f199497e.getString(R$string.f47427o6);
        }
        return ypv.f199497e.getString(R$string.f47449p6);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m74732i(this);
    }

    /* JADX INFO: renamed from: p */
    public final String m74738p(long j) {
        return (j <= 0 || j > 100) ? f50531o : String.format(ypv.f199497e.getString(R$string.f47515s6), Long.valueOf(j));
    }

    /* JADX INFO: renamed from: q */
    public final String m74739q(int i, long j) {
        String strM125007a = gar.m125007a(uvr.m196087d().m162715s0(), i);
        if (j == 1) {
            return w8u.m202218u(R$string.f47405n6, strM125007a);
        }
        if (j <= 10) {
            return ypv.f199497e.getString(R$string.f47647y6, String.valueOf(1), strM125007a);
        }
        return j <= 20 ? ypv.f199497e.getString(R$string.f47647y6, String.valueOf(10), strM125007a) : "";
    }

    /* JADX INFO: renamed from: s */
    public void m74740s() {
        m74725F(m74734k(this.f50538g), 0.0f);
    }

    public void setNewRank(BLiveHourLeaderBoardItem bLiveHourLeaderBoardItem) {
        this.f50541j = bLiveHourLeaderBoardItem;
        setRankTextWithAni(bLiveHourLeaderBoardItem);
    }

    /* JADX INFO: renamed from: v */
    public final /* synthetic */ void m74741v() {
        this.f50536e.mo76702t();
        BLiveHourLeaderBoardItem bLiveHourLeaderBoardItem = this.f50541j;
        m74722A(bLiveHourLeaderBoardItem.rank, m74735l(bLiveHourLeaderBoardItem));
        this.f50533b.setAlpha(m74734k(this.f50541j.rank));
        this.f50542k = false;
    }

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ void m74742w(BLiveHourLeaderBoardItem bLiveHourLeaderBoardItem) {
        this.f50536e.setPreAnim(400L);
        m74726G(bLiveHourLeaderBoardItem.msgType, false);
        this.f50536e.m76715G((String) m74735l(this.f50541j).first, new Runnable() { // from class: l.chl
            @Override // java.lang.Runnable
            public final void run() {
                this.f80943a.m74741v();
            }
        });
    }

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ void m74743x(Runnable runnable) {
        if (this.f50537f == null) {
            return;
        }
        xdl0.m208384k0(this.f50536e.getCurrentView());
        this.f50537f.m129320z3(2000L, runnable);
    }

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ void m74744y(Pair pair, final Runnable runnable) {
        this.f50536e.setNextAnim(400L);
        this.f50536e.setGap(5);
        m74726G(this.f50540i.msgType, true);
        this.f50536e.m76715G((String) pair.second, new Runnable() { // from class: l.bhl
            @Override // java.lang.Runnable
            public final void run() {
                this.f75635a.m74743x(runnable);
            }
        });
    }

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ void m74745z(long j) {
        if (NullChecker.m81303a(this.f50541j)) {
            BLiveHourLeaderBoardItem bLiveHourLeaderBoardItem = this.f50541j;
            long j2 = bLiveHourLeaderBoardItem.rank;
            if (j2 != j) {
                m74722A(j2, m74735l(bLiveHourLeaderBoardItem));
            }
        }
        this.f50533b.setAlpha(m74734k(this.f50541j.rank));
        gar.m125012f(this.f50536e.getCurrentView());
        this.f50542k = false;
    }

    public HourBoardNewEntryView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f50538g = -1L;
        this.f50539h = new zpd0("show_hint_time_" + ypv.f199493a.m199309D0(), 0L);
    }

    public HourBoardNewEntryView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f50538g = -1L;
        this.f50539h = new zpd0("show_hint_time_" + ypv.f199493a.m199309D0(), 0L);
    }
}
