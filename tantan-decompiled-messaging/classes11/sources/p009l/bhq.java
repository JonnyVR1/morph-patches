package p009l;

import android.text.TextUtils;
import android.text.style.ClickableSpan;
import java.net.URI;
import java.util.LinkedList;
import java.util.List;
import l.vwb;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class bhq {

    /* JADX INFO: renamed from: a */
    public static final String[] f10110a = {"<a href = \"tantan://verification/school/rejected\">.*</a>", "<a href = \"tantan://verification/school/prompt\">.*</a>", "<a href = \"tantan://studentVerify.*\">.*</a>"};

    /* JADX INFO: renamed from: b */
    public static List<ahq> f10111b = new LinkedList();

    /* JADX INFO: renamed from: a */
    public static ClickableSpan m12033a(URI uri, boolean z, String str, String str2) {
        if (uri == null) {
            return null;
        }
        for (ahq ahqVar : f10111b) {
            if (!TextUtils.isEmpty(ahqVar.m11447e()) && !vwb.b0(ahqVar.m11448f().matcher(uri.toString())).isEmpty()) {
                return ahqVar.m11449g(uri, z, str, str2);
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: b */
    public static boolean m12034b(String str) {
        for (ahq ahqVar : f10111b) {
            if (!TextUtils.isEmpty(ahqVar.m11445c()) && !vwb.b0(ahqVar.m11446d().matcher(str)).isEmpty()) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: c */
    public static void m12035c(ahq ahqVar) {
        if (ahqVar == null) {
            return;
        }
        f10111b.add(ahqVar);
    }
}
