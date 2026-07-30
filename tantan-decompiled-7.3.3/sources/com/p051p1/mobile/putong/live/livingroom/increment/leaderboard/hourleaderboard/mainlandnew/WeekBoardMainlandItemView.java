package com.p051p1.mobile.putong.live.livingroom.increment.leaderboard.hourleaderboard.mainlandnew;

import android.content.Context;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p051p1.mobile.putong.live.base.data.BLiveHourLeaderBoardItem;
import com.p051p1.mobile.putong.live.base.view.LivingNewTagView;
import p151v.VDraweeView;
import p151v.VText;
import p153l.bnl0;
import p153l.cwp0;
import p153l.i0k;
import p153l.icr;
import p153l.izs;
import p153l.n9c0;
import p153l.obc0;
import p153l.qa00;
import p153l.uhl;
import p153l.vxr;
import p153l.xau;

/* JADX INFO: loaded from: classes4.dex */
public class WeekBoardMainlandItemView extends ConstraintLayout {

    /* JADX INFO: renamed from: d */
    public VText f51574d;

    /* JADX INFO: renamed from: e */
    public VDraweeView f51575e;

    /* JADX INFO: renamed from: f */
    public LivingNewTagView f51576f;

    /* JADX INFO: renamed from: g */
    public VText f51577g;

    /* JADX INFO: renamed from: h */
    public VDraweeView f51578h;

    /* JADX INFO: renamed from: i */
    public LinearLayout f51579i;

    /* JADX INFO: renamed from: j */
    public VText f51580j;

    /* JADX INFO: renamed from: k */
    public VText f51581k;

    /* JADX INFO: renamed from: l */
    public boolean f51582l;

    public WeekBoardMainlandItemView(Context context) {
        super(context);
        this.f51582l = false;
    }

    /* JADX INFO: renamed from: k0 */
    private String m76086k0(long j) {
        if (j == -1) {
            return "未上榜";
        }
        return j > 100 ? "100+" : String.valueOf(j);
    }

    /* JADX INFO: renamed from: m0 */
    private void m76087m0(String str) {
        boolean zIsEmpty = TextUtils.isEmpty(str);
        VDraweeView vDraweeView = this.f51578h;
        if (zIsEmpty) {
            bnl0.m105524M(vDraweeView, false);
        } else {
            bnl0.m105524M(vDraweeView, true);
            i0k.m137976c(str, this.f51578h, qa00.f156324k);
        }
    }

    /* JADX INFO: renamed from: i0 */
    public final void m76088i0(View view) {
        cwp0.m112931a(this, view);
    }

    /* JADX INFO: renamed from: j0 */
    public final String m76089j0(long j, long j2) {
        if (j == -1) {
            return "上榜还需" + icr.m139459b(j2) + "人气";
        }
        if (j == 1) {
            return "领先" + icr.m139459b(j2) + "人气";
        }
        return "落后" + icr.m139459b(j2) + "人气";
    }

    /* JADX INFO: renamed from: l0 */
    public final void m76090l0(long j, long j2, boolean z) {
        bnl0.m105524M(this.f51580j, z && j != -1);
        if (z && j == -1) {
            this.f51574d.setTextSize(12.0f);
            this.f51574d.setTypeface(Typeface.defaultFromStyle(0));
        } else {
            this.f51574d.setTextSize(j > 99 ? 14.0f : 18.0f);
        }
        this.f51581k.setText(m76089j0(j, j2));
        this.f51581k.setTextColor(z ? getContext().getResources().getColor(n9c0.f140844l1) : getContext().getResources().getColor(n9c0.f140855p0));
    }

    /* JADX INFO: renamed from: n0 */
    public void m76091n0(final BLiveHourLeaderBoardItem bLiveHourLeaderBoardItem, final uhl uhlVar, boolean z) {
        this.f51577g.setText(bLiveHourLeaderBoardItem.userName);
        this.f51574d.setText(m76086k0(bLiveHourLeaderBoardItem.rank));
        if (z && bLiveHourLeaderBoardItem.rank == -1) {
            this.f51574d.setTextSize(12.0f);
            this.f51574d.setTypeface(Typeface.defaultFromStyle(0));
        } else {
            this.f51574d.setTextSize(bLiveHourLeaderBoardItem.rank > 99 ? 14.0f : 18.0f);
        }
        bnl0.m105524M(this.f51580j, vxr.m203876d().m171026u0());
        boolean zM209897B = xau.m209897B();
        VText vText = this.f51580j;
        if (zM209897B) {
            vText.setText(icr.m139460c(vxr.m203876d().m171022s0(), bLiveHourLeaderBoardItem.amount));
        } else {
            vText.setText(bLiveHourLeaderBoardItem.amount + "");
            bnl0.m105563k(this.f51580j, getResources().getDrawable(vxr.m203876d().m171022s0() ? obc0.f146113M3 : obc0.f146421n));
            this.f51580j.setCompoundDrawablePadding(qa00.f156316c);
        }
        izs.m142869t("context_single_room", this.f51575e, bLiveHourLeaderBoardItem.userImage, qa00.f156337x);
        this.f51576f.m69968s(bLiveHourLeaderBoardItem.liveState);
        if (!z) {
            bnl0.m105509E0(this, new View.OnClickListener() { // from class: l.bwp0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    uhlVar.mo76107F(bLiveHourLeaderBoardItem);
                }
            });
        }
        m76087m0(bLiveHourLeaderBoardItem.backgroundUrl);
        m76090l0(bLiveHourLeaderBoardItem.rank, bLiveHourLeaderBoardItem.gap, z);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m76088i0(this);
        this.f51574d.setTypeface(Typeface.defaultFromStyle(1));
    }

    public WeekBoardMainlandItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f51582l = false;
    }

    public WeekBoardMainlandItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f51582l = false;
    }
}
