package com.p000p1.mobile.putong.core.p001ui.purchase;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.annotation.Nullable;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.data.SummarizedPrivilegePrice;
import com.p1.mobile.putong.core.pay.R;
import com.tantanapp.common.utils.NullChecker;
import l.b1c0;
import l.d3c0;
import l.e30;
import l.i0g0;
import l.id5;
import l.t100;
import l.xdl0;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class CoinPurchaseSheetItemView extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public LinearLayout f2171a;

    /* JADX INFO: renamed from: b */
    public VText f2172b;

    /* JADX INFO: renamed from: c */
    public VText f2173c;

    /* JADX INFO: renamed from: d */
    public VText f2174d;

    /* JADX INFO: renamed from: e */
    public VText f2175e;

    public CoinPurchaseSheetItemView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: b */
    public final void m3663b(View view) {
        id5.a(this, view);
    }

    /* JADX INFO: renamed from: c */
    public final Act m3664c() {
        return getContext();
    }

    /* JADX INFO: renamed from: d */
    public void m3665d(final C0190d c0190d, int i, final e30<C0190d> e30Var) {
        C0190d.a aVarM4086b = c0190d.m4097m() ? c0190d.m4086b() : c0190d.m4088d();
        boolean zXf = CoreModule.K().xf();
        VText vText = this.f2174d;
        if (zXf) {
            xdl0.C0(vText, t100.d(18.0f));
            this.f2174d.setAutoSizeTextTypeWithDefaults(1);
            this.f2174d.setAutoSizeTextTypeUniformWithConfiguration(9, 14, 1, 2);
        } else {
            xdl0.C0(vText, -2);
            this.f2174d.setSingleLine();
        }
        boolean zM4096l = c0190d.m4096l();
        LinearLayout linearLayout = this.f2171a;
        if (zM4096l) {
            linearLayout.setBackgroundResource(d3c0.G9);
        } else {
            linearLayout.setBackgroundResource(d3c0.F9);
        }
        if (NullChecker.a(aVarM4086b.m4173y())) {
            m3666e(aVarM4086b.m4173y(), c0190d.m4096l());
        } else {
            if (i == 2 && c0190d.m4096l()) {
                this.f2175e.setText(R.string.k9);
                this.f2175e.setBackgroundDrawable(m3664c().drawable(d3c0.H9));
                xdl0.M0(this.f2175e, true);
            } else {
                xdl0.M0(this.f2175e, false);
            }
            this.f2172b.setText(String.valueOf(aVarM4086b.m4171w()));
            this.f2173c.setText(aVarM4086b.m4172x());
            this.f2174d.setText(aVarM4086b.m4174z());
        }
        setOnClickListener(new View.OnClickListener() { // from class: l.hd5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                e30Var.call(c0190d);
            }
        });
    }

    /* JADX INFO: renamed from: e */
    public final void m3666e(SummarizedPrivilegePrice summarizedPrivilegePrice, boolean z) {
        this.f2172b.setText(String.format("x%s", Integer.valueOf(summarizedPrivilegePrice.num)));
        this.f2173c.setText(String.format("%s探探币", Integer.valueOf(summarizedPrivilegePrice.price)));
        int i = summarizedPrivilegePrice.originalPrice;
        if (i <= 0) {
            i = 1;
        }
        double d = ((double) ((summarizedPrivilegePrice.price * 1.0f) / i)) * 10.0d;
        this.f2174d.setText(d >= 10.0d ? "7天有效" : String.format("7天有效 %s折", i0g0.F(d, 1)));
        VText vText = this.f2174d;
        if (z) {
            vText.setTextColor(getResources().getColor(b1c0.l));
        } else {
            vText.setTextColor(getResources().getColor(b1c0.c));
        }
        VText vText2 = this.f2172b;
        int i2 = t100.o;
        xdl0.X(vText2, i2);
        VText vText3 = this.f2173c;
        int i3 = t100.h;
        xdl0.X(vText3, i3);
        xdl0.X(this.f2174d, i3);
        xdl0.U(this.f2174d, i2);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m3663b(this);
    }

    public CoinPurchaseSheetItemView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public CoinPurchaseSheetItemView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
