package com.p051p1.mobile.putong.core.p058ui.report;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.ResultReceiver;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.api.api.Network;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.PutongCoreAct;
import com.p051p1.mobile.putong.core.R$string;
import com.p051p1.mobile.putong.core.data.ConversationType;
import com.p051p1.mobile.putong.core.data.Reason;
import com.p051p1.mobile.putong.core.data.ReportFrom;
import com.p051p1.mobile.putong.core.p058ui.dlg.CoreDlg;
import com.p051p1.mobile.putong.data.Channel;
import com.p051p1.mobile.putong.data.OMSDialogPositon;
import com.p051p1.mobile.putong.p070ui.webview.p073mk.MkWebViewAct;
import com.tantanapp.common.utils.NullChecker;
import p153l.adc0;
import p153l.byd0;
import p153l.gra;
import p153l.kec0;
import p153l.lu6;
import p153l.qv5;
import p153l.sfj0;
import p153l.x20;
import p153l.x7c0;
import p153l.y20;

/* JADX INFO: loaded from: classes12.dex */
public class ReportAct extends PutongCoreAct implements ReportCategoriesFrag.InterfaceC8985a, ReportDescriptionFrag.InterfaceC8986a {

    /* JADX INFO: renamed from: f */
    public String f36382f;

    /* JADX INFO: renamed from: g */
    public ResultReceiver f36383g;

    /* JADX INFO: renamed from: i */
    public CoreDlg.ProfileMenuBuildParam f36385i;

    /* JADX INFO: renamed from: d */
    public byd0 f36380d = new byd0("report_fake_dlg_ancient_time_" + CoreModule.m30929H().userId(), 0L);

    /* JADX INFO: renamed from: e */
    public byd0 f36381e = new byd0("report_fake_dlg_recent_time_" + CoreModule.m30929H().userId(), 0L);

    /* JADX INFO: renamed from: h */
    public boolean f36384h = true;

    /* JADX INFO: renamed from: b2 */
    public static Intent m55811b2(Context context, String str, boolean z, ResultReceiver resultReceiver) {
        return m55812c2(context, str, z, resultReceiver, null);
    }

    /* JADX INFO: renamed from: c2 */
    public static Intent m55812c2(Context context, String str, boolean z, ResultReceiver resultReceiver, CoreDlg.ProfileMenuBuildParam profileMenuBuildParam) {
        return MkWebViewAct.m81418a2(context, m55816h2(str, profileMenuBuildParam), resultReceiver);
    }

    /* JADX INFO: renamed from: d2 */
    public static Intent m55813d2(Context context, String str, String str2, boolean z, ResultReceiver resultReceiver, String str3) {
        return m55814e2(context, str, str2, z, resultReceiver, str3, false);
    }

    /* JADX INFO: renamed from: e2 */
    public static Intent m55814e2(Context context, String str, String str2, boolean z, ResultReceiver resultReceiver, String str3, boolean z2) {
        return MkWebViewAct.m81418a2(context, m55817i2(str, str2, str3, z2), resultReceiver);
    }

    /* JADX INFO: renamed from: g2 */
    public static Intent m55815g2(Context context, String str, boolean z, String str2, ResultReceiver resultReceiver) {
        return MkWebViewAct.m81418a2(context, m55816h2(str, null), resultReceiver);
    }

