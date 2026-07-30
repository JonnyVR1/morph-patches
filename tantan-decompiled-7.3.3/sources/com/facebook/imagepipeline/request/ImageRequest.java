package com.facebook.imagepipeline.request;

import android.net.Uri;
import android.os.Build;
import com.facebook.imagepipeline.common.Priority;
import com.facebook.imagepipeline.core.DownsampleMode;
import java.io.File;
import p153l.bwi;
import p153l.by3;
import p153l.fm80;
import p153l.i4k0;
import p153l.i950;
import p153l.j2d0;
import p153l.o7y;
import p153l.phm;
import p153l.q3d0;
import p153l.qmd0;
import p153l.qyk;
import p153l.vr3;
import p153l.wn80;

/* JADX INFO: loaded from: classes.dex */
public class ImageRequest {

    /* JADX INFO: renamed from: A */
    public static final bwi<ImageRequest, Uri> f6583A = new C1654a();

    /* JADX INFO: renamed from: y */
    public static boolean f6584y;

    /* JADX INFO: renamed from: z */
    public static boolean f6585z;

    /* JADX INFO: renamed from: a */
    public int f6586a;

    /* JADX INFO: renamed from: b */
    public final CacheChoice f6587b;

    /* JADX INFO: renamed from: c */
    public final Uri f6588c;

    /* JADX INFO: renamed from: d */
    public final int f6589d;

    /* JADX INFO: renamed from: e */
    public File f6590e;

    /* JADX INFO: renamed from: f */
    public final boolean f6591f;

    /* JADX INFO: renamed from: g */
    public final boolean f6592g;

    /* JADX INFO: renamed from: h */
    public final boolean f6593h;

    /* JADX INFO: renamed from: i */
    public final phm f6594i;

    /* JADX INFO: renamed from: j */
    public final q3d0 f6595j;

    /* JADX INFO: renamed from: k */
    public final qmd0 f6596k;

    /* JADX INFO: renamed from: l */
    public final vr3 f6597l;

    /* JADX INFO: renamed from: m */
    public final Priority f6598m;

    /* JADX INFO: renamed from: n */
    public final RequestLevel f6599n;

    /* JADX INFO: renamed from: o */
    public int f6600o;

    /* JADX INFO: renamed from: p */
    public final boolean f6601p;

    /* JADX INFO: renamed from: q */
    public final boolean f6602q;

    /* JADX INFO: renamed from: r */
    public final Boolean f6603r;

    /* JADX INFO: renamed from: s */
    public final fm80 f6604s;

    /* JADX INFO: renamed from: t */
    public final j2d0 f6605t;

    /* JADX INFO: renamed from: u */
    public final Boolean f6606u;

    /* JADX INFO: renamed from: v */
    public final DownsampleMode f6607v;

    /* JADX INFO: renamed from: w */
    public final String f6608w;

    /* JADX INFO: renamed from: x */
    public final int f6609x;

    public enum CacheChoice {
        SMALL,
        DEFAULT,
        DYNAMIC
    }

    public enum RequestLevel {
        FULL_FETCH(1),
        DISK_CACHE(2),
        ENCODED_MEMORY_CACHE(3),
        BITMAP_MEMORY_CACHE(4);

        private int mValue;

        RequestLevel(int i) {
            this.mValue = i;
        }

        public static RequestLevel getMax(RequestLevel requestLevel, RequestLevel requestLevel2) {
            return requestLevel.getValue() > requestLevel2.getValue() ? requestLevel : requestLevel2;
        }

        public int getValue() {
            return this.mValue;
        }
    }

    /* JADX INFO: renamed from: com.facebook.imagepipeline.request.ImageRequest$a */
    public class C1654a implements bwi<ImageRequest, Uri> {
        @Override // p153l.bwi
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Uri apply(ImageRequest imageRequest) {
            if (imageRequest != null) {
                return imageRequest.m8639w();
            }
            return null;
        }
    }

