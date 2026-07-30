package com.p046p1.mobile.putong.live.external.internal.vchat.view;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.ColorInt;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.p046p1.mobile.putong.live.base.data.BLiveMerchandise;
import com.p046p1.mobile.putong.live.livingroom.R$string;
import p147v.VText;
import p149l.f30;
import p149l.h1c0;
import p149l.i3c0;
import p149l.kvc0;
import p149l.lqu;
import p149l.t0g0;
import p149l.xdl0;
import p149l.ypv;

/* JADX INFO: loaded from: classes13.dex */
public class LiveVChatRechargeItemView extends ConstraintLayout {

    /* JADX INFO: renamed from: d */
    public VText f45423d;

    /* JADX INFO: renamed from: e */
    public VText f45424e;

    /* JADX INFO: renamed from: f */
    public VText f45425f;

    /* JADX INFO: renamed from: g */
    public VText f45426g;

    /* JADX INFO: renamed from: h */
    public Group f45427h;

    /* JADX INFO: renamed from: i */
    public BLiveMerchandise f45428i;

    public LiveVChatRechargeItemView(Context context) {
        super(context);
    }

    public BLiveMerchandise getCurrentRechargeModule() {
        return this.f45428i;
    }

    public int getTTPrice() {
        BLiveMerchandise bLiveMerchandise = this.f45428i;
        if (bLiveMerchandise == null) {
            return 0;
        }
        return bLiveMerchandise.quantity;
    }

    /* JADX INFO: renamed from: i0 */
    public final void m69782i0(View view) {
        lqu.m151092a(this, view);
    }

    /* JADX INFO: renamed from: j0 */
    public final boolean m69783j0(BLiveMerchandise bLiveMerchandise) {
        return (bLiveMerchandise == null || !bLiveMerchandise.isCustomRecharge || bLiveMerchandise.isCustomRechargeInput) ? false : true;
    }

    /* JADX INFO: renamed from: k0 */
    public final /* synthetic */ void m69784k0(f30 f30Var, BLiveMerchandise bLiveMerchandise, View view) {
        f30Var.call(bLiveMerchandise, this);
    }

    /* JADX INFO: renamed from: l0 */
    public void m69785l0(boolean z, Drawable drawable, Drawable drawable2) {
        if (z) {
            setBackground(drawable);
        } else {
            setBackground(drawable2);
        }
    }

    /* JADX INFO: renamed from: m0 */
    public void m69786m0(boolean z) {
        m69785l0(z, kvc0.m147353b(i3c0.f111089m7), kvc0.m147353b(i3c0.f111101n7));
        m69787n0(z, kvc0.m147352a(h1c0.f105403s0), kvc0.m147352a(h1c0.f105337U0), kvc0.m147352a(h1c0.f105403s0), kvc0.m147352a(h1c0.f105345Y0));
    }

    /* JADX INFO: renamed from: n0 */
    public void m69787n0(boolean z, @ColorInt int i, @ColorInt int i2, @ColorInt int i3, @ColorInt int i4) {
        if (z) {
            setTitleTextColor(i);
            setSubTitleTextColor(i3);
        } else {
            setTitleTextColor(i2);
            setSubTitleTextColor(i4);
        }
    }

    /* JADX INFO: renamed from: o0 */
    public void m69788o0(final BLiveMerchandise bLiveMerchandise, final f30<BLiveMerchandise, LiveVChatRechargeItemView> f30Var) {
        this.f45428i = bLiveMerchandise;
        int i = bLiveMerchandise.quantity;
        if (i > 0) {
            this.f45423d.setText(String.valueOf(i));
        }
        double d = bLiveMerchandise.defaultStockKeepUnit.prices.price;
        if (d > FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
            this.f45425f.setText(String.format(ypv.f199497e.getString(R$string.f47116a2), t0g0.m186863d(d)));
        }
        boolean zM69783j0 = m69783j0(bLiveMerchandise);
        xdl0.m208344M(this.f45426g, zM69783j0);
        xdl0.m208344M(this.f45427h, !zM69783j0);
        setOnClickListener(new View.OnClickListener() { // from class: l.kqu
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f124293a.m69784k0(f30Var, bLiveMerchandise, view);
            }
        });
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m69782i0(this);
    }

    public void setSubTitleTextColor(@ColorInt int i) {
        this.f45425f.setTextColor(i);
    }

    public void setTitleTextColor(@ColorInt int i) {
        this.f45423d.setTextColor(i);
        this.f45424e.setTextColor(i);
        this.f45426g.setTextColor(i);
    }

    public LiveVChatRechargeItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public LiveVChatRechargeItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
