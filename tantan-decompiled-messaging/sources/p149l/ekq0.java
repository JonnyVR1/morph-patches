package p149l;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public class ekq0 {

    /* JADX INFO: renamed from: a */
    public int f92003a;

    /* JADX INFO: renamed from: b */
    public Map<String, String> f92004b = new HashMap();

    /* JADX INFO: renamed from: c */
    public String f92005c;

    /* JADX INFO: renamed from: a */
    public String m116991a() {
        return this.f92005c;
    }

    public String toString() {
        return String.format("resCode = %1$d, headers = %2$s, response = %3$s", Integer.valueOf(this.f92003a), this.f92004b.toString(), this.f92005c);
    }
}
