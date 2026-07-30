package p009l;

import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.annotation.Nullable;
import com.p000p1.mobile.putong.core.newui.messages.ConversationItemView;
import com.p000p1.mobile.putong.core.newui.messages.ConversationsList;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.android.app.App;
import com.p1.mobile.putong.ab.IntlCountryCodeController;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.R;
import com.p1.mobile.putong.core.api.c0;
import com.p1.mobile.putong.core.api.g;
import com.p1.mobile.putong.core.data.ChatGroup;
import com.p1.mobile.putong.core.data.ChatHeat;
import com.p1.mobile.putong.core.data.ChatRoundsDisplayedExternallyConfig;
import com.p1.mobile.putong.core.data.Conversation;
import com.p1.mobile.putong.core.data.ExchangePicture;
import com.p1.mobile.putong.core.data.Message;
import com.p1.mobile.putong.core.data.OptiMVParams;
import com.p1.mobile.putong.core.data.PlatinumPinChat;
import com.p1.mobile.putong.core.data.SwitchConvNextConfig;
import com.p1.mobile.putong.data.Picture;
import com.p1.mobile.putong.data.User;
import com.p1.mobile.putong.data.UserLiveLabel;
import com.p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.data.DbObject;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;
import l.dml;
import l.e30;
import l.e51;
import l.f6c0;
import l.i36;
import l.j760;
import l.mkd0;
import l.o6j0;
import l.osi0;
import l.qp8;
import l.sw6;
import l.t0g0;
import l.t100;
import l.tpd0;
import l.u59;
import l.upa;
import l.ura;
import l.vwb;
import l.w0c0;
import l.w9j;
import l.x2c0;
import l.xdl0;
import org.json.JSONObject;
import rx.c;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public interface rd6 {
    /* JADX INFO: renamed from: B0 */
    static /* synthetic */ Boolean m21504B0(SwitchConvNextConfig switchConvNextConfig, Conversation conversation) {
        List listUm = CoreModule.c.f0.Um(((DbObject) conversation).id);
        if (vwb.J(listUm)) {
            return Boolean.FALSE;
        }
        boolean z = false;
        double dM18550o = mqi0.m18550o() - ((Message) listUm.get(0)).createdTime;
        if (dM18550o < TimeUnit.HOURS.toMillis(switchConvNextConfig.exp_limit_hours) && dM18550o > 0.0d) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    /* JADX INFO: renamed from: C0 */
    static boolean m21506C0(Conversation conversation) {
        if (u59.T() || upa.I2()) {
            return TextUtils.equals(((DbObject) conversation).id, "fake_conversation_greeting") || TextUtils.equals(((DbObject) conversation).id, "fake_conversation_anonymous_greeting");
        }
        return false;
    }

    /* JADX INFO: renamed from: G */
    static View m21507G(Act act, ViewGroup viewGroup) {
        return act.inflater().inflate(f6c0.D1, viewGroup, false);
    }

    /* JADX INFO: renamed from: N */
    static /* synthetic */ Boolean m21509N(Conversation conversation) {
        List listUm = CoreModule.c.f0.Um(((DbObject) conversation).id);
        if (vwb.J(listUm)) {
            return Boolean.FALSE;
        }
        boolean z = false;
        Message message = (Message) listUm.get(0);
        boolean z2 = TEnum.equals(message.messageType, "default") || TEnum.equals(message.messageType, "text") || TEnum.equals(message.messageType, "video") || TEnum.equals(message.messageType, "audio") || TEnum.equals(message.messageType, "picture");
        double dM18550o = mqi0.m18550o() - message.createdTime;
        boolean z3 = dM18550o < 2.592E8d && dM18550o > 0.0d;
        boolean zEquals = TextUtils.equals(message.owner, CoreModule.H().userId());
        if (z2 && z3 && !zEquals) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    /* JADX INFO: renamed from: Z */
    static View m21511Z(Act act, ViewGroup viewGroup, boolean z) {
        if (act == null || viewGroup == null) {
            return new View(act);
        }
        return act.inflater().inflate(z ? f6c0.E1 : f6c0.fe, viewGroup, false);
    }

    /* JADX INFO: renamed from: a */
    static View m21512a(Act act, ViewGroup viewGroup) {
        return m21511Z(act, viewGroup, false);
    }

    /* JADX INFO: renamed from: e0 */
    static void m21514e0(TextView textView) {
        textView.setTextSize(14.0f);
        textView.setTextColor(pi6.f18604T);
    }

    /* JADX INFO: renamed from: f0 */
    static /* synthetic */ Boolean m21515f0(SwitchConvNextConfig switchConvNextConfig, Conversation conversation) {
        List listUm = CoreModule.c.f0.Um(((DbObject) conversation).id);
        if (vwb.J(listUm)) {
            return Boolean.FALSE;
        }
        boolean z = false;
        double dM18550o = mqi0.m18550o() - ((Message) listUm.get(0)).createdTime;
        if (dM18550o < TimeUnit.HOURS.toMillis(switchConvNextConfig.exp_limit_hours) && dM18550o > 0.0d) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    /* JADX INFO: renamed from: j0 */
    static /* synthetic */ Boolean m21517j0(Conversation conversation) {
        if (NullChecker.a(conversation) && TextUtils.isEmpty(((DbObject) conversation).id)) {
            d36.m12990c().m12998i(conversation);
        }
        return Boolean.valueOf(NullChecker.a(conversation) && !TextUtils.isEmpty(((DbObject) conversation).id));
    }

    /* JADX INFO: renamed from: k0 */
    static void m21518k0(TextView textView, TextView textView2) {
        textView.setTextSize(16.0f);
        textView.setTextColor(-16777216);
        textView2.setTextSize(12.0f);
        textView2.setTextColor(pi6.f18603S);
    }

    /* JADX INFO: renamed from: o */
    static boolean m21519o(Conversation conversation) {
        return (conversation == null || !conversation.isFakeOneSideConv() || CoreModule.c.e0.p9().isSVIP() || conversation.mm > 0 || conversation.isOtherStatusInvalid()) ? false : true;
    }

    /* JADX INFO: renamed from: q0 */
    static /* synthetic */ Boolean m21520q0(Message message) {
        if (TEnum.equals(message.messageType, "common_tip") && NullChecker.a(message.extData) && !TextUtils.isEmpty(message.extData.extra) && TextUtils.equals(message.extData.extra, "pat")) {
            return Boolean.TRUE;
        }
        if (TEnum.equals(message.messageType, "chat_assistant_question") && message.isMe() && NullChecker.a(message.extData) && TextUtils.equals(message.extData.extra, "system")) {
            return Boolean.FALSE;
        }
        if (TEnum.equals(message.messageType, "common_tip_box_v2") && NullChecker.a(message.additionalData) && NullChecker.a(message.additionalData.commonTipBox) && TextUtils.equals(message.additionalData.commonTipBox.type, "verify")) {
            return Boolean.TRUE;
        }
        return Boolean.valueOf((TEnum.equals(message.messageType, "tantan_verify_toast") || TEnum.equals(message.messageType, "local_greeting_match_success") || TEnum.equals(message.messageType, "local_countdown_like_success") || TEnum.equals(message.messageType, "local_countdown_like_notify") || TEnum.equals(message.messageType, "local_chat_greeting_tip") || TEnum.equals(message.messageType, "live_vip_greet") || TEnum.equals(message.messageType, "local_tickle_tip") || TEnum.equals(message.messageType, "soul_test_guide") || TEnum.equals(message.messageType, "local_friend_comment_toast") || TEnum.equals(message.messageType, "local_real_shot_tips") || TEnum.equals(message.messageType, "local_chat_inc_temp_warn") || TEnum.equals(message.messageType, "christmas_match") || TEnum.equals(message.messageType, "local_normal_tips") || TEnum.equals(message.messageType, "local_chat_inc_temp_warn") || TEnum.equals(message.messageType, "heartbeat_notify") || TEnum.equals(message.messageType, "heartbeat_waiting_response") || TEnum.equals(message.messageType, "heartbeat_success") || TEnum.equals(message.messageType, "local_user_moment_message") || TEnum.equals(message.messageType, "local_break_ice") || TEnum.equals(message.messageType, "wanwan_tip") || TEnum.equals(message.messageType, "local_push_switch") || TEnum.equals(message.messageType, "local_push_switch_plus") || TEnum.equals(message.messageType, "local_chanllenge_tips") || TEnum.equals(message.messageType, "tag_guide") || TEnum.equals(message.messageType, "tacit_test") || TEnum.equals(message.messageType, "common_tip") || TEnum.equals(message.messageType, "local_moment_post_guide") || TEnum.equals(message.messageType, "local_love_buzz_break_ice") || TEnum.equals(message.messageType, "local_moment_post_guide") || TEnum.equals(message.messageType, "local_add_tags_guide") || TEnum.equals(message.messageType, "local_add_artwork_guide") || TEnum.equals(message.messageType, "local_send_artwork_text") || TEnum.equals(message.messageType, "local_send_tags_text") || TEnum.equals(message.messageType, "local_match_ice_break") || TEnum.equals(message.messageType, "local_chat_assistant_question_new") || TEnum.equals(message.messageType, "local_friend_active_remind_female") || TEnum.equals(message.messageType, "female_unreply_reminder") || TEnum.equals(message.messageType, "local_ai_p2p_chat_guide") || TEnum.equals(message.messageType, "local_heart_beat_lock_tip") || TEnum.equals(message.messageType, "harass_alert") || TEnum.equals(message.messageType, "continuous_chat_tip") || TEnum.equals(message.messageType, "local_birthday_tip") || TEnum.equals(message.messageType, "system_reminder") || TEnum.equals(message.messageType, "local_platinum_pin_guide") || TEnum.equals(message.messageType, "local_wechat_notify_guide") || TEnum.equals(message.messageType, "local_long_time_no_see") || TEnum.equals(message.messageType, "local_pic_cert_guide") || TEnum.equals(message.messageType, "local_blindbox_guide") || TEnum.equals(message.messageType, "local_visitor_hide_footprint") || TEnum.equals(message.messageType, "common_tip_box") || TEnum.equals(message.messageType, "local_intl_prompt_message_type") || TEnum.equals(message.messageType, "local_ux_questionnaire") || TEnum.equals(message.messageType, "local_ux_questionnaire_tip") || TEnum.equals(message.messageType, "local_ideal_enquiry") || TEnum.equals(message.messageType, "local_love_letter_guide") || TEnum.equals(message.messageType, "local_o_diamond_visitor_guide") || TEnum.equals(message.messageType, "local_invitation_for_authentication") || TEnum.equals(message.messageType, "common_tip_box_v2") || TEnum.equals(message.messageType, "mm_task") || TEnum.equals(message.messageType, "local_intl_read_receipts_guide") || TEnum.equals(message.messageType, "local_pin_chat_normal_guide")) ? false : true);
    }

    /* JADX INFO: renamed from: s0 */
    static boolean m21521s0(Conversation conversation) {
        return conversation.lowPayOneSideConv() && !conversation.read.booleanValue();
    }

    /* JADX INFO: renamed from: t */
    static Message m21522t(List<Message> list, User user) {
        w9j w9jVar = new w9j() { // from class: l.qd6
            public final Object call(Object obj) {
                return rd6.m21520q0((Message) obj);
            }
        };
        if (!NullChecker.a(list)) {
            return null;
        }
        int size = list.size();
        Iterator<Message> it = list.iterator();
        int i = -1;
        Message next = null;
        while (it.hasNext()) {
            i++;
            try {
                next = it.next();
            } catch (NoSuchElementException unused) {
                StringBuilder sb = new StringBuilder("ConversationItemView NoSuchElementException currentThread = ");
                sb.append(Thread.currentThread().getName());
                sb.append(",  userId = ");
                sb.append(NullChecker.a(user) ? ((DbObject) user).id : "null");
                sb.append(",  oldSize = ");
                sb.append(size);
                sb.append(",  currentSize = ");
                sb.append(list.size());
                sb.append(",  index = ");
                sb.append(i);
                sb.append(",  list = ");
                sb.append(list);
                CrashHelper.c(new NoSuchElementException(sb.toString()));
            }
            if (((Boolean) w9jVar.call(next)).booleanValue()) {
                return next;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: v */
    static void m21523v(final int i, View... viewArr) {
        c.from(viewArr).doOnNext(new e30() { // from class: l.id6
            public final void call(Object obj) {
                rd6.m21524v0(i, (View) obj);
            }
        }).subscribe();
    }

    /* JADX INFO: renamed from: v0 */
    static /* synthetic */ void m21524v0(int i, View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            layoutParams = new ViewGroup.LayoutParams(view.getWidth(), view.getHeight());
        }
        layoutParams.width = i;
        layoutParams.height = i;
        view.setLayoutParams(layoutParams);
    }

    /* JADX INFO: renamed from: z */
    static /* synthetic */ Boolean m21526z(Conversation conversation) {
        if (NullChecker.a(conversation) && TextUtils.isEmpty(((DbObject) conversation).id)) {
            d36.m12990c().m12998i(conversation);
        }
        return Boolean.valueOf(NullChecker.a(conversation) && !TextUtils.isEmpty(((DbObject) conversation).id));
    }

    /* JADX INFO: renamed from: A0 */
    default boolean m21527A0(Conversation conversation) {
        return NullChecker.a(conversation) && NullChecker.a(conversation.property) && NullChecker.a(conversation.property.loveScript) && "lovescript".equals(conversation.convType) && conversation.property.loveScript.expireTime != 0;
    }

    /* JADX INFO: renamed from: D */
    default boolean m21528D(pi6 pi6Var) {
        if (NullChecker.a(pi6Var) && NullChecker.a(pi6Var.f18622a)) {
            TEnum.equals(pi6Var.f18622a.status, "invisible");
        }
        return false;
    }

    /* JADX INFO: renamed from: D0 */
    default CharSequence m21529D0(String str, String str2, boolean z) {
        if (TextUtils.isEmpty(str2)) {
            return str;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        int iIndexOf = z ? str.toLowerCase().indexOf(str2.toLowerCase()) : str.indexOf(str2);
        if (iIndexOf != -1) {
            spannableStringBuilder.setSpan(new ForegroundColorSpan(App.e.getResources().getColor(w0c0.I)), iIndexOf, str2.length() + iIndexOf, 33);
        }
        return spannableStringBuilder;
    }

    /* JADX INFO: renamed from: E0 */
    default void m21530E0(pi6 pi6Var, String str, UserLiveLabel userLiveLabel) {
        o6j0.a aVarH;
        o6j0.a aVarH2;
        o6j0.a aVar;
        o6j0.a aVarH3;
        String str2;
        int iIndexOf = CoreModule.c.f0.dg(m21552V0(pi6Var.f18626e)).indexOf(pi6Var.f18622a);
        String str3 = "e_live_room_enter";
        if (!"onLive".equals(userLiveLabel.liveState) && "onVoice".equals(userLiveLabel.liveState)) {
            o6j0.a aVarH4 = o6j0.a.h("profile_user_id", userLiveLabel.userId);
            aVarH = o6j0.a.h("topic_id", userLiveLabel.voiceRoomTopicId);
            aVarH2 = o6j0.a.h("audio_card_type", "message_list");
            aVar = aVarH4;
            aVarH3 = o6j0.a.h("audio_room_type", "normal_audio");
            str3 = "e_live_audio_room_enter";
        } else {
            aVar = null;
            aVarH = null;
            aVarH2 = null;
            aVarH3 = null;
        }
        o6j0.a aVarH5 = o6j0.a.h("anchorId", userLiveLabel.anchorId);
        if (iIndexOf != -1) {
            iIndexOf++;
        }
        o6j0.a aVarF = o6j0.a.f("index", iIndexOf);
        o6j0.a aVarH6 = o6j0.a.h("liveId", userLiveLabel.liveId);
        o6j0.a aVarH7 = o6j0.a.h("liveRecommendCategory", "NA");
        if (TextUtils.equals("17", str)) {
            str2 = "fanbasegroupchat_photo";
        } else {
            str2 = m21552V0(pi6Var.f18626e) ? "match_photo" : "chat_photo";
        }
        o6j0.c(str3, "p_messages_view", new o6j0.a[]{aVarH5, aVarF, aVarH6, aVarH7, o6j0.a.h("module", str2), o6j0.a.h("right_recommend_type", "NA"), o6j0.a.h("show_label", userLiveLabel.iconTitle), o6j0.a.h("trace_id", ""), o6j0.a.h("live_status", "on"), o6j0.a.h("window_type", "null"), o6j0.a.h("live_room_live_type", m21556Y0(userLiveLabel)), aVar, aVarH, aVarH2, aVarH3});
    }

    /* JADX INFO: renamed from: F */
    default void m21531F(Act act, final String str, p36 p36Var, final c0.c cVar) {
        if (upa.H3()) {
            CoreModule.c.t1.u("exclusive_tag_" + str);
            p36Var.c(act, CoreModule.c.M1.s3(str).distinctUntilChanged().map(new w9j() { // from class: l.gd6
                public final Object call(Object obj) {
                    return j760.a((ChatHeat) obj, "");
                }
            })).subscribe(mkd0.G(new e30() { // from class: l.hd6
                public final void call(Object obj) {
                    this.f13978a.m21565g0(str, cVar, (j760) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: H */
    default boolean m21532H(pi6 pi6Var, boolean z) {
        String strM21541O0;
        if (pi6Var.f18622a == null || pi6Var.f18623b == null) {
            return false;
        }
        boolean zM21552V0 = m21552V0(pi6Var.f18626e);
        if (upa.a2()) {
            UserLiveLabel userLiveLabelM21558a0 = m21558a0(pi6Var, zM21552V0);
            strM21541O0 = (qp8.b() && upa.a2() && !z && TEnum.equals(pi6Var.f18622a.status, "default") && userLiveLabelM21558a0 != null) ? m21542P0(pi6Var, userLiveLabelM21558a0) : "";
        } else {
            strM21541O0 = m21541O0(pi6Var, z, zM21552V0);
        }
        return !TextUtils.isEmpty(strM21541O0);
    }

    /* JADX INFO: renamed from: H0 */
    default String m21533H0(int i) {
        if (!IntlCountryCodeController.f()) {
            if (i >= 1000) {
                return i < 10000 ? CoreModule.b.getString(R.string.K1, i0g0.f14350b.format(i / 1000.0f)) : CoreModule.b.getString(R.string.K1, i0g0.f14351c.format(i / 1000.0f));
            }
            return "1" + CoreModule.b.getString(R.string.Xg);
        }
        double d = ((double) i) * 3.28083993d;
        if (d < 1000.0d) {
            return "1 " + CoreModule.b.getString(R.string.Pi);
        }
        double d2 = d * 1.8939E-4d;
        if (d2 >= 2.0d) {
            return CoreModule.b.getString(R.string.L1, i0g0.f14351c.format(d2));
        }
        if (d2 == 1.0d) {
            return i0g0.f14351c.format(d2) + " " + CoreModule.b.getString(R.string.Pi);
        }
        if (d2 > 1.0d) {
            return CoreModule.b.getString(R.string.L1, i0g0.f14350b.format(d2));
        }
        return "1 " + CoreModule.b.getString(R.string.Pi);
    }

    /* JADX INFO: renamed from: I */
    default void m21534I(pi6 pi6Var, TextView textView, boolean z, boolean z2) {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) textView.getLayoutParams();
        if (z) {
            int i = t100.j;
            layoutParams.width = i;
            layoutParams.height = i;
            layoutParams.topMargin = t100.a;
            textView.setMinWidth(i);
            textView.setText("");
            textView.setBackgroundResource(x2c0.X5);
            textView.setLayoutParams(layoutParams);
            xdl0.M(textView, true);
            return;
        }
        if (z2) {
            layoutParams.width = -2;
            int i2 = t100.q;
            layoutParams.height = i2;
            layoutParams.topMargin = -t100.e;
            textView.setMinWidth(i2);
            Conversation conversation = pi6Var.f18622a;
            textView.setText(t0g0.f(conversation.unreadMessages + m21539M(conversation)));
            if (ura.e().d().sa()) {
                CoreModule.c.f0.Me().V.filter(pi6Var.f18622a);
            }
            textView.setBackgroundResource(x2c0.U5);
            textView.setLayoutParams(layoutParams);
            xdl0.M(textView, true);
        }
    }

    /* JADX INFO: renamed from: I0 */
    default String m21535I0(User user, Conversation conversation) {
        String str = "";
        if (!CoreModule.c.f0.bo(user, conversation)) {
            return "";
        }
        String string = conversation.additional.tag.type.toString();
        string.getClass();
        switch (string) {
            case "oneside":
                if (!CoreModule.c.N0.j3(user)) {
                    str = "等你回应";
                    break;
                }
                break;
            case "birthday":
                str = String.format("%s今天生日", user.isFemale() ? "她" : "他");
                break;
            case "newuser":
                if (!CoreModule.c.N0.j3(user)) {
                    str = "初来乍到";
                    break;
                }
                break;
        }
        if (!TextUtils.isEmpty(str)) {
            CoreModule.c.f0.k2.add(((DbObject) user).id);
        }
        return str;
    }

    /* JADX INFO: renamed from: J0 */
    default void m21536J0(String str, long j, long j2, c0.c cVar) {
        c0.a aVar = new c0.a();
        aVar.g("exclusive_tag_" + str).d(cVar).b(true).h(1L).c(j).f(j2);
        CoreModule.c.t1.r(aVar);
    }

    /* JADX INFO: renamed from: K */
    /* synthetic */ default void m21537K(pi6 pi6Var) {
        if (upa.Q2()) {
            m21551V(pi6Var);
        } else if (upa.R2()) {
            m21544R(pi6Var);
        }
    }

    /* JADX INFO: renamed from: L0 */
    default boolean m21538L0(pi6 pi6Var, Message message) {
        return false;
    }

    /* JADX INFO: renamed from: M */
    default int m21539M(Conversation conversation) {
        return m21549T0(conversation) ? 1 : 0;
    }

    /* JADX INFO: renamed from: N0 */
    default Picture.ImageUri m21540N0(User user) {
        return sw6.b(user).profileSmall();
    }

    /* JADX INFO: renamed from: O0 */
    default String m21541O0(pi6 pi6Var, boolean z, boolean z2) {
        UserLiveLabel userLiveLabel = getUserLiveLabelHashMap().get(((DbObject) pi6Var.f18623b).id);
        if (qp8.b() && z2 && !z && TEnum.equals(pi6Var.f18622a.status, "default") && NullChecker.a(userLiveLabel)) {
            if (userLiveLabel.ongoingCall) {
                return TextUtils.isEmpty(userLiveLabel.iconTitle) ? "多人连线" : userLiveLabel.iconTitle;
            }
            if (userLiveLabel.isMultiCallGoing()) {
                return TextUtils.isEmpty(userLiveLabel.iconTitle) ? pi6Var.f18645x.getString(R.string.eh) : userLiveLabel.iconTitle;
            }
        }
        return "";
    }

    /* JADX INFO: renamed from: P0 */
    default String m21542P0(pi6 pi6Var, UserLiveLabel userLiveLabel) {
        if (userLiveLabel.ongoingCall) {
            return TextUtils.isEmpty(userLiveLabel.iconTitle) ? "多人连线" : userLiveLabel.iconTitle;
        }
        boolean zIsMultiCallGoing = userLiveLabel.isMultiCallGoing();
        String str = userLiveLabel.iconTitle;
        if (zIsMultiCallGoing) {
            return TextUtils.isEmpty(str) ? pi6Var.f18645x.getString(R.string.eh) : userLiveLabel.iconTitle;
        }
        return TextUtils.isEmpty(str) ? CoreModule.Q().getLiveCardText() : userLiveLabel.iconTitle;
    }

    /* JADX INFO: renamed from: Q */
    default void m21543Q(pi6 pi6Var, UserLiveLabel userLiveLabel) {
        m21530E0(pi6Var, "", userLiveLabel);
    }

    /* JADX INFO: renamed from: R */
    default void m21544R(pi6 pi6Var) {
        Conversation conversation = pi6Var.f18622a;
        if (conversation == null || !conversation.read.booleanValue() || conversation.unreadMessages > 0 || ((DbObject) conversation).id.startsWith("fake_conversation")) {
            return;
        }
        final SwitchConvNextConfig switchConvNextConfigH1 = upa.h1();
        if (vwb.f(vwb.n(CoreModule.c.f0.hq(), new w9j() { // from class: l.jd6
            public final Object call(Object obj) {
                return rd6.m21526z((Conversation) obj);
            }
        }), new w9j() { // from class: l.kd6
            public final Object call(Object obj) {
                return rd6.m21515f0(switchConvNextConfigH1, (Conversation) obj);
            }
        }) >= switchConvNextConfigH1.exp_limit_count) {
            return;
        }
        d36.m12990c().m12999j(vwb.Q(vwb.n(CoreModule.c.f0.Uo(), new w9j() { // from class: l.ld6
            public final Object call(Object obj) {
                return rd6.m21509N((Conversation) obj);
            }
        }), new w9j() { // from class: l.md6
            public final Object call(Object obj) {
                return ((DbObject) ((Conversation) obj)).id;
            }
        }));
        if (d36.m12990c().m12993d(((DbObject) conversation).id)) {
            d36.m12990c().f10907a.onNext(((DbObject) conversation).id);
        } else {
            d36.m12990c().m12991a();
        }
    }

    /* JADX INFO: renamed from: R0 */
    default Message m21545R0(List<Message> list, User user) {
        return m21522t(list, user);
    }

    /* JADX INFO: renamed from: S */
    default boolean m21546S(Conversation conversation) {
        return NullChecker.a(conversation) && NullChecker.a(conversation.property) && NullChecker.a(conversation.property.conversationTag) && conversation.property.conversationTag.showInList && conversation.userMessageCount == 0 && !conversation.localHasMessage;
    }

    /* JADX INFO: renamed from: S0 */
    default void m21547S0(pi6 pi6Var) {
        User user = pi6Var.f18623b;
        Conversation conversation = pi6Var.f18622a;
        if (NullChecker.a(user) && NullChecker.a(conversation)) {
            String string = (NullChecker.a(conversation) && NullChecker.a(conversation.additional) && NullChecker.a(conversation.additional.tag) && NullChecker.a(conversation.additional.tag.type) && !TEnum.equals(conversation.additional.tag.type, "unknown_")) ? conversation.additional.tag.type.toString() : "";
            OptiMVParams optiMVParamsNew_ = OptiMVParams.new_();
            optiMVParamsNew_.curUserId = ((DbObject) user).id;
            optiMVParamsNew_.name = user.name;
            optiMVParamsNew_.createTime = conversation.createdTime;
            optiMVParamsNew_.newMatchRank = (pi6Var.f18628g - pi6Var.f18629h) + "";
            optiMVParamsNew_.momentsUserId = ((DbObject) conversation).id;
            optiMVParamsNew_.is_fake = conversation.isFakeHeartbeatConv() || conversation.isFakeQuickChatConv();
            optiMVParamsNew_.isOnline = CoreModule.c.N0.j3(user) ? "1" : "0";
            optiMVParamsNew_.newMsgPageModule = m21546S(conversation) ? "0" : "1";
            optiMVParamsNew_.isOnliveAnchor = pi6Var.f18616K;
            optiMVParamsNew_.isRedDot = conversation.read.booleanValue() ? "0" : "1";
            optiMVParamsNew_.isNewMoment = "0";
            optiMVParamsNew_.otherUid = conversation.otherUser;
            optiMVParamsNew_.redDotNum = String.valueOf(conversation.unreadMessages);
            optiMVParamsNew_.messagecCellType = ll6.m17954a(conversation);
            if (!i36.g().o(((DbObject) conversation).id) || conversation.hasRemoveLabel()) {
                optiMVParamsNew_.user_tag = string;
            } else {
                optiMVParamsNew_.user_tag = "longtimenosee";
            }
            optiMVParamsNew_.day_number = pi6Var.f18618M;
            if (m21557Z0(pi6Var.f18622a) && !pi6Var.f18622a.hasRemoveLabel() && pi6Var.f18622a.unreadMessages == 0) {
                optiMVParamsNew_.chat_guide = "1," + i36.g().j(((DbObject) conversation).id, true);
            }
            if (ConversationItemView.m5062R1(conversation)) {
                optiMVParamsNew_.love_letter = "1";
            }
            optiMVParamsNew_.pairing_type = conversation.hasReSwipeConvIceBreak() ? "break_ice" : "unbreak_ice";
            optiMVParamsNew_.chat_game_show = false;
            optiMVParamsNew_.equipment_type = pi6Var.f18617L;
            optiMVParamsNew_.is_platinum_top_chat = CoreModule.P().g().b8() && conversation.isPlatinumTop();
            if (m21576q(pi6Var)) {
                optiMVParamsNew_.guide_type = "gotoreply";
            } else if (m21575p0(pi6Var.f18622a)) {
                Conversation conversation2 = pi6Var.f18622a;
                if (conversation2.unreadMessages <= 0 && (TextUtils.isEmpty(conversation2.property.conversationTag.suggestExpireTime) || (!TextUtils.isEmpty(pi6Var.f18622a.property.conversationTag.suggestExpireTime) && mqi0.m18550o() < Long.parseLong(pi6Var.f18622a.property.conversationTag.suggestExpireTime) * 1000))) {
                    if (!TextUtils.isEmpty(pi6Var.f18622a.property.conversationTag.emoji)) {
                        optiMVParamsNew_.guide_type = "emoji";
                    } else if (!TextUtils.isEmpty(pi6Var.f18622a.property.conversationTag.suggestText)) {
                        optiMVParamsNew_.guide_type = "startchat";
                    }
                }
            }
            ChatRoundsDisplayedExternallyConfig chatRoundsDisplayedExternallyConfigP = upa.P();
            if (NullChecker.a(chatRoundsDisplayedExternallyConfigP) && chatRoundsDisplayedExternallyConfigP.enabled) {
                optiMVParamsNew_.spark_level = ll6.m17958e(conversation);
                optiMVParamsNew_.message_pairs = ll6.m17957d(conversation);
                optiMVParamsNew_.is_close_friend = ll6.m17955b(conversation);
                optiMVParamsNew_.is_top_recommend = ll6.m17956c(conversation);
            }
            CoreModule.c.f0.R.m17232b(optiMVParamsNew_);
            g gVar = CoreModule.c.f0;
            gVar.R.m17235e(gVar.S, false);
        }
    }

    /* JADX INFO: renamed from: T */
    default boolean m21548T(Conversation conversation) {
        return upa.r1() && NullChecker.a(conversation) && i36.g().o(((DbObject) conversation).id);
    }

    /* JADX INFO: renamed from: T0 */
    default boolean m21549T0(Conversation conversation) {
        return i36.g().n() && NullChecker.a(conversation) && conversation.unreadMessages == 0 && m21548T(conversation);
    }

    /* JADX INFO: renamed from: U0 */
    default boolean m21550U0(pi6 pi6Var) {
        return false;
    }

    /* JADX INFO: renamed from: V */
    default void m21551V(pi6 pi6Var) {
        Conversation conversation = pi6Var.f18622a;
        if (conversation == null || conversation.read.booleanValue() || conversation.unreadMessages == 0 || ((DbObject) conversation).id.startsWith("fake_conversation")) {
            return;
        }
        final SwitchConvNextConfig switchConvNextConfigH1 = upa.h1();
        ArrayList arrayListN = vwb.n(CoreModule.c.f0.hq(), new w9j() { // from class: l.nd6
            public final Object call(Object obj) {
                return rd6.m21517j0((Conversation) obj);
            }
        });
        if (vwb.f(arrayListN, new w9j() { // from class: l.od6
            public final Object call(Object obj) {
                return rd6.m21504B0(switchConvNextConfigH1, (Conversation) obj);
            }
        }) < switchConvNextConfigH1.exp_limit_count) {
            return;
        }
        d36.m12990c().m12999j(vwb.Q(arrayListN, new w9j() { // from class: l.pd6
            public final Object call(Object obj) {
                return ((DbObject) ((Conversation) obj)).id;
            }
        }));
        if (d36.m12990c().m12993d(((DbObject) conversation).id)) {
            d36.m12990c().f10907a.onNext(((DbObject) conversation).id);
        } else {
            d36.m12990c().m12991a();
        }
    }

    /* JADX INFO: renamed from: V0 */
    default boolean m21552V0(boolean z) {
        if (upa.a2()) {
            return false;
        }
        return z;
    }

    /* JADX INFO: renamed from: W */
    default boolean m21553W(dml dmlVar) {
        return (dmlVar instanceof ConversationsList.C0294e) && ((ConversationsList.C0294e) dmlVar).m5613E();
    }

    /* JADX INFO: renamed from: X */
    default boolean m21554X(Conversation conversation) {
        if (!CoreModule.P().g().b8() || !NullChecker.a(conversation) || conversation.level != 90 || !NullChecker.a(conversation.additional) || !NullChecker.a(conversation.additional.pinChat)) {
            return false;
        }
        PlatinumPinChat platinumPinChat = conversation.additional.pinChat;
        return platinumPinChat.pin && platinumPinChat.expireTime > ((double) mqi0.m18550o());
    }

    /* JADX INFO: renamed from: Y */
    default boolean m21555Y(Conversation conversation) {
        if (NullChecker.a(conversation)) {
            return TEnum.equals(conversation.status, "removed") || TEnum.equals(conversation.status, "invisible");
        }
        return false;
    }

    /* JADX INFO: renamed from: Y0 */
    default String m21556Y0(UserLiveLabel userLiveLabel) {
        return CoreModule.Q().m9004Dr(userLiveLabel.multiCallInfo.role);
    }

    /* JADX INFO: renamed from: Z0 */
    default boolean m21557Z0(Conversation conversation) {
        return i36.g().l() && m21548T(conversation);
    }

    @Nullable
    /* JADX INFO: renamed from: a0 */
    default UserLiveLabel m21558a0(pi6 pi6Var, boolean z) {
        if (!CoreModule.c.f0.vg(z).contains(((DbObject) pi6Var.f18622a).id)) {
            return null;
        }
        if (!"group".equals(pi6Var.f18622a.convType)) {
            return m21583y(z, ((DbObject) pi6Var.f18622a).id);
        }
        UserLiveLabel userLiveLabelM21583y = m21583y(z, ((DbObject) pi6Var.f18623b).id);
        if (!NullChecker.a(userLiveLabelM21583y) || pi6Var.f18622a.otherUser.equals(userLiveLabelM21583y.groupId)) {
            return userLiveLabelM21583y;
        }
        return null;
    }

    @org.jetbrains.annotations.Nullable
    /* JADX INFO: renamed from: a1 */
    default UserLiveLabel m21559a1(pi6 pi6Var) {
        boolean zM21552V0 = m21552V0(pi6Var.f18626e);
        if (!CoreModule.c.f0.vg(zM21552V0).contains(((DbObject) pi6Var.f18622a).id)) {
            return null;
        }
        if (!"group".equals(pi6Var.f18622a.convType)) {
            return (UserLiveLabel) CoreModule.c.f0.zg(zM21552V0).get(((DbObject) pi6Var.f18622a).id);
        }
        UserLiveLabel userLiveLabel = NullChecker.a(pi6Var.f18623b) ? (UserLiveLabel) CoreModule.c.f0.zg(zM21552V0).get(((DbObject) pi6Var.f18623b).id) : null;
        if (!NullChecker.a(userLiveLabel) || pi6Var.f18622a.otherUser.equals(userLiveLabel.groupId)) {
            return userLiveLabel;
        }
        return null;
    }

    /* JADX INFO: renamed from: b */
    default void m21560b(List<cpl> list, e30<cpl> e30Var) {
        if (vwb.J(list)) {
            return;
        }
        for (int i = 0; i < list.size(); i++) {
            e30Var.call(list.get(i));
        }
    }

    /* JADX INFO: renamed from: b0 */
    default boolean m21561b0(String str, String str2) {
        long jM18550o = mqi0.m18550o();
        User userNa = CoreModule.c.e0.na();
        User userOa = CoreModule.c.e0.oa(str);
        if (!NullChecker.a(userOa)) {
            return false;
        }
        double d = userNa.createdTime;
        if (jM18550o - ((long) d) < 86400000) {
            return true;
        }
        if (jM18550o - ((long) d) <= 86400000 || jM18550o - ((long) userOa.createdTime) >= 86400000) {
            return false;
        }
        HashSet hashSet = (HashSet) CoreModule.c.e0.p3.get();
        if (((Integer) CoreModule.c.e0.r3.get()).intValue() < 2 && hashSet.size() < 2 && !hashSet.contains(str)) {
            try {
                JSONObject jSONObject = !TextUtils.isEmpty(str2) ? new JSONObject(str2) : new JSONObject();
                jSONObject.put(str, ((long) userOa.createdTime) + 86400000);
                CoreModule.c.e0.u3.put(jSONObject.toString());
                tpd0 tpd0Var = CoreModule.c.e0.r3;
                tpd0Var.put(Integer.valueOf(((Integer) tpd0Var.get()).intValue() + 1));
                hashSet.add(str);
                CoreModule.c.e0.p3.put(hashSet);
            } catch (Exception unused) {
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: c0 */
    default boolean m21562c0(pi6 pi6Var) {
        return pi6Var.f18642u && TextUtils.equals(pi6Var.f18639r, CoreModule.H().userId());
    }

    /* JADX INFO: renamed from: f */
    default boolean m21563f(Message message, User user, Conversation conversation) {
        return (!(NullChecker.a(message) && TEnum.equals(message.status(), "failed") && NullChecker.a(user) && !user.unilateralBlock()) && NullChecker.a(conversation) && conversation.unreadMessages > 0) || m21549T0(conversation);
    }

    /* JADX INFO: renamed from: g */
    default String m21564g(dml dmlVar) {
        if (!(dmlVar instanceof p36)) {
            return "";
        }
        int iMo5631o = ((p36) dmlVar).mo5631o();
        if (iMo5631o == 0) {
            return "all";
        }
        if (iMo5631o == 1) {
            return "unread";
        }
        if (iMo5631o == 2) {
            return "online";
        }
        if (iMo5631o == 4) {
            return "lifted";
        }
        if (iMo5631o == 6) {
            return "group";
        }
        if (iMo5631o != 7) {
            return iMo5631o != 8 ? "" : "hide";
        }
        return "deleted";
    }

    /* JADX INFO: renamed from: g0 */
    /* synthetic */ default void m21565g0(String str, c0.c cVar, j760 j760Var) {
        if (NullChecker.a(j760Var.a) && mqi0.m18550o() >= ((ChatHeat) j760Var.a).exclusiveChatStartTime) {
            double dM18550o = mqi0.m18550o();
            Object obj = j760Var.a;
            if (dM18550o <= ((ChatHeat) obj).exclusiveChatEndTime) {
                m21536J0(str, (long) ((ChatHeat) obj).exclusiveChatStartTime, (long) ((ChatHeat) obj).exclusiveChatEndTime, cVar);
                return;
            }
        }
        if (!NullChecker.a(j760Var.a) || mqi0.m18550o() < ((ChatHeat) j760Var.a).exclusiveChatInviteTime) {
            return;
        }
        double dM18550o2 = mqi0.m18550o();
        Object obj2 = j760Var.a;
        if (dM18550o2 > ((ChatHeat) obj2).exclusiveChatInviteExpireTime || ((long) ((ChatHeat) obj2).exclusiveChatStartTime) > 0) {
            return;
        }
        m21536J0(str, (long) ((ChatHeat) obj2).exclusiveChatInviteTime, (long) ((ChatHeat) obj2).exclusiveChatInviteExpireTime, cVar);
    }

    default HashMap<String, UserLiveLabel> getUserLiveLabelHashMap() {
        HashMap<String, UserLiveLabel> map = (HashMap) CoreModule.c.f0.B2.e();
        return map == null ? new HashMap<>() : map;
    }

    /* JADX INFO: renamed from: h */
    default void m21566h() {
        CoreModule.c.f0.He();
    }

    /* JADX INFO: renamed from: i0 */
    default boolean m21567i0(Conversation conversation) {
        return false;
    }

    /* JADX INFO: renamed from: j */
    default boolean m21568j(Conversation conversation) {
        return NullChecker.a(conversation) && conversation.isLimitMatch();
    }

    /* JADX INFO: renamed from: k */
    default void m21569k(User user) {
        if (user == null) {
            return;
        }
        if (user.isBannedNew()) {
            osi0.g("对方账号异常");
        } else if (user.isDelIn()) {
            osi0.g("我暂时离开几天~");
        } else if (user.isDelOut()) {
            osi0.g("对方已注销");
        }
    }

    /* JADX INFO: renamed from: l */
    default boolean m21570l(Conversation conversation) {
        return NullChecker.a(conversation) && NullChecker.a(conversation.property) && NullChecker.a(conversation.property.conversationTag) && conversation.property.conversationTag.showInList && conversation.userMessageCount == 1 && conversation.mm == 0;
    }

    /* JADX INFO: renamed from: n */
    default boolean m21571n(Conversation conversation) {
        return false;
    }

    /* JADX INFO: renamed from: n0 */
    default boolean m21572n0(pi6 pi6Var) {
        if (m21567i0(pi6Var.f18622a)) {
            try {
                String str = (String) CoreModule.c.e0.u3.get();
                long jOptLong = (!TextUtils.isEmpty(str) ? new JSONObject(str) : new JSONObject()).optLong(((DbObject) pi6Var.f18622a).id, 0L);
                if (m21561b0(((DbObject) pi6Var.f18622a).id, str) && jOptLong != 0 && mqi0.m18550o() < jOptLong) {
                    return true;
                }
            } catch (Exception unused) {
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: o0 */
    default boolean m21573o0(pi6 pi6Var, Message message) {
        return false;
    }

    /* JADX INFO: renamed from: p */
    default Message m21574p(pi6 pi6Var) {
        return pi6Var.m20297a();
    }

    /* JADX INFO: renamed from: p0 */
    default boolean m21575p0(Conversation conversation) {
        if (m21546S(conversation) || m21570l(conversation)) {
            return TEnum.equals(conversation.status, "default") || TEnum.equals(conversation.status, "blocked");
        }
        return false;
    }

    /* JADX INFO: renamed from: q */
    default boolean m21576q(pi6 pi6Var) {
        Message messageM21574p;
        if (!upa.G1() || User.isTeamAccount(((DbObject) pi6Var.f18622a).id) || !TextUtils.equals(pi6Var.f18622a.convType, "default") || !TEnum.equals(pi6Var.f18622a.status, "default")) {
            return false;
        }
        Conversation conversation = pi6Var.f18622a;
        return conversation.unreadMessages == 0 && conversation.mm <= upa.R() && (messageM21574p = m21574p(pi6Var)) != null && !messageM21574p.isMe() && !m21563f(messageM21574p, pi6Var.f18623b, pi6Var.f18622a) && ((double) mqi0.m18550o()) - messageM21574p.createdTime < ((double) (((long) upa.T()) * 86400000));
    }

    @Nullable
    /* JADX INFO: renamed from: r0 */
    default String m21577r0(pi6 pi6Var) {
        if (!CoreModule.c.f0.vg(m21552V0(pi6Var.f18626e)).contains(((DbObject) pi6Var.f18622a).id) || !"group".equals(pi6Var.f18622a.convType)) {
            return "";
        }
        ChatGroup chatGroupS6 = CoreModule.c.g0.s6(pi6Var.f18622a.otherUser);
        return (NullChecker.a(chatGroupS6) && !vwb.J(chatGroupS6.avatars) && NullChecker.a(((Picture) chatGroupS6.avatars.get(0)).cover())) ? ((Picture) chatGroupS6.avatars.get(0)).cover().profileSmall().formatted() : "";
    }

    /* JADX INFO: renamed from: s */
    default boolean m21578s(Message message) {
        if (message.isMe()) {
            return true;
        }
        return NullChecker.a(message.additionalData) && NullChecker.a(message.additionalData.exchangePicture) && TextUtils.equals(message.additionalData.exchangePicture.status, ExchangePicture.finished);
    }

    /* JADX INFO: renamed from: u0 */
    default boolean m21579u0(pi6 pi6Var, Message message) {
        return (!m21548T(pi6Var.f18622a) || pi6Var.f18622a.hasRemoveLabel() || d9j.m13021d().mo11180a(pi6Var, message)) ? false : true;
    }

    /* JADX INFO: renamed from: w */
    default void m21580w(pi6 pi6Var) {
        Conversation conversation;
        UserLiveLabel userLiveLabel;
        HashMap map = (HashMap) CoreModule.c.f0.B2.e();
        if (map == null || (conversation = pi6Var.f18622a) == null || (userLiveLabel = (UserLiveLabel) map.get(conversation.otherUser)) == null || !userLiveLabel.ongoingCall) {
            return;
        }
        o6j0.c("e_live_call_label", "p_messages_view", new o6j0.a[0]);
    }

    /* JADX INFO: renamed from: x */
    default boolean m21581x(pi6 pi6Var) {
        return NullChecker.a(pi6Var.f18622a.property.intl_chat_source) && "spotLight".equals(pi6Var.f18622a.property.intl_chat_source.source);
    }

    /* JADX INFO: renamed from: x0 */
    default void m21582x0(final pi6 pi6Var) {
        if (NullChecker.a(pi6Var.f18622a) && pi6Var.f18622a.isHeartbeatConv()) {
            o6j0.c("e_heart_signal_conversation", "p_messages_view", new o6j0.a[]{o6j0.a.i("is_fake", pi6Var.f18622a.isFakeHeartbeatConv()), o6j0.a.h("moments_user_id", pi6Var.f18622a.otherUser)});
        }
        if (NullChecker.a(pi6Var.f18622a) && ft4.m14580b().m14585f(pi6Var.f18622a)) {
            o6j0.c("e_answer_question_tip", "p_messages_view", new o6j0.a[0]);
        }
        if (upa.P2()) {
            d36.m12990c().m12991a();
            d36.m12990c().f10907a.onNext((Object) null);
            e51.y(new Runnable() { // from class: l.fd6
                @Override // java.lang.Runnable
                public final void run() {
                    this.f12941a.m21537K(pi6Var);
                }
            });
        }
    }

    /* JADX INFO: renamed from: y */
    default UserLiveLabel m21583y(boolean z, String str) {
        LinkedHashMap linkedHashMapZg = CoreModule.c.f0.zg(z);
        if (linkedHashMapZg == null || linkedHashMapZg.isEmpty()) {
            return null;
        }
        return (UserLiveLabel) linkedHashMapZg.get(str);
    }

    /* JADX INFO: renamed from: C */
    static void m21505C(String str) {
    }
}
