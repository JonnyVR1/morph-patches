package p149l;

import com.immomo.mmdns.DNSManager;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes7.dex */
public class v8e {

    /* JADX INFO: renamed from: d */
    private static v8e f180468d;

    /* JADX INFO: renamed from: b */
    private Set<String> f180470b = new HashSet();

    /* JADX INFO: renamed from: c */
    private final Object f180471c = new Object();

    /* JADX INFO: renamed from: a */
    private final k850 f180469a = new k850.C17954b().m144889j(k0c.m144028a()).m144880a(new C20598c(3)).m144882c();

    /* JADX INFO: renamed from: l.v8e$a */
    public class C20596a implements x74 {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ InterfaceC20597b f180472a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ String f180473b;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ String f180474c;

        public C20596a(InterfaceC20597b interfaceC20597b, String str, String str2) {
            this.f180472a = interfaceC20597b;
            this.f180473b = str;
            this.f180474c = str2;
        }

        @Override // p149l.x74
        public void onFailure(sx3 sx3Var, IOException iOException) {
            InterfaceC20597b interfaceC20597b = this.f180472a;
            StringBuilder sb = new StringBuilder("onFailure，error:");
            sb.append(iOException == null ? "null" : iOException.getLocalizedMessage());
            interfaceC20597b.mo96315a(sb.toString());
            synchronized (v8e.this.f180471c) {
                v8e.this.f180470b.remove(this.f180473b);
            }
            try {
                String strM107522m = sx3Var.request().m185881k().m107522m();
                e600.m114939a("OkhttpDownload", 11, "url failed: " + this.f180473b + " useDns: " + DNSManager.getInstance("8701b0b5e66f551562c78781b1dc66c3").useDNS(strM107522m) + " ip: " + DNSManager.getInstance("8701b0b5e66f551562c78781b1dc66c3").getUsableHost(strM107522m));
            } catch (Exception unused) {
            }
        }

        /* JADX WARN: Code duplicated, block: B:66:0x00ef A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:72:0x00ea A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:80:0x00dc A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:93:? A[SYNTHETIC] */
        @Override // p149l.x74
        public void onResponse(sx3 sx3Var, exc0 exc0Var) throws Throwable {
            FileOutputStream fileOutputStream;
            byte[] bArr = new byte[2048];
            InputStream inputStream = null;
            try {
                InputStream inputStreamByteStream = exc0Var.m118606k().byteStream();
                try {
                    long jContentLength = exc0Var.m118606k().contentLength();
                    File file = new File(this.f180474c + "_tmp");
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
                            this.f180472a.onDownloading((int) (((j * 1.0f) / jContentLength) * 100.0f));
                        } catch (Exception e) {
                            e = e;
                            inputStream = inputStreamByteStream;
                            try {
                                this.f180472a.mo96315a("onResponse ,error:" + e.getLocalizedMessage());
                                synchronized (v8e.this.f180471c) {
                                    v8e.this.f180470b.remove(this.f180473b);
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
                                synchronized (v8e.this.f180471c) {
                                    v8e.this.f180470b.remove(this.f180473b);
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
                            synchronized (v8e.this.f180471c) {
                                v8e.this.f180470b.remove(this.f180473b);
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
                    File file2 = new File(this.f180474c);
                    if (file2.exists()) {
                        file2.delete();
                    }
                    file.renameTo(file2);
                    this.f180472a.mo96316b();
                    synchronized (v8e.this.f180471c) {
                        v8e.this.f180470b.remove(this.f180473b);
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

    /* JADX INFO: renamed from: l.v8e$b */
    public interface InterfaceC20597b {
        /* JADX INFO: renamed from: a */
        void mo96315a(String str);

        /* JADX INFO: renamed from: b */
        void mo96316b();

        void onDownloading(int i);
    }

    /* JADX INFO: renamed from: l.v8e$c */
    public static class C20598c implements axm {

        /* JADX INFO: renamed from: a */
        public int f180476a;

        /* JADX INFO: renamed from: b */
        private int f180477b = 0;

        public C20598c(int i) {
            this.f180476a = i;
        }

        @Override // p149l.axm
        public exc0 intercept(axm.InterfaceC15754a interfaceC15754a) throws IOException {
            stc0 stc0VarRequest = interfaceC15754a.request();
            exc0 exc0VarMo99454a = interfaceC15754a.mo99454a(stc0VarRequest);
            while (!exc0VarMo99454a.m118597I() && this.f180477b < this.f180476a) {
                exc0VarMo99454a.close();
                this.f180477b++;
                exc0VarMo99454a = interfaceC15754a.mo99454a(stc0VarRequest);
            }
            return exc0VarMo99454a;
        }
    }

    private v8e() {
    }

    /* JADX INFO: renamed from: d */
    public static v8e m197403d() {
        if (f180468d == null) {
            f180468d = new v8e();
        }
        return f180468d;
    }

    /* JADX INFO: renamed from: c */
    public void m197404c(String str, String str2, InterfaceC20597b interfaceC20597b) {
        synchronized (this.f180471c) {
            this.f180470b.add(str);
        }
        this.f180469a.mo144849a(new stc0.C20027a().m185898q(str).m185883b()).mo96077h(new C20596a(interfaceC20597b, str, str2));
    }
}
