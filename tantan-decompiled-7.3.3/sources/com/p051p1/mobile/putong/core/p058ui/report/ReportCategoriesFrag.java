package com.p051p1.mobile.putong.core.p058ui.report;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.annotation.Nullable;
import com.p051p1.mobile.putong.app.PutongMvpFrag;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.p058ui.report.ReportCategoriesFrag;
import p153l.pf60;
import p153l.x20;
import p153l.y20;

/* JADX INFO: loaded from: classes12.dex */
public class ReportCategoriesFrag extends PutongMvpFrag<C8987a, C8989c> {

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.report.ReportCategoriesFrag$a */
    public interface InterfaceC8985a {
        /* JADX INFO: renamed from: j0 */
        void mo55820j0(ReportCategory reportCategory);
    }

    /* JADX INFO: renamed from: P4 */
    public static /* synthetic */ void m55825P4(Bundle bundle) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: S4 */
    public /* synthetic */ void m55826S4() {
        ViewParent parent;
        if (getView() == null || (parent = getView().getParent()) == null) {
            return;
        }
        ((ViewGroup) parent).endViewTransition(getView());
    }

    @Override // com.p051p1.mobile.putong.app.PutongMvpFrag
    /* JADX INFO: renamed from: Q4, reason: merged with bridge method [inline-methods] */
    public C8987a mo30639M4() {
        return new C8987a(this);
    }

    @Override // com.p051p1.mobile.putong.app.PutongMvpFrag
    /* JADX INFO: renamed from: R4, reason: merged with bridge method [inline-methods] */
    public C8989c mo30640N4() {
        return new C8989c(getContext());
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

    @Override // com.p051p1.mobile.putong.app.PutongMvpFrag, com.p051p1.mobile.putong.app.PutongFrag, com.p051p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: f4 */
    public void mo21584f4() {
        super.mo21584f4();
        creates(new y20() { // from class: l.r0d0
            @Override // p153l.y20
            public final void call(Object obj) {
                ReportCategoriesFrag.m55825P4((Bundle) obj);
            }
        }, new x20() { // from class: l.s0d0
            @Override // p153l.x20
            public final void call() {
                this.f165676a.m55826S4();
            }
        });
    }

    @Override // com.p051p1.mobile.putong.app.PutongMvpFrag, com.p051p1.mobile.android.app.Frag
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return super.inflateView(layoutInflater, viewGroup);
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityCreated(@Nullable Bundle bundle) {
        super.onActivityCreated(bundle);
        ((C8987a) this.f17894z).m55837e0((InterfaceC8985a) act(), ((ReportAct) act()).f36384h);
    }

    @Override // com.p051p1.mobile.putong.app.PutongFrag, com.p051p1.mobile.android.app.Frag, p153l.e6m
    public String pageId() {
        return "p_report_select_view";
    }
}
