package p153l;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzl;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class qdw0 {
    /* JADX INFO: renamed from: a */
    public static rdw0 m176209a(Context context, int i) {
        boolean zBooleanValue;
        if (hew0.m134676a()) {
            int i2 = i - 2;
            if (i2 != 20 && i2 != 21) {
                switch (i2) {
                    case 2:
                    case 3:
                    case 6:
                    case 7:
                    case 8:
                        zBooleanValue = ((Boolean) ris0.f163391c.m149974e()).booleanValue();
                        break;
                    case 4:
                    case 9:
                    case 10:
                    case 11:
                    case 12:
                    case 13:
                        zBooleanValue = ((Boolean) ris0.f163392d.m149974e()).booleanValue();
                        break;
                    case 5:
                        zBooleanValue = ((Boolean) ris0.f163390b.m149974e()).booleanValue();
                        break;
                }
            } else {
                zBooleanValue = ((Boolean) ris0.f163393e.m149974e()).booleanValue();
            }
            if (zBooleanValue) {
                return new tdw0(context, i);
            }
        }
        return new new0();
    }

    /* JADX INFO: renamed from: b */
    public static rdw0 m176210b(Context context, int i, int i2, zzl zzlVar) {
        rdw0 rdw0VarM176209a = m176209a(context, i);
        if (rdw0VarM176209a instanceof tdw0) {
            rdw0VarM176209a.zzh();
            rdw0VarM176209a.zzm(i2);
            if (bew0.m103789e(zzlVar.zzp)) {
                rdw0VarM176209a.mo162913c(zzlVar.zzp);
            }
        }
        return rdw0VarM176209a;
    }
}
