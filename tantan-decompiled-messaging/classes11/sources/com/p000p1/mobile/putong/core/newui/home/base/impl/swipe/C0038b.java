package com.p000p1.mobile.putong.core.newui.home.base.impl.swipe;

import android.content.DialogInterface;
import android.text.TextUtils;
import androidx.appcompat.app.a;
import com.p000p1.mobile.putong.core.newui.home.base.impl.swipe.C0038b;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.api.CoreSuggested;
import com.p1.mobile.putong.core.card.VSwipeStack;
import com.p1.mobile.putong.core.data.SwipeDirection;
import com.p1.mobile.putong.core.data.VerificationCenter;
import com.p1.mobile.putong.core.data.VirtualCardType;
import com.p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import java.util.Collection;
import l.az50;
import l.c4g0;
import l.dd80;
import l.e30;
import l.j760;
import l.mkd0;
import l.upa;
import l.vwb;
import l.x2c0;
import p009l.mqi0;
import p009l.wn90;

/* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.home.base.impl.swipe.b */
/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class C0038b extends AbstractC0035a {

    /* JADX INFO: renamed from: g */
    public a f838g;

    /* JADX INFO: renamed from: h */
    public c4g0 f839h;

    /* JADX INFO: renamed from: p */
    public static /* synthetic */ void m1491p(j760 j760Var) {
        if (((Integer) j760Var.b).intValue() <= 0 || vwb.J((Collection) j760Var.a)) {
            return;
        }
        CoreSuggested.UserInfo userInfo = new CoreSuggested.UserInfo();
        userInfo.virtualCardType = VirtualCardType.QuestionOfNotVerify;
        userInfo.id = "VirtualCard";
        userInfo.preSwipedDirection = SwipeDirection.LEFT;
        CoreModule.c.m0.w6(userInfo, 0);
    }

    /* JADX INFO: renamed from: u */
    public static /* synthetic */ void m1496u(Throwable th) {
    }

    /* JADX INFO: renamed from: A */
    public final /* synthetic */ void m1498A(Act act) {
        wn90.m24369w0(act);
        this.f839h = act.duringCreated(CoreModule.c.B0.j4()).subscribe(mkd0.G(new e30() { // from class: l.qq4
            public final void call(Object obj) {
                this.f19443a.m1506z((VerificationCenter) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: B */
    public final /* synthetic */ void m1499B(Act act) {
        this.f838g.dismiss();
        if (upa.E2()) {
            act.duringCreated(CoreModule.c.B0.U3()).subscribe(mkd0.H(new e30() { // from class: l.oq4
                public final void call(Object obj) {
                    C0038b.m1491p((j760) obj);
                }
            }, new e30() { // from class: l.pq4
                public final void call(Object obj) {
                    C0038b.m1496u((Throwable) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: C */
    public final /* synthetic */ void m1500C(DialogInterface dialogInterface) {
        mkd0.z(this.f839h);
    }

    @Override // p009l.p3m
    /* JADX INFO: renamed from: D, reason: merged with bridge method [inline-methods] */
    public boolean mo1469b(C0062j.a aVar) {
        return !mqi0.m18534C(((Long) CoreModule.c.m0.M1.get()).longValue(), mqi0.m18550o()) && !wn90.m24339F().m24386W() && NullChecker.a(aVar) && NullChecker.a(aVar.f874c) && NullChecker.a(aVar.f874c.m17131e()) && m1504x(aVar.f874c.m17131e()) && m1482k(aVar);
    }

    /* JADX INFO: renamed from: E */
    public void m1502E(final Act act, User user) {
        String str = (!NullChecker.a(user) || user.isFemale()) ? "她" : "他";
        dd80 dd80VarO = act.newDialog().S(upa.z() ? x2c0.xh : x2c0.Bq).y0("认证后，" + str + "才能收到你的喜欢").t0(str.concat("设置了仅看认证用户，30秒快速完成认证")).c0("去认证", new Runnable() { // from class: l.kq4
            @Override // java.lang.Runnable
            public final void run() {
                this.f15806a.m1498A(act);
            }
        }).d0(upa.z() ? x2c0.Q : -1).X("取消", new Runnable() { // from class: l.lq4
            @Override // java.lang.Runnable
            public final void run() {
                this.f16299a.m1499B(act);
            }
        }).n0(new DialogInterface.OnDismissListener() { // from class: l.mq4
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                this.f17021a.m1500C(dialogInterface);
            }
        }).P(false).M(false).o0(new DialogInterface.OnShowListener() { // from class: l.nq4
            @Override // android.content.DialogInterface.OnShowListener
            public final void onShow(DialogInterface dialogInterface) {
                CoreModule.c.m0.M1.put(Long.valueOf(mqi0.m18550o()));
            }
        }).O();
        this.f838g = dd80VarO;
        dd80VarO.show();
    }

    @Override // p009l.p3m
    /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
    public VSwipeStack.OnCardSwipeResult mo1468a(C0062j.a aVar) {
        m1502E(aVar.f873b.act(), CoreModule.c.e0.oa(aVar.f874c.m17133g()));
        return VSwipeStack.OnCardSwipeResult.back;
    }

    /* JADX INFO: renamed from: x */
    public boolean m1504x(CoreSuggested.UserInfo userInfo) {
        return (!upa.Z2() || m1505y(userInfo) || userInfo.isShowFakePhotoFeedback || !userInfo.isShowOnlyLookingAuthentication() || TextUtils.equals(userInfo.payCardStyle, "chat")) ? false : true;
    }

    /* JADX INFO: renamed from: y */
    public final boolean m1505y(CoreSuggested.UserInfo userInfo) {
        return (NullChecker.a(userInfo) && !TextUtils.isEmpty(userInfo.payCardStyle) && "chat".equals(userInfo.payCardStyle)) || az50.Companion.k(userInfo);
    }

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ void m1506z(VerificationCenter verificationCenter) {
        if (wn90.m24339F().m24386W()) {
            this.f838g.dismiss();
        }
    }
}
