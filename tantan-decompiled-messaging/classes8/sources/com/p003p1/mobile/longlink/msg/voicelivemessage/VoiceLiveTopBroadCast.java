package com.p003p1.mobile.longlink.msg.voicelivemessage;

import com.google.protobuf.ByteString;
import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.a;
import com.google.protobuf.e;
import com.google.protobuf.h;
import com.google.protobuf.q;
import java.io.IOException;
import java.io.InputStream;
import l.aag0;
import l.bz00;
import l.i860;
import l.o6z;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes8.dex */
public final class VoiceLiveTopBroadCast {

    /* JADX INFO: renamed from: com.p1.mobile.longlink.msg.voicelivemessage.VoiceLiveTopBroadCast$1 */
    public static /* synthetic */ class C04811 {

        /* JADX INFO: renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f1706xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f1706xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f1706xa1df5c61[GeneratedMessageLite.MethodToInvoke.IS_INITIALIZED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f1706xa1df5c61[GeneratedMessageLite.MethodToInvoke.MAKE_IMMUTABLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f1706xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f1706xa1df5c61[GeneratedMessageLite.MethodToInvoke.VISIT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f1706xa1df5c61[GeneratedMessageLite.MethodToInvoke.MERGE_FROM_STREAM.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f1706xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f1706xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    public interface VoiceLiveHourLeaderboardTopEffectMessageOrBuilder extends o6z {
        String getAnchorId();

        ByteString getAnchorIdBytes();

        String getAnchorImage();

        ByteString getAnchorImageBytes();

        String getAnchorName();

        ByteString getAnchorNameBytes();

        String getBackgroundUrl();

        ByteString getBackgroundUrlBytes();

        /* synthetic */ q getDefaultInstanceForType();

        long getDuration();

        String getLiveId();

        ByteString getLiveIdBytes();

        String getRoomId();

        ByteString getRoomIdBytes();

        String getTitle();

        ByteString getTitleBytes();

        String getTitleColor();

        ByteString getTitleColorBytes();

        /* synthetic */ boolean isInitialized();
    }

    private VoiceLiveTopBroadCast() {
    }

    public static void registerAllExtensions(h hVar) {
    }

    public static final class VoiceLiveHourLeaderboardTopEffectMessage extends GeneratedMessageLite<VoiceLiveHourLeaderboardTopEffectMessage, Builder> implements VoiceLiveHourLeaderboardTopEffectMessageOrBuilder {
        public static final int ANCHORID_FIELD_NUMBER = 3;
        public static final int ANCHORIMAGE_FIELD_NUMBER = 4;
        public static final int ANCHORNAME_FIELD_NUMBER = 5;
        public static final int BACKGROUNDURL_FIELD_NUMBER = 10;
        private static final VoiceLiveHourLeaderboardTopEffectMessage DEFAULT_INSTANCE;
        public static final int DURATION_FIELD_NUMBER = 11;
        public static final int LIVEID_FIELD_NUMBER = 2;
        private static volatile i860<VoiceLiveHourLeaderboardTopEffectMessage> PARSER = null;
        public static final int ROOMID_FIELD_NUMBER = 1;
        public static final int TITLECOLOR_FIELD_NUMBER = 7;
        public static final int TITLE_FIELD_NUMBER = 6;
        private long duration_;
        private String roomId_ = "";
        private String liveId_ = "";
        private String anchorId_ = "";
        private String anchorImage_ = "";
        private String anchorName_ = "";
        private String title_ = "";
        private String titleColor_ = "";
        private String backgroundUrl_ = "";

        public static final class Builder extends GeneratedMessageLite.b<VoiceLiveHourLeaderboardTopEffectMessage, Builder> implements VoiceLiveHourLeaderboardTopEffectMessageOrBuilder {
            private Builder() {
                super(VoiceLiveHourLeaderboardTopEffectMessage.DEFAULT_INSTANCE);
            }

            public Builder clearAnchorId() {
                copyOnWrite();
                ((VoiceLiveHourLeaderboardTopEffectMessage) ((GeneratedMessageLite.b) this).instance).clearAnchorId();
                return this;
            }

