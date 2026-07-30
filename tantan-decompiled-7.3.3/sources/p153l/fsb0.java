package p153l;

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
import com.p051p1.mobile.android.app.App;
import com.p051p1.mobile.putong.api.fresco.FrescoImageRequestException;
import com.p051p1.mobile.putong.api.fresco.FrescoImageTrustManagerException;
import com.p051p1.mobile.putong.data.Dimension;
import com.p051p1.mobile.putong.data.Media;
import com.p051p1.mobile.putong.data.Picture;
import com.p051p1.mobile.putong.remote_config.RemoteConfig;
import com.p051p1.mobile.putong.util.TrackMediaUploadUtil;
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
import p137rx.C22421c;
import p151v.VDraweeView;
import p151v.fresco.photodraweeview.PhotoDraweeView;
import p151v.fresco.subscaleview.SubsamplingScaleImageView;

/* JADX INFO: loaded from: classes9.dex */
public class fsb0 extends am2 {

    /* JADX INFO: renamed from: g */
    public static boolean f100580g = m127078S();

    /* JADX INFO: renamed from: f */
    public final ConcurrentHashMap<String, String> f100581f;

    /* JADX INFO: renamed from: l.fsb0$a */
    public class C17055a extends xmd {
        @Override // p153l.xmd
        /* JADX INFO: renamed from: e */
        public Uri mo127163e(Uri uri) {
            return Uri.parse(Media.URL_TO_CACHEKEY(uri.toString()));
        }
    }

    /* JADX INFO: renamed from: l.fsb0$c */
    public class C17057c implements ukm {
        public C17057c() {
        }

        @Override // p153l.ukm
        /* JADX INFO: renamed from: a */
        public void mo127164a(x1d0 x1d0Var) {
            hl20.m135656c(x1d0Var, kl20.m150342b());
        }

        @Override // p153l.ukm
        /* JADX INFO: renamed from: b */
        public x1d0 mo127165b(x1d0 x1d0Var, NetworkTrackInfo.ReportType reportType) {
            return hl20.m135655b(x1d0Var, reportType);
        }

        @Override // p153l.ukm
        /* JADX INFO: renamed from: c */
        public void mo127166c(x1d0 x1d0Var, Throwable th) {
            hl20.m135654a(x1d0Var, th);
            if (!fsb0.f100580g || fsb0.m127080W(th)) {
                return;
            }
            CrashHelper.m82479c(new FrescoImageRequestException(th));
        }

        @Override // p153l.ukm
        public void requestCancel(x1d0 x1d0Var) {
            hl20.m135657d(x1d0Var);
        }
    }

    /* JADX INFO: renamed from: l.fsb0$d */
    public class C17058d extends hf2 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ y20 f100583a;

        public C17058d(y20 y20Var) {
            this.f100583a = y20Var;
        }

        @Override // p153l.aj2
        /* JADX INFO: renamed from: e */
        public void mo98346e(i6c<fb5<db5>> i6cVar) {
            this.f100583a.call(null);
        }

