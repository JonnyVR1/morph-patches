package com.p000p1.mobile.putong.core.newui.home.base.impl.swipe;

import com.p000p1.mobile.putong.core.newui.home.base.impl.swipe.C0083q0;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.card.VSwipeStack;
import com.p1.mobile.putong.core.data.Conversation;
import com.p1.mobile.putong.core.data.Message;
import com.p1.mobile.putong.core.data.MessageType;
import com.p1.mobile.putong.core.data.SwipeDirection;
import com.p1.mobile.putong.core.ui.match.MatchAct;
import com.p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.data.DbObject;
import com.tantanapp.common.data.orm.Filter;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import l.abi;
import l.aci;
import l.d30;
import l.e30;
import l.e51;
import l.i36;
import l.j760;
import l.mkd0;
import l.roj0;
import l.upa;
import l.vwb;
import l.w9j;
import l.zvf0;
import p009l.xdx;
import rx.c;

/* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.home.base.impl.swipe.q0 */
/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class C0083q0 extends AbstractC0035a {

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.home.base.impl.swipe.q0$a */
    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f899a;

        static {
            int[] iArr = new int[SwipeDirection.values().length];
            f899a = iArr;
            try {
                iArr[SwipeDirection.UP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f899a[SwipeDirection.RIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f899a[SwipeDirection.LEFT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* JADX INFO: renamed from: r */
    public static /* synthetic */ void m1699r(String str) {
        CoreModule.k.c.delete(Filter.AND(new Filter[]{Message.CID.EQ(str), Message.MESSAGETYPE.EQ("local_long_time_no_see")}));
        CoreModule.c.f0.dh(str, MessageType.get("local_long_time_no_see"));
    }

    /* JADX INFO: renamed from: s */
    public static /* synthetic */ void m1700s(C0062j.a aVar, roj0 roj0Var) {
        if (aVar.m1631a()) {
            CoreModule.c.f0.Fo();
            if (!CoreModule.c.e0.p9().isFemale() || upa.F2()) {
                aVar.f873b.m1310q2().w4(MatchAct.g2(aVar.f872a.m19361T4(), vwb.f0(new String[]{((DbObject) aVar.f874c.m17130d()).id}), 44, (ArrayList) null, (upa.S1() || upa.j2()) ? "tmp_from_home_swipe" : null), new MatchAct.b());
                return;
            }
            if (upa.n3()) {
                aci.b0(aVar.f872a.m19361T4(), aVar.f874c.m17130d(), false, "long_time_no_see");
            } else if (upa.j2()) {
                xdx.m24778A().m24807L(aVar.f872a.m19361T4(), aVar.f874c.m17130d(), false, "long_time_no_see");
            } else {
                abi.K(aVar.f872a.m19361T4(), aVar.f874c.m17130d(), 44);
            }
        }
    }

    /* JADX INFO: renamed from: u */
    public static /* synthetic */ void m1702u(Throwable th) {
    }

    @Override // p009l.p3m
    /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
    public boolean mo1469b(C0062j.a aVar) {
        return aVar.f874c.m17131e().meetAgain;
    }

    /* JADX INFO: renamed from: B */
    public final void m1705B(final String str) {
        e51.y(new Runnable() { // from class: l.kch0
            @Override // java.lang.Runnable
            public final void run() {
                CoreModule.c.U.a(new d30() { // from class: l.lch0
                    public final void call() {
                        C0083q0.m1699r(str);
                    }
                });
            }
        });
    }

    @Override // p009l.p3m
    /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
    public VSwipeStack.OnCardSwipeResult mo1468a(final C0062j.a aVar) {
        int i = a.f899a[aVar.f875d.ordinal()];
        if (i == 1) {
            return VSwipeStack.OnCardSwipeResult.back;
        }
        if (i == 2 || i == 3) {
            if (!aVar.f874c.m17131e().disableUndo) {
                CoreModule.c.m0.Q8(aVar.f874c.m17131e(), aVar.f877f.m2452i(), aVar.f875d);
            }
            aVar.f872a.duringCreated(CoreModule.c.m0.u8(aVar.f874c.m17130d(), aVar.m1631a()).switchMap(new w9j() { // from class: l.fch0
                public final Object call(Object obj) {
                    return this.f12919a.m1708y(aVar, (roj0) obj);
                }
            })).subscribe(mkd0.H(new e30() { // from class: l.gch0
                public final void call(Object obj) {
                    C0083q0.m1700s(aVar, (roj0) obj);
                }
            }, new e30() { // from class: l.hch0
                public final void call(Object obj) {
                    C0083q0.m1702u((Throwable) obj);
                }
            }));
        }
        m1709z(aVar);
        return VSwipeStack.OnCardSwipeResult.pass;
    }

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ roj0 m1707x(Conversation conversation) {
        if (NullChecker.a(conversation) && NullChecker.a(conversation.additional) && NullChecker.a(conversation.additional.reSwipe) && TEnum.equals(conversation.additional.reSwipe.status, "liked")) {
            if (conversation.localEverHasMessage) {
                i36.g().p(((DbObject) conversation).id, (long) conversation.additional.reSwipe.swipedTime);
            }
            if (!conversation.additional.reSwipe.autoSendMessage) {
                m1705B(((DbObject) conversation).id);
            }
        }
        return roj0.a;
    }

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ c m1708y(C0062j.a aVar, roj0 roj0Var) {
        final String str = ((DbObject) aVar.f874c.m17130d()).id;
        return !aVar.m1631a() ? c.just(roj0.a) : CoreModule.c.f0.ap(str).switchMap(new w9j() { // from class: l.ich0
            public final Object call(Object obj) {
                return CoreModule.c.f0.Ne(str).first();
            }
        }).map(new w9j() { // from class: l.jch0
            public final Object call(Object obj) {
                return this.f15053a.m1707x((Conversation) obj);
            }
        });
    }

    /* JADX INFO: renamed from: z */
    public final void m1709z(C0062j.a aVar) {
        zvf0.w("e_card", "p_suggest_users_home_view", new j760[]{vwb.Y("moments_user_id", aVar.f874c.m17133g()), vwb.Y("card_name", "normal_card"), vwb.Y("direction", aVar.f875d == SwipeDirection.RIGHT ? "like" : "dislike"), vwb.Y("card_order", ""), vwb.Y("is_show_longtimenosee_tag", 1), vwb.Y("swipe_directions", aVar.f875d.toString())});
    }
}
