package com.p051p1.mobile.putong.remote_config;

import android.content.Context;
import android.text.TextUtils;
import android.util.LruCache;
import android.util.Pair;
import androidx.annotation.NonNull;
import com.google.common.collect.Maps;
import com.google.firebase.remoteconfig.RemoteConfigComponent;
import com.p051p1.mobile.putong.api.ABManager;
import com.p051p1.mobile.putong.app.TantanApp;
import com.p051p1.mobile.putong.live.base.data.BLiveOperationActionAfterCountdown;
import com.tantanapp.common.data.JsonAdapter;
import com.tantanapp.common.utils.CrashHelper;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Date;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Callable;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p137rx.C22421c;
import p137rx.schedulers.Schedulers;
import p137rx.subjects.C22507a;
import p153l.adj;
import p153l.bw5;
import p153l.f2e0;
import p153l.gxd0;
import p153l.hyc0;
import p153l.jni0;
import p153l.k26;
import p153l.l51;
import p153l.nw5;
import p153l.oki;
import p153l.ond;
import p153l.psd0;
import p153l.qv5;
import p153l.ra5;
import p153l.rw5;
import p153l.soi0;
import p153l.t26;
import p153l.tu2;
import p153l.ua5;
import p153l.uqb0;
import p153l.uxj0;
import p153l.vu2;
import p153l.wyd0;
import p153l.xtb;
import p153l.y20;
import p153l.ydg0;
import p153l.zqf0;

/* JADX INFO: loaded from: classes10.dex */
public class RemoteConfig {

    /* JADX INFO: renamed from: g */
    public static final byte[] f55091g = new byte[0];

    /* JADX INFO: renamed from: h */
    public static final ra5 f55092h = ond.m168329a();

    /* JADX INFO: renamed from: i */
    public static wyd0 f55093i = new wyd0("saved_device_uid_md5", "");

    /* JADX INFO: renamed from: j */
    public static wyd0 f55094j = new wyd0("saved_user_md5", "");

    /* JADX INFO: renamed from: k */
    public static wyd0 f55095k = new wyd0("saved_md5_version", "");

    /* JADX INFO: renamed from: l */
    public static C22507a<ConfigStep> f55096l = C22507a.m222758b();

    /* JADX INFO: renamed from: m */
    public static final zqf0<RemoteConfig> f55097m = new C13259a();

    /* JADX INFO: renamed from: a */
    public String f55098a;

    /* JADX INFO: renamed from: b */
    public String f55099b;

    /* JADX INFO: renamed from: c */
    public String f55100c;

    /* JADX INFO: renamed from: d */
    public String f55101d;

    /* JADX INFO: renamed from: e */
    public Context f55102e;

    /* JADX INFO: renamed from: f */
    public LruCache<String, Object> f55103f;

