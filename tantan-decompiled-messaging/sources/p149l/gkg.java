package p149l;

import com.alibaba.sdk.android.oss.signer.SignParameters;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes13.dex */
public class gkg {

    /* JADX INFO: renamed from: a */
    public int f103189a;

    /* JADX INFO: renamed from: b */
    public HashMap<String, Integer> f103190b;

    public gkg(int i, HashMap<String, Integer> map) {
        this.f103189a = i;
        this.f103190b = map;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("fd count is:");
        sb.append(this.f103189a);
        sb.append("content:");
        for (Map.Entry<String, Integer> entry : this.f103190b.entrySet()) {
            sb.append(entry.getKey());
            sb.append(":");
            sb.append(entry.getValue());
            sb.append(SignParameters.NEW_LINE);
        }
        return sb.toString();
    }
}
