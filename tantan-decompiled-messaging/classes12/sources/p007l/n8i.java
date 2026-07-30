package p007l;

import android.widget.TextView;
import com.p000p1.mobile.putong.data.User;
import com.p000p1.mobile.putong.feed.FeedModule;
import com.p000p1.mobile.putong.feed.newui.camera.momosdk.Video;
import l.t100;
import l.xdl0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class n8i {

    /* JADX INFO: renamed from: c */
    public static int f10701c = 80;

    /* JADX INFO: renamed from: d */
    public static int f10702d = 6;

    /* JADX INFO: renamed from: e */
    public static int f10703e = 80;

    /* JADX INFO: renamed from: f */
    public static int f10704f = 6;

    /* JADX INFO: renamed from: a */
    public int f10705a;

    /* JADX INFO: renamed from: b */
    public int f10706b;

    public n8i() {
        int iY0 = xdl0.y0() - t100.d(f10703e);
        this.f10705a = iY0;
        this.f10706b = (iY0 - (t100.d(f10704f) * 2)) / 3;
    }

    /* JADX INFO: renamed from: a */
    public static int m12107a(User user) {
        return FeedModule.f313a.getResources().getColor(e1c0.f7102A);
    }

    /* JADX INFO: renamed from: b */
    public static int m12108b(User user) {
        return FeedModule.f313a.getResources().getColor(e1c0.f7136e);
    }

    /* JADX INFO: renamed from: c */
    public static int m12109c(int i, int i2) {
        return ((xdl0.y0() - t100.d(i)) - (t100.d(i2) * 2)) / 3;
    }

    /* JADX INFO: renamed from: d */
    public static int m12110d(int i) {
        return xdl0.y0() - t100.d(i);
    }

    /* JADX INFO: renamed from: e */
    public static int[] m12111e(Video video) {
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
    public static float m12112f(TextView textView, int i, String str, float f) {
        while (true) {
            textView.setTextSize(f);
            if (textView.getPaint().measureText(str) <= i) {
                return f;
            }
            f = (float) (((double) f) - 0.1d);
        }
    }

    /* JADX INFO: renamed from: g */
    public static String m12113g(TextView textView, int i) {
        StringBuilder sb = new StringBuilder(" ");
        while (textView.getPaint().measureText(sb.toString()) < i) {
            sb.append(" ");
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: h */
    public static int m12114h(Video video) {
        int i = (int) video.frameRate;
        if (i <= 0) {
            return 30;
        }
        return i;
    }
}
