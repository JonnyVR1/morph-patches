package com.p051p1.mobile.putong.core.newui.home.base.impl.swipe;

import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.card.VSwipeStack;
import com.p051p1.mobile.putong.core.data.Conversation;
import com.p051p1.mobile.putong.core.data.Message;
import com.p051p1.mobile.putong.core.data.MessageType;
import com.p051p1.mobile.putong.core.data.SwipeDirection;
import com.p051p1.mobile.putong.core.newui.home.base.impl.swipe.C8070q0;
import com.p051p1.mobile.putong.core.p058ui.match.MatchAct;
import com.p051p1.mobile.putong.data.MatchScData;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.data.orm.Filter;
import com.tantanapp.common.utils.NullChecker;
import p137rx.C22421c;
import p153l.gra;
import p153l.i4g0;
import p153l.jyb;
import p153l.l51;
import p153l.n46;
import p153l.pci;
import p153l.pdi;
import p153l.psd0;
import p153l.qcj;
import p153l.uxj0;
import p153l.wgx;
import p153l.y20;

/* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.home.base.impl.swipe.q0 */
/* JADX INFO: loaded from: classes11.dex */
public class C8070q0 extends AbstractC8022a {

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.home.base.impl.swipe.q0$a */
    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f22863a;

        static {
            int[] iArr = new int[SwipeDirection.values().length];
            f22863a = iArr;
            try {
                iArr[SwipeDirection.UP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f22863a[SwipeDirection.RIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f22863a[SwipeDirection.LEFT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* JADX INFO: renamed from: r */
    public static /* synthetic */ void m38731r(String str) {
        CoreModule.f18272k.f115535c.delete(Filter.AND(Message.CID.mo61359EQ(str), Message.MESSAGETYPE.m61360EQ(MessageType.local_long_time_no_see)));
        CoreModule.f18264c.f20384f0.m33933dh(str, MessageType.get(MessageType.local_long_time_no_see));
    }

    /* JADX INFO: renamed from: s */
    public static /* synthetic */ void m38732s(C8049j.a aVar, uxj0 uxj0Var) {
        if (aVar.m38663a()) {
            CoreModule.f18264c.f20384f0.m33653Fo();
            if (!CoreModule.f18264c.f20381e0.m116600p9().isFemale() || gra.m131565F2()) {
                aVar.f22837b.m38344q2().m21602w4(MatchAct.m48747h2(aVar.f22836a.m101951T4(), jyb.m147507f0(aVar.f22838c.m140259d().f56859id), 44, null, (gra.m131625S1() || gra.m131701j2()) ? "tmp_from_home_swipe" : null), new MatchAct.C8617b());
                return;
            }
            if (gra.m131722n3()) {
                pdi.m171817b0(aVar.f22836a.m101951T4(), aVar.f22838c.m140259d(), false, "long_time_no_see");
            } else if (gra.m131701j2()) {
                wgx.m206283A().m206312L(aVar.f22836a.m101951T4(), aVar.f22838c.m140259d(), false, "long_time_no_see");
            } else {
                pci.m171662K(aVar.f22836a.m101951T4(), aVar.f22838c.m140259d(), 44);
            }
        }
    }

    /* JADX INFO: renamed from: u */
    public static /* synthetic */ void m38734u(Throwable th) {
    }

    @Override // p153l.g6m
    /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
    public boolean mo38501b(C8049j.a aVar) {
        return aVar.f22838c.m140260e().meetAgain;
    }

    /* JADX INFO: renamed from: B */
    public final void m38737B(final String str) {
        l51.m152919y(new Runnable() { // from class: l.skh0
            @Override // java.lang.Runnable
            public final void run() {
                CoreModule.f18264c.f20351U.m128074a(new x20() { // from class: l.tkh0
                    @Override // p153l.x20
                    public final void call() {
                        C8070q0.m38731r(str);
                    }
                });
            }
        });
    }

    @Override // p153l.g6m
    /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
    public VSwipeStack.OnCardSwipeResult mo38500a(final C8049j.a aVar) {
        int i = a.f22863a[aVar.f22839d.ordinal()];
        if (i == 1) {
            return VSwipeStack.OnCardSwipeResult.back;
        }
        if (i == 2 || i == 3) {
            if (!aVar.f22838c.m140260e().disableUndo) {
                CoreModule.f18264c.f20405m0.m32045Q8(aVar.f22838c.m140260e(), aVar.f22841f.m39477i(), aVar.f22839d);
            }
            aVar.f22836a.duringCreated((C22421c) CoreModule.f18264c.f20405m0.m32153u8(aVar.f22838c.m140259d(), aVar.m38663a()).switchMap(new qcj() { // from class: l.nkh0
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return this.f142462a.m38740y(aVar, (uxj0) obj);
                }
            })).subscribe(psd0.m173597H(new y20() { // from class: l.okh0
                @Override // p153l.y20
                public final void call(Object obj) {
                    C8070q0.m38732s(aVar, (uxj0) obj);
                }
            }, new y20() { // from class: l.pkh0
                @Override // p153l.y20
                public final void call(Object obj) {
                    C8070q0.m38734u((Throwable) obj);
                }
            }));
        }
        m38741z(aVar);
        return VSwipeStack.OnCardSwipeResult.pass;
    }

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ uxj0 m38739x(Conversation conversation) {
        if (NullChecker.m82486a(conversation) && NullChecker.m82486a(conversation.additional) && NullChecker.m82486a(conversation.additional.reSwipe) && TEnum.equals(conversation.additional.reSwipe.status, "liked")) {
            if (conversation.localEverHasMessage) {
                n46.m161541g().m161553p(conversation.f56859id, (long) conversation.additional.reSwipe.swipedTime);
            }
            if (!conversation.additional.reSwipe.autoSendMessage) {
                m38737B(conversation.f56859id);
            }
        }
        return uxj0.f181467a;
    }

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ C22421c m38740y(C8049j.a aVar, uxj0 uxj0Var) {
        final String str = aVar.f22838c.m140259d().f56859id;
        return !aVar.m38663a() ? C22421c.just(uxj0.f181467a) : CoreModule.f18264c.f20384f0.m33905ap(str).switchMap(new qcj() { // from class: l.qkh0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return CoreModule.f18264c.f20384f0.m33740Ne(str).first();
            }
        }).map(new qcj() { // from class: l.rkh0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f163620a.m38739x((Conversation) obj);
            }
        });
    }

    /* JADX INFO: renamed from: z */
    public final void m38741z(C8049j.a aVar) {
        i4g0.m138525w(MatchScData.ModuleId.mid_e_card, "p_suggest_users_home_view", jyb.m147494Y("moments_user_id", aVar.f22838c.m140262g()), jyb.m147494Y("card_name", MessageType.normal_card), jyb.m147494Y("direction", aVar.f22839d == SwipeDirection.RIGHT ? "like" : "dislike"), jyb.m147494Y("card_order", ""), jyb.m147494Y("is_show_longtimenosee_tag", 1), jyb.m147494Y("swipe_directions", aVar.f22839d.toString()));
    }
}
