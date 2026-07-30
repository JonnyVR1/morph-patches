package p149l;

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
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.android.app.App;
import com.p046p1.mobile.putong.api.WebSocketManager;
import com.p046p1.mobile.putong.api.push.PushTrackData;
import com.p046p1.mobile.putong.core.data.UserId;
import com.p046p1.mobile.putong.data.Device;
import com.p046p1.mobile.putong.data.DevicePush;
import com.p046p1.mobile.putong.data.OMSResourceType;
import com.p046p1.mobile.putong.data.PushMessage;
import com.p046p1.mobile.putong.data.PushMessageIntent;
import com.p046p1.mobile.putong.p065ui.splash.SplashProxyAct;
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
import p133rx.C22306c;

/* JADX INFO: loaded from: classes9.dex */
public class ydb0 {

    /* JADX INFO: renamed from: i */
    public static C21373e<String> f197535i = new C21373e<>();

    /* JADX INFO: renamed from: j */
    public static boolean f197536j = false;

    /* JADX INFO: renamed from: k */
    public static boolean f197537k = false;

    /* JADX INFO: renamed from: l */
    public static boolean f197538l = false;

    /* JADX INFO: renamed from: d */
    public List<C21374f> f197542d;

    /* JADX INFO: renamed from: e */
    public c4g0 f197543e;

    /* JADX INFO: renamed from: a */
    public List<deb0> f197539a = new ArrayList();

    /* JADX INFO: renamed from: b */
    public C21373e<String> f197540b = new C21373e<>();

    /* JADX INFO: renamed from: c */
    public boolean f197541c = true;

    /* JADX INFO: renamed from: f */
    public Map<String, List<InterfaceC21375g>> f197544f = new HashMap();

    /* JADX INFO: renamed from: g */
    public Map<String, List<InterfaceC21375g>> f197545g = new HashMap();

    /* JADX INFO: renamed from: h */
    public deb0.InterfaceC16342a f197546h = new C21372d();

    /* JADX INFO: renamed from: l.ydb0$a */
    public class C21369a implements w9j<DevicePush, Boolean> {
        public C21369a() {
        }

        @Override // p149l.w9j
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Boolean call(DevicePush devicePush) {
            return Boolean.valueOf(OPushService.PUSH_NAME.equals(devicePush.service));
        }
    }

    /* JADX INFO: renamed from: l.ydb0$b */
    public class C21370b implements w9j<DevicePush, Boolean> {
        public C21370b() {
        }

        @Override // p149l.w9j
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Boolean call(DevicePush devicePush) {
            return Boolean.valueOf(ViVoPushReceiver.PUSH_NAME.equals(devicePush.service));
        }
    }

    /* JADX INFO: renamed from: l.ydb0$c */
    public class C21371c implements w9j<DevicePush, Boolean> {
        public C21371c() {
        }

        @Override // p149l.w9j
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Boolean call(DevicePush devicePush) {
            return Boolean.valueOf(MiPushReceiver.PUSH_NAME.equals(devicePush.service));
        }
    }

    /* JADX INFO: renamed from: l.ydb0$d */
    public class C21372d implements deb0.InterfaceC16342a {
        public C21372d() {
        }

        @Override // p149l.deb0.InterfaceC16342a
        /* JADX INFO: renamed from: a */
        public void mo111189a(String str, boolean z) {
            du2.m113670a("[common][push]", "stateConnected pushName = " + str + ", connected = " + z + " pid " + Process.myPid());
            for (deb0 deb0Var : ydb0.this.f197539a) {
                if (deb0Var.mo81432e().equals(str)) {
                    deb0Var.m111187j(z);
                    return;
                }
            }
        }

        @Override // p149l.deb0.InterfaceC16342a
        /* JADX INFO: renamed from: b */
        public boolean mo111190b(String str, boolean z, String str2) {
            du2.m113670a("[common][push]", "onRawPushMessage raw = " + str + ", alreadyClicked = " + z + ", pushName = " + str2);
            return ydb0.this.m214271w(str, z, str2);
        }

