package com.p046p1.mobile.longlink.msg.voicelivemessage;

import com.google.protobuf.AbstractC3403a;
import com.google.protobuf.ByteString;
import com.google.protobuf.C3407e;
import com.google.protobuf.C3410h;
import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InterfaceC3419q;
import com.google.protobuf.InvalidProtocolBufferException;
import java.io.IOException;
import java.io.InputStream;
import p149l.aag0;
import p149l.bz00;
import p149l.i860;
import p149l.o6z;

/* JADX INFO: loaded from: classes8.dex */
public final class VoiceLiveTopBroadCast {

    /* JADX INFO: renamed from: com.p1.mobile.longlink.msg.voicelivemessage.VoiceLiveTopBroadCast$1 */
    public static /* synthetic */ class C45691 {

        /* JADX INFO: renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f16007xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f16007xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f16007xa1df5c61[GeneratedMessageLite.MethodToInvoke.IS_INITIALIZED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f16007xa1df5c61[GeneratedMessageLite.MethodToInvoke.MAKE_IMMUTABLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f16007xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f16007xa1df5c61[GeneratedMessageLite.MethodToInvoke.VISIT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f16007xa1df5c61[GeneratedMessageLite.MethodToInvoke.MERGE_FROM_STREAM.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f16007xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f16007xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 8;
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

        @Override // p149l.o6z
        /* synthetic */ InterfaceC3419q getDefaultInstanceForType();

        long getDuration();

        String getLiveId();

        ByteString getLiveIdBytes();

        String getRoomId();

        ByteString getRoomIdBytes();

        String getTitle();

        ByteString getTitleBytes();

        String getTitleColor();

        ByteString getTitleColorBytes();

        @Override // p149l.o6z
        /* synthetic */ boolean isInitialized();
    }

    private VoiceLiveTopBroadCast() {
    }

