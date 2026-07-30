package p149l;

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
import com.p046p1.mobile.android.app.App;
import com.p046p1.mobile.putong.api.fresco.FrescoImageRequestException;
import com.p046p1.mobile.putong.api.fresco.FrescoImageTrustManagerException;
import com.p046p1.mobile.putong.data.Dimension;
import com.p046p1.mobile.putong.data.Media;
import com.p046p1.mobile.putong.data.Picture;
import com.p046p1.mobile.putong.remote_config.RemoteConfig;
import com.p046p1.mobile.putong.util.TrackMediaUploadUtil;
import com.tantanapp.common.network.NetworkTrackInfo;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import com.tantanapp.media.ttmediautils.tinker.ShareConstants;
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
import org.json.JSONObject;
import p133rx.C22306c;
import p147v.VDraweeView;
import p147v.fresco.photodraweeview.PhotoDraweeView;
import p147v.fresco.subscaleview.SubsamplingScaleImageView;

/* JADX INFO: loaded from: classes9.dex */
public class bkb0 extends sl2 {

    /* JADX INFO: renamed from: g */
    public static boolean f75988g = m102294S();

    /* JADX INFO: renamed from: f */
    public final ConcurrentHashMap<String, String> f75989f;

    /* JADX INFO: renamed from: l.bkb0$a */
    public class C15880a extends rld {
        @Override // p149l.rld
        /* JADX INFO: renamed from: e */
        public Uri mo102380e(Uri uri) {
            return Uri.parse(Media.URL_TO_CACHEKEY(uri.toString()));
        }
    }

    /* JADX INFO: renamed from: l.bkb0$c */
    public class C15882c implements rim {
        public C15882c() {
        }

        @Override // p149l.rim
        /* JADX INFO: renamed from: a */
        public void mo102381a(stc0 stc0Var) {
            xc20.m208062c(stc0Var, ad20.m95853b());
        }

        @Override // p149l.rim
        /* JADX INFO: renamed from: b */
        public stc0 mo102382b(stc0 stc0Var, NetworkTrackInfo.ReportType reportType) {
            return xc20.m208061b(stc0Var, reportType);
        }

        @Override // p149l.rim
        /* JADX INFO: renamed from: c */
        public void mo102383c(stc0 stc0Var, Throwable th) {
            xc20.m208060a(stc0Var, th);
            if (!bkb0.f75988g || bkb0.m102296W(th)) {
                return;
            }
            CrashHelper.m81296c(new FrescoImageRequestException(th));
        }

        @Override // p149l.rim
        public void requestCancel(stc0 stc0Var) {
            xc20.m208063d(stc0Var);
        }
    }

    /* JADX INFO: renamed from: l.bkb0$d */
    public class C15883d extends af2 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ e30 f75991a;

        public C15883d(e30 e30Var) {
            this.f75991a = e30Var;
        }

        @Override // p149l.ti2
        /* JADX INFO: renamed from: e */
        public void mo102384e(c5c<fa5<da5>> c5cVar) {
            this.f75991a.call(null);
        }

