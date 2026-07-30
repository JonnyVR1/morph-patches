package p153l;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.PendingIntent;
import android.content.Intent;
import android.os.Process;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.cosmos.photon.push.PhotonPushManager;
import com.google.android.exoplayer2.offline.DownloadService;
import com.google.firebase.messaging.Constants;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.android.app.App;
import com.p051p1.mobile.putong.api.WebSocketManager;
import com.p051p1.mobile.putong.api.push.PushTrackData;
import com.p051p1.mobile.putong.core.data.UserId;
import com.p051p1.mobile.putong.data.Device;
import com.p051p1.mobile.putong.data.DevicePush;
import com.p051p1.mobile.putong.data.OMSResourceType;
import com.p051p1.mobile.putong.data.PushMessage;
import com.p051p1.mobile.putong.data.PushMessageIntent;
import com.p051p1.mobile.putong.p070ui.splash.SplashProxyAct;
import com.tantanapp.common.data.orm.LruCache2;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import com.tantanapp.push.oppo.OPushService;
import com.tantanapp.push.vivo.ViVoPushReceiver;
import com.tantanapp.push.xiaomi.MiPushReceiver;
import io.agora.base.internal.voiceengine.earmonitor.HardwareEarMonitorUtils;
import io.agora.rtc2.internal.AudioRoutingController;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.eclipse.jetty.http.HttpHeaderValues;
import p137rx.C22421c;

/* JADX INFO: loaded from: classes9.dex */
public class cmb0 {

    /* JADX INFO: renamed from: i */
    public static C16310e<String> f82566i = new C16310e<>();

    /* JADX INFO: renamed from: j */
    public static boolean f82567j = false;

    /* JADX INFO: renamed from: k */
    public static boolean f82568k = false;

    /* JADX INFO: renamed from: l */
    public static boolean f82569l = false;

    /* JADX INFO: renamed from: d */
    public List<C16311f> f82573d;

    /* JADX INFO: renamed from: e */
    public kcg0 f82574e;

    /* JADX INFO: renamed from: a */
    public List<hmb0> f82570a = new ArrayList();

    /* JADX INFO: renamed from: b */
    public C16310e<String> f82571b = new C16310e<>();

    /* JADX INFO: renamed from: c */
    public boolean f82572c = true;

    /* JADX INFO: renamed from: f */
    public Map<String, List<InterfaceC16312g>> f82575f = new HashMap();

    /* JADX INFO: renamed from: g */
    public Map<String, List<InterfaceC16312g>> f82576g = new HashMap();

    /* JADX INFO: renamed from: h */
    public hmb0.InterfaceC17507a f82577h = new C16309d();

    /* JADX INFO: renamed from: l.cmb0$a */
    public class C16306a implements qcj<DevicePush, Boolean> {
        public C16306a() {
        }

        @Override // p153l.qcj
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Boolean call(DevicePush devicePush) {
            return Boolean.valueOf(OPushService.PUSH_NAME.equals(devicePush.service));
        }
    }

    /* JADX INFO: renamed from: l.cmb0$b */
    public class C16307b implements qcj<DevicePush, Boolean> {
        public C16307b() {
        }

        @Override // p153l.qcj
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Boolean call(DevicePush devicePush) {
            return Boolean.valueOf(ViVoPushReceiver.PUSH_NAME.equals(devicePush.service));
        }
    }

    /* JADX INFO: renamed from: l.cmb0$c */
    public class C16308c implements qcj<DevicePush, Boolean> {
        public C16308c() {
        }

        @Override // p153l.qcj
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Boolean call(DevicePush devicePush) {
            return Boolean.valueOf(MiPushReceiver.PUSH_NAME.equals(devicePush.service));
        }
    }

    /* JADX INFO: renamed from: l.cmb0$d */
    public class C16309d implements hmb0.InterfaceC17507a {
        public C16309d() {
        }

