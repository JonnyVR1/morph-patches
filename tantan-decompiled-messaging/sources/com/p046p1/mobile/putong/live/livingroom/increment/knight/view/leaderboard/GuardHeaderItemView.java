package com.p046p1.mobile.putong.live.livingroom.increment.knight.view.leaderboard;

import android.content.Context;
import android.graphics.Color;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.p046p1.mobile.putong.live.base.data.BLiveGuardboardRecord;
import com.p046p1.mobile.putong.live.base.view.LiveTagView;
import com.p046p1.mobile.putong.live.livingroom.R$string;
import p147v.VDraweeView;
import p147v.VLinear;
import p147v.VText;
import p149l.hxs;
import p149l.i3c0;
import p149l.srk;
import p149l.t100;
import p149l.w8u;
import p149l.x8u;
import p149l.xdl0;
import p149l.ypv;
import p149l.zqs;

/* JADX INFO: loaded from: classes4.dex */
public class GuardHeaderItemView extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public VDraweeView f50453a;

    /* JADX INFO: renamed from: b */
    public View f50454b;

    /* JADX INFO: renamed from: c */
    public LiveTagView f50455c;

    /* JADX INFO: renamed from: d */
    public VLinear f50456d;

    /* JADX INFO: renamed from: e */
    public VText f50457e;

    /* JADX INFO: renamed from: f */
    public VText f50458f;

    /* JADX INFO: renamed from: g */
    public BLiveGuardboardRecord f50459g;

    public GuardHeaderItemView(Context context) {
        super(context);
    }

    private void setAvatarBg(long j) {
        if (j == 1) {
            this.f50453a.setBackground(getContext().getResources().getDrawable(i3c0.f110760K2));
            xdl0.m208325C0(this.f50456d, t100.m186890d(50.0f));
        } else if (j == 2) {
            this.f50453a.setBackground(getContext().getResources().getDrawable(i3c0.f110772L2));
        } else if (j == 3) {
            this.f50453a.setBackground(getContext().getResources().getDrawable(i3c0.f110796N2));
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m74657b(View view) {
        srk.m185693a(this, view);
    }

    /* JADX INFO: renamed from: c */
    public void m74658c(int i) {
        this.f50459g = null;
        if (i == 1) {
            this.f50453a.setImageResource(i3c0.f110830Q2);
        } else if (i == 2) {
            this.f50453a.setImageResource(i3c0.f110784M2);
        } else if (i == 3) {
            this.f50453a.setImageResource(i3c0.f110808O2);
        }
        setAvatarBg(i);
        this.f50457e.setText(ypv.f199497e.getString(R$string.f47361l6));
        this.f50458f.setText("");
        xdl0.m208344M(this.f50458f, false);
        xdl0.m208344M(this.f50455c, false);
        xdl0.m208344M(this.f50454b, false);
    }

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ void m74659d(zqs zqsVar, View view) {
        zqsVar.m219885G(this.f50459g);
    }

    /* JADX INFO: renamed from: e */
    public void m74660e(final zqs zqsVar, BLiveGuardboardRecord bLiveGuardboardRecord, int i) {
        setAvatarBg(i);
        if (bLiveGuardboardRecord == null) {
            m74658c(i);
            return;
        }
        this.f50459g = bLiveGuardboardRecord;
        setOnClickListener(new View.OnClickListener() { // from class: l.rrk
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f160753a.m74659d(zqsVar, view);
            }
        });
        xdl0.m208345M0(this.f50453a, true);
        if (!TextUtils.isEmpty(this.f50459g.userImage)) {
            hxs.m133408u("context_single_room", this.f50453a, this.f50459g.userImage, t100.m186890d(76.0f), t100.m186890d(76.0f));
        }
        this.f50455c.m68778c(Color.parseColor("#ff852a"), Color.parseColor("#ff3a00"));
        boolean zEquals = TEnum.equals(this.f50459g.liveStates, "onlive");
        xdl0.m208344M(this.f50455c, zEquals);
        xdl0.m208344M(this.f50454b, zEquals);
        this.f50457e.setText(this.f50459g.userName);
        xdl0.m208344M(this.f50458f, true);
        this.f50458f.setText(w8u.m202218u(R$string.f46782K5, x8u.m207433c(Double.parseDouble(bLiveGuardboardRecord.amount))));
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m74657b(this);
    }

    public GuardHeaderItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public GuardHeaderItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
