package p149l;

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
import com.p046p1.mobile.putong.core.data.Reason;
import com.p046p1.mobile.putong.live.base.data.BLiveButtonType;
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
public final class jgu0 {

    /* JADX INFO: renamed from: a */
    public final Context f117830a;

    /* JADX INFO: renamed from: b */
    public final mfu0 f117831b;

    /* JADX INFO: renamed from: c */
    public final ptr0 f117832c;

    /* JADX INFO: renamed from: d */
    public final zzcei f117833d;

    /* JADX INFO: renamed from: e */
    public final z0r0 f117834e;

    /* JADX INFO: renamed from: f */
    public final z2s0 f117835f;

    /* JADX INFO: renamed from: g */
    public final Executor f117836g;

    /* JADX INFO: renamed from: h */
    public final zzbjb f117837h;

    /* JADX INFO: renamed from: i */
    public final bhu0 f117838i;

    /* JADX INFO: renamed from: j */
    public final fku0 f117839j;

    /* JADX INFO: renamed from: k */
    public final ScheduledExecutorService f117840k;

    /* JADX INFO: renamed from: l */
    public final viu0 f117841l;

    /* JADX INFO: renamed from: m */
    public final rnu0 f117842m;

    /* JADX INFO: renamed from: n */
    public final p3w0 f117843n;

    /* JADX INFO: renamed from: o */
    public final s5w0 f117844o;

    /* JADX INFO: renamed from: p */
    public final z1v0 f117845p;

    /* JADX INFO: renamed from: q */
    public final k2v0 f117846q;

    /* JADX INFO: renamed from: r */
    public final myv0 f117847r;

    public jgu0(Context context, mfu0 mfu0Var, ptr0 ptr0Var, zzcei zzceiVar, z0r0 z0r0Var, z2s0 z2s0Var, Executor executor, iyv0 iyv0Var, bhu0 bhu0Var, fku0 fku0Var, ScheduledExecutorService scheduledExecutorService, rnu0 rnu0Var, p3w0 p3w0Var, s5w0 s5w0Var, z1v0 z1v0Var, viu0 viu0Var, k2v0 k2v0Var, myv0 myv0Var) {
        this.f117830a = context;
        this.f117831b = mfu0Var;
        this.f117832c = ptr0Var;
        this.f117833d = zzceiVar;
        this.f117834e = z0r0Var;
        this.f117835f = z2s0Var;
        this.f117836g = executor;
        this.f117837h = iyv0Var.f115499i;
        this.f117838i = bhu0Var;
        this.f117839j = fku0Var;
        this.f117840k = scheduledExecutorService;
        this.f117842m = rnu0Var;
        this.f117843n = p3w0Var;
        this.f117844o = s5w0Var;
        this.f117845p = z1v0Var;
        this.f117841l = viu0Var;
        this.f117846q = k2v0Var;
        this.f117847r = myv0Var;
    }

    @Nullable
    /* JADX INFO: renamed from: i */
    public static final l6v0 m141332i(JSONObject jSONObject) {
        JSONObject jSONObjectOptJSONObject;
        JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject(BLiveButtonType.mute);
        if (jSONObjectOptJSONObject2 == null || (jSONObjectOptJSONObject = jSONObjectOptJSONObject2.optJSONObject("default_reason")) == null) {
            return null;
        }
        return m141337r(jSONObjectOptJSONObject);
    }

