package p006l;

import android.database.Cursor;
import android.text.TextUtils;
import com.p000p1.mobile.putong.account.data.CameraSticker;
import com.p000p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.data.ChatGroup;
import com.p1.mobile.putong.core.data.Conversation;
import com.p1.mobile.putong.core.data.NotificationStatus;
import com.p1.mobile.putong.data.GPMemo;
import com.p1.mobile.putong.data.User;
import com.p1.mobile.putong.data.tenum.TEnumColumn;
import com.tantanapp.common.data.DbObject;
import com.tantanapp.common.data.orm.BooleanColumn;
import com.tantanapp.common.data.orm.Column;
import com.tantanapp.common.data.orm.DoubleColumn;
import com.tantanapp.common.data.orm.DoubleOrder;
import com.tantanapp.common.data.orm.Filter;
import com.tantanapp.common.data.orm.FilterList;
import com.tantanapp.common.data.orm.Index;
import com.tantanapp.common.data.orm.IntegerColumn;
import com.tantanapp.common.data.orm.Order;
import com.tantanapp.common.data.orm.OrderedColumn;
import com.tantanapp.common.data.orm.SqlSegment;
import com.tantanapp.common.data.orm.StringColumn;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import l.b8c;
import l.d30;
import l.f30;
import l.j760;
import l.mqi0;
import l.mrf0;
import l.orh0;
import l.p7r;
import l.v9j;
import l.vwb;
import l.w9j;
import l.xaj0;
import l.zrh0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class jl6 extends orh0<Conversation> {

    /* JADX INFO: renamed from: A */
    public orh0<Conversation>.a f15208A;

    /* JADX INFO: renamed from: B */
    public orh0<Conversation>.a f15209B;

    /* JADX INFO: renamed from: C */
    public orh0<Conversation>.a f15210C;

    /* JADX INFO: renamed from: D */
    public orh0<Conversation>.a f15211D;

    /* JADX INFO: renamed from: E */
    public orh0<Conversation>.a f15212E;

    /* JADX INFO: renamed from: F */
    public orh0<Conversation>.a f15213F;

    /* JADX INFO: renamed from: G */
    public p7r<orh0<Conversation>.a> f15214G;

    /* JADX INFO: renamed from: H */
    public orh0<Conversation>.a f15215H;

    /* JADX INFO: renamed from: I */
    public final Filter<Conversation> f15216I;

    /* JADX INFO: renamed from: J */
    public final Filter<Conversation> f15217J;

    /* JADX INFO: renamed from: K */
    public p7r<orh0<Conversation>.a> f15218K;

    /* JADX INFO: renamed from: L */
    public p7r<orh0<Conversation>.a> f15219L;

    /* JADX INFO: renamed from: M */
    public p7r<orh0<Conversation>.a> f15220M;

    /* JADX INFO: renamed from: N */
    public p7r<orh0<Conversation>.a> f15221N;

    /* JADX INFO: renamed from: O */
    public p7r<orh0<Conversation>.a> f15222O;

    /* JADX INFO: renamed from: P */
    public p7r<orh0<Conversation>.a> f15223P;

    /* JADX INFO: renamed from: Q */
    public p7r<orh0<Conversation>.a> f15224Q;

    /* JADX INFO: renamed from: R */
    public p7r<orh0<Conversation>.a> f15225R;

    /* JADX INFO: renamed from: S */
    public p7r<orh0<Conversation>.a> f15226S;

    /* JADX INFO: renamed from: T */
    public p7r<orh0<Conversation>.a> f15227T;

    /* JADX INFO: renamed from: U */
    public orh0<Conversation>.a f15228U;

    /* JADX INFO: renamed from: V */
    public Filter<Conversation> f15229V;

    /* JADX INFO: renamed from: W */
    public final Filter<Conversation> f15230W;

    /* JADX INFO: renamed from: X */
    public p7r<orh0<Conversation>.a> f15231X;

    /* JADX INFO: renamed from: Y */
    public p7r<orh0<Conversation>.a> f15232Y;

    /* JADX INFO: renamed from: m */
    public Filter f15233m;

    /* JADX INFO: renamed from: n */
    public orh0<Conversation>.a f15234n;

    /* JADX INFO: renamed from: o */
    public p7r<orh0<Conversation>.a> f15235o;

    /* JADX INFO: renamed from: p */
    public orh0<Conversation>.a f15236p;

    /* JADX INFO: renamed from: q */
    public orh0<Conversation>.a f15237q;

    /* JADX INFO: renamed from: r */
    public orh0<Conversation>.a f15238r;

    /* JADX INFO: renamed from: s */
    public orh0<Conversation>.a f15239s;

    /* JADX INFO: renamed from: t */
    public orh0<Conversation>.a f15240t;

    /* JADX INFO: renamed from: u */
    public p7r<Filter<Conversation>> f15241u;

    /* JADX INFO: renamed from: v */
    public p7r<orh0<Conversation>.a> f15242v;

    /* JADX INFO: renamed from: w */
    public p7r<orh0<Conversation>.a> f15243w;

    /* JADX INFO: renamed from: x */
    public p7r<orh0<Conversation>.a> f15244x;

    /* JADX INFO: renamed from: y */
    public orh0<Conversation>.a f15245y;

    /* JADX INFO: renamed from: z */
    public orh0<Conversation>.a f15246z;

    /* JADX INFO: renamed from: l.jl6$a */
    public class C0893a extends Filter<Conversation> {
        public C0893a() {
        }

        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public boolean filter(Conversation conversation) {
            return true;
        }

        public SqlSegment emit() {
            return SqlSegment.TRUE;
        }

        public SqlSegment emitWithPrefix() {
            return SqlSegment.TRUE;
        }
    }

    public jl6(b8c b8cVar, String str, mrf0<Conversation> mrf0Var, List<Index> list, int i) {
        super(b8cVar, str, mrf0Var, list, i);
        StringColumn stringColumn = Conversation.ID;
        this.f15233m = Filter.AND(new Filter[]{stringColumn.NEQ("-11000"), stringColumn.NEQ("-11001")});
        Column column = Conversation.UNREADMESSAGES;
        Filter filterREQ = column.REQ(1);
        StringColumn stringColumn2 = Conversation.OTHERUSER;
        Filter filterAND = Filter.AND(new Filter[]{filterREQ, stringColumn2.REQ("1")});
        Column column2 = Conversation.LEVEL;
        Order order = ((OrderedColumn) column2).DESC;
        DoubleColumn doubleColumn = Conversation.LATESTTIME;
        this.f15234n = new orh0.a(this, "unreadUserMessageConversations", filterAND, new DoubleOrder(order, ((OrderedColumn) doubleColumn).DESC), 1, 5);
        this.f15235o = p7r.c(new v9j() { // from class: l.fl6
            public final Object call() {
                return this.f12753a.m17572R0();
            }
        });
        Filter filterNOT_STARTS_WITH = stringColumn.NOT_STARTS_WITH("fake_conversation");
        Column column3 = Conversation.STATUS;
        this.f15236p = new orh0.a(this, "matches", Filter.AND(new Filter[]{filterNOT_STARTS_WITH, Filter.AND(new Filter[]{column3.NEQ("dismissed"), column3.NEQ("local_fake"), column3.NEQ("removed"), column3.NEQ("invisible"), column3.NEQ("deleted")})}), ((OrderedColumn) doubleColumn).DESC, 0, 200);
        Filter filterNOT_STARTS_WITH2 = stringColumn.NOT_STARTS_WITH("fake_conversation");
        StringColumn stringColumn3 = Conversation.CONVTYPE;
        this.f15237q = new orh0.a(this, "user_matches_without_group", Filter.AND(new Filter[]{filterNOT_STARTS_WITH2, stringColumn3.NEQ("group"), Filter.AND(new Filter[]{column3.NEQ("dismissed"), column3.NEQ("removed"), column3.NEQ("invisible"), column3.NEQ("deleted")})}), new DoubleOrder(((OrderedColumn) column2).DESC, ((OrderedColumn) doubleColumn).DESC), 0, 200);
        this.f15238r = new orh0.a(this, "matchesWithoutFakeGroupChat", Filter.AND(new Filter[]{stringColumn.NOT_STARTS_WITH("fake_conversation"), m17613x0(), Filter.AND(new Filter[]{stringColumn3.EQ(ura.m25555e().m25559d().m5709W7()), column3.NEQ("dismissed"), column3.NEQ("local_fake"), column3.NEQ("removed"), column3.NEQ("invisible"), column3.NEQ("deleted")})}), new DoubleOrder(((OrderedColumn) column2).DESC, ((OrderedColumn) doubleColumn).DESC), 0, 200);
        this.f15239s = new orh0.a(this, "matchesWithoutFakeGroupChatWithoutLiveUser", Filter.AND(new Filter[]{stringColumn.NOT_STARTS_WITH("fake_conversation"), this.f15233m, m17613x0(), Filter.AND(new Filter[]{stringColumn3.EQ(ura.m25555e().m25559d().m5709W7()), column3.NEQ("dismissed"), column3.NEQ("local_fake"), column3.NEQ("removed"), column3.NEQ("invisible"), column3.NEQ("deleted")})}), new DoubleOrder(((OrderedColumn) column2).DESC, ((OrderedColumn) doubleColumn).DESC), 0, 200);
        this.f15240t = new orh0.a(this, "addressBookWithoutFakeGroupChatList", Filter.AND(new Filter[]{stringColumn.NOT_STARTS_WITH("fake_conversation"), this.f15233m, Filter.AND(new Filter[]{Filter.OR(new Filter[]{stringColumn3.EQ(ura.m25555e().m25559d().m5709W7()), stringColumn3.EQ("virtualvoice")}), column3.NEQ("dismissed"), column3.NEQ("local_fake"), column3.NEQ("removed"), column3.NEQ("invisible"), column3.NEQ("deleted")})}), new DoubleOrder(((OrderedColumn) column2).DESC, ((OrderedColumn) doubleColumn).DESC), 0, 200);
        this.f15241u = p7r.c(new v9j() { // from class: l.pk6
            public final Object call() {
                return jl6.m17538Q();
            }
        });
        this.f15242v = p7r.c(new v9j() { // from class: l.rk6
            public final Object call() {
                return this.f20586a.m17573S0();
            }
        });
        this.f15243w = p7r.c(new v9j() { // from class: l.tk6
            public final Object call() {
                return this.f22146a.m17574T0();
            }
        });
        this.f15244x = p7r.c(new v9j() { // from class: l.uk6
            public final Object call() {
                return this.f23584a.m17575U0();
            }
        });
        Filter filterNOT_STARTS_WITH3 = stringColumn.NOT_STARTS_WITH("fake_conversation");
        Filter filterEQ = column3.EQ("dismissed");
        StringColumn stringColumn4 = Conversation.OTHERSTATUS;
        Filter filterAND2 = Filter.AND(new Filter[]{filterNOT_STARTS_WITH3, filterEQ, stringColumn4.NEQ("invalid"), stringColumn3.NEQ("timeLimited")});
        DoubleColumn doubleColumn2 = Conversation.UPDATEDTIME;
        this.f15245y = new orh0.a(this, "matches_deleted", filterAND2, ((OrderedColumn) doubleColumn2).DESC, 0, 200);
        this.f15246z = new orh0.a(this, "is_otherStatus_invalid", Filter.AND(new Filter[]{stringColumn.NOT_STARTS_WITH("fake_conversation"), column3.EQ("dismissed"), stringColumn4.EQ("invalid"), stringColumn3.NEQ("timeLimited")}), ((OrderedColumn) doubleColumn2).DESC, 0, 1);
        this.f15208A = new orh0.a(this, "all_matches_without_del_and_fake", Filter.AND(new Filter[]{stringColumn.NOT_STARTS_WITH("fake_conversation"), Filter.AND(new Filter[]{stringColumn.NOT_STARTS_WITH("-"), stringColumn.NOT_STARTS_WITH("fake_conversation"), stringColumn.NOT_STARTS_WITH("conversation_feed_state"), stringColumn.NOT_STARTS_WITH("conversation_feed_interaction"), stringColumn.NOT_STARTS_WITH("conversation_feed_featured")}), column3.NEQ("deleted"), stringColumn3.EQ(CameraSticker.CATEGORY_DEFAULT_FILTER), stringColumn4.NEQ("invalid"), column3.NEQ("dismissed")}), ((OrderedColumn) doubleColumn2).DESC, 0, 200);
        this.f15209B = new orh0.a(this, "del_matches", Filter.AND(new Filter[]{stringColumn.NOT_STARTS_WITH("fake_conversation"), m17613x0(), column3.EQ("removed")}), new DoubleOrder(((OrderedColumn) column2).DESC, ((OrderedColumn) doubleColumn2).DESC), 0, 200);
        this.f15210C = new orh0.a(this, "hide_matches", Filter.AND(new Filter[]{stringColumn.NOT_STARTS_WITH("fake_conversation"), m17613x0(), column3.EQ("invisible")}), new DoubleOrder(((OrderedColumn) column2).DESC, ((OrderedColumn) doubleColumn2).DESC), 0, 200);
        Filter filterNOT_STARTS_WITH4 = stringColumn.NOT_STARTS_WITH("fake_conversation");
        Filter filterAND3 = Filter.AND(new Filter[]{column3.NEQ("local_fake"), column3.NEQ("dismissed"), column3.NEQ("removed"), column3.NEQ("invisible"), column3.NEQ("deleted")});
        BooleanColumn booleanColumn = Conversation.LOCALHASMESSAGE;
        this.f15211D = new orh0.a(this, "conversations_without_fake", Filter.AND(new Filter[]{filterNOT_STARTS_WITH4, filterAND3, booleanColumn.T()}), new DoubleOrder(((OrderedColumn) column2).DESC, ((OrderedColumn) doubleColumn).DESC), 0, 200);
        this.f15212E = new orh0.a(this, "all_conversations_without_fake", Filter.AND(new Filter[]{stringColumn.NOT_STARTS_WITH("fake_conversation")}), new DoubleOrder(((OrderedColumn) column2).DESC, ((OrderedColumn) doubleColumn).DESC), 0, 200);
        this.f15213F = new orh0.a(this, "user_conversations_without_group", Filter.AND(new Filter[]{stringColumn.NOT_STARTS_WITH("fake_conversation"), stringColumn3.NEQ("group"), Filter.AND(new Filter[]{column3.NEQ("dismissed"), column3.NEQ("removed"), column3.NEQ("invisible"), column3.NEQ("deleted")}), booleanColumn.T()}), new DoubleOrder(((OrderedColumn) column2).DESC, ((OrderedColumn) doubleColumn).DESC), 0, 200);
        this.f15214G = p7r.c(new v9j() { // from class: l.vk6
            public final Object call() {
                return this.f24350a.m17559E0();
            }
        });
        this.f15215H = new orh0.a(this, "conversations_exposure", Filter.AND(new Filter[]{stringColumn.NOT_STARTS_WITH("fake_conversation"), column2.EQ(50), Filter.AND(new Filter[]{column3.NEQ("local_fake"), column3.NEQ("dismissed"), column3.NEQ("removed"), column3.NEQ("invisible"), column3.NEQ("deleted")})}), new DoubleOrder(((OrderedColumn) column2).DESC, ((OrderedColumn) doubleColumn).DESC), 0, 200);
        Filter<Conversation> filterOR = Filter.OR(new Filter[]{stringColumn.NOT_STARTS_WITH("fake_conversation"), stringColumn.STARTS_WITH("fake_conversation_greeting"), stringColumn.STARTS_WITH("fake_conversation_anonymous_greeting"), stringColumn.STARTS_WITH("fake_conversation_oof_pick"), stringColumn.STARTS_WITH("fake_conversation_oof_enter"), stringColumn.STARTS_WITH("fake_conversation_profile_featured"), stringColumn.STARTS_WITH("fake_conversation_city_centre_enter"), stringColumn.STARTS_WITH("fake_conversation_fold_conversation"), stringColumn.STARTS_WITH("fake_conversation_weaken_conversation"), stringColumn.STARTS_WITH("fake_conversation_live_activities"), stringColumn.STARTS_WITH("fake_conversation_profile_like_enter"), stringColumn.STARTS_WITH("fake_conversation_blindbox_enter"), stringColumn.STARTS_WITH("fake_conversation_local_summary_marriage_conversation"), stringColumn.STARTS_WITH("fake_conversation_surprise_gift_box"), stringColumn.STARTS_WITH("fake_conversation_local_limited_trial_see_fold"), stringColumn.STARTS_WITH("fake_conversation_local_instant_chat_conversation")});
        this.f15216I = filterOR;
        this.f15217J = Filter.AND(new Filter[]{filterOR, stringColumn.NOT_STARTS_WITH("fake_conversation_profile_featured"), stringColumn.NOT_STARTS_WITH("fake_conversation_greeting"), stringColumn.NOT_STARTS_WITH("fake_conversation_anonymous_greeting")});
        this.f15218K = p7r.c(new v9j() { // from class: l.wk6
            public final Object call() {
                return this.f25189a.m17560F0();
            }
        });
        this.f15219L = p7r.c(new v9j() { // from class: l.xk6
            public final Object call() {
                return this.f27559a.m17561G0();
            }
        });
        this.f15220M = p7r.c(new v9j() { // from class: l.yk6
            public final Object call() {
                return this.f28255a.m17562H0();
            }
        });
        this.f15221N = p7r.c(new v9j() { // from class: l.zk6
            public final Object call() {
                return this.f28785a.m17563I0();
            }
        });
        this.f15222O = p7r.c(new v9j() { // from class: l.gl6
            public final Object call() {
                return this.f13354a.m17564J0();
            }
        });
        this.f15223P = p7r.c(new v9j() { // from class: l.hl6
            public final Object call() {
                return this.f13931a.m17565K0();
            }
        });
        this.f15224Q = p7r.c(new v9j() { // from class: l.il6
            public final Object call() {
                return this.f14540a.m17566L0();
            }
        });
        this.f15225R = p7r.c(new v9j() { // from class: l.ik6
            public final Object call() {
                return this.f14528a.m17567M0();
            }
        });
        this.f15226S = p7r.c(new v9j() { // from class: l.jk6
            public final Object call() {
                return this.f15186a.m17568N0();
            }
        });
        this.f15227T = p7r.c(new v9j() { // from class: l.kk6
            public final Object call() {
                return this.f15860a.m17569O0();
            }
        });
        Column column4 = Conversation.READ;
        this.f15228U = new orh0.a(this, "user_last_conv_without_group", Filter.AND(new Filter[]{column4.T(), stringColumn.NOT_STARTS_WITH("fake_conversation"), stringColumn3.NEQ("group"), stringColumn2.NOT_STARTS_WITH("-"), Conversation.LOCALEVERHASMESSAGE.T(), Conversation.USERMESSAGECOUNT.REQ(0), Filter.AND(new Filter[]{column3.NEQ("dismissed"), column3.NEQ("removed"), column3.NEQ("invisible"), column3.NEQ("deleted")})}), ((OrderedColumn) doubleColumn).DESC, 0, 1);
        this.f15229V = Filter.OR(new Filter[]{Filter.AND(new Filter[]{stringColumn.STARTS_WITH("-"), stringColumn.NEQ("-11000"), stringColumn.NEQ("-10023")}), stringColumn.STARTS_WITH("fake_conversation_oof_pick"), stringColumn.STARTS_WITH("fake_conversation_oof_enter"), stringColumn.STARTS_WITH("fake_conversation_profile_featured"), stringColumn.STARTS_WITH("fake_conversation_blindbox_enter"), stringColumn.STARTS_WITH("fake_conversation_profile_like_enter"), stringColumn.STARTS_WITH("fake_conversation_surprise_gift_box")});
        this.f15230W = Filter.AND(new Filter[]{Filter.OR(new Filter[]{stringColumn.NOT_STARTS_WITH("-"), stringColumn.STARTS_WITH("-11000"), stringColumn.STARTS_WITH("-10023")}), Filter.OR(new Filter[]{stringColumn.NOT_STARTS_WITH("fake_conversation"), stringColumn.STARTS_WITH("fake_conversation_greeting"), stringColumn.STARTS_WITH("fake_conversation_anonymous_greeting"), stringColumn.STARTS_WITH("fake_conversation_city_centre_enter"), stringColumn.STARTS_WITH("fake_conversation_fold_conversation"), stringColumn.STARTS_WITH("fake_conversation_weaken_conversation"), stringColumn.STARTS_WITH("fake_conversation_live_activities"), stringColumn.STARTS_WITH("fake_conversation_local_summary_marriage_conversation"), stringColumn.STARTS_WITH("fake_conversation_local_team_group_conversation"), stringColumn.STARTS_WITH("fake_conversation_local_limited_trial_see_fold"), stringColumn.STARTS_WITH("fake_conversation_local_instant_chat_conversation")})});
        this.f15231X = p7r.c(new v9j() { // from class: l.lk6
            public final Object call() {
                return this.f16479a.m17570P0();
            }
        });
        this.f15232Y = p7r.c(new v9j() { // from class: l.mk6
            public final Object call() {
                return this.f17008a.m17571Q0();
            }
        });
        ((orh0) this).c = new j760(qib0.f19813k0.f23551d, new xaj0(new w9j() { // from class: l.nk6
            public final Object call(Object obj) {
                return DbObject.ID.IN(vwb.T((List) obj, new w9j() { // from class: l.al6
                    public final Object call(Object obj2) {
                        return ((DbObject) ((Conversation) obj2)).id;
                    }
                }));
            }
        }, new v9j() { // from class: l.ok6
            public final Object call() {
                return jl6.m17540S();
            }
        }, -1));
        ((orh0) this).e = new HashMap(2);
        ((orh0) this).e.put("counter_trigger", new zrh0(vwb.f0(new Column[]{column4, Conversation.READUNTIL, column, Conversation.ISFAKE, column3, column2}), new d30() { // from class: l.qk6
            public final void call() {
                CoreModule.f1534c.f3631f0.m4868dq(qib0.f19784H.guessedCurrentServerTime());
            }
        }));
    }

    /* JADX INFO: renamed from: Q */
    public static /* synthetic */ Filter m17538Q() {
        StringColumn stringColumn = Conversation.CONVTYPE;
        Filter filterNEQ = stringColumn.NEQ("quickchat");
        TEnumColumn tEnumColumn = Conversation.STATUS;
        return Filter.OR(new Filter[]{Filter.AND(new Filter[]{filterNEQ, tEnumColumn.NEQ("peeking")}), Filter.AND(new Filter[]{Conversation.CREATEDTIME.LEQ(ura.m25555e().m25559d().m5773go()), Filter.OR(new Filter[]{stringColumn.EQ("quickchat"), tEnumColumn.EQ("peeking")})})});
    }

    /* JADX INFO: renamed from: S */
    public static /* synthetic */ Order m17540S() {
        return null;
    }

    /* JADX INFO: renamed from: A0 */
    public orh0<Conversation>.a m17555A0() {
        Filter filterAND = ura.m25555e().m25559d().m5682R8() ? Filter.AND(new Filter[]{Conversation.CONVTYPE.NEQ("lovebuzz"), Conversation.LOCALEVERHASMESSAGE.F()}) : Conversation.LOCALEVERHASMESSAGE.F();
        Filter filterNOT_STARTS_WITH = Conversation.ID.NOT_STARTS_WITH("fake_conversation");
        Filter filter = this.f15233m;
        TEnumColumn tEnumColumn = Conversation.STATUS;
        return new orh0.a(this, "intlMatchConversationOrder", Filter.AND(new Filter[]{filterNOT_STARTS_WITH, filter, Filter.AND(new Filter[]{tEnumColumn.NEQ("dismissed"), tEnumColumn.NEQ("local_fake"), tEnumColumn.NEQ("removed"), tEnumColumn.NEQ("invisible"), tEnumColumn.NEQ("deleted"), filterAND}), m17608s0()}), new DoubleOrder(((OrderedColumn) Conversation.LEVEL).DESC, ((OrderedColumn) Conversation.LATESTTIME).DESC), 0, 200);
    }

    /* JADX INFO: renamed from: B0 */
    public orh0<Conversation>.a m17556B0() {
        Filter filterNOT_STARTS_WITH = Conversation.ID.NOT_STARTS_WITH("fake_conversation");
        TEnumColumn tEnumColumn = Conversation.STATUS;
        return new orh0.a(this, "intlWhisperConversationOrder", Filter.AND(new Filter[]{filterNOT_STARTS_WITH, Filter.AND(new Filter[]{tEnumColumn.NEQ("dismissed"), tEnumColumn.NEQ("local_fake"), tEnumColumn.NEQ("removed"), tEnumColumn.NEQ("invisible"), tEnumColumn.NEQ("deleted")}), Conversation.CONVTYPE.EQ("swiper")}), ((OrderedColumn) Conversation.LATESTTIME).DESC, 0, 200);
    }

    /* JADX INFO: renamed from: C0 */
    public p7r<orh0<Conversation>.a> m17557C0() {
        return p7r.c(new v9j() { // from class: l.el6
            public final Object call() {
                return this.f11228a.m17558D0();
            }
        });
    }

    /* JADX INFO: renamed from: D0 */
    public final /* synthetic */ orh0.a m17558D0() {
        return new orh0.a(this, "invalid_conversation_list", Filter.AND(new Filter[]{Conversation.OTHERSTATUS.EQ("invalid"), Conversation.STATUS.NEQ("dismissed"), Conversation.LOCALEVERHASMESSAGE.T()}), new DoubleOrder(((OrderedColumn) Conversation.LEVEL).DESC, ((OrderedColumn) Conversation.UPDATEDTIME).DESC), 0, 200);
    }

    /* JADX INFO: renamed from: E0 */
    public final /* synthetic */ orh0.a m17559E0() {
        StringColumn stringColumn = Conversation.ID;
        return new orh0.a(this, "newest_conversation", Filter.AND(new Filter[]{stringColumn.NOT_STARTS_WITH("fake_conversation"), stringColumn.NOT_STARTS_WITH("-"), Conversation.CONVTYPE.EQ(CameraSticker.CATEGORY_DEFAULT_FILTER)}), ((OrderedColumn) Conversation.CREATEDTIME).DESC, 1, 1);
    }

    /* JADX INFO: renamed from: F0 */
    public final /* synthetic */ orh0.a m17560F0() {
        return new orh0.a(this, "conversations_new_without_fake", m17607r0(), new DoubleOrder(((OrderedColumn) Conversation.LEVEL).DESC, ((OrderedColumn) Conversation.LATESTTIME).DESC), 0, 200);
    }

    /* JADX INFO: renamed from: G0 */
    public final /* synthetic */ orh0.a m17561G0() {
        IntegerColumn integerColumn = Conversation.LEVEL;
        Filter filterEQ = integerColumn.EQ(0);
        StringColumn stringColumn = Conversation.ID;
        return new orh0.a(this, "conversations_weaken_fold", Filter.AND(new Filter[]{filterEQ, stringColumn.NOT_STARTS_WITH("-"), stringColumn.NOT_STARTS_WITH("fake_conversation"), stringColumn.NOT_STARTS_WITH("conversation_feed_state"), stringColumn.NOT_STARTS_WITH("conversation"), m17607r0()}), new DoubleOrder(((OrderedColumn) integerColumn).DESC, ((OrderedColumn) Conversation.LATESTTIME).DESC), 0, 50);
    }

    /* JADX INFO: renamed from: H0 */
    public final /* synthetic */ orh0.a m17562H0() {
        return new orh0.a(this, "conversations_new_marriage", m17609t0(), ((OrderedColumn) Conversation.LATESTTIME).DESC, 0, 200);
    }

    /* JADX INFO: renamed from: I0 */
    public final /* synthetic */ orh0.a m17563I0() {
        return new orh0.a(this, "conversations_new_marriage_unread", m17610u0(), ((OrderedColumn) Conversation.LATESTTIME).DESC, 0, 200);
    }

    /* JADX INFO: renamed from: J0 */
    public final /* synthetic */ orh0.a m17564J0() {
        return new orh0.a(this, "conversations_love_buzz", Filter.AND(new Filter[]{Conversation.CONVTYPE.EQ("lovebuzz"), Conversation.STATUS.NEQ("deleted")}), ((OrderedColumn) Conversation.LATESTTIME).DESC, 0, 200);
    }

    /* JADX INFO: renamed from: K0 */
    public final /* synthetic */ orh0.a m17565K0() {
        Filter<Conversation> filterM17607r0 = m17607r0();
        DoubleColumn doubleColumn = Conversation.LATESTTIME;
        Filter filterREQ = doubleColumn.REQ(Double.valueOf(CoreModule.f1534c.f3631f0.m4906hg()));
        Filter filterEQ = Conversation.ID.EQ("fake_conversation_fold_conversation");
        IntegerColumn integerColumn = Conversation.LEVEL;
        return new orh0.a(this, "conversations_new_without_fake_container_fold", Filter.AND(new Filter[]{filterM17607r0, Filter.OR(new Filter[]{filterREQ, filterEQ, integerColumn.REQ(1)})}), new DoubleOrder(((OrderedColumn) integerColumn).DESC, ((OrderedColumn) doubleColumn).DESC), 0, 200);
    }

    /* JADX INFO: renamed from: L0 */
    public final /* synthetic */ orh0.a m17566L0() {
        Filter<Conversation> filterM17607r0 = m17607r0();
        StringColumn stringColumn = Conversation.ID;
        return new orh0.a(this, "conversation_without_fake_without_message", Filter.AND(new Filter[]{filterM17607r0, stringColumn.NEQ("fake_conversation_fold_conversation"), stringColumn.NEQ("fake_conversation_weaken_conversation"), Conversation.MM.LEQ(0), Conversation.LOCALHASMESSAGE.F(), Conversation.UNREADMESSAGES.LEQ(0), Conversation.USERMESSAGECOUNT.LEQ(0), Conversation.READUNTIL.EQ("")}), new DoubleOrder(((OrderedColumn) Conversation.LEVEL).DESC, ((OrderedColumn) Conversation.LATESTTIME).DESC), 0, 50);
    }

    /* JADX INFO: renamed from: M0 */
    public final /* synthetic */ orh0.a m17567M0() {
        Filter<Conversation> filterM17607r0 = m17607r0();
        StringColumn stringColumn = Conversation.ID;
        Filter filterNEQ = stringColumn.NEQ("fake_conversation_fold_conversation");
        Filter filterNEQ2 = stringColumn.NEQ("fake_conversation_weaken_conversation");
        DoubleColumn doubleColumn = Conversation.LATESTTIME;
        Filter filterLEQ = doubleColumn.LEQ(Double.valueOf(CoreModule.f1534c.f3631f0.m4906hg()));
        IntegerColumn integerColumn = Conversation.LEVEL;
        return new orh0.a(this, "conversations_new_without_fake_fold", Filter.AND(new Filter[]{filterM17607r0, filterNEQ, filterNEQ2, filterLEQ, integerColumn.EQ(0)}), new DoubleOrder(((OrderedColumn) integerColumn).DESC, ((OrderedColumn) doubleColumn).DESC), 0, 200);
    }

    /* JADX INFO: renamed from: N0 */
    public final /* synthetic */ orh0.a m17568N0() {
        Filter<Conversation> filterM17607r0 = m17607r0();
        StringColumn stringColumn = Conversation.ID;
        Filter filterNEQ = stringColumn.NEQ("fake_conversation_fold_conversation");
        Filter filterNEQ2 = stringColumn.NEQ("fake_conversation_weaken_conversation");
        DoubleColumn doubleColumn = Conversation.LATESTTIME;
        Filter filterLEQ = doubleColumn.LEQ(Double.valueOf(CoreModule.f1534c.f3631f0.m4507Ag()));
        Filter filterNEQ3 = Conversation.UNREADMESSAGES.NEQ(0);
        IntegerColumn integerColumn = Conversation.LEVEL;
        return new orh0.a(this, "conversations_new_without_fake_weaken_unread", Filter.AND(new Filter[]{filterM17607r0, filterNEQ, filterNEQ2, filterLEQ, filterNEQ3, integerColumn.EQ(0)}), new DoubleOrder(((OrderedColumn) integerColumn).DESC, ((OrderedColumn) doubleColumn).DESC), 0, 20);
    }

    /* JADX INFO: renamed from: O0 */
    public final /* synthetic */ orh0.a m17569O0() {
        Filter<Conversation> filterM17607r0 = m17607r0();
        StringColumn stringColumn = Conversation.ID;
        Filter filterNEQ = stringColumn.NEQ("fake_conversation_fold_conversation");
        Filter filterNEQ2 = stringColumn.NEQ("fake_conversation_weaken_conversation");
        DoubleColumn doubleColumn = Conversation.LATESTTIME;
        Filter filterLEQ = doubleColumn.LEQ(Double.valueOf(Math.max(CoreModule.f1534c.f3631f0.m4507Ag(), CoreModule.f1534c.f3631f0.m4906hg())));
        Filter filterREQ = doubleColumn.REQ(Double.valueOf(Math.min(CoreModule.f1534c.f3631f0.m4507Ag(), CoreModule.f1534c.f3631f0.m4906hg())));
        IntegerColumn integerColumn = Conversation.LEVEL;
        return new orh0.a(this, "conversations_between_fold_and_weaken", Filter.AND(new Filter[]{filterM17607r0, filterNEQ, filterNEQ2, filterLEQ, filterREQ, integerColumn.EQ(0)}), new DoubleOrder(((OrderedColumn) integerColumn).DESC, ((OrderedColumn) doubleColumn).DESC), 0, 20);
    }

    /* JADX INFO: renamed from: P0 */
    public final /* synthetic */ orh0.a m17570P0() {
        Filter filterSTARTS_WITH = Conversation.ID.STARTS_WITH("-");
        TEnumColumn tEnumColumn = Conversation.STATUS;
        return new orh0.a(this, "conversations_team", Filter.AND(new Filter[]{filterSTARTS_WITH, tEnumColumn.NEQ("local_fake"), tEnumColumn.NEQ("dismissed"), tEnumColumn.NEQ("removed"), tEnumColumn.NEQ("invisible"), tEnumColumn.NEQ("deleted"), Conversation.OTHERSTATUS.NEQ("invalid")}), ((OrderedColumn) Conversation.LATESTTIME).DESC, 0, 200);
    }

    /* JADX INFO: renamed from: Q0 */
    public final /* synthetic */ orh0.a m17571Q0() {
        Filter<Conversation> filter = this.f15229V;
        TEnumColumn tEnumColumn = Conversation.STATUS;
        return new orh0.a(this, "conversations_team", Filter.AND(new Filter[]{filter, tEnumColumn.NEQ("local_fake"), tEnumColumn.NEQ("dismissed"), tEnumColumn.NEQ("removed"), tEnumColumn.NEQ("invisible"), tEnumColumn.NEQ("deleted"), Conversation.OTHERSTATUS.NEQ("invalid")}), ((OrderedColumn) Conversation.LATESTTIME).DESC, 0, 200);
    }

    /* JADX INFO: renamed from: R0 */
    public final /* synthetic */ orh0.a m17572R0() {
        Filter filterOR = Filter.TRUE;
        if (ura.m25555e().m25559d().m5745c()) {
            filterOR = Filter.OR(new Filter[]{Conversation.CONVTYPE.NEQ("quickchat"), Conversation.READ.T(), Conversation.READUNTIL.NEQ("")});
        }
        TEnumColumn tEnumColumn = Conversation.LOCALNOTIFICATIONSTATUS;
        Filter filterOR2 = Filter.OR(new Filter[]{tEnumColumn.EQ("ongoing"), tEnumColumn.EQ("pending")});
        TEnumColumn tEnumColumn2 = Conversation.STATUS;
        return new orh0.a(this, "sysnotif", Filter.AND(new Filter[]{filterOR2, tEnumColumn2.NEQ("dismissed"), tEnumColumn2.NEQ("local_fake"), tEnumColumn2.NEQ("removed"), tEnumColumn2.NEQ("invisible"), tEnumColumn2.NEQ("deleted"), filterOR}), new DoubleOrder(((OrderedColumn) Conversation.LEVEL).DESC, ((OrderedColumn) Conversation.LATESTTIME).DESC), 50, 50);
    }

    /* JADX INFO: renamed from: S0 */
    public final /* synthetic */ orh0.a m17573S0() {
        return new orh0.a(this, "new_matches_without_fake_last_time", Filter.AND(new Filter[]{Filter.AND(m17581a1().toFilters())}), ((OrderedColumn) Conversation.LATESTTIME).DESC, 0, 200);
    }

    /* JADX INFO: renamed from: T0 */
    public final /* synthetic */ orh0.a m17574T0() {
        return new orh0.a(this, "new_matches_without_fake_create_time", Filter.AND(new Filter[]{Filter.AND(m17581a1().toFilters())}), ((OrderedColumn) Conversation.CREATEDTIME).DESC, 0, 200);
    }

    /* JADX INFO: renamed from: U0 */
    public final /* synthetic */ orh0.a m17575U0() {
        FilterList<Conversation> filterListM17581a1 = m17581a1();
        filterListM17581a1.add(Conversation.ADDITIONAL_RESWIPE.NOT_NULL());
        filterListM17581a1.add(Conversation.STATUS.NEQ("blocked"));
        return new orh0.a(this, "chat_re_swiped", Filter.AND(filterListM17581a1.toFilters()), ((OrderedColumn) Conversation.UPDATEDTIME).DESC, 0, 200);
    }

    /* JADX INFO: renamed from: V0 */
    public orh0<Conversation>.a m17576V0(String str) {
        return new orh0.a(this, "match", Conversation.OTHERUSER.EQ(str), ((OrderedColumn) Conversation.LATESTTIME).DESC, 0, 1);
    }

    /* JADX INFO: renamed from: W0 */
    public orh0<Conversation>.a m17577W0(List<String> list) {
        if (list == null) {
            list = new ArrayList<>();
        }
        list.add("");
        Filter filterNOT_STARTS_WITH = Conversation.ID.NOT_STARTS_WITH("fake_conversation");
        StringColumn stringColumn = Conversation.OTHERUSER;
        Filter filterNOT_IN = stringColumn.NOT_IN(list);
        StringColumn stringColumn2 = Conversation.CONVTYPE;
        Filter filterNEQ = stringColumn2.NEQ("group");
        Filter filterNEQ2 = stringColumn2.NEQ("anonymous");
        TEnumColumn tEnumColumn = Conversation.STATUS;
        return new orh0.a(this, "matches_exclude_team_account_and_locked_quickchat", Filter.AND(new Filter[]{filterNOT_STARTS_WITH, filterNOT_IN, filterNEQ, filterNEQ2, Filter.AND(new Filter[]{tEnumColumn.NEQ("blocked"), tEnumColumn.NEQ("dismissed"), tEnumColumn.NEQ("local_fake"), tEnumColumn.NEQ("removed"), tEnumColumn.NEQ("invisible"), tEnumColumn.NEQ("deleted")}), stringColumn.NOT_STARTS_WITH("-"), Filter.OR(new Filter[]{stringColumn2.NEQ("quickchat"), Conversation.MM.REQ(20)})}), new DoubleOrder(((OrderedColumn) Conversation.LEVEL).DESC, ((OrderedColumn) Conversation.LATESTTIME).DESC), 0, 200);
    }

    /* JADX INFO: renamed from: X0 */
    public orh0<Conversation>.a m17578X0(double d) {
        return new orh0.a(this, "matchesToday", Filter.AND(new Filter[]{Conversation.CREATEDTIME.REQ(Double.valueOf(d)), Conversation.ID.NOT_STARTS_WITH("fake_conversation")}), ((OrderedColumn) Conversation.LATESTTIME).DESC, 0, 200);
    }

    /* JADX INFO: renamed from: Y0 */
    public orh0<Conversation>.a m17579Y0() {
        Filter filterNOT_STARTS_WITH = Conversation.ID.NOT_STARTS_WITH("fake_conversation");
        TEnumColumn tEnumColumn = Conversation.STATUS;
        return new orh0.a(this, "matchesWithDoubleOrder", Filter.AND(new Filter[]{filterNOT_STARTS_WITH, Filter.AND(new Filter[]{tEnumColumn.NEQ("dismissed"), tEnumColumn.NEQ("local_fake"), tEnumColumn.NEQ("removed"), tEnumColumn.NEQ("invisible"), tEnumColumn.NEQ("deleted")}), m17608s0()}), new DoubleOrder(((OrderedColumn) Conversation.LEVEL).DESC, ((OrderedColumn) Conversation.LATESTTIME).DESC), 0, 200);
    }

    /* JADX INFO: renamed from: Z0 */
    public orh0<Conversation>.a m17580Z0() {
        Filter filterNOT_STARTS_WITH = Conversation.ID.NOT_STARTS_WITH("fake_conversation");
        Filter filter = this.f15233m;
        TEnumColumn tEnumColumn = Conversation.STATUS;
        return new orh0.a(this, "matchesWithDoubleOrder", Filter.AND(new Filter[]{filterNOT_STARTS_WITH, filter, Filter.AND(new Filter[]{tEnumColumn.NEQ("dismissed"), tEnumColumn.NEQ("local_fake"), tEnumColumn.NEQ("removed"), tEnumColumn.NEQ("invisible"), tEnumColumn.NEQ("deleted")}), m17608s0()}), new DoubleOrder(((OrderedColumn) Conversation.LEVEL).DESC, ((OrderedColumn) Conversation.LATESTTIME).DESC), 0, 200);
    }

    /* JADX INFO: renamed from: a1 */
    public FilterList<Conversation> m17581a1() {
        return ura.m25555e().m25559d().m5772gn() ? m17583c1() : m17582b1();
    }

    /* JADX INFO: renamed from: b1 */
    public FilterList<Conversation> m17582b1() {
        Filter filterNEQ = Filter.TRUE;
        if (ura.m25555e().m25559d().m5745c()) {
            filterNEQ = Conversation.CONVTYPE.NEQ("quickchat");
        }
        Filter filter = filterNEQ;
        Filter filterNOT_STARTS_WITH = Conversation.ID.NOT_STARTS_WITH("fake_conversation");
        Filter filterNEQ2 = Conversation.OTHERSTATUS.NEQ("invalid");
        TEnumColumn tEnumColumn = Conversation.STATUS;
        return FilterList.list(new Filter[]{filterNOT_STARTS_WITH, filterNEQ2, tEnumColumn.NEQ("dismissed"), tEnumColumn.NEQ("removed"), tEnumColumn.NEQ("invisible"), tEnumColumn.NEQ("deleted"), tEnumColumn.NEQ("local_fake"), (Filter) this.f15241u.b(), Conversation.LOCALEVERHASMESSAGE.F(), filter});
    }

    /* JADX INFO: renamed from: c1 */
    public FilterList<Conversation> m17583c1() {
        Filter filterNEQ = Filter.TRUE;
        if (ura.m25555e().m25559d().m5745c()) {
            filterNEQ = Conversation.CONVTYPE.NEQ("quickchat");
        }
        Filter filter = filterNEQ;
        Filter filterNOT_STARTS_WITH = Conversation.ID.NOT_STARTS_WITH("fake_conversation");
        Filter filterNEQ2 = Conversation.OTHERSTATUS.NEQ("invalid");
        TEnumColumn tEnumColumn = Conversation.STATUS;
        return FilterList.list(new Filter[]{filterNOT_STARTS_WITH, filterNEQ2, tEnumColumn.NEQ("dismissed"), tEnumColumn.NEQ("removed"), tEnumColumn.NEQ("invisible"), tEnumColumn.NEQ("deleted"), tEnumColumn.NEQ("blocked"), (Filter) this.f15241u.b(), Conversation.LOCALEVERHASMESSAGE.F(), filter});
    }

    /* JADX INFO: renamed from: d1 */
    public Conversation m17584d1(String str) {
        List listQuery = CoreModule.f1542k.f11205m.query(Conversation.OTHERUSER.EQ(str), (Order) null, 1);
        if (listQuery.isEmpty()) {
            return null;
        }
        return (Conversation) listQuery.get(0);
    }

    /* JADX INFO: renamed from: e1 */
    public List<String> m17585e1() {
        ArrayList arrayList = new ArrayList();
        TEnumColumn tEnumColumn = Conversation.STATUS;
        SqlSegment sqlSegmentEmit = Filter.OR(new Filter[]{tEnumColumn.EQ(CameraSticker.CATEGORY_DEFAULT_FILTER), tEnumColumn.EQ("blocked")}).emit();
        Cursor cursorQuery = null;
        try {
            cursorQuery = o().query(((orh0) this).d, new String[]{Conversation.ID.toString()}, sqlSegmentEmit.part, sqlSegmentEmit.args, (String) null, (String) null, ((OrderedColumn) Conversation.UPDATEDTIME).DESC.emit());
            while (cursorQuery.moveToNext()) {
                arrayList.add(cursorQuery.getString(0));
            }
            if (NullChecker.a(cursorQuery)) {
                cursorQuery.close();
            }
            return arrayList;
        } catch (Throwable th) {
            if (!NullChecker.a(cursorQuery)) {
                throw th;
            }
            cursorQuery.close();
            throw th;
        }
    }

    /* JADX INFO: renamed from: f1 */
    public orh0<Conversation>.a m17586f1() {
        Filter filterF = Conversation.READ.F();
        StringColumn stringColumn = Conversation.ID;
        Filter filterNOT_STARTS_WITH = stringColumn.NOT_STARTS_WITH("fake_conversation");
        Filter filterNEQ = stringColumn.NEQ("-11000");
        Filter filterNEQ2 = stringColumn.NEQ("-11001");
        TEnumColumn tEnumColumn = Conversation.STATUS;
        Filter filterNEQ3 = tEnumColumn.NEQ("dismissed");
        Filter filterNEQ4 = tEnumColumn.NEQ("blocked");
        Filter filterNEQ5 = tEnumColumn.NEQ("removed");
        Filter filterNEQ6 = tEnumColumn.NEQ("invisible");
        Filter filterNEQ7 = tEnumColumn.NEQ("deleted");
        Filter filterF2 = Conversation.LOCALEVERHASMESSAGE.F();
        DoubleColumn doubleColumn = Conversation.CREATEDTIME;
        Filter filterREQ = doubleColumn.REQ((Double) CoreModule.f1534c.f3631f0.f3945m1.get());
        Filter filterNEQ8 = Conversation.OTHERSTATUS.NEQ("invalid");
        StringColumn stringColumn2 = Conversation.CONVTYPE;
        return new orh0.a(this, "queryEnterUnreadNewMatchTimer", Filter.AND(new Filter[]{filterF, filterNOT_STARTS_WITH, filterNEQ, filterNEQ2, filterNEQ3, filterNEQ4, filterNEQ5, filterNEQ6, filterNEQ7, filterF2, filterREQ, filterNEQ8, Filter.OR(new Filter[]{stringColumn2.EQ(""), stringColumn2.EQ(CameraSticker.CATEGORY_DEFAULT_FILTER)})}), ((OrderedColumn) doubleColumn).DESC, 0, 2);
    }

    /* JADX INFO: renamed from: g1 */
    public j760<List<Conversation>, List<User>> m17587g1(String str) {
        Filter filterOR;
        Filter filterAND;
        List listQuery;
        List<User> listM17598m0 = m17598m0(str);
        List<String> listM17612w0 = m17612w0(listM17598m0);
        if (ura.m25555e().m25559d().m5613E()) {
            yt4 yt4Var = CoreModule.f1542k.f11206n;
            StringColumn stringColumn = ChatGroup.NAME;
            List<ChatGroup> listQuery2 = yt4Var.query(stringColumn.CONTAINS(str), ((OrderedColumn) stringColumn).DESC, 200);
            if (!vwb.J(listQuery2)) {
                for (ChatGroup chatGroup : listQuery2) {
                    if (!TextUtils.isEmpty(chatGroup.localConId)) {
                        listM17612w0.add(chatGroup.localConId);
                    }
                }
            }
        }
        List listQuery3 = CoreModule.f1542k.f11205m.query(Filter.AND(new Filter[]{Conversation.ID.NOT_STARTS_WITH("fake_conversation"), Conversation.LOCALEXTRAINFO.CONTAINS(str)}), ((OrderedColumn) Conversation.LATESTTIME).DESC, 200);
        if (!vwb.J(listQuery3)) {
            Iterator it = listQuery3.iterator();
            while (it.hasNext()) {
                listM17612w0.add(((DbObject) ((Conversation) it.next())).id);
            }
        }
        Filter filter = ura.m25555e().m25559d().m5739b() ? Filter.TRUE : this.f15233m;
        if (ura.m25555e().m25559d().m5682R8()) {
            BooleanColumn booleanColumn = Conversation.LOCALEVERHASMESSAGE;
            filterOR = Filter.OR(new Filter[]{booleanColumn.T(), Filter.AND(new Filter[]{Conversation.CONVTYPE.NEQ("lovebuzz"), booleanColumn.F()})});
        } else {
            filterOR = Filter.TRUE;
        }
        Filter filter2 = filterOR;
        Filter filter3 = Filter.TRUE;
        if (CoreModule.f1534c.f3628e0.m21483na().isSVIP()) {
            Filter filterIN = Conversation.ID.IN(listM17612w0);
            TEnumColumn tEnumColumn = Conversation.STATUS;
            listQuery = query(Filter.AND(new Filter[]{filterIN, filter, filter2, filter3, filter3, tEnumColumn.NEQ("local_fake"), tEnumColumn.NEQ("deleted")}), ((OrderedColumn) Conversation.LATESTTIME).DESC, 200);
        } else {
            if (xp5.m27591l()) {
                filterAND = filter3;
            } else {
                StringColumn stringColumn2 = Conversation.CONVTYPE;
                filterAND = Filter.AND(new Filter[]{stringColumn2.NEQ("compliment"), stringColumn2.NEQ("swiper")});
            }
            Filter filterIN2 = Conversation.ID.IN(listM17612w0);
            Filter filterNEQ = Conversation.CONVTYPE.NEQ("fake_one_side");
            TEnumColumn tEnumColumn2 = Conversation.STATUS;
            listQuery = query(Filter.AND(new Filter[]{filterIN2, filter, filter2, filter3, filter3, filterAND, filterNEQ, tEnumColumn2.NEQ("local_fake"), tEnumColumn2.NEQ("deleted")}), ((OrderedColumn) Conversation.LATESTTIME).DESC, 200);
        }
        return vwb.Y(listQuery, listM17598m0);
    }

    /* JADX INFO: renamed from: h0 */
    public orh0<Conversation>.a m17588h0(double d) {
        String str = "conversation_filter_req_current_time" + d;
        Filter<Conversation> filterM17607r0 = m17607r0();
        StringColumn stringColumn = Conversation.CONVTYPE;
        Filter filterOR = Filter.OR(new Filter[]{filterM17607r0, stringColumn.EQ("marriage")});
        Filter filterNEQ = stringColumn.NEQ("group");
        StringColumn stringColumn2 = Conversation.ID;
        Filter filterNOT_STARTS_WITH = stringColumn2.NOT_STARTS_WITH("fake_conversation_fold_conversation");
        Filter filterNOT_STARTS_WITH2 = stringColumn2.NOT_STARTS_WITH("fake_conversation_weaken_conversation");
        DoubleColumn doubleColumn = Conversation.LATESTTIME;
        return new orh0.a(this, str, Filter.AND(new Filter[]{filterOR, filterNEQ, filterNOT_STARTS_WITH, filterNOT_STARTS_WITH2, doubleColumn.REQ(Double.valueOf(d))}), ((OrderedColumn) doubleColumn).DESC, 0, 20);
    }

    /* JADX INFO: renamed from: h1 */
    public orh0<Conversation>.a m17589h1() {
        Filter filterEQ = Conversation.LOCALPLACEBAN.EQ("both");
        TEnumColumn tEnumColumn = Conversation.STATUS;
        return new orh0.a(this, "noMatch_seeletter_byother", Filter.AND(new Filter[]{filterEQ, tEnumColumn.NEQ("local_fake"), tEnumColumn.NEQ("deleted"), tEnumColumn.NEQ("removed"), tEnumColumn.NEQ("invisible"), tEnumColumn.NEQ("dismissed")}), ((OrderedColumn) Conversation.LATESTTIME).DESC, 0, 200);
    }

    /* JADX INFO: renamed from: i0 */
    public int m17590i0() {
        return count(Conversation.ID.NOT_STARTS_WITH("fake_conversation"), -1);
    }

    /* JADX INFO: renamed from: i1 */
    public Filter<Conversation> m17591i1() {
        return ura.m25555e().m25559d().m5745c() ? Filter.OR(new Filter[]{Conversation.CONVTYPE.NEQ("quickchat"), Conversation.READ.T(), Conversation.READUNTIL.NEQ("")}) : Filter.TRUE;
    }

    /* JADX INFO: renamed from: j0 */
    public orh0<Conversation>.a m17592j0() {
        String str = "conversations_active_time_between_one_and_seven_day" + mqi0.o();
        Filter<Conversation> filterM17607r0 = m17607r0();
        Filter<Conversation> filter = this.f15230W;
        Filter filterT = Conversation.LOCALHASMESSAGE.T();
        StringColumn stringColumn = Conversation.ID;
        Filter filterNEQ = stringColumn.NEQ("fake_conversation_fold_conversation");
        Filter filterNEQ2 = stringColumn.NEQ("fake_conversation_weaken_conversation");
        Filter filterEQ = Conversation.CONVTYPE.EQ(CameraSticker.CATEGORY_DEFAULT_FILTER);
        TEnumColumn tEnumColumn = Conversation.STATUS;
        Filter filterNEQ3 = tEnumColumn.NEQ("dismissed");
        Filter filterNEQ4 = tEnumColumn.NEQ("blocked");
        DoubleColumn doubleColumn = Conversation.LATESTTIME;
        return new orh0.a(this, str, Filter.AND(new Filter[]{filterM17607r0, filter, filterT, filterNEQ, filterNEQ2, filterEQ, filterNEQ3, filterNEQ4, doubleColumn.LEQ(Double.valueOf(m17611v0(1))), doubleColumn.REQ(Double.valueOf(m17611v0(7)))}), new DoubleOrder(((OrderedColumn) Conversation.LEVEL).DESC, ((OrderedColumn) doubleColumn).DESC), 0, 200);
    }

    /* JADX INFO: renamed from: j1 */
    public List<Conversation> m17593j1() {
        Filter filterNOT_STARTS_WITH = Conversation.OTHERUSER.NOT_STARTS_WITH("-");
        Filter filterEQ = Conversation.CONVTYPE.EQ(CameraSticker.CATEGORY_DEFAULT_FILTER);
        Filter filterEQ2 = Conversation.UNREADMESSAGES.EQ(0);
        Filter filterT = Conversation.READ.T();
        Filter filterREQ = Conversation.USERMESSAGECOUNT.REQ(0);
        TEnumColumn tEnumColumn = Conversation.STATUS;
        return query(Filter.AND(new Filter[]{filterNOT_STARTS_WITH, filterEQ, filterEQ2, filterT, filterREQ, Filter.AND(new Filter[]{tEnumColumn.NEQ("dismissed"), tEnumColumn.NEQ("local_fake"), tEnumColumn.NEQ("removed"), tEnumColumn.NEQ("invisible"), tEnumColumn.NEQ("deleted")})}), new DoubleOrder(((OrderedColumn) Conversation.LEVEL).DESC, ((OrderedColumn) Conversation.LATESTTIME).DESC), 60);
    }

    /* JADX INFO: renamed from: k0 */
    public int m17594k0(List<String> list) {
        if (list == null) {
            list = new ArrayList<>();
        }
        Filter filterNOT_STARTS_WITH = Conversation.ID.NOT_STARTS_WITH("fake_conversation");
        Filter filterNOT_IN = Conversation.OTHERUSER.NOT_IN(list);
        TEnumColumn tEnumColumn = Conversation.STATUS;
        return count(Filter.AND(new Filter[]{filterNOT_STARTS_WITH, filterNOT_IN, Filter.AND(new Filter[]{tEnumColumn.NEQ("dismissed"), tEnumColumn.NEQ("local_fake"), tEnumColumn.NEQ("removed"), tEnumColumn.NEQ("invisible"), tEnumColumn.NEQ("deleted")})}), -1);
    }

    /* JADX INFO: renamed from: k1 */
    public void m17595k1(NotificationStatus notificationStatus, NotificationStatus notificationStatus2) {
        TEnumColumn tEnumColumn = Conversation.LOCALNOTIFICATIONSTATUS;
        update(vwb.f0(new j760[]{vwb.Y(tEnumColumn, notificationStatus2)}), tEnumColumn.EQ(notificationStatus.toString()));
    }

    /* JADX INFO: renamed from: l0 */
    public int m17596l0() {
        Filter filterNOT_STARTS_WITH = Conversation.ID.NOT_STARTS_WITH("fake_conversation");
        Filter filterNEQ = Conversation.CONVTYPE.NEQ("group");
        Filter filterF = Conversation.LOCALEVERHASMESSAGE.F();
        TEnumColumn tEnumColumn = Conversation.STATUS;
        return count(Filter.AND(new Filter[]{filterNOT_STARTS_WITH, filterNEQ, filterF, Filter.AND(new Filter[]{tEnumColumn.NEQ("dismissed"), tEnumColumn.NEQ("local_fake"), tEnumColumn.NEQ("removed"), tEnumColumn.NEQ("invisible"), tEnumColumn.NEQ("deleted")})}), -1);
    }

    /* JADX INFO: renamed from: l1 */
    public orh0<Conversation>.a m17597l1(long j) {
        StringColumn stringColumn = Conversation.ID;
        Filter filterNOT_STARTS_WITH = stringColumn.NOT_STARTS_WITH("-");
        Filter filterNOT_STARTS_WITH2 = stringColumn.NOT_STARTS_WITH("fake_conversation");
        DoubleColumn doubleColumn = Conversation.CREATEDTIME;
        Filter filterREQ = doubleColumn.REQ(Double.valueOf(j));
        TEnumColumn tEnumColumn = Conversation.STATUS;
        return new orh0.a(this, "today_matches_list_by_last_time", Filter.AND(new Filter[]{Filter.AND(FilterList.list(new Filter[]{filterNOT_STARTS_WITH, filterNOT_STARTS_WITH2, filterREQ, Filter.OR(new Filter[]{tEnumColumn.EQ(CameraSticker.CATEGORY_DEFAULT_FILTER), tEnumColumn.EQ("dismissed"), tEnumColumn.EQ("blocked"), tEnumColumn.EQ("removed"), tEnumColumn.EQ("invisible")}), Conversation.CONVTYPE.EQ(CameraSticker.CATEGORY_DEFAULT_FILTER)}).toFilters())}), ((OrderedColumn) doubleColumn).DESC, 0, ura.m25555e().m25559d().m5605Cq());
    }

    /* JADX INFO: renamed from: m0 */
    public final List<User> m17598m0(final String str) {
        if (ura.m25555e().m25559d().m5812l()) {
            return qib0.f19813k0.f23551d.query(Filter.OR(new Filter[]{User.NAME.CONTAINS(str), User.ID.IN(vwb.Q(vwb.n(CoreModule.f1534c.f3628e0.m21386O7().values(), new w9j() { // from class: l.hk6
                public final Object call(Object obj) {
                    return Boolean.valueOf(((GPMemo) obj).memo.toLowerCase().contains(str.toLowerCase()));
                }
            }), new w9j() { // from class: l.sk6
                public final Object call(Object obj) {
                    return ((GPMemo) obj).userId;
                }
            })), User.PUBLICID.CONTAINS(str)}), (Order) null, 200);
        }
        Map<String, GPMemo> mapM21386O7 = CoreModule.f1534c.f3628e0.m21386O7();
        ArrayList arrayListQ = vwb.Q(vwb.n(mapM21386O7.values(), new w9j() { // from class: l.bl6
            public final Object call(Object obj) {
                return Boolean.valueOf(((GPMemo) obj).memo.toLowerCase().contains(str.toLowerCase()));
            }
        }), new w9j() { // from class: l.cl6
            public final Object call(Object obj) {
                return ((GPMemo) obj).userId;
            }
        });
        ArrayList arrayListQ2 = vwb.Q(mapM21386O7.values(), new w9j() { // from class: l.dl6
            public final Object call(Object obj) {
                return ((GPMemo) obj).userId;
            }
        });
        y9k0 y9k0Var = qib0.f19813k0.f23551d;
        Filter filterCONTAINS = User.NAME.CONTAINS(str);
        StringColumn stringColumn = User.ID;
        return y9k0Var.query(Filter.OR(new Filter[]{Filter.AND(new Filter[]{filterCONTAINS, stringColumn.NOT_IN(arrayListQ2)}), stringColumn.IN(arrayListQ)}), (Order) null, 200);
    }

    /* JADX INFO: renamed from: m1 */
    public orh0<Conversation>.a m17599m1(int i) {
        Filter filterAND;
        if (ura.m25555e().m25559d().m5739b()) {
            filterAND = Conversation.ID.NOT_STARTS_WITH("fake_conversation");
        } else {
            StringColumn stringColumn = Conversation.ID;
            filterAND = Filter.AND(new Filter[]{stringColumn.NOT_STARTS_WITH("fake_conversation"), stringColumn.NEQ("-11000"), stringColumn.NEQ("-11001")});
        }
        Filter filterOR = Filter.TRUE;
        if (ura.m25555e().m25559d().m5857sa()) {
            StringColumn stringColumn2 = Conversation.ID;
            filterOR = Filter.OR(new Filter[]{stringColumn2.NOT_STARTS_WITH("-"), stringColumn2.EQ("-11000"), stringColumn2.EQ("-10023")});
        }
        Filter filterM17613x0 = m17613x0();
        TEnumColumn tEnumColumn = Conversation.STATUS;
        return new orh0.a(this, "unreadConversation", Filter.AND(new Filter[]{filterAND, filterM17613x0, Filter.AND(new Filter[]{tEnumColumn.NEQ("dismissed"), tEnumColumn.NEQ("local_fake"), tEnumColumn.NEQ("removed"), tEnumColumn.NEQ("invisible"), tEnumColumn.NEQ("deleted")}), Conversation.UNREADMESSAGES.NEQ(0), filterOR}), new DoubleOrder(((OrderedColumn) Conversation.LEVEL).DESC, ((OrderedColumn) Conversation.LATESTTIME).DESC), 0, i);
    }

    /* JADX INFO: renamed from: n0 */
    public Filter m17600n0() {
        if (!ura.m25555e().m25559d().m5595B()) {
            return Filter.TRUE;
        }
        TEnumColumn tEnumColumn = Conversation.LOCALPLACEBAN;
        return Filter.AND(new Filter[]{tEnumColumn.NEQ("chatList"), tEnumColumn.NEQ("both")});
    }

    /* JADX INFO: renamed from: n1 */
    public List<Conversation> m17601n1() {
        Filter filterNOT_STARTS_WITH = Conversation.OTHERUSER.NOT_STARTS_WITH("-");
        Filter filterEQ = Conversation.CONVTYPE.EQ(CameraSticker.CATEGORY_DEFAULT_FILTER);
        Filter filterREQ = Conversation.UNREADMESSAGES.REQ(1);
        TEnumColumn tEnumColumn = Conversation.STATUS;
        return query(Filter.AND(new Filter[]{filterNOT_STARTS_WITH, filterEQ, filterREQ, Filter.AND(new Filter[]{tEnumColumn.NEQ("dismissed"), tEnumColumn.NEQ("local_fake"), tEnumColumn.NEQ("removed"), tEnumColumn.NEQ("invisible"), tEnumColumn.NEQ("deleted")})}), new DoubleOrder(((OrderedColumn) Conversation.LEVEL).DESC, ((OrderedColumn) Conversation.LATESTTIME).DESC), 60);
    }

    /* JADX INFO: renamed from: o0 */
    public orh0<Conversation>.a m17602o0() {
        Filter filterEQ = Conversation.CONVTYPE.EQ("free_see_match");
        IntegerColumn integerColumn = Conversation.LOCALISLIMITEDTRIALSEE;
        return new orh0.a(this, "queryLimitedTrialSee", Filter.AND(new Filter[]{filterEQ, Filter.OR(new Filter[]{integerColumn.EQ(1), integerColumn.EQ(2)})}), ((OrderedColumn) Conversation.UPDATEDTIME).DESC, 0, 50);
    }

    /* JADX INFO: renamed from: o1 */
    public orh0<Conversation>.a m17603o1(int i) {
        StringColumn stringColumn = Conversation.ID;
        Filter filterNOT_STARTS_WITH = stringColumn.NOT_STARTS_WITH("-");
        Filter filterNOT_STARTS_WITH2 = stringColumn.NOT_STARTS_WITH("fake_conversation");
        Filter filterM17613x0 = m17613x0();
        TEnumColumn tEnumColumn = Conversation.STATUS;
        return new orh0.a(this, "unreadDefaultConversation", Filter.AND(new Filter[]{filterNOT_STARTS_WITH, filterNOT_STARTS_WITH2, filterM17613x0, Filter.AND(new Filter[]{tEnumColumn.NEQ("dismissed"), tEnumColumn.NEQ("local_fake"), tEnumColumn.NEQ("removed"), tEnumColumn.NEQ("invisible"), tEnumColumn.NEQ("deleted")}), Conversation.UNREADMESSAGES.NEQ(0)}), new DoubleOrder(((OrderedColumn) Conversation.LEVEL).DESC, ((OrderedColumn) Conversation.LATESTTIME).DESC), 0, i);
    }

    /* JADX INFO: renamed from: p0 */
    public orh0<Conversation>.a m17604p0() {
        return new orh0.a(this, "queryLimitedTrialSeeNoLimited", Filter.AND(new Filter[]{Conversation.CONVTYPE.EQ("free_see_match"), Conversation.LOCALISLIMITEDTRIALSEE.EQ(0)}), ((OrderedColumn) Conversation.CREATEDTIME).DESC, 0, 50);
    }

    /* JADX INFO: renamed from: p1, reason: merged with bridge method [inline-methods] */
    public Conversation upsert(Conversation conversation, f30<Conversation, Conversation> f30Var) {
        if (conversation.localHasMessage || (!TextUtils.isEmpty(conversation.clearedUntil) && !TextUtils.equals(conversation.clearedUntil, "0"))) {
            conversation.localEverHasMessage = true;
        }
        if (!NullChecker.a(((DbObject) conversation).id)) {
            CrashHelper.c(new IllegalStateException("【.id判空】conv id = null  upsert = , " + conversation.toJson() + "   conv._id = " + ((DbObject) conversation)._id));
        }
        return super.upsert(conversation, f30Var);
    }

    /* JADX INFO: renamed from: q0 */
    public Filter m17606q0() {
        return Conversation.ID.NEQ("fake_conversation_local_summary_marriage_conversation");
    }

    /* JADX INFO: renamed from: r0 */
    public Filter<Conversation> m17607r0() {
        TEnumColumn tEnumColumn = Conversation.STATUS;
        FilterList list = FilterList.list(new Filter[]{tEnumColumn.NEQ("local_fake"), tEnumColumn.NEQ("dismissed"), tEnumColumn.NEQ("removed"), tEnumColumn.NEQ("invisible"), tEnumColumn.NEQ("deleted"), m17606q0()});
        StringColumn stringColumn = Conversation.CONVTYPE;
        list.add(stringColumn.NEQ("swiper"));
        list.add(Filter.OR(new Filter[]{new C0893a(), Filter.AND(new Filter[]{Conversation.CREATEDTIME.REQ(ura.m25555e().m25559d().m5773go()), Filter.OR(new Filter[]{Filter.AND(new Filter[]{stringColumn.EQ("quickchat"), tEnumColumn.EQ(CameraSticker.CATEGORY_DEFAULT_FILTER)}), tEnumColumn.EQ("peeking")})})}));
        if (!ura.m25555e().m25559d().m5739b()) {
            list.add(this.f15233m);
        }
        list.add(m17613x0());
        if (ura.m25555e().m25559d().m5682R8()) {
            BooleanColumn booleanColumn = Conversation.LOCALEVERHASMESSAGE;
            list.add(Filter.OR(new Filter[]{booleanColumn.T(), Filter.AND(new Filter[]{stringColumn.NEQ("lovebuzz"), booleanColumn.F()})}));
        }
        if (ura.m25555e().m25559d().m5684Rk()) {
            list.add(ura.m25555e().m25559d().m5857sa() ? this.f15230W : this.f15216I);
        } else {
            list.add(this.f15217J);
        }
        if (CoreModule.m1854P().m11706a().m5331Qb()) {
            list.add(Filter.OR(new Filter[]{Conversation.LOCALISLIMITEDTRIALSEE.NEQ(2), stringColumn.NEQ("free_see_match")}));
        }
        return Filter.AND(list.toFilters());
    }

    /* JADX INFO: renamed from: s0 */
    public Filter m17608s0() {
        if (!ura.m25555e().m25559d().m5595B()) {
            return Filter.TRUE;
        }
        TEnumColumn tEnumColumn = Conversation.LOCALPLACEBAN;
        return Filter.AND(new Filter[]{tEnumColumn.NEQ("matchList"), tEnumColumn.NEQ("both")});
    }

    /* JADX INFO: renamed from: t0 */
    public Filter<Conversation> m17609t0() {
        TEnumColumn tEnumColumn = Conversation.STATUS;
        return Filter.AND(FilterList.list(new Filter[]{tEnumColumn.NEQ("local_fake"), tEnumColumn.NEQ("dismissed"), tEnumColumn.NEQ("removed"), tEnumColumn.NEQ("invisible"), tEnumColumn.NEQ("deleted"), Conversation.OTHERSTATUS.NEQ("invalid"), Conversation.CONVTYPE.EQ("marriage")}).toFilters());
    }

    /* JADX INFO: renamed from: u0 */
    public Filter<Conversation> m17610u0() {
        TEnumColumn tEnumColumn = Conversation.STATUS;
        return Filter.AND(FilterList.list(new Filter[]{tEnumColumn.NEQ("local_fake"), tEnumColumn.NEQ("dismissed"), tEnumColumn.NEQ("removed"), tEnumColumn.NEQ("invisible"), tEnumColumn.NEQ("deleted"), Conversation.OTHERSTATUS.NEQ("invalid"), Conversation.UNREADMESSAGES.REQ(1), Conversation.CONVTYPE.EQ("marriage")}).toFilters());
    }

    /* JADX INFO: renamed from: v0 */
    public final double m17611v0(int i) {
        return mqi0.o() - (((long) (i * 86400)) * 1000);
    }

    /* JADX INFO: renamed from: w0 */
    public final List<String> m17612w0(List<User> list) {
        ArrayList arrayList = new ArrayList();
        if (!vwb.J(list)) {
            for (int i = 0; i < list.size(); i++) {
                User user = list.get(i);
                if (NullChecker.a(user) && !user.isBannedNew() && !user.isBanned()) {
                    arrayList.add(((DbObject) user).id);
                }
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: x0 */
    public Filter m17613x0() {
        return Filter.TRUE;
    }

    /* JADX INFO: renamed from: y0 */
    public orh0<Conversation>.a m17614y0(String str) {
        return new orh0.a(this, "groupConversation/" + str, Filter.AND(new Filter[]{Conversation.CONVTYPE.EQ("group"), Conversation.OTHERUSER.EQ(str)}), ((OrderedColumn) Conversation.CREATEDTIME).DESC, 0, 1);
    }

    /* JADX INFO: renamed from: z0 */
    public orh0<Conversation>.a m17615z0() {
        Filter filterNOT_STARTS_WITH = Conversation.ID.NOT_STARTS_WITH("fake_conversation");
        TEnumColumn tEnumColumn = Conversation.STATUS;
        return new orh0.a(this, "intlChatConversationOrder", Filter.AND(new Filter[]{filterNOT_STARTS_WITH, Filter.AND(new Filter[]{tEnumColumn.NEQ("dismissed"), tEnumColumn.NEQ("local_fake"), tEnumColumn.NEQ("removed"), tEnumColumn.NEQ("invisible"), tEnumColumn.NEQ("deleted"), Conversation.LOCALEVERHASMESSAGE.T()}), m17600n0()}), new DoubleOrder(((OrderedColumn) Conversation.LEVEL).DESC, ((OrderedColumn) Conversation.LATESTTIME).DESC), 0, 200);
    }
}
