package p149l;

import android.util.JsonReader;
import com.google.android.gms.internal.ads.zzbze;
import com.tencent.youtu.sdkkitframework.common.WeJson;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.concurrent.Executor;
import org.json.JSONException;

/* JADX INFO: loaded from: classes6.dex */
public final class ser0 implements rlw0 {

    /* JADX INFO: renamed from: a */
    public final Executor f164033a;

    /* JADX INFO: renamed from: b */
    public final puu0 f164034b;

    public ser0(Executor executor, puu0 puu0Var) {
        this.f164033a = executor;
        this.f164034b = puu0Var;
    }

    @Override // p149l.rlw0
    public final /* bridge */ /* synthetic */ gnr zza(Object obj) throws Exception {
        final zzbze zzbzeVar = (zzbze) obj;
        return jmw0.m142241n(this.f164034b.m171481b(zzbzeVar), new rlw0() { // from class: l.gdr0
            @Override // p149l.rlw0
            public final gnr zza(Object obj2) {
                lhr0 lhr0Var = new lhr0(new JsonReader(new InputStreamReader((InputStream) obj2)));
                try {
                    lhr0Var.f128134b = exr0.m118703b().m134102j(zzbzeVar.zza).toString();
                } catch (JSONException unused) {
                    lhr0Var.f128134b = WeJson.EMPTY_MAP;
                }
                return jmw0.m142235h(lhr0Var);
            }
        }, this.f164033a);
    }
}
