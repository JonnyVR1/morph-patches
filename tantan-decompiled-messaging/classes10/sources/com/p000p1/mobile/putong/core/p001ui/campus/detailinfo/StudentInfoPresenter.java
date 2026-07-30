package com.p000p1.mobile.putong.core.p001ui.campus.detailinfo;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import com.p000p1.mobile.putong.core.data.School;
import com.p000p1.mobile.putong.core.p001ui.campus.StudentInfoAct;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.R;
import com.p1.mobile.putong.data.Dimension;
import com.p1.mobile.putong.data.Media;
import com.p1.mobile.putong.data.MediaLocalStatus;
import com.p1.mobile.putong.data.Picture;
import com.p1.mobile.putong.data.Settings;
import com.p1.mobile.putong.data.StudentVerRejectedReason;
import com.p1.mobile.putong.data.StudentVerification;
import com.p1.mobile.putong.data.StudentVerificationStatus;
import com.p1.mobile.putong.data.User;
import com.p1.mobile.putong.data.Verification;
import com.p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import l.e30;
import l.j760;
import l.jq2;
import l.lsi0;
import l.mkd0;
import l.pgm;
import l.rhi;
import l.roj0;
import l.tpd0;
import l.v9j;
import l.vwb;
import l.w9j;
import l.x9j;
import l.zvf0;
import rx.c;
import rx.subjects.a;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class StudentInfoPresenter extends jq2<C3073a> {

    /* JADX INFO: renamed from: g */
    public static final tpd0 f1060g = new tpd0("back_count_from_dia" + CoreModule.H().userId(), 0);

    /* JADX INFO: renamed from: a */
    public String f1061a;

    /* JADX INFO: renamed from: b */
    public PicType f1062b;

    /* JADX INFO: renamed from: c */
    public StudentVerification f1063c;

    /* JADX INFO: renamed from: d */
    public a<StudentVerification> f1064d;

    /* JADX INFO: renamed from: e */
    public boolean f1065e;

    /* JADX INFO: renamed from: f */
    public C3072a f1066f;

    public enum PicType {
        FRONT,
        BACK
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.campus.detailinfo.StudentInfoPresenter$a */
    public class C3072a {

        /* JADX INFO: renamed from: a */
        public boolean f1067a = false;

        /* JADX INFO: renamed from: b */
        public boolean f1068b = false;

        /* JADX INFO: renamed from: c */
        public boolean f1069c = false;

        /* JADX INFO: renamed from: d */
        public boolean f1070d = false;

        public C3072a() {
        }
    }

    public StudentInfoPresenter(StudentInfoAct studentInfoAct) {
        super(studentInfoAct);
        this.f1062b = PicType.FRONT;
        this.f1063c = StudentVerification.new_();
        this.f1064d = a.b();
        this.f1065e = true;
        this.f1066f = new C3072a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: E0 */
    public /* synthetic */ void m1785E0(Bundle bundle) {
        ((C3073a) ((jq2) this).viewModel).m1874r();
    }

    /* JADX INFO: renamed from: A0 */
    public void m1796A0(List<StudentVerRejectedReason> list) {
        this.f1066f.f1067a = list.contains(StudentVerRejectedReason.get("school"));
        this.f1066f.f1068b = list.contains(StudentVerRejectedReason.get("startTime"));
        this.f1066f.f1069c = list.contains(StudentVerRejectedReason.get("pictures.1"));
        this.f1066f.f1070d = list.contains(StudentVerRejectedReason.get("pictures.2"));
    }

    /* JADX INFO: renamed from: C0 */
    public final boolean m1797C0() {
        return !((C3073a) ((jq2) this).viewModel).m1857G() && TEnum.equals(this.f1063c.status, "preVerified");
    }

    /* JADX INFO: renamed from: D0 */
    public boolean m1798D0() {
        return (TEnum.equals(this.f1063c.status, "rejected") || ((C3073a) ((jq2) this).viewModel).m1857G()) ? false : true;
    }

    /* JADX INFO: renamed from: F0 */
    public final /* synthetic */ void m1799F0(User user) {
        m1806O0(user, this.f1063c);
        this.f1064d.onNext(this.f1063c);
    }

    /* JADX INFO: renamed from: G0 */
    public final /* synthetic */ Pair m1800G0(j760 j760Var) {
        Object obj = j760Var.a;
        return new Pair((StudentVerification) obj, m1821x0(((StudentVerification) obj).school, (List) j760Var.b));
    }

    /* JADX INFO: renamed from: H0 */
    public final /* synthetic */ c m1801H0(j760 j760Var) {
        return c.just(j760Var).map(new w9j() { // from class: l.k1g0
            public final Object call(Object obj) {
                return this.f5413a.m1800G0((j760) obj);
            }
        }).compose(mkd0.C());
    }

    /* JADX INFO: renamed from: I0 */
    public final /* synthetic */ c m1802I0() {
        return mkd0.r(this.f1064d, CoreModule.c.i0.S.k(), new x9j() { // from class: l.g1g0
            public final Object call(Object obj, Object obj2) {
                return vwb.Y((StudentVerification) obj, (List) obj2);
            }
        }).switchMap(new w9j() { // from class: l.h1g0
            public final Object call(Object obj) {
                return this.f4783a.m1801H0((j760) obj);
            }
        });
    }

    /* JADX INFO: renamed from: J0 */
    public final /* synthetic */ void m1803J0(Pair pair) {
        if (TEnum.equals(this.f1063c.status, "verified")) {
            return;
        }
        String string = (String) pair.second;
        if (TextUtils.isEmpty(string) && !TextUtils.isEmpty(this.f1063c.school)) {
            string = act().getString(R.string.Yl);
        }
        ((C3073a) ((jq2) this).viewModel).m1851A(string, this.f1063c);
        this.f1065e = false;
    }

    /* JADX INFO: renamed from: L0 */
    public final /* synthetic */ void m1804L0(boolean z, roj0 roj0Var) {
        ((C3073a) ((jq2) this).viewModel).m1872e0(z);
    }

    /* JADX INFO: renamed from: N0 */
    public final /* synthetic */ void m1805N0(Throwable th) {
        act().progressDismiss();
    }

    /* JADX INFO: renamed from: O0 */
    public final void m1806O0(User user, StudentVerification studentVerification) {
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
    public void m1807P0(List<Media> list) {
        Picture picture = (Media) list.get(0);
        PicType picType = this.f1062b;
        if (picType == PicType.FRONT) {
            if (NullChecker.a(picture) && NullChecker.a(this.f1063c.pictures.get(1)) && ((Media) picture).url.equals(((Media) this.f1063c.pictures.get(1)).url)) {
                lsi0.y(act().getString(R.string.K0));
                return;
            }
            this.f1066f.f1069c = false;
            this.f1063c.pictures.set(0, picture);
            picture.size = new Dimension(new pgm(rhi.z(((Media) picture).url)).d);
            this.f1064d.onNext(this.f1063c);
            return;
        }
        if (picType == PicType.BACK) {
            if (NullChecker.a(picture) && NullChecker.a(this.f1063c.pictures.get(0)) && ((Media) picture).url.equals(((Media) this.f1063c.pictures.get(0)).url)) {
                lsi0.y(act().getString(R.string.K0));
                return;
            }
            this.f1066f.f1070d = false;
            this.f1063c.pictures.set(1, picture);
            picture.size = new Dimension(new pgm(rhi.z(((Media) picture).url)).d);
            this.f1064d.onNext(this.f1063c);
        }
    }

    /* JADX INFO: renamed from: Q0 */
    public void m1808Q0(String str) {
        this.f1061a = str;
    }

    /* JADX INFO: renamed from: R0 */
    public void m1809R0() {
        if (vwb.J(this.f1063c.pictures)) {
            this.f1063c.pictures = new ArrayList();
            this.f1063c.pictures.add(0, null);
            this.f1063c.pictures.add(1, null);
        }
    }

    /* JADX INFO: renamed from: S0 */
    public void m1810S0(String str) {
        Picture picture = new Picture();
        ((Media) picture).url = rhi.B(str);
        ((Media) picture).status = MediaLocalStatus.get("raw");
        picture.size = new Dimension(new pgm(rhi.z(((Media) picture).url)).d);
        PicType picType = this.f1062b;
        if (picType == PicType.FRONT) {
            this.f1066f.f1069c = false;
            this.f1063c.pictures.set(0, picture);
            this.f1064d.onNext(this.f1063c);
        } else if (picType == PicType.BACK) {
            this.f1066f.f1070d = false;
            this.f1063c.pictures.set(1, picture);
            this.f1064d.onNext(this.f1063c);
        }
    }

    /* JADX INFO: renamed from: U0 */
    public void m1811U0(List<Media> list) {
        if (!NullChecker.a(list) || list.size() <= 0) {
            this.f1063c.pictures.clear();
            this.f1063c.pictures.add(0, null);
            this.f1063c.pictures.add(1, null);
        } else {
            ((C3073a) ((jq2) this).viewModel).m1869b0(list.get(0));
            if (list.size() > 1) {
                ((C3073a) ((jq2) this).viewModel).m1868Z(list.get(1));
            }
        }
    }

    /* JADX INFO: renamed from: V0 */
    public void m1812V0() {
        zvf0.r("e_student_verification_done", "p_student_verification_view");
        final boolean zM1797C0 = m1797C0();
        act().progress(R.string.J5, true);
        User user = new User();
        Settings settings = new Settings();
        user.settings = settings;
        settings.verification = new Verification();
        user.settings.verification.studies = this.f1063c;
        CoreModule.c.i0.n3(user).subscribe(mkd0.H(new e30() { // from class: l.i1g0
            public final void call(Object obj) {
                this.f4982a.m1804L0(zM1797C0, (roj0) obj);
            }
        }, new e30() { // from class: l.j1g0
            public final void call(Object obj) {
                this.f5236a.m1805N0((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: a0 */
    public void m1813a0() {
        creates(new e30() { // from class: l.b1g0
            public final void call(Object obj) {
                this.f2918a.m1785E0((Bundle) obj);
            }
        });
        duringCreated(new v9j() { // from class: l.c1g0
            public final Object call() {
                return CoreModule.c.e0.o9();
            }
        }).subscribe(mkd0.G(new e30() { // from class: l.d1g0
            public final void call(Object obj) {
                this.f4100a.m1799F0((User) obj);
            }
        }));
        duringCreated(new v9j() { // from class: l.e1g0
            public final Object call() {
                return this.f4245a.m1802I0();
            }
        }, false).subscribe(mkd0.G(new e30() { // from class: l.f1g0
            public final void call(Object obj) {
                this.f4377a.m1803J0((Pair) obj);
            }
        }));
    }

    public void destroy() {
    }

    /* JADX INFO: renamed from: o0 */
    public void m1814o0() {
        if (PicType.FRONT == this.f1062b) {
            this.f1066f.f1069c = false;
            this.f1063c.pictures.set(0, null);
        }
        if (PicType.BACK == this.f1062b) {
            this.f1066f.f1070d = false;
            this.f1063c.pictures.set(1, null);
        }
        this.f1064d.onNext(this.f1063c);
    }

    /* JADX INFO: renamed from: p0 */
    public void m1815p0(Intent intent) {
        School school = (School) intent.getSerializableExtra("selected_school");
        if (school.f160id.equals(this.f1063c.school)) {
            return;
        }
        this.f1066f.f1067a = false;
        this.f1063c.school = school.f160id;
        if (intent.getBooleanExtra("highConfidenceError", false)) {
            this.f1063c.status = StudentVerificationStatus.get("prePending");
        }
        this.f1064d.onNext(this.f1063c);
    }

    /* JADX INFO: renamed from: q0 */
    public void m1816q0() {
        if ("Chanel1.SchoolIdentifyPage.Shown".equals(this.f1061a)) {
            tpd0 tpd0Var = f1060g;
            tpd0Var.put(Integer.valueOf(((Integer) tpd0Var.get()).intValue() + 1));
        }
    }

    /* JADX INFO: renamed from: r0 */
    public void m1817r0(String str) {
        StudentVerification studentVerification = this.f1063c;
        studentVerification.startTime = str;
        this.f1064d.onNext(studentVerification);
    }

    /* JADX INFO: renamed from: s0 */
    public Media m1818s0() {
        return (Media) this.f1063c.pictures.get(1);
    }

    /* JADX INFO: renamed from: t0 */
    public Media m1819t0() {
        return (Media) this.f1063c.pictures.get(0);
    }

    /* JADX INFO: renamed from: u0 */
    public String m1820u0() {
        return this.f1063c.school;
    }

    /* JADX INFO: renamed from: x0 */
    public final String m1821x0(String str, List<School> list) {
        if (TextUtils.isEmpty(str) || !NullChecker.a(list)) {
            return null;
        }
        for (School school : list) {
            if (school.f160id.equals(str)) {
                return school.name;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: y0 */
    public boolean m1822y0() {
        return (!m1823z0() || this.f1063c.pictures.get(0) == null || this.f1063c.pictures.get(1) == null) ? false : true;
    }

    /* JADX INFO: renamed from: z0 */
    public boolean m1823z0() {
        return (TextUtils.isEmpty(this.f1063c.school) || TextUtils.isEmpty(this.f1063c.startTime)) ? false : true;
    }
}
