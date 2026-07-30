package com.p046p1.mobile.putong.core.newui.home.base.impl.swipe;

import com.heytap.mcssdk.mode.CommandMessage;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.card.VSwipeStack;
import com.p046p1.mobile.putong.core.data.SwipeDirection;
import com.p046p1.mobile.putong.core.newui.main.NewMainAct;
import com.p046p1.mobile.putong.data.MatchScData;
import com.p046p1.mobile.putong.live.base.data.BLiveGiftBubblePopupTitlePosition;
import com.p046p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import p149l.o6j0;
import p149l.q8p;
import p149l.vwb;
import p149l.xma;
import p149l.zvf0;

/* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.home.base.impl.swipe.b0 */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(m87231d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, m87232d2 = {"Lcom/p1/mobile/putong/core/newui/home/base/impl/swipe/b0;", "Lcom/p1/mobile/putong/core/newui/home/base/impl/swipe/a;", "<init>", "()V", "Lcom/p1/mobile/putong/core/newui/home/base/impl/swipe/j$a;", CommandMessage.PARAMS, "", "r", "(Lcom/p1/mobile/putong/core/newui/home/base/impl/swipe/j$a;)Z", "Lcom/p1/mobile/putong/core/card/VSwipeStack$OnCardSwipeResult;", "p", "(Lcom/p1/mobile/putong/core/newui/home/base/impl/swipe/j$a;)Lcom/p1/mobile/putong/core/card/VSwipeStack$OnCardSwipeResult;", "", "q", "(Lcom/p1/mobile/putong/core/newui/home/base/impl/swipe/j$a;)V", "Lcom/p1/mobile/putong/core/data/SwipeDirection;", "direction", "", "id", BLiveStormDanmakuGiftResourceType.f44446s, "(Lcom/p1/mobile/putong/core/data/SwipeDirection;Ljava/lang/String;)V", "b_core_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public final class C7875b0 extends AbstractC7871a {

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.home.base.impl.swipe.b0$a */
    @Metadata(m87233k = 3, m87234mv = {2, 2, 0}, m87236xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f22062a;

        static {
            int[] iArr = new int[SwipeDirection.values().length];
            try {
                iArr[SwipeDirection.LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[SwipeDirection.RIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[SwipeDirection.UP.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f22062a = iArr;
        }
    }

    @Override // p149l.p3m
    @NotNull
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public VSwipeStack.OnCardSwipeResult mo37497a(@NotNull C7898j.a params) {
        params.getClass();
        q8p.Companion companion = q8p.INSTANCE;
        if (companion.m173436k() && params.f22096c.m141746e().hasLikeMeSlideCardTop && xma.m210071e4() && companion.m173441p()) {
            companion.m173446u(System.currentTimeMillis());
            companion.m173444s(true);
            return VSwipeStack.OnCardSwipeResult.pass;
        }
        SwipeDirection swipeDirection = params.f22097d;
        swipeDirection.getClass();
        String str = params.f22096c.m141745d().f56011id;
        str.getClass();
        m37539s(swipeDirection, str);
        String str2 = params.f22096c.m141745d().f56011id;
        str2.getClass();
        companion.m173450y(str2);
        NewMainAct newMainActM161157T4 = params.f22094a.m161157T4();
        String str3 = params.f22096c.m141745d().f56011id;
        str3.getClass();
        companion.m173428c(newMainActM161157T4, str3, "", CoreModule.m29935P().m94651a().mo33373N7());
        companion.m173446u(System.currentTimeMillis());
        return VSwipeStack.OnCardSwipeResult.pass;
    }

    /* JADX INFO: renamed from: q */
    public final void m37537q(C7898j.a params) {
        String str;
        SwipeDirection swipeDirection = params.f22097d;
        int i = swipeDirection == null ? -1 : a.f22062a[swipeDirection.ordinal()];
        if (i == 1) {
            str = BLiveGiftBubblePopupTitlePosition.left;
        } else if (i != 2) {
            str = i != 3 ? "" : "up";
        } else {
            str = "right";
        }
        zvf0.m220401w(MatchScData.ModuleId.mid_e_card, "p_suggest_users_home_view", vwb.m200311Y("moments_user_id", params.f22096c.m141748g()), vwb.m200311Y("card_name", "vas_show_he_liked"), vwb.m200311Y("show_he_liked", Boolean.TRUE), vwb.m200311Y("direction", "dislike"), vwb.m200311Y("card_order", Integer.valueOf(CoreModule.f17545c.f19622Y0.m119252b())), vwb.m200311Y("is_guided_action", "0"), vwb.m200311Y("swipe_directions", str));
    }

    @Override // p149l.p3m
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public boolean mo37498b(@NotNull C7898j.a params) {
        String str;
        params.getClass();
        q8p.Companion companion = q8p.INSTANCE;
        companion.m173444s(false);
        if (!CoreModule.m29932K().me_().isFemale() && params.f22096c.m141746e().hasLikeMeSlideCardTop && !xma.m210071e4() && companion.m173439n(params.f22096c.m141746e(), params.f22096c.m141745d())) {
            SwipeDirection swipeDirection = params.f22097d;
            int i = swipeDirection == null ? -1 : a.f22062a[swipeDirection.ordinal()];
            if (i == 1) {
                str = BLiveGiftBubblePopupTitlePosition.left;
            } else if (i != 2) {
                str = i != 3 ? "" : "up";
            } else {
                str = "right";
            }
            zvf0.m220401w(MatchScData.ModuleId.mid_e_card, "p_suggest_users_home_view", vwb.m200311Y("moments_user_id", params.f22096c.m141748g()), vwb.m200311Y("card_name", "svip_see_enhance"), vwb.m200311Y("show_he_liked", Boolean.TRUE), vwb.m200311Y("card_order", Integer.valueOf(CoreModule.f17545c.f19622Y0.m119252b())), vwb.m200311Y("swipe_directions", str));
            return false;
        }
        if (!companion.m173436k() || !params.f22096c.m141746e().hasLikeMeSlideCardTop || !xma.m210071e4() || !companion.m173441p()) {
            return false;
        }
        String str2 = params.f22096c.m141745d().f56011id;
        str2.getClass();
        companion.m173450y(str2);
        m37537q(params);
        return true;
    }

    /* JADX INFO: renamed from: s */
    public final void m37539s(SwipeDirection direction, String id) {
        String str;
        int i = a.f22062a[direction.ordinal()];
        if (i == 1) {
            str = BLiveGiftBubblePopupTitlePosition.left;
        } else if (i != 2) {
            str = i != 3 ? "" : "up";
        } else {
            str = "right";
        }
        o6j0.m162863g(MatchScData.ModuleId.mid_e_card, "p_suggest_users_home_view", o6j0.C18854a.m162879i("show_he_liked", true), o6j0.C18854a.m162878h("card_name", "vas_show_he_liked"), o6j0.C18854a.m162878h("swipe_directions", str), o6j0.C18854a.m162876f("card_order", CoreModule.f17545c.f19622Y0.m119252b()), o6j0.C18854a.m162878h("is_guided_action", "0"), o6j0.C18854a.m162878h("moments_user_id", id));
    }
}
