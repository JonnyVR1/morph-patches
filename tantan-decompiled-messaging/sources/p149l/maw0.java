package p149l;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.util.Hex;
import com.google.android.gms.internal.ads.C2256u;
import com.google.android.gms.internal.ads.C2264v;
import com.google.android.gms.internal.ads.zzgyl;
import com.google.android.gms.internal.ads.zzhag;
import com.tencent.liteav.TXLiteAVCode;
import java.io.File;
import java.util.HashSet;

/* JADX INFO: loaded from: classes6.dex */
public final class maw0 {

    /* JADX INFO: renamed from: f */
    public static final Object f132962f = new Object();

    /* JADX INFO: renamed from: a */
    public final Context f132963a;

    /* JADX INFO: renamed from: b */
    public final SharedPreferences f132964b;

    /* JADX INFO: renamed from: c */
    public final String f132965c;

    /* JADX INFO: renamed from: d */
    public final u9w0 f132966d;

    /* JADX INFO: renamed from: e */
    public boolean f132967e;

    public maw0(@NonNull Context context, @NonNull int i, @NonNull u9w0 u9w0Var, boolean z) {
        this.f132967e = false;
        this.f132963a = context;
        this.f132965c = Integer.toString(i - 1);
        this.f132964b = context.getSharedPreferences("pcvmspf", 0);
        this.f132966d = u9w0Var;
        this.f132967e = z;
    }

    /* JADX INFO: renamed from: f */
    public static String m153843f(@NonNull C2256u c2256u) {
        ixr0 ixr0VarM13355O = C2264v.m13355O();
        ixr0VarM13355O.m138896u(c2256u.m13332N().m13369U());
        ixr0VarM13355O.m138892q(c2256u.m13332N().m13368T());
        ixr0VarM13355O.m138893r(c2256u.m13332N().m13365L());
        ixr0VarM13355O.m138895t(c2256u.m13332N().m13367N());
        ixr0VarM13355O.m138894s(c2256u.m13332N().m13366M());
        return Hex.bytesToStringLowercase(((C2264v) ixr0VarM13355O.m153521m()).m12744h());
    }