        @Override // p153l.hmb0.InterfaceC17507a
        /* JADX INFO: renamed from: a */
        public void mo111156a(String str, boolean z) {
            tu2.m192703a("[common][push]", "stateConnected pushName = " + str + ", connected = " + z + " pid " + Process.myPid());
            for (hmb0 hmb0Var : cmb0.this.f82570a) {
                if (hmb0Var.mo82615e().equals(str)) {
                    hmb0Var.m135832j(z);
                    return;
                }
            }
        }

        @Override // p153l.hmb0.InterfaceC17507a
        /* JADX INFO: renamed from: b */
        public boolean mo111157b(String str, boolean z, String str2) {
            tu2.m192703a("[common][push]", "onRawPushMessage raw = " + str + ", alreadyClicked = " + z + ", pushName = " + str2);
            return cmb0.this.m111149w(str, z, str2);
        }

        @Override // p153l.hmb0.InterfaceC17507a
        /* JADX INFO: renamed from: c */
        public void mo111158c(String str, String str2) {
            tu2.m192703a("[common][push]", "stateRegId pushName = " + str + ", id = " + str2);
            str.getClass();
            int i = 3;
            switch (str) {
                case "hwpush":
                    break;
                case "mipush":
                    i = 7;
                    break;
                case "opush":
                    i = 4;
                    break;
                case "vivopush":
                    i = 5;
                    break;
                default:
                    i = -1;
                    break;
            }
            if (i != -1) {
                try {
                    PhotonPushManager.getInstance().setThirdTokenToServer(i, str2);
                } catch (Exception e) {
                    CrashHelper.m82479c(e);
                }
            } else if (Constants.ScionAnalytics.ORIGIN_FCM.equals(str)) {
                PhotonPushManager.getInstance().setFcmTokenToServer(str2);
                x95.INSTANCE.m209795p(str2);
            }
            for (hmb0 hmb0Var : cmb0.this.f82570a) {
                if (hmb0Var.mo82615e().equals(str)) {
                    hmb0Var.m135833k(str2);
                    return;
                }
            }
        }

        @Override // p153l.hmb0.InterfaceC17507a
        /* JADX INFO: renamed from: d */
        public boolean mo111159d(String str, boolean z, String str2) {
            if (!TextUtils.equals(str2, ViVoPushReceiver.PUSH_NAME)) {
                return true;
            }
            if (z) {
                return uqb0.m197233J0();
            }
            return false;
        }
    }

    /* JADX INFO: renamed from: l.cmb0$e */
    public static class C16310e<T> {

        /* JADX INFO: renamed from: a */
        public LruCache2<T, uxj0> f82582a;

        public C16310e() {
            this.f82582a = new LruCache2<>(100);
        }

        /* JADX INFO: renamed from: a */
        public boolean m111160a(T t) {
            if (t == null) {
                return true;
            }
            if (this.f82582a.cached(t) != null) {
                return false;
            }
            this.f82582a.cache(t, uxj0.f181467a);
            return true;
        }
    }

    /* JADX INFO: renamed from: l.cmb0$f */
    public static class C16311f {

        /* JADX INFO: renamed from: a */
        public String f82583a;

        /* JADX INFO: renamed from: b */
        public String f82584b;

        /* JADX INFO: renamed from: c */
        public PushMessage f82585c;

        /* JADX INFO: renamed from: d */
        public PushTrackData f82586d;

        public C16311f(String str, String str2, PushMessage pushMessage, PushTrackData pushTrackData) {
            this.f82583a = str;
            this.f82584b = str2;
            this.f82585c = pushMessage;
            this.f82586d = pushTrackData;
        }
    }

    /* JADX INFO: renamed from: l.cmb0$g */
    public interface InterfaceC16312g {
        /* JADX INFO: renamed from: a */
        boolean mo103259a(String str, String str2, PushMessage pushMessage, PushTrackData pushTrackData);

        @Nullable
        /* JADX INFO: renamed from: b */
        PendingIntent mo103260b(String str, String str2, PushMessage pushMessage, PushTrackData pushTrackData);
    }

