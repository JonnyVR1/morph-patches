package p149l;

import java.util.List;

/* JADX INFO: loaded from: classes13.dex */
public class x0f {
    /* JADX INFO: renamed from: a */
    public static String m206610a(List<Character> list) {
        char[] cArr = new char[list.size()];
        for (int i = 0; i < list.size(); i++) {
            cArr[i] = list.get(i).charValue();
        }
        return new String(cArr);
    }
}
