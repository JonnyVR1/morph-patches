package com.p051p1.mobile.putong.core.p058ui.campus.detailinfo;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.R$string;
import com.p051p1.mobile.putong.core.data.School;
import com.p051p1.mobile.putong.core.p058ui.campus.StudentInfoAct;
import com.p051p1.mobile.putong.data.Dimension;
import com.p051p1.mobile.putong.data.Media;
import com.p051p1.mobile.putong.data.MediaLocalStatus;
import com.p051p1.mobile.putong.data.Picture;
import com.p051p1.mobile.putong.data.Settings;
import com.p051p1.mobile.putong.data.StudentVerRejectedReason;
import com.p051p1.mobile.putong.data.StudentVerification;
import com.p051p1.mobile.putong.data.StudentVerificationStatus;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.data.Verification;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import p137rx.C22421c;
import p137rx.subjects.C22507a;
import p153l.ar2;
import p153l.i4g0;
import p153l.jyb;
import p153l.o1j0;
import p153l.oki;
import p153l.pcj;
import p153l.pf60;
import p153l.psd0;
import p153l.qcj;
import p153l.rcj;
import p153l.sim;
import p153l.uxj0;
import p153l.vxd0;
import p153l.y20;

/* JADX INFO: loaded from: classes9.dex */
public class StudentInfoPresenter extends ar2<C8461a> {

    /* JADX INFO: renamed from: g */
    public static final vxd0 f29514g = new vxd0("back_count_from_dia" + CoreModule.m30929H().userId(), 0);

    /* JADX INFO: renamed from: a */
    public String f29515a;

    /* JADX INFO: renamed from: b */
    public PicType f29516b;

    /* JADX INFO: renamed from: c */
    public StudentVerification f29517c;

    /* JADX INFO: renamed from: d */
    public C22507a<StudentVerification> f29518d;

    /* JADX INFO: renamed from: e */
    public boolean f29519e;

    /* JADX INFO: renamed from: f */
    public C8460a f29520f;

    public enum PicType {
        FRONT,
        BACK
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.campus.detailinfo.StudentInfoPresenter$a */
    public class C8460a {

        /* JADX INFO: renamed from: a */
        public boolean f29521a = false;

        /* JADX INFO: renamed from: b */
        public boolean f29522b = false;

        /* JADX INFO: renamed from: c */
        public boolean f29523c = false;

        /* JADX INFO: renamed from: d */
        public boolean f29524d = false;

        public C8460a() {
        }
    }

    public StudentInfoPresenter(StudentInfoAct studentInfoAct) {
        super(studentInfoAct);
        this.f29516b = PicType.FRONT;
        this.f29517c = StudentVerification.new_();
        this.f29518d = C22507a.m222758b();
        this.f29519e = true;
        this.f29520f = new C8460a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: E0 */
    public /* synthetic */ void m45669E0(Bundle bundle) {
        ((C8461a) this.viewModel).m45755r();
    }

    /* JADX INFO: renamed from: A0 */
    public void m45680A0(List<StudentVerRejectedReason> list) {
        this.f29520f.f29521a = list.contains(StudentVerRejectedReason.get("school"));
        this.f29520f.f29522b = list.contains(StudentVerRejectedReason.get(StudentVerRejectedReason.startTime));
        this.f29520f.f29523c = list.contains(StudentVerRejectedReason.get(StudentVerRejectedReason.pictures_1));
        this.f29520f.f29524d = list.contains(StudentVerRejectedReason.get(StudentVerRejectedReason.pictures_2));
    }

    /* JADX INFO: renamed from: C0 */
    public final boolean m45681C0() {
        return !((C8461a) this.viewModel).m45739G() && TEnum.equals(this.f29517c.status, StudentVerificationStatus.preVerified);
    }

    /* JADX INFO: renamed from: D0 */
    public boolean m45682D0() {
        return (TEnum.equals(this.f29517c.status, "rejected") || ((C8461a) this.viewModel).m45739G()) ? false : true;
    }

    /* JADX INFO: renamed from: F0 */
    public final /* synthetic */ void m45683F0(User user) {
        m45690O0(user, this.f29517c);
        this.f29518d.m137019l(this.f29517c);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: G0 */
    public final /* synthetic */ Pair m45684G0(pf60 pf60Var) {
        F f = pf60Var.f152156a;
        return new Pair((StudentVerification) f, m45704x0(((StudentVerification) f).school, (List) pf60Var.f152157b));
    }

    /* JADX INFO: renamed from: H0 */
    public final /* synthetic */ C22421c m45685H0(pf60 pf60Var) {
        return C22421c.just(pf60Var).map(new qcj() { // from class: l.r9g0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f161812a.m45684G0((pf60) obj);
            }
        }).compose(psd0.m173592C());
    }

    /* JADX INFO: renamed from: I0 */
    public final /* synthetic */ C22421c m45686I0() {
        return psd0.m173625r(this.f29518d, CoreModule.f18264c.f20393i0.f20482S.m159274k(), new rcj() { // from class: l.n9g0
            @Override // p153l.rcj
            public final Object call(Object obj, Object obj2) {
                return jyb.m147494Y((StudentVerification) obj, (List) obj2);
            }
        }).switchMap(new qcj() { // from class: l.o9g0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f145568a.m45685H0((pf60) obj);
            }
        });
    }

