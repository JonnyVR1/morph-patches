package p149l;

import android.content.Context;
import android.text.TextUtils;
import com.facebook.AuthenticationTokenClaims;
import com.fasterxml.jackson.core.util.MinimalPrettyPrinter;
import java.net.URL;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes7.dex */
public class dmc0 {

    /* JADX INFO: renamed from: j */
    private static dmc0 f86916j;

    /* JADX INFO: renamed from: a */
    private Context f86917a;

    /* JADX INFO: renamed from: b */
    private umw f86918b;

    /* JADX INFO: renamed from: d */
    private ljm f86920d;

    /* JADX INFO: renamed from: c */
    private final HashMap<String, nkl> f86919c = new HashMap<>();

    /* JADX INFO: renamed from: e */
    private long f86921e = 0;

    /* JADX INFO: renamed from: f */
    private AtomicBoolean f86922f = new AtomicBoolean(false);

    /* JADX INFO: renamed from: g */
    private boolean f86923g = true;

    /* JADX INFO: renamed from: h */
    private List<Object> f86924h = null;

    /* JADX INFO: renamed from: i */
    private final String f86925i = "{\n\"idc\":{\n\"api.immomo.com\":  [{\"host\":\"39.107.213.191\", \"weight\":\"3\"}, {\"host\":\"43.231.167.27\", \"weight\":\"3\"}],\n\"api-young.immomo.com\":  [{\"host\":\"39.107.213.191\", \"weight\":\"3\"}, {\"host\":\"43.231.167.27\", \"weight\":\"3\"}],\n\"api-nineteen.immomo.com\":  [{\"host\":\"39.107.213.191\", \"weight\":\"3\"}, {\"host\":\"43.231.167.27\", \"weight\":\"3\"}],\n\"api-security.immomo.com\":  [{\"host\":\"39.107.213.191\", \"weight\":\"3\"}, {\"host\":\"43.231.167.27\", \"weight\":\"3\"}],\n\"api-alpha.immomo.com\":  [{\"host\":\"43.231.167.212\", \"weight\":\"3\"}],\n\"mk-alpha.immomo.com\":  [{\"host\":\"43.231.167.213\", \"weight\":\"1\"}],\n\"game.immomo.com\":  [{\"host\":\"43.231.167.235\", \"weight\":\"1\"}],\n\"cm.immomo.com\":  [{\"host\":\"43.231.167.179\", \"weight\":\"1\"}],\n\"paas-push-ap.immomo.com\":  [{\"host\":\"43.231.168.12\", \"weight\":\"1\"}, {\"host\":\"43.231.168.14\", \"weight\":\"1\"}, {\"host\":\"39.107.148.238\", \"weight\":\"1\"}, {\"host\":\"47.95.67.136\", \"weight\":\"1\"}, {\"host\":\"39.107.211.244\", \"weight\":\"1\"}, {\"host\":\"39.107.212.189\", \"weight\":\"1\"}, {\"host\":\"39.107.212.125\", \"weight\":\"1\"}, {\"host\":\"39.107.212.245\", \"weight\":\"1\"}, {\"host\":\"39.107.212.82\", \"weight\":\"1\"}],\n\"paas-push-api.immomo.com\": [{\"host\":\"43.231.167.215\", \"weight\":\"1\"}],\n\"cosmos-im-ap.immomo.com\": [{\"host\":\"43.231.168.49\", \"weight\":\"1\"},{\"host\":\"43.231.168.48\", \"weight\":\"1\"},{\"host\":\"123.57.114.21\", \"weight\":\"1\"}],\n\"cosmos-compass-api.immomo.com\":  [{\"host\":\"43.231.167.222\", \"weight\":\"1\"}],\n\"cosmos-cv-api.immomo.com\":  [{\"host\":\"43.231.167.160\", \"weight\":\"1\"}],\n\"cosmos-video-api.immomo.com\":  [{\"host\":\"43.231.167.161\", \"weight\":\"1\"}],\n\"www.immomo.com\":  [{\"host\":\"43.231.167.231\", \"weight\":\"1\"}],\n\"passport.immomo.com\":  [{\"host\":\"43.231.167.140\", \"weight\":\"1\"}],\n\"tips.immomo.com\":  [{\"host\":\"39.97.8.18\", \"weight\":\"1\"}],\n\"mg-api.immomo.com\":  [{\"host\":\"39.97.196.161\", \"weight\":\"1\"}],\n\"s.immomo.com\":  [{\"host\":\"39.97.8.209\", \"weight\":\"1\"}],\n\"mvip.immomo.com\":  [{\"host\":\"39.97.193.134\", \"weight\":\"1\"}],\n\"mms.immomo.com\":  [{\"host\":\"39.97.24.47\", \"weight\":\"1\"}],\n\"bm.immomo.com\":  [{\"host\":\"43.231.167.225\", \"weight\":\"1\"}],\n\"game-api.immomo.com\":  [{\"host\":\"43.231.167.233\", \"weight\":\"1\"}],\n\"file-api.immomo.com\":  [{\"host\":\"39.107.213.191\", \"weight\":\"3\"}, {\"host\":\"43.231.167.27\", \"weight\":\"3\"}],\n\"m.immomo.com\":  [{\"host\":\"43.231.167.227\", \"weight\":\"1\"}],\n\"oauth.immomo.com\":  [{\"host\":\"43.231.167.216\", \"weight\":\"3\"}],\n\"ap.immomo.com\":  [{\"host\":\"43.231.168.10\", \"weight\":\"1\"},{\"host\":\"47.95.70.60\", \"weight\":\"1\"}, {\"host\":\"47.95.70.147\", \"weight\":\"1\"}, {\"host\":\"47.95.70.224\", \"weight\":\"1\"}, {\"host\":\"47.95.70.59\", \"weight\":\"1\"}, {\"host\":\"47.95.70.94\", \"weight\":\"1\"}, {\"host\":\"47.95.70.174\", \"weight\":\"1\"}, {\"host\":\"47.95.70.131\", \"weight\":\"1\"}, {\"host\":\"47.95.70.40\", \"weight\":\"1\"}, {\"host\":\"39.107.213.50\", \"weight\":\"1\"}, {\"host\":\"39.107.213.49\", \"weight\":\"1\"}],\n\"live-api.immomo.com\":  [{\"host\":\"39.97.7.233\", \"weight\":\"1\"}],\n\"live-api.liuxing.im\":  [{\"host\":\"39.97.7.233\", \"weight\":\"1\"}],\n\"live-log.immomo.com\":  [{\"host\":\"47.95.99.252\", \"weight\":\"1\"}],\n\"live-ws.immomo.com\":  [{\"host\":\"39.97.193.166\", \"weight\":\"1\"}],\n\"live-web.immomo.com\":  [{\"host\":\"43.231.167.137\", \"weight\":\"1\"}],\n\"live-m.immomo.com\":  [{\"host\":\"43.231.167.138\", \"weight\":\"1\"}],\n\"schedule-media.immomo.com\":  [{\"host\":\"39.103.12.68\", \"weight\":\"1\"}],\n\"sla-media.immomo.com\":  [{\"host\":\"39.103.12.70\", \"weight\":\"1\"}],\n\"mk.immomo.com\": [{\"host\":\"43.231.167.214\",\"weight\":\"1\"}],\n\"mk-nineteen.immomo.com\": [{\"host\":\"43.231.167.214\",\"weight\":\"1\"}],\n\"api-vip.immomo.com\": [{\"host\":\"43.231.167.237\",\"weight\":\"1\"}],\n\"connperf.immomo.com\": [{\"host\":\"43.231.167.243\",\"weight\":\"1\"}],\n\"httpdns.immomo.com\": [{\"host\":\"39.107.213.188\",\"weight\":\"1\"}],\n\"cosmos-lua.immomo.com\": [{\"host\":\"43.231.167.240\",\"weight\":\"1\"}],\n\"lrs.immomogame.com\": [{\"host\":\"lrs-cs-netback.immomogame.com\",\"weight\":\"1\"}],\n\"mmmj.immomogame.com\": [{\"host\":\"mmmj-netback.immomogame.com\",\"weight\":\"1\"}],\n\"www.immomogame.com\": [{\"host\":\"s.immomogame.com\",\"weight\":\"1\"}]\n},\n\"cdn\":{\n\"et.momocdn.com\": [\"et-tx-referee.momocdn.com\", \"etalicdn.momocdn.com\"],\n\"img.momocdn.com\": [\"momo-img.qiniucdn.com\", \"imgali.momocdn.com\"],\n\"cdnst.momocdn.com\": [\"cdnstqn.momocdn.com\", \"cdnstalicdn.wemomo.com\"],\n\"s.momocdn.com\": [\"cdnstqn.momocdn.com\", \"cdnstalicdn.wemomo.com\"],\n\"g.momocdn.com\": [\"momo-g.qiniucdn.com\", \"gali.momocdn.com\"],\n\"download.immomo.com\": [\"dl.doki.ren\", \"momo-dl.qiniucdn.com\"],\n\"mj-cdn.immomogame.com\": [\"mmmj-cdn-tencent.immomogame.com\"],\n\"video.momocdn.com\": [\"momo-img.qiniucdn.com\",\"videows.momocdn.com\",\"videoali.momocdn.com\",\"videoqn.momocdn.com\"],\n\"crk.momocdn.com\": [\"crkws.momocdn.com\",\"crkali.momocdn.com\",\"crkqn.momocdn.com\"],\n\"s-dy.momocdn.com\": [\"s-dyali.momocdn.com\",\"s-dy3t.momocdn.com\"],\n\"img-dy.momocdn.com\": [\"img-dyali.momocdn.com\",\"img-dy3t.momocdn.com\"]\n},\n\"ap\":{\n\"port\":[443, 5222, 8080]\n},\n\"paas-push-ap\":{\n\"port\":[8081, 8082, 8083, 8084, 8085, 8086]\n},\n\"cosmos-im-ap\":{\n\"port\":[8001, 8002, 8003, 8004, 8005, 8006]\n},\n\"referee.immomo.com\": [\"43.231.167.197\"],\n\"ec\": 0,\n\"em\": \"success\",\n\"ok\": \"true\",\n\"referee_update_interval\": 86400,\n\"enable_new_referee\": true,\n\"clean_current_available_address\": 1,\n\"max_ct\": 350,\n\"version\": 196,\n\"ap_fails\": 2,\n\"idc_fails\": 1,\n\"cdn_fails\": 3,\n\"referee_fails\": 1,\n\"mas\": {\n\"last_number\": [\"5\"]\n},\n\"cna\":{\n\"last_numbers\": [\"3\", \"4\", \"5\", \"6\", \"9\"],\n\"last_did\": [\"d3\"],\n\"ratio\": 60,\n\"ignore_ratio\": [],\n\"total\": 10000,\n\"intervals\": 240,\n\"start_u\": 1,\n\"lock_u\": 1,\n\"backgroud_u\": 1\n}\n}";

