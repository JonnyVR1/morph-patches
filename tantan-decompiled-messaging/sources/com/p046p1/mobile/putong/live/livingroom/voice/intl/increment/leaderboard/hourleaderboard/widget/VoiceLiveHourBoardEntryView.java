package com.p046p1.mobile.putong.live.livingroom.voice.intl.increment.leaderboard.hourleaderboard.widget;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import androidx.annotation.Nullable;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.p046p1.mobile.putong.live.base.data.BLiveVoiceLeaderBoardItem;
import com.p046p1.mobile.putong.live.base.data.BLiveVoiceRankingMsgType;
import com.p046p1.mobile.putong.live.base.data.BLiveVoiceRankingType;
import com.p046p1.mobile.putong.live.livingroom.R$string;
import com.p046p1.mobile.putong.live.livingroom.view.rollview.LiveTextRollView;
import com.tantanapp.common.utils.NullChecker;
import p147v.VImage;
import p149l.cqn0;
import p149l.gar;
import p149l.i3c0;
import p149l.jqn0;
import p149l.pjn0;
import p149l.s7m;
import p149l.w8u;
import p149l.xdl0;
import p149l.ypv;

/* JADX INFO: loaded from: classes5.dex */
public class VoiceLiveHourBoardEntryView extends RelativeLayout implements s7m<cqn0> {

    /* JADX INFO: renamed from: a */
    public VoiceLiveHourBoardEntryView f53228a;

    /* JADX INFO: renamed from: b */
    public View f53229b;

    /* JADX INFO: renamed from: c */
    public VImage f53230c;

    /* JADX INFO: renamed from: d */
    public LiveTextRollView f53231d;

    /* JADX INFO: renamed from: e */
    public cqn0 f53232e;

    /* JADX INFO: renamed from: f */
    public BLiveVoiceLeaderBoardItem f53233f;

    /* JADX INFO: renamed from: g */
    public boolean f53234g;

    /* JADX INFO: renamed from: h */
    public long f53235h;

    public VoiceLiveHourBoardEntryView(Context context) {
        super(context);
        this.f53235h = -1L;
    }

