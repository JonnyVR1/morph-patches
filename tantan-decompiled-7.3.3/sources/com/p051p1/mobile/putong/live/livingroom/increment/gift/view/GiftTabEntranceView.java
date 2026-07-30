package com.p051p1.mobile.putong.live.livingroom.increment.gift.view;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p051p1.mobile.putong.live.base.data.BLiveTabEntrance;
import org.jetbrains.annotations.Nullable;
import p151v.VImage;
import p151v.VText;
import p153l.bae0;
import p153l.bjs;
import p153l.bnl0;
import p153l.civ;
import p153l.gzj;
import p153l.htd0;
import p153l.uqb0;
import p153l.zrv;

/* JADX INFO: loaded from: classes4.dex */
public class GiftTabEntranceView extends ConstraintLayout {

    /* JADX INFO: renamed from: d */
    public VText f51198d;

    /* JADX INFO: renamed from: e */
    public VImage f51199e;

    /* JADX INFO: renamed from: f */
    @Nullable
    public BLiveTabEntrance f51200f;

    public GiftTabEntranceView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: h0 */
    public final void m75702h0(View view) {
        gzj.m133103a(this, view);
    }

    /* JADX INFO: renamed from: i0 */
    public void m75703i0(bjs<?> bjsVar) {
        ((civ) zrv.m221194l(htd0.f111524f)).m109975s(Long.valueOf(uqb0.f180376H.guessedCurrentServerTime()));
        bnl0.m105524M(this.f51199e, false);
        bjsVar.m213811F2().BottomEvent.refreshGiftRedDot().mo199273j(Boolean.FALSE);
        BLiveTabEntrance bLiveTabEntrance = this.f51200f;
        if (bLiveTabEntrance == null || TextUtils.isEmpty(bLiveTabEntrance.scheme)) {
            return;
        }
        bjsVar.m213811F2().SchemeHandleEvent.handleScheme().mo199273j(new bae0.C15953a(100).m103154e(this.f51200f.scheme).m103152c());
    }

    /* JADX INFO: renamed from: j0 */
    public void m75704j0(@Nullable BLiveTabEntrance bLiveTabEntrance) {
        this.f51200f = bLiveTabEntrance;
        if (bLiveTabEntrance == null || TextUtils.isEmpty(bLiveTabEntrance.name)) {
            bnl0.m105524M(this, false);
        } else {
            bnl0.m105524M(this, true);
            this.f51198d.setText(bLiveTabEntrance.name);
        }
    }

    /* JADX INFO: renamed from: k0 */
    public void m75705k0(boolean z) {
        bnl0.m105524M(this.f51199e, z);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m75702h0(this);
    }

    public GiftTabEntranceView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public GiftTabEntranceView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
