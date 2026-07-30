package p149l;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.internal.overlay.zzc;
import com.google.android.gms.internal.ads.zzcei;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes6.dex */
public final class i5v0 implements j3v0 {

    /* JADX INFO: renamed from: a */
    public final Context f111652a;

    /* JADX INFO: renamed from: b */
    public final j9u0 f111653b;

    /* JADX INFO: renamed from: c */
    public final Executor f111654c;

    /* JADX INFO: renamed from: d */
    public final jxv0 f111655d;

    public i5v0(Context context, Executor executor, j9u0 j9u0Var, jxv0 jxv0Var) {
        this.f111652a = context;
        this.f111653b = j9u0Var;
        this.f111654c = executor;
        this.f111655d = jxv0Var;
    }

    @Nullable
    /* JADX INFO: renamed from: d */
    public static String m134561d(kxv0 kxv0Var) {
        try {
            return kxv0Var.f125226w.getString("tab_url");
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // p149l.j3v0
    /* JADX INFO: renamed from: a */
    public final boolean mo120127a(vxv0 vxv0Var, kxv0 kxv0Var) {
        Context context = this.f111652a;
        return (context instanceof Activity) && v8s0.m197514g(context) && !TextUtils.isEmpty(m134561d(kxv0Var));
    }

    @Override // p149l.j3v0
    /* JADX INFO: renamed from: b */
    public final gnr mo120128b(final vxv0 vxv0Var, final kxv0 kxv0Var) {
        String strM134561d = m134561d(kxv0Var);
        final Uri uri = strM134561d != null ? Uri.parse(strM134561d) : null;
        return jmw0.m142241n(jmw0.m142235h(null), new rlw0() { // from class: l.g5v0
            @Override // p149l.rlw0
            public final gnr zza(Object obj) {
                return this.f101203a.m134562c(uri, vxv0Var, kxv0Var, obj);
            }
        }, this.f111654c);
    }

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ gnr m134562c(Uri uri, vxv0 vxv0Var, kxv0 kxv0Var, Object obj) throws Exception {
        try {
            hyb hybVarM133505a = new hyb.C17431a().m133505a();
            hybVarM133505a.f110043a.setData(uri);
            zzc zzcVar = new zzc(hybVarM133505a.f110043a, null);
            final n3t0 n3t0Var = new n3t0();
            c8u0 c8u0VarMo116365c = this.f111653b.mo116365c(new uqt0(vxv0Var, kxv0Var, null), new f8u0(new q9u0() { // from class: l.h5v0
                @Override // p149l.q9u0
                /* JADX INFO: renamed from: a */
                public final void mo100276a(boolean z, Context context, wxt0 wxt0Var) {
                    n3t0 n3t0Var2 = n3t0Var;
                    try {
                        vny0.m199073k();
                        a8y0.m95388a(context, (AdOverlayInfoParcel) n3t0Var2.get(), true);
                    } catch (Exception unused) {
                    }
                }
            }, null));
            n3t0Var.m157774b(new AdOverlayInfoParcel(zzcVar, null, c8u0VarMo116365c.mo96329h(), null, new zzcei(0, 0, false, false, false), null, null));
            this.f111655d.m143826a();
            return jmw0.m142235h(c8u0VarMo116365c.mo96330i());
        } catch (Throwable th) {
            x2t0.m206867e("Error in CustomTabsAdRenderer", th);
            throw th;
        }
    }
}
