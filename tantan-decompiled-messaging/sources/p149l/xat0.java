package p149l;

import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.util.C2075b;
import java.io.File;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public class xat0 extends aat0 {
    public xat0(q9t0 q9t0Var, z2s0 z2s0Var, boolean z, @Nullable k2v0 k2v0Var) {
        super(q9t0Var, z2s0Var, z, new lrs0(q9t0Var, q9t0Var.mo13662M(), new p6s0(q9t0Var.getContext())), null, k2v0Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Nullable
    public final WebResourceResponse zzO(WebView webView, String str, @Nullable Map map) {
        String str2;
        if (!(webView instanceof q9t0)) {
            x2t0.m206869g("Tried to intercept request from a WebView that wasn't an AdWebView.");
            return null;
        }
        q9t0 q9t0Var = (q9t0) webView;
        qzs0 qzs0Var = this.zza;
        if (qzs0Var != null) {
            qzs0Var.mo157166b(str, map, 1);
        }
        if (!"mraid.js".equalsIgnoreCase(new File(str).getName())) {
            if (map == null) {
                map = Collections.EMPTY_MAP;
            }
            return super.zzc(str, map);
        }
        if (q9t0Var.zzN() != null) {
            q9t0Var.zzN().zzF();
        }
        if (q9t0Var.zzO().m178700i()) {
            str2 = (String) d1s0.m109677c().m144697a(m7s0.f132012O);
        } else if (q9t0Var.mo13676a0()) {
            str2 = (String) d1s0.m109677c().m144697a(m7s0.f132000N);
        } else {
            str2 = (String) d1s0.m109677c().m144697a(m7s0.f131988M);
        }
        vny0.m199080r();
        return C2075b.m12304Y(q9t0Var.getContext(), q9t0Var.zzn().zza, str2);
    }
}
