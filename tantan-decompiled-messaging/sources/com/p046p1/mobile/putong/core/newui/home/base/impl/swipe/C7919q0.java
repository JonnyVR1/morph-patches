package com.p046p1.mobile.putong.core.newui.home.base.impl.swipe;

import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.card.VSwipeStack;
import com.p046p1.mobile.putong.core.data.Conversation;
import com.p046p1.mobile.putong.core.data.Message;
import com.p046p1.mobile.putong.core.data.MessageType;
import com.p046p1.mobile.putong.core.data.SwipeDirection;
import com.p046p1.mobile.putong.core.newui.home.base.impl.swipe.C7919q0;
import com.p046p1.mobile.putong.core.p053ui.match.MatchAct;
import com.p046p1.mobile.putong.data.MatchScData;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.data.orm.Filter;
import com.tantanapp.common.utils.NullChecker;
import p133rx.C22306c;
import p149l.abi;
import p149l.aci;
import p149l.e30;
import p149l.e51;
import p149l.i36;
import p149l.mkd0;
import p149l.roj0;
import p149l.upa;
import p149l.vwb;
import p149l.w9j;
import p149l.xdx;
import p149l.zvf0;

/* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.home.base.impl.swipe.q0 */
/* JADX INFO: loaded from: classes11.dex */
public class C7919q0 extends AbstractC7871a {

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.home.base.impl.swipe.q0$a */
    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f22121a;

        static {
            int[] iArr = new int[SwipeDirection.values().length];
            f22121a = iArr;
            try {
                iArr[SwipeDirection.UP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f22121a[SwipeDirection.RIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f22121a[SwipeDirection.LEFT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* JADX INFO: renamed from: r */
    public static /* synthetic */ void m37728r(String str) {
        CoreModule.f17553k.f91940c.delete(Filter.AND(Message.CID.mo60175EQ(str), Message.MESSAGETYPE.m60176EQ(MessageType.local_long_time_no_see)));
        CoreModule.f17545c.f19642f0.m32930dh(str, MessageType.get(MessageType.local_long_time_no_see));
    }

    /* JADX INFO: renamed from: s */
    public static /* synthetic */ void m37729s(C7898j.a aVar, roj0 roj0Var) {
        if (aVar.m37660a()) {
            CoreModule.f17545c.f19642f0.m32650Fo();
            if (!CoreModule.f17545c.f19639e0.m169527p9().isFemale() || upa.m194634F2()) {
                aVar.f22095b.m37341q2().m20603w4(MatchAct.m47564g2(aVar.f22094a.m161157T4(), vwb.m200324f0(aVar.f22096c.m141745d().f56011id), 44, null, (upa.m194694S1() || upa.m194770j2()) ? "tmp_from_home_swipe" : null), new MatchAct.C8454b());
                return;
            }
            if (upa.m194791n3()) {
                aci.m95751b0(aVar.f22094a.m161157T4(), aVar.f22096c.m141745d(), false, "long_time_no_see");
            } else if (upa.m194770j2()) {
                xdx.m208433A().m208462L(aVar.f22094a.m161157T4(), aVar.f22096c.m141745d(), false, "long_time_no_see");
            } else {
                abi.m95623K(aVar.f22094a.m161157T4(), aVar.f22096c.m141745d(), 44);
            }
        }
    }

    /* JADX INFO: renamed from: u */
    public static /* synthetic */ void m37731u(Throwable th) {
    }

    @Override // p149l.p3m
    /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
    public boolean mo37498b(C7898j.a aVar) {
        return aVar.f22096c.m141746e().meetAgain;
    }

    /* JADX INFO: renamed from: B */
    public final void m37734B(final String str) {
        e51.m114774y(new Runnable() { // from class: l.kch0
            @Override // java.lang.Runnable
            public final void run() {
                CoreModule.f17545c.f19609U.m109085a(new d30() { // from class: l.lch0
                    @Override // p149l.d30
                    public final void call() {
                        C7919q0.m37728r(str);
                    }
                });
            }
        });
    }

    @Override // p149l.p3m
    /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
    public VSwipeStack.OnCardSwipeResult mo37497a(final C7898j.a aVar) {
        int i = a.f22121a[aVar.f22097d.ordinal()];
        if (i == 1) {
            return VSwipeStack.OnCardSwipeResult.back;
        }
        if (i == 2 || i == 3) {
            if (!aVar.f22096c.m141746e().disableUndo) {
                CoreModule.f17545c.f19663m0.m31042Q8(aVar.f22096c.m141746e(), aVar.f22099f.m38474i(), aVar.f22097d);
            }
            aVar.f22094a.duringCreated((C22306c) CoreModule.f17545c.f19663m0.m31150u8(aVar.f22096c.m141745d(), aVar.m37660a()).switchMap(new w9j() { // from class: l.fch0
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return this.f96797a.m37737y(aVar, (roj0) obj);
                }
            })).subscribe(mkd0.m154956H(new e30() { // from class: l.gch0
                @Override // p149l.e30
                public final void call(Object obj) {
                    C7919q0.m37729s(aVar, (roj0) obj);
                }
            }, new e30() { // from class: l.hch0
                @Override // p149l.e30
                public final void call(Object obj) {
                    C7919q0.m37731u((Throwable) obj);
                }
            }));
        }
        m37738z(aVar);
        return VSwipeStack.OnCardSwipeResult.pass;
    }

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ roj0 m37736x(Conversation conversation) {
        if (NullChecker.m81303a(conversation) && NullChecker.m81303a(conversation.additional) && NullChecker.m81303a(conversation.additional.reSwipe) && TEnum.equals(conversation.additional.reSwipe.status, "liked")) {
            if (conversation.localEverHasMessage) {
                i36.m134149g().m134161p(conversation.f56011id, (long) conversation.additional.reSwipe.swipedTime);
            }
            if (!conversation.additional.reSwipe.autoSendMessage) {
                m37734B(conversation.f56011id);
            }
        }
        return roj0.f160388a;
    }

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ C22306c m37737y(C7898j.a aVar, roj0 roj0Var) {
        final String str = aVar.f22096c.m141745d().f56011id;
        return !aVar.m37660a() ? C22306c.just(roj0.f160388a) : CoreModule.f17545c.f19642f0.m32902ap(str).switchMap(new w9j() { // from class: l.ich0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return CoreModule.f17545c.f19642f0.m32737Ne(str).first();
            }
        }).map(new w9j() { // from class: l.jch0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f117308a.m37736x((Conversation) obj);
            }
        });
    }

    /* JADX INFO: renamed from: z */
    public final void m37738z(C7898j.a aVar) {
        zvf0.m220401w(MatchScData.ModuleId.mid_e_card, "p_suggest_users_home_view", vwb.m200311Y("moments_user_id", aVar.f22096c.m141748g()), vwb.m200311Y("card_name", MessageType.normal_card), vwb.m200311Y("direction", aVar.f22097d == SwipeDirection.RIGHT ? "like" : "dislike"), vwb.m200311Y("card_order", ""), vwb.m200311Y("is_show_longtimenosee_tag", 1), vwb.m200311Y("swipe_directions", aVar.f22097d.toString()));
    }
}
