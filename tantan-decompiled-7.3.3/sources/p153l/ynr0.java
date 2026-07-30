package p153l;

import android.util.JsonReader;
import com.google.android.gms.internal.ads.zzbze;
import com.tencent.youtu.sdkkitframework.common.WeJson;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.concurrent.Executor;
import org.json.JSONException;

/* JADX INFO: loaded from: classes6.dex */
public final class ynr0 implements xuw0 {

    /* JADX INFO: renamed from: a */
    public final Executor f200916a;

    /* JADX INFO: renamed from: b */
    public final v3v0 f200917b;

    public ynr0(Executor executor, v3v0 v3v0Var) {
        this.f200916a = executor;
        this.f200917b = v3v0Var;
    }

    @Override // p153l.xuw0
    public final /* bridge */ /* synthetic */ hpr zza(Object obj) throws Exception {
        final zzbze zzbzeVar = (zzbze) obj;
        return pvw0.m173987n(this.f200917b.m199630b(zzbzeVar), new xuw0() { // from class: l.mmr0
            @Override // p153l.xuw0
            public final hpr zza(Object obj2) {
                rqr0 rqr0Var = new rqr0(new JsonReader(new InputStreamReader((InputStream) obj2)));
                try {
                    rqr0Var.f164515b = k6s0.m148569b().m167055j(zzbzeVar.zza).toString();
                } catch (JSONException unused) {
                    rqr0Var.f164515b = WeJson.EMPTY_MAP;
                }
                return pvw0.m173981h(rqr0Var);
            }
        }, this.f200916a);
    }
}
