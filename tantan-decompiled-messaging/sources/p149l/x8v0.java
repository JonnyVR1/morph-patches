package p149l;

import androidx.annotation.Nullable;
import com.google.android.gms.internal.ads.zzfho;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public final class x8v0 implements l3v0 {

    /* JADX INFO: renamed from: a */
    public final Map f191559a = new HashMap();

    /* JADX INFO: renamed from: b */
    public final blu0 f191560b;

    public x8v0(blu0 blu0Var) {
        this.f191560b = blu0Var;
    }

    @Override // p149l.l3v0
    @Nullable
    /* JADX INFO: renamed from: a */
    public final m3v0 mo148409a(String str, JSONObject jSONObject) throws zzfho {
        m3v0 m3v0Var;
        synchronized (this) {
            try {
                m3v0Var = (m3v0) this.f191559a.get(str);
                if (m3v0Var == null) {
                    m3v0Var = new m3v0(this.f191560b.m102563c(str, jSONObject), new q5v0(), str);
                    this.f191559a.put(str, m3v0Var);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return m3v0Var;
    }
}
