package p153l;

import android.database.Cursor;
import android.text.TextUtils;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.ChatGroup;
import com.p051p1.mobile.putong.core.data.Conversation;
import com.p051p1.mobile.putong.core.data.ConversationType;
import com.p051p1.mobile.putong.core.data.LocalPlaceBan;
import com.p051p1.mobile.putong.core.data.NotificationStatus;
import com.p051p1.mobile.putong.data.ConversationStatus;
import com.p051p1.mobile.putong.data.GPMemo;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.data.tenum.TEnumColumn;
import com.tantanapp.common.data.DbObject;
import com.tantanapp.common.data.orm.BooleanColumn;
import com.tantanapp.common.data.orm.DoubleColumn;
import com.tantanapp.common.data.orm.DoubleOrder;
import com.tantanapp.common.data.orm.Filter;
import com.tantanapp.common.data.orm.FilterList;
import com.tantanapp.common.data.orm.Index;
import com.tantanapp.common.data.orm.IntegerColumn;
import com.tantanapp.common.data.orm.Order;
import com.tantanapp.common.data.orm.SqlSegment;
import com.tantanapp.common.data.orm.StringColumn;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import com.tencent.mmkv.MMKV;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes9.dex */
public class mm6 extends wzh0<Conversation> {

    /* JADX INFO: renamed from: A */
    public wzh0<Conversation>.C21213a f137470A;

    /* JADX INFO: renamed from: B */
    public wzh0<Conversation>.C21213a f137471B;

    /* JADX INFO: renamed from: C */
    public wzh0<Conversation>.C21213a f137472C;

    /* JADX INFO: renamed from: D */
    public wzh0<Conversation>.C21213a f137473D;

    /* JADX INFO: renamed from: E */
    public wzh0<Conversation>.C21213a f137474E;

    /* JADX INFO: renamed from: F */
    public wzh0<Conversation>.C21213a f137475F;

    /* JADX INFO: renamed from: G */
    public r9r<wzh0<Conversation>.C21213a> f137476G;

    /* JADX INFO: renamed from: H */
    public wzh0<Conversation>.C21213a f137477H;

    /* JADX INFO: renamed from: I */
    public final Filter<Conversation> f137478I;

    /* JADX INFO: renamed from: J */
    public final Filter<Conversation> f137479J;

    /* JADX INFO: renamed from: K */
    public r9r<wzh0<Conversation>.C21213a> f137480K;

    /* JADX INFO: renamed from: L */
    public r9r<wzh0<Conversation>.C21213a> f137481L;

    /* JADX INFO: renamed from: M */
    public r9r<wzh0<Conversation>.C21213a> f137482M;

    /* JADX INFO: renamed from: N */
    public r9r<wzh0<Conversation>.C21213a> f137483N;

    /* JADX INFO: renamed from: O */
    public r9r<wzh0<Conversation>.C21213a> f137484O;

    /* JADX INFO: renamed from: P */
    public r9r<wzh0<Conversation>.C21213a> f137485P;

    /* JADX INFO: renamed from: Q */
    public r9r<wzh0<Conversation>.C21213a> f137486Q;

    /* JADX INFO: renamed from: R */
    public r9r<wzh0<Conversation>.C21213a> f137487R;

    /* JADX INFO: renamed from: S */
    public r9r<wzh0<Conversation>.C21213a> f137488S;

    /* JADX INFO: renamed from: T */
    public r9r<wzh0<Conversation>.C21213a> f137489T;

    /* JADX INFO: renamed from: U */
    public wzh0<Conversation>.C21213a f137490U;

    /* JADX INFO: renamed from: V */
    public Filter<Conversation> f137491V;

    /* JADX INFO: renamed from: W */
    public final Filter<Conversation> f137492W;

    /* JADX INFO: renamed from: X */
    public r9r<wzh0<Conversation>.C21213a> f137493X;

    /* JADX INFO: renamed from: Y */
    public r9r<wzh0<Conversation>.C21213a> f137494Y;

    /* JADX INFO: renamed from: m */
    public Filter f137495m;

    /* JADX INFO: renamed from: n */
    public wzh0<Conversation>.C21213a f137496n;

    /* JADX INFO: renamed from: o */
    public r9r<wzh0<Conversation>.C21213a> f137497o;

    /* JADX INFO: renamed from: p */
    public wzh0<Conversation>.C21213a f137498p;

    /* JADX INFO: renamed from: q */
    public wzh0<Conversation>.C21213a f137499q;

    /* JADX INFO: renamed from: r */
    public wzh0<Conversation>.C21213a f137500r;

    /* JADX INFO: renamed from: s */
    public wzh0<Conversation>.C21213a f137501s;

    /* JADX INFO: renamed from: t */
    public wzh0<Conversation>.C21213a f137502t;

    /* JADX INFO: renamed from: u */
    public r9r<Filter<Conversation>> f137503u;

    /* JADX INFO: renamed from: v */
    public r9r<wzh0<Conversation>.C21213a> f137504v;

    /* JADX INFO: renamed from: w */
    public r9r<wzh0<Conversation>.C21213a> f137505w;

    /* JADX INFO: renamed from: x */
    public r9r<wzh0<Conversation>.C21213a> f137506x;

    /* JADX INFO: renamed from: y */
    public wzh0<Conversation>.C21213a f137507y;

    /* JADX INFO: renamed from: z */
    public wzh0<Conversation>.C21213a f137508z;

    /* JADX INFO: renamed from: l.mm6$a */
    public class C18654a extends Filter<Conversation> {
        public C18654a() {
        }

        @Override // com.tantanapp.common.data.orm.Filter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public boolean filter(Conversation conversation) {
            return true;
        }

        @Override // com.tantanapp.common.data.orm.Filter
        public SqlSegment emit() {
            return SqlSegment.TRUE;
        }

