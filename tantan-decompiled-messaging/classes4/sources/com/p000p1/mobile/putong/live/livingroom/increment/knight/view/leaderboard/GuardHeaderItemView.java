package com.p000p1.mobile.putong.live.livingroom.increment.knight.view.leaderboard;

import android.content.Context;
import android.graphics.Color;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import com.p000p1.mobile.putong.live.livingroom.R$string;
import com.p1.mobile.putong.data.tenum.TEnum;
import com.p1.mobile.putong.live.base.data.BLiveGuardboardRecord;
import com.p1.mobile.putong.live.base.view.LiveTagView;
import l.hxs;
import l.t100;
import l.w8u;
import l.x8u;
import l.xdl0;
import l.ypv;
import p002l.i3c0;
import p002l.srk;
import p002l.zqs;
import v.VDraweeView;
import v.VLinear;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class GuardHeaderItemView extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public VDraweeView f6495a;

    /* JADX INFO: renamed from: b */
    public View f6496b;

    /* JADX INFO: renamed from: c */
    public LiveTagView f6497c;

    /* JADX INFO: renamed from: d */
    public VLinear f6498d;

    /* JADX INFO: renamed from: e */
    public VText f6499e;

    /* JADX INFO: renamed from: f */
    public VText f6500f;

    /* JADX INFO: renamed from: g */
    public BLiveGuardboardRecord f6501g;

    public GuardHeaderItemView(Context context) {
        super(context);
    }

    private void setAvatarBg(long j) {
        if (j == 1) {
            this.f6495a.setBackground(getContext().getResources().getDrawable(i3c0.f12545K2));
            xdl0.C0(this.f6498d, t100.d(50.0f));
        } else if (j == 2) {
            this.f6495a.setBackground(getContext().getResources().getDrawable(i3c0.f12557L2));
        } else if (j == 3) {
            this.f6495a.setBackground(getContext().getResources().getDrawable(i3c0.f12581N2));
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m8251b(View view) {
        srk.m22633a(this, view);
    }

    /* JADX INFO: renamed from: c */
    public void m8252c(int i) {
        this.f6501g = null;
        if (i == 1) {
            this.f6495a.setImageResource(i3c0.f12615Q2);
        } else if (i == 2) {
            this.f6495a.setImageResource(i3c0.f12569M2);
        } else if (i == 3) {
            this.f6495a.setImageResource(i3c0.f12593O2);
        }
        setAvatarBg(i);
        this.f6499e.setText(ypv.e.getString(R$string.f3403l6));
        this.f6500f.setText("");
        xdl0.M(this.f6500f, false);
        xdl0.M(this.f6497c, false);
        xdl0.M(this.f6496b, false);
    }

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ void m8253d(zqs zqsVar, View view) {
        zqsVar.m27513G(this.f6501g);
    }

    /* JADX INFO: renamed from: e */
    public void m8254e(final zqs zqsVar, BLiveGuardboardRecord bLiveGuardboardRecord, int i) {
        setAvatarBg(i);
        if (bLiveGuardboardRecord == null) {
            m8252c(i);
            return;
        }
        this.f6501g = bLiveGuardboardRecord;
        setOnClickListener(new View.OnClickListener() { // from class: l.rrk
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f18662a.m8253d(zqsVar, view);
            }
        });
        xdl0.M0(this.f6495a, true);
        if (!TextUtils.isEmpty(this.f6501g.userImage)) {
            hxs.u("context_single_room", this.f6495a, this.f6501g.userImage, t100.d(76.0f), t100.d(76.0f));
        }
        this.f6497c.c(Color.parseColor("#ff852a"), Color.parseColor("#ff3a00"));
        boolean zEquals = TEnum.equals(this.f6501g.liveStates, "onlive");
        xdl0.M(this.f6497c, zEquals);
        xdl0.M(this.f6496b, zEquals);
        this.f6499e.setText(this.f6501g.userName);
        xdl0.M(this.f6500f, true);
        this.f6500f.setText(w8u.u(R$string.f2824K5, x8u.c(Double.parseDouble(bLiveGuardboardRecord.amount))));
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m8251b(this);
    }

    public GuardHeaderItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public GuardHeaderItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
