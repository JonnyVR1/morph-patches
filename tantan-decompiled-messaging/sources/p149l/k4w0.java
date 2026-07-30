package p149l;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzl;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class k4w0 {
    /* JADX INFO: renamed from: a */
    public static l4w0 m144514a(Context context, int i) {
        boolean zBooleanValue;
        if (b5w0.m100343a()) {
            int i2 = i - 2;
            if (i2 != 20 && i2 != 21) {
                switch (i2) {
                    case 2:
                    case 3:
                    case 6:
                    case 7:
                    case 8:
                        zBooleanValue = ((Boolean) l9s0.f127142c.m115379e()).booleanValue();
                        break;
                    case 4:
                    case 9:
                    case 10:
                    case 11:
                    case 12:
                    case 13:
                        zBooleanValue = ((Boolean) l9s0.f127143d.m115379e()).booleanValue();
                        break;
                    case 5:
                        zBooleanValue = ((Boolean) l9s0.f127141b.m115379e()).booleanValue();
                        break;
                }
            } else {
                zBooleanValue = ((Boolean) l9s0.f127144e.m115379e()).booleanValue();
            }
            if (zBooleanValue) {
                return new n4w0(context, i);
            }
        }
        return new h5w0();
    }

    /* JADX INFO: renamed from: b */
    public static l4w0 m144515b(Context context, int i, int i2, zzl zzlVar) {
        l4w0 l4w0VarM144514a = m144514a(context, i);
        if (l4w0VarM144514a instanceof n4w0) {
            l4w0VarM144514a.zzh();
            l4w0VarM144514a.zzm(i2);
            if (v4w0.m197069e(zzlVar.zzp)) {
                l4w0VarM144514a.mo129464c(zzlVar.zzp);
            }
        }
        return l4w0VarM144514a;
    }
}
