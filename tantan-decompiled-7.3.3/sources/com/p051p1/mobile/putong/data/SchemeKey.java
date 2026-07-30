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
public class SchemeKey extends TEnum {
    public static final TEnumJsonAdapter<SchemeKey> JSON_ADAPTER;
    public static final TEnumProtobufAdapter<SchemeKey> PROTOBUF_ADAPTER;
    private static final Map<String, SchemeKey> _SchemeKey;
    public static final String accelerateMatch = "accelerateMatch";
    public static final String account = "account";
    public static final String actualnameVerify = "actualnameVerify";
    public static final String aiAvatar = "aiAvatar";
    public static final String ai_story = "ai_story";
    public static final String avatarExample = "avatarExample";
    public static final String ban_appeal = "ban.appeal";
    public static final String birthday = "birthday";
    public static final String boost = "boost";
    public static final String boostPurchase = "boostPurchase";
    public static final String browser = "browser";
    public static final String campingactivity = "campingactivity";
    public static final String chat = "chat";
    public static final String chatAppeal = "chatAppeal";
    public static final String coPay = "coPay";
    public static final String commonDialog = "commonDialog";
    public static final String contentAppeal = "contentAppeal";
    public static final String conversations = "conversations";
    public static final String creditscore = "creditscore";
    public static final String diamond = "diamond";
    public static final String edit = "edit";
    public static final String enterSuggestVoiceRoom = "enterSuggestVoiceRoom";
    public static final String enterVoiceChat = "enterVoiceChat";
    public static final String enterVoiceChatRoom = "enterVoiceChatRoom";
    public static final String enterVoiceRoom = "enterVoiceRoom";
    public static final String enterVoiceRoomPackageGiftRecall = "enterVoiceRoomPackageGiftRecall";
    public static final String fake2good = "fake2good";
    public static final String fake_batch_feedback = "fake-batch-feedback";
    public static final String femaleVIP = "femaleVIP";
    public static final String freeTrialPromotion = "freeTrialPromotion";
    public static final String friend = "friend";
    public static final String game_home = "game_home";
    public static final String goBack = "goBack";
    public static final String goTo = "goTo";
    public static final String group = "group";
    public static final String growth_explore = "growth_explore";
    public static final String h5pay = "h5pay";
    public static final String helpcenter = "helpcenter";
    public static final String home = "home";
    public static final String home_welcomeback = "home_welcomeback";
    public static final String horoscope = "horoscope";
    public static final String iLikes = "iLikes";
    public static final String imagePicker = "imagePicker";
    public static final String immersion_video = "immersion_video";
    private static final int int_actualnameVerify = 61;
    private static final int int_ban_appeal = 49;
    private static final int int_boostPurchase = 18;
    private static final int int_chat = 32;
    private static final int int_coPay = 62;
    private static final int int_conversations = 8;
    private static final int int_creditscore = 14;
    private static final int int_enterSuggestVoiceRoom = 76;
    private static final int int_enterVoiceRoom = 67;
    private static final int int_enterVoiceRoomPackageGiftRecall = 75;
    private static final int int_fake2good = 63;
    private static final int int_freeTrialPromotion = 34;
    private static final int int_friend = 55;
    private static final int int_goBack = 6;
    private static final int int_goTo = 5;
    private static final int int_group = 70;
    private static final int int_h5pay = 44;
    private static final int int_helpcenter = 40;
    private static final int int_home = 7;
    private static final int int_home_welcomeback = 74;
    private static final int int_imagePicker = 3;
    private static final int int_introPromotion = 35;
    private static final int int_join_group = 68;
    private static final int int_jumpToVoiceFrame = 73;
    private static final int int_likers = 24;
    private static final int int_live = 51;
    private static final int int_liveAnchor = 23;
    private static final int int_liveCover = 20;
    private static final int int_livePrivacy = 56;
    private static final int int_liveRight = 57;
    private static final int int_liveSetting = 69;
    private static final int int_liveSquare = 21;
    private static final int int_liveUserProfile = 66;
    private static final int int_local_message = 31;
    private static final int int_moment = 11;
    private static final int int_mytantan = 26;
    private static final int int_newMoment = 42;
    private static final int int_newmytantan_call2buysee = 64;
    private static final int int_officialChannel = 72;
    private static final int int_oms = 46;
    private static final int int_omsDialog = 77;
    private static final int int_profile = 10;
    private static final int int_profileEdit = 59;
    private static final int int_promotion = 37;
    private static final int int_push_call2buysee = 28;
    private static final int int_push_call2buysee_side_new = 29;
    private static final int int_quickChatPurchase = 33;
    private static final int int_realpicVerify = 60;
    private static final int int_secretcrush = 9;
    private static final int int_see = 15;
    private static final int int_seeLikes = 25;
    private static final int int_seePicks = 78;
    private static final int int_seePurchase = 17;
    private static final int int_setting = 4;
    private static final int int_setting_chooselocation = 41;
    private static final int int_share = 2;
    private static final int int_soulmate_home = 79;
    private static final int int_soulmate_question = 80;
    private static final int int_startVoiceLive = 53;
    private static final int int_studentVerify = 1;
    private static final int int_subscriptions = 48;
    private static final int int_superLikePurchase = 19;
    private static final int int_survey = 38;
    private static final int int_svip = 52;
    private static final int int_svipPurchase = 39;
    private static final int int_switchaccount = 13;
    private static final int int_topic = 58;
    private static final int int_topic_webview = 43;
    private static final int int_unknown_ = -1;
    private static final int int_user = 54;
    private static final int int_userCard = 27;
    private static final int int_user_voices = 30;
    private static final int int_verificationcenter = 22;
    private static final int int_vip = 12;
    private static final int int_vipPlusSeePurchase = 36;
    private static final int int_vipPurchase = 16;
    private static final int int_voiceChatRoom = 65;
    private static final int int_wallet = 50;
    private static final int int_webview = 0;
    private static final int int_webview_for_coda = 45;
    private static final int int_zendesk = 71;
    private static final int int_zhimaGoFailure = 47;
    public static final String intl520 = "intl520";
    public static final String intlNativeRecharge = "intlNativeRecharge";
    public static final String intlPurchase = "intlPurchase";
    public static final String intlTribe = "intlTribe";
    public static final String intlVoiceShipLinkJumpRoom = "intlVoiceShipLinkJumpRoom";
    public static final String intl_spam_control = "intl_spam_control";
    public static final String intlquickrecharge = "intlquickrecharge";
    public static final String introPromotion = "introPromotion";
    public static final String join_group = "join_group";
    public static final String jumpChat = "jumpChat";
    public static final String jumpIntlServiceCenter = "jumpIntlServiceCenter";
    public static final String jumpLiveFeedbackQuestionPage = "jumpLiveFeedbackQuestionPage";
    public static final String jumpMLNPage = "jumpMLNPage";
    public static final String jumpSuggestVoiceLive = "jumpSuggestVoiceLive";
    public static final String jumpToMarket = "jumpToMarket";
    public static final String jumpToVoiceFrame = "jumpToVoiceFrame";
    public static final String jumpToVoteManager = "jumpToVoteManager";
    public static final String jumpVoiceSquare = "jumpVoiceSquare";
    public static final String knowMyselfMK = "knowMyselfMK";
    public static final String knowMyselfShare = "knowMyselfShare";
    public static final String knowmetest = "knowmetest";
    public static final String likers = "likers";
    public static final String live = "live";
    public static final String liveAnchor = "liveAnchor";
    public static final String liveBannerCustom = "liveBannerCustom";
    public static final String liveCover = "liveCover";
    public static final String liveDynamic = "liveDynamic";
    public static final String livePrivacy = "livePrivacy";
    public static final String liveRight = "liveRight";
    public static final String liveSetting = "liveSetting";
    public static final String liveSquare = "liveSquare";
    public static final String liveUserProfile = "liveUserProfile";
    public static final String local_message = "local_message";
    public static final String loveBuzz = "loveBuzz";
    public static final String loveRadarSettings = "loveRadarSettings";
    public static final String marriageGuide = "marriageGuide";
    public static final String membership = "membership";
    public static final String mln = "mln";
    public static final String moment = "moment";
    public static final String moment_activities = "moment_activities";
    public static final String moment_inspire = "moment-inspire";
    public static final String monetization = "monetization";
    public static final String monetization_promotion = "monetization_promotion";
    public static final String myMeet = "myMeet";
    public static final String mytantan = "mytantan";
    public static final String newMoment = "newMoment";
    public static final String newmytantan_call2buysee = "newmytantan_call2buysee";
    public static final String officialChannel = "officialChannel";
    public static final String oms = "oms";
    public static final String omsDialog = "omsDialog";
    public static final String payment = "payment";
    public static final String pettune = "pettune";
    public static final String picksZoneEditProfile = "picksZoneEditProfile";
    public static final String privacy_management = "privacy_management";
    public static final String profile = "profile";
    public static final String profileEdit = "profileEdit";
    public static final String promotion = "promotion";
    public static final String push_call2buysee = "push_call2buysee";
    public static final String push_call2buysee_side_new = "push_call2buysee_side_new";
    public static final String quickChat2Floor = "quickChat2Floor";
    public static final String quickChatPurchase = "quickChatPurchase";
    public static final String quickChatV2 = "quickChatV2";
    public static final String quickchat = "quickchat";
    public static final String realpicVerify = "realpicVerify";
    public static final String regular_main_popup = "regular_main_popup";
    public static final String reject_msg = "reject_msg";
    public static final String sameline = "sameline";
    public static final String secretcrush = "secretcrush";
    public static final String see = "see";
    public static final String seeLikes = "seeLikes";
    public static final String seePicks = "seePicks";
    public static final String seePurchase = "seePurchase";
    public static final String sendMessage = "sendMessage";
    public static final String setting = "setting";
    public static final String setting_chooselocation = "setting_chooselocation";
    public static final String share = "share";
    public static final String shareUserCard = "shareUserCard";
    public static final String shareUserMoment = "shareUserMoment";
    public static final String soulmate_home = "soulmate_home";
    public static final String soulmate_question = "soulmate_question";
    public static final String sportsman = "sportsman";
    public static final String startVoiceLive = "startVoiceLive";
    public static final String studentVerify = "studentVerify";
    public static final String subscriptions = "subscriptions";
    public static final String superLikePurchase = "superLikePurchase";
    protected static HashSet<String> supportEnum = null;
    public static final String supremeGoldCard = "supremeGoldCard";
    public static final String survey = "survey";
    public static final String svip = "svip";
    public static final String svipPurchase = "svipPurchase";
    public static final String swapAnswer = "swapAnswer";
    public static final String switchaccount = "switchaccount";
    public static final String tarot = "tarot";
    public static final String topic = "topic";
    public static final String topic_webview = "topic_webview";
    public static final String trip = "trip";
    public static final String ultra = "ultra";
    public static final String unknown_ = "unknown_";
    public static final String user = "user";
    public static final String userCard = "userCard";
    public static final String user_mirror = "user_mirror";
    public static final String user_voices = "user_voices";
    public static final String ussswipe = "ussswipe";
    public static final String verification = "verification";
    public static final String verificationcenter = "verificationcenter";
    public static final String vip = "vip";
    public static final String vipPlusSeePurchase = "vipPlusSeePurchase";
    public static final String vipPurchase = "vipPurchase";
    public static final String visitors = "visitors";
    public static final String voiceChatRoom = "voiceChatRoom";
    public static final String voiceRight = "voiceRight";
    public static final String wallet = "wallet";
    public static final String web = "web";
    public static final String webview = "webview";
    public static final String webview_for_coda = "webview_for_coda";
    public static final String webview_popup = "webview_popup";
    public static final String youthVipPurchase = "youthVipPurchase";
    public static final String zendesk = "zendesk";
    public static final String zhimaGoFailure = "zhimaGoFailure";

