package com.p000p1.mobile.putong.live.livingroom.archi.frag;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p000p1.mobile.putong.live.livingroom.R$string;
import com.p1.mobile.putong.live.base.data.BLiveAbsData;
import l.j760;
import l.xdl0;
import l.ypv;
import p002l.q8d0;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class RoomIndicatorView extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public RoomIndicatorView f3785a;

    /* JADX INFO: renamed from: b */
    public LinearLayout f3786b;

    /* JADX INFO: renamed from: c */
    public VText f3787c;

    /* JADX INFO: renamed from: d */
    public LinearLayout f3788d;

    /* JADX INFO: renamed from: e */
    public VText f3789e;

    public RoomIndicatorView(@NonNull Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public final void m5182a(View view) {
        q8d0.m21069a(this, view);
    }

    /* JADX INFO: renamed from: b */
    public void m5183b(boolean z, j760<Boolean, BLiveAbsData> j760Var) {
        Object obj = j760Var.a;
        if (obj == null) {
            m5184c();
            return;
        }
        if (((Boolean) obj).booleanValue()) {
            m5184c();
            m5186e((BLiveAbsData) j760Var.b);
        } else if (z) {
            this.f3787c.setText(ypv.e.getString(R$string.f3166aa));
        } else {
            this.f3789e.setText(ypv.e.getString(R$string.f3166aa));
        }
    }

    /* JADX INFO: renamed from: c */
    public void m5184c() {
        xdl0.M(this.f3786b, true);
        xdl0.M(this.f3788d, true);
        this.f3787c.setText(ypv.e.getString(R$string.f3021Tc));
        this.f3789e.setText(ypv.e.getString(R$string.f3453nc));
    }

    /* JADX INFO: renamed from: d */
    public void m5185d(boolean z) {
        xdl0.M(this.f3786b, z);
        xdl0.M(this.f3788d, !z);
    }

    /* JADX INFO: renamed from: e */
    public final void m5186e(BLiveAbsData bLiveAbsData) {
        if (bLiveAbsData == null) {
            return;
        }
        boolean zIsVoiceLive = bLiveAbsData.isVoiceLive();
        VText vText = this.f3787c;
        if (zIsVoiceLive) {
            vText.setText(ypv.e.getString(R$string.f3285fj));
            this.f3789e.setText(ypv.e.getString(R$string.f2922Oi));
        } else {
            vText.setText(ypv.e.getString(R$string.f3021Tc));
            this.f3789e.setText(ypv.e.getString(R$string.f2922Oi));
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m5182a(this);
    }

    public RoomIndicatorView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public RoomIndicatorView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
