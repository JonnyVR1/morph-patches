package p153l;

import android.media.MediaMetadataRetriever;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.os.SystemClock;
import com.p051p1.mobile.android.app.App;
import com.p051p1.mobile.android.media.C4474a;
import com.tantanapp.common.utils.CrashHelper;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

/* JADX INFO: loaded from: classes8.dex */
public class tnw {

    /* JADX INFO: renamed from: m */
    public static mnc0 f175322m;

    /* JADX INFO: renamed from: a */
    public InterfaceC20357d f175323a;

    /* JADX INFO: renamed from: b */
    public InterfaceC20358e f175324b;

    /* JADX INFO: renamed from: c */
    public InterfaceC20356c f175325c;

    /* JADX INFO: renamed from: d */
    public String f175326d = App.f16088e.getCacheDir() + "/0000000.mp3";

    /* JADX INFO: renamed from: e */
    public boolean f175327e = false;

    /* JADX INFO: renamed from: f */
    public boolean f175328f = false;

    /* JADX INFO: renamed from: g */
    public long f175329g = 0;

    /* JADX INFO: renamed from: h */
    public long f175330h = 0;

    /* JADX INFO: renamed from: i */
    public long f175331i = 300;

    /* JADX INFO: renamed from: j */
    public boolean f175332j;

    /* JADX INFO: renamed from: k */
    public Handler f175333k;

    /* JADX INFO: renamed from: l */
    public boolean f175334l;

