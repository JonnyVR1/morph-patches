package p149l;

import android.media.MediaMetadataRetriever;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.os.SystemClock;
import com.p046p1.mobile.android.app.App;
import com.p046p1.mobile.android.media.C4323a;
import com.tantanapp.common.utils.CrashHelper;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

/* JADX INFO: loaded from: classes8.dex */
public class ukw {

    /* JADX INFO: renamed from: m */
    public static ffc0 f176969m;

    /* JADX INFO: renamed from: a */
    public InterfaceC20451d f176970a;

    /* JADX INFO: renamed from: b */
    public InterfaceC20452e f176971b;

    /* JADX INFO: renamed from: c */
    public InterfaceC20450c f176972c;

    /* JADX INFO: renamed from: d */
    public String f176973d = App.f15369e.getCacheDir() + "/0000000.mp3";

    /* JADX INFO: renamed from: e */
    public boolean f176974e = false;

    /* JADX INFO: renamed from: f */
    public boolean f176975f = false;

    /* JADX INFO: renamed from: g */
    public long f176976g = 0;

    /* JADX INFO: renamed from: h */
    public long f176977h = 0;

    /* JADX INFO: renamed from: i */
    public long f176978i = 300;

    /* JADX INFO: renamed from: j */
    public boolean f176979j;

    /* JADX INFO: renamed from: k */
    public Handler f176980k;

    /* JADX INFO: renamed from: l */
    public boolean f176981l;

