package p149l;

import android.content.Intent;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.PicVerificationInfo;
import com.p046p1.mobile.putong.core.data.PictureVerifyRightedInfo;
import com.p046p1.mobile.putong.core.data.VerificationCenter;
import com.p046p1.mobile.putong.core.newui.container.NewUI1ContainerActivity;
import com.p046p1.mobile.putong.core.newui.profile.newmine.newprofile.view.IdentifyView;
import com.p046p1.mobile.putong.core.p053ui.campus.StudentInfoAct;
import com.p046p1.mobile.putong.core.p053ui.settings.SettingsFragOld;
import com.p046p1.mobile.putong.core.p053ui.settings.privacy.PrivacySettingAct;
import com.p046p1.mobile.putong.core.p053ui.verification.CertPrivilege;
import com.p046p1.mobile.putong.data.Dimension;
import com.p046p1.mobile.putong.data.MediaLabel;
import com.p046p1.mobile.putong.data.MediaLocalStatus;
import com.p046p1.mobile.putong.data.Picture;
import com.p046p1.mobile.putong.data.StudentVerificationStatus;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.NullChecker;
import com.tencent.youtu.sdkkitframework.common.StateEvent;
import java.util.ArrayList;
import java.util.HashMap;
import p133rx.C22306c;

/* JADX INFO: loaded from: classes9.dex */
public class so4 extends jq2<ep4> {

    /* JADX INFO: renamed from: a */
    public VerificationCenter f165541a;

    /* JADX INFO: renamed from: b */
    public StudentVerificationStatus f165542b;

    /* JADX INFO: renamed from: c */
    public StudentVerificationStatus f165543c;

    /* JADX INFO: renamed from: d */
    public StudentVerificationStatus f165544d;

    /* JADX INFO: renamed from: e */
    public StudentVerificationStatus f165545e;

    /* JADX INFO: renamed from: f */
    public boolean f165546f;

    public so4(mcr mcrVar) {
        super(mcrVar);
    }

    /* JADX INFO: renamed from: g0 */
    public static /* synthetic */ void m185215g0(roj0 roj0Var) {
    }

    /* JADX INFO: renamed from: j0 */
    public static /* synthetic */ void m185218j0(Throwable th) {
    }

    /* JADX INFO: renamed from: l0 */
    public static /* synthetic */ void m185220l0(Throwable th) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: t0 */
    public /* synthetic */ void m185221t0(j760 j760Var) {
        S s = j760Var.f116565b;
        this.f165541a = (VerificationCenter) s;
        if (NullChecker.m81303a(s)) {
            if (NullChecker.m81303a(((VerificationCenter) j760Var.f116565b).picVerificationInfo)) {
                this.f165542b = ((VerificationCenter) j760Var.f116565b).picVerificationInfo.status;
            }
            if (NullChecker.m81303a(((VerificationCenter) j760Var.f116565b).idCard)) {
                this.f165543c = ((VerificationCenter) j760Var.f116565b).idCard.status;
            }
            if (NullChecker.m81303a(((VerificationCenter) j760Var.f116565b).ctdidVerificationInfo)) {
                this.f165544d = ((VerificationCenter) j760Var.f116565b).ctdidVerificationInfo.status;
            }
        }
        this.f165545e = null;
        ((ep4) this.viewModel).m117588V(false);
        ((ep4) this.viewModel).m117582P(this.f165542b);
        ((ep4) this.viewModel).m117586T(this.f165543c, this.f165542b);
        ((ep4) this.viewModel).m117585S(this.f165544d, this.f165542b);
        ((ep4) this.viewModel).m117587U(this.f165545e);
        m185222A0();
    }

    /* JADX INFO: renamed from: A0 */
    public void m185222A0() {
        if (this.f165546f) {
            return;
        }
        this.f165546f = true;
        m185223C0("e_verification_avatar", this.f165542b);
        m185223C0("e_verification_name", this.f165543c);
        m185223C0("e_verification_student", this.f165545e);
        m185223C0("e_verification_ctid", this.f165545e);
    }

    /* JADX INFO: renamed from: C0 */
    public final void m185223C0(String str, StudentVerificationStatus studentVerificationStatus) {
        m185233y0(str, studentVerificationStatus, true);
    }

