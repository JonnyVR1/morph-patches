package p149l;

import com.idv.identity.platform.api.IdentityPlatform;
import com.idv.identity.platform.log.RecordLevel;
import com.idv.identity.platform.log.RecordService;
import com.tencent.could.huiyansdk.overseas.HuiYanResultSender;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TimeZone;

/* JADX INFO: loaded from: classes7.dex */
public class kb20 {

    /* JADX INFO: renamed from: k */
    private static final Map<String, String> f122183k;

    /* JADX INFO: renamed from: l */
    private static final Map<String, List<String>> f122184l;

    /* JADX INFO: renamed from: m */
    public static final Map<String, String> f122185m;

    /* JADX INFO: renamed from: a */
    public String f122186a;

    /* JADX INFO: renamed from: b */
    public String f122187b;

    /* JADX INFO: renamed from: c */
    public String f122188c;

    /* JADX INFO: renamed from: d */
    public String f122189d;

    /* JADX INFO: renamed from: e */
    public String f122190e;

    /* JADX INFO: renamed from: f */
    public String f122191f;

    /* JADX INFO: renamed from: g */
    public List<String> f122192g;

    /* JADX INFO: renamed from: h */
    public List<String> f122193h;

    /* JADX INFO: renamed from: i */
    public List<String> f122194i;

    /* JADX INFO: renamed from: j */
    public List<String> f122195j;

    /* JADX INFO: renamed from: l.kb20$b */
    public static class C17976b {
        private static final kb20 INSTANCE = new kb20();
    }

    static {
        HashMap map = new HashMap();
        f122183k = map;
        HashMap map2 = new HashMap();
        f122184l = map2;
        HashMap map3 = new HashMap();
        f122185m = map3;
        map2.put("hk", new ArrayList(Arrays.asList("auth-hk.authidv.com", "auth-hk-g.yuncloudauth.com")));
        map2.put("id", new ArrayList(Arrays.asList("auth-id.authidv.com", "auth-id-g.yuncloudauth.com")));
        map2.put("sg", new ArrayList(Arrays.asList("auth-sg.authidv.com", "auth-sg-g.yuncloudauth.com")));
        map2.put("my", new ArrayList(Arrays.asList("auth-my.authidv.com", "auth-my-g.yuncloudauth.com")));
        map.put("hk", IdentityPlatform.CLOUD_HOST);
        map.put("id", "cloudauth-intl.ap-southeast-5.aliyuncs.com");
        map.put("sg", "cloudauth-intl.ap-southeast-1.aliyuncs.com");
        map.put("de", "cloudauth-intl.eu-central-1.aliyuncs.com");
        map.put("my", "cloudauth-intl.ap-southeast-3.aliyuncs.com");
        map3.put("-02:00", "cloudauth-intl-us-east-1.yunverify.com");
        map3.put("-03:00", "cloudauth-intl-us-east-1.yunverify.com");
        map3.put("-04:00", "cloudauth-intl-us-east-1.yunverify.com");
        map3.put("-05:00", "cloudauth-intl-us-east-1.yunverify.com");
        map3.put("-06:00", "cloudauth-intl-us-west-1.yunverify.com");
        map3.put("-07:00", "cloudauth-intl-us-west-1.yunverify.com");
        map3.put("-08:00", "cloudauth-intl-us-west-1.yunverify.com");
        map3.put("-09:00", "cloudauth-intl-us-west-1.yunverify.com");
        map3.put("-10:00", "cloudauth-intl-us-west-1.yunverify.com");
        map3.put("-11:00", "cloudauth-intl-us-west-1.yunverify.com");
        map3.put("-12:00", "cloudauth-intl-us-west-1.yunverify.com");
        map3.put("+00:00", "cloudauth-intl-eu-central-1.yunverify.com");
        map3.put("+01:00", "cloudauth-intl-eu-central-1.yunverify.com");
        map3.put("+02:00", "cloudauth-intl-eu-central-1.yunverify.com");
        map3.put("+03:00", "cloudauth-intl-me-central-1.yunverify.com");
        map3.put("+04:00", "cloudauth-intl-me-central-1.yunverify.com");
        map3.put("+05:00", IdentityPlatform.CLOUD_HOST);
        map3.put("+06:00", IdentityPlatform.CLOUD_HOST);
        map3.put("+07:00", IdentityPlatform.CLOUD_HOST);
        map3.put("+08:00", IdentityPlatform.CLOUD_HOST);
        map3.put("+09:00", IdentityPlatform.CLOUD_HOST);
        map3.put("+10:00", IdentityPlatform.CLOUD_HOST);
        map3.put("+11:00", IdentityPlatform.CLOUD_HOST);
        map3.put("+12:00", IdentityPlatform.CLOUD_HOST);
    }

    private kb20() {
        this.f122192g = new ArrayList();
        this.f122193h = new ArrayList();
        this.f122194i = new ArrayList();
        this.f122195j = new ArrayList();
    }

    /* JADX INFO: renamed from: b */
    public static kb20 m145197b() {
        return C17976b.INSTANCE;
    }

