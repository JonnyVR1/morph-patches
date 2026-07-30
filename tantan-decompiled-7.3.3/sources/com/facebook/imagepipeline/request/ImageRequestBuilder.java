package com.facebook.imagepipeline.request;

import android.net.Uri;
import com.facebook.imagepipeline.common.Priority;
import com.facebook.imagepipeline.core.DownsampleMode;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import p153l.fm80;
import p153l.i4k0;
import p153l.j2d0;
import p153l.phm;
import p153l.q3d0;
import p153l.qmd0;
import p153l.sjm;
import p153l.vr3;
import p153l.wn80;

/* JADX INFO: loaded from: classes.dex */
public class ImageRequestBuilder {

    /* JADX INFO: renamed from: t */
    public static final Set<String> f6610t = new HashSet();

    /* JADX INFO: renamed from: n */
    public j2d0 f6624n;

    /* JADX INFO: renamed from: r */
    public int f6628r;

    /* JADX INFO: renamed from: a */
    public Uri f6611a = null;

    /* JADX INFO: renamed from: b */
    public ImageRequest.RequestLevel f6612b = ImageRequest.RequestLevel.FULL_FETCH;

    /* JADX INFO: renamed from: c */
    public int f6613c = 0;

    /* JADX INFO: renamed from: d */
    public q3d0 f6614d = null;

    /* JADX INFO: renamed from: e */
    public qmd0 f6615e = null;

    /* JADX INFO: renamed from: f */
    public phm f6616f = phm.m172328a();

    /* JADX INFO: renamed from: g */
    public ImageRequest.CacheChoice f6617g = ImageRequest.CacheChoice.DEFAULT;

    /* JADX INFO: renamed from: h */
    public boolean f6618h = sjm.m186169J().getIsProgressiveRenderingEnabled();

    /* JADX INFO: renamed from: i */
    public boolean f6619i = false;

    /* JADX INFO: renamed from: j */
    public boolean f6620j = false;

    /* JADX INFO: renamed from: k */
    public Priority f6621k = Priority.HIGH;

    /* JADX INFO: renamed from: l */
    public fm80 f6622l = null;

    /* JADX INFO: renamed from: m */
    public Boolean f6623m = null;

    /* JADX INFO: renamed from: o */
    public vr3 f6625o = null;

    /* JADX INFO: renamed from: p */
    public Boolean f6626p = null;

    /* JADX INFO: renamed from: q */
    public DownsampleMode f6627q = null;

    /* JADX INFO: renamed from: s */
    public String f6629s = null;

    public static class BuilderException extends RuntimeException {
        public BuilderException(String str) {
            super("Invalid request builder: " + str);
        }
    }

    /* JADX INFO: renamed from: b */
    public static ImageRequestBuilder m8643b(ImageRequest imageRequest) {
        return m8646y(imageRequest.m8639w()).m8653G(imageRequest.m8625i()).m8647A(imageRequest.m8619c()).m8648B(imageRequest.m8620d()).m8655I(imageRequest.m8627k()).m8654H(imageRequest.m8626j()).m8656J(imageRequest.m8628l()).m8649C(imageRequest.m8621e()).m8657K(imageRequest.m8629m()).m8658L(imageRequest.m8633q()).m8660N(imageRequest.m8632p()).m8661O(imageRequest.m8635s()).m8659M(imageRequest.m8634r()).m8663Q(imageRequest.m8637u()).m8664R(imageRequest.m8618A()).m8650D(imageRequest.m8622f()).m8651E(imageRequest.m8623g()).m8652F(imageRequest.m8624h()).m8662P(imageRequest.m8636t());
    }