    @Override // p149l.jq2
    /* JADX INFO: renamed from: a0 */
    public void mo39470a0() {
        duringCreated(mkd0.m154984r(CoreModule.f17545c.f19639e0.m169523o9(), CoreModule.f17545c.f19552B0.m31611j4(), new jo4())).subscribe(mkd0.m154955G(new e30() { // from class: l.ko4
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f123951a.m185221t0((j760) obj);
            }
        }));
        duringCreated((C22306c) CoreModule.f17545c.f19552B0.m31611j4().distinctUntilChanged().filter(new w9j() { // from class: l.lo4
            @Override // p149l.w9j
            public final Object call(Object obj) {
                VerificationCenter verificationCenter = (VerificationCenter) obj;
                return Boolean.valueOf(verificationCenter != null && TEnum.equals(verificationCenter.picVerificationInfo.status, "verified"));
            }
        }).flatMap(new w9j() { // from class: l.mo4
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return CoreModule.f17545c.f19552B0.m31596T3();
            }
        })).subscribe(mkd0.m154956H(new e30() { // from class: l.no4
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f139815a.m185231u0((PictureVerifyRightedInfo) obj);
            }
        }, new e30() { // from class: l.oo4
            @Override // p149l.e30
            public final void call(Object obj) {
                so4.m185220l0((Throwable) obj);
            }
        }));
        duringCreated(new v9j() { // from class: l.po4
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return CoreModule.f17545c.f19552B0.m31617p4(CoreModule.m29931H().userId());
            }
        }).subscribe(mkd0.m154956H(new e30() { // from class: l.qo4
            @Override // p149l.e30
            public final void call(Object obj) {
                so4.m185215g0((roj0) obj);
            }
        }, new e30() { // from class: l.ro4
            @Override // p149l.e30
            public final void call(Object obj) {
                so4.m185218j0((Throwable) obj);
            }
        }));
        p420.m167354t(act());
    }

    /* JADX INFO: renamed from: m0 */
    public final String m185224m0() {
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
    public void m185225n0() {
        qp4.m175809o(act());
        m185234z0("e_verification_avatar", this.f165542b);
    }

    /* JADX INFO: renamed from: o0 */
    public void m185226o0() {
        if (TEnum.equals(this.f165544d, "unknown_") || TEnum.equals(this.f165544d, "default") || TEnum.equals(this.f165544d, "rejected") || TEnum.equals(this.f165544d, "normal") || TEnum.equals(this.f165544d, "invalid")) {
            Act act = act();
            if (NullChecker.m81303a(act)) {
                qp4.m175805k(act, "verification_center");
            }
        }
        m185234z0("e_verification_ctid", this.f165545e);
    }

    /* JADX INFO: renamed from: p0 */
    public void m185227p0() {
        qp4.m175808n(act());
        m185234z0("e_verification_name", this.f165543c);
    }

    /* JADX INFO: renamed from: q0 */
    public void m185228q0() {
        if (upa.m194629E2()) {
            act().startActivity(PrivacySettingAct.m55673Y1(act(), "setting"));
            return;
        }
        Intent intent = new Intent(act(), (Class<?>) NewUI1ContainerActivity.class);
        intent.putExtra("fragmentName", SettingsFragOld.class.getSimpleName());
        act().startActivity(intent);
    }

    /* JADX INFO: renamed from: r0 */
    public void m185229r0(int i) {
        ArrayList arrayListM200324f0 = vwb.m200324f0(CertPrivilege.more_swipe, CertPrivilege.priority_recommend, CertPrivilege.cert_logo, CertPrivilege.high_privacy_setting, CertPrivilege.only_look_cert);
        new tp4(act(), i, arrayListM200324f0).show();
        zvf0.m220399u("e_verify_privilege", "p_verification", vwb.m200311Y("verfication_state", TEnum.equals(this.f165542b, "verified") ? StateEvent.ActionValue.STAGE_PASS : "invalidation"), vwb.m200311Y("privilege_name", ((CertPrivilege) arrayListM200324f0.get(i)).getTrackName()));
    }

    /* JADX INFO: renamed from: s0 */
    public void m185230s0() {
        StudentVerificationStatus studentVerificationStatus = this.f165545e;
        if (studentVerificationStatus == null || (!TEnum.equals(studentVerificationStatus, "verified") && !TEnum.equals(studentVerificationStatus, "pending"))) {
            act().startActivity(StudentInfoAct.m44485V1(act(), null, false));
        }
        m185234z0("e_verification_student", this.f165545e);
    }

    /* JADX INFO: renamed from: u0 */
    public final /* synthetic */ void m185231u0(PictureVerifyRightedInfo pictureVerifyRightedInfo) {
        ((ep4) this.viewModel).m117584R(pictureVerifyRightedInfo.exSwipeRight, pictureVerifyRightedInfo.priorityRecommend, pictureVerifyRightedInfo.seeVerifyCount);
    }

    /* JADX INFO: renamed from: x0 */
    public void m185232x0(String str) {
        Picture picture = new Picture();
        picture.url = rhi.m179355B(str);
        picture.status = MediaLocalStatus.get("raw");
        picture.size = new Dimension(new pgm(rhi.m179382z(picture.url)).f148730d);
        if (this.f165541a == null) {
            VerificationCenter verificationCenter = new VerificationCenter();
            this.f165541a = verificationCenter;
            verificationCenter.picVerificationInfo = new PicVerificationInfo();
        }
        this.f165541a.picVerificationInfo.media = picture;
        zbi0.m217858G(act(), false, true, picture, this.f165541a);
    }

    /* JADX INFO: renamed from: y0 */
    public final void m185233y0(String str, StudentVerificationStatus studentVerificationStatus, boolean z) {
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
        if (!"e_verification_name".equals(str) || !TEnum.equals(studentVerificationStatus, "verified")) {
            str3 = str2;
        } else if (TEnum.equals(this.f165542b, "verified")) {
            str3 = StateEvent.ProcessResult.SUCCEED;
        } else if (!TEnum.equals(this.f165542b, "pending")) {
            str3 = "Pending";
        }
        HashMap map = new HashMap();
        map.put("verification_button_state", str3);
        if ("e_verification_avatar".equals(str)) {
            User userM169520na = CoreModule.f17545c.f19639e0.m169520na();
            map.put("photo_status", (userM169520na.isFakeUser() || userM169520na.m60124fp().isLabelJudge(MediaLabel.get(MediaLabel.LOW_FACE_MARK))) ? "image_quality" : "default");
            if (upa.m194800p2()) {
                map.put("verification_guidance_status", m185224m0());
            }
        }
        if (z) {
            zvf0.m220403y(str, "p_verification", map);
        } else {
            zvf0.m220397s(str, "p_verification", map);
        }
    }

    /* JADX INFO: renamed from: z0 */
    public final void m185234z0(String str, StudentVerificationStatus studentVerificationStatus) {
        m185233y0(str, studentVerificationStatus, false);
    }

    @Override // p149l.q0m
    public void destroy() {
    }
}
