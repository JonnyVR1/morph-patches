package p149l;

import android.annotation.SuppressLint;
import android.os.Build;
import android.os.SystemClock;
import android.text.TextUtils;
import com.appsflyer.AppsFlyerLib;
import com.immomo.momosec.jni.MNative;
import com.p046p1.mobile.android.p047rx.rxthread.FastIoScheduler;
import com.p046p1.mobile.putong.api.ABManager;
import com.p046p1.mobile.putong.api.api.Network;
import com.p046p1.mobile.putong.api.api.TimeConverter;
import com.p046p1.mobile.putong.live.base.data.BLiveOperationTitleShowType;
import com.p046p1.mobile.putong.live.base.data.LovePlanetStage;
import com.p046p1.mobile.putong.remote_config.RemoteConfig;
import com.sina.weibo.sdk.auth.Oauth2AccessToken;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.media.ttmediautils.tinker.ShareConstants;
import com.tencent.open.SocialConstants;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;
import p133rx.C22306c;

/* JADX INFO: renamed from: l.l2 */
/* JADX INFO: loaded from: classes9.dex */
public class C18133l2 extends xh5 {

    /* JADX INFO: renamed from: b */
    public static volatile String f125692b;

    /* JADX INFO: renamed from: a */
    public volatile boolean f125693a = false;

    /* JADX INFO: renamed from: l.l2$a */
    public class a implements w9j<Boolean, j760<String, Boolean>> {
        public a() {
        }

        @Override // p149l.w9j
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public j760<String, Boolean> call(Boolean bool) {
            return new j760<>(ShareConstants.OLD_VERSION, bool);
        }
    }

    /* JADX INFO: renamed from: B */
    public static /* synthetic */ roj0 m148222B(String str) {
        stc0 stc0VarM185883b;
        try {
            stc0VarM185883b = xh5.network.common().m185900s(cll.m107501r(xh5.m208753a("/abtest/abgroup")).m107524p().m107536c("device_identifier", dyd.m114055a()).m107537d()).m185893l(utc0.create(Network.JSON, str)).m185883b();
            try {
                try {
                    stc0VarM185883b = stc0VarM185883b.m185878h().m185889h("Authorization", "MAC " + xh5.network.fakeToken(stc0VarM185883b.m185881k().toString(), stc0VarM185883b.m185871a())).m185883b();
                } catch (IllegalArgumentException e) {
                    CrashHelper.m81297d(e, 50);
                }
            } catch (Exception e2) {
                e = e2;
                CrashHelper.m81296c(e);
            }
        } catch (Exception e3) {
            e = e3;
            stc0VarM185883b = null;
        }
        if (stc0VarM185883b == null) {
            return roj0.f160388a;
        }
        try {
            t95.m187604b(qib0.f154685D.mo144849a(stc0VarM185883b).execute());
        } catch (Exception unused) {
            t95.m187604b(null);
        } catch (Throwable th) {
            t95.m187604b(null);
            throw th;
        }
        return roj0.f160388a;
    }

    /* JADX INFO: renamed from: C */
    public static /* synthetic */ j760 m148223C(Throwable th) {
        return new j760(ShareConstants.OLD_VERSION, Boolean.FALSE);
    }

    /* JADX INFO: renamed from: F */
    public static /* synthetic */ j760 m148226F(Boolean bool) {
        return new j760(ShareConstants.NEW_VERSION, bool);
    }

    /* JADX INFO: renamed from: G */
    public static /* synthetic */ roj0 m148227G() throws Exception {
        qib0.f154693H.maybeUpdateRequestBeforeCall(xh5.network.auth().m185898q(xh5.m208768p("")).m185883b());
        return roj0.f160388a;
    }

    /* JADX INFO: renamed from: H */
    public static /* synthetic */ j760 m148228H(Throwable th) {
        return new j760(ShareConstants.NEW_VERSION, Boolean.FALSE);
    }

