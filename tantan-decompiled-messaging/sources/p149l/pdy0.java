package p149l;

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
import com.google.android.gms.internal.measurement.AbstractC2349u0;
import com.google.android.gms.internal.measurement.C2308a0;
import com.google.android.gms.internal.measurement.C2312c;
import com.google.android.gms.internal.measurement.C2313c0;
import com.google.android.gms.internal.measurement.C2314d;
import com.google.android.gms.internal.measurement.C2315d0;
import com.google.android.gms.internal.measurement.C2316e;
import com.google.android.gms.internal.measurement.C2317e0;
import com.google.android.gms.internal.measurement.C2319f0;
import com.google.android.gms.internal.measurement.C2345s0;
import com.google.android.gms.internal.measurement.C2346t;
import com.google.android.gms.internal.measurement.C2350v;
import com.google.android.gms.internal.measurement.C2352w;
import com.google.android.gms.internal.measurement.C2354x;
import com.google.android.gms.internal.measurement.C2356y;
import com.google.android.gms.internal.measurement.zzfo$zzd;
import com.google.android.gms.internal.measurement.zzfo$zzf;
import com.google.android.gms.internal.measurement.zzfy$zzj;
import com.google.android.gms.internal.measurement.zzkb;
import com.google.android.gms.measurement.internal.C2456e;
import com.google.android.gms.measurement.internal.C2461j;
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
public final class pdy0 extends hay0 {
    public pdy0(C2461j c2461j) {
        super(c2461j);
    }

    /* JADX INFO: renamed from: C */
    public static Object m168451C(C2356y c2356y, String str, Object obj) {
        Object objM168464Z = m168464Z(c2356y, str);
        return objM168464Z == null ? obj : objM168464Z;
    }

