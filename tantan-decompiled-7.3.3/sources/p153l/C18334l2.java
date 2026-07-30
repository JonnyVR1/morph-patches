package p153l;

import android.annotation.SuppressLint;
import android.os.Build;
import android.os.SystemClock;
import android.text.TextUtils;
import com.appsflyer.AppsFlyerLib;
import com.immomo.momosec.jni.MNative;
import com.p051p1.mobile.android.p052rx.rxthread.FastIoScheduler;
import com.p051p1.mobile.putong.api.ABManager;
import com.p051p1.mobile.putong.api.api.Network;
import com.p051p1.mobile.putong.api.api.TimeConverter;
import com.p051p1.mobile.putong.live.base.data.BLiveOperationTitleShowType;
import com.p051p1.mobile.putong.live.base.data.LovePlanetStage;
import com.p051p1.mobile.putong.remote_config.RemoteConfig;
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
import p137rx.C22421c;

/* JADX INFO: renamed from: l.l2 */
/* JADX INFO: loaded from: classes9.dex */
public class C18334l2 extends xi5 {

    /* JADX INFO: renamed from: b */
    public static volatile String f129733b;

    /* JADX INFO: renamed from: a */
    public volatile boolean f129734a = false;

    /* JADX INFO: renamed from: l.l2$a */
    public class a implements qcj<Boolean, pf60<String, Boolean>> {
        public a() {
        }

        @Override // p153l.qcj
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public pf60<String, Boolean> call(Boolean bool) {
            return new pf60<>(ShareConstants.OLD_VERSION, bool);
        }
    }

    /* JADX INFO: renamed from: B */
    public static /* synthetic */ uxj0 m152516B(String str) {
        x1d0 x1d0VarM209028b;
        try {
            x1d0VarM209028b = xi5.network.common().m209045s(rnl.m182265r(xi5.m211099a("/abtest/abgroup")).m182288p().m182300c("device_identifier", qzd.m178768a()).m182301d()).m209038l(z1d0.create(Network.JSON, str)).m209028b();
            try {
                try {
                    x1d0VarM209028b = x1d0VarM209028b.m209023h().m209034h("Authorization", "MAC " + xi5.network.fakeToken(x1d0VarM209028b.m209026k().toString(), x1d0VarM209028b.m209016a())).m209028b();
                } catch (IllegalArgumentException e) {
                    CrashHelper.m82480d(e, 50);
                }
            } catch (Exception e2) {
                e = e2;
                CrashHelper.m82479c(e);
            }
        } catch (Exception e3) {
            e = e3;
            x1d0VarM209028b = null;
        }
        if (x1d0VarM209028b == null) {
            return uxj0.f181467a;
        }
        try {
            ua5.m195158b(uqb0.f180368D.mo181341a(x1d0VarM209028b).execute());
        } catch (Exception unused) {
            ua5.m195158b(null);
        } catch (Throwable th) {
            ua5.m195158b(null);
            throw th;
        }
        return uxj0.f181467a;
    }

    /* JADX INFO: renamed from: C */
    public static /* synthetic */ pf60 m152517C(Throwable th) {
        return new pf60(ShareConstants.OLD_VERSION, Boolean.FALSE);
    }

    /* JADX INFO: renamed from: F */
    public static /* synthetic */ pf60 m152520F(Boolean bool) {
        return new pf60(ShareConstants.NEW_VERSION, bool);
    }

    /* JADX INFO: renamed from: G */
    public static /* synthetic */ uxj0 m152521G() throws Exception {
        uqb0.f180376H.maybeUpdateRequestBeforeCall(xi5.network.auth().m209043q(xi5.m211114p("")).m209028b());
        return uxj0.f181467a;
    }

    /* JADX INFO: renamed from: H */
    public static /* synthetic */ pf60 m152522H(Throwable th) {
        return new pf60(ShareConstants.NEW_VERSION, Boolean.FALSE);
    }