    /* JADX INFO: renamed from: s */
    public static boolean m8644s(Uri uri) {
        Set<String> set = f6610t;
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
    public static ImageRequestBuilder m8645x(int i) {
        return m8646y(i4k0.m138558g(i));
    }

    /* JADX INFO: renamed from: y */
    public static ImageRequestBuilder m8646y(Uri uri) {
        return new ImageRequestBuilder().m8665S(uri);
    }

    /* JADX INFO: renamed from: A */
    public ImageRequestBuilder m8647A(vr3 vr3Var) {
        this.f6625o = vr3Var;
        return this;
    }

    /* JADX INFO: renamed from: B */
    public ImageRequestBuilder m8648B(ImageRequest.CacheChoice cacheChoice) {
        this.f6617g = cacheChoice;
        return this;
    }

    /* JADX INFO: renamed from: C */
    public final ImageRequestBuilder m8649C(int i) {
        this.f6613c = i;
        if (this.f6617g != ImageRequest.CacheChoice.DYNAMIC) {
            this.f6629s = null;
        }
        return this;
    }

    /* JADX INFO: renamed from: D */
    public ImageRequestBuilder m8650D(int i) {
        this.f6628r = i;
        return this;
    }

    /* JADX INFO: renamed from: E */
    public ImageRequestBuilder m8651E(String str) {
        this.f6629s = str;
        return this;
    }

    /* JADX INFO: renamed from: F */
    public ImageRequestBuilder m8652F(DownsampleMode downsampleMode) {
        this.f6627q = downsampleMode;
        return this;
    }

    /* JADX INFO: renamed from: G */
    public ImageRequestBuilder m8653G(phm phmVar) {
        this.f6616f = phmVar;
        return this;
    }

    /* JADX INFO: renamed from: H */
    public ImageRequestBuilder m8654H(boolean z) {
        this.f6620j = z;
        return this;
    }

    /* JADX INFO: renamed from: I */
    public ImageRequestBuilder m8655I(boolean z) {
        this.f6619i = z;
        return this;
    }

    /* JADX INFO: renamed from: J */
    public ImageRequestBuilder m8656J(ImageRequest.RequestLevel requestLevel) {
        this.f6612b = requestLevel;
        return this;
    }

    /* JADX INFO: renamed from: K */
    public ImageRequestBuilder m8657K(fm80 fm80Var) {
        this.f6622l = fm80Var;
        return this;
    }

    /* JADX INFO: renamed from: L */
    public ImageRequestBuilder m8658L(boolean z) {
        this.f6618h = z;
        return this;
    }

    /* JADX INFO: renamed from: M */
    public ImageRequestBuilder m8659M(j2d0 j2d0Var) {
        this.f6624n = j2d0Var;
        return this;
    }

    /* JADX INFO: renamed from: N */
    public ImageRequestBuilder m8660N(Priority priority) {
        this.f6621k = priority;
        return this;
    }

    /* JADX INFO: renamed from: O */
    public ImageRequestBuilder m8661O(q3d0 q3d0Var) {
        this.f6614d = q3d0Var;
        return this;
    }

    /* JADX INFO: renamed from: P */
    public ImageRequestBuilder m8662P(Boolean bool) {
        this.f6626p = bool;
        return this;
    }

    /* JADX INFO: renamed from: Q */
    public ImageRequestBuilder m8663Q(qmd0 qmd0Var) {
        this.f6615e = qmd0Var;
        return this;
    }

    /* JADX INFO: renamed from: R */
    public ImageRequestBuilder m8664R(Boolean bool) {
        this.f6623m = bool;
        return this;
    }

    /* JADX INFO: renamed from: S */
    public ImageRequestBuilder m8665S(Uri uri) {
        wn80.m207182g(uri);
        this.f6611a = uri;
        return this;
    }

    /* JADX INFO: renamed from: T */
    public Boolean m8666T() {
        return this.f6623m;
    }

    /* JADX INFO: renamed from: U */
    public void m8667U() {
        Uri uri = this.f6611a;
        if (uri == null) {
            throw new BuilderException("Source must be set!");
        }
        if (i4k0.m138565n(uri)) {
            if (!this.f6611a.isAbsolute()) {
                throw new BuilderException("Resource URI path must be absolute.");
            }
            if (this.f6611a.getPath().isEmpty()) {
                throw new BuilderException("Resource URI must not be empty");
            }
            try {
                Integer.parseInt(this.f6611a.getPath().substring(1));
            } catch (NumberFormatException unused) {
                throw new BuilderException("Resource URI path must be a resource id.");
            }
        }
        if (i4k0.m138560i(this.f6611a) && !this.f6611a.isAbsolute()) {
            throw new BuilderException("Asset URI path must be absolute.");
        }
    }

    /* JADX INFO: renamed from: a */
    public ImageRequest m8668a() {
        m8667U();
        return new ImageRequest(this);
    }

    /* JADX INFO: renamed from: c */
    public vr3 m8669c() {
        return this.f6625o;
    }

    /* JADX INFO: renamed from: d */
    public ImageRequest.CacheChoice m8670d() {
        return this.f6617g;
    }

    /* JADX INFO: renamed from: e */
    public int m8671e() {
        return this.f6613c;
    }

    /* JADX INFO: renamed from: f */
    public int m8672f() {
        return this.f6628r;
    }

    /* JADX INFO: renamed from: g */
    public String m8673g() {
        return this.f6629s;
    }

    /* JADX INFO: renamed from: h */
    public DownsampleMode m8674h() {
        return this.f6627q;
    }

    /* JADX INFO: renamed from: i */
    public phm m8675i() {
        return this.f6616f;
    }

    /* JADX INFO: renamed from: j */
    public boolean m8676j() {
        return this.f6620j;
    }

    /* JADX INFO: renamed from: k */
    public ImageRequest.RequestLevel m8677k() {
        return this.f6612b;
    }

    /* JADX INFO: renamed from: l */
    public fm80 m8678l() {
        return this.f6622l;
    }

    /* JADX INFO: renamed from: m */
    public j2d0 m8679m() {
        return this.f6624n;
    }

    /* JADX INFO: renamed from: n */
    public Priority m8680n() {
        return this.f6621k;
    }

    /* JADX INFO: renamed from: o */
    public q3d0 m8681o() {
        return this.f6614d;
    }

    /* JADX INFO: renamed from: p */
    public Boolean m8682p() {
        return this.f6626p;
    }

    /* JADX INFO: renamed from: q */
    public qmd0 m8683q() {
        return this.f6615e;
    }

    /* JADX INFO: renamed from: r */
    public Uri m8684r() {
        return this.f6611a;
    }

    /* JADX INFO: renamed from: t */
    public boolean m8685t() {
        if ((this.f6613c & 48) == 0) {
            return i4k0.m138566o(this.f6611a) || m8644s(this.f6611a);
        }
        return false;
    }

    /* JADX INFO: renamed from: u */
    public boolean m8686u() {
        return this.f6619i;
    }

    /* JADX INFO: renamed from: v */
    public boolean m8687v() {
        return (this.f6613c & 15) == 0;
    }

    /* JADX INFO: renamed from: w */
    public boolean m8688w() {
        return this.f6618h;
    }

    @Deprecated
    /* JADX INFO: renamed from: z */
    public ImageRequestBuilder m8689z(boolean z) {
        return z ? m8663Q(qmd0.m177098d()) : m8663Q(qmd0.m177100g());
    }
}
