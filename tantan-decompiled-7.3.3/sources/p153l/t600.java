package p153l;

import com.p051p1.mobile.android.app.App;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.CoreMomentInfo;
import com.p051p1.mobile.putong.core.data.Message;
import com.p051p1.mobile.putong.core.data.MessageType;
import com.p051p1.mobile.putong.core.data.NotificationStatus;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.data.tenum.TEnumColumn;
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
public class t600 extends wzh0<Message> {

    /* JADX INFO: renamed from: m */
    public wzh0<Message>.C21213a f172280m;

    /* JADX INFO: renamed from: n */
    public wzh0<Message>.C21213a f172281n;

    /* JADX INFO: renamed from: o */
    public Filter<Message> f172282o;

    public t600(h9c h9cVar, String str, vzf0<Message> vzf0Var, List<Index> list, int i) {
        super(h9cVar, str, vzf0Var, list, i);
        StringColumn<Message> stringColumn = Message.OWNER;
        Filter filterAND = Filter.AND(stringColumn.NEQ(CoreModule.m30929H().userId()), stringColumn.REQ("1"));
        DoubleColumn<Message> doubleColumn = Message.CREATEDTIME;
        this.f172280m = new wzh0.C21213a("receivedUserMessages", filterAND, doubleColumn.DESC, 50, 30);
        TEnumColumn<Message, NotificationStatus> tEnumColumn = Message.LOCALNOTIFICATIONSTATUS;
        this.f172281n = new wzh0.C21213a("sysnotif", Filter.m82444OR(tEnumColumn.m61360EQ("pending"), tEnumColumn.m61360EQ("ongoing")), doubleColumn.DESC, 0, 50);
        Filter<Message> filterM82407T = Message.LOCALINCONVERSATION.m82407T();
        TEnumColumn<Message, MessageType> tEnumColumn2 = Message.MESSAGETYPE;
        this.f172282o = Filter.AND(filterM82407T, tEnumColumn2.NEQ("tantan_verify_toast"), tEnumColumn2.NEQ("live_vip_greet"), tEnumColumn2.NEQ("local_tickle_tip"), tEnumColumn2.NEQ(MessageType.soul_test_guide), tEnumColumn2.NEQ(MessageType.soul_match_invite_upload_profile), tEnumColumn2.NEQ(MessageType.local_soul_match_like), tEnumColumn2.NEQ(MessageType.local_soul_match_profile_limit), tEnumColumn2.NEQ("liaoliao"), tEnumColumn2.NEQ(MessageType.local_soul_match_tags), tEnumColumn2.NEQ("local_friend_comment_toast"), tEnumColumn2.NEQ(MessageType.local_birthday_tip), tEnumColumn2.NEQ(MessageType.local_chat_assistant_question_new), tEnumColumn2.NEQ(MessageType.local_heart_beat_lock_tip), tEnumColumn2.NEQ(MessageType.local_platinum_pin_guide), tEnumColumn2.NEQ(MessageType.local_wechat_notify_guide), tEnumColumn2.NEQ(MessageType.common_tip), tEnumColumn2.NEQ(MessageType.local_long_time_no_see), tEnumColumn2.NEQ(MessageType.wanwan_tip), tEnumColumn2.NEQ(MessageType.local_visitor_hide_footprint), tEnumColumn2.NEQ(MessageType.local_ux_questionnaire), tEnumColumn2.NEQ(MessageType.local_ux_questionnaire_tip), tEnumColumn2.NEQ(MessageType.local_o_diamond_visitor_guide));
    }

    /* JADX INFO: renamed from: A0 */
    public void m189443A0(NotificationStatus notificationStatus, NotificationStatus notificationStatus2, String str) {
        TEnumColumn<Message, NotificationStatus> tEnumColumn = Message.LOCALNOTIFICATIONSTATUS;
        update(jyb.m147507f0(jyb.m147494Y(tEnumColumn, notificationStatus2)), Filter.AND(Message.HOSTID.mo61359EQ(str), Message.CHANNEL.m61360EQ("group"), tEnumColumn.m61360EQ(notificationStatus.toString())));
    }

