package p153l;

import android.os.SystemClock;
import android.text.TextUtils;
import androidx.annotation.VisibleForTesting;
import com.android.volley.C0923e;
import com.android.volley.InterfaceC0919a;
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
public class y3e implements InterfaceC0919a {

    /* JADX INFO: renamed from: a */
    private final Map<String, C21504a> f197342a;

    /* JADX INFO: renamed from: b */
    private long f197343b;

    /* JADX INFO: renamed from: c */
    private final InterfaceC21506c f197344c;

    /* JADX INFO: renamed from: d */
    private final int f197345d;

    /* JADX INFO: renamed from: l.y3e$c */
    public interface InterfaceC21506c {
        File get();
    }

    public y3e(InterfaceC21506c interfaceC21506c, int i) {
        this.f197342a = new LinkedHashMap(16, 0.75f, true);
        this.f197343b = 0L;
        this.f197344c = interfaceC21506c;
        this.f197345d = i;
    }

    /* JADX INFO: renamed from: f */
    private String m214117f(String str) {
        int length = str.length() / 2;
        return String.valueOf(str.substring(0, length).hashCode()) + String.valueOf(str.substring(length).hashCode());
    }

    /* JADX INFO: renamed from: g */
    private void m214118g() {
        if (this.f197344c.get().exists()) {
            return;
        }
        C0923e.m5109b("Re-initializing cache after external clearing.", new Object[0]);
        this.f197342a.clear();
        this.f197343b = 0L;
        initialize();
    }

    /* JADX INFO: renamed from: h */
    private void m214119h() {
        if (this.f197343b < this.f197345d) {
            return;
        }
        int i = 0;
        if (C0923e.f4171b) {
            C0923e.m5112e("Pruning old cache entries.", new Object[0]);
        }
        long j = this.f197343b;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        Iterator<Map.Entry<String, C21504a>> it = this.f197342a.entrySet().iterator();
        while (it.hasNext()) {
            C21504a value = it.next().getValue();
            if (m214134e(value.f197347b).delete()) {
                this.f197343b -= value.f197346a;
            } else {
                String str = value.f197347b;
                C0923e.m5109b("Could not delete cache entry for key=%s, filename=%s", str, m214117f(str));
            }
            it.remove();
            i++;
            if (this.f197343b < this.f197345d * 0.9f) {
                break;
            }
        }
        if (C0923e.f4171b) {
            C0923e.m5112e("pruned %d files, %d bytes, %d ms", Integer.valueOf(i), Long.valueOf(this.f197343b - j), Long.valueOf(SystemClock.elapsedRealtime() - jElapsedRealtime));
        }
    }

    /* JADX INFO: renamed from: i */
    private void m214120i(String str, C21504a c21504a) {
        if (this.f197342a.containsKey(str)) {
            this.f197343b += c21504a.f197346a - this.f197342a.get(str).f197346a;
        } else {
            this.f197343b += c21504a.f197346a;
        }
        this.f197342a.put(str, c21504a);
    }

    /* JADX INFO: renamed from: j */
    private static int m214121j(InputStream inputStream) throws IOException {
        int i = inputStream.read();
        if (i != -1) {
            return i;
        }
        vg3.m201207a();
        return 0;
    }

