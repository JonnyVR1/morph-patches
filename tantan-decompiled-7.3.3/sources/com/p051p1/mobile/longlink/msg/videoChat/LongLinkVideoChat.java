package com.p051p1.mobile.longlink.msg.videoChat;

import com.alibaba.fastjson.asm.Opcodes;
import com.google.protobuf.AbstractC3426a;
import com.google.protobuf.ByteString;
import com.google.protobuf.C3430e;
import com.google.protobuf.C3433h;
import com.google.protobuf.C3437l;
import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InterfaceC3442q;
import com.google.protobuf.InvalidProtocolBufferException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Collections;
import java.util.List;
import org.spongycastle.asn1.eac.EACTags;
import org.spongycastle.crypto.tls.CipherSuite;
import p153l.iig0;
import p153l.l710;
import p153l.lfz;
import p153l.ng60;

/* JADX INFO: loaded from: classes9.dex */
public final class LongLinkVideoChat {

    /* JADX INFO: renamed from: com.p1.mobile.longlink.msg.videoChat.LongLinkVideoChat$1 */
    public static /* synthetic */ class C47011 {

        /* JADX INFO: renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f16718xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f16718xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f16718xa1df5c61[GeneratedMessageLite.MethodToInvoke.IS_INITIALIZED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f16718xa1df5c61[GeneratedMessageLite.MethodToInvoke.MAKE_IMMUTABLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f16718xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f16718xa1df5c61[GeneratedMessageLite.MethodToInvoke.VISIT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f16718xa1df5c61[GeneratedMessageLite.MethodToInvoke.MERGE_FROM_STREAM.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f16718xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f16718xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    public interface LiveVideoChatAnchorCallResultOrBuilder extends lfz {
        String getAnchorId();

        ByteString getAnchorIdBytes();

        String getCallId();

        ByteString getCallIdBytes();

        @Override // p153l.lfz
        /* synthetic */ InterfaceC3442q getDefaultInstanceForType();

        String getStatus();

        ByteString getStatusBytes();

        String getUserId();

        ByteString getUserIdBytes();

        @Override // p153l.lfz
        /* synthetic */ boolean isInitialized();
    }

    public interface LiveVideoChatBubbleOrBuilder extends lfz {
        @Override // p153l.lfz
        /* synthetic */ InterfaceC3442q getDefaultInstanceForType();

        long getDuration();

        String getText();

        ByteString getTextBytes();

        @Override // p153l.lfz
        /* synthetic */ boolean isInitialized();
    }

    public interface LiveVideoChatCdnFailOrBuilder extends lfz {
        String getChatId();

        ByteString getChatIdBytes();

        @Override // p153l.lfz
        /* synthetic */ InterfaceC3442q getDefaultInstanceForType();

        String getNewPushUrl();

        ByteString getNewPushUrlBytes();

        @Override // p153l.lfz
        /* synthetic */ boolean isInitialized();
    }

    public interface LiveVideoChatChangeOrBuilder extends lfz {
        @Override // p153l.lfz
        /* synthetic */ InterfaceC3442q getDefaultInstanceForType();

        String getReason();

        ByteString getReasonBytes();

        VideoChat getVideoChat();

        boolean hasVideoChat();

        @Override // p153l.lfz
        /* synthetic */ boolean isInitialized();
    }

    public interface LiveVideoChatLiveChangeOrBuilder extends lfz {
        @Override // p153l.lfz
        /* synthetic */ InterfaceC3442q getDefaultInstanceForType();

        String getLiveId();

        ByteString getLiveIdBytes();

        String getReason();

        ByteString getReasonBytes();

        String getStatus();

        ByteString getStatusBytes();

        @Override // p153l.lfz
        /* synthetic */ boolean isInitialized();
    }

    public interface LiveVideoChatToastOrBuilder extends lfz {
        String getChatId();

        ByteString getChatIdBytes();

        @Override // p153l.lfz
        /* synthetic */ InterfaceC3442q getDefaultInstanceForType();

        String getToast();

        ByteString getToastBytes();

        @Override // p153l.lfz
        /* synthetic */ boolean isInitialized();
    }

    public interface VideoChatOrBuilder extends lfz {
        String getAnchorCallId();

        ByteString getAnchorCallIdBytes();

        String getAnchorId();

        ByteString getAnchorIdBytes();

        boolean getCalled();

        VideoChat.Category getCategory();

        int getCategoryValue();

        long getCreatedTime();

        @Override // p153l.lfz
        /* synthetic */ InterfaceC3442q getDefaultInstanceForType();

        String getEndTipMessage();

        ByteString getEndTipMessageBytes();

        VideoChat.EndType getEndType();

        int getEndTypeValue();

        long getEndedTime();

        String getErrorMessage();

        ByteString getErrorMessageBytes();

        String getGiftId();

        ByteString getGiftIdBytes();

        String getId();

        ByteString getIdBytes();

        VideoChat.Status getLastStatus();

        int getLastStatusValue();

        String getLeaveUserId();

        ByteString getLeaveUserIdBytes();

        String getLiveId();

        ByteString getLiveIdBytes();

        VideoChatPlayer getPlayers(int i);

        int getPlayersCount();

        List<VideoChatPlayer> getPlayersList();

        String getPunishMessage();

        ByteString getPunishMessageBytes();

        String getRoomId();

        ByteString getRoomIdBytes();

        String getRtcProvider();

        ByteString getRtcProviderBytes();

        String getSource();

        ByteString getSourceBytes();

        long getStartedTime();

        VideoChat.Status getStatus();

        int getStatusValue();

        long getTtc();

        long getUpdatedTime();

        String getUserId();

        ByteString getUserIdBytes();

        @Override // p153l.lfz
        /* synthetic */ boolean isInitialized();
    }

    public interface VideoChatPlayerOrBuilder extends lfz {
        String getAvatar();

        ByteString getAvatarBytes();

        @Override // p153l.lfz
        /* synthetic */ InterfaceC3442q getDefaultInstanceForType();

        String getRole();

        ByteString getRoleBytes();

        String getUserId();

        ByteString getUserIdBytes();

        String getUserName();

        ByteString getUserNameBytes();

        @Override // p153l.lfz
        /* synthetic */ boolean isInitialized();
    }

    private LongLinkVideoChat() {
    }

    public static void registerAllExtensions(C3433h c3433h) {
    }

    public static final class VideoChat extends GeneratedMessageLite<VideoChat, Builder> implements VideoChatOrBuilder {
        public static final int ANCHORCALLID_FIELD_NUMBER = 17;
        public static final int ANCHORID_FIELD_NUMBER = 3;
        public static final int CALLED_FIELD_NUMBER = 12;
        public static final int CATEGORY_FIELD_NUMBER = 18;
        public static final int CREATEDTIME_FIELD_NUMBER = 21;
        private static final VideoChat DEFAULT_INSTANCE;
        public static final int ENDEDTIME_FIELD_NUMBER = 7;
        public static final int ENDTIPMESSAGE_FIELD_NUMBER = 23;
        public static final int ENDTYPE_FIELD_NUMBER = 8;
        public static final int ERRORMESSAGE_FIELD_NUMBER = 10;
        public static final int GIFTID_FIELD_NUMBER = 13;
        public static final int ID_FIELD_NUMBER = 1;
        public static final int LASTSTATUS_FIELD_NUMBER = 24;
        public static final int LEAVEUSERID_FIELD_NUMBER = 11;
        public static final int LIVEID_FIELD_NUMBER = 5;
        private static volatile ng60<VideoChat> PARSER = null;
        public static final int PLAYERS_FIELD_NUMBER = 15;
        public static final int PUNISHMESSAGE_FIELD_NUMBER = 9;
        public static final int ROOMID_FIELD_NUMBER = 4;
        public static final int RTCPROVIDER_FIELD_NUMBER = 25;
        public static final int SOURCE_FIELD_NUMBER = 16;
        public static final int STARTEDTIME_FIELD_NUMBER = 6;
        public static final int STATUS_FIELD_NUMBER = 20;
        public static final int TTC_FIELD_NUMBER = 14;
        public static final int UPDATEDTIME_FIELD_NUMBER = 22;
        public static final int USERID_FIELD_NUMBER = 2;
        private int bitField0_;
        private boolean called_;
        private int category_;
        private long createdTime_;
        private int endType_;
        private long endedTime_;
        private int lastStatus_;
        private long startedTime_;
        private int status_;
        private long ttc_;
        private long updatedTime_;
        private String id_ = "";
        private String userId_ = "";
        private String anchorId_ = "";
        private String roomId_ = "";
        private String liveId_ = "";
        private String punishMessage_ = "";
        private String errorMessage_ = "";
        private String leaveUserId_ = "";
        private String giftId_ = "";
        private C3437l.h<VideoChatPlayer> players_ = GeneratedMessageLite.emptyProtobufList();
        private String source_ = "";
        private String anchorCallId_ = "";
        private String endTipMessage_ = "";
        private String rtcProvider_ = "";

        static {
            VideoChat videoChat = new VideoChat();
            DEFAULT_INSTANCE = videoChat;
            videoChat.makeImmutable();
        }

