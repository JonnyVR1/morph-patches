package p006l;

import android.app.Application;
import android.app.PendingIntent;
import android.content.Context;
import android.os.Process;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p000p1.mobile.putong.api.api.Network;
import com.p000p1.mobile.putong.api.push.PushTrackData;
import com.p000p1.mobile.putong.app.TantanApp;
import com.p000p1.mobile.putong.common.R$string;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.android.app.App;
import com.p1.mobile.android.app.Frag;
import com.p1.mobile.android.rx.RxException;
import com.p1.mobile.putong.data.PushMessage;
import com.p1.mobile.putong.data.PushMessageCustom;
import com.p1.mobile.putong.data.SafetyModeConfig;
import com.p1.mobile.putong.safety.UpgradePolicy;
import com.tantanapp.beatles.block.c;
import com.tantanapp.beatles.fd.a;
import com.tantanapp.common.network.ApiExcep;
import com.tantanapp.common.network.NetIgnoredException;
import com.tantanapp.common.network.NetReporter;
import com.tantanapp.common.utils.ConnectivityReceiver;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import com.tantanapp.sharedlibrary.loader.internal.NoReportException;
import java.io.File;
import java.io.IOException;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLHandshakeException;
import l.ahi;
import l.axm;
import l.c5f;
import l.du2;
import l.e30;
import l.e51;
import l.eu2;
import l.exc0;
import l.g7c;
import l.i1;
import l.k850;
import l.ksb;
import l.lii;
import l.lsi0;
import l.lsl;
import l.mod0;
import l.mqi0;
import l.mwv;
import l.nt2;
import l.o33;
import l.qbq0;
import l.qfi;
import l.qod0;
import l.qwv;
import l.stc0;
import l.uqd0;
import l.usl;
import l.v9j;
import l.vwb;
import l.w9k0;
import l.wod0;
import l.xck0;
import l.ytj0;
import l.zbc0;
import okhttp3.internal.http2.ConnectionShutdownException;
import okhttp3.internal.http2.StreamResetException;
import org.json.JSONException;
import org.json.JSONObject;
import rx.exceptions.OnErrorThrowable;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class au2 {

    /* JADX INFO: renamed from: a */
    public static i1 f8518a;

    /* JADX INFO: renamed from: b */
    public static c f8519b;

    /* JADX INFO: renamed from: e */
    public static long f8522e;

    /* JADX INFO: renamed from: c */
    public static List<InterfaceC0534e> f8520c = new ArrayList();

    /* JADX INFO: renamed from: d */
    public static boolean f8521d = false;

    /* JADX INFO: renamed from: f */
    public static uqd0 f8523f = new uqd0("logUploadCount", "0_0");

    /* JADX INFO: renamed from: g */
    public static lii f8524g = new lii() { // from class: l.rt2
        /* JADX INFO: renamed from: a */
        public final boolean m22939a(Throwable th) {
            return au2.m12219d(th);
        }
    };

    /* JADX INFO: renamed from: h */
    public static lii f8525h = new lii() { // from class: l.st2
        /* JADX INFO: renamed from: a */
        public final boolean m24192a(Throwable th) {
            return au2.m12216a(th);
        }
    };

    /* JADX INFO: renamed from: l.au2$a */
    public class C0530a implements usl {

        /* JADX INFO: renamed from: a */
        public volatile k850 f8526a;

        /* JADX INFO: renamed from: a */
        public k850 m12242a() {
            k850.b bVar;
            if (this.f8526a == null && qib0.f19774C != null) {
                synchronized (this) {
                    try {
                        if (this.f8526a == null && (bVar = qib0.f19774C) != null) {
                            this.f8526a = bVar.c();
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            return this.f8526a;
        }

        /* JADX INFO: renamed from: b */
        public stc0 m12243b(stc0 stc0Var) {
            try {
                return Network.addHMC(stc0Var);
            } catch (Exception e) {
                CrashHelper.c(e);
                return stc0Var;
            }
        }
    }

    /* JADX INFO: renamed from: l.au2$b */
    public class C0531b implements mwv {
        public void log(String str, String str2) {
            hfw.m16208a(str, str2);
        }
    }

    /* JADX INFO: renamed from: l.au2$c */
    public class C0532c implements ydb0.InterfaceC1476g {
        @Override // p006l.ydb0.InterfaceC1476g
        /* JADX INFO: renamed from: a */
        public boolean mo12244a(String str, String str2, PushMessage pushMessage, PushTrackData pushTrackData) {
            long j;
            JSONObject jSONObject;
            if (!pushMessage.intent.equals("xlog.upload")) {
                return false;
            }
            try {
                j = Long.parseLong(pushMessage.messageCustom.taskId);
            } catch (Exception unused) {
                j = 0;
            }
            if (TextUtils.isEmpty(pushMessage.messageCustom.ext)) {
                PushMessageCustom pushMessageCustom = pushMessage.messageCustom;
                au2.m12213C(j, pushMessageCustom.startDate, pushMessageCustom.endDate);
                return true;
            }
            String strOptString = null;
            try {
                jSONObject = new JSONObject(pushMessage.messageCustom.ext);
                try {
                    strOptString = jSONObject.optString("Type");
                } catch (JSONException e) {
                    e = e;
                    CrashHelper.c(e);
                }
            } catch (JSONException e2) {
                e = e2;
                jSONObject = null;
            }
            if (!TextUtils.isEmpty(strOptString)) {
                au2.m12229n(strOptString, jSONObject, j);
                return true;
            }
            PushMessageCustom pushMessageCustom2 = pushMessage.messageCustom;
            au2.m12213C(j, pushMessageCustom2.startDate, pushMessageCustom2.endDate);
            return true;
        }

        @Override // p006l.ydb0.InterfaceC1476g
        @Nullable
        /* JADX INFO: renamed from: b */
        public PendingIntent mo12245b(String str, String str2, PushMessage pushMessage, PushTrackData pushTrackData) {
            return null;
        }
    }

    /* JADX INFO: renamed from: l.au2$d */
    public static class C0533d implements axm {
        /* JADX INFO: renamed from: a */
        public final void m12246a(stc0 stc0Var) {
            du2.a("[common][network]", "，thread=" + Thread.currentThread() + "，request url = " + stc0Var.k());
        }

        /* JADX INFO: renamed from: b */
        public final void m12247b(exc0 exc0Var) {
            StringBuilder sb = new StringBuilder("response in ");
            sb.append(Act.foreground_() == null ? "background" : "foreground");
            sb.append("，");
            sb.append(exc0Var);
            sb.append("，thread=");
            sb.append(Thread.currentThread());
            du2.a("[common][network]", sb.toString());
        }

        public exc0 intercept(axm.a aVar) throws IOException {
            m12246a(aVar.request());
            exc0 exc0VarA = aVar.a(aVar.request());
            m12247b(exc0VarA);
            return exc0VarA;
        }

        public C0533d() {
        }
    }

    /* JADX INFO: renamed from: l.au2$e */
    public interface InterfaceC0534e {
        /* JADX INFO: renamed from: a */
        String mo12248a();

        /* JADX INFO: renamed from: b */
        boolean mo12249b(JSONObject jSONObject, long j, e30<String> e30Var) throws JSONException;
    }

    /* JADX INFO: renamed from: A */
    public static void m12211A(@Nullable long j, String str) {
        nt2.y(str, j);
    }

    /* JADX INFO: renamed from: B */
    public static void m12212B(@Nullable long j, List<File> list) {
        nt2.z(list, j);
    }

    /* JADX INFO: renamed from: C */
    public static void m12213C(long j, String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return;
        }
        HashSet<Date> hashSetM12228m = m12228m(str, str2);
        ArrayList arrayList = new ArrayList();
        for (Date date : hashSetM12228m) {
            if (System.currentTimeMillis() - date.getTime() < 604800000) {
                arrayList.add(date);
            }
        }
        if (arrayList.size() > 0) {
            m12214D(arrayList, "push", j, null);
        }
    }

    /* JADX INFO: renamed from: D */
    public static void m12214D(List<Date> list, @NonNull String str, @Nullable long j, @Nullable ytj0 ytj0Var) {
        nt2.B(list, str, j, ytj0Var);
    }

    /* JADX INFO: renamed from: E */
    public static void m12215E(List<Date> list, @NonNull String str, @Nullable long j, @Nullable ytj0 ytj0Var) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (jCurrentTimeMillis - f8522e > 60000) {
            f8522e = jCurrentTimeMillis;
            String str2 = (String) f8523f.get();
            int i = 0;
            if (!vwb.L(str2)) {
                String[] strArrSplit = str2.split("_");
                if (strArrSplit.length == 2) {
                    long j2 = Long.parseLong(strArrSplit[0]);
                    int i2 = Integer.parseInt(strArrSplit[1]);
                    if (mqi0.D(j2)) {
                        if (i2 >= 10) {
                            return;
                        } else {
                            i = i2;
                        }
                    }
                }
            }
            m12214D(list, str, j, ytj0Var);
            f8523f.put(System.currentTimeMillis() + "_" + (i + 1));
        }
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ boolean m12216a(Throwable th) {
        return th instanceof NetIgnoredException;
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m12218c(String str, JSONObject jSONObject, final long j) {
        try {
            for (InterfaceC0534e interfaceC0534e : f8520c) {
                if (TextUtils.equals(str, interfaceC0534e.mo12248a())) {
                    interfaceC0534e.mo12249b(jSONObject, j, new e30() { // from class: l.zt2
                        public final void call(Object obj) {
                            au2.m12223h(j, (String) obj);
                        }
                    });
                }
            }
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ boolean m12219d(Throwable th) {
        return (th instanceof NetIgnoredException) || (th instanceof ApiExcep) || (th instanceof UnknownHostException) || (th instanceof SSLException) || (th instanceof SocketTimeoutException) || (th instanceof SocketException) || (th instanceof StreamResetException) || (th instanceof ConnectionShutdownException) || (th instanceof NoReportException);
    }

    /* JADX INFO: renamed from: g */
    public static /* synthetic */ String m12222g() {
        return (Act.isActResumed && Frag.isFragResumed) ? "PAGE_RUNNING" : "PAGE_CREATING";
    }

    /* JADX INFO: renamed from: h */
    public static /* synthetic */ void m12223h(long j, String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        m12211A(j, str);
    }

    /* JADX INFO: renamed from: i */
    public static /* synthetic */ Map m12224i() {
        return null;
    }

    /* JADX INFO: renamed from: l */
    public static k850.b m12227l(k850.b bVar) {
        return bVar.a(new C0533d());
    }

    /* JADX INFO: renamed from: m */
    public static HashSet<Date> m12228m(@NonNull String str, @NonNull String str2) {
        HashSet<Date> hashSet = new HashSet<>();
        try {
            long j = Long.parseLong(str2);
            Date dateB = g7c.b(j);
            for (long j2 = Long.parseLong(str); j2 < j; j2 += 86400000) {
                hashSet.add(g7c.b(j2));
            }
            hashSet.add(dateB);
            return hashSet;
        } catch (Exception e) {
            CrashHelper.c(e);
            return hashSet;
        }
    }

    /* JADX INFO: renamed from: n */
    public static void m12229n(final String str, final JSONObject jSONObject, final long j) {
        e51.y(new Runnable() { // from class: l.yt2
            @Override // java.lang.Runnable
            public final void run() {
                au2.m12218c(str, jSONObject, j);
            }
        });
    }

    /* JADX INFO: renamed from: o */
    public static boolean m12230o() {
        try {
            String property = System.getProperty("http.proxyHost");
            String property2 = System.getProperty("http.proxyPort");
            if (property2 == null) {
                property2 = "-1";
            }
            return (TextUtils.isEmpty(property) || Integer.parseInt(property2) == -1) ? false : true;
        } catch (Exception unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: p */
    public static void m12231p(Context context) {
        m12232q(context, true);
    }

    /* JADX INFO: renamed from: q */
    public static void m12232q(Context context, boolean z) {
        int iMyPid;
        String absolutePath = context.getFilesDir().getAbsolutePath();
        StringBuilder sb = new StringBuilder();
        sb.append(absolutePath);
        String str = File.separator;
        sb.append(str);
        sb.append("beatles_crash_collector");
        File file = new File(sb.toString());
        if (file.exists() || file.mkdirs()) {
            absolutePath = file.getAbsolutePath();
        }
        w9k0.b bVarG = new w9k0.b().h(true).f(absolutePath).b(false).k(new ksb()).k(new c5f()).i(new cu2()).e(new qt2()).g(new lsl() { // from class: l.tt2
            public final Map getHeader() {
                return au2.m12224i();
            }
        });
        if (z) {
            iMyPid = Process.myPid();
            mod0 mod0Var = new mod0((Application) context);
            SafetyModeConfig safetyModeConfigE = qod0.e();
            mod0Var.f(safetyModeConfigE.enable, safetyModeConfigE.protectActivity, safetyModeConfigE.protectEvent);
            mod0Var.e(new UpgradePolicy(2));
            mod0Var.g(new Runnable() { // from class: l.ut2
                @Override // java.lang.Runnable
                public final void run() {
                    lsi0.h(R$string.f1358R);
                }
            });
            f8518a = new i1(false);
            File externalFilesDir = context.getExternalFilesDir(null);
            String absolutePath2 = NullChecker.a(externalFilesDir) ? externalFilesDir.getAbsolutePath() : context.getFilesDir().getAbsolutePath();
            qwv qwvVarA = new qwv.b().c(7L).d("0118bef53a6dce8e3f390600fb054e937892b4463f05e1666ea37e8f85eef023dec74954c67675ac8e61ed389464233bb2f301770985fd6bd77d1ff5871e55af").e(9437184L).f(absolutePath2 + str + "xlog_path").b(context.getFilesDir().getAbsolutePath() + str + "xlog").a();
            f8519b = new c(new o33.c().c(true).g(new o33.b() { // from class: l.vt2
                public final String getType() {
                    return au2.m12222g();
                }
            }).f(true).e(3000).d(1000L).b("qq".equals(mr4.m19499b())).a());
            bVarG.c(true).j(qwvVarA).d(z).l(mod0Var).k(f8518a).k(new qbq0()).k(f8519b);
        } else {
            iMyPid = -1;
        }
        w9k0 w9k0VarA = bVarG.a();
        nt2.H(qib0.f19823t);
        nt2.I(qib0.f19821s);
        nt2.E(false);
        nt2.s(context, "35", w9k0VarA, false, new wod0((context.getApplicationInfo().flags & 2) != 0, false, "release", iMyPid));
        nt2.a(new Class[]{OnErrorThrowable.OnNextValue.class});
        m12233r();
    }

    /* JADX INFO: renamed from: r */
    public static void m12233r() {
        du2.c(new C0531b());
        f8520c.add(new yzb());
        f8520c.add(new jhi());
    }

    /* JADX INFO: renamed from: s */
    public static void m12234s(Context context) {
        if ("360store".equals(mr4.f17192a) || "baidu".equals(mr4.f17192a) || "ppzhushou".equals(mr4.f17192a) || "organic".equals(mr4.f17192a) || "meizu".equals(mr4.f17192a)) {
            NetReporter.init(new e30() { // from class: l.wt2
                public final void call(Object obj) {
                    au2.m12239x((Throwable) obj);
                }
            }, new v9j() { // from class: l.xt2
                public final Object call() {
                    return Boolean.valueOf((!ConnectivityReceiver.g() || au2.m12230o() || Act.foreground_() == null) ? false : true);
                }
            });
        }
        m12237v();
        a.e();
        com.tantanapp.beatles.thread.a.n();
        if ("360store".equals(mr4.f17192a) || "baidu".equals(mr4.f17192a) || "ppzhushou".equals(mr4.f17192a) || "organic".equals(mr4.f17192a) || "meizu".equals(mr4.f17192a)) {
            ArrayList arrayList = new ArrayList();
            if (NullChecker.a(context.getExternalFilesDir(null))) {
                arrayList.add(context.getExternalFilesDir(null).getParent());
            }
            arrayList.add(context.getFilesDir().getParent());
            ahi.i(new qfi.b().d(1048576L).c(734003200L).e(1).b(arrayList).a());
        }
        pt2.m21681g();
    }

    /* JADX INFO: renamed from: t */
    public static boolean m12235t(Throwable th, lii liiVar) {
        while (!liiVar.a(th)) {
            Throwable cause = th.getCause();
            if (cause == null) {
                if (th instanceof App.HandledGlobally) {
                    return m12235t(((App.HandledGlobally) th).getThrowable(), liiVar);
                }
                return true;
            }
            th = cause;
        }
        return false;
    }

    /* JADX INFO: renamed from: u */
    public static void m12236u() {
        cu2.m13640c();
        nt2.w();
    }

    /* JADX INFO: renamed from: v */
    public static void m12237v() {
        TantanApp.f1169c.m28209a0(new C0532c(), vwb.f0(new String[]{"xlog.upload"}));
    }

    /* JADX INFO: renamed from: w */
    public static void m12238w(Throwable th) {
        if (th instanceof RxException) {
            if (m12235t(th, f8524g)) {
                hfw.m16209b("[RX]", th);
                eu2.f(th, "RX");
                return;
            }
            return;
        }
        if (th instanceof NullChecker.TantanNullException) {
            eu2.f(th, "NULL");
        } else if (m12235t(th, f8524g)) {
            hfw.m16209b("[CATCH]", th);
            eu2.f(th, "CATCH");
        }
    }

    /* JADX INFO: renamed from: x */
    public static void m12239x(Throwable th) {
        if (m12235t(th, f8525h)) {
            if (!xck0.c(th, SSLHandshakeException.class)) {
                eu2.f(th, "NET");
            } else if (zbc0.a(0, 500) == 0) {
                eu2.f(th, "NET");
            }
        }
    }

    /* JADX INFO: renamed from: y */
    public static void m12240y() {
        nt2.D(new C0530a());
    }

    /* JADX INFO: renamed from: z */
    public static void m12241z() {
        c cVar = f8519b;
        if (cVar == null || f8521d) {
            return;
        }
        cVar.r();
        f8521d = true;
    }
}
