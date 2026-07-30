package com.p046p1.mobile.putong.core.p053ui.campus.detailinfo;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.R$string;
import com.p046p1.mobile.putong.core.data.School;
import com.p046p1.mobile.putong.core.p053ui.campus.StudentInfoAct;
import com.p046p1.mobile.putong.data.Dimension;
import com.p046p1.mobile.putong.data.Media;
import com.p046p1.mobile.putong.data.MediaLocalStatus;
import com.p046p1.mobile.putong.data.Picture;
import com.p046p1.mobile.putong.data.Settings;
import com.p046p1.mobile.putong.data.StudentVerRejectedReason;
import com.p046p1.mobile.putong.data.StudentVerification;
import com.p046p1.mobile.putong.data.StudentVerificationStatus;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.data.Verification;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import p133rx.C22306c;
import p133rx.subjects.C22392a;
import p149l.e30;
import p149l.j760;
import p149l.jq2;
import p149l.lsi0;
import p149l.mkd0;
import p149l.pgm;
import p149l.rhi;
import p149l.roj0;
import p149l.tpd0;
import p149l.v9j;
import p149l.vwb;
import p149l.w9j;
import p149l.x9j;
import p149l.zvf0;

/* JADX INFO: loaded from: classes10.dex */
public class StudentInfoPresenter extends jq2<C8298a> {

    /* JADX INFO: renamed from: g */
    public static final tpd0 f28666g = new tpd0("back_count_from_dia" + CoreModule.m29931H().userId(), 0);

    /* JADX INFO: renamed from: a */
    public String f28667a;

    /* JADX INFO: renamed from: b */
    public PicType f28668b;

    /* JADX INFO: renamed from: c */
    public StudentVerification f28669c;

    /* JADX INFO: renamed from: d */
    public C22392a<StudentVerification> f28670d;

    /* JADX INFO: renamed from: e */
    public boolean f28671e;

    /* JADX INFO: renamed from: f */
    public C8297a f28672f;

    public enum PicType {
        FRONT,
        BACK
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.campus.detailinfo.StudentInfoPresenter$a */
    public class C8297a {

        /* JADX INFO: renamed from: a */
        public boolean f28673a = false;

        /* JADX INFO: renamed from: b */
        public boolean f28674b = false;

        /* JADX INFO: renamed from: c */
        public boolean f28675c = false;

        /* JADX INFO: renamed from: d */
        public boolean f28676d = false;

        public C8297a() {
        }
    }

    public StudentInfoPresenter(StudentInfoAct studentInfoAct) {
        super(studentInfoAct);
        this.f28668b = PicType.FRONT;
        this.f28669c = StudentVerification.new_();
        this.f28670d = C22392a.m221512b();
        this.f28671e = true;
        this.f28672f = new C8297a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: E0 */
    public /* synthetic */ void m44486E0(Bundle bundle) {
        ((C8298a) this.viewModel).m44572r();
    }

    /* JADX INFO: renamed from: A0 */
    public void m44497A0(List<StudentVerRejectedReason> list) {
        this.f28672f.f28673a = list.contains(StudentVerRejectedReason.get("school"));
        this.f28672f.f28674b = list.contains(StudentVerRejectedReason.get(StudentVerRejectedReason.startTime));
        this.f28672f.f28675c = list.contains(StudentVerRejectedReason.get(StudentVerRejectedReason.pictures_1));
        this.f28672f.f28676d = list.contains(StudentVerRejectedReason.get(StudentVerRejectedReason.pictures_2));
    }

    /* JADX INFO: renamed from: C0 */
    public final boolean m44498C0() {
        return !((C8298a) this.viewModel).m44556G() && TEnum.equals(this.f28669c.status, StudentVerificationStatus.preVerified);
    }

    /* JADX INFO: renamed from: D0 */
    public boolean m44499D0() {
        return (TEnum.equals(this.f28669c.status, "rejected") || ((C8298a) this.viewModel).m44556G()) ? false : true;
    }

    /* JADX INFO: renamed from: F0 */
    public final /* synthetic */ void m44500F0(User user) {
        m44507O0(user, this.f28669c);
        this.f28670d.m132487l(this.f28669c);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: G0 */
    public final /* synthetic */ Pair m44501G0(j760 j760Var) {
        F f = j760Var.f116564a;
        return new Pair((StudentVerification) f, m44521x0(((StudentVerification) f).school, (List) j760Var.f116565b));
    }

    /* JADX INFO: renamed from: H0 */
    public final /* synthetic */ C22306c m44502H0(j760 j760Var) {
        return C22306c.just(j760Var).map(new w9j() { // from class: l.k1g0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f120584a.m44501G0((j760) obj);
            }
        }).compose(mkd0.m154951C());
    }

    /* JADX INFO: renamed from: I0 */
    public final /* synthetic */ C22306c m44503I0() {
        return mkd0.m154984r(this.f28670d, CoreModule.f17545c.f19651i0.f19740S.m121230k(), new x9j() { // from class: l.g1g0
            @Override // p149l.x9j
            public final Object call(Object obj, Object obj2) {
                return vwb.m200311Y((StudentVerification) obj, (List) obj2);
            }
        }).switchMap(new w9j() { // from class: l.h1g0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f105429a.m44502H0((j760) obj);
            }
        });
    }

