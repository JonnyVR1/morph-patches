package p007l;

import com.p003p1.mobile.android.app.App;
import com.tantanapp.common.data.ProtobufAdapter;
import com.tantanapp.common.utils.CrashHelper;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import l.n11;
import l.t95;
import org.joor.Reflect;
import rx.c;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes8.dex */
public class ggi<T> {

    /* JADX INFO: renamed from: h */
    public static File f2767h;

    /* JADX INFO: renamed from: i */
    public static int f2768i;

    /* JADX INFO: renamed from: j */
    public static int f2769j;

    /* JADX INFO: renamed from: a */
    public final String f2770a;

    /* JADX INFO: renamed from: b */
    public volatile File f2771b;

    /* JADX INFO: renamed from: c */
    public final File f2772c;

    /* JADX INFO: renamed from: d */
    public final int f2773d;

    /* JADX INFO: renamed from: e */
    public final ProtobufAdapter<T> f2774e;

    /* JADX INFO: renamed from: f */
    public volatile T f2775f;

    /* JADX INFO: renamed from: g */
    public ReentrantReadWriteLock f2776g;

    /* JADX INFO: renamed from: l.ggi$a */
    public class C0551a {

        /* JADX INFO: renamed from: a */
        public final T f2777a;

        /* JADX INFO: renamed from: b */
        public final boolean f2778b;

        public C0551a(T t, boolean z) {
            this.f2777a = t;
            this.f2778b = z;
        }
    }

    /* JADX INFO: renamed from: l.ggi$b */
    public interface InterfaceC0552b<String> {
        String getFileName();
    }

    public ggi(String str, int i, ProtobufAdapter<T> protobufAdapter) {
        this.f2776g = new ReentrantReadWriteLock();
        this.f2770a = str;
        this.f2774e = protobufAdapter;
        if (f2767h == null) {
            try {
                File file = new File(m9255f());
                f2767h = file;
                file.mkdirs();
            } catch (Exception e) {
                CrashHelper.c(new Exception("FilePersistent exception:" + e.getMessage(), e));
            }
        }
        if (f2767h == null) {
            this.f2771b = null;
            this.f2772c = null;
            this.f2773d = 1;
            return;
        }
        this.f2771b = new File(f2767h, str);
        this.f2772c = new File(f2767h, str + "_temp");
        this.f2773d = i;
    }

    /* JADX INFO: renamed from: d */
    public static void m9254d() {
        try {
            File file = new File(m9255f());
            f2767h = file;
            for (File file2 : file.listFiles()) {
                file2.delete();
            }
            f2767h.delete();
        } catch (Exception e) {
            CrashHelper.c(e);
        }
    }

    /* JADX INFO: renamed from: f */
    public static String m9255f() {
        return App.f1068e.getFilesDir().getAbsolutePath() + "/file_persistent/";
    }

    /* JADX INFO: renamed from: b */
    public T m9256b() {
        m9262j(this.f2770a + " read cache begin");
        try {
            try {
                this.f2776g.readLock().lock();
                if (this.f2775f == null && this.f2771b != null && this.f2771b.exists() && this.f2771b.length() > 0 && this.f2775f == null && this.f2771b != null && this.f2771b.exists() && this.f2771b.length() > 0) {
                    this.f2775f = mo9258e(new FileInputStream(this.f2771b));
                }
            } catch (IOException e) {
                CrashHelper.c(e);
            }
            this.f2776g.readLock().unlock();
            m9262j(this.f2770a + " read cache end");
            return this.f2775f;
        } catch (Throwable th) {
            this.f2776g.readLock().unlock();
            throw th;
        }
    }

    /* JADX INFO: renamed from: c */
    public synchronized void m9257c() {
        ReentrantReadWriteLock reentrantReadWriteLock;
        try {
            try {
                this.f2776g.writeLock().lock();
                this.f2775f = null;
                if (this.f2771b != null) {
                    this.f2771b.delete();
                }
                reentrantReadWriteLock = this.f2776g;
            } catch (Exception e) {
                CrashHelper.c(new Exception("FilePersistent clear exception:" + e.getMessage(), e));
                reentrantReadWriteLock = this.f2776g;
            }
            reentrantReadWriteLock.writeLock().unlock();
        } catch (Throwable th) {
            this.f2776g.writeLock().unlock();
            throw th;
        }
    }

    /* JADX INFO: renamed from: e */
    public T mo9258e(FileInputStream fileInputStream) throws IOException {
        return (T) this.f2774e.get(m9265m(fileInputStream));
    }

    /* JADX INFO: renamed from: g */
    public final String m9259g(File file) {
        try {
            Object obj = Reflect.on(file).call("isInvalid").get();
            return obj != null ? obj.toString() : "null invoke";
        } catch (Exception e) {
            return "get status error:" + e;
        }
    }

