package com.p046p1.mobile.putong.live.livingroom.increment.leaderboard.hourleaderboard.intl;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.p046p1.mobile.putong.live.base.data.BLiveHourLeaderBoardItem;
import com.p046p1.mobile.putong.live.base.view.LiveTagView;
import com.p046p1.mobile.putong.live.livingroom.R$string;
import p147v.VDraweeView;
import p147v.VLinear;
import p147v.VText;
import p149l.bgv;
import p149l.dfl;
import p149l.fld0;
import p149l.gar;
import p149l.h1c0;
import p149l.hxs;
import p149l.i3c0;
import p149l.kvc0;
import p149l.t100;
import p149l.uvr;
import p149l.vhl;
import p149l.w8u;
import p149l.xdl0;
import p149l.ypv;

/* JADX INFO: loaded from: classes4.dex */
public class HourHeaderItemView extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public VDraweeView f50594a;

    /* JADX INFO: renamed from: b */
    public View f50595b;

    /* JADX INFO: renamed from: c */
    public LiveTagView f50596c;

    /* JADX INFO: renamed from: d */
    public VLinear f50597d;

    /* JADX INFO: renamed from: e */
    public VText f50598e;

    /* JADX INFO: renamed from: f */
    public VText f50599f;

    /* JADX INFO: renamed from: g */
    public BLiveHourLeaderBoardItem f50600g;

    public HourHeaderItemView(Context context) {
        super(context);
    }

    private void setAvatarBg(long j) {
        if (j == 1) {
            this.f50594a.setBackground(getContext().getResources().getDrawable(i3c0.f110760K2));
            xdl0.m208325C0(this.f50597d, t100.m186890d(50.0f));
        } else if (j == 2) {
            this.f50594a.setBackground(getContext().getResources().getDrawable(i3c0.f110772L2));
        } else if (j == 3) {
            this.f50594a.setBackground(getContext().getResources().getDrawable(i3c0.f110796N2));
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m74803b(View view) {
        vhl.m198465a(this, view);
    }

    /* JADX INFO: renamed from: c */
    public void m74804c(int i) {
        this.f50600g = null;
        if (i == 1) {
            this.f50594a.setImageResource(i3c0.f110830Q2);
            setAvatarBg(i);
        } else if (i == 2) {
            this.f50594a.setImageResource(i3c0.f110784M2);
            setAvatarBg(i);
        } else if (i == 3) {
            this.f50594a.setImageResource(i3c0.f110808O2);
            setAvatarBg(i);
        }
        this.f50598e.setText(ypv.f199497e.getString(R$string.f47361l6));
        this.f50599f.setText("");
        xdl0.m208344M(this.f50599f, false);
        xdl0.m208344M(this.f50596c, false);
        xdl0.m208344M(this.f50595b, false);
    }

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ void m74805d(dfl dflVar, View view) {
        BLiveHourLeaderBoardItem bLiveHourLeaderBoardItem = this.f50600g;
        if (bLiveHourLeaderBoardItem != null) {
            dflVar.mo74924F(bLiveHourLeaderBoardItem);
        }
    }

    /* JADX INFO: renamed from: e */
    public void m74806e(BLiveHourLeaderBoardItem bLiveHourLeaderBoardItem, final dfl dflVar) {
        this.f50600g = bLiveHourLeaderBoardItem;
        xdl0.m208345M0(this.f50594a, true);
        setAvatarBg(bLiveHourLeaderBoardItem.rank);
        if (!TextUtils.isEmpty(this.f50600g.userImage)) {
            hxs.m133408u("context_single_room", this.f50594a, this.f50600g.userImage, t100.m186890d(76.0f), t100.m186890d(76.0f));
        }
        this.f50596c.m68778c(kvc0.m147352a(h1c0.f105303D0), kvc0.m147352a(h1c0.f105403s0));
        boolean zEquals = TEnum.equals(this.f50600g.liveState, "onlive");
        xdl0.m208344M(this.f50596c, zEquals);
        xdl0.m208344M(this.f50595b, zEquals);
        this.f50598e.setText(this.f50600g.userName);
        xdl0.m208344M(this.f50599f, uvr.m196087d().m162719u0());
        boolean zM202204B = w8u.m202204B();
        VText vText = this.f50599f;
        if (zM202204B) {
            vText.setText(gar.m125009c(uvr.m196087d().m162715s0(), this.f50600g.amount));
        } else {
            vText.setText(gar.m125009c(uvr.m196087d().m162715s0(), this.f50600g.amount));
            int i = uvr.m196087d().m162715s0() ? i3c0.f110773L3 : i3c0.f110744Ia;
            if (((bgv) ypv.m215673l(fld0.f98151f)).m101734n()) {
                i = i3c0.f110908X3;
            }
            xdl0.m208383k(this.f50599f, getResources().getDrawable(i));
            this.f50599f.setCompoundDrawablePadding(t100.f167254c);
        }
        xdl0.m208329E0(this, new View.OnClickListener() { // from class: l.uhl
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f176574a.m74805d(dflVar, view);
            }
        });
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m74803b(this);
    }

    public HourHeaderItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public HourHeaderItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