    /* JADX INFO: renamed from: a */
    public final boolean m153844a(@NonNull C2256u c2256u) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        synchronized (f132962f) {
            try {
                if (!iaw0.m135211e(new File(m153848e(c2256u.m13332N().m13369U()), "pcbc"), c2256u.m13333O().zzA())) {
                    m153851i(4020, jCurrentTimeMillis);
                    return false;
                }
                String strM153843f = m153843f(c2256u);
                SharedPreferences.Editor editorEdit = this.f132964b.edit();
                editorEdit.putString(m153850h(), strM153843f);
                boolean zCommit = editorEdit.commit();
                if (zCommit) {
                    m153851i(5015, jCurrentTimeMillis);
                } else {
                    m153851i(4021, jCurrentTimeMillis);
                }
                return zCommit;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public final boolean m153845b(@NonNull C2256u c2256u, @Nullable law0 law0Var) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        synchronized (f132962f) {
            try {
                C2264v c2264vM153853k = m153853k(1);
                String strM13369U = c2256u.m13332N().m13369U();
                if (c2264vM153853k != null && c2264vM153853k.m13369U().equals(strM13369U)) {
                    m153851i(4014, jCurrentTimeMillis);
                    return false;
                }
                long jCurrentTimeMillis2 = System.currentTimeMillis();
                File fileM153848e = m153848e(strM13369U);
                if (fileM153848e.exists()) {
                    m153852j(4023, jCurrentTimeMillis2, "d:" + (true != fileM153848e.isDirectory() ? "0" : "1") + ",f:" + (true != fileM153848e.isFile() ? "0" : "1"));
                    m153851i(4015, jCurrentTimeMillis2);
                } else if (!fileM153848e.mkdirs()) {
                    m153852j(4024, jCurrentTimeMillis2, "cw:".concat(true != fileM153848e.canWrite() ? "0" : "1"));
                    m153851i(4015, jCurrentTimeMillis2);
                    return false;
                }
                File fileM153848e2 = m153848e(strM13369U);
                File file = new File(fileM153848e2, "pcam.jar");
                File file2 = new File(fileM153848e2, "pcbc");
                if (!iaw0.m135211e(file, c2256u.m13334P().zzA())) {
                    m153851i(4016, jCurrentTimeMillis);
                    return false;
                }
                if (!iaw0.m135211e(file2, c2256u.m13333O().zzA())) {
                    m153851i(4017, jCurrentTimeMillis);
                    return false;
                }
                if (law0Var != null && !law0Var.mo149181a(file)) {
                    m153851i(4018, jCurrentTimeMillis);
                    iaw0.m135210d(fileM153848e2);
                    return false;
                }
                String strM153843f = m153843f(c2256u);
                long jCurrentTimeMillis3 = System.currentTimeMillis();
                String string = this.f132964b.getString(m153850h(), null);
                SharedPreferences.Editor editorEdit = this.f132964b.edit();
                editorEdit.putString(m153850h(), strM153843f);
                if (string != null) {
                    editorEdit.putString(m153849g(), string);
                }
                if (!editorEdit.commit()) {
                    m153851i(4019, jCurrentTimeMillis3);
                    return false;
                }
                HashSet hashSet = new HashSet();
                C2264v c2264vM153853k2 = m153853k(1);
                if (c2264vM153853k2 != null) {
                    hashSet.add(c2264vM153853k2.m13369U());
                }
                C2264v c2264vM153853k3 = m153853k(2);
                if (c2264vM153853k3 != null) {
                    hashSet.add(c2264vM153853k3.m13369U());
                }
                for (File file3 : new File(this.f132963a.getDir("pccache", 0), this.f132965c).listFiles()) {
                    if (!hashSet.contains(file3.getName())) {
                        iaw0.m135210d(file3);
                    }
                }
                m153851i(5014, jCurrentTimeMillis);
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Nullable
    /* JADX INFO: renamed from: c */
    public final gaw0 m153846c(int i) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        synchronized (f132962f) {
            try {
                C2264v c2264vM153853k = m153853k(1);
                if (c2264vM153853k == null) {
                    m153851i(4022, jCurrentTimeMillis);
                    return null;
                }
                File fileM153848e = m153848e(c2264vM153853k.m13369U());
                File file = new File(fileM153848e, "pcam.jar");
                if (!file.exists()) {
                    file = new File(fileM153848e, "pcam");
                }
                File file2 = new File(fileM153848e, "pcbc");
                File file3 = new File(fileM153848e, "pcopt");
                m153851i(5016, jCurrentTimeMillis);
                return new gaw0(c2264vM153853k, file, file2, file3);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public final boolean m153847d(int i) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        synchronized (f132962f) {
            try {
                C2264v c2264vM153853k = m153853k(1);
                if (c2264vM153853k == null) {
                    m153851i(4025, jCurrentTimeMillis);
                    return false;
                }
                File fileM153848e = m153848e(c2264vM153853k.m13369U());
                if (!new File(fileM153848e, "pcam.jar").exists()) {
                    m153851i(4026, jCurrentTimeMillis);
                    return false;
                }
                if (new File(fileM153848e, "pcbc").exists()) {
                    m153851i(5019, jCurrentTimeMillis);
                    return true;
                }
                m153851i(4027, jCurrentTimeMillis);
                return false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: e */
    public final File m153848e(@NonNull String str) {
        return new File(new File(this.f132963a.getDir("pccache", 0), this.f132965c), str);
    }

    /* JADX INFO: renamed from: g */
    public final String m153849g() {
        return "FBAMTD".concat(String.valueOf(this.f132965c));
    }

    /* JADX INFO: renamed from: h */
    public final String m153850h() {
        return "LATMTD".concat(String.valueOf(this.f132965c));
    }

    /* JADX INFO: renamed from: i */
    public final void m153851i(int i, long j) {
        this.f132966d.mo135091b(i, j);
    }

    /* JADX INFO: renamed from: j */
    public final void m153852j(int i, long j, String str) {
        this.f132966d.mo135090a(i, j, str);
    }

    @Nullable
    /* JADX INFO: renamed from: k */
    public final C2264v m153853k(int i) {
        SharedPreferences sharedPreferences = this.f132964b;
        String string = i == 1 ? sharedPreferences.getString(m153850h(), null) : sharedPreferences.getString(m153849g(), null);
        if (string == null) {
            return null;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        try {
            byte[] bArrStringToBytes = Hex.stringToBytes(string);
            zzgyl zzgylVar = zzgyl.zzb;
            return C2264v.m13359S(zzgyl.zzv(bArrStringToBytes, 0, bArrStringToBytes.length), this.f132967e ? d8x0.m110397a() : d8x0.m110398b());
        } catch (zzhag unused) {
            return null;
        } catch (NullPointerException unused2) {
            m153851i(TXLiteAVCode.EVT_MIC_RELEASE_SUCC, jCurrentTimeMillis);
            return null;
        } catch (RuntimeException unused3) {
            m153851i(2032, jCurrentTimeMillis);
            return null;
        }
    }
}