    /* JADX INFO: renamed from: F */
    public List<Message> m189444F(String str, double d) {
        Filter<Message> filterMo61359EQ = Message.CID.mo61359EQ(str);
        DoubleColumn<Message> doubleColumn = Message.CREATEDTIME;
        return query(Filter.AND(filterMo61359EQ, doubleColumn.REQ(Double.valueOf(d)), doubleColumn.NEQ(Double.valueOf(d))), doubleColumn.DESC, 10);
    }

    /* JADX INFO: renamed from: G */
    public List<Message> m189445G(String str, String str2) {
        return query(Filter.AND(Message.CID.mo61359EQ(str), Message.f21183ID.NOT_STARTS_WITH("fake_id_"), Message.OWNER.mo61359EQ(str2)), Message.CREATEDTIME.DESC, 1);
    }

    /* JADX INFO: renamed from: H */
    public void m189446H(String str, double d) {
        StringColumn<Message> stringColumn = Message.CID;
        Filter<Message> filterMo61359EQ = stringColumn.mo61359EQ(str);
        DoubleColumn<Message> doubleColumn = Message.CREATEDTIME;
        Filter<Message> filterLEQ = doubleColumn.LEQ(Double.valueOf(d));
        StringColumn<Message> stringColumn2 = Message.MOMENT;
        Filter<Message> filterNULL = stringColumn2.NULL();
        StringColumn<Message> stringColumn3 = Message.f21183ID;
        Filter<Message> filterNOT_STARTS_WITH = stringColumn3.NOT_STARTS_WITH("fake_id_");
        IntegerColumn<Message> integerColumn = Message.LOCALCREATEDSESSION;
        vxd0 vxd0Var = App.f16092i;
        delete(Filter.AND(filterMo61359EQ, filterLEQ, filterNULL, Filter.m82444OR(filterNOT_STARTS_WITH, integerColumn.LEQ(vxd0Var.get()))));
        update(jyb.m147507f0(jyb.m147494Y(Message.LOCALINCONVERSATION, Boolean.FALSE), jyb.m147494Y(Message.LOCALNOTIFICATIONSTATUS, NotificationStatus.get("removed"))), Filter.AND(stringColumn.mo61359EQ(str), doubleColumn.LEQ(Double.valueOf(d)), stringColumn2.NOT_NULL(), Filter.m82444OR(stringColumn3.NOT_STARTS_WITH("fake_id_"), integerColumn.LEQ(vxd0Var.get()))));
    }

    /* JADX INFO: renamed from: I */
    public wzh0<Message>.C21213a m189447I(String str) {
        return new wzh0.C21213a("comments/" + str, Filter.AND(Message.LOCALINMOMENT.m82407T(), Message.MOMENT.mo61359EQ(str)), Message.CREATEDTIME.DESC, 0, 100);
    }

    /* JADX INFO: renamed from: J */
    public void m189448J(String str) {
        delete(Message.CID.mo61359EQ(str));
    }

    /* JADX INFO: renamed from: K */
    public wzh0<Message>.C21213a m189449K() {
        return new wzh0.C21213a("firsttextMessages", Filter.AND(Message.MESSAGETYPE.m61360EQ("text")), Message.CREATEDTIME.DESC, 1, 20);
    }

    /* JADX INFO: renamed from: L */
    public wzh0<Message>.C21213a m189450L(String str) {
        return new wzh0.C21213a(str, Message.f21183ID.mo61359EQ(str), Message.CREATEDTIME.DESC, 1, 100);
    }

    /* JADX INFO: renamed from: M */
    public wzh0<Message>.C21213a m189451M(String str, String str2) {
        return new wzh0.C21213a("greetMessagesSent/" + str2, Filter.AND(Message.LOCALGREETINGID.mo61359EQ(str), Message.CID.mo61359EQ(str2), Message.OWNER.mo61359EQ(CoreModule.m30929H().userId())), Message.CREATEDTIME.DESC, 1, 30);
    }

