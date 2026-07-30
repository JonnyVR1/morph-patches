package p149l;

import android.os.SystemClock;
import android.text.TextUtils;
import androidx.annotation.VisibleForTesting;
import com.android.volley.C0919e;
import com.android.volley.InterfaceC0915a;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class k2e implements InterfaceC0915a {

    /* JADX INFO: renamed from: a */
    private final Map<String, C17914a> f120711a;

    /* JADX INFO: renamed from: b */
    private long f120712b;

    /* JADX INFO: renamed from: c */
    private final InterfaceC17916c f120713c;

    /* JADX INFO: renamed from: d */
    private final int f120714d;

    /* JADX INFO: renamed from: l.k2e$c */
    public interface InterfaceC17916c {
        File get();
    }

    public k2e(InterfaceC17916c interfaceC17916c, int i) {
        this.f120711a = new LinkedHashMap(16, 0.75f, true);
        this.f120712b = 0L;
        this.f120713c = interfaceC17916c;
        this.f120714d = i;
    }

    /* JADX INFO: renamed from: f */
    private String m144278f(String str) {
        int length = str.length() / 2;
        return String.valueOf(str.substring(0, length).hashCode()) + String.valueOf(str.substring(length).hashCode());
    }

    /* JADX INFO: renamed from: g */
    private void m144279g() {
        if (this.f120713c.get().exists()) {
            return;
        }
        C0919e.m5099b("Re-initializing cache after external clearing.", new Object[0]);
        this.f120711a.clear();
        this.f120712b = 0L;
        initialize();
    }

    /* JADX INFO: renamed from: h */
    private void m144280h() {
        if (this.f120712b < this.f120714d) {
            return;
        }
        int i = 0;
        if (C0919e.f4171b) {
            C0919e.m5102e("Pruning old cache entries.", new Object[0]);
        }
        long j = this.f120712b;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        Iterator<Map.Entry<String, C17914a>> it = this.f120711a.entrySet().iterator();
        while (it.hasNext()) {
            C17914a value = it.next().getValue();
            if (m144295e(value.f120716b).delete()) {
                this.f120712b -= value.f120715a;
            } else {
                String str = value.f120716b;
                C0919e.m5099b("Could not delete cache entry for key=%s, filename=%s", str, m144278f(str));
            }
            it.remove();
            i++;
            if (this.f120712b < this.f120714d * 0.9f) {
                break;
            }
        }
        if (C0919e.f4171b) {
            C0919e.m5102e("pruned %d files, %d bytes, %d ms", Integer.valueOf(i), Long.valueOf(this.f120712b - j), Long.valueOf(SystemClock.elapsedRealtime() - jElapsedRealtime));
        }
    }

    /* JADX INFO: renamed from: i */
    private void m144281i(String str, C17914a c17914a) {
        if (this.f120711a.containsKey(str)) {
            this.f120712b += c17914a.f120715a - this.f120711a.get(str).f120715a;
        } else {
            this.f120712b += c17914a.f120715a;
        }
        this.f120711a.put(str, c17914a);
    }

    /* JADX INFO: renamed from: j */
    private static int m144282j(InputStream inputStream) throws IOException {
        int i = inputStream.read();
        if (i != -1) {
            return i;
        }
        hg3.m130807a();
        return 0;
    }

    /* JADX INFO: renamed from: k */
    public static List<ixk> m144283k(C17915b c17915b) throws IOException {
        int iM144284l = m144284l(c17915b);
        if (iM144284l < 0) {
            juq0.m143339a("readHeaderList size=", iM144284l);
            return null;
        }
        List<ixk> arrayList = iM144284l == 0 ? Collections.EMPTY_LIST : new ArrayList<>();
        for (int i = 0; i < iM144284l; i++) {
            arrayList.add(new ixk(m144286n(c17915b).intern(), m144286n(c17915b).intern()));
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: l */
    public static int m144284l(InputStream inputStream) throws IOException {
        return (m144282j(inputStream) << 24) | m144282j(inputStream) | (m144282j(inputStream) << 8) | (m144282j(inputStream) << 16);
    }

    /* JADX INFO: renamed from: m */
    public static long m144285m(InputStream inputStream) throws IOException {
        return (((long) m144282j(inputStream)) & 255) | ((((long) m144282j(inputStream)) & 255) << 8) | ((((long) m144282j(inputStream)) & 255) << 16) | ((((long) m144282j(inputStream)) & 255) << 24) | ((((long) m144282j(inputStream)) & 255) << 32) | ((((long) m144282j(inputStream)) & 255) << 40) | ((((long) m144282j(inputStream)) & 255) << 48) | ((255 & ((long) m144282j(inputStream))) << 56);
    }

    /* JADX INFO: renamed from: n */
    public static String m144286n(C17915b c17915b) throws IOException {
        return new String(m144288q(c17915b, m144285m(c17915b)), "UTF-8");
    }

    /* JADX INFO: renamed from: p */
    private void m144287p(String str) {
        C17914a c17914aRemove = this.f120711a.remove(str);
        if (c17914aRemove != null) {
            this.f120712b -= c17914aRemove.f120715a;
        }
    }

    @VisibleForTesting
    /* JADX INFO: renamed from: q */
    public static byte[] m144288q(C17915b c17915b, long j) throws IOException {
        long jM144301k = c17915b.m144301k();
        if (j >= 0 && j <= jM144301k) {
            int i = (int) j;
            if (i == j) {
                byte[] bArr = new byte[i];
                new DataInputStream(c17915b).readFully(bArr);
                return bArr;
            }
        }
        z9g0.m217667a("streamToBytes length=", j, ", maxLength=", jM144301k);
        return null;
    }

    /* JADX INFO: renamed from: r */
    public static void m144289r(List<ixk> list, OutputStream outputStream) throws IOException {
        if (list == null) {
            m144290s(outputStream, 0);
            return;
        }
        m144290s(outputStream, list.size());
        for (ixk ixkVar : list) {
            m144292u(outputStream, ixkVar.m138849a());
            m144292u(outputStream, ixkVar.m138850b());
        }
    }

    /* JADX INFO: renamed from: s */
    public static void m144290s(OutputStream outputStream, int i) throws IOException {
        outputStream.write(i & 255);
        outputStream.write((i >> 8) & 255);
        outputStream.write((i >> 16) & 255);
        outputStream.write((i >> 24) & 255);
    }

    /* JADX INFO: renamed from: t */
    public static void m144291t(OutputStream outputStream, long j) throws IOException {
        outputStream.write((byte) j);
        outputStream.write((byte) (j >>> 8));
        outputStream.write((byte) (j >>> 16));
        outputStream.write((byte) (j >>> 24));
        outputStream.write((byte) (j >>> 32));
        outputStream.write((byte) (j >>> 40));
        outputStream.write((byte) (j >>> 48));
        outputStream.write((byte) (j >>> 56));
    }

    /* JADX INFO: renamed from: u */
    public static void m144292u(OutputStream outputStream, String str) throws IOException {
        byte[] bytes = str.getBytes("UTF-8");
        m144291t(outputStream, bytes.length);
        outputStream.write(bytes, 0, bytes.length);
    }

    @Override // com.android.volley.InterfaceC0915a
    /* JADX INFO: renamed from: a */
    public synchronized void mo5081a(String str, boolean z) {
        try {
            InterfaceC0915a.a aVar = get(str);
            if (aVar != null) {
                aVar.f4149f = 0L;
                if (z) {
                    aVar.f4148e = 0L;
                }
                mo5082b(str, aVar);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.android.volley.InterfaceC0915a
    /* JADX INFO: renamed from: b */
    public synchronized void mo5082b(String str, InterfaceC0915a.a aVar) {
        long j = this.f120712b;
        byte[] bArr = aVar.f4144a;
        long length = j + ((long) bArr.length);
        int i = this.f120714d;
        if (length > i && bArr.length > i * 0.9f) {
            return;
        }
        File fileM144295e = m144295e(str);
        try {
            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(m144294d(fileM144295e));
            C17914a c17914a = new C17914a(str, aVar);
            if (!c17914a.m144300d(bufferedOutputStream)) {
                bufferedOutputStream.close();
                C0919e.m5099b("Failed to write header for %s", fileM144295e.getAbsolutePath());
                throw new IOException();
            }
            bufferedOutputStream.write(aVar.f4144a);
            bufferedOutputStream.close();
            c17914a.f120715a = fileM144295e.length();
            m144281i(str, c17914a);
            m144280h();
        } catch (IOException unused) {
            if (!fileM144295e.delete()) {
                C0919e.m5099b("Could not clean up file %s", fileM144295e.getAbsolutePath());
            }
            m144279g();
        }
    }

    @VisibleForTesting
    /* JADX INFO: renamed from: c */
    public InputStream m144293c(File file) throws FileNotFoundException {
        return new FileInputStream(file);
    }

    @VisibleForTesting
    /* JADX INFO: renamed from: d */
    public OutputStream m144294d(File file) throws FileNotFoundException {
        return new FileOutputStream(file);
    }

    /* JADX INFO: renamed from: e */
    public File m144295e(String str) {
        return new File(this.f120713c.get(), m144278f(str));
    }

    @Override // com.android.volley.InterfaceC0915a
    public synchronized InterfaceC0915a.a get(String str) {
        C17914a c17914a = this.f120711a.get(str);
        if (c17914a == null) {
            return null;
        }
        File fileM144295e = m144295e(str);
        try {
            C17915b c17915b = new C17915b(new BufferedInputStream(m144293c(fileM144295e)), fileM144295e.length());
            try {
                C17914a c17914aM144298b = C17914a.m144298b(c17915b);
                if (TextUtils.equals(str, c17914aM144298b.f120716b)) {
                    InterfaceC0915a.a aVarM144299c = c17914a.m144299c(m144288q(c17915b, c17915b.m144301k()));
                    c17915b.close();
                    return aVarM144299c;
                }
                C0919e.m5099b("%s: key=%s, found=%s", fileM144295e.getAbsolutePath(), str, c17914aM144298b.f120716b);
                m144287p(str);
                c17915b.close();
                return null;
            } catch (Throwable th) {
                c17915b.close();
                throw th;
            }
        } catch (IOException e) {
            C0919e.m5099b("%s: %s", fileM144295e.getAbsolutePath(), e.toString());
            m144296o(str);
            return null;
        }
    }

    @Override // com.android.volley.InterfaceC0915a
    public synchronized void initialize() {
        File file = this.f120713c.get();
        if (!file.exists()) {
            if (!file.mkdirs()) {
                C0919e.m5100c("Unable to create cache dir %s", file.getAbsolutePath());
            }
            return;
        }
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles == null) {
            return;
        }
        for (File file2 : fileArrListFiles) {
            try {
                long length = file2.length();
                C17915b c17915b = new C17915b(new BufferedInputStream(m144293c(file2)), length);
                try {
                    C17914a c17914aM144298b = C17914a.m144298b(c17915b);
                    c17914aM144298b.f120715a = length;
                    m144281i(c17914aM144298b.f120716b, c17914aM144298b);
                    c17915b.close();
                } catch (Throwable th) {
                    c17915b.close();
                    throw th;
                }
            } catch (IOException unused) {
                file2.delete();
            }
        }
    }

    /* JADX INFO: renamed from: o */
    public synchronized void m144296o(String str) {
        boolean zDelete = m144295e(str).delete();
        m144287p(str);
        if (!zDelete) {
            C0919e.m5099b("Could not delete cache entry for key=%s, filename=%s", str, m144278f(str));
        }
    }

    /* JADX INFO: renamed from: l.k2e$b */
    @VisibleForTesting
    public static class C17915b extends FilterInputStream {

        /* JADX INFO: renamed from: a */
        private final long f120723a;

        /* JADX INFO: renamed from: b */
        private long f120724b;

        public C17915b(InputStream inputStream, long j) {
            super(inputStream);
            this.f120723a = j;
        }

        /* JADX INFO: renamed from: k */
        public long m144301k() {
            return this.f120723a - this.f120724b;
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public int read() throws IOException {
            int i = super.read();
            if (i != -1) {
                this.f120724b++;
            }
            return i;
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public int read(byte[] bArr, int i, int i2) throws IOException {
            int i3 = super.read(bArr, i, i2);
            if (i3 != -1) {
                this.f120724b += (long) i3;
            }
            return i3;
        }
    }

    public k2e(InterfaceC17916c interfaceC17916c) {
        this(interfaceC17916c, 5242880);
    }

    /* JADX INFO: renamed from: l.k2e$a */
    @VisibleForTesting
    public static class C17914a {

        /* JADX INFO: renamed from: a */
        long f120715a;

        /* JADX INFO: renamed from: b */
        final String f120716b;

        /* JADX INFO: renamed from: c */
        final String f120717c;

        /* JADX INFO: renamed from: d */
        final long f120718d;

        /* JADX INFO: renamed from: e */
        final long f120719e;

        /* JADX INFO: renamed from: f */
        final long f120720f;

        /* JADX INFO: renamed from: g */
        final long f120721g;

        /* JADX INFO: renamed from: h */
        final List<ixk> f120722h;

        private C17914a(String str, String str2, long j, long j2, long j3, long j4, List<ixk> list) {
            this.f120716b = str;
            this.f120717c = "".equals(str2) ? null : str2;
            this.f120718d = j;
            this.f120719e = j2;
            this.f120720f = j3;
            this.f120721g = j4;
            this.f120722h = list;
        }

        /* JADX INFO: renamed from: a */
        private static List<ixk> m144297a(InterfaceC0915a.a aVar) {
            List<ixk> list = aVar.f4151h;
            return list != null ? list : jkl.m141891h(aVar.f4150g);
        }

        /* JADX INFO: renamed from: b */
        public static C17914a m144298b(C17915b c17915b) throws IOException {
            if (k2e.m144284l(c17915b) == 538247942) {
                return new C17914a(k2e.m144286n(c17915b), k2e.m144286n(c17915b), k2e.m144285m(c17915b), k2e.m144285m(c17915b), k2e.m144285m(c17915b), k2e.m144285m(c17915b), k2e.m144283k(c17915b));
            }
            throw new IOException();
        }

        /* JADX INFO: renamed from: c */
        public InterfaceC0915a.a m144299c(byte[] bArr) {
            InterfaceC0915a.a aVar = new InterfaceC0915a.a();
            aVar.f4144a = bArr;
            aVar.f4145b = this.f120717c;
            aVar.f4146c = this.f120718d;
            aVar.f4147d = this.f120719e;
            aVar.f4148e = this.f120720f;
            aVar.f4149f = this.f120721g;
            aVar.f4150g = jkl.m141892i(this.f120722h);
            aVar.f4151h = Collections.unmodifiableList(this.f120722h);
            return aVar;
        }

        /* JADX INFO: renamed from: d */
        public boolean m144300d(OutputStream outputStream) {
            try {
                k2e.m144290s(outputStream, 538247942);
                k2e.m144292u(outputStream, this.f120716b);
                String str = this.f120717c;
                if (str == null) {
                    str = "";
                }
                k2e.m144292u(outputStream, str);
                k2e.m144291t(outputStream, this.f120718d);
                k2e.m144291t(outputStream, this.f120719e);
                k2e.m144291t(outputStream, this.f120720f);
                k2e.m144291t(outputStream, this.f120721g);
                k2e.m144289r(this.f120722h, outputStream);
                outputStream.flush();
                return true;
            } catch (IOException e) {
                C0919e.m5099b("%s", e.toString());
                return false;
            }
        }

        public C17914a(String str, InterfaceC0915a.a aVar) {
            this(str, aVar.f4145b, aVar.f4146c, aVar.f4147d, aVar.f4148e, aVar.f4149f, m144297a(aVar));
        }
    }
}
