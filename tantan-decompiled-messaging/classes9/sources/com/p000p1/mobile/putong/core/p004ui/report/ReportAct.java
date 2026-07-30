package com.p000p1.mobile.putong.core.p004ui.report;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.ResultReceiver;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p000p1.mobile.putong.api.api.Network;
import com.p000p1.mobile.putong.core.CoreModule;
import com.p000p1.mobile.putong.core.PutongCoreAct;
import com.p000p1.mobile.putong.core.R$string;
import com.p1.mobile.putong.core.data.ReportFrom;
import com.p1.mobile.putong.core.ui.dlg.CoreDlg;
import com.p1.mobile.putong.ui.webview.mk.MkWebViewAct;
import com.tantanapp.common.utils.NullChecker;
import l.d30;
import l.e30;
import l.it6;
import l.o6j0;
import l.zpd0;
import p006l.f6c0;
import p006l.mu5;
import p006l.rzb0;
import p006l.u4c0;
import p006l.upa;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class ReportAct extends PutongCoreAct implements ReportCategoriesFrag.InterfaceC0258a, ReportDescriptionFrag.InterfaceC0259a {

    /* JADX INFO: renamed from: f */
    public String f5315f;

    /* JADX INFO: renamed from: g */
    public ResultReceiver f5316g;

    /* JADX INFO: renamed from: i */
    public CoreDlg.ProfileMenuBuildParam f5318i;

    /* JADX INFO: renamed from: d */
    public zpd0 f5313d = new zpd0("report_fake_dlg_ancient_time_" + CoreModule.m1850H().userId(), 0L);

    /* JADX INFO: renamed from: e */
    public zpd0 f5314e = new zpd0("report_fake_dlg_recent_time_" + CoreModule.m1850H().userId(), 0L);

    /* JADX INFO: renamed from: h */
    public boolean f5317h = true;

    /* JADX INFO: renamed from: a2 */
    public static Intent m7978a2(Context context, String str, boolean z, ResultReceiver resultReceiver) {
        return m7979b2(context, str, z, resultReceiver, null);
    }

    /* JADX INFO: renamed from: b2 */
    public static Intent m7979b2(Context context, String str, boolean z, ResultReceiver resultReceiver, CoreDlg.ProfileMenuBuildParam profileMenuBuildParam) {
        return MkWebViewAct.Z1(context, m7983g2(str, profileMenuBuildParam), resultReceiver);
    }

    /* JADX INFO: renamed from: c2 */
    public static Intent m7980c2(Context context, String str, String str2, boolean z, ResultReceiver resultReceiver, String str3) {
        return m7981d2(context, str, str2, z, resultReceiver, str3, false);
    }

    /* JADX INFO: renamed from: d2 */
    public static Intent m7981d2(Context context, String str, String str2, boolean z, ResultReceiver resultReceiver, String str3, boolean z2) {
        return MkWebViewAct.Z1(context, m7984h2(str, str2, str3, z2), resultReceiver);
    }

    /* JADX INFO: renamed from: e2 */
    public static Intent m7982e2(Context context, String str, boolean z, String str2, ResultReceiver resultReceiver) {
        return MkWebViewAct.Z1(context, m7983g2(str, null), resultReceiver);
    }

    /* JADX INFO: renamed from: g2 */
    public static String m7983g2(String str, CoreDlg.ProfileMenuBuildParam profileMenuBuildParam) {
        String str2;
        String str3;
        String str4;
        C0265f c0265fM8053b = C0265f.m8053b();
        c0265fM8053b.m8056d(str);
        if (NullChecker.a(profileMenuBuildParam) && NullChecker.a(profileMenuBuildParam.reportFrom) && TextUtils.equals(profileMenuBuildParam.reportFrom.getFrom(), ReportFrom.IDENTIFY_FAKE.getFrom())) {
            c0265fM8053b.f5349c = "fake";
        }
        String str5 = mu5.f17266o;
        String str6 = (TextUtils.isEmpty(str5) || str5.contains("staging2")) ? "http://m.staging2.p1staff.com/fep/tantan/frontend/tantan-frontend-app-pages-v2/src/pages/core/report/index.html?_bid=1002576#/?receive_report_user_id=%1$s&reporter_user_id=%2$s&report_source_new=%3$s&report_match_type=%4$s&language=%5$s&identify=%6$s&contentType=%7$s&profileCommentText=%8$s&moment_id=%9$s" : "https://m.tantanapp.com/fep/tantan/frontend/tantan-frontend-app-pages-v2/src/pages/core/report/index.html?_bid=1002576#/?receive_report_user_id=%1$s&reporter_user_id=%2$s&report_source_new=%3$s&report_match_type=%4$s&language=%5$s&identify=%6$s&contentType=%7$s&profileCommentText=%8$s";
        if (NullChecker.a(profileMenuBuildParam)) {
            String str7 = !TextUtils.isEmpty(profileMenuBuildParam.contentType) ? profileMenuBuildParam.contentType : "";
            String str8 = !TextUtils.isEmpty(profileMenuBuildParam.profileCommentText) ? profileMenuBuildParam.profileCommentText : "";
            str2 = str7;
            str4 = TextUtils.isEmpty(profileMenuBuildParam.momentId) ? "" : profileMenuBuildParam.momentId;
            str3 = str8;
        } else {
            str2 = "";
            str3 = str2;
            str4 = str3;
        }
        return String.format(str6, str, CoreModule.m1850H().userId(), c0265fM8053b.m8062j(), c0265fM8053b.m8061i(), Network.language(), c0265fM8053b.m8054a(), str2, str3, str4);
    }

    /* JADX INFO: renamed from: h2 */
    public static String m7984h2(String str, String str2, String str3, boolean z) {
        String str4 = mu5.f17266o;
        return String.format((TextUtils.isEmpty(str4) || str4.contains("staging2")) ? "http://m.staging2.p1staff.com/fep/tantan/frontend/tantan-frontend-app-pages-v2/src/pages/core/report/index.html?_bid=1002576#/?receive_report_user_id=%1$s&reporter_user_id=%2$s&report_source_new=%3$s&report_match_type=%4$s&language=%5$s&identify=%6$s&contentType=%7$s&profileCommentText=%8$s&moment_id=%9$s" : "https://m.tantanapp.com/fep/tantan/frontend/tantan-frontend-app-pages-v2/src/pages/core/report/index.html?_bid=1002576#/?receive_report_user_id=%1$s&reporter_user_id=%2$s&report_source_new=%3$s&report_match_type=%4$s&language=%5$s&identify=%6$s&contentType=%7$s&profileCommentText=%8$s", str3, "", "", str, "", "", str2, str, z ? "swiper" : "");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: k2 */
    public /* synthetic */ void m7985k2(Bundle bundle) {
        Intent intent = getIntent();
        if (!TextUtils.isEmpty(intent.getStringExtra("public_id"))) {
            setTitle(getString(R$string.f2857r) + "ID:" + intent.getStringExtra("public_id"));
        }
        this.f5315f = intent.getStringExtra("user_id");
        this.f5316g = (ResultReceiver) intent.getParcelableExtra("result_receiver");
        this.f5317h = intent.getBooleanExtra("matched", true);
        this.f5318i = intent.getSerializableExtra("extra_param");
        C0265f.m8053b().m8056d(this.f5315f);
        if (bundle == null) {
            fragmentManager().m().s(u4c0.f22663Lb, new ReportCategoriesFrag()).i();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.p000p1.mobile.putong.core.p004ui.report.ReportDescriptionFrag.InterfaceC0259a
    /* JADX INFO: renamed from: Y */
    public void mo7986Y(String str) {
        if (NullChecker.a(this.f5316g)) {
            Bundle bundle = new Bundle();
            bundle.putString("reason", str);
            this.f5316g.send(-1, bundle);
        } else {
            setResult(-1);
        }
        if (upa.m25517t1()) {
            act().dialog().F(it6.b(R$string.f2451dm, R$string.f2117Sl)).t0(R$string.f2125T, new Runnable() { // from class: l.isc0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f14738a.m7990m2();
                }
            }).z0();
        } else {
            hideInput();
            super.finish();
        }
    }

    public void finish() {
        o6j0.c("e_report_select", "p_report_select_view", new o6j0.a[]{o6j0.a.h("report_select_view_detail", "BACK")});
        if (NullChecker.a(this.f5316g)) {
            this.f5316g.send(0, null);
        }
        C0265f.m8053b().m8060h(null);
        super.finish();
    }

    @Override // com.p000p1.mobile.putong.core.p004ui.report.ReportCategoriesFrag.InterfaceC0258a
    /* JADX INFO: renamed from: h0 */
    public void mo7987h0(ReportCategory reportCategory) {
        m7988i2(reportCategory);
    }

    /* JADX INFO: renamed from: i2 */
    public final void m7988i2(ReportCategory reportCategory) {
        o6j0.c("e_report_select", "p_report_select_view", new o6j0.a[]{o6j0.a.h("report_select_view_detail", C0265f.m8053b().m8064l(reportCategory))});
        fragmentManager().m().v(rzb0.f20940l, rzb0.f20941m, rzb0.f20939k, rzb0.f20942n).s(u4c0.f22663Lb, ReportDescriptionFrag.m8000U4(this.f5315f, reportCategory, this.f5318i)).g((String) null).i();
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return layoutInflater.inflate(f6c0.f12314me, (ViewGroup) null);
    }

    @Override // com.p000p1.mobile.putong.app.PutongAct
    public void initDataOnCreate() {
        super.initDataOnCreate();
        creates(new e30() { // from class: l.hsc0
            public final void call(Object obj) {
                this.f14035a.m7985k2((Bundle) obj);
            }
        });
    }

    /* JADX INFO: renamed from: l2 */
    public final /* synthetic */ void m7989l2() {
        hideInput();
        super.finish();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: m2 */
    public final /* synthetic */ void m7990m2() {
        if (this.f5317h && NullChecker.a(getIntent().getStringExtra("form")) && getIntent().getStringExtra("form").equals("p_chat_view")) {
            CoreDlg.s1(act(), this.f5315f, new d30() { // from class: l.jsc0
                public final void call() {
                    this.f15371a.m7989l2();
                }
            }, (d30) null);
        } else {
            hideInput();
            super.finish();
        }
    }

    @Override // com.p000p1.mobile.putong.app.PutongAct
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
    }

    public void onBackPressed() {
        C0265f.m8053b().m8055c();
        super/*androidx.activity.ComponentActivity*/.onBackPressed();
    }

    public void onHomePressed() {
        onBackPressed();
    }

    @Override // com.p000p1.mobile.putong.app.PutongAct
    public String pageId() {
        return "p_report_view";
    }
}
