package p149l;

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
public final class j3e implements Closeable, Flushable {

    /* JADX INFO: renamed from: u */
    public static final Pattern f116026u = Pattern.compile("[a-z0-9_-]{1,120}");

    /* JADX INFO: renamed from: a */
    public final ehi f116027a;

    /* JADX INFO: renamed from: b */
    public final File f116028b;

    /* JADX INFO: renamed from: c */
    public final File f116029c;

    /* JADX INFO: renamed from: d */
    public final File f116030d;

    /* JADX INFO: renamed from: e */
    public final File f116031e;

    /* JADX INFO: renamed from: f */
    public final int f116032f;

    /* JADX INFO: renamed from: g */
    public long f116033g;

    /* JADX INFO: renamed from: h */
    public final int f116034h;

    /* JADX INFO: renamed from: j */
    public BufferedSink f116036j;

    /* JADX INFO: renamed from: l */
    public int f116038l;

    /* JADX INFO: renamed from: m */
    public boolean f116039m;

    /* JADX INFO: renamed from: n */
    public boolean f116040n;

    /* JADX INFO: renamed from: o */
    public boolean f116041o;

    /* JADX INFO: renamed from: p */
    public boolean f116042p;

    /* JADX INFO: renamed from: q */
    public boolean f116043q;

    /* JADX INFO: renamed from: s */
    public final Executor f116045s;

    /* JADX INFO: renamed from: i */
    public long f116035i = 0;

    /* JADX INFO: renamed from: k */
    public final LinkedHashMap<String, C17681d> f116037k = new LinkedHashMap<>(0, 0.75f, true);

    /* JADX INFO: renamed from: r */
    public long f116044r = 0;

    /* JADX INFO: renamed from: t */
    public final Runnable f116046t = new RunnableC17680c();

    /* JADX INFO: renamed from: l.j3e$a */
    public class C17678a extends vjg {
        public C17678a(Sink sink) {
            super(sink);
        }

        @Override // p149l.vjg
        /* JADX INFO: renamed from: b */
        public void mo139559b(IOException iOException) {
            j3e.this.f116039m = true;
        }
    }

    /* JADX INFO: renamed from: l.j3e$b */
    public final class C17679b {

        /* JADX INFO: renamed from: a */
        public final C17681d f116048a;

        /* JADX INFO: renamed from: b */
        public final boolean[] f116049b;

        /* JADX INFO: renamed from: c */
        public boolean f116050c;

        /* JADX INFO: renamed from: l.j3e$b$a */
        public class a extends vjg {
            public a(Sink sink) {
                super(sink);
            }

            @Override // p149l.vjg
            /* JADX INFO: renamed from: b */
            public void mo139559b(IOException iOException) {
                synchronized (j3e.this) {
                    C17679b.this.m139562c();
                }
            }
        }

        public C17679b(C17681d c17681d) {
            this.f116048a = c17681d;
            this.f116049b = c17681d.f116058e ? null : new boolean[j3e.this.f116034h];
        }

