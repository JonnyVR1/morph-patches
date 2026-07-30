package p153l;

import com.p051p1.mobile.android.app.App;
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
import org.joor.Reflect;
import p137rx.C22421c;

/* JADX INFO: loaded from: classes8.dex */
public class dji<T> {

    /* JADX INFO: renamed from: h */
    public static File f88851h;

    /* JADX INFO: renamed from: i */
    public static int f88852i;

    /* JADX INFO: renamed from: j */
    public static int f88853j;

    /* JADX INFO: renamed from: a */
    public final String f88854a;

    /* JADX INFO: renamed from: b */
    public volatile File f88855b;

    /* JADX INFO: renamed from: c */
    public final File f88856c;

    /* JADX INFO: renamed from: d */
    public final int f88857d;

    /* JADX INFO: renamed from: e */
    public final ProtobufAdapter<T> f88858e;

    /* JADX INFO: renamed from: f */
    public volatile T f88859f;

    /* JADX INFO: renamed from: g */
    public ReentrantReadWriteLock f88860g;

    /* JADX INFO: renamed from: l.dji$a */
    public class C16549a {

        /* JADX INFO: renamed from: a */
        public final T f88861a;

        /* JADX INFO: renamed from: b */
        public final boolean f88862b;

        public C16549a(T t, boolean z) {
            this.f88861a = t;
            this.f88862b = z;
        }
    }

    /* JADX INFO: renamed from: l.dji$b */
    public interface InterfaceC16550b<String> {
        String getFileName();
    }

    public dji(String str, int i, ProtobufAdapter<T> protobufAdapter) {
        this.f88860g = new ReentrantReadWriteLock();
        this.f88854a = str;
        this.f88858e = protobufAdapter;
        if (f88851h == null) {
            try {
                File file = new File(m116097f());
                f88851h = file;
                file.mkdirs();
            } catch (Exception e) {
                CrashHelper.m82479c(new Exception("FilePersistent exception:" + e.getMessage(), e));
            }
        }
        if (f88851h == null) {
            this.f88855b = null;
            this.f88856c = null;
            this.f88857d = 1;
            return;
        }
        this.f88855b = new File(f88851h, str);
        this.f88856c = new File(f88851h, str + "_temp");
        this.f88857d = i;
    }

    /* JADX INFO: renamed from: d */
    public static void m116096d() {
        try {
            File file = new File(m116097f());
            f88851h = file;
            for (File file2 : file.listFiles()) {
                file2.delete();
            }
            f88851h.delete();
        } catch (Exception e) {
            CrashHelper.m82479c(e);
        }
    }

    /* JADX INFO: renamed from: f */
    public static String m116097f() {
        return App.f16088e.getFilesDir().getAbsolutePath() + "/file_persistent/";
    }

    /* JADX INFO: renamed from: b */
    public T m116098b() {
        m116104j(this.f88854a + " read cache begin");
        try {
            try {
                this.f88860g.readLock().lock();
                if (this.f88859f == null && this.f88855b != null && this.f88855b.exists() && this.f88855b.length() > 0 && this.f88859f == null && this.f88855b != null && this.f88855b.exists() && this.f88855b.length() > 0) {
                    this.f88859f = mo116100e(new FileInputStream(this.f88855b));
                }
            } catch (IOException e) {
                CrashHelper.m82479c(e);
            }
            this.f88860g.readLock().unlock();
            m116104j(this.f88854a + " read cache end");
            return this.f88859f;
        } catch (Throwable th) {
            this.f88860g.readLock().unlock();
            throw th;
        }
    }

    /* JADX INFO: renamed from: c */
    public synchronized void m116099c() {
        ReentrantReadWriteLock reentrantReadWriteLock;
        try {
            try {
                this.f88860g.writeLock().lock();
                this.f88859f = null;
                if (this.f88855b != null) {
                    this.f88855b.delete();
                }
                reentrantReadWriteLock = this.f88860g;
            } catch (Exception e) {
                CrashHelper.m82479c(new Exception("FilePersistent clear exception:" + e.getMessage(), e));
                reentrantReadWriteLock = this.f88860g;
            }
            reentrantReadWriteLock.writeLock().unlock();
        } catch (Throwable th) {
            this.f88860g.writeLock().unlock();
            throw th;
        }
    }

    /* JADX INFO: renamed from: e */
    public T mo116100e(FileInputStream fileInputStream) throws IOException {
        return this.f88858e.get(m116107m(fileInputStream));
    }

    /* JADX INFO: renamed from: g */
    public final String m116101g(File file) {
        try {
            Object obj = Reflect.m222382on(file).call("isInvalid").get();
            return obj != null ? obj.toString() : "null invoke";
        } catch (Exception e) {
            return "get status error:" + e;
        }
    }

