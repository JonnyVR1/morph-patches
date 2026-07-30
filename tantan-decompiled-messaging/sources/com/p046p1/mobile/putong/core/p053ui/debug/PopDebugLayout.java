package com.p046p1.mobile.putong.core.p053ui.debug;

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
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.android.p048ui.bubble.C4345a;
import com.p046p1.mobile.android.p048ui.bubble.C4348d;
import com.p046p1.mobile.android.p048ui.pushbubble.SimplePushBubble;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.api.C4732c;
import com.p046p1.mobile.putong.core.data.ActionData;
import com.p046p1.mobile.putong.core.data.ActionToastStyle;
import com.p046p1.mobile.putong.core.data.ActionToastStyleButton;
import com.p046p1.mobile.putong.core.data.ActionToastStyleIcons;
import com.p046p1.mobile.putong.core.data.QuickChatCardWrapper;
import com.p046p1.mobile.putong.core.data.SwipeDirection;
import com.p046p1.mobile.putong.core.newui.home.ViewTreeObserverOnGlobalLayoutListenerC7866b;
import com.p046p1.mobile.putong.core.newui.home.base.impl.swipe.C7926u;
import com.p046p1.mobile.putong.core.newui.main.NewMainAct;
import com.p046p1.mobile.putong.core.p053ui.debug.PopDebugLayout;
import com.p046p1.mobile.putong.core.p053ui.onlinematch.OnlineMatchManager;
import com.p046p1.mobile.putong.core.p053ui.onlinematch.OnlineMatchPushUser;
import com.p046p1.mobile.putong.core.p053ui.poplevel.CorePopLevel;
import com.p046p1.mobile.putong.core.p053ui.vip.picks.PicksHelper;
import com.p046p1.mobile.putong.data.PushMessage;
import com.p046p1.mobile.putong.data.PushMessageCustom;
import com.p046p1.mobile.putong.data.Tag;
import com.p046p1.mobile.putong.newui.main.base.TabName;
import com.p046p1.mobile.putong.p049ab.IntlCountryCodeController;
import com.tencent.connect.common.Constants;
import java.util.ArrayList;
import p147v.VIcon;
import p149l.ae70;
import p149l.b3c0;
import p149l.h7j;
import p149l.hdb0;
import p149l.ic80;
import p149l.j760;
import p149l.k6c0;
import p149l.o7r;
import p149l.qug0;
import p149l.qyb0;
import p149l.rxg0;
import p149l.t100;
import p149l.vwb;
import p149l.w9j;
import p149l.x4c0;
import p149l.xdl0;
import p149l.xl4;
import p149l.xzc0;

