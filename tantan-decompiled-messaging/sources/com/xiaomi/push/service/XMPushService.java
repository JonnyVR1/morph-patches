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
import com.xiaomi.push.C14737fi;
import com.xiaomi.push.C14738fq;
import com.xiaomi.push.C14739g;
import com.xiaomi.push.C14744gj;
import com.xiaomi.push.C14761h;
import com.xiaomi.push.C14763hb;
import com.xiaomi.push.C14767hf;
import com.xiaomi.push.C14778hu;
import com.xiaomi.push.C14780i;
import com.xiaomi.push.C14785j;
import com.xiaomi.push.C14788m;
import com.xiaomi.push.EnumC14740gf;
import com.xiaomi.push.EnumC14745gk;
import com.xiaomi.push.EnumC14789n;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import p149l.aqq0;
import p149l.atq0;
import p149l.bmq0;
import p149l.eoq0;
import p149l.fmq0;
import p149l.fvq0;
import p149l.gkq0;
import p149l.gxq0;
import p149l.hkq0;
import p149l.ikq0;
import p149l.ilq0;
import p149l.ioq0;
import p149l.j6f;
import p149l.jtq0;
import p149l.mqq0;
import p149l.njq0;
import p149l.nqq0;
import p149l.nwq0;
import p149l.osq0;
import p149l.ouq0;
import p149l.psq0;
import p149l.qrq0;
import p149l.qtq0;
import p149l.qu5;
import p149l.riq0;
import p149l.rjq0;
import p149l.rnq0;
import p149l.rsq0;
import p149l.tlq0;
import p149l.tsq0;
import p149l.ttq0;
import p149l.uqq0;
import p149l.usq0;
import p149l.vvq0;
import p149l.xrq0;
import p149l.xsq0;
import p149l.ynq0;
import p149l.yoq0;
import p149l.zsq0;

/* JADX INFO: loaded from: classes2.dex */
public class XMPushService extends Service implements rsq0 {

    /* JADX INFO: renamed from: b */
    private static boolean f62755b = false;

    /* JADX INFO: renamed from: a */
    private ContentObserver f62758a;

    /* JADX INFO: renamed from: a */
    private C14809a f62760a;

    /* JADX INFO: renamed from: a */
    private C14814f f62761a;

    /* JADX INFO: renamed from: a */
    private C14819k f62762a;

    /* JADX INFO: renamed from: a */
    private C14826r f62763a;

    /* JADX INFO: renamed from: a */
    private C14828t f62764a;

    /* JADX INFO: renamed from: a */
    private C14848as f62766a;

    /* JADX INFO: renamed from: a */
    private C14866h f62767a;

    /* JADX INFO: renamed from: a */
    private Object f62770a;

    /* JADX INFO: renamed from: a */
    private osq0 f62773a;

    /* JADX INFO: renamed from: a */
    private psq0 f62774a;

    /* JADX INFO: renamed from: a */
    private xrq0 f62776a;

    /* JADX INFO: renamed from: a */
    private boolean f62777a = false;

    /* JADX INFO: renamed from: a */
    private int f62756a = 0;

    /* JADX INFO: renamed from: b */
    private int f62778b = 0;

    /* JADX INFO: renamed from: a */
    private long f62757a = 0;

    /* JADX INFO: renamed from: a */
    protected Class f62769a = XMJobService.class;

    /* JADX INFO: renamed from: c */
    private int f62779c = -1;

    /* JADX INFO: renamed from: a */
    private C14840ak f62765a = null;

    /* JADX INFO: renamed from: a */
    private C14872n f62768a = null;

    /* JADX INFO: renamed from: a */
    Messenger f62759a = null;

    /* JADX INFO: renamed from: a */
    private Collection<InterfaceC14830aa> f62772a = Collections.synchronizedCollection(new ArrayList());

    /* JADX INFO: renamed from: a */
    private ArrayList<InterfaceC14822n> f62771a = new ArrayList<>();

    /* JADX INFO: renamed from: a */
    private tsq0 f62775a = new tsq0() { // from class: com.xiaomi.push.service.XMPushService.1
        @Override // p149l.tsq0
        /* JADX INFO: renamed from: a */
        public void mo86364a(qrq0 qrq0Var) {
            if (AbstractC14863e.m86637a(qrq0Var)) {
                C14849at.m86559a().m86563a(qrq0Var.m176080D(), SystemClock.elapsedRealtime(), XMPushService.this.m86339a());
            }
            XMPushService xMPushService = XMPushService.this;
            xMPushService.m86345a(xMPushService.new C14812d(qrq0Var));
        }

        @Override // p149l.tsq0
        /* JADX INFO: renamed from: a */
        public void mo86363a(atq0 atq0Var) {
            XMPushService xMPushService = XMPushService.this;
            xMPushService.m86345a(xMPushService.new C14821m(atq0Var));
        }
    };

    /* JADX INFO: renamed from: com.xiaomi.push.service.XMPushService$f */
    public class C14814f extends BroadcastReceiver {
        public C14814f() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            gkq0.m126689r();
            XMPushService.this.onStart(intent, 1);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.push.service.XMPushService$j */
    public static abstract class AbstractC14818j extends C14872n.b {
        public AbstractC14818j(int i) {
            super(i);
        }

        /* JADX INFO: renamed from: a */
        public abstract String mo85462a();

        /* JADX INFO: renamed from: a */
        public abstract void mo85463a();

