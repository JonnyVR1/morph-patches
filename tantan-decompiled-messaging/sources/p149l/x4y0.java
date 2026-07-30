package p149l;

import android.os.RemoteException;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;

/* JADX INFO: loaded from: classes6.dex */
public final class x4y0 extends WebViewClient {
    final /* synthetic */ rly0 zza;

    public x4y0(rly0 rly0Var) {
        this.zza = rly0Var;
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        rly0 rly0Var = this.zza;
        if (rly0Var.f160045g != null) {
            try {
                rly0Var.f160045g.mo134665f(pzv0.m172256d(1, null, null));
            } catch (RemoteException e) {
                x2t0.m206871i("#007 Could not call remote method.", e);
            }
        }
        rly0 rly0Var2 = this.zza;
        if (rly0Var2.f160045g != null) {
            try {
                rly0Var2.f160045g.zze(0);
            } catch (RemoteException e2) {
                x2t0.m206871i("#007 Could not call remote method.", e2);
            }
        }
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        if (str.startsWith(this.zza.m179944a())) {
            return false;
        }
        if (str.startsWith("gmsg://noAdLoaded")) {
            rly0 rly0Var = this.zza;
            if (rly0Var.f160045g != null) {
                try {
                    rly0Var.f160045g.mo134665f(pzv0.m172256d(3, null, null));
                } catch (RemoteException e) {
                    x2t0.m206871i("#007 Could not call remote method.", e);
                }
            }
            rly0 rly0Var2 = this.zza;
            if (rly0Var2.f160045g != null) {
                try {
                    rly0Var2.f160045g.zze(3);
                } catch (RemoteException e2) {
                    x2t0.m206871i("#007 Could not call remote method.", e2);
                }
            }
            this.zza.m179945p8(0);
            return true;
        }
        if (str.startsWith("gmsg://scriptLoadFailed")) {
            rly0 rly0Var3 = this.zza;
            if (rly0Var3.f160045g != null) {
                try {
                    rly0Var3.f160045g.mo134665f(pzv0.m172256d(1, null, null));
                } catch (RemoteException e3) {
                    x2t0.m206871i("#007 Could not call remote method.", e3);
                }
            }
            rly0 rly0Var4 = this.zza;
            if (rly0Var4.f160045g != null) {
                try {
                    rly0Var4.f160045g.zze(0);
                } catch (RemoteException e4) {
                    x2t0.m206871i("#007 Could not call remote method.", e4);
                }
            }
            this.zza.m179945p8(0);
            return true;
        }
        if (str.startsWith("gmsg://adResized")) {
            rly0 rly0Var5 = this.zza;
            if (rly0Var5.f160045g != null) {
                try {
                    rly0Var5.f160045g.zzi();
                } catch (RemoteException e5) {
                    x2t0.m206871i("#007 Could not call remote method.", e5);
                }
            }
            this.zza.m179945p8(this.zza.zzb(str));
            return true;
        }
        if (str.startsWith("gmsg://")) {
            return true;
        }
        rly0 rly0Var6 = this.zza;
        if (rly0Var6.f160045g != null) {
            try {
                rly0Var6.f160045g.zzc();
                this.zza.f160045g.zzh();
            } catch (RemoteException e6) {
                x2t0.m206871i("#007 Could not call remote method.", e6);
            }
        }
        rly0.m179943y8(this.zza, rly0.m179940v8(this.zza, str));
        return true;
    }
}
