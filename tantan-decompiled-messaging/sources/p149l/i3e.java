package p149l;

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
public final class i3e implements Closeable {

    /* JADX INFO: renamed from: a */
    private final File f111249a;

    /* JADX INFO: renamed from: b */
    private final File f111250b;

    /* JADX INFO: renamed from: c */
    private final File f111251c;

    /* JADX INFO: renamed from: d */
    private final File f111252d;

    /* JADX INFO: renamed from: e */
    private final int f111253e;

    /* JADX INFO: renamed from: f */
    private long f111254f;

    /* JADX INFO: renamed from: g */
    private final int f111255g;

    /* JADX INFO: renamed from: i */
    private Writer f111257i;

    /* JADX INFO: renamed from: k */
    private int f111259k;

    /* JADX INFO: renamed from: h */
    private long f111256h = 0;

    /* JADX INFO: renamed from: j */
    private final LinkedHashMap<String, C17471d> f111258j = new LinkedHashMap<>(0, 0.75f, true);

    /* JADX INFO: renamed from: l */
    private long f111260l = 0;

    /* JADX INFO: renamed from: m */
    final ThreadPoolExecutor f111261m = new ThreadPoolExecutor(0, 1, 60, TimeUnit.SECONDS, new LinkedBlockingQueue(), new ThreadFactoryC17469b(null));

    /* JADX INFO: renamed from: n */
    private final Callable<Void> f111262n = new CallableC17468a();

