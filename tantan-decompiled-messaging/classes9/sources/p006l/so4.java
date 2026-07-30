package p006l;

import android.content.Context;
import android.content.Intent;
import com.p000p1.mobile.putong.account.data.CameraSticker;
import com.p000p1.mobile.putong.core.CoreModule;
import com.p000p1.mobile.putong.core.p004ui.settings.SettingsFragOld;
import com.p000p1.mobile.putong.core.p004ui.settings.privacy.PrivacySettingAct;
import com.p000p1.mobile.putong.core.p004ui.verification.CertPrivilege;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.core.data.PicVerificationInfo;
import com.p1.mobile.putong.core.data.PictureVerifyRightedInfo;
import com.p1.mobile.putong.core.data.VerificationCenter;
import com.p1.mobile.putong.core.newui.container.NewUI1ContainerActivity;
import com.p1.mobile.putong.core.newui.profile.newmine.newprofile.view.IdentifyView;
import com.p1.mobile.putong.core.ui.campus.StudentInfoAct;
import com.p1.mobile.putong.data.Dimension;
import com.p1.mobile.putong.data.Media;
import com.p1.mobile.putong.data.MediaLabel;
import com.p1.mobile.putong.data.MediaLocalStatus;
import com.p1.mobile.putong.data.Picture;
import com.p1.mobile.putong.data.StudentVerificationStatus;
import com.p1.mobile.putong.data.User;
import com.p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.HashMap;
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
import l.w9j;
import l.zvf0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class so4 extends jq2<ep4> {

    /* JADX INFO: renamed from: a */
    public VerificationCenter f21449a;

    /* JADX INFO: renamed from: b */
    public StudentVerificationStatus f21450b;

    /* JADX INFO: renamed from: c */
    public StudentVerificationStatus f21451c;

    /* JADX INFO: renamed from: d */
    public StudentVerificationStatus f21452d;

    /* JADX INFO: renamed from: e */
    public StudentVerificationStatus f21453e;

    /* JADX INFO: renamed from: f */
    public boolean f21454f;

    public so4(mcr mcrVar) {
        super(mcrVar);
    }

    /* JADX INFO: renamed from: g0 */
    public static /* synthetic */ void m23931g0(roj0 roj0Var) {
    }

    /* JADX INFO: renamed from: j0 */
    public static /* synthetic */ void m23934j0(Throwable th) {
    }

    /* JADX INFO: renamed from: l0 */
    public static /* synthetic */ void m23936l0(Throwable th) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t0 */
    public /* synthetic */ void m23937t0(j760 j760Var) {
        Object obj = j760Var.b;
        this.f21449a = (VerificationCenter) obj;
        if (NullChecker.a(obj)) {
            if (NullChecker.a(((VerificationCenter) j760Var.b).picVerificationInfo)) {
                this.f21450b = ((VerificationCenter) j760Var.b).picVerificationInfo.status;
            }
            if (NullChecker.a(((VerificationCenter) j760Var.b).idCard)) {
                this.f21451c = ((VerificationCenter) j760Var.b).idCard.status;
            }
            if (NullChecker.a(((VerificationCenter) j760Var.b).ctdidVerificationInfo)) {
                this.f21452d = ((VerificationCenter) j760Var.b).ctdidVerificationInfo.status;
            }
        }
        this.f21453e = null;
        ((ep4) ((jq2) this).viewModel).m14790V(false);
        ((ep4) ((jq2) this).viewModel).m14784P(this.f21450b);
        ((ep4) ((jq2) this).viewModel).m14788T(this.f21451c, this.f21450b);
        ((ep4) ((jq2) this).viewModel).m14787S(this.f21452d, this.f21450b);
        ((ep4) ((jq2) this).viewModel).m14789U(this.f21453e);
        m23938A0();
    }

    /* JADX INFO: renamed from: A0 */
    public void m23938A0() {
        if (this.f21454f) {
            return;
        }
        this.f21454f = true;
        m23939C0("e_verification_avatar", this.f21450b);
        m23939C0("e_verification_name", this.f21451c);
        m23939C0("e_verification_student", this.f21453e);
        m23939C0("e_verification_ctid", this.f21453e);
    }

    /* JADX INFO: renamed from: C0 */
    public final void m23939C0(String str, StudentVerificationStatus studentVerificationStatus) {
        m23950y0(str, studentVerificationStatus, true);
    }

    /* JADX INFO: renamed from: a0 */
    public void m23940a0() {
        duringCreated(mkd0.r(CoreModule.f1534c.f3628e0.m21486o9(), CoreModule.f1534c.f3541B0.m3541j4(), new jo4())).subscribe(mkd0.G(new e30() { // from class: l.ko4
            public final void call(Object obj) {
                this.f15922a.m23937t0((j760) obj);
            }
        }));
        duringCreated(CoreModule.f1534c.f3541B0.m3541j4().distinctUntilChanged().filter(new w9j() { // from class: l.lo4
            public final Object call(Object obj) {
                VerificationCenter verificationCenter = (VerificationCenter) obj;
                return Boolean.valueOf(verificationCenter != null && TEnum.equals(verificationCenter.picVerificationInfo.status, "verified"));
            }
        }).flatMap(new w9j() { // from class: l.mo4
            public final Object call(Object obj) {
                return CoreModule.f1534c.f3541B0.m3526T3();
            }
        })).subscribe(mkd0.H(new e30() { // from class: l.no4
            public final void call(Object obj) {
                this.f17759a.m23948u0((PictureVerifyRightedInfo) obj);
            }
        }, new e30() { // from class: l.oo4
            public final void call(Object obj) {
                so4.m23936l0((Throwable) obj);
            }
        }));
        duringCreated(new v9j() { // from class: l.po4
            public final Object call() {
                return CoreModule.f1534c.f3541B0.m3547p4(CoreModule.m1850H().userId());
            }
        }).subscribe(mkd0.H(new e30() { // from class: l.qo4
            public final void call(Object obj) {
                so4.m23931g0((roj0) obj);
            }
        }, new e30() { // from class: l.ro4
            public final void call(Object obj) {
                so4.m23934j0((Throwable) obj);
            }
        }));
        p420.m21036t(act());
    }

    /* JADX INFO: renamed from: m0 */
    public final String m23941m0() {
        String stringExtra = act().getIntent().getStringExtra("tip_type");
        IdentifyView.TipType tipTypeValueOf = stringExtra == null ? null : IdentifyView.TipType.valueOf(stringExtra);
        if (tipTypeValueOf == IdentifyView.TipType.INVITE) {
            return "invite_verify";
        }
        if (tipTypeValueOf == IdentifyView.TipType.ONLY_CERT) {
            return "trial_like";
        }
        return tipTypeValueOf == IdentifyView.TipType.SWIPE_LIMIT ? "like_limit" : "unverified_default";
    }

    /* JADX INFO: renamed from: n0 */
    public void m23942n0() {
        qp4.m22312o(act());
        m23951z0("e_verification_avatar", this.f21450b);
    }

    /* JADX INFO: renamed from: o0 */
    public void m23943o0() {
        if (TEnum.equals(this.f21452d, "unknown_") || TEnum.equals(this.f21452d, CameraSticker.CATEGORY_DEFAULT_FILTER) || TEnum.equals(this.f21452d, "rejected") || TEnum.equals(this.f21452d, "normal") || TEnum.equals(this.f21452d, "invalid")) {
            Act act = act();
            if (NullChecker.a(act)) {
                qp4.m22308k(act, "verification_center");
            }
        }
        m23951z0("e_verification_ctid", this.f21453e);
    }

    /* JADX INFO: renamed from: p0 */
    public void m23944p0() {
        qp4.m22311n(act());
        m23951z0("e_verification_name", this.f21451c);
    }

    /* JADX INFO: renamed from: q0 */
    public void m23945q0() {
        if (upa.m25327E2()) {
            act().startActivity(PrivacySettingAct.m9070Y1(act(), "setting"));
            return;
        }
        Intent intent = new Intent((Context) act(), (Class<?>) NewUI1ContainerActivity.class);
        intent.putExtra("fragmentName", SettingsFragOld.class.getSimpleName());
        act().startActivity(intent);
    }

    /* JADX INFO: renamed from: r0 */
    public void m23946r0(int i) {
        ArrayList arrayListF0 = vwb.f0(new CertPrivilege[]{CertPrivilege.more_swipe, CertPrivilege.priority_recommend, CertPrivilege.cert_logo, CertPrivilege.high_privacy_setting, CertPrivilege.only_look_cert});
        new tp4(act(), i, arrayListF0).show();
        zvf0.u("e_verify_privilege", "p_verification", new j760[]{vwb.Y("verfication_state", TEnum.equals(this.f21450b, "verified") ? "pass" : "invalidation"), vwb.Y("privilege_name", ((CertPrivilege) arrayListF0.get(i)).getTrackName())});
    }

    /* JADX INFO: renamed from: s0 */
    public void m23947s0() {
        StudentVerificationStatus studentVerificationStatus = this.f21453e;
        if (studentVerificationStatus == null || (!TEnum.equals(studentVerificationStatus, "verified") && !TEnum.equals(studentVerificationStatus, "pending"))) {
            act().startActivity(StudentInfoAct.V1(act(), (String) null, false));
        }
        m23951z0("e_verification_student", this.f21453e);
    }

    /* JADX INFO: renamed from: u0 */
    public final /* synthetic */ void m23948u0(PictureVerifyRightedInfo pictureVerifyRightedInfo) {
        ((ep4) ((jq2) this).viewModel).m14786R(pictureVerifyRightedInfo.exSwipeRight, pictureVerifyRightedInfo.priorityRecommend, pictureVerifyRightedInfo.seeVerifyCount);
    }

    /* JADX INFO: renamed from: x0 */
    public void m23949x0(String str) {
        Picture picture = new Picture();
        ((Media) picture).url = rhi.B(str);
        ((Media) picture).status = MediaLocalStatus.get("raw");
        picture.size = new Dimension(new pgm(rhi.z(((Media) picture).url)).d);
        if (this.f21449a == null) {
            VerificationCenter verificationCenter = new VerificationCenter();
            this.f21449a = verificationCenter;
            verificationCenter.picVerificationInfo = new PicVerificationInfo();
        }
        this.f21449a.picVerificationInfo.media = picture;
        zbi0.m28649G(act(), false, true, picture, this.f21449a);
    }

    /* JADX INFO: renamed from: y0 */
    public final void m23950y0(String str, StudentVerificationStatus studentVerificationStatus, boolean z) {
        String str2;
        boolean zEquals = TEnum.equals(studentVerificationStatus, "verified");
        String str3 = CameraSticker.CATEGORY_DEFAULT_FILTER;
        String str4 = "waitting";
        if (zEquals) {
            str2 = "succeed";
        } else if (TEnum.equals(studentVerificationStatus, "rejected")) {
            str2 = "fail";
        } else if (TEnum.equals(studentVerificationStatus, "pending")) {
            str2 = "waitting";
        } else {
            str2 = TEnum.equals(studentVerificationStatus, "invalid") ? "invalidation" : CameraSticker.CATEGORY_DEFAULT_FILTER;
        }
        if (!"e_verification_name".equals(str) || !TEnum.equals(studentVerificationStatus, "verified")) {
            str4 = str2;
        } else if (TEnum.equals(this.f21450b, "verified")) {
            str4 = "succeed";
        } else if (!TEnum.equals(this.f21450b, "pending")) {
            str4 = "Pending";
        }
        HashMap map = new HashMap();
        map.put("verification_button_state", str4);
        if ("e_verification_avatar".equals(str)) {
            User userM21483na = CoreModule.f1534c.f3628e0.m21483na();
            if (userM21483na.isFakeUser() || userM21483na.fp().isLabelJudge(MediaLabel.get("LOW_FACE_MARK"))) {
                str3 = "image_quality";
            }
            map.put("photo_status", str3);
            if (upa.m25498p2()) {
                map.put("verification_guidance_status", m23941m0());
            }
        }
        if (z) {
            zvf0.y(str, "p_verification", map);
        } else {
            zvf0.s(str, "p_verification", map);
        }
    }

    /* JADX INFO: renamed from: z0 */
    public final void m23951z0(String str, StudentVerificationStatus studentVerificationStatus) {
        m23950y0(str, studentVerificationStatus, false);
    }

    public void destroy() {
    }
}
