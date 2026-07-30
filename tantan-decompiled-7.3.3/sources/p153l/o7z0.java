package p153l;

import android.content.Context;
import com.google.android.gms.internal.ads.zzdl;
import java.util.List;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes6.dex */
public final class o7z0 implements upt0 {

    /* JADX INFO: renamed from: a */
    public final gku0 f145341a;

    public o7z0(gku0 gku0Var) {
        this.f145341a = gku0Var;
    }

    @Override // p153l.upt0
    /* JADX INFO: renamed from: a */
    public final drt0 mo166390a(Context context, wwy0 wwy0Var, wwy0 wwy0Var2, s1z0 s1z0Var, nlu0 nlu0Var, Executor executor, List list, long j) throws zzdl {
        try {
            ((upt0) Class.forName("androidx.media3.effect.PreviewingSingleInputVideoGraph$Factory").getConstructor(gku0.class).newInstance(this.f145341a)).mo166390a(context, wwy0Var, wwy0Var2, s1z0Var, nlu0Var, executor, list, 0L);
            return null;
        } catch (Exception e) {
            if (e instanceof zzdl) {
                throw ((zzdl) e);
            }
            throw new zzdl(e, -9223372036854775807L);
        }
    }
}
