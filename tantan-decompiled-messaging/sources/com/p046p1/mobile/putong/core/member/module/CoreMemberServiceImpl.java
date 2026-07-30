package com.p046p1.mobile.putong.core.member.module;

import android.content.Context;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.android.app.Frag;
import com.p046p1.mobile.putong.core.biz.service.CoreMemberInnerService;
import com.p046p1.mobile.putong.core.data.Privilege;
import com.p046p1.mobile.putong.core.data.PurchaseType;
import com.p046p1.mobile.putong.core.newui.customized.PrivateCustomTabFrag;
import com.p046p1.mobile.putong.core.newui.supreme.hometab.SupremePartnerTabFrag;
import com.p046p1.mobile.putong.core.newui.youthvip.YouthVipTabFrag;
import com.p046p1.mobile.putong.core.p053ui.diamond.match.ODiamondFakeMatchAct;
import com.p046p1.mobile.putong.core.p053ui.vip.likers.LikersAct;
import com.p046p1.mobile.putong.core.p053ui.vip.privilegeNewUi.VipNewUtils;
import com.p046p1.mobile.putong.data.User;
import com.tantanapp.android.injecter.facade.annotation.Route;
import p149l.C16319da;
import p149l.az50;
import p149l.b3c0;
import p149l.d30;
import p149l.e30;
import p149l.gr9;
import p149l.h120;
import p149l.lac0;
import p149l.q8p;
import p149l.rxg0;

/* JADX INFO: loaded from: classes10.dex */
@Route(name = "CoreMemberInnerService", path = "/member_service/service")
public class CoreMemberServiceImpl implements CoreMemberInnerService {
    @Override // com.p046p1.mobile.putong.core.biz.service.CoreMemberInnerService
    /* JADX INFO: renamed from: Do */
    public void mo34964Do(Act act, String str, String str2) {
        ODiamondFakeMatchAct.m44964a2(act, str, str2);
    }

    @Override // com.p046p1.mobile.putong.core.biz.service.CoreMemberInnerService
    /* JADX INFO: renamed from: Fb */
    public void mo34965Fb() {
        az50.INSTANCE.m99623c();
    }

    @Override // com.p046p1.mobile.putong.core.biz.service.CoreMemberInnerService
    /* JADX INFO: renamed from: Fj */
    public int mo34966Fj() {
        return h120.INSTANCE.m129010h();
    }

    @Override // com.p046p1.mobile.putong.core.biz.service.CoreMemberInnerService
    /* JADX INFO: renamed from: Fq */
    public void mo34967Fq() {
        lac0.m149134i().m149143o();
    }

    @Override // com.p046p1.mobile.putong.core.biz.service.CoreMemberInnerService
    /* JADX INFO: renamed from: Hn */
    public Frag mo34968Hn() {
        return new YouthVipTabFrag();
    }

    @Override // com.p046p1.mobile.putong.core.biz.service.CoreMemberInnerService
    /* JADX INFO: renamed from: Hs */
    public int mo34969Hs() {
        return h120.INSTANCE.m129011i();
    }

    @Override // com.p046p1.mobile.putong.core.biz.service.CoreMemberInnerService
    /* JADX INFO: renamed from: Kh */
    public void mo34970Kh(String str) {
        h120.INSTANCE.m129016n(str);
    }

    @Override // com.p046p1.mobile.putong.core.biz.service.CoreMemberInnerService
    /* JADX INFO: renamed from: Pp */
    public Frag mo34971Pp() {
        return new PrivateCustomTabFrag();
    }

    @Override // com.p046p1.mobile.putong.core.biz.service.CoreMemberInnerService
    /* JADX INFO: renamed from: Qo */
    public void mo34972Qo() {
        q8p.INSTANCE.m173430e();
    }

    @Override // com.p046p1.mobile.putong.core.biz.service.CoreMemberInnerService
    /* JADX INFO: renamed from: Se */
    public int mo34973Se() {
        return h120.INSTANCE.m129009g();
    }

    @Override // com.p046p1.mobile.putong.core.biz.service.CoreMemberInnerService
    /* JADX INFO: renamed from: Vh */
    public boolean mo34974Vh() {
        return gr9.m127681f();
    }

    @Override // com.p046p1.mobile.putong.core.biz.service.CoreMemberInnerService
    /* JADX INFO: renamed from: W6 */
    public void mo34975W6(Frag frag, String str) {
        if (frag instanceof PrivateCustomTabFrag) {
            ((PrivateCustomTabFrag) frag).m36200R4(str);
        }
    }

