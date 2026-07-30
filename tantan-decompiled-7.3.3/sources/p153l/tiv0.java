package p153l;

import android.os.RemoteException;
import androidx.annotation.Nullable;
import com.google.android.gms.internal.ads.zzfho;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public final class tiv0 implements rcv0 {

    /* JADX INFO: renamed from: a */
    public final dkv0 f174511a;

    /* JADX INFO: renamed from: b */
    public final huu0 f174512b;

    public tiv0(dkv0 dkv0Var, huu0 huu0Var) {
        this.f174511a = dkv0Var;
        this.f174512b = huu0Var;
    }

    @Override // p153l.rcv0
    @Nullable
    /* JADX INFO: renamed from: a */
    public final scv0 mo115957a(String str, JSONObject jSONObject) throws zzfho {
        hzs0 hzs0VarM137254b;
        if (((Boolean) jas0.m144075c().m176505a(sgs0.f167965E1)).booleanValue()) {
            try {
                hzs0VarM137254b = this.f174512b.m137254b(str);
            } catch (RemoteException e) {
                dct0.m115296e("Coundn't create RTB adapter: ", e);
                hzs0VarM137254b = null;
            }
        } else {
            hzs0VarM137254b = this.f174511a.m116686a(str);
        }
        if (hzs0VarM137254b == null) {
            return null;
        }
        return new scv0(hzs0VarM137254b, new vev0(), str);
    }
}
