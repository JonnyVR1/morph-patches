package p006l;

import android.graphics.Bitmap;
import android.graphics.BitmapRegionDecoder;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.BitmapDrawable;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Pair;
import android.view.View;
import androidx.annotation.Nullable;
import com.facebook.common.memory.PooledByteBuffer;
import com.facebook.drawee.view.DraweeView;
import com.facebook.drawee.view.SimpleDraweeView;
import com.facebook.imagepipeline.common.Priority;
import com.facebook.imagepipeline.request.ImageRequest;
import com.facebook.imagepipeline.request.ImageRequestBuilder;
import com.p000p1.mobile.putong.api.fresco.FrescoImageRequestException;
import com.p000p1.mobile.putong.api.fresco.FrescoImageTrustManagerException;
import com.p1.mobile.android.app.App;
import com.p1.mobile.putong.data.Dimension;
import com.p1.mobile.putong.data.Media;
import com.p1.mobile.putong.data.Picture;
import com.p1.mobile.putong.remote_config.RemoteConfig;
import com.p1.mobile.putong.util.TrackMediaUploadUtil;
import com.tantanapp.common.network.NetworkTrackInfo;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.security.SecureRandom;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSession;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;
import l.ab80;
import l.af2;
import l.biq;
import l.bjj0;
import l.c5c;
import l.ciq;
import l.cx3;
import l.e30;
import l.e51;
import l.fa5;
import l.fi70;
import l.fvj0;
import l.g30;
import l.g84;
import l.guc0;
import l.h7;
import l.jo0;
import l.k850;
import l.l6j;
import l.lfi;
import l.mfi;
import l.mkd0;
import l.n850;
import l.ngm;
import l.nim;
import l.nvc0;
import l.oed0;
import l.ox2;
import l.pgm;
import l.pgy;
import l.ph80;
import l.qim;
import l.rhi;
import l.rim;
import l.rld;
import l.s2e;
import l.shm;
import l.sl2;
import l.stc0;
import l.t95;
import l.ti2;
import l.vwb;
import l.xdl0;
import l.ym2;
import l.z3g0;
import l.zem;
import org.json.JSONObject;
import rx.c;
import v.VDraweeView;
import v.fresco.photodraweeview.PhotoDraweeView;
import v.fresco.subscaleview.SubsamplingScaleImageView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class bkb0 extends sl2 {

    /* JADX INFO: renamed from: g */
    public static boolean f8939g = m12707S();

    /* JADX INFO: renamed from: f */
    public final ConcurrentHashMap<String, String> f8940f;

    /* JADX INFO: renamed from: l.bkb0$a */
    public class C0561a extends rld {
        /* JADX INFO: renamed from: e */
        public Uri m12793e(Uri uri) {
            return Uri.parse(Media.URL_TO_CACHEKEY(uri.toString()));
        }
    }

    /* JADX INFO: renamed from: l.bkb0$c */
    public class C0563c implements rim {
        public C0563c() {
        }

        /* JADX INFO: renamed from: a */
        public void m12794a(stc0 stc0Var) {
            xc20.m27195c(stc0Var, ad20.m11809b());
        }

        /* JADX INFO: renamed from: b */
        public stc0 m12795b(stc0 stc0Var, NetworkTrackInfo.ReportType reportType) {
            return xc20.m27194b(stc0Var, reportType);
        }

        /* JADX INFO: renamed from: c */
        public void m12796c(stc0 stc0Var, Throwable th) {
            xc20.m27193a(stc0Var, th);
            if (!bkb0.f8939g || bkb0.m12709W(th)) {
                return;
            }
            CrashHelper.c(new FrescoImageRequestException(th));
        }

        public void requestCancel(stc0 stc0Var) {
            xc20.m27196d(stc0Var);
        }
    }

    /* JADX INFO: renamed from: l.bkb0$d */
    public class C0564d extends af2 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ e30 f8942a;

        public C0564d(e30 e30Var) {
            this.f8942a = e30Var;
        }

        /* JADX INFO: renamed from: e */
        public void m12797e(c5c c5cVar) {
            this.f8942a.call((Object) null);
        }

        /* JADX INFO: renamed from: g */
        public void m12798g(@Nullable Bitmap bitmap) {
            if (bitmap == null || bitmap.getHeight() <= 0 || bitmap.getWidth() <= 0) {
                this.f8942a.call((Object) null);
            } else {
                this.f8942a.call(bitmap);
            }
        }
    }

    /* JADX INFO: renamed from: l.bkb0$e */
    public class C0565e extends SubsamplingScaleImageView.f {

        /* JADX INFO: renamed from: a */
        public boolean f8944a = true;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ PhotoDraweeView f8945b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ SubsamplingScaleImageView f8946c;

        public C0565e(PhotoDraweeView photoDraweeView, SubsamplingScaleImageView subsamplingScaleImageView) {
            this.f8945b = photoDraweeView;
            this.f8946c = subsamplingScaleImageView;
        }

        /* JADX INFO: renamed from: b */
        public void m12799b() {
            if (this.f8944a) {
                float fY0 = xdl0.y0() / (this.f8945b.getOriginalWidth() <= 960.0f ? this.f8945b.getOriginalWidth() : 960.0f);
                if (fY0 > this.f8946c.getMaxScale()) {
                    this.f8946c.setMaxScale(fY0);
                }
                this.f8946c.setDoubleTapZoomScale(fY0);
                this.f8946c.D0(fY0, new PointF(0.0f, 0.0f));
                this.f8946c.setAlpha(1.0f);
                this.f8944a = false;
            }
        }

        /* JADX INFO: renamed from: f */
        public void m12800f(Exception exc) {
            this.f8946c.setVisibility(4);
        }
    }

    /* JADX INFO: renamed from: l.bkb0$f */
    public class C0566f extends sl2.b {

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ Picture.ImageUri f8948c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0566f(ym2 ym2Var, Picture.ImageUri imageUri) {
            super(ym2Var);
            this.f8948c = imageUri;
        }

        /* JADX INFO: renamed from: a */
        public void m12801a(String str) {
            super.a(str);
            Picture.ImageUri imageUri = this.f8948c;
            if (imageUri != null) {
                TrackMediaUploadUtil.Z(imageUri.formatted());
            }
        }

        /* JADX INFO: renamed from: d */
        public void m12802d(String str, Throwable th) {
            super.d(str, th);
            Picture.ImageUri imageUri = this.f8948c;
            if (imageUri != null) {
                TrackMediaUploadUtil.Z(imageUri.formatted());
            }
        }
    }

    /* JADX INFO: renamed from: l.bkb0$g */
    public class C0567g extends ym2 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Picture.ImageUri f8950a;

        public C0567g(Picture.ImageUri imageUri) {
            this.f8950a = imageUri;
        }

        /* JADX INFO: renamed from: c */
        public void m12803c(String str, Throwable th) {
            super.c(str, th);
            Picture.ImageUri imageUri = this.f8950a;
            if (imageUri != null) {
                TrackMediaUploadUtil.Z(imageUri.formatted());
            }
        }

        /* JADX INFO: renamed from: f */
        public void m12804f(String str) {
            super.f(str);
            Picture.ImageUri imageUri = this.f8950a;
            if (imageUri != null) {
                TrackMediaUploadUtil.Z(imageUri.formatted());
            }
        }
    }

    /* JADX INFO: renamed from: l.bkb0$h */
    public class C0568h extends ti2<fa5<PooledByteBuffer>> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ VDraweeView f8952a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Picture.ImageUri f8953b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ int f8954c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ int f8955d;

        public C0568h(VDraweeView vDraweeView, Picture.ImageUri imageUri, int i, int i2) {
            this.f8952a = vDraweeView;
            this.f8953b = imageUri;
            this.f8954c = i;
            this.f8955d = i2;
        }

        /* JADX INFO: renamed from: e */
        public void m12805e(c5c<fa5<PooledByteBuffer>> c5cVar) {
            bkb0.this.m12744L0(this.f8952a, this.f8953b.formatted());
        }

        /* JADX INFO: renamed from: f */
        public void m12806f(c5c<fa5<PooledByteBuffer>> c5cVar) {
            if (c5cVar == null || !c5cVar.e() || c5cVar.getResult() == null || ((fa5) c5cVar.getResult()).B() == null) {
                return;
            }
            bkb0.this.m12775h0(this.f8952a, this.f8953b, new ab80((PooledByteBuffer) ((fa5) c5cVar.getResult()).B()), this.f8954c, this.f8955d);
        }
    }

    /* JADX INFO: renamed from: l.bkb0$i */
    public class C0569i extends SubsamplingScaleImageView.f {

        /* JADX INFO: renamed from: a */
        public boolean f8957a = true;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ int f8958b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ PhotoDraweeView f8959c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ SubsamplingScaleImageView f8960d;

        public C0569i(int i, PhotoDraweeView photoDraweeView, SubsamplingScaleImageView subsamplingScaleImageView) {
            this.f8958b = i;
            this.f8959c = photoDraweeView;
            this.f8960d = subsamplingScaleImageView;
        }

        /* JADX INFO: renamed from: b */
        public void m12807b() {
            if (this.f8957a) {
                float originalWidth = this.f8958b / (this.f8959c.getOriginalWidth() <= 960.0f ? this.f8959c.getOriginalWidth() : 960.0f);
                if (originalWidth > this.f8960d.getMaxScale()) {
                    this.f8960d.setMaxScale(originalWidth);
                }
                this.f8960d.setDoubleTapZoomScale(originalWidth);
                this.f8960d.D0(originalWidth, new PointF(0.0f, 0.0f));
                this.f8960d.setAlpha(1.0f);
                this.f8957a = false;
            }
        }

        /* JADX INFO: renamed from: f */
        public void m12808f(Exception exc) {
            this.f8960d.setVisibility(4);
        }
    }

    public bkb0(k850.b bVar) {
        super(m12710a0(bVar), new C0561a());
        this.f8940f = new ConcurrentHashMap<>();
    }

    /* JADX INFO: renamed from: A */
    public static /* synthetic */ void m12704A(View view, Bitmap bitmap) {
        if (bitmap == null || bitmap.isRecycled()) {
            return;
        }
        view.setBackground(new BitmapDrawable(view.getResources(), bitmap));
    }

    /* JADX INFO: renamed from: S */
    public static boolean m12707S() {
        String strF = RemoteConfig.x().F("Putong_ImageLoader_init");
        if (TextUtils.isEmpty(strF)) {
            return false;
        }
        try {
            return new JSONObject(strF).optBoolean("enableReportError");
        } catch (Exception e) {
            CrashHelper.c(e);
            return false;
        }
    }

    /* JADX INFO: renamed from: T */
    public static boolean m12708T() {
        String strF = RemoteConfig.x().F("Putong_ImageLoader_init");
        if (TextUtils.isEmpty(strF)) {
            return false;
        }
        try {
            return new JSONObject(strF).optBoolean("enableTrustAllCertificate");
        } catch (Exception e) {
            CrashHelper.c(e);
            return false;
        }
    }

    /* JADX INFO: renamed from: W */
    public static boolean m12709W(Throwable th) {
        int i = 0;
        while (th != null && i <= 10) {
            if (th.getClass() == IOException.class) {
                String message = th.getMessage();
                if (!TextUtils.isEmpty(message) && "Canceled".equals(message)) {
                    return true;
                }
            }
            i++;
            th = th.getCause();
        }
        return false;
    }

    /* JADX INFO: renamed from: a0 */
    public static k850 m12710a0(k850.b bVar) {
        if (m12708T()) {
            try {
                SSLContext sSLContext = SSLContext.getInstance("SSL");
                C0562b c0562b = new C0562b();
                sSLContext.init(null, new TrustManager[]{c0562b}, new SecureRandom());
                bVar.w(sSLContext.getSocketFactory(), c0562b);
                bVar.o(new HostnameVerifier() { // from class: l.yjb0
                    @Override // javax.net.ssl.HostnameVerifier
                    public final boolean verify(String str, SSLSession sSLSession) {
                        return bkb0.m12718u(str, sSLSession);
                    }
                });
            } catch (Throwable th) {
                CrashHelper.c(new FrescoImageTrustManagerException(th));
            }
        }
        bVar.a(new p6j());
        return bVar.c();
    }

    /* JADX INFO: renamed from: b0 */
    public static boolean m12711b0(int i, int i2) {
        return i > 0 && i2 > 0 && ((float) i2) / ((float) i) < 1.35f;
    }

    /* JADX INFO: renamed from: d0 */
    public static boolean m12712d0(PhotoDraweeView photoDraweeView) {
        if (xdl0.y0() > photoDraweeView.getOriginalWidth()) {
            return (((float) xdl0.y0()) / photoDraweeView.getOriginalWidth()) * photoDraweeView.getOriginalHeight() > ((float) (xdl0.w0() * 2)) && photoDraweeView.getOriginalHeight() > ((float) xdl0.w0()) && photoDraweeView.getOriginalHeight() / photoDraweeView.getOriginalWidth() > (((float) xdl0.w0()) / ((float) xdl0.y0())) * 2.0f;
        }
        return photoDraweeView.getOriginalHeight() > ((float) (xdl0.w0() * 2)) && photoDraweeView.getOriginalHeight() / photoDraweeView.getOriginalWidth() > (((float) xdl0.w0()) / ((float) xdl0.y0())) * 2.0f;
    }

    /* JADX INFO: renamed from: o0 */
    public static void m12713o0(final PhotoDraweeView photoDraweeView, final SubsamplingScaleImageView subsamplingScaleImageView, String str, ngm ngmVar, Animatable animatable, Picture.ImageUri imageUri, final int i, int i2) {
        photoDraweeView.w(ngmVar.getWidth(), ngmVar.getHeight());
        if (photoDraweeView.getOriginalHeight() > photoDraweeView.getOriginalWidth()) {
            float f = i2;
            float f2 = i;
            if (photoDraweeView.getOriginalHeight() / photoDraweeView.getOriginalWidth() > f / f2 && !m12711b0(i, i2)) {
                float originalWidth = f2 / ((photoDraweeView.getOriginalWidth() * f) / photoDraweeView.getOriginalHeight());
                if (originalWidth > photoDraweeView.getMaximumScale()) {
                    photoDraweeView.setMaximumScale(originalWidth);
                }
                if (originalWidth > 1.1f) {
                    photoDraweeView.setDoubleTapScale(originalWidth);
                }
                if (originalWidth > photoDraweeView.getMaximumScale()) {
                    originalWidth = photoDraweeView.getMaximumScale();
                }
                photoDraweeView.v(originalWidth, 0.0f, 0.0f, true);
            }
        }
        String str2 = qib0.f19821s;
        if (m12712d0(photoDraweeView)) {
            final File fileM12768Z = qib0.f19782G.m12768Z(imageUri);
            if (NullChecker.a(fileM12768Z)) {
                e51.G(new Runnable() { // from class: l.pjb0
                    @Override // java.lang.Runnable
                    public final void run() {
                        bkb0.m12719v(subsamplingScaleImageView, i, photoDraweeView, fileM12768Z);
                    }
                });
            }
        }
    }

    /* JADX INFO: renamed from: q */
    public static /* synthetic */ void m12714q(SimpleDraweeView simpleDraweeView, String str, ngm ngmVar, Animatable animatable) {
        if (ngmVar == null || !(simpleDraweeView instanceof PhotoDraweeView)) {
            return;
        }
        ((PhotoDraweeView) simpleDraweeView).w(ngmVar.getWidth(), ngmVar.getHeight());
    }

    /* JADX INFO: renamed from: t */
    public static /* synthetic */ void m12717t(SimpleDraweeView simpleDraweeView, String str, ngm ngmVar, Animatable animatable) {
        if (simpleDraweeView instanceof PhotoDraweeView) {
            ((PhotoDraweeView) simpleDraweeView).w(ngmVar.getWidth(), ngmVar.getHeight());
        }
    }

    /* JADX INFO: renamed from: u */
    public static /* synthetic */ boolean m12718u(String str, SSLSession sSLSession) {
        return true;
    }

    /* JADX INFO: renamed from: v */
    public static /* synthetic */ void m12719v(SubsamplingScaleImageView subsamplingScaleImageView, int i, PhotoDraweeView photoDraweeView, File file) {
        subsamplingScaleImageView.setOnImageEventListener(new C0569i(i, photoDraweeView, subsamplingScaleImageView));
        String absolutePath = file.getAbsolutePath();
        if (i < 720) {
            try {
                if (file.length() > 204800) {
                    pgm pgmVar = new pgm(rhi.z(file.getAbsolutePath()), pgm.n, 0, Bitmap.CompressFormat.JPEG, true);
                    absolutePath = rhi.B(pgmVar.d());
                    photoDraweeView.setOriginalWidth(pgmVar.d[0]);
                    photoDraweeView.setOriginalHeight(pgmVar.d[1]);
                }
            } catch (IOException e) {
                CrashHelper.c(e);
            }
        }
        subsamplingScaleImageView.setImage(nim.m(absolutePath));
        subsamplingScaleImageView.setVisibility(0);
        subsamplingScaleImageView.setAlpha(0.0f);
    }

    /* JADX INFO: renamed from: w */
    public static /* synthetic */ void m12720w(SimpleDraweeView simpleDraweeView, String str, ngm ngmVar, Animatable animatable) {
        if (ngmVar == null || !(simpleDraweeView instanceof PhotoDraweeView)) {
            return;
        }
        ((PhotoDraweeView) simpleDraweeView).w(ngmVar.getWidth(), ngmVar.getHeight());
    }

    /* JADX INFO: renamed from: z */
    public static /* synthetic */ void m12723z(SimpleDraweeView simpleDraweeView, String str, ngm ngmVar, Animatable animatable) {
        if (simpleDraweeView instanceof PhotoDraweeView) {
            ((PhotoDraweeView) simpleDraweeView).w(ngmVar.getWidth(), ngmVar.getHeight());
        }
    }

    /* JADX INFO: renamed from: A0 */
    public void m12724A0(String str) {
        if (wc40.m26357i()) {
            m12784r0(str);
        } else {
            m12791y0(str, Priority.MEDIUM);
        }
    }

    /* JADX INFO: renamed from: B0 */
    public void m12725B0(DraweeView draweeView, Picture.ImageUri imageUri) {
        m12726C0(draweeView, imageUri, null);
    }

    /* JADX INFO: renamed from: C0 */
    public void m12726C0(DraweeView draweeView, Picture.ImageUri imageUri, ym2 ym2Var) {
        m12728D0(draweeView, imageUri, ym2Var, null, "");
    }

    /* JADX INFO: renamed from: D */
    public void m12727D(final View view, String str) {
        m12729E(str).observeOn(jo0.a()).subscribe(mkd0.G(new e30() { // from class: l.vjb0
            public final void call(Object obj) {
                bkb0.m12704A(view, (Bitmap) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: D0 */
    public void m12728D0(DraweeView draweeView, Picture.ImageUri imageUri, ym2 ym2Var, SubsamplingScaleImageView subsamplingScaleImageView, String str) {
        m12730E0(draweeView, imageUri, ym2Var, subsamplingScaleImageView, str, null);
    }

    /* JADX INFO: renamed from: E */
    public c<Bitmap> m12729E(final String str) {
        return c.create(new c.a() { // from class: l.xjb0
            public final void call(Object obj) {
                this.f27552a.m12772e0(str, (z3g0) obj);
            }
        });
    }

    /* JADX INFO: renamed from: E0 */
    public void m12730E0(final DraweeView draweeView, final Picture.ImageUri imageUri, ym2 ym2Var, final SubsamplingScaleImageView subsamplingScaleImageView, String str, Pair<Integer, Integer> pair) {
        nvc0 nvc0Var;
        if (!TextUtils.isEmpty(str) && imageUri != null) {
            TrackMediaUploadUtil.X(imageUri.formatted(), str);
        }
        fi70 fi70VarG = g(draweeView);
        ImageRequestBuilder imageRequestBuilderM12765X0 = m12765X0(imageUri);
        if (pair != null) {
            imageRequestBuilderM12765X0.K(new biq(((Integer) pair.first).intValue(), ((Integer) pair.second).intValue()));
        }
        if (imageUri.isLocal || this.f8940f.contains(Media.URL_TO_CACHEKEY(imageUri.base)) || ((sl2) this).a.q(Uri.parse(Media.URL_TO_CACHEKEY(imageUri.formatted())))) {
            imageRequestBuilderM12765X0.L(false);
        } else {
            int[] iArr = imageUri.formatType == 2 ? Picture.SQUARE_SIZES : Picture.SIZES;
            int i = -1;
            for (int length = iArr.length - 1; length >= 0; length--) {
                int i2 = iArr[length];
                if (((sl2) this).a.q(Uri.parse(Media.URL_TO_CACHEKEY(imageUri.formatted(i2))))) {
                    if (i2 < imageUri.formatWidth) {
                        i = i2;
                        break;
                    }
                    i = i2;
                }
            }
            Picture.ImageUri imageUriCopy = i != -1 ? imageUri.copy(i) : null;
            if (imageUriCopy != null) {
                fi70VarG.F(true);
                ImageRequestBuilder imageRequestBuilderM12765X1 = m12765X0(imageUriCopy);
                if (i > imageUri.formatWidth && draweeView.getWidth() > 0 && draweeView.getHeight() > 0) {
                    if (imageUri.checkUrlBeanAvailable()) {
                        int iMin = Math.min(draweeView.getWidth(), imageUri.formatWidth);
                        Dimension dimension = imageUri.orignalDimen;
                        nvc0Var = new nvc0(iMin, (dimension.height * iMin) / dimension.width);
                    } else {
                        nvc0Var = new nvc0(draweeView.getWidth(), draweeView.getHeight());
                    }
                    imageRequestBuilderM12765X1.O(nvc0Var);
                }
                if (pair != null) {
                    imageRequestBuilderM12765X1.K(new biq(((Integer) pair.first).intValue(), ((Integer) pair.second).intValue()));
                }
                fi70VarG.D(imageRequestBuilderM12765X1.J(ImageRequest.RequestLevel.DISK_CACHE).a());
            } else {
                imageRequestBuilderM12765X0.L(true);
            }
        }
        fi70VarG.B(new C0566f(qim.a("progress", imageUri.formatted(), draweeView, ym2.i(ym2Var, new g30() { // from class: l.ujb0
            /* JADX INFO: renamed from: a */
            public final void m25249a(Object obj, Object obj2, Object obj3) {
                this.f23574a.m12774g0(draweeView, subsamplingScaleImageView, imageUri, (String) obj, (ngm) obj2, (Animatable) obj3);
            }
        })), imageUri));
        fi70VarG.C(imageRequestBuilderM12765X0.a());
        draweeView.setController(fi70VarG.c());
    }

    /* JADX INFO: renamed from: F */
    public void m12731F(ImageRequest imageRequest, e30<Bitmap> e30Var) {
        ((sl2) this).a.h(imageRequest, App.e).f(new C0564d(e30Var), g84.k());
    }

    /* JADX INFO: renamed from: F0 */
    public void m12732F0(DraweeView draweeView, Picture.ImageUri imageUri, String str, ym2 ym2Var) {
        m12728D0(draweeView, imageUri, ym2Var, null, str);
    }

    /* JADX INFO: renamed from: G */
    public void m12733G(Picture.ImageUri imageUri, e30<Bitmap> e30Var) {
        m12735H(imageUri, e30Var, false);
    }

    /* JADX INFO: renamed from: G0 */
    public void m12734G0(String str, String str2) {
        this.f8940f.put(str, str2);
    }

    /* JADX INFO: renamed from: H */
    public void m12735H(Picture.ImageUri imageUri, e30<Bitmap> e30Var, boolean z) {
        m12731F(m12765X0(imageUri).J(z ? ImageRequest.RequestLevel.DISK_CACHE : ImageRequest.RequestLevel.FULL_FETCH).a(), e30Var);
    }

    /* JADX INFO: renamed from: H0 */
    public ImageRequest m12736H0(SimpleDraweeView simpleDraweeView, Picture.ImageUri imageUri, int i, int i2) {
        return m12762V0(simpleDraweeView, imageUri, false, true, null, null, null, i, i2);
    }

    /* JADX INFO: renamed from: I */
    public void m12737I(String str, e30<Bitmap> e30Var) {
        m12731F(n(str).a(), e30Var);
    }

    /* JADX INFO: renamed from: I0 */
    public ImageRequest m12738I0(SimpleDraweeView simpleDraweeView, String str, int i, int i2) {
        return m12763W0(simpleDraweeView, str, false, true, null, null, null, i, i2);
    }

    /* JADX INFO: renamed from: J */
    public void m12739J(String str, e30<Bitmap> e30Var, int i, int i2) {
        m12731F(ImageRequestBuilder.y(Uri.parse(str)).K(new biq(i, i2)).a(), e30Var);
    }

    /* JADX INFO: renamed from: J0 */
    public void m12740J0(SimpleDraweeView simpleDraweeView, Picture.ImageUri imageUri, boolean z) {
        m12742K0(simpleDraweeView, imageUri, z, true, null, null);
    }

    /* JADX INFO: renamed from: K */
    public void m12741K(SimpleDraweeView simpleDraweeView, int i, int i2, int i3) {
        int i4 = pgm.n;
        m12743L(simpleDraweeView, i, i2, i3, new nvc0(i4, i4));
    }

    /* JADX INFO: renamed from: K0 */
    public void m12742K0(SimpleDraweeView simpleDraweeView, Picture.ImageUri imageUri, boolean z, boolean z2, nvc0 nvc0Var, ym2 ym2Var) {
        m12758T0(simpleDraweeView, imageUri, z, z2, nvc0Var, ym2Var, null);
    }

    /* JADX INFO: renamed from: L */
    public void m12743L(final SimpleDraweeView simpleDraweeView, int i, int i2, int i3, nvc0 nvc0Var) {
        ImageRequestBuilder imageRequestBuilderX = ImageRequestBuilder.x(i);
        if (nvc0Var != null) {
            imageRequestBuilderX.O(nvc0Var);
        }
        if (nvc0Var != null) {
            imageRequestBuilderX.O(nvc0Var);
        }
        simpleDraweeView.setController(g(simpleDraweeView).C(imageRequestBuilderX.K(new biq(i2, i3)).a()).B(new sl2.b(qim.a("blurLocalFile2", fvj0.g(i).toString(), simpleDraweeView, ym2.i((ym2) null, new g30() { // from class: l.tjb0
            /* JADX INFO: renamed from: a */
            public final void m24701a(Object obj, Object obj2, Object obj3) {
                bkb0.m12723z(simpleDraweeView, (String) obj, (ngm) obj2, (Animatable) obj3);
            }
        })))).c());
    }

    /* JADX INFO: renamed from: L0 */
    public void m12744L0(SimpleDraweeView simpleDraweeView, String str) {
        m12748N0(simpleDraweeView, str, true);
    }

    /* JADX INFO: renamed from: M */
    public void m12745M(SimpleDraweeView simpleDraweeView, String str, int i, int i2) {
        int i3 = pgm.n;
        m12747N(simpleDraweeView, str, i, i2, new nvc0(i3, i3));
    }

    /* JADX INFO: renamed from: M0 */
    public void m12746M0(SimpleDraweeView simpleDraweeView, String str, ym2 ym2Var) {
        m12750O0(simpleDraweeView, str, false, true, null, ym2Var);
    }

    /* JADX INFO: renamed from: N */
    public void m12747N(final SimpleDraweeView simpleDraweeView, String str, int i, int i2, nvc0 nvc0Var) {
        ImageRequestBuilder imageRequestBuilderN = n(str);
        if (nvc0Var != null) {
            imageRequestBuilderN.O(nvc0Var);
        }
        simpleDraweeView.setController(g(simpleDraweeView).C(imageRequestBuilderN.K(new biq(i, i2)).a()).B(new sl2.b(qim.a("blurLocalFile", str, simpleDraweeView, ym2.i((ym2) null, new g30() { // from class: l.akb0
            /* JADX INFO: renamed from: a */
            public final void m11876a(Object obj, Object obj2, Object obj3) {
                bkb0.m12717t(simpleDraweeView, (String) obj, (ngm) obj2, (Animatable) obj3);
            }
        })))).c());
    }

    /* JADX INFO: renamed from: N0 */
    public void m12748N0(SimpleDraweeView simpleDraweeView, String str, boolean z) {
        m12750O0(simpleDraweeView, str, false, z, null, null);
    }

    /* JADX INFO: renamed from: O */
    public void m12749O(SimpleDraweeView simpleDraweeView, String str, int i, int i2) {
        m12751P(simpleDraweeView, str, i, i2, 0);
    }

    /* JADX INFO: renamed from: O0 */
    public void m12750O0(SimpleDraweeView simpleDraweeView, String str, boolean z, boolean z2, nvc0 nvc0Var, ym2 ym2Var) {
        m12760U0(simpleDraweeView, str, z, z2, nvc0Var, ym2Var, null);
    }

    /* JADX INFO: renamed from: P */
    public void m12751P(SimpleDraweeView simpleDraweeView, String str, int i, int i2, int i3) {
        simpleDraweeView.setController(l6j.g().B(new sl2.b(qim.a("blurRemote1", str, simpleDraweeView, (ym2) null))).E(simpleDraweeView.getController()).C(ImageRequestBuilder.y(Uri.parse(str)).K(i3 != 0 ? new ciq(i, i2).g(i3) : new biq(i, i2)).a()).c());
    }

    /* JADX INFO: renamed from: P0 */
    public void m12752P0(VDraweeView vDraweeView, Picture.ImageUri imageUri, int i, int i2) {
        ((sl2) this).a.k(m12765X0(imageUri).N(Priority.MEDIUM).a(), (Object) null).f(new C0568h(vDraweeView, imageUri, i, i2), bjj0.v());
    }

    /* JADX INFO: renamed from: Q */
    public void m12753Q(SimpleDraweeView simpleDraweeView, String str, int i, int i2, int i3, ym2 ym2Var) {
        simpleDraweeView.setController(l6j.g().E(simpleDraweeView.getController()).C(ImageRequestBuilder.y(Uri.parse(str)).K(i3 != 0 ? new ciq(i, i2).g(i3) : new biq(i, i2)).a()).B(new sl2.b(qim.a("blurRemote2", str, simpleDraweeView, ym2Var))).c());
    }

    /* JADX INFO: renamed from: Q0 */
    public void m12754Q0(SimpleDraweeView simpleDraweeView, Picture.ImageUri imageUri) {
        m12740J0(simpleDraweeView, imageUri, true);
    }

    /* JADX INFO: renamed from: R */
    public void m12755R(String str) {
        ((sl2) this).a.d(Uri.parse(Media.URL_TO_CACHEKEY(str)));
    }

    /* JADX INFO: renamed from: R0 */
    public void m12756R0(SimpleDraweeView simpleDraweeView, Picture.ImageUri imageUri, String str) {
        if (!TextUtils.isEmpty(str) && imageUri != null) {
            TrackMediaUploadUtil.X(imageUri.formatted(), str);
        }
        m12742K0(simpleDraweeView, imageUri, true, true, null, new C0567g(imageUri));
    }

    /* JADX INFO: renamed from: S0 */
    public void m12757S0(SimpleDraweeView simpleDraweeView, String str) {
        m12750O0(simpleDraweeView, str, true, false, null, null);
    }

    /* JADX INFO: renamed from: T0 */
    public ImageRequest m12758T0(SimpleDraweeView simpleDraweeView, Picture.ImageUri imageUri, boolean z, boolean z2, nvc0 nvc0Var, ym2 ym2Var, e30<ImageRequestBuilder> e30Var) {
        return m12762V0(simpleDraweeView, imageUri, z, z2, nvc0Var, ym2Var, e30Var, 0, 0);
    }

    /* JADX INFO: renamed from: U */
    public void m12759U(Set<ImageRequest> set) {
        if (vwb.J(set)) {
            return;
        }
        for (ImageRequest imageRequest : set) {
            cx3 cx3VarC = ((sl2) this).a.o().c(imageRequest, Boolean.FALSE);
            if (cx3VarC != null) {
                imageRequest.w().toString();
                ((sl2) this).a.r(imageRequest);
                ((sl2) this).a.g(Uri.parse(cx3VarC.a()));
            }
        }
    }

    /* JADX INFO: renamed from: U0 */
    public ImageRequest m12760U0(SimpleDraweeView simpleDraweeView, String str, boolean z, boolean z2, nvc0 nvc0Var, ym2 ym2Var, e30<ImageRequestBuilder> e30Var) {
        return m12763W0(simpleDraweeView, str, z, z2, nvc0Var, ym2Var, e30Var, 0, 0);
    }

    /* JADX INFO: renamed from: V */
    public void m12761V() {
        pgy pgyVarN = ((sl2) this).a.n();
        if (NullChecker.a(pgyVarN)) {
            pgyVarN.d(new ph80() { // from class: l.wjb0
                public final boolean apply(Object obj) {
                    return ((cx3) obj).toString().startsWith("FrameKey");
                }
            });
        }
    }

    /* JADX INFO: renamed from: V0 */
    public ImageRequest m12762V0(SimpleDraweeView simpleDraweeView, Picture.ImageUri imageUri, boolean z, boolean z2, nvc0 nvc0Var, ym2 ym2Var, e30<ImageRequestBuilder> e30Var, int i, int i2) {
        ImageRequestBuilder imageRequestBuilderB = m12765X0(imageUri).B(z ? ImageRequest.CacheChoice.SMALL : ImageRequest.CacheChoice.DEFAULT);
        if (nvc0Var != null) {
            imageRequestBuilderB.O(nvc0Var);
        } else if (i != 0 || i2 != 0) {
            imageRequestBuilderB.O(new nvc0(i, i2));
        }
        if (e30Var != null) {
            e30Var.call(imageRequestBuilderB);
        }
        ImageRequest imageRequestA = imageRequestBuilderB.a();
        simpleDraweeView.setController(m12764X(simpleDraweeView, imageRequestA, z2, qim.a("remote2", imageUri.formatted(), simpleDraweeView, ym2Var)));
        return imageRequestA;
    }

    /* JADX INFO: renamed from: W0 */
    public ImageRequest m12763W0(SimpleDraweeView simpleDraweeView, String str, boolean z, boolean z2, nvc0 nvc0Var, ym2 ym2Var, e30<ImageRequestBuilder> e30Var, int i, int i2) {
        ImageRequestBuilder imageRequestBuilderB = n(str).B(z ? ImageRequest.CacheChoice.SMALL : ImageRequest.CacheChoice.DEFAULT);
        if (nvc0Var != null) {
            imageRequestBuilderB.O(nvc0Var);
        } else if (i != 0 || i2 != 0) {
            imageRequestBuilderB.O(new nvc0(i, i2));
        } else if (simpleDraweeView.getWidth() != 0 && simpleDraweeView.getHeight() != 0) {
            imageRequestBuilderB.O(new nvc0(simpleDraweeView.getWidth(), simpleDraweeView.getHeight()));
        }
        if (e30Var != null) {
            e30Var.call(imageRequestBuilderB);
        }
        ImageRequest imageRequestA = imageRequestBuilderB.a();
        simpleDraweeView.setController(m12764X(simpleDraweeView, imageRequestA, z2, qim.a("remote", str, simpleDraweeView, ym2Var)));
        return imageRequestA;
    }

    /* JADX INFO: renamed from: X */
    public h7 m12764X(SimpleDraweeView simpleDraweeView, ImageRequest imageRequest, boolean z, ym2 ym2Var) {
        return h(simpleDraweeView, z).B(new sl2.b(ym2Var)).C(imageRequest).c();
    }

    /* JADX INFO: renamed from: X0 */
    public ImageRequestBuilder m12765X0(Picture.ImageUri imageUri) {
        if (imageUri.isLocal) {
            return m12781n0(imageUri, imageUri.base);
        }
        String str = this.f8940f.get(Media.URL_TO_CACHEKEY(imageUri.base));
        return str == null ? n(imageUri.formatted()) : m12781n0(imageUri, str);
    }

    /* JADX INFO: renamed from: Y */
    public File m12766Y(ImageRequest imageRequest) {
        ox2 ox2VarC;
        cx3 cx3VarB = ((sl2) this).a.o().b(imageRequest, Boolean.FALSE);
        File fileV = imageRequest.v();
        mfi mfiVarE = ((s2e) shm.m().g().get()).e();
        mfi mfiVarA = ((s2e) shm.m().g().get()).a();
        if (!mfiVarE.b(cx3VarB) || mfiVarE.c(cx3VarB) == null) {
            ox2VarC = (!mfiVarA.b(cx3VarB) || mfiVarA.c(cx3VarB) == null) ? null : mfiVarA.c(cx3VarB);
        } else {
            ox2VarC = mfiVarE.c(cx3VarB);
        }
        return ox2VarC != null ? ((lfi) ox2VarC).d() : fileV;
    }

    /* JADX INFO: renamed from: Y0 */
    public void m12767Y0(SimpleDraweeView simpleDraweeView, int i) {
        simpleDraweeView.setController(h(simpleDraweeView, true).C(n(new Uri.Builder().scheme("res").path(String.valueOf(i)).build().toString()).a()).c());
    }

    /* JADX INFO: renamed from: Z */
    public File m12768Z(Picture.ImageUri imageUri) {
        return m12766Y(m12765X0(imageUri).a());
    }

    /* JADX INFO: renamed from: Z0 */
    public void m12769Z0(SimpleDraweeView simpleDraweeView, String str) {
        simpleDraweeView.setController(g(simpleDraweeView).C(n(str).a()).c());
    }

    /* JADX INFO: renamed from: c0 */
    public final boolean m12770c0(Picture.ImageUri imageUri) {
        boolean zIsEmpty = TextUtils.isEmpty(imageUri.base);
        Dimension dimension = imageUri.orignalDimen;
        if (!zIsEmpty) {
            return (dimension == null || dimension.width == 0 || dimension.height == 0) ? false : true;
        }
        if (dimension.width != 0) {
            return true;
        }
        CrashHelper.c(new IllegalArgumentException("local image must have valid local url"));
        return true;
    }

    /* JADX INFO: renamed from: e */
    public n850 m12771e(k850 k850Var) {
        n850 n850Var = new n850(k850Var);
        n850Var.o(new C0563c());
        return n850Var;
    }

    /* JADX INFO: renamed from: e0 */
    public final /* synthetic */ void m12772e0(String str, final z3g0 z3g0Var) {
        Objects.requireNonNull(z3g0Var);
        m12737I(str, new e30() { // from class: l.rjb0
            public final void call(Object obj) {
                z3g0Var.onNext((Bitmap) obj);
            }
        });
    }

    /* JADX INFO: renamed from: f0 */
    public final /* synthetic */ void m12773f0(SubsamplingScaleImageView subsamplingScaleImageView, PhotoDraweeView photoDraweeView, File file) {
        subsamplingScaleImageView.setOnImageEventListener(new C0565e(photoDraweeView, subsamplingScaleImageView));
        String absolutePath = file.getAbsolutePath();
        try {
            if (xdl0.y0() < 720 && file.length() > 204800) {
                pgm pgmVar = new pgm(rhi.z(file.getAbsolutePath()), pgm.n, 0, Bitmap.CompressFormat.JPEG, true);
                absolutePath = rhi.B(pgmVar.d());
                photoDraweeView.setOriginalWidth(pgmVar.d[0]);
                photoDraweeView.setOriginalHeight(pgmVar.d[1]);
            }
        } catch (IOException e) {
            CrashHelper.c(e);
        }
        subsamplingScaleImageView.setImage(nim.m(absolutePath));
        subsamplingScaleImageView.setVisibility(0);
        subsamplingScaleImageView.setAlpha(0.0f);
    }

    /* JADX INFO: renamed from: g0 */
    public final /* synthetic */ void m12774g0(DraweeView draweeView, final SubsamplingScaleImageView subsamplingScaleImageView, Picture.ImageUri imageUri, String str, ngm ngmVar, Animatable animatable) {
        final File fileM12768Z;
        if (draweeView instanceof PhotoDraweeView) {
            final PhotoDraweeView photoDraweeView = (PhotoDraweeView) draweeView;
            photoDraweeView.w(ngmVar.getWidth(), ngmVar.getHeight());
            if (photoDraweeView.getOriginalHeight() > photoDraweeView.getOriginalWidth() && photoDraweeView.getOriginalHeight() / photoDraweeView.getOriginalWidth() > xdl0.w0() / xdl0.y0()) {
                float fY0 = xdl0.y0() / ((photoDraweeView.getOriginalWidth() * xdl0.w0()) / photoDraweeView.getOriginalHeight());
                if (fY0 > photoDraweeView.getMaximumScale()) {
                    photoDraweeView.setMaximumScale(fY0);
                }
                if (fY0 > 1.1f) {
                    photoDraweeView.setDoubleTapScale(fY0);
                }
                if (fY0 > photoDraweeView.getMaximumScale()) {
                    fY0 = photoDraweeView.getMaximumScale();
                }
                photoDraweeView.v(fY0, 0.0f, 0.0f, true);
            }
            if (!m12712d0(photoDraweeView) || subsamplingScaleImageView == null || (fileM12768Z = m12768Z(imageUri)) == null) {
                return;
            }
            e51.G(new Runnable() { // from class: l.qjb0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f19854a.m12773f0(subsamplingScaleImageView, photoDraweeView, fileM12768Z);
                }
            });
        }
    }

    /* JADX INFO: renamed from: h0 */
    public final void m12775h0(VDraweeView vDraweeView, Picture.ImageUri imageUri, InputStream inputStream, int i, int i2) {
        try {
            Dimension dimension = imageUri.orignalDimen;
            float f = dimension.height / dimension.width;
            BitmapRegionDecoder bitmapRegionDecoderNewInstance = BitmapRegionDecoder.newInstance(inputStream, false);
            int width = bitmapRegionDecoderNewInstance.getWidth();
            int height = bitmapRegionDecoderNewInstance.getHeight();
            Rect rect = new Rect();
            float f2 = i / i2;
            if (f > 1.0f) {
                rect.right = width;
                rect.bottom = (int) (width / f2);
            } else if (f < 1.0f) {
                rect.right = (int) (height * f2);
                rect.bottom = height;
            } else {
                rect.right = width;
                rect.bottom = height;
            }
            vDraweeView.getHierarchy().f(new BitmapDrawable(vDraweeView.getResources(), bitmapRegionDecoderNewInstance.decodeRegion(rect, null)), 1.0f, true);
        } catch (Exception unused) {
            m12744L0(vDraweeView, imageUri.formatted());
        } finally {
            t95.b(inputStream);
        }
    }

    /* JADX INFO: renamed from: i0 */
    public void m12776i0(SimpleDraweeView simpleDraweeView, String str) {
        int i = pgm.n;
        m12777j0(simpleDraweeView, str, new nvc0(i, i), null);
    }

    /* JADX INFO: renamed from: j0 */
    public void m12777j0(final SimpleDraweeView simpleDraweeView, String str, nvc0 nvc0Var, Bitmap.Config config) {
        ImageRequestBuilder imageRequestBuilderN = n(str);
        if (nvc0Var != null) {
            imageRequestBuilderN.O(nvc0Var);
        }
        if (config != null) {
            imageRequestBuilderN.G(zem.b().p(config).a());
        }
        imageRequestBuilderN.Q(oed0.e());
        simpleDraweeView.setController(g(simpleDraweeView).C(imageRequestBuilderN.a()).B(new sl2.b(ym2.i((ym2) null, new g30() { // from class: l.sjb0
            /* JADX INFO: renamed from: a */
            public final void m23861a(Object obj, Object obj2, Object obj3) {
                bkb0.m12720w(simpleDraweeView, (String) obj, (ngm) obj2, (Animatable) obj3);
            }
        }))).c());
    }

    /* JADX INFO: renamed from: k0 */
    public void m12778k0(SimpleDraweeView simpleDraweeView, String str) {
        m12779l0(simpleDraweeView, str, null);
    }

    /* JADX INFO: renamed from: l0 */
    public void m12779l0(final SimpleDraweeView simpleDraweeView, String str, ym2 ym2Var) {
        ImageRequestBuilder imageRequestBuilderL = n(str).L(true);
        int i = pgm.n;
        ImageRequest imageRequestA = imageRequestBuilderL.O(new nvc0(i, i)).a();
        int iY0 = xdl0.y0() / 4;
        simpleDraweeView.setController(g(simpleDraweeView).D(n(str).O(new nvc0(iY0, iY0)).z(true).a()).C(imageRequestA).B(new sl2.b(ym2.i(ym2Var, new g30() { // from class: l.zjb0
            /* JADX INFO: renamed from: a */
            public final void m28717a(Object obj, Object obj2, Object obj3) {
                bkb0.m12714q(simpleDraweeView, (String) obj, (ngm) obj2, (Animatable) obj3);
            }
        }))).c());
    }

    /* JADX INFO: renamed from: m0 */
    public void m12780m0(SimpleDraweeView simpleDraweeView, String str) {
        int iY0 = xdl0.y0() / 4;
        simpleDraweeView.setController(g(simpleDraweeView).C(n(str).O(new nvc0(iY0, iY0)).z(true).a()).c());
    }

    /* JADX INFO: renamed from: n0 */
    public final ImageRequestBuilder m12781n0(Picture.ImageUri imageUri, String str) {
        ImageRequestBuilder imageRequestBuilderN = n(str);
        int i = imageUri.formatType;
        if (i == 1) {
            if (!m12770c0(imageUri)) {
                imageUri = new Picture.ImageUri(imageUri.base, new Dimension(new pgm(rhi.z(imageUri.base)).d), imageUri.fileType, imageUri.formatType, imageUri.formatWidth, imageUri.isLocal);
            }
            if (imageUri.orignalDimen.width > 0) {
                int i2 = imageUri.formatWidth;
                Dimension dimension = imageUri.orignalDimen;
                return imageRequestBuilderN.O(new nvc0(i2, (dimension.height * i2) / dimension.width));
            }
        } else if (i == 2) {
            int i3 = imageUri.formatWidth;
            return imageRequestBuilderN.O(new nvc0(i3, i3));
        }
        return imageRequestBuilderN;
    }

    /* JADX INFO: renamed from: p0 */
    public c5c<Void> m12782p0(Picture.ImageUri imageUri) {
        return m12783q0(imageUri, Priority.MEDIUM, null, null);
    }

    /* JADX INFO: renamed from: q0 */
    public c5c<Void> m12783q0(Picture.ImageUri imageUri, Priority priority, String str, guc0 guc0Var) {
        if (!TextUtils.isEmpty(str) && imageUri != null) {
            TrackMediaUploadUtil.X(imageUri.formatted(), str);
        }
        return ((sl2) this).a.w(m12765X0(imageUri).N(priority).M(guc0Var).a(), (Object) null);
    }

    /* JADX INFO: renamed from: r0 */
    public void m12784r0(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        ((sl2) this).a.w(n(str).N(Priority.MEDIUM).a(), (Object) null);
    }

    /* JADX INFO: renamed from: s0 */
    public c5c<Void> m12785s0(Picture.ImageUri imageUri, Priority priority, String str, guc0 guc0Var) {
        if (!TextUtils.isEmpty(str) && imageUri != null) {
            TrackMediaUploadUtil.X(imageUri.formatted(), str);
        }
        return ((sl2) this).a.u(m12765X0(imageUri).N(priority).M(guc0Var).a(), (Object) null);
    }

    /* JADX INFO: renamed from: t0 */
    public c5c<Void> m12786t0(Picture.ImageUri imageUri, Priority priority, String str, guc0 guc0Var, boolean z) {
        if (z) {
            imageUri.formatType = 3;
        }
        if (!TextUtils.isEmpty(str) && imageUri != null) {
            TrackMediaUploadUtil.X(imageUri.formatted(), str);
        }
        return ((sl2) this).a.u(m12765X0(imageUri).N(priority).M(guc0Var).a(), (Object) null);
    }

    /* JADX INFO: renamed from: u0 */
    public void m12787u0(Picture.ImageUri imageUri) {
        m12788v0(imageUri, Priority.MEDIUM);
    }

    /* JADX INFO: renamed from: v0 */
    public void m12788v0(Picture.ImageUri imageUri, Priority priority) {
        m12789w0(imageUri, priority, "");
    }

    /* JADX INFO: renamed from: w0 */
    public void m12789w0(Picture.ImageUri imageUri, Priority priority, String str) {
        m12785s0(imageUri, priority, str, null);
    }

    /* JADX INFO: renamed from: x0 */
    public void m12790x0(String str) {
        m12791y0(str, Priority.MEDIUM);
    }

    /* JADX INFO: renamed from: y0 */
    public void m12791y0(String str, Priority priority) {
        ((sl2) this).a.u(n(str).N(priority).a(), (Object) null);
    }

    /* JADX INFO: renamed from: z0 */
    public void m12792z0(Picture.ImageUri imageUri) {
        if (wc40.m26357i()) {
            m12782p0(imageUri);
        } else {
            m12787u0(imageUri);
        }
    }

    /* JADX INFO: renamed from: l.bkb0$b */
    public class C0562b implements X509TrustManager {
        @Override // javax.net.ssl.X509TrustManager
        public X509Certificate[] getAcceptedIssuers() {
            return new X509Certificate[0];
        }

        @Override // javax.net.ssl.X509TrustManager
        public void checkClientTrusted(X509Certificate[] x509CertificateArr, String str) throws CertificateException {
        }

        @Override // javax.net.ssl.X509TrustManager
        public void checkServerTrusted(X509Certificate[] x509CertificateArr, String str) throws CertificateException {
        }
    }
}
