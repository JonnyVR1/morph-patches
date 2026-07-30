package p149l;

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
public final class wnr0 implements fmr0 {

    /* JADX INFO: renamed from: c */
    public final vnr0 f187342c;

    /* JADX INFO: renamed from: a */
    public final Map f187340a = new LinkedHashMap(16, 0.75f, true);

    /* JADX INFO: renamed from: b */
    public long f187341b = 0;

    /* JADX INFO: renamed from: d */
    public final int f187343d = 20971520;

    public wnr0(File file, int i) {
        this.f187342c = new snr0(this, file);
    }

    /* JADX INFO: renamed from: c */
    public static int m204767c(InputStream inputStream) throws IOException {
        return (m204774l(inputStream) << 24) | m204774l(inputStream) | (m204774l(inputStream) << 8) | (m204774l(inputStream) << 16);
    }

    /* JADX INFO: renamed from: d */
    public static long m204768d(InputStream inputStream) throws IOException {
        return (((long) m204774l(inputStream)) & 255) | ((((long) m204774l(inputStream)) & 255) << 8) | ((((long) m204774l(inputStream)) & 255) << 16) | ((((long) m204774l(inputStream)) & 255) << 24) | ((((long) m204774l(inputStream)) & 255) << 32) | ((((long) m204774l(inputStream)) & 255) << 40) | ((((long) m204774l(inputStream)) & 255) << 48) | ((((long) m204774l(inputStream)) & 255) << 56);
    }

    /* JADX INFO: renamed from: f */
    public static String m204769f(unr0 unr0Var) throws IOException {
        return new String(m204773k(unr0Var, m204768d(unr0Var)), "UTF-8");
    }

    /* JADX INFO: renamed from: h */
    public static void m204770h(OutputStream outputStream, int i) throws IOException {
        outputStream.write(i & 255);
        outputStream.write((i >> 8) & 255);
        outputStream.write((i >> 16) & 255);
        outputStream.write((i >> 24) & 255);
    }

