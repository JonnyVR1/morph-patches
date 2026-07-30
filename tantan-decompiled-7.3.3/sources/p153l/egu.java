package p153l;

import android.graphics.drawable.Drawable;
import android.widget.TextView;
import com.p051p1.mobile.putong.data.User;
import java.util.Locale;

/* JADX INFO: loaded from: classes13.dex */
public class egu {
    /* JADX INFO: renamed from: a */
    public static void m120806a(boolean z, int i, TextView textView) {
        int i2 = z ? mbc0.f135681h : mbc0.f135667a;
        textView.setCompoundDrawablesWithIntrinsicBounds(textView.getContext().getDrawable(z ? mbc0.f135704s0 : mbc0.f135706t0), (Drawable) null, (Drawable) null, (Drawable) null);
        textView.setBackgroundResource(i2);
        textView.setText(i + "");
    }

    /* JADX INFO: renamed from: b */
    public static void m120807b(boolean z, int i, TextView textView) {
        textView.setBackgroundResource(z ? mbc0.f135683i : mbc0.f135669b);
        textView.setText(String.format(Locale.CHINA, "%d", Integer.valueOf(i)));
    }

    /* JADX INFO: renamed from: c */
    public static void m120808c(User user, TextView textView) {
        m120809d(user.isFemale(), user.age.intValue(), textView);
    }

    /* JADX INFO: renamed from: d */
    public static void m120809d(boolean z, int i, TextView textView) {
        int i2 = z ? mbc0.f135677f : mbc0.f135671c;
        textView.setCompoundDrawablesWithIntrinsicBounds(textView.getContext().getDrawable(z ? mbc0.f135700q0 : mbc0.f135702r0), (Drawable) null, (Drawable) null, (Drawable) null);
        textView.setBackgroundResource(i2);
        textView.setText(i + "");
    }
}
