package com.p046p1.mobile.putong.core.p053ui.report;

import com.tantanapp.common.utils.NullChecker;
import p149l.jq2;
import p149l.mcr;

/* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.report.a */
/* JADX INFO: loaded from: classes9.dex */
public class C8824a extends jq2<C8826c> {

    /* JADX INFO: renamed from: a */
    public ReportCategoriesFrag.InterfaceC8822a f35538a;

    public C8824a(mcr mcrVar) {
        super(mcrVar);
    }

    @Override // p149l.q0m
    public void destroy() {
        this.f35538a = null;
    }

    /* JADX INFO: renamed from: e0 */
    public void m54654e0(ReportCategoriesFrag.InterfaceC8822a interfaceC8822a, boolean z) {
        this.f35538a = interfaceC8822a;
        V v2 = this.viewModel;
        if (z) {
            ((C8826c) v2).m54659d(ReportCategory.values());
        } else {
            ((C8826c) v2).m54659d(new ReportCategory[]{ReportCategory.SPAM, ReportCategory.EXPLICIT, ReportCategory.FAKE_ACCOUNT, ReportCategory.YOUNGER, ReportCategory.VIOLENCE, ReportCategory.RECOMMEND, ReportCategory.OTHER});
        }
    }

    /* JADX INFO: renamed from: f0 */
    public void m54655f0(ReportCategory reportCategory) {
        if (NullChecker.m81304b(this.f35538a)) {
            this.f35538a.mo54637h0(reportCategory);
        }
    }
}