    private dmc0() {
        this.f86920d = null;
        this.f86920d = new ljm("ap.immomo.com", 19);
    }

    /* JADX INFO: renamed from: b */
    private void m112453b(boolean z, boolean z2, cf50 cf50Var) {
        if (cf50Var != null) {
            cf50Var.mo106485a();
        }
    }

    /* JADX INFO: renamed from: c */
    private String m112454c(String str) {
        HashMap<String, String> map;
        umw umwVar = this.f86918b;
        String str2 = (umwVar == null || (map = umwVar.f177315j) == null || map.size() <= 0) ? null : map.get(str);
        if (TextUtils.isEmpty(str2)) {
            return str;
        }
        cmc0.m107606a("使用备用域名 " + str + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR + str2);
        return str2;
    }

    /* JADX INFO: renamed from: e */
    public static dmc0 m112455e() {
        if (f86916j == null) {
            f86916j = new dmc0();
        }
        return f86916j;
    }

    /* JADX INFO: renamed from: l */
    private boolean m112456l() {
        return System.currentTimeMillis() - this.f86921e > AuthenticationTokenClaims.MAX_TIME_SINCE_TOKEN_ISSUED;
    }

    /* JADX INFO: renamed from: a */
    public void m112457a(boolean z, cf50 cf50Var) {
        m112453b(z, false, cf50Var);
    }

