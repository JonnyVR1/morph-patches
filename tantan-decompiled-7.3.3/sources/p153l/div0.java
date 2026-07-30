package p153l;

import androidx.annotation.Nullable;
import com.google.android.gms.internal.ads.zzfho;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public final class div0 implements rcv0 {

    /* JADX INFO: renamed from: a */
    public final Map f88715a = new HashMap();

    /* JADX INFO: renamed from: b */
    public final huu0 f88716b;

    public div0(huu0 huu0Var) {
        this.f88716b = huu0Var;
    }

    @Override // p153l.rcv0
    @Nullable
    /* JADX INFO: renamed from: a */
    public final scv0 mo115957a(String str, JSONObject jSONObject) throws zzfho {
        scv0 scv0Var;
        synchronized (this) {
            try {
                scv0Var = (scv0) this.f88715a.get(str);
                if (scv0Var == null) {
                    scv0Var = new scv0(this.f88716b.m137255c(str, jSONObject), new wev0(), str);
                    this.f88715a.put(str, scv0Var);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return scv0Var;
    }
}
