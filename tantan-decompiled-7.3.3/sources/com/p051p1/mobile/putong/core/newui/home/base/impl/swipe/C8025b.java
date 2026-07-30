package com.p051p1.mobile.putong.core.newui.home.base.impl.swipe;

import android.content.DialogInterface;
import android.text.TextUtils;
import androidx.appcompat.app.DialogInterfaceC0075a;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.api.CoreSuggested;
import com.p051p1.mobile.putong.core.card.VSwipeStack;
import com.p051p1.mobile.putong.core.data.SwipeDirection;
import com.p051p1.mobile.putong.core.data.VerificationCenter;
import com.p051p1.mobile.putong.core.data.VirtualCardType;
import com.p051p1.mobile.putong.core.newui.home.base.impl.swipe.C8025b;
import com.p051p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import java.util.Collection;
import p153l.aw90;
import p153l.dbc0;
import p153l.f760;
import p153l.gra;
import p153l.jl80;
import p153l.jyb;
import p153l.kcg0;
import p153l.pf60;
import p153l.psd0;
import p153l.pzi0;
import p153l.y20;

/* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.home.base.impl.swipe.b */
/* JADX INFO: loaded from: classes11.dex */
public class C8025b extends AbstractC8022a {

    /* JADX INFO: renamed from: g */
    public DialogInterfaceC0075a f22802g;

    /* JADX INFO: renamed from: h */
    public kcg0 f22803h;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: p */
    public static /* synthetic */ void m38523p(pf60 pf60Var) {
        if (((Integer) pf60Var.f152157b).intValue() <= 0 || jyb.m147479J((Collection) pf60Var.f152156a)) {
            return;
        }
        CoreSuggested.UserInfo userInfo = new CoreSuggested.UserInfo();
        userInfo.virtualCardType = VirtualCardType.QuestionOfNotVerify;
        userInfo.f20214id = CoreSuggested.UserInfo.VIRTUAL_CARD;
        userInfo.preSwipedDirection = SwipeDirection.LEFT;
        CoreModule.f18264c.f20405m0.m32157w6(userInfo, 0);
    }

    /* JADX INFO: renamed from: u */
    public static /* synthetic */ void m38528u(Throwable th) {
    }

    /* JADX INFO: renamed from: A */
    public final /* synthetic */ void m38530A(Act act) {
        aw90.m100592w0(act);
        this.f22803h = act.duringCreated(CoreModule.f18264c.f20294B0.m32614j4()).subscribe(psd0.m173596G(new y20() { // from class: l.pr4
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f153723a.m38538z((VerificationCenter) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: B */
    public final /* synthetic */ void m38531B(Act act) {
        this.f22802g.dismiss();
        if (gra.m131560E2()) {
            act.duringCreated(CoreModule.f18264c.f20294B0.m32600U3()).subscribe(psd0.m173597H(new y20() { // from class: l.nr4
                @Override // p153l.y20
                public final void call(Object obj) {
                    C8025b.m38523p((pf60) obj);
                }
            }, new y20() { // from class: l.or4
                @Override // p153l.y20
                public final void call(Object obj) {
                    C8025b.m38528u((Throwable) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: C */
    public final /* synthetic */ void m38532C(DialogInterface dialogInterface) {
        psd0.m173633z(this.f22803h);
    }

    @Override // p153l.g6m
    /* JADX INFO: renamed from: D, reason: merged with bridge method [inline-methods] */
    public boolean mo38501b(C8049j.a aVar) {
        return !pzi0.m174438C(CoreModule.f18264c.f20405m0.f20099M1.get().longValue(), pzi0.m174454o()) && !aw90.m100562F().m100609W() && NullChecker.m82486a(aVar) && NullChecker.m82486a(aVar.f22838c) && NullChecker.m82486a(aVar.f22838c.m140260e()) && m38536x(aVar.f22838c.m140260e()) && m38514k(aVar);
    }

    /* JADX INFO: renamed from: E */
    public void m38534E(final Act act, User user) {
        String str = (!NullChecker.m82486a(user) || user.isFemale()) ? "她" : "他";
        jl80 jl80VarM146020O = act.newDialog().m146024S(gra.m131778z() ? dbc0.f87187li : dbc0.f87328pr).m146056y0("认证后，" + str + "才能收到你的喜欢").m146051t0(str.concat("设置了仅看认证用户，30秒快速完成认证")).m146034c0("去认证", new Runnable() { // from class: l.jr4
            @Override // java.lang.Runnable
            public final void run() {
                this.f122305a.m38530A(act);
            }
        }).m146035d0(gra.m131778z() ? dbc0.f86520R : -1).m146029X("取消", new Runnable() { // from class: l.kr4
            @Override // java.lang.Runnable
            public final void run() {
                this.f128412a.m38531B(act);
            }
        }).m146045n0(new DialogInterface.OnDismissListener() { // from class: l.lr4
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                this.f133289a.m38532C(dialogInterface);
            }
        }).m146021P(false).m146018M(false).m146046o0(new DialogInterface.OnShowListener() { // from class: l.mr4
            @Override // android.content.DialogInterface.OnShowListener
            public final void onShow(DialogInterface dialogInterface) {
                CoreModule.f18264c.f20405m0.f20099M1.put(Long.valueOf(pzi0.m174454o()));
            }
        }).m146020O();
        this.f22802g = jl80VarM146020O;
        jl80VarM146020O.show();
    }

    @Override // p153l.g6m
    /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
    public VSwipeStack.OnCardSwipeResult mo38500a(C8049j.a aVar) {
        m38534E(aVar.f22837b.act(), CoreModule.f18264c.f20381e0.m116597oa(aVar.f22838c.m140262g()));
        return VSwipeStack.OnCardSwipeResult.back;
    }

    /* JADX INFO: renamed from: x */
    public boolean m38536x(CoreSuggested.UserInfo userInfo) {
        return (!gra.m131654Z2() || m38537y(userInfo) || userInfo.isShowFakePhotoFeedback || !userInfo.isShowOnlyLookingAuthentication() || TextUtils.equals(userInfo.payCardStyle, "chat")) ? false : true;
    }

    /* JADX INFO: renamed from: y */
    public final boolean m38537y(CoreSuggested.UserInfo userInfo) {
        return (NullChecker.m82486a(userInfo) && !TextUtils.isEmpty(userInfo.payCardStyle) && "chat".equals(userInfo.payCardStyle)) || f760.INSTANCE.m124364k(userInfo);
    }

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ void m38538z(VerificationCenter verificationCenter) {
        if (aw90.m100562F().m100609W()) {
            this.f22802g.dismiss();
        }
    }
}
