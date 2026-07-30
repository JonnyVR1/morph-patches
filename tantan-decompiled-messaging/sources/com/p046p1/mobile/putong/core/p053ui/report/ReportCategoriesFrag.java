package com.p046p1.mobile.putong.core.p053ui.report;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.annotation.Nullable;
import com.p046p1.mobile.putong.app.PutongMvpFrag;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.p053ui.report.ReportCategoriesFrag;
import p149l.d30;
import p149l.e30;
import p149l.j760;

/* JADX INFO: loaded from: classes9.dex */
public class ReportCategoriesFrag extends PutongMvpFrag<C8824a, C8826c> {

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.report.ReportCategoriesFrag$a */
    public interface InterfaceC8822a {
        /* JADX INFO: renamed from: h0 */
        void mo54637h0(ReportCategory reportCategory);
    }

    /* JADX INFO: renamed from: P4 */
    public static /* synthetic */ void m54642P4(Bundle bundle) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: S4 */
    public /* synthetic */ void m54643S4() {
        ViewParent parent;
        if (getView() == null || (parent = getView().getParent()) == null) {
            return;
        }
        ((ViewGroup) parent).endViewTransition(getView());
    }

    @Override // com.p046p1.mobile.putong.app.PutongMvpFrag
    /* JADX INFO: renamed from: Q4, reason: merged with bridge method [inline-methods] */
    public C8824a mo29641M4() {
        return new C8824a(this);
    }

    @Override // com.p046p1.mobile.putong.app.PutongMvpFrag
    /* JADX INFO: renamed from: R4, reason: merged with bridge method [inline-methods] */
    public C8826c mo29642N4() {
        return new C8826c(getContext());
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

    @Override // com.p046p1.mobile.putong.app.PutongMvpFrag, com.p046p1.mobile.putong.app.PutongFrag, com.p046p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: f4 */
    public void mo20585f4() {
        super.mo20585f4();
        creates(new e30() { // from class: l.msc0
            @Override // p149l.e30
            public final void call(Object obj) {
                ReportCategoriesFrag.m54642P4((Bundle) obj);
            }
        }, new d30() { // from class: l.nsc0
            @Override // p149l.d30
            public final void call() {
                this.f140258a.m54643S4();
            }
        });
    }

    @Override // com.p046p1.mobile.putong.app.PutongMvpFrag, com.p046p1.mobile.android.app.Frag
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return super.inflateView(layoutInflater, viewGroup);
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityCreated(@Nullable Bundle bundle) {
        super.onActivityCreated(bundle);
        ((C8824a) this.f17175z).m54654e0((InterfaceC8822a) act(), ((ReportAct) act()).f35536h);
    }

    @Override // com.p046p1.mobile.putong.app.PutongFrag, com.p046p1.mobile.android.app.Frag, p149l.n3m
    public String pageId() {
        return "p_report_select_view";
    }
}
