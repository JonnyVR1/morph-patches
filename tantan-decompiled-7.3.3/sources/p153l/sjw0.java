package p153l;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.util.Hex;
import com.google.android.gms.internal.ads.C2279u;
import com.google.android.gms.internal.ads.C2287v;
import com.google.android.gms.internal.ads.zzgyl;
import com.google.android.gms.internal.ads.zzhag;
import com.tencent.liteav.TXLiteAVCode;
import java.io.File;
import java.util.HashSet;

/* JADX INFO: loaded from: classes6.dex */
public final class sjw0 {

    /* JADX INFO: renamed from: f */
    public static final Object f169189f = new Object();

    /* JADX INFO: renamed from: a */
    public final Context f169190a;

    /* JADX INFO: renamed from: b */
    public final SharedPreferences f169191b;

    /* JADX INFO: renamed from: c */
    public final String f169192c;

    /* JADX INFO: renamed from: d */
    public final ajw0 f169193d;

    /* JADX INFO: renamed from: e */
    public boolean f169194e;

    public sjw0(@NonNull Context context, @NonNull int i, @NonNull ajw0 ajw0Var, boolean z) {
        this.f169194e = false;
        this.f169190a = context;
        this.f169192c = Integer.toString(i - 1);
        this.f169191b = context.getSharedPreferences("pcvmspf", 0);
        this.f169193d = ajw0Var;
        this.f169194e = z;
    }

    /* JADX INFO: renamed from: f */
    public static String m186335f(@NonNull C2279u c2279u) {
        o6s0 o6s0VarM13409O = C2287v.m13409O();
        o6s0VarM13409O.m166291u(c2279u.m13386N().m13423U());
        o6s0VarM13409O.m166287q(c2279u.m13386N().m13422T());
        o6s0VarM13409O.m166288r(c2279u.m13386N().m13419L());
        o6s0VarM13409O.m166290t(c2279u.m13386N().m13421N());
        o6s0VarM13409O.m166289s(c2279u.m13386N().m13420M());
        return Hex.bytesToStringLowercase(((C2287v) o6s0VarM13409O.m185950m()).m12798h());
    }

