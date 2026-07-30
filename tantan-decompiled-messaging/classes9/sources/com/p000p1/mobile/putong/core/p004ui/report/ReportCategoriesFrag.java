package com.p000p1.mobile.putong.core.p004ui.report;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.annotation.Nullable;
import com.p000p1.mobile.putong.app.PutongMvpFrag;
import com.p000p1.mobile.putong.core.CoreModule;
import com.p000p1.mobile.putong.core.p004ui.report.ReportCategoriesFrag;
import l.d30;
import l.e30;
import l.j760;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class ReportCategoriesFrag extends PutongMvpFrag<C0260a, C0262c> {

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.report.ReportCategoriesFrag$a */
    public interface InterfaceC0258a {
        /* JADX INFO: renamed from: h0 */
        void mo7987h0(ReportCategory reportCategory);
    }

    /* JADX INFO: renamed from: P4 */
    public static /* synthetic */ void m7992P4(Bundle bundle) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: S4 */
    public /* synthetic */ void m7993S4() {
        ViewParent parent;
        if (getView() == null || (parent = getView().getParent()) == null) {
            return;
        }
        ((ViewGroup) parent).endViewTransition(getView());
    }

    @Override // com.p000p1.mobile.putong.app.PutongMvpFrag
    /* JADX INFO: renamed from: Q4, reason: merged with bridge method [inline-methods] */
    public C0260a mo1551M4() {
        return new C0260a(this);
    }

    @Override // com.p000p1.mobile.putong.app.PutongMvpFrag
    /* JADX INFO: renamed from: R4, reason: merged with bridge method [inline-methods] */
    public C0262c mo1552N4() {
        return new C0262c(getContext());
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

    @Override // com.p000p1.mobile.putong.app.PutongMvpFrag, com.p000p1.mobile.putong.app.PutongFrag
    /* JADX INFO: renamed from: f4 */
    public void mo1549f4() {
        super.mo1549f4();
        creates(new e30() { // from class: l.msc0
            public final void call(Object obj) {
                ReportCategoriesFrag.m7992P4((Bundle) obj);
            }
        }, new d30() { // from class: l.nsc0
            public final void call() {
                this.f17834a.m7993S4();
            }
        });
    }

    @Override // com.p000p1.mobile.putong.app.PutongMvpFrag
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return super.inflateView(layoutInflater, viewGroup);
    }

    public void onActivityCreated(@Nullable Bundle bundle) {
        super/*androidx.fragment.app.Fragment*/.onActivityCreated(bundle);
        ((C0260a) this.f1164z).m8004e0((InterfaceC0258a) act(), ((ReportAct) act()).f5317h);
    }

    @Override // com.p000p1.mobile.putong.app.PutongFrag
    public String pageId() {
        return "p_report_select_view";
    }
}
