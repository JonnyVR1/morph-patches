package p006l;

import android.annotation.SuppressLint;
import android.os.Build;
import android.os.SystemClock;
import android.text.TextUtils;
import com.appsflyer.AppsFlyerLib;
import com.immomo.momosec.jni.MNative;
import com.p000p1.mobile.putong.account.p002ui.camera.adapter.AccountMakeupPageAdapter;
import com.p000p1.mobile.putong.api.ABManager;
import com.p000p1.mobile.putong.api.api.Network;
import com.p000p1.mobile.putong.api.api.TimeConverter;
import com.p1.mobile.android.rx.rxthread.FastIoScheduler;
import com.p1.mobile.putong.remote_config.RemoteConfig;
import com.tantanapp.common.utils.CrashHelper;
import java.io.Closeable;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import l.bud0;
import l.cll;
import l.du2;
import l.dyd;
import l.e30;
import l.exc0;
import l.f16;
import l.igw;
import l.j760;
import l.mkd0;
import l.roj0;
import l.stc0;
import l.t95;
import l.th50;
import l.utc0;
import l.w9j;
import l.wyl;
import l.zvf0;
import org.json.JSONException;
import org.json.JSONObject;
import rx.c;

/* JADX INFO: renamed from: l.l2 */
/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class C0959l2 extends xh5 {

    /* JADX INFO: renamed from: b */
    public static volatile String f16183b;

    /* JADX INFO: renamed from: a */
    public volatile boolean f16184a = false;

    /* JADX INFO: renamed from: l.l2$a */
    public class a implements w9j<Boolean, j760<String, Boolean>> {
        public a() {
        }

        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public j760<String, Boolean> call(Boolean bool) {
            return new j760<>("old", bool);
        }
    }

    /* JADX INFO: renamed from: B */
    public static /* synthetic */ roj0 m18494B(String str) {
        stc0 stc0VarB;
        try {
            stc0VarB = xh5.network.common().s(cll.r(xh5.m27242a("/abtest/abgroup")).p().c("device_identifier", dyd.a()).d()).l(utc0.create(Network.JSON, str)).b();
            try {
                try {
                    stc0VarB = stc0VarB.h().h(Network.AUTH, "MAC " + xh5.network.fakeToken(stc0VarB.k().toString(), stc0VarB.a())).b();
                } catch (IllegalArgumentException e) {
                    CrashHelper.d(e, 50);
                }
            } catch (Exception e2) {
                e = e2;
                CrashHelper.c(e);
            }
        } catch (Exception e3) {
            e = e3;
            stc0VarB = null;
        }
        if (stc0VarB == null) {
            return roj0.a;
        }
        try {
            t95.b(qib0.f19776D.a(stc0VarB).execute());
        } catch (Exception unused) {
            t95.b((Closeable) null);
        } catch (Throwable th) {
            t95.b((Closeable) null);
            throw th;
        }
        return roj0.a;
    }

    /* JADX INFO: renamed from: C */
    public static /* synthetic */ j760 m18495C(Throwable th) {
        return new j760("old", Boolean.FALSE);
    }

    /* JADX INFO: renamed from: F */
    public static /* synthetic */ j760 m18498F(Boolean bool) {
        return new j760("new", bool);
    }

    /* JADX INFO: renamed from: G */
    public static /* synthetic */ roj0 m18499G() throws Exception {
        qib0.f19784H.maybeUpdateRequestBeforeCall(xh5.network.auth().q(xh5.m27257p("")).b());
        return roj0.a;
    }

    /* JADX INFO: renamed from: H */
    public static /* synthetic */ j760 m18500H(Throwable th) {
        return new j760("new", Boolean.FALSE);
    }

    /* JADX INFO: renamed from: I */
    public static synchronized String m18501I(String str) {
        try {
            if (f16183b != null && str != null) {
                return MNative.b().m(str, igw.a(f16183b).toLowerCase());
            }
        } catch (Exception unused) {
        }
        return null;
    }

    /* JADX INFO: renamed from: K */
    public static synchronized String m18502K(String str) {
        try {
            if (f16183b != null && str != null) {
                return MNative.b().h(str, igw.a(f16183b).toLowerCase());
            }
        } catch (Exception unused) {
        }
        return null;
    }

    /* JADX INFO: renamed from: X */
    public static void m18503X(ABManager.Mode mode, long j, Exception exc) {
        zvf0.B("e_load_ab_data_end", "", new j760[]{new j760("ab_mode", mode), new j760("duration", Long.valueOf(j)), new j760("result", "fail_".concat(exc != null ? exc.getClass().getSimpleName() : "unknown")), new j760("last_ab_used", Boolean.FALSE)});
        Objects.toString(mode);
        Objects.toString(exc);
        Objects.toString(Thread.currentThread());
    }

    /* JADX INFO: renamed from: Y */
    public static void m18504Y(ABManager.Mode mode, long j, boolean z) {
        zvf0.B("e_load_ab_data_end", "", new j760[]{new j760("ab_mode", mode), new j760("duration", Long.valueOf(j)), new j760("result", "success"), new j760("last_ab_used", Boolean.valueOf(z))});
        Objects.toString(mode);
        Objects.toString(Thread.currentThread());
    }

    /* JADX INFO: renamed from: Z */
    public static void m18505Z(ABManager.Mode mode) {
        zvf0.B("e_load_ab_data_begin", "", new j760[]{new j760("ab_mode", mode)});
        Objects.toString(mode);
        Objects.toString(Thread.currentThread());
    }

    /* JADX INFO: renamed from: z */
    public static /* synthetic */ void m18508z(long j, Boolean bool) {
        boolean zM1270y = ABManager.m1270y(1);
        if (bool == null || !bool.booleanValue()) {
            return;
        }
        m18504Y(ABManager.Mode.device, SystemClock.elapsedRealtime() - j, zM1270y);
    }

    /* JADX INFO: renamed from: J */
    public final String m18509J(Map<String, String> map) {
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
        m18512N();
        return m18501I(sb.toString());
    }

    @SuppressLint({"SubscribeOnError"})
    /* JADX INFO: renamed from: L */
    public final c<j760<String, Boolean>> m18510L(final ABManager.Mode mode) {
        return c.fromCallable(new Callable() { // from class: l.d2
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f9982a.m18513O(mode);
            }
        }).map(new w9j() { // from class: l.e2
            public final Object call(Object obj) {
                return C0959l2.m18498F((Boolean) obj);
            }
        }).subscribeOn(FastIoScheduler.b).onErrorReturn(new w9j() { // from class: l.f2
            public final Object call(Object obj) {
                return C0959l2.m18500H((Throwable) obj);
            }
        });
    }

    @SuppressLint({"SubscribeOnError"})
    /* JADX INFO: renamed from: M */
    public final c<j760<String, Boolean>> m18511M(final ABManager.Mode mode, final long j) {
        this.f16184a = false;
        return c.fromCallable(new Callable() { // from class: l.a2
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f8059a.m18515Q(mode, j);
            }
        }).map(new a()).subscribeOn(FastIoScheduler.b).onErrorReturn(new w9j() { // from class: l.c2
            public final Object call(Object obj) {
                return C0959l2.m18495C((Throwable) obj);
            }
        });
    }

    /* JADX INFO: renamed from: N */
    public final void m18512N() {
        if (f16183b == null) {
            synchronized (MNative.class) {
                try {
                    if (f16183b == null) {
                        f16183b = MNative.b().o();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    /* JADX INFO: renamed from: O */
    public final /* synthetic */ Boolean m18513O(ABManager.Mode mode) throws Exception {
        String str;
        stc0 stc0VarB;
        stc0 stc0VarM18523b0;
        m18512N();
        String strValueOf = String.valueOf(TimeConverter.switchTime(qib0.f19784H.guessedCurrentServerTime()));
        cll.a aVarP = cll.r(xh5.m27242a("/ttt/abtest/abgroup")).p();
        aVarP.c("oneid", sh50.m23745d());
        aVarP.c("appsflyer_id", AppsFlyerLib.getInstance().getAppsFlyerUID(f16.a()));
        if (qib0.f19808f0 == 0) {
            str = AccountMakeupPageAdapter.MakeupItem.NONE;
        } else {
            str = qib0.f19808f0 + "";
        }
        aVarP.c("mobile_country_code", str);
        exc0 exc0VarExecute = null;
        try {
            stc0VarB = xh5.network.common().s(aVarP.d()).f().a("X-Crypto-Pub-Key", f16183b).b();
            try {
                stc0VarM18523b0 = m18523b0(stc0VarB, strValueOf);
            } catch (Exception e) {
                e = e;
                CrashHelper.c(e);
                stc0VarM18523b0 = stc0VarB;
            }
        } catch (Exception e2) {
            e = e2;
            stc0VarB = null;
        }
        Network.addLocationHeader(stc0VarM18523b0.h(), strValueOf);
        try {
            exc0VarExecute = qib0.f19776D.a(stc0VarM18523b0).execute();
            ABManager.m1252g0(exc0VarExecute, mode);
        } catch (Exception unused) {
        } finally {
            t95.b(exc0VarExecute);
        }
        return Boolean.valueOf(exc0VarExecute != null);
    }

    /* JADX INFO: renamed from: P */
    public final /* synthetic */ void m18514P(String str) {
        if (SystemClock.elapsedRealtime() - sh50.m23746e() <= 2000) {
            m18518T();
        } else {
            ABManager.m1238Z("request", "oneid", true);
        }
    }

    /* JADX INFO: renamed from: Q */
    public final /* synthetic */ Boolean m18515Q(ABManager.Mode mode, long j) throws Exception {
        String str;
        stc0 stc0VarB;
        du2.a("[putong-common][ab]", "raw_testGroup start fromCallable，thread=" + Thread.currentThread());
        String strM23745d = sh50.m23745d();
        String strValueOf = String.valueOf(TimeConverter.switchTime(qib0.f19784H.guessedCurrentServerTime()));
        ABManager.Mode mode2 = ABManager.Mode.user;
        String strD = (mode == mode2 || mode == ABManager.Mode.uid) ? RemoteConfig.D() : RemoteConfig.C();
        cll.a aVarP = cll.r(xh5.m27242a("/abtest/abgroup")).p();
        HashMap map = new HashMap();
        map.put("affiliate", mr4.f17192a);
        map.put("device_identifier", dyd.a());
        map.put("device_name", Build.MODEL);
        map.put("os_version", String.valueOf(Build.VERSION.RELEASE));
        if (qib0.f19808f0 == 0) {
            str = AccountMakeupPageAdapter.MakeupItem.NONE;
        } else {
            str = qib0.f19808f0 + "";
        }
        map.put("mobile_country_code", str);
        map.put("oneid", strM23745d);
        map.put("md5", strD);
        if (mode == ABManager.Mode.device) {
            map.put("mode", mode.getMode());
            if (TextUtils.isEmpty(strM23745d)) {
                ABManager.m1238Z("request", "deviceid", false);
                th50.h(new wyl() { // from class: l.i2
                    public final void onSuccess(String str2) {
                        this.f14202a.m18514P(str2);
                    }
                });
            } else {
                ABManager.m1238Z("request", "oneid", false);
            }
            aVarP.c("_mzip_", m18509J(map));
            stc0VarB = xh5.network.basic().s(aVarP.d()).p("X-Testing-Group-V2-Tag" + mode).f().a("X-Crypto-Pub-Key", f16183b).b();
        } else {
            ABManager.Mode mode3 = ABManager.Mode.uid;
            if (mode == mode3) {
                map.put("mode", mode2.getMode());
                aVarP.c("_mzip_", m18509J(map));
                stc0VarB = xh5.network.common().s(aVarP.d()).p("X-Testing-Group-V2-Tag" + mode3).f().a("X-Crypto-Pub-Key", f16183b).b();
            } else {
                map.put("mode", mode.getMode());
                aVarP.c("_mzip_", m18509J(map));
                stc0VarB = xh5.network.common().s(aVarP.d()).p("X-Testing-Group-V2-Tag" + mode).f().a("X-Crypto-Pub-Key", f16183b).b();
            }
        }
        stc0 stc0VarM18523b0 = stc0VarB;
        try {
            stc0VarM18523b0 = m18523b0(stc0VarM18523b0, strValueOf);
        } catch (IOException e) {
            CrashHelper.c(e);
        }
        m18505Z(mode);
        Network.addLocationHeader(stc0VarM18523b0.h(), strValueOf);
        exc0 exc0Var = null;
        try {
            exc0 exc0VarExecute = qib0.f19776D.a(stc0VarM18523b0).execute();
            t95.b(exc0VarExecute);
            exc0Var = exc0VarExecute;
            e = null;
        } catch (Exception e2) {
            e = e2;
            t95.b((Closeable) null);
        } catch (Throwable th) {
            t95.b((Closeable) null);
            throw th;
        }
        if (exc0Var == null) {
            m18503X(mode, SystemClock.elapsedRealtime() - j, e);
        } else if (this.f16184a) {
            m18504Y(mode, SystemClock.elapsedRealtime() - j, false);
        }
        du2.a("[putong-common][ab]", "raw_testGroup end fromCallable，thread=" + Thread.currentThread());
        return Boolean.valueOf(exc0Var != null);
    }

    /* JADX INFO: renamed from: R */
    public final /* synthetic */ Boolean m18516R(long j) throws Exception {
        return m18517S(ABManager.Mode.device, j, Long.MAX_VALUE);
    }

    @SuppressLint({"SubscribeOnError"})
    /* JADX INFO: renamed from: S */
    public final Boolean m18517S(ABManager.Mode mode, long j, long j2) {
        du2.a("[putong-common][ab]", "raw_testGroup start thread=" + Thread.currentThread());
        boolean zBooleanValue = false;
        for (j760 j760Var : (List) c.merge(m18511M(mode, j), m18510L(mode)).timeout(j2, TimeUnit.MILLISECONDS).onErrorResumeNext(c.empty()).toList().toBlocking().b()) {
            if (TextUtils.equals((CharSequence) j760Var.a, "old")) {
                zBooleanValue = ((Boolean) j760Var.b).booleanValue();
            }
        }
        ABManager.m1224F(mode);
        this.f16184a = zBooleanValue;
        return Boolean.valueOf(zBooleanValue);
    }

    @SuppressLint({"SubscribeOnError"})
    /* JADX INFO: renamed from: T */
    public void m18518T() {
        ABManager.m1246d0();
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("device_ab", ABManager.m1257j());
            zvf0.H("odevs", jSONObject);
        } catch (JSONException unused) {
        }
        final long jElapsedRealtime = SystemClock.elapsedRealtime();
        c cVarFromCallable = c.fromCallable(new Callable() { // from class: l.k2
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f15549a.m18516R(jElapsedRealtime);
            }
        });
        bud0 bud0Var = FastIoScheduler.b;
        now(cVarFromCallable.subscribeOn(bud0Var).observeOn(bud0Var)).subscribe(mkd0.G(new e30() { // from class: l.b2
            public final void call(Object obj) {
                C0959l2.m18508z(jElapsedRealtime, (Boolean) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: U */
    public void m18519U() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (ABManager.m1267u() || qib0.f19805c0.getAuthData().b() == null || qib0.f19805c0.signedIn_()) {
            ABManager.m1271z();
        } else {
            ABManager.m1236X(true);
            ABManager.m1250f0();
            ABManager.m1238Z("request", "uid", false);
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            ABManager.Mode mode = ABManager.Mode.uid;
            Boolean boolM18517S = m18517S(mode, jElapsedRealtime, 1500L);
            boolean zM1271z = ABManager.m1271z();
            if (boolM18517S != null && boolM18517S.booleanValue()) {
                m18504Y(mode, SystemClock.elapsedRealtime() - jElapsedRealtime, zM1271z);
            }
        }
        du2.a("[putong-common][ab]", "waited uidTestGroup for " + (System.currentTimeMillis() - jCurrentTimeMillis) + " ms，thread=" + Thread.currentThread());
    }

    /* JADX INFO: renamed from: V */
    public void m18520V() {
        ABManager.m1238Z("request", "user", false);
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        ABManager.Mode mode = ABManager.Mode.user;
        Boolean boolM18517S = m18517S(mode, jElapsedRealtime, 1500L);
        Objects.toString(Thread.currentThread());
        boolean zM1268v = ABManager.m1268v(2);
        Objects.toString(Thread.currentThread());
        if (zM1268v) {
            Objects.toString((RemoteConfig.ConfigStep) RemoteConfig.Y().filter(new w9j() { // from class: l.g2
                public final Object call(Object obj) {
                    return Boolean.valueOf(((RemoteConfig.ConfigStep) obj) == RemoteConfig.ConfigStep.USER);
                }
            }).take(500L, TimeUnit.MILLISECONDS).toBlocking().c((Object) null));
            Objects.toString(Thread.currentThread());
        }
        if (boolM18517S == null || !boolM18517S.booleanValue()) {
            return;
        }
        m18504Y(mode, SystemClock.elapsedRealtime() - jElapsedRealtime, zM1268v);
    }

    /* JADX INFO: renamed from: W */
    public c<roj0> m18521W(final String str) {
        return now(c.fromCallable(new Callable() { // from class: l.h2
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return C0959l2.m18494B(str);
            }
        }).compose(xh5.m27264w()));
    }

    @SuppressLint({"SubscribeOnError"})
    /* JADX INFO: renamed from: a0 */
    public c<roj0> m18522a0() {
        c cVarFromCallable = c.fromCallable(new Callable() { // from class: l.j2
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return C0959l2.m18499G();
            }
        });
        bud0 bud0Var = FastIoScheduler.b;
        return now(cVarFromCallable.subscribeOn(bud0Var).observeOn(bud0Var));
    }

    /* JADX INFO: renamed from: b0 */
    public final stc0 m18523b0(stc0 stc0Var, String str) throws IOException {
        try {
            return stc0Var.h().h(Network.AUTH, "MAC " + xh5.network.fakeToken(stc0Var.k().toString(), str, stc0Var.a())).b();
        } catch (IllegalArgumentException e) {
            CrashHelper.d(e, 50);
            return stc0Var;
        }
    }
}
