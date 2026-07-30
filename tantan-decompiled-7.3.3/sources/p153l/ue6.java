package p153l;

import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.annotation.Nullable;
import com.fasterxml.jackson.core.util.MinimalPrettyPrinter;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.android.app.App;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.R$string;
import com.p051p1.mobile.putong.core.api.C4891g;
import com.p051p1.mobile.putong.core.api.RunnableC4884c0;
import com.p051p1.mobile.putong.core.data.ChatGroup;
import com.p051p1.mobile.putong.core.data.ChatHeat;
import com.p051p1.mobile.putong.core.data.ChatRoundsDisplayedExternallyConfig;
import com.p051p1.mobile.putong.core.data.Conversation;
import com.p051p1.mobile.putong.core.data.ExchangePicture;
import com.p051p1.mobile.putong.core.data.LimitTimePictureStatus;
import com.p051p1.mobile.putong.core.data.Message;
import com.p051p1.mobile.putong.core.data.MessageType;
import com.p051p1.mobile.putong.core.data.OptiMVParams;
import com.p051p1.mobile.putong.core.data.PlatinumPinChat;
import com.p051p1.mobile.putong.core.data.SummarizedPrivilegesId;
import com.p051p1.mobile.putong.core.data.SwitchConvNextConfig;
import com.p051p1.mobile.putong.core.newui.messages.ConversationItemView;
import com.p051p1.mobile.putong.core.newui.messages.ConversationsList;
import com.p051p1.mobile.putong.data.ConversationStatus;
import com.p051p1.mobile.putong.data.OMSDialogPositon;
import com.p051p1.mobile.putong.data.Picture;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.data.UserLiveLabel;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.p051p1.mobile.putong.p054ab.IntlCountryCodeController;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import com.tencent.connect.common.Constants;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;
import p137rx.C22421c;
import tech.sud.gip.core.view.round.RoundedDrawable;

