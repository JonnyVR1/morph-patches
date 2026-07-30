package p149l;

import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import com.fasterxml.jackson.core.util.MinimalPrettyPrinter;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.immomo.downloader.DownloadManager;
import com.immomo.mmutil.FileUtil;
import com.immomo.mmutil.log.Log4Android;
import com.immomo.mmutil.task.C3804c;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.InetAddress;
import java.net.URL;
import org.eclipse.jetty.http.HttpHeaderValues;
import org.eclipse.jetty.http.HttpHeaders;

/* JADX INFO: loaded from: classes7.dex */
public class t8e {

    /* JADX INFO: renamed from: b */
    private q8e f168892b;

    /* JADX INFO: renamed from: c */
    private s8e[] f168893c;

    /* JADX INFO: renamed from: e */
    private Handler f168895e;

    /* JADX INFO: renamed from: h */
    private String f168898h;

    /* JADX INFO: renamed from: i */
    private String f168899i;

    /* JADX INFO: renamed from: a */
    private final int f168891a = 3;

    /* JADX INFO: renamed from: f */
    private long f168896f = 0;

    /* JADX INFO: renamed from: g */
    private long f168897g = 0;

    /* JADX INFO: renamed from: d */
    private C20129d f168894d = new C20129d();

    /* JADX INFO: renamed from: l.t8e$a */
    public class RunnableC20126a implements Runnable {
        public RunnableC20126a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            jxc0 jxc0VarM187538r;
            if (!t8e.this.m187534n()) {
                DownloadManager.m18309s().m18418a(t8e.this + " -- toggle false");
                return;
            }
            if (t8e.this.f168892b.f153159B) {
                q8e q8eVar = (q8e) w8e.m202156d().m202159c(t8e.this.f168892b.f153161a, q8e.class);
                if (q8eVar == null) {
                    w8e.m202156d().m202161f(t8e.this.f168892b);
                } else {
                    if (!x7e.m207291g(q8eVar)) {
                        q8eVar.f153173m = t8e.this.f168892b.f153173m;
                    }
                    t8e.this.f168892b.m173370B(q8eVar);
                }
            }
            DownloadManager.m18309s().m18418a("Downloader START:");
            t8e.this.m187544y(2, 1);
            t8e t8eVar = t8e.this;
            t8eVar.f168896f = t8eVar.f168892b.f153173m;
            int i = 0;
            if (t8e.this.f168892b.f153169i != 0) {
                if (t8e.this.f168892b.f153174n <= 0 && (jxc0VarM187538r = t8e.this.m187538r()) != null) {
                    i = -jxc0VarM187538r.m143771f();
                    jxc0VarM187538r.m143766a();
                }
                long j = t8e.this.f168892b.f153174n;
                t8e t8eVar2 = t8e.this;
                if (j <= 0) {
                    if (i == 0) {
                        i = -8;
                    }
                    t8eVar2.m187544y(2, i);
                    return;
                } else {
                    int i2 = t8eVar2.f168892b.f153169i;
                    t8e t8eVar3 = t8e.this;
                    if (i2 == 1) {
                        t8eVar3.m187542v(1);
                        return;
                    } else {
                        t8eVar3.m187542v(3);
                        return;
                    }
                }
            }
            while (i < t8e.this.f168892b.f153162b.length) {
                if (!t8e.this.m187534n()) {
                    DownloadManager.m18309s().m18423g(t8e.this + " -- toggle false");
                    return;
                }
                q8e q8eVar2 = t8e.this.f168892b;
                t8e t8eVar4 = t8e.this;
                q8eVar2.f153163c = t8eVar4.m187521A(t8eVar4.f168892b.f153162b, t8e.this.f168892b.f153163c);
                boolean zIsEmpty = TextUtils.isEmpty(t8e.this.f168892b.f153163c);
                t8e t8eVar5 = t8e.this;
                if (zIsEmpty) {
                    t8eVar5.m187544y(2, -6);
                    return;
                }
                boolean zM187535o = t8eVar5.m187535o();
                if (zM187535o) {
                    t8e.this.f168897g = System.currentTimeMillis();
                    return;
                } else if (!zM187535o && i == t8e.this.f168892b.f153162b.length - 1) {
                    t8e.this.m187544y(2, -4);
                    return;
                } else {
                    DownloadManager.m18309s().m18418a("地址错误，切换到下一个");
                    i++;
                }
            }
        }
    }

    /* JADX INFO: renamed from: l.t8e$b */
    public class C20127b implements InterfaceC20128c {
        public C20127b() {
        }

        @Override // p149l.t8e.InterfaceC20128c
        /* JADX INFO: renamed from: a */
        public void mo187548a(int i, b8e b8eVar) {
            t8e.this.f168892b.f153185y = t8e.this.f168898h;
            t8e.this.f168892b.f153186z = b8eVar.f74105i;
            t8e.this.f168892b.f153158A = b8eVar.f74104h;
            t8e.this.m187537q(i, b8eVar);
        }
    }

    /* JADX INFO: renamed from: l.t8e$c */
    public interface InterfaceC20128c {
        /* JADX INFO: renamed from: a */
        void mo187548a(int i, b8e b8eVar);
    }

    /* JADX INFO: renamed from: l.t8e$d */
    public class C20129d {

        /* JADX INFO: renamed from: a */
        public boolean f168902a = true;

        /* JADX INFO: renamed from: b */
        public boolean f168903b = true;

        public C20129d() {
        }
    }

    public t8e(q8e q8eVar, Handler handler) {
        this.f168892b = q8eVar;
        this.f168895e = handler;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: A */
    public String m187521A(String[] strArr, String str) {
        if (strArr == null || strArr.length == 0) {
            return str;
        }
        if (TextUtils.isEmpty(str)) {
            return strArr[0];
        }
        for (int i = 0; i < strArr.length; i++) {
            if (str.equals(strArr[i])) {
                int i2 = i + 1;
                return i2 < strArr.length ? strArr[i2] : strArr[0];
            }
        }
        return strArr[0];
    }

    /* JADX INFO: renamed from: m */
    private boolean m187533m(jxc0 jxc0Var) {
        InputStream inputStreamM143770e = null;
        try {
            if (jxc0Var.m143771f() == 200) {
                inputStreamM143770e = jxc0Var.m143770e();
                q8e q8eVar = this.f168892b;
                int i = q8eVar.f153176p;
                byte[] bArr = new byte[i];
                inputStreamM143770e.read(bArr, q8eVar.f153175o, i);
                String strM130617b = he2.m130617b(bArr);
                DownloadManager.m18309s().m18418a("checkCode --- " + strM130617b);
                if (strM130617b.equals(this.f168892b.f153167g)) {
                    try {
                        inputStreamM143770e.close();
                    } catch (IOException unused) {
                    }
                    jxc0Var.m143766a();
                    return true;
                }
            }
            if (inputStreamM143770e != null) {
                try {
                    inputStreamM143770e.close();
                } catch (IOException unused2) {
                }
            }
        } catch (Exception unused3) {
            if (inputStreamM143770e != null) {
                try {
                    inputStreamM143770e.close();
                } catch (IOException unused4) {
                }
            }
            if (jxc0Var == null) {
                return false;
            }
        } catch (Throwable th) {
            if (inputStreamM143770e != null) {
                try {
                    inputStreamM143770e.close();
                } catch (IOException unused5) {
                }
            }
            if (jxc0Var == null) {
                throw th;
            }
            jxc0Var.m143766a();
            throw th;
        }
        jxc0Var.m143766a();
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n */
    public boolean m187534n() {
        C20129d c20129d = this.f168894d;
        return c20129d.f168902a && c20129d.f168903b;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o */
    public boolean m187535o() {
        jxc0 jxc0VarM187538r = m187538r();
        if (jxc0VarM187538r != null && this.f168892b.f153174n > 0) {
            URL urlM143772g = jxc0VarM187538r.m143772g();
            if (urlM143772g != null) {
                try {
                    this.f168898h = urlM143772g.toString();
                    this.f168899i = InetAddress.getByName(urlM143772g.getHost()).getHostAddress();
                } catch (Exception unused) {
                }
            }
            if (!m187534n()) {
                DownloadManager.m18309s().m18418a(this + " -- toggle false");
                return true;
            }
            if (m187533m(jxc0VarM187538r)) {
                this.f168892b.f153177q = System.currentTimeMillis();
                return m187542v(3);
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: p */
    private boolean m187536p() throws Throwable {
        try {
            File fileM207287c = x7e.m207287c(this.f168892b);
            if (fileM207287c.exists()) {
                fileM207287c.delete();
            }
            if (!x7e.m207292h(x7e.m207289e(this.f168892b), fileM207287c)) {
                m187544y(2, -7);
                return false;
            }
            if (this.f168892b.f153169i != 0) {
                m187544y(2, 3);
                return true;
            }
            if (this.f168892b.f153168h.equalsIgnoreCase(nv00.m161528e(fileM207287c))) {
                m187544y(2, 3);
                return true;
            }
            fileM207287c.delete();
            m187544y(2, -5);
            return false;
        } catch (Exception e) {
            Log4Android.m18417f().m18422e(e);
            m187544y(2, -1);
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q */
    public synchronized void m187537q(int i, b8e b8eVar) {
        q8e q8eVar;
        try {
            C20129d c20129d = this.f168894d;
            if (c20129d.f168902a) {
                int i2 = 0;
                if (i < 0) {
                    c20129d.f168902a = false;
                    m187544y(2, i);
                    DownloadManager.m18309s().m18418a(Thread.currentThread().getName() + " Downloader FAILED:");
                } else if (i == 2) {
                    long j = 0;
                    while (true) {
                        q8eVar = this.f168892b;
                        b8e[] b8eVarArr = q8eVar.f153178r;
                        if (i2 >= b8eVarArr.length) {
                            break;
                        }
                        b8e b8eVar2 = b8eVarArr[i2];
                        j += b8eVar2.f74100d - b8eVar2.f74099c;
                        i2++;
                    }
                    q8eVar.f153173m = j;
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    long j2 = jCurrentTimeMillis - this.f168897g;
                    if (j2 > 1500) {
                        if (this.f168892b.f153159B) {
                            try {
                                w8e.m202156d().m202162g(this.f168892b);
                            } catch (Exception unused) {
                            }
                        }
                        this.f168892b.f153180t = ((j - this.f168896f) * 1000) / j2;
                        this.f168897g = jCurrentTimeMillis;
                        this.f168896f = j;
                        DownloadManager.m18309s().m18418a("Downloader PROCESS speed:" + this.f168892b.f153180t + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR + j + "/" + this.f168892b.f153174n);
                    }
                    m187544y(2, i);
                } else if (i == 3) {
                    DownloadManager.m18309s().m18418a(Thread.currentThread().getName() + " Downloader FINISH");
                    if (m187539s()) {
                        q8e q8eVar2 = this.f168892b;
                        q8eVar2.f153173m = q8eVar2.f153174n;
                        q8eVar2.f153180t = FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
                        q8eVar2.f153172l = x7e.m207288d(q8eVar2);
                        this.f168892b.f153183w = System.currentTimeMillis();
                        if (this.f168892b.f153159B) {
                            w8e.m202156d().m202162g(this.f168892b);
                        }
                        DownloadManager.m18309s().m18418a("Downloader FINISH ALL");
                        if (m187536p()) {
                            DownloadManager.m18309s().m18418a("Downloader FILE MD5 CHECK SUCCESS");
                        } else {
                            x7e.m207286b(this.f168892b);
                            if (this.f168892b.f153159B) {
                                w8e.m202156d().m202158b(this.f168892b);
                            }
                            DownloadManager.m18309s().m18418a("Downloader FILE MD5 CHECK FAILED");
                        }
                    }
                } else if (i == 4) {
                    if (b8eVar != null) {
                        DownloadManager.m18309s().m18418a(Thread.currentThread().getName() + " Downloader PAUSE from:" + b8eVar.f74099c + " now:" + b8eVar.f74100d + " to:" + b8eVar.f74101e);
                    }
                    m187544y(2, i);
                    this.f168894d.f168902a = false;
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r */
    public jxc0 m187538r() {
        jxc0 jxc0VarM175490c;
        q8e q8eVar = this.f168892b;
        int i = q8eVar.f153169i;
        if (i == 0) {
            jxc0VarM175490c = qll.m175490c(q8eVar.f153163c, -1L, -1L);
        } else if (i == 1) {
            jxc0VarM175490c = qll.m175491d(q8eVar.f153163c, -1L, -1L, q8eVar.f153160C);
        } else {
            jxc0VarM175490c = (i == 2 || i == 3) ? qll.m175490c(q8eVar.f153163c, -1L, -1L) : null;
        }
        if (jxc0VarM175490c == null) {
            return null;
        }
        int iM143767b = (int) jxc0VarM175490c.m143767b();
        if (iM143767b == -1 && m187540t(jxc0VarM175490c)) {
            iM143767b = jxc0VarM175490c.m143769d("Accept-Length", -1);
        }
        this.f168892b.f153174n = (iM143767b == -1 && m187541u(jxc0VarM175490c)) ? 1 : iM143767b;
        return jxc0VarM175490c;
    }

    /* JADX INFO: renamed from: s */
    private boolean m187539s() {
        b8e[] b8eVarArr = this.f168892b.f153178r;
        if (b8eVarArr == null) {
            return false;
        }
        for (b8e b8eVar : b8eVarArr) {
            long j = b8eVar.f74100d;
            long j2 = b8eVar.f74101e;
            if (j <= j2 || j2 <= 0) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: t */
    private boolean m187540t(jxc0 jxc0Var) {
        return HttpHeaderValues.CHUNKED.equalsIgnoreCase(jxc0Var.m143768c(HttpHeaders.TRANSFER_ENCODING));
    }

    /* JADX INFO: renamed from: u */
    private boolean m187541u(jxc0 jxc0Var) {
        if (this.f168892b.f153169i != 3) {
            return false;
        }
        int iM143771f = jxc0Var.m143771f();
        return iM143771f == 200 || iM143771f == 206;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v */
    public boolean m187542v(int i) {
        t8e t8eVar;
        int i2;
        DownloadManager.m18309s().m18418a(this + " -- check success");
        File fileM207289e = x7e.m207289e(this.f168892b);
        q8e q8eVar = this.f168892b;
        b8e[] b8eVarArr = q8eVar.f153178r;
        if (b8eVarArr != null) {
            boolean z = i == b8eVarArr.length;
            if (FileUtil.m18408e(fileM207289e) && this.f168892b.f153169i != 1 && z) {
                t8eVar = this;
                i2 = i;
            } else {
                q8e q8eVar2 = this.f168892b;
                t8eVar = this;
                i2 = i;
                q8eVar2.f153178r = t8eVar.m187543x(q8eVar2.f153163c, q8eVar2.f153174n, i2, q8eVar2.f153160C);
            }
        } else {
            t8eVar = this;
            i2 = i;
            q8eVar.f153178r = t8eVar.m187543x(q8eVar.f153163c, q8eVar.f153174n, i2, q8eVar.f153160C);
        }
        if (t8eVar.m187539s()) {
            File fileM207287c = x7e.m207287c(t8eVar.f168892b);
            File fileM207289e2 = x7e.m207289e(t8eVar.f168892b);
            if (FileUtil.m18408e(fileM207289e2) && fileM207289e2.renameTo(fileM207287c)) {
                t8eVar.m187537q(3, null);
                return true;
            }
            fileM207289e2.delete();
            q8e q8eVar3 = t8eVar.f168892b;
            q8eVar3.f153178r = t8eVar.m187543x(q8eVar3.f153163c, q8eVar3.f153174n, i2, q8eVar3.f153160C);
        }
        t8eVar.f168893c = new s8e[t8eVar.f168892b.f153178r.length];
        int i3 = 0;
        while (true) {
            b8e[] b8eVarArr2 = t8eVar.f168892b.f153178r;
            if (i3 >= b8eVarArr2.length) {
                return true;
            }
            b8e b8eVar = b8eVarArr2[i3];
            long j = b8eVar.f74100d;
            long j2 = b8eVar.f74101e;
            if ((j <= j2 && j2 > 0) || j2 <= 0) {
                q8e q8eVar4 = t8eVar.f168892b;
                s8e s8eVar = new s8e(q8eVar4.f153178r[i3], fileM207289e, t8eVar.f168894d, q8eVar4.f153169i, t8eVar.new C20127b());
                t8eVar.f168893c[i3] = s8eVar;
                s8eVar.start();
            }
            i3++;
        }
    }

    /* JADX INFO: renamed from: x */
    private b8e[] m187543x(String str, long j, int i, boolean z) {
        b8e[] b8eVarArr = new b8e[i];
        for (int i2 = 0; i2 < i; i2++) {
            long j2 = j / ((long) i);
            b8e b8eVar = new b8e();
            b8eVar.f74098b = i2;
            b8eVar.f74097a = str;
            long j3 = ((long) i2) * j2;
            b8eVar.f74099c = j3;
            b8eVar.f74100d = j3;
            b8eVar.f74102f = z;
            if (i2 == i - 1) {
                b8eVar.f74101e = j - 1;
            } else {
                b8eVar.f74101e = (((long) (i2 + 1)) * j2) - 1;
            }
            b8eVarArr[i2] = b8eVar;
        }
        return b8eVarArr;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y */
    public void m187544y(int i, int i2) {
        if (this.f168895e != null) {
            if (i2 < 0) {
                if (TextUtils.isEmpty(this.f168892b.f153158A)) {
                    this.f168892b.f153158A = this.f168899i;
                }
                if (TextUtils.isEmpty(this.f168892b.f153185y)) {
                    this.f168892b.f153185y = this.f168898h;
                }
            }
            Message messageObtainMessage = this.f168895e.obtainMessage(i);
            messageObtainMessage.obj = this.f168892b;
            messageObtainMessage.arg1 = i2;
            this.f168895e.sendMessage(messageObtainMessage);
        }
    }

    /* JADX INFO: renamed from: l */
    public void m187545l(boolean z) {
        m187546w(1);
        if (z) {
            x7e.m207286b(this.f168892b);
            if (this.f168892b.f153159B) {
                w8e.m202156d().m202158b(this.f168892b);
            }
        }
        m187544y(2, 5);
    }

    /* JADX INFO: renamed from: w */
    public void m187546w(int i) {
        if (i == 1) {
            this.f168894d.f168902a = false;
        } else if (i == 2) {
            this.f168894d.f168903b = false;
        }
    }

    /* JADX INFO: renamed from: z */
    public void m187547z() {
        if (m187534n()) {
            C3804c.m18444d(2, new RunnableC20126a());
            return;
        }
        DownloadManager.m18309s().m18418a(this + " -- toggle false");
    }
}
