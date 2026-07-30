package p006l;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.PendingIntent;
import android.content.Intent;
import android.os.Process;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.app.NotificationCompat;
import com.cosmos.photon.push.PhotonPushManager;
import com.p000p1.mobile.putong.api.WebSocketManager;
import com.p000p1.mobile.putong.api.push.PushTrackData;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.android.app.App;
import com.p1.mobile.putong.data.DevicePush;
import com.p1.mobile.putong.data.PushMessage;
import com.p1.mobile.putong.ui.splash.SplashProxyAct;
import com.tantanapp.common.data.orm.LruCache2;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import com.tantanapp.push.oppo.OPushService;
import com.tantanapp.push.vivo.ViVoPushReceiver;
import com.tantanapp.push.xiaomi.MiPushReceiver;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import l.c4g0;
import l.ckg;
import l.deb0;
import l.du2;
import l.e30;
import l.e51;
import l.exc0;
import l.faj;
import l.j760;
import l.jo0;
import l.mgh0;
import l.mkd0;
import l.roj0;
import l.stc0;
import l.t95;
import l.vwb;
import l.w85;
import l.w9j;
import l.zvf0;
import rx.c;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class ydb0 {

    /* JADX INFO: renamed from: i */
    public static C1474e<String> f28142i = new C1474e<>();

    /* JADX INFO: renamed from: j */
    public static boolean f28143j = false;

    /* JADX INFO: renamed from: k */
    public static boolean f28144k = false;

    /* JADX INFO: renamed from: l */
    public static boolean f28145l = false;

    /* JADX INFO: renamed from: d */
    public List<C1475f> f28149d;

    /* JADX INFO: renamed from: e */
    public c4g0 f28150e;

    /* JADX INFO: renamed from: a */
    public List<deb0> f28146a = new ArrayList();

    /* JADX INFO: renamed from: b */
    public C1474e<String> f28147b = new C1474e<>();

    /* JADX INFO: renamed from: c */
    public boolean f28148c = true;

    /* JADX INFO: renamed from: f */
    public Map<String, List<InterfaceC1476g>> f28151f = new HashMap();

    /* JADX INFO: renamed from: g */
    public Map<String, List<InterfaceC1476g>> f28152g = new HashMap();

    /* JADX INFO: renamed from: h */
    public deb0.a f28153h = new C1473d();

    /* JADX INFO: renamed from: l.ydb0$a */
    public class C1470a implements w9j<DevicePush, Boolean> {
        public C1470a() {
        }

        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Boolean call(DevicePush devicePush) {
            return Boolean.valueOf("opush".equals(devicePush.service));
        }
    }

    /* JADX INFO: renamed from: l.ydb0$b */
    public class C1471b implements w9j<DevicePush, Boolean> {
        public C1471b() {
        }

        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Boolean call(DevicePush devicePush) {
            return Boolean.valueOf("vivopush".equals(devicePush.service));
        }
    }

    /* JADX INFO: renamed from: l.ydb0$c */
    public class C1472c implements w9j<DevicePush, Boolean> {
        public C1472c() {
        }

        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Boolean call(DevicePush devicePush) {
            return Boolean.valueOf("mipush".equals(devicePush.service));
        }
    }

    /* JADX INFO: renamed from: l.ydb0$d */
    public class C1473d implements deb0.a {
        public C1473d() {
        }

        /* JADX INFO: renamed from: a */
        public void m28225a(String str, boolean z) {
            du2.a("[common][push]", "stateConnected pushName = " + str + ", connected = " + z + " pid " + Process.myPid());
            for (deb0 deb0Var : ydb0.this.f28146a) {
                if (deb0Var.e().equals(str)) {
                    deb0Var.j(z);
                    return;
                }
            }
        }

        /* JADX INFO: renamed from: b */
        public boolean m28226b(String str, boolean z, String str2) {
            du2.a("[common][push]", "onRawPushMessage raw = " + str + ", alreadyClicked = " + z + ", pushName = " + str2);
            return ydb0.this.m28218w(str, z, str2);
        }

        /* JADX INFO: renamed from: c */
        public void m28227c(String str, String str2) {
            du2.a("[common][push]", "stateRegId pushName = " + str + ", id = " + str2);
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
                    CrashHelper.c(e);
                }
            } else if ("fcm".equals(str)) {
                PhotonPushManager.getInstance().setFcmTokenToServer(str2);
                w85.INSTANCE.p(str2);
            }
            for (deb0 deb0Var : ydb0.this.f28146a) {
                if (deb0Var.e().equals(str)) {
                    deb0Var.k(str2);
                    return;
                }
            }
        }

        /* JADX INFO: renamed from: d */
        public boolean m28228d(String str, boolean z, String str2) {
            if (!TextUtils.equals(str2, "vivopush")) {
                return true;
            }
            if (z) {
                return qib0.m22123J0();
            }
            return false;
        }
    }

    /* JADX INFO: renamed from: l.ydb0$e */
    public static class C1474e<T> {

        /* JADX INFO: renamed from: a */
        public LruCache2<T, roj0> f28158a;

        public C1474e() {
            this.f28158a = new LruCache2<>(100);
        }

        /* JADX INFO: renamed from: a */
        public boolean m28229a(T t) {
            if (t == null) {
                return true;
            }
            if (this.f28158a.cached(t) != null) {
                return false;
            }
            this.f28158a.cache(t, roj0.a);
            return true;
        }
    }

    /* JADX INFO: renamed from: l.ydb0$f */
    public static class C1475f {

        /* JADX INFO: renamed from: a */
        public String f28159a;

        /* JADX INFO: renamed from: b */
        public String f28160b;

        /* JADX INFO: renamed from: c */
        public PushMessage f28161c;

        /* JADX INFO: renamed from: d */
        public PushTrackData f28162d;

        public C1475f(String str, String str2, PushMessage pushMessage, PushTrackData pushTrackData) {
            this.f28159a = str;
            this.f28160b = str2;
            this.f28161c = pushMessage;
            this.f28162d = pushTrackData;
        }
    }

    /* JADX INFO: renamed from: l.ydb0$g */
    public interface InterfaceC1476g {
        /* JADX INFO: renamed from: a */
        boolean mo12244a(String str, String str2, PushMessage pushMessage, PushTrackData pushTrackData);

        @Nullable
        /* JADX INFO: renamed from: b */
        PendingIntent mo12245b(String str, String str2, PushMessage pushMessage, PushTrackData pushTrackData);
    }

    public ydb0() {
        try {
            r500.m22641n().m22645o(App.e);
            this.f28146a.add(r500.m22641n().g(this.f28153h));
        } catch (Throwable th) {
            CrashHelper.g(th);
        }
        eel.m14495v();
        if (eel.m14493r()) {
            this.f28146a.add(0, eel.m14491p());
        }
        try {
            boolean zM22164i0 = qib0.m22164i0();
            if (MiPushReceiver.shouldUseMIUIPush() && zM22164i0) {
                this.f28146a.add(new MiPushReceiver().getController().g(this.f28153h));
            }
        } catch (Throwable th2) {
            CrashHelper.g(th2);
        }
        try {
            if (OPushService.isSupportPush()) {
                this.f28146a.add(new OPushService.a().g(this.f28153h));
            }
        } catch (Throwable th3) {
            CrashHelper.g(th3);
        }
        try {
            if (ViVoPushReceiver.shouldApplyVivoPush()) {
                this.f28146a.add(new ViVoPushReceiver().getController().g(this.f28153h));
            }
        } catch (Throwable th4) {
            CrashHelper.g(th4);
        }
        try {
            this.f28146a.add(ckg.m().g(this.f28153h));
        } catch (Throwable th5) {
            CrashHelper.g(th5);
        }
    }

    /* JADX INFO: renamed from: f0 */
    public static void m28169f0(final PushTrackData pushTrackData) {
        if (!pushTrackData.alreadyClicked || f28142i.m28229a(pushTrackData.gid)) {
            e51.y(new Runnable() { // from class: l.pdb0
                @Override // java.lang.Runnable
                public final void run() {
                    ydb0.m28177m(pushTrackData);
                }
            });
        }
    }

    /* JADX INFO: renamed from: g0 */
    public static void m28171g0(String str) {
        zvf0.D("e_push_token_upload", "", new j760[]{vwb.Y("userid", m28180q(qib0.f19805c0.userId())), vwb.Y("push_token", str), vwb.Y("oaid", m28180q(k200.m17914b())), vwb.Y("date", new Date().toString())});
    }

    /* JADX INFO: renamed from: i */
    public static /* synthetic */ Boolean m28173i(Object[] objArr) {
        if (!((Boolean) qib0.f19791O.m21567I().e()).booleanValue()) {
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
    public static /* synthetic */ void m28177m(PushTrackData pushTrackData) {
        StringBuilder sb = new StringBuilder("https://client-monitor.tantanapp.com/push?");
        StringBuilder sb2 = new StringBuilder();
        sb2.append(pushTrackData.pushName);
        sb2.append("=");
        sb2.append(Act.foreground_() == null ? "background" : "foreground");
        sb.append(sb2.toString());
        sb.append("&intent=" + pushTrackData.intent);
        sb.append("&duration=" + pushTrackData.duration);
        sb.append("&received_time=" + System.currentTimeMillis());
        sb.append("&create_time=" + pushTrackData.createdTime);
        sb.append("&is_clicked=" + pushTrackData.alreadyClicked);
        sb.append("&is_login=" + (qib0.f19805c0.signedIn_() ? 1 : 0));
        if (!TextUtils.isEmpty(pushTrackData.gid)) {
            sb.append("&gid=" + URLEncoder.encode(pushTrackData.gid));
        }
        if (!TextUtils.isEmpty(pushTrackData.reqId)) {
            sb.append("&req_id=" + pushTrackData.reqId);
        }
        if (qib0.f19805c0.signedIn_()) {
            sb.append("&user_id=" + qib0.f19805c0.userId());
        }
        int i = 0;
        boolean z = false;
        while (i <= 2 && !z) {
            exc0 exc0VarExecute = null;
            try {
                try {
                    stc0.a aVarBasic = qib0.f19784H.basic();
                    aVarBasic.h("Content-Encoding", "gzip");
                    try {
                        exc0VarExecute = qib0.f19776D.a(aVarBasic.q(sb.toString()).f().b()).execute();
                    } catch (Exception unused) {
                        i++;
                    }
                    if (exc0VarExecute != null) {
                        int iQ = exc0VarExecute.q();
                        if (iQ < 200 || iQ >= 300) {
                            i += 3;
                        } else {
                            z = true;
                        }
                    }
                } catch (Exception e) {
                    i++;
                    CrashHelper.c(e);
                }
                t95.b(exc0VarExecute);
                z = z;
            } catch (Throwable th) {
                t95.b(exc0VarExecute);
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: q */
    public static String m28180q(String str) {
        return str == null ? "" : str;
    }

    /* JADX INFO: renamed from: t */
    public static PushTrackData m28182t(PushMessage pushMessage, boolean z, String str) {
        PushTrackData pushTrackData = new PushTrackData();
        long jGuessedCurrentServerTime = qib0.f19784H.guessedCurrentServerTime();
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
    public final PendingIntent m28183A(String str, final PushMessage pushMessage, String str2, PushTrackData pushTrackData) {
        List<InterfaceC1476g> list = this.f28151f.get(pushMessage.intent);
        PendingIntent pendingIntent = null;
        if (vwb.J(list)) {
            String str3 = (String) vwb.r(this.f28152g.keySet(), new w9j() { // from class: l.rdb0
                public final Object call(Object obj) {
                    return Boolean.valueOf(pushMessage.intent.startsWith((String) obj));
                }
            });
            if (!TextUtils.isEmpty(str3)) {
                List<InterfaceC1476g> list2 = this.f28152g.get(str3);
                if (!vwb.J(list2)) {
                    for (InterfaceC1476g interfaceC1476g : list2) {
                        if (interfaceC1476g != null) {
                            PendingIntent pendingIntentMo12245b = interfaceC1476g.mo12245b(str, pushMessage.intent, pushMessage, pushTrackData);
                            if (pendingIntentMo12245b != null) {
                                return pendingIntentMo12245b;
                            }
                            pendingIntent = pendingIntentMo12245b;
                        }
                    }
                }
            }
        } else {
            for (InterfaceC1476g interfaceC1476g2 : list) {
                if (interfaceC1476g2 != null) {
                    PendingIntent pendingIntentMo12245b2 = interfaceC1476g2.mo12245b(str, pushMessage.intent, pushMessage, pushTrackData);
                    if (pendingIntentMo12245b2 != null) {
                        return pendingIntentMo12245b2;
                    }
                    pendingIntent = pendingIntentMo12245b2;
                }
            }
        }
        if (pendingIntent != null) {
            return pendingIntent;
        }
        Intent intent = new Intent(App.e, (Class<?>) SplashProxyAct.class);
        mgh0.d(intent, true, true);
        mgh0.e(intent, pushTrackData);
        return PendingIntent.getActivity(App.e, (int) System.currentTimeMillis(), intent, 67108864);
    }

    /* JADX INFO: renamed from: B */
    public final void m28184B(final String str, final PushMessage pushMessage, boolean z, String str2) {
        final PushTrackData pushTrackDataM28182t = m28182t(pushMessage, z, str2);
        e51.M(new Runnable() { // from class: l.udb0
            @Override // java.lang.Runnable
            public final void run() {
                this.f23492a.m28199Q(str, pushMessage, pushTrackDataM28182t);
            }
        });
    }

    /* JADX INFO: renamed from: C */
    public boolean m28185C() {
        return vwb.m(m28220y(), new C1472c());
    }

    /* JADX INFO: renamed from: D */
    public boolean m28186D() {
        return vwb.m(m28220y(), new C1470a());
    }

    /* JADX INFO: renamed from: E */
    public boolean m28187E() {
        return vwb.m(m28220y(), new C1471b());
    }

    /* JADX INFO: renamed from: F */
    public final void m28188F() {
        if (this.f28150e == null) {
            this.f28150e = (qib0.f19805c0.signedIn_() ? qib0.f19812j0.b : qib0.f19812j0.f).take(1).observeOn(jo0.a()).subscribe(mkd0.H(new e30() { // from class: l.sdb0
                public final void call(Object obj) {
                    this.f21265a.m28200R((roj0) obj);
                }
            }, new e30() { // from class: l.tdb0
                public final void call(Object obj) {
                    CrashHelper.g((Throwable) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: G */
    public final boolean m28189G(String str, boolean z) {
        if (z) {
            return "opush".equals(str) || "vivopush".equals(str) || "honor".equals(str);
        }
        return false;
    }

    /* JADX INFO: renamed from: H */
    public final boolean m28190H(PushMessage pushMessage, String str) {
        if (!this.f28148c && "getui".equals(str)) {
            if ("conversation.single".equals(pushMessage.intent)) {
                return true;
            }
            for (String str2 : WebSocketManager.m1329Q().m1366T()) {
                if (!TextUtils.isEmpty(str2) && str2.equals(pushMessage.intent)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: I */
    public boolean m28191I() {
        return !TextUtils.isEmpty((String) ckg.m().d().e());
    }

    /* JADX INFO: renamed from: J */
    public boolean m28192J() {
        return eel.m14492q();
    }

    /* JADX INFO: renamed from: K */
    public boolean m28193K() {
        return false;
    }

    /* JADX INFO: renamed from: L */
    public boolean m28194L() {
        return m28185C();
    }

    /* JADX INFO: renamed from: M */
    public boolean m28195M() {
        return m28186D();
    }

    /* JADX INFO: renamed from: N */
    public boolean m28196N() {
        return m28193K() || m28195M() || m28197O() || m28191I() || m28194L() || m28192J();
    }

    /* JADX INFO: renamed from: O */
    public boolean m28197O() {
        return edb0.m14485d() && m28187E();
    }

    /* JADX INFO: renamed from: P */
    public final boolean m28198P(PushMessage pushMessage, String str) {
        return "hwpush".equals(str) && qib0.f19784H.guessedCurrentServerTime() - ((long) pushMessage.createdTime) > 300000;
    }

    /* JADX INFO: renamed from: Q */
    public final /* synthetic */ void m28199Q(String str, PushMessage pushMessage, PushTrackData pushTrackData) {
        try {
            m28206X(str, pushMessage, pushTrackData);
        } catch (Throwable th) {
            CrashHelper.c(new Throwable("handlePushMessageInUI throwable:" + th.getMessage(), th));
        }
    }

    /* JADX INFO: renamed from: R */
    public final /* synthetic */ void m28200R(roj0 roj0Var) {
        m28216u();
    }

    /* JADX INFO: renamed from: S */
    public final /* synthetic */ void m28201S(roj0 roj0Var) {
        m28171g0(pk8.m21559F(m28220y()).toJson());
    }

    /* JADX INFO: renamed from: T */
    public final /* synthetic */ void m28202T(InterfaceC1476g interfaceC1476g, String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        List<InterfaceC1476g> listM = this.f28151f.get(str);
        if (listM == null) {
            listM = vwb.M(interfaceC1476g);
        } else if (!listM.contains(interfaceC1476g)) {
            listM.add(interfaceC1476g);
        }
        this.f28151f.put(str, listM);
    }

    /* JADX INFO: renamed from: U */
    public final /* synthetic */ void m28203U(InterfaceC1476g interfaceC1476g, String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        List<InterfaceC1476g> listM = this.f28151f.get(str);
        if (listM == null) {
            listM = vwb.M(interfaceC1476g);
        } else if (!listM.contains(interfaceC1476g)) {
            listM.add(interfaceC1476g);
        }
        this.f28151f.put(str, listM);
    }

    /* JADX INFO: renamed from: V */
    public final /* synthetic */ void m28204V(InterfaceC1476g interfaceC1476g, String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        List<InterfaceC1476g> listM = this.f28152g.get(str);
        if (listM == null) {
            listM = vwb.M(interfaceC1476g);
        } else if (!listM.contains(interfaceC1476g)) {
            listM.add(interfaceC1476g);
        }
        this.f28152g.put(str, listM);
    }

    /* JADX INFO: renamed from: W */
    public final /* synthetic */ void m28205W() {
        synchronized (ydb0.class) {
            m28208Z();
        }
    }

    @SuppressLint({"WrongConstant"})
    /* JADX INFO: renamed from: X */
    public final boolean m28206X(String str, PushMessage pushMessage, PushTrackData pushTrackData) {
        pushMessage.pushName = pushTrackData.pushName;
        m28169f0(pushTrackData);
        if (!m28189G(pushTrackData.pushName, pushTrackData.alreadyClicked) && (m28190H(pushMessage, pushTrackData.pushName) || !this.f28147b.m28229a(pushMessage.gid) || m28198P(pushMessage, pushTrackData.pushName))) {
            return false;
        }
        if (!pushTrackData.alreadyClicked) {
            if (qib0.m22123J0()) {
                m28217v(pushTrackData.pushName, pushMessage, str, pushTrackData);
                return false;
            }
            if (this.f28149d == null) {
                this.f28149d = new ArrayList();
            }
            this.f28149d.add(new C1475f(pushTrackData.pushName, str, pushMessage, pushTrackData));
            m28188F();
            return false;
        }
        if (qib0.f19805c0.signedIn_()) {
            try {
                m28183A(pushTrackData.pushName, pushMessage, str, pushTrackData).send();
                return true;
            } catch (PendingIntent.CanceledException e) {
                CrashHelper.c(e);
                return false;
            }
        }
        if (!m28219x(pushMessage.intent)) {
            return false;
        }
        Intent intentM28221z = m28221z(pushMessage, true);
        mgh0.d(intentM28221z, true, true);
        try {
            PendingIntent.getActivity(App.e, (int) System.currentTimeMillis(), intentM28221z, 67108864).send();
            return true;
        } catch (PendingIntent.CanceledException e2) {
            CrashHelper.c(e2);
            return false;
        }
    }

    /* JADX INFO: renamed from: Y */
    public c<roj0> m28207Y() {
        final ArrayList arrayList = new ArrayList();
        vwb.z(this.f28146a, new e30() { // from class: l.wdb0
            public final void call(Object obj) {
                arrayList.add(((deb0) obj).d().filter(new w9j() { // from class: l.ldb0
                    public final Object call(Object obj2) {
                        return Boolean.valueOf(((String) obj2) != null);
                    }
                }).take(10L, TimeUnit.SECONDS).materialize().first());
            }
        });
        return mkd0.p(arrayList, new faj() { // from class: l.xdb0
            public final Object call(Object[] objArr) {
                return roj0.a;
            }
        }).doOnNext(new e30() { // from class: l.kdb0
            public final void call(Object obj) {
                this.f15753a.m28201S((roj0) obj);
            }
        });
    }

    /* JADX INFO: renamed from: Z */
    public void m28208Z() {
        Iterator<deb0> it = this.f28146a.iterator();
        while (it.hasNext()) {
            it.next().i();
        }
    }

    /* JADX INFO: renamed from: a0 */
    public void m28209a0(@NonNull final InterfaceC1476g interfaceC1476g, List<String> list) {
        vwb.z(list, new e30() { // from class: l.vdb0
            public final void call(Object obj) {
                this.f24279a.m28202T(interfaceC1476g, (String) obj);
            }
        });
    }

    /* JADX INFO: renamed from: b0 */
    public void m28210b0(@NonNull final InterfaceC1476g interfaceC1476g, List<String> list, List<String> list2) {
        vwb.z(list, new e30() { // from class: l.mdb0
            public final void call(Object obj) {
                this.f16925a.m28203U(interfaceC1476g, (String) obj);
            }
        });
        vwb.z(list2, new e30() { // from class: l.ndb0
            public final void call(Object obj) {
                this.f17612a.m28204V(interfaceC1476g, (String) obj);
            }
        });
    }

    /* JADX INFO: renamed from: c0 */
    public void m28211c0() {
        this.f28148c = true;
    }

    /* JADX INFO: renamed from: d0 */
    public void m28212d0(boolean z) {
        this.f28148c = z;
    }

    /* JADX INFO: renamed from: e0 */
    public void m28213e0() {
        e51.z(new Runnable() { // from class: l.jdb0
            @Override // java.lang.Runnable
            public final void run() {
                this.f15120a.m28205W();
            }
        }, true);
    }

    /* JADX INFO: renamed from: p */
    public boolean m28214p(Intent intent) {
        boolean zEquals;
        intent.hasExtra("custom");
        boolean zA = false;
        try {
            zEquals = "mopush".equals(((PushMessage) PushMessage.JSON_ADAPTER.parse(intent.getStringExtra("custom"))).pushChannel);
        } catch (Exception unused) {
            zEquals = false;
        }
        for (deb0 deb0Var : this.f28146a) {
            if (zEquals == (deb0Var instanceof r500) && (zA = deb0Var.a(intent))) {
                break;
            }
        }
        return zA;
    }

    /* JADX INFO: renamed from: s */
    public c<Boolean> m28215s() {
        ArrayList arrayList = new ArrayList();
        Iterator<deb0> it = this.f28146a.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().b());
        }
        arrayList.add(qib0.f19791O.m21567I());
        return mkd0.p(arrayList, new faj() { // from class: l.odb0
            public final Object call(Object[] objArr) {
                return ydb0.m28173i(objArr);
            }
        });
    }

    /* JADX INFO: renamed from: u */
    public final void m28216u() {
        if (vwb.J(this.f28149d)) {
            return;
        }
        Iterator<C1475f> it = this.f28149d.iterator();
        while (it.hasNext()) {
            C1475f next = it.next();
            m28217v(next.f28159a, next.f28161c, next.f28160b, next.f28162d);
            it.remove();
        }
        if (NullChecker.a(this.f28150e) && this.f28150e.isUnsubscribed()) {
            this.f28150e.unsubscribe();
        }
    }

    @SuppressLint({"WrongConstant"})
    /* JADX INFO: renamed from: v */
    public final void m28217v(String str, final PushMessage pushMessage, String str2, PushTrackData pushTrackData) {
        String str3 = (String) vwb.r(this.f28152g.keySet(), new w9j() { // from class: l.qdb0
            public final Object call(Object obj) {
                return Boolean.valueOf(pushMessage.intent.startsWith((String) obj));
            }
        });
        List<InterfaceC1476g> list = str3 != null ? this.f28152g.get(str3) : null;
        if (list == null) {
            list = this.f28151f.get(pushMessage.intent);
        }
        if (vwb.J(list)) {
            return;
        }
        boolean z = false;
        for (InterfaceC1476g interfaceC1476g : list) {
            if (interfaceC1476g != null && interfaceC1476g.mo12244a(str, pushMessage.intent, pushMessage, pushTrackData)) {
                z = true;
            }
        }
        if (z || pushMessage.silent) {
            return;
        }
        Intent intentM17241f = j2e0.m17241f(App.e);
        mgh0.d(intentM17241f, true, true);
        mgh0.e(intentM17241f, pushTrackData);
        mgh0.f(pushMessage, PendingIntent.getActivity(App.e, (int) System.currentTimeMillis(), intentM17241f, 67108864), (Intent) null, (NotificationCompat.Action) null, (NotificationCompat.Action) null);
    }

    /* JADX INFO: renamed from: w */
    public boolean m28218w(String str, boolean z, String str2) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            PushMessage pushMessageCheckCustomOrigin = ((PushMessage) PushMessage.JSON_ADAPTER.parse(str)).checkCustomOrigin();
            if (e51.D()) {
                return m28206X(str, pushMessageCheckCustomOrigin, m28182t(pushMessageCheckCustomOrigin, z, str2));
            }
            m28184B(str, pushMessageCheckCustomOrigin, z, str2);
            return false;
        } catch (Exception e) {
            if (qib0.f19784H == null) {
                CrashHelper.d(new RuntimeException("push network is null " + str), 50);
            } else {
                CrashHelper.c(e);
            }
        }
    }

    /* JADX INFO: renamed from: x */
    public final boolean m28219x(String str) {
        return jjb0.m17486a() && "devicepush.list".equals(str);
    }

    /* JADX INFO: renamed from: y */
    public List<DevicePush> m28220y() {
        ArrayList arrayList = new ArrayList();
        for (deb0 deb0Var : this.f28146a) {
            String str = (String) deb0Var.d().e();
            if (!TextUtils.isEmpty(str)) {
                DevicePush devicePush = new DevicePush();
                devicePush.service = deb0Var.e();
                devicePush.token = str;
                arrayList.add(devicePush);
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: z */
    public final Intent m28221z(PushMessage pushMessage, boolean z) {
        if (!"devicepush.list".equals(pushMessage.intent)) {
            return null;
        }
        Intent intent = new Intent(App.e, (Class<?>) SplashProxyAct.class);
        if (!m28187E()) {
            intent.setAction("android.intent.action.MAIN");
            intent.addCategory("android.intent.category.LAUNCHER");
        }
        return intent;
    }

    /* JADX INFO: renamed from: r */
    public static void m28181r(Activity activity) {
    }
}
