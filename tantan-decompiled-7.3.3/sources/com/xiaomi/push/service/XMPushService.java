package com.xiaomi.push.service;

import android.app.Service;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.database.ContentObserver;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.Parcelable;
import android.os.Process;
import android.os.SystemClock;
import android.provider.Settings;
import android.support.v4.media.session.PlaybackStateCompat;
import android.text.TextUtils;
import com.clevertap.android.sdk.Constants;
import com.tencent.could.huiyansdk.overseas.HuiYanOsConfig;
import com.xiaomi.push.C14885fi;
import com.xiaomi.push.C14886fq;
import com.xiaomi.push.C14887g;
import com.xiaomi.push.C14892gj;
import com.xiaomi.push.C14909h;
import com.xiaomi.push.C14911hb;
import com.xiaomi.push.C14915hf;
import com.xiaomi.push.C14926hu;
import com.xiaomi.push.C14928i;
import com.xiaomi.push.C14933j;
import com.xiaomi.push.C14936m;
import com.xiaomi.push.EnumC14888gf;
import com.xiaomi.push.EnumC14893gk;
import com.xiaomi.push.EnumC14937n;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import p153l.a0r0;
import p153l.a2r0;
import p153l.b5r0;
import p153l.d1r0;
import p153l.d2r0;
import p153l.exq0;
import p153l.eyq0;
import p153l.f2r0;
import p153l.g2r0;
import p153l.gzq0;
import p153l.hvq0;
import p153l.kxq0;
import p153l.l4r0;
import p153l.lvq0;
import p153l.m6r0;
import p153l.mtq0;
import p153l.ntq0;
import p153l.otq0;
import p153l.ouq0;
import p153l.oxq0;
import p153l.p2r0;
import p153l.p7f;
import p153l.szq0;
import p153l.t5r0;
import p153l.tsq0;
import p153l.tzq0;
import p153l.u1r0;
import p153l.u3r0;
import p153l.uv5;
import p153l.v1r0;
import p153l.w0r0;
import p153l.w2r0;
import p153l.wrq0;
import p153l.x1r0;
import p153l.xsq0;
import p153l.xwq0;
import p153l.z1r0;
import p153l.z2r0;
import p153l.zuq0;

/* JADX INFO: loaded from: classes2.dex */
public class XMPushService extends Service implements x1r0 {

    /* JADX INFO: renamed from: b */
    private static boolean f63602b = false;

    /* JADX INFO: renamed from: a */
    private ContentObserver f63605a;

    /* JADX INFO: renamed from: a */
    private C14957a f63607a;

    /* JADX INFO: renamed from: a */
    private C14962f f63608a;

    /* JADX INFO: renamed from: a */
    private C14967k f63609a;

    /* JADX INFO: renamed from: a */
    private C14974r f63610a;

    /* JADX INFO: renamed from: a */
    private C14976t f63611a;

    /* JADX INFO: renamed from: a */
    private C14996as f63613a;

    /* JADX INFO: renamed from: a */
    private C15014h f63614a;

    /* JADX INFO: renamed from: a */
    private Object f63617a;

    /* JADX INFO: renamed from: a */
    private d1r0 f63620a;

    /* JADX INFO: renamed from: a */
    private u1r0 f63621a;

    /* JADX INFO: renamed from: a */
    private v1r0 f63622a;

    /* JADX INFO: renamed from: a */
    private boolean f63624a = false;

    /* JADX INFO: renamed from: a */
    private int f63603a = 0;

    /* JADX INFO: renamed from: b */
    private int f63625b = 0;

    /* JADX INFO: renamed from: a */
    private long f63604a = 0;

    /* JADX INFO: renamed from: a */
    protected Class f63616a = XMJobService.class;

    /* JADX INFO: renamed from: c */
    private int f63626c = -1;

    /* JADX INFO: renamed from: a */
    private C14988ak f63612a = null;

    /* JADX INFO: renamed from: a */
    private C15020n f63615a = null;

    /* JADX INFO: renamed from: a */
    Messenger f63606a = null;

    /* JADX INFO: renamed from: a */
    private Collection<InterfaceC14978aa> f63619a = Collections.synchronizedCollection(new ArrayList());

    /* JADX INFO: renamed from: a */
    private ArrayList<InterfaceC14970n> f63618a = new ArrayList<>();

    /* JADX INFO: renamed from: a */
    private z1r0 f63623a = new z1r0() { // from class: com.xiaomi.push.service.XMPushService.1
        @Override // p153l.z1r0
        /* JADX INFO: renamed from: a */
        public void mo87535a(w0r0 w0r0Var) {
            if (AbstractC15011e.m87808a(w0r0Var)) {
                C14997at.m87730a().m87734a(w0r0Var.m204317D(), SystemClock.elapsedRealtime(), XMPushService.this.m87510a());
            }
            XMPushService xMPushService = XMPushService.this;
            xMPushService.m87516a(xMPushService.new C14960d(w0r0Var));
        }

        @Override // p153l.z1r0
        /* JADX INFO: renamed from: a */
        public void mo87534a(g2r0 g2r0Var) {
            XMPushService xMPushService = XMPushService.this;
            xMPushService.m87516a(xMPushService.new C14969m(g2r0Var));
        }
    };

    /* JADX INFO: renamed from: com.xiaomi.push.service.XMPushService$f */
    public class C14962f extends BroadcastReceiver {
        public C14962f() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            mtq0.m160042r();
            XMPushService.this.onStart(intent, 1);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.push.service.XMPushService$j */
    public static abstract class AbstractC14966j extends C15020n.b {
        public AbstractC14966j(int i) {
            super(i);
        }

        /* JADX INFO: renamed from: a */
        public abstract String mo86633a();

        /* JADX INFO: renamed from: a */
        public abstract void mo86634a();