    /* JADX INFO: renamed from: N */
    public wzh0<Message>.C21213a m189452N(String str) {
        String str2 = "greeting/" + str + "/messages";
        Filter<Message> filterMo61359EQ = Message.LOCALGREETINGID.mo61359EQ(str);
        TEnumColumn<Message, MessageType> tEnumColumn = Message.MESSAGETYPE;
        return new wzh0.C21213a(str2, Filter.AND(filterMo61359EQ, tEnumColumn.NEQ(MessageType.local_greeting_match_success), tEnumColumn.NEQ(MessageType.local_chat_greeting_tip), Filter.m82444OR(tEnumColumn.m61360EQ(MessageType.local_greet_send_notice), tEnumColumn.m61360EQ(MessageType.local_greet_receive_match_tip), tEnumColumn.m61360EQ(MessageType.local_send_agreematch_notice))), Message.CREATEDTIME.DESC, 0, 100);
    }

    /* JADX INFO: renamed from: O */
    public wzh0<Message>.C21213a m189453O(String str, String str2) {
        return new wzh0.C21213a("greeting/" + str + "/greetingId" + str2 + "/clearedUntil", Filter.AND(Message.LOCALGREETINGID.mo61359EQ(str), Message.f21183ID.mo61359EQ(str2)), Message.CREATEDTIME.DESC, 1, 100);
    }

    /* JADX INFO: renamed from: P */
    public wzh0<Message>.C21213a m189454P(String str, double d, long j, boolean z) {
        Filter<Message> filterM61360EQ = j > 0 ? Message.CHANNEL.m61360EQ("anonymous") : Filter.TRUE;
        String str2 = "greeting/" + str + "/messagesGreaterThanClearUntil" + d + "/clearUntil" + j + "/anonymous" + z;
        Filter<Message> filterMo61359EQ = Message.LOCALGREETINGID.mo61359EQ(str);
        TEnumColumn<Message, MessageType> tEnumColumn = Message.MESSAGETYPE;
        Filter<Message> filterNEQ = tEnumColumn.NEQ(MessageType.local_greeting_match_success);
        Filter<Message> filterNEQ2 = tEnumColumn.NEQ(MessageType.local_chat_greeting_tip);
        if (!z) {
            filterM61360EQ = Message.CHANNEL.NEQ("anonymous");
        }
        Filter<Message> filter = filterM61360EQ;
        DoubleColumn<Message> doubleColumn = Message.CREATEDTIME;
        return new wzh0.C21213a(str2, Filter.AND(filterMo61359EQ, filterNEQ, filterNEQ2, filter, doubleColumn.REQ(Double.valueOf(d)), doubleColumn.NEQ(Double.valueOf(d))), doubleColumn.DESC, 1, 100);
    }

    /* JADX INFO: renamed from: Q */
    public wzh0<Message>.C21213a m189455Q(String str) {
        String str2 = "greeting/" + str + "/messages/withoutFakeId";
        Filter<Message> filterMo61359EQ = Message.LOCALGREETINGID.mo61359EQ(str);
        StringColumn<Message> stringColumn = Message.f21183ID;
        return new wzh0.C21213a(str2, Filter.AND(filterMo61359EQ, stringColumn.NOT_STARTS_WITH(DbObject.FAKE_ID_PRIVATE_QUESTION_PREFIX), stringColumn.NOT_STARTS_WITH("fake_id_")), Message.CREATEDTIME.DESC, 1, 100);
    }

    /* JADX INFO: renamed from: R */
    public wzh0<Message>.C21213a m189456R(String str, double d, boolean z) {
        Filter filterAND = Filter.TRUE;
        if (z) {
            filterAND = Filter.AND(Message.f21183ID.NOT_STARTS_WITH("fake_id_"), this.f172282o);
        }
        String str2 = str + "/filter/intlMessageListRealShow" + d + "/" + z;
        Filter<Message> filterM82407T = Message.LOCALINCONVERSATION.m82407T();
        Filter<Message> filterMo61359EQ = Message.CID.mo61359EQ(str);
        DoubleColumn<Message> doubleColumn = Message.CREATEDTIME;
        return new wzh0.C21213a(str2, Filter.AND(filterM82407T, filterMo61359EQ, Filter.AND(doubleColumn.REQ(Double.valueOf(d)), doubleColumn.NEQ(Double.valueOf(d))), filterAND), doubleColumn.DESC, 1, 100);
    }

