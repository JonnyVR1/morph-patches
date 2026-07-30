package com.p000p1.mobile.putong.live.livingroom.increment.leaderboard.hourleaderboard.intl;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Color;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p000p1.mobile.putong.live.livingroom.R$string;
import com.p000p1.mobile.putong.live.livingroom.increment.leaderboard.hourleaderboard.intl.HourBoardListItem;
import com.p1.mobile.putong.data.tenum.TEnum;
import com.p1.mobile.putong.live.base.data.BLiveHourLeaderBoard;
import com.p1.mobile.putong.live.base.data.BLiveHourLeaderBoardItem;
import com.p1.mobile.putong.live.base.view.LiveTagView;
import com.p1.mobile.putong.live.livingroom.view.rollview.LiveTextRollView;
import com.tantanapp.common.utils.NullChecker;
import l.bgv;
import l.e30;
import l.e51;
import l.ffw;
import l.fld0;
import l.hxs;
import l.t100;
import l.uvr;
import l.w8u;
import l.xdl0;
import l.ypv;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p002l.dfl;
import p002l.gar;
import p002l.i3c0;
import p002l.kgl;
import v.VDraweeView;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class HourBoardListItem extends ConstraintLayout {

    /* JADX INFO: renamed from: d */
    public VText f6597d;

    /* JADX INFO: renamed from: e */
    public VDraweeView f6598e;

    /* JADX INFO: renamed from: f */
    public LiveTagView f6599f;

    /* JADX INFO: renamed from: g */
    public VText f6600g;

    /* JADX INFO: renamed from: h */
    public FrameLayout f6601h;

    /* JADX INFO: renamed from: i */
    public HourBoardProgressView f6602i;

    /* JADX INFO: renamed from: j */
    public LiveTextRollView f6603j;

    /* JADX INFO: renamed from: k */
    public VText f6604k;

    /* JADX INFO: renamed from: l */
    public final int f6605l;

    /* JADX INFO: renamed from: m */
    public Runnable f6606m;

    /* JADX INFO: renamed from: n */
    public Runnable f6607n;

    /* JADX INFO: renamed from: o */
    public String f6608o;

    public HourBoardListItem(Context context) {
        super(context);
        this.f6605l = 2000;
        this.f6608o = "";
    }

    /* JADX INFO: renamed from: h0 */
    public static /* synthetic */ void m8357h0(dfl dflVar, BLiveHourLeaderBoardItem bLiveHourLeaderBoardItem, View view) {
        if (dflVar != null) {
            dflVar.mo8526F(bLiveHourLeaderBoardItem);
        }
    }

    /* JADX INFO: renamed from: j0 */
    public static /* synthetic */ void m8359j0() {
    }

    @NotNull
    /* JADX INFO: renamed from: o0 */
    private String m8363o0(BLiveHourLeaderBoardItem bLiveHourLeaderBoardItem) {
        long j = bLiveHourLeaderBoardItem.rank;
        if (j <= 0) {
            return "--";
        }
        return j > 100 ? "100+" : String.valueOf(j);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: p0 */
    private void m8364p0(String str, String str2) {
        this.f6603j.C(str, true);
        this.f6603j.v(getWidth(), true);
        this.f6603j.C(str2, false);
        this.f6603j.v(getWidth(), false);
    }

    @SuppressLint({"RtlHardcoded"})
    /* JADX INFO: renamed from: v0 */
    private void m8365v0(BLiveHourLeaderBoardItem bLiveHourLeaderBoardItem, @Nullable BLiveHourLeaderBoard bLiveHourLeaderBoard) {
        if (!NullChecker.a(bLiveHourLeaderBoard) || !bLiveHourLeaderBoard.currentHourSuggestConfig.enable) {
            this.f6603j.reset();
            xdl0.M(this.f6601h, false);
            return;
        }
        xdl0.M(this.f6601h, true);
        this.f6602i.setColors(new int[]{Color.parseColor("#ff539c"), Color.parseColor("#ff539c")});
        int i = bLiveHourLeaderBoard.currentHourSuggestConfig.target;
        float f = i > 0 ? (bLiveHourLeaderBoardItem.amount * 1.0f) / i : 0.0f;
        this.f6602i.m8384k(f <= 1.0f ? f : 1.0f, 0, 0);
        xdl0.M0(this.f6602i, bLiveHourLeaderBoardItem.amount > 0);
        m8366w0(f, bLiveHourLeaderBoardItem, bLiveHourLeaderBoard);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: w0 */
    private void m8366w0(float f, BLiveHourLeaderBoardItem bLiveHourLeaderBoardItem, BLiveHourLeaderBoard bLiveHourLeaderBoard) {
        final String strV;
        if (f >= 1.0f) {
            strV = w8u.t(R$string.f3601u6);
        } else {
            this.f6608o = w8u.u(R$string.f3579t6, gar.m13673a(uvr.d().s0(), bLiveHourLeaderBoard.currentHourSuggestConfig.target));
            int i = uvr.d().s0() ? R$string.f3667x6 : R$string.f3623v6;
            if (((bgv) ypv.l(fld0.f)).n()) {
                i = R$string.f3645w6;
            }
            strV = w8u.v(i, new Object[]{gar.m13674b((int) bLiveHourLeaderBoardItem.amount), gar.m13674b(bLiveHourLeaderBoard.currentHourSuggestConfig.target)});
            this.f6607n = new Runnable() { // from class: l.fgl
                @Override // java.lang.Runnable
                public final void run() {
                    this.f10337a.m8369r0();
                }
            };
            this.f6606m = new Runnable() { // from class: l.ggl
                @Override // java.lang.Runnable
                public final void run() {
                    this.f11406a.m8370s0(strV);
                }
            };
            e51.H(getContext(), this.f6607n, 2000L);
        }
        if (this.f6603j.getWidth() > 0) {
            m8364p0(strV, this.f6608o);
        } else {
            xdl0.K(this.f6603j).first().subscribe(ffw.d(new e30() { // from class: l.hgl
                public final void call(Object obj) {
                    this.f12026a.m8371t0(strV, (Integer) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: n0 */
    public final void m8367n0(View view) {
        kgl.m16618a(this, view);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onFinishInflate() {
        super/*android.view.View*/.onFinishInflate();
        m8367n0(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ void m8368q0() {
        e51.H(getContext(), this.f6606m, 2000L);
    }

    /* JADX INFO: renamed from: r0 */
    public final /* synthetic */ void m8369r0() {
        this.f6603j.setGap(10);
        this.f6603j.setNextAnim(400L);
        this.f6603j.G(this.f6608o, new Runnable() { // from class: l.igl
            @Override // java.lang.Runnable
            public final void run() {
                this.f13233a.m8368q0();
            }
        });
    }

    /* JADX INFO: renamed from: s0 */
    public final /* synthetic */ void m8370s0(String str) {
        this.f6603j.setPreAnim(400L);
        this.f6603j.G(str, new Runnable() { // from class: l.jgl
            @Override // java.lang.Runnable
            public final void run() {
                HourBoardListItem.m8359j0();
            }
        });
    }

    /* JADX INFO: renamed from: t0 */
    public final /* synthetic */ void m8371t0(String str, Integer num) {
        m8364p0(str, this.f6608o);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: u0 */
    public void m8372u0(final BLiveHourLeaderBoardItem bLiveHourLeaderBoardItem, @Nullable final dfl dflVar, @Nullable BLiveHourLeaderBoard bLiveHourLeaderBoard) {
        this.f6600g.setText(bLiveHourLeaderBoardItem.userName);
        this.f6597d.setText(m8363o0(bLiveHourLeaderBoardItem));
        xdl0.M(this.f6604k, uvr.d().u0());
        boolean zB = w8u.B();
        VText vText = this.f6604k;
        if (zB) {
            vText.setText(gar.m13675c(uvr.d().s0(), bLiveHourLeaderBoardItem.amount));
        } else {
            vText.setText(gar.m13675c(uvr.d().s0(), bLiveHourLeaderBoardItem.amount));
            int i = uvr.d().s0() ? i3c0.f12570M3 : i3c0.f12878n;
            if (((bgv) ypv.l(fld0.f)).n()) {
                i = i3c0.f12846k3;
            }
            xdl0.k(this.f6604k, getResources().getDrawable(i));
            this.f6604k.setCompoundDrawablePadding(t100.c);
        }
        hxs.t("context_single_room", this.f6598e, bLiveHourLeaderBoardItem.userImage, t100.x);
        this.f6599f.c(Color.parseColor("#ff852a"), Color.parseColor("#ff3a00"));
        xdl0.M(this.f6599f, TEnum.equals(bLiveHourLeaderBoardItem.liveState, "onlive"));
        xdl0.E0(this, new View.OnClickListener() { // from class: l.egl
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                HourBoardListItem.m8357h0(dflVar, bLiveHourLeaderBoardItem, view);
            }
        });
        xdl0.M(this.f6601h, bLiveHourLeaderBoardItem.isOwn);
        if (bLiveHourLeaderBoardItem.isOwn) {
            m8365v0(bLiveHourLeaderBoardItem, bLiveHourLeaderBoard);
        }
    }

    /* JADX INFO: renamed from: y0 */
    public void m8373y0() {
        e51.J(this.f6607n);
        e51.J(this.f6606m);
        this.f6602i.m8384k(0.0f, 0, 0);
        this.f6603j.t();
    }

    public HourBoardListItem(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f6605l = 2000;
        this.f6608o = "";
    }

    public HourBoardListItem(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f6605l = 2000;
        this.f6608o = "";
    }
}
