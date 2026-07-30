package p149l;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public final class wcx0 implements z4x0 {

    /* JADX INFO: renamed from: a */
    public final Context f185730a;

    /* JADX INFO: renamed from: b */
    public final List f185731b = new ArrayList();

    /* JADX INFO: renamed from: c */
    public final z4x0 f185732c;

    /* JADX INFO: renamed from: d */
    @Nullable
    public z4x0 f185733d;

    /* JADX INFO: renamed from: e */
    @Nullable
    public z4x0 f185734e;

    /* JADX INFO: renamed from: f */
    @Nullable
    public z4x0 f185735f;

    /* JADX INFO: renamed from: g */
    @Nullable
    public z4x0 f185736g;

    /* JADX INFO: renamed from: h */
    @Nullable
    public z4x0 f185737h;

    /* JADX INFO: renamed from: i */
    @Nullable
    public z4x0 f185738i;

    /* JADX INFO: renamed from: j */
    @Nullable
    public z4x0 f185739j;

    /* JADX INFO: renamed from: k */
    @Nullable
    public z4x0 f185740k;

    public wcx0(Context context, z4x0 z4x0Var) {
        this.f185730a = context.getApplicationContext();
        this.f185732c = z4x0Var;
    }

    /* JADX INFO: renamed from: l */
    public static final void m202694l(@Nullable z4x0 z4x0Var, vjx0 vjx0Var) {
        if (z4x0Var != null) {
            z4x0Var.mo128921f(vjx0Var);
        }
    }

    @Override // p149l.hpy0
    /* JADX INFO: renamed from: a */
    public final int mo12727a(byte[] bArr, int i, int i2) throws IOException {
        z4x0 z4x0Var = this.f185740k;
        z4x0Var.getClass();
        return z4x0Var.mo12727a(bArr, i, i2);
    }

    @Override // p149l.z4x0
    /* JADX INFO: renamed from: e */
    public final long mo12728e(uax0 uax0Var) throws IOException {
        z4x0 z4x0Var;
        f5v0.m119535f(this.f185740k == null);
        String scheme = uax0Var.f175648a.getScheme();
        Uri uri = uax0Var.f175648a;
        int i = ggw0.f102568a;
        String scheme2 = uri.getScheme();
        if (TextUtils.isEmpty(scheme2) || "file".equals(scheme2)) {
            String path = uax0Var.f175648a.getPath();
            if (path == null || !path.startsWith("/android_asset/")) {
                if (this.f185733d == null) {
                    cix0 cix0Var = new cix0();
                    this.f185733d = cix0Var;
                    m202696k(cix0Var);
                }
                this.f185740k = this.f185733d;
            } else {
                this.f185740k = m202695j();
            }
        } else if ("asset".equals(scheme)) {
            this.f185740k = m202695j();
        } else if ("content".equals(scheme)) {
            if (this.f185735f == null) {
                l2x0 l2x0Var = new l2x0(this.f185730a);
                this.f185735f = l2x0Var;
                m202696k(l2x0Var);
            }
            this.f185740k = this.f185735f;
        } else if ("rtmp".equals(scheme)) {
            if (this.f185736g == null) {
                try {
                    z4x0 z4x0Var2 = (z4x0) Class.forName("androidx.media3.datasource.rtmp.RtmpDataSource").getConstructor(null).newInstance(null);
                    this.f185736g = z4x0Var2;
                    m202696k(z4x0Var2);
                } catch (ClassNotFoundException unused) {
                    svv0.m186111f("DefaultDataSource", "Attempting to play RTMP stream without depending on the RTMP extension");
                } catch (Exception e) {
                    pkq0.m170054a("Error instantiating RTMP extension", e);
                    return 0L;
                }
                if (this.f185736g == null) {
                    this.f185736g = this.f185732c;
                }
            }
            this.f185740k = this.f185736g;
        } else if ("udp".equals(scheme)) {
            if (this.f185737h == null) {
                vkx0 vkx0Var = new vkx0(2000);
                this.f185737h = vkx0Var;
                m202696k(vkx0Var);
            }
            this.f185740k = this.f185737h;
        } else if ("data".equals(scheme)) {
            if (this.f185738i == null) {
                i3x0 i3x0Var = new i3x0();
                this.f185738i = i3x0Var;
                m202696k(i3x0Var);
            }
            this.f185740k = this.f185738i;
        } else {
            if ("rawresource".equals(scheme) || "android.resource".equals(scheme)) {
                if (this.f185739j == null) {
                    ojx0 ojx0Var = new ojx0(this.f185730a);
                    this.f185739j = ojx0Var;
                    m202696k(ojx0Var);
                }
                z4x0Var = this.f185739j;
            } else {
                z4x0Var = this.f185732c;
            }
            this.f185740k = z4x0Var;
        }
        return this.f185740k.mo12728e(uax0Var);
    }

    @Override // p149l.z4x0
    /* JADX INFO: renamed from: f */
    public final void mo128921f(vjx0 vjx0Var) {
        vjx0Var.getClass();
        this.f185732c.mo128921f(vjx0Var);
        this.f185731b.add(vjx0Var);
        m202694l(this.f185733d, vjx0Var);
        m202694l(this.f185734e, vjx0Var);
        m202694l(this.f185735f, vjx0Var);
        m202694l(this.f185736g, vjx0Var);
        m202694l(this.f185737h, vjx0Var);
        m202694l(this.f185738i, vjx0Var);
        m202694l(this.f185739j, vjx0Var);
    }

    /* JADX INFO: renamed from: j */
    public final z4x0 m202695j() {
        if (this.f185734e == null) {
            cyw0 cyw0Var = new cyw0(this.f185730a);
            this.f185734e = cyw0Var;
            m202696k(cyw0Var);
        }
        return this.f185734e;
    }

    /* JADX INFO: renamed from: k */
    public final void m202696k(z4x0 z4x0Var) {
        for (int i = 0; i < this.f185731b.size(); i++) {
            z4x0Var.mo128921f((vjx0) this.f185731b.get(i));
        }
    }

    @Override // p149l.z4x0
    @Nullable
    public final Uri zzc() {
        z4x0 z4x0Var = this.f185740k;
        if (z4x0Var == null) {
            return null;
        }
        return z4x0Var.zzc();
    }

    @Override // p149l.z4x0
    public final void zzd() throws IOException {
        z4x0 z4x0Var = this.f185740k;
        if (z4x0Var != null) {
            try {
                z4x0Var.zzd();
            } finally {
                this.f185740k = null;
            }
        }
    }

    @Override // p149l.z4x0, p149l.djx0
    public final Map zze() {
        z4x0 z4x0Var = this.f185740k;
        return z4x0Var == null ? Collections.EMPTY_MAP : z4x0Var.zze();
    }
}
