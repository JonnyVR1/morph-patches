package p153l;

import android.util.JsonReader;
import androidx.annotation.Nullable;
import com.appsflyer.AdRevenueScheme;
import com.clevertap.android.sdk.Constants;
import com.google.android.gms.ads.internal.client.zzs;
import com.google.android.gms.internal.ads.zzcag;
import com.google.android.gms.internal.ads.zzcbp;
import com.google.android.gms.internal.ads.zzgaa;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.p051p1.mobile.putong.core.data.Portrait;
import java.io.IOException;
import java.util.Collections;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public final class q6w0 {

    /* JADX INFO: renamed from: A */
    public final String f155847A;

    /* JADX INFO: renamed from: B */
    public final zzcbp f155848B;

    /* JADX INFO: renamed from: C */
    public final String f155849C;

    /* JADX INFO: renamed from: D */
    public final JSONObject f155850D;

    /* JADX INFO: renamed from: E */
    public final JSONObject f155851E;

    /* JADX INFO: renamed from: F */
    public final String f155852F;

    /* JADX INFO: renamed from: G */
    public final String f155853G;

    /* JADX INFO: renamed from: H */
    public final String f155854H;

    /* JADX INFO: renamed from: I */
    public final String f155855I;

    /* JADX INFO: renamed from: J */
    public final String f155856J;

    /* JADX INFO: renamed from: K */
    public final boolean f155857K;

    /* JADX INFO: renamed from: L */
    public final boolean f155858L;

    /* JADX INFO: renamed from: M */
    public final boolean f155859M;

    /* JADX INFO: renamed from: N */
    public final boolean f155860N;

    /* JADX INFO: renamed from: O */
    public final boolean f155861O;

    /* JADX INFO: renamed from: P */
    public final boolean f155862P;

    /* JADX INFO: renamed from: Q */
    public final boolean f155863Q;

    /* JADX INFO: renamed from: R */
    public final int f155864R;

    /* JADX INFO: renamed from: S */
    public final int f155865S;

    /* JADX INFO: renamed from: T */
    public final boolean f155866T;

    /* JADX INFO: renamed from: U */
    public final boolean f155867U;

    /* JADX INFO: renamed from: V */
    public final String f155868V;

    /* JADX INFO: renamed from: W */
    public final r7w0 f155869W;

    /* JADX INFO: renamed from: X */
    public final boolean f155870X;

    /* JADX INFO: renamed from: Y */
    public final boolean f155871Y;

    /* JADX INFO: renamed from: Z */
    public final int f155872Z;

    /* JADX INFO: renamed from: a */
    public final List f155873a;

    /* JADX INFO: renamed from: a0 */
    public final String f155874a0;

    /* JADX INFO: renamed from: b */
    public final int f155875b;

    /* JADX INFO: renamed from: b0 */
    public final int f155876b0;

    /* JADX INFO: renamed from: c */
    public final List f155877c;

    /* JADX INFO: renamed from: c0 */
    public final String f155878c0;

    /* JADX INFO: renamed from: d */
    public final List f155879d;

    /* JADX INFO: renamed from: d0 */
    public final boolean f155880d0;

    /* JADX INFO: renamed from: e */
    public final List f155881e;

    /* JADX INFO: renamed from: e0 */
    public final x1t0 f155882e0;

    /* JADX INFO: renamed from: f */
    public final int f155883f;

    /* JADX INFO: renamed from: f0 */
    @Nullable
    public final zzs f155884f0;

    /* JADX INFO: renamed from: g */
    public final List f155885g;

    /* JADX INFO: renamed from: g0 */
    public final String f155886g0;

    /* JADX INFO: renamed from: h */
    public final List f155887h;

    /* JADX INFO: renamed from: h0 */
    public final boolean f155888h0;

    /* JADX INFO: renamed from: i */
    public final List f155889i;

    /* JADX INFO: renamed from: i0 */
    public final JSONObject f155890i0;

    /* JADX INFO: renamed from: j */
    public final List f155891j;

    /* JADX INFO: renamed from: j0 */
    public final boolean f155892j0;

    /* JADX INFO: renamed from: k */
    public final String f155893k;

    /* JADX INFO: renamed from: k0 */
    public final JSONObject f155894k0;

    /* JADX INFO: renamed from: l */
    public final String f155895l;

    /* JADX INFO: renamed from: l0 */
    public final boolean f155896l0;

    /* JADX INFO: renamed from: m */
    @Nullable
    public final zzcag f155897m;

    /* JADX INFO: renamed from: m0 */
    @Nullable
    public final String f155898m0;

    /* JADX INFO: renamed from: n */
    public final List f155899n;

    /* JADX INFO: renamed from: n0 */
    public final boolean f155900n0;

    /* JADX INFO: renamed from: o */
    public final List f155901o;

    /* JADX INFO: renamed from: o0 */
    public final String f155902o0;

    /* JADX INFO: renamed from: p */
    public final List f155903p;

    /* JADX INFO: renamed from: p0 */
    public final String f155904p0;

    /* JADX INFO: renamed from: q */
    public final List f155905q;

    /* JADX INFO: renamed from: q0 */
    public final String f155906q0;

    /* JADX INFO: renamed from: r */
    public final int f155907r;

    /* JADX INFO: renamed from: r0 */
    public final boolean f155908r0;

    /* JADX INFO: renamed from: s */
    public final List f155909s;

    /* JADX INFO: renamed from: s0 */
    public final int f155910s0;

    /* JADX INFO: renamed from: t */
    @Nullable
    public final u6w0 f155911t;

    /* JADX INFO: renamed from: t0 */
    public final String f155912t0;

    /* JADX INFO: renamed from: u */
    public final List f155913u;

    /* JADX INFO: renamed from: u0 */
    public final List f155914u0;

    /* JADX INFO: renamed from: v */
    public final List f155915v;

    /* JADX INFO: renamed from: w */
    public final JSONObject f155916w;

    /* JADX INFO: renamed from: x */
    public final String f155917x;

    /* JADX INFO: renamed from: y */
    public final String f155918y;

    /* JADX INFO: renamed from: z */
    public final String f155919z;

    /* JADX WARN: Code duplicated, block: B:249:0x0716 A[ADDED_TO_REGION, PHI: r75 r77
      0x0716: PHI (r75v79 java.util.List) = 
      (r75v4 java.util.List)
      (r75v5 java.util.List)
      (r75v6 java.util.List)
      (r75v7 java.util.List)
      (r75v8 java.util.List)
      (r75v9 java.util.List)
      (r75v10 java.util.List)
      (r75v11 java.util.List)
      (r75v12 java.util.List)
      (r75v13 java.util.List)
      (r75v14 java.util.List)
      (r75v15 java.util.List)
      (r75v16 java.util.List)
      (r75v17 java.util.List)
      (r75v18 java.util.List)
      (r75v19 java.util.List)
      (r75v20 java.util.List)
      (r75v21 java.util.List)
      (r75v22 java.util.List)
      (r75v23 java.util.List)
      (r75v24 java.util.List)
      (r75v25 java.util.List)
      (r75v26 java.util.List)
      (r75v27 java.util.List)
      (r75v28 java.util.List)
      (r75v29 java.util.List)
      (r75v30 java.util.List)
      (r75v31 java.util.List)
      (r75v32 java.util.List)
      (r75v33 java.util.List)
      (r75v34 java.util.List)
      (r75v35 java.util.List)
      (r75v36 java.util.List)
      (r75v37 java.util.List)
      (r75v38 java.util.List)
      (r75v39 java.util.List)
      (r75v40 java.util.List)
      (r75v41 java.util.List)
      (r75v42 java.util.List)
      (r75v43 java.util.List)
      (r75v44 java.util.List)
      (r75v45 java.util.List)
      (r75v46 java.util.List)
      (r75v47 java.util.List)
      (r75v48 java.util.List)
      (r75v49 java.util.List)
      (r75v50 java.util.List)
      (r75v51 java.util.List)
      (r75v52 java.util.List)
      (r75v53 java.util.List)
      (r75v54 java.util.List)
      (r75v55 java.util.List)
      (r75v56 java.util.List)
      (r75v57 java.util.List)
      (r75v58 java.util.List)
      (r75v59 java.util.List)
      (r75v60 java.util.List)
      (r75v61 java.util.List)
      (r75v62 java.util.List)
      (r75v63 java.util.List)
      (r75v64 java.util.List)
      (r75v65 java.util.List)
      (r75v66 java.util.List)
      (r75v67 java.util.List)
      (r75v68 java.util.List)
      (r75v69 java.util.List)
      (r75v70 java.util.List)
      (r75v71 java.util.List)
      (r75v72 java.util.List)
      (r75v73 java.util.List)
      (r75v74 java.util.List)
      (r75v75 java.util.List)
      (r75v76 java.util.List)
      (r75v77 java.util.List)
      (r75v80 java.util.List)
     binds: [B:244:0x06fb, B:241:0x06e7, B:238:0x06d3, B:235:0x06bf, B:232:0x06ab, B:229:0x0693, B:226:0x067f, B:220:0x0658, B:217:0x0644, B:214:0x0630, B:208:0x0606, B:205:0x05ee, B:202:0x05da, B:199:0x05c6, B:196:0x05b2, B:193:0x059e, B:190:0x058a, B:187:0x0576, B:184:0x0562, B:181:0x054e, B:178:0x0536, B:175:0x0522, B:172:0x050e, B:169:0x04f6, B:166:0x04e2, B:163:0x04ce, B:160:0x04ba, B:157:0x04a6, B:154:0x048e, B:151:0x047a, B:145:0x0453, B:142:0x043f, B:139:0x042b, B:136:0x0413, B:133:0x03ff, B:130:0x03eb, B:127:0x03d7, B:124:0x03c3, B:121:0x03af, B:118:0x039c, B:115:0x0388, B:112:0x0374, B:109:0x0360, B:106:0x034c, B:103:0x0338, B:101:0x0328, B:96:0x0307, B:93:0x02f3, B:90:0x02df, B:87:0x02cb, B:84:0x02b7, B:81:0x02a3, B:78:0x028f, B:75:0x027b, B:72:0x0267, B:69:0x0253, B:66:0x023f, B:63:0x0227, B:60:0x0213, B:57:0x01fb, B:54:0x01e7, B:51:0x01d3, B:48:0x01bf, B:42:0x0198, B:39:0x0184, B:36:0x0170, B:33:0x015d, B:30:0x014a, B:27:0x0137, B:24:0x0124, B:21:0x0111, B:18:0x00fe, B:13:0x00e7, B:11:0x00d5, B:254:0x0716] A[DONT_GENERATE, DONT_INLINE]
      0x0716: PHI (r77v77 java.util.List) = 
      (r77v1 java.util.List)
      (r77v2 java.util.List)
      (r77v3 java.util.List)
      (r77v4 java.util.List)
      (r77v5 java.util.List)
      (r77v6 java.util.List)
      (r77v7 java.util.List)
      (r77v8 java.util.List)
      (r77v9 java.util.List)
      (r77v10 java.util.List)
      (r77v11 java.util.List)
      (r77v12 java.util.List)
      (r77v13 java.util.List)
      (r77v14 java.util.List)
      (r77v15 java.util.List)
      (r77v16 java.util.List)
      (r77v17 java.util.List)
      (r77v18 java.util.List)
      (r77v19 java.util.List)
      (r77v20 java.util.List)
      (r77v21 java.util.List)
      (r77v22 java.util.List)
      (r77v23 java.util.List)
      (r77v24 java.util.List)
      (r77v25 java.util.List)
      (r77v26 java.util.List)
      (r77v27 java.util.List)
      (r77v28 java.util.List)
      (r77v29 java.util.List)
      (r77v30 java.util.List)
      (r77v31 java.util.List)
      (r77v32 java.util.List)
      (r77v33 java.util.List)
      (r77v34 java.util.List)
      (r77v35 java.util.List)
      (r77v36 java.util.List)
      (r77v37 java.util.List)
      (r77v38 java.util.List)
      (r77v39 java.util.List)
      (r77v40 java.util.List)
      (r77v41 java.util.List)
      (r77v42 java.util.List)
      (r77v43 java.util.List)
      (r77v44 java.util.List)
      (r77v45 java.util.List)
      (r77v46 java.util.List)
      (r77v47 java.util.List)
      (r77v48 java.util.List)
      (r77v49 java.util.List)
      (r77v50 java.util.List)
      (r77v51 java.util.List)
      (r77v52 java.util.List)
      (r77v53 java.util.List)
      (r77v54 java.util.List)
      (r77v55 java.util.List)
      (r77v56 java.util.List)
      (r77v57 java.util.List)
      (r77v58 java.util.List)
      (r77v59 java.util.List)
      (r77v60 java.util.List)
      (r77v61 java.util.List)
      (r77v62 java.util.List)
      (r77v63 java.util.List)
      (r77v64 java.util.List)
      (r77v65 java.util.List)
      (r77v66 java.util.List)
      (r77v67 java.util.List)
      (r77v68 java.util.List)
      (r77v69 java.util.List)
      (r77v70 java.util.List)
      (r77v71 java.util.List)
      (r77v72 java.util.List)
      (r77v73 java.util.List)
      (r77v74 java.util.List)
      (r77v78 java.util.List)
     binds: [B:244:0x06fb, B:241:0x06e7, B:238:0x06d3, B:235:0x06bf, B:232:0x06ab, B:229:0x0693, B:226:0x067f, B:220:0x0658, B:217:0x0644, B:214:0x0630, B:208:0x0606, B:205:0x05ee, B:202:0x05da, B:199:0x05c6, B:196:0x05b2, B:193:0x059e, B:190:0x058a, B:187:0x0576, B:184:0x0562, B:181:0x054e, B:178:0x0536, B:175:0x0522, B:172:0x050e, B:169:0x04f6, B:166:0x04e2, B:163:0x04ce, B:160:0x04ba, B:157:0x04a6, B:154:0x048e, B:151:0x047a, B:145:0x0453, B:142:0x043f, B:139:0x042b, B:136:0x0413, B:133:0x03ff, B:130:0x03eb, B:127:0x03d7, B:124:0x03c3, B:121:0x03af, B:118:0x039c, B:115:0x0388, B:112:0x0374, B:109:0x0360, B:106:0x034c, B:103:0x0338, B:101:0x0328, B:96:0x0307, B:93:0x02f3, B:90:0x02df, B:87:0x02cb, B:84:0x02b7, B:81:0x02a3, B:78:0x028f, B:75:0x027b, B:72:0x0267, B:69:0x0253, B:66:0x023f, B:63:0x0227, B:60:0x0213, B:57:0x01fb, B:54:0x01e7, B:51:0x01d3, B:48:0x01bf, B:42:0x0198, B:39:0x0184, B:36:0x0170, B:33:0x015d, B:30:0x014a, B:27:0x0137, B:24:0x0124, B:21:0x0111, B:18:0x00fe, B:13:0x00e7, B:11:0x00d5, B:254:0x0716] A[DONT_GENERATE, DONT_INLINE], REMOVE] */
    public q6w0(JsonReader jsonReader) throws IllegalStateException, JSONException, IOException, NumberFormatException {
        List list;
        List list2;
        List listM198932d = Collections.EMPTY_LIST;
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        JSONObject jSONObject3 = new JSONObject();
        JSONObject jSONObject4 = new JSONObject();
        JSONObject jSONObject5 = new JSONObject();
        JSONObject jSONObject6 = new JSONObject();
        zzgaa zzgaaVarZzl = zzgaa.zzl();
        zzgaa zzgaaVarZzl2 = zzgaa.zzl();
        jsonReader.beginObject();
        List listM180055a = listM198932d;
        List listM198932d2 = listM180055a;
        List listM180055a2 = listM198932d2;
        List listM198932d3 = listM180055a2;
        JSONObject jSONObjectM198936h = jSONObject;
        JSONObject jSONObjectM198936h2 = jSONObject2;
        JSONObject jSONObjectM198936h3 = jSONObject3;
        JSONObject jSONObjectM198936h4 = jSONObject4;
        JSONObject jSONObjectM198936h5 = jSONObject5;
        JSONObject jSONObjectM198936h6 = jSONObject6;
        List listM198932d4 = zzgaaVarZzl;
        List listM198932d5 = zzgaaVarZzl2;
        String strNextString = "";
        String strNextString2 = strNextString;
        String strNextString3 = strNextString2;
        String strNextString4 = strNextString3;
        String string = strNextString4;
        String strNextString5 = string;
        String strNextString6 = strNextString5;
        String strNextString7 = strNextString6;
        String strNextString8 = strNextString7;
        String strNextString9 = strNextString8;
        String strNextString10 = strNextString9;
        String strNextString11 = strNextString10;
        String strNextString12 = strNextString11;
        String strNextString13 = strNextString12;
        String strNextString14 = strNextString13;
        String strNextString15 = strNextString14;
        String strNextString16 = strNextString15;
        String strNextString17 = strNextString16;
        String strNextString18 = strNextString17;
        int iM175621c = 0;
        boolean zNextBoolean = false;
        boolean zNextBoolean2 = false;
        boolean zNextBoolean3 = false;
        boolean zNextBoolean4 = false;
        boolean zNextBoolean5 = false;
        boolean zNextBoolean6 = false;
        boolean zNextBoolean7 = false;
        int iNextInt = 0;
        boolean zNextBoolean8 = false;
        boolean zNextBoolean9 = false;
        boolean zNextBoolean10 = false;
        int iNextInt2 = 0;
        boolean zNextBoolean11 = false;
        boolean zNextBoolean12 = false;
        boolean zNextBoolean13 = false;
        boolean zNextBoolean14 = false;
        boolean zNextBoolean15 = false;
        boolean zNextBoolean16 = false;
        boolean zNextBoolean17 = false;
        int iNextInt3 = 0;
        int iNextInt4 = 0;
        u6w0 u6w0Var = null;
        zzcbp zzcbpVarM13611g = null;
        x1t0 x1t0VarM209104a = null;
        zzs zzsVarM12312g = null;
        String strNextString19 = null;
        int iM175622d = -1;
        int iNextInt5 = -1;
        List listM198932d6 = listM198932d3;
        List listM198932d7 = listM198932d6;
        List listM198932d8 = listM198932d7;
        List listM198932d9 = listM198932d8;
        List listM198932d10 = listM198932d9;
        List listM198932d11 = listM198932d10;
        List listM198932d12 = listM198932d11;
        List listM198932d13 = listM198932d12;
        List listM198932d14 = listM198932d13;
        String strNextString20 = strNextString18;
        int iM175620b = 0;
        zzcag zzcagVarM13610g = null;
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            String str = strNextName == null ? strNextString : strNextName;
            switch (str.hashCode()) {
                case -2138196627:
                    list = listM198932d13;
                    list2 = listM198932d14;
                    if (str.equals("ad_source_instance_name") && ((Boolean) sgs0.f168090O6.m115748l()).booleanValue()) {
                        strNextString13 = jsonReader.nextString();
                    } else {
                        jsonReader.skipValue();
                    }
                    listM198932d14 = list2;
                    listM198932d13 = list;
                    break;
                case -1980587809:
                    list = listM198932d13;
                    list2 = listM198932d14;
                    if (str.equals("debug_signals")) {
                        jSONObjectM198936h2 = v0t0.m198936h(jsonReader);
                    } else {
                        jsonReader.skipValue();
                    }
                    listM198932d14 = list2;
                    listM198932d13 = list;
                    break;
                case -1965512151:
                    list = listM198932d13;
                    list2 = listM198932d14;
                    if (str.equals("omid_settings")) {
                        jSONObjectM198936h4 = v0t0.m198936h(jsonReader);
                    } else {
                        jsonReader.skipValue();
                    }
                    listM198932d14 = list2;
                    listM198932d13 = list;
                    break;
                case -1871425831:
                    list = listM198932d13;
                    list2 = listM198932d14;
                    if (str.equals("recursive_server_response_data")) {
                        strNextString16 = jsonReader.nextString();
                    } else {
                        jsonReader.skipValue();
                    }
                    listM198932d14 = list2;
                    listM198932d13 = list;
                    break;
                case -1843156475:
                    list = listM198932d13;
                    list2 = listM198932d14;
                    if (str.equals("is_consent")) {
                        zNextBoolean17 = jsonReader.nextBoolean();
                    } else {
                        jsonReader.skipValue();
                    }
                    listM198932d14 = list2;
                    listM198932d13 = list;
                    break;
                case -1812055556:
                    list = listM198932d13;
                    list2 = listM198932d14;
                    if (str.equals("play_prewarm_options")) {
                        x1t0VarM209104a = x1t0.m209104a(v0t0.m198936h(jsonReader));
                    } else {
                        jsonReader.skipValue();
                    }
                    listM198932d14 = list2;
                    listM198932d13 = list;
                    break;
                case -1785028569:
                    list = listM198932d13;
                    list2 = listM198932d14;
                    if (str.equals("parallel_key")) {
                        strNextString18 = jsonReader.nextString();
                    } else {
                        jsonReader.skipValue();
                    }
                    listM198932d14 = list2;
                    listM198932d13 = list;
                    break;
                case -1776946669:
                    list = listM198932d13;
                    list2 = listM198932d14;
                    if (str.equals("ad_source_name") && ((Boolean) sgs0.f168090O6.m115748l()).booleanValue()) {
                        strNextString11 = jsonReader.nextString();
                    } else {
                        jsonReader.skipValue();
                    }
                    listM198932d14 = list2;
                    listM198932d13 = list;
                    break;
                case -1662989631:
                    list = listM198932d13;
                    list2 = listM198932d14;
                    if (str.equals("is_interscroller")) {
                        zNextBoolean12 = jsonReader.nextBoolean();
                    } else {
                        jsonReader.skipValue();
                    }
                    listM198932d14 = list2;
                    listM198932d13 = list;
                    break;
                case -1620470467:
                    list = listM198932d13;
                    list2 = listM198932d14;
                    if (str.equals("backend_query_id")) {
                        strNextString8 = jsonReader.nextString();
                    } else {
                        jsonReader.skipValue();
                    }
                    listM198932d14 = list2;
                    listM198932d13 = list;
                    break;
                case -1550155393:
                    list = listM198932d13;
                    list2 = listM198932d14;
                    if (!str.equals("nofill_urls")) {
                        listM198932d14 = list2;
                        listM198932d13 = list;
                    } else {
                        listM198932d13 = v0t0.m198932d(jsonReader);
                        listM198932d14 = list2;
                    }
                    break;
                case -1440104884:
                    list = listM198932d13;
                    list2 = listM198932d14;
                    if (str.equals("is_custom_close_blocked")) {
                        zNextBoolean6 = jsonReader.nextBoolean();
                    } else {
                        jsonReader.skipValue();
                    }
                    listM198932d14 = list2;
                    listM198932d13 = list;
                    break;
                case -1439500848:
                    list = listM198932d13;
                    list2 = listM198932d14;
                    if (str.equals(Constants.KEY_ORIENTATION)) {
                        iM175622d = m175622d(jsonReader.nextString());
                    } else {
                        jsonReader.skipValue();
                    }
                    listM198932d14 = list2;
                    listM198932d13 = list;
                    break;
                case -1428969291:
                    list = listM198932d13;
                    list2 = listM198932d14;
                    if (str.equals("enable_omid")) {
                        zNextBoolean8 = jsonReader.nextBoolean();
                    } else {
                        jsonReader.skipValue();
                    }
                    listM198932d14 = list2;
                    listM198932d13 = list;
                    break;
                case -1406227629:
                    list = listM198932d13;
                    list2 = listM198932d14;
                    if (str.equals("buffer_click_url_as_ready_to_ping")) {
                        zNextBoolean16 = jsonReader.nextBoolean();
                    } else {
                        jsonReader.skipValue();
                    }
                    listM198932d14 = list2;
                    listM198932d13 = list;
                    break;
                case -1403779768:
                    list = listM198932d13;
                    list2 = listM198932d14;
                    if (str.equals("showable_impression_type")) {
                        iNextInt2 = jsonReader.nextInt();
                    } else {
                        jsonReader.skipValue();
                    }
                    listM198932d14 = list2;
                    listM198932d13 = list;
                    break;
                case -1375413093:
                    list = listM198932d13;
                    list2 = listM198932d14;
                    if (str.equals("ad_cover")) {
                        jSONObjectM198936h5 = v0t0.m198936h(jsonReader);
                    } else {
                        jsonReader.skipValue();
                    }
                    listM198932d14 = list2;
                    listM198932d13 = list;
                    break;
                case -1360811658:
                    list = listM198932d13;
                    list2 = listM198932d14;
                    if (str.equals("ad_sizes")) {
                        listM180055a = r6w0.m180055a(jsonReader);
                    } else {
                        jsonReader.skipValue();
                    }
                    listM198932d14 = list2;
                    listM198932d13 = list;
                    break;
                case -1306015996:
                    list = listM198932d13;
                    list2 = listM198932d14;
                    if (str.equals("adapters")) {
                        listM198932d2 = v0t0.m198932d(jsonReader);
                    } else {
                        jsonReader.skipValue();
                    }
                    listM198932d14 = list2;
                    listM198932d13 = list;
                    break;
                case -1303332046:
                    list = listM198932d13;
                    list2 = listM198932d14;
                    if (str.equals("test_mode_enabled")) {
                        zNextBoolean5 = jsonReader.nextBoolean();
                    } else {
                        jsonReader.skipValue();
                    }
                    listM198932d14 = list2;
                    listM198932d13 = list;
                    break;
                case -1289032093:
                    list = listM198932d13;
                    list2 = listM198932d14;
                    if (str.equals("extras")) {
                        jSONObjectM198936h3 = v0t0.m198936h(jsonReader);
                    } else {
                        jsonReader.skipValue();
                    }
                    listM198932d14 = list2;
                    listM198932d13 = list;
                    break;
                case -1240082064:
                    list = listM198932d13;
                    list2 = listM198932d14;
                    if (str.equals("ad_event_value")) {
                        zzsVarM12312g = zzs.m12312g(v0t0.m198936h(jsonReader));
                    } else {
                        jsonReader.skipValue();
                    }
                    listM198932d14 = list2;
                    listM198932d13 = list;
                    break;
                case -1234181075:
                    list = listM198932d13;
                    list2 = listM198932d14;
                    if (str.equals("allow_pub_rendered_attribution")) {
                        zNextBoolean = jsonReader.nextBoolean();
                    } else {
                        jsonReader.skipValue();
                    }
                    listM198932d14 = list2;
                    listM198932d13 = list;
                    break;
                case -1168140544:
                    list = listM198932d13;
                    list2 = listM198932d14;
                    if (str.equals("presentation_error_urls")) {
                        listM198932d14 = v0t0.m198932d(jsonReader);
                    } else {
                        jsonReader.skipValue();
                        listM198932d14 = list2;
                    }
                    listM198932d13 = list;
                    break;
                case -1152230954:
                    list = listM198932d13;
                    list2 = listM198932d14;
                    if (str.equals(AdRevenueScheme.AD_TYPE)) {
                        iM175620b = m175620b(jsonReader.nextString());
                    } else {
                        jsonReader.skipValue();
                    }
                    listM198932d14 = list2;
                    listM198932d13 = list;
                    break;
                case -1146534047:
                    list = listM198932d13;
                    list2 = listM198932d14;
                    if (str.equals("is_scroll_aware")) {
                        zNextBoolean10 = jsonReader.nextBoolean();
                    } else {
                        jsonReader.skipValue();
                    }
                    listM198932d14 = list2;
                    listM198932d13 = list;
                    break;
                case -1115838944:
                    list = listM198932d13;
                    list2 = listM198932d14;
                    if (str.equals("fill_urls")) {
                        listM198932d12 = v0t0.m198932d(jsonReader);
                    } else {
                        jsonReader.skipValue();
                    }
                    listM198932d14 = list2;
                    listM198932d13 = list;
                    break;
                case -1081936678:
                    list = listM198932d13;
                    list2 = listM198932d14;
                    if (str.equals("allocation_id")) {
                        strNextString2 = jsonReader.nextString();
                    } else {
                        jsonReader.skipValue();
                    }
                    listM198932d14 = list2;
                    listM198932d13 = list;
                    break;
                case -1078050970:
                    list = listM198932d13;
                    list2 = listM198932d14;
                    if (str.equals("video_complete_urls")) {
                        listM198932d11 = v0t0.m198932d(jsonReader);
                    } else {
                        jsonReader.skipValue();
                    }
                    listM198932d14 = list2;
                    listM198932d13 = list;
                    break;
                case -1051269058:
                    list = listM198932d13;
                    list2 = listM198932d14;
                    if (str.equals("active_view")) {
                        string = v0t0.m198936h(jsonReader).toString();
                    } else {
                        jsonReader.skipValue();
                    }
                    listM198932d14 = list2;
                    listM198932d13 = list;
                    break;
                case -982608540:
                    list = listM198932d13;
                    list2 = listM198932d14;
                    if (str.equals("valid_from_timestamp")) {
                        strNextString20 = jsonReader.nextString();
                    } else {
                        jsonReader.skipValue();
                    }
                    listM198932d14 = list2;
                    listM198932d13 = list;
                    break;
                case -972056451:
                    list = listM198932d13;
                    list2 = listM198932d14;
                    if (str.equals("ad_source_instance_id") && ((Boolean) sgs0.f168090O6.m115748l()).booleanValue()) {
                        strNextString14 = jsonReader.nextString();
                    } else {
                        jsonReader.skipValue();
                    }
                    listM198932d14 = list2;
                    listM198932d13 = list;
                    break;
                case -776859333:
                    list = listM198932d13;
                    list2 = listM198932d14;
                    if (str.equals("click_urls")) {
                        listM198932d6 = v0t0.m198932d(jsonReader);
                    } else {
                        jsonReader.skipValue();
                    }
                    listM198932d14 = list2;
                    listM198932d13 = list;
                    break;
                case -570101180:
                    list = listM198932d13;
                    list2 = listM198932d14;
                    if (str.equals("late_load_urls")) {
                        listM198932d5 = v0t0.m198932d(jsonReader);
                    } else {
                        jsonReader.skipValue();
                    }
                    listM198932d14 = list2;
                    listM198932d13 = list;
                    break;
                case -544216775:
                    list = listM198932d13;
                    list2 = listM198932d14;
                    if (str.equals("safe_browsing")) {
                        zzcbpVarM13611g = zzcbp.m13611g(v0t0.m198936h(jsonReader));
                    } else {
                        jsonReader.skipValue();
                    }
                    listM198932d14 = list2;
                    listM198932d13 = list;
                    break;
                case -437057161:
                    list = listM198932d13;
                    list2 = listM198932d14;
                    if (str.equals("imp_urls")) {
                        listM198932d7 = v0t0.m198932d(jsonReader);
                    } else {
                        jsonReader.skipValue();
                    }
                    listM198932d14 = list2;
                    listM198932d13 = list;
                    break;
                case -404433734:
                    list = listM198932d13;
                    list2 = listM198932d14;
                    if (str.equals("rtb_native_required_assets")) {
                        jSONObjectM198936h6 = v0t0.m198936h(jsonReader);
                    } else {
                        jsonReader.skipValue();
                    }
                    listM198932d14 = list2;
                    listM198932d13 = list;
                    break;
                case -404326515:
                    list = listM198932d13;
                    list2 = listM198932d14;
                    if (str.equals("render_timeout_ms")) {
                        iNextInt = jsonReader.nextInt();
                    } else {
                        jsonReader.skipValue();
                    }
                    listM198932d14 = list2;
                    listM198932d13 = list;
                    break;
                case -397704715:
                    list = listM198932d13;
                    list2 = listM198932d14;
                    if (str.equals("ad_close_time_ms")) {
                        iNextInt5 = jsonReader.nextInt();
                    } else {
                        jsonReader.skipValue();
                    }
                    listM198932d14 = list2;
                    listM198932d13 = list;
                    break;
                case -388807511:
                    list = listM198932d13;
                    list2 = listM198932d14;
                    if (str.equals("content_url")) {
                        strNextString19 = jsonReader.nextString();
                    } else {
                        jsonReader.skipValue();
                    }
                    listM198932d14 = list2;
                    listM198932d13 = list;
                    break;
                case -369773488:
                    list = listM198932d13;
                    list2 = listM198932d14;
                    if (str.equals("is_close_button_enabled")) {
                        jsonReader.nextBoolean();
                    } else {
                        jsonReader.skipValue();
                    }
                    listM198932d14 = list2;
                    listM198932d13 = list;
                    break;
                case -213449460:
                    list = listM198932d13;
                    list2 = listM198932d14;
                    if (str.equals("force_disable_hardware_acceleration")) {
                        zNextBoolean15 = jsonReader.nextBoolean();
                    } else {
                        jsonReader.skipValue();
                    }
                    listM198932d14 = list2;
                    listM198932d13 = list;
                    break;
                case -213424028:
                    list = listM198932d13;
                    list2 = listM198932d14;
                    if (str.equals("watermark")) {
                        strNextString7 = jsonReader.nextString();
                    } else {
                        jsonReader.skipValue();
                    }
                    listM198932d14 = list2;
                    listM198932d13 = list;
                    break;
                case -180214626:
                    list = listM198932d13;
                    list2 = listM198932d14;
                    if (str.equals("native_required_asset_viewability")) {
                        zNextBoolean14 = jsonReader.nextBoolean();
                    } else {
                        jsonReader.skipValue();
                    }
                    listM198932d14 = list2;
                    listM198932d13 = list;
                    break;
                case -154616268:
                    list = listM198932d13;
                    list2 = listM198932d14;
                    if (str.equals("is_offline_ad")) {
                        zNextBoolean13 = jsonReader.nextBoolean();
                    } else {
                        jsonReader.skipValue();
                    }
                    listM198932d14 = list2;
                    listM198932d13 = list;
                    break;
                case -29338502:
                    list = listM198932d13;
                    list2 = listM198932d14;
                    if (str.equals("allow_custom_click_gesture")) {
                        zNextBoolean3 = jsonReader.nextBoolean();
                    } else {
                        jsonReader.skipValue();
                    }
                    listM198932d14 = list2;
                    listM198932d13 = list;
                    break;
                case 3107:
                    list = listM198932d13;
                    list2 = listM198932d14;
                    if (str.equals("ad")) {
                        u6w0Var = new u6w0(jsonReader);
                    } else {
                        jsonReader.skipValue();
                    }
                    listM198932d14 = list2;
                    listM198932d13 = list;
                    break;
                case 3355:
                    list = listM198932d13;
                    list2 = listM198932d14;
                    if (str.equals("id")) {
                        strNextString3 = jsonReader.nextString();
                    } else {
                        jsonReader.skipValue();
                    }
                    listM198932d14 = list2;
                    listM198932d13 = list;
                    break;
                case 3076010:
                    list = listM198932d13;
                    list2 = listM198932d14;
                    if (str.equals("data")) {
                        jSONObjectM198936h = v0t0.m198936h(jsonReader);
                    } else {
                        jsonReader.skipValue();
                    }
                    listM198932d14 = list2;
                    listM198932d13 = list;
                    break;
                case 37109963:
                    list = listM198932d13;
                    list2 = listM198932d14;
                    if (str.equals("request_id")) {
                        strNextString15 = jsonReader.nextString();
                    } else {
                        jsonReader.skipValue();
                    }
                    listM198932d14 = list2;
                    listM198932d13 = list;
                    break;
                case 63195984:
                    list = listM198932d13;
                    list2 = listM198932d14;
                    if (str.equals("render_test_label")) {
                        zNextBoolean4 = jsonReader.nextBoolean();
                    } else {
                        jsonReader.skipValue();
                    }
                    listM198932d14 = list2;
                    listM198932d13 = list;
                    break;
                case 107433883:
                    list = listM198932d13;
                    list2 = listM198932d14;
                    if (str.equals("qdata")) {
                        strNextString4 = jsonReader.nextString();
                    } else {
                        jsonReader.skipValue();
                    }
                    listM198932d14 = list2;
                    listM198932d13 = list;
                    break;
                case 230323073:
                    list = listM198932d13;
                    list2 = listM198932d14;
                    if (str.equals("ad_load_urls")) {
                        listM198932d8 = v0t0.m198932d(jsonReader);
                    } else {
                        jsonReader.skipValue();
                    }
                    listM198932d14 = list2;
                    listM198932d13 = list;
                    break;
                case 418392395:
                    list = listM198932d13;
                    list2 = listM198932d14;
                    if (str.equals("is_closable_area_disabled")) {
                        zNextBoolean7 = jsonReader.nextBoolean();
                    } else {
                        jsonReader.skipValue();
                    }
                    listM198932d14 = list2;
                    listM198932d13 = list;
                    break;
                case 542250332:
                    list = listM198932d13;
                    list2 = listM198932d14;
                    if (str.equals("consent_form_action_identifier")) {
                        iNextInt3 = jsonReader.nextInt();
                    } else {
                        jsonReader.skipValue();
                    }
                    listM198932d14 = list2;
                    listM198932d13 = list;
                    break;
                case 549176928:
                    list = listM198932d13;
                    list2 = listM198932d14;
                    if (str.equals("presentation_error_timeout_ms")) {
                        iNextInt4 = jsonReader.nextInt();
                    } else {
                        jsonReader.skipValue();
                    }
                    listM198932d14 = list2;
                    listM198932d13 = list;
                    break;
                case 597473788:
                    list = listM198932d13;
                    list2 = listM198932d14;
                    if (str.equals("debug_dialog_string")) {
                        strNextString5 = jsonReader.nextString();
                    } else {
                        jsonReader.skipValue();
                    }
                    listM198932d14 = list2;
                    listM198932d13 = list;
                    break;
                case 754887508:
                    list = listM198932d13;
                    list2 = listM198932d14;
                    if (str.equals("container_sizes")) {
                        listM180055a2 = r6w0.m180055a(jsonReader);
                    } else {
                        jsonReader.skipValue();
                    }
                    listM198932d14 = list2;
                    listM198932d13 = list;
                    break;
                case 791122864:
                    list = listM198932d13;
                    list2 = listM198932d14;
                    if (str.equals("impression_type")) {
                        iM175621c = m175621c(jsonReader.nextInt());
                    } else {
                        jsonReader.skipValue();
                    }
                    listM198932d14 = list2;
                    listM198932d13 = list;
                    break;
                case 1010584092:
                    list = listM198932d13;
                    list2 = listM198932d14;
                    if (str.equals(FirebaseAnalytics.Param.TRANSACTION_ID)) {
                        strNextString = jsonReader.nextString();
                    } else {
                        jsonReader.skipValue();
                    }
                    listM198932d14 = list2;
                    listM198932d13 = list;
                    break;
                case 1100650276:
                    list = listM198932d13;
                    list2 = listM198932d14;
                    if (str.equals("rewards")) {
                        zzcagVarM13610g = zzcag.m13610g(v0t0.m198933e(jsonReader));
                    } else {
                        jsonReader.skipValue();
                    }
                    listM198932d14 = list2;
                    listM198932d13 = list;
                    break;
                case 1141602460:
                    list = listM198932d13;
                    list2 = listM198932d14;
                    if (str.equals("adapter_response_info_key")) {
                        strNextString17 = jsonReader.nextString();
                    } else {
                        jsonReader.skipValue();
                    }
                    listM198932d14 = list2;
                    listM198932d13 = list;
                    break;
                case 1186014765:
                    list = listM198932d13;
                    list2 = listM198932d14;
                    if (str.equals("cache_hit_urls")) {
                        listM198932d4 = v0t0.m198932d(jsonReader);
                    } else {
                        jsonReader.skipValue();
                    }
                    listM198932d14 = list2;
                    listM198932d13 = list;
                    break;
                case 1321720943:
                    list = listM198932d13;
                    list2 = listM198932d14;
                    if (str.equals("allow_pub_owned_ad_view")) {
                        zNextBoolean2 = jsonReader.nextBoolean();
                    } else {
                        jsonReader.skipValue();
                    }
                    listM198932d14 = list2;
                    listM198932d13 = list;
                    break;
                case 1437255331:
                    list = listM198932d13;
                    list2 = listM198932d14;
                    if (str.equals("ad_source_id") && ((Boolean) sgs0.f168090O6.m115748l()).booleanValue()) {
                        strNextString12 = jsonReader.nextString();
                    } else {
                        jsonReader.skipValue();
                    }
                    listM198932d14 = list2;
                    listM198932d13 = list;
                    break;
                case 1637553475:
                    list = listM198932d13;
                    list2 = listM198932d14;
                    if (str.equals("bid_response")) {
                        strNextString6 = jsonReader.nextString();
                    } else {
                        jsonReader.skipValue();
                    }
                    listM198932d14 = list2;
                    listM198932d13 = list;
                    break;
                case 1638957285:
                    list = listM198932d13;
                    list2 = listM198932d14;
                    if (str.equals("video_start_urls")) {
                        listM198932d9 = v0t0.m198932d(jsonReader);
                    } else {
                        jsonReader.skipValue();
                    }
                    listM198932d14 = list2;
                    listM198932d13 = list;
                    break;
                case 1686319423:
                    list = listM198932d13;
                    list2 = listM198932d14;
                    if (str.equals("ad_network_class_name")) {
                        strNextString10 = jsonReader.nextString();
                    } else {
                        jsonReader.skipValue();
                    }
                    listM198932d14 = list2;
                    listM198932d13 = list;
                    break;
                case 1688341040:
                    list = listM198932d13;
                    list2 = listM198932d14;
                    if (str.equals("video_reward_urls")) {
                        listM198932d10 = v0t0.m198932d(jsonReader);
                    } else {
                        jsonReader.skipValue();
                    }
                    listM198932d14 = list2;
                    listM198932d13 = list;
                    break;
                case 1799285870:
                    list = listM198932d13;
                    list2 = listM198932d14;
                    if (str.equals("use_third_party_container_height")) {
                        zNextBoolean11 = jsonReader.nextBoolean();
                    } else {
                        jsonReader.skipValue();
                    }
                    listM198932d14 = list2;
                    listM198932d13 = list;
                    break;
                case 1839650832:
                    list = listM198932d13;
                    list2 = listM198932d14;
                    if (str.equals("renderers")) {
                        listM198932d = v0t0.m198932d(jsonReader);
                    } else {
                        jsonReader.skipValue();
                    }
                    listM198932d14 = list2;
                    listM198932d13 = list;
                    break;
                case 1875425491:
                    list = listM198932d13;
                    list2 = listM198932d14;
                    if (str.equals("is_analytics_logging_enabled")) {
                        zNextBoolean9 = jsonReader.nextBoolean();
                    } else {
                        jsonReader.skipValue();
                    }
                    listM198932d14 = list2;
                    listM198932d13 = list;
                    break;
                case 2068142375:
                    list = listM198932d13;
                    list2 = listM198932d14;
                    if (str.equals("rule_line_external_id")) {
                        strNextString9 = jsonReader.nextString();
                    } else {
                        jsonReader.skipValue();
                    }
                    listM198932d14 = list2;
                    listM198932d13 = list;
                    break;
                case 2072888499:
                    list2 = listM198932d14;
                    list = listM198932d13;
                    if (str.equals("manual_tracking_urls")) {
                        listM198932d3 = v0t0.m198932d(jsonReader);
                    } else {
                        jsonReader.skipValue();
                    }
                    listM198932d14 = list2;
                    listM198932d13 = list;
                    break;
                default:
                    list = listM198932d13;
                    list2 = listM198932d14;
                    jsonReader.skipValue();
                    listM198932d14 = list2;
                    listM198932d13 = list;
                    break;
            }
        }
        jsonReader.endObject();
        this.f155873a = listM198932d;
        this.f155875b = iM175620b;
        this.f155877c = listM198932d6;
        this.f155879d = listM198932d7;
        this.f155885g = listM198932d8;
        this.f155883f = iM175621c;
        this.f155887h = listM198932d9;
        this.f155889i = listM198932d10;
        this.f155891j = listM198932d11;
        this.f155893k = strNextString;
        this.f155895l = strNextString20;
        this.f155897m = zzcagVarM13610g;
        this.f155899n = listM198932d12;
        this.f155901o = listM198932d13;
        this.f155903p = listM198932d14;
        this.f155905q = listM198932d3;
        this.f155907r = iNextInt4;
        this.f155909s = listM180055a2;
        this.f155911t = u6w0Var;
        this.f155913u = listM198932d2;
        this.f155915v = listM180055a;
        this.f155917x = strNextString2;
        this.f155916w = jSONObjectM198936h;
        this.f155918y = strNextString3;
        this.f155919z = strNextString4;
        this.f155847A = string;
        this.f155848B = zzcbpVarM13611g;
        this.f155849C = strNextString5;
        this.f155850D = jSONObjectM198936h2;
        this.f155851E = jSONObjectM198936h3;
        this.f155857K = zNextBoolean;
        this.f155858L = zNextBoolean2;
        this.f155859M = zNextBoolean3;
        this.f155860N = zNextBoolean4;
        this.f155861O = zNextBoolean5;
        this.f155862P = zNextBoolean6;
        this.f155863Q = zNextBoolean7;
        this.f155864R = iM175622d;
        this.f155865S = iNextInt;
        this.f155867U = zNextBoolean8;
        this.f155868V = strNextString6;
        this.f155869W = new r7w0(jSONObjectM198936h4);
        this.f155870X = zNextBoolean9;
        this.f155871Y = zNextBoolean10;
        this.f155872Z = iNextInt2;
        this.f155874a0 = strNextString7;
        this.f155876b0 = iNextInt5;
        this.f155878c0 = strNextString8;
        this.f155880d0 = zNextBoolean11;
        this.f155882e0 = x1t0VarM209104a;
        this.f155884f0 = zzsVarM12312g;
        this.f155886g0 = strNextString9;
        this.f155888h0 = zNextBoolean12;
        this.f155890i0 = jSONObjectM198936h5;
        this.f155852F = strNextString10;
        this.f155853G = strNextString11;
        this.f155854H = strNextString12;
        this.f155855I = strNextString13;
        this.f155856J = strNextString14;
        this.f155892j0 = zNextBoolean13;
        this.f155894k0 = jSONObjectM198936h6;
        this.f155896l0 = zNextBoolean14;
        this.f155898m0 = strNextString19;
        this.f155900n0 = zNextBoolean15;
        this.f155881e = listM198932d4;
        this.f155866T = zNextBoolean16;
        this.f155902o0 = strNextString15;
        this.f155904p0 = strNextString16;
        this.f155906q0 = strNextString17;
        this.f155908r0 = zNextBoolean17;
        this.f155910s0 = iNextInt3;
        this.f155914u0 = listM198932d5;
        this.f155912t0 = strNextString18;
    }

    /* JADX INFO: renamed from: a */
    public static String m175619a(int i) {
        switch (i) {
            case 1:
                return "BANNER";
            case 2:
                return "INTERSTITIAL";
            case 3:
                return "NATIVE_EXPRESS";
            case 4:
                return "NATIVE";
            case 5:
                return "REWARDED";
            case 6:
                return "APP_OPEN_AD";
            case 7:
                return "REWARDED_INTERSTITIAL";
            default:
                return "UNKNOWN";
        }
    }

    /* JADX INFO: renamed from: b */
    public static int m175620b(String str) {
        if ("banner".equals(str)) {
            return 1;
        }
        if ("interstitial".equals(str)) {
            return 2;
        }
        if ("native_express".equals(str)) {
            return 3;
        }
        if ("native".equals(str)) {
            return 4;
        }
        if ("rewarded".equals(str)) {
            return 5;
        }
        if ("app_open_ad".equals(str)) {
            return 6;
        }
        return "rewarded_interstitial".equals(str) ? 7 : 0;
    }

    /* JADX INFO: renamed from: c */
    public static int m175621c(int i) {
        if (i == 0 || i == 1 || i == 3) {
            return i;
        }
        return 0;
    }

    /* JADX INFO: renamed from: d */
    public static final int m175622d(String str) {
        if ("landscape".equalsIgnoreCase(str)) {
            return 6;
        }
        return Portrait.TYPE.equalsIgnoreCase(str) ? 7 : -1;
    }
}
