package com.p046p1.mobile.putong.remote_config;

import android.content.Context;
import android.text.TextUtils;
import android.util.LruCache;
import android.util.Pair;
import androidx.annotation.NonNull;
import com.google.common.collect.Maps;
import com.google.firebase.remoteconfig.RemoteConfigComponent;
import com.p046p1.mobile.putong.api.ABManager;
import com.p046p1.mobile.putong.app.TantanApp;
import com.p046p1.mobile.putong.live.base.data.BLiveOperationActionAfterCountdown;
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
import p133rx.C22306c;
import p133rx.schedulers.Schedulers;
import p133rx.subjects.C22392a;
import p149l.bud0;
import p149l.cqc0;
import p149l.du2;
import p149l.e30;
import p149l.e51;
import p149l.epd0;
import p149l.f16;
import p149l.fu2;
import p149l.gaj;
import p149l.imd;
import p149l.iv5;
import p149l.jei0;
import p149l.jsb;
import p149l.mkd0;
import p149l.mu5;
import p149l.mv5;
import p149l.o16;
import p149l.q5g0;
import p149l.q95;
import p149l.qib0;
import p149l.qif0;
import p149l.rhi;
import p149l.roj0;
import p149l.sfi0;
import p149l.t95;
import p149l.uqd0;
import p149l.xu5;

/* JADX INFO: loaded from: classes11.dex */
public class RemoteConfig {

    /* JADX INFO: renamed from: g */
    public static final byte[] f54243g = new byte[0];

    /* JADX INFO: renamed from: h */
    public static final q95 f54244h = imd.m137068a();

    /* JADX INFO: renamed from: i */
    public static uqd0 f54245i = new uqd0("saved_device_uid_md5", "");

    /* JADX INFO: renamed from: j */
    public static uqd0 f54246j = new uqd0("saved_user_md5", "");

    /* JADX INFO: renamed from: k */
    public static uqd0 f54247k = new uqd0("saved_md5_version", "");

    /* JADX INFO: renamed from: l */
    public static C22392a<ConfigStep> f54248l = C22392a.m221512b();

    /* JADX INFO: renamed from: m */
    public static final qif0<RemoteConfig> f54249m = new C13096a();

    /* JADX INFO: renamed from: a */
    public String f54250a;

    /* JADX INFO: renamed from: b */
    public String f54251b;

    /* JADX INFO: renamed from: c */
    public String f54252c;

    /* JADX INFO: renamed from: d */
    public String f54253d;

    /* JADX INFO: renamed from: e */
    public Context f54254e;

    /* JADX INFO: renamed from: f */
    public LruCache<String, Object> f54255f;

