package p153l;

import android.os.Environment;
import android.util.Base64;
import com.google.android.gms.ads.internal.util.C2098b;
import com.google.android.gms.internal.ads.C2184i0;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/* JADX INFO: loaded from: classes6.dex */
public final class fcs0 {

    /* JADX INFO: renamed from: a */
    public final lcs0 f98258a;

    /* JADX INFO: renamed from: b */
    public final yds0 f98259b;

    /* JADX INFO: renamed from: c */
    public final boolean f98260c;

    public fcs0(lcs0 lcs0Var) {
        this.f98259b = C2184i0.m12804N();
        this.f98258a = lcs0Var;
        this.f98260c = ((Boolean) jas0.m144075c().m176505a(sgs0.f168088O4)).booleanValue();
    }

    /* JADX INFO: renamed from: a */
    public static fcs0 m125045a() {
        return new fcs0();
    }

    /* JADX INFO: renamed from: b */
    public final synchronized void m125046b(ecs0 ecs0Var) {
        if (this.f98260c) {
            try {
                ecs0Var.mo12872a(this.f98259b);
            } catch (NullPointerException e) {
                bxy0.m106933q().m120275w(e, "AdMobClearcutLogger.modify");
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public final synchronized void m125047c(int i) {
        if (this.f98260c) {
            if (((Boolean) jas0.m144075c().m176505a(sgs0.f168100P4)).booleanValue()) {
                m125049e(i);
            } else {
                m125050f(i);
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public final synchronized String m125048d(int i) {
        return String.format("id=%s,timestamp=%s,event=%s,data=%s\n", this.f98259b.m215279A(), Long.valueOf(bxy0.m106918b().elapsedRealtime()), Integer.valueOf(i - 1), Base64.encodeToString(((C2184i0) this.f98259b.m185950m()).m12798h(), 3));
    }

    /* JADX INFO: renamed from: e */
    public final synchronized void m125049e(int i) {
        File externalStorageDirectory = Environment.getExternalStorageDirectory();
        if (externalStorageDirectory == null) {
            return;
        }
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(new File(externalStorageDirectory, "clearcut_events.txt"), true);
            try {
                try {
                    fileOutputStream.write(m125048d(i).getBytes());
                    try {
                        fileOutputStream.close();
                    } catch (IOException unused) {
                        d2v0.m113737k("Could not close Clearcut output stream.");
                    }
                } catch (IOException unused2) {
                    d2v0.m113737k("Could not write Clearcut to file.");
                    try {
                        fileOutputStream.close();
                    } catch (IOException unused3) {
                        d2v0.m113737k("Could not close Clearcut output stream.");
                    }
                }
            } catch (Throwable th) {
                try {
                    fileOutputStream.close();
                } catch (IOException unused4) {
                    d2v0.m113737k("Could not close Clearcut output stream.");
                }
                throw th;
            }
        } catch (FileNotFoundException unused5) {
            d2v0.m113737k("Could not find file for Clearcut");
        }
    }

    /* JADX INFO: renamed from: f */
    public final synchronized void m125050f(int i) {
        yds0 yds0Var = this.f98259b;
        yds0Var.m215283t();
        yds0Var.m215282s(C2098b.m12347F());
        kcs0 kcs0Var = new kcs0(this.f98258a, ((C2184i0) this.f98259b.m185950m()).m12798h(), null);
        int i2 = i - 1;
        kcs0Var.m149126a(i2);
        kcs0Var.m149127c();
        d2v0.m113737k("Logging Event with event code : ".concat(String.valueOf(Integer.toString(i2, 10))));
    }

    public fcs0() {
        this.f98259b = C2184i0.m12804N();
        this.f98260c = false;
        this.f98258a = new lcs0();
    }
}
