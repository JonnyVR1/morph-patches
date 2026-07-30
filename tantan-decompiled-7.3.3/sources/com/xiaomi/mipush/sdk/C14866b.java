package com.xiaomi.mipush.sdk;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.text.TextUtils;
import com.xiaomi.push.C14892gj;
import com.xiaomi.push.C14914he;
import com.xiaomi.push.EnumC14888gf;
import com.xiaomi.push.service.C14987aj;
import com.xiaomi.push.service.C15003az;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import p153l.ouq0;

/* JADX INFO: renamed from: com.xiaomi.mipush.sdk.b */
/* JADX INFO: loaded from: classes2.dex */
public class C14866b {

    /* JADX INFO: renamed from: com.xiaomi.mipush.sdk.b$a */
    public static class a {

        /* JADX INFO: renamed from: f */
        private static volatile a f62401f;

        /* JADX INFO: renamed from: a */
        private Context f62402a;

        /* JADX INFO: renamed from: b */
        private String f62403b;

        /* JADX INFO: renamed from: c */
        private Boolean f62404c;

        /* JADX INFO: renamed from: d */
        private C22829a f62405d = new C22829a();

        /* JADX INFO: renamed from: e */
        private final ArrayList<C14892gj> f62406e = new ArrayList<>();

        /* JADX INFO: renamed from: com.xiaomi.mipush.sdk.b$a$a, reason: collision with other inner class name */
        public class C22829a {

            /* JADX INFO: renamed from: c */
            private ScheduledFuture<?> f62409c;

            /* JADX INFO: renamed from: a */
            private ScheduledThreadPoolExecutor f62407a = new ScheduledThreadPoolExecutor(1);

            /* JADX INFO: renamed from: b */
            public final ArrayList<C14892gj> f62408b = new ArrayList<>();

            /* JADX INFO: renamed from: d */
            private final Runnable f62410d = new b();

            /* JADX INFO: renamed from: com.xiaomi.mipush.sdk.b$a$a$a, reason: collision with other inner class name */
            public class RunnableC22830a implements Runnable {

                /* JADX INFO: renamed from: a */
                final /* synthetic */ C14892gj f62412a;

                public RunnableC22830a(C14892gj c14892gj) {
                    this.f62412a = c14892gj;
                }

                @Override // java.lang.Runnable
                public void run() {
                    C22829a.this.f62408b.add(this.f62412a);
                    C22829a.this.m86493c();
                }
            }

            /* JADX INFO: renamed from: com.xiaomi.mipush.sdk.b$a$a$b */
            public class b implements Runnable {
                public b() {
                }

                @Override // java.lang.Runnable
                public void run() {
                    int size = C22829a.this.f62408b.size();
                    C22829a c22829a = C22829a.this;
                    if (size != 0) {
                        c22829a.m86495f();
                    } else if (c22829a.f62409c != null) {
                        C22829a.this.f62409c.cancel(false);
                        C22829a.this.f62409c = null;
                    }
                }
            }

            public C22829a() {
            }

            /* JADX INFO: Access modifiers changed from: private */
            /* JADX INFO: renamed from: c */
            public void m86493c() {
                if (this.f62409c == null) {
                    this.f62409c = this.f62407a.scheduleAtFixedRate(this.f62410d, 1000L, 1000L, TimeUnit.MILLISECONDS);
                }
            }

            /* JADX INFO: Access modifiers changed from: private */
            /* JADX INFO: renamed from: f */
            public void m86495f() {
                C14892gj c14892gjRemove = this.f62408b.remove(0);
                for (C14914he c14914he : C15003az.m87771a(Arrays.asList(c14892gjRemove), a.this.f62402a.getPackageName(), C14867c.m86499c(a.this.f62402a).m86502d(), 30720)) {
                    ouq0.m169406z("MiTinyDataClient Send item by PushServiceClient.sendMessage(XmActionNotification)." + c14892gjRemove.m86804d());
                    C14870f.m86573h(a.this.f62402a).m86608y(c14914he, EnumC14888gf.Notification, true, null);
                }
            }

            /* JADX INFO: renamed from: e */
            public void m86497e(C14892gj c14892gj) {
                this.f62407a.execute(new RunnableC22830a(c14892gj));
            }
        }