        /* JADX INFO: renamed from: a */
        public void m139560a() throws IOException {
            synchronized (j3e.this) {
                try {
                    if (this.f116050c) {
                        throw new IllegalStateException();
                    }
                    if (this.f116048a.f116059f == this) {
                        j3e.this.m139554m(this, false);
                    }
                    this.f116050c = true;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        /* JADX INFO: renamed from: b */
        public void m139561b() throws IOException {
            synchronized (j3e.this) {
                try {
                    if (this.f116050c) {
                        throw new IllegalStateException();
                    }
                    if (this.f116048a.f116059f == this) {
                        j3e.this.m139554m(this, true);
                    }
                    this.f116050c = true;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        /* JADX INFO: renamed from: c */
        public void m139562c() {
            if (this.f116048a.f116059f != this) {
                return;
            }
            int i = 0;
            while (true) {
                j3e j3eVar = j3e.this;
                if (i >= j3eVar.f116034h) {
                    this.f116048a.f116059f = null;
                    return;
                } else {
                    try {
                        j3eVar.f116027a.mo116459c(this.f116048a.f116057d[i]);
                    } catch (IOException unused) {
                    }
                    i++;
                }
            }
        }

        /* JADX INFO: renamed from: d */
        public Sink m139563d(int i) {
            synchronized (j3e.this) {
                try {
                    if (this.f116050c) {
                        throw new IllegalStateException();
                    }
                    C17681d c17681d = this.f116048a;
                    if (c17681d.f116059f != this) {
                        return Okio.blackhole();
                    }
                    if (!c17681d.f116058e) {
                        this.f116049b[i] = true;
                    }
                    try {
                        return new a(j3e.this.f116027a.mo116464h(c17681d.f116057d[i]));
                    } catch (FileNotFoundException unused) {
                        return Okio.blackhole();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    /* JADX INFO: renamed from: l.j3e$c */
    public class RunnableC17680c implements Runnable {
        public RunnableC17680c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            synchronized (j3e.this) {
                j3e j3eVar = j3e.this;
                if ((!j3eVar.f116040n) || j3eVar.f116041o) {
                    return;
                }
                try {
                    j3eVar.m139551T();
                } catch (IOException unused) {
                    j3e.this.f116042p = true;
                }
                try {
                    if (j3e.this.m139543F()) {
                        j3e.this.m139548N();
                        j3e.this.f116038l = 0;
                    }
                } catch (IOException unused2) {
                    j3e j3eVar2 = j3e.this;
                    j3eVar2.f116043q = true;
                    j3eVar2.f116036j = Okio.buffer(Okio.blackhole());
                }
            }
        }
    }

    /* JADX INFO: renamed from: l.j3e$d */
    public final class C17681d {

        /* JADX INFO: renamed from: a */
        public final String f116054a;

        /* JADX INFO: renamed from: b */
        public final long[] f116055b;

        /* JADX INFO: renamed from: c */
        public final File[] f116056c;

        /* JADX INFO: renamed from: d */
        public final File[] f116057d;

        /* JADX INFO: renamed from: e */
        public boolean f116058e;

        /* JADX INFO: renamed from: f */
        public C17679b f116059f;

        /* JADX INFO: renamed from: g */
        public long f116060g;

        public C17681d(String str) {
            this.f116054a = str;
            int i = j3e.this.f116034h;
            this.f116055b = new long[i];
            this.f116056c = new File[i];
            this.f116057d = new File[i];
            StringBuilder sb = new StringBuilder(str);
            sb.append('.');
            int length = sb.length();
            for (int i2 = 0; i2 < j3e.this.f116034h; i2++) {
                sb.append(i2);
                this.f116056c[i2] = new File(j3e.this.f116028b, sb.toString());
                sb.append(".tmp");
                this.f116057d[i2] = new File(j3e.this.f116028b, sb.toString());
                sb.setLength(length);
            }
        }

        /* JADX INFO: renamed from: a */
        public final IOException m139564a(String[] strArr) throws IOException {
            throw new IOException("unexpected journal line: " + Arrays.toString(strArr));
        }

        /* JADX INFO: renamed from: b */
        public void m139565b(String[] strArr) throws IOException {
            if (strArr.length != j3e.this.f116034h) {
                throw m139564a(strArr);
            }
            for (int i = 0; i < strArr.length; i++) {
                try {
                    this.f116055b[i] = Long.parseLong(strArr[i]);
                } catch (NumberFormatException unused) {
                    throw m139564a(strArr);
                }
            }
        }

        /* JADX INFO: renamed from: c */
        public C17682e m139566c() {
            j3e j3eVar;
            Source source;
            if (!Thread.holdsLock(j3e.this)) {
                shg0.m184191a();
                return null;
            }
            Source[] sourceArr = new Source[j3e.this.f116034h];
            long[] jArr = (long[]) this.f116055b.clone();
            int i = 0;
            int i2 = 0;
            while (true) {
                try {
                    j3e j3eVar2 = j3e.this;
                    if (i2 >= j3eVar2.f116034h) {
                        return j3eVar2.new C17682e(this.f116054a, this.f116060g, sourceArr, jArr);
                    }
                    sourceArr[i2] = j3eVar2.f116027a.mo116463g(this.f116056c[i2]);
                    i2++;
                } catch (FileNotFoundException unused) {
                    while (true) {
                        j3eVar = j3e.this;
                        if (i >= j3eVar.f116034h || (source = sourceArr[i]) == null) {
                            break;
                        }
                        tck0.m188006g(source);
                        i++;
                    }
                    try {
                        j3eVar.m139550S(this);
                    } catch (IOException unused2) {
                    }
                    return null;
                }
            }
        }

        /* JADX INFO: renamed from: d */
        public void m139567d(BufferedSink bufferedSink) throws IOException {
            for (long j : this.f116055b) {
                bufferedSink.writeByte(32).writeDecimalLong(j);
            }
        }
    }

    /* JADX INFO: renamed from: l.j3e$e */
    public final class C17682e implements Closeable {

        /* JADX INFO: renamed from: a */
        public final String f116062a;

        /* JADX INFO: renamed from: b */
        public final long f116063b;

        /* JADX INFO: renamed from: c */
        public final Source[] f116064c;

        /* JADX INFO: renamed from: d */
        public final long[] f116065d;

        public C17682e(String str, long j, Source[] sourceArr, long[] jArr) {
            this.f116062a = str;
            this.f116063b = j;
            this.f116064c = sourceArr;
            this.f116065d = jArr;
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            for (Source source : this.f116064c) {
                tck0.m188006g(source);
            }
        }

        /* JADX INFO: renamed from: k */
        public C17679b m139568k() throws IOException {
            return j3e.this.m139557u(this.f116062a, this.f116063b);
        }

        /* JADX INFO: renamed from: m */
        public Source m139569m(int i) {
            return this.f116064c[i];
        }
    }

    public j3e(ehi ehiVar, File file, int i, int i2, long j, Executor executor) {
        this.f116027a = ehiVar;
        this.f116028b = file;
        this.f116032f = i;
        this.f116029c = new File(file, "journal");
        this.f116030d = new File(file, "journal.tmp");
        this.f116031e = new File(file, "journal.bkp");
        this.f116034h = i2;
        this.f116033g = j;
        this.f116045s = executor;
    }

    /* JADX INFO: renamed from: n */
    public static j3e m139541n(ehi ehiVar, File file, int i, int i2, long j) {
        if (j <= 0) {
            ig3.m135964a("maxSize <= 0");
            return null;
        }
        if (i2 <= 0) {
            ig3.m135964a("valueCount <= 0");
            return null;
        }
        return new j3e(ehiVar, file, i, i2, j, new ThreadPoolExecutor(0, 1, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), tck0.m187995H("OkHttp DiskLruCache", true)));
    }

    /* JADX INFO: renamed from: B */
    public synchronized void m139542B() throws IOException {
        try {
            if (this.f116040n) {
                return;
            }
            if (this.f116027a.mo116460d(this.f116031e)) {
                boolean zMo116460d = this.f116027a.mo116460d(this.f116029c);
                ehi ehiVar = this.f116027a;
                if (zMo116460d) {
                    ehiVar.mo116459c(this.f116031e);
                } else {
                    ehiVar.mo116458b(this.f116031e, this.f116029c);
                }
            }
            if (this.f116027a.mo116460d(this.f116029c)) {
                try {
                    m139546J();
                    m139545I();
                    this.f116040n = true;
                    return;
                } catch (IOException e) {
                    Platform.get().log(5, "DiskLruCache " + this.f116028b + " is corrupt: " + e.getMessage() + ", removing", e);
                    try {
                        m139555q();
                        this.f116041o = false;
                        m139548N();
                        this.f116040n = true;
                    } catch (Throwable th) {
                        this.f116041o = false;
                        throw th;
                    }
                }
            }
            m139548N();
            this.f116040n = true;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* JADX INFO: renamed from: F */
    public boolean m139543F() {
        int i = this.f116038l;
        return i >= 2000 && i >= this.f116037k.size();
    }

    /* JADX INFO: renamed from: H */
    public final BufferedSink m139544H() throws FileNotFoundException {
        return Okio.buffer(new C17678a(this.f116027a.mo116461e(this.f116029c)));
    }

    /* JADX INFO: renamed from: I */
    public final void m139545I() throws IOException {
        this.f116027a.mo116459c(this.f116030d);
        Iterator<C17681d> it = this.f116037k.values().iterator();
        while (it.hasNext()) {
            C17681d next = it.next();
            int i = 0;
            if (next.f116059f == null) {
                while (i < this.f116034h) {
                    this.f116035i += next.f116055b[i];
                    i++;
                }
            } else {
                next.f116059f = null;
                while (i < this.f116034h) {
                    this.f116027a.mo116459c(next.f116056c[i]);
                    this.f116027a.mo116459c(next.f116057d[i]);
                    i++;
                }
                it.remove();
            }
        }
    }

    /* JADX INFO: renamed from: J */
    public final void m139546J() throws IOException {
        BufferedSource bufferedSourceBuffer = Okio.buffer(this.f116027a.mo116463g(this.f116029c));
        try {
            String utf8LineStrict = bufferedSourceBuffer.readUtf8LineStrict();
            String utf8LineStrict2 = bufferedSourceBuffer.readUtf8LineStrict();
            String utf8LineStrict3 = bufferedSourceBuffer.readUtf8LineStrict();
            String utf8LineStrict4 = bufferedSourceBuffer.readUtf8LineStrict();
            String utf8LineStrict5 = bufferedSourceBuffer.readUtf8LineStrict();
            if (!"libcore.io.DiskLruCache".equals(utf8LineStrict) || !"1".equals(utf8LineStrict2) || !Integer.toString(this.f116032f).equals(utf8LineStrict3) || !Integer.toString(this.f116034h).equals(utf8LineStrict4) || !"".equals(utf8LineStrict5)) {
                throw new IOException("unexpected journal header: [" + utf8LineStrict + ", " + utf8LineStrict2 + ", " + utf8LineStrict4 + ", " + utf8LineStrict5 + Constants.AES_SUFFIX);
            }
            int i = 0;
            while (true) {
                try {
                    m139547M(bufferedSourceBuffer.readUtf8LineStrict());
                    i++;
                } catch (EOFException unused) {
                    this.f116038l = i - this.f116037k.size();
                    if (bufferedSourceBuffer.exhausted()) {
                        this.f116036j = m139544H();
                    } else {
                        m139548N();
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
    public final void m139547M(String str) throws IOException {
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
                this.f116037k.remove(strSubstring);
                return;
            }
        } else {
            strSubstring = str.substring(i, iIndexOf2);
        }
        C17681d c17681d = this.f116037k.get(strSubstring);
        if (c17681d == null) {
            c17681d = new C17681d(strSubstring);
            this.f116037k.put(strSubstring, c17681d);
        }
        if (iIndexOf2 != -1 && iIndexOf == 5 && str.startsWith("CLEAN")) {
            String[] strArrSplit = str.substring(iIndexOf2 + 1).split(MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR);
            c17681d.f116058e = true;
            c17681d.f116059f = null;
            c17681d.m139565b(strArrSplit);
            return;
        }
        if (iIndexOf2 == -1 && iIndexOf == 5 && str.startsWith("DIRTY")) {
            c17681d.f116059f = new C17679b(c17681d);
        } else {
            if (iIndexOf2 == -1 && iIndexOf == 4 && str.startsWith("READ")) {
                return;
            }
            rhg0.m179353a("unexpected journal line: ".concat(str));
        }
    }

    /* JADX INFO: renamed from: N */
    public synchronized void m139548N() throws IOException {
        try {
            BufferedSink bufferedSink = this.f116036j;
            if (bufferedSink != null) {
                bufferedSink.close();
            }
            BufferedSink bufferedSinkBuffer = Okio.buffer(this.f116027a.mo116464h(this.f116030d));
            try {
                bufferedSinkBuffer.writeUtf8("libcore.io.DiskLruCache").writeByte(10);
                bufferedSinkBuffer.writeUtf8("1").writeByte(10);
                bufferedSinkBuffer.writeDecimalLong(this.f116032f).writeByte(10);
                bufferedSinkBuffer.writeDecimalLong(this.f116034h).writeByte(10);
                bufferedSinkBuffer.writeByte(10);
                for (C17681d c17681d : this.f116037k.values()) {
                    if (c17681d.f116059f != null) {
                        bufferedSinkBuffer.writeUtf8("DIRTY").writeByte(32);
                        bufferedSinkBuffer.writeUtf8(c17681d.f116054a);
                        bufferedSinkBuffer.writeByte(10);
                    } else {
                        bufferedSinkBuffer.writeUtf8("CLEAN").writeByte(32);
                        bufferedSinkBuffer.writeUtf8(c17681d.f116054a);
                        c17681d.m139567d(bufferedSinkBuffer);
                        bufferedSinkBuffer.writeByte(10);
                    }
                }
                bufferedSinkBuffer.close();
                if (this.f116027a.mo116460d(this.f116029c)) {
                    this.f116027a.mo116458b(this.f116029c, this.f116031e);
                }
                this.f116027a.mo116458b(this.f116030d, this.f116029c);
                this.f116027a.mo116459c(this.f116031e);
                this.f116036j = m139544H();
                this.f116039m = false;
                this.f116043q = false;
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
    public synchronized boolean m139549Q(String str) throws IOException {
        m139542B();
        m139553k();
        m139552Y(str);
        C17681d c17681d = this.f116037k.get(str);
        if (c17681d == null) {
            return false;
        }
        boolean zM139550S = m139550S(c17681d);
        if (zM139550S && this.f116035i <= this.f116033g) {
            this.f116042p = false;
        }
        return zM139550S;
    }

    /* JADX INFO: renamed from: S */
    public boolean m139550S(C17681d c17681d) throws IOException {
        C17679b c17679b = c17681d.f116059f;
        if (c17679b != null) {
            c17679b.m139562c();
        }
        for (int i = 0; i < this.f116034h; i++) {
            this.f116027a.mo116459c(c17681d.f116056c[i]);
            long j = this.f116035i;
            long[] jArr = c17681d.f116055b;
            this.f116035i = j - jArr[i];
            jArr[i] = 0;
        }
        this.f116038l++;
        this.f116036j.writeUtf8("REMOVE").writeByte(32).writeUtf8(c17681d.f116054a).writeByte(10);
        this.f116037k.remove(c17681d.f116054a);
        if (m139543F()) {
            this.f116045s.execute(this.f116046t);
        }
        return true;
    }

    /* JADX INFO: renamed from: T */
    public void m139551T() throws IOException {
        while (this.f116035i > this.f116033g) {
            m139550S(this.f116037k.values().iterator().next());
        }
        this.f116042p = false;
    }

    /* JADX INFO: renamed from: Y */
    public final void m139552Y(String str) {
        if (f116026u.matcher(str).matches()) {
            return;
        }
        qtc0.m176411a("keys must match regex [a-z0-9_-]{1,120}: \"", str, "\"");
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() throws IOException {
        try {
            if (this.f116040n && !this.f116041o) {
                for (C17681d c17681d : (C17681d[]) this.f116037k.values().toArray(new C17681d[this.f116037k.size()])) {
                    C17679b c17679b = c17681d.f116059f;
                    if (c17679b != null) {
                        c17679b.m139560a();
                    }
                }
                m139551T();
                this.f116036j.close();
                this.f116036j = null;
                this.f116041o = true;
                return;
            }
            this.f116041o = true;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // java.io.Flushable
    public synchronized void flush() throws IOException {
        if (this.f116040n) {
            m139553k();
            m139551T();
            this.f116036j.flush();
        }
    }

    public synchronized boolean isClosed() {
        return this.f116041o;
    }

    /* JADX INFO: renamed from: k */
    public final synchronized void m139553k() {
        if (isClosed()) {
            throw new IllegalStateException("cache is closed");
        }
    }

    /* JADX INFO: renamed from: m */
    public synchronized void m139554m(C17679b c17679b, boolean z) throws IOException {
        C17681d c17681d = c17679b.f116048a;
        if (c17681d.f116059f != c17679b) {
            throw new IllegalStateException();
        }
        if (z && !c17681d.f116058e) {
            for (int i = 0; i < this.f116034h; i++) {
                if (!c17679b.f116049b[i]) {
                    c17679b.m139560a();
                    throw new IllegalStateException("Newly created entry didn't create value for index " + i);
                }
                if (!this.f116027a.mo116460d(c17681d.f116057d[i])) {
                    c17679b.m139560a();
                    return;
                }
            }
        }
        for (int i2 = 0; i2 < this.f116034h; i2++) {
            File file = c17681d.f116057d[i2];
            ehi ehiVar = this.f116027a;
            if (!z) {
                ehiVar.mo116459c(file);
            } else if (ehiVar.mo116460d(file)) {
                File file2 = c17681d.f116056c[i2];
                this.f116027a.mo116458b(file, file2);
                long j = c17681d.f116055b[i2];
                long jMo116462f = this.f116027a.mo116462f(file2);
                c17681d.f116055b[i2] = jMo116462f;
                this.f116035i = (this.f116035i - j) + jMo116462f;
            }
        }
        this.f116038l++;
        c17681d.f116059f = null;
        if (c17681d.f116058e || z) {
            c17681d.f116058e = true;
            this.f116036j.writeUtf8("CLEAN").writeByte(32);
            this.f116036j.writeUtf8(c17681d.f116054a);
            c17681d.m139567d(this.f116036j);
            this.f116036j.writeByte(10);
            if (z) {
                long j2 = this.f116044r;
                this.f116044r = 1 + j2;
                c17681d.f116060g = j2;
            }
        } else {
            this.f116037k.remove(c17681d.f116054a);
            this.f116036j.writeUtf8("REMOVE").writeByte(32);
            this.f116036j.writeUtf8(c17681d.f116054a);
            this.f116036j.writeByte(10);
        }
        this.f116036j.flush();
        if (this.f116035i > this.f116033g || m139543F()) {
            this.f116045s.execute(this.f116046t);
        }
    }

    /* JADX INFO: renamed from: q */
    public void m139555q() throws IOException {
        close();
        this.f116027a.mo116457a(this.f116028b);
    }

    /* JADX INFO: renamed from: t */
    public C17679b m139556t(String str) throws IOException {
        return m139557u(str, -1L);
    }

    /* JADX INFO: renamed from: u */
    public synchronized C17679b m139557u(String str, long j) throws IOException {
        m139542B();
        m139553k();
        m139552Y(str);
        C17681d c17681d = this.f116037k.get(str);
        if (j != -1 && (c17681d == null || c17681d.f116060g != j)) {
            return null;
        }
        if (c17681d != null && c17681d.f116059f != null) {
            return null;
        }
        if (!this.f116042p && !this.f116043q) {
            this.f116036j.writeUtf8("DIRTY").writeByte(32).writeUtf8(str).writeByte(10);
            this.f116036j.flush();
            if (this.f116039m) {
                return null;
            }
            if (c17681d == null) {
                c17681d = new C17681d(str);
                this.f116037k.put(str, c17681d);
            }
            C17679b c17679b = new C17679b(c17681d);
            c17681d.f116059f = c17679b;
            return c17679b;
        }
        this.f116045s.execute(this.f116046t);
        return null;
    }

    /* JADX INFO: renamed from: v */
    public synchronized C17682e m139558v(String str) throws IOException {
        m139542B();
        m139553k();
        m139552Y(str);
        C17681d c17681d = this.f116037k.get(str);
        if (c17681d != null && c17681d.f116058e) {
            C17682e c17682eM139566c = c17681d.m139566c();
            if (c17682eM139566c == null) {
                return null;
            }
            this.f116038l++;
            this.f116036j.writeUtf8("READ").writeByte(32).writeUtf8(str).writeByte(10);
            if (m139543F()) {
                this.f116045s.execute(this.f116046t);
            }
            return c17682eM139566c;
        }
        return null;
    }
}
