package p153l;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.drawable.BitmapDrawable;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Base64;
import androidx.annotation.Nullable;
import com.clevertap.android.sdk.Constants;
import com.google.android.gms.ads.internal.client.zzq;
import com.google.android.gms.internal.ads.zzbjb;
import com.google.android.gms.internal.ads.zzcei;
import com.google.android.gms.internal.ads.zzeml;
import com.google.android.gms.internal.ads.zzgaa;
import com.momo.mcamera.mask.BigEyeFilter;
import com.p051p1.mobile.putong.core.data.Reason;
import com.p051p1.mobile.putong.live.base.data.BLiveButtonType;
import com.tencent.liteav.TXLiteAVCode;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import org.eclipse.jetty.http.MimeTypes;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public final class ppu0 {

    /* JADX INFO: renamed from: a */
    public final Context f153585a;

    /* JADX INFO: renamed from: b */
    public final sou0 f153586b;

    /* JADX INFO: renamed from: c */
    public final v2s0 f153587c;

    /* JADX INFO: renamed from: d */
    public final zzcei f153588d;

    /* JADX INFO: renamed from: e */
    public final far0 f153589e;

    /* JADX INFO: renamed from: f */
    public final fcs0 f153590f;

    /* JADX INFO: renamed from: g */
    public final Executor f153591g;

    /* JADX INFO: renamed from: h */
    public final zzbjb f153592h;

    /* JADX INFO: renamed from: i */
    public final hqu0 f153593i;

    /* JADX INFO: renamed from: j */
    public final ltu0 f153594j;

    /* JADX INFO: renamed from: k */
    public final ScheduledExecutorService f153595k;

    /* JADX INFO: renamed from: l */
    public final bsu0 f153596l;

    /* JADX INFO: renamed from: m */
    public final xwu0 f153597m;

    /* JADX INFO: renamed from: n */
    public final vcw0 f153598n;

    /* JADX INFO: renamed from: o */
    public final yew0 f153599o;

    /* JADX INFO: renamed from: p */
    public final fbv0 f153600p;

    /* JADX INFO: renamed from: q */
    public final qbv0 f153601q;

    /* JADX INFO: renamed from: r */
    public final s7w0 f153602r;

    public ppu0(Context context, sou0 sou0Var, v2s0 v2s0Var, zzcei zzceiVar, far0 far0Var, fcs0 fcs0Var, Executor executor, o7w0 o7w0Var, hqu0 hqu0Var, ltu0 ltu0Var, ScheduledExecutorService scheduledExecutorService, xwu0 xwu0Var, vcw0 vcw0Var, yew0 yew0Var, fbv0 fbv0Var, bsu0 bsu0Var, qbv0 qbv0Var, s7w0 s7w0Var) {
        this.f153585a = context;
        this.f153586b = sou0Var;
        this.f153587c = v2s0Var;
        this.f153588d = zzceiVar;
        this.f153589e = far0Var;
        this.f153590f = fcs0Var;
        this.f153591g = executor;
        this.f153592h = o7w0Var.f145323i;
        this.f153593i = hqu0Var;
        this.f153594j = ltu0Var;
        this.f153595k = scheduledExecutorService;
        this.f153597m = xwu0Var;
        this.f153598n = vcw0Var;
        this.f153599o = yew0Var;
        this.f153600p = fbv0Var;
        this.f153596l = bsu0Var;
        this.f153601q = qbv0Var;
        this.f153602r = s7w0Var;
    }

    @Nullable
    /* JADX INFO: renamed from: i */
    public static final rfv0 m173252i(JSONObject jSONObject) {
        JSONObject jSONObjectOptJSONObject;
        JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject(BLiveButtonType.mute);
        if (jSONObjectOptJSONObject2 == null || (jSONObjectOptJSONObject = jSONObjectOptJSONObject2.optJSONObject("default_reason")) == null) {
            return null;
        }
        return m173257r(jSONObjectOptJSONObject);
    }

    /* JADX INFO: renamed from: j */
    public static final List m173253j(JSONObject jSONObject) {
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject(BLiveButtonType.mute);
        if (jSONObjectOptJSONObject == null) {
            return zzgaa.zzl();
        }
        JSONArray jSONArrayOptJSONArray = jSONObjectOptJSONObject.optJSONArray("reasons");
        if (jSONArrayOptJSONArray == null || jSONArrayOptJSONArray.length() <= 0) {
            return zzgaa.zzl();
        }
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
            rfv0 rfv0VarM173257r = m173257r(jSONArrayOptJSONArray.optJSONObject(i));
            if (rfv0VarM173257r != null) {
                arrayList.add(rfv0VarM173257r);
            }
        }
        return zzgaa.zzj(arrayList);
    }

    /* JADX INFO: renamed from: l */
    public static hpr m173254l(hpr hprVar, Object obj) {
        final Object obj2 = null;
        return pvw0.m173979f(hprVar, Exception.class, new xuw0(obj2) { // from class: l.npu0
            @Override // p153l.xuw0
            public final hpr zza(Object obj3) {
                d2v0.m113738l("Error during loading assets.", (Exception) obj3);
                return pvw0.m173981h(null);
            }
        }, oct0.f146738f);
    }

    /* JADX INFO: renamed from: m */
    public static hpr m173255m(boolean z, final hpr hprVar, Object obj) {
        return z ? pvw0.m173987n(hprVar, new xuw0() { // from class: l.opu0
            @Override // p153l.xuw0
            public final hpr zza(Object obj2) {
                return obj2 != null ? hprVar : pvw0.m173980g(new zzeml(1, "Retrieve required value in native ad response failed."));
            }
        }, oct0.f146738f) : m173254l(hprVar, null);
    }

    @Nullable
    /* JADX INFO: renamed from: q */
    public static Integer m173256q(JSONObject jSONObject, String str) {
        try {
            JSONObject jSONObject2 = jSONObject.getJSONObject(str);
            return Integer.valueOf(Color.rgb(jSONObject2.getInt("r"), jSONObject2.getInt("g"), jSONObject2.getInt("b")));
        } catch (JSONException unused) {
            return null;
        }
    }

    @Nullable
    /* JADX INFO: renamed from: r */
    public static final rfv0 m173257r(@Nullable JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        String strOptString = jSONObject.optString(Reason.TYPE);
        String strOptString2 = jSONObject.optString("ping_url");
        if (TextUtils.isEmpty(strOptString) || TextUtils.isEmpty(strOptString2)) {
            return null;
        }
        return new rfv0(strOptString, strOptString2);
    }

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ dks0 m173258a(JSONObject jSONObject, List list) {
        if (list == null || list.isEmpty()) {
            return null;
        }
        String strOptString = jSONObject.optString("text");
        Integer numM173256q = m173256q(jSONObject, "bg_color");
        Integer numM173256q2 = m173256q(jSONObject, "text_color");
        int iOptInt = jSONObject.optInt("text_size", -1);
        boolean zOptBoolean = jSONObject.optBoolean("allow_pub_rendering");
        int iOptInt2 = jSONObject.optInt("animation_ms", 1000);
        return new dks0(strOptString, list, numM173256q, numM173256q2, iOptInt > 0 ? Integer.valueOf(iOptInt) : null, jSONObject.optInt("presentation_ms", TXLiteAVCode.WARNING_START_CAPTURE_IGNORED) + iOptInt2, this.f153592h.zze, zOptBoolean);
    }

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ hpr m173259b(zzq zzqVar, q6w0 q6w0Var, t6w0 t6w0Var, String str, String str2, Object obj) throws Exception {
        wit0 wit0VarM155812a = this.f153594j.m155812a(zzqVar, q6w0Var, t6w0Var);
        final sct0 sct0VarM185388d = sct0.m185388d(wit0VarM155812a);
        yru0 yru0VarM106314b = this.f153596l.m106314b();
        wit0VarM155812a.zzN().zzN(yru0VarM106314b, yru0VarM106314b, yru0VarM106314b, yru0VarM106314b, yru0VarM106314b, false, null, new w9s0(this.f153585a, null, null), null, null, this.f153600p, this.f153599o, this.f153597m, this.f153598n, null, yru0VarM106314b, null, null, null);
        if (((Boolean) jas0.m144075c().m176505a(sgs0.f167979F3)).booleanValue()) {
            wit0VarM155812a.mo13747j0("/getNativeAdViewSignals", aqs0.f72870s);
        }
        wit0VarM155812a.mo13747j0("/getNativeClickMeta", aqs0.f72871t);
        wit0VarM155812a.zzN().zzB(new lkt0() { // from class: l.dpu0
            @Override // p153l.lkt0
            /* JADX INFO: renamed from: a */
            public final void mo99557a(boolean z, int i, String str3, String str4) {
                sct0 sct0Var = sct0VarM185388d;
                if (z) {
                    sct0Var.m185389e();
                    return;
                }
                sct0Var.m190495c(new zzeml(1, "Image Web View failed to load. Error code: " + i + ", Description: " + str3 + ", Failing URL: " + str4));
            }
        });
        wit0VarM155812a.mo13773x0(str, str2, null);
        return sct0VarM185388d;
    }

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ hpr m173260c(String str, Object obj) throws Exception {
        bxy0.m106916B();
        wit0 wit0VarM145141a = jjt0.m145141a(this.f153585a, xkt0.m211415a(), "native-omid", false, false, this.f153587c, null, this.f153588d, null, null, this.f153589e, this.f153590f, null, null, this.f153601q, this.f153602r);
        final sct0 sct0VarM185388d = sct0.m185388d(wit0VarM145141a);
        wit0VarM145141a.zzN().zzB(new lkt0() { // from class: l.fpu0
            @Override // p153l.lkt0
            /* JADX INFO: renamed from: a */
            public final void mo99557a(boolean z, int i, String str2, String str3) {
                sct0VarM185388d.m185389e();
            }
        });
        if (((Boolean) jas0.m144075c().m176505a(sgs0.f168196X4)).booleanValue()) {
            wit0VarM145141a.loadData(Base64.encodeToString(str.getBytes(), 1), MimeTypes.TEXT_HTML, "base64");
            return sct0VarM185388d;
        }
        wit0VarM145141a.loadData(str, MimeTypes.TEXT_HTML, "UTF-8");
        return sct0VarM185388d;
    }

    /* JADX INFO: renamed from: d */
    public final hpr m173261d(JSONObject jSONObject, String str) {
        final JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("attribution");
        if (jSONObjectOptJSONObject == null) {
            return pvw0.m173981h(null);
        }
        JSONArray jSONArrayOptJSONArray = jSONObjectOptJSONObject.optJSONArray("images");
        JSONObject jSONObjectOptJSONObject2 = jSONObjectOptJSONObject.optJSONObject("image");
        if (jSONArrayOptJSONArray == null && jSONObjectOptJSONObject2 != null) {
            jSONArrayOptJSONArray = new JSONArray();
            jSONArrayOptJSONArray.put(jSONObjectOptJSONObject2);
        }
        return m173255m(jSONObjectOptJSONObject.optBoolean("require"), pvw0.m173986m(m173268o(jSONArrayOptJSONArray, false, true), new eow0() { // from class: l.mpu0
            @Override // p153l.eow0
            public final Object apply(Object obj) {
                return this.f137954a.m173258a(jSONObjectOptJSONObject, (List) obj);
            }
        }, this.f153591g), null);
    }

    /* JADX INFO: renamed from: e */
    public final hpr m173262e(JSONObject jSONObject, String str) {
        return m173267n(jSONObject.optJSONObject(str), this.f153592h.zzb);
    }

    /* JADX INFO: renamed from: f */
    public final hpr m173263f(JSONObject jSONObject, String str) {
        zzbjb zzbjbVar = this.f153592h;
        return m173268o(jSONObject.optJSONArray("images"), zzbjbVar.zzb, zzbjbVar.zzd);
    }

    /* JADX INFO: renamed from: g */
    public final hpr m173264g(JSONObject jSONObject, String str, final q6w0 q6w0Var, final t6w0 t6w0Var) {
        if (!((Boolean) jas0.m144075c().m176505a(sgs0.f168045K9)).booleanValue()) {
            return pvw0.m173981h(null);
        }
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("images");
        if (jSONArrayOptJSONArray == null || jSONArrayOptJSONArray.length() <= 0) {
            return pvw0.m173981h(null);
        }
        JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(0);
        if (jSONObjectOptJSONObject == null) {
            return pvw0.m173981h(null);
        }
        final String strOptString = jSONObjectOptJSONObject.optString("base_url");
        final String strOptString2 = jSONObjectOptJSONObject.optString(Constants.INAPP_HTML_TAG);
        final zzq zzqVarM173266k = m173266k(jSONObjectOptJSONObject.optInt("width", 0), jSONObjectOptJSONObject.optInt("height", 0));
        if (TextUtils.isEmpty(strOptString2)) {
            return pvw0.m173981h(null);
        }
        final hpr hprVarM173987n = pvw0.m173987n(pvw0.m173981h(null), new xuw0() { // from class: l.bpu0
            @Override // p153l.xuw0
            public final hpr zza(Object obj) {
                return this.f77809a.m173259b(zzqVarM173266k, q6w0Var, t6w0Var, strOptString, strOptString2, obj);
            }
        }, oct0.f146737e);
        return pvw0.m173987n(hprVarM173987n, new xuw0() { // from class: l.cpu0
            @Override // p153l.xuw0
            public final hpr zza(Object obj) throws zzeml {
                if (((wit0) obj) != null) {
                    return hprVarM173987n;
                }
                throw new zzeml(1, "Retrieve Web View from image ad response failed.");
            }
        }, oct0.f146738f);
    }

    /* JADX INFO: renamed from: h */
    public final hpr m173265h(JSONObject jSONObject, q6w0 q6w0Var, t6w0 t6w0Var) {
        hpr hprVarM136694a;
        JSONObject jSONObjectM198935g = v0t0.m198935g(jSONObject, "html_containers", "instream");
        if (jSONObjectM198935g != null) {
            return m173269p(jSONObjectM198935g, q6w0Var, t6w0Var);
        }
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("video");
        if (jSONObjectOptJSONObject == null) {
            return pvw0.m173981h(null);
        }
        String strOptString = jSONObjectOptJSONObject.optString("vast_xml");
        boolean z = false;
        if (((Boolean) jas0.m144075c().m176505a(sgs0.f168033J9)).booleanValue() && jSONObjectOptJSONObject.has(Constants.INAPP_HTML_TAG)) {
            z = true;
        }
        if (!TextUtils.isEmpty(strOptString)) {
            if (!z) {
                hprVarM136694a = this.f153593i.m136694a(jSONObjectOptJSONObject);
            }
            return m173254l(pvw0.m173988o(hprVarM136694a, ((Integer) jas0.m144075c().m176505a(sgs0.f167991G3)).intValue(), TimeUnit.SECONDS, this.f153595k), null);
        }
        if (!z) {
            dct0.m115298g("Required field 'vast_xml' or 'html' is missing");
            return pvw0.m173981h(null);
        }
        hprVarM136694a = m173269p(jSONObjectOptJSONObject, q6w0Var, t6w0Var);
        return m173254l(pvw0.m173988o(hprVarM136694a, ((Integer) jas0.m144075c().m176505a(sgs0.f167991G3)).intValue(), TimeUnit.SECONDS, this.f153595k), null);
    }

    /* JADX INFO: renamed from: k */
    public final zzq m173266k(int i, int i2) {
        if (i == 0) {
            if (i2 == 0) {
                return zzq.m12307H();
            }
            i = 0;
        }
        return new zzq(this.f153585a, new w70(i, i2));
    }

    /* JADX INFO: renamed from: n */
    public final hpr m173267n(@Nullable JSONObject jSONObject, boolean z) {
        if (jSONObject == null) {
            return pvw0.m173981h(null);
        }
        final String strOptString = jSONObject.optString("url");
        if (TextUtils.isEmpty(strOptString)) {
            return pvw0.m173981h(null);
        }
        final double dOptDouble = jSONObject.optDouble(BigEyeFilter.UNIFORM_SCALE, 1.0d);
        boolean zOptBoolean = jSONObject.optBoolean("is_transparent", true);
        final int iOptInt = jSONObject.optInt("width", -1);
        final int iOptInt2 = jSONObject.optInt("height", -1);
        if (z) {
            return pvw0.m173981h(new fks0(null, Uri.parse(strOptString), dOptDouble, iOptInt, iOptInt2));
        }
        return m173255m(jSONObject.optBoolean("require"), pvw0.m173986m(this.f153586b.m187278b(strOptString, dOptDouble, zOptBoolean), new eow0() { // from class: l.zou0
            @Override // p153l.eow0
            public final Object apply(Object obj) {
                return new fks0(new BitmapDrawable(Resources.getSystem(), (Bitmap) obj), Uri.parse(strOptString), dOptDouble, iOptInt, iOptInt2);
            }
        }, this.f153591g), null);
    }

    /* JADX INFO: renamed from: o */
    public final hpr m173268o(@Nullable JSONArray jSONArray, boolean z, boolean z2) {
        if (jSONArray == null || jSONArray.length() <= 0) {
            return pvw0.m173981h(Collections.EMPTY_LIST);
        }
        ArrayList arrayList = new ArrayList();
        int length = z2 ? jSONArray.length() : 1;
        for (int i = 0; i < length; i++) {
            arrayList.add(m173267n(jSONArray.optJSONObject(i), z));
        }
        return pvw0.m173986m(pvw0.m173977d(arrayList), new eow0() { // from class: l.epu0
            @Override // p153l.eow0
            public final Object apply(Object obj) {
                ArrayList arrayList2 = new ArrayList();
                for (fks0 fks0Var : (List) obj) {
                    if (fks0Var != null) {
                        arrayList2.add(fks0Var);
                    }
                }
                return arrayList2;
            }
        }, this.f153591g);
    }

    /* JADX INFO: renamed from: p */
    public final hpr m173269p(JSONObject jSONObject, q6w0 q6w0Var, t6w0 t6w0Var) {
        final hpr hprVarM136695b = this.f153593i.m136695b(jSONObject.optString("base_url"), jSONObject.optString(Constants.INAPP_HTML_TAG), q6w0Var, t6w0Var, m173266k(jSONObject.optInt("width", 0), jSONObject.optInt("height", 0)));
        return pvw0.m173987n(hprVarM136695b, new xuw0() { // from class: l.apu0
            @Override // p153l.xuw0
            public final hpr zza(Object obj) throws zzeml {
                wit0 wit0Var = (wit0) obj;
                if (wit0Var == null || wit0Var.mo13729a() == null) {
                    throw new zzeml(1, "Retrieve video view in html5 ad response failed.");
                }
                return hprVarM136695b;
            }
        }, oct0.f146738f);
    }
}