    /* JADX INFO: renamed from: h */
    public final String m116102h(File file, File file2) {
        StringBuilder sb = new StringBuilder();
        try {
            sb.append("new: ");
            if (file == null) {
                sb.append("null file");
            } else {
                sb.append(" exists = " + file.exists());
                sb.append(" path = " + file.getAbsolutePath());
                sb.append(" invalid: ");
                sb.append(m116101g(file));
            }
            sb.append("old: ");
            if (file2 == null) {
                sb.append("null file");
            } else {
                sb.append(" exists = " + file2.exists());
                sb.append(" path = " + file2.getAbsolutePath());
                sb.append(" invalid: ");
                sb.append(m116101g(file2));
            }
            sb.append(" dir:");
            if (f88851h == null) {
                sb.append(" null ");
            } else {
                sb.append(" exists = ");
                sb.append(f88851h.exists());
            }
        } catch (Exception e) {
            sb.append("get log error: " + e);
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ C16549a m116103i() throws Exception {
        u11.m193892f();
        m116104j(this.f88854a + " read Data begin");
        dji<T>.C16549a c16549aM116108n = m116108n();
        m116104j(this.f88854a + " read Data end");
        return c16549aM116108n;
    }

    /* JADX INFO: renamed from: k */
    public C22421c<dji<T>.C16549a> m116105k() {
        return C22421c.fromCallable(new Callable() { // from class: l.cji
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f82163a.m116103i();
            }
        });
    }

    /* JADX INFO: renamed from: l */
    public OutputStream m116106l() {
        if (this.f88856c == null) {
            return null;
        }
        try {
            f88853j++;
            return new FileOutputStream(this.f88856c);
        } catch (FileNotFoundException e) {
            CrashHelper.m82479c(e);
            return null;
        }
    }

    /* JADX INFO: renamed from: m */
    public byte[] m116107m(InputStream inputStream) throws Throwable {
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
                            CrashHelper.m82479c(e);
                        }
                    }
                } catch (Throwable th) {
                    th = th;
                    byteArrayOutputStream = byteArrayOutputStream2;
                    if (byteArrayOutputStream != null) {
                        try {
                            byteArrayOutputStream.close();
                        } catch (IOException e2) {
                            CrashHelper.m82479c(e2);
                        }
                    }
                    if (inputStream == null) {
                        throw th;
                    }
                    try {
                        inputStream.close();
                        throw th;
                    } catch (IOException e3) {
                        CrashHelper.m82479c(e3);
                        throw th;
                    }
                }
            }
            byteArrayOutputStream2.close();
            try {
                inputStream.close();
            } catch (IOException e4) {
                CrashHelper.m82479c(e4);
            }
            return byteArrayOutputStream2.toByteArray();
        } catch (Throwable th2) {
            th = th2;
        }
    }

    /* JADX INFO: renamed from: n */
    public dji<T>.C16549a m116108n() {
        dji<T>.C16549a c16549a = null;
        try {
            try {
                this.f88860g.readLock().lock();
                if (this.f88855b != null && this.f88855b.exists()) {
                    boolean z = this.f88855b.lastModified() >= System.currentTimeMillis() - TimeUnit.MILLISECONDS.convert((long) this.f88857d, TimeUnit.DAYS) || this.f88857d == -1;
                    FileInputStream fileInputStream = new FileInputStream(this.f88855b);
                    f88852i++;
                    T tMo116100e = mo116100e(fileInputStream);
                    if (tMo116100e != null) {
                        this.f88859f = tMo116100e;
                        c16549a = new C16549a(tMo116100e, z);
                    }
                }
            } catch (Exception e) {
                CrashHelper.m82479c(e);
            }
            return c16549a;
        } finally {
            this.f88860g.readLock().unlock();
        }
    }

    /* JADX INFO: Removed unreachable split cross block B:21:0x00a2 */
    /* JADX INFO: renamed from: o */
    public final void m116109o(File file, File file2) {
        this.f88860g.writeLock().lock();
        try {
            if (file != null) {
                try {
                    if (file.renameTo(file2)) {
                        this.f88855b = new File(f88851h, this.f88854a);
                        m116104j("文件覆盖成功" + this.f88854a);
                    } else {
                        String strM116102h = m116102h(file, file2);
                        CrashHelper.m82479c(new RuntimeException("文件覆盖失败：" + this.f88854a + " detail: " + strM116102h));
                        StringBuilder sb = new StringBuilder("文件覆盖成失败");
                        sb.append(this.f88854a);
                        sb.append(strM116102h);
                        m116104j(sb.toString());
                    }
                } catch (Exception e) {
                    CrashHelper.m82479c(new RuntimeException("文件覆盖异常" + this.f88854a + " detail: " + m116102h(file, file2), e));
                    StringBuilder sb2 = new StringBuilder("文件覆盖异常");
                    sb2.append(this.f88854a);
                    m116104j(sb2.toString());
                }
            }
        } finally {
            this.f88860g.writeLock().unlock();
        }
    }

    /* JADX INFO: renamed from: p */
    public void m116110p(T t) {
        m116104j(this.f88854a + " write begin start");
        synchronized (this) {
            OutputStream outputStreamM116106l = m116106l();
            m116104j(this.f88854a + " write begin run");
            try {
                try {
                    this.f88859f = t;
                    outputStreamM116106l.write(mo116111q(t));
                    outputStreamM116106l.flush();
                    m116109o(this.f88856c, this.f88855b);
                } catch (IOException e) {
                    CrashHelper.m82479c(e);
                }
                ua5.m195158b(outputStreamM116106l);
            } catch (Throwable th) {
                ua5.m195158b(outputStreamM116106l);
                throw th;
            }
        }
        m116104j(this.f88854a + " write end");
    }

    /* JADX INFO: renamed from: q */
    public byte[] mo116111q(T t) throws IOException {
        return this.f88858e.serialize(t);
    }

    /* JADX INFO: renamed from: j */
    public final void m116104j(String str) {
    }

    public dji(InterfaceC16550b<String> interfaceC16550b, int i, ProtobufAdapter<T> protobufAdapter) {
        this(interfaceC16550b.getFileName(), i, protobufAdapter);
    }
}
