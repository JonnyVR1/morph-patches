package p006l;

import android.text.TextUtils;
import com.p000p1.mobile.putong.account.data.CameraSticker;
import com.p000p1.mobile.putong.core.CoreModule;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.core.data.PicVerificationInfo;
import com.p1.mobile.putong.core.data.VerificationCenter;
import com.p1.mobile.putong.core.ui.campus.StudentInfoAct;
import com.p1.mobile.putong.data.Dimension;
import com.p1.mobile.putong.data.Media;
import com.p1.mobile.putong.data.MediaLocalStatus;
import com.p1.mobile.putong.data.Picture;
import com.p1.mobile.putong.data.StudentVerificationStatus;
import com.p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.NullChecker;
import l.e30;
import l.j760;
import l.jq2;
import l.mcr;
import l.mkd0;
import l.pgm;
import l.rhi;
import l.roj0;
import l.v9j;
import l.vwb;
import l.zvf0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class dq4 extends jq2<iq4> {

    /* JADX INFO: renamed from: a */
    public VerificationCenter f10516a;

    /* JADX INFO: renamed from: b */
    public StudentVerificationStatus f10517b;

    /* JADX INFO: renamed from: c */
    public StudentVerificationStatus f10518c;

    /* JADX INFO: renamed from: d */
    public StudentVerificationStatus f10519d;

    /* JADX INFO: renamed from: e */
    public StudentVerificationStatus f10520e;

    /* JADX INFO: renamed from: f */
    public boolean f10521f;

    public dq4(mcr mcrVar) {
        super(mcrVar);
    }

    /* JADX INFO: renamed from: f0 */
    public static /* synthetic */ void m14174f0(Throwable th) {
    }

    /* JADX INFO: renamed from: h0 */
    public static /* synthetic */ void m14176h0(roj0 roj0Var) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m0 */
    public /* synthetic */ void m14177m0(j760 j760Var) {
        Object obj = j760Var.b;
        this.f10516a = (VerificationCenter) obj;
        if (NullChecker.a(obj)) {
            if (NullChecker.a(((VerificationCenter) j760Var.b).picVerificationInfo)) {
                this.f10517b = ((VerificationCenter) j760Var.b).picVerificationInfo.status;
            }
            if (NullChecker.a(((VerificationCenter) j760Var.b).idCard)) {
                this.f10518c = ((VerificationCenter) j760Var.b).idCard.status;
            }
            if (NullChecker.a(((VerificationCenter) j760Var.b).ctdidVerificationInfo)) {
                this.f10519d = ((VerificationCenter) j760Var.b).ctdidVerificationInfo.status;
            }
        }
        this.f10520e = null;
        ((iq4) ((jq2) this).viewModel).m16817v(false);
        ((iq4) ((jq2) this).viewModel).m16811n(this.f10517b);
        ((iq4) ((jq2) this).viewModel).m16813q(this.f10518c, this.f10517b);
        ((iq4) ((jq2) this).viewModel).m16812p(this.f10519d, this.f10517b);
        ((iq4) ((jq2) this).viewModel).m16815s(this.f10520e);
        m14187q0();
    }

    /* JADX INFO: renamed from: o0 */
    private void m14178o0(String str, StudentVerificationStatus studentVerificationStatus, boolean z) {
        String str2;
        String str3 = "waitting";
        if (TEnum.equals(studentVerificationStatus, "verified")) {
            str2 = "succeed";
        } else if (TEnum.equals(studentVerificationStatus, "rejected")) {
            str2 = "fail";
        } else if (TEnum.equals(studentVerificationStatus, "pending")) {
            str2 = "waitting";
        } else {
            str2 = TEnum.equals(studentVerificationStatus, "invalid") ? "invalidation" : CameraSticker.CATEGORY_DEFAULT_FILTER;
        }
        if (!TextUtils.equals(str, "e_verification_name") || !TEnum.equals(studentVerificationStatus, "verified")) {
            str3 = str2;
        } else if (TEnum.equals(this.f10517b, "verified")) {
            str3 = "succeed";
        } else if (!TEnum.equals(this.f10517b, "pending")) {
            str3 = "Pending";
        }
        if (z) {
            zvf0.A(str, "p_verification", new j760[]{vwb.Y("verification_button_state", str3)});
        } else {
            zvf0.u(str, "p_verification", new j760[]{vwb.Y("verification_button_state", str3)});
        }
    }

    /* JADX INFO: renamed from: p0 */
    private void m14179p0(String str, StudentVerificationStatus studentVerificationStatus) {
        m14178o0(str, studentVerificationStatus, false);
    }

    /* JADX INFO: renamed from: r0 */
    private void m14180r0(String str, StudentVerificationStatus studentVerificationStatus) {
        m14178o0(str, studentVerificationStatus, true);
    }

    /* JADX INFO: renamed from: a0 */
    public void m14181a0() {
        duringCreated(mkd0.r(CoreModule.f1534c.f3628e0.m21486o9(), CoreModule.f1534c.f3541B0.m3541j4(), new jo4())).subscribe(mkd0.G(new e30() { // from class: l.zp4
            public final void call(Object obj) {
                this.f28870a.m14177m0((j760) obj);
            }
        }));
        duringCreated(new v9j() { // from class: l.aq4
            public final Object call() {
                return CoreModule.f1534c.f3541B0.m3547p4(CoreModule.m1850H().userId());
            }
        }).subscribe(mkd0.H(new e30() { // from class: l.bq4
            public final void call(Object obj) {
                dq4.m14176h0((roj0) obj);
            }
        }, new e30() { // from class: l.cq4
            public final void call(Object obj) {
                dq4.m14174f0((Throwable) obj);
            }
        }));
        p420.m21036t(act());
    }

    /* JADX INFO: renamed from: i0 */
    public void m14182i0() {
        qp4.m22312o(act());
        m14179p0("e_verification_avatar", this.f10517b);
    }

    /* JADX INFO: renamed from: j0 */
    public void m14183j0() {
        if (TEnum.equals(this.f10519d, "unknown_") || TEnum.equals(this.f10519d, CameraSticker.CATEGORY_DEFAULT_FILTER) || TEnum.equals(this.f10519d, "rejected") || TEnum.equals(this.f10519d, "normal") || TEnum.equals(this.f10519d, "invalid")) {
            Act act = act();
            if (NullChecker.a(act)) {
                qp4.m22308k(act, "verification_center");
            }
        }
        m14179p0("e_verification_ctid", this.f10520e);
    }

    /* JADX INFO: renamed from: k0 */
    public void m14184k0() {
        qp4.m22311n(act());
        m14179p0("e_verification_name", this.f10518c);
    }

    /* JADX INFO: renamed from: l0 */
    public void m14185l0() {
        StudentVerificationStatus studentVerificationStatus = this.f10520e;
        if (studentVerificationStatus == null || (!TEnum.equals(studentVerificationStatus, "verified") && !TEnum.equals(this.f10520e, "pending"))) {
            act().startActivity(StudentInfoAct.V1(act(), (String) null, false));
        }
        m14179p0("e_verification_student", this.f10520e);
    }

    /* JADX INFO: renamed from: n0 */
    public void m14186n0(String str) {
        Picture picture = new Picture();
        ((Media) picture).url = rhi.B(str);
        ((Media) picture).status = MediaLocalStatus.get("raw");
        picture.size = new Dimension(new pgm(rhi.z(((Media) picture).url)).d);
        if (this.f10516a == null) {
            VerificationCenter verificationCenter = new VerificationCenter();
            this.f10516a = verificationCenter;
            verificationCenter.picVerificationInfo = new PicVerificationInfo();
        }
        this.f10516a.picVerificationInfo.media = picture;
        zbi0.m28649G(act(), false, true, picture, this.f10516a);
    }

    /* JADX INFO: renamed from: q0 */
    public void m14187q0() {
        if (this.f10521f) {
            return;
        }
        this.f10521f = true;
        m14180r0("e_verification_avatar", this.f10517b);
        m14180r0("e_verification_name", this.f10518c);
        m14180r0("e_verification_student", this.f10520e);
        m14180r0("e_verification_ctid", this.f10520e);
    }

    public void destroy() {
    }
}
