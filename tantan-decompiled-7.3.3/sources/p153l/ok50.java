package p153l;

import android.text.TextUtils;
import com.clevertap.android.sdk.Constants;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.android.app.App;
import com.p051p1.mobile.putong.data.ADInfo;
import com.p051p1.mobile.putong.data.OMSADLink;
import com.p051p1.mobile.putong.data.OMSLauncherInfo;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import com.tencent.open.SocialConstants;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m88120d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ%\u0010\r\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\t0\u000bH\u0007¢\u0006\u0004\b\r\u0010\u000eJ/\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\t2\u000e\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u000bH\u0007¢\u0006\u0004\b\u0013\u0010\u0014J7\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u000f2\u000e\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u000b2\u000e\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u000bH\u0007¢\u0006\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, m88121d2 = {"Ll/ok50;", "", "<init>", "()V", "Lcom/p1/mobile/android/app/Act;", SocialConstants.PARAM_ACT, "", "e", "(Lcom/p1/mobile/android/app/Act;)V", "", "adID", "", "trackingUrls", "g", "(Ljava/lang/String;Ljava/util/List;)V", "Lcom/p1/mobile/putong/data/OMSLauncherInfo;", "omsLauncher", "reportType", "showEventUrl", "h", "(Lcom/p1/mobile/putong/data/OMSLauncherInfo;Ljava/lang/String;Ljava/util/List;)V", "omsLauncherInfo", "successUrls", "failedUrls", "f", "(Lcom/p1/mobile/putong/data/OMSLauncherInfo;Ljava/util/List;Ljava/util/List;)V", "putong-common_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class ok50 {

    @NotNull
    public static final ok50 INSTANCE = new ok50();

    /* JADX INFO: renamed from: a */
    public static void m167978a(OMSLauncherInfo oMSLauncherInfo, List list, List list2) {
        if (Act.foreground_() == null) {
            m167985h(oMSLauncherInfo, "success_3", list);
        } else {
            m167985h(oMSLauncherInfo, "failed_3", list2);
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m167979b(OMSLauncherInfo oMSLauncherInfo, List list, List list2) {
        if (Act.foreground_() == null) {
            m167985h(oMSLauncherInfo, "success_5", list);
        } else {
            m167985h(oMSLauncherInfo, "failed_5", list2);
        }
    }

    /* JADX INFO: renamed from: c */
    public static void m167980c(String str, String str2) {
        i5d0 i5d0VarExecute = null;
        try {
            try {
                try {
                    i5d0VarExecute = uqb0.f180368D.mo181341a(xi5.network.basic().m209034h("User-Agent", dk50.m116216E()).m209043q(dk50.m116217F(str)).m209032f().m209028b()).execute();
                } catch (Exception unused) {
                }
            } catch (Exception e) {
                CrashHelper.m82479c(new Exception("请求异常 adid = " + str2, e));
            }
        } finally {
            ua5.m195158b(i5d0VarExecute);
        }
    }

    /* JADX INFO: renamed from: d */
    public static void m167981d(OMSLauncherInfo oMSLauncherInfo, List list, List list2) {
        if (Act.foreground_() == null) {
            m167985h(oMSLauncherInfo, "success_7", list);
        } else {
            m167985h(oMSLauncherInfo, "failed_7", list2);
        }
    }

    @JvmStatic
    /* JADX INFO: renamed from: e */
    public static final void m167982e(@NotNull Act act) {
        act.getClass();
        jk50 jk50Var = jk50.INSTANCE;
        Long l2 = jk50Var.m145154b().getValue().get();
        l2.getClass();
        if (pzi0.m174439D(l2.longValue())) {
            return;
        }
        jk50Var.m145154b().getValue().put(Long.valueOf(pzi0.m174454o()));
        i4g0.m138493B("e_oms_show_element_check", "", jyb.m147494Y("element_id", ek50.m121031a(act, new String[]{"com.jingdong.app.mall", "com.taobao.taobao", "com.xunmeng.pinduoduo", "com.sankuai.meituan"})));
    }

    @JvmStatic
    /* JADX INFO: renamed from: f */
    public static final void m167983f(@NotNull final OMSLauncherInfo omsLauncherInfo, @Nullable final List<String> successUrls, @Nullable final List<String> failedUrls) {
        omsLauncherInfo.getClass();
        l51.m152888H(App.f16088e, new Runnable() { // from class: l.lk50
            @Override // java.lang.Runnable
            public final void run() {
                ok50.m167978a(omsLauncherInfo, successUrls, failedUrls);
            }
        }, 3000L);
        l51.m152888H(App.f16088e, new Runnable() { // from class: l.mk50
            @Override // java.lang.Runnable
            public final void run() {
                ok50.m167979b(omsLauncherInfo, successUrls, failedUrls);
            }
        }, Constants.PN_IMAGE_DOWNLOAD_TIMEOUT_IN_MILLIS);
        l51.m152888H(App.f16088e, new Runnable() { // from class: l.nk50
            @Override // java.lang.Runnable
            public final void run() {
                ok50.m167981d(omsLauncherInfo, successUrls, failedUrls);
            }
        }, 7000L);
    }

    @JvmStatic
    /* JADX INFO: renamed from: g */
    public static final void m167984g(@NotNull final String adID, @NotNull List<String> trackingUrls) {
        adID.getClass();
        trackingUrls.getClass();
        int size = trackingUrls.size();
        for (int i = 0; i < size; i++) {
            final String str = trackingUrls.get(i);
            if (TextUtils.isEmpty(str)) {
                CrashHelper.m82479c(new RuntimeException("打点参数为null：adid = " + adID));
            } else {
                l51.m152919y(new Runnable() { // from class: l.kk50
                    @Override // java.lang.Runnable
                    public final void run() {
                        ok50.m167980c(str, adID);
                    }
                });
            }
        }
    }

    @JvmStatic
    /* JADX INFO: renamed from: h */
    public static final void m167985h(@NotNull OMSLauncherInfo omsLauncher, @NotNull String reportType, @Nullable List<String> showEventUrl) {
        Object obj;
        OMSADLink oMSADLink;
        omsLauncher.getClass();
        reportType.getClass();
        if (NullChecker.m82486a(omsLauncher.f39637ad)) {
            pf60 pf60VarM147494Y = jyb.m147494Y("show_event", reportType);
            jk50 jk50Var = jk50.INSTANCE;
            pf60 pf60VarM147494Y2 = jyb.m147494Y("show_event_url", jk50Var.m145155c(showEventUrl, false));
            pf60 pf60VarM147494Y3 = jyb.m147494Y("show_event_final_url", jk50Var.m145155c(showEventUrl, true));
            pf60 pf60VarM147494Y4 = jyb.m147494Y("budget_type", ek50.m121032b(omsLauncher.budgetType));
            ADInfo aDInfo = omsLauncher.f39637ad;
            if (aDInfo == null || (oMSADLink = aDInfo.link) == null || (obj = oMSADLink.action) == null) {
                obj = "null";
            }
            i4g0.m138495D("e_oms_show_event_report", "", pf60VarM147494Y, pf60VarM147494Y2, pf60VarM147494Y3, pf60VarM147494Y4, jyb.m147494Y("jump_action", obj), jyb.m147494Y("ad_id", omsLauncher.f39638id), jyb.m147494Y("dsp_id", omsLauncher.dspId), jyb.m147494Y("budget_showfrom", "momo"));
        }
    }
}