    /* JADX INFO: renamed from: J0 */
    public final /* synthetic */ void m44504J0(Pair pair) {
        if (TEnum.equals(this.f28669c.status, "verified")) {
            return;
        }
        String string = (String) pair.second;
        if (TextUtils.isEmpty(string) && !TextUtils.isEmpty(this.f28669c.school)) {
            string = act().getString(R$string.f18308Yl);
        }
        ((C8298a) this.viewModel).m44551A(string, this.f28669c);
        this.f28671e = false;
    }

    /* JADX INFO: renamed from: L0 */
    public final /* synthetic */ void m44505L0(boolean z, roj0 roj0Var) {
        ((C8298a) this.viewModel).m44571e0(z);
    }

    /* JADX INFO: renamed from: N0 */
    public final /* synthetic */ void m44506N0(Throwable th) {
        act().progressDismiss();
    }

    /* JADX INFO: renamed from: O0 */
    public final void m44507O0(User user, StudentVerification studentVerification) {
        if (studentVerification == null) {
            return;
        }
        StudentVerification studentVerification2 = user.settings.verification.studies;
        if (TEnum.equals(studentVerification2.status, "default")) {
            return;
        }
        if (TextUtils.isEmpty(studentVerification.school)) {
            studentVerification.school = studentVerification2.school;
        }
        if (TextUtils.isEmpty(studentVerification.startTime)) {
            studentVerification.startTime = studentVerification2.startTime;
        }
        if (studentVerification.pictures.size() == 0) {
            studentVerification.pictures.addAll(studentVerification2.pictures);
        }
        studentVerification.status = studentVerification2.status;
        if (studentVerification.rejectionReasons.size() == 0) {
            studentVerification.rejectionReasons = studentVerification2.rejectionReasons;
        }
        studentVerification.endTime = null;
    }

    /* JADX INFO: renamed from: P0 */
    public void m44508P0(List<Media> list) {
        Media media = list.get(0);
        PicType picType = this.f28668b;
        if (picType == PicType.FRONT) {
            if (NullChecker.m81303a(media) && NullChecker.m81303a(this.f28669c.pictures.get(1)) && media.url.equals(this.f28669c.pictures.get(1).url)) {
                lsi0.m151595y(act().getString(R$string.f17867K0));
                return;
            }
            this.f28672f.f28675c = false;
            this.f28669c.pictures.set(0, media);
            ((Picture) media).size = new Dimension(new pgm(rhi.m179382z(media.url)).f148730d);
            this.f28670d.m132487l(this.f28669c);
            return;
        }
        if (picType == PicType.BACK) {
            if (NullChecker.m81303a(media) && NullChecker.m81303a(this.f28669c.pictures.get(0)) && media.url.equals(this.f28669c.pictures.get(0).url)) {
                lsi0.m151595y(act().getString(R$string.f17867K0));
                return;
            }
            this.f28672f.f28676d = false;
            this.f28669c.pictures.set(1, media);
            ((Picture) media).size = new Dimension(new pgm(rhi.m179382z(media.url)).f148730d);
            this.f28670d.m132487l(this.f28669c);
        }
    }

    /* JADX INFO: renamed from: Q0 */
    public void m44509Q0(String str) {
        this.f28667a = str;
    }

    /* JADX INFO: renamed from: R0 */
    public void m44510R0() {
        if (vwb.m200296J(this.f28669c.pictures)) {
            this.f28669c.pictures = new ArrayList();
            this.f28669c.pictures.add(0, null);
            this.f28669c.pictures.add(1, null);
        }
    }

    /* JADX INFO: renamed from: S0 */
    public void m44511S0(String str) {
        Picture picture = new Picture();
        picture.url = rhi.m179355B(str);
        picture.status = MediaLocalStatus.get("raw");
        picture.size = new Dimension(new pgm(rhi.m179382z(picture.url)).f148730d);
        PicType picType = this.f28668b;
        if (picType == PicType.FRONT) {
            this.f28672f.f28675c = false;
            this.f28669c.pictures.set(0, picture);
            this.f28670d.m132487l(this.f28669c);
        } else if (picType == PicType.BACK) {
            this.f28672f.f28676d = false;
            this.f28669c.pictures.set(1, picture);
            this.f28670d.m132487l(this.f28669c);
        }
    }

