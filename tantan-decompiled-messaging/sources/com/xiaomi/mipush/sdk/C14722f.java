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
import com.xiaomi.push.C14744gj;
import com.xiaomi.push.C14753gs;
import com.xiaomi.push.C14763hb;
import com.xiaomi.push.C14766he;
import com.xiaomi.push.C14767hf;
import com.xiaomi.push.C14773hl;
import com.xiaomi.push.C14788m;
import com.xiaomi.push.EnumC14740gf;
import com.xiaomi.push.EnumC14741gg;
import com.xiaomi.push.EnumC14745gk;
import com.xiaomi.push.EnumC14750gp;
import com.xiaomi.push.InterfaceC14777hq;
import com.xiaomi.push.service.AbstractC14843an;
import com.xiaomi.push.service.C14837ah;
import com.xiaomi.push.service.C14839aj;
import com.xiaomi.push.service.C14845ap;
import com.xiaomi.push.service.C14865g;
import io.agora.base.internal.voiceengine.earmonitor.HardwareEarMonitorUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import p149l.doq0;
import p149l.fvq0;
import p149l.gkq0;
import p149l.gwq0;
import p149l.hsq0;
import p149l.ikq0;
import p149l.ilq0;
import p149l.mwq0;
import p149l.nqq0;
import p149l.tlq0;
import p149l.ztq0;

/* JADX INFO: renamed from: com.xiaomi.mipush.sdk.f */
/* JADX INFO: loaded from: classes2.dex */
public class C14722f {

    /* JADX INFO: renamed from: l */
    private static C14722f f61596l = null;

    /* JADX INFO: renamed from: m */
    private static boolean f61597m = false;

    /* JADX INFO: renamed from: n */
    private static final ArrayList<f> f61598n = new ArrayList<>();

    /* JADX INFO: renamed from: a */
    private boolean f61599a;

    /* JADX INFO: renamed from: b */
    private Context f61600b;

    /* JADX INFO: renamed from: d */
    private Messenger f61602d;

    /* JADX INFO: renamed from: e */
    private Handler f61603e;

    /* JADX INFO: renamed from: h */
    private long f61606h;

    /* JADX INFO: renamed from: f */
    private List<Message> f61604f = new ArrayList();

    /* JADX INFO: renamed from: g */
    private boolean f61605g = false;

    /* JADX INFO: renamed from: i */
    private String f61607i = null;

    /* JADX INFO: renamed from: j */
    private Intent f61608j = null;

    /* JADX INFO: renamed from: k */
    private Integer f61609k = null;

