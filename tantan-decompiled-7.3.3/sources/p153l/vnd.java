package p153l;

import android.content.Context;
import android.net.Uri;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.upstream.AssetDataSource;
import com.google.android.exoplayer2.upstream.C2070a;
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
public final class vnd implements g6c {

    /* JADX INFO: renamed from: a */
    public final Context f184849a;

    /* JADX INFO: renamed from: b */
    public final List<pgj0> f184850b = new ArrayList();

    /* JADX INFO: renamed from: c */
    public final g6c f184851c;

    /* JADX INFO: renamed from: d */
    @Nullable
    public g6c f184852d;

    /* JADX INFO: renamed from: e */
    @Nullable
    public g6c f184853e;

    /* JADX INFO: renamed from: f */
    @Nullable
    public g6c f184854f;

    /* JADX INFO: renamed from: g */
    @Nullable
    public g6c f184855g;

    /* JADX INFO: renamed from: h */
    @Nullable
    public g6c f184856h;

    /* JADX INFO: renamed from: i */
    @Nullable
    public g6c f184857i;

    /* JADX INFO: renamed from: j */
    @Nullable
    public g6c f184858j;

    /* JADX INFO: renamed from: k */
    @Nullable
    public g6c f184859k;

    public vnd(Context context, g6c g6cVar) {
        this.f184849a = context.getApplicationContext();
        this.f184851c = (g6c) w11.m204369e(g6cVar);
    }

    @Override // p153l.g6c
    /* JADX INFO: renamed from: a */
    public Map<String, List<String>> mo11175a() {
        g6c g6cVar = this.f184859k;
        return g6cVar == null ? Collections.EMPTY_MAP : g6cVar.mo11175a();
    }

    @Override // p153l.g6c
    public void close() throws IOException {
        g6c g6cVar = this.f184859k;
        if (g6cVar != null) {
            try {
                g6cVar.close();
            } finally {
                this.f184859k = null;
            }
        }
    }

    @Override // p153l.g6c
    @Nullable
    /* JADX INFO: renamed from: d */
    public Uri mo11176d() {
        g6c g6cVar = this.f184859k;
        if (g6cVar == null) {
            return null;
        }
        return g6cVar.mo11176d();
    }

    @Override // p153l.g6c
    /* JADX INFO: renamed from: e */
    public void mo11177e(pgj0 pgj0Var) {
        w11.m204369e(pgj0Var);
        this.f184851c.mo11177e(pgj0Var);
        this.f184850b.add(pgj0Var);
        m201980x(this.f184852d, pgj0Var);
        m201980x(this.f184853e, pgj0Var);
        m201980x(this.f184854f, pgj0Var);
        m201980x(this.f184855g, pgj0Var);
        m201980x(this.f184856h, pgj0Var);
        m201980x(this.f184857i, pgj0Var);
        m201980x(this.f184858j, pgj0Var);
    }

    /* JADX INFO: renamed from: j */
    public final void m201972j(g6c g6cVar) {
        for (int i = 0; i < this.f184850b.size(); i++) {
            g6cVar.mo11177e(this.f184850b.get(i));
        }
    }

    @Override // p153l.g6c
    /* JADX INFO: renamed from: n */
    public long mo11179n(C2070a c2070a) throws IOException {
        w11.m204371g(this.f184859k == null);
        String scheme = c2070a.f9529a.getScheme();
        if (bmk0.m105074E0(c2070a.f9529a)) {
            String path = c2070a.f9529a.getPath();
            if (path == null || !path.startsWith("/android_asset/")) {
                this.f184859k = m201976t();
            } else {
                this.f184859k = m201973q();
            }
        } else if ("asset".equals(scheme)) {
            this.f184859k = m201973q();
        } else if ("content".equals(scheme)) {
            this.f184859k = m201974r();
        } else if ("rtmp".equals(scheme)) {
            this.f184859k = m201978v();
        } else if ("udp".equals(scheme)) {
            this.f184859k = m201979w();
        } else if ("data".equals(scheme)) {
            this.f184859k = m201975s();
        } else if ("rawresource".equals(scheme) || "android.resource".equals(scheme)) {
            this.f184859k = m201977u();
        } else {
            this.f184859k = this.f184851c;
        }
        return this.f184859k.mo11179n(c2070a);
    }

