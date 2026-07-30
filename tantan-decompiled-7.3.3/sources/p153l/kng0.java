package p153l;

import Sudchar.Suddo;
import com.alibaba.sdk.android.oss.common.utils.HttpHeaders;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes.dex */
public final class kng0 {

    /* JADX INFO: renamed from: g */
    public static final Pattern f127592g = Pattern.compile("attachment;\\s*filename\\s*=\\s*\"([^\"]*)\"");

    /* JADX INFO: renamed from: h */
    public static final Pattern f127593h = Pattern.compile("attachment;\\s*filename\\s*=\\s*(.*)");

    /* JADX INFO: renamed from: a */
    public final aug0 f127594a;

    /* JADX INFO: renamed from: b */
    public boolean f127595b;

    /* JADX INFO: renamed from: c */
    public long f127596c;

    /* JADX INFO: renamed from: d */
    public String f127597d;

    /* JADX INFO: renamed from: e */
    public String f127598e;

    /* JADX INFO: renamed from: f */
    public int f127599f;

    public kng0(aug0 aug0Var, bog0 bog0Var) {
        this.f127594a = aug0Var;
    }

    /* JADX INFO: renamed from: a */
    public static String m150521a(rug0 rug0Var) throws Suddo {
        String strGroup;
        String strM183191a = rug0Var.m183191a(HttpHeaders.CONTENT_DISPOSITION);
        if (strM183191a == null) {
            return null;
        }
        try {
            Matcher matcher = f127592g.matcher(strM183191a);
            if (matcher.find()) {
                strGroup = matcher.group(1);
            } else {
                Matcher matcher2 = f127593h.matcher(strM183191a);
                strGroup = matcher2.find() ? matcher2.group(1) : null;
            }
            if (strGroup != null && strGroup.contains("../")) {
                throw new Suddo("The filename [" + strGroup + "] from the response is not allowable, because it contains '../', which can raise the directory traversal vulnerability");
            }
            return strGroup;
        } catch (IllegalStateException unused) {
            return null;
        }
    }
}