            public Builder clearAnchorImage() {
                copyOnWrite();
                ((VoiceLiveHourLeaderboardTopEffectMessage) ((GeneratedMessageLite.b) this).instance).clearAnchorImage();
                return this;
            }

            public Builder clearAnchorName() {
                copyOnWrite();
                ((VoiceLiveHourLeaderboardTopEffectMessage) ((GeneratedMessageLite.b) this).instance).clearAnchorName();
                return this;
            }

            public Builder clearBackgroundUrl() {
                copyOnWrite();
                ((VoiceLiveHourLeaderboardTopEffectMessage) ((GeneratedMessageLite.b) this).instance).clearBackgroundUrl();
                return this;
            }

            public Builder clearDuration() {
                copyOnWrite();
                ((VoiceLiveHourLeaderboardTopEffectMessage) ((GeneratedMessageLite.b) this).instance).clearDuration();
                return this;
            }

            public Builder clearLiveId() {
                copyOnWrite();
                ((VoiceLiveHourLeaderboardTopEffectMessage) ((GeneratedMessageLite.b) this).instance).clearLiveId();
                return this;
            }

            public Builder clearRoomId() {
                copyOnWrite();
                ((VoiceLiveHourLeaderboardTopEffectMessage) ((GeneratedMessageLite.b) this).instance).clearRoomId();
                return this;
            }

            public Builder clearTitle() {
                copyOnWrite();
                ((VoiceLiveHourLeaderboardTopEffectMessage) ((GeneratedMessageLite.b) this).instance).clearTitle();
                return this;
            }

            public Builder clearTitleColor() {
                copyOnWrite();
                ((VoiceLiveHourLeaderboardTopEffectMessage) ((GeneratedMessageLite.b) this).instance).clearTitleColor();
                return this;
            }

            @Override // com.p1.mobile.longlink.msg.voicelivemessage.VoiceLiveTopBroadCast.VoiceLiveHourLeaderboardTopEffectMessageOrBuilder
            public String getAnchorId() {
                return ((VoiceLiveHourLeaderboardTopEffectMessage) ((GeneratedMessageLite.b) this).instance).getAnchorId();
            }

            @Override // com.p1.mobile.longlink.msg.voicelivemessage.VoiceLiveTopBroadCast.VoiceLiveHourLeaderboardTopEffectMessageOrBuilder
            public ByteString getAnchorIdBytes() {
                return ((VoiceLiveHourLeaderboardTopEffectMessage) ((GeneratedMessageLite.b) this).instance).getAnchorIdBytes();
            }

            @Override // com.p1.mobile.longlink.msg.voicelivemessage.VoiceLiveTopBroadCast.VoiceLiveHourLeaderboardTopEffectMessageOrBuilder
            public String getAnchorImage() {
                return ((VoiceLiveHourLeaderboardTopEffectMessage) ((GeneratedMessageLite.b) this).instance).getAnchorImage();
            }

            @Override // com.p1.mobile.longlink.msg.voicelivemessage.VoiceLiveTopBroadCast.VoiceLiveHourLeaderboardTopEffectMessageOrBuilder
            public ByteString getAnchorImageBytes() {
                return ((VoiceLiveHourLeaderboardTopEffectMessage) ((GeneratedMessageLite.b) this).instance).getAnchorImageBytes();
            }

            @Override // com.p1.mobile.longlink.msg.voicelivemessage.VoiceLiveTopBroadCast.VoiceLiveHourLeaderboardTopEffectMessageOrBuilder
            public String getAnchorName() {
                return ((VoiceLiveHourLeaderboardTopEffectMessage) ((GeneratedMessageLite.b) this).instance).getAnchorName();
            }

            @Override // com.p1.mobile.longlink.msg.voicelivemessage.VoiceLiveTopBroadCast.VoiceLiveHourLeaderboardTopEffectMessageOrBuilder
            public ByteString getAnchorNameBytes() {
                return ((VoiceLiveHourLeaderboardTopEffectMessage) ((GeneratedMessageLite.b) this).instance).getAnchorNameBytes();
            }

            @Override // com.p1.mobile.longlink.msg.voicelivemessage.VoiceLiveTopBroadCast.VoiceLiveHourLeaderboardTopEffectMessageOrBuilder
            public String getBackgroundUrl() {
                return ((VoiceLiveHourLeaderboardTopEffectMessage) ((GeneratedMessageLite.b) this).instance).getBackgroundUrl();
            }

