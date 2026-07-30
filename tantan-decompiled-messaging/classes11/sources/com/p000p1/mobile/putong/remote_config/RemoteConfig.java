package com.p000p1.mobile.putong.remote_config;

import android.content.Context;
import android.text.TextUtils;
import android.util.LruCache;
import android.util.Pair;
import androidx.annotation.NonNull;
import com.google.common.collect.Maps;
import com.p1.mobile.putong.api.ABManager;
import com.p1.mobile.putong.app.TantanApp;
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
import l.bud0;
import l.du2;
import l.e30;
import l.e51;
import l.f16;
import l.gaj;
import l.jsb;
import l.mkd0;
import l.mu5;
import l.qib0;
import l.rhi;
import l.roj0;
import l.t95;
import l.uqd0;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p009l.cqc0;
import p009l.epd0;
import p009l.fu2;
import p009l.imd;
import p009l.iv5;
import p009l.jei0;
import p009l.mv5;
import p009l.o16;
import p009l.q5g0;
import p009l.q95;
import p009l.qif0;
import p009l.sfi0;
import p009l.xu5;
import rx.c;
import rx.schedulers.Schedulers;
import rx.subjects.a;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class RemoteConfig {

    /* JADX INFO: renamed from: g */
    public static final byte[] f7849g = new byte[0];

    /* JADX INFO: renamed from: h */
    public static final q95 f7850h = imd.m16642a();

    /* JADX INFO: renamed from: i */
    public static uqd0 f7851i = new uqd0("saved_device_uid_md5", "");

    /* JADX INFO: renamed from: j */
    public static uqd0 f7852j = new uqd0("saved_user_md5", "");

    /* JADX INFO: renamed from: k */
    public static uqd0 f7853k = new uqd0("saved_md5_version", "");

    /* JADX INFO: renamed from: l */
    public static a<ConfigStep> f7854l = a.b();

    /* JADX INFO: renamed from: m */
    public static final qif0<RemoteConfig> f7855m = new C0498a();

    /* JADX INFO: renamed from: a */
    public String f7856a;

    /* JADX INFO: renamed from: b */
    public String f7857b;

    /* JADX INFO: renamed from: c */
    public String f7858c;

    /* JADX INFO: renamed from: d */
    public String f7859d;

    /* JADX INFO: renamed from: e */
    public Context f7860e;

    /* JADX INFO: renamed from: f */
    public LruCache<String, Object> f7861f;

    public enum ConfigStep {
        DEVICE,
        UID,
        USER
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.remote_config.RemoteConfig$a */
    public class C0498a extends qif0<RemoteConfig> {
        @Override // p009l.qif0
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public RemoteConfig mo9658a() {
            return new RemoteConfig();
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.remote_config.RemoteConfig$b */
    public static /* synthetic */ class C0499b {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f7862a;

        static {
            int[] iArr = new int[ConfigStep.values().length];
            f7862a = iArr;
            try {
                iArr[ConfigStep.DEVICE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f7862a[ConfigStep.UID.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f7862a[ConfigStep.USER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public RemoteConfig() {
        this.f7860e = f16.a().getApplicationContext();
        this.f7856a = String.format("%s_%s.json", "rc", "activate");
        this.f7857b = String.format("%s_%s.json", "rc", "activate_device");
        this.f7858c = String.format("%s_%s.json", "rc", "fetch");
        this.f7859d = String.format("%s_%s.json", "rc", "fetch_device");
        m9647o();
        File fileStreamPath = this.f7860e.getFileStreamPath(this.f7856a);
        int iMax = Math.max(30, (fileStreamPath == null || !fileStreamPath.exists()) ? 0 : (int) (fileStreamPath.length() / 600));
        m9604X("RemoteConfig", "init lur cache size:" + iMax);
        this.f7861f = new LruCache<>(iMax);
        m9641a0();
    }

    /* JADX INFO: renamed from: C */
    public static String m9601C() {
        return (String) f7851i.get();
    }

    /* JADX INFO: renamed from: D */
    public static String m9602D() {
        return (String) f7852j.get();
    }

    /* JADX INFO: renamed from: I */
    public static boolean m9603I(C0500a c0500a, C0500a c0500a2) {
        return c0500a2 == null || !c0500a.m9665e().equals(c0500a2.m9665e());
    }

    /* JADX INFO: renamed from: X */
    public static void m9604X(String str, String str2) {
        du2.a(str, str2);
    }

    /* JADX INFO: renamed from: Y */
    public static c<ConfigStep> m9605Y() {
        return f7854l.onBackpressureLatest().observeOn(Schedulers.computation());
    }

    /* JADX INFO: renamed from: c0 */
    public static void m9609c0() {
        f7854l.onNext((Object) null);
    }

    /* JADX INFO: renamed from: x */
    public static RemoteConfig m9619x() {
        return f7855m.m21015b();
    }

    /* JADX INFO: renamed from: A */
    public long m9620A(@NonNull String str) {
        return m9653u().m16764q(str);
    }

    /* JADX INFO: renamed from: B */
    public long m9621B(@NonNull String str, long j) {
        return m9653u().m16765r(str, j);
    }

    /* JADX INFO: renamed from: E */
    public final iv5 m9622E(ConfigStep configStep) {
        String str;
        String str2;
        if (C0499b.f7862a[configStep.ordinal()] != 1) {
            str = this.f7858c;
            str2 = this.f7856a;
        } else {
            str = this.f7859d;
            str2 = this.f7857b;
        }
        if (iv5.m16747g(str2, str) == null) {
            synchronized (RemoteConfig.class) {
                try {
                    if (iv5.m16747g(str2, str) == null) {
                        iv5.m16746c(m9652t(str2), m9652t(str));
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return iv5.m16747g(str2, str);
    }

    @NonNull
    /* JADX INFO: renamed from: F */
    public String m9623F(@NonNull String str) {
        return m9653u().m16766t(str);
    }

    @NonNull
    /* JADX INFO: renamed from: G */
    public cqc0 m9624G(@NonNull String str) {
        return m9653u().m16767v(str);
    }

    /* JADX INFO: renamed from: H */
    public final boolean m9625H() {
        if (TextUtils.equals((CharSequence) f7851i.get(), "")) {
            return true;
        }
        File fileStreamPath = this.f7860e.getFileStreamPath(this.f7857b);
        return !fileStreamPath.exists() || fileStreamPath.length() == 0;
    }

    /* JADX INFO: renamed from: J */
    public final boolean m9626J() {
        if (TextUtils.equals((CharSequence) f7852j.get(), "")) {
            return true;
        }
        File fileStreamPath = this.f7860e.getFileStreamPath(this.f7856a);
        return !fileStreamPath.exists() || fileStreamPath.length() == 0;
    }

    /* JADX INFO: renamed from: K */
    public ConfigStep m9627K() {
        epd0 epd0Var = TantanApp.e;
        if (epd0Var.b() != null) {
            return (epd0Var.b() == null || !((Boolean) TantanApp.d.b()).booleanValue()) ? ConfigStep.UID : ConfigStep.USER;
        }
        return ConfigStep.DEVICE;
    }

    /* JADX INFO: renamed from: L */
    public final /* synthetic */ Boolean m9628L(ConfigStep configStep, jei0 jei0Var) throws Exception {
        return Boolean.valueOf(m9640Z(configStep, jei0Var));
    }

    /* JADX INFO: renamed from: M */
    public final /* synthetic */ jei0 m9629M(jei0 jei0Var, jei0 jei0Var2, xu5 xu5Var, final ConfigStep configStep, jei0 jei0Var3) throws Exception {
        if (!jei0Var.mo16964i() || jei0Var.mo16962g() == null) {
            return sfi0.m22139e(Boolean.FALSE);
        }
        C0500a c0500a = (C0500a) jei0Var.mo16962g();
        return (!jei0Var2.mo16964i() || m9603I(c0500a, (C0500a) jei0Var2.mo16962g())) ? xu5Var.m24998h(c0500a).mo16959d(m9644e0(), new o16() { // from class: l.jpc0
            @Override // p009l.o16
            /* JADX INFO: renamed from: a */
            public final Object mo16684a(jei0 jei0Var4) {
                return this.f15254a.m9628L(configStep, jei0Var4);
            }
        }) : sfi0.m22139e(Boolean.FALSE);
    }

    /* JADX INFO: renamed from: N */
    public final /* synthetic */ jei0 m9630N(ConfigStep configStep, Boolean bool) throws Exception {
        return m9645m(configStep);
    }

    /* JADX INFO: renamed from: O */
    public final /* synthetic */ Boolean m9631O(JSONObject jSONObject, ConfigStep configStep) throws Exception {
        m9622E(configStep).m16761l().m24998h(C0500a.m9662f().m9667b(jSONObject).m9668c(new Date(f7850h.currentTimeMillis())).m9666a());
        m9604X("RemoteConfig", "fetchAndActive");
        return Boolean.TRUE;
    }

    /* JADX INFO: renamed from: P */
    public final /* synthetic */ void m9632P(roj0 roj0Var) {
        ConfigStep configStepM9627K = m9627K();
        m9604X("RemoteConfig", "ABManager callback : Device: curStatus : " + configStepM9627K);
        ConfigStep configStep = ConfigStep.DEVICE;
        if (configStepM9627K == configStep) {
            m9643d0(configStep, ABManager.e());
        }
    }

    /* JADX INFO: renamed from: Q */
    public final /* synthetic */ void m9633Q(roj0 roj0Var) {
        ConfigStep configStepM9627K = m9627K();
        m9604X("RemoteConfig", "ABManager callback : UID: curStatus : " + configStepM9627K);
        ConfigStep configStep = ConfigStep.UID;
        if (configStepM9627K == configStep) {
            m9643d0(configStep, ABManager.c0());
        }
    }

    /* JADX INFO: renamed from: R */
    public final /* synthetic */ void m9634R(roj0 roj0Var) {
        m9604X("RemoteConfig", "ABManager callback : USER: ");
        m9643d0(ConfigStep.USER, (String) ABManager.b().get());
    }

    /* JADX INFO: renamed from: S */
    public final /* synthetic */ Pair m9635S(String str, ConfigStep configStep) throws Exception {
        JSONObject jSONObject;
        boolean zOptBoolean;
        String strOptString;
        boolean zOptBoolean2;
        String strA;
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
            zOptBoolean = jSONObjectOptJSONObject.optBoolean("refresh");
            zOptBoolean2 = jSONObjectOptJSONObject.optBoolean("increaseUpdate");
        } else {
            zOptBoolean = true;
            strOptString = "";
            zOptBoolean2 = false;
        }
        m9604X("RemoteConfig", "newMD5:" + strOptString + " needRefreshCache:" + zOptBoolean + " increaseUpdate:" + zOptBoolean2);
        if (!zOptBoolean) {
            return null;
        }
        if (!zOptBoolean2) {
            JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject("remoteConfigs");
            if (jSONObjectOptJSONObject2 == null) {
                return null;
            }
            m9604X("RemoteConfig", "fullUpdate:" + jSONObjectOptJSONObject2);
            return new Pair(jSONObjectOptJSONObject2, strOptString);
        }
        JSONObject jSONObjectOptJSONObject3 = jSONObject.optJSONObject("increaseRemoteConfigs");
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("increaseDeletedKeys");
        xu5 xu5VarM16756d = m9622E(configStep).m16756d();
        C0500a c0500aM24995d = xu5VarM16756d.m24995d();
        if (c0500aM24995d != null) {
            Map<String, String> mapM9663c = c0500aM24995d.m9663c();
            m9604X("RemoteConfig", "increaseUpdate before size:" + mapM9663c.size());
            if (jSONObjectOptJSONObject3 != null) {
                Iterator<String> itKeys = jSONObjectOptJSONObject3.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    mapM9663c.put(next, jSONObjectOptJSONObject3.optString(next));
                }
            }
            m9604X("RemoteConfig", "increaseUpdate after increase size:" + mapM9663c.size());
            if (jSONArrayOptJSONArray != null) {
                int length = jSONArrayOptJSONArray.length();
                for (int i = 0; i < length; i++) {
                    mapM9663c.remove(jSONArrayOptJSONArray.optString(i));
                }
            }
            m9604X("RemoteConfig", "increaseUpdate after delete size:" + mapM9663c.size());
            return new Pair(new JSONObject(mapM9663c), strOptString);
        }
        m9604X("RemoteConfig", "activeConfigContainer == null");
        String strM24997g = xu5VarM16756d.m24997g();
        File fileStreamPath = this.f7860e.getFileStreamPath(strM24997g);
        if (fileStreamPath.exists()) {
            long length2 = fileStreamPath.length();
            try {
                strA = rhi.A(fileStreamPath);
            } catch (Throwable th) {
                strA = "error : " + jsb.b(th);
            }
            m9604X("RemoteConfig", "file exists , fileName=" + strM24997g + ", length=" + length2 + ", content=" + strA);
        } else {
            m9604X("RemoteConfig", "file not exists , file=" + fileStreamPath.getAbsolutePath());
        }
        m9642b0();
        return null;
    }

    /* JADX INFO: renamed from: T */
    public final /* synthetic */ jei0 m9636T(ConfigStep configStep, Pair pair, Boolean bool) throws Exception {
        return m9648p(bool.booleanValue(), configStep, (String) pair.second);
    }

    /* JADX INFO: renamed from: U */
    public final /* synthetic */ jei0 m9637U(final ConfigStep configStep, jei0 jei0Var) throws Exception {
        m9604X("RemoteConfig", "update disk data:step:" + configStep + " data:" + jei0Var.mo16962g());
        if (jei0Var.mo16962g() == null) {
            return sfi0.m22139e(Boolean.TRUE);
        }
        final Pair pair = (Pair) jei0Var.mo16962g();
        return m9649q(configStep, (JSONObject) pair.first).mo16965j(m9644e0(), new q5g0() { // from class: l.ppc0
            @Override // p009l.q5g0
            public final jei0 then(Object obj) {
                return this.f18823a.m9636T(configStep, pair, (Boolean) obj);
            }
        });
    }

    /* JADX INFO: renamed from: V */
    public final /* synthetic */ void m9638V() {
        fu2.m14591d("RemoteConfig", new JSONObject(Maps.D(m9650r(), new gaj() { // from class: l.rpc0
            public final Object apply(Object obj) {
                return ((cqc0) obj).asString();
            }
        })).toString());
    }

    /* JADX INFO: renamed from: W */
    public final /* synthetic */ Object m9639W(ConfigStep configStep, jei0 jei0Var) throws Exception {
        boolean zBooleanValue = ((Boolean) ((jei0) jei0Var.mo16962g()).mo16962g()).booleanValue();
        LruCache<String, Object> lruCache = this.f7861f;
        if (lruCache != null) {
            lruCache.evictAll();
        }
        m9604X("RemoteConfig", "updateWithAb complete and notify listeners:" + configStep + " result:" + zBooleanValue);
        Objects.toString(configStep);
        Objects.toString(Thread.currentThread());
        f7854l.onNext(configStep);
        Objects.toString(configStep);
        Objects.toString(Thread.currentThread());
        e51.y(new Runnable() { // from class: l.qpc0
            @Override // java.lang.Runnable
            public final void run() {
                this.f19423a.m9638V();
            }
        });
        return null;
    }

    /* JADX INFO: renamed from: Z */
    public final boolean m9640Z(ConfigStep configStep, jei0<C0500a> jei0Var) {
        if (!jei0Var.mo16964i()) {
            return false;
        }
        m9622E(configStep).m16761l().m24993b();
        LruCache<String, Object> lruCache = this.f7861f;
        if (lruCache == null) {
            return true;
        }
        lruCache.evictAll();
        return true;
    }

    /* JADX INFO: renamed from: a0 */
    public final void m9641a0() {
        ABManager.n().subscribe(mkd0.G(new e30() { // from class: l.gpc0
            public final void call(Object obj) {
                this.f13663a.m9632P((roj0) obj);
            }
        }));
        ABManager.p().subscribe(mkd0.G(new e30() { // from class: l.kpc0
            public final void call(Object obj) {
                this.f15790a.m9633Q((roj0) obj);
            }
        }));
        ABManager.r().subscribe(mkd0.G(new e30() { // from class: l.lpc0
            public final void call(Object obj) {
                this.f16291a.m9634R((roj0) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: b0 */
    public jei0<Void> m9642b0() {
        m9604X("RemoteConfig", "reset");
        ConfigStep configStep = ConfigStep.USER;
        xu5 xu5VarM16761l = m9622E(configStep).m16761l();
        m9622E(configStep).m16756d().m24993b();
        xu5VarM16761l.m24993b();
        LruCache<String, Object> lruCache = this.f7861f;
        if (lruCache != null) {
            lruCache.evictAll();
        }
        f7852j.clear();
        f7851i.clear();
        f7853k.clear();
        m9647o();
        return sfi0.m22139e(null);
    }

    /* JADX INFO: renamed from: d0 */
    public void m9643d0(final ConfigStep configStep, final String str) {
        sfi0.m22136b(m9644e0(), new Callable() { // from class: l.mpc0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f17013a.m9635S(str, configStep);
            }
        }).mo16959d(m9644e0(), new o16() { // from class: l.npc0
            @Override // p009l.o16
            /* JADX INFO: renamed from: a */
            public final Object mo16684a(jei0 jei0Var) {
                return this.f17596a.m9637U(configStep, jei0Var);
            }
        }).mo16959d(m9644e0(), new o16() { // from class: l.opc0
            @Override // p009l.o16
            /* JADX INFO: renamed from: a */
            public final Object mo16684a(jei0 jei0Var) {
                return this.f18195a.m9639W(configStep, jei0Var);
            }
        });
    }

    /* JADX INFO: renamed from: e0 */
    public final bud0 m9644e0() {
        return Schedulers.trampoline();
    }

    /* JADX INFO: renamed from: m */
    public jei0<Boolean> m9645m(final ConfigStep configStep) {
        xu5 xu5VarM16761l = m9622E(configStep).m16761l();
        final xu5 xu5VarM16756d = m9622E(configStep).m16756d();
        final jei0<C0500a> jei0VarM24994c = xu5VarM16761l.m24994c();
        final jei0<C0500a> jei0VarM24994c2 = xu5VarM16756d.m24994c();
        m9604X("RemoteConfig", " activate");
        return sfi0.m22143i(m9644e0(), jei0VarM24994c, jei0VarM24994c2).mo16960e(m9644e0(), new o16() { // from class: l.ipc0
            @Override // p009l.o16
            /* JADX INFO: renamed from: a */
            public final Object mo16684a(jei0 jei0Var) {
                return this.f14758a.m9629M(jei0VarM24994c, jei0VarM24994c2, xu5VarM16756d, configStep, jei0Var);
            }
        });
    }

    /* JADX INFO: renamed from: n */
    public void m9646n(ConfigStep configStep, JSONObject jSONObject) throws JSONException {
        m9622E(configStep).m16756d().m24998h(C0500a.m9662f().m9667b(jSONObject).m9668c(new Date(f7850h.currentTimeMillis())).m9666a());
    }

    /* JADX INFO: renamed from: o */
    public final void m9647o() {
        m9604X("RemoteConfig", "activePresetDataIfNeeded");
        boolean zEquals = TextUtils.equals((CharSequence) f7853k.get(), qib0.s);
        boolean z = true;
        boolean z2 = !zEquals || m9625H();
        if (zEquals && !m9626J()) {
            z = false;
        }
        if (z2 || z) {
            InputStream inputStreamOpen = null;
            try {
                inputStreamOpen = this.f7860e.getResources().getAssets().open(TextUtils.equals((CharSequence) mu5.a.get(), "tantanapp") ? "rc_release_default.json" : "rc_debug_default.json");
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
                    m9646n(ConfigStep.DEVICE, jSONObject2);
                    f7851i.put(string);
                    this.f7860e.deleteFile(this.f7859d);
                }
                if (z) {
                    m9646n(ConfigStep.USER, jSONObject2);
                    f7852j.put(string);
                    this.f7860e.deleteFile(this.f7858c);
                }
                f7853k.put(qib0.s);
                m9604X("RemoteConfig", "activePresetDataIfNeeded use assets config");
            } catch (FileNotFoundException e) {
                CrashHelper.c(e);
                if (z2) {
                    f7851i.clear();
                    this.f7860e.deleteFile(this.f7859d);
                }
                if (z) {
                    f7852j.clear();
                    this.f7860e.deleteFile(this.f7858c);
                }
            } catch (Exception e2) {
                CrashHelper.c(e2);
            } finally {
                t95.b(inputStreamOpen);
            }
        }
    }

    /* JADX INFO: renamed from: p */
    public final jei0<Boolean> m9648p(boolean z, ConfigStep configStep, String str) {
        m9604X("RemoteConfig", "afterActive save md5, result:" + z + "  step:" + configStep + " md5:" + str);
        if (z) {
            if (configStep == ConfigStep.USER || configStep == ConfigStep.UID) {
                f7852j.put(str);
                f7853k.put(qib0.s);
            } else {
                f7851i.put(str);
                f7853k.put(qib0.s);
            }
        }
        return sfi0.m22139e(Boolean.TRUE);
    }

    /* JADX INFO: renamed from: q */
    public jei0<Boolean> m9649q(final ConfigStep configStep, final JSONObject jSONObject) {
        return sfi0.m22136b(m9644e0(), new Callable() { // from class: l.spc0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f20410a.m9631O(jSONObject, configStep);
            }
        }).mo16965j(m9644e0(), new q5g0() { // from class: l.hpc0
            @Override // p009l.q5g0
            public final jei0 then(Object obj) {
                return this.f14206a.m9630N(configStep, (Boolean) obj);
            }
        });
    }

    @NonNull
    /* JADX INFO: renamed from: r */
    public Map<String, cqc0> m9650r() {
        return m9653u().m16757e();
    }

    /* JADX INFO: renamed from: s */
    public boolean m9651s(@NonNull String str) {
        return m9653u().m16758f(str);
    }

    /* JADX INFO: renamed from: t */
    public final xu5 m9652t(String str) {
        return xu5.m24991f(mv5.m18648c(this.f7860e, str));
    }

    /* JADX INFO: renamed from: u */
    public final iv5 m9653u() {
        return m9622E(m9627K());
    }

    /* JADX INFO: renamed from: v */
    public <T> T m9654v(@NonNull String str, @NonNull JsonAdapter<T> jsonAdapter) throws RemoteConfigException {
        try {
            T t = (T) this.f7861f.get(str);
            if (t != null) {
                return t;
            }
            String strM9623F = m9623F(str);
            if (TextUtils.isEmpty(strM9623F)) {
                return null;
            }
            T t2 = (T) jsonAdapter.parse(strM9623F);
            this.f7861f.put(str, t2);
            return t2;
        } catch (IOException e) {
            throw new RemoteConfigException(e.getMessage() == null ? "RemoteConfig JsonAdapter Parse Error" : e.getMessage());
        }
    }

    /* JADX INFO: renamed from: w */
    public double m9655w(@NonNull String str) {
        return m9653u().m16759i(str);
    }

    /* JADX INFO: renamed from: y */
    public int m9656y(@NonNull String str) {
        return m9653u().m16762m(str);
    }

    /* JADX INFO: renamed from: z */
    public int m9657z(@NonNull String str, int i) {
        return m9653u().m16763n(str, i);
    }
}