    /* JADX INFO: renamed from: S */
    public void m189457S(String str) {
        StringColumn<Message> stringColumn = Message.MOMENT;
        pf60 pf60VarM147494Y = jyb.m147494Y(stringColumn, CoreMomentInfo.LOCAL_ID_INVALID);
        BooleanColumn<Message> booleanColumn = Message.LOCALINMOMENT;
        Boolean bool = Boolean.FALSE;
        update(jyb.m147507f0(pf60VarM147494Y, jyb.m147494Y(booleanColumn, bool)), stringColumn.mo61359EQ(str));
        StringColumn<Message> stringColumn2 = Message.LIKEOFMOMENT;
        update(jyb.m147507f0(jyb.m147494Y(stringColumn2, CoreMomentInfo.LOCAL_ID_INVALID), jyb.m147494Y(booleanColumn, bool)), stringColumn2.mo61359EQ(str));
    }

    /* JADX INFO: renamed from: T */
    public List<Message> m189458T(String str) {
        Filter<Message> filterM82407T = Message.LOCALINCONVERSATION.m82407T();
        Filter<Message> filterMo61359EQ = Message.CID.mo61359EQ(str);
        TEnumColumn<Message, MessageType> tEnumColumn = Message.MESSAGETYPE;
        return query(Filter.AND(filterM82407T, filterMo61359EQ, tEnumColumn.NEQ("tantan_verify_toast"), tEnumColumn.NEQ("live_vip_greet"), tEnumColumn.NEQ("local_tickle_tip"), tEnumColumn.NEQ(MessageType.soul_test_guide), tEnumColumn.NEQ(MessageType.soul_match_invite_upload_profile), tEnumColumn.NEQ(MessageType.local_soul_match_like), tEnumColumn.NEQ(MessageType.local_soul_match_profile_limit), tEnumColumn.NEQ("liaoliao"), tEnumColumn.NEQ(MessageType.local_soul_match_tags), tEnumColumn.NEQ("local_friend_comment_toast"), tEnumColumn.NEQ(MessageType.wanwan_tip)), Message.CREATEDTIME.DESC, 1);
    }

    /* JADX INFO: renamed from: U */
    public List<Message> m189459U(String str) {
        return query(Filter.AND(Message.CID.mo61359EQ(str), this.f172282o), Message.CREATEDTIME.DESC, 1);
    }

    /* JADX INFO: renamed from: V */
    public void m189460V(String str, List<String> list, boolean z) {
        BooleanColumn<Message> booleanColumn = Message.LOCALINMOMENT;
        ArrayList arrayListM147507f0 = jyb.m147507f0(jyb.m147494Y(booleanColumn, Boolean.valueOf(z)));
        Filter<Message> filterMo61359EQ = Message.MOMENT.mo61359EQ(str);
        StringColumn<Message> stringColumn = Message.f21183ID;
        update(arrayListM147507f0, Filter.AND(filterMo61359EQ, stringColumn.NOT_STARTS_WITH("fake_id_"), stringColumn.NOT_IN(list), booleanColumn.NEQ(Boolean.valueOf(z))));
    }

    /* JADX INFO: renamed from: W */
    public wzh0<Message>.C21213a m189461W(String str) {
        return new wzh0.C21213a(str, Filter.AND(Message.LOCALINCONVERSATION.m82407T(), Message.CID.mo61359EQ(str)), Message.CREATEDTIME.DESC, 1, 100);
    }

