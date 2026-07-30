package p153l;

import android.content.Intent;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.PicVerificationInfo;
import com.p051p1.mobile.putong.core.data.PictureVerifyRightedInfo;
import com.p051p1.mobile.putong.core.data.VerificationCenter;
import com.p051p1.mobile.putong.core.newui.container.NewUI1ContainerActivity;
import com.p051p1.mobile.putong.core.newui.profile.newmine.newprofile.view.IdentifyView;
import com.p051p1.mobile.putong.core.p058ui.campus.StudentInfoAct;
import com.p051p1.mobile.putong.core.p058ui.settings.SettingsFragOld;
import com.p051p1.mobile.putong.core.p058ui.settings.privacy.PrivacySettingAct;
import com.p051p1.mobile.putong.core.p058ui.verification.CertPrivilege;
import com.p051p1.mobile.putong.data.Dimension;
import com.p051p1.mobile.putong.data.MediaLabel;
import com.p051p1.mobile.putong.data.MediaLocalStatus;
import com.p051p1.mobile.putong.data.Picture;
import com.p051p1.mobile.putong.data.StudentVerificationStatus;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.NullChecker;
import com.tencent.youtu.sdkkitframework.common.StateEvent;
import java.util.ArrayList;
import java.util.HashMap;
import p137rx.C22421c;

/* JADX INFO: loaded from: classes12.dex */
public class rp4 extends ar2<dq4> {

    /* JADX INFO: renamed from: a */
    public VerificationCenter f164302a;

    /* JADX INFO: renamed from: b */
    public StudentVerificationStatus f164303b;

    /* JADX INFO: renamed from: c */
    public StudentVerificationStatus f164304c;

    /* JADX INFO: renamed from: d */
    public StudentVerificationStatus f164305d;

    /* JADX INFO: renamed from: e */
    public StudentVerificationStatus f164306e;

    /* JADX INFO: renamed from: f */
    public boolean f164307f;

    public rp4(ner nerVar) {
        super(nerVar);
    }

    /* JADX INFO: renamed from: g0 */
    public static /* synthetic */ void m182491g0(uxj0 uxj0Var) {
    }

    /* JADX INFO: renamed from: j0 */
    public static /* synthetic */ void m182494j0(Throwable th) {
    }

    /* JADX INFO: renamed from: l0 */
    public static /* synthetic */ void m182496l0(Throwable th) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: t0 */
    public /* synthetic */ void m182497t0(pf60 pf60Var) {
        S s = pf60Var.f152157b;
        this.f164302a = (VerificationCenter) s;
        if (NullChecker.m82486a(s)) {
            if (NullChecker.m82486a(((VerificationCenter) pf60Var.f152157b).picVerificationInfo)) {
                this.f164303b = ((VerificationCenter) pf60Var.f152157b).picVerificationInfo.status;
            }
            if (NullChecker.m82486a(((VerificationCenter) pf60Var.f152157b).idCard)) {
                this.f164304c = ((VerificationCenter) pf60Var.f152157b).idCard.status;
            }
            if (NullChecker.m82486a(((VerificationCenter) pf60Var.f152157b).ctdidVerificationInfo)) {
                this.f164305d = ((VerificationCenter) pf60Var.f152157b).ctdidVerificationInfo.status;
            }
        }
        this.f164306e = null;
        ((dq4) this.viewModel).m117478V(false);
        ((dq4) this.viewModel).m117472P(this.f164303b);
        ((dq4) this.viewModel).m117476T(this.f164304c, this.f164303b);
        ((dq4) this.viewModel).m117475S(this.f164305d, this.f164303b);
        ((dq4) this.viewModel).m117477U(this.f164306e);
        m182498A0();
    }

    /* JADX INFO: renamed from: A0 */
    public void m182498A0() {
        if (this.f164307f) {
            return;
        }
        this.f164307f = true;
        m182499C0("e_verification_avatar", this.f164303b);
        m182499C0("e_verification_name", this.f164304c);
        m182499C0("e_verification_student", this.f164306e);
        m182499C0("e_verification_ctid", this.f164306e);
    }

    /* JADX INFO: renamed from: C0 */
    public final void m182499C0(String str, StudentVerificationStatus studentVerificationStatus) {
        m182509y0(str, studentVerificationStatus, true);
    }

