package com.p051p1.mobile.putong.core.p058ui.report;

import android.content.Intent;
import android.os.Bundle;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.annotation.Nullable;
import com.p051p1.mobile.putong.app.PutongMvpFrag;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.p058ui.dlg.CoreDlg;
import com.tantanapp.common.utils.NullChecker;
import p153l.pf60;
import p153l.x20;
import p153l.y20;

/* JADX INFO: loaded from: classes12.dex */
public class ReportDescriptionFrag extends PutongMvpFrag<C8990d, C8991e> implements C8992f.b {

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.report.ReportDescriptionFrag$a */
    public interface InterfaceC8986a {
        /* JADX INFO: renamed from: Z */
        void mo55819Z(String str);
    }

    public ReportDescriptionFrag() {
        creates(new y20() { // from class: l.t0d0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f171488a.m55831S4((Bundle) obj);
            }
        }, new x20() { // from class: l.u0d0
            @Override // p153l.x20
            public final void call() {
                this.f176875a.m55832T4();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: S4 */
    public /* synthetic */ void m55831S4(Bundle bundle) {
        C8992f.m55879b().m55885g(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: T4 */
    public /* synthetic */ void m55832T4() {
        C8992f.m55879b().m55886h(this);
    }

    /* JADX INFO: renamed from: U4 */
    public static ReportDescriptionFrag m55833U4(String str, ReportCategory reportCategory, CoreDlg.ProfileMenuBuildParam profileMenuBuildParam) {
        ReportDescriptionFrag reportDescriptionFrag = new ReportDescriptionFrag();
        Bundle bundle = new Bundle(2);
        bundle.putString("user_id", str);
        bundle.putSerializable("category", reportCategory);
        if (NullChecker.m82486a(profileMenuBuildParam)) {
            bundle.putSerializable("extra_param", profileMenuBuildParam);
        }
        reportDescriptionFrag.setArguments(bundle);
        return reportDescriptionFrag;
    }

    @Override // com.p051p1.mobile.putong.app.PutongMvpFrag
    /* JADX INFO: renamed from: Q4, reason: merged with bridge method [inline-methods] */
    public C8990d mo30639M4() {
        return new C8990d(this);
    }

    @Override // com.p051p1.mobile.putong.app.PutongMvpFrag
    /* JADX INFO: renamed from: R4, reason: merged with bridge method [inline-methods] */
    public C8991e mo30640N4() {
        return new C8991e(getContext());
    }

    @Override // com.p051p1.mobile.putong.app.PutongMvpFrag, com.p051p1.mobile.putong.app.PutongFrag, com.p051p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: d4 */
    public void mo21582d4() {
        super.mo21582d4();
        C8992f c8992fM55879b = C8992f.m55879b();
        this.pageHelper.m152781p(new pf60("receive_report_user_id", c8992fM55879b.m55889k()), new pf60("report_match_type", c8992fM55879b.m55887i()), new pf60("report_source_new", c8992fM55879b.m55888j()), new pf60("reporter_user_id", CoreModule.m30929H().userId()));
    }

    @Override // com.p051p1.mobile.putong.app.PutongFrag, p153l.e6m
    public boolean disableAutoPV() {
        return false;
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.report.C8992f.b
    /* JADX INFO: renamed from: f0 */
    public void mo55836f0() {
        p p = this.f17894z;
        if (p == 0) {
            return;
        }
        ((C8990d) p).m55854p0();
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityCreated(@Nullable Bundle bundle) {
        super.onActivityCreated(bundle);
        ((C8990d) this.f17894z).m55849k0(getArguments().getString("user_id"), (ReportCategory) getArguments().getSerializable("category"), ((ReportAct) act()).f36384h, (ReportAct) act(), (CoreDlg.ProfileMenuBuildParam) getArguments().getSerializable("extra_param"));
    }

    @Override // com.p051p1.mobile.android.app.Frag, androidx.fragment.app.Fragment
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        ((C8990d) this.f17894z).m55853o0(i, i2, intent);
    }

    @Override // com.p051p1.mobile.android.app.Frag, androidx.fragment.app.Fragment
    public void onDestroyView() {
        ViewParent parent;
        if (getView() != null && (parent = getView().getParent()) != null) {
            ((ViewGroup) parent).endViewTransition(getView());
        }
        super.onDestroyView();
        act().hideInput();
    }

    @Override // com.p051p1.mobile.putong.app.PutongFrag, com.p051p1.mobile.android.app.Frag, p153l.e6m
    public String pageId() {
        return "p_report_submit_view";
    }
}
