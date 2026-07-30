package com.p046p1.mobile.putong.core.p053ui.report;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.ResultReceiver;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.api.api.Network;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.PutongCoreAct;
import com.p046p1.mobile.putong.core.R$string;
import com.p046p1.mobile.putong.core.data.ConversationType;
import com.p046p1.mobile.putong.core.data.Reason;
import com.p046p1.mobile.putong.core.data.ReportFrom;
import com.p046p1.mobile.putong.core.p053ui.dlg.CoreDlg;
import com.p046p1.mobile.putong.data.Channel;
import com.p046p1.mobile.putong.data.OMSDialogPositon;
import com.p046p1.mobile.putong.p065ui.webview.p068mk.MkWebViewAct;
import com.tantanapp.common.utils.NullChecker;
import p149l.d30;
import p149l.e30;
import p149l.f6c0;
import p149l.it6;
import p149l.mu5;
import p149l.o6j0;
import p149l.rzb0;
import p149l.u4c0;
import p149l.upa;
import p149l.zpd0;

/* JADX INFO: loaded from: classes9.dex */
public class ReportAct extends PutongCoreAct implements ReportCategoriesFrag.InterfaceC8822a, ReportDescriptionFrag.InterfaceC8823a {

    /* JADX INFO: renamed from: f */
    public String f35534f;

    /* JADX INFO: renamed from: g */
    public ResultReceiver f35535g;

    /* JADX INFO: renamed from: i */
    public CoreDlg.ProfileMenuBuildParam f35537i;

    /* JADX INFO: renamed from: d */
    public zpd0 f35532d = new zpd0("report_fake_dlg_ancient_time_" + CoreModule.m29931H().userId(), 0L);

    /* JADX INFO: renamed from: e */
    public zpd0 f35533e = new zpd0("report_fake_dlg_recent_time_" + CoreModule.m29931H().userId(), 0L);

    /* JADX INFO: renamed from: h */
    public boolean f35536h = true;

    /* JADX INFO: renamed from: a2 */
    public static Intent m54628a2(Context context, String str, boolean z, ResultReceiver resultReceiver) {
        return m54629b2(context, str, z, resultReceiver, null);
    }

    /* JADX INFO: renamed from: b2 */
    public static Intent m54629b2(Context context, String str, boolean z, ResultReceiver resultReceiver, CoreDlg.ProfileMenuBuildParam profileMenuBuildParam) {
        return MkWebViewAct.m80235Z1(context, m54633g2(str, profileMenuBuildParam), resultReceiver);
    }

    /* JADX INFO: renamed from: c2 */
    public static Intent m54630c2(Context context, String str, String str2, boolean z, ResultReceiver resultReceiver, String str3) {
        return m54631d2(context, str, str2, z, resultReceiver, str3, false);
    }

    /* JADX INFO: renamed from: d2 */
    public static Intent m54631d2(Context context, String str, String str2, boolean z, ResultReceiver resultReceiver, String str3, boolean z2) {
        return MkWebViewAct.m80235Z1(context, m54634h2(str, str2, str3, z2), resultReceiver);
    }

    /* JADX INFO: renamed from: e2 */
    public static Intent m54632e2(Context context, String str, boolean z, String str2, ResultReceiver resultReceiver) {
        return MkWebViewAct.m80235Z1(context, m54633g2(str, null), resultReceiver);
    }

