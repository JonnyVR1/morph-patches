package p006l;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import android.webkit.WebView;
import com.cosmos.mdlog.MDLog;
import com.immomo.mmdns.DNSManager;
import com.immomo.mmdns.MDDNSEntrance;
import com.immomo.mmdns.WebConfig;
import com.tantanapp.common.utils.CrashHelper;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.function.Consumer;
import l.du2;
import l.hpd0;
import l.uqd0;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class i0c {

    /* JADX INFO: renamed from: a */
    public static volatile boolean f14160a = false;

    /* JADX INFO: renamed from: b */
    public static Set<String> f14161b = new HashSet();

    /* JADX INFO: renamed from: c */
    public static hpd0 f14162c = new hpd0("forceUseHttpDns", Boolean.FALSE);

    /* JADX INFO: renamed from: d */
    public static uqd0 f14163d = new uqd0("android_http_dns", "{}");

    /* JADX INFO: renamed from: l.i0c$a */
    public class C0821a extends WebConfig {
        public boolean canRedirect(WebView webView, URL url, Uri uri, String str) {
            return (TextUtils.isEmpty(str) || !str.contains("html") || TextUtils.equals(uri.getPath(), url.getPath()) || TextUtils.equals("cs.immomo.com", uri.getHost())) ? false : true;
        }
    }

    /* JADX INFO: renamed from: l.i0c$b */
    public class C0822b implements MDDNSEntrance.LibraryLoader {
        public void loadLibrary(String str) throws UnsatisfiedLinkError {
            System.loadLibrary(str);
            MDLog.v("MMDNS", "System.loadLibrary(%s) success", new Object[]{str});
        }
    }

    /* JADX INFO: renamed from: l.i0c$d */
    public class C0824d implements Consumer<String> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ ArrayList f14164a;

        public C0824d(ArrayList arrayList) {
            this.f14164a = arrayList;
        }

        @Override // java.util.function.Consumer
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void accept(String str) {
            this.f14164a.add(uel.INSTANCE.m25202e(str));
        }
    }

    /* JADX INFO: renamed from: a */
    public static boolean m16414a() {
        String str = (String) f14163d.get();
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            return new JSONObject(str).optBoolean("enableHttpDns");
        } catch (Exception e) {
            CrashHelper.c(e);
            return false;
        }
    }

    /* JADX INFO: renamed from: b */
    public static boolean m16415b() {
        String str = (String) f14163d.get();
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            return new JSONObject(str).optBoolean("enableWebViewHttpDns");
        } catch (Exception e) {
            CrashHelper.c(e);
            return false;
        }
    }

    /* JADX INFO: renamed from: c */
    public static String m16416c(ArrayList<String> arrayList) {
        StringBuilder sb = new StringBuilder();
        Iterator<String> it = arrayList.iterator();
        while (it.hasNext()) {
            sb.append(it.next());
            sb.append(",");
        }
        if (sb.length() > 0) {
            sb.deleteCharAt(sb.length() - 1);
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: d */
    public static ArrayList<String> m16417d() {
        String str = (String) f14163d.get();
        ArrayList<String> arrayList = new ArrayList<>(3);
        if (!TextUtils.isEmpty(str)) {
            try {
                JSONArray jSONArray = new JSONObject(str).getJSONArray("domains");
                for (int i = 0; i < jSONArray.length(); i++) {
                    arrayList.add(jSONArray.getString(i));
                }
            } catch (Exception e) {
                CrashHelper.c(e);
            }
            if (uel.INSTANCE.m25199b()) {
                ArrayList arrayList2 = new ArrayList();
                arrayList.forEach(new C0824d(arrayList2));
                arrayList.addAll(arrayList2);
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: e */
    public static void m16418e(Context context, List<String> list) {
        if (f14160a) {
            f14161b.addAll(list);
            MDDNSEntrance.getInstance().addWhiteHostList(f14161b);
            return;
        }
        DNSManager.setWebConfig(new C0821a());
        MDDNSEntrance.setLibraryLoader(new C0822b());
        ArrayList<String> arrayListM16417d = m16417d();
        MDDNSEntrance.getInstance().initDNSConfig(context, new oph0(m16416c(arrayListM16417d)), "main");
        MDDNSEntrance.getInstance().openDNS(true);
        MDDNSEntrance.getInstance().openAll(false);
        f14161b.addAll(arrayListM16417d);
        f14161b.addAll(list);
        MDDNSEntrance.getInstance().addWhiteHostList(f14161b);
        MDDNSEntrance.getInstance().setUploadLogger(new C0823c());
        f14160a = true;
        qib0.f19784H.useNewConnectionPool();
        qib0.f19782G.p();
        du2.a("[common][network]", "DNSHelper httpdns init");
    }

    /* JADX INFO: renamed from: l.i0c$c */
    public class C0823c implements MDDNSEntrance.ILogger {
        public void upload(String str, JSONArray jSONArray) {
            if (da20.m13869g().m13874i()) {
                HashMap map = new HashMap();
                map.put("uid", qib0.f19805c0.userId());
                map.put("os", "Android");
                map.put("ver", "7.2.7");
                map.put(str, jSONArray.toString());
                qib0.f19787K.m13807d(map);
            }
        }

        public void upload(String str, JSONObject jSONObject) {
            if (da20.m13869g().m13874i()) {
                HashMap map = new HashMap();
                map.put("uid", qib0.f19805c0.userId());
                map.put("os", "Android");
                map.put("ver", "7.2.7");
                map.put(str, jSONObject.toString());
                qib0.f19787K.m13807d(map);
            }
        }
    }
}
