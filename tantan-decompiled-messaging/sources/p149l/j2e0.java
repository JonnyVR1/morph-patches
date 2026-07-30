package p149l;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.heytap.mcssdk.mode.CommandMessage;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.app.scheme.SchemeDoFactory;
import com.p046p1.mobile.putong.p065ui.splash.SplashProxyAct;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes9.dex */
public class j2e0 {

    /* JADX INFO: renamed from: a */
    public static Map<String, y9j<String, Context, Uri, Intent>> f115921a = new HashMap();

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m139434a(List list, y9j y9jVar, String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        f115921a.put(str, y9jVar);
    }

    /* JADX INFO: renamed from: b */
    public static String m139435b(@NonNull Map<String, String> map) {
        StringBuilder sb = new StringBuilder();
        String str = "?";
        for (Map.Entry<String, String> entry : map.entrySet()) {
            if (sb.toString().contains("?")) {
                str = "&";
            }
            sb.append(str);
            sb.append(entry.getKey());
            sb.append("=");
            sb.append(entry.getValue());
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: c */
    public static String m139436c(String str, @NonNull Map<String, String> map) {
        return "tantan://" + str + m139435b(map);
    }

    /* JADX INFO: renamed from: d */
    public static Intent m139437d(Context context) {
        return qib0.f154714c0.getMainActIntent(context);
    }

    /* JADX INFO: renamed from: e */
    public static Intent m139438e(@NonNull Context context, Uri uri) {
        Intent intentM139437d;
        if (!qib0.f154714c0.signedIn_() || !qib0.m174779J0()) {
            if (!"l.tantanapp.com".equals(uri.getHost()) && !"t.p1.cn".equals(uri.getHost()) && uri.getScheme().startsWith("tantan")) {
                m139453t(uri, false);
            }
            return m139439f(context);
        }
        if (uri == null || TextUtils.isEmpty(uri.getScheme()) || TextUtils.isEmpty(uri.getHost())) {
            intentM139437d = m139437d(context);
        } else if (qib0.f154714c0.signedIn_() && ("l.tantanapp.com".equals(uri.getHost()) || "t.p1.cn".equals(uri.getHost()))) {
            intentM139437d = m139442i(context, uri);
        } else {
            intentM139437d = ("tantanapp".equals(uri.getScheme()) || "tantantribe".equals(uri.getScheme())) ? m139443j(context, uri) : m139437d(context);
        }
        return intentM139437d == null ? m139437d(context) : intentM139437d;
    }

    /* JADX INFO: renamed from: f */
    public static Intent m139439f(Context context) {
        return new Intent(context, (Class<?>) SplashProxyAct.class);
    }

    /* JADX INFO: renamed from: g */
    public static void m139440g(Activity activity) {
        activity.startActivity(m139437d(activity));
    }

    /* JADX INFO: renamed from: h */
    public static void m139441h(Activity activity) {
        activity.startActivity(new Intent(activity, (Class<?>) SplashProxyAct.class));
    }

    /* JADX INFO: renamed from: i */
    public static Intent m139442i(Context context, Uri uri) {
        String lastPathSegment = uri.getLastPathSegment();
        if (TextUtils.isEmpty(lastPathSegment)) {
            return null;
        }
        y9j<String, Context, Uri, Intent> y9jVar = f115921a.get(lastPathSegment);
        if (NullChecker.m81303a(y9jVar)) {
            return y9jVar.mo94599a(lastPathSegment, context, uri);
        }
        return null;
    }

    /* JADX INFO: renamed from: j */
    public static Intent m139443j(Context context, Uri uri) {
        m139453t(uri, true);
        Intent intentM201097e = new w2e0.C20787a(context, uri.toString()).m201103d().m201097e(null);
        return intentM201097e == null ? m139437d(context) : intentM201097e;
    }

    /* JADX INFO: renamed from: k */
    public static boolean m139444k() {
        Iterator<ArrayList<Act.C4299r>> it = Act.globalLifeCycle_().values().iterator();
        while (it.hasNext()) {
            Iterator<Act.C4299r> it2 = it.next().iterator();
            while (it2.hasNext()) {
                Activity activity = it2.next().f15343a.get();
                if (activity != null && activity.getClass() == qib0.f154714c0.mo97527v0()) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: l */
    public static boolean m139445l(long j, long j2) {
        Date date = new Date(j2);
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        Calendar calendar2 = Calendar.getInstance();
        calendar2.setTime(new Date(j));
        return calendar.get(5) == calendar2.get(5) && calendar.get(2) == calendar2.get(2) && calendar.get(1) == calendar2.get(1);
    }

    /* JADX INFO: renamed from: m */
    public static void m139446m(@NonNull Activity activity, Uri uri) {
        m139447n(activity, uri, null);
    }

    /* JADX INFO: renamed from: n */
    public static void m139447n(Activity activity, Uri uri, f30<String, String> f30Var) {
        if (!qib0.f154714c0.signedIn_() || !qib0.m174779J0()) {
            if (!"l.tantanapp.com".equals(uri.getHost()) && !"t.p1.cn".equals(uri.getHost()) && uri.getScheme().startsWith("tantan")) {
                m139453t(uri, false);
            }
            m139441h(activity);
            return;
        }
        if (uri == null || TextUtils.isEmpty(uri.getScheme()) || TextUtils.isEmpty(uri.getHost())) {
            m139440g(activity);
            return;
        }
        if (qib0.f154714c0.signedIn_() && ("l.tantanapp.com".equals(uri.getHost()) || "t.p1.cn".equals(uri.getHost()))) {
            m139451r(activity, uri);
        } else if (uri.getScheme().startsWith("tantan")) {
            m139452s(activity, uri, f30Var);
        } else {
            m139440g(activity);
        }
    }

    /* JADX INFO: renamed from: o */
    public static HashMap<String, String> m139448o(@NonNull Uri uri) {
        HashMap<String, String> map = new HashMap<>();
        if (!TextUtils.isEmpty(uri.getHost())) {
            for (String str : uri.getQueryParameterNames()) {
                map.put(str, uri.getQueryParameter(str));
            }
        }
        return map;
    }

    /* JADX INFO: renamed from: p */
    public static void m139449p(@NonNull String str, kxd0 kxd0Var) {
        SchemeDoFactory.m29668c(str, kxd0Var);
    }

    /* JADX INFO: renamed from: q */
    public static void m139450q(final List<String> list, final y9j<String, Context, Uri, Intent> y9jVar) {
        vwb.m200354z(list, new e30() { // from class: l.i2e0
            @Override // p149l.e30
            public final void call(Object obj) {
                j2e0.m139434a(list, y9jVar, (String) obj);
            }
        });
    }

    /* JADX INFO: renamed from: r */
    public static void m139451r(Activity activity, Uri uri) {
        Intent intentM139442i = m139442i(activity, uri);
        zvf0.m220371D("e_handle_universal_link", "", vwb.m200311Y("url", uri.toString()), vwb.m200311Y(CommandMessage.PARAMS, m139448o(uri)));
        if (intentM139442i == null) {
            m139440g(activity);
            return;
        }
        try {
            activity.startActivity(intentM139442i);
        } catch (Exception e) {
            CrashHelper.m81300g(e);
        }
    }

    /* JADX INFO: renamed from: s */
    public static void m139452s(@NonNull Activity activity, Uri uri, f30<String, String> f30Var) {
        m139453t(uri, true);
        new w2e0.C20787a(activity, uri.toString()).m201103d().m201093a(f30Var);
    }

    /* JADX INFO: renamed from: t */
    public static void m139453t(Uri uri, boolean z) {
        zvf0.m220371D("e_handle_deep_link", "", vwb.m200311Y("url", uri.toString()), vwb.m200311Y(CommandMessage.PARAMS, m139448o(uri)), vwb.m200311Y("from_source", ""), vwb.m200311Y("is_logged_in", z ? "yes" : "no"), vwb.m200311Y("is_first_as", m139445l(mqi0.m155944o(), jkb0.f118351d.get().longValue()) ? "no" : "yes"));
        String queryParameter = uri.getQueryParameter("widget_content");
        String queryParameter2 = uri.getQueryParameter("userId");
        if (TextUtils.isEmpty(uri.getHost()) || TextUtils.isEmpty(queryParameter)) {
            return;
        }
        zvf0.m220399u("e_phone_widget", "p_suggest_users_home_view", vwb.m200311Y("display_user_uid", TextUtils.isEmpty(queryParameter2) ? "" : queryParameter2), vwb.m200311Y("widget_content", queryParameter));
    }
}
