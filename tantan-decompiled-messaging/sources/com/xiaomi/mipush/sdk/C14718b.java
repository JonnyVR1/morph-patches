package com.xiaomi.mipush.sdk;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.text.TextUtils;
import com.xiaomi.push.C14744gj;
import com.xiaomi.push.C14766he;
import com.xiaomi.push.EnumC14740gf;
import com.xiaomi.push.service.C14839aj;
import com.xiaomi.push.service.C14855az;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import p149l.ilq0;

/* JADX INFO: renamed from: com.xiaomi.mipush.sdk.b */
/* JADX INFO: loaded from: classes2.dex */
public class C14718b {

    /* JADX INFO: renamed from: com.xiaomi.mipush.sdk.b$a */
    public static class a {

        /* JADX INFO: renamed from: f */
        private static volatile a f61554f;

        /* JADX INFO: renamed from: a */
        private Context f61555a;

        /* JADX INFO: renamed from: b */
        private String f61556b;

        /* JADX INFO: renamed from: c */
        private Boolean f61557c;

        /* JADX INFO: renamed from: d */
        private C22713a f61558d = new C22713a();

        /* JADX INFO: renamed from: e */
        private final ArrayList<C14744gj> f61559e = new ArrayList<>();

        /* JADX INFO: renamed from: com.xiaomi.mipush.sdk.b$a$a, reason: collision with other inner class name */
        public class C22713a {

            /* JADX INFO: renamed from: c */
            private ScheduledFuture<?> f61562c;

            /* JADX INFO: renamed from: a */
            private ScheduledThreadPoolExecutor f61560a = new ScheduledThreadPoolExecutor(1);

            /* JADX INFO: renamed from: b */
            public final ArrayList<C14744gj> f61561b = new ArrayList<>();

            /* JADX INFO: renamed from: d */
            private final Runnable f61563d = new b();

            /* JADX INFO: renamed from: com.xiaomi.mipush.sdk.b$a$a$a, reason: collision with other inner class name */
            public class RunnableC22714a implements Runnable {

                /* JADX INFO: renamed from: a */
                final /* synthetic */ C14744gj f61565a;

                public RunnableC22714a(C14744gj c14744gj) {
                    this.f61565a = c14744gj;
                }

                @Override // java.lang.Runnable
                public void run() {
                    C22713a.this.f61561b.add(this.f61565a);
                    C22713a.this.m85322c();
                }
            }

            /* JADX INFO: renamed from: com.xiaomi.mipush.sdk.b$a$a$b */
            public class b implements Runnable {
                public b() {
                }

                @Override // java.lang.Runnable
                public void run() {
                    int size = C22713a.this.f61561b.size();
                    C22713a c22713a = C22713a.this;
                    if (size != 0) {
                        c22713a.m85324f();
                    } else if (c22713a.f61562c != null) {
                        C22713a.this.f61562c.cancel(false);
                        C22713a.this.f61562c = null;
                    }
                }
            }

            public C22713a() {
            }

            /* JADX INFO: Access modifiers changed from: private */
            /* JADX INFO: renamed from: c */
            public void m85322c() {
                if (this.f61562c == null) {
                    this.f61562c = this.f61560a.scheduleAtFixedRate(this.f61563d, 1000L, 1000L, TimeUnit.MILLISECONDS);
                }
            }

            /* JADX INFO: Access modifiers changed from: private */
            /* JADX INFO: renamed from: f */
            public void m85324f() {
                C14744gj c14744gjRemove = this.f61561b.remove(0);
                for (C14766he c14766he : C14855az.m86600a(Arrays.asList(c14744gjRemove), a.this.f61555a.getPackageName(), C14719c.m85328c(a.this.f61555a).m85331d(), 30720)) {
                    ilq0.m137053z("MiTinyDataClient Send item by PushServiceClient.sendMessage(XmActionNotification)." + c14744gjRemove.m85633d());
                    C14722f.m85402h(a.this.f61555a).m85437y(c14766he, EnumC14740gf.Notification, true, null);
                }
            }

            /* JADX INFO: renamed from: e */
            public void m85326e(C14744gj c14744gj) {
                this.f61560a.execute(new RunnableC22714a(c14744gj));
            }
        }

