package com.p046p1.mobile.putong.core.p053ui.purchase.intlUpgrade;

import android.content.Context;
import android.graphics.Color;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.clevertap.android.sdk.Constants;
import com.fasterxml.jackson.core.util.MinimalPrettyPrinter;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.p046p1.mobile.putong.core.data.PurchaseType;
import com.p046p1.mobile.putong.core.p053ui.purchase.C8765d;
import com.p046p1.mobile.putong.core.pay.R$string;
import java.text.NumberFormat;
import p147v.VText;
import p149l.d3c0;
import p149l.e30;
import p149l.ekp;
import p149l.eqh0;
import p149l.xdl0;

/* JADX INFO: loaded from: classes4.dex */
public class IntlUpgradePurchaseSheetItemView extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public ConstraintLayout f34630a;

    /* JADX INFO: renamed from: b */
    public VText f34631b;

    /* JADX INFO: renamed from: c */
    public VText f34632c;

    /* JADX INFO: renamed from: d */
    public VText f34633d;

    /* JADX INFO: renamed from: e */
    public VText f34634e;

    /* JADX INFO: renamed from: f */
    public NumberFormat f34635f;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.purchase.intlUpgrade.IntlUpgradePurchaseSheetItemView$a */
    public static /* synthetic */ class C8768a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f34636a;

        static {
            int[] iArr = new int[PurchaseType.values().length];
            f34636a = iArr;
            try {
                iArr[PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f34636a[PurchaseType.TYPE_ULTRA_PREMIUM.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public IntlUpgradePurchaseSheetItemView(@NonNull Context context) {
        super(context);
        this.f34635f = NumberFormat.getNumberInstance();
    }

    /* JADX INFO: renamed from: b */
    public final void m53715b(View view) {
        ekp.m116990a(this, view);
    }

    /* JADX INFO: renamed from: c */
    public void m53716c(final C8765d c8765d, int i, final e30<C8765d> e30Var, PurchaseType purchaseType, boolean z) {
        C8765d.a aVarM53522d = c8765d.m53522d() != null ? c8765d.m53522d() : c8765d.m53520b();
        int i2 = d3c0.f83532D2;
        int[] iArr = C8768a.f34636a;
        int i3 = iArr[purchaseType.ordinal()];
        if (i3 != 1) {
            if (i3 == 2) {
                if (z) {
                    i2 = c8765d.m53530l() ? d3c0.f83658M2 : d3c0.f83672N2;
                } else {
                    i2 = c8765d.m53530l() ? d3c0.f83630K2 : d3c0.f83644L2;
                }
            }
        } else if (z) {
            i2 = c8765d.m53530l() ? d3c0.f83560F2 : d3c0.f83574G2;
        } else {
            i2 = c8765d.m53530l() ? d3c0.f83532D2 : d3c0.f83546E2;
        }
        this.f34630a.setBackgroundResource(i2);
        int color = Color.parseColor("#F9E7FF");
        int color2 = Color.parseColor("#F9E7FF");
        int color3 = Color.parseColor("#4DF9E7FF");
        int color4 = Color.parseColor(Constants.BLACK);
        int i4 = d3c0.f84191z;
        if (c8765d.m53530l()) {
            int i5 = iArr[purchaseType.ordinal()];
            if (i5 != 1) {
                if (i5 == 2) {
                    if (z) {
                        color = Color.parseColor("#3D2747");
                        color2 = Color.parseColor("#3D2747");
                        color3 = Color.parseColor("#4D000000");
                        color4 = Color.parseColor("#F9E7FF");
                        i4 = d3c0.f83557F;
                    } else {
                        color = Color.parseColor("#F9E7FF");
                        color2 = Color.parseColor("#F9E7FF");
                        color3 = Color.parseColor("#4DF9E7FF");
                        color4 = Color.parseColor(Constants.BLACK);
                        i4 = d3c0.f83585H;
                    }
                }
            } else if (z) {
                color = Color.parseColor(Constants.BLACK);
                color2 = Color.parseColor(Constants.BLACK);
                color3 = Color.parseColor("#4D000000");
                color4 = Color.parseColor(Constants.BLACK);
                i4 = d3c0.f83501B;
            } else {
                color = Color.parseColor("#FFE7AA");
                color3 = Color.parseColor("#4DFFE7AA");
                color2 = Color.parseColor("#FFE7AA");
                color4 = Color.parseColor(Constants.BLACK);
                i4 = d3c0.f83529D;
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
                        i4 = d3c0.f83571G;
                    } else {
                        color = Color.parseColor("#80F9E7FF");
                        color3 = Color.parseColor("#4DF9E7FF");
                        color2 = Color.parseColor("#80F9E7FF");
                        color4 = Color.parseColor("#4DF9E7FF");
                        i4 = d3c0.f83599I;
                    }
                }
            } else if (z) {
                color = Color.parseColor(Constants.BLACK);
                color2 = Color.parseColor(Constants.BLACK);
                color3 = Color.parseColor("#4D000000");
                color4 = Color.parseColor("#66000000");
                i4 = d3c0.f83515C;
            } else {
                color = Color.parseColor("#80FFE7AA");
                color3 = Color.parseColor("#4DFFE7AA");
                color2 = Color.parseColor("#80FFE7AA");
                color4 = Color.parseColor("#4DFFE7AA");
                i4 = d3c0.f83543E;
            }
        }
        this.f34632c.setTextColor(color2);
        this.f34631b.setTextColor(color4);
        this.f34633d.setTextColor(color);
        this.f34634e.setTextColor(color3);
        this.f34631b.setBackgroundResource(i4);
        this.f34632c.setTypeface(eqh0.m117752c(3), 0);
        this.f34633d.setText(aVarM53522d.m53581g());
        this.f34632c.setText(String.format("%d %s", Integer.valueOf(aVarM53522d.m53605w()), aVarM53522d.m53606x()));
        this.f34635f.setMaximumFractionDigits(2);
        double d = Double.parseDouble(aVarM53522d.m53589k()) * ((double) aVarM53522d.m53605w());
        this.f34634e.setText(String.format("%s %s", aVarM53522d.m53583h(), this.f34635f.format(d)));
        VText vText = this.f34634e;
        vText.setPaintFlags(vText.getPaintFlags() | 16);
        double dM53602t = d - aVarM53522d.m53602t();
        String str = aVarM53522d.m53583h() + this.f34635f.format(dM53602t);
        xdl0.m208344M(this.f34631b, dM53602t > FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE);
        this.f34631b.setText(String.format(getContext().getString(R$string.f27443f6), MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR.concat(str)));
        setOnClickListener(new View.OnClickListener() { // from class: l.dkp
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                e30Var.call(c8765d);
            }
        });
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m53715b(this);
    }

    public IntlUpgradePurchaseSheetItemView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f34635f = NumberFormat.getNumberInstance();
    }

    public IntlUpgradePurchaseSheetItemView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f34635f = NumberFormat.getNumberInstance();
    }

    public IntlUpgradePurchaseSheetItemView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.f34635f = NumberFormat.getNumberInstance();
    }
}
