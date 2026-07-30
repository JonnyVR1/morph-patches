package p153l;

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
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.android.app.App;
import com.p051p1.mobile.android.app.Frag;
import com.p051p1.mobile.android.p052rx.RxException;
import com.p051p1.mobile.putong.api.api.Network;
import com.p051p1.mobile.putong.api.push.PushTrackData;
import com.p051p1.mobile.putong.app.TantanApp;
import com.p051p1.mobile.putong.common.R$string;
import com.p051p1.mobile.putong.data.OMSResourceType;
import com.p051p1.mobile.putong.data.PushMessage;
import com.p051p1.mobile.putong.data.PushMessageCustom;
import com.p051p1.mobile.putong.data.PushMessageIntent;
import com.p051p1.mobile.putong.data.SafetyModeConfig;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.safety.UpgradePolicy;
import com.tantanapp.beatles.block.C13710c;
import com.tantanapp.beatles.p076fd.C13711a;
import com.tantanapp.beatles.thread.C13725a;
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
import p137rx.exceptions.OnErrorThrowable;

/* JADX INFO: loaded from: classes9.dex */
public class qu2 {

    /* JADX INFO: renamed from: a */
    public static C17614i1 f159508a;

    /* JADX INFO: renamed from: b */
    public static C13710c f159509b;

    /* JADX INFO: renamed from: e */
    public static long f159512e;

    /* JADX INFO: renamed from: c */
    public static List<InterfaceC19667e> f159510c = new ArrayList();

    /* JADX INFO: renamed from: d */
    public static boolean f159511d = false;

    /* JADX INFO: renamed from: f */
    public static wyd0 f159513f = new wyd0("logUploadCount", Constants.TEST_IDENTIFIER);

    /* JADX INFO: renamed from: g */
    public static ili f159514g = new ili() { // from class: l.hu2
        @Override // p153l.ili
        /* JADX INFO: renamed from: a */
        public final boolean mo137107a(Throwable th) {
            return qu2.m178109d(th);
        }
    };

    /* JADX INFO: renamed from: h */
    public static ili f159515h = new ili() { // from class: l.iu2
        @Override // p153l.ili
        /* JADX INFO: renamed from: a */
        public final boolean mo137107a(Throwable th) {
            return qu2.m178106a(th);
        }
    };

    /* JADX INFO: renamed from: l.qu2$a */
    public class C19663a implements hvl {

        /* JADX INFO: renamed from: a */
        public volatile rg50 f159516a;