    /* JADX INFO: renamed from: c */
    public static kb20 m145198c(String str) {
        if (str == null || str.length() < 2) {
            RecordService.getInstance().recordEvent(RecordLevel.LOG_ERROR, "initEnvironment", "transactionId", str, "errMsg", "transactionId is null or empty");
            return null;
        }
        String strSubstring = str.substring(0, 2);
        String str2 = f122183k.get(strSubstring);
        List<String> list = f122184l.get(strSubstring);
        kb20 kb20VarM145197b = m145197b();
        if (str2 == null) {
            RecordService.getInstance().recordEvent(RecordLevel.LOG_ERROR, "initEnvironment", "transactionId", str, "errMsg", "transactionId Illegal prefix");
            return null;
        }
        kb20VarM145197b.f122187b = "https://".concat(str2);
        kb20VarM145197b.f122186a = str2;
        if (list != null) {
            kb20VarM145197b.f122195j = list;
            kb20VarM145197b.f122194i.clear();
            for (String str3 : list) {
                kb20VarM145197b.f122194i.add("https://" + str3);
            }
        }
        if (strSubstring.equals("hk")) {
            m145201g(kb20VarM145197b);
        }
        RecordService.getInstance().recordEvent(RecordLevel.LOG_ERROR, "initEnvironment", "networkEnv", kb20VarM145197b.toString());
        return kb20VarM145197b;
    }

    /* JADX INFO: renamed from: d */
    private static String m145199d() {
        return TimeZone.getDefault().getID();
    }

    /* JADX INFO: renamed from: e */
    private static String m145200e() {
        int offset = TimeZone.getDefault().getOffset(System.currentTimeMillis());
        int i = offset / 3600000;
        int iAbs = Math.abs((offset / HuiYanResultSender.TIMEOUT_MS) % 60);
        ixq0.m138885b("Current UTC Offset", "UTC  ".concat(String.format("%+03d:%02d", Integer.valueOf(i), Integer.valueOf(iAbs))));
        return String.format("%+03d:%02d", Integer.valueOf(i), Integer.valueOf(iAbs));
    }

    /* JADX INFO: renamed from: g */
    private static kb20 m145201g(kb20 kb20Var) {
        kb20Var.f122188c = "https://cloudauth-intl-hk.yuncloudauth.com";
        kb20Var.f122189d = "cloudauth-intl-hk.yuncloudauth.com";
        String strM145199d = m145199d();
        if (strM145199d != null) {
            if (strM145199d.startsWith("Europe/")) {
                kb20Var.f122187b = "https://cloudauth-intl-eu-central-1.yunverify.com";
                kb20Var.f122186a = "cloudauth-intl-eu-central-1.yunverify.com";
            } else if (strM145199d.equals("Asia/Manila")) {
                kb20Var.f122187b = "https://cloudauth-intl-ap-southeast-6.yunverify.com";
                kb20Var.f122186a = "cloudauth-intl-ap-southeast-6.yunverify.com";
            } else if (strM145199d.equals("Asia/Kuala_Lumpur")) {
                kb20Var.f122187b = "https://cloudauth-intl-ap-southeast-3.yunverify.com";
                kb20Var.f122186a = "cloudauth-intl-ap-southeast-3.yunverify.com";
            } else if (strM145199d.equals("Asia/Singapore")) {
                kb20Var.f122187b = "https://cloudauth-intl-ap-southeast-1.yunverify.com";
                kb20Var.f122186a = "cloudauth-intl-ap-southeast-1.yunverify.com";
            } else if (strM145199d.equals("Asia/Jakarta") || strM145199d.equals("Asia/Makassar") || strM145199d.equals("Asia/Jayapura")) {
                kb20Var.f122187b = "https://cloudauth-intl-ap-southeast-5.yunverify.com";
                kb20Var.f122186a = "cloudauth-intl-ap-southeast-5.yunverify.com";
            } else {
                Map<String, String> map = f122185m;
                if (map.containsKey(m145200e())) {
                    kb20Var.f122187b = "https://" + map.get(m145200e());
                    kb20Var.f122186a = map.get(m145200e());
                } else {
                    kb20Var.f122187b = IdentityPlatform.CLOUD_AUTH_HK;
                    kb20Var.f122186a = IdentityPlatform.CLOUD_HOST;
                }
            }
            RecordService.getInstance().recordEvent(RecordLevel.LOG_INFO, "NET_WORK_ENV", "timeZoneId", strM145199d, "safUrl", kb20Var.f122187b, "safHost", kb20Var.f122186a);
        }
        return kb20Var;
    }

    /* JADX INFO: renamed from: a */
    public void m145202a() {
        this.f122186a = null;
        this.f122187b = null;
        this.f122190e = null;
        this.f122188c = null;
        this.f122189d = null;
        this.f122191f = null;
        this.f122192g.clear();
        this.f122193h.clear();
        this.f122194i.clear();
        this.f122195j.clear();
    }

    /* JADX INFO: renamed from: f */
    public void m145203f(List<String> list) {
        if (list == null || list.isEmpty()) {
            return;
        }
        this.f122192g = list;
        this.f122193h.clear();
        for (String str : list) {
            this.f122193h.add("https://" + str);
        }
    }

    public String toString() {
        return "NetworkEnv{safHost='" + this.f122186a + "', safUrl='" + this.f122187b + "', appKey='" + this.f122190e + "', safBackupUrl='" + this.f122188c + "', safBackupHost='" + this.f122189d + "', cfDomainHosts=" + this.f122192g + "', cfDomainUrls=" + this.f122193h + "', cfDomainsBackupUrls=" + this.f122194i + "', cfDomainBackupHosts=" + this.f122195j + "', appSecret='" + this.f122191f + "'}";
    }
}
