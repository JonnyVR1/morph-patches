package p153l;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public class ahe {

    /* JADX INFO: renamed from: a */
    public static Map<String, AbstractC18089k4> f71340a = new HashMap();

    /* JADX INFO: renamed from: a */
    public static AbstractC18089k4 m97793a(String str) {
        if (str == null) {
            return new pt40();
        }
        return !str.equals("video") ? new pt40() : new dfl0();
    }

    /* JADX INFO: renamed from: b */
    public static AbstractC18089k4 m97794b(String str) {
        if (f71340a.containsKey(str)) {
            return f71340a.get(str);
        }
        AbstractC18089k4 abstractC18089k4M97793a = m97793a(str);
        f71340a.put(str, abstractC18089k4M97793a);
        return abstractC18089k4M97793a;
    }
}
