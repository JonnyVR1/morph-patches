package p149l;

import android.os.Looper;
import android.text.TextUtils;
import com.clevertap.android.sdk.Constants;
import java.util.Collection;

/* JADX INFO: loaded from: classes2.dex */
public class qwq0 {
    /* JADX INFO: renamed from: a */
    public static int m176890a(String str, int i) {
        if (!TextUtils.isEmpty(str)) {
            try {
                return Integer.parseInt(str);
            } catch (Exception unused) {
            }
        }
        return i;
    }

    /* JADX INFO: renamed from: b */
    public static long m176891b(String str, long j) {
        if (!TextUtils.isEmpty(str)) {
            try {
                return Long.parseLong(str);
            } catch (Exception unused) {
            }
        }
        return j;
    }

    /* JADX INFO: renamed from: c */
    public static boolean m176892c() {
        return Thread.currentThread() == Looper.getMainLooper().getThread();
    }

    /* JADX INFO: renamed from: d */
    public static boolean m176893d(Collection<?> collection) {
        return collection == null || collection.isEmpty();
    }

    /* JADX INFO: renamed from: e */
    public static int m176894e(String str, int i) {
        return !TextUtils.isEmpty(str) ? ((str.hashCode() / 10) * 10) + i : i;
    }

    /* JADX INFO: renamed from: l.qwq0$a */
    public static class C19600a {

        /* JADX INFO: renamed from: a */
        private final StringBuilder f156755a;

        /* JADX INFO: renamed from: b */
        private final String f156756b;

        /* JADX INFO: renamed from: c */
        private final String f156757c;

        public C19600a(String str, String str2) {
            this.f156755a = new StringBuilder();
            this.f156756b = str;
            this.f156757c = str2;
        }

        /* JADX INFO: renamed from: a */
        public C19600a m176895a(String str, Object obj) {
            if (!TextUtils.isEmpty(str)) {
                if (this.f156755a.length() > 0) {
                    this.f156755a.append(this.f156757c);
                }
                StringBuilder sb = this.f156755a;
                sb.append(str);
                sb.append(this.f156756b);
                sb.append(obj);
            }
            return this;
        }

        public String toString() {
            return this.f156755a.toString();
        }

        public C19600a() {
            this(":", Constants.SEPARATOR_COMMA);
        }
    }
}