            @Override // com.p1.mobile.longlink.msg.voicelivemessage.VoiceLiveTopBroadCast.VoiceLiveHourLeaderboardTopEffectMessageOrBuilder
            public ByteString getBackgroundUrlBytes() {
                return ((VoiceLiveHourLeaderboardTopEffectMessage) ((GeneratedMessageLite.b) this).instance).getBackgroundUrlBytes();
            }

            @Override // com.p1.mobile.longlink.msg.voicelivemessage.VoiceLiveTopBroadCast.VoiceLiveHourLeaderboardTopEffectMessageOrBuilder
            public long getDuration() {
                return ((VoiceLiveHourLeaderboardTopEffectMessage) ((GeneratedMessageLite.b) this).instance).getDuration();
            }

            @Override // com.p1.mobile.longlink.msg.voicelivemessage.VoiceLiveTopBroadCast.VoiceLiveHourLeaderboardTopEffectMessageOrBuilder
            public String getLiveId() {
                return ((VoiceLiveHourLeaderboardTopEffectMessage) ((GeneratedMessageLite.b) this).instance).getLiveId();
            }

            @Override // com.p1.mobile.longlink.msg.voicelivemessage.VoiceLiveTopBroadCast.VoiceLiveHourLeaderboardTopEffectMessageOrBuilder
            public ByteString getLiveIdBytes() {
                return ((VoiceLiveHourLeaderboardTopEffectMessage) ((GeneratedMessageLite.b) this).instance).getLiveIdBytes();
            }

            @Override // com.p1.mobile.longlink.msg.voicelivemessage.VoiceLiveTopBroadCast.VoiceLiveHourLeaderboardTopEffectMessageOrBuilder
            public String getRoomId() {
                return ((VoiceLiveHourLeaderboardTopEffectMessage) ((GeneratedMessageLite.b) this).instance).getRoomId();
            }

            @Override // com.p1.mobile.longlink.msg.voicelivemessage.VoiceLiveTopBroadCast.VoiceLiveHourLeaderboardTopEffectMessageOrBuilder
            public ByteString getRoomIdBytes() {
                return ((VoiceLiveHourLeaderboardTopEffectMessage) ((GeneratedMessageLite.b) this).instance).getRoomIdBytes();
            }

            @Override // com.p1.mobile.longlink.msg.voicelivemessage.VoiceLiveTopBroadCast.VoiceLiveHourLeaderboardTopEffectMessageOrBuilder
            public String getTitle() {
                return ((VoiceLiveHourLeaderboardTopEffectMessage) ((GeneratedMessageLite.b) this).instance).getTitle();
            }

            @Override // com.p1.mobile.longlink.msg.voicelivemessage.VoiceLiveTopBroadCast.VoiceLiveHourLeaderboardTopEffectMessageOrBuilder
            public ByteString getTitleBytes() {
                return ((VoiceLiveHourLeaderboardTopEffectMessage) ((GeneratedMessageLite.b) this).instance).getTitleBytes();
            }

            @Override // com.p1.mobile.longlink.msg.voicelivemessage.VoiceLiveTopBroadCast.VoiceLiveHourLeaderboardTopEffectMessageOrBuilder
            public String getTitleColor() {
                return ((VoiceLiveHourLeaderboardTopEffectMessage) ((GeneratedMessageLite.b) this).instance).getTitleColor();
            }

            @Override // com.p1.mobile.longlink.msg.voicelivemessage.VoiceLiveTopBroadCast.VoiceLiveHourLeaderboardTopEffectMessageOrBuilder
            public ByteString getTitleColorBytes() {
                return ((VoiceLiveHourLeaderboardTopEffectMessage) ((GeneratedMessageLite.b) this).instance).getTitleColorBytes();
            }

            public Builder setAnchorId(String str) {
                copyOnWrite();
                ((VoiceLiveHourLeaderboardTopEffectMessage) ((GeneratedMessageLite.b) this).instance).setAnchorId(str);
                return this;
            }

