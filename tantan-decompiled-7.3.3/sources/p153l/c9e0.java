package p153l;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import androidx.annotation.Nullable;
import com.p051p1.mobile.putong.data.SchemeKey;
import java.util.HashMap;

/* JADX INFO: loaded from: classes9.dex */
public class c9e0 extends o5e0 {
    /* JADX INFO: renamed from: e */
    public static void m108440e(Context context, String str, String str2) {
        HashMap map = new HashMap();
        map.put("from", str);
        map.put("trackingKey", str2);
        nae0.m162083m(bnl0.m105506D(context), Uri.parse(nae0.m162073c(SchemeKey.studentVerify, map)));
    }

    @Override // p153l.o5e0
    @Nullable
    /* JADX INFO: renamed from: c */
    public Intent mo95799c(abe0 abe0Var, z20<String, String> z20Var) {
        return null;
    }

    @Override // p153l.o5e0
    /* JADX INFO: renamed from: a */
    public void mo95798a(abe0 abe0Var, z20<String, String> z20Var) {
    }
}
