package com.p046p1.mobile.putong.live.livingroom.increment.gift.view;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p046p1.mobile.putong.live.base.data.BLiveTabEntrance;
import org.jetbrains.annotations.Nullable;
import p147v.VImage;
import p147v.VText;
import p149l.ahs;
import p149l.bgv;
import p149l.fld0;
import p149l.qib0;
import p149l.qwj;
import p149l.x1e0;
import p149l.xdl0;
import p149l.ypv;

/* JADX INFO: loaded from: classes4.dex */
public class GiftTabEntranceView extends ConstraintLayout {

    /* JADX INFO: renamed from: d */
    public VText f50350d;

    /* JADX INFO: renamed from: e */
    public VImage f50351e;

    /* JADX INFO: renamed from: f */
    @Nullable
    public BLiveTabEntrance f50352f;

    public GiftTabEntranceView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: h0 */
    public final void m74519h0(View view) {
        qwj.m176826a(this, view);
    }

    /* JADX INFO: renamed from: i0 */
    public void m74520i0(ahs<?> ahsVar) {
        ((bgv) ypv.m215673l(fld0.f98151f)).m101739s(Long.valueOf(qib0.f154693H.guessedCurrentServerTime()));
        xdl0.m208344M(this.f50351e, false);
        ahsVar.m206028F2().BottomEvent.refreshGiftRedDot().mo172463j(Boolean.FALSE);
        BLiveTabEntrance bLiveTabEntrance = this.f50352f;
        if (bLiveTabEntrance == null || TextUtils.isEmpty(bLiveTabEntrance.scheme)) {
            return;
        }
        ahsVar.m206028F2().SchemeHandleEvent.handleScheme().mo172463j(new x1e0.C21018a(100).m206701e(this.f50352f.scheme).m206699c());
    }

    /* JADX INFO: renamed from: j0 */
    public void m74521j0(@Nullable BLiveTabEntrance bLiveTabEntrance) {
        this.f50352f = bLiveTabEntrance;
        if (bLiveTabEntrance == null || TextUtils.isEmpty(bLiveTabEntrance.name)) {
            xdl0.m208344M(this, false);
        } else {
            xdl0.m208344M(this, true);
            this.f50350d.setText(bLiveTabEntrance.name);
        }
    }

    /* JADX INFO: renamed from: k0 */
    public void m74522k0(boolean z) {
        xdl0.m208344M(this.f50351e, z);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m74519h0(this);
    }

    public GiftTabEntranceView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public GiftTabEntranceView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
