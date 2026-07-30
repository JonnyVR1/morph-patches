package com.p051p1.mobile.putong.core.p058ui.report;

import android.content.Intent;
import android.text.TextUtils;
import com.p051p1.mobile.android.app.Frag;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.R$string;
import com.p051p1.mobile.putong.core.p058ui.dlg.CoreDlg;
import com.p051p1.mobile.putong.core.p058ui.mediapicker.MediaPickerAct;
import com.p051p1.mobile.putong.core.p058ui.report.C8990d;
import com.p051p1.mobile.putong.data.Media;
import com.p051p1.mobile.putong.data.Picture;
import com.p051p1.mobile.putong.data.ProfileLike;
import com.p051p1.mobile.putong.data.Report;
import com.p051p1.mobile.putong.data.UploadSource;
import com.p051p1.mobile.putong.p070ui.mediapicker.MediaPickerBaseAct;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.UUID;
import p137rx.C22421c;
import p153l.ar2;
import p153l.bsj0;
import p153l.gra;
import p153l.i1y;
import p153l.jyb;
import p153l.lu6;
import p153l.o1j0;
import p153l.p7f;
import p153l.psd0;
import p153l.pzi0;
import p153l.qcj;
import p153l.sfj0;
import p153l.uxj0;
import p153l.x95;
import p153l.y20;

/* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.report.d */
/* JADX INFO: loaded from: classes12.dex */
public class C8990d extends ar2<C8991e> {

    /* JADX INFO: renamed from: a */
    public final List<Media> f36393a;

    /* JADX INFO: renamed from: b */
    public final Frag f36394b;

    /* JADX INFO: renamed from: c */
    public ReportDescriptionFrag.InterfaceC8986a f36395c;

    /* JADX INFO: renamed from: d */
    public ReportCategory f36396d;

    /* JADX INFO: renamed from: e */
    public String f36397e;

    /* JADX INFO: renamed from: f */
    public CoreDlg.ProfileMenuBuildParam f36398f;

    public C8990d(ReportDescriptionFrag reportDescriptionFrag) {
        super(reportDescriptionFrag);
        this.f36393a = new ArrayList();
        this.f36394b = reportDescriptionFrag;
    }

    /* JADX INFO: renamed from: e0 */
    public static /* synthetic */ Picture m55843e0(Media media) {
        return (Picture) media;
    }

    @Override // p153l.k3m
    public void destroy() {
        this.f36395c = null;
    }

    /* JADX INFO: renamed from: j0 */
    public void m55848j0(int i) {
        if (i < this.f36393a.size()) {
            this.f36393a.remove(i);
        }
    }

    /* JADX INFO: renamed from: k0 */
    public void m55849k0(String str, ReportCategory reportCategory, boolean z, ReportDescriptionFrag.InterfaceC8986a interfaceC8986a, CoreDlg.ProfileMenuBuildParam profileMenuBuildParam) {
        this.f36397e = str;
        this.f36396d = reportCategory;
        this.f36395c = interfaceC8986a;
        this.f36398f = profileMenuBuildParam;
        ((C8991e) this.viewModel).m55867l(reportCategory, reportCategory.isCategorised() && (!reportCategory.isGP() || z));
    }