    @Retention(RetentionPolicy.SOURCE)
    public @interface constants {
    }

    static {
        TEnumJsonAdapter<SchemeKey> tEnumJsonAdapter = new TEnumJsonAdapter<SchemeKey>() { // from class: com.p1.mobile.putong.data.SchemeKey.1
            @Override // com.p051p1.mobile.putong.data.tenum.TEnumJsonAdapter
            public SchemeKey newTEnum(String str, int i) {
                return SchemeKey.getForData(str, i);
            }
        };
        JSON_ADAPTER = tEnumJsonAdapter;
        supportEnum = new HashSet<>();
        PROTOBUF_ADAPTER = new TEnumProtobufAdapter<SchemeKey>() { // from class: com.p1.mobile.putong.data.SchemeKey.2
            @Override // com.p051p1.mobile.putong.data.tenum.TEnumProtobufAdapter
            public SchemeKey newTEnum(String str, int i) {
                return SchemeKey.getForData(str, i);
            }
        };
        tEnumJsonAdapter.addExtJsonValue("unknown_", -1);
        tEnumJsonAdapter.addExtJsonValue("webview", 0);
        tEnumJsonAdapter.addExtJsonValue(studentVerify, 1);
        tEnumJsonAdapter.addExtJsonValue("share", 2);
        tEnumJsonAdapter.addExtJsonValue(imagePicker, 3);
        tEnumJsonAdapter.addExtJsonValue("setting", 4);
        tEnumJsonAdapter.addExtJsonValue(goTo, 5);
        tEnumJsonAdapter.addExtJsonValue(goBack, 6);
        tEnumJsonAdapter.addExtJsonValue("home", 7);
        tEnumJsonAdapter.addExtJsonValue(conversations, 8);
        tEnumJsonAdapter.addExtJsonValue("secretcrush", 9);
        tEnumJsonAdapter.addExtJsonValue("profile", 10);
        tEnumJsonAdapter.addExtJsonValue("moment", 11);
        tEnumJsonAdapter.addExtJsonValue("vip", 12);
        tEnumJsonAdapter.addExtJsonValue(switchaccount, 13);
        tEnumJsonAdapter.addExtJsonValue(creditscore, 14);
        tEnumJsonAdapter.addExtJsonValue("see", 15);
        tEnumJsonAdapter.addExtJsonValue(vipPurchase, 16);
        tEnumJsonAdapter.addExtJsonValue(seePurchase, 17);
        tEnumJsonAdapter.addExtJsonValue(boostPurchase, 18);
        tEnumJsonAdapter.addExtJsonValue(superLikePurchase, 19);
        tEnumJsonAdapter.addExtJsonValue(liveCover, 20);
        tEnumJsonAdapter.addExtJsonValue(liveSquare, 21);
        tEnumJsonAdapter.addExtJsonValue("verificationcenter", 22);
        tEnumJsonAdapter.addExtJsonValue("liveAnchor", 23);
        tEnumJsonAdapter.addExtJsonValue("likers", 24);
        tEnumJsonAdapter.addExtJsonValue("seeLikes", 25);
        tEnumJsonAdapter.addExtJsonValue("mytantan", 26);
        tEnumJsonAdapter.addExtJsonValue("userCard", 27);
        tEnumJsonAdapter.addExtJsonValue(push_call2buysee, 28);
        tEnumJsonAdapter.addExtJsonValue(push_call2buysee_side_new, 29);
        tEnumJsonAdapter.addExtJsonValue(user_voices, 30);
        tEnumJsonAdapter.addExtJsonValue(local_message, 31);
        tEnumJsonAdapter.addExtJsonValue("chat", 32);
        tEnumJsonAdapter.addExtJsonValue(quickChatPurchase, 33);
        tEnumJsonAdapter.addExtJsonValue("freeTrialPromotion", 34);
        tEnumJsonAdapter.addExtJsonValue("introPromotion", 35);
        tEnumJsonAdapter.addExtJsonValue(vipPlusSeePurchase, 36);
        tEnumJsonAdapter.addExtJsonValue(promotion, 37);
        tEnumJsonAdapter.addExtJsonValue("survey", 38);
        tEnumJsonAdapter.addExtJsonValue(svipPurchase, 39);
        tEnumJsonAdapter.addExtJsonValue(helpcenter, 40);
        tEnumJsonAdapter.addExtJsonValue("setting_chooselocation", 41);
        tEnumJsonAdapter.addExtJsonValue(newMoment, 42);
        tEnumJsonAdapter.addExtJsonValue(topic_webview, 43);
        tEnumJsonAdapter.addExtJsonValue(h5pay, 44);
        tEnumJsonAdapter.addExtJsonValue(webview_for_coda, 45);
        tEnumJsonAdapter.addExtJsonValue(oms, 46);
        tEnumJsonAdapter.addExtJsonValue(zhimaGoFailure, 47);
        tEnumJsonAdapter.addExtJsonValue(subscriptions, 48);
        tEnumJsonAdapter.addExtJsonValue(ban_appeal, 49);
        tEnumJsonAdapter.addExtJsonValue("wallet", 50);
        tEnumJsonAdapter.addExtJsonValue("live", 51);
        tEnumJsonAdapter.addExtJsonValue("svip", 52);
        tEnumJsonAdapter.addExtJsonValue("startVoiceLive", 53);
        tEnumJsonAdapter.addExtJsonValue("user", 54);
        tEnumJsonAdapter.addExtJsonValue("friend", 55);
        tEnumJsonAdapter.addExtJsonValue(livePrivacy, 56);
        tEnumJsonAdapter.addExtJsonValue(liveRight, 57);
        tEnumJsonAdapter.addExtJsonValue("topic", 58);
        tEnumJsonAdapter.addExtJsonValue(profileEdit, 59);
        tEnumJsonAdapter.addExtJsonValue(realpicVerify, 60);
        tEnumJsonAdapter.addExtJsonValue(actualnameVerify, 61);
        tEnumJsonAdapter.addExtJsonValue(coPay, 62);
        tEnumJsonAdapter.addExtJsonValue(fake2good, 63);
        tEnumJsonAdapter.addExtJsonValue(newmytantan_call2buysee, 64);
        tEnumJsonAdapter.addExtJsonValue(voiceChatRoom, 65);
        tEnumJsonAdapter.addExtJsonValue(liveUserProfile, 66);
        tEnumJsonAdapter.addExtJsonValue(enterVoiceRoom, 67);
        tEnumJsonAdapter.addExtJsonValue("join_group", 68);
        tEnumJsonAdapter.addExtJsonValue(liveSetting, 69);
        tEnumJsonAdapter.addExtJsonValue("group", 70);
        tEnumJsonAdapter.addExtJsonValue(zendesk, 71);
        tEnumJsonAdapter.addExtJsonValue(officialChannel, 72);
        tEnumJsonAdapter.addExtJsonValue(jumpToVoiceFrame, 73);
        tEnumJsonAdapter.addExtJsonValue(home_welcomeback, int_home_welcomeback);
        tEnumJsonAdapter.addExtJsonValue(enterVoiceRoomPackageGiftRecall, int_enterVoiceRoomPackageGiftRecall);
        tEnumJsonAdapter.addExtJsonValue(enterSuggestVoiceRoom, 76);
        tEnumJsonAdapter.addExtJsonValue(omsDialog, 77);
        tEnumJsonAdapter.addExtJsonValue("seePicks", 78);
        tEnumJsonAdapter.addExtJsonValue(soulmate_home, 79);
        tEnumJsonAdapter.addExtJsonValue(soulmate_question, 80);
        supportEnum.add("webview");
        supportEnum.add(studentVerify);
        supportEnum.add("share");
        supportEnum.add(imagePicker);
        supportEnum.add("setting");
        supportEnum.add(goTo);
        supportEnum.add(goBack);
        supportEnum.add("home");
        supportEnum.add(conversations);
        supportEnum.add("secretcrush");
        supportEnum.add("profile");
        supportEnum.add("moment");
        supportEnum.add("vip");
        supportEnum.add(switchaccount);
        supportEnum.add(creditscore);
        supportEnum.add("see");
        supportEnum.add(vipPurchase);
        supportEnum.add(seePurchase);
        supportEnum.add(boostPurchase);
        supportEnum.add(superLikePurchase);
        supportEnum.add(liveCover);
        supportEnum.add(liveSquare);
        supportEnum.add("verificationcenter");
        supportEnum.add("liveAnchor");
        supportEnum.add("likers");
        supportEnum.add("seeLikes");
        supportEnum.add("mytantan");
        supportEnum.add("userCard");
        supportEnum.add(push_call2buysee);
        supportEnum.add(push_call2buysee_side_new);
        supportEnum.add(user_voices);
        supportEnum.add(local_message);
        supportEnum.add("chat");
        supportEnum.add(quickChatPurchase);
        supportEnum.add("freeTrialPromotion");
        supportEnum.add("introPromotion");
        supportEnum.add(vipPlusSeePurchase);
        supportEnum.add(promotion);
        supportEnum.add("survey");
        supportEnum.add(svipPurchase);
        supportEnum.add(helpcenter);
        supportEnum.add("setting_chooselocation");
        supportEnum.add(newMoment);
        supportEnum.add(topic_webview);
        supportEnum.add(h5pay);
        supportEnum.add(webview_for_coda);
        supportEnum.add(oms);
        supportEnum.add(zhimaGoFailure);
        supportEnum.add(subscriptions);
        supportEnum.add(ban_appeal);
        supportEnum.add("wallet");
        supportEnum.add("live");
        supportEnum.add("svip");
        supportEnum.add("startVoiceLive");
        supportEnum.add("user");
        supportEnum.add("friend");
        supportEnum.add(livePrivacy);
        supportEnum.add(liveRight);
        supportEnum.add("topic");
        supportEnum.add(profileEdit);
        supportEnum.add(realpicVerify);
        supportEnum.add(actualnameVerify);
        supportEnum.add(coPay);
        supportEnum.add(fake2good);
        supportEnum.add(newmytantan_call2buysee);
        supportEnum.add(voiceChatRoom);
        supportEnum.add(liveUserProfile);
        supportEnum.add(enterVoiceRoom);
        supportEnum.add("join_group");
        supportEnum.add(liveSetting);
        supportEnum.add("group");
        supportEnum.add(zendesk);
        supportEnum.add(officialChannel);
        supportEnum.add(jumpToVoiceFrame);
        supportEnum.add(home_welcomeback);
        supportEnum.add(enterVoiceRoomPackageGiftRecall);
        supportEnum.add(enterSuggestVoiceRoom);
        supportEnum.add(omsDialog);
        supportEnum.add("seePicks");
        supportEnum.add(soulmate_home);
        supportEnum.add(soulmate_question);
        supportEnum.add(jumpToVoteManager);
        supportEnum.add("immersion_video");
        supportEnum.add("browser");
        supportEnum.add(payment);
        supportEnum.add(liveDynamic);
        supportEnum.add(tarot);
        supportEnum.add(knowMyselfShare);
        supportEnum.add(game_home);
        supportEnum.add(supremeGoldCard);
        supportEnum.add("enterVoiceChat");
        supportEnum.add(ussswipe);
        supportEnum.add(knowmetest);
        supportEnum.add("quickChat2Floor");
        supportEnum.add(sameline);
        supportEnum.add(visitors);
        supportEnum.add(jumpVoiceSquare);
        supportEnum.add(knowMyselfMK);
        supportEnum.add(mln);
        supportEnum.add(horoscope);
        supportEnum.add(shareUserCard);
        supportEnum.add(shareUserMoment);
        supportEnum.add(fake_batch_feedback);
        supportEnum.add(chatAppeal);
        supportEnum.add(jumpMLNPage);
        supportEnum.add(pettune);
        supportEnum.add(web);
        supportEnum.add("loveBuzz");
        supportEnum.add(jumpToMarket);
        supportEnum.add(sportsman);
        supportEnum.add("trip");
        supportEnum.add(myMeet);
        supportEnum.add(intlquickrecharge);
        supportEnum.add("diamond");
        supportEnum.add(contentAppeal);
        supportEnum.add(monetization);
        supportEnum.add(sendMessage);
        supportEnum.add(jumpChat);
        supportEnum.add(intl520);
        supportEnum.add(monetization_promotion);
        supportEnum.add(campingactivity);
        supportEnum.add(enterVoiceChatRoom);
        supportEnum.add("regular_main_popup");
        supportEnum.add(moment_activities);
        supportEnum.add(moment_inspire);
        supportEnum.add(ai_story);
        supportEnum.add(jumpSuggestVoiceLive);
        supportEnum.add("boost");
        supportEnum.add("membership");
        supportEnum.add(intlNativeRecharge);
        supportEnum.add(webview_popup);
        supportEnum.add(accelerateMatch);
        supportEnum.add("verification");
        supportEnum.add(edit);
        supportEnum.add(marriageGuide);
        supportEnum.add(aiAvatar);
        supportEnum.add(intl_spam_control);
        supportEnum.add(picksZoneEditProfile);
        supportEnum.add(voiceRight);
        supportEnum.add(loveRadarSettings);
        supportEnum.add("quickchat");
        supportEnum.add(iLikes);
        supportEnum.add(growth_explore);
        supportEnum.add(commonDialog);
        supportEnum.add(jumpIntlServiceCenter);
        supportEnum.add(femaleVIP);
        supportEnum.add(youthVipPurchase);
        supportEnum.add(avatarExample);
        supportEnum.add(liveBannerCustom);
        supportEnum.add(intlVoiceShipLinkJumpRoom);
        supportEnum.add(swapAnswer);
        supportEnum.add(user_mirror);
        supportEnum.add(privacy_management);
        supportEnum.add(reject_msg);
        supportEnum.add("birthday");
        supportEnum.add(account);
        supportEnum.add(quickChatV2);
        supportEnum.add("intlTribe");
        supportEnum.add(jumpLiveFeedbackQuestionPage);
        supportEnum.add(intlPurchase);
        supportEnum.add("ultra");
        _SchemeKey = Collections.synchronizedMap(new l01());
    }