    /* JADX INFO: renamed from: J0 */
    public final /* synthetic */ void m45687J0(Pair pair) {
        if (TEnum.equals(this.f29517c.status, "verified")) {
            return;
        }
        String string = (String) pair.second;
        if (TextUtils.isEmpty(string) && !TextUtils.isEmpty(this.f29517c.school)) {
            string = act().getString(R$string.f19716um);
        }
        ((C8461a) this.viewModel).m45734A(string, this.f29517c);
        this.f29519e = false;
    }

    /* JADX INFO: renamed from: L0 */
    public final /* synthetic */ void m45688L0(boolean z, uxj0 uxj0Var) {
        ((C8461a) this.viewModel).m45754e0(z);
    }

    /* JADX INFO: renamed from: N0 */
    public final /* synthetic */ void m45689N0(Throwable th) {
        act().progressDismiss();
    }

    /* JADX INFO: renamed from: O0 */
    public final void m45690O0(User user, StudentVerification studentVerification) {
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
    public void m45691P0(List<Media> list) {
        Media media = list.get(0);
        PicType picType = this.f29516b;
        if (picType == PicType.FRONT) {
            if (NullChecker.m82486a(media) && NullChecker.m82486a(this.f29517c.pictures.get(1)) && media.url.equals(this.f29517c.pictures.get(1).url)) {
                o1j0.m165651y(act().getString(R$string.f18596K0));
                return;
            }
            this.f29520f.f29523c = false;
            this.f29517c.pictures.set(0, media);
            ((Picture) media).size = new Dimension(new sim(oki.m168038z(media.url)).f168843d);
            this.f29518d.m137019l(this.f29517c);
            return;
        }
        if (picType == PicType.BACK) {
            if (NullChecker.m82486a(media) && NullChecker.m82486a(this.f29517c.pictures.get(0)) && media.url.equals(this.f29517c.pictures.get(0).url)) {
                o1j0.m165651y(act().getString(R$string.f18596K0));
                return;
            }
            this.f29520f.f29524d = false;
            this.f29517c.pictures.set(1, media);
            ((Picture) media).size = new Dimension(new sim(oki.m168038z(media.url)).f168843d);
            this.f29518d.m137019l(this.f29517c);
        }
    }

    /* JADX INFO: renamed from: Q0 */
    public void m45692Q0(String str) {
        this.f29515a = str;
    }

    /* JADX INFO: renamed from: R0 */
    public void m45693R0() {
        if (jyb.m147479J(this.f29517c.pictures)) {
            this.f29517c.pictures = new ArrayList();
            this.f29517c.pictures.add(0, null);
            this.f29517c.pictures.add(1, null);
        }
    }

    /* JADX INFO: renamed from: S0 */
    public void m45694S0(String str) {
        Picture picture = new Picture();
        picture.url = oki.m168011B(str);
        picture.status = MediaLocalStatus.get("raw");
        picture.size = new Dimension(new sim(oki.m168038z(picture.url)).f168843d);
        PicType picType = this.f29516b;
        if (picType == PicType.FRONT) {
            this.f29520f.f29523c = false;
            this.f29517c.pictures.set(0, picture);
            this.f29518d.m137019l(this.f29517c);
        } else if (picType == PicType.BACK) {
            this.f29520f.f29524d = false;
            this.f29517c.pictures.set(1, picture);
            this.f29518d.m137019l(this.f29517c);
        }
    }

    /* JADX INFO: renamed from: U0 */
    public void m45695U0(List<Media> list) {
        if (!NullChecker.m82486a(list) || list.size() <= 0) {
            this.f29517c.pictures.clear();
            this.f29517c.pictures.add(0, null);
            this.f29517c.pictures.add(1, null);
        } else {
            ((C8461a) this.viewModel).m45751b0(list.get(0));
            if (list.size() > 1) {
                ((C8461a) this.viewModel).m45750Z(list.get(1));
            }
        }
    }

    /* JADX INFO: renamed from: V0 */
    public void m45696V0() {
        i4g0.m138520r("e_student_verification_done", "p_student_verification_view");
        final boolean zM45681C0 = m45681C0();
        act().progress(R$string.f18632L5, true);
        User user = new User();
        Settings settings = new Settings();
        user.settings = settings;
        settings.verification = new Verification();
        user.settings.verification.studies = this.f29517c;
        CoreModule.f18264c.f20393i0.m32546n3(user).subscribe(psd0.m173597H(new y20() { // from class: l.p9g0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f151153a.m45688L0(zM45681C0, (uxj0) obj);
            }
        }, new y20() { // from class: l.q9g0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f156241a.m45689N0((Throwable) obj);
            }
        }));
    }