    /* JADX INFO: renamed from: c */
    private String f61601c = null;

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
            synchronized (gwq0.class) {
                try {
                    if (gwq0.m128497c(C14722f.this.f61600b).m128502f(str)) {
                        if (gwq0.m128497c(C14722f.this.f61600b).m128498a(str) < 10) {
                            String string = message.getData() != null ? message.getData().getString("third_sync_reason") : "";
                            EnumC14726v enumC14726v = EnumC14726v.DISABLE_PUSH;
                            if (enumC14726v.ordinal() == i && "syncing".equals(gwq0.m128497c(C14722f.this.f61600b).m128499b(enumC14726v))) {
                                C14722f.this.m85380F(str, enumC14726v, true, null);
                            } else {
                                EnumC14726v enumC14726v2 = EnumC14726v.ENABLE_PUSH;
                                if (enumC14726v2.ordinal() == i && "syncing".equals(gwq0.m128497c(C14722f.this.f61600b).m128499b(enumC14726v2))) {
                                    C14722f.this.m85380F(str, enumC14726v2, true, null);
                                } else {
                                    EnumC14726v enumC14726v3 = EnumC14726v.UPLOAD_HUAWEI_TOKEN;
                                    if (enumC14726v3.ordinal() == i && "syncing".equals(gwq0.m128497c(C14722f.this.f61600b).m128499b(enumC14726v3))) {
                                        HashMap<String, String> mapM132791e = hsq0.m132791e(C14722f.this.f61600b, EnumC14720d.ASSEMBLE_PUSH_HUAWEI);
                                        mapM132791e.put("third_sync_reason", string);
                                        C14722f.this.m85380F(str, enumC14726v3, false, mapM132791e);
                                    } else {
                                        EnumC14726v enumC14726v4 = EnumC14726v.UPLOAD_FCM_TOKEN;
                                        if (enumC14726v4.ordinal() == i && "syncing".equals(gwq0.m128497c(C14722f.this.f61600b).m128499b(enumC14726v4))) {
                                            C14722f c14722f = C14722f.this;
                                            c14722f.m85380F(str, enumC14726v4, false, hsq0.m132791e(c14722f.f61600b, EnumC14720d.ASSEMBLE_PUSH_FCM));
                                        } else {
                                            EnumC14726v enumC14726v5 = EnumC14726v.UPLOAD_COS_TOKEN;
                                            if (enumC14726v5.ordinal() == i && "syncing".equals(gwq0.m128497c(C14722f.this.f61600b).m128499b(enumC14726v5))) {
                                                HashMap<String, String> mapM132791e2 = hsq0.m132791e(C14722f.this.f61600b, EnumC14720d.ASSEMBLE_PUSH_COS);
                                                mapM132791e2.put("third_sync_reason", string);
                                                C14722f.this.m85380F(str, enumC14726v5, false, mapM132791e2);
                                            } else {
                                                EnumC14726v enumC14726v6 = EnumC14726v.UPLOAD_FTOS_TOKEN;
                                                if (enumC14726v6.ordinal() == i && "syncing".equals(gwq0.m128497c(C14722f.this.f61600b).m128499b(enumC14726v6))) {
                                                    HashMap<String, String> mapM132791e3 = hsq0.m132791e(C14722f.this.f61600b, EnumC14720d.ASSEMBLE_PUSH_FTOS);
                                                    mapM132791e3.put("third_sync_reason", string);
                                                    C14722f.this.m85380F(str, enumC14726v6, false, mapM132791e3);
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                            gwq0.m128497c(C14722f.this.f61600b).m128503g(str);
                        } else {
                            gwq0.m128497c(C14722f.this.f61600b).m128504h(str);
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.mipush.sdk.f$b */
    public class b implements C14865g.b {
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
            C14722f c14722f = C14722f.this;
            c14722f.f61609k = Integer.valueOf(C14845ap.m86542a(c14722f.f61600b).m86543a());
            if (C14722f.this.f61609k.intValue() != 0) {
                C14722f.this.f61600b.getContentResolver().unregisterContentObserver(this);
                if (gkq0.m126691t(C14722f.this.f61600b)) {
                    C14722f.this.m85421S();
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
            synchronized (C14722f.this) {
                C14722f.this.f61602d = new Messenger(iBinder);
                C14722f.this.f61605g = false;
                Iterator it = C14722f.this.f61604f.iterator();
                while (it.hasNext()) {
                    try {
                        C14722f.this.f61602d.send((Message) it.next());
                    } catch (RemoteException e) {
                        ilq0.m137044q(e);
                    }
                }
                C14722f.this.f61604f.clear();
            }
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
            C14722f.this.f61602d = null;
            C14722f.this.f61605g = false;
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.mipush.sdk.f$e */
    public static /* synthetic */ class e {

        /* JADX INFO: renamed from: a */
        static final /* synthetic */ int[] f61614a;

        static {
            int[] iArr = new int[EnumC14726v.values().length];
            f61614a = iArr;
            try {
                iArr[EnumC14726v.DISABLE_PUSH.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f61614a[EnumC14726v.ENABLE_PUSH.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f61614a[EnumC14726v.UPLOAD_HUAWEI_TOKEN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f61614a[EnumC14726v.UPLOAD_FCM_TOKEN.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f61614a[EnumC14726v.UPLOAD_COS_TOKEN.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f61614a[EnumC14726v.UPLOAD_FTOS_TOKEN.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.mipush.sdk.f$f */
    public static class f<T extends InterfaceC14777hq<T, ?>> {

        /* JADX INFO: renamed from: a */
        T f61615a;

        /* JADX INFO: renamed from: b */
        EnumC14740gf f61616b;

        /* JADX INFO: renamed from: c */
        boolean f61617c;
    }

    private C14722f(Context context) {
        this.f61599a = false;
        this.f61603e = null;
        this.f61600b = context.getApplicationContext();
        this.f61599a = m85387V();
        f61597m = m85390Z();
        this.f61603e = new a(Looper.getMainLooper());
        if (fvq0.m123356j(context)) {
            C14865g.m86655a(new b());
        }
        Intent intentM85382M = m85382M();
        if (intentM85382M != null) {
            m85383P(intentM85382M);
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
    public void m85380F(String str, EnumC14726v enumC14726v, boolean z, HashMap<String, String> map) {
        C14766he c14766he;
        C14766he c14766he2;
        EnumC14740gf enumC14740gf;
        Message messageObtain;
        byte[] bArrM86277e;
        if (C14719c.m85328c(this.f61600b).m85343p() && gkq0.m126691t(this.f61600b)) {
            C14766he c14766he3 = new C14766he();
            c14766he3.m85946a(true);
            Intent intentM85395d = m85395d();
            if (!TextUtils.isEmpty(str)) {
                c14766he3.m85943a(str);
                if (z) {
                    c14766he2 = new C14766he(str, true);
                } else {
                    c14766he = null;
                }
                switch (e.f61614a[enumC14726v.ordinal()]) {
                    case 1:
                        EnumC14750gp enumC14750gp = EnumC14750gp.DisablePushMessage;
                        c14766he3.m85960c(enumC14750gp.f62110a);
                        c14766he.m85960c(enumC14750gp.f62110a);
                        if (map != null) {
                            c14766he3.m85945a(map);
                            c14766he.m85945a(map);
                        }
                        intentM85395d.setAction("com.xiaomi.mipush.DISABLE_PUSH_MESSAGE");
                        break;
                    case 2:
                        EnumC14750gp enumC14750gp2 = EnumC14750gp.EnablePushMessage;
                        c14766he3.m85960c(enumC14750gp2.f62110a);
                        c14766he.m85960c(enumC14750gp2.f62110a);
                        if (map != null) {
                            c14766he3.m85945a(map);
                            c14766he.m85945a(map);
                        }
                        intentM85395d.setAction("com.xiaomi.mipush.ENABLE_PUSH_MESSAGE");
                        break;
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                        c14766he3.m85960c(EnumC14750gp.ThirdPartyRegUpdate.f62110a);
                        if (map != null) {
                            c14766he3.m85945a(map);
                        }
                        break;
                }
                ilq0.m137027D("type:" + enumC14726v + ", " + str);
                c14766he3.m85956b(C14719c.m85328c(this.f61600b).m85331d());
                c14766he3.m85964d(this.f61600b.getPackageName());
                enumC14740gf = EnumC14740gf.Notification;
                m85437y(c14766he3, enumC14740gf, false, null);
                if (z) {
                    c14766he.m85956b(C14719c.m85328c(this.f61600b).m85331d());
                    c14766he.m85964d(this.f61600b.getPackageName());
                    Context context = this.f61600b;
                    bArrM86277e = C14788m.m86277e(mwq0.m156760b(context, c14766he, enumC14740gf, false, context.getPackageName(), C14719c.m85328c(this.f61600b).m85331d()));
                    if (bArrM86277e != null) {
                        doq0.m112824f(this.f61600b.getPackageName(), this.f61600b, c14766he, enumC14740gf, bArrM86277e.length);
                        intentM85395d.putExtra("mipush_payload", bArrM86277e);
                        intentM85395d.putExtra("com.xiaomi.mipush.MESSAGE_CACHE", true);
                        intentM85395d.putExtra("mipush_app_id", C14719c.m85328c(this.f61600b).m85331d());
                        intentM85395d.putExtra("mipush_app_token", C14719c.m85328c(this.f61600b).m85340m());
                        m85386U(intentM85395d);
                    }
                }
                messageObtain = Message.obtain();
                messageObtain.what = 19;
                int iOrdinal = enumC14726v.ordinal();
                messageObtain.obj = str;
                messageObtain.arg1 = iOrdinal;
                if (map != null && map.get("third_sync_reason") != null) {
                    Bundle bundle = new Bundle();
                    bundle.putString("third_sync_reason", map.get("third_sync_reason"));
                    messageObtain.setData(bundle);
                }
                this.f61603e.sendMessageDelayed(messageObtain, Constants.PN_IMAGE_DOWNLOAD_TIMEOUT_IN_MILLIS);
            }
            str = C14839aj.m86495a();
            c14766he3.m85943a(str);
            c14766he2 = z ? new C14766he(str, true) : null;
            synchronized (gwq0.class) {
                gwq0.m128497c(this.f61600b).m128501e(str);
            }
            c14766he = c14766he2;
            switch (e.f61614a[enumC14726v.ordinal()]) {
                case 1:
                    EnumC14750gp enumC14750gp3 = EnumC14750gp.DisablePushMessage;
                    c14766he3.m85960c(enumC14750gp3.f62110a);
                    c14766he.m85960c(enumC14750gp3.f62110a);
                    if (map != null) {
                        c14766he3.m85945a(map);
                        c14766he.m85945a(map);
                    }
                    intentM85395d.setAction("com.xiaomi.mipush.DISABLE_PUSH_MESSAGE");
                    break;
                case 2:
                    EnumC14750gp enumC14750gp4 = EnumC14750gp.EnablePushMessage;
                    c14766he3.m85960c(enumC14750gp4.f62110a);
                    c14766he.m85960c(enumC14750gp4.f62110a);
                    if (map != null) {
                        c14766he3.m85945a(map);
                        c14766he.m85945a(map);
                    }
                    intentM85395d.setAction("com.xiaomi.mipush.ENABLE_PUSH_MESSAGE");
                    break;
                case 3:
                case 4:
                case 5:
                case 6:
                    c14766he3.m85960c(EnumC14750gp.ThirdPartyRegUpdate.f62110a);
                    if (map != null) {
                        c14766he3.m85945a(map);
                    }
                    break;
            }
            ilq0.m137027D("type:" + enumC14726v + ", " + str);
            c14766he3.m85956b(C14719c.m85328c(this.f61600b).m85331d());
            c14766he3.m85964d(this.f61600b.getPackageName());
            enumC14740gf = EnumC14740gf.Notification;
            m85437y(c14766he3, enumC14740gf, false, null);
            if (z) {
                c14766he.m85956b(C14719c.m85328c(this.f61600b).m85331d());
                c14766he.m85964d(this.f61600b.getPackageName());
                Context context2 = this.f61600b;
                bArrM86277e = C14788m.m86277e(mwq0.m156760b(context2, c14766he, enumC14740gf, false, context2.getPackageName(), C14719c.m85328c(this.f61600b).m85331d()));
                if (bArrM86277e != null) {
                    doq0.m112824f(this.f61600b.getPackageName(), this.f61600b, c14766he, enumC14740gf, bArrM86277e.length);
                    intentM85395d.putExtra("mipush_payload", bArrM86277e);
                    intentM85395d.putExtra("com.xiaomi.mipush.MESSAGE_CACHE", true);
                    intentM85395d.putExtra("mipush_app_id", C14719c.m85328c(this.f61600b).m85331d());
                    intentM85395d.putExtra("mipush_app_token", C14719c.m85328c(this.f61600b).m85340m());
                    m85386U(intentM85395d);
                }
            }
            messageObtain = Message.obtain();
            messageObtain.what = 19;
            int iOrdinal2 = enumC14726v.ordinal();
            messageObtain.obj = str;
            messageObtain.arg1 = iOrdinal2;
            if (map != null) {
                Bundle bundle2 = new Bundle();
                bundle2.putString("third_sync_reason", map.get("third_sync_reason"));
                messageObtain.setData(bundle2);
            }
            this.f61603e.sendMessageDelayed(messageObtain, Constants.PN_IMAGE_DOWNLOAD_TIMEOUT_IN_MILLIS);
        }
    }

    /* JADX INFO: renamed from: M */
    private Intent m85382M() {
        if (!"com.xiaomi.xmsf".equals(this.f61600b.getPackageName())) {
            return m85384R();
        }
        ilq0.m137053z("pushChannel xmsf create own channel");
        return m85392a0();
    }

    /* JADX INFO: renamed from: P */
    private void m85383P(Intent intent) {
        try {
            if (fvq0.m123355i() || Build.VERSION.SDK_INT < 26) {
                this.f61600b.startService(intent);
            } else {
                m85389Y(intent);
            }
        } catch (Exception e2) {
            ilq0.m137044q(e2);
        }
    }

    /* JADX INFO: renamed from: R */
    private Intent m85384R() {
        if (m85416J()) {
            ilq0.m137053z("pushChannel app start miui china channel");
            return m85388W();
        }
        ilq0.m137053z("pushChannel app start  own channel");
        return m85392a0();
    }

    /* JADX INFO: renamed from: T */
    private synchronized void m85385T(int i) {
        this.f61600b.getSharedPreferences(MiPushClient.PREF_EXTRA, 0).edit().putInt("service_boot_mode", i).commit();
    }

    /* JADX INFO: renamed from: U */
    private void m85386U(Intent intent) {
        C14837ah c14837ahM86477a = C14837ah.m86477a(this.f61600b);
        int iM85646a = EnumC14745gk.ServiceBootMode.m85646a();
        EnumC14741gg enumC14741gg = EnumC14741gg.START;
        int iM86481a = c14837ahM86477a.m86481a(iM85646a, enumC14741gg.m85601a());
        int iM85391a = m85391a();
        EnumC14741gg enumC14741gg2 = EnumC14741gg.BIND;
        boolean z = iM86481a == enumC14741gg2.m85601a() && f61597m;
        int iM85601a = z ? enumC14741gg2.m85601a() : enumC14741gg.m85601a();
        if (iM85601a != iM85391a) {
            m85417K(iM85601a);
        }
        if (z) {
            m85389Y(intent);
        } else {
            m85383P(intent);
        }
    }

    /* JADX INFO: renamed from: V */
    private boolean m85387V() {
        try {
            PackageInfo packageInfo = this.f61600b.getPackageManager().getPackageInfo("com.xiaomi.xmsf", 4);
            return packageInfo != null && packageInfo.versionCode >= 105;
        } catch (Throwable unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: W */
    private Intent m85388W() {
        Intent intent = new Intent();
        String packageName = this.f61600b.getPackageName();
        intent.setPackage("com.xiaomi.xmsf");
        intent.setClassName("com.xiaomi.xmsf", m85405k());
        intent.putExtra("mipush_app_package", packageName);
        m85399f0();
        return intent;
    }

    /* JADX INFO: renamed from: Y */
    private synchronized void m85389Y(Intent intent) {
        try {
            if (this.f61605g) {
                Message messageM85396e = m85396e(intent);
                if (this.f61604f.size() >= 50) {
                    this.f61604f.remove(0);
                }
                this.f61604f.add(messageM85396e);
                return;
            }
            if (this.f61602d == null) {
                this.f61600b.bindService(intent, new d(), 1);
                this.f61605g = true;
                this.f61604f.clear();
                this.f61604f.add(m85396e(intent));
            } else {
                try {
                    this.f61602d.send(m85396e(intent));
                } catch (RemoteException unused) {
                    this.f61602d = null;
                    this.f61605g = false;
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: Z */
    private boolean m85390Z() {
        if (m85416J()) {
            try {
                return this.f61600b.getPackageManager().getPackageInfo("com.xiaomi.xmsf", 4).versionCode >= 108;
            } catch (Exception unused) {
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: a */
    private synchronized int m85391a() {
        return this.f61600b.getSharedPreferences(MiPushClient.PREF_EXTRA, 0).getInt("service_boot_mode", -1);
    }

    /* JADX INFO: renamed from: a0 */
    private Intent m85392a0() {
        Intent intent = new Intent();
        String packageName = this.f61600b.getPackageName();
        m85401g0();
        intent.setComponent(new ComponentName(this.f61600b, "com.xiaomi.push.service.XMPushService"));
        intent.putExtra("mipush_app_package", packageName);
        return intent;
    }

    /* JADX INFO: renamed from: c0 */
    private boolean m85394c0() {
        String packageName = this.f61600b.getPackageName();
        return packageName.contains("miui") || packageName.contains(HardwareEarMonitorUtils.MANUFACTURER_XIAOMI) || (this.f61600b.getApplicationInfo().flags & 1) != 0;
    }

    /* JADX INFO: renamed from: d */
    private Intent m85395d() {
        return (!m85416J() || "com.xiaomi.xmsf".equals(this.f61600b.getPackageName())) ? m85392a0() : m85388W();
    }

    /* JADX INFO: renamed from: e */
    private Message m85396e(Intent intent) {
        Message messageObtain = Message.obtain();
        messageObtain.what = 17;
        messageObtain.obj = intent;
        return messageObtain;
    }

    /* JADX INFO: renamed from: e0 */
    private void m85397e0() {
        this.f61606h = SystemClock.elapsedRealtime();
    }

    /* JADX INFO: renamed from: f0 */
    private void m85399f0() {
        try {
            PackageManager packageManager = this.f61600b.getPackageManager();
            ComponentName componentName = new ComponentName(this.f61600b, "com.xiaomi.push.service.XMPushService");
            if (packageManager.getComponentEnabledSetting(componentName) == 2) {
                return;
            }
            packageManager.setComponentEnabledSetting(componentName, 2, 1);
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: renamed from: g0 */
    private void m85401g0() {
        try {
            PackageManager packageManager = this.f61600b.getPackageManager();
            ComponentName componentName = new ComponentName(this.f61600b, "com.xiaomi.push.service.XMPushService");
            if (packageManager.getComponentEnabledSetting(componentName) == 1) {
                return;
            }
            packageManager.setComponentEnabledSetting(componentName, 1, 1);
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: renamed from: h */
    public static synchronized C14722f m85402h(Context context) {
        try {
            if (f61596l == null) {
                f61596l = new C14722f(context);
            }
        } catch (Throwable th) {
            throw th;
        }
        return f61596l;
    }

    /* JADX INFO: renamed from: k */
    private String m85405k() {
        String str = this.f61607i;
        if (str != null) {
            return str;
        }
        try {
            if (this.f61600b.getPackageManager().getPackageInfo("com.xiaomi.xmsf", 4).versionCode >= 106) {
                this.f61607i = "com.xiaomi.push.service.XMPushService";
                return "com.xiaomi.push.service.XMPushService";
            }
        } catch (Exception unused) {
        }
        this.f61607i = "com.xiaomi.xmsf.push.service.XMPushService";
        return "com.xiaomi.xmsf.push.service.XMPushService";
    }

    /* JADX INFO: renamed from: A */
    public final <T extends InterfaceC14777hq<T, ?>> void m85408A(T t, EnumC14740gf enumC14740gf, boolean z, boolean z2, C14753gs c14753gs, boolean z3) {
        m85409B(t, enumC14740gf, z, z2, c14753gs, z3, this.f61600b.getPackageName(), C14719c.m85328c(this.f61600b).m85331d());
    }

    /* JADX INFO: renamed from: B */
    public final <T extends InterfaceC14777hq<T, ?>> void m85409B(T t, EnumC14740gf enumC14740gf, boolean z, boolean z2, C14753gs c14753gs, boolean z3, String str, String str2) {
        m85410C(t, enumC14740gf, z, z2, c14753gs, z3, str, str2, true);
    }

    /* JADX INFO: renamed from: C */
    public final <T extends InterfaceC14777hq<T, ?>> void m85410C(T t, EnumC14740gf enumC14740gf, boolean z, boolean z2, C14753gs c14753gs, boolean z3, String str, String str2, boolean z4) {
        m85411D(t, enumC14740gf, z, z2, c14753gs, z3, str, str2, z4, true);
    }

    /* JADX INFO: renamed from: D */
    public final <T extends InterfaceC14777hq<T, ?>> void m85411D(T t, EnumC14740gf enumC14740gf, boolean z, boolean z2, C14753gs c14753gs, boolean z3, String str, String str2, boolean z4, boolean z5) {
        if (z5 && !C14719c.m85328c(this.f61600b).m85345s()) {
            if (z2) {
                m85436x(t, enumC14740gf, z);
                return;
            } else {
                ilq0.m137040m("drop the message before initialization.");
                return;
            }
        }
        Context context = this.f61600b;
        C14763hb c14763hbM156760b = z4 ? mwq0.m156760b(context, t, enumC14740gf, z, str, str2) : mwq0.m156764f(context, t, enumC14740gf, z, str, str2);
        if (c14753gs != null) {
            c14763hbM156760b.m85908a(c14753gs);
        }
        byte[] bArrM86277e = C14788m.m86277e(c14763hbM156760b);
        if (bArrM86277e == null) {
            ilq0.m137040m("send message fail, because msgBytes is null.");
            return;
        }
        doq0.m112824f(this.f61600b.getPackageName(), this.f61600b, t, enumC14740gf, bArrM86277e.length);
        Intent intentM85395d = m85395d();
        intentM85395d.setAction("com.xiaomi.mipush.SEND_MESSAGE");
        intentM85395d.putExtra("mipush_payload", bArrM86277e);
        intentM85395d.putExtra("com.xiaomi.mipush.MESSAGE_CACHE", z3);
        m85386U(intentM85395d);
    }

    /* JADX INFO: renamed from: E */
    public final void m85412E(String str, EnumC14726v enumC14726v, EnumC14720d enumC14720d, String str2) {
        gwq0.m128497c(this.f61600b).m128500d(enumC14726v, "syncing");
        HashMap<String, String> mapM132791e = hsq0.m132791e(this.f61600b, enumC14720d);
        mapM132791e.put("third_sync_reason", str2);
        m85380F(str, enumC14726v, false, mapM132791e);
    }

    /* JADX INFO: renamed from: G */
    public void m85413G(String str, String str2) {
        Intent intentM85395d = m85395d();
        intentM85395d.setAction("com.xiaomi.mipush.CLEAR_NOTIFICATION");
        intentM85395d.putExtra(AbstractC14843an.f62923F, this.f61600b.getPackageName());
        intentM85395d.putExtra(AbstractC14843an.f62929L, str);
        intentM85395d.putExtra(AbstractC14843an.f62930M, str2);
        m85386U(intentM85395d);
    }

    /* JADX INFO: renamed from: H */
    public final void m85414H(boolean z) {
        m85415I(z, null);
    }

    /* JADX INFO: renamed from: I */
    public final void m85415I(boolean z, String str) {
        Context context = this.f61600b;
        if (z) {
            gwq0 gwq0VarM128497c = gwq0.m128497c(context);
            EnumC14726v enumC14726v = EnumC14726v.DISABLE_PUSH;
            gwq0VarM128497c.m128500d(enumC14726v, "syncing");
            gwq0.m128497c(this.f61600b).m128500d(EnumC14726v.ENABLE_PUSH, "");
            m85380F(str, enumC14726v, true, null);
            return;
        }
        gwq0 gwq0VarM128497c2 = gwq0.m128497c(context);
        EnumC14726v enumC14726v2 = EnumC14726v.ENABLE_PUSH;
        gwq0VarM128497c2.m128500d(enumC14726v2, "syncing");
        gwq0.m128497c(this.f61600b).m128500d(EnumC14726v.DISABLE_PUSH, "");
        m85380F(str, enumC14726v2, true, null);
    }

    /* JADX INFO: renamed from: J */
    public boolean m85416J() {
        return this.f61599a && 1 == C14719c.m85328c(this.f61600b).m85330a();
    }

    /* JADX INFO: renamed from: K */
    public boolean m85417K(int i) {
        if (!C14719c.m85328c(this.f61600b).m85343p()) {
            return false;
        }
        m85385T(i);
        C14766he c14766he = new C14766he();
        c14766he.m85943a(C14839aj.m86495a());
        c14766he.m85956b(C14719c.m85328c(this.f61600b).m85331d());
        c14766he.m85964d(this.f61600b.getPackageName());
        c14766he.m85960c(EnumC14750gp.ClientABTest.f62110a);
        HashMap map = new HashMap();
        c14766he.f62382a = map;
        map.put("boot_mode", i + "");
        m85402h(this.f61600b).m85437y(c14766he, EnumC14740gf.Notification, false, null);
        return true;
    }

    /* JADX INFO: renamed from: N */
    public final void m85418N() {
        Intent intentM85395d = m85395d();
        intentM85395d.setAction("com.xiaomi.mipush.DISABLE_PUSH");
        m85386U(intentM85395d);
    }

    /* JADX INFO: renamed from: O */
    public void m85419O(int i) {
        Intent intentM85395d = m85395d();
        intentM85395d.setAction("com.xiaomi.mipush.SET_NOTIFICATION_TYPE");
        intentM85395d.putExtra(AbstractC14843an.f62923F, this.f61600b.getPackageName());
        intentM85395d.putExtra(AbstractC14843an.f62926I, i);
        intentM85395d.putExtra(AbstractC14843an.f62928K, tlq0.m189625d(this.f61600b.getPackageName() + i));
        m85386U(intentM85395d);
    }

    /* JADX INFO: renamed from: Q */
    public boolean m85420Q() {
        if (!m85416J() || !m85394c0()) {
            return true;
        }
        if (this.f61609k == null) {
            Integer numValueOf = Integer.valueOf(C14845ap.m86542a(this.f61600b).m86543a());
            this.f61609k = numValueOf;
            if (numValueOf.intValue() == 0) {
                this.f61600b.getContentResolver().registerContentObserver(C14845ap.m86542a(this.f61600b).m86544a(), false, new c(new Handler(Looper.getMainLooper())));
            }
        }
        return this.f61609k.intValue() != 0;
    }

    /* JADX INFO: renamed from: S */
    public void m85421S() {
        if (this.f61608j != null) {
            m85397e0();
            m85386U(this.f61608j);
            this.f61608j = null;
        }
    }

    /* JADX INFO: renamed from: X */
    public void m85422X() {
        ArrayList<f> arrayList = f61598n;
        synchronized (arrayList) {
            boolean z = Thread.currentThread() == Looper.getMainLooper().getThread();
            for (f fVar : arrayList) {
                C14722f c14722f = this;
                c14722f.m85408A(fVar.f61615a, fVar.f61616b, fVar.f61617c, false, null, true);
                if (!z) {
                    try {
                        Thread.sleep(100L);
                    } catch (InterruptedException unused) {
                    }
                }
                this = c14722f;
            }
            f61598n.clear();
        }
    }

    /* JADX INFO: renamed from: b */
    public long m85423b() {
        return this.f61606h;
    }

    /* JADX INFO: renamed from: b0 */
    public void m85424b0() {
        Intent intentM85395d = m85395d();
        intentM85395d.setAction("com.xiaomi.mipush.CLEAR_HEADSUPNOTIFICATION");
        Application application = (Application) ikq0.m136884g("android.app.ActivityThread", "currentApplication", new Object[0]);
        String packageName = (application == null || application.getApplicationContext() == null) ? null : application.getApplicationContext().getPackageName();
        String packageName2 = this.f61600b.getPackageName();
        if (TextUtils.isEmpty(packageName) || packageName.equals(packageName2)) {
            packageName = packageName2;
        } else {
            ilq0.m137040m("application package name: " + packageName + ", not equals context package name: " + packageName2);
        }
        intentM85395d.putExtra(AbstractC14843an.f62923F, packageName);
        m85386U(intentM85395d);
    }

    /* JADX INFO: renamed from: d0 */
    public void m85425d0() {
        Intent intentM85395d = m85395d();
        intentM85395d.setAction("com.xiaomi.mipush.SET_NOTIFICATION_TYPE");
        intentM85395d.putExtra(AbstractC14843an.f62923F, this.f61600b.getPackageName());
        intentM85395d.putExtra(AbstractC14843an.f62928K, tlq0.m189625d(this.f61600b.getPackageName()));
        m85386U(intentM85395d);
    }

    /* JADX INFO: renamed from: m */
    public void m85426m() {
        m85383P(m85395d());
    }

    /* JADX INFO: renamed from: n */
    public void m85427n(int i) {
        m85428o(i, 0);
    }

    /* JADX INFO: renamed from: o */
    public void m85428o(int i, int i2) {
        Intent intentM85395d = m85395d();
        intentM85395d.setAction("com.xiaomi.mipush.CLEAR_NOTIFICATION");
        intentM85395d.putExtra(AbstractC14843an.f62923F, this.f61600b.getPackageName());
        intentM85395d.putExtra(AbstractC14843an.f62924G, i);
        intentM85395d.putExtra(AbstractC14843an.f62925H, i2);
        m85386U(intentM85395d);
    }

    /* JADX INFO: renamed from: p */
    public void m85429p(int i, String str) {
        Intent intentM85395d = m85395d();
        intentM85395d.setAction("com.xiaomi.mipush.thirdparty");
        intentM85395d.putExtra("com.xiaomi.mipush.thirdparty_LEVEL", i);
        intentM85395d.putExtra("com.xiaomi.mipush.thirdparty_DESC", str);
        m85383P(intentM85395d);
    }

    /* JADX INFO: renamed from: q */
    public void m85430q(Context context) {
        if (fvq0.m123355i()) {
            return;
        }
        EnumC14725q enumC14725qM220130a = ztq0.m220130a(context);
        if (EnumC14725q.HUAWEI.equals(enumC14725qM220130a)) {
            m85412E(null, EnumC14726v.UPLOAD_HUAWEI_TOKEN, EnumC14720d.ASSEMBLE_PUSH_HUAWEI, "update");
        }
        if (EnumC14725q.OPPO.equals(enumC14725qM220130a)) {
            m85412E(null, EnumC14726v.UPLOAD_COS_TOKEN, EnumC14720d.ASSEMBLE_PUSH_COS, "update");
        }
        if (EnumC14725q.VIVO.equals(enumC14725qM220130a)) {
            m85412E(null, EnumC14726v.UPLOAD_FTOS_TOKEN, EnumC14720d.ASSEMBLE_PUSH_FTOS, "update");
        }
    }

    /* JADX INFO: renamed from: r */
    public void m85431r(Intent intent) {
        intent.fillIn(m85395d(), 24);
        m85386U(intent);
    }

    /* JADX INFO: renamed from: t */
    public final void m85432t(C14744gj c14744gj) {
        Intent intentM85395d = m85395d();
        byte[] bArrM86277e = C14788m.m86277e(c14744gj);
        if (bArrM86277e == null) {
            ilq0.m137040m("send TinyData failed, because tinyDataBytes is null.");
            return;
        }
        intentM85395d.setAction("com.xiaomi.mipush.SEND_TINYDATA");
        intentM85395d.putExtra("mipush_payload", bArrM86277e);
        m85383P(intentM85395d);
    }

    /* JADX INFO: renamed from: u */
    public final void m85433u(C14767hf c14767hf, boolean z) {
        nqq0.m160662a(this.f61600b.getApplicationContext()).m160668f(this.f61600b.getPackageName(), "E100003", c14767hf.m85985a(), 6001, null);
        this.f61608j = null;
        C14719c.m85328c(this.f61600b).f61572d = c14767hf.m85985a();
        Intent intentM85395d = m85395d();
        byte[] bArrM86277e = C14788m.m86277e(mwq0.m156759a(this.f61600b, c14767hf, EnumC14740gf.Registration));
        if (bArrM86277e == null) {
            ilq0.m137040m("register fail, because msgBytes is null.");
            return;
        }
        intentM85395d.setAction("com.xiaomi.mipush.REGISTER_APP");
        intentM85395d.putExtra("mipush_app_id", C14719c.m85328c(this.f61600b).m85331d());
        intentM85395d.putExtra("mipush_payload", bArrM86277e);
        intentM85395d.putExtra("mipush_session", this.f61601c);
        intentM85395d.putExtra("mipush_env_chanage", z);
        intentM85395d.putExtra("mipush_env_type", C14719c.m85328c(this.f61600b).m85330a());
        if (!gkq0.m126691t(this.f61600b) || !m85420Q()) {
            this.f61608j = intentM85395d;
        } else {
            m85397e0();
            m85386U(intentM85395d);
        }
    }

    /* JADX INFO: renamed from: v */
    public final void m85434v(C14773hl c14773hl) {
        byte[] bArrM86277e = C14788m.m86277e(mwq0.m156759a(this.f61600b, c14773hl, EnumC14740gf.UnRegistration));
        if (bArrM86277e == null) {
            ilq0.m137040m("unregister fail, because msgBytes is null.");
            return;
        }
        Intent intentM85395d = m85395d();
        intentM85395d.setAction("com.xiaomi.mipush.UNREGISTER_APP");
        intentM85395d.putExtra("mipush_app_id", C14719c.m85328c(this.f61600b).m85331d());
        intentM85395d.putExtra("mipush_payload", bArrM86277e);
        m85386U(intentM85395d);
    }

    /* JADX INFO: renamed from: w */
    public final <T extends InterfaceC14777hq<T, ?>> void m85435w(T t, EnumC14740gf enumC14740gf, C14753gs c14753gs) {
        m85437y(t, enumC14740gf, !enumC14740gf.equals(EnumC14740gf.Registration), c14753gs);
    }

    /* JADX INFO: renamed from: x */
    public <T extends InterfaceC14777hq<T, ?>> void m85436x(T t, EnumC14740gf enumC14740gf, boolean z) {
        f fVar = new f();
        fVar.f61615a = t;
        fVar.f61616b = enumC14740gf;
        fVar.f61617c = z;
        ArrayList<f> arrayList = f61598n;
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
    public final <T extends InterfaceC14777hq<T, ?>> void m85437y(T t, EnumC14740gf enumC14740gf, boolean z, C14753gs c14753gs) {
        m85408A(t, enumC14740gf, z, true, c14753gs, true);
    }

    /* JADX INFO: renamed from: z */
    public final <T extends InterfaceC14777hq<T, ?>> void m85438z(T t, EnumC14740gf enumC14740gf, boolean z, C14753gs c14753gs, boolean z2) {
        m85408A(t, enumC14740gf, z, true, c14753gs, z2);
    }
}
