package p149l;

import android.graphics.Color;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.widget.ImageView;
import android.widget.TextView;
import p147v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class mra0 {
    /* JADX INFO: renamed from: a */
    public static void m156022a(TextView... textViewArr) {
        for (TextView textView : textViewArr) {
            if (textView != null) {
                textView.setTextColor(Color.parseColor("#212121"));
                textView.setTextSize(2, 18.0f);
                textView.setTypeface(Typeface.SANS_SERIF, 1);
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m156023b(VText vText, Drawable drawable, Drawable drawable2) {
        if (!TextUtils.isEmpty(vText.getText())) {
            drawable = drawable2;
        }
        vText.setCompoundDrawables(null, null, drawable, null);
    }

    /* JADX INFO: renamed from: c */
    public static void m156024c(VText vText, ImageView imageView) {
        if (TextUtils.isEmpty(vText.getText())) {
            imageView.setImageResource(x2c0.f189303El);
        } else {
            imageView.setImageResource(x2c0.f189367Gl);
        }
        if (TextUtils.isEmpty(vText.getText())) {
            vText.setTextSize(2, 16.0f);
        } else {
            vText.setTextSize(2, 14.0f);
        }
    }
}
