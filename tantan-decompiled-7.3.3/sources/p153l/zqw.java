package p153l;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.hellogroup.fep.base.FepLogLevel;
import com.hellogroup.fep.base.FepLogModuleType;
import com.hellogroup.fep.base.core.FepManager;
import com.hellogroup.fep.feppkg.model.FepPackageConfig;
import com.hellogroup.fep.feppkg.model.FepPackageStatus;
import com.immomo.mwc.sdk.C4072c;
import com.immomo.mwc.sdk.EventType;
import com.immomo.mwc.sdk.MWCEngine;
import com.immomo.mwc.sdk.exception.MWCException;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public class zqw {

    /* JADX INFO: renamed from: a */
    public static String f205665a = "MWCFactory";

    /* JADX INFO: renamed from: b */
    private static final ehi f205666b = new C21865a();

    /* JADX INFO: renamed from: l.zqw$b */
    public class C21866b implements z84 {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ String f205667a;

        public C21866b(String str) {
            this.f205667a = str;
        }

        @Override // p153l.z84
        /* JADX INFO: renamed from: a */
        public void mo99785a(y84 y84Var, Object obj) {
            if (y84Var != null) {
                MWCEngine.m20362m(zqw.f205665a, this.f205667a, "trigger error @event=%s, @error=%s", EventType.MK_CREATE.name(), y84Var);
            }
        }
    }

    /* JADX INFO: renamed from: l.zqw$c */
    public class C21867c implements ro5 {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ String f205668a;

        public C21867c(String str) {
            this.f205668a = str;
        }

        @Override // p153l.ro5
        /* JADX INFO: renamed from: a */
        public void mo182358a(MWCException mWCException, @NonNull Object obj) {
            if (mWCException != null) {
                MWCEngine.m20362m(zqw.f205665a, this.f205668a, "addWorker failed @error=%s", mWCException);
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public static xqw.C21423b m221050b() {
        xqw.C21423b c21423b = new xqw.C21423b();
        c21423b.m212764n(new erw());
        c21423b.m212762l(new grw());
        c21423b.m212766p(new zse0());
        c21423b.m212763m(new crw());
        c21423b.m212765o(new llw());
        return c21423b;
    }

    @Nullable
    /* JADX INFO: renamed from: c */
    public static arw m221051c(brw brwVar) {
        C21868d c21868dM221058j;
        if (brwVar == null) {
            return null;
        }
        String strM106165d = brwVar.m106165d();
        if (MWCEngine.m20346I() || TextUtils.isEmpty(strM106165d) || m221054f(strM106165d)) {
            return null;
        }
        if (brwVar.m106167f()) {
            String strM106164c = brwVar.m106164c();
            String strM106166e = brwVar.m106166e();
            if (m221055g(strM106164c, strM106166e)) {
                return new arw(strM106164c, strM106166e, strM106165d);
            }
            return null;
        }
        if (!brwVar.m106168g() || (c21868dM221058j = m221058j(strM106165d)) == null) {
            return null;
        }
        String str = c21868dM221058j.f205669a;
        String str2 = c21868dM221058j.f205670b;
        if (m221055g(str, str2)) {
            return new arw(str, str2, strM106165d);
        }
        return null;
    }

    /* JADX INFO: renamed from: d */
    public static void m221052d(Context context) {
        m221053e(context, null);
    }

    /* JADX INFO: renamed from: e */
    public static void m221053e(Context context, xqw xqwVar) {
        try {
            MWCEngine.m20351N(frw.m126985f());
            if (!MWCEngine.m20347J()) {
                MWCEngine.m20353P(f205665a, null, "[Web容器未初始化: 全局配置开关未开启，请检查getWebConfig接口]");
                return;
            }
            if (xqwVar == null) {
                xqwVar = m221050b().m212761k();
            }
            MWCEngine.m20342E(context, xqwVar);
            m221057i();
        } catch (Throwable th) {
            jzv.m147730c(f205665a, "", th);
        }
    }

    /* JADX INFO: renamed from: f */
    public static boolean m221054f(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return str.startsWith("https://passport.immomo.com/authorize?redirect_uri=") || str.startsWith("https://www.immomo.com/checkurl/?url=");
    }

    /* JADX INFO: renamed from: g */
    public static boolean m221055g(String str, String str2) {
        return (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) ? false : true;
    }

    /* JADX INFO: renamed from: h */
    public static String m221056h() {
        return MWCEngine.m20349L();
    }

    /* JADX INFO: renamed from: i */
    private static void m221057i() {
        MWCEngine.m20359j(f205665a, null, "prepareJsfPackage ... ");
        FepManager.m17582z().m17599v(f205666b);
        FepManager.m17582z().m17590k("https://g.immomo.com/fep/momo/m-fes-sdk/mwc-js-sdk/mwc-jsf.js?_bid=1002065");
    }

    @Nullable
    /* JADX INFO: renamed from: j */
    private static C21868d m221058j(String str) {
        hrw.m136931b();
        String strM96329a = a6k0.m96329a(str);
        C21865a c21865a = null;
        if (TextUtils.isEmpty(strM96329a) || "0".equals(strM96329a)) {
            MWCEngine.m20360k(f205665a, null, "startWorker invalid bid @bid=%s, @url=%s", strM96329a, str);
            return null;
        }
        try {
            frw frwVar = new frw(strM96329a, str);
            if (!frwVar.m126999i()) {
                MWCEngine.m20360k(f205665a, null, "startWorker project:%s serviceWorker disabled, @url=%s", strM96329a, str);
                return null;
            }
            String strM126997d = frwVar.m126997d();
            if (TextUtils.isEmpty(strM126997d)) {
                MWCEngine.m20360k(f205665a, null, "startWorker no local service-worker.%s file found for project:%s @codeType=%s", frwVar.f100483d.name(), strM96329a, frwVar.f100483d);
                return null;
            }
            String strValueOf = String.valueOf(strM96329a);
            String strM221056h = m221056h();
            String strM126998e = frwVar.m126998e();
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("url", str);
            jSONObject.put("versionStr", strM126998e);
            jSONObject.put("platform", "android");
            MWCEngine.m20366q().mo20379d(new C4072c().m20429m(strValueOf).m20433q(strM221056h).m20427k(frwVar.m126996b()).m20430n(strM126997d).m20428l(jSONObject).m20431o(str).m20432p(strM126998e), new C21867c(strM221056h)).mo20377b(EventType.MK_CREATE, strM221056h, jSONObject, new C21866b(strM221056h));
            return new C21868d(strValueOf, strM221056h, c21865a);
        } catch (Exception e) {
            MWCEngine.m20362m(f205665a, null, "startWorker error @bid=%s, @url=%s, @error=%s", strM96329a, str, e);
            return null;
        }
    }

    /* JADX INFO: renamed from: k */
    public static void m221059k(Intent intent, String str) {
        if (MWCEngine.m20346I() || TextUtils.isEmpty(str) || m221054f(str) || intent == null) {
            MWCEngine.m20360k(f205665a, null, "startWorkerBeforeActivityCreate:params @MWCEngine::enabled=%b, @url=%s, @intent=%s", Boolean.valueOf(MWCEngine.m20364o()), str, intent);
            return;
        }
        C21868d c21868dM221058j = m221058j(str);
        if (c21868dM221058j != null) {
            intent.putExtra("PARAM_WORKER_ID", c21868dM221058j.f205670b);
            intent.putExtra("PARAM_SERVICE_ID", c21868dM221058j.f205669a);
        }
    }

    /* JADX INFO: renamed from: l.zqw$d */
    public static class C21868d {

        /* JADX INFO: renamed from: a */
        public final String f205669a;

        /* JADX INFO: renamed from: b */
        public final String f205670b;

        private C21868d(String str, String str2) {
            this.f205669a = str;
            this.f205670b = str2;
        }

        public /* synthetic */ C21868d(String str, String str2, C21865a c21865a) {
            this(str, str2);
        }
    }

    /* JADX INFO: renamed from: l.zqw$a */
    public class C21865a implements ehi {
        @Override // p153l.ehi
        /* JADX INFO: renamed from: d */
        public void mo17607d(zgi zgiVar, FepPackageStatus fepPackageStatus) {
            if ("1002065".equals(zgiVar.getBid())) {
                if (fepPackageStatus == FepPackageStatus.Ready) {
                    FepPackageConfig fepPackageConfigM219623f = zgiVar.m219623f();
                    MWCEngine.m20360k(zqw.f205665a, null, "prepare mwc js sdk package checkUpdate suc @response=%s", fepPackageConfigM219623f != null ? fepPackageConfigM219623f.toString() : "");
                    FepManager.m17582z().m17601x(zqw.f205666b);
                } else if (fepPackageStatus == FepPackageStatus.Failed) {
                    FepManager.m17582z().m17601x(zqw.f205666b);
                }
            }
        }

        @Override // p153l.ehi
        /* JADX INFO: renamed from: e */
        public void mo17608e(String str, tgi tgiVar, Map<String, ?> map) {
        }

        @Override // p153l.ehi
        /* JADX INFO: renamed from: f */
        public void mo17609f(FepLogModuleType fepLogModuleType, FepLogLevel fepLogLevel, String str, Map<String, ?> map, int i, Throwable th) {
        }
    }
}