        @Override // p153l.hf2
        /* JADX INFO: renamed from: g */
        public void mo127167g(@Nullable Bitmap bitmap) {
            if (bitmap == null || bitmap.getHeight() <= 0 || bitmap.getWidth() <= 0) {
                this.f100583a.call(null);
            } else {
                this.f100583a.call(bitmap);
            }
        }
    }

    /* JADX INFO: renamed from: l.fsb0$e */
    public class C17059e extends SubsamplingScaleImageView.C22715f {

        /* JADX INFO: renamed from: a */
        public boolean f100585a = true;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ PhotoDraweeView f100586b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ SubsamplingScaleImageView f100587c;

        public C17059e(PhotoDraweeView photoDraweeView, SubsamplingScaleImageView subsamplingScaleImageView) {
            this.f100586b = photoDraweeView;
            this.f100587c = subsamplingScaleImageView;
        }

        @Override // p151v.fresco.subscaleview.SubsamplingScaleImageView.C22715f, p151v.fresco.subscaleview.SubsamplingScaleImageView.InterfaceC22717h
        /* JADX INFO: renamed from: b */
        public void mo80287b() {
            if (this.f100585a) {
                float fM105592y0 = bnl0.m105592y0() / (this.f100586b.getOriginalWidth() <= 960.0f ? this.f100586b.getOriginalWidth() : 960.0f);
                if (fM105592y0 > this.f100587c.getMaxScale()) {
                    this.f100587c.setMaxScale(fM105592y0);
                }
                this.f100587c.setDoubleTapZoomScale(fM105592y0);
                this.f100587c.m224692D0(fM105592y0, new PointF(0.0f, 0.0f));
                this.f100587c.setAlpha(1.0f);
                this.f100585a = false;
            }
        }

        @Override // p151v.fresco.subscaleview.SubsamplingScaleImageView.C22715f, p151v.fresco.subscaleview.SubsamplingScaleImageView.InterfaceC22717h
        /* JADX INFO: renamed from: f */
        public void mo80288f(Exception exc) {
            this.f100587c.setVisibility(4);
        }
    }

    /* JADX INFO: renamed from: l.fsb0$f */
    public class C17060f extends am2.C15744b {

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ Picture.ImageUri f100589c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C17060f(fn2 fn2Var, Picture.ImageUri imageUri) {
            super(fn2Var);
            this.f100589c = imageUri;
        }

        @Override // p153l.am2.C15744b, p153l.li2, p153l.v36
        /* JADX INFO: renamed from: a */
        public void mo98800a(String str) {
            super.mo98800a(str);
            Picture.ImageUri imageUri = this.f100589c;
            if (imageUri != null) {
                TrackMediaUploadUtil.m81477Z(imageUri.formatted());
            }
        }

        @Override // p153l.am2.C15744b, p153l.li2, p153l.v36
        /* JADX INFO: renamed from: d */
        public void mo49464d(String str, Throwable th) {
            super.mo49464d(str, th);
            Picture.ImageUri imageUri = this.f100589c;
            if (imageUri != null) {
                TrackMediaUploadUtil.m81477Z(imageUri.formatted());
            }
        }
    }

    /* JADX INFO: renamed from: l.fsb0$g */
    public class C17061g extends fn2 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Picture.ImageUri f100591a;

        public C17061g(Picture.ImageUri imageUri) {
            this.f100591a = imageUri;
        }

        @Override // p153l.fn2
        /* JADX INFO: renamed from: c */
        public void mo40110c(String str, Throwable th) {
            super.mo40110c(str, th);
            Picture.ImageUri imageUri = this.f100591a;
            if (imageUri != null) {
                TrackMediaUploadUtil.m81477Z(imageUri.formatted());
            }
        }

        @Override // p153l.fn2
        /* JADX INFO: renamed from: f */
        public void mo108585f(String str) {
            super.mo108585f(str);
            Picture.ImageUri imageUri = this.f100591a;
            if (imageUri != null) {
                TrackMediaUploadUtil.m81477Z(imageUri.formatted());
            }
        }
    }

    /* JADX INFO: renamed from: l.fsb0$h */
    public class C17062h extends aj2<fb5<PooledByteBuffer>> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ VDraweeView f100593a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Picture.ImageUri f100594b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ int f100595c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ int f100596d;

        public C17062h(VDraweeView vDraweeView, Picture.ImageUri imageUri, int i, int i2) {
            this.f100593a = vDraweeView;
            this.f100594b = imageUri;
            this.f100595c = i;
            this.f100596d = i2;
        }

        @Override // p153l.aj2
        /* JADX INFO: renamed from: e */
        public void mo98346e(i6c<fb5<PooledByteBuffer>> i6cVar) {
            fsb0.this.m127115L0(this.f100593a, this.f100594b.formatted());
        }

        @Override // p153l.aj2
        /* JADX INFO: renamed from: f */
        public void mo98347f(i6c<fb5<PooledByteBuffer>> i6cVar) {
            if (i6cVar == null || !i6cVar.mo8236e() || i6cVar.getResult() == null || i6cVar.getResult().m124875B() == null) {
                return;
            }
            fsb0.this.m127145h0(this.f100593a, this.f100594b, new gj80(i6cVar.getResult().m124875B()), this.f100595c, this.f100596d);
        }
    }

    /* JADX INFO: renamed from: l.fsb0$i */
    public class C17063i extends SubsamplingScaleImageView.C22715f {

        /* JADX INFO: renamed from: a */
        public boolean f100598a = true;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ int f100599b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ PhotoDraweeView f100600c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ SubsamplingScaleImageView f100601d;

        public C17063i(int i, PhotoDraweeView photoDraweeView, SubsamplingScaleImageView subsamplingScaleImageView) {
            this.f100599b = i;
            this.f100600c = photoDraweeView;
            this.f100601d = subsamplingScaleImageView;
        }

        @Override // p151v.fresco.subscaleview.SubsamplingScaleImageView.C22715f, p151v.fresco.subscaleview.SubsamplingScaleImageView.InterfaceC22717h
        /* JADX INFO: renamed from: b */
        public void mo80287b() {
            if (this.f100598a) {
                float originalWidth = this.f100599b / (this.f100600c.getOriginalWidth() <= 960.0f ? this.f100600c.getOriginalWidth() : 960.0f);
                if (originalWidth > this.f100601d.getMaxScale()) {
                    this.f100601d.setMaxScale(originalWidth);
                }
                this.f100601d.setDoubleTapZoomScale(originalWidth);
                this.f100601d.m224692D0(originalWidth, new PointF(0.0f, 0.0f));
                this.f100601d.setAlpha(1.0f);
                this.f100598a = false;
            }
        }

        @Override // p151v.fresco.subscaleview.SubsamplingScaleImageView.C22715f, p151v.fresco.subscaleview.SubsamplingScaleImageView.InterfaceC22717h
        /* JADX INFO: renamed from: f */
        public void mo80288f(Exception exc) {
            this.f100601d.setVisibility(4);
        }
    }

    public fsb0(rg50.C19837b c19837b) {
        super(m127081a0(c19837b), new C17055a());
        this.f100581f = new ConcurrentHashMap<>();
    }

    /* JADX INFO: renamed from: A */
    public static /* synthetic */ void m127075A(View view, Bitmap bitmap) {
        if (bitmap == null || bitmap.isRecycled()) {
            return;
        }
        view.setBackground(new BitmapDrawable(view.getResources(), bitmap));
    }

    /* JADX INFO: renamed from: S */
    public static boolean m127078S() {
        String strM80485F = RemoteConfig.m80481x().m80485F("Putong_ImageLoader_init");
        if (TextUtils.isEmpty(strM80485F)) {
            return false;
        }
        try {
            return new JSONObject(strM80485F).optBoolean("enableReportError");
        } catch (Exception e) {
            CrashHelper.m82479c(e);
            return false;
        }
    }

    /* JADX INFO: renamed from: T */
    public static boolean m127079T() {
        String strM80485F = RemoteConfig.m80481x().m80485F("Putong_ImageLoader_init");
        if (TextUtils.isEmpty(strM80485F)) {
            return false;
        }
        try {
            return new JSONObject(strM80485F).optBoolean("enableTrustAllCertificate");
        } catch (Exception e) {
            CrashHelper.m82479c(e);
            return false;
        }
    }

    /* JADX INFO: renamed from: W */
    public static boolean m127080W(Throwable th) {
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
    public static rg50 m127081a0(rg50.C19837b c19837b) {
        if (m127079T()) {
            try {
                SSLContext sSLContext = SSLContext.getInstance("SSL");
                C17056b c17056b = new C17056b();
                sSLContext.init(null, new TrustManager[]{c17056b}, new SecureRandom());
                c19837b.m181386x(sSLContext.getSocketFactory(), c17056b);
                c19837b.m181377o(new HostnameVerifier() { // from class: l.csb0
                    @Override // javax.net.ssl.HostnameVerifier
                    public final boolean verify(String str, SSLSession sSLSession) {
                        return fsb0.m127089u(str, sSLSession);
                    }
                });
            } catch (Throwable th) {
                CrashHelper.m82479c(new FrescoImageTrustManagerException(th));
            }
        }
        c19837b.m181363a(new j9j());
        return c19837b.m181365c();
    }

    /* JADX INFO: renamed from: b0 */
    public static boolean m127082b0(int i, int i2) {
        return i > 0 && i2 > 0 && ((float) i2) / ((float) i) < 1.35f;
    }

    /* JADX INFO: renamed from: d0 */
    public static boolean m127083d0(PhotoDraweeView photoDraweeView) {
        if (bnl0.m105592y0() > photoDraweeView.getOriginalWidth()) {
            return (((float) bnl0.m105592y0()) / photoDraweeView.getOriginalWidth()) * photoDraweeView.getOriginalHeight() > ((float) (bnl0.m105588w0() * 2)) && photoDraweeView.getOriginalHeight() > ((float) bnl0.m105588w0()) && photoDraweeView.getOriginalHeight() / photoDraweeView.getOriginalWidth() > (((float) bnl0.m105588w0()) / ((float) bnl0.m105592y0())) * 2.0f;
        }
        return photoDraweeView.getOriginalHeight() > ((float) (bnl0.m105588w0() * 2)) && photoDraweeView.getOriginalHeight() / photoDraweeView.getOriginalWidth() > (((float) bnl0.m105588w0()) / ((float) bnl0.m105592y0())) * 2.0f;
    }

    /* JADX INFO: renamed from: o0 */
    public static void m127084o0(final PhotoDraweeView photoDraweeView, final SubsamplingScaleImageView subsamplingScaleImageView, String str, qim qimVar, Animatable animatable, Picture.ImageUri imageUri, final int i, int i2) {
        photoDraweeView.m224647w(qimVar.getWidth(), qimVar.getHeight());
        if (photoDraweeView.getOriginalHeight() > photoDraweeView.getOriginalWidth()) {
            float f = i2;
            float f2 = i;
            if (photoDraweeView.getOriginalHeight() / photoDraweeView.getOriginalWidth() > f / f2 && !m127082b0(i, i2)) {
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
                photoDraweeView.m224646v(originalWidth, 0.0f, 0.0f, true);
            }
        }
        String str2 = uqb0.f180413s;
        if (m127083d0(photoDraweeView)) {
            final File fileM127139Z = uqb0.f180374G.m127139Z(imageUri);
            if (NullChecker.m82486a(fileM127139Z)) {
                l51.m152887G(new Runnable() { // from class: l.trb0
                    @Override // java.lang.Runnable
                    public final void run() {
                        fsb0.m127090v(subsamplingScaleImageView, i, photoDraweeView, fileM127139Z);
                    }
                });
            }
        }
    }

    /* JADX INFO: renamed from: q */
    public static /* synthetic */ void m127085q(SimpleDraweeView simpleDraweeView, String str, qim qimVar, Animatable animatable) {
        if (qimVar == null || !(simpleDraweeView instanceof PhotoDraweeView)) {
            return;
        }
        ((PhotoDraweeView) simpleDraweeView).m224647w(qimVar.getWidth(), qimVar.getHeight());
    }

    /* JADX INFO: renamed from: t */
    public static /* synthetic */ void m127088t(SimpleDraweeView simpleDraweeView, String str, qim qimVar, Animatable animatable) {
        if (simpleDraweeView instanceof PhotoDraweeView) {
            ((PhotoDraweeView) simpleDraweeView).m224647w(qimVar.getWidth(), qimVar.getHeight());
        }
    }

    /* JADX INFO: renamed from: u */
    public static /* synthetic */ boolean m127089u(String str, SSLSession sSLSession) {
        return true;
    }

    /* JADX INFO: renamed from: v */
    public static /* synthetic */ void m127090v(SubsamplingScaleImageView subsamplingScaleImageView, int i, PhotoDraweeView photoDraweeView, File file) {
        subsamplingScaleImageView.setOnImageEventListener(new C17063i(i, photoDraweeView, subsamplingScaleImageView));
        String absolutePath = file.getAbsolutePath();
        if (i < 720) {
            try {
                if (file.length() > 204800) {
                    sim simVar = new sim(oki.m168038z(file.getAbsolutePath()), sim.f168838n, 0, Bitmap.CompressFormat.JPEG, true);
                    absolutePath = oki.m168011B(simVar.m186025d());
                    photoDraweeView.setOriginalWidth(simVar.f168843d[0]);
                    photoDraweeView.setOriginalHeight(simVar.f168843d[1]);
                }
            } catch (IOException e) {
                CrashHelper.m82479c(e);
            }
        }
        subsamplingScaleImageView.setImage(qkm.m176955m(absolutePath));
        subsamplingScaleImageView.setVisibility(0);
        subsamplingScaleImageView.setAlpha(0.0f);
    }

    /* JADX INFO: renamed from: w */
    public static /* synthetic */ void m127091w(SimpleDraweeView simpleDraweeView, String str, qim qimVar, Animatable animatable) {
        if (qimVar == null || !(simpleDraweeView instanceof PhotoDraweeView)) {
            return;
        }
        ((PhotoDraweeView) simpleDraweeView).m224647w(qimVar.getWidth(), qimVar.getHeight());
    }

    /* JADX INFO: renamed from: z */
    public static /* synthetic */ void m127094z(SimpleDraweeView simpleDraweeView, String str, qim qimVar, Animatable animatable) {
        if (simpleDraweeView instanceof PhotoDraweeView) {
            ((PhotoDraweeView) simpleDraweeView).m224647w(qimVar.getWidth(), qimVar.getHeight());
        }
    }

    /* JADX INFO: renamed from: A0 */
    public void m127095A0(String str) {
        if (kl40.m150351i()) {
            m127154r0(str);
        } else {
            m127161y0(str, Priority.MEDIUM);
        }
    }

    /* JADX INFO: renamed from: B0 */
    public void m127096B0(DraweeView draweeView, Picture.ImageUri imageUri) {
        m127097C0(draweeView, imageUri, null);
    }

    /* JADX INFO: renamed from: C0 */
    public void m127097C0(DraweeView draweeView, Picture.ImageUri imageUri, fn2 fn2Var) {
        m127099D0(draweeView, imageUri, fn2Var, null, "");
    }

    /* JADX INFO: renamed from: D */
    public void m127098D(final View view, String str) {
        m127100E(str).observeOn(fo0.m126432a()).subscribe(psd0.m173596G(new y20() { // from class: l.zrb0
            @Override // p153l.y20
            public final void call(Object obj) {
                fsb0.m127075A(view, (Bitmap) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: D0 */
    public void m127099D0(DraweeView draweeView, Picture.ImageUri imageUri, fn2 fn2Var, SubsamplingScaleImageView subsamplingScaleImageView, String str) {
        m127101E0(draweeView, imageUri, fn2Var, subsamplingScaleImageView, str, null);
    }

    /* JADX INFO: renamed from: E */
    public C22421c<Bitmap> m127100E(final String str) {
        return C22421c.create(new C22421c.a() { // from class: l.bsb0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f78135a.m127142e0(str, (gcg0) obj);
            }
        });
    }

    /* JADX INFO: renamed from: E0 */
    public void m127101E0(final DraweeView draweeView, final Picture.ImageUri imageUri, fn2 fn2Var, final SubsamplingScaleImageView subsamplingScaleImageView, String str, Pair<Integer, Integer> pair) {
        q3d0 q3d0Var;
        if (!TextUtils.isEmpty(str) && imageUri != null) {
            TrackMediaUploadUtil.m81475X(imageUri.formatted(), str);
        }
        lq70 lq70VarM98791g = m98791g(draweeView);
        ImageRequestBuilder imageRequestBuilderM127136X0 = m127136X0(imageUri);
        if (pair != null) {
            imageRequestBuilderM127136X0.m8657K(new bkq(((Integer) pair.first).intValue(), ((Integer) pair.second).intValue()));
        }
        if (imageUri.isLocal || this.f100581f.contains(Media.URL_TO_CACHEKEY(imageUri.base)) || this.f72189a.m181728q(Uri.parse(Media.URL_TO_CACHEKEY(imageUri.formatted())))) {
            imageRequestBuilderM127136X0.m8658L(false);
        } else {
            int[] iArr = imageUri.formatType == 2 ? Picture.SQUARE_SIZES : Picture.SIZES;
            int i = -1;
            for (int length = iArr.length - 1; length >= 0; length--) {
                int i2 = iArr[length];
                if (this.f72189a.m181728q(Uri.parse(Media.URL_TO_CACHEKEY(imageUri.formatted(i2))))) {
                    if (i2 < imageUri.formatWidth) {
                        i = i2;
                        break;
                    }
                    i = i2;
                }
            }
            Picture.ImageUri imageUriCopy = i != -1 ? imageUri.copy(i) : null;
            if (imageUriCopy != null) {
                lq70VarM98791g.m8262F(true);
                ImageRequestBuilder imageRequestBuilderM127136X1 = m127136X0(imageUriCopy);
                if (i > imageUri.formatWidth && draweeView.getWidth() > 0 && draweeView.getHeight() > 0) {
                    if (imageUri.checkUrlBeanAvailable()) {
                        int iMin = Math.min(draweeView.getWidth(), imageUri.formatWidth);
                        Dimension dimension = imageUri.orignalDimen;
                        q3d0Var = new q3d0(iMin, (dimension.height * iMin) / dimension.width);
                    } else {
                        q3d0Var = new q3d0(draweeView.getWidth(), draweeView.getHeight());
                    }
                    imageRequestBuilderM127136X1.m8661O(q3d0Var);
                }
                if (pair != null) {
                    imageRequestBuilderM127136X1.m8657K(new bkq(((Integer) pair.first).intValue(), ((Integer) pair.second).intValue()));
                }
                lq70VarM98791g.m8260D(imageRequestBuilderM127136X1.m8656J(ImageRequest.RequestLevel.DISK_CACHE).m8668a());
            } else {
                imageRequestBuilderM127136X0.m8658L(true);
            }
        }
        lq70VarM98791g.m8258B(new C17060f(tkm.m191580a("progress", imageUri.formatted(), draweeView, fn2.m126351i(fn2Var, new a30() { // from class: l.yrb0
            @Override // p153l.a30
            /* JADX INFO: renamed from: a */
            public final void mo37058a(Object obj, Object obj2, Object obj3) {
                this.f201300a.m127144g0(draweeView, subsamplingScaleImageView, imageUri, (String) obj, (qim) obj2, (Animatable) obj3);
            }
        })), imageUri));
        lq70VarM98791g.m8259C(imageRequestBuilderM127136X0.m8668a());
        draweeView.setController(lq70VarM98791g.build());
    }

    /* JADX INFO: renamed from: F */
    public void m127102F(ImageRequest imageRequest, y20<Bitmap> y20Var) {
        this.f72189a.m181720h(imageRequest, App.f16088e).mo8237f(new C17058d(y20Var), f94.m124626k());
    }

    /* JADX INFO: renamed from: F0 */
    public void m127103F0(DraweeView draweeView, Picture.ImageUri imageUri, String str, fn2 fn2Var) {
        m127099D0(draweeView, imageUri, fn2Var, null, str);
    }

    /* JADX INFO: renamed from: G */
    public void m127104G(Picture.ImageUri imageUri, y20<Bitmap> y20Var) {
        m127106H(imageUri, y20Var, false);
    }

    /* JADX INFO: renamed from: G0 */
    public void m127105G0(String str, String str2) {
        this.f100581f.put(str, str2);
    }

    /* JADX INFO: renamed from: H */
    public void m127106H(Picture.ImageUri imageUri, y20<Bitmap> y20Var, boolean z) {
        m127102F(m127136X0(imageUri).m8656J(z ? ImageRequest.RequestLevel.DISK_CACHE : ImageRequest.RequestLevel.FULL_FETCH).m8668a(), y20Var);
    }

    /* JADX INFO: renamed from: H0 */
    public ImageRequest m127107H0(SimpleDraweeView simpleDraweeView, Picture.ImageUri imageUri, int i, int i2) {
        return m127133V0(simpleDraweeView, imageUri, false, true, null, null, null, i, i2);
    }

    /* JADX INFO: renamed from: I */
    public void m127108I(String str, y20<Bitmap> y20Var) {
        m127102F(m98797n(str).m8668a(), y20Var);
    }

    /* JADX INFO: renamed from: I0 */
    public ImageRequest m127109I0(SimpleDraweeView simpleDraweeView, String str, int i, int i2) {
        return m127134W0(simpleDraweeView, str, false, true, null, null, null, i, i2);
    }

    /* JADX INFO: renamed from: J */
    public void m127110J(String str, y20<Bitmap> y20Var, int i, int i2) {
        m127102F(ImageRequestBuilder.m8646y(Uri.parse(str)).m8657K(new bkq(i, i2)).m8668a(), y20Var);
    }

    /* JADX INFO: renamed from: J0 */
    public void m127111J0(SimpleDraweeView simpleDraweeView, Picture.ImageUri imageUri, boolean z) {
        m127113K0(simpleDraweeView, imageUri, z, true, null, null);
    }

    /* JADX INFO: renamed from: K */
    public void m127112K(SimpleDraweeView simpleDraweeView, int i, int i2, int i3) {
        int i4 = sim.f168838n;
        m127114L(simpleDraweeView, i, i2, i3, new q3d0(i4, i4));
    }

    /* JADX INFO: renamed from: K0 */
    public void m127113K0(SimpleDraweeView simpleDraweeView, Picture.ImageUri imageUri, boolean z, boolean z2, q3d0 q3d0Var, fn2 fn2Var) {
        m127129T0(simpleDraweeView, imageUri, z, z2, q3d0Var, fn2Var, null);
    }

    /* JADX INFO: renamed from: L */
    public void m127114L(final SimpleDraweeView simpleDraweeView, int i, int i2, int i3, q3d0 q3d0Var) {
        ImageRequestBuilder imageRequestBuilderM8645x = ImageRequestBuilder.m8645x(i);
        if (q3d0Var != null) {
            imageRequestBuilderM8645x.m8661O(q3d0Var);
        }
        if (q3d0Var != null) {
            imageRequestBuilderM8645x.m8661O(q3d0Var);
        }
        simpleDraweeView.setController(m98791g(simpleDraweeView).m8259C(imageRequestBuilderM8645x.m8657K(new bkq(i2, i3)).m8668a()).m8258B(new am2.C15744b(tkm.m191580a("blurLocalFile2", i4k0.m138558g(i).toString(), simpleDraweeView, fn2.m126351i(null, new a30() { // from class: l.xrb0
            @Override // p153l.a30
            /* JADX INFO: renamed from: a */
            public final void mo37058a(Object obj, Object obj2, Object obj3) {
                fsb0.m127094z(simpleDraweeView, (String) obj, (qim) obj2, (Animatable) obj3);
            }
        })))).build());
    }

    /* JADX INFO: renamed from: L0 */
    public void m127115L0(SimpleDraweeView simpleDraweeView, String str) {
        m127119N0(simpleDraweeView, str, true);
    }

    /* JADX INFO: renamed from: M */
    public void m127116M(SimpleDraweeView simpleDraweeView, String str, int i, int i2) {
        int i3 = sim.f168838n;
        m127118N(simpleDraweeView, str, i, i2, new q3d0(i3, i3));
    }

    /* JADX INFO: renamed from: M0 */
    public void m127117M0(SimpleDraweeView simpleDraweeView, String str, fn2 fn2Var) {
        m127121O0(simpleDraweeView, str, false, true, null, fn2Var);
    }

    /* JADX INFO: renamed from: N */
    public void m127118N(final SimpleDraweeView simpleDraweeView, String str, int i, int i2, q3d0 q3d0Var) {
        ImageRequestBuilder imageRequestBuilderM98797n = m98797n(str);
        if (q3d0Var != null) {
            imageRequestBuilderM98797n.m8661O(q3d0Var);
        }
        simpleDraweeView.setController(m98791g(simpleDraweeView).m8259C(imageRequestBuilderM98797n.m8657K(new bkq(i, i2)).m8668a()).m8258B(new am2.C15744b(tkm.m191580a("blurLocalFile", str, simpleDraweeView, fn2.m126351i(null, new a30() { // from class: l.esb0
            @Override // p153l.a30
            /* JADX INFO: renamed from: a */
            public final void mo37058a(Object obj, Object obj2, Object obj3) {
                fsb0.m127088t(simpleDraweeView, (String) obj, (qim) obj2, (Animatable) obj3);
            }
        })))).build());
    }

    /* JADX INFO: renamed from: N0 */
    public void m127119N0(SimpleDraweeView simpleDraweeView, String str, boolean z) {
        m127121O0(simpleDraweeView, str, false, z, null, null);
    }

    /* JADX INFO: renamed from: O */
    public void m127120O(SimpleDraweeView simpleDraweeView, String str, int i, int i2) {
        m127122P(simpleDraweeView, str, i, i2, 0);
    }

    /* JADX INFO: renamed from: O0 */
    public void m127121O0(SimpleDraweeView simpleDraweeView, String str, boolean z, boolean z2, q3d0 q3d0Var, fn2 fn2Var) {
        m127131U0(simpleDraweeView, str, z, z2, q3d0Var, fn2Var, null);
    }

    /* JADX INFO: renamed from: P */
    public void m127122P(SimpleDraweeView simpleDraweeView, String str, int i, int i2, int i3) {
        simpleDraweeView.setController(f9j.m124665g().m8258B(new am2.C15744b(tkm.m191580a("blurRemote1", str, simpleDraweeView, null))).mo8264b(simpleDraweeView.getController()).m8259C(ImageRequestBuilder.m8646y(Uri.parse(str)).m8657K(i3 != 0 ? new ckq(i, i2).m110381g(i3) : new bkq(i, i2)).m8668a()).build());
    }

    /* JADX INFO: renamed from: P0 */
    public void m127123P0(VDraweeView vDraweeView, Picture.ImageUri imageUri, int i, int i2) {
        this.f72189a.m181722k(m127136X0(imageUri).m8660N(Priority.MEDIUM).m8668a(), null).mo8237f(new C17062h(vDraweeView, imageUri, i, i2), esj0.m122371v());
    }

    /* JADX INFO: renamed from: Q */
    public void m127124Q(SimpleDraweeView simpleDraweeView, String str, int i, int i2, int i3, fn2 fn2Var) {
        simpleDraweeView.setController(f9j.m124665g().mo8264b(simpleDraweeView.getController()).m8259C(ImageRequestBuilder.m8646y(Uri.parse(str)).m8657K(i3 != 0 ? new ckq(i, i2).m110381g(i3) : new bkq(i, i2)).m8668a()).m8258B(new am2.C15744b(tkm.m191580a("blurRemote2", str, simpleDraweeView, fn2Var))).build());
    }

    /* JADX INFO: renamed from: Q0 */
    public void m127125Q0(SimpleDraweeView simpleDraweeView, Picture.ImageUri imageUri) {
        m127111J0(simpleDraweeView, imageUri, true);
    }

    /* JADX INFO: renamed from: R */
    public void m127126R(String str) {
        this.f72189a.m181716d(Uri.parse(Media.URL_TO_CACHEKEY(str)));
    }

    /* JADX INFO: renamed from: R0 */
    public void m127127R0(SimpleDraweeView simpleDraweeView, Picture.ImageUri imageUri, String str) {
        if (!TextUtils.isEmpty(str) && imageUri != null) {
            TrackMediaUploadUtil.m81475X(imageUri.formatted(), str);
        }
        m127113K0(simpleDraweeView, imageUri, true, true, null, new C17061g(imageUri));
    }

    /* JADX INFO: renamed from: S0 */
    public void m127128S0(SimpleDraweeView simpleDraweeView, String str) {
        m127121O0(simpleDraweeView, str, true, false, null, null);
    }

    /* JADX INFO: renamed from: T0 */
    public ImageRequest m127129T0(SimpleDraweeView simpleDraweeView, Picture.ImageUri imageUri, boolean z, boolean z2, q3d0 q3d0Var, fn2 fn2Var, y20<ImageRequestBuilder> y20Var) {
        return m127133V0(simpleDraweeView, imageUri, z, z2, q3d0Var, fn2Var, y20Var, 0, 0);
    }

    /* JADX INFO: renamed from: U */
    public void m127130U(Set<ImageRequest> set) {
        if (jyb.m147479J(set)) {
            return;
        }
        for (ImageRequest imageRequest : set) {
            by3 by3VarMo113094c = this.f72189a.getCacheKeyFactory().mo113094c(imageRequest, Boolean.FALSE);
            if (by3VarMo113094c != null) {
                imageRequest.m8639w().toString();
                this.f72189a.m181729r(imageRequest);
                this.f72189a.m181719g(Uri.parse(by3VarMo113094c.getAnimationUriString()));
            }
        }
    }

    /* JADX INFO: renamed from: U0 */
    public ImageRequest m127131U0(SimpleDraweeView simpleDraweeView, String str, boolean z, boolean z2, q3d0 q3d0Var, fn2 fn2Var, y20<ImageRequestBuilder> y20Var) {
        return m127134W0(simpleDraweeView, str, z, z2, q3d0Var, fn2Var, y20Var, 0, 0);
    }

    /* JADX INFO: renamed from: V */
    public void m127132V() {
        mpy<by3, db5> mpyVarM181725n = this.f72189a.m181725n();
        if (NullChecker.m82486a(mpyVarM181725n)) {
            mpyVarM181725n.mo137758d(new up80() { // from class: l.asb0
                @Override // p153l.up80
                public final boolean apply(Object obj) {
                    return ((by3) obj).toString().startsWith("FrameKey");
                }
            });
        }
    }

    /* JADX INFO: renamed from: V0 */
    public ImageRequest m127133V0(SimpleDraweeView simpleDraweeView, Picture.ImageUri imageUri, boolean z, boolean z2, q3d0 q3d0Var, fn2 fn2Var, y20<ImageRequestBuilder> y20Var, int i, int i2) {
        ImageRequestBuilder imageRequestBuilderM8648B = m127136X0(imageUri).m8648B(z ? ImageRequest.CacheChoice.SMALL : ImageRequest.CacheChoice.DEFAULT);
        if (q3d0Var != null) {
            imageRequestBuilderM8648B.m8661O(q3d0Var);
        } else if (i != 0 || i2 != 0) {
            imageRequestBuilderM8648B.m8661O(new q3d0(i, i2));
        }
        if (y20Var != null) {
            y20Var.call(imageRequestBuilderM8648B);
        }
        ImageRequest imageRequestM8668a = imageRequestBuilderM8648B.m8668a();
        simpleDraweeView.setController(m127135X(simpleDraweeView, imageRequestM8668a, z2, tkm.m191580a("remote2", imageUri.formatted(), simpleDraweeView, fn2Var)));
        return imageRequestM8668a;
    }

    /* JADX INFO: renamed from: W0 */
    public ImageRequest m127134W0(SimpleDraweeView simpleDraweeView, String str, boolean z, boolean z2, q3d0 q3d0Var, fn2 fn2Var, y20<ImageRequestBuilder> y20Var, int i, int i2) {
        ImageRequestBuilder imageRequestBuilderM8648B = m98797n(str).m8648B(z ? ImageRequest.CacheChoice.SMALL : ImageRequest.CacheChoice.DEFAULT);
        if (q3d0Var != null) {
            imageRequestBuilderM8648B.m8661O(q3d0Var);
        } else if (i != 0 || i2 != 0) {
            imageRequestBuilderM8648B.m8661O(new q3d0(i, i2));
        } else if (simpleDraweeView.getWidth() != 0 && simpleDraweeView.getHeight() != 0) {
            imageRequestBuilderM8648B.m8661O(new q3d0(simpleDraweeView.getWidth(), simpleDraweeView.getHeight()));
        }
        if (y20Var != null) {
            y20Var.call(imageRequestBuilderM8648B);
        }
        ImageRequest imageRequestM8668a = imageRequestBuilderM8648B.m8668a();
        simpleDraweeView.setController(m127135X(simpleDraweeView, imageRequestM8668a, z2, tkm.m191580a("remote", str, simpleDraweeView, fn2Var)));
        return imageRequestM8668a;
    }

    /* JADX INFO: renamed from: X */
    public AbstractC16203c7 m127135X(SimpleDraweeView simpleDraweeView, ImageRequest imageRequest, boolean z, fn2 fn2Var) {
        return m98792h(simpleDraweeView, z).m8258B(new am2.C15744b(fn2Var)).m8259C(imageRequest).build();
    }

    /* JADX INFO: renamed from: X0 */
    public ImageRequestBuilder m127136X0(Picture.ImageUri imageUri) {
        if (imageUri.isLocal) {
            return m127151n0(imageUri, imageUri.base);
        }
        String str = this.f100581f.get(Media.URL_TO_CACHEKEY(imageUri.base));
        return str == null ? m98797n(imageUri.formatted()) : m127151n0(imageUri, str);
    }

    /* JADX INFO: renamed from: Y */
    public File m127137Y(ImageRequest imageRequest) {
        dy2 dy2VarMo8175c;
        by3 by3VarMo113093b = this.f72189a.getCacheKeyFactory().mo113093b(imageRequest, Boolean.FALSE);
        File fileM8638v = imageRequest.m8638v();
        iii iiiVarMo128869e = vjm.m201527m().m201536g().get().mo128869e();
        iii iiiVarMo128865a = vjm.m201527m().m201536g().get().mo128865a();
        if (!iiiVarMo128869e.mo8174b(by3VarMo113093b) || iiiVarMo128869e.mo8175c(by3VarMo113093b) == null) {
            dy2VarMo8175c = (!iiiVarMo128865a.mo8174b(by3VarMo113093b) || iiiVarMo128865a.mo8175c(by3VarMo113093b) == null) ? null : iiiVarMo128865a.mo8175c(by3VarMo113093b);
        } else {
            dy2VarMo8175c = iiiVarMo128869e.mo8175c(by3VarMo113093b);
        }
        return dy2VarMo8175c != null ? ((hii) dy2VarMo8175c).getFile() : fileM8638v;
    }

    /* JADX INFO: renamed from: Y0 */
    public void m127138Y0(SimpleDraweeView simpleDraweeView, int i) {
        simpleDraweeView.setController(m98792h(simpleDraweeView, true).m8259C(m98797n(new Uri.Builder().scheme(ShareConstants.RES_PATH).path(String.valueOf(i)).build().toString()).m8668a()).build());
    }

    /* JADX INFO: renamed from: Z */
    public File m127139Z(Picture.ImageUri imageUri) {
        return m127137Y(m127136X0(imageUri).m8668a());
    }

    /* JADX INFO: renamed from: Z0 */
    public void m127140Z0(SimpleDraweeView simpleDraweeView, String str) {
        simpleDraweeView.setController(m98791g(simpleDraweeView).m8259C(m98797n(str).m8668a()).build());
    }

    /* JADX INFO: renamed from: c0 */
    public final boolean m127141c0(Picture.ImageUri imageUri) {
        boolean zIsEmpty = TextUtils.isEmpty(imageUri.base);
        Dimension dimension = imageUri.orignalDimen;
        if (!zIsEmpty) {
            return (dimension == null || dimension.width == 0 || dimension.height == 0) ? false : true;
        }
        if (dimension.width != 0) {
            return true;
        }
        CrashHelper.m82479c(new IllegalArgumentException("local image must have valid local url"));
        return true;
    }

    @Override // p153l.am2
    /* JADX INFO: renamed from: e */
    public ug50 mo98789e(rg50 rg50Var) {
        ug50 ug50Var = new ug50(rg50Var);
        ug50Var.m195896o(new C17057c());
        return ug50Var;
    }

    /* JADX INFO: renamed from: e0 */
    public final /* synthetic */ void m127142e0(String str, gcg0 gcg0Var) {
        Objects.requireNonNull(gcg0Var);
        m127108I(str, new vrb0(gcg0Var));
    }

    /* JADX INFO: renamed from: f0 */
    public final /* synthetic */ void m127143f0(SubsamplingScaleImageView subsamplingScaleImageView, PhotoDraweeView photoDraweeView, File file) {
        subsamplingScaleImageView.setOnImageEventListener(new C17059e(photoDraweeView, subsamplingScaleImageView));
        String absolutePath = file.getAbsolutePath();
        try {
            if (bnl0.m105592y0() < 720 && file.length() > 204800) {
                sim simVar = new sim(oki.m168038z(file.getAbsolutePath()), sim.f168838n, 0, Bitmap.CompressFormat.JPEG, true);
                absolutePath = oki.m168011B(simVar.m186025d());
                photoDraweeView.setOriginalWidth(simVar.f168843d[0]);
                photoDraweeView.setOriginalHeight(simVar.f168843d[1]);
            }
        } catch (IOException e) {
            CrashHelper.m82479c(e);
        }
        subsamplingScaleImageView.setImage(qkm.m176955m(absolutePath));
        subsamplingScaleImageView.setVisibility(0);
        subsamplingScaleImageView.setAlpha(0.0f);
    }

    /* JADX INFO: renamed from: g0 */
    public final /* synthetic */ void m127144g0(DraweeView draweeView, final SubsamplingScaleImageView subsamplingScaleImageView, Picture.ImageUri imageUri, String str, qim qimVar, Animatable animatable) {
        final File fileM127139Z;
        if (draweeView instanceof PhotoDraweeView) {
            final PhotoDraweeView photoDraweeView = (PhotoDraweeView) draweeView;
            photoDraweeView.m224647w(qimVar.getWidth(), qimVar.getHeight());
            if (photoDraweeView.getOriginalHeight() > photoDraweeView.getOriginalWidth() && photoDraweeView.getOriginalHeight() / photoDraweeView.getOriginalWidth() > bnl0.m105588w0() / bnl0.m105592y0()) {
                float fM105592y0 = bnl0.m105592y0() / ((photoDraweeView.getOriginalWidth() * bnl0.m105588w0()) / photoDraweeView.getOriginalHeight());
                if (fM105592y0 > photoDraweeView.getMaximumScale()) {
                    photoDraweeView.setMaximumScale(fM105592y0);
                }
                if (fM105592y0 > 1.1f) {
                    photoDraweeView.setDoubleTapScale(fM105592y0);
                }
                if (fM105592y0 > photoDraweeView.getMaximumScale()) {
                    fM105592y0 = photoDraweeView.getMaximumScale();
                }
                photoDraweeView.m224646v(fM105592y0, 0.0f, 0.0f, true);
            }
            if (!m127083d0(photoDraweeView) || subsamplingScaleImageView == null || (fileM127139Z = m127139Z(imageUri)) == null) {
                return;
            }
            l51.m152887G(new Runnable() { // from class: l.urb0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f180595a.m127143f0(subsamplingScaleImageView, photoDraweeView, fileM127139Z);
                }
            });
        }
    }

    /* JADX INFO: renamed from: h0 */
    public final void m127145h0(VDraweeView vDraweeView, Picture.ImageUri imageUri, InputStream inputStream, int i, int i2) {
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
            vDraweeView.getHierarchy().mo118280f(new BitmapDrawable(vDraweeView.getResources(), bitmapRegionDecoderNewInstance.decodeRegion(rect, null)), 1.0f, true);
        } catch (Exception unused) {
            m127115L0(vDraweeView, imageUri.formatted());
        } finally {
            ua5.m195158b(inputStream);
        }
    }

    /* JADX INFO: renamed from: i0 */
    public void m127146i0(SimpleDraweeView simpleDraweeView, String str) {
        int i = sim.f168838n;
        m127147j0(simpleDraweeView, str, new q3d0(i, i), null);
    }

    /* JADX INFO: renamed from: j0 */
    public void m127147j0(final SimpleDraweeView simpleDraweeView, String str, q3d0 q3d0Var, Bitmap.Config config) {
        ImageRequestBuilder imageRequestBuilderM98797n = m98797n(str);
        if (q3d0Var != null) {
            imageRequestBuilderM98797n.m8661O(q3d0Var);
        }
        if (config != null) {
            imageRequestBuilderM98797n.m8653G(phm.m172329b().m176610p(config).m176595a());
        }
        imageRequestBuilderM98797n.m8663Q(qmd0.m177099e());
        simpleDraweeView.setController(m98791g(simpleDraweeView).m8259C(imageRequestBuilderM98797n.m8668a()).m8258B(new am2.C15744b(fn2.m126351i(null, new a30() { // from class: l.wrb0
            @Override // p153l.a30
            /* JADX INFO: renamed from: a */
            public final void mo37058a(Object obj, Object obj2, Object obj3) {
                fsb0.m127091w(simpleDraweeView, (String) obj, (qim) obj2, (Animatable) obj3);
            }
        }))).build());
    }

    /* JADX INFO: renamed from: k0 */
    public void m127148k0(SimpleDraweeView simpleDraweeView, String str) {
        m127149l0(simpleDraweeView, str, null);
    }

    /* JADX INFO: renamed from: l0 */
    public void m127149l0(final SimpleDraweeView simpleDraweeView, String str, fn2 fn2Var) {
        ImageRequestBuilder imageRequestBuilderM8658L = m98797n(str).m8658L(true);
        int i = sim.f168838n;
        ImageRequest imageRequestM8668a = imageRequestBuilderM8658L.m8661O(new q3d0(i, i)).m8668a();
        int iM105592y0 = bnl0.m105592y0() / 4;
        simpleDraweeView.setController(m98791g(simpleDraweeView).m8260D(m98797n(str).m8661O(new q3d0(iM105592y0, iM105592y0)).m8689z(true).m8668a()).m8259C(imageRequestM8668a).m8258B(new am2.C15744b(fn2.m126351i(fn2Var, new a30() { // from class: l.dsb0
            @Override // p153l.a30
            /* JADX INFO: renamed from: a */
            public final void mo37058a(Object obj, Object obj2, Object obj3) {
                fsb0.m127085q(simpleDraweeView, (String) obj, (qim) obj2, (Animatable) obj3);
            }
        }))).build());
    }

    /* JADX INFO: renamed from: m0 */
    public void m127150m0(SimpleDraweeView simpleDraweeView, String str) {
        int iM105592y0 = bnl0.m105592y0() / 4;
        simpleDraweeView.setController(m98791g(simpleDraweeView).m8259C(m98797n(str).m8661O(new q3d0(iM105592y0, iM105592y0)).m8689z(true).m8668a()).build());
    }

    /* JADX INFO: renamed from: n0 */
    public final ImageRequestBuilder m127151n0(Picture.ImageUri imageUri, String str) {
        ImageRequestBuilder imageRequestBuilderM98797n = m98797n(str);
        int i = imageUri.formatType;
        if (i == 1) {
            if (!m127141c0(imageUri)) {
                imageUri = new Picture.ImageUri(imageUri.base, new Dimension(new sim(oki.m168038z(imageUri.base)).f168843d), imageUri.fileType, imageUri.formatType, imageUri.formatWidth, imageUri.isLocal);
            }
            if (imageUri.orignalDimen.width > 0) {
                int i2 = imageUri.formatWidth;
                Dimension dimension = imageUri.orignalDimen;
                return imageRequestBuilderM98797n.m8661O(new q3d0(i2, (dimension.height * i2) / dimension.width));
            }
        } else if (i == 2) {
            int i3 = imageUri.formatWidth;
            return imageRequestBuilderM98797n.m8661O(new q3d0(i3, i3));
        }
        return imageRequestBuilderM98797n;
    }

    /* JADX INFO: renamed from: p0 */
    public i6c<Void> m127152p0(Picture.ImageUri imageUri) {
        return m127153q0(imageUri, Priority.MEDIUM, null, null);
    }

    /* JADX INFO: renamed from: q0 */
    public i6c<Void> m127153q0(Picture.ImageUri imageUri, Priority priority, String str, j2d0 j2d0Var) {
        if (!TextUtils.isEmpty(str) && imageUri != null) {
            TrackMediaUploadUtil.m81475X(imageUri.formatted(), str);
        }
        return this.f72189a.m181734w(m127136X0(imageUri).m8660N(priority).m8659M(j2d0Var).m8668a(), null);
    }

    /* JADX INFO: renamed from: r0 */
    public void m127154r0(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.f72189a.m181734w(m98797n(str).m8660N(Priority.MEDIUM).m8668a(), null);
    }

    /* JADX INFO: renamed from: s0 */
    public i6c<Void> m127155s0(Picture.ImageUri imageUri, Priority priority, String str, j2d0 j2d0Var) {
        if (!TextUtils.isEmpty(str) && imageUri != null) {
            TrackMediaUploadUtil.m81475X(imageUri.formatted(), str);
        }
        return this.f72189a.m181732u(m127136X0(imageUri).m8660N(priority).m8659M(j2d0Var).m8668a(), null);
    }

    /* JADX INFO: renamed from: t0 */
    public i6c<Void> m127156t0(Picture.ImageUri imageUri, Priority priority, String str, j2d0 j2d0Var, boolean z) {
        if (z) {
            imageUri.formatType = 3;
        }
        if (!TextUtils.isEmpty(str) && imageUri != null) {
            TrackMediaUploadUtil.m81475X(imageUri.formatted(), str);
        }
        return this.f72189a.m181732u(m127136X0(imageUri).m8660N(priority).m8659M(j2d0Var).m8668a(), null);
    }

    /* JADX INFO: renamed from: u0 */
    public void m127157u0(Picture.ImageUri imageUri) {
        m127158v0(imageUri, Priority.MEDIUM);
    }

    /* JADX INFO: renamed from: v0 */
    public void m127158v0(Picture.ImageUri imageUri, Priority priority) {
        m127159w0(imageUri, priority, "");
    }

    /* JADX INFO: renamed from: w0 */
    public void m127159w0(Picture.ImageUri imageUri, Priority priority, String str) {
        m127155s0(imageUri, priority, str, null);
    }

    /* JADX INFO: renamed from: x0 */
    public void m127160x0(String str) {
        m127161y0(str, Priority.MEDIUM);
    }

    /* JADX INFO: renamed from: y0 */
    public void m127161y0(String str, Priority priority) {
        this.f72189a.m181732u(m98797n(str).m8660N(priority).m8668a(), null);
    }

    /* JADX INFO: renamed from: z0 */
    public void m127162z0(Picture.ImageUri imageUri) {
        if (kl40.m150351i()) {
            m127152p0(imageUri);
        } else {
            m127157u0(imageUri);
        }
    }

    /* JADX INFO: renamed from: l.fsb0$b */
    public class C17056b implements X509TrustManager {
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