    /* JADX INFO: renamed from: k */
    public static List<yzk> m214122k(C21505b c21505b) throws IOException {
        int iM214123l = m214123l(c21505b);
        if (iM214123l < 0) {
            p3r0.m170507a("readHeaderList size=", iM214123l);
            return null;
        }
        List<yzk> arrayList = iM214123l == 0 ? Collections.EMPTY_LIST : new ArrayList<>();
        for (int i = 0; i < iM214123l; i++) {
            arrayList.add(new yzk(m214125n(c21505b).intern(), m214125n(c21505b).intern()));
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: l */
    public static int m214123l(InputStream inputStream) throws IOException {
        return (m214121j(inputStream) << 24) | m214121j(inputStream) | (m214121j(inputStream) << 8) | (m214121j(inputStream) << 16);
    }

    /* JADX INFO: renamed from: m */
    public static long m214124m(InputStream inputStream) throws IOException {
        return (((long) m214121j(inputStream)) & 255) | ((((long) m214121j(inputStream)) & 255) << 8) | ((((long) m214121j(inputStream)) & 255) << 16) | ((((long) m214121j(inputStream)) & 255) << 24) | ((((long) m214121j(inputStream)) & 255) << 32) | ((((long) m214121j(inputStream)) & 255) << 40) | ((((long) m214121j(inputStream)) & 255) << 48) | ((255 & ((long) m214121j(inputStream))) << 56);
    }

    /* JADX INFO: renamed from: n */
    public static String m214125n(C21505b c21505b) throws IOException {
        return new String(m214127q(c21505b, m214124m(c21505b)), "UTF-8");
    }

    /* JADX INFO: renamed from: p */
    private void m214126p(String str) {
        C21504a c21504aRemove = this.f197342a.remove(str);
        if (c21504aRemove != null) {
            this.f197343b -= c21504aRemove.f197346a;
        }
    }

    @VisibleForTesting
    /* JADX INFO: renamed from: q */
    public static byte[] m214127q(C21505b c21505b, long j) throws IOException {
        long jM214140k = c21505b.m214140k();
        if (j >= 0 && j <= jM214140k) {
            int i = (int) j;
            if (i == j) {
                byte[] bArr = new byte[i];
                new DataInputStream(c21505b).readFully(bArr);
                return bArr;
            }
        }
        hig0.m135122a("streamToBytes length=", j, ", maxLength=", jM214140k);
        return null;
    }

    /* JADX INFO: renamed from: r */
    public static void m214128r(List<yzk> list, OutputStream outputStream) throws IOException {
        if (list == null) {
            m214129s(outputStream, 0);
            return;
        }
        m214129s(outputStream, list.size());
        for (yzk yzkVar : list) {
            m214131u(outputStream, yzkVar.m218023a());
            m214131u(outputStream, yzkVar.m218024b());
        }
    }

    /* JADX INFO: renamed from: s */
    public static void m214129s(OutputStream outputStream, int i) throws IOException {
        outputStream.write(i & 255);
        outputStream.write((i >> 8) & 255);
        outputStream.write((i >> 16) & 255);
        outputStream.write((i >> 24) & 255);
    }

    /* JADX INFO: renamed from: t */
    public static void m214130t(OutputStream outputStream, long j) throws IOException {
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
    public static void m214131u(OutputStream outputStream, String str) throws IOException {
        byte[] bytes = str.getBytes("UTF-8");
        m214130t(outputStream, bytes.length);
        outputStream.write(bytes, 0, bytes.length);
    }

    @Override // com.android.volley.InterfaceC0919a
    /* JADX INFO: renamed from: a */
    public synchronized void mo5091a(String str, boolean z) {
        try {
            InterfaceC0919a.a aVar = get(str);
            if (aVar != null) {
                aVar.f4149f = 0L;
                if (z) {
                    aVar.f4148e = 0L;
                }
                mo5092b(str, aVar);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.android.volley.InterfaceC0919a
    /* JADX INFO: renamed from: b */
    public synchronized void mo5092b(String str, InterfaceC0919a.a aVar) {
        long j = this.f197343b;
        byte[] bArr = aVar.f4144a;
        long length = j + ((long) bArr.length);
        int i = this.f197345d;
        if (length > i && bArr.length > i * 0.9f) {
            return;
        }
        File fileM214134e = m214134e(str);
        try {
            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(m214133d(fileM214134e));
            C21504a c21504a = new C21504a(str, aVar);
            if (!c21504a.m214139d(bufferedOutputStream)) {
                bufferedOutputStream.close();
                C0923e.m5109b("Failed to write header for %s", fileM214134e.getAbsolutePath());
                throw new IOException();
            }
            bufferedOutputStream.write(aVar.f4144a);
            bufferedOutputStream.close();
            c21504a.f197346a = fileM214134e.length();
            m214120i(str, c21504a);
            m214119h();
        } catch (IOException unused) {
            if (!fileM214134e.delete()) {
                C0923e.m5109b("Could not clean up file %s", fileM214134e.getAbsolutePath());
            }
            m214118g();
        }
    }

    @VisibleForTesting
    /* JADX INFO: renamed from: c */
    public InputStream m214132c(File file) throws FileNotFoundException {
        return new FileInputStream(file);
    }

    @VisibleForTesting
    /* JADX INFO: renamed from: d */
    public OutputStream m214133d(File file) throws FileNotFoundException {
        return new FileOutputStream(file);
    }

    /* JADX INFO: renamed from: e */
    public File m214134e(String str) {
        return new File(this.f197344c.get(), m214117f(str));
    }

    @Override // com.android.volley.InterfaceC0919a
    public synchronized InterfaceC0919a.a get(String str) {
        C21504a c21504a = this.f197342a.get(str);
        if (c21504a == null) {
            return null;
        }
        File fileM214134e = m214134e(str);
        try {
            C21505b c21505b = new C21505b(new BufferedInputStream(m214132c(fileM214134e)), fileM214134e.length());
            try {
                C21504a c21504aM214137b = C21504a.m214137b(c21505b);
                if (TextUtils.equals(str, c21504aM214137b.f197347b)) {
                    InterfaceC0919a.a aVarM214138c = c21504a.m214138c(m214127q(c21505b, c21505b.m214140k()));
                    c21505b.close();
                    return aVarM214138c;
                }
                C0923e.m5109b("%s: key=%s, found=%s", fileM214134e.getAbsolutePath(), str, c21504aM214137b.f197347b);
                m214126p(str);
                c21505b.close();
                return null;
            } catch (Throwable th) {
                c21505b.close();
                throw th;
            }
        } catch (IOException e) {
            C0923e.m5109b("%s: %s", fileM214134e.getAbsolutePath(), e.toString());
            m214135o(str);
            return null;
        }
    }

    @Override // com.android.volley.InterfaceC0919a
    public synchronized void initialize() {
        try {
            File file = this.f197344c.get();
            if (!file.exists()) {
                if (!file.mkdirs()) {
                    C0923e.m5110c("Unable to create cache dir %s", file.getAbsolutePath());
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
                    C21505b c21505b = new C21505b(new BufferedInputStream(m214132c(file2)), length);
                    try {
                        C21504a c21504aM214137b = C21504a.m214137b(c21505b);
                        c21504aM214137b.f197346a = length;
                        m214120i(c21504aM214137b.f197347b, c21504aM214137b);
                        c21505b.close();
                    } catch (Throwable th) {
                        c21505b.close();
                        throw th;
                    }
                } catch (IOException unused) {
                    file2.delete();
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* JADX INFO: renamed from: o */
    public synchronized void m214135o(String str) {
        boolean zDelete = m214134e(str).delete();
        m214126p(str);
        if (!zDelete) {
            C0923e.m5109b("Could not delete cache entry for key=%s, filename=%s", str, m214117f(str));
        }
    }

    /* JADX INFO: renamed from: l.y3e$b */
    @VisibleForTesting
    public static class C21505b extends FilterInputStream {

        /* JADX INFO: renamed from: a */
        private final long f197354a;

        /* JADX INFO: renamed from: b */
        private long f197355b;

        public C21505b(InputStream inputStream, long j) {
            super(inputStream);
            this.f197354a = j;
        }

        /* JADX INFO: renamed from: k */
        public long m214140k() {
            return this.f197354a - this.f197355b;
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public int read() throws IOException {
            int i = super.read();
            if (i != -1) {
                this.f197355b++;
            }
            return i;
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public int read(byte[] bArr, int i, int i2) throws IOException {
            int i3 = super.read(bArr, i, i2);
            if (i3 != -1) {
                this.f197355b += (long) i3;
            }
            return i3;
        }
    }

    public y3e(InterfaceC21506c interfaceC21506c) {
        this(interfaceC21506c, 5242880);
    }

    /* JADX INFO: renamed from: l.y3e$a */
    @VisibleForTesting
    public static class C21504a {

        /* JADX INFO: renamed from: a */
        long f197346a;

        /* JADX INFO: renamed from: b */
        final String f197347b;

        /* JADX INFO: renamed from: c */
        final String f197348c;

        /* JADX INFO: renamed from: d */
        final long f197349d;

        /* JADX INFO: renamed from: e */
        final long f197350e;

        /* JADX INFO: renamed from: f */
        final long f197351f;

        /* JADX INFO: renamed from: g */
        final long f197352g;

        /* JADX INFO: renamed from: h */
        final List<yzk> f197353h;

        private C21504a(String str, String str2, long j, long j2, long j3, long j4, List<yzk> list) {
            this.f197347b = str;
            this.f197348c = "".equals(str2) ? null : str2;
            this.f197349d = j;
            this.f197350e = j2;
            this.f197351f = j3;
            this.f197352g = j4;
            this.f197353h = list;
        }

        /* JADX INFO: renamed from: a */
        private static List<yzk> m214136a(InterfaceC0919a.a aVar) {
            List<yzk> list = aVar.f4151h;
            return list != null ? list : xml.m211739h(aVar.f4150g);
        }

        /* JADX INFO: renamed from: b */
        public static C21504a m214137b(C21505b c21505b) throws IOException {
            if (y3e.m214123l(c21505b) == 538247942) {
                return new C21504a(y3e.m214125n(c21505b), y3e.m214125n(c21505b), y3e.m214124m(c21505b), y3e.m214124m(c21505b), y3e.m214124m(c21505b), y3e.m214124m(c21505b), y3e.m214122k(c21505b));
            }
            throw new IOException();
        }

        /* JADX INFO: renamed from: c */
        public InterfaceC0919a.a m214138c(byte[] bArr) {
            InterfaceC0919a.a aVar = new InterfaceC0919a.a();
            aVar.f4144a = bArr;
            aVar.f4145b = this.f197348c;
            aVar.f4146c = this.f197349d;
            aVar.f4147d = this.f197350e;
            aVar.f4148e = this.f197351f;
            aVar.f4149f = this.f197352g;
            aVar.f4150g = xml.m211740i(this.f197353h);
            aVar.f4151h = Collections.unmodifiableList(this.f197353h);
            return aVar;
        }

        /* JADX INFO: renamed from: d */
        public boolean m214139d(OutputStream outputStream) {
            try {
                y3e.m214129s(outputStream, 538247942);
                y3e.m214131u(outputStream, this.f197347b);
                String str = this.f197348c;
                if (str == null) {
                    str = "";
                }
                y3e.m214131u(outputStream, str);
                y3e.m214130t(outputStream, this.f197349d);
                y3e.m214130t(outputStream, this.f197350e);
                y3e.m214130t(outputStream, this.f197351f);
                y3e.m214130t(outputStream, this.f197352g);
                y3e.m214128r(this.f197353h, outputStream);
                outputStream.flush();
                return true;
            } catch (IOException e) {
                C0923e.m5109b("%s", e.toString());
                return false;
            }
        }

        public C21504a(String str, InterfaceC0919a.a aVar) {
            this(str, aVar.f4145b, aVar.f4146c, aVar.f4147d, aVar.f4148e, aVar.f4149f, m214136a(aVar));
        }
    }
}
