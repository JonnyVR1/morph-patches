package com.p051p1.mobile.putong.live.livingroom.increment.leaderboard.hourleaderboard.intl;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Color;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.p051p1.mobile.putong.live.base.data.BLiveHourLeaderBoard;
import com.p051p1.mobile.putong.live.base.data.BLiveHourLeaderBoardItem;
import com.p051p1.mobile.putong.live.base.view.LiveTagView;
import com.p051p1.mobile.putong.live.livingroom.R$string;
import com.p051p1.mobile.putong.live.livingroom.increment.leaderboard.hourleaderboard.intl.HourBoardListItem;
import com.p051p1.mobile.putong.live.livingroom.view.rollview.LiveTextRollView;
import com.tantanapp.common.utils.NullChecker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p151v.VDraweeView;
import p151v.VText;
import p153l.bjl;
import p153l.bnl0;
import p153l.civ;
import p153l.dhw;
import p153l.htd0;
import p153l.icr;
import p153l.izs;
import p153l.l51;
import p153l.obc0;
import p153l.qa00;
import p153l.uhl;
import p153l.vxr;
import p153l.xau;
import p153l.y20;
import p153l.zrv;

/* JADX INFO: loaded from: classes4.dex */
public class HourBoardListItem extends ConstraintLayout {

    /* JADX INFO: renamed from: d */
    public VText f51403d;

    /* JADX INFO: renamed from: e */
    public VDraweeView f51404e;

    /* JADX INFO: renamed from: f */
    public LiveTagView f51405f;

    /* JADX INFO: renamed from: g */
    public VText f51406g;

    /* JADX INFO: renamed from: h */
    public FrameLayout f51407h;

    /* JADX INFO: renamed from: i */
    public HourBoardProgressView f51408i;

    /* JADX INFO: renamed from: j */
    public LiveTextRollView f51409j;

    /* JADX INFO: renamed from: k */
    public VText f51410k;

    /* JADX INFO: renamed from: l */
    public final int f51411l;

    /* JADX INFO: renamed from: m */
    public Runnable f51412m;

    /* JADX INFO: renamed from: n */
    public Runnable f51413n;

    /* JADX INFO: renamed from: o */
    public String f51414o;

    public HourBoardListItem(Context context) {
        super(context);
        this.f51411l = 2000;
        this.f51414o = "";
    }

    /* JADX INFO: renamed from: h0 */
    public static /* synthetic */ void m75942h0(uhl uhlVar, BLiveHourLeaderBoardItem bLiveHourLeaderBoardItem, View view) {
        if (uhlVar != null) {
            uhlVar.mo76107F(bLiveHourLeaderBoardItem);
        }
    }

    /* JADX INFO: renamed from: j0 */
    public static /* synthetic */ void m75944j0() {
    }

    @NotNull
    /* JADX INFO: renamed from: o0 */
    private String m75948o0(BLiveHourLeaderBoardItem bLiveHourLeaderBoardItem) {
        long j = bLiveHourLeaderBoardItem.rank;
        if (j <= 0) {
            return "--";
        }
        return j > 100 ? "100+" : String.valueOf(j);
    }

    /* JADX INFO: renamed from: p0 */
    private void m75949p0(String str, String str2) {
        this.f51409j.m77894C(str, true);
        this.f51409j.m77887v(getWidth(), true);
        this.f51409j.m77894C(str2, false);
        this.f51409j.m77887v(getWidth(), false);
    }

    @SuppressLint({"RtlHardcoded"})
    /* JADX INFO: renamed from: v0 */
    private void m75950v0(BLiveHourLeaderBoardItem bLiveHourLeaderBoardItem, @Nullable BLiveHourLeaderBoard bLiveHourLeaderBoard) {
        if (!NullChecker.m82486a(bLiveHourLeaderBoard) || !bLiveHourLeaderBoard.currentHourSuggestConfig.enable) {
            this.f51409j.reset();
            bnl0.m105524M(this.f51407h, false);
            return;
        }
        bnl0.m105524M(this.f51407h, true);
        this.f51408i.setColors(new int[]{Color.parseColor("#ff539c"), Color.parseColor("#ff539c")});
        int i = bLiveHourLeaderBoard.currentHourSuggestConfig.target;
        float f = i > 0 ? (bLiveHourLeaderBoardItem.amount * 1.0f) / i : 0.0f;
        this.f51408i.m75969k(f <= 1.0f ? f : 1.0f, 0, 0);
        bnl0.m105525M0(this.f51408i, bLiveHourLeaderBoardItem.amount > 0);
        m75951w0(f, bLiveHourLeaderBoardItem, bLiveHourLeaderBoard);
    }

