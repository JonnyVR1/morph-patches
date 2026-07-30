package p149l;

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
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.android.app.App;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.R$string;
import com.p046p1.mobile.putong.core.api.C4740g;
import com.p046p1.mobile.putong.core.api.RunnableC4733c0;
import com.p046p1.mobile.putong.core.data.ChatGroup;
import com.p046p1.mobile.putong.core.data.ChatHeat;
import com.p046p1.mobile.putong.core.data.ChatRoundsDisplayedExternallyConfig;
import com.p046p1.mobile.putong.core.data.Conversation;
import com.p046p1.mobile.putong.core.data.ExchangePicture;
import com.p046p1.mobile.putong.core.data.LimitTimePictureStatus;
import com.p046p1.mobile.putong.core.data.Message;
import com.p046p1.mobile.putong.core.data.MessageType;
import com.p046p1.mobile.putong.core.data.OptiMVParams;
import com.p046p1.mobile.putong.core.data.PlatinumPinChat;
import com.p046p1.mobile.putong.core.data.SummarizedPrivilegesId;
import com.p046p1.mobile.putong.core.data.SwitchConvNextConfig;
import com.p046p1.mobile.putong.core.newui.messages.ConversationItemView;
import com.p046p1.mobile.putong.core.newui.messages.ConversationsList;
import com.p046p1.mobile.putong.data.ConversationStatus;
import com.p046p1.mobile.putong.data.OMSDialogPositon;
import com.p046p1.mobile.putong.data.Picture;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.data.UserLiveLabel;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.p046p1.mobile.putong.p049ab.IntlCountryCodeController;
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
import p133rx.C22306c;
import tech.sud.gip.core.view.round.RoundedDrawable;

