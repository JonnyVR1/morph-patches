package p149l;

import com.p046p1.mobile.android.app.App;
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
import p133rx.C22306c;

/* JADX INFO: loaded from: classes8.dex */
public class ggi<T> {

    /* JADX INFO: renamed from: h */
    public static File f102502h;

    /* JADX INFO: renamed from: i */
    public static int f102503i;

    /* JADX INFO: renamed from: j */
    public static int f102504j;

    /* JADX INFO: renamed from: a */
    public final String f102505a;

    /* JADX INFO: renamed from: b */
    public volatile File f102506b;

    /* JADX INFO: renamed from: c */
    public final File f102507c;

    /* JADX INFO: renamed from: d */
    public final int f102508d;

    /* JADX INFO: renamed from: e */
    public final ProtobufAdapter<T> f102509e;

    /* JADX INFO: renamed from: f */
    public volatile T f102510f;

    /* JADX INFO: renamed from: g */
    public ReentrantReadWriteLock f102511g;

    /* JADX INFO: renamed from: l.ggi$a */
    public class C17074a {

        /* JADX INFO: renamed from: a */
        public final T f102512a;

        /* JADX INFO: renamed from: b */
        public final boolean f102513b;

        public C17074a(T t, boolean z) {
            this.f102512a = t;
            this.f102513b = z;
        }
    }

    /* JADX INFO: renamed from: l.ggi$b */
    public interface InterfaceC17075b<String> {
        String getFileName();
    }

    public ggi(String str, int i, ProtobufAdapter<T> protobufAdapter) {
        this.f102511g = new ReentrantReadWriteLock();
        this.f102505a = str;
        this.f102509e = protobufAdapter;
        if (f102502h == null) {
            try {
                File file = new File(m125965f());
                f102502h = file;
                file.mkdirs();
            } catch (Exception e) {
                CrashHelper.m81296c(new Exception("FilePersistent exception:" + e.getMessage(), e));
            }
        }
        if (f102502h == null) {
            this.f102506b = null;
            this.f102507c = null;
            this.f102508d = 1;
            return;
        }
        this.f102506b = new File(f102502h, str);
        this.f102507c = new File(f102502h, str + "_temp");
        this.f102508d = i;
    }

    /* JADX INFO: renamed from: d */
    public static void m125964d() {
        try {
            File file = new File(m125965f());
            f102502h = file;
            for (File file2 : file.listFiles()) {
                file2.delete();
            }
            f102502h.delete();
        } catch (Exception e) {
            CrashHelper.m81296c(e);
        }
    }

    /* JADX INFO: renamed from: f */
    public static String m125965f() {
        return App.f15369e.getFilesDir().getAbsolutePath() + "/file_persistent/";
    }

    /* JADX INFO: renamed from: b */
    public T m125966b() {
        m125972j(this.f102505a + " read cache begin");
        try {
            try {
                this.f102511g.readLock().lock();
                if (this.f102510f == null && this.f102506b != null && this.f102506b.exists() && this.f102506b.length() > 0 && this.f102510f == null && this.f102506b != null && this.f102506b.exists() && this.f102506b.length() > 0) {
                    this.f102510f = mo125968e(new FileInputStream(this.f102506b));
                }
            } catch (IOException e) {
                CrashHelper.m81296c(e);
            }
            this.f102511g.readLock().unlock();
            m125972j(this.f102505a + " read cache end");
            return this.f102510f;
        } catch (Throwable th) {
            this.f102511g.readLock().unlock();
            throw th;
        }
    }

    /* JADX INFO: renamed from: c */
    public synchronized void m125967c() {
        ReentrantReadWriteLock reentrantReadWriteLock;
        try {
            try {
                this.f102511g.writeLock().lock();
                this.f102510f = null;
                if (this.f102506b != null) {
                    this.f102506b.delete();
                }
                reentrantReadWriteLock = this.f102511g;
            } catch (Exception e) {
                CrashHelper.m81296c(new Exception("FilePersistent clear exception:" + e.getMessage(), e));
                reentrantReadWriteLock = this.f102511g;
            }
            reentrantReadWriteLock.writeLock().unlock();
        } catch (Throwable th) {
            this.f102511g.writeLock().unlock();
            throw th;
        }
    }

    /* JADX INFO: renamed from: e */
    public T mo125968e(FileInputStream fileInputStream) throws IOException {
        return this.f102509e.get(m125975m(fileInputStream));
    }

    /* JADX INFO: renamed from: g */
    public final String m125969g(File file) {
        try {
            Object obj = Reflect.m221136on(file).call("isInvalid").get();
            return obj != null ? obj.toString() : "null invoke";
        } catch (Exception e) {
            return "get status error:" + e;
        }
    }

