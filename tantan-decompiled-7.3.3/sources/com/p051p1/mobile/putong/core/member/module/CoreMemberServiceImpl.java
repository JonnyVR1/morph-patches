package com.p051p1.mobile.putong.core.member.module;

import android.content.Context;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.android.app.Frag;
import com.p051p1.mobile.putong.core.biz.service.CoreMemberInnerService;
import com.p051p1.mobile.putong.core.data.Privilege;
import com.p051p1.mobile.putong.core.data.PurchaseType;
import com.p051p1.mobile.putong.core.newui.customized.PrivateCustomTabFrag;
import com.p051p1.mobile.putong.core.newui.supreme.hometab.SupremePartnerTabFrag;
import com.p051p1.mobile.putong.core.newui.youthvip.YouthVipTabFrag;
import com.p051p1.mobile.putong.core.p058ui.diamond.match.ODiamondFakeMatchAct;
import com.p051p1.mobile.putong.core.p058ui.vip.likers.LikersAct;
import com.p051p1.mobile.putong.core.p058ui.vip.privilegeNewUi.VipNewUtils;
import com.p051p1.mobile.putong.data.User;
import com.tantanapp.android.injecter.facade.annotation.Route;
import p153l.C21545y9;
import p153l.f760;
import p153l.gbc0;
import p153l.p920;
import p153l.qap;
import p153l.ric0;
import p153l.rs9;
import p153l.x20;
import p153l.y20;
import p153l.z5h0;

/* JADX INFO: loaded from: classes10.dex */
@Route(name = "CoreMemberInnerService", path = "/member_service/service")
public class CoreMemberServiceImpl implements CoreMemberInnerService {
    @Override // com.p051p1.mobile.putong.core.biz.service.CoreMemberInnerService
    /* JADX INFO: renamed from: Do */
    public void mo35967Do(Act act, String str, String str2) {
        ODiamondFakeMatchAct.m46147b2(act, str, str2);
    }

    @Override // com.p051p1.mobile.putong.core.biz.service.CoreMemberInnerService
    /* JADX INFO: renamed from: Fb */
    public void mo35968Fb() {
        f760.INSTANCE.m124356c();
    }

    @Override // com.p051p1.mobile.putong.core.biz.service.CoreMemberInnerService
    /* JADX INFO: renamed from: Fj */
    public int mo35969Fj() {
        return p920.INSTANCE.m171324h();
    }

    @Override // com.p051p1.mobile.putong.core.biz.service.CoreMemberInnerService
    /* JADX INFO: renamed from: Fq */
    public void mo35970Fq() {
        ric0.m181581i().m181590o();
    }

    @Override // com.p051p1.mobile.putong.core.biz.service.CoreMemberInnerService
    /* JADX INFO: renamed from: Hn */
    public Frag mo35971Hn() {
        return new YouthVipTabFrag();
    }

    @Override // com.p051p1.mobile.putong.core.biz.service.CoreMemberInnerService
    /* JADX INFO: renamed from: Hs */
    public int mo35972Hs() {
        return p920.INSTANCE.m171325i();
    }

    @Override // com.p051p1.mobile.putong.core.biz.service.CoreMemberInnerService
    /* JADX INFO: renamed from: Kh */
    public void mo35973Kh(String str) {
        p920.INSTANCE.m171330n(str);
    }

    @Override // com.p051p1.mobile.putong.core.biz.service.CoreMemberInnerService
    /* JADX INFO: renamed from: Pp */
    public Frag mo35974Pp() {
        return new PrivateCustomTabFrag();
    }

    @Override // com.p051p1.mobile.putong.core.biz.service.CoreMemberInnerService
    /* JADX INFO: renamed from: Qo */
    public void mo35975Qo() {
        qap.INSTANCE.m175967e();
    }

    @Override // com.p051p1.mobile.putong.core.biz.service.CoreMemberInnerService
    /* JADX INFO: renamed from: Se */
    public int mo35976Se() {
        return p920.INSTANCE.m171323g();
    }

    @Override // com.p051p1.mobile.putong.core.biz.service.CoreMemberInnerService
    /* JADX INFO: renamed from: Vh */
    public boolean mo35977Vh() {
        return rs9.m182937f();
    }

    @Override // com.p051p1.mobile.putong.core.biz.service.CoreMemberInnerService
    /* JADX INFO: renamed from: W6 */
    public void mo35978W6(Frag frag, String str) {
        if (frag instanceof PrivateCustomTabFrag) {
            ((PrivateCustomTabFrag) frag).m37203R4(str);
        }
    }

