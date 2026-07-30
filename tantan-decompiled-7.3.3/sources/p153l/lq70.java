package p153l;

import android.content.Context;
import android.net.Uri;
import com.facebook.common.internal.ImmutableList;
import com.facebook.drawee.controller.AbstractDraweeControllerBuilder;
import com.facebook.imagepipeline.request.ImageRequest;
import com.facebook.imagepipeline.request.ImageRequestBuilder;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public class lq70 extends AbstractDraweeControllerBuilder<lq70, ImageRequest, fb5<db5>, qim> {

    /* JADX INFO: renamed from: t */
    public final rjm f133152t;

    /* JADX INFO: renamed from: u */
    public final nq70 f133153u;

    /* JADX INFO: renamed from: v */
    public ImmutableList<rce> f133154v;

    /* JADX INFO: renamed from: w */
    public gjm f133155w;

    /* JADX INFO: renamed from: l.lq70$a */
    public static /* synthetic */ class C18442a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f133156a;

        static {
            int[] iArr = new int[AbstractDraweeControllerBuilder.CacheLevel.values().length];
            f133156a = iArr;
            try {
                iArr[AbstractDraweeControllerBuilder.CacheLevel.FULL_FETCH.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f133156a[AbstractDraweeControllerBuilder.CacheLevel.DISK_CACHE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f133156a[AbstractDraweeControllerBuilder.CacheLevel.BITMAP_MEMORY_CACHE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public lq70(Context context, nq70 nq70Var, rjm rjmVar, Set<v36> set, Set<u36> set2) {
        super(context, set, set2);
        this.f133152t = rjmVar;
        this.f133153u = nq70Var;
    }

    /* JADX INFO: renamed from: H */
    public static ImageRequest.RequestLevel m155324H(AbstractDraweeControllerBuilder.CacheLevel cacheLevel) {
        int i = C18442a.f133156a[cacheLevel.ordinal()];
        if (i == 1) {
            return ImageRequest.RequestLevel.FULL_FETCH;
        }
        if (i == 2) {
            return ImageRequest.RequestLevel.DISK_CACHE;
        }
        if (i == 3) {
            return ImageRequest.RequestLevel.BITMAP_MEMORY_CACHE;
        }
        xmw.m212069a("Cache level", cacheLevel, "is not supported. ");
        return null;
    }

    /* JADX INFO: renamed from: I */
    public final by3 m155325I() {
        ImageRequest imageRequestM8275n = m8275n();
        cy3 cacheKeyFactory = this.f133152t.getCacheKeyFactory();
        if (cacheKeyFactory == null || imageRequestM8275n == null) {
            return null;
        }
        return imageRequestM8275n.m8629m() != null ? cacheKeyFactory.mo113092a(imageRequestM8275n, m8267f()) : cacheKeyFactory.mo113094c(imageRequestM8275n, m8267f());
    }

    @Override // com.facebook.drawee.controller.AbstractDraweeControllerBuilder
    /* JADX INFO: renamed from: J, reason: merged with bridge method [inline-methods] */
    public i6c<fb5<db5>> mo8270i(lde ldeVar, String str, ImageRequest imageRequest, Object obj, AbstractDraweeControllerBuilder.CacheLevel cacheLevel) {
        return this.f133152t.m181721i(imageRequest, obj, m155324H(cacheLevel), m155327K(ldeVar), str);
    }

    /* JADX INFO: renamed from: K */
    public j2d0 m155327K(lde ldeVar) {
        if (ldeVar instanceof kq70) {
            return ((kq70) ldeVar).m150831o0();
        }
        return null;
    }

    @Override // com.facebook.drawee.controller.AbstractDraweeControllerBuilder
    /* JADX INFO: renamed from: L, reason: merged with bridge method [inline-methods] */
    public kq70 mo8285x() {
        if (i9j.m139099d()) {
            i9j.m139097a("PipelineDraweeControllerBuilder#obtainController");
        }
        try {
            lde ldeVarM8277p = m8277p();
            String strM8256e = AbstractDraweeControllerBuilder.m8256e();
            kq70 kq70VarM164288c = ldeVarM8277p instanceof kq70 ? (kq70) ldeVarM8277p : this.f133153u.m164288c();
            kq70VarM164288c.m150833q0(m8286y(kq70VarM164288c, strM8256e), strM8256e, m155325I(), m8267f(), this.f133154v);
            kq70VarM164288c.m150834r0(this.f133155w, this);
            return kq70VarM164288c;
        } finally {
            if (i9j.m139099d()) {
                i9j.m139098b();
            }
        }
    }

    /* JADX INFO: renamed from: M */
    public lq70 m155329M(gjm gjmVar) {
        this.f133155w = gjmVar;
        return m8279r();
    }

    @Override // p153l.xof0
    /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
    public lq70 mo155332a(Uri uri) {
        return uri == null ? (lq70) super.m8259C(null) : (lq70) super.m8259C(ImageRequestBuilder.m8646y(uri).m8663Q(qmd0.m177099e()).m8668a());
    }

    /* JADX INFO: renamed from: O */
    public lq70 m155331O(String str) {
        return (str == null || str.isEmpty()) ? (lq70) super.m8259C(ImageRequest.m8616b(str)) : mo155332a(Uri.parse(str));
    }
}
