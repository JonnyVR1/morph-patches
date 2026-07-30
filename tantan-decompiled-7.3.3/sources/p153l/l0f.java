package p153l;

import android.util.Pair;
import com.facebook.imagepipeline.request.ImageRequest;

/* JADX INFO: loaded from: classes.dex */
public class l0f extends dv10<Pair<by3, ImageRequest.RequestLevel>, n0f> {

    /* JADX INFO: renamed from: f */
    public final cy3 f129559f;

    public l0f(cy3 cy3Var, boolean z, wk90 wk90Var) {
        super(wk90Var, "EncodedCacheKeyMultiplexProducer", "multiplex_enc_cnt", z);
        this.f129559f = cy3Var;
    }

    @Override // p153l.dv10
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public n0f mo118236g(n0f n0fVar) {
        return n0f.m160958m(n0fVar);
    }

    @Override // p153l.dv10
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public Pair<by3, ImageRequest.RequestLevel> mo118239j(yk90 yk90Var) {
        return Pair.create(this.f129559f.mo113093b(yk90Var.mo117678t(), yk90Var.mo117672k()), yk90Var.mo117667I());
    }
}
