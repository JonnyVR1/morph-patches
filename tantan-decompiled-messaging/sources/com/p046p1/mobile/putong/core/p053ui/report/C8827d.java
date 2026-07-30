package com.p046p1.mobile.putong.core.p053ui.report;

import android.content.Intent;
import android.text.TextUtils;
import com.p046p1.mobile.android.app.Frag;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.R$string;
import com.p046p1.mobile.putong.core.p053ui.dlg.CoreDlg;
import com.p046p1.mobile.putong.core.p053ui.mediapicker.MediaPickerAct;
import com.p046p1.mobile.putong.core.p053ui.report.C8827d;
import com.p046p1.mobile.putong.data.Media;
import com.p046p1.mobile.putong.data.Picture;
import com.p046p1.mobile.putong.data.ProfileLike;
import com.p046p1.mobile.putong.data.Report;
import com.p046p1.mobile.putong.data.UploadSource;
import com.p046p1.mobile.putong.p065ui.mediapicker.MediaPickerBaseAct;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.UUID;
import p133rx.C22306c;
import p149l.e30;
import p149l.it6;
import p149l.j6f;
import p149l.jq2;
import p149l.lsi0;
import p149l.lsx;
import p149l.mkd0;
import p149l.mqi0;
import p149l.o6j0;
import p149l.roj0;
import p149l.upa;
import p149l.vwb;
import p149l.w85;
import p149l.w9j;
import p149l.yij0;

/* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.report.d */
/* JADX INFO: loaded from: classes9.dex */
public class C8827d extends jq2<C8828e> {

    /* JADX INFO: renamed from: a */
    public final List<Media> f35545a;

    /* JADX INFO: renamed from: b */
    public final Frag f35546b;

    /* JADX INFO: renamed from: c */
    public ReportDescriptionFrag.InterfaceC8823a f35547c;

    /* JADX INFO: renamed from: d */
    public ReportCategory f35548d;

    /* JADX INFO: renamed from: e */
    public String f35549e;

    /* JADX INFO: renamed from: f */
    public CoreDlg.ProfileMenuBuildParam f35550f;

    public C8827d(ReportDescriptionFrag reportDescriptionFrag) {
        super(reportDescriptionFrag);
        this.f35545a = new ArrayList();
        this.f35546b = reportDescriptionFrag;
    }

    /* JADX INFO: renamed from: e0 */
    public static /* synthetic */ Picture m54660e0(Media media) {
        return (Picture) media;
    }

    @Override // p149l.q0m
    public void destroy() {
        this.f35547c = null;
    }

    /* JADX INFO: renamed from: j0 */
    public void m54665j0(int i) {
        if (i < this.f35545a.size()) {
            this.f35545a.remove(i);
        }
    }

    /* JADX INFO: renamed from: k0 */
    public void m54666k0(String str, ReportCategory reportCategory, boolean z, ReportDescriptionFrag.InterfaceC8823a interfaceC8823a, CoreDlg.ProfileMenuBuildParam profileMenuBuildParam) {
        this.f35549e = str;
        this.f35548d = reportCategory;
        this.f35547c = interfaceC8823a;
        this.f35550f = profileMenuBuildParam;
        ((C8828e) this.viewModel).m54684l(reportCategory, reportCategory.isCategorised() && (!reportCategory.isGP() || z));
    }