    public enum ConfigStep {
        DEVICE,
        UID,
        USER
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.remote_config.RemoteConfig$a */
    public class C13259a extends zqf0<RemoteConfig> {
        @Override // p153l.zqf0
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public RemoteConfig mo80520a() {
            return new RemoteConfig();
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.remote_config.RemoteConfig$b */
    public static /* synthetic */ class C13260b {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f55104a;

        static {
            int[] iArr = new int[ConfigStep.values().length];
            f55104a = iArr;
            try {
                iArr[ConfigStep.DEVICE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f55104a[ConfigStep.UID.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f55104a[ConfigStep.USER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public RemoteConfig() {
        this.f55102e = k26.m147943a().getApplicationContext();
        this.f55098a = String.format("%s_%s.json", "rc", "activate");
        this.f55099b = String.format("%s_%s.json", "rc", "activate_device");
        this.f55100c = String.format("%s_%s.json", "rc", RemoteConfigComponent.FETCH_FILE_NAME);
        this.f55101d = String.format("%s_%s.json", "rc", "fetch_device");
        m80509o();
        File fileStreamPath = this.f55102e.getFileStreamPath(this.f55098a);
        int iMax = Math.max(30, (fileStreamPath == null || !fileStreamPath.exists()) ? 0 : (int) (fileStreamPath.length() / 600));
        m80466X("RemoteConfig", "init lur cache size:" + iMax);
        this.f55103f = new LruCache<>(iMax);
        m80503a0();
    }

    /* JADX INFO: renamed from: C */
    public static String m80463C() {
        return f55093i.get();
    }

    /* JADX INFO: renamed from: D */
    public static String m80464D() {
        return f55094j.get();
    }

    /* JADX INFO: renamed from: I */
    public static boolean m80465I(C13261a c13261a, C13261a c13261a2) {
        return c13261a2 == null || !c13261a.m80527e().equals(c13261a2.m80527e());
    }

    /* JADX INFO: renamed from: X */
    public static void m80466X(String str, String str2) {
        tu2.m192703a(str, str2);
    }

    /* JADX INFO: renamed from: Y */
    public static C22421c<ConfigStep> m80467Y() {
        return f55096l.onBackpressureLatest().observeOn(Schedulers.computation());
    }

    /* JADX INFO: renamed from: c0 */
    public static void m80471c0() {
        f55096l.onNext(null);
    }

    /* JADX INFO: renamed from: x */
    public static RemoteConfig m80481x() {
        return f55097m.m221013b();
    }

    /* JADX INFO: renamed from: A */
    public long m80482A(@NonNull String str) {
        return m80515u().m164959q(str);
    }

    /* JADX INFO: renamed from: B */
    public long m80483B(@NonNull String str, long j) {
        return m80515u().m164960r(str, j);
    }

    /* JADX INFO: renamed from: E */
    public final nw5 m80484E(ConfigStep configStep) {
        String str;
        String str2;
        if (C13260b.f55104a[configStep.ordinal()] != 1) {
            str = this.f55100c;
            str2 = this.f55098a;
        } else {
            str = this.f55101d;
            str2 = this.f55099b;
        }
        if (nw5.m164942g(str2, str) == null) {
            synchronized (RemoteConfig.class) {
                try {
                    if (nw5.m164942g(str2, str) == null) {
                        nw5.m164941c(m80514t(str2), m80514t(str));
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return nw5.m164942g(str2, str);
    }

    @NonNull
    /* JADX INFO: renamed from: F */
    public String m80485F(@NonNull String str) {
        return m80515u().m164961t(str);
    }

    @NonNull
    /* JADX INFO: renamed from: G */
    public hyc0 m80486G(@NonNull String str) {
        return m80515u().m164962v(str);
    }

    /* JADX INFO: renamed from: H */
    public final boolean m80487H() {
        if (TextUtils.equals(f55093i.get(), "")) {
            return true;
        }
        File fileStreamPath = this.f55102e.getFileStreamPath(this.f55099b);
        return !fileStreamPath.exists() || fileStreamPath.length() == 0;
    }

    /* JADX INFO: renamed from: J */
    public final boolean m80488J() {
        if (TextUtils.equals(f55094j.get(), "")) {
            return true;
        }
        File fileStreamPath = this.f55102e.getFileStreamPath(this.f55098a);
        return !fileStreamPath.exists() || fileStreamPath.length() == 0;
    }

    /* JADX INFO: renamed from: K */
    public ConfigStep m80489K() {
        gxd0 gxd0Var = TantanApp.f17901e;
        if (gxd0Var.mo107143b() != null) {
            return (gxd0Var.mo107143b() == null || !TantanApp.f17900d.mo107143b().booleanValue()) ? ConfigStep.UID : ConfigStep.USER;
        }
        return ConfigStep.DEVICE;
    }

    /* JADX INFO: renamed from: L */
    public final /* synthetic */ Boolean m80490L(ConfigStep configStep, jni0 jni0Var) throws Exception {
        return Boolean.valueOf(m80502Z(configStep, jni0Var));
    }

    /* JADX INFO: renamed from: M */
    public final /* synthetic */ jni0 m80491M(jni0 jni0Var, jni0 jni0Var2, bw5 bw5Var, final ConfigStep configStep, jni0 jni0Var3) throws Exception {
        if (!jni0Var.mo121514i() || jni0Var.mo121512g() == null) {
            return soi0.m187244e(Boolean.FALSE);
        }
        C13261a c13261a = (C13261a) jni0Var.mo121512g();
        return (!jni0Var2.mo121514i() || m80465I(c13261a, (C13261a) jni0Var2.mo121512g())) ? bw5Var.m106643h(c13261a).mo121509d(m80506e0(), new t26() { // from class: l.oxc0
            @Override // p153l.t26
            /* JADX INFO: renamed from: a */
            public final Object mo165110a(jni0 jni0Var4) {
                return this.f149635a.m80490L(configStep, jni0Var4);
            }
        }) : soi0.m187244e(Boolean.FALSE);
    }

    /* JADX INFO: renamed from: N */
    public final /* synthetic */ jni0 m80492N(ConfigStep configStep, Boolean bool) throws Exception {
        return m80507m(configStep);
    }

    /* JADX INFO: renamed from: O */
    public final /* synthetic */ Boolean m80493O(JSONObject jSONObject, ConfigStep configStep) throws Exception {
        m80484E(configStep).m164956l().m106643h(C13261a.m80524f().m80529b(jSONObject).m80530c(new Date(f55092h.currentTimeMillis())).m80528a());
        m80466X("RemoteConfig", "fetchAndActive");
        return Boolean.TRUE;
    }

    /* JADX INFO: renamed from: P */
    public final /* synthetic */ void m80494P(uxj0 uxj0Var) {
        ConfigStep configStepM80489K = m80489K();
        m80466X("RemoteConfig", "ABManager callback : Device: curStatus : " + configStepM80489K);
        ConfigStep configStep = ConfigStep.DEVICE;
        if (configStepM80489K == configStep) {
            m80505d0(configStep, ABManager.m30339e());
        }
    }

    /* JADX INFO: renamed from: Q */
    public final /* synthetic */ void m80495Q(uxj0 uxj0Var) {
        ConfigStep configStepM80489K = m80489K();
        m80466X("RemoteConfig", "ABManager callback : UID: curStatus : " + configStepM80489K);
        ConfigStep configStep = ConfigStep.UID;
        if (configStepM80489K == configStep) {
            m80505d0(configStep, ABManager.m30336c0());
        }
    }

    /* JADX INFO: renamed from: R */
    public final /* synthetic */ void m80496R(uxj0 uxj0Var) {
        m80466X("RemoteConfig", "ABManager callback : USER: ");
        m80505d0(ConfigStep.USER, ABManager.m30333b().get());
    }

    /* JADX INFO: renamed from: S */
    public final /* synthetic */ Pair m80497S(String str, ConfigStep configStep) throws Exception {
        JSONObject jSONObject;
        boolean zOptBoolean;
        String strOptString;
        boolean zOptBoolean2;
        String strM168010A;
        try {
            jSONObject = new JSONObject(str);
        } catch (JSONException unused) {
            jSONObject = null;
        }
        if (jSONObject == null) {
            return null;
        }
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("remoteStrategy");
        if (jSONObjectOptJSONObject != null) {
            strOptString = jSONObjectOptJSONObject.optString("md5");
            zOptBoolean = jSONObjectOptJSONObject.optBoolean(BLiveOperationActionAfterCountdown.refresh);
            zOptBoolean2 = jSONObjectOptJSONObject.optBoolean("increaseUpdate");
        } else {
            zOptBoolean = true;
            strOptString = "";
            zOptBoolean2 = false;
        }
        m80466X("RemoteConfig", "newMD5:" + strOptString + " needRefreshCache:" + zOptBoolean + " increaseUpdate:" + zOptBoolean2);
        if (!zOptBoolean) {
            return null;
        }
        if (!zOptBoolean2) {
            JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject("remoteConfigs");
            if (jSONObjectOptJSONObject2 == null) {
                return null;
            }
            m80466X("RemoteConfig", "fullUpdate:" + jSONObjectOptJSONObject2);
            return new Pair(jSONObjectOptJSONObject2, strOptString);
        }
        JSONObject jSONObjectOptJSONObject3 = jSONObject.optJSONObject("increaseRemoteConfigs");
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("increaseDeletedKeys");
        bw5 bw5VarM164951d = m80484E(configStep).m164951d();
        C13261a c13261aM106640d = bw5VarM164951d.m106640d();
        if (c13261aM106640d != null) {
            Map<String, String> mapM80525c = c13261aM106640d.m80525c();
            m80466X("RemoteConfig", "increaseUpdate before size:" + mapM80525c.size());
            if (jSONObjectOptJSONObject3 != null) {
                Iterator<String> itKeys = jSONObjectOptJSONObject3.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    mapM80525c.put(next, jSONObjectOptJSONObject3.optString(next));
                }
            }
            m80466X("RemoteConfig", "increaseUpdate after increase size:" + mapM80525c.size());
            if (jSONArrayOptJSONArray != null) {
                int length = jSONArrayOptJSONArray.length();
                for (int i = 0; i < length; i++) {
                    mapM80525c.remove(jSONArrayOptJSONArray.optString(i));
                }
            }
            m80466X("RemoteConfig", "increaseUpdate after delete size:" + mapM80525c.size());
            return new Pair(new JSONObject(mapM80525c), strOptString);
        }
        m80466X("RemoteConfig", "activeConfigContainer == null");
        String strM106642g = bw5VarM164951d.m106642g();
        File fileStreamPath = this.f55102e.getFileStreamPath(strM106642g);
        if (fileStreamPath.exists()) {
            long length2 = fileStreamPath.length();
            try {
                strM168010A = oki.m168010A(fileStreamPath);
            } catch (Throwable th) {
                strM168010A = "error : " + xtb.m213048b(th);
            }
            m80466X("RemoteConfig", "file exists , fileName=" + strM106642g + ", length=" + length2 + ", content=" + strM168010A);
        } else {
            m80466X("RemoteConfig", "file not exists , file=" + fileStreamPath.getAbsolutePath());
        }
        m80504b0();
        return null;
    }

    /* JADX INFO: renamed from: T */
    public final /* synthetic */ jni0 m80498T(ConfigStep configStep, Pair pair, Boolean bool) throws Exception {
        return m80510p(bool.booleanValue(), configStep, (String) pair.second);
    }

    /* JADX INFO: renamed from: U */
    public final /* synthetic */ jni0 m80499U(final ConfigStep configStep, jni0 jni0Var) throws Exception {
        m80466X("RemoteConfig", "update disk data:step:" + configStep + " data:" + jni0Var.mo121512g());
        if (jni0Var.mo121512g() == null) {
            return soi0.m187244e(Boolean.TRUE);
        }
        final Pair pair = (Pair) jni0Var.mo121512g();
        return m80511q(configStep, (JSONObject) pair.first).mo121515j(m80506e0(), new ydg0() { // from class: l.uxc0
            @Override // p153l.ydg0
            public final jni0 then(Object obj) {
                return this.f181423a.m80498T(configStep, pair, (Boolean) obj);
            }
        });
    }

    /* JADX INFO: renamed from: V */
    public final /* synthetic */ void m80500V() {
        vu2.m202772d("RemoteConfig", new JSONObject(Maps.m16069D(m80512r(), new adj() { // from class: l.wxc0
            @Override // p153l.adj
            public final Object apply(Object obj) {
                return ((hyc0) obj).asString();
            }
        })).toString());
    }

    /* JADX INFO: renamed from: W */
    public final /* synthetic */ Object m80501W(ConfigStep configStep, jni0 jni0Var) throws Exception {
        boolean zBooleanValue = ((Boolean) ((jni0) jni0Var.mo121512g()).mo121512g()).booleanValue();
        LruCache<String, Object> lruCache = this.f55103f;
        if (lruCache != null) {
            lruCache.evictAll();
        }
        m80466X("RemoteConfig", "updateWithAb complete and notify listeners:" + configStep + " result:" + zBooleanValue);
        Objects.toString(configStep);
        Objects.toString(Thread.currentThread());
        f55096l.onNext(configStep);
        Objects.toString(configStep);
        Objects.toString(Thread.currentThread());
        l51.m152919y(new Runnable() { // from class: l.vxc0
            @Override // java.lang.Runnable
            public final void run() {
                this.f186254a.m80500V();
            }
        });
        return null;
    }

    /* JADX INFO: renamed from: Z */
    public final boolean m80502Z(ConfigStep configStep, jni0<C13261a> jni0Var) {
        if (!jni0Var.mo121514i()) {
            return false;
        }
        m80484E(configStep).m164956l().m106638b();
        LruCache<String, Object> lruCache = this.f55103f;
        if (lruCache == null) {
            return true;
        }
        lruCache.evictAll();
        return true;
    }

    /* JADX INFO: renamed from: a0 */
    public final void m80503a0() {
        ABManager.m30353n().subscribe(psd0.m173596G(new y20() { // from class: l.lxc0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f133920a.m80494P((uxj0) obj);
            }
        }));
        ABManager.m30355p().subscribe(psd0.m173596G(new y20() { // from class: l.pxc0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f154557a.m80495Q((uxj0) obj);
            }
        }));
        ABManager.m30357r().subscribe(psd0.m173596G(new y20() { // from class: l.qxc0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f160033a.m80496R((uxj0) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: b0 */
    public jni0<Void> m80504b0() {
        m80466X("RemoteConfig", "reset");
        ConfigStep configStep = ConfigStep.USER;
        bw5 bw5VarM164956l = m80484E(configStep).m164956l();
        m80484E(configStep).m164951d().m106638b();
        bw5VarM164956l.m106638b();
        LruCache<String, Object> lruCache = this.f55103f;
        if (lruCache != null) {
            lruCache.evictAll();
        }
        f55094j.clear();
        f55093i.clear();
        f55095k.clear();
        m80509o();
        return soi0.m187244e(null);
    }

    /* JADX INFO: renamed from: d0 */
    public void m80505d0(final ConfigStep configStep, final String str) {
        soi0.m187241b(m80506e0(), new Callable() { // from class: l.rxc0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f165328a.m80497S(str, configStep);
            }
        }).mo121509d(m80506e0(), new t26() { // from class: l.sxc0
            @Override // p153l.t26
            /* JADX INFO: renamed from: a */
            public final Object mo165110a(jni0 jni0Var) {
                return this.f171126a.m80499U(configStep, jni0Var);
            }
        }).mo121509d(m80506e0(), new t26() { // from class: l.txc0
            @Override // p153l.t26
            /* JADX INFO: renamed from: a */
            public final Object mo165110a(jni0 jni0Var) {
                return this.f176541a.m80501W(configStep, jni0Var);
            }
        });
    }

    /* JADX INFO: renamed from: e0 */
    public final f2e0 m80506e0() {
        return Schedulers.trampoline();
    }

    /* JADX INFO: renamed from: m */
    public jni0<Boolean> m80507m(final ConfigStep configStep) {
        bw5 bw5VarM164956l = m80484E(configStep).m164956l();
        final bw5 bw5VarM164951d = m80484E(configStep).m164951d();
        final jni0<C13261a> jni0VarM106639c = bw5VarM164956l.m106639c();
        final jni0<C13261a> jni0VarM106639c2 = bw5VarM164951d.m106639c();
        m80466X("RemoteConfig", " activate");
        return soi0.m187248i(m80506e0(), jni0VarM106639c, jni0VarM106639c2).mo121510e(m80506e0(), new t26() { // from class: l.nxc0
            @Override // p153l.t26
            /* JADX INFO: renamed from: a */
            public final Object mo165110a(jni0 jni0Var) {
                return this.f144109a.m80491M(jni0VarM106639c, jni0VarM106639c2, bw5VarM164951d, configStep, jni0Var);
            }
        });
    }

    /* JADX INFO: renamed from: n */
    public void m80508n(ConfigStep configStep, JSONObject jSONObject) throws JSONException {
        m80484E(configStep).m164951d().m106643h(C13261a.m80524f().m80529b(jSONObject).m80530c(new Date(f55092h.currentTimeMillis())).m80528a());
    }

    /* JADX INFO: renamed from: o */
    public final void m80509o() {
        m80466X("RemoteConfig", "activePresetDataIfNeeded");
        boolean zEquals = TextUtils.equals(f55095k.get(), uqb0.f180413s);
        boolean z = true;
        boolean z2 = !zEquals || m80487H();
        if (zEquals && !m80488J()) {
            z = false;
        }
        if (z2 || z) {
            InputStream inputStreamOpen = null;
            try {
                inputStreamOpen = this.f55102e.getResources().getAssets().open(TextUtils.equals(qv5.f159697a.get(), "tantanapp") ? "rc_release_default.json" : "rc_debug_default.json");
                int iAvailable = inputStreamOpen.available();
                byte[] bArr = new byte[iAvailable];
                inputStreamOpen.read(bArr, 0, iAvailable);
                String str = new String(bArr, "UTF-8");
                if (TextUtils.isEmpty(str)) {
                    return;
                }
                JSONObject jSONObject = new JSONObject(str);
                JSONObject jSONObject2 = jSONObject.getJSONObject("remoteConfigs");
                String string = jSONObject.getString("md5");
                if (z2) {
                    m80508n(ConfigStep.DEVICE, jSONObject2);
                    f55093i.put(string);
                    this.f55102e.deleteFile(this.f55101d);
                }
                if (z) {
                    m80508n(ConfigStep.USER, jSONObject2);
                    f55094j.put(string);
                    this.f55102e.deleteFile(this.f55100c);
                }
                f55095k.put(uqb0.f180413s);
                m80466X("RemoteConfig", "activePresetDataIfNeeded use assets config");
            } catch (FileNotFoundException e) {
                CrashHelper.m82479c(e);
                if (z2) {
                    f55093i.clear();
                    this.f55102e.deleteFile(this.f55101d);
                }
                if (z) {
                    f55094j.clear();
                    this.f55102e.deleteFile(this.f55100c);
                }
            } catch (Exception e2) {
                CrashHelper.m82479c(e2);
            } finally {
                ua5.m195158b(inputStreamOpen);
            }
        }
    }

    /* JADX INFO: renamed from: p */
    public final jni0<Boolean> m80510p(boolean z, ConfigStep configStep, String str) {
        m80466X("RemoteConfig", "afterActive save md5, result:" + z + "  step:" + configStep + " md5:" + str);
        if (z) {
            if (configStep == ConfigStep.USER || configStep == ConfigStep.UID) {
                f55094j.put(str);
                f55095k.put(uqb0.f180413s);
            } else {
                f55093i.put(str);
                f55095k.put(uqb0.f180413s);
            }
        }
        return soi0.m187244e(Boolean.TRUE);
    }

    /* JADX INFO: renamed from: q */
    public jni0<Boolean> m80511q(final ConfigStep configStep, final JSONObject jSONObject) {
        return soi0.m187241b(m80506e0(), new Callable() { // from class: l.xxc0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f196627a.m80493O(jSONObject, configStep);
            }
        }).mo121515j(m80506e0(), new ydg0() { // from class: l.mxc0
            @Override // p153l.ydg0
            public final jni0 then(Object obj) {
                return this.f139223a.m80492N(configStep, (Boolean) obj);
            }
        });
    }

    @NonNull
    /* JADX INFO: renamed from: r */
    public Map<String, hyc0> m80512r() {
        return m80515u().m164952e();
    }

    /* JADX INFO: renamed from: s */
    public boolean m80513s(@NonNull String str) {
        return m80515u().m164953f(str);
    }

    /* JADX INFO: renamed from: t */
    public final bw5 m80514t(String str) {
        return bw5.m106636f(rw5.m183342c(this.f55102e, str));
    }

    /* JADX INFO: renamed from: u */
    public final nw5 m80515u() {
        return m80484E(m80489K());
    }

    /* JADX INFO: renamed from: v */
    public <T> T m80516v(@NonNull String str, @NonNull JsonAdapter<T> jsonAdapter) throws RemoteConfigException {
        try {
            T t = (T) this.f55103f.get(str);
            if (t != null) {
                return t;
            }
            String strM80485F = m80485F(str);
            if (TextUtils.isEmpty(strM80485F)) {
                return null;
            }
            T t2 = jsonAdapter.parse(strM80485F);
            this.f55103f.put(str, t2);
            return t2;
        } catch (IOException e) {
            throw new RemoteConfigException(e.getMessage() == null ? "RemoteConfig JsonAdapter Parse Error" : e.getMessage());
        }
    }

    /* JADX INFO: renamed from: w */
    public double m80517w(@NonNull String str) {
        return m80515u().m164954i(str);
    }

    /* JADX INFO: renamed from: y */
    public int m80518y(@NonNull String str) {
        return m80515u().m164957m(str);
    }

    /* JADX INFO: renamed from: z */
    public int m80519z(@NonNull String str, int i) {
        return m80515u().m164958n(str, i);
    }
}