        private VideoChat() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllPlayers(Iterable<? extends VideoChatPlayer> iterable) {
            ensurePlayersIsMutable();
            AbstractC3426a.addAll(iterable, this.players_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addPlayers(VideoChatPlayer.Builder builder) {
            ensurePlayersIsMutable();
            this.players_.add(builder.build());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAnchorCallId() {
            this.anchorCallId_ = getDefaultInstance().getAnchorCallId();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAnchorId() {
            this.anchorId_ = getDefaultInstance().getAnchorId();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearCalled() {
            this.called_ = false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearCategory() {
            this.category_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearCreatedTime() {
            this.createdTime_ = 0L;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearEndTipMessage() {
            this.endTipMessage_ = getDefaultInstance().getEndTipMessage();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearEndType() {
            this.endType_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearEndedTime() {
            this.endedTime_ = 0L;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearErrorMessage() {
            this.errorMessage_ = getDefaultInstance().getErrorMessage();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearGiftId() {
            this.giftId_ = getDefaultInstance().getGiftId();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearId() {
            this.id_ = getDefaultInstance().getId();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearLastStatus() {
            this.lastStatus_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearLeaveUserId() {
            this.leaveUserId_ = getDefaultInstance().getLeaveUserId();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearLiveId() {
            this.liveId_ = getDefaultInstance().getLiveId();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearPlayers() {
            this.players_ = GeneratedMessageLite.emptyProtobufList();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearPunishMessage() {
            this.punishMessage_ = getDefaultInstance().getPunishMessage();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearRoomId() {
            this.roomId_ = getDefaultInstance().getRoomId();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearRtcProvider() {
            this.rtcProvider_ = getDefaultInstance().getRtcProvider();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearSource() {
            this.source_ = getDefaultInstance().getSource();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearStartedTime() {
            this.startedTime_ = 0L;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearStatus() {
            this.status_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearTtc() {
            this.ttc_ = 0L;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearUpdatedTime() {
            this.updatedTime_ = 0L;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearUserId() {
            this.userId_ = getDefaultInstance().getUserId();
        }

        private void ensurePlayersIsMutable() {
            if (this.players_.mo17140q()) {
                return;
            }
            this.players_ = GeneratedMessageLite.mutableCopy(this.players_);
        }

        public static VideoChat getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder(VideoChat videoChat) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(videoChat);
        }

        public static VideoChat parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (VideoChat) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static VideoChat parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (VideoChat) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static ng60<VideoChat> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void removePlayers(int i) {
            ensurePlayersIsMutable();
            this.players_.remove(i);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAnchorCallId(String str) {
            str.getClass();
            this.anchorCallId_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAnchorCallIdBytes(ByteString byteString) {
            byteString.getClass();
            AbstractC3426a.checkByteStringIsUtf8(byteString);
            this.anchorCallId_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAnchorId(String str) {
            str.getClass();
            this.anchorId_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAnchorIdBytes(ByteString byteString) {
            byteString.getClass();
            AbstractC3426a.checkByteStringIsUtf8(byteString);
            this.anchorId_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setCalled(boolean z) {
            this.called_ = z;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setCategory(Category category) {
            category.getClass();
            this.category_ = category.getNumber();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setCategoryValue(int i) {
            this.category_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setCreatedTime(long j) {
            this.createdTime_ = j;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setEndTipMessage(String str) {
            str.getClass();
            this.endTipMessage_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setEndTipMessageBytes(ByteString byteString) {
            byteString.getClass();
            AbstractC3426a.checkByteStringIsUtf8(byteString);
            this.endTipMessage_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setEndType(EndType endType) {
            endType.getClass();
            this.endType_ = endType.getNumber();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setEndTypeValue(int i) {
            this.endType_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setEndedTime(long j) {
            this.endedTime_ = j;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setErrorMessage(String str) {
            str.getClass();
            this.errorMessage_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setErrorMessageBytes(ByteString byteString) {
            byteString.getClass();
            AbstractC3426a.checkByteStringIsUtf8(byteString);
            this.errorMessage_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setGiftId(String str) {
            str.getClass();
            this.giftId_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setGiftIdBytes(ByteString byteString) {
            byteString.getClass();
            AbstractC3426a.checkByteStringIsUtf8(byteString);
            this.giftId_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setId(String str) {
            str.getClass();
            this.id_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setIdBytes(ByteString byteString) {
            byteString.getClass();
            AbstractC3426a.checkByteStringIsUtf8(byteString);
            this.id_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setLastStatus(Status status) {
            status.getClass();
            this.lastStatus_ = status.getNumber();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setLastStatusValue(int i) {
            this.lastStatus_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setLeaveUserId(String str) {
            str.getClass();
            this.leaveUserId_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setLeaveUserIdBytes(ByteString byteString) {
            byteString.getClass();
            AbstractC3426a.checkByteStringIsUtf8(byteString);
            this.leaveUserId_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setLiveId(String str) {
            str.getClass();
            this.liveId_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setLiveIdBytes(ByteString byteString) {
            byteString.getClass();
            AbstractC3426a.checkByteStringIsUtf8(byteString);
            this.liveId_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setPlayers(int i, VideoChatPlayer.Builder builder) {
            ensurePlayersIsMutable();
            this.players_.set(i, builder.build());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setPunishMessage(String str) {
            str.getClass();
            this.punishMessage_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setPunishMessageBytes(ByteString byteString) {
            byteString.getClass();
            AbstractC3426a.checkByteStringIsUtf8(byteString);
            this.punishMessage_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setRoomId(String str) {
            str.getClass();
            this.roomId_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setRoomIdBytes(ByteString byteString) {
            byteString.getClass();
            AbstractC3426a.checkByteStringIsUtf8(byteString);
            this.roomId_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setRtcProvider(String str) {
            str.getClass();
            this.rtcProvider_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setRtcProviderBytes(ByteString byteString) {
            byteString.getClass();
            AbstractC3426a.checkByteStringIsUtf8(byteString);
            this.rtcProvider_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSource(String str) {
            str.getClass();
            this.source_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSourceBytes(ByteString byteString) {
            byteString.getClass();
            AbstractC3426a.checkByteStringIsUtf8(byteString);
            this.source_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setStartedTime(long j) {
            this.startedTime_ = j;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setStatus(Status status) {
            status.getClass();
            this.status_ = status.getNumber();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setStatusValue(int i) {
            this.status_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTtc(long j) {
            this.ttc_ = j;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setUpdatedTime(long j) {
            this.updatedTime_ = j;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setUserId(String str) {
            str.getClass();
            this.userId_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setUserIdBytes(ByteString byteString) {
            byteString.getClass();
            AbstractC3426a.checkByteStringIsUtf8(byteString);
            this.userId_ = byteString.toStringUtf8();
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            boolean z = false;
            switch (C47011.f16718xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new VideoChat();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                    this.players_.mo17139n();
                    return null;
                case 4:
                    return new Builder();
                case 5:
                    GeneratedMessageLite.InterfaceC3409h interfaceC3409h = (GeneratedMessageLite.InterfaceC3409h) obj;
                    VideoChat videoChat = (VideoChat) obj2;
                    this.id_ = interfaceC3409h.mo17052f(!this.id_.isEmpty(), this.id_, !videoChat.id_.isEmpty(), videoChat.id_);
                    this.userId_ = interfaceC3409h.mo17052f(!this.userId_.isEmpty(), this.userId_, !videoChat.userId_.isEmpty(), videoChat.userId_);
                    this.anchorId_ = interfaceC3409h.mo17052f(!this.anchorId_.isEmpty(), this.anchorId_, !videoChat.anchorId_.isEmpty(), videoChat.anchorId_);
                    this.roomId_ = interfaceC3409h.mo17052f(!this.roomId_.isEmpty(), this.roomId_, !videoChat.roomId_.isEmpty(), videoChat.roomId_);
                    this.liveId_ = interfaceC3409h.mo17052f(!this.liveId_.isEmpty(), this.liveId_, !videoChat.liveId_.isEmpty(), videoChat.liveId_);
                    long j = this.startedTime_;
                    boolean z2 = j != 0;
                    long j2 = videoChat.startedTime_;
                    this.startedTime_ = interfaceC3409h.mo17055i(z2, j, j2 != 0, j2);
                    long j3 = this.endedTime_;
                    boolean z3 = j3 != 0;
                    long j4 = videoChat.endedTime_;
                    this.endedTime_ = interfaceC3409h.mo17055i(z3, j3, j4 != 0, j4);
                    int i = this.endType_;
                    boolean z4 = i != 0;
                    int i2 = videoChat.endType_;
                    this.endType_ = interfaceC3409h.mo17051e(z4, i, i2 != 0, i2);
                    this.punishMessage_ = interfaceC3409h.mo17052f(!this.punishMessage_.isEmpty(), this.punishMessage_, !videoChat.punishMessage_.isEmpty(), videoChat.punishMessage_);
                    this.errorMessage_ = interfaceC3409h.mo17052f(!this.errorMessage_.isEmpty(), this.errorMessage_, !videoChat.errorMessage_.isEmpty(), videoChat.errorMessage_);
                    this.leaveUserId_ = interfaceC3409h.mo17052f(!this.leaveUserId_.isEmpty(), this.leaveUserId_, !videoChat.leaveUserId_.isEmpty(), videoChat.leaveUserId_);
                    boolean z5 = this.called_;
                    boolean z6 = videoChat.called_;
                    this.called_ = interfaceC3409h.mo17050d(z5, z5, z6, z6);
                    this.giftId_ = interfaceC3409h.mo17052f(!this.giftId_.isEmpty(), this.giftId_, !videoChat.giftId_.isEmpty(), videoChat.giftId_);
                    long j5 = this.ttc_;
                    boolean z7 = j5 != 0;
                    long j6 = videoChat.ttc_;
                    this.ttc_ = interfaceC3409h.mo17055i(z7, j5, j6 != 0, j6);
                    this.players_ = interfaceC3409h.mo17053g(this.players_, videoChat.players_);
                    this.source_ = interfaceC3409h.mo17052f(!this.source_.isEmpty(), this.source_, !videoChat.source_.isEmpty(), videoChat.source_);
                    this.anchorCallId_ = interfaceC3409h.mo17052f(!this.anchorCallId_.isEmpty(), this.anchorCallId_, !videoChat.anchorCallId_.isEmpty(), videoChat.anchorCallId_);
                    int i3 = this.category_;
                    boolean z8 = i3 != 0;
                    int i4 = videoChat.category_;
                    this.category_ = interfaceC3409h.mo17051e(z8, i3, i4 != 0, i4);
                    int i5 = this.status_;
                    boolean z9 = i5 != 0;
                    int i6 = videoChat.status_;
                    this.status_ = interfaceC3409h.mo17051e(z9, i5, i6 != 0, i6);
                    long j7 = this.createdTime_;
                    boolean z10 = j7 != 0;
                    long j8 = videoChat.createdTime_;
                    this.createdTime_ = interfaceC3409h.mo17055i(z10, j7, j8 != 0, j8);
                    long j9 = this.updatedTime_;
                    boolean z11 = j9 != 0;
                    long j10 = videoChat.updatedTime_;
                    this.updatedTime_ = interfaceC3409h.mo17055i(z11, j9, j10 != 0, j10);
                    this.endTipMessage_ = interfaceC3409h.mo17052f(!this.endTipMessage_.isEmpty(), this.endTipMessage_, !videoChat.endTipMessage_.isEmpty(), videoChat.endTipMessage_);
                    int i7 = this.lastStatus_;
                    boolean z12 = i7 != 0;
                    int i8 = videoChat.lastStatus_;
                    this.lastStatus_ = interfaceC3409h.mo17051e(z12, i7, i8 != 0, i8);
                    this.rtcProvider_ = interfaceC3409h.mo17052f(!this.rtcProvider_.isEmpty(), this.rtcProvider_, !videoChat.rtcProvider_.isEmpty(), videoChat.rtcProvider_);
                    if (interfaceC3409h == GeneratedMessageLite.C3408g.INSTANCE) {
                        this.bitField0_ |= videoChat.bitField0_;
                    }
                    return this;
                case 6:
                    C3430e c3430e = (C3430e) obj;
                    C3433h c3433h = (C3433h) obj2;
                    while (!z) {
                        try {
                            int iM17171M = c3430e.m17171M();
                            switch (iM17171M) {
                                case 0:
                                    break;
                                case 10:
                                    this.id_ = c3430e.m17170L();
                                    continue;
                                case 18:
                                    this.userId_ = c3430e.m17170L();
                                    continue;
                                case 26:
                                    this.anchorId_ = c3430e.m17170L();
                                    continue;
                                case 34:
                                    this.roomId_ = c3430e.m17170L();
                                    continue;
                                case 42:
                                    this.liveId_ = c3430e.m17170L();
                                    continue;
                                case 48:
                                    this.startedTime_ = c3430e.m17197v();
                                    continue;
                                case 56:
                                    this.endedTime_ = c3430e.m17197v();
                                    continue;
                                case 64:
                                    this.endType_ = c3430e.m17191p();
                                    continue;
                                case 74:
                                    this.punishMessage_ = c3430e.m17170L();
                                    continue;
                                case EACTags.COMMAND_TO_PERFORM /* 82 */:
                                    this.errorMessage_ = c3430e.m17170L();
                                    continue;
                                case 90:
                                    this.leaveUserId_ = c3430e.m17170L();
                                    continue;
                                case Opcodes.IADD /* 96 */:
                                    this.called_ = c3430e.m17188m();
                                    continue;
                                case 106:
                                    this.giftId_ = c3430e.m17170L();
                                    continue;
                                case 112:
                                    this.ttc_ = c3430e.m17197v();
                                    continue;
                                case 122:
                                    if (!this.players_.mo17140q()) {
                                        this.players_ = GeneratedMessageLite.mutableCopy(this.players_);
                                    }
                                    this.players_.add((VideoChatPlayer) c3430e.m17198w(VideoChatPlayer.parser(), c3433h));
                                    continue;
                                case 130:
                                    this.source_ = c3430e.m17170L();
                                    continue;
                                case CipherSuite.TLS_PSK_WITH_RC4_128_SHA /* 138 */:
                                    this.anchorCallId_ = c3430e.m17170L();
                                    continue;
                                case 144:
                                    this.category_ = c3430e.m17191p();
                                    continue;
                                case 160:
                                    this.status_ = c3430e.m17191p();
                                    continue;
                                case CipherSuite.TLS_PSK_WITH_AES_128_GCM_SHA256 /* 168 */:
                                    this.createdTime_ = c3430e.m17197v();
                                    continue;
                                case 176:
                                    this.updatedTime_ = c3430e.m17197v();
                                    continue;
                                case CipherSuite.TLS_RSA_WITH_CAMELLIA_128_CBC_SHA256 /* 186 */:
                                    this.endTipMessage_ = c3430e.m17170L();
                                    continue;
                                case 192:
                                    this.lastStatus_ = c3430e.m17191p();
                                    continue;
                                case 202:
                                    this.rtcProvider_ = c3430e.m17170L();
                                    continue;
                                default:
                                    if (!c3430e.m17176R(iM17171M)) {
                                        break;
                                    }
                                    break;
                            }
                            z = true;
                        } catch (InvalidProtocolBufferException e) {
                            iig0.m140070a(e.setUnfinishedMessage(this));
                            return null;
                        } catch (IOException e2) {
                            iig0.m140070a(new InvalidProtocolBufferException(e2.getMessage()).setUnfinishedMessage(this));
                            return null;
                        }
                    }
                    break;
                case 7:
                    break;
                case 8:
                    if (PARSER == null) {
                        synchronized (VideoChat.class) {
                            try {
                                if (PARSER == null) {
                                    PARSER = new GeneratedMessageLite.C3404c(DEFAULT_INSTANCE);
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                            break;
                        }
                    }
                    return PARSER;
                default:
                    l710.m153113a();
                    return null;
            }
            return DEFAULT_INSTANCE;
        }

        @Override // com.p1.mobile.longlink.msg.videoChat.LongLinkVideoChat.VideoChatOrBuilder
        public String getAnchorCallId() {
            return this.anchorCallId_;
        }

        @Override // com.p1.mobile.longlink.msg.videoChat.LongLinkVideoChat.VideoChatOrBuilder
        public ByteString getAnchorCallIdBytes() {
            return ByteString.copyFromUtf8(this.anchorCallId_);
        }

        @Override // com.p1.mobile.longlink.msg.videoChat.LongLinkVideoChat.VideoChatOrBuilder
        public String getAnchorId() {
            return this.anchorId_;
        }

        @Override // com.p1.mobile.longlink.msg.videoChat.LongLinkVideoChat.VideoChatOrBuilder
        public ByteString getAnchorIdBytes() {
            return ByteString.copyFromUtf8(this.anchorId_);
        }

        @Override // com.p1.mobile.longlink.msg.videoChat.LongLinkVideoChat.VideoChatOrBuilder
        public boolean getCalled() {
            return this.called_;
        }

        @Override // com.p1.mobile.longlink.msg.videoChat.LongLinkVideoChat.VideoChatOrBuilder
        public Category getCategory() {
            Category categoryForNumber = Category.forNumber(this.category_);
            return categoryForNumber == null ? Category.UNRECOGNIZED : categoryForNumber;
        }

        @Override // com.p1.mobile.longlink.msg.videoChat.LongLinkVideoChat.VideoChatOrBuilder
        public int getCategoryValue() {
            return this.category_;
        }

        @Override // com.p1.mobile.longlink.msg.videoChat.LongLinkVideoChat.VideoChatOrBuilder
        public long getCreatedTime() {
            return this.createdTime_;
        }

        @Override // com.p1.mobile.longlink.msg.videoChat.LongLinkVideoChat.VideoChatOrBuilder
        public String getEndTipMessage() {
            return this.endTipMessage_;
        }

        @Override // com.p1.mobile.longlink.msg.videoChat.LongLinkVideoChat.VideoChatOrBuilder
        public ByteString getEndTipMessageBytes() {
            return ByteString.copyFromUtf8(this.endTipMessage_);
        }

        @Override // com.p1.mobile.longlink.msg.videoChat.LongLinkVideoChat.VideoChatOrBuilder
        public EndType getEndType() {
            EndType endTypeForNumber = EndType.forNumber(this.endType_);
            return endTypeForNumber == null ? EndType.UNRECOGNIZED : endTypeForNumber;
        }

        @Override // com.p1.mobile.longlink.msg.videoChat.LongLinkVideoChat.VideoChatOrBuilder
        public int getEndTypeValue() {
            return this.endType_;
        }

        @Override // com.p1.mobile.longlink.msg.videoChat.LongLinkVideoChat.VideoChatOrBuilder
        public long getEndedTime() {
            return this.endedTime_;
        }

        @Override // com.p1.mobile.longlink.msg.videoChat.LongLinkVideoChat.VideoChatOrBuilder
        public String getErrorMessage() {
            return this.errorMessage_;
        }

        @Override // com.p1.mobile.longlink.msg.videoChat.LongLinkVideoChat.VideoChatOrBuilder
        public ByteString getErrorMessageBytes() {
            return ByteString.copyFromUtf8(this.errorMessage_);
        }

        @Override // com.p1.mobile.longlink.msg.videoChat.LongLinkVideoChat.VideoChatOrBuilder
        public String getGiftId() {
            return this.giftId_;
        }

        @Override // com.p1.mobile.longlink.msg.videoChat.LongLinkVideoChat.VideoChatOrBuilder
        public ByteString getGiftIdBytes() {
            return ByteString.copyFromUtf8(this.giftId_);
        }

        @Override // com.p1.mobile.longlink.msg.videoChat.LongLinkVideoChat.VideoChatOrBuilder
        public String getId() {
            return this.id_;
        }

        @Override // com.p1.mobile.longlink.msg.videoChat.LongLinkVideoChat.VideoChatOrBuilder
        public ByteString getIdBytes() {
            return ByteString.copyFromUtf8(this.id_);
        }

        @Override // com.p1.mobile.longlink.msg.videoChat.LongLinkVideoChat.VideoChatOrBuilder
        public Status getLastStatus() {
            Status statusForNumber = Status.forNumber(this.lastStatus_);
            return statusForNumber == null ? Status.UNRECOGNIZED : statusForNumber;
        }

        @Override // com.p1.mobile.longlink.msg.videoChat.LongLinkVideoChat.VideoChatOrBuilder
        public int getLastStatusValue() {
            return this.lastStatus_;
        }

        @Override // com.p1.mobile.longlink.msg.videoChat.LongLinkVideoChat.VideoChatOrBuilder
        public String getLeaveUserId() {
            return this.leaveUserId_;
        }

        @Override // com.p1.mobile.longlink.msg.videoChat.LongLinkVideoChat.VideoChatOrBuilder
        public ByteString getLeaveUserIdBytes() {
            return ByteString.copyFromUtf8(this.leaveUserId_);
        }

        @Override // com.p1.mobile.longlink.msg.videoChat.LongLinkVideoChat.VideoChatOrBuilder
        public String getLiveId() {
            return this.liveId_;
        }

        @Override // com.p1.mobile.longlink.msg.videoChat.LongLinkVideoChat.VideoChatOrBuilder
        public ByteString getLiveIdBytes() {
            return ByteString.copyFromUtf8(this.liveId_);
        }

        @Override // com.p1.mobile.longlink.msg.videoChat.LongLinkVideoChat.VideoChatOrBuilder
        public VideoChatPlayer getPlayers(int i) {
            return this.players_.get(i);
        }

        @Override // com.p1.mobile.longlink.msg.videoChat.LongLinkVideoChat.VideoChatOrBuilder
        public int getPlayersCount() {
            return this.players_.size();
        }

        @Override // com.p1.mobile.longlink.msg.videoChat.LongLinkVideoChat.VideoChatOrBuilder
        public List<VideoChatPlayer> getPlayersList() {
            return this.players_;
        }

        public VideoChatPlayerOrBuilder getPlayersOrBuilder(int i) {
            return this.players_.get(i);
        }

        public List<? extends VideoChatPlayerOrBuilder> getPlayersOrBuilderList() {
            return this.players_;
        }

        @Override // com.p1.mobile.longlink.msg.videoChat.LongLinkVideoChat.VideoChatOrBuilder
        public String getPunishMessage() {
            return this.punishMessage_;
        }

        @Override // com.p1.mobile.longlink.msg.videoChat.LongLinkVideoChat.VideoChatOrBuilder
        public ByteString getPunishMessageBytes() {
            return ByteString.copyFromUtf8(this.punishMessage_);
        }

        @Override // com.p1.mobile.longlink.msg.videoChat.LongLinkVideoChat.VideoChatOrBuilder
        public String getRoomId() {
            return this.roomId_;
        }

        @Override // com.p1.mobile.longlink.msg.videoChat.LongLinkVideoChat.VideoChatOrBuilder
        public ByteString getRoomIdBytes() {
            return ByteString.copyFromUtf8(this.roomId_);
        }

        @Override // com.p1.mobile.longlink.msg.videoChat.LongLinkVideoChat.VideoChatOrBuilder
        public String getRtcProvider() {
            return this.rtcProvider_;
        }

        @Override // com.p1.mobile.longlink.msg.videoChat.LongLinkVideoChat.VideoChatOrBuilder
        public ByteString getRtcProviderBytes() {
            return ByteString.copyFromUtf8(this.rtcProvider_);
        }

        @Override // com.google.protobuf.InterfaceC3442q
        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int iM16956K = !this.id_.isEmpty() ? CodedOutputStream.m16956K(1, getId()) : 0;
            if (!this.userId_.isEmpty()) {
                iM16956K += CodedOutputStream.m16956K(2, getUserId());
            }
            if (!this.anchorId_.isEmpty()) {
                iM16956K += CodedOutputStream.m16956K(3, getAnchorId());
            }
            if (!this.roomId_.isEmpty()) {
                iM16956K += CodedOutputStream.m16956K(4, getRoomId());
            }
            if (!this.liveId_.isEmpty()) {
                iM16956K += CodedOutputStream.m16956K(5, getLiveId());
            }
            long j = this.startedTime_;
            if (j != 0) {
                iM16956K += CodedOutputStream.m16986v(6, j);
            }
            long j2 = this.endedTime_;
            if (j2 != 0) {
                iM16956K += CodedOutputStream.m16986v(7, j2);
            }
            if (this.endType_ != EndType.endTypeUnknown.getNumber()) {
                iM16956K += CodedOutputStream.m16977m(8, this.endType_);
            }
            if (!this.punishMessage_.isEmpty()) {
                iM16956K += CodedOutputStream.m16956K(9, getPunishMessage());
            }
            if (!this.errorMessage_.isEmpty()) {
                iM16956K += CodedOutputStream.m16956K(10, getErrorMessage());
            }
            if (!this.leaveUserId_.isEmpty()) {
                iM16956K += CodedOutputStream.m16956K(11, getLeaveUserId());
            }
            boolean z = this.called_;
            if (z) {
                iM16956K += CodedOutputStream.m16970f(12, z);
            }
            if (!this.giftId_.isEmpty()) {
                iM16956K += CodedOutputStream.m16956K(13, getGiftId());
            }
            long j3 = this.ttc_;
            if (j3 != 0) {
                iM16956K += CodedOutputStream.m16986v(14, j3);
            }
            for (int i2 = 0; i2 < this.players_.size(); i2++) {
                iM16956K += CodedOutputStream.m16948C(15, this.players_.get(i2));
            }
            if (!this.source_.isEmpty()) {
                iM16956K += CodedOutputStream.m16956K(16, getSource());
            }
            if (!this.anchorCallId_.isEmpty()) {
                iM16956K += CodedOutputStream.m16956K(17, getAnchorCallId());
            }
            if (this.category_ != Category.normal.getNumber()) {
                iM16956K += CodedOutputStream.m16977m(18, this.category_);
            }
            int i3 = this.status_;
            Status status = Status.StatusUnknown;
            if (i3 != status.getNumber()) {
                iM16956K += CodedOutputStream.m16977m(20, this.status_);
            }
            long j4 = this.createdTime_;
            if (j4 != 0) {
                iM16956K += CodedOutputStream.m16986v(21, j4);
            }
            long j5 = this.updatedTime_;
            if (j5 != 0) {
                iM16956K += CodedOutputStream.m16986v(22, j5);
            }
            if (!this.endTipMessage_.isEmpty()) {
                iM16956K += CodedOutputStream.m16956K(23, getEndTipMessage());
            }
            if (this.lastStatus_ != status.getNumber()) {
                iM16956K += CodedOutputStream.m16977m(24, this.lastStatus_);
            }
            if (!this.rtcProvider_.isEmpty()) {
                iM16956K += CodedOutputStream.m16956K(25, getRtcProvider());
            }
            this.memoizedSerializedSize = iM16956K;
            return iM16956K;
        }

        @Override // com.p1.mobile.longlink.msg.videoChat.LongLinkVideoChat.VideoChatOrBuilder
        public String getSource() {
            return this.source_;
        }

        @Override // com.p1.mobile.longlink.msg.videoChat.LongLinkVideoChat.VideoChatOrBuilder
        public ByteString getSourceBytes() {
            return ByteString.copyFromUtf8(this.source_);
        }

        @Override // com.p1.mobile.longlink.msg.videoChat.LongLinkVideoChat.VideoChatOrBuilder
        public long getStartedTime() {
            return this.startedTime_;
        }

        @Override // com.p1.mobile.longlink.msg.videoChat.LongLinkVideoChat.VideoChatOrBuilder
        public Status getStatus() {
            Status statusForNumber = Status.forNumber(this.status_);
            return statusForNumber == null ? Status.UNRECOGNIZED : statusForNumber;
        }

        @Override // com.p1.mobile.longlink.msg.videoChat.LongLinkVideoChat.VideoChatOrBuilder
        public int getStatusValue() {
            return this.status_;
        }

        @Override // com.p1.mobile.longlink.msg.videoChat.LongLinkVideoChat.VideoChatOrBuilder
        public long getTtc() {
            return this.ttc_;
        }

        @Override // com.p1.mobile.longlink.msg.videoChat.LongLinkVideoChat.VideoChatOrBuilder
        public long getUpdatedTime() {
            return this.updatedTime_;
        }

        @Override // com.p1.mobile.longlink.msg.videoChat.LongLinkVideoChat.VideoChatOrBuilder
        public String getUserId() {
            return this.userId_;
        }

        @Override // com.p1.mobile.longlink.msg.videoChat.LongLinkVideoChat.VideoChatOrBuilder
        public ByteString getUserIdBytes() {
            return ByteString.copyFromUtf8(this.userId_);
        }

        @Override // com.google.protobuf.InterfaceC3442q
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (!this.id_.isEmpty()) {
                codedOutputStream.mo16994D0(1, getId());
            }
            if (!this.userId_.isEmpty()) {
                codedOutputStream.mo16994D0(2, getUserId());
            }
            if (!this.anchorId_.isEmpty()) {
                codedOutputStream.mo16994D0(3, getAnchorId());
            }
            if (!this.roomId_.isEmpty()) {
                codedOutputStream.mo16994D0(4, getRoomId());
            }
            if (!this.liveId_.isEmpty()) {
                codedOutputStream.mo16994D0(5, getLiveId());
            }
            long j = this.startedTime_;
            if (j != 0) {
                codedOutputStream.m17027u0(6, j);
            }
            long j2 = this.endedTime_;
            if (j2 != 0) {
                codedOutputStream.m17027u0(7, j2);
            }
            if (this.endType_ != EndType.endTypeUnknown.getNumber()) {
                codedOutputStream.m17015i0(8, this.endType_);
            }
            if (!this.punishMessage_.isEmpty()) {
                codedOutputStream.mo16994D0(9, getPunishMessage());
            }
            if (!this.errorMessage_.isEmpty()) {
                codedOutputStream.mo16994D0(10, getErrorMessage());
            }
            if (!this.leaveUserId_.isEmpty()) {
                codedOutputStream.mo16994D0(11, getLeaveUserId());
            }
            boolean z = this.called_;
            if (z) {
                codedOutputStream.mo17005a0(12, z);
            }
            if (!this.giftId_.isEmpty()) {
                codedOutputStream.mo16994D0(13, getGiftId());
            }
            long j3 = this.ttc_;
            if (j3 != 0) {
                codedOutputStream.m17027u0(14, j3);
            }
            for (int i = 0; i < this.players_.size(); i++) {
                codedOutputStream.mo17029w0(15, this.players_.get(i));
            }
            if (!this.source_.isEmpty()) {
                codedOutputStream.mo16994D0(16, getSource());
            }
            if (!this.anchorCallId_.isEmpty()) {
                codedOutputStream.mo16994D0(17, getAnchorCallId());
            }
            if (this.category_ != Category.normal.getNumber()) {
                codedOutputStream.m17015i0(18, this.category_);
            }
            int i2 = this.status_;
            Status status = Status.StatusUnknown;
            if (i2 != status.getNumber()) {
                codedOutputStream.m17015i0(20, this.status_);
            }
            long j4 = this.createdTime_;
            if (j4 != 0) {
                codedOutputStream.m17027u0(21, j4);
            }
            long j5 = this.updatedTime_;
            if (j5 != 0) {
                codedOutputStream.m17027u0(22, j5);
            }
            if (!this.endTipMessage_.isEmpty()) {
                codedOutputStream.mo16994D0(23, getEndTipMessage());
            }
            if (this.lastStatus_ != status.getNumber()) {
                codedOutputStream.m17015i0(24, this.lastStatus_);
            }
            if (this.rtcProvider_.isEmpty()) {
                return;
            }
            codedOutputStream.mo16994D0(25, getRtcProvider());
        }

        public enum Category implements C3437l.c {
            normal(0),
            random(1),
            UNRECOGNIZED(-1);

            private static final C3437l.d<Category> internalValueMap = new C3437l.d<Category>() { // from class: com.p1.mobile.longlink.msg.videoChat.LongLinkVideoChat.VideoChat.Category.1
                @Override // com.google.protobuf.C3437l.d
                public Category findValueByNumber(int i) {
                    return Category.forNumber(i);
                }
            };
            public static final int normal_VALUE = 0;
            public static final int random_VALUE = 1;
            private final int value;

            Category(int i) {
                this.value = i;
            }

            public static Category forNumber(int i) {
                if (i == 0) {
                    return normal;
                }
                if (i != 1) {
                    return null;
                }
                return random;
            }

            public static C3437l.d<Category> internalGetValueMap() {
                return internalValueMap;
            }

            @Override // com.google.protobuf.C3437l.c
            public final int getNumber() {
                return this.value;
            }

            @Deprecated
            public static Category valueOf(int i) {
                return forNumber(i);
            }
        }

        public enum EndType implements C3437l.c {
            endTypeUnknown(0),
            timeout(1),
            anchorReject(10),
            anchorHangUp(11),
            anchorQuit(12),
            banAnchor(13),
            anchorLost(14),
            anchorQuitMultiDevice(15),
            userHangUp(20),
            userQuit(21),
            banUser(22),
            userPayTimeout(23),
            userNotPay(24),
            userCancel(25),
            userLost(26),
            userQuitMultiDevice(27),
            UNRECOGNIZED(-1);

            public static final int anchorHangUp_VALUE = 11;
            public static final int anchorLost_VALUE = 14;
            public static final int anchorQuitMultiDevice_VALUE = 15;
            public static final int anchorQuit_VALUE = 12;
            public static final int anchorReject_VALUE = 10;
            public static final int banAnchor_VALUE = 13;
            public static final int banUser_VALUE = 22;
            public static final int endTypeUnknown_VALUE = 0;
            private static final C3437l.d<EndType> internalValueMap = new C3437l.d<EndType>() { // from class: com.p1.mobile.longlink.msg.videoChat.LongLinkVideoChat.VideoChat.EndType.1
                @Override // com.google.protobuf.C3437l.d
                public EndType findValueByNumber(int i) {
                    return EndType.forNumber(i);
                }
            };
            public static final int timeout_VALUE = 1;
            public static final int userCancel_VALUE = 25;
            public static final int userHangUp_VALUE = 20;
            public static final int userLost_VALUE = 26;
            public static final int userNotPay_VALUE = 24;
            public static final int userPayTimeout_VALUE = 23;
            public static final int userQuitMultiDevice_VALUE = 27;
            public static final int userQuit_VALUE = 21;
            private final int value;

            EndType(int i) {
                this.value = i;
            }

            public static EndType forNumber(int i) {
                if (i == 0) {
                    return endTypeUnknown;
                }
                if (i == 1) {
                    return timeout;
                }
                switch (i) {
                    case 10:
                        return anchorReject;
                    case 11:
                        return anchorHangUp;
                    case 12:
                        return anchorQuit;
                    case 13:
                        return banAnchor;
                    case 14:
                        return anchorLost;
                    case 15:
                        return anchorQuitMultiDevice;
                    default:
                        switch (i) {
                            case 20:
                                return userHangUp;
                            case 21:
                                return userQuit;
                            case 22:
                                return banUser;
                            case 23:
                                return userPayTimeout;
                            case 24:
                                return userNotPay;
                            case 25:
                                return userCancel;
                            case 26:
                                return userLost;
                            case 27:
                                return userQuitMultiDevice;
                            default:
                                return null;
                        }
                }
            }

            public static C3437l.d<EndType> internalGetValueMap() {
                return internalValueMap;
            }

            @Override // com.google.protobuf.C3437l.c
            public final int getNumber() {
                return this.value;
            }

            @Deprecated
            public static EndType valueOf(int i) {
                return forNumber(i);
            }
        }

        public enum Status implements C3437l.c {
            StatusUnknown(0),
            Pending(1),
            Connecting(2),
            Calling(3),
            Stopped(4),
            UNRECOGNIZED(-1);

            public static final int Calling_VALUE = 3;
            public static final int Connecting_VALUE = 2;
            public static final int Pending_VALUE = 1;
            public static final int StatusUnknown_VALUE = 0;
            public static final int Stopped_VALUE = 4;
            private static final C3437l.d<Status> internalValueMap = new C3437l.d<Status>() { // from class: com.p1.mobile.longlink.msg.videoChat.LongLinkVideoChat.VideoChat.Status.1
                @Override // com.google.protobuf.C3437l.d
                public Status findValueByNumber(int i) {
                    return Status.forNumber(i);
                }
            };
            private final int value;

            Status(int i) {
                this.value = i;
            }

            public static Status forNumber(int i) {
                if (i == 0) {
                    return StatusUnknown;
                }
                if (i == 1) {
                    return Pending;
                }
                if (i == 2) {
                    return Connecting;
                }
                if (i == 3) {
                    return Calling;
                }
                if (i != 4) {
                    return null;
                }
                return Stopped;
            }

            public static C3437l.d<Status> internalGetValueMap() {
                return internalValueMap;
            }

            @Override // com.google.protobuf.C3437l.c
            public final int getNumber() {
                return this.value;
            }

            @Deprecated
            public static Status valueOf(int i) {
                return forNumber(i);
            }
        }

        public static VideoChat parseDelimitedFrom(InputStream inputStream, C3433h c3433h) throws IOException {
            return (VideoChat) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, c3433h);
        }

        public static VideoChat parseFrom(ByteString byteString, C3433h c3433h) throws InvalidProtocolBufferException {
            return (VideoChat) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, c3433h);
        }

        public static final class Builder extends GeneratedMessageLite.AbstractC3403b<VideoChat, Builder> implements VideoChatOrBuilder {
            private Builder() {
                super(VideoChat.DEFAULT_INSTANCE);
            }

            public Builder addAllPlayers(Iterable<? extends VideoChatPlayer> iterable) {
                copyOnWrite();
                ((VideoChat) this.instance).addAllPlayers(iterable);
                return this;
            }

            public Builder addPlayers(VideoChatPlayer videoChatPlayer) {
                copyOnWrite();
                ((VideoChat) this.instance).addPlayers(videoChatPlayer);
                return this;
            }

            public Builder clearAnchorCallId() {
                copyOnWrite();
                ((VideoChat) this.instance).clearAnchorCallId();
                return this;
            }

            public Builder clearAnchorId() {
                copyOnWrite();
                ((VideoChat) this.instance).clearAnchorId();
                return this;
            }

            public Builder clearCalled() {
                copyOnWrite();
                ((VideoChat) this.instance).clearCalled();
                return this;
            }

            public Builder clearCategory() {
                copyOnWrite();
                ((VideoChat) this.instance).clearCategory();
                return this;
            }

            public Builder clearCreatedTime() {
                copyOnWrite();
                ((VideoChat) this.instance).clearCreatedTime();
                return this;
            }

            public Builder clearEndTipMessage() {
                copyOnWrite();
                ((VideoChat) this.instance).clearEndTipMessage();
                return this;
            }

            public Builder clearEndType() {
                copyOnWrite();
                ((VideoChat) this.instance).clearEndType();
                return this;
            }

            public Builder clearEndedTime() {
                copyOnWrite();
                ((VideoChat) this.instance).clearEndedTime();
                return this;
            }

            public Builder clearErrorMessage() {
                copyOnWrite();
                ((VideoChat) this.instance).clearErrorMessage();
                return this;
            }

            public Builder clearGiftId() {
                copyOnWrite();
                ((VideoChat) this.instance).clearGiftId();
                return this;
            }

            public Builder clearId() {
                copyOnWrite();
                ((VideoChat) this.instance).clearId();
                return this;
            }

            public Builder clearLastStatus() {
                copyOnWrite();
                ((VideoChat) this.instance).clearLastStatus();
                return this;
            }

            public Builder clearLeaveUserId() {
                copyOnWrite();
                ((VideoChat) this.instance).clearLeaveUserId();
                return this;
            }

            public Builder clearLiveId() {
                copyOnWrite();
                ((VideoChat) this.instance).clearLiveId();
                return this;
            }

            public Builder clearPlayers() {
                copyOnWrite();
                ((VideoChat) this.instance).clearPlayers();
                return this;
            }

            public Builder clearPunishMessage() {
                copyOnWrite();
                ((VideoChat) this.instance).clearPunishMessage();
                return this;
            }

            public Builder clearRoomId() {
                copyOnWrite();
                ((VideoChat) this.instance).clearRoomId();
                return this;
            }

            public Builder clearRtcProvider() {
                copyOnWrite();
                ((VideoChat) this.instance).clearRtcProvider();
                return this;
            }

            public Builder clearSource() {
                copyOnWrite();
                ((VideoChat) this.instance).clearSource();
                return this;
            }

            public Builder clearStartedTime() {
                copyOnWrite();
                ((VideoChat) this.instance).clearStartedTime();
                return this;
            }

            public Builder clearStatus() {
                copyOnWrite();
                ((VideoChat) this.instance).clearStatus();
                return this;
            }

            public Builder clearTtc() {
                copyOnWrite();
                ((VideoChat) this.instance).clearTtc();
                return this;
            }

            public Builder clearUpdatedTime() {
                copyOnWrite();
                ((VideoChat) this.instance).clearUpdatedTime();
                return this;
            }

            public Builder clearUserId() {
                copyOnWrite();
                ((VideoChat) this.instance).clearUserId();
                return this;
            }

            @Override // com.p1.mobile.longlink.msg.videoChat.LongLinkVideoChat.VideoChatOrBuilder
            public String getAnchorCallId() {
                return ((VideoChat) this.instance).getAnchorCallId();
            }

            @Override // com.p1.mobile.longlink.msg.videoChat.LongLinkVideoChat.VideoChatOrBuilder
            public ByteString getAnchorCallIdBytes() {
                return ((VideoChat) this.instance).getAnchorCallIdBytes();
            }

            @Override // com.p1.mobile.longlink.msg.videoChat.LongLinkVideoChat.VideoChatOrBuilder
            public String getAnchorId() {
                return ((VideoChat) this.instance).getAnchorId();
            }

            @Override // com.p1.mobile.longlink.msg.videoChat.LongLinkVideoChat.VideoChatOrBuilder
            public ByteString getAnchorIdBytes() {
                return ((VideoChat) this.instance).getAnchorIdBytes();
            }

            @Override // com.p1.mobile.longlink.msg.videoChat.LongLinkVideoChat.VideoChatOrBuilder
            public boolean getCalled() {
                return ((VideoChat) this.instance).getCalled();
            }

            @Override // com.p1.mobile.longlink.msg.videoChat.LongLinkVideoChat.VideoChatOrBuilder
            public Category getCategory() {
                return ((VideoChat) this.instance).getCategory();
            }

            @Override // com.p1.mobile.longlink.msg.videoChat.LongLinkVideoChat.VideoChatOrBuilder
            public int getCategoryValue() {
                return ((VideoChat) this.instance).getCategoryValue();
            }

            @Override // com.p1.mobile.longlink.msg.videoChat.LongLinkVideoChat.VideoChatOrBuilder
            public long getCreatedTime() {
                return ((VideoChat) this.instance).getCreatedTime();
            }

            @Override // com.p1.mobile.longlink.msg.videoChat.LongLinkVideoChat.VideoChatOrBuilder
            public String getEndTipMessage() {
                return ((VideoChat) this.instance).getEndTipMessage();
            }

            @Override // com.p1.mobile.longlink.msg.videoChat.LongLinkVideoChat.VideoChatOrBuilder
            public ByteString getEndTipMessageBytes() {
                return ((VideoChat) this.instance).getEndTipMessageBytes();
            }

            @Override // com.p1.mobile.longlink.msg.videoChat.LongLinkVideoChat.VideoChatOrBuilder
            public EndType getEndType() {
                return ((VideoChat) this.instance).getEndType();
            }

            @Override // com.p1.mobile.longlink.msg.videoChat.LongLinkVideoChat.VideoChatOrBuilder
            public int getEndTypeValue() {
                return ((VideoChat) this.instance).getEndTypeValue();
            }

            @Override // com.p1.mobile.longlink.msg.videoChat.LongLinkVideoChat.VideoChatOrBuilder
            public long getEndedTime() {
                return ((VideoChat) this.instance).getEndedTime();
            }

            @Override // com.p1.mobile.longlink.msg.videoChat.LongLinkVideoChat.VideoChatOrBuilder
            public String getErrorMessage() {
                return ((VideoChat) this.instance).getErrorMessage();
            }

            @Override // com.p1.mobile.longlink.msg.videoChat.LongLinkVideoChat.VideoChatOrBuilder
            public ByteString getErrorMessageBytes() {
                return ((VideoChat) this.instance).getErrorMessageBytes();
            }

            @Override // com.p1.mobile.longlink.msg.videoChat.LongLinkVideoChat.VideoChatOrBuilder
            public String getGiftId() {
                return ((VideoChat) this.instance).getGiftId();
            }

            @Override // com.p1.mobile.longlink.msg.videoChat.LongLinkVideoChat.VideoChatOrBuilder
            public ByteString getGiftIdBytes() {
                return ((VideoChat) this.instance).getGiftIdBytes();
            }

            @Override // com.p1.mobile.longlink.msg.videoChat.LongLinkVideoChat.VideoChatOrBuilder
            public String getId() {
                return ((VideoChat) this.instance).getId();
            }

            @Override // com.p1.mobile.longlink.msg.videoChat.LongLinkVideoChat.VideoChatOrBuilder
            public ByteString getIdBytes() {
                return ((VideoChat) this.instance).getIdBytes();
            }

            @Override // com.p1.mobile.longlink.msg.videoChat.LongLinkVideoChat.VideoChatOrBuilder
            public Status getLastStatus() {
                return ((VideoChat) this.instance).getLastStatus();
            }

            @Override // com.p1.mobile.longlink.msg.videoChat.LongLinkVideoChat.VideoChatOrBuilder
            public int getLastStatusValue() {
                return ((VideoChat) this.instance).getLastStatusValue();
            }

            @Override // com.p1.mobile.longlink.msg.videoChat.LongLinkVideoChat.VideoChatOrBuilder
            public String getLeaveUserId() {
                return ((VideoChat) this.instance).getLeaveUserId();
            }

            @Override // com.p1.mobile.longlink.msg.videoChat.LongLinkVideoChat.VideoChatOrBuilder
            public ByteString getLeaveUserIdBytes() {
                return ((VideoChat) this.instance).getLeaveUserIdBytes();
            }

            @Override // com.p1.mobile.longlink.msg.videoChat.LongLinkVideoChat.VideoChatOrBuilder
            public String getLiveId() {
                return ((VideoChat) this.instance).getLiveId();
            }

            @Override // com.p1.mobile.longlink.msg.videoChat.LongLinkVideoChat.VideoChatOrBuilder
            public ByteString getLiveIdBytes() {
                return ((VideoChat) this.instance).getLiveIdBytes();
            }

            @Override // com.p1.mobile.longlink.msg.videoChat.LongLinkVideoChat.VideoChatOrBuilder
            public VideoChatPlayer getPlayers(int i) {
                return ((VideoChat) this.instance).getPlayers(i);
            }

            @Override // com.p1.mobile.longlink.msg.videoChat.LongLinkVideoChat.VideoChatOrBuilder
            public int getPlayersCount() {
                return ((VideoChat) this.instance).getPlayersCount();
            }

            @Override // com.p1.mobile.longlink.msg.videoChat.LongLinkVideoChat.VideoChatOrBuilder
            public List<VideoChatPlayer> getPlayersList() {
                return Collections.unmodifiableList(((VideoChat) this.instance).getPlayersList());
            }

            @Override // com.p1.mobile.longlink.msg.videoChat.LongLinkVideoChat.VideoChatOrBuilder
            public String getPunishMessage() {
                return ((VideoChat) this.instance).getPunishMessage();
            }

            @Override // com.p1.mobile.longlink.msg.videoChat.LongLinkVideoChat.VideoChatOrBuilder
            public ByteString getPunishMessageBytes() {
                return ((VideoChat) this.instance).getPunishMessageBytes();
            }

            @Override // com.p1.mobile.longlink.msg.videoChat.LongLinkVideoChat.VideoChatOrBuilder
            public String getRoomId() {
                return ((VideoChat) this.instance).getRoomId();
            }

            @Override // com.p1.mobile.longlink.msg.videoChat.LongLinkVideoChat.VideoChatOrBuilder
            public ByteString getRoomIdBytes() {
                return ((VideoChat) this.instance).getRoomIdBytes();
            }

            @Override // com.p1.mobile.longlink.msg.videoChat.LongLinkVideoChat.VideoChatOrBuilder
            public String getRtcProvider() {
                return ((VideoChat) this.instance).getRtcProvider();
            }

            @Override // com.p1.mobile.longlink.msg.videoChat.LongLinkVideoChat.VideoChatOrBuilder
            public ByteString getRtcProviderBytes() {
                return ((VideoChat) this.instance).getRtcProviderBytes();
            }

            @Override // com.p1.mobile.longlink.msg.videoChat.LongLinkVideoChat.VideoChatOrBuilder
            public String getSource() {
                return ((VideoChat) this.instance).getSource();
            }

            @Override // com.p1.mobile.longlink.msg.videoChat.LongLinkVideoChat.VideoChatOrBuilder
            public ByteString getSourceBytes() {
                return ((VideoChat) this.instance).getSourceBytes();
            }

            @Override // com.p1.mobile.longlink.msg.videoChat.LongLinkVideoChat.VideoChatOrBuilder
            public long getStartedTime() {
                return ((VideoChat) this.instance).getStartedTime();
            }

            @Override // com.p1.mobile.longlink.msg.videoChat.LongLinkVideoChat.VideoChatOrBuilder
            public Status getStatus() {
                return ((VideoChat) this.instance).getStatus();
            }

            @Override // com.p1.mobile.longlink.msg.videoChat.LongLinkVideoChat.VideoChatOrBuilder
            public int getStatusValue() {
                return ((VideoChat) this.instance).getStatusValue();
            }

            @Override // com.p1.mobile.longlink.msg.videoChat.LongLinkVideoChat.VideoChatOrBuilder
            public long getTtc() {
                return ((VideoChat) this.instance).getTtc();
            }

            @Override // com.p1.mobile.longlink.msg.videoChat.LongLinkVideoChat.VideoChatOrBuilder
            public long getUpdatedTime() {
                return ((VideoChat) this.instance).getUpdatedTime();
            }

            @Override // com.p1.mobile.longlink.msg.videoChat.LongLinkVideoChat.VideoChatOrBuilder
            public String getUserId() {
                return ((VideoChat) this.instance).getUserId();
            }

            @Override // com.p1.mobile.longlink.msg.videoChat.LongLinkVideoChat.VideoChatOrBuilder
            public ByteString getUserIdBytes() {
                return ((VideoChat) this.instance).getUserIdBytes();
            }

            public Builder removePlayers(int i) {
                copyOnWrite();
                ((VideoChat) this.instance).removePlayers(i);
                return this;
            }

            public Builder setAnchorCallId(String str) {
                copyOnWrite();
                ((VideoChat) this.instance).setAnchorCallId(str);
                return this;
            }

            public Builder setAnchorCallIdBytes(ByteString byteString) {
                copyOnWrite();
                ((VideoChat) this.instance).setAnchorCallIdBytes(byteString);
                return this;
            }

            public Builder setAnchorId(String str) {
                copyOnWrite();
                ((VideoChat) this.instance).setAnchorId(str);
                return this;
            }

            public Builder setAnchorIdBytes(ByteString byteString) {
                copyOnWrite();
                ((VideoChat) this.instance).setAnchorIdBytes(byteString);
                return this;
            }

            public Builder setCalled(boolean z) {
                copyOnWrite();
                ((VideoChat) this.instance).setCalled(z);
                return this;
            }

            public Builder setCategory(Category category) {
                copyOnWrite();
                ((VideoChat) this.instance).setCategory(category);
                return this;
            }

            public Builder setCategoryValue(int i) {
                copyOnWrite();
                ((VideoChat) this.instance).setCategoryValue(i);
                return this;
            }

            public Builder setCreatedTime(long j) {
                copyOnWrite();
                ((VideoChat) this.instance).setCreatedTime(j);
                return this;
            }

            public Builder setEndTipMessage(String str) {
                copyOnWrite();
                ((VideoChat) this.instance).setEndTipMessage(str);
                return this;
            }

            public Builder setEndTipMessageBytes(ByteString byteString) {
                copyOnWrite();
                ((VideoChat) this.instance).setEndTipMessageBytes(byteString);
                return this;
            }

            public Builder setEndType(EndType endType) {
                copyOnWrite();
                ((VideoChat) this.instance).setEndType(endType);
                return this;
            }

            public Builder setEndTypeValue(int i) {
                copyOnWrite();
                ((VideoChat) this.instance).setEndTypeValue(i);
                return this;
            }

            public Builder setEndedTime(long j) {
                copyOnWrite();
                ((VideoChat) this.instance).setEndedTime(j);
                return this;
            }

            public Builder setErrorMessage(String str) {
                copyOnWrite();
                ((VideoChat) this.instance).setErrorMessage(str);
                return this;
            }

            public Builder setErrorMessageBytes(ByteString byteString) {
                copyOnWrite();
                ((VideoChat) this.instance).setErrorMessageBytes(byteString);
                return this;
            }

            public Builder setGiftId(String str) {
                copyOnWrite();
                ((VideoChat) this.instance).setGiftId(str);
                return this;
            }

            public Builder setGiftIdBytes(ByteString byteString) {
                copyOnWrite();
                ((VideoChat) this.instance).setGiftIdBytes(byteString);
                return this;
            }

            public Builder setId(String str) {
                copyOnWrite();
                ((VideoChat) this.instance).setId(str);
                return this;
            }

            public Builder setIdBytes(ByteString byteString) {
                copyOnWrite();
                ((VideoChat) this.instance).setIdBytes(byteString);
                return this;
            }

            public Builder setLastStatus(Status status) {
                copyOnWrite();
                ((VideoChat) this.instance).setLastStatus(status);
                return this;
            }

            public Builder setLastStatusValue(int i) {
                copyOnWrite();
                ((VideoChat) this.instance).setLastStatusValue(i);
                return this;
            }

            public Builder setLeaveUserId(String str) {
                copyOnWrite();
                ((VideoChat) this.instance).setLeaveUserId(str);
                return this;
            }

            public Builder setLeaveUserIdBytes(ByteString byteString) {
                copyOnWrite();
                ((VideoChat) this.instance).setLeaveUserIdBytes(byteString);
                return this;
            }

            public Builder setLiveId(String str) {
                copyOnWrite();
                ((VideoChat) this.instance).setLiveId(str);
                return this;
            }

            public Builder setLiveIdBytes(ByteString byteString) {
                copyOnWrite();
                ((VideoChat) this.instance).setLiveIdBytes(byteString);
                return this;
            }

            public Builder setPlayers(int i, VideoChatPlayer videoChatPlayer) {
                copyOnWrite();
                ((VideoChat) this.instance).setPlayers(i, videoChatPlayer);
                return this;
            }

            public Builder setPunishMessage(String str) {
                copyOnWrite();
                ((VideoChat) this.instance).setPunishMessage(str);
                return this;
            }

            public Builder setPunishMessageBytes(ByteString byteString) {
                copyOnWrite();
                ((VideoChat) this.instance).setPunishMessageBytes(byteString);
                return this;
            }

            public Builder setRoomId(String str) {
                copyOnWrite();
                ((VideoChat) this.instance).setRoomId(str);
                return this;
            }

            public Builder setRoomIdBytes(ByteString byteString) {
                copyOnWrite();
                ((VideoChat) this.instance).setRoomIdBytes(byteString);
                return this;
            }

            public Builder setRtcProvider(String str) {
                copyOnWrite();
                ((VideoChat) this.instance).setRtcProvider(str);
                return this;
            }

            public Builder setRtcProviderBytes(ByteString byteString) {
                copyOnWrite();
                ((VideoChat) this.instance).setRtcProviderBytes(byteString);
                return this;
            }

            public Builder setSource(String str) {
                copyOnWrite();
                ((VideoChat) this.instance).setSource(str);
                return this;
            }

            public Builder setSourceBytes(ByteString byteString) {
                copyOnWrite();
                ((VideoChat) this.instance).setSourceBytes(byteString);
                return this;
            }

            public Builder setStartedTime(long j) {
                copyOnWrite();
                ((VideoChat) this.instance).setStartedTime(j);
                return this;
            }

            public Builder setStatus(Status status) {
                copyOnWrite();
                ((VideoChat) this.instance).setStatus(status);
                return this;
            }

            public Builder setStatusValue(int i) {
                copyOnWrite();
                ((VideoChat) this.instance).setStatusValue(i);
                return this;
            }

            public Builder setTtc(long j) {
                copyOnWrite();
                ((VideoChat) this.instance).setTtc(j);
                return this;
            }

            public Builder setUpdatedTime(long j) {
                copyOnWrite();
                ((VideoChat) this.instance).setUpdatedTime(j);
                return this;
            }

            public Builder setUserId(String str) {
                copyOnWrite();
                ((VideoChat) this.instance).setUserId(str);
                return this;
            }

            public Builder setUserIdBytes(ByteString byteString) {
                copyOnWrite();
                ((VideoChat) this.instance).setUserIdBytes(byteString);
                return this;
            }

            public Builder addPlayers(int i, VideoChatPlayer videoChatPlayer) {
                copyOnWrite();
                ((VideoChat) this.instance).addPlayers(i, videoChatPlayer);
                return this;
            }

            public Builder setPlayers(int i, VideoChatPlayer.Builder builder) {
                copyOnWrite();
                ((VideoChat) this.instance).setPlayers(i, builder);
                return this;
            }

            public Builder addPlayers(VideoChatPlayer.Builder builder) {
                copyOnWrite();
                ((VideoChat) this.instance).addPlayers(builder);
                return this;
            }

            public Builder addPlayers(int i, VideoChatPlayer.Builder builder) {
                copyOnWrite();
                ((VideoChat) this.instance).addPlayers(i, builder);
                return this;
            }
        }

        public static VideoChat parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (VideoChat) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static VideoChat parseFrom(byte[] bArr, C3433h c3433h) throws InvalidProtocolBufferException {
            return (VideoChat) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, c3433h);
        }

        public static VideoChat parseFrom(InputStream inputStream) throws IOException {
            return (VideoChat) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static VideoChat parseFrom(InputStream inputStream, C3433h c3433h) throws IOException {
            return (VideoChat) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, c3433h);
        }

        public static VideoChat parseFrom(C3430e c3430e) throws IOException {
            return (VideoChat) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, c3430e);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addPlayers(int i, VideoChatPlayer videoChatPlayer) {
            videoChatPlayer.getClass();
            ensurePlayersIsMutable();
            this.players_.add(i, videoChatPlayer);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static VideoChat parseFrom(C3430e c3430e, C3433h c3433h) throws IOException {
            return (VideoChat) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, c3430e, c3433h);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setPlayers(int i, VideoChatPlayer videoChatPlayer) {
            videoChatPlayer.getClass();
            ensurePlayersIsMutable();
            this.players_.set(i, videoChatPlayer);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addPlayers(VideoChatPlayer videoChatPlayer) {
            videoChatPlayer.getClass();
            ensurePlayersIsMutable();
            this.players_.add(videoChatPlayer);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addPlayers(int i, VideoChatPlayer.Builder builder) {
            ensurePlayersIsMutable();
            this.players_.add(i, builder.build());
        }
    }

    public static final class LiveVideoChatAnchorCallResult extends GeneratedMessageLite<LiveVideoChatAnchorCallResult, Builder> implements LiveVideoChatAnchorCallResultOrBuilder {
        public static final int ANCHORID_FIELD_NUMBER = 2;
        public static final int CALLID_FIELD_NUMBER = 1;
        private static final LiveVideoChatAnchorCallResult DEFAULT_INSTANCE;
        private static volatile ng60<LiveVideoChatAnchorCallResult> PARSER = null;
        public static final int STATUS_FIELD_NUMBER = 4;
        public static final int USERID_FIELD_NUMBER = 3;
        private String callId_ = "";
        private String anchorId_ = "";
        private String userId_ = "";
        private String status_ = "";

        public static final class Builder extends GeneratedMessageLite.AbstractC3403b<LiveVideoChatAnchorCallResult, Builder> implements LiveVideoChatAnchorCallResultOrBuilder {
            private Builder() {
                super(LiveVideoChatAnchorCallResult.DEFAULT_INSTANCE);
            }

            public Builder clearAnchorId() {
                copyOnWrite();
                ((LiveVideoChatAnchorCallResult) this.instance).clearAnchorId();
                return this;
            }

            public Builder clearCallId() {
                copyOnWrite();
                ((LiveVideoChatAnchorCallResult) this.instance).clearCallId();
                return this;
            }

            public Builder clearStatus() {
                copyOnWrite();
                ((LiveVideoChatAnchorCallResult) this.instance).clearStatus();
                return this;
            }

            public Builder clearUserId() {
                copyOnWrite();
                ((LiveVideoChatAnchorCallResult) this.instance).clearUserId();
                return this;
            }

            @Override // com.p1.mobile.longlink.msg.videoChat.LongLinkVideoChat.LiveVideoChatAnchorCallResultOrBuilder
            public String getAnchorId() {
                return ((LiveVideoChatAnchorCallResult) this.instance).getAnchorId();
            }

            @Override // com.p1.mobile.longlink.msg.videoChat.LongLinkVideoChat.LiveVideoChatAnchorCallResultOrBuilder
            public ByteString getAnchorIdBytes() {
                return ((LiveVideoChatAnchorCallResult) this.instance).getAnchorIdBytes();
            }

            @Override // com.p1.mobile.longlink.msg.videoChat.LongLinkVideoChat.LiveVideoChatAnchorCallResultOrBuilder
            public String getCallId() {
                return ((LiveVideoChatAnchorCallResult) this.instance).getCallId();
            }

            @Override // com.p1.mobile.longlink.msg.videoChat.LongLinkVideoChat.LiveVideoChatAnchorCallResultOrBuilder
            public ByteString getCallIdBytes() {
                return ((LiveVideoChatAnchorCallResult) this.instance).getCallIdBytes();
            }

            @Override // com.p1.mobile.longlink.msg.videoChat.LongLinkVideoChat.LiveVideoChatAnchorCallResultOrBuilder
            public String getStatus() {
                return ((LiveVideoChatAnchorCallResult) this.instance).getStatus();
            }

            @Override // com.p1.mobile.longlink.msg.videoChat.LongLinkVideoChat.LiveVideoChatAnchorCallResultOrBuilder
            public ByteString getStatusBytes() {
                return ((LiveVideoChatAnchorCallResult) this.instance).getStatusBytes();
            }

            @Override // com.p1.mobile.longlink.msg.videoChat.LongLinkVideoChat.LiveVideoChatAnchorCallResultOrBuilder
            public String getUserId() {
                return ((LiveVideoChatAnchorCallResult) this.instance).getUserId();
            }

            @Override // com.p1.mobile.longlink.msg.videoChat.LongLinkVideoChat.LiveVideoChatAnchorCallResultOrBuilder
            public ByteString getUserIdBytes() {
                return ((LiveVideoChatAnchorCallResult) this.instance).getUserIdBytes();
            }

            public Builder setAnchorId(String str) {
                copyOnWrite();
                ((LiveVideoChatAnchorCallResult) this.instance).setAnchorId(str);
                return this;
            }

            public Builder setAnchorIdBytes(ByteString byteString) {
                copyOnWrite();
                ((LiveVideoChatAnchorCallResult) this.instance).setAnchorIdBytes(byteString);
                return this;
            }

            public Builder setCallId(String str) {
                copyOnWrite();
                ((LiveVideoChatAnchorCallResult) this.instance).setCallId(str);
                return this;
            }

            public Builder setCallIdBytes(ByteString byteString) {
                copyOnWrite();
                ((LiveVideoChatAnchorCallResult) this.instance).setCallIdBytes(byteString);
                return this;
            }

            public Builder setStatus(String str) {
                copyOnWrite();
                ((LiveVideoChatAnchorCallResult) this.instance).setStatus(str);
                return this;
            }

            public Builder setStatusBytes(ByteString byteString) {
                copyOnWrite();
                ((LiveVideoChatAnchorCallResult) this.instance).setStatusBytes(byteString);
                return this;
            }

            public Builder setUserId(String str) {
                copyOnWrite();
                ((LiveVideoChatAnchorCallResult) this.instance).setUserId(str);
                return this;
            }

            public Builder setUserIdBytes(ByteString byteString) {
                copyOnWrite();
                ((LiveVideoChatAnchorCallResult) this.instance).setUserIdBytes(byteString);
                return this;
            }
        }

        static {
            LiveVideoChatAnchorCallResult liveVideoChatAnchorCallResult = new LiveVideoChatAnchorCallResult();
            DEFAULT_INSTANCE = liveVideoChatAnchorCallResult;
            liveVideoChatAnchorCallResult.makeImmutable();
        }

        private LiveVideoChatAnchorCallResult() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAnchorId() {
            this.anchorId_ = getDefaultInstance().getAnchorId();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearCallId() {
            this.callId_ = getDefaultInstance().getCallId();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearStatus() {
            this.status_ = getDefaultInstance().getStatus();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearUserId() {
            this.userId_ = getDefaultInstance().getUserId();
        }

        public static LiveVideoChatAnchorCallResult getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder(LiveVideoChatAnchorCallResult liveVideoChatAnchorCallResult) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(liveVideoChatAnchorCallResult);
        }

        public static LiveVideoChatAnchorCallResult parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (LiveVideoChatAnchorCallResult) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static LiveVideoChatAnchorCallResult parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (LiveVideoChatAnchorCallResult) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static ng60<LiveVideoChatAnchorCallResult> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAnchorId(String str) {
            str.getClass();
            this.anchorId_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAnchorIdBytes(ByteString byteString) {
            byteString.getClass();
            AbstractC3426a.checkByteStringIsUtf8(byteString);
            this.anchorId_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setCallId(String str) {
            str.getClass();
            this.callId_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setCallIdBytes(ByteString byteString) {
            byteString.getClass();
            AbstractC3426a.checkByteStringIsUtf8(byteString);
            this.callId_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setStatus(String str) {
            str.getClass();
            this.status_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setStatusBytes(ByteString byteString) {
            byteString.getClass();
            AbstractC3426a.checkByteStringIsUtf8(byteString);
            this.status_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setUserId(String str) {
            str.getClass();
            this.userId_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setUserIdBytes(ByteString byteString) {
            byteString.getClass();
            AbstractC3426a.checkByteStringIsUtf8(byteString);
            this.userId_ = byteString.toStringUtf8();
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (C47011.f16718xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new LiveVideoChatAnchorCallResult();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                    return null;
                case 4:
                    return new Builder();
                case 5:
                    GeneratedMessageLite.InterfaceC3409h interfaceC3409h = (GeneratedMessageLite.InterfaceC3409h) obj;
                    LiveVideoChatAnchorCallResult liveVideoChatAnchorCallResult = (LiveVideoChatAnchorCallResult) obj2;
                    this.callId_ = interfaceC3409h.mo17052f(!this.callId_.isEmpty(), this.callId_, !liveVideoChatAnchorCallResult.callId_.isEmpty(), liveVideoChatAnchorCallResult.callId_);
                    this.anchorId_ = interfaceC3409h.mo17052f(!this.anchorId_.isEmpty(), this.anchorId_, !liveVideoChatAnchorCallResult.anchorId_.isEmpty(), liveVideoChatAnchorCallResult.anchorId_);
                    this.userId_ = interfaceC3409h.mo17052f(!this.userId_.isEmpty(), this.userId_, !liveVideoChatAnchorCallResult.userId_.isEmpty(), liveVideoChatAnchorCallResult.userId_);
                    this.status_ = interfaceC3409h.mo17052f(!this.status_.isEmpty(), this.status_, true ^ liveVideoChatAnchorCallResult.status_.isEmpty(), liveVideoChatAnchorCallResult.status_);
                    GeneratedMessageLite.C3408g c3408g = GeneratedMessageLite.C3408g.INSTANCE;
                    return this;
                case 6:
                    C3430e c3430e = (C3430e) obj;
                    boolean z = false;
                    while (!z) {
                        try {
                            int iM17171M = c3430e.m17171M();
                            if (iM17171M != 0) {
                                if (iM17171M == 10) {
                                    this.callId_ = c3430e.m17170L();
                                } else if (iM17171M == 18) {
                                    this.anchorId_ = c3430e.m17170L();
                                } else if (iM17171M == 26) {
                                    this.userId_ = c3430e.m17170L();
                                } else if (iM17171M == 34) {
                                    this.status_ = c3430e.m17170L();
                                } else if (!c3430e.m17176R(iM17171M)) {
                                }
                            }
                            z = true;
                        } catch (InvalidProtocolBufferException e) {
                            iig0.m140070a(e.setUnfinishedMessage(this));
                            return null;
                        } catch (IOException e2) {
                            iig0.m140070a(new InvalidProtocolBufferException(e2.getMessage()).setUnfinishedMessage(this));
                            return null;
                        }
                    }
                    break;
                case 7:
                    break;
                case 8:
                    if (PARSER == null) {
                        synchronized (LiveVideoChatAnchorCallResult.class) {
                            try {
                                if (PARSER == null) {
                                    PARSER = new GeneratedMessageLite.C3404c(DEFAULT_INSTANCE);
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                            break;
                        }
                    }
                    return PARSER;
                default:
                    l710.m153113a();
                    return null;
            }
            return DEFAULT_INSTANCE;
        }

        @Override // com.p1.mobile.longlink.msg.videoChat.LongLinkVideoChat.LiveVideoChatAnchorCallResultOrBuilder
        public String getAnchorId() {
            return this.anchorId_;
        }

        @Override // com.p1.mobile.longlink.msg.videoChat.LongLinkVideoChat.LiveVideoChatAnchorCallResultOrBuilder
        public ByteString getAnchorIdBytes() {
            return ByteString.copyFromUtf8(this.anchorId_);
        }

        @Override // com.p1.mobile.longlink.msg.videoChat.LongLinkVideoChat.LiveVideoChatAnchorCallResultOrBuilder
        public String getCallId() {
            return this.callId_;
        }

        @Override // com.p1.mobile.longlink.msg.videoChat.LongLinkVideoChat.LiveVideoChatAnchorCallResultOrBuilder
        public ByteString getCallIdBytes() {
            return ByteString.copyFromUtf8(this.callId_);
        }

        @Override // com.google.protobuf.InterfaceC3442q
        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int iM16956K = !this.callId_.isEmpty() ? CodedOutputStream.m16956K(1, getCallId()) : 0;
            if (!this.anchorId_.isEmpty()) {
                iM16956K += CodedOutputStream.m16956K(2, getAnchorId());
            }
            if (!this.userId_.isEmpty()) {
                iM16956K += CodedOutputStream.m16956K(3, getUserId());
            }
            if (!this.status_.isEmpty()) {
                iM16956K += CodedOutputStream.m16956K(4, getStatus());
            }
            this.memoizedSerializedSize = iM16956K;
            return iM16956K;
        }

        @Override // com.p1.mobile.longlink.msg.videoChat.LongLinkVideoChat.LiveVideoChatAnchorCallResultOrBuilder
        public String getStatus() {
            return this.status_;
        }

        @Override // com.p1.mobile.longlink.msg.videoChat.LongLinkVideoChat.LiveVideoChatAnchorCallResultOrBuilder
        public ByteString getStatusBytes() {
            return ByteString.copyFromUtf8(this.status_);
        }

        @Override // com.p1.mobile.longlink.msg.videoChat.LongLinkVideoChat.LiveVideoChatAnchorCallResultOrBuilder
        public String getUserId() {
            return this.userId_;
        }

        @Override // com.p1.mobile.longlink.msg.videoChat.LongLinkVideoChat.LiveVideoChatAnchorCallResultOrBuilder
        public ByteString getUserIdBytes() {
            return ByteString.copyFromUtf8(this.userId_);
        }

        @Override // com.google.protobuf.InterfaceC3442q
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (!this.callId_.isEmpty()) {
                codedOutputStream.mo16994D0(1, getCallId());
            }
            if (!this.anchorId_.isEmpty()) {
                codedOutputStream.mo16994D0(2, getAnchorId());
            }
            if (!this.userId_.isEmpty()) {
                codedOutputStream.mo16994D0(3, getUserId());
            }
            if (this.status_.isEmpty()) {
                return;
            }
            codedOutputStream.mo16994D0(4, getStatus());
        }

        public static LiveVideoChatAnchorCallResult parseDelimitedFrom(InputStream inputStream, C3433h c3433h) throws IOException {
            return (LiveVideoChatAnchorCallResult) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, c3433h);
        }

        public static LiveVideoChatAnchorCallResult parseFrom(ByteString byteString, C3433h c3433h) throws InvalidProtocolBufferException {
            return (LiveVideoChatAnchorCallResult) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, c3433h);
        }

        public static LiveVideoChatAnchorCallResult parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (LiveVideoChatAnchorCallResult) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static LiveVideoChatAnchorCallResult parseFrom(byte[] bArr, C3433h c3433h) throws InvalidProtocolBufferException {
            return (LiveVideoChatAnchorCallResult) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, c3433h);
        }

        public static LiveVideoChatAnchorCallResult parseFrom(InputStream inputStream) throws IOException {
            return (LiveVideoChatAnchorCallResult) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static LiveVideoChatAnchorCallResult parseFrom(InputStream inputStream, C3433h c3433h) throws IOException {
            return (LiveVideoChatAnchorCallResult) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, c3433h);
        }

        public static LiveVideoChatAnchorCallResult parseFrom(C3430e c3430e) throws IOException {
            return (LiveVideoChatAnchorCallResult) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, c3430e);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static LiveVideoChatAnchorCallResult parseFrom(C3430e c3430e, C3433h c3433h) throws IOException {
            return (LiveVideoChatAnchorCallResult) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, c3430e, c3433h);
        }
    }

    public static final class LiveVideoChatBubble extends GeneratedMessageLite<LiveVideoChatBubble, Builder> implements LiveVideoChatBubbleOrBuilder {
        private static final LiveVideoChatBubble DEFAULT_INSTANCE;
        public static final int DURATION_FIELD_NUMBER = 2;
        private static volatile ng60<LiveVideoChatBubble> PARSER = null;
        public static final int TEXT_FIELD_NUMBER = 1;
        private long duration_;
        private String text_ = "";

        public static final class Builder extends GeneratedMessageLite.AbstractC3403b<LiveVideoChatBubble, Builder> implements LiveVideoChatBubbleOrBuilder {
            private Builder() {
                super(LiveVideoChatBubble.DEFAULT_INSTANCE);
            }

            public Builder clearDuration() {
                copyOnWrite();
                ((LiveVideoChatBubble) this.instance).clearDuration();
                return this;
            }

            public Builder clearText() {
                copyOnWrite();
                ((LiveVideoChatBubble) this.instance).clearText();
                return this;
            }

            @Override // com.p1.mobile.longlink.msg.videoChat.LongLinkVideoChat.LiveVideoChatBubbleOrBuilder
            public long getDuration() {
                return ((LiveVideoChatBubble) this.instance).getDuration();
            }

            @Override // com.p1.mobile.longlink.msg.videoChat.LongLinkVideoChat.LiveVideoChatBubbleOrBuilder
            public String getText() {
                return ((LiveVideoChatBubble) this.instance).getText();
            }

            @Override // com.p1.mobile.longlink.msg.videoChat.LongLinkVideoChat.LiveVideoChatBubbleOrBuilder
            public ByteString getTextBytes() {
                return ((LiveVideoChatBubble) this.instance).getTextBytes();
            }

            public Builder setDuration(long j) {
                copyOnWrite();
                ((LiveVideoChatBubble) this.instance).setDuration(j);
                return this;
            }

            public Builder setText(String str) {
                copyOnWrite();
                ((LiveVideoChatBubble) this.instance).setText(str);
                return this;
            }

            public Builder setTextBytes(ByteString byteString) {
                copyOnWrite();
                ((LiveVideoChatBubble) this.instance).setTextBytes(byteString);
                return this;
            }
        }

        static {
            LiveVideoChatBubble liveVideoChatBubble = new LiveVideoChatBubble();
            DEFAULT_INSTANCE = liveVideoChatBubble;
            liveVideoChatBubble.makeImmutable();
        }

        private LiveVideoChatBubble() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearDuration() {
            this.duration_ = 0L;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearText() {
            this.text_ = getDefaultInstance().getText();
        }

        public static LiveVideoChatBubble getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder(LiveVideoChatBubble liveVideoChatBubble) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(liveVideoChatBubble);
        }

        public static LiveVideoChatBubble parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (LiveVideoChatBubble) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static LiveVideoChatBubble parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (LiveVideoChatBubble) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static ng60<LiveVideoChatBubble> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setDuration(long j) {
            this.duration_ = j;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setText(String str) {
            str.getClass();
            this.text_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTextBytes(ByteString byteString) {
            byteString.getClass();
            AbstractC3426a.checkByteStringIsUtf8(byteString);
            this.text_ = byteString.toStringUtf8();
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            boolean z = false;
            switch (C47011.f16718xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new LiveVideoChatBubble();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                    return null;
                case 4:
                    return new Builder();
                case 5:
                    GeneratedMessageLite.InterfaceC3409h interfaceC3409h = (GeneratedMessageLite.InterfaceC3409h) obj;
                    LiveVideoChatBubble liveVideoChatBubble = (LiveVideoChatBubble) obj2;
                    this.text_ = interfaceC3409h.mo17052f(!this.text_.isEmpty(), this.text_, !liveVideoChatBubble.text_.isEmpty(), liveVideoChatBubble.text_);
                    long j = this.duration_;
                    boolean z2 = j != 0;
                    long j2 = liveVideoChatBubble.duration_;
                    this.duration_ = interfaceC3409h.mo17055i(z2, j, j2 != 0, j2);
                    GeneratedMessageLite.C3408g c3408g = GeneratedMessageLite.C3408g.INSTANCE;
                    return this;
                case 6:
                    C3430e c3430e = (C3430e) obj;
                    while (!z) {
                        try {
                            int iM17171M = c3430e.m17171M();
                            if (iM17171M != 0) {
                                if (iM17171M == 10) {
                                    this.text_ = c3430e.m17170L();
                                } else if (iM17171M == 16) {
                                    this.duration_ = c3430e.m17197v();
                                } else if (!c3430e.m17176R(iM17171M)) {
                                }
                            }
                            z = true;
                        } catch (InvalidProtocolBufferException e) {
                            iig0.m140070a(e.setUnfinishedMessage(this));
                            return null;
                        } catch (IOException e2) {
                            iig0.m140070a(new InvalidProtocolBufferException(e2.getMessage()).setUnfinishedMessage(this));
                            return null;
                        }
                    }
                    break;
                case 7:
                    break;
                case 8:
                    if (PARSER == null) {
                        synchronized (LiveVideoChatBubble.class) {
                            try {
                                if (PARSER == null) {
                                    PARSER = new GeneratedMessageLite.C3404c(DEFAULT_INSTANCE);
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                            break;
                        }
                    }
                    return PARSER;
                default:
                    l710.m153113a();
                    return null;
            }
            return DEFAULT_INSTANCE;
        }

        @Override // com.p1.mobile.longlink.msg.videoChat.LongLinkVideoChat.LiveVideoChatBubbleOrBuilder
        public long getDuration() {
            return this.duration_;
        }

        @Override // com.google.protobuf.InterfaceC3442q
        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int iM16956K = !this.text_.isEmpty() ? CodedOutputStream.m16956K(1, getText()) : 0;
            long j = this.duration_;
            if (j != 0) {
                iM16956K += CodedOutputStream.m16986v(2, j);
            }
            this.memoizedSerializedSize = iM16956K;
            return iM16956K;
        }

        @Override // com.p1.mobile.longlink.msg.videoChat.LongLinkVideoChat.LiveVideoChatBubbleOrBuilder
        public String getText() {
            return this.text_;
        }

        @Override // com.p1.mobile.longlink.msg.videoChat.LongLinkVideoChat.LiveVideoChatBubbleOrBuilder
        public ByteString getTextBytes() {
            return ByteString.copyFromUtf8(this.text_);
        }

        @Override // com.google.protobuf.InterfaceC3442q
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (!this.text_.isEmpty()) {
                codedOutputStream.mo16994D0(1, getText());
            }
            long j = this.duration_;
            if (j != 0) {
                codedOutputStream.m17027u0(2, j);
            }
        }

        public static LiveVideoChatBubble parseDelimitedFrom(InputStream inputStream, C3433h c3433h) throws IOException {
            return (LiveVideoChatBubble) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, c3433h);
        }

        public static LiveVideoChatBubble parseFrom(ByteString byteString, C3433h c3433h) throws InvalidProtocolBufferException {
            return (LiveVideoChatBubble) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, c3433h);
        }

        public static LiveVideoChatBubble parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (LiveVideoChatBubble) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static LiveVideoChatBubble parseFrom(byte[] bArr, C3433h c3433h) throws InvalidProtocolBufferException {
            return (LiveVideoChatBubble) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, c3433h);
        }

        public static LiveVideoChatBubble parseFrom(InputStream inputStream) throws IOException {
            return (LiveVideoChatBubble) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static LiveVideoChatBubble parseFrom(InputStream inputStream, C3433h c3433h) throws IOException {
            return (LiveVideoChatBubble) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, c3433h);
        }

        public static LiveVideoChatBubble parseFrom(C3430e c3430e) throws IOException {
            return (LiveVideoChatBubble) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, c3430e);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static LiveVideoChatBubble parseFrom(C3430e c3430e, C3433h c3433h) throws IOException {
            return (LiveVideoChatBubble) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, c3430e, c3433h);
        }
    }

    public static final class LiveVideoChatCdnFail extends GeneratedMessageLite<LiveVideoChatCdnFail, Builder> implements LiveVideoChatCdnFailOrBuilder {
        public static final int CHATID_FIELD_NUMBER = 1;
        private static final LiveVideoChatCdnFail DEFAULT_INSTANCE;
        public static final int NEWPUSHURL_FIELD_NUMBER = 2;
        private static volatile ng60<LiveVideoChatCdnFail> PARSER;
        private String chatId_ = "";
        private String newPushUrl_ = "";

        public static final class Builder extends GeneratedMessageLite.AbstractC3403b<LiveVideoChatCdnFail, Builder> implements LiveVideoChatCdnFailOrBuilder {
            private Builder() {
                super(LiveVideoChatCdnFail.DEFAULT_INSTANCE);
            }

            public Builder clearChatId() {
                copyOnWrite();
                ((LiveVideoChatCdnFail) this.instance).clearChatId();
                return this;
            }

            public Builder clearNewPushUrl() {
                copyOnWrite();
                ((LiveVideoChatCdnFail) this.instance).clearNewPushUrl();
                return this;
            }

            @Override // com.p1.mobile.longlink.msg.videoChat.LongLinkVideoChat.LiveVideoChatCdnFailOrBuilder
            public String getChatId() {
                return ((LiveVideoChatCdnFail) this.instance).getChatId();
            }

            @Override // com.p1.mobile.longlink.msg.videoChat.LongLinkVideoChat.LiveVideoChatCdnFailOrBuilder
            public ByteString getChatIdBytes() {
                return ((LiveVideoChatCdnFail) this.instance).getChatIdBytes();
            }

            @Override // com.p1.mobile.longlink.msg.videoChat.LongLinkVideoChat.LiveVideoChatCdnFailOrBuilder
            public String getNewPushUrl() {
                return ((LiveVideoChatCdnFail) this.instance).getNewPushUrl();
            }

            @Override // com.p1.mobile.longlink.msg.videoChat.LongLinkVideoChat.LiveVideoChatCdnFailOrBuilder
            public ByteString getNewPushUrlBytes() {
                return ((LiveVideoChatCdnFail) this.instance).getNewPushUrlBytes();
            }

            public Builder setChatId(String str) {
                copyOnWrite();
                ((LiveVideoChatCdnFail) this.instance).setChatId(str);
                return this;
            }

            public Builder setChatIdBytes(ByteString byteString) {
                copyOnWrite();
                ((LiveVideoChatCdnFail) this.instance).setChatIdBytes(byteString);
                return this;
            }

            public Builder setNewPushUrl(String str) {
                copyOnWrite();
                ((LiveVideoChatCdnFail) this.instance).setNewPushUrl(str);
                return this;
            }

            public Builder setNewPushUrlBytes(ByteString byteString) {
                copyOnWrite();
                ((LiveVideoChatCdnFail) this.instance).setNewPushUrlBytes(byteString);
                return this;
            }
        }

        static {
            LiveVideoChatCdnFail liveVideoChatCdnFail = new LiveVideoChatCdnFail();
            DEFAULT_INSTANCE = liveVideoChatCdnFail;
            liveVideoChatCdnFail.makeImmutable();
        }

        private LiveVideoChatCdnFail() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearChatId() {
            this.chatId_ = getDefaultInstance().getChatId();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearNewPushUrl() {
            this.newPushUrl_ = getDefaultInstance().getNewPushUrl();
        }

        public static LiveVideoChatCdnFail getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder(LiveVideoChatCdnFail liveVideoChatCdnFail) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(liveVideoChatCdnFail);
        }

        public static LiveVideoChatCdnFail parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (LiveVideoChatCdnFail) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static LiveVideoChatCdnFail parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (LiveVideoChatCdnFail) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static ng60<LiveVideoChatCdnFail> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setChatId(String str) {
            str.getClass();
            this.chatId_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setChatIdBytes(ByteString byteString) {
            byteString.getClass();
            AbstractC3426a.checkByteStringIsUtf8(byteString);
            this.chatId_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setNewPushUrl(String str) {
            str.getClass();
            this.newPushUrl_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setNewPushUrlBytes(ByteString byteString) {
            byteString.getClass();
            AbstractC3426a.checkByteStringIsUtf8(byteString);
            this.newPushUrl_ = byteString.toStringUtf8();
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (C47011.f16718xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new LiveVideoChatCdnFail();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                    return null;
                case 4:
                    return new Builder();
                case 5:
                    GeneratedMessageLite.InterfaceC3409h interfaceC3409h = (GeneratedMessageLite.InterfaceC3409h) obj;
                    LiveVideoChatCdnFail liveVideoChatCdnFail = (LiveVideoChatCdnFail) obj2;
                    this.chatId_ = interfaceC3409h.mo17052f(!this.chatId_.isEmpty(), this.chatId_, !liveVideoChatCdnFail.chatId_.isEmpty(), liveVideoChatCdnFail.chatId_);
                    this.newPushUrl_ = interfaceC3409h.mo17052f(!this.newPushUrl_.isEmpty(), this.newPushUrl_, true ^ liveVideoChatCdnFail.newPushUrl_.isEmpty(), liveVideoChatCdnFail.newPushUrl_);
                    GeneratedMessageLite.C3408g c3408g = GeneratedMessageLite.C3408g.INSTANCE;
                    return this;
                case 6:
                    C3430e c3430e = (C3430e) obj;
                    boolean z = false;
                    while (!z) {
                        try {
                            int iM17171M = c3430e.m17171M();
                            if (iM17171M != 0) {
                                if (iM17171M == 10) {
                                    this.chatId_ = c3430e.m17170L();
                                } else if (iM17171M == 18) {
                                    this.newPushUrl_ = c3430e.m17170L();
                                } else if (!c3430e.m17176R(iM17171M)) {
                                }
                            }
                            z = true;
                        } catch (InvalidProtocolBufferException e) {
                            iig0.m140070a(e.setUnfinishedMessage(this));
                            return null;
                        } catch (IOException e2) {
                            iig0.m140070a(new InvalidProtocolBufferException(e2.getMessage()).setUnfinishedMessage(this));
                            return null;
                        }
                    }
                    break;
                case 7:
                    break;
                case 8:
                    if (PARSER == null) {
                        synchronized (LiveVideoChatCdnFail.class) {
                            try {
                                if (PARSER == null) {
                                    PARSER = new GeneratedMessageLite.C3404c(DEFAULT_INSTANCE);
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                            break;
                        }
                    }
                    return PARSER;
                default:
                    l710.m153113a();
                    return null;
            }
            return DEFAULT_INSTANCE;
        }

        @Override // com.p1.mobile.longlink.msg.videoChat.LongLinkVideoChat.LiveVideoChatCdnFailOrBuilder
        public String getChatId() {
            return this.chatId_;
        }

        @Override // com.p1.mobile.longlink.msg.videoChat.LongLinkVideoChat.LiveVideoChatCdnFailOrBuilder
        public ByteString getChatIdBytes() {
            return ByteString.copyFromUtf8(this.chatId_);
        }

        @Override // com.p1.mobile.longlink.msg.videoChat.LongLinkVideoChat.LiveVideoChatCdnFailOrBuilder
        public String getNewPushUrl() {
            return this.newPushUrl_;
        }

        @Override // com.p1.mobile.longlink.msg.videoChat.LongLinkVideoChat.LiveVideoChatCdnFailOrBuilder
        public ByteString getNewPushUrlBytes() {
            return ByteString.copyFromUtf8(this.newPushUrl_);
        }

        @Override // com.google.protobuf.InterfaceC3442q
        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int iM16956K = !this.chatId_.isEmpty() ? CodedOutputStream.m16956K(1, getChatId()) : 0;
            if (!this.newPushUrl_.isEmpty()) {
                iM16956K += CodedOutputStream.m16956K(2, getNewPushUrl());
            }
            this.memoizedSerializedSize = iM16956K;
            return iM16956K;
        }

        @Override // com.google.protobuf.InterfaceC3442q
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (!this.chatId_.isEmpty()) {
                codedOutputStream.mo16994D0(1, getChatId());
            }
            if (this.newPushUrl_.isEmpty()) {
                return;
            }
            codedOutputStream.mo16994D0(2, getNewPushUrl());
        }

        public static LiveVideoChatCdnFail parseDelimitedFrom(InputStream inputStream, C3433h c3433h) throws IOException {
            return (LiveVideoChatCdnFail) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, c3433h);
        }

        public static LiveVideoChatCdnFail parseFrom(ByteString byteString, C3433h c3433h) throws InvalidProtocolBufferException {
            return (LiveVideoChatCdnFail) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, c3433h);
        }

        public static LiveVideoChatCdnFail parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (LiveVideoChatCdnFail) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static LiveVideoChatCdnFail parseFrom(byte[] bArr, C3433h c3433h) throws InvalidProtocolBufferException {
            return (LiveVideoChatCdnFail) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, c3433h);
        }

        public static LiveVideoChatCdnFail parseFrom(InputStream inputStream) throws IOException {
            return (LiveVideoChatCdnFail) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static LiveVideoChatCdnFail parseFrom(InputStream inputStream, C3433h c3433h) throws IOException {
            return (LiveVideoChatCdnFail) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, c3433h);
        }

        public static LiveVideoChatCdnFail parseFrom(C3430e c3430e) throws IOException {
            return (LiveVideoChatCdnFail) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, c3430e);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static LiveVideoChatCdnFail parseFrom(C3430e c3430e, C3433h c3433h) throws IOException {
            return (LiveVideoChatCdnFail) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, c3430e, c3433h);
        }
    }

    public static final class LiveVideoChatChange extends GeneratedMessageLite<LiveVideoChatChange, Builder> implements LiveVideoChatChangeOrBuilder {
        private static final LiveVideoChatChange DEFAULT_INSTANCE;
        private static volatile ng60<LiveVideoChatChange> PARSER = null;
        public static final int REASON_FIELD_NUMBER = 2;
        public static final int VIDEOCHAT_FIELD_NUMBER = 1;
        private String reason_ = "";
        private VideoChat videoChat_;

        static {
            LiveVideoChatChange liveVideoChatChange = new LiveVideoChatChange();
            DEFAULT_INSTANCE = liveVideoChatChange;
            liveVideoChatChange.makeImmutable();
        }

        private LiveVideoChatChange() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearReason() {
            this.reason_ = getDefaultInstance().getReason();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearVideoChat() {
            this.videoChat_ = null;
        }

        public static LiveVideoChatChange getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeVideoChat(VideoChat videoChat) {
            VideoChat videoChat2 = this.videoChat_;
            if (videoChat2 == null || videoChat2 == VideoChat.getDefaultInstance()) {
                this.videoChat_ = videoChat;
            } else {
                this.videoChat_ = VideoChat.newBuilder(this.videoChat_).mergeFrom(videoChat).buildPartial();
            }
        }

        public static Builder newBuilder(LiveVideoChatChange liveVideoChatChange) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(liveVideoChatChange);
        }

        public static LiveVideoChatChange parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (LiveVideoChatChange) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static LiveVideoChatChange parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (LiveVideoChatChange) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static ng60<LiveVideoChatChange> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setReason(String str) {
            str.getClass();
            this.reason_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setReasonBytes(ByteString byteString) {
            byteString.getClass();
            AbstractC3426a.checkByteStringIsUtf8(byteString);
            this.reason_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setVideoChat(VideoChat.Builder builder) {
            this.videoChat_ = builder.build();
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (C47011.f16718xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new LiveVideoChatChange();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                    return null;
                case 4:
                    return new Builder();
                case 5:
                    GeneratedMessageLite.InterfaceC3409h interfaceC3409h = (GeneratedMessageLite.InterfaceC3409h) obj;
                    LiveVideoChatChange liveVideoChatChange = (LiveVideoChatChange) obj2;
                    this.videoChat_ = (VideoChat) interfaceC3409h.mo17061o(this.videoChat_, liveVideoChatChange.videoChat_);
                    this.reason_ = interfaceC3409h.mo17052f(!this.reason_.isEmpty(), this.reason_, true ^ liveVideoChatChange.reason_.isEmpty(), liveVideoChatChange.reason_);
                    GeneratedMessageLite.C3408g c3408g = GeneratedMessageLite.C3408g.INSTANCE;
                    return this;
                case 6:
                    C3430e c3430e = (C3430e) obj;
                    C3433h c3433h = (C3433h) obj2;
                    boolean z = false;
                    while (!z) {
                        try {
                            int iM17171M = c3430e.m17171M();
                            if (iM17171M != 0) {
                                if (iM17171M == 10) {
                                    VideoChat videoChat = this.videoChat_;
                                    VideoChat.Builder builder = videoChat != null ? videoChat.toBuilder() : null;
                                    VideoChat videoChat2 = (VideoChat) c3430e.m17198w(VideoChat.parser(), c3433h);
                                    this.videoChat_ = videoChat2;
                                    if (builder != null) {
                                        builder.mergeFrom(videoChat2);
                                        this.videoChat_ = builder.buildPartial();
                                    }
                                } else if (iM17171M == 18) {
                                    this.reason_ = c3430e.m17170L();
                                } else if (!c3430e.m17176R(iM17171M)) {
                                }
                            }
                            z = true;
                        } catch (InvalidProtocolBufferException e) {
                            iig0.m140070a(e.setUnfinishedMessage(this));
                            return null;
                        } catch (IOException e2) {
                            iig0.m140070a(new InvalidProtocolBufferException(e2.getMessage()).setUnfinishedMessage(this));
                            return null;
                        }
                    }
                    break;
                case 7:
                    break;
                case 8:
                    if (PARSER == null) {
                        synchronized (LiveVideoChatChange.class) {
                            try {
                                if (PARSER == null) {
                                    PARSER = new GeneratedMessageLite.C3404c(DEFAULT_INSTANCE);
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                            break;
                        }
                    }
                    return PARSER;
                default:
                    l710.m153113a();
                    return null;
            }
            return DEFAULT_INSTANCE;
        }

        @Override // com.p1.mobile.longlink.msg.videoChat.LongLinkVideoChat.LiveVideoChatChangeOrBuilder
        public String getReason() {
            return this.reason_;
        }

        @Override // com.p1.mobile.longlink.msg.videoChat.LongLinkVideoChat.LiveVideoChatChangeOrBuilder
        public ByteString getReasonBytes() {
            return ByteString.copyFromUtf8(this.reason_);
        }

        @Override // com.google.protobuf.InterfaceC3442q
        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int iM16948C = this.videoChat_ != null ? CodedOutputStream.m16948C(1, getVideoChat()) : 0;
            if (!this.reason_.isEmpty()) {
                iM16948C += CodedOutputStream.m16956K(2, getReason());
            }
            this.memoizedSerializedSize = iM16948C;
            return iM16948C;
        }

        @Override // com.p1.mobile.longlink.msg.videoChat.LongLinkVideoChat.LiveVideoChatChangeOrBuilder
        public VideoChat getVideoChat() {
            VideoChat videoChat = this.videoChat_;
            return videoChat == null ? VideoChat.getDefaultInstance() : videoChat;
        }

        @Override // com.p1.mobile.longlink.msg.videoChat.LongLinkVideoChat.LiveVideoChatChangeOrBuilder
        public boolean hasVideoChat() {
            return this.videoChat_ != null;
        }

        @Override // com.google.protobuf.InterfaceC3442q
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (this.videoChat_ != null) {
                codedOutputStream.mo17029w0(1, getVideoChat());
            }
            if (this.reason_.isEmpty()) {
                return;
            }
            codedOutputStream.mo16994D0(2, getReason());
        }

        public static LiveVideoChatChange parseDelimitedFrom(InputStream inputStream, C3433h c3433h) throws IOException {
            return (LiveVideoChatChange) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, c3433h);
        }

        public static LiveVideoChatChange parseFrom(ByteString byteString, C3433h c3433h) throws InvalidProtocolBufferException {
            return (LiveVideoChatChange) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, c3433h);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setVideoChat(VideoChat videoChat) {
            videoChat.getClass();
            this.videoChat_ = videoChat;
        }

        public static final class Builder extends GeneratedMessageLite.AbstractC3403b<LiveVideoChatChange, Builder> implements LiveVideoChatChangeOrBuilder {
            private Builder() {
                super(LiveVideoChatChange.DEFAULT_INSTANCE);
            }

            public Builder clearReason() {
                copyOnWrite();
                ((LiveVideoChatChange) this.instance).clearReason();
                return this;
            }

            public Builder clearVideoChat() {
                copyOnWrite();
                ((LiveVideoChatChange) this.instance).clearVideoChat();
                return this;
            }

            @Override // com.p1.mobile.longlink.msg.videoChat.LongLinkVideoChat.LiveVideoChatChangeOrBuilder
            public String getReason() {
                return ((LiveVideoChatChange) this.instance).getReason();
            }

            @Override // com.p1.mobile.longlink.msg.videoChat.LongLinkVideoChat.LiveVideoChatChangeOrBuilder
            public ByteString getReasonBytes() {
                return ((LiveVideoChatChange) this.instance).getReasonBytes();
            }

            @Override // com.p1.mobile.longlink.msg.videoChat.LongLinkVideoChat.LiveVideoChatChangeOrBuilder
            public VideoChat getVideoChat() {
                return ((LiveVideoChatChange) this.instance).getVideoChat();
            }

            @Override // com.p1.mobile.longlink.msg.videoChat.LongLinkVideoChat.LiveVideoChatChangeOrBuilder
            public boolean hasVideoChat() {
                return ((LiveVideoChatChange) this.instance).hasVideoChat();
            }

            public Builder mergeVideoChat(VideoChat videoChat) {
                copyOnWrite();
                ((LiveVideoChatChange) this.instance).mergeVideoChat(videoChat);
                return this;
            }

            public Builder setReason(String str) {
                copyOnWrite();
                ((LiveVideoChatChange) this.instance).setReason(str);
                return this;
            }

            public Builder setReasonBytes(ByteString byteString) {
                copyOnWrite();
                ((LiveVideoChatChange) this.instance).setReasonBytes(byteString);
                return this;
            }

            public Builder setVideoChat(VideoChat videoChat) {
                copyOnWrite();
                ((LiveVideoChatChange) this.instance).setVideoChat(videoChat);
                return this;
            }

            public Builder setVideoChat(VideoChat.Builder builder) {
                copyOnWrite();
                ((LiveVideoChatChange) this.instance).setVideoChat(builder);
                return this;
            }
        }

        public static LiveVideoChatChange parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (LiveVideoChatChange) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static LiveVideoChatChange parseFrom(byte[] bArr, C3433h c3433h) throws InvalidProtocolBufferException {
            return (LiveVideoChatChange) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, c3433h);
        }

        public static LiveVideoChatChange parseFrom(InputStream inputStream) throws IOException {
            return (LiveVideoChatChange) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static LiveVideoChatChange parseFrom(InputStream inputStream, C3433h c3433h) throws IOException {
            return (LiveVideoChatChange) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, c3433h);
        }

        public static LiveVideoChatChange parseFrom(C3430e c3430e) throws IOException {
            return (LiveVideoChatChange) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, c3430e);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static LiveVideoChatChange parseFrom(C3430e c3430e, C3433h c3433h) throws IOException {
            return (LiveVideoChatChange) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, c3430e, c3433h);
        }
    }

    public static final class LiveVideoChatLiveChange extends GeneratedMessageLite<LiveVideoChatLiveChange, Builder> implements LiveVideoChatLiveChangeOrBuilder {
        private static final LiveVideoChatLiveChange DEFAULT_INSTANCE;
        public static final int LIVEID_FIELD_NUMBER = 1;
        private static volatile ng60<LiveVideoChatLiveChange> PARSER = null;
        public static final int REASON_FIELD_NUMBER = 3;
        public static final int STATUS_FIELD_NUMBER = 2;
        private String liveId_ = "";
        private String status_ = "";
        private String reason_ = "";

        public static final class Builder extends GeneratedMessageLite.AbstractC3403b<LiveVideoChatLiveChange, Builder> implements LiveVideoChatLiveChangeOrBuilder {
            private Builder() {
                super(LiveVideoChatLiveChange.DEFAULT_INSTANCE);
            }

            public Builder clearLiveId() {
                copyOnWrite();
                ((LiveVideoChatLiveChange) this.instance).clearLiveId();
                return this;
            }

            public Builder clearReason() {
                copyOnWrite();
                ((LiveVideoChatLiveChange) this.instance).clearReason();
                return this;
            }

            public Builder clearStatus() {
                copyOnWrite();
                ((LiveVideoChatLiveChange) this.instance).clearStatus();
                return this;
            }

            @Override // com.p1.mobile.longlink.msg.videoChat.LongLinkVideoChat.LiveVideoChatLiveChangeOrBuilder
            public String getLiveId() {
                return ((LiveVideoChatLiveChange) this.instance).getLiveId();
            }

            @Override // com.p1.mobile.longlink.msg.videoChat.LongLinkVideoChat.LiveVideoChatLiveChangeOrBuilder
            public ByteString getLiveIdBytes() {
                return ((LiveVideoChatLiveChange) this.instance).getLiveIdBytes();
            }

            @Override // com.p1.mobile.longlink.msg.videoChat.LongLinkVideoChat.LiveVideoChatLiveChangeOrBuilder
            public String getReason() {
                return ((LiveVideoChatLiveChange) this.instance).getReason();
            }

            @Override // com.p1.mobile.longlink.msg.videoChat.LongLinkVideoChat.LiveVideoChatLiveChangeOrBuilder
            public ByteString getReasonBytes() {
                return ((LiveVideoChatLiveChange) this.instance).getReasonBytes();
            }

            @Override // com.p1.mobile.longlink.msg.videoChat.LongLinkVideoChat.LiveVideoChatLiveChangeOrBuilder
            public String getStatus() {
                return ((LiveVideoChatLiveChange) this.instance).getStatus();
            }

            @Override // com.p1.mobile.longlink.msg.videoChat.LongLinkVideoChat.LiveVideoChatLiveChangeOrBuilder
            public ByteString getStatusBytes() {
                return ((LiveVideoChatLiveChange) this.instance).getStatusBytes();
            }

            public Builder setLiveId(String str) {
                copyOnWrite();
                ((LiveVideoChatLiveChange) this.instance).setLiveId(str);
                return this;
            }

            public Builder setLiveIdBytes(ByteString byteString) {
                copyOnWrite();
                ((LiveVideoChatLiveChange) this.instance).setLiveIdBytes(byteString);
                return this;
            }

            public Builder setReason(String str) {
                copyOnWrite();
                ((LiveVideoChatLiveChange) this.instance).setReason(str);
                return this;
            }

            public Builder setReasonBytes(ByteString byteString) {
                copyOnWrite();
                ((LiveVideoChatLiveChange) this.instance).setReasonBytes(byteString);
                return this;
            }

            public Builder setStatus(String str) {
                copyOnWrite();
                ((LiveVideoChatLiveChange) this.instance).setStatus(str);
                return this;
            }

            public Builder setStatusBytes(ByteString byteString) {
                copyOnWrite();
                ((LiveVideoChatLiveChange) this.instance).setStatusBytes(byteString);
                return this;
            }
        }

        static {
            LiveVideoChatLiveChange liveVideoChatLiveChange = new LiveVideoChatLiveChange();
            DEFAULT_INSTANCE = liveVideoChatLiveChange;
            liveVideoChatLiveChange.makeImmutable();
        }

        private LiveVideoChatLiveChange() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearLiveId() {
            this.liveId_ = getDefaultInstance().getLiveId();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearReason() {
            this.reason_ = getDefaultInstance().getReason();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearStatus() {
            this.status_ = getDefaultInstance().getStatus();
        }

        public static LiveVideoChatLiveChange getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder(LiveVideoChatLiveChange liveVideoChatLiveChange) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(liveVideoChatLiveChange);
        }

        public static LiveVideoChatLiveChange parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (LiveVideoChatLiveChange) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static LiveVideoChatLiveChange parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (LiveVideoChatLiveChange) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static ng60<LiveVideoChatLiveChange> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setLiveId(String str) {
            str.getClass();
            this.liveId_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setLiveIdBytes(ByteString byteString) {
            byteString.getClass();
            AbstractC3426a.checkByteStringIsUtf8(byteString);
            this.liveId_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setReason(String str) {
            str.getClass();
            this.reason_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setReasonBytes(ByteString byteString) {
            byteString.getClass();
            AbstractC3426a.checkByteStringIsUtf8(byteString);
            this.reason_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setStatus(String str) {
            str.getClass();
            this.status_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setStatusBytes(ByteString byteString) {
            byteString.getClass();
            AbstractC3426a.checkByteStringIsUtf8(byteString);
            this.status_ = byteString.toStringUtf8();
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (C47011.f16718xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new LiveVideoChatLiveChange();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                    return null;
                case 4:
                    return new Builder();
                case 5:
                    GeneratedMessageLite.InterfaceC3409h interfaceC3409h = (GeneratedMessageLite.InterfaceC3409h) obj;
                    LiveVideoChatLiveChange liveVideoChatLiveChange = (LiveVideoChatLiveChange) obj2;
                    this.liveId_ = interfaceC3409h.mo17052f(!this.liveId_.isEmpty(), this.liveId_, !liveVideoChatLiveChange.liveId_.isEmpty(), liveVideoChatLiveChange.liveId_);
                    this.status_ = interfaceC3409h.mo17052f(!this.status_.isEmpty(), this.status_, !liveVideoChatLiveChange.status_.isEmpty(), liveVideoChatLiveChange.status_);
                    this.reason_ = interfaceC3409h.mo17052f(!this.reason_.isEmpty(), this.reason_, true ^ liveVideoChatLiveChange.reason_.isEmpty(), liveVideoChatLiveChange.reason_);
                    GeneratedMessageLite.C3408g c3408g = GeneratedMessageLite.C3408g.INSTANCE;
                    return this;
                case 6:
                    C3430e c3430e = (C3430e) obj;
                    boolean z = false;
                    while (!z) {
                        try {
                            int iM17171M = c3430e.m17171M();
                            if (iM17171M != 0) {
                                if (iM17171M == 10) {
                                    this.liveId_ = c3430e.m17170L();
                                } else if (iM17171M == 18) {
                                    this.status_ = c3430e.m17170L();
                                } else if (iM17171M == 26) {
                                    this.reason_ = c3430e.m17170L();
                                } else if (!c3430e.m17176R(iM17171M)) {
                                }
                            }
                            z = true;
                        } catch (InvalidProtocolBufferException e) {
                            iig0.m140070a(e.setUnfinishedMessage(this));
                            return null;
                        } catch (IOException e2) {
                            iig0.m140070a(new InvalidProtocolBufferException(e2.getMessage()).setUnfinishedMessage(this));
                            return null;
                        }
                    }
                    break;
                case 7:
                    break;
                case 8:
                    if (PARSER == null) {
                        synchronized (LiveVideoChatLiveChange.class) {
                            try {
                                if (PARSER == null) {
                                    PARSER = new GeneratedMessageLite.C3404c(DEFAULT_INSTANCE);
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                            break;
                        }
                    }
                    return PARSER;
                default:
                    l710.m153113a();
                    return null;
            }
            return DEFAULT_INSTANCE;
        }

        @Override // com.p1.mobile.longlink.msg.videoChat.LongLinkVideoChat.LiveVideoChatLiveChangeOrBuilder
        public String getLiveId() {
            return this.liveId_;
        }

        @Override // com.p1.mobile.longlink.msg.videoChat.LongLinkVideoChat.LiveVideoChatLiveChangeOrBuilder
        public ByteString getLiveIdBytes() {
            return ByteString.copyFromUtf8(this.liveId_);
        }

        @Override // com.p1.mobile.longlink.msg.videoChat.LongLinkVideoChat.LiveVideoChatLiveChangeOrBuilder
        public String getReason() {
            return this.reason_;
        }

        @Override // com.p1.mobile.longlink.msg.videoChat.LongLinkVideoChat.LiveVideoChatLiveChangeOrBuilder
        public ByteString getReasonBytes() {
            return ByteString.copyFromUtf8(this.reason_);
        }

        @Override // com.google.protobuf.InterfaceC3442q
        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int iM16956K = !this.liveId_.isEmpty() ? CodedOutputStream.m16956K(1, getLiveId()) : 0;
            if (!this.status_.isEmpty()) {
                iM16956K += CodedOutputStream.m16956K(2, getStatus());
            }
            if (!this.reason_.isEmpty()) {
                iM16956K += CodedOutputStream.m16956K(3, getReason());
            }
            this.memoizedSerializedSize = iM16956K;
            return iM16956K;
        }

        @Override // com.p1.mobile.longlink.msg.videoChat.LongLinkVideoChat.LiveVideoChatLiveChangeOrBuilder
        public String getStatus() {
            return this.status_;
        }

        @Override // com.p1.mobile.longlink.msg.videoChat.LongLinkVideoChat.LiveVideoChatLiveChangeOrBuilder
        public ByteString getStatusBytes() {
            return ByteString.copyFromUtf8(this.status_);
        }

        @Override // com.google.protobuf.InterfaceC3442q
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (!this.liveId_.isEmpty()) {
                codedOutputStream.mo16994D0(1, getLiveId());
            }
            if (!this.status_.isEmpty()) {
                codedOutputStream.mo16994D0(2, getStatus());
            }
            if (this.reason_.isEmpty()) {
                return;
            }
            codedOutputStream.mo16994D0(3, getReason());
        }

        public static LiveVideoChatLiveChange parseDelimitedFrom(InputStream inputStream, C3433h c3433h) throws IOException {
            return (LiveVideoChatLiveChange) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, c3433h);
        }

        public static LiveVideoChatLiveChange parseFrom(ByteString byteString, C3433h c3433h) throws InvalidProtocolBufferException {
            return (LiveVideoChatLiveChange) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, c3433h);
        }

        public static LiveVideoChatLiveChange parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (LiveVideoChatLiveChange) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static LiveVideoChatLiveChange parseFrom(byte[] bArr, C3433h c3433h) throws InvalidProtocolBufferException {
            return (LiveVideoChatLiveChange) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, c3433h);
        }

        public static LiveVideoChatLiveChange parseFrom(InputStream inputStream) throws IOException {
            return (LiveVideoChatLiveChange) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static LiveVideoChatLiveChange parseFrom(InputStream inputStream, C3433h c3433h) throws IOException {
            return (LiveVideoChatLiveChange) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, c3433h);
        }

        public static LiveVideoChatLiveChange parseFrom(C3430e c3430e) throws IOException {
            return (LiveVideoChatLiveChange) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, c3430e);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static LiveVideoChatLiveChange parseFrom(C3430e c3430e, C3433h c3433h) throws IOException {
            return (LiveVideoChatLiveChange) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, c3430e, c3433h);
        }
    }

    public static final class LiveVideoChatToast extends GeneratedMessageLite<LiveVideoChatToast, Builder> implements LiveVideoChatToastOrBuilder {
        public static final int CHATID_FIELD_NUMBER = 1;
        private static final LiveVideoChatToast DEFAULT_INSTANCE;
        private static volatile ng60<LiveVideoChatToast> PARSER = null;
        public static final int TOAST_FIELD_NUMBER = 2;
        private String chatId_ = "";
        private String toast_ = "";

        public static final class Builder extends GeneratedMessageLite.AbstractC3403b<LiveVideoChatToast, Builder> implements LiveVideoChatToastOrBuilder {
            private Builder() {
                super(LiveVideoChatToast.DEFAULT_INSTANCE);
            }

            public Builder clearChatId() {
                copyOnWrite();
                ((LiveVideoChatToast) this.instance).clearChatId();
                return this;
            }

            public Builder clearToast() {
                copyOnWrite();
                ((LiveVideoChatToast) this.instance).clearToast();
                return this;
            }

            @Override // com.p1.mobile.longlink.msg.videoChat.LongLinkVideoChat.LiveVideoChatToastOrBuilder
            public String getChatId() {
                return ((LiveVideoChatToast) this.instance).getChatId();
            }

            @Override // com.p1.mobile.longlink.msg.videoChat.LongLinkVideoChat.LiveVideoChatToastOrBuilder
            public ByteString getChatIdBytes() {
                return ((LiveVideoChatToast) this.instance).getChatIdBytes();
            }

            @Override // com.p1.mobile.longlink.msg.videoChat.LongLinkVideoChat.LiveVideoChatToastOrBuilder
            public String getToast() {
                return ((LiveVideoChatToast) this.instance).getToast();
            }

            @Override // com.p1.mobile.longlink.msg.videoChat.LongLinkVideoChat.LiveVideoChatToastOrBuilder
            public ByteString getToastBytes() {
                return ((LiveVideoChatToast) this.instance).getToastBytes();
            }

            public Builder setChatId(String str) {
                copyOnWrite();
                ((LiveVideoChatToast) this.instance).setChatId(str);
                return this;
            }

            public Builder setChatIdBytes(ByteString byteString) {
                copyOnWrite();
                ((LiveVideoChatToast) this.instance).setChatIdBytes(byteString);
                return this;
            }

            public Builder setToast(String str) {
                copyOnWrite();
                ((LiveVideoChatToast) this.instance).setToast(str);
                return this;
            }

            public Builder setToastBytes(ByteString byteString) {
                copyOnWrite();
                ((LiveVideoChatToast) this.instance).setToastBytes(byteString);
                return this;
            }
        }

        static {
            LiveVideoChatToast liveVideoChatToast = new LiveVideoChatToast();
            DEFAULT_INSTANCE = liveVideoChatToast;
            liveVideoChatToast.makeImmutable();
        }

        private LiveVideoChatToast() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearChatId() {
            this.chatId_ = getDefaultInstance().getChatId();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearToast() {
            this.toast_ = getDefaultInstance().getToast();
        }

        public static LiveVideoChatToast getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder(LiveVideoChatToast liveVideoChatToast) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(liveVideoChatToast);
        }

        public static LiveVideoChatToast parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (LiveVideoChatToast) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static LiveVideoChatToast parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (LiveVideoChatToast) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static ng60<LiveVideoChatToast> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setChatId(String str) {
            str.getClass();
            this.chatId_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setChatIdBytes(ByteString byteString) {
            byteString.getClass();
            AbstractC3426a.checkByteStringIsUtf8(byteString);
            this.chatId_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setToast(String str) {
            str.getClass();
            this.toast_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setToastBytes(ByteString byteString) {
            byteString.getClass();
            AbstractC3426a.checkByteStringIsUtf8(byteString);
            this.toast_ = byteString.toStringUtf8();
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (C47011.f16718xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new LiveVideoChatToast();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                    return null;
                case 4:
                    return new Builder();
                case 5:
                    GeneratedMessageLite.InterfaceC3409h interfaceC3409h = (GeneratedMessageLite.InterfaceC3409h) obj;
                    LiveVideoChatToast liveVideoChatToast = (LiveVideoChatToast) obj2;
                    this.chatId_ = interfaceC3409h.mo17052f(!this.chatId_.isEmpty(), this.chatId_, !liveVideoChatToast.chatId_.isEmpty(), liveVideoChatToast.chatId_);
                    this.toast_ = interfaceC3409h.mo17052f(!this.toast_.isEmpty(), this.toast_, true ^ liveVideoChatToast.toast_.isEmpty(), liveVideoChatToast.toast_);
                    GeneratedMessageLite.C3408g c3408g = GeneratedMessageLite.C3408g.INSTANCE;
                    return this;
                case 6:
                    C3430e c3430e = (C3430e) obj;
                    boolean z = false;
                    while (!z) {
                        try {
                            int iM17171M = c3430e.m17171M();
                            if (iM17171M != 0) {
                                if (iM17171M == 10) {
                                    this.chatId_ = c3430e.m17170L();
                                } else if (iM17171M == 18) {
                                    this.toast_ = c3430e.m17170L();
                                } else if (!c3430e.m17176R(iM17171M)) {
                                }
                            }
                            z = true;
                        } catch (InvalidProtocolBufferException e) {
                            iig0.m140070a(e.setUnfinishedMessage(this));
                            return null;
                        } catch (IOException e2) {
                            iig0.m140070a(new InvalidProtocolBufferException(e2.getMessage()).setUnfinishedMessage(this));
                            return null;
                        }
                    }
                    break;
                case 7:
                    break;
                case 8:
                    if (PARSER == null) {
                        synchronized (LiveVideoChatToast.class) {
                            try {
                                if (PARSER == null) {
                                    PARSER = new GeneratedMessageLite.C3404c(DEFAULT_INSTANCE);
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                            break;
                        }
                    }
                    return PARSER;
                default:
                    l710.m153113a();
                    return null;
            }
            return DEFAULT_INSTANCE;
        }

        @Override // com.p1.mobile.longlink.msg.videoChat.LongLinkVideoChat.LiveVideoChatToastOrBuilder
        public String getChatId() {
            return this.chatId_;
        }

        @Override // com.p1.mobile.longlink.msg.videoChat.LongLinkVideoChat.LiveVideoChatToastOrBuilder
        public ByteString getChatIdBytes() {
            return ByteString.copyFromUtf8(this.chatId_);
        }

        @Override // com.google.protobuf.InterfaceC3442q
        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int iM16956K = !this.chatId_.isEmpty() ? CodedOutputStream.m16956K(1, getChatId()) : 0;
            if (!this.toast_.isEmpty()) {
                iM16956K += CodedOutputStream.m16956K(2, getToast());
            }
            this.memoizedSerializedSize = iM16956K;
            return iM16956K;
        }

        @Override // com.p1.mobile.longlink.msg.videoChat.LongLinkVideoChat.LiveVideoChatToastOrBuilder
        public String getToast() {
            return this.toast_;
        }

        @Override // com.p1.mobile.longlink.msg.videoChat.LongLinkVideoChat.LiveVideoChatToastOrBuilder
        public ByteString getToastBytes() {
            return ByteString.copyFromUtf8(this.toast_);
        }

        @Override // com.google.protobuf.InterfaceC3442q
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (!this.chatId_.isEmpty()) {
                codedOutputStream.mo16994D0(1, getChatId());
            }
            if (this.toast_.isEmpty()) {
                return;
            }
            codedOutputStream.mo16994D0(2, getToast());
        }

        public static LiveVideoChatToast parseDelimitedFrom(InputStream inputStream, C3433h c3433h) throws IOException {
            return (LiveVideoChatToast) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, c3433h);
        }

        public static LiveVideoChatToast parseFrom(ByteString byteString, C3433h c3433h) throws InvalidProtocolBufferException {
            return (LiveVideoChatToast) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, c3433h);
        }

        public static LiveVideoChatToast parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (LiveVideoChatToast) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static LiveVideoChatToast parseFrom(byte[] bArr, C3433h c3433h) throws InvalidProtocolBufferException {
            return (LiveVideoChatToast) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, c3433h);
        }

        public static LiveVideoChatToast parseFrom(InputStream inputStream) throws IOException {
            return (LiveVideoChatToast) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static LiveVideoChatToast parseFrom(InputStream inputStream, C3433h c3433h) throws IOException {
            return (LiveVideoChatToast) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, c3433h);
        }

        public static LiveVideoChatToast parseFrom(C3430e c3430e) throws IOException {
            return (LiveVideoChatToast) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, c3430e);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static LiveVideoChatToast parseFrom(C3430e c3430e, C3433h c3433h) throws IOException {
            return (LiveVideoChatToast) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, c3430e, c3433h);
        }
    }

    public static final class VideoChatPlayer extends GeneratedMessageLite<VideoChatPlayer, Builder> implements VideoChatPlayerOrBuilder {
        public static final int AVATAR_FIELD_NUMBER = 3;
        private static final VideoChatPlayer DEFAULT_INSTANCE;
        private static volatile ng60<VideoChatPlayer> PARSER = null;
        public static final int ROLE_FIELD_NUMBER = 4;
        public static final int USERID_FIELD_NUMBER = 1;
        public static final int USERNAME_FIELD_NUMBER = 2;
        private String userId_ = "";
        private String userName_ = "";
        private String avatar_ = "";
        private String role_ = "";

        public static final class Builder extends GeneratedMessageLite.AbstractC3403b<VideoChatPlayer, Builder> implements VideoChatPlayerOrBuilder {
            private Builder() {
                super(VideoChatPlayer.DEFAULT_INSTANCE);
            }

            public Builder clearAvatar() {
                copyOnWrite();
                ((VideoChatPlayer) this.instance).clearAvatar();
                return this;
            }

            public Builder clearRole() {
                copyOnWrite();
                ((VideoChatPlayer) this.instance).clearRole();
                return this;
            }

            public Builder clearUserId() {
                copyOnWrite();
                ((VideoChatPlayer) this.instance).clearUserId();
                return this;
            }

            public Builder clearUserName() {
                copyOnWrite();
                ((VideoChatPlayer) this.instance).clearUserName();
                return this;
            }

            @Override // com.p1.mobile.longlink.msg.videoChat.LongLinkVideoChat.VideoChatPlayerOrBuilder
            public String getAvatar() {
                return ((VideoChatPlayer) this.instance).getAvatar();
            }

            @Override // com.p1.mobile.longlink.msg.videoChat.LongLinkVideoChat.VideoChatPlayerOrBuilder
            public ByteString getAvatarBytes() {
                return ((VideoChatPlayer) this.instance).getAvatarBytes();
            }

            @Override // com.p1.mobile.longlink.msg.videoChat.LongLinkVideoChat.VideoChatPlayerOrBuilder
            public String getRole() {
                return ((VideoChatPlayer) this.instance).getRole();
            }

            @Override // com.p1.mobile.longlink.msg.videoChat.LongLinkVideoChat.VideoChatPlayerOrBuilder
            public ByteString getRoleBytes() {
                return ((VideoChatPlayer) this.instance).getRoleBytes();
            }

            @Override // com.p1.mobile.longlink.msg.videoChat.LongLinkVideoChat.VideoChatPlayerOrBuilder
            public String getUserId() {
                return ((VideoChatPlayer) this.instance).getUserId();
            }

            @Override // com.p1.mobile.longlink.msg.videoChat.LongLinkVideoChat.VideoChatPlayerOrBuilder
            public ByteString getUserIdBytes() {
                return ((VideoChatPlayer) this.instance).getUserIdBytes();
            }

            @Override // com.p1.mobile.longlink.msg.videoChat.LongLinkVideoChat.VideoChatPlayerOrBuilder
            public String getUserName() {
                return ((VideoChatPlayer) this.instance).getUserName();
            }

            @Override // com.p1.mobile.longlink.msg.videoChat.LongLinkVideoChat.VideoChatPlayerOrBuilder
            public ByteString getUserNameBytes() {
                return ((VideoChatPlayer) this.instance).getUserNameBytes();
            }

            public Builder setAvatar(String str) {
                copyOnWrite();
                ((VideoChatPlayer) this.instance).setAvatar(str);
                return this;
            }

            public Builder setAvatarBytes(ByteString byteString) {
                copyOnWrite();
                ((VideoChatPlayer) this.instance).setAvatarBytes(byteString);
                return this;
            }

            public Builder setRole(String str) {
                copyOnWrite();
                ((VideoChatPlayer) this.instance).setRole(str);
                return this;
            }

            public Builder setRoleBytes(ByteString byteString) {
                copyOnWrite();
                ((VideoChatPlayer) this.instance).setRoleBytes(byteString);
                return this;
            }

            public Builder setUserId(String str) {
                copyOnWrite();
                ((VideoChatPlayer) this.instance).setUserId(str);
                return this;
            }

            public Builder setUserIdBytes(ByteString byteString) {
                copyOnWrite();
                ((VideoChatPlayer) this.instance).setUserIdBytes(byteString);
                return this;
            }

            public Builder setUserName(String str) {
                copyOnWrite();
                ((VideoChatPlayer) this.instance).setUserName(str);
                return this;
            }

            public Builder setUserNameBytes(ByteString byteString) {
                copyOnWrite();
                ((VideoChatPlayer) this.instance).setUserNameBytes(byteString);
                return this;
            }
        }

        static {
            VideoChatPlayer videoChatPlayer = new VideoChatPlayer();
            DEFAULT_INSTANCE = videoChatPlayer;
            videoChatPlayer.makeImmutable();
        }

        private VideoChatPlayer() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAvatar() {
            this.avatar_ = getDefaultInstance().getAvatar();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearRole() {
            this.role_ = getDefaultInstance().getRole();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearUserId() {
            this.userId_ = getDefaultInstance().getUserId();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearUserName() {
            this.userName_ = getDefaultInstance().getUserName();
        }

        public static VideoChatPlayer getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder(VideoChatPlayer videoChatPlayer) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(videoChatPlayer);
        }

        public static VideoChatPlayer parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (VideoChatPlayer) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static VideoChatPlayer parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (VideoChatPlayer) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static ng60<VideoChatPlayer> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAvatar(String str) {
            str.getClass();
            this.avatar_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAvatarBytes(ByteString byteString) {
            byteString.getClass();
            AbstractC3426a.checkByteStringIsUtf8(byteString);
            this.avatar_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setRole(String str) {
            str.getClass();
            this.role_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setRoleBytes(ByteString byteString) {
            byteString.getClass();
            AbstractC3426a.checkByteStringIsUtf8(byteString);
            this.role_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setUserId(String str) {
            str.getClass();
            this.userId_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setUserIdBytes(ByteString byteString) {
            byteString.getClass();
            AbstractC3426a.checkByteStringIsUtf8(byteString);
            this.userId_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setUserName(String str) {
            str.getClass();
            this.userName_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setUserNameBytes(ByteString byteString) {
            byteString.getClass();
            AbstractC3426a.checkByteStringIsUtf8(byteString);
            this.userName_ = byteString.toStringUtf8();
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (C47011.f16718xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new VideoChatPlayer();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                    return null;
                case 4:
                    return new Builder();
                case 5:
                    GeneratedMessageLite.InterfaceC3409h interfaceC3409h = (GeneratedMessageLite.InterfaceC3409h) obj;
                    VideoChatPlayer videoChatPlayer = (VideoChatPlayer) obj2;
                    this.userId_ = interfaceC3409h.mo17052f(!this.userId_.isEmpty(), this.userId_, !videoChatPlayer.userId_.isEmpty(), videoChatPlayer.userId_);
                    this.userName_ = interfaceC3409h.mo17052f(!this.userName_.isEmpty(), this.userName_, !videoChatPlayer.userName_.isEmpty(), videoChatPlayer.userName_);
                    this.avatar_ = interfaceC3409h.mo17052f(!this.avatar_.isEmpty(), this.avatar_, !videoChatPlayer.avatar_.isEmpty(), videoChatPlayer.avatar_);
                    this.role_ = interfaceC3409h.mo17052f(!this.role_.isEmpty(), this.role_, true ^ videoChatPlayer.role_.isEmpty(), videoChatPlayer.role_);
                    GeneratedMessageLite.C3408g c3408g = GeneratedMessageLite.C3408g.INSTANCE;
                    return this;
                case 6:
                    C3430e c3430e = (C3430e) obj;
                    boolean z = false;
                    while (!z) {
                        try {
                            int iM17171M = c3430e.m17171M();
                            if (iM17171M != 0) {
                                if (iM17171M == 10) {
                                    this.userId_ = c3430e.m17170L();
                                } else if (iM17171M == 18) {
                                    this.userName_ = c3430e.m17170L();
                                } else if (iM17171M == 26) {
                                    this.avatar_ = c3430e.m17170L();
                                } else if (iM17171M == 34) {
                                    this.role_ = c3430e.m17170L();
                                } else if (!c3430e.m17176R(iM17171M)) {
                                }
                            }
                            z = true;
                        } catch (InvalidProtocolBufferException e) {
                            iig0.m140070a(e.setUnfinishedMessage(this));
                            return null;
                        } catch (IOException e2) {
                            iig0.m140070a(new InvalidProtocolBufferException(e2.getMessage()).setUnfinishedMessage(this));
                            return null;
                        }
                    }
                    break;
                case 7:
                    break;
                case 8:
                    if (PARSER == null) {
                        synchronized (VideoChatPlayer.class) {
                            try {
                                if (PARSER == null) {
                                    PARSER = new GeneratedMessageLite.C3404c(DEFAULT_INSTANCE);
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                            break;
                        }
                    }
                    return PARSER;
                default:
                    l710.m153113a();
                    return null;
            }
            return DEFAULT_INSTANCE;
        }

        @Override // com.p1.mobile.longlink.msg.videoChat.LongLinkVideoChat.VideoChatPlayerOrBuilder
        public String getAvatar() {
            return this.avatar_;
        }

        @Override // com.p1.mobile.longlink.msg.videoChat.LongLinkVideoChat.VideoChatPlayerOrBuilder
        public ByteString getAvatarBytes() {
            return ByteString.copyFromUtf8(this.avatar_);
        }

        @Override // com.p1.mobile.longlink.msg.videoChat.LongLinkVideoChat.VideoChatPlayerOrBuilder
        public String getRole() {
            return this.role_;
        }

        @Override // com.p1.mobile.longlink.msg.videoChat.LongLinkVideoChat.VideoChatPlayerOrBuilder
        public ByteString getRoleBytes() {
            return ByteString.copyFromUtf8(this.role_);
        }

        @Override // com.google.protobuf.InterfaceC3442q
        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int iM16956K = !this.userId_.isEmpty() ? CodedOutputStream.m16956K(1, getUserId()) : 0;
            if (!this.userName_.isEmpty()) {
                iM16956K += CodedOutputStream.m16956K(2, getUserName());
            }
            if (!this.avatar_.isEmpty()) {
                iM16956K += CodedOutputStream.m16956K(3, getAvatar());
            }
            if (!this.role_.isEmpty()) {
                iM16956K += CodedOutputStream.m16956K(4, getRole());
            }
            this.memoizedSerializedSize = iM16956K;
            return iM16956K;
        }

        @Override // com.p1.mobile.longlink.msg.videoChat.LongLinkVideoChat.VideoChatPlayerOrBuilder
        public String getUserId() {
            return this.userId_;
        }

        @Override // com.p1.mobile.longlink.msg.videoChat.LongLinkVideoChat.VideoChatPlayerOrBuilder
        public ByteString getUserIdBytes() {
            return ByteString.copyFromUtf8(this.userId_);
        }

        @Override // com.p1.mobile.longlink.msg.videoChat.LongLinkVideoChat.VideoChatPlayerOrBuilder
        public String getUserName() {
            return this.userName_;
        }

        @Override // com.p1.mobile.longlink.msg.videoChat.LongLinkVideoChat.VideoChatPlayerOrBuilder
        public ByteString getUserNameBytes() {
            return ByteString.copyFromUtf8(this.userName_);
        }

        @Override // com.google.protobuf.InterfaceC3442q
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (!this.userId_.isEmpty()) {
                codedOutputStream.mo16994D0(1, getUserId());
            }
            if (!this.userName_.isEmpty()) {
                codedOutputStream.mo16994D0(2, getUserName());
            }
            if (!this.avatar_.isEmpty()) {
                codedOutputStream.mo16994D0(3, getAvatar());
            }
            if (this.role_.isEmpty()) {
                return;
            }
            codedOutputStream.mo16994D0(4, getRole());
        }

        public static VideoChatPlayer parseDelimitedFrom(InputStream inputStream, C3433h c3433h) throws IOException {
            return (VideoChatPlayer) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, c3433h);
        }

        public static VideoChatPlayer parseFrom(ByteString byteString, C3433h c3433h) throws InvalidProtocolBufferException {
            return (VideoChatPlayer) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, c3433h);
        }

        public static VideoChatPlayer parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (VideoChatPlayer) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static VideoChatPlayer parseFrom(byte[] bArr, C3433h c3433h) throws InvalidProtocolBufferException {
            return (VideoChatPlayer) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, c3433h);
        }

        public static VideoChatPlayer parseFrom(InputStream inputStream) throws IOException {
            return (VideoChatPlayer) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static VideoChatPlayer parseFrom(InputStream inputStream, C3433h c3433h) throws IOException {
            return (VideoChatPlayer) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, c3433h);
        }

        public static VideoChatPlayer parseFrom(C3430e c3430e) throws IOException {
            return (VideoChatPlayer) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, c3430e);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static VideoChatPlayer parseFrom(C3430e c3430e, C3433h c3433h) throws IOException {
            return (VideoChatPlayer) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, c3430e, c3433h);
        }
    }
}