    /* JADX INFO: renamed from: l.ukw$a */
    public class HandlerC20448a extends Handler {
        public HandlerC20448a() {
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
                if (!ukwVar.f176974e) {
                    ukwVar.m194193j();
                    return;
                }
                ukwVar.m194206w();
                ukw.this.f176977h = SystemClock.uptimeMillis();
                return;
            }
            if (i != 1) {
                ukw ukwVar2 = ukw.this;
                ukwVar2.f176974e = false;
                ukwVar2.m194205v(message);
                return;
            }
            ?? r0 = 0;
            ukw.f176969m = null;
            ukw ukwVar3 = ukw.this;
            ukwVar3.f176974e = false;
            ?? r2 = ukwVar3.f176975f;
            try {
                try {
                    if (r2 != 0) {
                        ukwVar3.m194204u();
                        return;
                    }
                    try {
                        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
                        fileInputStream = new FileInputStream(ukw.this.f176973d);
                        try {
                            mediaMetadataRetriever.setDataSource(fileInputStream.getFD());
                            String strExtractMetadata = mediaMetadataRetriever.extractMetadata(9);
                            if (strExtractMetadata != null) {
                                ukw.this.f176976g = Long.valueOf(strExtractMetadata).longValue();
                            }
                            if (ukw.this.f176976g < ukw.this.f176978i) {
                                ukw.this.m194205v(message);
                                fileInputStream.close();
                            } else {
                                try {
                                    fileInputStream.close();
                                } catch (IOException e3) {
                                    CrashHelper.m81296c(e3);
                                }
                                ukw.this.m194207x();
                            }
                        } catch (IOException e4) {
                            e2 = e4;
                            CrashHelper.m81296c(e2);
                            ukw.this.f176976g = SystemClock.uptimeMillis() - ukw.this.f176977h;
                            ukw.this.m194205v(message);
                            if (fileInputStream == null) {
                                return;
                            }
                            fileInputStream.close();
                        } catch (RuntimeException e5) {
                            e = e5;
                            CrashHelper.m81296c(e);
                            ukw.this.f176976g = SystemClock.uptimeMillis() - ukw.this.f176977h;
                            ukw.this.m194205v(message);
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
                                CrashHelper.m81296c(e8);
                            }
                        }
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    r0 = r2;
                }
            } catch (IOException e9) {
                CrashHelper.m81296c(e9);
            }
        }
    }

    /* JADX INFO: renamed from: l.ukw$b */
    public interface InterfaceC20449b {
    }

    /* JADX INFO: renamed from: l.ukw$c */
    public interface InterfaceC20450c {
        void onError(int i, int i2);
    }

    /* JADX INFO: renamed from: l.ukw$d */
    public interface InterfaceC20451d {
        void onStart();
    }

    /* JADX INFO: renamed from: l.ukw$e */
    public interface InterfaceC20452e {
        /* JADX INFO: renamed from: a */
        void mo99331a(String str);
    }

    /* JADX INFO: renamed from: A */
    public void m194189A(InterfaceC20451d interfaceC20451d) {
        this.f176970a = interfaceC20451d;
    }

    /* JADX INFO: renamed from: B */
    public void m194190B(InterfaceC20452e interfaceC20452e) {
        this.f176971b = interfaceC20452e;
    }

    /* JADX INFO: renamed from: C */
    public void m194191C(int i) {
        if (!this.f176979j) {
            m194195l();
        }
        m194194k();
        f176969m.m121138y(i);
        this.f176975f = false;
        this.f176974e = true;
        this.f176976g = 0L;
    }

    /* JADX INFO: renamed from: D */
    public void m194192D() {
        ffc0 ffc0Var = f176969m;
        if (ffc0Var != null) {
            ffc0Var.m121132B();
        }
        Handler handler = this.f176980k;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
    }

    /* JADX INFO: renamed from: j */
    public void m194193j() {
        this.f176975f = true;
        ffc0 ffc0Var = f176969m;
        if (ffc0Var != null) {
            ffc0Var.m121132B();
        }
        Handler handler = this.f176980k;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
    }

    /* JADX INFO: renamed from: k */
    public final void m194194k() {
        if (f176969m == null) {
            ffc0 ffc0Var = new ffc0(this.f176973d, this.f176979j);
            f176969m = ffc0Var;
            ffc0Var.m121136w(this.f176981l);
            f176969m.m121137x(1);
            f176969m.m121135v(new HandlerC20448a());
        }
    }

    /* JADX INFO: renamed from: l */
    public void m194195l() {
        File file = new File(this.f176973d);
        if (file.exists()) {
            file.delete();
        }
    }

    /* JADX INFO: renamed from: m */
    public File m194196m() {
        return new File(this.f176973d);
    }

    /* JADX INFO: renamed from: n */
    public int m194197n() {
        ffc0 ffc0Var = f176969m;
        if (ffc0Var == null) {
            return -1;
        }
        return ffc0Var.m121134u();
    }

    /* JADX INFO: renamed from: o */
    public InterfaceC20449b m194198o() {
        return null;
    }

    /* JADX INFO: renamed from: p */
    public InterfaceC20450c m194199p() {
        return this.f176972c;
    }

    /* JADX INFO: renamed from: q */
    public InterfaceC20451d m194200q() {
        return this.f176970a;
    }

    /* JADX INFO: renamed from: r */
    public InterfaceC20452e m194201r() {
        return this.f176971b;
    }

    /* JADX INFO: renamed from: s */
    public long m194202s() {
        return this.f176976g;
    }

    /* JADX INFO: renamed from: t */
    public boolean m194203t() {
        return this.f176974e;
    }

    /* JADX INFO: renamed from: u */
    public final void m194204u() {
        m194198o();
        C4323a.m20731a().m20735e(2, null);
    }

    /* JADX INFO: renamed from: v */
    public final void m194205v(Message message) {
        if (m194199p() != null) {
            m194199p().onError(message.what, message.arg1);
        }
        Bundle bundle = new Bundle();
        bundle.putInt("what", message.what);
        bundle.putInt("arg1", message.arg1);
        C4323a.m20731a().m20735e(3, bundle);
    }

    /* JADX INFO: renamed from: w */
    public final void m194206w() {
        if (m194200q() != null) {
            m194200q().onStart();
        }
        C4323a.m20731a().m20735e(0, null);
    }

    /* JADX INFO: renamed from: x */
    public final void m194207x() {
        if (m194201r() != null) {
            m194201r().mo99331a(this.f176973d);
        }
        C4323a.m20731a().m20735e(1, null);
    }

    /* JADX INFO: renamed from: y */
    public void m194208y(boolean z) {
        this.f176981l = z;
    }

    /* JADX INFO: renamed from: z */
    public void m194209z(InterfaceC20450c interfaceC20450c) {
        this.f176972c = interfaceC20450c;
    }
}
