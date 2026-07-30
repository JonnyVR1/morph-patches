package com.p051p1.mobile.putong.core.p058ui.debug;

import android.content.Context;
import android.graphics.Color;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.android.p053ui.bubble.C4496a;
import com.p051p1.mobile.android.p053ui.bubble.C4499d;
import com.p051p1.mobile.android.p053ui.pushbubble.SimplePushBubble;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.api.C4883c;
import com.p051p1.mobile.putong.core.data.ActionData;
import com.p051p1.mobile.putong.core.data.ActionToastStyle;
import com.p051p1.mobile.putong.core.data.ActionToastStyleButton;
import com.p051p1.mobile.putong.core.data.ActionToastStyleIcons;
import com.p051p1.mobile.putong.core.data.QuickChatCardWrapper;
import com.p051p1.mobile.putong.core.data.SwipeDirection;
import com.p051p1.mobile.putong.core.newui.home.ViewTreeObserverOnGlobalLayoutListenerC8017b;
import com.p051p1.mobile.putong.core.newui.home.base.impl.swipe.C8077u;
import com.p051p1.mobile.putong.core.newui.main.NewMainAct;
import com.p051p1.mobile.putong.core.p058ui.debug.PopDebugLayout;
import com.p051p1.mobile.putong.core.p058ui.onlinematch.OnlineMatchManager;
import com.p051p1.mobile.putong.core.p058ui.onlinematch.OnlineMatchPushUser;
import com.p051p1.mobile.putong.core.p058ui.poplevel.CorePopLevel;
import com.p051p1.mobile.putong.core.p058ui.vip.picks.PicksHelper;
import com.p051p1.mobile.putong.data.PushMessage;
import com.p051p1.mobile.putong.data.PushMessageCustom;
import com.p051p1.mobile.putong.data.Tag;
import com.p051p1.mobile.putong.newui.main.base.TabName;
import com.p051p1.mobile.putong.p054ab.IntlCountryCodeController;
import com.tencent.connect.common.Constants;
import java.util.ArrayList;
import p151v.VIcon;
import p153l.a8d0;
import p153l.baj;
import p153l.bnl0;
import p153l.ddc0;
import p153l.gbc0;
import p153l.gm70;
import p153l.jyb;
import p153l.llb0;
import p153l.ok80;
import p153l.p9r;
import p153l.pec0;
import p153l.pf60;
import p153l.qa00;
import p153l.qcj;
import p153l.u6c0;
import p153l.wm4;
import p153l.y2h0;
import p153l.z5h0;