        /* JADX INFO: renamed from: b */
        public static a m86482b() {
            if (f62401f == null) {
                synchronized (a.class) {
                    try {
                        if (f62401f == null) {
                            f62401f = new a();
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            return f62401f;
        }

        /* JADX INFO: renamed from: d */
        private void m86483d(C14892gj c14892gj) {
            synchronized (this.f62406e) {
                try {
                    if (!this.f62406e.contains(c14892gj)) {
                        this.f62406e.add(c14892gj);
                        if (this.f62406e.size() > 100) {
                            this.f62406e.remove(0);
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        /* JADX INFO: renamed from: f */
        private boolean m86484f(Context context) {
            if (!C14870f.m86573h(context).m86587J()) {
                return true;
            }
            try {
                PackageInfo packageInfo = context.getPackageManager().getPackageInfo("com.xiaomi.xmsf", 4);
                return packageInfo != null && packageInfo.versionCode >= 108;
            } catch (Exception unused) {
                return false;
            }
        }

        /* JADX INFO: renamed from: i */
        private boolean m86485i(Context context) {
            return C14867c.m86499c(context).m86502d() == null && !m86484f(this.f62402a);
        }

        /* JADX INFO: renamed from: j */
        private boolean m86486j(C14892gj c14892gj) {
            if (C15003az.m87773a(c14892gj, false)) {
                return false;
            }
            if (!this.f62404c.booleanValue()) {
                this.f62405d.m86497e(c14892gj);
                return true;
            }
            ouq0.m169406z("MiTinyDataClient Send item by PushServiceClient.sendTinyData(ClientUploadDataItem)." + c14892gj.m86804d());
            C14870f.m86573h(this.f62402a).m86603t(c14892gj);
            return true;
        }

        /* JADX INFO: renamed from: c */
        public void m86487c(Context context) {
            if (context == null) {
                ouq0.m169393m("context is null, MiTinyDataClientImp.init() failed.");
                return;
            }
            this.f62402a = context;
            this.f62404c = Boolean.valueOf(m86484f(context));
            m86490h("com.xiaomi.xmpushsdk.tinydataPending.init");
        }

        /* JADX INFO: renamed from: e */
        public boolean m86488e() {
            return this.f62402a != null;
        }

        /* JADX INFO: renamed from: g */
        public synchronized boolean m86489g(C14892gj c14892gj) {
            if (c14892gj == null) {
                return false;
            }
            try {
                if (C15003az.m87773a(c14892gj, true)) {
                    return false;
                }
                boolean z = TextUtils.isEmpty(c14892gj.m86787a()) && TextUtils.isEmpty(this.f62403b);
                boolean zM86488e = m86488e();
                Context context = this.f62402a;
                boolean z2 = context == null || m86485i(context);
                if (zM86488e && !z && !z2) {
                    ouq0.m169406z("MiTinyDataClient Send item immediately." + c14892gj.m86804d());
                    if (TextUtils.isEmpty(c14892gj.m86804d())) {
                        c14892gj.m86809f(C14987aj.m87666a());
                    }
                    if (TextUtils.isEmpty(c14892gj.m86787a())) {
                        c14892gj.m86784a(this.f62403b);
                    }
                    if (TextUtils.isEmpty(c14892gj.m86800c())) {
                        c14892gj.m86806e(this.f62402a.getPackageName());
                    }
                    if (c14892gj.m86782a() <= 0) {
                        c14892gj.m86794b(System.currentTimeMillis());
                    }
                    return m86486j(c14892gj);
                }
                if (z) {
                    ouq0.m169406z("MiTinyDataClient Pending " + c14892gj.m86796b() + " reason is com.xiaomi.xmpushsdk.tinydataPending.channel");
                } else if (!zM86488e) {
                    ouq0.m169406z("MiTinyDataClient Pending " + c14892gj.m86796b() + " reason is com.xiaomi.xmpushsdk.tinydataPending.init");
                } else if (z2) {
                    ouq0.m169406z("MiTinyDataClient Pending " + c14892gj.m86796b() + " reason is com.xiaomi.xmpushsdk.tinydataPending.appId");
                }
                m86483d(c14892gj);
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }

        /* JADX INFO: renamed from: h */
        public void m86490h(String str) {
            ouq0.m169406z("MiTinyDataClient.processPendingList(" + str + ")");
            ArrayList arrayList = new ArrayList();
            synchronized (this.f62406e) {
                arrayList.addAll(this.f62406e);
                this.f62406e.clear();
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                m86489g((C14892gj) it.next());
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public static boolean m86480a(Context context, C14892gj c14892gj) {
        ouq0.m169406z("MiTinyDataClient.upload " + c14892gj.m86804d());
        if (!a.m86482b().m86488e()) {
            a.m86482b().m86487c(context);
        }
        return a.m86482b().m86489g(c14892gj);
    }
}
