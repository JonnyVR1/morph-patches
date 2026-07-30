package p153l;

import android.text.TextUtils;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.PicVerificationInfo;
import com.p051p1.mobile.putong.core.data.VerificationCenter;
import com.p051p1.mobile.putong.core.p058ui.campus.StudentInfoAct;
import com.p051p1.mobile.putong.data.Dimension;
import com.p051p1.mobile.putong.data.MediaLocalStatus;
import com.p051p1.mobile.putong.data.Picture;
import com.p051p1.mobile.putong.data.StudentVerificationStatus;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.NullChecker;
import com.tencent.youtu.sdkkitframework.common.StateEvent;

/* JADX INFO: loaded from: classes12.dex */
public class cr4 extends ar2<hr4> {

    /* JADX INFO: renamed from: a */
    public VerificationCenter f83290a;

    /* JADX INFO: renamed from: b */
    public StudentVerificationStatus f83291b;

    /* JADX INFO: renamed from: c */
    public StudentVerificationStatus f83292c;

    /* JADX INFO: renamed from: d */
    public StudentVerificationStatus f83293d;

    /* JADX INFO: renamed from: e */
    public StudentVerificationStatus f83294e;

    /* JADX INFO: renamed from: f */
    public boolean f83295f;

    public cr4(ner nerVar) {
        super(nerVar);
    }

    /* JADX INFO: renamed from: f0 */
    public static /* synthetic */ void m112029f0(Throwable th) {
    }

    /* JADX INFO: renamed from: h0 */
    public static /* synthetic */ void m112031h0(uxj0 uxj0Var) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: m0 */
    public /* synthetic */ void m112032m0(pf60 pf60Var) {
        S s = pf60Var.f152157b;
        this.f83290a = (VerificationCenter) s;
        if (NullChecker.m82486a(s)) {
            if (NullChecker.m82486a(((VerificationCenter) pf60Var.f152157b).picVerificationInfo)) {
                this.f83291b = ((VerificationCenter) pf60Var.f152157b).picVerificationInfo.status;
            }
            if (NullChecker.m82486a(((VerificationCenter) pf60Var.f152157b).idCard)) {
                this.f83292c = ((VerificationCenter) pf60Var.f152157b).idCard.status;
            }
            if (NullChecker.m82486a(((VerificationCenter) pf60Var.f152157b).ctdidVerificationInfo)) {
                this.f83293d = ((VerificationCenter) pf60Var.f152157b).ctdidVerificationInfo.status;
            }
        }
        this.f83294e = null;
        ((hr4) this.viewModel).m136760v(false);
        ((hr4) this.viewModel).m136754n(this.f83291b);
        ((hr4) this.viewModel).m136756q(this.f83292c, this.f83291b);
        ((hr4) this.viewModel).m136755p(this.f83293d, this.f83291b);
        ((hr4) this.viewModel).m136758s(this.f83294e);
        m112041q0();
    }

    /* JADX INFO: renamed from: o0 */
    private void m112033o0(String str, StudentVerificationStatus studentVerificationStatus, boolean z) {
        String str2;
        String str3 = "waitting";
        if (TEnum.equals(studentVerificationStatus, "verified")) {
            str2 = StateEvent.ProcessResult.SUCCEED;
        } else if (TEnum.equals(studentVerificationStatus, "rejected")) {
            str2 = "fail";
        } else if (TEnum.equals(studentVerificationStatus, "pending")) {
            str2 = "waitting";
        } else {
            str2 = TEnum.equals(studentVerificationStatus, "invalid") ? "invalidation" : "default";
        }
        if (!TextUtils.equals(str, "e_verification_name") || !TEnum.equals(studentVerificationStatus, "verified")) {
            str3 = str2;
        } else if (TEnum.equals(this.f83291b, "verified")) {
            str3 = StateEvent.ProcessResult.SUCCEED;
        } else if (!TEnum.equals(this.f83291b, "pending")) {
            str3 = "Pending";
        }
        if (z) {
            i4g0.m138492A(str, "p_verification", jyb.m147494Y("verification_button_state", str3));
        } else {
            i4g0.m138523u(str, "p_verification", jyb.m147494Y("verification_button_state", str3));
        }
    }

