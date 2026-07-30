package com.p000p1.mobile.putong.api;

import android.net.NetworkInfo;
import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.util.Pair;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.protobuf.InvalidProtocolBufferException;
import com.p000p1.mobile.putong.account.p002ui.camera.view.AccountMakeUpMenuView;
import com.p000p1.mobile.putong.api.api.Network;
import com.p000p1.mobile.putong.app.TantanApp;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.longlink.msg.connector.LongLinkAuthMessage;
import com.p1.mobile.longlink.msg.connector.LongLinkMessage;
import com.p1.mobile.putong.data.AuthData;
import com.p1.mobile.putong.data.Connector;
import com.p1.mobile.putong.data.ConnectorConfig;
import com.tantanapp.common.utils.ConnectivityReceiver;
import com.tantanapp.common.utils.CrashHelper;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Random;
import java.util.UUID;
import l.avk;
import l.c4g0;
import l.djp0;
import l.du2;
import l.dyd;
import l.e30;
import l.exc0;
import l.fjp0;
import l.hjp0;
import l.hpd0;
import l.j760;
import l.ki60;
import l.le2;
import l.mkd0;
import l.n11;
import l.stc0;
import l.vwb;
import l.w9j;
import l.zvf0;
import okio.ByteString;
import p006l.m2w;
import p006l.p2w;
import p006l.pk8;
import p006l.qib0;
import p006l.rul;
import p006l.sul;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class WebSocketManager {

    /* JADX INFO: renamed from: v */
    public static hpd0 f1092v = new hpd0("long_link_open_in_debug", Boolean.TRUE);

    /* JADX INFO: renamed from: b */
    public volatile boolean f1094b;

    /* JADX INFO: renamed from: d */
    public LongLinkAuthMessage.AppStaySideEnum f1096d;

    /* JADX INFO: renamed from: h */
    public C0114e f1100h;

    /* JADX INFO: renamed from: i */
    public Connector f1101i;

    /* JADX INFO: renamed from: j */
    public djp0 f1102j;

    /* JADX INFO: renamed from: k */
    public RunnableC0113d f1103k;

    /* JADX INFO: renamed from: l */
    public RunnableC0118i f1104l;

    /* JADX INFO: renamed from: m */
    public RunnableC0115f f1105m;

    /* JADX INFO: renamed from: n */
    public c4g0 f1106n;

    /* JADX INFO: renamed from: o */
    public c4g0 f1107o;

    /* JADX INFO: renamed from: r */
    public volatile List<String> f1110r;

    /* JADX INFO: renamed from: s */
    public HandlerThread f1111s;

    /* JADX INFO: renamed from: t */
    public HandlerC0116g f1112t;

    /* JADX INFO: renamed from: a */
    public String f1093a = "WebSocketManager";

    /* JADX INFO: renamed from: c */
    public List<String> f1095c = null;

    /* JADX INFO: renamed from: e */
    public int f1097e = 0;

    /* JADX INFO: renamed from: f */
    public int f1098f = 0;

    /* JADX INFO: renamed from: g */
    public final Queue<Pair<String, ByteString>> f1099g = new LinkedList();

    /* JADX INFO: renamed from: p */
    public volatile STATUS f1108p = STATUS.CLOSE;

    /* JADX INFO: renamed from: q */
    public boolean f1109q = false;

    /* JADX INFO: renamed from: u */
    public Runnable f1113u = new RunnableC0110a();

    public enum STATUS {
        FORBIDDEN,
        CLOSE,
        CONNECTED,
        CONNECTING,
        DISCONNECTED
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.api.WebSocketManager$a */
    public class RunnableC0110a implements Runnable {
        public RunnableC0110a() {
        }

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ void m1397c(Connector connector) {
            WebSocketManager.this.f1101i = connector;
            if (WebSocketManager.this.f1101i != null && WebSocketManager.this.f1101i.config != null) {
                TantanApp.f1169c.m28212d0(WebSocketManager.this.f1101i.config.use_thirdparty_push);
            }
            STATUS statusM1365S = WebSocketManager.this.m1365S();
            STATUS status = STATUS.CLOSE;
            if (statusM1365S == status) {
                return;
            }
            Connector connector2 = WebSocketManager.this.f1101i;
            WebSocketManager webSocketManager = WebSocketManager.this;
            if (connector2 == null) {
                webSocketManager.m1376d0();
                return;
            }
            webSocketManager.m1362O();
            String strM1363P = WebSocketManager.this.m1363P();
            boolean zIsEmpty = TextUtils.isEmpty(strM1363P);
            WebSocketManager webSocketManager2 = WebSocketManager.this;
            if (zIsEmpty) {
                webSocketManager2.m1385m0(status);
            } else {
                webSocketManager2.f1102j = webSocketManager2.m1358J(strM1363P);
            }
        }

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ void m1398d(Throwable th) {
            boolean zG = ConnectivityReceiver.g();
            WebSocketManager webSocketManager = WebSocketManager.this;
            if (zG) {
                webSocketManager.m1376d0();
            } else {
                webSocketManager.m1385m0(STATUS.DISCONNECTED);
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            STATUS status;
            STATUS statusM1365S = WebSocketManager.this.m1365S();
            if (statusM1365S == STATUS.FORBIDDEN || statusM1365S == (status = STATUS.CONNECTING) || statusM1365S == STATUS.CLOSE) {
                return;
            }
            if (WebSocketManager.this.f1102j != null) {
                WebSocketManager.this.f1102j.release();
            }
            WebSocketManager.this.f1099g.clear();
            WebSocketManager.this.f1112t.removeCallbacksAndMessages(null);
            WebSocketManager.this.m1385m0(status);
            String strM1363P = WebSocketManager.this.m1363P();
            if (TextUtils.isEmpty(strM1363P)) {
                qib0.f19797U.m28523C(WebSocketManager.this.m1367U()).observeOn(avk.a(WebSocketManager.this.f1112t)).subscribe(mkd0.K(new e30() { // from class: l.pjp0
                    public final void call(Object obj) {
                        this.f19162a.m1397c((Connector) obj);
                    }
                }, new e30() { // from class: l.qjp0
                    public final void call(Object obj) {
                        this.f19862a.m1398d((Throwable) obj);
                    }
                }, false));
            } else {
                WebSocketManager webSocketManager = WebSocketManager.this;
                webSocketManager.f1102j = webSocketManager.m1358J(strM1363P);
            }
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.api.WebSocketManager$c */
    public static class C0112c {

        /* JADX INFO: renamed from: a */
        public static WebSocketManager f1116a = new WebSocketManager();
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.api.WebSocketManager$d */
    public class RunnableC0113d implements Runnable {
        public RunnableC0113d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (WebSocketManager.this.m1365S() == STATUS.CONNECTED && WebSocketManager.this.m1383k0(null)) {
                WebSocketManager webSocketManager = WebSocketManager.this;
                webSocketManager.m1390r0(webSocketManager.f1101i.config.keepalive_tries);
                WebSocketManager.this.m1391s0();
            }
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.api.WebSocketManager$e */
    public class C0114e {

        /* JADX INFO: renamed from: a */
        public final LinkedHashMap<LongLinkMessage.MsgTypeEnum, List<sul>> f1118a = new LinkedHashMap<>();

        /* JADX INFO: renamed from: b */
        public p2w f1119b = new p2w();

        public C0114e() {
        }

        /* JADX INFO: renamed from: c */
        public boolean m1414c(ki60 ki60Var) {
            LongLinkMessage.MsgTypeEnum type = ki60Var.a.getType();
            du2.a("[common][push]", "LongLinkCommonBaseDisposeHandler handle type = " + type + ", originMsg = " + ki60Var.a());
            List<sul> list = this.f1118a.get(type);
            boolean zMo16452a = false;
            if (!vwb.J(list)) {
                Iterator<sul> it = list.iterator();
                while (it.hasNext()) {
                    zMo16452a = it.next().mo16452a(ki60Var.b, ki60Var);
                }
            }
            return zMo16452a;
        }

        /* JADX INFO: renamed from: d */
        public void m1415d() {
            WebSocketManager.this.m1378f0(new m2w(new e30() { // from class: l.tjp0
                public final void call(Object obj) {
                    this.f22144a.m1416e((ki60) obj);
                }
            }, new e30() { // from class: l.ujp0
                public final void call(Object obj) {
                    this.f23582a.m1417f((ki60) obj);
                }
            }));
            WebSocketManager.this.m1378f0(this.f1119b);
            m1420i();
        }

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ void m1416e(ki60 ki60Var) {
            String msgId = ki60Var.a.getMsgId();
            Pair<String, ByteString> pairPeek = WebSocketManager.this.f1099g.peek();
            if (pairPeek == null || !TextUtils.equals((CharSequence) pairPeek.first, msgId)) {
                return;
            }
            WebSocketManager.this.m1392t0();
            WebSocketManager.this.m1380h0(pairPeek);
            WebSocketManager.this.m1385m0(STATUS.CONNECTED);
            du2.a("[common][network]", "long link connected!");
        }

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ void m1417f(ki60 ki60Var) {
            WebSocketManager.this.m1385m0(STATUS.FORBIDDEN);
            WebSocketManager.this.m1368V();
            WebSocketManager.this.f1102j.f(new Exception("auth succ == failed"), (exc0) null);
            du2.a("[common][network]", "long link failed!!");
        }

        /* JADX INFO: renamed from: g */
        public void m1418g(byte[] bArr) {
            ki60 ki60VarM1419h = m1419h(bArr);
            if (ki60VarM1419h == null || ki60VarM1419h.a == null) {
                return;
            }
            m1421j(m1414c(ki60VarM1419h), ki60VarM1419h);
        }

        /* JADX INFO: renamed from: h */
        public final ki60 m1419h(byte[] bArr) {
            try {
                LongLinkMessage.Msg from = LongLinkMessage.Msg.parseFrom(bArr);
                if (from == null) {
                    return null;
                }
                List<sul> list = this.f1118a.get(from.getType());
                if (!vwb.J(list)) {
                    return new ki60(from, list.get(0).mo19642d(from));
                }
            } catch (InvalidProtocolBufferException e) {
                CrashHelper.c(e);
            }
            return null;
        }

        /* JADX INFO: renamed from: i */
        public void m1420i() {
        }

        /* JADX INFO: renamed from: j */
        public void m1421j(boolean z, ki60 ki60Var) {
            if (z) {
                WebSocketManager.this.m1370X(new ki60(LongLinkMessage.MsgTypeEnum.MSG_TYPE_PUSH_ACK, ki60Var.a.getMsgId(), LongLinkAuthMessage.PushAck.newBuilder().setRecvTs(qib0.f19784H.guessedCurrentServerTime()).setStaySide(WebSocketManager.this.m1361M()).build()).a());
            }
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.api.WebSocketManager$f */
    public class RunnableC0115f implements Runnable {

        /* JADX INFO: renamed from: a */
        public ByteString f1121a;

        /* JADX INFO: renamed from: b */
        public int f1122b = 0;

        /* JADX INFO: renamed from: c */
        public int f1123c;

        public RunnableC0115f(ByteString byteString, int i) {
            this.f1121a = byteString;
            this.f1123c = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            STATUS statusM1365S = WebSocketManager.this.m1365S();
            if (statusM1365S == STATUS.FORBIDDEN || statusM1365S == STATUS.CLOSE) {
                return;
            }
            int i = this.f1122b;
            this.f1122b = i + 1;
            int i2 = this.f1123c;
            WebSocketManager webSocketManager = WebSocketManager.this;
            if (i >= i2) {
                webSocketManager.f1102j.f(new Exception("retry send msg failed"), (exc0) null);
            } else {
                webSocketManager.m1370X(this.f1121a);
                WebSocketManager.this.f1112t.postDelayed(this, ((long) WebSocketManager.this.f1101i.config.keepalive_timeout) * 1000);
            }
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.api.WebSocketManager$g */
    public class HandlerC0116g extends Handler {
        public HandlerC0116g(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void dispatchMessage(Message message) {
            try {
                super.dispatchMessage(message);
            } catch (Throwable th) {
                CrashHelper.d(th, 100);
            }
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            if (message.what != 10086) {
                super.handleMessage(message);
            } else {
                WebSocketManager.this.m1393u0();
                WebSocketManager.this.m1388p0();
            }
        }

        @Override // android.os.Handler
        public boolean sendMessageAtTime(Message message, long j) {
            try {
                return super.sendMessageAtTime(message, j);
            } catch (Exception e) {
                CrashHelper.c(new Exception("WebSocketManager SafeHandler sendMessageAtTime " + e.getMessage(), e));
                return false;
            }
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.api.WebSocketManager$h */
    public class RunnableC0117h implements Runnable {
        public RunnableC0117h() {
        }

        @Override // java.lang.Runnable
        public void run() {
            Pair<String, ByteString> pairPeek;
            STATUS statusM1365S = WebSocketManager.this.m1365S();
            if (statusM1365S == STATUS.FORBIDDEN || statusM1365S == STATUS.CLOSE || (pairPeek = WebSocketManager.this.f1099g.peek()) == null) {
                return;
            }
            if (WebSocketManager.this.f1105m == null || WebSocketManager.this.f1105m.f1121a != pairPeek.second) {
                WebSocketManager.this.m1382j0((ByteString) pairPeek.second);
            }
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.api.WebSocketManager$i */
    public class RunnableC0118i implements Runnable {

        /* JADX INFO: renamed from: b */
        public int f1128b;

        /* JADX INFO: renamed from: a */
        public int f1127a = 0;

        /* JADX INFO: renamed from: c */
        public boolean f1129c = false;

        public RunnableC0118i(int i) {
            this.f1128b = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (WebSocketManager.this.m1365S() != STATUS.CONNECTED) {
                return;
            }
            if (this.f1129c) {
                WebSocketManager.this.f1102j.f(new Exception("send probe ping failed"), (exc0) null);
                return;
            }
            boolean zM1383k0 = true;
            while (true) {
                int i = this.f1127a;
                this.f1127a = i + 1;
                if (i >= this.f1128b || !zM1383k0) {
                    break;
                } else {
                    zM1383k0 = WebSocketManager.this.m1383k0(null);
                }
            }
            if (zM1383k0) {
                WebSocketManager.this.f1112t.postDelayed(this, ((long) WebSocketManager.this.f1101i.config.keepalive_timeout) * 1000);
            }
            this.f1129c = true;
        }
    }

    public WebSocketManager() {
        C0114e c0114e = new C0114e();
        this.f1100h = c0114e;
        c0114e.m1415d();
    }

    /* JADX INFO: renamed from: N */
    public static String m1328N() {
        return le2.c(UUID.randomUUID().toString().getBytes(), 4);
    }

    /* JADX INFO: renamed from: Q */
    public static WebSocketManager m1329Q() {
        return C0112c.f1116a;
    }

    /* JADX INFO: renamed from: H */
    public void m1356H() {
        HandlerC0116g handlerC0116g = this.f1112t;
        if (handlerC0116g != null) {
            handlerC0116g.removeCallbacksAndMessages(null);
        }
        if (m1365S() == STATUS.CONNECTED) {
            this.f1102j.close(AccountMakeUpMenuView.MakeupCategory.TYPE_MAKEUP_BEAUTYAUTO, "CloseNormalClosure");
        }
        m1385m0(STATUS.CLOSE);
        synchronized (this) {
            try {
                if (this.f1111s != null) {
                    this.f1112t.post(new Runnable() { // from class: l.jjp0
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.f15184a.m1368V();
                        }
                    });
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: I */
    public final int m1357I() {
        int iPow;
        int i;
        ConnectorConfig connectorConfig;
        Connector connector = this.f1101i;
        if (connector == null || (connectorConfig = connector.config) == null) {
            iPow = 5;
            i = 10;
        } else {
            iPow = connectorConfig.reconnect_backoff_min;
            i = connectorConfig.reconnect_backoff_max;
        }
        int i2 = this.f1097e;
        if (i2 >= 3) {
            iPow *= (int) Math.pow(2.0d, i2 / 3);
            i = iPow + 5;
        }
        int i3 = this.f1097e + 1;
        this.f1097e = i3;
        if (i3 > 20) {
            this.f1097e = 20;
        }
        return i <= iPow ? iPow : new Random(System.currentTimeMillis()).nextInt(i - iPow) + iPow;
    }

    /* JADX INFO: renamed from: J */
    public final djp0 m1358J(String str) {
        return fjp0.m(new stc0.a().f().q(str).b(), qib0.f19776D, 0, Network.getUA(), false, new C0111b());
    }

    /* JADX INFO: renamed from: K */
    public void m1359K(LongLinkAuthMessage.Auth.Builder builder) {
    }

    /* JADX INFO: renamed from: L */
    public final void m1360L(String str, ByteString byteString) {
        this.f1099g.add(Pair.create(str, byteString));
        m1394v0();
    }

    @NonNull
    /* JADX INFO: renamed from: M */
    public final LongLinkAuthMessage.AppStaySideEnum m1361M() {
        LongLinkAuthMessage.AppStaySideEnum appStaySideEnum = Act.foreground_() == null ? LongLinkAuthMessage.AppStaySideEnum.APP_STAY_SIDE_BACKGROUND : LongLinkAuthMessage.AppStaySideEnum.APP_STAY_SIDE_FOREGROUND;
        this.f1096d = appStaySideEnum;
        return appStaySideEnum;
    }

    /* JADX INFO: renamed from: O */
    public final void m1362O() {
        ArrayList arrayList = new ArrayList();
        boolean zJ = vwb.J(this.f1101i.wss_addr_list);
        Connector connector = this.f1101i;
        if (zJ) {
            boolean zJ2 = vwb.J(connector.addr_list);
            Connector connector2 = this.f1101i;
            if (!zJ2) {
                arrayList.addAll(connector2.addr_list);
            } else if (!TextUtils.isEmpty(connector2.addr)) {
                arrayList.add(this.f1101i.addr);
            }
        } else {
            arrayList.addAll(connector.wss_addr_list);
        }
        Collections.shuffle(arrayList);
        this.f1110r = arrayList;
    }

    /* JADX INFO: renamed from: P */
    public final String m1363P() {
        return vwb.J(this.f1110r) ? "" : this.f1110r.get(0);
    }

    /* JADX INFO: renamed from: R */
    public final String m1364R() {
        String strLanguage = Network.language();
        if (strLanguage.startsWith(Network.LANGUAGE_ZH_HANT)) {
            return "zh-TW";
        }
        if (strLanguage.startsWith(Network.LANGUAGE_ZH_HANS)) {
            return "zh-CN";
        }
        if (strLanguage.startsWith("en")) {
            return "en-US";
        }
        if (strLanguage.startsWith("ko")) {
            return "ko-KR";
        }
        if (strLanguage.startsWith("ja")) {
            return "ja-JP";
        }
        return strLanguage.startsWith("id") ? "id-ID" : "en-US";
    }

    /* JADX INFO: renamed from: S */
    public STATUS m1365S() {
        STATUS status;
        synchronized (STATUS.class) {
            status = this.f1108p;
        }
        return status;
    }

    @NonNull
    /* JADX INFO: renamed from: T */
    public List<String> m1366T() {
        if (this.f1095c == null) {
            this.f1095c = new ArrayList();
            Iterator<List<sul>> it = this.f1100h.f1118a.values().iterator();
            while (it.hasNext()) {
                Iterator<sul> it2 = it.next().iterator();
                while (it2.hasNext()) {
                    String strMo11744c = it2.next().mo11744c();
                    if (strMo11744c != null) {
                        this.f1095c.add(strMo11744c);
                    }
                }
            }
            this.f1095c.add("conversation.single");
        }
        return this.f1095c;
    }

    /* JADX INFO: renamed from: U */
    public int m1367U() {
        return 1;
    }

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ void m1371Y(Boolean bool) {
        STATUS statusM1365S = m1365S();
        if (!this.f1094b || this.f1109q) {
            if (statusM1365S == STATUS.FORBIDDEN || statusM1365S == STATUS.CLOSE || this.f1112t == null) {
                return;
            }
            if (bool.booleanValue()) {
                this.f1112t.post(this.f1113u);
                return;
            } else {
                if (statusM1365S == STATUS.CONNECTED) {
                    m1370X(new ki60(LongLinkMessage.MsgTypeEnum.MSG_TYPE_SWITCH_SIDE, m1328N(), LongLinkAuthMessage.SwitchSide.newBuilder().setToSide(LongLinkAuthMessage.AppStaySideEnum.APP_STAY_SIDE_BACKGROUND).setMute(true).build()).a());
                    return;
                }
                return;
            }
        }
        this.f1109q = true;
        if (this.f1096d != null) {
            boolean zBooleanValue = bool.booleanValue();
            LongLinkAuthMessage.AppStaySideEnum appStaySideEnum = this.f1096d;
            LongLinkAuthMessage.AppStaySideEnum appStaySideEnum2 = LongLinkAuthMessage.AppStaySideEnum.APP_STAY_SIDE_FOREGROUND;
            if (zBooleanValue == (appStaySideEnum == appStaySideEnum2) || statusM1365S != STATUS.CONNECTED) {
                return;
            }
            m1370X(new ki60(LongLinkMessage.MsgTypeEnum.MSG_TYPE_SWITCH_SIDE, m1328N(), LongLinkAuthMessage.SwitchSide.newBuilder().setToSide(appStaySideEnum2).setMute(false).build()).a());
        }
    }

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ void m1372Z(NetworkInfo networkInfo) {
        HandlerC0116g handlerC0116g;
        STATUS statusM1365S = m1365S();
        if (statusM1365S == STATUS.FORBIDDEN || statusM1365S == STATUS.CLOSE || (handlerC0116g = this.f1112t) == null) {
            return;
        }
        handlerC0116g.post(this.f1113u);
    }

    /* JADX INFO: renamed from: a0 */
    public final /* synthetic */ void m1373a0() {
        if (this.f1107o == null) {
            this.f1107o = Act.foreground().map(new w9j() { // from class: l.mjp0
                public final Object call(Object obj) {
                    return Boolean.valueOf(((Act.r) obj) != null);
                }
            }).distinctUntilChanged().observeOn(avk.a(this.f1112t)).subscribe(mkd0.G(new e30() { // from class: l.njp0
                public final void call(Object obj) {
                    this.f17714a.m1371Y((Boolean) obj);
                }
            }));
        }
        if (this.f1106n == null) {
            this.f1106n = ConnectivityReceiver.m().onBackpressureLatest().observeOn(avk.a(this.f1112t)).subscribe(mkd0.G(new e30() { // from class: l.ojp0
                public final void call(Object obj) {
                    this.f18260a.m1372Z((NetworkInfo) obj);
                }
            }));
        }
        m1385m0(STATUS.DISCONNECTED);
        this.f1112t.post(this.f1113u);
    }

    /* JADX INFO: renamed from: b0 */
    public final void m1374b0(STATUS status) {
        if (status != STATUS.CONNECTED || qib0.f19805c0.mo11999U4()) {
            return;
        }
        qib0.f19805c0.pollUserCounters();
    }

    /* JADX INFO: renamed from: c0, reason: merged with bridge method [inline-methods] */
    public final void m1370X(ByteString byteString) {
        if (m1365S() == STATUS.CONNECTED && !this.f1102j.c(byteString)) {
            this.f1102j.f(new Exception("send msg error"), (exc0) null);
        }
    }

    /* JADX INFO: renamed from: d0 */
    public final void m1376d0() {
        HandlerC0116g handlerC0116g = this.f1112t;
        if (handlerC0116g != null) {
            handlerC0116g.removeCallbacksAndMessages(null);
        }
        STATUS statusM1365S = m1365S();
        if (statusM1365S == STATUS.FORBIDDEN || statusM1365S == STATUS.CLOSE) {
            return;
        }
        djp0 djp0Var = this.f1102j;
        if (djp0Var != null) {
            djp0Var.release();
        }
        m1385m0(STATUS.DISCONNECTED);
        int iM1357I = m1357I();
        this.f1112t.post(new Runnable() { // from class: l.ljp0
            @Override // java.lang.Runnable
            public final void run() {
                this.f16471a.m1369W();
            }
        });
        this.f1112t.postDelayed(this.f1113u, ((long) iM1357I) * 1000);
    }

    /* JADX INFO: renamed from: e0 */
    public void m1377e0(rul rulVar) {
        this.f1100h.f1119b.m21016h(rulVar);
    }

    @Deprecated
    /* JADX INFO: renamed from: f0 */
    public void m1378f0(sul sulVar) {
        List<sul> arrayList = this.f1100h.f1118a.get(sulVar.mo11746f());
        if (arrayList == null) {
            arrayList = new ArrayList<>();
            this.f1100h.f1118a.put(sulVar.mo11746f(), arrayList);
        }
        if (arrayList.size() > 0) {
            n11.h(arrayList.get(0).mo11743b() == sulVar.mo11743b());
        }
        arrayList.add(sulVar);
    }

    /* JADX INFO: renamed from: g0, reason: merged with bridge method [inline-methods] */
    public final void m1369W() {
        if (vwb.J(this.f1110r)) {
            return;
        }
        this.f1110r.remove(0);
    }

    /* JADX INFO: renamed from: h0 */
    public final void m1380h0(Pair<String, ByteString> pair) {
        this.f1099g.remove(pair);
        m1394v0();
    }

    /* JADX INFO: renamed from: i0 */
    public void m1381i0(final ByteString byteString) {
        this.f1112t.post(new Runnable() { // from class: l.ijp0
            @Override // java.lang.Runnable
            public final void run() {
                this.f14526a.m1370X(byteString);
            }
        });
    }

    /* JADX INFO: renamed from: j0 */
    public final void m1382j0(ByteString byteString) {
        if (this.f1102j.c(byteString)) {
            m1389q0(byteString);
        } else {
            this.f1102j.f(new Exception("send msg error"), (exc0) null);
        }
    }

    /* JADX INFO: renamed from: k0 */
    public final boolean m1383k0(ByteString byteString) {
        if (this.f1102j.e(byteString)) {
            return true;
        }
        this.f1102j.f(new Exception("send ping error"), (exc0) null);
        return false;
    }

    /* JADX INFO: renamed from: l0 */
    public void m1384l0(boolean z) {
        this.f1094b = z;
    }

    /* JADX INFO: renamed from: m0 */
    public void m1385m0(STATUS status) {
        synchronized (STATUS.class) {
            try {
                STATUS status2 = this.f1108p;
                this.f1108p = status;
                if (status2 != status) {
                    m1374b0(status);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: n0, reason: merged with bridge method [inline-methods] */
    public final void m1368V() {
        c4g0 c4g0Var = this.f1106n;
        if (c4g0Var != null) {
            c4g0Var.unsubscribe();
            this.f1106n = null;
        }
        c4g0 c4g0Var2 = this.f1107o;
        if (c4g0Var2 != null) {
            c4g0Var2.unsubscribe();
            this.f1107o = null;
        }
        if (this.f1111s != null) {
            this.f1112t.removeCallbacksAndMessages(null);
            this.f1111s.quit();
            this.f1111s = null;
        }
        TantanApp.f1169c.m28211c0();
    }

    /* JADX INFO: renamed from: o0 */
    public void m1387o0() {
        HandlerC0116g handlerC0116g;
        this.f1110r = null;
        synchronized (this) {
            try {
                if (this.f1111s == null) {
                    HandlerThread handlerThread = new HandlerThread("longlink");
                    this.f1111s = handlerThread;
                    handlerThread.start();
                }
                handlerC0116g = new HandlerC0116g(this.f1111s.getLooper());
                this.f1112t = handlerC0116g;
            } catch (Throwable th) {
                throw th;
            }
        }
        handlerC0116g.post(new Runnable() { // from class: l.kjp0
            @Override // java.lang.Runnable
            public final void run() {
                this.f15859a.m1373a0();
            }
        });
    }

    /* JADX INFO: renamed from: p0 */
    public final void m1388p0() {
        if (this.f1103k == null) {
            this.f1103k = new RunnableC0113d();
        }
        this.f1112t.removeCallbacks(this.f1103k);
        this.f1112t.postDelayed(this.f1103k, ((long) this.f1101i.config.keepalive_interval) * 1000);
    }

    /* JADX INFO: renamed from: q0 */
    public final void m1389q0(ByteString byteString) {
        RunnableC0115f runnableC0115f = this.f1105m;
        if (runnableC0115f != null) {
            this.f1112t.removeCallbacks(runnableC0115f);
        }
        RunnableC0115f runnableC0115f2 = new RunnableC0115f(byteString, this.f1101i.config.keepalive_tries);
        this.f1105m = runnableC0115f2;
        this.f1112t.postDelayed(runnableC0115f2, ((long) this.f1101i.config.keepalive_timeout) * 1000);
    }

    /* JADX INFO: renamed from: r0 */
    public final void m1390r0(int i) {
        RunnableC0118i runnableC0118i = this.f1104l;
        if (runnableC0118i != null) {
            this.f1112t.removeCallbacks(runnableC0118i);
        }
        RunnableC0118i runnableC0118i2 = new RunnableC0118i(i);
        this.f1104l = runnableC0118i2;
        this.f1112t.postDelayed(runnableC0118i2, ((long) this.f1101i.config.keepalive_timeout) * 1000);
    }

    /* JADX INFO: renamed from: s0 */
    public final void m1391s0() {
        RunnableC0113d runnableC0113d = this.f1103k;
        if (runnableC0113d != null) {
            this.f1112t.removeCallbacks(runnableC0113d);
        }
    }

    /* JADX INFO: renamed from: t0 */
    public void m1392t0() {
        RunnableC0115f runnableC0115f = this.f1105m;
        if (runnableC0115f != null) {
            this.f1112t.removeCallbacks(runnableC0115f);
        }
    }

    /* JADX INFO: renamed from: u0 */
    public final void m1393u0() {
        RunnableC0118i runnableC0118i = this.f1104l;
        if (runnableC0118i != null) {
            this.f1112t.removeCallbacks(runnableC0118i);
        }
    }

    /* JADX INFO: renamed from: v0 */
    public final void m1394v0() {
        this.f1112t.post(new RunnableC0117h());
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.api.WebSocketManager$b */
    public class C0111b extends hjp0 {
        public C0111b() {
        }

        /* JADX INFO: renamed from: a */
        public void m1401a(djp0 djp0Var, int i, String str) {
            WebSocketManager webSocketManager = WebSocketManager.this;
            if (i == 1012) {
                webSocketManager.f1112t.post(WebSocketManager.this.f1113u);
            } else {
                webSocketManager.m1376d0();
            }
        }

        /* JADX INFO: renamed from: c */
        public void m1403c(djp0 djp0Var, Throwable th, @Nullable exc0 exc0Var) {
            if (ConnectivityReceiver.g()) {
                WebSocketManager.this.f1098f++;
                if (WebSocketManager.this.f1098f == 10) {
                    zvf0.B("e_socket_connection_failed", "", new j760[]{vwb.Y("deviceid", dyd.a()), vwb.Y("error", (th == null || th.getMessage() == null) ? "" : th.getMessage()), vwb.Y("userid", qib0.f19805c0.userId())});
                    WebSocketManager.this.f1098f = 0;
                }
            }
            WebSocketManager.this.m1376d0();
        }

        /* JADX INFO: renamed from: e */
        public void m1405e(djp0 djp0Var, final ByteString byteString) {
            WebSocketManager.this.f1112t.post(new Runnable() { // from class: l.sjp0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f21385a.m1409k(byteString);
                }
            });
        }

        /* JADX INFO: renamed from: f */
        public void m1406f(djp0 djp0Var, exc0 exc0Var) {
            WebSocketManager.this.f1112t.post(new Runnable() { // from class: l.rjp0
                @Override // java.lang.Runnable
                public final void run() throws Exception {
                    this.f20584a.m1410l();
                }
            });
        }

        /* JADX INFO: renamed from: g */
        public void m1407g(ByteString byteString) {
        }

        /* JADX INFO: renamed from: h */
        public void m1408h(ByteString byteString) {
            WebSocketManager.this.f1112t.sendEmptyMessage(10086);
        }

        /* JADX INFO: renamed from: k */
        public final /* synthetic */ void m1409k(ByteString byteString) {
            STATUS statusM1365S = WebSocketManager.this.m1365S();
            STATUS status = STATUS.CLOSE;
            WebSocketManager webSocketManager = WebSocketManager.this;
            if (statusM1365S == status) {
                webSocketManager.f1102j.close(AccountMakeUpMenuView.MakeupCategory.TYPE_MAKEUP_BEAUTYAUTO, "CloseNormalClosure");
                return;
            }
            try {
                webSocketManager.f1100h.m1418g(byteString.toByteArray());
            } catch (Exception e) {
                CrashHelper.d(new Exception("WebSocketManager onMessage " + e.getMessage(), e), 10);
            }
            WebSocketManager.this.m1393u0();
            WebSocketManager.this.m1388p0();
        }

        /* JADX INFO: renamed from: l */
        public final /* synthetic */ void m1410l() throws Exception {
            if (WebSocketManager.this.m1365S() == STATUS.CLOSE) {
                WebSocketManager.this.f1102j.close(AccountMakeUpMenuView.MakeupCategory.TYPE_MAKEUP_BEAUTYAUTO, "CloseNormalClosure");
                return;
            }
            try {
                LongLinkAuthMessage.Auth.Builder deviceIdentifer = LongLinkAuthMessage.Auth.newBuilder().setAccessToken(((AuthData) qib0.f19805c0.getAuthData().b()).accessToken).setStaySide(WebSocketManager.this.m1361M()).setLocale(WebSocketManager.this.m1364R()).setUa(LongLinkAuthMessage.UserAgent.newBuilder().setSource(LongLinkAuthMessage.ClientSourceEnum.CLIENT_SOURCE_ANDROID).setAppVersion(qib0.f19821s).setSourceVersion("" + Build.VERSION.SDK_INT).setBrand(URLEncoder.encode(Build.BRAND)).setModel(URLEncoder.encode(Build.MODEL)).setAppUIVersion(pk8.m21561H()).build()).setAppID("TantanTribe").setMute(Act.foreground_() == null).setDeviceIdentifer(dyd.a());
                deviceIdentifer.setChannel("googleplay");
                WebSocketManager.this.m1359K(deviceIdentifer);
                LongLinkAuthMessage.Auth authBuild = deviceIdentifer.build();
                String strM1328N = WebSocketManager.m1328N();
                WebSocketManager.this.m1360L(strM1328N, new ki60(LongLinkMessage.MsgTypeEnum.MSG_TYPE_AUTH, strM1328N, authBuild).a());
                WebSocketManager.this.f1097e = 0;
                WebSocketManager.this.m1393u0();
                WebSocketManager.this.m1391s0();
            } catch (Exception e) {
                CrashHelper.c(new Exception("WebSocketManager onOpen " + e.getMessage(), e));
                throw e;
            }
        }

        /* JADX INFO: renamed from: d */
        public void m1404d(djp0 djp0Var, String str) {
        }

        /* JADX INFO: renamed from: b */
        public void m1402b(djp0 djp0Var, int i, String str) {
        }
    }
}