    @Override // com.p046p1.mobile.putong.core.biz.service.CoreMemberInnerService
    /* JADX INFO: renamed from: Xm */
    public int mo34976Xm() {
        return h120.INSTANCE.m129012j();
    }

    @Override // com.p046p1.mobile.putong.core.biz.service.CoreMemberInnerService
    /* JADX INFO: renamed from: Xp */
    public boolean mo34977Xp(PurchaseType purchaseType) {
        return VipNewUtils.m57513j(purchaseType);
    }

    @Override // com.p046p1.mobile.putong.core.biz.service.CoreMemberInnerService
    /* JADX INFO: renamed from: br */
    public void mo34978br() {
        rxg0.m181577u();
    }

    @Override // com.p046p1.mobile.putong.core.biz.service.CoreMemberInnerService
    /* JADX INFO: renamed from: cc */
    public int mo34979cc() {
        return VipNewUtils.m57510g();
    }

    @Override // com.p046p1.mobile.putong.core.biz.service.CoreMemberInnerService
    /* JADX INFO: renamed from: dt */
    public void mo34980dt(Act act, PurchaseType purchaseType, Privilege privilege, d30 d30Var) {
        VipNewUtils.m57518o(act, purchaseType, privilege, d30Var);
    }

    @Override // com.p046p1.mobile.putong.core.biz.service.CoreMemberInnerService
    /* JADX INFO: renamed from: fn */
    public boolean mo34981fn(String str) {
        return h120.INSTANCE.m129013k(str);
    }

    @Override // com.tantanapp.android.injecter.facade.template.IProvider
    public void init(Context context) {
    }

    @Override // com.p046p1.mobile.putong.core.biz.service.CoreMemberInnerService
    /* JADX INFO: renamed from: j7 */
    public void mo34982j7(Context context, User user, ImageView imageView, boolean z, boolean z2) {
        VipNewUtils.m57514k(context, user, imageView, z2);
    }

    @Override // com.p046p1.mobile.putong.core.biz.service.CoreMemberInnerService
    /* JADX INFO: renamed from: jn */
    public int mo34983jn() {
        return b3c0.f73137q6;
    }

    @Override // com.p046p1.mobile.putong.core.biz.service.CoreMemberInnerService
    /* JADX INFO: renamed from: lg */
    public Frag mo34984lg() {
        return new SupremePartnerTabFrag();
    }

    @Override // com.p046p1.mobile.putong.core.biz.service.CoreMemberInnerService
    /* JADX INFO: renamed from: li */
    public void mo34985li(@NonNull Context context, String str, boolean z) {
        context.startActivity(LikersAct.m56545Y1(context, str, z));
    }

    @Override // com.p046p1.mobile.putong.core.biz.service.CoreMemberInnerService
    /* JADX INFO: renamed from: o7 */
    public void mo34986o7(Context context, User user, ImageView imageView, boolean z, boolean z2) {
        VipNewUtils.m57515l(context, user, imageView, z, z2);
    }

    @Override // com.p046p1.mobile.putong.core.biz.service.CoreMemberInnerService
    /* JADX INFO: renamed from: ro */
    public void mo34987ro(User user, ImageView imageView) {
        VipNewUtils.m57517n(user, imageView);
    }

    @Override // com.p046p1.mobile.putong.core.biz.service.CoreMemberInnerService
    /* JADX INFO: renamed from: ul */
    public int mo34988ul() {
        return VipNewUtils.m57509f();
    }

    @Override // com.p046p1.mobile.putong.core.biz.service.CoreMemberInnerService
    /* JADX INFO: renamed from: vr */
    public void mo34989vr(Act act, User user, boolean z, @Nullable e30<Boolean> e30Var, String str) {
        h120.INSTANCE.m129018p(act, user, z, e30Var, str);
    }

    @Override // com.p046p1.mobile.putong.core.biz.service.CoreMemberInnerService
    /* JADX INFO: renamed from: wq */
    public boolean mo34990wq() {
        return lac0.m149136m();
    }

    @Override // com.p046p1.mobile.putong.core.biz.service.CoreMemberInnerService
    /* JADX INFO: renamed from: x6 */
    public int mo34991x6() {
        return C16319da.INSTANCE.m110509j();
    }

    @Override // com.p046p1.mobile.putong.core.biz.service.CoreMemberInnerService
    /* JADX INFO: renamed from: yb */
    public String mo34992yb(Context context) {
        return VipNewUtils.m57508e(context);
    }
}
