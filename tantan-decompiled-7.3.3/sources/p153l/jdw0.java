package p153l;

import android.net.Uri;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public final class jdw0 {

    /* JADX INFO: renamed from: a */
    public final String f120371a = (String) sis0.f168866b.m149974e();

    /* JADX INFO: renamed from: a */
    public final String m144502a(Map map) {
        Uri.Builder builderBuildUpon = Uri.parse(this.f120371a).buildUpon();
        for (Map.Entry entry : map.entrySet()) {
            builderBuildUpon.appendQueryParameter((String) entry.getKey(), (String) entry.getValue());
        }
        return builderBuildUpon.build().toString();
    }
}