/* JADX INFO: loaded from: classes11.dex */
public interface rd6 {
    /* JADX INFO: renamed from: B0 */
    static /* synthetic */ Boolean m178863B0(SwitchConvNextConfig switchConvNextConfig, Conversation conversation) {
        List<Message> listM32828Um = CoreModule.f17545c.f19642f0.m32828Um(conversation.f56011id);
        if (vwb.m200296J(listM32828Um)) {
            return Boolean.FALSE;
        }
        boolean z = false;
        double dM155944o = mqi0.m155944o() - listM32828Um.get(0).createdTime;
        if (dM155944o < TimeUnit.HOURS.toMillis(switchConvNextConfig.exp_limit_hours) && dM155944o > FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    /* JADX INFO: renamed from: C0 */
    static boolean m178865C0(Conversation conversation) {
        if (u59.m191811T() || upa.m194649I2()) {
            return TextUtils.equals(conversation.f56011id, "fake_conversation_greeting") || TextUtils.equals(conversation.f56011id, "fake_conversation_anonymous_greeting");
        }
        return false;
    }

    /* JADX INFO: renamed from: G */
    static View m178866G(Act act, ViewGroup viewGroup) {
        return act.inflater().inflate(f6c0.f95316D1, viewGroup, false);
    }

    /* JADX INFO: renamed from: N */
    static /* synthetic */ Boolean m178868N(Conversation conversation) {
        List<Message> listM32828Um = CoreModule.f17545c.f19642f0.m32828Um(conversation.f56011id);
        if (vwb.m200296J(listM32828Um)) {
            return Boolean.FALSE;
        }
        boolean z = false;
        Message message = listM32828Um.get(0);
        boolean z2 = TEnum.equals(message.messageType, "default") || TEnum.equals(message.messageType, "text") || TEnum.equals(message.messageType, "video") || TEnum.equals(message.messageType, "audio") || TEnum.equals(message.messageType, "picture");
        double dM155944o = mqi0.m155944o() - message.createdTime;
        boolean z3 = dM155944o < 2.592E8d && dM155944o > FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
        boolean zEquals = TextUtils.equals(message.owner, CoreModule.m29931H().userId());
        if (z2 && z3 && !zEquals) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    /* JADX INFO: renamed from: Z */
    static View m178870Z(Act act, ViewGroup viewGroup, boolean z) {
        if (act == null || viewGroup == null) {
            return new View(act);
        }
        return act.inflater().inflate(z ? f6c0.f95332E1 : f6c0.f95782fe, viewGroup, false);
    }

    /* JADX INFO: renamed from: a */
    static View m178871a(Act act, ViewGroup viewGroup) {
        return m178870Z(act, viewGroup, false);
    }

    /* JADX INFO: renamed from: e0 */
    static void m178873e0(TextView textView) {
        textView.setTextSize(14.0f);
        textView.setTextColor(pi6.f149083T);
    }

    /* JADX INFO: renamed from: f0 */
    static /* synthetic */ Boolean m178874f0(SwitchConvNextConfig switchConvNextConfig, Conversation conversation) {
        List<Message> listM32828Um = CoreModule.f17545c.f19642f0.m32828Um(conversation.f56011id);
        if (vwb.m200296J(listM32828Um)) {
            return Boolean.FALSE;
        }
        boolean z = false;
        double dM155944o = mqi0.m155944o() - listM32828Um.get(0).createdTime;
        if (dM155944o < TimeUnit.HOURS.toMillis(switchConvNextConfig.exp_limit_hours) && dM155944o > FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    /* JADX INFO: renamed from: j0 */
    static /* synthetic */ Boolean m178876j0(Conversation conversation) {
        if (NullChecker.m81303a(conversation) && TextUtils.isEmpty(conversation.f56011id)) {
            d36.m109868c().m109876i(conversation);
        }
        return Boolean.valueOf(NullChecker.m81303a(conversation) && !TextUtils.isEmpty(conversation.f56011id));
    }

    /* JADX INFO: renamed from: k0 */
    static void m178877k0(TextView textView, TextView textView2) {
        textView.setTextSize(16.0f);
        textView.setTextColor(RoundedDrawable.DEFAULT_BORDER_COLOR);
        textView2.setTextSize(12.0f);
        textView2.setTextColor(pi6.f149082S);
    }

    /* JADX INFO: renamed from: o */
    static boolean m178878o(Conversation conversation) {
        return (conversation == null || !conversation.isFakeOneSideConv() || CoreModule.f17545c.f19639e0.m169527p9().isSVIP() || conversation.f20374mm > 0 || conversation.isOtherStatusInvalid()) ? false : true;
    }

    /* JADX INFO: renamed from: q0 */
    static /* synthetic */ Boolean m178879q0(Message message) {
        if (TEnum.equals(message.messageType, MessageType.common_tip) && NullChecker.m81303a(message.extData) && !TextUtils.isEmpty(message.extData.extra) && TextUtils.equals(message.extData.extra, "pat")) {
            return Boolean.TRUE;
        }
        if (TEnum.equals(message.messageType, MessageType.chat_assistant_question) && message.isMe() && NullChecker.m81303a(message.extData) && TextUtils.equals(message.extData.extra, "system")) {
            return Boolean.FALSE;
        }
        if (TEnum.equals(message.messageType, MessageType.common_tip_box_v2) && NullChecker.m81303a(message.additionalData) && NullChecker.m81303a(message.additionalData.commonTipBox) && TextUtils.equals(message.additionalData.commonTipBox.type, "verify")) {
            return Boolean.TRUE;
        }
        return Boolean.valueOf((TEnum.equals(message.messageType, "tantan_verify_toast") || TEnum.equals(message.messageType, MessageType.local_greeting_match_success) || TEnum.equals(message.messageType, MessageType.local_countdown_like_success) || TEnum.equals(message.messageType, MessageType.local_countdown_like_notify) || TEnum.equals(message.messageType, MessageType.local_chat_greeting_tip) || TEnum.equals(message.messageType, "live_vip_greet") || TEnum.equals(message.messageType, "local_tickle_tip") || TEnum.equals(message.messageType, MessageType.soul_test_guide) || TEnum.equals(message.messageType, "local_friend_comment_toast") || TEnum.equals(message.messageType, MessageType.local_real_shot_tips) || TEnum.equals(message.messageType, MessageType.local_chat_inc_temp_warn) || TEnum.equals(message.messageType, MessageType.christmas_match) || TEnum.equals(message.messageType, MessageType.local_normal_tips) || TEnum.equals(message.messageType, MessageType.local_chat_inc_temp_warn) || TEnum.equals(message.messageType, MessageType.heartbeat_notify) || TEnum.equals(message.messageType, "heartbeat_waiting_response") || TEnum.equals(message.messageType, MessageType.heartbeat_success) || TEnum.equals(message.messageType, MessageType.local_user_moment_message) || TEnum.equals(message.messageType, MessageType.local_break_ice) || TEnum.equals(message.messageType, MessageType.wanwan_tip) || TEnum.equals(message.messageType, MessageType.local_push_switch) || TEnum.equals(message.messageType, MessageType.local_push_switch_plus) || TEnum.equals(message.messageType, MessageType.local_chanllenge_tips) || TEnum.equals(message.messageType, MessageType.tag_guide) || TEnum.equals(message.messageType, "tacit_test") || TEnum.equals(message.messageType, MessageType.common_tip) || TEnum.equals(message.messageType, MessageType.local_moment_post_guide) || TEnum.equals(message.messageType, MessageType.local_love_buzz_break_ice) || TEnum.equals(message.messageType, MessageType.local_moment_post_guide) || TEnum.equals(message.messageType, MessageType.local_add_tags_guide) || TEnum.equals(message.messageType, MessageType.local_add_artwork_guide) || TEnum.equals(message.messageType, MessageType.local_send_artwork_text) || TEnum.equals(message.messageType, MessageType.local_send_tags_text) || TEnum.equals(message.messageType, MessageType.local_match_ice_break) || TEnum.equals(message.messageType, MessageType.local_chat_assistant_question_new) || TEnum.equals(message.messageType, MessageType.local_friend_active_remind_female) || TEnum.equals(message.messageType, MessageType.female_unreply_reminder) || TEnum.equals(message.messageType, MessageType.local_ai_p2p_chat_guide) || TEnum.equals(message.messageType, MessageType.local_heart_beat_lock_tip) || TEnum.equals(message.messageType, MessageType.harass_alert) || TEnum.equals(message.messageType, MessageType.continuous_chat_tip) || TEnum.equals(message.messageType, MessageType.local_birthday_tip) || TEnum.equals(message.messageType, MessageType.system_reminder) || TEnum.equals(message.messageType, MessageType.local_platinum_pin_guide) || TEnum.equals(message.messageType, MessageType.local_wechat_notify_guide) || TEnum.equals(message.messageType, MessageType.local_long_time_no_see) || TEnum.equals(message.messageType, MessageType.local_pic_cert_guide) || TEnum.equals(message.messageType, MessageType.local_blindbox_guide) || TEnum.equals(message.messageType, MessageType.local_visitor_hide_footprint) || TEnum.equals(message.messageType, MessageType.common_tip_box) || TEnum.equals(message.messageType, MessageType.local_intl_prompt_message_type) || TEnum.equals(message.messageType, MessageType.local_ux_questionnaire) || TEnum.equals(message.messageType, MessageType.local_ux_questionnaire_tip) || TEnum.equals(message.messageType, MessageType.local_ideal_enquiry) || TEnum.equals(message.messageType, MessageType.local_love_letter_guide) || TEnum.equals(message.messageType, MessageType.local_o_diamond_visitor_guide) || TEnum.equals(message.messageType, MessageType.local_invitation_for_authentication) || TEnum.equals(message.messageType, MessageType.common_tip_box_v2) || TEnum.equals(message.messageType, MessageType.mm_task) || TEnum.equals(message.messageType, MessageType.local_intl_read_receipts_guide) || TEnum.equals(message.messageType, MessageType.local_pin_chat_normal_guide)) ? false : true);
    }

    /* JADX INFO: renamed from: s0 */
    static boolean m178880s0(Conversation conversation) {
        return conversation.lowPayOneSideConv() && !conversation.read.booleanValue();
    }

    /* JADX INFO: renamed from: t */
    static Message m178881t(List<Message> list, User user) {
        w9j w9jVar = new w9j() { // from class: l.qd6
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return rd6.m178879q0((Message) obj);
            }
        };
        if (!NullChecker.m81303a(list)) {
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
                sb.append(NullChecker.m81303a(user) ? user.f56011id : "null");
                sb.append(",  oldSize = ");
                sb.append(size);
                sb.append(",  currentSize = ");
                sb.append(list.size());
                sb.append(",  index = ");
                sb.append(i);
                sb.append(",  list = ");
                sb.append(list);
                CrashHelper.m81296c(new NoSuchElementException(sb.toString()));
            }
            if (((Boolean) w9jVar.call(next)).booleanValue()) {
                return next;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: v */
    static void m178882v(final int i, View... viewArr) {
        C22306c.from(viewArr).doOnNext(new e30() { // from class: l.id6
            @Override // p149l.e30
            public final void call(Object obj) {
                rd6.m178883v0(i, (View) obj);
            }
        }).subscribe();
    }

    /* JADX INFO: renamed from: v0 */
    static /* synthetic */ void m178883v0(int i, View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            layoutParams = new ViewGroup.LayoutParams(view.getWidth(), view.getHeight());
        }
        layoutParams.width = i;
        layoutParams.height = i;
        view.setLayoutParams(layoutParams);
    }

    /* JADX INFO: renamed from: z */
    static /* synthetic */ Boolean m178885z(Conversation conversation) {
        if (NullChecker.m81303a(conversation) && TextUtils.isEmpty(conversation.f56011id)) {
            d36.m109868c().m109876i(conversation);
        }
        return Boolean.valueOf(NullChecker.m81303a(conversation) && !TextUtils.isEmpty(conversation.f56011id));
    }

    /* JADX INFO: renamed from: A0 */
    default boolean m178886A0(Conversation conversation) {
        return NullChecker.m81303a(conversation) && NullChecker.m81303a(conversation.property) && NullChecker.m81303a(conversation.property.loveScript) && "lovescript".equals(conversation.convType) && conversation.property.loveScript.expireTime != 0;
    }

    /* JADX INFO: renamed from: D */
    default boolean m178887D(pi6 pi6Var) {
        if (NullChecker.m81303a(pi6Var) && NullChecker.m81303a(pi6Var.f149101a)) {
            TEnum.equals(pi6Var.f149101a.status, ConversationStatus.invisible);
        }
        return false;
    }

    /* JADX INFO: renamed from: D0 */
    default CharSequence m178888D0(String str, String str2, boolean z) {
        if (TextUtils.isEmpty(str2)) {
            return str;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        int iIndexOf = z ? str.toLowerCase().indexOf(str2.toLowerCase()) : str.indexOf(str2);
        if (iIndexOf != -1) {
            spannableStringBuilder.setSpan(new ForegroundColorSpan(App.f15369e.getResources().getColor(w0c0.f183773I)), iIndexOf, str2.length() + iIndexOf, 33);
        }
        return spannableStringBuilder;
    }

    /* JADX INFO: renamed from: E0 */
    default void m178889E0(pi6 pi6Var, String str, UserLiveLabel userLiveLabel) {
        o6j0.C18854a c18854aM162878h;
        o6j0.C18854a c18854aM162878h2;
        o6j0.C18854a c18854a;
        o6j0.C18854a c18854aM162878h3;
        String str2;
        int iIndexOf = CoreModule.f17545c.f19642f0.m32929dg(m178911V0(pi6Var.f149105e)).indexOf(pi6Var.f149101a);
        String str3 = "e_live_room_enter";
        if (!"onLive".equals(userLiveLabel.liveState) && "onVoice".equals(userLiveLabel.liveState)) {
            o6j0.C18854a c18854aM162878h4 = o6j0.C18854a.m162878h("profile_user_id", userLiveLabel.userId);
            c18854aM162878h = o6j0.C18854a.m162878h("topic_id", userLiveLabel.voiceRoomTopicId);
            c18854aM162878h2 = o6j0.C18854a.m162878h("audio_card_type", "message_list");
            c18854a = c18854aM162878h4;
            c18854aM162878h3 = o6j0.C18854a.m162878h("audio_room_type", "normal_audio");
            str3 = "e_live_audio_room_enter";
        } else {
            c18854a = null;
            c18854aM162878h = null;
            c18854aM162878h2 = null;
            c18854aM162878h3 = null;
        }
        o6j0.C18854a c18854aM162878h5 = o6j0.C18854a.m162878h("anchorId", userLiveLabel.anchorId);
        if (iIndexOf != -1) {
            iIndexOf++;
        }
        o6j0.C18854a c18854aM162876f = o6j0.C18854a.m162876f(FirebaseAnalytics.Param.INDEX, iIndexOf);
        o6j0.C18854a c18854aM162878h6 = o6j0.C18854a.m162878h("liveId", userLiveLabel.liveId);
        o6j0.C18854a c18854aM162878h7 = o6j0.C18854a.m162878h("liveRecommendCategory", "NA");
        if (TextUtils.equals(Constants.VIA_REPORT_TYPE_START_GROUP, str)) {
            str2 = "fanbasegroupchat_photo";
        } else {
            str2 = m178911V0(pi6Var.f149105e) ? "match_photo" : "chat_photo";
        }
        o6j0.m162859c(str3, OMSDialogPositon.p_messages_view, c18854aM162878h5, c18854aM162876f, c18854aM162878h6, c18854aM162878h7, o6j0.C18854a.m162878h("module", str2), o6j0.C18854a.m162878h("right_recommend_type", "NA"), o6j0.C18854a.m162878h("show_label", userLiveLabel.iconTitle), o6j0.C18854a.m162878h("trace_id", ""), o6j0.C18854a.m162878h("live_status", "on"), o6j0.C18854a.m162878h("window_type", "null"), o6j0.C18854a.m162878h("live_room_live_type", m178915Y0(userLiveLabel)), c18854a, c18854aM162878h, c18854aM162878h2, c18854aM162878h3);
    }

    /* JADX INFO: renamed from: F */
    default void m178890F(Act act, final String str, p36 p36Var, final RunnableC4733c0.c cVar) {
        if (upa.m194645H3()) {
            CoreModule.f17545c.f19685t1.m31516u("exclusive_tag_" + str);
            p36Var.mo67374c(act, CoreModule.f17545c.f19586M1.m215249s3(str).distinctUntilChanged().map(new w9j() { // from class: l.gd6
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return j760.m140076a((ChatHeat) obj, "");
                }
            })).subscribe(mkd0.m154955G(new e30() { // from class: l.hd6
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f107215a.m178924g0(str, cVar, (j760) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: H */
    default boolean m178891H(pi6 pi6Var, boolean z) {
        String strM178900O0;
        if (pi6Var.f149101a == null || pi6Var.f149102b == null) {
            return false;
        }
        boolean zM178911V0 = m178911V0(pi6Var.f149105e);
        if (upa.m194726a2()) {
            UserLiveLabel userLiveLabelM178917a0 = m178917a0(pi6Var, zM178911V0);
            strM178900O0 = (qp8.m175817b() && upa.m194726a2() && !z && TEnum.equals(pi6Var.f149101a.status, "default") && userLiveLabelM178917a0 != null) ? m178901P0(pi6Var, userLiveLabelM178917a0) : "";
        } else {
            strM178900O0 = m178900O0(pi6Var, z, zM178911V0);
        }
        return !TextUtils.isEmpty(strM178900O0);
    }

    /* JADX INFO: renamed from: H0 */
    default String m178892H0(int i) {
        if (!IntlCountryCodeController.m28110f()) {
            if (i >= 1000) {
                return i < 10000 ? CoreModule.f17544b.getString(R$string.f17868K1, i0g0.f110325b.format(i / 1000.0f)) : CoreModule.f17544b.getString(R$string.f17868K1, i0g0.f110326c.format(i / 1000.0f));
            }
            return "1" + CoreModule.f17544b.getString(R$string.f18273Xg);
        }
        double d = ((double) i) * 3.28083993d;
        if (d < 1000.0d) {
            return "1 " + CoreModule.f17544b.getString(R$string.f18035Pi);
        }
        double d2 = d * 1.8939E-4d;
        if (d2 >= 2.0d) {
            return CoreModule.f17544b.getString(R$string.f17898L1, i0g0.f110326c.format(d2));
        }
        if (d2 == 1.0d) {
            return i0g0.f110326c.format(d2) + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR + CoreModule.f17544b.getString(R$string.f18035Pi);
        }
        if (d2 > 1.0d) {
            return CoreModule.f17544b.getString(R$string.f17898L1, i0g0.f110325b.format(d2));
        }
        return "1 " + CoreModule.f17544b.getString(R$string.f18035Pi);
    }

    /* JADX INFO: renamed from: I */
    default void m178893I(pi6 pi6Var, TextView textView, boolean z, boolean z2) {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) textView.getLayoutParams();
        if (z) {
            int i = t100.f167261j;
            layoutParams.width = i;
            layoutParams.height = i;
            layoutParams.topMargin = t100.f167252a;
            textView.setMinWidth(i);
            textView.setText("");
            textView.setBackgroundResource(x2c0.f189878X5);
            textView.setLayoutParams(layoutParams);
            xdl0.m208344M(textView, true);
            return;
        }
        if (z2) {
            layoutParams.width = -2;
            int i2 = t100.f167268q;
            layoutParams.height = i2;
            layoutParams.topMargin = -t100.f167256e;
            textView.setMinWidth(i2);
            Conversation conversation = pi6Var.f149101a;
            textView.setText(t0g0.m186865f(conversation.unreadMessages + m178898M(conversation)));
            if (ura.m195053e().m195057d().mo33920sa()) {
                CoreModule.f17545c.f19642f0.m32725Me().f118469V.filter(pi6Var.f149101a);
            }
            textView.setBackgroundResource(x2c0.f189785U5);
            textView.setLayoutParams(layoutParams);
            xdl0.m208344M(textView, true);
        }
    }

    /* JADX INFO: renamed from: I0 */
    default String m178894I0(User user, Conversation conversation) {
        String str = "";
        if (!CoreModule.f17545c.f19642f0.m32913bo(user, conversation)) {
            return "";
        }
        String string = conversation.additional.tag.type.toString();
        string.getClass();
        switch (string) {
            case "oneside":
                if (!CoreModule.f17545c.f19588N0.m31966j3(user)) {
                    str = "等你回应";
                    break;
                }
                break;
            case "birthday":
                str = String.format("%s今天生日", user.isFemale() ? "她" : "他");
                break;
            case "newuser":
                if (!CoreModule.f17545c.f19588N0.m31966j3(user)) {
                    str = "初来乍到";
                    break;
                }
                break;
        }
        if (!TextUtils.isEmpty(str)) {
            CoreModule.f17545c.f19642f0.f19951k2.add(user.f56011id);
        }
        return str;
    }

    /* JADX INFO: renamed from: J0 */
    default void m178895J0(String str, long j, long j2, RunnableC4733c0.c cVar) {
        RunnableC4733c0.a aVar = new RunnableC4733c0.a();
        aVar.m31523g("exclusive_tag_" + str).m31520d(cVar).m31518b(true).m31524h(1L).m31519c(j).m31522f(j2);
        CoreModule.f17545c.f19685t1.m31513r(aVar);
    }

    /* JADX INFO: renamed from: K */
    /* synthetic */ default void m178896K(pi6 pi6Var) {
        if (upa.m194687Q2()) {
            m178910V(pi6Var);
        } else if (upa.m194691R2()) {
            m178903R(pi6Var);
        }
    }

    /* JADX INFO: renamed from: L0 */
    default boolean m178897L0(pi6 pi6Var, Message message) {
        return false;
    }

    /* JADX INFO: renamed from: M */
    default int m178898M(Conversation conversation) {
        return m178908T0(conversation) ? 1 : 0;
    }

    /* JADX INFO: renamed from: N0 */
    default Picture.ImageUri m178899N0(User user) {
        return sw6.m186127b(user).profileSmall();
    }

    /* JADX INFO: renamed from: O0 */
    default String m178900O0(pi6 pi6Var, boolean z, boolean z2) {
        UserLiveLabel userLiveLabel = getUserLiveLabelHashMap().get(pi6Var.f149102b.f56011id);
        if (qp8.m175817b() && z2 && !z && TEnum.equals(pi6Var.f149101a.status, "default") && NullChecker.m81303a(userLiveLabel)) {
            if (userLiveLabel.ongoingCall) {
                return TextUtils.isEmpty(userLiveLabel.iconTitle) ? "多人连线" : userLiveLabel.iconTitle;
            }
            if (userLiveLabel.isMultiCallGoing()) {
                return TextUtils.isEmpty(userLiveLabel.iconTitle) ? pi6Var.f149124x.getString(R$string.f18487eh) : userLiveLabel.iconTitle;
            }
        }
        return "";
    }

    /* JADX INFO: renamed from: P0 */
    default String m178901P0(pi6 pi6Var, UserLiveLabel userLiveLabel) {
        if (userLiveLabel.ongoingCall) {
            return TextUtils.isEmpty(userLiveLabel.iconTitle) ? "多人连线" : userLiveLabel.iconTitle;
        }
        boolean zIsMultiCallGoing = userLiveLabel.isMultiCallGoing();
        String str = userLiveLabel.iconTitle;
        if (zIsMultiCallGoing) {
            return TextUtils.isEmpty(str) ? pi6Var.f149124x.getString(R$string.f18487eh) : userLiveLabel.iconTitle;
        }
        return TextUtils.isEmpty(str) ? CoreModule.m29936Q().getLiveCardText() : userLiveLabel.iconTitle;
    }

    /* JADX INFO: renamed from: Q */
    default void m178902Q(pi6 pi6Var, UserLiveLabel userLiveLabel) {
        m178889E0(pi6Var, "", userLiveLabel);
    }

    /* JADX INFO: renamed from: R */
    default void m178903R(pi6 pi6Var) {
        Conversation conversation = pi6Var.f149101a;
        if (conversation == null || !conversation.read.booleanValue() || conversation.unreadMessages > 0 || conversation.f56011id.startsWith("fake_conversation")) {
            return;
        }
        final SwitchConvNextConfig switchConvNextConfigM194759h1 = upa.m194759h1();
        if (vwb.m200323f(vwb.m200339n(CoreModule.f17545c.f19642f0.m32986hq(), new w9j() { // from class: l.jd6
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return rd6.m178885z((Conversation) obj);
            }
        }), new w9j() { // from class: l.kd6
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return rd6.m178874f0(switchConvNextConfigM194759h1, (Conversation) obj);
            }
        }) >= switchConvNextConfigM194759h1.exp_limit_count) {
            return;
        }
        d36.m109868c().m109877j(vwb.m200303Q(vwb.m200339n(CoreModule.f17545c.f19642f0.m32830Uo(), new w9j() { // from class: l.ld6
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return rd6.m178868N((Conversation) obj);
            }
        }), new w9j() { // from class: l.md6
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return ((Conversation) obj).f56011id;
            }
        }));
        if (d36.m109868c().m109871d(conversation.f56011id)) {
            d36.m109868c().f83463a.onNext(conversation.f56011id);
        } else {
            d36.m109868c().m109869a();
        }
    }

    /* JADX INFO: renamed from: R0 */
    default Message m178904R0(List<Message> list, User user) {
        return m178881t(list, user);
    }

    /* JADX INFO: renamed from: S */
    default boolean m178905S(Conversation conversation) {
        return NullChecker.m81303a(conversation) && NullChecker.m81303a(conversation.property) && NullChecker.m81303a(conversation.property.conversationTag) && conversation.property.conversationTag.showInList && conversation.userMessageCount == 0 && !conversation.localHasMessage;
    }

    /* JADX INFO: renamed from: S0 */
    default void m178906S0(pi6 pi6Var) {
        User user = pi6Var.f149102b;
        Conversation conversation = pi6Var.f149101a;
        if (NullChecker.m81303a(user) && NullChecker.m81303a(conversation)) {
            String string = (NullChecker.m81303a(conversation) && NullChecker.m81303a(conversation.additional) && NullChecker.m81303a(conversation.additional.tag) && NullChecker.m81303a(conversation.additional.tag.type) && !TEnum.equals(conversation.additional.tag.type, "unknown_")) ? conversation.additional.tag.type.toString() : "";
            OptiMVParams optiMVParamsNew_ = OptiMVParams.new_();
            optiMVParamsNew_.curUserId = user.f56011id;
            optiMVParamsNew_.name = user.name;
            optiMVParamsNew_.createTime = conversation.createdTime;
            optiMVParamsNew_.newMatchRank = (pi6Var.f149107g - pi6Var.f149108h) + "";
            optiMVParamsNew_.momentsUserId = conversation.f56011id;
            optiMVParamsNew_.is_fake = conversation.isFakeHeartbeatConv() || conversation.isFakeQuickChatConv();
            optiMVParamsNew_.isOnline = CoreModule.f17545c.f19588N0.m31966j3(user) ? "1" : "0";
            optiMVParamsNew_.newMsgPageModule = m178905S(conversation) ? "0" : "1";
            optiMVParamsNew_.isOnliveAnchor = pi6Var.f149095K;
            optiMVParamsNew_.isRedDot = conversation.read.booleanValue() ? "0" : "1";
            optiMVParamsNew_.isNewMoment = "0";
            optiMVParamsNew_.otherUid = conversation.otherUser;
            optiMVParamsNew_.redDotNum = String.valueOf(conversation.unreadMessages);
            optiMVParamsNew_.messagecCellType = ll6.m150405a(conversation);
            if (!i36.m134149g().m134160o(conversation.f56011id) || conversation.hasRemoveLabel()) {
                optiMVParamsNew_.user_tag = string;
            } else {
                optiMVParamsNew_.user_tag = "longtimenosee";
            }
            optiMVParamsNew_.day_number = pi6Var.f149097M;
            if (m178916Z0(pi6Var.f149101a) && !pi6Var.f149101a.hasRemoveLabel() && pi6Var.f149101a.unreadMessages == 0) {
                optiMVParamsNew_.chat_guide = "1," + i36.m134149g().m134155j(conversation.f56011id, true);
            }
            if (ConversationItemView.m40961R1(conversation)) {
                optiMVParamsNew_.love_letter = "1";
            }
            optiMVParamsNew_.pairing_type = conversation.hasReSwipeConvIceBreak() ? "break_ice" : "unbreak_ice";
            optiMVParamsNew_.chat_game_show = false;
            optiMVParamsNew_.equipment_type = pi6Var.f149096L;
            optiMVParamsNew_.is_platinum_top_chat = CoreModule.m29935P().m94656g().mo35048b8() && conversation.isPlatinumTop();
            if (m178935q(pi6Var)) {
                optiMVParamsNew_.guide_type = "gotoreply";
            } else if (m178934p0(pi6Var.f149101a)) {
                Conversation conversation2 = pi6Var.f149101a;
                if (conversation2.unreadMessages <= 0 && (TextUtils.isEmpty(conversation2.property.conversationTag.suggestExpireTime) || (!TextUtils.isEmpty(pi6Var.f149101a.property.conversationTag.suggestExpireTime) && mqi0.m155944o() < Long.parseLong(pi6Var.f149101a.property.conversationTag.suggestExpireTime) * 1000))) {
                    if (!TextUtils.isEmpty(pi6Var.f149101a.property.conversationTag.emoji)) {
                        optiMVParamsNew_.guide_type = "emoji";
                    } else if (!TextUtils.isEmpty(pi6Var.f149101a.property.conversationTag.suggestText)) {
                        optiMVParamsNew_.guide_type = "startchat";
                    }
                }
            }
            ChatRoundsDisplayedExternallyConfig chatRoundsDisplayedExternallyConfigM194680P = upa.m194680P();
            if (NullChecker.m81303a(chatRoundsDisplayedExternallyConfigM194680P) && chatRoundsDisplayedExternallyConfigM194680P.enabled) {
                optiMVParamsNew_.spark_level = ll6.m150409e(conversation);
                optiMVParamsNew_.message_pairs = ll6.m150408d(conversation);
                optiMVParamsNew_.is_close_friend = ll6.m150406b(conversation);
                optiMVParamsNew_.is_top_recommend = ll6.m150407c(conversation);
            }
            CoreModule.f17545c.f19642f0.f19892R.m143756b(optiMVParamsNew_);
            C4740g c4740g = CoreModule.f17545c.f19642f0;
            c4740g.f19892R.m143759e(c4740g.f19895S, false);
        }
    }

    /* JADX INFO: renamed from: T */
    default boolean m178907T(Conversation conversation) {
        return upa.m194809r1() && NullChecker.m81303a(conversation) && i36.m134149g().m134160o(conversation.f56011id);
    }

    /* JADX INFO: renamed from: T0 */
    default boolean m178908T0(Conversation conversation) {
        return i36.m134149g().m134159n() && NullChecker.m81303a(conversation) && conversation.unreadMessages == 0 && m178907T(conversation);
    }

    /* JADX INFO: renamed from: U0 */
    default boolean m178909U0(pi6 pi6Var) {
        return false;
    }

    /* JADX INFO: renamed from: V */
    default void m178910V(pi6 pi6Var) {
        Conversation conversation = pi6Var.f149101a;
        if (conversation == null || conversation.read.booleanValue() || conversation.unreadMessages == 0 || conversation.f56011id.startsWith("fake_conversation")) {
            return;
        }
        final SwitchConvNextConfig switchConvNextConfigM194759h1 = upa.m194759h1();
        ArrayList arrayListM200339n = vwb.m200339n(CoreModule.f17545c.f19642f0.m32986hq(), new w9j() { // from class: l.nd6
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return rd6.m178876j0((Conversation) obj);
            }
        });
        if (vwb.m200323f(arrayListM200339n, new w9j() { // from class: l.od6
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return rd6.m178863B0(switchConvNextConfigM194759h1, (Conversation) obj);
            }
        }) < switchConvNextConfigM194759h1.exp_limit_count) {
            return;
        }
        d36.m109868c().m109877j(vwb.m200303Q(arrayListM200339n, new w9j() { // from class: l.pd6
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return ((Conversation) obj).f56011id;
            }
        }));
        if (d36.m109868c().m109871d(conversation.f56011id)) {
            d36.m109868c().f83463a.onNext(conversation.f56011id);
        } else {
            d36.m109868c().m109869a();
        }
    }

    /* JADX INFO: renamed from: V0 */
    default boolean m178911V0(boolean z) {
        if (upa.m194726a2()) {
            return false;
        }
        return z;
    }

    /* JADX INFO: renamed from: W */
    default boolean m178912W(dml dmlVar) {
        return (dmlVar instanceof ConversationsList.C8130e) && ((ConversationsList.C8130e) dmlVar).m41506E();
    }

    /* JADX INFO: renamed from: X */
    default boolean m178913X(Conversation conversation) {
        if (!CoreModule.m29935P().m94656g().mo35048b8() || !NullChecker.m81303a(conversation) || conversation.level != 90 || !NullChecker.m81303a(conversation.additional) || !NullChecker.m81303a(conversation.additional.pinChat)) {
            return false;
        }
        PlatinumPinChat platinumPinChat = conversation.additional.pinChat;
        return platinumPinChat.pin && platinumPinChat.expireTime > ((double) mqi0.m155944o());
    }

    /* JADX INFO: renamed from: Y */
    default boolean m178914Y(Conversation conversation) {
        if (NullChecker.m81303a(conversation)) {
            return TEnum.equals(conversation.status, "removed") || TEnum.equals(conversation.status, ConversationStatus.invisible);
        }
        return false;
    }

    /* JADX INFO: renamed from: Y0 */
    default String m178915Y0(UserLiveLabel userLiveLabel) {
        return CoreModule.m29936Q().mo67214Dr(userLiveLabel.multiCallInfo.role);
    }

    /* JADX INFO: renamed from: Z0 */
    default boolean m178916Z0(Conversation conversation) {
        return i36.m134149g().m134157l() && m178907T(conversation);
    }

    @Nullable
    /* JADX INFO: renamed from: a0 */
    default UserLiveLabel m178917a0(pi6 pi6Var, boolean z) {
        if (!CoreModule.f17545c.f19642f0.m33157vg(z).contains(pi6Var.f149101a.f56011id)) {
            return null;
        }
        if (!"group".equals(pi6Var.f149101a.convType)) {
            return m178942y(z, pi6Var.f149101a.f56011id);
        }
        UserLiveLabel userLiveLabelM178942y = m178942y(z, pi6Var.f149102b.f56011id);
        if (!NullChecker.m81303a(userLiveLabelM178942y) || pi6Var.f149101a.otherUser.equals(userLiveLabelM178942y.groupId)) {
            return userLiveLabelM178942y;
        }
        return null;
    }

    @org.jetbrains.annotations.Nullable
    /* JADX INFO: renamed from: a1 */
    default UserLiveLabel m178918a1(pi6 pi6Var) {
        boolean zM178911V0 = m178911V0(pi6Var.f149105e);
        if (!CoreModule.f17545c.f19642f0.m33157vg(zM178911V0).contains(pi6Var.f149101a.f56011id)) {
            return null;
        }
        if (!"group".equals(pi6Var.f149101a.convType)) {
            return CoreModule.f17545c.f19642f0.m33207zg(zM178911V0).get(pi6Var.f149101a.f56011id);
        }
        UserLiveLabel userLiveLabel = NullChecker.m81303a(pi6Var.f149102b) ? CoreModule.f17545c.f19642f0.m33207zg(zM178911V0).get(pi6Var.f149102b.f56011id) : null;
        if (!NullChecker.m81303a(userLiveLabel) || pi6Var.f149101a.otherUser.equals(userLiveLabel.groupId)) {
            return userLiveLabel;
        }
        return null;
    }

    /* JADX INFO: renamed from: b */
    default void m178919b(List<cpl> list, e30<cpl> e30Var) {
        if (vwb.m200296J(list)) {
            return;
        }
        for (int i = 0; i < list.size(); i++) {
            e30Var.call(list.get(i));
        }
    }

    /* JADX INFO: renamed from: b0 */
    default boolean m178920b0(String str, String str2) {
        long jM155944o = mqi0.m155944o();
        User userM169520na = CoreModule.f17545c.f19639e0.m169520na();
        User userM169524oa = CoreModule.f17545c.f19639e0.m169524oa(str);
        if (!NullChecker.m81303a(userM169524oa)) {
            return false;
        }
        double d = userM169520na.createdTime;
        if (jM155944o - ((long) d) < 86400000) {
            return true;
        }
        if (jM155944o - ((long) d) <= 86400000 || jM155944o - ((long) userM169524oa.createdTime) >= 86400000) {
            return false;
        }
        HashSet<String> hashSet = CoreModule.f17545c.f19639e0.f149447p3.get();
        if (CoreModule.f17545c.f19639e0.f149461r3.get().intValue() < 2 && hashSet.size() < 2 && !hashSet.contains(str)) {
            try {
                JSONObject jSONObject = !TextUtils.isEmpty(str2) ? new JSONObject(str2) : new JSONObject();
                jSONObject.put(str, ((long) userM169524oa.createdTime) + 86400000);
                CoreModule.f17545c.f19639e0.f149482u3.put(jSONObject.toString());
                tpd0 tpd0Var = CoreModule.f17545c.f19639e0.f149461r3;
                tpd0Var.put(Integer.valueOf(tpd0Var.get().intValue() + 1));
                hashSet.add(str);
                CoreModule.f17545c.f19639e0.f149447p3.put(hashSet);
            } catch (Exception unused) {
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: c0 */
    default boolean m178921c0(pi6 pi6Var) {
        return pi6Var.f149121u && TextUtils.equals(pi6Var.f149118r, CoreModule.m29931H().userId());
    }

    /* JADX INFO: renamed from: f */
    default boolean m178922f(Message message, User user, Conversation conversation) {
        return (!(NullChecker.m81303a(message) && TEnum.equals(message.status(), "failed") && NullChecker.m81303a(user) && !user.unilateralBlock()) && NullChecker.m81303a(conversation) && conversation.unreadMessages > 0) || m178908T0(conversation);
    }

    /* JADX INFO: renamed from: g */
    default String m178923g(dml dmlVar) {
        if (!(dmlVar instanceof p36)) {
            return "";
        }
        int iMo41522o = ((p36) dmlVar).mo41522o();
        if (iMo41522o == 0) {
            return "all";
        }
        if (iMo41522o == 1) {
            return LimitTimePictureStatus.unread;
        }
        if (iMo41522o == 2) {
            return "online";
        }
        if (iMo41522o == 4) {
            return "lifted";
        }
        if (iMo41522o == 6) {
            return "group";
        }
        if (iMo41522o != 7) {
            return iMo41522o != 8 ? "" : "hide";
        }
        return "deleted";
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: g0 */
    /* synthetic */ default void m178924g0(String str, RunnableC4733c0.c cVar, j760 j760Var) {
        if (NullChecker.m81303a(j760Var.f116564a) && mqi0.m155944o() >= ((ChatHeat) j760Var.f116564a).exclusiveChatStartTime) {
            double dM155944o = mqi0.m155944o();
            F f = j760Var.f116564a;
            if (dM155944o <= ((ChatHeat) f).exclusiveChatEndTime) {
                m178895J0(str, (long) ((ChatHeat) f).exclusiveChatStartTime, (long) ((ChatHeat) f).exclusiveChatEndTime, cVar);
                return;
            }
        }
        if (!NullChecker.m81303a(j760Var.f116564a) || mqi0.m155944o() < ((ChatHeat) j760Var.f116564a).exclusiveChatInviteTime) {
            return;
        }
        double dM155944o2 = mqi0.m155944o();
        F f2 = j760Var.f116564a;
        if (dM155944o2 > ((ChatHeat) f2).exclusiveChatInviteExpireTime || ((long) ((ChatHeat) f2).exclusiveChatStartTime) > 0) {
            return;
        }
        m178895J0(str, (long) ((ChatHeat) f2).exclusiveChatInviteTime, (long) ((ChatHeat) f2).exclusiveChatInviteExpireTime, cVar);
    }

    default HashMap<String, UserLiveLabel> getUserLiveLabelHashMap() {
        LinkedHashMap<String, UserLiveLabel> linkedHashMapM221515e = CoreModule.f17545c.f19642f0.f19846B2.m221515e();
        return linkedHashMapM221515e == null ? new HashMap<>() : linkedHashMapM221515e;
    }

    /* JADX INFO: renamed from: h */
    default void m178925h() {
        CoreModule.f17545c.f19642f0.m32665He();
    }

    /* JADX INFO: renamed from: i0 */
    default boolean m178926i0(Conversation conversation) {
        return false;
    }

    /* JADX INFO: renamed from: j */
    default boolean m178927j(Conversation conversation) {
        return NullChecker.m81303a(conversation) && conversation.isLimitMatch();
    }

    /* JADX INFO: renamed from: k */
    default void m178928k(User user) {
        if (user == null) {
            return;
        }
        if (user.isBannedNew()) {
            osi0.m165783g("对方账号异常");
        } else if (user.isDelIn()) {
            osi0.m165783g("我暂时离开几天~");
        } else if (user.isDelOut()) {
            osi0.m165783g("对方已注销");
        }
    }

    /* JADX INFO: renamed from: l */
    default boolean m178929l(Conversation conversation) {
        return NullChecker.m81303a(conversation) && NullChecker.m81303a(conversation.property) && NullChecker.m81303a(conversation.property.conversationTag) && conversation.property.conversationTag.showInList && conversation.userMessageCount == 1 && conversation.f20374mm == 0;
    }

    /* JADX INFO: renamed from: n */
    default boolean m178930n(Conversation conversation) {
        return false;
    }

    /* JADX INFO: renamed from: n0 */
    default boolean m178931n0(pi6 pi6Var) {
        if (m178926i0(pi6Var.f149101a)) {
            try {
                String str = CoreModule.f17545c.f19639e0.f149482u3.get();
                long jOptLong = (!TextUtils.isEmpty(str) ? new JSONObject(str) : new JSONObject()).optLong(pi6Var.f149101a.f56011id, 0L);
                if (m178920b0(pi6Var.f149101a.f56011id, str) && jOptLong != 0 && mqi0.m155944o() < jOptLong) {
                    return true;
                }
            } catch (Exception unused) {
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: o0 */
    default boolean m178932o0(pi6 pi6Var, Message message) {
        return false;
    }

    /* JADX INFO: renamed from: p */
    default Message m178933p(pi6 pi6Var) {
        return pi6Var.m169158a();
    }

    /* JADX INFO: renamed from: p0 */
    default boolean m178934p0(Conversation conversation) {
        if (m178905S(conversation) || m178929l(conversation)) {
            return TEnum.equals(conversation.status, "default") || TEnum.equals(conversation.status, "blocked");
        }
        return false;
    }

    /* JADX INFO: renamed from: q */
    default boolean m178935q(pi6 pi6Var) {
        Message messageM178933p;
        if (!upa.m194638G1() || User.isTeamAccount(pi6Var.f149101a.f56011id) || !TextUtils.equals(pi6Var.f149101a.convType, "default") || !TEnum.equals(pi6Var.f149101a.status, "default")) {
            return false;
        }
        Conversation conversation = pi6Var.f149101a;
        return conversation.unreadMessages == 0 && conversation.f20374mm <= upa.m194688R() && (messageM178933p = m178933p(pi6Var)) != null && !messageM178933p.isMe() && !m178922f(messageM178933p, pi6Var.f149102b, pi6Var.f149101a) && ((double) mqi0.m155944o()) - messageM178933p.createdTime < ((double) (((long) upa.m194696T()) * 86400000));
    }

    @Nullable
    /* JADX INFO: renamed from: r0 */
    default String m178936r0(pi6 pi6Var) {
        if (!CoreModule.f17545c.f19642f0.m33157vg(m178911V0(pi6Var.f149105e)).contains(pi6Var.f149101a.f56011id) || !"group".equals(pi6Var.f149101a.convType)) {
            return "";
        }
        ChatGroup chatGroupM31920s6 = CoreModule.f17545c.f19645g0.m31920s6(pi6Var.f149101a.otherUser);
        return (NullChecker.m81303a(chatGroupM31920s6) && !vwb.m200296J(chatGroupM31920s6.avatars) && NullChecker.m81303a(chatGroupM31920s6.avatars.get(0).cover())) ? chatGroupM31920s6.avatars.get(0).cover().profileSmall().formatted() : "";
    }

    /* JADX INFO: renamed from: s */
    default boolean m178937s(Message message) {
        if (message.isMe()) {
            return true;
        }
        return NullChecker.m81303a(message.additionalData) && NullChecker.m81303a(message.additionalData.exchangePicture) && TextUtils.equals(message.additionalData.exchangePicture.status, ExchangePicture.finished);
    }

    /* JADX INFO: renamed from: u0 */
    default boolean m178938u0(pi6 pi6Var, Message message) {
        return (!m178907T(pi6Var.f149101a) || pi6Var.f149101a.hasRemoveLabel() || d9j.m110461d().mo94463a(pi6Var, message)) ? false : true;
    }

    /* JADX INFO: renamed from: w */
    default void m178939w(pi6 pi6Var) {
        Conversation conversation;
        UserLiveLabel userLiveLabel;
        LinkedHashMap<String, UserLiveLabel> linkedHashMapM221515e = CoreModule.f17545c.f19642f0.f19846B2.m221515e();
        if (linkedHashMapM221515e == null || (conversation = pi6Var.f149101a) == null || (userLiveLabel = linkedHashMapM221515e.get(conversation.otherUser)) == null || !userLiveLabel.ongoingCall) {
            return;
        }
        o6j0.m162859c("e_live_call_label", OMSDialogPositon.p_messages_view, new o6j0.C18854a[0]);
    }

    /* JADX INFO: renamed from: x */
    default boolean m178940x(pi6 pi6Var) {
        return NullChecker.m81303a(pi6Var.f149101a.property.intl_chat_source) && SummarizedPrivilegesId.spotLight.equals(pi6Var.f149101a.property.intl_chat_source.source);
    }

    /* JADX INFO: renamed from: x0 */
    default void m178941x0(final pi6 pi6Var) {
        if (NullChecker.m81303a(pi6Var.f149101a) && pi6Var.f149101a.isHeartbeatConv()) {
            o6j0.m162859c("e_heart_signal_conversation", OMSDialogPositon.p_messages_view, o6j0.C18854a.m162879i("is_fake", pi6Var.f149101a.isFakeHeartbeatConv()), o6j0.C18854a.m162878h("moments_user_id", pi6Var.f149101a.otherUser));
        }
        if (NullChecker.m81303a(pi6Var.f149101a) && ft4.m123008b().m123013f(pi6Var.f149101a)) {
            o6j0.m162859c("e_answer_question_tip", OMSDialogPositon.p_messages_view, new o6j0.C18854a[0]);
        }
        if (upa.m194683P2()) {
            d36.m109868c().m109869a();
            d36.m109868c().f83463a.onNext(null);
            e51.m114774y(new Runnable() { // from class: l.fd6
                @Override // java.lang.Runnable
                public final void run() {
                    this.f97009a.m178896K(pi6Var);
                }
            });
        }
    }

    /* JADX INFO: renamed from: y */
    default UserLiveLabel m178942y(boolean z, String str) {
        LinkedHashMap<String, UserLiveLabel> linkedHashMapM33207zg = CoreModule.f17545c.f19642f0.m33207zg(z);
        if (linkedHashMapM33207zg == null || linkedHashMapM33207zg.isEmpty()) {
            return null;
        }
        return linkedHashMapM33207zg.get(str);
    }

    /* JADX INFO: renamed from: C */
    static void m178864C(String str) {
    }
}
