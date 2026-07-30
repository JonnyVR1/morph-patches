package p007l;

import android.media.MediaMetadataRetriever;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.os.SystemClock;
import com.p003p1.mobile.android.app.App;
import com.p003p1.mobile.android.media.C0235a;
import com.tantanapp.common.utils.CrashHelper;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import l.ffc0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes8.dex */
public class ukw {

    /* JADX INFO: renamed from: m */
    public static ffc0 f4914m;

    /* JADX INFO: renamed from: a */
    public InterfaceC0734d f4915a;

    /* JADX INFO: renamed from: b */
    public InterfaceC0735e f4916b;

    /* JADX INFO: renamed from: c */
    public InterfaceC0733c f4917c;

    /* JADX INFO: renamed from: d */
    public String f4918d = App.f1068e.getCacheDir() + "/0000000.mp3";

    /* JADX INFO: renamed from: e */
    public boolean f4919e = false;

    /* JADX INFO: renamed from: f */
    public boolean f4920f = false;

    /* JADX INFO: renamed from: g */
    public long f4921g = 0;

    /* JADX INFO: renamed from: h */
    public long f4922h = 0;

    /* JADX INFO: renamed from: i */
    public long f4923i = 300;

    /* JADX INFO: renamed from: j */
    public boolean f4924j;

    /* JADX INFO: renamed from: k */
    public Handler f4925k;

    /* JADX INFO: renamed from: l */
    public boolean f4926l;

    /* JADX INFO: renamed from: l.ukw$a */
    public class HandlerC0731a extends Handler {
        public HandlerC0731a() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v3 */
        /* JADX WARN: Type inference failed for: r0v4 */
        /* JADX WARN: Type inference failed for: r0v5, types: [java.io.FileInputStream] */
        /* JADX WARN: Type inference failed for: r2v1, types: [boolean] */
        @Override // android.os.Handler
        public void handleMessage(Message message) throws Throwable {
            FileInputStream fileInputStream;
            RuntimeException e;
            IOException e2;
            int i = message.what;
            if (i == 0) {
                ukw ukwVar = ukw.this;
                if (!ukwVar.f4919e) {
                    ukwVar.m11241j();
                    return;
                }
                ukwVar.m11254w();
                ukw.this.f4922h = SystemClock.uptimeMillis();
                return;
            }
            if (i != 1) {
                ukw ukwVar2 = ukw.this;
                ukwVar2.f4919e = false;
                ukwVar2.m11253v(message);
                return;
            }
            ?? r0 = 0;
            ukw.f4914m = null;
            ukw ukwVar3 = ukw.this;
            ukwVar3.f4919e = false;
            ?? r2 = ukwVar3.f4920f;
            try {
                try {
                    if (r2 != 0) {
                        ukwVar3.m11252u();
                        return;
                    }
                    try {
                        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
                        fileInputStream = new FileInputStream(ukw.this.f4918d);
                        try {
                            mediaMetadataRetriever.setDataSource(fileInputStream.getFD());
                            String strExtractMetadata = mediaMetadataRetriever.extractMetadata(9);
                            if (strExtractMetadata != null) {
                                ukw.this.f4921g = Long.valueOf(strExtractMetadata).longValue();
                            }
                            if (ukw.this.f4921g < ukw.this.f4923i) {
                                ukw.this.m11253v(message);
                                fileInputStream.close();
                            } else {
                                try {
                                    fileInputStream.close();
                                } catch (IOException e3) {
                                    CrashHelper.c(e3);
                                }
                                ukw.this.m11255x();
                            }
                        } catch (IOException e4) {
                            e2 = e4;
                            CrashHelper.c(e2);
                            ukw.this.f4921g = SystemClock.uptimeMillis() - ukw.this.f4922h;
                            ukw.this.m11253v(message);
                            if (fileInputStream == null) {
                                return;
                            }
                            fileInputStream.close();
                        } catch (RuntimeException e5) {
                            e = e5;
                            CrashHelper.c(e);
                            ukw.this.f4921g = SystemClock.uptimeMillis() - ukw.this.f4922h;
                            ukw.this.m11253v(message);
                            if (fileInputStream == null) {
                                return;
                            }
                            fileInputStream.close();
                        }
                    } catch (IOException e6) {
                        fileInputStream = null;
                        e2 = e6;
                    } catch (RuntimeException e7) {
                        fileInputStream = null;
                        e = e7;
                    } catch (Throwable th) {
                        th = th;
                        if (r0 != 0) {
                            try {
                                r0.close();
                            } catch (IOException e8) {
                                CrashHelper.c(e8);
                            }
                        }
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    r0 = r2;
                }
            } catch (IOException e9) {
                CrashHelper.c(e9);
            }
        }
    }

