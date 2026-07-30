package p153l;

import com.googlecode.mp4parser.AbstractContainerBox;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes7.dex */
public class xi60 {

    /* JADX INFO: renamed from: a */
    static Pattern f194436a = Pattern.compile("(....|\\.\\.)(\\[(.*)\\])?");

    /* JADX INFO: renamed from: a */
    public static String m211122a(ef3 ef3Var) {
        return m211123b(ef3Var, "");
    }

    /* JADX INFO: renamed from: b */
    private static String m211123b(ef3 ef3Var, String str) {
        t16 parent = ef3Var.getParent();
        int i = 0;
        for (ef3 ef3Var2 : parent.getBoxes()) {
            if (ef3Var2.getType().equals(ef3Var.getType())) {
                if (ef3Var2 == ef3Var) {
                    break;
                }
                i++;
            }
        }
        String str2 = String.format("/%s[%d]", ef3Var.getType(), Integer.valueOf(i)) + str;
        return parent instanceof ef3 ? m211123b((ef3) parent, str2) : str2;
    }

    /* JADX INFO: renamed from: c */
    public static <T extends ef3> T m211124c(AbstractContainerBox abstractContainerBox, String str) {
        List listM211125d = m211125d(abstractContainerBox, str, true);
        if (listM211125d.isEmpty()) {
            return null;
        }
        return (T) listM211125d.get(0);
    }

    /* JADX INFO: renamed from: d */
    private static <T extends ef3> List<T> m211125d(AbstractContainerBox abstractContainerBox, String str, boolean z) {
        return m211126e(abstractContainerBox, str, z);
    }

    /* JADX INFO: renamed from: e */
    private static <T extends ef3> List<T> m211126e(Object obj, String str, boolean z) {
        String strSubstring;
        if (str.startsWith("/")) {
            String strSubstring2 = str.substring(1);
            while (obj instanceof ef3) {
                obj = ((ef3) obj).getParent();
            }
            str = strSubstring2;
        }
        if (str.length() == 0) {
            if (obj instanceof ef3) {
                return Collections.singletonList((ef3) obj);
            }
            azk0.m101074a("Result of path expression seems to be the root container. This is not allowed!");
            return null;
        }
        int i = 0;
        if (str.contains("/")) {
            strSubstring = str.substring(str.indexOf(47) + 1);
            str = str.substring(0, str.indexOf(47));
        } else {
            strSubstring = "";
        }
        Matcher matcher = f194436a.matcher(str);
        if (!matcher.matches()) {
            azk0.m101074a(str.concat(" is invalid path."));
            return null;
        }
        String strGroup = matcher.group(1);
        if ("..".equals(strGroup)) {
            return obj instanceof ef3 ? m211128g(((ef3) obj).getParent(), strSubstring, z) : Collections.EMPTY_LIST;
        }
        if (!(obj instanceof t16)) {
            return Collections.EMPTY_LIST;
        }
        int i2 = matcher.group(2) != null ? Integer.parseInt(matcher.group(3)) : -1;
        LinkedList linkedList = new LinkedList();
        for (ef3 ef3Var : ((t16) obj).getBoxes()) {
            if (ef3Var.getType().matches(strGroup)) {
                if (i2 == -1 || i2 == i) {
                    linkedList.addAll(m211127f(ef3Var, strSubstring, z));
                }
                i++;
            }
            if (z || i2 >= 0) {
                if (!linkedList.isEmpty()) {
                    break;
                }
            }
        }
        return linkedList;
    }

    /* JADX INFO: renamed from: f */
    private static <T extends ef3> List<T> m211127f(ef3 ef3Var, String str, boolean z) {
        return m211126e(ef3Var, str, z);
    }

    /* JADX INFO: renamed from: g */
    private static <T extends ef3> List<T> m211128g(t16 t16Var, String str, boolean z) {
        return m211126e(t16Var, str, z);
    }
}
