package com.p000p1.mobile.putong.live.livingroom.archi.longlink.bean;

import android.annotation.SuppressLint;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import com.p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage;
import com.p1.mobile.longlink.msg.livechat.LongLinkChatMessage;
import com.p1.mobile.longlink.msg.liveroom.LongLinkLiveMessage;
import com.p1.mobile.longlink.msg.liveroom.LongLinkLiveVoiceActiveGiftMessage;
import com.p1.mobile.putong.live.base.data.BLiveAtUserInfo;
import com.p1.mobile.putong.live.base.data.BLiveSharedVoiceLiveInfo;
import com.p1.mobile.putong.live.base.data.BLiveTemplate;
import com.p1.mobile.putong.live.base.data.BLiveTemplateMenu;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.List;
import l.vwb;
import l.ypv;
import p002l.o7t;
import p002l.w220;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class LiveMessage {
    public static int DRAGON_INFO_CHAT_CATEGORY = 7;
    public static int MYSTERY_BOX_RECORD = 8;
    public static int NORMAL_CHAT_CATEGORY = 0;
    public static final String NOTIFY_BOTTOM = "notify_bottom";
    public static int VOICE_CHAT_CATEGORY = 1;
    public static int VOICE_CHAT_MIC_EMOJI_CATEGORY = 5;
    public static int VOICE_CHAT_VIRTUAL_NOTICE_CATEGORY = 6;
    public int actionType;
    public int category;
    public LongLinkChatMessage.LiveChatShadingConfig chatShadeConfig;
    public long createTime;
    private String currentUserId;
    private String dragonSchema;
    private String dragonTitle;
    public ExtInfo extInfo;
    public String h5Url;

    /* JADX INFO: renamed from: id */
    public String f3793id;
    public String layoutId;
    public LiveUserInfo liveUserInfo;
    public long localCreateTime;
    public List<BLiveTemplateMenu> menu;
    public String messageContent;
    private LongLinkSocketMessage.MysteryBoxRecord mysteryBoxRecord;
    public o7t notificationData;
    public long preMessageTime;
    public long preSeq;
    public long seq;
    private BLiveSharedVoiceLiveInfo sharedVoiceLiveInfo;
    public String source;
    public List<SpannableStringBuilder> spanList;
    public String traceJson;
    private String userIdentity;
    public boolean isErrorMessage = false;
    private boolean openGradientFlow = false;
    public boolean isLuFinished = false;
    private String messageType = LiveMessageType.OTHER;
    public boolean isImportantMsg = true;

    public static class ExtInfo {
        public String applyCallId;
        public BLiveAtUserInfo atUserInfo;
        public String auctionId;
        public String buttonScene;
        public String buttonSchema;
        public String buttonUserId;
        public BLiveAtUserInfo buttonUserInfo;
        public String callInviteId;
        public String followTrackName;
        public String followType;
        public String followUserId;
        public String gameId;
        public String liveId;
        public String msgName;
        public String roomId;
        public String scheme;
        public String toUserId;
        public LongLinkLiveMessage.VoiceVirtualAvatarInitNoticeMessage virtualAvatarNoticeMsg;
        public String voiceChatApplyId;
        public String voiceChatApplyUserId;
        public String voiceChatApplyUserName;
        public List<LongLinkLiveVoiceActiveGiftMessage.VoiceGiftItem> voiceGiftItems;
        public String voteRecordId;
        public int voiceFollowSource = -1;
        public boolean isSystemReplaceMessage = false;
        public boolean isVoiceCallApplyMessage = false;
        public String messageUserId = "";
        public boolean isImportantMsg = true;
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface LiveMessageType {
        public static final String DANMU = "bulletComment";
        public static final String GIFT_MESSAGE = "gift_message";
        public static final String JOIN_RED_PACKET = "join_red_packet";
        public static final String OTHER = "other";
        public static final String RED_PACKET_MESSAGE = "redpacket";
        public static final String SHOOT_GAME = "shootGame";
        public static final String VIRTUAL_VOICE_CALL_APPLY = "virtual_voice_call_apply";
    }

    public static LiveMessage create(BLiveTemplate bLiveTemplate, String str) {
        LiveMessage liveMessage = new LiveMessage();
        liveMessage.localCreateTime = System.currentTimeMillis();
        if (bLiveTemplate != null) {
            int i = bLiveTemplate.action;
            if (i == 2) {
                if (!TextUtils.isEmpty(bLiveTemplate.h5)) {
                    liveMessage.h5Url = bLiveTemplate.h5;
                    liveMessage.actionType = bLiveTemplate.action;
                }
                if (!TextUtils.isEmpty(str)) {
                    liveMessage.h5Url = str;
                    liveMessage.actionType = bLiveTemplate.action;
                }
            } else {
                if (i != 3) {
                    liveMessage.actionType = i;
                    return liveMessage;
                }
                if (!bLiveTemplate.menu.isEmpty()) {
                    liveMessage.menu = bLiveTemplate.menu;
                    liveMessage.actionType = bLiveTemplate.action;
                    return liveMessage;
                }
            }
        }
        return liveMessage;
    }

    public String getDragonSchema() {
        return this.dragonSchema;
    }

    public String getDragonTitle() {
        return this.dragonTitle;
    }

    public String getMessageType() {
        return this.messageType;
    }

    public LongLinkSocketMessage.MysteryBoxRecord getMysteryBoxRecord() {
        return this.mysteryBoxRecord;
    }

    public int getVoiceFollowSource() {
        ExtInfo extInfo = this.extInfo;
        if (extInfo != null) {
            return extInfo.voiceFollowSource;
        }
        return 0;
    }

    public boolean hasChatShadeConfig() {
        LongLinkChatMessage.LiveChatShadingConfig liveChatShadingConfig = this.chatShadeConfig;
        if (liveChatShadingConfig != null) {
            return liveChatShadingConfig.hasBackgroundColorConfig() || this.chatShadeConfig.hasBorderColorConfig();
        }
        return false;
    }

    public boolean isDanmuFoldMessage() {
        return TextUtils.equals(this.messageType, LiveMessageType.DANMU);
    }

    public LiveMessage isErrorMessage(boolean z) {
        this.isErrorMessage = z;
        return this;
    }

    public boolean isGiftMessage() {
        return TextUtils.equals(this.messageType, LiveMessageType.GIFT_MESSAGE);
    }

    public boolean isJoinRedPacketMessage() {
        return TextUtils.equals(this.messageType, LiveMessageType.JOIN_RED_PACKET);
    }

    public boolean isMatchTargetMessageType(String str) {
        return TextUtils.equals(this.messageType, str);
    }

    public boolean isNotifyMessage() {
        return TextUtils.equals(this.messageType, NOTIFY_BOTTOM);
    }

    public boolean isOpenGradientFlow() {
        return this.openGradientFlow;
    }

    public boolean isRedPacketFoldMessage() {
        return TextUtils.equals(this.messageType, LiveMessageType.RED_PACKET_MESSAGE);
    }

    public boolean isShootGameFoldMessage() {
        return TextUtils.equals(this.messageType, LiveMessageType.SHOOT_GAME);
    }

    public boolean isUserOwnMessage() {
        LiveUserInfo liveUserInfo = this.liveUserInfo;
        if (liveUserInfo == null) {
            return false;
        }
        if (TextUtils.equals(liveUserInfo.userId, ypv.a.D0())) {
            return true;
        }
        return w220.m24291b() && TextUtils.equals(this.liveUserInfo.userId, w220.m24290a());
    }

    public LiveMessage setCategory(int i) {
        this.category = i;
        return this;
    }

    public void setChatShadeConfig(LongLinkChatMessage.LiveChatShadingConfig liveChatShadingConfig) {
        if (liveChatShadingConfig != null) {
            this.chatShadeConfig = liveChatShadingConfig;
        }
    }

    public void setCreateTime(long j) {
        this.createTime = j;
    }

    public void setDragonModuleInfo(String str, String str2, int i, SpannableStringBuilder spannableStringBuilder) {
        this.dragonTitle = str;
        this.dragonSchema = str2;
        setCategory(i);
        setSpan(spannableStringBuilder);
    }

    public void setExtInfo(ExtInfo extInfo) {
        this.extInfo = extInfo;
    }

    public LiveMessage setId(String str) {
        this.f3793id = str;
        return this;
    }

    public LiveMessage setLayoutId(String str) {
        this.layoutId = str;
        return this;
    }

    public void setLiveMessageType(String str) {
        this.messageType = str;
    }

    public void setMessageContent(String str) {
        this.messageContent = str;
    }

    public void setMysteryBoxRecord(LongLinkSocketMessage.MysteryBoxRecord mysteryBoxRecord) {
        this.mysteryBoxRecord = mysteryBoxRecord;
        setCategory(MYSTERY_BOX_RECORD);
    }

    @SuppressLint({"WrongConstant"})
    public LiveMessage setNotificationMessage(o7t o7tVar) {
        this.messageType = NOTIFY_BOTTOM;
        this.notificationData = o7tVar;
        return this;
    }

    public void setOpenGradientFlow(boolean z) {
        this.openGradientFlow = z;
    }

    public void setPreMessageTime(long j) {
        this.preMessageTime = j;
    }

    public void setPreSeq(long j) {
        this.preSeq = j;
    }

    public LiveMessage setSeq(long j) {
        this.seq = j;
        return this;
    }

    public void setSharedVoiceLiveInfo(LongLinkChatMessage.SharedVoiceLiveInfo sharedVoiceLiveInfo) {
        if (sharedVoiceLiveInfo != null) {
            BLiveSharedVoiceLiveInfo bLiveSharedVoiceLiveInfoNew_ = BLiveSharedVoiceLiveInfo.new_();
            bLiveSharedVoiceLiveInfoNew_.audienceCount = sharedVoiceLiveInfo.getAudienceCount();
            bLiveSharedVoiceLiveInfoNew_.description = sharedVoiceLiveInfo.getDescription();
            bLiveSharedVoiceLiveInfoNew_.liveId = sharedVoiceLiveInfo.getLiveId();
            bLiveSharedVoiceLiveInfoNew_.roomId = sharedVoiceLiveInfo.getRoomId();
            bLiveSharedVoiceLiveInfoNew_.anchorId = sharedVoiceLiveInfo.getAnchorId();
            bLiveSharedVoiceLiveInfoNew_.voiceCallCount = sharedVoiceLiveInfo.getVoiceCallCount();
            this.sharedVoiceLiveInfo = bLiveSharedVoiceLiveInfoNew_;
        }
    }

    public LiveMessage setSpan(SpannableStringBuilder spannableStringBuilder) {
        this.spanList = vwb.f0(new SpannableStringBuilder[]{spannableStringBuilder});
        return this;
    }

    public LiveMessage setUser(LiveUserInfo liveUserInfo) {
        this.liveUserInfo = liveUserInfo;
        return this;
    }

    public void setUserIdentity(String str) {
        this.userIdentity = str;
    }

    public LiveMessage setSpan(List<SpannableStringBuilder> list) {
        this.spanList = list;
        return this;
    }

    public static LiveMessage create() {
        return create(null);
    }

    public static LiveMessage create(BLiveTemplate bLiveTemplate) {
        return create(bLiveTemplate, null);
    }
}
