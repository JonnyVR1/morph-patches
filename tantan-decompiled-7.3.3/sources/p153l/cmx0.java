package p153l;

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
public final class cmx0 implements fex0 {

    /* JADX INFO: renamed from: a */
    public final Context f82652a;

    /* JADX INFO: renamed from: b */
    public final List f82653b = new ArrayList();

    /* JADX INFO: renamed from: c */
    public final fex0 f82654c;

    /* JADX INFO: renamed from: d */
    @Nullable
    public fex0 f82655d;

    /* JADX INFO: renamed from: e */
    @Nullable
    public fex0 f82656e;

    /* JADX INFO: renamed from: f */
    @Nullable
    public fex0 f82657f;

    /* JADX INFO: renamed from: g */
    @Nullable
    public fex0 f82658g;

    /* JADX INFO: renamed from: h */
    @Nullable
    public fex0 f82659h;

    /* JADX INFO: renamed from: i */
    @Nullable
    public fex0 f82660i;

    /* JADX INFO: renamed from: j */
    @Nullable
    public fex0 f82661j;

    /* JADX INFO: renamed from: k */
    @Nullable
    public fex0 f82662k;

    public cmx0(Context context, fex0 fex0Var) {
        this.f82652a = context.getApplicationContext();
        this.f82654c = fex0Var;
    }

    /* JADX INFO: renamed from: l */
    public static final void m111336l(@Nullable fex0 fex0Var, btx0 btx0Var) {
        if (fex0Var != null) {
            fex0Var.mo101236f(btx0Var);
        }
    }

    @Override // p153l.nyy0
    /* JADX INFO: renamed from: a */
    public final int mo12781a(byte[] bArr, int i, int i2) throws IOException {
        fex0 fex0Var = this.f82662k;
        fex0Var.getClass();
        return fex0Var.mo12781a(bArr, i, i2);
    }

    @Override // p153l.fex0
    /* JADX INFO: renamed from: e */
    public final long mo12782e(akx0 akx0Var) throws IOException {
        fex0 fex0Var;
        lev0.m153958f(this.f82662k == null);
        String scheme = akx0Var.f72047a.getScheme();
        Uri uri = akx0Var.f72047a;
        int i = mpw0.f137957a;
        String scheme2 = uri.getScheme();
        if (TextUtils.isEmpty(scheme2) || "file".equals(scheme2)) {
            String path = akx0Var.f72047a.getPath();
            if (path == null || !path.startsWith("/android_asset/")) {
                if (this.f82655d == null) {
                    irx0 irx0Var = new irx0();
                    this.f82655d = irx0Var;
                    m111338k(irx0Var);
                }
                this.f82662k = this.f82655d;
            } else {
                this.f82662k = m111337j();
            }
        } else if ("asset".equals(scheme)) {
            this.f82662k = m111337j();
        } else if ("content".equals(scheme)) {
            if (this.f82657f == null) {
                rbx0 rbx0Var = new rbx0(this.f82652a);
                this.f82657f = rbx0Var;
                m111338k(rbx0Var);
            }
            this.f82662k = this.f82657f;
        } else if ("rtmp".equals(scheme)) {
            if (this.f82658g == null) {
                try {
                    fex0 fex0Var2 = (fex0) Class.forName("androidx.media3.datasource.rtmp.RtmpDataSource").getConstructor(null).newInstance(null);
                    this.f82658g = fex0Var2;
                    m111338k(fex0Var2);
                } catch (ClassNotFoundException unused) {
                    y4w0.m214278f("DefaultDataSource", "Attempting to play RTMP stream without depending on the RTMP extension");
                } catch (Exception e) {
                    vtq0.m202761a("Error instantiating RTMP extension", e);
                    return 0L;
                }
                if (this.f82658g == null) {
                    this.f82658g = this.f82654c;
                }
            }
            this.f82662k = this.f82658g;
        } else if ("udp".equals(scheme)) {
            if (this.f82659h == null) {
                bux0 bux0Var = new bux0(2000);
                this.f82659h = bux0Var;
                m111338k(bux0Var);
            }
            this.f82662k = this.f82659h;
        } else if ("data".equals(scheme)) {
            if (this.f82660i == null) {
                ocx0 ocx0Var = new ocx0();
                this.f82660i = ocx0Var;
                m111338k(ocx0Var);
            }
            this.f82662k = this.f82660i;
        } else {
            if ("rawresource".equals(scheme) || "android.resource".equals(scheme)) {
                if (this.f82661j == null) {
                    usx0 usx0Var = new usx0(this.f82652a);
                    this.f82661j = usx0Var;
                    m111338k(usx0Var);
                }
                fex0Var = this.f82661j;
            } else {
                fex0Var = this.f82654c;
            }
            this.f82662k = fex0Var;
        }
        return this.f82662k.mo12782e(akx0Var);
    }

    @Override // p153l.fex0
    /* JADX INFO: renamed from: f */
    public final void mo101236f(btx0 btx0Var) {
        btx0Var.getClass();
        this.f82654c.mo101236f(btx0Var);
        this.f82653b.add(btx0Var);
        m111336l(this.f82655d, btx0Var);
        m111336l(this.f82656e, btx0Var);
        m111336l(this.f82657f, btx0Var);
        m111336l(this.f82658g, btx0Var);
        m111336l(this.f82659h, btx0Var);
        m111336l(this.f82660i, btx0Var);
        m111336l(this.f82661j, btx0Var);
    }

    /* JADX INFO: renamed from: j */
    public final fex0 m111337j() {
        if (this.f82656e == null) {
            i7x0 i7x0Var = new i7x0(this.f82652a);
            this.f82656e = i7x0Var;
            m111338k(i7x0Var);
        }
        return this.f82656e;
    }

    /* JADX INFO: renamed from: k */
    public final void m111338k(fex0 fex0Var) {
        for (int i = 0; i < this.f82653b.size(); i++) {
            fex0Var.mo101236f((btx0) this.f82653b.get(i));
        }
    }

    @Override // p153l.fex0
    @Nullable
    public final Uri zzc() {
        fex0 fex0Var = this.f82662k;
        if (fex0Var == null) {
            return null;
        }
        return fex0Var.zzc();
    }

    @Override // p153l.fex0
    public final void zzd() throws IOException {
        fex0 fex0Var = this.f82662k;
        if (fex0Var != null) {
            try {
                fex0Var.zzd();
            } finally {
                this.f82662k = null;
            }
        }
    }

    @Override // p153l.fex0, p153l.jsx0
    public final Map zze() {
        fex0 fex0Var = this.f82662k;
        return fex0Var == null ? Collections.EMPTY_MAP : fex0Var.zze();
    }
}
