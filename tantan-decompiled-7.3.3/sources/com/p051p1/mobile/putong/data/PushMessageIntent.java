package com.p051p1.mobile.putong.data;

import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.p051p1.mobile.putong.data.tenum.TEnumJsonAdapter;
import com.p051p1.mobile.putong.data.tenum.TEnumProtobufAdapter;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p153l.l01;

/* JADX INFO: loaded from: classes12.dex */
public class PushMessageIntent extends TEnum {
    public static final TEnumJsonAdapter<PushMessageIntent> JSON_ADAPTER;
    public static final TEnumProtobufAdapter<PushMessageIntent> PROTOBUF_ADAPTER;
    private static final Map<String, PushMessageIntent> _PushMessageIntent;
    public static final String call_voice_single = "call.voice.single";
    public static final String call_voiceinviting_single = "call.voiceinviting.single";
    public static final String chat_conversation_other_read = "chat.conversation.other_read";
    public static final String conversation_group = "conversation.group";
    public static final String conversation_group_update = "conversation.group.update";
    public static final String conversation_list = "conversation.list";
    public static final String conversation_notify = "conversation.notify";
    public static final String conversation_single = "conversation.single";
    public static final String conversation_single_blocked = "conversation.single.blocked";
    public static final String conversation_single_delete = "conversation.single.delete";
    public static final String conversation_single_self_delete = "conversation.single.self.delete";
    public static final String conversation_single_update_oneside = "conversation.single.update.oneside";
    public static final String followship_conversation_list = "followship.conversation.list";
    public static final String followship_single = "followship.single";
    public static final String friend_reminder = "friend.reminder";
    public static final String friendship_request = "friendship.request";
    public static final String growth_follow = "growth.follow";
    public static final String growth_match_recall = "growth.match.recall";
    public static final String home_picks = "home.picks";
    public static final String huawei_unreadMsg = "huawei.unreadMsg";
    private static final int int_call_voice_single = 45;
    private static final int int_call_voiceinviting_single = 49;
    private static final int int_chat_conversation_other_read = 47;
    private static final int int_conversation_group = 53;
    private static final int int_conversation_group_update = 54;
    private static final int int_conversation_list = 4;
    private static final int int_conversation_notify = 50;
    private static final int int_conversation_single = 3;
    private static final int int_conversation_single_blocked = 32;
    private static final int int_conversation_single_delete = 1;
    private static final int int_conversation_single_self_delete = 51;
    private static final int int_conversation_single_update_oneside = 55;
    private static final int int_followship_conversation_list = 19;
    private static final int int_followship_single = 18;
    private static final int int_friend_reminder = 33;
    private static final int int_friendship_request = 15;
    private static final int int_growth_follow = 30;
    private static final int int_home_picks = 24;
    private static final int int_letter_received = 29;
    private static final int int_live_anchor_push = 40;
    private static final int int_live_living_push = 31;
    private static final int int_live_square_push = 37;
    private static final int int_local_message_secret = 8;
    private static final int int_lucky_money_received = 26;
    private static final int int_lucky_money_taken = 27;
    private static final int int_membership_givecoin = 46;
    private static final int int_message_single_update = 2;
    private static final int int_moment_match_post = 16;
    private static final int int_moment_single_comment = 7;
    private static final int int_moment_single_like = 6;
    private static final int int_moment_single_unlike = 0;
    private static final int int_oms_reload = 48;
    private static final int int_pcs_broadcast_status = 38;
    private static final int int_promotion_platform_reload = 43;
    private static final int int_push_arrival_ab_local_push = 23;
    private static final int int_push_pay_landpage = 52;
    private static final int int_quickchat_broadcast = 36;
    private static final int int_quickchat_match = 34;
    private static final int int_rev_low_price = 25;
    private static final int int_sayHiLiked_received = 28;
    private static final int int_secretcrush_received = 9;
    private static final int int_see_picks = 56;
    private static final int int_selectedcard_received = 35;
    private static final int int_shuoshuo_callback = 41;
    private static final int int_soulship_agree = 39;
    private static final int int_suggested_liked = 22;
    private static final int int_suggested_list = 5;
    private static final int int_superLike_invite = 11;
    private static final int int_superLike_received = 10;
    private static final int int_unknown_ = -1;
    private static final int int_user_idcard_verification = 44;
    private static final int int_user_membership_changed = 17;
    private static final int int_user_picture_verification = 21;
    private static final int int_user_state_changed = 20;
    private static final int int_user_status_changed = 12;
    private static final int int_user_status_good2fake = 13;
    private static final int int_user_verification_reason = 14;
    private static final int int_xlog_upload = 42;
    public static final String letter_received = "letter.received";
    public static final String live_anchor_push = "live.anchor.push";
    public static final String live_living_push = "live.living.push";
    public static final String live_square_push = "live.square.push";
    public static final String local_message_secret = "local.message.secret";
    public static final String lucky_money_received = "lucky.money.received";
    public static final String lucky_money_taken = "lucky.money.taken";
    public static final String membership_expiration = "membership.expiration";
    public static final String membership_givecoin = "membership.givecoin";
    public static final String message_single_update = "message.single.update";
    public static final String moment_match_post = "moment.match.post";
    public static final String moment_single_comment = "moment.single.comment";
    public static final String moment_single_like = "moment.single.like";
    public static final String moment_single_unlike = "moment.single.unlike";
    public static final String oms_reload = "oms.reload";
    public static final String pcs_broadcast_status = "pcs.broadcast.status";
    public static final String promotion_platform_reload = "promotion.platform.reload";
    public static final String push_arrival_ab_local_push = "push.arrival.ab.local.push";
    public static final String push_pay_landpage = "push.pay.landpage";
    public static final String quickchat_broadcast = "quickchat.broadcast";
    public static final String quickchat_match = "quickchat.match";
    public static final String rev_low_price = "rev.low.price";
    public static final String sayHiLiked_received = "sayHiLiked.received";
    public static final String secretcrush_received = "secretcrush.received";
    public static final String see_picks = "see.picks";
    public static final String selectedcard_received = "selectedcard.received";
    public static final String shuoshuo_callback = "shuoshuo.callback";
    public static final String soulship_agree = "soulship.agree";
    public static final String suggest_swipe = "suggest.swipe";
    public static final String suggested_liked = "suggested.liked";
    public static final String suggested_list = "suggested.list";
    public static final String superLike_invite = "superLike.invite";
    public static final String superLike_received = "superLike.received";
    protected static HashSet<String> supportEnum = null;
    public static final String unknown_ = "unknown_";
    public static final String user_idcard_verification = "user.idcard.verification";
    public static final String user_membership_changed = "user.membership.changed";
    public static final String user_picture_verification = "user.picture.verification";
    public static final String user_state_changed = "user.state.changed";
    public static final String user_status_changed = "user.status.changed";
    public static final String user_status_good2fake = "user.status.good2fake";
    public static final String user_verification_reason = "user.verification.reason";
    public static final String xlog_upload = "xlog.upload";

