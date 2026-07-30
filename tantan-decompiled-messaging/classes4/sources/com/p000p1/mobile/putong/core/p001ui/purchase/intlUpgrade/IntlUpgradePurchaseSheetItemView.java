package com.p000p1.mobile.putong.core.p001ui.purchase.intlUpgrade;

import android.content.Context;
import android.graphics.Color;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p000p1.mobile.putong.core.p001ui.purchase.C0190d;
import com.p1.mobile.putong.core.data.PurchaseType;
import com.p1.mobile.putong.core.pay.R;
import java.text.NumberFormat;
import l.d3c0;
import l.e30;
import l.ekp;
import l.eqh0;
import l.xdl0;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class IntlUpgradePurchaseSheetItemView extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public ConstraintLayout f2452a;

    /* JADX INFO: renamed from: b */
    public VText f2453b;

    /* JADX INFO: renamed from: c */
    public VText f2454c;

    /* JADX INFO: renamed from: d */
    public VText f2455d;

    /* JADX INFO: renamed from: e */
    public VText f2456e;

    /* JADX INFO: renamed from: f */
    public NumberFormat f2457f;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.purchase.intlUpgrade.IntlUpgradePurchaseSheetItemView$a */
    public static /* synthetic */ class C0193a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f2458a;

        static {
            int[] iArr = new int[PurchaseType.values().length];
            f2458a = iArr;
            try {
                iArr[PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f2458a[PurchaseType.TYPE_ULTRA_PREMIUM.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public IntlUpgradePurchaseSheetItemView(@NonNull Context context) {
        super(context);
        this.f2457f = NumberFormat.getNumberInstance();
    }

    /* JADX INFO: renamed from: b */
    public final void m4281b(View view) {
        ekp.a(this, view);
    }

    /* JADX INFO: renamed from: c */
    public void m4282c(final C0190d c0190d, int i, final e30<C0190d> e30Var, PurchaseType purchaseType, boolean z) {
        C0190d.a aVarM4088d = c0190d.m4088d() != null ? c0190d.m4088d() : c0190d.m4086b();
        int i2 = d3c0.D2;
        int[] iArr = C0193a.f2458a;
        int i3 = iArr[purchaseType.ordinal()];
        if (i3 != 1) {
            if (i3 == 2) {
                if (z) {
                    i2 = c0190d.m4096l() ? d3c0.M2 : d3c0.N2;
                } else {
                    i2 = c0190d.m4096l() ? d3c0.K2 : d3c0.L2;
                }
            }
        } else if (z) {
            i2 = c0190d.m4096l() ? d3c0.F2 : d3c0.G2;
        } else {
            i2 = c0190d.m4096l() ? d3c0.D2 : d3c0.E2;
        }
        this.f2452a.setBackgroundResource(i2);
        int color = Color.parseColor("#F9E7FF");
        int color2 = Color.parseColor("#F9E7FF");
        int color3 = Color.parseColor("#4DF9E7FF");
        int color4 = Color.parseColor("#000000");
        int i4 = d3c0.z;
        if (c0190d.m4096l()) {
            int i5 = iArr[purchaseType.ordinal()];
            if (i5 != 1) {
                if (i5 == 2) {
                    if (z) {
                        color = Color.parseColor("#3D2747");
                        color2 = Color.parseColor("#3D2747");
                        color3 = Color.parseColor("#4D000000");
                        color4 = Color.parseColor("#F9E7FF");
                        i4 = d3c0.F;
                    } else {
                        color = Color.parseColor("#F9E7FF");
                        color2 = Color.parseColor("#F9E7FF");
                        color3 = Color.parseColor("#4DF9E7FF");
                        color4 = Color.parseColor("#000000");
                        i4 = d3c0.H;
                    }
                }
            } else if (z) {
                color = Color.parseColor("#000000");
                color2 = Color.parseColor("#000000");
                color3 = Color.parseColor("#4D000000");
                color4 = Color.parseColor("#000000");
                i4 = d3c0.B;
            } else {
                color = Color.parseColor("#FFE7AA");
                color3 = Color.parseColor("#4DFFE7AA");
                color2 = Color.parseColor("#FFE7AA");
                color4 = Color.parseColor("#000000");
                i4 = d3c0.D;
            }
        } else {
            int i6 = iArr[purchaseType.ordinal()];
            if (i6 != 1) {
                if (i6 == 2) {
                    if (z) {
                        color = Color.parseColor("#3D2747");
                        color2 = Color.parseColor("#3D2747");
                        color3 = Color.parseColor("#4D000000");
                        color4 = Color.parseColor("#663D2747");
                        i4 = d3c0.G;
                    } else {
                        color = Color.parseColor("#80F9E7FF");
                        color3 = Color.parseColor("#4DF9E7FF");
                        color2 = Color.parseColor("#80F9E7FF");
                        color4 = Color.parseColor("#4DF9E7FF");
                        i4 = d3c0.I;
                    }
                }
            } else if (z) {
                color = Color.parseColor("#000000");
                color2 = Color.parseColor("#000000");
                color3 = Color.parseColor("#4D000000");
                color4 = Color.parseColor("#66000000");
                i4 = d3c0.C;
            } else {
                color = Color.parseColor("#80FFE7AA");
                color3 = Color.parseColor("#4DFFE7AA");
                color2 = Color.parseColor("#80FFE7AA");
                color4 = Color.parseColor("#4DFFE7AA");
                i4 = d3c0.E;
            }
        }
        this.f2454c.setTextColor(color2);
        this.f2453b.setTextColor(color4);
        this.f2455d.setTextColor(color);
        this.f2456e.setTextColor(color3);
        this.f2453b.setBackgroundResource(i4);
        this.f2454c.setTypeface(eqh0.c(3), 0);
        this.f2455d.setText(aVarM4088d.m4147g());
        this.f2454c.setText(String.format("%d %s", Integer.valueOf(aVarM4088d.m4171w()), aVarM4088d.m4172x()));
        this.f2457f.setMaximumFractionDigits(2);
        double d = Double.parseDouble(aVarM4088d.m4155k()) * ((double) aVarM4088d.m4171w());
        this.f2456e.setText(String.format("%s %s", aVarM4088d.m4149h(), this.f2457f.format(d)));
        VText vText = this.f2456e;
        vText.setPaintFlags(vText.getPaintFlags() | 16);
        double dM4168t = d - aVarM4088d.m4168t();
        String str = aVarM4088d.m4149h() + this.f2457f.format(dM4168t);
        xdl0.M(this.f2453b, dM4168t > 0.0d);
        this.f2453b.setText(String.format(getContext().getString(R.string.f6), " ".concat(str)));
        setOnClickListener(new View.OnClickListener() { // from class: l.dkp
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                e30Var.call(c0190d);
            }
        });
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m4281b(this);
    }

    public IntlUpgradePurchaseSheetItemView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f2457f = NumberFormat.getNumberInstance();
    }

    public IntlUpgradePurchaseSheetItemView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f2457f = NumberFormat.getNumberInstance();
    }

    public IntlUpgradePurchaseSheetItemView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.f2457f = NumberFormat.getNumberInstance();
    }
}
