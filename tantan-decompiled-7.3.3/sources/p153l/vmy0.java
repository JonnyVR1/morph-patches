package p153l;

import android.annotation.TargetApi;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.annotation.WorkerThread;
import com.alibaba.sdk.android.oss.signer.SignParameters;
import com.clevertap.android.sdk.Constants;
import com.facebook.AuthenticationTokenClaims;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.internal.measurement.AbstractC2372u0;
import com.google.android.gms.internal.measurement.C2331a0;
import com.google.android.gms.internal.measurement.C2335c;
import com.google.android.gms.internal.measurement.C2336c0;
import com.google.android.gms.internal.measurement.C2337d;
import com.google.android.gms.internal.measurement.C2338d0;
import com.google.android.gms.internal.measurement.C2339e;
import com.google.android.gms.internal.measurement.C2340e0;
import com.google.android.gms.internal.measurement.C2342f0;
import com.google.android.gms.internal.measurement.C2368s0;
import com.google.android.gms.internal.measurement.C2369t;
import com.google.android.gms.internal.measurement.C2373v;
import com.google.android.gms.internal.measurement.C2375w;
import com.google.android.gms.internal.measurement.C2377x;
import com.google.android.gms.internal.measurement.C2379y;
import com.google.android.gms.internal.measurement.zzfo$zzd;
import com.google.android.gms.internal.measurement.zzfo$zzf;
import com.google.android.gms.internal.measurement.zzfy$zzj;
import com.google.android.gms.internal.measurement.zzkb;
import com.google.android.gms.measurement.internal.C2479e;
import com.google.android.gms.measurement.internal.C2484j;
import com.google.android.gms.measurement.internal.zzbe;
import com.google.android.gms.measurement.internal.zzbf;
import com.google.android.gms.measurement.internal.zzno;
import com.google.android.gms.measurement.internal.zzo;
import com.tantanapp.ijk.media.player.IjkMediaPlayer;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;
import org.checkerframework.dataflow.qual.Pure;

/* JADX INFO: loaded from: classes6.dex */
public final class vmy0 extends njy0 {
    public vmy0(C2484j c2484j) {
        super(c2484j);
    }

    /* JADX INFO: renamed from: C */
    public static Object m201856C(C2379y c2379y, String str, Object obj) {
        Object objM201869Z = m201869Z(c2379y, str);
        return objM201869Z == null ? obj : objM201869Z;
    }

