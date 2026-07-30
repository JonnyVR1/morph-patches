package p149l;

import android.content.Context;
import com.google.android.gms.internal.ads.zzdl;
import java.util.List;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes6.dex */
public final class iyy0 implements ogt0 {

    /* JADX INFO: renamed from: a */
    public final abu0 f115517a;

    public iyy0(abu0 abu0Var) {
        this.f115517a = abu0Var;
    }

    @Override // p149l.ogt0
    /* JADX INFO: renamed from: a */
    public final xht0 mo139023a(Context context, qny0 qny0Var, qny0 qny0Var2, msy0 msy0Var, hcu0 hcu0Var, Executor executor, List list, long j) throws zzdl {
        try {
            ((ogt0) Class.forName("androidx.media3.effect.PreviewingSingleInputVideoGraph$Factory").getConstructor(abu0.class).newInstance(this.f115517a)).mo139023a(context, qny0Var, qny0Var2, msy0Var, hcu0Var, executor, list, 0L);
            return null;
        } catch (Exception e) {
            if (e instanceof zzdl) {
                throw ((zzdl) e);
            }
            throw new zzdl(e, -9223372036854775807L);
        }
    }
}
