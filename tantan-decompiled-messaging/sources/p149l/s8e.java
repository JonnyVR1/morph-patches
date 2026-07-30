package p149l;

import com.immomo.downloader.DownloadManager;
import com.immomo.mmutil.log.Log4Android;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.net.InetAddress;
import java.net.URL;

/* JADX INFO: loaded from: classes7.dex */
public class s8e extends Thread {

    /* JADX INFO: renamed from: a */
    private b8e f163045a;

    /* JADX INFO: renamed from: b */
    private File f163046b;

    /* JADX INFO: renamed from: c */
    private int f163047c;

    /* JADX INFO: renamed from: d */
    private t8e.InterfaceC20128c f163048d;

    /* JADX INFO: renamed from: f */
    private long f163050f;

    /* JADX INFO: renamed from: j */
    private t8e.C20129d f163054j;

    /* JADX INFO: renamed from: e */
    private final int f163049e = 200;

    /* JADX INFO: renamed from: g */
    private final int f163051g = 4096;

    /* JADX INFO: renamed from: h */
    private final int f163052h = 3;

    /* JADX INFO: renamed from: i */
    private int f163053i = 0;

    public s8e(b8e b8eVar, File file, t8e.C20129d c20129d, int i, t8e.InterfaceC20128c interfaceC20128c) {
        this.f163045a = b8eVar;
        this.f163046b = file;
        this.f163048d = interfaceC20128c;
        this.f163054j = c20129d;
        this.f163047c = i;
        setName("DownloaderThread-" + b8eVar.f74098b);
    }

    /* JADX INFO: renamed from: a */
    private boolean m182585a(jxc0 jxc0Var) {
        t8e.C20129d c20129d = this.f163054j;
        if (c20129d.f168902a && c20129d.f168903b) {
            return false;
        }
        if (jxc0Var != null) {
            try {
                jxc0Var.m143770e().close();
            } catch (IOException unused) {
            }
        }
        m182587c(4);
        return true;
    }