    public static void registerAllExtensions(C3410h c3410h) {
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

        public static final class Builder extends GeneratedMessageLite.AbstractC3380b<VoiceLiveHourLeaderboardTopEffectMessage, Builder> implements VoiceLiveHourLeaderboardTopEffectMessageOrBuilder {
            private Builder() {
                super(VoiceLiveHourLeaderboardTopEffectMessage.DEFAULT_INSTANCE);
            }

            public Builder clearAnchorId() {
                copyOnWrite();
                ((VoiceLiveHourLeaderboardTopEffectMessage) this.instance).clearAnchorId();
                return this;
            }

            public Builder clearAnchorImage() {
                copyOnWrite();
                ((VoiceLiveHourLeaderboardTopEffectMessage) this.instance).clearAnchorImage();
                return this;
            }

            public Builder clearAnchorName() {
                copyOnWrite();
                ((VoiceLiveHourLeaderboardTopEffectMessage) this.instance).clearAnchorName();
                return this;
            }

            public Builder clearBackgroundUrl() {
                copyOnWrite();
                ((VoiceLiveHourLeaderboardTopEffectMessage) this.instance).clearBackgroundUrl();
                return this;
            }

            public Builder clearDuration() {
                copyOnWrite();
                ((VoiceLiveHourLeaderboardTopEffectMessage) this.instance).clearDuration();
                return this;
            }

            public Builder clearLiveId() {
                copyOnWrite();
                ((VoiceLiveHourLeaderboardTopEffectMessage) this.instance).clearLiveId();
                return this;
            }

            public Builder clearRoomId() {
                copyOnWrite();
                ((VoiceLiveHourLeaderboardTopEffectMessage) this.instance).clearRoomId();
                return this;
            }

            public Builder clearTitle() {
                copyOnWrite();
                ((VoiceLiveHourLeaderboardTopEffectMessage) this.instance).clearTitle();
                return this;
            }

            public Builder clearTitleColor() {
                copyOnWrite();
                ((VoiceLiveHourLeaderboardTopEffectMessage) this.instance).clearTitleColor();
                return this;
            }

            @Override // com.p1.mobile.longlink.msg.voicelivemessage.VoiceLiveTopBroadCast.VoiceLiveHourLeaderboardTopEffectMessageOrBuilder
            public String getAnchorId() {
                return ((VoiceLiveHourLeaderboardTopEffectMessage) this.instance).getAnchorId();
            }

            @Override // com.p1.mobile.longlink.msg.voicelivemessage.VoiceLiveTopBroadCast.VoiceLiveHourLeaderboardTopEffectMessageOrBuilder
            public ByteString getAnchorIdBytes() {
                return ((VoiceLiveHourLeaderboardTopEffectMessage) this.instance).getAnchorIdBytes();
            }

            @Override // com.p1.mobile.longlink.msg.voicelivemessage.VoiceLiveTopBroadCast.VoiceLiveHourLeaderboardTopEffectMessageOrBuilder
            public String getAnchorImage() {
                return ((VoiceLiveHourLeaderboardTopEffectMessage) this.instance).getAnchorImage();
            }

            @Override // com.p1.mobile.longlink.msg.voicelivemessage.VoiceLiveTopBroadCast.VoiceLiveHourLeaderboardTopEffectMessageOrBuilder
            public ByteString getAnchorImageBytes() {
                return ((VoiceLiveHourLeaderboardTopEffectMessage) this.instance).getAnchorImageBytes();
            }

            @Override // com.p1.mobile.longlink.msg.voicelivemessage.VoiceLiveTopBroadCast.VoiceLiveHourLeaderboardTopEffectMessageOrBuilder
            public String getAnchorName() {
                return ((VoiceLiveHourLeaderboardTopEffectMessage) this.instance).getAnchorName();
            }

            @Override // com.p1.mobile.longlink.msg.voicelivemessage.VoiceLiveTopBroadCast.VoiceLiveHourLeaderboardTopEffectMessageOrBuilder
            public ByteString getAnchorNameBytes() {
                return ((VoiceLiveHourLeaderboardTopEffectMessage) this.instance).getAnchorNameBytes();
            }

            @Override // com.p1.mobile.longlink.msg.voicelivemessage.VoiceLiveTopBroadCast.VoiceLiveHourLeaderboardTopEffectMessageOrBuilder
            public String getBackgroundUrl() {
                return ((VoiceLiveHourLeaderboardTopEffectMessage) this.instance).getBackgroundUrl();
            }

            @Override // com.p1.mobile.longlink.msg.voicelivemessage.VoiceLiveTopBroadCast.VoiceLiveHourLeaderboardTopEffectMessageOrBuilder
            public ByteString getBackgroundUrlBytes() {
                return ((VoiceLiveHourLeaderboardTopEffectMessage) this.instance).getBackgroundUrlBytes();
            }

            @Override // com.p1.mobile.longlink.msg.voicelivemessage.VoiceLiveTopBroadCast.VoiceLiveHourLeaderboardTopEffectMessageOrBuilder
            public long getDuration() {
                return ((VoiceLiveHourLeaderboardTopEffectMessage) this.instance).getDuration();
            }

            @Override // com.p1.mobile.longlink.msg.voicelivemessage.VoiceLiveTopBroadCast.VoiceLiveHourLeaderboardTopEffectMessageOrBuilder
            public String getLiveId() {
                return ((VoiceLiveHourLeaderboardTopEffectMessage) this.instance).getLiveId();
            }

            @Override // com.p1.mobile.longlink.msg.voicelivemessage.VoiceLiveTopBroadCast.VoiceLiveHourLeaderboardTopEffectMessageOrBuilder
            public ByteString getLiveIdBytes() {
                return ((VoiceLiveHourLeaderboardTopEffectMessage) this.instance).getLiveIdBytes();
            }

            @Override // com.p1.mobile.longlink.msg.voicelivemessage.VoiceLiveTopBroadCast.VoiceLiveHourLeaderboardTopEffectMessageOrBuilder
            public String getRoomId() {
                return ((VoiceLiveHourLeaderboardTopEffectMessage) this.instance).getRoomId();
            }

            @Override // com.p1.mobile.longlink.msg.voicelivemessage.VoiceLiveTopBroadCast.VoiceLiveHourLeaderboardTopEffectMessageOrBuilder
            public ByteString getRoomIdBytes() {
                return ((VoiceLiveHourLeaderboardTopEffectMessage) this.instance).getRoomIdBytes();
            }

            @Override // com.p1.mobile.longlink.msg.voicelivemessage.VoiceLiveTopBroadCast.VoiceLiveHourLeaderboardTopEffectMessageOrBuilder
            public String getTitle() {
                return ((VoiceLiveHourLeaderboardTopEffectMessage) this.instance).getTitle();
            }

            @Override // com.p1.mobile.longlink.msg.voicelivemessage.VoiceLiveTopBroadCast.VoiceLiveHourLeaderboardTopEffectMessageOrBuilder
            public ByteString getTitleBytes() {
                return ((VoiceLiveHourLeaderboardTopEffectMessage) this.instance).getTitleBytes();
            }

            @Override // com.p1.mobile.longlink.msg.voicelivemessage.VoiceLiveTopBroadCast.VoiceLiveHourLeaderboardTopEffectMessageOrBuilder
            public String getTitleColor() {
                return ((VoiceLiveHourLeaderboardTopEffectMessage) this.instance).getTitleColor();
            }

            @Override // com.p1.mobile.longlink.msg.voicelivemessage.VoiceLiveTopBroadCast.VoiceLiveHourLeaderboardTopEffectMessageOrBuilder
            public ByteString getTitleColorBytes() {
                return ((VoiceLiveHourLeaderboardTopEffectMessage) this.instance).getTitleColorBytes();
            }

            public Builder setAnchorId(String str) {
                copyOnWrite();
                ((VoiceLiveHourLeaderboardTopEffectMessage) this.instance).setAnchorId(str);
                return this;
            }

            public Builder setAnchorIdBytes(ByteString byteString) {
                copyOnWrite();
                ((VoiceLiveHourLeaderboardTopEffectMessage) this.instance).setAnchorIdBytes(byteString);
                return this;
            }

            public Builder setAnchorImage(String str) {
                copyOnWrite();
                ((VoiceLiveHourLeaderboardTopEffectMessage) this.instance).setAnchorImage(str);
                return this;
            }

            public Builder setAnchorImageBytes(ByteString byteString) {
                copyOnWrite();
                ((VoiceLiveHourLeaderboardTopEffectMessage) this.instance).setAnchorImageBytes(byteString);
                return this;
            }

            public Builder setAnchorName(String str) {
                copyOnWrite();
                ((VoiceLiveHourLeaderboardTopEffectMessage) this.instance).setAnchorName(str);
                return this;
            }

            public Builder setAnchorNameBytes(ByteString byteString) {
                copyOnWrite();
                ((VoiceLiveHourLeaderboardTopEffectMessage) this.instance).setAnchorNameBytes(byteString);
                return this;
            }

            public Builder setBackgroundUrl(String str) {
                copyOnWrite();
                ((VoiceLiveHourLeaderboardTopEffectMessage) this.instance).setBackgroundUrl(str);
                return this;
            }

            public Builder setBackgroundUrlBytes(ByteString byteString) {
                copyOnWrite();
                ((VoiceLiveHourLeaderboardTopEffectMessage) this.instance).setBackgroundUrlBytes(byteString);
                return this;
            }

            public Builder setDuration(long j) {
                copyOnWrite();
                ((VoiceLiveHourLeaderboardTopEffectMessage) this.instance).setDuration(j);
                return this;
            }

            public Builder setLiveId(String str) {
                copyOnWrite();
                ((VoiceLiveHourLeaderboardTopEffectMessage) this.instance).setLiveId(str);
                return this;
            }

            public Builder setLiveIdBytes(ByteString byteString) {
                copyOnWrite();
                ((VoiceLiveHourLeaderboardTopEffectMessage) this.instance).setLiveIdBytes(byteString);
                return this;
            }

            public Builder setRoomId(String str) {
                copyOnWrite();
                ((VoiceLiveHourLeaderboardTopEffectMessage) this.instance).setRoomId(str);
                return this;
            }

            public Builder setRoomIdBytes(ByteString byteString) {
                copyOnWrite();
                ((VoiceLiveHourLeaderboardTopEffectMessage) this.instance).setRoomIdBytes(byteString);
                return this;
            }

            public Builder setTitle(String str) {
                copyOnWrite();
                ((VoiceLiveHourLeaderboardTopEffectMessage) this.instance).setTitle(str);
                return this;
            }

            public Builder setTitleBytes(ByteString byteString) {
                copyOnWrite();
                ((VoiceLiveHourLeaderboardTopEffectMessage) this.instance).setTitleBytes(byteString);
                return this;
            }

            public Builder setTitleColor(String str) {
                copyOnWrite();
                ((VoiceLiveHourLeaderboardTopEffectMessage) this.instance).setTitleColor(str);
                return this;
            }

            public Builder setTitleColorBytes(ByteString byteString) {
                copyOnWrite();
                ((VoiceLiveHourLeaderboardTopEffectMessage) this.instance).setTitleColorBytes(byteString);
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
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(voiceLiveHourLeaderboardTopEffectMessage);
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
            AbstractC3403a.checkByteStringIsUtf8(byteString);
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
            AbstractC3403a.checkByteStringIsUtf8(byteString);
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
            AbstractC3403a.checkByteStringIsUtf8(byteString);
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
            AbstractC3403a.checkByteStringIsUtf8(byteString);
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
            AbstractC3403a.checkByteStringIsUtf8(byteString);
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
            AbstractC3403a.checkByteStringIsUtf8(byteString);
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
            AbstractC3403a.checkByteStringIsUtf8(byteString);
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
            AbstractC3403a.checkByteStringIsUtf8(byteString);
            this.titleColor_ = byteString.toStringUtf8();
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            boolean z = false;
            switch (C45691.f16007xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new VoiceLiveHourLeaderboardTopEffectMessage();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                    return null;
                case 4:
                    return new Builder();
                case 5:
                    GeneratedMessageLite.InterfaceC3386h interfaceC3386h = (GeneratedMessageLite.InterfaceC3386h) obj;
                    VoiceLiveHourLeaderboardTopEffectMessage voiceLiveHourLeaderboardTopEffectMessage = (VoiceLiveHourLeaderboardTopEffectMessage) obj2;
                    this.roomId_ = interfaceC3386h.mo16997f(!this.roomId_.isEmpty(), this.roomId_, !voiceLiveHourLeaderboardTopEffectMessage.roomId_.isEmpty(), voiceLiveHourLeaderboardTopEffectMessage.roomId_);
                    this.liveId_ = interfaceC3386h.mo16997f(!this.liveId_.isEmpty(), this.liveId_, !voiceLiveHourLeaderboardTopEffectMessage.liveId_.isEmpty(), voiceLiveHourLeaderboardTopEffectMessage.liveId_);
                    this.anchorId_ = interfaceC3386h.mo16997f(!this.anchorId_.isEmpty(), this.anchorId_, !voiceLiveHourLeaderboardTopEffectMessage.anchorId_.isEmpty(), voiceLiveHourLeaderboardTopEffectMessage.anchorId_);
                    this.anchorImage_ = interfaceC3386h.mo16997f(!this.anchorImage_.isEmpty(), this.anchorImage_, !voiceLiveHourLeaderboardTopEffectMessage.anchorImage_.isEmpty(), voiceLiveHourLeaderboardTopEffectMessage.anchorImage_);
                    this.anchorName_ = interfaceC3386h.mo16997f(!this.anchorName_.isEmpty(), this.anchorName_, !voiceLiveHourLeaderboardTopEffectMessage.anchorName_.isEmpty(), voiceLiveHourLeaderboardTopEffectMessage.anchorName_);
                    this.title_ = interfaceC3386h.mo16997f(!this.title_.isEmpty(), this.title_, !voiceLiveHourLeaderboardTopEffectMessage.title_.isEmpty(), voiceLiveHourLeaderboardTopEffectMessage.title_);
                    this.titleColor_ = interfaceC3386h.mo16997f(!this.titleColor_.isEmpty(), this.titleColor_, !voiceLiveHourLeaderboardTopEffectMessage.titleColor_.isEmpty(), voiceLiveHourLeaderboardTopEffectMessage.titleColor_);
                    this.backgroundUrl_ = interfaceC3386h.mo16997f(!this.backgroundUrl_.isEmpty(), this.backgroundUrl_, !voiceLiveHourLeaderboardTopEffectMessage.backgroundUrl_.isEmpty(), voiceLiveHourLeaderboardTopEffectMessage.backgroundUrl_);
                    long j = this.duration_;
                    boolean z2 = j != 0;
                    long j2 = voiceLiveHourLeaderboardTopEffectMessage.duration_;
                    this.duration_ = interfaceC3386h.mo17000i(z2, j, j2 != 0, j2);
                    GeneratedMessageLite.C3385g c3385g = GeneratedMessageLite.C3385g.INSTANCE;
                    return this;
                case 6:
                    C3407e c3407e = (C3407e) obj;
                    while (!z) {
                        try {
                            int iM17116M = c3407e.m17116M();
                            if (iM17116M != 0) {
                                if (iM17116M == 10) {
                                    this.roomId_ = c3407e.m17115L();
                                } else if (iM17116M == 18) {
                                    this.liveId_ = c3407e.m17115L();
                                } else if (iM17116M == 26) {
                                    this.anchorId_ = c3407e.m17115L();
                                } else if (iM17116M == 34) {
                                    this.anchorImage_ = c3407e.m17115L();
                                } else if (iM17116M == 42) {
                                    this.anchorName_ = c3407e.m17115L();
                                } else if (iM17116M == 50) {
                                    this.title_ = c3407e.m17115L();
                                } else if (iM17116M == 58) {
                                    this.titleColor_ = c3407e.m17115L();
                                } else if (iM17116M == 82) {
                                    this.backgroundUrl_ = c3407e.m17115L();
                                } else if (iM17116M == 88) {
                                    this.duration_ = c3407e.m17142v();
                                } else if (!c3407e.m17121R(iM17116M)) {
                                }
                            }
                            z = true;
                        } catch (InvalidProtocolBufferException e) {
                            aag0.m95543a(e.setUnfinishedMessage(this));
                            return null;
                        } catch (IOException e2) {
                            aag0.m95543a(new InvalidProtocolBufferException(e2.getMessage()).setUnfinishedMessage(this));
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
                                    PARSER = new GeneratedMessageLite.C3381c(DEFAULT_INSTANCE);
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                            break;
                        }
                    }
                    return PARSER;
                default:
                    bz00.m104536a();
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

        @Override // com.google.protobuf.InterfaceC3419q
        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int iM16901K = !this.roomId_.isEmpty() ? CodedOutputStream.m16901K(1, getRoomId()) : 0;
            if (!this.liveId_.isEmpty()) {
                iM16901K += CodedOutputStream.m16901K(2, getLiveId());
            }
            if (!this.anchorId_.isEmpty()) {
                iM16901K += CodedOutputStream.m16901K(3, getAnchorId());
            }
            if (!this.anchorImage_.isEmpty()) {
                iM16901K += CodedOutputStream.m16901K(4, getAnchorImage());
            }
            if (!this.anchorName_.isEmpty()) {
                iM16901K += CodedOutputStream.m16901K(5, getAnchorName());
            }
            if (!this.title_.isEmpty()) {
                iM16901K += CodedOutputStream.m16901K(6, getTitle());
            }
            if (!this.titleColor_.isEmpty()) {
                iM16901K += CodedOutputStream.m16901K(7, getTitleColor());
            }
            if (!this.backgroundUrl_.isEmpty()) {
                iM16901K += CodedOutputStream.m16901K(10, getBackgroundUrl());
            }
            long j = this.duration_;
            if (j != 0) {
                iM16901K += CodedOutputStream.m16931v(11, j);
            }
            this.memoizedSerializedSize = iM16901K;
            return iM16901K;
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

        @Override // com.google.protobuf.InterfaceC3419q
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (!this.roomId_.isEmpty()) {
                codedOutputStream.mo16939D0(1, getRoomId());
            }
            if (!this.liveId_.isEmpty()) {
                codedOutputStream.mo16939D0(2, getLiveId());
            }
            if (!this.anchorId_.isEmpty()) {
                codedOutputStream.mo16939D0(3, getAnchorId());
            }
            if (!this.anchorImage_.isEmpty()) {
                codedOutputStream.mo16939D0(4, getAnchorImage());
            }
            if (!this.anchorName_.isEmpty()) {
                codedOutputStream.mo16939D0(5, getAnchorName());
            }
            if (!this.title_.isEmpty()) {
                codedOutputStream.mo16939D0(6, getTitle());
            }
            if (!this.titleColor_.isEmpty()) {
                codedOutputStream.mo16939D0(7, getTitleColor());
            }
            if (!this.backgroundUrl_.isEmpty()) {
                codedOutputStream.mo16939D0(10, getBackgroundUrl());
            }
            long j = this.duration_;
            if (j != 0) {
                codedOutputStream.m16972u0(11, j);
            }
        }

        public static VoiceLiveHourLeaderboardTopEffectMessage parseDelimitedFrom(InputStream inputStream, C3410h c3410h) throws IOException {
            return (VoiceLiveHourLeaderboardTopEffectMessage) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, c3410h);
        }

        public static VoiceLiveHourLeaderboardTopEffectMessage parseFrom(ByteString byteString, C3410h c3410h) throws InvalidProtocolBufferException {
            return (VoiceLiveHourLeaderboardTopEffectMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, c3410h);
        }

        public static VoiceLiveHourLeaderboardTopEffectMessage parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (VoiceLiveHourLeaderboardTopEffectMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static VoiceLiveHourLeaderboardTopEffectMessage parseFrom(byte[] bArr, C3410h c3410h) throws InvalidProtocolBufferException {
            return (VoiceLiveHourLeaderboardTopEffectMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, c3410h);
        }

        public static VoiceLiveHourLeaderboardTopEffectMessage parseFrom(InputStream inputStream) throws IOException {
            return (VoiceLiveHourLeaderboardTopEffectMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static VoiceLiveHourLeaderboardTopEffectMessage parseFrom(InputStream inputStream, C3410h c3410h) throws IOException {
            return (VoiceLiveHourLeaderboardTopEffectMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, c3410h);
        }

        public static VoiceLiveHourLeaderboardTopEffectMessage parseFrom(C3407e c3407e) throws IOException {
            return (VoiceLiveHourLeaderboardTopEffectMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, c3407e);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static VoiceLiveHourLeaderboardTopEffectMessage parseFrom(C3407e c3407e, C3410h c3410h) throws IOException {
            return (VoiceLiveHourLeaderboardTopEffectMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, c3407e, c3410h);
        }
    }
}
