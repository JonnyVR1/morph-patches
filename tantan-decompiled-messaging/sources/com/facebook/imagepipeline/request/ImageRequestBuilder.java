package com.facebook.imagepipeline.request;

import android.net.Uri;
import com.facebook.imagepipeline.common.Priority;
import com.facebook.imagepipeline.core.DownsampleMode;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import p149l.fvj0;
import p149l.guc0;
import p149l.nvc0;
import p149l.oed0;
import p149l.phm;
import p149l.rf80;
import p149l.wq3;
import p149l.yd80;
import p149l.zem;

/* JADX INFO: loaded from: classes.dex */
public class ImageRequestBuilder {

    /* JADX INFO: renamed from: t */
    public static final Set<String> f6573t = new HashSet();

    /* JADX INFO: renamed from: n */
    public guc0 f6587n;

    /* JADX INFO: renamed from: r */
    public int f6591r;

    /* JADX INFO: renamed from: a */
    public Uri f6574a = null;

    /* JADX INFO: renamed from: b */
    public ImageRequest.RequestLevel f6575b = ImageRequest.RequestLevel.FULL_FETCH;

    /* JADX INFO: renamed from: c */
    public int f6576c = 0;

    /* JADX INFO: renamed from: d */
    public nvc0 f6577d = null;

    /* JADX INFO: renamed from: e */
    public oed0 f6578e = null;

    /* JADX INFO: renamed from: f */
    public zem f6579f = zem.m218355a();

    /* JADX INFO: renamed from: g */
    public ImageRequest.CacheChoice f6580g = ImageRequest.CacheChoice.DEFAULT;

    /* JADX INFO: renamed from: h */
    public boolean f6581h = phm.m168978J().getIsProgressiveRenderingEnabled();

    /* JADX INFO: renamed from: i */
    public boolean f6582i = false;

    /* JADX INFO: renamed from: j */
    public boolean f6583j = false;

    /* JADX INFO: renamed from: k */
    public Priority f6584k = Priority.HIGH;

    /* JADX INFO: renamed from: l */
    public yd80 f6585l = null;

    /* JADX INFO: renamed from: m */
    public Boolean f6586m = null;

    /* JADX INFO: renamed from: o */
    public wq3 f6588o = null;

    /* JADX INFO: renamed from: p */
    public Boolean f6589p = null;

    /* JADX INFO: renamed from: q */
    public DownsampleMode f6590q = null;

    /* JADX INFO: renamed from: s */
    public String f6592s = null;

    public static class BuilderException extends RuntimeException {
        public BuilderException(String str) {
            super("Invalid request builder: " + str);
        }
    }

    /* JADX INFO: renamed from: b */
    public static ImageRequestBuilder m8589b(ImageRequest imageRequest) {
        return m8592y(imageRequest.m8585w()).m8599G(imageRequest.m8571i()).m8593A(imageRequest.m8565c()).m8594B(imageRequest.m8566d()).m8601I(imageRequest.m8573k()).m8600H(imageRequest.m8572j()).m8602J(imageRequest.m8574l()).m8595C(imageRequest.m8567e()).m8603K(imageRequest.m8575m()).m8604L(imageRequest.m8579q()).m8606N(imageRequest.m8578p()).m8607O(imageRequest.m8581s()).m8605M(imageRequest.m8580r()).m8609Q(imageRequest.m8583u()).m8610R(imageRequest.m8564A()).m8596D(imageRequest.m8568f()).m8597E(imageRequest.m8569g()).m8598F(imageRequest.m8570h()).m8608P(imageRequest.m8582t());
    }

