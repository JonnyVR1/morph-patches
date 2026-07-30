package p149l;

import android.content.Context;
import android.net.Uri;
import com.facebook.common.internal.ImmutableList;
import com.facebook.drawee.controller.AbstractDraweeControllerBuilder;
import com.facebook.imagepipeline.request.ImageRequest;
import com.facebook.imagepipeline.request.ImageRequestBuilder;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public class fi70 extends AbstractDraweeControllerBuilder<fi70, ImageRequest, fa5<da5>, ngm> {

    /* JADX INFO: renamed from: t */
    public final ohm f97634t;

    /* JADX INFO: renamed from: u */
    public final hi70 f97635u;

    /* JADX INFO: renamed from: v */
    public ImmutableList<nbe> f97636v;

    /* JADX INFO: renamed from: w */
    public dhm f97637w;

    /* JADX INFO: renamed from: l.fi70$a */
    public static /* synthetic */ class C16843a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f97638a;

        static {
            int[] iArr = new int[AbstractDraweeControllerBuilder.CacheLevel.values().length];
            f97638a = iArr;
            try {
                iArr[AbstractDraweeControllerBuilder.CacheLevel.FULL_FETCH.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f97638a[AbstractDraweeControllerBuilder.CacheLevel.DISK_CACHE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f97638a[AbstractDraweeControllerBuilder.CacheLevel.BITMAP_MEMORY_CACHE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public fi70(Context context, hi70 hi70Var, ohm ohmVar, Set<q26> set, Set<p26> set2) {
        super(context, set, set2);
        this.f97634t = ohmVar;
        this.f97635u = hi70Var;
    }

    /* JADX INFO: renamed from: H */
    public static ImageRequest.RequestLevel m121493H(AbstractDraweeControllerBuilder.CacheLevel cacheLevel) {
        int i = C16843a.f97638a[cacheLevel.ordinal()];
        if (i == 1) {
            return ImageRequest.RequestLevel.FULL_FETCH;
        }
        if (i == 2) {
            return ImageRequest.RequestLevel.DISK_CACHE;
        }
        if (i == 3) {
            return ImageRequest.RequestLevel.BITMAP_MEMORY_CACHE;
        }
        yjw.m215098a("Cache level", cacheLevel, "is not supported. ");
        return null;
    }

    /* JADX INFO: renamed from: I */
    public final cx3 m121494I() {
        ImageRequest imageRequestM8221n = m8221n();
        dx3 cacheKeyFactory = this.f97634t.getCacheKeyFactory();
        if (cacheKeyFactory == null || imageRequestM8221n == null) {
            return null;
        }
        return imageRequestM8221n.m8575m() != null ? cacheKeyFactory.mo113967a(imageRequestM8221n, m8213f()) : cacheKeyFactory.mo113969c(imageRequestM8221n, m8213f());
    }

    @Override // com.facebook.drawee.controller.AbstractDraweeControllerBuilder
    /* JADX INFO: renamed from: J, reason: merged with bridge method [inline-methods] */
    public c5c<fa5<da5>> mo8216i(hce hceVar, String str, ImageRequest imageRequest, Object obj, AbstractDraweeControllerBuilder.CacheLevel cacheLevel) {
        return this.f97634t.m164410i(imageRequest, obj, m121493H(cacheLevel), m121496K(hceVar), str);
    }

    /* JADX INFO: renamed from: K */
    public guc0 m121496K(hce hceVar) {
        if (hceVar instanceof ei70) {
            return ((ei70) hceVar).m116638o0();
        }
        return null;
    }

    @Override // com.facebook.drawee.controller.AbstractDraweeControllerBuilder
    /* JADX INFO: renamed from: L, reason: merged with bridge method [inline-methods] */
    public ei70 mo8231x() {
        if (o6j.m162852d()) {
            o6j.m162850a("PipelineDraweeControllerBuilder#obtainController");
        }
        try {
            hce hceVarM8223p = m8223p();
            String strM8202e = AbstractDraweeControllerBuilder.m8202e();
            ei70 ei70VarM131227c = hceVarM8223p instanceof ei70 ? (ei70) hceVarM8223p : this.f97635u.m131227c();
            ei70VarM131227c.m116640q0(m8232y(ei70VarM131227c, strM8202e), strM8202e, m121494I(), m8213f(), this.f97636v);
            ei70VarM131227c.m116642r0(this.f97637w, this);
            return ei70VarM131227c;
        } finally {
            if (o6j.m162852d()) {
                o6j.m162851b();
            }
        }
    }

    /* JADX INFO: renamed from: M */
    public fi70 m121498M(dhm dhmVar) {
        this.f97637w = dhmVar;
        return m8225r();
    }

    @Override // p149l.qgf0
    /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
    public fi70 mo121501a(Uri uri) {
        return uri == null ? (fi70) super.m8205C(null) : (fi70) super.m8205C(ImageRequestBuilder.m8592y(uri).m8609Q(oed0.m163941e()).m8614a());
    }

    /* JADX INFO: renamed from: O */
    public fi70 m121500O(String str) {
        return (str == null || str.isEmpty()) ? (fi70) super.m8205C(ImageRequest.m8562b(str)) : mo121501a(Uri.parse(str));
    }
}
