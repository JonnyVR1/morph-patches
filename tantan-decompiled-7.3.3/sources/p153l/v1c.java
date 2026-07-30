package p153l;

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
import com.p051p1.mobile.putong.live.base.data.BLiveTraceServerLocation;
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
public class v1c {

    /* JADX INFO: renamed from: a */
    public static volatile boolean f181942a = false;

    /* JADX INFO: renamed from: b */
    public static Set<String> f181943b = new HashSet();

    /* JADX INFO: renamed from: c */
    public static jxd0 f181944c = new jxd0("forceUseHttpDns", Boolean.FALSE);

    /* JADX INFO: renamed from: d */
    public static wyd0 f181945d = new wyd0("android_http_dns", WeJson.EMPTY_MAP);

    /* JADX INFO: renamed from: l.v1c$a */
    public class C20717a extends WebConfig {
        @Override // com.immomo.mmdns.WebConfig
        public boolean canRedirect(WebView webView, URL url, Uri uri, String str) {
            return (TextUtils.isEmpty(str) || !str.contains(Constants.INAPP_HTML_TAG) || TextUtils.equals(uri.getPath(), url.getPath()) || TextUtils.equals("cs.immomo.com", uri.getHost())) ? false : true;
        }
    }

    /* JADX INFO: renamed from: l.v1c$b */
    public class C20718b implements MDDNSEntrance.LibraryLoader {
        @Override // com.immomo.mmdns.MDDNSEntrance.LibraryLoader
        public void loadLibrary(String str) throws UnsatisfiedLinkError {
            System.loadLibrary(str);
            MDLog.m7452v(LogTag.DNS, "System.loadLibrary(%s) success", str);
        }
    }

    /* JADX INFO: renamed from: l.v1c$d */
    public class C20720d implements Consumer<String> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ ArrayList f181946a;

        public C20720d(ArrayList arrayList) {
            this.f181946a = arrayList;
        }

        @Override // java.util.function.Consumer
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void accept(String str) {
            this.f181946a.add(lhl.INSTANCE.m154222o(str));
        }
    }

    /* JADX INFO: renamed from: a */
    public static boolean m198996a() {
        String str = f181945d.get();
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            return new JSONObject(str).optBoolean("enableHttpDns");
        } catch (Exception e) {
            CrashHelper.m82479c(e);
            return false;
        }
    }

    /* JADX INFO: renamed from: b */
    public static boolean m198997b() {
        String str = f181945d.get();
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            return new JSONObject(str).optBoolean("enableWebViewHttpDns");
        } catch (Exception e) {
            CrashHelper.m82479c(e);
            return false;
        }
    }

    /* JADX INFO: renamed from: c */
    public static String m198998c(ArrayList<String> arrayList) {
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
    public static ArrayList<String> m198999d() {
        String str = f181945d.get();
        ArrayList<String> arrayList = new ArrayList<>(3);
        if (!TextUtils.isEmpty(str)) {
            try {
                JSONArray jSONArray = new JSONObject(str).getJSONArray("domains");
                for (int i = 0; i < jSONArray.length(); i++) {
                    arrayList.add(jSONArray.getString(i));
                }
            } catch (Exception e) {
                CrashHelper.m82479c(e);
            }
            if (lhl.INSTANCE.m154211d()) {
                ArrayList arrayList2 = new ArrayList();
                arrayList.forEach(new C20720d(arrayList2));
                arrayList.addAll(arrayList2);
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: e */
    public static void m199000e(Context context, List<String> list) {
        if (f181942a) {
            f181943b.addAll(list);
            MDDNSEntrance.getInstance().addWhiteHostList(f181943b);
            return;
        }
        DNSManager.setWebConfig(new C20717a());
        MDDNSEntrance.setLibraryLoader(new C20718b());
        ArrayList<String> arrayListM198999d = m198999d();
        MDDNSEntrance.getInstance().initDNSConfig(context, new vxh0(m198998c(arrayListM198999d)), BLiveTraceServerLocation.main);
        MDDNSEntrance.getInstance().openDNS(true);
        MDDNSEntrance.getInstance().openAll(false);
        f181943b.addAll(arrayListM198999d);
        f181943b.addAll(list);
        MDDNSEntrance.getInstance().addWhiteHostList(f181943b);
        MDDNSEntrance.getInstance().setUploadLogger(new C20719c());
        f181942a = true;
        uqb0.f180376H.useNewConnectionPool();
        uqb0.f180374G.m98799p();
        tu2.m192703a("[common][network]", "DNSHelper httpdns init");
    }

    /* JADX INFO: renamed from: l.v1c$c */
    public class C20719c implements MDDNSEntrance.ILogger {
        @Override // com.immomo.mmdns.MDDNSEntrance.ILogger
        public void upload(String str, JSONArray jSONArray) {
            if (li20.m154277g().m154282i()) {
                HashMap map = new HashMap();
                map.put(Oauth2AccessToken.KEY_UID, uqb0.f180397c0.userId());
                map.put("os", "Android");
                map.put("ver", "7.3.3");
                map.put(str, jSONArray.toString());
                uqb0.f180379K.m134810d(map);
            }
        }

        @Override // com.immomo.mmdns.MDDNSEntrance.ILogger
        public void upload(String str, JSONObject jSONObject) {
            if (li20.m154277g().m154282i()) {
                HashMap map = new HashMap();
                map.put(Oauth2AccessToken.KEY_UID, uqb0.f180397c0.userId());
                map.put("os", "Android");
                map.put("ver", "7.3.3");
                map.put(str, jSONObject.toString());
                uqb0.f180379K.m134810d(map);
            }
        }
    }
}