    /* JADX INFO: renamed from: s */
    public static boolean m8590s(Uri uri) {
        Set<String> set = f6573t;
        if (set != null && uri != null) {
            Iterator<String> it = set.iterator();
            while (it.hasNext()) {
                if (it.next().equals(uri.getScheme())) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: x */
    public static ImageRequestBuilder m8591x(int i) {
        return m8592y(fvj0.m123312g(i));
    }

    /* JADX INFO: renamed from: y */
    public static ImageRequestBuilder m8592y(Uri uri) {
        return new ImageRequestBuilder().m8611S(uri);
    }

    /* JADX INFO: renamed from: A */
    public ImageRequestBuilder m8593A(wq3 wq3Var) {
        this.f6588o = wq3Var;
        return this;
    }

    /* JADX INFO: renamed from: B */
    public ImageRequestBuilder m8594B(ImageRequest.CacheChoice cacheChoice) {
        this.f6580g = cacheChoice;
        return this;
    }

    /* JADX INFO: renamed from: C */
    public final ImageRequestBuilder m8595C(int i) {
        this.f6576c = i;
        if (this.f6580g != ImageRequest.CacheChoice.DYNAMIC) {
            this.f6592s = null;
        }
        return this;
    }

    /* JADX INFO: renamed from: D */
    public ImageRequestBuilder m8596D(int i) {
        this.f6591r = i;
        return this;
    }

    /* JADX INFO: renamed from: E */
    public ImageRequestBuilder m8597E(String str) {
        this.f6592s = str;
        return this;
    }

    /* JADX INFO: renamed from: F */
    public ImageRequestBuilder m8598F(DownsampleMode downsampleMode) {
        this.f6590q = downsampleMode;
        return this;
    }

    /* JADX INFO: renamed from: G */
    public ImageRequestBuilder m8599G(zem zemVar) {
        this.f6579f = zemVar;
        return this;
    }

    /* JADX INFO: renamed from: H */
    public ImageRequestBuilder m8600H(boolean z) {
        this.f6583j = z;
        return this;
    }

    /* JADX INFO: renamed from: I */
    public ImageRequestBuilder m8601I(boolean z) {
        this.f6582i = z;
        return this;
    }

    /* JADX INFO: renamed from: J */
    public ImageRequestBuilder m8602J(ImageRequest.RequestLevel requestLevel) {
        this.f6575b = requestLevel;
        return this;
    }

    /* JADX INFO: renamed from: K */
    public ImageRequestBuilder m8603K(yd80 yd80Var) {
        this.f6585l = yd80Var;
        return this;
    }

    /* JADX INFO: renamed from: L */
    public ImageRequestBuilder m8604L(boolean z) {
        this.f6581h = z;
        return this;
    }

    /* JADX INFO: renamed from: M */
    public ImageRequestBuilder m8605M(guc0 guc0Var) {
        this.f6587n = guc0Var;
        return this;
    }

    /* JADX INFO: renamed from: N */
    public ImageRequestBuilder m8606N(Priority priority) {
        this.f6584k = priority;
        return this;
    }

    /* JADX INFO: renamed from: O */
    public ImageRequestBuilder m8607O(nvc0 nvc0Var) {
        this.f6577d = nvc0Var;
        return this;
    }

    /* JADX INFO: renamed from: P */
    public ImageRequestBuilder m8608P(Boolean bool) {
        this.f6589p = bool;
        return this;
    }

    /* JADX INFO: renamed from: Q */
    public ImageRequestBuilder m8609Q(oed0 oed0Var) {
        this.f6578e = oed0Var;
        return this;
    }

    /* JADX INFO: renamed from: R */
    public ImageRequestBuilder m8610R(Boolean bool) {
        this.f6586m = bool;
        return this;
    }

    /* JADX INFO: renamed from: S */
    public ImageRequestBuilder m8611S(Uri uri) {
        rf80.m179116g(uri);
        this.f6574a = uri;
        return this;
    }

    /* JADX INFO: renamed from: T */
    public Boolean m8612T() {
        return this.f6586m;
    }

    /* JADX INFO: renamed from: U */
    public void m8613U() {
        Uri uri = this.f6574a;
        if (uri == null) {
            throw new BuilderException("Source must be set!");
        }
        if (fvj0.m123319n(uri)) {
            if (!this.f6574a.isAbsolute()) {
                throw new BuilderException("Resource URI path must be absolute.");
            }
            if (this.f6574a.getPath().isEmpty()) {
                throw new BuilderException("Resource URI must not be empty");
            }
            try {
                Integer.parseInt(this.f6574a.getPath().substring(1));
            } catch (NumberFormatException unused) {
                throw new BuilderException("Resource URI path must be a resource id.");
            }
        }
        if (fvj0.m123314i(this.f6574a) && !this.f6574a.isAbsolute()) {
            throw new BuilderException("Asset URI path must be absolute.");
        }
    }

    /* JADX INFO: renamed from: a */
    public ImageRequest m8614a() {
        m8613U();
        return new ImageRequest(this);
    }

    /* JADX INFO: renamed from: c */
    public wq3 m8615c() {
        return this.f6588o;
    }

    /* JADX INFO: renamed from: d */
    public ImageRequest.CacheChoice m8616d() {
        return this.f6580g;
    }

    /* JADX INFO: renamed from: e */
    public int m8617e() {
        return this.f6576c;
    }

    /* JADX INFO: renamed from: f */
    public int m8618f() {
        return this.f6591r;
    }

    /* JADX INFO: renamed from: g */
    public String m8619g() {
        return this.f6592s;
    }

    /* JADX INFO: renamed from: h */
    public DownsampleMode m8620h() {
        return this.f6590q;
    }

    /* JADX INFO: renamed from: i */
    public zem m8621i() {
        return this.f6579f;
    }

    /* JADX INFO: renamed from: j */
    public boolean m8622j() {
        return this.f6583j;
    }

    /* JADX INFO: renamed from: k */
    public ImageRequest.RequestLevel m8623k() {
        return this.f6575b;
    }

    /* JADX INFO: renamed from: l */
    public yd80 m8624l() {
        return this.f6585l;
    }

    /* JADX INFO: renamed from: m */
    public guc0 m8625m() {
        return this.f6587n;
    }

    /* JADX INFO: renamed from: n */
    public Priority m8626n() {
        return this.f6584k;
    }

    /* JADX INFO: renamed from: o */
    public nvc0 m8627o() {
        return this.f6577d;
    }

    /* JADX INFO: renamed from: p */
    public Boolean m8628p() {
        return this.f6589p;
    }

    /* JADX INFO: renamed from: q */
    public oed0 m8629q() {
        return this.f6578e;
    }

    /* JADX INFO: renamed from: r */
    public Uri m8630r() {
        return this.f6574a;
    }

    /* JADX INFO: renamed from: t */
    public boolean m8631t() {
        if ((this.f6576c & 48) == 0) {
            return fvj0.m123320o(this.f6574a) || m8590s(this.f6574a);
        }
        return false;
    }

    /* JADX INFO: renamed from: u */
    public boolean m8632u() {
        return this.f6582i;
    }

    /* JADX INFO: renamed from: v */
    public boolean m8633v() {
        return (this.f6576c & 15) == 0;
    }

    /* JADX INFO: renamed from: w */
    public boolean m8634w() {
        return this.f6581h;
    }

    @Deprecated
    /* JADX INFO: renamed from: z */
    public ImageRequestBuilder m8635z(boolean z) {
        return z ? m8609Q(oed0.m163940d()) : m8609Q(oed0.m163942g());
    }
}
