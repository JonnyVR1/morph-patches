package p153l;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.heytap.mcssdk.mode.CommandMessage;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.app.scheme.SchemeDoFactory;
import com.p051p1.mobile.putong.p070ui.splash.SplashProxyAct;
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
public class nae0 {

    /* JADX INFO: renamed from: a */
    public static Map<String, scj<String, Context, Uri, Intent>> f141009a = new HashMap();

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m162071a(List list, scj scjVar, String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        f141009a.put(str, scjVar);
    }

    /* JADX INFO: renamed from: b */
    public static String m162072b(@NonNull Map<String, String> map) {
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
    public static String m162073c(String str, @NonNull Map<String, String> map) {
        return "tantan://" + str + m162072b(map);
    }

    /* JADX INFO: renamed from: d */
    public static Intent m162074d(Context context) {
        return uqb0.f180397c0.getMainActIntent(context);
    }

    /* JADX INFO: renamed from: e */
    public static Intent m162075e(@NonNull Context context, Uri uri) {
        Intent intentM162074d;
        if (!uqb0.f180397c0.signedIn_() || !uqb0.m197233J0()) {
            if (!"l.tantanapp.com".equals(uri.getHost()) && !"t.p1.cn".equals(uri.getHost()) && uri.getScheme().startsWith("tantan")) {
                m162090t(uri, false);
            }
            return m162076f(context);
        }
        if (uri == null || TextUtils.isEmpty(uri.getScheme()) || TextUtils.isEmpty(uri.getHost())) {
            intentM162074d = m162074d(context);
        } else if (uqb0.f180397c0.signedIn_() && ("l.tantanapp.com".equals(uri.getHost()) || "t.p1.cn".equals(uri.getHost()))) {
            intentM162074d = m162079i(context, uri);
        } else {
            intentM162074d = ("tantanapp".equals(uri.getScheme()) || "tantantribe".equals(uri.getScheme())) ? m162080j(context, uri) : m162074d(context);
        }
        return intentM162074d == null ? m162074d(context) : intentM162074d;
    }

    /* JADX INFO: renamed from: f */
    public static Intent m162076f(Context context) {
        return new Intent(context, (Class<?>) SplashProxyAct.class);
    }

    /* JADX INFO: renamed from: g */
    public static void m162077g(Activity activity) {
        activity.startActivity(m162074d(activity));
    }

    /* JADX INFO: renamed from: h */
    public static void m162078h(Activity activity) {
        activity.startActivity(new Intent(activity, (Class<?>) SplashProxyAct.class));
    }

    /* JADX INFO: renamed from: i */
    public static Intent m162079i(Context context, Uri uri) {
        String lastPathSegment = uri.getLastPathSegment();
        if (TextUtils.isEmpty(lastPathSegment)) {
            return null;
        }
        scj<String, Context, Uri, Intent> scjVar = f141009a.get(lastPathSegment);
        if (NullChecker.m82486a(scjVar)) {
            return scjVar.mo95332a(lastPathSegment, context, uri);
        }
        return null;
    }

    /* JADX INFO: renamed from: j */
    public static Intent m162080j(Context context, Uri uri) {
        m162090t(uri, true);
        Intent intentM96742e = new abe0.C15681a(context, uri.toString()).m96748d().m96742e(null);
        return intentM96742e == null ? m162074d(context) : intentM96742e;
    }

    /* JADX INFO: renamed from: k */
    public static boolean m162081k() {
        Iterator<ArrayList<Act.C4450r>> it = Act.globalLifeCycle_().values().iterator();
        while (it.hasNext()) {
            Iterator<Act.C4450r> it2 = it.next().iterator();
            while (it2.hasNext()) {
                Activity activity = it2.next().f16062a.get();
                if (activity != null && activity.getClass() == uqb0.f180397c0.mo105316v0()) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: l */
    public static boolean m162082l(long j, long j2) {
        Date date = new Date(j2);
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        Calendar calendar2 = Calendar.getInstance();
        calendar2.setTime(new Date(j));
        return calendar.get(5) == calendar2.get(5) && calendar.get(2) == calendar2.get(2) && calendar.get(1) == calendar2.get(1);
    }

    /* JADX INFO: renamed from: m */
    public static void m162083m(@NonNull Activity activity, Uri uri) {
        m162084n(activity, uri, null);
    }

    /* JADX INFO: renamed from: n */
    public static void m162084n(Activity activity, Uri uri, z20<String, String> z20Var) {
        if (!uqb0.f180397c0.signedIn_() || !uqb0.m197233J0()) {
            if (!"l.tantanapp.com".equals(uri.getHost()) && !"t.p1.cn".equals(uri.getHost()) && uri.getScheme().startsWith("tantan")) {
                m162090t(uri, false);
            }
            m162078h(activity);
            return;
        }
        if (uri == null || TextUtils.isEmpty(uri.getScheme()) || TextUtils.isEmpty(uri.getHost())) {
            m162077g(activity);
            return;
        }
        if (uqb0.f180397c0.signedIn_() && ("l.tantanapp.com".equals(uri.getHost()) || "t.p1.cn".equals(uri.getHost()))) {
            m162088r(activity, uri);
        } else if (uri.getScheme().startsWith("tantan")) {
            m162089s(activity, uri, z20Var);
        } else {
            m162077g(activity);
        }
    }

    /* JADX INFO: renamed from: o */
    public static HashMap<String, String> m162085o(@NonNull Uri uri) {
        HashMap<String, String> map = new HashMap<>();
        if (!TextUtils.isEmpty(uri.getHost())) {
            for (String str : uri.getQueryParameterNames()) {
                map.put(str, uri.getQueryParameter(str));
            }
        }
        return map;
    }

    /* JADX INFO: renamed from: p */
    public static void m162086p(@NonNull String str, o5e0 o5e0Var) {
        SchemeDoFactory.m30666c(str, o5e0Var);
    }

    /* JADX INFO: renamed from: q */
    public static void m162087q(final List<String> list, final scj<String, Context, Uri, Intent> scjVar) {
        jyb.m147537z(list, new y20() { // from class: l.mae0
            @Override // p153l.y20
            public final void call(Object obj) {
                nae0.m162071a(list, scjVar, (String) obj);
            }
        });
    }

    /* JADX INFO: renamed from: r */
    public static void m162088r(Activity activity, Uri uri) {
        Intent intentM162079i = m162079i(activity, uri);
        i4g0.m138495D("e_handle_universal_link", "", jyb.m147494Y("url", uri.toString()), jyb.m147494Y(CommandMessage.PARAMS, m162085o(uri)));
        if (intentM162079i == null) {
            m162077g(activity);
            return;
        }
        try {
            activity.startActivity(intentM162079i);
        } catch (Exception e) {
            CrashHelper.m82483g(e);
        }
    }

    /* JADX INFO: renamed from: s */
    public static void m162089s(@NonNull Activity activity, Uri uri, z20<String, String> z20Var) {
        m162090t(uri, true);
        new abe0.C15681a(activity, uri.toString()).m96748d().m96738a(z20Var);
    }

    /* JADX INFO: renamed from: t */
    public static void m162090t(Uri uri, boolean z) {
        i4g0.m138495D("e_handle_deep_link", "", jyb.m147494Y("url", uri.toString()), jyb.m147494Y(CommandMessage.PARAMS, m162085o(uri)), jyb.m147494Y("from_source", ""), jyb.m147494Y("is_logged_in", z ? "yes" : "no"), jyb.m147494Y("is_first_as", m162082l(pzi0.m174454o(), nsb0.f143484d.get().longValue()) ? "no" : "yes"));
        String queryParameter = uri.getQueryParameter("widget_content");
        String queryParameter2 = uri.getQueryParameter("userId");
        if (TextUtils.isEmpty(uri.getHost()) || TextUtils.isEmpty(queryParameter)) {
            return;
        }
        i4g0.m138523u("e_phone_widget", "p_suggest_users_home_view", jyb.m147494Y("display_user_uid", TextUtils.isEmpty(queryParameter2) ? "" : queryParameter2), jyb.m147494Y("widget_content", queryParameter));
    }
}
