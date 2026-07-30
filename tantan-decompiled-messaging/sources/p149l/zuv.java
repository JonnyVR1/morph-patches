package p149l;

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
public class zuv implements sc90<fa5<da5>> {

    /* JADX INFO: renamed from: a */
    public final Executor f204901a;

    /* JADX INFO: renamed from: b */
    public final ContentResolver f204902b;

    /* JADX INFO: renamed from: l.zuv$a */
    public class C21775a extends qvf0<fa5<da5>> {

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ yc90 f204903f;

        /* JADX INFO: renamed from: g */
        public final /* synthetic */ uc90 f204904g;

        /* JADX INFO: renamed from: h */
        public final /* synthetic */ ImageRequest f204905h;

        /* JADX INFO: renamed from: i */
        public final /* synthetic */ CancellationSignal f204906i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C21775a(uz5 uz5Var, yc90 yc90Var, uc90 uc90Var, String str, yc90 yc90Var2, uc90 uc90Var2, ImageRequest imageRequest, CancellationSignal cancellationSignal) {
            super(uz5Var, yc90Var, uc90Var, str);
            this.f204903f = yc90Var2;
            this.f204904g = uc90Var2;
            this.f204905h = imageRequest;
            this.f204906i = cancellationSignal;
        }

        @Override // p149l.qvf0, p149l.rvf0
        /* JADX INFO: renamed from: d */
        public void mo176698d() {
            super.mo176698d();
            this.f204906i.cancel();
        }

        @Override // p149l.qvf0, p149l.rvf0
        /* JADX INFO: renamed from: e */
        public void mo113827e(Exception exc) {
            super.mo113827e(exc);
            this.f204903f.mo104755e(this.f204904g, "LocalThumbnailBitmapSdk29Producer", false);
            this.f204904g.mo155874u("local", "thumbnail_bitmap");
        }

        @Override // p149l.rvf0
        /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
        public void mo8491b(fa5<da5> fa5Var) {
            fa5.m120154v(fa5Var);
        }

        @Override // p149l.qvf0
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public Map<String, String> mo8493i(fa5<da5> fa5Var) {
            return ImmutableMap.m8148of("createdThumbnail", String.valueOf(fa5Var != null));
        }

        @Override // p149l.rvf0
        /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
        public fa5<da5> mo8492c() throws IOException {
            String strM220265e;
            Bitmap bitmapLoadThumbnail;
            Size size = new Size(this.f204905h.m8577o(), this.f204905h.m8576n());
            try {
                strM220265e = zuv.this.m220265e(this.f204905h);
            } catch (IllegalArgumentException unused) {
                strM220265e = null;
            }
            if (strM220265e != null) {
                bitmapLoadThumbnail = ryx.m181716c(ryx.m181715b(strM220265e)) ? ThumbnailUtils.createVideoThumbnail(new File(strM220265e), size, this.f204906i) : ThumbnailUtils.createImageThumbnail(new File(strM220265e), size, this.f204906i);
            } else {
                bitmapLoadThumbnail = null;
            }
            if (bitmapLoadThumbnail == null) {
                bitmapLoadThumbnail = zuv.this.f204902b.loadThumbnail(this.f204905h.m8585w(), size, this.f204906i);
            }
            if (bitmapLoadThumbnail == null) {
                return null;
            }
            ia5 ia5VarM135130w = ia5.m135130w(bitmapLoadThumbnail, jgf0.m141281a(), ykm.f198776d, 0);
            this.f204904g.mo155861b("image_format", "thumbnail");
            ia5VarM135130w.mo155862d(this.f204904g.getExtras());
            return fa5.m120145S(ia5VarM135130w);
        }

        @Override // p149l.qvf0, p149l.rvf0
        /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
        public void mo113828f(fa5<da5> fa5Var) {
            super.mo113828f(fa5Var);
            this.f204903f.mo104755e(this.f204904g, "LocalThumbnailBitmapSdk29Producer", fa5Var != null);
            this.f204904g.mo155874u("local", "thumbnail_bitmap");
        }
    }

    /* JADX INFO: renamed from: l.zuv$b */
    public class C21776b extends nq2 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ qvf0 f204908a;

        public C21776b(qvf0 qvf0Var) {
            this.f204908a = qvf0Var;
        }

        @Override // p149l.nq2, p149l.vc90
        /* JADX INFO: renamed from: b */
        public void mo8497b() {
            this.f204908a.m181279a();
        }
    }

    public zuv(Executor executor, ContentResolver contentResolver) {
        this.f204901a = executor;
        this.f204902b = contentResolver;
    }

    @Override // p149l.sc90
    /* JADX INFO: renamed from: b */
    public void mo8485b(uz5<fa5<da5>> uz5Var, uc90 uc90Var) {
        yc90 yc90VarMo155870n = uc90Var.mo155870n();
        ImageRequest imageRequestMo155873t = uc90Var.mo155873t();
        uc90Var.mo155874u("local", "thumbnail_bitmap");
        C21775a c21775a = new C21775a(uz5Var, yc90VarMo155870n, uc90Var, "LocalThumbnailBitmapSdk29Producer", yc90VarMo155870n, uc90Var, imageRequestMo155873t, new CancellationSignal());
        uc90Var.mo155872q(new C21776b(c21775a));
        this.f204901a.execute(c21775a);
    }

    /* JADX INFO: renamed from: e */
    public final String m220265e(ImageRequest imageRequest) {
        return fvj0.m123310e(this.f204902b, imageRequest.m8585w());
    }
}
