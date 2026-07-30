package p009l;

import android.text.TextUtils;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.android.app.App;
import com.p1.mobile.putong.data.ADInfo;
import com.p1.mobile.putong.data.LinkAction;
import com.p1.mobile.putong.data.OMSADLink;
import com.p1.mobile.putong.data.OMSLauncherInfo;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import l.e51;
import l.exc0;
import l.j760;
import l.qib0;
import l.t95;
import l.vwb;
import l.wb50;
import l.xh5;
import l.zpd0;
import l.zvf0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ%\u0010\r\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\t0\u000bH\u0007¢\u0006\u0004\b\r\u0010\u000eJ/\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\t2\u000e\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u000bH\u0007¢\u0006\u0004\b\u0013\u0010\u0014J7\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u000f2\u000e\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u000b2\u000e\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u000bH\u0007¢\u0006\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"Ll/hc50;", "", "<init>", "()V", "Lcom/p1/mobile/android/app/Act;", "act", "", "e", "(Lcom/p1/mobile/android/app/Act;)V", "", "adID", "", "trackingUrls", "g", "(Ljava/lang/String;Ljava/util/List;)V", "Lcom/p1/mobile/putong/data/OMSLauncherInfo;", "omsLauncher", "reportType", "showEventUrl", "h", "(Lcom/p1/mobile/putong/data/OMSLauncherInfo;Ljava/lang/String;Ljava/util/List;)V", "omsLauncherInfo", "successUrls", "failedUrls", "f", "(Lcom/p1/mobile/putong/data/OMSLauncherInfo;Ljava/util/List;Ljava/util/List;)V", "putong-common_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class hc50 {

    @NotNull
    public static final hc50 INSTANCE = new hc50();

    /* JADX INFO: renamed from: a */
    public static void m15521a(OMSLauncherInfo oMSLauncherInfo, List list, List list2) {
        if (Act.foreground_() == null) {
            m15528h(oMSLauncherInfo, "success_3", list);
        } else {
            m15528h(oMSLauncherInfo, "failed_3", list2);
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m15522b(OMSLauncherInfo oMSLauncherInfo, List list, List list2) {
        if (Act.foreground_() == null) {
            m15528h(oMSLauncherInfo, "success_5", list);
        } else {
            m15528h(oMSLauncherInfo, "failed_5", list2);
        }
    }

    /* JADX INFO: renamed from: c */
    public static void m15523c(String str, String str2) {
        exc0 exc0VarExecute = null;
        try {
            try {
                try {
                    exc0VarExecute = qib0.D.a(xh5.network.basic().h("User-Agent", wb50.E()).q(wb50.F(str)).f().b()).execute();
                } catch (Exception unused) {
                }
            } catch (Exception e) {
                CrashHelper.c(new Exception("请求异常 adid = " + str2, e));
            }
        } finally {
            t95.b(exc0VarExecute);
        }
    }

    /* JADX INFO: renamed from: d */
    public static void m15524d(OMSLauncherInfo oMSLauncherInfo, List list, List list2) {
        if (Act.foreground_() == null) {
            m15528h(oMSLauncherInfo, "success_7", list);
        } else {
            m15528h(oMSLauncherInfo, "failed_7", list2);
        }
    }

    @JvmStatic
    /* JADX INFO: renamed from: e */
    public static final void m15525e(@NotNull Act act) {
        act.getClass();
        cc50 cc50Var = cc50.INSTANCE;
        Object obj = ((zpd0) cc50Var.m12477b().getValue()).get();
        obj.getClass();
        if (mqi0.m18535D(((Number) obj).longValue())) {
            return;
        }
        ((zpd0) cc50Var.m12477b().getValue()).put(Long.valueOf(mqi0.m18550o()));
        zvf0.B("e_oms_show_element_check", "", new j760[]{vwb.Y("element_id", xb50.m24756a(act, new String[]{"com.jingdong.app.mall", "com.taobao.taobao", "com.xunmeng.pinduoduo", "com.sankuai.meituan"}))});
    }

    @JvmStatic
    /* JADX INFO: renamed from: f */
    public static final void m15526f(@NotNull final OMSLauncherInfo omsLauncherInfo, @Nullable final List<String> successUrls, @Nullable final List<String> failedUrls) {
        omsLauncherInfo.getClass();
        e51.H(App.e, new Runnable() { // from class: l.ec50
            @Override // java.lang.Runnable
            public final void run() {
                hc50.m15521a(omsLauncherInfo, successUrls, failedUrls);
            }
        }, 3000L);
        e51.H(App.e, new Runnable() { // from class: l.fc50
            @Override // java.lang.Runnable
            public final void run() {
                hc50.m15522b(omsLauncherInfo, successUrls, failedUrls);
            }
        }, 5000L);
        e51.H(App.e, new Runnable() { // from class: l.gc50
            @Override // java.lang.Runnable
            public final void run() {
                hc50.m15524d(omsLauncherInfo, successUrls, failedUrls);
            }
        }, 7000L);
    }

    @JvmStatic
    /* JADX INFO: renamed from: g */
    public static final void m15527g(@NotNull final String adID, @NotNull List<String> trackingUrls) {
        adID.getClass();
        trackingUrls.getClass();
        int size = trackingUrls.size();
        for (int i = 0; i < size; i++) {
            final String str = trackingUrls.get(i);
            if (TextUtils.isEmpty(str)) {
                CrashHelper.c(new RuntimeException("打点参数为null：adid = " + adID));
            } else {
                e51.y(new Runnable() { // from class: l.dc50
                    @Override // java.lang.Runnable
                    public final void run() {
                        hc50.m15523c(str, adID);
                    }
                });
            }
        }
    }

    @JvmStatic
    /* JADX INFO: renamed from: h */
    public static final void m15528h(@NotNull OMSLauncherInfo omsLauncher, @NotNull String reportType, @Nullable List<String> showEventUrl) {
        LinkAction linkAction;
        OMSADLink oMSADLink;
        omsLauncher.getClass();
        reportType.getClass();
        if (NullChecker.a(omsLauncher.ad)) {
            j760 j760VarY = vwb.Y("show_event", reportType);
            cc50 cc50Var = cc50.INSTANCE;
            j760 j760VarY2 = vwb.Y("show_event_url", cc50Var.m12478c(showEventUrl, false));
            j760 j760VarY3 = vwb.Y("show_event_final_url", cc50Var.m12478c(showEventUrl, true));
            j760 j760VarY4 = vwb.Y("budget_type", xb50.m24757b(omsLauncher.budgetType));
            ADInfo aDInfo = omsLauncher.ad;
            if (aDInfo == null || (oMSADLink = aDInfo.link) == null || (linkAction = oMSADLink.action) == null) {
                linkAction = "null";
            }
            zvf0.D("e_oms_show_event_report", "", new j760[]{j760VarY, j760VarY2, j760VarY3, j760VarY4, vwb.Y("jump_action", linkAction), vwb.Y("ad_id", omsLauncher.id), vwb.Y("dsp_id", omsLauncher.dspId), vwb.Y("budget_showfrom", "momo")});
        }
    }
}
