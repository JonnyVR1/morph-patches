package com.facebook.imagepipeline.request;

import android.net.Uri;
import android.os.Build;
import com.facebook.imagepipeline.common.Priority;
import com.facebook.imagepipeline.core.DownsampleMode;
import java.io.File;
import p149l.awk;
import p149l.cx3;
import p149l.fti;
import p149l.fvj0;
import p149l.guc0;
import p149l.nvc0;
import p149l.oed0;
import p149l.rf80;
import p149l.ryx;
import p149l.t050;
import p149l.wq3;
import p149l.yd80;
import p149l.zem;

/* JADX INFO: loaded from: classes.dex */
public class ImageRequest {

    /* JADX INFO: renamed from: A */
    public static final fti<ImageRequest, Uri> f6546A = new C1631a();

    /* JADX INFO: renamed from: y */
    public static boolean f6547y;

    /* JADX INFO: renamed from: z */
    public static boolean f6548z;

    /* JADX INFO: renamed from: a */
    public int f6549a;

    /* JADX INFO: renamed from: b */
    public final CacheChoice f6550b;

    /* JADX INFO: renamed from: c */
    public final Uri f6551c;

    /* JADX INFO: renamed from: d */
    public final int f6552d;

    /* JADX INFO: renamed from: e */
    public File f6553e;

    /* JADX INFO: renamed from: f */
    public final boolean f6554f;

    /* JADX INFO: renamed from: g */
    public final boolean f6555g;

    /* JADX INFO: renamed from: h */
    public final boolean f6556h;

    /* JADX INFO: renamed from: i */
    public final zem f6557i;

    /* JADX INFO: renamed from: j */
    public final nvc0 f6558j;

    /* JADX INFO: renamed from: k */
    public final oed0 f6559k;

    /* JADX INFO: renamed from: l */
    public final wq3 f6560l;

    /* JADX INFO: renamed from: m */
    public final Priority f6561m;

    /* JADX INFO: renamed from: n */
    public final RequestLevel f6562n;

    /* JADX INFO: renamed from: o */
    public int f6563o;

    /* JADX INFO: renamed from: p */
    public final boolean f6564p;

    /* JADX INFO: renamed from: q */
    public final boolean f6565q;

    /* JADX INFO: renamed from: r */
    public final Boolean f6566r;

    /* JADX INFO: renamed from: s */
    public final yd80 f6567s;

    /* JADX INFO: renamed from: t */
    public final guc0 f6568t;

    /* JADX INFO: renamed from: u */
    public final Boolean f6569u;

    /* JADX INFO: renamed from: v */
    public final DownsampleMode f6570v;

    /* JADX INFO: renamed from: w */
    public final String f6571w;

    /* JADX INFO: renamed from: x */
    public final int f6572x;

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
    public class C1631a implements fti<ImageRequest, Uri> {
        @Override // p149l.fti
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Uri apply(ImageRequest imageRequest) {
            if (imageRequest != null) {
                return imageRequest.m8585w();
            }
            return null;
        }
    }

    public ImageRequest(ImageRequestBuilder imageRequestBuilder) {
        this.f6550b = imageRequestBuilder.m8616d();
        Uri uriM8630r = imageRequestBuilder.m8630r();
        this.f6551c = uriM8630r;
        this.f6552d = m8563y(uriM8630r);
        this.f6554f = imageRequestBuilder.m8634w();
        this.f6555g = imageRequestBuilder.m8632u();
        this.f6556h = imageRequestBuilder.m8622j();
        this.f6557i = imageRequestBuilder.m8621i();
        this.f6558j = imageRequestBuilder.m8627o();
        this.f6559k = imageRequestBuilder.m8629q() == null ? oed0.m163940d() : imageRequestBuilder.m8629q();
        this.f6560l = imageRequestBuilder.m8615c();
        this.f6561m = imageRequestBuilder.m8626n();
        this.f6562n = imageRequestBuilder.m8623k();
        boolean zM8631t = imageRequestBuilder.m8631t();
        this.f6564p = zM8631t;
        int iM8617e = imageRequestBuilder.m8617e();
        this.f6563o = zM8631t ? iM8617e : iM8617e | 48;
        this.f6565q = imageRequestBuilder.m8633v();
        this.f6566r = imageRequestBuilder.m8612T();
        this.f6567s = imageRequestBuilder.m8624l();
        this.f6568t = imageRequestBuilder.m8625m();
        this.f6569u = imageRequestBuilder.m8628p();
        this.f6570v = imageRequestBuilder.m8620h();
        this.f6572x = imageRequestBuilder.m8618f();
        this.f6571w = imageRequestBuilder.m8619g();
    }

