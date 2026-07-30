package p153l;

import android.text.TextUtils;
import android.text.style.ClickableSpan;
import java.net.URI;
import java.util.LinkedList;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public class bjq {

    /* JADX INFO: renamed from: a */
    public static final String[] f77005a = {"<a href = \"tantan://verification/school/rejected\">.*</a>", "<a href = \"tantan://verification/school/prompt\">.*</a>", "<a href = \"tantan://studentVerify.*\">.*</a>"};

    /* JADX INFO: renamed from: b */
    public static List<ajq> f77006b = new LinkedList();

    /* JADX INFO: renamed from: a */
    public static ClickableSpan m104638a(URI uri, boolean z, String str, String str2) {
        if (uri == null) {
            return null;
        }
        for (ajq ajqVar : f77006b) {
            if (!TextUtils.isEmpty(ajqVar.m98411e()) && !jyb.m147499b0(ajqVar.m98412f().matcher(uri.toString())).isEmpty()) {
                return ajqVar.m98413g(uri, z, str, str2);
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: b */
    public static boolean m104639b(String str) {
        for (ajq ajqVar : f77006b) {
            if (!TextUtils.isEmpty(ajqVar.mo98011c()) && !jyb.m147499b0(ajqVar.m98410d().matcher(str)).isEmpty()) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: c */
    public static void m104640c(ajq ajqVar) {
        if (ajqVar == null) {
            return;
        }
        f77006b.add(ajqVar);
    }
}
