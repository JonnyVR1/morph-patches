package p153l;

import android.widget.TextView;
import com.fasterxml.jackson.core.util.MinimalPrettyPrinter;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.feed.FeedModule;
import com.p051p1.mobile.putong.feed.newui.camera.momosdk.Video;

/* JADX INFO: loaded from: classes13.dex */
public class cai {

    /* JADX INFO: renamed from: c */
    public static int f80594c = 80;

    /* JADX INFO: renamed from: d */
    public static int f80595d = 6;

    /* JADX INFO: renamed from: e */
    public static int f80596e = 80;

    /* JADX INFO: renamed from: f */
    public static int f80597f = 6;

    /* JADX INFO: renamed from: a */
    public int f80598a;

    /* JADX INFO: renamed from: b */
    public int f80599b;

    public cai() {
        int iM105592y0 = bnl0.m105592y0() - qa00.m175859d(f80596e);
        this.f80598a = iM105592y0;
        this.f80599b = (iM105592y0 - (qa00.m175859d(f80597f) * 2)) / 3;
    }

    /* JADX INFO: renamed from: a */
    public static int m108493a(User user) {
        return FeedModule.f39700a.getResources().getColor(k9c0.f124469A);
    }

    /* JADX INFO: renamed from: b */
    public static int m108494b(User user) {
        return FeedModule.f39700a.getResources().getColor(k9c0.f124503e);
    }

    /* JADX INFO: renamed from: c */
    public static int m108495c(int i, int i2) {
        return ((bnl0.m105592y0() - qa00.m175859d(i)) - (qa00.m175859d(i2) * 2)) / 3;
    }

    /* JADX INFO: renamed from: d */
    public static int m108496d(int i) {
        return bnl0.m105592y0() - qa00.m175859d(i);
    }

    /* JADX INFO: renamed from: e */
    public static int[] m108497e(Video video) {
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
    public static float m108498f(TextView textView, int i, String str, float f) {
        while (true) {
            textView.setTextSize(f);
            if (textView.getPaint().measureText(str) <= i) {
                return f;
            }
            f = (float) (((double) f) - 0.1d);
        }
    }

    /* JADX INFO: renamed from: g */
    public static String m108499g(TextView textView, int i) {
        StringBuilder sb = new StringBuilder(MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR);
        while (textView.getPaint().measureText(sb.toString()) < i) {
            sb.append(MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR);
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: h */
    public static int m108500h(Video video) {
        int i = (int) video.frameRate;
        if (i <= 0) {
            return 30;
        }
        return i;
    }
}