/* JADX INFO: loaded from: classes11.dex */
public class PopDebugLayout extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public Button f29719a;

    /* JADX INFO: renamed from: b */
    public Button f29720b;

    /* JADX INFO: renamed from: c */
    public Button f29721c;

    /* JADX INFO: renamed from: d */
    public Button f29722d;

    /* JADX INFO: renamed from: e */
    public Button f29723e;

    /* JADX INFO: renamed from: f */
    public Button f29724f;

    /* JADX INFO: renamed from: g */
    public Button f29725g;

    /* JADX INFO: renamed from: h */
    public Button f29726h;

    /* JADX INFO: renamed from: i */
    public Button f29727i;

    /* JADX INFO: renamed from: j */
    public Button f29728j;

    /* JADX INFO: renamed from: k */
    public Button f29729k;

    /* JADX INFO: renamed from: l */
    public Button f29730l;

    /* JADX INFO: renamed from: m */
    public Button f29731m;

    /* JADX INFO: renamed from: n */
    public Button f29732n;

    /* JADX INFO: renamed from: o */
    public Button f29733o;

    /* JADX INFO: renamed from: p */
    public Button f29734p;

    /* JADX INFO: renamed from: q */
    public ViewTreeObserverOnGlobalLayoutListenerC8017b f29735q;

    public PopDebugLayout(@NonNull Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ Tag m46087d(String str) {
        return new Tag(null, str);
    }

    /* JADX INFO: renamed from: i */
    public static /* synthetic */ void m46092i(View view) {
        PushMessageCustom pushMessageCustomNew_ = PushMessageCustom.new_();
        pushMessageCustomNew_.userId = CoreModule.m30929H().userId();
        CoreModule.f18264c.f20313H1.m123917W3(pushMessageCustomNew_, false);
    }

    /* JADX INFO: renamed from: n */
    public static /* synthetic */ void m46097n(String str) {
    }

    /* JADX INFO: renamed from: t */
    public static /* synthetic */ Tag m46103t(String str) {
        return new Tag(null, str);
    }

    /* JADX INFO: renamed from: A */
    public final /* synthetic */ void m46106A(View view) {
        NewMainAct newMainActAct = this.f29735q.act();
        View viewInflate = p9r.m171370a(newMainActAct).inflate(pec0.f152060z1, (ViewGroup) null);
        ((TextView) viewInflate.findViewById(ddc0.f87885O)).setText("我是高权限");
        ((VIcon) viewInflate.findViewById(ddc0.f87877G)).setImageResource(IntlCountryCodeController.m29125v() ? gbc0.f103331j5 : gbc0.f103323i5);
        llb0.m154703c().m154710i(new SimplePushBubble.C4523a(newMainActAct, viewInflate).m22163B(1).m22170u("BUBBLE_SUPERLIKE_PUSH_ID").m22171v("BUBBLE_SUPERLIKE_PUSH_ID").m22162A(3).m22175z(CorePopLevel.SUPER_LIKE_SEND).m22168s());
    }

    /* JADX INFO: renamed from: B */
    public final /* synthetic */ void m46107B(View view) {
        NewMainAct newMainActAct = this.f29735q.act();
        View viewInflate = p9r.m171370a(newMainActAct).inflate(pec0.f152060z1, (ViewGroup) null);
        ((TextView) viewInflate.findViewById(ddc0.f87885O)).setText("我是系统权限");
        ((VIcon) viewInflate.findViewById(ddc0.f87877G)).setImageResource(IntlCountryCodeController.m29125v() ? gbc0.f103331j5 : gbc0.f103323i5);
        llb0.m154703c().m154710i(new SimplePushBubble.C4523a(newMainActAct, viewInflate).m22163B(1).m22170u("BUBBLE_SUPERLIKE_PUSH_ID").m22171v("BUBBLE_SUPERLIKE_PUSH_ID").m22162A(5).m22175z(CorePopLevel.PERMISSION_REQUEST_TEST).m22168s());
    }

    /* JADX INFO: renamed from: C */
    public final /* synthetic */ void m46108C(View view) {
        PushMessage pushMessageNew_ = PushMessage.new_();
        PushMessageCustom pushMessageCustomNew_ = PushMessageCustom.new_();
        pushMessageNew_.messageCustom = pushMessageCustomNew_;
        pushMessageCustomNew_.liveId = "5908440";
        pushMessageCustomNew_.title = "主播昵称显示";
        pushMessageCustomNew_.content = "好久不见，为你准备了一份礼包";
        pushMessageCustomNew_.extra = "popExperimentStyle3";
        pushMessageCustomNew_.buttonText = "去领取";
        pushMessageCustomNew_.type = "popExperimentStyleA";
        pushMessageCustomNew_.subTitle = "你的好友";
        pushMessageCustomNew_.state = "super_like";
        pushMessageCustomNew_.avatars = "https://auto.tancdn.com/v1/images/eyJpZCI6IjVCVjZMSlFXQjY1VlJHVlJVWUw1V1pHVkVJUktLSDE0IiwidyI6NzAsImgiOjcwLCJkIjowLCJtdCI6ImltYWdlL2pwZWciLCJkaCI6NjU2OTU0MDU3ODAyMzEyMjczOX0.png";
        pushMessageCustomNew_.tabId = "card,message,moment,me";
        pushMessageNew_.intent = "live.ongoingLive.pinkCard";
        pushMessageCustomNew_.bgImg = "https://fe-static.tancdn.com/v1/images/eyJpZCI6IldIN0lYNDNXNDNEVzNETzZLU1RQVjdGNDNaVzRIRzEyIiwidyI6MTEyNSwiaCI6OTU0LCJkIjowLCJtdCI6ImltYWdlL2pwZWciLCJkaCI6MzYyODM1NjQ2OTc0NTQ0MDcyfQ.png";
        pushMessageCustomNew_.image = "https://auto.tancdn.com/v1/images/eyJpZCI6IjVCVjZMSlFXQjY1VlJHVlJVWUw1V1pHVkVJUktLSDE0IiwidyI6NzAsImgiOjcwLCJkIjowLCJtdCI6ImltYWdlL2pwZWciLCJkaCI6NjU2OTU0MDU3ODAyMzEyMjczOX0.png";
        this.f29735q.m38369v2().m101879A8(pushMessageNew_);
    }

    /* JADX INFO: renamed from: D */
    public final /* synthetic */ void m46109D(View view) {
        m46123R(false);
    }

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ void m46110E() {
        m46122Q(false);
    }

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ void m46111F(View view) {
        view.postDelayed(new Runnable() { // from class: l.bk80
            @Override // java.lang.Runnable
            public final void run() {
                this.f77052a.m46110E();
            }
        }, 1500L);
    }

    /* JADX INFO: renamed from: G */
    public final /* synthetic */ void m46112G(View view) {
        m46123R(true);
    }

    /* JADX INFO: renamed from: H */
    public final /* synthetic */ void m46113H() {
        m46122Q(true);
    }

    /* JADX INFO: renamed from: I */
    public final /* synthetic */ void m46114I(View view) {
        view.postDelayed(new Runnable() { // from class: l.ak80
            @Override // java.lang.Runnable
            public final void run() {
                this.f71973a.m46113H();
            }
        }, 1500L);
    }

    /* JADX INFO: renamed from: J */
    public final /* synthetic */ void m46115J(View view) {
        PicksHelper.m57909o(this.f29735q.act(), CoreModule.f18264c.f20381e0.m116600p9(), false);
    }

    /* JADX INFO: renamed from: K */
    public final /* synthetic */ void m46116K(View view) {
        gm70 gm70Var = new gm70(this.f29735q.act(), CoreModule.f18264c.f20381e0.m116600p9(), SwipeDirection.UP);
        gm70Var.m126745x(CorePopLevel.PICKS_GUIDE);
        llb0.m154703c().m154710i(gm70Var);
    }

    /* JADX INFO: renamed from: L */
    public final /* synthetic */ void m46117L(View view) {
        m46118M();
    }

    /* JADX INFO: renamed from: N */
    public final /* synthetic */ void m46119N(View view) {
        view.postDelayed(new Runnable() { // from class: l.ek80
            @Override // java.lang.Runnable
            public final void run() {
                this.f94348a.m46118M();
            }
        }, 4000L);
    }

    /* JADX INFO: renamed from: O */
    public final /* synthetic */ void m46120O(View view) {
        C8077u c8077u = new C8077u();
        c8077u.f22795a.put(0);
        c8077u.f22796b.put(0L);
        baj.m103202o();
        baj.m103187a0(CoreModule.m30930K().me_(), this.f29735q.act(), null, "swipe_card");
    }

    /* JADX INFO: renamed from: P */
    public final /* synthetic */ void m46121P(View view) {
        C4496a c4496a = new C4496a(this.f29735q.act());
        C4499d.m21895l().m21899k("FAKE_SWIPE_COUNT_TIPS");
        c4496a.m21846B(qa00.m175859d(2.0f)).m21848D("剩余划卡次数10次").m21869k(Color.parseColor("#fe7e1d")).m21870l(qa00.m175859d(7.0f)).m21873p(75).m21854J(13.0f).m21881x(qa00.m175859d(5.0f)).m21872o(C4496a.f16400O, qa00.m175859d(10.0f)).m21879v(qa00.m175859d(7.0f)).m21863e(true).m21862d(new C4496a.b() { // from class: l.ck80
            @Override // com.p051p1.mobile.android.p053ui.bubble.C4496a.b
            /* JADX INFO: renamed from: a */
            public final void mo21884a(String str) {
                PopDebugLayout.m46097n(str);
            }
        }).m21860b(8000L).m21874q(C4496a.f16403R | C4496a.f16402Q);
        C4499d.m21895l().m21908u(c4496a, this.f29735q.act().m40807b6(TabName.Card), "FAKE_SWIPE_COUNT_TIPS");
    }

    /* JADX INFO: renamed from: Q */
    public final void m46122Q(boolean z) {
        OnlineMatchPushUser onlineMatchPushUser = new OnlineMatchPushUser();
        onlineMatchPushUser.name = "重生的小胖子";
        onlineMatchPushUser.userId = "349281368";
        CoreModule.f18264c.f20381e0.m116600p9().m61308fp().profileMiddle().formatted();
        onlineMatchPushUser.avatarUrl = "https://auto.tancdn.com/v1/images/eyJpZCI6Ikk2MlRQNldBSVFaM1ZRRFRPU01FSFdIS043Nk5RUTA0IiwidyI6MTk2MCwiaCI6MTk1OSwiZCI6MCwibXQiOiJpbWFnZS9qcGVnIiwiZGgiOjYxNzE0NDg5Nzk1MzUzMzg2ODAsImFiIjowfQ.jpg?format=128x128";
        onlineMatchPushUser.action = "";
        onlineMatchPushUser.gender = "female";
        onlineMatchPushUser.age = Constants.VIA_REPORT_TYPE_SHARE_TO_QQ;
        onlineMatchPushUser.distance = 100;
        onlineMatchPushUser.userTagList = jyb.m147487R(new String[]{"唱各萨达多个", "喜欢广场舞", "喜欢哈哈哈"}, new qcj() { // from class: l.fk80
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return PopDebugLayout.m46103t((String) obj);
            }
        });
        C4883c c4883c = CoreModule.f18264c;
        onlineMatchPushUser.user = c4883c.f20381e0.m116503Pa(c4883c.f20405m0.f20136a0.m222761e().loaded.get(z ? 2 : 1).f20214id);
        if (!z) {
            OnlineMatchManager.m51326z().f33442I.onNext(new pf60<>("tickets_broadcast", onlineMatchPushUser));
        } else {
            u6c0.m194668N((Act) this.f29734p.getContext(), onlineMatchPushUser.user);
            OnlineMatchManager.m51326z().f33442I.onNext(new pf60<>("pei_liao_broadcast", onlineMatchPushUser));
        }
    }

    /* JADX INFO: renamed from: R */
    public final void m46123R(boolean z) {
        OnlineMatchPushUser onlineMatchPushUser = new OnlineMatchPushUser();
        onlineMatchPushUser.name = "重生的小胖子";
        onlineMatchPushUser.userId = "349281368";
        CoreModule.f18264c.f20381e0.m116600p9().m61308fp().profileMiddle().formatted();
        onlineMatchPushUser.avatarUrl = "https://auto.tancdn.com/v1/images/eyJpZCI6Ikk2MlRQNldBSVFaM1ZRRFRPU01FSFdIS043Nk5RUTA0IiwidyI6MTk2MCwiaCI6MTk1OSwiZCI6MCwibXQiOiJpbWFnZS9qcGVnIiwiZGgiOjYxNzE0NDg5Nzk1MzUzMzg2ODAsImFiIjowfQ.jpg?format=128x128";
        onlineMatchPushUser.action = "";
        onlineMatchPushUser.gender = "female";
        onlineMatchPushUser.age = Constants.VIA_REPORT_TYPE_SHARE_TO_QQ;
        onlineMatchPushUser.distance = 100;
        onlineMatchPushUser.userTagList = jyb.m147487R(new String[]{"唱各萨达多个", "喜欢广场舞", "喜欢哈哈哈"}, new qcj() { // from class: l.zj80
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return PopDebugLayout.m46087d((String) obj);
            }
        });
        QuickChatCardWrapper quickChatCardWrapper = new QuickChatCardWrapper(onlineMatchPushUser);
        if (z) {
            quickChatCardWrapper.cardType = 3;
        }
        if (CoreModule.f18264c.f20405m0.f20136a0.m222761e().loaded.size() < 1) {
            return;
        }
        C4883c c4883c = CoreModule.f18264c;
        onlineMatchPushUser.user = c4883c.f20381e0.m116503Pa(c4883c.f20405m0.f20136a0.m222761e().loaded.get(1).f20214id);
        CoreModule.f18264c.f20300D0.f20873V.put(0);
        a8d0.m96437x0().m96438B0(this.f29735q.act(), quickChatCardWrapper);
    }

    /* JADX INFO: renamed from: S, reason: merged with bridge method [inline-methods] */
    public final void m46118M() {
        ActionToastStyle actionToastStyle = new ActionToastStyle();
        actionToastStyle.styleId = "1";
        ActionToastStyleIcons actionToastStyleIcons = new ActionToastStyleIcons();
        actionToastStyleIcons.miniIcon = "online";
        actionToastStyle.icons = actionToastStyleIcons;
        actionToastStyle.toastLink = "tantanapp://sendMessage?uid=137071&msg=早上好";
        actionToastStyle.mainImg = CoreModule.f18264c.f20381e0.m116600p9().m61308fp().url;
        actionToastStyle.title = "林青霞";
        actionToastStyle.message = "当前在线，打个招呼吧";
        actionToastStyle.showClose = false;
        ActionToastStyleButton actionToastStyleButton = new ActionToastStyleButton();
        actionToastStyleButton.showButton = true;
        actionToastStyleButton.buttonMessage = "[爱心]早上好";
        actionToastStyleButton.buttonBackground = "white";
        actionToastStyleButton.buttonLink = "tantanapp://sendMessage?uid=137071&msg=早上好";
        ArrayList arrayList = new ArrayList();
        arrayList.add(actionToastStyleButton);
        actionToastStyle.buttons = arrayList;
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add("swipe");
        arrayList2.add("message");
        arrayList2.add("live");
        arrayList2.add("my");
        actionToastStyle.localReportId = "123456";
        actionToastStyle.scenes = arrayList2;
        actionToastStyle.showTime = 5000;
        actionToastStyle.business = "female_online";
        ActionData actionDataNew_ = ActionData.new_();
        actionDataNew_.toastStyle = actionToastStyle;
        y2h0.m214080g().m214087k(this.f29735q, actionDataNew_);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m46125w(this);
        m46126x();
    }

    public void setMainViewModel(ViewTreeObserverOnGlobalLayoutListenerC8017b viewTreeObserverOnGlobalLayoutListenerC8017b) {
        this.f29735q = viewTreeObserverOnGlobalLayoutListenerC8017b;
    }

    /* JADX INFO: renamed from: w */
    public final void m46125w(View view) {
        ok80.m167986a(this, view);
    }

    /* JADX INFO: renamed from: x */
    public final void m46126x() {
        bnl0.m105509E0(this.f29719a, new View.OnClickListener() { // from class: l.sj80
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f168953a.m46127y(view);
            }
        });
        bnl0.m105509E0(this.f29723e, new View.OnClickListener() { // from class: l.lk80
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f132453a.m46128z(view);
            }
        });
        bnl0.m105509E0(this.f29725g, new View.OnClickListener() { // from class: l.mk80
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f137271a.m46115J(view);
            }
        });
        bnl0.m105509E0(this.f29724f, new View.OnClickListener() { // from class: l.nk80
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f142439a.m46116K(view);
            }
        });
        bnl0.m105509E0(this.f29726h, new View.OnClickListener() { // from class: l.tj80
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f174566a.m46117L(view);
            }
        });
        bnl0.m105509E0(this.f29727i, new View.OnClickListener() { // from class: l.uj80
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f179185a.m46119N(view);
            }
        });
        bnl0.m105509E0(this.f29728j, new View.OnClickListener() { // from class: l.vj80
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f184359a.m46120O(view);
            }
        });
        bnl0.m105509E0(this.f29729k, new View.OnClickListener() { // from class: l.wj80
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f189422a.m46121P(view);
            }
        });
        bnl0.m105509E0(this.f29730l, new View.OnClickListener() { // from class: l.xj80
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                PopDebugLayout.m46092i(view);
            }
        });
        bnl0.m105509E0(this.f29720b, new View.OnClickListener() { // from class: l.yj80
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f200276a.m46106A(view);
            }
        });
        bnl0.m105509E0(this.f29721c, new View.OnClickListener() { // from class: l.dk80
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f88984a.m46107B(view);
            }
        });
        bnl0.m105509E0(this.f29722d, new View.OnClickListener() { // from class: l.gk80
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f104709a.m46108C(view);
            }
        });
        bnl0.m105509E0(this.f29731m, new View.OnClickListener() { // from class: l.hk80
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f110386a.m46109D(view);
            }
        });
        bnl0.m105509E0(this.f29732n, new View.OnClickListener() { // from class: l.ik80
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f115345a.m46111F(view);
            }
        });
        bnl0.m105509E0(this.f29733o, new View.OnClickListener() { // from class: l.jk80
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f121280a.m46112G(view);
            }
        });
        bnl0.m105509E0(this.f29734p, new View.OnClickListener() { // from class: l.kk80
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f127175a.m46114I(view);
            }
        });
    }

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ void m46127y(View view) {
        z5h0.m218665L(this.f29735q.act());
    }

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ void m46128z(View view) {
        wm4.m207090a(this.f29735q.act());
    }

    public PopDebugLayout(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public PopDebugLayout(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