    /* JADX INFO: renamed from: g2 */
    public static String m54633g2(String str, CoreDlg.ProfileMenuBuildParam profileMenuBuildParam) {
        String str2;
        String str3;
        String str4;
        C8829f c8829fM54696b = C8829f.m54696b();
        c8829fM54696b.m54699d(str);
        if (NullChecker.m81303a(profileMenuBuildParam) && NullChecker.m81303a(profileMenuBuildParam.reportFrom) && TextUtils.equals(profileMenuBuildParam.reportFrom.getFrom(), ReportFrom.IDENTIFY_FAKE.getFrom())) {
            c8829fM54696b.f35568c = Channel.fake;
        }
        String str5 = mu5.f135747o;
        String str6 = (TextUtils.isEmpty(str5) || str5.contains("staging2")) ? "http://m.staging2.p1staff.com/fep/tantan/frontend/tantan-frontend-app-pages-v2/src/pages/core/report/index.html?_bid=1002576#/?receive_report_user_id=%1$s&reporter_user_id=%2$s&report_source_new=%3$s&report_match_type=%4$s&language=%5$s&identify=%6$s&contentType=%7$s&profileCommentText=%8$s&moment_id=%9$s" : "https://m.tantanapp.com/fep/tantan/frontend/tantan-frontend-app-pages-v2/src/pages/core/report/index.html?_bid=1002576#/?receive_report_user_id=%1$s&reporter_user_id=%2$s&report_source_new=%3$s&report_match_type=%4$s&language=%5$s&identify=%6$s&contentType=%7$s&profileCommentText=%8$s";
        if (NullChecker.m81303a(profileMenuBuildParam)) {
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
        return String.format(str6, str, CoreModule.m29931H().userId(), c8829fM54696b.m54705j(), c8829fM54696b.m54704i(), Network.language(), c8829fM54696b.m54697a(), str2, str3, str4);
    }

    /* JADX INFO: renamed from: h2 */
    public static String m54634h2(String str, String str2, String str3, boolean z) {
        String str4 = mu5.f135747o;
        return String.format((TextUtils.isEmpty(str4) || str4.contains("staging2")) ? "http://m.staging2.p1staff.com/fep/tantan/frontend/tantan-frontend-app-pages-v2/src/pages/core/report/index.html?_bid=1002576#/?receive_report_user_id=%1$s&reporter_user_id=%2$s&report_source_new=%3$s&report_match_type=%4$s&language=%5$s&identify=%6$s&contentType=%7$s&profileCommentText=%8$s&moment_id=%9$s" : "https://m.tantanapp.com/fep/tantan/frontend/tantan-frontend-app-pages-v2/src/pages/core/report/index.html?_bid=1002576#/?receive_report_user_id=%1$s&reporter_user_id=%2$s&report_source_new=%3$s&report_match_type=%4$s&language=%5$s&identify=%6$s&contentType=%7$s&profileCommentText=%8$s", str3, "", "", str, "", "", str2, str, z ? ConversationType.swiper : "");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k2 */
    public /* synthetic */ void m54635k2(Bundle bundle) {
        Intent intent = getIntent();
        if (!TextUtils.isEmpty(intent.getStringExtra("public_id"))) {
            setTitle(getString(R$string.f18868r) + "ID:" + intent.getStringExtra("public_id"));
        }
        this.f35534f = intent.getStringExtra("user_id");
        this.f35535g = (ResultReceiver) intent.getParcelableExtra("result_receiver");
        this.f35536h = intent.getBooleanExtra("matched", true);
        this.f35537i = (CoreDlg.ProfileMenuBuildParam) intent.getSerializableExtra("extra_param");
        C8829f.m54696b().m54699d(this.f35534f);
        if (bundle == null) {
            fragmentManager().m2567m().m2811s(u4c0.f173915Lb, new ReportCategoriesFrag()).mo2707i();
        }
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.report.ReportDescriptionFrag.InterfaceC8823a
    /* JADX INFO: renamed from: Y */
    public void mo54636Y(String str) {
        if (NullChecker.m81303a(this.f35535g)) {
            Bundle bundle = new Bundle();
            bundle.putString(Reason.TYPE, str);
            this.f35535g.send(-1, bundle);
        } else {
            setResult(-1);
        }
        if (upa.m194819t1()) {
            act().dialog().m20504F(it6.m138181b(R$string.f18462dm, R$string.f18128Sl)).m20556t0(R$string.f18136T, new Runnable() { // from class: l.isc0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f114749a.m54640m2();
                }
            }).m20568z0();
        } else {
            hideInput();
            super.m66873d2();
        }
    }

    @Override // com.p046p1.mobile.android.app.Act, android.app.Activity
    /* JADX INFO: renamed from: finish */
    public void m66873d2() {
        o6j0.m162859c("e_report_select", "p_report_select_view", o6j0.C18854a.m162878h("report_select_view_detail", "BACK"));
        if (NullChecker.m81303a(this.f35535g)) {
            this.f35535g.send(0, null);
        }
        C8829f.m54696b().m54703h(null);
        super.m66873d2();
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.report.ReportCategoriesFrag.InterfaceC8822a
    /* JADX INFO: renamed from: h0 */
    public void mo54637h0(ReportCategory reportCategory) {
        m54638i2(reportCategory);
    }

    /* JADX INFO: renamed from: i2 */
    public final void m54638i2(ReportCategory reportCategory) {
        o6j0.m162859c("e_report_select", "p_report_select_view", o6j0.C18854a.m162878h("report_select_view_detail", C8829f.m54696b().m54707l(reportCategory)));
        fragmentManager().m2567m().m2814v(rzb0.f161640l, rzb0.f161641m, rzb0.f161639k, rzb0.f161642n).m2811s(u4c0.f173915Lb, ReportDescriptionFrag.m54650U4(this.f35534f, reportCategory, this.f35537i)).m2808g(null).mo2707i();
    }

    @Override // com.p046p1.mobile.android.app.Act
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return layoutInflater.inflate(f6c0.f95900me, (ViewGroup) null);
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act
    public void initDataOnCreate() {
        super.initDataOnCreate();
        creates(new e30() { // from class: l.hsc0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f109312a.m54635k2((Bundle) obj);
            }
        });
    }

    /* JADX INFO: renamed from: l2 */
    public final /* synthetic */ void m54639l2() {
        hideInput();
        super.m66873d2();
    }

    /* JADX INFO: renamed from: m2 */
    public final /* synthetic */ void m54640m2() {
        if (this.f35536h && NullChecker.m81303a(getIntent().getStringExtra("form")) && getIntent().getStringExtra("form").equals(OMSDialogPositon.p_chat_view)) {
            CoreDlg.m45100s1(act(), this.f35534f, new d30() { // from class: l.jsc0
                @Override // p149l.d30
                public final void call() {
                    this.f119487a.m54639l2();
                }
            }, null);
        } else {
            hideInput();
            super.m66873d2();
        }
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        C8829f.m54696b().m54698c();
        super.onBackPressed();
    }

    @Override // com.p046p1.mobile.android.app.Act
    public void onHomePressed() {
        onBackPressed();
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act, p149l.n3m
    public String pageId() {
        return "p_report_view";
    }
}