    /* JADX INFO: renamed from: X */
    public wzh0<Message>.C21213a m189462X(String str, Filter<Message> filter, String str2, double d, boolean z) {
        Filter filterAND = Filter.TRUE;
        if (!z) {
            DoubleColumn<Message> doubleColumn = Message.CREATEDTIME;
            filterAND = Filter.AND(doubleColumn.REQ(Double.valueOf(d)), doubleColumn.NEQ(Double.valueOf(d)));
        }
        return new wzh0.C21213a(str + "/filter/" + str2, Filter.AND(Message.LOCALINCONVERSATION.m82407T(), Message.CID.mo61359EQ(str), filter, filterAND), Message.CREATEDTIME.DESC, 1, 100);
    }

    /* JADX INFO: renamed from: Y */
    public wzh0<Message>.C21213a m189463Y(String str, String str2) {
        Filter filter = Filter.TRUE;
        StringColumn<Message> stringColumn = Message.f21183ID;
        return new wzh0.C21213a(str + "/filter/messageId/greater/than/" + str2, Filter.AND(Message.LOCALINCONVERSATION.m82407T(), Message.CID.mo61359EQ(str), Filter.AND(stringColumn.REQ(str2), stringColumn.NEQ(str2))), Message.CREATEDTIME.DESC, 1, 100);
    }

    /* JADX INFO: renamed from: Z */
    public wzh0<Message>.C21213a m189464Z(String str, double d, boolean z) {
        Filter filterAND = Filter.TRUE;
        if (!z) {
            DoubleColumn<Message> doubleColumn = Message.CREATEDTIME;
            filterAND = Filter.AND(doubleColumn.REQ(Double.valueOf(d)), doubleColumn.NEQ(Double.valueOf(d)));
        }
        return new wzh0.C21213a(str + "/filter/messageCreatedTime/greater/than/" + d, Filter.AND(Message.LOCALINCONVERSATION.m82407T(), Message.CID.mo61359EQ(str), filterAND), Message.CREATEDTIME.DESC, 1, 100);
    }

    /* JADX INFO: renamed from: a0 */
    public wzh0<Message>.C21213a m189465a0(String str) {
        String str2 = "messagesNotFakeReceivedByAsc/" + str;
        Filter<Message> filterMo61359EQ = Message.CID.mo61359EQ(str);
        Filter<Message> filterMo61359EQ2 = Message.OWNER.mo61359EQ(str);
        StringColumn<Message> stringColumn = Message.f21183ID;
        return new wzh0.C21213a(str2, Filter.AND(filterMo61359EQ, filterMo61359EQ2, stringColumn.NOT_STARTS_WITH("fake_id_"), stringColumn.NOT_STARTS_WITH(DbObject.FAKE_ID_PRIVATE_QUESTION_PREFIX), stringColumn.NOT_STARTS_WITH("fake_conversation")), Message.CREATEDTIME.ASC, 0, 30);
    }

    /* JADX INFO: renamed from: b0 */
    public wzh0<Message>.C21213a m189466b0(String str) {
        return new wzh0.C21213a("messagesReceived/" + str, Filter.AND(Message.CID.mo61359EQ(str), Message.OWNER.mo61359EQ(str)), Message.CREATEDTIME.DESC, 1, 30);
    }

    /* JADX INFO: renamed from: c0 */
    public wzh0<Message>.C21213a m189467c0(String str) {
        return new wzh0.C21213a("messagesReceivedByAsc/" + str, Filter.AND(Message.CID.mo61359EQ(str), Message.OWNER.mo61359EQ(str)), Message.CREATEDTIME.ASC, 0, 30);
    }

    /* JADX INFO: renamed from: d0 */
    public wzh0<Message>.C21213a m189468d0(String str) {
        return new wzh0.C21213a("messagesReceivedByAsc/" + str, Filter.AND(Message.CID.mo61359EQ(str), Message.OWNER.mo61359EQ(str)), Message.CREATEDTIME.ASC, 0, 30);
    }

    /* JADX INFO: renamed from: e0 */
    public wzh0<Message>.C21213a m189469e0(String str) {
        return new wzh0.C21213a("messagesSent/" + str, Filter.AND(Message.CID.mo61359EQ(str), Message.OWNER.mo61359EQ(CoreModule.m30929H().userId())), Message.CREATEDTIME.DESC, 1, 30);
    }

