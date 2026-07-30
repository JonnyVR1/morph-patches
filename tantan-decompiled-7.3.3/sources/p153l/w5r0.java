package p153l;

import android.os.Looper;
import android.text.TextUtils;
import com.clevertap.android.sdk.Constants;
import java.util.Collection;

/* JADX INFO: loaded from: classes2.dex */
public class w5r0 {
    /* JADX INFO: renamed from: a */
    public static int m204982a(String str, int i) {
        if (!TextUtils.isEmpty(str)) {
            try {
                return Integer.parseInt(str);
            } catch (Exception unused) {
            }
        }
        return i;
    }

    /* JADX INFO: renamed from: b */
    public static long m204983b(String str, long j) {
        if (!TextUtils.isEmpty(str)) {
            try {
                return Long.parseLong(str);
            } catch (Exception unused) {
            }
        }
        return j;
    }

    /* JADX INFO: renamed from: c */
    public static boolean m204984c() {
        return Thread.currentThread() == Looper.getMainLooper().getThread();
    }

    /* JADX INFO: renamed from: d */
    public static boolean m204985d(Collection<?> collection) {
        return collection == null || collection.isEmpty();
    }

    /* JADX INFO: renamed from: e */
    public static int m204986e(String str, int i) {
        return !TextUtils.isEmpty(str) ? ((str.hashCode() / 10) * 10) + i : i;
    }

    /* JADX INFO: renamed from: l.w5r0$a */
    public static class C21029a {

        /* JADX INFO: renamed from: a */
        private final StringBuilder f187543a;

        /* JADX INFO: renamed from: b */
        private final String f187544b;

        /* JADX INFO: renamed from: c */
        private final String f187545c;

        public C21029a(String str, String str2) {
            this.f187543a = new StringBuilder();
            this.f187544b = str;
            this.f187545c = str2;
        }

        /* JADX INFO: renamed from: a */
        public C21029a m204987a(String str, Object obj) {
            if (!TextUtils.isEmpty(str)) {
                if (this.f187543a.length() > 0) {
                    this.f187543a.append(this.f187545c);
                }
                StringBuilder sb = this.f187543a;
                sb.append(str);
                sb.append(this.f187544b);
                sb.append(obj);
            }
            return this;
        }

        public String toString() {
            return this.f187543a.toString();
        }

        public C21029a() {
            this(":", Constants.SEPARATOR_COMMA);
        }
    }
}