    @Override // p153l.ar2
    /* JADX INFO: renamed from: a0 */
    public void mo40473a0() {
        duringCreated(psd0.m173625r(CoreModule.f18264c.f20381e0.m116596o9(), CoreModule.f18264c.f20294B0.m32614j4(), new ip4())).subscribe(psd0.m173596G(new y20() { // from class: l.jp4
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f122072a.m182497t0((pf60) obj);
            }
        }));
        duringCreated((C22421c) CoreModule.f18264c.f20294B0.m32614j4().distinctUntilChanged().filter(new qcj() { // from class: l.kp4
            @Override // p153l.qcj
            public final Object call(Object obj) {
                VerificationCenter verificationCenter = (VerificationCenter) obj;
                return Boolean.valueOf(verificationCenter != null && TEnum.equals(verificationCenter.picVerificationInfo.status, "verified"));
            }
        }).flatMap(new qcj() { // from class: l.lp4
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return CoreModule.f18264c.f20294B0.m32599T3();
            }
        })).subscribe(psd0.m173597H(new y20() { // from class: l.mp4
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f137870a.m182507u0((PictureVerifyRightedInfo) obj);
            }
        }, new y20() { // from class: l.np4
            @Override // p153l.y20
            public final void call(Object obj) {
                rp4.m182496l0((Throwable) obj);
            }
        }));
        duringCreated(new pcj() { // from class: l.op4
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return CoreModule.f18264c.f20294B0.m32620p4(CoreModule.m30929H().userId());
            }
        }).subscribe(psd0.m173597H(new y20() { // from class: l.pp4
            @Override // p153l.y20
            public final void call(Object obj) {
                rp4.m182491g0((uxj0) obj);
            }
        }, new y20() { // from class: l.qp4
            @Override // p153l.y20
            public final void call(Object obj) {
                rp4.m182494j0((Throwable) obj);
            }
        }));
        xc20.m210108t(act());
    }

    /* JADX INFO: renamed from: m0 */
    public final String m182500m0() {
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
    public void m182501n0() {
        pq4.m173307o(act());
        m182510z0("e_verification_avatar", this.f164303b);
    }

    /* JADX INFO: renamed from: o0 */
    public void m182502o0() {
        if (TEnum.equals(this.f164305d, "unknown_") || TEnum.equals(this.f164305d, "default") || TEnum.equals(this.f164305d, "rejected") || TEnum.equals(this.f164305d, "normal") || TEnum.equals(this.f164305d, "invalid")) {
            Act act = act();
            if (NullChecker.m82486a(act)) {
                pq4.m173303k(act, "verification_center");
            }
        }
        m182510z0("e_verification_ctid", this.f164306e);
    }

    /* JADX INFO: renamed from: p0 */
    public void m182503p0() {
        pq4.m173306n(act());
        m182510z0("e_verification_name", this.f164304c);
    }

    /* JADX INFO: renamed from: q0 */
    public void m182504q0() {
        if (gra.m131560E2()) {
            act().startActivity(PrivacySettingAct.m56856Z1(act(), "setting"));
            return;
        }
        Intent intent = new Intent(act(), (Class<?>) NewUI1ContainerActivity.class);
        intent.putExtra("fragmentName", SettingsFragOld.class.getSimpleName());
        act().startActivity(intent);
    }

    /* JADX INFO: renamed from: r0 */
    public void m182505r0(int i) {
        ArrayList arrayListM147507f0 = jyb.m147507f0(CertPrivilege.more_swipe, CertPrivilege.priority_recommend, CertPrivilege.cert_logo, CertPrivilege.high_privacy_setting, CertPrivilege.only_look_cert);
        new sq4(act(), i, arrayListM147507f0).show();
        i4g0.m138523u("e_verify_privilege", "p_verification", jyb.m147494Y("verfication_state", TEnum.equals(this.f164303b, "verified") ? StateEvent.ActionValue.STAGE_PASS : "invalidation"), jyb.m147494Y("privilege_name", ((CertPrivilege) arrayListM147507f0.get(i)).getTrackName()));
    }

    /* JADX INFO: renamed from: s0 */
    public void m182506s0() {
        StudentVerificationStatus studentVerificationStatus = this.f164306e;
        if (studentVerificationStatus == null || (!TEnum.equals(studentVerificationStatus, "verified") && !TEnum.equals(studentVerificationStatus, "pending"))) {
            act().startActivity(StudentInfoAct.m45668X1(act(), null, false));
        }
        m182510z0("e_verification_student", this.f164306e);
    }

    /* JADX INFO: renamed from: u0 */
    public final /* synthetic */ void m182507u0(PictureVerifyRightedInfo pictureVerifyRightedInfo) {
        ((dq4) this.viewModel).m117474R(pictureVerifyRightedInfo.exSwipeRight, pictureVerifyRightedInfo.priorityRecommend, pictureVerifyRightedInfo.seeVerifyCount);
    }

    /* JADX INFO: renamed from: x0 */
    public void m182508x0(String str) {
        Picture picture = new Picture();
        picture.url = oki.m168011B(str);
        picture.status = MediaLocalStatus.get("raw");
        picture.size = new Dimension(new sim(oki.m168038z(picture.url)).f168843d);
        if (this.f164302a == null) {
            VerificationCenter verificationCenter = new VerificationCenter();
            this.f164302a = verificationCenter;
            verificationCenter.picVerificationInfo = new PicVerificationInfo();
        }
        this.f164302a.picVerificationInfo.media = picture;
        zki0.m220078G(act(), false, true, picture, this.f164302a);
    }

    /* JADX INFO: renamed from: y0 */
    public final void m182509y0(String str, StudentVerificationStatus studentVerificationStatus, boolean z) {
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
        } else if (TEnum.equals(this.f164303b, "verified")) {
            str3 = StateEvent.ProcessResult.SUCCEED;
        } else if (!TEnum.equals(this.f164303b, "pending")) {
            str3 = "Pending";
        }
        HashMap map = new HashMap();
        map.put("verification_button_state", str3);
        if ("e_verification_avatar".equals(str)) {
            User userM116593na = CoreModule.f18264c.f20381e0.m116593na();
            map.put("photo_status", (userM116593na.isFakeUser() || userM116593na.m61308fp().isLabelJudge(MediaLabel.get(MediaLabel.LOW_FACE_MARK))) ? "image_quality" : "default");
            if (gra.m131731p2()) {
                map.put("verification_guidance_status", m182500m0());
            }
        }
        if (z) {
            i4g0.m138527y(str, "p_verification", map);
        } else {
            i4g0.m138521s(str, "p_verification", map);
        }
    }

    /* JADX INFO: renamed from: z0 */
    public final void m182510z0(String str, StudentVerificationStatus studentVerificationStatus) {
        m182509y0(str, studentVerificationStatus, false);
    }

    @Override // p153l.k3m
    public void destroy() {
    }
}
