package p153l;

import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import com.p051p1.mobile.putong.core.data.PurchaseType;

/* JADX INFO: loaded from: classes12.dex */
public final class qce {
    /* JADX INFO: renamed from: a */
    public static GradientDrawable m176119a() {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setStroke(qa00.m175859d(3.0f), Color.parseColor("#0F000000"));
        gradientDrawable.setCornerRadius(qa00.m175859d(16.0f));
        return gradientDrawable;
    }

    /* JADX INFO: renamed from: b */
    public static GradientDrawable m176120b(String str, String str2) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setColor(Color.parseColor(str));
        gradientDrawable.setStroke(qa00.m175859d(2.0f), Color.parseColor(str2));
        gradientDrawable.setCornerRadius(qa00.m175859d(16.0f));
        return gradientDrawable;
    }

    /* JADX INFO: renamed from: c */
    public static GradientDrawable m176121c(PurchaseType purchaseType) {
        return wib0.m206578v(purchaseType) ? m176120b("#E5DBE9", "#1A3D2747") : m176120b("#FFFBEE", "#F0EBDF");
    }
}
