package com.p051p1.mobile.putong.core.p058ui.report;

import com.tantanapp.common.utils.NullChecker;
import p153l.ar2;
import p153l.ner;

/* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.report.a */
/* JADX INFO: loaded from: classes12.dex */
public class C8987a extends ar2<C8989c> {

    /* JADX INFO: renamed from: a */
    public ReportCategoriesFrag.InterfaceC8985a f36386a;

    public C8987a(ner nerVar) {
        super(nerVar);
    }

    @Override // p153l.k3m
    public void destroy() {
        this.f36386a = null;
    }

    /* JADX INFO: renamed from: e0 */
    public void m55837e0(ReportCategoriesFrag.InterfaceC8985a interfaceC8985a, boolean z) {
        this.f36386a = interfaceC8985a;
        V v2 = this.viewModel;
        if (z) {
            ((C8989c) v2).m55842d(ReportCategory.values());
        } else {
            ((C8989c) v2).m55842d(new ReportCategory[]{ReportCategory.SPAM, ReportCategory.EXPLICIT, ReportCategory.FAKE_ACCOUNT, ReportCategory.YOUNGER, ReportCategory.VIOLENCE, ReportCategory.RECOMMEND, ReportCategory.OTHER});
        }
    }

    /* JADX INFO: renamed from: f0 */
    public void m55838f0(ReportCategory reportCategory) {
        if (NullChecker.m82487b(this.f36386a)) {
            this.f36386a.mo55820j0(reportCategory);
        }
    }
}
