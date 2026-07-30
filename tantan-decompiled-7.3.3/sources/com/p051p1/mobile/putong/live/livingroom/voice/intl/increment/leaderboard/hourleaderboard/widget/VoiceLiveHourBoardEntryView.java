package com.p051p1.mobile.putong.live.livingroom.voice.intl.increment.leaderboard.hourleaderboard.widget;

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
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceLeaderBoardItem;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceRankingMsgType;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceRankingType;
import com.p051p1.mobile.putong.live.livingroom.R$string;
import com.p051p1.mobile.putong.live.livingroom.view.rollview.LiveTextRollView;
import com.tantanapp.common.utils.NullChecker;
import p151v.VImage;
import p153l.bnl0;
import p153l.gzn0;
import p153l.iam;
import p153l.icr;
import p153l.nzn0;
import p153l.obc0;
import p153l.tsn0;
import p153l.xau;
import p153l.zrv;

/* JADX INFO: loaded from: classes5.dex */
public class VoiceLiveHourBoardEntryView extends RelativeLayout implements iam<gzn0> {

    /* JADX INFO: renamed from: a */
    public VoiceLiveHourBoardEntryView f54076a;

    /* JADX INFO: renamed from: b */
    public View f54077b;

    /* JADX INFO: renamed from: c */
    public VImage f54078c;

    /* JADX INFO: renamed from: d */
    public LiveTextRollView f54079d;

    /* JADX INFO: renamed from: e */
    public gzn0 f54080e;

    /* JADX INFO: renamed from: f */
    public BLiveVoiceLeaderBoardItem f54081f;

    /* JADX INFO: renamed from: g */
    public boolean f54082g;

    /* JADX INFO: renamed from: h */
    public long f54083h;

    public VoiceLiveHourBoardEntryView(Context context) {
        super(context);
        this.f54083h = -1L;
    }

