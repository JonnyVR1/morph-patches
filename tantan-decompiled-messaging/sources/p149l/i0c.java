package p149l;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import android.webkit.WebView;
import com.clevertap.android.sdk.Constants;
import com.cosmos.mdlog.MDLog;
import com.immomo.mmdns.DNSManager;
import com.immomo.mmdns.LogTag;
import com.immomo.mmdns.MDDNSEntrance;
import com.immomo.mmdns.WebConfig;
import com.p046p1.mobile.putong.live.base.data.BLiveTraceServerLocation;
import com.sina.weibo.sdk.auth.Oauth2AccessToken;
import com.tantanapp.common.utils.CrashHelper;
import com.tencent.youtu.sdkkitframework.common.WeJson;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.function.Consumer;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes9.dex */
public class i0c {

    /* JADX INFO: renamed from: a */
    public static volatile boolean f110273a = false;

    /* JADX INFO: renamed from: b */
    public static Set<String> f110274b = new HashSet();

    /* JADX INFO: renamed from: c */
    public static hpd0 f110275c = new hpd0("forceUseHttpDns", Boolean.FALSE);

    /* JADX INFO: renamed from: d */
    public static uqd0 f110276d = new uqd0("android_http_dns", WeJson.EMPTY_MAP);

    /* JADX INFO: renamed from: l.i0c$a */
    public class C17444a extends WebConfig {
        @Override // com.immomo.mmdns.WebConfig
        public boolean canRedirect(WebView webView, URL url, Uri uri, String str) {
            return (TextUtils.isEmpty(str) || !str.contains(Constants.INAPP_HTML_TAG) || TextUtils.equals(uri.getPath(), url.getPath()) || TextUtils.equals("cs.immomo.com", uri.getHost())) ? false : true;
        }
    }

    /* JADX INFO: renamed from: l.i0c$b */
    public class C17445b implements MDDNSEntrance.LibraryLoader {
        @Override // com.immomo.mmdns.MDDNSEntrance.LibraryLoader
        public void loadLibrary(String str) throws UnsatisfiedLinkError {
            System.loadLibrary(str);
            MDLog.m7398v(LogTag.DNS, "System.loadLibrary(%s) success", str);
        }
    }

    /* JADX INFO: renamed from: l.i0c$d */
    public class C17447d implements Consumer<String> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ ArrayList f110277a;

        public C17447d(ArrayList arrayList) {
            this.f110277a = arrayList;
        }

        @Override // java.util.function.Consumer
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void accept(String str) {
            this.f110277a.add(uel.INSTANCE.m193269e(str));
        }
    }

    /* JADX INFO: renamed from: a */
    public static boolean m133754a() {
        String str = f110276d.get();
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            return new JSONObject(str).optBoolean("enableHttpDns");
        } catch (Exception e) {
            CrashHelper.m81296c(e);
            return false;
        }
    }

    /* JADX INFO: renamed from: b */
    public static boolean m133755b() {
        String str = f110276d.get();
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            return new JSONObject(str).optBoolean("enableWebViewHttpDns");
        } catch (Exception e) {
            CrashHelper.m81296c(e);
            return false;
        }
    }

    /* JADX INFO: renamed from: c */
    public static String m133756c(ArrayList<String> arrayList) {
        StringBuilder sb = new StringBuilder();
        Iterator<String> it = arrayList.iterator();
        while (it.hasNext()) {
            sb.append(it.next());
            sb.append(Constants.SEPARATOR_COMMA);
        }
        if (sb.length() > 0) {
            sb.deleteCharAt(sb.length() - 1);
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: d */
    public static ArrayList<String> m133757d() {
        String str = f110276d.get();
        ArrayList<String> arrayList = new ArrayList<>(3);
        if (!TextUtils.isEmpty(str)) {
            try {
                JSONArray jSONArray = new JSONObject(str).getJSONArray("domains");
                for (int i = 0; i < jSONArray.length(); i++) {
                    arrayList.add(jSONArray.getString(i));
                }
            } catch (Exception e) {
                CrashHelper.m81296c(e);
            }
            if (uel.INSTANCE.m193266b()) {
                ArrayList arrayList2 = new ArrayList();
                arrayList.forEach(new C17447d(arrayList2));
                arrayList.addAll(arrayList2);
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: e */
    public static void m133758e(Context context, List<String> list) {
        if (f110273a) {
            f110274b.addAll(list);
            MDDNSEntrance.getInstance().addWhiteHostList(f110274b);
            return;
        }
        DNSManager.setWebConfig(new C17444a());
        MDDNSEntrance.setLibraryLoader(new C17445b());
        ArrayList<String> arrayListM133757d = m133757d();
        MDDNSEntrance.getInstance().initDNSConfig(context, new oph0(m133756c(arrayListM133757d)), BLiveTraceServerLocation.main);
        MDDNSEntrance.getInstance().openDNS(true);
        MDDNSEntrance.getInstance().openAll(false);
        f110274b.addAll(arrayListM133757d);
        f110274b.addAll(list);
        MDDNSEntrance.getInstance().addWhiteHostList(f110274b);
        MDDNSEntrance.getInstance().setUploadLogger(new C17446c());
        f110273a = true;
        qib0.f154693H.useNewConnectionPool();
        qib0.f154691G.m184726p();
        du2.m113670a("[common][network]", "DNSHelper httpdns init");
    }

    /* JADX INFO: renamed from: l.i0c$c */
    public class C17446c implements MDDNSEntrance.ILogger {
        @Override // com.immomo.mmdns.MDDNSEntrance.ILogger
        public void upload(String str, JSONArray jSONArray) {
            if (da20.m110537g().m110542i()) {
                HashMap map = new HashMap();
                map.put(Oauth2AccessToken.KEY_UID, qib0.f154714c0.userId());
                map.put("os", "Android");
                map.put("ver", "7.2.7");
                map.put(str, jSONArray.toString());
                qib0.f154696K.m110171d(map);
            }
        }

        @Override // com.immomo.mmdns.MDDNSEntrance.ILogger
        public void upload(String str, JSONObject jSONObject) {
            if (da20.m110537g().m110542i()) {
                HashMap map = new HashMap();
                map.put(Oauth2AccessToken.KEY_UID, qib0.f154714c0.userId());
                map.put("os", "Android");
                map.put("ver", "7.2.7");
                map.put(str, jSONObject.toString());
                qib0.f154696K.m110171d(map);
            }
        }
    }
}
