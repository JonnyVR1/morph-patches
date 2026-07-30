package p149l;

import android.text.TextUtils;
import android.text.style.ClickableSpan;
import java.net.URI;
import java.util.LinkedList;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public class bhq {

    /* JADX INFO: renamed from: a */
    public static final String[] f75645a = {"<a href = \"tantan://verification/school/rejected\">.*</a>", "<a href = \"tantan://verification/school/prompt\">.*</a>", "<a href = \"tantan://studentVerify.*\">.*</a>"};

    /* JADX INFO: renamed from: b */
    public static List<ahq> f75646b = new LinkedList();

    /* JADX INFO: renamed from: a */
    public static ClickableSpan m101909a(URI uri, boolean z, String str, String str2) {
        if (uri == null) {
            return null;
        }
        for (ahq ahqVar : f75646b) {
            if (!TextUtils.isEmpty(ahqVar.m96553e()) && !vwb.m200316b0(ahqVar.m96554f().matcher(uri.toString())).isEmpty()) {
                return ahqVar.m96555g(uri, z, str, str2);
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: b */
    public static boolean m101910b(String str) {
        for (ahq ahqVar : f75646b) {
            if (!TextUtils.isEmpty(ahqVar.mo96322c()) && !vwb.m200316b0(ahqVar.m96552d().matcher(str)).isEmpty()) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: c */
    public static void m101911c(ahq ahqVar) {
        if (ahqVar == null) {
            return;
        }
        f75646b.add(ahqVar);
    }
}