    /* JADX INFO: renamed from: f0 */
    public wzh0<Message>.C21213a m189470f0(String str) {
        return new wzh0.C21213a("messagesSentWithoutLocal/" + str, Filter.AND(Message.CID.mo61359EQ(str), Message.OWNER.mo61359EQ(CoreModule.m30929H().userId()), Message.f21183ID.NOT_STARTS_WITH("fake_id_")), Message.CREATEDTIME.DESC, 1, 30);
    }

    /* JADX INFO: renamed from: g0 */
    public wzh0<Message>.C21213a m189471g0(String str) {
        String str2 = "messagesNotFakeSuccessSentByAsc/" + str;
        Filter<Message> filterMo61359EQ = Message.CID.mo61359EQ(str);
        Filter<Message> filterMo61359EQ2 = Message.OWNER.mo61359EQ(CoreModule.m30929H().userId());
        StringColumn<Message> stringColumn = Message.f21183ID;
        return new wzh0.C21213a(str2, Filter.AND(filterMo61359EQ, filterMo61359EQ2, stringColumn.NOT_STARTS_WITH("fake_id_"), stringColumn.NOT_STARTS_WITH(DbObject.FAKE_ID_PRIVATE_QUESTION_PREFIX), stringColumn.NOT_STARTS_WITH("fake_conversation")), Message.CREATEDTIME.ASC, 0, 30);
    }

    /* JADX INFO: renamed from: h0 */
    public wzh0<Message>.C21213a m189472h0(String str) {
        return new wzh0.C21213a("messagesSuccessSentByAsc/" + str, Filter.AND(Message.CID.mo61359EQ(str), Message.OWNER.mo61359EQ(CoreModule.m30929H().userId()), Message.f21183ID.NOT_STARTS_WITH("fake_id_")), Message.CREATEDTIME.ASC, 0, 30);
    }

    /* JADX INFO: renamed from: i0 */
    public wzh0<Message>.C21213a m189473i0(String str) {
        return new wzh0.C21213a("messagesSuccessSentByDesc/" + str, Filter.AND(Message.CID.mo61359EQ(str), Message.OWNER.mo61359EQ(CoreModule.m30929H().userId()), Message.f21183ID.NOT_STARTS_WITH("fake_id_")), Message.CREATEDTIME.DESC, 0, 30);
    }

    /* JADX INFO: renamed from: j0 */
    public wzh0<Message>.C21213a m189474j0(String str) {
        return new wzh0.C21213a("messagesReceived/" + str, Filter.AND(Message.CID.mo61359EQ(str), Message.OWNER.mo61359EQ(str)), Message.CREATEDTIME.ASC, 1, 30);
    }

    /* JADX INFO: renamed from: k0 */
    public wzh0<Message>.C21213a m189475k0(String str) {
        String str2 = str + "/with_media";
        Filter<Message> filterM82407T = Message.LOCALINCONVERSATION.m82407T();
        Filter<Message> filterMo61359EQ = Message.CID.mo61359EQ(str);
        Filter<Message> filterNOT_NULL = Message.MEDIA.NOT_NULL();
        TEnumColumn<Message, MessageType> tEnumColumn = Message.MESSAGETYPE;
        return new wzh0.C21213a(str2, Filter.AND(filterM82407T, filterMo61359EQ, filterNOT_NULL, tEnumColumn.NEQ(MessageType.exchange_picture), tEnumColumn.NEQ(MessageType.limit_time_picture)), Message.CREATEDTIME.DESC, 0, 1000);
    }

    /* JADX INFO: renamed from: l0 */
    public wzh0<Message>.C21213a m189476l0(String str) {
        String str2 = "message/withoutfake/" + str;
        Filter<Message> filterM82407T = Message.LOCALINCONVERSATION.m82407T();
        Filter<Message> filterMo61359EQ = Message.CID.mo61359EQ(str);
        StringColumn<Message> stringColumn = Message.f21183ID;
        return new wzh0.C21213a(str2, Filter.AND(filterM82407T, filterMo61359EQ, stringColumn.NOT_STARTS_WITH(DbObject.FAKE_ID_PRIVATE_QUESTION_PREFIX), stringColumn.NOT_STARTS_WITH("fake_id_")), Message.CREATEDTIME.DESC, 1, 100);
    }

