package p149l;

import android.os.RemoteException;
import androidx.annotation.Nullable;
import com.google.android.gms.internal.ads.zzfho;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public final class n9v0 implements l3v0 {

    /* JADX INFO: renamed from: a */
    public final xav0 f137840a;

    /* JADX INFO: renamed from: b */
    public final blu0 f137841b;

    public n9v0(xav0 xav0Var, blu0 blu0Var) {
        this.f137840a = xav0Var;
        this.f137841b = blu0Var;
    }

    @Override // p149l.l3v0
    @Nullable
    /* JADX INFO: renamed from: a */
    public final m3v0 mo148409a(String str, JSONObject jSONObject) throws zzfho {
        bqs0 bqs0VarM102562b;
        if (((Boolean) d1s0.m109677c().m144697a(m7s0.f131894E1)).booleanValue()) {
            try {
                bqs0VarM102562b = this.f137841b.m102562b(str);
            } catch (RemoteException e) {
                x2t0.m206867e("Coundn't create RTB adapter: ", e);
                bqs0VarM102562b = null;
            }
        } else {
            bqs0VarM102562b = this.f137840a.m207683a(str);
        }
        if (bqs0VarM102562b == null) {
            return null;
        }
        return new m3v0(bqs0VarM102562b, new p5v0(), str);
    }
}