    @Retention(RetentionPolicy.SOURCE)
    public @interface constants {
    }

    static {
        TEnumJsonAdapter<PushMessageIntent> tEnumJsonAdapter = new TEnumJsonAdapter<PushMessageIntent>() { // from class: com.p1.mobile.putong.data.PushMessageIntent.1
            @Override // com.p051p1.mobile.putong.data.tenum.TEnumJsonAdapter
            public PushMessageIntent newTEnum(String str, int i) {
                return PushMessageIntent.getForData(str, i);
            }
        };
        JSON_ADAPTER = tEnumJsonAdapter;
        supportEnum = new HashSet<>();
        PROTOBUF_ADAPTER = new TEnumProtobufAdapter<PushMessageIntent>() { // from class: com.p1.mobile.putong.data.PushMessageIntent.2
            @Override // com.p051p1.mobile.putong.data.tenum.TEnumProtobufAdapter
            public PushMessageIntent newTEnum(String str, int i) {
                return PushMessageIntent.getForData(str, i);
            }
        };
        tEnumJsonAdapter.addExtJsonValue("unknown_", -1);
        tEnumJsonAdapter.addExtJsonValue(moment_single_unlike, 0);
        tEnumJsonAdapter.addExtJsonValue(conversation_single_delete, 1);
        tEnumJsonAdapter.addExtJsonValue(message_single_update, 2);
        tEnumJsonAdapter.addExtJsonValue(conversation_single, 3);
        tEnumJsonAdapter.addExtJsonValue(conversation_list, 4);
        tEnumJsonAdapter.addExtJsonValue(suggested_list, 5);
        tEnumJsonAdapter.addExtJsonValue(moment_single_like, 6);
        tEnumJsonAdapter.addExtJsonValue(moment_single_comment, 7);
        tEnumJsonAdapter.addExtJsonValue(local_message_secret, 8);
        tEnumJsonAdapter.addExtJsonValue(secretcrush_received, 9);
        tEnumJsonAdapter.addExtJsonValue(superLike_received, 10);
        tEnumJsonAdapter.addExtJsonValue(superLike_invite, 11);
        tEnumJsonAdapter.addExtJsonValue(user_status_changed, 12);
        tEnumJsonAdapter.addExtJsonValue(user_status_good2fake, 13);
        tEnumJsonAdapter.addExtJsonValue(user_verification_reason, 14);
        tEnumJsonAdapter.addExtJsonValue(friendship_request, 15);
        tEnumJsonAdapter.addExtJsonValue(moment_match_post, 16);
        tEnumJsonAdapter.addExtJsonValue(user_membership_changed, 17);
        tEnumJsonAdapter.addExtJsonValue(followship_single, 18);
        tEnumJsonAdapter.addExtJsonValue(followship_conversation_list, 19);
        tEnumJsonAdapter.addExtJsonValue(user_state_changed, 20);
        tEnumJsonAdapter.addExtJsonValue(user_picture_verification, 21);
        tEnumJsonAdapter.addExtJsonValue(suggested_liked, 22);
        tEnumJsonAdapter.addExtJsonValue(push_arrival_ab_local_push, 23);
        tEnumJsonAdapter.addExtJsonValue(home_picks, 24);
        tEnumJsonAdapter.addExtJsonValue(rev_low_price, 25);
        tEnumJsonAdapter.addExtJsonValue(lucky_money_received, 26);
        tEnumJsonAdapter.addExtJsonValue(lucky_money_taken, 27);
        tEnumJsonAdapter.addExtJsonValue(sayHiLiked_received, 28);
        tEnumJsonAdapter.addExtJsonValue(letter_received, 29);
        tEnumJsonAdapter.addExtJsonValue(growth_follow, 30);
        tEnumJsonAdapter.addExtJsonValue(live_living_push, 31);
        tEnumJsonAdapter.addExtJsonValue(conversation_single_blocked, 32);
        tEnumJsonAdapter.addExtJsonValue(friend_reminder, 33);
        tEnumJsonAdapter.addExtJsonValue(quickchat_match, 34);
        tEnumJsonAdapter.addExtJsonValue(selectedcard_received, 35);
        tEnumJsonAdapter.addExtJsonValue(quickchat_broadcast, 36);
        tEnumJsonAdapter.addExtJsonValue(live_square_push, 37);
        tEnumJsonAdapter.addExtJsonValue(pcs_broadcast_status, 38);
        tEnumJsonAdapter.addExtJsonValue(soulship_agree, 39);
        tEnumJsonAdapter.addExtJsonValue(live_anchor_push, 40);
        tEnumJsonAdapter.addExtJsonValue(shuoshuo_callback, 41);
        tEnumJsonAdapter.addExtJsonValue(xlog_upload, 42);
        tEnumJsonAdapter.addExtJsonValue(promotion_platform_reload, 43);
        tEnumJsonAdapter.addExtJsonValue(user_idcard_verification, 44);
        tEnumJsonAdapter.addExtJsonValue(call_voice_single, 45);
        tEnumJsonAdapter.addExtJsonValue(membership_givecoin, 46);
        tEnumJsonAdapter.addExtJsonValue(chat_conversation_other_read, 47);
        tEnumJsonAdapter.addExtJsonValue(oms_reload, 48);
        tEnumJsonAdapter.addExtJsonValue(call_voiceinviting_single, 49);
        tEnumJsonAdapter.addExtJsonValue(conversation_notify, 50);
        tEnumJsonAdapter.addExtJsonValue(conversation_single_self_delete, 51);
        tEnumJsonAdapter.addExtJsonValue(push_pay_landpage, 52);
        tEnumJsonAdapter.addExtJsonValue(conversation_group, 53);
        tEnumJsonAdapter.addExtJsonValue(conversation_group_update, 54);
        tEnumJsonAdapter.addExtJsonValue(conversation_single_update_oneside, 55);
        tEnumJsonAdapter.addExtJsonValue(see_picks, 56);
        supportEnum.add(moment_single_unlike);
        supportEnum.add(conversation_single_delete);
        supportEnum.add(message_single_update);
        supportEnum.add(conversation_single);
        supportEnum.add(conversation_list);
        supportEnum.add(suggested_list);
        supportEnum.add(moment_single_like);
        supportEnum.add(moment_single_comment);
        supportEnum.add(local_message_secret);
        supportEnum.add(secretcrush_received);
        supportEnum.add(superLike_received);
        supportEnum.add(superLike_invite);
        supportEnum.add(user_status_changed);
        supportEnum.add(user_status_good2fake);
        supportEnum.add(user_verification_reason);
        supportEnum.add(friendship_request);
        supportEnum.add(moment_match_post);
        supportEnum.add(user_membership_changed);
        supportEnum.add(followship_single);
        supportEnum.add(followship_conversation_list);
        supportEnum.add(user_state_changed);
        supportEnum.add(user_picture_verification);
        supportEnum.add(suggested_liked);
        supportEnum.add(push_arrival_ab_local_push);
        supportEnum.add(home_picks);
        supportEnum.add(rev_low_price);
        supportEnum.add(lucky_money_received);
        supportEnum.add(lucky_money_taken);
        supportEnum.add(sayHiLiked_received);
        supportEnum.add(letter_received);
        supportEnum.add(growth_follow);
        supportEnum.add(live_living_push);
        supportEnum.add(conversation_single_blocked);
        supportEnum.add(friend_reminder);
        supportEnum.add(quickchat_match);
        supportEnum.add(selectedcard_received);
        supportEnum.add(quickchat_broadcast);
        supportEnum.add(live_square_push);
        supportEnum.add(pcs_broadcast_status);
        supportEnum.add(soulship_agree);
        supportEnum.add(live_anchor_push);
        supportEnum.add(shuoshuo_callback);
        supportEnum.add(xlog_upload);
        supportEnum.add(promotion_platform_reload);
        supportEnum.add(user_idcard_verification);
        supportEnum.add(call_voice_single);
        supportEnum.add(membership_givecoin);
        supportEnum.add(chat_conversation_other_read);
        supportEnum.add(oms_reload);
        supportEnum.add(call_voiceinviting_single);
        supportEnum.add(conversation_notify);
        supportEnum.add(conversation_single_self_delete);
        supportEnum.add(push_pay_landpage);
        supportEnum.add(conversation_group);
        supportEnum.add(conversation_group_update);
        supportEnum.add(conversation_single_update_oneside);
        supportEnum.add(see_picks);
        supportEnum.add(suggest_swipe);
        supportEnum.add(huawei_unreadMsg);
        supportEnum.add(growth_match_recall);
        supportEnum.add(membership_expiration);
        _PushMessageIntent = Collections.synchronizedMap(new l01());
    }

