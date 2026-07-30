package p149l;

import android.os.Environment;
import android.util.Base64;
import com.google.android.gms.ads.internal.util.C2075b;
import com.google.android.gms.internal.ads.C2161i0;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/* JADX INFO: loaded from: classes6.dex */
public final class z2s0 {

    /* JADX INFO: renamed from: a */
    public final f3s0 f201275a;

    /* JADX INFO: renamed from: b */
    public final s4s0 f201276b;

    /* JADX INFO: renamed from: c */
    public final boolean f201277c;

    public z2s0(f3s0 f3s0Var) {
        this.f201276b = C2161i0.m12750N();
        this.f201275a = f3s0Var;
        this.f201277c = ((Boolean) d1s0.m109677c().m144697a(m7s0.f132017O4)).booleanValue();
    }

    /* JADX INFO: renamed from: a */
    public static z2s0 m216992a() {
        return new z2s0();
    }

    /* JADX INFO: renamed from: b */
    public final synchronized void m216993b(y2s0 y2s0Var) {
        if (this.f201277c) {
            try {
                y2s0Var.mo12818a(this.f201276b);
            } catch (NullPointerException e) {
                vny0.m199079q().m212290w(e, "AdMobClearcutLogger.modify");
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public final synchronized void m216994c(int i) {
        if (this.f201277c) {
            if (((Boolean) d1s0.m109677c().m144697a(m7s0.f132029P4)).booleanValue()) {
                m216996e(i);
            } else {
                m216997f(i);
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public final synchronized String m216995d(int i) {
        return String.format("id=%s,timestamp=%s,event=%s,data=%s\n", this.f201276b.m182305A(), Long.valueOf(vny0.m199064b().elapsedRealtime()), Integer.valueOf(i - 1), Base64.encodeToString(((C2161i0) this.f201276b.m153521m()).m12744h(), 3));
    }

    /* JADX INFO: renamed from: e */
    public final synchronized void m216996e(int i) {
        File externalStorageDirectory = Environment.getExternalStorageDirectory();
        if (externalStorageDirectory == null) {
            return;
        }
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(new File(externalStorageDirectory, "clearcut_events.txt"), true);
            try {
                try {
                    fileOutputStream.write(m216995d(i).getBytes());
                    try {
                        fileOutputStream.close();
                    } catch (IOException unused) {
                        xsu0.m210834k("Could not close Clearcut output stream.");
                    }
                } catch (IOException unused2) {
                    xsu0.m210834k("Could not write Clearcut to file.");
                    try {
                        fileOutputStream.close();
                    } catch (IOException unused3) {
                        xsu0.m210834k("Could not close Clearcut output stream.");
                    }
                }
            } catch (Throwable th) {
                try {
                    fileOutputStream.close();
                } catch (IOException unused4) {
                    xsu0.m210834k("Could not close Clearcut output stream.");
                }
                throw th;
            }
        } catch (FileNotFoundException unused5) {
            xsu0.m210834k("Could not find file for Clearcut");
        }
    }

    /* JADX INFO: renamed from: f */
    public final synchronized void m216997f(int i) {
        s4s0 s4s0Var = this.f201276b;
        s4s0Var.m182309t();
        s4s0Var.m182308s(C2075b.m12293F());
        e3s0 e3s0Var = new e3s0(this.f201275a, ((C2161i0) this.f201276b.m153521m()).m12744h(), null);
        int i2 = i - 1;
        e3s0Var.m114626a(i2);
        e3s0Var.m114627c();
        xsu0.m210834k("Logging Event with event code : ".concat(String.valueOf(Integer.toString(i2, 10))));
    }

    public z2s0() {
        this.f201276b = C2161i0.m12750N();
        this.f201277c = false;
        this.f201275a = new f3s0();
    }
}