    /* JADX INFO: renamed from: I */
    public static synchronized String m148229I(String str) {
        try {
            if (f125692b != null && str != null) {
                return MNative.m19294b().m19297m(str, igw.m136176a(f125692b).toLowerCase());
            }
        } catch (Exception unused) {
        }
        return null;
    }

    /* JADX INFO: renamed from: K */
    public static synchronized String m148230K(String str) {
        try {
            if (f125692b != null && str != null) {
                return MNative.m19294b().m19296h(str, igw.m136176a(f125692b).toLowerCase());
            }
        } catch (Exception unused) {
        }
        return null;
    }

    /* JADX INFO: renamed from: X */
    public static void m148231X(ABManager.Mode mode, long j, Exception exc) {
        zvf0.m220369B("e_load_ab_data_end", "", new j760("ab_mode", mode), new j760(BLiveOperationTitleShowType.duration, Long.valueOf(j)), new j760(LovePlanetStage.result, "fail_".concat(exc != null ? exc.getClass().getSimpleName() : "unknown")), new j760("last_ab_used", Boolean.FALSE));
        Objects.toString(mode);
        Objects.toString(exc);
        Objects.toString(Thread.currentThread());
    }

    /* JADX INFO: renamed from: Y */
    public static void m148232Y(ABManager.Mode mode, long j, boolean z) {
        zvf0.m220369B("e_load_ab_data_end", "", new j760("ab_mode", mode), new j760(BLiveOperationTitleShowType.duration, Long.valueOf(j)), new j760(LovePlanetStage.result, "success"), new j760("last_ab_used", Boolean.valueOf(z)));
        Objects.toString(mode);
        Objects.toString(Thread.currentThread());
    }

    /* JADX INFO: renamed from: Z */
    public static void m148233Z(ABManager.Mode mode) {
        zvf0.m220369B("e_load_ab_data_begin", "", new j760("ab_mode", mode));
        Objects.toString(mode);
        Objects.toString(Thread.currentThread());
    }

    /* JADX INFO: renamed from: z */
    public static /* synthetic */ void m148236z(long j, Boolean bool) {
        boolean zM29364y = ABManager.m29364y(1);
        if (bool == null || !bool.booleanValue()) {
            return;
        }
        m148232Y(ABManager.Mode.device, SystemClock.elapsedRealtime() - j, zM29364y);
    }

