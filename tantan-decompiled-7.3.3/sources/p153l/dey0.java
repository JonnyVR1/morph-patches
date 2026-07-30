package p153l;

import android.os.RemoteException;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;

/* JADX INFO: loaded from: classes6.dex */
public final class dey0 extends WebViewClient {
    final /* synthetic */ xuy0 zza;

    public dey0(xuy0 xuy0Var) {
        this.zza = xuy0Var;
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        xuy0 xuy0Var = this.zza;
        if (xuy0Var.f196340g != null) {
            try {
                xuy0Var.f196340g.mo127000f(v8w0.m200327d(1, null, null));
            } catch (RemoteException e) {
                dct0.m115300i("#007 Could not call remote method.", e);
            }
        }
        xuy0 xuy0Var2 = this.zza;
        if (xuy0Var2.f196340g != null) {
            try {
                xuy0Var2.f196340g.zze(0);
            } catch (RemoteException e2) {
                dct0.m115300i("#007 Could not call remote method.", e2);
            }
        }
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        if (str.startsWith(this.zza.m213207a())) {
            return false;
        }
        if (str.startsWith("gmsg://noAdLoaded")) {
            xuy0 xuy0Var = this.zza;
            if (xuy0Var.f196340g != null) {
                try {
                    xuy0Var.f196340g.mo127000f(v8w0.m200327d(3, null, null));
                } catch (RemoteException e) {
                    dct0.m115300i("#007 Could not call remote method.", e);
                }
            }
            xuy0 xuy0Var2 = this.zza;
            if (xuy0Var2.f196340g != null) {
                try {
                    xuy0Var2.f196340g.zze(3);
                } catch (RemoteException e2) {
                    dct0.m115300i("#007 Could not call remote method.", e2);
                }
            }
            this.zza.m213208p8(0);
            return true;
        }
        if (str.startsWith("gmsg://scriptLoadFailed")) {
            xuy0 xuy0Var3 = this.zza;
            if (xuy0Var3.f196340g != null) {
                try {
                    xuy0Var3.f196340g.mo127000f(v8w0.m200327d(1, null, null));
                } catch (RemoteException e3) {
                    dct0.m115300i("#007 Could not call remote method.", e3);
                }
            }
            xuy0 xuy0Var4 = this.zza;
            if (xuy0Var4.f196340g != null) {
                try {
                    xuy0Var4.f196340g.zze(0);
                } catch (RemoteException e4) {
                    dct0.m115300i("#007 Could not call remote method.", e4);
                }
            }
            this.zza.m213208p8(0);
            return true;
        }
        if (str.startsWith("gmsg://adResized")) {
            xuy0 xuy0Var5 = this.zza;
            if (xuy0Var5.f196340g != null) {
                try {
                    xuy0Var5.f196340g.zzi();
                } catch (RemoteException e5) {
                    dct0.m115300i("#007 Could not call remote method.", e5);
                }
            }
            this.zza.m213208p8(this.zza.zzb(str));
            return true;
        }
        if (str.startsWith("gmsg://")) {
            return true;
        }
        xuy0 xuy0Var6 = this.zza;
        if (xuy0Var6.f196340g != null) {
            try {
                xuy0Var6.f196340g.zzc();
                this.zza.f196340g.zzh();
            } catch (RemoteException e6) {
                dct0.m115300i("#007 Could not call remote method.", e6);
            }
        }
        xuy0.m213206y8(this.zza, xuy0.m213203v8(this.zza, str));
        return true;
    }
}
