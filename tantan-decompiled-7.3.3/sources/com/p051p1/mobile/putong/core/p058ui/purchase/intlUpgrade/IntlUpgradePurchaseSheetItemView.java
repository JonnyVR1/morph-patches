package com.p051p1.mobile.putong.core.p058ui.purchase.intlUpgrade;

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
import com.p051p1.mobile.putong.core.data.PurchaseType;
import com.p051p1.mobile.putong.core.p058ui.purchase.C8928d;
import com.p051p1.mobile.putong.core.pay.R$string;
import java.text.NumberFormat;
import p151v.VText;
import p153l.bnl0;
import p153l.emp;
import p153l.jbc0;
import p153l.lyh0;
import p153l.y20;

/* JADX INFO: loaded from: classes4.dex */
public class IntlUpgradePurchaseSheetItemView extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public ConstraintLayout f35478a;

    /* JADX INFO: renamed from: b */
    public VText f35479b;

    /* JADX INFO: renamed from: c */
    public VText f35480c;

    /* JADX INFO: renamed from: d */
    public VText f35481d;

    /* JADX INFO: renamed from: e */
    public VText f35482e;

    /* JADX INFO: renamed from: f */
    public NumberFormat f35483f;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.purchase.intlUpgrade.IntlUpgradePurchaseSheetItemView$a */
    public static /* synthetic */ class C8931a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f35484a;

        static {
            int[] iArr = new int[PurchaseType.values().length];
            f35484a = iArr;
            try {
                iArr[PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f35484a[PurchaseType.TYPE_ULTRA_PREMIUM.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public IntlUpgradePurchaseSheetItemView(@NonNull Context context) {
        super(context);
        this.f35483f = NumberFormat.getNumberInstance();
    }

    /* JADX INFO: renamed from: b */
    public final void m54898b(View view) {
        emp.m121372a(this, view);
    }

    /* JADX INFO: renamed from: c */
    public void m54899c(final C8928d c8928d, int i, final y20<C8928d> y20Var, PurchaseType purchaseType, boolean z) {
        C8928d.a aVarM54705d = c8928d.m54705d() != null ? c8928d.m54705d() : c8928d.m54703b();
        int i2 = jbc0.f119187D2;
        int[] iArr = C8931a.f35484a;
        int i3 = iArr[purchaseType.ordinal()];
        if (i3 != 1) {
            if (i3 == 2) {
                if (z) {
                    i2 = c8928d.m54713l() ? jbc0.f119313M2 : jbc0.f119327N2;
                } else {
                    i2 = c8928d.m54713l() ? jbc0.f119285K2 : jbc0.f119299L2;
                }
            }
        } else if (z) {
            i2 = c8928d.m54713l() ? jbc0.f119215F2 : jbc0.f119229G2;
        } else {
            i2 = c8928d.m54713l() ? jbc0.f119187D2 : jbc0.f119201E2;
        }
        this.f35478a.setBackgroundResource(i2);
        int color = Color.parseColor("#F9E7FF");
        int color2 = Color.parseColor("#F9E7FF");
        int color3 = Color.parseColor("#4DF9E7FF");
        int color4 = Color.parseColor(Constants.BLACK);
        int i4 = jbc0.f119846z;
        if (c8928d.m54713l()) {
            int i5 = iArr[purchaseType.ordinal()];
            if (i5 != 1) {
                if (i5 == 2) {
                    if (z) {
                        color = Color.parseColor("#3D2747");
                        color2 = Color.parseColor("#3D2747");
                        color3 = Color.parseColor("#4D000000");
                        color4 = Color.parseColor("#F9E7FF");
                        i4 = jbc0.f119212F;
                    } else {
                        color = Color.parseColor("#F9E7FF");
                        color2 = Color.parseColor("#F9E7FF");
                        color3 = Color.parseColor("#4DF9E7FF");
                        color4 = Color.parseColor(Constants.BLACK);
                        i4 = jbc0.f119240H;
                    }
                }
            } else if (z) {
                color = Color.parseColor(Constants.BLACK);
                color2 = Color.parseColor(Constants.BLACK);
                color3 = Color.parseColor("#4D000000");
                color4 = Color.parseColor(Constants.BLACK);
                i4 = jbc0.f119156B;
            } else {
                color = Color.parseColor("#FFE7AA");
                color3 = Color.parseColor("#4DFFE7AA");
                color2 = Color.parseColor("#FFE7AA");
                color4 = Color.parseColor(Constants.BLACK);
                i4 = jbc0.f119184D;
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
                        i4 = jbc0.f119226G;
                    } else {
                        color = Color.parseColor("#80F9E7FF");
                        color3 = Color.parseColor("#4DF9E7FF");
                        color2 = Color.parseColor("#80F9E7FF");
                        color4 = Color.parseColor("#4DF9E7FF");
                        i4 = jbc0.f119254I;
                    }
                }
            } else if (z) {
                color = Color.parseColor(Constants.BLACK);
                color2 = Color.parseColor(Constants.BLACK);
                color3 = Color.parseColor("#4D000000");
                color4 = Color.parseColor("#66000000");
                i4 = jbc0.f119170C;
            } else {
                color = Color.parseColor("#80FFE7AA");
                color3 = Color.parseColor("#4DFFE7AA");
                color2 = Color.parseColor("#80FFE7AA");
                color4 = Color.parseColor("#4DFFE7AA");
                i4 = jbc0.f119198E;
            }
        }
        this.f35480c.setTextColor(color2);
        this.f35479b.setTextColor(color4);
        this.f35481d.setTextColor(color);
        this.f35482e.setTextColor(color3);
        this.f35479b.setBackgroundResource(i4);
        this.f35480c.setTypeface(lyh0.m156283c(3), 0);
        this.f35481d.setText(aVarM54705d.m54764g());
        this.f35480c.setText(String.format("%d %s", Integer.valueOf(aVarM54705d.m54788w()), aVarM54705d.m54789x()));
        this.f35483f.setMaximumFractionDigits(2);
        double d = Double.parseDouble(aVarM54705d.m54772k()) * ((double) aVarM54705d.m54788w());
        this.f35482e.setText(String.format("%s %s", aVarM54705d.m54766h(), this.f35483f.format(d)));
        VText vText = this.f35482e;
        vText.setPaintFlags(vText.getPaintFlags() | 16);
        double dM54785t = d - aVarM54705d.m54785t();
        String str = aVarM54705d.m54766h() + this.f35483f.format(dM54785t);
        bnl0.m105524M(this.f35479b, dM54785t > FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE);
        this.f35479b.setText(String.format(getContext().getString(R$string.f28291f6), MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR.concat(str)));
        setOnClickListener(new View.OnClickListener() { // from class: l.dmp
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                y20Var.call(c8928d);
            }
        });
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m54898b(this);
    }

    public IntlUpgradePurchaseSheetItemView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f35483f = NumberFormat.getNumberInstance();
    }

    public IntlUpgradePurchaseSheetItemView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f35483f = NumberFormat.getNumberInstance();
    }

    public IntlUpgradePurchaseSheetItemView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.f35483f = NumberFormat.getNumberInstance();
    }
}