    public ImageRequest(ImageRequestBuilder imageRequestBuilder) {
        this.f6587b = imageRequestBuilder.m8670d();
        Uri uriM8684r = imageRequestBuilder.m8684r();
        this.f6588c = uriM8684r;
        this.f6589d = m8617y(uriM8684r);
        this.f6591f = imageRequestBuilder.m8688w();
        this.f6592g = imageRequestBuilder.m8686u();
        this.f6593h = imageRequestBuilder.m8676j();
        this.f6594i = imageRequestBuilder.m8675i();
        this.f6595j = imageRequestBuilder.m8681o();
        this.f6596k = imageRequestBuilder.m8683q() == null ? qmd0.m177098d() : imageRequestBuilder.m8683q();
        this.f6597l = imageRequestBuilder.m8669c();
        this.f6598m = imageRequestBuilder.m8680n();
        this.f6599n = imageRequestBuilder.m8677k();
        boolean zM8685t = imageRequestBuilder.m8685t();
        this.f6601p = zM8685t;
        int iM8671e = imageRequestBuilder.m8671e();
        this.f6600o = zM8685t ? iM8671e : iM8671e | 48;
        this.f6602q = imageRequestBuilder.m8687v();
        this.f6603r = imageRequestBuilder.m8666T();
        this.f6604s = imageRequestBuilder.m8678l();
        this.f6605t = imageRequestBuilder.m8679m();
        this.f6606u = imageRequestBuilder.m8682p();
        this.f6607v = imageRequestBuilder.m8674h();
        this.f6609x = imageRequestBuilder.m8672f();
        this.f6608w = imageRequestBuilder.m8673g();
    }

    /* JADX INFO: renamed from: a */
    public static ImageRequest m8615a(Uri uri) {
        if (uri == null) {
            return null;
        }
        return ImageRequestBuilder.m8646y(uri).m8668a();
    }

    /* JADX INFO: renamed from: b */
    public static ImageRequest m8616b(String str) {
        if (str == null || str.length() == 0) {
            return null;
        }
        return m8615a(Uri.parse(str));
    }

    /* JADX INFO: renamed from: y */
    public static int m8617y(Uri uri) {
        if (uri == null) {
            return -1;
        }
        if (i4k0.m138566o(uri)) {
            return 0;
        }
        if (uri.getPath() != null && i4k0.m138564m(uri)) {
            return o7y.m166388c(o7y.m166387b(uri.getPath())) ? 2 : 3;
        }
        if (i4k0.m138563l(uri)) {
            return 4;
        }
        if (i4k0.m138560i(uri)) {
            return 5;
        }
        if (i4k0.m138565n(uri)) {
            return 6;
        }
        if (i4k0.m138559h(uri)) {
            return 7;
        }
        return i4k0.m138567p(uri) ? 8 : -1;
    }

    /* JADX INFO: renamed from: A */
    public Boolean m8618A() {
        return this.f6603r;
    }

    /* JADX INFO: renamed from: c */
    public vr3 m8619c() {
        return this.f6597l;
    }

    /* JADX INFO: renamed from: d */
    public CacheChoice m8620d() {
        return this.f6587b;
    }

