package p153l;

import android.text.TextUtils;
import com.p051p1.mobile.putong.data.NetReportSetting;
import com.p051p1.mobile.putong.remote_config.RemoteConfig;
import com.tantanapp.common.network.NetworkTrackInfo;
import com.tantanapp.common.utils.NullChecker;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public class li20 {

    /* JADX INFO: renamed from: c */
    public static final zqf0<li20> f132173c = new C18397a();

    /* JADX INFO: renamed from: a */
    public volatile NetReportSetting f132174a;

    /* JADX INFO: renamed from: b */
    public volatile List<String> f132175b;

    /* JADX INFO: renamed from: l.li20$a */
    public class C18397a extends zqf0<li20> {
        @Override // p153l.zqf0
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public li20 mo80520a() {
            return new li20();
        }
    }

    public li20() {
        m154284k();
        RemoteConfig.m80467Y().filter(new qcj() { // from class: l.ji20
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(((RemoteConfig.ConfigStep) obj) == RemoteConfig.ConfigStep.USER);
            }
        }).subscribe(psd0.m173596G(new y20() { // from class: l.ki20
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f126958a.m154283j((RemoteConfig.ConfigStep) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ Boolean m154276c(String str, String str2) {
        return str.startsWith(str2) ? Boolean.TRUE : Boolean.FALSE;
    }

    /* JADX INFO: renamed from: g */
    public static li20 m154277g() {
        return f132173c.m221013b();
    }

    /* JADX INFO: renamed from: d */
    public boolean m154278d(NetworkTrackInfo networkTrackInfo) {
        NetReportSetting netReportSetting = this.f132174a;
        if (netReportSetting == null) {
            return true;
        }
        if (!netReportSetting.enableNetReport) {
            return false;
        }
        final String strReplace = networkTrackInfo.getRequestUrl().replace("http://", "").replace("https://", "").replace(qv5.m178249c(), "tantanapp");
        if (!jyb.m147520m(this.f132175b, new qcj() { // from class: l.ii20
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return li20.m154276c(strReplace, (String) obj);
            }
        })) {
            return false;
        }
        try {
            if (Integer.parseInt(networkTrackInfo.getResponseCode()) / 100 == 2) {
                if (gkc0.m130574b(100) < netReportSetting.androidSuccessRate) {
                    return true;
                }
            } else if (gkc0.m130574b(100) < netReportSetting.androidErrorRate) {
                return true;
            }
            return false;
        } catch (NumberFormatException unused) {
            return true;
        }
    }

    /* JADX INFO: renamed from: e */
    public int m154279e() {
        NetReportSetting netReportSetting = this.f132174a;
        if (netReportSetting == null) {
            return 0;
        }
        return netReportSetting.androidHttpdnsLogRate;
    }

    /* JADX INFO: renamed from: f */
    public final String m154280f(x1d0 x1d0Var) {
        return x1d0Var == null ? "" : x1d0Var.m209026k().m182286m().replace(qv5.m178249c(), "tantanapp");
    }

    /* JADX INFO: renamed from: h */
    public String m154281h(x1d0 x1d0Var, String str) {
        NetReportSetting netReportSetting = this.f132174a;
        if (NullChecker.m82486a(netReportSetting)) {
            String strM154280f = m154280f(x1d0Var);
            if (netReportSetting.domains.media.contains(strM154280f)) {
                return "media";
            }
            if (netReportSetting.domains.api.contains(strM154280f)) {
                return "api";
            }
        }
        return str;
    }

    /* JADX INFO: renamed from: i */
    public boolean m154282i() {
        NetReportSetting netReportSetting = this.f132174a;
        if (netReportSetting == null) {
            return false;
        }
        return netReportSetting.enableAndroidHttpdnsLogReport;
    }

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ void m154283j(RemoteConfig.ConfigStep configStep) {
        m154284k();
    }

    /* JADX INFO: renamed from: k */
    public final void m154284k() {
        String strM80485F = RemoteConfig.m80481x().m80485F("net_report_settings");
        ArrayList arrayList = new ArrayList();
        if (TextUtils.isEmpty(strM80485F)) {
            this.f132174a = null;
            return;
        }
        try {
            this.f132174a = NetReportSetting.JSON_ADAPTER.parse(strM80485F);
            if (NullChecker.m82486a(this.f132174a)) {
                arrayList.addAll(this.f132174a.domains.api);
                arrayList.addAll(this.f132174a.domains.media);
            }
        } catch (IOException unused) {
        }
        this.f132175b = arrayList;
    }
}
