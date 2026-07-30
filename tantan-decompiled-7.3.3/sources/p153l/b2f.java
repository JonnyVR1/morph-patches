package p153l;

import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public class b2f {
    /* JADX INFO: renamed from: a */
    public static String m102142a(List<Character> list) {
        char[] cArr = new char[list.size()];
        for (int i = 0; i < list.size(); i++) {
            cArr[i] = list.get(i).charValue();
        }
        return new String(cArr);
    }
}
