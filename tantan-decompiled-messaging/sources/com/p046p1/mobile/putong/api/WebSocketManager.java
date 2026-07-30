package com.p046p1.mobile.putong.api;

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
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.longlink.msg.connector.LongLinkAuthMessage;
import com.p046p1.mobile.longlink.msg.connector.LongLinkMessage;
import com.p046p1.mobile.putong.api.api.Network;
import com.p046p1.mobile.putong.app.TantanApp;
import com.p046p1.mobile.putong.core.data.UserId;
import com.p046p1.mobile.putong.data.Connector;
import com.p046p1.mobile.putong.data.ConnectorConfig;
import com.p046p1.mobile.putong.data.PushMessageIntent;
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
import okio.ByteString;
import p149l.avk;
import p149l.c4g0;
import p149l.djp0;
import p149l.du2;
import p149l.dyd;
import p149l.e30;
import p149l.exc0;
import p149l.fjp0;
import p149l.hjp0;
import p149l.hpd0;
import p149l.ki60;
import p149l.le2;
import p149l.m2w;
import p149l.mkd0;
import p149l.n11;
import p149l.p2w;
import p149l.pk8;
import p149l.qib0;
import p149l.rul;
import p149l.stc0;
import p149l.sul;
import p149l.vwb;
import p149l.w9j;
import p149l.zvf0;

/* JADX INFO: loaded from: classes9.dex */
public class WebSocketManager {

    /* JADX INFO: renamed from: v */
    public static hpd0 f17103v = new hpd0("long_link_open_in_debug", Boolean.TRUE);

    /* JADX INFO: renamed from: b */
    public volatile boolean f17105b;

    /* JADX INFO: renamed from: d */
    public LongLinkAuthMessage.AppStaySideEnum f17107d;

    /* JADX INFO: renamed from: h */
    public C4688e f17111h;

    /* JADX INFO: renamed from: i */
    public Connector f17112i;

    /* JADX INFO: renamed from: j */
    public djp0 f17113j;

    /* JADX INFO: renamed from: k */
    public RunnableC4687d f17114k;

    /* JADX INFO: renamed from: l */
    public RunnableC4692i f17115l;

    /* JADX INFO: renamed from: m */
    public RunnableC4689f f17116m;

    /* JADX INFO: renamed from: n */
    public c4g0 f17117n;

    /* JADX INFO: renamed from: o */
    public c4g0 f17118o;

    /* JADX INFO: renamed from: r */
    public volatile List<String> f17121r;

    /* JADX INFO: renamed from: s */
    public HandlerThread f17122s;

    /* JADX INFO: renamed from: t */
    public HandlerC4690g f17123t;

    /* JADX INFO: renamed from: a */
    public String f17104a = "WebSocketManager";

    /* JADX INFO: renamed from: c */
    public List<String> f17106c = null;

    /* JADX INFO: renamed from: e */
    public int f17108e = 0;

    /* JADX INFO: renamed from: f */
    public int f17109f = 0;

    /* JADX INFO: renamed from: g */
    public final Queue<Pair<String, ByteString>> f17110g = new LinkedList();

    /* JADX INFO: renamed from: p */
    public volatile STATUS f17119p = STATUS.CLOSE;

    /* JADX INFO: renamed from: q */
    public boolean f17120q = false;

    /* JADX INFO: renamed from: u */
    public Runnable f17124u = new RunnableC4684a();

