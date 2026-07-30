package com.p046p1.mobile.putong.live.livingroom.increment.leaderboard.hourleaderboard.intl;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Color;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.p046p1.mobile.putong.live.base.data.BLiveHourLeaderBoard;
import com.p046p1.mobile.putong.live.base.data.BLiveHourLeaderBoardItem;
import com.p046p1.mobile.putong.live.base.view.LiveTagView;
import com.p046p1.mobile.putong.live.livingroom.R$string;
import com.p046p1.mobile.putong.live.livingroom.increment.leaderboard.hourleaderboard.intl.HourBoardListItem;
import com.p046p1.mobile.putong.live.livingroom.view.rollview.LiveTextRollView;
import com.tantanapp.common.utils.NullChecker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p147v.VDraweeView;
import p147v.VText;
import p149l.bgv;
import p149l.dfl;
import p149l.e30;
import p149l.e51;
import p149l.ffw;
import p149l.fld0;
import p149l.gar;
import p149l.hxs;
import p149l.i3c0;
import p149l.kgl;
import p149l.t100;
import p149l.uvr;
import p149l.w8u;
import p149l.xdl0;
import p149l.ypv;

/* JADX INFO: loaded from: classes4.dex */
public class HourBoardListItem extends ConstraintLayout {

    /* JADX INFO: renamed from: d */
    public VText f50555d;

    /* JADX INFO: renamed from: e */
    public VDraweeView f50556e;

    /* JADX INFO: renamed from: f */
    public LiveTagView f50557f;

    /* JADX INFO: renamed from: g */
    public VText f50558g;

    /* JADX INFO: renamed from: h */
    public FrameLayout f50559h;

    /* JADX INFO: renamed from: i */
    public HourBoardProgressView f50560i;

    /* JADX INFO: renamed from: j */
    public LiveTextRollView f50561j;

    /* JADX INFO: renamed from: k */
    public VText f50562k;

    /* JADX INFO: renamed from: l */
    public final int f50563l;

    /* JADX INFO: renamed from: m */
    public Runnable f50564m;

    /* JADX INFO: renamed from: n */
    public Runnable f50565n;

    /* JADX INFO: renamed from: o */
    public String f50566o;

    public HourBoardListItem(Context context) {
        super(context);
        this.f50563l = 2000;
        this.f50566o = "";
    }

    /* JADX INFO: renamed from: h0 */
    public static /* synthetic */ void m74759h0(dfl dflVar, BLiveHourLeaderBoardItem bLiveHourLeaderBoardItem, View view) {
        if (dflVar != null) {
            dflVar.mo74924F(bLiveHourLeaderBoardItem);
        }
    }

    /* JADX INFO: renamed from: j0 */
    public static /* synthetic */ void m74761j0() {
    }

    @NotNull
    /* JADX INFO: renamed from: o0 */
    private String m74765o0(BLiveHourLeaderBoardItem bLiveHourLeaderBoardItem) {
        long j = bLiveHourLeaderBoardItem.rank;
        if (j <= 0) {
            return "--";
        }
        return j > 100 ? "100+" : String.valueOf(j);
    }

    /* JADX INFO: renamed from: p0 */
    private void m74766p0(String str, String str2) {
        this.f50561j.m76711C(str, true);
        this.f50561j.m76704v(getWidth(), true);
        this.f50561j.m76711C(str2, false);
        this.f50561j.m76704v(getWidth(), false);
    }

    @SuppressLint({"RtlHardcoded"})
    /* JADX INFO: renamed from: v0 */
    private void m74767v0(BLiveHourLeaderBoardItem bLiveHourLeaderBoardItem, @Nullable BLiveHourLeaderBoard bLiveHourLeaderBoard) {
        if (!NullChecker.m81303a(bLiveHourLeaderBoard) || !bLiveHourLeaderBoard.currentHourSuggestConfig.enable) {
            this.f50561j.reset();
            xdl0.m208344M(this.f50559h, false);
            return;
        }
        xdl0.m208344M(this.f50559h, true);
        this.f50560i.setColors(new int[]{Color.parseColor("#ff539c"), Color.parseColor("#ff539c")});
        int i = bLiveHourLeaderBoard.currentHourSuggestConfig.target;
        float f = i > 0 ? (bLiveHourLeaderBoardItem.amount * 1.0f) / i : 0.0f;
        this.f50560i.m74786k(f <= 1.0f ? f : 1.0f, 0, 0);
        xdl0.m208345M0(this.f50560i, bLiveHourLeaderBoardItem.amount > 0);
        m74768w0(f, bLiveHourLeaderBoardItem, bLiveHourLeaderBoard);
    }