    @Deprecated
    private SchemeKey(String str, int i) {
        super(str, i);
        String str2 = this.name;
        if (str2 == null || str2.length() == 0) {
            this.name = JSON_ADAPTER.getString(Integer.valueOf(i));
            if (str == null) {
                this.name = "unknown_";
            }
        }
    }

    public static List<Integer> covertToOldEnumList(List<SchemeKey> list) {
        ArrayList arrayList = new ArrayList();
        Iterator<SchemeKey> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(it.next().ordinal()));
        }
        return arrayList;
    }

    public static Map<String, Integer> covertToOldEnumMap(Map<String, SchemeKey> map) {
        l01 l01Var = new l01();
        for (Map.Entry<String, SchemeKey> entry : map.entrySet()) {
            l01Var.put(entry.getKey(), Integer.valueOf(entry.getValue().ordinal()));
        }
        return l01Var;
    }

    public static SchemeKey get(String str) {
        Map<String, SchemeKey> map = _SchemeKey;
        SchemeKey schemeKey = map.get(str);
        if (schemeKey == null) {
            Integer integer = JSON_ADAPTER.getInteger(str);
            schemeKey = integer == null ? new SchemeKey(str, -1) : new SchemeKey(str, integer.intValue());
            map.put(str, schemeKey);
        }
        return schemeKey;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static SchemeKey getForData(String str, int i) {
        if (str == null) {
            str = JSON_ADAPTER.getString(Integer.valueOf(i));
        }
        return get(str);
    }

    public static List<SchemeKey> oldEnumCovertList(List<Integer> list) {
        ArrayList arrayList = new ArrayList();
        for (Integer num : list) {
            if (num == null) {
                num = -1;
            }
            arrayList.add(get(num.intValue()));
        }
        return arrayList;
    }

    public static Map<String, SchemeKey> oldEnumCovertMap(Map<String, Integer> map) {
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

    private static SchemeKey get(int i) {
        String string = JSON_ADAPTER.getString(Integer.valueOf(i));
        if (string == null) {
            string = "unknown_";
        }
        return get(string);
    }
}
