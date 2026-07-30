package p153l;

import com.clevertap.android.sdk.Constants;
import com.google.android.gms.common.api.Api;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.TreeSet;
import okio.ByteString;
import org.eclipse.jetty.http.HttpHeaderValues;
import org.eclipse.jetty.http.HttpHeaders;
import org.eclipse.jetty.http.HttpMethods;

/* JADX INFO: loaded from: classes2.dex */
public final class yml {

    /* JADX INFO: renamed from: a */
    public static final ByteString f200673a = ByteString.encodeUtf8("\"\\");

    /* JADX INFO: renamed from: b */
    public static final ByteString f200674b = ByteString.encodeUtf8("\t ,=");

    /* JADX INFO: renamed from: a */
    public static long m216698a(e0l e0lVar) {
        return m216707j(e0lVar.m118874d("Content-Length"));
    }

    /* JADX INFO: renamed from: b */
    public static long m216699b(i5d0 i5d0Var) {
        return m216698a(i5d0Var.m138659F());
    }

    /* JADX INFO: renamed from: c */
    public static boolean m216700c(i5d0 i5d0Var) {
        if (i5d0Var.m138668Z().m209022g().equals(HttpMethods.HEAD)) {
            return false;
        }
        int iM138673q = i5d0Var.m138673q();
        return (((iM138673q >= 100 && iM138673q < 200) || iM138673q == 204 || iM138673q == 304) && m216699b(i5d0Var) == -1 && !HttpHeaderValues.CHUNKED.equalsIgnoreCase(i5d0Var.m138675u(HttpHeaders.TRANSFER_ENCODING))) ? false : true;
    }

    /* JADX INFO: renamed from: d */
    public static boolean m216701d(e0l e0lVar) {
        return m216708k(e0lVar).contains("*");
    }

    /* JADX INFO: renamed from: e */
    public static boolean m216702e(i5d0 i5d0Var) {
        return m216701d(i5d0Var.m138659F());
    }

    /* JADX INFO: renamed from: f */
    public static int m216703f(String str, int i) {
        try {
            long j = Long.parseLong(str);
            if (j > 2147483647L) {
                return Api.BaseClientBuilder.API_PRIORITY_OTHER;
            }
            if (j < 0) {
                return 0;
            }
            return (int) j;
        } catch (NumberFormatException unused) {
            return i;
        }
    }

    /* JADX INFO: renamed from: g */
    public static void m216704g(eu6 eu6Var, rnl rnlVar, e0l e0lVar) {
        if (eu6Var == eu6.f95844a) {
            return;
        }
        List<du6> listM118072f = du6.m118072f(rnlVar, e0lVar);
        if (listM118072f.isEmpty()) {
            return;
        }
        eu6Var.mo122537b(rnlVar, listM118072f);
    }

    /* JADX INFO: renamed from: h */
    public static int m216705h(String str, int i, String str2) {
        while (i < str.length() && str2.indexOf(str.charAt(i)) == -1) {
            i++;
        }
        return i;
    }

    /* JADX INFO: renamed from: i */
    public static int m216706i(String str, int i) {
        char cCharAt;
        while (i < str.length() && ((cCharAt = str.charAt(i)) == ' ' || cCharAt == '\t')) {
            i++;
        }
        return i;
    }

    /* JADX INFO: renamed from: j */
    public static long m216707j(String str) {
        if (str == null) {
            return -1L;
        }
        try {
            return Long.parseLong(str);
        } catch (NumberFormatException unused) {
            return -1L;
        }
    }

    /* JADX INFO: renamed from: k */
    public static Set<String> m216708k(e0l e0lVar) {
        Set<String> treeSet = Collections.EMPTY_SET;
        int iM118878k = e0lVar.m118878k();
        for (int i = 0; i < iM118878k; i++) {
            if (HttpHeaders.VARY.equalsIgnoreCase(e0lVar.m118875f(i))) {
                String strM118880m = e0lVar.m118880m(i);
                if (treeSet.isEmpty()) {
                    treeSet = new TreeSet<>((Comparator<? super String>) String.CASE_INSENSITIVE_ORDER);
                }
                for (String str : strM118880m.split(Constants.SEPARATOR_COMMA)) {
                    treeSet.add(str.trim());
                }
            }
        }
        return treeSet;
    }

    /* JADX INFO: renamed from: l */
    public static Set<String> m216709l(i5d0 i5d0Var) {
        return m216708k(i5d0Var.m138659F());
    }

    /* JADX INFO: renamed from: m */
    public static e0l m216710m(e0l e0lVar, e0l e0lVar2) {
        Set<String> setM216708k = m216708k(e0lVar2);
        if (setM216708k.isEmpty()) {
            return zlk0.f204948c;
        }
        e0l.C16674a c16674a = new e0l.C16674a();
        int iM118878k = e0lVar.m118878k();
        for (int i = 0; i < iM118878k; i++) {
            String strM118875f = e0lVar.m118875f(i);
            if (setM216708k.contains(strM118875f)) {
                c16674a.m118882a(strM118875f, e0lVar.m118880m(i));
            }
        }
        return c16674a.m118886e();
    }

    /* JADX INFO: renamed from: n */
    public static e0l m216711n(i5d0 i5d0Var) {
        return m216710m(i5d0Var.m138663M().m138668Z().m209020e(), i5d0Var.m138659F());
    }

    /* JADX INFO: renamed from: o */
    public static boolean m216712o(i5d0 i5d0Var, e0l e0lVar, x1d0 x1d0Var) {
        for (String str : m216709l(i5d0Var)) {
            if (!Objects.equals(e0lVar.m118881n(str), x1d0Var.m209019d(str))) {
                return false;
            }
        }
        return true;
    }
}
