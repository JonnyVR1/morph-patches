package p149l;

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
public final class kkl {

    /* JADX INFO: renamed from: a */
    public static final ByteString f123569a = ByteString.encodeUtf8("\"\\");

    /* JADX INFO: renamed from: b */
    public static final ByteString f123570b = ByteString.encodeUtf8("\t ,=");

    /* JADX INFO: renamed from: a */
    public static long m146333a(oxk oxkVar) {
        return m146342j(oxkVar.m166555d("Content-Length"));
    }

    /* JADX INFO: renamed from: b */
    public static long m146334b(exc0 exc0Var) {
        return m146333a(exc0Var.m118595F());
    }

    /* JADX INFO: renamed from: c */
    public static boolean m146335c(exc0 exc0Var) {
        if (exc0Var.m118604Y().m185877g().equals(HttpMethods.HEAD)) {
            return false;
        }
        int iM118609q = exc0Var.m118609q();
        return (((iM118609q >= 100 && iM118609q < 200) || iM118609q == 204 || iM118609q == 304) && m146334b(exc0Var) == -1 && !HttpHeaderValues.CHUNKED.equalsIgnoreCase(exc0Var.m118611u(HttpHeaders.TRANSFER_ENCODING))) ? false : true;
    }

    /* JADX INFO: renamed from: d */
    public static boolean m146336d(oxk oxkVar) {
        return m146343k(oxkVar).contains("*");
    }

    /* JADX INFO: renamed from: e */
    public static boolean m146337e(exc0 exc0Var) {
        return m146336d(exc0Var.m118595F());
    }

    /* JADX INFO: renamed from: f */
    public static int m146338f(String str, int i) {
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
    public static void m146339g(bt6 bt6Var, cll cllVar, oxk oxkVar) {
        if (bt6Var == bt6.f77182a) {
            return;
        }
        List<at6> listM98767j = at6.m98767j(cllVar, oxkVar);
        if (listM98767j.isEmpty()) {
            return;
        }
        bt6Var.mo103811b(cllVar, listM98767j);
    }

    /* JADX INFO: renamed from: h */
    public static int m146340h(String str, int i, String str2) {
        while (i < str.length() && str2.indexOf(str.charAt(i)) == -1) {
            i++;
        }
        return i;
    }

    /* JADX INFO: renamed from: i */
    public static int m146341i(String str, int i) {
        char cCharAt;
        while (i < str.length() && ((cCharAt = str.charAt(i)) == ' ' || cCharAt == '\t')) {
            i++;
        }
        return i;
    }

    /* JADX INFO: renamed from: j */
    public static long m146342j(String str) {
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
    public static Set<String> m146343k(oxk oxkVar) {
        Set<String> treeSet = Collections.EMPTY_SET;
        int iM166559k = oxkVar.m166559k();
        for (int i = 0; i < iM166559k; i++) {
            if (HttpHeaders.VARY.equalsIgnoreCase(oxkVar.m166556f(i))) {
                String strM166561m = oxkVar.m166561m(i);
                if (treeSet.isEmpty()) {
                    treeSet = new TreeSet<>((Comparator<? super String>) String.CASE_INSENSITIVE_ORDER);
                }
                for (String str : strM166561m.split(Constants.SEPARATOR_COMMA)) {
                    treeSet.add(str.trim());
                }
            }
        }
        return treeSet;
    }

    /* JADX INFO: renamed from: l */
    public static Set<String> m146344l(exc0 exc0Var) {
        return m146343k(exc0Var.m118595F());
    }

    /* JADX INFO: renamed from: m */
    public static oxk m146345m(oxk oxkVar, oxk oxkVar2) {
        Set<String> setM146343k = m146343k(oxkVar2);
        if (setM146343k.isEmpty()) {
            return tck0.f169452c;
        }
        oxk.C19066a c19066a = new oxk.C19066a();
        int iM166559k = oxkVar.m166559k();
        for (int i = 0; i < iM166559k; i++) {
            String strM166556f = oxkVar.m166556f(i);
            if (setM146343k.contains(strM166556f)) {
                c19066a.m166563a(strM166556f, oxkVar.m166561m(i));
            }
        }
        return c19066a.m166567e();
    }

    /* JADX INFO: renamed from: n */
    public static oxk m146346n(exc0 exc0Var) {
        return m146345m(exc0Var.m118599M().m118604Y().m185875e(), exc0Var.m118595F());
    }

    /* JADX INFO: renamed from: o */
    public static boolean m146347o(exc0 exc0Var, oxk oxkVar, stc0 stc0Var) {
        for (String str : m146344l(exc0Var)) {
            if (!Objects.equals(oxkVar.m166562n(str), stc0Var.m185874d(str))) {
                return false;
            }
        }
        return true;
    }
}
