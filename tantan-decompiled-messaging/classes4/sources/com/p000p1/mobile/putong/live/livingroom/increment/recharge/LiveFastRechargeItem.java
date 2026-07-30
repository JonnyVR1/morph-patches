package com.p000p1.mobile.putong.live.livingroom.increment.recharge;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.ColorInt;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import com.p000p1.mobile.putong.live.livingroom.R$string;
import com.p1.mobile.putong.live.base.data.BLiveMerchandise;
import l.f30;
import l.kvc0;
import l.t0g0;
import l.u6n;
import l.w8u;
import l.xdl0;
import l.ypv;
import p002l.h1c0;
import p002l.i3c0;
import p002l.jcs;
import v.VImage;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class LiveFastRechargeItem extends ConstraintLayout {

    /* JADX INFO: renamed from: d */
    public VImage f6914d;

    /* JADX INFO: renamed from: e */
    public VText f6915e;

    /* JADX INFO: renamed from: f */
    public VText f6916f;

    /* JADX INFO: renamed from: g */
    public VText f6917g;

    /* JADX INFO: renamed from: h */
    public VText f6918h;

    /* JADX INFO: renamed from: i */
    public VText f6919i;

    /* JADX INFO: renamed from: j */
    public Group f6920j;

    /* JADX INFO: renamed from: k */
    public BLiveMerchandise f6921k;

    public LiveFastRechargeItem(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: j0 */
    private boolean m8740j0(BLiveMerchandise bLiveMerchandise) {
        return (bLiveMerchandise == null || !bLiveMerchandise.isCustomRecharge || bLiveMerchandise.isCustomRechargeInput) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k0 */
    public /* synthetic */ void m8741k0(f30 f30Var, BLiveMerchandise bLiveMerchandise, View view) {
        f30Var.call(bLiveMerchandise, this);
    }

    public BLiveMerchandise getCurrentRechargeModule() {
        return this.f6921k;
    }

    public int getTTPrice() {
        BLiveMerchandise bLiveMerchandise = this.f6921k;
        if (bLiveMerchandise == null) {
            return 0;
        }
        return bLiveMerchandise.quantity;
    }

    /* JADX INFO: renamed from: i0 */
    public final void m8742i0(View view) {
        jcs.m15871a(this, view);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: l0 */
    public void m8743l0(boolean z, Drawable drawable, Drawable drawable2) {
        if (z) {
            setBackground(drawable);
        } else {
            setBackground(drawable2);
        }
    }

    /* JADX INFO: renamed from: m0 */
    public void m8744m0(boolean z) {
        m8743l0(z, kvc0.b(i3c0.f12874m7), kvc0.b(i3c0.f12886n7));
        m8745n0(z, kvc0.a(h1c0.f11823s0), kvc0.a(h1c0.f11757U0), kvc0.a(h1c0.f11823s0), kvc0.a(h1c0.f11765Y0));
    }

    /* JADX INFO: renamed from: n0 */
    public void m8745n0(boolean z, @ColorInt int i, @ColorInt int i2, @ColorInt int i3, @ColorInt int i4) {
        if (z) {
            setTitleTextColor(i);
            setSubTitleTextColor(i3);
        } else {
            setTitleTextColor(i2);
            setSubTitleTextColor(i4);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: o0 */
    public void m8746o0(final BLiveMerchandise bLiveMerchandise, final f30<BLiveMerchandise, LiveFastRechargeItem> f30Var) {
        this.f6921k = bLiveMerchandise;
        int i = bLiveMerchandise.quantity;
        if (i > 0) {
            this.f6916f.setText(String.valueOf(i));
        }
        double d = bLiveMerchandise.defaultStockKeepUnit.prices.price;
        this.f6917g.setText(w8u.t(u6n.a() ? R$string.f2619Ak : R$string.f3455ne));
        if (d > 0.0d) {
            String string = ypv.e.getString(R$string.f3158a2);
            if (ypv.a.H()) {
                string = bLiveMerchandise.defaultStockKeepUnit.prices.currencySymbol + " %s";
            }
            this.f6918h.setText(String.format(string, ypv.a.H() ? t0g0.e(d) : t0g0.d(d)));
        }
        boolean zM8740j0 = m8740j0(bLiveMerchandise);
        xdl0.M(this.f6919i, zM8740j0);
        xdl0.M(this.f6920j, !zM8740j0);
        setOnClickListener(new View.OnClickListener() { // from class: l.ics
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f13147a.m8741k0(f30Var, bLiveMerchandise, view);
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onFinishInflate() {
        super/*android.view.View*/.onFinishInflate();
        m8742i0(this);
    }

    /* JADX INFO: renamed from: p0 */
    public void m8747p0(boolean z) {
        xdl0.M(this.f6914d, z);
    }

    /* JADX INFO: renamed from: q0 */
    public void m8748q0(String str) {
        xdl0.M(this.f6915e, !TextUtils.isEmpty(str));
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.f6915e.setText(str);
    }

    public void setSubTitleTextColor(@ColorInt int i) {
        this.f6918h.setTextColor(i);
    }

    public void setTitleTextColor(@ColorInt int i) {
        this.f6916f.setTextColor(i);
        this.f6917g.setTextColor(i);
        this.f6919i.setTextColor(i);
    }

    public LiveFastRechargeItem(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public LiveFastRechargeItem(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
