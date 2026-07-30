package p149l;

import android.text.TextUtils;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.PicVerificationInfo;
import com.p046p1.mobile.putong.core.data.VerificationCenter;
import com.p046p1.mobile.putong.core.p053ui.campus.StudentInfoAct;
import com.p046p1.mobile.putong.data.Dimension;
import com.p046p1.mobile.putong.data.MediaLocalStatus;
import com.p046p1.mobile.putong.data.Picture;
import com.p046p1.mobile.putong.data.StudentVerificationStatus;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.NullChecker;
import com.tencent.youtu.sdkkitframework.common.StateEvent;

/* JADX INFO: loaded from: classes9.dex */
public class dq4 extends jq2<iq4> {

    /* JADX INFO: renamed from: a */
    public VerificationCenter f87384a;

    /* JADX INFO: renamed from: b */
    public StudentVerificationStatus f87385b;

    /* JADX INFO: renamed from: c */
    public StudentVerificationStatus f87386c;

    /* JADX INFO: renamed from: d */
    public StudentVerificationStatus f87387d;

    /* JADX INFO: renamed from: e */
    public StudentVerificationStatus f87388e;

    /* JADX INFO: renamed from: f */
    public boolean f87389f;

    public dq4(mcr mcrVar) {
        super(mcrVar);
    }

    /* JADX INFO: renamed from: f0 */
    public static /* synthetic */ void m112981f0(Throwable th) {
    }

    /* JADX INFO: renamed from: h0 */
    public static /* synthetic */ void m112983h0(roj0 roj0Var) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: m0 */
    public /* synthetic */ void m112984m0(j760 j760Var) {
        S s = j760Var.f116565b;
        this.f87384a = (VerificationCenter) s;
        if (NullChecker.m81303a(s)) {
            if (NullChecker.m81303a(((VerificationCenter) j760Var.f116565b).picVerificationInfo)) {
                this.f87385b = ((VerificationCenter) j760Var.f116565b).picVerificationInfo.status;
            }
            if (NullChecker.m81303a(((VerificationCenter) j760Var.f116565b).idCard)) {
                this.f87386c = ((VerificationCenter) j760Var.f116565b).idCard.status;
            }
            if (NullChecker.m81303a(((VerificationCenter) j760Var.f116565b).ctdidVerificationInfo)) {
                this.f87387d = ((VerificationCenter) j760Var.f116565b).ctdidVerificationInfo.status;
            }
        }
        this.f87388e = null;
        ((iq4) this.viewModel).m137627v(false);
        ((iq4) this.viewModel).m137621n(this.f87385b);
        ((iq4) this.viewModel).m137623q(this.f87386c, this.f87385b);
        ((iq4) this.viewModel).m137622p(this.f87387d, this.f87385b);
        ((iq4) this.viewModel).m137625s(this.f87388e);
        m112993q0();
    }

    /* JADX INFO: renamed from: o0 */
    private void m112985o0(String str, StudentVerificationStatus studentVerificationStatus, boolean z) {
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
        } else if (TEnum.equals(this.f87385b, "verified")) {
            str3 = StateEvent.ProcessResult.SUCCEED;
        } else if (!TEnum.equals(this.f87385b, "pending")) {
            str3 = "Pending";
        }
        if (z) {
            zvf0.m220368A(str, "p_verification", vwb.m200311Y("verification_button_state", str3));
        } else {
            zvf0.m220399u(str, "p_verification", vwb.m200311Y("verification_button_state", str3));
        }
    }

    /* JADX INFO: renamed from: p0 */
    private void m112986p0(String str, StudentVerificationStatus studentVerificationStatus) {
        m112985o0(str, studentVerificationStatus, false);
    }

    /* JADX INFO: renamed from: r0 */
    private void m112987r0(String str, StudentVerificationStatus studentVerificationStatus) {
        m112985o0(str, studentVerificationStatus, true);
    }

    @Override // p149l.jq2
    /* JADX INFO: renamed from: a0 */
    public void mo39470a0() {
        duringCreated(mkd0.m154984r(CoreModule.f17545c.f19639e0.m169523o9(), CoreModule.f17545c.f19552B0.m31611j4(), new jo4())).subscribe(mkd0.m154955G(new e30() { // from class: l.zp4
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f204175a.m112984m0((j760) obj);
            }
        }));
        duringCreated(new v9j() { // from class: l.aq4
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return CoreModule.f17545c.f19552B0.m31617p4(CoreModule.m29931H().userId());
            }
        }).subscribe(mkd0.m154956H(new e30() { // from class: l.bq4
            @Override // p149l.e30
            public final void call(Object obj) {
                dq4.m112983h0((roj0) obj);
            }
        }, new e30() { // from class: l.cq4
            @Override // p149l.e30
            public final void call(Object obj) {
                dq4.m112981f0((Throwable) obj);
            }
        }));
        p420.m167354t(act());
    }

    /* JADX INFO: renamed from: i0 */
    public void m112988i0() {
        qp4.m175809o(act());
        m112986p0("e_verification_avatar", this.f87385b);
    }

    /* JADX INFO: renamed from: j0 */
    public void m112989j0() {
        if (TEnum.equals(this.f87387d, "unknown_") || TEnum.equals(this.f87387d, "default") || TEnum.equals(this.f87387d, "rejected") || TEnum.equals(this.f87387d, "normal") || TEnum.equals(this.f87387d, "invalid")) {
            Act act = act();
            if (NullChecker.m81303a(act)) {
                qp4.m175805k(act, "verification_center");
            }
        }
        m112986p0("e_verification_ctid", this.f87388e);
    }

    /* JADX INFO: renamed from: k0 */
    public void m112990k0() {
        qp4.m175808n(act());
        m112986p0("e_verification_name", this.f87386c);
    }

    /* JADX INFO: renamed from: l0 */
    public void m112991l0() {
        StudentVerificationStatus studentVerificationStatus = this.f87388e;
        if (studentVerificationStatus == null || (!TEnum.equals(studentVerificationStatus, "verified") && !TEnum.equals(this.f87388e, "pending"))) {
            act().startActivity(StudentInfoAct.m44485V1(act(), null, false));
        }
        m112986p0("e_verification_student", this.f87388e);
    }

    /* JADX INFO: renamed from: n0 */
    public void m112992n0(String str) {
        Picture picture = new Picture();
        picture.url = rhi.m179355B(str);
        picture.status = MediaLocalStatus.get("raw");
        picture.size = new Dimension(new pgm(rhi.m179382z(picture.url)).f148730d);
        if (this.f87384a == null) {
            VerificationCenter verificationCenter = new VerificationCenter();
            this.f87384a = verificationCenter;
            verificationCenter.picVerificationInfo = new PicVerificationInfo();
        }
        this.f87384a.picVerificationInfo.media = picture;
        zbi0.m217858G(act(), false, true, picture, this.f87384a);
    }

    /* JADX INFO: renamed from: q0 */
    public void m112993q0() {
        if (this.f87389f) {
            return;
        }
        this.f87389f = true;
        m112987r0("e_verification_avatar", this.f87385b);
        m112987r0("e_verification_name", this.f87386c);
        m112987r0("e_verification_student", this.f87388e);
        m112987r0("e_verification_ctid", this.f87388e);
    }

    @Override // p149l.q0m
    public void destroy() {
    }
}
