package p002l;

import android.graphics.Color;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.widget.ImageView;
import android.widget.TextView;
import l.x2c0;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class mra0 {
    /* JADX INFO: renamed from: a */
    public static void m18142a(TextView... textViewArr) {
        for (TextView textView : textViewArr) {
            if (textView != null) {
                textView.setTextColor(Color.parseColor("#212121"));
                textView.setTextSize(2, 18.0f);
                textView.setTypeface(Typeface.SANS_SERIF, 1);
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m18143b(VText vText, Drawable drawable, Drawable drawable2) {
        if (!TextUtils.isEmpty(vText.getText())) {
            drawable = drawable2;
        }
        vText.setCompoundDrawables((Drawable) null, (Drawable) null, drawable, (Drawable) null);
    }

    /* JADX INFO: renamed from: c */
    public static void m18144c(VText vText, ImageView imageView) {
        if (TextUtils.isEmpty(vText.getText())) {
            imageView.setImageResource(x2c0.El);
        } else {
            imageView.setImageResource(x2c0.Gl);
        }
        if (TextUtils.isEmpty(vText.getText())) {
            vText.setTextSize(2, 16.0f);
        } else {
            vText.setTextSize(2, 14.0f);
        }
    }
}
