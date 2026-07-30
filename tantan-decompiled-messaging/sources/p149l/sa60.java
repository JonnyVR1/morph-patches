package p149l;

import com.googlecode.mp4parser.AbstractContainerBox;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes7.dex */
public class sa60 {

    /* JADX INFO: renamed from: a */
    static Pattern f163309a = Pattern.compile("(....|\\.\\.)(\\[(.*)\\])?");

    /* JADX INFO: renamed from: a */
    public static String m182849a(pe3 pe3Var) {
        return m182850b(pe3Var, "");
    }

    /* JADX INFO: renamed from: b */
    private static String m182850b(pe3 pe3Var, String str) {
        o06 parent = pe3Var.getParent();
        int i = 0;
        for (pe3 pe3Var2 : parent.getBoxes()) {
            if (pe3Var2.getType().equals(pe3Var.getType())) {
                if (pe3Var2 == pe3Var) {
                    break;
                }
                i++;
            }
        }
        String str2 = String.format("/%s[%d]", pe3Var.getType(), Integer.valueOf(i)) + str;
        return parent instanceof pe3 ? m182850b((pe3) parent, str2) : str2;
    }

    /* JADX INFO: renamed from: c */
    public static <T extends pe3> T m182851c(AbstractContainerBox abstractContainerBox, String str) {
        List listM182852d = m182852d(abstractContainerBox, str, true);
        if (listM182852d.isEmpty()) {
            return null;
        }
        return (T) listM182852d.get(0);
    }

    /* JADX INFO: renamed from: d */
    private static <T extends pe3> List<T> m182852d(AbstractContainerBox abstractContainerBox, String str, boolean z) {
        return m182853e(abstractContainerBox, str, z);
    }

    /* JADX INFO: renamed from: e */
    private static <T extends pe3> List<T> m182853e(Object obj, String str, boolean z) {
        String strSubstring;
        if (str.startsWith("/")) {
            String strSubstring2 = str.substring(1);
            while (obj instanceof pe3) {
                obj = ((pe3) obj).getParent();
            }
            str = strSubstring2;
        }
        if (str.length() == 0) {
            if (obj instanceof pe3) {
                return Collections.singletonList((pe3) obj);
            }
            upk0.m194883a("Result of path expression seems to be the root container. This is not allowed!");
            return null;
        }
        int i = 0;
        if (str.contains("/")) {
            strSubstring = str.substring(str.indexOf(47) + 1);
            str = str.substring(0, str.indexOf(47));
        } else {
            strSubstring = "";
        }
        Matcher matcher = f163309a.matcher(str);
        if (!matcher.matches()) {
            upk0.m194883a(str.concat(" is invalid path."));
            return null;
        }
        String strGroup = matcher.group(1);
        if ("..".equals(strGroup)) {
            return obj instanceof pe3 ? m182855g(((pe3) obj).getParent(), strSubstring, z) : Collections.EMPTY_LIST;
        }
        if (!(obj instanceof o06)) {
            return Collections.EMPTY_LIST;
        }
        int i2 = matcher.group(2) != null ? Integer.parseInt(matcher.group(3)) : -1;
        LinkedList linkedList = new LinkedList();
        for (pe3 pe3Var : ((o06) obj).getBoxes()) {
            if (pe3Var.getType().matches(strGroup)) {
                if (i2 == -1 || i2 == i) {
                    linkedList.addAll(m182854f(pe3Var, strSubstring, z));
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
    private static <T extends pe3> List<T> m182854f(pe3 pe3Var, String str, boolean z) {
        return m182853e(pe3Var, str, z);
    }

    /* JADX INFO: renamed from: g */
    private static <T extends pe3> List<T> m182855g(o06 o06Var, String str, boolean z) {
        return m182853e(o06Var, str, z);
    }
}