    /* JADX INFO: renamed from: G */
    public static String m168452G(boolean z, boolean z2, boolean z3) {
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
    public static List<Long> m168453H(BitSet bitSet) {
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
    public static <BuilderT extends c0y0> BuilderT m168454K(BuilderT buildert, byte[] bArr) throws zzkb {
        C2345s0 c2345s0M14280a = C2345s0.m14280a();
        return c2345s0M14280a != null ? (BuilderT) buildert.mo104781J(bArr, c2345s0M14280a) : (BuilderT) buildert.zza(bArr);
    }

    /* JADX INFO: renamed from: L */
    public static void m168455L(Uri.Builder builder, String str, String str2, Set<String> set) {
        if (set.contains(str) || TextUtils.isEmpty(str2)) {
            return;
        }
        builder.appendQueryParameter(str, str2);
    }

    /* JADX INFO: renamed from: M */
    public static void m168456M(Uri.Builder builder, String[] strArr, Bundle bundle, Set<String> set) {
        for (String str : strArr) {
            String[] strArrSplit = str.split(Constants.SEPARATOR_COMMA);
            String str2 = strArrSplit[0];
            String str3 = strArrSplit[strArrSplit.length - 1];
            String string = bundle.getString(str2);
            if (string != null) {
                m168455L(builder, str3, string, set);
            }
        }
    }

    /* JADX INFO: renamed from: N */
    public static void m168457N(C2356y.a aVar, String str, Object obj) {
        List<C2308a0> listM14517T = aVar.m14517T();
        int i = 0;
        while (true) {
            if (i >= listM14517T.size()) {
                i = -1;
                break;
            } else if (str.equals(listM14517T.get(i).m13785Z())) {
                break;
            } else {
                i++;
            }
        }
        C2308a0.a aVarM13795A = C2308a0.m13779X().m13795A(str);
        if (obj instanceof Long) {
            aVarM13795A.m13805x(((Long) obj).longValue());
        } else if (obj instanceof String) {
            aVarM13795A.m13797C((String) obj);
        } else if (obj instanceof Double) {
            aVarM13795A.m13804w(((Double) obj).doubleValue());
        }
        if (i >= 0) {
            aVar.m14521x(i, aVarM13795A);
        } else {
            aVar.m14507A(aVarM13795A);
        }
    }

    /* JADX INFO: renamed from: Q */
    public static void m168458Q(StringBuilder sb, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            sb.append("  ");
        }
    }

    /* JADX INFO: renamed from: S */
    public static void m168459S(StringBuilder sb, int i, String str, zzfo$zzd zzfo_zzd) {
        if (zzfo_zzd == null) {
            return;
        }
        m168458Q(sb, i);
        sb.append(str);
        sb.append(" {\n");
        if (zzfo_zzd.m14561L()) {
            m168461U(sb, i, "comparison_type", zzfo_zzd.m14556B().name());
        }
        if (zzfo_zzd.m14563N()) {
            m168461U(sb, i, "match_as_float", Boolean.valueOf(zzfo_zzd.m14560K()));
        }
        if (zzfo_zzd.m14562M()) {
            m168461U(sb, i, "comparison_value", zzfo_zzd.m14557E());
        }
        if (zzfo_zzd.m14565U()) {
            m168461U(sb, i, "min_comparison_value", zzfo_zzd.m14559I());
        }
        if (zzfo_zzd.m14564T()) {
            m168461U(sb, i, "max_comparison_value", zzfo_zzd.m14558G());
        }
        m168458Q(sb, i);
        sb.append("}\n");
    }

    /* JADX INFO: renamed from: T */
    public static void m168460T(StringBuilder sb, int i, String str, C2315d0 c2315d0) {
        if (c2315d0 == null) {
            return;
        }
        m168458Q(sb, 3);
        sb.append(str);
        sb.append(" {\n");
        if (c2315d0.m14113D() != 0) {
            m168458Q(sb, 4);
            sb.append("results: ");
            int i2 = 0;
            for (Long l2 : c2315d0.m14117Y()) {
                int i3 = i2 + 1;
                if (i2 != 0) {
                    sb.append(", ");
                }
                sb.append(l2);
                i2 = i3;
            }
            sb.append('\n');
        }
        if (c2315d0.m14115M() != 0) {
            m168458Q(sb, 4);
            sb.append("status: ");
            int i4 = 0;
            for (Long l3 : c2315d0.m14119a0()) {
                int i5 = i4 + 1;
                if (i4 != 0) {
                    sb.append(", ");
                }
                sb.append(l3);
                i4 = i5;
            }
            sb.append('\n');
        }
        if (c2315d0.m14120h() != 0) {
            m168458Q(sb, 4);
            sb.append("dynamic_filter_timestamps: {");
            int i6 = 0;
            for (C2354x c2354x : c2315d0.m14116X()) {
                int i7 = i6 + 1;
                if (i6 != 0) {
                    sb.append(", ");
                }
                sb.append(c2354x.m14481K() ? Integer.valueOf(c2354x.m14482h()) : null);
                sb.append(":");
                sb.append(c2354x.m14480I() ? Long.valueOf(c2354x.m14479D()) : null);
                i6 = i7;
            }
            sb.append("}\n");
        }
        if (c2315d0.m14114I() != 0) {
            m168458Q(sb, 4);
            sb.append("sequence_filter_timestamps: {");
            int i8 = 0;
            for (C2317e0 c2317e0 : c2315d0.m14118Z()) {
                int i9 = i8 + 1;
                if (i8 != 0) {
                    sb.append(", ");
                }
                sb.append(c2317e0.m14148L() ? Integer.valueOf(c2317e0.m14146E()) : null);
                sb.append(": [");
                Iterator<Long> it = c2317e0.m14147K().iterator();
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
        m168458Q(sb, 3);
        sb.append("}\n");
    }

    /* JADX INFO: renamed from: U */
    public static void m168461U(StringBuilder sb, int i, String str, Object obj) {
        if (obj == null) {
            return;
        }
        m168458Q(sb, i + 1);
        sb.append(str);
        sb.append(": ");
        sb.append(obj);
        sb.append('\n');
    }

    @WorkerThread
    /* JADX INFO: renamed from: X */
    public static boolean m168462X(zzbf zzbfVar, zzo zzoVar) {
        Preconditions.checkNotNull(zzbfVar);
        Preconditions.checkNotNull(zzoVar);
        return (TextUtils.isEmpty(zzoVar.zzb) && TextUtils.isEmpty(zzoVar.zzp)) ? false : true;
    }

    /* JADX INFO: renamed from: Y */
    public static boolean m168463Y(List<Long> list, int i) {
        if (i < (list.size() << 6)) {
            return ((1 << (i % 64)) & list.get(i / 64).longValue()) != 0;
        }
        return false;
    }

    /* JADX INFO: renamed from: Z */
    public static Object m168464Z(C2356y c2356y, String str) {
        C2308a0 c2308a0M168469z = m168469z(c2356y, str);
        if (c2308a0M168469z == null) {
            return null;
        }
        if (c2308a0M168469z.m13792g0()) {
            return c2308a0M168469z.m13786a0();
        }
        if (c2308a0M168469z.m13790e0()) {
            return Long.valueOf(c2308a0M168469z.m13784V());
        }
        if (c2308a0M168469z.m13788c0()) {
            return Double.valueOf(c2308a0M168469z.m13781B());
        }
        if (c2308a0M168469z.m13783T() > 0) {
            return m168466c0(c2308a0M168469z.m13787b0());
        }
        return null;
    }

    /* JADX INFO: renamed from: a0 */
    public static boolean m168465a0(String str) {
        return str != null && str.matches("([+-])?([0-9]+\\.?[0-9]*|[0-9]*\\.?[0-9]+)") && str.length() <= 310;
    }

    /* JADX INFO: renamed from: c0 */
    public static Bundle[] m168466c0(List<C2308a0> list) {
        ArrayList arrayList = new ArrayList();
        for (C2308a0 c2308a0 : list) {
            if (c2308a0 != null) {
                Bundle bundle = new Bundle();
                for (C2308a0 c2308a1 : c2308a0.m13787b0()) {
                    if (c2308a1.m13792g0()) {
                        bundle.putString(c2308a1.m13785Z(), c2308a1.m13786a0());
                    } else if (c2308a1.m13790e0()) {
                        bundle.putLong(c2308a1.m13785Z(), c2308a1.m13784V());
                    } else if (c2308a1.m13788c0()) {
                        bundle.putDouble(c2308a1.m13785Z(), c2308a1.m13781B());
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
    public static int m168467s(C2313c0.a aVar, String str) {
        if (aVar == null) {
            return -1;
        }
        for (int i = 0; i < aVar.m14062k0(); i++) {
            if (str.equals(aVar.m14027S0(i).m14166X())) {
                return i;
            }
        }
        return -1;
    }

    /* JADX INFO: renamed from: v */
    public static Bundle m168468v(List<C2308a0> list) {
        Bundle bundle = new Bundle();
        for (C2308a0 c2308a0 : list) {
            String strM13785Z = c2308a0.m13785Z();
            if (c2308a0.m13788c0()) {
                bundle.putDouble(strM13785Z, c2308a0.m13781B());
            } else if (c2308a0.m13789d0()) {
                bundle.putFloat(strM13785Z, c2308a0.m13782L());
            } else if (c2308a0.m13792g0()) {
                bundle.putString(strM13785Z, c2308a0.m13786a0());
            } else if (c2308a0.m13790e0()) {
                bundle.putLong(strM13785Z, c2308a0.m13784V());
            }
        }
        return bundle;
    }

    /* JADX INFO: renamed from: z */
    public static C2308a0 m168469z(C2356y c2356y, String str) {
        for (C2308a0 c2308a0 : c2356y.m14501Y()) {
            if (c2308a0.m13785Z().equals(str)) {
                return c2308a0;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: A */
    public final zzbf m168470A(y5r0 y5r0Var) {
        Object obj;
        Bundle bundleM168487w = m168487w(y5r0Var.m213016g(), true);
        String string = (!bundleM168487w.containsKey("_o") || (obj = bundleM168487w.get("_o")) == null) ? "app" : obj.toString();
        String strM98576b = arx0.m98576b(y5r0Var.m213014e());
        if (strM98576b == null) {
            strM98576b = y5r0Var.m213014e();
        }
        return new zzbf(strM98576b, new zzbe(bundleM168487w), string, y5r0Var.m213011a());
    }

    @TargetApi(30)
    /* JADX INFO: renamed from: B */
    public final zzno m168471B(String str, C2313c0.a aVar, C2356y.a aVar2, String str2) {
        int iIndexOf;
        if (!mgy0.m154586a() || !mo15085a().m192660z(str, q8s0.f153233I0)) {
            return null;
        }
        long jCurrentTimeMillis = zzb().currentTimeMillis();
        String[] strArrSplit = mo15085a().m192658x(str, q8s0.f153290h0).split(Constants.SEPARATOR_COMMA);
        HashSet hashSet = new HashSet(strArrSplit.length);
        for (String str3 : strArrSplit) {
            Objects.requireNonNull(str3);
            if (!hashSet.add(str3)) {
                qhg0.m174539a("duplicate element: ", str3);
                return null;
            }
        }
        Set setUnmodifiableSet = Collections.unmodifiableSet(hashSet);
        pay0 pay0VarMo15143n = mo15143n();
        String strM15122L = pay0VarMo15143n.mo15141l().m15122L(str);
        Uri.Builder builder = new Uri.Builder();
        builder.scheme(pay0VarMo15143n.mo15085a().m192658x(str, q8s0.f153269a0));
        if (TextUtils.isEmpty(strM15122L)) {
            builder.authority(pay0VarMo15143n.mo15085a().m192658x(str, q8s0.f153272b0));
        } else {
            builder.authority(strM15122L + "." + pay0VarMo15143n.mo15085a().m192658x(str, q8s0.f153272b0));
        }
        builder.path(pay0VarMo15143n.mo15085a().m192658x(str, q8s0.f153275c0));
        m168455L(builder, "gmp_app_id", aVar.m14071o1(), setUnmodifiableSet);
        m168455L(builder, "gmp_version", "106000", setUnmodifiableSet);
        String strM14065l1 = aVar.m14065l1();
        u9r0 u9r0VarMo15085a = mo15085a();
        tgw0<Boolean> tgw0Var = q8s0.f153239L0;
        if (u9r0VarMo15085a.m192660z(str, tgw0Var) && mo15141l().m15131U(str)) {
            strM14065l1 = "";
        }
        m168455L(builder, "app_instance_id", strM14065l1, setUnmodifiableSet);
        m168455L(builder, "rdid", aVar.m14075q1(), setUnmodifiableSet);
        m168455L(builder, "bundle_id", aVar.m14063k1(), setUnmodifiableSet);
        String strM14516N = aVar2.m14516N();
        String strM98575a = arx0.m98575a(strM14516N);
        if (!TextUtils.isEmpty(strM98575a)) {
            strM14516N = strM98575a;
        }
        m168455L(builder, "app_event_name", strM14516N, setUnmodifiableSet);
        m168455L(builder, "app_version", String.valueOf(aVar.m14038Y()), setUnmodifiableSet);
        String strM14073p1 = aVar.m14073p1();
        if (mo15085a().m192660z(str, tgw0Var) && mo15141l().m15135Y(str) && !TextUtils.isEmpty(strM14073p1) && (iIndexOf = strM14073p1.indexOf(".")) != -1) {
            strM14073p1 = strM14073p1.substring(0, iIndexOf);
        }
        m168455L(builder, "os_version", strM14073p1, setUnmodifiableSet);
        m168455L(builder, "timestamp", String.valueOf(aVar2.m14514L()), setUnmodifiableSet);
        if (aVar.m14034W()) {
            m168455L(builder, "lat", "1", setUnmodifiableSet);
        }
        m168455L(builder, "privacy_sandbox_version", String.valueOf(aVar.m14080v()), setUnmodifiableSet);
        m168455L(builder, "trigger_uri_source", "1", setUnmodifiableSet);
        m168455L(builder, "trigger_uri_timestamp", String.valueOf(jCurrentTimeMillis), setUnmodifiableSet);
        m168455L(builder, "request_uuid", str2, setUnmodifiableSet);
        List<C2308a0> listM14517T = aVar2.m14517T();
        Bundle bundle = new Bundle();
        for (C2308a0 c2308a0 : listM14517T) {
            String strM13785Z = c2308a0.m13785Z();
            if (c2308a0.m13788c0()) {
                bundle.putString(strM13785Z, String.valueOf(c2308a0.m13781B()));
            } else if (c2308a0.m13789d0()) {
                bundle.putString(strM13785Z, String.valueOf(c2308a0.m13782L()));
            } else if (c2308a0.m13792g0()) {
                bundle.putString(strM13785Z, c2308a0.m13786a0());
            } else if (c2308a0.m13790e0()) {
                bundle.putString(strM13785Z, String.valueOf(c2308a0.m13784V()));
            }
        }
        m168456M(builder, mo15085a().m192658x(str, q8s0.f153287g0).split("\\|"), bundle, setUnmodifiableSet);
        List<C2319f0> listM14030U = aVar.m14030U();
        Bundle bundle2 = new Bundle();
        for (C2319f0 c2319f0 : listM14030U) {
            String strM14166X = c2319f0.m14166X();
            if (c2319f0.m14168Z()) {
                bundle2.putString(strM14166X, String.valueOf(c2319f0.m14162B()));
            } else if (c2319f0.m14169a0()) {
                bundle2.putString(strM14166X, String.valueOf(c2319f0.m14163I()));
            } else if (c2319f0.m14172d0()) {
                bundle2.putString(strM14166X, c2319f0.m14167Y());
            } else if (c2319f0.m14170b0()) {
                bundle2.putString(strM14166X, String.valueOf(c2319f0.m14164N()));
            }
        }
        m168456M(builder, mo15085a().m192658x(str, q8s0.f153284f0).split("\\|"), bundle2, setUnmodifiableSet);
        m168455L(builder, "dma", aVar.m14032V() ? "1" : "0", setUnmodifiableSet);
        if (!aVar.m14069n1().isEmpty()) {
            m168455L(builder, "dma_cps", aVar.m14069n1(), setUnmodifiableSet);
        }
        if (mo15085a().m192648n(q8s0.f153243N0) && aVar.m14036X()) {
            C2346t c2346tM14089z0 = aVar.m14089z0();
            if (!c2346tM14089z0.m14303e0().isEmpty()) {
                m168455L(builder, "dl_gclid", c2346tM14089z0.m14303e0(), setUnmodifiableSet);
            }
            if (!c2346tM14089z0.m14302d0().isEmpty()) {
                m168455L(builder, "dl_gbraid", c2346tM14089z0.m14302d0(), setUnmodifiableSet);
            }
            if (!c2346tM14089z0.m14301a0().isEmpty()) {
                m168455L(builder, "dl_gs", c2346tM14089z0.m14301a0(), setUnmodifiableSet);
            }
            if (c2346tM14089z0.m14299B() > 0) {
                m168455L(builder, "dl_ss_ts", String.valueOf(c2346tM14089z0.m14299B()), setUnmodifiableSet);
            }
            if (!c2346tM14089z0.m14306h0().isEmpty()) {
                m168455L(builder, "mr_gclid", c2346tM14089z0.m14306h0(), setUnmodifiableSet);
            }
            if (!c2346tM14089z0.m14305g0().isEmpty()) {
                m168455L(builder, "mr_gbraid", c2346tM14089z0.m14305g0(), setUnmodifiableSet);
            }
            if (!c2346tM14089z0.m14304f0().isEmpty()) {
                m168455L(builder, "mr_gs", c2346tM14089z0.m14304f0(), setUnmodifiableSet);
            }
            if (c2346tM14089z0.m14300G() > 0) {
                m168455L(builder, "mr_click_ts", String.valueOf(c2346tM14089z0.m14300G()), setUnmodifiableSet);
            }
        }
        return new zzno(builder.build().toString(), jCurrentTimeMillis, 1);
    }

    /* JADX INFO: renamed from: D */
    public final String m168472D(C2312c c2312c) {
        if (c2312c == null) {
            return "null";
        }
        StringBuilder sb = new StringBuilder();
        sb.append("\nevent_filter {\n");
        if (c2312c.m13842W()) {
            m168461U(sb, 0, "filter_id", Integer.valueOf(c2312c.m13834E()));
        }
        m168461U(sb, 0, "event_name", mo15087c().m175776c(c2312c.m13836L()));
        String strM168452G = m168452G(c2312c.m13838N(), c2312c.m13839T(), c2312c.m13840U());
        if (!strM168452G.isEmpty()) {
            m168461U(sb, 0, "filter_type", strM168452G);
        }
        if (c2312c.m13841V()) {
            m168459S(sb, 1, "event_count_filter", c2312c.m13835K());
        }
        if (c2312c.m13844h() > 0) {
            sb.append("  filters {\n");
            Iterator<C2314d> it = c2312c.m13837M().iterator();
            while (it.hasNext()) {
                m168479R(sb, 2, it.next());
            }
        }
        m168458Q(sb, 1);
        sb.append("}\n}\n");
        return sb.toString();
    }

    /* JADX INFO: renamed from: E */
    public final String m168473E(C2316e c2316e) {
        if (c2316e == null) {
            return "null";
        }
        StringBuilder sb = new StringBuilder();
        sb.append("\nproperty_filter {\n");
        if (c2316e.m14137M()) {
            m168461U(sb, 0, "filter_id", Integer.valueOf(c2316e.m14139h()));
        }
        m168461U(sb, 0, "property_name", mo15087c().m175779g(c2316e.m14133G()));
        String strM168452G = m168452G(c2316e.m14134I(), c2316e.m14135K(), c2316e.m14136L());
        if (!strM168452G.isEmpty()) {
            m168461U(sb, 0, "filter_type", strM168452G);
        }
        m168479R(sb, 1, c2316e.m14132C());
        sb.append("}\n");
        return sb.toString();
    }

    /* JADX INFO: renamed from: F */
    public final String m168474F(zzfy$zzj zzfy_zzj) {
        C2350v c2350vM13994w2;
        if (zzfy_zzj == null) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        sb.append("\nbatch {\n");
        if (ahy0.m96761a() && mo15085a().m192648n(q8s0.f153330y0) && zzfy_zzj.m14607h() > 0) {
            mo15089e();
            if (bey0.m101424B0(zzfy_zzj.m14600C(0).m13921A2())) {
                if (zzfy_zzj.m14605W()) {
                    m168461U(sb, 0, "upload_subdomain", zzfy_zzj.m14602T());
                }
                if (zzfy_zzj.m14604V()) {
                    m168461U(sb, 0, "sgtm_join_id", zzfy_zzj.m14601N());
                }
            }
        }
        for (C2313c0 c2313c0 : zzfy_zzj.m14603U()) {
            if (c2313c0 != null) {
                m168458Q(sb, 1);
                sb.append("bundle {\n");
                if (c2313c0.m13942U0()) {
                    m168461U(sb, 1, "protocol_version", Integer.valueOf(c2313c0.m13997z1()));
                }
                if (ogy0.m164303a() && mo15085a().m192660z(c2313c0.m13921A2(), q8s0.f153328x0) && c2313c0.m13946X0()) {
                    m168461U(sb, 1, "session_stitching_token", c2313c0.m13973l0());
                }
                m168461U(sb, 1, "platform", c2313c0.m13969j0());
                if (c2313c0.m13936P0()) {
                    m168461U(sb, 1, "gmp_version", Long.valueOf(c2313c0.m13968i2()));
                }
                if (c2313c0.m13958c1()) {
                    m168461U(sb, 1, "uploading_gmp_version", Long.valueOf(c2313c0.m13990u2()));
                }
                if (c2313c0.m13933N0()) {
                    m168461U(sb, 1, "dynamite_version", Long.valueOf(c2313c0.m13956b2()));
                }
                if (c2313c0.m13925G0()) {
                    m168461U(sb, 1, "config_version", Long.valueOf(c2313c0.m13941T1()));
                }
                m168461U(sb, 1, "gmp_app_id", c2313c0.m13964g0());
                m168461U(sb, 1, "admob_app_id", c2313c0.m13998z2());
                m168461U(sb, 1, com.tencent.connect.common.Constants.JumpUrlConstants.URL_KEY_APPID, c2313c0.m13921A2());
                m168461U(sb, 1, "app_version", c2313c0.m13950Z());
                if (c2313c0.m13991v0()) {
                    m168461U(sb, 1, "app_version_major", Integer.valueOf(c2313c0.m13995x0()));
                }
                m168461U(sb, 1, "firebase_instance_id", c2313c0.m13962f0());
                if (c2313c0.m13931L0()) {
                    m168461U(sb, 1, "dev_cert_hash", Long.valueOf(c2313c0.m13947X1()));
                }
                m168461U(sb, 1, "app_store", c2313c0.m13948Y());
                if (c2313c0.m13955b1()) {
                    m168461U(sb, 1, "upload_timestamp_millis", Long.valueOf(c2313c0.m13986s2()));
                }
                if (c2313c0.m13949Y0()) {
                    m168461U(sb, 1, "start_timestamp_millis", Long.valueOf(c2313c0.m13980o2()));
                }
                if (c2313c0.m13934O0()) {
                    m168461U(sb, 1, "end_timestamp_millis", Long.valueOf(c2313c0.m13963f2()));
                }
                if (c2313c0.m13940T0()) {
                    m168461U(sb, 1, "previous_bundle_start_timestamp_millis", Long.valueOf(c2313c0.m13977m2()));
                }
                if (c2313c0.m13939S0()) {
                    m168461U(sb, 1, "previous_bundle_end_timestamp_millis", Long.valueOf(c2313c0.m13972k2()));
                }
                m168461U(sb, 1, "app_instance_id", c2313c0.m13945X());
                m168461U(sb, 1, "resettable_device_id", c2313c0.m13970k0());
                m168461U(sb, 1, "ds_id", c2313c0.m13961e0());
                if (c2313c0.m13938R0()) {
                    m168461U(sb, 1, "limited_ad_tracking", Boolean.valueOf(c2313c0.m13985s0()));
                }
                m168461U(sb, 1, "os_version", c2313c0.m13967i0());
                m168461U(sb, 1, "device_model", c2313c0.m13959d0());
                m168461U(sb, 1, "user_default_language", c2313c0.m13975m0());
                if (c2313c0.m13953a1()) {
                    m168461U(sb, 1, "time_zone_offset_minutes", Integer.valueOf(c2313c0.m13929J1()));
                }
                if (c2313c0.m13924F0()) {
                    m168461U(sb, 1, "bundle_sequential_index", Integer.valueOf(c2313c0.m13960d1()));
                }
                if (ahy0.m96761a()) {
                    mo15089e();
                    if (bey0.m101424B0(c2313c0.m13921A2()) && mo15085a().m192648n(q8s0.f153330y0) && c2313c0.m13930K0()) {
                        m168461U(sb, 1, "delivery_index", Integer.valueOf(c2313c0.m13976m1()));
                    }
                }
                if (c2313c0.m13944W0()) {
                    m168461U(sb, 1, "service_upload", Boolean.valueOf(c2313c0.m13987t0()));
                }
                m168461U(sb, 1, "health_monitor", c2313c0.m13966h0());
                if (c2313c0.m13943V0()) {
                    m168461U(sb, 1, IjkMediaPlayer.OnNativeInvokeListener.ARG_RETRY_COUNTER, Integer.valueOf(c2313c0.m13923E1()));
                }
                if (c2313c0.m13927I0()) {
                    m168461U(sb, 1, "consent_signals", c2313c0.m13954b0());
                }
                if (c2313c0.m13937Q0()) {
                    m168461U(sb, 1, "is_dma_region", Boolean.valueOf(c2313c0.m13984r0()));
                }
                if (c2313c0.m13928J0()) {
                    m168461U(sb, 1, "core_platform_services", c2313c0.m13957c0());
                }
                if (c2313c0.m13926H0()) {
                    m168461U(sb, 1, "consent_diagnostics", c2313c0.m13952a0());
                }
                if (c2313c0.m13951Z0()) {
                    m168461U(sb, 1, "target_os_version", Long.valueOf(c2313c0.m13983q2()));
                }
                if (mgy0.m154586a() && mo15085a().m192660z(c2313c0.m13921A2(), q8s0.f153233I0)) {
                    m168461U(sb, 1, "ad_services_version", Integer.valueOf(c2313c0.m13965h()));
                    if (c2313c0.m13993w0() && (c2350vM13994w2 = c2313c0.m13994w2()) != null) {
                        m168458Q(sb, 2);
                        sb.append("attribution_eligibility_status {\n");
                        m168461U(sb, 2, "eligible", Boolean.valueOf(c2350vM13994w2.m14398U()));
                        m168461U(sb, 2, "no_access_adservices_attribution_permission", Boolean.valueOf(c2350vM13994w2.m14400X()));
                        m168461U(sb, 2, "pre_r", Boolean.valueOf(c2350vM13994w2.m14401Y()));
                        m168461U(sb, 2, "r_extensions_too_old", Boolean.valueOf(c2350vM13994w2.m14402Z()));
                        m168461U(sb, 2, "adservices_extension_too_old", Boolean.valueOf(c2350vM13994w2.m14397N()));
                        m168461U(sb, 2, "ad_storage_not_allowed", Boolean.valueOf(c2350vM13994w2.m14396L()));
                        m168461U(sb, 2, "measurement_manager_disabled", Boolean.valueOf(c2350vM13994w2.m14399W()));
                        m168458Q(sb, 2);
                        sb.append("}\n");
                    }
                }
                if (hey0.m130716a() && mo15085a().m192648n(q8s0.f153259V0) && c2313c0.m13989u0()) {
                    C2346t c2346tM13992v2 = c2313c0.m13992v2();
                    m168458Q(sb, 2);
                    sb.append("ad_campaign_info {\n");
                    if (c2346tM13992v2.m14309k0()) {
                        m168461U(sb, 2, "deep_link_gclid", c2346tM13992v2.m14303e0());
                    }
                    if (c2346tM13992v2.m14308j0()) {
                        m168461U(sb, 2, "deep_link_gbraid", c2346tM13992v2.m14302d0());
                    }
                    if (c2346tM13992v2.m14307i0()) {
                        m168461U(sb, 2, "deep_link_gad_source", c2346tM13992v2.m14301a0());
                    }
                    if (c2346tM13992v2.m14310l0()) {
                        m168461U(sb, 2, "deep_link_session_millis", Long.valueOf(c2346tM13992v2.m14299B()));
                    }
                    if (c2346tM13992v2.m14314p0()) {
                        m168461U(sb, 2, "market_referrer_gclid", c2346tM13992v2.m14306h0());
                    }
                    if (c2346tM13992v2.m14313o0()) {
                        m168461U(sb, 2, "market_referrer_gbraid", c2346tM13992v2.m14305g0());
                    }
                    if (c2346tM13992v2.m14312n0()) {
                        m168461U(sb, 2, "market_referrer_gad_source", c2346tM13992v2.m14304f0());
                    }
                    if (c2346tM13992v2.m14311m0()) {
                        m168461U(sb, 2, "market_referrer_click_millis", Long.valueOf(c2346tM13992v2.m14300G()));
                    }
                    m168458Q(sb, 2);
                    sb.append("}\n");
                }
                List<C2319f0> listM13981p0 = c2313c0.m13981p0();
                if (listM13981p0 != null) {
                    for (C2319f0 c2319f0 : listM13981p0) {
                        if (c2319f0 != null) {
                            m168458Q(sb, 2);
                            sb.append("user_property {\n");
                            m168461U(sb, 2, "set_timestamp_millis", c2319f0.m14171c0() ? Long.valueOf(c2319f0.m14165U()) : null);
                            m168461U(sb, 2, AuthenticationTokenClaims.JSON_KEY_NAME, mo15087c().m175779g(c2319f0.m14166X()));
                            m168461U(sb, 2, "string_value", c2319f0.m14167Y());
                            m168461U(sb, 2, "int_value", c2319f0.m14170b0() ? Long.valueOf(c2319f0.m14164N()) : null);
                            m168461U(sb, 2, "double_value", c2319f0.m14168Z() ? Double.valueOf(c2319f0.m14162B()) : null);
                            m168458Q(sb, 2);
                            sb.append("}\n");
                        }
                    }
                }
                List<C2352w> listM13978n0 = c2313c0.m13978n0();
                c2313c0.m13921A2();
                if (listM13978n0 != null) {
                    for (C2352w c2352w : listM13978n0) {
                        if (c2352w != null) {
                            m168458Q(sb, 2);
                            sb.append("audience_membership {\n");
                            if (c2352w.m14423N()) {
                                m168461U(sb, 2, "audience_id", Integer.valueOf(c2352w.m14426h()));
                            }
                            if (c2352w.m14424T()) {
                                m168461U(sb, 2, "new_audience", Boolean.valueOf(c2352w.m14422M()));
                            }
                            m168460T(sb, 2, "current_data", c2352w.m14420K());
                            if (c2352w.m14425U()) {
                                m168460T(sb, 2, "previous_data", c2352w.m14421L());
                            }
                            m168458Q(sb, 2);
                            sb.append("}\n");
                        }
                    }
                }
                List<C2356y> listM13979o0 = c2313c0.m13979o0();
                if (listM13979o0 != null) {
                    for (C2356y c2356y : listM13979o0) {
                        if (c2356y != null) {
                            m168458Q(sb, 2);
                            sb.append("event {\n");
                            m168461U(sb, 2, AuthenticationTokenClaims.JSON_KEY_NAME, mo15087c().m175776c(c2356y.m14500X()));
                            if (c2356y.m14504b0()) {
                                m168461U(sb, 2, "timestamp_millis", Long.valueOf(c2356y.m14499U()));
                            }
                            if (c2356y.m14503a0()) {
                                m168461U(sb, 2, "previous_timestamp_millis", Long.valueOf(c2356y.m14498T()));
                            }
                            if (c2356y.m14502Z()) {
                                m168461U(sb, 2, "count", Integer.valueOf(c2356y.m14506h()));
                            }
                            if (c2356y.m14497M() != 0) {
                                m168480V(sb, 2, c2356y.m14501Y());
                            }
                            m168458Q(sb, 2);
                            sb.append("}\n");
                        }
                    }
                }
                m168458Q(sb, 1);
                sb.append("}\n");
            }
        }
        sb.append("} // End-of-batch\n");
        return sb.toString();
    }

    /* JADX INFO: renamed from: I */
    public final List<Long> m168475I(List<Long> list, List<Integer> list2) {
        int i;
        ArrayList arrayList = new ArrayList(list);
        for (Integer num : list2) {
            if (num.intValue() < 0) {
                zzj().m211417F().m123937b("Ignoring negative bit index to be cleared", num);
            } else {
                int iIntValue = num.intValue() / 64;
                if (iIntValue >= arrayList.size()) {
                    zzj().m211417F().m123938c("Ignoring bit index greater than bitSet size", num, Integer.valueOf(arrayList.size()));
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
    public final Map<String, Object> m168476J(Bundle bundle, boolean z) {
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
                                arrayList.add(m168476J((Bundle) parcelable, false));
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
                                arrayList.add(m168476J((Bundle) obj2, false));
                            }
                        }
                    } else if (obj instanceof Bundle) {
                        arrayList.add(m168476J((Bundle) obj, false));
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
    public final void m168477O(C2308a0.a aVar, Object obj) {
        Preconditions.checkNotNull(obj);
        aVar.m13800G().m13798D().m13796B().m13799E();
        if (obj instanceof String) {
            aVar.m13797C((String) obj);
            return;
        }
        if (obj instanceof Long) {
            aVar.m13805x(((Long) obj).longValue());
            return;
        }
        if (obj instanceof Double) {
            aVar.m13804w(((Double) obj).doubleValue());
            return;
        }
        if (!(obj instanceof Bundle[])) {
            zzj().m211412A().m123937b("Ignoring invalid (type) event param value", obj);
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (Bundle bundle : (Bundle[]) obj) {
            if (bundle != null) {
                C2308a0.a aVarM13779X = C2308a0.m13779X();
                for (String str : bundle.keySet()) {
                    C2308a0.a aVarM13795A = C2308a0.m13779X().m13795A(str);
                    Object obj2 = bundle.get(str);
                    if (obj2 instanceof Long) {
                        aVarM13795A.m13805x(((Long) obj2).longValue());
                    } else if (obj2 instanceof String) {
                        aVarM13795A.m13797C((String) obj2);
                    } else if (obj2 instanceof Double) {
                        aVarM13795A.m13804w(((Double) obj2).doubleValue());
                    }
                    aVarM13779X.m13806y(aVarM13795A);
                }
                if (aVarM13779X.m13803v() > 0) {
                    arrayList.add((C2308a0) ((AbstractC2349u0) aVarM13779X.mo14369H()));
                }
            }
        }
        aVar.m13807z(arrayList);
    }

    /* JADX INFO: renamed from: P */
    public final void m168478P(C2319f0.a aVar, Object obj) {
        Preconditions.checkNotNull(obj);
        aVar.m14175C().m14180z().m14176v();
        if (obj instanceof String) {
            aVar.m14174B((String) obj);
            return;
        }
        if (obj instanceof Long) {
            aVar.m14178x(((Long) obj).longValue());
        } else if (obj instanceof Double) {
            aVar.m14177w(((Double) obj).doubleValue());
        } else {
            zzj().m211412A().m123937b("Ignoring invalid (type) user attribute value", obj);
        }
    }

    /* JADX INFO: renamed from: R */
    public final void m168479R(StringBuilder sb, int i, C2314d c2314d) {
        if (c2314d == null) {
            return;
        }
        m168458Q(sb, i);
        sb.append("filter {\n");
        if (c2314d.m14097L()) {
            m168461U(sb, i, "complement", Boolean.valueOf(c2314d.m14096K()));
        }
        if (c2314d.m14099N()) {
            m168461U(sb, i, "param_name", mo15087c().m175778f(c2314d.m14095I()));
        }
        if (c2314d.m14100T()) {
            int i2 = i + 1;
            zzfo$zzf zzfo_zzfM14094G = c2314d.m14094G();
            if (zzfo_zzfM14094G != null) {
                m168458Q(sb, i2);
                sb.append("string_filter");
                sb.append(" {\n");
                if (zzfo_zzfM14094G.m14574M()) {
                    m168461U(sb, i2, "match_type", zzfo_zzfM14094G.m14568B().name());
                }
                if (zzfo_zzfM14094G.m14573L()) {
                    m168461U(sb, i2, "expression", zzfo_zzfM14094G.m14569E());
                }
                if (zzfo_zzfM14094G.m14572K()) {
                    m168461U(sb, i2, "case_sensitive", Boolean.valueOf(zzfo_zzfM14094G.m14571I()));
                }
                if (zzfo_zzfM14094G.m14575h() > 0) {
                    m168458Q(sb, i + 2);
                    sb.append("expression_list {\n");
                    for (String str : zzfo_zzfM14094G.m14570G()) {
                        m168458Q(sb, i + 3);
                        sb.append(str);
                        sb.append(SignParameters.NEW_LINE);
                    }
                    sb.append("}\n");
                }
                m168458Q(sb, i2);
                sb.append("}\n");
            }
        }
        if (c2314d.m14098M()) {
            m168459S(sb, i + 1, "number_filter", c2314d.m14093E());
        }
        m168458Q(sb, i);
        sb.append("}\n");
    }

    /* JADX INFO: renamed from: V */
    public final void m168480V(StringBuilder sb, int i, List<C2308a0> list) {
        if (list == null) {
            return;
        }
        int i2 = i + 1;
        for (C2308a0 c2308a0 : list) {
            if (c2308a0 != null) {
                m168458Q(sb, i2);
                sb.append("param {\n");
                m168461U(sb, i2, AuthenticationTokenClaims.JSON_KEY_NAME, c2308a0.m13791f0() ? mo15087c().m175778f(c2308a0.m13785Z()) : null);
                m168461U(sb, i2, "string_value", c2308a0.m13792g0() ? c2308a0.m13786a0() : null);
                m168461U(sb, i2, "int_value", c2308a0.m13790e0() ? Long.valueOf(c2308a0.m13784V()) : null);
                m168461U(sb, i2, "double_value", c2308a0.m13788c0() ? Double.valueOf(c2308a0.m13781B()) : null);
                if (c2308a0.m13783T() > 0) {
                    m168480V(sb, i2, c2308a0.m13787b0());
                }
                m168458Q(sb, i2);
                sb.append("}\n");
            }
        }
    }

    /* JADX INFO: renamed from: W */
    public final boolean m168481W(long j, long j2) {
        return j == 0 || j2 <= 0 || Math.abs(zzb().currentTimeMillis() - j) > j2;
    }

    @Override // p149l.spx0
    @Pure
    /* JADX INFO: renamed from: a */
    public final /* bridge */ /* synthetic */ u9r0 mo15085a() {
        return super.mo15085a();
    }

    @Override // p149l.spx0
    @Pure
    /* JADX INFO: renamed from: b */
    public final /* bridge */ /* synthetic */ iyr0 mo15086b() {
        return super.mo15086b();
    }

    /* JADX INFO: renamed from: b0 */
    public final byte[] m168482b0(byte[] bArr) throws IOException {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
            gZIPOutputStream.write(bArr);
            gZIPOutputStream.close();
            byteArrayOutputStream.close();
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e) {
            zzj().m211412A().m123937b("Failed to gzip content", e);
            throw e;
        }
    }

    @Override // p149l.spx0
    @Pure
    /* JADX INFO: renamed from: c */
    public final /* bridge */ /* synthetic */ qow0 mo15087c() {
        return super.mo15087c();
    }

    @Override // p149l.spx0
    @Pure
    /* JADX INFO: renamed from: d */
    public final /* bridge */ /* synthetic */ u9x0 mo15088d() {
        return super.mo15088d();
    }

    /* JADX INFO: renamed from: d0 */
    public final byte[] m168483d0(byte[] bArr) throws IOException {
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
            zzj().m211412A().m123937b("Failed to ungzip content", e);
            throw e;
        }
    }

    @Override // p149l.spx0
    @Pure
    /* JADX INFO: renamed from: e */
    public final /* bridge */ /* synthetic */ bey0 mo15089e() {
        return super.mo15089e();
    }

    /* JADX INFO: renamed from: e0 */
    public final List<Integer> m168484e0() {
        Map<String, String> mapM173506b = q8s0.m173506b(this.f122162b.zza());
        if (mapM173506b == null || mapM173506b.isEmpty()) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        int iIntValue = q8s0.f153252S.m188827a(null).intValue();
        for (Map.Entry<String, String> entry : mapM173506b.entrySet()) {
            if (entry.getKey().startsWith("measurement.id.")) {
                try {
                    int i = Integer.parseInt(entry.getValue());
                    if (i != 0) {
                        arrayList.add(Integer.valueOf(i));
                        if (arrayList.size() >= iIntValue) {
                            zzj().m211417F().m123937b("Too many experiment IDs. Number of IDs", Integer.valueOf(arrayList.size()));
                            break;
                        }
                        continue;
                    } else {
                        continue;
                    }
                } catch (NumberFormatException e) {
                    zzj().m211417F().m123937b("Experiment ID NumberFormatException", e);
                }
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return arrayList;
    }

    @Override // p149l.spx0
    /* JADX INFO: renamed from: f */
    public final /* bridge */ /* synthetic */ void mo15090f() {
        super.mo15090f();
    }

    @Override // p149l.spx0
    /* JADX INFO: renamed from: g */
    public final /* bridge */ /* synthetic */ void mo15091g() {
        super.mo15091g();
    }

    @Override // p149l.spx0
    /* JADX INFO: renamed from: h */
    public final /* bridge */ /* synthetic */ void mo15092h() {
        super.mo15092h();
    }

    @Override // p149l.kay0
    /* JADX INFO: renamed from: i */
    public final /* bridge */ /* synthetic */ pdy0 mo15138i() {
        return super.mo15138i();
    }

    @Override // p149l.kay0
    /* JADX INFO: renamed from: j */
    public final /* bridge */ /* synthetic */ jny0 mo15139j() {
        return super.mo15139j();
    }

    @Override // p149l.kay0
    /* JADX INFO: renamed from: k */
    public final /* bridge */ /* synthetic */ igr0 mo15140k() {
        return super.mo15140k();
    }

    @Override // p149l.kay0
    /* JADX INFO: renamed from: l */
    public final /* bridge */ /* synthetic */ C2456e mo15141l() {
        return super.mo15141l();
    }

    @Override // p149l.kay0
    /* JADX INFO: renamed from: m */
    public final /* bridge */ /* synthetic */ e7y0 mo15142m() {
        return super.mo15142m();
    }

    @Override // p149l.kay0
    /* JADX INFO: renamed from: n */
    public final /* bridge */ /* synthetic */ pay0 mo15143n() {
        return super.mo15143n();
    }

    @Override // p149l.hay0
    /* JADX INFO: renamed from: r */
    public final boolean mo15144r() {
        return false;
    }

    /* JADX INFO: renamed from: t */
    public final long m168485t(String str) {
        if (TextUtils.isEmpty(str)) {
            return 0L;
        }
        return m168486u(str.getBytes(Charset.forName("UTF-8")));
    }

    @WorkerThread
    /* JADX INFO: renamed from: u */
    public final long m168486u(byte[] bArr) {
        Preconditions.checkNotNull(bArr);
        mo15089e().mo15092h();
        MessageDigest messageDigestM101432P0 = bey0.m101432P0();
        if (messageDigestM101432P0 != null) {
            return bey0.m101451v(messageDigestM101432P0.digest(bArr));
        }
        zzj().m211412A().m123936a("Failed to get MD5");
        return 0L;
    }

    /* JADX INFO: renamed from: w */
    public final Bundle m168487w(Map<String, Object> map, boolean z) {
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
                    arrayList2.add(m168487w((Map) obj2, false));
                }
                bundle.putParcelableArray(str, (Parcelable[]) arrayList2.toArray(new Parcelable[0]));
            }
        }
        return bundle;
    }

    /* JADX INFO: renamed from: x */
    public final <T extends Parcelable> T m168488x(byte[] bArr, Parcelable.Creator<T> creator) {
        if (bArr == null) {
            return null;
        }
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.unmarshall(bArr, 0, bArr.length);
            parcelObtain.setDataPosition(0);
            return creator.createFromParcel(parcelObtain);
        } catch (SafeParcelReader.ParseException unused) {
            zzj().m211412A().m123936a("Failed to load parcelable from buffer");
            return null;
        } finally {
            parcelObtain.recycle();
        }
    }

    /* JADX INFO: renamed from: y */
    public final C2356y m168489y(q3s0 q3s0Var) {
        C2356y.a aVarM14523z = C2356y.m14494V().m14523z(q3s0Var.f152511e);
        for (String str : q3s0Var.f152512f) {
            C2308a0.a aVarM13795A = C2308a0.m13779X().m13795A(str);
            Object objM15326I = q3s0Var.f152512f.m15326I(str);
            Preconditions.checkNotNull(objM15326I);
            m168477O(aVarM13795A, objM15326I);
            aVarM14523z.m14507A(aVarM13795A);
        }
        if (mo15085a().m192648n(q8s0.f153297j1) && !TextUtils.isEmpty(q3s0Var.f152509c) && q3s0Var.f152512f.m15326I("_o") == null) {
            aVarM14523z.m14508B((C2308a0) ((AbstractC2349u0) C2308a0.m13779X().m13795A("_o").m13797C(q3s0Var.f152509c).mo14369H()));
        }
        return (C2356y) ((AbstractC2349u0) aVarM14523z.mo14369H());
    }

    @Override // p149l.spx0, p149l.bqx0
    @Pure
    public final /* bridge */ /* synthetic */ Context zza() {
        return super.zza();
    }

    @Override // p149l.spx0, p149l.bqx0
    @Pure
    public final /* bridge */ /* synthetic */ Clock zzb() {
        return super.zzb();
    }

    @Override // p149l.spx0, p149l.bqx0
    @Pure
    public final /* bridge */ /* synthetic */ t2r0 zzd() {
        return super.zzd();
    }

    @Override // p149l.spx0, p149l.bqx0
    @Pure
    public final /* bridge */ /* synthetic */ xww0 zzj() {
        return super.zzj();
    }

    @Override // p149l.spx0, p149l.bqx0
    @Pure
    public final /* bridge */ /* synthetic */ kjx0 zzl() {
        return super.zzl();
    }
}
