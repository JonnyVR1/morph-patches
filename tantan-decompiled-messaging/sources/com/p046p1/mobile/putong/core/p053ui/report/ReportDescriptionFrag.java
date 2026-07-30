package com.p046p1.mobile.putong.core.p053ui.report;

import android.content.Intent;
import android.os.Bundle;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.annotation.Nullable;
import com.p046p1.mobile.putong.app.PutongMvpFrag;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.p053ui.dlg.CoreDlg;
import com.tantanapp.common.utils.NullChecker;
import p149l.d30;
import p149l.e30;
import p149l.j760;

/* JADX INFO: loaded from: classes9.dex */
public class ReportDescriptionFrag extends PutongMvpFrag<C8827d, C8828e> implements C8829f.b {

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.report.ReportDescriptionFrag$a */
    public interface InterfaceC8823a {
        /* JADX INFO: renamed from: Y */
        void mo54636Y(String str);
    }

    public ReportDescriptionFrag() {
        creates(new e30() { // from class: l.osc0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f145382a.m54648S4((Bundle) obj);
            }
        }, new d30() { // from class: l.psc0
            @Override // p149l.d30
            public final void call() {
                this.f150991a.m54649T4();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: S4 */
    public /* synthetic */ void m54648S4(Bundle bundle) {
        C8829f.m54696b().m54702g(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: T4 */
    public /* synthetic */ void m54649T4() {
        C8829f.m54696b().m54703h(this);
    }

    /* JADX INFO: renamed from: U4 */
    public static ReportDescriptionFrag m54650U4(String str, ReportCategory reportCategory, CoreDlg.ProfileMenuBuildParam profileMenuBuildParam) {
        ReportDescriptionFrag reportDescriptionFrag = new ReportDescriptionFrag();
        Bundle bundle = new Bundle(2);
        bundle.putString("user_id", str);
        bundle.putSerializable("category", reportCategory);
        if (NullChecker.m81303a(profileMenuBuildParam)) {
            bundle.putSerializable("extra_param", profileMenuBuildParam);
        }
        reportDescriptionFrag.setArguments(bundle);
        return reportDescriptionFrag;
    }

    @Override // com.p046p1.mobile.putong.app.PutongMvpFrag
    /* JADX INFO: renamed from: Q4, reason: merged with bridge method [inline-methods] */
    public C8827d mo29641M4() {
        return new C8827d(this);
    }

    @Override // com.p046p1.mobile.putong.app.PutongMvpFrag
    /* JADX INFO: renamed from: R4, reason: merged with bridge method [inline-methods] */
    public C8828e mo29642N4() {
        return new C8828e(getContext());
    }

    @Override // com.p046p1.mobile.putong.app.PutongMvpFrag, com.p046p1.mobile.putong.app.PutongFrag, com.p046p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: d4 */
    public void mo20583d4() {
        super.mo20583d4();
        C8829f c8829fM54696b = C8829f.m54696b();
        this.pageHelper.m109040p(new j760("receive_report_user_id", c8829fM54696b.m54706k()), new j760("report_match_type", c8829fM54696b.m54704i()), new j760("report_source_new", c8829fM54696b.m54705j()), new j760("reporter_user_id", CoreModule.m29931H().userId()));
    }

    @Override // com.p046p1.mobile.putong.app.PutongFrag, p149l.n3m
    public boolean disableAutoPV() {
        return false;
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.report.C8829f.b
    /* JADX INFO: renamed from: f0 */
    public void mo54653f0() {
        p p = this.f17175z;
        if (p == 0) {
            return;
        }
        ((C8827d) p).m54671p0();
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityCreated(@Nullable Bundle bundle) {
        super.onActivityCreated(bundle);
        ((C8827d) this.f17175z).m54666k0(getArguments().getString("user_id"), (ReportCategory) getArguments().getSerializable("category"), ((ReportAct) act()).f35536h, (ReportAct) act(), (CoreDlg.ProfileMenuBuildParam) getArguments().getSerializable("extra_param"));
    }

    @Override // com.p046p1.mobile.android.app.Frag, androidx.fragment.app.Fragment
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        ((C8827d) this.f17175z).m54670o0(i, i2, intent);
    }

    @Override // com.p046p1.mobile.android.app.Frag, androidx.fragment.app.Fragment
    public void onDestroyView() {
        ViewParent parent;
        if (getView() != null && (parent = getView().getParent()) != null) {
            ((ViewGroup) parent).endViewTransition(getView());
        }
        super.onDestroyView();
        act().hideInput();
    }

    @Override // com.p046p1.mobile.putong.app.PutongFrag, com.p046p1.mobile.android.app.Frag, p149l.n3m
    public String pageId() {
        return "p_report_submit_view";
    }
}
