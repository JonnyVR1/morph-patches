package p149l;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import androidx.annotation.Nullable;
import com.p046p1.mobile.putong.data.SchemeKey;
import java.util.HashMap;

/* JADX INFO: loaded from: classes9.dex */
public class y0e0 extends kxd0 {
    /* JADX INFO: renamed from: e */
    public static void m212111e(Context context, String str, String str2) {
        HashMap map = new HashMap();
        map.put("from", str);
        map.put("trackingKey", str2);
        j2e0.m139446m(xdl0.m208326D(context), Uri.parse(j2e0.m139436c(SchemeKey.studentVerify, map)));
    }

    @Override // p149l.kxd0
    @Nullable
    /* JADX INFO: renamed from: c */
    public Intent mo94422c(w2e0 w2e0Var, f30<String, String> f30Var) {
        return null;
    }

    @Override // p149l.kxd0
    /* JADX INFO: renamed from: a */
    public void mo94421a(w2e0 w2e0Var, f30<String, String> f30Var) {
    }
}