        /* JADX INFO: renamed from: b */
        public static a m85311b() {
            if (f61554f == null) {
                synchronized (a.class) {
                    try {
                        if (f61554f == null) {
                            f61554f = new a();
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            return f61554f;
        }

        /* JADX INFO: renamed from: d */
        private void m85312d(C14744gj c14744gj) {
            synchronized (this.f61559e) {
                try {
                    if (!this.f61559e.contains(c14744gj)) {
                        this.f61559e.add(c14744gj);
                        if (this.f61559e.size() > 100) {
                            this.f61559e.remove(0);
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        /* JADX INFO: renamed from: f */
        private boolean m85313f(Context context) {
            if (!C14722f.m85402h(context).m85416J()) {
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
        private boolean m85314i(Context context) {
            return C14719c.m85328c(context).m85331d() == null && !m85313f(this.f61555a);
        }

        /* JADX INFO: renamed from: j */
        private boolean m85315j(C14744gj c14744gj) {
            if (C14855az.m86602a(c14744gj, false)) {
                return false;
            }
            if (!this.f61557c.booleanValue()) {
                this.f61558d.m85326e(c14744gj);
                return true;
            }
            ilq0.m137053z("MiTinyDataClient Send item by PushServiceClient.sendTinyData(ClientUploadDataItem)." + c14744gj.m85633d());
            C14722f.m85402h(this.f61555a).m85432t(c14744gj);
            return true;
        }

        /* JADX INFO: renamed from: c */
        public void m85316c(Context context) {
            if (context == null) {
                ilq0.m137040m("context is null, MiTinyDataClientImp.init() failed.");
                return;
            }
            this.f61555a = context;
            this.f61557c = Boolean.valueOf(m85313f(context));
            m85319h("com.xiaomi.xmpushsdk.tinydataPending.init");
        }

        /* JADX INFO: renamed from: e */
        public boolean m85317e() {
            return this.f61555a != null;
        }

        /* JADX INFO: renamed from: g */
        public synchronized boolean m85318g(C14744gj c14744gj) {
            if (c14744gj == null) {
                return false;
            }
            try {
                if (C14855az.m86602a(c14744gj, true)) {
                    return false;
                }
                boolean z = TextUtils.isEmpty(c14744gj.m85616a()) && TextUtils.isEmpty(this.f61556b);
                boolean zM85317e = m85317e();
                Context context = this.f61555a;
                boolean z2 = context == null || m85314i(context);
                if (zM85317e && !z && !z2) {
                    ilq0.m137053z("MiTinyDataClient Send item immediately." + c14744gj.m85633d());
                    if (TextUtils.isEmpty(c14744gj.m85633d())) {
                        c14744gj.m85638f(C14839aj.m86495a());
                    }
                    if (TextUtils.isEmpty(c14744gj.m85616a())) {
                        c14744gj.m85613a(this.f61556b);
                    }
                    if (TextUtils.isEmpty(c14744gj.m85629c())) {
                        c14744gj.m85635e(this.f61555a.getPackageName());
                    }
                    if (c14744gj.m85611a() <= 0) {
                        c14744gj.m85623b(System.currentTimeMillis());
                    }
                    return m85315j(c14744gj);
                }
                if (z) {
                    ilq0.m137053z("MiTinyDataClient Pending " + c14744gj.m85625b() + " reason is com.xiaomi.xmpushsdk.tinydataPending.channel");
                } else if (!zM85317e) {
                    ilq0.m137053z("MiTinyDataClient Pending " + c14744gj.m85625b() + " reason is com.xiaomi.xmpushsdk.tinydataPending.init");
                } else if (z2) {
                    ilq0.m137053z("MiTinyDataClient Pending " + c14744gj.m85625b() + " reason is com.xiaomi.xmpushsdk.tinydataPending.appId");
                }
                m85312d(c14744gj);
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }

        /* JADX INFO: renamed from: h */
        public void m85319h(String str) {
            ilq0.m137053z("MiTinyDataClient.processPendingList(" + str + ")");
            ArrayList arrayList = new ArrayList();
            synchronized (this.f61559e) {
                arrayList.addAll(this.f61559e);
                this.f61559e.clear();
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                m85318g((C14744gj) it.next());
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public static boolean m85309a(Context context, C14744gj c14744gj) {
        ilq0.m137053z("MiTinyDataClient.upload " + c14744gj.m85633d());
        if (!a.m85311b().m85317e()) {
            a.m85311b().m85316c(context);
        }
        return a.m85311b().m85318g(c14744gj);
    }
}