    /* JADX INFO: renamed from: U0 */
    public void m44512U0(List<Media> list) {
        if (!NullChecker.m81303a(list) || list.size() <= 0) {
            this.f28669c.pictures.clear();
            this.f28669c.pictures.add(0, null);
            this.f28669c.pictures.add(1, null);
        } else {
            ((C8298a) this.viewModel).m44568b0(list.get(0));
            if (list.size() > 1) {
                ((C8298a) this.viewModel).m44567Z(list.get(1));
            }
        }
    }

    /* JADX INFO: renamed from: V0 */
    public void m44513V0() {
        zvf0.m220396r("e_student_verification_done", "p_student_verification_view");
        final boolean zM44498C0 = m44498C0();
        act().progress(R$string.f17842J5, true);
        User user = new User();
        Settings settings = new Settings();
        user.settings = settings;
        settings.verification = new Verification();
        user.settings.verification.studies = this.f28669c;
        CoreModule.f17545c.f19651i0.m31543n3(user).subscribe(mkd0.m154956H(new e30() { // from class: l.i1g0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f110455a.m44505L0(zM44498C0, (roj0) obj);
            }
        }, new e30() { // from class: l.j1g0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f115795a.m44506N0((Throwable) obj);
            }
        }));
    }

    @Override // p149l.jq2
    /* JADX INFO: renamed from: a0 */
    public void mo39470a0() {
        creates(new e30() { // from class: l.b1g0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f72595a.m44486E0((Bundle) obj);
            }
        });
        duringCreated(new v9j() { // from class: l.c1g0
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return CoreModule.f17545c.f19639e0.m169523o9();
            }
        }).subscribe(mkd0.m154955G(new e30() { // from class: l.d1g0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f83263a.m44500F0((User) obj);
            }
        }));
        duringCreated(new v9j() { // from class: l.e1g0
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f88821a.m44503I0();
            }
        }, false).subscribe(mkd0.m154955G(new e30() { // from class: l.f1g0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f94096a.m44504J0((Pair) obj);
            }
        }));
    }

    @Override // p149l.q0m
    public void destroy() {
    }

    /* JADX INFO: renamed from: o0 */
    public void m44514o0() {
        if (PicType.FRONT == this.f28668b) {
            this.f28672f.f28675c = false;
            this.f28669c.pictures.set(0, null);
        }
        if (PicType.BACK == this.f28668b) {
            this.f28672f.f28676d = false;
            this.f28669c.pictures.set(1, null);
        }
        this.f28670d.m132487l(this.f28669c);
    }

    /* JADX INFO: renamed from: p0 */
    public void m44515p0(Intent intent) {
        School school = (School) intent.getSerializableExtra("selected_school");
        if (school.f20498id.equals(this.f28669c.school)) {
            return;
        }
        this.f28672f.f28673a = false;
        this.f28669c.school = school.f20498id;
        if (intent.getBooleanExtra("highConfidenceError", false)) {
            this.f28669c.status = StudentVerificationStatus.get(StudentVerificationStatus.prePending);
        }
        this.f28670d.m132487l(this.f28669c);
    }

    /* JADX INFO: renamed from: q0 */
    public void m44516q0() {
        if ("Chanel1.SchoolIdentifyPage.Shown".equals(this.f28667a)) {
            tpd0 tpd0Var = f28666g;
            tpd0Var.put(Integer.valueOf(tpd0Var.get().intValue() + 1));
        }
    }

    /* JADX INFO: renamed from: r0 */
    public void m44517r0(String str) {
        StudentVerification studentVerification = this.f28669c;
        studentVerification.startTime = str;
        this.f28670d.m132487l(studentVerification);
    }

    /* JADX INFO: renamed from: s0 */
    public Media m44518s0() {
        return this.f28669c.pictures.get(1);
    }

    /* JADX INFO: renamed from: t0 */
    public Media m44519t0() {
        return this.f28669c.pictures.get(0);
    }

    /* JADX INFO: renamed from: u0 */
    public String m44520u0() {
        return this.f28669c.school;
    }

    /* JADX INFO: renamed from: x0 */
    public final String m44521x0(String str, List<School> list) {
        if (TextUtils.isEmpty(str) || !NullChecker.m81303a(list)) {
            return null;
        }
        for (School school : list) {
            if (school.f20498id.equals(str)) {
                return school.name;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: y0 */
    public boolean m44522y0() {
        return (!m44523z0() || this.f28669c.pictures.get(0) == null || this.f28669c.pictures.get(1) == null) ? false : true;
    }

    /* JADX INFO: renamed from: z0 */
    public boolean m44523z0() {
        return (TextUtils.isEmpty(this.f28669c.school) || TextUtils.isEmpty(this.f28669c.startTime)) ? false : true;
    }
}
