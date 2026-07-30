package p153l;

import android.util.Log;
import java.io.File;
import java.io.IOException;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public class z4e implements z3e {

    /* JADX INFO: renamed from: b */
    private final File f202933b;

    /* JADX INFO: renamed from: c */
    private final long f202934c;

    /* JADX INFO: renamed from: e */
    private w4e f202936e;

    /* JADX INFO: renamed from: d */
    private final e4e f202935d = new e4e();

    /* JADX INFO: renamed from: a */
    private final mwd0 f202932a = new mwd0();

    @Deprecated
    public z4e(File file, long j) {
        this.f202933b = file;
        this.f202934c = j;
    }

    /* JADX INFO: renamed from: c */
    public static z3e m218578c(File file, long j) {
        return new z4e(file, j);
    }

    /* JADX INFO: renamed from: d */
    private synchronized w4e m218579d() throws IOException {
        try {
            if (this.f202936e == null) {
                this.f202936e = w4e.m204829J(this.f202933b, 1, 1, this.f202934c);
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f202936e;
    }

    @Override // p153l.z3e
    /* JADX INFO: renamed from: a */
    public File mo95914a(kzq kzqVar) {
        String strM160478b = this.f202932a.m160478b(kzqVar);
        if (Log.isLoggable("DiskLruCacheWrapper", 2)) {
            Objects.toString(kzqVar);
        }
        try {
            w4e.C21017e c21017eM204848H = m218579d().m204848H(strM160478b);
            if (c21017eM204848H != null) {
                return c21017eM204848H.m204873a(0);
            }
            return null;
        } catch (IOException unused) {
            Log.isLoggable("DiskLruCacheWrapper", 5);
            return null;
        }
    }

    @Override // p153l.z3e
    /* JADX INFO: renamed from: b */
    public void mo95915b(kzq kzqVar, z3e.InterfaceC21756b interfaceC21756b) {
        String strM160478b = this.f202932a.m160478b(kzqVar);
        this.f202935d.m119412a(strM160478b);
        try {
            if (Log.isLoggable("DiskLruCacheWrapper", 2)) {
                Objects.toString(kzqVar);
            }
            try {
                w4e w4eVarM218579d = m218579d();
                if (w4eVarM218579d.m204848H(strM160478b) == null) {
                    w4e.C21015c c21015cM204851v = w4eVarM218579d.m204851v(strM160478b);
                    if (c21015cM204851v == null) {
                        throw new IllegalStateException("Had two simultaneous puts for: " + strM160478b);
                    }
                    try {
                        if (interfaceC21756b.write(c21015cM204851v.m204858f(0))) {
                            c21015cM204851v.m204857e();
                        }
                        c21015cM204851v.m204856b();
                    } catch (Throwable th) {
                        c21015cM204851v.m204856b();
                        throw th;
                    }
                }
            } catch (IOException unused) {
                Log.isLoggable("DiskLruCacheWrapper", 5);
            }
            this.f202935d.m119413b(strM160478b);
        } catch (Throwable th2) {
            this.f202935d.m119413b(strM160478b);
            throw th2;
        }
    }
}
