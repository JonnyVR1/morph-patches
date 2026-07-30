package com.xiaomi.mipush.sdk;

import android.app.Application;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.database.ContentObserver;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.os.SystemClock;
import android.text.TextUtils;
import com.clevertap.android.sdk.Constants;
import com.xiaomi.push.C14892gj;
import com.xiaomi.push.C14901gs;
import com.xiaomi.push.C14911hb;
import com.xiaomi.push.C14914he;
import com.xiaomi.push.C14915hf;
import com.xiaomi.push.C14921hl;
import com.xiaomi.push.C14936m;
import com.xiaomi.push.EnumC14888gf;
import com.xiaomi.push.EnumC14889gg;
import com.xiaomi.push.EnumC14893gk;
import com.xiaomi.push.EnumC14898gp;
import com.xiaomi.push.InterfaceC14925hq;
import com.xiaomi.push.service.AbstractC14991an;
import com.xiaomi.push.service.C14985ah;
import com.xiaomi.push.service.C14987aj;
import com.xiaomi.push.service.C14993ap;
import com.xiaomi.push.service.C15013g;
import io.agora.base.internal.voiceengine.earmonitor.HardwareEarMonitorUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import p153l.f3r0;
import p153l.jxq0;
import p153l.l4r0;
import p153l.m5r0;
import p153l.mtq0;
import p153l.n1r0;
import p153l.otq0;
import p153l.ouq0;
import p153l.s5r0;
import p153l.tzq0;
import p153l.zuq0;

/* JADX INFO: renamed from: com.xiaomi.mipush.sdk.f */
/* JADX INFO: loaded from: classes2.dex */
public class C14870f {

    /* JADX INFO: renamed from: l */
    private static C14870f f62443l = null;

    /* JADX INFO: renamed from: m */
    private static boolean f62444m = false;

    /* JADX INFO: renamed from: n */
    private static final ArrayList<f> f62445n = new ArrayList<>();

    /* JADX INFO: renamed from: a */
    private boolean f62446a;

    /* JADX INFO: renamed from: b */
    private Context f62447b;

    /* JADX INFO: renamed from: d */
    private Messenger f62449d;

    /* JADX INFO: renamed from: e */
    private Handler f62450e;

    /* JADX INFO: renamed from: h */
    private long f62453h;

    /* JADX INFO: renamed from: f */
    private List<Message> f62451f = new ArrayList();

    /* JADX INFO: renamed from: g */
    private boolean f62452g = false;

    /* JADX INFO: renamed from: i */
    private String f62454i = null;

    /* JADX INFO: renamed from: j */
    private Intent f62455j = null;

    /* JADX INFO: renamed from: k */
    private Integer f62456k = null;

    /* JADX INFO: renamed from: c */
    private String f62448c = null;

