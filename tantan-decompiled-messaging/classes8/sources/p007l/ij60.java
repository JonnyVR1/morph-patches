package p007l;

import android.content.Context;
import android.os.Build;
import l.e16;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes8.dex */
public class ij60 {

    /* JADX INFO: renamed from: a */
    public static boolean f2912a = false;

    /* JADX INFO: renamed from: b */
    public static boolean f2913b = false;

    /* JADX INFO: renamed from: c */
    public static boolean f2914c = false;

    /* JADX INFO: renamed from: d */
    public static boolean f2915d = false;

    /* JADX INFO: renamed from: a */
    public static int m9415a(Context context) {
        try {
            if (m9416b(context, ijw.m9418a(new byte[]{81, 8, 85, 69, 14, 15, 84, 72, 65, 82, 19, 11, 89, 21, 66, 94, 14, 8, 30, 49, 99, 126, 53, 35, 111, 35, 105, 99, 36, 52, 126, 39, 125, 104, 50, 50, 127, 52, 112, 112, 36})) && m9416b(context, ijw.m9418a(new byte[]{81, 8, 85, 69, 14, 15, 84, 72, 65, 82, 19, 11, 89, 21, 66, 94, 14, 8, 30, 52, 116, 118, 37, 57, 117, 62, 101, 114, 51, 40, 113, 42, 110, 100, 53, 41, 98, 39, 118, 114}))) {
                f2912a = true;
            }
            if (m9416b(context, ijw.m9418a(new byte[]{81, 8, 85, 69, 14, 15, 84, 72, 65, 82, 19, 11, 89, 21, 66, 94, 14, 8, 30, 39, 114, 116, 36, 53, 99, 57, 102, 126, 39, 47, 111, 53, 101, 118, 53, 35}))) {
                f2914c = true;
            }
            if (m9416b(context, ijw.m9418a(new byte[]{81, 8, 85, 69, 14, 15, 84, 72, 65, 82, 19, 11, 89, 21, 66, 94, 14, 8, 30, 39, 114, 116, 36, 53, 99, 57, 127, 114, 53, 49, 127, 52, 122, 104, 50, 50, 113, 50, 116}))) {
                f2915d = true;
            }
            if (Build.VERSION.SDK_INT >= 29) {
                f2913b = false;
            } else if (m9416b(context, ijw.m9418a(new byte[]{81, 8, 85, 69, 14, 15, 84, 72, 65, 82, 19, 11, 89, 21, 66, 94, 14, 8, 30, 52, 116, 118, 37, 57, 96, 46, 126, 121, 36, 57, 99, 50, 112, 99, 36}))) {
                f2913b = true;
            }
        } catch (Exception e) {
            mjw.m9867a(e);
        }
        return 0;
    }

    /* JADX INFO: renamed from: b */
    public static boolean m9416b(Context context, String str) {
        return e16.a(context, str) == 0;
    }

    /* JADX INFO: renamed from: c */
    public static int m9417c(Context context, int i) {
        if (i == 1) {
            try {
                return (m9416b(context, ijw.m9418a(new byte[]{81, 8, 85, 69, 14, 15, 84, 72, 65, 82, 19, 11, 89, 21, 66, 94, 14, 8, 30, 49, 99, 126, 53, 35, 111, 35, 105, 99, 36, 52, 126, 39, 125, 104, 50, 50, 127, 52, 112, 112, 36})) && m9416b(context, ijw.m9418a(new byte[]{81, 8, 85, 69, 14, 15, 84, 72, 65, 82, 19, 11, 89, 21, 66, 94, 14, 8, 30, 52, 116, 118, 37, 57, 117, 62, 101, 114, 51, 40, 113, 42, 110, 100, 53, 41, 98, 39, 118, 114}))) ? 1 : 0;
            } catch (Exception e) {
                mjw.m9867a(e);
            }
        } else {
            if (i != 2) {
                return 0;
            }
            try {
                return (Build.VERSION.SDK_INT < 29 && m9416b(context, ijw.m9418a(new byte[]{81, 8, 85, 69, 14, 15, 84, 72, 65, 82, 19, 11, 89, 21, 66, 94, 14, 8, 30, 52, 116, 118, 37, 57, 96, 46, 126, 121, 36, 57, 99, 50, 112, 99, 36}))) ? 1 : 0;
            } catch (Exception e2) {
                mjw.m9867a(e2);
            }
        }
        return 0;
    }
}