        @Override // p153l.hvl
        /* JADX INFO: renamed from: a */
        public rg50 mo137325a() {
            rg50.C19837b c19837b;
            if (this.f159516a == null && uqb0.f180366C != null) {
                synchronized (this) {
                    try {
                        if (this.f159516a == null && (c19837b = uqb0.f180366C) != null) {
                            this.f159516a = c19837b.m181365c();
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            return this.f159516a;
        }

        @Override // p153l.hvl
        /* JADX INFO: renamed from: b */
        public x1d0 mo137326b(x1d0 x1d0Var) {
            try {
                return Network.addHMC(x1d0Var);
            } catch (Exception e) {
                CrashHelper.m82479c(e);
                return x1d0Var;
            }
        }
    }

    /* JADX INFO: renamed from: l.qu2$b */
    public class C19664b implements myv {
        @Override // p153l.myv
        public void log(String str, String str2) {
            fhw.m125605a(str, str2);
        }
    }

    /* JADX INFO: renamed from: l.qu2$c */
    public class C19665c implements cmb0.InterfaceC16312g {
        @Override // p153l.cmb0.InterfaceC16312g
        /* JADX INFO: renamed from: a */
        public boolean mo103259a(String str, String str2, PushMessage pushMessage, PushTrackData pushTrackData) {
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
                qu2.m178103C(j, pushMessageCustom.startDate, pushMessageCustom.endDate);
                return true;
            }
            String strOptString = null;
            try {
                jSONObject = new JSONObject(pushMessage.messageCustom.ext);
                try {
                    strOptString = jSONObject.optString("Type");
                } catch (JSONException e) {
                    e = e;
                    CrashHelper.m82479c(e);
                }
            } catch (JSONException e2) {
                e = e2;
                jSONObject = null;
            }
            if (!TextUtils.isEmpty(strOptString)) {
                qu2.m178119n(strOptString, jSONObject, j);
                return true;
            }
            PushMessageCustom pushMessageCustom2 = pushMessage.messageCustom;
            qu2.m178103C(j, pushMessageCustom2.startDate, pushMessageCustom2.endDate);
            return true;
        }

        @Override // p153l.cmb0.InterfaceC16312g
        @Nullable
        /* JADX INFO: renamed from: b */
        public PendingIntent mo103260b(String str, String str2, PushMessage pushMessage, PushTrackData pushTrackData) {
            return null;
        }
    }

    /* JADX INFO: renamed from: l.qu2$d */
    public static class C19666d implements azm {
        /* JADX INFO: renamed from: a */
        public final void m178132a(x1d0 x1d0Var) {
            tu2.m192703a("[common][network]", "，thread=" + Thread.currentThread() + "，request url = " + x1d0Var.m209026k());
        }

        /* JADX INFO: renamed from: b */
        public final void m178133b(i5d0 i5d0Var) {
            StringBuilder sb = new StringBuilder("response in ");
            sb.append(Act.foreground_() == null ? OMSResourceType.background : DownloadService.KEY_FOREGROUND);
            sb.append("，");
            sb.append(i5d0Var);
            sb.append("，thread=");
            sb.append(Thread.currentThread());
            tu2.m192703a("[common][network]", sb.toString());
        }

        @Override // p153l.azm
        public i5d0 intercept(azm.InterfaceC15867a interfaceC15867a) throws IOException {
            m178132a(interfaceC15867a.request());
            i5d0 i5d0VarMo101076a = interfaceC15867a.mo101076a(interfaceC15867a.request());
            m178133b(i5d0VarMo101076a);
            return i5d0VarMo101076a;
        }

        public C19666d() {
        }
    }

    /* JADX INFO: renamed from: l.qu2$e */
    public interface InterfaceC19667e {
        /* JADX INFO: renamed from: a */
        String mo130575a();

        /* JADX INFO: renamed from: b */
        boolean mo130576b(JSONObject jSONObject, long j, y20<String> y20Var) throws JSONException;
    }

    /* JADX INFO: renamed from: A */
    public static void m178101A(@Nullable long j, String str) {
        du2.m118065y(str, j);
    }

    /* JADX INFO: renamed from: B */
    public static void m178102B(@Nullable long j, List<File> list) {
        du2.m118066z(list, j);
    }

    /* JADX INFO: renamed from: C */
    public static void m178103C(long j, String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return;
        }
        HashSet<Date> hashSetM178118m = m178118m(str, str2);
        ArrayList arrayList = new ArrayList();
        for (Date date : hashSetM178118m) {
            if (System.currentTimeMillis() - date.getTime() < 604800000) {
                arrayList.add(date);
            }
        }
        if (arrayList.size() > 0) {
            m178104D(arrayList, "push", j, null);
        }
    }

    /* JADX INFO: renamed from: D */
    public static void m178104D(List<Date> list, @NonNull String str, @Nullable long j, @Nullable b3k0 b3k0Var) {
        du2.m118033B(list, str, j, b3k0Var);
    }

    /* JADX INFO: renamed from: E */
    public static void m178105E(List<Date> list, @NonNull String str, @Nullable long j, @Nullable b3k0 b3k0Var) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (jCurrentTimeMillis - f159512e > Constants.ONE_MIN_IN_MILLIS) {
            f159512e = jCurrentTimeMillis;
            String str2 = f159513f.get();
            int i = 0;
            if (!jyb.m147481L(str2)) {
                String[] strArrSplit = str2.split("_");
                if (strArrSplit.length == 2) {
                    long j2 = Long.parseLong(strArrSplit[0]);
                    int i2 = Integer.parseInt(strArrSplit[1]);
                    if (pzi0.m174439D(j2)) {
                        if (i2 >= 10) {
                            return;
                        } else {
                            i = i2;
                        }
                    }
                }
            }
            m178104D(list, str, j, b3k0Var);
            f159513f.put(System.currentTimeMillis() + "_" + (i + 1));
        }
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ boolean m178106a(Throwable th) {
        return th instanceof NetIgnoredException;
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m178108c(String str, JSONObject jSONObject, final long j) {
        try {
            for (InterfaceC19667e interfaceC19667e : f159510c) {
                if (TextUtils.equals(str, interfaceC19667e.mo130575a())) {
                    interfaceC19667e.mo130576b(jSONObject, j, new y20() { // from class: l.pu2
                        @Override // p153l.y20
                        public final void call(Object obj) {
                            qu2.m178113h(j, (String) obj);
                        }
                    });
                }
            }
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ boolean m178109d(Throwable th) {
        return (th instanceof NetIgnoredException) || (th instanceof ApiExcep) || (th instanceof UnknownHostException) || (th instanceof SSLException) || (th instanceof SocketTimeoutException) || (th instanceof SocketException) || (th instanceof StreamResetException) || (th instanceof ConnectionShutdownException) || (th instanceof NoReportException);
    }

    /* JADX INFO: renamed from: g */
    public static /* synthetic */ String m178112g() {
        return (Act.isActResumed && Frag.isFragResumed) ? "PAGE_RUNNING" : "PAGE_CREATING";
    }

    /* JADX INFO: renamed from: h */
    public static /* synthetic */ void m178113h(long j, String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        m178101A(j, str);
    }

    /* JADX INFO: renamed from: i */
    public static /* synthetic */ Map m178114i() {
        return null;
    }

    /* JADX INFO: renamed from: l */
    public static rg50.C19837b m178117l(rg50.C19837b c19837b) {
        return c19837b.m181363a(new C19666d());
    }

    /* JADX INFO: renamed from: m */
    public static HashSet<Date> m178118m(@NonNull String str, @NonNull String str2) {
        HashSet<Date> hashSet = new HashSet<>();
        try {
            long j = Long.parseLong(str2);
            Date dateM157355b = m8c.m157355b(j);
            for (long j2 = Long.parseLong(str); j2 < j; j2 += 86400000) {
                hashSet.add(m8c.m157355b(j2));
            }
            hashSet.add(dateM157355b);
            return hashSet;
        } catch (Exception e) {
            CrashHelper.m82479c(e);
            return hashSet;
        }
    }

    /* JADX INFO: renamed from: n */
    public static void m178119n(final String str, final JSONObject jSONObject, final long j) {
        l51.m152919y(new Runnable() { // from class: l.ou2
            @Override // java.lang.Runnable
            public final void run() {
                qu2.m178108c(str, jSONObject, j);
            }
        });
    }

    /* JADX INFO: renamed from: o */
    public static boolean m178120o() {
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
    public static void m178121p(Context context) {
        m178122q(context, true);
    }

    /* JADX INFO: renamed from: q */
    public static void m178122q(Context context, boolean z) {
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
        cjk0.C16287b c16287bM110263g = new cjk0.C16287b().m110264h(true).m110262f(absolutePath).m110258b(false).m110267k(new ytb()).m110267k(new f6f()).m110265i(new su2()).m110261e(new gu2()).m110263g(new yul() { // from class: l.ju2
            @Override // p153l.yul
            public final Map getHeader() {
                return qu2.m178114i();
            }
        });
        if (z) {
            iMyPid = Process.myPid();
            owd0 owd0Var = new owd0((Application) context);
            SafetyModeConfig safetyModeConfigM188277e = swd0.m188277e();
            owd0Var.m169550f(safetyModeConfigM188277e.enable, safetyModeConfigM188277e.protectActivity, safetyModeConfigM188277e.protectEvent);
            owd0Var.m169549e(new UpgradePolicy(2));
            owd0Var.m169551g(new Runnable() { // from class: l.ku2
                @Override // java.lang.Runnable
                public final void run() {
                    o1j0.m165634h(R$string.f18088R);
                }
            });
            f159508a = new C17614i1(false);
            File externalFilesDir = context.getExternalFilesDir(null);
            String absolutePath2 = NullChecker.m82486a(externalFilesDir) ? externalFilesDir.getAbsolutePath() : context.getFilesDir().getAbsolutePath();
            qyv qyvVarM178744a = new qyv.C19694b().m178746c(7L).m178747d("0118bef53a6dce8e3f390600fb054e937892b4463f05e1666ea37e8f85eef023dec74954c67675ac8e61ed389464233bb2f301770985fd6bd77d1ff5871e55af").m178748e(9437184L).m178749f(absolutePath2 + str + "xlog_path").m178745b(context.getFilesDir().getAbsolutePath() + str + "xlog").m178744a();
            f159509b = new C13710c(new e43.C16705c().m119359c(true).m119363g(new e43.InterfaceC16704b() { // from class: l.lu2
                @Override // p153l.e43.InterfaceC16704b
                public final String getType() {
                    return qu2.m178112g();
                }
            }).m119362f(true).m119361e(3000).m119360d(1000L).m119358b("qq".equals(ls4.m155671b())).m119357a());
            c16287bM110263g.m110259c(true).m110266j(qyvVarM178744a).m110260d(z).m110268l(owd0Var).m110267k(f159508a).m110267k(new vkq0()).m110267k(f159509b);
        } else {
            iMyPid = -1;
        }
        cjk0 cjk0VarM110257a = c16287bM110263g.m110257a();
        du2.m118039H(uqb0.f180415t);
        du2.m118040I(uqb0.f180413s);
        du2.m118036E(false);
        du2.m118059s(context, "35", cjk0VarM110257a, false, new ywd0((context.getApplicationInfo().flags & 2) != 0, false, "release", iMyPid));
        du2.m118041a(OnErrorThrowable.OnNextValue.class);
        m178123r();
    }

    /* JADX INFO: renamed from: r */
    public static void m178123r() {
        tu2.m192705c(new C19664b());
        f159510c.add(new l1c());
        f159510c.add(new gki());
    }

    /* JADX INFO: renamed from: s */
    public static void m178124s(Context context) {
        if ("360store".equals(ls4.f133389a) || "baidu".equals(ls4.f133389a) || "ppzhushou".equals(ls4.f133389a) || "organic".equals(ls4.f133389a) || "meizu".equals(ls4.f133389a)) {
            NetReporter.init(new y20() { // from class: l.mu2
                @Override // p153l.y20
                public final void call(Object obj) {
                    qu2.m178129x((Throwable) obj);
                }
            }, new pcj() { // from class: l.nu2
                @Override // p153l.pcj, java.util.concurrent.Callable
                public final Object call() {
                    return Boolean.valueOf((!ConnectivityReceiver.m82467g() || qu2.m178120o() || Act.foreground_() == null) ? false : true);
                }
            });
        }
        m178127v();
        C13711a.m82308e();
        C13725a.m82386n();
        if ("360store".equals(ls4.f133389a) || "baidu".equals(ls4.f133389a) || "ppzhushou".equals(ls4.f133389a) || "organic".equals(ls4.f133389a) || "meizu".equals(ls4.f133389a)) {
            ArrayList arrayList = new ArrayList();
            if (NullChecker.m82486a(context.getExternalFilesDir(null))) {
                arrayList.add(context.getExternalFilesDir(null).getParent());
            }
            arrayList.add(context.getFilesDir().getParent());
            xji.m211225i(new nii.C18881b().m163288d(PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED).m163287c(734003200L).m163289e(1).m163286b(arrayList).m163285a());
        }
        fu2.m127429g();
    }

    /* JADX INFO: renamed from: t */
    public static boolean m178125t(Throwable th, ili iliVar) {
        while (!iliVar.mo137107a(th)) {
            Throwable cause = th.getCause();
            if (cause == null) {
                if (th instanceof App.HandledGlobally) {
                    return m178125t(((App.HandledGlobally) th).getThrowable(), iliVar);
                }
                return true;
            }
            th = cause;
        }
        return false;
    }

    /* JADX INFO: renamed from: u */
    public static void m178126u() {
        su2.m187982c();
        du2.m118063w();
    }

    /* JADX INFO: renamed from: v */
    public static void m178127v() {
        TantanApp.f17899c.m111140a0(new C19665c(), jyb.m147507f0(PushMessageIntent.xlog_upload));
    }

    /* JADX INFO: renamed from: w */
    public static void m178128w(Throwable th) {
        if (th instanceof RxException) {
            if (m178125t(th, f159514g)) {
                fhw.m125606b("[RX]", th);
                uu2.m198144f(th, "RX");
                return;
            }
            return;
        }
        if (th instanceof NullChecker.TantanNullException) {
            uu2.m198144f(th, "NULL");
        } else if (m178125t(th, f159514g)) {
            fhw.m125606b("[CATCH]", th);
            uu2.m198144f(th, "CATCH");
        }
    }

    /* JADX INFO: renamed from: x */
    public static void m178129x(Throwable th) {
        if (m178125t(th, f159515h)) {
            if (!dmk0.m116964c(th, SSLHandshakeException.class)) {
                uu2.m198144f(th, "NET");
            } else if (gkc0.m130573a(0, 500) == 0) {
                uu2.m198144f(th, "NET");
            }
        }
    }

    /* JADX INFO: renamed from: y */
    public static void m178130y() {
        du2.m118035D(new C19663a());
    }

    /* JADX INFO: renamed from: z */
    public static void m178131z() {
        C13710c c13710c = f159509b;
        if (c13710c == null || f159511d) {
            return;
        }
        c13710c.m82302r();
        f159511d = true;
    }
}
