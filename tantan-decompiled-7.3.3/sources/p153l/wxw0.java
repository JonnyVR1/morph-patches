package p153l;

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
public final class wxw0 {

    /* JADX INFO: renamed from: b */
    public static final AtomicReference<String[]> f191533b = new AtomicReference<>();

    /* JADX INFO: renamed from: c */
    public static final AtomicReference<String[]> f191534c = new AtomicReference<>();

    /* JADX INFO: renamed from: d */
    public static final AtomicReference<String[]> f191535d = new AtomicReference<>();

    /* JADX INFO: renamed from: a */
    public final i1x0 f191536a;

    public wxw0(i1x0 i1x0Var) {
        this.f191536a = i1x0Var;
    }

    /* JADX INFO: renamed from: d */
    public static String m208446d(String str, String[] strArr, String[] strArr2, AtomicReference<String[]> atomicReference) {
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
    public final String m208447a(Bundle bundle) {
        String strM208450e;
        if (bundle == null) {
            return null;
        }
        if (!this.f191536a.zza()) {
            return bundle.toString();
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Bundle[{");
        for (String str : bundle.keySet()) {
            if (sb.length() != 8) {
                sb.append(", ");
            }
            sb.append(m208451f(str));
            sb.append("=");
            Object obj = bundle.get(str);
            if (obj instanceof Bundle) {
                strM208450e = m208450e(new Object[]{obj});
            } else if (obj instanceof Object[]) {
                strM208450e = m208450e((Object[]) obj);
            } else {
                strM208450e = obj instanceof ArrayList ? m208450e(((ArrayList) obj).toArray()) : String.valueOf(obj);
            }
            sb.append(strM208450e);
        }
        sb.append("}]");
        return sb.toString();
    }

    /* JADX INFO: renamed from: b */
    public final String m208448b(zzbf zzbfVar) {
        String string = null;
        if (zzbfVar == null) {
            return null;
        }
        if (!this.f191536a.zza()) {
            return zzbfVar.toString();
        }
        StringBuilder sb = new StringBuilder("origin=");
        sb.append(zzbfVar.zzc);
        sb.append(",name=");
        sb.append(m208449c(zzbfVar.zza));
        sb.append(",params=");
        zzbe zzbeVar = zzbfVar.zzb;
        if (zzbeVar != null) {
            string = !this.f191536a.zza() ? zzbeVar.toString() : m208447a(zzbeVar.m15378F());
        }
        sb.append(string);
        return sb.toString();
    }

    /* JADX INFO: renamed from: c */
    public final String m208449c(String str) {
        if (str == null) {
            return null;
        }
        return !this.f191536a.zza() ? str : m208446d(str, g0y0.f101694c, g0y0.f101692a, f191533b);
    }

    /* JADX INFO: renamed from: e */
    public final String m208450e(Object[] objArr) {
        if (objArr == null) {
            return WeJson.EMPTY_ARR;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (Object obj : objArr) {
            String strM208447a = obj instanceof Bundle ? m208447a((Bundle) obj) : String.valueOf(obj);
            if (strM208447a != null) {
                if (sb.length() != 1) {
                    sb.append(", ");
                }
                sb.append(strM208447a);
            }
        }
        sb.append(Constants.AES_SUFFIX);
        return sb.toString();
    }

    /* JADX INFO: renamed from: f */
    public final String m208451f(String str) {
        if (str == null) {
            return null;
        }
        return !this.f191536a.zza() ? str : m208446d(str, p0y0.f150107b, p0y0.f150106a, f191534c);
    }

    /* JADX INFO: renamed from: g */
    public final String m208452g(String str) {
        if (str == null) {
            return null;
        }
        if (!this.f191536a.zza()) {
            return str;
        }
        if (!str.startsWith("_exp_")) {
            return m208446d(str, l0y0.f129628b, l0y0.f129627a, f191535d);
        }
        return "experiment_id(" + str + ")";
    }
}
