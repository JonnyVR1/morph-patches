package p149l;

import android.content.Context;
import android.net.Uri;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.upstream.AssetDataSource;
import com.google.android.exoplayer2.upstream.C2047a;
import com.google.android.exoplayer2.upstream.ContentDataSource;
import com.google.android.exoplayer2.upstream.FileDataSource;
import com.google.android.exoplayer2.upstream.RawResourceDataSource;
import com.google.android.exoplayer2.upstream.UdpDataSource;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class qmd implements a5c {

    /* JADX INFO: renamed from: a */
    public final Context f155296a;

    /* JADX INFO: renamed from: b */
    public final List<l7j0> f155297b = new ArrayList();

    /* JADX INFO: renamed from: c */
    public final a5c f155298c;

    /* JADX INFO: renamed from: d */
    @Nullable
    public a5c f155299d;

    /* JADX INFO: renamed from: e */
    @Nullable
    public a5c f155300e;

    /* JADX INFO: renamed from: f */
    @Nullable
    public a5c f155301f;

    /* JADX INFO: renamed from: g */
    @Nullable
    public a5c f155302g;

    /* JADX INFO: renamed from: h */
    @Nullable
    public a5c f155303h;

    /* JADX INFO: renamed from: i */
    @Nullable
    public a5c f155304i;

    /* JADX INFO: renamed from: j */
    @Nullable
    public a5c f155305j;

    /* JADX INFO: renamed from: k */
    @Nullable
    public a5c f155306k;

    public qmd(Context context, a5c a5cVar) {
        this.f155296a = context.getApplicationContext();
        this.f155298c = (a5c) p11.m167011e(a5cVar);
    }

    @Override // p149l.a5c
    @Nullable
    /* JADX INFO: renamed from: a */
    public Uri mo11121a() {
        a5c a5cVar = this.f155306k;
        if (a5cVar == null) {
            return null;
        }
        return a5cVar.mo11121a();
    }

    @Override // p149l.a5c
    /* JADX INFO: renamed from: b */
    public Map<String, List<String>> mo11122b() {
        a5c a5cVar = this.f155306k;
        return a5cVar == null ? Collections.EMPTY_MAP : a5cVar.mo11122b();
    }

    @Override // p149l.a5c
    public void close() throws IOException {
        a5c a5cVar = this.f155306k;
        if (a5cVar != null) {
            try {
                a5cVar.close();
            } finally {
                this.f155306k = null;
            }
        }
    }

    @Override // p149l.a5c
    /* JADX INFO: renamed from: e */
    public void mo11123e(l7j0 l7j0Var) {
        p11.m167011e(l7j0Var);
        this.f155298c.mo11123e(l7j0Var);
        this.f155297b.add(l7j0Var);
        m175562x(this.f155299d, l7j0Var);
        m175562x(this.f155300e, l7j0Var);
        m175562x(this.f155301f, l7j0Var);
        m175562x(this.f155302g, l7j0Var);
        m175562x(this.f155303h, l7j0Var);
        m175562x(this.f155304i, l7j0Var);
        m175562x(this.f155305j, l7j0Var);
    }

    /* JADX INFO: renamed from: j */
    public final void m175554j(a5c a5cVar) {
        for (int i = 0; i < this.f155297b.size(); i++) {
            a5cVar.mo11123e(this.f155297b.get(i));
        }
    }

    @Override // p149l.a5c
    /* JADX INFO: renamed from: n */
    public long mo11125n(C2047a c2047a) throws IOException {
        p11.m167013g(this.f155306k == null);
        String scheme = c2047a.f9492a.getScheme();
        if (vck0.m197796E0(c2047a.f9492a)) {
            String path = c2047a.f9492a.getPath();
            if (path == null || !path.startsWith("/android_asset/")) {
                this.f155306k = m175558t();
            } else {
                this.f155306k = m175555q();
            }
        } else if ("asset".equals(scheme)) {
            this.f155306k = m175555q();
        } else if ("content".equals(scheme)) {
            this.f155306k = m175556r();
        } else if ("rtmp".equals(scheme)) {
            this.f155306k = m175560v();
        } else if ("udp".equals(scheme)) {
            this.f155306k = m175561w();
        } else if ("data".equals(scheme)) {
            this.f155306k = m175557s();
        } else if ("rawresource".equals(scheme) || "android.resource".equals(scheme)) {
            this.f155306k = m175559u();
        } else {
            this.f155306k = this.f155298c;
        }
        return this.f155306k.mo11125n(c2047a);
    }

    /* JADX INFO: renamed from: q */
    public final a5c m175555q() {
        if (this.f155300e == null) {
            AssetDataSource assetDataSource = new AssetDataSource(this.f155296a);
            this.f155300e = assetDataSource;
            m175554j(assetDataSource);
        }
        return this.f155300e;
    }

    /* JADX INFO: renamed from: r */
    public final a5c m175556r() {
        if (this.f155301f == null) {
            ContentDataSource contentDataSource = new ContentDataSource(this.f155296a);
            this.f155301f = contentDataSource;
            m175554j(contentDataSource);
        }
        return this.f155301f;
    }

    @Override // p149l.w4c
    public int read(byte[] bArr, int i, int i2) throws IOException {
        return ((a5c) p11.m167011e(this.f155306k)).read(bArr, i, i2);
    }

    /* JADX INFO: renamed from: s */
    public final a5c m175557s() {
        if (this.f155304i == null) {
            z4c z4cVar = new z4c();
            this.f155304i = z4cVar;
            m175554j(z4cVar);
        }
        return this.f155304i;
    }

    /* JADX INFO: renamed from: t */
    public final a5c m175558t() {
        if (this.f155299d == null) {
            FileDataSource fileDataSource = new FileDataSource();
            this.f155299d = fileDataSource;
            m175554j(fileDataSource);
        }
        return this.f155299d;
    }

    /* JADX INFO: renamed from: u */
    public final a5c m175559u() {
        if (this.f155305j == null) {
            RawResourceDataSource rawResourceDataSource = new RawResourceDataSource(this.f155296a);
            this.f155305j = rawResourceDataSource;
            m175554j(rawResourceDataSource);
        }
        return this.f155305j;
    }

    /* JADX INFO: renamed from: v */
    public final a5c m175560v() {
        if (this.f155302g == null) {
            try {
                a5c a5cVar = (a5c) Class.forName("com.google.android.exoplayer2.ext.rtmp.RtmpDataSource").getConstructor(null).newInstance(null);
                this.f155302g = a5cVar;
                m175554j(a5cVar);
            } catch (ClassNotFoundException unused) {
                jwv.m143689i("DefaultDataSource", "Attempting to play RTMP stream without depending on the RTMP extension");
            } catch (Exception e) {
                pkq0.m170054a("Error instantiating RTMP extension", e);
                return null;
            }
            if (this.f155302g == null) {
                this.f155302g = this.f155298c;
            }
        }
        return this.f155302g;
    }

    /* JADX INFO: renamed from: w */
    public final a5c m175561w() {
        if (this.f155303h == null) {
            UdpDataSource udpDataSource = new UdpDataSource();
            this.f155303h = udpDataSource;
            m175554j(udpDataSource);
        }
        return this.f155303h;
    }

    /* JADX INFO: renamed from: x */
    public final void m175562x(@Nullable a5c a5cVar, l7j0 l7j0Var) {
        if (a5cVar != null) {
            a5cVar.mo11123e(l7j0Var);
        }
    }

    /* JADX INFO: renamed from: l.qmd$a */
    public static final class C19539a implements a5c.InterfaceC15531a {

        /* JADX INFO: renamed from: a */
        public final Context f155307a;

        /* JADX INFO: renamed from: b */
        public final a5c.InterfaceC15531a f155308b;

        /* JADX INFO: renamed from: c */
        @Nullable
        public l7j0 f155309c;

        public C19539a(Context context, a5c.InterfaceC15531a interfaceC15531a) {
            this.f155307a = context.getApplicationContext();
            this.f155308b = interfaceC15531a;
        }

        @Override // p149l.a5c.InterfaceC15531a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public qmd mo95019a() {
            qmd qmdVar = new qmd(this.f155307a, this.f155308b.mo95019a());
            l7j0 l7j0Var = this.f155309c;
            if (l7j0Var != null) {
                qmdVar.mo11123e(l7j0Var);
            }
            return qmdVar;
        }

        public C19539a(Context context) {
            this(context, new fod.C16893b());
        }
    }
}
