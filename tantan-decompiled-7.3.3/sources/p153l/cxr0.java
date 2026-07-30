package p153l;

import android.os.SystemClock;
import android.text.TextUtils;
import androidx.annotation.VisibleForTesting;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes6.dex */
public final class cxr0 implements lvr0 {

    /* JADX INFO: renamed from: c */
    public final bxr0 f84268c;

    /* JADX INFO: renamed from: a */
    public final Map f84266a = new LinkedHashMap(16, 0.75f, true);

    /* JADX INFO: renamed from: b */
    public long f84267b = 0;

    /* JADX INFO: renamed from: d */
    public final int f84269d = 20971520;

    public cxr0(File file, int i) {
        this.f84268c = new ywr0(this, file);
    }

    /* JADX INFO: renamed from: c */
    public static int m113053c(InputStream inputStream) throws IOException {
        return (m113060l(inputStream) << 24) | m113060l(inputStream) | (m113060l(inputStream) << 8) | (m113060l(inputStream) << 16);
    }

    /* JADX INFO: renamed from: d */
    public static long m113054d(InputStream inputStream) throws IOException {
        return (((long) m113060l(inputStream)) & 255) | ((((long) m113060l(inputStream)) & 255) << 8) | ((((long) m113060l(inputStream)) & 255) << 16) | ((((long) m113060l(inputStream)) & 255) << 24) | ((((long) m113060l(inputStream)) & 255) << 32) | ((((long) m113060l(inputStream)) & 255) << 40) | ((((long) m113060l(inputStream)) & 255) << 48) | ((((long) m113060l(inputStream)) & 255) << 56);
    }

    /* JADX INFO: renamed from: f */
    public static String m113055f(axr0 axr0Var) throws IOException {
        return new String(m113059k(axr0Var, m113054d(axr0Var)), "UTF-8");
    }

    /* JADX INFO: renamed from: h */
    public static void m113056h(OutputStream outputStream, int i) throws IOException {
        outputStream.write(i & 255);
        outputStream.write((i >> 8) & 255);
        outputStream.write((i >> 16) & 255);
        outputStream.write((i >> 24) & 255);
    }

    /* JADX INFO: renamed from: i */
    public static void m113057i(OutputStream outputStream, long j) throws IOException {
        outputStream.write((byte) j);
        outputStream.write((byte) (j >>> 8));
        outputStream.write((byte) (j >>> 16));
        outputStream.write((byte) (j >>> 24));
        outputStream.write((byte) (j >>> 32));
        outputStream.write((byte) (j >>> 40));
        outputStream.write((byte) (j >>> 48));
        outputStream.write((byte) (j >>> 56));
    }

    /* JADX INFO: renamed from: j */
    public static void m113058j(OutputStream outputStream, String str) throws IOException {
        byte[] bytes = str.getBytes("UTF-8");
        int length = bytes.length;
        m113057i(outputStream, length);
        outputStream.write(bytes, 0, length);
    }

    @VisibleForTesting
    /* JADX INFO: renamed from: k */
    public static byte[] m113059k(axr0 axr0Var, long j) throws IOException {
        long jM100787k = axr0Var.m100787k();
        if (j >= 0 && j <= jM100787k) {
            int i = (int) j;
            if (i == j) {
                byte[] bArr = new byte[i];
                new DataInputStream(axr0Var).readFully(bArr);
                return bArr;
            }
        }
        hig0.m135122a("streamToBytes length=", j, ", maxLength=", jM100787k);
        return null;
    }

    /* JADX INFO: renamed from: l */
    public static int m113060l(InputStream inputStream) throws IOException {
        int i = inputStream.read();
        if (i != -1) {
            return i;
        }
        vg3.m201207a();
        return 0;
    }

    /* JADX INFO: renamed from: o */
    public static final String m113061o(String str) {
        int length = str.length() / 2;
        return String.valueOf(String.valueOf(str.substring(0, length).hashCode())).concat(String.valueOf(String.valueOf(str.substring(length).hashCode())));
    }