    public enum ConfigStep {
        DEVICE,
        UID,
        USER
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.remote_config.RemoteConfig$a */
    public class C13096a extends qif0<RemoteConfig> {
        @Override // p149l.qif0
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public RemoteConfig mo79337a() {
            return new RemoteConfig();
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.remote_config.RemoteConfig$b */
    public static /* synthetic */ class C13097b {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f54256a;

        static {
            int[] iArr = new int[ConfigStep.values().length];
            f54256a = iArr;
            try {
                iArr[ConfigStep.DEVICE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f54256a[ConfigStep.UID.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f54256a[ConfigStep.USER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public RemoteConfig() {
        this.f54254e = f16.m119092a().getApplicationContext();
        this.f54250a = String.format("%s_%s.json", "rc", "activate");
        this.f54251b = String.format("%s_%s.json", "rc", "activate_device");
        this.f54252c = String.format("%s_%s.json", "rc", RemoteConfigComponent.FETCH_FILE_NAME);
        this.f54253d = String.format("%s_%s.json", "rc", "fetch_device");
        m79326o();
        File fileStreamPath = this.f54254e.getFileStreamPath(this.f54250a);
        int iMax = Math.max(30, (fileStreamPath == null || !fileStreamPath.exists()) ? 0 : (int) (fileStreamPath.length() / 600));
        m79283X("RemoteConfig", "init lur cache size:" + iMax);
        this.f54255f = new LruCache<>(iMax);
        m79320a0();
    }

    /* JADX INFO: renamed from: C */
    public static String m79280C() {
        return f54245i.get();
    }

    /* JADX INFO: renamed from: D */
    public static String m79281D() {
        return f54246j.get();
    }

    /* JADX INFO: renamed from: I */
    public static boolean m79282I(C13098a c13098a, C13098a c13098a2) {
        return c13098a2 == null || !c13098a.m79344e().equals(c13098a2.m79344e());
    }

    /* JADX INFO: renamed from: X */
    public static void m79283X(String str, String str2) {
        du2.m113670a(str, str2);
    }

    /* JADX INFO: renamed from: Y */
    public static C22306c<ConfigStep> m79284Y() {
        return f54248l.onBackpressureLatest().observeOn(Schedulers.computation());
    }

    /* JADX INFO: renamed from: c0 */
    public static void m79288c0() {
        f54248l.onNext(null);
    }

    /* JADX INFO: renamed from: x */
    public static RemoteConfig m79298x() {
        return f54249m.m174875b();
    }

    /* JADX INFO: renamed from: A */
    public long m79299A(@NonNull String str) {
        return m79332u().m138528q(str);
    }

    /* JADX INFO: renamed from: B */
    public long m79300B(@NonNull String str, long j) {
        return m79332u().m138529r(str, j);
    }

    /* JADX INFO: renamed from: E */
    public final iv5 m79301E(ConfigStep configStep) {
        String str;
        String str2;
        if (C13097b.f54256a[configStep.ordinal()] != 1) {
            str = this.f54252c;
            str2 = this.f54250a;
        } else {
            str = this.f54253d;
            str2 = this.f54251b;
        }
        if (iv5.m138511g(str2, str) == null) {
            synchronized (RemoteConfig.class) {
                try {
                    if (iv5.m138511g(str2, str) == null) {
                        iv5.m138510c(m79331t(str2), m79331t(str));
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return iv5.m138511g(str2, str);
    }

    @NonNull
    /* JADX INFO: renamed from: F */
    public String m79302F(@NonNull String str) {
        return m79332u().m138530t(str);
    }

    @NonNull
    /* JADX INFO: renamed from: G */
    public cqc0 m79303G(@NonNull String str) {
        return m79332u().m138531v(str);
    }

    /* JADX INFO: renamed from: H */
    public final boolean m79304H() {
        if (TextUtils.equals(f54245i.get(), "")) {
            return true;
        }
        File fileStreamPath = this.f54254e.getFileStreamPath(this.f54251b);
        return !fileStreamPath.exists() || fileStreamPath.length() == 0;
    }

    /* JADX INFO: renamed from: J */
    public final boolean m79305J() {
        if (TextUtils.equals(f54246j.get(), "")) {
            return true;
        }
        File fileStreamPath = this.f54254e.getFileStreamPath(this.f54250a);
        return !fileStreamPath.exists() || fileStreamPath.length() == 0;
    }

    /* JADX INFO: renamed from: K */
    public ConfigStep m79306K() {
        epd0 epd0Var = TantanApp.f17182e;
        if (epd0Var.mo108248b() != null) {
            return (epd0Var.mo108248b() == null || !TantanApp.f17181d.mo108248b().booleanValue()) ? ConfigStep.UID : ConfigStep.USER;
        }
        return ConfigStep.DEVICE;
    }

    /* JADX INFO: renamed from: L */
    public final /* synthetic */ Boolean m79307L(ConfigStep configStep, jei0 jei0Var) throws Exception {
        return Boolean.valueOf(m79319Z(configStep, jei0Var));
    }

    /* JADX INFO: renamed from: M */
    public final /* synthetic */ jei0 m79308M(jei0 jei0Var, jei0 jei0Var2, xu5 xu5Var, final ConfigStep configStep, jei0 jei0Var3) throws Exception {
        if (!jei0Var.mo141144i() || jei0Var.mo141142g() == null) {
            return sfi0.m183933e(Boolean.FALSE);
        }
        C13098a c13098a = (C13098a) jei0Var.mo141142g();
        return (!jei0Var2.mo141144i() || m79282I(c13098a, (C13098a) jei0Var2.mo141142g())) ? xu5Var.m211087h(c13098a).mo141139d(m79323e0(), new o16() { // from class: l.jpc0
            @Override // p149l.o16
            /* JADX INFO: renamed from: a */
            public final Object mo137471a(jei0 jei0Var4) {
                return this.f119147a.m79307L(configStep, jei0Var4);
            }
        }) : sfi0.m183933e(Boolean.FALSE);
    }

    /* JADX INFO: renamed from: N */
    public final /* synthetic */ jei0 m79309N(ConfigStep configStep, Boolean bool) throws Exception {
        return m79324m(configStep);
    }

    /* JADX INFO: renamed from: O */
    public final /* synthetic */ Boolean m79310O(JSONObject jSONObject, ConfigStep configStep) throws Exception {
        m79301E(configStep).m138525l().m211087h(C13098a.m79341f().m79346b(jSONObject).m79347c(new Date(f54244h.currentTimeMillis())).m79345a());
        m79283X("RemoteConfig", "fetchAndActive");
        return Boolean.TRUE;
    }

    /* JADX INFO: renamed from: P */
    public final /* synthetic */ void m79311P(roj0 roj0Var) {
        ConfigStep configStepM79306K = m79306K();
        m79283X("RemoteConfig", "ABManager callback : Device: curStatus : " + configStepM79306K);
        ConfigStep configStep = ConfigStep.DEVICE;
        if (configStepM79306K == configStep) {
            m79322d0(configStep, ABManager.m29341e());
        }
    }

    /* JADX INFO: renamed from: Q */
    public final /* synthetic */ void m79312Q(roj0 roj0Var) {
        ConfigStep configStepM79306K = m79306K();
        m79283X("RemoteConfig", "ABManager callback : UID: curStatus : " + configStepM79306K);
        ConfigStep configStep = ConfigStep.UID;
        if (configStepM79306K == configStep) {
            m79322d0(configStep, ABManager.m29338c0());
        }
    }

    /* JADX INFO: renamed from: R */
    public final /* synthetic */ void m79313R(roj0 roj0Var) {
        m79283X("RemoteConfig", "ABManager callback : USER: ");
        m79322d0(ConfigStep.USER, ABManager.m29335b().get());
    }

    /* JADX INFO: renamed from: S */
    public final /* synthetic */ Pair m79314S(String str, ConfigStep configStep) throws Exception {
        JSONObject jSONObject;
        boolean zOptBoolean;
        String strOptString;
        boolean zOptBoolean2;
        String strM179354A;
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
        m79283X("RemoteConfig", "newMD5:" + strOptString + " needRefreshCache:" + zOptBoolean + " increaseUpdate:" + zOptBoolean2);
        if (!zOptBoolean) {
            return null;
        }
        if (!zOptBoolean2) {
            JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject("remoteConfigs");
            if (jSONObjectOptJSONObject2 == null) {
                return null;
            }
            m79283X("RemoteConfig", "fullUpdate:" + jSONObjectOptJSONObject2);
            return new Pair(jSONObjectOptJSONObject2, strOptString);
        }
        JSONObject jSONObjectOptJSONObject3 = jSONObject.optJSONObject("increaseRemoteConfigs");
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("increaseDeletedKeys");
        xu5 xu5VarM138520d = m79301E(configStep).m138520d();
        C13098a c13098aM211084d = xu5VarM138520d.m211084d();
        if (c13098aM211084d != null) {
            Map<String, String> mapM79342c = c13098aM211084d.m79342c();
            m79283X("RemoteConfig", "increaseUpdate before size:" + mapM79342c.size());
            if (jSONObjectOptJSONObject3 != null) {
                Iterator<String> itKeys = jSONObjectOptJSONObject3.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    mapM79342c.put(next, jSONObjectOptJSONObject3.optString(next));
                }
            }
            m79283X("RemoteConfig", "increaseUpdate after increase size:" + mapM79342c.size());
            if (jSONArrayOptJSONArray != null) {
                int length = jSONArrayOptJSONArray.length();
                for (int i = 0; i < length; i++) {
                    mapM79342c.remove(jSONArrayOptJSONArray.optString(i));
                }
            }
            m79283X("RemoteConfig", "increaseUpdate after delete size:" + mapM79342c.size());
            return new Pair(new JSONObject(mapM79342c), strOptString);
        }
        m79283X("RemoteConfig", "activeConfigContainer == null");
        String strM211086g = xu5VarM138520d.m211086g();
        File fileStreamPath = this.f54254e.getFileStreamPath(strM211086g);
        if (fileStreamPath.exists()) {
            long length2 = fileStreamPath.length();
            try {
                strM179354A = rhi.m179354A(fileStreamPath);
            } catch (Throwable th) {
                strM179354A = "error : " + jsb.m143009b(th);
            }
            m79283X("RemoteConfig", "file exists , fileName=" + strM211086g + ", length=" + length2 + ", content=" + strM179354A);
        } else {
            m79283X("RemoteConfig", "file not exists , file=" + fileStreamPath.getAbsolutePath());
        }
        m79321b0();
        return null;
    }

    /* JADX INFO: renamed from: T */
    public final /* synthetic */ jei0 m79315T(ConfigStep configStep, Pair pair, Boolean bool) throws Exception {
        return m79327p(bool.booleanValue(), configStep, (String) pair.second);
    }

    /* JADX INFO: renamed from: U */
    public final /* synthetic */ jei0 m79316U(final ConfigStep configStep, jei0 jei0Var) throws Exception {
        m79283X("RemoteConfig", "update disk data:step:" + configStep + " data:" + jei0Var.mo141142g());
        if (jei0Var.mo141142g() == null) {
            return sfi0.m183933e(Boolean.TRUE);
        }
        final Pair pair = (Pair) jei0Var.mo141142g();
        return m79328q(configStep, (JSONObject) pair.first).mo141145j(m79323e0(), new q5g0() { // from class: l.ppc0
            @Override // p149l.q5g0
            public final jei0 then(Object obj) {
                return this.f150637a.m79315T(configStep, pair, (Boolean) obj);
            }
        });
    }

    /* JADX INFO: renamed from: V */
    public final /* synthetic */ void m79317V() {
        fu2.m123134d("RemoteConfig", new JSONObject(Maps.m16015D(m79329r(), new gaj() { // from class: l.rpc0
            @Override // p149l.gaj
            public final Object apply(Object obj) {
                return ((cqc0) obj).asString();
            }
        })).toString());
    }

    /* JADX INFO: renamed from: W */
    public final /* synthetic */ Object m79318W(ConfigStep configStep, jei0 jei0Var) throws Exception {
        boolean zBooleanValue = ((Boolean) ((jei0) jei0Var.mo141142g()).mo141142g()).booleanValue();
        LruCache<String, Object> lruCache = this.f54255f;
        if (lruCache != null) {
            lruCache.evictAll();
        }
        m79283X("RemoteConfig", "updateWithAb complete and notify listeners:" + configStep + " result:" + zBooleanValue);
        Objects.toString(configStep);
        Objects.toString(Thread.currentThread());
        f54248l.onNext(configStep);
        Objects.toString(configStep);
        Objects.toString(Thread.currentThread());
        e51.m114774y(new Runnable() { // from class: l.qpc0
            @Override // java.lang.Runnable
            public final void run() {
                this.f155744a.m79317V();
            }
        });
        return null;
    }

    /* JADX INFO: renamed from: Z */
    public final boolean m79319Z(ConfigStep configStep, jei0<C13098a> jei0Var) {
        if (!jei0Var.mo141144i()) {
            return false;
        }
        m79301E(configStep).m138525l().m211082b();
        LruCache<String, Object> lruCache = this.f54255f;
        if (lruCache == null) {
            return true;
        }
        lruCache.evictAll();
        return true;
    }

    /* JADX INFO: renamed from: a0 */
    public final void m79320a0() {
        ABManager.m29355n().subscribe(mkd0.m154955G(new e30() { // from class: l.gpc0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f103779a.m79311P((roj0) obj);
            }
        }));
        ABManager.m29357p().subscribe(mkd0.m154955G(new e30() { // from class: l.kpc0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f124133a.m79312Q((roj0) obj);
            }
        }));
        ABManager.m29359r().subscribe(mkd0.m154955G(new e30() { // from class: l.lpc0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f129190a.m79313R((roj0) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: b0 */
    public jei0<Void> m79321b0() {
        m79283X("RemoteConfig", "reset");
        ConfigStep configStep = ConfigStep.USER;
        xu5 xu5VarM138525l = m79301E(configStep).m138525l();
        m79301E(configStep).m138520d().m211082b();
        xu5VarM138525l.m211082b();
        LruCache<String, Object> lruCache = this.f54255f;
        if (lruCache != null) {
            lruCache.evictAll();
        }
        f54246j.clear();
        f54245i.clear();
        f54247k.clear();
        m79326o();
        return sfi0.m183933e(null);
    }

    /* JADX INFO: renamed from: d0 */
    public void m79322d0(final ConfigStep configStep, final String str) {
        sfi0.m183930b(m79323e0(), new Callable() { // from class: l.mpc0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f135031a.m79314S(str, configStep);
            }
        }).mo141139d(m79323e0(), new o16() { // from class: l.npc0
            @Override // p149l.o16
            /* JADX INFO: renamed from: a */
            public final Object mo137471a(jei0 jei0Var) {
                return this.f139951a.m79316U(configStep, jei0Var);
            }
        }).mo141139d(m79323e0(), new o16() { // from class: l.opc0
            @Override // p149l.o16
            /* JADX INFO: renamed from: a */
            public final Object mo137471a(jei0 jei0Var) {
                return this.f144985a.m79318W(configStep, jei0Var);
            }
        });
    }

    /* JADX INFO: renamed from: e0 */
    public final bud0 m79323e0() {
        return Schedulers.trampoline();
    }

    /* JADX INFO: renamed from: m */
    public jei0<Boolean> m79324m(final ConfigStep configStep) {
        xu5 xu5VarM138525l = m79301E(configStep).m138525l();
        final xu5 xu5VarM138520d = m79301E(configStep).m138520d();
        final jei0<C13098a> jei0VarM211083c = xu5VarM138525l.m211083c();
        final jei0<C13098a> jei0VarM211083c2 = xu5VarM138520d.m211083c();
        m79283X("RemoteConfig", " activate");
        return sfi0.m183937i(m79323e0(), jei0VarM211083c, jei0VarM211083c2).mo141140e(m79323e0(), new o16() { // from class: l.ipc0
            @Override // p149l.o16
            /* JADX INFO: renamed from: a */
            public final Object mo137471a(jei0 jei0Var) {
                return this.f114287a.m79308M(jei0VarM211083c, jei0VarM211083c2, xu5VarM138520d, configStep, jei0Var);
            }
        });
    }

    /* JADX INFO: renamed from: n */
    public void m79325n(ConfigStep configStep, JSONObject jSONObject) throws JSONException {
        m79301E(configStep).m138520d().m211087h(C13098a.m79341f().m79346b(jSONObject).m79347c(new Date(f54244h.currentTimeMillis())).m79345a());
    }

    /* JADX INFO: renamed from: o */
    public final void m79326o() {
        m79283X("RemoteConfig", "activePresetDataIfNeeded");
        boolean zEquals = TextUtils.equals(f54247k.get(), qib0.f154730s);
        boolean z = true;
        boolean z2 = !zEquals || m79304H();
        if (zEquals && !m79305J()) {
            z = false;
        }
        if (z2 || z) {
            InputStream inputStreamOpen = null;
            try {
                inputStreamOpen = this.f54254e.getResources().getAssets().open(TextUtils.equals(mu5.f135733a.get(), "tantanapp") ? "rc_release_default.json" : "rc_debug_default.json");
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
                    m79325n(ConfigStep.DEVICE, jSONObject2);
                    f54245i.put(string);
                    this.f54254e.deleteFile(this.f54253d);
                }
                if (z) {
                    m79325n(ConfigStep.USER, jSONObject2);
                    f54246j.put(string);
                    this.f54254e.deleteFile(this.f54252c);
                }
                f54247k.put(qib0.f154730s);
                m79283X("RemoteConfig", "activePresetDataIfNeeded use assets config");
            } catch (FileNotFoundException e) {
                CrashHelper.m81296c(e);
                if (z2) {
                    f54245i.clear();
                    this.f54254e.deleteFile(this.f54253d);
                }
                if (z) {
                    f54246j.clear();
                    this.f54254e.deleteFile(this.f54252c);
                }
            } catch (Exception e2) {
                CrashHelper.m81296c(e2);
            } finally {
                t95.m187604b(inputStreamOpen);
            }
        }
    }

    /* JADX INFO: renamed from: p */
    public final jei0<Boolean> m79327p(boolean z, ConfigStep configStep, String str) {
        m79283X("RemoteConfig", "afterActive save md5, result:" + z + "  step:" + configStep + " md5:" + str);
        if (z) {
            if (configStep == ConfigStep.USER || configStep == ConfigStep.UID) {
                f54246j.put(str);
                f54247k.put(qib0.f154730s);
            } else {
                f54245i.put(str);
                f54247k.put(qib0.f154730s);
            }
        }
        return sfi0.m183933e(Boolean.TRUE);
    }

    /* JADX INFO: renamed from: q */
    public jei0<Boolean> m79328q(final ConfigStep configStep, final JSONObject jSONObject) {
        return sfi0.m183930b(m79323e0(), new Callable() { // from class: l.spc0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f165844a.m79310O(jSONObject, configStep);
            }
        }).mo141145j(m79323e0(), new q5g0() { // from class: l.hpc0
            @Override // p149l.q5g0
            public final jei0 then(Object obj) {
                return this.f108909a.m79309N(configStep, (Boolean) obj);
            }
        });
    }

    @NonNull
    /* JADX INFO: renamed from: r */
    public Map<String, cqc0> m79329r() {
        return m79332u().m138521e();
    }

    /* JADX INFO: renamed from: s */
    public boolean m79330s(@NonNull String str) {
        return m79332u().m138522f(str);
    }

    /* JADX INFO: renamed from: t */
    public final xu5 m79331t(String str) {
        return xu5.m211080f(mv5.m156470c(this.f54254e, str));
    }

    /* JADX INFO: renamed from: u */
    public final iv5 m79332u() {
        return m79301E(m79306K());
    }

    /* JADX INFO: renamed from: v */
    public <T> T m79333v(@NonNull String str, @NonNull JsonAdapter<T> jsonAdapter) throws RemoteConfigException {
        try {
            T t = (T) this.f54255f.get(str);
            if (t != null) {
                return t;
            }
            String strM79302F = m79302F(str);
            if (TextUtils.isEmpty(strM79302F)) {
                return null;
            }
            T t2 = jsonAdapter.parse(strM79302F);
            this.f54255f.put(str, t2);
            return t2;
        } catch (IOException e) {
            throw new RemoteConfigException(e.getMessage() == null ? "RemoteConfig JsonAdapter Parse Error" : e.getMessage());
        }
    }

    /* JADX INFO: renamed from: w */
    public double m79334w(@NonNull String str) {
        return m79332u().m138523i(str);
    }

    /* JADX INFO: renamed from: y */
    public int m79335y(@NonNull String str) {
        return m79332u().m138526m(str);
    }

    /* JADX INFO: renamed from: z */
    public int m79336z(@NonNull String str, int i) {
        return m79332u().m138527n(str, i);
    }
}
