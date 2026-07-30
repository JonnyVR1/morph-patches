package p149l;

import android.util.Pair;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes6.dex */
public final class dxy0 implements fmw0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ n1r0 f88333a;

    public dxy0(n1r0 n1r0Var) {
        this.f88333a = n1r0Var;
    }

    @Override // p149l.fmw0
    public final void zza(Throwable th) {
        vny0.m199079q().m212290w(th, "SignalGeneratorImpl.initializeWebViewForSignalCollection");
        n1r0 n1r0Var = this.f88333a;
        kpv0.m146889c(n1r0Var.f136708n, n1r0Var.f136700f, "sgf", new Pair("sgf_reason", th.getMessage()), new Pair("sgi_rn", Integer.toString(this.f88333a.f136693F.get())));
        x2t0.m206867e("Failed to initialize webview for loading SDKCore. ", th);
        if (!((Boolean) d1s0.m109677c().m144697a(m7s0.f132448w9)).booleanValue() || this.f88333a.f136692E.get()) {
            return;
        }
        if (this.f88333a.f136693F.getAndIncrement() < ((Integer) d1s0.m109677c().m144697a(m7s0.f132460x9)).intValue()) {
            this.f88333a.m157463L8();
        }
    }

    @Override // p149l.fmw0
    public final /* bridge */ /* synthetic */ void zzb(@Nullable Object obj) {
        x2t0.m206864b("Initialized webview successfully for SDKCore.");
        if (((Boolean) d1s0.m109677c().m144697a(m7s0.f132448w9)).booleanValue()) {
            n1r0 n1r0Var = this.f88333a;
            kpv0.m146889c(n1r0Var.f136708n, n1r0Var.f136700f, "sgs", new Pair("sgi_rn", Integer.toString(n1r0Var.f136693F.get())));
            this.f88333a.f136692E.set(true);
        }
    }
}
