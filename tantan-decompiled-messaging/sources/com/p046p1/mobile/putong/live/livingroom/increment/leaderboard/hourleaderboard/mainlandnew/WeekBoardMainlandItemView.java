package com.p046p1.mobile.putong.live.livingroom.increment.leaderboard.hourleaderboard.mainlandnew;

import android.content.Context;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p046p1.mobile.putong.live.base.data.BLiveHourLeaderBoardItem;
import com.p046p1.mobile.putong.live.base.view.LivingNewTagView;
import p147v.VDraweeView;
import p147v.VText;
import p149l.dfl;
import p149l.gar;
import p149l.h1c0;
import p149l.hxs;
import p149l.i3c0;
import p149l.sxj;
import p149l.t100;
import p149l.uvr;
import p149l.w8u;
import p149l.xdl0;
import p149l.ymp0;

/* JADX INFO: loaded from: classes4.dex */
public class WeekBoardMainlandItemView extends ConstraintLayout {

    /* JADX INFO: renamed from: d */
    public VText f50726d;

    /* JADX INFO: renamed from: e */
    public VDraweeView f50727e;

    /* JADX INFO: renamed from: f */
    public LivingNewTagView f50728f;

    /* JADX INFO: renamed from: g */
    public VText f50729g;

    /* JADX INFO: renamed from: h */
    public VDraweeView f50730h;

    /* JADX INFO: renamed from: i */
    public LinearLayout f50731i;

    /* JADX INFO: renamed from: j */
    public VText f50732j;

    /* JADX INFO: renamed from: k */
    public VText f50733k;

    /* JADX INFO: renamed from: l */
    public boolean f50734l;

    public WeekBoardMainlandItemView(Context context) {
        super(context);
        this.f50734l = false;
    }

    /* JADX INFO: renamed from: k0 */
    private String m74903k0(long j) {
        if (j == -1) {
            return "未上榜";
        }
        return j > 100 ? "100+" : String.valueOf(j);
    }

    /* JADX INFO: renamed from: m0 */
    private void m74904m0(String str) {
        boolean zIsEmpty = TextUtils.isEmpty(str);
        VDraweeView vDraweeView = this.f50730h;
        if (zIsEmpty) {
            xdl0.m208344M(vDraweeView, false);
        } else {
            xdl0.m208344M(vDraweeView, true);
            sxj.m186442c(str, this.f50730h, t100.f167262k);
        }
    }

    /* JADX INFO: renamed from: i0 */
    public final void m74905i0(View view) {
        ymp0.m215376a(this, view);
    }

    /* JADX INFO: renamed from: j0 */
    public final String m74906j0(long j, long j2) {
        if (j == -1) {
            return "上榜还需" + gar.m125008b(j2) + "人气";
        }
        if (j == 1) {
            return "领先" + gar.m125008b(j2) + "人气";
        }
        return "落后" + gar.m125008b(j2) + "人气";
    }

    /* JADX INFO: renamed from: l0 */
    public final void m74907l0(long j, long j2, boolean z) {
        xdl0.m208344M(this.f50732j, z && j != -1);
        if (z && j == -1) {
            this.f50726d.setTextSize(12.0f);
            this.f50726d.setTypeface(Typeface.defaultFromStyle(0));
        } else {
            this.f50726d.setTextSize(j > 99 ? 14.0f : 18.0f);
        }
        this.f50733k.setText(m74906j0(j, j2));
        this.f50733k.setTextColor(z ? getContext().getResources().getColor(h1c0.f105383l1) : getContext().getResources().getColor(h1c0.f105394p0));
    }

    /* JADX INFO: renamed from: n0 */
    public void m74908n0(final BLiveHourLeaderBoardItem bLiveHourLeaderBoardItem, final dfl dflVar, boolean z) {
        this.f50729g.setText(bLiveHourLeaderBoardItem.userName);
        this.f50726d.setText(m74903k0(bLiveHourLeaderBoardItem.rank));
        if (z && bLiveHourLeaderBoardItem.rank == -1) {
            this.f50726d.setTextSize(12.0f);
            this.f50726d.setTypeface(Typeface.defaultFromStyle(0));
        } else {
            this.f50726d.setTextSize(bLiveHourLeaderBoardItem.rank > 99 ? 14.0f : 18.0f);
        }
        xdl0.m208344M(this.f50732j, uvr.m196087d().m162719u0());
        boolean zM202204B = w8u.m202204B();
        VText vText = this.f50732j;
        if (zM202204B) {
            vText.setText(gar.m125009c(uvr.m196087d().m162715s0(), bLiveHourLeaderBoardItem.amount));
        } else {
            vText.setText(bLiveHourLeaderBoardItem.amount + "");
            xdl0.m208383k(this.f50732j, getResources().getDrawable(uvr.m196087d().m162715s0() ? i3c0.f110785M3 : i3c0.f111093n));
            this.f50732j.setCompoundDrawablePadding(t100.f167254c);
        }
        hxs.m133407t("context_single_room", this.f50727e, bLiveHourLeaderBoardItem.userImage, t100.f167275x);
        this.f50728f.m68785s(bLiveHourLeaderBoardItem.liveState);
        if (!z) {
            xdl0.m208329E0(this, new View.OnClickListener() { // from class: l.xmp0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    dflVar.mo74924F(bLiveHourLeaderBoardItem);
                }
            });
        }
        m74904m0(bLiveHourLeaderBoardItem.backgroundUrl);
        m74907l0(bLiveHourLeaderBoardItem.rank, bLiveHourLeaderBoardItem.gap, z);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m74905i0(this);
        this.f50726d.setTypeface(Typeface.defaultFromStyle(1));
    }

    public WeekBoardMainlandItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f50734l = false;
    }

    public WeekBoardMainlandItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f50734l = false;
    }
}
