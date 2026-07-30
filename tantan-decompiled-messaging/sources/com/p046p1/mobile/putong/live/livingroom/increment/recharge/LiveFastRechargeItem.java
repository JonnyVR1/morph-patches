package com.p046p1.mobile.putong.live.livingroom.increment.recharge;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.ColorInt;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.p046p1.mobile.putong.live.base.data.BLiveMerchandise;
import com.p046p1.mobile.putong.live.livingroom.R$string;
import p147v.VImage;
import p147v.VText;
import p149l.f30;
import p149l.h1c0;
import p149l.i3c0;
import p149l.jcs;
import p149l.kvc0;
import p149l.t0g0;
import p149l.u6n;
import p149l.w8u;
import p149l.xdl0;
import p149l.ypv;

/* JADX INFO: loaded from: classes4.dex */
public class LiveFastRechargeItem extends ConstraintLayout {

    /* JADX INFO: renamed from: d */
    public VImage f50872d;

    /* JADX INFO: renamed from: e */
    public VText f50873e;

    /* JADX INFO: renamed from: f */
    public VText f50874f;

    /* JADX INFO: renamed from: g */
    public VText f50875g;

    /* JADX INFO: renamed from: h */
    public VText f50876h;

    /* JADX INFO: renamed from: i */
    public VText f50877i;

    /* JADX INFO: renamed from: j */
    public Group f50878j;

    /* JADX INFO: renamed from: k */
    public BLiveMerchandise f50879k;

    public LiveFastRechargeItem(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: j0 */
    private boolean m75124j0(BLiveMerchandise bLiveMerchandise) {
        return (bLiveMerchandise == null || !bLiveMerchandise.isCustomRecharge || bLiveMerchandise.isCustomRechargeInput) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k0 */
    public /* synthetic */ void m75125k0(f30 f30Var, BLiveMerchandise bLiveMerchandise, View view) {
        f30Var.call(bLiveMerchandise, this);
    }

    public BLiveMerchandise getCurrentRechargeModule() {
        return this.f50879k;
    }

    public int getTTPrice() {
        BLiveMerchandise bLiveMerchandise = this.f50879k;
        if (bLiveMerchandise == null) {
            return 0;
        }
        return bLiveMerchandise.quantity;
    }

    /* JADX INFO: renamed from: i0 */
    public final void m75126i0(View view) {
        jcs.m140991a(this, view);
    }

    /* JADX INFO: renamed from: l0 */
    public void m75127l0(boolean z, Drawable drawable, Drawable drawable2) {
        if (z) {
            setBackground(drawable);
        } else {
            setBackground(drawable2);
        }
    }

    /* JADX INFO: renamed from: m0 */
    public void m75128m0(boolean z) {
        m75127l0(z, kvc0.m147353b(i3c0.f111089m7), kvc0.m147353b(i3c0.f111101n7));
        m75129n0(z, kvc0.m147352a(h1c0.f105403s0), kvc0.m147352a(h1c0.f105337U0), kvc0.m147352a(h1c0.f105403s0), kvc0.m147352a(h1c0.f105345Y0));
    }

    /* JADX INFO: renamed from: n0 */
    public void m75129n0(boolean z, @ColorInt int i, @ColorInt int i2, @ColorInt int i3, @ColorInt int i4) {
        if (z) {
            setTitleTextColor(i);
            setSubTitleTextColor(i3);
        } else {
            setTitleTextColor(i2);
            setSubTitleTextColor(i4);
        }
    }

    /* JADX INFO: renamed from: o0 */
    public void m75130o0(final BLiveMerchandise bLiveMerchandise, final f30<BLiveMerchandise, LiveFastRechargeItem> f30Var) {
        this.f50879k = bLiveMerchandise;
        int i = bLiveMerchandise.quantity;
        if (i > 0) {
            this.f50874f.setText(String.valueOf(i));
        }
        double d = bLiveMerchandise.defaultStockKeepUnit.prices.price;
        this.f50875g.setText(w8u.m202217t(u6n.m192015a() ? R$string.f46577Ak : R$string.f47413ne));
        if (d > FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
            String string = ypv.f199497e.getString(R$string.f47116a2);
            if (ypv.f199493a.m199315H()) {
                string = bLiveMerchandise.defaultStockKeepUnit.prices.currencySymbol + " %s";
            }
            this.f50876h.setText(String.format(string, ypv.f199493a.m199315H() ? t0g0.m186864e(d) : t0g0.m186863d(d)));
        }
        boolean zM75124j0 = m75124j0(bLiveMerchandise);
        xdl0.m208344M(this.f50877i, zM75124j0);
        xdl0.m208344M(this.f50878j, !zM75124j0);
        setOnClickListener(new View.OnClickListener() { // from class: l.ics
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f112479a.m75125k0(f30Var, bLiveMerchandise, view);
            }
        });
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m75126i0(this);
    }

    /* JADX INFO: renamed from: p0 */
    public void m75131p0(boolean z) {
        xdl0.m208344M(this.f50872d, z);
    }

    /* JADX INFO: renamed from: q0 */
    public void m75132q0(String str) {
        xdl0.m208344M(this.f50873e, !TextUtils.isEmpty(str));
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.f50873e.setText(str);
    }

    public void setSubTitleTextColor(@ColorInt int i) {
        this.f50876h.setTextColor(i);
    }

    public void setTitleTextColor(@ColorInt int i) {
        this.f50874f.setTextColor(i);
        this.f50875g.setTextColor(i);
        this.f50877i.setTextColor(i);
    }

    public LiveFastRechargeItem(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public LiveFastRechargeItem(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