    /* JADX INFO: renamed from: b */
    private int m182586b() throws Throwable {
        Throwable th;
        RandomAccessFile randomAccessFile;
        int i = this.f163047c;
        b8e b8eVar = this.f163045a;
        jxc0 jxc0VarM175490c = i == 0 ? qll.m175490c(b8eVar.f74097a, b8eVar.f74100d, b8eVar.f74101e) : qll.m175491d(b8eVar.f74097a, b8eVar.f74100d, b8eVar.f74101e, b8eVar.f74102f);
        if (jxc0VarM175490c == null) {
            return -2;
        }
        int i2 = 0;
        if (m182585a(jxc0VarM175490c)) {
            return 0;
        }
        byte[] bArr = new byte[4096];
        BufferedInputStream bufferedInputStream = null;
        try {
            int iM143771f = jxc0VarM175490c.m143771f();
            URL urlM143772g = jxc0VarM175490c.m143772g();
            if (urlM143772g != null) {
                this.f163045a.f74103g = urlM143772g.toString();
                this.f163045a.f74104h = InetAddress.getByName(urlM143772g.getHost()).getHostAddress();
            }
            if (iM143771f != 200 && iM143771f != 206) {
                if (iM143771f == 416) {
                    this.f163045a.f74105i = this.f163045a.f74099c + "-" + this.f163045a.f74101e;
                }
                jxc0VarM175490c.m143766a();
                if (iM143771f > 0) {
                    iM143771f = -iM143771f;
                }
                jxc0VarM175490c.m143766a();
                try {
                    DownloadManager.m18307q().f168692c.mo165038b(0, this.f163045a.f74097a);
                    return iM143771f;
                } catch (Throwable th2) {
                    Log4Android.m18417f().m18422e(th2);
                    return iM143771f;
                }
            }
            b8e b8eVar2 = this.f163045a;
            if (b8eVar2.f74101e <= 0) {
                b8eVar2.f74101e = jxc0VarM175490c.m143767b() - 1;
            }
            BufferedInputStream bufferedInputStream2 = new BufferedInputStream(jxc0VarM175490c.m143770e());
            try {
                randomAccessFile = new RandomAccessFile(this.f163046b, "rwd");
                try {
                    randomAccessFile.seek(this.f163045a.f74100d);
                    int i3 = 0;
                    while (true) {
                        try {
                            int i4 = bufferedInputStream2.read(bArr, 0, 4096);
                            if (i4 == -1) {
                                break;
                            }
                            randomAccessFile.write(bArr, 0, i4);
                            b8e b8eVar3 = this.f163045a;
                            long j = b8eVar3.f74100d + ((long) i4);
                            b8eVar3.f74100d = j;
                            i3 += i4;
                            if (j > b8eVar3.f74101e) {
                                m182587c(3);
                                break;
                            }
                            long jCurrentTimeMillis = System.currentTimeMillis();
                            if (jCurrentTimeMillis - this.f163050f > 200) {
                                m182587c(2);
                                this.f163050f = jCurrentTimeMillis;
                            }
                            if (m182585a(jxc0VarM175490c)) {
                                try {
                                    bufferedInputStream2.close();
                                } catch (IOException unused) {
                                }
                                try {
                                    randomAccessFile.close();
                                } catch (IOException unused2) {
                                }
                                jxc0VarM175490c.m143766a();
                                try {
                                    DownloadManager.m18307q().f168692c.mo165038b(i3, this.f163045a.f74097a);
                                } catch (Throwable th3) {
                                    Log4Android.m18417f().m18422e(th3);
                                }
                                return 0;
                            }
                        } catch (IOException unused3) {
                            i2 = i3;
                            bufferedInputStream = bufferedInputStream2;
                            if (bufferedInputStream != null) {
                                try {
                                    bufferedInputStream.close();
                                } catch (IOException unused4) {
                                }
                            }
                            if (randomAccessFile != null) {
                                try {
                                    randomAccessFile.close();
                                } catch (IOException unused5) {
                                }
                            }
                            jxc0VarM175490c.m143766a();
                            try {
                                DownloadManager.m18307q().f168692c.mo165038b(i2, this.f163045a.f74097a);
                            } catch (Throwable th4) {
                                Log4Android.m18417f().m18422e(th4);
                            }
                            return -2;
                        } catch (Throwable th5) {
                            th = th5;
                            i2 = i3;
                            bufferedInputStream = bufferedInputStream2;
                            if (bufferedInputStream != null) {
                                try {
                                    bufferedInputStream.close();
                                } catch (IOException unused6) {
                                }
                            }
                            if (randomAccessFile != null) {
                                try {
                                    randomAccessFile.close();
                                } catch (IOException unused7) {
                                }
                            }
                            jxc0VarM175490c.m143766a();
                            try {
                                DownloadManager.m18307q().f168692c.mo165038b(i2, this.f163045a.f74097a);
                                throw th;
                            } catch (Throwable th6) {
                                Log4Android.m18417f().m18422e(th6);
                                throw th;
                            }
                        }
                    }
                    try {
                        bufferedInputStream2.close();
                    } catch (IOException unused8) {
                    }
                    try {
                        randomAccessFile.close();
                    } catch (IOException unused9) {
                    }
                    jxc0VarM175490c.m143766a();
                    try {
                        DownloadManager.m18307q().f168692c.mo165038b(i3, this.f163045a.f74097a);
                    } catch (Throwable th7) {
                        Log4Android.m18417f().m18422e(th7);
                    }
                    return 0;
                } catch (IOException unused10) {
                } catch (Throwable th8) {
                    th = th8;
                }
            } catch (IOException unused11) {
                randomAccessFile = null;
            } catch (Throwable th9) {
                th = th9;
                randomAccessFile = null;
            }
        } catch (IOException unused12) {
            randomAccessFile = null;
        } catch (Throwable th10) {
            th = th10;
            randomAccessFile = null;
        }
    }

    /* JADX INFO: renamed from: c */
    private void m182587c(int i) {
        t8e.InterfaceC20128c interfaceC20128c = this.f163048d;
        if (interfaceC20128c != null) {
            interfaceC20128c.mo187548a(i, this.f163045a);
        }
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() throws Throwable {
        for (int i = 0; i <= 3; i++) {
            int iM182586b = m182586b();
            if (iM182586b != 0 && this.f163053i >= 3) {
                DownloadManager.m18309s().m18418a(getName() + "下载失败，重试次数超限，发送失败消息");
                m182587c(iM182586b);
            } else {
                if (iM182586b == 0) {
                    return;
                }
                try {
                    Thread.sleep(1000L);
                } catch (InterruptedException unused) {
                }
                DownloadManager.m18309s().m18418a(getName() + "下载失败，第" + this.f163053i + "次尝试");
            }
            this.f163053i++;
        }
    }
}
