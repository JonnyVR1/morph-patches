package com.p000p1.mobile.putong.live.livingroom.increment.leaderboard.hourleaderboard.intl;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import com.p000p1.mobile.putong.live.livingroom.R$string;
import com.p1.mobile.putong.data.tenum.TEnum;
import com.p1.mobile.putong.live.base.data.BLiveHourLeaderBoardItem;
import com.p1.mobile.putong.live.base.view.LiveTagView;
import l.bgv;
import l.fld0;
import l.hxs;
import l.kvc0;
import l.t100;
import l.uvr;
import l.w8u;
import l.xdl0;
import l.ypv;
import p002l.dfl;
import p002l.gar;
import p002l.h1c0;
import p002l.i3c0;
import p002l.vhl;
import v.VDraweeView;
import v.VLinear;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class HourHeaderItemView extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public VDraweeView f6636a;

    /* JADX INFO: renamed from: b */
    public View f6637b;

    /* JADX INFO: renamed from: c */
    public LiveTagView f6638c;

    /* JADX INFO: renamed from: d */
    public VLinear f6639d;

    /* JADX INFO: renamed from: e */
    public VText f6640e;

    /* JADX INFO: renamed from: f */
    public VText f6641f;

    /* JADX INFO: renamed from: g */
    public BLiveHourLeaderBoardItem f6642g;

    public HourHeaderItemView(Context context) {
        super(context);
    }

    private void setAvatarBg(long j) {
        if (j == 1) {
            this.f6636a.setBackground(getContext().getResources().getDrawable(i3c0.f12545K2));
            xdl0.C0(this.f6639d, t100.d(50.0f));
        } else if (j == 2) {
            this.f6636a.setBackground(getContext().getResources().getDrawable(i3c0.f12557L2));
        } else if (j == 3) {
            this.f6636a.setBackground(getContext().getResources().getDrawable(i3c0.f12581N2));
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m8401b(View view) {
        vhl.m23951a(this, view);
    }

    /* JADX INFO: renamed from: c */
    public void m8402c(int i) {
        this.f6642g = null;
        if (i == 1) {
            this.f6636a.setImageResource(i3c0.f12615Q2);
            setAvatarBg(i);
        } else if (i == 2) {
            this.f6636a.setImageResource(i3c0.f12569M2);
            setAvatarBg(i);
        } else if (i == 3) {
            this.f6636a.setImageResource(i3c0.f12593O2);
            setAvatarBg(i);
        }
        this.f6640e.setText(ypv.e.getString(R$string.f3403l6));
        this.f6641f.setText("");
        xdl0.M(this.f6641f, false);
        xdl0.M(this.f6638c, false);
        xdl0.M(this.f6637b, false);
    }

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ void m8403d(dfl dflVar, View view) {
        BLiveHourLeaderBoardItem bLiveHourLeaderBoardItem = this.f6642g;
        if (bLiveHourLeaderBoardItem != null) {
            dflVar.mo8526F(bLiveHourLeaderBoardItem);
        }
    }

    /* JADX INFO: renamed from: e */
    public void m8404e(BLiveHourLeaderBoardItem bLiveHourLeaderBoardItem, final dfl dflVar) {
        this.f6642g = bLiveHourLeaderBoardItem;
        xdl0.M0(this.f6636a, true);
        setAvatarBg(bLiveHourLeaderBoardItem.rank);
        if (!TextUtils.isEmpty(this.f6642g.userImage)) {
            hxs.u("context_single_room", this.f6636a, this.f6642g.userImage, t100.d(76.0f), t100.d(76.0f));
        }
        this.f6638c.c(kvc0.a(h1c0.f11723D0), kvc0.a(h1c0.f11823s0));
        boolean zEquals = TEnum.equals(this.f6642g.liveState, "onlive");
        xdl0.M(this.f6638c, zEquals);
        xdl0.M(this.f6637b, zEquals);
        this.f6640e.setText(this.f6642g.userName);
        xdl0.M(this.f6641f, uvr.d().u0());
        boolean zB = w8u.B();
        VText vText = this.f6641f;
        if (zB) {
            vText.setText(gar.m13675c(uvr.d().s0(), this.f6642g.amount));
        } else {
            vText.setText(gar.m13675c(uvr.d().s0(), this.f6642g.amount));
            int i = uvr.d().s0() ? i3c0.f12558L3 : i3c0.f12529Ia;
            if (((bgv) ypv.l(fld0.f)).n()) {
                i = i3c0.f12693X3;
            }
            xdl0.k(this.f6641f, getResources().getDrawable(i));
            this.f6641f.setCompoundDrawablePadding(t100.c);
        }
        xdl0.E0(this, new View.OnClickListener() { // from class: l.uhl
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f20656a.m8403d(dflVar, view);
            }
        });
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m8401b(this);
    }

    public HourHeaderItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public HourHeaderItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