    /* JADX INFO: renamed from: l.ukw$b */
    public interface InterfaceC0732b {
    }

    /* JADX INFO: renamed from: l.ukw$c */
    public interface InterfaceC0733c {
        void onError(int i, int i2);
    }

    /* JADX INFO: renamed from: l.ukw$d */
    public interface InterfaceC0734d {
        void onStart();
    }

    /* JADX INFO: renamed from: l.ukw$e */
    public interface InterfaceC0735e {
        /* JADX INFO: renamed from: a */
        void m11258a(String str);
    }

    /* JADX INFO: renamed from: A */
    public void m11237A(InterfaceC0734d interfaceC0734d) {
        this.f4915a = interfaceC0734d;
    }

    /* JADX INFO: renamed from: B */
    public void m11238B(InterfaceC0735e interfaceC0735e) {
        this.f4916b = interfaceC0735e;
    }

    /* JADX INFO: renamed from: C */
    public void m11239C(int i) {
        if (!this.f4924j) {
            m11243l();
        }
        m11242k();
        f4914m.y(i);
        this.f4920f = false;
        this.f4919e = true;
        this.f4921g = 0L;
    }

    /* JADX INFO: renamed from: D */
    public void m11240D() {
        ffc0 ffc0Var = f4914m;
        if (ffc0Var != null) {
            ffc0Var.B();
        }
        Handler handler = this.f4925k;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
    }

    /* JADX INFO: renamed from: j */
    public void m11241j() {
        this.f4920f = true;
        ffc0 ffc0Var = f4914m;
        if (ffc0Var != null) {
            ffc0Var.B();
        }
        Handler handler = this.f4925k;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
    }

    /* JADX INFO: renamed from: k */
    public final void m11242k() {
        if (f4914m == null) {
            ffc0 ffc0Var = new ffc0(this.f4918d, this.f4924j);
            f4914m = ffc0Var;
            ffc0Var.w(this.f4926l);
            f4914m.x(1);
            f4914m.v(new HandlerC0731a());
        }
    }

    /* JADX INFO: renamed from: l */
    public void m11243l() {
        File file = new File(this.f4918d);
        if (file.exists()) {
            file.delete();
        }
    }

    /* JADX INFO: renamed from: m */
    public File m11244m() {
        return new File(this.f4918d);
    }

    /* JADX INFO: renamed from: n */
    public int m11245n() {
        ffc0 ffc0Var = f4914m;
        if (ffc0Var == null) {
            return -1;
        }
        return ffc0Var.u();
    }

    /* JADX INFO: renamed from: o */
    public InterfaceC0732b m11246o() {
        return null;
    }

    /* JADX INFO: renamed from: p */
    public InterfaceC0733c m11247p() {
        return this.f4917c;
    }

    /* JADX INFO: renamed from: q */
    public InterfaceC0734d m11248q() {
        return this.f4915a;
    }

    /* JADX INFO: renamed from: r */
    public InterfaceC0735e m11249r() {
        return this.f4916b;
    }

    /* JADX INFO: renamed from: s */
    public long m11250s() {
        return this.f4921g;
    }

    /* JADX INFO: renamed from: t */
    public boolean m11251t() {
        return this.f4919e;
    }

    /* JADX INFO: renamed from: u */
    public final void m11252u() {
        m11246o();
        C0235a.m1002a().m1006e(2, null);
    }

    /* JADX INFO: renamed from: v */
    public final void m11253v(Message message) {
        if (m11247p() != null) {
            m11247p().onError(message.what, message.arg1);
        }
        Bundle bundle = new Bundle();
        bundle.putInt("what", message.what);
        bundle.putInt("arg1", message.arg1);
        C0235a.m1002a().m1006e(3, bundle);
    }

    /* JADX INFO: renamed from: w */
    public final void m11254w() {
        if (m11248q() != null) {
            m11248q().onStart();
        }
        C0235a.m1002a().m1006e(0, null);
    }

    /* JADX INFO: renamed from: x */
    public final void m11255x() {
        if (m11249r() != null) {
            m11249r().m11258a(this.f4918d);
        }
        C0235a.m1002a().m1006e(1, null);
    }

    /* JADX INFO: renamed from: y */
    public void m11256y(boolean z) {
        this.f4926l = z;
    }

    /* JADX INFO: renamed from: z */
    public void m11257z(InterfaceC0733c interfaceC0733c) {
        this.f4917c = interfaceC0733c;
    }
}
