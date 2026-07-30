package p006l;

import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import com.p1.mobile.putong.core.data.PurchaseType;
import l.sab0;
import l.t100;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public final class mbe {
    /* JADX INFO: renamed from: a */
    public static GradientDrawable m19189a() {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setStroke(t100.d(3.0f), Color.parseColor("#0F000000"));
        gradientDrawable.setCornerRadius(t100.d(16.0f));
        return gradientDrawable;
    }

    /* JADX INFO: renamed from: b */
    public static GradientDrawable m19190b(String str, String str2) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setColor(Color.parseColor(str));
        gradientDrawable.setStroke(t100.d(2.0f), Color.parseColor(str2));
        gradientDrawable.setCornerRadius(t100.d(16.0f));
        return gradientDrawable;
    }

    /* JADX INFO: renamed from: c */
    public static GradientDrawable m19191c(PurchaseType purchaseType) {
        return sab0.v(purchaseType) ? m19190b("#E5DBE9", "#1A3D2747") : m19190b("#FFFBEE", "#F0EBDF");
    }
}
