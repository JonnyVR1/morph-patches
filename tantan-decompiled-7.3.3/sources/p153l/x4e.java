package p153l;

import com.clevertap.android.sdk.Constants;
import com.fasterxml.jackson.core.util.MinimalPrettyPrinter;
import java.io.Closeable;
import java.io.EOFException;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.Flushable;
import java.io.IOException;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
import okhttp3.internal.platform.Platform;
import okio.BufferedSink;
import okio.BufferedSource;
import okio.Okio;
import okio.Sink;
import okio.Source;

/* JADX INFO: loaded from: classes2.dex */
public final class x4e implements Closeable, Flushable {

    /* JADX INFO: renamed from: u */
    public static final Pattern f192368u = Pattern.compile("[a-z0-9_-]{1,120}");

    /* JADX INFO: renamed from: a */
    public final bki f192369a;

    /* JADX INFO: renamed from: b */
    public final File f192370b;

    /* JADX INFO: renamed from: c */
    public final File f192371c;

    /* JADX INFO: renamed from: d */
    public final File f192372d;

    /* JADX INFO: renamed from: e */
    public final File f192373e;

    /* JADX INFO: renamed from: f */
    public final int f192374f;

    /* JADX INFO: renamed from: g */
    public long f192375g;

    /* JADX INFO: renamed from: h */
    public final int f192376h;

    /* JADX INFO: renamed from: j */
    public BufferedSink f192378j;

    /* JADX INFO: renamed from: l */
    public int f192380l;

    /* JADX INFO: renamed from: m */
    public boolean f192381m;

    /* JADX INFO: renamed from: n */
    public boolean f192382n;

    /* JADX INFO: renamed from: o */
    public boolean f192383o;

    /* JADX INFO: renamed from: p */
    public boolean f192384p;

    /* JADX INFO: renamed from: q */
    public boolean f192385q;

    /* JADX INFO: renamed from: s */
    public final Executor f192387s;

    /* JADX INFO: renamed from: i */
    public long f192377i = 0;

    /* JADX INFO: renamed from: k */
    public final LinkedHashMap<String, C21251d> f192379k = new LinkedHashMap<>(0, 0.75f, true);

    /* JADX INFO: renamed from: r */
    public long f192386r = 0;

    /* JADX INFO: renamed from: t */
    public final Runnable f192388t = new RunnableC21250c();

    /* JADX INFO: renamed from: l.x4e$a */
    public class C21248a extends jlg {
        public C21248a(Sink sink) {
            super(sink);
        }

        @Override // p153l.jlg
        /* JADX INFO: renamed from: b */
        public void mo146061b(IOException iOException) {
            x4e.this.f192381m = true;
        }
    }

    /* JADX INFO: renamed from: l.x4e$b */
    public final class C21249b {

        /* JADX INFO: renamed from: a */
        public final C21251d f192390a;

        /* JADX INFO: renamed from: b */
        public final boolean[] f192391b;

        /* JADX INFO: renamed from: c */
        public boolean f192392c;

        /* JADX INFO: renamed from: l.x4e$b$a */
        public class a extends jlg {
            public a(Sink sink) {
                super(sink);
            }

            @Override // p153l.jlg
            /* JADX INFO: renamed from: b */
            public void mo146061b(IOException iOException) {
                synchronized (x4e.this) {
                    C21249b.this.m209333c();
                }
            }
        }

        public C21249b(C21251d c21251d) {
            this.f192390a = c21251d;
            this.f192391b = c21251d.f192400e ? null : new boolean[x4e.this.f192376h];
        }

