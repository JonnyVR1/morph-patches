package p149l;

import Sudchar.Suddo;
import com.alibaba.sdk.android.oss.common.utils.HttpHeaders;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes.dex */
public final class cfg0 {

    /* JADX INFO: renamed from: g */
    public static final Pattern f80616g = Pattern.compile("attachment;\\s*filename\\s*=\\s*\"([^\"]*)\"");

    /* JADX INFO: renamed from: h */
    public static final Pattern f80617h = Pattern.compile("attachment;\\s*filename\\s*=\\s*(.*)");

    /* JADX INFO: renamed from: a */
    public final slg0 f80618a;

    /* JADX INFO: renamed from: b */
    public boolean f80619b;

    /* JADX INFO: renamed from: c */
    public long f80620c;

    /* JADX INFO: renamed from: d */
    public String f80621d;

    /* JADX INFO: renamed from: e */
    public String f80622e;

    /* JADX INFO: renamed from: f */
    public int f80623f;

    public cfg0(slg0 slg0Var, tfg0 tfg0Var) {
        this.f80618a = slg0Var;
    }

    /* JADX INFO: renamed from: a */
    public static String m106550a(jmg0 jmg0Var) throws Suddo {
        String strGroup;
        String strM142182a = jmg0Var.m142182a(HttpHeaders.CONTENT_DISPOSITION);
        if (strM142182a == null) {
            return null;
        }
        try {
            Matcher matcher = f80616g.matcher(strM142182a);
            if (matcher.find()) {
                strGroup = matcher.group(1);
            } else {
                Matcher matcher2 = f80617h.matcher(strM142182a);
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
