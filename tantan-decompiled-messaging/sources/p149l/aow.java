package p149l;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.cosmos.mdlog.MDLog;
import com.immomo.mwc.sdk.C3929c;
import com.immomo.mwc.sdk.EventType;
import com.immomo.mwc.sdk.MWCEngine;
import com.immomo.mwc.sdk.exception.MWCException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class aow {

    /* JADX INFO: renamed from: a */
    public static String f70947a = "MWCFactory";

    /* JADX INFO: renamed from: l.aow$a */
    public class C15682a extends ug2<Object> {
        public C15682a(Object obj) {
            super(obj);
        }

        @Override // p149l.ug2
        /* JADX INFO: renamed from: b */
        public void mo97996b(String str) {
            MWCEngine.m19382m(aow.f70947a, null, "prepare mwc js sdk package checkUpdate fail @error=%s", str);
        }

        @Override // p149l.ug2
        /* JADX INFO: renamed from: c */
        public void mo97997c(JSONObject jSONObject) {
            MWCEngine.m19380k(aow.f70947a, null, "prepare mwc js sdk package checkUpdate suc @response=%s", jSONObject != null ? jSONObject.toString() : "null");
        }
    }

    /* JADX INFO: renamed from: l.aow$b */
    public class C15683b implements a84 {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ String f70948a;

        public C15683b(String str) {
            this.f70948a = str;
        }

        @Override // p149l.a84
        /* JADX INFO: renamed from: a */
        public void mo95332a(z74 z74Var, Object obj) {
            if (z74Var != null) {
                MWCEngine.m19382m(aow.f70947a, this.f70948a, "trigger error @event=%s, @error=%s", EventType.MK_CREATE.name(), z74Var);
            }
        }
    }

    /* JADX INFO: renamed from: l.aow$c */
    public class C15684c implements nn5 {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ String f70949a;

        public C15684c(String str) {
            this.f70949a = str;
        }

        @Override // p149l.nn5
        /* JADX INFO: renamed from: a */
        public void mo97998a(MWCException mWCException, @NonNull Object obj) {
            if (mWCException != null) {
                MWCEngine.m19382m(aow.f70947a, this.f70949a, "addWorker failed @error=%s", mWCException);
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m97986a() {
        try {
            MWCEngine.m19394y().clear();
        } catch (Throwable th) {
            MDLog.m7391e(f70947a, th.getMessage());
        }
    }

    /* JADX INFO: renamed from: b */
    public static ynw.C21448b m97987b() {
        ynw.C21448b c21448b = new ynw.C21448b();
        c21448b.m215464n(new fow());
        c21448b.m215462l(new how());
        c21448b.m215466p(new uke0());
        c21448b.m215463m(new dow());
        c21448b.m215465o(new qiw());
        return c21448b;
    }

    @Nullable
    /* JADX INFO: renamed from: c */
    public static bow m97988c(cow cowVar) {
        C15685d c15685dM97994i;
        if (cowVar == null) {
            return null;
        }
        String strM108035d = cowVar.m108035d();
        if (MWCEngine.m19366I() || TextUtils.isEmpty(strM108035d) || m97990e(strM108035d)) {
            return null;
        }
        if (cowVar.m108037f()) {
            String strM108034c = cowVar.m108034c();
            String strM108036e = cowVar.m108036e();
            if (m97991f(strM108034c, strM108036e)) {
                return new bow(strM108034c, strM108036e, strM108035d);
            }
            return null;
        }
        if (!cowVar.m108038g() || (c15685dM97994i = m97994i(strM108035d)) == null) {
            return null;
        }
        String str = c15685dM97994i.f70950a;
        String str2 = c15685dM97994i.f70951b;
        if (m97991f(str, str2)) {
            return new bow(str, str2, strM108035d);
        }
        return null;
    }

    /* JADX INFO: renamed from: d */
    public static void m97989d(Context context, ynw ynwVar) {
        MWCEngine.m19371N(gow.m127290e());
        if (MWCEngine.m19367J()) {
            if (ynwVar == null) {
                ynwVar = m97987b().m215461k();
            }
            MWCEngine.m19362E(context, ynwVar);
        } else {
            MWCEngine.m19373P(f70947a, null, "[Web容器未初始化: 全局配置开关未开启，请检查getWebConfig接口]");
        }
        m97993h();
    }

    /* JADX INFO: renamed from: e */
    public static boolean m97990e(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return str.startsWith("https://passport.immomo.com/authorize?redirect_uri=") || str.startsWith("https://www.immomo.com/checkurl/?url=");
    }

    /* JADX INFO: renamed from: f */
    public static boolean m97991f(String str, String str2) {
        return (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) ? false : true;
    }

    /* JADX INFO: renamed from: g */
    public static String m97992g() {
        return MWCEngine.m19369L();
    }

    /* JADX INFO: renamed from: h */
    private static void m97993h() {
        try {
            MWCEngine.m19379j(f70947a, null, "prepareJsfPackage ... ");
            yhw.m214862s().m214867j("1002065", "https://g.immomo.com/fep/momo/m-fes-sdk/mwc-js-sdk/mwc-jsf.js?_bid=1002065", new C15682a(new Object()));
        } catch (Throwable th) {
            MWCEngine.m19382m(f70947a, null, "prepare mwc js sdk package exception @error=%s", th);
        }
    }

    @Nullable
    /* JADX INFO: renamed from: i */
    private static C15685d m97994i(String str) {
        iow.m137390b();
        String strM218869b = zhw.m218869b(str);
        C15682a c15682a = null;
        if (TextUtils.isEmpty(strM218869b) || "0".equals(strM218869b)) {
            MWCEngine.m19380k(f70947a, null, "startWorker invalid bid @bid=%s, @url=%s", strM218869b, str);
            return null;
        }
        try {
            gow gowVar = new gow(strM218869b);
            if (!gowVar.m127304h()) {
                MWCEngine.m19380k(f70947a, null, "startWorker project:%s serviceWorker disabled, @url=%s", strM218869b, str);
                return null;
            }
            String strM127302c = gowVar.m127302c();
            if (TextUtils.isEmpty(strM127302c)) {
                MWCEngine.m19380k(f70947a, null, "startWorker no local service-worker.%s file found for project:%s @codeType=%s", gowVar.f103733c.name(), strM218869b, gowVar.f103733c);
                return null;
            }
            String strValueOf = String.valueOf(strM218869b);
            String strM97992g = m97992g();
            String strM127303d = gowVar.m127303d();
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("url", str);
            jSONObject.put("versionStr", strM127303d);
            jSONObject.put("platform", "android");
            MWCEngine.m19386q().mo19399d(new C3929c().m19449m(strValueOf).m19453q(strM97992g).m19447k(gowVar.m127301b()).m19450n(strM127302c).m19448l(jSONObject).m19451o(str).m19452p(strM127303d), new C15684c(strM97992g)).mo19397b(EventType.MK_CREATE, strM97992g, jSONObject, new C15683b(strM97992g));
            return new C15685d(strValueOf, strM97992g, c15682a);
        } catch (Exception e) {
            MWCEngine.m19382m(f70947a, null, "startWorker error @bid=%s, @url=%s, @error=%s", strM218869b, str, e);
            return null;
        }
    }

    /* JADX INFO: renamed from: j */
    public static void m97995j(Intent intent, String str) {
        if (MWCEngine.m19366I() || TextUtils.isEmpty(str) || m97990e(str) || intent == null) {
            MWCEngine.m19380k(f70947a, null, "startWorkerBeforeActivityCreate:params @MWCEngine::enabled=%b, @url=%s, @intent=%s", Boolean.valueOf(MWCEngine.m19384o()), str, intent);
            return;
        }
        C15685d c15685dM97994i = m97994i(str);
        if (c15685dM97994i != null) {
            intent.putExtra("PARAM_WORKER_ID", c15685dM97994i.f70951b);
            intent.putExtra("PARAM_SERVICE_ID", c15685dM97994i.f70950a);
        }
    }

    /* JADX INFO: renamed from: l.aow$d */
    public static class C15685d {

        /* JADX INFO: renamed from: a */
        public final String f70950a;

        /* JADX INFO: renamed from: b */
        public final String f70951b;

        private C15685d(String str, String str2) {
            this.f70950a = str;
            this.f70951b = str2;
        }

        public /* synthetic */ C15685d(String str, String str2, C15682a c15682a) {
            this(str, str2);
        }
    }
}
