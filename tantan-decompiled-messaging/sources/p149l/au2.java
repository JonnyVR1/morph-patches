package p149l;

import android.app.Application;
import android.app.PendingIntent;
import android.content.Context;
import android.os.Process;
import android.support.v4.media.session.PlaybackStateCompat;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.clevertap.android.sdk.Constants;
import com.google.android.exoplayer2.offline.DownloadService;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.android.app.App;
import com.p046p1.mobile.android.app.Frag;
import com.p046p1.mobile.android.p047rx.RxException;
import com.p046p1.mobile.putong.api.api.Network;
import com.p046p1.mobile.putong.api.push.PushTrackData;
import com.p046p1.mobile.putong.app.TantanApp;
import com.p046p1.mobile.putong.common.R$string;
import com.p046p1.mobile.putong.data.OMSResourceType;
import com.p046p1.mobile.putong.data.PushMessage;
import com.p046p1.mobile.putong.data.PushMessageCustom;
import com.p046p1.mobile.putong.data.PushMessageIntent;
import com.p046p1.mobile.putong.data.SafetyModeConfig;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.safety.UpgradePolicy;
import com.tantanapp.beatles.block.C13547c;
import com.tantanapp.beatles.p071fd.C13548a;
import com.tantanapp.beatles.thread.C13562a;
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
import okhttp3.internal.http2.ConnectionShutdownException;
import okhttp3.internal.http2.StreamResetException;
import org.json.JSONException;
import org.json.JSONObject;
import p133rx.exceptions.OnErrorThrowable;

/* JADX INFO: loaded from: classes9.dex */
public class au2 {

    /* JADX INFO: renamed from: a */
    public static C17458i1 f71714a;

    /* JADX INFO: renamed from: b */
    public static C13547c f71715b;

    /* JADX INFO: renamed from: e */
    public static long f71718e;

    /* JADX INFO: renamed from: c */
    public static List<InterfaceC15720e> f71716c = new ArrayList();

    /* JADX INFO: renamed from: d */
    public static boolean f71717d = false;

    /* JADX INFO: renamed from: f */
    public static uqd0 f71719f = new uqd0("logUploadCount", Constants.TEST_IDENTIFIER);

    /* JADX INFO: renamed from: g */
    public static lii f71720g = new lii() { // from class: l.rt2
        @Override // p149l.lii
        /* JADX INFO: renamed from: a */
        public final boolean mo149900a(Throwable th) {
            return au2.m98916d(th);
        }
    };

    /* JADX INFO: renamed from: h */
    public static lii f71721h = new lii() { // from class: l.st2
        @Override // p149l.lii
        /* JADX INFO: renamed from: a */
        public final boolean mo149900a(Throwable th) {
            return au2.m98913a(th);
        }
    };

    /* JADX INFO: renamed from: l.au2$a */
    public class C15716a implements usl {

        /* JADX INFO: renamed from: a */
        public volatile k850 f71722a;

