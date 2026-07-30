package p006l;

import com.p000p1.mobile.putong.account.p002ui.camera.view.AccountMakeUpMenuView;
import com.p000p1.mobile.putong.core.CoreModule;
import com.p1.mobile.android.app.App;
import com.p1.mobile.putong.core.data.CoreMomentInfo;
import com.p1.mobile.putong.core.data.Message;
import com.p1.mobile.putong.core.data.NotificationStatus;
import com.p1.mobile.putong.data.tenum.TEnumColumn;
import com.tantanapp.common.data.orm.BooleanColumn;
import com.tantanapp.common.data.orm.DoubleColumn;
import com.tantanapp.common.data.orm.Filter;
import com.tantanapp.common.data.orm.Index;
import com.tantanapp.common.data.orm.IntegerColumn;
import com.tantanapp.common.data.orm.OrderedColumn;
import com.tantanapp.common.data.orm.StringColumn;
import java.util.ArrayList;
import java.util.List;
import l.b8c;
import l.j760;
import l.mrf0;
import l.orh0;
import l.tpd0;
import l.vwb;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class wxz extends orh0<Message> {

    /* JADX INFO: renamed from: m */
    public orh0<Message>.a f25492m;

    /* JADX INFO: renamed from: n */
    public orh0<Message>.a f25493n;

    /* JADX INFO: renamed from: o */
    public Filter<Message> f25494o;

    public wxz(b8c b8cVar, String str, mrf0<Message> mrf0Var, List<Index> list, int i) {
        super(b8cVar, str, mrf0Var, list, i);
        StringColumn stringColumn = Message.OWNER;
        Filter filterAND = Filter.AND(new Filter[]{stringColumn.NEQ(CoreModule.m1850H().userId()), stringColumn.REQ("1")});
        DoubleColumn doubleColumn = Message.CREATEDTIME;
        this.f25492m = new orh0.a(this, "receivedUserMessages", filterAND, ((OrderedColumn) doubleColumn).DESC, 50, 30);
        TEnumColumn tEnumColumn = Message.LOCALNOTIFICATIONSTATUS;
        this.f25493n = new orh0.a(this, "sysnotif", Filter.OR(new Filter[]{tEnumColumn.EQ("pending"), tEnumColumn.EQ("ongoing")}), ((OrderedColumn) doubleColumn).DESC, 0, 50);
        Filter filterT = Message.LOCALINCONVERSATION.T();
        TEnumColumn tEnumColumn2 = Message.MESSAGETYPE;
        this.f25494o = Filter.AND(new Filter[]{filterT, tEnumColumn2.NEQ("tantan_verify_toast"), tEnumColumn2.NEQ("live_vip_greet"), tEnumColumn2.NEQ("local_tickle_tip"), tEnumColumn2.NEQ("soul_test_guide"), tEnumColumn2.NEQ("soul_match_invite_upload_profile"), tEnumColumn2.NEQ("local_soul_match_like"), tEnumColumn2.NEQ("local_soul_match_profile_limit"), tEnumColumn2.NEQ("liaoliao"), tEnumColumn2.NEQ("local_soul_match_tags"), tEnumColumn2.NEQ("local_friend_comment_toast"), tEnumColumn2.NEQ("local_birthday_tip"), tEnumColumn2.NEQ("local_chat_assistant_question_new"), tEnumColumn2.NEQ("local_heart_beat_lock_tip"), tEnumColumn2.NEQ("local_platinum_pin_guide"), tEnumColumn2.NEQ("local_wechat_notify_guide"), tEnumColumn2.NEQ("common_tip"), tEnumColumn2.NEQ("local_long_time_no_see"), tEnumColumn2.NEQ("wanwan_tip"), tEnumColumn2.NEQ("local_visitor_hide_footprint"), tEnumColumn2.NEQ("local_ux_questionnaire"), tEnumColumn2.NEQ("local_ux_questionnaire_tip"), tEnumColumn2.NEQ("local_o_diamond_visitor_guide")});
    }

    /* JADX INFO: renamed from: A0 */
    public void m26878A0(NotificationStatus notificationStatus, NotificationStatus notificationStatus2, String str) {
        TEnumColumn tEnumColumn = Message.LOCALNOTIFICATIONSTATUS;
        update(vwb.f0(new j760[]{vwb.Y(tEnumColumn, notificationStatus2)}), Filter.AND(new Filter[]{Message.HOSTID.EQ(str), Message.CHANNEL.EQ("group"), tEnumColumn.EQ(notificationStatus.toString())}));
    }

    /* JADX INFO: renamed from: F */
    public List<Message> m26879F(String str, double d) {
        Filter filterEQ = Message.CID.EQ(str);
        DoubleColumn doubleColumn = Message.CREATEDTIME;
        return query(Filter.AND(new Filter[]{filterEQ, doubleColumn.REQ(Double.valueOf(d)), doubleColumn.NEQ(Double.valueOf(d))}), ((OrderedColumn) doubleColumn).DESC, 10);
    }

    /* JADX INFO: renamed from: G */
    public List<Message> m26880G(String str, String str2) {
        return query(Filter.AND(new Filter[]{Message.CID.EQ(str), Message.ID.NOT_STARTS_WITH("fake_id_"), Message.OWNER.EQ(str2)}), ((OrderedColumn) Message.CREATEDTIME).DESC, 1);
    }

    /* JADX INFO: renamed from: H */
    public void m26881H(String str, double d) {
        StringColumn stringColumn = Message.CID;
        Filter filterEQ = stringColumn.EQ(str);
        DoubleColumn doubleColumn = Message.CREATEDTIME;
        Filter filterLEQ = doubleColumn.LEQ(Double.valueOf(d));
        StringColumn stringColumn2 = Message.MOMENT;
        Filter filterNULL = stringColumn2.NULL();
        StringColumn stringColumn3 = Message.ID;
        Filter filterNOT_STARTS_WITH = stringColumn3.NOT_STARTS_WITH("fake_id_");
        IntegerColumn integerColumn = Message.LOCALCREATEDSESSION;
        tpd0 tpd0Var = App.i;
        delete(Filter.AND(new Filter[]{filterEQ, filterLEQ, filterNULL, Filter.OR(new Filter[]{filterNOT_STARTS_WITH, integerColumn.LEQ((Integer) tpd0Var.get())})}));
        update(vwb.f0(new j760[]{vwb.Y(Message.LOCALINCONVERSATION, Boolean.FALSE), vwb.Y(Message.LOCALNOTIFICATIONSTATUS, NotificationStatus.get("removed"))}), Filter.AND(new Filter[]{stringColumn.EQ(str), doubleColumn.LEQ(Double.valueOf(d)), stringColumn2.NOT_NULL(), Filter.OR(new Filter[]{stringColumn3.NOT_STARTS_WITH("fake_id_"), integerColumn.LEQ((Integer) tpd0Var.get())})}));
    }

    /* JADX INFO: renamed from: I */
    public orh0<Message>.a m26882I(String str) {
        return new orh0.a(this, "comments/" + str, Filter.AND(new Filter[]{Message.LOCALINMOMENT.T(), Message.MOMENT.EQ(str)}), ((OrderedColumn) Message.CREATEDTIME).DESC, 0, 100);
    }

    /* JADX INFO: renamed from: J */
    public void m26883J(String str) {
        delete(Message.CID.EQ(str));
    }

    /* JADX INFO: renamed from: K */
    public orh0<Message>.a m26884K() {
        return new orh0.a(this, "firsttextMessages", Filter.AND(new Filter[]{Message.MESSAGETYPE.EQ("text")}), ((OrderedColumn) Message.CREATEDTIME).DESC, 1, 20);
    }

    /* JADX INFO: renamed from: L */
    public orh0<Message>.a m26885L(String str) {
        return new orh0.a(this, str, Message.ID.EQ(str), ((OrderedColumn) Message.CREATEDTIME).DESC, 1, 100);
    }

    /* JADX INFO: renamed from: M */
    public orh0<Message>.a m26886M(String str, String str2) {
        return new orh0.a(this, "greetMessagesSent/" + str2, Filter.AND(new Filter[]{Message.LOCALGREETINGID.EQ(str), Message.CID.EQ(str2), Message.OWNER.EQ(CoreModule.m1850H().userId())}), ((OrderedColumn) Message.CREATEDTIME).DESC, 1, 30);
    }

    /* JADX INFO: renamed from: N */
    public orh0<Message>.a m26887N(String str) {
        String str2 = "greeting/" + str + "/messages";
        Filter filterEQ = Message.LOCALGREETINGID.EQ(str);
        TEnumColumn tEnumColumn = Message.MESSAGETYPE;
        return new orh0.a(this, str2, Filter.AND(new Filter[]{filterEQ, tEnumColumn.NEQ("local_greeting_match_success"), tEnumColumn.NEQ("local_chat_greeting_tip"), Filter.OR(new Filter[]{tEnumColumn.EQ("local_greet_send_notice"), tEnumColumn.EQ("local_greet_receive_match_tip"), tEnumColumn.EQ("local_send_agreematch_notice")})}), ((OrderedColumn) Message.CREATEDTIME).DESC, 0, 100);
    }

    /* JADX INFO: renamed from: O */
    public orh0<Message>.a m26888O(String str, String str2) {
        return new orh0.a(this, "greeting/" + str + "/greetingId" + str2 + "/clearedUntil", Filter.AND(new Filter[]{Message.LOCALGREETINGID.EQ(str), Message.ID.EQ(str2)}), ((OrderedColumn) Message.CREATEDTIME).DESC, 1, 100);
    }

    /* JADX INFO: renamed from: P */
    public orh0<Message>.a m26889P(String str, double d, long j, boolean z) {
        Filter filterEQ = j > 0 ? Message.CHANNEL.EQ("anonymous") : Filter.TRUE;
        String str2 = "greeting/" + str + "/messagesGreaterThanClearUntil" + d + "/clearUntil" + j + "/anonymous" + z;
        Filter filterEQ2 = Message.LOCALGREETINGID.EQ(str);
        TEnumColumn tEnumColumn = Message.MESSAGETYPE;
        Filter filterNEQ = tEnumColumn.NEQ("local_greeting_match_success");
        Filter filterNEQ2 = tEnumColumn.NEQ("local_chat_greeting_tip");
        if (!z) {
            filterEQ = Message.CHANNEL.NEQ("anonymous");
        }
        Filter filter = filterEQ;
        DoubleColumn doubleColumn = Message.CREATEDTIME;
        return new orh0.a(this, str2, Filter.AND(new Filter[]{filterEQ2, filterNEQ, filterNEQ2, filter, doubleColumn.REQ(Double.valueOf(d)), doubleColumn.NEQ(Double.valueOf(d))}), ((OrderedColumn) doubleColumn).DESC, 1, 100);
    }

    /* JADX INFO: renamed from: Q */
    public orh0<Message>.a m26890Q(String str) {
        String str2 = "greeting/" + str + "/messages/withoutFakeId";
        Filter filterEQ = Message.LOCALGREETINGID.EQ(str);
        StringColumn stringColumn = Message.ID;
        return new orh0.a(this, str2, Filter.AND(new Filter[]{filterEQ, stringColumn.NOT_STARTS_WITH("fake_private_question_id_"), stringColumn.NOT_STARTS_WITH("fake_id_")}), ((OrderedColumn) Message.CREATEDTIME).DESC, 1, 100);
    }

    /* JADX INFO: renamed from: R */
    public orh0<Message>.a m26891R(String str, double d, boolean z) {
        Filter filterAND = Filter.TRUE;
        if (z) {
            filterAND = Filter.AND(new Filter[]{Message.ID.NOT_STARTS_WITH("fake_id_"), this.f25494o});
        }
        String str2 = str + "/filter/intlMessageListRealShow" + d + "/" + z;
        Filter filterT = Message.LOCALINCONVERSATION.T();
        Filter filterEQ = Message.CID.EQ(str);
        DoubleColumn doubleColumn = Message.CREATEDTIME;
        return new orh0.a(this, str2, Filter.AND(new Filter[]{filterT, filterEQ, Filter.AND(new Filter[]{doubleColumn.REQ(Double.valueOf(d)), doubleColumn.NEQ(Double.valueOf(d))}), filterAND}), ((OrderedColumn) doubleColumn).DESC, 1, 100);
    }

    /* JADX INFO: renamed from: S */
    public void m26892S(String str) {
        StringColumn stringColumn = Message.MOMENT;
        j760 j760VarY = vwb.Y(stringColumn, CoreMomentInfo.LOCAL_ID_INVALID);
        BooleanColumn booleanColumn = Message.LOCALINMOMENT;
        Boolean bool = Boolean.FALSE;
        update(vwb.f0(new j760[]{j760VarY, vwb.Y(booleanColumn, bool)}), stringColumn.EQ(str));
        StringColumn stringColumn2 = Message.LIKEOFMOMENT;
        update(vwb.f0(new j760[]{vwb.Y(stringColumn2, CoreMomentInfo.LOCAL_ID_INVALID), vwb.Y(booleanColumn, bool)}), stringColumn2.EQ(str));
    }

    /* JADX INFO: renamed from: T */
    public List<Message> m26893T(String str) {
        Filter filterT = Message.LOCALINCONVERSATION.T();
        Filter filterEQ = Message.CID.EQ(str);
        TEnumColumn tEnumColumn = Message.MESSAGETYPE;
        return query(Filter.AND(new Filter[]{filterT, filterEQ, tEnumColumn.NEQ("tantan_verify_toast"), tEnumColumn.NEQ("live_vip_greet"), tEnumColumn.NEQ("local_tickle_tip"), tEnumColumn.NEQ("soul_test_guide"), tEnumColumn.NEQ("soul_match_invite_upload_profile"), tEnumColumn.NEQ("local_soul_match_like"), tEnumColumn.NEQ("local_soul_match_profile_limit"), tEnumColumn.NEQ("liaoliao"), tEnumColumn.NEQ("local_soul_match_tags"), tEnumColumn.NEQ("local_friend_comment_toast"), tEnumColumn.NEQ("wanwan_tip")}), ((OrderedColumn) Message.CREATEDTIME).DESC, 1);
    }

    /* JADX INFO: renamed from: U */
    public List<Message> m26894U(String str) {
        return query(Filter.AND(new Filter[]{Message.CID.EQ(str), this.f25494o}), ((OrderedColumn) Message.CREATEDTIME).DESC, 1);
    }

    /* JADX INFO: renamed from: V */
    public void m26895V(String str, List<String> list, boolean z) {
        BooleanColumn booleanColumn = Message.LOCALINMOMENT;
        ArrayList arrayListF0 = vwb.f0(new j760[]{vwb.Y(booleanColumn, Boolean.valueOf(z))});
        Filter filterEQ = Message.MOMENT.EQ(str);
        StringColumn stringColumn = Message.ID;
        update(arrayListF0, Filter.AND(new Filter[]{filterEQ, stringColumn.NOT_STARTS_WITH("fake_id_"), stringColumn.NOT_IN(list), booleanColumn.NEQ(Boolean.valueOf(z))}));
    }

    /* JADX INFO: renamed from: W */
    public orh0<Message>.a m26896W(String str) {
        return new orh0.a(this, str, Filter.AND(new Filter[]{Message.LOCALINCONVERSATION.T(), Message.CID.EQ(str)}), ((OrderedColumn) Message.CREATEDTIME).DESC, 1, 100);
    }

    /* JADX INFO: renamed from: X */
    public orh0<Message>.a m26897X(String str, Filter<Message> filter, String str2, double d, boolean z) {
        Filter filterAND = Filter.TRUE;
        if (!z) {
            DoubleColumn doubleColumn = Message.CREATEDTIME;
            filterAND = Filter.AND(new Filter[]{doubleColumn.REQ(Double.valueOf(d)), doubleColumn.NEQ(Double.valueOf(d))});
        }
        return new orh0.a(this, str + "/filter/" + str2, Filter.AND(new Filter[]{Message.LOCALINCONVERSATION.T(), Message.CID.EQ(str), filter, filterAND}), ((OrderedColumn) Message.CREATEDTIME).DESC, 1, 100);
    }

    /* JADX INFO: renamed from: Y */
    public orh0<Message>.a m26898Y(String str, String str2) {
        Filter filter = Filter.TRUE;
        StringColumn stringColumn = Message.ID;
        return new orh0.a(this, str + "/filter/messageId/greater/than/" + str2, Filter.AND(new Filter[]{Message.LOCALINCONVERSATION.T(), Message.CID.EQ(str), Filter.AND(new Filter[]{stringColumn.REQ(str2), stringColumn.NEQ(str2)})}), ((OrderedColumn) Message.CREATEDTIME).DESC, 1, 100);
    }

    /* JADX INFO: renamed from: Z */
    public orh0<Message>.a m26899Z(String str, double d, boolean z) {
        Filter filterAND = Filter.TRUE;
        if (!z) {
            DoubleColumn doubleColumn = Message.CREATEDTIME;
            filterAND = Filter.AND(new Filter[]{doubleColumn.REQ(Double.valueOf(d)), doubleColumn.NEQ(Double.valueOf(d))});
        }
        return new orh0.a(this, str + "/filter/messageCreatedTime/greater/than/" + d, Filter.AND(new Filter[]{Message.LOCALINCONVERSATION.T(), Message.CID.EQ(str), filterAND}), ((OrderedColumn) Message.CREATEDTIME).DESC, 1, 100);
    }

    /* JADX INFO: renamed from: a0 */
    public orh0<Message>.a m26900a0(String str) {
        String str2 = "messagesNotFakeReceivedByAsc/" + str;
        Filter filterEQ = Message.CID.EQ(str);
        Filter filterEQ2 = Message.OWNER.EQ(str);
        StringColumn stringColumn = Message.ID;
        return new orh0.a(this, str2, Filter.AND(new Filter[]{filterEQ, filterEQ2, stringColumn.NOT_STARTS_WITH("fake_id_"), stringColumn.NOT_STARTS_WITH("fake_private_question_id_"), stringColumn.NOT_STARTS_WITH("fake_conversation")}), ((OrderedColumn) Message.CREATEDTIME).ASC, 0, 30);
    }

    /* JADX INFO: renamed from: b0 */
    public orh0<Message>.a m26901b0(String str) {
        return new orh0.a(this, "messagesReceived/" + str, Filter.AND(new Filter[]{Message.CID.EQ(str), Message.OWNER.EQ(str)}), ((OrderedColumn) Message.CREATEDTIME).DESC, 1, 30);
    }

    /* JADX INFO: renamed from: c0 */
    public orh0<Message>.a m26902c0(String str) {
        return new orh0.a(this, "messagesReceivedByAsc/" + str, Filter.AND(new Filter[]{Message.CID.EQ(str), Message.OWNER.EQ(str)}), ((OrderedColumn) Message.CREATEDTIME).ASC, 0, 30);
    }

    /* JADX INFO: renamed from: d0 */
    public orh0<Message>.a m26903d0(String str) {
        return new orh0.a(this, "messagesReceivedByAsc/" + str, Filter.AND(new Filter[]{Message.CID.EQ(str), Message.OWNER.EQ(str)}), ((OrderedColumn) Message.CREATEDTIME).ASC, 0, 30);
    }

    /* JADX INFO: renamed from: e0 */
    public orh0<Message>.a m26904e0(String str) {
        return new orh0.a(this, "messagesSent/" + str, Filter.AND(new Filter[]{Message.CID.EQ(str), Message.OWNER.EQ(CoreModule.m1850H().userId())}), ((OrderedColumn) Message.CREATEDTIME).DESC, 1, 30);
    }

    /* JADX INFO: renamed from: f0 */
    public orh0<Message>.a m26905f0(String str) {
        return new orh0.a(this, "messagesSentWithoutLocal/" + str, Filter.AND(new Filter[]{Message.CID.EQ(str), Message.OWNER.EQ(CoreModule.m1850H().userId()), Message.ID.NOT_STARTS_WITH("fake_id_")}), ((OrderedColumn) Message.CREATEDTIME).DESC, 1, 30);
    }

    /* JADX INFO: renamed from: g0 */
    public orh0<Message>.a m26906g0(String str) {
        String str2 = "messagesNotFakeSuccessSentByAsc/" + str;
        Filter filterEQ = Message.CID.EQ(str);
        Filter filterEQ2 = Message.OWNER.EQ(CoreModule.m1850H().userId());
        StringColumn stringColumn = Message.ID;
        return new orh0.a(this, str2, Filter.AND(new Filter[]{filterEQ, filterEQ2, stringColumn.NOT_STARTS_WITH("fake_id_"), stringColumn.NOT_STARTS_WITH("fake_private_question_id_"), stringColumn.NOT_STARTS_WITH("fake_conversation")}), ((OrderedColumn) Message.CREATEDTIME).ASC, 0, 30);
    }

    /* JADX INFO: renamed from: h0 */
    public orh0<Message>.a m26907h0(String str) {
        return new orh0.a(this, "messagesSuccessSentByAsc/" + str, Filter.AND(new Filter[]{Message.CID.EQ(str), Message.OWNER.EQ(CoreModule.m1850H().userId()), Message.ID.NOT_STARTS_WITH("fake_id_")}), ((OrderedColumn) Message.CREATEDTIME).ASC, 0, 30);
    }

    /* JADX INFO: renamed from: i0 */
    public orh0<Message>.a m26908i0(String str) {
        return new orh0.a(this, "messagesSuccessSentByDesc/" + str, Filter.AND(new Filter[]{Message.CID.EQ(str), Message.OWNER.EQ(CoreModule.m1850H().userId()), Message.ID.NOT_STARTS_WITH("fake_id_")}), ((OrderedColumn) Message.CREATEDTIME).DESC, 0, 30);
    }

    /* JADX INFO: renamed from: j0 */
    public orh0<Message>.a m26909j0(String str) {
        return new orh0.a(this, "messagesReceived/" + str, Filter.AND(new Filter[]{Message.CID.EQ(str), Message.OWNER.EQ(str)}), ((OrderedColumn) Message.CREATEDTIME).ASC, 1, 30);
    }

    /* JADX INFO: renamed from: k0 */
    public orh0<Message>.a m26910k0(String str) {
        String str2 = str + "/with_media";
        Filter filterT = Message.LOCALINCONVERSATION.T();
        Filter filterEQ = Message.CID.EQ(str);
        Filter filterNOT_NULL = Message.MEDIA.NOT_NULL();
        TEnumColumn tEnumColumn = Message.MESSAGETYPE;
        return new orh0.a(this, str2, Filter.AND(new Filter[]{filterT, filterEQ, filterNOT_NULL, tEnumColumn.NEQ("exchange_picture"), tEnumColumn.NEQ("limit_time_picture")}), ((OrderedColumn) Message.CREATEDTIME).DESC, 0, AccountMakeUpMenuView.MakeupCategory.TYPE_MAKEUP_BEAUTYAUTO);
    }

    /* JADX INFO: renamed from: l0 */
    public orh0<Message>.a m26911l0(String str) {
        String str2 = "message/withoutfake/" + str;
        Filter filterT = Message.LOCALINCONVERSATION.T();
        Filter filterEQ = Message.CID.EQ(str);
        StringColumn stringColumn = Message.ID;
        return new orh0.a(this, str2, Filter.AND(new Filter[]{filterT, filterEQ, stringColumn.NOT_STARTS_WITH("fake_private_question_id_"), stringColumn.NOT_STARTS_WITH("fake_id_")}), ((OrderedColumn) Message.CREATEDTIME).DESC, 1, 100);
    }

    /* JADX INFO: renamed from: m0 */
    public orh0<Message>.a m26912m0(String str) {
        String str2 = "message/withoutfakeorother/" + str;
        Filter filterT = Message.LOCALINCONVERSATION.T();
        Filter filterEQ = Message.CID.EQ(str);
        Filter filterEQ2 = Message.OWNER.EQ(CoreModule.m1850H().userId());
        StringColumn stringColumn = Message.ID;
        return new orh0.a(this, str2, Filter.AND(new Filter[]{filterT, filterEQ, filterEQ2, stringColumn.NOT_STARTS_WITH("fake_private_question_id_"), stringColumn.NOT_STARTS_WITH("fake_id_")}), ((OrderedColumn) Message.CREATEDTIME).DESC, 1, 100);
    }

    /* JADX INFO: renamed from: n0 */
    public List<Message> m26913n0(String str, int i) {
        if (i > 20) {
            i = 20;
        }
        if (i < 1) {
            i = 1;
        }
        Filter filterT = Message.LOCALINCONVERSATION.T();
        Filter filterEQ = Message.CID.EQ(str);
        StringColumn stringColumn = Message.ID;
        return query(Filter.AND(new Filter[]{filterT, filterEQ, stringColumn.NOT_STARTS_WITH("fake_"), stringColumn.NOT_STARTS_WITH("local_"), this.f25494o}), ((OrderedColumn) Message.CREATEDTIME).DESC, i);
    }

    /* JADX INFO: renamed from: o0 */
    public List<Message> m26914o0(String str, String str2) {
        return query(Filter.AND(new Filter[]{Message.LOCALINCONVERSATION.T(), Message.CID.EQ(str), Message.MESSAGETYPE.EQ(str2)}), ((OrderedColumn) Message.CREATEDTIME).DESC, 1);
    }

    /* JADX INFO: renamed from: p0 */
    public orh0<Message>.a m26915p0(String str, double d, String str2) {
        String str3 = "message/queryMessageByType/" + str + "/" + d + '/' + str2;
        Filter filterT = Message.LOCALINCONVERSATION.T();
        Filter filterEQ = Message.CID.EQ(str);
        Filter filterEQ2 = Message.MESSAGETYPE.EQ(str2);
        DoubleColumn doubleColumn = Message.CREATEDTIME;
        return new orh0.a(this, str3, Filter.AND(new Filter[]{filterT, filterEQ, filterEQ2, Filter.AND(new Filter[]{doubleColumn.REQ(Double.valueOf(d)), doubleColumn.NEQ(Double.valueOf(d))})}), ((OrderedColumn) doubleColumn).DESC, 1, 100);
    }

    /* JADX INFO: renamed from: q0 */
    public orh0<Message>.a m26916q0(String str, String str2) {
        return new orh0.a(this, "message/queryMessageByType/" + str + "/" + str2, Filter.AND(new Filter[]{Message.LOCALINCONVERSATION.T(), Message.CID.EQ(str), Message.MESSAGETYPE.EQ(str2)}), ((OrderedColumn) Message.CREATEDTIME).DESC, 1, 100);
    }

    /* JADX INFO: renamed from: r0 */
    public orh0<Message>.a m26917r0(String str, String str2) {
        return new orh0.a(this, "message_type_query_" + str + str2, Filter.AND(new Filter[]{Message.CID.EQ(str), Message.MESSAGETYPE.EQ(str2)}), ((OrderedColumn) Message.CREATEDTIME).DESC, 0, 100);
    }

    /* JADX INFO: renamed from: s0 */
    public orh0<Message>.a m26918s0(String str) {
        return new orh0.a(this, "recentReplyMessage" + str, Filter.AND(new Filter[]{Message.CID.EQ(str), Message.OWNER.NEQ(CoreModule.m1850H().userId())}), ((OrderedColumn) Message.CREATEDTIME).DESC, 0, 100);
    }

    /* JADX INFO: renamed from: t0 */
    public orh0<Message>.a m26919t0(String str, String str2, int i) {
        return new orh0.a(this, "specifyCountMessages" + str + "-" + str2, Filter.AND(new Filter[]{Message.CID.EQ(str), Message.ID.NOT_STARTS_WITH("fake_id_"), Message.OWNER.EQ(str2)}), ((OrderedColumn) Message.CREATEDTIME).DESC, 0, i);
    }

    /* JADX INFO: renamed from: u0 */
    public void m26920u0(NotificationStatus notificationStatus, NotificationStatus notificationStatus2, String str) {
        TEnumColumn tEnumColumn = Message.LOCALNOTIFICATIONSTATUS;
        update(vwb.f0(new j760[]{vwb.Y(tEnumColumn, notificationStatus2)}), Filter.AND(new Filter[]{Message.LOCALGREETINGID.EQ(str), tEnumColumn.EQ(notificationStatus.toString())}));
    }

    /* JADX INFO: renamed from: v0 */
    public int m26921v0(String str) {
        TEnumColumn tEnumColumn = Message.LOCALNOTIFICATIONSTATUS;
        return count(Filter.AND(new Filter[]{Filter.OR(new Filter[]{tEnumColumn.EQ("pending"), tEnumColumn.EQ("ongoing")}), Message.OWNER.EQ(str)}), -1);
    }

    /* JADX INFO: renamed from: w0 */
    public List<Message> m26922w0() {
        TEnumColumn tEnumColumn = Message.LOCALNOTIFICATIONSTATUS;
        return query(Filter.OR(new Filter[]{tEnumColumn.EQ("pending"), tEnumColumn.EQ("ongoing")}), ((OrderedColumn) Message.CREATEDTIME).DESC, AccountMakeUpMenuView.MakeupCategory.TYPE_MAKEUP_BEAUTYAUTO);
    }

    /* JADX INFO: renamed from: x0 */
    public int m26923x0(String str) {
        Filter filterAND;
        if (ura.m25555e().m25559d().m5739b()) {
            filterAND = Message.OWNER.NEQ(str);
        } else {
            StringColumn stringColumn = Message.OWNER;
            filterAND = Filter.AND(new Filter[]{stringColumn.NEQ(str), stringColumn.NEQ("-11000"), stringColumn.NEQ("-11001")});
        }
        TEnumColumn tEnumColumn = Message.LOCALNOTIFICATIONSTATUS;
        return count(Filter.AND(new Filter[]{Filter.OR(new Filter[]{tEnumColumn.EQ("pending"), tEnumColumn.EQ("ongoing")}), filterAND}), -1);
    }

    /* JADX INFO: renamed from: y0 */
    public void m26924y0(NotificationStatus notificationStatus, NotificationStatus notificationStatus2) {
        TEnumColumn tEnumColumn = Message.LOCALNOTIFICATIONSTATUS;
        update(vwb.f0(new j760[]{vwb.Y(tEnumColumn, notificationStatus2)}), tEnumColumn.EQ(notificationStatus.toString()));
    }

    /* JADX INFO: renamed from: z0 */
    public void m26925z0(NotificationStatus notificationStatus, NotificationStatus notificationStatus2, String str) {
        TEnumColumn tEnumColumn = Message.LOCALNOTIFICATIONSTATUS;
        update(vwb.f0(new j760[]{vwb.Y(tEnumColumn, notificationStatus2)}), Filter.AND(new Filter[]{Message.OWNER.EQ(str), tEnumColumn.EQ(notificationStatus.toString())}));
    }
}
