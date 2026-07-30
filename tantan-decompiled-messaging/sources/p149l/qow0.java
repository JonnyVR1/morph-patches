package p149l;

import android.os.Bundle;
import com.clevertap.android.sdk.Constants;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.measurement.internal.zzbe;
import com.google.android.gms.measurement.internal.zzbf;
import com.tencent.youtu.sdkkitframework.common.WeJson;
import java.util.ArrayList;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes6.dex */
public final class qow0 {

    /* JADX INFO: renamed from: b */
    public static final AtomicReference<String[]> f155637b = new AtomicReference<>();

    /* JADX INFO: renamed from: c */
    public static final AtomicReference<String[]> f155638c = new AtomicReference<>();

    /* JADX INFO: renamed from: d */
    public static final AtomicReference<String[]> f155639d = new AtomicReference<>();

    /* JADX INFO: renamed from: a */
    public final csw0 f155640a;

    public qow0(csw0 csw0Var) {
        this.f155640a = csw0Var;
    }

    /* JADX INFO: renamed from: d */
    public static String m175773d(String str, String[] strArr, String[] strArr2, AtomicReference<String[]> atomicReference) {
        String str2;
        Preconditions.checkNotNull(strArr);
        Preconditions.checkNotNull(strArr2);
        Preconditions.checkNotNull(atomicReference);
        Preconditions.checkArgument(strArr.length == strArr2.length);
        for (int i = 0; i < strArr.length; i++) {
            if (Objects.equals(str, strArr[i])) {
                synchronized (atomicReference) {
                    try {
                        String[] strArr3 = atomicReference.get();
                        if (strArr3 == null) {
                            strArr3 = new String[strArr2.length];
                            atomicReference.set(strArr3);
                        }
                        if (strArr3[i] == null) {
                            strArr3[i] = strArr2[i] + "(" + strArr[i] + ")";
                        }
                        str2 = strArr3[i];
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return str2;
            }
        }
        return str;
    }

    /* JADX INFO: renamed from: a */
    public final String m175774a(Bundle bundle) {
        String strM175777e;
        if (bundle == null) {
            return null;
        }
        if (!this.f155640a.zza()) {
            return bundle.toString();
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Bundle[{");
        for (String str : bundle.keySet()) {
            if (sb.length() != 8) {
                sb.append(", ");
            }
            sb.append(m175778f(str));
            sb.append("=");
            Object obj = bundle.get(str);
            if (obj instanceof Bundle) {
                strM175777e = m175777e(new Object[]{obj});
            } else if (obj instanceof Object[]) {
                strM175777e = m175777e((Object[]) obj);
            } else {
                strM175777e = obj instanceof ArrayList ? m175777e(((ArrayList) obj).toArray()) : String.valueOf(obj);
            }
            sb.append(strM175777e);
        }
        sb.append("}]");
        return sb.toString();
    }

    /* JADX INFO: renamed from: b */
    public final String m175775b(zzbf zzbfVar) {
        String string = null;
        if (zzbfVar == null) {
            return null;
        }
        if (!this.f155640a.zza()) {
            return zzbfVar.toString();
        }
        StringBuilder sb = new StringBuilder("origin=");
        sb.append(zzbfVar.zzc);
        sb.append(",name=");
        sb.append(m175776c(zzbfVar.zza));
        sb.append(",params=");
        zzbe zzbeVar = zzbfVar.zzb;
        if (zzbeVar != null) {
            string = !this.f155640a.zza() ? zzbeVar.toString() : m175774a(zzbeVar.m15324F());
        }
        sb.append(string);
        return sb.toString();
    }

    /* JADX INFO: renamed from: c */
    public final String m175776c(String str) {
        if (str == null) {
            return null;
        }
        return !this.f155640a.zza() ? str : m175773d(str, arx0.f71366c, arx0.f71364a, f155637b);
    }

    /* JADX INFO: renamed from: e */
    public final String m175777e(Object[] objArr) {
        if (objArr == null) {
            return WeJson.EMPTY_ARR;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (Object obj : objArr) {
            String strM175774a = obj instanceof Bundle ? m175774a((Bundle) obj) : String.valueOf(obj);
            if (strM175774a != null) {
                if (sb.length() != 1) {
                    sb.append(", ");
                }
                sb.append(strM175774a);
            }
        }
        sb.append(Constants.AES_SUFFIX);
        return sb.toString();
    }

    /* JADX INFO: renamed from: f */
    public final String m175778f(String str) {
        if (str == null) {
            return null;
        }
        return !this.f155640a.zza() ? str : m175773d(str, jrx0.f119452b, jrx0.f119451a, f155638c);
    }

    /* JADX INFO: renamed from: g */
    public final String m175779g(String str) {
        if (str == null) {
            return null;
        }
        if (!this.f155640a.zza()) {
            return str;
        }
        if (!str.startsWith("_exp_")) {
            return m175773d(str, frx0.f99018b, frx0.f99017a, f155639d);
        }
        return "experiment_id(" + str + ")";
    }
}
