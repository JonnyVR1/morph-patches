package p153l;

import com.p051p1.mobile.longlink.msg.gift.LongLinkGiftMessage;
import com.p051p1.mobile.longlink.msg.voicelivemessage.VoiceLiveBullet;

/* JADX INFO: loaded from: classes5.dex */
public class mi3 {
    /* JADX INFO: renamed from: a */
    public static VoiceLiveBullet.SystemVoiceLiveCommentBackground m158462a(LongLinkGiftMessage.SystemLiveCommentBackground systemLiveCommentBackground) {
        VoiceLiveBullet.SystemVoiceLiveCommentBackground.Builder builderNewBuilder = VoiceLiveBullet.SystemVoiceLiveCommentBackground.newBuilder();
        builderNewBuilder.setBottomImgUrl(systemLiveCommentBackground.getBottomImgUrl()).setCoverImgUrl(systemLiveCommentBackground.getCoverImgUrl()).setHeaderImgUrl(systemLiveCommentBackground.getHeaderImgUrl()).setMiddleImgUrl(systemLiveCommentBackground.getMiddleImgUrl());
        return builderNewBuilder.build();
    }

    /* JADX INFO: renamed from: b */
    public static VoiceLiveBullet.TemplateData m158463b(LongLinkGiftMessage.TemplateData templateData) {
        VoiceLiveBullet.TemplateData.Builder builderNewBuilder = VoiceLiveBullet.TemplateData.newBuilder();
        builderNewBuilder.setId(templateData.getId());
        return builderNewBuilder.build();
    }

    /* JADX INFO: renamed from: c */
    public static VoiceLiveBullet.SystemVoiceLiveCommentsMsg m158464c(LongLinkGiftMessage.SystemLiveCommentsMsg systemLiveCommentsMsg) {
        VoiceLiveBullet.SystemVoiceLiveCommentsMsg.Builder builderNewBuilder = VoiceLiveBullet.SystemVoiceLiveCommentsMsg.newBuilder();
        builderNewBuilder.setAlignment(VoiceLiveBullet.Alignment.forNumber(systemLiveCommentsMsg.getAlignment().getNumber())).setBackground(m158462a(systemLiveCommentsMsg.getBackground())).setStartColor(systemLiveCommentsMsg.getStartColor()).setEndColor(systemLiveCommentsMsg.getEndColor()).setIconUrl(systemLiveCommentsMsg.getIconUrl()).setRoomID(systemLiveCommentsMsg.getRoomID()).setDisplayDuration(systemLiveCommentsMsg.getDisplayDuration()).setTemplateData(m158463b(systemLiveCommentsMsg.getTemplate())).setGotoSchema(systemLiveCommentsMsg.getGotoSchema()).setId(systemLiveCommentsMsg.getId()).setPriority(systemLiveCommentsMsg.getPriority());
        return builderNewBuilder.build();
    }
}
