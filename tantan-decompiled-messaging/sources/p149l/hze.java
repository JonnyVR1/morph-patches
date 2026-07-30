package p149l;

import android.util.Pair;
import com.facebook.imagepipeline.request.ImageRequest;

/* JADX INFO: loaded from: classes.dex */
public class hze extends vm10<Pair<cx3, ImageRequest.RequestLevel>, jze> {

    /* JADX INFO: renamed from: f */
    public final dx3 f110193f;

    public hze(dx3 dx3Var, boolean z, sc90 sc90Var) {
        super(sc90Var, "EncodedCacheKeyMultiplexProducer", "multiplex_enc_cnt", z);
        this.f110193f = dx3Var;
    }

    @Override // p149l.vm10
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public jze mo133668g(jze jzeVar) {
        return jze.m143895m(jzeVar);
    }

    @Override // p149l.vm10
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public Pair<cx3, ImageRequest.RequestLevel> mo133669j(uc90 uc90Var) {
        return Pair.create(this.f110193f.mo113968b(uc90Var.mo155873t(), uc90Var.mo155867k()), uc90Var.mo155860I());
    }
}