        @Override // java.lang.Runnable
        public void run() {
            int i = this.f63915a;
            if (i != 4 && i != 8) {
                ouq0.m169394n(wrq0.f190544a, mo86633a());
            }
            mo86634a();
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.push.service.XMPushService$k */
    public class C14967k extends BroadcastReceiver {
        public C14967k() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            ouq0.m169393m("[HB] hold short heartbeat, " + l4r0.m152820e(intent));
            if (intent == null || intent.getExtras() == null) {
                return;
            }
            XMPushService.this.onStart(intent, 1);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.push.service.XMPushService$n */
    public interface InterfaceC14970n {
        /* JADX INFO: renamed from: a */
        void mo87537a();
    }

    /* JADX INFO: renamed from: com.xiaomi.push.service.XMPushService$r */
    public class C14974r extends BroadcastReceiver {
        public C14974r() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            XMPushService.this.onStart(intent, 1);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.push.service.XMPushService$t */
    public class C14976t extends BroadcastReceiver {
        public C14976t() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (!XMPushService.this.f63624a) {
                XMPushService.this.f63624a = true;
            }
            XMPushService.this.onStart(intent, 1);
        }
    }

    /* JADX WARN: Code duplicated, block: B:21:0x00b6  */
    /* JADX INFO: renamed from: b */
    private void m87487b(Intent intent) {
        long j;
        w0r0 w0r0VarM204314f;
        String stringExtra = intent.getStringExtra(AbstractC14991an.f63770F);
        String stringExtra2 = intent.getStringExtra(AbstractC14991an.f63774J);
        Bundle bundleExtra = intent.getBundleExtra("ext_packet");
        C14990am c14990amM87676a = C14990am.m87676a();
        if (bundleExtra != null) {
            f2r0 f2r0Var = (f2r0) m87470a(new f2r0(bundleExtra), stringExtra, stringExtra2);
            if (f2r0Var == null) {
                return;
            } else {
                w0r0VarM204314f = w0r0.m204314f(f2r0Var, c14990amM87676a.m87679a(f2r0Var.m128649m(), f2r0Var.m128653q()).f63748h);
            }
        } else {
            byte[] byteArrayExtra = intent.getByteArrayExtra("ext_raw_packet");
            if (byteArrayExtra != null) {
                try {
                    j = Long.parseLong(intent.getStringExtra(AbstractC14991an.f63801s));
                } catch (NumberFormatException unused) {
                    j = 0;
                }
                String stringExtra3 = intent.getStringExtra(AbstractC14991an.f63802t);
                String stringExtra4 = intent.getStringExtra(AbstractC14991an.f63803u);
                String stringExtra5 = intent.getStringExtra("ext_chid");
                C14990am.b bVarM87679a = c14990amM87676a.m87679a(stringExtra5, String.valueOf(j));
                if (bVarM87679a != null) {
                    w0r0 w0r0Var = new w0r0();
                    try {
                        w0r0Var.m204324h(Integer.parseInt(stringExtra5));
                    } catch (NumberFormatException unused2) {
                    }
                    w0r0Var.m204328l("SECMSG", null);
                    if (TextUtils.isEmpty(stringExtra3)) {
                        stringExtra3 = "xiaomi.com";
                    }
                    w0r0Var.m204326j(j, stringExtra3, stringExtra4);
                    w0r0Var.m204327k(intent.getStringExtra("ext_pkt_id"));
                    w0r0Var.m204330n(byteArrayExtra, bVarM87679a.f63748h);
                    ouq0.m169393m("send a message: chid=" + stringExtra5 + ", packetId=" + intent.getStringExtra("ext_pkt_id"));
                    w0r0VarM204314f = w0r0Var;
                } else {
                    w0r0VarM204314f = null;
                }
            } else {
                w0r0VarM204314f = null;
            }
        }
        if (w0r0VarM204314f != null) {
            m87493c(new C15000aw(this, w0r0VarM204314f));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:22:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:25:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:28:0x00d1 A[Catch: Exception -> 0x00d7, TRY_LEAVE, TryCatch #0 {Exception -> 0x00d7, blocks: (B:26:0x00cb, B:28:0x00d1), top: B:36:0x00cb }] */
    /* JADX WARN: Code duplicated, block: B:34:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:38:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: c */
    public void m87491c() {
        String str;
        xwq0.m213395a().m213418d();
        C15019m.m87852a(getApplicationContext()).m87872a();
        C15004b c15004bM87775a = C15004b.m87775a(getApplicationContext());
        String strM87778a = c15004bM87775a.m87778a();
        ouq0.m169394n("XMPushService", "region of cache is " + strM87778a);
        String strName = "";
        if (TextUtils.isEmpty(strM87778a)) {
            String strM87486b = m87486b();
            str = strM87486b;
            strM87778a = l4r0.m152818c(strM87486b).name();
        } else {
            str = "";
        }
        String str2 = "CN";
        try {
            if (TextUtils.isEmpty(strM87778a) || !EnumC14937n.China.name().equals(strM87778a)) {
                if (TextUtils.isEmpty(strM87778a)) {
                    strM87778a = EnumC14937n.China.name();
                } else {
                    if ("com.xiaomi.xmsf".equals(getPackageName())) {
                        str2 = "";
                    } else {
                        strName = EnumC14937n.China.name();
                    }
                    c15004bM87775a.m87779a(strName, true);
                    c15004bM87775a.m87781b(str2, true);
                    strM87778a = strName;
                }
                ouq0.m169396p("XMPushService", "after check, appRegion is ", strM87778a, ", countryCode=", str);
                if (EnumC14937n.China.name().equals(strM87778a)) {
                    v1r0.m199052a("cn.app.chat.xiaomi.net");
                }
                m87478a(strM87778a);
                if (m87505h()) {
                    ouq0.m169394n("XMPushService", "-->postOnCreate(): try trigger connect now");
                    final AbstractC14966j abstractC14966j = new AbstractC14966j(11) { // from class: com.xiaomi.push.service.XMPushService.13
                        @Override // com.xiaomi.push.service.XMPushService.AbstractC14966j
                        /* JADX INFO: renamed from: a */
                        public void mo86634a() {
                            C15030w.m88012a(XMPushService.this);
                            if (mtq0.m160044t(XMPushService.this)) {
                                XMPushService.this.m87523a(true);
                            }
                        }

                        @Override // com.xiaomi.push.service.XMPushService.AbstractC14966j
                        /* JADX INFO: renamed from: a */
                        public String mo86633a() {
                            return "prepare the mi push account.";
                        }
                    };
                    m87516a(abstractC14966j);
                    C15023q.m87944a(new C15023q.a() { // from class: com.xiaomi.push.service.XMPushService.14
                        @Override // com.xiaomi.push.service.C15023q.a
                        /* JADX INFO: renamed from: a */
                        public void mo87538a() {
                            XMPushService.this.m87516a(abstractC14966j);
                        }
                    });
                }
                if (t5r0.m189422f()) {
                    this.f63614a.m87833a(this);
                }
                if ("com.xiaomi.xmsf".equals(getPackageName())) {
                    C14887g.m86761j(this, getApplicationInfo(), true);
                }
            }
            c15004bM87775a.m87779a(strM87778a, true);
            c15004bM87775a.m87781b("CN", true);
            if (t5r0.m189422f()) {
                this.f63614a.m87833a(this);
            }
        } catch (Exception e) {
            ouq0.m169397q(e);
        }
        str = str2;
        ouq0.m169396p("XMPushService", "after check, appRegion is ", strM87778a, ", countryCode=", str);
        if (EnumC14937n.China.name().equals(strM87778a)) {
            v1r0.m199052a("cn.app.chat.xiaomi.net");
        }
        m87478a(strM87778a);
        if (m87505h()) {
            ouq0.m169394n("XMPushService", "-->postOnCreate(): try trigger connect now");
            final AbstractC14966j abstractC14966j2 = new AbstractC14966j(11) { // from class: com.xiaomi.push.service.XMPushService.13
                @Override // com.xiaomi.push.service.XMPushService.AbstractC14966j
                /* JADX INFO: renamed from: a */
                public void mo86634a() {
                    C15030w.m88012a(XMPushService.this);
                    if (mtq0.m160044t(XMPushService.this)) {
                        XMPushService.this.m87523a(true);
                    }
                }

                @Override // com.xiaomi.push.service.XMPushService.AbstractC14966j
                /* JADX INFO: renamed from: a */
                public String mo86633a() {
                    return "prepare the mi push account.";
                }
            };
            m87516a(abstractC14966j2);
            C15023q.m87944a(new C15023q.a() { // from class: com.xiaomi.push.service.XMPushService.14
                @Override // com.xiaomi.push.service.C15023q.a
                /* JADX INFO: renamed from: a */
                public void mo87538a() {
                    XMPushService.this.m87516a(abstractC14966j2);
                }
            });
        }
        if ("com.xiaomi.xmsf".equals(getPackageName())) {
            C14887g.m86761j(this, getApplicationInfo(), true);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d */
    public void m87497d(Intent intent) {
        int i;
        String strM221703d;
        SharedPreferences sharedPreferences;
        C14990am c14990amM87676a = C14990am.m87676a();
        boolean z = true;
        if (AbstractC14991an.f63786d.equalsIgnoreCase(intent.getAction()) || AbstractC14991an.f63792j.equalsIgnoreCase(intent.getAction())) {
            String stringExtra = intent.getStringExtra(AbstractC14991an.f63804v);
            if (TextUtils.isEmpty(intent.getStringExtra(AbstractC14991an.f63766B))) {
                ouq0.m169393m("security is empty. ignore.");
                return;
            }
            if (TextUtils.isEmpty(stringExtra)) {
                ouq0.m169378B("channel id is empty, do nothing!");
                return;
            }
            boolean zM87484a = m87484a(stringExtra, intent);
            C14990am.b bVarM87467a = m87467a(stringExtra, intent);
            if (!mtq0.m160046v(this)) {
                this.f63614a.m87836a(this, bVarM87467a, false, 2, null);
                return;
            }
            if (!m87532c()) {
                m87523a(true);
                return;
            }
            C14990am.c cVar = bVarM87467a.f63735a;
            if (cVar == C14990am.c.unbind) {
                m87493c(new C14958b(bVarM87467a));
                return;
            }
            if (zM87484a) {
                m87493c(new C14972p(bVarM87467a));
                return;
            } else if (cVar == C14990am.c.binding) {
                ouq0.m169393m(String.format("the client is binding. %1$s %2$s.", bVarM87467a.f63747g, C14990am.b.m87693a(bVarM87467a.f63741b)));
                return;
            } else {
                if (cVar == C14990am.c.binded) {
                    this.f63614a.m87836a(this, bVarM87467a, true, 0, null);
                    return;
                }
                return;
            }
        }
        if (AbstractC14991an.f63791i.equalsIgnoreCase(intent.getAction())) {
            String stringExtra2 = intent.getStringExtra(AbstractC14991an.f63770F);
            String stringExtra3 = intent.getStringExtra(AbstractC14991an.f63804v);
            String stringExtra4 = intent.getStringExtra(AbstractC14991an.f63801s);
            ouq0.m169393m("Service called close channel chid = " + stringExtra3 + " res = " + C14990am.b.m87693a(stringExtra4));
            if (TextUtils.isEmpty(stringExtra3)) {
                Iterator<String> it = c14990amM87676a.m87682a(stringExtra2).iterator();
                while (it.hasNext()) {
                    m87479a(it.next(), 2);
                }
                return;
            } else if (TextUtils.isEmpty(stringExtra4)) {
                m87479a(stringExtra3, 2);
                return;
            } else {
                m87520a(stringExtra3, stringExtra4, 2, null, null);
                return;
            }
        }
        if (AbstractC14991an.f63787e.equalsIgnoreCase(intent.getAction())) {
            m87487b(intent);
            return;
        }
        if (AbstractC14991an.f63789g.equalsIgnoreCase(intent.getAction())) {
            m87492c(intent);
            return;
        }
        if (AbstractC14991an.f63788f.equalsIgnoreCase(intent.getAction())) {
            g2r0 g2r0VarM87470a = m87470a(new C14933j(intent.getBundleExtra("ext_packet")), intent.getStringExtra(AbstractC14991an.f63770F), intent.getStringExtra(AbstractC14991an.f63774J));
            if (g2r0VarM87470a != null) {
                m87493c(new C15000aw(this, w0r0.m204314f(g2r0VarM87470a, c14990amM87676a.m87679a(g2r0VarM87470a.m128649m(), g2r0VarM87470a.m128653q()).f63748h)));
                return;
            }
            return;
        }
        if (AbstractC14991an.f63790h.equalsIgnoreCase(intent.getAction())) {
            g2r0 g2r0VarM87470a2 = m87470a(new C14886fq(intent.getBundleExtra("ext_packet")), intent.getStringExtra(AbstractC14991an.f63770F), intent.getStringExtra(AbstractC14991an.f63774J));
            if (g2r0VarM87470a2 != null) {
                m87493c(new C15000aw(this, w0r0.m204314f(g2r0VarM87470a2, c14990amM87676a.m87679a(g2r0VarM87470a2.m128649m(), g2r0VarM87470a2.m128653q()).f63748h)));
                return;
            }
            return;
        }
        if (AbstractC14991an.f63793k.equals(intent.getAction())) {
            String stringExtra5 = intent.getStringExtra(AbstractC14991an.f63804v);
            String stringExtra6 = intent.getStringExtra(AbstractC14991an.f63801s);
            if (stringExtra5 != null) {
                ouq0.m169393m("request reset connection from chid = ".concat(stringExtra5));
                C14990am.b bVarM87679a = C14990am.m87676a().m87679a(stringExtra5, stringExtra6);
                if (bVarM87679a != null && bVarM87679a.f63748h.equals(intent.getStringExtra(AbstractC14991an.f63766B)) && bVarM87679a.f63735a == C14990am.c.binded) {
                    u1r0 u1r0VarM87512a = m87512a();
                    if (u1r0VarM87512a == null || !u1r0VarM87512a.m194104r(SystemClock.elapsedRealtime() - 15000)) {
                        m87493c(new C14973q());
                        return;
                    }
                    return;
                }
                return;
            }
            return;
        }
        String string = null;
        string = null;
        bVarM87679a = null;
        C14990am.b bVarM87679a2 = null;
        int i2 = 0;
        if (AbstractC14991an.f63794l.equals(intent.getAction())) {
            String stringExtra7 = intent.getStringExtra(AbstractC14991an.f63770F);
            List<String> listM87682a = c14990amM87676a.m87682a(stringExtra7);
            if (listM87682a.isEmpty()) {
                ouq0.m169393m("open channel should be called first before update info, pkg=" + stringExtra7);
                return;
            }
            String stringExtra8 = intent.getStringExtra(AbstractC14991an.f63804v);
            String stringExtra9 = intent.getStringExtra(AbstractC14991an.f63801s);
            if (TextUtils.isEmpty(stringExtra8)) {
                stringExtra8 = listM87682a.get(0);
            }
            if (TextUtils.isEmpty(stringExtra9)) {
                Collection<C14990am.b> collectionM87681a = c14990amM87676a.m87681a(stringExtra8);
                if (collectionM87681a != null && !collectionM87681a.isEmpty()) {
                    bVarM87679a2 = collectionM87681a.iterator().next();
                }
            } else {
                bVarM87679a2 = c14990amM87676a.m87679a(stringExtra8, stringExtra9);
            }
            if (bVarM87679a2 != null) {
                if (intent.hasExtra(AbstractC14991an.f63768D)) {
                    bVarM87679a2.f63745e = intent.getStringExtra(AbstractC14991an.f63768D);
                }
                if (intent.hasExtra(AbstractC14991an.f63769E)) {
                    bVarM87679a2.f63746f = intent.getStringExtra(AbstractC14991an.f63769E);
                    return;
                }
                return;
            }
            return;
        }
        if ("android.intent.action.SCREEN_ON".equals(intent.getAction()) || "android.intent.action.SCREEN_OFF".equals(intent.getAction())) {
            if (!"android.intent.action.SCREEN_ON".equals(intent.getAction())) {
                if ("android.intent.action.SCREEN_OFF".equals(intent.getAction()) && m87507i() && a0r0.m95413e()) {
                    ouq0.m169393m("enter falldown mode, stop alarm.");
                    a0r0.m95409a();
                    return;
                }
                return;
            }
            if (m87507i()) {
                return;
            }
            ouq0.m169393m("exit falldown mode, activate alarm.");
            m87498e();
            if (m87532c() || m87533d()) {
                return;
            }
            m87523a(true);
            return;
        }
        if ("com.xiaomi.mipush.REGISTER_APP".equals(intent.getAction())) {
            if (C14993ap.m87713a(getApplicationContext()).m87716a() && C14993ap.m87713a(getApplicationContext()).m87714a() == 0) {
                ouq0.m169393m("register without being provisioned. " + intent.getStringExtra("mipush_app_package"));
                return;
            }
            final byte[] byteArrayExtra = intent.getByteArrayExtra("mipush_payload");
            final String stringExtra10 = intent.getStringExtra("mipush_app_package");
            boolean booleanExtra = intent.getBooleanExtra("mipush_env_chanage", false);
            final int intExtra = intent.getIntExtra("mipush_env_type", 1);
            C15024r.m87946a(this).m87953d(stringExtra10);
            if (!booleanExtra || "com.xiaomi.xmsf".equals(getPackageName())) {
                m87524a(byteArrayExtra, stringExtra10);
                return;
            } else {
                m87493c(new AbstractC14966j(14) { // from class: com.xiaomi.push.service.XMPushService.2
                    @Override // com.xiaomi.push.service.XMPushService.AbstractC14966j
                    /* JADX INFO: renamed from: a */
                    public void mo86634a() {
                        C15023q.m87941a((Context) XMPushService.this);
                        C14990am.m87676a().m87688a("5");
                        m6r0.m157262b(intExtra);
                        XMPushService.this.f63622a.m199060c(v1r0.m199051a());
                        ouq0.m169393m("clear account and start registration. " + stringExtra10);
                        XMPushService.this.m87524a(byteArrayExtra, stringExtra10);
                    }

                    @Override // com.xiaomi.push.service.XMPushService.AbstractC14966j
                    /* JADX INFO: renamed from: a */
                    public String mo86633a() {
                        return "clear account cache.";
                    }
                });
                return;
            }
        }
        if ("com.xiaomi.mipush.SEND_MESSAGE".equals(intent.getAction()) || "com.xiaomi.mipush.UNREGISTER_APP".equals(intent.getAction())) {
            String stringExtra11 = intent.getStringExtra("mipush_app_package");
            byte[] byteArrayExtra2 = intent.getByteArrayExtra("mipush_payload");
            boolean booleanExtra2 = intent.getBooleanExtra("com.xiaomi.mipush.MESSAGE_CACHE", true);
            if (C15017k.m87845a(byteArrayExtra2, stringExtra11)) {
                ouq0.m169393m("duplicate msg from: ".concat(String.valueOf(stringExtra11)));
                return;
            }
            if ("com.xiaomi.mipush.UNREGISTER_APP".equals(intent.getAction())) {
                C15024r.m87946a(this).m87947a(stringExtra11);
                if (l4r0.m152825j(getApplicationContext())) {
                    C15029v.m87995a(stringExtra11);
                }
            }
            m87521a(stringExtra11, byteArrayExtra2, booleanExtra2);
            return;
        }
        if (AbstractC14994aq.f63814a.equals(intent.getAction())) {
            String stringExtra12 = intent.getStringExtra("uninstall_pkg_name");
            if (stringExtra12 == null || TextUtils.isEmpty(stringExtra12.trim())) {
                return;
            }
            try {
                PackageInfo packageInfo = getPackageManager().getPackageInfo(stringExtra12, 0);
                if (packageInfo == null || packageInfo.applicationInfo == null || !u3r0.m194404l(this, packageInfo.packageName)) {
                    z = false;
                } else {
                    ouq0.m169393m("dual space's app uninstalled ".concat(stringExtra12));
                }
            } catch (PackageManager.NameNotFoundException unused) {
            }
            if ("com.xiaomi.channel".equals(stringExtra12) && !C14990am.m87676a().m87681a("1").isEmpty() && z) {
                m87479a("1", 0);
                ouq0.m169393m("close the miliao channel as the app is uninstalled.");
                return;
            }
            SharedPreferences sharedPreferences2 = getSharedPreferences("pref_registered_pkg_names", 0);
            String string2 = sharedPreferences2.getString(stringExtra12, null);
            if (TextUtils.isEmpty(string2) || !z) {
                return;
            }
            SharedPreferences.Editor editorEdit = sharedPreferences2.edit();
            editorEdit.remove(stringExtra12);
            editorEdit.commit();
            if (C15031x.m88065b((Context) this, stringExtra12)) {
                C15031x.m88069c(this, stringExtra12);
            }
            C15031x.m88042a((Context) this, stringExtra12);
            C14980ac.m87558a(getApplicationContext(), stringExtra12);
            if (!m87532c() || string2 == null) {
                return;
            }
            try {
                C15030w.m88013a(this, C15030w.m88005a(stringExtra12, string2));
                ouq0.m169393m("uninstall " + stringExtra12 + " msg sent");
                return;
            } catch (C14885fi e) {
                ouq0.m169378B("Fail to send Message: " + e.getMessage());
                m87515a(10, e);
                return;
            }
        }
        if (AbstractC14994aq.f63815b.equals(intent.getAction())) {
            String stringExtra13 = intent.getStringExtra("data_cleared_pkg_name");
            if (TextUtils.isEmpty(stringExtra13)) {
                return;
            }
            try {
                sharedPreferences = getSharedPreferences("pref_registered_pkg_names", 0);
                if (sharedPreferences != null) {
                    try {
                        string = sharedPreferences.getString(stringExtra13, null);
                    } catch (Throwable th) {
                        th = th;
                        ouq0.m169393m("Fail to get sp or appId : " + th);
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                sharedPreferences = null;
            }
            if (!TextUtils.isEmpty(string)) {
                SharedPreferences.Editor editorEdit2 = sharedPreferences.edit();
                editorEdit2.remove(stringExtra13);
                editorEdit2.commit();
                if (C15031x.m88065b((Context) this, stringExtra13)) {
                    C15031x.m88069c(this, stringExtra13);
                }
                C15031x.m88042a((Context) this, stringExtra13);
                m87521a(stringExtra13, C14936m.m87448e(C15030w.m88017b(stringExtra13, string)), true);
            }
            C14980ac.m87558a((Context) this, stringExtra13);
            if (l4r0.m152825j(getApplicationContext())) {
                C15029v.m87995a(stringExtra13);
                return;
            }
            return;
        }
        if ("com.xiaomi.mipush.CLEAR_NOTIFICATION".equals(intent.getAction())) {
            String stringExtra14 = intent.getStringExtra(AbstractC14991an.f63770F);
            int intExtra2 = intent.getIntExtra(AbstractC14991an.f63771G, -2);
            if (TextUtils.isEmpty(stringExtra14)) {
                return;
            }
            if (intExtra2 >= -1) {
                C15031x.m88044a(this, stringExtra14, intExtra2, intent.getIntExtra(AbstractC14991an.f63772H, -1));
                return;
            } else {
                C15031x.m88045a(this, stringExtra14, intent.getStringExtra(AbstractC14991an.f63776L), intent.getStringExtra(AbstractC14991an.f63777M));
                return;
            }
        }
        if ("com.xiaomi.mipush.CLEAR_HEADSUPNOTIFICATION".equals(intent.getAction())) {
            String stringExtra15 = intent.getStringExtra(AbstractC14991an.f63770F);
            if (TextUtils.isEmpty(stringExtra15)) {
                return;
            }
            C15031x.m88062b((Context) this, stringExtra15);
            return;
        }
        if ("com.xiaomi.mipush.SET_NOTIFICATION_TYPE".equals(intent.getAction())) {
            String stringExtra16 = intent.getStringExtra(AbstractC14991an.f63770F);
            String stringExtra17 = intent.getStringExtra(AbstractC14991an.f63775K);
            if (intent.hasExtra(AbstractC14991an.f63773I)) {
                int intExtra3 = intent.getIntExtra(AbstractC14991an.f63773I, 0);
                strM221703d = zuq0.m221703d(stringExtra16 + intExtra3);
                z = false;
                i2 = intExtra3;
            } else {
                strM221703d = zuq0.m221703d(stringExtra16);
            }
            if (TextUtils.isEmpty(stringExtra16) || !TextUtils.equals(stringExtra17, strM221703d)) {
                ouq0.m169378B("invalid notification for " + stringExtra16);
                return;
            } else if (z) {
                C15031x.m88069c(this, stringExtra16);
                return;
            } else {
                C15031x.m88063b(this, stringExtra16, i2);
                return;
            }
        }
        if ("com.xiaomi.mipush.DISABLE_PUSH".equals(intent.getAction())) {
            String stringExtra18 = intent.getStringExtra("mipush_app_package");
            if (!TextUtils.isEmpty(stringExtra18)) {
                C15024r.m87946a(this).m87949b(stringExtra18);
            }
            if ("com.xiaomi.xmsf".equals(getPackageName())) {
                return;
            }
            m87515a(19, (Exception) null);
            m87498e();
            stopSelf();
            return;
        }
        if ("com.xiaomi.mipush.DISABLE_PUSH_MESSAGE".equals(intent.getAction()) || "com.xiaomi.mipush.ENABLE_PUSH_MESSAGE".equals(intent.getAction())) {
            String stringExtra19 = intent.getStringExtra("mipush_app_package");
            byte[] byteArrayExtra3 = intent.getByteArrayExtra("mipush_payload");
            String stringExtra20 = intent.getStringExtra("mipush_app_id");
            String stringExtra21 = intent.getStringExtra("mipush_app_token");
            if ("com.xiaomi.mipush.DISABLE_PUSH_MESSAGE".equals(intent.getAction())) {
                C15024r.m87946a(this).m87951c(stringExtra19);
            }
            if ("com.xiaomi.mipush.ENABLE_PUSH_MESSAGE".equals(intent.getAction())) {
                C15024r.m87946a(this).m87954e(stringExtra19);
                C15024r.m87946a(this).m87955f(stringExtra19);
            }
            if (byteArrayExtra3 == null) {
                C15027t.m87960a(this, stringExtra19, byteArrayExtra3, 70000003, "null payload");
                return;
            }
            C15027t.m87964b(stringExtra19, byteArrayExtra3);
            m87516a(new C15026s(this, stringExtra19, stringExtra20, stringExtra21, byteArrayExtra3));
            if ("com.xiaomi.mipush.ENABLE_PUSH_MESSAGE".equals(intent.getAction())) {
                if (this.f63608a == null) {
                    this.f63608a = new C14962f();
                    b5r0.m102623c(this, this.f63608a, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"), null, null);
                }
                if (this.f63617a == null) {
                    this.f63617a = mtq0.m160028d(this);
                    return;
                }
                return;
            }
            return;
        }
        if ("com.xiaomi.mipush.SEND_TINYDATA".equals(intent.getAction())) {
            String stringExtra22 = intent.getStringExtra("mipush_app_package");
            byte[] byteArrayExtra4 = intent.getByteArrayExtra("mipush_payload");
            C14892gj c14892gj = new C14892gj();
            try {
                C14936m.m87447d(c14892gj, byteArrayExtra4);
                z2r0.m218456b(this).m218460e(c14892gj, stringExtra22);
                return;
            } catch (C14926hu e2) {
                ouq0.m169397q(e2);
                return;
            }
        }
        if ("com.xiaomi.push.timer".equalsIgnoreCase(intent.getAction())) {
            ouq0.m169393m("[Alarm] Service called on timer");
            if (!m87507i()) {
                a0r0.m95412d(false);
                if (m87501f()) {
                    m87489b(false);
                }
            } else if (a0r0.m95413e()) {
                ouq0.m169393m("enter falldown mode, stop alarm");
                a0r0.m95409a();
            }
            C14957a c14957a = this.f63607a;
            if (c14957a != null) {
                c14957a.m87541a();
                return;
            }
            return;
        }
        if ("com.xiaomi.push.check_alive".equalsIgnoreCase(intent.getAction())) {
            ouq0.m169393m("Service called on check alive.");
            if (m87501f()) {
                m87489b(false);
                return;
            }
            return;
        }
        if ("com.xiaomi.mipush.thirdparty".equals(intent.getAction())) {
            ouq0.m169393m("on thirdpart push :" + intent.getStringExtra("com.xiaomi.mipush.thirdparty_DESC"));
            a0r0.m95411c(this, intent.getIntExtra("com.xiaomi.mipush.thirdparty_LEVEL", 0));
            return;
        }
        if ("android.net.conn.CONNECTIVITY_CHANGE".equals(intent.getAction())) {
            m87496d();
            return;
        }
        if ("miui.net.wifi.DIGEST_INFORMATION_CHANGED".equals(intent.getAction())) {
            m87475a(intent);
            return;
        }
        if ("com.xiaomi.xmsf.USE_INTELLIGENT_HB".equals(intent.getAction())) {
            if (intent.getExtras() == null || (i = intent.getExtras().getInt("effectivePeriod", 0)) <= 0 || i > 604800) {
                return;
            }
            C15019m.m87852a(getApplicationContext()).m87873a(i);
            return;
        }
        if (!"action_cr_config".equals(intent.getAction())) {
            if (AbstractC14991an.f63796n.equals(intent.getAction())) {
                C15018l.m87847a(getApplicationContext(), intent);
                return;
            } else {
                if (AbstractC14991an.f63797o.equals(intent.getAction())) {
                    String stringExtra23 = intent.getStringExtra("ext_downward_pkt_id");
                    if (TextUtils.isEmpty(stringExtra23)) {
                        return;
                    }
                    C14997at.m87730a().m87735b(stringExtra23, intent.getLongExtra("ext_app_receive_time", 0L));
                    return;
                }
                return;
            }
        }
        boolean booleanExtra3 = intent.getBooleanExtra("action_cr_event_switch", false);
        long longExtra = intent.getLongExtra("action_cr_event_frequency", 86400L);
        boolean booleanExtra4 = intent.getBooleanExtra("action_cr_perf_switch", false);
        long longExtra2 = intent.getLongExtra("action_cr_perf_frequency", 86400L);
        boolean booleanExtra5 = intent.getBooleanExtra("action_cr_event_en", true);
        long longExtra3 = intent.getLongExtra("action_cr_max_file_size", PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED);
        uv5 uv5VarM198255h = uv5.m198241b().m198259l(booleanExtra3).m198258k(longExtra).m198262o(booleanExtra4).m198261n(longExtra2).m198256i(lvq0.m156001b(getApplicationContext())).m198257j(booleanExtra5).m198260m(longExtra3).m198255h(getApplicationContext());
        if ("com.xiaomi.xmsf".equals(getPackageName()) || longExtra <= 0 || longExtra2 <= 0 || longExtra3 <= 0) {
            return;
        }
        szq0.m188677n(getApplicationContext(), uv5VarM198255h);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public void m87498e() {
        if (!m87526a()) {
            a0r0.m95409a();
        } else {
            if (a0r0.m95413e()) {
                return;
            }
            a0r0.m95412d(true);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public void m87500f() {
        u1r0 u1r0Var = this.f63621a;
        if (u1r0Var != null && u1r0Var.m194091B()) {
            ouq0.m169378B("try to connect while connecting.");
            return;
        }
        u1r0 u1r0Var2 = this.f63621a;
        if (u1r0Var2 != null && u1r0Var2.m194093D()) {
            ouq0.m169378B("try to connect while is connected.");
            return;
        }
        this.f63622a.m199058b(mtq0.m160029e(this));
        m87502g();
        if (this.f63621a == null) {
            C14990am.m87676a().m87684a(this);
            m87495c(false);
        }
    }

    /* JADX INFO: renamed from: g */
    private void m87502g() {
        try {
            this.f63620a.m194103n(this.f63623a, new d2r0() { // from class: com.xiaomi.push.service.XMPushService.5
                @Override // p153l.d2r0
                /* JADX INFO: renamed from: a */
                public boolean mo87539a(g2r0 g2r0Var) {
                    return true;
                }
            });
            this.f63620a.m102234R();
            this.f63621a = this.f63620a;
        } catch (C14885fi e) {
            ouq0.m169395o("fail to create Slim connection", e);
            this.f63620a.mo102238v(3, e);
        }
    }

    /* JADX INFO: renamed from: h */
    private boolean m87505h() {
        boolean zEquals;
        String packageName = getPackageName();
        if ("com.xiaomi.xmsf".equals(packageName)) {
            ouq0.m169393m("current sdk expect region is cn");
            zEquals = EnumC14937n.China.name().equals(C15004b.m87775a(getApplicationContext()).m87778a());
        } else {
            zEquals = !C15024r.m87946a(this).m87950b(packageName);
        }
        boolean z = zEquals;
        if (!z) {
            ouq0.m169396p("XMPushService", "-->isPushEnabled(): isEnabled=", Boolean.valueOf(z), ", package=", packageName, ", region=", C15004b.m87775a(getApplicationContext()).m87778a());
        }
        return z;
    }

    /* JADX INFO: renamed from: i */
    private boolean m87507i() {
        return getApplicationContext().getPackageName().equals("com.xiaomi.xmsf") && m87508j() && !u3r0.m194409q(this) && !u3r0.m194403k(getApplicationContext());
    }

    /* JADX INFO: renamed from: j */
    private boolean m87508j() {
        int iIntValue = Integer.valueOf(String.format("%tH", new Date())).intValue();
        int i = this.f63603a;
        int i2 = this.f63625b;
        if (i > i2) {
            return iIntValue >= i || iIntValue < i2;
        }
        return i < i2 && iIntValue >= i && iIntValue < i2;
    }

    /* JADX INFO: renamed from: k */
    private boolean m87509k() {
        if (TextUtils.equals(getPackageName(), "com.xiaomi.xmsf")) {
            return false;
        }
        return C14985ah.m87648a(this).m87660a(EnumC14893gk.ForegroundServiceSwitch.m86817a(), false);
    }

    /* JADX INFO: renamed from: a */
    public void m87524a(byte[] bArr, String str) {
        if (bArr == null) {
            C15027t.m87960a(this, str, bArr, 70000003, "null payload");
            ouq0.m169393m("register request without payload");
            return;
        }
        C14911hb c14911hb = new C14911hb();
        try {
            C14936m.m87447d(c14911hb, bArr);
            if (c14911hb.f63193a == EnumC14888gf.Registration) {
                C14915hf c14915hf = new C14915hf();
                try {
                    C14936m.m87447d(c14915hf, c14911hb.m87089a());
                    m87516a(new C15026s(this, c14911hb.m87092b(), c14915hf.m87163b(), c14915hf.m87168c(), bArr));
                    tzq0.m193695a(getApplicationContext()).m193701f(c14911hb.m87092b(), "E100003", c14915hf.m87156a(), 6002, null);
                } catch (C14926hu e) {
                    ouq0.m169378B("app register error. " + e);
                    C15027t.m87960a(this, str, bArr, 70000003, " data action error.");
                }
            } else {
                C15027t.m87960a(this, str, bArr, 70000003, " registration action required.");
                ouq0.m169393m("register request with invalid payload");
            }
        } catch (C14926hu e2) {
            ouq0.m169378B("app register fail. " + e2);
            C15027t.m87960a(this, str, bArr, 70000003, " data container error.");
        }
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        return this.f63606a.getBinder();
    }

    @Override // android.app.Service
    public void onCreate() {
        String[] strArrSplit;
        super.onCreate();
        ouq0.m169391k(getApplicationContext());
        t5r0.m189421e(this);
        C15022p c15022pM87936a = C15023q.m87936a((Context) this);
        if (c15022pM87936a != null) {
            m6r0.m157262b(c15022pM87936a.f63937a);
        }
        if (l4r0.m152825j(getApplicationContext())) {
            HandlerThread handlerThread = new HandlerThread("hb-alarm");
            handlerThread.start();
            Handler handler = new Handler(handlerThread.getLooper());
            this.f63607a = new C14957a();
            b5r0.m102624d(this, this.f63607a, new IntentFilter(AbstractC14991an.f63799q), "com.xiaomi.xmsf.permission.MIPUSH_RECEIVE", handler, 4);
            f63602b = true;
            handler.post(new Runnable() { // from class: com.xiaomi.push.service.XMPushService.7
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        PackageManager packageManager = XMPushService.this.getApplicationContext().getPackageManager();
                        ComponentName componentName = new ComponentName(XMPushService.this.getApplicationContext(), "com.xiaomi.push.service.receivers.PingReceiver");
                        if (packageManager.getComponentEnabledSetting(componentName) != 2) {
                            packageManager.setComponentEnabledSetting(componentName, 2, 1);
                        }
                    } catch (Throwable th) {
                        ouq0.m169393m("[Alarm] disable ping receiver may be failure. " + th);
                    }
                }
            });
        }
        this.f63606a = new Messenger(new Handler() { // from class: com.xiaomi.push.service.XMPushService.8
            @Override // android.os.Handler
            public void handleMessage(Message message) {
                super.handleMessage(message);
                if (message != null) {
                    try {
                        int i = message.what;
                        if (i == 17) {
                            Object obj = message.obj;
                            if (obj != null) {
                                XMPushService.this.onStart((Intent) obj, 1);
                                return;
                            }
                            return;
                        }
                        if (i != 18) {
                            return;
                        }
                        Message messageObtain = Message.obtain((Handler) null, 0);
                        messageObtain.what = 18;
                        Bundle bundle = new Bundle();
                        bundle.putString("xmsf_region", C15004b.m87775a(XMPushService.this.getApplicationContext()).m87778a());
                        messageObtain.setData(bundle);
                        message.replyTo.send(messageObtain);
                    } catch (Throwable unused) {
                    }
                }
            }
        });
        C14992ao.m87708a(this);
        v1r0 v1r0Var = new v1r0(null, 5222, "xiaomi.com", null) { // from class: com.xiaomi.push.service.XMPushService.9
            @Override // p153l.v1r0
            /* JADX INFO: renamed from: a */
            public byte[] mo87540a() {
                try {
                    gzq0 gzq0Var = new gzq0();
                    gzq0Var.m133109j(C15001ax.m87742a().m87753a());
                    return gzq0Var.m118923h();
                } catch (Exception e) {
                    ouq0.m169393m("getOBBString err: " + e.toString());
                    return null;
                }
            }
        };
        this.f63622a = v1r0Var;
        v1r0Var.m199055a(true);
        this.f63620a = new d1r0(this, this.f63622a);
        this.f63614a = m87511a();
        a0r0.m95410b(this);
        this.f63620a.m194101l(this);
        this.f63612a = new C14988ak(this);
        this.f63613a = new C14996as(this);
        new C15015i().m87840a();
        C14909h.m87046f().m87052j(this);
        this.f63615a = new C15020n("Connection Controller Thread");
        C14990am c14990amM87676a = C14990am.m87676a();
        c14990amM87676a.m87690b();
        c14990amM87676a.m87686a(new C14990am.a() { // from class: com.xiaomi.push.service.XMPushService.10
            @Override // com.xiaomi.push.service.C14990am.a
            /* JADX INFO: renamed from: a */
            public void mo87536a() {
                XMPushService.this.m87498e();
                if (C14990am.m87676a().m87678a() <= 0) {
                    XMPushService xMPushService = XMPushService.this;
                    xMPushService.m87516a(xMPushService.new C14963g(12, null));
                }
            }
        });
        if (m87509k()) {
            m87504h();
        }
        z2r0.m218456b(this).m218459d(new C15021o(this), "UPLOADER_PUSH_CHANNEL");
        m87518a(new w2r0(this));
        m87518a(new C15008bd(this));
        if (l4r0.m152825j(this)) {
            m87518a(new C14989al());
            if (u3r0.m194402j()) {
                m87518a(new InterfaceC14970n() { // from class: com.xiaomi.push.service.XMPushService.11
                    @Override // com.xiaomi.push.service.XMPushService.InterfaceC14970n
                    /* JADX INFO: renamed from: a */
                    public void mo87537a() {
                        hvq0.m137386a(XMPushService.this.getApplicationContext());
                    }
                });
            }
        }
        m87516a(new C14964h());
        this.f63619a.add(C15002ay.m87762a(this));
        if (m87505h()) {
            this.f63608a = new C14962f();
            b5r0.m102623c(this, this.f63608a, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"), null, null);
            this.f63617a = mtq0.m160028d(this);
        }
        if (l4r0.m152825j(getApplicationContext())) {
            this.f63611a = new C14976t();
            b5r0.m102624d(this, this.f63611a, new IntentFilter("miui.net.wifi.DIGEST_INFORMATION_CHANGED"), "miui.net.wifi.permission.ACCESS_WIFI_DIGEST_INFO", null, 2);
            C14967k c14967k = new C14967k();
            this.f63609a = c14967k;
            b5r0.m102624d(this, c14967k, new IntentFilter("com.xiaomi.xmsf.USE_INTELLIGENT_HB"), "com.xiaomi.xmsf.permission.INTELLIGENT_HB", null, 2);
        }
        if ("com.xiaomi.xmsf".equals(getPackageName())) {
            Uri uriFor = Settings.System.getUriFor("power_supersave_mode_open");
            if (uriFor != null) {
                this.f63605a = new ContentObserver(new Handler(Looper.getMainLooper())) { // from class: com.xiaomi.push.service.XMPushService.12
                    @Override // android.database.ContentObserver
                    public void onChange(boolean z) {
                        super.onChange(z);
                        boolean zM87503g = XMPushService.this.m87503g();
                        ouq0.m169393m("SuperPowerMode:" + zM87503g);
                        XMPushService.this.m87498e();
                        XMPushService xMPushService = XMPushService.this;
                        if (zM87503g) {
                            xMPushService.m87516a(xMPushService.new C14963g(24, null));
                        } else {
                            xMPushService.m87523a(true);
                        }
                    }
                };
                try {
                    getContentResolver().registerContentObserver(uriFor, false, this.f63605a);
                } catch (Throwable th) {
                    ouq0.m169378B("register super-power-mode observer err:" + th.getMessage());
                }
            }
            int[] iArrM87485a = m87485a();
            if (iArrM87485a != null) {
                this.f63610a = new C14974r();
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction("android.intent.action.SCREEN_ON");
                intentFilter.addAction("android.intent.action.SCREEN_OFF");
                b5r0.m102623c(this, this.f63610a, intentFilter, null, null);
                this.f63603a = iArrM87485a[0];
                this.f63625b = iArrM87485a[1];
                ouq0.m169393m("falldown initialized: " + this.f63603a + Constants.SEPARATOR_COMMA + this.f63625b);
            }
        }
        exq0.m123092f(this, this.f63620a);
        kxq0.m151849b(this, this.f63620a);
        String str = "";
        if (c15022pM87936a != null) {
            try {
                if (!TextUtils.isEmpty(c15022pM87936a.f63938a) && (strArrSplit = c15022pM87936a.f63938a.split("@")) != null && strArrSplit.length > 0) {
                    str = strArrSplit[0];
                }
            } catch (Exception unused) {
            }
        }
        oxq0.m169724a(this);
        ouq0.m169380D("XMPushService created. pid=" + Process.myPid() + ", uid=" + Process.myUid() + ", vc=" + C14887g.m86753b(getApplicationContext(), getPackageName()) + ", uuid=" + str);
    }

    @Override // android.app.Service
    public void onDestroy() {
        C14962f c14962f = this.f63608a;
        if (c14962f != null) {
            m87474a(c14962f);
            this.f63608a = null;
        }
        Object obj = this.f63617a;
        if (obj != null) {
            mtq0.m160043s(this, obj);
            this.f63617a = null;
        }
        C14976t c14976t = this.f63611a;
        if (c14976t != null) {
            m87474a(c14976t);
            this.f63611a = null;
        }
        C14967k c14967k = this.f63609a;
        if (c14967k != null) {
            m87474a(c14967k);
            this.f63609a = null;
        }
        C14974r c14974r = this.f63610a;
        if (c14974r != null) {
            m87474a(c14974r);
            this.f63610a = null;
        }
        C14957a c14957a = this.f63607a;
        if (c14957a != null) {
            m87474a(c14957a);
            this.f63607a = null;
        }
        if ("com.xiaomi.xmsf".equals(getPackageName()) && this.f63605a != null) {
            try {
                getContentResolver().unregisterContentObserver(this.f63605a);
            } catch (Throwable th) {
                ouq0.m169378B("unregister super-power-mode err:" + th.getMessage());
            }
        }
        this.f63619a.clear();
        this.f63615a.m87902b();
        m87516a(new AbstractC14966j(2) { // from class: com.xiaomi.push.service.XMPushService.4
            @Override // com.xiaomi.push.service.XMPushService.AbstractC14966j
            /* JADX INFO: renamed from: a */
            public void mo86634a() {
                if (XMPushService.this.f63621a != null) {
                    XMPushService.this.f63621a.mo102238v(15, null);
                    XMPushService.this.f63621a = null;
                }
            }

            @Override // com.xiaomi.push.service.XMPushService.AbstractC14966j
            /* JADX INFO: renamed from: a */
            public String mo86633a() {
                return "disconnect for service destroy.";
            }
        });
        m87516a(new C14968l());
        C14990am.m87676a().m87690b();
        C14990am.m87676a().m87685a(this, 15);
        C14990am.m87676a().m87683a();
        this.f63620a.m194108x(this);
        C15001ax.m87742a().m87755a();
        a0r0.m95409a();
        m87506i();
        exq0.m123095i(this, this.f63620a);
        kxq0.m151853f(this, this.f63620a);
        super.onDestroy();
        ouq0.m169393m("Service destroyed");
    }

    @Override // android.app.Service
    public void onStart(Intent intent, int i) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (intent == null) {
            ouq0.m169378B("onStart() with intent NULL");
        } else {
            try {
                String stringExtra = intent.getStringExtra(AbstractC14991an.f63804v);
                String stringExtra2 = intent.getStringExtra(AbstractC14991an.f63770F);
                String stringExtra3 = intent.getStringExtra("mipush_app_package");
                if ("android.net.conn.CONNECTIVITY_CHANGE".equals(intent.getAction()) || "miui.net.wifi.DIGEST_INFORMATION_CHANGED".equals(intent.getAction())) {
                    ouq0.m169394n("XMPushService", String.format("onStart() with intent.Action = %s, chid = %s, pkg = %s|%s, intent = %s", intent.getAction(), stringExtra, stringExtra2, stringExtra3, l4r0.m152820e(intent)));
                } else {
                    ouq0.m169394n("XMPushService", String.format("onStart() with intent.Action = %s, chid = %s, pkg = %s|%s", intent.getAction(), stringExtra, stringExtra2, stringExtra3));
                }
            } catch (Throwable th) {
                ouq0.m169378B("onStart() cause error: " + th.getMessage());
                return;
            }
        }
        if (intent != null && intent.getAction() != null) {
            if ("com.xiaomi.push.timer".equalsIgnoreCase(intent.getAction()) || "com.xiaomi.push.check_alive".equalsIgnoreCase(intent.getAction())) {
                if (this.f63615a.m87900a()) {
                    ouq0.m169378B("ERROR, the job controller is blocked.");
                    C14990am.m87676a().m87685a(this, 14);
                    stopSelf();
                } else {
                    m87516a(new C14965i(intent));
                }
            } else if (!"com.xiaomi.push.network_status_changed".equalsIgnoreCase(intent.getAction())) {
                m87516a(new C14965i(intent));
            }
        }
        long jCurrentTimeMillis2 = System.currentTimeMillis() - jCurrentTimeMillis;
        if (jCurrentTimeMillis2 > 50) {
            ouq0.m169406z("[Prefs] spend " + jCurrentTimeMillis2 + " ms, too more times.");
        }
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i, int i2) {
        onStart(intent, i2);
        return l4r0.m152825j(this) ? 1 : 2;
    }

    /* JADX INFO: renamed from: com.xiaomi.push.service.XMPushService$h */
    public class C14964h extends AbstractC14966j {
        public C14964h() {
            super(p7f.COLOR_SPACE_UNCALIBRATED);
        }

        @Override // com.xiaomi.push.service.XMPushService.AbstractC14966j
        /* JADX INFO: renamed from: a */
        public void mo86634a() {
            XMPushService.this.m87491c();
        }

        @Override // com.xiaomi.push.service.XMPushService.AbstractC14966j
        /* JADX INFO: renamed from: a */
        public String mo86633a() {
            return "Init Job";
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.push.service.XMPushService$g */
    public class C14963g extends AbstractC14966j {

        /* JADX INFO: renamed from: a */
        public Exception f63657a;

        /* JADX INFO: renamed from: b */
        public int f63658b;

        public C14963g(int i, Exception exc) {
            super(2);
            this.f63658b = i;
            this.f63657a = exc;
        }

        @Override // com.xiaomi.push.service.XMPushService.AbstractC14966j
        /* JADX INFO: renamed from: a */
        public void mo86634a() {
            XMPushService.this.m87515a(this.f63658b, this.f63657a);
        }

        @Override // com.xiaomi.push.service.XMPushService.AbstractC14966j
        /* JADX INFO: renamed from: a */
        public String mo86633a() {
            return "disconnect the connection.";
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.push.service.XMPushService$l */
    public class C14968l extends AbstractC14966j {
        public C14968l() {
            super(5);
        }

        @Override // com.xiaomi.push.service.XMPushService.AbstractC14966j
        /* JADX INFO: renamed from: a */
        public void mo86634a() {
            XMPushService.this.f63615a.m87895a();
        }

        @Override // com.xiaomi.push.service.XMPushService.AbstractC14966j
        /* JADX INFO: renamed from: a */
        public String mo86633a() {
            return "ask the job queue to quit";
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.push.service.XMPushService$m */
    public class C14969m extends AbstractC14966j {

        /* JADX INFO: renamed from: a */
        private g2r0 f63665a;

        public C14969m(g2r0 g2r0Var) {
            super(8);
            this.f63665a = g2r0Var;
        }

        @Override // com.xiaomi.push.service.XMPushService.AbstractC14966j
        /* JADX INFO: renamed from: a */
        public void mo86634a() {
            XMPushService.this.f63612a.m87672a(this.f63665a);
        }

        @Override // com.xiaomi.push.service.XMPushService.AbstractC14966j
        /* JADX INFO: renamed from: a */
        public String mo86633a() {
            return "receive a message.";
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.push.service.XMPushService$c */
    public static class C14959c extends AbstractC14966j {

        /* JADX INFO: renamed from: a */
        private final C14990am.b f63651a;

        public C14959c(C14990am.b bVar) {
            super(12);
            this.f63651a = bVar;
        }

        @Override // com.xiaomi.push.service.XMPushService.AbstractC14966j
        /* JADX INFO: renamed from: a */
        public String mo86633a() {
            return "bind time out. chid=" + this.f63651a.f63747g;
        }

        public boolean equals(Object obj) {
            if (obj instanceof C14959c) {
                return TextUtils.equals(((C14959c) obj).f63651a.f63747g, this.f63651a.f63747g);
            }
            return false;
        }

        public int hashCode() {
            return this.f63651a.f63747g.hashCode();
        }

        @Override // com.xiaomi.push.service.XMPushService.AbstractC14966j
        /* JADX INFO: renamed from: a */
        public void mo86634a() {
            this.f63651a.m87704a(C14990am.c.unbind, 1, 21, (String) null, (String) null);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.push.service.XMPushService$i */
    public class C14965i extends AbstractC14966j {

        /* JADX INFO: renamed from: a */
        private Intent f63660a;

        public C14965i(Intent intent) {
            super(15);
            this.f63660a = intent;
        }

        @Override // com.xiaomi.push.service.XMPushService.AbstractC14966j
        /* JADX INFO: renamed from: a */
        public String mo86633a() {
            return "Handle intent action = " + this.f63660a.getAction();
        }

        @Override // com.xiaomi.push.service.XMPushService.AbstractC14966j
        /* JADX INFO: renamed from: a */
        public void mo86634a() {
            XMPushService.this.m87497d(this.f63660a);
        }
    }

    /* JADX INFO: renamed from: e */
    public static boolean m87499e() {
        return f63602b;
    }

    /* JADX INFO: renamed from: com.xiaomi.push.service.XMPushService$d */
    public class C14960d extends AbstractC14966j {

        /* JADX INFO: renamed from: a */
        private w0r0 f63653a;

        public C14960d(w0r0 w0r0Var) {
            super(8);
            this.f63653a = w0r0Var;
        }

        @Override // com.xiaomi.push.service.XMPushService.AbstractC14966j
        /* JADX INFO: renamed from: a */
        public void mo86634a() {
            XMPushService.this.f63612a.m87673a(this.f63653a);
            if (AbstractC15011e.m87808a(this.f63653a)) {
                XMPushService.this.m87517a(new C14997at.a(), 15000L);
            }
        }

        @Override // com.xiaomi.push.service.XMPushService.AbstractC14966j
        /* JADX INFO: renamed from: a */
        public String mo86633a() {
            return "receive a message.";
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.push.service.XMPushService$e */
    public class C14961e extends AbstractC14966j {
        public C14961e() {
            super(1);
        }

        @Override // com.xiaomi.push.service.XMPushService.AbstractC14966j
        /* JADX INFO: renamed from: a */
        public void mo86634a() {
            if (XMPushService.this.m87526a()) {
                XMPushService xMPushService = XMPushService.this;
                if (xMPushService.m87480a(xMPushService.getApplicationContext())) {
                    XMPushService.this.m87500f();
                    return;
                }
            }
            ouq0.m169393m("should not connect. quit the job.");
        }

        @Override // com.xiaomi.push.service.XMPushService.AbstractC14966j
        /* JADX INFO: renamed from: a */
        public String mo86633a() {
            return "do reconnect..";
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.push.service.XMPushService$q */
    public class C14973q extends AbstractC14966j {
        public C14973q() {
            super(3);
        }

        @Override // com.xiaomi.push.service.XMPushService.AbstractC14966j
        /* JADX INFO: renamed from: a */
        public void mo86634a() {
            XMPushService.this.m87515a(11, (Exception) null);
            if (XMPushService.this.m87526a()) {
                XMPushService xMPushService = XMPushService.this;
                if (xMPushService.m87480a(xMPushService.getApplicationContext())) {
                    XMPushService.this.m87500f();
                }
            }
        }

        @Override // com.xiaomi.push.service.XMPushService.AbstractC14966j
        /* JADX INFO: renamed from: a */
        public String mo86633a() {
            return "reset the connection.";
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public boolean m87503g() {
        return "com.xiaomi.xmsf".equals(getPackageName()) && Settings.System.getInt(getContentResolver(), "power_supersave_mode_open", 0) == 1;
    }

    /* JADX INFO: renamed from: com.xiaomi.push.service.XMPushService$o */
    public class C14971o extends AbstractC14966j {

        /* JADX INFO: renamed from: a */
        boolean f63667a;

        public C14971o(boolean z) {
            super(4);
            this.f63667a = z;
        }

        @Override // com.xiaomi.push.service.XMPushService.AbstractC14966j
        /* JADX INFO: renamed from: a */
        public void mo86634a() {
            if (XMPushService.this.m87532c()) {
                try {
                    if (!this.f63667a) {
                        C14928i.m87414a();
                    }
                    XMPushService.this.f63621a.mo102223A(this.f63667a);
                } catch (C14885fi e) {
                    ouq0.m169397q(e);
                    XMPushService.this.m87515a(10, e);
                }
            }
        }

        @Override // com.xiaomi.push.service.XMPushService.AbstractC14966j
        /* JADX INFO: renamed from: a */
        public String mo86633a() {
            return "send ping..";
        }
    }

    /* JADX INFO: renamed from: i */
    private void m87506i() {
        synchronized (this.f63618a) {
            this.f63618a.clear();
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.push.service.XMPushService$a */
    public class C14957a extends BroadcastReceiver {

        /* JADX INFO: renamed from: a */
        private final Object f63648a;

        private C14957a() {
            this.f63648a = new Object();
        }

        /* JADX INFO: renamed from: a */
        private void m87542a(long j) {
            if (Looper.myLooper() == Looper.getMainLooper()) {
                ouq0.m169378B("[Alarm] Cannot perform lock.wait in the UI thread!");
                return;
            }
            synchronized (this.f63648a) {
                try {
                    this.f63648a.wait(j);
                } catch (InterruptedException e) {
                    ouq0.m169393m("[Alarm] interrupt from waiting state. " + e);
                }
            }
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            ouq0.m169406z("[Alarm] heartbeat alarm has been triggered.");
            if (!AbstractC14991an.f63799q.equals(intent.getAction())) {
                ouq0.m169393m("[Alarm] cancel the old ping timer");
                a0r0.m95409a();
                return;
            }
            if (TextUtils.equals(context.getPackageName(), intent.getPackage())) {
                ouq0.m169406z("[Alarm] Ping XMChannelService on timer");
                try {
                    Intent intent2 = new Intent(context, (Class<?>) XMPushService.class);
                    intent2.putExtra("time_stamp", System.currentTimeMillis());
                    intent2.setAction("com.xiaomi.push.timer");
                    ServiceClient.getInstance(context).startServiceSafely(intent2);
                    m87542a(3000L);
                    ouq0.m169393m("[Alarm] heartbeat alarm finish in " + (System.currentTimeMillis() - jCurrentTimeMillis));
                } catch (Throwable unused) {
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: a */
        public void m87541a() {
            if (Looper.myLooper() == Looper.getMainLooper()) {
                ouq0.m169378B("[Alarm] Cannot perform lock.notifyAll in the UI thread!");
                return;
            }
            synchronized (this.f63648a) {
                try {
                    this.f63648a.notifyAll();
                } catch (Exception e) {
                    ouq0.m169393m("[Alarm] notify lock. " + e);
                }
            }
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.push.service.XMPushService$p */
    public class C14972p extends AbstractC14966j {

        /* JADX INFO: renamed from: a */
        C14990am.b f63669a;

        public C14972p(C14990am.b bVar) {
            super(4);
            this.f63669a = bVar;
        }

        @Override // com.xiaomi.push.service.XMPushService.AbstractC14966j
        /* JADX INFO: renamed from: a */
        public void mo86634a() {
            try {
                this.f63669a.m87704a(C14990am.c.unbind, 1, 16, (String) null, (String) null);
                u1r0 u1r0Var = XMPushService.this.f63621a;
                C14990am.b bVar = this.f63669a;
                u1r0Var.mo113627k(bVar.f63747g, bVar.f63741b);
                XMPushService xMPushService = XMPushService.this;
                xMPushService.m87517a(xMPushService.new C14958b(this.f63669a), 300L);
            } catch (C14885fi e) {
                ouq0.m169397q(e);
                XMPushService.this.m87515a(10, e);
            }
        }

        @Override // com.xiaomi.push.service.XMPushService.AbstractC14966j
        /* JADX INFO: renamed from: a */
        public String mo86633a() {
            return "rebind the client. " + this.f63669a.f63747g;
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.push.service.XMPushService$s */
    public class C14975s extends AbstractC14966j {

        /* JADX INFO: renamed from: a */
        C14990am.b f63673a;

        /* JADX INFO: renamed from: a */
        String f63674a;

        /* JADX INFO: renamed from: b */
        int f63675b;

        /* JADX INFO: renamed from: b */
        String f63676b;

        public C14975s(C14990am.b bVar, int i, String str, String str2) {
            super(9);
            this.f63673a = bVar;
            this.f63675b = i;
            this.f63674a = str;
            this.f63676b = str2;
        }

        @Override // com.xiaomi.push.service.XMPushService.AbstractC14966j
        /* JADX INFO: renamed from: a */
        public void mo86634a() {
            if (this.f63673a.f63735a != C14990am.c.unbind && XMPushService.this.f63621a != null) {
                try {
                    u1r0 u1r0Var = XMPushService.this.f63621a;
                    C14990am.b bVar = this.f63673a;
                    u1r0Var.mo113627k(bVar.f63747g, bVar.f63741b);
                } catch (C14885fi e) {
                    ouq0.m169397q(e);
                    XMPushService.this.m87515a(10, e);
                }
            }
            this.f63673a.m87704a(C14990am.c.unbind, this.f63675b, 0, this.f63676b, this.f63674a);
        }

        @Override // com.xiaomi.push.service.XMPushService.AbstractC14966j
        /* JADX INFO: renamed from: a */
        public String mo86633a() {
            return "unbind the channel. " + this.f63673a.f63747g;
        }
    }

    /* JADX INFO: renamed from: f */
    private boolean m87501f() {
        if (SystemClock.elapsedRealtime() - this.f63604a < HuiYanOsConfig.LONG_CHECK_OVERSEAS_DEFAULT_TIME_OUT) {
            return false;
        }
        return mtq0.m160047w(this);
    }

    /* JADX INFO: renamed from: h */
    private void m87504h() {
    }

    /* JADX INFO: renamed from: com.xiaomi.push.service.XMPushService$b */
    public class C14958b extends AbstractC14966j {

        /* JADX INFO: renamed from: a */
        C14990am.b f63650a;

        public C14958b(C14990am.b bVar) {
            super(9);
            this.f63650a = bVar;
        }

        @Override // com.xiaomi.push.service.XMPushService.AbstractC14966j
        /* JADX INFO: renamed from: a */
        public void mo86634a() {
            try {
                if (!XMPushService.this.m87532c()) {
                    ouq0.m169378B("trying bind while the connection is not created, quit!");
                    return;
                }
                C14990am c14990amM87676a = C14990am.m87676a();
                C14990am.b bVar = this.f63650a;
                C14990am.b bVarM87679a = c14990amM87676a.m87679a(bVar.f63747g, bVar.f63741b);
                if (bVarM87679a == null) {
                    ouq0.m169393m("ignore bind because the channel " + this.f63650a.f63747g + " is removed ");
                    return;
                }
                if (bVarM87679a.f63735a == C14990am.c.unbind) {
                    bVarM87679a.m87704a(C14990am.c.binding, 0, 0, (String) null, (String) null);
                    XMPushService.this.f63621a.mo113626i(bVarM87679a);
                    C14928i.m87419f(XMPushService.this, bVarM87679a);
                } else {
                    ouq0.m169393m("trying duplicate bind, ingore! " + bVarM87679a.f63735a);
                }
            } catch (Exception e) {
                ouq0.m169378B("Meet error when trying to bind. " + e);
                XMPushService.this.m87515a(10, e);
            } catch (Throwable unused) {
            }
        }

        @Override // com.xiaomi.push.service.XMPushService.AbstractC14966j
        /* JADX INFO: renamed from: a */
        public String mo86633a() {
            return "bind the client. " + this.f63650a.f63747g;
        }
    }

    /* JADX INFO: renamed from: a */
    public int m87510a() {
        if (this.f63626c < 0) {
            this.f63626c = C14887g.m86753b(this, "com.xiaomi.xmsf");
        }
        return this.f63626c;
    }

    /* JADX INFO: renamed from: a */
    private int[] m87485a() {
        String[] strArrSplit;
        String strM87655a = C14985ah.m87648a(getApplicationContext()).m87655a(EnumC14893gk.FallDownTimeRange.m86817a(), "");
        if (!TextUtils.isEmpty(strM87655a) && (strArrSplit = strM87655a.split(Constants.SEPARATOR_COMMA)) != null && strArrSplit.length >= 2) {
            int[] iArr = new int[2];
            try {
                iArr[0] = Integer.valueOf(strArrSplit[0]).intValue();
                int iIntValue = Integer.valueOf(strArrSplit[1]).intValue();
                iArr[1] = iIntValue;
                int i = iArr[0];
                if (i >= 0 && i <= 23 && iIntValue >= 0 && iIntValue <= 23 && i != iIntValue) {
                    return iArr;
                }
            } catch (NumberFormatException e) {
                ouq0.m169378B("parse falldown time range failure: " + e);
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: a */
    private String m87469a() {
        String strM152822g = l4r0.m152822g("ro.miui.region");
        return TextUtils.isEmpty(strM152822g) ? l4r0.m152822g("ro.product.locale.region") : strM152822g;
    }

    /* JADX INFO: renamed from: a */
    private static void m87478a(String str) {
        if (EnumC14937n.China.name().equals(str)) {
            xwq0.m213397a("cn.app.chat.xiaomi.net", "cn.app.chat.xiaomi.net");
            xwq0.m213397a("cn.app.chat.xiaomi.net", "111.13.141.211:443");
            xwq0.m213397a("cn.app.chat.xiaomi.net", "39.156.81.172:443");
            xwq0.m213397a("cn.app.chat.xiaomi.net", "111.202.1.250:443");
            xwq0.m213397a("cn.app.chat.xiaomi.net", "123.125.102.213:443");
            xwq0.m213397a("resolver.msg.xiaomi.net", "111.13.142.153:443");
            xwq0.m213397a("resolver.msg.xiaomi.net", "111.202.1.252:443");
        }
    }

    /* JADX INFO: renamed from: a */
    private void m87475a(Intent intent) {
        Bundle extras;
        if (intent == null || (extras = intent.getExtras()) == null) {
            return;
        }
        String string = extras.getString("digest");
        C15019m.m87852a(getApplicationContext()).m87874a(string);
        exq0.m123090d(this, string);
    }

    /* JADX INFO: renamed from: a */
    public void m87513a() {
        if (SystemClock.elapsedRealtime() - this.f63604a >= a2r0.m95726a() && mtq0.m160047w(this)) {
            m87489b(true);
        }
    }

    /* JADX INFO: renamed from: b */
    private String m87486b() {
        String strM87469a;
        xsq0.m212996a();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        Object obj = new Object();
        int i = 0;
        if ("com.xiaomi.xmsf".equals(getPackageName())) {
            C14993ap c14993apM87713a = C14993ap.m87713a(this);
            String strM87469a2 = null;
            while (true) {
                if (!TextUtils.isEmpty(strM87469a2) && c14993apM87713a.m87714a() != 0) {
                    strM87469a = m87469a();
                    break;
                }
                if (TextUtils.isEmpty(strM87469a2)) {
                    strM87469a2 = m87469a();
                }
                try {
                    synchronized (obj) {
                        if (i < 30) {
                            try {
                                obj.wait(1000L);
                            } catch (Throwable th) {
                                throw th;
                            }
                        } else {
                            obj.wait(HuiYanOsConfig.LONG_CHECK_OVERSEAS_DEFAULT_TIME_OUT);
                        }
                    }
                } catch (InterruptedException unused) {
                }
                i++;
            }
        } else {
            strM87469a = "CN";
        }
        ouq0.m169393m("wait coutrycode :" + strM87469a + " cost = " + (SystemClock.elapsedRealtime() - jElapsedRealtime) + " , count = " + i);
        return strM87469a;
    }

    /* JADX INFO: renamed from: a */
    public void m87521a(final String str, final byte[] bArr, boolean z) {
        Collection<C14990am.b> collectionM87681a = C14990am.m87676a().m87681a("5");
        if (collectionM87681a.isEmpty()) {
            if (z) {
                C15027t.m87964b(str, bArr);
            }
        } else if (collectionM87681a.iterator().next().f63735a == C14990am.c.binded) {
            m87516a(new AbstractC14966j(4) { // from class: com.xiaomi.push.service.XMPushService.3
                @Override // com.xiaomi.push.service.XMPushService.AbstractC14966j
                /* JADX INFO: renamed from: a */
                public void mo86634a() {
                    try {
                        C15030w.m88016a(XMPushService.this, str, bArr);
                    } catch (C14885fi e) {
                        ouq0.m169397q(e);
                        XMPushService.this.m87515a(10, e);
                    }
                }

                @Override // com.xiaomi.push.service.XMPushService.AbstractC14966j
                /* JADX INFO: renamed from: a */
                public String mo86633a() {
                    return "send mi push message";
                }
            });
        } else if (z) {
            C15027t.m87964b(str, bArr);
        }
    }

    /* JADX INFO: renamed from: a */
    private g2r0 m87470a(g2r0 g2r0Var, String str, String str2) {
        C14990am c14990amM87676a = C14990am.m87676a();
        List<String> listM87682a = c14990amM87676a.m87682a(str);
        if (listM87682a.isEmpty()) {
            ouq0.m169393m("open channel should be called first before sending a packet, pkg=" + str);
            return null;
        }
        g2r0Var.m128658v(str);
        String strM128649m = g2r0Var.m128649m();
        if (TextUtils.isEmpty(strM128649m)) {
            strM128649m = listM87682a.get(0);
            g2r0Var.m128652p(strM128649m);
        }
        C14990am.b bVarM87679a = c14990amM87676a.m87679a(strM128649m, g2r0Var.m128653q());
        if (!m87532c()) {
            ouq0.m169393m("drop a packet as the channel is not connected, chid=" + strM128649m);
            return null;
        }
        if (bVarM87679a != null && bVarM87679a.f63735a == C14990am.c.binded) {
            if (TextUtils.equals(str2, bVarM87679a.f63749i)) {
                return g2r0Var;
            }
            ouq0.m169393m("invalid session. " + str2);
            return null;
        }
        ouq0.m169393m("drop a packet as the channel is not opened, chid=" + strM128649m);
        return null;
    }

    /* JADX INFO: renamed from: b */
    private void m87489b(boolean z) {
        this.f63604a = SystemClock.elapsedRealtime();
        if (!m87532c()) {
            m87523a(true);
        } else if (mtq0.m160044t(this)) {
            m87493c(new C14971o(z));
        } else {
            m87493c(new C14963g(17, null));
            m87523a(true);
        }
    }

    /* JADX INFO: renamed from: a */
    private boolean m87484a(String str, Intent intent) {
        C14990am.b bVarM87679a = C14990am.m87676a().m87679a(str, intent.getStringExtra(AbstractC14991an.f63801s));
        boolean z = false;
        if (bVarM87679a != null && str != null) {
            String stringExtra = intent.getStringExtra(AbstractC14991an.f63774J);
            String stringExtra2 = intent.getStringExtra(AbstractC14991an.f63766B);
            if (!TextUtils.isEmpty(bVarM87679a.f63749i) && !TextUtils.equals(stringExtra, bVarM87679a.f63749i)) {
                ouq0.m169393m("session changed. old session=" + bVarM87679a.f63749i + ", new session=" + stringExtra + " chid = " + str);
                z = true;
            }
            if (!stringExtra2.equals(bVarM87679a.f63748h)) {
                ouq0.m169393m("security changed. chid = " + str + " sechash = " + zuq0.m221701b(stringExtra2));
                return true;
            }
        }
        return z;
    }

    /* JADX INFO: renamed from: b */
    public boolean m87531b() {
        try {
            Class<?> clsM189419c = t5r0.m189419c(this, "miui.os.Build");
            return clsM189419c.getField("IS_CM_CUSTOMIZATION_TEST").getBoolean(null) || clsM189419c.getField("IS_CU_CUSTOMIZATION_TEST").getBoolean(null) || clsM189419c.getField("IS_CT_CUSTOMIZATION_TEST").getBoolean(null);
        } catch (Throwable unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: b */
    public C15014h m87528b() {
        return this.f63614a;
    }

    /* JADX INFO: renamed from: b */
    public void m87530b(AbstractC14966j abstractC14966j) {
        this.f63615a.m87897a(abstractC14966j.f63915a, abstractC14966j);
    }

    @Override // p153l.x1r0
    /* JADX INFO: renamed from: b */
    public void mo86744b(u1r0 u1r0Var) {
        C14909h.m87045e().mo86744b(u1r0Var);
        m87495c(true);
        this.f63613a.m87728a();
        if (!a0r0.m95413e() && !m87507i()) {
            ouq0.m169393m("reconnection successful, reactivate alarm.");
            a0r0.m95412d(true);
        }
        Iterator<C14990am.b> it = C14990am.m87676a().m87680a().iterator();
        while (it.hasNext()) {
            m87516a(new C14958b(it.next()));
        }
        if (this.f63624a || !l4r0.m152825j(getApplicationContext())) {
            return;
        }
        tsq0.m192627f(getApplicationContext()).m192628g(new Runnable() { // from class: com.xiaomi.push.service.XMPushService.6
            @Override // java.lang.Runnable
            public void run() {
                XMPushService.this.f63624a = true;
                try {
                    ouq0.m169393m("try to trigger the wifi digest broadcast.");
                    Object systemService = XMPushService.this.getApplicationContext().getSystemService("MiuiWifiService");
                    if (systemService != null) {
                        otq0.m169176n(systemService, "sendCurrentWifiDigestInfo", new Object[0]);
                    }
                } catch (Throwable unused) {
                }
            }
        });
    }

    /* JADX INFO: renamed from: a */
    private C14990am.b m87467a(String str, Intent intent) {
        C14990am.b bVarM87679a = C14990am.m87676a().m87679a(str, intent.getStringExtra(AbstractC14991an.f63801s));
        if (bVarM87679a == null) {
            bVarM87679a = new C14990am.b(this);
        }
        bVarM87679a.f63747g = intent.getStringExtra(AbstractC14991an.f63804v);
        bVarM87679a.f63741b = intent.getStringExtra(AbstractC14991an.f63801s);
        bVarM87679a.f63743c = intent.getStringExtra(AbstractC14991an.f63808z);
        bVarM87679a.f63737a = intent.getStringExtra(AbstractC14991an.f63770F);
        bVarM87679a.f63745e = intent.getStringExtra(AbstractC14991an.f63768D);
        bVarM87679a.f63746f = intent.getStringExtra(AbstractC14991an.f63769E);
        bVarM87679a.f63739a = intent.getBooleanExtra(AbstractC14991an.f63767C, false);
        bVarM87679a.f63748h = intent.getStringExtra(AbstractC14991an.f63766B);
        bVarM87679a.f63749i = intent.getStringExtra(AbstractC14991an.f63774J);
        bVarM87679a.f63744d = intent.getStringExtra(AbstractC14991an.f63765A);
        bVarM87679a.f63736a = this.f63614a;
        bVarM87679a.m87702a((Messenger) intent.getParcelableExtra(AbstractC14991an.f63778N));
        bVarM87679a.f63729a = getApplicationContext();
        C14990am.m87676a().m87687a(bVarM87679a);
        return bVarM87679a;
    }

    /* JADX INFO: renamed from: c */
    private void m87492c(Intent intent) {
        String stringExtra = intent.getStringExtra(AbstractC14991an.f63770F);
        String stringExtra2 = intent.getStringExtra(AbstractC14991an.f63774J);
        Parcelable[] parcelableArrayExtra = intent.getParcelableArrayExtra("ext_packets");
        int length = parcelableArrayExtra.length;
        f2r0[] f2r0VarArr = new f2r0[length];
        intent.getBooleanExtra("ext_encrypt", true);
        for (int i = 0; i < parcelableArrayExtra.length; i++) {
            f2r0 f2r0Var = new f2r0((Bundle) parcelableArrayExtra[i]);
            f2r0VarArr[i] = f2r0Var;
            f2r0 f2r0Var2 = (f2r0) m87470a(f2r0Var, stringExtra, stringExtra2);
            f2r0VarArr[i] = f2r0Var2;
            if (f2r0Var2 == null) {
                return;
            }
        }
        C14990am c14990amM87676a = C14990am.m87676a();
        w0r0[] w0r0VarArr = new w0r0[length];
        for (int i2 = 0; i2 < length; i2++) {
            f2r0 f2r0Var3 = f2r0VarArr[i2];
            w0r0VarArr[i2] = w0r0.m204314f(f2r0Var3, c14990amM87676a.m87679a(f2r0Var3.m128649m(), f2r0Var3.m128653q()).f63748h);
        }
        m87493c(new C15009c(this, w0r0VarArr));
    }

    /* JADX INFO: renamed from: b */
    public void m87529b() {
        C15019m.m87852a(getApplicationContext()).m87879d();
        Iterator it = new ArrayList(this.f63618a).iterator();
        while (it.hasNext()) {
            ((InterfaceC14970n) it.next()).mo87537a();
        }
    }

    /* JADX INFO: renamed from: a */
    public void m87520a(String str, String str2, int i, String str3, String str4) {
        C14990am.b bVarM87679a = C14990am.m87676a().m87679a(str, str2);
        if (bVarM87679a != null) {
            m87516a(new C14975s(bVarM87679a, i, str4, str3));
        }
        C14990am.m87676a().m87689a(str, str2);
    }

    /* JADX INFO: renamed from: a */
    private void m87479a(String str, int i) {
        XMPushService xMPushService;
        int i2;
        Collection<C14990am.b> collectionM87681a = C14990am.m87676a().m87681a(str);
        if (collectionM87681a != null) {
            for (C14990am.b bVar : collectionM87681a) {
                if (bVar != null) {
                    xMPushService = this;
                    i2 = i;
                    xMPushService.m87516a(xMPushService.new C14975s(bVar, i2, null, null));
                } else {
                    xMPushService = this;
                    i2 = i;
                }
                this = xMPushService;
                i = i2;
            }
        }
        C14990am.m87676a().m87688a(str);
    }

    /* JADX INFO: renamed from: c */
    private void m87493c(AbstractC14966j abstractC14966j) {
        this.f63615a.m87898a(abstractC14966j);
    }

    /* JADX INFO: renamed from: c */
    private void m87495c(boolean z) {
        try {
            if (t5r0.m189422f()) {
                if (z) {
                    if (l4r0.m152825j(this)) {
                        Intent intent = new Intent("miui.intent.action.NETWORK_CONNECTED");
                        intent.addFlags(1073741824);
                        sendBroadcast(intent);
                    }
                    for (InterfaceC14978aa interfaceC14978aa : (InterfaceC14978aa[]) this.f63619a.toArray(new InterfaceC14978aa[0])) {
                        interfaceC14978aa.mo87547a();
                    }
                    return;
                }
                if (l4r0.m152825j(this)) {
                    Intent intent2 = new Intent("miui.intent.action.NETWORK_BLOCKED");
                    intent2.addFlags(1073741824);
                    sendBroadcast(intent2);
                }
            }
        } catch (Exception e) {
            ouq0.m169397q(e);
        }
    }

    /* JADX INFO: renamed from: a */
    public void m87516a(AbstractC14966j abstractC14966j) {
        m87517a(abstractC14966j, 0L);
    }

    /* JADX INFO: renamed from: a */
    public void m87517a(AbstractC14966j abstractC14966j, long j) {
        try {
            this.f63615a.m87899a(abstractC14966j, j);
        } catch (IllegalStateException e) {
            ouq0.m169393m("can't execute job err = " + e.getMessage());
        }
    }

    /* JADX INFO: renamed from: a */
    private void m87474a(BroadcastReceiver broadcastReceiver) {
        if (broadcastReceiver != null) {
            try {
                unregisterReceiver(broadcastReceiver);
            } catch (IllegalArgumentException e) {
                ouq0.m169397q(e);
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public void m87522a(w0r0 w0r0Var) throws C14885fi {
        u1r0 u1r0Var = this.f63621a;
        if (u1r0Var != null) {
            u1r0Var.mo113631w(w0r0Var);
            return;
        }
        throw new C14885fi("try send msg while connection is null.");
    }

    /* JADX INFO: renamed from: a */
    public void m87525a(w0r0[] w0r0VarArr) throws C14885fi {
        u1r0 u1r0Var = this.f63621a;
        if (u1r0Var != null) {
            u1r0Var.mo113629p(w0r0VarArr);
            return;
        }
        throw new C14885fi("try send msg while connection is null.");
    }

    /* JADX INFO: renamed from: a */
    public void m87523a(boolean z) {
        this.f63613a.m87729a(z);
    }

    /* JADX INFO: renamed from: a */
    public void m87519a(C14990am.b bVar) {
        if (bVar != null) {
            long jM87699a = bVar.m87699a();
            ouq0.m169393m("schedule rebind job in " + (jM87699a / 1000));
            m87517a(new C14958b(bVar), jM87699a);
        }
    }

    /* JADX INFO: renamed from: c */
    public boolean m87532c() {
        u1r0 u1r0Var = this.f63621a;
        return u1r0Var != null && u1r0Var.m194093D();
    }

    /* JADX INFO: renamed from: a */
    public void m87515a(int i, Exception exc) {
        StringBuilder sb = new StringBuilder("disconnect ");
        sb.append(hashCode());
        sb.append(", ");
        u1r0 u1r0Var = this.f63621a;
        sb.append(u1r0Var == null ? null : Integer.valueOf(u1r0Var.hashCode()));
        ouq0.m169393m(sb.toString());
        u1r0 u1r0Var2 = this.f63621a;
        if (u1r0Var2 != null) {
            u1r0Var2.mo102238v(i, exc);
            this.f63621a = null;
        }
        m87514a(7);
        m87514a(4);
        C14990am.m87676a().m87685a(this, i);
    }

    /* JADX INFO: renamed from: d */
    private void m87496d() {
        ntq0 ntq0VarM160040p = mtq0.m160040p();
        C15019m.m87852a(getApplicationContext()).m87875a(ntq0VarM160040p);
        if (ntq0VarM160040p == null) {
            ouq0.m169394n("XMPushService", "network changed, no active network");
        } else {
            ouq0.m169394n("XMPushService", "network changed,".concat("[type: " + ntq0VarM160040p.m164753e() + "[" + ntq0VarM160040p.m164756h() + "], state: " + ntq0VarM160040p.m164752c() + "/" + ntq0VarM160040p.m164751b()));
            NetworkInfo.State stateM164752c = ntq0VarM160040p.m164752c();
            if (stateM164752c == NetworkInfo.State.SUSPENDED || stateM164752c == NetworkInfo.State.UNKNOWN) {
                return;
            }
        }
        if (C14909h.m87045e() != null) {
            C14909h.m87045e().m86743b();
        }
        p2r0.m170390h(this);
        this.f63620a.m194094E();
        if (mtq0.m160044t(this)) {
            if (m87532c() && m87501f()) {
                m87489b(false);
            }
            if (!m87532c() && !m87533d()) {
                this.f63615a.m87896a(1);
                m87516a(new C14961e());
            }
            eyq0.m123217c(this).m123224d();
        } else {
            m87516a(new C14963g(2, null));
        }
        m87498e();
    }

    /* JADX INFO: renamed from: a */
    public boolean m87526a() {
        boolean zM160044t = mtq0.m160044t(this);
        boolean z = false;
        boolean z2 = C14990am.m87676a().m87678a() > 0;
        boolean zM87531b = m87531b();
        boolean z3 = !zM87531b;
        boolean zM87505h = m87505h();
        boolean zM87503g = m87503g();
        boolean z4 = !zM87503g;
        if (zM160044t && z2 && !zM87531b && zM87505h && !zM87503g) {
            z = true;
        }
        if (!z) {
            ouq0.m169380D(String.format("not conn, net=%s;cnt=%s;!dis=%s;enb=%s;!spm=%s;", Boolean.valueOf(zM160044t), Boolean.valueOf(z2), Boolean.valueOf(z3), Boolean.valueOf(zM87505h), Boolean.valueOf(z4)));
        }
        return z;
    }

    /* JADX INFO: renamed from: a */
    public C15014h m87511a() {
        return new C15014h();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public boolean m87480a(Context context) {
        try {
            xsq0.m212996a();
            for (int i = 100; i > 0; i--) {
                if (mtq0.m160046v(context)) {
                    ouq0.m169393m("network connectivity ok.");
                    return true;
                }
                try {
                    Thread.sleep(100L);
                } catch (Exception unused) {
                }
            }
            return false;
        } catch (Exception unused2) {
            return true;
        }
    }

    /* JADX INFO: renamed from: a */
    public u1r0 m87512a() {
        return this.f63621a;
    }

    /* JADX INFO: renamed from: a */
    public void m87514a(int i) {
        this.f63615a.m87896a(i);
    }

    /* JADX INFO: renamed from: a */
    public boolean m87527a(int i) {
        return this.f63615a.m87901a(i);
    }

    @Override // p153l.x1r0
    /* JADX INFO: renamed from: a */
    public void mo86740a(u1r0 u1r0Var) {
        ouq0.m169406z("begin to connect...");
        C14909h.m87045e().mo86740a(u1r0Var);
    }

    @Override // p153l.x1r0
    /* JADX INFO: renamed from: a */
    public void mo86741a(u1r0 u1r0Var, int i, Exception exc) {
        C14909h.m87045e().mo86741a(u1r0Var, i, exc);
        if (m87507i()) {
            return;
        }
        m87523a(false);
    }

    @Override // p153l.x1r0
    /* JADX INFO: renamed from: a */
    public void mo86742a(u1r0 u1r0Var, Exception exc) {
        C14909h.m87045e().mo86742a(u1r0Var, exc);
        m87495c(false);
        if (m87507i()) {
            return;
        }
        m87523a(false);
    }

    /* JADX INFO: renamed from: a */
    public void m87518a(InterfaceC14970n interfaceC14970n) {
        synchronized (this.f63618a) {
            this.f63618a.add(interfaceC14970n);
        }
    }

    /* JADX INFO: renamed from: d */
    public boolean m87533d() {
        u1r0 u1r0Var = this.f63621a;
        return u1r0Var != null && u1r0Var.m194091B();
    }
}
