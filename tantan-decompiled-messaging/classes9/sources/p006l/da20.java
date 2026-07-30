package p006l;

import android.text.TextUtils;
import com.p1.mobile.putong.data.NetReportSetting;
import com.p1.mobile.putong.remote_config.RemoteConfig;
import com.tantanapp.common.network.NetworkTrackInfo;
import com.tantanapp.common.utils.NullChecker;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import l.e30;
import l.mkd0;
import l.qif0;
import l.stc0;
import l.vwb;
import l.w9j;
import l.zbc0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class da20 {

    /* JADX INFO: renamed from: c */
    public static final qif0<da20> f10246c = new C0632a();

    /* JADX INFO: renamed from: a */
    public volatile NetReportSetting f10247a;

    /* JADX INFO: renamed from: b */
    public volatile List<String> f10248b;

    /* JADX INFO: renamed from: l.da20$a */
    public class C0632a extends qif0<da20> {
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public da20 m13877a() {
            return new da20();
        }
    }

    public da20() {
        m13876k();
        RemoteConfig.Y().filter(new w9j() { // from class: l.ba20
            public final Object call(Object obj) {
                return Boolean.valueOf(((RemoteConfig.ConfigStep) obj) == RemoteConfig.ConfigStep.USER);
            }
        }).subscribe(mkd0.G(new e30() { // from class: l.ca20
            public final void call(Object obj) {
                this.f9551a.m13875j((RemoteConfig.ConfigStep) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ Boolean m13868c(String str, String str2) {
        return str.startsWith(str2) ? Boolean.TRUE : Boolean.FALSE;
    }

    /* JADX INFO: renamed from: g */
    public static da20 m13869g() {
        return (da20) f10246c.b();
    }

    /* JADX INFO: renamed from: d */
    public boolean m13870d(NetworkTrackInfo networkTrackInfo) {
        NetReportSetting netReportSetting = this.f10247a;
        if (netReportSetting == null) {
            return true;
        }
        if (!netReportSetting.enableNetReport) {
            return false;
        }
        final String strReplace = networkTrackInfo.getRequestUrl().replace("http://", "").replace("https://", "").replace(mu5.m19510c(), "tantanapp");
        if (!vwb.m(this.f10248b, new w9j() { // from class: l.aa20
            public final Object call(Object obj) {
                return da20.m13868c(strReplace, (String) obj);
            }
        })) {
            return false;
        }
        try {
            if (Integer.parseInt(networkTrackInfo.getResponseCode()) / 100 == 2) {
                if (zbc0.b(100) < netReportSetting.androidSuccessRate) {
                    return true;
                }
            } else if (zbc0.b(100) < netReportSetting.androidErrorRate) {
                return true;
            }
            return false;
        } catch (NumberFormatException unused) {
            return true;
        }
    }

    /* JADX INFO: renamed from: e */
    public int m13871e() {
        NetReportSetting netReportSetting = this.f10247a;
        if (netReportSetting == null) {
            return 0;
        }
        return netReportSetting.androidHttpdnsLogRate;
    }

    /* JADX INFO: renamed from: f */
    public final String m13872f(stc0 stc0Var) {
        return stc0Var == null ? "" : stc0Var.k().m().replace(mu5.m19510c(), "tantanapp");
    }

    /* JADX INFO: renamed from: h */
    public String m13873h(stc0 stc0Var, String str) {
        NetReportSetting netReportSetting = this.f10247a;
        if (NullChecker.a(netReportSetting)) {
            String strM13872f = m13872f(stc0Var);
            if (netReportSetting.domains.media.contains(strM13872f)) {
                return "media";
            }
            if (netReportSetting.domains.api.contains(strM13872f)) {
                return "api";
            }
        }
        return str;
    }

    /* JADX INFO: renamed from: i */
    public boolean m13874i() {
        NetReportSetting netReportSetting = this.f10247a;
        if (netReportSetting == null) {
            return false;
        }
        return netReportSetting.enableAndroidHttpdnsLogReport;
    }

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ void m13875j(RemoteConfig.ConfigStep configStep) {
        m13876k();
    }

    /* JADX INFO: renamed from: k */
    public final void m13876k() {
        String strF = RemoteConfig.x().F("net_report_settings");
        ArrayList arrayList = new ArrayList();
        if (TextUtils.isEmpty(strF)) {
            this.f10247a = null;
            return;
        }
        try {
            this.f10247a = (NetReportSetting) NetReportSetting.JSON_ADAPTER.parse(strF);
            if (NullChecker.a(this.f10247a)) {
                arrayList.addAll(this.f10247a.domains.api);
                arrayList.addAll(this.f10247a.domains.media);
            }
        } catch (IOException unused) {
        }
        this.f10248b = arrayList;
    }
}