        @Override // java.lang.Runnable
        public void run() {
            int i = this.f63068a;
            if (i != 4 && i != 8) {
                ilq0.m137041n(riq0.f159577a, mo85462a());
            }
            mo85463a();
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.push.service.XMPushService$k */
    public class C14819k extends BroadcastReceiver {
        public C14819k() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            ilq0.m137040m("[HB] hold short heartbeat, " + fvq0.m123351e(intent));
            if (intent == null || intent.getExtras() == null) {
                return;
            }
            XMPushService.this.onStart(intent, 1);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.push.service.XMPushService$n */
    public interface InterfaceC14822n {
        /* JADX INFO: renamed from: a */
        void mo86366a();
    }

    /* JADX INFO: renamed from: com.xiaomi.push.service.XMPushService$r */
    public class C14826r extends BroadcastReceiver {
        public C14826r() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            XMPushService.this.onStart(intent, 1);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.push.service.XMPushService$t */
    public class C14828t extends BroadcastReceiver {
        public C14828t() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (!XMPushService.this.f62777a) {
                XMPushService.this.f62777a = true;
            }
            XMPushService.this.onStart(intent, 1);
        }
    }

    /* JADX WARN: Code duplicated, block: B:21:0x00b6  */
    /* JADX INFO: renamed from: b */
    private void m86316b(Intent intent) {
        long j;
        qrq0 qrq0VarM176077f;
        String stringExtra = intent.getStringExtra(AbstractC14843an.f62923F);
        String stringExtra2 = intent.getStringExtra(AbstractC14843an.f62927J);
        Bundle bundleExtra = intent.getBundleExtra("ext_packet");
        C14842am c14842amM86505a = C14842am.m86505a();
        if (bundleExtra != null) {
            zsq0 zsq0Var = (zsq0) m86299a(new zsq0(bundleExtra), stringExtra, stringExtra2);
            if (zsq0Var == null) {
                return;
            } else {
                qrq0VarM176077f = qrq0.m176077f(zsq0Var, c14842amM86505a.m86508a(zsq0Var.m98867m(), zsq0Var.m98871q()).f62901h);
            }
        } else {
            byte[] byteArrayExtra = intent.getByteArrayExtra("ext_raw_packet");
            if (byteArrayExtra != null) {
                try {
                    j = Long.parseLong(intent.getStringExtra(AbstractC14843an.f62954s));
                } catch (NumberFormatException unused) {
                    j = 0;
                }
                String stringExtra3 = intent.getStringExtra(AbstractC14843an.f62955t);
                String stringExtra4 = intent.getStringExtra(AbstractC14843an.f62956u);
                String stringExtra5 = intent.getStringExtra("ext_chid");
                C14842am.b bVarM86508a = c14842amM86505a.m86508a(stringExtra5, String.valueOf(j));
                if (bVarM86508a != null) {
                    qrq0 qrq0Var = new qrq0();
                    try {
                        qrq0Var.m176088h(Integer.parseInt(stringExtra5));
                    } catch (NumberFormatException unused2) {
                    }
                    qrq0Var.m176092l("SECMSG", null);
                    if (TextUtils.isEmpty(stringExtra3)) {
                        stringExtra3 = "xiaomi.com";
                    }
                    qrq0Var.m176090j(j, stringExtra3, stringExtra4);
                    qrq0Var.m176091k(intent.getStringExtra("ext_pkt_id"));
                    qrq0Var.m176094n(byteArrayExtra, bVarM86508a.f62901h);
                    ilq0.m137040m("send a message: chid=" + stringExtra5 + ", packetId=" + intent.getStringExtra("ext_pkt_id"));
                    qrq0VarM176077f = qrq0Var;
                } else {
                    qrq0VarM176077f = null;
                }
            } else {
                qrq0VarM176077f = null;
            }
        }
        if (qrq0VarM176077f != null) {
            m86322c(new C14852aw(this, qrq0VarM176077f));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:22:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:25:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:28:0x00d1 A[Catch: Exception -> 0x00d7, TRY_LEAVE, TryCatch #0 {Exception -> 0x00d7, blocks: (B:26:0x00cb, B:28:0x00d1), top: B:36:0x00cb }] */
    /* JADX WARN: Code duplicated, block: B:34:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:38:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: c */
    public void m86320c() {
        String str;
        rnq0.m180126a().m180149d();
        C14871m.m86681a(getApplicationContext()).m86701a();
        C14856b c14856bM86604a = C14856b.m86604a(getApplicationContext());
        String strM86607a = c14856bM86604a.m86607a();
        ilq0.m137041n("XMPushService", "region of cache is " + strM86607a);
        String strName = "";
        if (TextUtils.isEmpty(strM86607a)) {
            String strM86315b = m86315b();
            str = strM86315b;
            strM86607a = fvq0.m123349c(strM86315b).name();
        } else {
            str = "";
        }
        String str2 = "CN";
        try {
            if (TextUtils.isEmpty(strM86607a) || !EnumC14789n.China.name().equals(strM86607a)) {
                if (TextUtils.isEmpty(strM86607a)) {
                    strM86607a = EnumC14789n.China.name();
                } else {
                    if ("com.xiaomi.xmsf".equals(getPackageName())) {
                        str2 = "";
                    } else {
                        strName = EnumC14789n.China.name();
                    }
                    c14856bM86604a.m86608a(strName, true);
                    c14856bM86604a.m86610b(str2, true);
                    strM86607a = strName;
                }
                ilq0.m137043p("XMPushService", "after check, appRegion is ", strM86607a, ", countryCode=", str);
                if (EnumC14789n.China.name().equals(strM86607a)) {
                    psq0.m171239a("cn.app.chat.xiaomi.net");
                }
                m86307a(strM86607a);
                if (m86334h()) {
                    ilq0.m137041n("XMPushService", "-->postOnCreate(): try trigger connect now");
                    final AbstractC14818j abstractC14818j = new AbstractC14818j(11) { // from class: com.xiaomi.push.service.XMPushService.13
                        @Override // com.xiaomi.push.service.XMPushService.AbstractC14818j
                        /* JADX INFO: renamed from: a */
                        public void mo85463a() {
                            C14882w.m86841a(XMPushService.this);
                            if (gkq0.m126691t(XMPushService.this)) {
                                XMPushService.this.m86352a(true);
                            }
                        }

                        @Override // com.xiaomi.push.service.XMPushService.AbstractC14818j
                        /* JADX INFO: renamed from: a */
                        public String mo85462a() {
                            return "prepare the mi push account.";
                        }
                    };
                    m86345a(abstractC14818j);
                    C14875q.m86773a(new C14875q.a() { // from class: com.xiaomi.push.service.XMPushService.14
                        @Override // com.xiaomi.push.service.C14875q.a
                        /* JADX INFO: renamed from: a */
                        public void mo86367a() {
                            XMPushService.this.m86345a(abstractC14818j);
                        }
                    });
                }
                if (nwq0.m161883f()) {
                    this.f62767a.m86662a(this);
                }
                if ("com.xiaomi.xmsf".equals(getPackageName())) {
                    C14739g.m85590j(this, getApplicationInfo(), true);
                }
            }
            c14856bM86604a.m86608a(strM86607a, true);
            c14856bM86604a.m86610b("CN", true);
            if (nwq0.m161883f()) {
                this.f62767a.m86662a(this);
            }
        } catch (Exception e) {
            ilq0.m137044q(e);
        }
        str = str2;
        ilq0.m137043p("XMPushService", "after check, appRegion is ", strM86607a, ", countryCode=", str);
        if (EnumC14789n.China.name().equals(strM86607a)) {
            psq0.m171239a("cn.app.chat.xiaomi.net");
        }
        m86307a(strM86607a);
        if (m86334h()) {
            ilq0.m137041n("XMPushService", "-->postOnCreate(): try trigger connect now");
            final AbstractC14818j abstractC14818j2 = new AbstractC14818j(11) { // from class: com.xiaomi.push.service.XMPushService.13
                @Override // com.xiaomi.push.service.XMPushService.AbstractC14818j
                /* JADX INFO: renamed from: a */
                public void mo85463a() {
                    C14882w.m86841a(XMPushService.this);
                    if (gkq0.m126691t(XMPushService.this)) {
                        XMPushService.this.m86352a(true);
                    }
                }

                @Override // com.xiaomi.push.service.XMPushService.AbstractC14818j
                /* JADX INFO: renamed from: a */
                public String mo85462a() {
                    return "prepare the mi push account.";
                }
            };
            m86345a(abstractC14818j2);
            C14875q.m86773a(new C14875q.a() { // from class: com.xiaomi.push.service.XMPushService.14
                @Override // com.xiaomi.push.service.C14875q.a
                /* JADX INFO: renamed from: a */
                public void mo86367a() {
                    XMPushService.this.m86345a(abstractC14818j2);
                }
            });
        }
        if ("com.xiaomi.xmsf".equals(getPackageName())) {
            C14739g.m85590j(this, getApplicationInfo(), true);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d */
    public void m86326d(Intent intent) {
        int i;
        String strM189625d;
        SharedPreferences sharedPreferences;
        C14842am c14842amM86505a = C14842am.m86505a();
        boolean z = true;
        if (AbstractC14843an.f62939d.equalsIgnoreCase(intent.getAction()) || AbstractC14843an.f62945j.equalsIgnoreCase(intent.getAction())) {
            String stringExtra = intent.getStringExtra(AbstractC14843an.f62957v);
            if (TextUtils.isEmpty(intent.getStringExtra(AbstractC14843an.f62919B))) {
                ilq0.m137040m("security is empty. ignore.");
                return;
            }
            if (TextUtils.isEmpty(stringExtra)) {
                ilq0.m137025B("channel id is empty, do nothing!");
                return;
            }
            boolean zM86313a = m86313a(stringExtra, intent);
            C14842am.b bVarM86296a = m86296a(stringExtra, intent);
            if (!gkq0.m126693v(this)) {
                this.f62767a.m86665a(this, bVarM86296a, false, 2, null);
                return;
            }
            if (!m86361c()) {
                m86352a(true);
                return;
            }
            C14842am.c cVar = bVarM86296a.f62888a;
            if (cVar == C14842am.c.unbind) {
                m86322c(new C14810b(bVarM86296a));
                return;
            }
            if (zM86313a) {
                m86322c(new C14824p(bVarM86296a));
                return;
            } else if (cVar == C14842am.c.binding) {
                ilq0.m137040m(String.format("the client is binding. %1$s %2$s.", bVarM86296a.f62900g, C14842am.b.m86522a(bVarM86296a.f62894b)));
                return;
            } else {
                if (cVar == C14842am.c.binded) {
                    this.f62767a.m86665a(this, bVarM86296a, true, 0, null);
                    return;
                }
                return;
            }
        }
        if (AbstractC14843an.f62944i.equalsIgnoreCase(intent.getAction())) {
            String stringExtra2 = intent.getStringExtra(AbstractC14843an.f62923F);
            String stringExtra3 = intent.getStringExtra(AbstractC14843an.f62957v);
            String stringExtra4 = intent.getStringExtra(AbstractC14843an.f62954s);
            ilq0.m137040m("Service called close channel chid = " + stringExtra3 + " res = " + C14842am.b.m86522a(stringExtra4));
            if (TextUtils.isEmpty(stringExtra3)) {
                Iterator<String> it = c14842amM86505a.m86511a(stringExtra2).iterator();
                while (it.hasNext()) {
                    m86308a(it.next(), 2);
                }
                return;
            } else if (TextUtils.isEmpty(stringExtra4)) {
                m86308a(stringExtra3, 2);
                return;
            } else {
                m86349a(stringExtra3, stringExtra4, 2, null, null);
                return;
            }
        }
        if (AbstractC14843an.f62940e.equalsIgnoreCase(intent.getAction())) {
            m86316b(intent);
            return;
        }
        if (AbstractC14843an.f62942g.equalsIgnoreCase(intent.getAction())) {
            m86321c(intent);
            return;
        }
        if (AbstractC14843an.f62941f.equalsIgnoreCase(intent.getAction())) {
            atq0 atq0VarM86299a = m86299a(new C14785j(intent.getBundleExtra("ext_packet")), intent.getStringExtra(AbstractC14843an.f62923F), intent.getStringExtra(AbstractC14843an.f62927J));
            if (atq0VarM86299a != null) {
                m86322c(new C14852aw(this, qrq0.m176077f(atq0VarM86299a, c14842amM86505a.m86508a(atq0VarM86299a.m98867m(), atq0VarM86299a.m98871q()).f62901h)));
                return;
            }
            return;
        }
        if (AbstractC14843an.f62943h.equalsIgnoreCase(intent.getAction())) {
            atq0 atq0VarM86299a2 = m86299a(new C14738fq(intent.getBundleExtra("ext_packet")), intent.getStringExtra(AbstractC14843an.f62923F), intent.getStringExtra(AbstractC14843an.f62927J));
            if (atq0VarM86299a2 != null) {
                m86322c(new C14852aw(this, qrq0.m176077f(atq0VarM86299a2, c14842amM86505a.m86508a(atq0VarM86299a2.m98867m(), atq0VarM86299a2.m98871q()).f62901h)));
                return;
            }
            return;
        }
        if (AbstractC14843an.f62946k.equals(intent.getAction())) {
            String stringExtra5 = intent.getStringExtra(AbstractC14843an.f62957v);
            String stringExtra6 = intent.getStringExtra(AbstractC14843an.f62954s);
            if (stringExtra5 != null) {
                ilq0.m137040m("request reset connection from chid = ".concat(stringExtra5));
                C14842am.b bVarM86508a = C14842am.m86505a().m86508a(stringExtra5, stringExtra6);
                if (bVarM86508a != null && bVarM86508a.f62901h.equals(intent.getStringExtra(AbstractC14843an.f62919B)) && bVarM86508a.f62888a == C14842am.c.binded) {
                    osq0 osq0VarM86341a = m86341a();
                    if (osq0VarM86341a == null || !osq0VarM86341a.m165897r(SystemClock.elapsedRealtime() - 15000)) {
                        m86322c(new C14825q());
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
        bVarM86508a = null;
        C14842am.b bVarM86508a2 = null;
        int i2 = 0;
        if (AbstractC14843an.f62947l.equals(intent.getAction())) {
            String stringExtra7 = intent.getStringExtra(AbstractC14843an.f62923F);
            List<String> listM86511a = c14842amM86505a.m86511a(stringExtra7);
            if (listM86511a.isEmpty()) {
                ilq0.m137040m("open channel should be called first before update info, pkg=" + stringExtra7);
                return;
            }
            String stringExtra8 = intent.getStringExtra(AbstractC14843an.f62957v);
            String stringExtra9 = intent.getStringExtra(AbstractC14843an.f62954s);
            if (TextUtils.isEmpty(stringExtra8)) {
                stringExtra8 = listM86511a.get(0);
            }
            if (TextUtils.isEmpty(stringExtra9)) {
                Collection<C14842am.b> collectionM86510a = c14842amM86505a.m86510a(stringExtra8);
                if (collectionM86510a != null && !collectionM86510a.isEmpty()) {
                    bVarM86508a2 = collectionM86510a.iterator().next();
                }
            } else {
                bVarM86508a2 = c14842amM86505a.m86508a(stringExtra8, stringExtra9);
            }
            if (bVarM86508a2 != null) {
                if (intent.hasExtra(AbstractC14843an.f62921D)) {
                    bVarM86508a2.f62898e = intent.getStringExtra(AbstractC14843an.f62921D);
                }
                if (intent.hasExtra(AbstractC14843an.f62922E)) {
                    bVarM86508a2.f62899f = intent.getStringExtra(AbstractC14843an.f62922E);
                    return;
                }
                return;
            }
            return;
        }
        if ("android.intent.action.SCREEN_ON".equals(intent.getAction()) || "android.intent.action.SCREEN_OFF".equals(intent.getAction())) {
            if (!"android.intent.action.SCREEN_ON".equals(intent.getAction())) {
                if ("android.intent.action.SCREEN_OFF".equals(intent.getAction()) && m86336i() && uqq0.m194998e()) {
                    ilq0.m137040m("enter falldown mode, stop alarm.");
                    uqq0.m194994a();
                    return;
                }
                return;
            }
            if (m86336i()) {
                return;
            }
            ilq0.m137040m("exit falldown mode, activate alarm.");
            m86327e();
            if (m86361c() || m86362d()) {
                return;
            }
            m86352a(true);
            return;
        }
        if ("com.xiaomi.mipush.REGISTER_APP".equals(intent.getAction())) {
            if (C14845ap.m86542a(getApplicationContext()).m86545a() && C14845ap.m86542a(getApplicationContext()).m86543a() == 0) {
                ilq0.m137040m("register without being provisioned. " + intent.getStringExtra("mipush_app_package"));
                return;
            }
            final byte[] byteArrayExtra = intent.getByteArrayExtra("mipush_payload");
            final String stringExtra10 = intent.getStringExtra("mipush_app_package");
            boolean booleanExtra = intent.getBooleanExtra("mipush_env_chanage", false);
            final int intExtra = intent.getIntExtra("mipush_env_type", 1);
            C14876r.m86775a(this).m86782d(stringExtra10);
            if (!booleanExtra || "com.xiaomi.xmsf".equals(getPackageName())) {
                m86353a(byteArrayExtra, stringExtra10);
                return;
            } else {
                m86322c(new AbstractC14818j(14) { // from class: com.xiaomi.push.service.XMPushService.2
                    @Override // com.xiaomi.push.service.XMPushService.AbstractC14818j
                    /* JADX INFO: renamed from: a */
                    public void mo85463a() {
                        C14875q.m86770a((Context) XMPushService.this);
                        C14842am.m86505a().m86517a("5");
                        gxq0.m128640b(intExtra);
                        XMPushService.this.f62774a.m171247c(psq0.m171238a());
                        ilq0.m137040m("clear account and start registration. " + stringExtra10);
                        XMPushService.this.m86353a(byteArrayExtra, stringExtra10);
                    }

                    @Override // com.xiaomi.push.service.XMPushService.AbstractC14818j
                    /* JADX INFO: renamed from: a */
                    public String mo85462a() {
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
            if (C14869k.m86674a(byteArrayExtra2, stringExtra11)) {
                ilq0.m137040m("duplicate msg from: ".concat(String.valueOf(stringExtra11)));
                return;
            }
            if ("com.xiaomi.mipush.UNREGISTER_APP".equals(intent.getAction())) {
                C14876r.m86775a(this).m86776a(stringExtra11);
                if (fvq0.m123356j(getApplicationContext())) {
                    C14881v.m86824a(stringExtra11);
                }
            }
            m86350a(stringExtra11, byteArrayExtra2, booleanExtra2);
            return;
        }
        if (AbstractC14846aq.f62967a.equals(intent.getAction())) {
            String stringExtra12 = intent.getStringExtra("uninstall_pkg_name");
            if (stringExtra12 == null || TextUtils.isEmpty(stringExtra12.trim())) {
                return;
            }
            try {
                PackageInfo packageInfo = getPackageManager().getPackageInfo(stringExtra12, 0);
                if (packageInfo == null || packageInfo.applicationInfo == null || !ouq0.m166103l(this, packageInfo.packageName)) {
                    z = false;
                } else {
                    ilq0.m137040m("dual space's app uninstalled ".concat(stringExtra12));
                }
            } catch (PackageManager.NameNotFoundException unused) {
            }
            if ("com.xiaomi.channel".equals(stringExtra12) && !C14842am.m86505a().m86510a("1").isEmpty() && z) {
                m86308a("1", 0);
                ilq0.m137040m("close the miliao channel as the app is uninstalled.");
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
            if (C14883x.m86894b((Context) this, stringExtra12)) {
                C14883x.m86898c(this, stringExtra12);
            }
            C14883x.m86871a((Context) this, stringExtra12);
            C14832ac.m86387a(getApplicationContext(), stringExtra12);
            if (!m86361c() || string2 == null) {
                return;
            }
            try {
                C14882w.m86842a(this, C14882w.m86834a(stringExtra12, string2));
                ilq0.m137040m("uninstall " + stringExtra12 + " msg sent");
                return;
            } catch (C14737fi e) {
                ilq0.m137025B("Fail to send Message: " + e.getMessage());
                m86344a(10, e);
                return;
            }
        }
        if (AbstractC14846aq.f62968b.equals(intent.getAction())) {
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
                        ilq0.m137040m("Fail to get sp or appId : " + th);
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
                if (C14883x.m86894b((Context) this, stringExtra13)) {
                    C14883x.m86898c(this, stringExtra13);
                }
                C14883x.m86871a((Context) this, stringExtra13);
                m86350a(stringExtra13, C14788m.m86277e(C14882w.m86846b(stringExtra13, string)), true);
            }
            C14832ac.m86387a((Context) this, stringExtra13);
            if (fvq0.m123356j(getApplicationContext())) {
                C14881v.m86824a(stringExtra13);
                return;
            }
            return;
        }
        if ("com.xiaomi.mipush.CLEAR_NOTIFICATION".equals(intent.getAction())) {
            String stringExtra14 = intent.getStringExtra(AbstractC14843an.f62923F);
            int intExtra2 = intent.getIntExtra(AbstractC14843an.f62924G, -2);
            if (TextUtils.isEmpty(stringExtra14)) {
                return;
            }
            if (intExtra2 >= -1) {
                C14883x.m86873a(this, stringExtra14, intExtra2, intent.getIntExtra(AbstractC14843an.f62925H, -1));
                return;
            } else {
                C14883x.m86874a(this, stringExtra14, intent.getStringExtra(AbstractC14843an.f62929L), intent.getStringExtra(AbstractC14843an.f62930M));
                return;
            }
        }
        if ("com.xiaomi.mipush.CLEAR_HEADSUPNOTIFICATION".equals(intent.getAction())) {
            String stringExtra15 = intent.getStringExtra(AbstractC14843an.f62923F);
            if (TextUtils.isEmpty(stringExtra15)) {
                return;
            }
            C14883x.m86891b((Context) this, stringExtra15);
            return;
        }
        if ("com.xiaomi.mipush.SET_NOTIFICATION_TYPE".equals(intent.getAction())) {
            String stringExtra16 = intent.getStringExtra(AbstractC14843an.f62923F);
            String stringExtra17 = intent.getStringExtra(AbstractC14843an.f62928K);
            if (intent.hasExtra(AbstractC14843an.f62926I)) {
                int intExtra3 = intent.getIntExtra(AbstractC14843an.f62926I, 0);
                strM189625d = tlq0.m189625d(stringExtra16 + intExtra3);
                z = false;
                i2 = intExtra3;
            } else {
                strM189625d = tlq0.m189625d(stringExtra16);
            }
            if (TextUtils.isEmpty(stringExtra16) || !TextUtils.equals(stringExtra17, strM189625d)) {
                ilq0.m137025B("invalid notification for " + stringExtra16);
                return;
            } else if (z) {
                C14883x.m86898c(this, stringExtra16);
                return;
            } else {
                C14883x.m86892b(this, stringExtra16, i2);
                return;
            }
        }
        if ("com.xiaomi.mipush.DISABLE_PUSH".equals(intent.getAction())) {
            String stringExtra18 = intent.getStringExtra("mipush_app_package");
            if (!TextUtils.isEmpty(stringExtra18)) {
                C14876r.m86775a(this).m86778b(stringExtra18);
            }
            if ("com.xiaomi.xmsf".equals(getPackageName())) {
                return;
            }
            m86344a(19, (Exception) null);
            m86327e();
            stopSelf();
            return;
        }
        if ("com.xiaomi.mipush.DISABLE_PUSH_MESSAGE".equals(intent.getAction()) || "com.xiaomi.mipush.ENABLE_PUSH_MESSAGE".equals(intent.getAction())) {
            String stringExtra19 = intent.getStringExtra("mipush_app_package");
            byte[] byteArrayExtra3 = intent.getByteArrayExtra("mipush_payload");
            String stringExtra20 = intent.getStringExtra("mipush_app_id");
            String stringExtra21 = intent.getStringExtra("mipush_app_token");
            if ("com.xiaomi.mipush.DISABLE_PUSH_MESSAGE".equals(intent.getAction())) {
                C14876r.m86775a(this).m86780c(stringExtra19);
            }
            if ("com.xiaomi.mipush.ENABLE_PUSH_MESSAGE".equals(intent.getAction())) {
                C14876r.m86775a(this).m86783e(stringExtra19);
                C14876r.m86775a(this).m86784f(stringExtra19);
            }
            if (byteArrayExtra3 == null) {
                C14879t.m86789a(this, stringExtra19, byteArrayExtra3, 70000003, "null payload");
                return;
            }
            C14879t.m86793b(stringExtra19, byteArrayExtra3);
            m86345a(new C14878s(this, stringExtra19, stringExtra20, stringExtra21, byteArrayExtra3));
            if ("com.xiaomi.mipush.ENABLE_PUSH_MESSAGE".equals(intent.getAction())) {
                if (this.f62761a == null) {
                    this.f62761a = new C14814f();
                    vvq0.m200201c(this, this.f62761a, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"), null, null);
                }
                if (this.f62770a == null) {
                    this.f62770a = gkq0.m126675d(this);
                    return;
                }
                return;
            }
            return;
        }
        if ("com.xiaomi.mipush.SEND_TINYDATA".equals(intent.getAction())) {
            String stringExtra22 = intent.getStringExtra("mipush_app_package");
            byte[] byteArrayExtra4 = intent.getByteArrayExtra("mipush_payload");
            C14744gj c14744gj = new C14744gj();
            try {
                C14788m.m86276d(c14744gj, byteArrayExtra4);
                ttq0.m190616b(this).m190620e(c14744gj, stringExtra22);
                return;
            } catch (C14778hu e2) {
                ilq0.m137044q(e2);
                return;
            }
        }
        if ("com.xiaomi.push.timer".equalsIgnoreCase(intent.getAction())) {
            ilq0.m137040m("[Alarm] Service called on timer");
            if (!m86336i()) {
                uqq0.m194997d(false);
                if (m86330f()) {
                    m86318b(false);
                }
            } else if (uqq0.m194998e()) {
                ilq0.m137040m("enter falldown mode, stop alarm");
                uqq0.m194994a();
            }
            C14809a c14809a = this.f62760a;
            if (c14809a != null) {
                c14809a.m86370a();
                return;
            }
            return;
        }
        if ("com.xiaomi.push.check_alive".equalsIgnoreCase(intent.getAction())) {
            ilq0.m137040m("Service called on check alive.");
            if (m86330f()) {
                m86318b(false);
                return;
            }
            return;
        }
        if ("com.xiaomi.mipush.thirdparty".equals(intent.getAction())) {
            ilq0.m137040m("on thirdpart push :" + intent.getStringExtra("com.xiaomi.mipush.thirdparty_DESC"));
            uqq0.m194996c(this, intent.getIntExtra("com.xiaomi.mipush.thirdparty_LEVEL", 0));
            return;
        }
        if ("android.net.conn.CONNECTIVITY_CHANGE".equals(intent.getAction())) {
            m86325d();
            return;
        }
        if ("miui.net.wifi.DIGEST_INFORMATION_CHANGED".equals(intent.getAction())) {
            m86304a(intent);
            return;
        }
        if ("com.xiaomi.xmsf.USE_INTELLIGENT_HB".equals(intent.getAction())) {
            if (intent.getExtras() == null || (i = intent.getExtras().getInt("effectivePeriod", 0)) <= 0 || i > 604800) {
                return;
            }
            C14871m.m86681a(getApplicationContext()).m86702a(i);
            return;
        }
        if (!"action_cr_config".equals(intent.getAction())) {
            if (AbstractC14843an.f62949n.equals(intent.getAction())) {
                C14870l.m86676a(getApplicationContext(), intent);
                return;
            } else {
                if (AbstractC14843an.f62950o.equals(intent.getAction())) {
                    String stringExtra23 = intent.getStringExtra("ext_downward_pkt_id");
                    if (TextUtils.isEmpty(stringExtra23)) {
                        return;
                    }
                    C14849at.m86559a().m86564b(stringExtra23, intent.getLongExtra("ext_app_receive_time", 0L));
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
        qu5 qu5VarM176532h = qu5.m176518b().m176536l(booleanExtra3).m176535k(longExtra).m176539o(booleanExtra4).m176538n(longExtra2).m176533i(fmq0.m122192b(getApplicationContext())).m176534j(booleanExtra5).m176537m(longExtra3).m176532h(getApplicationContext());
        if ("com.xiaomi.xmsf".equals(getPackageName()) || longExtra <= 0 || longExtra2 <= 0 || longExtra3 <= 0) {
            return;
        }
        mqq0.m155991n(getApplicationContext(), qu5VarM176532h);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public void m86327e() {
        if (!m86355a()) {
            uqq0.m194994a();
        } else {
            if (uqq0.m194998e()) {
                return;
            }
            uqq0.m194997d(true);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public void m86329f() {
        osq0 osq0Var = this.f62773a;
        if (osq0Var != null && osq0Var.m165878B()) {
            ilq0.m137025B("try to connect while connecting.");
            return;
        }
        osq0 osq0Var2 = this.f62773a;
        if (osq0Var2 != null && osq0Var2.m165880D()) {
            ilq0.m137025B("try to connect while is connected.");
            return;
        }
        this.f62774a.m171245b(gkq0.m126676e(this));
        m86331g();
        if (this.f62773a == null) {
            C14842am.m86505a().m86513a(this);
            m86324c(false);
        }
    }

    /* JADX INFO: renamed from: g */
    private void m86331g() {
        try {
            this.f62776a.m165893n(this.f62775a, new xsq0() { // from class: com.xiaomi.push.service.XMPushService.5
                @Override // p149l.xsq0
                /* JADX INFO: renamed from: a */
                public boolean mo86368a(atq0 atq0Var) {
                    return true;
                }
            });
            this.f62776a.m199904R();
            this.f62773a = this.f62776a;
        } catch (C14737fi e) {
            ilq0.m137042o("fail to create Slim connection", e);
            this.f62776a.mo165901v(3, e);
        }
    }

    /* JADX INFO: renamed from: h */
    private boolean m86334h() {
        boolean zEquals;
        String packageName = getPackageName();
        if ("com.xiaomi.xmsf".equals(packageName)) {
            ilq0.m137040m("current sdk expect region is cn");
            zEquals = EnumC14789n.China.name().equals(C14856b.m86604a(getApplicationContext()).m86607a());
        } else {
            zEquals = !C14876r.m86775a(this).m86779b(packageName);
        }
        boolean z = zEquals;
        if (!z) {
            ilq0.m137043p("XMPushService", "-->isPushEnabled(): isEnabled=", Boolean.valueOf(z), ", package=", packageName, ", region=", C14856b.m86604a(getApplicationContext()).m86607a());
        }
        return z;
    }

    /* JADX INFO: renamed from: i */
    private boolean m86336i() {
        return getApplicationContext().getPackageName().equals("com.xiaomi.xmsf") && m86337j() && !ouq0.m166108q(this) && !ouq0.m166102k(getApplicationContext());
    }

    /* JADX INFO: renamed from: j */
    private boolean m86337j() {
        int iIntValue = Integer.valueOf(String.format("%tH", new Date())).intValue();
        int i = this.f62756a;
        int i2 = this.f62778b;
        if (i > i2) {
            return iIntValue >= i || iIntValue < i2;
        }
        return i < i2 && iIntValue >= i && iIntValue < i2;
    }

    /* JADX INFO: renamed from: k */
    private boolean m86338k() {
        if (TextUtils.equals(getPackageName(), "com.xiaomi.xmsf")) {
            return false;
        }
        return C14837ah.m86477a(this).m86489a(EnumC14745gk.ForegroundServiceSwitch.m85646a(), false);
    }

    /* JADX INFO: renamed from: a */
    public void m86353a(byte[] bArr, String str) {
        if (bArr == null) {
            C14879t.m86789a(this, str, bArr, 70000003, "null payload");
            ilq0.m137040m("register request without payload");
            return;
        }
        C14763hb c14763hb = new C14763hb();
        try {
            C14788m.m86276d(c14763hb, bArr);
            if (c14763hb.f62346a == EnumC14740gf.Registration) {
                C14767hf c14767hf = new C14767hf();
                try {
                    C14788m.m86276d(c14767hf, c14763hb.m85918a());
                    m86345a(new C14878s(this, c14763hb.m85921b(), c14767hf.m85992b(), c14767hf.m85997c(), bArr));
                    nqq0.m160662a(getApplicationContext()).m160668f(c14763hb.m85921b(), "E100003", c14767hf.m85985a(), 6002, null);
                } catch (C14778hu e) {
                    ilq0.m137025B("app register error. " + e);
                    C14879t.m86789a(this, str, bArr, 70000003, " data action error.");
                }
            } else {
                C14879t.m86789a(this, str, bArr, 70000003, " registration action required.");
                ilq0.m137040m("register request with invalid payload");
            }
        } catch (C14778hu e2) {
            ilq0.m137025B("app register fail. " + e2);
            C14879t.m86789a(this, str, bArr, 70000003, " data container error.");
        }
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        return this.f62759a.getBinder();
    }

    @Override // android.app.Service
    public void onCreate() {
        String[] strArrSplit;
        super.onCreate();
        ilq0.m137038k(getApplicationContext());
        nwq0.m161882e(this);
        C14874p c14874pM86765a = C14875q.m86765a((Context) this);
        if (c14874pM86765a != null) {
            gxq0.m128640b(c14874pM86765a.f63090a);
        }
        if (fvq0.m123356j(getApplicationContext())) {
            HandlerThread handlerThread = new HandlerThread("hb-alarm");
            handlerThread.start();
            Handler handler = new Handler(handlerThread.getLooper());
            this.f62760a = new C14809a();
            vvq0.m200202d(this, this.f62760a, new IntentFilter(AbstractC14843an.f62952q), "com.xiaomi.xmsf.permission.MIPUSH_RECEIVE", handler, 4);
            f62755b = true;
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
                        ilq0.m137040m("[Alarm] disable ping receiver may be failure. " + th);
                    }
                }
            });
        }
        this.f62759a = new Messenger(new Handler() { // from class: com.xiaomi.push.service.XMPushService.8
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
                        bundle.putString("xmsf_region", C14856b.m86604a(XMPushService.this.getApplicationContext()).m86607a());
                        messageObtain.setData(bundle);
                        message.replyTo.send(messageObtain);
                    } catch (Throwable unused) {
                    }
                }
            }
        });
        C14844ao.m86537a(this);
        psq0 psq0Var = new psq0(null, 5222, "xiaomi.com", null) { // from class: com.xiaomi.push.service.XMPushService.9
            @Override // p149l.psq0
            /* JADX INFO: renamed from: a */
            public byte[] mo86369a() {
                try {
                    aqq0 aqq0Var = new aqq0();
                    aqq0Var.m98330j(C14853ax.m86571a().m86582a());
                    return aqq0Var.m215761h();
                } catch (Exception e) {
                    ilq0.m137040m("getOBBString err: " + e.toString());
                    return null;
                }
            }
        };
        this.f62774a = psq0Var;
        psq0Var.m171242a(true);
        this.f62776a = new xrq0(this, this.f62774a);
        this.f62767a = m86340a();
        uqq0.m194995b(this);
        this.f62776a.m165891l(this);
        this.f62765a = new C14840ak(this);
        this.f62766a = new C14848as(this);
        new C14867i().m86669a();
        C14761h.m85875f().m85881j(this);
        this.f62768a = new C14872n("Connection Controller Thread");
        C14842am c14842amM86505a = C14842am.m86505a();
        c14842amM86505a.m86519b();
        c14842amM86505a.m86515a(new C14842am.a() { // from class: com.xiaomi.push.service.XMPushService.10
            @Override // com.xiaomi.push.service.C14842am.a
            /* JADX INFO: renamed from: a */
            public void mo86365a() {
                XMPushService.this.m86327e();
                if (C14842am.m86505a().m86507a() <= 0) {
                    XMPushService xMPushService = XMPushService.this;
                    xMPushService.m86345a(xMPushService.new C14815g(12, null));
                }
            }
        });
        if (m86338k()) {
            m86333h();
        }
        ttq0.m190616b(this).m190619d(new C14873o(this), "UPLOADER_PUSH_CHANNEL");
        m86347a(new qtq0(this));
        m86347a(new C14860bd(this));
        if (fvq0.m123356j(this)) {
            m86347a(new C14841al());
            if (ouq0.m166101j()) {
                m86347a(new InterfaceC14822n() { // from class: com.xiaomi.push.service.XMPushService.11
                    @Override // com.xiaomi.push.service.XMPushService.InterfaceC14822n
                    /* JADX INFO: renamed from: a */
                    public void mo86366a() {
                        bmq0.m102661a(XMPushService.this.getApplicationContext());
                    }
                });
            }
        }
        m86345a(new C14816h());
        this.f62772a.add(C14854ay.m86591a(this));
        if (m86334h()) {
            this.f62761a = new C14814f();
            vvq0.m200201c(this, this.f62761a, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"), null, null);
            this.f62770a = gkq0.m126675d(this);
        }
        if (fvq0.m123356j(getApplicationContext())) {
            this.f62764a = new C14828t();
            vvq0.m200202d(this, this.f62764a, new IntentFilter("miui.net.wifi.DIGEST_INFORMATION_CHANGED"), "miui.net.wifi.permission.ACCESS_WIFI_DIGEST_INFO", null, 2);
            C14819k c14819k = new C14819k();
            this.f62762a = c14819k;
            vvq0.m200202d(this, c14819k, new IntentFilter("com.xiaomi.xmsf.USE_INTELLIGENT_HB"), "com.xiaomi.xmsf.permission.INTELLIGENT_HB", null, 2);
        }
        if ("com.xiaomi.xmsf".equals(getPackageName())) {
            Uri uriFor = Settings.System.getUriFor("power_supersave_mode_open");
            if (uriFor != null) {
                this.f62758a = new ContentObserver(new Handler(Looper.getMainLooper())) { // from class: com.xiaomi.push.service.XMPushService.12
                    @Override // android.database.ContentObserver
                    public void onChange(boolean z) {
                        super.onChange(z);
                        boolean zM86332g = XMPushService.this.m86332g();
                        ilq0.m137040m("SuperPowerMode:" + zM86332g);
                        XMPushService.this.m86327e();
                        XMPushService xMPushService = XMPushService.this;
                        if (zM86332g) {
                            xMPushService.m86345a(xMPushService.new C14815g(24, null));
                        } else {
                            xMPushService.m86352a(true);
                        }
                    }
                };
                try {
                    getContentResolver().registerContentObserver(uriFor, false, this.f62758a);
                } catch (Throwable th) {
                    ilq0.m137025B("register super-power-mode observer err:" + th.getMessage());
                }
            }
            int[] iArrM86314a = m86314a();
            if (iArrM86314a != null) {
                this.f62763a = new C14826r();
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction("android.intent.action.SCREEN_ON");
                intentFilter.addAction("android.intent.action.SCREEN_OFF");
                vvq0.m200201c(this, this.f62763a, intentFilter, null, null);
                this.f62756a = iArrM86314a[0];
                this.f62778b = iArrM86314a[1];
                ilq0.m137040m("falldown initialized: " + this.f62756a + Constants.SEPARATOR_COMMA + this.f62778b);
            }
        }
        ynq0.m215433f(this, this.f62776a);
        eoq0.m117501b(this, this.f62776a);
        String str = "";
        if (c14874pM86765a != null) {
            try {
                if (!TextUtils.isEmpty(c14874pM86765a.f63091a) && (strArrSplit = c14874pM86765a.f63091a.split("@")) != null && strArrSplit.length > 0) {
                    str = strArrSplit[0];
                }
            } catch (Exception unused) {
            }
        }
        ioq0.m137369a(this);
        ilq0.m137027D("XMPushService created. pid=" + Process.myPid() + ", uid=" + Process.myUid() + ", vc=" + C14739g.m85582b(getApplicationContext(), getPackageName()) + ", uuid=" + str);
    }

    @Override // android.app.Service
    public void onDestroy() {
        C14814f c14814f = this.f62761a;
        if (c14814f != null) {
            m86303a(c14814f);
            this.f62761a = null;
        }
        Object obj = this.f62770a;
        if (obj != null) {
            gkq0.m126690s(this, obj);
            this.f62770a = null;
        }
        C14828t c14828t = this.f62764a;
        if (c14828t != null) {
            m86303a(c14828t);
            this.f62764a = null;
        }
        C14819k c14819k = this.f62762a;
        if (c14819k != null) {
            m86303a(c14819k);
            this.f62762a = null;
        }
        C14826r c14826r = this.f62763a;
        if (c14826r != null) {
            m86303a(c14826r);
            this.f62763a = null;
        }
        C14809a c14809a = this.f62760a;
        if (c14809a != null) {
            m86303a(c14809a);
            this.f62760a = null;
        }
        if ("com.xiaomi.xmsf".equals(getPackageName()) && this.f62758a != null) {
            try {
                getContentResolver().unregisterContentObserver(this.f62758a);
            } catch (Throwable th) {
                ilq0.m137025B("unregister super-power-mode err:" + th.getMessage());
            }
        }
        this.f62772a.clear();
        this.f62768a.m86731b();
        m86345a(new AbstractC14818j(2) { // from class: com.xiaomi.push.service.XMPushService.4
            @Override // com.xiaomi.push.service.XMPushService.AbstractC14818j
            /* JADX INFO: renamed from: a */
            public void mo85463a() {
                if (XMPushService.this.f62773a != null) {
                    XMPushService.this.f62773a.mo165901v(15, null);
                    XMPushService.this.f62773a = null;
                }
            }

            @Override // com.xiaomi.push.service.XMPushService.AbstractC14818j
            /* JADX INFO: renamed from: a */
            public String mo85462a() {
                return "disconnect for service destroy.";
            }
        });
        m86345a(new C14820l());
        C14842am.m86505a().m86519b();
        C14842am.m86505a().m86514a(this, 15);
        C14842am.m86505a().m86512a();
        this.f62776a.m165903x(this);
        C14853ax.m86571a().m86584a();
        uqq0.m194994a();
        m86335i();
        ynq0.m215436i(this, this.f62776a);
        eoq0.m117505f(this, this.f62776a);
        super.onDestroy();
        ilq0.m137040m("Service destroyed");
    }

    @Override // android.app.Service
    public void onStart(Intent intent, int i) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (intent == null) {
            ilq0.m137025B("onStart() with intent NULL");
        } else {
            try {
                String stringExtra = intent.getStringExtra(AbstractC14843an.f62957v);
                String stringExtra2 = intent.getStringExtra(AbstractC14843an.f62923F);
                String stringExtra3 = intent.getStringExtra("mipush_app_package");
                if ("android.net.conn.CONNECTIVITY_CHANGE".equals(intent.getAction()) || "miui.net.wifi.DIGEST_INFORMATION_CHANGED".equals(intent.getAction())) {
                    ilq0.m137041n("XMPushService", String.format("onStart() with intent.Action = %s, chid = %s, pkg = %s|%s, intent = %s", intent.getAction(), stringExtra, stringExtra2, stringExtra3, fvq0.m123351e(intent)));
                } else {
                    ilq0.m137041n("XMPushService", String.format("onStart() with intent.Action = %s, chid = %s, pkg = %s|%s", intent.getAction(), stringExtra, stringExtra2, stringExtra3));
                }
            } catch (Throwable th) {
                ilq0.m137025B("onStart() cause error: " + th.getMessage());
                return;
            }
        }
        if (intent != null && intent.getAction() != null) {
            if ("com.xiaomi.push.timer".equalsIgnoreCase(intent.getAction()) || "com.xiaomi.push.check_alive".equalsIgnoreCase(intent.getAction())) {
                if (this.f62768a.m86729a()) {
                    ilq0.m137025B("ERROR, the job controller is blocked.");
                    C14842am.m86505a().m86514a(this, 14);
                    stopSelf();
                } else {
                    m86345a(new C14817i(intent));
                }
            } else if (!"com.xiaomi.push.network_status_changed".equalsIgnoreCase(intent.getAction())) {
                m86345a(new C14817i(intent));
            }
        }
        long jCurrentTimeMillis2 = System.currentTimeMillis() - jCurrentTimeMillis;
        if (jCurrentTimeMillis2 > 50) {
            ilq0.m137053z("[Prefs] spend " + jCurrentTimeMillis2 + " ms, too more times.");
        }
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i, int i2) {
        onStart(intent, i2);
        return fvq0.m123356j(this) ? 1 : 2;
    }

    /* JADX INFO: renamed from: com.xiaomi.push.service.XMPushService$h */
    public class C14816h extends AbstractC14818j {
        public C14816h() {
            super(j6f.COLOR_SPACE_UNCALIBRATED);
        }

        @Override // com.xiaomi.push.service.XMPushService.AbstractC14818j
        /* JADX INFO: renamed from: a */
        public void mo85463a() {
            XMPushService.this.m86320c();
        }

        @Override // com.xiaomi.push.service.XMPushService.AbstractC14818j
        /* JADX INFO: renamed from: a */
        public String mo85462a() {
            return "Init Job";
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.push.service.XMPushService$g */
    public class C14815g extends AbstractC14818j {

        /* JADX INFO: renamed from: a */
        public Exception f62810a;

        /* JADX INFO: renamed from: b */
        public int f62811b;

        public C14815g(int i, Exception exc) {
            super(2);
            this.f62811b = i;
            this.f62810a = exc;
        }

        @Override // com.xiaomi.push.service.XMPushService.AbstractC14818j
        /* JADX INFO: renamed from: a */
        public void mo85463a() {
            XMPushService.this.m86344a(this.f62811b, this.f62810a);
        }

        @Override // com.xiaomi.push.service.XMPushService.AbstractC14818j
        /* JADX INFO: renamed from: a */
        public String mo85462a() {
            return "disconnect the connection.";
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.push.service.XMPushService$l */
    public class C14820l extends AbstractC14818j {
        public C14820l() {
            super(5);
        }

        @Override // com.xiaomi.push.service.XMPushService.AbstractC14818j
        /* JADX INFO: renamed from: a */
        public void mo85463a() {
            XMPushService.this.f62768a.m86724a();
        }

        @Override // com.xiaomi.push.service.XMPushService.AbstractC14818j
        /* JADX INFO: renamed from: a */
        public String mo85462a() {
            return "ask the job queue to quit";
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.push.service.XMPushService$m */
    public class C14821m extends AbstractC14818j {

        /* JADX INFO: renamed from: a */
        private atq0 f62818a;

        public C14821m(atq0 atq0Var) {
            super(8);
            this.f62818a = atq0Var;
        }

        @Override // com.xiaomi.push.service.XMPushService.AbstractC14818j
        /* JADX INFO: renamed from: a */
        public void mo85463a() {
            XMPushService.this.f62765a.m86501a(this.f62818a);
        }

        @Override // com.xiaomi.push.service.XMPushService.AbstractC14818j
        /* JADX INFO: renamed from: a */
        public String mo85462a() {
            return "receive a message.";
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.push.service.XMPushService$c */
    public static class C14811c extends AbstractC14818j {

        /* JADX INFO: renamed from: a */
        private final C14842am.b f62804a;

        public C14811c(C14842am.b bVar) {
            super(12);
            this.f62804a = bVar;
        }

        @Override // com.xiaomi.push.service.XMPushService.AbstractC14818j
        /* JADX INFO: renamed from: a */
        public String mo85462a() {
            return "bind time out. chid=" + this.f62804a.f62900g;
        }

        public boolean equals(Object obj) {
            if (obj instanceof C14811c) {
                return TextUtils.equals(((C14811c) obj).f62804a.f62900g, this.f62804a.f62900g);
            }
            return false;
        }

        public int hashCode() {
            return this.f62804a.f62900g.hashCode();
        }

        @Override // com.xiaomi.push.service.XMPushService.AbstractC14818j
        /* JADX INFO: renamed from: a */
        public void mo85463a() {
            this.f62804a.m86533a(C14842am.c.unbind, 1, 21, (String) null, (String) null);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.push.service.XMPushService$i */
    public class C14817i extends AbstractC14818j {

        /* JADX INFO: renamed from: a */
        private Intent f62813a;

        public C14817i(Intent intent) {
            super(15);
            this.f62813a = intent;
        }

        @Override // com.xiaomi.push.service.XMPushService.AbstractC14818j
        /* JADX INFO: renamed from: a */
        public String mo85462a() {
            return "Handle intent action = " + this.f62813a.getAction();
        }

        @Override // com.xiaomi.push.service.XMPushService.AbstractC14818j
        /* JADX INFO: renamed from: a */
        public void mo85463a() {
            XMPushService.this.m86326d(this.f62813a);
        }
    }

    /* JADX INFO: renamed from: e */
    public static boolean m86328e() {
        return f62755b;
    }

    /* JADX INFO: renamed from: com.xiaomi.push.service.XMPushService$d */
    public class C14812d extends AbstractC14818j {

        /* JADX INFO: renamed from: a */
        private qrq0 f62806a;

        public C14812d(qrq0 qrq0Var) {
            super(8);
            this.f62806a = qrq0Var;
        }

        @Override // com.xiaomi.push.service.XMPushService.AbstractC14818j
        /* JADX INFO: renamed from: a */
        public void mo85463a() {
            XMPushService.this.f62765a.m86502a(this.f62806a);
            if (AbstractC14863e.m86637a(this.f62806a)) {
                XMPushService.this.m86346a(new C14849at.a(), 15000L);
            }
        }

        @Override // com.xiaomi.push.service.XMPushService.AbstractC14818j
        /* JADX INFO: renamed from: a */
        public String mo85462a() {
            return "receive a message.";
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.push.service.XMPushService$e */
    public class C14813e extends AbstractC14818j {
        public C14813e() {
            super(1);
        }

        @Override // com.xiaomi.push.service.XMPushService.AbstractC14818j
        /* JADX INFO: renamed from: a */
        public void mo85463a() {
            if (XMPushService.this.m86355a()) {
                XMPushService xMPushService = XMPushService.this;
                if (xMPushService.m86309a(xMPushService.getApplicationContext())) {
                    XMPushService.this.m86329f();
                    return;
                }
            }
            ilq0.m137040m("should not connect. quit the job.");
        }

        @Override // com.xiaomi.push.service.XMPushService.AbstractC14818j
        /* JADX INFO: renamed from: a */
        public String mo85462a() {
            return "do reconnect..";
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.push.service.XMPushService$q */
    public class C14825q extends AbstractC14818j {
        public C14825q() {
            super(3);
        }

        @Override // com.xiaomi.push.service.XMPushService.AbstractC14818j
        /* JADX INFO: renamed from: a */
        public void mo85463a() {
            XMPushService.this.m86344a(11, (Exception) null);
            if (XMPushService.this.m86355a()) {
                XMPushService xMPushService = XMPushService.this;
                if (xMPushService.m86309a(xMPushService.getApplicationContext())) {
                    XMPushService.this.m86329f();
                }
            }
        }

        @Override // com.xiaomi.push.service.XMPushService.AbstractC14818j
        /* JADX INFO: renamed from: a */
        public String mo85462a() {
            return "reset the connection.";
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public boolean m86332g() {
        return "com.xiaomi.xmsf".equals(getPackageName()) && Settings.System.getInt(getContentResolver(), "power_supersave_mode_open", 0) == 1;
    }

    /* JADX INFO: renamed from: com.xiaomi.push.service.XMPushService$o */
    public class C14823o extends AbstractC14818j {

        /* JADX INFO: renamed from: a */
        boolean f62820a;

        public C14823o(boolean z) {
            super(4);
            this.f62820a = z;
        }

        @Override // com.xiaomi.push.service.XMPushService.AbstractC14818j
        /* JADX INFO: renamed from: a */
        public void mo85463a() {
            if (XMPushService.this.m86361c()) {
                try {
                    if (!this.f62820a) {
                        C14780i.m86243a();
                    }
                    XMPushService.this.f62773a.mo165877A(this.f62820a);
                } catch (C14737fi e) {
                    ilq0.m137044q(e);
                    XMPushService.this.m86344a(10, e);
                }
            }
        }

        @Override // com.xiaomi.push.service.XMPushService.AbstractC14818j
        /* JADX INFO: renamed from: a */
        public String mo85462a() {
            return "send ping..";
        }
    }

    /* JADX INFO: renamed from: i */
    private void m86335i() {
        synchronized (this.f62771a) {
            this.f62771a.clear();
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.push.service.XMPushService$a */
    public class C14809a extends BroadcastReceiver {

        /* JADX INFO: renamed from: a */
        private final Object f62801a;

        private C14809a() {
            this.f62801a = new Object();
        }

        /* JADX INFO: renamed from: a */
        private void m86371a(long j) {
            if (Looper.myLooper() == Looper.getMainLooper()) {
                ilq0.m137025B("[Alarm] Cannot perform lock.wait in the UI thread!");
                return;
            }
            synchronized (this.f62801a) {
                try {
                    this.f62801a.wait(j);
                } catch (InterruptedException e) {
                    ilq0.m137040m("[Alarm] interrupt from waiting state. " + e);
                }
            }
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            ilq0.m137053z("[Alarm] heartbeat alarm has been triggered.");
            if (!AbstractC14843an.f62952q.equals(intent.getAction())) {
                ilq0.m137040m("[Alarm] cancel the old ping timer");
                uqq0.m194994a();
                return;
            }
            if (TextUtils.equals(context.getPackageName(), intent.getPackage())) {
                ilq0.m137053z("[Alarm] Ping XMChannelService on timer");
                try {
                    Intent intent2 = new Intent(context, (Class<?>) XMPushService.class);
                    intent2.putExtra("time_stamp", System.currentTimeMillis());
                    intent2.setAction("com.xiaomi.push.timer");
                    ServiceClient.getInstance(context).startServiceSafely(intent2);
                    m86371a(3000L);
                    ilq0.m137040m("[Alarm] heartbeat alarm finish in " + (System.currentTimeMillis() - jCurrentTimeMillis));
                } catch (Throwable unused) {
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: a */
        public void m86370a() {
            if (Looper.myLooper() == Looper.getMainLooper()) {
                ilq0.m137025B("[Alarm] Cannot perform lock.notifyAll in the UI thread!");
                return;
            }
            synchronized (this.f62801a) {
                try {
                    this.f62801a.notifyAll();
                } catch (Exception e) {
                    ilq0.m137040m("[Alarm] notify lock. " + e);
                }
            }
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.push.service.XMPushService$p */
    public class C14824p extends AbstractC14818j {

        /* JADX INFO: renamed from: a */
        C14842am.b f62822a;

        public C14824p(C14842am.b bVar) {
            super(4);
            this.f62822a = bVar;
        }

        @Override // com.xiaomi.push.service.XMPushService.AbstractC14818j
        /* JADX INFO: renamed from: a */
        public void mo85463a() {
            try {
                this.f62822a.m86533a(C14842am.c.unbind, 1, 16, (String) null, (String) null);
                osq0 osq0Var = XMPushService.this.f62773a;
                C14842am.b bVar = this.f62822a;
                osq0Var.mo165890k(bVar.f62900g, bVar.f62894b);
                XMPushService xMPushService = XMPushService.this;
                xMPushService.m86346a(xMPushService.new C14810b(this.f62822a), 300L);
            } catch (C14737fi e) {
                ilq0.m137044q(e);
                XMPushService.this.m86344a(10, e);
            }
        }

        @Override // com.xiaomi.push.service.XMPushService.AbstractC14818j
        /* JADX INFO: renamed from: a */
        public String mo85462a() {
            return "rebind the client. " + this.f62822a.f62900g;
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.push.service.XMPushService$s */
    public class C14827s extends AbstractC14818j {

        /* JADX INFO: renamed from: a */
        C14842am.b f62826a;

        /* JADX INFO: renamed from: a */
        String f62827a;

        /* JADX INFO: renamed from: b */
        int f62828b;

        /* JADX INFO: renamed from: b */
        String f62829b;

        public C14827s(C14842am.b bVar, int i, String str, String str2) {
            super(9);
            this.f62826a = bVar;
            this.f62828b = i;
            this.f62827a = str;
            this.f62829b = str2;
        }

        @Override // com.xiaomi.push.service.XMPushService.AbstractC14818j
        /* JADX INFO: renamed from: a */
        public void mo85463a() {
            if (this.f62826a.f62888a != C14842am.c.unbind && XMPushService.this.f62773a != null) {
                try {
                    osq0 osq0Var = XMPushService.this.f62773a;
                    C14842am.b bVar = this.f62826a;
                    osq0Var.mo165890k(bVar.f62900g, bVar.f62894b);
                } catch (C14737fi e) {
                    ilq0.m137044q(e);
                    XMPushService.this.m86344a(10, e);
                }
            }
            this.f62826a.m86533a(C14842am.c.unbind, this.f62828b, 0, this.f62829b, this.f62827a);
        }

        @Override // com.xiaomi.push.service.XMPushService.AbstractC14818j
        /* JADX INFO: renamed from: a */
        public String mo85462a() {
            return "unbind the channel. " + this.f62826a.f62900g;
        }
    }

    /* JADX INFO: renamed from: f */
    private boolean m86330f() {
        if (SystemClock.elapsedRealtime() - this.f62757a < HuiYanOsConfig.LONG_CHECK_OVERSEAS_DEFAULT_TIME_OUT) {
            return false;
        }
        return gkq0.m126694w(this);
    }

    /* JADX INFO: renamed from: h */
    private void m86333h() {
    }

    /* JADX INFO: renamed from: com.xiaomi.push.service.XMPushService$b */
    public class C14810b extends AbstractC14818j {

        /* JADX INFO: renamed from: a */
        C14842am.b f62803a;

        public C14810b(C14842am.b bVar) {
            super(9);
            this.f62803a = bVar;
        }

        @Override // com.xiaomi.push.service.XMPushService.AbstractC14818j
        /* JADX INFO: renamed from: a */
        public void mo85463a() {
            try {
                if (!XMPushService.this.m86361c()) {
                    ilq0.m137025B("trying bind while the connection is not created, quit!");
                    return;
                }
                C14842am c14842amM86505a = C14842am.m86505a();
                C14842am.b bVar = this.f62803a;
                C14842am.b bVarM86508a = c14842amM86505a.m86508a(bVar.f62900g, bVar.f62894b);
                if (bVarM86508a == null) {
                    ilq0.m137040m("ignore bind because the channel " + this.f62803a.f62900g + " is removed ");
                    return;
                }
                if (bVarM86508a.f62888a == C14842am.c.unbind) {
                    bVarM86508a.m86533a(C14842am.c.binding, 0, 0, (String) null, (String) null);
                    XMPushService.this.f62773a.mo165888i(bVarM86508a);
                    C14780i.m86248f(XMPushService.this, bVarM86508a);
                } else {
                    ilq0.m137040m("trying duplicate bind, ingore! " + bVarM86508a.f62888a);
                }
            } catch (Exception e) {
                ilq0.m137025B("Meet error when trying to bind. " + e);
                XMPushService.this.m86344a(10, e);
            } catch (Throwable unused) {
            }
        }

        @Override // com.xiaomi.push.service.XMPushService.AbstractC14818j
        /* JADX INFO: renamed from: a */
        public String mo85462a() {
            return "bind the client. " + this.f62803a.f62900g;
        }
    }

    /* JADX INFO: renamed from: a */
    public int m86339a() {
        if (this.f62779c < 0) {
            this.f62779c = C14739g.m85582b(this, "com.xiaomi.xmsf");
        }
        return this.f62779c;
    }

    /* JADX INFO: renamed from: a */
    private int[] m86314a() {
        String[] strArrSplit;
        String strM86484a = C14837ah.m86477a(getApplicationContext()).m86484a(EnumC14745gk.FallDownTimeRange.m85646a(), "");
        if (!TextUtils.isEmpty(strM86484a) && (strArrSplit = strM86484a.split(Constants.SEPARATOR_COMMA)) != null && strArrSplit.length >= 2) {
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
                ilq0.m137025B("parse falldown time range failure: " + e);
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: a */
    private String m86298a() {
        String strM123353g = fvq0.m123353g("ro.miui.region");
        return TextUtils.isEmpty(strM123353g) ? fvq0.m123353g("ro.product.locale.region") : strM123353g;
    }

    /* JADX INFO: renamed from: a */
    private static void m86307a(String str) {
        if (EnumC14789n.China.name().equals(str)) {
            rnq0.m180128a("cn.app.chat.xiaomi.net", "cn.app.chat.xiaomi.net");
            rnq0.m180128a("cn.app.chat.xiaomi.net", "111.13.141.211:443");
            rnq0.m180128a("cn.app.chat.xiaomi.net", "39.156.81.172:443");
            rnq0.m180128a("cn.app.chat.xiaomi.net", "111.202.1.250:443");
            rnq0.m180128a("cn.app.chat.xiaomi.net", "123.125.102.213:443");
            rnq0.m180128a("resolver.msg.xiaomi.net", "111.13.142.153:443");
            rnq0.m180128a("resolver.msg.xiaomi.net", "111.202.1.252:443");
        }
    }

    /* JADX INFO: renamed from: a */
    private void m86304a(Intent intent) {
        Bundle extras;
        if (intent == null || (extras = intent.getExtras()) == null) {
            return;
        }
        String string = extras.getString("digest");
        C14871m.m86681a(getApplicationContext()).m86703a(string);
        ynq0.m215431d(this, string);
    }

    /* JADX INFO: renamed from: a */
    public void m86342a() {
        if (SystemClock.elapsedRealtime() - this.f62757a >= usq0.m195227a() && gkq0.m126694w(this)) {
            m86318b(true);
        }
    }

    /* JADX INFO: renamed from: b */
    private String m86315b() {
        String strM86298a;
        rjq0.m179663a();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        Object obj = new Object();
        int i = 0;
        if ("com.xiaomi.xmsf".equals(getPackageName())) {
            C14845ap c14845apM86542a = C14845ap.m86542a(this);
            String strM86298a2 = null;
            while (true) {
                if (!TextUtils.isEmpty(strM86298a2) && c14845apM86542a.m86543a() != 0) {
                    strM86298a = m86298a();
                    break;
                }
                if (TextUtils.isEmpty(strM86298a2)) {
                    strM86298a2 = m86298a();
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
            strM86298a = "CN";
        }
        ilq0.m137040m("wait coutrycode :" + strM86298a + " cost = " + (SystemClock.elapsedRealtime() - jElapsedRealtime) + " , count = " + i);
        return strM86298a;
    }

    /* JADX INFO: renamed from: a */
    public void m86350a(final String str, final byte[] bArr, boolean z) {
        Collection<C14842am.b> collectionM86510a = C14842am.m86505a().m86510a("5");
        if (collectionM86510a.isEmpty()) {
            if (z) {
                C14879t.m86793b(str, bArr);
            }
        } else if (collectionM86510a.iterator().next().f62888a == C14842am.c.binded) {
            m86345a(new AbstractC14818j(4) { // from class: com.xiaomi.push.service.XMPushService.3
                @Override // com.xiaomi.push.service.XMPushService.AbstractC14818j
                /* JADX INFO: renamed from: a */
                public void mo85463a() {
                    try {
                        C14882w.m86845a(XMPushService.this, str, bArr);
                    } catch (C14737fi e) {
                        ilq0.m137044q(e);
                        XMPushService.this.m86344a(10, e);
                    }
                }

                @Override // com.xiaomi.push.service.XMPushService.AbstractC14818j
                /* JADX INFO: renamed from: a */
                public String mo85462a() {
                    return "send mi push message";
                }
            });
        } else if (z) {
            C14879t.m86793b(str, bArr);
        }
    }

    /* JADX INFO: renamed from: a */
    private atq0 m86299a(atq0 atq0Var, String str, String str2) {
        C14842am c14842amM86505a = C14842am.m86505a();
        List<String> listM86511a = c14842amM86505a.m86511a(str);
        if (listM86511a.isEmpty()) {
            ilq0.m137040m("open channel should be called first before sending a packet, pkg=" + str);
            return null;
        }
        atq0Var.m98876v(str);
        String strM98867m = atq0Var.m98867m();
        if (TextUtils.isEmpty(strM98867m)) {
            strM98867m = listM86511a.get(0);
            atq0Var.m98870p(strM98867m);
        }
        C14842am.b bVarM86508a = c14842amM86505a.m86508a(strM98867m, atq0Var.m98871q());
        if (!m86361c()) {
            ilq0.m137040m("drop a packet as the channel is not connected, chid=" + strM98867m);
            return null;
        }
        if (bVarM86508a != null && bVarM86508a.f62888a == C14842am.c.binded) {
            if (TextUtils.equals(str2, bVarM86508a.f62902i)) {
                return atq0Var;
            }
            ilq0.m137040m("invalid session. " + str2);
            return null;
        }
        ilq0.m137040m("drop a packet as the channel is not opened, chid=" + strM98867m);
        return null;
    }

    /* JADX INFO: renamed from: b */
    private void m86318b(boolean z) {
        this.f62757a = SystemClock.elapsedRealtime();
        if (!m86361c()) {
            m86352a(true);
        } else if (gkq0.m126691t(this)) {
            m86322c(new C14823o(z));
        } else {
            m86322c(new C14815g(17, null));
            m86352a(true);
        }
    }

    /* JADX INFO: renamed from: a */
    private boolean m86313a(String str, Intent intent) {
        C14842am.b bVarM86508a = C14842am.m86505a().m86508a(str, intent.getStringExtra(AbstractC14843an.f62954s));
        boolean z = false;
        if (bVarM86508a != null && str != null) {
            String stringExtra = intent.getStringExtra(AbstractC14843an.f62927J);
            String stringExtra2 = intent.getStringExtra(AbstractC14843an.f62919B);
            if (!TextUtils.isEmpty(bVarM86508a.f62902i) && !TextUtils.equals(stringExtra, bVarM86508a.f62902i)) {
                ilq0.m137040m("session changed. old session=" + bVarM86508a.f62902i + ", new session=" + stringExtra + " chid = " + str);
                z = true;
            }
            if (!stringExtra2.equals(bVarM86508a.f62901h)) {
                ilq0.m137040m("security changed. chid = " + str + " sechash = " + tlq0.m189623b(stringExtra2));
                return true;
            }
        }
        return z;
    }

    /* JADX INFO: renamed from: b */
    public boolean m86360b() {
        try {
            Class<?> clsM161880c = nwq0.m161880c(this, "miui.os.Build");
            return clsM161880c.getField("IS_CM_CUSTOMIZATION_TEST").getBoolean(null) || clsM161880c.getField("IS_CU_CUSTOMIZATION_TEST").getBoolean(null) || clsM161880c.getField("IS_CT_CUSTOMIZATION_TEST").getBoolean(null);
        } catch (Throwable unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: b */
    public C14866h m86357b() {
        return this.f62767a;
    }

    /* JADX INFO: renamed from: b */
    public void m86359b(AbstractC14818j abstractC14818j) {
        this.f62768a.m86726a(abstractC14818j.f63068a, abstractC14818j);
    }

    @Override // p149l.rsq0
    /* JADX INFO: renamed from: b */
    public void mo85573b(osq0 osq0Var) {
        C14761h.m85874e().mo85573b(osq0Var);
        m86324c(true);
        this.f62766a.m86557a();
        if (!uqq0.m194998e() && !m86336i()) {
            ilq0.m137040m("reconnection successful, reactivate alarm.");
            uqq0.m194997d(true);
        }
        Iterator<C14842am.b> it = C14842am.m86505a().m86509a().iterator();
        while (it.hasNext()) {
            m86345a(new C14810b(it.next()));
        }
        if (this.f62777a || !fvq0.m123356j(getApplicationContext())) {
            return;
        }
        njq0.m159772f(getApplicationContext()).m159773g(new Runnable() { // from class: com.xiaomi.push.service.XMPushService.6
            @Override // java.lang.Runnable
            public void run() {
                XMPushService.this.f62777a = true;
                try {
                    ilq0.m137040m("try to trigger the wifi digest broadcast.");
                    Object systemService = XMPushService.this.getApplicationContext().getSystemService("MiuiWifiService");
                    if (systemService != null) {
                        ikq0.m136891n(systemService, "sendCurrentWifiDigestInfo", new Object[0]);
                    }
                } catch (Throwable unused) {
                }
            }
        });
    }

    /* JADX INFO: renamed from: a */
    private C14842am.b m86296a(String str, Intent intent) {
        C14842am.b bVarM86508a = C14842am.m86505a().m86508a(str, intent.getStringExtra(AbstractC14843an.f62954s));
        if (bVarM86508a == null) {
            bVarM86508a = new C14842am.b(this);
        }
        bVarM86508a.f62900g = intent.getStringExtra(AbstractC14843an.f62957v);
        bVarM86508a.f62894b = intent.getStringExtra(AbstractC14843an.f62954s);
        bVarM86508a.f62896c = intent.getStringExtra(AbstractC14843an.f62961z);
        bVarM86508a.f62890a = intent.getStringExtra(AbstractC14843an.f62923F);
        bVarM86508a.f62898e = intent.getStringExtra(AbstractC14843an.f62921D);
        bVarM86508a.f62899f = intent.getStringExtra(AbstractC14843an.f62922E);
        bVarM86508a.f62892a = intent.getBooleanExtra(AbstractC14843an.f62920C, false);
        bVarM86508a.f62901h = intent.getStringExtra(AbstractC14843an.f62919B);
        bVarM86508a.f62902i = intent.getStringExtra(AbstractC14843an.f62927J);
        bVarM86508a.f62897d = intent.getStringExtra(AbstractC14843an.f62918A);
        bVarM86508a.f62889a = this.f62767a;
        bVarM86508a.m86531a((Messenger) intent.getParcelableExtra(AbstractC14843an.f62931N));
        bVarM86508a.f62882a = getApplicationContext();
        C14842am.m86505a().m86516a(bVarM86508a);
        return bVarM86508a;
    }

    /* JADX INFO: renamed from: c */
    private void m86321c(Intent intent) {
        String stringExtra = intent.getStringExtra(AbstractC14843an.f62923F);
        String stringExtra2 = intent.getStringExtra(AbstractC14843an.f62927J);
        Parcelable[] parcelableArrayExtra = intent.getParcelableArrayExtra("ext_packets");
        int length = parcelableArrayExtra.length;
        zsq0[] zsq0VarArr = new zsq0[length];
        intent.getBooleanExtra("ext_encrypt", true);
        for (int i = 0; i < parcelableArrayExtra.length; i++) {
            zsq0 zsq0Var = new zsq0((Bundle) parcelableArrayExtra[i]);
            zsq0VarArr[i] = zsq0Var;
            zsq0 zsq0Var2 = (zsq0) m86299a(zsq0Var, stringExtra, stringExtra2);
            zsq0VarArr[i] = zsq0Var2;
            if (zsq0Var2 == null) {
                return;
            }
        }
        C14842am c14842amM86505a = C14842am.m86505a();
        qrq0[] qrq0VarArr = new qrq0[length];
        for (int i2 = 0; i2 < length; i2++) {
            zsq0 zsq0Var3 = zsq0VarArr[i2];
            qrq0VarArr[i2] = qrq0.m176077f(zsq0Var3, c14842amM86505a.m86508a(zsq0Var3.m98867m(), zsq0Var3.m98871q()).f62901h);
        }
        m86322c(new C14861c(this, qrq0VarArr));
    }

    /* JADX INFO: renamed from: b */
    public void m86358b() {
        C14871m.m86681a(getApplicationContext()).m86708d();
        Iterator it = new ArrayList(this.f62771a).iterator();
        while (it.hasNext()) {
            ((InterfaceC14822n) it.next()).mo86366a();
        }
    }

    /* JADX INFO: renamed from: a */
    public void m86349a(String str, String str2, int i, String str3, String str4) {
        C14842am.b bVarM86508a = C14842am.m86505a().m86508a(str, str2);
        if (bVarM86508a != null) {
            m86345a(new C14827s(bVarM86508a, i, str4, str3));
        }
        C14842am.m86505a().m86518a(str, str2);
    }

    /* JADX INFO: renamed from: a */
    private void m86308a(String str, int i) {
        XMPushService xMPushService;
        int i2;
        Collection<C14842am.b> collectionM86510a = C14842am.m86505a().m86510a(str);
        if (collectionM86510a != null) {
            for (C14842am.b bVar : collectionM86510a) {
                if (bVar != null) {
                    xMPushService = this;
                    i2 = i;
                    xMPushService.m86345a(xMPushService.new C14827s(bVar, i2, null, null));
                } else {
                    xMPushService = this;
                    i2 = i;
                }
                this = xMPushService;
                i = i2;
            }
        }
        C14842am.m86505a().m86517a(str);
    }

    /* JADX INFO: renamed from: c */
    private void m86322c(AbstractC14818j abstractC14818j) {
        this.f62768a.m86727a(abstractC14818j);
    }

    /* JADX INFO: renamed from: c */
    private void m86324c(boolean z) {
        try {
            if (nwq0.m161883f()) {
                if (z) {
                    if (fvq0.m123356j(this)) {
                        Intent intent = new Intent("miui.intent.action.NETWORK_CONNECTED");
                        intent.addFlags(1073741824);
                        sendBroadcast(intent);
                    }
                    for (InterfaceC14830aa interfaceC14830aa : (InterfaceC14830aa[]) this.f62772a.toArray(new InterfaceC14830aa[0])) {
                        interfaceC14830aa.mo86376a();
                    }
                    return;
                }
                if (fvq0.m123356j(this)) {
                    Intent intent2 = new Intent("miui.intent.action.NETWORK_BLOCKED");
                    intent2.addFlags(1073741824);
                    sendBroadcast(intent2);
                }
            }
        } catch (Exception e) {
            ilq0.m137044q(e);
        }
    }

    /* JADX INFO: renamed from: a */
    public void m86345a(AbstractC14818j abstractC14818j) {
        m86346a(abstractC14818j, 0L);
    }

    /* JADX INFO: renamed from: a */
    public void m86346a(AbstractC14818j abstractC14818j, long j) {
        try {
            this.f62768a.m86728a(abstractC14818j, j);
        } catch (IllegalStateException e) {
            ilq0.m137040m("can't execute job err = " + e.getMessage());
        }
    }

    /* JADX INFO: renamed from: a */
    private void m86303a(BroadcastReceiver broadcastReceiver) {
        if (broadcastReceiver != null) {
            try {
                unregisterReceiver(broadcastReceiver);
            } catch (IllegalArgumentException e) {
                ilq0.m137044q(e);
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public void m86351a(qrq0 qrq0Var) throws C14737fi {
        osq0 osq0Var = this.f62773a;
        if (osq0Var != null) {
            osq0Var.mo165902w(qrq0Var);
            return;
        }
        throw new C14737fi("try send msg while connection is null.");
    }

    /* JADX INFO: renamed from: a */
    public void m86354a(qrq0[] qrq0VarArr) throws C14737fi {
        osq0 osq0Var = this.f62773a;
        if (osq0Var != null) {
            osq0Var.mo165895p(qrq0VarArr);
            return;
        }
        throw new C14737fi("try send msg while connection is null.");
    }

    /* JADX INFO: renamed from: a */
    public void m86352a(boolean z) {
        this.f62766a.m86558a(z);
    }

    /* JADX INFO: renamed from: a */
    public void m86348a(C14842am.b bVar) {
        if (bVar != null) {
            long jM86528a = bVar.m86528a();
            ilq0.m137040m("schedule rebind job in " + (jM86528a / 1000));
            m86346a(new C14810b(bVar), jM86528a);
        }
    }

    /* JADX INFO: renamed from: c */
    public boolean m86361c() {
        osq0 osq0Var = this.f62773a;
        return osq0Var != null && osq0Var.m165880D();
    }

    /* JADX INFO: renamed from: a */
    public void m86344a(int i, Exception exc) {
        StringBuilder sb = new StringBuilder("disconnect ");
        sb.append(hashCode());
        sb.append(", ");
        osq0 osq0Var = this.f62773a;
        sb.append(osq0Var == null ? null : Integer.valueOf(osq0Var.hashCode()));
        ilq0.m137040m(sb.toString());
        osq0 osq0Var2 = this.f62773a;
        if (osq0Var2 != null) {
            osq0Var2.mo165901v(i, exc);
            this.f62773a = null;
        }
        m86343a(7);
        m86343a(4);
        C14842am.m86505a().m86514a(this, i);
    }

    /* JADX INFO: renamed from: d */
    private void m86325d() {
        hkq0 hkq0VarM126687p = gkq0.m126687p();
        C14871m.m86681a(getApplicationContext()).m86704a(hkq0VarM126687p);
        if (hkq0VarM126687p == null) {
            ilq0.m137041n("XMPushService", "network changed, no active network");
        } else {
            ilq0.m137041n("XMPushService", "network changed,".concat("[type: " + hkq0VarM126687p.m131581e() + "[" + hkq0VarM126687p.m131584h() + "], state: " + hkq0VarM126687p.m131580c() + "/" + hkq0VarM126687p.m131579b()));
            NetworkInfo.State stateM131580c = hkq0VarM126687p.m131580c();
            if (stateM131580c == NetworkInfo.State.SUSPENDED || stateM131580c == NetworkInfo.State.UNKNOWN) {
                return;
            }
        }
        if (C14761h.m85874e() != null) {
            C14761h.m85874e().m85572b();
        }
        jtq0.m143166h(this);
        this.f62776a.m165881E();
        if (gkq0.m126691t(this)) {
            if (m86361c() && m86330f()) {
                m86318b(false);
            }
            if (!m86361c() && !m86362d()) {
                this.f62768a.m86725a(1);
                m86345a(new C14813e());
            }
            yoq0.m215531c(this).m215538d();
        } else {
            m86345a(new C14815g(2, null));
        }
        m86327e();
    }

    /* JADX INFO: renamed from: a */
    public boolean m86355a() {
        boolean zM126691t = gkq0.m126691t(this);
        boolean z = false;
        boolean z2 = C14842am.m86505a().m86507a() > 0;
        boolean zM86360b = m86360b();
        boolean z3 = !zM86360b;
        boolean zM86334h = m86334h();
        boolean zM86332g = m86332g();
        boolean z4 = !zM86332g;
        if (zM126691t && z2 && !zM86360b && zM86334h && !zM86332g) {
            z = true;
        }
        if (!z) {
            ilq0.m137027D(String.format("not conn, net=%s;cnt=%s;!dis=%s;enb=%s;!spm=%s;", Boolean.valueOf(zM126691t), Boolean.valueOf(z2), Boolean.valueOf(z3), Boolean.valueOf(zM86334h), Boolean.valueOf(z4)));
        }
        return z;
    }

    /* JADX INFO: renamed from: a */
    public C14866h m86340a() {
        return new C14866h();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public boolean m86309a(Context context) {
        try {
            rjq0.m179663a();
            for (int i = 100; i > 0; i--) {
                if (gkq0.m126693v(context)) {
                    ilq0.m137040m("network connectivity ok.");
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
    public osq0 m86341a() {
        return this.f62773a;
    }

    /* JADX INFO: renamed from: a */
    public void m86343a(int i) {
        this.f62768a.m86725a(i);
    }

    /* JADX INFO: renamed from: a */
    public boolean m86356a(int i) {
        return this.f62768a.m86730a(i);
    }

    @Override // p149l.rsq0
    /* JADX INFO: renamed from: a */
    public void mo85569a(osq0 osq0Var) {
        ilq0.m137053z("begin to connect...");
        C14761h.m85874e().mo85569a(osq0Var);
    }

    @Override // p149l.rsq0
    /* JADX INFO: renamed from: a */
    public void mo85570a(osq0 osq0Var, int i, Exception exc) {
        C14761h.m85874e().mo85570a(osq0Var, i, exc);
        if (m86336i()) {
            return;
        }
        m86352a(false);
    }

    @Override // p149l.rsq0
    /* JADX INFO: renamed from: a */
    public void mo85571a(osq0 osq0Var, Exception exc) {
        C14761h.m85874e().mo85571a(osq0Var, exc);
        m86324c(false);
        if (m86336i()) {
            return;
        }
        m86352a(false);
    }

    /* JADX INFO: renamed from: a */
    public void m86347a(InterfaceC14822n interfaceC14822n) {
        synchronized (this.f62771a) {
            this.f62771a.add(interfaceC14822n);
        }
    }

    /* JADX INFO: renamed from: d */
    public boolean m86362d() {
        osq0 osq0Var = this.f62773a;
        return osq0Var != null && osq0Var.m165878B();
    }
}