    /* JADX INFO: renamed from: h */
    public final String m125970h(File file, File file2) {
        StringBuilder sb = new StringBuilder();
        try {
            sb.append("new: ");
            if (file == null) {
                sb.append("null file");
            } else {
                sb.append(" exists = " + file.exists());
                sb.append(" path = " + file.getAbsolutePath());
                sb.append(" invalid: ");
                sb.append(m125969g(file));
            }
            sb.append("old: ");
            if (file2 == null) {
                sb.append("null file");
            } else {
                sb.append(" exists = " + file2.exists());
                sb.append(" path = " + file2.getAbsolutePath());
                sb.append(" invalid: ");
                sb.append(m125969g(file2));
            }
            sb.append(" dir:");
            if (f102502h == null) {
                sb.append(" null ");
            } else {
                sb.append(" exists = ");
                sb.append(f102502h.exists());
            }
        } catch (Exception e) {
            sb.append("get log error: " + e);
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ C17074a m125971i() throws Exception {
        n11.m157333f();
        m125972j(this.f102505a + " read Data begin");
        ggi<T>.C17074a c17074aM125976n = m125976n();
        m125972j(this.f102505a + " read Data end");
        return c17074aM125976n;
    }

    /* JADX INFO: renamed from: k */
    public C22306c<ggi<T>.C17074a> m125973k() {
        return C22306c.fromCallable(new Callable() { // from class: l.fgi
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f97372a.m125971i();
            }
        });
    }

    /* JADX INFO: renamed from: l */
    public OutputStream m125974l() {
        if (this.f102507c == null) {
            return null;
        }
        try {
            f102504j++;
            return new FileOutputStream(this.f102507c);
        } catch (FileNotFoundException e) {
            CrashHelper.m81296c(e);
            return null;
        }
    }

    /* JADX INFO: renamed from: m */
    public byte[] m125975m(InputStream inputStream) throws Throwable {
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
                            CrashHelper.m81296c(e);
                        }
                    }
                } catch (Throwable th) {
                    th = th;
                    byteArrayOutputStream = byteArrayOutputStream2;
                    if (byteArrayOutputStream != null) {
                        try {
                            byteArrayOutputStream.close();
                        } catch (IOException e2) {
                            CrashHelper.m81296c(e2);
                        }
                    }
                    if (inputStream == null) {
                        throw th;
                    }
                    try {
                        inputStream.close();
                        throw th;
                    } catch (IOException e3) {
                        CrashHelper.m81296c(e3);
                        throw th;
                    }
                }
            }
            byteArrayOutputStream2.close();
            try {
                inputStream.close();
            } catch (IOException e4) {
                CrashHelper.m81296c(e4);
            }
            return byteArrayOutputStream2.toByteArray();
        } catch (Throwable th2) {
            th = th2;
        }
    }

    /* JADX INFO: renamed from: n */
    public ggi<T>.C17074a m125976n() {
        ggi<T>.C17074a c17074a = null;
        try {
            try {
                this.f102511g.readLock().lock();
                if (this.f102506b != null && this.f102506b.exists()) {
                    boolean z = this.f102506b.lastModified() >= System.currentTimeMillis() - TimeUnit.MILLISECONDS.convert((long) this.f102508d, TimeUnit.DAYS) || this.f102508d == -1;
                    FileInputStream fileInputStream = new FileInputStream(this.f102506b);
                    f102503i++;
                    T tMo125968e = mo125968e(fileInputStream);
                    if (tMo125968e != null) {
                        this.f102510f = tMo125968e;
                        c17074a = new C17074a(tMo125968e, z);
                    }
                }
            } catch (Exception e) {
                CrashHelper.m81296c(e);
            }
            return c17074a;
        } finally {
            this.f102511g.readLock().unlock();
        }
    }

    /* JADX INFO: Removed unreachable split cross block B:21:0x00a2 */
    /* JADX INFO: renamed from: o */
    public final void m125977o(File file, File file2) {
        this.f102511g.writeLock().lock();
        try {
            if (file != null) {
                try {
                    if (file.renameTo(file2)) {
                        this.f102506b = new File(f102502h, this.f102505a);
                        m125972j("文件覆盖成功" + this.f102505a);
                    } else {
                        String strM125970h = m125970h(file, file2);
                        CrashHelper.m81296c(new RuntimeException("文件覆盖失败：" + this.f102505a + " detail: " + strM125970h));
                        StringBuilder sb = new StringBuilder("文件覆盖成失败");
                        sb.append(this.f102505a);
                        sb.append(strM125970h);
                        m125972j(sb.toString());
                    }
                } catch (Exception e) {
                    CrashHelper.m81296c(new RuntimeException("文件覆盖异常" + this.f102505a + " detail: " + m125970h(file, file2), e));
                    StringBuilder sb2 = new StringBuilder("文件覆盖异常");
                    sb2.append(this.f102505a);
                    m125972j(sb2.toString());
                }
            }
        } finally {
            this.f102511g.writeLock().unlock();
        }
    }

    /* JADX INFO: renamed from: p */
    public void m125978p(T t) {
        m125972j(this.f102505a + " write begin start");
        synchronized (this) {
            OutputStream outputStreamM125974l = m125974l();
            m125972j(this.f102505a + " write begin run");
            try {
                try {
                    this.f102510f = t;
                    outputStreamM125974l.write(mo125979q(t));
                    outputStreamM125974l.flush();
                    m125977o(this.f102507c, this.f102506b);
                } catch (IOException e) {
                    CrashHelper.m81296c(e);
                }
                t95.m187604b(outputStreamM125974l);
            } catch (Throwable th) {
                t95.m187604b(outputStreamM125974l);
                throw th;
            }
        }
        m125972j(this.f102505a + " write end");
    }

    /* JADX INFO: renamed from: q */
    public byte[] mo125979q(T t) throws IOException {
        return this.f102509e.serialize(t);
    }

    /* JADX INFO: renamed from: j */
    public final void m125972j(String str) {
    }

    public ggi(InterfaceC17075b<String> interfaceC17075b, int i, ProtobufAdapter<T> protobufAdapter) {
        this(interfaceC17075b.getFileName(), i, protobufAdapter);
    }
}
