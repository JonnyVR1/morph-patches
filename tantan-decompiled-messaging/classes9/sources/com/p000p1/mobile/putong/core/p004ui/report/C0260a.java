package com.p000p1.mobile.putong.core.p004ui.report;

import com.tantanapp.common.utils.NullChecker;
import l.jq2;
import l.mcr;
import l.s7m;

/* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.report.a */
/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class C0260a extends jq2<C0262c> {

    /* JADX INFO: renamed from: a */
    public ReportCategoriesFrag.InterfaceC0258a f5319a;

    public C0260a(mcr mcrVar) {
        super(mcrVar);
    }

    public void destroy() {
        this.f5319a = null;
    }

    /* JADX INFO: renamed from: e0 */
    public void m8004e0(ReportCategoriesFrag.InterfaceC0258a interfaceC0258a, boolean z) {
        this.f5319a = interfaceC0258a;
        s7m s7mVar = ((jq2) this).viewModel;
        if (z) {
            ((C0262c) s7mVar).m8010d(ReportCategory.values());
        } else {
            ((C0262c) s7mVar).m8010d(new ReportCategory[]{ReportCategory.SPAM, ReportCategory.EXPLICIT, ReportCategory.FAKE_ACCOUNT, ReportCategory.YOUNGER, ReportCategory.VIOLENCE, ReportCategory.RECOMMEND, ReportCategory.OTHER});
        }
    }

    /* JADX INFO: renamed from: f0 */
    public void m8005f0(ReportCategory reportCategory) {
        if (NullChecker.b(this.f5319a)) {
            this.f5319a.mo7987h0(reportCategory);
        }
    }
}
