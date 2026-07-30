package p006l;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.p000p1.mobile.putong.app.scheme.SchemeDoFactory;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.ui.splash.SplashProxyAct;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import l.e30;
import l.f30;
import l.j760;
import l.mqi0;
import l.vwb;
import l.y9j;
import l.zvf0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class j2e0 {

    /* JADX INFO: renamed from: a */
    public static Map<String, y9j<String, Context, Uri, Intent>> f14973a = new HashMap();

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m17236a(List list, y9j y9jVar, String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        f14973a.put(str, y9jVar);
    }

    /* JADX INFO: renamed from: b */
    public static String m17237b(@NonNull Map<String, String> map) {
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
    public static String m17238c(String str, @NonNull Map<String, String> map) {
        return "tantan://" + str + m17237b(map);
    }

    /* JADX INFO: renamed from: d */
    public static Intent m17239d(Context context) {
        return qib0.f19805c0.getMainActIntent(context);
    }

    /* JADX INFO: renamed from: e */
    public static Intent m17240e(@NonNull Context context, Uri uri) {
        Intent intentM17239d;
        if (!qib0.f19805c0.signedIn_() || !qib0.m22123J0()) {
            if (!"l.tantanapp.com".equals(uri.getHost()) && !"t.p1.cn".equals(uri.getHost()) && uri.getScheme().startsWith("tantan")) {
                m17255t(uri, false);
            }
            return m17241f(context);
        }
        if (uri == null || TextUtils.isEmpty(uri.getScheme()) || TextUtils.isEmpty(uri.getHost())) {
            intentM17239d = m17239d(context);
        } else if (qib0.f19805c0.signedIn_() && ("l.tantanapp.com".equals(uri.getHost()) || "t.p1.cn".equals(uri.getHost()))) {
            intentM17239d = m17244i(context, uri);
        } else {
            intentM17239d = ("tantanapp".equals(uri.getScheme()) || "tantantribe".equals(uri.getScheme())) ? m17245j(context, uri) : m17239d(context);
        }
        return intentM17239d == null ? m17239d(context) : intentM17239d;
    }

    /* JADX INFO: renamed from: f */
    public static Intent m17241f(Context context) {
        return new Intent(context, (Class<?>) SplashProxyAct.class);
    }

    /* JADX INFO: renamed from: g */
    public static void m17242g(Activity activity) {
        activity.startActivity(m17239d(activity));
    }

    /* JADX INFO: renamed from: h */
    public static void m17243h(Activity activity) {
        activity.startActivity(new Intent(activity, (Class<?>) SplashProxyAct.class));
    }

    /* JADX INFO: renamed from: i */
    public static Intent m17244i(Context context, Uri uri) {
        String lastPathSegment = uri.getLastPathSegment();
        if (TextUtils.isEmpty(lastPathSegment)) {
            return null;
        }
        y9j<String, Context, Uri, Intent> y9jVar = f14973a.get(lastPathSegment);
        if (NullChecker.a(y9jVar)) {
            return (Intent) y9jVar.a(lastPathSegment, context, uri);
        }
        return null;
    }

    /* JADX INFO: renamed from: j */
    public static Intent m17245j(Context context, Uri uri) {
        m17255t(uri, true);
        Intent intentM26159e = new w2e0.C1398a(context, uri.toString()).m26165d().m26159e(null);
        return intentM26159e == null ? m17239d(context) : intentM26159e;
    }

    /* JADX INFO: renamed from: k */
    public static boolean m17246k() {
        Iterator it = Act.globalLifeCycle_().values().iterator();
        while (it.hasNext()) {
            Iterator it2 = ((ArrayList) it.next()).iterator();
            while (it2.hasNext()) {
                Activity activity = (Activity) ((Act.r) it2.next()).a.get();
                if (activity != null && activity.getClass() == qib0.f19805c0.mo12019v0()) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: l */
    public static boolean m17247l(long j, long j2) {
        Date date = new Date(j2);
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        Calendar calendar2 = Calendar.getInstance();
        calendar2.setTime(new Date(j));
        return calendar.get(5) == calendar2.get(5) && calendar.get(2) == calendar2.get(2) && calendar.get(1) == calendar2.get(1);
    }

    /* JADX INFO: renamed from: m */
    public static void m17248m(@NonNull Activity activity, Uri uri) {
        m17249n(activity, uri, null);
    }

    /* JADX INFO: renamed from: n */
    public static void m17249n(Activity activity, Uri uri, f30<String, String> f30Var) {
        if (!qib0.f19805c0.signedIn_() || !qib0.m22123J0()) {
            if (!"l.tantanapp.com".equals(uri.getHost()) && !"t.p1.cn".equals(uri.getHost()) && uri.getScheme().startsWith("tantan")) {
                m17255t(uri, false);
            }
            m17243h(activity);
            return;
        }
        if (uri == null || TextUtils.isEmpty(uri.getScheme()) || TextUtils.isEmpty(uri.getHost())) {
            m17242g(activity);
            return;
        }
        if (qib0.f19805c0.signedIn_() && ("l.tantanapp.com".equals(uri.getHost()) || "t.p1.cn".equals(uri.getHost()))) {
            m17253r(activity, uri);
        } else if (uri.getScheme().startsWith("tantan")) {
            m17254s(activity, uri, f30Var);
        } else {
            m17242g(activity);
        }
    }

    /* JADX INFO: renamed from: o */
    public static HashMap<String, String> m17250o(@NonNull Uri uri) {
        HashMap<String, String> map = new HashMap<>();
        if (!TextUtils.isEmpty(uri.getHost())) {
            for (String str : uri.getQueryParameterNames()) {
                map.put(str, uri.getQueryParameter(str));
            }
        }
        return map;
    }

    /* JADX INFO: renamed from: p */
    public static void m17251p(@NonNull String str, kxd0 kxd0Var) {
        SchemeDoFactory.m1578c(str, kxd0Var);
    }

    /* JADX INFO: renamed from: q */
    public static void m17252q(final List<String> list, final y9j<String, Context, Uri, Intent> y9jVar) {
        vwb.z(list, new e30() { // from class: l.i2e0
            public final void call(Object obj) {
                j2e0.m17236a(list, y9jVar, (String) obj);
            }
        });
    }

    /* JADX INFO: renamed from: r */
    public static void m17253r(Activity activity, Uri uri) {
        Intent intentM17244i = m17244i(activity, uri);
        zvf0.D("e_handle_universal_link", "", new j760[]{vwb.Y("url", uri.toString()), vwb.Y("params", m17250o(uri))});
        if (intentM17244i == null) {
            m17242g(activity);
            return;
        }
        try {
            activity.startActivity(intentM17244i);
        } catch (Exception e) {
            CrashHelper.g(e);
        }
    }

    /* JADX INFO: renamed from: s */
    public static void m17254s(@NonNull Activity activity, Uri uri, f30<String, String> f30Var) {
        m17255t(uri, true);
        new w2e0.C1398a(activity, uri.toString()).m26165d().m26155a(f30Var);
    }

    /* JADX INFO: renamed from: t */
    public static void m17255t(Uri uri, boolean z) {
        zvf0.D("e_handle_deep_link", "", new j760[]{vwb.Y("url", uri.toString()), vwb.Y("params", m17250o(uri)), vwb.Y("from_source", ""), vwb.Y("is_logged_in", z ? "yes" : "no"), vwb.Y("is_first_as", m17247l(mqi0.o(), ((Long) jkb0.f15196d.get()).longValue()) ? "no" : "yes")});
        String queryParameter = uri.getQueryParameter("widget_content");
        String queryParameter2 = uri.getQueryParameter("userId");
        if (TextUtils.isEmpty(uri.getHost()) || TextUtils.isEmpty(queryParameter)) {
            return;
        }
        zvf0.u("e_phone_widget", "p_suggest_users_home_view", new j760[]{vwb.Y("display_user_uid", TextUtils.isEmpty(queryParameter2) ? "" : queryParameter2), vwb.Y("widget_content", queryParameter)});
    }
}