    /* JADX INFO: renamed from: h */
    public final String m9260h(File file, File file2) {
        StringBuilder sb = new StringBuilder();
        try {
            sb.append("new: ");
            if (file == null) {
                sb.append("null file");
            } else {
                sb.append(" exists = " + file.exists());
                sb.append(" path = " + file.getAbsolutePath());
                sb.append(" invalid: ");
                sb.append(m9259g(file));
            }
            sb.append("old: ");
            if (file2 == null) {
                sb.append("null file");
            } else {
                sb.append(" exists = " + file2.exists());
                sb.append(" path = " + file2.getAbsolutePath());
                sb.append(" invalid: ");
                sb.append(m9259g(file2));
            }
            sb.append(" dir:");
            if (f2767h == null) {
                sb.append(" null ");
            } else {
                sb.append(" exists = ");
                sb.append(f2767h.exists());
            }
        } catch (Exception e) {
            sb.append("get log error: " + e);
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ C0551a m9261i() throws Exception {
        n11.f();
        m9262j(this.f2770a + " read Data begin");
        ggi<T>.C0551a c0551aM9266n = m9266n();
        m9262j(this.f2770a + " read Data end");
        return c0551aM9266n;
    }

    /* JADX INFO: renamed from: k */
    public c<ggi<T>.C0551a> m9263k() {
        return c.fromCallable(new Callable() { // from class: l.fgi
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f2687a.m9261i();
            }
        });
    }

    /* JADX INFO: renamed from: l */
    public OutputStream m9264l() {
        if (this.f2772c == null) {
            return null;
        }
        try {
            f2769j++;
            return new FileOutputStream(this.f2772c);
        } catch (FileNotFoundException e) {
            CrashHelper.c(e);
            return null;
        }
    }

    /* JADX INFO: renamed from: m */
    public byte[] m9265m(InputStream inputStream) throws Throwable {
        ByteArrayOutputStream byteArrayOutputStream = null;
        try {
            byte[] bArr = new byte[4096];
            ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
            while (true) {
                try {
                    int i = inputStream.read(bArr);
                    if (i != -1) {
                        byteArrayOutputStream2.write(bArr, 0, i);
                    } else {
                        try {
                            break;
                        } catch (IOException e) {
                            CrashHelper.c(e);
                        }
                    }
                } catch (Throwable th) {
                    th = th;
                    byteArrayOutputStream = byteArrayOutputStream2;
                    if (byteArrayOutputStream != null) {
                        try {
                            byteArrayOutputStream.close();
                        } catch (IOException e2) {
                            CrashHelper.c(e2);
                        }
                    }
                    if (inputStream == null) {
                        throw th;
                    }
                    try {
                        inputStream.close();
                        throw th;
                    } catch (IOException e3) {
                        CrashHelper.c(e3);
                        throw th;
                    }
                }
            }
            byteArrayOutputStream2.close();
            try {
                inputStream.close();
            } catch (IOException e4) {
                CrashHelper.c(e4);
            }
            return byteArrayOutputStream2.toByteArray();
        } catch (Throwable th2) {
            th = th2;
        }
    }

    /* JADX INFO: renamed from: n */
    public ggi<T>.C0551a m9266n() {
        ggi<T>.C0551a c0551a = null;
        try {
            try {
                this.f2776g.readLock().lock();
                if (this.f2771b != null && this.f2771b.exists()) {
                    boolean z = this.f2771b.lastModified() >= System.currentTimeMillis() - TimeUnit.MILLISECONDS.convert((long) this.f2773d, TimeUnit.DAYS) || this.f2773d == -1;
                    FileInputStream fileInputStream = new FileInputStream(this.f2771b);
                    f2768i++;
                    T tMo9258e = mo9258e(fileInputStream);
                    if (tMo9258e != null) {
                        this.f2775f = tMo9258e;
                        c0551a = new C0551a(tMo9258e, z);
                    }
                }
            } catch (Exception e) {
                CrashHelper.c(e);
            }
            return c0551a;
        } finally {
            this.f2776g.readLock().unlock();
        }
    }

    /* JADX INFO: Removed unreachable split cross block B:21:0x00a2 */
    /* JADX INFO: renamed from: o */
    public final void m9267o(File file, File file2) {
        this.f2776g.writeLock().lock();
        try {
            if (file != null) {
                try {
                    if (file.renameTo(file2)) {
                        this.f2771b = new File(f2767h, this.f2770a);
                        m9262j("文件覆盖成功" + this.f2770a);
                    } else {
                        String strM9260h = m9260h(file, file2);
                        CrashHelper.c(new RuntimeException("文件覆盖失败：" + this.f2770a + " detail: " + strM9260h));
                        StringBuilder sb = new StringBuilder("文件覆盖成失败");
                        sb.append(this.f2770a);
                        sb.append(strM9260h);
                        m9262j(sb.toString());
                    }
                } catch (Exception e) {
                    CrashHelper.c(new RuntimeException("文件覆盖异常" + this.f2770a + " detail: " + m9260h(file, file2), e));
                    StringBuilder sb2 = new StringBuilder("文件覆盖异常");
                    sb2.append(this.f2770a);
                    m9262j(sb2.toString());
                }
            }
        } finally {
            this.f2776g.writeLock().unlock();
        }
    }

    /* JADX INFO: renamed from: p */
    public void m9268p(T t) {
        m9262j(this.f2770a + " write begin start");
        synchronized (this) {
            OutputStream outputStreamM9264l = m9264l();
            m9262j(this.f2770a + " write begin run");
            try {
                try {
                    this.f2775f = t;
                    outputStreamM9264l.write(mo9269q(t));
                    outputStreamM9264l.flush();
                    m9267o(this.f2772c, this.f2771b);
                } catch (IOException e) {
                    CrashHelper.c(e);
                }
                t95.b(outputStreamM9264l);
            } catch (Throwable th) {
                t95.b(outputStreamM9264l);
                throw th;
            }
        }
        m9262j(this.f2770a + " write end");
    }

    /* JADX INFO: renamed from: q */
    public byte[] mo9269q(T t) throws IOException {
        return this.f2774e.serialize(t);
    }

    /* JADX INFO: renamed from: j */
    public final void m9262j(String str) {
    }

    public ggi(InterfaceC0552b<String> interfaceC0552b, int i, ProtobufAdapter<T> protobufAdapter) {
        this(interfaceC0552b.getFileName(), i, protobufAdapter);
    }
}
