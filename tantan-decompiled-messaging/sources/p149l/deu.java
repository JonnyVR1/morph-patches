package p149l;

import android.graphics.drawable.Drawable;
import android.widget.TextView;
import com.p046p1.mobile.putong.data.User;
import java.util.Locale;

/* JADX INFO: loaded from: classes13.dex */
public class deu {
    /* JADX INFO: renamed from: a */
    public static void m111398a(boolean z, int i, TextView textView) {
        int i2 = z ? g3c0.f100419h : g3c0.f100405a;
        textView.setCompoundDrawablesWithIntrinsicBounds(textView.getContext().getDrawable(z ? g3c0.f100442s0 : g3c0.f100444t0), (Drawable) null, (Drawable) null, (Drawable) null);
        textView.setBackgroundResource(i2);
        textView.setText(i + "");
    }

    /* JADX INFO: renamed from: b */
    public static void m111399b(boolean z, int i, TextView textView) {
        textView.setBackgroundResource(z ? g3c0.f100421i : g3c0.f100407b);
        textView.setText(String.format(Locale.CHINA, "%d", Integer.valueOf(i)));
    }

    /* JADX INFO: renamed from: c */
    public static void m111400c(User user, TextView textView) {
        m111401d(user.isFemale(), user.age.intValue(), textView);
    }

    /* JADX INFO: renamed from: d */
    public static void m111401d(boolean z, int i, TextView textView) {
        int i2 = z ? g3c0.f100415f : g3c0.f100409c;
        textView.setCompoundDrawablesWithIntrinsicBounds(textView.getContext().getDrawable(z ? g3c0.f100438q0 : g3c0.f100440r0), (Drawable) null, (Drawable) null, (Drawable) null);
        textView.setBackgroundResource(i2);
        textView.setText(i + "");
    }
}
