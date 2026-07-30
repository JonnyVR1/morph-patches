package p149l;

import android.util.JsonReader;
import androidx.annotation.Nullable;
import com.appsflyer.AdRevenueScheme;
import com.clevertap.android.sdk.Constants;
import com.google.android.gms.ads.internal.client.zzs;
import com.google.android.gms.internal.ads.zzcag;
import com.google.android.gms.internal.ads.zzcbp;
import com.google.android.gms.internal.ads.zzgaa;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.p046p1.mobile.putong.core.data.Portrait;
import java.io.IOException;
import java.util.Collections;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public final class kxv0 {

    /* JADX INFO: renamed from: A */
    public final String f125157A;

    /* JADX INFO: renamed from: B */
    public final zzcbp f125158B;

    /* JADX INFO: renamed from: C */
    public final String f125159C;

    /* JADX INFO: renamed from: D */
    public final JSONObject f125160D;

    /* JADX INFO: renamed from: E */
    public final JSONObject f125161E;

    /* JADX INFO: renamed from: F */
    public final String f125162F;

    /* JADX INFO: renamed from: G */
    public final String f125163G;

    /* JADX INFO: renamed from: H */
    public final String f125164H;

    /* JADX INFO: renamed from: I */
    public final String f125165I;

    /* JADX INFO: renamed from: J */
    public final String f125166J;

    /* JADX INFO: renamed from: K */
    public final boolean f125167K;

    /* JADX INFO: renamed from: L */
    public final boolean f125168L;

    /* JADX INFO: renamed from: M */
    public final boolean f125169M;

    /* JADX INFO: renamed from: N */
    public final boolean f125170N;

    /* JADX INFO: renamed from: O */
    public final boolean f125171O;

    /* JADX INFO: renamed from: P */
    public final boolean f125172P;

    /* JADX INFO: renamed from: Q */
    public final boolean f125173Q;

    /* JADX INFO: renamed from: R */
    public final int f125174R;

    /* JADX INFO: renamed from: S */
    public final int f125175S;

    /* JADX INFO: renamed from: T */
    public final boolean f125176T;

    /* JADX INFO: renamed from: U */
    public final boolean f125177U;

    /* JADX INFO: renamed from: V */
    public final String f125178V;

    /* JADX INFO: renamed from: W */
    public final lyv0 f125179W;

    /* JADX INFO: renamed from: X */
    public final boolean f125180X;

    /* JADX INFO: renamed from: Y */
    public final boolean f125181Y;

    /* JADX INFO: renamed from: Z */
    public final int f125182Z;

    /* JADX INFO: renamed from: a */
    public final List f125183a;

    /* JADX INFO: renamed from: a0 */
    public final String f125184a0;

    /* JADX INFO: renamed from: b */
    public final int f125185b;

    /* JADX INFO: renamed from: b0 */
    public final int f125186b0;

    /* JADX INFO: renamed from: c */
    public final List f125187c;

    /* JADX INFO: renamed from: c0 */
    public final String f125188c0;

    /* JADX INFO: renamed from: d */
    public final List f125189d;

    /* JADX INFO: renamed from: d0 */
    public final boolean f125190d0;

    /* JADX INFO: renamed from: e */
    public final List f125191e;

    /* JADX INFO: renamed from: e0 */
    public final rss0 f125192e0;

    /* JADX INFO: renamed from: f */
    public final int f125193f;

    /* JADX INFO: renamed from: f0 */
    @Nullable
    public final zzs f125194f0;

    /* JADX INFO: renamed from: g */
    public final List f125195g;

    /* JADX INFO: renamed from: g0 */
    public final String f125196g0;

    /* JADX INFO: renamed from: h */
    public final List f125197h;

    /* JADX INFO: renamed from: h0 */
    public final boolean f125198h0;

    /* JADX INFO: renamed from: i */
    public final List f125199i;

    /* JADX INFO: renamed from: i0 */
    public final JSONObject f125200i0;

    /* JADX INFO: renamed from: j */
    public final List f125201j;

    /* JADX INFO: renamed from: j0 */
    public final boolean f125202j0;

    /* JADX INFO: renamed from: k */
    public final String f125203k;

    /* JADX INFO: renamed from: k0 */
    public final JSONObject f125204k0;

    /* JADX INFO: renamed from: l */
    public final String f125205l;

    /* JADX INFO: renamed from: l0 */
    public final boolean f125206l0;

    /* JADX INFO: renamed from: m */
    @Nullable
    public final zzcag f125207m;

    /* JADX INFO: renamed from: m0 */
    @Nullable
    public final String f125208m0;

    /* JADX INFO: renamed from: n */
    public final List f125209n;

    /* JADX INFO: renamed from: n0 */
    public final boolean f125210n0;

    /* JADX INFO: renamed from: o */
    public final List f125211o;

    /* JADX INFO: renamed from: o0 */
    public final String f125212o0;

    /* JADX INFO: renamed from: p */
    public final List f125213p;

    /* JADX INFO: renamed from: p0 */
    public final String f125214p0;

    /* JADX INFO: renamed from: q */
    public final List f125215q;

    /* JADX INFO: renamed from: q0 */
    public final String f125216q0;

    /* JADX INFO: renamed from: r */
    public final int f125217r;

    /* JADX INFO: renamed from: r0 */
    public final boolean f125218r0;

    /* JADX INFO: renamed from: s */
    public final List f125219s;

    /* JADX INFO: renamed from: s0 */
    public final int f125220s0;

    /* JADX INFO: renamed from: t */
    @Nullable
    public final oxv0 f125221t;

    /* JADX INFO: renamed from: t0 */
    public final String f125222t0;

    /* JADX INFO: renamed from: u */
    public final List f125223u;

    /* JADX INFO: renamed from: u0 */
    public final List f125224u0;

    /* JADX INFO: renamed from: v */
    public final List f125225v;

    /* JADX INFO: renamed from: w */
    public final JSONObject f125226w;

    /* JADX INFO: renamed from: x */
    public final String f125227x;

    /* JADX INFO: renamed from: y */
    public final String f125228y;

    /* JADX INFO: renamed from: z */
    public final String f125229z;

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
    public kxv0(JsonReader jsonReader) throws IllegalStateException, JSONException, IOException, NumberFormatException {
        List list;
        List list2;
        List listM171063d = Collections.EMPTY_LIST;
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        JSONObject jSONObject3 = new JSONObject();
        JSONObject jSONObject4 = new JSONObject();
        JSONObject jSONObject5 = new JSONObject();
        JSONObject jSONObject6 = new JSONObject();
        zzgaa zzgaaVarZzl = zzgaa.zzl();
        zzgaa zzgaaVarZzl2 = zzgaa.zzl();
        jsonReader.beginObject();
        List listM152103a = listM171063d;
        List listM171063d2 = listM152103a;
        List listM152103a2 = listM171063d2;
        List listM171063d3 = listM152103a2;
        JSONObject jSONObjectM171067h = jSONObject;
        JSONObject jSONObjectM171067h2 = jSONObject2;
        JSONObject jSONObjectM171067h3 = jSONObject3;
        JSONObject jSONObjectM171067h4 = jSONObject4;
        JSONObject jSONObjectM171067h5 = jSONObject5;
        JSONObject jSONObjectM171067h6 = jSONObject6;
        List listM171063d4 = zzgaaVarZzl;
        List listM171063d5 = zzgaaVarZzl2;
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
        int iM147811c = 0;
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
        oxv0 oxv0Var = null;
        zzcbp zzcbpVarM13557g = null;
        rss0 rss0VarM180718a = null;
        zzs zzsVarM12258g = null;
        String strNextString19 = null;
        int iM147812d = -1;
        int iNextInt5 = -1;
        List listM171063d6 = listM171063d3;
        List listM171063d7 = listM171063d6;
        List listM171063d8 = listM171063d7;
        List listM171063d9 = listM171063d8;
        List listM171063d10 = listM171063d9;
        List listM171063d11 = listM171063d10;
        List listM171063d12 = listM171063d11;
        List listM171063d13 = listM171063d12;
        List listM171063d14 = listM171063d13;
        String strNextString20 = strNextString18;
        int iM147810b = 0;
        zzcag zzcagVarM13556g = null;
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            String str = strNextName == null ? strNextString : strNextName;
            switch (str.hashCode()) {
                case -2138196627:
                    list = listM171063d13;
                    list2 = listM171063d14;
                    if (str.equals("ad_source_instance_name") && ((Boolean) m7s0.f132019O6.m207207l()).booleanValue()) {
                        strNextString13 = jsonReader.nextString();
                    } else {
                        jsonReader.skipValue();
                    }
                    listM171063d14 = list2;
                    listM171063d13 = list;
                    break;
                case -1980587809:
                    list = listM171063d13;
                    list2 = listM171063d14;
                    if (str.equals("debug_signals")) {
                        jSONObjectM171067h2 = prs0.m171067h(jsonReader);
                    } else {
                        jsonReader.skipValue();
                    }
                    listM171063d14 = list2;
                    listM171063d13 = list;
                    break;
                case -1965512151:
                    list = listM171063d13;
                    list2 = listM171063d14;
                    if (str.equals("omid_settings")) {
                        jSONObjectM171067h4 = prs0.m171067h(jsonReader);
                    } else {
                        jsonReader.skipValue();
                    }
                    listM171063d14 = list2;
                    listM171063d13 = list;
                    break;
                case -1871425831:
                    list = listM171063d13;
                    list2 = listM171063d14;
                    if (str.equals("recursive_server_response_data")) {
                        strNextString16 = jsonReader.nextString();
                    } else {
                        jsonReader.skipValue();
                    }
                    listM171063d14 = list2;
                    listM171063d13 = list;
                    break;
                case -1843156475:
                    list = listM171063d13;
                    list2 = listM171063d14;
                    if (str.equals("is_consent")) {
                        zNextBoolean17 = jsonReader.nextBoolean();
                    } else {
                        jsonReader.skipValue();
                    }
                    listM171063d14 = list2;
                    listM171063d13 = list;
                    break;
                case -1812055556:
                    list = listM171063d13;
                    list2 = listM171063d14;
                    if (str.equals("play_prewarm_options")) {
                        rss0VarM180718a = rss0.m180718a(prs0.m171067h(jsonReader));
                    } else {
                        jsonReader.skipValue();
                    }
                    listM171063d14 = list2;
                    listM171063d13 = list;
                    break;
                case -1785028569:
                    list = listM171063d13;
                    list2 = listM171063d14;
                    if (str.equals("parallel_key")) {
                        strNextString18 = jsonReader.nextString();
                    } else {
                        jsonReader.skipValue();
                    }
                    listM171063d14 = list2;
                    listM171063d13 = list;
                    break;
                case -1776946669:
                    list = listM171063d13;
                    list2 = listM171063d14;
                    if (str.equals("ad_source_name") && ((Boolean) m7s0.f132019O6.m207207l()).booleanValue()) {
                        strNextString11 = jsonReader.nextString();
                    } else {
                        jsonReader.skipValue();
                    }
                    listM171063d14 = list2;
                    listM171063d13 = list;
                    break;
                case -1662989631:
                    list = listM171063d13;
                    list2 = listM171063d14;
                    if (str.equals("is_interscroller")) {
                        zNextBoolean12 = jsonReader.nextBoolean();
                    } else {
                        jsonReader.skipValue();
                    }
                    listM171063d14 = list2;
                    listM171063d13 = list;
                    break;
                case -1620470467:
                    list = listM171063d13;
                    list2 = listM171063d14;
                    if (str.equals("backend_query_id")) {
                        strNextString8 = jsonReader.nextString();
                    } else {
                        jsonReader.skipValue();
                    }
                    listM171063d14 = list2;
                    listM171063d13 = list;
                    break;
                case -1550155393:
                    list = listM171063d13;
                    list2 = listM171063d14;
                    if (!str.equals("nofill_urls")) {
                        listM171063d14 = list2;
                        listM171063d13 = list;
                    } else {
                        listM171063d13 = prs0.m171063d(jsonReader);
                        listM171063d14 = list2;
                    }
                    break;
                case -1440104884:
                    list = listM171063d13;
                    list2 = listM171063d14;
                    if (str.equals("is_custom_close_blocked")) {
                        zNextBoolean6 = jsonReader.nextBoolean();
                    } else {
                        jsonReader.skipValue();
                    }
                    listM171063d14 = list2;
                    listM171063d13 = list;
                    break;
                case -1439500848:
                    list = listM171063d13;
                    list2 = listM171063d14;
                    if (str.equals(Constants.KEY_ORIENTATION)) {
                        iM147812d = m147812d(jsonReader.nextString());
                    } else {
                        jsonReader.skipValue();
                    }
                    listM171063d14 = list2;
                    listM171063d13 = list;
                    break;
                case -1428969291:
                    list = listM171063d13;
                    list2 = listM171063d14;
                    if (str.equals("enable_omid")) {
                        zNextBoolean8 = jsonReader.nextBoolean();
                    } else {
                        jsonReader.skipValue();
                    }
                    listM171063d14 = list2;
                    listM171063d13 = list;
                    break;
                case -1406227629:
                    list = listM171063d13;
                    list2 = listM171063d14;
                    if (str.equals("buffer_click_url_as_ready_to_ping")) {
                        zNextBoolean16 = jsonReader.nextBoolean();
                    } else {
                        jsonReader.skipValue();
                    }
                    listM171063d14 = list2;
                    listM171063d13 = list;
                    break;
                case -1403779768:
                    list = listM171063d13;
                    list2 = listM171063d14;
                    if (str.equals("showable_impression_type")) {
                        iNextInt2 = jsonReader.nextInt();
                    } else {
                        jsonReader.skipValue();
                    }
                    listM171063d14 = list2;
                    listM171063d13 = list;
                    break;
                case -1375413093:
                    list = listM171063d13;
                    list2 = listM171063d14;
                    if (str.equals("ad_cover")) {
                        jSONObjectM171067h5 = prs0.m171067h(jsonReader);
                    } else {
                        jsonReader.skipValue();
                    }
                    listM171063d14 = list2;
                    listM171063d13 = list;
                    break;
                case -1360811658:
                    list = listM171063d13;
                    list2 = listM171063d14;
                    if (str.equals("ad_sizes")) {
                        listM152103a = lxv0.m152103a(jsonReader);
                    } else {
                        jsonReader.skipValue();
                    }
                    listM171063d14 = list2;
                    listM171063d13 = list;
                    break;
                case -1306015996:
                    list = listM171063d13;
                    list2 = listM171063d14;
                    if (str.equals("adapters")) {
                        listM171063d2 = prs0.m171063d(jsonReader);
                    } else {
                        jsonReader.skipValue();
                    }
                    listM171063d14 = list2;
                    listM171063d13 = list;
                    break;
                case -1303332046:
                    list = listM171063d13;
                    list2 = listM171063d14;
                    if (str.equals("test_mode_enabled")) {
                        zNextBoolean5 = jsonReader.nextBoolean();
                    } else {
                        jsonReader.skipValue();
                    }
                    listM171063d14 = list2;
                    listM171063d13 = list;
                    break;
                case -1289032093:
                    list = listM171063d13;
                    list2 = listM171063d14;
                    if (str.equals("extras")) {
                        jSONObjectM171067h3 = prs0.m171067h(jsonReader);
                    } else {
                        jsonReader.skipValue();
                    }
                    listM171063d14 = list2;
                    listM171063d13 = list;
                    break;
                case -1240082064:
                    list = listM171063d13;
                    list2 = listM171063d14;
                    if (str.equals("ad_event_value")) {
                        zzsVarM12258g = zzs.m12258g(prs0.m171067h(jsonReader));
                    } else {
                        jsonReader.skipValue();
                    }
                    listM171063d14 = list2;
                    listM171063d13 = list;
                    break;
                case -1234181075:
                    list = listM171063d13;
                    list2 = listM171063d14;
                    if (str.equals("allow_pub_rendered_attribution")) {
                        zNextBoolean = jsonReader.nextBoolean();
                    } else {
                        jsonReader.skipValue();
                    }
                    listM171063d14 = list2;
                    listM171063d13 = list;
                    break;
                case -1168140544:
                    list = listM171063d13;
                    list2 = listM171063d14;
                    if (str.equals("presentation_error_urls")) {
                        listM171063d14 = prs0.m171063d(jsonReader);
                    } else {
                        jsonReader.skipValue();
                        listM171063d14 = list2;
                    }
                    listM171063d13 = list;
                    break;
                case -1152230954:
                    list = listM171063d13;
                    list2 = listM171063d14;
                    if (str.equals(AdRevenueScheme.AD_TYPE)) {
                        iM147810b = m147810b(jsonReader.nextString());
                    } else {
                        jsonReader.skipValue();
                    }
                    listM171063d14 = list2;
                    listM171063d13 = list;
                    break;
                case -1146534047:
                    list = listM171063d13;
                    list2 = listM171063d14;
                    if (str.equals("is_scroll_aware")) {
                        zNextBoolean10 = jsonReader.nextBoolean();
                    } else {
                        jsonReader.skipValue();
                    }
                    listM171063d14 = list2;
                    listM171063d13 = list;
                    break;
                case -1115838944:
                    list = listM171063d13;
                    list2 = listM171063d14;
                    if (str.equals("fill_urls")) {
                        listM171063d12 = prs0.m171063d(jsonReader);
                    } else {
                        jsonReader.skipValue();
                    }
                    listM171063d14 = list2;
                    listM171063d13 = list;
                    break;
                case -1081936678:
                    list = listM171063d13;
                    list2 = listM171063d14;
                    if (str.equals("allocation_id")) {
                        strNextString2 = jsonReader.nextString();
                    } else {
                        jsonReader.skipValue();
                    }
                    listM171063d14 = list2;
                    listM171063d13 = list;
                    break;
                case -1078050970:
                    list = listM171063d13;
                    list2 = listM171063d14;
                    if (str.equals("video_complete_urls")) {
                        listM171063d11 = prs0.m171063d(jsonReader);
                    } else {
                        jsonReader.skipValue();
                    }
                    listM171063d14 = list2;
                    listM171063d13 = list;
                    break;
                case -1051269058:
                    list = listM171063d13;
                    list2 = listM171063d14;
                    if (str.equals("active_view")) {
                        string = prs0.m171067h(jsonReader).toString();
                    } else {
                        jsonReader.skipValue();
                    }
                    listM171063d14 = list2;
                    listM171063d13 = list;
                    break;
                case -982608540:
                    list = listM171063d13;
                    list2 = listM171063d14;
                    if (str.equals("valid_from_timestamp")) {
                        strNextString20 = jsonReader.nextString();
                    } else {
                        jsonReader.skipValue();
                    }
                    listM171063d14 = list2;
                    listM171063d13 = list;
                    break;
                case -972056451:
                    list = listM171063d13;
                    list2 = listM171063d14;
                    if (str.equals("ad_source_instance_id") && ((Boolean) m7s0.f132019O6.m207207l()).booleanValue()) {
                        strNextString14 = jsonReader.nextString();
                    } else {
                        jsonReader.skipValue();
                    }
                    listM171063d14 = list2;
                    listM171063d13 = list;
                    break;
                case -776859333:
                    list = listM171063d13;
                    list2 = listM171063d14;
                    if (str.equals("click_urls")) {
                        listM171063d6 = prs0.m171063d(jsonReader);
                    } else {
                        jsonReader.skipValue();
                    }
                    listM171063d14 = list2;
                    listM171063d13 = list;
                    break;
                case -570101180:
                    list = listM171063d13;
                    list2 = listM171063d14;
                    if (str.equals("late_load_urls")) {
                        listM171063d5 = prs0.m171063d(jsonReader);
                    } else {
                        jsonReader.skipValue();
                    }
                    listM171063d14 = list2;
                    listM171063d13 = list;
                    break;
                case -544216775:
                    list = listM171063d13;
                    list2 = listM171063d14;
                    if (str.equals("safe_browsing")) {
                        zzcbpVarM13557g = zzcbp.m13557g(prs0.m171067h(jsonReader));
                    } else {
                        jsonReader.skipValue();
                    }
                    listM171063d14 = list2;
                    listM171063d13 = list;
                    break;
                case -437057161:
                    list = listM171063d13;
                    list2 = listM171063d14;
                    if (str.equals("imp_urls")) {
                        listM171063d7 = prs0.m171063d(jsonReader);
                    } else {
                        jsonReader.skipValue();
                    }
                    listM171063d14 = list2;
                    listM171063d13 = list;
                    break;
                case -404433734:
                    list = listM171063d13;
                    list2 = listM171063d14;
                    if (str.equals("rtb_native_required_assets")) {
                        jSONObjectM171067h6 = prs0.m171067h(jsonReader);
                    } else {
                        jsonReader.skipValue();
                    }
                    listM171063d14 = list2;
                    listM171063d13 = list;
                    break;
                case -404326515:
                    list = listM171063d13;
                    list2 = listM171063d14;
                    if (str.equals("render_timeout_ms")) {
                        iNextInt = jsonReader.nextInt();
                    } else {
                        jsonReader.skipValue();
                    }
                    listM171063d14 = list2;
                    listM171063d13 = list;
                    break;
                case -397704715:
                    list = listM171063d13;
                    list2 = listM171063d14;
                    if (str.equals("ad_close_time_ms")) {
                        iNextInt5 = jsonReader.nextInt();
                    } else {
                        jsonReader.skipValue();
                    }
                    listM171063d14 = list2;
                    listM171063d13 = list;
                    break;
                case -388807511:
                    list = listM171063d13;
                    list2 = listM171063d14;
                    if (str.equals("content_url")) {
                        strNextString19 = jsonReader.nextString();
                    } else {
                        jsonReader.skipValue();
                    }
                    listM171063d14 = list2;
                    listM171063d13 = list;
                    break;
                case -369773488:
                    list = listM171063d13;
                    list2 = listM171063d14;
                    if (str.equals("is_close_button_enabled")) {
                        jsonReader.nextBoolean();
                    } else {
                        jsonReader.skipValue();
                    }
                    listM171063d14 = list2;
                    listM171063d13 = list;
                    break;
                case -213449460:
                    list = listM171063d13;
                    list2 = listM171063d14;
                    if (str.equals("force_disable_hardware_acceleration")) {
                        zNextBoolean15 = jsonReader.nextBoolean();
                    } else {
                        jsonReader.skipValue();
                    }
                    listM171063d14 = list2;
                    listM171063d13 = list;
                    break;
                case -213424028:
                    list = listM171063d13;
                    list2 = listM171063d14;
                    if (str.equals("watermark")) {
                        strNextString7 = jsonReader.nextString();
                    } else {
                        jsonReader.skipValue();
                    }
                    listM171063d14 = list2;
                    listM171063d13 = list;
                    break;
                case -180214626:
                    list = listM171063d13;
                    list2 = listM171063d14;
                    if (str.equals("native_required_asset_viewability")) {
                        zNextBoolean14 = jsonReader.nextBoolean();
                    } else {
                        jsonReader.skipValue();
                    }
                    listM171063d14 = list2;
                    listM171063d13 = list;
                    break;
                case -154616268:
                    list = listM171063d13;
                    list2 = listM171063d14;
                    if (str.equals("is_offline_ad")) {
                        zNextBoolean13 = jsonReader.nextBoolean();
                    } else {
                        jsonReader.skipValue();
                    }
                    listM171063d14 = list2;
                    listM171063d13 = list;
                    break;
                case -29338502:
                    list = listM171063d13;
                    list2 = listM171063d14;
                    if (str.equals("allow_custom_click_gesture")) {
                        zNextBoolean3 = jsonReader.nextBoolean();
                    } else {
                        jsonReader.skipValue();
                    }
                    listM171063d14 = list2;
                    listM171063d13 = list;
                    break;
                case 3107:
                    list = listM171063d13;
                    list2 = listM171063d14;
                    if (str.equals("ad")) {
                        oxv0Var = new oxv0(jsonReader);
                    } else {
                        jsonReader.skipValue();
                    }
                    listM171063d14 = list2;
                    listM171063d13 = list;
                    break;
                case 3355:
                    list = listM171063d13;
                    list2 = listM171063d14;
                    if (str.equals("id")) {
                        strNextString3 = jsonReader.nextString();
                    } else {
                        jsonReader.skipValue();
                    }
                    listM171063d14 = list2;
                    listM171063d13 = list;
                    break;
                case 3076010:
                    list = listM171063d13;
                    list2 = listM171063d14;
                    if (str.equals("data")) {
                        jSONObjectM171067h = prs0.m171067h(jsonReader);
                    } else {
                        jsonReader.skipValue();
                    }
                    listM171063d14 = list2;
                    listM171063d13 = list;
                    break;
                case 37109963:
                    list = listM171063d13;
                    list2 = listM171063d14;
                    if (str.equals("request_id")) {
                        strNextString15 = jsonReader.nextString();
                    } else {
                        jsonReader.skipValue();
                    }
                    listM171063d14 = list2;
                    listM171063d13 = list;
                    break;
                case 63195984:
                    list = listM171063d13;
                    list2 = listM171063d14;
                    if (str.equals("render_test_label")) {
                        zNextBoolean4 = jsonReader.nextBoolean();
                    } else {
                        jsonReader.skipValue();
                    }
                    listM171063d14 = list2;
                    listM171063d13 = list;
                    break;
                case 107433883:
                    list = listM171063d13;
                    list2 = listM171063d14;
                    if (str.equals("qdata")) {
                        strNextString4 = jsonReader.nextString();
                    } else {
                        jsonReader.skipValue();
                    }
                    listM171063d14 = list2;
                    listM171063d13 = list;
                    break;
                case 230323073:
                    list = listM171063d13;
                    list2 = listM171063d14;
                    if (str.equals("ad_load_urls")) {
                        listM171063d8 = prs0.m171063d(jsonReader);
                    } else {
                        jsonReader.skipValue();
                    }
                    listM171063d14 = list2;
                    listM171063d13 = list;
                    break;
                case 418392395:
                    list = listM171063d13;
                    list2 = listM171063d14;
                    if (str.equals("is_closable_area_disabled")) {
                        zNextBoolean7 = jsonReader.nextBoolean();
                    } else {
                        jsonReader.skipValue();
                    }
                    listM171063d14 = list2;
                    listM171063d13 = list;
                    break;
                case 542250332:
                    list = listM171063d13;
                    list2 = listM171063d14;
                    if (str.equals("consent_form_action_identifier")) {
                        iNextInt3 = jsonReader.nextInt();
                    } else {
                        jsonReader.skipValue();
                    }
                    listM171063d14 = list2;
                    listM171063d13 = list;
                    break;
                case 549176928:
                    list = listM171063d13;
                    list2 = listM171063d14;
                    if (str.equals("presentation_error_timeout_ms")) {
                        iNextInt4 = jsonReader.nextInt();
                    } else {
                        jsonReader.skipValue();
                    }
                    listM171063d14 = list2;
                    listM171063d13 = list;
                    break;
                case 597473788:
                    list = listM171063d13;
                    list2 = listM171063d14;
                    if (str.equals("debug_dialog_string")) {
                        strNextString5 = jsonReader.nextString();
                    } else {
                        jsonReader.skipValue();
                    }
                    listM171063d14 = list2;
                    listM171063d13 = list;
                    break;
                case 754887508:
                    list = listM171063d13;
                    list2 = listM171063d14;
                    if (str.equals("container_sizes")) {
                        listM152103a2 = lxv0.m152103a(jsonReader);
                    } else {
                        jsonReader.skipValue();
                    }
                    listM171063d14 = list2;
                    listM171063d13 = list;
                    break;
                case 791122864:
                    list = listM171063d13;
                    list2 = listM171063d14;
                    if (str.equals("impression_type")) {
                        iM147811c = m147811c(jsonReader.nextInt());
                    } else {
                        jsonReader.skipValue();
                    }
                    listM171063d14 = list2;
                    listM171063d13 = list;
                    break;
                case 1010584092:
                    list = listM171063d13;
                    list2 = listM171063d14;
                    if (str.equals(FirebaseAnalytics.Param.TRANSACTION_ID)) {
                        strNextString = jsonReader.nextString();
                    } else {
                        jsonReader.skipValue();
                    }
                    listM171063d14 = list2;
                    listM171063d13 = list;
                    break;
                case 1100650276:
                    list = listM171063d13;
                    list2 = listM171063d14;
                    if (str.equals("rewards")) {
                        zzcagVarM13556g = zzcag.m13556g(prs0.m171064e(jsonReader));
                    } else {
                        jsonReader.skipValue();
                    }
                    listM171063d14 = list2;
                    listM171063d13 = list;
                    break;
                case 1141602460:
                    list = listM171063d13;
                    list2 = listM171063d14;
                    if (str.equals("adapter_response_info_key")) {
                        strNextString17 = jsonReader.nextString();
                    } else {
                        jsonReader.skipValue();
                    }
                    listM171063d14 = list2;
                    listM171063d13 = list;
                    break;
                case 1186014765:
                    list = listM171063d13;
                    list2 = listM171063d14;
                    if (str.equals("cache_hit_urls")) {
                        listM171063d4 = prs0.m171063d(jsonReader);
                    } else {
                        jsonReader.skipValue();
                    }
                    listM171063d14 = list2;
                    listM171063d13 = list;
                    break;
                case 1321720943:
                    list = listM171063d13;
                    list2 = listM171063d14;
                    if (str.equals("allow_pub_owned_ad_view")) {
                        zNextBoolean2 = jsonReader.nextBoolean();
                    } else {
                        jsonReader.skipValue();
                    }
                    listM171063d14 = list2;
                    listM171063d13 = list;
                    break;
                case 1437255331:
                    list = listM171063d13;
                    list2 = listM171063d14;
                    if (str.equals("ad_source_id") && ((Boolean) m7s0.f132019O6.m207207l()).booleanValue()) {
                        strNextString12 = jsonReader.nextString();
                    } else {
                        jsonReader.skipValue();
                    }
                    listM171063d14 = list2;
                    listM171063d13 = list;
                    break;
                case 1637553475:
                    list = listM171063d13;
                    list2 = listM171063d14;
                    if (str.equals("bid_response")) {
                        strNextString6 = jsonReader.nextString();
                    } else {
                        jsonReader.skipValue();
                    }
                    listM171063d14 = list2;
                    listM171063d13 = list;
                    break;
                case 1638957285:
                    list = listM171063d13;
                    list2 = listM171063d14;
                    if (str.equals("video_start_urls")) {
                        listM171063d9 = prs0.m171063d(jsonReader);
                    } else {
                        jsonReader.skipValue();
                    }
                    listM171063d14 = list2;
                    listM171063d13 = list;
                    break;
                case 1686319423:
                    list = listM171063d13;
                    list2 = listM171063d14;
                    if (str.equals("ad_network_class_name")) {
                        strNextString10 = jsonReader.nextString();
                    } else {
                        jsonReader.skipValue();
                    }
                    listM171063d14 = list2;
                    listM171063d13 = list;
                    break;
                case 1688341040:
                    list = listM171063d13;
                    list2 = listM171063d14;
                    if (str.equals("video_reward_urls")) {
                        listM171063d10 = prs0.m171063d(jsonReader);
                    } else {
                        jsonReader.skipValue();
                    }
                    listM171063d14 = list2;
                    listM171063d13 = list;
                    break;
                case 1799285870:
                    list = listM171063d13;
                    list2 = listM171063d14;
                    if (str.equals("use_third_party_container_height")) {
                        zNextBoolean11 = jsonReader.nextBoolean();
                    } else {
                        jsonReader.skipValue();
                    }
                    listM171063d14 = list2;
                    listM171063d13 = list;
                    break;
                case 1839650832:
                    list = listM171063d13;
                    list2 = listM171063d14;
                    if (str.equals("renderers")) {
                        listM171063d = prs0.m171063d(jsonReader);
                    } else {
                        jsonReader.skipValue();
                    }
                    listM171063d14 = list2;
                    listM171063d13 = list;
                    break;
                case 1875425491:
                    list = listM171063d13;
                    list2 = listM171063d14;
                    if (str.equals("is_analytics_logging_enabled")) {
                        zNextBoolean9 = jsonReader.nextBoolean();
                    } else {
                        jsonReader.skipValue();
                    }
                    listM171063d14 = list2;
                    listM171063d13 = list;
                    break;
                case 2068142375:
                    list = listM171063d13;
                    list2 = listM171063d14;
                    if (str.equals("rule_line_external_id")) {
                        strNextString9 = jsonReader.nextString();
                    } else {
                        jsonReader.skipValue();
                    }
                    listM171063d14 = list2;
                    listM171063d13 = list;
                    break;
                case 2072888499:
                    list2 = listM171063d14;
                    list = listM171063d13;
                    if (str.equals("manual_tracking_urls")) {
                        listM171063d3 = prs0.m171063d(jsonReader);
                    } else {
                        jsonReader.skipValue();
                    }
                    listM171063d14 = list2;
                    listM171063d13 = list;
                    break;
                default:
                    list = listM171063d13;
                    list2 = listM171063d14;
                    jsonReader.skipValue();
                    listM171063d14 = list2;
                    listM171063d13 = list;
                    break;
            }
        }
        jsonReader.endObject();
        this.f125183a = listM171063d;
        this.f125185b = iM147810b;
        this.f125187c = listM171063d6;
        this.f125189d = listM171063d7;
        this.f125195g = listM171063d8;
        this.f125193f = iM147811c;
        this.f125197h = listM171063d9;
        this.f125199i = listM171063d10;
        this.f125201j = listM171063d11;
        this.f125203k = strNextString;
        this.f125205l = strNextString20;
        this.f125207m = zzcagVarM13556g;
        this.f125209n = listM171063d12;
        this.f125211o = listM171063d13;
        this.f125213p = listM171063d14;
        this.f125215q = listM171063d3;
        this.f125217r = iNextInt4;
        this.f125219s = listM152103a2;
        this.f125221t = oxv0Var;
        this.f125223u = listM171063d2;
        this.f125225v = listM152103a;
        this.f125227x = strNextString2;
        this.f125226w = jSONObjectM171067h;
        this.f125228y = strNextString3;
        this.f125229z = strNextString4;
        this.f125157A = string;
        this.f125158B = zzcbpVarM13557g;
        this.f125159C = strNextString5;
        this.f125160D = jSONObjectM171067h2;
        this.f125161E = jSONObjectM171067h3;
        this.f125167K = zNextBoolean;
        this.f125168L = zNextBoolean2;
        this.f125169M = zNextBoolean3;
        this.f125170N = zNextBoolean4;
        this.f125171O = zNextBoolean5;
        this.f125172P = zNextBoolean6;
        this.f125173Q = zNextBoolean7;
        this.f125174R = iM147812d;
        this.f125175S = iNextInt;
        this.f125177U = zNextBoolean8;
        this.f125178V = strNextString6;
        this.f125179W = new lyv0(jSONObjectM171067h4);
        this.f125180X = zNextBoolean9;
        this.f125181Y = zNextBoolean10;
        this.f125182Z = iNextInt2;
        this.f125184a0 = strNextString7;
        this.f125186b0 = iNextInt5;
        this.f125188c0 = strNextString8;
        this.f125190d0 = zNextBoolean11;
        this.f125192e0 = rss0VarM180718a;
        this.f125194f0 = zzsVarM12258g;
        this.f125196g0 = strNextString9;
        this.f125198h0 = zNextBoolean12;
        this.f125200i0 = jSONObjectM171067h5;
        this.f125162F = strNextString10;
        this.f125163G = strNextString11;
        this.f125164H = strNextString12;
        this.f125165I = strNextString13;
        this.f125166J = strNextString14;
        this.f125202j0 = zNextBoolean13;
        this.f125204k0 = jSONObjectM171067h6;
        this.f125206l0 = zNextBoolean14;
        this.f125208m0 = strNextString19;
        this.f125210n0 = zNextBoolean15;
        this.f125191e = listM171063d4;
        this.f125176T = zNextBoolean16;
        this.f125212o0 = strNextString15;
        this.f125214p0 = strNextString16;
        this.f125216q0 = strNextString17;
        this.f125218r0 = zNextBoolean17;
        this.f125220s0 = iNextInt3;
        this.f125224u0 = listM171063d5;
        this.f125222t0 = strNextString18;
    }

    /* JADX INFO: renamed from: a */
    public static String m147809a(int i) {
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
    public static int m147810b(String str) {
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
    public static int m147811c(int i) {
        if (i == 0 || i == 1 || i == 3) {
            return i;
        }
        return 0;
    }

    /* JADX INFO: renamed from: d */
    public static final int m147812d(String str) {
        if ("landscape".equalsIgnoreCase(str)) {
            return 6;
        }
        return Portrait.TYPE.equalsIgnoreCase(str) ? 7 : -1;
    }
}