    /* JADX INFO: renamed from: q */
    public final g6c m201973q() {
        if (this.f184853e == null) {
            AssetDataSource assetDataSource = new AssetDataSource(this.f184849a);
            this.f184853e = assetDataSource;
            m201972j(assetDataSource);
        }
        return this.f184853e;
    }

    /* JADX INFO: renamed from: r */
    public final g6c m201974r() {
        if (this.f184854f == null) {
            ContentDataSource contentDataSource = new ContentDataSource(this.f184849a);
            this.f184854f = contentDataSource;
            m201972j(contentDataSource);
        }
        return this.f184854f;
    }

    @Override // p153l.e6c
    public int read(byte[] bArr, int i, int i2) throws IOException {
        return ((g6c) w11.m204369e(this.f184859k)).read(bArr, i, i2);
    }

    /* JADX INFO: renamed from: s */
    public final g6c m201975s() {
        if (this.f184857i == null) {
            f6c f6cVar = new f6c();
            this.f184857i = f6cVar;
            m201972j(f6cVar);
        }
        return this.f184857i;
    }

    /* JADX INFO: renamed from: t */
    public final g6c m201976t() {
        if (this.f184852d == null) {
            FileDataSource fileDataSource = new FileDataSource();
            this.f184852d = fileDataSource;
            m201972j(fileDataSource);
        }
        return this.f184852d;
    }

    /* JADX INFO: renamed from: u */
    public final g6c m201977u() {
        if (this.f184858j == null) {
            RawResourceDataSource rawResourceDataSource = new RawResourceDataSource(this.f184849a);
            this.f184858j = rawResourceDataSource;
            m201972j(rawResourceDataSource);
        }
        return this.f184858j;
    }

    /* JADX INFO: renamed from: v */
    public final g6c m201978v() {
        if (this.f184855g == null) {
            try {
                g6c g6cVar = (g6c) Class.forName("com.google.android.exoplayer2.ext.rtmp.RtmpDataSource").getConstructor(null).newInstance(null);
                this.f184855g = g6cVar;
                m201972j(g6cVar);
            } catch (ClassNotFoundException unused) {
                kyv.m152151i("DefaultDataSource", "Attempting to play RTMP stream without depending on the RTMP extension");
            } catch (Exception e) {
                vtq0.m202761a("Error instantiating RTMP extension", e);
                return null;
            }
            if (this.f184855g == null) {
                this.f184855g = this.f184851c;
            }
        }
        return this.f184855g;
    }

    /* JADX INFO: renamed from: w */
    public final g6c m201979w() {
        if (this.f184856h == null) {
            UdpDataSource udpDataSource = new UdpDataSource();
            this.f184856h = udpDataSource;
            m201972j(udpDataSource);
        }
        return this.f184856h;
    }

    /* JADX INFO: renamed from: x */
    public final void m201980x(@Nullable g6c g6cVar, pgj0 pgj0Var) {
        if (g6cVar != null) {
            g6cVar.mo11177e(pgj0Var);
        }
    }

    /* JADX INFO: renamed from: l.vnd$a */
    public static final class C20866a implements g6c.InterfaceC17163a {

        /* JADX INFO: renamed from: a */
        public final Context f184860a;

        /* JADX INFO: renamed from: b */
        public final g6c.InterfaceC17163a f184861b;

        /* JADX INFO: renamed from: c */
        @Nullable
        public pgj0 f184862c;

        public C20866a(Context context, g6c.InterfaceC17163a interfaceC17163a) {
            this.f184860a = context.getApplicationContext();
            this.f184861b = interfaceC17163a;
        }

        @Override // p153l.g6c.InterfaceC17163a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public vnd mo129219a() {
            vnd vndVar = new vnd(this.f184860a, this.f184861b.mo129219a());
            pgj0 pgj0Var = this.f184862c;
            if (pgj0Var != null) {
                vndVar.mo11177e(pgj0Var);
            }
            return vndVar;
        }

        public C20866a(Context context) {
            this(context, new kpd.C18234b());
        }
    }
}