    @Override // com.p051p1.mobile.putong.core.biz.service.CoreMemberInnerService
    /* JADX INFO: renamed from: Xm */
    public int mo35979Xm() {
        return p920.INSTANCE.m171326j();
    }

    @Override // com.p051p1.mobile.putong.core.biz.service.CoreMemberInnerService
    /* JADX INFO: renamed from: Xp */
    public boolean mo35980Xp(PurchaseType purchaseType) {
        return VipNewUtils.m58696j(purchaseType);
    }

    @Override // com.p051p1.mobile.putong.core.biz.service.CoreMemberInnerService
    /* JADX INFO: renamed from: br */
    public void mo35981br() {
        z5h0.m218680u();
    }

    @Override // com.p051p1.mobile.putong.core.biz.service.CoreMemberInnerService
    /* JADX INFO: renamed from: cc */
    public int mo35982cc() {
        return VipNewUtils.m58693g();
    }

    @Override // com.p051p1.mobile.putong.core.biz.service.CoreMemberInnerService
    /* JADX INFO: renamed from: dt */
    public void mo35983dt(Act act, PurchaseType purchaseType, Privilege privilege, x20 x20Var) {
        VipNewUtils.m58701o(act, purchaseType, privilege, x20Var);
    }

    @Override // com.p051p1.mobile.putong.core.biz.service.CoreMemberInnerService
    /* JADX INFO: renamed from: fn */
    public boolean mo35984fn(String str) {
        return p920.INSTANCE.m171327k(str);
    }

    @Override // com.tantanapp.android.injecter.facade.template.IProvider
    public void init(Context context) {
    }

    @Override // com.p051p1.mobile.putong.core.biz.service.CoreMemberInnerService
    /* JADX INFO: renamed from: j7 */
    public void mo35985j7(Context context, User user, ImageView imageView, boolean z, boolean z2) {
        VipNewUtils.m58697k(context, user, imageView, z2);
    }

    @Override // com.p051p1.mobile.putong.core.biz.service.CoreMemberInnerService
    /* JADX INFO: renamed from: jn */
    public int mo35986jn() {
        return gbc0.f103388q6;
    }

    @Override // com.p051p1.mobile.putong.core.biz.service.CoreMemberInnerService
    /* JADX INFO: renamed from: lg */
    public Frag mo35987lg() {
        return new SupremePartnerTabFrag();
    }

    @Override // com.p051p1.mobile.putong.core.biz.service.CoreMemberInnerService
    /* JADX INFO: renamed from: li */
    public void mo35988li(@NonNull Context context, String str, boolean z) {
        context.startActivity(LikersAct.m57728Z1(context, str, z));
    }

    @Override // com.p051p1.mobile.putong.core.biz.service.CoreMemberInnerService
    /* JADX INFO: renamed from: o7 */
    public void mo35989o7(Context context, User user, ImageView imageView, boolean z, boolean z2) {
        VipNewUtils.m58698l(context, user, imageView, z, z2);
    }

    @Override // com.p051p1.mobile.putong.core.biz.service.CoreMemberInnerService
    /* JADX INFO: renamed from: ro */
    public void mo35990ro(User user, ImageView imageView) {
        VipNewUtils.m58700n(user, imageView);
    }

    @Override // com.p051p1.mobile.putong.core.biz.service.CoreMemberInnerService
    /* JADX INFO: renamed from: ul */
    public int mo35991ul() {
        return VipNewUtils.m58692f();
    }

    @Override // com.p051p1.mobile.putong.core.biz.service.CoreMemberInnerService
    /* JADX INFO: renamed from: vr */
    public void mo35992vr(Act act, User user, boolean z, @Nullable y20<Boolean> y20Var, String str) {
        p920.INSTANCE.m171332p(act, user, z, y20Var, str);
    }

    @Override // com.p051p1.mobile.putong.core.biz.service.CoreMemberInnerService
    /* JADX INFO: renamed from: wq */
    public boolean mo35993wq() {
        return ric0.m181583m();
    }

    @Override // com.p051p1.mobile.putong.core.biz.service.CoreMemberInnerService
    /* JADX INFO: renamed from: x6 */
    public int mo35994x6() {
        return C21545y9.INSTANCE.m214796j();
    }

    @Override // com.p051p1.mobile.putong.core.biz.service.CoreMemberInnerService
    /* JADX INFO: renamed from: yb */
    public String mo35995yb(Context context) {
        return VipNewUtils.m58691e(context);
    }
}