        @Override // com.tantanapp.common.data.orm.Filter
        public SqlSegment emitWithPrefix() {
            return SqlSegment.TRUE;
        }
    }

    public mm6(h9c h9cVar, String str, vzf0<Conversation> vzf0Var, List<Index> list, int i) {
        super(h9cVar, str, vzf0Var, list, i);
        StringColumn<Conversation> stringColumn = Conversation.f21114ID;
        this.f137495m = Filter.AND(stringColumn.NEQ(User.ID_LIVE_VIP_SERVICE), stringColumn.NEQ(User.ID_LIVE_SERVICE));
        IntegerColumn<Conversation> integerColumn = Conversation.UNREADMESSAGES;
        Filter<Conversation> filterREQ = integerColumn.REQ(1);
        StringColumn<Conversation> stringColumn2 = Conversation.OTHERUSER;
        Filter filterAND = Filter.AND(filterREQ, stringColumn2.REQ("1"));
        IntegerColumn<Conversation> integerColumn2 = Conversation.LEVEL;
        Order<Conversation> order = integerColumn2.DESC;
        DoubleColumn<Conversation> doubleColumn = Conversation.LATESTTIME;
        this.f137496n = new wzh0.C21213a("unreadUserMessageConversations", filterAND, new DoubleOrder(order, doubleColumn.DESC), 1, 5);
        this.f137497o = r9r.m180653c(new pcj() { // from class: l.im6
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f115660a.m159001R0();
            }
        });
        Filter<Conversation> filterNOT_STARTS_WITH = stringColumn.NOT_STARTS_WITH("fake_conversation");
        TEnumColumn<Conversation, ConversationStatus> tEnumColumn = Conversation.STATUS;
        this.f137498p = new wzh0.C21213a("matches", Filter.AND(filterNOT_STARTS_WITH, Filter.AND(tEnumColumn.NEQ("dismissed"), tEnumColumn.NEQ(ConversationStatus.local_fake), tEnumColumn.NEQ("removed"), tEnumColumn.NEQ(ConversationStatus.invisible), tEnumColumn.NEQ("deleted"))), doubleColumn.DESC, 0, 200);
        Filter<Conversation> filterNOT_STARTS_WITH2 = stringColumn.NOT_STARTS_WITH("fake_conversation");
        StringColumn<Conversation> stringColumn3 = Conversation.CONVTYPE;
        this.f137499q = new wzh0.C21213a("user_matches_without_group", Filter.AND(filterNOT_STARTS_WITH2, stringColumn3.NEQ("group"), Filter.AND(tEnumColumn.NEQ("dismissed"), tEnumColumn.NEQ("removed"), tEnumColumn.NEQ(ConversationStatus.invisible), tEnumColumn.NEQ("deleted"))), new DoubleOrder(integerColumn2.DESC, doubleColumn.DESC), 0, 200);
        this.f137500r = new wzh0.C21213a("matchesWithoutFakeGroupChat", Filter.AND(stringColumn.NOT_STARTS_WITH("fake_conversation"), m159042x0(), Filter.AND(stringColumn3.mo61359EQ(gta.m132210e().m132214d().mo34775W7()), tEnumColumn.NEQ("dismissed"), tEnumColumn.NEQ(ConversationStatus.local_fake), tEnumColumn.NEQ("removed"), tEnumColumn.NEQ(ConversationStatus.invisible), tEnumColumn.NEQ("deleted"))), new DoubleOrder(integerColumn2.DESC, doubleColumn.DESC), 0, 200);
        this.f137501s = new wzh0.C21213a("matchesWithoutFakeGroupChatWithoutLiveUser", Filter.AND(stringColumn.NOT_STARTS_WITH("fake_conversation"), this.f137495m, m159042x0(), Filter.AND(stringColumn3.mo61359EQ(gta.m132210e().m132214d().mo34775W7()), tEnumColumn.NEQ("dismissed"), tEnumColumn.NEQ(ConversationStatus.local_fake), tEnumColumn.NEQ("removed"), tEnumColumn.NEQ(ConversationStatus.invisible), tEnumColumn.NEQ("deleted"))), new DoubleOrder(integerColumn2.DESC, doubleColumn.DESC), 0, 200);
        this.f137502t = new wzh0.C21213a("addressBookWithoutFakeGroupChatList", Filter.AND(stringColumn.NOT_STARTS_WITH("fake_conversation"), this.f137495m, Filter.AND(Filter.m82444OR(stringColumn3.mo61359EQ(gta.m132210e().m132214d().mo34775W7()), stringColumn3.mo61359EQ(ConversationType.virtualvoice)), tEnumColumn.NEQ("dismissed"), tEnumColumn.NEQ(ConversationStatus.local_fake), tEnumColumn.NEQ("removed"), tEnumColumn.NEQ(ConversationStatus.invisible), tEnumColumn.NEQ("deleted"))), new DoubleOrder(integerColumn2.DESC, doubleColumn.DESC), 0, 200);
        this.f137503u = r9r.m180653c(new pcj() { // from class: l.sl6
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return mm6.m158967Q();
            }
        });
        this.f137504v = r9r.m180653c(new pcj() { // from class: l.ul6
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f179484a.m159002S0();
            }
        });
        this.f137505w = r9r.m180653c(new pcj() { // from class: l.wl6
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f189654a.m159003T0();
            }
        });
        this.f137506x = r9r.m180653c(new pcj() { // from class: l.xl6
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f194862a.m159004U0();
            }
        });
        Filter<Conversation> filterNOT_STARTS_WITH3 = stringColumn.NOT_STARTS_WITH("fake_conversation");
        Filter<Conversation> filterM61360EQ = tEnumColumn.m61360EQ("dismissed");
        StringColumn<Conversation> stringColumn4 = Conversation.OTHERSTATUS;
        Filter filterAND2 = Filter.AND(filterNOT_STARTS_WITH3, filterM61360EQ, stringColumn4.NEQ("invalid"), stringColumn3.NEQ("timeLimited"));
        DoubleColumn<Conversation> doubleColumn2 = Conversation.UPDATEDTIME;
        this.f137507y = new wzh0.C21213a("matches_deleted", filterAND2, doubleColumn2.DESC, 0, 200);
        this.f137508z = new wzh0.C21213a("is_otherStatus_invalid", Filter.AND(stringColumn.NOT_STARTS_WITH("fake_conversation"), tEnumColumn.m61360EQ("dismissed"), stringColumn4.mo61359EQ("invalid"), stringColumn3.NEQ("timeLimited")), doubleColumn2.DESC, 0, 1);
        this.f137470A = new wzh0.C21213a("all_matches_without_del_and_fake", Filter.AND(stringColumn.NOT_STARTS_WITH("fake_conversation"), Filter.AND(stringColumn.NOT_STARTS_WITH("-"), stringColumn.NOT_STARTS_WITH("fake_conversation"), stringColumn.NOT_STARTS_WITH("conversation_feed_state"), stringColumn.NOT_STARTS_WITH("conversation_feed_interaction"), stringColumn.NOT_STARTS_WITH("conversation_feed_featured")), tEnumColumn.NEQ("deleted"), stringColumn3.mo61359EQ("default"), stringColumn4.NEQ("invalid"), tEnumColumn.NEQ("dismissed")), doubleColumn2.DESC, 0, 200);
        this.f137471B = new wzh0.C21213a("del_matches", Filter.AND(stringColumn.NOT_STARTS_WITH("fake_conversation"), m159042x0(), tEnumColumn.m61360EQ("removed")), new DoubleOrder(integerColumn2.DESC, doubleColumn2.DESC), 0, 200);
        this.f137472C = new wzh0.C21213a("hide_matches", Filter.AND(stringColumn.NOT_STARTS_WITH("fake_conversation"), m159042x0(), tEnumColumn.m61360EQ(ConversationStatus.invisible)), new DoubleOrder(integerColumn2.DESC, doubleColumn2.DESC), 0, 200);
        Filter<Conversation> filterNOT_STARTS_WITH4 = stringColumn.NOT_STARTS_WITH("fake_conversation");
        Filter filterAND3 = Filter.AND(tEnumColumn.NEQ(ConversationStatus.local_fake), tEnumColumn.NEQ("dismissed"), tEnumColumn.NEQ("removed"), tEnumColumn.NEQ(ConversationStatus.invisible), tEnumColumn.NEQ("deleted"));
        BooleanColumn<Conversation> booleanColumn = Conversation.LOCALHASMESSAGE;
        this.f137473D = new wzh0.C21213a("conversations_without_fake", Filter.AND(filterNOT_STARTS_WITH4, filterAND3, booleanColumn.m82407T()), new DoubleOrder(integerColumn2.DESC, doubleColumn.DESC), 0, 200);
        this.f137474E = new wzh0.C21213a("all_conversations_without_fake", Filter.AND(stringColumn.NOT_STARTS_WITH("fake_conversation")), new DoubleOrder(integerColumn2.DESC, doubleColumn.DESC), 0, 200);
        this.f137475F = new wzh0.C21213a("user_conversations_without_group", Filter.AND(stringColumn.NOT_STARTS_WITH("fake_conversation"), stringColumn3.NEQ("group"), Filter.AND(tEnumColumn.NEQ("dismissed"), tEnumColumn.NEQ("removed"), tEnumColumn.NEQ(ConversationStatus.invisible), tEnumColumn.NEQ("deleted")), booleanColumn.m82407T()), new DoubleOrder(integerColumn2.DESC, doubleColumn.DESC), 0, 200);
        this.f137476G = r9r.m180653c(new pcj() { // from class: l.yl6
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f200531a.m158988E0();
            }
        });
        this.f137477H = new wzh0.C21213a("conversations_exposure", Filter.AND(stringColumn.NOT_STARTS_WITH("fake_conversation"), integerColumn2.mo61359EQ(50), Filter.AND(tEnumColumn.NEQ(ConversationStatus.local_fake), tEnumColumn.NEQ("dismissed"), tEnumColumn.NEQ("removed"), tEnumColumn.NEQ(ConversationStatus.invisible), tEnumColumn.NEQ("deleted"))), new DoubleOrder(integerColumn2.DESC, doubleColumn.DESC), 0, 200);
        Filter<Conversation> filterM82444OR = Filter.m82444OR(stringColumn.NOT_STARTS_WITH("fake_conversation"), stringColumn.STARTS_WITH("fake_conversation_greeting"), stringColumn.STARTS_WITH("fake_conversation_anonymous_greeting"), stringColumn.STARTS_WITH("fake_conversation_oof_pick"), stringColumn.STARTS_WITH("fake_conversation_oof_enter"), stringColumn.STARTS_WITH("fake_conversation_profile_featured"), stringColumn.STARTS_WITH("fake_conversation_city_centre_enter"), stringColumn.STARTS_WITH("fake_conversation_fold_conversation"), stringColumn.STARTS_WITH("fake_conversation_weaken_conversation"), stringColumn.STARTS_WITH("fake_conversation_live_activities"), stringColumn.STARTS_WITH("fake_conversation_profile_like_enter"), stringColumn.STARTS_WITH("fake_conversation_blindbox_enter"), stringColumn.STARTS_WITH("fake_conversation_local_summary_marriage_conversation"), stringColumn.STARTS_WITH("fake_conversation_surprise_gift_box"), stringColumn.STARTS_WITH("fake_conversation_local_limited_trial_see_fold"), stringColumn.STARTS_WITH("fake_conversation_local_instant_chat_conversation"));
        this.f137478I = filterM82444OR;
        this.f137479J = Filter.AND(filterM82444OR, stringColumn.NOT_STARTS_WITH("fake_conversation_profile_featured"), stringColumn.NOT_STARTS_WITH("fake_conversation_greeting"), stringColumn.NOT_STARTS_WITH("fake_conversation_anonymous_greeting"));
        this.f137480K = r9r.m180653c(new pcj() { // from class: l.zl6
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f204881a.m158989F0();
            }
        });
        this.f137481L = r9r.m180653c(new pcj() { // from class: l.am6
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f72201a.m158990G0();
            }
        });
        this.f137482M = r9r.m180653c(new pcj() { // from class: l.bm6
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f77270a.m158991H0();
            }
        });
        this.f137483N = r9r.m180653c(new pcj() { // from class: l.cm6
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f82516a.m158992I0();
            }
        });
        this.f137484O = r9r.m180653c(new pcj() { // from class: l.jm6
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f121643a.m158993J0();
            }
        });
        this.f137485P = r9r.m180653c(new pcj() { // from class: l.km6
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f127440a.m158994K0();
            }
        });
        this.f137486Q = r9r.m180653c(new pcj() { // from class: l.lm6
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f132648a.m158995L0();
            }
        });
        this.f137487R = r9r.m180653c(new pcj() { // from class: l.ll6
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f132526a.m158996M0();
            }
        });
        this.f137488S = r9r.m180653c(new pcj() { // from class: l.ml6
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f137364a.m158997N0();
            }
        });
        this.f137489T = r9r.m180653c(new pcj() { // from class: l.nl6
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f142509a.m158998O0();
            }
        });
        BooleanColumn<Conversation> booleanColumn2 = Conversation.READ;
        this.f137490U = new wzh0.C21213a("user_last_conv_without_group", Filter.AND(booleanColumn2.m82407T(), stringColumn.NOT_STARTS_WITH("fake_conversation"), stringColumn3.NEQ("group"), stringColumn2.NOT_STARTS_WITH("-"), Conversation.LOCALEVERHASMESSAGE.m82407T(), Conversation.USERMESSAGECOUNT.REQ(0), Filter.AND(tEnumColumn.NEQ("dismissed"), tEnumColumn.NEQ("removed"), tEnumColumn.NEQ(ConversationStatus.invisible), tEnumColumn.NEQ("deleted"))), doubleColumn.DESC, 0, 1);
        this.f137491V = Filter.m82444OR(Filter.AND(stringColumn.STARTS_WITH("-"), stringColumn.NEQ(User.ID_LIVE_VIP_SERVICE), stringColumn.NEQ(User.ID_VERIVICATION_ASSISTANT)), stringColumn.STARTS_WITH("fake_conversation_oof_pick"), stringColumn.STARTS_WITH("fake_conversation_oof_enter"), stringColumn.STARTS_WITH("fake_conversation_profile_featured"), stringColumn.STARTS_WITH("fake_conversation_blindbox_enter"), stringColumn.STARTS_WITH("fake_conversation_profile_like_enter"), stringColumn.STARTS_WITH("fake_conversation_surprise_gift_box"));
        this.f137492W = Filter.AND(Filter.m82444OR(stringColumn.NOT_STARTS_WITH("-"), stringColumn.STARTS_WITH(User.ID_LIVE_VIP_SERVICE), stringColumn.STARTS_WITH(User.ID_VERIVICATION_ASSISTANT)), Filter.m82444OR(stringColumn.NOT_STARTS_WITH("fake_conversation"), stringColumn.STARTS_WITH("fake_conversation_greeting"), stringColumn.STARTS_WITH("fake_conversation_anonymous_greeting"), stringColumn.STARTS_WITH("fake_conversation_city_centre_enter"), stringColumn.STARTS_WITH("fake_conversation_fold_conversation"), stringColumn.STARTS_WITH("fake_conversation_weaken_conversation"), stringColumn.STARTS_WITH("fake_conversation_live_activities"), stringColumn.STARTS_WITH("fake_conversation_local_summary_marriage_conversation"), stringColumn.STARTS_WITH("fake_conversation_local_team_group_conversation"), stringColumn.STARTS_WITH("fake_conversation_local_limited_trial_see_fold"), stringColumn.STARTS_WITH("fake_conversation_local_instant_chat_conversation")));
        this.f137493X = r9r.m180653c(new pcj() { // from class: l.ol6
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f147811a.m158999P0();
            }
        });
        this.f137494Y = r9r.m180653c(new pcj() { // from class: l.pl6
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f152996a.m159000Q0();
            }
        });
        this.f191759c = new pf60<>(uqb0.f180405k0.f184355d, new bkj0(new qcj() { // from class: l.ql6
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return DbObject.f56857ID.m82451IN(jyb.m147489T((List) obj, new qcj() { // from class: l.dm6
                    @Override // p153l.qcj
                    public final Object call(Object obj2) {
                        return ((Conversation) obj2).f56859id;
                    }
                }));
            }
        }, new pcj() { // from class: l.rl6
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return mm6.m158969S();
            }
        }, -1));
        this.f191761e = new HashMap(2);
        this.f191761e.put("counter_trigger", new h0i0(jyb.m147507f0(booleanColumn2, Conversation.READUNTIL, integerColumn, Conversation.ISFAKE, tEnumColumn, integerColumn2), new x20() { // from class: l.tl6
            @Override // p153l.x20
            public final void call() {
                CoreModule.f18264c.f20384f0.m33941dq(uqb0.f180376H.guessedCurrentServerTime());
            }
        }));
    }

    /* JADX INFO: renamed from: Q */
    public static /* synthetic */ Filter m158967Q() {
        StringColumn<Conversation> stringColumn = Conversation.CONVTYPE;
        Filter<Conversation> filterNEQ = stringColumn.NEQ("quickchat");
        TEnumColumn<Conversation, ConversationStatus> tEnumColumn = Conversation.STATUS;
        return Filter.m82444OR(Filter.AND(filterNEQ, tEnumColumn.NEQ(ConversationStatus.peeking)), Filter.AND(Conversation.CREATEDTIME.LEQ(gta.m132210e().m132214d().mo34839go()), Filter.m82444OR(stringColumn.mo61359EQ("quickchat"), tEnumColumn.m61360EQ(ConversationStatus.peeking))));
    }

    /* JADX INFO: renamed from: S */
    public static /* synthetic */ Order m158969S() {
        return null;
    }

    /* JADX INFO: renamed from: A0 */
    public wzh0<Conversation>.C21213a m158984A0() {
        Filter<Conversation> filterAND = gta.m132210e().m132214d().mo34748R8() ? Filter.AND(Conversation.CONVTYPE.NEQ("lovebuzz"), Conversation.LOCALEVERHASMESSAGE.m82406F()) : Conversation.LOCALEVERHASMESSAGE.m82406F();
        Filter<Conversation> filterNOT_STARTS_WITH = Conversation.f21114ID.NOT_STARTS_WITH("fake_conversation");
        Filter filter = this.f137495m;
        TEnumColumn<Conversation, ConversationStatus> tEnumColumn = Conversation.STATUS;
        return new wzh0.C21213a("intlMatchConversationOrder", Filter.AND(filterNOT_STARTS_WITH, filter, Filter.AND(tEnumColumn.NEQ("dismissed"), tEnumColumn.NEQ(ConversationStatus.local_fake), tEnumColumn.NEQ("removed"), tEnumColumn.NEQ(ConversationStatus.invisible), tEnumColumn.NEQ("deleted"), filterAND), m159037s0()), new DoubleOrder(Conversation.LEVEL.DESC, Conversation.LATESTTIME.DESC), 0, 200);
    }

    /* JADX INFO: renamed from: B0 */
    public wzh0<Conversation>.C21213a m158985B0() {
        Filter<Conversation> filterNOT_STARTS_WITH = Conversation.f21114ID.NOT_STARTS_WITH("fake_conversation");
        TEnumColumn<Conversation, ConversationStatus> tEnumColumn = Conversation.STATUS;
        return new wzh0.C21213a("intlWhisperConversationOrder", Filter.AND(filterNOT_STARTS_WITH, Filter.AND(tEnumColumn.NEQ("dismissed"), tEnumColumn.NEQ(ConversationStatus.local_fake), tEnumColumn.NEQ("removed"), tEnumColumn.NEQ(ConversationStatus.invisible), tEnumColumn.NEQ("deleted")), Conversation.CONVTYPE.mo61359EQ(ConversationType.swiper)), Conversation.LATESTTIME.DESC, 0, 200);
    }

    /* JADX INFO: renamed from: C0 */
    public r9r<wzh0<Conversation>.C21213a> m158986C0() {
        return r9r.m180653c(new pcj() { // from class: l.hm6
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f110600a.m158987D0();
            }
        });
    }

    /* JADX INFO: renamed from: D0 */
    public final /* synthetic */ wzh0.C21213a m158987D0() {
        return new wzh0.C21213a("invalid_conversation_list", Filter.AND(Conversation.OTHERSTATUS.mo61359EQ("invalid"), Conversation.STATUS.NEQ("dismissed"), Conversation.LOCALEVERHASMESSAGE.m82407T()), new DoubleOrder(Conversation.LEVEL.DESC, Conversation.UPDATEDTIME.DESC), 0, 200);
    }

    /* JADX INFO: renamed from: E0 */
    public final /* synthetic */ wzh0.C21213a m158988E0() {
        StringColumn<Conversation> stringColumn = Conversation.f21114ID;
        return new wzh0.C21213a("newest_conversation", Filter.AND(stringColumn.NOT_STARTS_WITH("fake_conversation"), stringColumn.NOT_STARTS_WITH("-"), Conversation.CONVTYPE.mo61359EQ("default")), Conversation.CREATEDTIME.DESC, 1, 1);
    }

    /* JADX INFO: renamed from: F0 */
    public final /* synthetic */ wzh0.C21213a m158989F0() {
        return new wzh0.C21213a("conversations_new_without_fake", m159036r0(), new DoubleOrder(Conversation.LEVEL.DESC, Conversation.LATESTTIME.DESC), 0, 200);
    }

    /* JADX INFO: renamed from: G0 */
    public final /* synthetic */ wzh0.C21213a m158990G0() {
        IntegerColumn<Conversation> integerColumn = Conversation.LEVEL;
        Filter<Conversation> filterMo61359EQ = integerColumn.mo61359EQ(0);
        StringColumn<Conversation> stringColumn = Conversation.f21114ID;
        return new wzh0.C21213a("conversations_weaken_fold", Filter.AND(filterMo61359EQ, stringColumn.NOT_STARTS_WITH("-"), stringColumn.NOT_STARTS_WITH("fake_conversation"), stringColumn.NOT_STARTS_WITH("conversation_feed_state"), stringColumn.NOT_STARTS_WITH("conversation"), m159036r0()), new DoubleOrder(integerColumn.DESC, Conversation.LATESTTIME.DESC), 0, 50);
    }

    /* JADX INFO: renamed from: H0 */
    public final /* synthetic */ wzh0.C21213a m158991H0() {
        return new wzh0.C21213a("conversations_new_marriage", m159038t0(), Conversation.LATESTTIME.DESC, 0, 200);
    }

    /* JADX INFO: renamed from: I0 */
    public final /* synthetic */ wzh0.C21213a m158992I0() {
        return new wzh0.C21213a("conversations_new_marriage_unread", m159039u0(), Conversation.LATESTTIME.DESC, 0, 200);
    }

    /* JADX INFO: renamed from: J0 */
    public final /* synthetic */ wzh0.C21213a m158993J0() {
        return new wzh0.C21213a("conversations_love_buzz", Filter.AND(Conversation.CONVTYPE.mo61359EQ("lovebuzz"), Conversation.STATUS.NEQ("deleted")), Conversation.LATESTTIME.DESC, 0, 200);
    }

    /* JADX INFO: renamed from: K0 */
    public final /* synthetic */ wzh0.C21213a m158994K0() {
        Filter<Conversation> filterM159036r0 = m159036r0();
        DoubleColumn<Conversation> doubleColumn = Conversation.LATESTTIME;
        Filter<Conversation> filterREQ = doubleColumn.REQ(Double.valueOf(CoreModule.f18264c.f20384f0.m33979hg()));
        Filter<Conversation> filterMo61359EQ = Conversation.f21114ID.mo61359EQ("fake_conversation_fold_conversation");
        IntegerColumn<Conversation> integerColumn = Conversation.LEVEL;
        return new wzh0.C21213a("conversations_new_without_fake_container_fold", Filter.AND(filterM159036r0, Filter.m82444OR(filterREQ, filterMo61359EQ, integerColumn.REQ(1))), new DoubleOrder(integerColumn.DESC, doubleColumn.DESC), 0, 200);
    }

    /* JADX INFO: renamed from: L0 */
    public final /* synthetic */ wzh0.C21213a m158995L0() {
        Filter<Conversation> filterM159036r0 = m159036r0();
        StringColumn<Conversation> stringColumn = Conversation.f21114ID;
        return new wzh0.C21213a("conversation_without_fake_without_message", Filter.AND(filterM159036r0, stringColumn.NEQ("fake_conversation_fold_conversation"), stringColumn.NEQ("fake_conversation_weaken_conversation"), Conversation.f21115MM.LEQ(0), Conversation.LOCALHASMESSAGE.m82406F(), Conversation.UNREADMESSAGES.LEQ(0), Conversation.USERMESSAGECOUNT.LEQ(0), Conversation.READUNTIL.mo61359EQ("")), new DoubleOrder(Conversation.LEVEL.DESC, Conversation.LATESTTIME.DESC), 0, 50);
    }

    /* JADX INFO: renamed from: M0 */
    public final /* synthetic */ wzh0.C21213a m158996M0() {
        Filter<Conversation> filterM159036r0 = m159036r0();
        StringColumn<Conversation> stringColumn = Conversation.f21114ID;
        Filter<Conversation> filterNEQ = stringColumn.NEQ("fake_conversation_fold_conversation");
        Filter<Conversation> filterNEQ2 = stringColumn.NEQ("fake_conversation_weaken_conversation");
        DoubleColumn<Conversation> doubleColumn = Conversation.LATESTTIME;
        Filter<Conversation> filterLEQ = doubleColumn.LEQ(Double.valueOf(CoreModule.f18264c.f20384f0.m33979hg()));
        IntegerColumn<Conversation> integerColumn = Conversation.LEVEL;
        return new wzh0.C21213a("conversations_new_without_fake_fold", Filter.AND(filterM159036r0, filterNEQ, filterNEQ2, filterLEQ, integerColumn.mo61359EQ(0)), new DoubleOrder(integerColumn.DESC, doubleColumn.DESC), 0, 200);
    }

    /* JADX INFO: renamed from: N0 */
    public final /* synthetic */ wzh0.C21213a m158997N0() {
        Filter<Conversation> filterM159036r0 = m159036r0();
        StringColumn<Conversation> stringColumn = Conversation.f21114ID;
        Filter<Conversation> filterNEQ = stringColumn.NEQ("fake_conversation_fold_conversation");
        Filter<Conversation> filterNEQ2 = stringColumn.NEQ("fake_conversation_weaken_conversation");
        DoubleColumn<Conversation> doubleColumn = Conversation.LATESTTIME;
        Filter<Conversation> filterLEQ = doubleColumn.LEQ(Double.valueOf(CoreModule.f18264c.f20384f0.m33580Ag()));
        Filter<Conversation> filterNEQ3 = Conversation.UNREADMESSAGES.NEQ(0);
        IntegerColumn<Conversation> integerColumn = Conversation.LEVEL;
        return new wzh0.C21213a("conversations_new_without_fake_weaken_unread", Filter.AND(filterM159036r0, filterNEQ, filterNEQ2, filterLEQ, filterNEQ3, integerColumn.mo61359EQ(0)), new DoubleOrder(integerColumn.DESC, doubleColumn.DESC), 0, 20);
    }

    /* JADX INFO: renamed from: O0 */
    public final /* synthetic */ wzh0.C21213a m158998O0() {
        Filter<Conversation> filterM159036r0 = m159036r0();
        StringColumn<Conversation> stringColumn = Conversation.f21114ID;
        Filter<Conversation> filterNEQ = stringColumn.NEQ("fake_conversation_fold_conversation");
        Filter<Conversation> filterNEQ2 = stringColumn.NEQ("fake_conversation_weaken_conversation");
        DoubleColumn<Conversation> doubleColumn = Conversation.LATESTTIME;
        Filter<Conversation> filterLEQ = doubleColumn.LEQ(Double.valueOf(Math.max(CoreModule.f18264c.f20384f0.m33580Ag(), CoreModule.f18264c.f20384f0.m33979hg())));
        Filter<Conversation> filterREQ = doubleColumn.REQ(Double.valueOf(Math.min(CoreModule.f18264c.f20384f0.m33580Ag(), CoreModule.f18264c.f20384f0.m33979hg())));
        IntegerColumn<Conversation> integerColumn = Conversation.LEVEL;
        return new wzh0.C21213a("conversations_between_fold_and_weaken", Filter.AND(filterM159036r0, filterNEQ, filterNEQ2, filterLEQ, filterREQ, integerColumn.mo61359EQ(0)), new DoubleOrder(integerColumn.DESC, doubleColumn.DESC), 0, 20);
    }

    /* JADX INFO: renamed from: P0 */
    public final /* synthetic */ wzh0.C21213a m158999P0() {
        Filter<Conversation> filterSTARTS_WITH = Conversation.f21114ID.STARTS_WITH("-");
        TEnumColumn<Conversation, ConversationStatus> tEnumColumn = Conversation.STATUS;
        return new wzh0.C21213a("conversations_team", Filter.AND(filterSTARTS_WITH, tEnumColumn.NEQ(ConversationStatus.local_fake), tEnumColumn.NEQ("dismissed"), tEnumColumn.NEQ("removed"), tEnumColumn.NEQ(ConversationStatus.invisible), tEnumColumn.NEQ("deleted"), Conversation.OTHERSTATUS.NEQ("invalid")), Conversation.LATESTTIME.DESC, 0, 200);
    }

    /* JADX INFO: renamed from: Q0 */
    public final /* synthetic */ wzh0.C21213a m159000Q0() {
        Filter<Conversation> filter = this.f137491V;
        TEnumColumn<Conversation, ConversationStatus> tEnumColumn = Conversation.STATUS;
        return new wzh0.C21213a("conversations_team", Filter.AND(filter, tEnumColumn.NEQ(ConversationStatus.local_fake), tEnumColumn.NEQ("dismissed"), tEnumColumn.NEQ("removed"), tEnumColumn.NEQ(ConversationStatus.invisible), tEnumColumn.NEQ("deleted"), Conversation.OTHERSTATUS.NEQ("invalid")), Conversation.LATESTTIME.DESC, 0, 200);
    }

    /* JADX INFO: renamed from: R0 */
    public final /* synthetic */ wzh0.C21213a m159001R0() {
        Filter filterM82444OR = Filter.TRUE;
        if (gta.m132210e().m132214d().mo34811c()) {
            filterM82444OR = Filter.m82444OR(Conversation.CONVTYPE.NEQ("quickchat"), Conversation.READ.m82407T(), Conversation.READUNTIL.NEQ(""));
        }
        TEnumColumn<Conversation, NotificationStatus> tEnumColumn = Conversation.LOCALNOTIFICATIONSTATUS;
        Filter filterM82444OR2 = Filter.m82444OR(tEnumColumn.m61360EQ("ongoing"), tEnumColumn.m61360EQ("pending"));
        TEnumColumn<Conversation, ConversationStatus> tEnumColumn2 = Conversation.STATUS;
        return new wzh0.C21213a("sysnotif", Filter.AND(filterM82444OR2, tEnumColumn2.NEQ("dismissed"), tEnumColumn2.NEQ(ConversationStatus.local_fake), tEnumColumn2.NEQ("removed"), tEnumColumn2.NEQ(ConversationStatus.invisible), tEnumColumn2.NEQ("deleted"), filterM82444OR), new DoubleOrder(Conversation.LEVEL.DESC, Conversation.LATESTTIME.DESC), 50, 50);
    }

    /* JADX INFO: renamed from: S0 */
    public final /* synthetic */ wzh0.C21213a m159002S0() {
        return new wzh0.C21213a("new_matches_without_fake_last_time", Filter.AND(Filter.AND(m159010a1().toFilters())), Conversation.LATESTTIME.DESC, 0, 200);
    }

    /* JADX INFO: renamed from: T0 */
    public final /* synthetic */ wzh0.C21213a m159003T0() {
        return new wzh0.C21213a("new_matches_without_fake_create_time", Filter.AND(Filter.AND(m159010a1().toFilters())), Conversation.CREATEDTIME.DESC, 0, 200);
    }

    /* JADX INFO: renamed from: U0 */
    public final /* synthetic */ wzh0.C21213a m159004U0() {
        FilterList<Conversation> filterListM159010a1 = m159010a1();
        filterListM159010a1.add(Conversation.ADDITIONAL_RESWIPE.NOT_NULL());
        filterListM159010a1.add(Conversation.STATUS.NEQ("blocked"));
        return new wzh0.C21213a("chat_re_swiped", Filter.AND(filterListM159010a1.toFilters()), Conversation.UPDATEDTIME.DESC, 0, 200);
    }

    /* JADX INFO: renamed from: V0 */
    public wzh0<Conversation>.C21213a m159005V0(String str) {
        return new wzh0.C21213a("match", Conversation.OTHERUSER.mo61359EQ(str), Conversation.LATESTTIME.DESC, 0, 1);
    }

    /* JADX INFO: renamed from: W0 */
    public wzh0<Conversation>.C21213a m159006W0(List<String> list) {
        if (list == null) {
            list = new ArrayList<>();
        }
        list.add("");
        Filter<Conversation> filterNOT_STARTS_WITH = Conversation.f21114ID.NOT_STARTS_WITH("fake_conversation");
        StringColumn<Conversation> stringColumn = Conversation.OTHERUSER;
        Filter<Conversation> filterNOT_IN = stringColumn.NOT_IN(list);
        StringColumn<Conversation> stringColumn2 = Conversation.CONVTYPE;
        Filter<Conversation> filterNEQ = stringColumn2.NEQ("group");
        Filter<Conversation> filterNEQ2 = stringColumn2.NEQ("anonymous");
        TEnumColumn<Conversation, ConversationStatus> tEnumColumn = Conversation.STATUS;
        return new wzh0.C21213a("matches_exclude_team_account_and_locked_quickchat", Filter.AND(filterNOT_STARTS_WITH, filterNOT_IN, filterNEQ, filterNEQ2, Filter.AND(tEnumColumn.NEQ("blocked"), tEnumColumn.NEQ("dismissed"), tEnumColumn.NEQ(ConversationStatus.local_fake), tEnumColumn.NEQ("removed"), tEnumColumn.NEQ(ConversationStatus.invisible), tEnumColumn.NEQ("deleted")), stringColumn.NOT_STARTS_WITH("-"), Filter.m82444OR(stringColumn2.NEQ("quickchat"), Conversation.f21115MM.REQ(20))), new DoubleOrder(Conversation.LEVEL.DESC, Conversation.LATESTTIME.DESC), 0, 200);
    }

    /* JADX INFO: renamed from: X0 */
    public wzh0<Conversation>.C21213a m159007X0(double d) {
        return new wzh0.C21213a("matchesToday", Filter.AND(Conversation.CREATEDTIME.REQ(Double.valueOf(d)), Conversation.f21114ID.NOT_STARTS_WITH("fake_conversation")), Conversation.LATESTTIME.DESC, 0, 200);
    }

    /* JADX INFO: renamed from: Y0 */
    public wzh0<Conversation>.C21213a m159008Y0() {
        Filter<Conversation> filterNOT_STARTS_WITH = Conversation.f21114ID.NOT_STARTS_WITH("fake_conversation");
        TEnumColumn<Conversation, ConversationStatus> tEnumColumn = Conversation.STATUS;
        return new wzh0.C21213a("matchesWithDoubleOrder", Filter.AND(filterNOT_STARTS_WITH, Filter.AND(tEnumColumn.NEQ("dismissed"), tEnumColumn.NEQ(ConversationStatus.local_fake), tEnumColumn.NEQ("removed"), tEnumColumn.NEQ(ConversationStatus.invisible), tEnumColumn.NEQ("deleted")), m159037s0()), new DoubleOrder(Conversation.LEVEL.DESC, Conversation.LATESTTIME.DESC), 0, 200);
    }

    /* JADX INFO: renamed from: Z0 */
    public wzh0<Conversation>.C21213a m159009Z0() {
        Filter<Conversation> filterNOT_STARTS_WITH = Conversation.f21114ID.NOT_STARTS_WITH("fake_conversation");
        Filter filter = this.f137495m;
        TEnumColumn<Conversation, ConversationStatus> tEnumColumn = Conversation.STATUS;
        return new wzh0.C21213a("matchesWithDoubleOrder", Filter.AND(filterNOT_STARTS_WITH, filter, Filter.AND(tEnumColumn.NEQ("dismissed"), tEnumColumn.NEQ(ConversationStatus.local_fake), tEnumColumn.NEQ("removed"), tEnumColumn.NEQ(ConversationStatus.invisible), tEnumColumn.NEQ("deleted")), m159037s0()), new DoubleOrder(Conversation.LEVEL.DESC, Conversation.LATESTTIME.DESC), 0, 200);
    }

    /* JADX INFO: renamed from: a1 */
    public FilterList<Conversation> m159010a1() {
        return gta.m132210e().m132214d().mo34838gn() ? m159012c1() : m159011b1();
    }

    /* JADX INFO: renamed from: b1 */
    public FilterList<Conversation> m159011b1() {
        Filter<Conversation> filterNEQ = Filter.TRUE;
        if (gta.m132210e().m132214d().mo34811c()) {
            filterNEQ = Conversation.CONVTYPE.NEQ("quickchat");
        }
        Filter<Conversation> filter = filterNEQ;
        Filter<Conversation> filterNOT_STARTS_WITH = Conversation.f21114ID.NOT_STARTS_WITH("fake_conversation");
        Filter<Conversation> filterNEQ2 = Conversation.OTHERSTATUS.NEQ("invalid");
        TEnumColumn<Conversation, ConversationStatus> tEnumColumn = Conversation.STATUS;
        return FilterList.list(filterNOT_STARTS_WITH, filterNEQ2, tEnumColumn.NEQ("dismissed"), tEnumColumn.NEQ("removed"), tEnumColumn.NEQ(ConversationStatus.invisible), tEnumColumn.NEQ("deleted"), tEnumColumn.NEQ(ConversationStatus.local_fake), this.f137503u.m180655b(), Conversation.LOCALEVERHASMESSAGE.m82406F(), filter);
    }

    /* JADX INFO: renamed from: c1 */
    public FilterList<Conversation> m159012c1() {
        Filter<Conversation> filterNEQ = Filter.TRUE;
        if (gta.m132210e().m132214d().mo34811c()) {
            filterNEQ = Conversation.CONVTYPE.NEQ("quickchat");
        }
        Filter<Conversation> filter = filterNEQ;
        Filter<Conversation> filterNOT_STARTS_WITH = Conversation.f21114ID.NOT_STARTS_WITH("fake_conversation");
        Filter<Conversation> filterNEQ2 = Conversation.OTHERSTATUS.NEQ("invalid");
        TEnumColumn<Conversation, ConversationStatus> tEnumColumn = Conversation.STATUS;
        return FilterList.list(filterNOT_STARTS_WITH, filterNEQ2, tEnumColumn.NEQ("dismissed"), tEnumColumn.NEQ("removed"), tEnumColumn.NEQ(ConversationStatus.invisible), tEnumColumn.NEQ("deleted"), tEnumColumn.NEQ("blocked"), this.f137503u.m180655b(), Conversation.LOCALEVERHASMESSAGE.m82406F(), filter);
    }

    /* JADX INFO: renamed from: d1 */
    public Conversation m159013d1(String str) {
        List<Conversation> listQuery = CoreModule.f18272k.f115545m.query(Conversation.OTHERUSER.mo61359EQ(str), null, 1);
        if (listQuery.isEmpty()) {
            return null;
        }
        return listQuery.get(0);
    }

    /* JADX INFO: renamed from: e1 */
    public List<String> m159014e1() {
        ArrayList arrayList = new ArrayList();
        TEnumColumn<Conversation, ConversationStatus> tEnumColumn = Conversation.STATUS;
        SqlSegment sqlSegmentEmit = Filter.m82444OR(tEnumColumn.m61360EQ("default"), tEnumColumn.m61360EQ("blocked")).emit();
        Cursor cursorQuery = null;
        try {
            cursorQuery = m208655o().query(this.f191760d, new String[]{Conversation.f21114ID.toString()}, sqlSegmentEmit.part, sqlSegmentEmit.args, null, null, Conversation.UPDATEDTIME.DESC.emit());
            while (cursorQuery.moveToNext()) {
                arrayList.add(cursorQuery.getString(0));
            }
            if (NullChecker.m82486a(cursorQuery)) {
                cursorQuery.close();
            }
            return arrayList;
        } catch (Throwable th) {
            if (!NullChecker.m82486a(cursorQuery)) {
                throw th;
            }
            cursorQuery.close();
            throw th;
        }
    }

    /* JADX INFO: renamed from: f1 */
    public wzh0<Conversation>.C21213a m159015f1() {
        Filter<Conversation> filterM82406F = Conversation.READ.m82406F();
        StringColumn<Conversation> stringColumn = Conversation.f21114ID;
        Filter<Conversation> filterNOT_STARTS_WITH = stringColumn.NOT_STARTS_WITH("fake_conversation");
        Filter<Conversation> filterNEQ = stringColumn.NEQ(User.ID_LIVE_VIP_SERVICE);
        Filter<Conversation> filterNEQ2 = stringColumn.NEQ(User.ID_LIVE_SERVICE);
        TEnumColumn<Conversation, ConversationStatus> tEnumColumn = Conversation.STATUS;
        Filter<Conversation> filterNEQ3 = tEnumColumn.NEQ("dismissed");
        Filter<Conversation> filterNEQ4 = tEnumColumn.NEQ("blocked");
        Filter<Conversation> filterNEQ5 = tEnumColumn.NEQ("removed");
        Filter<Conversation> filterNEQ6 = tEnumColumn.NEQ(ConversationStatus.invisible);
        Filter<Conversation> filterNEQ7 = tEnumColumn.NEQ("deleted");
        Filter<Conversation> filterM82406F2 = Conversation.LOCALEVERHASMESSAGE.m82406F();
        DoubleColumn<Conversation> doubleColumn = Conversation.CREATEDTIME;
        Filter<Conversation> filterREQ = doubleColumn.REQ(CoreModule.f18264c.f20384f0.f20698m1.get());
        Filter<Conversation> filterNEQ8 = Conversation.OTHERSTATUS.NEQ("invalid");
        StringColumn<Conversation> stringColumn2 = Conversation.CONVTYPE;
        return new wzh0.C21213a("queryEnterUnreadNewMatchTimer", Filter.AND(filterM82406F, filterNOT_STARTS_WITH, filterNEQ, filterNEQ2, filterNEQ3, filterNEQ4, filterNEQ5, filterNEQ6, filterNEQ7, filterM82406F2, filterREQ, filterNEQ8, Filter.m82444OR(stringColumn2.mo61359EQ(""), stringColumn2.mo61359EQ("default"))), doubleColumn.DESC, 0, 2);
    }

    /* JADX INFO: renamed from: g1 */
    public pf60<List<Conversation>, List<User>> m159016g1(String str) {
        Filter filterM82444OR;
        Filter filterAND;
        List<Conversation> listQuery;
        List<User> listM159027m0 = m159027m0(str);
        List<String> listM159041w0 = m159041w0(listM159027m0);
        if (gta.m132210e().m132214d().mo34679E()) {
            xu4 xu4Var = CoreModule.f18272k.f115546n;
            StringColumn<ChatGroup> stringColumn = ChatGroup.NAME;
            List<ChatGroup> listQuery2 = xu4Var.query(stringColumn.CONTAINS(str), stringColumn.DESC, 200);
            if (!jyb.m147479J(listQuery2)) {
                for (ChatGroup chatGroup : listQuery2) {
                    if (!TextUtils.isEmpty(chatGroup.localConId)) {
                        listM159041w0.add(chatGroup.localConId);
                    }
                }
            }
        }
        List<Conversation> listQuery3 = CoreModule.f18272k.f115545m.query(Filter.AND(Conversation.f21114ID.NOT_STARTS_WITH("fake_conversation"), Conversation.LOCALEXTRAINFO.CONTAINS(str)), Conversation.LATESTTIME.DESC, 200);
        if (!jyb.m147479J(listQuery3)) {
            Iterator<Conversation> it = listQuery3.iterator();
            while (it.hasNext()) {
                listM159041w0.add(it.next().f56859id);
            }
        }
        Filter filter = gta.m132210e().m132214d().mo34805b() ? Filter.TRUE : this.f137495m;
        if (gta.m132210e().m132214d().mo34748R8()) {
            BooleanColumn<Conversation> booleanColumn = Conversation.LOCALEVERHASMESSAGE;
            filterM82444OR = Filter.m82444OR(booleanColumn.m82407T(), Filter.AND(Conversation.CONVTYPE.NEQ("lovebuzz"), booleanColumn.m82406F()));
        } else {
            filterM82444OR = Filter.TRUE;
        }
        Filter filter2 = filterM82444OR;
        Filter filter3 = Filter.TRUE;
        if (CoreModule.f18264c.f20381e0.m116593na().isSVIP()) {
            Filter<Conversation> filterM82451IN = Conversation.f21114ID.m82451IN(listM159041w0);
            TEnumColumn<Conversation, ConversationStatus> tEnumColumn = Conversation.STATUS;
            listQuery = query(Filter.AND(filterM82451IN, filter, filter2, filter3, filter3, tEnumColumn.NEQ(ConversationStatus.local_fake), tEnumColumn.NEQ("deleted")), Conversation.LATESTTIME.DESC, 200);
        } else {
            if (br5.m106041l()) {
                filterAND = filter3;
            } else {
                StringColumn<Conversation> stringColumn2 = Conversation.CONVTYPE;
                filterAND = Filter.AND(stringColumn2.NEQ("compliment"), stringColumn2.NEQ(ConversationType.swiper));
            }
            Filter<Conversation> filterM82451IN2 = Conversation.f21114ID.m82451IN(listM159041w0);
            Filter<Conversation> filterNEQ = Conversation.CONVTYPE.NEQ(ConversationType.fake_one_side);
            TEnumColumn<Conversation, ConversationStatus> tEnumColumn2 = Conversation.STATUS;
            listQuery = query(Filter.AND(filterM82451IN2, filter, filter2, filter3, filter3, filterAND, filterNEQ, tEnumColumn2.NEQ(ConversationStatus.local_fake), tEnumColumn2.NEQ("deleted")), Conversation.LATESTTIME.DESC, 200);
        }
        return jyb.m147494Y(listQuery, listM159027m0);
    }

    /* JADX INFO: renamed from: h0 */
    public wzh0<Conversation>.C21213a m159017h0(double d) {
        String str = "conversation_filter_req_current_time" + d;
        Filter<Conversation> filterM159036r0 = m159036r0();
        StringColumn<Conversation> stringColumn = Conversation.CONVTYPE;
        Filter filterM82444OR = Filter.m82444OR(filterM159036r0, stringColumn.mo61359EQ("marriage"));
        Filter<Conversation> filterNEQ = stringColumn.NEQ("group");
        StringColumn<Conversation> stringColumn2 = Conversation.f21114ID;
        Filter<Conversation> filterNOT_STARTS_WITH = stringColumn2.NOT_STARTS_WITH("fake_conversation_fold_conversation");
        Filter<Conversation> filterNOT_STARTS_WITH2 = stringColumn2.NOT_STARTS_WITH("fake_conversation_weaken_conversation");
        DoubleColumn<Conversation> doubleColumn = Conversation.LATESTTIME;
        return new wzh0.C21213a(str, Filter.AND(filterM82444OR, filterNEQ, filterNOT_STARTS_WITH, filterNOT_STARTS_WITH2, doubleColumn.REQ(Double.valueOf(d))), doubleColumn.DESC, 0, 20);
    }

    /* JADX INFO: renamed from: h1 */
    public wzh0<Conversation>.C21213a m159018h1() {
        Filter<Conversation> filterM61360EQ = Conversation.LOCALPLACEBAN.m61360EQ("both");
        TEnumColumn<Conversation, ConversationStatus> tEnumColumn = Conversation.STATUS;
        return new wzh0.C21213a("noMatch_seeletter_byother", Filter.AND(filterM61360EQ, tEnumColumn.NEQ(ConversationStatus.local_fake), tEnumColumn.NEQ("deleted"), tEnumColumn.NEQ("removed"), tEnumColumn.NEQ(ConversationStatus.invisible), tEnumColumn.NEQ("dismissed")), Conversation.LATESTTIME.DESC, 0, 200);
    }

    /* JADX INFO: renamed from: i0 */
    public int m159019i0() {
        return count(Conversation.f21114ID.NOT_STARTS_WITH("fake_conversation"), -1);
    }

    /* JADX INFO: renamed from: i1 */
    public Filter<Conversation> m159020i1() {
        return gta.m132210e().m132214d().mo34811c() ? Filter.m82444OR(Conversation.CONVTYPE.NEQ("quickchat"), Conversation.READ.m82407T(), Conversation.READUNTIL.NEQ("")) : Filter.TRUE;
    }

    /* JADX INFO: renamed from: j0 */
    public wzh0<Conversation>.C21213a m159021j0() {
        String str = "conversations_active_time_between_one_and_seven_day" + pzi0.m174454o();
        Filter<Conversation> filterM159036r0 = m159036r0();
        Filter<Conversation> filter = this.f137492W;
        Filter<Conversation> filterM82407T = Conversation.LOCALHASMESSAGE.m82407T();
        StringColumn<Conversation> stringColumn = Conversation.f21114ID;
        Filter<Conversation> filterNEQ = stringColumn.NEQ("fake_conversation_fold_conversation");
        Filter<Conversation> filterNEQ2 = stringColumn.NEQ("fake_conversation_weaken_conversation");
        Filter<Conversation> filterMo61359EQ = Conversation.CONVTYPE.mo61359EQ("default");
        TEnumColumn<Conversation, ConversationStatus> tEnumColumn = Conversation.STATUS;
        Filter<Conversation> filterNEQ3 = tEnumColumn.NEQ("dismissed");
        Filter<Conversation> filterNEQ4 = tEnumColumn.NEQ("blocked");
        DoubleColumn<Conversation> doubleColumn = Conversation.LATESTTIME;
        return new wzh0.C21213a(str, Filter.AND(filterM159036r0, filter, filterM82407T, filterNEQ, filterNEQ2, filterMo61359EQ, filterNEQ3, filterNEQ4, doubleColumn.LEQ(Double.valueOf(m159040v0(1))), doubleColumn.REQ(Double.valueOf(m159040v0(7)))), new DoubleOrder(Conversation.LEVEL.DESC, doubleColumn.DESC), 0, 200);
    }

    /* JADX INFO: renamed from: j1 */
    public List<Conversation> m159022j1() {
        Filter<Conversation> filterNOT_STARTS_WITH = Conversation.OTHERUSER.NOT_STARTS_WITH("-");
        Filter<Conversation> filterMo61359EQ = Conversation.CONVTYPE.mo61359EQ("default");
        Filter<Conversation> filterMo61359EQ2 = Conversation.UNREADMESSAGES.mo61359EQ(0);
        Filter<Conversation> filterM82407T = Conversation.READ.m82407T();
        Filter<Conversation> filterREQ = Conversation.USERMESSAGECOUNT.REQ(0);
        TEnumColumn<Conversation, ConversationStatus> tEnumColumn = Conversation.STATUS;
        return query(Filter.AND(filterNOT_STARTS_WITH, filterMo61359EQ, filterMo61359EQ2, filterM82407T, filterREQ, Filter.AND(tEnumColumn.NEQ("dismissed"), tEnumColumn.NEQ(ConversationStatus.local_fake), tEnumColumn.NEQ("removed"), tEnumColumn.NEQ(ConversationStatus.invisible), tEnumColumn.NEQ("deleted"))), new DoubleOrder(Conversation.LEVEL.DESC, Conversation.LATESTTIME.DESC), 60);
    }

    /* JADX INFO: renamed from: k0 */
    public int m159023k0(List<String> list) {
        if (list == null) {
            list = new ArrayList<>();
        }
        Filter<Conversation> filterNOT_STARTS_WITH = Conversation.f21114ID.NOT_STARTS_WITH("fake_conversation");
        Filter<Conversation> filterNOT_IN = Conversation.OTHERUSER.NOT_IN(list);
        TEnumColumn<Conversation, ConversationStatus> tEnumColumn = Conversation.STATUS;
        return count(Filter.AND(filterNOT_STARTS_WITH, filterNOT_IN, Filter.AND(tEnumColumn.NEQ("dismissed"), tEnumColumn.NEQ(ConversationStatus.local_fake), tEnumColumn.NEQ("removed"), tEnumColumn.NEQ(ConversationStatus.invisible), tEnumColumn.NEQ("deleted"))), -1);
    }

    /* JADX INFO: renamed from: k1 */
    public void m159024k1(NotificationStatus notificationStatus, NotificationStatus notificationStatus2) {
        TEnumColumn<Conversation, NotificationStatus> tEnumColumn = Conversation.LOCALNOTIFICATIONSTATUS;
        update(jyb.m147507f0(jyb.m147494Y(tEnumColumn, notificationStatus2)), tEnumColumn.m61360EQ(notificationStatus.toString()));
    }

    /* JADX INFO: renamed from: l0 */
    public int m159025l0() {
        Filter<Conversation> filterNOT_STARTS_WITH = Conversation.f21114ID.NOT_STARTS_WITH("fake_conversation");
        Filter<Conversation> filterNEQ = Conversation.CONVTYPE.NEQ("group");
        Filter<Conversation> filterM82406F = Conversation.LOCALEVERHASMESSAGE.m82406F();
        TEnumColumn<Conversation, ConversationStatus> tEnumColumn = Conversation.STATUS;
        return count(Filter.AND(filterNOT_STARTS_WITH, filterNEQ, filterM82406F, Filter.AND(tEnumColumn.NEQ("dismissed"), tEnumColumn.NEQ(ConversationStatus.local_fake), tEnumColumn.NEQ("removed"), tEnumColumn.NEQ(ConversationStatus.invisible), tEnumColumn.NEQ("deleted"))), -1);
    }

    /* JADX INFO: renamed from: l1 */
    public wzh0<Conversation>.C21213a m159026l1(long j) {
        StringColumn<Conversation> stringColumn = Conversation.f21114ID;
        Filter<Conversation> filterNOT_STARTS_WITH = stringColumn.NOT_STARTS_WITH("-");
        Filter<Conversation> filterNOT_STARTS_WITH2 = stringColumn.NOT_STARTS_WITH("fake_conversation");
        DoubleColumn<Conversation> doubleColumn = Conversation.CREATEDTIME;
        Filter<Conversation> filterREQ = doubleColumn.REQ(Double.valueOf(j));
        TEnumColumn<Conversation, ConversationStatus> tEnumColumn = Conversation.STATUS;
        return new wzh0.C21213a("today_matches_list_by_last_time", Filter.AND(Filter.AND(FilterList.list(filterNOT_STARTS_WITH, filterNOT_STARTS_WITH2, filterREQ, Filter.m82444OR(tEnumColumn.m61360EQ("default"), tEnumColumn.m61360EQ("dismissed"), tEnumColumn.m61360EQ("blocked"), tEnumColumn.m61360EQ("removed"), tEnumColumn.m61360EQ(ConversationStatus.invisible)), Conversation.CONVTYPE.mo61359EQ("default")).toFilters())), doubleColumn.DESC, 0, gta.m132210e().m132214d().mo34671Cq());
    }

    /* JADX INFO: renamed from: m0 */
    public final List<User> m159027m0(final String str) {
        if (gta.m132210e().m132214d().mo34878l()) {
            return uqb0.f180405k0.f184355d.query(Filter.m82444OR(User.NAME.CONTAINS(str), User.f39673ID.m82451IN(jyb.m147486Q(jyb.m147522n(CoreModule.f18264c.f20381e0.m116496O7().values(), new qcj() { // from class: l.kl6
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return Boolean.valueOf(((GPMemo) obj).memo.toLowerCase().contains(str.toLowerCase()));
                }
            }), new qcj() { // from class: l.vl6
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return ((GPMemo) obj).userId;
                }
            })), User.PUBLICID.CONTAINS(str)), null, 200);
        }
        Map<String, GPMemo> mapM116496O7 = CoreModule.f18264c.f20381e0.m116496O7();
        ArrayList arrayListM147486Q = jyb.m147486Q(jyb.m147522n(mapM116496O7.values(), new qcj() { // from class: l.em6
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(((GPMemo) obj).memo.toLowerCase().contains(str.toLowerCase()));
            }
        }), new qcj() { // from class: l.fm6
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return ((GPMemo) obj).userId;
            }
        });
        ArrayList arrayListM147486Q2 = jyb.m147486Q(mapM116496O7.values(), new qcj() { // from class: l.gm6
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return ((GPMemo) obj).userId;
            }
        });
        ejk0 ejk0Var = uqb0.f180405k0.f184355d;
        Filter<User> filterCONTAINS = User.NAME.CONTAINS(str);
        StringColumn<User> stringColumn = User.f39673ID;
        return ejk0Var.query(Filter.m82444OR(Filter.AND(filterCONTAINS, stringColumn.NOT_IN(arrayListM147486Q2)), stringColumn.m82451IN(arrayListM147486Q)), null, 200);
    }

    /* JADX INFO: renamed from: m1 */
    public wzh0<Conversation>.C21213a m159028m1(int i) {
        Filter<Conversation> filterAND;
        if (gta.m132210e().m132214d().mo34805b()) {
            filterAND = Conversation.f21114ID.NOT_STARTS_WITH("fake_conversation");
        } else {
            StringColumn<Conversation> stringColumn = Conversation.f21114ID;
            filterAND = Filter.AND(stringColumn.NOT_STARTS_WITH("fake_conversation"), stringColumn.NEQ(User.ID_LIVE_VIP_SERVICE), stringColumn.NEQ(User.ID_LIVE_SERVICE));
        }
        Filter filterM82444OR = Filter.TRUE;
        if (gta.m132210e().m132214d().mo34923sa()) {
            StringColumn<Conversation> stringColumn2 = Conversation.f21114ID;
            filterM82444OR = Filter.m82444OR(stringColumn2.NOT_STARTS_WITH("-"), stringColumn2.mo61359EQ(User.ID_LIVE_VIP_SERVICE), stringColumn2.mo61359EQ(User.ID_VERIVICATION_ASSISTANT));
        }
        Filter filterM159042x0 = m159042x0();
        TEnumColumn<Conversation, ConversationStatus> tEnumColumn = Conversation.STATUS;
        return new wzh0.C21213a("unreadConversation", Filter.AND(filterAND, filterM159042x0, Filter.AND(tEnumColumn.NEQ("dismissed"), tEnumColumn.NEQ(ConversationStatus.local_fake), tEnumColumn.NEQ("removed"), tEnumColumn.NEQ(ConversationStatus.invisible), tEnumColumn.NEQ("deleted")), Conversation.UNREADMESSAGES.NEQ(0), filterM82444OR), new DoubleOrder(Conversation.LEVEL.DESC, Conversation.LATESTTIME.DESC), 0, i);
    }

    /* JADX INFO: renamed from: n0 */
    public Filter m159029n0() {
        if (!gta.m132210e().m132214d().mo34661B()) {
            return Filter.TRUE;
        }
        TEnumColumn<Conversation, LocalPlaceBan> tEnumColumn = Conversation.LOCALPLACEBAN;
        return Filter.AND(tEnumColumn.NEQ(LocalPlaceBan.chatList), tEnumColumn.NEQ("both"));
    }

    /* JADX INFO: renamed from: n1 */
    public List<Conversation> m159030n1() {
        Filter<Conversation> filterNOT_STARTS_WITH = Conversation.OTHERUSER.NOT_STARTS_WITH("-");
        Filter<Conversation> filterMo61359EQ = Conversation.CONVTYPE.mo61359EQ("default");
        Filter<Conversation> filterREQ = Conversation.UNREADMESSAGES.REQ(1);
        TEnumColumn<Conversation, ConversationStatus> tEnumColumn = Conversation.STATUS;
        return query(Filter.AND(filterNOT_STARTS_WITH, filterMo61359EQ, filterREQ, Filter.AND(tEnumColumn.NEQ("dismissed"), tEnumColumn.NEQ(ConversationStatus.local_fake), tEnumColumn.NEQ("removed"), tEnumColumn.NEQ(ConversationStatus.invisible), tEnumColumn.NEQ("deleted"))), new DoubleOrder(Conversation.LEVEL.DESC, Conversation.LATESTTIME.DESC), 60);
    }

    /* JADX INFO: renamed from: o0 */
    public wzh0<Conversation>.C21213a m159031o0() {
        Filter<Conversation> filterMo61359EQ = Conversation.CONVTYPE.mo61359EQ(ConversationType.free_see_match);
        IntegerColumn<Conversation> integerColumn = Conversation.LOCALISLIMITEDTRIALSEE;
        return new wzh0.C21213a("queryLimitedTrialSee", Filter.AND(filterMo61359EQ, Filter.m82444OR(integerColumn.mo61359EQ(1), integerColumn.mo61359EQ(2))), Conversation.UPDATEDTIME.DESC, 0, 50);
    }

    /* JADX INFO: renamed from: o1 */
    public wzh0<Conversation>.C21213a m159032o1(int i) {
        StringColumn<Conversation> stringColumn = Conversation.f21114ID;
        Filter<Conversation> filterNOT_STARTS_WITH = stringColumn.NOT_STARTS_WITH("-");
        Filter<Conversation> filterNOT_STARTS_WITH2 = stringColumn.NOT_STARTS_WITH("fake_conversation");
        Filter filterM159042x0 = m159042x0();
        TEnumColumn<Conversation, ConversationStatus> tEnumColumn = Conversation.STATUS;
        return new wzh0.C21213a("unreadDefaultConversation", Filter.AND(filterNOT_STARTS_WITH, filterNOT_STARTS_WITH2, filterM159042x0, Filter.AND(tEnumColumn.NEQ("dismissed"), tEnumColumn.NEQ(ConversationStatus.local_fake), tEnumColumn.NEQ("removed"), tEnumColumn.NEQ(ConversationStatus.invisible), tEnumColumn.NEQ("deleted")), Conversation.UNREADMESSAGES.NEQ(0)), new DoubleOrder(Conversation.LEVEL.DESC, Conversation.LATESTTIME.DESC), 0, i);
    }

    /* JADX INFO: renamed from: p0 */
    public wzh0<Conversation>.C21213a m159033p0() {
        return new wzh0.C21213a("queryLimitedTrialSeeNoLimited", Filter.AND(Conversation.CONVTYPE.mo61359EQ(ConversationType.free_see_match), Conversation.LOCALISLIMITEDTRIALSEE.mo61359EQ(0)), Conversation.CREATEDTIME.DESC, 0, 50);
    }

    @Override // p153l.wzh0
    /* JADX INFO: renamed from: p1, reason: merged with bridge method [inline-methods] */
    public Conversation upsert(Conversation conversation, z20<Conversation, Conversation> z20Var) {
        if (conversation.localHasMessage || (!TextUtils.isEmpty(conversation.clearedUntil) && !TextUtils.equals(conversation.clearedUntil, "0"))) {
            conversation.localEverHasMessage = true;
        }
        if (!NullChecker.m82486a(conversation.f56859id)) {
            CrashHelper.m82479c(new IllegalStateException("【.id判空】conv id = null  upsert = , " + conversation.toJson() + "   conv._id = " + conversation._id));
        }
        return (Conversation) super.upsert(conversation, z20Var);
    }

    /* JADX INFO: renamed from: q0 */
    public Filter m159035q0() {
        return Conversation.f21114ID.NEQ("fake_conversation_local_summary_marriage_conversation");
    }

    /* JADX INFO: renamed from: r0 */
    public Filter<Conversation> m159036r0() {
        TEnumColumn<Conversation, ConversationStatus> tEnumColumn = Conversation.STATUS;
        FilterList list = FilterList.list(tEnumColumn.NEQ(ConversationStatus.local_fake), tEnumColumn.NEQ("dismissed"), tEnumColumn.NEQ("removed"), tEnumColumn.NEQ(ConversationStatus.invisible), tEnumColumn.NEQ("deleted"), m159035q0());
        StringColumn<Conversation> stringColumn = Conversation.CONVTYPE;
        list.add(stringColumn.NEQ(ConversationType.swiper));
        list.add(Filter.m82444OR(new C18654a(), Filter.AND(Conversation.CREATEDTIME.REQ(gta.m132210e().m132214d().mo34839go()), Filter.m82444OR(Filter.AND(stringColumn.mo61359EQ("quickchat"), tEnumColumn.m61360EQ("default")), tEnumColumn.m61360EQ(ConversationStatus.peeking)))));
        if (!gta.m132210e().m132214d().mo34805b()) {
            list.add(this.f137495m);
        }
        list.add(m159042x0());
        if (gta.m132210e().m132214d().mo34748R8()) {
            BooleanColumn<Conversation> booleanColumn = Conversation.LOCALEVERHASMESSAGE;
            list.add(Filter.m82444OR(booleanColumn.m82407T(), Filter.AND(stringColumn.NEQ("lovebuzz"), booleanColumn.m82406F())));
        }
        if (gta.m132210e().m132214d().mo34750Rk()) {
            list.add(gta.m132210e().m132214d().mo34923sa() ? this.f137492W : this.f137478I);
        } else {
            list.add(this.f137479J);
        }
        if (CoreModule.m30933P().m143405a().mo34397Qb()) {
            list.add(Filter.m82444OR(Conversation.LOCALISLIMITEDTRIALSEE.NEQ(2), stringColumn.NEQ(ConversationType.free_see_match)));
        }
        return Filter.AND(list.toFilters());
    }

    /* JADX INFO: renamed from: s0 */
    public Filter m159037s0() {
        if (!gta.m132210e().m132214d().mo34661B()) {
            return Filter.TRUE;
        }
        TEnumColumn<Conversation, LocalPlaceBan> tEnumColumn = Conversation.LOCALPLACEBAN;
        return Filter.AND(tEnumColumn.NEQ(LocalPlaceBan.matchList), tEnumColumn.NEQ("both"));
    }

    /* JADX INFO: renamed from: t0 */
    public Filter<Conversation> m159038t0() {
        TEnumColumn<Conversation, ConversationStatus> tEnumColumn = Conversation.STATUS;
        return Filter.AND(FilterList.list(tEnumColumn.NEQ(ConversationStatus.local_fake), tEnumColumn.NEQ("dismissed"), tEnumColumn.NEQ("removed"), tEnumColumn.NEQ(ConversationStatus.invisible), tEnumColumn.NEQ("deleted"), Conversation.OTHERSTATUS.NEQ("invalid"), Conversation.CONVTYPE.mo61359EQ("marriage")).toFilters());
    }

    /* JADX INFO: renamed from: u0 */
    public Filter<Conversation> m159039u0() {
        TEnumColumn<Conversation, ConversationStatus> tEnumColumn = Conversation.STATUS;
        return Filter.AND(FilterList.list(tEnumColumn.NEQ(ConversationStatus.local_fake), tEnumColumn.NEQ("dismissed"), tEnumColumn.NEQ("removed"), tEnumColumn.NEQ(ConversationStatus.invisible), tEnumColumn.NEQ("deleted"), Conversation.OTHERSTATUS.NEQ("invalid"), Conversation.UNREADMESSAGES.REQ(1), Conversation.CONVTYPE.mo61359EQ("marriage")).toFilters());
    }

    /* JADX INFO: renamed from: v0 */
    public final double m159040v0(int i) {
        return pzi0.m174454o() - (((long) (i * MMKV.ExpireInDay)) * 1000);
    }

    /* JADX INFO: renamed from: w0 */
    public final List<String> m159041w0(List<User> list) {
        ArrayList arrayList = new ArrayList();
        if (!jyb.m147479J(list)) {
            for (int i = 0; i < list.size(); i++) {
                User user = list.get(i);
                if (NullChecker.m82486a(user) && !user.isBannedNew() && !user.isBanned()) {
                    arrayList.add(user.f56859id);
                }
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: x0 */
    public Filter m159042x0() {
        return Filter.TRUE;
    }

    /* JADX INFO: renamed from: y0 */
    public wzh0<Conversation>.C21213a m159043y0(String str) {
        return new wzh0.C21213a("groupConversation/" + str, Filter.AND(Conversation.CONVTYPE.mo61359EQ("group"), Conversation.OTHERUSER.mo61359EQ(str)), Conversation.CREATEDTIME.DESC, 0, 1);
    }

    /* JADX INFO: renamed from: z0 */
    public wzh0<Conversation>.C21213a m159044z0() {
        Filter<Conversation> filterNOT_STARTS_WITH = Conversation.f21114ID.NOT_STARTS_WITH("fake_conversation");
        TEnumColumn<Conversation, ConversationStatus> tEnumColumn = Conversation.STATUS;
        return new wzh0.C21213a("intlChatConversationOrder", Filter.AND(filterNOT_STARTS_WITH, Filter.AND(tEnumColumn.NEQ("dismissed"), tEnumColumn.NEQ(ConversationStatus.local_fake), tEnumColumn.NEQ("removed"), tEnumColumn.NEQ(ConversationStatus.invisible), tEnumColumn.NEQ("deleted"), Conversation.LOCALEVERHASMESSAGE.m82407T()), m159029n0()), new DoubleOrder(Conversation.LEVEL.DESC, Conversation.LATESTTIME.DESC), 0, 200);
    }
}