    public cmb0() {
        try {
            de00.m115372n().m115373o(App.f16088e);
            this.f82570a.add(de00.m115372n().m135830g(this.f82577h));
        } catch (Throwable th) {
            CrashHelper.m82483g(th);
        }
        ugl.m195929v();
        if (ugl.m195927r()) {
            this.f82570a.add(0, ugl.m195925p());
        }
        try {
            boolean zM197274i0 = uqb0.m197274i0();
            if (MiPushReceiver.shouldUseMIUIPush() && zM197274i0) {
                this.f82570a.add(new MiPushReceiver().getController().m135830g(this.f82577h));
            }
        } catch (Throwable th2) {
            CrashHelper.m82483g(th2);
        }
        try {
            if (OPushService.isSupportPush()) {
                this.f82570a.add(new OPushService.C13838a().m135830g(this.f82577h));
            }
        } catch (Throwable th3) {
            CrashHelper.m82483g(th3);
        }
        try {
            if (ViVoPushReceiver.shouldApplyVivoPush()) {
                this.f82570a.add(new ViVoPushReceiver().getController().m135830g(this.f82577h));
            }
        } catch (Throwable th4) {
            CrashHelper.m82483g(th4);
        }
        try {
            this.f82570a.add(qlg.m177000m().m135830g(this.f82577h));
        } catch (Throwable th5) {
            CrashHelper.m82483g(th5);
        }
    }

    /* JADX INFO: renamed from: f0 */
    public static void m111100f0(final PushTrackData pushTrackData) {
        if (!pushTrackData.alreadyClicked || f82566i.m111160a(pushTrackData.gid)) {
            l51.m152919y(new Runnable() { // from class: l.tlb0
                @Override // java.lang.Runnable
                public final void run() {
                    cmb0.m111108m(pushTrackData);
                }
            });
        }
    }

    /* JADX INFO: renamed from: g0 */
    public static void m111102g0(String str) {
        i4g0.m138495D("e_push_token_upload", "", jyb.m147494Y(UserId.TYPE, m111111q(uqb0.f180397c0.userId())), jyb.m147494Y("push_token", str), jyb.m147494Y(Device.OAID, m111111q(hb00.m134333b())), jyb.m147494Y("date", new Date().toString()));
    }

    /* JADX INFO: renamed from: i */
    public static /* synthetic */ Boolean m111104i(Object[] objArr) {
        if (!uqb0.f180383O.m191621I().m222761e().booleanValue()) {
            return Boolean.FALSE;
        }
        for (Object obj : objArr) {
            if (obj != null && ((Boolean) obj).booleanValue()) {
                return Boolean.TRUE;
            }
        }
        return Boolean.FALSE;
    }