    /* JADX INFO: renamed from: l.i3e$a */
    public class CallableC17468a implements Callable<Void> {
        public CallableC17468a() {
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Void call() throws Exception {
            synchronized (i3e.this) {
                try {
                    if (i3e.this.f111257i == null) {
                        return null;
                    }
                    i3e.this.m134171Z();
                    if (i3e.this.m134164I()) {
                        i3e.this.m134169S();
                        i3e.this.f111259k = 0;
                    }
                    return null;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    private i3e(File file, int i, int i2, long j) {
        this.f111249a = file;
        this.f111253e = i;
        this.f111250b = new File(file, "journal");
        this.f111251c = new File(file, "journal.tmp");
        this.f111252d = new File(file, "journal.bkp");
        this.f111255g = i2;
        this.f111254f = j;
    }

    /* JADX INFO: renamed from: B */
    private synchronized C17470c m134162B(String str, long j) throws IOException {
        m134180m();
        C17471d c17471d = this.f111258j.get(str);
        CallableC17468a callableC17468a = null;
        if (j != -1 && (c17471d == null || c17471d.f111274g != j)) {
            return null;
        }
        if (c17471d == null) {
            c17471d = new C17471d(this, str, callableC17468a);
            this.f111258j.put(str, c17471d);
        } else if (c17471d.f111273f != null) {
            return null;
        }
        C17470c c17470c = new C17470c(this, c17471d, callableC17468a);
        c17471d.f111273f = c17470c;
        this.f111257i.append((CharSequence) "DIRTY");
        this.f111257i.append(' ');
        this.f111257i.append((CharSequence) str);
        this.f111257i.append('\n');
        m134163F(this.f111257i);
        return c17470c;
    }

    @TargetApi(26)
    /* JADX INFO: renamed from: F */
    private static void m134163F(Writer writer) throws IOException {
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
    public boolean m134164I() {
        int i = this.f111259k;
        return i >= 2000 && i >= this.f111258j.size();
    }

    /* JADX INFO: renamed from: J */
    public static i3e m134165J(File file, int i, int i2, long j) throws IOException {
        if (j <= 0) {
            ig3.m135964a("maxSize <= 0");
            return null;
        }
        if (i2 <= 0) {
            ig3.m135964a("valueCount <= 0");
            return null;
        }
        File file2 = new File(file, "journal.bkp");
        if (file2.exists()) {
            File file3 = new File(file, "journal");
            if (file3.exists()) {
                file2.delete();
            } else {
                m134170Y(file2, file3, false);
            }
        }
        i3e i3eVar = new i3e(file, i, i2, j);
        if (i3eVar.f111250b.exists()) {
            try {
                i3eVar.m134167N();
                i3eVar.m134166M();
                return i3eVar;
            } catch (IOException e) {
                System.out.println("DiskLruCache " + file + " is corrupt: " + e.getMessage() + ", removing");
                i3eVar.m134186t();
            }
        }
        file.mkdirs();
        i3e i3eVar2 = new i3e(file, i, i2, j);
        i3eVar2.m134169S();
        return i3eVar2;
    }

    /* JADX INFO: renamed from: M */
    private void m134166M() throws IOException {
        m134183u(this.f111251c);
        Iterator<C17471d> it = this.f111258j.values().iterator();
        while (it.hasNext()) {
            C17471d next = it.next();
            int i = 0;
            if (next.f111273f == null) {
                while (i < this.f111255g) {
                    this.f111256h += next.f111269b[i];
                    i++;
                }
            } else {
                next.f111273f = null;
                while (i < this.f111255g) {
                    m134183u(next.m134206j(i));
                    m134183u(next.m134207k(i));
                    i++;
                }
                it.remove();
            }
        }
    }

    /* JADX INFO: renamed from: N */
    private void m134167N() throws IOException {
        vzf0 vzf0Var = new vzf0(new FileInputStream(this.f111250b), cdk0.f80374a);
        try {
            String strM200758n = vzf0Var.m200758n();
            String strM200758n2 = vzf0Var.m200758n();
            String strM200758n3 = vzf0Var.m200758n();
            String strM200758n4 = vzf0Var.m200758n();
            String strM200758n5 = vzf0Var.m200758n();
            if (!"libcore.io.DiskLruCache".equals(strM200758n) || !"1".equals(strM200758n2) || !Integer.toString(this.f111253e).equals(strM200758n3) || !Integer.toString(this.f111255g).equals(strM200758n4) || !"".equals(strM200758n5)) {
                throw new IOException("unexpected journal header: [" + strM200758n + ", " + strM200758n2 + ", " + strM200758n4 + ", " + strM200758n5 + Constants.AES_SUFFIX);
            }
            int i = 0;
            while (true) {
                try {
                    m134168Q(vzf0Var.m200758n());
                    i++;
                } catch (EOFException unused) {
                    this.f111259k = i - this.f111258j.size();
                    if (vzf0Var.m200757m()) {
                        m134169S();
                    } else {
                        this.f111257i = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.f111250b, true), cdk0.f80374a));
                    }
                    cdk0.m106252a(vzf0Var);
                    return;
                }
            }
        } catch (Throwable th) {
            cdk0.m106252a(vzf0Var);
            throw th;
        }
    }

    /* JADX INFO: renamed from: Q */
    private void m134168Q(String str) throws IOException {
        String strSubstring;
        int iIndexOf = str.indexOf(32);
        if (iIndexOf == -1) {
            rhg0.m179353a("unexpected journal line: ".concat(str));
            return;
        }
        int i = iIndexOf + 1;
        int iIndexOf2 = str.indexOf(32, i);
        if (iIndexOf2 == -1) {
            strSubstring = str.substring(i);
            if (iIndexOf == 6 && str.startsWith("REMOVE")) {
                this.f111258j.remove(strSubstring);
                return;
            }
        } else {
            strSubstring = str.substring(i, iIndexOf2);
        }
        C17471d c17471d = this.f111258j.get(strSubstring);
        CallableC17468a callableC17468a = null;
        if (c17471d == null) {
            c17471d = new C17471d(this, strSubstring, callableC17468a);
            this.f111258j.put(strSubstring, c17471d);
        }
        if (iIndexOf2 != -1 && iIndexOf == 5 && str.startsWith("CLEAN")) {
            String[] strArrSplit = str.substring(iIndexOf2 + 1).split(MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR);
            c17471d.f111272e = true;
            c17471d.f111273f = null;
            c17471d.m134205n(strArrSplit);
            return;
        }
        if (iIndexOf2 == -1 && iIndexOf == 5 && str.startsWith("DIRTY")) {
            c17471d.f111273f = new C17470c(this, c17471d, callableC17468a);
        } else {
            if (iIndexOf2 == -1 && iIndexOf == 4 && str.startsWith("READ")) {
                return;
            }
            rhg0.m179353a("unexpected journal line: ".concat(str));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: S */
    public synchronized void m134169S() throws IOException {
        try {
            Writer writer = this.f111257i;
            if (writer != null) {
                m134181n(writer);
            }
            BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.f111251c), cdk0.f80374a));
            try {
                bufferedWriter.write("libcore.io.DiskLruCache");
                bufferedWriter.write(SignParameters.NEW_LINE);
                bufferedWriter.write("1");
                bufferedWriter.write(SignParameters.NEW_LINE);
                bufferedWriter.write(Integer.toString(this.f111253e));
                bufferedWriter.write(SignParameters.NEW_LINE);
                bufferedWriter.write(Integer.toString(this.f111255g));
                bufferedWriter.write(SignParameters.NEW_LINE);
                bufferedWriter.write(SignParameters.NEW_LINE);
                for (C17471d c17471d : this.f111258j.values()) {
                    if (c17471d.f111273f != null) {
                        bufferedWriter.write("DIRTY " + c17471d.f111268a + '\n');
                    } else {
                        bufferedWriter.write("CLEAN " + c17471d.f111268a + c17471d.m134208l() + '\n');
                    }
                }
                m134181n(bufferedWriter);
                if (this.f111250b.exists()) {
                    m134170Y(this.f111250b, this.f111252d, true);
                }
                m134170Y(this.f111251c, this.f111250b, false);
                this.f111252d.delete();
                this.f111257i = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.f111250b, true), cdk0.f80374a));
            } catch (Throwable th) {
                m134181n(bufferedWriter);
                throw th;
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* JADX INFO: renamed from: Y */
    private static void m134170Y(File file, File file2, boolean z) throws IOException {
        if (z) {
            m134183u(file2);
        }
        if (!file.renameTo(file2)) {
            throw new IOException();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Z */
    public void m134171Z() throws IOException {
        while (this.f111256h > this.f111254f) {
            m134185T(this.f111258j.entrySet().iterator().next().getKey());
        }
    }

    /* JADX INFO: renamed from: m */
    private void m134180m() {
        if (this.f111257i != null) {
            return;
        }
        qkq0.m175383a("cache is closed");
    }

    @TargetApi(26)
    /* JADX INFO: renamed from: n */
    private static void m134181n(Writer writer) throws IOException {
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
    public synchronized void m134182q(C17470c c17470c, boolean z) throws IOException {
        C17471d c17471d = c17470c.f111264a;
        if (c17471d.f111273f != c17470c) {
            throw new IllegalStateException();
        }
        if (z && !c17471d.f111272e) {
            for (int i = 0; i < this.f111255g; i++) {
                if (!c17470c.f111265b[i]) {
                    c17470c.m134191a();
                    throw new IllegalStateException("Newly created entry didn't create value for index " + i);
                }
                if (!c17471d.m134207k(i).exists()) {
                    c17470c.m134191a();
                    return;
                }
            }
        }
        for (int i2 = 0; i2 < this.f111255g; i2++) {
            File fileM134207k = c17471d.m134207k(i2);
            if (!z) {
                m134183u(fileM134207k);
            } else if (fileM134207k.exists()) {
                File fileM134206j = c17471d.m134206j(i2);
                fileM134207k.renameTo(fileM134206j);
                long j = c17471d.f111269b[i2];
                long length = fileM134206j.length();
                c17471d.f111269b[i2] = length;
                this.f111256h = (this.f111256h - j) + length;
            }
        }
        this.f111259k++;
        c17471d.f111273f = null;
        if (c17471d.f111272e || z) {
            c17471d.f111272e = true;
            this.f111257i.append((CharSequence) "CLEAN");
            this.f111257i.append(' ');
            this.f111257i.append((CharSequence) c17471d.f111268a);
            this.f111257i.append((CharSequence) c17471d.m134208l());
            this.f111257i.append('\n');
            if (z) {
                long j2 = this.f111260l;
                this.f111260l = 1 + j2;
                c17471d.f111274g = j2;
            }
        } else {
            this.f111258j.remove(c17471d.f111268a);
            this.f111257i.append((CharSequence) "REMOVE");
            this.f111257i.append(' ');
            this.f111257i.append((CharSequence) c17471d.f111268a);
            this.f111257i.append('\n');
        }
        m134163F(this.f111257i);
        if (this.f111256h > this.f111254f || m134164I()) {
            this.f111261m.submit(this.f111262n);
        }
    }

    /* JADX INFO: renamed from: u */
    private static void m134183u(File file) throws IOException {
        if (file.exists() && !file.delete()) {
            throw new IOException();
        }
    }

    /* JADX INFO: renamed from: H */
    public synchronized C17472e m134184H(String str) throws IOException {
        Throwable th;
        try {
            try {
                m134180m();
                C17471d c17471d = this.f111258j.get(str);
                if (c17471d == null) {
                    return null;
                }
                if (!c17471d.f111272e) {
                    return null;
                }
                for (File file : c17471d.f111270c) {
                    try {
                        if (!file.exists()) {
                            return null;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                    }
                }
                this.f111259k++;
                this.f111257i.append((CharSequence) "READ");
                this.f111257i.append(' ');
                this.f111257i.append((CharSequence) str);
                this.f111257i.append('\n');
                if (m134164I()) {
                    this.f111261m.submit(this.f111262n);
                }
                return new C17472e(this, str, c17471d.f111274g, c17471d.f111270c, c17471d.f111269b, null);
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

    /* JADX INFO: renamed from: T */
    public synchronized boolean m134185T(String str) throws IOException {
        try {
            m134180m();
            C17471d c17471d = this.f111258j.get(str);
            if (c17471d != null && c17471d.f111273f == null) {
                for (int i = 0; i < this.f111255g; i++) {
                    File fileM134206j = c17471d.m134206j(i);
                    if (fileM134206j.exists() && !fileM134206j.delete()) {
                        throw new IOException("failed to delete " + fileM134206j);
                    }
                    this.f111256h -= c17471d.f111269b[i];
                    c17471d.f111269b[i] = 0;
                }
                this.f111259k++;
                this.f111257i.append((CharSequence) "REMOVE");
                this.f111257i.append(' ');
                this.f111257i.append((CharSequence) str);
                this.f111257i.append('\n');
                this.f111258j.remove(str);
                if (m134164I()) {
                    this.f111261m.submit(this.f111262n);
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
            if (this.f111257i == null) {
                return;
            }
            for (C17471d c17471d : new ArrayList(this.f111258j.values())) {
                if (c17471d.f111273f != null) {
                    c17471d.f111273f.m134191a();
                }
            }
            m134171Z();
            m134181n(this.f111257i);
            this.f111257i = null;
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: t */
    public void m134186t() throws IOException {
        close();
        cdk0.m106253b(this.f111249a);
    }

    /* JADX INFO: renamed from: v */
    public C17470c m134187v(String str) throws IOException {
        return m134162B(str, -1L);
    }

    /* JADX INFO: renamed from: l.i3e$b */
    public static final class ThreadFactoryC17469b implements ThreadFactory {
        private ThreadFactoryC17469b() {
        }

        @Override // java.util.concurrent.ThreadFactory
        public synchronized Thread newThread(Runnable runnable) {
            Thread thread;
            thread = new Thread(runnable, "glide-disk-lru-cache-thread");
            thread.setPriority(1);
            return thread;
        }

        public /* synthetic */ ThreadFactoryC17469b(CallableC17468a callableC17468a) {
            this();
        }
    }

    /* JADX INFO: renamed from: l.i3e$e */
    public final class C17472e {

        /* JADX INFO: renamed from: a */
        private final String f111276a;

        /* JADX INFO: renamed from: b */
        private final long f111277b;

        /* JADX INFO: renamed from: c */
        private final long[] f111278c;

        /* JADX INFO: renamed from: d */
        private final File[] f111279d;

        private C17472e(String str, long j, File[] fileArr, long[] jArr) {
            this.f111276a = str;
            this.f111277b = j;
            this.f111279d = fileArr;
            this.f111278c = jArr;
        }

        /* JADX INFO: renamed from: a */
        public File m134209a(int i) {
            return this.f111279d[i];
        }

        public /* synthetic */ C17472e(i3e i3eVar, String str, long j, File[] fileArr, long[] jArr, CallableC17468a callableC17468a) {
            this(str, j, fileArr, jArr);
        }
    }

    /* JADX INFO: renamed from: l.i3e$c */
    public final class C17470c {

        /* JADX INFO: renamed from: a */
        private final C17471d f111264a;

        /* JADX INFO: renamed from: b */
        private final boolean[] f111265b;

        /* JADX INFO: renamed from: c */
        private boolean f111266c;

        private C17470c(C17471d c17471d) {
            this.f111264a = c17471d;
            this.f111265b = c17471d.f111272e ? null : new boolean[i3e.this.f111255g];
        }

        /* JADX INFO: renamed from: a */
        public void m134191a() throws IOException {
            i3e.this.m134182q(this, false);
        }

        /* JADX INFO: renamed from: b */
        public void m134192b() {
            if (this.f111266c) {
                return;
            }
            try {
                m134191a();
            } catch (IOException unused) {
            }
        }

        /* JADX INFO: renamed from: e */
        public void m134193e() throws IOException {
            i3e.this.m134182q(this, true);
            this.f111266c = true;
        }

        /* JADX INFO: renamed from: f */
        public File m134194f(int i) throws IOException {
            File fileM134207k;
            synchronized (i3e.this) {
                try {
                    if (this.f111264a.f111273f != this) {
                        throw new IllegalStateException();
                    }
                    if (!this.f111264a.f111272e) {
                        this.f111265b[i] = true;
                    }
                    fileM134207k = this.f111264a.m134207k(i);
                    if (!i3e.this.f111249a.exists()) {
                        i3e.this.f111249a.mkdirs();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return fileM134207k;
        }

        public /* synthetic */ C17470c(i3e i3eVar, C17471d c17471d, CallableC17468a callableC17468a) {
            this(c17471d);
        }
    }

    /* JADX INFO: renamed from: l.i3e$d */
    public final class C17471d {

        /* JADX INFO: renamed from: a */
        private final String f111268a;

        /* JADX INFO: renamed from: b */
        private final long[] f111269b;

        /* JADX INFO: renamed from: c */
        File[] f111270c;

        /* JADX INFO: renamed from: d */
        File[] f111271d;

        /* JADX INFO: renamed from: e */
        private boolean f111272e;

        /* JADX INFO: renamed from: f */
        private C17470c f111273f;

        /* JADX INFO: renamed from: g */
        private long f111274g;

        private C17471d(String str) {
            this.f111268a = str;
            this.f111269b = new long[i3e.this.f111255g];
            this.f111270c = new File[i3e.this.f111255g];
            this.f111271d = new File[i3e.this.f111255g];
            StringBuilder sb = new StringBuilder(str);
            sb.append('.');
            int length = sb.length();
            for (int i = 0; i < i3e.this.f111255g; i++) {
                sb.append(i);
                this.f111270c[i] = new File(i3e.this.f111249a, sb.toString());
                sb.append(".tmp");
                this.f111271d[i] = new File(i3e.this.f111249a, sb.toString());
                sb.setLength(length);
            }
        }

        /* JADX INFO: renamed from: m */
        private IOException m134204m(String[] strArr) throws IOException {
            throw new IOException("unexpected journal line: " + Arrays.toString(strArr));
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: n */
        public void m134205n(String[] strArr) throws IOException {
            if (strArr.length != i3e.this.f111255g) {
                throw m134204m(strArr);
            }
            for (int i = 0; i < strArr.length; i++) {
                try {
                    this.f111269b[i] = Long.parseLong(strArr[i]);
                } catch (NumberFormatException unused) {
                    throw m134204m(strArr);
                }
            }
        }

        /* JADX INFO: renamed from: j */
        public File m134206j(int i) {
            return this.f111270c[i];
        }

        /* JADX INFO: renamed from: k */
        public File m134207k(int i) {
            return this.f111271d[i];
        }

        /* JADX INFO: renamed from: l */
        public String m134208l() throws IOException {
            StringBuilder sb = new StringBuilder();
            for (long j : this.f111269b) {
                sb.append(' ');
                sb.append(j);
            }
            return sb.toString();
        }

        public /* synthetic */ C17471d(i3e i3eVar, String str, CallableC17468a callableC17468a) {
            this(str);
        }
    }
}
