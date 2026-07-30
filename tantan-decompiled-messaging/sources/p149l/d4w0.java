package p149l;

import android.net.Uri;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public final class d4w0 {

    /* JADX INFO: renamed from: a */
    public final String f84360a = (String) m9s0.f132798b.m115379e();

    /* JADX INFO: renamed from: a */
    public final String m109998a(Map map) {
        Uri.Builder builderBuildUpon = Uri.parse(this.f84360a).buildUpon();
        for (Map.Entry entry : map.entrySet()) {
            builderBuildUpon.appendQueryParameter((String) entry.getKey(), (String) entry.getValue());
        }
        return builderBuildUpon.build().toString();
    }
}