    /* JADX INFO: renamed from: m0 */
    public wzh0<Message>.C21213a m189477m0(String str) {
        String str2 = "message/withoutfakeorother/" + str;
        Filter<Message> filterM82407T = Message.LOCALINCONVERSATION.m82407T();
        Filter<Message> filterMo61359EQ = Message.CID.mo61359EQ(str);
        Filter<Message> filterMo61359EQ2 = Message.OWNER.mo61359EQ(CoreModule.m30929H().userId());
        StringColumn<Message> stringColumn = Message.f21183ID;
        return new wzh0.C21213a(str2, Filter.AND(filterM82407T, filterMo61359EQ, filterMo61359EQ2, stringColumn.NOT_STARTS_WITH(DbObject.FAKE_ID_PRIVATE_QUESTION_PREFIX), stringColumn.NOT_STARTS_WITH("fake_id_")), Message.CREATEDTIME.DESC, 1, 100);
    }

    /* JADX INFO: renamed from: n0 */
    public List<Message> m189478n0(String str, int i) {
        if (i > 20) {
            i = 20;
        }
        if (i < 1) {
            i = 1;
        }
        Filter<Message> filterM82407T = Message.LOCALINCONVERSATION.m82407T();
        Filter<Message> filterMo61359EQ = Message.CID.mo61359EQ(str);
        StringColumn<Message> stringColumn = Message.f21183ID;
        return query(Filter.AND(filterM82407T, filterMo61359EQ, stringColumn.NOT_STARTS_WITH("fake_"), stringColumn.NOT_STARTS_WITH("local_"), this.f172282o), Message.CREATEDTIME.DESC, i);
    }

    /* JADX INFO: renamed from: o0 */
    public List<Message> m189479o0(String str, String str2) {
        return query(Filter.AND(Message.LOCALINCONVERSATION.m82407T(), Message.CID.mo61359EQ(str), Message.MESSAGETYPE.m61360EQ(str2)), Message.CREATEDTIME.DESC, 1);
    }

    /* JADX INFO: renamed from: p0 */
    public wzh0<Message>.C21213a m189480p0(String str, double d, String str2) {
        String str3 = "message/queryMessageByType/" + str + "/" + d + '/' + str2;
        Filter<Message> filterM82407T = Message.LOCALINCONVERSATION.m82407T();
        Filter<Message> filterMo61359EQ = Message.CID.mo61359EQ(str);
        Filter<Message> filterM61360EQ = Message.MESSAGETYPE.m61360EQ(str2);
        DoubleColumn<Message> doubleColumn = Message.CREATEDTIME;
        return new wzh0.C21213a(str3, Filter.AND(filterM82407T, filterMo61359EQ, filterM61360EQ, Filter.AND(doubleColumn.REQ(Double.valueOf(d)), doubleColumn.NEQ(Double.valueOf(d)))), doubleColumn.DESC, 1, 100);
    }

    /* JADX INFO: renamed from: q0 */
    public wzh0<Message>.C21213a m189481q0(String str, String str2) {
        return new wzh0.C21213a("message/queryMessageByType/" + str + "/" + str2, Filter.AND(Message.LOCALINCONVERSATION.m82407T(), Message.CID.mo61359EQ(str), Message.MESSAGETYPE.m61360EQ(str2)), Message.CREATEDTIME.DESC, 1, 100);
    }

    /* JADX INFO: renamed from: r0 */
    public wzh0<Message>.C21213a m189482r0(String str, String str2) {
        return new wzh0.C21213a("message_type_query_" + str + str2, Filter.AND(Message.CID.mo61359EQ(str), Message.MESSAGETYPE.m61360EQ(str2)), Message.CREATEDTIME.DESC, 0, 100);
    }

