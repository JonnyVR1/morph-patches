package p149l;

import android.database.Cursor;
import android.text.TextUtils;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.ChatGroup;
import com.p046p1.mobile.putong.core.data.Conversation;
import com.p046p1.mobile.putong.core.data.ConversationType;
import com.p046p1.mobile.putong.core.data.LocalPlaceBan;
import com.p046p1.mobile.putong.core.data.NotificationStatus;
import com.p046p1.mobile.putong.data.ConversationStatus;
import com.p046p1.mobile.putong.data.GPMemo;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.data.tenum.TEnumColumn;
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
public class jl6 extends orh0<Conversation> {

    /* JADX INFO: renamed from: A */
    public orh0<Conversation>.C19008a f118448A;

    /* JADX INFO: renamed from: B */
    public orh0<Conversation>.C19008a f118449B;

    /* JADX INFO: renamed from: C */
    public orh0<Conversation>.C19008a f118450C;

    /* JADX INFO: renamed from: D */
    public orh0<Conversation>.C19008a f118451D;

    /* JADX INFO: renamed from: E */
    public orh0<Conversation>.C19008a f118452E;

    /* JADX INFO: renamed from: F */
    public orh0<Conversation>.C19008a f118453F;

    /* JADX INFO: renamed from: G */
    public p7r<orh0<Conversation>.C19008a> f118454G;

    /* JADX INFO: renamed from: H */
    public orh0<Conversation>.C19008a f118455H;

    /* JADX INFO: renamed from: I */
    public final Filter<Conversation> f118456I;

    /* JADX INFO: renamed from: J */
    public final Filter<Conversation> f118457J;

    /* JADX INFO: renamed from: K */
    public p7r<orh0<Conversation>.C19008a> f118458K;

    /* JADX INFO: renamed from: L */
    public p7r<orh0<Conversation>.C19008a> f118459L;

    /* JADX INFO: renamed from: M */
    public p7r<orh0<Conversation>.C19008a> f118460M;

    /* JADX INFO: renamed from: N */
    public p7r<orh0<Conversation>.C19008a> f118461N;

    /* JADX INFO: renamed from: O */
    public p7r<orh0<Conversation>.C19008a> f118462O;

    /* JADX INFO: renamed from: P */
    public p7r<orh0<Conversation>.C19008a> f118463P;

    /* JADX INFO: renamed from: Q */
    public p7r<orh0<Conversation>.C19008a> f118464Q;

    /* JADX INFO: renamed from: R */
    public p7r<orh0<Conversation>.C19008a> f118465R;

    /* JADX INFO: renamed from: S */
    public p7r<orh0<Conversation>.C19008a> f118466S;

    /* JADX INFO: renamed from: T */
    public p7r<orh0<Conversation>.C19008a> f118467T;

    /* JADX INFO: renamed from: U */
    public orh0<Conversation>.C19008a f118468U;

    /* JADX INFO: renamed from: V */
    public Filter<Conversation> f118469V;

    /* JADX INFO: renamed from: W */
    public final Filter<Conversation> f118470W;

    /* JADX INFO: renamed from: X */
    public p7r<orh0<Conversation>.C19008a> f118471X;

    /* JADX INFO: renamed from: Y */
    public p7r<orh0<Conversation>.C19008a> f118472Y;

    /* JADX INFO: renamed from: m */
    public Filter f118473m;

    /* JADX INFO: renamed from: n */
    public orh0<Conversation>.C19008a f118474n;

    /* JADX INFO: renamed from: o */
    public p7r<orh0<Conversation>.C19008a> f118475o;

    /* JADX INFO: renamed from: p */
    public orh0<Conversation>.C19008a f118476p;

    /* JADX INFO: renamed from: q */
    public orh0<Conversation>.C19008a f118477q;

    /* JADX INFO: renamed from: r */
    public orh0<Conversation>.C19008a f118478r;

    /* JADX INFO: renamed from: s */
    public orh0<Conversation>.C19008a f118479s;

    /* JADX INFO: renamed from: t */
    public orh0<Conversation>.C19008a f118480t;

    /* JADX INFO: renamed from: u */
    public p7r<Filter<Conversation>> f118481u;

    /* JADX INFO: renamed from: v */
    public p7r<orh0<Conversation>.C19008a> f118482v;

    /* JADX INFO: renamed from: w */
    public p7r<orh0<Conversation>.C19008a> f118483w;

    /* JADX INFO: renamed from: x */
    public p7r<orh0<Conversation>.C19008a> f118484x;

    /* JADX INFO: renamed from: y */
    public orh0<Conversation>.C19008a f118485y;

    /* JADX INFO: renamed from: z */
    public orh0<Conversation>.C19008a f118486z;

