package p153l;

import android.util.Pair;
import com.facebook.imagepipeline.request.ImageRequest;

/* JADX INFO: loaded from: classes.dex */
public class p23 extends dv10<Pair<by3, ImageRequest.RequestLevel>, fb5<db5>> {

    /* JADX INFO: renamed from: f */
    public final cy3 f150235f;

    public p23(cy3 cy3Var, wk90 wk90Var) {
        super(wk90Var, "BitmapMemoryCacheKeyMultiplexProducer", "multiplex_bmp_cnt");
        this.f150235f = cy3Var;
    }

    @Override // p153l.dv10
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public fb5<db5> mo118236g(fb5<db5> fb5Var) {
        return fb5.m124872t(fb5Var);
    }

    @Override // p153l.dv10
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public Pair<by3, ImageRequest.RequestLevel> mo118239j(yk90 yk90Var) {
        return Pair.create(this.f150235f.mo113094c(yk90Var.mo117678t(), yk90Var.mo117672k()), yk90Var.mo117667I());
    }
}
