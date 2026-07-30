package p153l;

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
public class tj20 {

    /* JADX INFO: renamed from: k */
    private static final Map<String, String> f174524k;

    /* JADX INFO: renamed from: l */
    private static final Map<String, List<String>> f174525l;

    /* JADX INFO: renamed from: m */
    public static final Map<String, String> f174526m;

    /* JADX INFO: renamed from: a */
    public String f174527a;

    /* JADX INFO: renamed from: b */
    public String f174528b;

    /* JADX INFO: renamed from: c */
    public String f174529c;

    /* JADX INFO: renamed from: d */
    public String f174530d;

    /* JADX INFO: renamed from: e */
    public String f174531e;

    /* JADX INFO: renamed from: f */
    public String f174532f;

    /* JADX INFO: renamed from: g */
    public List<String> f174533g;

    /* JADX INFO: renamed from: h */
    public List<String> f174534h;

    /* JADX INFO: renamed from: i */
    public List<String> f174535i;

    /* JADX INFO: renamed from: j */
    public List<String> f174536j;

    /* JADX INFO: renamed from: l.tj20$b */
    public static class C20331b {
        private static final tj20 INSTANCE = new tj20();
    }

    static {
        HashMap map = new HashMap();
        f174524k = map;
        HashMap map2 = new HashMap();
        f174525l = map2;
        HashMap map3 = new HashMap();
        f174526m = map3;
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

    private tj20() {
        this.f174533g = new ArrayList();
        this.f174534h = new ArrayList();
        this.f174535i = new ArrayList();
        this.f174536j = new ArrayList();
    }

    /* JADX INFO: renamed from: b */
    public static tj20 m191354b() {
        return C20331b.INSTANCE;
    }

    /* JADX INFO: renamed from: c */
    public static tj20 m191355c(String str) {
        if (str == null || str.length() < 2) {
            RecordService.getInstance().recordEvent(RecordLevel.LOG_ERROR, "initEnvironment", "transactionId", str, "errMsg", "transactionId is null or empty");
            return null;
        }
        String strSubstring = str.substring(0, 2);
        String str2 = f174524k.get(strSubstring);
        List<String> list = f174525l.get(strSubstring);
        tj20 tj20VarM191354b = m191354b();
        if (str2 == null) {
            RecordService.getInstance().recordEvent(RecordLevel.LOG_ERROR, "initEnvironment", "transactionId", str, "errMsg", "transactionId Illegal prefix");
            return null;
        }
        tj20VarM191354b.f174528b = "https://".concat(str2);
        tj20VarM191354b.f174527a = str2;
        if (list != null) {
            tj20VarM191354b.f174536j = list;
            tj20VarM191354b.f174535i.clear();
            for (String str3 : list) {
                tj20VarM191354b.f174535i.add("https://" + str3);
            }
        }
        if (strSubstring.equals("hk")) {
            m191358g(tj20VarM191354b);
        }
        RecordService.getInstance().recordEvent(RecordLevel.LOG_ERROR, "initEnvironment", "networkEnv", tj20VarM191354b.toString());
        return tj20VarM191354b;
    }

    /* JADX INFO: renamed from: d */
    private static String m191356d() {
        return TimeZone.getDefault().getID();
    }

    /* JADX INFO: renamed from: e */
    private static String m191357e() {
        int offset = TimeZone.getDefault().getOffset(System.currentTimeMillis());
        int i = offset / 3600000;
        int iAbs = Math.abs((offset / HuiYanResultSender.TIMEOUT_MS) % 60);
        o6r0.m166282b("Current UTC Offset", "UTC  ".concat(String.format("%+03d:%02d", Integer.valueOf(i), Integer.valueOf(iAbs))));
        return String.format("%+03d:%02d", Integer.valueOf(i), Integer.valueOf(iAbs));
    }

    /* JADX INFO: renamed from: g */
    private static tj20 m191358g(tj20 tj20Var) {
        tj20Var.f174529c = "https://cloudauth-intl-hk.yuncloudauth.com";
        tj20Var.f174530d = "cloudauth-intl-hk.yuncloudauth.com";
        String strM191356d = m191356d();
        if (strM191356d != null) {
            if (strM191356d.startsWith("Europe/")) {
                tj20Var.f174528b = "https://cloudauth-intl-eu-central-1.yunverify.com";
                tj20Var.f174527a = "cloudauth-intl-eu-central-1.yunverify.com";
            } else if (strM191356d.equals("Asia/Manila")) {
                tj20Var.f174528b = "https://cloudauth-intl-ap-southeast-6.yunverify.com";
                tj20Var.f174527a = "cloudauth-intl-ap-southeast-6.yunverify.com";
            } else if (strM191356d.equals("Asia/Kuala_Lumpur")) {
                tj20Var.f174528b = "https://cloudauth-intl-ap-southeast-3.yunverify.com";
                tj20Var.f174527a = "cloudauth-intl-ap-southeast-3.yunverify.com";
            } else if (strM191356d.equals("Asia/Singapore")) {
                tj20Var.f174528b = "https://cloudauth-intl-ap-southeast-1.yunverify.com";
                tj20Var.f174527a = "cloudauth-intl-ap-southeast-1.yunverify.com";
            } else if (strM191356d.equals("Asia/Jakarta") || strM191356d.equals("Asia/Makassar") || strM191356d.equals("Asia/Jayapura")) {
                tj20Var.f174528b = "https://cloudauth-intl-ap-southeast-5.yunverify.com";
                tj20Var.f174527a = "cloudauth-intl-ap-southeast-5.yunverify.com";
            } else {
                Map<String, String> map = f174526m;
                if (map.containsKey(m191357e())) {
                    tj20Var.f174528b = "https://" + map.get(m191357e());
                    tj20Var.f174527a = map.get(m191357e());
                } else {
                    tj20Var.f174528b = IdentityPlatform.CLOUD_AUTH_HK;
                    tj20Var.f174527a = IdentityPlatform.CLOUD_HOST;
                }
            }
            RecordService.getInstance().recordEvent(RecordLevel.LOG_INFO, "NET_WORK_ENV", "timeZoneId", strM191356d, "safUrl", tj20Var.f174528b, "safHost", tj20Var.f174527a);
        }
        return tj20Var;
    }

    /* JADX INFO: renamed from: a */
    public void m191359a() {
        this.f174527a = null;
        this.f174528b = null;
        this.f174531e = null;
        this.f174529c = null;
        this.f174530d = null;
        this.f174532f = null;
        this.f174533g.clear();
        this.f174534h.clear();
        this.f174535i.clear();
        this.f174536j.clear();
    }

    /* JADX INFO: renamed from: f */
    public void m191360f(List<String> list) {
        if (list == null || list.isEmpty()) {
            return;
        }
        this.f174533g = list;
        this.f174534h.clear();
        for (String str : list) {
            this.f174534h.add("https://" + str);
        }
    }

    public String toString() {
        return "NetworkEnv{safHost='" + this.f174527a + "', safUrl='" + this.f174528b + "', appKey='" + this.f174531e + "', safBackupUrl='" + this.f174529c + "', safBackupHost='" + this.f174530d + "', cfDomainHosts=" + this.f174533g + "', cfDomainUrls=" + this.f174534h + "', cfDomainsBackupUrls=" + this.f174535i + "', cfDomainBackupHosts=" + this.f174536j + "', appSecret='" + this.f174532f + "'}";
    }
}
