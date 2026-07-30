package p153l;

import android.content.ContentResolver;
import android.graphics.Bitmap;
import android.media.ThumbnailUtils;
import android.os.CancellationSignal;
import android.util.Size;
import androidx.annotation.RequiresApi;
import com.facebook.common.internal.ImmutableMap;
import com.facebook.imagepipeline.request.ImageRequest;
import java.io.File;
import java.io.IOException;
import java.util.Map;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(29)
public class axv implements wk90<fb5<db5>> {

    /* JADX INFO: renamed from: a */
    public final Executor f73919a;

    /* JADX INFO: renamed from: b */
    public final ContentResolver f73920b;

    /* JADX INFO: renamed from: l.axv$a */
    public class C15856a extends z3g0<fb5<db5>> {

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ cl90 f73921f;

        /* JADX INFO: renamed from: g */
        public final /* synthetic */ yk90 f73922g;

        /* JADX INFO: renamed from: h */
        public final /* synthetic */ ImageRequest f73923h;

        /* JADX INFO: renamed from: i */
        public final /* synthetic */ CancellationSignal f73924i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C15856a(z06 z06Var, cl90 cl90Var, yk90 yk90Var, String str, cl90 cl90Var2, yk90 yk90Var2, ImageRequest imageRequest, CancellationSignal cancellationSignal) {
            super(z06Var, cl90Var, yk90Var, str);
            this.f73921f = cl90Var2;
            this.f73922g = yk90Var2;
            this.f73923h = imageRequest;
            this.f73924i = cancellationSignal;
        }

        @Override // p153l.z3g0, p153l.a4g0
        /* JADX INFO: renamed from: d */
        public void mo95924d() {
            super.mo95924d();
            this.f73924i.cancel();
        }

        @Override // p153l.z3g0, p153l.a4g0
        /* JADX INFO: renamed from: e */
        public void mo95925e(Exception exc) {
            super.mo95925e(exc);
            this.f73921f.mo110445e(this.f73922g, "LocalThumbnailBitmapSdk29Producer", false);
            this.f73922g.mo117679u("local", "thumbnail_bitmap");
        }

        @Override // p153l.a4g0
        /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
        public void mo8545b(fb5<db5> fb5Var) {
            fb5.m124874v(fb5Var);
        }

        @Override // p153l.z3g0
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public Map<String, String> mo8547i(fb5<db5> fb5Var) {
            return ImmutableMap.m8202of("createdThumbnail", String.valueOf(fb5Var != null));
        }

        @Override // p153l.a4g0
        /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
        public fb5<db5> mo8546c() throws IOException {
            String strM100848e;
            Bitmap bitmapLoadThumbnail;
            Size size = new Size(this.f73923h.m8631o(), this.f73923h.m8630n());
            try {
                strM100848e = axv.this.m100848e(this.f73923h);
            } catch (IllegalArgumentException unused) {
                strM100848e = null;
            }
            if (strM100848e != null) {
                bitmapLoadThumbnail = o7y.m166388c(o7y.m166387b(strM100848e)) ? ThumbnailUtils.createVideoThumbnail(new File(strM100848e), size, this.f73924i) : ThumbnailUtils.createImageThumbnail(new File(strM100848e), size, this.f73924i);
            } else {
                bitmapLoadThumbnail = null;
            }
            if (bitmapLoadThumbnail == null) {
                bitmapLoadThumbnail = axv.this.f73920b.loadThumbnail(this.f73923h.m8639w(), size, this.f73924i);
            }
            if (bitmapLoadThumbnail == null) {
                return null;
            }
            ib5 ib5VarM139281w = ib5.m139281w(bitmapLoadThumbnail, qof0.m177300a(), anm.f72363d, 0);
            this.f73922g.mo97949b("image_format", "thumbnail");
            ib5VarM139281w.mo97950d(this.f73922g.getExtras());
            return fb5.m124865S(ib5VarM139281w);
        }

        @Override // p153l.z3g0, p153l.a4g0
        /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
        public void mo95926f(fb5<db5> fb5Var) {
            super.mo95926f(fb5Var);
            this.f73921f.mo110445e(this.f73922g, "LocalThumbnailBitmapSdk29Producer", fb5Var != null);
            this.f73922g.mo117679u("local", "thumbnail_bitmap");
        }
    }

    /* JADX INFO: renamed from: l.axv$b */
    public class C15857b extends er2 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ z3g0 f73926a;

        public C15857b(z3g0 z3g0Var) {
            this.f73926a = z3g0Var;
        }

        @Override // p153l.er2, p153l.zk90
        /* JADX INFO: renamed from: b */
        public void mo8551b() {
            this.f73926a.m95923a();
        }
    }

    public axv(Executor executor, ContentResolver contentResolver) {
        this.f73919a = executor;
        this.f73920b = contentResolver;
    }

    @Override // p153l.wk90
    /* JADX INFO: renamed from: b */
    public void mo8539b(z06<fb5<db5>> z06Var, yk90 yk90Var) {
        cl90 cl90VarMo117675n = yk90Var.mo117675n();
        ImageRequest imageRequestMo117678t = yk90Var.mo117678t();
        yk90Var.mo117679u("local", "thumbnail_bitmap");
        C15856a c15856a = new C15856a(z06Var, cl90VarMo117675n, yk90Var, "LocalThumbnailBitmapSdk29Producer", cl90VarMo117675n, yk90Var, imageRequestMo117678t, new CancellationSignal());
        yk90Var.mo117677q(new C15857b(c15856a));
        this.f73919a.execute(c15856a);
    }

    /* JADX INFO: renamed from: e */
    public final String m100848e(ImageRequest imageRequest) {
        return i4k0.m138556e(this.f73920b, imageRequest.m8639w());
    }
}