    /* JADX INFO: renamed from: A */
    private void m79396A() {
        this.f54077b.setAlpha(0.0f);
        this.f54083h = -1L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n */
    public /* synthetic */ void m79403n(View view) {
        this.f54080e.m133107L3();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q */
    public /* synthetic */ void m79404q() {
        this.f54079d.setPreAnim(400L);
        this.f54079d.m77898G((String) m79410l(this.f54081f).first, new Runnable() { // from class: l.mzn0
            @Override // java.lang.Runnable
            public final void run() {
                this.f139537a.m79412p();
            }
        });
    }

    private void setRankTextWithAni(BLiveVoiceLeaderBoardItem bLiveVoiceLeaderBoardItem) {
        long j = bLiveVoiceLeaderBoardItem.rank;
        Pair<String, String> pairM79410l = m79410l(bLiveVoiceLeaderBoardItem);
        if (!this.f54082g) {
            this.f54082g = true;
            if (TextUtils.isEmpty((CharSequence) pairM79410l.second)) {
                long j2 = this.f54083h;
                if (j2 == j || j2 == -1 || (j2 >= 100 && j >= 100)) {
                    m79405w(j, pairM79410l);
                    m79417y(bLiveVoiceLeaderBoardItem.rank);
                    this.f54079d.m77884s();
                    this.f54082g = false;
                } else {
                    m79418z(j, pairM79410l);
                }
            } else {
                m79416x(pairM79410l);
            }
        }
        this.f54083h = j;
    }

    /* JADX INFO: renamed from: w */
    private void m79405w(long j, Pair<String, String> pair) {
        if (j != this.f54083h) {
            this.f54079d.m77895D((String) pair.first);
        }
    }

    /* JADX INFO: renamed from: B */
    public void m79406B(boolean z) {
        bnl0.m105524M(this, z);
    }

    @Override // p153l.iam
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return getContext();
    }

    @Override // p153l.iam
    @Nullable
    public Act act() {
        return this.f54080e.act();
    }

    @Override // p153l.iam
    public void destroy() {
        m79406B(false);
        m79396A();
        this.f54079d.reset();
        this.f54082g = false;
    }

    /* JADX INFO: renamed from: i */
    public final void m79407i(View view) {
        nzn0.m165390a(this, view);
    }

    @Override // p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    public void init() {
        bnl0.m105509E0(this, new View.OnClickListener() { // from class: l.kzn0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f129438a.m79403n(view);
            }
        });
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -1);
        layoutParams.gravity = 8388627;
        this.f54079d.setContentLayoutGravity(layoutParams);
        this.f54079d.m77895D(xau.m209910t(R$string.f48231m6));
        this.f54079d.setMarqueeTime(1200);
        this.f54079d.setMarqueeDelayTime(500);
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(gzn0 gzn0Var) {
        this.f54080e = gzn0Var;
    }

    /* JADX INFO: renamed from: k */
    public final String m79409k(long j) {
        if (j <= 0 || j > 99) {
            return zrv.f205803e.getString(R$string.f48508yj) + "99+";
        }
        return zrv.f205803e.getString(R$string.f48508yj) + j;
    }

    /* JADX INFO: renamed from: l */
    public final Pair<String, String> m79410l(BLiveVoiceLeaderBoardItem bLiveVoiceLeaderBoardItem) {
        String strM79411m;
        long j = bLiveVoiceLeaderBoardItem.rank;
        BLiveVoiceRankingMsgType bLiveVoiceRankingMsgType = bLiveVoiceLeaderBoardItem.msgType;
        BLiveVoiceRankingType bLiveVoiceRankingType = bLiveVoiceLeaderBoardItem.type;
        String string = "";
        if (TEnum.equals(bLiveVoiceRankingType, BLiveVoiceRankingType.lastHour)) {
            string = zrv.f205803e.getString(R$string.f47468Cj);
            strM79411m = "";
        } else if (TEnum.equals(bLiveVoiceRankingType, BLiveVoiceRankingType.currentHour)) {
            String strM79409k = m79409k(j);
            strM79411m = TEnum.equals(bLiveVoiceRankingMsgType, "sprint") ? m79411m(bLiveVoiceLeaderBoardItem.gap, j) : "";
            string = strM79409k;
        } else {
            strM79411m = "";
        }
        return Pair.create(string, strM79411m);
    }

    /* JADX INFO: renamed from: m */
    public final String m79411m(long j, long j2) {
        String strM192619b = tsn0.m192619b(j);
        if (j2 == 1) {
            return zrv.f205803e.getString(R$string.f48374sh, strM192619b);
        }
        if (j2 <= 10) {
            return zrv.f205803e.getString(R$string.f48418uh, String.valueOf(1), strM192619b);
        }
        return j2 <= 20 ? zrv.f205803e.getString(R$string.f48396th, String.valueOf(10), strM192619b) : "";
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m79407i(this);
    }

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ void m79412p() {
        this.f54079d.mo77885t();
        BLiveVoiceLeaderBoardItem bLiveVoiceLeaderBoardItem = this.f54081f;
        m79405w(bLiveVoiceLeaderBoardItem.rank, m79410l(bLiveVoiceLeaderBoardItem));
        m79417y(this.f54081f.rank);
        this.f54082g = false;
    }

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ void m79413s(Runnable runnable) {
        if (this.f54080e == null) {
            return;
        }
        bnl0.m105564k0(this.f54079d.getCurrentView());
        this.f54080e.m138879z3(2000L, runnable);
    }

    public void setNewRank(BLiveVoiceLeaderBoardItem bLiveVoiceLeaderBoardItem) {
        this.f54081f = bLiveVoiceLeaderBoardItem;
        setRankTextWithAni(bLiveVoiceLeaderBoardItem);
    }

    /* JADX INFO: renamed from: u */
    public final /* synthetic */ void m79414u(Pair pair, final Runnable runnable) {
        this.f54079d.setNextAnim(400L);
        this.f54079d.setGap(5);
        this.f54079d.m77898G((String) pair.second, new Runnable() { // from class: l.lzn0
            @Override // java.lang.Runnable
            public final void run() {
                this.f134238a.m79413s(runnable);
            }
        });
    }

    /* JADX INFO: renamed from: v */
    public final /* synthetic */ void m79415v(long j) {
        if (NullChecker.m82486a(this.f54081f)) {
            BLiveVoiceLeaderBoardItem bLiveVoiceLeaderBoardItem = this.f54081f;
            long j2 = bLiveVoiceLeaderBoardItem.rank;
            if (j2 != j) {
                m79405w(j2, m79410l(bLiveVoiceLeaderBoardItem));
            }
        }
        m79417y(this.f54081f.rank);
        icr.m139463f(this.f54079d.getCurrentView());
        this.f54082g = false;
    }

    /* JADX INFO: renamed from: x */
    public final void m79416x(final Pair<String, String> pair) {
        final Runnable runnable = new Runnable() { // from class: l.hzn0
            @Override // java.lang.Runnable
            public final void run() {
                this.f112274a.m79404q();
            }
        };
        this.f54080e.m138879z3(500L, new Runnable() { // from class: l.izn0
            @Override // java.lang.Runnable
            public final void run() {
                this.f117722a.m79414u(pair, runnable);
            }
        });
    }

    /* JADX INFO: renamed from: y */
    public final void m79417y(long j) {
        if (j >= 21 || j <= 0) {
            this.f54077b.setBackgroundResource(obc0.f146144P);
        } else {
            this.f54077b.setBackgroundResource(obc0.f146002D0);
        }
    }

    /* JADX INFO: renamed from: z */
    public final void m79418z(final long j, Pair<String, String> pair) {
        long j2 = this.f54083h;
        LiveTextRollView liveTextRollView = this.f54079d;
        if (j > j2) {
            liveTextRollView.setNextAnim(400L);
        } else {
            liveTextRollView.setPreAnim(400L);
        }
        this.f54079d.setRollAction(null);
        this.f54079d.m77898G((String) pair.first, new Runnable() { // from class: l.jzn0
            @Override // java.lang.Runnable
            public final void run() {
                this.f123278a.m79415v(j);
            }
        });
    }

    public VoiceLiveHourBoardEntryView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f54083h = -1L;
    }

    public VoiceLiveHourBoardEntryView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f54083h = -1L;
    }

    public VoiceLiveHourBoardEntryView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.f54083h = -1L;
    }
}
