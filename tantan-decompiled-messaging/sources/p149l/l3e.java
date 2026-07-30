package p149l;

import android.util.Log;
import java.io.File;
import java.io.IOException;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public class l3e implements l2e {

    /* JADX INFO: renamed from: b */
    private final File f125878b;

    /* JADX INFO: renamed from: c */
    private final long f125879c;

    /* JADX INFO: renamed from: e */
    private i3e f125881e;

    /* JADX INFO: renamed from: d */
    private final q2e f125880d = new q2e();

    /* JADX INFO: renamed from: a */
    private final kod0 f125877a = new kod0();

    @Deprecated
    public l3e(File file, long j) {
        this.f125878b = file;
        this.f125879c = j;
    }

    /* JADX INFO: renamed from: c */
    public static l2e m148389c(File file, long j) {
        return new l3e(file, j);
    }

    /* JADX INFO: renamed from: d */
    private synchronized i3e m148390d() throws IOException {
        try {
            if (this.f125881e == null) {
                this.f125881e = i3e.m134165J(this.f125878b, 1, 1, this.f125879c);
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f125881e;
    }

    @Override // p149l.l2e
    /* JADX INFO: renamed from: a */
    public File mo148280a(kxq kxqVar) {
        String strM146697b = this.f125877a.m146697b(kxqVar);
        if (Log.isLoggable("DiskLruCacheWrapper", 2)) {
            Objects.toString(kxqVar);
        }
        try {
            i3e.C17472e c17472eM134184H = m148390d().m134184H(strM146697b);
            if (c17472eM134184H != null) {
                return c17472eM134184H.m134209a(0);
            }
            return null;
        } catch (IOException unused) {
            Log.isLoggable("DiskLruCacheWrapper", 5);
            return null;
        }
    }

    @Override // p149l.l2e
    /* JADX INFO: renamed from: b */
    public void mo148281b(kxq kxqVar, l2e.InterfaceC18140b interfaceC18140b) {
        String strM146697b = this.f125877a.m146697b(kxqVar);
        this.f125880d.m172437a(strM146697b);
        try {
            if (Log.isLoggable("DiskLruCacheWrapper", 2)) {
                Objects.toString(kxqVar);
            }
            try {
                i3e i3eVarM148390d = m148390d();
                if (i3eVarM148390d.m134184H(strM146697b) == null) {
                    i3e.C17470c c17470cM134187v = i3eVarM148390d.m134187v(strM146697b);
                    if (c17470cM134187v == null) {
                        throw new IllegalStateException("Had two simultaneous puts for: " + strM146697b);
                    }
                    try {
                        if (interfaceC18140b.write(c17470cM134187v.m134194f(0))) {
                            c17470cM134187v.m134193e();
                        }
                        c17470cM134187v.m134192b();
                    } catch (Throwable th) {
                        c17470cM134187v.m134192b();
                        throw th;
                    }
                }
            } catch (IOException unused) {
                Log.isLoggable("DiskLruCacheWrapper", 5);
            }
            this.f125880d.m172438b(strM146697b);
        } catch (Throwable th2) {
            this.f125880d.m172438b(strM146697b);
            throw th2;
        }
    }
}