/* JADX INFO: loaded from: classes10.dex */
public class PopDebugLayout extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public Button f28871a;

    /* JADX INFO: renamed from: b */
    public Button f28872b;

    /* JADX INFO: renamed from: c */
    public Button f28873c;

    /* JADX INFO: renamed from: d */
    public Button f28874d;

    /* JADX INFO: renamed from: e */
    public Button f28875e;

    /* JADX INFO: renamed from: f */
    public Button f28876f;

    /* JADX INFO: renamed from: g */
    public Button f28877g;

    /* JADX INFO: renamed from: h */
    public Button f28878h;

    /* JADX INFO: renamed from: i */
    public Button f28879i;

    /* JADX INFO: renamed from: j */
    public Button f28880j;

    /* JADX INFO: renamed from: k */
    public Button f28881k;

    /* JADX INFO: renamed from: l */
    public Button f28882l;

    /* JADX INFO: renamed from: m */
    public Button f28883m;

    /* JADX INFO: renamed from: n */
    public Button f28884n;

    /* JADX INFO: renamed from: o */
    public Button f28885o;

    /* JADX INFO: renamed from: p */
    public Button f28886p;

    /* JADX INFO: renamed from: q */
    public ViewTreeObserverOnGlobalLayoutListenerC7866b f28887q;

    public PopDebugLayout(@NonNull Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ Tag m44904d(String str) {
        return new Tag(null, str);
    }

    /* JADX INFO: renamed from: i */
    public static /* synthetic */ void m44909i(View view) {
        PushMessageCustom pushMessageCustomNew_ = PushMessageCustom.new_();
        pushMessageCustomNew_.userId = CoreModule.m29931H().userId();
        CoreModule.f17545c.f19571H1.m201064W3(pushMessageCustomNew_, false);
    }

    /* JADX INFO: renamed from: n */
    public static /* synthetic */ void m44914n(String str) {
    }

    /* JADX INFO: renamed from: t */
    public static /* synthetic */ Tag m44920t(String str) {
        return new Tag(null, str);
    }

    /* JADX INFO: renamed from: A */
    public final /* synthetic */ void m44923A(View view) {
        NewMainAct newMainActAct = this.f28887q.act();
        View viewInflate = o7r.m163037a(newMainActAct).inflate(k6c0.f121452z1, (ViewGroup) null);
        ((TextView) viewInflate.findViewById(x4c0.f190980O)).setText("我是高权限");
        ((VIcon) viewInflate.findViewById(x4c0.f190972G)).setImageResource(IntlCountryCodeController.m28126v() ? b3c0.f73080j5 : b3c0.f73072i5);
        hdb0.m130575c().m130582i(new SimplePushBubble.C4372a(newMainActAct, viewInflate).m21164B(1).m21171u("BUBBLE_SUPERLIKE_PUSH_ID").m21172v("BUBBLE_SUPERLIKE_PUSH_ID").m21163A(3).m21176z(CorePopLevel.SUPER_LIKE_SEND).m21169s());
    }

    /* JADX INFO: renamed from: B */
    public final /* synthetic */ void m44924B(View view) {
        NewMainAct newMainActAct = this.f28887q.act();
        View viewInflate = o7r.m163037a(newMainActAct).inflate(k6c0.f121452z1, (ViewGroup) null);
        ((TextView) viewInflate.findViewById(x4c0.f190980O)).setText("我是系统权限");
        ((VIcon) viewInflate.findViewById(x4c0.f190972G)).setImageResource(IntlCountryCodeController.m28126v() ? b3c0.f73080j5 : b3c0.f73072i5);
        hdb0.m130575c().m130582i(new SimplePushBubble.C4372a(newMainActAct, viewInflate).m21164B(1).m21171u("BUBBLE_SUPERLIKE_PUSH_ID").m21172v("BUBBLE_SUPERLIKE_PUSH_ID").m21163A(5).m21176z(CorePopLevel.PERMISSION_REQUEST_TEST).m21169s());
    }

    /* JADX INFO: renamed from: C */
    public final /* synthetic */ void m44925C(View view) {
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
        this.f28887q.m37366v2().m161085A8(pushMessageNew_);
    }

    /* JADX INFO: renamed from: D */
    public final /* synthetic */ void m44926D(View view) {
        m44940R(false);
    }

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ void m44927E() {
        m44939Q(false);
    }

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ void m44928F(View view) {
        view.postDelayed(new Runnable() { // from class: l.vb80
            @Override // java.lang.Runnable
            public final void run() {
                this.f180822a.m44927E();
            }
        }, 1500L);
    }

    /* JADX INFO: renamed from: G */
    public final /* synthetic */ void m44929G(View view) {
        m44940R(true);
    }

    /* JADX INFO: renamed from: H */
    public final /* synthetic */ void m44930H() {
        m44939Q(true);
    }

    /* JADX INFO: renamed from: I */
    public final /* synthetic */ void m44931I(View view) {
        view.postDelayed(new Runnable() { // from class: l.ub80
            @Override // java.lang.Runnable
            public final void run() {
                this.f175675a.m44930H();
            }
        }, 1500L);
    }

    /* JADX INFO: renamed from: J */
    public final /* synthetic */ void m44932J(View view) {
        PicksHelper.m56726o(this.f28887q.act(), CoreModule.f17545c.f19639e0.m169527p9(), false);
    }

    /* JADX INFO: renamed from: K */
    public final /* synthetic */ void m44933K(View view) {
        ae70 ae70Var = new ae70(this.f28887q.act(), CoreModule.f17545c.f19639e0.m169527p9(), SwipeDirection.UP);
        ae70Var.m96808x(CorePopLevel.PICKS_GUIDE);
        hdb0.m130575c().m130582i(ae70Var);
    }

    /* JADX INFO: renamed from: L */
    public final /* synthetic */ void m44934L(View view) {
        m44935M();
    }

    /* JADX INFO: renamed from: N */
    public final /* synthetic */ void m44936N(View view) {
        view.postDelayed(new Runnable() { // from class: l.yb80
            @Override // java.lang.Runnable
            public final void run() {
                this.f197314a.m44935M();
            }
        }, 4000L);
    }

    /* JADX INFO: renamed from: O */
    public final /* synthetic */ void m44937O(View view) {
        C7926u c7926u = new C7926u();
        c7926u.f22053a.put(0);
        c7926u.f22054b.put(0L);
        h7j.m129731o();
        h7j.m129716a0(CoreModule.m29932K().me_(), this.f28887q.act(), null, "swipe_card");
    }

    /* JADX INFO: renamed from: P */
    public final /* synthetic */ void m44938P(View view) {
        C4345a c4345a = new C4345a(this.f28887q.act());
        C4348d.m20896l().m20900k("FAKE_SWIPE_COUNT_TIPS");
        c4345a.m20847B(t100.m186890d(2.0f)).m20849D("剩余划卡次数10次").m20870k(Color.parseColor("#fe7e1d")).m20871l(t100.m186890d(7.0f)).m20874p(75).m20855J(13.0f).m20882x(t100.m186890d(5.0f)).m20873o(C4345a.f15681O, t100.m186890d(10.0f)).m20880v(t100.m186890d(7.0f)).m20864e(true).m20863d(new C4345a.b() { // from class: l.wb80
            @Override // com.p046p1.mobile.android.p048ui.bubble.C4345a.b
            /* JADX INFO: renamed from: a */
            public final void mo20885a(String str) {
                PopDebugLayout.m44914n(str);
            }
        }).m20861b(8000L).m20875q(C4345a.f15684R | C4345a.f15683Q);
        C4348d.m20896l().m20909u(c4345a, this.f28887q.act().m39797X5(TabName.Card), "FAKE_SWIPE_COUNT_TIPS");
    }

    /* JADX INFO: renamed from: Q */
    public final void m44939Q(boolean z) {
        OnlineMatchPushUser onlineMatchPushUser = new OnlineMatchPushUser();
        onlineMatchPushUser.name = "重生的小胖子";
        onlineMatchPushUser.userId = "349281368";
        CoreModule.f17545c.f19639e0.m169527p9().m60124fp().profileMiddle().formatted();
        onlineMatchPushUser.avatarUrl = "https://auto.tancdn.com/v1/images/eyJpZCI6Ikk2MlRQNldBSVFaM1ZRRFRPU01FSFdIS043Nk5RUTA0IiwidyI6MTk2MCwiaCI6MTk1OSwiZCI6MCwibXQiOiJpbWFnZS9qcGVnIiwiZGgiOjYxNzE0NDg5Nzk1MzUzMzg2ODAsImFiIjowfQ.jpg?format=128x128";
        onlineMatchPushUser.action = "";
        onlineMatchPushUser.gender = "female";
        onlineMatchPushUser.age = Constants.VIA_REPORT_TYPE_SHARE_TO_QQ;
        onlineMatchPushUser.distance = 100;
        onlineMatchPushUser.userTagList = vwb.m200304R(new String[]{"唱各萨达多个", "喜欢广场舞", "喜欢哈哈哈"}, new w9j() { // from class: l.zb80
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return PopDebugLayout.m44920t((String) obj);
            }
        });
        C4732c c4732c = CoreModule.f17545c;
        onlineMatchPushUser.user = c4732c.f19639e0.m169430Pa(c4732c.f19663m0.f19394a0.m221515e().loaded.get(z ? 2 : 1).f19472id);
        if (!z) {
            OnlineMatchManager.m50143z().f32594I.onNext(new j760<>("tickets_broadcast", onlineMatchPushUser));
        } else {
            qyb0.m177035N((Act) this.f28886p.getContext(), onlineMatchPushUser.user);
            OnlineMatchManager.m50143z().f32594I.onNext(new j760<>("pei_liao_broadcast", onlineMatchPushUser));
        }
    }

    /* JADX INFO: renamed from: R */
    public final void m44940R(boolean z) {
        OnlineMatchPushUser onlineMatchPushUser = new OnlineMatchPushUser();
        onlineMatchPushUser.name = "重生的小胖子";
        onlineMatchPushUser.userId = "349281368";
        CoreModule.f17545c.f19639e0.m169527p9().m60124fp().profileMiddle().formatted();
        onlineMatchPushUser.avatarUrl = "https://auto.tancdn.com/v1/images/eyJpZCI6Ikk2MlRQNldBSVFaM1ZRRFRPU01FSFdIS043Nk5RUTA0IiwidyI6MTk2MCwiaCI6MTk1OSwiZCI6MCwibXQiOiJpbWFnZS9qcGVnIiwiZGgiOjYxNzE0NDg5Nzk1MzUzMzg2ODAsImFiIjowfQ.jpg?format=128x128";
        onlineMatchPushUser.action = "";
        onlineMatchPushUser.gender = "female";
        onlineMatchPushUser.age = Constants.VIA_REPORT_TYPE_SHARE_TO_QQ;
        onlineMatchPushUser.distance = 100;
        onlineMatchPushUser.userTagList = vwb.m200304R(new String[]{"唱各萨达多个", "喜欢广场舞", "喜欢哈哈哈"}, new w9j() { // from class: l.tb80
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return PopDebugLayout.m44904d((String) obj);
            }
        });
        QuickChatCardWrapper quickChatCardWrapper = new QuickChatCardWrapper(onlineMatchPushUser);
        if (z) {
            quickChatCardWrapper.cardType = 3;
        }
        if (CoreModule.f17545c.f19663m0.f19394a0.m221515e().loaded.size() < 1) {
            return;
        }
        C4732c c4732c = CoreModule.f17545c;
        onlineMatchPushUser.user = c4732c.f19639e0.m169430Pa(c4732c.f19663m0.f19394a0.m221515e().loaded.get(1).f19472id);
        CoreModule.f17545c.f19558D0.f20131V.put(0);
        xzc0.m211974x0().m211975B0(this.f28887q.act(), quickChatCardWrapper);
    }

    /* JADX INFO: renamed from: S, reason: merged with bridge method [inline-methods] */
    public final void m44935M() {
        ActionToastStyle actionToastStyle = new ActionToastStyle();
        actionToastStyle.styleId = "1";
        ActionToastStyleIcons actionToastStyleIcons = new ActionToastStyleIcons();
        actionToastStyleIcons.miniIcon = "online";
        actionToastStyle.icons = actionToastStyleIcons;
        actionToastStyle.toastLink = "tantanapp://sendMessage?uid=137071&msg=早上好";
        actionToastStyle.mainImg = CoreModule.f17545c.f19639e0.m169527p9().m60124fp().url;
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
        qug0.m176610g().m176617k(this.f28887q, actionDataNew_);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m44942w(this);
        m44943x();
    }

    public void setMainViewModel(ViewTreeObserverOnGlobalLayoutListenerC7866b viewTreeObserverOnGlobalLayoutListenerC7866b) {
        this.f28887q = viewTreeObserverOnGlobalLayoutListenerC7866b;
    }

    /* JADX INFO: renamed from: w */
    public final void m44942w(View view) {
        ic80.m135350a(this, view);
    }

    /* JADX INFO: renamed from: x */
    public final void m44943x() {
        xdl0.m208329E0(this.f28871a, new View.OnClickListener() { // from class: l.mb80
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f132996a.m44944y(view);
            }
        });
        xdl0.m208329E0(this.f28875e, new View.OnClickListener() { // from class: l.fc80
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f96778a.m44945z(view);
            }
        });
        xdl0.m208329E0(this.f28877g, new View.OnClickListener() { // from class: l.gc80
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f101997a.m44932J(view);
            }
        });
        xdl0.m208329E0(this.f28876f, new View.OnClickListener() { // from class: l.hc80
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f107034a.m44933K(view);
            }
        });
        xdl0.m208329E0(this.f28878h, new View.OnClickListener() { // from class: l.nb80
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f138019a.m44934L(view);
            }
        });
        xdl0.m208329E0(this.f28879i, new View.OnClickListener() { // from class: l.ob80
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f142892a.m44936N(view);
            }
        });
        xdl0.m208329E0(this.f28880j, new View.OnClickListener() { // from class: l.pb80
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f148069a.m44937O(view);
            }
        });
        xdl0.m208329E0(this.f28881k, new View.OnClickListener() { // from class: l.qb80
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f153631a.m44938P(view);
            }
        });
        xdl0.m208329E0(this.f28882l, new View.OnClickListener() { // from class: l.rb80
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                PopDebugLayout.m44909i(view);
            }
        });
        xdl0.m208329E0(this.f28872b, new View.OnClickListener() { // from class: l.sb80
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f163509a.m44923A(view);
            }
        });
        xdl0.m208329E0(this.f28873c, new View.OnClickListener() { // from class: l.xb80
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f191934a.m44924B(view);
            }
        });
        xdl0.m208329E0(this.f28874d, new View.OnClickListener() { // from class: l.ac80
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f68783a.m44925C(view);
            }
        });
        xdl0.m208329E0(this.f28883m, new View.OnClickListener() { // from class: l.bc80
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f74903a.m44926D(view);
            }
        });
        xdl0.m208329E0(this.f28884n, new View.OnClickListener() { // from class: l.cc80
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f80213a.m44928F(view);
            }
        });
        xdl0.m208329E0(this.f28885o, new View.OnClickListener() { // from class: l.dc80
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f85372a.m44929G(view);
            }
        });
        xdl0.m208329E0(this.f28886p, new View.OnClickListener() { // from class: l.ec80
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f90480a.m44931I(view);
            }
        });
    }

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ void m44944y(View view) {
        rxg0.m181562L(this.f28887q.act());
    }

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ void m44945z(View view) {
        xl4.m209842a(this.f28887q.act());
    }

    public PopDebugLayout(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public PopDebugLayout(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