            public Builder setAnchorIdBytes(ByteString byteString) {
                copyOnWrite();
                ((VoiceLiveHourLeaderboardTopEffectMessage) ((GeneratedMessageLite.b) this).instance).setAnchorIdBytes(byteString);
                return this;
            }

            public Builder setAnchorImage(String str) {
                copyOnWrite();
                ((VoiceLiveHourLeaderboardTopEffectMessage) ((GeneratedMessageLite.b) this).instance).setAnchorImage(str);
                return this;
            }

            public Builder setAnchorImageBytes(ByteString byteString) {
                copyOnWrite();
                ((VoiceLiveHourLeaderboardTopEffectMessage) ((GeneratedMessageLite.b) this).instance).setAnchorImageBytes(byteString);
                return this;
            }

            public Builder setAnchorName(String str) {
                copyOnWrite();
                ((VoiceLiveHourLeaderboardTopEffectMessage) ((GeneratedMessageLite.b) this).instance).setAnchorName(str);
                return this;
            }

            public Builder setAnchorNameBytes(ByteString byteString) {
                copyOnWrite();
                ((VoiceLiveHourLeaderboardTopEffectMessage) ((GeneratedMessageLite.b) this).instance).setAnchorNameBytes(byteString);
                return this;
            }

            public Builder setBackgroundUrl(String str) {
                copyOnWrite();
                ((VoiceLiveHourLeaderboardTopEffectMessage) ((GeneratedMessageLite.b) this).instance).setBackgroundUrl(str);
                return this;
            }

            public Builder setBackgroundUrlBytes(ByteString byteString) {
                copyOnWrite();
                ((VoiceLiveHourLeaderboardTopEffectMessage) ((GeneratedMessageLite.b) this).instance).setBackgroundUrlBytes(byteString);
                return this;
            }

            public Builder setDuration(long j) {
                copyOnWrite();
                ((VoiceLiveHourLeaderboardTopEffectMessage) ((GeneratedMessageLite.b) this).instance).setDuration(j);
                return this;
            }

            public Builder setLiveId(String str) {
                copyOnWrite();
                ((VoiceLiveHourLeaderboardTopEffectMessage) ((GeneratedMessageLite.b) this).instance).setLiveId(str);
                return this;
            }

            public Builder setLiveIdBytes(ByteString byteString) {
                copyOnWrite();
                ((VoiceLiveHourLeaderboardTopEffectMessage) ((GeneratedMessageLite.b) this).instance).setLiveIdBytes(byteString);
                return this;
            }

            public Builder setRoomId(String str) {
                copyOnWrite();
                ((VoiceLiveHourLeaderboardTopEffectMessage) ((GeneratedMessageLite.b) this).instance).setRoomId(str);
                return this;
            }

            public Builder setRoomIdBytes(ByteString byteString) {
                copyOnWrite();
                ((VoiceLiveHourLeaderboardTopEffectMessage) ((GeneratedMessageLite.b) this).instance).setRoomIdBytes(byteString);
                return this;
            }

            public Builder setTitle(String str) {
                copyOnWrite();
                ((VoiceLiveHourLeaderboardTopEffectMessage) ((GeneratedMessageLite.b) this).instance).setTitle(str);
                return this;
            }

            public Builder setTitleBytes(ByteString byteString) {
                copyOnWrite();
                ((VoiceLiveHourLeaderboardTopEffectMessage) ((GeneratedMessageLite.b) this).instance).setTitleBytes(byteString);
                return this;
            }

            public Builder setTitleColor(String str) {
                copyOnWrite();
                ((VoiceLiveHourLeaderboardTopEffectMessage) ((GeneratedMessageLite.b) this).instance).setTitleColor(str);
                return this;
            }

            public Builder setTitleColorBytes(ByteString byteString) {
                copyOnWrite();
                ((VoiceLiveHourLeaderboardTopEffectMessage) ((GeneratedMessageLite.b) this).instance).setTitleColorBytes(byteString);
                return this;
            }
        }

        static {
            VoiceLiveHourLeaderboardTopEffectMessage voiceLiveHourLeaderboardTopEffectMessage = new VoiceLiveHourLeaderboardTopEffectMessage();
            DEFAULT_INSTANCE = voiceLiveHourLeaderboardTopEffectMessage;
            voiceLiveHourLeaderboardTopEffectMessage.makeImmutable();
        }

