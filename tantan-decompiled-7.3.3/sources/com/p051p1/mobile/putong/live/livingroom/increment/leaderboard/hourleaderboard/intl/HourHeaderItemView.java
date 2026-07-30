package com.p051p1.mobile.putong.live.livingroom.increment.leaderboard.hourleaderboard.intl;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.p051p1.mobile.putong.live.base.data.BLiveHourLeaderBoardItem;
import com.p051p1.mobile.putong.live.base.view.LiveTagView;
import com.p051p1.mobile.putong.live.livingroom.R$string;
import p151v.VDraweeView;
import p151v.VLinear;
import p151v.VText;
import p153l.bnl0;
import p153l.civ;
import p153l.htd0;
import p153l.icr;
import p153l.izs;
import p153l.mkl;
import p153l.n3d0;
import p153l.n9c0;
import p153l.obc0;
import p153l.qa00;
import p153l.uhl;
import p153l.vxr;
import p153l.xau;
import p153l.zrv;

/* JADX INFO: loaded from: classes4.dex */
public class HourHeaderItemView extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public VDraweeView f51442a;

    /* JADX INFO: renamed from: b */
    public View f51443b;

    /* JADX INFO: renamed from: c */
    public LiveTagView f51444c;

    /* JADX INFO: renamed from: d */
    public VLinear f51445d;

    /* JADX INFO: renamed from: e */
    public VText f51446e;

    /* JADX INFO: renamed from: f */
    public VText f51447f;

    /* JADX INFO: renamed from: g */
    public BLiveHourLeaderBoardItem f51448g;

    public HourHeaderItemView(Context context) {
        super(context);
    }

    private void setAvatarBg(long j) {
        if (j == 1) {
            this.f51442a.setBackground(getContext().getResources().getDrawable(obc0.f146088K2));
            bnl0.m105505C0(this.f51445d, qa00.m175859d(50.0f));
        } else if (j == 2) {
            this.f51442a.setBackground(getContext().getResources().getDrawable(obc0.f146100L2));
        } else if (j == 3) {
            this.f51442a.setBackground(getContext().getResources().getDrawable(obc0.f146124N2));
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m75986b(View view) {
        mkl.m158811a(this, view);
    }

    /* JADX INFO: renamed from: c */
    public void m75987c(int i) {
        this.f51448g = null;
        if (i == 1) {
            this.f51442a.setImageResource(obc0.f146158Q2);
            setAvatarBg(i);
        } else if (i == 2) {
            this.f51442a.setImageResource(obc0.f146112M2);
            setAvatarBg(i);
        } else if (i == 3) {
            this.f51442a.setImageResource(obc0.f146136O2);
            setAvatarBg(i);
        }
        this.f51446e.setText(zrv.f205803e.getString(R$string.f48209l6));
        this.f51447f.setText("");
        bnl0.m105524M(this.f51447f, false);
        bnl0.m105524M(this.f51444c, false);
        bnl0.m105524M(this.f51443b, false);
    }

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ void m75988d(uhl uhlVar, View view) {
        BLiveHourLeaderBoardItem bLiveHourLeaderBoardItem = this.f51448g;
        if (bLiveHourLeaderBoardItem != null) {
            uhlVar.mo76107F(bLiveHourLeaderBoardItem);
        }
    }

    /* JADX INFO: renamed from: e */
    public void m75989e(BLiveHourLeaderBoardItem bLiveHourLeaderBoardItem, final uhl uhlVar) {
        this.f51448g = bLiveHourLeaderBoardItem;
        bnl0.m105525M0(this.f51442a, true);
        setAvatarBg(bLiveHourLeaderBoardItem.rank);
        if (!TextUtils.isEmpty(this.f51448g.userImage)) {
            izs.m142870u("context_single_room", this.f51442a, this.f51448g.userImage, qa00.m175859d(76.0f), qa00.m175859d(76.0f));
        }
        this.f51444c.m69961c(n3d0.m161277a(n9c0.f140764D0), n3d0.m161277a(n9c0.f140864s0));
        boolean zEquals = TEnum.equals(this.f51448g.liveState, "onlive");
        bnl0.m105524M(this.f51444c, zEquals);
        bnl0.m105524M(this.f51443b, zEquals);
        this.f51446e.setText(this.f51448g.userName);
        bnl0.m105524M(this.f51447f, vxr.m203876d().m171026u0());
        boolean zM209897B = xau.m209897B();
        VText vText = this.f51447f;
        if (zM209897B) {
            vText.setText(icr.m139460c(vxr.m203876d().m171022s0(), this.f51448g.amount));
        } else {
            vText.setText(icr.m139460c(vxr.m203876d().m171022s0(), this.f51448g.amount));
            int i = vxr.m203876d().m171022s0() ? obc0.f146101L3 : obc0.f146072Ia;
            if (((civ) zrv.m221194l(htd0.f111524f)).m109970n()) {
                i = obc0.f146236X3;
            }
            bnl0.m105563k(this.f51447f, getResources().getDrawable(i));
            this.f51447f.setCompoundDrawablePadding(qa00.f156316c);
        }
        bnl0.m105509E0(this, new View.OnClickListener() { // from class: l.lkl
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f132483a.m75988d(uhlVar, view);
            }
        });
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m75986b(this);
    }

    public HourHeaderItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public HourHeaderItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