/* JADX INFO: loaded from: classes11.dex */
public interface ue6 {
    /* JADX INFO: renamed from: B0 */
    static /* synthetic */ Boolean m195657B0(SwitchConvNextConfig switchConvNextConfig, Conversation conversation) {
        List<Message> listM33831Um = CoreModule.f18264c.f20384f0.m33831Um(conversation.f56859id);
        if (jyb.m147479J(listM33831Um)) {
            return Boolean.FALSE;
        }
        boolean z = false;
        double dM174454o = pzi0.m174454o() - listM33831Um.get(0).createdTime;
        if (dM174454o < TimeUnit.HOURS.toMillis(switchConvNextConfig.exp_limit_hours) && dM174454o > FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    /* JADX INFO: renamed from: C0 */
    static boolean m195659C0(Conversation conversation) {
        if (d79.m114662U() || gra.m131580I2()) {
            return TextUtils.equals(conversation.f56859id, "fake_conversation_greeting") || TextUtils.equals(conversation.f56859id, "fake_conversation_anonymous_greeting");
        }
        return false;
    }

    /* JADX INFO: renamed from: G */
    static View m195660G(Act act, ViewGroup viewGroup) {
        return act.inflater().inflate(kec0.f125368D1, viewGroup, false);
    }

    /* JADX INFO: renamed from: N */
    static /* synthetic */ Boolean m195662N(Conversation conversation) {
        List<Message> listM33831Um = CoreModule.f18264c.f20384f0.m33831Um(conversation.f56859id);
        if (jyb.m147479J(listM33831Um)) {
            return Boolean.FALSE;
        }
        boolean z = false;
        Message message = listM33831Um.get(0);
        boolean z2 = TEnum.equals(message.messageType, "default") || TEnum.equals(message.messageType, "text") || TEnum.equals(message.messageType, "video") || TEnum.equals(message.messageType, "audio") || TEnum.equals(message.messageType, "picture");
        double dM174454o = pzi0.m174454o() - message.createdTime;
        boolean z3 = dM174454o < 2.592E8d && dM174454o > FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
        boolean zEquals = TextUtils.equals(message.owner, CoreModule.m30929H().userId());
        if (z2 && z3 && !zEquals) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    /* JADX INFO: renamed from: Z */
    static View m195664Z(Act act, ViewGroup viewGroup, boolean z) {
        if (act == null || viewGroup == null) {
            return new View(act);
        }
        return act.inflater().inflate(z ? kec0.f125385E1 : kec0.f125954me, viewGroup, false);
    }

    /* JADX INFO: renamed from: a */
    static View m195665a(Act act, ViewGroup viewGroup) {
        return m195664Z(act, viewGroup, false);
    }

    /* JADX INFO: renamed from: e0 */
    static void m195667e0(TextView textView) {
        textView.setTextSize(14.0f);
        textView.setTextColor(sj6.f168908T);
    }

    /* JADX INFO: renamed from: f0 */
    static /* synthetic */ Boolean m195668f0(SwitchConvNextConfig switchConvNextConfig, Conversation conversation) {
        List<Message> listM33831Um = CoreModule.f18264c.f20384f0.m33831Um(conversation.f56859id);
        if (jyb.m147479J(listM33831Um)) {
            return Boolean.FALSE;
        }
        boolean z = false;
        double dM174454o = pzi0.m174454o() - listM33831Um.get(0).createdTime;
        if (dM174454o < TimeUnit.HOURS.toMillis(switchConvNextConfig.exp_limit_hours) && dM174454o > FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    /* JADX INFO: renamed from: j0 */
    static /* synthetic */ Boolean m195670j0(Conversation conversation) {
        if (NullChecker.m82486a(conversation) && TextUtils.isEmpty(conversation.f56859id)) {
            i46.m138395c().m138403i(conversation);
        }
        return Boolean.valueOf(NullChecker.m82486a(conversation) && !TextUtils.isEmpty(conversation.f56859id));
    }

    /* JADX INFO: renamed from: k0 */
    static void m195671k0(TextView textView, TextView textView2) {
        textView.setTextSize(16.0f);
        textView.setTextColor(RoundedDrawable.DEFAULT_BORDER_COLOR);
        textView2.setTextSize(12.0f);
        textView2.setTextColor(sj6.f168907S);
    }

    /* JADX INFO: renamed from: o */
    static boolean m195672o(Conversation conversation) {
        return (conversation == null || !conversation.isFakeOneSideConv() || CoreModule.f18264c.f20381e0.m116600p9().isSVIP() || conversation.f21116mm > 0 || conversation.isOtherStatusInvalid()) ? false : true;
    }

    /* JADX INFO: renamed from: q0 */
    static /* synthetic */ Boolean m195673q0(Message message) {
        if (TEnum.equals(message.messageType, MessageType.common_tip) && NullChecker.m82486a(message.extData) && !TextUtils.isEmpty(message.extData.extra) && TextUtils.equals(message.extData.extra, "pat")) {
            return Boolean.TRUE;
        }
        if (TEnum.equals(message.messageType, MessageType.chat_assistant_question) && message.isMe() && NullChecker.m82486a(message.extData) && TextUtils.equals(message.extData.extra, "system")) {
            return Boolean.FALSE;
        }
        if (TEnum.equals(message.messageType, MessageType.common_tip_box_v2) && NullChecker.m82486a(message.additionalData) && NullChecker.m82486a(message.additionalData.commonTipBox) && TextUtils.equals(message.additionalData.commonTipBox.type, "verify")) {
            return Boolean.TRUE;
        }
        return Boolean.valueOf((TEnum.equals(message.messageType, "tantan_verify_toast") || TEnum.equals(message.messageType, MessageType.local_greeting_match_success) || TEnum.equals(message.messageType, MessageType.local_countdown_like_success) || TEnum.equals(message.messageType, MessageType.local_countdown_like_notify) || TEnum.equals(message.messageType, MessageType.local_chat_greeting_tip) || TEnum.equals(message.messageType, "live_vip_greet") || TEnum.equals(message.messageType, "local_tickle_tip") || TEnum.equals(message.messageType, MessageType.soul_test_guide) || TEnum.equals(message.messageType, "local_friend_comment_toast") || TEnum.equals(message.messageType, MessageType.local_real_shot_tips) || TEnum.equals(message.messageType, MessageType.local_chat_inc_temp_warn) || TEnum.equals(message.messageType, MessageType.christmas_match) || TEnum.equals(message.messageType, MessageType.local_normal_tips) || TEnum.equals(message.messageType, MessageType.local_chat_inc_temp_warn) || TEnum.equals(message.messageType, MessageType.heartbeat_notify) || TEnum.equals(message.messageType, "heartbeat_waiting_response") || TEnum.equals(message.messageType, MessageType.heartbeat_success) || TEnum.equals(message.messageType, MessageType.local_user_moment_message) || TEnum.equals(message.messageType, MessageType.local_break_ice) || TEnum.equals(message.messageType, MessageType.wanwan_tip) || TEnum.equals(message.messageType, MessageType.local_push_switch) || TEnum.equals(message.messageType, MessageType.local_push_switch_plus) || TEnum.equals(message.messageType, MessageType.local_chanllenge_tips) || TEnum.equals(message.messageType, MessageType.tag_guide) || TEnum.equals(message.messageType, "tacit_test") || TEnum.equals(message.messageType, MessageType.common_tip) || TEnum.equals(message.messageType, MessageType.local_moment_post_guide) || TEnum.equals(message.messageType, MessageType.local_love_buzz_break_ice) || TEnum.equals(message.messageType, MessageType.local_moment_post_guide) || TEnum.equals(message.messageType, MessageType.local_add_tags_guide) || TEnum.equals(message.messageType, MessageType.local_add_artwork_guide) || TEnum.equals(message.messageType, MessageType.local_send_artwork_text) || TEnum.equals(message.messageType, MessageType.local_send_tags_text) || TEnum.equals(message.messageType, MessageType.local_match_ice_break) || TEnum.equals(message.messageType, MessageType.local_chat_assistant_question_new) || TEnum.equals(message.messageType, MessageType.local_friend_active_remind_female) || TEnum.equals(message.messageType, MessageType.female_unreply_reminder) || TEnum.equals(message.messageType, MessageType.local_ai_p2p_chat_guide) || TEnum.equals(message.messageType, MessageType.local_heart_beat_lock_tip) || TEnum.equals(message.messageType, MessageType.harass_alert) || TEnum.equals(message.messageType, MessageType.continuous_chat_tip) || TEnum.equals(message.messageType, MessageType.local_birthday_tip) || TEnum.equals(message.messageType, MessageType.system_reminder) || TEnum.equals(message.messageType, MessageType.local_platinum_pin_guide) || TEnum.equals(message.messageType, MessageType.local_wechat_notify_guide) || TEnum.equals(message.messageType, MessageType.local_long_time_no_see) || TEnum.equals(message.messageType, MessageType.local_pic_cert_guide) || TEnum.equals(message.messageType, MessageType.local_blindbox_guide) || TEnum.equals(message.messageType, MessageType.local_visitor_hide_footprint) || TEnum.equals(message.messageType, MessageType.common_tip_box) || TEnum.equals(message.messageType, MessageType.local_intl_prompt_message_type) || TEnum.equals(message.messageType, MessageType.local_ux_questionnaire) || TEnum.equals(message.messageType, MessageType.local_ux_questionnaire_tip) || TEnum.equals(message.messageType, MessageType.local_ideal_enquiry) || TEnum.equals(message.messageType, MessageType.local_love_letter_guide) || TEnum.equals(message.messageType, MessageType.local_o_diamond_visitor_guide) || TEnum.equals(message.messageType, MessageType.local_invitation_for_authentication) || TEnum.equals(message.messageType, MessageType.common_tip_box_v2) || TEnum.equals(message.messageType, MessageType.mm_task) || TEnum.equals(message.messageType, MessageType.local_intl_read_receipts_guide) || TEnum.equals(message.messageType, MessageType.local_pin_chat_normal_guide)) ? false : true);
    }

    /* JADX INFO: renamed from: s0 */
    static boolean m195674s0(Conversation conversation) {
        return conversation.lowPayOneSideConv() && !conversation.read.booleanValue();
    }

    /* JADX INFO: renamed from: t */
    static Message m195675t(List<Message> list, User user) {
        qcj qcjVar = new qcj() { // from class: l.te6
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return ue6.m195673q0((Message) obj);
            }
        };
        if (!NullChecker.m82486a(list)) {
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
                sb.append(NullChecker.m82486a(user) ? user.f56859id : "null");
                sb.append(",  oldSize = ");
                sb.append(size);
                sb.append(",  currentSize = ");
                sb.append(list.size());
                sb.append(",  index = ");
                sb.append(i);
                sb.append(",  list = ");
                sb.append(list);
                CrashHelper.m82479c(new NoSuchElementException(sb.toString()));
            }
            if (((Boolean) qcjVar.call(next)).booleanValue()) {
                return next;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: v */
    static void m195676v(final int i, View... viewArr) {
        C22421c.from(viewArr).doOnNext(new y20() { // from class: l.le6
            @Override // p153l.y20
            public final void call(Object obj) {
                ue6.m195677v0(i, (View) obj);
            }
        }).subscribe();
    }

    /* JADX INFO: renamed from: v0 */
    static /* synthetic */ void m195677v0(int i, View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            layoutParams = new ViewGroup.LayoutParams(view.getWidth(), view.getHeight());
        }
        layoutParams.width = i;
        layoutParams.height = i;
        view.setLayoutParams(layoutParams);
    }

    /* JADX INFO: renamed from: z */
    static /* synthetic */ Boolean m195679z(Conversation conversation) {
        if (NullChecker.m82486a(conversation) && TextUtils.isEmpty(conversation.f56859id)) {
            i46.m138395c().m138403i(conversation);
        }
        return Boolean.valueOf(NullChecker.m82486a(conversation) && !TextUtils.isEmpty(conversation.f56859id));
    }

    /* JADX INFO: renamed from: A0 */
    default boolean m195680A0(Conversation conversation) {
        return NullChecker.m82486a(conversation) && NullChecker.m82486a(conversation.property) && NullChecker.m82486a(conversation.property.loveScript) && "lovescript".equals(conversation.convType) && conversation.property.loveScript.expireTime != 0;
    }

    /* JADX INFO: renamed from: D */
    default boolean m195681D(sj6 sj6Var) {
        if (NullChecker.m82486a(sj6Var) && NullChecker.m82486a(sj6Var.f168926a)) {
            TEnum.equals(sj6Var.f168926a.status, ConversationStatus.invisible);
        }
        return false;
    }

    /* JADX INFO: renamed from: D0 */
    default CharSequence m195682D0(String str, String str2, boolean z) {
        if (TextUtils.isEmpty(str2)) {
            return str;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        int iIndexOf = z ? str.toLowerCase().indexOf(str2.toLowerCase()) : str.indexOf(str2);
        if (iIndexOf != -1) {
            spannableStringBuilder.setSpan(new ForegroundColorSpan(App.f16088e.getResources().getColor(c9c0.f80342I)), iIndexOf, str2.length() + iIndexOf, 33);
        }
        return spannableStringBuilder;
    }

    /* JADX INFO: renamed from: E0 */
    default void m195683E0(sj6 sj6Var, String str, UserLiveLabel userLiveLabel) {
        sfj0.C20032a c20032aM185615h;
        sfj0.C20032a c20032aM185615h2;
        sfj0.C20032a c20032a;
        sfj0.C20032a c20032aM185615h3;
        String str2;
        int iIndexOf = CoreModule.f18264c.f20384f0.m33932dg(m195705V0(sj6Var.f168930e)).indexOf(sj6Var.f168926a);
        String str3 = "e_live_room_enter";
        if (!"onLive".equals(userLiveLabel.liveState) && "onVoice".equals(userLiveLabel.liveState)) {
            sfj0.C20032a c20032aM185615h4 = sfj0.C20032a.m185615h("profile_user_id", userLiveLabel.userId);
            c20032aM185615h = sfj0.C20032a.m185615h("topic_id", userLiveLabel.voiceRoomTopicId);
            c20032aM185615h2 = sfj0.C20032a.m185615h("audio_card_type", "message_list");
            c20032a = c20032aM185615h4;
            c20032aM185615h3 = sfj0.C20032a.m185615h("audio_room_type", "normal_audio");
            str3 = "e_live_audio_room_enter";
        } else {
            c20032a = null;
            c20032aM185615h = null;
            c20032aM185615h2 = null;
            c20032aM185615h3 = null;
        }
        sfj0.C20032a c20032aM185615h5 = sfj0.C20032a.m185615h("anchorId", userLiveLabel.anchorId);
        if (iIndexOf != -1) {
            iIndexOf++;
        }
        sfj0.C20032a c20032aM185613f = sfj0.C20032a.m185613f(FirebaseAnalytics.Param.INDEX, iIndexOf);
        sfj0.C20032a c20032aM185615h6 = sfj0.C20032a.m185615h("liveId", userLiveLabel.liveId);
        sfj0.C20032a c20032aM185615h7 = sfj0.C20032a.m185615h("liveRecommendCategory", "NA");
        if (TextUtils.equals(Constants.VIA_REPORT_TYPE_START_GROUP, str)) {
            str2 = "fanbasegroupchat_photo";
        } else {
            str2 = m195705V0(sj6Var.f168930e) ? "match_photo" : "chat_photo";
        }
        sfj0.m185596c(str3, OMSDialogPositon.p_messages_view, c20032aM185615h5, c20032aM185613f, c20032aM185615h6, c20032aM185615h7, sfj0.C20032a.m185615h("module", str2), sfj0.C20032a.m185615h("right_recommend_type", "NA"), sfj0.C20032a.m185615h("show_label", userLiveLabel.iconTitle), sfj0.C20032a.m185615h("trace_id", ""), sfj0.C20032a.m185615h("live_status", "on"), sfj0.C20032a.m185615h("window_type", "null"), sfj0.C20032a.m185615h("live_room_live_type", m195709Y0(userLiveLabel)), c20032a, c20032aM185615h, c20032aM185615h2, c20032aM185615h3);
    }

    /* JADX INFO: renamed from: F */
    default void m195684F(Act act, final String str, u46 u46Var, final RunnableC4884c0.c cVar) {
        if (gra.m131576H3()) {
            CoreModule.f18264c.f20427t1.m32519u("exclusive_tag_" + str);
            u46Var.mo68557c(act, CoreModule.f18264c.f20328M1.m111474s3(str).distinctUntilChanged().map(new qcj() { // from class: l.je6
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return pf60.m172085a((ChatHeat) obj, "");
                }
            })).subscribe(psd0.m173596G(new y20() { // from class: l.ke6
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f125300a.m195718g0(str, cVar, (pf60) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: H */
    default boolean m195685H(sj6 sj6Var, boolean z) {
        String strM195694O0;
        if (sj6Var.f168926a == null || sj6Var.f168927b == null) {
            return false;
        }
        boolean zM195705V0 = m195705V0(sj6Var.f168930e);
        if (gra.m131657a2()) {
            UserLiveLabel userLiveLabelM195711a0 = m195711a0(sj6Var, zM195705V0);
            strM195694O0 = (vq8.m202358b() && gra.m131657a2() && !z && TEnum.equals(sj6Var.f168926a.status, "default") && userLiveLabelM195711a0 != null) ? m195695P0(sj6Var, userLiveLabelM195711a0) : "";
        } else {
            strM195694O0 = m195694O0(sj6Var, z, zM195705V0);
        }
        return !TextUtils.isEmpty(strM195694O0);
    }

    /* JADX INFO: renamed from: H0 */
    default String m195686H0(int i) {
        if (!IntlCountryCodeController.m29109f()) {
            if (i >= 1000) {
                return i < 10000 ? CoreModule.f18263b.getString(R$string.f18597K1, q8g0.f156109b.format(i / 1000.0f)) : CoreModule.f18263b.getString(R$string.f18597K1, q8g0.f156110c.format(i / 1000.0f));
            }
            return "1" + CoreModule.f18263b.getString(R$string.f19649sh);
        }
        double d = ((double) i) * 3.28083993d;
        if (d < 1000.0d) {
            return "1 " + CoreModule.f18263b.getString(R$string.f19434lj);
        }
        double d2 = d * 1.8939E-4d;
        if (d2 >= 2.0d) {
            return CoreModule.f18263b.getString(R$string.f18628L1, q8g0.f156110c.format(d2));
        }
        if (d2 == 1.0d) {
            return q8g0.f156110c.format(d2) + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR + CoreModule.f18263b.getString(R$string.f19434lj);
        }
        if (d2 > 1.0d) {
            return CoreModule.f18263b.getString(R$string.f18628L1, q8g0.f156109b.format(d2));
        }
        return "1 " + CoreModule.f18263b.getString(R$string.f19434lj);
    }

    /* JADX INFO: renamed from: I */
    default void m195687I(sj6 sj6Var, TextView textView, boolean z, boolean z2) {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) textView.getLayoutParams();
        if (z) {
            int i = qa00.f156323j;
            layoutParams.width = i;
            layoutParams.height = i;
            layoutParams.topMargin = qa00.f156314a;
            textView.setMinWidth(i);
            textView.setText("");
            textView.setBackgroundResource(dbc0.f86750Y5);
            textView.setLayoutParams(layoutParams);
            bnl0.m105524M(textView, true);
            return;
        }
        if (z2) {
            layoutParams.width = -2;
            int i2 = qa00.f156330q;
            layoutParams.height = i2;
            layoutParams.topMargin = -qa00.f156318e;
            textView.setMinWidth(i2);
            Conversation conversation = sj6Var.f168926a;
            textView.setText(a9g0.m96571f(conversation.unreadMessages + m195692M(conversation)));
            if (gta.m132210e().m132214d().mo34923sa()) {
                CoreModule.f18264c.f20384f0.m33728Me().f137491V.filter(sj6Var.f168926a);
            }
            textView.setBackgroundResource(dbc0.f86654V5);
            textView.setLayoutParams(layoutParams);
            bnl0.m105524M(textView, true);
        }
    }

    /* JADX INFO: renamed from: I0 */
    default String m195688I0(User user, Conversation conversation) {
        String str = "";
        if (!CoreModule.f18264c.f20384f0.m33916bo(user, conversation)) {
            return "";
        }
        String string = conversation.additional.tag.type.toString();
        string.getClass();
        switch (string) {
            case "oneside":
                if (!CoreModule.f18264c.f20330N0.m32969j3(user)) {
                    str = "等你回应";
                    break;
                }
                break;
            case "birthday":
                str = String.format("%s今天生日", user.isFemale() ? "她" : "他");
                break;
            case "newuser":
                if (!CoreModule.f18264c.f20330N0.m32969j3(user)) {
                    str = "初来乍到";
                    break;
                }
                break;
        }
        if (!TextUtils.isEmpty(str)) {
            CoreModule.f18264c.f20384f0.f20693k2.add(user.f56859id);
        }
        return str;
    }

    /* JADX INFO: renamed from: J0 */
    default void m195689J0(String str, long j, long j2, RunnableC4884c0.c cVar) {
        RunnableC4884c0.a aVar = new RunnableC4884c0.a();
        aVar.m32526g("exclusive_tag_" + str).m32523d(cVar).m32521b(true).m32527h(1L).m32522c(j).m32525f(j2);
        CoreModule.f18264c.f20427t1.m32516r(aVar);
    }

    /* JADX INFO: renamed from: K */
    /* synthetic */ default void m195690K(sj6 sj6Var) {
        if (gra.m131618Q2()) {
            m195704V(sj6Var);
        } else if (gra.m131622R2()) {
            m195697R(sj6Var);
        }
    }

    /* JADX INFO: renamed from: L0 */
    default boolean m195691L0(sj6 sj6Var, Message message) {
        return false;
    }

    /* JADX INFO: renamed from: M */
    default int m195692M(Conversation conversation) {
        return m195702T0(conversation) ? 1 : 0;
    }

    /* JADX INFO: renamed from: N0 */
    default Picture.ImageUri m195693N0(User user) {
        return vx6.m203838b(user).profileSmall();
    }

    /* JADX INFO: renamed from: O0 */
    default String m195694O0(sj6 sj6Var, boolean z, boolean z2) {
        UserLiveLabel userLiveLabel = getUserLiveLabelHashMap().get(sj6Var.f168927b.f56859id);
        if (vq8.m202358b() && z2 && !z && TEnum.equals(sj6Var.f168926a.status, "default") && NullChecker.m82486a(userLiveLabel)) {
            if (userLiveLabel.ongoingCall) {
                return TextUtils.isEmpty(userLiveLabel.iconTitle) ? "多人连线" : userLiveLabel.iconTitle;
            }
            if (userLiveLabel.isMultiCallGoing()) {
                return TextUtils.isEmpty(userLiveLabel.iconTitle) ? sj6Var.f168949x.getString(R$string.f19866zh) : userLiveLabel.iconTitle;
            }
        }
        return "";
    }

    /* JADX INFO: renamed from: P0 */
    default String m195695P0(sj6 sj6Var, UserLiveLabel userLiveLabel) {
        if (userLiveLabel.ongoingCall) {
            return TextUtils.isEmpty(userLiveLabel.iconTitle) ? "多人连线" : userLiveLabel.iconTitle;
        }
        boolean zIsMultiCallGoing = userLiveLabel.isMultiCallGoing();
        String str = userLiveLabel.iconTitle;
        if (zIsMultiCallGoing) {
            return TextUtils.isEmpty(str) ? sj6Var.f168949x.getString(R$string.f19866zh) : userLiveLabel.iconTitle;
        }
        return TextUtils.isEmpty(str) ? CoreModule.m30934Q().getLiveCardText() : userLiveLabel.iconTitle;
    }

    /* JADX INFO: renamed from: Q */
    default void m195696Q(sj6 sj6Var, UserLiveLabel userLiveLabel) {
        m195683E0(sj6Var, "", userLiveLabel);
    }

    /* JADX INFO: renamed from: R */
    default void m195697R(sj6 sj6Var) {
        Conversation conversation = sj6Var.f168926a;
        if (conversation == null || !conversation.read.booleanValue() || conversation.unreadMessages > 0 || conversation.f56859id.startsWith("fake_conversation")) {
            return;
        }
        final SwitchConvNextConfig switchConvNextConfigM131690h1 = gra.m131690h1();
        if (jyb.m147506f(jyb.m147522n(CoreModule.f18264c.f20384f0.m33989hq(), new qcj() { // from class: l.me6
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return ue6.m195679z((Conversation) obj);
            }
        }), new qcj() { // from class: l.ne6
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return ue6.m195668f0(switchConvNextConfigM131690h1, (Conversation) obj);
            }
        }) >= switchConvNextConfigM131690h1.exp_limit_count) {
            return;
        }
        i46.m138395c().m138404j(jyb.m147486Q(jyb.m147522n(CoreModule.f18264c.f20384f0.m33833Uo(), new qcj() { // from class: l.oe6
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return ue6.m195662N((Conversation) obj);
            }
        }), new qcj() { // from class: l.pe6
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return ((Conversation) obj).f56859id;
            }
        }));
        if (i46.m138395c().m138398d(conversation.f56859id)) {
            i46.m138395c().f112834a.onNext(conversation.f56859id);
        } else {
            i46.m138395c().m138396a();
        }
    }

    /* JADX INFO: renamed from: R0 */
    default Message m195698R0(List<Message> list, User user) {
        return m195675t(list, user);
    }

    /* JADX INFO: renamed from: S */
    default boolean m195699S(Conversation conversation) {
        return NullChecker.m82486a(conversation) && NullChecker.m82486a(conversation.property) && NullChecker.m82486a(conversation.property.conversationTag) && conversation.property.conversationTag.showInList && conversation.userMessageCount == 0 && !conversation.localHasMessage;
    }

    /* JADX INFO: renamed from: S0 */
    default void m195700S0(sj6 sj6Var) {
        User user = sj6Var.f168927b;
        Conversation conversation = sj6Var.f168926a;
        if (NullChecker.m82486a(user) && NullChecker.m82486a(conversation)) {
            String string = (NullChecker.m82486a(conversation) && NullChecker.m82486a(conversation.additional) && NullChecker.m82486a(conversation.additional.tag) && NullChecker.m82486a(conversation.additional.tag.type) && !TEnum.equals(conversation.additional.tag.type, "unknown_")) ? conversation.additional.tag.type.toString() : "";
            OptiMVParams optiMVParamsNew_ = OptiMVParams.new_();
            optiMVParamsNew_.curUserId = user.f56859id;
            optiMVParamsNew_.name = user.name;
            optiMVParamsNew_.createTime = conversation.createdTime;
            optiMVParamsNew_.newMatchRank = (sj6Var.f168932g - sj6Var.f168933h) + "";
            optiMVParamsNew_.momentsUserId = conversation.f56859id;
            optiMVParamsNew_.is_fake = conversation.isFakeHeartbeatConv() || conversation.isFakeQuickChatConv();
            optiMVParamsNew_.isOnline = CoreModule.f18264c.f20330N0.m32969j3(user) ? "1" : "0";
            optiMVParamsNew_.newMsgPageModule = m195699S(conversation) ? "0" : "1";
            optiMVParamsNew_.isOnliveAnchor = sj6Var.f168920K;
            optiMVParamsNew_.isRedDot = conversation.read.booleanValue() ? "0" : "1";
            optiMVParamsNew_.isNewMoment = "0";
            optiMVParamsNew_.otherUid = conversation.otherUser;
            optiMVParamsNew_.redDotNum = String.valueOf(conversation.unreadMessages);
            optiMVParamsNew_.messagecCellType = om6.m168195a(conversation);
            if (!n46.m161541g().m161552o(conversation.f56859id) || conversation.hasRemoveLabel()) {
                optiMVParamsNew_.user_tag = string;
            } else {
                optiMVParamsNew_.user_tag = "longtimenosee";
            }
            optiMVParamsNew_.day_number = sj6Var.f168922M;
            if (m195710Z0(sj6Var.f168926a) && !sj6Var.f168926a.hasRemoveLabel() && sj6Var.f168926a.unreadMessages == 0) {
                optiMVParamsNew_.chat_guide = "1," + n46.m161541g().m161547j(conversation.f56859id, true);
            }
            if (ConversationItemView.m41972R1(conversation)) {
                optiMVParamsNew_.love_letter = "1";
            }
            optiMVParamsNew_.pairing_type = conversation.hasReSwipeConvIceBreak() ? "break_ice" : "unbreak_ice";
            optiMVParamsNew_.chat_game_show = false;
            optiMVParamsNew_.equipment_type = sj6Var.f168921L;
            optiMVParamsNew_.is_platinum_top_chat = CoreModule.m30933P().m143410g().mo36051b8() && conversation.isPlatinumTop();
            if (m195729q(sj6Var)) {
                optiMVParamsNew_.guide_type = "gotoreply";
            } else if (m195728p0(sj6Var.f168926a)) {
                Conversation conversation2 = sj6Var.f168926a;
                if (conversation2.unreadMessages <= 0 && (TextUtils.isEmpty(conversation2.property.conversationTag.suggestExpireTime) || (!TextUtils.isEmpty(sj6Var.f168926a.property.conversationTag.suggestExpireTime) && pzi0.m174454o() < Long.parseLong(sj6Var.f168926a.property.conversationTag.suggestExpireTime) * 1000))) {
                    if (!TextUtils.isEmpty(sj6Var.f168926a.property.conversationTag.emoji)) {
                        optiMVParamsNew_.guide_type = "emoji";
                    } else if (!TextUtils.isEmpty(sj6Var.f168926a.property.conversationTag.suggestText)) {
                        optiMVParamsNew_.guide_type = "startchat";
                    }
                }
            }
            ChatRoundsDisplayedExternallyConfig chatRoundsDisplayedExternallyConfigM131611P = gra.m131611P();
            if (NullChecker.m82486a(chatRoundsDisplayedExternallyConfigM131611P) && chatRoundsDisplayedExternallyConfigM131611P.enabled) {
                optiMVParamsNew_.spark_level = om6.m168199e(conversation);
                optiMVParamsNew_.message_pairs = om6.m168198d(conversation);
                optiMVParamsNew_.is_close_friend = om6.m168196b(conversation);
                optiMVParamsNew_.is_top_recommend = om6.m168197c(conversation);
            }
            CoreModule.f18264c.f20384f0.f20634R.m170613b(optiMVParamsNew_);
            C4891g c4891g = CoreModule.f18264c.f20384f0;
            c4891g.f20634R.m170616e(c4891g.f20637S, false);
        }
    }

    /* JADX INFO: renamed from: T */
    default boolean m195701T(Conversation conversation) {
        return gra.m131740r1() && NullChecker.m82486a(conversation) && n46.m161541g().m161552o(conversation.f56859id);
    }

    /* JADX INFO: renamed from: T0 */
    default boolean m195702T0(Conversation conversation) {
        return n46.m161541g().m161551n() && NullChecker.m82486a(conversation) && conversation.unreadMessages == 0 && m195701T(conversation);
    }

    /* JADX INFO: renamed from: U0 */
    default boolean m195703U0(sj6 sj6Var) {
        return false;
    }

    /* JADX INFO: renamed from: V */
    default void m195704V(sj6 sj6Var) {
        Conversation conversation = sj6Var.f168926a;
        if (conversation == null || conversation.read.booleanValue() || conversation.unreadMessages == 0 || conversation.f56859id.startsWith("fake_conversation")) {
            return;
        }
        final SwitchConvNextConfig switchConvNextConfigM131690h1 = gra.m131690h1();
        ArrayList arrayListM147522n = jyb.m147522n(CoreModule.f18264c.f20384f0.m33989hq(), new qcj() { // from class: l.qe6
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return ue6.m195670j0((Conversation) obj);
            }
        });
        if (jyb.m147506f(arrayListM147522n, new qcj() { // from class: l.re6
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return ue6.m195657B0(switchConvNextConfigM131690h1, (Conversation) obj);
            }
        }) < switchConvNextConfigM131690h1.exp_limit_count) {
            return;
        }
        i46.m138395c().m138404j(jyb.m147486Q(arrayListM147522n, new qcj() { // from class: l.se6
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return ((Conversation) obj).f56859id;
            }
        }));
        if (i46.m138395c().m138398d(conversation.f56859id)) {
            i46.m138395c().f112834a.onNext(conversation.f56859id);
        } else {
            i46.m138395c().m138396a();
        }
    }

    /* JADX INFO: renamed from: V0 */
    default boolean m195705V0(boolean z) {
        if (gra.m131657a2()) {
            return false;
        }
        return z;
    }

    /* JADX INFO: renamed from: W */
    default boolean m195706W(pol polVar) {
        return (polVar instanceof ConversationsList.C8281e) && ((ConversationsList.C8281e) polVar).m42517E();
    }

    /* JADX INFO: renamed from: X */
    default boolean m195707X(Conversation conversation) {
        if (!CoreModule.m30933P().m143410g().mo36051b8() || !NullChecker.m82486a(conversation) || conversation.level != 90 || !NullChecker.m82486a(conversation.additional) || !NullChecker.m82486a(conversation.additional.pinChat)) {
            return false;
        }
        PlatinumPinChat platinumPinChat = conversation.additional.pinChat;
        return platinumPinChat.pin && platinumPinChat.expireTime > ((double) pzi0.m174454o());
    }

    /* JADX INFO: renamed from: Y */
    default boolean m195708Y(Conversation conversation) {
        if (NullChecker.m82486a(conversation)) {
            return TEnum.equals(conversation.status, "removed") || TEnum.equals(conversation.status, ConversationStatus.invisible);
        }
        return false;
    }

    /* JADX INFO: renamed from: Y0 */
    default String m195709Y0(UserLiveLabel userLiveLabel) {
        return CoreModule.m30934Q().mo68397Dr(userLiveLabel.multiCallInfo.role);
    }

    /* JADX INFO: renamed from: Z0 */
    default boolean m195710Z0(Conversation conversation) {
        return n46.m161541g().m161549l() && m195701T(conversation);
    }

    @Nullable
    /* JADX INFO: renamed from: a0 */
    default UserLiveLabel m195711a0(sj6 sj6Var, boolean z) {
        if (!CoreModule.f18264c.f20384f0.m34160vg(z).contains(sj6Var.f168926a.f56859id)) {
            return null;
        }
        if (!"group".equals(sj6Var.f168926a.convType)) {
            return m195736y(z, sj6Var.f168926a.f56859id);
        }
        UserLiveLabel userLiveLabelM195736y = m195736y(z, sj6Var.f168927b.f56859id);
        if (!NullChecker.m82486a(userLiveLabelM195736y) || sj6Var.f168926a.otherUser.equals(userLiveLabelM195736y.groupId)) {
            return userLiveLabelM195736y;
        }
        return null;
    }

    @org.jetbrains.annotations.Nullable
    /* JADX INFO: renamed from: a1 */
    default UserLiveLabel m195712a1(sj6 sj6Var) {
        boolean zM195705V0 = m195705V0(sj6Var.f168930e);
        if (!CoreModule.f18264c.f20384f0.m34160vg(zM195705V0).contains(sj6Var.f168926a.f56859id)) {
            return null;
        }
        if (!"group".equals(sj6Var.f168926a.convType)) {
            return CoreModule.f18264c.f20384f0.m34210zg(zM195705V0).get(sj6Var.f168926a.f56859id);
        }
        UserLiveLabel userLiveLabel = NullChecker.m82486a(sj6Var.f168927b) ? CoreModule.f18264c.f20384f0.m34210zg(zM195705V0).get(sj6Var.f168927b.f56859id) : null;
        if (!NullChecker.m82486a(userLiveLabel) || sj6Var.f168926a.otherUser.equals(userLiveLabel.groupId)) {
            return userLiveLabel;
        }
        return null;
    }

    /* JADX INFO: renamed from: b */
    default void m195713b(List<orl> list, y20<orl> y20Var) {
        if (jyb.m147479J(list)) {
            return;
        }
        for (int i = 0; i < list.size(); i++) {
            y20Var.call(list.get(i));
        }
    }

    /* JADX INFO: renamed from: b0 */
    default boolean m195714b0(String str, String str2) {
        long jM174454o = pzi0.m174454o();
        User userM116593na = CoreModule.f18264c.f20381e0.m116593na();
        User userM116597oa = CoreModule.f18264c.f20381e0.m116597oa(str);
        if (!NullChecker.m82486a(userM116597oa)) {
            return false;
        }
        double d = userM116593na.createdTime;
        if (jM174454o - ((long) d) < 86400000) {
            return true;
        }
        if (jM174454o - ((long) d) <= 86400000 || jM174454o - ((long) userM116597oa.createdTime) >= 86400000) {
            return false;
        }
        HashSet<String> hashSet = CoreModule.f18264c.f20381e0.f89304p3.get();
        if (CoreModule.f18264c.f20381e0.f89318r3.get().intValue() < 2 && hashSet.size() < 2 && !hashSet.contains(str)) {
            try {
                JSONObject jSONObject = !TextUtils.isEmpty(str2) ? new JSONObject(str2) : new JSONObject();
                jSONObject.put(str, ((long) userM116597oa.createdTime) + 86400000);
                CoreModule.f18264c.f20381e0.f89339u3.put(jSONObject.toString());
                vxd0 vxd0Var = CoreModule.f18264c.f20381e0.f89318r3;
                vxd0Var.put(Integer.valueOf(vxd0Var.get().intValue() + 1));
                hashSet.add(str);
                CoreModule.f18264c.f20381e0.f89304p3.put(hashSet);
            } catch (Exception unused) {
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: c0 */
    default boolean m195715c0(sj6 sj6Var) {
        return sj6Var.f168946u && TextUtils.equals(sj6Var.f168943r, CoreModule.m30929H().userId());
    }

    /* JADX INFO: renamed from: f */
    default boolean m195716f(Message message, User user, Conversation conversation) {
        return (!(NullChecker.m82486a(message) && TEnum.equals(message.status(), "failed") && NullChecker.m82486a(user) && !user.unilateralBlock()) && NullChecker.m82486a(conversation) && conversation.unreadMessages > 0) || m195702T0(conversation);
    }

    /* JADX INFO: renamed from: g */
    default String m195717g(pol polVar) {
        if (!(polVar instanceof u46)) {
            return "";
        }
        int iMo42533o = ((u46) polVar).mo42533o();
        if (iMo42533o == 0) {
            return "all";
        }
        if (iMo42533o == 1) {
            return LimitTimePictureStatus.unread;
        }
        if (iMo42533o == 2) {
            return "online";
        }
        if (iMo42533o == 4) {
            return "lifted";
        }
        if (iMo42533o == 6) {
            return "group";
        }
        if (iMo42533o != 7) {
            return iMo42533o != 8 ? "" : "hide";
        }
        return "deleted";
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: g0 */
    /* synthetic */ default void m195718g0(String str, RunnableC4884c0.c cVar, pf60 pf60Var) {
        if (NullChecker.m82486a(pf60Var.f152156a) && pzi0.m174454o() >= ((ChatHeat) pf60Var.f152156a).exclusiveChatStartTime) {
            double dM174454o = pzi0.m174454o();
            F f = pf60Var.f152156a;
            if (dM174454o <= ((ChatHeat) f).exclusiveChatEndTime) {
                m195689J0(str, (long) ((ChatHeat) f).exclusiveChatStartTime, (long) ((ChatHeat) f).exclusiveChatEndTime, cVar);
                return;
            }
        }
        if (!NullChecker.m82486a(pf60Var.f152156a) || pzi0.m174454o() < ((ChatHeat) pf60Var.f152156a).exclusiveChatInviteTime) {
            return;
        }
        double dM174454o2 = pzi0.m174454o();
        F f2 = pf60Var.f152156a;
        if (dM174454o2 > ((ChatHeat) f2).exclusiveChatInviteExpireTime || ((long) ((ChatHeat) f2).exclusiveChatStartTime) > 0) {
            return;
        }
        m195689J0(str, (long) ((ChatHeat) f2).exclusiveChatInviteTime, (long) ((ChatHeat) f2).exclusiveChatInviteExpireTime, cVar);
    }

    default HashMap<String, UserLiveLabel> getUserLiveLabelHashMap() {
        LinkedHashMap<String, UserLiveLabel> linkedHashMapM222761e = CoreModule.f18264c.f20384f0.f20588B2.m222761e();
        return linkedHashMapM222761e == null ? new HashMap<>() : linkedHashMapM222761e;
    }

    /* JADX INFO: renamed from: h */
    default void m195719h() {
        CoreModule.f18264c.f20384f0.m33668He();
    }

    /* JADX INFO: renamed from: i0 */
    default boolean m195720i0(Conversation conversation) {
        return false;
    }

    /* JADX INFO: renamed from: j */
    default boolean m195721j(Conversation conversation) {
        return NullChecker.m82486a(conversation) && conversation.isLimitMatch();
    }

    /* JADX INFO: renamed from: k */
    default void m195722k(User user) {
        if (user == null) {
            return;
        }
        if (user.isBannedNew()) {
            r1j0.m179420g("对方账号异常");
        } else if (user.isDelIn()) {
            r1j0.m179420g("我暂时离开几天~");
        } else if (user.isDelOut()) {
            r1j0.m179420g("对方已注销");
        }
    }

    /* JADX INFO: renamed from: l */
    default boolean m195723l(Conversation conversation) {
        return NullChecker.m82486a(conversation) && NullChecker.m82486a(conversation.property) && NullChecker.m82486a(conversation.property.conversationTag) && conversation.property.conversationTag.showInList && conversation.userMessageCount == 1 && conversation.f21116mm == 0;
    }

    /* JADX INFO: renamed from: n */
    default boolean m195724n(Conversation conversation) {
        return false;
    }

    /* JADX INFO: renamed from: n0 */
    default boolean m195725n0(sj6 sj6Var) {
        if (m195720i0(sj6Var.f168926a)) {
            try {
                String str = CoreModule.f18264c.f20381e0.f89339u3.get();
                long jOptLong = (!TextUtils.isEmpty(str) ? new JSONObject(str) : new JSONObject()).optLong(sj6Var.f168926a.f56859id, 0L);
                if (m195714b0(sj6Var.f168926a.f56859id, str) && jOptLong != 0 && pzi0.m174454o() < jOptLong) {
                    return true;
                }
            } catch (Exception unused) {
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: o0 */
    default boolean m195726o0(sj6 sj6Var, Message message) {
        return false;
    }

    /* JADX INFO: renamed from: p */
    default Message m195727p(sj6 sj6Var) {
        return sj6Var.m186059a();
    }

    /* JADX INFO: renamed from: p0 */
    default boolean m195728p0(Conversation conversation) {
        if (m195699S(conversation) || m195723l(conversation)) {
            return TEnum.equals(conversation.status, "default") || TEnum.equals(conversation.status, "blocked");
        }
        return false;
    }

    /* JADX INFO: renamed from: q */
    default boolean m195729q(sj6 sj6Var) {
        Message messageM195727p;
        if (!gra.m131569G1() || User.isTeamAccount(sj6Var.f168926a.f56859id) || !TextUtils.equals(sj6Var.f168926a.convType, "default") || !TEnum.equals(sj6Var.f168926a.status, "default")) {
            return false;
        }
        Conversation conversation = sj6Var.f168926a;
        return conversation.unreadMessages == 0 && conversation.f21116mm <= gra.m131619R() && (messageM195727p = m195727p(sj6Var)) != null && !messageM195727p.isMe() && !m195716f(messageM195727p, sj6Var.f168927b, sj6Var.f168926a) && ((double) pzi0.m174454o()) - messageM195727p.createdTime < ((double) (((long) gra.m131627T()) * 86400000));
    }

    @Nullable
    /* JADX INFO: renamed from: r0 */
    default String m195730r0(sj6 sj6Var) {
        if (!CoreModule.f18264c.f20384f0.m34160vg(m195705V0(sj6Var.f168930e)).contains(sj6Var.f168926a.f56859id) || !"group".equals(sj6Var.f168926a.convType)) {
            return "";
        }
        ChatGroup chatGroupM32923s6 = CoreModule.f18264c.f20387g0.m32923s6(sj6Var.f168926a.otherUser);
        return (NullChecker.m82486a(chatGroupM32923s6) && !jyb.m147479J(chatGroupM32923s6.avatars) && NullChecker.m82486a(chatGroupM32923s6.avatars.get(0).cover())) ? chatGroupM32923s6.avatars.get(0).cover().profileSmall().formatted() : "";
    }

    /* JADX INFO: renamed from: s */
    default boolean m195731s(Message message) {
        if (message.isMe()) {
            return true;
        }
        return NullChecker.m82486a(message.additionalData) && NullChecker.m82486a(message.additionalData.exchangePicture) && TextUtils.equals(message.additionalData.exchangePicture.status, ExchangePicture.finished);
    }

    /* JADX INFO: renamed from: u0 */
    default boolean m195732u0(sj6 sj6Var, Message message) {
        return (!m195701T(sj6Var.f168926a) || sj6Var.f168926a.hasRemoveLabel() || xbj.m209959d().mo95724a(sj6Var, message)) ? false : true;
    }

    /* JADX INFO: renamed from: w */
    default void m195733w(sj6 sj6Var) {
        Conversation conversation;
        UserLiveLabel userLiveLabel;
        LinkedHashMap<String, UserLiveLabel> linkedHashMapM222761e = CoreModule.f18264c.f20384f0.f20588B2.m222761e();
        if (linkedHashMapM222761e == null || (conversation = sj6Var.f168926a) == null || (userLiveLabel = linkedHashMapM222761e.get(conversation.otherUser)) == null || !userLiveLabel.ongoingCall) {
            return;
        }
        sfj0.m185596c("e_live_call_label", OMSDialogPositon.p_messages_view, new sfj0.C20032a[0]);
    }

    /* JADX INFO: renamed from: x */
    default boolean m195734x(sj6 sj6Var) {
        return NullChecker.m82486a(sj6Var.f168926a.property.intl_chat_source) && SummarizedPrivilegesId.spotLight.equals(sj6Var.f168926a.property.intl_chat_source.source);
    }

    /* JADX INFO: renamed from: x0 */
    default void m195735x0(final sj6 sj6Var) {
        if (NullChecker.m82486a(sj6Var.f168926a) && sj6Var.f168926a.isHeartbeatConv()) {
            sfj0.m185596c("e_heart_signal_conversation", OMSDialogPositon.p_messages_view, sfj0.C20032a.m185616i("is_fake", sj6Var.f168926a.isFakeHeartbeatConv()), sfj0.C20032a.m185615h("moments_user_id", sj6Var.f168926a.otherUser));
        }
        if (NullChecker.m82486a(sj6Var.f168926a) && eu4.m122523b().m122528f(sj6Var.f168926a)) {
            sfj0.m185596c("e_answer_question_tip", OMSDialogPositon.p_messages_view, new sfj0.C20032a[0]);
        }
        if (gra.m131614P2()) {
            i46.m138395c().m138396a();
            i46.m138395c().f112834a.onNext(null);
            l51.m152919y(new Runnable() { // from class: l.ie6
                @Override // java.lang.Runnable
                public final void run() {
                    this.f114554a.m195690K(sj6Var);
                }
            });
        }
    }

    /* JADX INFO: renamed from: y */
    default UserLiveLabel m195736y(boolean z, String str) {
        LinkedHashMap<String, UserLiveLabel> linkedHashMapM34210zg = CoreModule.f18264c.f20384f0.m34210zg(z);
        if (linkedHashMapM34210zg == null || linkedHashMapM34210zg.isEmpty()) {
            return null;
        }
        return linkedHashMapM34210zg.get(str);
    }

    /* JADX INFO: renamed from: C */
    static void m195658C(String str) {
    }
}
