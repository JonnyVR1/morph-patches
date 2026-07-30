package p153l;

import android.annotation.TargetApi;
import android.content.Context;
import android.webkit.CookieManager;
import android.webkit.WebResourceResponse;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.util.C2098b;
import java.io.InputStream;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
@TargetApi(21)
public class jyy0 extends ccr0 {
    public jyy0() {
        super(null);
    }

    @Override // p153l.ccr0
    @Nullable
    /* JADX INFO: renamed from: a */
    public final CookieManager mo109050a(Context context) {
        bxy0.m106934r();
        if (C2098b.m12366e()) {
            return null;
        }
        try {
            return CookieManager.getInstance();
        } catch (Throwable th) {
            dct0.m115296e("Failed to obtain CookieManager.", th);
            bxy0.m106933q().m120274v(th, "ApiLevelUtil.getCookieManager");
            return null;
        }
    }

    @Override // p153l.ccr0
    /* JADX INFO: renamed from: b */
    public final WebResourceResponse mo109051b(String str, String str2, int i, String str3, Map map, InputStream inputStream) {
        return new WebResourceResponse(str, str2, i, str3, map, inputStream);
    }

    @Override // p153l.ccr0
    /* JADX INFO: renamed from: c */
    public final gjt0 mo109052c(wit0 wit0Var, fcs0 fcs0Var, boolean z, @Nullable qbv0 qbv0Var) {
        return new ekt0(wit0Var, fcs0Var, z, qbv0Var);
    }
}
