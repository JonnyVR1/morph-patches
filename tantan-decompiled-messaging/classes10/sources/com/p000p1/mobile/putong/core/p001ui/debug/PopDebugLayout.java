package com.p000p1.mobile.putong.core.p001ui.debug;

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
import com.p000p1.mobile.putong.core.data.ActionData;
import com.p000p1.mobile.putong.core.data.ActionToastStyle;
import com.p000p1.mobile.putong.core.data.ActionToastStyleButton;
import com.p000p1.mobile.putong.core.data.ActionToastStyleIcons;
import com.p000p1.mobile.putong.core.data.PartialListOpt;
import com.p000p1.mobile.putong.core.data.QuickChatCardWrapper;
import com.p000p1.mobile.putong.core.data.SwipeDirection;
import com.p000p1.mobile.putong.core.p001ui.debug.PopDebugLayout;
import com.p1.mobile.android.ui.bubble.d;
import com.p1.mobile.android.ui.pushbubble.SimplePushBubble;
import com.p1.mobile.putong.ab.IntlCountryCodeController;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.api.CoreSuggested;
import com.p1.mobile.putong.core.api.c;
import com.p1.mobile.putong.core.newui.home.b;
import com.p1.mobile.putong.core.newui.home.base.impl.swipe.a;
import com.p1.mobile.putong.core.newui.home.base.impl.swipe.u;
import com.p1.mobile.putong.core.newui.main.NewMainAct;
import com.p1.mobile.putong.core.ui.onlinematch.OnlineMatchManager;
import com.p1.mobile.putong.core.ui.onlinematch.OnlineMatchPushUser;
import com.p1.mobile.putong.core.ui.poplevel.CorePopLevel;
import com.p1.mobile.putong.core.ui.vip.picks.PicksHelper;
import com.p1.mobile.putong.data.Media;
import com.p1.mobile.putong.data.PushMessage;
import com.p1.mobile.putong.data.PushMessageCustom;
import com.p1.mobile.putong.data.Tag;
import com.p1.mobile.putong.newui.main.base.TabName;
import java.util.ArrayList;
import l.ae70;
import l.d30;
import l.h7j;
import l.hdb0;
import l.j760;
import l.o7r;
import l.qug0;
import l.qyb0;
import l.rxg0;
import l.t100;
import l.vwb;
import l.w9j;
import l.xdl0;
import l.xl4;
import l.xzc0;
import p003l.b3c0;
import p003l.ic80;
import p003l.k6c0;
import p003l.x4c0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class PopDebugLayout extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public Button f1265a;

    /* JADX INFO: renamed from: b */
    public Button f1266b;

    /* JADX INFO: renamed from: c */
    public Button f1267c;

    /* JADX INFO: renamed from: d */
    public Button f1268d;

    /* JADX INFO: renamed from: e */
    public Button f1269e;

    /* JADX INFO: renamed from: f */
    public Button f1270f;

    /* JADX INFO: renamed from: g */
    public Button f1271g;

    /* JADX INFO: renamed from: h */
    public Button f1272h;

    /* JADX INFO: renamed from: i */
    public Button f1273i;

    /* JADX INFO: renamed from: j */
    public Button f1274j;

    /* JADX INFO: renamed from: k */
    public Button f1275k;

    /* JADX INFO: renamed from: l */
    public Button f1276l;

    /* JADX INFO: renamed from: m */
    public Button f1277m;

    /* JADX INFO: renamed from: n */
    public Button f1278n;

    /* JADX INFO: renamed from: o */
    public Button f1279o;

    /* JADX INFO: renamed from: p */
    public Button f1280p;

    /* JADX INFO: renamed from: q */
    public b f1281q;

    public PopDebugLayout(@NonNull Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ Tag m2218d(String str) {
        return new Tag((String) null, str);
    }

    /* JADX INFO: renamed from: i */
    public static /* synthetic */ void m2223i(View view) {
        PushMessageCustom pushMessageCustomNew_ = PushMessageCustom.new_();
        pushMessageCustomNew_.userId = CoreModule.H().userId();
        CoreModule.c.H1.W3(pushMessageCustomNew_, false);
    }

    /* JADX INFO: renamed from: n */
    public static /* synthetic */ void m2228n(String str) {
    }

    /* JADX INFO: renamed from: t */
    public static /* synthetic */ Tag m2234t(String str) {
        return new Tag((String) null, str);
    }

    /* JADX INFO: renamed from: A */
    public final /* synthetic */ void m2237A(View view) {
        NewMainAct newMainActK1 = this.f1281q.K1();
        View viewInflate = o7r.a(newMainActK1).inflate(k6c0.f5615z1, (ViewGroup) null);
        ((TextView) viewInflate.findViewById(x4c0.f8321O)).setText("我是高权限");
        viewInflate.findViewById(x4c0.f8313G).setImageResource(IntlCountryCodeController.v() ? b3c0.f3183j5 : b3c0.f3175i5);
        hdb0.c().i(new SimplePushBubble.a(newMainActK1, viewInflate).B(1).u("BUBBLE_SUPERLIKE_PUSH_ID").v("BUBBLE_SUPERLIKE_PUSH_ID").A(3).z(CorePopLevel.SUPER_LIKE_SEND).s());
    }

    /* JADX INFO: renamed from: B */
    public final /* synthetic */ void m2238B(View view) {
        NewMainAct newMainActK1 = this.f1281q.K1();
        View viewInflate = o7r.a(newMainActK1).inflate(k6c0.f5615z1, (ViewGroup) null);
        ((TextView) viewInflate.findViewById(x4c0.f8321O)).setText("我是系统权限");
        viewInflate.findViewById(x4c0.f8313G).setImageResource(IntlCountryCodeController.v() ? b3c0.f3183j5 : b3c0.f3175i5);
        hdb0.c().i(new SimplePushBubble.a(newMainActK1, viewInflate).B(1).u("BUBBLE_SUPERLIKE_PUSH_ID").v("BUBBLE_SUPERLIKE_PUSH_ID").A(5).z(CorePopLevel.PERMISSION_REQUEST_TEST).s());
    }

    /* JADX INFO: renamed from: C */
    public final /* synthetic */ void m2239C(View view) {
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
        this.f1281q.v2().A8(pushMessageNew_);
    }

    /* JADX INFO: renamed from: D */
    public final /* synthetic */ void m2240D(View view) {
        m2254R(false);
    }

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ void m2241E() {
        m2253Q(false);
    }

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ void m2242F(View view) {
        view.postDelayed(new Runnable() { // from class: l.vb80
            @Override // java.lang.Runnable
            public final void run() {
                this.f7966a.m2241E();
            }
        }, 1500L);
    }

    /* JADX INFO: renamed from: G */
    public final /* synthetic */ void m2243G(View view) {
        m2254R(true);
    }

    /* JADX INFO: renamed from: H */
    public final /* synthetic */ void m2244H() {
        m2253Q(true);
    }

    /* JADX INFO: renamed from: I */
    public final /* synthetic */ void m2245I(View view) {
        view.postDelayed(new Runnable() { // from class: l.ub80
            @Override // java.lang.Runnable
            public final void run() {
                this.f7733a.m2244H();
            }
        }, 1500L);
    }

    /* JADX INFO: renamed from: J */
    public final /* synthetic */ void m2246J(View view) {
        PicksHelper.o(this.f1281q.K1(), CoreModule.c.e0.p9(), false);
    }

    /* JADX INFO: renamed from: K */
    public final /* synthetic */ void m2247K(View view) {
        ae70 ae70Var = new ae70(this.f1281q.K1(), CoreModule.c.e0.p9(), SwipeDirection.UP);
        ae70Var.x(CorePopLevel.PICKS_GUIDE);
        hdb0.c().i(ae70Var);
    }

    /* JADX INFO: renamed from: L */
    public final /* synthetic */ void m2248L(View view) {
        m2249M();
    }

    /* JADX INFO: renamed from: N */
    public final /* synthetic */ void m2250N(View view) {
        view.postDelayed(new Runnable() { // from class: l.yb80
            @Override // java.lang.Runnable
            public final void run() {
                this.f9019a.m2249M();
            }
        }, 4000L);
    }

    /* JADX INFO: renamed from: O */
    public final /* synthetic */ void m2251O(View view) {
        u uVar = new u();
        ((a) uVar).a.put(0);
        ((a) uVar).b.put(0L);
        h7j.o();
        h7j.a0(CoreModule.K().me_(), this.f1281q.K1(), (d30) null, "swipe_card");
    }

    /* JADX INFO: renamed from: P */
    public final /* synthetic */ void m2252P(View view) {
        com.p1.mobile.android.ui.bubble.a aVar = new com.p1.mobile.android.ui.bubble.a(this.f1281q.K1());
        d.l().k("FAKE_SWIPE_COUNT_TIPS");
        aVar.B(t100.d(2.0f)).D("剩余划卡次数10次").k(new int[]{Color.parseColor("#fe7e1d")}).l(t100.d(7.0f)).p(75).J(13.0f).x(t100.d(5.0f)).o(com.p1.mobile.android.ui.bubble.a.O, t100.d(10.0f)).v(t100.d(7.0f)).e(true).d(new com.p1.mobile.android.ui.bubble.a.b() { // from class: l.wb80
            /* JADX INFO: renamed from: a */
            public final void m10464a(String str) {
                PopDebugLayout.m2228n(str);
            }
        }).b(8000L).q(com.p1.mobile.android.ui.bubble.a.R | com.p1.mobile.android.ui.bubble.a.Q);
        d.l().u(aVar, this.f1281q.K1().X5(TabName.Card), "FAKE_SWIPE_COUNT_TIPS");
    }

    /* JADX INFO: renamed from: Q */
    public final void m2253Q(boolean z) {
        OnlineMatchPushUser onlineMatchPushUser = new OnlineMatchPushUser();
        onlineMatchPushUser.name = "重生的小胖子";
        onlineMatchPushUser.userId = "349281368";
        CoreModule.c.e0.p9().fp().profileMiddle().formatted();
        onlineMatchPushUser.avatarUrl = "https://auto.tancdn.com/v1/images/eyJpZCI6Ikk2MlRQNldBSVFaM1ZRRFRPU01FSFdIS043Nk5RUTA0IiwidyI6MTk2MCwiaCI6MTk1OSwiZCI6MCwibXQiOiJpbWFnZS9qcGVnIiwiZGgiOjYxNzE0NDg5Nzk1MzUzMzg2ODAsImFiIjowfQ.jpg?format=128x128";
        onlineMatchPushUser.action = "";
        onlineMatchPushUser.gender = "female";
        onlineMatchPushUser.age = "10";
        onlineMatchPushUser.distance = 100;
        onlineMatchPushUser.userTagList = vwb.R(new String[]{"唱各萨达多个", "喜欢广场舞", "喜欢哈哈哈"}, new w9j() { // from class: l.zb80
            public final Object call(Object obj) {
                return PopDebugLayout.m2234t((String) obj);
            }
        });
        c cVar = CoreModule.c;
        onlineMatchPushUser.user = cVar.e0.Pa(((CoreSuggested.UserInfo) ((PartialListOpt) cVar.m0.a0.e()).loaded.get(z ? 2 : 1)).id);
        if (!z) {
            OnlineMatchManager.z().I.onNext(new j760("tickets_broadcast", onlineMatchPushUser));
        } else {
            qyb0.N(this.f1280p.getContext(), onlineMatchPushUser.user);
            OnlineMatchManager.z().I.onNext(new j760("pei_liao_broadcast", onlineMatchPushUser));
        }
    }

    /* JADX INFO: renamed from: R */
    public final void m2254R(boolean z) {
        OnlineMatchPushUser onlineMatchPushUser = new OnlineMatchPushUser();
        onlineMatchPushUser.name = "重生的小胖子";
        onlineMatchPushUser.userId = "349281368";
        CoreModule.c.e0.p9().fp().profileMiddle().formatted();
        onlineMatchPushUser.avatarUrl = "https://auto.tancdn.com/v1/images/eyJpZCI6Ikk2MlRQNldBSVFaM1ZRRFRPU01FSFdIS043Nk5RUTA0IiwidyI6MTk2MCwiaCI6MTk1OSwiZCI6MCwibXQiOiJpbWFnZS9qcGVnIiwiZGgiOjYxNzE0NDg5Nzk1MzUzMzg2ODAsImFiIjowfQ.jpg?format=128x128";
        onlineMatchPushUser.action = "";
        onlineMatchPushUser.gender = "female";
        onlineMatchPushUser.age = "10";
        onlineMatchPushUser.distance = 100;
        onlineMatchPushUser.userTagList = vwb.R(new String[]{"唱各萨达多个", "喜欢广场舞", "喜欢哈哈哈"}, new w9j() { // from class: l.tb80
            public final Object call(Object obj) {
                return PopDebugLayout.m2218d((String) obj);
            }
        });
        QuickChatCardWrapper quickChatCardWrapper = new QuickChatCardWrapper(onlineMatchPushUser);
        if (z) {
            quickChatCardWrapper.cardType = 3;
        }
        if (((PartialListOpt) CoreModule.c.m0.a0.e()).loaded.size() < 1) {
            return;
        }
        c cVar = CoreModule.c;
        onlineMatchPushUser.user = cVar.e0.Pa(((CoreSuggested.UserInfo) ((PartialListOpt) cVar.m0.a0.e()).loaded.get(1)).id);
        CoreModule.c.D0.V.put(0);
        xzc0.x0().B0(this.f1281q.K1(), quickChatCardWrapper);
    }

    /* JADX INFO: renamed from: S, reason: merged with bridge method [inline-methods] */
    public final void m2249M() {
        ActionToastStyle actionToastStyle = new ActionToastStyle();
        actionToastStyle.styleId = "1";
        ActionToastStyleIcons actionToastStyleIcons = new ActionToastStyleIcons();
        actionToastStyleIcons.miniIcon = "online";
        actionToastStyle.icons = actionToastStyleIcons;
        actionToastStyle.toastLink = "tantanapp://sendMessage?uid=137071&msg=早上好";
        actionToastStyle.mainImg = ((Media) CoreModule.c.e0.p9().fp()).url;
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
        qug0.g().k(this.f1281q, actionDataNew_);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m2256w(this);
        m2257x();
    }

    public void setMainViewModel(b bVar) {
        this.f1281q = bVar;
    }

    /* JADX INFO: renamed from: w */
    public final void m2256w(View view) {
        ic80.m7151a(this, view);
    }

    /* JADX INFO: renamed from: x */
    public final void m2257x() {
        xdl0.E0(this.f1265a, new View.OnClickListener() { // from class: l.mb80
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f6324a.m2258y(view);
            }
        });
        xdl0.E0(this.f1269e, new View.OnClickListener() { // from class: l.fc80
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f4431a.m2259z(view);
            }
        });
        xdl0.E0(this.f1271g, new View.OnClickListener() { // from class: l.gc80
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f4608a.m2246J(view);
            }
        });
        xdl0.E0(this.f1270f, new View.OnClickListener() { // from class: l.hc80
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f4860a.m2247K(view);
            }
        });
        xdl0.E0(this.f1272h, new View.OnClickListener() { // from class: l.nb80
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f6499a.m2248L(view);
            }
        });
        xdl0.E0(this.f1273i, new View.OnClickListener() { // from class: l.ob80
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f6642a.m2250N(view);
            }
        });
        xdl0.E0(this.f1274j, new View.OnClickListener() { // from class: l.pb80
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f6845a.m2251O(view);
            }
        });
        xdl0.E0(this.f1275k, new View.OnClickListener() { // from class: l.qb80
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f7001a.m2252P(view);
            }
        });
        xdl0.E0(this.f1276l, new View.OnClickListener() { // from class: l.rb80
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                PopDebugLayout.m2223i(view);
            }
        });
        xdl0.E0(this.f1266b, new View.OnClickListener() { // from class: l.sb80
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f7345a.m2237A(view);
            }
        });
        xdl0.E0(this.f1267c, new View.OnClickListener() { // from class: l.xb80
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f8448a.m2238B(view);
            }
        });
        xdl0.E0(this.f1268d, new View.OnClickListener() { // from class: l.ac80
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f2774a.m2239C(view);
            }
        });
        xdl0.E0(this.f1277m, new View.OnClickListener() { // from class: l.bc80
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f3362a.m2240D(view);
            }
        });
        xdl0.E0(this.f1278n, new View.OnClickListener() { // from class: l.cc80
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f4001a.m2242F(view);
            }
        });
        xdl0.E0(this.f1279o, new View.OnClickListener() { // from class: l.dc80
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f4143a.m2243G(view);
            }
        });
        xdl0.E0(this.f1280p, new View.OnClickListener() { // from class: l.ec80
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f4288a.m2245I(view);
            }
        });
    }

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ void m2258y(View view) {
        rxg0.L(this.f1281q.K1());
    }

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ void m2259z(View view) {
        xl4.a(this.f1281q.K1());
    }

    public PopDebugLayout(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public PopDebugLayout(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