        @Override // p149l.deb0.InterfaceC16342a
        /* JADX INFO: renamed from: c */
        public void mo111191c(String str, String str2) {
            du2.m113670a("[common][push]", "stateRegId pushName = " + str + ", id = " + str2);
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
                    CrashHelper.m81296c(e);
                }
            } else if (Constants.ScionAnalytics.ORIGIN_FCM.equals(str)) {
                PhotonPushManager.getInstance().setFcmTokenToServer(str2);
                w85.INSTANCE.m202147p(str2);
            }
            for (deb0 deb0Var : ydb0.this.f197539a) {
                if (deb0Var.mo81432e().equals(str)) {
                    deb0Var.m111188k(str2);
                    return;
                }
            }
        }

        @Override // p149l.deb0.InterfaceC16342a
        /* JADX INFO: renamed from: d */
        public boolean mo111192d(String str, boolean z, String str2) {
            if (!TextUtils.equals(str2, ViVoPushReceiver.PUSH_NAME)) {
                return true;
            }
            if (z) {
                return qib0.m174779J0();
            }
            return false;
        }
    }

    /* JADX INFO: renamed from: l.ydb0$e */
    public static class C21373e<T> {

        /* JADX INFO: renamed from: a */
        public LruCache2<T, roj0> f197551a;

        public C21373e() {
            this.f197551a = new LruCache2<>(100);
        }

        /* JADX INFO: renamed from: a */
        public boolean m214278a(T t) {
            if (t == null) {
                return true;
            }
            if (this.f197551a.cached(t) != null) {
                return false;
            }
            this.f197551a.cache(t, roj0.f160388a);
            return true;
        }
    }

    /* JADX INFO: renamed from: l.ydb0$f */
    public static class C21374f {

        /* JADX INFO: renamed from: a */
        public String f197552a;

        /* JADX INFO: renamed from: b */
        public String f197553b;

        /* JADX INFO: renamed from: c */
        public PushMessage f197554c;

        /* JADX INFO: renamed from: d */
        public PushTrackData f197555d;

        public C21374f(String str, String str2, PushMessage pushMessage, PushTrackData pushTrackData) {
            this.f197552a = str;
            this.f197553b = str2;
            this.f197554c = pushMessage;
            this.f197555d = pushTrackData;
        }
    }

    /* JADX INFO: renamed from: l.ydb0$g */
    public interface InterfaceC21375g {
        /* JADX INFO: renamed from: a */
        boolean mo98941a(String str, String str2, PushMessage pushMessage, PushTrackData pushTrackData);

        @Nullable
        /* JADX INFO: renamed from: b */
        PendingIntent mo98942b(String str, String str2, PushMessage pushMessage, PushTrackData pushTrackData);
    }

    public ydb0() {
        try {
            r500.m177876n().m177877o(App.f15369e);
            this.f197539a.add(r500.m177876n().m111185g(this.f197546h));
        } catch (Throwable th) {
            CrashHelper.m81300g(th);
        }
        eel.m115979v();
        if (eel.m115977r()) {
            this.f197539a.add(0, eel.m115975p());
        }
        try {
            boolean zM174820i0 = qib0.m174820i0();
            if (MiPushReceiver.shouldUseMIUIPush() && zM174820i0) {
                this.f197539a.add(new MiPushReceiver().getController().m111185g(this.f197546h));
            }
        } catch (Throwable th2) {
            CrashHelper.m81300g(th2);
        }
        try {
            if (OPushService.isSupportPush()) {
                this.f197539a.add(new OPushService.C13675a().m111185g(this.f197546h));
            }
        } catch (Throwable th3) {
            CrashHelper.m81300g(th3);
        }
        try {
            if (ViVoPushReceiver.shouldApplyVivoPush()) {
                this.f197539a.add(new ViVoPushReceiver().getController().m111185g(this.f197546h));
            }
        } catch (Throwable th4) {
            CrashHelper.m81300g(th4);
        }
        try {
            this.f197539a.add(ckg.m107410m().m111185g(this.f197546h));
        } catch (Throwable th5) {
            CrashHelper.m81300g(th5);
        }
    }

    /* JADX INFO: renamed from: f0 */
    public static void m214222f0(final PushTrackData pushTrackData) {
        if (!pushTrackData.alreadyClicked || f197535i.m214278a(pushTrackData.gid)) {
            e51.m114774y(new Runnable() { // from class: l.pdb0
                @Override // java.lang.Runnable
                public final void run() {
                    ydb0.m214230m(pushTrackData);
                }
            });
        }
    }

    /* JADX INFO: renamed from: g0 */
    public static void m214224g0(String str) {
        zvf0.m220371D("e_push_token_upload", "", vwb.m200311Y(UserId.TYPE, m214233q(qib0.f154714c0.userId())), vwb.m200311Y("push_token", str), vwb.m200311Y(Device.OAID, m214233q(k200.m144241b())), vwb.m200311Y("date", new Date().toString()));
    }

    /* JADX INFO: renamed from: i */
    public static /* synthetic */ Boolean m214226i(Object[] objArr) {
        if (!qib0.f154700O.m169985I().m221515e().booleanValue()) {
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
    public static /* synthetic */ void m214230m(PushTrackData pushTrackData) {
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
        sb.append("&is_login=" + (qib0.f154714c0.signedIn_() ? 1 : 0));
        if (!TextUtils.isEmpty(pushTrackData.gid)) {
            sb.append("&gid=" + URLEncoder.encode(pushTrackData.gid));
        }
        if (!TextUtils.isEmpty(pushTrackData.reqId)) {
            sb.append("&req_id=" + pushTrackData.reqId);
        }
        if (qib0.f154714c0.signedIn_()) {
            sb.append("&user_id=" + qib0.f154714c0.userId());
        }
        int i = 0;
        boolean z = false;
        while (i <= 2 && !z) {
            exc0 exc0VarExecute = null;
            try {
                try {
                    stc0.C20027a c20027aBasic = qib0.f154693H.basic();
                    c20027aBasic.m185889h("Content-Encoding", HttpHeaderValues.GZIP);
                    try {
                        exc0VarExecute = qib0.f154685D.mo144849a(c20027aBasic.m185898q(sb.toString()).m185887f().m185883b()).execute();
                    } catch (Exception unused) {
                        i++;
                    }
                    if (exc0VarExecute != null) {
                        int iM118609q = exc0VarExecute.m118609q();
                        if (iM118609q < 200 || iM118609q >= 300) {
                            i += 3;
                        } else {
                            z = true;
                        }
                    }
                } catch (Exception e) {
                    i++;
                    CrashHelper.m81296c(e);
                }
                t95.m187604b(exc0VarExecute);
                z = z;
            } catch (Throwable th) {
                t95.m187604b(exc0VarExecute);
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: q */
    public static String m214233q(String str) {
        return str == null ? "" : str;
    }

    /* JADX INFO: renamed from: t */
    public static PushTrackData m214235t(PushMessage pushMessage, boolean z, String str) {
        PushTrackData pushTrackData = new PushTrackData();
        long jGuessedCurrentServerTime = qib0.f154693H.guessedCurrentServerTime();
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
    public final PendingIntent m214236A(String str, final PushMessage pushMessage, String str2, PushTrackData pushTrackData) {
        List<InterfaceC21375g> list = this.f197544f.get(pushMessage.intent);
        PendingIntent pendingIntent = null;
        if (vwb.m200296J(list)) {
            String str3 = (String) vwb.m200346r(this.f197545g.keySet(), new w9j() { // from class: l.rdb0
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return Boolean.valueOf(pushMessage.intent.startsWith((String) obj));
                }
            });
            if (!TextUtils.isEmpty(str3)) {
                List<InterfaceC21375g> list2 = this.f197545g.get(str3);
                if (!vwb.m200296J(list2)) {
                    for (InterfaceC21375g interfaceC21375g : list2) {
                        if (interfaceC21375g != null) {
                            PendingIntent pendingIntentMo98942b = interfaceC21375g.mo98942b(str, pushMessage.intent, pushMessage, pushTrackData);
                            if (pendingIntentMo98942b != null) {
                                return pendingIntentMo98942b;
                            }
                            pendingIntent = pendingIntentMo98942b;
                        }
                    }
                }
            }
        } else {
            for (InterfaceC21375g interfaceC21375g2 : list) {
                if (interfaceC21375g2 != null) {
                    PendingIntent pendingIntentMo98942b2 = interfaceC21375g2.mo98942b(str, pushMessage.intent, pushMessage, pushTrackData);
                    if (pendingIntentMo98942b2 != null) {
                        return pendingIntentMo98942b2;
                    }
                    pendingIntent = pendingIntentMo98942b2;
                }
            }
        }
        if (pendingIntent != null) {
            return pendingIntent;
        }
        Intent intent = new Intent(App.f15369e, (Class<?>) SplashProxyAct.class);
        mgh0.m154548d(intent, true, true);
        mgh0.m154549e(intent, pushTrackData);
        return PendingIntent.getActivity(App.f15369e, (int) System.currentTimeMillis(), intent, AudioRoutingController.DEVICE_OUT_USB_HEADSET);
    }

    /* JADX INFO: renamed from: B */
    public final void m214237B(final String str, final PushMessage pushMessage, boolean z, String str2) {
        final PushTrackData pushTrackDataM214235t = m214235t(pushMessage, z, str2);
        e51.m114748M(new Runnable() { // from class: l.udb0
            @Override // java.lang.Runnable
            public final void run() {
                this.f175906a.m214252Q(str, pushMessage, pushTrackDataM214235t);
            }
        });
    }

    /* JADX INFO: renamed from: C */
    public boolean m214238C() {
        return vwb.m200337m(m214273y(), new C21371c());
    }

    /* JADX INFO: renamed from: D */
    public boolean m214239D() {
        return vwb.m200337m(m214273y(), new C21369a());
    }

    /* JADX INFO: renamed from: E */
    public boolean m214240E() {
        return vwb.m200337m(m214273y(), new C21370b());
    }

    /* JADX INFO: renamed from: F */
    public final void m214241F() {
        if (this.f197543e == null) {
            this.f197543e = (qib0.f154714c0.signedIn_() ? qib0.f154721j0.f174908b : qib0.f154721j0.f174912f).take(1).observeOn(jo0.m142408a()).subscribe(mkd0.m154956H(new e30() { // from class: l.sdb0
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f163821a.m214253R((roj0) obj);
                }
            }, new e30() { // from class: l.tdb0
                @Override // p149l.e30
                public final void call(Object obj) {
                    CrashHelper.m81300g((Throwable) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: G */
    public final boolean m214242G(String str, boolean z) {
        if (z) {
            return OPushService.PUSH_NAME.equals(str) || ViVoPushReceiver.PUSH_NAME.equals(str) || HardwareEarMonitorUtils.MANUFACTURER_HONOR.equals(str);
        }
        return false;
    }

    /* JADX INFO: renamed from: H */
    public final boolean m214243H(PushMessage pushMessage, String str) {
        if (!this.f197541c && "getui".equals(str)) {
            if (PushMessageIntent.conversation_single.equals(pushMessage.intent)) {
                return true;
            }
            for (String str2 : WebSocketManager.m29423Q().m29460T()) {
                if (!TextUtils.isEmpty(str2) && str2.equals(pushMessage.intent)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: I */
    public boolean m214244I() {
        return !TextUtils.isEmpty(ckg.m107410m().m111183d().m221515e());
    }

    /* JADX INFO: renamed from: J */
    public boolean m214245J() {
        return eel.m115976q();
    }

    /* JADX INFO: renamed from: K */
    public boolean m214246K() {
        return false;
    }

    /* JADX INFO: renamed from: L */
    public boolean m214247L() {
        return m214238C();
    }

    /* JADX INFO: renamed from: M */
    public boolean m214248M() {
        return m214239D();
    }

    /* JADX INFO: renamed from: N */
    public boolean m214249N() {
        return m214246K() || m214248M() || m214250O() || m214244I() || m214247L() || m214245J();
    }

    /* JADX INFO: renamed from: O */
    public boolean m214250O() {
        return edb0.m115795d() && m214240E();
    }

    /* JADX INFO: renamed from: P */
    public final boolean m214251P(PushMessage pushMessage, String str) {
        return "hwpush".equals(str) && qib0.f154693H.guessedCurrentServerTime() - ((long) pushMessage.createdTime) > com.clevertap.android.sdk.Constants.INBOX_V2_THROTTLE_WINDOW_MS;
    }

    /* JADX INFO: renamed from: Q */
    public final /* synthetic */ void m214252Q(String str, PushMessage pushMessage, PushTrackData pushTrackData) {
        try {
            m214259X(str, pushMessage, pushTrackData);
        } catch (Throwable th) {
            CrashHelper.m81296c(new Throwable("handlePushMessageInUI throwable:" + th.getMessage(), th));
        }
    }

    /* JADX INFO: renamed from: R */
    public final /* synthetic */ void m214253R(roj0 roj0Var) {
        m214269u();
    }

    /* JADX INFO: renamed from: S */
    public final /* synthetic */ void m214254S(roj0 roj0Var) {
        m214224g0(pk8.m169977F(m214273y()).toJson());
    }

    /* JADX INFO: renamed from: T */
    public final /* synthetic */ void m214255T(InterfaceC21375g interfaceC21375g, String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        List<InterfaceC21375g> listM200299M = this.f197544f.get(str);
        if (listM200299M == null) {
            listM200299M = vwb.m200299M(interfaceC21375g);
        } else if (!listM200299M.contains(interfaceC21375g)) {
            listM200299M.add(interfaceC21375g);
        }
        this.f197544f.put(str, listM200299M);
    }

    /* JADX INFO: renamed from: U */
    public final /* synthetic */ void m214256U(InterfaceC21375g interfaceC21375g, String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        List<InterfaceC21375g> listM200299M = this.f197544f.get(str);
        if (listM200299M == null) {
            listM200299M = vwb.m200299M(interfaceC21375g);
        } else if (!listM200299M.contains(interfaceC21375g)) {
            listM200299M.add(interfaceC21375g);
        }
        this.f197544f.put(str, listM200299M);
    }

    /* JADX INFO: renamed from: V */
    public final /* synthetic */ void m214257V(InterfaceC21375g interfaceC21375g, String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        List<InterfaceC21375g> listM200299M = this.f197545g.get(str);
        if (listM200299M == null) {
            listM200299M = vwb.m200299M(interfaceC21375g);
        } else if (!listM200299M.contains(interfaceC21375g)) {
            listM200299M.add(interfaceC21375g);
        }
        this.f197545g.put(str, listM200299M);
    }

    /* JADX INFO: renamed from: W */
    public final /* synthetic */ void m214258W() {
        synchronized (ydb0.class) {
            m214261Z();
        }
    }

    @SuppressLint({"WrongConstant"})
    /* JADX INFO: renamed from: X */
    public final boolean m214259X(String str, PushMessage pushMessage, PushTrackData pushTrackData) {
        pushMessage.pushName = pushTrackData.pushName;
        m214222f0(pushTrackData);
        if (!m214242G(pushTrackData.pushName, pushTrackData.alreadyClicked) && (m214243H(pushMessage, pushTrackData.pushName) || !this.f197540b.m214278a(pushMessage.gid) || m214251P(pushMessage, pushTrackData.pushName))) {
            return false;
        }
        if (!pushTrackData.alreadyClicked) {
            if (qib0.m174779J0()) {
                m214270v(pushTrackData.pushName, pushMessage, str, pushTrackData);
                return false;
            }
            if (this.f197542d == null) {
                this.f197542d = new ArrayList();
            }
            this.f197542d.add(new C21374f(pushTrackData.pushName, str, pushMessage, pushTrackData));
            m214241F();
            return false;
        }
        if (qib0.f154714c0.signedIn_()) {
            try {
                m214236A(pushTrackData.pushName, pushMessage, str, pushTrackData).send();
                return true;
            } catch (PendingIntent.CanceledException e) {
                CrashHelper.m81296c(e);
                return false;
            }
        }
        if (!m214272x(pushMessage.intent)) {
            return false;
        }
        Intent intentM214274z = m214274z(pushMessage, true);
        mgh0.m154548d(intentM214274z, true, true);
        try {
            PendingIntent.getActivity(App.f15369e, (int) System.currentTimeMillis(), intentM214274z, AudioRoutingController.DEVICE_OUT_USB_HEADSET).send();
            return true;
        } catch (PendingIntent.CanceledException e2) {
            CrashHelper.m81296c(e2);
            return false;
        }
    }

    /* JADX INFO: renamed from: Y */
    public C22306c<roj0> m214260Y() {
        final ArrayList arrayList = new ArrayList();
        vwb.m200354z(this.f197539a, new e30() { // from class: l.wdb0
            @Override // p149l.e30
            public final void call(Object obj) {
                arrayList.add(((deb0) obj).m111183d().filter(new w9j() { // from class: l.ldb0
                    @Override // p149l.w9j
                    public final Object call(Object obj2) {
                        return Boolean.valueOf(((String) obj2) != null);
                    }
                }).take(10L, TimeUnit.SECONDS).materialize().first());
            }
        });
        return mkd0.m154982p(arrayList, new faj() { // from class: l.xdb0
            @Override // p149l.faj
            public final Object call(Object[] objArr) {
                return roj0.f160388a;
            }
        }).doOnNext(new e30() { // from class: l.kdb0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f122549a.m214254S((roj0) obj);
            }
        });
    }

    /* JADX INFO: renamed from: Z */
    public void m214261Z() {
        Iterator<deb0> it = this.f197539a.iterator();
        while (it.hasNext()) {
            it.next().mo81433i();
        }
    }

    /* JADX INFO: renamed from: a0 */
    public void m214262a0(@NonNull final InterfaceC21375g interfaceC21375g, List<String> list) {
        vwb.m200354z(list, new e30() { // from class: l.vdb0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f181074a.m214255T(interfaceC21375g, (String) obj);
            }
        });
    }

    /* JADX INFO: renamed from: b0 */
    public void m214263b0(@NonNull final InterfaceC21375g interfaceC21375g, List<String> list, List<String> list2) {
        vwb.m200354z(list, new e30() { // from class: l.mdb0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f133226a.m214256U(interfaceC21375g, (String) obj);
            }
        });
        vwb.m200354z(list2, new e30() { // from class: l.ndb0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f138276a.m214257V(interfaceC21375g, (String) obj);
            }
        });
    }

    /* JADX INFO: renamed from: c0 */
    public void m214264c0() {
        this.f197541c = true;
    }

    /* JADX INFO: renamed from: d0 */
    public void m214265d0(boolean z) {
        this.f197541c = z;
    }

    /* JADX INFO: renamed from: e0 */
    public void m214266e0() {
        e51.m114775z(new Runnable() { // from class: l.jdb0
            @Override // java.lang.Runnable
            public final void run() {
                this.f117381a.m214258W();
            }
        }, true);
    }

    /* JADX INFO: renamed from: p */
    public boolean m214267p(Intent intent) {
        boolean zEquals;
        intent.hasExtra("custom");
        boolean zMo81431a = false;
        try {
            zEquals = "mopush".equals(PushMessage.JSON_ADAPTER.parse(intent.getStringExtra("custom")).pushChannel);
        } catch (Exception unused) {
            zEquals = false;
        }
        for (deb0 deb0Var : this.f197539a) {
            if (zEquals == (deb0Var instanceof r500) && (zMo81431a = deb0Var.mo81431a(intent))) {
                break;
            }
        }
        return zMo81431a;
    }

    /* JADX INFO: renamed from: s */
    public C22306c<Boolean> m214268s() {
        ArrayList arrayList = new ArrayList();
        Iterator<deb0> it = this.f197539a.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().m111181b());
        }
        arrayList.add(qib0.f154700O.m169985I());
        return mkd0.m154982p(arrayList, new faj() { // from class: l.odb0
            @Override // p149l.faj
            public final Object call(Object[] objArr) {
                return ydb0.m214226i(objArr);
            }
        });
    }

    /* JADX INFO: renamed from: u */
    public final void m214269u() {
        if (vwb.m200296J(this.f197542d)) {
            return;
        }
        Iterator<C21374f> it = this.f197542d.iterator();
        while (it.hasNext()) {
            C21374f next = it.next();
            m214270v(next.f197552a, next.f197554c, next.f197553b, next.f197555d);
            it.remove();
        }
        if (NullChecker.m81303a(this.f197543e) && this.f197543e.isUnsubscribed()) {
            this.f197543e.unsubscribe();
        }
    }

    @SuppressLint({"WrongConstant"})
    /* JADX INFO: renamed from: v */
    public final void m214270v(String str, final PushMessage pushMessage, String str2, PushTrackData pushTrackData) {
        String str3 = (String) vwb.m200346r(this.f197545g.keySet(), new w9j() { // from class: l.qdb0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(pushMessage.intent.startsWith((String) obj));
            }
        });
        List<InterfaceC21375g> list = str3 != null ? this.f197545g.get(str3) : null;
        if (list == null) {
            list = this.f197544f.get(pushMessage.intent);
        }
        if (vwb.m200296J(list)) {
            return;
        }
        boolean z = false;
        for (InterfaceC21375g interfaceC21375g : list) {
            if (interfaceC21375g != null && interfaceC21375g.mo98941a(str, pushMessage.intent, pushMessage, pushTrackData)) {
                z = true;
            }
        }
        if (z || pushMessage.silent) {
            return;
        }
        Intent intentM139439f = j2e0.m139439f(App.f15369e);
        mgh0.m154548d(intentM139439f, true, true);
        mgh0.m154549e(intentM139439f, pushTrackData);
        mgh0.m154550f(pushMessage, PendingIntent.getActivity(App.f15369e, (int) System.currentTimeMillis(), intentM139439f, AudioRoutingController.DEVICE_OUT_USB_HEADSET), null, null, null);
    }

    /* JADX INFO: renamed from: w */
    public boolean m214271w(String str, boolean z, String str2) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            PushMessage pushMessageCheckCustomOrigin = PushMessage.JSON_ADAPTER.parse(str).checkCustomOrigin();
            if (e51.m114739D()) {
                return m214259X(str, pushMessageCheckCustomOrigin, m214235t(pushMessageCheckCustomOrigin, z, str2));
            }
            m214237B(str, pushMessageCheckCustomOrigin, z, str2);
            return false;
        } catch (Exception e) {
            if (qib0.f154693H == null) {
                CrashHelper.m81297d(new RuntimeException("push network is null " + str), 50);
            } else {
                CrashHelper.m81296c(e);
            }
        }
    }

    /* JADX INFO: renamed from: x */
    public final boolean m214272x(String str) {
        return jjb0.m141783a() && "devicepush.list".equals(str);
    }

    /* JADX INFO: renamed from: y */
    public List<DevicePush> m214273y() {
        ArrayList arrayList = new ArrayList();
        for (deb0 deb0Var : this.f197539a) {
            String strM221515e = deb0Var.m111183d().m221515e();
            if (!TextUtils.isEmpty(strM221515e)) {
                DevicePush devicePush = new DevicePush();
                devicePush.service = deb0Var.mo81432e();
                devicePush.token = strM221515e;
                arrayList.add(devicePush);
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: z */
    public final Intent m214274z(PushMessage pushMessage, boolean z) {
        if (!"devicepush.list".equals(pushMessage.intent)) {
            return null;
        }
        Intent intent = new Intent(App.f15369e, (Class<?>) SplashProxyAct.class);
        if (!m214240E()) {
            intent.setAction("android.intent.action.MAIN");
            intent.addCategory("android.intent.category.LAUNCHER");
        }
        return intent;
    }

    /* JADX INFO: renamed from: r */
    public static void m214234r(Activity activity) {
    }
}
