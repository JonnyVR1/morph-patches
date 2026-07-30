package com.p000p1.mobile.putong.core.member.module;

import android.content.Context;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p000p1.mobile.putong.core.data.Privilege;
import com.p000p1.mobile.putong.core.data.PurchaseType;
import com.p000p1.mobile.putong.core.p001ui.diamond.match.ODiamondFakeMatchAct;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.android.app.Frag;
import com.p1.mobile.putong.core.biz.service.CoreMemberInnerService;
import com.p1.mobile.putong.core.newui.customized.PrivateCustomTabFrag;
import com.p1.mobile.putong.core.newui.supreme.hometab.SupremePartnerTabFrag;
import com.p1.mobile.putong.core.newui.youthvip.YouthVipTabFrag;
import com.p1.mobile.putong.core.ui.vip.likers.LikersAct;
import com.p1.mobile.putong.core.ui.vip.privilegeNewUi.VipNewUtils;
import com.p1.mobile.putong.data.User;
import com.tantanapp.android.injecter.facade.annotation.Route;
import l.az50;
import l.d30;
import l.da;
import l.e30;
import l.gr9;
import l.h120;
import l.lac0;
import l.q8p;
import l.rxg0;
import p003l.b3c0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
@Route(name = "CoreMemberInnerService", path = "/member_service/service")
public class CoreMemberServiceImpl implements CoreMemberInnerService {
    /* JADX INFO: renamed from: Do */
    public void m834Do(Act act, String str, String str2) {
        ODiamondFakeMatchAct.m2278a2(act, str, str2);
    }

    /* JADX INFO: renamed from: Fb */
    public void m835Fb() {
        az50.Companion.c();
    }

    /* JADX INFO: renamed from: Fj */
    public int m836Fj() {
        return h120.Companion.h();
    }

    /* JADX INFO: renamed from: Fq */
    public void m837Fq() {
        lac0.i().o();
    }

    /* JADX INFO: renamed from: Hn */
    public Frag m838Hn() {
        return new YouthVipTabFrag();
    }

    /* JADX INFO: renamed from: Hs */
    public int m839Hs() {
        return h120.Companion.i();
    }

    /* JADX INFO: renamed from: Kh */
    public void m840Kh(String str) {
        h120.Companion.n(str);
    }

    /* JADX INFO: renamed from: Pp */
    public Frag m841Pp() {
        return new PrivateCustomTabFrag();
    }

    /* JADX INFO: renamed from: Qo */
    public void m842Qo() {
        q8p.Companion.e();
    }

    /* JADX INFO: renamed from: Se */
    public int m843Se() {
        return h120.Companion.g();
    }

    /* JADX INFO: renamed from: Vh */
    public boolean m844Vh() {
        return gr9.f();
    }

    /* JADX INFO: renamed from: W6 */
    public void m845W6(Frag frag, String str) {
        if (frag instanceof PrivateCustomTabFrag) {
            ((PrivateCustomTabFrag) frag).R4(str);
        }
    }

    /* JADX INFO: renamed from: Xm */
    public int m846Xm() {
        return h120.Companion.j();
    }

    /* JADX INFO: renamed from: Xp */
    public boolean m847Xp(PurchaseType purchaseType) {
        return VipNewUtils.j(purchaseType);
    }

    /* JADX INFO: renamed from: br */
    public void m848br() {
        rxg0.u();
    }

    /* JADX INFO: renamed from: cc */
    public int m849cc() {
        return VipNewUtils.g();
    }

    /* JADX INFO: renamed from: dt */
    public void m850dt(Act act, PurchaseType purchaseType, Privilege privilege, d30 d30Var) {
        VipNewUtils.o(act, purchaseType, privilege, d30Var);
    }

    /* JADX INFO: renamed from: fn */
    public boolean m851fn(String str) {
        return h120.Companion.k(str);
    }

    public void init(Context context) {
    }

    /* JADX INFO: renamed from: j7 */
    public void m852j7(Context context, User user, ImageView imageView, boolean z, boolean z2) {
        VipNewUtils.k(context, user, imageView, z2);
    }

    /* JADX INFO: renamed from: jn */
    public int m853jn() {
        return b3c0.f3240q6;
    }

    /* JADX INFO: renamed from: lg */
    public Frag m854lg() {
        return new SupremePartnerTabFrag();
    }

    /* JADX INFO: renamed from: li */
    public void m855li(@NonNull Context context, String str, boolean z) {
        context.startActivity(LikersAct.Y1(context, str, z));
    }

    /* JADX INFO: renamed from: o7 */
    public void m856o7(Context context, User user, ImageView imageView, boolean z, boolean z2) {
        VipNewUtils.l(context, user, imageView, z, z2);
    }

    /* JADX INFO: renamed from: ro */
    public void m857ro(User user, ImageView imageView) {
        VipNewUtils.n(user, imageView);
    }

    /* JADX INFO: renamed from: ul */
    public int m858ul() {
        return VipNewUtils.f();
    }

    /* JADX INFO: renamed from: vr */
    public void m859vr(Act act, User user, boolean z, @Nullable e30<Boolean> e30Var, String str) {
        h120.Companion.p(act, user, z, e30Var, str);
    }

    /* JADX INFO: renamed from: wq */
    public boolean m860wq() {
        return lac0.m();
    }

    /* JADX INFO: renamed from: x6 */
    public int m861x6() {
        return da.Companion.j();
    }

    /* JADX INFO: renamed from: yb */
    public String m862yb(Context context) {
        return VipNewUtils.e(context);
    }
}
