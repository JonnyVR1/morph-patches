package com.p051p1.mobile.putong.live.livingroom.increment.recharge;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.ColorInt;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.p051p1.mobile.putong.live.base.data.BLiveMerchandise;
import com.p051p1.mobile.putong.live.livingroom.R$string;
import p151v.VImage;
import p151v.VText;
import p153l.a9g0;
import p153l.bnl0;
import p153l.kes;
import p153l.n3d0;
import p153l.n9c0;
import p153l.obc0;
import p153l.u8n;
import p153l.xau;
import p153l.z20;
import p153l.zrv;

/* JADX INFO: loaded from: classes4.dex */
public class LiveFastRechargeItem extends ConstraintLayout {

    /* JADX INFO: renamed from: d */
    public VImage f51720d;

    /* JADX INFO: renamed from: e */
    public VText f51721e;

    /* JADX INFO: renamed from: f */
    public VText f51722f;

    /* JADX INFO: renamed from: g */
    public VText f51723g;

    /* JADX INFO: renamed from: h */
    public VText f51724h;

    /* JADX INFO: renamed from: i */
    public VText f51725i;

    /* JADX INFO: renamed from: j */
    public Group f51726j;

    /* JADX INFO: renamed from: k */
    public BLiveMerchandise f51727k;

    public LiveFastRechargeItem(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: j0 */
    private boolean m76307j0(BLiveMerchandise bLiveMerchandise) {
        return (bLiveMerchandise == null || !bLiveMerchandise.isCustomRecharge || bLiveMerchandise.isCustomRechargeInput) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k0 */
    public /* synthetic */ void m76308k0(z20 z20Var, BLiveMerchandise bLiveMerchandise, View view) {
        z20Var.call(bLiveMerchandise, this);
    }

    public BLiveMerchandise getCurrentRechargeModule() {
        return this.f51727k;
    }

    public int getTTPrice() {
        BLiveMerchandise bLiveMerchandise = this.f51727k;
        if (bLiveMerchandise == null) {
            return 0;
        }
        return bLiveMerchandise.quantity;
    }

    /* JADX INFO: renamed from: i0 */
    public final void m76309i0(View view) {
        kes.m149342a(this, view);
    }

    /* JADX INFO: renamed from: l0 */
    public void m76310l0(boolean z, Drawable drawable, Drawable drawable2) {
        if (z) {
            setBackground(drawable);
        } else {
            setBackground(drawable2);
        }
    }

    /* JADX INFO: renamed from: m0 */
    public void m76311m0(boolean z) {
        m76310l0(z, n3d0.m161278b(obc0.f146417m7), n3d0.m161278b(obc0.f146429n7));
        m76312n0(z, n3d0.m161277a(n9c0.f140864s0), n3d0.m161277a(n9c0.f140798U0), n3d0.m161277a(n9c0.f140864s0), n3d0.m161277a(n9c0.f140806Y0));
    }

    /* JADX INFO: renamed from: n0 */
    public void m76312n0(boolean z, @ColorInt int i, @ColorInt int i2, @ColorInt int i3, @ColorInt int i4) {
        if (z) {
            setTitleTextColor(i);
            setSubTitleTextColor(i3);
        } else {
            setTitleTextColor(i2);
            setSubTitleTextColor(i4);
        }
    }

    /* JADX INFO: renamed from: o0 */
    public void m76313o0(final BLiveMerchandise bLiveMerchandise, final z20<BLiveMerchandise, LiveFastRechargeItem> z20Var) {
        this.f51727k = bLiveMerchandise;
        int i = bLiveMerchandise.quantity;
        if (i > 0) {
            this.f51722f.setText(String.valueOf(i));
        }
        double d = bLiveMerchandise.defaultStockKeepUnit.prices.price;
        this.f51723g.setText(xau.m209910t(u8n.m195065a() ? R$string.f47425Ak : R$string.f48261ne));
        if (d > FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
            String string = zrv.f205803e.getString(R$string.f47964a2);
            if (zrv.f205799a.m207637H()) {
                string = bLiveMerchandise.defaultStockKeepUnit.prices.currencySymbol + " %s";
            }
            this.f51724h.setText(String.format(string, zrv.f205799a.m207637H() ? a9g0.m96570e(d) : a9g0.m96569d(d)));
        }
        boolean zM76307j0 = m76307j0(bLiveMerchandise);
        bnl0.m105524M(this.f51725i, zM76307j0);
        bnl0.m105524M(this.f51726j, !zM76307j0);
        setOnClickListener(new View.OnClickListener() { // from class: l.jes
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f120519a.m76308k0(z20Var, bLiveMerchandise, view);
            }
        });
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m76309i0(this);
    }

    /* JADX INFO: renamed from: p0 */
    public void m76314p0(boolean z) {
        bnl0.m105524M(this.f51720d, z);
    }

    /* JADX INFO: renamed from: q0 */
    public void m76315q0(String str) {
        bnl0.m105524M(this.f51721e, !TextUtils.isEmpty(str));
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.f51721e.setText(str);
    }

    public void setSubTitleTextColor(@ColorInt int i) {
        this.f51724h.setTextColor(i);
    }

    public void setTitleTextColor(@ColorInt int i) {
        this.f51722f.setTextColor(i);
        this.f51723g.setTextColor(i);
        this.f51725i.setTextColor(i);
    }

    public LiveFastRechargeItem(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public LiveFastRechargeItem(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