    /* JADX INFO: renamed from: w0 */
    private void m74768w0(float f, BLiveHourLeaderBoardItem bLiveHourLeaderBoardItem, BLiveHourLeaderBoard bLiveHourLeaderBoard) {
        final String strM202219v;
        if (f >= 1.0f) {
            strM202219v = w8u.m202217t(R$string.f47559u6);
        } else {
            this.f50566o = w8u.m202218u(R$string.f47537t6, gar.m125007a(uvr.m196087d().m162715s0(), bLiveHourLeaderBoard.currentHourSuggestConfig.target));
            int i = uvr.m196087d().m162715s0() ? R$string.f47625x6 : R$string.f47581v6;
            if (((bgv) ypv.m215673l(fld0.f98151f)).m101734n()) {
                i = R$string.f47603w6;
            }
            strM202219v = w8u.m202219v(i, gar.m125008b((int) bLiveHourLeaderBoardItem.amount), gar.m125008b(bLiveHourLeaderBoard.currentHourSuggestConfig.target));
            this.f50565n = new Runnable() { // from class: l.fgl
                @Override // java.lang.Runnable
                public final void run() {
                    this.f97383a.m74771r0();
                }
            };
            this.f50564m = new Runnable() { // from class: l.ggl
                @Override // java.lang.Runnable
                public final void run() {
                    this.f102518a.m74772s0(strM202219v);
                }
            };
            e51.m114743H(getContext(), this.f50565n, 2000L);
        }
        if (this.f50561j.getWidth() > 0) {
            m74766p0(strM202219v, this.f50566o);
        } else {
            xdl0.m208340K(this.f50561j).first().subscribe(ffw.m121193d(new e30() { // from class: l.hgl
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f107606a.m74773t0(strM202219v, (Integer) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: n0 */
    public final void m74769n0(View view) {
        kgl.m145893a(this, view);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m74769n0(this);
    }

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ void m74770q0() {
        e51.m114743H(getContext(), this.f50564m, 2000L);
    }

    /* JADX INFO: renamed from: r0 */
    public final /* synthetic */ void m74771r0() {
        this.f50561j.setGap(10);
        this.f50561j.setNextAnim(400L);
        this.f50561j.m76715G(this.f50566o, new Runnable() { // from class: l.igl
            @Override // java.lang.Runnable
            public final void run() {
                this.f113132a.m74770q0();
            }
        });
    }

    /* JADX INFO: renamed from: s0 */
    public final /* synthetic */ void m74772s0(String str) {
        this.f50561j.setPreAnim(400L);
        this.f50561j.m76715G(str, new Runnable() { // from class: l.jgl
            @Override // java.lang.Runnable
            public final void run() {
                HourBoardListItem.m74761j0();
            }
        });
    }

    /* JADX INFO: renamed from: t0 */
    public final /* synthetic */ void m74773t0(String str, Integer num) {
        m74766p0(str, this.f50566o);
    }

    /* JADX INFO: renamed from: u0 */
    public void m74774u0(final BLiveHourLeaderBoardItem bLiveHourLeaderBoardItem, @Nullable final dfl dflVar, @Nullable BLiveHourLeaderBoard bLiveHourLeaderBoard) {
        this.f50558g.setText(bLiveHourLeaderBoardItem.userName);
        this.f50555d.setText(m74765o0(bLiveHourLeaderBoardItem));
        xdl0.m208344M(this.f50562k, uvr.m196087d().m162719u0());
        boolean zM202204B = w8u.m202204B();
        VText vText = this.f50562k;
        if (zM202204B) {
            vText.setText(gar.m125009c(uvr.m196087d().m162715s0(), bLiveHourLeaderBoardItem.amount));
        } else {
            vText.setText(gar.m125009c(uvr.m196087d().m162715s0(), bLiveHourLeaderBoardItem.amount));
            int i = uvr.m196087d().m162715s0() ? i3c0.f110785M3 : i3c0.f111093n;
            if (((bgv) ypv.m215673l(fld0.f98151f)).m101734n()) {
                i = i3c0.f111061k3;
            }
            xdl0.m208383k(this.f50562k, getResources().getDrawable(i));
            this.f50562k.setCompoundDrawablePadding(t100.f167254c);
        }
        hxs.m133407t("context_single_room", this.f50556e, bLiveHourLeaderBoardItem.userImage, t100.f167275x);
        this.f50557f.m68778c(Color.parseColor("#ff852a"), Color.parseColor("#ff3a00"));
        xdl0.m208344M(this.f50557f, TEnum.equals(bLiveHourLeaderBoardItem.liveState, "onlive"));
        xdl0.m208329E0(this, new View.OnClickListener() { // from class: l.egl
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                HourBoardListItem.m74759h0(dflVar, bLiveHourLeaderBoardItem, view);
            }
        });
        xdl0.m208344M(this.f50559h, bLiveHourLeaderBoardItem.isOwn);
        if (bLiveHourLeaderBoardItem.isOwn) {
            m74767v0(bLiveHourLeaderBoardItem, bLiveHourLeaderBoard);
        }
    }

    /* JADX INFO: renamed from: y0 */
    public void m74775y0() {
        e51.m114745J(this.f50565n);
        e51.m114745J(this.f50564m);
        this.f50560i.m74786k(0.0f, 0, 0);
        this.f50561j.mo76702t();
    }

    public HourBoardListItem(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f50563l = 2000;
        this.f50566o = "";
    }

    public HourBoardListItem(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f50563l = 2000;
        this.f50566o = "";
    }
}
