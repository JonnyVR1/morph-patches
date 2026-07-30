package com.p051p1.mobile.putong.live.livingroom.archi.frag;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p051p1.mobile.putong.live.base.data.BLiveAbsData;
import com.p051p1.mobile.putong.live.livingroom.R$string;
import p151v.VText;
import p153l.bnl0;
import p153l.pf60;
import p153l.tgd0;
import p153l.zrv;

/* JADX INFO: loaded from: classes4.dex */
public class RoomIndicatorView extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public RoomIndicatorView f48591a;

    /* JADX INFO: renamed from: b */
    public LinearLayout f48592b;

    /* JADX INFO: renamed from: c */
    public VText f48593c;

    /* JADX INFO: renamed from: d */
    public LinearLayout f48594d;

    /* JADX INFO: renamed from: e */
    public VText f48595e;

    public RoomIndicatorView(@NonNull Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public final void m72994a(View view) {
        tgd0.m191025a(this, view);
    }

    /* JADX INFO: renamed from: b */
    public void m72995b(boolean z, pf60<Boolean, BLiveAbsData> pf60Var) {
        Boolean bool = pf60Var.f152156a;
        if (bool == null) {
            m72996c();
            return;
        }
        if (bool.booleanValue()) {
            m72996c();
            m72998e(pf60Var.f152157b);
        } else if (z) {
            this.f48593c.setText(zrv.f205803e.getString(R$string.f47972aa));
        } else {
            this.f48595e.setText(zrv.f205803e.getString(R$string.f47972aa));
        }
    }

    /* JADX INFO: renamed from: c */
    public void m72996c() {
        bnl0.m105524M(this.f48592b, true);
        bnl0.m105524M(this.f48594d, true);
        this.f48593c.setText(zrv.f205803e.getString(R$string.f47827Tc));
        this.f48595e.setText(zrv.f205803e.getString(R$string.f48259nc));
    }

    /* JADX INFO: renamed from: d */
    public void m72997d(boolean z) {
        bnl0.m105524M(this.f48592b, z);
        bnl0.m105524M(this.f48594d, !z);
    }

    /* JADX INFO: renamed from: e */
    public final void m72998e(BLiveAbsData bLiveAbsData) {
        if (bLiveAbsData == null) {
            return;
        }
        boolean zIsVoiceLive = bLiveAbsData.isVoiceLive();
        VText vText = this.f48593c;
        if (zIsVoiceLive) {
            vText.setText(zrv.f205803e.getString(R$string.f48091fj));
            this.f48595e.setText(zrv.f205803e.getString(R$string.f47728Oi));
        } else {
            vText.setText(zrv.f205803e.getString(R$string.f47827Tc));
            this.f48595e.setText(zrv.f205803e.getString(R$string.f47728Oi));
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m72994a(this);
    }

    public RoomIndicatorView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public RoomIndicatorView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