    @Override // p153l.lvr0
    /* JADX INFO: renamed from: a */
    public final synchronized void mo113062a(String str, kvr0 kvr0Var) {
        try {
            long j = this.f84267b;
            int length = kvr0Var.f128986a.length;
            long j2 = j + ((long) length);
            int i = this.f84269d;
            if (j2 <= i || length <= i * 0.9f) {
                File fileM113064e = m113064e(str);
                try {
                    BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(fileM113064e));
                    zwr0 zwr0Var = new zwr0(str, kvr0Var);
                    try {
                        m113056h(bufferedOutputStream, 538247942);
                        m113058j(bufferedOutputStream, zwr0Var.f206371b);
                        String str2 = zwr0Var.f206372c;
                        if (str2 == null) {
                            str2 = "";
                        }
                        m113058j(bufferedOutputStream, str2);
                        m113057i(bufferedOutputStream, zwr0Var.f206373d);
                        m113057i(bufferedOutputStream, zwr0Var.f206374e);
                        m113057i(bufferedOutputStream, zwr0Var.f206375f);
                        m113057i(bufferedOutputStream, zwr0Var.f206376g);
                        List<svr0> list = zwr0Var.f206377h;
                        if (list != null) {
                            m113056h(bufferedOutputStream, list.size());
                            for (svr0 svr0Var : list) {
                                m113058j(bufferedOutputStream, svr0Var.m188224a());
                                m113058j(bufferedOutputStream, svr0Var.m188225b());
                            }
                        } else {
                            m113056h(bufferedOutputStream, 0);
                        }
                        bufferedOutputStream.flush();
                        bufferedOutputStream.write(kvr0Var.f128986a);
                        bufferedOutputStream.close();
                        zwr0Var.f206370a = fileM113064e.length();
                        m113066m(str, zwr0Var);
                        if (this.f84267b >= this.f84269d) {
                            if (swr0.f171002b) {
                                swr0.m188360d("Pruning old cache entries.", new Object[0]);
                            }
                            long j3 = this.f84267b;
                            long jElapsedRealtime = SystemClock.elapsedRealtime();
                            Iterator it = this.f84266a.entrySet().iterator();
                            int i2 = 0;
                            while (it.hasNext()) {
                                zwr0 zwr0Var2 = (zwr0) ((Map.Entry) it.next()).getValue();
                                if (m113064e(zwr0Var2.f206371b).delete()) {
                                    this.f84267b -= zwr0Var2.f206370a;
                                } else {
                                    String str3 = zwr0Var2.f206371b;
                                    swr0.m188357a("Could not delete cache entry for key=%s, filename=%s", str3, m113061o(str3));
                                }
                                it.remove();
                                i2++;
                                if (this.f84267b < this.f84269d * 0.9f) {
                                    break;
                                }
                            }
                            if (swr0.f171002b) {
                                swr0.m188360d("pruned %d files, %d bytes, %d ms", Integer.valueOf(i2), Long.valueOf(this.f84267b - j3), Long.valueOf(SystemClock.elapsedRealtime() - jElapsedRealtime));
                            }
                        }
                    } catch (IOException e) {
                        swr0.m188357a("%s", e.toString());
                        bufferedOutputStream.close();
                        swr0.m188357a("Failed to write header for %s", fileM113064e.getAbsolutePath());
                        throw new IOException();
                    }
                } catch (IOException unused) {
                    if (!fileM113064e.delete()) {
                        swr0.m188357a("Could not clean up file %s", fileM113064e.getAbsolutePath());
                    }
                    if (!this.f84268c.zza().exists()) {
                        swr0.m188357a("Re-initializing cache after external clearing.", new Object[0]);
                        this.f84266a.clear();
                        this.f84267b = 0L;
                        zzb();
                    }
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // p153l.lvr0
    /* JADX INFO: renamed from: b */
    public final synchronized void mo113063b(String str, boolean z) {
        kvr0 kvr0VarZza = zza(str);
        if (kvr0VarZza != null) {
            kvr0VarZza.f128991f = 0L;
            kvr0VarZza.f128990e = 0L;
            mo113062a(str, kvr0VarZza);
        }
    }

    /* JADX INFO: renamed from: e */
    public final File m113064e(String str) {
        return new File(this.f84268c.zza(), m113061o(str));
    }

    /* JADX INFO: renamed from: g */
    public final synchronized void m113065g(String str) {
        boolean zDelete = m113064e(str).delete();
        m113067n(str);
        if (zDelete) {
            return;
        }
        swr0.m188357a("Could not delete cache entry for key=%s, filename=%s", str, m113061o(str));
    }

    /* JADX INFO: renamed from: m */
    public final void m113066m(String str, zwr0 zwr0Var) {
        if (this.f84266a.containsKey(str)) {
            this.f84267b += zwr0Var.f206370a - ((zwr0) this.f84266a.get(str)).f206370a;
        } else {
            this.f84267b += zwr0Var.f206370a;
        }
        this.f84266a.put(str, zwr0Var);
    }

    /* JADX INFO: renamed from: n */
    public final void m113067n(String str) {
        zwr0 zwr0Var = (zwr0) this.f84266a.remove(str);
        if (zwr0Var != null) {
            this.f84267b -= zwr0Var.f206370a;
        }
    }

    @Override // p153l.lvr0
    public final synchronized kvr0 zza(String str) {
        zwr0 zwr0Var = (zwr0) this.f84266a.get(str);
        if (zwr0Var == null) {
            return null;
        }
        File fileM113064e = m113064e(str);
        try {
            axr0 axr0Var = new axr0(new BufferedInputStream(new FileInputStream(fileM113064e)), fileM113064e.length());
            try {
                zwr0 zwr0VarM221951a = zwr0.m221951a(axr0Var);
                if (!TextUtils.equals(str, zwr0VarM221951a.f206371b)) {
                    swr0.m188357a("%s: key=%s, found=%s", fileM113064e.getAbsolutePath(), str, zwr0VarM221951a.f206371b);
                    m113067n(str);
                    axr0Var.close();
                    return null;
                }
                byte[] bArrM113059k = m113059k(axr0Var, axr0Var.m100787k());
                kvr0 kvr0Var = new kvr0();
                kvr0Var.f128986a = bArrM113059k;
                kvr0Var.f128987b = zwr0Var.f206372c;
                kvr0Var.f128988c = zwr0Var.f206373d;
                kvr0Var.f128989d = zwr0Var.f206374e;
                kvr0Var.f128990e = zwr0Var.f206375f;
                kvr0Var.f128991f = zwr0Var.f206376g;
                List<svr0> list = zwr0Var.f206377h;
                TreeMap treeMap = new TreeMap(String.CASE_INSENSITIVE_ORDER);
                for (svr0 svr0Var : list) {
                    treeMap.put(svr0Var.m188224a(), svr0Var.m188225b());
                }
                kvr0Var.f128992g = treeMap;
                kvr0Var.f128993h = Collections.unmodifiableList(zwr0Var.f206377h);
                axr0Var.close();
                return kvr0Var;
            } catch (Throwable th) {
                axr0Var.close();
                throw th;
            }
        } catch (IOException e) {
            swr0.m188357a("%s: %s", fileM113064e.getAbsolutePath(), e.toString());
            m113065g(str);
            return null;
        }
    }

    @Override // p153l.lvr0
    public final synchronized void zzb() {
        try {
            File fileZza = this.f84268c.zza();
            if (fileZza.exists()) {
                File[] fileArrListFiles = fileZza.listFiles();
                if (fileArrListFiles != null) {
                    for (File file : fileArrListFiles) {
                        try {
                            long length = file.length();
                            axr0 axr0Var = new axr0(new BufferedInputStream(new FileInputStream(file)), length);
                            try {
                                zwr0 zwr0VarM221951a = zwr0.m221951a(axr0Var);
                                zwr0VarM221951a.f206370a = length;
                                m113066m(zwr0VarM221951a.f206371b, zwr0VarM221951a);
                                axr0Var.close();
                            } catch (Throwable th) {
                                axr0Var.close();
                                throw th;
                            }
                        } catch (IOException unused) {
                            file.delete();
                        }
                    }
                }
            } else if (!fileZza.mkdirs()) {
                swr0.m188358b("Unable to create cache dir %s", fileZza.getAbsolutePath());
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public cxr0(bxr0 bxr0Var, int i) {
        this.f84268c = bxr0Var;
    }
}
