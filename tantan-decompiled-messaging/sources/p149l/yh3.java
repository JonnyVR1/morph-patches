package p149l;

import com.p046p1.mobile.longlink.msg.gift.LongLinkGiftMessage;
import com.p046p1.mobile.longlink.msg.voicelivemessage.VoiceLiveBullet;

/* JADX INFO: loaded from: classes5.dex */
public class yh3 {
    /* JADX INFO: renamed from: a */
    public static VoiceLiveBullet.SystemVoiceLiveCommentBackground m214783a(LongLinkGiftMessage.SystemLiveCommentBackground systemLiveCommentBackground) {
        VoiceLiveBullet.SystemVoiceLiveCommentBackground.Builder builderNewBuilder = VoiceLiveBullet.SystemVoiceLiveCommentBackground.newBuilder();
        builderNewBuilder.setBottomImgUrl(systemLiveCommentBackground.getBottomImgUrl()).setCoverImgUrl(systemLiveCommentBackground.getCoverImgUrl()).setHeaderImgUrl(systemLiveCommentBackground.getHeaderImgUrl()).setMiddleImgUrl(systemLiveCommentBackground.getMiddleImgUrl());
        return builderNewBuilder.build();
    }

    /* JADX INFO: renamed from: b */
    public static VoiceLiveBullet.TemplateData m214784b(LongLinkGiftMessage.TemplateData templateData) {
        VoiceLiveBullet.TemplateData.Builder builderNewBuilder = VoiceLiveBullet.TemplateData.newBuilder();
        builderNewBuilder.setId(templateData.getId());
        return builderNewBuilder.build();
    }

    /* JADX INFO: renamed from: c */
    public static VoiceLiveBullet.SystemVoiceLiveCommentsMsg m214785c(LongLinkGiftMessage.SystemLiveCommentsMsg systemLiveCommentsMsg) {
        VoiceLiveBullet.SystemVoiceLiveCommentsMsg.Builder builderNewBuilder = VoiceLiveBullet.SystemVoiceLiveCommentsMsg.newBuilder();
        builderNewBuilder.setAlignment(VoiceLiveBullet.Alignment.forNumber(systemLiveCommentsMsg.getAlignment().getNumber())).setBackground(m214783a(systemLiveCommentsMsg.getBackground())).setStartColor(systemLiveCommentsMsg.getStartColor()).setEndColor(systemLiveCommentsMsg.getEndColor()).setIconUrl(systemLiveCommentsMsg.getIconUrl()).setRoomID(systemLiveCommentsMsg.getRoomID()).setDisplayDuration(systemLiveCommentsMsg.getDisplayDuration()).setTemplateData(m214784b(systemLiveCommentsMsg.getTemplate())).setGotoSchema(systemLiveCommentsMsg.getGotoSchema()).setId(systemLiveCommentsMsg.getId()).setPriority(systemLiveCommentsMsg.getPriority());
        return builderNewBuilder.build();
    }
}
