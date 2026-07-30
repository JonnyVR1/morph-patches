package p153l;

import com.alibaba.sdk.android.oss.signer.SignParameters;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes11.dex */
public class ulg {

    /* JADX INFO: renamed from: a */
    public int f179508a;

    /* JADX INFO: renamed from: b */
    public HashMap<String, Integer> f179509b;

    public ulg(int i, HashMap<String, Integer> map) {
        this.f179508a = i;
        this.f179509b = map;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("fd count is:");
        sb.append(this.f179508a);
        sb.append("content:");
        for (Map.Entry<String, Integer> entry : this.f179509b.entrySet()) {
            sb.append(entry.getKey());
            sb.append(":");
            sb.append(entry.getValue());
            sb.append(SignParameters.NEW_LINE);
        }
        return sb.toString();
    }
}
