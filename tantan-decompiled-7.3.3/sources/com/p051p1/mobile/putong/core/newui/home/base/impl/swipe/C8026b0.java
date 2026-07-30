package com.p051p1.mobile.putong.core.newui.home.base.impl.swipe;

import com.heytap.mcssdk.mode.CommandMessage;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.card.VSwipeStack;
import com.p051p1.mobile.putong.core.data.SwipeDirection;
import com.p051p1.mobile.putong.core.newui.main.NewMainAct;
import com.p051p1.mobile.putong.data.MatchScData;
import com.p051p1.mobile.putong.live.base.data.BLiveGiftBubblePopupTitlePosition;
import com.p051p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import p153l.i4g0;
import p153l.joa;
import p153l.jyb;
import p153l.qap;
import p153l.sfj0;

/* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.home.base.impl.swipe.b0 */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(m88120d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, m88121d2 = {"Lcom/p1/mobile/putong/core/newui/home/base/impl/swipe/b0;", "Lcom/p1/mobile/putong/core/newui/home/base/impl/swipe/a;", "<init>", "()V", "Lcom/p1/mobile/putong/core/newui/home/base/impl/swipe/j$a;", CommandMessage.PARAMS, "", "r", "(Lcom/p1/mobile/putong/core/newui/home/base/impl/swipe/j$a;)Z", "Lcom/p1/mobile/putong/core/card/VSwipeStack$OnCardSwipeResult;", "p", "(Lcom/p1/mobile/putong/core/newui/home/base/impl/swipe/j$a;)Lcom/p1/mobile/putong/core/card/VSwipeStack$OnCardSwipeResult;", "", "q", "(Lcom/p1/mobile/putong/core/newui/home/base/impl/swipe/j$a;)V", "Lcom/p1/mobile/putong/core/data/SwipeDirection;", "direction", "", "id", BLiveStormDanmakuGiftResourceType.f45294s, "(Lcom/p1/mobile/putong/core/data/SwipeDirection;Ljava/lang/String;)V", "b_core_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class C8026b0 extends AbstractC8022a {

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.home.base.impl.swipe.b0$a */
    @Metadata(m88122k = 3, m88123mv = {2, 2, 0}, m88125xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f22804a;

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
            f22804a = iArr;
        }
    }

    @Override // p153l.g6m
    @NotNull
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public VSwipeStack.OnCardSwipeResult mo38500a(@NotNull C8049j.a params) {
        params.getClass();
        qap.Companion companion = qap.INSTANCE;
        if (companion.m175973k() && params.f22838c.m140260e().hasLikeMeSlideCardTop && joa.m146386f4() && companion.m175978p()) {
            companion.m175983u(System.currentTimeMillis());
            companion.m175981s(true);
            return VSwipeStack.OnCardSwipeResult.pass;
        }
        SwipeDirection swipeDirection = params.f22839d;
        swipeDirection.getClass();
        String str = params.f22838c.m140259d().f56859id;
        str.getClass();
        m38542s(swipeDirection, str);
        String str2 = params.f22838c.m140259d().f56859id;
        str2.getClass();
        companion.m175987y(str2);
        NewMainAct newMainActM101951T4 = params.f22836a.m101951T4();
        String str3 = params.f22838c.m140259d().f56859id;
        str3.getClass();
        companion.m175965c(newMainActM101951T4, str3, "", CoreModule.m30933P().m143405a().mo34376N7());
        companion.m175983u(System.currentTimeMillis());
        return VSwipeStack.OnCardSwipeResult.pass;
    }

    /* JADX INFO: renamed from: q */
    public final void m38540q(C8049j.a params) {
        String str;
        SwipeDirection swipeDirection = params.f22839d;
        int i = swipeDirection == null ? -1 : a.f22804a[swipeDirection.ordinal()];
        if (i == 1) {
            str = BLiveGiftBubblePopupTitlePosition.left;
        } else if (i != 2) {
            str = i != 3 ? "" : "up";
        } else {
            str = "right";
        }
        i4g0.m138525w(MatchScData.ModuleId.mid_e_card, "p_suggest_users_home_view", jyb.m147494Y("moments_user_id", params.f22838c.m140262g()), jyb.m147494Y("card_name", "vas_show_he_liked"), jyb.m147494Y("show_he_liked", Boolean.TRUE), jyb.m147494Y("direction", "dislike"), jyb.m147494Y("card_order", Integer.valueOf(CoreModule.f18264c.f20364Y0.m179743b())), jyb.m147494Y("is_guided_action", "0"), jyb.m147494Y("swipe_directions", str));
    }

    @Override // p153l.g6m
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public boolean mo38501b(@NotNull C8049j.a params) {
        String str;
        params.getClass();
        qap.Companion companion = qap.INSTANCE;
        companion.m175981s(false);
        if (!CoreModule.m30930K().me_().isFemale() && params.f22838c.m140260e().hasLikeMeSlideCardTop && !joa.m146386f4() && companion.m175976n(params.f22838c.m140260e(), params.f22838c.m140259d())) {
            SwipeDirection swipeDirection = params.f22839d;
            int i = swipeDirection == null ? -1 : a.f22804a[swipeDirection.ordinal()];
            if (i == 1) {
                str = BLiveGiftBubblePopupTitlePosition.left;
            } else if (i != 2) {
                str = i != 3 ? "" : "up";
            } else {
                str = "right";
            }
            i4g0.m138525w(MatchScData.ModuleId.mid_e_card, "p_suggest_users_home_view", jyb.m147494Y("moments_user_id", params.f22838c.m140262g()), jyb.m147494Y("card_name", "svip_see_enhance"), jyb.m147494Y("show_he_liked", Boolean.TRUE), jyb.m147494Y("card_order", Integer.valueOf(CoreModule.f18264c.f20364Y0.m179743b())), jyb.m147494Y("swipe_directions", str));
            return false;
        }
        if (!companion.m175973k() || !params.f22838c.m140260e().hasLikeMeSlideCardTop || !joa.m146386f4() || !companion.m175978p()) {
            return false;
        }
        String str2 = params.f22838c.m140259d().f56859id;
        str2.getClass();
        companion.m175987y(str2);
        m38540q(params);
        return true;
    }

    /* JADX INFO: renamed from: s */
    public final void m38542s(SwipeDirection direction, String id) {
        String str;
        int i = a.f22804a[direction.ordinal()];
        if (i == 1) {
            str = BLiveGiftBubblePopupTitlePosition.left;
        } else if (i != 2) {
            str = i != 3 ? "" : "up";
        } else {
            str = "right";
        }
        sfj0.m185600g(MatchScData.ModuleId.mid_e_card, "p_suggest_users_home_view", sfj0.C20032a.m185616i("show_he_liked", true), sfj0.C20032a.m185615h("card_name", "vas_show_he_liked"), sfj0.C20032a.m185615h("swipe_directions", str), sfj0.C20032a.m185613f("card_order", CoreModule.f18264c.f20364Y0.m179743b()), sfj0.C20032a.m185615h("is_guided_action", "0"), sfj0.C20032a.m185615h("moments_user_id", id));
    }
}
