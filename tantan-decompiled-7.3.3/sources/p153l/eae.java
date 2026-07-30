package p153l;

import com.immomo.mmdns.DNSManager;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes7.dex */
public class eae {

    /* JADX INFO: renamed from: d */
    private static eae f92768d;

    /* JADX INFO: renamed from: b */
    private Set<String> f92770b = new HashSet();

    /* JADX INFO: renamed from: c */
    private final Object f92771c = new Object();

    /* JADX INFO: renamed from: a */
    private final rg50 f92769a = new rg50.C19837b().m181372j(x1c.m209015a()).m181363a(new C16744c(3)).m181365c();

    /* JADX INFO: renamed from: l.eae$a */
    public class C16742a implements w84 {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ InterfaceC16743b f92772a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ String f92773b;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ String f92774c;

        public C16742a(InterfaceC16743b interfaceC16743b, String str, String str2) {
            this.f92772a = interfaceC16743b;
            this.f92773b = str;
            this.f92774c = str2;
        }

        @Override // p153l.w84
        public void onFailure(ry3 ry3Var, IOException iOException) {
            InterfaceC16743b interfaceC16743b = this.f92772a;
            StringBuilder sb = new StringBuilder("onFailure，error:");
            sb.append(iOException == null ? "null" : iOException.getLocalizedMessage());
            interfaceC16743b.mo120045a(sb.toString());
            synchronized (eae.this.f92771c) {
                eae.this.f92770b.remove(this.f92773b);
            }
            try {
                String strM182286m = ry3Var.request().m209026k().m182286m();
                ne00.m162805a("OkhttpDownload", 11, "url failed: " + this.f92773b + " useDns: " + DNSManager.getInstance("8701b0b5e66f551562c78781b1dc66c3").useDNS(strM182286m) + " ip: " + DNSManager.getInstance("8701b0b5e66f551562c78781b1dc66c3").getUsableHost(strM182286m));
            } catch (Exception unused) {
            }
        }

        /* JADX WARN: Code duplicated, block: B:66:0x00ef A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:72:0x00ea A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:80:0x00dc A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:93:? A[SYNTHETIC] */
        @Override // p153l.w84
        public void onResponse(ry3 ry3Var, i5d0 i5d0Var) throws Throwable {
            FileOutputStream fileOutputStream;
            byte[] bArr = new byte[2048];
            InputStream inputStream = null;
            try {
                InputStream inputStreamByteStream = i5d0Var.m138670k().byteStream();
                try {
                    long jContentLength = i5d0Var.m138670k().contentLength();
                    File file = new File(this.f92774c + "_tmp");
                    fileOutputStream = new FileOutputStream(file);
                    long j = 0;
                    while (true) {
                        try {
                            int i = inputStreamByteStream.read(bArr);
                            if (i == -1) {
                                break;
                            }
                            fileOutputStream.write(bArr, 0, i);
                            j += (long) i;
                            this.f92772a.onDownloading((int) (((j * 1.0f) / jContentLength) * 100.0f));
                        } catch (Exception e) {
                            e = e;
                            inputStream = inputStreamByteStream;
                            try {
                                this.f92772a.mo120045a("onResponse ,error:" + e.getLocalizedMessage());
                                synchronized (eae.this.f92771c) {
                                    eae.this.f92770b.remove(this.f92773b);
                                }
                                if (inputStream != null) {
                                    try {
                                        inputStream.close();
                                    } catch (IOException unused) {
                                    }
                                }
                                if (fileOutputStream == null) {
                                    return;
                                }
                            } catch (Throwable th) {
                                th = th;
                                synchronized (eae.this.f92771c) {
                                    eae.this.f92770b.remove(this.f92773b);
                                }
                                if (inputStream != null) {
                                    try {
                                        inputStream.close();
                                    } catch (IOException unused2) {
                                    }
                                }
                                if (fileOutputStream != null) {
                                    throw th;
                                }
                                try {
                                    fileOutputStream.close();
                                    throw th;
                                } catch (IOException unused3) {
                                    throw th;
                                }
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            inputStream = inputStreamByteStream;
                            synchronized (eae.this.f92771c) {
                                eae.this.f92770b.remove(this.f92773b);
                                if (inputStream != null) {
                                    inputStream.close();
                                }
                                if (fileOutputStream != null) {
                                    throw th;
                                }
                                fileOutputStream.close();
                                throw th;
                            }
                        }
                    }
                    fileOutputStream.flush();
                    File file2 = new File(this.f92774c);
                    if (file2.exists()) {
                        file2.delete();
                    }
                    file.renameTo(file2);
                    this.f92772a.mo120046b();
                    synchronized (eae.this.f92771c) {
                        eae.this.f92770b.remove(this.f92773b);
                    }
                    try {
                        inputStreamByteStream.close();
                    } catch (IOException unused4) {
                    }
                } catch (Exception e2) {
                    e = e2;
                    fileOutputStream = null;
                } catch (Throwable th3) {
                    th = th3;
                    fileOutputStream = null;
                }
            } catch (Exception e3) {
                e = e3;
                fileOutputStream = null;
            } catch (Throwable th4) {
                th = th4;
                fileOutputStream = null;
            }
            try {
                fileOutputStream.close();
            } catch (IOException unused5) {
            }
        }
    }

    /* JADX INFO: renamed from: l.eae$b */
    public interface InterfaceC16743b {
        /* JADX INFO: renamed from: a */
        void mo120045a(String str);

        /* JADX INFO: renamed from: b */
        void mo120046b();

        void onDownloading(int i);
    }

    /* JADX INFO: renamed from: l.eae$c */
    public static class C16744c implements azm {

        /* JADX INFO: renamed from: a */
        public int f92776a;

        /* JADX INFO: renamed from: b */
        private int f92777b = 0;

        public C16744c(int i) {
            this.f92776a = i;
        }

        @Override // p153l.azm
        public i5d0 intercept(azm.InterfaceC15867a interfaceC15867a) throws IOException {
            x1d0 x1d0VarRequest = interfaceC15867a.request();
            i5d0 i5d0VarMo101076a = interfaceC15867a.mo101076a(x1d0VarRequest);
            while (!i5d0VarMo101076a.m138661I() && this.f92777b < this.f92776a) {
                i5d0VarMo101076a.close();
                this.f92777b++;
                i5d0VarMo101076a = interfaceC15867a.mo101076a(x1d0VarRequest);
            }
            return i5d0VarMo101076a;
        }
    }

    private eae() {
    }

    /* JADX INFO: renamed from: d */
    public static eae m120043d() {
        if (f92768d == null) {
            f92768d = new eae();
        }
        return f92768d;
    }

    /* JADX INFO: renamed from: c */
    public void m120044c(String str, String str2, InterfaceC16743b interfaceC16743b) {
        synchronized (this.f92771c) {
            this.f92770b.add(str);
        }
        this.f92769a.mo181341a(new x1d0.C21228a().m209043q(str).m209028b()).mo135840h(new C16742a(interfaceC16743b, str, str2));
    }
}
