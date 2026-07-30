package p153l;

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
public final class oev0 implements pcv0 {

    /* JADX INFO: renamed from: a */
    public final Context f147017a;

    /* JADX INFO: renamed from: b */
    public final piu0 f147018b;

    /* JADX INFO: renamed from: c */
    public final Executor f147019c;

    /* JADX INFO: renamed from: d */
    public final p6w0 f147020d;

    public oev0(Context context, Executor executor, piu0 piu0Var, p6w0 p6w0Var) {
        this.f147017a = context;
        this.f147018b = piu0Var;
        this.f147019c = executor;
        this.f147020d = p6w0Var;
    }

    @Nullable
    /* JADX INFO: renamed from: d */
    public static String m167371d(q6w0 q6w0Var) {
        try {
            return q6w0Var.f155916w.getString("tab_url");
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // p153l.pcv0
    /* JADX INFO: renamed from: a */
    public final boolean mo98488a(b7w0 b7w0Var, q6w0 q6w0Var) {
        Context context = this.f147017a;
        return (context instanceof Activity) && bis0.m104509g(context) && !TextUtils.isEmpty(m167371d(q6w0Var));
    }

    @Override // p153l.pcv0
    /* JADX INFO: renamed from: b */
    public final hpr mo98489b(final b7w0 b7w0Var, final q6w0 q6w0Var) {
        String strM167371d = m167371d(q6w0Var);
        final Uri uri = strM167371d != null ? Uri.parse(strM167371d) : null;
        return pvw0.m173987n(pvw0.m173981h(null), new xuw0() { // from class: l.mev0
            @Override // p153l.xuw0
            public final hpr zza(Object obj) {
                return this.f136572a.m167372c(uri, b7w0Var, q6w0Var, obj);
            }
        }, this.f147019c);
    }

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ hpr m167372c(Uri uri, b7w0 b7w0Var, q6w0 q6w0Var, Object obj) throws Exception {
        try {
            vzb vzbVarM204046a = new vzb.C20961a().m204046a();
            vzbVarM204046a.f186459a.setData(uri);
            zzc zzcVar = new zzc(vzbVarM204046a.f186459a, null);
            final tct0 tct0Var = new tct0();
            ihu0 ihu0VarMo150795c = this.f147018b.mo150795c(new a0u0(b7w0Var, q6w0Var, null), new lhu0(new wiu0() { // from class: l.nev0
                @Override // p153l.wiu0
                /* JADX INFO: renamed from: a */
                public final void mo104077a(boolean z, Context context, c7u0 c7u0Var) {
                    tct0 tct0Var2 = tct0Var;
                    try {
                        bxy0.m106927k();
                        ghy0.m130283a(context, (AdOverlayInfoParcel) tct0Var2.get(), true);
                    } catch (Exception unused) {
                    }
                }
            }, null));
            tct0Var.m190494b(new AdOverlayInfoParcel(zzcVar, null, ihu0VarMo150795c.mo131318h(), null, new zzcei(0, 0, false, false, false), null, null));
            this.f147020d.m171080a();
            return pvw0.m173981h(ihu0VarMo150795c.mo131319i());
        } catch (Throwable th) {
            dct0.m115296e("Error in CustomTabsAdRenderer", th);
            throw th;
        }
    }
}
