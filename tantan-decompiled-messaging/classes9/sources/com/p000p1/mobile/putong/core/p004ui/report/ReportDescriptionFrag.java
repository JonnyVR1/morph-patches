package com.p000p1.mobile.putong.core.p004ui.report;

import android.content.Intent;
import android.os.Bundle;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.annotation.Nullable;
import com.p000p1.mobile.putong.app.PutongMvpFrag;
import com.p000p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.ui.dlg.CoreDlg;
import com.tantanapp.common.utils.NullChecker;
import l.d30;
import l.e30;
import l.j760;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class ReportDescriptionFrag extends PutongMvpFrag<C0263d, C0264e> implements C0265f.b {

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.report.ReportDescriptionFrag$a */
    public interface InterfaceC0259a {
        /* JADX INFO: renamed from: Y */
        void mo7986Y(String str);
    }

    public ReportDescriptionFrag() {
        creates(new e30() { // from class: l.osc0
            public final void call(Object obj) {
                this.f18356a.m7998S4((Bundle) obj);
            }
        }, new d30() { // from class: l.psc0
            public final void call() {
                this.f19285a.m7999T4();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: S4 */
    public /* synthetic */ void m7998S4(Bundle bundle) {
        C0265f.m8053b().m8059g(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: T4 */
    public /* synthetic */ void m7999T4() {
        C0265f.m8053b().m8060h(this);
    }

    /* JADX INFO: renamed from: U4 */
    public static ReportDescriptionFrag m8000U4(String str, ReportCategory reportCategory, CoreDlg.ProfileMenuBuildParam profileMenuBuildParam) {
        ReportDescriptionFrag reportDescriptionFrag = new ReportDescriptionFrag();
        Bundle bundle = new Bundle(2);
        bundle.putString("user_id", str);
        bundle.putSerializable("category", reportCategory);
        if (NullChecker.a(profileMenuBuildParam)) {
            bundle.putSerializable("extra_param", profileMenuBuildParam);
        }
        reportDescriptionFrag.setArguments(bundle);
        return reportDescriptionFrag;
    }

    @Override // com.p000p1.mobile.putong.app.PutongMvpFrag
    /* JADX INFO: renamed from: Q4, reason: merged with bridge method [inline-methods] */
    public C0263d mo1551M4() {
        return new C0263d(this);
    }

    @Override // com.p000p1.mobile.putong.app.PutongMvpFrag
    /* JADX INFO: renamed from: R4, reason: merged with bridge method [inline-methods] */
    public C0264e mo1552N4() {
        return new C0264e(getContext());
    }

    @Override // com.p000p1.mobile.putong.app.PutongMvpFrag, com.p000p1.mobile.putong.app.PutongFrag
    /* JADX INFO: renamed from: d4 */
    public void mo1548d4() {
        super.mo1548d4();
        C0265f c0265fM8053b = C0265f.m8053b();
        this.pageHelper.p(new j760[]{new j760("receive_report_user_id", c0265fM8053b.m8063k()), new j760("report_match_type", c0265fM8053b.m8061i()), new j760("report_source_new", c0265fM8053b.m8062j()), new j760("reporter_user_id", CoreModule.m1850H().userId())});
    }

    @Override // com.p000p1.mobile.putong.app.PutongFrag
    public boolean disableAutoPV() {
        return false;
    }

    @Override // com.p000p1.mobile.putong.core.p004ui.report.C0265f.b
    /* JADX INFO: renamed from: f0 */
    public void mo8003f0() {
        p p = this.f1164z;
        if (p == 0) {
            return;
        }
        ((C0263d) p).m8023p0();
    }

    public void onActivityCreated(@Nullable Bundle bundle) {
        super/*androidx.fragment.app.Fragment*/.onActivityCreated(bundle);
        ((C0263d) this.f1164z).m8018k0(getArguments().getString("user_id"), (ReportCategory) getArguments().getSerializable("category"), ((ReportAct) act()).f5317h, (ReportAct) act(), getArguments().getSerializable("extra_param"));
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        ((C0263d) this.f1164z).m8022o0(i, i2, intent);
    }

    public void onDestroyView() {
        ViewParent parent;
        if (getView() != null && (parent = getView().getParent()) != null) {
            ((ViewGroup) parent).endViewTransition(getView());
        }
        super.onDestroyView();
        act().hideInput();
    }

    @Override // com.p000p1.mobile.putong.app.PutongFrag
    public String pageId() {
        return "p_report_submit_view";
    }
}
