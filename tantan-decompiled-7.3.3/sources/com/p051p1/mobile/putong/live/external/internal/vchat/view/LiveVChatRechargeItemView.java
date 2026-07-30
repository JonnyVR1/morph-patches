package com.p051p1.mobile.putong.live.external.internal.vchat.view;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.ColorInt;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.p051p1.mobile.putong.live.base.data.BLiveMerchandise;
import com.p051p1.mobile.putong.live.livingroom.R$string;
import p151v.VText;
import p153l.a9g0;
import p153l.bnl0;
import p153l.msu;
import p153l.n3d0;
import p153l.n9c0;
import p153l.obc0;
import p153l.z20;
import p153l.zrv;

/* JADX INFO: loaded from: classes9.dex */
public class LiveVChatRechargeItemView extends ConstraintLayout {

    /* JADX INFO: renamed from: d */
    public VText f46271d;

    /* JADX INFO: renamed from: e */
    public VText f46272e;

    /* JADX INFO: renamed from: f */
    public VText f46273f;

    /* JADX INFO: renamed from: g */
    public VText f46274g;

    /* JADX INFO: renamed from: h */
    public Group f46275h;

    /* JADX INFO: renamed from: i */
    public BLiveMerchandise f46276i;

    public LiveVChatRechargeItemView(Context context) {
        super(context);
    }

    public BLiveMerchandise getCurrentRechargeModule() {
        return this.f46276i;
    }

    public int getTTPrice() {
        BLiveMerchandise bLiveMerchandise = this.f46276i;
        if (bLiveMerchandise == null) {
            return 0;
        }
        return bLiveMerchandise.quantity;
    }

    /* JADX INFO: renamed from: i0 */
    public final void m70965i0(View view) {
        msu.m159936a(this, view);
    }

    /* JADX INFO: renamed from: j0 */
    public final boolean m70966j0(BLiveMerchandise bLiveMerchandise) {
        return (bLiveMerchandise == null || !bLiveMerchandise.isCustomRecharge || bLiveMerchandise.isCustomRechargeInput) ? false : true;
    }

    /* JADX INFO: renamed from: k0 */
    public final /* synthetic */ void m70967k0(z20 z20Var, BLiveMerchandise bLiveMerchandise, View view) {
        z20Var.call(bLiveMerchandise, this);
    }

    /* JADX INFO: renamed from: l0 */
    public void m70968l0(boolean z, Drawable drawable, Drawable drawable2) {
        if (z) {
            setBackground(drawable);
        } else {
            setBackground(drawable2);
        }
    }

    /* JADX INFO: renamed from: m0 */
    public void m70969m0(boolean z) {
        m70968l0(z, n3d0.m161278b(obc0.f146417m7), n3d0.m161278b(obc0.f146429n7));
        m70970n0(z, n3d0.m161277a(n9c0.f140864s0), n3d0.m161277a(n9c0.f140798U0), n3d0.m161277a(n9c0.f140864s0), n3d0.m161277a(n9c0.f140806Y0));
    }

    /* JADX INFO: renamed from: n0 */
    public void m70970n0(boolean z, @ColorInt int i, @ColorInt int i2, @ColorInt int i3, @ColorInt int i4) {
        if (z) {
            setTitleTextColor(i);
            setSubTitleTextColor(i3);
        } else {
            setTitleTextColor(i2);
            setSubTitleTextColor(i4);
        }
    }

    /* JADX INFO: renamed from: o0 */
    public void m70971o0(final BLiveMerchandise bLiveMerchandise, final z20<BLiveMerchandise, LiveVChatRechargeItemView> z20Var) {
        this.f46276i = bLiveMerchandise;
        int i = bLiveMerchandise.quantity;
        if (i > 0) {
            this.f46271d.setText(String.valueOf(i));
        }
        double d = bLiveMerchandise.defaultStockKeepUnit.prices.price;
        if (d > FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
            this.f46273f.setText(String.format(zrv.f205803e.getString(R$string.f47964a2), a9g0.m96569d(d)));
        }
        boolean zM70966j0 = m70966j0(bLiveMerchandise);
        bnl0.m105524M(this.f46274g, zM70966j0);
        bnl0.m105524M(this.f46275h, !zM70966j0);
        setOnClickListener(new View.OnClickListener() { // from class: l.lsu
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f133464a.m70967k0(z20Var, bLiveMerchandise, view);
            }
        });
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m70965i0(this);
    }

    public void setSubTitleTextColor(@ColorInt int i) {
        this.f46273f.setTextColor(i);
    }

    public void setTitleTextColor(@ColorInt int i) {
        this.f46271d.setTextColor(i);
        this.f46272e.setTextColor(i);
        this.f46274g.setTextColor(i);
    }

    public LiveVChatRechargeItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public LiveVChatRechargeItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