    /* JADX INFO: renamed from: A */
    private void m78213A() {
        this.f53229b.setAlpha(0.0f);
        this.f53235h = -1L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n */
    public /* synthetic */ void m78220n(View view) {
        this.f53232e.m108287L3();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q */
    public /* synthetic */ void m78221q() {
        this.f53231d.setPreAnim(400L);
        this.f53231d.m76715G((String) m78227l(this.f53233f).first, new Runnable() { // from class: l.iqn0
            @Override // java.lang.Runnable
            public final void run() {
                this.f114532a.m78229p();
            }
        });
    }

    private void setRankTextWithAni(BLiveVoiceLeaderBoardItem bLiveVoiceLeaderBoardItem) {
        long j = bLiveVoiceLeaderBoardItem.rank;
        Pair<String, String> pairM78227l = m78227l(bLiveVoiceLeaderBoardItem);
        if (!this.f53234g) {
            this.f53234g = true;
            if (TextUtils.isEmpty((CharSequence) pairM78227l.second)) {
                long j2 = this.f53235h;
                if (j2 == j || j2 == -1 || (j2 >= 100 && j >= 100)) {
                    m78222w(j, pairM78227l);
                    m78234y(bLiveVoiceLeaderBoardItem.rank);
                    this.f53231d.m76701s();
                    this.f53234g = false;
                } else {
                    m78235z(j, pairM78227l);
                }
            } else {
                m78233x(pairM78227l);
            }
        }
        this.f53235h = j;
    }

    /* JADX INFO: renamed from: w */
    private void m78222w(long j, Pair<String, String> pair) {
        if (j != this.f53235h) {
            this.f53231d.m76712D((String) pair.first);
        }
    }

    /* JADX INFO: renamed from: B */
    public void m78223B(boolean z) {
        xdl0.m208344M(this, z);
    }

    @Override // p149l.s7m
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return getContext();
    }

    @Override // p149l.s7m
    @Nullable
    public Act act() {
        return this.f53232e.act();
    }

    @Override // p149l.s7m
    public void destroy() {
        m78223B(false);
        m78213A();
        this.f53231d.reset();
        this.f53234g = false;
    }

    /* JADX INFO: renamed from: i */
    public final void m78224i(View view) {
        jqn0.m142828a(this, view);
    }

    @Override // p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    public void init() {
        xdl0.m208329E0(this, new View.OnClickListener() { // from class: l.gqn0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f103965a.m78220n(view);
            }
        });
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -1);
        layoutParams.gravity = 8388627;
        this.f53231d.setContentLayoutGravity(layoutParams);
        this.f53231d.m76712D(w8u.m202217t(R$string.f47383m6));
        this.f53231d.setMarqueeTime(1200);
        this.f53231d.setMarqueeDelayTime(500);
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(cqn0 cqn0Var) {
        this.f53232e = cqn0Var;
    }

    /* JADX INFO: renamed from: k */
    public final String m78226k(long j) {
        if (j <= 0 || j > 99) {
            return ypv.f199497e.getString(R$string.f47660yj) + "99+";
        }
        return ypv.f199497e.getString(R$string.f47660yj) + j;
    }

    /* JADX INFO: renamed from: l */
    public final Pair<String, String> m78227l(BLiveVoiceLeaderBoardItem bLiveVoiceLeaderBoardItem) {
        String strM78228m;
        long j = bLiveVoiceLeaderBoardItem.rank;
        BLiveVoiceRankingMsgType bLiveVoiceRankingMsgType = bLiveVoiceLeaderBoardItem.msgType;
        BLiveVoiceRankingType bLiveVoiceRankingType = bLiveVoiceLeaderBoardItem.type;
        String string = "";
        if (TEnum.equals(bLiveVoiceRankingType, BLiveVoiceRankingType.lastHour)) {
            string = ypv.f199497e.getString(R$string.f46620Cj);
            strM78228m = "";
        } else if (TEnum.equals(bLiveVoiceRankingType, BLiveVoiceRankingType.currentHour)) {
            String strM78226k = m78226k(j);
            strM78228m = TEnum.equals(bLiveVoiceRankingMsgType, "sprint") ? m78228m(bLiveVoiceLeaderBoardItem.gap, j) : "";
            string = strM78226k;
        } else {
            strM78228m = "";
        }
        return Pair.create(string, strM78228m);
    }

    /* JADX INFO: renamed from: m */
    public final String m78228m(long j, long j2) {
        String strM169913b = pjn0.m169913b(j);
        if (j2 == 1) {
            return ypv.f199497e.getString(R$string.f47526sh, strM169913b);
        }
        if (j2 <= 10) {
            return ypv.f199497e.getString(R$string.f47570uh, String.valueOf(1), strM169913b);
        }
        return j2 <= 20 ? ypv.f199497e.getString(R$string.f47548th, String.valueOf(10), strM169913b) : "";
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m78224i(this);
    }

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ void m78229p() {
        this.f53231d.mo76702t();
        BLiveVoiceLeaderBoardItem bLiveVoiceLeaderBoardItem = this.f53233f;
        m78222w(bLiveVoiceLeaderBoardItem.rank, m78227l(bLiveVoiceLeaderBoardItem));
        m78234y(this.f53233f.rank);
        this.f53234g = false;
    }

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ void m78230s(Runnable runnable) {
        if (this.f53232e == null) {
            return;
        }
        xdl0.m208384k0(this.f53231d.getCurrentView());
        this.f53232e.m129320z3(2000L, runnable);
    }

    public void setNewRank(BLiveVoiceLeaderBoardItem bLiveVoiceLeaderBoardItem) {
        this.f53233f = bLiveVoiceLeaderBoardItem;
        setRankTextWithAni(bLiveVoiceLeaderBoardItem);
    }

    /* JADX INFO: renamed from: u */
    public final /* synthetic */ void m78231u(Pair pair, final Runnable runnable) {
        this.f53231d.setNextAnim(400L);
        this.f53231d.setGap(5);
        this.f53231d.m76715G((String) pair.second, new Runnable() { // from class: l.hqn0
            @Override // java.lang.Runnable
            public final void run() {
                this.f109071a.m78230s(runnable);
            }
        });
    }

    /* JADX INFO: renamed from: v */
    public final /* synthetic */ void m78232v(long j) {
        if (NullChecker.m81303a(this.f53233f)) {
            BLiveVoiceLeaderBoardItem bLiveVoiceLeaderBoardItem = this.f53233f;
            long j2 = bLiveVoiceLeaderBoardItem.rank;
            if (j2 != j) {
                m78222w(j2, m78227l(bLiveVoiceLeaderBoardItem));
            }
        }
        m78234y(this.f53233f.rank);
        gar.m125012f(this.f53231d.getCurrentView());
        this.f53234g = false;
    }

    /* JADX INFO: renamed from: x */
    public final void m78233x(final Pair<String, String> pair) {
        final Runnable runnable = new Runnable() { // from class: l.dqn0
            @Override // java.lang.Runnable
            public final void run() {
                this.f87460a.m78221q();
            }
        };
        this.f53232e.m129320z3(500L, new Runnable() { // from class: l.eqn0
            @Override // java.lang.Runnable
            public final void run() {
                this.f92815a.m78231u(pair, runnable);
            }
        });
    }

    /* JADX INFO: renamed from: y */
    public final void m78234y(long j) {
        if (j >= 21 || j <= 0) {
            this.f53229b.setBackgroundResource(i3c0.f110816P);
        } else {
            this.f53229b.setBackgroundResource(i3c0.f110674D0);
        }
    }

    /* JADX INFO: renamed from: z */
    public final void m78235z(final long j, Pair<String, String> pair) {
        long j2 = this.f53235h;
        LiveTextRollView liveTextRollView = this.f53231d;
        if (j > j2) {
            liveTextRollView.setNextAnim(400L);
        } else {
            liveTextRollView.setPreAnim(400L);
        }
        this.f53231d.setRollAction(null);
        this.f53231d.m76715G((String) pair.first, new Runnable() { // from class: l.fqn0
            @Override // java.lang.Runnable
            public final void run() {
                this.f98826a.m78232v(j);
            }
        });
    }

    public VoiceLiveHourBoardEntryView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f53235h = -1L;
    }

    public VoiceLiveHourBoardEntryView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f53235h = -1L;
    }

    public VoiceLiveHourBoardEntryView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.f53235h = -1L;
    }
}