        @Override // p149l.usl
        /* JADX INFO: renamed from: a */
        public k850 mo98939a() {
            k850.C17954b c17954b;
            if (this.f71722a == null && qib0.f154683C != null) {
                synchronized (this) {
                    try {
                        if (this.f71722a == null && (c17954b = qib0.f154683C) != null) {
                            this.f71722a = c17954b.m144882c();
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            return this.f71722a;
        }

        @Override // p149l.usl
        /* JADX INFO: renamed from: b */
        public stc0 mo98940b(stc0 stc0Var) {
            try {
                return Network.addHMC(stc0Var);
            } catch (Exception e) {
                CrashHelper.m81296c(e);
                return stc0Var;
            }
        }
    }

    /* JADX INFO: renamed from: l.au2$b */
    public class C15717b implements mwv {
        @Override // p149l.mwv
        public void log(String str, String str2) {
            hfw.m130790a(str, str2);
        }
    }

    /* JADX INFO: renamed from: l.au2$c */
    public class C15718c implements ydb0.InterfaceC21375g {
        @Override // p149l.ydb0.InterfaceC21375g
        /* JADX INFO: renamed from: a */
        public boolean mo98941a(String str, String str2, PushMessage pushMessage, PushTrackData pushTrackData) {
            long j;
            JSONObject jSONObject;
            if (!pushMessage.intent.equals(PushMessageIntent.xlog_upload)) {
                return false;
            }
            try {
                j = Long.parseLong(pushMessage.messageCustom.taskId);
            } catch (Exception unused) {
                j = 0;
            }
            if (TextUtils.isEmpty(pushMessage.messageCustom.ext)) {
                PushMessageCustom pushMessageCustom = pushMessage.messageCustom;
                au2.m98910C(j, pushMessageCustom.startDate, pushMessageCustom.endDate);
                return true;
            }
            String strOptString = null;
            try {
                jSONObject = new JSONObject(pushMessage.messageCustom.ext);
                try {
                    strOptString = jSONObject.optString("Type");
                } catch (JSONException e) {
                    e = e;
                    CrashHelper.m81296c(e);
                }
            } catch (JSONException e2) {
                e = e2;
                jSONObject = null;
            }
            if (!TextUtils.isEmpty(strOptString)) {
                au2.m98926n(strOptString, jSONObject, j);
                return true;
            }
            PushMessageCustom pushMessageCustom2 = pushMessage.messageCustom;
            au2.m98910C(j, pushMessageCustom2.startDate, pushMessageCustom2.endDate);
            return true;
        }

        @Override // p149l.ydb0.InterfaceC21375g
        @Nullable
        /* JADX INFO: renamed from: b */
        public PendingIntent mo98942b(String str, String str2, PushMessage pushMessage, PushTrackData pushTrackData) {
            return null;
        }
    }

    /* JADX INFO: renamed from: l.au2$d */
    public static class C15719d implements axm {
        /* JADX INFO: renamed from: a */
        public final void m98943a(stc0 stc0Var) {
            du2.m113670a("[common][network]", "，thread=" + Thread.currentThread() + "，request url = " + stc0Var.m185881k());
        }

        /* JADX INFO: renamed from: b */
        public final void m98944b(exc0 exc0Var) {
            StringBuilder sb = new StringBuilder("response in ");
            sb.append(Act.foreground_() == null ? OMSResourceType.background : DownloadService.KEY_FOREGROUND);
            sb.append("，");
            sb.append(exc0Var);
            sb.append("，thread=");
            sb.append(Thread.currentThread());
            du2.m113670a("[common][network]", sb.toString());
        }

        @Override // p149l.axm
        public exc0 intercept(axm.InterfaceC15754a interfaceC15754a) throws IOException {
            m98943a(interfaceC15754a.request());
            exc0 exc0VarMo99454a = interfaceC15754a.mo99454a(interfaceC15754a.request());
            m98944b(exc0VarMo99454a);
            return exc0VarMo99454a;
        }

        public C15719d() {
        }
    }

    /* JADX INFO: renamed from: l.au2$e */
    public interface InterfaceC15720e {
        /* JADX INFO: renamed from: a */
        String mo98945a();

        /* JADX INFO: renamed from: b */
        boolean mo98946b(JSONObject jSONObject, long j, e30<String> e30Var) throws JSONException;
    }

    /* JADX INFO: renamed from: A */
    public static void m98908A(@Nullable long j, String str) {
        nt2.m160834y(str, j);
    }

    /* JADX INFO: renamed from: B */
    public static void m98909B(@Nullable long j, List<File> list) {
        nt2.m160835z(list, j);
    }

    /* JADX INFO: renamed from: C */
    public static void m98910C(long j, String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return;
        }
        HashSet<Date> hashSetM98925m = m98925m(str, str2);
        ArrayList arrayList = new ArrayList();
        for (Date date : hashSetM98925m) {
            if (System.currentTimeMillis() - date.getTime() < 604800000) {
                arrayList.add(date);
            }
        }
        if (arrayList.size() > 0) {
            m98911D(arrayList, "push", j, null);
        }
    }

    /* JADX INFO: renamed from: D */
    public static void m98911D(List<Date> list, @NonNull String str, @Nullable long j, @Nullable ytj0 ytj0Var) {
        nt2.m160802B(list, str, j, ytj0Var);
    }

    /* JADX INFO: renamed from: E */
    public static void m98912E(List<Date> list, @NonNull String str, @Nullable long j, @Nullable ytj0 ytj0Var) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (jCurrentTimeMillis - f71718e > Constants.ONE_MIN_IN_MILLIS) {
            f71718e = jCurrentTimeMillis;
            String str2 = f71719f.get();
            int i = 0;
            if (!vwb.m200298L(str2)) {
                String[] strArrSplit = str2.split("_");
                if (strArrSplit.length == 2) {
                    long j2 = Long.parseLong(strArrSplit[0]);
                    int i2 = Integer.parseInt(strArrSplit[1]);
                    if (mqi0.m155929D(j2)) {
                        if (i2 >= 10) {
                            return;
                        } else {
                            i = i2;
                        }
                    }
                }
            }
            m98911D(list, str, j, ytj0Var);
            f71719f.put(System.currentTimeMillis() + "_" + (i + 1));
        }
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ boolean m98913a(Throwable th) {
        return th instanceof NetIgnoredException;
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m98915c(String str, JSONObject jSONObject, final long j) {
        try {
            for (InterfaceC15720e interfaceC15720e : f71716c) {
                if (TextUtils.equals(str, interfaceC15720e.mo98945a())) {
                    interfaceC15720e.mo98946b(jSONObject, j, new e30() { // from class: l.zt2
                        @Override // p149l.e30
                        public final void call(Object obj) {
                            au2.m98920h(j, (String) obj);
                        }
                    });
                }
            }
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ boolean m98916d(Throwable th) {
        return (th instanceof NetIgnoredException) || (th instanceof ApiExcep) || (th instanceof UnknownHostException) || (th instanceof SSLException) || (th instanceof SocketTimeoutException) || (th instanceof SocketException) || (th instanceof StreamResetException) || (th instanceof ConnectionShutdownException) || (th instanceof NoReportException);
    }

    /* JADX INFO: renamed from: g */
    public static /* synthetic */ String m98919g() {
        return (Act.isActResumed && Frag.isFragResumed) ? "PAGE_RUNNING" : "PAGE_CREATING";
    }

    /* JADX INFO: renamed from: h */
    public static /* synthetic */ void m98920h(long j, String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        m98908A(j, str);
    }

    /* JADX INFO: renamed from: i */
    public static /* synthetic */ Map m98921i() {
        return null;
    }

    /* JADX INFO: renamed from: l */
    public static k850.C17954b m98924l(k850.C17954b c17954b) {
        return c17954b.m144880a(new C15719d());
    }

    /* JADX INFO: renamed from: m */
    public static HashSet<Date> m98925m(@NonNull String str, @NonNull String str2) {
        HashSet<Date> hashSet = new HashSet<>();
        try {
            long j = Long.parseLong(str2);
            Date dateM124686b = g7c.m124686b(j);
            for (long j2 = Long.parseLong(str); j2 < j; j2 += 86400000) {
                hashSet.add(g7c.m124686b(j2));
            }
            hashSet.add(dateM124686b);
            return hashSet;
        } catch (Exception e) {
            CrashHelper.m81296c(e);
            return hashSet;
        }
    }

    /* JADX INFO: renamed from: n */
    public static void m98926n(final String str, final JSONObject jSONObject, final long j) {
        e51.m114774y(new Runnable() { // from class: l.yt2
            @Override // java.lang.Runnable
            public final void run() {
                au2.m98915c(str, jSONObject, j);
            }
        });
    }

    /* JADX INFO: renamed from: o */
    public static boolean m98927o() {
        try {
            String property = System.getProperty("http.proxyHost");
            String property2 = System.getProperty("http.proxyPort");
            if (property2 == null) {
                property2 = User.ID_TEAM_ACCOUNT;
            }
            return (TextUtils.isEmpty(property) || Integer.parseInt(property2) == -1) ? false : true;
        } catch (Exception unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: p */
    public static void m98928p(Context context) {
        m98929q(context, true);
    }

    /* JADX INFO: renamed from: q */
    public static void m98929q(Context context, boolean z) {
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
        w9k0.C20838b c20838bM202328g = new w9k0.C20838b().m202329h(true).m202327f(absolutePath).m202323b(false).m202332k(new ksb()).m202332k(new c5f()).m202330i(new cu2()).m202326e(new qt2()).m202328g(new lsl() { // from class: l.tt2
            @Override // p149l.lsl
            public final Map getHeader() {
                return au2.m98921i();
            }
        });
        if (z) {
            iMyPid = Process.myPid();
            mod0 mod0Var = new mod0((Application) context);
            SafetyModeConfig safetyModeConfigM175735e = qod0.m175735e();
            mod0Var.m155673f(safetyModeConfigM175735e.enable, safetyModeConfigM175735e.protectActivity, safetyModeConfigM175735e.protectEvent);
            mod0Var.m155672e(new UpgradePolicy(2));
            mod0Var.m155674g(new Runnable() { // from class: l.ut2
                @Override // java.lang.Runnable
                public final void run() {
                    lsi0.m151578h(R$string.f17369R);
                }
            });
            f71714a = new C17458i1(false);
            File externalFilesDir = context.getExternalFilesDir(null);
            String absolutePath2 = NullChecker.m81303a(externalFilesDir) ? externalFilesDir.getAbsolutePath() : context.getFilesDir().getAbsolutePath();
            qwv qwvVarM176921a = new qwv.C19602b().m176923c(7L).m176924d("0118bef53a6dce8e3f390600fb054e937892b4463f05e1666ea37e8f85eef023dec74954c67675ac8e61ed389464233bb2f301770985fd6bd77d1ff5871e55af").m176925e(9437184L).m176926f(absolutePath2 + str + "xlog_path").m176922b(context.getFilesDir().getAbsolutePath() + str + "xlog").m176921a();
            f71715b = new C13547c(new o33.C18828c().m162373c(true).m162377g(new o33.InterfaceC18827b() { // from class: l.vt2
                @Override // p149l.o33.InterfaceC18827b
                public final String getType() {
                    return au2.m98919g();
                }
            }).m162376f(true).m162375e(3000).m162374d(1000L).m162372b("qq".equals(mr4.m156015b())).m162371a());
            c20838bM202328g.m202324c(true).m202331j(qwvVarM176921a).m202325d(z).m202333l(mod0Var).m202332k(f71714a).m202332k(new qbq0()).m202332k(f71715b);
        } else {
            iMyPid = -1;
        }
        w9k0 w9k0VarM202322a = c20838bM202328g.m202322a();
        nt2.m160808H(qib0.f154732t);
        nt2.m160809I(qib0.f154730s);
        nt2.m160805E(false);
        nt2.m160828s(context, "35", w9k0VarM202322a, false, new wod0((context.getApplicationInfo().flags & 2) != 0, false, "release", iMyPid));
        nt2.m160810a(OnErrorThrowable.OnNextValue.class);
        m98930r();
    }

    /* JADX INFO: renamed from: r */
    public static void m98930r() {
        du2.m113672c(new C15717b());
        f71716c.add(new yzb());
        f71716c.add(new jhi());
    }

    /* JADX INFO: renamed from: s */
    public static void m98931s(Context context) {
        if ("360store".equals(mr4.f135329a) || "baidu".equals(mr4.f135329a) || "ppzhushou".equals(mr4.f135329a) || "organic".equals(mr4.f135329a) || "meizu".equals(mr4.f135329a)) {
            NetReporter.init(new e30() { // from class: l.wt2
                @Override // p149l.e30
                public final void call(Object obj) {
                    au2.m98936x((Throwable) obj);
                }
            }, new v9j() { // from class: l.xt2
                @Override // p149l.v9j, java.util.concurrent.Callable
                public final Object call() {
                    return Boolean.valueOf((!ConnectivityReceiver.m81284g() || au2.m98927o() || Act.foreground_() == null) ? false : true);
                }
            });
        }
        m98934v();
        C13548a.m81125e();
        C13562a.m81203n();
        if ("360store".equals(mr4.f135329a) || "baidu".equals(mr4.f135329a) || "ppzhushou".equals(mr4.f135329a) || "organic".equals(mr4.f135329a) || "meizu".equals(mr4.f135329a)) {
            ArrayList arrayList = new ArrayList();
            if (NullChecker.m81303a(context.getExternalFilesDir(null))) {
                arrayList.add(context.getExternalFilesDir(null).getParent());
            }
            arrayList.add(context.getFilesDir().getParent());
            ahi.m96483i(new qfi.C19484b().m174333d(PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED).m174332c(734003200L).m174334e(1).m174331b(arrayList).m174330a());
        }
        pt2.m171273g();
    }

    /* JADX INFO: renamed from: t */
    public static boolean m98932t(Throwable th, lii liiVar) {
        while (!liiVar.mo149900a(th)) {
            Throwable cause = th.getCause();
            if (cause == null) {
                if (th instanceof App.HandledGlobally) {
                    return m98932t(((App.HandledGlobally) th).getThrowable(), liiVar);
                }
                return true;
            }
            th = cause;
        }
        return false;
    }

    /* JADX INFO: renamed from: u */
    public static void m98933u() {
        cu2.m108721c();
        nt2.m160832w();
    }

    /* JADX INFO: renamed from: v */
    public static void m98934v() {
        TantanApp.f17180c.m214262a0(new C15718c(), vwb.m200324f0(PushMessageIntent.xlog_upload));
    }

    /* JADX INFO: renamed from: w */
    public static void m98935w(Throwable th) {
        if (th instanceof RxException) {
            if (m98932t(th, f71720g)) {
                hfw.m130791b("[RX]", th);
                eu2.m118152f(th, "RX");
                return;
            }
            return;
        }
        if (th instanceof NullChecker.TantanNullException) {
            eu2.m118152f(th, "NULL");
        } else if (m98932t(th, f71720g)) {
            hfw.m130791b("[CATCH]", th);
            eu2.m118152f(th, "CATCH");
        }
    }

    /* JADX INFO: renamed from: x */
    public static void m98936x(Throwable th) {
        if (m98932t(th, f71721h)) {
            if (!xck0.m208122c(th, SSLHandshakeException.class)) {
                eu2.m118152f(th, "NET");
            } else if (zbc0.m217835a(0, 500) == 0) {
                eu2.m118152f(th, "NET");
            }
        }
    }

    /* JADX INFO: renamed from: y */
    public static void m98937y() {
        nt2.m160804D(new C15716a());
    }

    /* JADX INFO: renamed from: z */
    public static void m98938z() {
        C13547c c13547c = f71715b;
        if (c13547c == null || f71717d) {
            return;
        }
        c13547c.m81119r();
        f71717d = true;
    }
}
