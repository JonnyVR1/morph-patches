package com.p046p1.mobile.putong.core.newui.home.base.impl.swipe;

import android.content.DialogInterface;
import android.text.TextUtils;
import androidx.appcompat.app.DialogInterfaceC0074a;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.api.CoreSuggested;
import com.p046p1.mobile.putong.core.card.VSwipeStack;
import com.p046p1.mobile.putong.core.data.SwipeDirection;
import com.p046p1.mobile.putong.core.data.VerificationCenter;
import com.p046p1.mobile.putong.core.data.VirtualCardType;
import com.p046p1.mobile.putong.core.newui.home.base.impl.swipe.C7874b;
import com.p046p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import java.util.Collection;
import p149l.az50;
import p149l.c4g0;
import p149l.dd80;
import p149l.e30;
import p149l.j760;
import p149l.mkd0;
import p149l.mqi0;
import p149l.upa;
import p149l.vwb;
import p149l.wn90;
import p149l.x2c0;

/* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.home.base.impl.swipe.b */
/* JADX INFO: loaded from: classes11.dex */
public class C7874b extends AbstractC7871a {

    /* JADX INFO: renamed from: g */
    public DialogInterfaceC0074a f22060g;

    /* JADX INFO: renamed from: h */
    public c4g0 f22061h;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: p */
    public static /* synthetic */ void m37520p(j760 j760Var) {
        if (((Integer) j760Var.f116565b).intValue() <= 0 || vwb.m200296J((Collection) j760Var.f116564a)) {
            return;
        }
        CoreSuggested.UserInfo userInfo = new CoreSuggested.UserInfo();
        userInfo.virtualCardType = VirtualCardType.QuestionOfNotVerify;
        userInfo.f19472id = CoreSuggested.UserInfo.VIRTUAL_CARD;
        userInfo.preSwipedDirection = SwipeDirection.LEFT;
        CoreModule.f17545c.f19663m0.m31154w6(userInfo, 0);
    }

    /* JADX INFO: renamed from: u */
    public static /* synthetic */ void m37525u(Throwable th) {
    }

    /* JADX INFO: renamed from: A */
    public final /* synthetic */ void m37527A(Act act) {
        wn90.m204632w0(act);
        this.f22061h = act.duringCreated(CoreModule.f17545c.f19552B0.m31611j4()).subscribe(mkd0.m154955G(new e30() { // from class: l.qq4
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f155863a.m37535z((VerificationCenter) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: B */
    public final /* synthetic */ void m37528B(Act act) {
        this.f22060g.dismiss();
        if (upa.m194629E2()) {
            act.duringCreated(CoreModule.f17545c.f19552B0.m31597U3()).subscribe(mkd0.m154956H(new e30() { // from class: l.oq4
                @Override // p149l.e30
                public final void call(Object obj) {
                    C7874b.m37520p((j760) obj);
                }
            }, new e30() { // from class: l.pq4
                @Override // p149l.e30
                public final void call(Object obj) {
                    C7874b.m37525u((Throwable) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: C */
    public final /* synthetic */ void m37529C(DialogInterface dialogInterface) {
        mkd0.m154992z(this.f22061h);
    }

    @Override // p149l.p3m
    /* JADX INFO: renamed from: D, reason: merged with bridge method [inline-methods] */
    public boolean mo37498b(C7898j.a aVar) {
        return !mqi0.m155928C(CoreModule.f17545c.f19663m0.f19357M1.get().longValue(), mqi0.m155944o()) && !wn90.m204602F().m204649W() && NullChecker.m81303a(aVar) && NullChecker.m81303a(aVar.f22096c) && NullChecker.m81303a(aVar.f22096c.m141746e()) && m37533x(aVar.f22096c.m141746e()) && m37511k(aVar);
    }

    /* JADX INFO: renamed from: E */
    public void m37531E(final Act act, User user) {
        String str = (!NullChecker.m81303a(user) || user.isFemale()) ? "她" : "他";
        dd80 dd80VarM110960O = act.newDialog().m110964S(upa.m194847z() ? x2c0.f190716xh : x2c0.f189212Bq).m110996y0("认证后，" + str + "才能收到你的喜欢").m110991t0(str.concat("设置了仅看认证用户，30秒快速完成认证")).m110974c0("去认证", new Runnable() { // from class: l.kq4
            @Override // java.lang.Runnable
            public final void run() {
                this.f124221a.m37527A(act);
            }
        }).m110975d0(upa.m194847z() ? x2c0.f189655Q : -1).m110969X("取消", new Runnable() { // from class: l.lq4
            @Override // java.lang.Runnable
            public final void run() {
                this.f129290a.m37528B(act);
            }
        }).m110985n0(new DialogInterface.OnDismissListener() { // from class: l.mq4
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                this.f135163a.m37529C(dialogInterface);
            }
        }).m110961P(false).m110958M(false).m110986o0(new DialogInterface.OnShowListener() { // from class: l.nq4
            @Override // android.content.DialogInterface.OnShowListener
            public final void onShow(DialogInterface dialogInterface) {
                CoreModule.f17545c.f19663m0.f19357M1.put(Long.valueOf(mqi0.m155944o()));
            }
        }).m110960O();
        this.f22060g = dd80VarM110960O;
        dd80VarM110960O.show();
    }

    @Override // p149l.p3m
    /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
    public VSwipeStack.OnCardSwipeResult mo37497a(C7898j.a aVar) {
        m37531E(aVar.f22095b.act(), CoreModule.f17545c.f19639e0.m169524oa(aVar.f22096c.m141748g()));
        return VSwipeStack.OnCardSwipeResult.back;
    }

    /* JADX INFO: renamed from: x */
    public boolean m37533x(CoreSuggested.UserInfo userInfo) {
        return (!upa.m194723Z2() || m37534y(userInfo) || userInfo.isShowFakePhotoFeedback || !userInfo.isShowOnlyLookingAuthentication() || TextUtils.equals(userInfo.payCardStyle, "chat")) ? false : true;
    }

    /* JADX INFO: renamed from: y */
    public final boolean m37534y(CoreSuggested.UserInfo userInfo) {
        return (NullChecker.m81303a(userInfo) && !TextUtils.isEmpty(userInfo.payCardStyle) && "chat".equals(userInfo.payCardStyle)) || az50.INSTANCE.m99631k(userInfo);
    }

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ void m37535z(VerificationCenter verificationCenter) {
        if (wn90.m204602F().m204649W()) {
            this.f22060g.dismiss();
        }
    }
}