    /* JADX INFO: renamed from: j */
    public static final List m141333j(JSONObject jSONObject) {
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
            l6v0 l6v0VarM141337r = m141337r(jSONArrayOptJSONArray.optJSONObject(i));
            if (l6v0VarM141337r != null) {
                arrayList.add(l6v0VarM141337r);
            }
        }
        return zzgaa.zzj(arrayList);
    }

    /* JADX INFO: renamed from: l */
    public static gnr m141334l(gnr gnrVar, Object obj) {
        final Object obj2 = null;
        return jmw0.m142233f(gnrVar, Exception.class, new rlw0(obj2) { // from class: l.hgu0
            @Override // p149l.rlw0
            public final gnr zza(Object obj3) {
                xsu0.m210835l("Error during loading assets.", (Exception) obj3);
                return jmw0.m142235h(null);
            }
        }, i3t0.f111377f);
    }

    /* JADX INFO: renamed from: m */
    public static gnr m141335m(boolean z, final gnr gnrVar, Object obj) {
        return z ? jmw0.m142241n(gnrVar, new rlw0() { // from class: l.igu0
            @Override // p149l.rlw0
            public final gnr zza(Object obj2) {
                return obj2 != null ? gnrVar : jmw0.m142234g(new zzeml(1, "Retrieve required value in native ad response failed."));
            }
        }, i3t0.f111377f) : m141334l(gnrVar, null);
    }

    @Nullable
    /* JADX INFO: renamed from: q */
    public static Integer m141336q(JSONObject jSONObject, String str) {
        try {
            JSONObject jSONObject2 = jSONObject.getJSONObject(str);
            return Integer.valueOf(Color.rgb(jSONObject2.getInt("r"), jSONObject2.getInt("g"), jSONObject2.getInt("b")));
        } catch (JSONException unused) {
            return null;
        }
    }

    @Nullable
    /* JADX INFO: renamed from: r */
    public static final l6v0 m141337r(@Nullable JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        String strOptString = jSONObject.optString(Reason.TYPE);
        String strOptString2 = jSONObject.optString("ping_url");
        if (TextUtils.isEmpty(strOptString) || TextUtils.isEmpty(strOptString2)) {
            return null;
        }
        return new l6v0(strOptString, strOptString2);
    }

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ xas0 m141338a(JSONObject jSONObject, List list) {
        if (list == null || list.isEmpty()) {
            return null;
        }
        String strOptString = jSONObject.optString("text");
        Integer numM141336q = m141336q(jSONObject, "bg_color");
        Integer numM141336q2 = m141336q(jSONObject, "text_color");
        int iOptInt = jSONObject.optInt("text_size", -1);
        boolean zOptBoolean = jSONObject.optBoolean("allow_pub_rendering");
        int iOptInt2 = jSONObject.optInt("animation_ms", 1000);
        return new xas0(strOptString, list, numM141336q, numM141336q2, iOptInt > 0 ? Integer.valueOf(iOptInt) : null, jSONObject.optInt("presentation_ms", TXLiteAVCode.WARNING_START_CAPTURE_IGNORED) + iOptInt2, this.f117837h.zze, zOptBoolean);
    }

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ gnr m141339b(zzq zzqVar, kxv0 kxv0Var, nxv0 nxv0Var, String str, String str2, Object obj) throws Exception {
        q9t0 q9t0VarM121894a = this.f117839j.m121894a(zzqVar, kxv0Var, nxv0Var);
        final m3t0 m3t0VarM152951d = m3t0.m152951d(q9t0VarM121894a);
        siu0 siu0VarM198608b = this.f117841l.m198608b();
        q9t0VarM121894a.zzN().zzN(siu0VarM198608b, siu0VarM198608b, siu0VarM198608b, siu0VarM198608b, siu0VarM198608b, false, null, new q0s0(this.f117830a, null, null), null, null, this.f117845p, this.f117844o, this.f117842m, this.f117843n, null, siu0VarM198608b, null, null, null);
        if (((Boolean) d1s0.m109677c().m144697a(m7s0.f131908F3)).booleanValue()) {
            q9t0VarM121894a.mo13693j0("/getNativeAdViewSignals", ugs0.f176443s);
        }
        q9t0VarM121894a.mo13693j0("/getNativeClickMeta", ugs0.f176444t);
        q9t0VarM121894a.zzN().zzB(new fbt0() { // from class: l.xfu0
            @Override // p149l.fbt0
            /* JADX INFO: renamed from: a */
            public final void mo96131a(boolean z, int i, String str3, String str4) {
                m3t0 m3t0Var = m3t0VarM152951d;
                if (z) {
                    m3t0Var.m152952e();
                    return;
                }
                m3t0Var.m157775c(new zzeml(1, "Image Web View failed to load. Error code: " + i + ", Description: " + str3 + ", Failing URL: " + str4));
            }
        });
        q9t0VarM121894a.mo13719x0(str, str2, null);
        return m3t0VarM152951d;
    }

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ gnr m141340c(String str, Object obj) throws Exception {
        vny0.m199062B();
        q9t0 q9t0VarM110631a = dat0.m110631a(this.f117830a, rbt0.m178692a(), "native-omid", false, false, this.f117832c, null, this.f117833d, null, null, this.f117834e, this.f117835f, null, null, this.f117846q, this.f117847r);
        final m3t0 m3t0VarM152951d = m3t0.m152951d(q9t0VarM110631a);
        q9t0VarM110631a.zzN().zzB(new fbt0() { // from class: l.zfu0
            @Override // p149l.fbt0
            /* JADX INFO: renamed from: a */
            public final void mo96131a(boolean z, int i, String str2, String str3) {
                m3t0VarM152951d.m152952e();
            }
        });
        if (((Boolean) d1s0.m109677c().m144697a(m7s0.f132125X4)).booleanValue()) {
            q9t0VarM110631a.loadData(Base64.encodeToString(str.getBytes(), 1), MimeTypes.TEXT_HTML, "base64");
            return m3t0VarM152951d;
        }
        q9t0VarM110631a.loadData(str, MimeTypes.TEXT_HTML, "UTF-8");
        return m3t0VarM152951d;
    }

    /* JADX INFO: renamed from: d */
    public final gnr m141341d(JSONObject jSONObject, String str) {
        final JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("attribution");
        if (jSONObjectOptJSONObject == null) {
            return jmw0.m142235h(null);
        }
        JSONArray jSONArrayOptJSONArray = jSONObjectOptJSONObject.optJSONArray("images");
        JSONObject jSONObjectOptJSONObject2 = jSONObjectOptJSONObject.optJSONObject("image");
        if (jSONArrayOptJSONArray == null && jSONObjectOptJSONObject2 != null) {
            jSONArrayOptJSONArray = new JSONArray();
            jSONArrayOptJSONArray.put(jSONObjectOptJSONObject2);
        }
        return m141335m(jSONObjectOptJSONObject.optBoolean("require"), jmw0.m142240m(m141348o(jSONArrayOptJSONArray, false, true), new yew0() { // from class: l.ggu0
            @Override // p149l.yew0
            public final Object apply(Object obj) {
                return this.f102538a.m141338a(jSONObjectOptJSONObject, (List) obj);
            }
        }, this.f117836g), null);
    }

    /* JADX INFO: renamed from: e */
    public final gnr m141342e(JSONObject jSONObject, String str) {
        return m141347n(jSONObject.optJSONObject(str), this.f117837h.zzb);
    }

    /* JADX INFO: renamed from: f */
    public final gnr m141343f(JSONObject jSONObject, String str) {
        zzbjb zzbjbVar = this.f117837h;
        return m141348o(jSONObject.optJSONArray("images"), zzbjbVar.zzb, zzbjbVar.zzd);
    }

    /* JADX INFO: renamed from: g */
    public final gnr m141344g(JSONObject jSONObject, String str, final kxv0 kxv0Var, final nxv0 nxv0Var) {
        if (!((Boolean) d1s0.m109677c().m144697a(m7s0.f131974K9)).booleanValue()) {
            return jmw0.m142235h(null);
        }
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("images");
        if (jSONArrayOptJSONArray == null || jSONArrayOptJSONArray.length() <= 0) {
            return jmw0.m142235h(null);
        }
        JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(0);
        if (jSONObjectOptJSONObject == null) {
            return jmw0.m142235h(null);
        }
        final String strOptString = jSONObjectOptJSONObject.optString("base_url");
        final String strOptString2 = jSONObjectOptJSONObject.optString(Constants.INAPP_HTML_TAG);
        final zzq zzqVarM141346k = m141346k(jSONObjectOptJSONObject.optInt("width", 0), jSONObjectOptJSONObject.optInt("height", 0));
        if (TextUtils.isEmpty(strOptString2)) {
            return jmw0.m142235h(null);
        }
        final gnr gnrVarM142241n = jmw0.m142241n(jmw0.m142235h(null), new rlw0() { // from class: l.vfu0
            @Override // p149l.rlw0
            public final gnr zza(Object obj) {
                return this.f181302a.m141339b(zzqVarM141346k, kxv0Var, nxv0Var, strOptString, strOptString2, obj);
            }
        }, i3t0.f111376e);
        return jmw0.m142241n(gnrVarM142241n, new rlw0() { // from class: l.wfu0
            @Override // p149l.rlw0
            public final gnr zza(Object obj) throws zzeml {
                if (((q9t0) obj) != null) {
                    return gnrVarM142241n;
                }
                throw new zzeml(1, "Retrieve Web View from image ad response failed.");
            }
        }, i3t0.f111377f);
    }

    /* JADX INFO: renamed from: h */
    public final gnr m141345h(JSONObject jSONObject, kxv0 kxv0Var, nxv0 nxv0Var) {
        gnr gnrVarM101926a;
        JSONObject jSONObjectM171066g = prs0.m171066g(jSONObject, "html_containers", "instream");
        if (jSONObjectM171066g != null) {
            return m141349p(jSONObjectM171066g, kxv0Var, nxv0Var);
        }
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("video");
        if (jSONObjectOptJSONObject == null) {
            return jmw0.m142235h(null);
        }
        String strOptString = jSONObjectOptJSONObject.optString("vast_xml");
        boolean z = false;
        if (((Boolean) d1s0.m109677c().m144697a(m7s0.f131962J9)).booleanValue() && jSONObjectOptJSONObject.has(Constants.INAPP_HTML_TAG)) {
            z = true;
        }
        if (!TextUtils.isEmpty(strOptString)) {
            if (!z) {
                gnrVarM101926a = this.f117838i.m101926a(jSONObjectOptJSONObject);
            }
            return m141334l(jmw0.m142242o(gnrVarM101926a, ((Integer) d1s0.m109677c().m144697a(m7s0.f131920G3)).intValue(), TimeUnit.SECONDS, this.f117840k), null);
        }
        if (!z) {
            x2t0.m206869g("Required field 'vast_xml' or 'html' is missing");
            return jmw0.m142235h(null);
        }
        gnrVarM101926a = m141349p(jSONObjectOptJSONObject, kxv0Var, nxv0Var);
        return m141334l(jmw0.m142242o(gnrVarM101926a, ((Integer) d1s0.m109677c().m144697a(m7s0.f131920G3)).intValue(), TimeUnit.SECONDS, this.f117840k), null);
    }

    /* JADX INFO: renamed from: k */
    public final zzq m141346k(int i, int i2) {
        if (i == 0) {
            if (i2 == 0) {
                return zzq.m12253H();
            }
            i = 0;
        }
        return new zzq(this.f117830a, new a80(i, i2));
    }

    /* JADX INFO: renamed from: n */
    public final gnr m141347n(@Nullable JSONObject jSONObject, boolean z) {
        if (jSONObject == null) {
            return jmw0.m142235h(null);
        }
        final String strOptString = jSONObject.optString("url");
        if (TextUtils.isEmpty(strOptString)) {
            return jmw0.m142235h(null);
        }
        final double dOptDouble = jSONObject.optDouble(BigEyeFilter.UNIFORM_SCALE, 1.0d);
        boolean zOptBoolean = jSONObject.optBoolean("is_transparent", true);
        final int iOptInt = jSONObject.optInt("width", -1);
        final int iOptInt2 = jSONObject.optInt("height", -1);
        if (z) {
            return jmw0.m142235h(new zas0(null, Uri.parse(strOptString), dOptDouble, iOptInt, iOptInt2));
        }
        return m141335m(jSONObject.optBoolean("require"), jmw0.m142240m(this.f117831b.m154466b(strOptString, dOptDouble, zOptBoolean), new yew0() { // from class: l.tfu0
            @Override // p149l.yew0
            public final Object apply(Object obj) {
                return new zas0(new BitmapDrawable(Resources.getSystem(), (Bitmap) obj), Uri.parse(strOptString), dOptDouble, iOptInt, iOptInt2);
            }
        }, this.f117836g), null);
    }

    /* JADX INFO: renamed from: o */
    public final gnr m141348o(@Nullable JSONArray jSONArray, boolean z, boolean z2) {
        if (jSONArray == null || jSONArray.length() <= 0) {
            return jmw0.m142235h(Collections.EMPTY_LIST);
        }
        ArrayList arrayList = new ArrayList();
        int length = z2 ? jSONArray.length() : 1;
        for (int i = 0; i < length; i++) {
            arrayList.add(m141347n(jSONArray.optJSONObject(i), z));
        }
        return jmw0.m142240m(jmw0.m142231d(arrayList), new yew0() { // from class: l.yfu0
            @Override // p149l.yew0
            public final Object apply(Object obj) {
                ArrayList arrayList2 = new ArrayList();
                for (zas0 zas0Var : (List) obj) {
                    if (zas0Var != null) {
                        arrayList2.add(zas0Var);
                    }
                }
                return arrayList2;
            }
        }, this.f117836g);
    }

    /* JADX INFO: renamed from: p */
    public final gnr m141349p(JSONObject jSONObject, kxv0 kxv0Var, nxv0 nxv0Var) {
        final gnr gnrVarM101927b = this.f117838i.m101927b(jSONObject.optString("base_url"), jSONObject.optString(Constants.INAPP_HTML_TAG), kxv0Var, nxv0Var, m141346k(jSONObject.optInt("width", 0), jSONObject.optInt("height", 0)));
        return jmw0.m142241n(gnrVarM101927b, new rlw0() { // from class: l.ufu0
            @Override // p149l.rlw0
            public final gnr zza(Object obj) throws zzeml {
                q9t0 q9t0Var = (q9t0) obj;
                if (q9t0Var == null || q9t0Var.mo13675a() == null) {
                    throw new zzeml(1, "Retrieve video view in html5 ad response failed.");
                }
                return gnrVarM101927b;
            }
        }, i3t0.f111377f);
    }
}
