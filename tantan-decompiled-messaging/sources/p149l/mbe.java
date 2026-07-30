package p149l;

import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import com.p046p1.mobile.putong.core.data.PurchaseType;

/* JADX INFO: loaded from: classes9.dex */
public final class mbe {
    /* JADX INFO: renamed from: a */
    public static GradientDrawable m153882a() {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setStroke(t100.m186890d(3.0f), Color.parseColor("#0F000000"));
        gradientDrawable.setCornerRadius(t100.m186890d(16.0f));
        return gradientDrawable;
    }

    /* JADX INFO: renamed from: b */
    public static GradientDrawable m153883b(String str, String str2) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setColor(Color.parseColor(str));
        gradientDrawable.setStroke(t100.m186890d(2.0f), Color.parseColor(str2));
        gradientDrawable.setCornerRadius(t100.m186890d(16.0f));
        return gradientDrawable;
    }

    /* JADX INFO: renamed from: c */
    public static GradientDrawable m153884c(PurchaseType purchaseType) {
        return sab0.m182904v(purchaseType) ? m153883b("#E5DBE9", "#1A3D2747") : m153883b("#FFFBEE", "#F0EBDF");
    }
}