        private VoiceLiveHourLeaderboardTopEffectMessage() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAnchorId() {
            this.anchorId_ = getDefaultInstance().getAnchorId();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAnchorImage() {
            this.anchorImage_ = getDefaultInstance().getAnchorImage();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAnchorName() {
            this.anchorName_ = getDefaultInstance().getAnchorName();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearBackgroundUrl() {
            this.backgroundUrl_ = getDefaultInstance().getBackgroundUrl();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearDuration() {
            this.duration_ = 0L;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearLiveId() {
            this.liveId_ = getDefaultInstance().getLiveId();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearRoomId() {
            this.roomId_ = getDefaultInstance().getRoomId();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearTitle() {
            this.title_ = getDefaultInstance().getTitle();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearTitleColor() {
            this.titleColor_ = getDefaultInstance().getTitleColor();
        }

        public static VoiceLiveHourLeaderboardTopEffectMessage getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder(VoiceLiveHourLeaderboardTopEffectMessage voiceLiveHourLeaderboardTopEffectMessage) {
            return (Builder) ((Builder) DEFAULT_INSTANCE.toBuilder()).mergeFrom(voiceLiveHourLeaderboardTopEffectMessage);
        }

        public static VoiceLiveHourLeaderboardTopEffectMessage parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (VoiceLiveHourLeaderboardTopEffectMessage) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static VoiceLiveHourLeaderboardTopEffectMessage parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (VoiceLiveHourLeaderboardTopEffectMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static i860<VoiceLiveHourLeaderboardTopEffectMessage> parser() {
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
            a.checkByteStringIsUtf8(byteString);
            this.anchorId_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAnchorImage(String str) {
            str.getClass();
            this.anchorImage_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAnchorImageBytes(ByteString byteString) {
            byteString.getClass();
            a.checkByteStringIsUtf8(byteString);
            this.anchorImage_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAnchorName(String str) {
            str.getClass();
            this.anchorName_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAnchorNameBytes(ByteString byteString) {
            byteString.getClass();
            a.checkByteStringIsUtf8(byteString);
            this.anchorName_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setBackgroundUrl(String str) {
            str.getClass();
            this.backgroundUrl_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setBackgroundUrlBytes(ByteString byteString) {
            byteString.getClass();
            a.checkByteStringIsUtf8(byteString);
            this.backgroundUrl_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setDuration(long j) {
            this.duration_ = j;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setLiveId(String str) {
            str.getClass();
            this.liveId_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setLiveIdBytes(ByteString byteString) {
            byteString.getClass();
            a.checkByteStringIsUtf8(byteString);
            this.liveId_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setRoomId(String str) {
            str.getClass();
            this.roomId_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setRoomIdBytes(ByteString byteString) {
            byteString.getClass();
            a.checkByteStringIsUtf8(byteString);
            this.roomId_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTitle(String str) {
            str.getClass();
            this.title_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTitleBytes(ByteString byteString) {
            byteString.getClass();
            a.checkByteStringIsUtf8(byteString);
            this.title_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTitleColor(String str) {
            str.getClass();
            this.titleColor_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTitleColorBytes(ByteString byteString) {
            byteString.getClass();
            a.checkByteStringIsUtf8(byteString);
            this.titleColor_ = byteString.toStringUtf8();
        }

        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            boolean z = false;
            switch (C04811.f1706xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new VoiceLiveHourLeaderboardTopEffectMessage();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                    return null;
                case 4:
                    return new Builder();
                case 5:
                    GeneratedMessageLite.h hVar = (GeneratedMessageLite.h) obj;
                    VoiceLiveHourLeaderboardTopEffectMessage voiceLiveHourLeaderboardTopEffectMessage = (VoiceLiveHourLeaderboardTopEffectMessage) obj2;
                    this.roomId_ = hVar.f(!this.roomId_.isEmpty(), this.roomId_, !voiceLiveHourLeaderboardTopEffectMessage.roomId_.isEmpty(), voiceLiveHourLeaderboardTopEffectMessage.roomId_);
                    this.liveId_ = hVar.f(!this.liveId_.isEmpty(), this.liveId_, !voiceLiveHourLeaderboardTopEffectMessage.liveId_.isEmpty(), voiceLiveHourLeaderboardTopEffectMessage.liveId_);
                    this.anchorId_ = hVar.f(!this.anchorId_.isEmpty(), this.anchorId_, !voiceLiveHourLeaderboardTopEffectMessage.anchorId_.isEmpty(), voiceLiveHourLeaderboardTopEffectMessage.anchorId_);
                    this.anchorImage_ = hVar.f(!this.anchorImage_.isEmpty(), this.anchorImage_, !voiceLiveHourLeaderboardTopEffectMessage.anchorImage_.isEmpty(), voiceLiveHourLeaderboardTopEffectMessage.anchorImage_);
                    this.anchorName_ = hVar.f(!this.anchorName_.isEmpty(), this.anchorName_, !voiceLiveHourLeaderboardTopEffectMessage.anchorName_.isEmpty(), voiceLiveHourLeaderboardTopEffectMessage.anchorName_);
                    this.title_ = hVar.f(!this.title_.isEmpty(), this.title_, !voiceLiveHourLeaderboardTopEffectMessage.title_.isEmpty(), voiceLiveHourLeaderboardTopEffectMessage.title_);
                    this.titleColor_ = hVar.f(!this.titleColor_.isEmpty(), this.titleColor_, !voiceLiveHourLeaderboardTopEffectMessage.titleColor_.isEmpty(), voiceLiveHourLeaderboardTopEffectMessage.titleColor_);
                    this.backgroundUrl_ = hVar.f(!this.backgroundUrl_.isEmpty(), this.backgroundUrl_, !voiceLiveHourLeaderboardTopEffectMessage.backgroundUrl_.isEmpty(), voiceLiveHourLeaderboardTopEffectMessage.backgroundUrl_);
                    long j = this.duration_;
                    boolean z2 = j != 0;
                    long j2 = voiceLiveHourLeaderboardTopEffectMessage.duration_;
                    this.duration_ = hVar.i(z2, j, j2 != 0, j2);
                    GeneratedMessageLite.g gVar = GeneratedMessageLite.g.INSTANCE;
                    return this;
                case 6:
                    e eVar = (e) obj;
                    while (!z) {
                        try {
                            int iM = eVar.M();
                            if (iM != 0) {
                                if (iM == 10) {
                                    this.roomId_ = eVar.L();
                                } else if (iM == 18) {
                                    this.liveId_ = eVar.L();
                                } else if (iM == 26) {
                                    this.anchorId_ = eVar.L();
                                } else if (iM == 34) {
                                    this.anchorImage_ = eVar.L();
                                } else if (iM == 42) {
                                    this.anchorName_ = eVar.L();
                                } else if (iM == 50) {
                                    this.title_ = eVar.L();
                                } else if (iM == 58) {
                                    this.titleColor_ = eVar.L();
                                } else if (iM == 82) {
                                    this.backgroundUrl_ = eVar.L();
                                } else if (iM == 88) {
                                    this.duration_ = eVar.v();
                                } else if (!eVar.R(iM)) {
                                }
                            }
                            z = true;
                        } catch (InvalidProtocolBufferException e) {
                            aag0.a(e.setUnfinishedMessage(this));
                            return null;
                        } catch (IOException e2) {
                            aag0.a(new InvalidProtocolBufferException(e2.getMessage()).setUnfinishedMessage(this));
                            return null;
                        }
                    }
                    break;
                case 7:
                    break;
                case 8:
                    if (PARSER == null) {
                        synchronized (VoiceLiveHourLeaderboardTopEffectMessage.class) {
                            try {
                                if (PARSER == null) {
                                    PARSER = new GeneratedMessageLite.c(DEFAULT_INSTANCE);
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                            break;
                        }
                    }
                    return PARSER;
                default:
                    bz00.a();
                    return null;
            }
            return DEFAULT_INSTANCE;
        }

        @Override // com.p1.mobile.longlink.msg.voicelivemessage.VoiceLiveTopBroadCast.VoiceLiveHourLeaderboardTopEffectMessageOrBuilder
        public String getAnchorId() {
            return this.anchorId_;
        }

        @Override // com.p1.mobile.longlink.msg.voicelivemessage.VoiceLiveTopBroadCast.VoiceLiveHourLeaderboardTopEffectMessageOrBuilder
        public ByteString getAnchorIdBytes() {
            return ByteString.copyFromUtf8(this.anchorId_);
        }

        @Override // com.p1.mobile.longlink.msg.voicelivemessage.VoiceLiveTopBroadCast.VoiceLiveHourLeaderboardTopEffectMessageOrBuilder
        public String getAnchorImage() {
            return this.anchorImage_;
        }

        @Override // com.p1.mobile.longlink.msg.voicelivemessage.VoiceLiveTopBroadCast.VoiceLiveHourLeaderboardTopEffectMessageOrBuilder
        public ByteString getAnchorImageBytes() {
            return ByteString.copyFromUtf8(this.anchorImage_);
        }

        @Override // com.p1.mobile.longlink.msg.voicelivemessage.VoiceLiveTopBroadCast.VoiceLiveHourLeaderboardTopEffectMessageOrBuilder
        public String getAnchorName() {
            return this.anchorName_;
        }

        @Override // com.p1.mobile.longlink.msg.voicelivemessage.VoiceLiveTopBroadCast.VoiceLiveHourLeaderboardTopEffectMessageOrBuilder
        public ByteString getAnchorNameBytes() {
            return ByteString.copyFromUtf8(this.anchorName_);
        }

        @Override // com.p1.mobile.longlink.msg.voicelivemessage.VoiceLiveTopBroadCast.VoiceLiveHourLeaderboardTopEffectMessageOrBuilder
        public String getBackgroundUrl() {
            return this.backgroundUrl_;
        }

        @Override // com.p1.mobile.longlink.msg.voicelivemessage.VoiceLiveTopBroadCast.VoiceLiveHourLeaderboardTopEffectMessageOrBuilder
        public ByteString getBackgroundUrlBytes() {
            return ByteString.copyFromUtf8(this.backgroundUrl_);
        }

        @Override // com.p1.mobile.longlink.msg.voicelivemessage.VoiceLiveTopBroadCast.VoiceLiveHourLeaderboardTopEffectMessageOrBuilder
        public long getDuration() {
            return this.duration_;
        }

        @Override // com.p1.mobile.longlink.msg.voicelivemessage.VoiceLiveTopBroadCast.VoiceLiveHourLeaderboardTopEffectMessageOrBuilder
        public String getLiveId() {
            return this.liveId_;
        }

        @Override // com.p1.mobile.longlink.msg.voicelivemessage.VoiceLiveTopBroadCast.VoiceLiveHourLeaderboardTopEffectMessageOrBuilder
        public ByteString getLiveIdBytes() {
            return ByteString.copyFromUtf8(this.liveId_);
        }

        @Override // com.p1.mobile.longlink.msg.voicelivemessage.VoiceLiveTopBroadCast.VoiceLiveHourLeaderboardTopEffectMessageOrBuilder
        public String getRoomId() {
            return this.roomId_;
        }

        @Override // com.p1.mobile.longlink.msg.voicelivemessage.VoiceLiveTopBroadCast.VoiceLiveHourLeaderboardTopEffectMessageOrBuilder
        public ByteString getRoomIdBytes() {
            return ByteString.copyFromUtf8(this.roomId_);
        }

        public int getSerializedSize() {
            int i = ((GeneratedMessageLite) this).memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int iK = !this.roomId_.isEmpty() ? CodedOutputStream.K(1, getRoomId()) : 0;
            if (!this.liveId_.isEmpty()) {
                iK += CodedOutputStream.K(2, getLiveId());
            }
            if (!this.anchorId_.isEmpty()) {
                iK += CodedOutputStream.K(3, getAnchorId());
            }
            if (!this.anchorImage_.isEmpty()) {
                iK += CodedOutputStream.K(4, getAnchorImage());
            }
            if (!this.anchorName_.isEmpty()) {
                iK += CodedOutputStream.K(5, getAnchorName());
            }
            if (!this.title_.isEmpty()) {
                iK += CodedOutputStream.K(6, getTitle());
            }
            if (!this.titleColor_.isEmpty()) {
                iK += CodedOutputStream.K(7, getTitleColor());
            }
            if (!this.backgroundUrl_.isEmpty()) {
                iK += CodedOutputStream.K(10, getBackgroundUrl());
            }
            long j = this.duration_;
            if (j != 0) {
                iK += CodedOutputStream.v(11, j);
            }
            ((GeneratedMessageLite) this).memoizedSerializedSize = iK;
            return iK;
        }

        @Override // com.p1.mobile.longlink.msg.voicelivemessage.VoiceLiveTopBroadCast.VoiceLiveHourLeaderboardTopEffectMessageOrBuilder
        public String getTitle() {
            return this.title_;
        }

        @Override // com.p1.mobile.longlink.msg.voicelivemessage.VoiceLiveTopBroadCast.VoiceLiveHourLeaderboardTopEffectMessageOrBuilder
        public ByteString getTitleBytes() {
            return ByteString.copyFromUtf8(this.title_);
        }

        @Override // com.p1.mobile.longlink.msg.voicelivemessage.VoiceLiveTopBroadCast.VoiceLiveHourLeaderboardTopEffectMessageOrBuilder
        public String getTitleColor() {
            return this.titleColor_;
        }

        @Override // com.p1.mobile.longlink.msg.voicelivemessage.VoiceLiveTopBroadCast.VoiceLiveHourLeaderboardTopEffectMessageOrBuilder
        public ByteString getTitleColorBytes() {
            return ByteString.copyFromUtf8(this.titleColor_);
        }

        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (!this.roomId_.isEmpty()) {
                codedOutputStream.D0(1, getRoomId());
            }
            if (!this.liveId_.isEmpty()) {
                codedOutputStream.D0(2, getLiveId());
            }
            if (!this.anchorId_.isEmpty()) {
                codedOutputStream.D0(3, getAnchorId());
            }
            if (!this.anchorImage_.isEmpty()) {
                codedOutputStream.D0(4, getAnchorImage());
            }
            if (!this.anchorName_.isEmpty()) {
                codedOutputStream.D0(5, getAnchorName());
            }
            if (!this.title_.isEmpty()) {
                codedOutputStream.D0(6, getTitle());
            }
            if (!this.titleColor_.isEmpty()) {
                codedOutputStream.D0(7, getTitleColor());
            }
            if (!this.backgroundUrl_.isEmpty()) {
                codedOutputStream.D0(10, getBackgroundUrl());
            }
            long j = this.duration_;
            if (j != 0) {
                codedOutputStream.u0(11, j);
            }
        }

        public static VoiceLiveHourLeaderboardTopEffectMessage parseDelimitedFrom(InputStream inputStream, h hVar) throws IOException {
            return (VoiceLiveHourLeaderboardTopEffectMessage) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, hVar);
        }

        public static VoiceLiveHourLeaderboardTopEffectMessage parseFrom(ByteString byteString, h hVar) throws InvalidProtocolBufferException {
            return (VoiceLiveHourLeaderboardTopEffectMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, hVar);
        }

        public static VoiceLiveHourLeaderboardTopEffectMessage parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (VoiceLiveHourLeaderboardTopEffectMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static VoiceLiveHourLeaderboardTopEffectMessage parseFrom(byte[] bArr, h hVar) throws InvalidProtocolBufferException {
            return (VoiceLiveHourLeaderboardTopEffectMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, hVar);
        }

        public static VoiceLiveHourLeaderboardTopEffectMessage parseFrom(InputStream inputStream) throws IOException {
            return (VoiceLiveHourLeaderboardTopEffectMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static VoiceLiveHourLeaderboardTopEffectMessage parseFrom(InputStream inputStream, h hVar) throws IOException {
            return (VoiceLiveHourLeaderboardTopEffectMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, hVar);
        }

        public static VoiceLiveHourLeaderboardTopEffectMessage parseFrom(e eVar) throws IOException {
            return (VoiceLiveHourLeaderboardTopEffectMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, eVar);
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.toBuilder();
        }

        public static VoiceLiveHourLeaderboardTopEffectMessage parseFrom(e eVar, h hVar) throws IOException {
            return (VoiceLiveHourLeaderboardTopEffectMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, eVar, hVar);
        }
    }
}