    public enum STATUS {
        FORBIDDEN,
        CLOSE,
        CONNECTED,
        CONNECTING,
        DISCONNECTED
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.api.WebSocketManager$a */
    public class RunnableC4684a implements Runnable {
        public RunnableC4684a() {
        }

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ void m29491c(Connector connector) {
            WebSocketManager.this.f17112i = connector;
            if (WebSocketManager.this.f17112i != null && WebSocketManager.this.f17112i.config != null) {
                TantanApp.f17180c.m214265d0(WebSocketManager.this.f17112i.config.use_thirdparty_push);
            }
            STATUS statusM29459S = WebSocketManager.this.m29459S();
            STATUS status = STATUS.CLOSE;
            if (statusM29459S == status) {
                return;
            }
            Connector connector2 = WebSocketManager.this.f17112i;
            WebSocketManager webSocketManager = WebSocketManager.this;
            if (connector2 == null) {
                webSocketManager.m29470d0();
                return;
            }
            webSocketManager.m29456O();
            String strM29457P = WebSocketManager.this.m29457P();
            boolean zIsEmpty = TextUtils.isEmpty(strM29457P);
            WebSocketManager webSocketManager2 = WebSocketManager.this;
            if (zIsEmpty) {
                webSocketManager2.m29479m0(status);
            } else {
                webSocketManager2.f17113j = webSocketManager2.m29452J(strM29457P);
            }
        }

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ void m29492d(Throwable th) {
            boolean zM81284g = ConnectivityReceiver.m81284g();
            WebSocketManager webSocketManager = WebSocketManager.this;
            if (zM81284g) {
                webSocketManager.m29470d0();
            } else {
                webSocketManager.m29479m0(STATUS.DISCONNECTED);
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            STATUS status;
            STATUS statusM29459S = WebSocketManager.this.m29459S();
            if (statusM29459S == STATUS.FORBIDDEN || statusM29459S == (status = STATUS.CONNECTING) || statusM29459S == STATUS.CLOSE) {
                return;
            }
            if (WebSocketManager.this.f17113j != null) {
                WebSocketManager.this.f17113j.release();
            }
            WebSocketManager.this.f17110g.clear();
            WebSocketManager.this.f17123t.removeCallbacksAndMessages(null);
            WebSocketManager.this.m29479m0(status);
            String strM29457P = WebSocketManager.this.m29457P();
            if (TextUtils.isEmpty(strM29457P)) {
                qib0.f154706U.m216703C(WebSocketManager.this.m29461U()).observeOn(avk.m99199a(WebSocketManager.this.f17123t)).subscribe(mkd0.m154959K(new e30() { // from class: l.pjp0
                    @Override // p149l.e30
                    public final void call(Object obj) {
                        this.f149856a.m29491c((Connector) obj);
                    }
                }, new e30() { // from class: l.qjp0
                    @Override // p149l.e30
                    public final void call(Object obj) {
                        this.f154959a.m29492d((Throwable) obj);
                    }
                }, false));
            } else {
                WebSocketManager webSocketManager = WebSocketManager.this;
                webSocketManager.f17113j = webSocketManager.m29452J(strM29457P);
            }
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.api.WebSocketManager$c */
    public static class C4686c {

        /* JADX INFO: renamed from: a */
        public static WebSocketManager f17127a = new WebSocketManager();
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.api.WebSocketManager$d */
    public class RunnableC4687d implements Runnable {
        public RunnableC4687d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (WebSocketManager.this.m29459S() == STATUS.CONNECTED && WebSocketManager.this.m29477k0(null)) {
                WebSocketManager webSocketManager = WebSocketManager.this;
                webSocketManager.m29484r0(webSocketManager.f17112i.config.keepalive_tries);
                WebSocketManager.this.m29485s0();
            }
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.api.WebSocketManager$e */
    public class C4688e {

        /* JADX INFO: renamed from: a */
        public final LinkedHashMap<LongLinkMessage.MsgTypeEnum, List<sul>> f17129a = new LinkedHashMap<>();

        /* JADX INFO: renamed from: b */
        public p2w f17130b = new p2w();

        public C4688e() {
        }

        /* JADX INFO: renamed from: c */
        public boolean m29508c(ki60 ki60Var) {
            LongLinkMessage.MsgTypeEnum type = ki60Var.f123271a.getType();
            du2.m113670a("[common][push]", "LongLinkCommonBaseDisposeHandler handle type = " + type + ", originMsg = " + ki60Var.m146053a());
            List<sul> list = this.f17129a.get(type);
            boolean zMo133933a = false;
            if (!vwb.m200296J(list)) {
                Iterator<sul> it = list.iterator();
                while (it.hasNext()) {
                    zMo133933a = it.next().mo133933a(ki60Var.f123272b, ki60Var);
                }
            }
            return zMo133933a;
        }

        /* JADX INFO: renamed from: d */
        public void m29509d() {
            WebSocketManager.this.m29472f0(new m2w(new e30() { // from class: l.tjp0
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f170785a.m29510e((ki60) obj);
                }
            }, new e30() { // from class: l.ujp0
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f176788a.m29511f((ki60) obj);
                }
            }));
            WebSocketManager.this.m29472f0(this.f17130b);
            m29514i();
        }

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ void m29510e(ki60 ki60Var) {
            String msgId = ki60Var.f123271a.getMsgId();
            Pair<String, ByteString> pairPeek = WebSocketManager.this.f17110g.peek();
            if (pairPeek == null || !TextUtils.equals((CharSequence) pairPeek.first, msgId)) {
                return;
            }
            WebSocketManager.this.m29486t0();
            WebSocketManager.this.m29474h0(pairPeek);
            WebSocketManager.this.m29479m0(STATUS.CONNECTED);
            du2.m113670a("[common][network]", "long link connected!");
        }

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ void m29511f(ki60 ki60Var) {
            WebSocketManager.this.m29479m0(STATUS.FORBIDDEN);
            WebSocketManager.this.m29462V();
            WebSocketManager.this.f17113j.mo112096f(new Exception("auth succ == failed"), null);
            du2.m113670a("[common][network]", "long link failed!!");
        }

        /* JADX INFO: renamed from: g */
        public void m29512g(byte[] bArr) {
            ki60 ki60VarM29513h = m29513h(bArr);
            if (ki60VarM29513h == null || ki60VarM29513h.f123271a == null) {
                return;
            }
            m29515j(m29508c(ki60VarM29513h), ki60VarM29513h);
        }

        /* JADX INFO: renamed from: h */
        public final ki60 m29513h(byte[] bArr) {
            try {
                LongLinkMessage.Msg from = LongLinkMessage.Msg.parseFrom(bArr);
                if (from == null) {
                    return null;
                }
                List<sul> list = this.f17129a.get(from.getType());
                if (!vwb.m200296J(list)) {
                    return new ki60(from, list.get(0).mo157683d(from));
                }
            } catch (InvalidProtocolBufferException e) {
                CrashHelper.m81296c(e);
            }
            return null;
        }

        /* JADX INFO: renamed from: i */
        public void m29514i() {
        }

        /* JADX INFO: renamed from: j */
        public void m29515j(boolean z, ki60 ki60Var) {
            if (z) {
                WebSocketManager.this.m29464X(new ki60(LongLinkMessage.MsgTypeEnum.MSG_TYPE_PUSH_ACK, ki60Var.f123271a.getMsgId(), LongLinkAuthMessage.PushAck.newBuilder().setRecvTs(qib0.f154693H.guessedCurrentServerTime()).setStaySide(WebSocketManager.this.m29455M()).build()).m146053a());
            }
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.api.WebSocketManager$f */
    public class RunnableC4689f implements Runnable {

        /* JADX INFO: renamed from: a */
        public ByteString f17132a;

        /* JADX INFO: renamed from: b */
        public int f17133b = 0;

        /* JADX INFO: renamed from: c */
        public int f17134c;

        public RunnableC4689f(ByteString byteString, int i) {
            this.f17132a = byteString;
            this.f17134c = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            STATUS statusM29459S = WebSocketManager.this.m29459S();
            if (statusM29459S == STATUS.FORBIDDEN || statusM29459S == STATUS.CLOSE) {
                return;
            }
            int i = this.f17133b;
            this.f17133b = i + 1;
            int i2 = this.f17134c;
            WebSocketManager webSocketManager = WebSocketManager.this;
            if (i >= i2) {
                webSocketManager.f17113j.mo112096f(new Exception("retry send msg failed"), null);
            } else {
                webSocketManager.m29464X(this.f17132a);
                WebSocketManager.this.f17123t.postDelayed(this, ((long) WebSocketManager.this.f17112i.config.keepalive_timeout) * 1000);
            }
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.api.WebSocketManager$g */
    public class HandlerC4690g extends Handler {
        public HandlerC4690g(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void dispatchMessage(Message message) {
            try {
                super.dispatchMessage(message);
            } catch (Throwable th) {
                CrashHelper.m81297d(th, 100);
            }
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            if (message.what != 10086) {
                super.handleMessage(message);
            } else {
                WebSocketManager.this.m29487u0();
                WebSocketManager.this.m29482p0();
            }
        }

        @Override // android.os.Handler
        public boolean sendMessageAtTime(Message message, long j) {
            try {
                return super.sendMessageAtTime(message, j);
            } catch (Exception e) {
                CrashHelper.m81296c(new Exception("WebSocketManager SafeHandler sendMessageAtTime " + e.getMessage(), e));
                return false;
            }
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.api.WebSocketManager$h */
    public class RunnableC4691h implements Runnable {
        public RunnableC4691h() {
        }

        @Override // java.lang.Runnable
        public void run() {
            Pair<String, ByteString> pairPeek;
            STATUS statusM29459S = WebSocketManager.this.m29459S();
            if (statusM29459S == STATUS.FORBIDDEN || statusM29459S == STATUS.CLOSE || (pairPeek = WebSocketManager.this.f17110g.peek()) == null) {
                return;
            }
            if (WebSocketManager.this.f17116m == null || WebSocketManager.this.f17116m.f17132a != pairPeek.second) {
                WebSocketManager.this.m29476j0((ByteString) pairPeek.second);
            }
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.api.WebSocketManager$i */
    public class RunnableC4692i implements Runnable {

        /* JADX INFO: renamed from: b */
        public int f17139b;

        /* JADX INFO: renamed from: a */
        public int f17138a = 0;

        /* JADX INFO: renamed from: c */
        public boolean f17140c = false;

        public RunnableC4692i(int i) {
            this.f17139b = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (WebSocketManager.this.m29459S() != STATUS.CONNECTED) {
                return;
            }
            if (this.f17140c) {
                WebSocketManager.this.f17113j.mo112096f(new Exception("send probe ping failed"), null);
                return;
            }
            boolean zM29477k0 = true;
            while (true) {
                int i = this.f17138a;
                this.f17138a = i + 1;
                if (i >= this.f17139b || !zM29477k0) {
                    break;
                } else {
                    zM29477k0 = WebSocketManager.this.m29477k0(null);
                }
            }
            if (zM29477k0) {
                WebSocketManager.this.f17123t.postDelayed(this, ((long) WebSocketManager.this.f17112i.config.keepalive_timeout) * 1000);
            }
            this.f17140c = true;
        }
    }

    public WebSocketManager() {
        C4688e c4688e = new C4688e();
        this.f17111h = c4688e;
        c4688e.m29509d();
    }

    /* JADX INFO: renamed from: N */
    public static String m29422N() {
        return le2.m149477c(UUID.randomUUID().toString().getBytes(), 4);
    }

    /* JADX INFO: renamed from: Q */
    public static WebSocketManager m29423Q() {
        return C4686c.f17127a;
    }

    /* JADX INFO: renamed from: H */
    public void m29450H() {
        HandlerC4690g handlerC4690g = this.f17123t;
        if (handlerC4690g != null) {
            handlerC4690g.removeCallbacksAndMessages(null);
        }
        if (m29459S() == STATUS.CONNECTED) {
            this.f17113j.close(1000, "CloseNormalClosure");
        }
        m29479m0(STATUS.CLOSE);
        synchronized (this) {
            try {
                if (this.f17122s != null) {
                    this.f17123t.post(new Runnable() { // from class: l.jjp0
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.f118311a.m29462V();
                        }
                    });
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: I */
    public final int m29451I() {
        int iPow;
        int i;
        ConnectorConfig connectorConfig;
        Connector connector = this.f17112i;
        if (connector == null || (connectorConfig = connector.config) == null) {
            iPow = 5;
            i = 10;
        } else {
            iPow = connectorConfig.reconnect_backoff_min;
            i = connectorConfig.reconnect_backoff_max;
        }
        int i2 = this.f17108e;
        if (i2 >= 3) {
            iPow *= (int) Math.pow(2.0d, i2 / 3);
            i = iPow + 5;
        }
        int i3 = this.f17108e + 1;
        this.f17108e = i3;
        if (i3 > 20) {
            this.f17108e = 20;
        }
        return i <= iPow ? iPow : new Random(System.currentTimeMillis()).nextInt(i - iPow) + iPow;
    }

    /* JADX INFO: renamed from: J */
    public final djp0 m29452J(String str) {
        return fjp0.m121607m(new stc0.C20027a().m185887f().m185898q(str).m185883b(), qib0.f154685D, 0, Network.getUA(), false, new C4685b());
    }

    /* JADX INFO: renamed from: K */
    public void m29453K(LongLinkAuthMessage.Auth.Builder builder) {
    }

    /* JADX INFO: renamed from: L */
    public final void m29454L(String str, ByteString byteString) {
        this.f17110g.add(Pair.create(str, byteString));
        m29488v0();
    }

    @NonNull
    /* JADX INFO: renamed from: M */
    public final LongLinkAuthMessage.AppStaySideEnum m29455M() {
        LongLinkAuthMessage.AppStaySideEnum appStaySideEnum = Act.foreground_() == null ? LongLinkAuthMessage.AppStaySideEnum.APP_STAY_SIDE_BACKGROUND : LongLinkAuthMessage.AppStaySideEnum.APP_STAY_SIDE_FOREGROUND;
        this.f17107d = appStaySideEnum;
        return appStaySideEnum;
    }

    /* JADX INFO: renamed from: O */
    public final void m29456O() {
        ArrayList arrayList = new ArrayList();
        boolean zM200296J = vwb.m200296J(this.f17112i.wss_addr_list);
        Connector connector = this.f17112i;
        if (zM200296J) {
            boolean zM200296J2 = vwb.m200296J(connector.addr_list);
            Connector connector2 = this.f17112i;
            if (!zM200296J2) {
                arrayList.addAll(connector2.addr_list);
            } else if (!TextUtils.isEmpty(connector2.addr)) {
                arrayList.add(this.f17112i.addr);
            }
        } else {
            arrayList.addAll(connector.wss_addr_list);
        }
        Collections.shuffle(arrayList);
        this.f17121r = arrayList;
    }

    /* JADX INFO: renamed from: P */
    public final String m29457P() {
        return vwb.m200296J(this.f17121r) ? "" : this.f17121r.get(0);
    }

    /* JADX INFO: renamed from: R */
    public final String m29458R() {
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
    public STATUS m29459S() {
        STATUS status;
        synchronized (STATUS.class) {
            status = this.f17119p;
        }
        return status;
    }

    @NonNull
    /* JADX INFO: renamed from: T */
    public List<String> m29460T() {
        if (this.f17106c == null) {
            this.f17106c = new ArrayList();
            Iterator<List<sul>> it = this.f17111h.f17129a.values().iterator();
            while (it.hasNext()) {
                Iterator<sul> it2 = it.next().iterator();
                while (it2.hasNext()) {
                    String strMo94754c = it2.next().mo94754c();
                    if (strMo94754c != null) {
                        this.f17106c.add(strMo94754c);
                    }
                }
            }
            this.f17106c.add(PushMessageIntent.conversation_single);
        }
        return this.f17106c;
    }

    /* JADX INFO: renamed from: U */
    public int m29461U() {
        return 1;
    }

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ void m29465Y(Boolean bool) {
        STATUS statusM29459S = m29459S();
        if (!this.f17105b || this.f17120q) {
            if (statusM29459S == STATUS.FORBIDDEN || statusM29459S == STATUS.CLOSE || this.f17123t == null) {
                return;
            }
            if (bool.booleanValue()) {
                this.f17123t.post(this.f17124u);
                return;
            } else {
                if (statusM29459S == STATUS.CONNECTED) {
                    m29464X(new ki60(LongLinkMessage.MsgTypeEnum.MSG_TYPE_SWITCH_SIDE, m29422N(), LongLinkAuthMessage.SwitchSide.newBuilder().setToSide(LongLinkAuthMessage.AppStaySideEnum.APP_STAY_SIDE_BACKGROUND).setMute(true).build()).m146053a());
                    return;
                }
                return;
            }
        }
        this.f17120q = true;
        if (this.f17107d != null) {
            boolean zBooleanValue = bool.booleanValue();
            LongLinkAuthMessage.AppStaySideEnum appStaySideEnum = this.f17107d;
            LongLinkAuthMessage.AppStaySideEnum appStaySideEnum2 = LongLinkAuthMessage.AppStaySideEnum.APP_STAY_SIDE_FOREGROUND;
            if (zBooleanValue == (appStaySideEnum == appStaySideEnum2) || statusM29459S != STATUS.CONNECTED) {
                return;
            }
            m29464X(new ki60(LongLinkMessage.MsgTypeEnum.MSG_TYPE_SWITCH_SIDE, m29422N(), LongLinkAuthMessage.SwitchSide.newBuilder().setToSide(appStaySideEnum2).setMute(false).build()).m146053a());
        }
    }

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ void m29466Z(NetworkInfo networkInfo) {
        HandlerC4690g handlerC4690g;
        STATUS statusM29459S = m29459S();
        if (statusM29459S == STATUS.FORBIDDEN || statusM29459S == STATUS.CLOSE || (handlerC4690g = this.f17123t) == null) {
            return;
        }
        handlerC4690g.post(this.f17124u);
    }

    /* JADX INFO: renamed from: a0 */
    public final /* synthetic */ void m29467a0() {
        if (this.f17118o == null) {
            this.f17118o = Act.foreground().map(new w9j() { // from class: l.mjp0
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return Boolean.valueOf(((Act.C4299r) obj) != null);
                }
            }).distinctUntilChanged().observeOn(avk.m99199a(this.f17123t)).subscribe(mkd0.m154955G(new e30() { // from class: l.njp0
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f139305a.m29465Y((Boolean) obj);
                }
            }));
        }
        if (this.f17117n == null) {
            this.f17117n = ConnectivityReceiver.m81290m().onBackpressureLatest().observeOn(avk.m99199a(this.f17123t)).subscribe(mkd0.m154955G(new e30() { // from class: l.ojp0
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f144332a.m29466Z((NetworkInfo) obj);
                }
            }));
        }
        m29479m0(STATUS.DISCONNECTED);
        this.f17123t.post(this.f17124u);
    }

    /* JADX INFO: renamed from: b0 */
    public final void m29468b0(STATUS status) {
        if (status != STATUS.CONNECTED || qib0.f154714c0.mo97507U4()) {
            return;
        }
        qib0.f154714c0.pollUserCounters();
    }

    /* JADX INFO: renamed from: c0, reason: merged with bridge method [inline-methods] */
    public final void m29464X(ByteString byteString) {
        if (m29459S() == STATUS.CONNECTED && !this.f17113j.mo112094c(byteString)) {
            this.f17113j.mo112096f(new Exception("send msg error"), null);
        }
    }

    /* JADX INFO: renamed from: d0 */
    public final void m29470d0() {
        HandlerC4690g handlerC4690g = this.f17123t;
        if (handlerC4690g != null) {
            handlerC4690g.removeCallbacksAndMessages(null);
        }
        STATUS statusM29459S = m29459S();
        if (statusM29459S == STATUS.FORBIDDEN || statusM29459S == STATUS.CLOSE) {
            return;
        }
        djp0 djp0Var = this.f17113j;
        if (djp0Var != null) {
            djp0Var.release();
        }
        m29479m0(STATUS.DISCONNECTED);
        int iM29451I = m29451I();
        this.f17123t.post(new Runnable() { // from class: l.ljp0
            @Override // java.lang.Runnable
            public final void run() {
                this.f128378a.m29463W();
            }
        });
        this.f17123t.postDelayed(this.f17124u, ((long) iM29451I) * 1000);
    }

    /* JADX INFO: renamed from: e0 */
    public void m29471e0(rul rulVar) {
        this.f17111h.f17130b.m167226h(rulVar);
    }

    @Deprecated
    /* JADX INFO: renamed from: f0 */
    public void m29472f0(sul sulVar) {
        List<sul> arrayList = this.f17111h.f17129a.get(sulVar.mo94756f());
        if (arrayList == null) {
            arrayList = new ArrayList<>();
            this.f17111h.f17129a.put(sulVar.mo94756f(), arrayList);
        }
        if (arrayList.size() > 0) {
            n11.m157335h(arrayList.get(0).mo94398b() == sulVar.mo94398b());
        }
        arrayList.add(sulVar);
    }

    /* JADX INFO: renamed from: g0, reason: merged with bridge method [inline-methods] */
    public final void m29463W() {
        if (vwb.m200296J(this.f17121r)) {
            return;
        }
        this.f17121r.remove(0);
    }

    /* JADX INFO: renamed from: h0 */
    public final void m29474h0(Pair<String, ByteString> pair) {
        this.f17110g.remove(pair);
        m29488v0();
    }

    /* JADX INFO: renamed from: i0 */
    public void m29475i0(final ByteString byteString) {
        this.f17123t.post(new Runnable() { // from class: l.ijp0
            @Override // java.lang.Runnable
            public final void run() {
                this.f113588a.m29464X(byteString);
            }
        });
    }

    /* JADX INFO: renamed from: j0 */
    public final void m29476j0(ByteString byteString) {
        if (this.f17113j.mo112094c(byteString)) {
            m29483q0(byteString);
        } else {
            this.f17113j.mo112096f(new Exception("send msg error"), null);
        }
    }

    /* JADX INFO: renamed from: k0 */
    public final boolean m29477k0(ByteString byteString) {
        if (this.f17113j.mo112095e(byteString)) {
            return true;
        }
        this.f17113j.mo112096f(new Exception("send ping error"), null);
        return false;
    }

    /* JADX INFO: renamed from: l0 */
    public void m29478l0(boolean z) {
        this.f17105b = z;
    }

    /* JADX INFO: renamed from: m0 */
    public void m29479m0(STATUS status) {
        synchronized (STATUS.class) {
            try {
                STATUS status2 = this.f17119p;
                this.f17119p = status;
                if (status2 != status) {
                    m29468b0(status);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: n0, reason: merged with bridge method [inline-methods] */
    public final void m29462V() {
        c4g0 c4g0Var = this.f17117n;
        if (c4g0Var != null) {
            c4g0Var.unsubscribe();
            this.f17117n = null;
        }
        c4g0 c4g0Var2 = this.f17118o;
        if (c4g0Var2 != null) {
            c4g0Var2.unsubscribe();
            this.f17118o = null;
        }
        if (this.f17122s != null) {
            this.f17123t.removeCallbacksAndMessages(null);
            this.f17122s.quit();
            this.f17122s = null;
        }
        TantanApp.f17180c.m214264c0();
    }

    /* JADX INFO: renamed from: o0 */
    public void m29481o0() {
        HandlerC4690g handlerC4690g;
        this.f17121r = null;
        synchronized (this) {
            try {
                if (this.f17122s == null) {
                    HandlerThread handlerThread = new HandlerThread("longlink");
                    this.f17122s = handlerThread;
                    handlerThread.start();
                }
                handlerC4690g = new HandlerC4690g(this.f17122s.getLooper());
                this.f17123t = handlerC4690g;
            } catch (Throwable th) {
                throw th;
            }
        }
        handlerC4690g.post(new Runnable() { // from class: l.kjp0
            @Override // java.lang.Runnable
            public final void run() {
                this.f123494a.m29467a0();
            }
        });
    }

    /* JADX INFO: renamed from: p0 */
    public final void m29482p0() {
        if (this.f17114k == null) {
            this.f17114k = new RunnableC4687d();
        }
        this.f17123t.removeCallbacks(this.f17114k);
        this.f17123t.postDelayed(this.f17114k, ((long) this.f17112i.config.keepalive_interval) * 1000);
    }

    /* JADX INFO: renamed from: q0 */
    public final void m29483q0(ByteString byteString) {
        RunnableC4689f runnableC4689f = this.f17116m;
        if (runnableC4689f != null) {
            this.f17123t.removeCallbacks(runnableC4689f);
        }
        RunnableC4689f runnableC4689f2 = new RunnableC4689f(byteString, this.f17112i.config.keepalive_tries);
        this.f17116m = runnableC4689f2;
        this.f17123t.postDelayed(runnableC4689f2, ((long) this.f17112i.config.keepalive_timeout) * 1000);
    }

    /* JADX INFO: renamed from: r0 */
    public final void m29484r0(int i) {
        RunnableC4692i runnableC4692i = this.f17115l;
        if (runnableC4692i != null) {
            this.f17123t.removeCallbacks(runnableC4692i);
        }
        RunnableC4692i runnableC4692i2 = new RunnableC4692i(i);
        this.f17115l = runnableC4692i2;
        this.f17123t.postDelayed(runnableC4692i2, ((long) this.f17112i.config.keepalive_timeout) * 1000);
    }

    /* JADX INFO: renamed from: s0 */
    public final void m29485s0() {
        RunnableC4687d runnableC4687d = this.f17114k;
        if (runnableC4687d != null) {
            this.f17123t.removeCallbacks(runnableC4687d);
        }
    }

    /* JADX INFO: renamed from: t0 */
    public void m29486t0() {
        RunnableC4689f runnableC4689f = this.f17116m;
        if (runnableC4689f != null) {
            this.f17123t.removeCallbacks(runnableC4689f);
        }
    }

    /* JADX INFO: renamed from: u0 */
    public final void m29487u0() {
        RunnableC4692i runnableC4692i = this.f17115l;
        if (runnableC4692i != null) {
            this.f17123t.removeCallbacks(runnableC4692i);
        }
    }

    /* JADX INFO: renamed from: v0 */
    public final void m29488v0() {
        this.f17123t.post(new RunnableC4691h());
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.api.WebSocketManager$b */
    public class C4685b extends hjp0 {
        public C4685b() {
        }

        @Override // p149l.hjp0
        /* JADX INFO: renamed from: a */
        public void mo29495a(djp0 djp0Var, int i, String str) {
            WebSocketManager webSocketManager = WebSocketManager.this;
            if (i == 1012) {
                webSocketManager.f17123t.post(WebSocketManager.this.f17124u);
            } else {
                webSocketManager.m29470d0();
            }
        }

        @Override // p149l.hjp0
        /* JADX INFO: renamed from: c */
        public void mo29497c(djp0 djp0Var, Throwable th, @Nullable exc0 exc0Var) {
            if (ConnectivityReceiver.m81284g()) {
                WebSocketManager.this.f17109f++;
                if (WebSocketManager.this.f17109f == 10) {
                    zvf0.m220369B("e_socket_connection_failed", "", vwb.m200311Y("deviceid", dyd.m114055a()), vwb.m200311Y("error", (th == null || th.getMessage() == null) ? "" : th.getMessage()), vwb.m200311Y(UserId.TYPE, qib0.f154714c0.userId()));
                    WebSocketManager.this.f17109f = 0;
                }
            }
            WebSocketManager.this.m29470d0();
        }

        @Override // p149l.hjp0
        /* JADX INFO: renamed from: e */
        public void mo29499e(djp0 djp0Var, final ByteString byteString) {
            WebSocketManager.this.f17123t.post(new Runnable() { // from class: l.sjp0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f164885a.m29503k(byteString);
                }
            });
        }

        @Override // p149l.hjp0
        /* JADX INFO: renamed from: f */
        public void mo29500f(djp0 djp0Var, exc0 exc0Var) {
            WebSocketManager.this.f17123t.post(new Runnable() { // from class: l.rjp0
                @Override // java.lang.Runnable
                public final void run() throws Exception {
                    this.f159731a.m29504l();
                }
            });
        }

        @Override // p149l.hjp0
        /* JADX INFO: renamed from: g */
        public void mo29501g(ByteString byteString) {
        }

        @Override // p149l.hjp0
        /* JADX INFO: renamed from: h */
        public void mo29502h(ByteString byteString) {
            WebSocketManager.this.f17123t.sendEmptyMessage(10086);
        }

        /* JADX INFO: renamed from: k */
        public final /* synthetic */ void m29503k(ByteString byteString) {
            STATUS statusM29459S = WebSocketManager.this.m29459S();
            STATUS status = STATUS.CLOSE;
            WebSocketManager webSocketManager = WebSocketManager.this;
            if (statusM29459S == status) {
                webSocketManager.f17113j.close(1000, "CloseNormalClosure");
                return;
            }
            try {
                webSocketManager.f17111h.m29512g(byteString.toByteArray());
            } catch (Exception e) {
                CrashHelper.m81297d(new Exception("WebSocketManager onMessage " + e.getMessage(), e), 10);
            }
            WebSocketManager.this.m29487u0();
            WebSocketManager.this.m29482p0();
        }

        /* JADX INFO: renamed from: l */
        public final /* synthetic */ void m29504l() throws Exception {
            if (WebSocketManager.this.m29459S() == STATUS.CLOSE) {
                WebSocketManager.this.f17113j.close(1000, "CloseNormalClosure");
                return;
            }
            try {
                LongLinkAuthMessage.Auth.Builder deviceIdentifer = LongLinkAuthMessage.Auth.newBuilder().setAccessToken(qib0.f154714c0.getAuthData().mo108248b().accessToken).setStaySide(WebSocketManager.this.m29455M()).setLocale(WebSocketManager.this.m29458R()).setUa(LongLinkAuthMessage.UserAgent.newBuilder().setSource(LongLinkAuthMessage.ClientSourceEnum.CLIENT_SOURCE_ANDROID).setAppVersion(qib0.f154730s).setSourceVersion("" + Build.VERSION.SDK_INT).setBrand(URLEncoder.encode(Build.BRAND)).setModel(URLEncoder.encode(Build.MODEL)).setAppUIVersion(pk8.m169979H()).build()).setAppID("TantanTribe").setMute(Act.foreground_() == null).setDeviceIdentifer(dyd.m114055a());
                deviceIdentifer.setChannel("googleplay");
                WebSocketManager.this.m29453K(deviceIdentifer);
                LongLinkAuthMessage.Auth authBuild = deviceIdentifer.build();
                String strM29422N = WebSocketManager.m29422N();
                WebSocketManager.this.m29454L(strM29422N, new ki60(LongLinkMessage.MsgTypeEnum.MSG_TYPE_AUTH, strM29422N, authBuild).m146053a());
                WebSocketManager.this.f17108e = 0;
                WebSocketManager.this.m29487u0();
                WebSocketManager.this.m29485s0();
            } catch (Exception e) {
                CrashHelper.m81296c(new Exception("WebSocketManager onOpen " + e.getMessage(), e));
                throw e;
            }
        }

        @Override // p149l.hjp0
        /* JADX INFO: renamed from: d */
        public void mo29498d(djp0 djp0Var, String str) {
        }

        @Override // p149l.hjp0
        /* JADX INFO: renamed from: b */
        public void mo29496b(djp0 djp0Var, int i, String str) {
        }
    }
}
