package p149l;

import android.annotation.TargetApi;
import android.content.Context;
import android.webkit.CookieManager;
import android.webkit.WebResourceResponse;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.util.C2075b;
import java.io.InputStream;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
@TargetApi(21)
public class dpy0 extends w2r0 {
    public dpy0() {
        super(null);
    }

    @Override // p149l.w2r0
    @Nullable
    /* JADX INFO: renamed from: a */
    public final CookieManager mo112967a(Context context) {
        vny0.m199080r();
        if (C2075b.m12312e()) {
            return null;
        }
        try {
            return CookieManager.getInstance();
        } catch (Throwable th) {
            x2t0.m206867e("Failed to obtain CookieManager.", th);
            vny0.m199079q().m212289v(th, "ApiLevelUtil.getCookieManager");
            return null;
        }
    }

    @Override // p149l.w2r0
    /* JADX INFO: renamed from: b */
    public final WebResourceResponse mo112968b(String str, String str2, int i, String str3, Map map, InputStream inputStream) {
        return new WebResourceResponse(str, str2, i, str3, map, inputStream);
    }

    @Override // p149l.w2r0
    /* JADX INFO: renamed from: c */
    public final aat0 mo112969c(q9t0 q9t0Var, z2s0 z2s0Var, boolean z, @Nullable k2v0 k2v0Var) {
        return new yat0(q9t0Var, z2s0Var, z, k2v0Var);
    }
}
