package p006l;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import androidx.annotation.Nullable;
import java.util.HashMap;
import l.f30;
import l.xdl0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class y0e0 extends kxd0 {
    /* JADX INFO: renamed from: e */
    public static void m27735e(Context context, String str, String str2) {
        HashMap map = new HashMap();
        map.put("from", str);
        map.put("trackingKey", str2);
        j2e0.m17248m(xdl0.D(context), Uri.parse(j2e0.m17238c("studentVerify", map)));
    }

    @Override // p006l.kxd0
    @Nullable
    /* JADX INFO: renamed from: c */
    public Intent mo11682c(w2e0 w2e0Var, f30<String, String> f30Var) {
        return null;
    }

    @Override // p006l.kxd0
    /* JADX INFO: renamed from: a */
    public void mo11681a(w2e0 w2e0Var, f30<String, String> f30Var) {
    }
}