    /* JADX INFO: renamed from: a */
    public final boolean m186336a(@NonNull C2279u c2279u) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        synchronized (f169189f) {
            try {
                if (!ojw0.m167972e(new File(m186340e(c2279u.m13386N().m13423U()), "pcbc"), c2279u.m13387O().zzA())) {
                    m186343i(4020, jCurrentTimeMillis);
                    return false;
                }
                String strM186335f = m186335f(c2279u);
                SharedPreferences.Editor editorEdit = this.f169191b.edit();
                editorEdit.putString(m186342h(), strM186335f);
                boolean zCommit = editorEdit.commit();
                if (zCommit) {
                    m186343i(5015, jCurrentTimeMillis);
                } else {
                    m186343i(4021, jCurrentTimeMillis);
                }
                return zCommit;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public final boolean m186337b(@NonNull C2279u c2279u, @Nullable rjw0 rjw0Var) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        synchronized (f169189f) {
            try {
                C2287v c2287vM186345k = m186345k(1);
                String strM13423U = c2279u.m13386N().m13423U();
                if (c2287vM186345k != null && c2287vM186345k.m13423U().equals(strM13423U)) {
                    m186343i(4014, jCurrentTimeMillis);
                    return false;
                }
                long jCurrentTimeMillis2 = System.currentTimeMillis();
                File fileM186340e = m186340e(strM13423U);
                if (fileM186340e.exists()) {
                    m186344j(4023, jCurrentTimeMillis2, "d:" + (true != fileM186340e.isDirectory() ? "0" : "1") + ",f:" + (true != fileM186340e.isFile() ? "0" : "1"));
                    m186343i(4015, jCurrentTimeMillis2);
                } else if (!fileM186340e.mkdirs()) {
                    m186344j(4024, jCurrentTimeMillis2, "cw:".concat(true != fileM186340e.canWrite() ? "0" : "1"));
                    m186343i(4015, jCurrentTimeMillis2);
                    return false;
                }
                File fileM186340e2 = m186340e(strM13423U);
                File file = new File(fileM186340e2, "pcam.jar");
                File file2 = new File(fileM186340e2, "pcbc");
                if (!ojw0.m167972e(file, c2279u.m13388P().zzA())) {
                    m186343i(4016, jCurrentTimeMillis);
                    return false;
                }
                if (!ojw0.m167972e(file2, c2279u.m13387O().zzA())) {
                    m186343i(4017, jCurrentTimeMillis);
                    return false;
                }
                if (rjw0Var != null && !rjw0Var.mo107724a(file)) {
                    m186343i(4018, jCurrentTimeMillis);
                    ojw0.m167971d(fileM186340e2);
                    return false;
                }
                String strM186335f = m186335f(c2279u);
                long jCurrentTimeMillis3 = System.currentTimeMillis();
                String string = this.f169191b.getString(m186342h(), null);
                SharedPreferences.Editor editorEdit = this.f169191b.edit();
                editorEdit.putString(m186342h(), strM186335f);
                if (string != null) {
                    editorEdit.putString(m186341g(), string);
                }
                if (!editorEdit.commit()) {
                    m186343i(4019, jCurrentTimeMillis3);
                    return false;
                }
                HashSet hashSet = new HashSet();
                C2287v c2287vM186345k2 = m186345k(1);
                if (c2287vM186345k2 != null) {
                    hashSet.add(c2287vM186345k2.m13423U());
                }
                C2287v c2287vM186345k3 = m186345k(2);
                if (c2287vM186345k3 != null) {
                    hashSet.add(c2287vM186345k3.m13423U());
                }
                for (File file3 : new File(this.f169190a.getDir("pccache", 0), this.f169192c).listFiles()) {
                    if (!hashSet.contains(file3.getName())) {
                        ojw0.m167971d(file3);
                    }
                }
                m186343i(5014, jCurrentTimeMillis);
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Nullable
    /* JADX INFO: renamed from: c */
    public final mjw0 m186338c(int i) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        synchronized (f169189f) {
            try {
                C2287v c2287vM186345k = m186345k(1);
                if (c2287vM186345k == null) {
                    m186343i(4022, jCurrentTimeMillis);
                    return null;
                }
                File fileM186340e = m186340e(c2287vM186345k.m13423U());
                File file = new File(fileM186340e, "pcam.jar");
                if (!file.exists()) {
                    file = new File(fileM186340e, "pcam");
                }
                File file2 = new File(fileM186340e, "pcbc");
                File file3 = new File(fileM186340e, "pcopt");
                m186343i(5016, jCurrentTimeMillis);
                return new mjw0(c2287vM186345k, file, file2, file3);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public final boolean m186339d(int i) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        synchronized (f169189f) {
            try {
                C2287v c2287vM186345k = m186345k(1);
                if (c2287vM186345k == null) {
                    m186343i(4025, jCurrentTimeMillis);
                    return false;
                }
                File fileM186340e = m186340e(c2287vM186345k.m13423U());
                if (!new File(fileM186340e, "pcam.jar").exists()) {
                    m186343i(4026, jCurrentTimeMillis);
                    return false;
                }
                if (new File(fileM186340e, "pcbc").exists()) {
                    m186343i(5019, jCurrentTimeMillis);
                    return true;
                }
                m186343i(4027, jCurrentTimeMillis);
                return false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: e */
    public final File m186340e(@NonNull String str) {
        return new File(new File(this.f169190a.getDir("pccache", 0), this.f169192c), str);
    }

    /* JADX INFO: renamed from: g */
    public final String m186341g() {
        return "FBAMTD".concat(String.valueOf(this.f169192c));
    }

    /* JADX INFO: renamed from: h */
    public final String m186342h() {
        return "LATMTD".concat(String.valueOf(this.f169192c));
    }

    /* JADX INFO: renamed from: i */
    public final void m186343i(int i, long j) {
        this.f169193d.mo98503b(i, j);
    }

    /* JADX INFO: renamed from: j */
    public final void m186344j(int i, long j, String str) {
        this.f169193d.mo98502a(i, j, str);
    }

    @Nullable
    /* JADX INFO: renamed from: k */
    public final C2287v m186345k(int i) {
        SharedPreferences sharedPreferences = this.f169191b;
        String string = i == 1 ? sharedPreferences.getString(m186342h(), null) : sharedPreferences.getString(m186341g(), null);
        if (string == null) {
            return null;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        try {
            byte[] bArrStringToBytes = Hex.stringToBytes(string);
            zzgyl zzgylVar = zzgyl.zzb;
            return C2287v.m13413S(zzgyl.zzv(bArrStringToBytes, 0, bArrStringToBytes.length), this.f169194e ? jhx0.m144944a() : jhx0.m144945b());
        } catch (zzhag unused) {
            return null;
        } catch (NullPointerException unused2) {
            m186343i(TXLiteAVCode.EVT_MIC_RELEASE_SUCC, jCurrentTimeMillis);
            return null;
        } catch (RuntimeException unused3) {
            m186343i(2032, jCurrentTimeMillis);
            return null;
        }
    }
}
