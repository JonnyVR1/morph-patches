package p149l;

import android.widget.TextView;
import com.fasterxml.jackson.core.util.MinimalPrettyPrinter;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.feed.FeedModule;
import com.p046p1.mobile.putong.feed.newui.camera.momosdk.Video;

/* JADX INFO: loaded from: classes12.dex */
public class n8i {

    /* JADX INFO: renamed from: c */
    public static int f137647c = 80;

    /* JADX INFO: renamed from: d */
    public static int f137648d = 6;

    /* JADX INFO: renamed from: e */
    public static int f137649e = 80;

    /* JADX INFO: renamed from: f */
    public static int f137650f = 6;

    /* JADX INFO: renamed from: a */
    public int f137651a;

    /* JADX INFO: renamed from: b */
    public int f137652b;

    public n8i() {
        int iM208412y0 = xdl0.m208412y0() - t100.m186890d(f137649e);
        this.f137651a = iM208412y0;
        this.f137652b = (iM208412y0 - (t100.m186890d(f137650f) * 2)) / 3;
    }

    /* JADX INFO: renamed from: a */
    public static int m158494a(User user) {
        return FeedModule.f38852a.getResources().getColor(e1c0.f88746A);
    }

    /* JADX INFO: renamed from: b */
    public static int m158495b(User user) {
        return FeedModule.f38852a.getResources().getColor(e1c0.f88780e);
    }

    /* JADX INFO: renamed from: c */
    public static int m158496c(int i, int i2) {
        return ((xdl0.m208412y0() - t100.m186890d(i)) - (t100.m186890d(i2) * 2)) / 3;
    }

    /* JADX INFO: renamed from: d */
    public static int m158497d(int i) {
        return xdl0.m208412y0() - t100.m186890d(i);
    }

    /* JADX INFO: renamed from: e */
    public static int[] m158498e(Video video) {
        int i = video.width;
        int i2 = video.height;
        if (i > 1000 && i2 > 1000) {
            if (i > i2) {
                i2 = 720;
                i = 1280;
            } else {
                i = 720;
                i2 = 1280;
            }
        }
        return new int[]{i, i2};
    }

    /* JADX INFO: renamed from: f */
    public static float m158499f(TextView textView, int i, String str, float f) {
        while (true) {
            textView.setTextSize(f);
            if (textView.getPaint().measureText(str) <= i) {
                return f;
            }
            f = (float) (((double) f) - 0.1d);
        }
    }

    /* JADX INFO: renamed from: g */
    public static String m158500g(TextView textView, int i) {
        StringBuilder sb = new StringBuilder(MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR);
        while (textView.getPaint().measureText(sb.toString()) < i) {
            sb.append(MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR);
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: h */
    public static int m158501h(Video video) {
        int i = (int) video.frameRate;
        if (i <= 0) {
            return 30;
        }
        return i;
    }
}
