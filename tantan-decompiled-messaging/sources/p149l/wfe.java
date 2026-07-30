package p149l;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes10.dex */
public class wfe {

    /* JADX INFO: renamed from: a */
    public static Map<String, AbstractC18145l4> f186076a = new HashMap();

    /* JADX INFO: renamed from: a */
    public static AbstractC18145l4 m202982a(String str) {
        if (str == null) {
            return new bl40();
        }
        return !str.equals("video") ? new bl40() : new z5l0();
    }

    /* JADX INFO: renamed from: b */
    public static AbstractC18145l4 m202983b(String str) {
        if (f186076a.containsKey(str)) {
            return f186076a.get(str);
        }
        AbstractC18145l4 abstractC18145l4M202982a = m202982a(str);
        f186076a.put(str, abstractC18145l4M202982a);
        return abstractC18145l4M202982a;
    }
}