    @Deprecated
    private PushMessageIntent(String str, int i) {
        super(str, i);
        String str2 = this.name;
        if (str2 == null || str2.length() == 0) {
            this.name = JSON_ADAPTER.getString(Integer.valueOf(i));
            if (str == null) {
                this.name = "unknown_";
            }
        }
    }

    public static List<Integer> covertToOldEnumList(List<PushMessageIntent> list) {
        ArrayList arrayList = new ArrayList();
        Iterator<PushMessageIntent> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(it.next().ordinal()));
        }
        return arrayList;
    }

    public static Map<String, Integer> covertToOldEnumMap(Map<String, PushMessageIntent> map) {
        l01 l01Var = new l01();
        for (Map.Entry<String, PushMessageIntent> entry : map.entrySet()) {
            l01Var.put(entry.getKey(), Integer.valueOf(entry.getValue().ordinal()));
        }
        return l01Var;
    }

    public static PushMessageIntent get(String str) {
        Map<String, PushMessageIntent> map = _PushMessageIntent;
        PushMessageIntent pushMessageIntent = map.get(str);
        if (pushMessageIntent == null) {
            Integer integer = JSON_ADAPTER.getInteger(str);
            pushMessageIntent = integer == null ? new PushMessageIntent(str, -1) : new PushMessageIntent(str, integer.intValue());
            map.put(str, pushMessageIntent);
        }
        return pushMessageIntent;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static PushMessageIntent getForData(String str, int i) {
        if (str == null) {
            str = JSON_ADAPTER.getString(Integer.valueOf(i));
        }
        return get(str);
    }

    public static List<PushMessageIntent> oldEnumCovertList(List<Integer> list) {
        ArrayList arrayList = new ArrayList();
        for (Integer num : list) {
            if (num == null) {
                num = -1;
            }
            arrayList.add(get(num.intValue()));
        }
        return arrayList;
    }

    public static Map<String, PushMessageIntent> oldEnumCovertMap(Map<String, Integer> map) {
        l01 l01Var = new l01();
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getValue() == null) {
                entry.setValue(-1);
            }
            l01Var.put(entry.getKey(), get(entry.getValue().intValue()));
        }
        return l01Var;
    }

    public boolean equals(String str) {
        return name().equals(str);
    }

    public boolean isUnknownType() {
        if (equals("unknown_")) {
            return true;
        }
        return !supportEnum.contains(this.name);
    }

    private static PushMessageIntent get(int i) {
        String string = JSON_ADAPTER.getString(Integer.valueOf(i));
        if (string == null) {
            string = "unknown_";
        }
        return get(string);
    }
}
