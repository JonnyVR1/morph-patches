package p153l;

import android.util.Pair;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes6.dex */
public final class j6z0 implements lvw0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ tar0 f118618a;

    public j6z0(tar0 tar0Var) {
        this.f118618a = tar0Var;
    }

    @Override // p153l.lvw0
    public final void zza(Throwable th) {
        bxy0.m106933q().m120275w(th, "SignalGeneratorImpl.initializeWebViewForSignalCollection");
        tar0 tar0Var = this.f118618a;
        qyv0.m178752c(tar0Var.f172785n, tar0Var.f172777f, "sgf", new Pair("sgf_reason", th.getMessage()), new Pair("sgi_rn", Integer.toString(this.f118618a.f172770F.get())));
        dct0.m115296e("Failed to initialize webview for loading SDKCore. ", th);
        if (!((Boolean) jas0.m144075c().m176505a(sgs0.f168519w9)).booleanValue() || this.f118618a.f172769E.get()) {
            return;
        }
        if (this.f118618a.f172770F.getAndIncrement() < ((Integer) jas0.m144075c().m176505a(sgs0.f168531x9)).intValue()) {
            this.f118618a.m189920L8();
        }
    }

    @Override // p153l.lvw0
    public final /* bridge */ /* synthetic */ void zzb(@Nullable Object obj) {
        dct0.m115293b("Initialized webview successfully for SDKCore.");
        if (((Boolean) jas0.m144075c().m176505a(sgs0.f168519w9)).booleanValue()) {
            tar0 tar0Var = this.f118618a;
            qyv0.m178752c(tar0Var.f172785n, tar0Var.f172777f, "sgs", new Pair("sgi_rn", Integer.toString(tar0Var.f172770F.get())));
            this.f118618a.f172769E.set(true);
        }
    }
}
