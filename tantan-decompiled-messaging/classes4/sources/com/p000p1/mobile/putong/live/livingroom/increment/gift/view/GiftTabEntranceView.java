package com.p000p1.mobile.putong.live.livingroom.increment.gift.view;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p1.mobile.putong.live.base.data.BLiveTabEntrance;
import l.bgv;
import l.fld0;
import l.qib0;
import l.xdl0;
import l.ypv;
import org.jetbrains.annotations.Nullable;
import p002l.ahs;
import p002l.qwj;
import p002l.x1e0;
import v.VImage;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class GiftTabEntranceView extends ConstraintLayout {

    /* JADX INFO: renamed from: d */
    public VText f6392d;

    /* JADX INFO: renamed from: e */
    public VImage f6393e;

    /* JADX INFO: renamed from: f */
    @Nullable
    public BLiveTabEntrance f6394f;

    public GiftTabEntranceView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: h0 */
    public final void m8106h0(View view) {
        qwj.m21621a(this, view);
    }

    /* JADX INFO: renamed from: i0 */
    public void m8107i0(ahs<?> ahsVar) {
        ((bgv) ypv.l(fld0.f)).s(Long.valueOf(qib0.H.guessedCurrentServerTime()));
        xdl0.M(this.f6393e, false);
        ahsVar.m25548F2().BottomEvent.refreshGiftRedDot().j(Boolean.FALSE);
        BLiveTabEntrance bLiveTabEntrance = this.f6394f;
        if (bLiveTabEntrance == null || TextUtils.isEmpty(bLiveTabEntrance.scheme)) {
            return;
        }
        ahsVar.m25548F2().SchemeHandleEvent.handleScheme().j(new x1e0.C0891a(100).m25610e(this.f6394f.scheme).m25608c());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: j0 */
    public void m8108j0(@Nullable BLiveTabEntrance bLiveTabEntrance) {
        this.f6394f = bLiveTabEntrance;
        if (bLiveTabEntrance == null || TextUtils.isEmpty(bLiveTabEntrance.name)) {
            xdl0.M(this, false);
        } else {
            xdl0.M(this, true);
            this.f6392d.setText(bLiveTabEntrance.name);
        }
    }

    /* JADX INFO: renamed from: k0 */
    public void m8109k0(boolean z) {
        xdl0.M(this.f6393e, z);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onFinishInflate() {
        super/*android.view.View*/.onFinishInflate();
        m8106h0(this);
    }

    public GiftTabEntranceView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public GiftTabEntranceView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
