package com.p046p1.mobile.putong.live.livingroom.archi.frag;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p046p1.mobile.putong.live.base.data.BLiveAbsData;
import com.p046p1.mobile.putong.live.livingroom.R$string;
import p147v.VText;
import p149l.j760;
import p149l.q8d0;
import p149l.xdl0;
import p149l.ypv;

/* JADX INFO: loaded from: classes4.dex */
public class RoomIndicatorView extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public RoomIndicatorView f47743a;

    /* JADX INFO: renamed from: b */
    public LinearLayout f47744b;

    /* JADX INFO: renamed from: c */
    public VText f47745c;

    /* JADX INFO: renamed from: d */
    public LinearLayout f47746d;

    /* JADX INFO: renamed from: e */
    public VText f47747e;

    public RoomIndicatorView(@NonNull Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public final void m71811a(View view) {
        q8d0.m173368a(this, view);
    }

    /* JADX INFO: renamed from: b */
    public void m71812b(boolean z, j760<Boolean, BLiveAbsData> j760Var) {
        Boolean bool = j760Var.f116564a;
        if (bool == null) {
            m71813c();
            return;
        }
        if (bool.booleanValue()) {
            m71813c();
            m71815e(j760Var.f116565b);
        } else if (z) {
            this.f47745c.setText(ypv.f199497e.getString(R$string.f47124aa));
        } else {
            this.f47747e.setText(ypv.f199497e.getString(R$string.f47124aa));
        }
    }

    /* JADX INFO: renamed from: c */
    public void m71813c() {
        xdl0.m208344M(this.f47744b, true);
        xdl0.m208344M(this.f47746d, true);
        this.f47745c.setText(ypv.f199497e.getString(R$string.f46979Tc));
        this.f47747e.setText(ypv.f199497e.getString(R$string.f47411nc));
    }

    /* JADX INFO: renamed from: d */
    public void m71814d(boolean z) {
        xdl0.m208344M(this.f47744b, z);
        xdl0.m208344M(this.f47746d, !z);
    }

    /* JADX INFO: renamed from: e */
    public final void m71815e(BLiveAbsData bLiveAbsData) {
        if (bLiveAbsData == null) {
            return;
        }
        boolean zIsVoiceLive = bLiveAbsData.isVoiceLive();
        VText vText = this.f47745c;
        if (zIsVoiceLive) {
            vText.setText(ypv.f199497e.getString(R$string.f47243fj));
            this.f47747e.setText(ypv.f199497e.getString(R$string.f46880Oi));
        } else {
            vText.setText(ypv.f199497e.getString(R$string.f46979Tc));
            this.f47747e.setText(ypv.f199497e.getString(R$string.f46880Oi));
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m71811a(this);
    }

    public RoomIndicatorView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public RoomIndicatorView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
