package p153l;

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
public class exv implements wk90<fb5<db5>> {

    /* JADX INFO: renamed from: a */
    public final Executor f96345a;

    /* JADX INFO: renamed from: b */
    public final ContentResolver f96346b;

    /* JADX INFO: renamed from: l.exv$a */
    public class C16854a extends z3g0<fb5<db5>> {

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ cl90 f96347f;

        /* JADX INFO: renamed from: g */
        public final /* synthetic */ yk90 f96348g;

        /* JADX INFO: renamed from: h */
        public final /* synthetic */ ImageRequest f96349h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C16854a(z06 z06Var, cl90 cl90Var, yk90 yk90Var, String str, cl90 cl90Var2, yk90 yk90Var2, ImageRequest imageRequest) {
            super(z06Var, cl90Var, yk90Var, str);
            this.f96347f = cl90Var2;
            this.f96348g = yk90Var2;
            this.f96349h = imageRequest;
        }

        @Override // p153l.z3g0, p153l.a4g0
        /* JADX INFO: renamed from: e */
        public void mo95925e(Exception exc) {
            super.mo95925e(exc);
            this.f96347f.mo110445e(this.f96348g, "VideoThumbnailProducer", false);
            this.f96348g.mo117679u("local", "video");
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
        public fb5<db5> mo8546c() throws Exception {
            String strM123108i;
            try {
                strM123108i = exv.this.m123108i(this.f96349h);
            } catch (IllegalArgumentException unused) {
                strM123108i = null;
            }
            Bitmap bitmapCreateVideoThumbnail = strM123108i != null ? ThumbnailUtils.createVideoThumbnail(strM123108i, exv.m123106g(this.f96349h)) : null;
            if (bitmapCreateVideoThumbnail == null) {
                bitmapCreateVideoThumbnail = exv.m123107h(exv.this.f96346b, this.f96349h.m8639w());
            }
            if (bitmapCreateVideoThumbnail == null) {
                return null;
            }
            ib5 ib5VarM139281w = ib5.m139281w(bitmapCreateVideoThumbnail, qof0.m177300a(), anm.f72363d, 0);
            this.f96348g.mo97949b("image_format", "thumbnail");
            ib5VarM139281w.mo97950d(this.f96348g.getExtras());
            return fb5.m124865S(ib5VarM139281w);
        }

        @Override // p153l.z3g0, p153l.a4g0
        /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
        public void mo95926f(fb5<db5> fb5Var) {
            super.mo95926f(fb5Var);
            this.f96347f.mo110445e(this.f96348g, "VideoThumbnailProducer", fb5Var != null);
            this.f96348g.mo117679u("local", "video");
        }
    }

    /* JADX INFO: renamed from: l.exv$b */
    public class C16855b extends er2 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ z3g0 f96351a;

        public C16855b(z3g0 z3g0Var) {
            this.f96351a = z3g0Var;
        }

        @Override // p153l.er2, p153l.zk90
        /* JADX INFO: renamed from: b */
        public void mo8551b() {
            this.f96351a.m95923a();
        }
    }

    public exv(Executor executor, ContentResolver contentResolver) {
        this.f96345a = executor;
        this.f96346b = contentResolver;
    }

    /* JADX INFO: renamed from: g */
    public static int m123106g(ImageRequest imageRequest) {
        return (imageRequest.m8631o() > 96 || imageRequest.m8630n() > 96) ? 1 : 3;
    }

    /* JADX INFO: renamed from: h */
    public static Bitmap m123107h(ContentResolver contentResolver, Uri uri) {
        try {
            ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor = contentResolver.openFileDescriptor(uri, "r");
            wn80.m207182g(parcelFileDescriptorOpenFileDescriptor);
            MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
            mediaMetadataRetriever.setDataSource(parcelFileDescriptorOpenFileDescriptor.getFileDescriptor());
            return mediaMetadataRetriever.getFrameAtTime(-1L);
        } catch (FileNotFoundException unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public String m123108i(ImageRequest imageRequest) {
        return i4k0.m138556e(this.f96346b, imageRequest.m8639w());
    }

    @Override // p153l.wk90
    /* JADX INFO: renamed from: b */
    public void mo8539b(z06<fb5<db5>> z06Var, yk90 yk90Var) {
        cl90 cl90VarMo117675n = yk90Var.mo117675n();
        ImageRequest imageRequestMo117678t = yk90Var.mo117678t();
        yk90Var.mo117679u("local", "video");
        C16854a c16854a = new C16854a(z06Var, cl90VarMo117675n, yk90Var, "VideoThumbnailProducer", cl90VarMo117675n, yk90Var, imageRequestMo117678t);
        yk90Var.mo117677q(new C16855b(c16854a));
        this.f96345a.execute(c16854a);
    }
}