    /* JADX INFO: renamed from: l.jl6$a */
    public class C17810a extends Filter<Conversation> {
        public C17810a() {
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

    public jl6(b8c b8cVar, String str, mrf0<Conversation> mrf0Var, List<Index> list, int i) {
        super(b8cVar, str, mrf0Var, list, i);
        StringColumn<Conversation> stringColumn = Conversation.f20372ID;
        this.f118473m = Filter.AND(stringColumn.NEQ(User.ID_LIVE_VIP_SERVICE), stringColumn.NEQ(User.ID_LIVE_SERVICE));
        IntegerColumn<Conversation> integerColumn = Conversation.UNREADMESSAGES;
        Filter<Conversation> filterREQ = integerColumn.REQ(1);
        StringColumn<Conversation> stringColumn2 = Conversation.OTHERUSER;
        Filter filterAND = Filter.AND(filterREQ, stringColumn2.REQ("1"));
        IntegerColumn<Conversation> integerColumn2 = Conversation.LEVEL;
        Order<Conversation> order = integerColumn2.DESC;
        DoubleColumn<Conversation> doubleColumn = Conversation.LATESTTIME;
        this.f118474n = new orh0.C19008a("unreadUserMessageConversations", filterAND, new DoubleOrder(order, doubleColumn.DESC), 1, 5);
        this.f118475o = p7r.m167767c(new v9j() { // from class: l.fl6
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f98127a.m141972R0();
            }
        });
        Filter<Conversation> filterNOT_STARTS_WITH = stringColumn.NOT_STARTS_WITH("fake_conversation");
        TEnumColumn<Conversation, ConversationStatus> tEnumColumn = Conversation.STATUS;
        this.f118476p = new orh0.C19008a("matches", Filter.AND(filterNOT_STARTS_WITH, Filter.AND(tEnumColumn.NEQ("dismissed"), tEnumColumn.NEQ(ConversationStatus.local_fake), tEnumColumn.NEQ("removed"), tEnumColumn.NEQ(ConversationStatus.invisible), tEnumColumn.NEQ("deleted"))), doubleColumn.DESC, 0, 200);
        Filter<Conversation> filterNOT_STARTS_WITH2 = stringColumn.NOT_STARTS_WITH("fake_conversation");
        StringColumn<Conversation> stringColumn3 = Conversation.CONVTYPE;
        this.f118477q = new orh0.C19008a("user_matches_without_group", Filter.AND(filterNOT_STARTS_WITH2, stringColumn3.NEQ("group"), Filter.AND(tEnumColumn.NEQ("dismissed"), tEnumColumn.NEQ("removed"), tEnumColumn.NEQ(ConversationStatus.invisible), tEnumColumn.NEQ("deleted"))), new DoubleOrder(integerColumn2.DESC, doubleColumn.DESC), 0, 200);
        this.f118478r = new orh0.C19008a("matchesWithoutFakeGroupChat", Filter.AND(stringColumn.NOT_STARTS_WITH("fake_conversation"), m142013x0(), Filter.AND(stringColumn3.mo60175EQ(ura.m195053e().m195057d().mo33772W7()), tEnumColumn.NEQ("dismissed"), tEnumColumn.NEQ(ConversationStatus.local_fake), tEnumColumn.NEQ("removed"), tEnumColumn.NEQ(ConversationStatus.invisible), tEnumColumn.NEQ("deleted"))), new DoubleOrder(integerColumn2.DESC, doubleColumn.DESC), 0, 200);
        this.f118479s = new orh0.C19008a("matchesWithoutFakeGroupChatWithoutLiveUser", Filter.AND(stringColumn.NOT_STARTS_WITH("fake_conversation"), this.f118473m, m142013x0(), Filter.AND(stringColumn3.mo60175EQ(ura.m195053e().m195057d().mo33772W7()), tEnumColumn.NEQ("dismissed"), tEnumColumn.NEQ(ConversationStatus.local_fake), tEnumColumn.NEQ("removed"), tEnumColumn.NEQ(ConversationStatus.invisible), tEnumColumn.NEQ("deleted"))), new DoubleOrder(integerColumn2.DESC, doubleColumn.DESC), 0, 200);
        this.f118480t = new orh0.C19008a("addressBookWithoutFakeGroupChatList", Filter.AND(stringColumn.NOT_STARTS_WITH("fake_conversation"), this.f118473m, Filter.AND(Filter.m81261OR(stringColumn3.mo60175EQ(ura.m195053e().m195057d().mo33772W7()), stringColumn3.mo60175EQ(ConversationType.virtualvoice)), tEnumColumn.NEQ("dismissed"), tEnumColumn.NEQ(ConversationStatus.local_fake), tEnumColumn.NEQ("removed"), tEnumColumn.NEQ(ConversationStatus.invisible), tEnumColumn.NEQ("deleted"))), new DoubleOrder(integerColumn2.DESC, doubleColumn.DESC), 0, 200);
        this.f118481u = p7r.m167767c(new v9j() { // from class: l.pk6
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return jl6.m141938Q();
            }
        });
        this.f118482v = p7r.m167767c(new v9j() { // from class: l.rk6
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f159781a.m141973S0();
            }
        });
        this.f118483w = p7r.m167767c(new v9j() { // from class: l.tk6
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f170817a.m141974T0();
            }
        });
        this.f118484x = p7r.m167767c(new v9j() { // from class: l.uk6
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f176907a.m141975U0();
            }
        });
        Filter<Conversation> filterNOT_STARTS_WITH3 = stringColumn.NOT_STARTS_WITH("fake_conversation");
        Filter<Conversation> filterM60176EQ = tEnumColumn.m60176EQ("dismissed");
        StringColumn<Conversation> stringColumn4 = Conversation.OTHERSTATUS;
        Filter filterAND2 = Filter.AND(filterNOT_STARTS_WITH3, filterM60176EQ, stringColumn4.NEQ("invalid"), stringColumn3.NEQ("timeLimited"));
        DoubleColumn<Conversation> doubleColumn2 = Conversation.UPDATEDTIME;
        this.f118485y = new orh0.C19008a("matches_deleted", filterAND2, doubleColumn2.DESC, 0, 200);
        this.f118486z = new orh0.C19008a("is_otherStatus_invalid", Filter.AND(stringColumn.NOT_STARTS_WITH("fake_conversation"), tEnumColumn.m60176EQ("dismissed"), stringColumn4.mo60175EQ("invalid"), stringColumn3.NEQ("timeLimited")), doubleColumn2.DESC, 0, 1);
        this.f118448A = new orh0.C19008a("all_matches_without_del_and_fake", Filter.AND(stringColumn.NOT_STARTS_WITH("fake_conversation"), Filter.AND(stringColumn.NOT_STARTS_WITH("-"), stringColumn.NOT_STARTS_WITH("fake_conversation"), stringColumn.NOT_STARTS_WITH("conversation_feed_state"), stringColumn.NOT_STARTS_WITH("conversation_feed_interaction"), stringColumn.NOT_STARTS_WITH("conversation_feed_featured")), tEnumColumn.NEQ("deleted"), stringColumn3.mo60175EQ("default"), stringColumn4.NEQ("invalid"), tEnumColumn.NEQ("dismissed")), doubleColumn2.DESC, 0, 200);
        this.f118449B = new orh0.C19008a("del_matches", Filter.AND(stringColumn.NOT_STARTS_WITH("fake_conversation"), m142013x0(), tEnumColumn.m60176EQ("removed")), new DoubleOrder(integerColumn2.DESC, doubleColumn2.DESC), 0, 200);
        this.f118450C = new orh0.C19008a("hide_matches", Filter.AND(stringColumn.NOT_STARTS_WITH("fake_conversation"), m142013x0(), tEnumColumn.m60176EQ(ConversationStatus.invisible)), new DoubleOrder(integerColumn2.DESC, doubleColumn2.DESC), 0, 200);
        Filter<Conversation> filterNOT_STARTS_WITH4 = stringColumn.NOT_STARTS_WITH("fake_conversation");
        Filter filterAND3 = Filter.AND(tEnumColumn.NEQ(ConversationStatus.local_fake), tEnumColumn.NEQ("dismissed"), tEnumColumn.NEQ("removed"), tEnumColumn.NEQ(ConversationStatus.invisible), tEnumColumn.NEQ("deleted"));
        BooleanColumn<Conversation> booleanColumn = Conversation.LOCALHASMESSAGE;
        this.f118451D = new orh0.C19008a("conversations_without_fake", Filter.AND(filterNOT_STARTS_WITH4, filterAND3, booleanColumn.m81224T()), new DoubleOrder(integerColumn2.DESC, doubleColumn.DESC), 0, 200);
        this.f118452E = new orh0.C19008a("all_conversations_without_fake", Filter.AND(stringColumn.NOT_STARTS_WITH("fake_conversation")), new DoubleOrder(integerColumn2.DESC, doubleColumn.DESC), 0, 200);
        this.f118453F = new orh0.C19008a("user_conversations_without_group", Filter.AND(stringColumn.NOT_STARTS_WITH("fake_conversation"), stringColumn3.NEQ("group"), Filter.AND(tEnumColumn.NEQ("dismissed"), tEnumColumn.NEQ("removed"), tEnumColumn.NEQ(ConversationStatus.invisible), tEnumColumn.NEQ("deleted")), booleanColumn.m81224T()), new DoubleOrder(integerColumn2.DESC, doubleColumn.DESC), 0, 200);
        this.f118454G = p7r.m167767c(new v9j() { // from class: l.vk6
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f181769a.m141959E0();
            }
        });
        this.f118455H = new orh0.C19008a("conversations_exposure", Filter.AND(stringColumn.NOT_STARTS_WITH("fake_conversation"), integerColumn2.mo60175EQ(50), Filter.AND(tEnumColumn.NEQ(ConversationStatus.local_fake), tEnumColumn.NEQ("dismissed"), tEnumColumn.NEQ("removed"), tEnumColumn.NEQ(ConversationStatus.invisible), tEnumColumn.NEQ("deleted"))), new DoubleOrder(integerColumn2.DESC, doubleColumn.DESC), 0, 200);
        Filter<Conversation> filterM81261OR = Filter.m81261OR(stringColumn.NOT_STARTS_WITH("fake_conversation"), stringColumn.STARTS_WITH("fake_conversation_greeting"), stringColumn.STARTS_WITH("fake_conversation_anonymous_greeting"), stringColumn.STARTS_WITH("fake_conversation_oof_pick"), stringColumn.STARTS_WITH("fake_conversation_oof_enter"), stringColumn.STARTS_WITH("fake_conversation_profile_featured"), stringColumn.STARTS_WITH("fake_conversation_city_centre_enter"), stringColumn.STARTS_WITH("fake_conversation_fold_conversation"), stringColumn.STARTS_WITH("fake_conversation_weaken_conversation"), stringColumn.STARTS_WITH("fake_conversation_live_activities"), stringColumn.STARTS_WITH("fake_conversation_profile_like_enter"), stringColumn.STARTS_WITH("fake_conversation_blindbox_enter"), stringColumn.STARTS_WITH("fake_conversation_local_summary_marriage_conversation"), stringColumn.STARTS_WITH("fake_conversation_surprise_gift_box"), stringColumn.STARTS_WITH("fake_conversation_local_limited_trial_see_fold"), stringColumn.STARTS_WITH("fake_conversation_local_instant_chat_conversation"));
        this.f118456I = filterM81261OR;
        this.f118457J = Filter.AND(filterM81261OR, stringColumn.NOT_STARTS_WITH("fake_conversation_profile_featured"), stringColumn.NOT_STARTS_WITH("fake_conversation_greeting"), stringColumn.NOT_STARTS_WITH("fake_conversation_anonymous_greeting"));
        this.f118458K = p7r.m167767c(new v9j() { // from class: l.wk6
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f186726a.m141960F0();
            }
        });
        this.f118459L = p7r.m167767c(new v9j() { // from class: l.xk6
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f193267a.m141961G0();
            }
        });
        this.f118460M = p7r.m167767c(new v9j() { // from class: l.yk6
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f198727a.m141962H0();
            }
        });
        this.f118461N = p7r.m167767c(new v9j() { // from class: l.zk6
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f203509a.m141963I0();
            }
        });
        this.f118462O = p7r.m167767c(new v9j() { // from class: l.gl6
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f103298a.m141964J0();
            }
        });
        this.f118463P = p7r.m167767c(new v9j() { // from class: l.hl6
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f108324a.m141965K0();
            }
        });
        this.f118464Q = p7r.m167767c(new v9j() { // from class: l.il6
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f113769a.m141966L0();
            }
        });
        this.f118465R = p7r.m167767c(new v9j() { // from class: l.ik6
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f113642a.m141967M0();
            }
        });
        this.f118466S = p7r.m167767c(new v9j() { // from class: l.jk6
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f118339a.m141968N0();
            }
        });
        this.f118467T = p7r.m167767c(new v9j() { // from class: l.kk6
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f123533a.m141969O0();
            }
        });
        BooleanColumn<Conversation> booleanColumn2 = Conversation.READ;
        this.f118468U = new orh0.C19008a("user_last_conv_without_group", Filter.AND(booleanColumn2.m81224T(), stringColumn.NOT_STARTS_WITH("fake_conversation"), stringColumn3.NEQ("group"), stringColumn2.NOT_STARTS_WITH("-"), Conversation.LOCALEVERHASMESSAGE.m81224T(), Conversation.USERMESSAGECOUNT.REQ(0), Filter.AND(tEnumColumn.NEQ("dismissed"), tEnumColumn.NEQ("removed"), tEnumColumn.NEQ(ConversationStatus.invisible), tEnumColumn.NEQ("deleted"))), doubleColumn.DESC, 0, 1);
        this.f118469V = Filter.m81261OR(Filter.AND(stringColumn.STARTS_WITH("-"), stringColumn.NEQ(User.ID_LIVE_VIP_SERVICE), stringColumn.NEQ(User.ID_VERIVICATION_ASSISTANT)), stringColumn.STARTS_WITH("fake_conversation_oof_pick"), stringColumn.STARTS_WITH("fake_conversation_oof_enter"), stringColumn.STARTS_WITH("fake_conversation_profile_featured"), stringColumn.STARTS_WITH("fake_conversation_blindbox_enter"), stringColumn.STARTS_WITH("fake_conversation_profile_like_enter"), stringColumn.STARTS_WITH("fake_conversation_surprise_gift_box"));
        this.f118470W = Filter.AND(Filter.m81261OR(stringColumn.NOT_STARTS_WITH("-"), stringColumn.STARTS_WITH(User.ID_LIVE_VIP_SERVICE), stringColumn.STARTS_WITH(User.ID_VERIVICATION_ASSISTANT)), Filter.m81261OR(stringColumn.NOT_STARTS_WITH("fake_conversation"), stringColumn.STARTS_WITH("fake_conversation_greeting"), stringColumn.STARTS_WITH("fake_conversation_anonymous_greeting"), stringColumn.STARTS_WITH("fake_conversation_city_centre_enter"), stringColumn.STARTS_WITH("fake_conversation_fold_conversation"), stringColumn.STARTS_WITH("fake_conversation_weaken_conversation"), stringColumn.STARTS_WITH("fake_conversation_live_activities"), stringColumn.STARTS_WITH("fake_conversation_local_summary_marriage_conversation"), stringColumn.STARTS_WITH("fake_conversation_local_team_group_conversation"), stringColumn.STARTS_WITH("fake_conversation_local_limited_trial_see_fold"), stringColumn.STARTS_WITH("fake_conversation_local_instant_chat_conversation")));
        this.f118471X = p7r.m167767c(new v9j() { // from class: l.lk6
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f128448a.m141970P0();
            }
        });
        this.f118472Y = p7r.m167767c(new v9j() { // from class: l.mk6
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f134286a.m141971Q0();
            }
        });
        this.f145282c = new j760<>(qib0.f154722k0.f176631d, new xaj0(new w9j() { // from class: l.nk6
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return DbObject.f56009ID.m81268IN(vwb.m200306T((List) obj, new w9j() { // from class: l.al6
                    @Override // p149l.w9j
                    public final Object call(Object obj2) {
                        return ((Conversation) obj2).f56011id;
                    }
                }));
            }
        }, new v9j() { // from class: l.ok6
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return jl6.m141940S();
            }
        }, -1));
        this.f145284e = new HashMap(2);
        this.f145284e.put("counter_trigger", new zrh0(vwb.m200324f0(booleanColumn2, Conversation.READUNTIL, integerColumn, Conversation.ISFAKE, tEnumColumn, integerColumn2), new d30() { // from class: l.qk6
            @Override // p149l.d30
            public final void call() {
                CoreModule.f17545c.f19642f0.m32938dq(qib0.f154693H.guessedCurrentServerTime());
            }
        }));
    }

    /* JADX INFO: renamed from: Q */
    public static /* synthetic */ Filter m141938Q() {
        StringColumn<Conversation> stringColumn = Conversation.CONVTYPE;
        Filter<Conversation> filterNEQ = stringColumn.NEQ("quickchat");
        TEnumColumn<Conversation, ConversationStatus> tEnumColumn = Conversation.STATUS;
        return Filter.m81261OR(Filter.AND(filterNEQ, tEnumColumn.NEQ(ConversationStatus.peeking)), Filter.AND(Conversation.CREATEDTIME.LEQ(ura.m195053e().m195057d().mo33836go()), Filter.m81261OR(stringColumn.mo60175EQ("quickchat"), tEnumColumn.m60176EQ(ConversationStatus.peeking))));
    }

    /* JADX INFO: renamed from: S */
    public static /* synthetic */ Order m141940S() {
        return null;
    }

    /* JADX INFO: renamed from: A0 */
    public orh0<Conversation>.C19008a m141955A0() {
        Filter<Conversation> filterAND = ura.m195053e().m195057d().mo33745R8() ? Filter.AND(Conversation.CONVTYPE.NEQ("lovebuzz"), Conversation.LOCALEVERHASMESSAGE.m81223F()) : Conversation.LOCALEVERHASMESSAGE.m81223F();
        Filter<Conversation> filterNOT_STARTS_WITH = Conversation.f20372ID.NOT_STARTS_WITH("fake_conversation");
        Filter filter = this.f118473m;
        TEnumColumn<Conversation, ConversationStatus> tEnumColumn = Conversation.STATUS;
        return new orh0.C19008a("intlMatchConversationOrder", Filter.AND(filterNOT_STARTS_WITH, filter, Filter.AND(tEnumColumn.NEQ("dismissed"), tEnumColumn.NEQ(ConversationStatus.local_fake), tEnumColumn.NEQ("removed"), tEnumColumn.NEQ(ConversationStatus.invisible), tEnumColumn.NEQ("deleted"), filterAND), m142008s0()), new DoubleOrder(Conversation.LEVEL.DESC, Conversation.LATESTTIME.DESC), 0, 200);
    }

    /* JADX INFO: renamed from: B0 */
    public orh0<Conversation>.C19008a m141956B0() {
        Filter<Conversation> filterNOT_STARTS_WITH = Conversation.f20372ID.NOT_STARTS_WITH("fake_conversation");
        TEnumColumn<Conversation, ConversationStatus> tEnumColumn = Conversation.STATUS;
        return new orh0.C19008a("intlWhisperConversationOrder", Filter.AND(filterNOT_STARTS_WITH, Filter.AND(tEnumColumn.NEQ("dismissed"), tEnumColumn.NEQ(ConversationStatus.local_fake), tEnumColumn.NEQ("removed"), tEnumColumn.NEQ(ConversationStatus.invisible), tEnumColumn.NEQ("deleted")), Conversation.CONVTYPE.mo60175EQ(ConversationType.swiper)), Conversation.LATESTTIME.DESC, 0, 200);
    }

    /* JADX INFO: renamed from: C0 */
    public p7r<orh0<Conversation>.C19008a> m141957C0() {
        return p7r.m167767c(new v9j() { // from class: l.el6
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f92072a.m141958D0();
            }
        });
    }

    /* JADX INFO: renamed from: D0 */
    public final /* synthetic */ orh0.C19008a m141958D0() {
        return new orh0.C19008a("invalid_conversation_list", Filter.AND(Conversation.OTHERSTATUS.mo60175EQ("invalid"), Conversation.STATUS.NEQ("dismissed"), Conversation.LOCALEVERHASMESSAGE.m81224T()), new DoubleOrder(Conversation.LEVEL.DESC, Conversation.UPDATEDTIME.DESC), 0, 200);
    }

    /* JADX INFO: renamed from: E0 */
    public final /* synthetic */ orh0.C19008a m141959E0() {
        StringColumn<Conversation> stringColumn = Conversation.f20372ID;
        return new orh0.C19008a("newest_conversation", Filter.AND(stringColumn.NOT_STARTS_WITH("fake_conversation"), stringColumn.NOT_STARTS_WITH("-"), Conversation.CONVTYPE.mo60175EQ("default")), Conversation.CREATEDTIME.DESC, 1, 1);
    }

    /* JADX INFO: renamed from: F0 */
    public final /* synthetic */ orh0.C19008a m141960F0() {
        return new orh0.C19008a("conversations_new_without_fake", m142007r0(), new DoubleOrder(Conversation.LEVEL.DESC, Conversation.LATESTTIME.DESC), 0, 200);
    }

    /* JADX INFO: renamed from: G0 */
    public final /* synthetic */ orh0.C19008a m141961G0() {
        IntegerColumn<Conversation> integerColumn = Conversation.LEVEL;
        Filter<Conversation> filterMo60175EQ = integerColumn.mo60175EQ(0);
        StringColumn<Conversation> stringColumn = Conversation.f20372ID;
        return new orh0.C19008a("conversations_weaken_fold", Filter.AND(filterMo60175EQ, stringColumn.NOT_STARTS_WITH("-"), stringColumn.NOT_STARTS_WITH("fake_conversation"), stringColumn.NOT_STARTS_WITH("conversation_feed_state"), stringColumn.NOT_STARTS_WITH("conversation"), m142007r0()), new DoubleOrder(integerColumn.DESC, Conversation.LATESTTIME.DESC), 0, 50);
    }

    /* JADX INFO: renamed from: H0 */
    public final /* synthetic */ orh0.C19008a m141962H0() {
        return new orh0.C19008a("conversations_new_marriage", m142009t0(), Conversation.LATESTTIME.DESC, 0, 200);
    }

    /* JADX INFO: renamed from: I0 */
    public final /* synthetic */ orh0.C19008a m141963I0() {
        return new orh0.C19008a("conversations_new_marriage_unread", m142010u0(), Conversation.LATESTTIME.DESC, 0, 200);
    }

    /* JADX INFO: renamed from: J0 */
    public final /* synthetic */ orh0.C19008a m141964J0() {
        return new orh0.C19008a("conversations_love_buzz", Filter.AND(Conversation.CONVTYPE.mo60175EQ("lovebuzz"), Conversation.STATUS.NEQ("deleted")), Conversation.LATESTTIME.DESC, 0, 200);
    }

    /* JADX INFO: renamed from: K0 */
    public final /* synthetic */ orh0.C19008a m141965K0() {
        Filter<Conversation> filterM142007r0 = m142007r0();
        DoubleColumn<Conversation> doubleColumn = Conversation.LATESTTIME;
        Filter<Conversation> filterREQ = doubleColumn.REQ(Double.valueOf(CoreModule.f17545c.f19642f0.m32976hg()));
        Filter<Conversation> filterMo60175EQ = Conversation.f20372ID.mo60175EQ("fake_conversation_fold_conversation");
        IntegerColumn<Conversation> integerColumn = Conversation.LEVEL;
        return new orh0.C19008a("conversations_new_without_fake_container_fold", Filter.AND(filterM142007r0, Filter.m81261OR(filterREQ, filterMo60175EQ, integerColumn.REQ(1))), new DoubleOrder(integerColumn.DESC, doubleColumn.DESC), 0, 200);
    }

    /* JADX INFO: renamed from: L0 */
    public final /* synthetic */ orh0.C19008a m141966L0() {
        Filter<Conversation> filterM142007r0 = m142007r0();
        StringColumn<Conversation> stringColumn = Conversation.f20372ID;
        return new orh0.C19008a("conversation_without_fake_without_message", Filter.AND(filterM142007r0, stringColumn.NEQ("fake_conversation_fold_conversation"), stringColumn.NEQ("fake_conversation_weaken_conversation"), Conversation.f20373MM.LEQ(0), Conversation.LOCALHASMESSAGE.m81223F(), Conversation.UNREADMESSAGES.LEQ(0), Conversation.USERMESSAGECOUNT.LEQ(0), Conversation.READUNTIL.mo60175EQ("")), new DoubleOrder(Conversation.LEVEL.DESC, Conversation.LATESTTIME.DESC), 0, 50);
    }

    /* JADX INFO: renamed from: M0 */
    public final /* synthetic */ orh0.C19008a m141967M0() {
        Filter<Conversation> filterM142007r0 = m142007r0();
        StringColumn<Conversation> stringColumn = Conversation.f20372ID;
        Filter<Conversation> filterNEQ = stringColumn.NEQ("fake_conversation_fold_conversation");
        Filter<Conversation> filterNEQ2 = stringColumn.NEQ("fake_conversation_weaken_conversation");
        DoubleColumn<Conversation> doubleColumn = Conversation.LATESTTIME;
        Filter<Conversation> filterLEQ = doubleColumn.LEQ(Double.valueOf(CoreModule.f17545c.f19642f0.m32976hg()));
        IntegerColumn<Conversation> integerColumn = Conversation.LEVEL;
        return new orh0.C19008a("conversations_new_without_fake_fold", Filter.AND(filterM142007r0, filterNEQ, filterNEQ2, filterLEQ, integerColumn.mo60175EQ(0)), new DoubleOrder(integerColumn.DESC, doubleColumn.DESC), 0, 200);
    }

    /* JADX INFO: renamed from: N0 */
    public final /* synthetic */ orh0.C19008a m141968N0() {
        Filter<Conversation> filterM142007r0 = m142007r0();
        StringColumn<Conversation> stringColumn = Conversation.f20372ID;
        Filter<Conversation> filterNEQ = stringColumn.NEQ("fake_conversation_fold_conversation");
        Filter<Conversation> filterNEQ2 = stringColumn.NEQ("fake_conversation_weaken_conversation");
        DoubleColumn<Conversation> doubleColumn = Conversation.LATESTTIME;
        Filter<Conversation> filterLEQ = doubleColumn.LEQ(Double.valueOf(CoreModule.f17545c.f19642f0.m32577Ag()));
        Filter<Conversation> filterNEQ3 = Conversation.UNREADMESSAGES.NEQ(0);
        IntegerColumn<Conversation> integerColumn = Conversation.LEVEL;
        return new orh0.C19008a("conversations_new_without_fake_weaken_unread", Filter.AND(filterM142007r0, filterNEQ, filterNEQ2, filterLEQ, filterNEQ3, integerColumn.mo60175EQ(0)), new DoubleOrder(integerColumn.DESC, doubleColumn.DESC), 0, 20);
    }

    /* JADX INFO: renamed from: O0 */
    public final /* synthetic */ orh0.C19008a m141969O0() {
        Filter<Conversation> filterM142007r0 = m142007r0();
        StringColumn<Conversation> stringColumn = Conversation.f20372ID;
        Filter<Conversation> filterNEQ = stringColumn.NEQ("fake_conversation_fold_conversation");
        Filter<Conversation> filterNEQ2 = stringColumn.NEQ("fake_conversation_weaken_conversation");
        DoubleColumn<Conversation> doubleColumn = Conversation.LATESTTIME;
        Filter<Conversation> filterLEQ = doubleColumn.LEQ(Double.valueOf(Math.max(CoreModule.f17545c.f19642f0.m32577Ag(), CoreModule.f17545c.f19642f0.m32976hg())));
        Filter<Conversation> filterREQ = doubleColumn.REQ(Double.valueOf(Math.min(CoreModule.f17545c.f19642f0.m32577Ag(), CoreModule.f17545c.f19642f0.m32976hg())));
        IntegerColumn<Conversation> integerColumn = Conversation.LEVEL;
        return new orh0.C19008a("conversations_between_fold_and_weaken", Filter.AND(filterM142007r0, filterNEQ, filterNEQ2, filterLEQ, filterREQ, integerColumn.mo60175EQ(0)), new DoubleOrder(integerColumn.DESC, doubleColumn.DESC), 0, 20);
    }

    /* JADX INFO: renamed from: P0 */
    public final /* synthetic */ orh0.C19008a m141970P0() {
        Filter<Conversation> filterSTARTS_WITH = Conversation.f20372ID.STARTS_WITH("-");
        TEnumColumn<Conversation, ConversationStatus> tEnumColumn = Conversation.STATUS;
        return new orh0.C19008a("conversations_team", Filter.AND(filterSTARTS_WITH, tEnumColumn.NEQ(ConversationStatus.local_fake), tEnumColumn.NEQ("dismissed"), tEnumColumn.NEQ("removed"), tEnumColumn.NEQ(ConversationStatus.invisible), tEnumColumn.NEQ("deleted"), Conversation.OTHERSTATUS.NEQ("invalid")), Conversation.LATESTTIME.DESC, 0, 200);
    }

    /* JADX INFO: renamed from: Q0 */
    public final /* synthetic */ orh0.C19008a m141971Q0() {
        Filter<Conversation> filter = this.f118469V;
        TEnumColumn<Conversation, ConversationStatus> tEnumColumn = Conversation.STATUS;
        return new orh0.C19008a("conversations_team", Filter.AND(filter, tEnumColumn.NEQ(ConversationStatus.local_fake), tEnumColumn.NEQ("dismissed"), tEnumColumn.NEQ("removed"), tEnumColumn.NEQ(ConversationStatus.invisible), tEnumColumn.NEQ("deleted"), Conversation.OTHERSTATUS.NEQ("invalid")), Conversation.LATESTTIME.DESC, 0, 200);
    }

    /* JADX INFO: renamed from: R0 */
    public final /* synthetic */ orh0.C19008a m141972R0() {
        Filter filterM81261OR = Filter.TRUE;
        if (ura.m195053e().m195057d().mo33808c()) {
            filterM81261OR = Filter.m81261OR(Conversation.CONVTYPE.NEQ("quickchat"), Conversation.READ.m81224T(), Conversation.READUNTIL.NEQ(""));
        }
        TEnumColumn<Conversation, NotificationStatus> tEnumColumn = Conversation.LOCALNOTIFICATIONSTATUS;
        Filter filterM81261OR2 = Filter.m81261OR(tEnumColumn.m60176EQ("ongoing"), tEnumColumn.m60176EQ("pending"));
        TEnumColumn<Conversation, ConversationStatus> tEnumColumn2 = Conversation.STATUS;
        return new orh0.C19008a("sysnotif", Filter.AND(filterM81261OR2, tEnumColumn2.NEQ("dismissed"), tEnumColumn2.NEQ(ConversationStatus.local_fake), tEnumColumn2.NEQ("removed"), tEnumColumn2.NEQ(ConversationStatus.invisible), tEnumColumn2.NEQ("deleted"), filterM81261OR), new DoubleOrder(Conversation.LEVEL.DESC, Conversation.LATESTTIME.DESC), 50, 50);
    }

    /* JADX INFO: renamed from: S0 */
    public final /* synthetic */ orh0.C19008a m141973S0() {
        return new orh0.C19008a("new_matches_without_fake_last_time", Filter.AND(Filter.AND(m141981a1().toFilters())), Conversation.LATESTTIME.DESC, 0, 200);
    }

    /* JADX INFO: renamed from: T0 */
    public final /* synthetic */ orh0.C19008a m141974T0() {
        return new orh0.C19008a("new_matches_without_fake_create_time", Filter.AND(Filter.AND(m141981a1().toFilters())), Conversation.CREATEDTIME.DESC, 0, 200);
    }

    /* JADX INFO: renamed from: U0 */
    public final /* synthetic */ orh0.C19008a m141975U0() {
        FilterList<Conversation> filterListM141981a1 = m141981a1();
        filterListM141981a1.add(Conversation.ADDITIONAL_RESWIPE.NOT_NULL());
        filterListM141981a1.add(Conversation.STATUS.NEQ("blocked"));
        return new orh0.C19008a("chat_re_swiped", Filter.AND(filterListM141981a1.toFilters()), Conversation.UPDATEDTIME.DESC, 0, 200);
    }

    /* JADX INFO: renamed from: V0 */
    public orh0<Conversation>.C19008a m141976V0(String str) {
        return new orh0.C19008a("match", Conversation.OTHERUSER.mo60175EQ(str), Conversation.LATESTTIME.DESC, 0, 1);
    }

    /* JADX INFO: renamed from: W0 */
    public orh0<Conversation>.C19008a m141977W0(List<String> list) {
        if (list == null) {
            list = new ArrayList<>();
        }
        list.add("");
        Filter<Conversation> filterNOT_STARTS_WITH = Conversation.f20372ID.NOT_STARTS_WITH("fake_conversation");
        StringColumn<Conversation> stringColumn = Conversation.OTHERUSER;
        Filter<Conversation> filterNOT_IN = stringColumn.NOT_IN(list);
        StringColumn<Conversation> stringColumn2 = Conversation.CONVTYPE;
        Filter<Conversation> filterNEQ = stringColumn2.NEQ("group");
        Filter<Conversation> filterNEQ2 = stringColumn2.NEQ("anonymous");
        TEnumColumn<Conversation, ConversationStatus> tEnumColumn = Conversation.STATUS;
        return new orh0.C19008a("matches_exclude_team_account_and_locked_quickchat", Filter.AND(filterNOT_STARTS_WITH, filterNOT_IN, filterNEQ, filterNEQ2, Filter.AND(tEnumColumn.NEQ("blocked"), tEnumColumn.NEQ("dismissed"), tEnumColumn.NEQ(ConversationStatus.local_fake), tEnumColumn.NEQ("removed"), tEnumColumn.NEQ(ConversationStatus.invisible), tEnumColumn.NEQ("deleted")), stringColumn.NOT_STARTS_WITH("-"), Filter.m81261OR(stringColumn2.NEQ("quickchat"), Conversation.f20373MM.REQ(20))), new DoubleOrder(Conversation.LEVEL.DESC, Conversation.LATESTTIME.DESC), 0, 200);
    }

    /* JADX INFO: renamed from: X0 */
    public orh0<Conversation>.C19008a m141978X0(double d) {
        return new orh0.C19008a("matchesToday", Filter.AND(Conversation.CREATEDTIME.REQ(Double.valueOf(d)), Conversation.f20372ID.NOT_STARTS_WITH("fake_conversation")), Conversation.LATESTTIME.DESC, 0, 200);
    }

    /* JADX INFO: renamed from: Y0 */
    public orh0<Conversation>.C19008a m141979Y0() {
        Filter<Conversation> filterNOT_STARTS_WITH = Conversation.f20372ID.NOT_STARTS_WITH("fake_conversation");
        TEnumColumn<Conversation, ConversationStatus> tEnumColumn = Conversation.STATUS;
        return new orh0.C19008a("matchesWithDoubleOrder", Filter.AND(filterNOT_STARTS_WITH, Filter.AND(tEnumColumn.NEQ("dismissed"), tEnumColumn.NEQ(ConversationStatus.local_fake), tEnumColumn.NEQ("removed"), tEnumColumn.NEQ(ConversationStatus.invisible), tEnumColumn.NEQ("deleted")), m142008s0()), new DoubleOrder(Conversation.LEVEL.DESC, Conversation.LATESTTIME.DESC), 0, 200);
    }

    /* JADX INFO: renamed from: Z0 */
    public orh0<Conversation>.C19008a m141980Z0() {
        Filter<Conversation> filterNOT_STARTS_WITH = Conversation.f20372ID.NOT_STARTS_WITH("fake_conversation");
        Filter filter = this.f118473m;
        TEnumColumn<Conversation, ConversationStatus> tEnumColumn = Conversation.STATUS;
        return new orh0.C19008a("matchesWithDoubleOrder", Filter.AND(filterNOT_STARTS_WITH, filter, Filter.AND(tEnumColumn.NEQ("dismissed"), tEnumColumn.NEQ(ConversationStatus.local_fake), tEnumColumn.NEQ("removed"), tEnumColumn.NEQ(ConversationStatus.invisible), tEnumColumn.NEQ("deleted")), m142008s0()), new DoubleOrder(Conversation.LEVEL.DESC, Conversation.LATESTTIME.DESC), 0, 200);
    }

    /* JADX INFO: renamed from: a1 */
    public FilterList<Conversation> m141981a1() {
        return ura.m195053e().m195057d().mo33835gn() ? m141983c1() : m141982b1();
    }

    /* JADX INFO: renamed from: b1 */
    public FilterList<Conversation> m141982b1() {
        Filter<Conversation> filterNEQ = Filter.TRUE;
        if (ura.m195053e().m195057d().mo33808c()) {
            filterNEQ = Conversation.CONVTYPE.NEQ("quickchat");
        }
        Filter<Conversation> filter = filterNEQ;
        Filter<Conversation> filterNOT_STARTS_WITH = Conversation.f20372ID.NOT_STARTS_WITH("fake_conversation");
        Filter<Conversation> filterNEQ2 = Conversation.OTHERSTATUS.NEQ("invalid");
        TEnumColumn<Conversation, ConversationStatus> tEnumColumn = Conversation.STATUS;
        return FilterList.list(filterNOT_STARTS_WITH, filterNEQ2, tEnumColumn.NEQ("dismissed"), tEnumColumn.NEQ("removed"), tEnumColumn.NEQ(ConversationStatus.invisible), tEnumColumn.NEQ("deleted"), tEnumColumn.NEQ(ConversationStatus.local_fake), this.f118481u.m167769b(), Conversation.LOCALEVERHASMESSAGE.m81223F(), filter);
    }

    /* JADX INFO: renamed from: c1 */
    public FilterList<Conversation> m141983c1() {
        Filter<Conversation> filterNEQ = Filter.TRUE;
        if (ura.m195053e().m195057d().mo33808c()) {
            filterNEQ = Conversation.CONVTYPE.NEQ("quickchat");
        }
        Filter<Conversation> filter = filterNEQ;
        Filter<Conversation> filterNOT_STARTS_WITH = Conversation.f20372ID.NOT_STARTS_WITH("fake_conversation");
        Filter<Conversation> filterNEQ2 = Conversation.OTHERSTATUS.NEQ("invalid");
        TEnumColumn<Conversation, ConversationStatus> tEnumColumn = Conversation.STATUS;
        return FilterList.list(filterNOT_STARTS_WITH, filterNEQ2, tEnumColumn.NEQ("dismissed"), tEnumColumn.NEQ("removed"), tEnumColumn.NEQ(ConversationStatus.invisible), tEnumColumn.NEQ("deleted"), tEnumColumn.NEQ("blocked"), this.f118481u.m167769b(), Conversation.LOCALEVERHASMESSAGE.m81223F(), filter);
    }

    /* JADX INFO: renamed from: d1 */
    public Conversation m141984d1(String str) {
        List<Conversation> listQuery = CoreModule.f17553k.f91950m.query(Conversation.OTHERUSER.mo60175EQ(str), null, 1);
        if (listQuery.isEmpty()) {
            return null;
        }
        return listQuery.get(0);
    }

    /* JADX INFO: renamed from: e1 */
    public List<String> m141985e1() {
        ArrayList arrayList = new ArrayList();
        TEnumColumn<Conversation, ConversationStatus> tEnumColumn = Conversation.STATUS;
        SqlSegment sqlSegmentEmit = Filter.m81261OR(tEnumColumn.m60176EQ("default"), tEnumColumn.m60176EQ("blocked")).emit();
        Cursor cursorQuery = null;
        try {
            cursorQuery = m165598o().query(this.f145283d, new String[]{Conversation.f20372ID.toString()}, sqlSegmentEmit.part, sqlSegmentEmit.args, null, null, Conversation.UPDATEDTIME.DESC.emit());
            while (cursorQuery.moveToNext()) {
                arrayList.add(cursorQuery.getString(0));
            }
            if (NullChecker.m81303a(cursorQuery)) {
                cursorQuery.close();
            }
            return arrayList;
        } catch (Throwable th) {
            if (!NullChecker.m81303a(cursorQuery)) {
                throw th;
            }
            cursorQuery.close();
            throw th;
        }
    }

    /* JADX INFO: renamed from: f1 */
    public orh0<Conversation>.C19008a m141986f1() {
        Filter<Conversation> filterM81223F = Conversation.READ.m81223F();
        StringColumn<Conversation> stringColumn = Conversation.f20372ID;
        Filter<Conversation> filterNOT_STARTS_WITH = stringColumn.NOT_STARTS_WITH("fake_conversation");
        Filter<Conversation> filterNEQ = stringColumn.NEQ(User.ID_LIVE_VIP_SERVICE);
        Filter<Conversation> filterNEQ2 = stringColumn.NEQ(User.ID_LIVE_SERVICE);
        TEnumColumn<Conversation, ConversationStatus> tEnumColumn = Conversation.STATUS;
        Filter<Conversation> filterNEQ3 = tEnumColumn.NEQ("dismissed");
        Filter<Conversation> filterNEQ4 = tEnumColumn.NEQ("blocked");
        Filter<Conversation> filterNEQ5 = tEnumColumn.NEQ("removed");
        Filter<Conversation> filterNEQ6 = tEnumColumn.NEQ(ConversationStatus.invisible);
        Filter<Conversation> filterNEQ7 = tEnumColumn.NEQ("deleted");
        Filter<Conversation> filterM81223F2 = Conversation.LOCALEVERHASMESSAGE.m81223F();
        DoubleColumn<Conversation> doubleColumn = Conversation.CREATEDTIME;
        Filter<Conversation> filterREQ = doubleColumn.REQ(CoreModule.f17545c.f19642f0.f19956m1.get());
        Filter<Conversation> filterNEQ8 = Conversation.OTHERSTATUS.NEQ("invalid");
        StringColumn<Conversation> stringColumn2 = Conversation.CONVTYPE;
        return new orh0.C19008a("queryEnterUnreadNewMatchTimer", Filter.AND(filterM81223F, filterNOT_STARTS_WITH, filterNEQ, filterNEQ2, filterNEQ3, filterNEQ4, filterNEQ5, filterNEQ6, filterNEQ7, filterM81223F2, filterREQ, filterNEQ8, Filter.m81261OR(stringColumn2.mo60175EQ(""), stringColumn2.mo60175EQ("default"))), doubleColumn.DESC, 0, 2);
    }

    /* JADX INFO: renamed from: g1 */
    public j760<List<Conversation>, List<User>> m141987g1(String str) {
        Filter filterM81261OR;
        Filter filterAND;
        List<Conversation> listQuery;
        List<User> listM141998m0 = m141998m0(str);
        List<String> listM142012w0 = m142012w0(listM141998m0);
        if (ura.m195053e().m195057d().mo33676E()) {
            yt4 yt4Var = CoreModule.f17553k.f91951n;
            StringColumn<ChatGroup> stringColumn = ChatGroup.NAME;
            List<ChatGroup> listQuery2 = yt4Var.query(stringColumn.CONTAINS(str), stringColumn.DESC, 200);
            if (!vwb.m200296J(listQuery2)) {
                for (ChatGroup chatGroup : listQuery2) {
                    if (!TextUtils.isEmpty(chatGroup.localConId)) {
                        listM142012w0.add(chatGroup.localConId);
                    }
                }
            }
        }
        List<Conversation> listQuery3 = CoreModule.f17553k.f91950m.query(Filter.AND(Conversation.f20372ID.NOT_STARTS_WITH("fake_conversation"), Conversation.LOCALEXTRAINFO.CONTAINS(str)), Conversation.LATESTTIME.DESC, 200);
        if (!vwb.m200296J(listQuery3)) {
            Iterator<Conversation> it = listQuery3.iterator();
            while (it.hasNext()) {
                listM142012w0.add(it.next().f56011id);
            }
        }
        Filter filter = ura.m195053e().m195057d().mo33802b() ? Filter.TRUE : this.f118473m;
        if (ura.m195053e().m195057d().mo33745R8()) {
            BooleanColumn<Conversation> booleanColumn = Conversation.LOCALEVERHASMESSAGE;
            filterM81261OR = Filter.m81261OR(booleanColumn.m81224T(), Filter.AND(Conversation.CONVTYPE.NEQ("lovebuzz"), booleanColumn.m81223F()));
        } else {
            filterM81261OR = Filter.TRUE;
        }
        Filter filter2 = filterM81261OR;
        Filter filter3 = Filter.TRUE;
        if (CoreModule.f17545c.f19639e0.m169520na().isSVIP()) {
            Filter<Conversation> filterM81268IN = Conversation.f20372ID.m81268IN(listM142012w0);
            TEnumColumn<Conversation, ConversationStatus> tEnumColumn = Conversation.STATUS;
            listQuery = query(Filter.AND(filterM81268IN, filter, filter2, filter3, filter3, tEnumColumn.NEQ(ConversationStatus.local_fake), tEnumColumn.NEQ("deleted")), Conversation.LATESTTIME.DESC, 200);
        } else {
            if (xp5.m210472l()) {
                filterAND = filter3;
            } else {
                StringColumn<Conversation> stringColumn2 = Conversation.CONVTYPE;
                filterAND = Filter.AND(stringColumn2.NEQ("compliment"), stringColumn2.NEQ(ConversationType.swiper));
            }
            Filter<Conversation> filterM81268IN2 = Conversation.f20372ID.m81268IN(listM142012w0);
            Filter<Conversation> filterNEQ = Conversation.CONVTYPE.NEQ(ConversationType.fake_one_side);
            TEnumColumn<Conversation, ConversationStatus> tEnumColumn2 = Conversation.STATUS;
            listQuery = query(Filter.AND(filterM81268IN2, filter, filter2, filter3, filter3, filterAND, filterNEQ, tEnumColumn2.NEQ(ConversationStatus.local_fake), tEnumColumn2.NEQ("deleted")), Conversation.LATESTTIME.DESC, 200);
        }
        return vwb.m200311Y(listQuery, listM141998m0);
    }

    /* JADX INFO: renamed from: h0 */
    public orh0<Conversation>.C19008a m141988h0(double d) {
        String str = "conversation_filter_req_current_time" + d;
        Filter<Conversation> filterM142007r0 = m142007r0();
        StringColumn<Conversation> stringColumn = Conversation.CONVTYPE;
        Filter filterM81261OR = Filter.m81261OR(filterM142007r0, stringColumn.mo60175EQ("marriage"));
        Filter<Conversation> filterNEQ = stringColumn.NEQ("group");
        StringColumn<Conversation> stringColumn2 = Conversation.f20372ID;
        Filter<Conversation> filterNOT_STARTS_WITH = stringColumn2.NOT_STARTS_WITH("fake_conversation_fold_conversation");
        Filter<Conversation> filterNOT_STARTS_WITH2 = stringColumn2.NOT_STARTS_WITH("fake_conversation_weaken_conversation");
        DoubleColumn<Conversation> doubleColumn = Conversation.LATESTTIME;
        return new orh0.C19008a(str, Filter.AND(filterM81261OR, filterNEQ, filterNOT_STARTS_WITH, filterNOT_STARTS_WITH2, doubleColumn.REQ(Double.valueOf(d))), doubleColumn.DESC, 0, 20);
    }

    /* JADX INFO: renamed from: h1 */
    public orh0<Conversation>.C19008a m141989h1() {
        Filter<Conversation> filterM60176EQ = Conversation.LOCALPLACEBAN.m60176EQ("both");
        TEnumColumn<Conversation, ConversationStatus> tEnumColumn = Conversation.STATUS;
        return new orh0.C19008a("noMatch_seeletter_byother", Filter.AND(filterM60176EQ, tEnumColumn.NEQ(ConversationStatus.local_fake), tEnumColumn.NEQ("deleted"), tEnumColumn.NEQ("removed"), tEnumColumn.NEQ(ConversationStatus.invisible), tEnumColumn.NEQ("dismissed")), Conversation.LATESTTIME.DESC, 0, 200);
    }

    /* JADX INFO: renamed from: i0 */
    public int m141990i0() {
        return count(Conversation.f20372ID.NOT_STARTS_WITH("fake_conversation"), -1);
    }

    /* JADX INFO: renamed from: i1 */
    public Filter<Conversation> m141991i1() {
        return ura.m195053e().m195057d().mo33808c() ? Filter.m81261OR(Conversation.CONVTYPE.NEQ("quickchat"), Conversation.READ.m81224T(), Conversation.READUNTIL.NEQ("")) : Filter.TRUE;
    }

    /* JADX INFO: renamed from: j0 */
    public orh0<Conversation>.C19008a m141992j0() {
        String str = "conversations_active_time_between_one_and_seven_day" + mqi0.m155944o();
        Filter<Conversation> filterM142007r0 = m142007r0();
        Filter<Conversation> filter = this.f118470W;
        Filter<Conversation> filterM81224T = Conversation.LOCALHASMESSAGE.m81224T();
        StringColumn<Conversation> stringColumn = Conversation.f20372ID;
        Filter<Conversation> filterNEQ = stringColumn.NEQ("fake_conversation_fold_conversation");
        Filter<Conversation> filterNEQ2 = stringColumn.NEQ("fake_conversation_weaken_conversation");
        Filter<Conversation> filterMo60175EQ = Conversation.CONVTYPE.mo60175EQ("default");
        TEnumColumn<Conversation, ConversationStatus> tEnumColumn = Conversation.STATUS;
        Filter<Conversation> filterNEQ3 = tEnumColumn.NEQ("dismissed");
        Filter<Conversation> filterNEQ4 = tEnumColumn.NEQ("blocked");
        DoubleColumn<Conversation> doubleColumn = Conversation.LATESTTIME;
        return new orh0.C19008a(str, Filter.AND(filterM142007r0, filter, filterM81224T, filterNEQ, filterNEQ2, filterMo60175EQ, filterNEQ3, filterNEQ4, doubleColumn.LEQ(Double.valueOf(m142011v0(1))), doubleColumn.REQ(Double.valueOf(m142011v0(7)))), new DoubleOrder(Conversation.LEVEL.DESC, doubleColumn.DESC), 0, 200);
    }

    /* JADX INFO: renamed from: j1 */
    public List<Conversation> m141993j1() {
        Filter<Conversation> filterNOT_STARTS_WITH = Conversation.OTHERUSER.NOT_STARTS_WITH("-");
        Filter<Conversation> filterMo60175EQ = Conversation.CONVTYPE.mo60175EQ("default");
        Filter<Conversation> filterMo60175EQ2 = Conversation.UNREADMESSAGES.mo60175EQ(0);
        Filter<Conversation> filterM81224T = Conversation.READ.m81224T();
        Filter<Conversation> filterREQ = Conversation.USERMESSAGECOUNT.REQ(0);
        TEnumColumn<Conversation, ConversationStatus> tEnumColumn = Conversation.STATUS;
        return query(Filter.AND(filterNOT_STARTS_WITH, filterMo60175EQ, filterMo60175EQ2, filterM81224T, filterREQ, Filter.AND(tEnumColumn.NEQ("dismissed"), tEnumColumn.NEQ(ConversationStatus.local_fake), tEnumColumn.NEQ("removed"), tEnumColumn.NEQ(ConversationStatus.invisible), tEnumColumn.NEQ("deleted"))), new DoubleOrder(Conversation.LEVEL.DESC, Conversation.LATESTTIME.DESC), 60);
    }

    /* JADX INFO: renamed from: k0 */
    public int m141994k0(List<String> list) {
        if (list == null) {
            list = new ArrayList<>();
        }
        Filter<Conversation> filterNOT_STARTS_WITH = Conversation.f20372ID.NOT_STARTS_WITH("fake_conversation");
        Filter<Conversation> filterNOT_IN = Conversation.OTHERUSER.NOT_IN(list);
        TEnumColumn<Conversation, ConversationStatus> tEnumColumn = Conversation.STATUS;
        return count(Filter.AND(filterNOT_STARTS_WITH, filterNOT_IN, Filter.AND(tEnumColumn.NEQ("dismissed"), tEnumColumn.NEQ(ConversationStatus.local_fake), tEnumColumn.NEQ("removed"), tEnumColumn.NEQ(ConversationStatus.invisible), tEnumColumn.NEQ("deleted"))), -1);
    }

    /* JADX INFO: renamed from: k1 */
    public void m141995k1(NotificationStatus notificationStatus, NotificationStatus notificationStatus2) {
        TEnumColumn<Conversation, NotificationStatus> tEnumColumn = Conversation.LOCALNOTIFICATIONSTATUS;
        update(vwb.m200324f0(vwb.m200311Y(tEnumColumn, notificationStatus2)), tEnumColumn.m60176EQ(notificationStatus.toString()));
    }

    /* JADX INFO: renamed from: l0 */
    public int m141996l0() {
        Filter<Conversation> filterNOT_STARTS_WITH = Conversation.f20372ID.NOT_STARTS_WITH("fake_conversation");
        Filter<Conversation> filterNEQ = Conversation.CONVTYPE.NEQ("group");
        Filter<Conversation> filterM81223F = Conversation.LOCALEVERHASMESSAGE.m81223F();
        TEnumColumn<Conversation, ConversationStatus> tEnumColumn = Conversation.STATUS;
        return count(Filter.AND(filterNOT_STARTS_WITH, filterNEQ, filterM81223F, Filter.AND(tEnumColumn.NEQ("dismissed"), tEnumColumn.NEQ(ConversationStatus.local_fake), tEnumColumn.NEQ("removed"), tEnumColumn.NEQ(ConversationStatus.invisible), tEnumColumn.NEQ("deleted"))), -1);
    }

    /* JADX INFO: renamed from: l1 */
    public orh0<Conversation>.C19008a m141997l1(long j) {
        StringColumn<Conversation> stringColumn = Conversation.f20372ID;
        Filter<Conversation> filterNOT_STARTS_WITH = stringColumn.NOT_STARTS_WITH("-");
        Filter<Conversation> filterNOT_STARTS_WITH2 = stringColumn.NOT_STARTS_WITH("fake_conversation");
        DoubleColumn<Conversation> doubleColumn = Conversation.CREATEDTIME;
        Filter<Conversation> filterREQ = doubleColumn.REQ(Double.valueOf(j));
        TEnumColumn<Conversation, ConversationStatus> tEnumColumn = Conversation.STATUS;
        return new orh0.C19008a("today_matches_list_by_last_time", Filter.AND(Filter.AND(FilterList.list(filterNOT_STARTS_WITH, filterNOT_STARTS_WITH2, filterREQ, Filter.m81261OR(tEnumColumn.m60176EQ("default"), tEnumColumn.m60176EQ("dismissed"), tEnumColumn.m60176EQ("blocked"), tEnumColumn.m60176EQ("removed"), tEnumColumn.m60176EQ(ConversationStatus.invisible)), Conversation.CONVTYPE.mo60175EQ("default")).toFilters())), doubleColumn.DESC, 0, ura.m195053e().m195057d().mo33668Cq());
    }

    /* JADX INFO: renamed from: m0 */
    public final List<User> m141998m0(final String str) {
        if (ura.m195053e().m195057d().mo33875l()) {
            return qib0.f154722k0.f176631d.query(Filter.m81261OR(User.NAME.CONTAINS(str), User.f38825ID.m81268IN(vwb.m200303Q(vwb.m200339n(CoreModule.f17545c.f19639e0.m169423O7().values(), new w9j() { // from class: l.hk6
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return Boolean.valueOf(((GPMemo) obj).memo.toLowerCase().contains(str.toLowerCase()));
                }
            }), new w9j() { // from class: l.sk6
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return ((GPMemo) obj).userId;
                }
            })), User.PUBLICID.CONTAINS(str)), null, 200);
        }
        Map<String, GPMemo> mapM169423O7 = CoreModule.f17545c.f19639e0.m169423O7();
        ArrayList arrayListM200303Q = vwb.m200303Q(vwb.m200339n(mapM169423O7.values(), new w9j() { // from class: l.bl6
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(((GPMemo) obj).memo.toLowerCase().contains(str.toLowerCase()));
            }
        }), new w9j() { // from class: l.cl6
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return ((GPMemo) obj).userId;
            }
        });
        ArrayList arrayListM200303Q2 = vwb.m200303Q(mapM169423O7.values(), new w9j() { // from class: l.dl6
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return ((GPMemo) obj).userId;
            }
        });
        y9k0 y9k0Var = qib0.f154722k0.f176631d;
        Filter<User> filterCONTAINS = User.NAME.CONTAINS(str);
        StringColumn<User> stringColumn = User.f38825ID;
        return y9k0Var.query(Filter.m81261OR(Filter.AND(filterCONTAINS, stringColumn.NOT_IN(arrayListM200303Q2)), stringColumn.m81268IN(arrayListM200303Q)), null, 200);
    }

    /* JADX INFO: renamed from: m1 */
    public orh0<Conversation>.C19008a m141999m1(int i) {
        Filter<Conversation> filterAND;
        if (ura.m195053e().m195057d().mo33802b()) {
            filterAND = Conversation.f20372ID.NOT_STARTS_WITH("fake_conversation");
        } else {
            StringColumn<Conversation> stringColumn = Conversation.f20372ID;
            filterAND = Filter.AND(stringColumn.NOT_STARTS_WITH("fake_conversation"), stringColumn.NEQ(User.ID_LIVE_VIP_SERVICE), stringColumn.NEQ(User.ID_LIVE_SERVICE));
        }
        Filter filterM81261OR = Filter.TRUE;
        if (ura.m195053e().m195057d().mo33920sa()) {
            StringColumn<Conversation> stringColumn2 = Conversation.f20372ID;
            filterM81261OR = Filter.m81261OR(stringColumn2.NOT_STARTS_WITH("-"), stringColumn2.mo60175EQ(User.ID_LIVE_VIP_SERVICE), stringColumn2.mo60175EQ(User.ID_VERIVICATION_ASSISTANT));
        }
        Filter filterM142013x0 = m142013x0();
        TEnumColumn<Conversation, ConversationStatus> tEnumColumn = Conversation.STATUS;
        return new orh0.C19008a("unreadConversation", Filter.AND(filterAND, filterM142013x0, Filter.AND(tEnumColumn.NEQ("dismissed"), tEnumColumn.NEQ(ConversationStatus.local_fake), tEnumColumn.NEQ("removed"), tEnumColumn.NEQ(ConversationStatus.invisible), tEnumColumn.NEQ("deleted")), Conversation.UNREADMESSAGES.NEQ(0), filterM81261OR), new DoubleOrder(Conversation.LEVEL.DESC, Conversation.LATESTTIME.DESC), 0, i);
    }

    /* JADX INFO: renamed from: n0 */
    public Filter m142000n0() {
        if (!ura.m195053e().m195057d().mo33658B()) {
            return Filter.TRUE;
        }
        TEnumColumn<Conversation, LocalPlaceBan> tEnumColumn = Conversation.LOCALPLACEBAN;
        return Filter.AND(tEnumColumn.NEQ(LocalPlaceBan.chatList), tEnumColumn.NEQ("both"));
    }

    /* JADX INFO: renamed from: n1 */
    public List<Conversation> m142001n1() {
        Filter<Conversation> filterNOT_STARTS_WITH = Conversation.OTHERUSER.NOT_STARTS_WITH("-");
        Filter<Conversation> filterMo60175EQ = Conversation.CONVTYPE.mo60175EQ("default");
        Filter<Conversation> filterREQ = Conversation.UNREADMESSAGES.REQ(1);
        TEnumColumn<Conversation, ConversationStatus> tEnumColumn = Conversation.STATUS;
        return query(Filter.AND(filterNOT_STARTS_WITH, filterMo60175EQ, filterREQ, Filter.AND(tEnumColumn.NEQ("dismissed"), tEnumColumn.NEQ(ConversationStatus.local_fake), tEnumColumn.NEQ("removed"), tEnumColumn.NEQ(ConversationStatus.invisible), tEnumColumn.NEQ("deleted"))), new DoubleOrder(Conversation.LEVEL.DESC, Conversation.LATESTTIME.DESC), 60);
    }

    /* JADX INFO: renamed from: o0 */
    public orh0<Conversation>.C19008a m142002o0() {
        Filter<Conversation> filterMo60175EQ = Conversation.CONVTYPE.mo60175EQ(ConversationType.free_see_match);
        IntegerColumn<Conversation> integerColumn = Conversation.LOCALISLIMITEDTRIALSEE;
        return new orh0.C19008a("queryLimitedTrialSee", Filter.AND(filterMo60175EQ, Filter.m81261OR(integerColumn.mo60175EQ(1), integerColumn.mo60175EQ(2))), Conversation.UPDATEDTIME.DESC, 0, 50);
    }

    /* JADX INFO: renamed from: o1 */
    public orh0<Conversation>.C19008a m142003o1(int i) {
        StringColumn<Conversation> stringColumn = Conversation.f20372ID;
        Filter<Conversation> filterNOT_STARTS_WITH = stringColumn.NOT_STARTS_WITH("-");
        Filter<Conversation> filterNOT_STARTS_WITH2 = stringColumn.NOT_STARTS_WITH("fake_conversation");
        Filter filterM142013x0 = m142013x0();
        TEnumColumn<Conversation, ConversationStatus> tEnumColumn = Conversation.STATUS;
        return new orh0.C19008a("unreadDefaultConversation", Filter.AND(filterNOT_STARTS_WITH, filterNOT_STARTS_WITH2, filterM142013x0, Filter.AND(tEnumColumn.NEQ("dismissed"), tEnumColumn.NEQ(ConversationStatus.local_fake), tEnumColumn.NEQ("removed"), tEnumColumn.NEQ(ConversationStatus.invisible), tEnumColumn.NEQ("deleted")), Conversation.UNREADMESSAGES.NEQ(0)), new DoubleOrder(Conversation.LEVEL.DESC, Conversation.LATESTTIME.DESC), 0, i);
    }

    /* JADX INFO: renamed from: p0 */
    public orh0<Conversation>.C19008a m142004p0() {
        return new orh0.C19008a("queryLimitedTrialSeeNoLimited", Filter.AND(Conversation.CONVTYPE.mo60175EQ(ConversationType.free_see_match), Conversation.LOCALISLIMITEDTRIALSEE.mo60175EQ(0)), Conversation.CREATEDTIME.DESC, 0, 50);
    }

    @Override // p149l.orh0
    /* JADX INFO: renamed from: p1, reason: merged with bridge method [inline-methods] */
    public Conversation upsert(Conversation conversation, f30<Conversation, Conversation> f30Var) {
        if (conversation.localHasMessage || (!TextUtils.isEmpty(conversation.clearedUntil) && !TextUtils.equals(conversation.clearedUntil, "0"))) {
            conversation.localEverHasMessage = true;
        }
        if (!NullChecker.m81303a(conversation.f56011id)) {
            CrashHelper.m81296c(new IllegalStateException("【.id判空】conv id = null  upsert = , " + conversation.toJson() + "   conv._id = " + conversation._id));
        }
        return (Conversation) super.upsert(conversation, f30Var);
    }

    /* JADX INFO: renamed from: q0 */
    public Filter m142006q0() {
        return Conversation.f20372ID.NEQ("fake_conversation_local_summary_marriage_conversation");
    }

    /* JADX INFO: renamed from: r0 */
    public Filter<Conversation> m142007r0() {
        TEnumColumn<Conversation, ConversationStatus> tEnumColumn = Conversation.STATUS;
        FilterList list = FilterList.list(tEnumColumn.NEQ(ConversationStatus.local_fake), tEnumColumn.NEQ("dismissed"), tEnumColumn.NEQ("removed"), tEnumColumn.NEQ(ConversationStatus.invisible), tEnumColumn.NEQ("deleted"), m142006q0());
        StringColumn<Conversation> stringColumn = Conversation.CONVTYPE;
        list.add(stringColumn.NEQ(ConversationType.swiper));
        list.add(Filter.m81261OR(new C17810a(), Filter.AND(Conversation.CREATEDTIME.REQ(ura.m195053e().m195057d().mo33836go()), Filter.m81261OR(Filter.AND(stringColumn.mo60175EQ("quickchat"), tEnumColumn.m60176EQ("default")), tEnumColumn.m60176EQ(ConversationStatus.peeking)))));
        if (!ura.m195053e().m195057d().mo33802b()) {
            list.add(this.f118473m);
        }
        list.add(m142013x0());
        if (ura.m195053e().m195057d().mo33745R8()) {
            BooleanColumn<Conversation> booleanColumn = Conversation.LOCALEVERHASMESSAGE;
            list.add(Filter.m81261OR(booleanColumn.m81224T(), Filter.AND(stringColumn.NEQ("lovebuzz"), booleanColumn.m81223F())));
        }
        if (ura.m195053e().m195057d().mo33747Rk()) {
            list.add(ura.m195053e().m195057d().mo33920sa() ? this.f118470W : this.f118456I);
        } else {
            list.add(this.f118457J);
        }
        if (CoreModule.m29935P().m94651a().mo33394Qb()) {
            list.add(Filter.m81261OR(Conversation.LOCALISLIMITEDTRIALSEE.NEQ(2), stringColumn.NEQ(ConversationType.free_see_match)));
        }
        return Filter.AND(list.toFilters());
    }

    /* JADX INFO: renamed from: s0 */
    public Filter m142008s0() {
        if (!ura.m195053e().m195057d().mo33658B()) {
            return Filter.TRUE;
        }
        TEnumColumn<Conversation, LocalPlaceBan> tEnumColumn = Conversation.LOCALPLACEBAN;
        return Filter.AND(tEnumColumn.NEQ(LocalPlaceBan.matchList), tEnumColumn.NEQ("both"));
    }

    /* JADX INFO: renamed from: t0 */
    public Filter<Conversation> m142009t0() {
        TEnumColumn<Conversation, ConversationStatus> tEnumColumn = Conversation.STATUS;
        return Filter.AND(FilterList.list(tEnumColumn.NEQ(ConversationStatus.local_fake), tEnumColumn.NEQ("dismissed"), tEnumColumn.NEQ("removed"), tEnumColumn.NEQ(ConversationStatus.invisible), tEnumColumn.NEQ("deleted"), Conversation.OTHERSTATUS.NEQ("invalid"), Conversation.CONVTYPE.mo60175EQ("marriage")).toFilters());
    }

    /* JADX INFO: renamed from: u0 */
    public Filter<Conversation> m142010u0() {
        TEnumColumn<Conversation, ConversationStatus> tEnumColumn = Conversation.STATUS;
        return Filter.AND(FilterList.list(tEnumColumn.NEQ(ConversationStatus.local_fake), tEnumColumn.NEQ("dismissed"), tEnumColumn.NEQ("removed"), tEnumColumn.NEQ(ConversationStatus.invisible), tEnumColumn.NEQ("deleted"), Conversation.OTHERSTATUS.NEQ("invalid"), Conversation.UNREADMESSAGES.REQ(1), Conversation.CONVTYPE.mo60175EQ("marriage")).toFilters());
    }

    /* JADX INFO: renamed from: v0 */
    public final double m142011v0(int i) {
        return mqi0.m155944o() - (((long) (i * MMKV.ExpireInDay)) * 1000);
    }

    /* JADX INFO: renamed from: w0 */
    public final List<String> m142012w0(List<User> list) {
        ArrayList arrayList = new ArrayList();
        if (!vwb.m200296J(list)) {
            for (int i = 0; i < list.size(); i++) {
                User user = list.get(i);
                if (NullChecker.m81303a(user) && !user.isBannedNew() && !user.isBanned()) {
                    arrayList.add(user.f56011id);
                }
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: x0 */
    public Filter m142013x0() {
        return Filter.TRUE;
    }

    /* JADX INFO: renamed from: y0 */
    public orh0<Conversation>.C19008a m142014y0(String str) {
        return new orh0.C19008a("groupConversation/" + str, Filter.AND(Conversation.CONVTYPE.mo60175EQ("group"), Conversation.OTHERUSER.mo60175EQ(str)), Conversation.CREATEDTIME.DESC, 0, 1);
    }

    /* JADX INFO: renamed from: z0 */
    public orh0<Conversation>.C19008a m142015z0() {
        Filter<Conversation> filterNOT_STARTS_WITH = Conversation.f20372ID.NOT_STARTS_WITH("fake_conversation");
        TEnumColumn<Conversation, ConversationStatus> tEnumColumn = Conversation.STATUS;
        return new orh0.C19008a("intlChatConversationOrder", Filter.AND(filterNOT_STARTS_WITH, Filter.AND(tEnumColumn.NEQ("dismissed"), tEnumColumn.NEQ(ConversationStatus.local_fake), tEnumColumn.NEQ("removed"), tEnumColumn.NEQ(ConversationStatus.invisible), tEnumColumn.NEQ("deleted"), Conversation.LOCALEVERHASMESSAGE.m81224T()), m142000n0()), new DoubleOrder(Conversation.LEVEL.DESC, Conversation.LATESTTIME.DESC), 0, 200);
    }
}