        /* JADX INFO: renamed from: a */
        public void m209331a() throws IOException {
            synchronized (x4e.this) {
                try {
                    if (this.f192392c) {
                        throw new IllegalStateException();
                    }
                    if (this.f192390a.f192401f == this) {
                        x4e.this.m209326m(this, false);
                    }
                    this.f192392c = true;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        /* JADX INFO: renamed from: b */
        public void m209332b() throws IOException {
            synchronized (x4e.this) {
                try {
                    if (this.f192392c) {
                        throw new IllegalStateException();
                    }
                    if (this.f192390a.f192401f == this) {
                        x4e.this.m209326m(this, true);
                    }
                    this.f192392c = true;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        /* JADX INFO: renamed from: c */
        public void m209333c() {
            if (this.f192390a.f192401f != this) {
                return;
            }
            int i = 0;
            while (true) {
                x4e x4eVar = x4e.this;
                if (i >= x4eVar.f192376h) {
                    this.f192390a.f192401f = null;
                    return;
                } else {
                    try {
                        x4eVar.f192369a.mo104812c(this.f192390a.f192399d[i]);
                    } catch (IOException unused) {
                    }
                    i++;
                }
            }
        }

        /* JADX INFO: renamed from: d */
        public Sink m209334d(int i) {
            synchronized (x4e.this) {
                try {
                    if (this.f192392c) {
                        throw new IllegalStateException();
                    }
                    C21251d c21251d = this.f192390a;
                    if (c21251d.f192401f != this) {
                        return Okio.blackhole();
                    }
                    if (!c21251d.f192400e) {
                        this.f192391b[i] = true;
                    }
                    try {
                        return new a(x4e.this.f192369a.mo104817h(c21251d.f192399d[i]));
                    } catch (FileNotFoundException unused) {
                        return Okio.blackhole();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    /* JADX INFO: renamed from: l.x4e$c */
    public class RunnableC21250c implements Runnable {
        public RunnableC21250c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            synchronized (x4e.this) {
                x4e x4eVar = x4e.this;
                if ((!x4eVar.f192382n) || x4eVar.f192383o) {
                    return;
                }
                try {
                    x4eVar.m209323U();
                } catch (IOException unused) {
                    x4e.this.f192384p = true;
                }
                try {
                    if (x4e.this.m209315F()) {
                        x4e.this.m209320N();
                        x4e.this.f192380l = 0;
                    }
                } catch (IOException unused2) {
                    x4e x4eVar2 = x4e.this;
                    x4eVar2.f192385q = true;
                    x4eVar2.f192378j = Okio.buffer(Okio.blackhole());
                }
            }
        }
    }

    /* JADX INFO: renamed from: l.x4e$d */
    public final class C21251d {

        /* JADX INFO: renamed from: a */
        public final String f192396a;

        /* JADX INFO: renamed from: b */
        public final long[] f192397b;

        /* JADX INFO: renamed from: c */
        public final File[] f192398c;

        /* JADX INFO: renamed from: d */
        public final File[] f192399d;

        /* JADX INFO: renamed from: e */
        public boolean f192400e;

        /* JADX INFO: renamed from: f */
        public C21249b f192401f;

        /* JADX INFO: renamed from: g */
        public long f192402g;

        public C21251d(String str) {
            this.f192396a = str;
            int i = x4e.this.f192376h;
            this.f192397b = new long[i];
            this.f192398c = new File[i];
            this.f192399d = new File[i];
            StringBuilder sb = new StringBuilder(str);
            sb.append('.');
            int length = sb.length();
            for (int i2 = 0; i2 < x4e.this.f192376h; i2++) {
                sb.append(i2);
                this.f192398c[i2] = new File(x4e.this.f192370b, sb.toString());
                sb.append(".tmp");
                this.f192399d[i2] = new File(x4e.this.f192370b, sb.toString());
                sb.setLength(length);
            }
        }

        /* JADX INFO: renamed from: a */
        public final IOException m209335a(String[] strArr) throws IOException {
            throw new IOException("unexpected journal line: " + Arrays.toString(strArr));
        }

        /* JADX INFO: renamed from: b */
        public void m209336b(String[] strArr) throws IOException {
            if (strArr.length != x4e.this.f192376h) {
                throw m209335a(strArr);
            }
            for (int i = 0; i < strArr.length; i++) {
                try {
                    this.f192397b[i] = Long.parseLong(strArr[i]);
                } catch (NumberFormatException unused) {
                    throw m209335a(strArr);
                }
            }
        }

        /* JADX INFO: renamed from: c */
        public C21252e m209337c() {
            x4e x4eVar;
            Source source;
            if (!Thread.holdsLock(x4e.this)) {
                aqg0.m99478a();
                return null;
            }
            Source[] sourceArr = new Source[x4e.this.f192376h];
            long[] jArr = (long[]) this.f192397b.clone();
            int i = 0;
            int i2 = 0;
            while (true) {
                try {
                    x4e x4eVar2 = x4e.this;
                    if (i2 >= x4eVar2.f192376h) {
                        return x4eVar2.new C21252e(this.f192396a, this.f192402g, sourceArr, jArr);
                    }
                    sourceArr[i2] = x4eVar2.f192369a.mo104816g(this.f192398c[i2]);
                    i2++;
                } catch (FileNotFoundException unused) {
                    while (true) {
                        x4eVar = x4e.this;
                        if (i >= x4eVar.f192376h || (source = sourceArr[i]) == null) {
                            break;
                        }
                        zlk0.m220245g(source);
                        i++;
                    }
                    try {
                        x4eVar.m209322S(this);
                    } catch (IOException unused2) {
                    }
                    return null;
                }
            }
        }

        /* JADX INFO: renamed from: d */
        public void m209338d(BufferedSink bufferedSink) throws IOException {
            for (long j : this.f192397b) {
                bufferedSink.writeByte(32).writeDecimalLong(j);
            }
        }
    }

    /* JADX INFO: renamed from: l.x4e$e */
    public final class C21252e implements Closeable {

        /* JADX INFO: renamed from: a */
        public final String f192404a;

        /* JADX INFO: renamed from: b */
        public final long f192405b;

        /* JADX INFO: renamed from: c */
        public final Source[] f192406c;

        /* JADX INFO: renamed from: d */
        public final long[] f192407d;

        public C21252e(String str, long j, Source[] sourceArr, long[] jArr) {
            this.f192404a = str;
            this.f192405b = j;
            this.f192406c = sourceArr;
            this.f192407d = jArr;
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            for (Source source : this.f192406c) {
                zlk0.m220245g(source);
            }
        }

        /* JADX INFO: renamed from: k */
        public C21249b m209339k() throws IOException {
            return x4e.this.m209329u(this.f192404a, this.f192405b);
        }

        /* JADX INFO: renamed from: m */
        public Source m209340m(int i) {
            return this.f192406c[i];
        }
    }

    public x4e(bki bkiVar, File file, int i, int i2, long j, Executor executor) {
        this.f192369a = bkiVar;
        this.f192370b = file;
        this.f192374f = i;
        this.f192371c = new File(file, "journal");
        this.f192372d = new File(file, "journal.tmp");
        this.f192373e = new File(file, "journal.bkp");
        this.f192376h = i2;
        this.f192375g = j;
        this.f192387s = executor;
    }

    /* JADX INFO: renamed from: n */
    public static x4e m209313n(bki bkiVar, File file, int i, int i2, long j) {
        if (j <= 0) {
            wg3.m206174a("maxSize <= 0");
            return null;
        }
        if (i2 <= 0) {
            wg3.m206174a("valueCount <= 0");
            return null;
        }
        return new x4e(bkiVar, file, i, i2, j, new ThreadPoolExecutor(0, 1, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), zlk0.m220234H("OkHttp DiskLruCache", true)));
    }

    /* JADX INFO: renamed from: B */
    public synchronized void m209314B() throws IOException {
        try {
            if (this.f192382n) {
                return;
            }
            if (this.f192369a.mo104813d(this.f192373e)) {
                boolean zMo104813d = this.f192369a.mo104813d(this.f192371c);
                bki bkiVar = this.f192369a;
                if (zMo104813d) {
                    bkiVar.mo104812c(this.f192373e);
                } else {
                    bkiVar.mo104811b(this.f192373e, this.f192371c);
                }
            }
            if (this.f192369a.mo104813d(this.f192371c)) {
                try {
                    m209318J();
                    m209317I();
                    this.f192382n = true;
                    return;
                } catch (IOException e) {
                    Platform.get().log(5, "DiskLruCache " + this.f192370b + " is corrupt: " + e.getMessage() + ", removing", e);
                    try {
                        m209327q();
                        this.f192383o = false;
                        m209320N();
                        this.f192382n = true;
                    } catch (Throwable th) {
                        this.f192383o = false;
                        throw th;
                    }
                }
            }
            m209320N();
            this.f192382n = true;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* JADX INFO: renamed from: F */
    public boolean m209315F() {
        int i = this.f192380l;
        return i >= 2000 && i >= this.f192379k.size();
    }

    /* JADX INFO: renamed from: H */
    public final BufferedSink m209316H() throws FileNotFoundException {
        return Okio.buffer(new C21248a(this.f192369a.mo104814e(this.f192371c)));
    }

    /* JADX INFO: renamed from: I */
    public final void m209317I() throws IOException {
        this.f192369a.mo104812c(this.f192372d);
        Iterator<C21251d> it = this.f192379k.values().iterator();
        while (it.hasNext()) {
            C21251d next = it.next();
            int i = 0;
            if (next.f192401f == null) {
                while (i < this.f192376h) {
                    this.f192377i += next.f192397b[i];
                    i++;
                }
            } else {
                next.f192401f = null;
                while (i < this.f192376h) {
                    this.f192369a.mo104812c(next.f192398c[i]);
                    this.f192369a.mo104812c(next.f192399d[i]);
                    i++;
                }
                it.remove();
            }
        }
    }

    /* JADX INFO: renamed from: J */
    public final void m209318J() throws IOException {
        BufferedSource bufferedSourceBuffer = Okio.buffer(this.f192369a.mo104816g(this.f192371c));
        try {
            String utf8LineStrict = bufferedSourceBuffer.readUtf8LineStrict();
            String utf8LineStrict2 = bufferedSourceBuffer.readUtf8LineStrict();
            String utf8LineStrict3 = bufferedSourceBuffer.readUtf8LineStrict();
            String utf8LineStrict4 = bufferedSourceBuffer.readUtf8LineStrict();
            String utf8LineStrict5 = bufferedSourceBuffer.readUtf8LineStrict();
            if (!"libcore.io.DiskLruCache".equals(utf8LineStrict) || !"1".equals(utf8LineStrict2) || !Integer.toString(this.f192374f).equals(utf8LineStrict3) || !Integer.toString(this.f192376h).equals(utf8LineStrict4) || !"".equals(utf8LineStrict5)) {
                throw new IOException("unexpected journal header: [" + utf8LineStrict + ", " + utf8LineStrict2 + ", " + utf8LineStrict4 + ", " + utf8LineStrict5 + Constants.AES_SUFFIX);
            }
            int i = 0;
            while (true) {
                try {
                    m209319M(bufferedSourceBuffer.readUtf8LineStrict());
                    i++;
                } catch (EOFException unused) {
                    this.f192380l = i - this.f192379k.size();
                    if (bufferedSourceBuffer.exhausted()) {
                        this.f192378j = m209316H();
                    } else {
                        m209320N();
                    }
                    bufferedSourceBuffer.close();
                    return;
                }
            }
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                if (bufferedSourceBuffer != null) {
                    try {
                        bufferedSourceBuffer.close();
                    } catch (Throwable th3) {
                        th.addSuppressed(th3);
                    }
                }
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: M */
    public final void m209319M(String str) throws IOException {
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
                this.f192379k.remove(strSubstring);
                return;
            }
        } else {
            strSubstring = str.substring(i, iIndexOf2);
        }
        C21251d c21251d = this.f192379k.get(strSubstring);
        if (c21251d == null) {
            c21251d = new C21251d(strSubstring);
            this.f192379k.put(strSubstring, c21251d);
        }
        if (iIndexOf2 != -1 && iIndexOf == 5 && str.startsWith("CLEAN")) {
            String[] strArrSplit = str.substring(iIndexOf2 + 1).split(MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR);
            c21251d.f192400e = true;
            c21251d.f192401f = null;
            c21251d.m209336b(strArrSplit);
            return;
        }
        if (iIndexOf2 == -1 && iIndexOf == 5 && str.startsWith("DIRTY")) {
            c21251d.f192401f = new C21249b(c21251d);
        } else {
            if (iIndexOf2 == -1 && iIndexOf == 4 && str.startsWith("READ")) {
                return;
            }
            zpg0.m220844a("unexpected journal line: ".concat(str));
        }
    }

    /* JADX INFO: renamed from: N */
    public synchronized void m209320N() throws IOException {
        try {
            BufferedSink bufferedSink = this.f192378j;
            if (bufferedSink != null) {
                bufferedSink.close();
            }
            BufferedSink bufferedSinkBuffer = Okio.buffer(this.f192369a.mo104817h(this.f192372d));
            try {
                bufferedSinkBuffer.writeUtf8("libcore.io.DiskLruCache").writeByte(10);
                bufferedSinkBuffer.writeUtf8("1").writeByte(10);
                bufferedSinkBuffer.writeDecimalLong(this.f192374f).writeByte(10);
                bufferedSinkBuffer.writeDecimalLong(this.f192376h).writeByte(10);
                bufferedSinkBuffer.writeByte(10);
                for (C21251d c21251d : this.f192379k.values()) {
                    if (c21251d.f192401f != null) {
                        bufferedSinkBuffer.writeUtf8("DIRTY").writeByte(32);
                        bufferedSinkBuffer.writeUtf8(c21251d.f192396a);
                        bufferedSinkBuffer.writeByte(10);
                    } else {
                        bufferedSinkBuffer.writeUtf8("CLEAN").writeByte(32);
                        bufferedSinkBuffer.writeUtf8(c21251d.f192396a);
                        c21251d.m209338d(bufferedSinkBuffer);
                        bufferedSinkBuffer.writeByte(10);
                    }
                }
                bufferedSinkBuffer.close();
                if (this.f192369a.mo104813d(this.f192371c)) {
                    this.f192369a.mo104811b(this.f192371c, this.f192373e);
                }
                this.f192369a.mo104811b(this.f192372d, this.f192371c);
                this.f192369a.mo104812c(this.f192373e);
                this.f192378j = m209316H();
                this.f192381m = false;
                this.f192385q = false;
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    if (bufferedSinkBuffer != null) {
                        try {
                            bufferedSinkBuffer.close();
                        } catch (Throwable th3) {
                            th.addSuppressed(th3);
                        }
                    }
                    throw th2;
                }
            }
        } catch (Throwable th4) {
            throw th4;
        }
    }

    /* JADX INFO: renamed from: Q */
    public synchronized boolean m209321Q(String str) throws IOException {
        m209314B();
        m209325k();
        m209324Z(str);
        C21251d c21251d = this.f192379k.get(str);
        if (c21251d == null) {
            return false;
        }
        boolean zM209322S = m209322S(c21251d);
        if (zM209322S && this.f192377i <= this.f192375g) {
            this.f192384p = false;
        }
        return zM209322S;
    }

    /* JADX INFO: renamed from: S */
    public boolean m209322S(C21251d c21251d) throws IOException {
        C21249b c21249b = c21251d.f192401f;
        if (c21249b != null) {
            c21249b.m209333c();
        }
        for (int i = 0; i < this.f192376h; i++) {
            this.f192369a.mo104812c(c21251d.f192398c[i]);
            long j = this.f192377i;
            long[] jArr = c21251d.f192397b;
            this.f192377i = j - jArr[i];
            jArr[i] = 0;
        }
        this.f192380l++;
        this.f192378j.writeUtf8("REMOVE").writeByte(32).writeUtf8(c21251d.f192396a).writeByte(10);
        this.f192379k.remove(c21251d.f192396a);
        if (m209315F()) {
            this.f192387s.execute(this.f192388t);
        }
        return true;
    }

    /* JADX INFO: renamed from: U */
    public void m209323U() throws IOException {
        while (this.f192377i > this.f192375g) {
            m209322S(this.f192379k.values().iterator().next());
        }
        this.f192384p = false;
    }

    /* JADX INFO: renamed from: Z */
    public final void m209324Z(String str) {
        if (f192368u.matcher(str).matches()) {
            return;
        }
        v1d0.m199002a("keys must match regex [a-z0-9_-]{1,120}: \"", str, "\"");
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() throws IOException {
        try {
            if (this.f192382n && !this.f192383o) {
                for (C21251d c21251d : (C21251d[]) this.f192379k.values().toArray(new C21251d[this.f192379k.size()])) {
                    C21249b c21249b = c21251d.f192401f;
                    if (c21249b != null) {
                        c21249b.m209331a();
                    }
                }
                m209323U();
                this.f192378j.close();
                this.f192378j = null;
                this.f192383o = true;
                return;
            }
            this.f192383o = true;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // java.io.Flushable
    public synchronized void flush() throws IOException {
        if (this.f192382n) {
            m209325k();
            m209323U();
            this.f192378j.flush();
        }
    }

    public synchronized boolean isClosed() {
        return this.f192383o;
    }

    /* JADX INFO: renamed from: k */
    public final synchronized void m209325k() {
        if (isClosed()) {
            throw new IllegalStateException("cache is closed");
        }
    }

    /* JADX INFO: renamed from: m */
    public synchronized void m209326m(C21249b c21249b, boolean z) throws IOException {
        C21251d c21251d = c21249b.f192390a;
        if (c21251d.f192401f != c21249b) {
            throw new IllegalStateException();
        }
        if (z && !c21251d.f192400e) {
            for (int i = 0; i < this.f192376h; i++) {
                if (!c21249b.f192391b[i]) {
                    c21249b.m209331a();
                    throw new IllegalStateException("Newly created entry didn't create value for index " + i);
                }
                if (!this.f192369a.mo104813d(c21251d.f192399d[i])) {
                    c21249b.m209331a();
                    return;
                }
            }
        }
        for (int i2 = 0; i2 < this.f192376h; i2++) {
            File file = c21251d.f192399d[i2];
            bki bkiVar = this.f192369a;
            if (!z) {
                bkiVar.mo104812c(file);
            } else if (bkiVar.mo104813d(file)) {
                File file2 = c21251d.f192398c[i2];
                this.f192369a.mo104811b(file, file2);
                long j = c21251d.f192397b[i2];
                long jMo104815f = this.f192369a.mo104815f(file2);
                c21251d.f192397b[i2] = jMo104815f;
                this.f192377i = (this.f192377i - j) + jMo104815f;
            }
        }
        this.f192380l++;
        c21251d.f192401f = null;
        if (c21251d.f192400e || z) {
            c21251d.f192400e = true;
            this.f192378j.writeUtf8("CLEAN").writeByte(32);
            this.f192378j.writeUtf8(c21251d.f192396a);
            c21251d.m209338d(this.f192378j);
            this.f192378j.writeByte(10);
            if (z) {
                long j2 = this.f192386r;
                this.f192386r = 1 + j2;
                c21251d.f192402g = j2;
            }
        } else {
            this.f192379k.remove(c21251d.f192396a);
            this.f192378j.writeUtf8("REMOVE").writeByte(32);
            this.f192378j.writeUtf8(c21251d.f192396a);
            this.f192378j.writeByte(10);
        }
        this.f192378j.flush();
        if (this.f192377i > this.f192375g || m209315F()) {
            this.f192387s.execute(this.f192388t);
        }
    }

    /* JADX INFO: renamed from: q */
    public void m209327q() throws IOException {
        close();
        this.f192369a.mo104810a(this.f192370b);
    }

    /* JADX INFO: renamed from: t */
    public C21249b m209328t(String str) throws IOException {
        return m209329u(str, -1L);
    }

    /* JADX INFO: renamed from: u */
    public synchronized C21249b m209329u(String str, long j) throws IOException {
        m209314B();
        m209325k();
        m209324Z(str);
        C21251d c21251d = this.f192379k.get(str);
        if (j != -1 && (c21251d == null || c21251d.f192402g != j)) {
            return null;
        }
        if (c21251d != null && c21251d.f192401f != null) {
            return null;
        }
        if (!this.f192384p && !this.f192385q) {
            this.f192378j.writeUtf8("DIRTY").writeByte(32).writeUtf8(str).writeByte(10);
            this.f192378j.flush();
            if (this.f192381m) {
                return null;
            }
            if (c21251d == null) {
                c21251d = new C21251d(str);
                this.f192379k.put(str, c21251d);
            }
            C21249b c21249b = new C21249b(c21251d);
            c21251d.f192401f = c21249b;
            return c21249b;
        }
        this.f192387s.execute(this.f192388t);
        return null;
    }

    /* JADX INFO: renamed from: v */
    public synchronized C21252e m209330v(String str) throws IOException {
        m209314B();
        m209325k();
        m209324Z(str);
        C21251d c21251d = this.f192379k.get(str);
        if (c21251d != null && c21251d.f192400e) {
            C21252e c21252eM209337c = c21251d.m209337c();
            if (c21252eM209337c == null) {
                return null;
            }
            this.f192380l++;
            this.f192378j.writeUtf8("READ").writeByte(32).writeUtf8(str).writeByte(10);
            if (m209315F()) {
                this.f192387s.execute(this.f192388t);
            }
            return c21252eM209337c;
        }
        return null;
    }
}
