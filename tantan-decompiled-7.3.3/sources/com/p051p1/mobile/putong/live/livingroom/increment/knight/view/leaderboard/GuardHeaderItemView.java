package com.p051p1.mobile.putong.live.livingroom.increment.knight.view.leaderboard;

import android.content.Context;
import android.graphics.Color;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.p051p1.mobile.putong.live.base.data.BLiveGuardboardRecord;
import com.p051p1.mobile.putong.live.base.view.LiveTagView;
import com.p051p1.mobile.putong.live.livingroom.R$string;
import p151v.VDraweeView;
import p151v.VLinear;
import p151v.VText;
import p153l.ats;
import p153l.bnl0;
import p153l.iuk;
import p153l.izs;
import p153l.obc0;
import p153l.qa00;
import p153l.xau;
import p153l.yau;
import p153l.zrv;

/* JADX INFO: loaded from: classes4.dex */
public class GuardHeaderItemView extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public VDraweeView f51301a;

    /* JADX INFO: renamed from: b */
    public View f51302b;

    /* JADX INFO: renamed from: c */
    public LiveTagView f51303c;

    /* JADX INFO: renamed from: d */
    public VLinear f51304d;

    /* JADX INFO: renamed from: e */
    public VText f51305e;

    /* JADX INFO: renamed from: f */
    public VText f51306f;

    /* JADX INFO: renamed from: g */
    public BLiveGuardboardRecord f51307g;

    public GuardHeaderItemView(Context context) {
        super(context);
    }

    private void setAvatarBg(long j) {
        if (j == 1) {
            this.f51301a.setBackground(getContext().getResources().getDrawable(obc0.f146088K2));
            bnl0.m105505C0(this.f51304d, qa00.m175859d(50.0f));
        } else if (j == 2) {
            this.f51301a.setBackground(getContext().getResources().getDrawable(obc0.f146100L2));
        } else if (j == 3) {
            this.f51301a.setBackground(getContext().getResources().getDrawable(obc0.f146124N2));
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m75840b(View view) {
        iuk.m142198a(this, view);
    }

    /* JADX INFO: renamed from: c */
    public void m75841c(int i) {
        this.f51307g = null;
        if (i == 1) {
            this.f51301a.setImageResource(obc0.f146158Q2);
        } else if (i == 2) {
            this.f51301a.setImageResource(obc0.f146112M2);
        } else if (i == 3) {
            this.f51301a.setImageResource(obc0.f146136O2);
        }
        setAvatarBg(i);
        this.f51305e.setText(zrv.f205803e.getString(R$string.f48209l6));
        this.f51306f.setText("");
        bnl0.m105524M(this.f51306f, false);
        bnl0.m105524M(this.f51303c, false);
        bnl0.m105524M(this.f51302b, false);
    }

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ void m75842d(ats atsVar, View view) {
        atsVar.m100251G(this.f51307g);
    }

    /* JADX INFO: renamed from: e */
    public void m75843e(final ats atsVar, BLiveGuardboardRecord bLiveGuardboardRecord, int i) {
        setAvatarBg(i);
        if (bLiveGuardboardRecord == null) {
            m75841c(i);
            return;
        }
        this.f51307g = bLiveGuardboardRecord;
        setOnClickListener(new View.OnClickListener() { // from class: l.huk
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f111675a.m75842d(atsVar, view);
            }
        });
        bnl0.m105525M0(this.f51301a, true);
        if (!TextUtils.isEmpty(this.f51307g.userImage)) {
            izs.m142870u("context_single_room", this.f51301a, this.f51307g.userImage, qa00.m175859d(76.0f), qa00.m175859d(76.0f));
        }
        this.f51303c.m69961c(Color.parseColor("#ff852a"), Color.parseColor("#ff3a00"));
        boolean zEquals = TEnum.equals(this.f51307g.liveStates, "onlive");
        bnl0.m105524M(this.f51303c, zEquals);
        bnl0.m105524M(this.f51302b, zEquals);
        this.f51305e.setText(this.f51307g.userName);
        bnl0.m105524M(this.f51306f, true);
        this.f51306f.setText(xau.m209911u(R$string.f47630K5, yau.m214935c(Double.parseDouble(bLiveGuardboardRecord.amount))));
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m75840b(this);
    }

    public GuardHeaderItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public GuardHeaderItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