    /* JADX INFO: renamed from: p0 */
    private void m112034p0(String str, StudentVerificationStatus studentVerificationStatus) {
        m112033o0(str, studentVerificationStatus, false);
    }

    /* JADX INFO: renamed from: r0 */
    private void m112035r0(String str, StudentVerificationStatus studentVerificationStatus) {
        m112033o0(str, studentVerificationStatus, true);
    }

    @Override // p153l.ar2
    /* JADX INFO: renamed from: a0 */
    public void mo40473a0() {
        duringCreated(psd0.m173625r(CoreModule.f18264c.f20381e0.m116596o9(), CoreModule.f18264c.f20294B0.m32614j4(), new ip4())).subscribe(psd0.m173596G(new y20() { // from class: l.yq4
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f201149a.m112032m0((pf60) obj);
            }
        }));
        duringCreated(new pcj() { // from class: l.zq4
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return CoreModule.f18264c.f20294B0.m32620p4(CoreModule.m30929H().userId());
            }
        }).subscribe(psd0.m173597H(new y20() { // from class: l.ar4
            @Override // p153l.y20
            public final void call(Object obj) {
                cr4.m112031h0((uxj0) obj);
            }
        }, new y20() { // from class: l.br4
            @Override // p153l.y20
            public final void call(Object obj) {
                cr4.m112029f0((Throwable) obj);
            }
        }));
        xc20.m210108t(act());
    }

    /* JADX INFO: renamed from: i0 */
    public void m112036i0() {
        pq4.m173307o(act());
        m112034p0("e_verification_avatar", this.f83291b);
    }

    /* JADX INFO: renamed from: j0 */
    public void m112037j0() {
        if (TEnum.equals(this.f83293d, "unknown_") || TEnum.equals(this.f83293d, "default") || TEnum.equals(this.f83293d, "rejected") || TEnum.equals(this.f83293d, "normal") || TEnum.equals(this.f83293d, "invalid")) {
            Act act = act();
            if (NullChecker.m82486a(act)) {
                pq4.m173303k(act, "verification_center");
            }
        }
        m112034p0("e_verification_ctid", this.f83294e);
    }

    /* JADX INFO: renamed from: k0 */
    public void m112038k0() {
        pq4.m173306n(act());
        m112034p0("e_verification_name", this.f83292c);
    }

    /* JADX INFO: renamed from: l0 */
    public void m112039l0() {
        StudentVerificationStatus studentVerificationStatus = this.f83294e;
        if (studentVerificationStatus == null || (!TEnum.equals(studentVerificationStatus, "verified") && !TEnum.equals(this.f83294e, "pending"))) {
            act().startActivity(StudentInfoAct.m45668X1(act(), null, false));
        }
        m112034p0("e_verification_student", this.f83294e);
    }

    /* JADX INFO: renamed from: n0 */
    public void m112040n0(String str) {
        Picture picture = new Picture();
        picture.url = oki.m168011B(str);
        picture.status = MediaLocalStatus.get("raw");
        picture.size = new Dimension(new sim(oki.m168038z(picture.url)).f168843d);
        if (this.f83290a == null) {
            VerificationCenter verificationCenter = new VerificationCenter();
            this.f83290a = verificationCenter;
            verificationCenter.picVerificationInfo = new PicVerificationInfo();
        }
        this.f83290a.picVerificationInfo.media = picture;
        zki0.m220078G(act(), false, true, picture, this.f83290a);
    }

    /* JADX INFO: renamed from: q0 */
    public void m112041q0() {
        if (this.f83295f) {
            return;
        }
        this.f83295f = true;
        m112035r0("e_verification_avatar", this.f83291b);
        m112035r0("e_verification_name", this.f83292c);
        m112035r0("e_verification_student", this.f83294e);
        m112035r0("e_verification_ctid", this.f83294e);
    }

    @Override // p153l.k3m
    public void destroy() {
    }
}