        @Override // p149l.af2
        /* JADX INFO: renamed from: g */
        public void mo96184g(@Nullable Bitmap bitmap) {
            if (bitmap == null || bitmap.getHeight() <= 0 || bitmap.getWidth() <= 0) {
                this.f75991a.call(null);
            } else {
                this.f75991a.call(bitmap);
            }
        }
    }

    /* JADX INFO: renamed from: l.bkb0$e */
    public class C15884e extends SubsamplingScaleImageView.C22600f {

        /* JADX INFO: renamed from: a */
        public boolean f75993a = true;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ PhotoDraweeView f75994b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ SubsamplingScaleImageView f75995c;

        public C15884e(PhotoDraweeView photoDraweeView, SubsamplingScaleImageView subsamplingScaleImageView) {
            this.f75994b = photoDraweeView;
            this.f75995c = subsamplingScaleImageView;
        }

        @Override // p147v.fresco.subscaleview.SubsamplingScaleImageView.C22600f, p147v.fresco.subscaleview.SubsamplingScaleImageView.InterfaceC22602h
        /* JADX INFO: renamed from: b */
        public void mo79104b() {
            if (this.f75993a) {
                float fM208412y0 = xdl0.m208412y0() / (this.f75994b.getOriginalWidth() <= 960.0f ? this.f75994b.getOriginalWidth() : 960.0f);
                if (fM208412y0 > this.f75995c.getMaxScale()) {
                    this.f75995c.setMaxScale(fM208412y0);
                }
                this.f75995c.setDoubleTapZoomScale(fM208412y0);
                this.f75995c.m223446D0(fM208412y0, new PointF(0.0f, 0.0f));
                this.f75995c.setAlpha(1.0f);
                this.f75993a = false;
            }
        }

        @Override // p147v.fresco.subscaleview.SubsamplingScaleImageView.C22600f, p147v.fresco.subscaleview.SubsamplingScaleImageView.InterfaceC22602h
        /* JADX INFO: renamed from: f */
        public void mo79105f(Exception exc) {
            this.f75995c.setVisibility(4);
        }
    }

    /* JADX INFO: renamed from: l.bkb0$f */
    public class C15885f extends sl2.C19981b {

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ Picture.ImageUri f75997c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C15885f(ym2 ym2Var, Picture.ImageUri imageUri) {
            super(ym2Var);
            this.f75997c = imageUri;
        }

        @Override // p149l.sl2.C19981b, p149l.ei2, p149l.q26
        /* JADX INFO: renamed from: a */
        public void mo102385a(String str) {
            super.mo102385a(str);
            Picture.ImageUri imageUri = this.f75997c;
            if (imageUri != null) {
                TrackMediaUploadUtil.m80294Z(imageUri.formatted());
            }
        }

        @Override // p149l.sl2.C19981b, p149l.ei2, p149l.q26
        /* JADX INFO: renamed from: d */
        public void mo48281d(String str, Throwable th) {
            super.mo48281d(str, th);
            Picture.ImageUri imageUri = this.f75997c;
            if (imageUri != null) {
                TrackMediaUploadUtil.m80294Z(imageUri.formatted());
            }
        }
    }

    /* JADX INFO: renamed from: l.bkb0$g */
    public class C15886g extends ym2 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Picture.ImageUri f75999a;

        public C15886g(Picture.ImageUri imageUri) {
            this.f75999a = imageUri;
        }

        @Override // p149l.ym2
        /* JADX INFO: renamed from: c */
        public void mo39107c(String str, Throwable th) {
            super.mo39107c(str, th);
            Picture.ImageUri imageUri = this.f75999a;
            if (imageUri != null) {
                TrackMediaUploadUtil.m80294Z(imageUri.formatted());
            }
        }

        @Override // p149l.ym2
        /* JADX INFO: renamed from: f */
        public void mo102386f(String str) {
            super.mo102386f(str);
            Picture.ImageUri imageUri = this.f75999a;
            if (imageUri != null) {
                TrackMediaUploadUtil.m80294Z(imageUri.formatted());
            }
        }
    }

    /* JADX INFO: renamed from: l.bkb0$h */
    public class C15887h extends ti2<fa5<PooledByteBuffer>> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ VDraweeView f76001a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Picture.ImageUri f76002b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ int f76003c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ int f76004d;

        public C15887h(VDraweeView vDraweeView, Picture.ImageUri imageUri, int i, int i2) {
            this.f76001a = vDraweeView;
            this.f76002b = imageUri;
            this.f76003c = i;
            this.f76004d = i2;
        }

        @Override // p149l.ti2
        /* JADX INFO: renamed from: e */
        public void mo102384e(c5c<fa5<PooledByteBuffer>> c5cVar) {
            bkb0.this.m102331L0(this.f76001a, this.f76002b.formatted());
        }

        @Override // p149l.ti2
        /* JADX INFO: renamed from: f */
        public void mo96183f(c5c<fa5<PooledByteBuffer>> c5cVar) {
            if (c5cVar == null || !c5cVar.mo8182e() || c5cVar.getResult() == null || c5cVar.getResult().m120155B() == null) {
                return;
            }
            bkb0.this.m102362h0(this.f76001a, this.f76002b, new ab80(c5cVar.getResult().m120155B()), this.f76003c, this.f76004d);
        }
    }

    /* JADX INFO: renamed from: l.bkb0$i */
    public class C15888i extends SubsamplingScaleImageView.C22600f {

        /* JADX INFO: renamed from: a */
        public boolean f76006a = true;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ int f76007b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ PhotoDraweeView f76008c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ SubsamplingScaleImageView f76009d;

        public C15888i(int i, PhotoDraweeView photoDraweeView, SubsamplingScaleImageView subsamplingScaleImageView) {
            this.f76007b = i;
            this.f76008c = photoDraweeView;
            this.f76009d = subsamplingScaleImageView;
        }

        @Override // p147v.fresco.subscaleview.SubsamplingScaleImageView.C22600f, p147v.fresco.subscaleview.SubsamplingScaleImageView.InterfaceC22602h
        /* JADX INFO: renamed from: b */
        public void mo79104b() {
            if (this.f76006a) {
                float originalWidth = this.f76007b / (this.f76008c.getOriginalWidth() <= 960.0f ? this.f76008c.getOriginalWidth() : 960.0f);
                if (originalWidth > this.f76009d.getMaxScale()) {
                    this.f76009d.setMaxScale(originalWidth);
                }
                this.f76009d.setDoubleTapZoomScale(originalWidth);
                this.f76009d.m223446D0(originalWidth, new PointF(0.0f, 0.0f));
                this.f76009d.setAlpha(1.0f);
                this.f76006a = false;
            }
        }

        @Override // p147v.fresco.subscaleview.SubsamplingScaleImageView.C22600f, p147v.fresco.subscaleview.SubsamplingScaleImageView.InterfaceC22602h
        /* JADX INFO: renamed from: f */
        public void mo79105f(Exception exc) {
            this.f76009d.setVisibility(4);
        }
    }

    public bkb0(k850.C17954b c17954b) {
        super(m102297a0(c17954b), new C15880a());
        this.f75989f = new ConcurrentHashMap<>();
    }

    /* JADX INFO: renamed from: A */
    public static /* synthetic */ void m102291A(View view, Bitmap bitmap) {
        if (bitmap == null || bitmap.isRecycled()) {
            return;
        }
        view.setBackground(new BitmapDrawable(view.getResources(), bitmap));
    }

    /* JADX INFO: renamed from: S */
    public static boolean m102294S() {
        String strM79302F = RemoteConfig.m79298x().m79302F("Putong_ImageLoader_init");
        if (TextUtils.isEmpty(strM79302F)) {
            return false;
        }
        try {
            return new JSONObject(strM79302F).optBoolean("enableReportError");
        } catch (Exception e) {
            CrashHelper.m81296c(e);
            return false;
        }
    }

    /* JADX INFO: renamed from: T */
    public static boolean m102295T() {
        String strM79302F = RemoteConfig.m79298x().m79302F("Putong_ImageLoader_init");
        if (TextUtils.isEmpty(strM79302F)) {
            return false;
        }
        try {
            return new JSONObject(strM79302F).optBoolean("enableTrustAllCertificate");
        } catch (Exception e) {
            CrashHelper.m81296c(e);
            return false;
        }
    }

    /* JADX INFO: renamed from: W */
    public static boolean m102296W(Throwable th) {
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
    public static k850 m102297a0(k850.C17954b c17954b) {
        if (m102295T()) {
            try {
                SSLContext sSLContext = SSLContext.getInstance("SSL");
                C15881b c15881b = new C15881b();
                sSLContext.init(null, new TrustManager[]{c15881b}, new SecureRandom());
                c17954b.m144902w(sSLContext.getSocketFactory(), c15881b);
                c17954b.m144894o(new HostnameVerifier() { // from class: l.yjb0
                    @Override // javax.net.ssl.HostnameVerifier
                    public final boolean verify(String str, SSLSession sSLSession) {
                        return bkb0.m102305u(str, sSLSession);
                    }
                });
            } catch (Throwable th) {
                CrashHelper.m81296c(new FrescoImageTrustManagerException(th));
            }
        }
        c17954b.m144880a(new p6j());
        return c17954b.m144882c();
    }

    /* JADX INFO: renamed from: b0 */
    public static boolean m102298b0(int i, int i2) {
        return i > 0 && i2 > 0 && ((float) i2) / ((float) i) < 1.35f;
    }

    /* JADX INFO: renamed from: d0 */
    public static boolean m102299d0(PhotoDraweeView photoDraweeView) {
        if (xdl0.m208412y0() > photoDraweeView.getOriginalWidth()) {
            return (((float) xdl0.m208412y0()) / photoDraweeView.getOriginalWidth()) * photoDraweeView.getOriginalHeight() > ((float) (xdl0.m208408w0() * 2)) && photoDraweeView.getOriginalHeight() > ((float) xdl0.m208408w0()) && photoDraweeView.getOriginalHeight() / photoDraweeView.getOriginalWidth() > (((float) xdl0.m208408w0()) / ((float) xdl0.m208412y0())) * 2.0f;
        }
        return photoDraweeView.getOriginalHeight() > ((float) (xdl0.m208408w0() * 2)) && photoDraweeView.getOriginalHeight() / photoDraweeView.getOriginalWidth() > (((float) xdl0.m208408w0()) / ((float) xdl0.m208412y0())) * 2.0f;
    }

    /* JADX INFO: renamed from: o0 */
    public static void m102300o0(final PhotoDraweeView photoDraweeView, final SubsamplingScaleImageView subsamplingScaleImageView, String str, ngm ngmVar, Animatable animatable, Picture.ImageUri imageUri, final int i, int i2) {
        photoDraweeView.m223401w(ngmVar.getWidth(), ngmVar.getHeight());
        if (photoDraweeView.getOriginalHeight() > photoDraweeView.getOriginalWidth()) {
            float f = i2;
            float f2 = i;
            if (photoDraweeView.getOriginalHeight() / photoDraweeView.getOriginalWidth() > f / f2 && !m102298b0(i, i2)) {
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
                photoDraweeView.m223400v(originalWidth, 0.0f, 0.0f, true);
            }
        }
        String str2 = qib0.f154730s;
        if (m102299d0(photoDraweeView)) {
            final File fileM102355Z = qib0.f154691G.m102355Z(imageUri);
            if (NullChecker.m81303a(fileM102355Z)) {
                e51.m114742G(new Runnable() { // from class: l.pjb0
                    @Override // java.lang.Runnable
                    public final void run() {
                        bkb0.m102306v(subsamplingScaleImageView, i, photoDraweeView, fileM102355Z);
                    }
                });
            }
        }
    }

    /* JADX INFO: renamed from: q */
    public static /* synthetic */ void m102301q(SimpleDraweeView simpleDraweeView, String str, ngm ngmVar, Animatable animatable) {
        if (ngmVar == null || !(simpleDraweeView instanceof PhotoDraweeView)) {
            return;
        }
        ((PhotoDraweeView) simpleDraweeView).m223401w(ngmVar.getWidth(), ngmVar.getHeight());
    }

    /* JADX INFO: renamed from: t */
    public static /* synthetic */ void m102304t(SimpleDraweeView simpleDraweeView, String str, ngm ngmVar, Animatable animatable) {
        if (simpleDraweeView instanceof PhotoDraweeView) {
            ((PhotoDraweeView) simpleDraweeView).m223401w(ngmVar.getWidth(), ngmVar.getHeight());
        }
    }

    /* JADX INFO: renamed from: u */
    public static /* synthetic */ boolean m102305u(String str, SSLSession sSLSession) {
        return true;
    }

    /* JADX INFO: renamed from: v */
    public static /* synthetic */ void m102306v(SubsamplingScaleImageView subsamplingScaleImageView, int i, PhotoDraweeView photoDraweeView, File file) {
        subsamplingScaleImageView.setOnImageEventListener(new C15888i(i, photoDraweeView, subsamplingScaleImageView));
        String absolutePath = file.getAbsolutePath();
        if (i < 720) {
            try {
                if (file.length() > 204800) {
                    pgm pgmVar = new pgm(rhi.m179382z(file.getAbsolutePath()), pgm.f148725n, 0, Bitmap.CompressFormat.JPEG, true);
                    absolutePath = rhi.m179355B(pgmVar.m168764d());
                    photoDraweeView.setOriginalWidth(pgmVar.f148730d[0]);
                    photoDraweeView.setOriginalHeight(pgmVar.f148730d[1]);
                }
            } catch (IOException e) {
                CrashHelper.m81296c(e);
            }
        }
        subsamplingScaleImageView.setImage(nim.m159528m(absolutePath));
        subsamplingScaleImageView.setVisibility(0);
        subsamplingScaleImageView.setAlpha(0.0f);
    }

    /* JADX INFO: renamed from: w */
    public static /* synthetic */ void m102307w(SimpleDraweeView simpleDraweeView, String str, ngm ngmVar, Animatable animatable) {
        if (ngmVar == null || !(simpleDraweeView instanceof PhotoDraweeView)) {
            return;
        }
        ((PhotoDraweeView) simpleDraweeView).m223401w(ngmVar.getWidth(), ngmVar.getHeight());
    }

    /* JADX INFO: renamed from: z */
    public static /* synthetic */ void m102310z(SimpleDraweeView simpleDraweeView, String str, ngm ngmVar, Animatable animatable) {
        if (simpleDraweeView instanceof PhotoDraweeView) {
            ((PhotoDraweeView) simpleDraweeView).m223401w(ngmVar.getWidth(), ngmVar.getHeight());
        }
    }

    /* JADX INFO: renamed from: A0 */
    public void m102311A0(String str) {
        if (wc40.m202632i()) {
            m102371r0(str);
        } else {
            m102378y0(str, Priority.MEDIUM);
        }
    }

    /* JADX INFO: renamed from: B0 */
    public void m102312B0(DraweeView draweeView, Picture.ImageUri imageUri) {
        m102313C0(draweeView, imageUri, null);
    }

    /* JADX INFO: renamed from: C0 */
    public void m102313C0(DraweeView draweeView, Picture.ImageUri imageUri, ym2 ym2Var) {
        m102315D0(draweeView, imageUri, ym2Var, null, "");
    }

    /* JADX INFO: renamed from: D */
    public void m102314D(final View view, String str) {
        m102316E(str).observeOn(jo0.m142408a()).subscribe(mkd0.m154955G(new e30() { // from class: l.vjb0
            @Override // p149l.e30
            public final void call(Object obj) {
                bkb0.m102291A(view, (Bitmap) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: D0 */
    public void m102315D0(DraweeView draweeView, Picture.ImageUri imageUri, ym2 ym2Var, SubsamplingScaleImageView subsamplingScaleImageView, String str) {
        m102317E0(draweeView, imageUri, ym2Var, subsamplingScaleImageView, str, null);
    }

    /* JADX INFO: renamed from: E */
    public C22306c<Bitmap> m102316E(final String str) {
        return C22306c.create(new C22306c.a() { // from class: l.xjb0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f193195a.m102359e0(str, (z3g0) obj);
            }
        });
    }

    /* JADX INFO: renamed from: E0 */
    public void m102317E0(final DraweeView draweeView, final Picture.ImageUri imageUri, ym2 ym2Var, final SubsamplingScaleImageView subsamplingScaleImageView, String str, Pair<Integer, Integer> pair) {
        nvc0 nvc0Var;
        if (!TextUtils.isEmpty(str) && imageUri != null) {
            TrackMediaUploadUtil.m80292X(imageUri.formatted(), str);
        }
        fi70 fi70VarM184718g = m184718g(draweeView);
        ImageRequestBuilder imageRequestBuilderM102352X0 = m102352X0(imageUri);
        if (pair != null) {
            imageRequestBuilderM102352X0.m8603K(new biq(((Integer) pair.first).intValue(), ((Integer) pair.second).intValue()));
        }
        if (imageUri.isLocal || this.f75989f.contains(Media.URL_TO_CACHEKEY(imageUri.base)) || this.f165097a.m164417q(Uri.parse(Media.URL_TO_CACHEKEY(imageUri.formatted())))) {
            imageRequestBuilderM102352X0.m8604L(false);
        } else {
            int[] iArr = imageUri.formatType == 2 ? Picture.SQUARE_SIZES : Picture.SIZES;
            int i = -1;
            for (int length = iArr.length - 1; length >= 0; length--) {
                int i2 = iArr[length];
                if (this.f165097a.m164417q(Uri.parse(Media.URL_TO_CACHEKEY(imageUri.formatted(i2))))) {
                    if (i2 < imageUri.formatWidth) {
                        i = i2;
                        break;
                    }
                    i = i2;
                }
            }
            Picture.ImageUri imageUriCopy = i != -1 ? imageUri.copy(i) : null;
            if (imageUriCopy != null) {
                fi70VarM184718g.m8208F(true);
                ImageRequestBuilder imageRequestBuilderM102352X1 = m102352X0(imageUriCopy);
                if (i > imageUri.formatWidth && draweeView.getWidth() > 0 && draweeView.getHeight() > 0) {
                    if (imageUri.checkUrlBeanAvailable()) {
                        int iMin = Math.min(draweeView.getWidth(), imageUri.formatWidth);
                        Dimension dimension = imageUri.orignalDimen;
                        nvc0Var = new nvc0(iMin, (dimension.height * iMin) / dimension.width);
                    } else {
                        nvc0Var = new nvc0(draweeView.getWidth(), draweeView.getHeight());
                    }
                    imageRequestBuilderM102352X1.m8607O(nvc0Var);
                }
                if (pair != null) {
                    imageRequestBuilderM102352X1.m8603K(new biq(((Integer) pair.first).intValue(), ((Integer) pair.second).intValue()));
                }
                fi70VarM184718g.m8206D(imageRequestBuilderM102352X1.m8602J(ImageRequest.RequestLevel.DISK_CACHE).m8614a());
            } else {
                imageRequestBuilderM102352X0.m8604L(true);
            }
        }
        fi70VarM184718g.m8204B(new C15885f(qim.m174900a("progress", imageUri.formatted(), draweeView, ym2.m215333i(ym2Var, new g30() { // from class: l.ujb0
            @Override // p149l.g30
            /* JADX INFO: renamed from: a */
            public final void mo36055a(Object obj, Object obj2, Object obj3) {
                this.f176751a.m102361g0(draweeView, subsamplingScaleImageView, imageUri, (String) obj, (ngm) obj2, (Animatable) obj3);
            }
        })), imageUri));
        fi70VarM184718g.m8205C(imageRequestBuilderM102352X0.m8614a());
        draweeView.setController(fi70VarM184718g.build());
    }

    /* JADX INFO: renamed from: F */
    public void m102318F(ImageRequest imageRequest, e30<Bitmap> e30Var) {
        this.f165097a.m164409h(imageRequest, App.f15369e).mo8183f(new C15883d(e30Var), g84.m124744k());
    }

    /* JADX INFO: renamed from: F0 */
    public void m102319F0(DraweeView draweeView, Picture.ImageUri imageUri, String str, ym2 ym2Var) {
        m102315D0(draweeView, imageUri, ym2Var, null, str);
    }

    /* JADX INFO: renamed from: G */
    public void m102320G(Picture.ImageUri imageUri, e30<Bitmap> e30Var) {
        m102322H(imageUri, e30Var, false);
    }

    /* JADX INFO: renamed from: G0 */
    public void m102321G0(String str, String str2) {
        this.f75989f.put(str, str2);
    }

    /* JADX INFO: renamed from: H */
    public void m102322H(Picture.ImageUri imageUri, e30<Bitmap> e30Var, boolean z) {
        m102318F(m102352X0(imageUri).m8602J(z ? ImageRequest.RequestLevel.DISK_CACHE : ImageRequest.RequestLevel.FULL_FETCH).m8614a(), e30Var);
    }

    /* JADX INFO: renamed from: H0 */
    public ImageRequest m102323H0(SimpleDraweeView simpleDraweeView, Picture.ImageUri imageUri, int i, int i2) {
        return m102349V0(simpleDraweeView, imageUri, false, true, null, null, null, i, i2);
    }

    /* JADX INFO: renamed from: I */
    public void m102324I(String str, e30<Bitmap> e30Var) {
        m102318F(m184724n(str).m8614a(), e30Var);
    }

    /* JADX INFO: renamed from: I0 */
    public ImageRequest m102325I0(SimpleDraweeView simpleDraweeView, String str, int i, int i2) {
        return m102350W0(simpleDraweeView, str, false, true, null, null, null, i, i2);
    }

    /* JADX INFO: renamed from: J */
    public void m102326J(String str, e30<Bitmap> e30Var, int i, int i2) {
        m102318F(ImageRequestBuilder.m8592y(Uri.parse(str)).m8603K(new biq(i, i2)).m8614a(), e30Var);
    }

    /* JADX INFO: renamed from: J0 */
    public void m102327J0(SimpleDraweeView simpleDraweeView, Picture.ImageUri imageUri, boolean z) {
        m102329K0(simpleDraweeView, imageUri, z, true, null, null);
    }

    /* JADX INFO: renamed from: K */
    public void m102328K(SimpleDraweeView simpleDraweeView, int i, int i2, int i3) {
        int i4 = pgm.f148725n;
        m102330L(simpleDraweeView, i, i2, i3, new nvc0(i4, i4));
    }

    /* JADX INFO: renamed from: K0 */
    public void m102329K0(SimpleDraweeView simpleDraweeView, Picture.ImageUri imageUri, boolean z, boolean z2, nvc0 nvc0Var, ym2 ym2Var) {
        m102345T0(simpleDraweeView, imageUri, z, z2, nvc0Var, ym2Var, null);
    }

    /* JADX INFO: renamed from: L */
    public void m102330L(final SimpleDraweeView simpleDraweeView, int i, int i2, int i3, nvc0 nvc0Var) {
        ImageRequestBuilder imageRequestBuilderM8591x = ImageRequestBuilder.m8591x(i);
        if (nvc0Var != null) {
            imageRequestBuilderM8591x.m8607O(nvc0Var);
        }
        if (nvc0Var != null) {
            imageRequestBuilderM8591x.m8607O(nvc0Var);
        }
        simpleDraweeView.setController(m184718g(simpleDraweeView).m8205C(imageRequestBuilderM8591x.m8603K(new biq(i2, i3)).m8614a()).m8204B(new sl2.C19981b(qim.m174900a("blurLocalFile2", fvj0.m123312g(i).toString(), simpleDraweeView, ym2.m215333i(null, new g30() { // from class: l.tjb0
            @Override // p149l.g30
            /* JADX INFO: renamed from: a */
            public final void mo36055a(Object obj, Object obj2, Object obj3) {
                bkb0.m102310z(simpleDraweeView, (String) obj, (ngm) obj2, (Animatable) obj3);
            }
        })))).build());
    }

    /* JADX INFO: renamed from: L0 */
    public void m102331L0(SimpleDraweeView simpleDraweeView, String str) {
        m102335N0(simpleDraweeView, str, true);
    }

    /* JADX INFO: renamed from: M */
    public void m102332M(SimpleDraweeView simpleDraweeView, String str, int i, int i2) {
        int i3 = pgm.f148725n;
        m102334N(simpleDraweeView, str, i, i2, new nvc0(i3, i3));
    }

    /* JADX INFO: renamed from: M0 */
    public void m102333M0(SimpleDraweeView simpleDraweeView, String str, ym2 ym2Var) {
        m102337O0(simpleDraweeView, str, false, true, null, ym2Var);
    }

    /* JADX INFO: renamed from: N */
    public void m102334N(final SimpleDraweeView simpleDraweeView, String str, int i, int i2, nvc0 nvc0Var) {
        ImageRequestBuilder imageRequestBuilderM184724n = m184724n(str);
        if (nvc0Var != null) {
            imageRequestBuilderM184724n.m8607O(nvc0Var);
        }
        simpleDraweeView.setController(m184718g(simpleDraweeView).m8205C(imageRequestBuilderM184724n.m8603K(new biq(i, i2)).m8614a()).m8204B(new sl2.C19981b(qim.m174900a("blurLocalFile", str, simpleDraweeView, ym2.m215333i(null, new g30() { // from class: l.akb0
            @Override // p149l.g30
            /* JADX INFO: renamed from: a */
            public final void mo36055a(Object obj, Object obj2, Object obj3) {
                bkb0.m102304t(simpleDraweeView, (String) obj, (ngm) obj2, (Animatable) obj3);
            }
        })))).build());
    }

    /* JADX INFO: renamed from: N0 */
    public void m102335N0(SimpleDraweeView simpleDraweeView, String str, boolean z) {
        m102337O0(simpleDraweeView, str, false, z, null, null);
    }

    /* JADX INFO: renamed from: O */
    public void m102336O(SimpleDraweeView simpleDraweeView, String str, int i, int i2) {
        m102338P(simpleDraweeView, str, i, i2, 0);
    }

    /* JADX INFO: renamed from: O0 */
    public void m102337O0(SimpleDraweeView simpleDraweeView, String str, boolean z, boolean z2, nvc0 nvc0Var, ym2 ym2Var) {
        m102347U0(simpleDraweeView, str, z, z2, nvc0Var, ym2Var, null);
    }

    /* JADX INFO: renamed from: P */
    public void m102338P(SimpleDraweeView simpleDraweeView, String str, int i, int i2, int i3) {
        simpleDraweeView.setController(l6j.m148750g().m8204B(new sl2.C19981b(qim.m174900a("blurRemote1", str, simpleDraweeView, null))).mo8210b(simpleDraweeView.getController()).m8205C(ImageRequestBuilder.m8592y(Uri.parse(str)).m8603K(i3 != 0 ? new ciq(i, i2).m107094g(i3) : new biq(i, i2)).m8614a()).build());
    }

    /* JADX INFO: renamed from: P0 */
    public void m102339P0(VDraweeView vDraweeView, Picture.ImageUri imageUri, int i, int i2) {
        this.f165097a.m164411k(m102352X0(imageUri).m8606N(Priority.MEDIUM).m8614a(), null).mo8183f(new C15887h(vDraweeView, imageUri, i, i2), bjj0.m102185v());
    }

    /* JADX INFO: renamed from: Q */
    public void m102340Q(SimpleDraweeView simpleDraweeView, String str, int i, int i2, int i3, ym2 ym2Var) {
        simpleDraweeView.setController(l6j.m148750g().mo8210b(simpleDraweeView.getController()).m8205C(ImageRequestBuilder.m8592y(Uri.parse(str)).m8603K(i3 != 0 ? new ciq(i, i2).m107094g(i3) : new biq(i, i2)).m8614a()).m8204B(new sl2.C19981b(qim.m174900a("blurRemote2", str, simpleDraweeView, ym2Var))).build());
    }

    /* JADX INFO: renamed from: Q0 */
    public void m102341Q0(SimpleDraweeView simpleDraweeView, Picture.ImageUri imageUri) {
        m102327J0(simpleDraweeView, imageUri, true);
    }

    /* JADX INFO: renamed from: R */
    public void m102342R(String str) {
        this.f165097a.m164405d(Uri.parse(Media.URL_TO_CACHEKEY(str)));
    }

    /* JADX INFO: renamed from: R0 */
    public void m102343R0(SimpleDraweeView simpleDraweeView, Picture.ImageUri imageUri, String str) {
        if (!TextUtils.isEmpty(str) && imageUri != null) {
            TrackMediaUploadUtil.m80292X(imageUri.formatted(), str);
        }
        m102329K0(simpleDraweeView, imageUri, true, true, null, new C15886g(imageUri));
    }

    /* JADX INFO: renamed from: S0 */
    public void m102344S0(SimpleDraweeView simpleDraweeView, String str) {
        m102337O0(simpleDraweeView, str, true, false, null, null);
    }

    /* JADX INFO: renamed from: T0 */
    public ImageRequest m102345T0(SimpleDraweeView simpleDraweeView, Picture.ImageUri imageUri, boolean z, boolean z2, nvc0 nvc0Var, ym2 ym2Var, e30<ImageRequestBuilder> e30Var) {
        return m102349V0(simpleDraweeView, imageUri, z, z2, nvc0Var, ym2Var, e30Var, 0, 0);
    }

    /* JADX INFO: renamed from: U */
    public void m102346U(Set<ImageRequest> set) {
        if (vwb.m200296J(set)) {
            return;
        }
        for (ImageRequest imageRequest : set) {
            cx3 cx3VarMo113969c = this.f165097a.getCacheKeyFactory().mo113969c(imageRequest, Boolean.FALSE);
            if (cx3VarMo113969c != null) {
                imageRequest.m8585w().toString();
                this.f165097a.m164418r(imageRequest);
                this.f165097a.m164408g(Uri.parse(cx3VarMo113969c.getAnimationUriString()));
            }
        }
    }

    /* JADX INFO: renamed from: U0 */
    public ImageRequest m102347U0(SimpleDraweeView simpleDraweeView, String str, boolean z, boolean z2, nvc0 nvc0Var, ym2 ym2Var, e30<ImageRequestBuilder> e30Var) {
        return m102350W0(simpleDraweeView, str, z, z2, nvc0Var, ym2Var, e30Var, 0, 0);
    }

    /* JADX INFO: renamed from: V */
    public void m102348V() {
        pgy<cx3, da5> pgyVarM164414n = this.f165097a.m164414n();
        if (NullChecker.m81303a(pgyVarM164414n)) {
            pgyVarM164414n.mo101594d(new ph80() { // from class: l.wjb0
                @Override // p149l.ph80
                public final boolean apply(Object obj) {
                    return ((cx3) obj).toString().startsWith("FrameKey");
                }
            });
        }
    }

    /* JADX INFO: renamed from: V0 */
    public ImageRequest m102349V0(SimpleDraweeView simpleDraweeView, Picture.ImageUri imageUri, boolean z, boolean z2, nvc0 nvc0Var, ym2 ym2Var, e30<ImageRequestBuilder> e30Var, int i, int i2) {
        ImageRequestBuilder imageRequestBuilderM8594B = m102352X0(imageUri).m8594B(z ? ImageRequest.CacheChoice.SMALL : ImageRequest.CacheChoice.DEFAULT);
        if (nvc0Var != null) {
            imageRequestBuilderM8594B.m8607O(nvc0Var);
        } else if (i != 0 || i2 != 0) {
            imageRequestBuilderM8594B.m8607O(new nvc0(i, i2));
        }
        if (e30Var != null) {
            e30Var.call(imageRequestBuilderM8594B);
        }
        ImageRequest imageRequestM8614a = imageRequestBuilderM8594B.m8614a();
        simpleDraweeView.setController(m102351X(simpleDraweeView, imageRequestM8614a, z2, qim.m174900a("remote2", imageUri.formatted(), simpleDraweeView, ym2Var)));
        return imageRequestM8614a;
    }

    /* JADX INFO: renamed from: W0 */
    public ImageRequest m102350W0(SimpleDraweeView simpleDraweeView, String str, boolean z, boolean z2, nvc0 nvc0Var, ym2 ym2Var, e30<ImageRequestBuilder> e30Var, int i, int i2) {
        ImageRequestBuilder imageRequestBuilderM8594B = m184724n(str).m8594B(z ? ImageRequest.CacheChoice.SMALL : ImageRequest.CacheChoice.DEFAULT);
        if (nvc0Var != null) {
            imageRequestBuilderM8594B.m8607O(nvc0Var);
        } else if (i != 0 || i2 != 0) {
            imageRequestBuilderM8594B.m8607O(new nvc0(i, i2));
        } else if (simpleDraweeView.getWidth() != 0 && simpleDraweeView.getHeight() != 0) {
            imageRequestBuilderM8594B.m8607O(new nvc0(simpleDraweeView.getWidth(), simpleDraweeView.getHeight()));
        }
        if (e30Var != null) {
            e30Var.call(imageRequestBuilderM8594B);
        }
        ImageRequest imageRequestM8614a = imageRequestBuilderM8594B.m8614a();
        simpleDraweeView.setController(m102351X(simpleDraweeView, imageRequestM8614a, z2, qim.m174900a("remote", str, simpleDraweeView, ym2Var)));
        return imageRequestM8614a;
    }

    /* JADX INFO: renamed from: X */
    public AbstractC17238h7 m102351X(SimpleDraweeView simpleDraweeView, ImageRequest imageRequest, boolean z, ym2 ym2Var) {
        return m184719h(simpleDraweeView, z).m8204B(new sl2.C19981b(ym2Var)).m8205C(imageRequest).build();
    }

    /* JADX INFO: renamed from: X0 */
    public ImageRequestBuilder m102352X0(Picture.ImageUri imageUri) {
        if (imageUri.isLocal) {
            return m102368n0(imageUri, imageUri.base);
        }
        String str = this.f75989f.get(Media.URL_TO_CACHEKEY(imageUri.base));
        return str == null ? m184724n(imageUri.formatted()) : m102368n0(imageUri, str);
    }

    /* JADX INFO: renamed from: Y */
    public File m102353Y(ImageRequest imageRequest) {
        ox2 ox2VarMo8121c;
        cx3 cx3VarMo113968b = this.f165097a.getCacheKeyFactory().mo113968b(imageRequest, Boolean.FALSE);
        File fileM8584v = imageRequest.m8584v();
        mfi mfiVarMo94683e = shm.m184242m().m184251g().get().mo94683e();
        mfi mfiVarMo94679a = shm.m184242m().m184251g().get().mo94679a();
        if (!mfiVarMo94683e.mo8120b(cx3VarMo113968b) || mfiVarMo94683e.mo8121c(cx3VarMo113968b) == null) {
            ox2VarMo8121c = (!mfiVarMo94679a.mo8120b(cx3VarMo113968b) || mfiVarMo94679a.mo8121c(cx3VarMo113968b) == null) ? null : mfiVarMo94679a.mo8121c(cx3VarMo113968b);
        } else {
            ox2VarMo8121c = mfiVarMo94683e.mo8121c(cx3VarMo113968b);
        }
        return ox2VarMo8121c != null ? ((lfi) ox2VarMo8121c).getFile() : fileM8584v;
    }

    /* JADX INFO: renamed from: Y0 */
    public void m102354Y0(SimpleDraweeView simpleDraweeView, int i) {
        simpleDraweeView.setController(m184719h(simpleDraweeView, true).m8205C(m184724n(new Uri.Builder().scheme(ShareConstants.RES_PATH).path(String.valueOf(i)).build().toString()).m8614a()).build());
    }

    /* JADX INFO: renamed from: Z */
    public File m102355Z(Picture.ImageUri imageUri) {
        return m102353Y(m102352X0(imageUri).m8614a());
    }

    /* JADX INFO: renamed from: Z0 */
    public void m102356Z0(SimpleDraweeView simpleDraweeView, String str) {
        simpleDraweeView.setController(m184718g(simpleDraweeView).m8205C(m184724n(str).m8614a()).build());
    }

    /* JADX INFO: renamed from: c0 */
    public final boolean m102357c0(Picture.ImageUri imageUri) {
        boolean zIsEmpty = TextUtils.isEmpty(imageUri.base);
        Dimension dimension = imageUri.orignalDimen;
        if (!zIsEmpty) {
            return (dimension == null || dimension.width == 0 || dimension.height == 0) ? false : true;
        }
        if (dimension.width != 0) {
            return true;
        }
        CrashHelper.m81296c(new IllegalArgumentException("local image must have valid local url"));
        return true;
    }

    @Override // p149l.sl2
    /* JADX INFO: renamed from: e */
    public n850 mo102358e(k850 k850Var) {
        n850 n850Var = new n850(k850Var);
        n850Var.m158197o(new C15882c());
        return n850Var;
    }

    /* JADX INFO: renamed from: e0 */
    public final /* synthetic */ void m102359e0(String str, z3g0 z3g0Var) {
        Objects.requireNonNull(z3g0Var);
        m102324I(str, new rjb0(z3g0Var));
    }

    /* JADX INFO: renamed from: f0 */
    public final /* synthetic */ void m102360f0(SubsamplingScaleImageView subsamplingScaleImageView, PhotoDraweeView photoDraweeView, File file) {
        subsamplingScaleImageView.setOnImageEventListener(new C15884e(photoDraweeView, subsamplingScaleImageView));
        String absolutePath = file.getAbsolutePath();
        try {
            if (xdl0.m208412y0() < 720 && file.length() > 204800) {
                pgm pgmVar = new pgm(rhi.m179382z(file.getAbsolutePath()), pgm.f148725n, 0, Bitmap.CompressFormat.JPEG, true);
                absolutePath = rhi.m179355B(pgmVar.m168764d());
                photoDraweeView.setOriginalWidth(pgmVar.f148730d[0]);
                photoDraweeView.setOriginalHeight(pgmVar.f148730d[1]);
            }
        } catch (IOException e) {
            CrashHelper.m81296c(e);
        }
        subsamplingScaleImageView.setImage(nim.m159528m(absolutePath));
        subsamplingScaleImageView.setVisibility(0);
        subsamplingScaleImageView.setAlpha(0.0f);
    }

    /* JADX INFO: renamed from: g0 */
    public final /* synthetic */ void m102361g0(DraweeView draweeView, final SubsamplingScaleImageView subsamplingScaleImageView, Picture.ImageUri imageUri, String str, ngm ngmVar, Animatable animatable) {
        final File fileM102355Z;
        if (draweeView instanceof PhotoDraweeView) {
            final PhotoDraweeView photoDraweeView = (PhotoDraweeView) draweeView;
            photoDraweeView.m223401w(ngmVar.getWidth(), ngmVar.getHeight());
            if (photoDraweeView.getOriginalHeight() > photoDraweeView.getOriginalWidth() && photoDraweeView.getOriginalHeight() / photoDraweeView.getOriginalWidth() > xdl0.m208408w0() / xdl0.m208412y0()) {
                float fM208412y0 = xdl0.m208412y0() / ((photoDraweeView.getOriginalWidth() * xdl0.m208408w0()) / photoDraweeView.getOriginalHeight());
                if (fM208412y0 > photoDraweeView.getMaximumScale()) {
                    photoDraweeView.setMaximumScale(fM208412y0);
                }
                if (fM208412y0 > 1.1f) {
                    photoDraweeView.setDoubleTapScale(fM208412y0);
                }
                if (fM208412y0 > photoDraweeView.getMaximumScale()) {
                    fM208412y0 = photoDraweeView.getMaximumScale();
                }
                photoDraweeView.m223400v(fM208412y0, 0.0f, 0.0f, true);
            }
            if (!m102299d0(photoDraweeView) || subsamplingScaleImageView == null || (fileM102355Z = m102355Z(imageUri)) == null) {
                return;
            }
            e51.m114742G(new Runnable() { // from class: l.qjb0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f154910a.m102360f0(subsamplingScaleImageView, photoDraweeView, fileM102355Z);
                }
            });
        }
    }

    /* JADX INFO: renamed from: h0 */
    public final void m102362h0(VDraweeView vDraweeView, Picture.ImageUri imageUri, InputStream inputStream, int i, int i2) {
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
            vDraweeView.getHierarchy().mo112059f(new BitmapDrawable(vDraweeView.getResources(), bitmapRegionDecoderNewInstance.decodeRegion(rect, null)), 1.0f, true);
        } catch (Exception unused) {
            m102331L0(vDraweeView, imageUri.formatted());
        } finally {
            t95.m187604b(inputStream);
        }
    }

    /* JADX INFO: renamed from: i0 */
    public void m102363i0(SimpleDraweeView simpleDraweeView, String str) {
        int i = pgm.f148725n;
        m102364j0(simpleDraweeView, str, new nvc0(i, i), null);
    }

    /* JADX INFO: renamed from: j0 */
    public void m102364j0(final SimpleDraweeView simpleDraweeView, String str, nvc0 nvc0Var, Bitmap.Config config) {
        ImageRequestBuilder imageRequestBuilderM184724n = m184724n(str);
        if (nvc0Var != null) {
            imageRequestBuilderM184724n.m8607O(nvc0Var);
        }
        if (config != null) {
            imageRequestBuilderM184724n.m8599G(zem.m218356b().m96257p(config).m96242a());
        }
        imageRequestBuilderM184724n.m8609Q(oed0.m163941e());
        simpleDraweeView.setController(m184718g(simpleDraweeView).m8205C(imageRequestBuilderM184724n.m8614a()).m8204B(new sl2.C19981b(ym2.m215333i(null, new g30() { // from class: l.sjb0
            @Override // p149l.g30
            /* JADX INFO: renamed from: a */
            public final void mo36055a(Object obj, Object obj2, Object obj3) {
                bkb0.m102307w(simpleDraweeView, (String) obj, (ngm) obj2, (Animatable) obj3);
            }
        }))).build());
    }

    /* JADX INFO: renamed from: k0 */
    public void m102365k0(SimpleDraweeView simpleDraweeView, String str) {
        m102366l0(simpleDraweeView, str, null);
    }

    /* JADX INFO: renamed from: l0 */
    public void m102366l0(final SimpleDraweeView simpleDraweeView, String str, ym2 ym2Var) {
        ImageRequestBuilder imageRequestBuilderM8604L = m184724n(str).m8604L(true);
        int i = pgm.f148725n;
        ImageRequest imageRequestM8614a = imageRequestBuilderM8604L.m8607O(new nvc0(i, i)).m8614a();
        int iM208412y0 = xdl0.m208412y0() / 4;
        simpleDraweeView.setController(m184718g(simpleDraweeView).m8206D(m184724n(str).m8607O(new nvc0(iM208412y0, iM208412y0)).m8635z(true).m8614a()).m8205C(imageRequestM8614a).m8204B(new sl2.C19981b(ym2.m215333i(ym2Var, new g30() { // from class: l.zjb0
            @Override // p149l.g30
            /* JADX INFO: renamed from: a */
            public final void mo36055a(Object obj, Object obj2, Object obj3) {
                bkb0.m102301q(simpleDraweeView, (String) obj, (ngm) obj2, (Animatable) obj3);
            }
        }))).build());
    }

    /* JADX INFO: renamed from: m0 */
    public void m102367m0(SimpleDraweeView simpleDraweeView, String str) {
        int iM208412y0 = xdl0.m208412y0() / 4;
        simpleDraweeView.setController(m184718g(simpleDraweeView).m8205C(m184724n(str).m8607O(new nvc0(iM208412y0, iM208412y0)).m8635z(true).m8614a()).build());
    }

    /* JADX INFO: renamed from: n0 */
    public final ImageRequestBuilder m102368n0(Picture.ImageUri imageUri, String str) {
        ImageRequestBuilder imageRequestBuilderM184724n = m184724n(str);
        int i = imageUri.formatType;
        if (i == 1) {
            if (!m102357c0(imageUri)) {
                imageUri = new Picture.ImageUri(imageUri.base, new Dimension(new pgm(rhi.m179382z(imageUri.base)).f148730d), imageUri.fileType, imageUri.formatType, imageUri.formatWidth, imageUri.isLocal);
            }
            if (imageUri.orignalDimen.width > 0) {
                int i2 = imageUri.formatWidth;
                Dimension dimension = imageUri.orignalDimen;
                return imageRequestBuilderM184724n.m8607O(new nvc0(i2, (dimension.height * i2) / dimension.width));
            }
        } else if (i == 2) {
            int i3 = imageUri.formatWidth;
            return imageRequestBuilderM184724n.m8607O(new nvc0(i3, i3));
        }
        return imageRequestBuilderM184724n;
    }

    /* JADX INFO: renamed from: p0 */
    public c5c<Void> m102369p0(Picture.ImageUri imageUri) {
        return m102370q0(imageUri, Priority.MEDIUM, null, null);
    }

    /* JADX INFO: renamed from: q0 */
    public c5c<Void> m102370q0(Picture.ImageUri imageUri, Priority priority, String str, guc0 guc0Var) {
        if (!TextUtils.isEmpty(str) && imageUri != null) {
            TrackMediaUploadUtil.m80292X(imageUri.formatted(), str);
        }
        return this.f165097a.m164423w(m102352X0(imageUri).m8606N(priority).m8605M(guc0Var).m8614a(), null);
    }

    /* JADX INFO: renamed from: r0 */
    public void m102371r0(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.f165097a.m164423w(m184724n(str).m8606N(Priority.MEDIUM).m8614a(), null);
    }

    /* JADX INFO: renamed from: s0 */
    public c5c<Void> m102372s0(Picture.ImageUri imageUri, Priority priority, String str, guc0 guc0Var) {
        if (!TextUtils.isEmpty(str) && imageUri != null) {
            TrackMediaUploadUtil.m80292X(imageUri.formatted(), str);
        }
        return this.f165097a.m164421u(m102352X0(imageUri).m8606N(priority).m8605M(guc0Var).m8614a(), null);
    }

    /* JADX INFO: renamed from: t0 */
    public c5c<Void> m102373t0(Picture.ImageUri imageUri, Priority priority, String str, guc0 guc0Var, boolean z) {
        if (z) {
            imageUri.formatType = 3;
        }
        if (!TextUtils.isEmpty(str) && imageUri != null) {
            TrackMediaUploadUtil.m80292X(imageUri.formatted(), str);
        }
        return this.f165097a.m164421u(m102352X0(imageUri).m8606N(priority).m8605M(guc0Var).m8614a(), null);
    }

    /* JADX INFO: renamed from: u0 */
    public void m102374u0(Picture.ImageUri imageUri) {
        m102375v0(imageUri, Priority.MEDIUM);
    }

    /* JADX INFO: renamed from: v0 */
    public void m102375v0(Picture.ImageUri imageUri, Priority priority) {
        m102376w0(imageUri, priority, "");
    }

    /* JADX INFO: renamed from: w0 */
    public void m102376w0(Picture.ImageUri imageUri, Priority priority, String str) {
        m102372s0(imageUri, priority, str, null);
    }

    /* JADX INFO: renamed from: x0 */
    public void m102377x0(String str) {
        m102378y0(str, Priority.MEDIUM);
    }

    /* JADX INFO: renamed from: y0 */
    public void m102378y0(String str, Priority priority) {
        this.f165097a.m164421u(m184724n(str).m8606N(priority).m8614a(), null);
    }

    /* JADX INFO: renamed from: z0 */
    public void m102379z0(Picture.ImageUri imageUri) {
        if (wc40.m202632i()) {
            m102369p0(imageUri);
        } else {
            m102374u0(imageUri);
        }
    }

    /* JADX INFO: renamed from: l.bkb0$b */
    public class C15881b implements X509TrustManager {
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
