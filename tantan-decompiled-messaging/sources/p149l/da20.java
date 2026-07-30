package p149l;

import android.text.TextUtils;
import com.p046p1.mobile.putong.data.NetReportSetting;
import com.p046p1.mobile.putong.remote_config.RemoteConfig;
import com.tantanapp.common.network.NetworkTrackInfo;
import com.tantanapp.common.utils.NullChecker;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public class da20 {

    /* JADX INFO: renamed from: c */
    public static final qif0<da20> f85177c = new C16321a();

    /* JADX INFO: renamed from: a */
    public volatile NetReportSetting f85178a;

    /* JADX INFO: renamed from: b */
    public volatile List<String> f85179b;

    /* JADX INFO: renamed from: l.da20$a */
    public class C16321a extends qif0<da20> {
        @Override // p149l.qif0
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public da20 mo79337a() {
            return new da20();
        }
    }

    public da20() {
        m110544k();
        RemoteConfig.m79284Y().filter(new w9j() { // from class: l.ba20
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(((RemoteConfig.ConfigStep) obj) == RemoteConfig.ConfigStep.USER);
            }
        }).subscribe(mkd0.m154955G(new e30() { // from class: l.ca20
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f79997a.m110543j((RemoteConfig.ConfigStep) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ Boolean m110536c(String str, String str2) {
        return str.startsWith(str2) ? Boolean.TRUE : Boolean.FALSE;
    }

    /* JADX INFO: renamed from: g */
    public static da20 m110537g() {
        return f85177c.m174875b();
    }

    /* JADX INFO: renamed from: d */
    public boolean m110538d(NetworkTrackInfo networkTrackInfo) {
        NetReportSetting netReportSetting = this.f85178a;
        if (netReportSetting == null) {
            return true;
        }
        if (!netReportSetting.enableNetReport) {
            return false;
        }
        final String strReplace = networkTrackInfo.getRequestUrl().replace("http://", "").replace("https://", "").replace(mu5.m156378c(), "tantanapp");
        if (!vwb.m200337m(this.f85179b, new w9j() { // from class: l.aa20
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return da20.m110536c(strReplace, (String) obj);
            }
        })) {
            return false;
        }
        try {
            if (Integer.parseInt(networkTrackInfo.getResponseCode()) / 100 == 2) {
                if (zbc0.m217836b(100) < netReportSetting.androidSuccessRate) {
                    return true;
                }
            } else if (zbc0.m217836b(100) < netReportSetting.androidErrorRate) {
                return true;
            }
            return false;
        } catch (NumberFormatException unused) {
            return true;
        }
    }

    /* JADX INFO: renamed from: e */
    public int m110539e() {
        NetReportSetting netReportSetting = this.f85178a;
        if (netReportSetting == null) {
            return 0;
        }
        return netReportSetting.androidHttpdnsLogRate;
    }

    /* JADX INFO: renamed from: f */
    public final String m110540f(stc0 stc0Var) {
        return stc0Var == null ? "" : stc0Var.m185881k().m107522m().replace(mu5.m156378c(), "tantanapp");
    }

    /* JADX INFO: renamed from: h */
    public String m110541h(stc0 stc0Var, String str) {
        NetReportSetting netReportSetting = this.f85178a;
        if (NullChecker.m81303a(netReportSetting)) {
            String strM110540f = m110540f(stc0Var);
            if (netReportSetting.domains.media.contains(strM110540f)) {
                return "media";
            }
            if (netReportSetting.domains.api.contains(strM110540f)) {
                return "api";
            }
        }
        return str;
    }

    /* JADX INFO: renamed from: i */
    public boolean m110542i() {
        NetReportSetting netReportSetting = this.f85178a;
        if (netReportSetting == null) {
            return false;
        }
        return netReportSetting.enableAndroidHttpdnsLogReport;
    }

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ void m110543j(RemoteConfig.ConfigStep configStep) {
        m110544k();
    }

    /* JADX INFO: renamed from: k */
    public final void m110544k() {
        String strM79302F = RemoteConfig.m79298x().m79302F("net_report_settings");
        ArrayList arrayList = new ArrayList();
        if (TextUtils.isEmpty(strM79302F)) {
            this.f85178a = null;
            return;
        }
        try {
            this.f85178a = NetReportSetting.JSON_ADAPTER.parse(strM79302F);
            if (NullChecker.m81303a(this.f85178a)) {
                arrayList.addAll(this.f85178a.domains.api);
                arrayList.addAll(this.f85178a.domains.media);
            }
        } catch (IOException unused) {
        }
        this.f85179b = arrayList;
    }
}
