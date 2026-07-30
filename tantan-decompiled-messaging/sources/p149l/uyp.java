package p149l;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes7.dex */
public class uyp {

    /* JADX INFO: renamed from: a */
    static List<Pattern> f178897a = new ArrayList();

    static {
        HashSet hashSet = new HashSet();
        hashSet.add("^10\\.(1\\d{2}|2[0-4]\\d|25[0-5]|[1-9]\\d|[0-9])\\.(1\\d{2}|2[0-4]\\d|25[0-5]|[1-9]\\d|[0-9])\\.(1\\d{2}|2[0-4]\\d|25[0-5]|[1-9]\\d|[0-9])$");
        hashSet.add("^172\\.(1[6789]|2[0-9]|3[01])\\.(1\\d{2}|2[0-4]\\d|25[0-5]|[1-9]\\d|[0-9])\\.(1\\d{2}|2[0-4]\\d|25[0-5]|[1-9]\\d|[0-9])$");
        hashSet.add("^192\\.168\\.(1\\d{2}|2[0-4]\\d|25[0-5]|[1-9]\\d|[0-9])\\.(1\\d{2}|2[0-4]\\d|25[0-5]|[1-9]\\d|[0-9])$");
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            f178897a.add(Pattern.compile((String) it.next()));
        }
    }

    /* JADX INFO: renamed from: a */
    public static boolean m196341a(String str) {
        try {
            Iterator<Pattern> it = f178897a.iterator();
            while (it.hasNext()) {
                if (it.next().matcher(str).find()) {
                    return true;
                }
            }
            return false;
        } catch (Exception e) {
            e5e.m114786c("CosmosSdkDns", e);
            return false;
        }
    }
}