    /* JADX INFO: renamed from: G */
    public static String m201857G(boolean z, boolean z2, boolean z3) {
        StringBuilder sb = new StringBuilder();
        if (z) {
            sb.append("Dynamic ");
        }
        if (z2) {
            sb.append("Sequence ");
        }
        if (z3) {
            sb.append("Session-Scoped ");
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: H */
    public static List<Long> m201858H(BitSet bitSet) {
        int length = (bitSet.length() + 63) / 64;
        ArrayList arrayList = new ArrayList(length);
        for (int i = 0; i < length; i++) {
            long j = 0;
            for (int i2 = 0; i2 < 64; i2++) {
                int i3 = (i << 6) + i2;
                if (i3 >= bitSet.length()) {
                    break;
                }
                if (bitSet.get(i3)) {
                    j |= 1 << i2;
                }
            }
            arrayList.add(Long.valueOf(j));
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: K */
    public static <BuilderT extends i9y0> BuilderT m201859K(BuilderT buildert, byte[] bArr) throws zzkb {
        C2368s0 c2368s0M14334a = C2368s0.m14334a();
        return c2368s0M14334a != null ? (BuilderT) buildert.mo139157J(bArr, c2368s0M14334a) : (BuilderT) buildert.zza(bArr);
    }

    /* JADX INFO: renamed from: L */
    public static void m201860L(Uri.Builder builder, String str, String str2, Set<String> set) {
        if (set.contains(str) || TextUtils.isEmpty(str2)) {
            return;
        }
        builder.appendQueryParameter(str, str2);
    }

    /* JADX INFO: renamed from: M */
    public static void m201861M(Uri.Builder builder, String[] strArr, Bundle bundle, Set<String> set) {
        for (String str : strArr) {
            String[] strArrSplit = str.split(Constants.SEPARATOR_COMMA);
            String str2 = strArrSplit[0];
            String str3 = strArrSplit[strArrSplit.length - 1];
            String string = bundle.getString(str2);
            if (string != null) {
                m201860L(builder, str3, string, set);
            }
        }
    }

    /* JADX INFO: renamed from: N */
    public static void m201862N(C2379y.a aVar, String str, Object obj) {
        List<C2331a0> listM14571T = aVar.m14571T();
        int i = 0;
        while (true) {
            if (i >= listM14571T.size()) {
                i = -1;
                break;
            } else if (str.equals(listM14571T.get(i).m13839Z())) {
                break;
            } else {
                i++;
            }
        }
        C2331a0.a aVarM13849A = C2331a0.m13833X().m13849A(str);
        if (obj instanceof Long) {
            aVarM13849A.m13859x(((Long) obj).longValue());
        } else if (obj instanceof String) {
            aVarM13849A.m13851C((String) obj);
        } else if (obj instanceof Double) {
            aVarM13849A.m13858w(((Double) obj).doubleValue());
        }
        if (i >= 0) {
            aVar.m14575x(i, aVarM13849A);
        } else {
            aVar.m14561A(aVarM13849A);
        }
    }

    /* JADX INFO: renamed from: Q */
    public static void m201863Q(StringBuilder sb, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            sb.append("  ");
        }
    }

    /* JADX INFO: renamed from: S */
    public static void m201864S(StringBuilder sb, int i, String str, zzfo$zzd zzfo_zzd) {
        if (zzfo_zzd == null) {
            return;
        }
        m201863Q(sb, i);
        sb.append(str);
        sb.append(" {\n");
        if (zzfo_zzd.m14615L()) {
            m201866U(sb, i, "comparison_type", zzfo_zzd.m14610B().name());
        }
        if (zzfo_zzd.m14617N()) {
            m201866U(sb, i, "match_as_float", Boolean.valueOf(zzfo_zzd.m14614K()));
        }
        if (zzfo_zzd.m14616M()) {
            m201866U(sb, i, "comparison_value", zzfo_zzd.m14611E());
        }
        if (zzfo_zzd.m14619U()) {
            m201866U(sb, i, "min_comparison_value", zzfo_zzd.m14613I());
        }
        if (zzfo_zzd.m14618T()) {
            m201866U(sb, i, "max_comparison_value", zzfo_zzd.m14612G());
        }
        m201863Q(sb, i);
        sb.append("}\n");
    }

    /* JADX INFO: renamed from: T */
    public static void m201865T(StringBuilder sb, int i, String str, C2338d0 c2338d0) {
        if (c2338d0 == null) {
            return;
        }
        m201863Q(sb, 3);
        sb.append(str);
        sb.append(" {\n");
        if (c2338d0.m14167D() != 0) {
            m201863Q(sb, 4);
            sb.append("results: ");
            int i2 = 0;
            for (Long l2 : c2338d0.m14171Y()) {
                int i3 = i2 + 1;
                if (i2 != 0) {
                    sb.append(", ");
                }
                sb.append(l2);
                i2 = i3;
            }
            sb.append('\n');
        }
        if (c2338d0.m14169M() != 0) {
            m201863Q(sb, 4);
            sb.append("status: ");
            int i4 = 0;
            for (Long l3 : c2338d0.m14173a0()) {
                int i5 = i4 + 1;
                if (i4 != 0) {
                    sb.append(", ");
                }
                sb.append(l3);
                i4 = i5;
            }
            sb.append('\n');
        }
        if (c2338d0.m14174h() != 0) {
            m201863Q(sb, 4);
            sb.append("dynamic_filter_timestamps: {");
            int i6 = 0;
            for (C2377x c2377x : c2338d0.m14170X()) {
                int i7 = i6 + 1;
                if (i6 != 0) {
                    sb.append(", ");
                }
                sb.append(c2377x.m14535K() ? Integer.valueOf(c2377x.m14536h()) : null);
                sb.append(":");
                sb.append(c2377x.m14534I() ? Long.valueOf(c2377x.m14533D()) : null);
                i6 = i7;
            }
            sb.append("}\n");
        }
        if (c2338d0.m14168I() != 0) {
            m201863Q(sb, 4);
            sb.append("sequence_filter_timestamps: {");
            int i8 = 0;
            for (C2340e0 c2340e0 : c2338d0.m14172Z()) {
                int i9 = i8 + 1;
                if (i8 != 0) {
                    sb.append(", ");
                }
                sb.append(c2340e0.m14202L() ? Integer.valueOf(c2340e0.m14200E()) : null);
                sb.append(": [");
                Iterator<Long> it = c2340e0.m14201K().iterator();
                int i10 = 0;
                while (it.hasNext()) {
                    long jLongValue = it.next().longValue();
                    int i11 = i10 + 1;
                    if (i10 != 0) {
                        sb.append(", ");
                    }
                    sb.append(jLongValue);
                    i10 = i11;
                }
                sb.append(Constants.AES_SUFFIX);
                i8 = i9;
            }
            sb.append("}\n");
        }
        m201863Q(sb, 3);
        sb.append("}\n");
    }

    /* JADX INFO: renamed from: U */
    public static void m201866U(StringBuilder sb, int i, String str, Object obj) {
        if (obj == null) {
            return;
        }
        m201863Q(sb, i + 1);
        sb.append(str);
        sb.append(": ");
        sb.append(obj);
        sb.append('\n');
    }

    @WorkerThread
    /* JADX INFO: renamed from: X */
    public static boolean m201867X(zzbf zzbfVar, zzo zzoVar) {
        Preconditions.checkNotNull(zzbfVar);
        Preconditions.checkNotNull(zzoVar);
        return (TextUtils.isEmpty(zzoVar.zzb) && TextUtils.isEmpty(zzoVar.zzp)) ? false : true;
    }

    /* JADX INFO: renamed from: Y */
    public static boolean m201868Y(List<Long> list, int i) {
        if (i < (list.size() << 6)) {
            return ((1 << (i % 64)) & list.get(i / 64).longValue()) != 0;
        }
        return false;
    }

    /* JADX INFO: renamed from: Z */
    public static Object m201869Z(C2379y c2379y, String str) {
        C2331a0 c2331a0M201874z = m201874z(c2379y, str);
        if (c2331a0M201874z == null) {
            return null;
        }
        if (c2331a0M201874z.m13846g0()) {
            return c2331a0M201874z.m13840a0();
        }
        if (c2331a0M201874z.m13844e0()) {
            return Long.valueOf(c2331a0M201874z.m13838V());
        }
        if (c2331a0M201874z.m13842c0()) {
            return Double.valueOf(c2331a0M201874z.m13835B());
        }
        if (c2331a0M201874z.m13837T() > 0) {
            return m201871c0(c2331a0M201874z.m13841b0());
        }
        return null;
    }

    /* JADX INFO: renamed from: a0 */
    public static boolean m201870a0(String str) {
        return str != null && str.matches("([+-])?([0-9]+\\.?[0-9]*|[0-9]*\\.?[0-9]+)") && str.length() <= 310;
    }

    /* JADX INFO: renamed from: c0 */
    public static Bundle[] m201871c0(List<C2331a0> list) {
        ArrayList arrayList = new ArrayList();
        for (C2331a0 c2331a0 : list) {
            if (c2331a0 != null) {
                Bundle bundle = new Bundle();
                for (C2331a0 c2331a1 : c2331a0.m13841b0()) {
                    if (c2331a1.m13846g0()) {
                        bundle.putString(c2331a1.m13839Z(), c2331a1.m13840a0());
                    } else if (c2331a1.m13844e0()) {
                        bundle.putLong(c2331a1.m13839Z(), c2331a1.m13838V());
                    } else if (c2331a1.m13842c0()) {
                        bundle.putDouble(c2331a1.m13839Z(), c2331a1.m13835B());
                    }
                }
                if (!bundle.isEmpty()) {
                    arrayList.add(bundle);
                }
            }
        }
        return (Bundle[]) arrayList.toArray(new Bundle[arrayList.size()]);
    }

    /* JADX INFO: renamed from: s */
    public static int m201872s(C2336c0.a aVar, String str) {
        if (aVar == null) {
            return -1;
        }
        for (int i = 0; i < aVar.m14116k0(); i++) {
            if (str.equals(aVar.m14081S0(i).m14220X())) {
                return i;
            }
        }
        return -1;
    }

    /* JADX INFO: renamed from: v */
    public static Bundle m201873v(List<C2331a0> list) {
        Bundle bundle = new Bundle();
        for (C2331a0 c2331a0 : list) {
            String strM13839Z = c2331a0.m13839Z();
            if (c2331a0.m13842c0()) {
                bundle.putDouble(strM13839Z, c2331a0.m13835B());
            } else if (c2331a0.m13843d0()) {
                bundle.putFloat(strM13839Z, c2331a0.m13836L());
            } else if (c2331a0.m13846g0()) {
                bundle.putString(strM13839Z, c2331a0.m13840a0());
            } else if (c2331a0.m13844e0()) {
                bundle.putLong(strM13839Z, c2331a0.m13838V());
            }
        }
        return bundle;
    }

    /* JADX INFO: renamed from: z */
    public static C2331a0 m201874z(C2379y c2379y, String str) {
        for (C2331a0 c2331a0 : c2379y.m14555Y()) {
            if (c2331a0.m13839Z().equals(str)) {
                return c2331a0;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: A */
    public final zzbf m201875A(efr0 efr0Var) {
        Object obj;
        Bundle bundleM201892w = m201892w(efr0Var.m120715g(), true);
        String string = (!bundleM201892w.containsKey("_o") || (obj = bundleM201892w.get("_o")) == null) ? "app" : obj.toString();
        String strM128476b = g0y0.m128476b(efr0Var.m120713e());
        if (strM128476b == null) {
            strM128476b = efr0Var.m120713e();
        }
        return new zzbf(strM128476b, new zzbe(bundleM201892w), string, efr0Var.m120710a());
    }

    @TargetApi(30)
    /* JADX INFO: renamed from: B */
    public final zzno m201876B(String str, C2336c0.a aVar, C2379y.a aVar2, String str2) {
        int iIndexOf;
        if (!spy0.m187491a() || !mo15139a().m98452z(str, whs0.f189209I0)) {
            return null;
        }
        long jCurrentTimeMillis = zzb().currentTimeMillis();
        String[] strArrSplit = mo15139a().m98450x(str, whs0.f189266h0).split(Constants.SEPARATOR_COMMA);
        HashSet hashSet = new HashSet(strArrSplit.length);
        for (String str3 : strArrSplit) {
            Objects.requireNonNull(str3);
            if (!hashSet.add(str3)) {
                ypg0.m217021a("duplicate element: ", str3);
                return null;
            }
        }
        Set setUnmodifiableSet = Collections.unmodifiableSet(hashSet);
        vjy0 vjy0VarMo15197n = mo15197n();
        String strM15176L = vjy0VarMo15197n.mo15195l().m15176L(str);
        Uri.Builder builder = new Uri.Builder();
        builder.scheme(vjy0VarMo15197n.mo15139a().m98450x(str, whs0.f189245a0));
        if (TextUtils.isEmpty(strM15176L)) {
            builder.authority(vjy0VarMo15197n.mo15139a().m98450x(str, whs0.f189248b0));
        } else {
            builder.authority(strM15176L + "." + vjy0VarMo15197n.mo15139a().m98450x(str, whs0.f189248b0));
        }
        builder.path(vjy0VarMo15197n.mo15139a().m98450x(str, whs0.f189251c0));
        m201860L(builder, "gmp_app_id", aVar.m14125o1(), setUnmodifiableSet);
        m201860L(builder, "gmp_version", "106000", setUnmodifiableSet);
        String strM14119l1 = aVar.m14119l1();
        ajr0 ajr0VarMo15139a = mo15139a();
        zpw0<Boolean> zpw0Var = whs0.f189215L0;
        if (ajr0VarMo15139a.m98452z(str, zpw0Var) && mo15195l().m15185U(str)) {
            strM14119l1 = "";
        }
        m201860L(builder, "app_instance_id", strM14119l1, setUnmodifiableSet);
        m201860L(builder, "rdid", aVar.m14129q1(), setUnmodifiableSet);
        m201860L(builder, "bundle_id", aVar.m14117k1(), setUnmodifiableSet);
        String strM14570N = aVar2.m14570N();
        String strM128475a = g0y0.m128475a(strM14570N);
        if (!TextUtils.isEmpty(strM128475a)) {
            strM14570N = strM128475a;
        }
        m201860L(builder, "app_event_name", strM14570N, setUnmodifiableSet);
        m201860L(builder, "app_version", String.valueOf(aVar.m14092Y()), setUnmodifiableSet);
        String strM14127p1 = aVar.m14127p1();
        if (mo15139a().m98452z(str, zpw0Var) && mo15195l().m15189Y(str) && !TextUtils.isEmpty(strM14127p1) && (iIndexOf = strM14127p1.indexOf(".")) != -1) {
            strM14127p1 = strM14127p1.substring(0, iIndexOf);
        }
        m201860L(builder, "os_version", strM14127p1, setUnmodifiableSet);
        m201860L(builder, "timestamp", String.valueOf(aVar2.m14568L()), setUnmodifiableSet);
        if (aVar.m14088W()) {
            m201860L(builder, "lat", "1", setUnmodifiableSet);
        }
        m201860L(builder, "privacy_sandbox_version", String.valueOf(aVar.m14134v()), setUnmodifiableSet);
        m201860L(builder, "trigger_uri_source", "1", setUnmodifiableSet);
        m201860L(builder, "trigger_uri_timestamp", String.valueOf(jCurrentTimeMillis), setUnmodifiableSet);
        m201860L(builder, "request_uuid", str2, setUnmodifiableSet);
        List<C2331a0> listM14571T = aVar2.m14571T();
        Bundle bundle = new Bundle();
        for (C2331a0 c2331a0 : listM14571T) {
            String strM13839Z = c2331a0.m13839Z();
            if (c2331a0.m13842c0()) {
                bundle.putString(strM13839Z, String.valueOf(c2331a0.m13835B()));
            } else if (c2331a0.m13843d0()) {
                bundle.putString(strM13839Z, String.valueOf(c2331a0.m13836L()));
            } else if (c2331a0.m13846g0()) {
                bundle.putString(strM13839Z, c2331a0.m13840a0());
            } else if (c2331a0.m13844e0()) {
                bundle.putString(strM13839Z, String.valueOf(c2331a0.m13838V()));
            }
        }
        m201861M(builder, mo15139a().m98450x(str, whs0.f189263g0).split("\\|"), bundle, setUnmodifiableSet);
        List<C2342f0> listM14084U = aVar.m14084U();
        Bundle bundle2 = new Bundle();
        for (C2342f0 c2342f0 : listM14084U) {
            String strM14220X = c2342f0.m14220X();
            if (c2342f0.m14222Z()) {
                bundle2.putString(strM14220X, String.valueOf(c2342f0.m14216B()));
            } else if (c2342f0.m14223a0()) {
                bundle2.putString(strM14220X, String.valueOf(c2342f0.m14217I()));
            } else if (c2342f0.m14226d0()) {
                bundle2.putString(strM14220X, c2342f0.m14221Y());
            } else if (c2342f0.m14224b0()) {
                bundle2.putString(strM14220X, String.valueOf(c2342f0.m14218N()));
            }
        }
        m201861M(builder, mo15139a().m98450x(str, whs0.f189260f0).split("\\|"), bundle2, setUnmodifiableSet);
        m201860L(builder, "dma", aVar.m14086V() ? "1" : "0", setUnmodifiableSet);
        if (!aVar.m14123n1().isEmpty()) {
            m201860L(builder, "dma_cps", aVar.m14123n1(), setUnmodifiableSet);
        }
        if (mo15139a().m98440n(whs0.f189219N0) && aVar.m14090X()) {
            C2369t c2369tM14143z0 = aVar.m14143z0();
            if (!c2369tM14143z0.m14357e0().isEmpty()) {
                m201860L(builder, "dl_gclid", c2369tM14143z0.m14357e0(), setUnmodifiableSet);
            }
            if (!c2369tM14143z0.m14356d0().isEmpty()) {
                m201860L(builder, "dl_gbraid", c2369tM14143z0.m14356d0(), setUnmodifiableSet);
            }
            if (!c2369tM14143z0.m14355a0().isEmpty()) {
                m201860L(builder, "dl_gs", c2369tM14143z0.m14355a0(), setUnmodifiableSet);
            }
            if (c2369tM14143z0.m14353B() > 0) {
                m201860L(builder, "dl_ss_ts", String.valueOf(c2369tM14143z0.m14353B()), setUnmodifiableSet);
            }
            if (!c2369tM14143z0.m14360h0().isEmpty()) {
                m201860L(builder, "mr_gclid", c2369tM14143z0.m14360h0(), setUnmodifiableSet);
            }
            if (!c2369tM14143z0.m14359g0().isEmpty()) {
                m201860L(builder, "mr_gbraid", c2369tM14143z0.m14359g0(), setUnmodifiableSet);
            }
            if (!c2369tM14143z0.m14358f0().isEmpty()) {
                m201860L(builder, "mr_gs", c2369tM14143z0.m14358f0(), setUnmodifiableSet);
            }
            if (c2369tM14143z0.m14354G() > 0) {
                m201860L(builder, "mr_click_ts", String.valueOf(c2369tM14143z0.m14354G()), setUnmodifiableSet);
            }
        }
        return new zzno(builder.build().toString(), jCurrentTimeMillis, 1);
    }

    /* JADX INFO: renamed from: D */
    public final String m201877D(C2335c c2335c) {
        if (c2335c == null) {
            return "null";
        }
        StringBuilder sb = new StringBuilder();
        sb.append("\nevent_filter {\n");
        if (c2335c.m13896W()) {
            m201866U(sb, 0, "filter_id", Integer.valueOf(c2335c.m13888E()));
        }
        m201866U(sb, 0, "event_name", mo15141c().m208449c(c2335c.m13890L()));
        String strM201857G = m201857G(c2335c.m13892N(), c2335c.m13893T(), c2335c.m13894U());
        if (!strM201857G.isEmpty()) {
            m201866U(sb, 0, "filter_type", strM201857G);
        }
        if (c2335c.m13895V()) {
            m201864S(sb, 1, "event_count_filter", c2335c.m13889K());
        }
        if (c2335c.m13898h() > 0) {
            sb.append("  filters {\n");
            Iterator<C2337d> it = c2335c.m13891M().iterator();
            while (it.hasNext()) {
                m201884R(sb, 2, it.next());
            }
        }
        m201863Q(sb, 1);
        sb.append("}\n}\n");
        return sb.toString();
    }

    /* JADX INFO: renamed from: E */
    public final String m201878E(C2339e c2339e) {
        if (c2339e == null) {
            return "null";
        }
        StringBuilder sb = new StringBuilder();
        sb.append("\nproperty_filter {\n");
        if (c2339e.m14191M()) {
            m201866U(sb, 0, "filter_id", Integer.valueOf(c2339e.m14193h()));
        }
        m201866U(sb, 0, "property_name", mo15141c().m208452g(c2339e.m14187G()));
        String strM201857G = m201857G(c2339e.m14188I(), c2339e.m14189K(), c2339e.m14190L());
        if (!strM201857G.isEmpty()) {
            m201866U(sb, 0, "filter_type", strM201857G);
        }
        m201884R(sb, 1, c2339e.m14186C());
        sb.append("}\n");
        return sb.toString();
    }

    /* JADX INFO: renamed from: F */
    public final String m201879F(zzfy$zzj zzfy_zzj) {
        C2373v c2373vM14048w2;
        if (zzfy_zzj == null) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        sb.append("\nbatch {\n");
        if (gqy0.m131505a() && mo15139a().m98440n(whs0.f189306y0) && zzfy_zzj.m14661h() > 0) {
            mo15143e();
            if (hny0.m136291B0(zzfy_zzj.m14654C(0).m13975A2())) {
                if (zzfy_zzj.m14659W()) {
                    m201866U(sb, 0, "upload_subdomain", zzfy_zzj.m14656T());
                }
                if (zzfy_zzj.m14658V()) {
                    m201866U(sb, 0, "sgtm_join_id", zzfy_zzj.m14655N());
                }
            }
        }
        for (C2336c0 c2336c0 : zzfy_zzj.m14657U()) {
            if (c2336c0 != null) {
                m201863Q(sb, 1);
                sb.append("bundle {\n");
                if (c2336c0.m13996U0()) {
                    m201866U(sb, 1, "protocol_version", Integer.valueOf(c2336c0.m14051z1()));
                }
                if (upy0.m197192a() && mo15139a().m98452z(c2336c0.m13975A2(), whs0.f189304x0) && c2336c0.m14000X0()) {
                    m201866U(sb, 1, "session_stitching_token", c2336c0.m14027l0());
                }
                m201866U(sb, 1, "platform", c2336c0.m14023j0());
                if (c2336c0.m13990P0()) {
                    m201866U(sb, 1, "gmp_version", Long.valueOf(c2336c0.m14022i2()));
                }
                if (c2336c0.m14012c1()) {
                    m201866U(sb, 1, "uploading_gmp_version", Long.valueOf(c2336c0.m14044u2()));
                }
                if (c2336c0.m13987N0()) {
                    m201866U(sb, 1, "dynamite_version", Long.valueOf(c2336c0.m14010b2()));
                }
                if (c2336c0.m13979G0()) {
                    m201866U(sb, 1, "config_version", Long.valueOf(c2336c0.m13995T1()));
                }
                m201866U(sb, 1, "gmp_app_id", c2336c0.m14018g0());
                m201866U(sb, 1, "admob_app_id", c2336c0.m14052z2());
                m201866U(sb, 1, com.tencent.connect.common.Constants.JumpUrlConstants.URL_KEY_APPID, c2336c0.m13975A2());
                m201866U(sb, 1, "app_version", c2336c0.m14004Z());
                if (c2336c0.m14045v0()) {
                    m201866U(sb, 1, "app_version_major", Integer.valueOf(c2336c0.m14049x0()));
                }
                m201866U(sb, 1, "firebase_instance_id", c2336c0.m14016f0());
                if (c2336c0.m13985L0()) {
                    m201866U(sb, 1, "dev_cert_hash", Long.valueOf(c2336c0.m14001X1()));
                }
                m201866U(sb, 1, "app_store", c2336c0.m14002Y());
                if (c2336c0.m14009b1()) {
                    m201866U(sb, 1, "upload_timestamp_millis", Long.valueOf(c2336c0.m14040s2()));
                }
                if (c2336c0.m14003Y0()) {
                    m201866U(sb, 1, "start_timestamp_millis", Long.valueOf(c2336c0.m14034o2()));
                }
                if (c2336c0.m13988O0()) {
                    m201866U(sb, 1, "end_timestamp_millis", Long.valueOf(c2336c0.m14017f2()));
                }
                if (c2336c0.m13994T0()) {
                    m201866U(sb, 1, "previous_bundle_start_timestamp_millis", Long.valueOf(c2336c0.m14031m2()));
                }
                if (c2336c0.m13993S0()) {
                    m201866U(sb, 1, "previous_bundle_end_timestamp_millis", Long.valueOf(c2336c0.m14026k2()));
                }
                m201866U(sb, 1, "app_instance_id", c2336c0.m13999X());
                m201866U(sb, 1, "resettable_device_id", c2336c0.m14024k0());
                m201866U(sb, 1, "ds_id", c2336c0.m14015e0());
                if (c2336c0.m13992R0()) {
                    m201866U(sb, 1, "limited_ad_tracking", Boolean.valueOf(c2336c0.m14039s0()));
                }
                m201866U(sb, 1, "os_version", c2336c0.m14021i0());
                m201866U(sb, 1, "device_model", c2336c0.m14013d0());
                m201866U(sb, 1, "user_default_language", c2336c0.m14029m0());
                if (c2336c0.m14007a1()) {
                    m201866U(sb, 1, "time_zone_offset_minutes", Integer.valueOf(c2336c0.m13983J1()));
                }
                if (c2336c0.m13978F0()) {
                    m201866U(sb, 1, "bundle_sequential_index", Integer.valueOf(c2336c0.m14014d1()));
                }
                if (gqy0.m131505a()) {
                    mo15143e();
                    if (hny0.m136291B0(c2336c0.m13975A2()) && mo15139a().m98440n(whs0.f189306y0) && c2336c0.m13984K0()) {
                        m201866U(sb, 1, "delivery_index", Integer.valueOf(c2336c0.m14030m1()));
                    }
                }
                if (c2336c0.m13998W0()) {
                    m201866U(sb, 1, "service_upload", Boolean.valueOf(c2336c0.m14041t0()));
                }
                m201866U(sb, 1, "health_monitor", c2336c0.m14020h0());
                if (c2336c0.m13997V0()) {
                    m201866U(sb, 1, IjkMediaPlayer.OnNativeInvokeListener.ARG_RETRY_COUNTER, Integer.valueOf(c2336c0.m13977E1()));
                }
                if (c2336c0.m13981I0()) {
                    m201866U(sb, 1, "consent_signals", c2336c0.m14008b0());
                }
                if (c2336c0.m13991Q0()) {
                    m201866U(sb, 1, "is_dma_region", Boolean.valueOf(c2336c0.m14038r0()));
                }
                if (c2336c0.m13982J0()) {
                    m201866U(sb, 1, "core_platform_services", c2336c0.m14011c0());
                }
                if (c2336c0.m13980H0()) {
                    m201866U(sb, 1, "consent_diagnostics", c2336c0.m14006a0());
                }
                if (c2336c0.m14005Z0()) {
                    m201866U(sb, 1, "target_os_version", Long.valueOf(c2336c0.m14037q2()));
                }
                if (spy0.m187491a() && mo15139a().m98452z(c2336c0.m13975A2(), whs0.f189209I0)) {
                    m201866U(sb, 1, "ad_services_version", Integer.valueOf(c2336c0.m14019h()));
                    if (c2336c0.m14047w0() && (c2373vM14048w2 = c2336c0.m14048w2()) != null) {
                        m201863Q(sb, 2);
                        sb.append("attribution_eligibility_status {\n");
                        m201866U(sb, 2, "eligible", Boolean.valueOf(c2373vM14048w2.m14452U()));
                        m201866U(sb, 2, "no_access_adservices_attribution_permission", Boolean.valueOf(c2373vM14048w2.m14454X()));
                        m201866U(sb, 2, "pre_r", Boolean.valueOf(c2373vM14048w2.m14455Y()));
                        m201866U(sb, 2, "r_extensions_too_old", Boolean.valueOf(c2373vM14048w2.m14456Z()));
                        m201866U(sb, 2, "adservices_extension_too_old", Boolean.valueOf(c2373vM14048w2.m14451N()));
                        m201866U(sb, 2, "ad_storage_not_allowed", Boolean.valueOf(c2373vM14048w2.m14450L()));
                        m201866U(sb, 2, "measurement_manager_disabled", Boolean.valueOf(c2373vM14048w2.m14453W()));
                        m201863Q(sb, 2);
                        sb.append("}\n");
                    }
                }
                if (nny0.m164006a() && mo15139a().m98440n(whs0.f189235V0) && c2336c0.m14043u0()) {
                    C2369t c2369tM14046v2 = c2336c0.m14046v2();
                    m201863Q(sb, 2);
                    sb.append("ad_campaign_info {\n");
                    if (c2369tM14046v2.m14363k0()) {
                        m201866U(sb, 2, "deep_link_gclid", c2369tM14046v2.m14357e0());
                    }
                    if (c2369tM14046v2.m14362j0()) {
                        m201866U(sb, 2, "deep_link_gbraid", c2369tM14046v2.m14356d0());
                    }
                    if (c2369tM14046v2.m14361i0()) {
                        m201866U(sb, 2, "deep_link_gad_source", c2369tM14046v2.m14355a0());
                    }
                    if (c2369tM14046v2.m14364l0()) {
                        m201866U(sb, 2, "deep_link_session_millis", Long.valueOf(c2369tM14046v2.m14353B()));
                    }
                    if (c2369tM14046v2.m14368p0()) {
                        m201866U(sb, 2, "market_referrer_gclid", c2369tM14046v2.m14360h0());
                    }
                    if (c2369tM14046v2.m14367o0()) {
                        m201866U(sb, 2, "market_referrer_gbraid", c2369tM14046v2.m14359g0());
                    }
                    if (c2369tM14046v2.m14366n0()) {
                        m201866U(sb, 2, "market_referrer_gad_source", c2369tM14046v2.m14358f0());
                    }
                    if (c2369tM14046v2.m14365m0()) {
                        m201866U(sb, 2, "market_referrer_click_millis", Long.valueOf(c2369tM14046v2.m14354G()));
                    }
                    m201863Q(sb, 2);
                    sb.append("}\n");
                }
                List<C2342f0> listM14035p0 = c2336c0.m14035p0();
                if (listM14035p0 != null) {
                    for (C2342f0 c2342f0 : listM14035p0) {
                        if (c2342f0 != null) {
                            m201863Q(sb, 2);
                            sb.append("user_property {\n");
                            m201866U(sb, 2, "set_timestamp_millis", c2342f0.m14225c0() ? Long.valueOf(c2342f0.m14219U()) : null);
                            m201866U(sb, 2, AuthenticationTokenClaims.JSON_KEY_NAME, mo15141c().m208452g(c2342f0.m14220X()));
                            m201866U(sb, 2, "string_value", c2342f0.m14221Y());
                            m201866U(sb, 2, "int_value", c2342f0.m14224b0() ? Long.valueOf(c2342f0.m14218N()) : null);
                            m201866U(sb, 2, "double_value", c2342f0.m14222Z() ? Double.valueOf(c2342f0.m14216B()) : null);
                            m201863Q(sb, 2);
                            sb.append("}\n");
                        }
                    }
                }
                List<C2375w> listM14032n0 = c2336c0.m14032n0();
                c2336c0.m13975A2();
                if (listM14032n0 != null) {
                    for (C2375w c2375w : listM14032n0) {
                        if (c2375w != null) {
                            m201863Q(sb, 2);
                            sb.append("audience_membership {\n");
                            if (c2375w.m14477N()) {
                                m201866U(sb, 2, "audience_id", Integer.valueOf(c2375w.m14480h()));
                            }
                            if (c2375w.m14478T()) {
                                m201866U(sb, 2, "new_audience", Boolean.valueOf(c2375w.m14476M()));
                            }
                            m201865T(sb, 2, "current_data", c2375w.m14474K());
                            if (c2375w.m14479U()) {
                                m201865T(sb, 2, "previous_data", c2375w.m14475L());
                            }
                            m201863Q(sb, 2);
                            sb.append("}\n");
                        }
                    }
                }
                List<C2379y> listM14033o0 = c2336c0.m14033o0();
                if (listM14033o0 != null) {
                    for (C2379y c2379y : listM14033o0) {
                        if (c2379y != null) {
                            m201863Q(sb, 2);
                            sb.append("event {\n");
                            m201866U(sb, 2, AuthenticationTokenClaims.JSON_KEY_NAME, mo15141c().m208449c(c2379y.m14554X()));
                            if (c2379y.m14558b0()) {
                                m201866U(sb, 2, "timestamp_millis", Long.valueOf(c2379y.m14553U()));
                            }
                            if (c2379y.m14557a0()) {
                                m201866U(sb, 2, "previous_timestamp_millis", Long.valueOf(c2379y.m14552T()));
                            }
                            if (c2379y.m14556Z()) {
                                m201866U(sb, 2, "count", Integer.valueOf(c2379y.m14560h()));
                            }
                            if (c2379y.m14551M() != 0) {
                                m201885V(sb, 2, c2379y.m14555Y());
                            }
                            m201863Q(sb, 2);
                            sb.append("}\n");
                        }
                    }
                }
                m201863Q(sb, 1);
                sb.append("}\n");
            }
        }
        sb.append("} // End-of-batch\n");
        return sb.toString();
    }

    /* JADX INFO: renamed from: I */
    public final List<Long> m201880I(List<Long> list, List<Integer> list2) {
        int i;
        ArrayList arrayList = new ArrayList(list);
        for (Integer num : list2) {
            if (num.intValue() < 0) {
                zzj().m114563F().m153301b("Ignoring negative bit index to be cleared", num);
            } else {
                int iIntValue = num.intValue() / 64;
                if (iIntValue >= arrayList.size()) {
                    zzj().m114563F().m153302c("Ignoring bit index greater than bitSet size", num, Integer.valueOf(arrayList.size()));
                } else {
                    arrayList.set(iIntValue, Long.valueOf(((Long) arrayList.get(iIntValue)).longValue() & (~(1 << (num.intValue() % 64)))));
                }
            }
        }
        int size = arrayList.size();
        int size2 = arrayList.size() - 1;
        while (true) {
            int i2 = size2;
            i = size;
            size = i2;
            if (size < 0 || ((Long) arrayList.get(size)).longValue() != 0) {
                break;
            }
            size2 = size - 1;
        }
        return arrayList.subList(0, i);
    }

    /* JADX INFO: renamed from: J */
    public final Map<String, Object> m201881J(Bundle bundle, boolean z) {
        HashMap map = new HashMap();
        for (String str : bundle.keySet()) {
            Object obj = bundle.get(str);
            boolean z2 = obj instanceof Parcelable[];
            if (z2 || (obj instanceof ArrayList) || (obj instanceof Bundle)) {
                if (z) {
                    ArrayList arrayList = new ArrayList();
                    if (z2) {
                        for (Parcelable parcelable : (Parcelable[]) obj) {
                            if (parcelable instanceof Bundle) {
                                arrayList.add(m201881J((Bundle) parcelable, false));
                            }
                        }
                    } else if (obj instanceof ArrayList) {
                        ArrayList arrayList2 = (ArrayList) obj;
                        int size = arrayList2.size();
                        int i = 0;
                        while (i < size) {
                            Object obj2 = arrayList2.get(i);
                            i++;
                            if (obj2 instanceof Bundle) {
                                arrayList.add(m201881J((Bundle) obj2, false));
                            }
                        }
                    } else if (obj instanceof Bundle) {
                        arrayList.add(m201881J((Bundle) obj, false));
                    }
                    map.put(str, arrayList);
                }
            } else if (obj != null) {
                map.put(str, obj);
            }
        }
        return map;
    }

    /* JADX INFO: renamed from: O */
    public final void m201882O(C2331a0.a aVar, Object obj) {
        Preconditions.checkNotNull(obj);
        aVar.m13854G().m13852D().m13850B().m13853E();
        if (obj instanceof String) {
            aVar.m13851C((String) obj);
            return;
        }
        if (obj instanceof Long) {
            aVar.m13859x(((Long) obj).longValue());
            return;
        }
        if (obj instanceof Double) {
            aVar.m13858w(((Double) obj).doubleValue());
            return;
        }
        if (!(obj instanceof Bundle[])) {
            zzj().m114558A().m153301b("Ignoring invalid (type) event param value", obj);
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (Bundle bundle : (Bundle[]) obj) {
            if (bundle != null) {
                C2331a0.a aVarM13833X = C2331a0.m13833X();
                for (String str : bundle.keySet()) {
                    C2331a0.a aVarM13849A = C2331a0.m13833X().m13849A(str);
                    Object obj2 = bundle.get(str);
                    if (obj2 instanceof Long) {
                        aVarM13849A.m13859x(((Long) obj2).longValue());
                    } else if (obj2 instanceof String) {
                        aVarM13849A.m13851C((String) obj2);
                    } else if (obj2 instanceof Double) {
                        aVarM13849A.m13858w(((Double) obj2).doubleValue());
                    }
                    aVarM13833X.m13860y(aVarM13849A);
                }
                if (aVarM13833X.m13857v() > 0) {
                    arrayList.add((C2331a0) ((AbstractC2372u0) aVarM13833X.mo14423H()));
                }
            }
        }
        aVar.m13861z(arrayList);
    }

    /* JADX INFO: renamed from: P */
    public final void m201883P(C2342f0.a aVar, Object obj) {
        Preconditions.checkNotNull(obj);
        aVar.m14229C().m14234z().m14230v();
        if (obj instanceof String) {
            aVar.m14228B((String) obj);
            return;
        }
        if (obj instanceof Long) {
            aVar.m14232x(((Long) obj).longValue());
        } else if (obj instanceof Double) {
            aVar.m14231w(((Double) obj).doubleValue());
        } else {
            zzj().m114558A().m153301b("Ignoring invalid (type) user attribute value", obj);
        }
    }

    /* JADX INFO: renamed from: R */
    public final void m201884R(StringBuilder sb, int i, C2337d c2337d) {
        if (c2337d == null) {
            return;
        }
        m201863Q(sb, i);
        sb.append("filter {\n");
        if (c2337d.m14151L()) {
            m201866U(sb, i, "complement", Boolean.valueOf(c2337d.m14150K()));
        }
        if (c2337d.m14153N()) {
            m201866U(sb, i, "param_name", mo15141c().m208451f(c2337d.m14149I()));
        }
        if (c2337d.m14154T()) {
            int i2 = i + 1;
            zzfo$zzf zzfo_zzfM14148G = c2337d.m14148G();
            if (zzfo_zzfM14148G != null) {
                m201863Q(sb, i2);
                sb.append("string_filter");
                sb.append(" {\n");
                if (zzfo_zzfM14148G.m14628M()) {
                    m201866U(sb, i2, "match_type", zzfo_zzfM14148G.m14622B().name());
                }
                if (zzfo_zzfM14148G.m14627L()) {
                    m201866U(sb, i2, "expression", zzfo_zzfM14148G.m14623E());
                }
                if (zzfo_zzfM14148G.m14626K()) {
                    m201866U(sb, i2, "case_sensitive", Boolean.valueOf(zzfo_zzfM14148G.m14625I()));
                }
                if (zzfo_zzfM14148G.m14629h() > 0) {
                    m201863Q(sb, i + 2);
                    sb.append("expression_list {\n");
                    for (String str : zzfo_zzfM14148G.m14624G()) {
                        m201863Q(sb, i + 3);
                        sb.append(str);
                        sb.append(SignParameters.NEW_LINE);
                    }
                    sb.append("}\n");
                }
                m201863Q(sb, i2);
                sb.append("}\n");
            }
        }
        if (c2337d.m14152M()) {
            m201864S(sb, i + 1, "number_filter", c2337d.m14147E());
        }
        m201863Q(sb, i);
        sb.append("}\n");
    }

    /* JADX INFO: renamed from: V */
    public final void m201885V(StringBuilder sb, int i, List<C2331a0> list) {
        if (list == null) {
            return;
        }
        int i2 = i + 1;
        for (C2331a0 c2331a0 : list) {
            if (c2331a0 != null) {
                m201863Q(sb, i2);
                sb.append("param {\n");
                m201866U(sb, i2, AuthenticationTokenClaims.JSON_KEY_NAME, c2331a0.m13845f0() ? mo15141c().m208451f(c2331a0.m13839Z()) : null);
                m201866U(sb, i2, "string_value", c2331a0.m13846g0() ? c2331a0.m13840a0() : null);
                m201866U(sb, i2, "int_value", c2331a0.m13844e0() ? Long.valueOf(c2331a0.m13838V()) : null);
                m201866U(sb, i2, "double_value", c2331a0.m13842c0() ? Double.valueOf(c2331a0.m13835B()) : null);
                if (c2331a0.m13837T() > 0) {
                    m201885V(sb, i2, c2331a0.m13841b0());
                }
                m201863Q(sb, i2);
                sb.append("}\n");
            }
        }
    }

    /* JADX INFO: renamed from: W */
    public final boolean m201886W(long j, long j2) {
        return j == 0 || j2 <= 0 || Math.abs(zzb().currentTimeMillis() - j) > j2;
    }

    @Override // p153l.yyx0
    @Pure
    /* JADX INFO: renamed from: a */
    public final /* bridge */ /* synthetic */ ajr0 mo15139a() {
        return super.mo15139a();
    }

    @Override // p153l.yyx0
    @Pure
    /* JADX INFO: renamed from: b */
    public final /* bridge */ /* synthetic */ o7s0 mo15140b() {
        return super.mo15140b();
    }

    /* JADX INFO: renamed from: b0 */
    public final byte[] m201887b0(byte[] bArr) throws IOException {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
            gZIPOutputStream.write(bArr);
            gZIPOutputStream.close();
            byteArrayOutputStream.close();
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e) {
            zzj().m114558A().m153301b("Failed to gzip content", e);
            throw e;
        }
    }

    @Override // p153l.yyx0
    @Pure
    /* JADX INFO: renamed from: c */
    public final /* bridge */ /* synthetic */ wxw0 mo15141c() {
        return super.mo15141c();
    }

    @Override // p153l.yyx0
    @Pure
    /* JADX INFO: renamed from: d */
    public final /* bridge */ /* synthetic */ ajx0 mo15142d() {
        return super.mo15142d();
    }

    /* JADX INFO: renamed from: d0 */
    public final byte[] m201888d0(byte[] bArr) throws IOException {
        try {
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
            GZIPInputStream gZIPInputStream = new GZIPInputStream(byteArrayInputStream);
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            byte[] bArr2 = new byte[1024];
            while (true) {
                int i = gZIPInputStream.read(bArr2);
                if (i <= 0) {
                    gZIPInputStream.close();
                    byteArrayInputStream.close();
                    return byteArrayOutputStream.toByteArray();
                }
                byteArrayOutputStream.write(bArr2, 0, i);
            }
        } catch (IOException e) {
            zzj().m114558A().m153301b("Failed to ungzip content", e);
            throw e;
        }
    }

    @Override // p153l.yyx0
    @Pure
    /* JADX INFO: renamed from: e */
    public final /* bridge */ /* synthetic */ hny0 mo15143e() {
        return super.mo15143e();
    }

    /* JADX INFO: renamed from: e0 */
    public final List<Integer> m201889e0() {
        Map<String, String> mapM206440b = whs0.m206440b(this.f158066b.zza());
        if (mapM206440b == null || mapM206440b.isEmpty()) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        int iIntValue = whs0.f189228S.m220931a(null).intValue();
        for (Map.Entry<String, String> entry : mapM206440b.entrySet()) {
            if (entry.getKey().startsWith("measurement.id.")) {
                try {
                    int i = Integer.parseInt(entry.getValue());
                    if (i != 0) {
                        arrayList.add(Integer.valueOf(i));
                        if (arrayList.size() >= iIntValue) {
                            zzj().m114563F().m153301b("Too many experiment IDs. Number of IDs", Integer.valueOf(arrayList.size()));
                            break;
                        }
                        continue;
                    } else {
                        continue;
                    }
                } catch (NumberFormatException e) {
                    zzj().m114563F().m153301b("Experiment ID NumberFormatException", e);
                }
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return arrayList;
    }

    @Override // p153l.yyx0
    /* JADX INFO: renamed from: f */
    public final /* bridge */ /* synthetic */ void mo15144f() {
        super.mo15144f();
    }

    @Override // p153l.yyx0
    /* JADX INFO: renamed from: g */
    public final /* bridge */ /* synthetic */ void mo15145g() {
        super.mo15145g();
    }

    @Override // p153l.yyx0
    /* JADX INFO: renamed from: h */
    public final /* bridge */ /* synthetic */ void mo15146h() {
        super.mo15146h();
    }

    @Override // p153l.qjy0
    /* JADX INFO: renamed from: i */
    public final /* bridge */ /* synthetic */ vmy0 mo15192i() {
        return super.mo15192i();
    }

    @Override // p153l.qjy0
    /* JADX INFO: renamed from: j */
    public final /* bridge */ /* synthetic */ pwy0 mo15193j() {
        return super.mo15193j();
    }

    @Override // p153l.qjy0
    /* JADX INFO: renamed from: k */
    public final /* bridge */ /* synthetic */ opr0 mo15194k() {
        return super.mo15194k();
    }

    @Override // p153l.qjy0
    /* JADX INFO: renamed from: l */
    public final /* bridge */ /* synthetic */ C2479e mo15195l() {
        return super.mo15195l();
    }

    @Override // p153l.qjy0
    /* JADX INFO: renamed from: m */
    public final /* bridge */ /* synthetic */ kgy0 mo15196m() {
        return super.mo15196m();
    }

    @Override // p153l.qjy0
    /* JADX INFO: renamed from: n */
    public final /* bridge */ /* synthetic */ vjy0 mo15197n() {
        return super.mo15197n();
    }

    @Override // p153l.njy0
    /* JADX INFO: renamed from: r */
    public final boolean mo15198r() {
        return false;
    }

    /* JADX INFO: renamed from: t */
    public final long m201890t(String str) {
        if (TextUtils.isEmpty(str)) {
            return 0L;
        }
        return m201891u(str.getBytes(Charset.forName("UTF-8")));
    }

    @WorkerThread
    /* JADX INFO: renamed from: u */
    public final long m201891u(byte[] bArr) {
        Preconditions.checkNotNull(bArr);
        mo15143e().mo15146h();
        MessageDigest messageDigestM136299P0 = hny0.m136299P0();
        if (messageDigestM136299P0 != null) {
            return hny0.m136318v(messageDigestM136299P0.digest(bArr));
        }
        zzj().m114558A().m153300a("Failed to get MD5");
        return 0L;
    }

    /* JADX INFO: renamed from: w */
    public final Bundle m201892w(Map<String, Object> map, boolean z) {
        Bundle bundle = new Bundle();
        for (String str : map.keySet()) {
            Object obj = map.get(str);
            if (obj == null) {
                bundle.putString(str, null);
            } else if (obj instanceof Long) {
                bundle.putLong(str, ((Long) obj).longValue());
            } else if (obj instanceof Double) {
                bundle.putDouble(str, ((Double) obj).doubleValue());
            } else if (!(obj instanceof ArrayList)) {
                bundle.putString(str, obj.toString());
            } else if (z) {
                ArrayList arrayList = (ArrayList) obj;
                ArrayList arrayList2 = new ArrayList();
                int size = arrayList.size();
                int i = 0;
                while (i < size) {
                    Object obj2 = arrayList.get(i);
                    i++;
                    arrayList2.add(m201892w((Map) obj2, false));
                }
                bundle.putParcelableArray(str, (Parcelable[]) arrayList2.toArray(new Parcelable[0]));
            }
        }
        return bundle;
    }

    /* JADX INFO: renamed from: x */
    public final <T extends Parcelable> T m201893x(byte[] bArr, Parcelable.Creator<T> creator) {
        if (bArr == null) {
            return null;
        }
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.unmarshall(bArr, 0, bArr.length);
            parcelObtain.setDataPosition(0);
            return creator.createFromParcel(parcelObtain);
        } catch (SafeParcelReader.ParseException unused) {
            zzj().m114558A().m153300a("Failed to load parcelable from buffer");
            return null;
        } finally {
            parcelObtain.recycle();
        }
    }

    /* JADX INFO: renamed from: y */
    public final C2379y m201894y(wcs0 wcs0Var) {
        C2379y.a aVarM14577z = C2379y.m14548V().m14577z(wcs0Var.f188499e);
        for (String str : wcs0Var.f188500f) {
            C2331a0.a aVarM13849A = C2331a0.m13833X().m13849A(str);
            Object objM15380I = wcs0Var.f188500f.m15380I(str);
            Preconditions.checkNotNull(objM15380I);
            m201882O(aVarM13849A, objM15380I);
            aVarM14577z.m14561A(aVarM13849A);
        }
        if (mo15139a().m98440n(whs0.f189273j1) && !TextUtils.isEmpty(wcs0Var.f188497c) && wcs0Var.f188500f.m15380I("_o") == null) {
            aVarM14577z.m14562B((C2331a0) ((AbstractC2372u0) C2331a0.m13833X().m13849A("_o").m13851C(wcs0Var.f188497c).mo14423H()));
        }
        return (C2379y) ((AbstractC2372u0) aVarM14577z.mo14423H());
    }

    @Override // p153l.yyx0, p153l.hzx0
    @Pure
    public final /* bridge */ /* synthetic */ Context zza() {
        return super.zza();
    }

    @Override // p153l.yyx0, p153l.hzx0
    @Pure
    public final /* bridge */ /* synthetic */ Clock zzb() {
        return super.zzb();
    }

    @Override // p153l.yyx0, p153l.hzx0
    @Pure
    public final /* bridge */ /* synthetic */ zbr0 zzd() {
        return super.zzd();
    }

    @Override // p153l.yyx0, p153l.hzx0
    @Pure
    public final /* bridge */ /* synthetic */ d6x0 zzj() {
        return super.zzj();
    }

    @Override // p153l.yyx0, p153l.hzx0
    @Pure
    public final /* bridge */ /* synthetic */ qsx0 zzl() {
        return super.zzl();
    }
}