    /* JADX INFO: renamed from: s0 */
    public wzh0<Message>.C21213a m189483s0(String str) {
        return new wzh0.C21213a("recentReplyMessage" + str, Filter.AND(Message.CID.mo61359EQ(str), Message.OWNER.NEQ(CoreModule.m30929H().userId())), Message.CREATEDTIME.DESC, 0, 100);
    }

    /* JADX INFO: renamed from: t0 */
    public wzh0<Message>.C21213a m189484t0(String str, String str2, int i) {
        return new wzh0.C21213a("specifyCountMessages" + str + "-" + str2, Filter.AND(Message.CID.mo61359EQ(str), Message.f21183ID.NOT_STARTS_WITH("fake_id_"), Message.OWNER.mo61359EQ(str2)), Message.CREATEDTIME.DESC, 0, i);
    }

    /* JADX INFO: renamed from: u0 */
    public void m189485u0(NotificationStatus notificationStatus, NotificationStatus notificationStatus2, String str) {
        TEnumColumn<Message, NotificationStatus> tEnumColumn = Message.LOCALNOTIFICATIONSTATUS;
        update(jyb.m147507f0(jyb.m147494Y(tEnumColumn, notificationStatus2)), Filter.AND(Message.LOCALGREETINGID.mo61359EQ(str), tEnumColumn.m61360EQ(notificationStatus.toString())));
    }

    /* JADX INFO: renamed from: v0 */
    public int m189486v0(String str) {
        TEnumColumn<Message, NotificationStatus> tEnumColumn = Message.LOCALNOTIFICATIONSTATUS;
        return count(Filter.AND(Filter.m82444OR(tEnumColumn.m61360EQ("pending"), tEnumColumn.m61360EQ("ongoing")), Message.OWNER.mo61359EQ(str)), -1);
    }

    /* JADX INFO: renamed from: w0 */
    public List<Message> m189487w0() {
        TEnumColumn<Message, NotificationStatus> tEnumColumn = Message.LOCALNOTIFICATIONSTATUS;
        return query(Filter.m82444OR(tEnumColumn.m61360EQ("pending"), tEnumColumn.m61360EQ("ongoing")), Message.CREATEDTIME.DESC, 1000);
    }

    /* JADX INFO: renamed from: x0 */
    public int m189488x0(String str) {
        Filter<Message> filterAND;
        if (gta.m132210e().m132214d().mo34805b()) {
            filterAND = Message.OWNER.NEQ(str);
        } else {
            StringColumn<Message> stringColumn = Message.OWNER;
            filterAND = Filter.AND(stringColumn.NEQ(str), stringColumn.NEQ(User.ID_LIVE_VIP_SERVICE), stringColumn.NEQ(User.ID_LIVE_SERVICE));
        }
        TEnumColumn<Message, NotificationStatus> tEnumColumn = Message.LOCALNOTIFICATIONSTATUS;
        return count(Filter.AND(Filter.m82444OR(tEnumColumn.m61360EQ("pending"), tEnumColumn.m61360EQ("ongoing")), filterAND), -1);
    }

    /* JADX INFO: renamed from: y0 */
    public void m189489y0(NotificationStatus notificationStatus, NotificationStatus notificationStatus2) {
        TEnumColumn<Message, NotificationStatus> tEnumColumn = Message.LOCALNOTIFICATIONSTATUS;
        update(jyb.m147507f0(jyb.m147494Y(tEnumColumn, notificationStatus2)), tEnumColumn.m61360EQ(notificationStatus.toString()));
    }

    /* JADX INFO: renamed from: z0 */
    public void m189490z0(NotificationStatus notificationStatus, NotificationStatus notificationStatus2, String str) {
        TEnumColumn<Message, NotificationStatus> tEnumColumn = Message.LOCALNOTIFICATIONSTATUS;
        update(jyb.m147507f0(jyb.m147494Y(tEnumColumn, notificationStatus2)), Filter.AND(Message.OWNER.mo61359EQ(str), tEnumColumn.m61360EQ(notificationStatus.toString())));
    }
}
