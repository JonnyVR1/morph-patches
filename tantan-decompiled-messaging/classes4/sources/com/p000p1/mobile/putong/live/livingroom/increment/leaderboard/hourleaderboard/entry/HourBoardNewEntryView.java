package com.p000p1.mobile.putong.live.livingroom.increment.leaderboard.hourleaderboard.entry;

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
import com.p000p1.mobile.putong.live.livingroom.R$string;
import com.p000p1.mobile.putong.live.livingroom.increment.leaderboard.hourleaderboard.intl.HourBoardProgressViewNew;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.data.tenum.TEnum;
import com.p1.mobile.putong.live.base.data.BLiveHourLeaderBoardItem;
import com.p1.mobile.putong.live.base.data.BLiveRankingMsgType;
import com.p1.mobile.putong.live.livingroom.view.rollview.LiveTextRollView;
import com.tantanapp.common.utils.NullChecker;
import l.bt0;
import l.dt0;
import l.dxs;
import l.ewr;
import l.mep0;
import l.mqi0;
import l.s7m;
import l.t100;
import l.uvr;
import l.w8u;
import l.xdl0;
import l.ypv;
import l.zpd0;
import p002l.ehl;
import p002l.gar;
import p002l.pfl;
import v.VImage;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class HourBoardNewEntryView extends RelativeLayout implements s7m<pfl> {

    /* JADX INFO: renamed from: o */
    public static final String f6573o = ypv.e.getString(R$string.f3425m6);

    /* JADX INFO: renamed from: a */
    public HourBoardNewEntryView f6574a;

    /* JADX INFO: renamed from: b */
    public View f6575b;

    /* JADX INFO: renamed from: c */
    public HourBoardProgressViewNew f6576c;

    /* JADX INFO: renamed from: d */
    public VImage f6577d;

    /* JADX INFO: renamed from: e */
    public LiveTextRollView f6578e;

    /* JADX INFO: renamed from: f */
    public pfl f6579f;

    /* JADX INFO: renamed from: g */
    public long f6580g;

    /* JADX INFO: renamed from: h */
    public zpd0 f6581h;

    /* JADX INFO: renamed from: i */
    public BLiveHourLeaderBoardItem f6582i;

    /* JADX INFO: renamed from: j */
    public BLiveHourLeaderBoardItem f6583j;

    /* JADX INFO: renamed from: k */
    public boolean f6584k;

    /* JADX INFO: renamed from: l */
    public Animator f6585l;

    /* JADX INFO: renamed from: m */
    public Animator f6586m;

    /* JADX INFO: renamed from: n */
    public BgShowType f6587n;

    public enum BgShowType {
        SHOW,
        HIDE,
        OTHER
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.increment.leaderboard.hourleaderboard.entry.HourBoardNewEntryView$a */
    public class C0439a extends ewr {
        public C0439a() {
        }

        /* JADX INFO: renamed from: a */
        public void m8344a() {
            HourBoardNewEntryView.this.m8324H();
        }
    }

    public HourBoardNewEntryView(Context context) {
        super(context);
        this.f6580g = -1L;
        this.f6581h = new zpd0("show_hint_time_" + ypv.a.D0(), 0L);
    }

    /* JADX INFO: renamed from: E */
    private void m8310E() {
        this.f6575b.setAlpha(0.0f);
        this.f6580g = -1L;
        dt0.A(this.f6585l);
        dt0.A(this.f6586m);
    }

    private void setRankTextWithAni(BLiveHourLeaderBoardItem bLiveHourLeaderBoardItem) {
        long j = bLiveHourLeaderBoardItem.rank;
        Pair<String, String> pairM8333l = m8333l(bLiveHourLeaderBoardItem);
        if (!this.f6584k) {
            this.f6584k = true;
            this.f6582i = bLiveHourLeaderBoardItem;
            if (TextUtils.isEmpty((CharSequence) pairM8333l.second)) {
                long j2 = this.f6580g;
                if (j2 == j || j2 == -1 || (j2 >= 100 && j >= 100)) {
                    m8318A(j, pairM8333l);
                    this.f6575b.setAlpha(m8332k(bLiveHourLeaderBoardItem.rank));
                    this.f6578e.s();
                    this.f6584k = false;
                } else {
                    m8320C(j);
                }
            } else {
                m8319B(bLiveHourLeaderBoardItem, pairM8333l);
            }
        }
        this.f6580g = j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u */
    public /* synthetic */ void m8317u(View view) {
        this.f6579f.m20235P3();
    }

    /* JADX INFO: renamed from: A */
    public final void m8318A(long j, Pair<String, String> pair) {
        if (j != this.f6580g) {
            this.f6578e.D((String) pair.first);
        }
    }

    /* JADX INFO: renamed from: B */
    public final void m8319B(final BLiveHourLeaderBoardItem bLiveHourLeaderBoardItem, final Pair<String, String> pair) {
        this.f6582i = bLiveHourLeaderBoardItem;
        this.f6578e.setRollAction(new C0439a());
        final Runnable runnable = new Runnable() { // from class: l.zgl
            @Override // java.lang.Runnable
            public final void run() {
                this.f23402a.m8340w(bLiveHourLeaderBoardItem);
            }
        };
        this.f6579f.m14207z3(500L, new Runnable() { // from class: l.ahl
            @Override // java.lang.Runnable
            public final void run() {
                this.f7620a.m8342y(pair, runnable);
            }
        });
    }

    /* JADX INFO: renamed from: C */
    public final void m8320C(final long j) {
        long j2 = this.f6580g;
        LiveTextRollView liveTextRollView = this.f6578e;
        if (j > j2) {
            liveTextRollView.setNextAnim(400L);
        } else {
            liveTextRollView.setPreAnim(400L);
        }
        m8323G(this.f6582i.msgType, false);
        String strM8336p = m8336p(j);
        this.f6578e.setRollAction((dxs) null);
        this.f6578e.G(strM8336p, new Runnable() { // from class: l.ygl
            @Override // java.lang.Runnable
            public final void run() {
                this.f22878a.m8343z(j);
            }
        });
    }

    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context m8321C0() {
        return getContext();
    }

    /* JADX INFO: renamed from: F */
    public void m8322F(float f, float f2) {
        Animator animatorL = bt0.l(this.f6575b, View.ALPHA, 0L, 200L, new LinearInterpolator(), new float[]{f, f2});
        this.f6585l = animatorL;
        animatorL.start();
    }

    /* JADX INFO: renamed from: G */
    public final void m8323G(BLiveRankingMsgType bLiveRankingMsgType, boolean z) {
        BgShowType bgShowType;
        if (TEnum.equals(bLiveRankingMsgType, "progress")) {
            bgShowType = z ? BgShowType.SHOW : BgShowType.HIDE;
        } else {
            bgShowType = BgShowType.OTHER;
        }
        this.f6587n = bgShowType;
    }

    /* JADX INFO: renamed from: H */
    public void m8324H() {
        BgShowType bgShowType = this.f6587n;
        if (bgShowType == BgShowType.SHOW) {
            m8328L();
            m8338s();
        } else if (bgShowType == BgShowType.HIDE) {
            m8325I();
            m8327K();
        }
    }

    /* JADX INFO: renamed from: I */
    public void m8325I() {
        Animator animatorL = bt0.l(this.f6576c, View.ALPHA, 0L, 200L, new LinearInterpolator(), new float[]{1.0f, 0.0f});
        this.f6586m = animatorL;
        animatorL.start();
    }

    /* JADX INFO: renamed from: J */
    public void m8326J(boolean z) {
        xdl0.M(this, z);
    }

    /* JADX INFO: renamed from: K */
    public void m8327K() {
        m8322F(0.0f, m8332k((int) (NullChecker.a(this.f6583j) ? this.f6583j.rank : this.f6580g)));
    }

    /* JADX INFO: renamed from: L */
    public void m8328L() {
        if (!NullChecker.a(this.f6582i) || !TEnum.equals(this.f6582i.msgType, "progress")) {
            xdl0.M(this.f6576c, false);
            this.f6576c.m8397m();
            return;
        }
        xdl0.M(this.f6576c, true);
        this.f6576c.m8398n(0.0f, 0, 0);
        this.f6576c.m8399o();
        Animator animatorL = bt0.l(this.f6576c, View.ALPHA, 0L, 200L, new LinearInterpolator(), new float[]{0.0f, 1.0f});
        this.f6586m = animatorL;
        animatorL.start();
        BLiveHourLeaderBoardItem bLiveHourLeaderBoardItem = this.f6582i;
        int i = bLiveHourLeaderBoardItem.currentHourSuggestConfig.target;
        float f = i > 0 ? (bLiveHourLeaderBoardItem.amount * 1.0f) / i : 0.0f;
        this.f6576c.m8398n(f <= 1.0f ? f : 1.0f, 200, 100);
    }

    @Nullable
    public Act act() {
        return this.f6579f.act();
    }

    public void destroy() {
        m8326J(false);
        m8310E();
        this.f6576c.m8397m();
        xdl0.M(this.f6576c, false);
        this.f6578e.reset();
        this.f6584k = false;
    }

    /* JADX INFO: renamed from: i */
    public final void m8329i(View view) {
        ehl.m12546a(this, view);
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    public void init() {
        xdl0.E0(this, new View.OnClickListener() { // from class: l.dhl
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f9279a.m8317u(view);
            }
        });
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -1);
        layoutParams.gravity = 8388627;
        this.f6578e.setContentLayoutGravity(layoutParams);
        this.f6578e.D(w8u.t(R$string.f3425m6));
        this.f6578e.setMarqueeTime(1200);
        this.f6578e.setMarqueeDelayTime(500);
        this.f6576c.setColors(new int[]{Color.parseColor("#ff539c"), Color.parseColor("#ff539c")});
        mep0.d1(this.f6576c, t100.d(8.0f));
    }

    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public void m8330i1(pfl pflVar) {
        this.f6579f = pflVar;
    }

    /* JADX INFO: renamed from: k */
    public final float m8332k(long j) {
        return (j >= 11 || j <= 0) ? 0.0f : 1.0f;
    }

    /* JADX INFO: renamed from: l */
    public final Pair<String, String> m8333l(BLiveHourLeaderBoardItem bLiveHourLeaderBoardItem) {
        String strM8335n;
        long j = bLiveHourLeaderBoardItem.rank;
        BLiveRankingMsgType bLiveRankingMsgType = bLiveHourLeaderBoardItem.msgType;
        String strM8336p = m8336p(j);
        if (!mqi0.D(((Long) this.f6581h.get()).longValue()) && bLiveHourLeaderBoardItem.currentHourSuggestConfig.scrollTexts.size() > 0) {
            strM8335n = (String) bLiveHourLeaderBoardItem.currentHourSuggestConfig.scrollTexts.get(0);
            this.f6581h.put(Long.valueOf(mqi0.o()));
        } else if (TEnum.equals(bLiveRankingMsgType, "sprint")) {
            strM8335n = m8337q((int) bLiveHourLeaderBoardItem.gap, j);
        } else if (TEnum.equals(bLiveRankingMsgType, "start")) {
            strM8335n = ypv.e.getString(R$string.f3579t6, gar.m13673a(uvr.d().s0(), bLiveHourLeaderBoardItem.currentHourSuggestConfig.target));
        } else if (TEnum.equals(bLiveRankingMsgType, "progress")) {
            strM8335n = m8334m(bLiveHourLeaderBoardItem);
        } else {
            strM8335n = ((TEnum.equals(bLiveRankingMsgType, "normal") || TEnum.equals(bLiveRankingMsgType, "unknown_")) && this.f6580g > 0) ? m8335n(j) : "";
        }
        return Pair.create(strM8336p, strM8335n);
    }

    /* JADX INFO: renamed from: m */
    public final String m8334m(BLiveHourLeaderBoardItem bLiveHourLeaderBoardItem) {
        long j = bLiveHourLeaderBoardItem.amount;
        int i = bLiveHourLeaderBoardItem.currentHourSuggestConfig.target;
        return j >= ((long) i) ? w8u.t(R$string.f3513q6) : gar.m13676d((int) j, i);
    }

    /* JADX INFO: renamed from: n */
    public final String m8335n(long j) {
        if (j <= 10 || this.f6580g > 10) {
            return (j > 10 || this.f6580g <= 10) ? "" : ypv.e.getString(R$string.f3469o6);
        }
        return ypv.e.getString(R$string.f3491p6);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m8329i(this);
    }

    /* JADX INFO: renamed from: p */
    public final String m8336p(long j) {
        return (j <= 0 || j > 100) ? f6573o : String.format(ypv.e.getString(R$string.f3557s6), Long.valueOf(j));
    }

    /* JADX INFO: renamed from: q */
    public final String m8337q(int i, long j) {
        String strM13673a = gar.m13673a(uvr.d().s0(), i);
        if (j == 1) {
            return w8u.u(R$string.f3447n6, strM13673a);
        }
        if (j <= 10) {
            return ypv.e.getString(R$string.f3689y6, String.valueOf(1), strM13673a);
        }
        return j <= 20 ? ypv.e.getString(R$string.f3689y6, String.valueOf(10), strM13673a) : "";
    }

    /* JADX INFO: renamed from: s */
    public void m8338s() {
        m8322F(m8332k(this.f6580g), 0.0f);
    }

    public void setNewRank(BLiveHourLeaderBoardItem bLiveHourLeaderBoardItem) {
        this.f6583j = bLiveHourLeaderBoardItem;
        setRankTextWithAni(bLiveHourLeaderBoardItem);
    }

    /* JADX INFO: renamed from: v */
    public final /* synthetic */ void m8339v() {
        this.f6578e.t();
        BLiveHourLeaderBoardItem bLiveHourLeaderBoardItem = this.f6583j;
        m8318A(bLiveHourLeaderBoardItem.rank, m8333l(bLiveHourLeaderBoardItem));
        this.f6575b.setAlpha(m8332k(this.f6583j.rank));
        this.f6584k = false;
    }

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ void m8340w(BLiveHourLeaderBoardItem bLiveHourLeaderBoardItem) {
        this.f6578e.setPreAnim(400L);
        m8323G(bLiveHourLeaderBoardItem.msgType, false);
        this.f6578e.G((String) m8333l(this.f6583j).first, new Runnable() { // from class: l.chl
            @Override // java.lang.Runnable
            public final void run() {
                this.f8680a.m8339v();
            }
        });
    }

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ void m8341x(Runnable runnable) {
        if (this.f6579f == null) {
            return;
        }
        xdl0.k0(this.f6578e.getCurrentView());
        this.f6579f.m14207z3(2000L, runnable);
    }

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ void m8342y(Pair pair, final Runnable runnable) {
        this.f6578e.setNextAnim(400L);
        this.f6578e.setGap(5);
        m8323G(this.f6582i.msgType, true);
        this.f6578e.G((String) pair.second, new Runnable() { // from class: l.bhl
            @Override // java.lang.Runnable
            public final void run() {
                this.f8144a.m8341x(runnable);
            }
        });
    }

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ void m8343z(long j) {
        if (NullChecker.a(this.f6583j)) {
            BLiveHourLeaderBoardItem bLiveHourLeaderBoardItem = this.f6583j;
            long j2 = bLiveHourLeaderBoardItem.rank;
            if (j2 != j) {
                m8318A(j2, m8333l(bLiveHourLeaderBoardItem));
            }
        }
        this.f6575b.setAlpha(m8332k(this.f6583j.rank));
        gar.m13678f(this.f6578e.getCurrentView());
        this.f6584k = false;
    }

    public HourBoardNewEntryView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f6580g = -1L;
        this.f6581h = new zpd0("show_hint_time_" + ypv.a.D0(), 0L);
    }

    public HourBoardNewEntryView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f6580g = -1L;
        this.f6581h = new zpd0("show_hint_time_" + ypv.a.D0(), 0L);
    }
}
