package com.p051p1.mobile.putong.api;

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
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.longlink.msg.connector.LongLinkAuthMessage;
import com.p051p1.mobile.longlink.msg.connector.LongLinkMessage;
import com.p051p1.mobile.putong.api.api.Network;
import com.p051p1.mobile.putong.app.TantanApp;
import com.p051p1.mobile.putong.core.data.UserId;
import com.p051p1.mobile.putong.data.Connector;
import com.p051p1.mobile.putong.data.ConnectorConfig;
import com.p051p1.mobile.putong.data.PushMessageIntent;
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
import p153l.exl;
import p153l.fxl;
import p153l.i4g0;
import p153l.i5d0;
import p153l.isp0;
import p153l.jsp0;
import p153l.jxd0;
import p153l.jyb;
import p153l.k4w;
import p153l.kcg0;
import p153l.lsp0;
import p153l.n4w;
import p153l.pq60;
import p153l.psd0;
import p153l.qcj;
import p153l.qxk;
import p153l.qzd;
import p153l.te2;
import p153l.tl8;
import p153l.tu2;
import p153l.u11;
import p153l.uqb0;
import p153l.x1d0;
import p153l.y20;

/* JADX INFO: loaded from: classes9.dex */
public class WebSocketManager {

    /* JADX INFO: renamed from: v */
    public static jxd0 f17822v = new jxd0("long_link_open_in_debug", Boolean.TRUE);

    /* JADX INFO: renamed from: b */
    public volatile boolean f17824b;

    /* JADX INFO: renamed from: d */
    public LongLinkAuthMessage.AppStaySideEnum f17826d;

    /* JADX INFO: renamed from: h */
    public C4839e f17830h;

    /* JADX INFO: renamed from: i */
    public Connector f17831i;

    /* JADX INFO: renamed from: j */
    public isp0 f17832j;

    /* JADX INFO: renamed from: k */
    public RunnableC4838d f17833k;

    /* JADX INFO: renamed from: l */
    public RunnableC4843i f17834l;

    /* JADX INFO: renamed from: m */
    public RunnableC4840f f17835m;

    /* JADX INFO: renamed from: n */
    public kcg0 f17836n;

    /* JADX INFO: renamed from: o */
    public kcg0 f17837o;

    /* JADX INFO: renamed from: r */
    public volatile List<String> f17840r;

    /* JADX INFO: renamed from: s */
    public HandlerThread f17841s;

    /* JADX INFO: renamed from: t */
    public HandlerC4841g f17842t;

    /* JADX INFO: renamed from: a */
    public String f17823a = "WebSocketManager";

    /* JADX INFO: renamed from: c */
    public List<String> f17825c = null;

    /* JADX INFO: renamed from: e */
    public int f17827e = 0;

    /* JADX INFO: renamed from: f */
    public int f17828f = 0;

    /* JADX INFO: renamed from: g */
    public final Queue<Pair<String, ByteString>> f17829g = new LinkedList();

    /* JADX INFO: renamed from: p */
    public volatile STATUS f17838p = STATUS.CLOSE;

    /* JADX INFO: renamed from: q */
    public boolean f17839q = false;

    /* JADX INFO: renamed from: u */
    public Runnable f17843u = new RunnableC4835a();

