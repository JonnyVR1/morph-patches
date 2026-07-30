package com.p000p1.mobile.putong.core.newui.home.base.impl.swipe;

import com.p000p1.mobile.putong.core.newui.main.NewMainAct;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.card.VSwipeStack;
import com.p1.mobile.putong.core.data.SwipeDirection;
import com.tantanapp.common.data.DbObject;
import kotlin.Metadata;
import l.j760;
import l.o6j0;
import l.q8p;
import l.vwb;
import l.xma;
import l.zvf0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.home.base.impl.swipe.b0 */
/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lcom/p1/mobile/putong/core/newui/home/base/impl/swipe/b0;", "Lcom/p1/mobile/putong/core/newui/home/base/impl/swipe/a;", "<init>", "()V", "Lcom/p1/mobile/putong/core/newui/home/base/impl/swipe/j$a;", "params", "", "r", "(Lcom/p1/mobile/putong/core/newui/home/base/impl/swipe/j$a;)Z", "Lcom/p1/mobile/putong/core/card/VSwipeStack$OnCardSwipeResult;", "p", "(Lcom/p1/mobile/putong/core/newui/home/base/impl/swipe/j$a;)Lcom/p1/mobile/putong/core/card/VSwipeStack$OnCardSwipeResult;", "", "q", "(Lcom/p1/mobile/putong/core/newui/home/base/impl/swipe/j$a;)V", "Lcom/p1/mobile/putong/core/data/SwipeDirection;", "direction", "", "id", "s", "(Lcom/p1/mobile/putong/core/data/SwipeDirection;Ljava/lang/String;)V", "b_core_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class C0039b0 extends AbstractC0035a {

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.home.base.impl.swipe.b0$a */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f840a;

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
            f840a = iArr;
        }
    }

    @Override // p009l.p3m
    @NotNull
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public VSwipeStack.OnCardSwipeResult mo1468a(@NotNull C0062j.a params) {
        params.getClass();
        q8p.a aVar = q8p.Companion;
        if (aVar.k() && params.f874c.m17131e().hasLikeMeSlideCardTop && xma.e4() && aVar.p()) {
            aVar.u(System.currentTimeMillis());
            aVar.s(true);
            return VSwipeStack.OnCardSwipeResult.pass;
        }
        SwipeDirection swipeDirection = params.f875d;
        swipeDirection.getClass();
        String str = ((DbObject) params.f874c.m17130d()).id;
        str.getClass();
        m1510s(swipeDirection, str);
        String str2 = ((DbObject) params.f874c.m17130d()).id;
        str2.getClass();
        aVar.y(str2);
        NewMainAct newMainActM19361T4 = params.f872a.m19361T4();
        String str3 = ((DbObject) params.f874c.m17130d()).id;
        str3.getClass();
        aVar.c(newMainActM19361T4, str3, "", CoreModule.P().a().N7());
        aVar.u(System.currentTimeMillis());
        return VSwipeStack.OnCardSwipeResult.pass;
    }

    /* JADX INFO: renamed from: q */
    public final void m1508q(C0062j.a params) {
        String str;
        SwipeDirection swipeDirection = params.f875d;
        int i = swipeDirection == null ? -1 : a.f840a[swipeDirection.ordinal()];
        if (i == 1) {
            str = "left";
        } else if (i != 2) {
            str = i != 3 ? "" : "up";
        } else {
            str = "right";
        }
        zvf0.w("e_card", "p_suggest_users_home_view", new j760[]{vwb.Y("moments_user_id", params.f874c.m17133g()), vwb.Y("card_name", "vas_show_he_liked"), vwb.Y("show_he_liked", Boolean.TRUE), vwb.Y("direction", "dislike"), vwb.Y("card_order", Integer.valueOf(CoreModule.c.Y0.b())), vwb.Y("is_guided_action", "0"), vwb.Y("swipe_directions", str)});
    }

    @Override // p009l.p3m
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public boolean mo1469b(@NotNull C0062j.a params) {
        String str;
        params.getClass();
        q8p.a aVar = q8p.Companion;
        aVar.s(false);
        if (!CoreModule.K().me_().isFemale() && params.f874c.m17131e().hasLikeMeSlideCardTop && !xma.e4() && aVar.n(params.f874c.m17131e(), params.f874c.m17130d())) {
            SwipeDirection swipeDirection = params.f875d;
            int i = swipeDirection == null ? -1 : a.f840a[swipeDirection.ordinal()];
            if (i == 1) {
                str = "left";
            } else if (i != 2) {
                str = i != 3 ? "" : "up";
            } else {
                str = "right";
            }
            zvf0.w("e_card", "p_suggest_users_home_view", new j760[]{vwb.Y("moments_user_id", params.f874c.m17133g()), vwb.Y("card_name", "svip_see_enhance"), vwb.Y("show_he_liked", Boolean.TRUE), vwb.Y("card_order", Integer.valueOf(CoreModule.c.Y0.b())), vwb.Y("swipe_directions", str)});
            return false;
        }
        if (!aVar.k() || !params.f874c.m17131e().hasLikeMeSlideCardTop || !xma.e4() || !aVar.p()) {
            return false;
        }
        String str2 = ((DbObject) params.f874c.m17130d()).id;
        str2.getClass();
        aVar.y(str2);
        m1508q(params);
        return true;
    }

    /* JADX INFO: renamed from: s */
    public final void m1510s(SwipeDirection direction, String id) {
        String str;
        int i = a.f840a[direction.ordinal()];
        if (i == 1) {
            str = "left";
        } else if (i != 2) {
            str = i != 3 ? "" : "up";
        } else {
            str = "right";
        }
        o6j0.g("e_card", "p_suggest_users_home_view", new o6j0.a[]{o6j0.a.i("show_he_liked", true), o6j0.a.h("card_name", "vas_show_he_liked"), o6j0.a.h("swipe_directions", str), o6j0.a.f("card_order", CoreModule.c.Y0.b()), o6j0.a.h("is_guided_action", "0"), o6j0.a.h("moments_user_id", id)});
    }
}
