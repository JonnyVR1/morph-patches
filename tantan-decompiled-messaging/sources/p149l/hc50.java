package p149l;

import android.text.TextUtils;
import com.clevertap.android.sdk.Constants;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.android.app.App;
import com.p046p1.mobile.putong.data.ADInfo;
import com.p046p1.mobile.putong.data.OMSADLink;
import com.p046p1.mobile.putong.data.OMSLauncherInfo;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import com.tencent.open.SocialConstants;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m87231d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ%\u0010\r\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\t0\u000bH\u0007¢\u0006\u0004\b\r\u0010\u000eJ/\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\t2\u000e\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u000bH\u0007¢\u0006\u0004\b\u0013\u0010\u0014J7\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u000f2\u000e\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u000b2\u000e\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u000bH\u0007¢\u0006\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, m87232d2 = {"Ll/hc50;", "", "<init>", "()V", "Lcom/p1/mobile/android/app/Act;", SocialConstants.PARAM_ACT, "", "e", "(Lcom/p1/mobile/android/app/Act;)V", "", "adID", "", "trackingUrls", "g", "(Ljava/lang/String;Ljava/util/List;)V", "Lcom/p1/mobile/putong/data/OMSLauncherInfo;", "omsLauncher", "reportType", "showEventUrl", "h", "(Lcom/p1/mobile/putong/data/OMSLauncherInfo;Ljava/lang/String;Ljava/util/List;)V", "omsLauncherInfo", "successUrls", "failedUrls", "f", "(Lcom/p1/mobile/putong/data/OMSLauncherInfo;Ljava/util/List;Ljava/util/List;)V", "putong-common_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public final class hc50 {

    @NotNull
    public static final hc50 INSTANCE = new hc50();

    /* JADX INFO: renamed from: a */
    public static void m130384a(OMSLauncherInfo oMSLauncherInfo, List list, List list2) {
        if (Act.foreground_() == null) {
            m130391h(oMSLauncherInfo, "success_3", list);
        } else {
            m130391h(oMSLauncherInfo, "failed_3", list2);
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m130385b(OMSLauncherInfo oMSLauncherInfo, List list, List list2) {
        if (Act.foreground_() == null) {
            m130391h(oMSLauncherInfo, "success_5", list);
        } else {
            m130391h(oMSLauncherInfo, "failed_5", list2);
        }
    }

    /* JADX INFO: renamed from: c */
    public static void m130386c(String str, String str2) {
        exc0 exc0VarExecute = null;
        try {
            try {
                try {
                    exc0VarExecute = qib0.f154685D.mo144849a(xh5.network.basic().m185889h("User-Agent", wb50.m202527E()).m185898q(wb50.m202528F(str)).m185887f().m185883b()).execute();
                } catch (Exception unused) {
                }
            } catch (Exception e) {
                CrashHelper.m81296c(new Exception("请求异常 adid = " + str2, e));
            }
        } finally {
            t95.m187604b(exc0VarExecute);
        }
    }

    /* JADX INFO: renamed from: d */
    public static void m130387d(OMSLauncherInfo oMSLauncherInfo, List list, List list2) {
        if (Act.foreground_() == null) {
            m130391h(oMSLauncherInfo, "success_7", list);
        } else {
            m130391h(oMSLauncherInfo, "failed_7", list2);
        }
    }

    @JvmStatic
    /* JADX INFO: renamed from: e */
    public static final void m130388e(@NotNull Act act) {
        act.getClass();
        cc50 cc50Var = cc50.INSTANCE;
        Long l2 = cc50Var.m106038b().getValue().get();
        l2.getClass();
        if (mqi0.m155929D(l2.longValue())) {
            return;
        }
        cc50Var.m106038b().getValue().put(Long.valueOf(mqi0.m155944o()));
        zvf0.m220369B("e_oms_show_element_check", "", vwb.m200311Y("element_id", xb50.m207721a(act, new String[]{"com.jingdong.app.mall", "com.taobao.taobao", "com.xunmeng.pinduoduo", "com.sankuai.meituan"})));
    }

    @JvmStatic
    /* JADX INFO: renamed from: f */
    public static final void m130389f(@NotNull final OMSLauncherInfo omsLauncherInfo, @Nullable final List<String> successUrls, @Nullable final List<String> failedUrls) {
        omsLauncherInfo.getClass();
        e51.m114743H(App.f15369e, new Runnable() { // from class: l.ec50
            @Override // java.lang.Runnable
            public final void run() {
                hc50.m130384a(omsLauncherInfo, successUrls, failedUrls);
            }
        }, 3000L);
        e51.m114743H(App.f15369e, new Runnable() { // from class: l.fc50
            @Override // java.lang.Runnable
            public final void run() {
                hc50.m130385b(omsLauncherInfo, successUrls, failedUrls);
            }
        }, Constants.PN_IMAGE_DOWNLOAD_TIMEOUT_IN_MILLIS);
        e51.m114743H(App.f15369e, new Runnable() { // from class: l.gc50
            @Override // java.lang.Runnable
            public final void run() {
                hc50.m130387d(omsLauncherInfo, successUrls, failedUrls);
            }
        }, 7000L);
    }

    @JvmStatic
    /* JADX INFO: renamed from: g */
    public static final void m130390g(@NotNull final String adID, @NotNull List<String> trackingUrls) {
        adID.getClass();
        trackingUrls.getClass();
        int size = trackingUrls.size();
        for (int i = 0; i < size; i++) {
            final String str = trackingUrls.get(i);
            if (TextUtils.isEmpty(str)) {
                CrashHelper.m81296c(new RuntimeException("打点参数为null：adid = " + adID));
            } else {
                e51.m114774y(new Runnable() { // from class: l.dc50
                    @Override // java.lang.Runnable
                    public final void run() {
                        hc50.m130386c(str, adID);
                    }
                });
            }
        }
    }

    @JvmStatic
    /* JADX INFO: renamed from: h */
    public static final void m130391h(@NotNull OMSLauncherInfo omsLauncher, @NotNull String reportType, @Nullable List<String> showEventUrl) {
        Object obj;
        OMSADLink oMSADLink;
        omsLauncher.getClass();
        reportType.getClass();
        if (NullChecker.m81303a(omsLauncher.f38789ad)) {
            j760 j760VarM200311Y = vwb.m200311Y("show_event", reportType);
            cc50 cc50Var = cc50.INSTANCE;
            j760 j760VarM200311Y2 = vwb.m200311Y("show_event_url", cc50Var.m106039c(showEventUrl, false));
            j760 j760VarM200311Y3 = vwb.m200311Y("show_event_final_url", cc50Var.m106039c(showEventUrl, true));
            j760 j760VarM200311Y4 = vwb.m200311Y("budget_type", xb50.m207722b(omsLauncher.budgetType));
            ADInfo aDInfo = omsLauncher.f38789ad;
            if (aDInfo == null || (oMSADLink = aDInfo.link) == null || (obj = oMSADLink.action) == null) {
                obj = "null";
            }
            zvf0.m220371D("e_oms_show_event_report", "", j760VarM200311Y, j760VarM200311Y2, j760VarM200311Y3, j760VarM200311Y4, vwb.m200311Y("jump_action", obj), vwb.m200311Y("ad_id", omsLauncher.f38790id), vwb.m200311Y("dsp_id", omsLauncher.dspId), vwb.m200311Y("budget_showfrom", "momo"));
        }
    }
}