    /* JADX INFO: renamed from: m */
    public static /* synthetic */ void m111108m(PushTrackData pushTrackData) {
        StringBuilder sb = new StringBuilder("https://client-monitor.tantanapp.com/push?");
        StringBuilder sb2 = new StringBuilder();
        sb2.append(pushTrackData.pushName);
        sb2.append("=");
        sb2.append(Act.foreground_() == null ? OMSResourceType.background : DownloadService.KEY_FOREGROUND);
        sb.append(sb2.toString());
        sb.append("&intent=" + pushTrackData.intent);
        sb.append("&duration=" + pushTrackData.duration);
        sb.append("&received_time=" + System.currentTimeMillis());
        sb.append("&create_time=" + pushTrackData.createdTime);
        sb.append("&is_clicked=" + pushTrackData.alreadyClicked);
        sb.append("&is_login=" + (uqb0.f180397c0.signedIn_() ? 1 : 0));
        if (!TextUtils.isEmpty(pushTrackData.gid)) {
            sb.append("&gid=" + URLEncoder.encode(pushTrackData.gid));
        }
        if (!TextUtils.isEmpty(pushTrackData.reqId)) {
            sb.append("&req_id=" + pushTrackData.reqId);
        }
        if (uqb0.f180397c0.signedIn_()) {
            sb.append("&user_id=" + uqb0.f180397c0.userId());
        }
        int i = 0;
        boolean z = false;
        while (i <= 2 && !z) {
            i5d0 i5d0VarExecute = null;
            try {
                try {
                    x1d0.C21228a c21228aBasic = uqb0.f180376H.basic();
                    c21228aBasic.m209034h("Content-Encoding", HttpHeaderValues.GZIP);
                    try {
                        i5d0VarExecute = uqb0.f180368D.mo181341a(c21228aBasic.m209043q(sb.toString()).m209032f().m209028b()).execute();
                    } catch (Exception unused) {
                        i++;
                    }
                    if (i5d0VarExecute != null) {
                        int iM138673q = i5d0VarExecute.m138673q();
                        if (iM138673q < 200 || iM138673q >= 300) {
                            i += 3;
                        } else {
                            z = true;
                        }
                    }
                } catch (Exception e) {
                    i++;
                    CrashHelper.m82479c(e);
                }
                ua5.m195158b(i5d0VarExecute);
                z = z;
            } catch (Throwable th) {
                ua5.m195158b(i5d0VarExecute);
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: q */
    public static String m111111q(String str) {
        return str == null ? "" : str;
    }

    /* JADX INFO: renamed from: t */
    public static PushTrackData m111113t(PushMessage pushMessage, boolean z, String str) {
        PushTrackData pushTrackData = new PushTrackData();
        long jGuessedCurrentServerTime = uqb0.f180376H.guessedCurrentServerTime();
        pushTrackData.currentTime = jGuessedCurrentServerTime;
        long j = (long) (jGuessedCurrentServerTime - pushMessage.createdTime);
        if (j < 0) {
            j = 0;
        }
        pushTrackData.duration = j;
        pushTrackData.alreadyClicked = z;
        pushTrackData.pushName = str;
        String str2 = pushMessage.intent;
        pushTrackData.intent = str2 == null ? null : str2.toString();
        pushTrackData.createdTime = pushMessage.createdTime;
        pushTrackData.gid = pushMessage.gid;
        pushTrackData.reqId = pushMessage.reqId;
        return pushTrackData;
    }

    @SuppressLint({"WrongConstant"})
    /* JADX INFO: renamed from: A */
    public final PendingIntent m111114A(String str, final PushMessage pushMessage, String str2, PushTrackData pushTrackData) {
        List<InterfaceC16312g> list = this.f82575f.get(pushMessage.intent);
        PendingIntent pendingIntent = null;
        if (jyb.m147479J(list)) {
            String str3 = (String) jyb.m147529r(this.f82576g.keySet(), new qcj() { // from class: l.vlb0
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return Boolean.valueOf(pushMessage.intent.startsWith((String) obj));
                }
            });
            if (!TextUtils.isEmpty(str3)) {
                List<InterfaceC16312g> list2 = this.f82576g.get(str3);
                if (!jyb.m147479J(list2)) {
                    for (InterfaceC16312g interfaceC16312g : list2) {
                        if (interfaceC16312g != null) {
                            PendingIntent pendingIntentMo103260b = interfaceC16312g.mo103260b(str, pushMessage.intent, pushMessage, pushTrackData);
                            if (pendingIntentMo103260b != null) {
                                return pendingIntentMo103260b;
                            }
                            pendingIntent = pendingIntentMo103260b;
                        }
                    }
                }
            }
        } else {
            for (InterfaceC16312g interfaceC16312g2 : list) {
                if (interfaceC16312g2 != null) {
                    PendingIntent pendingIntentMo103260b2 = interfaceC16312g2.mo103260b(str, pushMessage.intent, pushMessage, pushTrackData);
                    if (pendingIntentMo103260b2 != null) {
                        return pendingIntentMo103260b2;
                    }
                    pendingIntent = pendingIntentMo103260b2;
                }
            }
        }
        if (pendingIntent != null) {
            return pendingIntent;
        }
        Intent intent = new Intent(App.f16088e, (Class<?>) SplashProxyAct.class);
        toh0.m192044d(intent, true, true);
        toh0.m192045e(intent, pushTrackData);
        return PendingIntent.getActivity(App.f16088e, (int) System.currentTimeMillis(), intent, AudioRoutingController.DEVICE_OUT_USB_HEADSET);
    }

    /* JADX INFO: renamed from: B */
    public final void m111115B(final String str, final PushMessage pushMessage, boolean z, String str2) {
        final PushTrackData pushTrackDataM111113t = m111113t(pushMessage, z, str2);
        l51.m152893M(new Runnable() { // from class: l.ylb0
            @Override // java.lang.Runnable
            public final void run() {
                this.f200543a.m111130Q(str, pushMessage, pushTrackDataM111113t);
            }
        });
    }

    /* JADX INFO: renamed from: C */
    public boolean m111116C() {
        return jyb.m147520m(m111151y(), new C16308c());
    }

    /* JADX INFO: renamed from: D */
    public boolean m111117D() {
        return jyb.m147520m(m111151y(), new C16306a());
    }

    /* JADX INFO: renamed from: E */
    public boolean m111118E() {
        return jyb.m147520m(m111151y(), new C16307b());
    }

    /* JADX INFO: renamed from: F */
    public final void m111119F() {
        if (this.f82574e == null) {
            this.f82574e = (uqb0.f180397c0.signedIn_() ? uqb0.f180404j0.f88244b : uqb0.f180404j0.f88248f).take(1).observeOn(fo0.m126432a()).subscribe(psd0.m173597H(new y20() { // from class: l.wlb0
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f189667a.m111131R((uxj0) obj);
                }
            }, new y20() { // from class: l.xlb0
                @Override // p153l.y20
                public final void call(Object obj) {
                    CrashHelper.m82483g((Throwable) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: G */
    public final boolean m111120G(String str, boolean z) {
        if (z) {
            return OPushService.PUSH_NAME.equals(str) || ViVoPushReceiver.PUSH_NAME.equals(str) || HardwareEarMonitorUtils.MANUFACTURER_HONOR.equals(str);
        }
        return false;
    }

    /* JADX INFO: renamed from: H */
    public final boolean m111121H(PushMessage pushMessage, String str) {
        if (!this.f82572c && "getui".equals(str)) {
            if (PushMessageIntent.conversation_single.equals(pushMessage.intent)) {
                return true;
            }
            for (String str2 : WebSocketManager.m30421Q().m30458T()) {
                if (!TextUtils.isEmpty(str2) && str2.equals(pushMessage.intent)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: I */
    public boolean m111122I() {
        return !TextUtils.isEmpty(qlg.m177000m().m135828d().m222761e());
    }

    /* JADX INFO: renamed from: J */
    public boolean m111123J() {
        return ugl.m195926q();
    }

    /* JADX INFO: renamed from: K */
    public boolean m111124K() {
        return false;
    }

    /* JADX INFO: renamed from: L */
    public boolean m111125L() {
        return m111116C();
    }

    /* JADX INFO: renamed from: M */
    public boolean m111126M() {
        return m111117D();
    }

    /* JADX INFO: renamed from: N */
    public boolean m111127N() {
        return m111124K() || m111126M() || m111128O() || m111122I() || m111125L() || m111123J();
    }

    /* JADX INFO: renamed from: O */
    public boolean m111128O() {
        return ilb0.m140618d() && m111118E();
    }

    /* JADX INFO: renamed from: P */
    public final boolean m111129P(PushMessage pushMessage, String str) {
        return "hwpush".equals(str) && uqb0.f180376H.guessedCurrentServerTime() - ((long) pushMessage.createdTime) > com.clevertap.android.sdk.Constants.INBOX_V2_THROTTLE_WINDOW_MS;
    }

    /* JADX INFO: renamed from: Q */
    public final /* synthetic */ void m111130Q(String str, PushMessage pushMessage, PushTrackData pushTrackData) {
        try {
            m111137X(str, pushMessage, pushTrackData);
        } catch (Throwable th) {
            CrashHelper.m82479c(new Throwable("handlePushMessageInUI throwable:" + th.getMessage(), th));
        }
    }

    /* JADX INFO: renamed from: R */
    public final /* synthetic */ void m111131R(uxj0 uxj0Var) {
        m111147u();
    }

    /* JADX INFO: renamed from: S */
    public final /* synthetic */ void m111132S(uxj0 uxj0Var) {
        m111102g0(tl8.m191613F(m111151y()).toJson());
    }

    /* JADX INFO: renamed from: T */
    public final /* synthetic */ void m111133T(InterfaceC16312g interfaceC16312g, String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        List<InterfaceC16312g> listM147482M = this.f82575f.get(str);
        if (listM147482M == null) {
            listM147482M = jyb.m147482M(interfaceC16312g);
        } else if (!listM147482M.contains(interfaceC16312g)) {
            listM147482M.add(interfaceC16312g);
        }
        this.f82575f.put(str, listM147482M);
    }

    /* JADX INFO: renamed from: U */
    public final /* synthetic */ void m111134U(InterfaceC16312g interfaceC16312g, String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        List<InterfaceC16312g> listM147482M = this.f82575f.get(str);
        if (listM147482M == null) {
            listM147482M = jyb.m147482M(interfaceC16312g);
        } else if (!listM147482M.contains(interfaceC16312g)) {
            listM147482M.add(interfaceC16312g);
        }
        this.f82575f.put(str, listM147482M);
    }

    /* JADX INFO: renamed from: V */
    public final /* synthetic */ void m111135V(InterfaceC16312g interfaceC16312g, String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        List<InterfaceC16312g> listM147482M = this.f82576g.get(str);
        if (listM147482M == null) {
            listM147482M = jyb.m147482M(interfaceC16312g);
        } else if (!listM147482M.contains(interfaceC16312g)) {
            listM147482M.add(interfaceC16312g);
        }
        this.f82576g.put(str, listM147482M);
    }

    /* JADX INFO: renamed from: W */
    public final /* synthetic */ void m111136W() {
        synchronized (cmb0.class) {
            m111139Z();
        }
    }

    @SuppressLint({"WrongConstant"})
    /* JADX INFO: renamed from: X */
    public final boolean m111137X(String str, PushMessage pushMessage, PushTrackData pushTrackData) {
        pushMessage.pushName = pushTrackData.pushName;
        m111100f0(pushTrackData);
        if (!m111120G(pushTrackData.pushName, pushTrackData.alreadyClicked) && (m111121H(pushMessage, pushTrackData.pushName) || !this.f82571b.m111160a(pushMessage.gid) || m111129P(pushMessage, pushTrackData.pushName))) {
            return false;
        }
        if (!pushTrackData.alreadyClicked) {
            if (uqb0.m197233J0()) {
                m111148v(pushTrackData.pushName, pushMessage, str, pushTrackData);
                return false;
            }
            if (this.f82573d == null) {
                this.f82573d = new ArrayList();
            }
            this.f82573d.add(new C16311f(pushTrackData.pushName, str, pushMessage, pushTrackData));
            m111119F();
            return false;
        }
        if (uqb0.f180397c0.signedIn_()) {
            try {
                m111114A(pushTrackData.pushName, pushMessage, str, pushTrackData).send();
                return true;
            } catch (PendingIntent.CanceledException e) {
                CrashHelper.m82479c(e);
                return false;
            }
        }
        if (!m111150x(pushMessage.intent)) {
            return false;
        }
        Intent intentM111152z = m111152z(pushMessage, true);
        toh0.m192044d(intentM111152z, true, true);
        try {
            PendingIntent.getActivity(App.f16088e, (int) System.currentTimeMillis(), intentM111152z, AudioRoutingController.DEVICE_OUT_USB_HEADSET).send();
            return true;
        } catch (PendingIntent.CanceledException e2) {
            CrashHelper.m82479c(e2);
            return false;
        }
    }

    /* JADX INFO: renamed from: Y */
    public C22421c<uxj0> m111138Y() {
        final ArrayList arrayList = new ArrayList();
        jyb.m147537z(this.f82570a, new y20() { // from class: l.amb0
            @Override // p153l.y20
            public final void call(Object obj) {
                arrayList.add(((hmb0) obj).m135828d().filter(new qcj() { // from class: l.plb0
                    @Override // p153l.qcj
                    public final Object call(Object obj2) {
                        return Boolean.valueOf(((String) obj2) != null);
                    }
                }).take(10L, TimeUnit.SECONDS).materialize().first());
            }
        });
        return psd0.m173623p(arrayList, new zcj() { // from class: l.bmb0
            @Override // p153l.zcj
            public final Object call(Object[] objArr) {
                return uxj0.f181467a;
            }
        }).doOnNext(new y20() { // from class: l.olb0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f147819a.m111132S((uxj0) obj);
            }
        });
    }

    /* JADX INFO: renamed from: Z */
    public void m111139Z() {
        Iterator<hmb0> it = this.f82570a.iterator();
        while (it.hasNext()) {
            it.next().mo82616i();
        }
    }

    /* JADX INFO: renamed from: a0 */
    public void m111140a0(@NonNull final InterfaceC16312g interfaceC16312g, List<String> list) {
        jyb.m147537z(list, new y20() { // from class: l.zlb0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f204896a.m111133T(interfaceC16312g, (String) obj);
            }
        });
    }

    /* JADX INFO: renamed from: b0 */
    public void m111141b0(@NonNull final InterfaceC16312g interfaceC16312g, List<String> list, List<String> list2) {
        jyb.m147537z(list, new y20() { // from class: l.qlb0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f158219a.m111134U(interfaceC16312g, (String) obj);
            }
        });
        jyb.m147537z(list2, new y20() { // from class: l.rlb0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f163712a.m111135V(interfaceC16312g, (String) obj);
            }
        });
    }

    /* JADX INFO: renamed from: c0 */
    public void m111142c0() {
        this.f82572c = true;
    }

    /* JADX INFO: renamed from: d0 */
    public void m111143d0(boolean z) {
        this.f82572c = z;
    }

    /* JADX INFO: renamed from: e0 */
    public void m111144e0() {
        l51.m152920z(new Runnable() { // from class: l.nlb0
            @Override // java.lang.Runnable
            public final void run() {
                this.f142524a.m111136W();
            }
        }, true);
    }

    /* JADX INFO: renamed from: p */
    public boolean m111145p(Intent intent) {
        boolean zEquals;
        intent.hasExtra("custom");
        boolean zMo82614a = false;
        try {
            zEquals = "mopush".equals(PushMessage.JSON_ADAPTER.parse(intent.getStringExtra("custom")).pushChannel);
        } catch (Exception unused) {
            zEquals = false;
        }
        for (hmb0 hmb0Var : this.f82570a) {
            if (zEquals == (hmb0Var instanceof de00) && (zMo82614a = hmb0Var.mo82614a(intent))) {
                break;
            }
        }
        return zMo82614a;
    }

    /* JADX INFO: renamed from: s */
    public C22421c<Boolean> m111146s() {
        ArrayList arrayList = new ArrayList();
        Iterator<hmb0> it = this.f82570a.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().m135826b());
        }
        arrayList.add(uqb0.f180383O.m191621I());
        return psd0.m173623p(arrayList, new zcj() { // from class: l.slb0
            @Override // p153l.zcj
            public final Object call(Object[] objArr) {
                return cmb0.m111104i(objArr);
            }
        });
    }

    /* JADX INFO: renamed from: u */
    public final void m111147u() {
        if (jyb.m147479J(this.f82573d)) {
            return;
        }
        Iterator<C16311f> it = this.f82573d.iterator();
        while (it.hasNext()) {
            C16311f next = it.next();
            m111148v(next.f82583a, next.f82585c, next.f82584b, next.f82586d);
            it.remove();
        }
        if (NullChecker.m82486a(this.f82574e) && this.f82574e.isUnsubscribed()) {
            this.f82574e.unsubscribe();
        }
    }

    @SuppressLint({"WrongConstant"})
    /* JADX INFO: renamed from: v */
    public final void m111148v(String str, final PushMessage pushMessage, String str2, PushTrackData pushTrackData) {
        String str3 = (String) jyb.m147529r(this.f82576g.keySet(), new qcj() { // from class: l.ulb0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(pushMessage.intent.startsWith((String) obj));
            }
        });
        List<InterfaceC16312g> list = str3 != null ? this.f82576g.get(str3) : null;
        if (list == null) {
            list = this.f82575f.get(pushMessage.intent);
        }
        if (jyb.m147479J(list)) {
            return;
        }
        boolean z = false;
        for (InterfaceC16312g interfaceC16312g : list) {
            if (interfaceC16312g != null && interfaceC16312g.mo103259a(str, pushMessage.intent, pushMessage, pushTrackData)) {
                z = true;
            }
        }
        if (z || pushMessage.silent) {
            return;
        }
        Intent intentM162076f = nae0.m162076f(App.f16088e);
        toh0.m192044d(intentM162076f, true, true);
        toh0.m192045e(intentM162076f, pushTrackData);
        toh0.m192046f(pushMessage, PendingIntent.getActivity(App.f16088e, (int) System.currentTimeMillis(), intentM162076f, AudioRoutingController.DEVICE_OUT_USB_HEADSET), null, null, null);
    }

    /* JADX INFO: renamed from: w */
    public boolean m111149w(String str, boolean z, String str2) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            PushMessage pushMessageCheckCustomOrigin = PushMessage.JSON_ADAPTER.parse(str).checkCustomOrigin();
            if (l51.m152884D()) {
                return m111137X(str, pushMessageCheckCustomOrigin, m111113t(pushMessageCheckCustomOrigin, z, str2));
            }
            m111115B(str, pushMessageCheckCustomOrigin, z, str2);
            return false;
        } catch (Exception e) {
            if (uqb0.f180376H == null) {
                CrashHelper.m82480d(new RuntimeException("push network is null " + str), 50);
            } else {
                CrashHelper.m82479c(e);
            }
        }
    }

    /* JADX INFO: renamed from: x */
    public final boolean m111150x(String str) {
        return nrb0.m164465a() && "devicepush.list".equals(str);
    }

    /* JADX INFO: renamed from: y */
    public List<DevicePush> m111151y() {
        ArrayList arrayList = new ArrayList();
        for (hmb0 hmb0Var : this.f82570a) {
            String strM222761e = hmb0Var.m135828d().m222761e();
            if (!TextUtils.isEmpty(strM222761e)) {
                DevicePush devicePush = new DevicePush();
                devicePush.service = hmb0Var.mo82615e();
                devicePush.token = strM222761e;
                arrayList.add(devicePush);
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: z */
    public final Intent m111152z(PushMessage pushMessage, boolean z) {
        if (!"devicepush.list".equals(pushMessage.intent)) {
            return null;
        }
        Intent intent = new Intent(App.f16088e, (Class<?>) SplashProxyAct.class);
        if (!m111118E()) {
            intent.setAction("android.intent.action.MAIN");
            intent.addCategory("android.intent.category.LAUNCHER");
        }
        return intent;
    }

    /* JADX INFO: renamed from: r */
    public static void m111112r(Activity activity) {
    }
}
