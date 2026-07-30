package p149l;

import android.content.ContentResolver;
import android.graphics.Bitmap;
import android.media.MediaMetadataRetriever;
import android.media.ThumbnailUtils;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import com.facebook.common.internal.ImmutableMap;
import com.facebook.imagepipeline.request.ImageRequest;
import java.io.FileNotFoundException;
import java.util.Map;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public class dvv implements sc90<fa5<da5>> {

    /* JADX INFO: renamed from: a */
    public final Executor f88104a;

    /* JADX INFO: renamed from: b */
    public final ContentResolver f88105b;

    /* JADX INFO: renamed from: l.dvv$a */
    public class C16478a extends qvf0<fa5<da5>> {

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ yc90 f88106f;

        /* JADX INFO: renamed from: g */
        public final /* synthetic */ uc90 f88107g;

        /* JADX INFO: renamed from: h */
        public final /* synthetic */ ImageRequest f88108h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C16478a(uz5 uz5Var, yc90 yc90Var, uc90 uc90Var, String str, yc90 yc90Var2, uc90 uc90Var2, ImageRequest imageRequest) {
            super(uz5Var, yc90Var, uc90Var, str);
            this.f88106f = yc90Var2;
            this.f88107g = uc90Var2;
            this.f88108h = imageRequest;
        }

        @Override // p149l.qvf0, p149l.rvf0
        /* JADX INFO: renamed from: e */
        public void mo113827e(Exception exc) {
            super.mo113827e(exc);
            this.f88106f.mo104755e(this.f88107g, "VideoThumbnailProducer", false);
            this.f88107g.mo155874u("local", "video");
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
        public fa5<da5> mo8492c() throws Exception {
            String strM113826i;
            try {
                strM113826i = dvv.this.m113826i(this.f88108h);
            } catch (IllegalArgumentException unused) {
                strM113826i = null;
            }
            Bitmap bitmapCreateVideoThumbnail = strM113826i != null ? ThumbnailUtils.createVideoThumbnail(strM113826i, dvv.m113824g(this.f88108h)) : null;
            if (bitmapCreateVideoThumbnail == null) {
                bitmapCreateVideoThumbnail = dvv.m113825h(dvv.this.f88105b, this.f88108h.m8585w());
            }
            if (bitmapCreateVideoThumbnail == null) {
                return null;
            }
            ia5 ia5VarM135130w = ia5.m135130w(bitmapCreateVideoThumbnail, jgf0.m141281a(), ykm.f198776d, 0);
            this.f88107g.mo155861b("image_format", "thumbnail");
            ia5VarM135130w.mo155862d(this.f88107g.getExtras());
            return fa5.m120145S(ia5VarM135130w);
        }

        @Override // p149l.qvf0, p149l.rvf0
        /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
        public void mo113828f(fa5<da5> fa5Var) {
            super.mo113828f(fa5Var);
            this.f88106f.mo104755e(this.f88107g, "VideoThumbnailProducer", fa5Var != null);
            this.f88107g.mo155874u("local", "video");
        }
    }

    /* JADX INFO: renamed from: l.dvv$b */
    public class C16479b extends nq2 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ qvf0 f88110a;

        public C16479b(qvf0 qvf0Var) {
            this.f88110a = qvf0Var;
        }

        @Override // p149l.nq2, p149l.vc90
        /* JADX INFO: renamed from: b */
        public void mo8497b() {
            this.f88110a.m181279a();
        }
    }

    public dvv(Executor executor, ContentResolver contentResolver) {
        this.f88104a = executor;
        this.f88105b = contentResolver;
    }

    /* JADX INFO: renamed from: g */
    public static int m113824g(ImageRequest imageRequest) {
        return (imageRequest.m8577o() > 96 || imageRequest.m8576n() > 96) ? 1 : 3;
    }

    /* JADX INFO: renamed from: h */
    public static Bitmap m113825h(ContentResolver contentResolver, Uri uri) {
        try {
            ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor = contentResolver.openFileDescriptor(uri, "r");
            rf80.m179116g(parcelFileDescriptorOpenFileDescriptor);
            MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
            mediaMetadataRetriever.setDataSource(parcelFileDescriptorOpenFileDescriptor.getFileDescriptor());
            return mediaMetadataRetriever.getFrameAtTime(-1L);
        } catch (FileNotFoundException unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public String m113826i(ImageRequest imageRequest) {
        return fvj0.m123310e(this.f88105b, imageRequest.m8585w());
    }

    @Override // p149l.sc90
    /* JADX INFO: renamed from: b */
    public void mo8485b(uz5<fa5<da5>> uz5Var, uc90 uc90Var) {
        yc90 yc90VarMo155870n = uc90Var.mo155870n();
        ImageRequest imageRequestMo155873t = uc90Var.mo155873t();
        uc90Var.mo155874u("local", "video");
        C16478a c16478a = new C16478a(uz5Var, yc90VarMo155870n, uc90Var, "VideoThumbnailProducer", yc90VarMo155870n, uc90Var, imageRequestMo155873t);
        uc90Var.mo155872q(new C16479b(c16478a));
        this.f88104a.execute(c16478a);
    }
}