    /* JADX INFO: renamed from: a */
    public static ImageRequest m8561a(Uri uri) {
        if (uri == null) {
            return null;
        }
        return ImageRequestBuilder.m8592y(uri).m8614a();
    }

    /* JADX INFO: renamed from: b */
    public static ImageRequest m8562b(String str) {
        if (str == null || str.length() == 0) {
            return null;
        }
        return m8561a(Uri.parse(str));
    }

    /* JADX INFO: renamed from: y */
    public static int m8563y(Uri uri) {
        if (uri == null) {
            return -1;
        }
        if (fvj0.m123320o(uri)) {
            return 0;
        }
        if (uri.getPath() != null && fvj0.m123318m(uri)) {
            return ryx.m181716c(ryx.m181715b(uri.getPath())) ? 2 : 3;
        }
        if (fvj0.m123317l(uri)) {
            return 4;
        }
        if (fvj0.m123314i(uri)) {
            return 5;
        }
        if (fvj0.m123319n(uri)) {
            return 6;
        }
        if (fvj0.m123313h(uri)) {
            return 7;
        }
        return fvj0.m123321p(uri) ? 8 : -1;
    }

    /* JADX INFO: renamed from: A */
    public Boolean m8564A() {
        return this.f6566r;
    }

    /* JADX INFO: renamed from: c */
    public wq3 m8565c() {
        return this.f6560l;
    }

    /* JADX INFO: renamed from: d */
    public CacheChoice m8566d() {
        return this.f6550b;
    }