    /* JADX INFO: renamed from: I */
    public static synchronized String m152523I(String str) {
        try {
            if (f129733b != null && str != null) {
                return MNative.m20274b().m20277m(str, giw.m130384a(f129733b).toLowerCase());
            }
        } catch (Exception unused) {
        }
        return null;
    }

    /* JADX INFO: renamed from: K */
    public static synchronized String m152524K(String str) {
        try {
            if (f129733b != null && str != null) {
                return MNative.m20274b().m20276h(str, giw.m130384a(f129733b).toLowerCase());
            }
        } catch (Exception unused) {
        }
        return null;
    }

    /* JADX INFO: renamed from: X */
    public static void m152525X(ABManager.Mode mode, long j, Exception exc) {
        i4g0.m138493B("e_load_ab_data_end", "", new pf60("ab_mode", mode), new pf60(BLiveOperationTitleShowType.duration, Long.valueOf(j)), new pf60(LovePlanetStage.result, "fail_".concat(exc != null ? exc.getClass().getSimpleName() : "unknown")), new pf60("last_ab_used", Boolean.FALSE));
        Objects.toString(mode);
        Objects.toString(exc);
        Objects.toString(Thread.currentThread());
    }

    /* JADX INFO: renamed from: Y */
    public static void m152526Y(ABManager.Mode mode, long j, boolean z) {
        i4g0.m138493B("e_load_ab_data_end", "", new pf60("ab_mode", mode), new pf60(BLiveOperationTitleShowType.duration, Long.valueOf(j)), new pf60(LovePlanetStage.result, "success"), new pf60("last_ab_used", Boolean.valueOf(z)));
        Objects.toString(mode);
        Objects.toString(Thread.currentThread());
    }

    /* JADX INFO: renamed from: Z */
    public static void m152527Z(ABManager.Mode mode) {
        i4g0.m138493B("e_load_ab_data_begin", "", new pf60("ab_mode", mode));
        Objects.toString(mode);
        Objects.toString(Thread.currentThread());
    }

    /* JADX INFO: renamed from: z */
    public static /* synthetic */ void m152530z(long j, Boolean bool) {
        boolean zM30362y = ABManager.m30362y(1);
        if (bool == null || !bool.booleanValue()) {
            return;
        }
        m152526Y(ABManager.Mode.device, SystemClock.elapsedRealtime() - j, zM30362y);
    }

    /* JADX INFO: renamed from: J */
    public final String m152531J(Map<String, String> map) {
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
        m152534N();
        return m152523I(sb.toString());
    }

