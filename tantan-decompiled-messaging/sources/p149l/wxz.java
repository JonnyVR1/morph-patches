package p149l;

import com.p046p1.mobile.android.app.App;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.CoreMomentInfo;
import com.p046p1.mobile.putong.core.data.Message;
import com.p046p1.mobile.putong.core.data.MessageType;
import com.p046p1.mobile.putong.core.data.NotificationStatus;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.data.tenum.TEnumColumn;
import com.tantanapp.common.data.DbObject;
import com.tantanapp.common.data.orm.BooleanColumn;
import com.tantanapp.common.data.orm.DoubleColumn;
import com.tantanapp.common.data.orm.Filter;
import com.tantanapp.common.data.orm.Index;
import com.tantanapp.common.data.orm.IntegerColumn;
import com.tantanapp.common.data.orm.StringColumn;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public class wxz extends orh0<Message> {

    /* JADX INFO: renamed from: m */
    public orh0<Message>.C19008a f188534m;

    /* JADX INFO: renamed from: n */
    public orh0<Message>.C19008a f188535n;

    /* JADX INFO: renamed from: o */
    public Filter<Message> f188536o;

    public wxz(b8c b8cVar, String str, mrf0<Message> mrf0Var, List<Index> list, int i) {
        super(b8cVar, str, mrf0Var, list, i);
        StringColumn<Message> stringColumn = Message.OWNER;
        Filter filterAND = Filter.AND(stringColumn.NEQ(CoreModule.m29931H().userId()), stringColumn.REQ("1"));
        DoubleColumn<Message> doubleColumn = Message.CREATEDTIME;
        this.f188534m = new orh0.C19008a("receivedUserMessages", filterAND, doubleColumn.DESC, 50, 30);
        TEnumColumn<Message, NotificationStatus> tEnumColumn = Message.LOCALNOTIFICATIONSTATUS;
        this.f188535n = new orh0.C19008a("sysnotif", Filter.m81261OR(tEnumColumn.m60176EQ("pending"), tEnumColumn.m60176EQ("ongoing")), doubleColumn.DESC, 0, 50);
        Filter<Message> filterM81224T = Message.LOCALINCONVERSATION.m81224T();
        TEnumColumn<Message, MessageType> tEnumColumn2 = Message.MESSAGETYPE;
        this.f188536o = Filter.AND(filterM81224T, tEnumColumn2.NEQ("tantan_verify_toast"), tEnumColumn2.NEQ("live_vip_greet"), tEnumColumn2.NEQ("local_tickle_tip"), tEnumColumn2.NEQ(MessageType.soul_test_guide), tEnumColumn2.NEQ(MessageType.soul_match_invite_upload_profile), tEnumColumn2.NEQ(MessageType.local_soul_match_like), tEnumColumn2.NEQ(MessageType.local_soul_match_profile_limit), tEnumColumn2.NEQ("liaoliao"), tEnumColumn2.NEQ(MessageType.local_soul_match_tags), tEnumColumn2.NEQ("local_friend_comment_toast"), tEnumColumn2.NEQ(MessageType.local_birthday_tip), tEnumColumn2.NEQ(MessageType.local_chat_assistant_question_new), tEnumColumn2.NEQ(MessageType.local_heart_beat_lock_tip), tEnumColumn2.NEQ(MessageType.local_platinum_pin_guide), tEnumColumn2.NEQ(MessageType.local_wechat_notify_guide), tEnumColumn2.NEQ(MessageType.common_tip), tEnumColumn2.NEQ(MessageType.local_long_time_no_see), tEnumColumn2.NEQ(MessageType.wanwan_tip), tEnumColumn2.NEQ(MessageType.local_visitor_hide_footprint), tEnumColumn2.NEQ(MessageType.local_ux_questionnaire), tEnumColumn2.NEQ(MessageType.local_ux_questionnaire_tip), tEnumColumn2.NEQ(MessageType.local_o_diamond_visitor_guide));
    }

    /* JADX INFO: renamed from: A0 */
    public void m206047A0(NotificationStatus notificationStatus, NotificationStatus notificationStatus2, String str) {
        TEnumColumn<Message, NotificationStatus> tEnumColumn = Message.LOCALNOTIFICATIONSTATUS;
        update(vwb.m200324f0(vwb.m200311Y(tEnumColumn, notificationStatus2)), Filter.AND(Message.HOSTID.mo60175EQ(str), Message.CHANNEL.m60176EQ("group"), tEnumColumn.m60176EQ(notificationStatus.toString())));
    }

    /* JADX INFO: renamed from: F */
    public List<Message> m206048F(String str, double d) {
        Filter<Message> filterMo60175EQ = Message.CID.mo60175EQ(str);
        DoubleColumn<Message> doubleColumn = Message.CREATEDTIME;
        return query(Filter.AND(filterMo60175EQ, doubleColumn.REQ(Double.valueOf(d)), doubleColumn.NEQ(Double.valueOf(d))), doubleColumn.DESC, 10);
    }

    /* JADX INFO: renamed from: G */
    public List<Message> m206049G(String str, String str2) {
        return query(Filter.AND(Message.CID.mo60175EQ(str), Message.f20441ID.NOT_STARTS_WITH("fake_id_"), Message.OWNER.mo60175EQ(str2)), Message.CREATEDTIME.DESC, 1);
    }

    /* JADX INFO: renamed from: H */
    public void m206050H(String str, double d) {
        StringColumn<Message> stringColumn = Message.CID;
        Filter<Message> filterMo60175EQ = stringColumn.mo60175EQ(str);
        DoubleColumn<Message> doubleColumn = Message.CREATEDTIME;
        Filter<Message> filterLEQ = doubleColumn.LEQ(Double.valueOf(d));
        StringColumn<Message> stringColumn2 = Message.MOMENT;
        Filter<Message> filterNULL = stringColumn2.NULL();
        StringColumn<Message> stringColumn3 = Message.f20441ID;
        Filter<Message> filterNOT_STARTS_WITH = stringColumn3.NOT_STARTS_WITH("fake_id_");
        IntegerColumn<Message> integerColumn = Message.LOCALCREATEDSESSION;
        tpd0 tpd0Var = App.f15373i;
        delete(Filter.AND(filterMo60175EQ, filterLEQ, filterNULL, Filter.m81261OR(filterNOT_STARTS_WITH, integerColumn.LEQ(tpd0Var.get()))));
        update(vwb.m200324f0(vwb.m200311Y(Message.LOCALINCONVERSATION, Boolean.FALSE), vwb.m200311Y(Message.LOCALNOTIFICATIONSTATUS, NotificationStatus.get("removed"))), Filter.AND(stringColumn.mo60175EQ(str), doubleColumn.LEQ(Double.valueOf(d)), stringColumn2.NOT_NULL(), Filter.m81261OR(stringColumn3.NOT_STARTS_WITH("fake_id_"), integerColumn.LEQ(tpd0Var.get()))));
    }

    /* JADX INFO: renamed from: I */
    public orh0<Message>.C19008a m206051I(String str) {
        return new orh0.C19008a("comments/" + str, Filter.AND(Message.LOCALINMOMENT.m81224T(), Message.MOMENT.mo60175EQ(str)), Message.CREATEDTIME.DESC, 0, 100);
    }

    /* JADX INFO: renamed from: J */
    public void m206052J(String str) {
        delete(Message.CID.mo60175EQ(str));
    }

    /* JADX INFO: renamed from: K */
    public orh0<Message>.C19008a m206053K() {
        return new orh0.C19008a("firsttextMessages", Filter.AND(Message.MESSAGETYPE.m60176EQ("text")), Message.CREATEDTIME.DESC, 1, 20);
    }

    /* JADX INFO: renamed from: L */
    public orh0<Message>.C19008a m206054L(String str) {
        return new orh0.C19008a(str, Message.f20441ID.mo60175EQ(str), Message.CREATEDTIME.DESC, 1, 100);
    }

    /* JADX INFO: renamed from: M */
    public orh0<Message>.C19008a m206055M(String str, String str2) {
        return new orh0.C19008a("greetMessagesSent/" + str2, Filter.AND(Message.LOCALGREETINGID.mo60175EQ(str), Message.CID.mo60175EQ(str2), Message.OWNER.mo60175EQ(CoreModule.m29931H().userId())), Message.CREATEDTIME.DESC, 1, 30);
    }

    /* JADX INFO: renamed from: N */
    public orh0<Message>.C19008a m206056N(String str) {
        String str2 = "greeting/" + str + "/messages";
        Filter<Message> filterMo60175EQ = Message.LOCALGREETINGID.mo60175EQ(str);
        TEnumColumn<Message, MessageType> tEnumColumn = Message.MESSAGETYPE;
        return new orh0.C19008a(str2, Filter.AND(filterMo60175EQ, tEnumColumn.NEQ(MessageType.local_greeting_match_success), tEnumColumn.NEQ(MessageType.local_chat_greeting_tip), Filter.m81261OR(tEnumColumn.m60176EQ(MessageType.local_greet_send_notice), tEnumColumn.m60176EQ(MessageType.local_greet_receive_match_tip), tEnumColumn.m60176EQ(MessageType.local_send_agreematch_notice))), Message.CREATEDTIME.DESC, 0, 100);
    }

    /* JADX INFO: renamed from: O */
    public orh0<Message>.C19008a m206057O(String str, String str2) {
        return new orh0.C19008a("greeting/" + str + "/greetingId" + str2 + "/clearedUntil", Filter.AND(Message.LOCALGREETINGID.mo60175EQ(str), Message.f20441ID.mo60175EQ(str2)), Message.CREATEDTIME.DESC, 1, 100);
    }

    /* JADX INFO: renamed from: P */
    public orh0<Message>.C19008a m206058P(String str, double d, long j, boolean z) {
        Filter<Message> filterM60176EQ = j > 0 ? Message.CHANNEL.m60176EQ("anonymous") : Filter.TRUE;
        String str2 = "greeting/" + str + "/messagesGreaterThanClearUntil" + d + "/clearUntil" + j + "/anonymous" + z;
        Filter<Message> filterMo60175EQ = Message.LOCALGREETINGID.mo60175EQ(str);
        TEnumColumn<Message, MessageType> tEnumColumn = Message.MESSAGETYPE;
        Filter<Message> filterNEQ = tEnumColumn.NEQ(MessageType.local_greeting_match_success);
        Filter<Message> filterNEQ2 = tEnumColumn.NEQ(MessageType.local_chat_greeting_tip);
        if (!z) {
            filterM60176EQ = Message.CHANNEL.NEQ("anonymous");
        }
        Filter<Message> filter = filterM60176EQ;
        DoubleColumn<Message> doubleColumn = Message.CREATEDTIME;
        return new orh0.C19008a(str2, Filter.AND(filterMo60175EQ, filterNEQ, filterNEQ2, filter, doubleColumn.REQ(Double.valueOf(d)), doubleColumn.NEQ(Double.valueOf(d))), doubleColumn.DESC, 1, 100);
    }

    /* JADX INFO: renamed from: Q */
    public orh0<Message>.C19008a m206059Q(String str) {
        String str2 = "greeting/" + str + "/messages/withoutFakeId";
        Filter<Message> filterMo60175EQ = Message.LOCALGREETINGID.mo60175EQ(str);
        StringColumn<Message> stringColumn = Message.f20441ID;
        return new orh0.C19008a(str2, Filter.AND(filterMo60175EQ, stringColumn.NOT_STARTS_WITH(DbObject.FAKE_ID_PRIVATE_QUESTION_PREFIX), stringColumn.NOT_STARTS_WITH("fake_id_")), Message.CREATEDTIME.DESC, 1, 100);
    }

    /* JADX INFO: renamed from: R */
    public orh0<Message>.C19008a m206060R(String str, double d, boolean z) {
        Filter filterAND = Filter.TRUE;
        if (z) {
            filterAND = Filter.AND(Message.f20441ID.NOT_STARTS_WITH("fake_id_"), this.f188536o);
        }
        String str2 = str + "/filter/intlMessageListRealShow" + d + "/" + z;
        Filter<Message> filterM81224T = Message.LOCALINCONVERSATION.m81224T();
        Filter<Message> filterMo60175EQ = Message.CID.mo60175EQ(str);
        DoubleColumn<Message> doubleColumn = Message.CREATEDTIME;
        return new orh0.C19008a(str2, Filter.AND(filterM81224T, filterMo60175EQ, Filter.AND(doubleColumn.REQ(Double.valueOf(d)), doubleColumn.NEQ(Double.valueOf(d))), filterAND), doubleColumn.DESC, 1, 100);
    }

    /* JADX INFO: renamed from: S */
    public void m206061S(String str) {
        StringColumn<Message> stringColumn = Message.MOMENT;
        j760 j760VarM200311Y = vwb.m200311Y(stringColumn, CoreMomentInfo.LOCAL_ID_INVALID);
        BooleanColumn<Message> booleanColumn = Message.LOCALINMOMENT;
        Boolean bool = Boolean.FALSE;
        update(vwb.m200324f0(j760VarM200311Y, vwb.m200311Y(booleanColumn, bool)), stringColumn.mo60175EQ(str));
        StringColumn<Message> stringColumn2 = Message.LIKEOFMOMENT;
        update(vwb.m200324f0(vwb.m200311Y(stringColumn2, CoreMomentInfo.LOCAL_ID_INVALID), vwb.m200311Y(booleanColumn, bool)), stringColumn2.mo60175EQ(str));
    }

    /* JADX INFO: renamed from: T */
    public List<Message> m206062T(String str) {
        Filter<Message> filterM81224T = Message.LOCALINCONVERSATION.m81224T();
        Filter<Message> filterMo60175EQ = Message.CID.mo60175EQ(str);
        TEnumColumn<Message, MessageType> tEnumColumn = Message.MESSAGETYPE;
        return query(Filter.AND(filterM81224T, filterMo60175EQ, tEnumColumn.NEQ("tantan_verify_toast"), tEnumColumn.NEQ("live_vip_greet"), tEnumColumn.NEQ("local_tickle_tip"), tEnumColumn.NEQ(MessageType.soul_test_guide), tEnumColumn.NEQ(MessageType.soul_match_invite_upload_profile), tEnumColumn.NEQ(MessageType.local_soul_match_like), tEnumColumn.NEQ(MessageType.local_soul_match_profile_limit), tEnumColumn.NEQ("liaoliao"), tEnumColumn.NEQ(MessageType.local_soul_match_tags), tEnumColumn.NEQ("local_friend_comment_toast"), tEnumColumn.NEQ(MessageType.wanwan_tip)), Message.CREATEDTIME.DESC, 1);
    }

    /* JADX INFO: renamed from: U */
    public List<Message> m206063U(String str) {
        return query(Filter.AND(Message.CID.mo60175EQ(str), this.f188536o), Message.CREATEDTIME.DESC, 1);
    }

    /* JADX INFO: renamed from: V */
    public void m206064V(String str, List<String> list, boolean z) {
        BooleanColumn<Message> booleanColumn = Message.LOCALINMOMENT;
        ArrayList arrayListM200324f0 = vwb.m200324f0(vwb.m200311Y(booleanColumn, Boolean.valueOf(z)));
        Filter<Message> filterMo60175EQ = Message.MOMENT.mo60175EQ(str);
        StringColumn<Message> stringColumn = Message.f20441ID;
        update(arrayListM200324f0, Filter.AND(filterMo60175EQ, stringColumn.NOT_STARTS_WITH("fake_id_"), stringColumn.NOT_IN(list), booleanColumn.NEQ(Boolean.valueOf(z))));
    }

    /* JADX INFO: renamed from: W */
    public orh0<Message>.C19008a m206065W(String str) {
        return new orh0.C19008a(str, Filter.AND(Message.LOCALINCONVERSATION.m81224T(), Message.CID.mo60175EQ(str)), Message.CREATEDTIME.DESC, 1, 100);
    }

    /* JADX INFO: renamed from: X */
    public orh0<Message>.C19008a m206066X(String str, Filter<Message> filter, String str2, double d, boolean z) {
        Filter filterAND = Filter.TRUE;
        if (!z) {
            DoubleColumn<Message> doubleColumn = Message.CREATEDTIME;
            filterAND = Filter.AND(doubleColumn.REQ(Double.valueOf(d)), doubleColumn.NEQ(Double.valueOf(d)));
        }
        return new orh0.C19008a(str + "/filter/" + str2, Filter.AND(Message.LOCALINCONVERSATION.m81224T(), Message.CID.mo60175EQ(str), filter, filterAND), Message.CREATEDTIME.DESC, 1, 100);
    }

    /* JADX INFO: renamed from: Y */
    public orh0<Message>.C19008a m206067Y(String str, String str2) {
        Filter filter = Filter.TRUE;
        StringColumn<Message> stringColumn = Message.f20441ID;
        return new orh0.C19008a(str + "/filter/messageId/greater/than/" + str2, Filter.AND(Message.LOCALINCONVERSATION.m81224T(), Message.CID.mo60175EQ(str), Filter.AND(stringColumn.REQ(str2), stringColumn.NEQ(str2))), Message.CREATEDTIME.DESC, 1, 100);
    }

    /* JADX INFO: renamed from: Z */
    public orh0<Message>.C19008a m206068Z(String str, double d, boolean z) {
        Filter filterAND = Filter.TRUE;
        if (!z) {
            DoubleColumn<Message> doubleColumn = Message.CREATEDTIME;
            filterAND = Filter.AND(doubleColumn.REQ(Double.valueOf(d)), doubleColumn.NEQ(Double.valueOf(d)));
        }
        return new orh0.C19008a(str + "/filter/messageCreatedTime/greater/than/" + d, Filter.AND(Message.LOCALINCONVERSATION.m81224T(), Message.CID.mo60175EQ(str), filterAND), Message.CREATEDTIME.DESC, 1, 100);
    }

    /* JADX INFO: renamed from: a0 */
    public orh0<Message>.C19008a m206069a0(String str) {
        String str2 = "messagesNotFakeReceivedByAsc/" + str;
        Filter<Message> filterMo60175EQ = Message.CID.mo60175EQ(str);
        Filter<Message> filterMo60175EQ2 = Message.OWNER.mo60175EQ(str);
        StringColumn<Message> stringColumn = Message.f20441ID;
        return new orh0.C19008a(str2, Filter.AND(filterMo60175EQ, filterMo60175EQ2, stringColumn.NOT_STARTS_WITH("fake_id_"), stringColumn.NOT_STARTS_WITH(DbObject.FAKE_ID_PRIVATE_QUESTION_PREFIX), stringColumn.NOT_STARTS_WITH("fake_conversation")), Message.CREATEDTIME.ASC, 0, 30);
    }

    /* JADX INFO: renamed from: b0 */
    public orh0<Message>.C19008a m206070b0(String str) {
        return new orh0.C19008a("messagesReceived/" + str, Filter.AND(Message.CID.mo60175EQ(str), Message.OWNER.mo60175EQ(str)), Message.CREATEDTIME.DESC, 1, 30);
    }

    /* JADX INFO: renamed from: c0 */
    public orh0<Message>.C19008a m206071c0(String str) {
        return new orh0.C19008a("messagesReceivedByAsc/" + str, Filter.AND(Message.CID.mo60175EQ(str), Message.OWNER.mo60175EQ(str)), Message.CREATEDTIME.ASC, 0, 30);
    }

    /* JADX INFO: renamed from: d0 */
    public orh0<Message>.C19008a m206072d0(String str) {
        return new orh0.C19008a("messagesReceivedByAsc/" + str, Filter.AND(Message.CID.mo60175EQ(str), Message.OWNER.mo60175EQ(str)), Message.CREATEDTIME.ASC, 0, 30);
    }

    /* JADX INFO: renamed from: e0 */
    public orh0<Message>.C19008a m206073e0(String str) {
        return new orh0.C19008a("messagesSent/" + str, Filter.AND(Message.CID.mo60175EQ(str), Message.OWNER.mo60175EQ(CoreModule.m29931H().userId())), Message.CREATEDTIME.DESC, 1, 30);
    }

    /* JADX INFO: renamed from: f0 */
    public orh0<Message>.C19008a m206074f0(String str) {
        return new orh0.C19008a("messagesSentWithoutLocal/" + str, Filter.AND(Message.CID.mo60175EQ(str), Message.OWNER.mo60175EQ(CoreModule.m29931H().userId()), Message.f20441ID.NOT_STARTS_WITH("fake_id_")), Message.CREATEDTIME.DESC, 1, 30);
    }

    /* JADX INFO: renamed from: g0 */
    public orh0<Message>.C19008a m206075g0(String str) {
        String str2 = "messagesNotFakeSuccessSentByAsc/" + str;
        Filter<Message> filterMo60175EQ = Message.CID.mo60175EQ(str);
        Filter<Message> filterMo60175EQ2 = Message.OWNER.mo60175EQ(CoreModule.m29931H().userId());
        StringColumn<Message> stringColumn = Message.f20441ID;
        return new orh0.C19008a(str2, Filter.AND(filterMo60175EQ, filterMo60175EQ2, stringColumn.NOT_STARTS_WITH("fake_id_"), stringColumn.NOT_STARTS_WITH(DbObject.FAKE_ID_PRIVATE_QUESTION_PREFIX), stringColumn.NOT_STARTS_WITH("fake_conversation")), Message.CREATEDTIME.ASC, 0, 30);
    }

    /* JADX INFO: renamed from: h0 */
    public orh0<Message>.C19008a m206076h0(String str) {
        return new orh0.C19008a("messagesSuccessSentByAsc/" + str, Filter.AND(Message.CID.mo60175EQ(str), Message.OWNER.mo60175EQ(CoreModule.m29931H().userId()), Message.f20441ID.NOT_STARTS_WITH("fake_id_")), Message.CREATEDTIME.ASC, 0, 30);
    }

    /* JADX INFO: renamed from: i0 */
    public orh0<Message>.C19008a m206077i0(String str) {
        return new orh0.C19008a("messagesSuccessSentByDesc/" + str, Filter.AND(Message.CID.mo60175EQ(str), Message.OWNER.mo60175EQ(CoreModule.m29931H().userId()), Message.f20441ID.NOT_STARTS_WITH("fake_id_")), Message.CREATEDTIME.DESC, 0, 30);
    }

    /* JADX INFO: renamed from: j0 */
    public orh0<Message>.C19008a m206078j0(String str) {
        return new orh0.C19008a("messagesReceived/" + str, Filter.AND(Message.CID.mo60175EQ(str), Message.OWNER.mo60175EQ(str)), Message.CREATEDTIME.ASC, 1, 30);
    }

    /* JADX INFO: renamed from: k0 */
    public orh0<Message>.C19008a m206079k0(String str) {
        String str2 = str + "/with_media";
        Filter<Message> filterM81224T = Message.LOCALINCONVERSATION.m81224T();
        Filter<Message> filterMo60175EQ = Message.CID.mo60175EQ(str);
        Filter<Message> filterNOT_NULL = Message.MEDIA.NOT_NULL();
        TEnumColumn<Message, MessageType> tEnumColumn = Message.MESSAGETYPE;
        return new orh0.C19008a(str2, Filter.AND(filterM81224T, filterMo60175EQ, filterNOT_NULL, tEnumColumn.NEQ(MessageType.exchange_picture), tEnumColumn.NEQ(MessageType.limit_time_picture)), Message.CREATEDTIME.DESC, 0, 1000);
    }

    /* JADX INFO: renamed from: l0 */
    public orh0<Message>.C19008a m206080l0(String str) {
        String str2 = "message/withoutfake/" + str;
        Filter<Message> filterM81224T = Message.LOCALINCONVERSATION.m81224T();
        Filter<Message> filterMo60175EQ = Message.CID.mo60175EQ(str);
        StringColumn<Message> stringColumn = Message.f20441ID;
        return new orh0.C19008a(str2, Filter.AND(filterM81224T, filterMo60175EQ, stringColumn.NOT_STARTS_WITH(DbObject.FAKE_ID_PRIVATE_QUESTION_PREFIX), stringColumn.NOT_STARTS_WITH("fake_id_")), Message.CREATEDTIME.DESC, 1, 100);
    }

    /* JADX INFO: renamed from: m0 */
    public orh0<Message>.C19008a m206081m0(String str) {
        String str2 = "message/withoutfakeorother/" + str;
        Filter<Message> filterM81224T = Message.LOCALINCONVERSATION.m81224T();
        Filter<Message> filterMo60175EQ = Message.CID.mo60175EQ(str);
        Filter<Message> filterMo60175EQ2 = Message.OWNER.mo60175EQ(CoreModule.m29931H().userId());
        StringColumn<Message> stringColumn = Message.f20441ID;
        return new orh0.C19008a(str2, Filter.AND(filterM81224T, filterMo60175EQ, filterMo60175EQ2, stringColumn.NOT_STARTS_WITH(DbObject.FAKE_ID_PRIVATE_QUESTION_PREFIX), stringColumn.NOT_STARTS_WITH("fake_id_")), Message.CREATEDTIME.DESC, 1, 100);
    }

    /* JADX INFO: renamed from: n0 */
    public List<Message> m206082n0(String str, int i) {
        if (i > 20) {
            i = 20;
        }
        if (i < 1) {
            i = 1;
        }
        Filter<Message> filterM81224T = Message.LOCALINCONVERSATION.m81224T();
        Filter<Message> filterMo60175EQ = Message.CID.mo60175EQ(str);
        StringColumn<Message> stringColumn = Message.f20441ID;
        return query(Filter.AND(filterM81224T, filterMo60175EQ, stringColumn.NOT_STARTS_WITH("fake_"), stringColumn.NOT_STARTS_WITH("local_"), this.f188536o), Message.CREATEDTIME.DESC, i);
    }

    /* JADX INFO: renamed from: o0 */
    public List<Message> m206083o0(String str, String str2) {
        return query(Filter.AND(Message.LOCALINCONVERSATION.m81224T(), Message.CID.mo60175EQ(str), Message.MESSAGETYPE.m60176EQ(str2)), Message.CREATEDTIME.DESC, 1);
    }

    /* JADX INFO: renamed from: p0 */
    public orh0<Message>.C19008a m206084p0(String str, double d, String str2) {
        String str3 = "message/queryMessageByType/" + str + "/" + d + '/' + str2;
        Filter<Message> filterM81224T = Message.LOCALINCONVERSATION.m81224T();
        Filter<Message> filterMo60175EQ = Message.CID.mo60175EQ(str);
        Filter<Message> filterM60176EQ = Message.MESSAGETYPE.m60176EQ(str2);
        DoubleColumn<Message> doubleColumn = Message.CREATEDTIME;
        return new orh0.C19008a(str3, Filter.AND(filterM81224T, filterMo60175EQ, filterM60176EQ, Filter.AND(doubleColumn.REQ(Double.valueOf(d)), doubleColumn.NEQ(Double.valueOf(d)))), doubleColumn.DESC, 1, 100);
    }

    /* JADX INFO: renamed from: q0 */
    public orh0<Message>.C19008a m206085q0(String str, String str2) {
        return new orh0.C19008a("message/queryMessageByType/" + str + "/" + str2, Filter.AND(Message.LOCALINCONVERSATION.m81224T(), Message.CID.mo60175EQ(str), Message.MESSAGETYPE.m60176EQ(str2)), Message.CREATEDTIME.DESC, 1, 100);
    }

    /* JADX INFO: renamed from: r0 */
    public orh0<Message>.C19008a m206086r0(String str, String str2) {
        return new orh0.C19008a("message_type_query_" + str + str2, Filter.AND(Message.CID.mo60175EQ(str), Message.MESSAGETYPE.m60176EQ(str2)), Message.CREATEDTIME.DESC, 0, 100);
    }

    /* JADX INFO: renamed from: s0 */
    public orh0<Message>.C19008a m206087s0(String str) {
        return new orh0.C19008a("recentReplyMessage" + str, Filter.AND(Message.CID.mo60175EQ(str), Message.OWNER.NEQ(CoreModule.m29931H().userId())), Message.CREATEDTIME.DESC, 0, 100);
    }

    /* JADX INFO: renamed from: t0 */
    public orh0<Message>.C19008a m206088t0(String str, String str2, int i) {
        return new orh0.C19008a("specifyCountMessages" + str + "-" + str2, Filter.AND(Message.CID.mo60175EQ(str), Message.f20441ID.NOT_STARTS_WITH("fake_id_"), Message.OWNER.mo60175EQ(str2)), Message.CREATEDTIME.DESC, 0, i);
    }

    /* JADX INFO: renamed from: u0 */
    public void m206089u0(NotificationStatus notificationStatus, NotificationStatus notificationStatus2, String str) {
        TEnumColumn<Message, NotificationStatus> tEnumColumn = Message.LOCALNOTIFICATIONSTATUS;
        update(vwb.m200324f0(vwb.m200311Y(tEnumColumn, notificationStatus2)), Filter.AND(Message.LOCALGREETINGID.mo60175EQ(str), tEnumColumn.m60176EQ(notificationStatus.toString())));
    }

    /* JADX INFO: renamed from: v0 */
    public int m206090v0(String str) {
        TEnumColumn<Message, NotificationStatus> tEnumColumn = Message.LOCALNOTIFICATIONSTATUS;
        return count(Filter.AND(Filter.m81261OR(tEnumColumn.m60176EQ("pending"), tEnumColumn.m60176EQ("ongoing")), Message.OWNER.mo60175EQ(str)), -1);
    }

    /* JADX INFO: renamed from: w0 */
    public List<Message> m206091w0() {
        TEnumColumn<Message, NotificationStatus> tEnumColumn = Message.LOCALNOTIFICATIONSTATUS;
        return query(Filter.m81261OR(tEnumColumn.m60176EQ("pending"), tEnumColumn.m60176EQ("ongoing")), Message.CREATEDTIME.DESC, 1000);
    }

    /* JADX INFO: renamed from: x0 */
    public int m206092x0(String str) {
        Filter<Message> filterAND;
        if (ura.m195053e().m195057d().mo33802b()) {
            filterAND = Message.OWNER.NEQ(str);
        } else {
            StringColumn<Message> stringColumn = Message.OWNER;
            filterAND = Filter.AND(stringColumn.NEQ(str), stringColumn.NEQ(User.ID_LIVE_VIP_SERVICE), stringColumn.NEQ(User.ID_LIVE_SERVICE));
        }
        TEnumColumn<Message, NotificationStatus> tEnumColumn = Message.LOCALNOTIFICATIONSTATUS;
        return count(Filter.AND(Filter.m81261OR(tEnumColumn.m60176EQ("pending"), tEnumColumn.m60176EQ("ongoing")), filterAND), -1);
    }

    /* JADX INFO: renamed from: y0 */
    public void m206093y0(NotificationStatus notificationStatus, NotificationStatus notificationStatus2) {
        TEnumColumn<Message, NotificationStatus> tEnumColumn = Message.LOCALNOTIFICATIONSTATUS;
        update(vwb.m200324f0(vwb.m200311Y(tEnumColumn, notificationStatus2)), tEnumColumn.m60176EQ(notificationStatus.toString()));
    }

    /* JADX INFO: renamed from: z0 */
    public void m206094z0(NotificationStatus notificationStatus, NotificationStatus notificationStatus2, String str) {
        TEnumColumn<Message, NotificationStatus> tEnumColumn = Message.LOCALNOTIFICATIONSTATUS;
        update(vwb.m200324f0(vwb.m200311Y(tEnumColumn, notificationStatus2)), Filter.AND(Message.OWNER.mo60175EQ(str), tEnumColumn.m60176EQ(notificationStatus.toString())));
    }
}
