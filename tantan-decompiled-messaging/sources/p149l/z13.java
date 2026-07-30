package p149l;

import android.util.Pair;
import com.facebook.imagepipeline.request.ImageRequest;

/* JADX INFO: loaded from: classes.dex */
public class z13 extends vm10<Pair<cx3, ImageRequest.RequestLevel>, fa5<da5>> {

    /* JADX INFO: renamed from: f */
    public final dx3 f201045f;

    public z13(dx3 dx3Var, sc90 sc90Var) {
        super(sc90Var, "BitmapMemoryCacheKeyMultiplexProducer", "multiplex_bmp_cnt");
        this.f201045f = dx3Var;
    }

    @Override // p149l.vm10
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public fa5<da5> mo133668g(fa5<da5> fa5Var) {
        return fa5.m120152t(fa5Var);
    }

    @Override // p149l.vm10
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public Pair<cx3, ImageRequest.RequestLevel> mo133669j(uc90 uc90Var) {
        return Pair.create(this.f201045f.mo113969c(uc90Var.mo155873t(), uc90Var.mo155867k()), uc90Var.mo155860I());
    }
}