    /* JADX INFO: renamed from: com.xiaomi.mipush.sdk.f$a */
    public class a extends Handler {
        public a(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void dispatchMessage(Message message) {
            if (message.what != 19) {
                return;
            }
            String str = (String) message.obj;
            int i = message.arg1;
            synchronized (m5r0.class) {
                try {
                    if (m5r0.m157115c(C14870f.this.f62447b).m157120f(str)) {
                        if (m5r0.m157115c(C14870f.this.f62447b).m157116a(str) < 10) {
                            String string = message.getData() != null ? message.getData().getString("third_sync_reason") : "";
                            EnumC14874v enumC14874v = EnumC14874v.DISABLE_PUSH;
                            if (enumC14874v.ordinal() == i && "syncing".equals(m5r0.m157115c(C14870f.this.f62447b).m157117b(enumC14874v))) {
                                C14870f.this.m86551F(str, enumC14874v, true, null);
                            } else {
                                EnumC14874v enumC14874v2 = EnumC14874v.ENABLE_PUSH;
                                if (enumC14874v2.ordinal() == i && "syncing".equals(m5r0.m157115c(C14870f.this.f62447b).m157117b(enumC14874v2))) {
                                    C14870f.this.m86551F(str, enumC14874v2, true, null);
                                } else {
                                    EnumC14874v enumC14874v3 = EnumC14874v.UPLOAD_HUAWEI_TOKEN;
                                    if (enumC14874v3.ordinal() == i && "syncing".equals(m5r0.m157115c(C14870f.this.f62447b).m157117b(enumC14874v3))) {
                                        HashMap<String, String> mapM161133e = n1r0.m161133e(C14870f.this.f62447b, EnumC14868d.ASSEMBLE_PUSH_HUAWEI);
                                        mapM161133e.put("third_sync_reason", string);
                                        C14870f.this.m86551F(str, enumC14874v3, false, mapM161133e);
                                    } else {
                                        EnumC14874v enumC14874v4 = EnumC14874v.UPLOAD_FCM_TOKEN;
                                        if (enumC14874v4.ordinal() == i && "syncing".equals(m5r0.m157115c(C14870f.this.f62447b).m157117b(enumC14874v4))) {
                                            C14870f c14870f = C14870f.this;
                                            c14870f.m86551F(str, enumC14874v4, false, n1r0.m161133e(c14870f.f62447b, EnumC14868d.ASSEMBLE_PUSH_FCM));
                                        } else {
                                            EnumC14874v enumC14874v5 = EnumC14874v.UPLOAD_COS_TOKEN;
                                            if (enumC14874v5.ordinal() == i && "syncing".equals(m5r0.m157115c(C14870f.this.f62447b).m157117b(enumC14874v5))) {
                                                HashMap<String, String> mapM161133e2 = n1r0.m161133e(C14870f.this.f62447b, EnumC14868d.ASSEMBLE_PUSH_COS);
                                                mapM161133e2.put("third_sync_reason", string);
                                                C14870f.this.m86551F(str, enumC14874v5, false, mapM161133e2);
                                            } else {
                                                EnumC14874v enumC14874v6 = EnumC14874v.UPLOAD_FTOS_TOKEN;
                                                if (enumC14874v6.ordinal() == i && "syncing".equals(m5r0.m157115c(C14870f.this.f62447b).m157117b(enumC14874v6))) {
                                                    HashMap<String, String> mapM161133e3 = n1r0.m161133e(C14870f.this.f62447b, EnumC14868d.ASSEMBLE_PUSH_FTOS);
                                                    mapM161133e3.put("third_sync_reason", string);
                                                    C14870f.this.m86551F(str, enumC14874v6, false, mapM161133e3);
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                            m5r0.m157115c(C14870f.this.f62447b).m157121g(str);
                        } else {
                            m5r0.m157115c(C14870f.this.f62447b).m157122h(str);
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.mipush.sdk.f$b */
    public class b implements C15013g.b {
        public b() {
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.mipush.sdk.f$c */
    public class c extends ContentObserver {
        public c(Handler handler) {
            super(handler);
        }

        @Override // android.database.ContentObserver
        public void onChange(boolean z) {
            C14870f c14870f = C14870f.this;
            c14870f.f62456k = Integer.valueOf(C14993ap.m87713a(c14870f.f62447b).m87714a());
            if (C14870f.this.f62456k.intValue() != 0) {
                C14870f.this.f62447b.getContentResolver().unregisterContentObserver(this);
                if (mtq0.m160044t(C14870f.this.f62447b)) {
                    C14870f.this.m86592S();
                }
            }
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.mipush.sdk.f$d */
    public class d implements ServiceConnection {
        public d() {
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            synchronized (C14870f.this) {
                C14870f.this.f62449d = new Messenger(iBinder);
                C14870f.this.f62452g = false;
                Iterator it = C14870f.this.f62451f.iterator();
                while (it.hasNext()) {
                    try {
                        C14870f.this.f62449d.send((Message) it.next());
                    } catch (RemoteException e) {
                        ouq0.m169397q(e);
                    }
                }
                C14870f.this.f62451f.clear();
            }
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
            C14870f.this.f62449d = null;
            C14870f.this.f62452g = false;
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.mipush.sdk.f$e */
    public static /* synthetic */ class e {

        /* JADX INFO: renamed from: a */
        static final /* synthetic */ int[] f62461a;

        static {
            int[] iArr = new int[EnumC14874v.values().length];
            f62461a = iArr;
            try {
                iArr[EnumC14874v.DISABLE_PUSH.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f62461a[EnumC14874v.ENABLE_PUSH.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f62461a[EnumC14874v.UPLOAD_HUAWEI_TOKEN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f62461a[EnumC14874v.UPLOAD_FCM_TOKEN.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f62461a[EnumC14874v.UPLOAD_COS_TOKEN.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f62461a[EnumC14874v.UPLOAD_FTOS_TOKEN.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.mipush.sdk.f$f */
    public static class f<T extends InterfaceC14925hq<T, ?>> {

        /* JADX INFO: renamed from: a */
        T f62462a;

        /* JADX INFO: renamed from: b */
        EnumC14888gf f62463b;

        /* JADX INFO: renamed from: c */
        boolean f62464c;
    }

    private C14870f(Context context) {
        this.f62446a = false;
        this.f62450e = null;
        this.f62447b = context.getApplicationContext();
        this.f62446a = m86558V();
        f62444m = m86561Z();
        this.f62450e = new a(Looper.getMainLooper());
        if (l4r0.m152825j(context)) {
            C15013g.m87826a(new b());
        }
        Intent intentM86553M = m86553M();
        if (intentM86553M != null) {
            m86554P(intentM86553M);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:29:0x0065  */
    /* JADX WARN: Code duplicated, block: B:31:0x006e  */
    /* JADX WARN: Code duplicated, block: B:32:0x0072  */
    /* JADX WARN: Code duplicated, block: B:34:0x0080  */
    /* JADX WARN: Code duplicated, block: B:36:0x008c  */
    /* JADX WARN: Code duplicated, block: B:38:0x009a  */
    /* JADX WARN: Code duplicated, block: B:42:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:44:0x010d  */
    /* JADX INFO: renamed from: F */
    public void m86551F(String str, EnumC14874v enumC14874v, boolean z, HashMap<String, String> map) {
        C14914he c14914he;
        C14914he c14914he2;
        EnumC14888gf enumC14888gf;
        Message messageObtain;
        byte[] bArrM87448e;
        if (C14867c.m86499c(this.f62447b).m86514p() && mtq0.m160044t(this.f62447b)) {
            C14914he c14914he3 = new C14914he();
            c14914he3.m87117a(true);
            Intent intentM86566d = m86566d();
            if (!TextUtils.isEmpty(str)) {
                c14914he3.m87114a(str);
                if (z) {
                    c14914he2 = new C14914he(str, true);
                } else {
                    c14914he = null;
                }
                switch (e.f62461a[enumC14874v.ordinal()]) {
                    case 1:
                        EnumC14898gp enumC14898gp = EnumC14898gp.DisablePushMessage;
                        c14914he3.m87131c(enumC14898gp.f62957a);
                        c14914he.m87131c(enumC14898gp.f62957a);
                        if (map != null) {
                            c14914he3.m87116a(map);
                            c14914he.m87116a(map);
                        }
                        intentM86566d.setAction("com.xiaomi.mipush.DISABLE_PUSH_MESSAGE");
                        break;
                    case 2:
                        EnumC14898gp enumC14898gp2 = EnumC14898gp.EnablePushMessage;
                        c14914he3.m87131c(enumC14898gp2.f62957a);
                        c14914he.m87131c(enumC14898gp2.f62957a);
                        if (map != null) {
                            c14914he3.m87116a(map);
                            c14914he.m87116a(map);
                        }
                        intentM86566d.setAction("com.xiaomi.mipush.ENABLE_PUSH_MESSAGE");
                        break;
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                        c14914he3.m87131c(EnumC14898gp.ThirdPartyRegUpdate.f62957a);
                        if (map != null) {
                            c14914he3.m87116a(map);
                        }
                        break;
                }
                ouq0.m169380D("type:" + enumC14874v + ", " + str);
                c14914he3.m87127b(C14867c.m86499c(this.f62447b).m86502d());
                c14914he3.m87135d(this.f62447b.getPackageName());
                enumC14888gf = EnumC14888gf.Notification;
                m86608y(c14914he3, enumC14888gf, false, null);
                if (z) {
                    c14914he.m87127b(C14867c.m86499c(this.f62447b).m86502d());
                    c14914he.m87135d(this.f62447b.getPackageName());
                    Context context = this.f62447b;
                    bArrM87448e = C14936m.m87448e(s5r0.m184807b(context, c14914he, enumC14888gf, false, context.getPackageName(), C14867c.m86499c(this.f62447b).m86502d()));
                    if (bArrM87448e != null) {
                        jxq0.m147394f(this.f62447b.getPackageName(), this.f62447b, c14914he, enumC14888gf, bArrM87448e.length);
                        intentM86566d.putExtra("mipush_payload", bArrM87448e);
                        intentM86566d.putExtra("com.xiaomi.mipush.MESSAGE_CACHE", true);
                        intentM86566d.putExtra("mipush_app_id", C14867c.m86499c(this.f62447b).m86502d());
                        intentM86566d.putExtra("mipush_app_token", C14867c.m86499c(this.f62447b).m86511m());
                        m86557U(intentM86566d);
                    }
                }
                messageObtain = Message.obtain();
                messageObtain.what = 19;
                int iOrdinal = enumC14874v.ordinal();
                messageObtain.obj = str;
                messageObtain.arg1 = iOrdinal;
                if (map != null && map.get("third_sync_reason") != null) {
                    Bundle bundle = new Bundle();
                    bundle.putString("third_sync_reason", map.get("third_sync_reason"));
                    messageObtain.setData(bundle);
                }
                this.f62450e.sendMessageDelayed(messageObtain, Constants.PN_IMAGE_DOWNLOAD_TIMEOUT_IN_MILLIS);
            }
            str = C14987aj.m87666a();
            c14914he3.m87114a(str);
            c14914he2 = z ? new C14914he(str, true) : null;
            synchronized (m5r0.class) {
                m5r0.m157115c(this.f62447b).m157119e(str);
            }
            c14914he = c14914he2;
            switch (e.f62461a[enumC14874v.ordinal()]) {
                case 1:
                    EnumC14898gp enumC14898gp3 = EnumC14898gp.DisablePushMessage;
                    c14914he3.m87131c(enumC14898gp3.f62957a);
                    c14914he.m87131c(enumC14898gp3.f62957a);
                    if (map != null) {
                        c14914he3.m87116a(map);
                        c14914he.m87116a(map);
                    }
                    intentM86566d.setAction("com.xiaomi.mipush.DISABLE_PUSH_MESSAGE");
                    break;
                case 2:
                    EnumC14898gp enumC14898gp4 = EnumC14898gp.EnablePushMessage;
                    c14914he3.m87131c(enumC14898gp4.f62957a);
                    c14914he.m87131c(enumC14898gp4.f62957a);
                    if (map != null) {
                        c14914he3.m87116a(map);
                        c14914he.m87116a(map);
                    }
                    intentM86566d.setAction("com.xiaomi.mipush.ENABLE_PUSH_MESSAGE");
                    break;
                case 3:
                case 4:
                case 5:
                case 6:
                    c14914he3.m87131c(EnumC14898gp.ThirdPartyRegUpdate.f62957a);
                    if (map != null) {
                        c14914he3.m87116a(map);
                    }
                    break;
            }
            ouq0.m169380D("type:" + enumC14874v + ", " + str);
            c14914he3.m87127b(C14867c.m86499c(this.f62447b).m86502d());
            c14914he3.m87135d(this.f62447b.getPackageName());
            enumC14888gf = EnumC14888gf.Notification;
            m86608y(c14914he3, enumC14888gf, false, null);
            if (z) {
                c14914he.m87127b(C14867c.m86499c(this.f62447b).m86502d());
                c14914he.m87135d(this.f62447b.getPackageName());
                Context context2 = this.f62447b;
                bArrM87448e = C14936m.m87448e(s5r0.m184807b(context2, c14914he, enumC14888gf, false, context2.getPackageName(), C14867c.m86499c(this.f62447b).m86502d()));
                if (bArrM87448e != null) {
                    jxq0.m147394f(this.f62447b.getPackageName(), this.f62447b, c14914he, enumC14888gf, bArrM87448e.length);
                    intentM86566d.putExtra("mipush_payload", bArrM87448e);
                    intentM86566d.putExtra("com.xiaomi.mipush.MESSAGE_CACHE", true);
                    intentM86566d.putExtra("mipush_app_id", C14867c.m86499c(this.f62447b).m86502d());
                    intentM86566d.putExtra("mipush_app_token", C14867c.m86499c(this.f62447b).m86511m());
                    m86557U(intentM86566d);
                }
            }
            messageObtain = Message.obtain();
            messageObtain.what = 19;
            int iOrdinal2 = enumC14874v.ordinal();
            messageObtain.obj = str;
            messageObtain.arg1 = iOrdinal2;
            if (map != null) {
                Bundle bundle2 = new Bundle();
                bundle2.putString("third_sync_reason", map.get("third_sync_reason"));
                messageObtain.setData(bundle2);
            }
            this.f62450e.sendMessageDelayed(messageObtain, Constants.PN_IMAGE_DOWNLOAD_TIMEOUT_IN_MILLIS);
        }
    }

    /* JADX INFO: renamed from: M */
    private Intent m86553M() {
        if (!"com.xiaomi.xmsf".equals(this.f62447b.getPackageName())) {
            return m86555R();
        }
        ouq0.m169406z("pushChannel xmsf create own channel");
        return m86563a0();
    }

    /* JADX INFO: renamed from: P */
    private void m86554P(Intent intent) {
        try {
            if (l4r0.m152824i() || Build.VERSION.SDK_INT < 26) {
                this.f62447b.startService(intent);
            } else {
                m86560Y(intent);
            }
        } catch (Exception e2) {
            ouq0.m169397q(e2);
        }
    }

    /* JADX INFO: renamed from: R */
    private Intent m86555R() {
        if (m86587J()) {
            ouq0.m169406z("pushChannel app start miui china channel");
            return m86559W();
        }
        ouq0.m169406z("pushChannel app start  own channel");
        return m86563a0();
    }

    /* JADX INFO: renamed from: T */
    private synchronized void m86556T(int i) {
        this.f62447b.getSharedPreferences(MiPushClient.PREF_EXTRA, 0).edit().putInt("service_boot_mode", i).commit();
    }

    /* JADX INFO: renamed from: U */
    private void m86557U(Intent intent) {
        C14985ah c14985ahM87648a = C14985ah.m87648a(this.f62447b);
        int iM86817a = EnumC14893gk.ServiceBootMode.m86817a();
        EnumC14889gg enumC14889gg = EnumC14889gg.START;
        int iM87652a = c14985ahM87648a.m87652a(iM86817a, enumC14889gg.m86772a());
        int iM86562a = m86562a();
        EnumC14889gg enumC14889gg2 = EnumC14889gg.BIND;
        boolean z = iM87652a == enumC14889gg2.m86772a() && f62444m;
        int iM86772a = z ? enumC14889gg2.m86772a() : enumC14889gg.m86772a();
        if (iM86772a != iM86562a) {
            m86588K(iM86772a);
        }
        if (z) {
            m86560Y(intent);
        } else {
            m86554P(intent);
        }
    }

    /* JADX INFO: renamed from: V */
    private boolean m86558V() {
        try {
            PackageInfo packageInfo = this.f62447b.getPackageManager().getPackageInfo("com.xiaomi.xmsf", 4);
            return packageInfo != null && packageInfo.versionCode >= 105;
        } catch (Throwable unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: W */
    private Intent m86559W() {
        Intent intent = new Intent();
        String packageName = this.f62447b.getPackageName();
        intent.setPackage("com.xiaomi.xmsf");
        intent.setClassName("com.xiaomi.xmsf", m86576k());
        intent.putExtra("mipush_app_package", packageName);
        m86570f0();
        return intent;
    }

    /* JADX INFO: renamed from: Y */
    private synchronized void m86560Y(Intent intent) {
        try {
            if (this.f62452g) {
                Message messageM86567e = m86567e(intent);
                if (this.f62451f.size() >= 50) {
                    this.f62451f.remove(0);
                }
                this.f62451f.add(messageM86567e);
                return;
            }
            if (this.f62449d == null) {
                this.f62447b.bindService(intent, new d(), 1);
                this.f62452g = true;
                this.f62451f.clear();
                this.f62451f.add(m86567e(intent));
            } else {
                try {
                    this.f62449d.send(m86567e(intent));
                } catch (RemoteException unused) {
                    this.f62449d = null;
                    this.f62452g = false;
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: Z */
    private boolean m86561Z() {
        if (m86587J()) {
            try {
                return this.f62447b.getPackageManager().getPackageInfo("com.xiaomi.xmsf", 4).versionCode >= 108;
            } catch (Exception unused) {
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: a */
    private synchronized int m86562a() {
        return this.f62447b.getSharedPreferences(MiPushClient.PREF_EXTRA, 0).getInt("service_boot_mode", -1);
    }

    /* JADX INFO: renamed from: a0 */
    private Intent m86563a0() {
        Intent intent = new Intent();
        String packageName = this.f62447b.getPackageName();
        m86572g0();
        intent.setComponent(new ComponentName(this.f62447b, "com.xiaomi.push.service.XMPushService"));
        intent.putExtra("mipush_app_package", packageName);
        return intent;
    }

    /* JADX INFO: renamed from: c0 */
    private boolean m86565c0() {
        String packageName = this.f62447b.getPackageName();
        return packageName.contains("miui") || packageName.contains(HardwareEarMonitorUtils.MANUFACTURER_XIAOMI) || (this.f62447b.getApplicationInfo().flags & 1) != 0;
    }

    /* JADX INFO: renamed from: d */
    private Intent m86566d() {
        return (!m86587J() || "com.xiaomi.xmsf".equals(this.f62447b.getPackageName())) ? m86563a0() : m86559W();
    }

    /* JADX INFO: renamed from: e */
    private Message m86567e(Intent intent) {
        Message messageObtain = Message.obtain();
        messageObtain.what = 17;
        messageObtain.obj = intent;
        return messageObtain;
    }

    /* JADX INFO: renamed from: e0 */
    private void m86568e0() {
        this.f62453h = SystemClock.elapsedRealtime();
    }

    /* JADX INFO: renamed from: f0 */
    private void m86570f0() {
        try {
            PackageManager packageManager = this.f62447b.getPackageManager();
            ComponentName componentName = new ComponentName(this.f62447b, "com.xiaomi.push.service.XMPushService");
            if (packageManager.getComponentEnabledSetting(componentName) == 2) {
                return;
            }
            packageManager.setComponentEnabledSetting(componentName, 2, 1);
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: renamed from: g0 */
    private void m86572g0() {
        try {
            PackageManager packageManager = this.f62447b.getPackageManager();
            ComponentName componentName = new ComponentName(this.f62447b, "com.xiaomi.push.service.XMPushService");
            if (packageManager.getComponentEnabledSetting(componentName) == 1) {
                return;
            }
            packageManager.setComponentEnabledSetting(componentName, 1, 1);
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: renamed from: h */
    public static synchronized C14870f m86573h(Context context) {
        try {
            if (f62443l == null) {
                f62443l = new C14870f(context);
            }
        } catch (Throwable th) {
            throw th;
        }
        return f62443l;
    }

    /* JADX INFO: renamed from: k */
    private String m86576k() {
        String str = this.f62454i;
        if (str != null) {
            return str;
        }
        try {
            if (this.f62447b.getPackageManager().getPackageInfo("com.xiaomi.xmsf", 4).versionCode >= 106) {
                this.f62454i = "com.xiaomi.push.service.XMPushService";
                return "com.xiaomi.push.service.XMPushService";
            }
        } catch (Exception unused) {
        }
        this.f62454i = "com.xiaomi.xmsf.push.service.XMPushService";
        return "com.xiaomi.xmsf.push.service.XMPushService";
    }

    /* JADX INFO: renamed from: A */
    public final <T extends InterfaceC14925hq<T, ?>> void m86579A(T t, EnumC14888gf enumC14888gf, boolean z, boolean z2, C14901gs c14901gs, boolean z3) {
        m86580B(t, enumC14888gf, z, z2, c14901gs, z3, this.f62447b.getPackageName(), C14867c.m86499c(this.f62447b).m86502d());
    }

    /* JADX INFO: renamed from: B */
    public final <T extends InterfaceC14925hq<T, ?>> void m86580B(T t, EnumC14888gf enumC14888gf, boolean z, boolean z2, C14901gs c14901gs, boolean z3, String str, String str2) {
        m86581C(t, enumC14888gf, z, z2, c14901gs, z3, str, str2, true);
    }

    /* JADX INFO: renamed from: C */
    public final <T extends InterfaceC14925hq<T, ?>> void m86581C(T t, EnumC14888gf enumC14888gf, boolean z, boolean z2, C14901gs c14901gs, boolean z3, String str, String str2, boolean z4) {
        m86582D(t, enumC14888gf, z, z2, c14901gs, z3, str, str2, z4, true);
    }

    /* JADX INFO: renamed from: D */
    public final <T extends InterfaceC14925hq<T, ?>> void m86582D(T t, EnumC14888gf enumC14888gf, boolean z, boolean z2, C14901gs c14901gs, boolean z3, String str, String str2, boolean z4, boolean z5) {
        if (z5 && !C14867c.m86499c(this.f62447b).m86516s()) {
            if (z2) {
                m86607x(t, enumC14888gf, z);
                return;
            } else {
                ouq0.m169393m("drop the message before initialization.");
                return;
            }
        }
        Context context = this.f62447b;
        C14911hb c14911hbM184807b = z4 ? s5r0.m184807b(context, t, enumC14888gf, z, str, str2) : s5r0.m184811f(context, t, enumC14888gf, z, str, str2);
        if (c14901gs != null) {
            c14911hbM184807b.m87079a(c14901gs);
        }
        byte[] bArrM87448e = C14936m.m87448e(c14911hbM184807b);
        if (bArrM87448e == null) {
            ouq0.m169393m("send message fail, because msgBytes is null.");
            return;
        }
        jxq0.m147394f(this.f62447b.getPackageName(), this.f62447b, t, enumC14888gf, bArrM87448e.length);
        Intent intentM86566d = m86566d();
        intentM86566d.setAction("com.xiaomi.mipush.SEND_MESSAGE");
        intentM86566d.putExtra("mipush_payload", bArrM87448e);
        intentM86566d.putExtra("com.xiaomi.mipush.MESSAGE_CACHE", z3);
        m86557U(intentM86566d);
    }

    /* JADX INFO: renamed from: E */
    public final void m86583E(String str, EnumC14874v enumC14874v, EnumC14868d enumC14868d, String str2) {
        m5r0.m157115c(this.f62447b).m157118d(enumC14874v, "syncing");
        HashMap<String, String> mapM161133e = n1r0.m161133e(this.f62447b, enumC14868d);
        mapM161133e.put("third_sync_reason", str2);
        m86551F(str, enumC14874v, false, mapM161133e);
    }

    /* JADX INFO: renamed from: G */
    public void m86584G(String str, String str2) {
        Intent intentM86566d = m86566d();
        intentM86566d.setAction("com.xiaomi.mipush.CLEAR_NOTIFICATION");
        intentM86566d.putExtra(AbstractC14991an.f63770F, this.f62447b.getPackageName());
        intentM86566d.putExtra(AbstractC14991an.f63776L, str);
        intentM86566d.putExtra(AbstractC14991an.f63777M, str2);
        m86557U(intentM86566d);
    }

    /* JADX INFO: renamed from: H */
    public final void m86585H(boolean z) {
        m86586I(z, null);
    }

    /* JADX INFO: renamed from: I */
    public final void m86586I(boolean z, String str) {
        Context context = this.f62447b;
        if (z) {
            m5r0 m5r0VarM157115c = m5r0.m157115c(context);
            EnumC14874v enumC14874v = EnumC14874v.DISABLE_PUSH;
            m5r0VarM157115c.m157118d(enumC14874v, "syncing");
            m5r0.m157115c(this.f62447b).m157118d(EnumC14874v.ENABLE_PUSH, "");
            m86551F(str, enumC14874v, true, null);
            return;
        }
        m5r0 m5r0VarM157115c2 = m5r0.m157115c(context);
        EnumC14874v enumC14874v2 = EnumC14874v.ENABLE_PUSH;
        m5r0VarM157115c2.m157118d(enumC14874v2, "syncing");
        m5r0.m157115c(this.f62447b).m157118d(EnumC14874v.DISABLE_PUSH, "");
        m86551F(str, enumC14874v2, true, null);
    }

    /* JADX INFO: renamed from: J */
    public boolean m86587J() {
        return this.f62446a && 1 == C14867c.m86499c(this.f62447b).m86501a();
    }

    /* JADX INFO: renamed from: K */
    public boolean m86588K(int i) {
        if (!C14867c.m86499c(this.f62447b).m86514p()) {
            return false;
        }
        m86556T(i);
        C14914he c14914he = new C14914he();
        c14914he.m87114a(C14987aj.m87666a());
        c14914he.m87127b(C14867c.m86499c(this.f62447b).m86502d());
        c14914he.m87135d(this.f62447b.getPackageName());
        c14914he.m87131c(EnumC14898gp.ClientABTest.f62957a);
        HashMap map = new HashMap();
        c14914he.f63229a = map;
        map.put("boot_mode", i + "");
        m86573h(this.f62447b).m86608y(c14914he, EnumC14888gf.Notification, false, null);
        return true;
    }

    /* JADX INFO: renamed from: N */
    public final void m86589N() {
        Intent intentM86566d = m86566d();
        intentM86566d.setAction("com.xiaomi.mipush.DISABLE_PUSH");
        m86557U(intentM86566d);
    }

    /* JADX INFO: renamed from: O */
    public void m86590O(int i) {
        Intent intentM86566d = m86566d();
        intentM86566d.setAction("com.xiaomi.mipush.SET_NOTIFICATION_TYPE");
        intentM86566d.putExtra(AbstractC14991an.f63770F, this.f62447b.getPackageName());
        intentM86566d.putExtra(AbstractC14991an.f63773I, i);
        intentM86566d.putExtra(AbstractC14991an.f63775K, zuq0.m221703d(this.f62447b.getPackageName() + i));
        m86557U(intentM86566d);
    }

    /* JADX INFO: renamed from: Q */
    public boolean m86591Q() {
        if (!m86587J() || !m86565c0()) {
            return true;
        }
        if (this.f62456k == null) {
            Integer numValueOf = Integer.valueOf(C14993ap.m87713a(this.f62447b).m87714a());
            this.f62456k = numValueOf;
            if (numValueOf.intValue() == 0) {
                this.f62447b.getContentResolver().registerContentObserver(C14993ap.m87713a(this.f62447b).m87715a(), false, new c(new Handler(Looper.getMainLooper())));
            }
        }
        return this.f62456k.intValue() != 0;
    }

    /* JADX INFO: renamed from: S */
    public void m86592S() {
        if (this.f62455j != null) {
            m86568e0();
            m86557U(this.f62455j);
            this.f62455j = null;
        }
    }

    /* JADX INFO: renamed from: X */
    public void m86593X() {
        ArrayList<f> arrayList = f62445n;
        synchronized (arrayList) {
            boolean z = Thread.currentThread() == Looper.getMainLooper().getThread();
            for (f fVar : arrayList) {
                C14870f c14870f = this;
                c14870f.m86579A(fVar.f62462a, fVar.f62463b, fVar.f62464c, false, null, true);
                if (!z) {
                    try {
                        Thread.sleep(100L);
                    } catch (InterruptedException unused) {
                    }
                }
                this = c14870f;
            }
            f62445n.clear();
        }
    }

    /* JADX INFO: renamed from: b */
    public long m86594b() {
        return this.f62453h;
    }

    /* JADX INFO: renamed from: b0 */
    public void m86595b0() {
        Intent intentM86566d = m86566d();
        intentM86566d.setAction("com.xiaomi.mipush.CLEAR_HEADSUPNOTIFICATION");
        Application application = (Application) otq0.m169169g("android.app.ActivityThread", "currentApplication", new Object[0]);
        String packageName = (application == null || application.getApplicationContext() == null) ? null : application.getApplicationContext().getPackageName();
        String packageName2 = this.f62447b.getPackageName();
        if (TextUtils.isEmpty(packageName) || packageName.equals(packageName2)) {
            packageName = packageName2;
        } else {
            ouq0.m169393m("application package name: " + packageName + ", not equals context package name: " + packageName2);
        }
        intentM86566d.putExtra(AbstractC14991an.f63770F, packageName);
        m86557U(intentM86566d);
    }

    /* JADX INFO: renamed from: d0 */
    public void m86596d0() {
        Intent intentM86566d = m86566d();
        intentM86566d.setAction("com.xiaomi.mipush.SET_NOTIFICATION_TYPE");
        intentM86566d.putExtra(AbstractC14991an.f63770F, this.f62447b.getPackageName());
        intentM86566d.putExtra(AbstractC14991an.f63775K, zuq0.m221703d(this.f62447b.getPackageName()));
        m86557U(intentM86566d);
    }

    /* JADX INFO: renamed from: m */
    public void m86597m() {
        m86554P(m86566d());
    }

    /* JADX INFO: renamed from: n */
    public void m86598n(int i) {
        m86599o(i, 0);
    }

    /* JADX INFO: renamed from: o */
    public void m86599o(int i, int i2) {
        Intent intentM86566d = m86566d();
        intentM86566d.setAction("com.xiaomi.mipush.CLEAR_NOTIFICATION");
        intentM86566d.putExtra(AbstractC14991an.f63770F, this.f62447b.getPackageName());
        intentM86566d.putExtra(AbstractC14991an.f63771G, i);
        intentM86566d.putExtra(AbstractC14991an.f63772H, i2);
        m86557U(intentM86566d);
    }

    /* JADX INFO: renamed from: p */
    public void m86600p(int i, String str) {
        Intent intentM86566d = m86566d();
        intentM86566d.setAction("com.xiaomi.mipush.thirdparty");
        intentM86566d.putExtra("com.xiaomi.mipush.thirdparty_LEVEL", i);
        intentM86566d.putExtra("com.xiaomi.mipush.thirdparty_DESC", str);
        m86554P(intentM86566d);
    }

    /* JADX INFO: renamed from: q */
    public void m86601q(Context context) {
        if (l4r0.m152824i()) {
            return;
        }
        EnumC14873q enumC14873qM123794a = f3r0.m123794a(context);
        if (EnumC14873q.HUAWEI.equals(enumC14873qM123794a)) {
            m86583E(null, EnumC14874v.UPLOAD_HUAWEI_TOKEN, EnumC14868d.ASSEMBLE_PUSH_HUAWEI, "update");
        }
        if (EnumC14873q.OPPO.equals(enumC14873qM123794a)) {
            m86583E(null, EnumC14874v.UPLOAD_COS_TOKEN, EnumC14868d.ASSEMBLE_PUSH_COS, "update");
        }
        if (EnumC14873q.VIVO.equals(enumC14873qM123794a)) {
            m86583E(null, EnumC14874v.UPLOAD_FTOS_TOKEN, EnumC14868d.ASSEMBLE_PUSH_FTOS, "update");
        }
    }

    /* JADX INFO: renamed from: r */
    public void m86602r(Intent intent) {
        intent.fillIn(m86566d(), 24);
        m86557U(intent);
    }

    /* JADX INFO: renamed from: t */
    public final void m86603t(C14892gj c14892gj) {
        Intent intentM86566d = m86566d();
        byte[] bArrM87448e = C14936m.m87448e(c14892gj);
        if (bArrM87448e == null) {
            ouq0.m169393m("send TinyData failed, because tinyDataBytes is null.");
            return;
        }
        intentM86566d.setAction("com.xiaomi.mipush.SEND_TINYDATA");
        intentM86566d.putExtra("mipush_payload", bArrM87448e);
        m86554P(intentM86566d);
    }

    /* JADX INFO: renamed from: u */
    public final void m86604u(C14915hf c14915hf, boolean z) {
        tzq0.m193695a(this.f62447b.getApplicationContext()).m193701f(this.f62447b.getPackageName(), "E100003", c14915hf.m87156a(), 6001, null);
        this.f62455j = null;
        C14867c.m86499c(this.f62447b).f62419d = c14915hf.m87156a();
        Intent intentM86566d = m86566d();
        byte[] bArrM87448e = C14936m.m87448e(s5r0.m184806a(this.f62447b, c14915hf, EnumC14888gf.Registration));
        if (bArrM87448e == null) {
            ouq0.m169393m("register fail, because msgBytes is null.");
            return;
        }
        intentM86566d.setAction("com.xiaomi.mipush.REGISTER_APP");
        intentM86566d.putExtra("mipush_app_id", C14867c.m86499c(this.f62447b).m86502d());
        intentM86566d.putExtra("mipush_payload", bArrM87448e);
        intentM86566d.putExtra("mipush_session", this.f62448c);
        intentM86566d.putExtra("mipush_env_chanage", z);
        intentM86566d.putExtra("mipush_env_type", C14867c.m86499c(this.f62447b).m86501a());
        if (!mtq0.m160044t(this.f62447b) || !m86591Q()) {
            this.f62455j = intentM86566d;
        } else {
            m86568e0();
            m86557U(intentM86566d);
        }
    }

    /* JADX INFO: renamed from: v */
    public final void m86605v(C14921hl c14921hl) {
        byte[] bArrM87448e = C14936m.m87448e(s5r0.m184806a(this.f62447b, c14921hl, EnumC14888gf.UnRegistration));
        if (bArrM87448e == null) {
            ouq0.m169393m("unregister fail, because msgBytes is null.");
            return;
        }
        Intent intentM86566d = m86566d();
        intentM86566d.setAction("com.xiaomi.mipush.UNREGISTER_APP");
        intentM86566d.putExtra("mipush_app_id", C14867c.m86499c(this.f62447b).m86502d());
        intentM86566d.putExtra("mipush_payload", bArrM87448e);
        m86557U(intentM86566d);
    }

    /* JADX INFO: renamed from: w */
    public final <T extends InterfaceC14925hq<T, ?>> void m86606w(T t, EnumC14888gf enumC14888gf, C14901gs c14901gs) {
        m86608y(t, enumC14888gf, !enumC14888gf.equals(EnumC14888gf.Registration), c14901gs);
    }

    /* JADX INFO: renamed from: x */
    public <T extends InterfaceC14925hq<T, ?>> void m86607x(T t, EnumC14888gf enumC14888gf, boolean z) {
        f fVar = new f();
        fVar.f62462a = t;
        fVar.f62463b = enumC14888gf;
        fVar.f62464c = z;
        ArrayList<f> arrayList = f62445n;
        synchronized (arrayList) {
            try {
                arrayList.add(fVar);
                if (arrayList.size() > 10) {
                    arrayList.remove(0);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: y */
    public final <T extends InterfaceC14925hq<T, ?>> void m86608y(T t, EnumC14888gf enumC14888gf, boolean z, C14901gs c14901gs) {
        m86579A(t, enumC14888gf, z, true, c14901gs, true);
    }

    /* JADX INFO: renamed from: z */
    public final <T extends InterfaceC14925hq<T, ?>> void m86609z(T t, EnumC14888gf enumC14888gf, boolean z, C14901gs c14901gs, boolean z2) {
        m86579A(t, enumC14888gf, z, true, c14901gs, z2);
    }
}