    /* JADX INFO: renamed from: i */
    public static void m204771i(OutputStream outputStream, long j) throws IOException {
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
    public static void m204772j(OutputStream outputStream, String str) throws IOException {
        byte[] bytes = str.getBytes("UTF-8");
        int length = bytes.length;
        m204771i(outputStream, length);
        outputStream.write(bytes, 0, length);
    }

    @VisibleForTesting
    /* JADX INFO: renamed from: k */
    public static byte[] m204773k(unr0 unr0Var, long j) throws IOException {
        long jM194480k = unr0Var.m194480k();
        if (j >= 0 && j <= jM194480k) {
            int i = (int) j;
            if (i == j) {
                byte[] bArr = new byte[i];
                new DataInputStream(unr0Var).readFully(bArr);
                return bArr;
            }
        }
        z9g0.m217667a("streamToBytes length=", j, ", maxLength=", jM194480k);
        return null;
    }

    /* JADX INFO: renamed from: l */
    public static int m204774l(InputStream inputStream) throws IOException {
        int i = inputStream.read();
        if (i != -1) {
            return i;
        }
        hg3.m130807a();
        return 0;
    }

    /* JADX INFO: renamed from: o */
    public static final String m204775o(String str) {
        int length = str.length() / 2;
        return String.valueOf(String.valueOf(str.substring(0, length).hashCode())).concat(String.valueOf(String.valueOf(str.substring(length).hashCode())));
    }

    @Override // p149l.fmr0
    /* JADX INFO: renamed from: a */
    public final synchronized void mo122198a(String str, emr0 emr0Var) {
        try {
            long j = this.f187341b;
            int length = emr0Var.f92236a.length;
            long j2 = j + ((long) length);
            int i = this.f187343d;
            if (j2 <= i || length <= i * 0.9f) {
                File fileM204776e = m204776e(str);
                try {
                    BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(fileM204776e));
                    tnr0 tnr0Var = new tnr0(str, emr0Var);
                    try {
                        m204770h(bufferedOutputStream, 538247942);
                        m204772j(bufferedOutputStream, tnr0Var.f171271b);
                        String str2 = tnr0Var.f171272c;
                        if (str2 == null) {
                            str2 = "";
                        }
                        m204772j(bufferedOutputStream, str2);
                        m204771i(bufferedOutputStream, tnr0Var.f171273d);
                        m204771i(bufferedOutputStream, tnr0Var.f171274e);
                        m204771i(bufferedOutputStream, tnr0Var.f171275f);
                        m204771i(bufferedOutputStream, tnr0Var.f171276g);
                        List<mmr0> list = tnr0Var.f171277h;
                        if (list != null) {
                            m204770h(bufferedOutputStream, list.size());
                            for (mmr0 mmr0Var : list) {
                                m204772j(bufferedOutputStream, mmr0Var.m155486a());
                                m204772j(bufferedOutputStream, mmr0Var.m155487b());
                            }
                        } else {
                            m204770h(bufferedOutputStream, 0);
                        }
                        bufferedOutputStream.flush();
                        bufferedOutputStream.write(emr0Var.f92236a);
                        bufferedOutputStream.close();
                        tnr0Var.f171270a = fileM204776e.length();
                        m204778m(str, tnr0Var);
                        if (this.f187341b >= this.f187343d) {
                            if (mnr0.f134787b) {
                                mnr0.m155560d("Pruning old cache entries.", new Object[0]);
                            }
                            long j3 = this.f187341b;
                            long jElapsedRealtime = SystemClock.elapsedRealtime();
                            Iterator it = this.f187340a.entrySet().iterator();
                            int i2 = 0;
                            while (it.hasNext()) {
                                tnr0 tnr0Var2 = (tnr0) ((Map.Entry) it.next()).getValue();
                                if (m204776e(tnr0Var2.f171271b).delete()) {
                                    this.f187341b -= tnr0Var2.f171270a;
                                } else {
                                    String str3 = tnr0Var2.f171271b;
                                    mnr0.m155557a("Could not delete cache entry for key=%s, filename=%s", str3, m204775o(str3));
                                }
                                it.remove();
                                i2++;
                                if (this.f187341b < this.f187343d * 0.9f) {
                                    break;
                                }
                            }
                            if (mnr0.f134787b) {
                                mnr0.m155560d("pruned %d files, %d bytes, %d ms", Integer.valueOf(i2), Long.valueOf(this.f187341b - j3), Long.valueOf(SystemClock.elapsedRealtime() - jElapsedRealtime));
                            }
                        }
                    } catch (IOException e) {
                        mnr0.m155557a("%s", e.toString());
                        bufferedOutputStream.close();
                        mnr0.m155557a("Failed to write header for %s", fileM204776e.getAbsolutePath());
                        throw new IOException();
                    }
                } catch (IOException unused) {
                    if (!fileM204776e.delete()) {
                        mnr0.m155557a("Could not clean up file %s", fileM204776e.getAbsolutePath());
                    }
                    if (!this.f187342c.zza().exists()) {
                        mnr0.m155557a("Re-initializing cache after external clearing.", new Object[0]);
                        this.f187340a.clear();
                        this.f187341b = 0L;
                        zzb();
                    }
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // p149l.fmr0
    /* JADX INFO: renamed from: b */
    public final synchronized void mo122199b(String str, boolean z) {
        emr0 emr0VarZza = zza(str);
        if (emr0VarZza != null) {
            emr0VarZza.f92241f = 0L;
            emr0VarZza.f92240e = 0L;
            mo122198a(str, emr0VarZza);
        }
    }

    /* JADX INFO: renamed from: e */
    public final File m204776e(String str) {
        return new File(this.f187342c.zza(), m204775o(str));
    }

    /* JADX INFO: renamed from: g */
    public final synchronized void m204777g(String str) {
        boolean zDelete = m204776e(str).delete();
        m204779n(str);
        if (zDelete) {
            return;
        }
        mnr0.m155557a("Could not delete cache entry for key=%s, filename=%s", str, m204775o(str));
    }

    /* JADX INFO: renamed from: m */
    public final void m204778m(String str, tnr0 tnr0Var) {
        if (this.f187340a.containsKey(str)) {
            this.f187341b += tnr0Var.f171270a - ((tnr0) this.f187340a.get(str)).f171270a;
        } else {
            this.f187341b += tnr0Var.f171270a;
        }
        this.f187340a.put(str, tnr0Var);
    }

    /* JADX INFO: renamed from: n */
    public final void m204779n(String str) {
        tnr0 tnr0Var = (tnr0) this.f187340a.remove(str);
        if (tnr0Var != null) {
            this.f187341b -= tnr0Var.f171270a;
        }
    }

    @Override // p149l.fmr0
    public final synchronized emr0 zza(String str) {
        tnr0 tnr0Var = (tnr0) this.f187340a.get(str);
        if (tnr0Var == null) {
            return null;
        }
        File fileM204776e = m204776e(str);
        try {
            unr0 unr0Var = new unr0(new BufferedInputStream(new FileInputStream(fileM204776e)), fileM204776e.length());
            try {
                tnr0 tnr0VarM189823a = tnr0.m189823a(unr0Var);
                if (!TextUtils.equals(str, tnr0VarM189823a.f171271b)) {
                    mnr0.m155557a("%s: key=%s, found=%s", fileM204776e.getAbsolutePath(), str, tnr0VarM189823a.f171271b);
                    m204779n(str);
                    unr0Var.close();
                    return null;
                }
                byte[] bArrM204773k = m204773k(unr0Var, unr0Var.m194480k());
                emr0 emr0Var = new emr0();
                emr0Var.f92236a = bArrM204773k;
                emr0Var.f92237b = tnr0Var.f171272c;
                emr0Var.f92238c = tnr0Var.f171273d;
                emr0Var.f92239d = tnr0Var.f171274e;
                emr0Var.f92240e = tnr0Var.f171275f;
                emr0Var.f92241f = tnr0Var.f171276g;
                List<mmr0> list = tnr0Var.f171277h;
                TreeMap treeMap = new TreeMap(String.CASE_INSENSITIVE_ORDER);
                for (mmr0 mmr0Var : list) {
                    treeMap.put(mmr0Var.m155486a(), mmr0Var.m155487b());
                }
                emr0Var.f92242g = treeMap;
                emr0Var.f92243h = Collections.unmodifiableList(tnr0Var.f171277h);
                unr0Var.close();
                return emr0Var;
            } catch (Throwable th) {
                unr0Var.close();
                throw th;
            }
        } catch (IOException e) {
            mnr0.m155557a("%s: %s", fileM204776e.getAbsolutePath(), e.toString());
            m204777g(str);
            return null;
        }
    }

    @Override // p149l.fmr0
    public final synchronized void zzb() {
        File fileZza = this.f187342c.zza();
        if (fileZza.exists()) {
            File[] fileArrListFiles = fileZza.listFiles();
            if (fileArrListFiles != null) {
                for (File file : fileArrListFiles) {
                    try {
                        long length = file.length();
                        unr0 unr0Var = new unr0(new BufferedInputStream(new FileInputStream(file)), length);
                        try {
                            tnr0 tnr0VarM189823a = tnr0.m189823a(unr0Var);
                            tnr0VarM189823a.f171270a = length;
                            m204778m(tnr0VarM189823a.f171271b, tnr0VarM189823a);
                            unr0Var.close();
                        } catch (Throwable th) {
                            unr0Var.close();
                            throw th;
                        }
                    } catch (IOException unused) {
                        file.delete();
                    }
                }
            }
        } else if (!fileZza.mkdirs()) {
            mnr0.m155558b("Unable to create cache dir %s", fileZza.getAbsolutePath());
        }
    }

    public wnr0(vnr0 vnr0Var, int i) {
        this.f187342c = vnr0Var;
    }
}