    /* JADX INFO: renamed from: w0 */
    private void m75951w0(float f, BLiveHourLeaderBoardItem bLiveHourLeaderBoardItem, BLiveHourLeaderBoard bLiveHourLeaderBoard) {
        final String strM209912v;
        if (f >= 1.0f) {
            strM209912v = xau.m209910t(R$string.f48407u6);
        } else {
            this.f51414o = xau.m209911u(R$string.f48385t6, icr.m139458a(vxr.m203876d().m171022s0(), bLiveHourLeaderBoard.currentHourSuggestConfig.target));
            int i = vxr.m203876d().m171022s0() ? R$string.f48473x6 : R$string.f48429v6;
            if (((civ) zrv.m221194l(htd0.f111524f)).m109970n()) {
                i = R$string.f48451w6;
            }
            strM209912v = xau.m209912v(i, icr.m139459b((int) bLiveHourLeaderBoardItem.amount), icr.m139459b(bLiveHourLeaderBoard.currentHourSuggestConfig.target));
            this.f51413n = new Runnable() { // from class: l.wil
                @Override // java.lang.Runnable
                public final void run() {
                    this.f189371a.m75954r0();
                }
            };
            this.f51412m = new Runnable() { // from class: l.xil
                @Override // java.lang.Runnable
                public final void run() {
                    this.f194467a.m75955s0(strM209912v);
                }
            };
            l51.m152888H(getContext(), this.f51413n, 2000L);
        }
        if (this.f51409j.getWidth() > 0) {
            m75949p0(strM209912v, this.f51414o);
        } else {
            bnl0.m105520K(this.f51409j).first().subscribe(dhw.m115825d(new y20() { // from class: l.yil
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f200094a.m75956t0(strM209912v, (Integer) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: n0 */
    public final void m75952n0(View view) {
        bjl.m104629a(this, view);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m75952n0(this);
    }

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ void m75953q0() {
        l51.m152888H(getContext(), this.f51412m, 2000L);
    }

    /* JADX INFO: renamed from: r0 */
    public final /* synthetic */ void m75954r0() {
        this.f51409j.setGap(10);
        this.f51409j.setNextAnim(400L);
        this.f51409j.m77898G(this.f51414o, new Runnable() { // from class: l.zil
            @Override // java.lang.Runnable
            public final void run() {
                this.f204596a.m75953q0();
            }
        });
    }

    /* JADX INFO: renamed from: s0 */
    public final /* synthetic */ void m75955s0(String str) {
        this.f51409j.setPreAnim(400L);
        this.f51409j.m77898G(str, new Runnable() { // from class: l.ajl
            @Override // java.lang.Runnable
            public final void run() {
                HourBoardListItem.m75944j0();
            }
        });
    }

    /* JADX INFO: renamed from: t0 */
    public final /* synthetic */ void m75956t0(String str, Integer num) {
        m75949p0(str, this.f51414o);
    }

    /* JADX INFO: renamed from: u0 */
    public void m75957u0(final BLiveHourLeaderBoardItem bLiveHourLeaderBoardItem, @Nullable final uhl uhlVar, @Nullable BLiveHourLeaderBoard bLiveHourLeaderBoard) {
        this.f51406g.setText(bLiveHourLeaderBoardItem.userName);
        this.f51403d.setText(m75948o0(bLiveHourLeaderBoardItem));
        bnl0.m105524M(this.f51410k, vxr.m203876d().m171026u0());
        boolean zM209897B = xau.m209897B();
        VText vText = this.f51410k;
        if (zM209897B) {
            vText.setText(icr.m139460c(vxr.m203876d().m171022s0(), bLiveHourLeaderBoardItem.amount));
        } else {
            vText.setText(icr.m139460c(vxr.m203876d().m171022s0(), bLiveHourLeaderBoardItem.amount));
            int i = vxr.m203876d().m171022s0() ? obc0.f146113M3 : obc0.f146421n;
            if (((civ) zrv.m221194l(htd0.f111524f)).m109970n()) {
                i = obc0.f146389k3;
            }
            bnl0.m105563k(this.f51410k, getResources().getDrawable(i));
            this.f51410k.setCompoundDrawablePadding(qa00.f156316c);
        }
        izs.m142869t("context_single_room", this.f51404e, bLiveHourLeaderBoardItem.userImage, qa00.f156337x);
        this.f51405f.m69961c(Color.parseColor("#ff852a"), Color.parseColor("#ff3a00"));
        bnl0.m105524M(this.f51405f, TEnum.equals(bLiveHourLeaderBoardItem.liveState, "onlive"));
        bnl0.m105509E0(this, new View.OnClickListener() { // from class: l.vil
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                HourBoardListItem.m75942h0(uhlVar, bLiveHourLeaderBoardItem, view);
            }
        });
        bnl0.m105524M(this.f51407h, bLiveHourLeaderBoardItem.isOwn);
        if (bLiveHourLeaderBoardItem.isOwn) {
            m75950v0(bLiveHourLeaderBoardItem, bLiveHourLeaderBoard);
        }
    }

    /* JADX INFO: renamed from: y0 */
    public void m75958y0() {
        l51.m152890J(this.f51413n);
        l51.m152890J(this.f51412m);
        this.f51408i.m75969k(0.0f, 0, 0);
        this.f51409j.mo77885t();
    }

    public HourBoardListItem(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f51411l = 2000;
        this.f51414o = "";
    }

    public HourBoardListItem(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f51411l = 2000;
        this.f51414o = "";
    }
}
