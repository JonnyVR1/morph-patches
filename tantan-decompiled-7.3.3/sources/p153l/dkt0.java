package p153l;

import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.util.C2098b;
import java.io.File;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public class dkt0 extends gjt0 {
    public dkt0(wit0 wit0Var, fcs0 fcs0Var, boolean z, @Nullable qbv0 qbv0Var) {
        super(wit0Var, fcs0Var, z, new r0t0(wit0Var, wit0Var.mo13716M(), new vfs0(wit0Var.getContext())), null, qbv0Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Nullable
    public final WebResourceResponse zzO(WebView webView, String str, @Nullable Map map) {
        String str2;
        if (!(webView instanceof wit0)) {
            dct0.m115298g("Tried to intercept request from a WebView that wasn't an AdWebView.");
            return null;
        }
        wit0 wit0Var = (wit0) webView;
        w8t0 w8t0Var = this.zza;
        if (w8t0Var != null) {
            w8t0Var.mo185108b(str, map, 1);
        }
        if (!"mraid.js".equalsIgnoreCase(new File(str).getName())) {
            if (map == null) {
                map = Collections.EMPTY_MAP;
            }
            return super.zzc(str, map);
        }
        if (wit0Var.zzN() != null) {
            wit0Var.zzN().zzF();
        }
        if (wit0Var.zzO().m211423i()) {
            str2 = (String) jas0.m144075c().m176505a(sgs0.f168083O);
        } else if (wit0Var.mo13730a0()) {
            str2 = (String) jas0.m144075c().m176505a(sgs0.f168071N);
        } else {
            str2 = (String) jas0.m144075c().m176505a(sgs0.f168059M);
        }
        bxy0.m106934r();
        return C2098b.m12358Y(wit0Var.getContext(), wit0Var.zzn().zza, str2);
    }
}
