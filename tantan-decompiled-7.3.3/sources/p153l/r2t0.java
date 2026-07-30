package p153l;

import android.content.Context;
import android.os.RemoteException;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.ads.internal.client.zzl;
import com.google.android.gms.internal.ads.zzccx;

/* JADX INFO: loaded from: classes6.dex */
public final class r2t0 {

    /* JADX INFO: renamed from: e */
    public static eat0 f160973e;

    /* JADX INFO: renamed from: a */
    public final Context f160974a;

    /* JADX INFO: renamed from: b */
    public final AdFormat f160975b;

    /* JADX INFO: renamed from: c */
    @Nullable
    public final xxu0 f160976c;

    /* JADX INFO: renamed from: d */
    @Nullable
    public final String f160977d;

    public r2t0(Context context, AdFormat adFormat, @Nullable xxu0 xxu0Var, @Nullable String str) {
        this.f160974a = context;
        this.f160975b = adFormat;
        this.f160976c = xxu0Var;
        this.f160977d = str;
    }

    @Nullable
    /* JADX INFO: renamed from: a */
    public static eat0 m179566a(Context context) {
        eat0 eat0Var;
        synchronized (r2t0.class) {
            try {
                if (f160973e == null) {
                    f160973e = k6s0.m148568a().m184305o(context, new qws0());
                }
                eat0Var = f160973e;
            } catch (Throwable th) {
                throw th;
            }
        }
        return eat0Var;
    }

    /* JADX INFO: renamed from: b */
    public final void m179567b(yvb0 yvb0Var) {
        zzl zzlVarM141359a;
        eat0 eat0VarM179566a = m179566a(this.f160974a);
        if (eat0VarM179566a == null) {
            yvb0Var.mo120943a("Internal Error, query info generator is null.");
            return;
        }
        Context context = this.f160974a;
        xxu0 xxu0Var = this.f160976c;
        p1m p1mVarM134038Y2 = h950.m134038Y2(context);
        if (xxu0Var == null) {
            zzlVarM141359a = new udy0().m195585a();
        } else {
            zzlVarM141359a = ioy0.f116230a.m141359a(this.f160974a, xxu0Var);
        }
        try {
            eat0VarM179566a.mo108508W6(p1mVarM134038Y2, new zzccx(this.f160977d, this.f160975b.name(), null, zzlVarM141359a), new q2t0(this, yvb0Var));
        } catch (RemoteException unused) {
            yvb0Var.mo120943a("Internal Error.");
        }
    }
}