    /* JADX INFO: renamed from: J */
    public final String m148237J(Map<String, String> map) {
        StringBuilder sb = new StringBuilder();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            sb.append(entry.getKey());
            sb.append('=');
            sb.append(entry.getValue());
            sb.append('&');
        }
        if (sb.length() >= 1 && sb.charAt(sb.length() - 1) == '&') {
            sb.deleteCharAt(sb.length() - 1);
        }
        m148240N();
        return m148229I(sb.toString());
    }

    @SuppressLint({"SubscribeOnError"})
    /* JADX INFO: renamed from: L */
    public final C22306c<j760<String, Boolean>> m148238L(final ABManager.Mode mode) {
        return C22306c.fromCallable(new Callable() { // from class: l.d2
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f83320a.m148241O(mode);
            }
        }).map(new w9j() { // from class: l.e2
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return C18133l2.m148226F((Boolean) obj);
            }
        }).subscribeOn(FastIoScheduler.f15630b).onErrorReturn(new w9j() { // from class: l.f2
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return C18133l2.m148228H((Throwable) obj);
            }
        });
    }

    @SuppressLint({"SubscribeOnError"})
    /* JADX INFO: renamed from: M */
    public final C22306c<j760<String, Boolean>> m148239M(final ABManager.Mode mode, final long j) {
        this.f125693a = false;
        return C22306c.fromCallable(new Callable() { // from class: l.a2
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f67211a.m148243Q(mode, j);
            }
        }).map(new a()).subscribeOn(FastIoScheduler.f15630b).onErrorReturn(new w9j() { // from class: l.c2
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return C18133l2.m148223C((Throwable) obj);
            }
        });
    }

    /* JADX INFO: renamed from: N */
    public final void m148240N() {
        if (f125692b == null) {
            synchronized (MNative.class) {
                try {
                    if (f125692b == null) {
                        f125692b = MNative.m19294b().m19298o();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    /* JADX INFO: renamed from: O */
    public final /* synthetic */ Boolean m148241O(ABManager.Mode mode) throws Exception {
        String str;
        stc0 stc0VarM185883b;
        stc0 stc0VarM148251b0;
        m148240N();
        String strValueOf = String.valueOf(TimeConverter.switchTime(qib0.f154693H.guessedCurrentServerTime()));
        cll.C16188a c16188aM107524p = cll.m107501r(xh5.m208753a("/ttt/abtest/abgroup")).m107524p();
        c16188aM107524p.m107536c("oneid", sh50.m184159d());
        c16188aM107524p.m107536c("appsflyer_id", AppsFlyerLib.getInstance().getAppsFlyerUID(f16.m119092a()));
        if (qib0.f154717f0 == 0) {
            str = "none";
        } else {
            str = qib0.f154717f0 + "";
        }
        c16188aM107524p.m107536c("mobile_country_code", str);
        exc0 exc0VarExecute = null;
        try {
            stc0VarM185883b = xh5.network.common().m185900s(c16188aM107524p.m107537d()).m185887f().m185882a("X-Crypto-Pub-Key", f125692b).m185883b();
            try {
                stc0VarM148251b0 = m148251b0(stc0VarM185883b, strValueOf);
            } catch (Exception e) {
                e = e;
                CrashHelper.m81296c(e);
                stc0VarM148251b0 = stc0VarM185883b;
            }
        } catch (Exception e2) {
            e = e2;
            stc0VarM185883b = null;
        }
        Network.addLocationHeader(stc0VarM148251b0.m185878h(), strValueOf);
        try {
            exc0VarExecute = qib0.f154685D.mo144849a(stc0VarM148251b0).execute();
            ABManager.m29346g0(exc0VarExecute, mode);
        } catch (Exception unused) {
        } finally {
            t95.m187604b(exc0VarExecute);
        }
        return Boolean.valueOf(exc0VarExecute != null);
    }

    /* JADX INFO: renamed from: P */
    public final /* synthetic */ void m148242P(String str) {
        if (SystemClock.elapsedRealtime() - sh50.m184160e() <= 2000) {
            m148246T();
        } else {
            ABManager.m29332Z(SocialConstants.TYPE_REQUEST, "oneid", true);
        }
    }

    /* JADX INFO: renamed from: Q */
    public final /* synthetic */ Boolean m148243Q(ABManager.Mode mode, long j) throws Exception {
        String str;
        stc0 stc0VarM185883b;
        du2.m113670a("[putong-common][ab]", "raw_testGroup start fromCallable，thread=" + Thread.currentThread());
        String strM184159d = sh50.m184159d();
        String strValueOf = String.valueOf(TimeConverter.switchTime(qib0.f154693H.guessedCurrentServerTime()));
        ABManager.Mode mode2 = ABManager.Mode.user;
        String strM79281D = (mode == mode2 || mode == ABManager.Mode.uid) ? RemoteConfig.m79281D() : RemoteConfig.m79280C();
        cll.C16188a c16188aM107524p = cll.m107501r(xh5.m208753a("/abtest/abgroup")).m107524p();
        HashMap map = new HashMap();
        map.put("affiliate", mr4.f135329a);
        map.put("device_identifier", dyd.m114055a());
        map.put("device_name", Build.MODEL);
        map.put("os_version", String.valueOf(Build.VERSION.RELEASE));
        if (qib0.f154717f0 == 0) {
            str = "none";
        } else {
            str = qib0.f154717f0 + "";
        }
        map.put("mobile_country_code", str);
        map.put("oneid", strM184159d);
        map.put("md5", strM79281D);
        if (mode == ABManager.Mode.device) {
            map.put("mode", mode.getMode());
            if (TextUtils.isEmpty(strM184159d)) {
                ABManager.m29332Z(SocialConstants.TYPE_REQUEST, "deviceid", false);
                th50.m188873h(new wyl() { // from class: l.i2
                    @Override // p149l.wyl
                    public final void onSuccess(String str2) {
                        this.f110525a.m148242P(str2);
                    }
                });
            } else {
                ABManager.m29332Z(SocialConstants.TYPE_REQUEST, "oneid", false);
            }
            c16188aM107524p.m107536c("_mzip_", m148237J(map));
            stc0VarM185883b = xh5.network.basic().m185900s(c16188aM107524p.m107537d()).m185897p("X-Testing-Group-V2-Tag" + mode).m185887f().m185882a("X-Crypto-Pub-Key", f125692b).m185883b();
        } else {
            ABManager.Mode mode3 = ABManager.Mode.uid;
            if (mode == mode3) {
                map.put("mode", mode2.getMode());
                c16188aM107524p.m107536c("_mzip_", m148237J(map));
                stc0VarM185883b = xh5.network.common().m185900s(c16188aM107524p.m107537d()).m185897p("X-Testing-Group-V2-Tag" + mode3).m185887f().m185882a("X-Crypto-Pub-Key", f125692b).m185883b();
            } else {
                map.put("mode", mode.getMode());
                c16188aM107524p.m107536c("_mzip_", m148237J(map));
                stc0VarM185883b = xh5.network.common().m185900s(c16188aM107524p.m107537d()).m185897p("X-Testing-Group-V2-Tag" + mode).m185887f().m185882a("X-Crypto-Pub-Key", f125692b).m185883b();
            }
        }
        stc0 stc0VarM148251b0 = stc0VarM185883b;
        try {
            stc0VarM148251b0 = m148251b0(stc0VarM148251b0, strValueOf);
        } catch (IOException e) {
            CrashHelper.m81296c(e);
        }
        m148233Z(mode);
        Network.addLocationHeader(stc0VarM148251b0.m185878h(), strValueOf);
        exc0 exc0Var = null;
        try {
            exc0 exc0VarExecute = qib0.f154685D.mo144849a(stc0VarM148251b0).execute();
            t95.m187604b(exc0VarExecute);
            exc0Var = exc0VarExecute;
            e = null;
        } catch (Exception e2) {
            e = e2;
            t95.m187604b(null);
        } catch (Throwable th) {
            t95.m187604b(null);
            throw th;
        }
        if (exc0Var == null) {
            m148231X(mode, SystemClock.elapsedRealtime() - j, e);
        } else if (this.f125693a) {
            m148232Y(mode, SystemClock.elapsedRealtime() - j, false);
        }
        du2.m113670a("[putong-common][ab]", "raw_testGroup end fromCallable，thread=" + Thread.currentThread());
        return Boolean.valueOf(exc0Var != null);
    }

    /* JADX INFO: renamed from: R */
    public final /* synthetic */ Boolean m148244R(long j) throws Exception {
        return m148245S(ABManager.Mode.device, j, Long.MAX_VALUE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @SuppressLint({"SubscribeOnError"})
    /* JADX INFO: renamed from: S */
    public final Boolean m148245S(ABManager.Mode mode, long j, long j2) {
        du2.m113670a("[putong-common][ab]", "raw_testGroup start thread=" + Thread.currentThread());
        boolean zBooleanValue = false;
        for (j760 j760Var : (List) C22306c.merge(m148239M(mode, j), m148238L(mode)).timeout(j2, TimeUnit.MILLISECONDS).onErrorResumeNext(C22306c.empty()).toList().toBlocking().m212770b()) {
            if (TextUtils.equals((CharSequence) j760Var.f116564a, ShareConstants.OLD_VERSION)) {
                zBooleanValue = ((Boolean) j760Var.f116565b).booleanValue();
            }
        }
        ABManager.m29318F(mode);
        this.f125693a = zBooleanValue;
        return Boolean.valueOf(zBooleanValue);
    }

    @SuppressLint({"SubscribeOnError"})
    /* JADX INFO: renamed from: T */
    public void m148246T() {
        ABManager.m29340d0();
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("device_ab", ABManager.m29351j());
            zvf0.m220375H("odevs", jSONObject);
        } catch (JSONException unused) {
        }
        final long jElapsedRealtime = SystemClock.elapsedRealtime();
        C22306c c22306cFromCallable = C22306c.fromCallable(new Callable() { // from class: l.k2
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f120673a.m148244R(jElapsedRealtime);
            }
        });
        bud0 bud0Var = FastIoScheduler.f15630b;
        now(c22306cFromCallable.subscribeOn(bud0Var).observeOn(bud0Var)).subscribe(mkd0.m154955G(new e30() { // from class: l.b2
            @Override // p149l.e30
            public final void call(Object obj) {
                C18133l2.m148236z(jElapsedRealtime, (Boolean) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: U */
    public void m148247U() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (ABManager.m29361u() || qib0.f154714c0.getAuthData().mo108248b() == null || qib0.f154714c0.signedIn_()) {
            ABManager.m29365z();
        } else {
            ABManager.m29330X(true);
            ABManager.m29344f0();
            ABManager.m29332Z(SocialConstants.TYPE_REQUEST, Oauth2AccessToken.KEY_UID, false);
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            ABManager.Mode mode = ABManager.Mode.uid;
            Boolean boolM148245S = m148245S(mode, jElapsedRealtime, 1500L);
            boolean zM29365z = ABManager.m29365z();
            if (boolM148245S != null && boolM148245S.booleanValue()) {
                m148232Y(mode, SystemClock.elapsedRealtime() - jElapsedRealtime, zM29365z);
            }
        }
        du2.m113670a("[putong-common][ab]", "waited uidTestGroup for " + (System.currentTimeMillis() - jCurrentTimeMillis) + " ms，thread=" + Thread.currentThread());
    }

    /* JADX INFO: renamed from: V */
    public void m148248V() {
        ABManager.m29332Z(SocialConstants.TYPE_REQUEST, "user", false);
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        ABManager.Mode mode = ABManager.Mode.user;
        Boolean boolM148245S = m148245S(mode, jElapsedRealtime, 1500L);
        Objects.toString(Thread.currentThread());
        boolean zM29362v = ABManager.m29362v(2);
        Objects.toString(Thread.currentThread());
        if (zM29362v) {
            Objects.toString(RemoteConfig.m79284Y().filter(new w9j() { // from class: l.g2
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return Boolean.valueOf(((RemoteConfig.ConfigStep) obj) == RemoteConfig.ConfigStep.USER);
                }
            }).take(500L, TimeUnit.MILLISECONDS).toBlocking().m212771c(null));
            Objects.toString(Thread.currentThread());
        }
        if (boolM148245S == null || !boolM148245S.booleanValue()) {
            return;
        }
        m148232Y(mode, SystemClock.elapsedRealtime() - jElapsedRealtime, zM29362v);
    }

    /* JADX INFO: renamed from: W */
    public C22306c<roj0> m148249W(final String str) {
        return now(C22306c.fromCallable(new Callable() { // from class: l.h2
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return C18133l2.m148222B(str);
            }
        }).compose(xh5.m208775w()));
    }

    @SuppressLint({"SubscribeOnError"})
    /* JADX INFO: renamed from: a0 */
    public C22306c<roj0> m148250a0() {
        C22306c c22306cFromCallable = C22306c.fromCallable(new Callable() { // from class: l.j2
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return C18133l2.m148227G();
            }
        });
        bud0 bud0Var = FastIoScheduler.f15630b;
        return now(c22306cFromCallable.subscribeOn(bud0Var).observeOn(bud0Var));
    }

    /* JADX INFO: renamed from: b0 */
    public final stc0 m148251b0(stc0 stc0Var, String str) throws IOException {
        try {
            return stc0Var.m185878h().m185889h("Authorization", "MAC " + xh5.network.fakeToken(stc0Var.m185881k().toString(), str, stc0Var.m185871a())).m185883b();
        } catch (IllegalArgumentException e) {
            CrashHelper.m81297d(e, 50);
            return stc0Var;
        }
    }
}