    /* JADX INFO: renamed from: l0 */
    public final /* synthetic */ C22421c m55850l0(Report report, List list) {
        report.pictures = jyb.m147486Q(list, new qcj() { // from class: l.z0d0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return C8990d.m55843e0((Media) obj);
            }
        });
        return CoreModule.f18264c.f20381e0.m116569ha(this.f36397e, report);
    }

    /* JADX INFO: renamed from: m0 */
    public final /* synthetic */ void m55851m0(String str, uxj0 uxj0Var) {
        HashMap map = new HashMap();
        map.put("User reported {UID}", this.f36397e);
        ReportCategory reportCategory = this.f36396d;
        if (reportCategory != null) {
            map.put("Reason", reportCategory.toString());
        }
        x95.INSTANCE.m209793m("Report User", map);
        act().progressDismiss();
        if (NullChecker.m82487b(this.f36395c)) {
            this.f36395c.mo55819Z(str);
        }
        if (gra.m131750t1()) {
            return;
        }
        o1j0.m165651y(lu6.m155846b(R$string.f19871zm, R$string.f19530om));
    }

    /* JADX INFO: renamed from: n0 */
    public final /* synthetic */ void m55852n0(Throwable th) {
        act().progressDismiss();
        bsj0.m106246D(th);
    }

    /* JADX INFO: renamed from: o0 */
    public void m55853o0(int i, int i2, Intent intent) {
        if (i2 == -1) {
            List<Media> list = (List) intent.getSerializableExtra(MediaPickerBaseAct.f55451h);
            this.f36393a.addAll(list);
            ((C8991e) this.viewModel).m55862e(list);
        }
    }

    /* JADX INFO: renamed from: p0 */
    public void m55854p0() {
        C8992f c8992fM55879b = C8992f.m55879b();
        sfj0.m185596c("e_report_submit", "p_report_submit_view", sfj0.C20032a.m185615h("receive_report_user_id", c8992fM55879b.m55889k()), sfj0.C20032a.m185615h("report_mark", TextUtils.isEmpty(((C8991e) this.viewModel).m55868m()) ? "0" : "1"), sfj0.C20032a.m185615h("report_match_type", c8992fM55879b.m55887i()), sfj0.C20032a.m185613f("report_picture_number", this.f36393a.size()), sfj0.C20032a.m185615h("report_pre_id", m55856r0()), sfj0.C20032a.m185615h("report_source_new", c8992fM55879b.m55888j()), sfj0.C20032a.m185615h("reporter_user_id", CoreModule.m30929H().userId()), sfj0.C20032a.m185615h("report_submit_view_detail", "back"));
    }

    /* JADX INFO: renamed from: q0 */
    public void m55855q0() {
        this.f36394b.startActivityForResult(MediaPickerAct.m48965d2(act(), 8 - this.f36393a.size(), false, false, false), 0);
    }

    /* JADX INFO: renamed from: r0 */
    public final String m55856r0() {
        int iHashCode = (C8992f.m55879b().m55889k() + CoreModule.m30929H().userId() + pzi0.m174454o()).hashCode();
        return UUID.randomUUID().toString() + "-" + ((iHashCode >> 16) + (iHashCode & p7f.COLOR_SPACE_UNCALIBRATED));
    }

    /* JADX INFO: renamed from: s0 */
    public void m55857s0(String str) {
        act().progress(R$string.f18632L5, true);
        final Report report = new Report();
        report.requestId = m55856r0();
        final String strString = act().string(this.f36396d.resId);
        report.category = Report.CATEGORY_DEFAULT;
        report.value = strString + ":" + str;
        if (NullChecker.m82486a(this.f36398f) && NullChecker.m82486a(this.f36398f.reportFrom) && !TextUtils.isEmpty(this.f36398f.reportTypeId)) {
            report.contentType = this.f36398f.reportFrom.getFrom();
            report.contentId = this.f36398f.reportTypeId;
        }
        if (NullChecker.m82486a(this.f36398f) && TextUtils.equals(ProfileLike.TYPE, this.f36398f.contentType)) {
            report.contentType = this.f36398f.contentType;
            ArrayList arrayList = new ArrayList();
            arrayList.add(this.f36398f.profileCommentText);
            report.chatMessages = arrayList;
        }
        C8992f c8992fM55879b = C8992f.m55879b();
        sfj0.m185596c("e_report_submit", "p_report_submit_view", sfj0.C20032a.m185615h("receive_report_user_id", c8992fM55879b.m55889k()), sfj0.C20032a.m185615h("report_mark", TextUtils.isEmpty(str) ? "0" : "1"), sfj0.C20032a.m185615h("report_match_type", c8992fM55879b.m55887i()), sfj0.C20032a.m185613f("report_picture_number", this.f36393a.size()), sfj0.C20032a.m185615h("report_pre_id", m55856r0()), sfj0.C20032a.m185615h("report_source_new", c8992fM55879b.m55888j()), sfj0.C20032a.m185615h("reporter_user_id", CoreModule.m30929H().userId()), sfj0.C20032a.m185615h("report_submit_view_detail", "submit"), sfj0.C20032a.m185615h("report_other_accounts", "0"), sfj0.C20032a.m185615h("report_chat", "0"));
        duringCreated(this.f36393a.isEmpty() ? CoreModule.f18264c.f20381e0.m116569ha(this.f36397e, report) : new i1y(this.f36393a, false).last().flatMap(new qcj() { // from class: l.v0d0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return yb5.m214982K((List) obj, "report", null, UploadSource.get("report"));
            }
        }).compose(psd0.m173606Q()).flatMap(new qcj() { // from class: l.w0d0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f186558a.m55850l0(report, (List) obj);
            }
        })).subscribe(psd0.m173597H(new y20() { // from class: l.x0d0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f191882a.m55851m0(strString, (uxj0) obj);
            }
        }, new y20() { // from class: l.y0d0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f196959a.m55852n0((Throwable) obj);
            }
        }));
    }
}