    /* JADX INFO: renamed from: l0 */
    public final /* synthetic */ C22306c m54667l0(Report report, List list) {
        report.pictures = vwb.m200303Q(list, new w9j() { // from class: l.usc0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return C8827d.m54660e0((Media) obj);
            }
        });
        return CoreModule.f17545c.f19639e0.m169496ha(this.f35549e, report);
    }

    /* JADX INFO: renamed from: m0 */
    public final /* synthetic */ void m54668m0(String str, roj0 roj0Var) {
        HashMap map = new HashMap();
        map.put("User reported {UID}", this.f35549e);
        ReportCategory reportCategory = this.f35548d;
        if (reportCategory != null) {
            map.put("Reason", reportCategory.toString());
        }
        w85.INSTANCE.m202145m("Report User", map);
        act().progressDismiss();
        if (NullChecker.m81304b(this.f35547c)) {
            this.f35547c.mo54636Y(str);
        }
        if (upa.m194819t1()) {
            return;
        }
        lsi0.m151595y(it6.m138181b(R$string.f18462dm, R$string.f18128Sl));
    }

    /* JADX INFO: renamed from: n0 */
    public final /* synthetic */ void m54669n0(Throwable th) {
        act().progressDismiss();
        yij0.m214926D(th);
    }

    /* JADX INFO: renamed from: o0 */
    public void m54670o0(int i, int i2, Intent intent) {
        if (i2 == -1) {
            List<Media> list = (List) intent.getSerializableExtra(MediaPickerBaseAct.f54603h);
            this.f35545a.addAll(list);
            ((C8828e) this.viewModel).m54679e(list);
        }
    }

    /* JADX INFO: renamed from: p0 */
    public void m54671p0() {
        C8829f c8829fM54696b = C8829f.m54696b();
        o6j0.m162859c("e_report_submit", "p_report_submit_view", o6j0.C18854a.m162878h("receive_report_user_id", c8829fM54696b.m54706k()), o6j0.C18854a.m162878h("report_mark", TextUtils.isEmpty(((C8828e) this.viewModel).m54685m()) ? "0" : "1"), o6j0.C18854a.m162878h("report_match_type", c8829fM54696b.m54704i()), o6j0.C18854a.m162876f("report_picture_number", this.f35545a.size()), o6j0.C18854a.m162878h("report_pre_id", m54673r0()), o6j0.C18854a.m162878h("report_source_new", c8829fM54696b.m54705j()), o6j0.C18854a.m162878h("reporter_user_id", CoreModule.m29931H().userId()), o6j0.C18854a.m162878h("report_submit_view_detail", "back"));
    }

    /* JADX INFO: renamed from: q0 */
    public void m54672q0() {
        this.f35546b.startActivityForResult(MediaPickerAct.m47782c2(act(), 8 - this.f35545a.size(), false, false, false), 0);
    }

    /* JADX INFO: renamed from: r0 */
    public final String m54673r0() {
        int iHashCode = (C8829f.m54696b().m54706k() + CoreModule.m29931H().userId() + mqi0.m155944o()).hashCode();
        return UUID.randomUUID().toString() + "-" + ((iHashCode >> 16) + (iHashCode & j6f.COLOR_SPACE_UNCALIBRATED));
    }

    /* JADX INFO: renamed from: s0 */
    public void m54674s0(String str) {
        act().progress(R$string.f17842J5, true);
        final Report report = new Report();
        report.requestId = m54673r0();
        final String strString = act().string(this.f35548d.resId);
        report.category = Report.CATEGORY_DEFAULT;
        report.value = strString + ":" + str;
        if (NullChecker.m81303a(this.f35550f) && NullChecker.m81303a(this.f35550f.reportFrom) && !TextUtils.isEmpty(this.f35550f.reportTypeId)) {
            report.contentType = this.f35550f.reportFrom.getFrom();
            report.contentId = this.f35550f.reportTypeId;
        }
        if (NullChecker.m81303a(this.f35550f) && TextUtils.equals(ProfileLike.TYPE, this.f35550f.contentType)) {
            report.contentType = this.f35550f.contentType;
            ArrayList arrayList = new ArrayList();
            arrayList.add(this.f35550f.profileCommentText);
            report.chatMessages = arrayList;
        }
        C8829f c8829fM54696b = C8829f.m54696b();
        o6j0.m162859c("e_report_submit", "p_report_submit_view", o6j0.C18854a.m162878h("receive_report_user_id", c8829fM54696b.m54706k()), o6j0.C18854a.m162878h("report_mark", TextUtils.isEmpty(str) ? "0" : "1"), o6j0.C18854a.m162878h("report_match_type", c8829fM54696b.m54704i()), o6j0.C18854a.m162876f("report_picture_number", this.f35545a.size()), o6j0.C18854a.m162878h("report_pre_id", m54673r0()), o6j0.C18854a.m162878h("report_source_new", c8829fM54696b.m54705j()), o6j0.C18854a.m162878h("reporter_user_id", CoreModule.m29931H().userId()), o6j0.C18854a.m162878h("report_submit_view_detail", "submit"), o6j0.C18854a.m162878h("report_other_accounts", "0"), o6j0.C18854a.m162878h("report_chat", "0"));
        duringCreated(this.f35545a.isEmpty() ? CoreModule.f17545c.f19639e0.m169496ha(this.f35549e, report) : new lsx(this.f35545a, false).last().flatMap(new w9j() { // from class: l.qsc0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return ya5.m213795K((List) obj, "report", null, UploadSource.get("report"));
            }
        }).compose(mkd0.m154965Q()).flatMap(new w9j() { // from class: l.rsc0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f160830a.m54667l0(report, (List) obj);
            }
        })).subscribe(mkd0.m154956H(new e30() { // from class: l.ssc0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f166175a.m54668m0(strString, (roj0) obj);
            }
        }, new e30() { // from class: l.tsc0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f171926a.m54669n0((Throwable) obj);
            }
        }));
    }
}
