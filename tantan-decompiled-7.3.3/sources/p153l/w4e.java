package p153l;

import android.annotation.TargetApi;
import android.os.Build;
import android.os.StrictMode;
import com.alibaba.sdk.android.oss.signer.SignParameters;
import com.clevertap.android.sdk.Constants;
import com.fasterxml.jackson.core.util.MinimalPrettyPrinter;
import java.io.BufferedWriter;
import java.io.Closeable;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.Callable;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final class w4e implements Closeable {

    /* JADX INFO: renamed from: a */
    private final File f187369a;

    /* JADX INFO: renamed from: b */
    private final File f187370b;

    /* JADX INFO: renamed from: c */
    private final File f187371c;

    /* JADX INFO: renamed from: d */
    private final File f187372d;

    /* JADX INFO: renamed from: e */
    private final int f187373e;

    /* JADX INFO: renamed from: f */
    private long f187374f;

    /* JADX INFO: renamed from: g */
    private final int f187375g;

    /* JADX INFO: renamed from: i */
    private Writer f187377i;

    /* JADX INFO: renamed from: k */
    private int f187379k;

    /* JADX INFO: renamed from: h */
    private long f187376h = 0;

    /* JADX INFO: renamed from: j */
    private final LinkedHashMap<String, C21016d> f187378j = new LinkedHashMap<>(0, 0.75f, true);

    /* JADX INFO: renamed from: l */
    private long f187380l = 0;

    /* JADX INFO: renamed from: m */
    final ThreadPoolExecutor f187381m = new ThreadPoolExecutor(0, 1, 60, TimeUnit.SECONDS, new LinkedBlockingQueue(), new ThreadFactoryC21014b(null));

    /* JADX INFO: renamed from: n */
    private final Callable<Void> f187382n = new CallableC21013a();

    /* JADX INFO: renamed from: l.w4e$a */
    public class CallableC21013a implements Callable<Void> {
        public CallableC21013a() {
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Void call() throws Exception {
            synchronized (w4e.this) {
                try {
                    if (w4e.this.f187377i == null) {
                        return null;
                    }
                    w4e.this.m204835a0();
                    if (w4e.this.m204828I()) {
                        w4e.this.m204833S();
                        w4e.this.f187379k = 0;
                    }
                    return null;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    private w4e(File file, int i, int i2, long j) {
        this.f187369a = file;
        this.f187373e = i;
        this.f187370b = new File(file, "journal");
        this.f187371c = new File(file, "journal.tmp");
        this.f187372d = new File(file, "journal.bkp");
        this.f187375g = i2;
        this.f187374f = j;
    }

    /* JADX INFO: renamed from: B */
    private synchronized C21015c m204826B(String str, long j) throws IOException {
        m204844m();
        C21016d c21016d = this.f187378j.get(str);
        CallableC21013a callableC21013a = null;
        if (j != -1 && (c21016d == null || c21016d.f187394g != j)) {
            return null;
        }
        if (c21016d == null) {
            c21016d = new C21016d(this, str, callableC21013a);
            this.f187378j.put(str, c21016d);
        } else if (c21016d.f187393f != null) {
            return null;
        }
        C21015c c21015c = new C21015c(this, c21016d, callableC21013a);
        c21016d.f187393f = c21015c;
        this.f187377i.append((CharSequence) "DIRTY");
        this.f187377i.append(' ');
        this.f187377i.append((CharSequence) str);
        this.f187377i.append('\n');
        m204827F(this.f187377i);
        return c21015c;
    }

    @TargetApi(26)
    /* JADX INFO: renamed from: F */
    private static void m204827F(Writer writer) throws IOException {
        if (Build.VERSION.SDK_INT < 26) {
            writer.flush();
            return;
        }
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitUnbufferedIo().build());
        try {
            writer.flush();
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: I */
    public boolean m204828I() {
        int i = this.f187379k;
        return i >= 2000 && i >= this.f187378j.size();
    }

    /* JADX INFO: renamed from: J */
    public static w4e m204829J(File file, int i, int i2, long j) throws IOException {
        if (j <= 0) {
            wg3.m206174a("maxSize <= 0");
            return null;
        }
        if (i2 <= 0) {
            wg3.m206174a("valueCount <= 0");
            return null;
        }
        File file2 = new File(file, "journal.bkp");
        if (file2.exists()) {
            File file3 = new File(file, "journal");
            if (file3.exists()) {
                file2.delete();
            } else {
                m204834Z(file2, file3, false);
            }
        }
        w4e w4eVar = new w4e(file, i, i2, j);
        if (w4eVar.f187370b.exists()) {
            try {
                w4eVar.m204831N();
                w4eVar.m204830M();
                return w4eVar;
            } catch (IOException e) {
                System.out.println("DiskLruCache " + file + " is corrupt: " + e.getMessage() + ", removing");
                w4eVar.m204850t();
            }
        }
        file.mkdirs();
        w4e w4eVar2 = new w4e(file, i, i2, j);
        w4eVar2.m204833S();
        return w4eVar2;
    }

    /* JADX INFO: renamed from: M */
    private void m204830M() throws IOException {
        m204847u(this.f187371c);
        Iterator<C21016d> it = this.f187378j.values().iterator();
        while (it.hasNext()) {
            C21016d next = it.next();
            int i = 0;
            if (next.f187393f == null) {
                while (i < this.f187375g) {
                    this.f187376h += next.f187389b[i];
                    i++;
                }
            } else {
                next.f187393f = null;
                while (i < this.f187375g) {
                    m204847u(next.m204870j(i));
                    m204847u(next.m204871k(i));
                    i++;
                }
                it.remove();
            }
        }
    }

    /* JADX INFO: renamed from: N */
    private void m204831N() throws IOException {
        c8g0 c8g0Var = new c8g0(new FileInputStream(this.f187370b), imk0.f115784a);
        try {
            String strM108361n = c8g0Var.m108361n();
            String strM108361n2 = c8g0Var.m108361n();
            String strM108361n3 = c8g0Var.m108361n();
            String strM108361n4 = c8g0Var.m108361n();
            String strM108361n5 = c8g0Var.m108361n();
            if (!"libcore.io.DiskLruCache".equals(strM108361n) || !"1".equals(strM108361n2) || !Integer.toString(this.f187373e).equals(strM108361n3) || !Integer.toString(this.f187375g).equals(strM108361n4) || !"".equals(strM108361n5)) {
                throw new IOException("unexpected journal header: [" + strM108361n + ", " + strM108361n2 + ", " + strM108361n4 + ", " + strM108361n5 + Constants.AES_SUFFIX);
            }
            int i = 0;
            while (true) {
                try {
                    m204832Q(c8g0Var.m108361n());
                    i++;
                } catch (EOFException unused) {
                    this.f187379k = i - this.f187378j.size();
                    if (c8g0Var.m108360m()) {
                        m204833S();
                    } else {
                        this.f187377i = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.f187370b, true), imk0.f115784a));
                    }
                    imk0.m140935a(c8g0Var);
                    return;
                }
            }
        } catch (Throwable th) {
            imk0.m140935a(c8g0Var);
            throw th;
        }
    }

    /* JADX INFO: renamed from: Q */
    private void m204832Q(String str) throws IOException {
        String strSubstring;
        int iIndexOf = str.indexOf(32);
        if (iIndexOf == -1) {
            zpg0.m220844a("unexpected journal line: ".concat(str));
            return;
        }
        int i = iIndexOf + 1;
        int iIndexOf2 = str.indexOf(32, i);
        if (iIndexOf2 == -1) {
            strSubstring = str.substring(i);
            if (iIndexOf == 6 && str.startsWith("REMOVE")) {
                this.f187378j.remove(strSubstring);
                return;
            }
        } else {
            strSubstring = str.substring(i, iIndexOf2);
        }
        C21016d c21016d = this.f187378j.get(strSubstring);
        CallableC21013a callableC21013a = null;
        if (c21016d == null) {
            c21016d = new C21016d(this, strSubstring, callableC21013a);
            this.f187378j.put(strSubstring, c21016d);
        }
        if (iIndexOf2 != -1 && iIndexOf == 5 && str.startsWith("CLEAN")) {
            String[] strArrSplit = str.substring(iIndexOf2 + 1).split(MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR);
            c21016d.f187392e = true;
            c21016d.f187393f = null;
            c21016d.m204869n(strArrSplit);
            return;
        }
        if (iIndexOf2 == -1 && iIndexOf == 5 && str.startsWith("DIRTY")) {
            c21016d.f187393f = new C21015c(this, c21016d, callableC21013a);
        } else {
            if (iIndexOf2 == -1 && iIndexOf == 4 && str.startsWith("READ")) {
                return;
            }
            zpg0.m220844a("unexpected journal line: ".concat(str));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: S */
    public synchronized void m204833S() throws IOException {
        try {
            Writer writer = this.f187377i;
            if (writer != null) {
                m204845n(writer);
            }
            BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.f187371c), imk0.f115784a));
            try {
                bufferedWriter.write("libcore.io.DiskLruCache");
                bufferedWriter.write(SignParameters.NEW_LINE);
                bufferedWriter.write("1");
                bufferedWriter.write(SignParameters.NEW_LINE);
                bufferedWriter.write(Integer.toString(this.f187373e));
                bufferedWriter.write(SignParameters.NEW_LINE);
                bufferedWriter.write(Integer.toString(this.f187375g));
                bufferedWriter.write(SignParameters.NEW_LINE);
                bufferedWriter.write(SignParameters.NEW_LINE);
                for (C21016d c21016d : this.f187378j.values()) {
                    if (c21016d.f187393f != null) {
                        bufferedWriter.write("DIRTY " + c21016d.f187388a + '\n');
                    } else {
                        bufferedWriter.write("CLEAN " + c21016d.f187388a + c21016d.m204872l() + '\n');
                    }
                }
                m204845n(bufferedWriter);
                if (this.f187370b.exists()) {
                    m204834Z(this.f187370b, this.f187372d, true);
                }
                m204834Z(this.f187371c, this.f187370b, false);
                this.f187372d.delete();
                this.f187377i = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.f187370b, true), imk0.f115784a));
            } catch (Throwable th) {
                m204845n(bufferedWriter);
                throw th;
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* JADX INFO: renamed from: Z */
    private static void m204834Z(File file, File file2, boolean z) throws IOException {
        if (z) {
            m204847u(file2);
        }
        if (!file.renameTo(file2)) {
            throw new IOException();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a0 */
    public void m204835a0() throws IOException {
        while (this.f187376h > this.f187374f) {
            m204849U(this.f187378j.entrySet().iterator().next().getKey());
        }
    }

    /* JADX INFO: renamed from: m */
    private void m204844m() {
        if (this.f187377i != null) {
            return;
        }
        wtq0.m207906a("cache is closed");
    }

    @TargetApi(26)
    /* JADX INFO: renamed from: n */
    private static void m204845n(Writer writer) throws IOException {
        if (Build.VERSION.SDK_INT < 26) {
            writer.close();
            return;
        }
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitUnbufferedIo().build());
        try {
            writer.close();
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q */
    public synchronized void m204846q(C21015c c21015c, boolean z) throws IOException {
        C21016d c21016d = c21015c.f187384a;
        if (c21016d.f187393f != c21015c) {
            throw new IllegalStateException();
        }
        if (z && !c21016d.f187392e) {
            for (int i = 0; i < this.f187375g; i++) {
                if (!c21015c.f187385b[i]) {
                    c21015c.m204855a();
                    throw new IllegalStateException("Newly created entry didn't create value for index " + i);
                }
                if (!c21016d.m204871k(i).exists()) {
                    c21015c.m204855a();
                    return;
                }
            }
        }
        for (int i2 = 0; i2 < this.f187375g; i2++) {
            File fileM204871k = c21016d.m204871k(i2);
            if (!z) {
                m204847u(fileM204871k);
            } else if (fileM204871k.exists()) {
                File fileM204870j = c21016d.m204870j(i2);
                fileM204871k.renameTo(fileM204870j);
                long j = c21016d.f187389b[i2];
                long length = fileM204870j.length();
                c21016d.f187389b[i2] = length;
                this.f187376h = (this.f187376h - j) + length;
            }
        }
        this.f187379k++;
        c21016d.f187393f = null;
        if (c21016d.f187392e || z) {
            c21016d.f187392e = true;
            this.f187377i.append((CharSequence) "CLEAN");
            this.f187377i.append(' ');
            this.f187377i.append((CharSequence) c21016d.f187388a);
            this.f187377i.append((CharSequence) c21016d.m204872l());
            this.f187377i.append('\n');
            if (z) {
                long j2 = this.f187380l;
                this.f187380l = 1 + j2;
                c21016d.f187394g = j2;
            }
        } else {
            this.f187378j.remove(c21016d.f187388a);
            this.f187377i.append((CharSequence) "REMOVE");
            this.f187377i.append(' ');
            this.f187377i.append((CharSequence) c21016d.f187388a);
            this.f187377i.append('\n');
        }
        m204827F(this.f187377i);
        if (this.f187376h > this.f187374f || m204828I()) {
            this.f187381m.submit(this.f187382n);
        }
    }

    /* JADX INFO: renamed from: u */
    private static void m204847u(File file) throws IOException {
        if (file.exists() && !file.delete()) {
            throw new IOException();
        }
    }

    /* JADX INFO: renamed from: H */
    public synchronized C21017e m204848H(String str) throws IOException {
        Throwable th;
        try {
            try {
                m204844m();
                C21016d c21016d = this.f187378j.get(str);
                if (c21016d == null) {
                    return null;
                }
                if (!c21016d.f187392e) {
                    return null;
                }
                for (File file : c21016d.f187390c) {
                    try {
                        if (!file.exists()) {
                            return null;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                    }
                }
                this.f187379k++;
                this.f187377i.append((CharSequence) "READ");
                this.f187377i.append(' ');
                this.f187377i.append((CharSequence) str);
                this.f187377i.append('\n');
                if (m204828I()) {
                    this.f187381m.submit(this.f187382n);
                }
                return new C21017e(this, str, c21016d.f187394g, c21016d.f187390c, c21016d.f187389b, null);
            } catch (Throwable th3) {
                th = th3;
                th = th;
            }
        } catch (Throwable th4) {
            th = th4;
            th = th;
        }
        throw th;
    }

    /* JADX INFO: renamed from: U */
    public synchronized boolean m204849U(String str) throws IOException {
        try {
            m204844m();
            C21016d c21016d = this.f187378j.get(str);
            if (c21016d != null && c21016d.f187393f == null) {
                for (int i = 0; i < this.f187375g; i++) {
                    File fileM204870j = c21016d.m204870j(i);
                    if (fileM204870j.exists() && !fileM204870j.delete()) {
                        throw new IOException("failed to delete " + fileM204870j);
                    }
                    this.f187376h -= c21016d.f187389b[i];
                    c21016d.f187389b[i] = 0;
                }
                this.f187379k++;
                this.f187377i.append((CharSequence) "REMOVE");
                this.f187377i.append(' ');
                this.f187377i.append((CharSequence) str);
                this.f187377i.append('\n');
                this.f187378j.remove(str);
                if (m204828I()) {
                    this.f187381m.submit(this.f187382n);
                }
                return true;
            }
            return false;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() throws IOException {
        try {
            if (this.f187377i == null) {
                return;
            }
            for (C21016d c21016d : new ArrayList(this.f187378j.values())) {
                if (c21016d.f187393f != null) {
                    c21016d.f187393f.m204855a();
                }
            }
            m204835a0();
            m204845n(this.f187377i);
            this.f187377i = null;
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: t */
    public void m204850t() throws IOException {
        close();
        imk0.m140936b(this.f187369a);
    }

    /* JADX INFO: renamed from: v */
    public C21015c m204851v(String str) throws IOException {
        return m204826B(str, -1L);
    }

    /* JADX INFO: renamed from: l.w4e$b */
    public static final class ThreadFactoryC21014b implements ThreadFactory {
        private ThreadFactoryC21014b() {
        }

        @Override // java.util.concurrent.ThreadFactory
        public synchronized Thread newThread(Runnable runnable) {
            Thread thread;
            thread = new Thread(runnable, "glide-disk-lru-cache-thread");
            thread.setPriority(1);
            return thread;
        }

        public /* synthetic */ ThreadFactoryC21014b(CallableC21013a callableC21013a) {
            this();
        }
    }

    /* JADX INFO: renamed from: l.w4e$e */
    public final class C21017e {

        /* JADX INFO: renamed from: a */
        private final String f187396a;

        /* JADX INFO: renamed from: b */
        private final long f187397b;

        /* JADX INFO: renamed from: c */
        private final long[] f187398c;

        /* JADX INFO: renamed from: d */
        private final File[] f187399d;

        private C21017e(String str, long j, File[] fileArr, long[] jArr) {
            this.f187396a = str;
            this.f187397b = j;
            this.f187399d = fileArr;
            this.f187398c = jArr;
        }

        /* JADX INFO: renamed from: a */
        public File m204873a(int i) {
            return this.f187399d[i];
        }

        public /* synthetic */ C21017e(w4e w4eVar, String str, long j, File[] fileArr, long[] jArr, CallableC21013a callableC21013a) {
            this(str, j, fileArr, jArr);
        }
    }

    /* JADX INFO: renamed from: l.w4e$c */
    public final class C21015c {

        /* JADX INFO: renamed from: a */
        private final C21016d f187384a;

        /* JADX INFO: renamed from: b */
        private final boolean[] f187385b;

        /* JADX INFO: renamed from: c */
        private boolean f187386c;

        private C21015c(C21016d c21016d) {
            this.f187384a = c21016d;
            this.f187385b = c21016d.f187392e ? null : new boolean[w4e.this.f187375g];
        }

        /* JADX INFO: renamed from: a */
        public void m204855a() throws IOException {
            w4e.this.m204846q(this, false);
        }

        /* JADX INFO: renamed from: b */
        public void m204856b() {
            if (this.f187386c) {
                return;
            }
            try {
                m204855a();
            } catch (IOException unused) {
            }
        }

        /* JADX INFO: renamed from: e */
        public void m204857e() throws IOException {
            w4e.this.m204846q(this, true);
            this.f187386c = true;
        }

        /* JADX INFO: renamed from: f */
        public File m204858f(int i) throws IOException {
            File fileM204871k;
            synchronized (w4e.this) {
                try {
                    if (this.f187384a.f187393f != this) {
                        throw new IllegalStateException();
                    }
                    if (!this.f187384a.f187392e) {
                        this.f187385b[i] = true;
                    }
                    fileM204871k = this.f187384a.m204871k(i);
                    w4e.this.f187369a.mkdirs();
                } catch (Throwable th) {
                    throw th;
                }
            }
            return fileM204871k;
        }

        public /* synthetic */ C21015c(w4e w4eVar, C21016d c21016d, CallableC21013a callableC21013a) {
            this(c21016d);
        }
    }

    /* JADX INFO: renamed from: l.w4e$d */
    public final class C21016d {

        /* JADX INFO: renamed from: a */
        private final String f187388a;

        /* JADX INFO: renamed from: b */
        private final long[] f187389b;

        /* JADX INFO: renamed from: c */
        File[] f187390c;

        /* JADX INFO: renamed from: d */
        File[] f187391d;

        /* JADX INFO: renamed from: e */
        private boolean f187392e;

        /* JADX INFO: renamed from: f */
        private C21015c f187393f;

        /* JADX INFO: renamed from: g */
        private long f187394g;

        private C21016d(String str) {
            this.f187388a = str;
            this.f187389b = new long[w4e.this.f187375g];
            this.f187390c = new File[w4e.this.f187375g];
            this.f187391d = new File[w4e.this.f187375g];
            StringBuilder sb = new StringBuilder(str);
            sb.append('.');
            int length = sb.length();
            for (int i = 0; i < w4e.this.f187375g; i++) {
                sb.append(i);
                this.f187390c[i] = new File(w4e.this.f187369a, sb.toString());
                sb.append(".tmp");
                this.f187391d[i] = new File(w4e.this.f187369a, sb.toString());
                sb.setLength(length);
            }
        }

        /* JADX INFO: renamed from: m */
        private IOException m204868m(String[] strArr) throws IOException {
            throw new IOException("unexpected journal line: " + Arrays.toString(strArr));
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: n */
        public void m204869n(String[] strArr) throws IOException {
            if (strArr.length != w4e.this.f187375g) {
                throw m204868m(strArr);
            }
            for (int i = 0; i < strArr.length; i++) {
                try {
                    this.f187389b[i] = Long.parseLong(strArr[i]);
                } catch (NumberFormatException unused) {
                    throw m204868m(strArr);
                }
            }
        }

        /* JADX INFO: renamed from: j */
        public File m204870j(int i) {
            return this.f187390c[i];
        }

        /* JADX INFO: renamed from: k */
        public File m204871k(int i) {
            return this.f187391d[i];
        }

        /* JADX INFO: renamed from: l */
        public String m204872l() throws IOException {
            StringBuilder sb = new StringBuilder();
            for (long j : this.f187389b) {
                sb.append(' ');
                sb.append(j);
            }
            return sb.toString();
        }

        public /* synthetic */ C21016d(w4e w4eVar, String str, CallableC21013a callableC21013a) {
            this(str);
        }
    }
}