    @SuppressLint({"SubscribeOnError"})
    /* JADX INFO: renamed from: L */
    public final C22421c<pf60<String, Boolean>> m152532L(final ABManager.Mode mode) {
        return C22421c.fromCallable(new Callable() { // from class: l.d2
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f84744a.m152535O(mode);
            }
        }).map(new qcj() { // from class: l.e2
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return C18334l2.m152520F((Boolean) obj);
            }
        }).subscribeOn(FastIoScheduler.f16349b).onErrorReturn(new qcj() { // from class: l.f2
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return C18334l2.m152522H((Throwable) obj);
            }
        });
    }

    @SuppressLint({"SubscribeOnError"})
    /* JADX INFO: renamed from: M */
    public final C22421c<pf60<String, Boolean>> m152533M(final ABManager.Mode mode, final long j) {
        this.f129734a = false;
        return C22421c.fromCallable(new Callable() { // from class: l.a2
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f67910a.m152537Q(mode, j);
            }
        }).map(new a()).subscribeOn(FastIoScheduler.f16349b).onErrorReturn(new qcj() { // from class: l.c2
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return C18334l2.m152517C((Throwable) obj);
            }
        });
    }

    /* JADX INFO: renamed from: N */
    public final void m152534N() {
        if (f129733b == null) {
            synchronized (MNative.class) {
                try {
                    if (f129733b == null) {
                        f129733b = MNative.m20274b().m20278o();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    /* JADX INFO: renamed from: O */
    public final /* synthetic */ Boolean m152535O(ABManager.Mode mode) throws Exception {
        String str;
        x1d0 x1d0VarM209028b;
        x1d0 x1d0VarM152545b0;
        m152534N();
        String strValueOf = String.valueOf(TimeConverter.switchTime(uqb0.f180376H.guessedCurrentServerTime()));
        rnl.C19886a c19886aM182288p = rnl.m182265r(xi5.m211099a("/ttt/abtest/abgroup")).m182288p();
        c19886aM182288p.m182300c("oneid", yp50.m217001d());
        c19886aM182288p.m182300c("appsflyer_id", AppsFlyerLib.getInstance().getAppsFlyerUID(k26.m147943a()));
        if (uqb0.f180400f0 == 0) {
            str = "none";
        } else {
            str = uqb0.f180400f0 + "";
        }
        c19886aM182288p.m182300c("mobile_country_code", str);
        i5d0 i5d0VarExecute = null;
        try {
            x1d0VarM209028b = xi5.network.common().m209045s(c19886aM182288p.m182301d()).m209032f().m209027a("X-Crypto-Pub-Key", f129733b).m209028b();
            try {
                x1d0VarM152545b0 = m152545b0(x1d0VarM209028b, strValueOf);
            } catch (Exception e) {
                e = e;
                CrashHelper.m82479c(e);
                x1d0VarM152545b0 = x1d0VarM209028b;
            }
        } catch (Exception e2) {
            e = e2;
            x1d0VarM209028b = null;
        }
        Network.addLocationHeader(x1d0VarM152545b0.m209023h(), strValueOf);
        try {
            i5d0VarExecute = uqb0.f180368D.mo181341a(x1d0VarM152545b0).execute();
            ABManager.m30344g0(i5d0VarExecute, mode);
        } catch (Exception unused) {
        } finally {
            ua5.m195158b(i5d0VarExecute);
        }
        return Boolean.valueOf(i5d0VarExecute != null);
    }

    /* JADX INFO: renamed from: P */
    public final /* synthetic */ void m152536P(String str) {
        if (SystemClock.elapsedRealtime() - yp50.m217002e() <= 2000) {
            m152540T();
        } else {
            ABManager.m30330Z(SocialConstants.TYPE_REQUEST, "oneid", true);
        }
    }

    /* JADX INFO: renamed from: Q */
    public final /* synthetic */ Boolean m152537Q(ABManager.Mode mode, long j) throws Exception {
        String str;
        x1d0 x1d0VarM209028b;
        tu2.m192703a("[putong-common][ab]", "raw_testGroup start fromCallable，thread=" + Thread.currentThread());
        String strM217001d = yp50.m217001d();
        String strValueOf = String.valueOf(TimeConverter.switchTime(uqb0.f180376H.guessedCurrentServerTime()));
        ABManager.Mode mode2 = ABManager.Mode.user;
        String strM80464D = (mode == mode2 || mode == ABManager.Mode.uid) ? RemoteConfig.m80464D() : RemoteConfig.m80463C();
        rnl.C19886a c19886aM182288p = rnl.m182265r(xi5.m211099a("/abtest/abgroup")).m182288p();
        HashMap map = new HashMap();
        map.put("affiliate", ls4.f133389a);
        map.put("device_identifier", qzd.m178768a());
        map.put("device_name", Build.MODEL);
        map.put("os_version", String.valueOf(Build.VERSION.RELEASE));
        if (uqb0.f180400f0 == 0) {
            str = "none";
        } else {
            str = uqb0.f180400f0 + "";
        }
        map.put("mobile_country_code", str);
        map.put("oneid", strM217001d);
        map.put("md5", strM80464D);
        if (mode == ABManager.Mode.device) {
            map.put("mode", mode.getMode());
            if (TextUtils.isEmpty(strM217001d)) {
                ABManager.m30330Z(SocialConstants.TYPE_REQUEST, "deviceid", false);
                zp50.m220819h(new r1m() { // from class: l.i2
                    @Override // p153l.r1m
                    public final void onSuccess(String str2) {
                        this.f112575a.m152536P(str2);
                    }
                });
            } else {
                ABManager.m30330Z(SocialConstants.TYPE_REQUEST, "oneid", false);
            }
            c19886aM182288p.m182300c("_mzip_", m152531J(map));
            x1d0VarM209028b = xi5.network.basic().m209045s(c19886aM182288p.m182301d()).m209042p("X-Testing-Group-V2-Tag" + mode).m209032f().m209027a("X-Crypto-Pub-Key", f129733b).m209028b();
        } else {
            ABManager.Mode mode3 = ABManager.Mode.uid;
            if (mode == mode3) {
                map.put("mode", mode2.getMode());
                c19886aM182288p.m182300c("_mzip_", m152531J(map));
                x1d0VarM209028b = xi5.network.common().m209045s(c19886aM182288p.m182301d()).m209042p("X-Testing-Group-V2-Tag" + mode3).m209032f().m209027a("X-Crypto-Pub-Key", f129733b).m209028b();
            } else {
                map.put("mode", mode.getMode());
                c19886aM182288p.m182300c("_mzip_", m152531J(map));
                x1d0VarM209028b = xi5.network.common().m209045s(c19886aM182288p.m182301d()).m209042p("X-Testing-Group-V2-Tag" + mode).m209032f().m209027a("X-Crypto-Pub-Key", f129733b).m209028b();
            }
        }
        x1d0 x1d0VarM152545b0 = x1d0VarM209028b;
        try {
            x1d0VarM152545b0 = m152545b0(x1d0VarM152545b0, strValueOf);
        } catch (IOException e) {
            CrashHelper.m82479c(e);
        }
        m152527Z(mode);
        Network.addLocationHeader(x1d0VarM152545b0.m209023h(), strValueOf);
        i5d0 i5d0Var = null;
        try {
            i5d0 i5d0VarExecute = uqb0.f180368D.mo181341a(x1d0VarM152545b0).execute();
            ua5.m195158b(i5d0VarExecute);
            i5d0Var = i5d0VarExecute;
            e = null;
        } catch (Exception e2) {
            e = e2;
            ua5.m195158b(null);
        } catch (Throwable th) {
            ua5.m195158b(null);
            throw th;
        }
        if (i5d0Var == null) {
            m152525X(mode, SystemClock.elapsedRealtime() - j, e);
        } else if (this.f129734a) {
            m152526Y(mode, SystemClock.elapsedRealtime() - j, false);
        }
        tu2.m192703a("[putong-common][ab]", "raw_testGroup end fromCallable，thread=" + Thread.currentThread());
        return Boolean.valueOf(i5d0Var != null);
    }

    /* JADX INFO: renamed from: R */
    public final /* synthetic */ Boolean m152538R(long j) throws Exception {
        return m152539S(ABManager.Mode.device, j, Long.MAX_VALUE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @SuppressLint({"SubscribeOnError"})
    /* JADX INFO: renamed from: S */
    public final Boolean m152539S(ABManager.Mode mode, long j, long j2) {
        tu2.m192703a("[putong-common][ab]", "raw_testGroup start thread=" + Thread.currentThread());
        boolean zBooleanValue = false;
        for (pf60 pf60Var : (List) C22421c.merge(m152533M(mode, j), m152532L(mode)).timeout(j2, TimeUnit.MILLISECONDS).onErrorResumeNext(C22421c.empty()).toList().toBlocking().m165963b()) {
            if (TextUtils.equals((CharSequence) pf60Var.f152156a, ShareConstants.OLD_VERSION)) {
                zBooleanValue = ((Boolean) pf60Var.f152157b).booleanValue();
            }
        }
        ABManager.m30316F(mode);
        this.f129734a = zBooleanValue;
        return Boolean.valueOf(zBooleanValue);
    }

    @SuppressLint({"SubscribeOnError"})
    /* JADX INFO: renamed from: T */
    public void m152540T() {
        ABManager.m30338d0();
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("device_ab", ABManager.m30349j());
            i4g0.m138499H("odevs", jSONObject);
        } catch (JSONException unused) {
        }
        final long jElapsedRealtime = SystemClock.elapsedRealtime();
        C22421c c22421cFromCallable = C22421c.fromCallable(new Callable() { // from class: l.k2
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f123562a.m152538R(jElapsedRealtime);
            }
        });
        f2e0 f2e0Var = FastIoScheduler.f16349b;
        now(c22421cFromCallable.subscribeOn(f2e0Var).observeOn(f2e0Var)).subscribe(psd0.m173596G(new y20() { // from class: l.b2
            @Override // p153l.y20
            public final void call(Object obj) {
                C18334l2.m152530z(jElapsedRealtime, (Boolean) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: U */
    public void m152541U() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (ABManager.m30359u() || uqb0.f180397c0.getAuthData().mo107143b() == null || uqb0.f180397c0.signedIn_()) {
            ABManager.m30363z();
        } else {
            ABManager.m30328X(true);
            ABManager.m30342f0();
            ABManager.m30330Z(SocialConstants.TYPE_REQUEST, Oauth2AccessToken.KEY_UID, false);
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            ABManager.Mode mode = ABManager.Mode.uid;
            Boolean boolM152539S = m152539S(mode, jElapsedRealtime, 1500L);
            boolean zM30363z = ABManager.m30363z();
            if (boolM152539S != null && boolM152539S.booleanValue()) {
                m152526Y(mode, SystemClock.elapsedRealtime() - jElapsedRealtime, zM30363z);
            }
        }
        tu2.m192703a("[putong-common][ab]", "waited uidTestGroup for " + (System.currentTimeMillis() - jCurrentTimeMillis) + " ms，thread=" + Thread.currentThread());
    }

    /* JADX INFO: renamed from: V */
    public void m152542V() {
        ABManager.m30330Z(SocialConstants.TYPE_REQUEST, "user", false);
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        ABManager.Mode mode = ABManager.Mode.user;
        Boolean boolM152539S = m152539S(mode, jElapsedRealtime, 1500L);
        Objects.toString(Thread.currentThread());
        boolean zM30360v = ABManager.m30360v(2);
        Objects.toString(Thread.currentThread());
        if (zM30360v) {
            Objects.toString(RemoteConfig.m80467Y().filter(new qcj() { // from class: l.g2
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return Boolean.valueOf(((RemoteConfig.ConfigStep) obj) == RemoteConfig.ConfigStep.USER);
                }
            }).take(500L, TimeUnit.MILLISECONDS).toBlocking().m165964c(null));
            Objects.toString(Thread.currentThread());
        }
        if (boolM152539S == null || !boolM152539S.booleanValue()) {
            return;
        }
        m152526Y(mode, SystemClock.elapsedRealtime() - jElapsedRealtime, zM30360v);
    }

    /* JADX INFO: renamed from: W */
    public C22421c<uxj0> m152543W(final String str) {
        return now(C22421c.fromCallable(new Callable() { // from class: l.h2
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return C18334l2.m152516B(str);
            }
        }).compose(xi5.m211121w()));
    }

    @SuppressLint({"SubscribeOnError"})
    /* JADX INFO: renamed from: a0 */
    public C22421c<uxj0> m152544a0() {
        C22421c c22421cFromCallable = C22421c.fromCallable(new Callable() { // from class: l.j2
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return C18334l2.m152521G();
            }
        });
        f2e0 f2e0Var = FastIoScheduler.f16349b;
        return now(c22421cFromCallable.subscribeOn(f2e0Var).observeOn(f2e0Var));
    }

    /* JADX INFO: renamed from: b0 */
    public final x1d0 m152545b0(x1d0 x1d0Var, String str) throws IOException {
        try {
            return x1d0Var.m209023h().m209034h("Authorization", "MAC " + xi5.network.fakeToken(x1d0Var.m209026k().toString(), str, x1d0Var.m209016a())).m209028b();
        } catch (IllegalArgumentException e) {
            CrashHelper.m82480d(e, 50);
            return x1d0Var;
        }
    }
}