    public enum STATUS {
        FORBIDDEN,
        CLOSE,
        CONNECTED,
        CONNECTING,
        DISCONNECTED
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.api.WebSocketManager$a */
    public class RunnableC4835a implements Runnable {
        public RunnableC4835a() {
        }

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ void m30489c(Connector connector) {
            WebSocketManager.this.f17831i = connector;
            if (WebSocketManager.this.f17831i != null && WebSocketManager.this.f17831i.config != null) {
                TantanApp.f17899c.m111143d0(WebSocketManager.this.f17831i.config.use_thirdparty_push);
            }
            STATUS statusM30457S = WebSocketManager.this.m30457S();
            STATUS status = STATUS.CLOSE;
            if (statusM30457S == status) {
                return;
            }
            Connector connector2 = WebSocketManager.this.f17831i;
            WebSocketManager webSocketManager = WebSocketManager.this;
            if (connector2 == null) {
                webSocketManager.m30468d0();
                return;
            }
            webSocketManager.m30454O();
            String strM30455P = WebSocketManager.this.m30455P();
            boolean zIsEmpty = TextUtils.isEmpty(strM30455P);
            WebSocketManager webSocketManager2 = WebSocketManager.this;
            if (zIsEmpty) {
                webSocketManager2.m30477m0(status);
            } else {
                webSocketManager2.f17832j = webSocketManager2.m30450J(strM30455P);
            }
        }

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ void m30490d(Throwable th) {
            boolean zM82467g = ConnectivityReceiver.m82467g();
            WebSocketManager webSocketManager = WebSocketManager.this;
            if (zM82467g) {
                webSocketManager.m30468d0();
            } else {
                webSocketManager.m30477m0(STATUS.DISCONNECTED);
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            STATUS status;
            STATUS statusM30457S = WebSocketManager.this.m30457S();
            if (statusM30457S == STATUS.FORBIDDEN || statusM30457S == (status = STATUS.CONNECTING) || statusM30457S == STATUS.CLOSE) {
                return;
            }
            if (WebSocketManager.this.f17832j != null) {
                WebSocketManager.this.f17832j.release();
            }
            WebSocketManager.this.f17829g.clear();
            WebSocketManager.this.f17842t.removeCallbacksAndMessages(null);
            WebSocketManager.this.m30477m0(status);
            String strM30455P = WebSocketManager.this.m30455P();
            if (TextUtils.isEmpty(strM30455P)) {
                uqb0.f180389U.m204477C(WebSocketManager.this.m30459U()).observeOn(qxk.m178605a(WebSocketManager.this.f17842t)).subscribe(psd0.m173600K(new y20() { // from class: l.tsp0
                    @Override // p153l.y20
                    public final void call(Object obj) {
                        this.f176012a.m30489c((Connector) obj);
                    }
                }, new y20() { // from class: l.usp0
                    @Override // p153l.y20
                    public final void call(Object obj) {
                        this.f180843a.m30490d((Throwable) obj);
                    }
                }, false));
            } else {
                WebSocketManager webSocketManager = WebSocketManager.this;
                webSocketManager.f17832j = webSocketManager.m30450J(strM30455P);
            }
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.api.WebSocketManager$c */
    public static class C4837c {

        /* JADX INFO: renamed from: a */
        public static WebSocketManager f17846a = new WebSocketManager();
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.api.WebSocketManager$d */
    public class RunnableC4838d implements Runnable {
        public RunnableC4838d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (WebSocketManager.this.m30457S() == STATUS.CONNECTED && WebSocketManager.this.m30475k0(null)) {
                WebSocketManager webSocketManager = WebSocketManager.this;
                webSocketManager.m30482r0(webSocketManager.f17831i.config.keepalive_tries);
                WebSocketManager.this.m30483s0();
            }
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.api.WebSocketManager$e */
    public class C4839e {

        /* JADX INFO: renamed from: a */
        public final LinkedHashMap<LongLinkMessage.MsgTypeEnum, List<fxl>> f17848a = new LinkedHashMap<>();

        /* JADX INFO: renamed from: b */
        public n4w f17849b = new n4w();

        public C4839e() {
        }

        /* JADX INFO: renamed from: c */
        public boolean m30506c(pq60 pq60Var) {
            LongLinkMessage.MsgTypeEnum type = pq60Var.f153643a.getType();
            tu2.m192703a("[common][push]", "LongLinkCommonBaseDisposeHandler handle type = " + type + ", originMsg = " + pq60Var.m173324a());
            List<fxl> list = this.f17848a.get(type);
            boolean zMo123068a = false;
            if (!jyb.m147479J(list)) {
                Iterator<fxl> it = list.iterator();
                while (it.hasNext()) {
                    zMo123068a = it.next().mo123068a(pq60Var.f153644b, pq60Var);
                }
            }
            return zMo123068a;
        }

        /* JADX INFO: renamed from: d */
        public void m30507d() {
            WebSocketManager.this.m30470f0(new k4w(new y20() { // from class: l.xsp0
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f196119a.m30508e((pq60) obj);
                }
            }, new y20() { // from class: l.ysp0
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f201428a.m30509f((pq60) obj);
                }
            }));
            WebSocketManager.this.m30470f0(this.f17849b);
            m30512i();
        }

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ void m30508e(pq60 pq60Var) {
            String msgId = pq60Var.f153643a.getMsgId();
            Pair<String, ByteString> pairPeek = WebSocketManager.this.f17829g.peek();
            if (pairPeek == null || !TextUtils.equals((CharSequence) pairPeek.first, msgId)) {
                return;
            }
            WebSocketManager.this.m30484t0();
            WebSocketManager.this.m30472h0(pairPeek);
            WebSocketManager.this.m30477m0(STATUS.CONNECTED);
            tu2.m192703a("[common][network]", "long link connected!");
        }

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ void m30509f(pq60 pq60Var) {
            WebSocketManager.this.m30477m0(STATUS.FORBIDDEN);
            WebSocketManager.this.m30460V();
            WebSocketManager.this.f17832j.mo141889f(new Exception("auth succ == failed"), null);
            tu2.m192703a("[common][network]", "long link failed!!");
        }

        /* JADX INFO: renamed from: g */
        public void m30510g(byte[] bArr) {
            pq60 pq60VarM30511h = m30511h(bArr);
            if (pq60VarM30511h == null || pq60VarM30511h.f153643a == null) {
                return;
            }
            m30513j(m30506c(pq60VarM30511h), pq60VarM30511h);
        }

        /* JADX INFO: renamed from: h */
        public final pq60 m30511h(byte[] bArr) {
            try {
                LongLinkMessage.Msg from = LongLinkMessage.Msg.parseFrom(bArr);
                if (from == null) {
                    return null;
                }
                List<fxl> list = this.f17848a.get(from.getType());
                if (!jyb.m147479J(list)) {
                    return new pq60(from, list.get(0).mo127983d(from));
                }
            } catch (InvalidProtocolBufferException e) {
                CrashHelper.m82479c(e);
            }
            return null;
        }

        /* JADX INFO: renamed from: i */
        public void m30512i() {
        }

        /* JADX INFO: renamed from: j */
        public void m30513j(boolean z, pq60 pq60Var) {
            if (z) {
                WebSocketManager.this.m30462X(new pq60(LongLinkMessage.MsgTypeEnum.MSG_TYPE_PUSH_ACK, pq60Var.f153643a.getMsgId(), LongLinkAuthMessage.PushAck.newBuilder().setRecvTs(uqb0.f180376H.guessedCurrentServerTime()).setStaySide(WebSocketManager.this.m30453M()).build()).m173324a());
            }
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.api.WebSocketManager$f */
    public class RunnableC4840f implements Runnable {

        /* JADX INFO: renamed from: a */
        public ByteString f17851a;

        /* JADX INFO: renamed from: b */
        public int f17852b = 0;

        /* JADX INFO: renamed from: c */
        public int f17853c;

        public RunnableC4840f(ByteString byteString, int i) {
            this.f17851a = byteString;
            this.f17853c = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            STATUS statusM30457S = WebSocketManager.this.m30457S();
            if (statusM30457S == STATUS.FORBIDDEN || statusM30457S == STATUS.CLOSE) {
                return;
            }
            int i = this.f17852b;
            this.f17852b = i + 1;
            int i2 = this.f17853c;
            WebSocketManager webSocketManager = WebSocketManager.this;
            if (i >= i2) {
                webSocketManager.f17832j.mo141889f(new Exception("retry send msg failed"), null);
            } else {
                webSocketManager.m30462X(this.f17851a);
                WebSocketManager.this.f17842t.postDelayed(this, ((long) WebSocketManager.this.f17831i.config.keepalive_timeout) * 1000);
            }
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.api.WebSocketManager$g */
    public class HandlerC4841g extends Handler {
        public HandlerC4841g(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void dispatchMessage(Message message) {
            try {
                super.dispatchMessage(message);
            } catch (Throwable th) {
                CrashHelper.m82480d(th, 100);
            }
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            if (message.what != 10086) {
                super.handleMessage(message);
            } else {
                WebSocketManager.this.m30485u0();
                WebSocketManager.this.m30480p0();
            }
        }

        @Override // android.os.Handler
        public boolean sendMessageAtTime(Message message, long j) {
            try {
                return super.sendMessageAtTime(message, j);
            } catch (Exception e) {
                CrashHelper.m82479c(new Exception("WebSocketManager SafeHandler sendMessageAtTime " + e.getMessage(), e));
                return false;
            }
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.api.WebSocketManager$h */
    public class RunnableC4842h implements Runnable {
        public RunnableC4842h() {
        }

        @Override // java.lang.Runnable
        public void run() {
            Pair<String, ByteString> pairPeek;
            STATUS statusM30457S = WebSocketManager.this.m30457S();
            if (statusM30457S == STATUS.FORBIDDEN || statusM30457S == STATUS.CLOSE || (pairPeek = WebSocketManager.this.f17829g.peek()) == null) {
                return;
            }
            if (WebSocketManager.this.f17835m == null || WebSocketManager.this.f17835m.f17851a != pairPeek.second) {
                WebSocketManager.this.m30474j0((ByteString) pairPeek.second);
            }
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.api.WebSocketManager$i */
    public class RunnableC4843i implements Runnable {

        /* JADX INFO: renamed from: b */
        public int f17858b;

        /* JADX INFO: renamed from: a */
        public int f17857a = 0;

        /* JADX INFO: renamed from: c */
        public boolean f17859c = false;

        public RunnableC4843i(int i) {
            this.f17858b = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (WebSocketManager.this.m30457S() != STATUS.CONNECTED) {
                return;
            }
            if (this.f17859c) {
                WebSocketManager.this.f17832j.mo141889f(new Exception("send probe ping failed"), null);
                return;
            }
            boolean zM30475k0 = true;
            while (true) {
                int i = this.f17857a;
                this.f17857a = i + 1;
                if (i >= this.f17858b || !zM30475k0) {
                    break;
                } else {
                    zM30475k0 = WebSocketManager.this.m30475k0(null);
                }
            }
            if (zM30475k0) {
                WebSocketManager.this.f17842t.postDelayed(this, ((long) WebSocketManager.this.f17831i.config.keepalive_timeout) * 1000);
            }
            this.f17859c = true;
        }
    }

    public WebSocketManager() {
        C4839e c4839e = new C4839e();
        this.f17830h = c4839e;
        c4839e.m30507d();
    }

    /* JADX INFO: renamed from: N */
    public static String m30420N() {
        return te2.m190678c(UUID.randomUUID().toString().getBytes(), 4);
    }

    /* JADX INFO: renamed from: Q */
    public static WebSocketManager m30421Q() {
        return C4837c.f17846a;
    }

    /* JADX INFO: renamed from: H */
    public void m30448H() {
        HandlerC4841g handlerC4841g = this.f17842t;
        if (handlerC4841g != null) {
            handlerC4841g.removeCallbacksAndMessages(null);
        }
        if (m30457S() == STATUS.CONNECTED) {
            this.f17832j.close(1000, "CloseNormalClosure");
        }
        m30477m0(STATUS.CLOSE);
        synchronized (this) {
            try {
                if (this.f17841s != null) {
                    this.f17842t.post(new Runnable() { // from class: l.nsp0
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.f143527a.m30460V();
                        }
                    });
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: I */
    public final int m30449I() {
        int iPow;
        int i;
        ConnectorConfig connectorConfig;
        Connector connector = this.f17831i;
        if (connector == null || (connectorConfig = connector.config) == null) {
            iPow = 5;
            i = 10;
        } else {
            iPow = connectorConfig.reconnect_backoff_min;
            i = connectorConfig.reconnect_backoff_max;
        }
        int i2 = this.f17827e;
        if (i2 >= 3) {
            iPow *= (int) Math.pow(2.0d, i2 / 3);
            i = iPow + 5;
        }
        int i3 = this.f17827e + 1;
        this.f17827e = i3;
        if (i3 > 20) {
            this.f17827e = 20;
        }
        return i <= iPow ? iPow : new Random(System.currentTimeMillis()).nextInt(i - iPow) + iPow;
    }

    /* JADX INFO: renamed from: J */
    public final isp0 m30450J(String str) {
        return jsp0.m146852m(new x1d0.C21228a().m209032f().m209043q(str).m209028b(), uqb0.f180368D, 0, Network.getUA(), false, new C4836b());
    }

    /* JADX INFO: renamed from: K */
    public void m30451K(LongLinkAuthMessage.Auth.Builder builder) {
    }

    /* JADX INFO: renamed from: L */
    public final void m30452L(String str, ByteString byteString) {
        this.f17829g.add(Pair.create(str, byteString));
        m30486v0();
    }

    @NonNull
    /* JADX INFO: renamed from: M */
    public final LongLinkAuthMessage.AppStaySideEnum m30453M() {
        LongLinkAuthMessage.AppStaySideEnum appStaySideEnum = Act.foreground_() == null ? LongLinkAuthMessage.AppStaySideEnum.APP_STAY_SIDE_BACKGROUND : LongLinkAuthMessage.AppStaySideEnum.APP_STAY_SIDE_FOREGROUND;
        this.f17826d = appStaySideEnum;
        return appStaySideEnum;
    }

    /* JADX INFO: renamed from: O */
    public final void m30454O() {
        ArrayList arrayList = new ArrayList();
        boolean zM147479J = jyb.m147479J(this.f17831i.wss_addr_list);
        Connector connector = this.f17831i;
        if (zM147479J) {
            boolean zM147479J2 = jyb.m147479J(connector.addr_list);
            Connector connector2 = this.f17831i;
            if (!zM147479J2) {
                arrayList.addAll(connector2.addr_list);
            } else if (!TextUtils.isEmpty(connector2.addr)) {
                arrayList.add(this.f17831i.addr);
            }
        } else {
            arrayList.addAll(connector.wss_addr_list);
        }
        Collections.shuffle(arrayList);
        this.f17840r = arrayList;
    }

    /* JADX INFO: renamed from: P */
    public final String m30455P() {
        return jyb.m147479J(this.f17840r) ? "" : this.f17840r.get(0);
    }

    /* JADX INFO: renamed from: R */
    public final String m30456R() {
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
    public STATUS m30457S() {
        STATUS status;
        synchronized (STATUS.class) {
            status = this.f17838p;
        }
        return status;
    }

    @NonNull
    /* JADX INFO: renamed from: T */
    public List<String> m30458T() {
        if (this.f17825c == null) {
            this.f17825c = new ArrayList();
            Iterator<List<fxl>> it = this.f17830h.f17848a.values().iterator();
            while (it.hasNext()) {
                Iterator<fxl> it2 = it.next().iterator();
                while (it2.hasNext()) {
                    String strMo96253c = it2.next().mo96253c();
                    if (strMo96253c != null) {
                        this.f17825c.add(strMo96253c);
                    }
                }
            }
            this.f17825c.add(PushMessageIntent.conversation_single);
        }
        return this.f17825c;
    }

    /* JADX INFO: renamed from: U */
    public int m30459U() {
        return 1;
    }

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ void m30463Y(Boolean bool) {
        STATUS statusM30457S = m30457S();
        if (!this.f17824b || this.f17839q) {
            if (statusM30457S == STATUS.FORBIDDEN || statusM30457S == STATUS.CLOSE || this.f17842t == null) {
                return;
            }
            if (bool.booleanValue()) {
                this.f17842t.post(this.f17843u);
                return;
            } else {
                if (statusM30457S == STATUS.CONNECTED) {
                    m30462X(new pq60(LongLinkMessage.MsgTypeEnum.MSG_TYPE_SWITCH_SIDE, m30420N(), LongLinkAuthMessage.SwitchSide.newBuilder().setToSide(LongLinkAuthMessage.AppStaySideEnum.APP_STAY_SIDE_BACKGROUND).setMute(true).build()).m173324a());
                    return;
                }
                return;
            }
        }
        this.f17839q = true;
        if (this.f17826d != null) {
            boolean zBooleanValue = bool.booleanValue();
            LongLinkAuthMessage.AppStaySideEnum appStaySideEnum = this.f17826d;
            LongLinkAuthMessage.AppStaySideEnum appStaySideEnum2 = LongLinkAuthMessage.AppStaySideEnum.APP_STAY_SIDE_FOREGROUND;
            if (zBooleanValue == (appStaySideEnum == appStaySideEnum2) || statusM30457S != STATUS.CONNECTED) {
                return;
            }
            m30462X(new pq60(LongLinkMessage.MsgTypeEnum.MSG_TYPE_SWITCH_SIDE, m30420N(), LongLinkAuthMessage.SwitchSide.newBuilder().setToSide(appStaySideEnum2).setMute(false).build()).m173324a());
        }
    }

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ void m30464Z(NetworkInfo networkInfo) {
        HandlerC4841g handlerC4841g;
        STATUS statusM30457S = m30457S();
        if (statusM30457S == STATUS.FORBIDDEN || statusM30457S == STATUS.CLOSE || (handlerC4841g = this.f17842t) == null) {
            return;
        }
        handlerC4841g.post(this.f17843u);
    }

    /* JADX INFO: renamed from: a0 */
    public final /* synthetic */ void m30465a0() {
        if (this.f17837o == null) {
            this.f17837o = Act.foreground().map(new qcj() { // from class: l.qsp0
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return Boolean.valueOf(((Act.C4450r) obj) != null);
                }
            }).distinctUntilChanged().observeOn(qxk.m178605a(this.f17842t)).subscribe(psd0.m173596G(new y20() { // from class: l.rsp0
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f164713a.m30463Y((Boolean) obj);
                }
            }));
        }
        if (this.f17836n == null) {
            this.f17836n = ConnectivityReceiver.m82473m().onBackpressureLatest().observeOn(qxk.m178605a(this.f17842t)).subscribe(psd0.m173596G(new y20() { // from class: l.ssp0
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f170502a.m30464Z((NetworkInfo) obj);
                }
            }));
        }
        m30477m0(STATUS.DISCONNECTED);
        this.f17842t.post(this.f17843u);
    }

    /* JADX INFO: renamed from: b0 */
    public final void m30466b0(STATUS status) {
        if (status != STATUS.CONNECTED || uqb0.f180397c0.mo105296U4()) {
            return;
        }
        uqb0.f180397c0.pollUserCounters();
    }

    /* JADX INFO: renamed from: c0, reason: merged with bridge method [inline-methods] */
    public final void m30462X(ByteString byteString) {
        if (m30457S() == STATUS.CONNECTED && !this.f17832j.mo141887c(byteString)) {
            this.f17832j.mo141889f(new Exception("send msg error"), null);
        }
    }

    /* JADX INFO: renamed from: d0 */
    public final void m30468d0() {
        HandlerC4841g handlerC4841g = this.f17842t;
        if (handlerC4841g != null) {
            handlerC4841g.removeCallbacksAndMessages(null);
        }
        STATUS statusM30457S = m30457S();
        if (statusM30457S == STATUS.FORBIDDEN || statusM30457S == STATUS.CLOSE) {
            return;
        }
        isp0 isp0Var = this.f17832j;
        if (isp0Var != null) {
            isp0Var.release();
        }
        m30477m0(STATUS.DISCONNECTED);
        int iM30449I = m30449I();
        this.f17842t.post(new Runnable() { // from class: l.psp0
            @Override // java.lang.Runnable
            public final void run() {
                this.f153959a.m30461W();
            }
        });
        this.f17842t.postDelayed(this.f17843u, ((long) iM30449I) * 1000);
    }

    /* JADX INFO: renamed from: e0 */
    public void m30469e0(exl exlVar) {
        this.f17830h.f17849b.m161605h(exlVar);
    }

    @Deprecated
    /* JADX INFO: renamed from: f0 */
    public void m30470f0(fxl fxlVar) {
        List<fxl> arrayList = this.f17830h.f17848a.get(fxlVar.mo102648f());
        if (arrayList == null) {
            arrayList = new ArrayList<>();
            this.f17830h.f17848a.put(fxlVar.mo102648f(), arrayList);
        }
        if (arrayList.size() > 0) {
            u11.m193894h(arrayList.get(0).mo95510b() == fxlVar.mo95510b());
        }
        arrayList.add(fxlVar);
    }

    /* JADX INFO: renamed from: g0, reason: merged with bridge method [inline-methods] */
    public final void m30461W() {
        if (jyb.m147479J(this.f17840r)) {
            return;
        }
        this.f17840r.remove(0);
    }

    /* JADX INFO: renamed from: h0 */
    public final void m30472h0(Pair<String, ByteString> pair) {
        this.f17829g.remove(pair);
        m30486v0();
    }

    /* JADX INFO: renamed from: i0 */
    public void m30473i0(final ByteString byteString) {
        this.f17842t.post(new Runnable() { // from class: l.msp0
            @Override // java.lang.Runnable
            public final void run() {
                this.f138509a.m30462X(byteString);
            }
        });
    }

    /* JADX INFO: renamed from: j0 */
    public final void m30474j0(ByteString byteString) {
        if (this.f17832j.mo141887c(byteString)) {
            m30481q0(byteString);
        } else {
            this.f17832j.mo141889f(new Exception("send msg error"), null);
        }
    }

    /* JADX INFO: renamed from: k0 */
    public final boolean m30475k0(ByteString byteString) {
        if (this.f17832j.mo141888e(byteString)) {
            return true;
        }
        this.f17832j.mo141889f(new Exception("send ping error"), null);
        return false;
    }

    /* JADX INFO: renamed from: l0 */
    public void m30476l0(boolean z) {
        this.f17824b = z;
    }

    /* JADX INFO: renamed from: m0 */
    public void m30477m0(STATUS status) {
        synchronized (STATUS.class) {
            try {
                STATUS status2 = this.f17838p;
                this.f17838p = status;
                if (status2 != status) {
                    m30466b0(status);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: n0, reason: merged with bridge method [inline-methods] */
    public final void m30460V() {
        kcg0 kcg0Var = this.f17836n;
        if (kcg0Var != null) {
            kcg0Var.unsubscribe();
            this.f17836n = null;
        }
        kcg0 kcg0Var2 = this.f17837o;
        if (kcg0Var2 != null) {
            kcg0Var2.unsubscribe();
            this.f17837o = null;
        }
        if (this.f17841s != null) {
            this.f17842t.removeCallbacksAndMessages(null);
            this.f17841s.quit();
            this.f17841s = null;
        }
        TantanApp.f17899c.m111142c0();
    }

    /* JADX INFO: renamed from: o0 */
    public void m30479o0() {
        HandlerC4841g handlerC4841g;
        this.f17840r = null;
        synchronized (this) {
            try {
                if (this.f17841s == null) {
                    HandlerThread handlerThread = new HandlerThread("longlink");
                    this.f17841s = handlerThread;
                    handlerThread.start();
                }
                handlerC4841g = new HandlerC4841g(this.f17841s.getLooper());
                this.f17842t = handlerC4841g;
            } catch (Throwable th) {
                throw th;
            }
        }
        handlerC4841g.post(new Runnable() { // from class: l.osp0
            @Override // java.lang.Runnable
            public final void run() {
                this.f148888a.m30465a0();
            }
        });
    }

    /* JADX INFO: renamed from: p0 */
    public final void m30480p0() {
        if (this.f17833k == null) {
            this.f17833k = new RunnableC4838d();
        }
        this.f17842t.removeCallbacks(this.f17833k);
        this.f17842t.postDelayed(this.f17833k, ((long) this.f17831i.config.keepalive_interval) * 1000);
    }

    /* JADX INFO: renamed from: q0 */
    public final void m30481q0(ByteString byteString) {
        RunnableC4840f runnableC4840f = this.f17835m;
        if (runnableC4840f != null) {
            this.f17842t.removeCallbacks(runnableC4840f);
        }
        RunnableC4840f runnableC4840f2 = new RunnableC4840f(byteString, this.f17831i.config.keepalive_tries);
        this.f17835m = runnableC4840f2;
        this.f17842t.postDelayed(runnableC4840f2, ((long) this.f17831i.config.keepalive_timeout) * 1000);
    }

    /* JADX INFO: renamed from: r0 */
    public final void m30482r0(int i) {
        RunnableC4843i runnableC4843i = this.f17834l;
        if (runnableC4843i != null) {
            this.f17842t.removeCallbacks(runnableC4843i);
        }
        RunnableC4843i runnableC4843i2 = new RunnableC4843i(i);
        this.f17834l = runnableC4843i2;
        this.f17842t.postDelayed(runnableC4843i2, ((long) this.f17831i.config.keepalive_timeout) * 1000);
    }

    /* JADX INFO: renamed from: s0 */
    public final void m30483s0() {
        RunnableC4838d runnableC4838d = this.f17833k;
        if (runnableC4838d != null) {
            this.f17842t.removeCallbacks(runnableC4838d);
        }
    }

    /* JADX INFO: renamed from: t0 */
    public void m30484t0() {
        RunnableC4840f runnableC4840f = this.f17835m;
        if (runnableC4840f != null) {
            this.f17842t.removeCallbacks(runnableC4840f);
        }
    }

    /* JADX INFO: renamed from: u0 */
    public final void m30485u0() {
        RunnableC4843i runnableC4843i = this.f17834l;
        if (runnableC4843i != null) {
            this.f17842t.removeCallbacks(runnableC4843i);
        }
    }

    /* JADX INFO: renamed from: v0 */
    public final void m30486v0() {
        this.f17842t.post(new RunnableC4842h());
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.api.WebSocketManager$b */
    public class C4836b extends lsp0 {
        public C4836b() {
        }

        @Override // p153l.lsp0
        /* JADX INFO: renamed from: a */
        public void mo30493a(isp0 isp0Var, int i, String str) {
            WebSocketManager webSocketManager = WebSocketManager.this;
            if (i == 1012) {
                webSocketManager.f17842t.post(WebSocketManager.this.f17843u);
            } else {
                webSocketManager.m30468d0();
            }
        }

        @Override // p153l.lsp0
        /* JADX INFO: renamed from: c */
        public void mo30495c(isp0 isp0Var, Throwable th, @Nullable i5d0 i5d0Var) {
            if (ConnectivityReceiver.m82467g()) {
                WebSocketManager.this.f17828f++;
                if (WebSocketManager.this.f17828f == 10) {
                    i4g0.m138493B("e_socket_connection_failed", "", jyb.m147494Y("deviceid", qzd.m178768a()), jyb.m147494Y("error", (th == null || th.getMessage() == null) ? "" : th.getMessage()), jyb.m147494Y(UserId.TYPE, uqb0.f180397c0.userId()));
                    WebSocketManager.this.f17828f = 0;
                }
            }
            WebSocketManager.this.m30468d0();
        }

        @Override // p153l.lsp0
        /* JADX INFO: renamed from: e */
        public void mo30497e(isp0 isp0Var, final ByteString byteString) {
            WebSocketManager.this.f17842t.post(new Runnable() { // from class: l.wsp0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f190665a.m30501k(byteString);
                }
            });
        }

        @Override // p153l.lsp0
        /* JADX INFO: renamed from: f */
        public void mo30498f(isp0 isp0Var, i5d0 i5d0Var) {
            WebSocketManager.this.f17842t.post(new Runnable() { // from class: l.vsp0
                @Override // java.lang.Runnable
                public final void run() throws Exception {
                    this.f185644a.m30502l();
                }
            });
        }

        @Override // p153l.lsp0
        /* JADX INFO: renamed from: g */
        public void mo30499g(ByteString byteString) {
        }

        @Override // p153l.lsp0
        /* JADX INFO: renamed from: h */
        public void mo30500h(ByteString byteString) {
            WebSocketManager.this.f17842t.sendEmptyMessage(10086);
        }

        /* JADX INFO: renamed from: k */
        public final /* synthetic */ void m30501k(ByteString byteString) {
            STATUS statusM30457S = WebSocketManager.this.m30457S();
            STATUS status = STATUS.CLOSE;
            WebSocketManager webSocketManager = WebSocketManager.this;
            if (statusM30457S == status) {
                webSocketManager.f17832j.close(1000, "CloseNormalClosure");
                return;
            }
            try {
                webSocketManager.f17830h.m30510g(byteString.toByteArray());
            } catch (Exception e) {
                CrashHelper.m82480d(new Exception("WebSocketManager onMessage " + e.getMessage(), e), 10);
            }
            WebSocketManager.this.m30485u0();
            WebSocketManager.this.m30480p0();
        }

        /* JADX INFO: renamed from: l */
        public final /* synthetic */ void m30502l() throws Exception {
            if (WebSocketManager.this.m30457S() == STATUS.CLOSE) {
                WebSocketManager.this.f17832j.close(1000, "CloseNormalClosure");
                return;
            }
            try {
                LongLinkAuthMessage.Auth.Builder deviceIdentifer = LongLinkAuthMessage.Auth.newBuilder().setAccessToken(uqb0.f180397c0.getAuthData().mo107143b().accessToken).setStaySide(WebSocketManager.this.m30453M()).setLocale(WebSocketManager.this.m30456R()).setUa(LongLinkAuthMessage.UserAgent.newBuilder().setSource(LongLinkAuthMessage.ClientSourceEnum.CLIENT_SOURCE_ANDROID).setAppVersion(uqb0.f180413s).setSourceVersion("" + Build.VERSION.SDK_INT).setBrand(URLEncoder.encode(Build.BRAND)).setModel(URLEncoder.encode(Build.MODEL)).setAppUIVersion(tl8.m191615H()).build()).setAppID("TantanTribe").setMute(Act.foreground_() == null).setDeviceIdentifer(qzd.m178768a());
                deviceIdentifer.setChannel("googleplay");
                WebSocketManager.this.m30451K(deviceIdentifer);
                LongLinkAuthMessage.Auth authBuild = deviceIdentifer.build();
                String strM30420N = WebSocketManager.m30420N();
                WebSocketManager.this.m30452L(strM30420N, new pq60(LongLinkMessage.MsgTypeEnum.MSG_TYPE_AUTH, strM30420N, authBuild).m173324a());
                WebSocketManager.this.f17827e = 0;
                WebSocketManager.this.m30485u0();
                WebSocketManager.this.m30483s0();
            } catch (Exception e) {
                CrashHelper.m82479c(new Exception("WebSocketManager onOpen " + e.getMessage(), e));
                throw e;
            }
        }

        @Override // p153l.lsp0
        /* JADX INFO: renamed from: d */
        public void mo30496d(isp0 isp0Var, String str) {
        }

        @Override // p153l.lsp0
        /* JADX INFO: renamed from: b */
        public void mo30494b(isp0 isp0Var, int i, String str) {
        }
    }
}