    @Override // p153l.ar2
    /* JADX INFO: renamed from: a0 */
    public void mo40473a0() {
        creates(new y20() { // from class: l.i9g0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f113467a.m45669E0((Bundle) obj);
            }
        });
        duringCreated(new pcj() { // from class: l.j9g0
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return CoreModule.f18264c.f20381e0.m116596o9();
            }
        }).subscribe(psd0.m173596G(new y20() { // from class: l.k9g0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f124544a.m45683F0((User) obj);
            }
        }));
        duringCreated(new pcj() { // from class: l.l9g0
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f130608a.m45686I0();
            }
        }, false).subscribe(psd0.m173596G(new y20() { // from class: l.m9g0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f135407a.m45687J0((Pair) obj);
            }
        }));
    }

    @Override // p153l.k3m
    public void destroy() {
    }

    /* JADX INFO: renamed from: o0 */
    public void m45697o0() {
        if (PicType.FRONT == this.f29516b) {
            this.f29520f.f29523c = false;
            this.f29517c.pictures.set(0, null);
        }
        if (PicType.BACK == this.f29516b) {
            this.f29520f.f29524d = false;
            this.f29517c.pictures.set(1, null);
        }
        this.f29518d.m137019l(this.f29517c);
    }

    /* JADX INFO: renamed from: p0 */
    public void m45698p0(Intent intent) {
        School school = (School) intent.getSerializableExtra("selected_school");
        if (school.f21240id.equals(this.f29517c.school)) {
            return;
        }
        this.f29520f.f29521a = false;
        this.f29517c.school = school.f21240id;
        if (intent.getBooleanExtra("highConfidenceError", false)) {
            this.f29517c.status = StudentVerificationStatus.get(StudentVerificationStatus.prePending);
        }
        this.f29518d.m137019l(this.f29517c);
    }

    /* JADX INFO: renamed from: q0 */
    public void m45699q0() {
        if ("Chanel1.SchoolIdentifyPage.Shown".equals(this.f29515a)) {
            vxd0 vxd0Var = f29514g;
            vxd0Var.put(Integer.valueOf(vxd0Var.get().intValue() + 1));
        }
    }

    /* JADX INFO: renamed from: r0 */
    public void m45700r0(String str) {
        StudentVerification studentVerification = this.f29517c;
        studentVerification.startTime = str;
        this.f29518d.m137019l(studentVerification);
    }

    /* JADX INFO: renamed from: s0 */
    public Media m45701s0() {
        return this.f29517c.pictures.get(1);
    }

    /* JADX INFO: renamed from: t0 */
    public Media m45702t0() {
        return this.f29517c.pictures.get(0);
    }

    /* JADX INFO: renamed from: u0 */
    public String m45703u0() {
        return this.f29517c.school;
    }

    /* JADX INFO: renamed from: x0 */
    public final String m45704x0(String str, List<School> list) {
        if (TextUtils.isEmpty(str) || !NullChecker.m82486a(list)) {
            return null;
        }
        for (School school : list) {
            if (school.f21240id.equals(str)) {
                return school.name;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: y0 */
    public boolean m45705y0() {
        return (!m45706z0() || this.f29517c.pictures.get(0) == null || this.f29517c.pictures.get(1) == null) ? false : true;
    }

    /* JADX INFO: renamed from: z0 */
    public boolean m45706z0() {
        return (TextUtils.isEmpty(this.f29517c.school) || TextUtils.isEmpty(this.f29517c.startTime)) ? false : true;
    }
}