    /* JADX INFO: renamed from: h2 */
    public static String m55816h2(String str, CoreDlg.ProfileMenuBuildParam profileMenuBuildParam) {
        String str2;
        String str3;
        String str4;
        C8992f c8992fM55879b = C8992f.m55879b();
        c8992fM55879b.m55882d(str);
        if (NullChecker.m82486a(profileMenuBuildParam) && NullChecker.m82486a(profileMenuBuildParam.reportFrom) && TextUtils.equals(profileMenuBuildParam.reportFrom.getFrom(), ReportFrom.IDENTIFY_FAKE.getFrom())) {
            c8992fM55879b.f36416c = Channel.fake;
        }
        String str5 = qv5.f159711o;
        String str6 = (TextUtils.isEmpty(str5) || str5.contains("staging2")) ? "http://m.staging2.p1staff.com/fep/tantan/frontend/tantan-frontend-app-pages-v2/src/pages/core/report/index.html?_bid=1002576#/?receive_report_user_id=%1$s&reporter_user_id=%2$s&report_source_new=%3$s&report_match_type=%4$s&language=%5$s&identify=%6$s&contentType=%7$s&profileCommentText=%8$s&moment_id=%9$s" : "https://m.tantanapp.com/fep/tantan/frontend/tantan-frontend-app-pages-v2/src/pages/core/report/index.html?_bid=1002576#/?receive_report_user_id=%1$s&reporter_user_id=%2$s&report_source_new=%3$s&report_match_type=%4$s&language=%5$s&identify=%6$s&contentType=%7$s&profileCommentText=%8$s";
        if (NullChecker.m82486a(profileMenuBuildParam)) {
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
        return String.format(str6, str, CoreModule.m30929H().userId(), c8992fM55879b.m55888j(), c8992fM55879b.m55887i(), Network.language(), c8992fM55879b.m55880a(), str2, str3, str4);
    }

    /* JADX INFO: renamed from: i2 */
    public static String m55817i2(String str, String str2, String str3, boolean z) {
        String str4 = qv5.f159711o;
        return String.format((TextUtils.isEmpty(str4) || str4.contains("staging2")) ? "http://m.staging2.p1staff.com/fep/tantan/frontend/tantan-frontend-app-pages-v2/src/pages/core/report/index.html?_bid=1002576#/?receive_report_user_id=%1$s&reporter_user_id=%2$s&report_source_new=%3$s&report_match_type=%4$s&language=%5$s&identify=%6$s&contentType=%7$s&profileCommentText=%8$s&moment_id=%9$s" : "https://m.tantanapp.com/fep/tantan/frontend/tantan-frontend-app-pages-v2/src/pages/core/report/index.html?_bid=1002576#/?receive_report_user_id=%1$s&reporter_user_id=%2$s&report_source_new=%3$s&report_match_type=%4$s&language=%5$s&identify=%6$s&contentType=%7$s&profileCommentText=%8$s", str3, "", "", str, "", "", str2, str, z ? ConversationType.swiper : "");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l2 */
    public /* synthetic */ void m55818l2(Bundle bundle) {
        Intent intent = getIntent();
        if (!TextUtils.isEmpty(intent.getStringExtra("public_id"))) {
            setTitle(getString(R$string.f19600r) + "ID:" + intent.getStringExtra("public_id"));
        }
        this.f36382f = intent.getStringExtra("user_id");
        this.f36383g = (ResultReceiver) intent.getParcelableExtra("result_receiver");
        this.f36384h = intent.getBooleanExtra("matched", true);
        this.f36385i = (CoreDlg.ProfileMenuBuildParam) intent.getSerializableExtra("extra_param");
        C8992f.m55879b().m55882d(this.f36382f);
        if (bundle == null) {
            fragmentManager().m2568m().m2812s(adc0.f70037Nb, new ReportCategoriesFrag()).mo2708i();
        }
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.report.ReportDescriptionFrag.InterfaceC8986a
    /* JADX INFO: renamed from: Z */
    public void mo55819Z(String str) {
        if (NullChecker.m82486a(this.f36383g)) {
            Bundle bundle = new Bundle();
            bundle.putString(Reason.TYPE, str);
            this.f36383g.send(-1, bundle);
        } else {
            setResult(-1);
        }
        if (gra.m131750t1()) {
            act().dialog().m21503F(lu6.m155846b(R$string.f19871zm, R$string.f19530om)).m21555t0(R$string.f18866T, new Runnable() { // from class: l.n0d0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f139606a.m55823n2();
                }
            }).m21567z0();
        } else {
            hideInput();
            super.m68056e2();
        }
    }

    @Override // com.p051p1.mobile.android.app.Act, android.app.Activity
    /* JADX INFO: renamed from: finish */
    public void m68056e2() {
        sfj0.m185596c("e_report_select", "p_report_select_view", sfj0.C20032a.m185615h("report_select_view_detail", "BACK"));
        if (NullChecker.m82486a(this.f36383g)) {
            this.f36383g.send(0, null);
        }
        C8992f.m55879b().m55886h(null);
        super.m68056e2();
    }

    @Override // com.p051p1.mobile.android.app.Act
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return layoutInflater.inflate(kec0.f126073te, (ViewGroup) null);
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act
    public void initDataOnCreate() {
        super.initDataOnCreate();
        creates(new y20() { // from class: l.m0d0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f134306a.m55818l2((Bundle) obj);
            }
        });
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.report.ReportCategoriesFrag.InterfaceC8985a
    /* JADX INFO: renamed from: j0 */
    public void mo55820j0(ReportCategory reportCategory) {
        m55821k2(reportCategory);
    }

    /* JADX INFO: renamed from: k2 */
    public final void m55821k2(ReportCategory reportCategory) {
        sfj0.m185596c("e_report_select", "p_report_select_view", sfj0.C20032a.m185615h("report_select_view_detail", C8992f.m55879b().m55890l(reportCategory)));
        fragmentManager().m2568m().m2815v(x7c0.f192697l, x7c0.f192698m, x7c0.f192696k, x7c0.f192699n).m2812s(adc0.f70037Nb, ReportDescriptionFrag.m55833U4(this.f36382f, reportCategory, this.f36385i)).m2809g(null).mo2708i();
    }

    /* JADX INFO: renamed from: m2 */
    public final /* synthetic */ void m55822m2() {
        hideInput();
        super.m68056e2();
    }

    /* JADX INFO: renamed from: n2 */
    public final /* synthetic */ void m55823n2() {
        if (this.f36384h && NullChecker.m82486a(getIntent().getStringExtra("form")) && getIntent().getStringExtra("form").equals(OMSDialogPositon.p_chat_view)) {
            CoreDlg.m46283s1(act(), this.f36382f, new x20() { // from class: l.o0d0
                @Override // p153l.x20
                public final void call() {
                    this.f144515a.m55822m2();
                }
            }, null);
        } else {
            hideInput();
            super.m68056e2();
        }
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        C8992f.m55879b().m55881c();
        super.onBackPressed();
    }

    @Override // com.p051p1.mobile.android.app.Act
    public void onHomePressed() {
        onBackPressed();
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act, p153l.e6m
    public String pageId() {
        return "p_report_view";
    }
}