    /* JADX INFO: renamed from: e */
    public int m8567e() {
        return this.f6563o;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof ImageRequest)) {
            return false;
        }
        ImageRequest imageRequest = (ImageRequest) obj;
        if (f6547y) {
            int i = this.f6549a;
            int i2 = imageRequest.f6549a;
            if (i != 0 && i2 != 0 && i != i2) {
                return false;
            }
        }
        if (this.f6555g == imageRequest.f6555g && this.f6564p == imageRequest.f6564p && this.f6565q == imageRequest.f6565q && t050.m186814a(this.f6551c, imageRequest.f6551c) && t050.m186814a(this.f6550b, imageRequest.f6550b) && t050.m186814a(this.f6571w, imageRequest.f6571w) && t050.m186814a(this.f6553e, imageRequest.f6553e) && t050.m186814a(this.f6560l, imageRequest.f6560l) && t050.m186814a(this.f6557i, imageRequest.f6557i) && t050.m186814a(this.f6558j, imageRequest.f6558j) && t050.m186814a(this.f6561m, imageRequest.f6561m) && t050.m186814a(this.f6562n, imageRequest.f6562n) && t050.m186814a(Integer.valueOf(this.f6563o), Integer.valueOf(imageRequest.f6563o)) && t050.m186814a(this.f6566r, imageRequest.f6566r) && t050.m186814a(this.f6569u, imageRequest.f6569u) && t050.m186814a(this.f6570v, imageRequest.f6570v) && t050.m186814a(this.f6559k, imageRequest.f6559k) && this.f6556h == imageRequest.f6556h) {
            yd80 yd80Var = this.f6567s;
            cx3 cx3VarMo102087a = yd80Var != null ? yd80Var.mo102087a() : null;
            yd80 yd80Var2 = imageRequest.f6567s;
            if (t050.m186814a(cx3VarMo102087a, yd80Var2 != null ? yd80Var2.mo102087a() : null) && this.f6572x == imageRequest.f6572x) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: f */
    public int m8568f() {
        return this.f6572x;
    }

    /* JADX INFO: renamed from: g */
    public String m8569g() {
        return this.f6571w;
    }

    /* JADX INFO: renamed from: h */
    public DownsampleMode m8570h() {
        return this.f6570v;
    }

    public int hashCode() {
        boolean z = f6548z;
        int i = z ? this.f6549a : 0;
        if (i != 0) {
            return i;
        }
        yd80 yd80Var = this.f6567s;
        int iM99292a = awk.m99292a(awk.m99292a(awk.m99292a(awk.m99292a(awk.m99292a(awk.m99292a(awk.m99292a(awk.m99292a(awk.m99292a(awk.m99292a(awk.m99292a(awk.m99292a(awk.m99292a(awk.m99292a(awk.m99292a(awk.m99292a(awk.m99292a(awk.m99292a(0, this.f6550b), this.f6551c), Boolean.valueOf(this.f6555g)), this.f6560l), this.f6561m), this.f6562n), Integer.valueOf(this.f6563o)), Boolean.valueOf(this.f6564p)), Boolean.valueOf(this.f6565q)), this.f6557i), this.f6566r), this.f6558j), this.f6559k), yd80Var != null ? yd80Var.mo102087a() : null), this.f6569u), this.f6570v), Integer.valueOf(this.f6572x)), Boolean.valueOf(this.f6556h));
        if (z) {
            this.f6549a = iM99292a;
        }
        return iM99292a;
    }

    /* JADX INFO: renamed from: i */
    public zem m8571i() {
        return this.f6557i;
    }

    /* JADX INFO: renamed from: j */
    public boolean m8572j() {
        return Build.VERSION.SDK_INT >= 29 && this.f6556h;
    }

    /* JADX INFO: renamed from: k */
    public boolean m8573k() {
        return this.f6555g;
    }

    /* JADX INFO: renamed from: l */
    public RequestLevel m8574l() {
        return this.f6562n;
    }

    /* JADX INFO: renamed from: m */
    public yd80 m8575m() {
        return this.f6567s;
    }

    /* JADX INFO: renamed from: n */
    public int m8576n() {
        nvc0 nvc0Var = this.f6558j;
        if (nvc0Var != null) {
            return nvc0Var.height;
        }
        return 2048;
    }

    /* JADX INFO: renamed from: o */
    public int m8577o() {
        nvc0 nvc0Var = this.f6558j;
        if (nvc0Var != null) {
            return nvc0Var.width;
        }
        return 2048;
    }

    /* JADX INFO: renamed from: p */
    public Priority m8578p() {
        return this.f6561m;
    }

    /* JADX INFO: renamed from: q */
    public boolean m8579q() {
        return this.f6554f;
    }

    /* JADX INFO: renamed from: r */
    public guc0 m8580r() {
        return this.f6568t;
    }

    /* JADX INFO: renamed from: s */
    public nvc0 m8581s() {
        return this.f6558j;
    }

    /* JADX INFO: renamed from: t */
    public Boolean m8582t() {
        return this.f6569u;
    }

    public String toString() {
        return t050.m186815b(this).m186817b("uri", this.f6551c).m186817b("cacheChoice", this.f6550b).m186817b("decodeOptions", this.f6557i).m186817b("postprocessor", this.f6567s).m186817b("priority", this.f6561m).m186817b("resizeOptions", this.f6558j).m186817b("rotationOptions", this.f6559k).m186817b("bytesRange", this.f6560l).m186817b("resizingAllowedOverride", this.f6569u).m186817b("downsampleOverride", this.f6570v).m186818c("progressiveRenderingEnabled", this.f6554f).m186818c("localThumbnailPreviewsEnabled", this.f6555g).m186818c("loadThumbnailOnly", this.f6556h).m186817b("lowestPermittedRequestLevel", this.f6562n).m186816a("cachesDisabled", this.f6563o).m186818c("isDiskCacheEnabled", this.f6564p).m186818c("isMemoryCacheEnabled", this.f6565q).m186817b("decodePrefetches", this.f6566r).m186816a("delayMs", this.f6572x).toString();
    }

    /* JADX INFO: renamed from: u */
    public oed0 m8583u() {
        return this.f6559k;
    }

    /* JADX INFO: renamed from: v */
    public synchronized File m8584v() {
        try {
            if (this.f6553e == null) {
                rf80.m179116g(this.f6551c.getPath());
                this.f6553e = new File(this.f6551c.getPath());
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f6553e;
    }

    /* JADX INFO: renamed from: w */
    public Uri m8585w() {
        return this.f6551c;
    }

    /* JADX INFO: renamed from: x */
    public int m8586x() {
        return this.f6552d;
    }

    /* JADX INFO: renamed from: z */
    public boolean m8587z(int i) {
        return (m8567e() & i) == 0;
    }
}