    /* JADX INFO: renamed from: d */
    public Context m112458d() {
        return this.f86917a;
    }

    /* JADX INFO: renamed from: f */
    public int m112459f() {
        umw umwVar = this.f86918b;
        if (umwVar != null) {
            return umwVar.m194409a();
        }
        return 2;
    }

    /* JADX INFO: renamed from: g */
    public int m112460g() {
        umw umwVar = this.f86918b;
        if (umwVar != null) {
            return umwVar.m194410b();
        }
        return 10000;
    }

    /* JADX INFO: renamed from: h */
    public String m112461h(String str) {
        try {
            String host = new URL(str).getHost();
            if (!this.f86923g) {
                return host;
            }
            nkl nklVar = this.f86919c.get(host);
            String strM170878c = nklVar != null ? nklVar.m170878c() : "";
            if (!TextUtils.isEmpty(strM170878c) && !TextUtils.equals(host, strM170878c)) {
                return strM170878c;
            }
            return m112454c(host);
        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }
    }

    /* JADX INFO: renamed from: i */
    public boolean m112462i() {
        return this.f86923g;
    }

    /* JADX INFO: renamed from: j */
    public void m112463j(boolean z) {
        this.f86923g = z;
    }

    /* JADX INFO: renamed from: k */
    public void m112464k(String str) {
        umw umwVar = this.f86918b;
        if (umwVar != null) {
            umwVar.m194411c(str);
        }
    }

    /* JADX INFO: renamed from: m */
    public void m112465m(String str) {
        cmc0.m107607b("tang-----triggerSwitch " + str);
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            nkl nklVar = this.f86919c.get((str.startsWith("http://") || str.startsWith("https://")) ? new URL(str).getHost() : str);
            if (nklVar != null) {
                nklVar.m159976O(str);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* JADX INFO: renamed from: n */
    public boolean m112466n(boolean z, cf50 cf50Var) {
        if ((this.f86922f.get() || !m112456l()) && !cmc0.m107608c()) {
            cmc0.m107607b("10分钟内只能更新一次Referee");
            return false;
        }
        this.f86921e = System.currentTimeMillis();
        cmc0.m107606a("更新Referee");
        m112453b(true, z, cf50Var);
        return true;
    }
}
