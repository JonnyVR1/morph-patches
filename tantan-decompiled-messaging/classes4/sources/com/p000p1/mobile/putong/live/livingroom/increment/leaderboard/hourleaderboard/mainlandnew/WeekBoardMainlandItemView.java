package com.p000p1.mobile.putong.live.livingroom.increment.leaderboard.hourleaderboard.mainlandnew;

import android.content.Context;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p1.mobile.putong.live.base.data.BLiveHourLeaderBoardItem;
import com.p1.mobile.putong.live.base.view.LivingNewTagView;
import l.hxs;
import l.sxj;
import l.t100;
import l.uvr;
import l.w8u;
import l.xdl0;
import p002l.dfl;
import p002l.gar;
import p002l.h1c0;
import p002l.i3c0;
import p002l.ymp0;
import v.VDraweeView;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class WeekBoardMainlandItemView extends ConstraintLayout {

    /* JADX INFO: renamed from: d */
    public VText f6768d;

    /* JADX INFO: renamed from: e */
    public VDraweeView f6769e;

    /* JADX INFO: renamed from: f */
    public LivingNewTagView f6770f;

    /* JADX INFO: renamed from: g */
    public VText f6771g;

    /* JADX INFO: renamed from: h */
    public VDraweeView f6772h;

    /* JADX INFO: renamed from: i */
    public LinearLayout f6773i;

    /* JADX INFO: renamed from: j */
    public VText f6774j;

    /* JADX INFO: renamed from: k */
    public VText f6775k;

    /* JADX INFO: renamed from: l */
    public boolean f6776l;

    public WeekBoardMainlandItemView(Context context) {
        super(context);
        this.f6776l = false;
    }

    /* JADX INFO: renamed from: k0 */
    private String m8505k0(long j) {
        if (j == -1) {
            return "未上榜";
        }
        return j > 100 ? "100+" : String.valueOf(j);
    }

    /* JADX INFO: renamed from: m0 */
    private void m8506m0(String str) {
        boolean zIsEmpty = TextUtils.isEmpty(str);
        VDraweeView vDraweeView = this.f6772h;
        if (zIsEmpty) {
            xdl0.M(vDraweeView, false);
        } else {
            xdl0.M(vDraweeView, true);
            sxj.c(str, this.f6772h, t100.k);
        }
    }

    /* JADX INFO: renamed from: i0 */
    public final void m8507i0(View view) {
        ymp0.m26813a(this, view);
    }

    /* JADX INFO: renamed from: j0 */
    public final String m8508j0(long j, long j2) {
        if (j == -1) {
            return "上榜还需" + gar.m13674b(j2) + "人气";
        }
        if (j == 1) {
            return "领先" + gar.m13674b(j2) + "人气";
        }
        return "落后" + gar.m13674b(j2) + "人气";
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: l0 */
    public final void m8509l0(long j, long j2, boolean z) {
        xdl0.M(this.f6774j, z && j != -1);
        if (z && j == -1) {
            this.f6768d.setTextSize(12.0f);
            this.f6768d.setTypeface(Typeface.defaultFromStyle(0));
        } else {
            this.f6768d.setTextSize(j > 99 ? 14.0f : 18.0f);
        }
        this.f6775k.setText(m8508j0(j, j2));
        this.f6775k.setTextColor(z ? getContext().getResources().getColor(h1c0.f11803l1) : getContext().getResources().getColor(h1c0.f11814p0));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: n0 */
    public void m8510n0(final BLiveHourLeaderBoardItem bLiveHourLeaderBoardItem, final dfl dflVar, boolean z) {
        this.f6771g.setText(bLiveHourLeaderBoardItem.userName);
        this.f6768d.setText(m8505k0(bLiveHourLeaderBoardItem.rank));
        if (z && bLiveHourLeaderBoardItem.rank == -1) {
            this.f6768d.setTextSize(12.0f);
            this.f6768d.setTypeface(Typeface.defaultFromStyle(0));
        } else {
            this.f6768d.setTextSize(bLiveHourLeaderBoardItem.rank > 99 ? 14.0f : 18.0f);
        }
        xdl0.M(this.f6774j, uvr.d().u0());
        boolean zB = w8u.B();
        VText vText = this.f6774j;
        if (zB) {
            vText.setText(gar.m13675c(uvr.d().s0(), bLiveHourLeaderBoardItem.amount));
        } else {
            vText.setText(bLiveHourLeaderBoardItem.amount + "");
            xdl0.k(this.f6774j, getResources().getDrawable(uvr.d().s0() ? i3c0.f12570M3 : i3c0.f12878n));
            this.f6774j.setCompoundDrawablePadding(t100.c);
        }
        hxs.t("context_single_room", this.f6769e, bLiveHourLeaderBoardItem.userImage, t100.x);
        this.f6770f.s(bLiveHourLeaderBoardItem.liveState);
        if (!z) {
            xdl0.E0(this, new View.OnClickListener() { // from class: l.xmp0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    dflVar.mo8526F(bLiveHourLeaderBoardItem);
                }
            });
        }
        m8506m0(bLiveHourLeaderBoardItem.backgroundUrl);
        m8509l0(bLiveHourLeaderBoardItem.rank, bLiveHourLeaderBoardItem.gap, z);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onFinishInflate() {
        super/*android.view.View*/.onFinishInflate();
        m8507i0(this);
        this.f6768d.setTypeface(Typeface.defaultFromStyle(1));
    }

    public WeekBoardMainlandItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f6776l = false;
    }

    public WeekBoardMainlandItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f6776l = false;
    }
}