    /* JADX INFO: renamed from: l.tnw$a */
    public class HandlerC20354a extends Handler {
        public HandlerC20354a() {
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
                tnw tnwVar = tnw.this;
                if (!tnwVar.f175327e) {
                    tnwVar.m191981j();
                    return;
                }
                tnwVar.m191994w();
                tnw.this.f175330h = SystemClock.uptimeMillis();
                return;
            }
            if (i != 1) {
                tnw tnwVar2 = tnw.this;
                tnwVar2.f175327e = false;
                tnwVar2.m191993v(message);
                return;
            }
            ?? r0 = 0;
            tnw.f175322m = null;
            tnw tnwVar3 = tnw.this;
            tnwVar3.f175327e = false;
            ?? r2 = tnwVar3.f175328f;
            try {
                try {
                    if (r2 != 0) {
                        tnwVar3.m191992u();
                        return;
                    }
                    try {
                        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
                        fileInputStream = new FileInputStream(tnw.this.f175326d);
                        try {
                            mediaMetadataRetriever.setDataSource(fileInputStream.getFD());
                            String strExtractMetadata = mediaMetadataRetriever.extractMetadata(9);
                            if (strExtractMetadata != null) {
                                tnw.this.f175329g = Long.valueOf(strExtractMetadata).longValue();
                            }
                            if (tnw.this.f175329g < tnw.this.f175331i) {
                                tnw.this.m191993v(message);
                                fileInputStream.close();
                            } else {
                                try {
                                    fileInputStream.close();
                                } catch (IOException e3) {
                                    CrashHelper.m82479c(e3);
                                }
                                tnw.this.m191995x();
                            }
                        } catch (IOException e4) {
                            e2 = e4;
                            CrashHelper.m82479c(e2);
                            tnw.this.f175329g = SystemClock.uptimeMillis() - tnw.this.f175330h;
                            tnw.this.m191993v(message);
                            if (fileInputStream == null) {
                                return;
                            }
                            fileInputStream.close();
                        } catch (RuntimeException e5) {
                            e = e5;
                            CrashHelper.m82479c(e);
                            tnw.this.f175329g = SystemClock.uptimeMillis() - tnw.this.f175330h;
                            tnw.this.m191993v(message);
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
                                CrashHelper.m82479c(e8);
                            }
                        }
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    r0 = r2;
                }
            } catch (IOException e9) {
                CrashHelper.m82479c(e9);
            }
        }
    }

    /* JADX INFO: renamed from: l.tnw$b */
    public interface InterfaceC20355b {
    }

    /* JADX INFO: renamed from: l.tnw$c */
    public interface InterfaceC20356c {
        void onError(int i, int i2);
    }

    /* JADX INFO: renamed from: l.tnw$d */
    public interface InterfaceC20357d {
        void onStart();
    }

    /* JADX INFO: renamed from: l.tnw$e */
    public interface InterfaceC20358e {
        /* JADX INFO: renamed from: a */
        void mo99477a(String str);
    }

    /* JADX INFO: renamed from: A */
    public void m191977A(InterfaceC20357d interfaceC20357d) {
        this.f175323a = interfaceC20357d;
    }

    /* JADX INFO: renamed from: B */
    public void m191978B(InterfaceC20358e interfaceC20358e) {
        this.f175324b = interfaceC20358e;
    }

    /* JADX INFO: renamed from: C */
    public void m191979C(int i) {
        if (!this.f175332j) {
            m191983l();
        }
        m191982k();
        f175322m.m159155y(i);
        this.f175328f = false;
        this.f175327e = true;
        this.f175329g = 0L;
    }

    /* JADX INFO: renamed from: D */
    public void m191980D() {
        mnc0 mnc0Var = f175322m;
        if (mnc0Var != null) {
            mnc0Var.m159149B();
        }
        Handler handler = this.f175333k;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
    }

    /* JADX INFO: renamed from: j */
    public void m191981j() {
        this.f175328f = true;
        mnc0 mnc0Var = f175322m;
        if (mnc0Var != null) {
            mnc0Var.m159149B();
        }
        Handler handler = this.f175333k;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
    }

    /* JADX INFO: renamed from: k */
    public final void m191982k() {
        if (f175322m == null) {
            mnc0 mnc0Var = new mnc0(this.f175326d, this.f175332j);
            f175322m = mnc0Var;
            mnc0Var.m159153w(this.f175334l);
            f175322m.m159154x(1);
            f175322m.m159152v(new HandlerC20354a());
        }
    }

    /* JADX INFO: renamed from: l */
    public void m191983l() {
        File file = new File(this.f175326d);
        if (file.exists()) {
            file.delete();
        }
    }

    /* JADX INFO: renamed from: m */
    public File m191984m() {
        return new File(this.f175326d);
    }

    /* JADX INFO: renamed from: n */
    public int m191985n() {
        mnc0 mnc0Var = f175322m;
        if (mnc0Var == null) {
            return -1;
        }
        return mnc0Var.m159151u();
    }

    /* JADX INFO: renamed from: o */
    public InterfaceC20355b m191986o() {
        return null;
    }

    /* JADX INFO: renamed from: p */
    public InterfaceC20356c m191987p() {
        return this.f175325c;
    }

    /* JADX INFO: renamed from: q */
    public InterfaceC20357d m191988q() {
        return this.f175323a;
    }

    /* JADX INFO: renamed from: r */
    public InterfaceC20358e m191989r() {
        return this.f175324b;
    }

    /* JADX INFO: renamed from: s */
    public long m191990s() {
        return this.f175329g;
    }

    /* JADX INFO: renamed from: t */
    public boolean m191991t() {
        return this.f175327e;
    }

    /* JADX INFO: renamed from: u */
    public final void m191992u() {
        m191986o();
        C4474a.m21730a().m21734e(2, null);
    }

    /* JADX INFO: renamed from: v */
    public final void m191993v(Message message) {
        if (m191987p() != null) {
            m191987p().onError(message.what, message.arg1);
        }
        Bundle bundle = new Bundle();
        bundle.putInt("what", message.what);
        bundle.putInt("arg1", message.arg1);
        C4474a.m21730a().m21734e(3, bundle);
    }

    /* JADX INFO: renamed from: w */
    public final void m191994w() {
        if (m191988q() != null) {
            m191988q().onStart();
        }
        C4474a.m21730a().m21734e(0, null);
    }

    /* JADX INFO: renamed from: x */
    public final void m191995x() {
        if (m191989r() != null) {
            m191989r().mo99477a(this.f175326d);
        }
        C4474a.m21730a().m21734e(1, null);
    }

    /* JADX INFO: renamed from: y */
    public void m191996y(boolean z) {
        this.f175334l = z;
    }

    /* JADX INFO: renamed from: z */
    public void m191997z(InterfaceC20356c interfaceC20356c) {
        this.f175325c = interfaceC20356c;
    }
}
