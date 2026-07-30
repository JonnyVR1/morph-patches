package com.p000p1.mobile.putong.core.p004ui.report;

import android.content.Intent;
import android.text.TextUtils;
import com.p000p1.mobile.putong.account.p002ui.camera.adapter.AccountMakeupPageAdapter;
import com.p000p1.mobile.putong.core.CoreModule;
import com.p000p1.mobile.putong.core.R$string;
import com.p000p1.mobile.putong.core.p004ui.report.C0263d;
import com.p1.mobile.android.app.Frag;
import com.p1.mobile.putong.core.ui.dlg.CoreDlg;
import com.p1.mobile.putong.core.ui.mediapicker.MediaPickerAct;
import com.p1.mobile.putong.data.Media;
import com.p1.mobile.putong.data.Picture;
import com.p1.mobile.putong.data.Report;
import com.p1.mobile.putong.data.UploadSource;
import com.p1.mobile.putong.ui.mediapicker.MediaPickerBaseAct;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.UUID;
import l.e30;
import l.it6;
import l.jq2;
import l.lsi0;
import l.mkd0;
import l.mqi0;
import l.o6j0;
import l.roj0;
import l.vwb;
import l.w85;
import l.w9j;
import l.yij0;
import p006l.lsx;
import p006l.upa;
import rx.c;

/* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.report.d */
/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class C0263d extends jq2<C0264e> {

    /* JADX INFO: renamed from: a */
    public final List<Media> f5326a;

    /* JADX INFO: renamed from: b */
    public final Frag f5327b;

    /* JADX INFO: renamed from: c */
    public ReportDescriptionFrag.InterfaceC0259a f5328c;

    /* JADX INFO: renamed from: d */
    public ReportCategory f5329d;

    /* JADX INFO: renamed from: e */
    public String f5330e;

    /* JADX INFO: renamed from: f */
    public CoreDlg.ProfileMenuBuildParam f5331f;

    public C0263d(ReportDescriptionFrag reportDescriptionFrag) {
        super(reportDescriptionFrag);
        this.f5326a = new ArrayList();
        this.f5327b = reportDescriptionFrag;
    }

    /* JADX INFO: renamed from: e0 */
    public static /* synthetic */ Picture m8012e0(Media media) {
        return (Picture) media;
    }

    public void destroy() {
        this.f5328c = null;
    }

    /* JADX INFO: renamed from: j0 */
    public void m8017j0(int i) {
        if (i < this.f5326a.size()) {
            this.f5326a.remove(i);
        }
    }

    /* JADX INFO: renamed from: k0 */
    public void m8018k0(String str, ReportCategory reportCategory, boolean z, ReportDescriptionFrag.InterfaceC0259a interfaceC0259a, CoreDlg.ProfileMenuBuildParam profileMenuBuildParam) {
        this.f5330e = str;
        this.f5329d = reportCategory;
        this.f5328c = interfaceC0259a;
        this.f5331f = profileMenuBuildParam;
        ((C0264e) ((jq2) this).viewModel).m8038l(reportCategory, reportCategory.isCategorised() && (!reportCategory.isGP() || z));
    }

    /* JADX INFO: renamed from: l0 */
    public final /* synthetic */ c m8019l0(Report report, List list) {
        report.pictures = vwb.Q(list, new w9j() { // from class: l.usc0
            public final Object call(Object obj) {
                return C0263d.m8012e0((Media) obj);
            }
        });
        return CoreModule.f1534c.f3628e0.m21459ha(this.f5330e, report);
    }

    /* JADX INFO: renamed from: m0 */
    public final /* synthetic */ void m8020m0(String str, roj0 roj0Var) {
        HashMap map = new HashMap();
        map.put("User reported {UID}", this.f5330e);
        ReportCategory reportCategory = this.f5329d;
        if (reportCategory != null) {
            map.put("Reason", reportCategory.toString());
        }
        w85.INSTANCE.m("Report User", map);
        act().progressDismiss();
        if (NullChecker.b(this.f5328c)) {
            this.f5328c.mo7986Y(str);
        }
        if (upa.m25517t1()) {
            return;
        }
        lsi0.y(it6.b(R$string.f2451dm, R$string.f2117Sl));
    }

    /* JADX INFO: renamed from: n0 */
    public final /* synthetic */ void m8021n0(Throwable th) {
        act().progressDismiss();
        yij0.D(th);
    }

    /* JADX INFO: renamed from: o0 */
    public void m8022o0(int i, int i2, Intent intent) {
        if (i2 == -1) {
            List<Media> list = (List) intent.getSerializableExtra(MediaPickerBaseAct.h);
            this.f5326a.addAll(list);
            ((C0264e) ((jq2) this).viewModel).m8032e(list);
        }
    }

    /* JADX INFO: renamed from: p0 */
    public void m8023p0() {
        C0265f c0265fM8053b = C0265f.m8053b();
        o6j0.c("e_report_submit", "p_report_submit_view", new o6j0.a[]{o6j0.a.h("receive_report_user_id", c0265fM8053b.m8063k()), o6j0.a.h("report_mark", TextUtils.isEmpty(((C0264e) ((jq2) this).viewModel).m8039m()) ? "0" : "1"), o6j0.a.h("report_match_type", c0265fM8053b.m8061i()), o6j0.a.f("report_picture_number", this.f5326a.size()), o6j0.a.h("report_pre_id", m8025r0()), o6j0.a.h("report_source_new", c0265fM8053b.m8062j()), o6j0.a.h("reporter_user_id", CoreModule.m1850H().userId()), o6j0.a.h("report_submit_view_detail", AccountMakeupPageAdapter.MakeupItem.BACK)});
    }

    /* JADX INFO: renamed from: q0 */
    public void m8024q0() {
        this.f5327b.startActivityForResult(MediaPickerAct.c2(act(), 8 - this.f5326a.size(), false, false, false), 0);
    }

    /* JADX INFO: renamed from: r0 */
    public final String m8025r0() {
        int iHashCode = (C0265f.m8053b().m8063k() + CoreModule.m1850H().userId() + mqi0.o()).hashCode();
        return UUID.randomUUID().toString() + "-" + ((iHashCode >> 16) + (iHashCode & 65535));
    }

    /* JADX INFO: renamed from: s0 */
    public void m8026s0(String str) {
        act().progress(R$string.f1831J5, true);
        final Report report = new Report();
        report.requestId = m8025r0();
        final String strString = act().string(this.f5329d.resId);
        report.category = Report.CATEGORY_DEFAULT;
        report.value = strString + ":" + str;
        if (NullChecker.a(this.f5331f) && NullChecker.a(this.f5331f.reportFrom) && !TextUtils.isEmpty(this.f5331f.reportTypeId)) {
            report.contentType = this.f5331f.reportFrom.getFrom();
            report.contentId = this.f5331f.reportTypeId;
        }
        if (NullChecker.a(this.f5331f) && TextUtils.equals("profilelike", this.f5331f.contentType)) {
            report.contentType = this.f5331f.contentType;
            ArrayList arrayList = new ArrayList();
            arrayList.add(this.f5331f.profileCommentText);
            report.chatMessages = arrayList;
        }
        C0265f c0265fM8053b = C0265f.m8053b();
        o6j0.c("e_report_submit", "p_report_submit_view", new o6j0.a[]{o6j0.a.h("receive_report_user_id", c0265fM8053b.m8063k()), o6j0.a.h("report_mark", TextUtils.isEmpty(str) ? "0" : "1"), o6j0.a.h("report_match_type", c0265fM8053b.m8061i()), o6j0.a.f("report_picture_number", this.f5326a.size()), o6j0.a.h("report_pre_id", m8025r0()), o6j0.a.h("report_source_new", c0265fM8053b.m8062j()), o6j0.a.h("reporter_user_id", CoreModule.m1850H().userId()), o6j0.a.h("report_submit_view_detail", "submit"), o6j0.a.h("report_other_accounts", "0"), o6j0.a.h("report_chat", "0")});
        duringCreated(this.f5326a.isEmpty() ? CoreModule.f1534c.f3628e0.m21459ha(this.f5330e, report) : new lsx(this.f5326a, false).last().flatMap(new w9j() { // from class: l.qsc0
            public final Object call(Object obj) {
                return ya5.m28129K((List) obj, "report", null, UploadSource.get("report"));
            }
        }).compose(mkd0.Q()).flatMap(new w9j() { // from class: l.rsc0
            public final Object call(Object obj) {
                return this.f20707a.m8019l0(report, (List) obj);
            }
        })).subscribe(mkd0.H(new e30() { // from class: l.ssc0
            public final void call(Object obj) {
                this.f21637a.m8020m0(strString, (roj0) obj);
            }
        }, new e30() { // from class: l.tsc0
            public final void call(Object obj) {
                this.f22265a.m8021n0((Throwable) obj);
            }
        }));
    }
}