    /* JADX INFO: renamed from: e */
    public int m8621e() {
        return this.f6600o;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof ImageRequest)) {
            return false;
        }
        ImageRequest imageRequest = (ImageRequest) obj;
        if (f6584y) {
            int i = this.f6586a;
            int i2 = imageRequest.f6586a;
            if (i != 0 && i2 != 0 && i != i2) {
                return false;
            }
        }
        if (this.f6592g == imageRequest.f6592g && this.f6601p == imageRequest.f6601p && this.f6602q == imageRequest.f6602q && i950.m139074a(this.f6588c, imageRequest.f6588c) && i950.m139074a(this.f6587b, imageRequest.f6587b) && i950.m139074a(this.f6608w, imageRequest.f6608w) && i950.m139074a(this.f6590e, imageRequest.f6590e) && i950.m139074a(this.f6597l, imageRequest.f6597l) && i950.m139074a(this.f6594i, imageRequest.f6594i) && i950.m139074a(this.f6595j, imageRequest.f6595j) && i950.m139074a(this.f6598m, imageRequest.f6598m) && i950.m139074a(this.f6599n, imageRequest.f6599n) && i950.m139074a(Integer.valueOf(this.f6600o), Integer.valueOf(imageRequest.f6600o)) && i950.m139074a(this.f6603r, imageRequest.f6603r) && i950.m139074a(this.f6606u, imageRequest.f6606u) && i950.m139074a(this.f6607v, imageRequest.f6607v) && i950.m139074a(this.f6596k, imageRequest.f6596k) && this.f6593h == imageRequest.f6593h) {
            fm80 fm80Var = this.f6604s;
            by3 by3VarMo104840a = fm80Var != null ? fm80Var.mo104840a() : null;
            fm80 fm80Var2 = imageRequest.f6604s;
            if (i950.m139074a(by3VarMo104840a, fm80Var2 != null ? fm80Var2.mo104840a() : null) && this.f6609x == imageRequest.f6609x) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: f */
    public int m8622f() {
        return this.f6609x;
    }

    /* JADX INFO: renamed from: g */
    public String m8623g() {
        return this.f6608w;
    }

    /* JADX INFO: renamed from: h */
    public DownsampleMode m8624h() {
        return this.f6607v;
    }

    public int hashCode() {
        boolean z = f6585z;
        int i = z ? this.f6586a : 0;
        if (i != 0) {
            return i;
        }
        fm80 fm80Var = this.f6604s;
        int iM178658a = qyk.m178658a(qyk.m178658a(qyk.m178658a(qyk.m178658a(qyk.m178658a(qyk.m178658a(qyk.m178658a(qyk.m178658a(qyk.m178658a(qyk.m178658a(qyk.m178658a(qyk.m178658a(qyk.m178658a(qyk.m178658a(qyk.m178658a(qyk.m178658a(qyk.m178658a(qyk.m178658a(0, this.f6587b), this.f6588c), Boolean.valueOf(this.f6592g)), this.f6597l), this.f6598m), this.f6599n), Integer.valueOf(this.f6600o)), Boolean.valueOf(this.f6601p)), Boolean.valueOf(this.f6602q)), this.f6594i), this.f6603r), this.f6595j), this.f6596k), fm80Var != null ? fm80Var.mo104840a() : null), this.f6606u), this.f6607v), Integer.valueOf(this.f6609x)), Boolean.valueOf(this.f6593h));
        if (z) {
            this.f6586a = iM178658a;
        }
        return iM178658a;
    }

    /* JADX INFO: renamed from: i */
    public phm m8625i() {
        return this.f6594i;
    }

    /* JADX INFO: renamed from: j */
    public boolean m8626j() {
        return Build.VERSION.SDK_INT >= 29 && this.f6593h;
    }

    /* JADX INFO: renamed from: k */
    public boolean m8627k() {
        return this.f6592g;
    }

    /* JADX INFO: renamed from: l */
    public RequestLevel m8628l() {
        return this.f6599n;
    }

    /* JADX INFO: renamed from: m */
    public fm80 m8629m() {
        return this.f6604s;
    }

    /* JADX INFO: renamed from: n */
    public int m8630n() {
        q3d0 q3d0Var = this.f6595j;
        if (q3d0Var != null) {
            return q3d0Var.height;
        }
        return 2048;
    }

    /* JADX INFO: renamed from: o */
    public int m8631o() {
        q3d0 q3d0Var = this.f6595j;
        if (q3d0Var != null) {
            return q3d0Var.width;
        }
        return 2048;
    }

    /* JADX INFO: renamed from: p */
    public Priority m8632p() {
        return this.f6598m;
    }

    /* JADX INFO: renamed from: q */
    public boolean m8633q() {
        return this.f6591f;
    }

    /* JADX INFO: renamed from: r */
    public j2d0 m8634r() {
        return this.f6605t;
    }

    /* JADX INFO: renamed from: s */
    public q3d0 m8635s() {
        return this.f6595j;
    }

    /* JADX INFO: renamed from: t */
    public Boolean m8636t() {
        return this.f6606u;
    }

    public String toString() {
        return i950.m139075b(this).m139077b("uri", this.f6588c).m139077b("cacheChoice", this.f6587b).m139077b("decodeOptions", this.f6594i).m139077b("postprocessor", this.f6604s).m139077b("priority", this.f6598m).m139077b("resizeOptions", this.f6595j).m139077b("rotationOptions", this.f6596k).m139077b("bytesRange", this.f6597l).m139077b("resizingAllowedOverride", this.f6606u).m139077b("downsampleOverride", this.f6607v).m139078c("progressiveRenderingEnabled", this.f6591f).m139078c("localThumbnailPreviewsEnabled", this.f6592g).m139078c("loadThumbnailOnly", this.f6593h).m139077b("lowestPermittedRequestLevel", this.f6599n).m139076a("cachesDisabled", this.f6600o).m139078c("isDiskCacheEnabled", this.f6601p).m139078c("isMemoryCacheEnabled", this.f6602q).m139077b("decodePrefetches", this.f6603r).m139076a("delayMs", this.f6609x).toString();
    }

    /* JADX INFO: renamed from: u */
    public qmd0 m8637u() {
        return this.f6596k;
    }

    /* JADX INFO: renamed from: v */
    public synchronized File m8638v() {
        try {
            if (this.f6590e == null) {
                wn80.m207182g(this.f6588c.getPath());
                this.f6590e = new File(this.f6588c.getPath());
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f6590e;
    }

    /* JADX INFO: renamed from: w */
    public Uri m8639w() {
        return this.f6588c;
    }

    /* JADX INFO: renamed from: x */
    public int m8640x() {
        return this.f6589d;
    }

    /* JADX INFO: renamed from: z */
    public boolean m8641z(int i) {
        return (m8621e() & i) == 0;
    }
}
