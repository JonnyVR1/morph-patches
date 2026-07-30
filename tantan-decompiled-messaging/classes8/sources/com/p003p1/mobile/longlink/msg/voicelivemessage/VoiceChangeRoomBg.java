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
public final class VoiceChangeRoomBg {

    /* JADX INFO: renamed from: com.p1.mobile.longlink.msg.voicelivemessage.VoiceChangeRoomBg$1 */
    public static /* synthetic */ class C04711 {

        /* JADX INFO: renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f1701xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f1701xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f1701xa1df5c61[GeneratedMessageLite.MethodToInvoke.IS_INITIALIZED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f1701xa1df5c61[GeneratedMessageLite.MethodToInvoke.MAKE_IMMUTABLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f1701xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f1701xa1df5c61[GeneratedMessageLite.MethodToInvoke.VISIT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f1701xa1df5c61[GeneratedMessageLite.MethodToInvoke.MERGE_FROM_STREAM.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f1701xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f1701xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    public interface VoiceRoomBgPicUpdateMessageOrBuilder extends o6z {
        String getAnchorId();

        ByteString getAnchorIdBytes();

        VoiceRoomCallPlaceResource getCallPlaceResource();

        /* synthetic */ q getDefaultInstanceForType();

        String getLiveId();

        ByteString getLiveIdBytes();

        String getPicId();

        ByteString getPicIdBytes();

        String getPicName();

        ByteString getPicNameBytes();

        String getPicType();

        ByteString getPicTypeBytes();

        String getRoomId();

        ByteString getRoomIdBytes();

        String getThumbnailUrl();

        ByteString getThumbnailUrlBytes();

        String getUrl();

        ByteString getUrlBytes();

        boolean hasCallPlaceResource();

        /* synthetic */ boolean isInitialized();
    }

    public interface VoiceRoomCallPlaceResourceOrBuilder extends o6z {
        String getAddUrl();

        ByteString getAddUrlBytes();

        String getBgUrl();

        ByteString getBgUrlBytes();

        String getBossUrl();

        ByteString getBossUrlBytes();

        /* synthetic */ q getDefaultInstanceForType();

        String getIndexColor();

        ByteString getIndexColorBytes();

        /* synthetic */ boolean isInitialized();
    }

    private VoiceChangeRoomBg() {
    }

    public static void registerAllExtensions(h hVar) {
    }

    public static final class VoiceRoomBgPicUpdateMessage extends GeneratedMessageLite<VoiceRoomBgPicUpdateMessage, Builder> implements VoiceRoomBgPicUpdateMessageOrBuilder {
        public static final int ANCHORID_FIELD_NUMBER = 3;
        public static final int CALLPLACERESOURCE_FIELD_NUMBER = 9;
        private static final VoiceRoomBgPicUpdateMessage DEFAULT_INSTANCE;
        public static final int LIVEID_FIELD_NUMBER = 2;
        private static volatile i860<VoiceRoomBgPicUpdateMessage> PARSER = null;
        public static final int PICID_FIELD_NUMBER = 4;
        public static final int PICNAME_FIELD_NUMBER = 7;
        public static final int PICTYPE_FIELD_NUMBER = 8;
        public static final int ROOMID_FIELD_NUMBER = 1;
        public static final int THUMBNAILURL_FIELD_NUMBER = 6;
        public static final int URL_FIELD_NUMBER = 5;
        private VoiceRoomCallPlaceResource callPlaceResource_;
        private String roomId_ = "";
        private String liveId_ = "";
        private String anchorId_ = "";
        private String picId_ = "";
        private String url_ = "";
        private String thumbnailUrl_ = "";
        private String picName_ = "";
        private String picType_ = "";

        static {
            VoiceRoomBgPicUpdateMessage voiceRoomBgPicUpdateMessage = new VoiceRoomBgPicUpdateMessage();
            DEFAULT_INSTANCE = voiceRoomBgPicUpdateMessage;
            voiceRoomBgPicUpdateMessage.makeImmutable();
        }

        private VoiceRoomBgPicUpdateMessage() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAnchorId() {
            this.anchorId_ = getDefaultInstance().getAnchorId();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearCallPlaceResource() {
            this.callPlaceResource_ = null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearLiveId() {
            this.liveId_ = getDefaultInstance().getLiveId();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearPicId() {
            this.picId_ = getDefaultInstance().getPicId();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearPicName() {
            this.picName_ = getDefaultInstance().getPicName();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearPicType() {
            this.picType_ = getDefaultInstance().getPicType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearRoomId() {
            this.roomId_ = getDefaultInstance().getRoomId();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearThumbnailUrl() {
            this.thumbnailUrl_ = getDefaultInstance().getThumbnailUrl();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearUrl() {
            this.url_ = getDefaultInstance().getUrl();
        }

        public static VoiceRoomBgPicUpdateMessage getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeCallPlaceResource(VoiceRoomCallPlaceResource voiceRoomCallPlaceResource) {
            VoiceRoomCallPlaceResource voiceRoomCallPlaceResource2 = this.callPlaceResource_;
            if (voiceRoomCallPlaceResource2 == null || voiceRoomCallPlaceResource2 == VoiceRoomCallPlaceResource.getDefaultInstance()) {
                this.callPlaceResource_ = voiceRoomCallPlaceResource;
            } else {
                this.callPlaceResource_ = (VoiceRoomCallPlaceResource) ((VoiceRoomCallPlaceResource.Builder) VoiceRoomCallPlaceResource.newBuilder(this.callPlaceResource_).mergeFrom(voiceRoomCallPlaceResource)).buildPartial();
            }
        }

        public static Builder newBuilder(VoiceRoomBgPicUpdateMessage voiceRoomBgPicUpdateMessage) {
            return (Builder) ((Builder) DEFAULT_INSTANCE.toBuilder()).mergeFrom(voiceRoomBgPicUpdateMessage);
        }

        public static VoiceRoomBgPicUpdateMessage parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (VoiceRoomBgPicUpdateMessage) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static VoiceRoomBgPicUpdateMessage parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (VoiceRoomBgPicUpdateMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static i860<VoiceRoomBgPicUpdateMessage> parser() {
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
        public void setCallPlaceResource(VoiceRoomCallPlaceResource.Builder builder) {
            this.callPlaceResource_ = (VoiceRoomCallPlaceResource) builder.build();
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
        public void setPicId(String str) {
            str.getClass();
            this.picId_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setPicIdBytes(ByteString byteString) {
            byteString.getClass();
            a.checkByteStringIsUtf8(byteString);
            this.picId_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setPicName(String str) {
            str.getClass();
            this.picName_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setPicNameBytes(ByteString byteString) {
            byteString.getClass();
            a.checkByteStringIsUtf8(byteString);
            this.picName_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setPicType(String str) {
            str.getClass();
            this.picType_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setPicTypeBytes(ByteString byteString) {
            byteString.getClass();
            a.checkByteStringIsUtf8(byteString);
            this.picType_ = byteString.toStringUtf8();
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
        public void setThumbnailUrl(String str) {
            str.getClass();
            this.thumbnailUrl_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setThumbnailUrlBytes(ByteString byteString) {
            byteString.getClass();
            a.checkByteStringIsUtf8(byteString);
            this.thumbnailUrl_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setUrl(String str) {
            str.getClass();
            this.url_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setUrlBytes(ByteString byteString) {
            byteString.getClass();
            a.checkByteStringIsUtf8(byteString);
            this.url_ = byteString.toStringUtf8();
        }

        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (C04711.f1701xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new VoiceRoomBgPicUpdateMessage();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                    return null;
                case 4:
                    return new Builder();
                case 5:
                    GeneratedMessageLite.h hVar = (GeneratedMessageLite.h) obj;
                    VoiceRoomBgPicUpdateMessage voiceRoomBgPicUpdateMessage = (VoiceRoomBgPicUpdateMessage) obj2;
                    this.roomId_ = hVar.f(!this.roomId_.isEmpty(), this.roomId_, !voiceRoomBgPicUpdateMessage.roomId_.isEmpty(), voiceRoomBgPicUpdateMessage.roomId_);
                    this.liveId_ = hVar.f(!this.liveId_.isEmpty(), this.liveId_, !voiceRoomBgPicUpdateMessage.liveId_.isEmpty(), voiceRoomBgPicUpdateMessage.liveId_);
                    this.anchorId_ = hVar.f(!this.anchorId_.isEmpty(), this.anchorId_, !voiceRoomBgPicUpdateMessage.anchorId_.isEmpty(), voiceRoomBgPicUpdateMessage.anchorId_);
                    this.picId_ = hVar.f(!this.picId_.isEmpty(), this.picId_, !voiceRoomBgPicUpdateMessage.picId_.isEmpty(), voiceRoomBgPicUpdateMessage.picId_);
                    this.url_ = hVar.f(!this.url_.isEmpty(), this.url_, !voiceRoomBgPicUpdateMessage.url_.isEmpty(), voiceRoomBgPicUpdateMessage.url_);
                    this.thumbnailUrl_ = hVar.f(!this.thumbnailUrl_.isEmpty(), this.thumbnailUrl_, !voiceRoomBgPicUpdateMessage.thumbnailUrl_.isEmpty(), voiceRoomBgPicUpdateMessage.thumbnailUrl_);
                    this.picName_ = hVar.f(!this.picName_.isEmpty(), this.picName_, !voiceRoomBgPicUpdateMessage.picName_.isEmpty(), voiceRoomBgPicUpdateMessage.picName_);
                    this.picType_ = hVar.f(!this.picType_.isEmpty(), this.picType_, true ^ voiceRoomBgPicUpdateMessage.picType_.isEmpty(), voiceRoomBgPicUpdateMessage.picType_);
                    this.callPlaceResource_ = hVar.o(this.callPlaceResource_, voiceRoomBgPicUpdateMessage.callPlaceResource_);
                    GeneratedMessageLite.g gVar = GeneratedMessageLite.g.INSTANCE;
                    return this;
                case 6:
                    e eVar = (e) obj;
                    h hVar2 = (h) obj2;
                    boolean z = false;
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
                                    this.picId_ = eVar.L();
                                } else if (iM == 42) {
                                    this.url_ = eVar.L();
                                } else if (iM == 50) {
                                    this.thumbnailUrl_ = eVar.L();
                                } else if (iM == 58) {
                                    this.picName_ = eVar.L();
                                } else if (iM == 66) {
                                    this.picType_ = eVar.L();
                                } else if (iM == 74) {
                                    VoiceRoomCallPlaceResource voiceRoomCallPlaceResource = this.callPlaceResource_;
                                    VoiceRoomCallPlaceResource.Builder builder = voiceRoomCallPlaceResource != null ? (VoiceRoomCallPlaceResource.Builder) voiceRoomCallPlaceResource.toBuilder() : null;
                                    VoiceRoomCallPlaceResource voiceRoomCallPlaceResourceW = eVar.w(VoiceRoomCallPlaceResource.parser(), hVar2);
                                    this.callPlaceResource_ = voiceRoomCallPlaceResourceW;
                                    if (builder != null) {
                                        builder.mergeFrom(voiceRoomCallPlaceResourceW);
                                        this.callPlaceResource_ = (VoiceRoomCallPlaceResource) builder.buildPartial();
                                    }
                                } else if (!eVar.R(iM)) {
                                }
                            }
                            z = true;
                        } catch (IOException e) {
                            aag0.a(new InvalidProtocolBufferException(e.getMessage()).setUnfinishedMessage(this));
                            return null;
                        } catch (InvalidProtocolBufferException e2) {
                            aag0.a(e2.setUnfinishedMessage(this));
                            return null;
                        }
                    }
                    break;
                case 7:
                    break;
                case 8:
                    if (PARSER == null) {
                        synchronized (VoiceRoomBgPicUpdateMessage.class) {
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

        @Override // com.p1.mobile.longlink.msg.voicelivemessage.VoiceChangeRoomBg.VoiceRoomBgPicUpdateMessageOrBuilder
        public String getAnchorId() {
            return this.anchorId_;
        }

        @Override // com.p1.mobile.longlink.msg.voicelivemessage.VoiceChangeRoomBg.VoiceRoomBgPicUpdateMessageOrBuilder
        public ByteString getAnchorIdBytes() {
            return ByteString.copyFromUtf8(this.anchorId_);
        }

        @Override // com.p1.mobile.longlink.msg.voicelivemessage.VoiceChangeRoomBg.VoiceRoomBgPicUpdateMessageOrBuilder
        public VoiceRoomCallPlaceResource getCallPlaceResource() {
            VoiceRoomCallPlaceResource voiceRoomCallPlaceResource = this.callPlaceResource_;
            return voiceRoomCallPlaceResource == null ? VoiceRoomCallPlaceResource.getDefaultInstance() : voiceRoomCallPlaceResource;
        }

        @Override // com.p1.mobile.longlink.msg.voicelivemessage.VoiceChangeRoomBg.VoiceRoomBgPicUpdateMessageOrBuilder
        public String getLiveId() {
            return this.liveId_;
        }

        @Override // com.p1.mobile.longlink.msg.voicelivemessage.VoiceChangeRoomBg.VoiceRoomBgPicUpdateMessageOrBuilder
        public ByteString getLiveIdBytes() {
            return ByteString.copyFromUtf8(this.liveId_);
        }

        @Override // com.p1.mobile.longlink.msg.voicelivemessage.VoiceChangeRoomBg.VoiceRoomBgPicUpdateMessageOrBuilder
        public String getPicId() {
            return this.picId_;
        }

        @Override // com.p1.mobile.longlink.msg.voicelivemessage.VoiceChangeRoomBg.VoiceRoomBgPicUpdateMessageOrBuilder
        public ByteString getPicIdBytes() {
            return ByteString.copyFromUtf8(this.picId_);
        }

        @Override // com.p1.mobile.longlink.msg.voicelivemessage.VoiceChangeRoomBg.VoiceRoomBgPicUpdateMessageOrBuilder
        public String getPicName() {
            return this.picName_;
        }

        @Override // com.p1.mobile.longlink.msg.voicelivemessage.VoiceChangeRoomBg.VoiceRoomBgPicUpdateMessageOrBuilder
        public ByteString getPicNameBytes() {
            return ByteString.copyFromUtf8(this.picName_);
        }

        @Override // com.p1.mobile.longlink.msg.voicelivemessage.VoiceChangeRoomBg.VoiceRoomBgPicUpdateMessageOrBuilder
        public String getPicType() {
            return this.picType_;
        }

        @Override // com.p1.mobile.longlink.msg.voicelivemessage.VoiceChangeRoomBg.VoiceRoomBgPicUpdateMessageOrBuilder
        public ByteString getPicTypeBytes() {
            return ByteString.copyFromUtf8(this.picType_);
        }

        @Override // com.p1.mobile.longlink.msg.voicelivemessage.VoiceChangeRoomBg.VoiceRoomBgPicUpdateMessageOrBuilder
        public String getRoomId() {
            return this.roomId_;
        }

        @Override // com.p1.mobile.longlink.msg.voicelivemessage.VoiceChangeRoomBg.VoiceRoomBgPicUpdateMessageOrBuilder
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
            if (!this.picId_.isEmpty()) {
                iK += CodedOutputStream.K(4, getPicId());
            }
            if (!this.url_.isEmpty()) {
                iK += CodedOutputStream.K(5, getUrl());
            }
            if (!this.thumbnailUrl_.isEmpty()) {
                iK += CodedOutputStream.K(6, getThumbnailUrl());
            }
            if (!this.picName_.isEmpty()) {
                iK += CodedOutputStream.K(7, getPicName());
            }
            if (!this.picType_.isEmpty()) {
                iK += CodedOutputStream.K(8, getPicType());
            }
            if (this.callPlaceResource_ != null) {
                iK += CodedOutputStream.C(9, getCallPlaceResource());
            }
            ((GeneratedMessageLite) this).memoizedSerializedSize = iK;
            return iK;
        }

        @Override // com.p1.mobile.longlink.msg.voicelivemessage.VoiceChangeRoomBg.VoiceRoomBgPicUpdateMessageOrBuilder
        public String getThumbnailUrl() {
            return this.thumbnailUrl_;
        }

        @Override // com.p1.mobile.longlink.msg.voicelivemessage.VoiceChangeRoomBg.VoiceRoomBgPicUpdateMessageOrBuilder
        public ByteString getThumbnailUrlBytes() {
            return ByteString.copyFromUtf8(this.thumbnailUrl_);
        }

        @Override // com.p1.mobile.longlink.msg.voicelivemessage.VoiceChangeRoomBg.VoiceRoomBgPicUpdateMessageOrBuilder
        public String getUrl() {
            return this.url_;
        }

        @Override // com.p1.mobile.longlink.msg.voicelivemessage.VoiceChangeRoomBg.VoiceRoomBgPicUpdateMessageOrBuilder
        public ByteString getUrlBytes() {
            return ByteString.copyFromUtf8(this.url_);
        }

        @Override // com.p1.mobile.longlink.msg.voicelivemessage.VoiceChangeRoomBg.VoiceRoomBgPicUpdateMessageOrBuilder
        public boolean hasCallPlaceResource() {
            return this.callPlaceResource_ != null;
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
            if (!this.picId_.isEmpty()) {
                codedOutputStream.D0(4, getPicId());
            }
            if (!this.url_.isEmpty()) {
                codedOutputStream.D0(5, getUrl());
            }
            if (!this.thumbnailUrl_.isEmpty()) {
                codedOutputStream.D0(6, getThumbnailUrl());
            }
            if (!this.picName_.isEmpty()) {
                codedOutputStream.D0(7, getPicName());
            }
            if (!this.picType_.isEmpty()) {
                codedOutputStream.D0(8, getPicType());
            }
            if (this.callPlaceResource_ != null) {
                codedOutputStream.w0(9, getCallPlaceResource());
            }
        }

        public static VoiceRoomBgPicUpdateMessage parseDelimitedFrom(InputStream inputStream, h hVar) throws IOException {
            return (VoiceRoomBgPicUpdateMessage) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, hVar);
        }

        public static VoiceRoomBgPicUpdateMessage parseFrom(ByteString byteString, h hVar) throws InvalidProtocolBufferException {
            return (VoiceRoomBgPicUpdateMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, hVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setCallPlaceResource(VoiceRoomCallPlaceResource voiceRoomCallPlaceResource) {
            voiceRoomCallPlaceResource.getClass();
            this.callPlaceResource_ = voiceRoomCallPlaceResource;
        }

        public static final class Builder extends GeneratedMessageLite.b<VoiceRoomBgPicUpdateMessage, Builder> implements VoiceRoomBgPicUpdateMessageOrBuilder {
            private Builder() {
                super(VoiceRoomBgPicUpdateMessage.DEFAULT_INSTANCE);
            }

            public Builder clearAnchorId() {
                copyOnWrite();
                ((VoiceRoomBgPicUpdateMessage) ((GeneratedMessageLite.b) this).instance).clearAnchorId();
                return this;
            }

            public Builder clearCallPlaceResource() {
                copyOnWrite();
                ((VoiceRoomBgPicUpdateMessage) ((GeneratedMessageLite.b) this).instance).clearCallPlaceResource();
                return this;
            }

            public Builder clearLiveId() {
                copyOnWrite();
                ((VoiceRoomBgPicUpdateMessage) ((GeneratedMessageLite.b) this).instance).clearLiveId();
                return this;
            }

            public Builder clearPicId() {
                copyOnWrite();
                ((VoiceRoomBgPicUpdateMessage) ((GeneratedMessageLite.b) this).instance).clearPicId();
                return this;
            }

            public Builder clearPicName() {
                copyOnWrite();
                ((VoiceRoomBgPicUpdateMessage) ((GeneratedMessageLite.b) this).instance).clearPicName();
                return this;
            }

            public Builder clearPicType() {
                copyOnWrite();
                ((VoiceRoomBgPicUpdateMessage) ((GeneratedMessageLite.b) this).instance).clearPicType();
                return this;
            }

            public Builder clearRoomId() {
                copyOnWrite();
                ((VoiceRoomBgPicUpdateMessage) ((GeneratedMessageLite.b) this).instance).clearRoomId();
                return this;
            }

            public Builder clearThumbnailUrl() {
                copyOnWrite();
                ((VoiceRoomBgPicUpdateMessage) ((GeneratedMessageLite.b) this).instance).clearThumbnailUrl();
                return this;
            }

            public Builder clearUrl() {
                copyOnWrite();
                ((VoiceRoomBgPicUpdateMessage) ((GeneratedMessageLite.b) this).instance).clearUrl();
                return this;
            }

            @Override // com.p1.mobile.longlink.msg.voicelivemessage.VoiceChangeRoomBg.VoiceRoomBgPicUpdateMessageOrBuilder
            public String getAnchorId() {
                return ((VoiceRoomBgPicUpdateMessage) ((GeneratedMessageLite.b) this).instance).getAnchorId();
            }

            @Override // com.p1.mobile.longlink.msg.voicelivemessage.VoiceChangeRoomBg.VoiceRoomBgPicUpdateMessageOrBuilder
            public ByteString getAnchorIdBytes() {
                return ((VoiceRoomBgPicUpdateMessage) ((GeneratedMessageLite.b) this).instance).getAnchorIdBytes();
            }

            @Override // com.p1.mobile.longlink.msg.voicelivemessage.VoiceChangeRoomBg.VoiceRoomBgPicUpdateMessageOrBuilder
            public VoiceRoomCallPlaceResource getCallPlaceResource() {
                return ((VoiceRoomBgPicUpdateMessage) ((GeneratedMessageLite.b) this).instance).getCallPlaceResource();
            }

            @Override // com.p1.mobile.longlink.msg.voicelivemessage.VoiceChangeRoomBg.VoiceRoomBgPicUpdateMessageOrBuilder
            public String getLiveId() {
                return ((VoiceRoomBgPicUpdateMessage) ((GeneratedMessageLite.b) this).instance).getLiveId();
            }

            @Override // com.p1.mobile.longlink.msg.voicelivemessage.VoiceChangeRoomBg.VoiceRoomBgPicUpdateMessageOrBuilder
            public ByteString getLiveIdBytes() {
                return ((VoiceRoomBgPicUpdateMessage) ((GeneratedMessageLite.b) this).instance).getLiveIdBytes();
            }

            @Override // com.p1.mobile.longlink.msg.voicelivemessage.VoiceChangeRoomBg.VoiceRoomBgPicUpdateMessageOrBuilder
            public String getPicId() {
                return ((VoiceRoomBgPicUpdateMessage) ((GeneratedMessageLite.b) this).instance).getPicId();
            }

            @Override // com.p1.mobile.longlink.msg.voicelivemessage.VoiceChangeRoomBg.VoiceRoomBgPicUpdateMessageOrBuilder
            public ByteString getPicIdBytes() {
                return ((VoiceRoomBgPicUpdateMessage) ((GeneratedMessageLite.b) this).instance).getPicIdBytes();
            }

            @Override // com.p1.mobile.longlink.msg.voicelivemessage.VoiceChangeRoomBg.VoiceRoomBgPicUpdateMessageOrBuilder
            public String getPicName() {
                return ((VoiceRoomBgPicUpdateMessage) ((GeneratedMessageLite.b) this).instance).getPicName();
            }

            @Override // com.p1.mobile.longlink.msg.voicelivemessage.VoiceChangeRoomBg.VoiceRoomBgPicUpdateMessageOrBuilder
            public ByteString getPicNameBytes() {
                return ((VoiceRoomBgPicUpdateMessage) ((GeneratedMessageLite.b) this).instance).getPicNameBytes();
            }

            @Override // com.p1.mobile.longlink.msg.voicelivemessage.VoiceChangeRoomBg.VoiceRoomBgPicUpdateMessageOrBuilder
            public String getPicType() {
                return ((VoiceRoomBgPicUpdateMessage) ((GeneratedMessageLite.b) this).instance).getPicType();
            }

            @Override // com.p1.mobile.longlink.msg.voicelivemessage.VoiceChangeRoomBg.VoiceRoomBgPicUpdateMessageOrBuilder
            public ByteString getPicTypeBytes() {
                return ((VoiceRoomBgPicUpdateMessage) ((GeneratedMessageLite.b) this).instance).getPicTypeBytes();
            }

            @Override // com.p1.mobile.longlink.msg.voicelivemessage.VoiceChangeRoomBg.VoiceRoomBgPicUpdateMessageOrBuilder
            public String getRoomId() {
                return ((VoiceRoomBgPicUpdateMessage) ((GeneratedMessageLite.b) this).instance).getRoomId();
            }

            @Override // com.p1.mobile.longlink.msg.voicelivemessage.VoiceChangeRoomBg.VoiceRoomBgPicUpdateMessageOrBuilder
            public ByteString getRoomIdBytes() {
                return ((VoiceRoomBgPicUpdateMessage) ((GeneratedMessageLite.b) this).instance).getRoomIdBytes();
            }

            @Override // com.p1.mobile.longlink.msg.voicelivemessage.VoiceChangeRoomBg.VoiceRoomBgPicUpdateMessageOrBuilder
            public String getThumbnailUrl() {
                return ((VoiceRoomBgPicUpdateMessage) ((GeneratedMessageLite.b) this).instance).getThumbnailUrl();
            }

            @Override // com.p1.mobile.longlink.msg.voicelivemessage.VoiceChangeRoomBg.VoiceRoomBgPicUpdateMessageOrBuilder
            public ByteString getThumbnailUrlBytes() {
                return ((VoiceRoomBgPicUpdateMessage) ((GeneratedMessageLite.b) this).instance).getThumbnailUrlBytes();
            }

            @Override // com.p1.mobile.longlink.msg.voicelivemessage.VoiceChangeRoomBg.VoiceRoomBgPicUpdateMessageOrBuilder
            public String getUrl() {
                return ((VoiceRoomBgPicUpdateMessage) ((GeneratedMessageLite.b) this).instance).getUrl();
            }

            @Override // com.p1.mobile.longlink.msg.voicelivemessage.VoiceChangeRoomBg.VoiceRoomBgPicUpdateMessageOrBuilder
            public ByteString getUrlBytes() {
                return ((VoiceRoomBgPicUpdateMessage) ((GeneratedMessageLite.b) this).instance).getUrlBytes();
            }

            @Override // com.p1.mobile.longlink.msg.voicelivemessage.VoiceChangeRoomBg.VoiceRoomBgPicUpdateMessageOrBuilder
            public boolean hasCallPlaceResource() {
                return ((VoiceRoomBgPicUpdateMessage) ((GeneratedMessageLite.b) this).instance).hasCallPlaceResource();
            }

            public Builder mergeCallPlaceResource(VoiceRoomCallPlaceResource voiceRoomCallPlaceResource) {
                copyOnWrite();
                ((VoiceRoomBgPicUpdateMessage) ((GeneratedMessageLite.b) this).instance).mergeCallPlaceResource(voiceRoomCallPlaceResource);
                return this;
            }

            public Builder setAnchorId(String str) {
                copyOnWrite();
                ((VoiceRoomBgPicUpdateMessage) ((GeneratedMessageLite.b) this).instance).setAnchorId(str);
                return this;
            }

            public Builder setAnchorIdBytes(ByteString byteString) {
                copyOnWrite();
                ((VoiceRoomBgPicUpdateMessage) ((GeneratedMessageLite.b) this).instance).setAnchorIdBytes(byteString);
                return this;
            }

            public Builder setCallPlaceResource(VoiceRoomCallPlaceResource voiceRoomCallPlaceResource) {
                copyOnWrite();
                ((VoiceRoomBgPicUpdateMessage) ((GeneratedMessageLite.b) this).instance).setCallPlaceResource(voiceRoomCallPlaceResource);
                return this;
            }

            public Builder setLiveId(String str) {
                copyOnWrite();
                ((VoiceRoomBgPicUpdateMessage) ((GeneratedMessageLite.b) this).instance).setLiveId(str);
                return this;
            }

            public Builder setLiveIdBytes(ByteString byteString) {
                copyOnWrite();
                ((VoiceRoomBgPicUpdateMessage) ((GeneratedMessageLite.b) this).instance).setLiveIdBytes(byteString);
                return this;
            }

            public Builder setPicId(String str) {
                copyOnWrite();
                ((VoiceRoomBgPicUpdateMessage) ((GeneratedMessageLite.b) this).instance).setPicId(str);
                return this;
            }

            public Builder setPicIdBytes(ByteString byteString) {
                copyOnWrite();
                ((VoiceRoomBgPicUpdateMessage) ((GeneratedMessageLite.b) this).instance).setPicIdBytes(byteString);
                return this;
            }

            public Builder setPicName(String str) {
                copyOnWrite();
                ((VoiceRoomBgPicUpdateMessage) ((GeneratedMessageLite.b) this).instance).setPicName(str);
                return this;
            }

            public Builder setPicNameBytes(ByteString byteString) {
                copyOnWrite();
                ((VoiceRoomBgPicUpdateMessage) ((GeneratedMessageLite.b) this).instance).setPicNameBytes(byteString);
                return this;
            }

            public Builder setPicType(String str) {
                copyOnWrite();
                ((VoiceRoomBgPicUpdateMessage) ((GeneratedMessageLite.b) this).instance).setPicType(str);
                return this;
            }

            public Builder setPicTypeBytes(ByteString byteString) {
                copyOnWrite();
                ((VoiceRoomBgPicUpdateMessage) ((GeneratedMessageLite.b) this).instance).setPicTypeBytes(byteString);
                return this;
            }

            public Builder setRoomId(String str) {
                copyOnWrite();
                ((VoiceRoomBgPicUpdateMessage) ((GeneratedMessageLite.b) this).instance).setRoomId(str);
                return this;
            }

            public Builder setRoomIdBytes(ByteString byteString) {
                copyOnWrite();
                ((VoiceRoomBgPicUpdateMessage) ((GeneratedMessageLite.b) this).instance).setRoomIdBytes(byteString);
                return this;
            }

            public Builder setThumbnailUrl(String str) {
                copyOnWrite();
                ((VoiceRoomBgPicUpdateMessage) ((GeneratedMessageLite.b) this).instance).setThumbnailUrl(str);
                return this;
            }

            public Builder setThumbnailUrlBytes(ByteString byteString) {
                copyOnWrite();
                ((VoiceRoomBgPicUpdateMessage) ((GeneratedMessageLite.b) this).instance).setThumbnailUrlBytes(byteString);
                return this;
            }

            public Builder setUrl(String str) {
                copyOnWrite();
                ((VoiceRoomBgPicUpdateMessage) ((GeneratedMessageLite.b) this).instance).setUrl(str);
                return this;
            }

            public Builder setUrlBytes(ByteString byteString) {
                copyOnWrite();
                ((VoiceRoomBgPicUpdateMessage) ((GeneratedMessageLite.b) this).instance).setUrlBytes(byteString);
                return this;
            }

            public Builder setCallPlaceResource(VoiceRoomCallPlaceResource.Builder builder) {
                copyOnWrite();
                ((VoiceRoomBgPicUpdateMessage) ((GeneratedMessageLite.b) this).instance).setCallPlaceResource(builder);
                return this;
            }
        }

        public static VoiceRoomBgPicUpdateMessage parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (VoiceRoomBgPicUpdateMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static VoiceRoomBgPicUpdateMessage parseFrom(byte[] bArr, h hVar) throws InvalidProtocolBufferException {
            return (VoiceRoomBgPicUpdateMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, hVar);
        }

        public static VoiceRoomBgPicUpdateMessage parseFrom(InputStream inputStream) throws IOException {
            return (VoiceRoomBgPicUpdateMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static VoiceRoomBgPicUpdateMessage parseFrom(InputStream inputStream, h hVar) throws IOException {
            return (VoiceRoomBgPicUpdateMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, hVar);
        }

        public static VoiceRoomBgPicUpdateMessage parseFrom(e eVar) throws IOException {
            return (VoiceRoomBgPicUpdateMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, eVar);
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.toBuilder();
        }

        public static VoiceRoomBgPicUpdateMessage parseFrom(e eVar, h hVar) throws IOException {
            return (VoiceRoomBgPicUpdateMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, eVar, hVar);
        }
    }

    public static final class VoiceRoomCallPlaceResource extends GeneratedMessageLite<VoiceRoomCallPlaceResource, Builder> implements VoiceRoomCallPlaceResourceOrBuilder {
        public static final int ADDURL_FIELD_NUMBER = 2;
        public static final int BGURL_FIELD_NUMBER = 1;
        public static final int BOSSURL_FIELD_NUMBER = 3;
        private static final VoiceRoomCallPlaceResource DEFAULT_INSTANCE;
        public static final int INDEXCOLOR_FIELD_NUMBER = 4;
        private static volatile i860<VoiceRoomCallPlaceResource> PARSER;
        private String bgUrl_ = "";
        private String addUrl_ = "";
        private String bossUrl_ = "";
        private String indexColor_ = "";

        public static final class Builder extends GeneratedMessageLite.b<VoiceRoomCallPlaceResource, Builder> implements VoiceRoomCallPlaceResourceOrBuilder {
            private Builder() {
                super(VoiceRoomCallPlaceResource.DEFAULT_INSTANCE);
            }

            public Builder clearAddUrl() {
                copyOnWrite();
                ((VoiceRoomCallPlaceResource) ((GeneratedMessageLite.b) this).instance).clearAddUrl();
                return this;
            }

            public Builder clearBgUrl() {
                copyOnWrite();
                ((VoiceRoomCallPlaceResource) ((GeneratedMessageLite.b) this).instance).clearBgUrl();
                return this;
            }

            public Builder clearBossUrl() {
                copyOnWrite();
                ((VoiceRoomCallPlaceResource) ((GeneratedMessageLite.b) this).instance).clearBossUrl();
                return this;
            }

            public Builder clearIndexColor() {
                copyOnWrite();
                ((VoiceRoomCallPlaceResource) ((GeneratedMessageLite.b) this).instance).clearIndexColor();
                return this;
            }

            @Override // com.p1.mobile.longlink.msg.voicelivemessage.VoiceChangeRoomBg.VoiceRoomCallPlaceResourceOrBuilder
            public String getAddUrl() {
                return ((VoiceRoomCallPlaceResource) ((GeneratedMessageLite.b) this).instance).getAddUrl();
            }

            @Override // com.p1.mobile.longlink.msg.voicelivemessage.VoiceChangeRoomBg.VoiceRoomCallPlaceResourceOrBuilder
            public ByteString getAddUrlBytes() {
                return ((VoiceRoomCallPlaceResource) ((GeneratedMessageLite.b) this).instance).getAddUrlBytes();
            }

            @Override // com.p1.mobile.longlink.msg.voicelivemessage.VoiceChangeRoomBg.VoiceRoomCallPlaceResourceOrBuilder
            public String getBgUrl() {
                return ((VoiceRoomCallPlaceResource) ((GeneratedMessageLite.b) this).instance).getBgUrl();
            }

            @Override // com.p1.mobile.longlink.msg.voicelivemessage.VoiceChangeRoomBg.VoiceRoomCallPlaceResourceOrBuilder
            public ByteString getBgUrlBytes() {
                return ((VoiceRoomCallPlaceResource) ((GeneratedMessageLite.b) this).instance).getBgUrlBytes();
            }

            @Override // com.p1.mobile.longlink.msg.voicelivemessage.VoiceChangeRoomBg.VoiceRoomCallPlaceResourceOrBuilder
            public String getBossUrl() {
                return ((VoiceRoomCallPlaceResource) ((GeneratedMessageLite.b) this).instance).getBossUrl();
            }

            @Override // com.p1.mobile.longlink.msg.voicelivemessage.VoiceChangeRoomBg.VoiceRoomCallPlaceResourceOrBuilder
            public ByteString getBossUrlBytes() {
                return ((VoiceRoomCallPlaceResource) ((GeneratedMessageLite.b) this).instance).getBossUrlBytes();
            }

            @Override // com.p1.mobile.longlink.msg.voicelivemessage.VoiceChangeRoomBg.VoiceRoomCallPlaceResourceOrBuilder
            public String getIndexColor() {
                return ((VoiceRoomCallPlaceResource) ((GeneratedMessageLite.b) this).instance).getIndexColor();
            }

            @Override // com.p1.mobile.longlink.msg.voicelivemessage.VoiceChangeRoomBg.VoiceRoomCallPlaceResourceOrBuilder
            public ByteString getIndexColorBytes() {
                return ((VoiceRoomCallPlaceResource) ((GeneratedMessageLite.b) this).instance).getIndexColorBytes();
            }

            public Builder setAddUrl(String str) {
                copyOnWrite();
                ((VoiceRoomCallPlaceResource) ((GeneratedMessageLite.b) this).instance).setAddUrl(str);
                return this;
            }

            public Builder setAddUrlBytes(ByteString byteString) {
                copyOnWrite();
                ((VoiceRoomCallPlaceResource) ((GeneratedMessageLite.b) this).instance).setAddUrlBytes(byteString);
                return this;
            }

            public Builder setBgUrl(String str) {
                copyOnWrite();
                ((VoiceRoomCallPlaceResource) ((GeneratedMessageLite.b) this).instance).setBgUrl(str);
                return this;
            }

            public Builder setBgUrlBytes(ByteString byteString) {
                copyOnWrite();
                ((VoiceRoomCallPlaceResource) ((GeneratedMessageLite.b) this).instance).setBgUrlBytes(byteString);
                return this;
            }

            public Builder setBossUrl(String str) {
                copyOnWrite();
                ((VoiceRoomCallPlaceResource) ((GeneratedMessageLite.b) this).instance).setBossUrl(str);
                return this;
            }

            public Builder setBossUrlBytes(ByteString byteString) {
                copyOnWrite();
                ((VoiceRoomCallPlaceResource) ((GeneratedMessageLite.b) this).instance).setBossUrlBytes(byteString);
                return this;
            }

            public Builder setIndexColor(String str) {
                copyOnWrite();
                ((VoiceRoomCallPlaceResource) ((GeneratedMessageLite.b) this).instance).setIndexColor(str);
                return this;
            }

            public Builder setIndexColorBytes(ByteString byteString) {
                copyOnWrite();
                ((VoiceRoomCallPlaceResource) ((GeneratedMessageLite.b) this).instance).setIndexColorBytes(byteString);
                return this;
            }
        }

        static {
            VoiceRoomCallPlaceResource voiceRoomCallPlaceResource = new VoiceRoomCallPlaceResource();
            DEFAULT_INSTANCE = voiceRoomCallPlaceResource;
            voiceRoomCallPlaceResource.makeImmutable();
        }

        private VoiceRoomCallPlaceResource() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAddUrl() {
            this.addUrl_ = getDefaultInstance().getAddUrl();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearBgUrl() {
            this.bgUrl_ = getDefaultInstance().getBgUrl();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearBossUrl() {
            this.bossUrl_ = getDefaultInstance().getBossUrl();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearIndexColor() {
            this.indexColor_ = getDefaultInstance().getIndexColor();
        }

        public static VoiceRoomCallPlaceResource getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder(VoiceRoomCallPlaceResource voiceRoomCallPlaceResource) {
            return (Builder) ((Builder) DEFAULT_INSTANCE.toBuilder()).mergeFrom(voiceRoomCallPlaceResource);
        }

        public static VoiceRoomCallPlaceResource parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (VoiceRoomCallPlaceResource) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static VoiceRoomCallPlaceResource parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (VoiceRoomCallPlaceResource) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static i860<VoiceRoomCallPlaceResource> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAddUrl(String str) {
            str.getClass();
            this.addUrl_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAddUrlBytes(ByteString byteString) {
            byteString.getClass();
            a.checkByteStringIsUtf8(byteString);
            this.addUrl_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setBgUrl(String str) {
            str.getClass();
            this.bgUrl_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setBgUrlBytes(ByteString byteString) {
            byteString.getClass();
            a.checkByteStringIsUtf8(byteString);
            this.bgUrl_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setBossUrl(String str) {
            str.getClass();
            this.bossUrl_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setBossUrlBytes(ByteString byteString) {
            byteString.getClass();
            a.checkByteStringIsUtf8(byteString);
            this.bossUrl_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setIndexColor(String str) {
            str.getClass();
            this.indexColor_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setIndexColorBytes(ByteString byteString) {
            byteString.getClass();
            a.checkByteStringIsUtf8(byteString);
            this.indexColor_ = byteString.toStringUtf8();
        }

        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (C04711.f1701xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new VoiceRoomCallPlaceResource();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                    return null;
                case 4:
                    return new Builder();
                case 5:
                    GeneratedMessageLite.h hVar = (GeneratedMessageLite.h) obj;
                    VoiceRoomCallPlaceResource voiceRoomCallPlaceResource = (VoiceRoomCallPlaceResource) obj2;
                    this.bgUrl_ = hVar.f(!this.bgUrl_.isEmpty(), this.bgUrl_, !voiceRoomCallPlaceResource.bgUrl_.isEmpty(), voiceRoomCallPlaceResource.bgUrl_);
                    this.addUrl_ = hVar.f(!this.addUrl_.isEmpty(), this.addUrl_, !voiceRoomCallPlaceResource.addUrl_.isEmpty(), voiceRoomCallPlaceResource.addUrl_);
                    this.bossUrl_ = hVar.f(!this.bossUrl_.isEmpty(), this.bossUrl_, !voiceRoomCallPlaceResource.bossUrl_.isEmpty(), voiceRoomCallPlaceResource.bossUrl_);
                    this.indexColor_ = hVar.f(!this.indexColor_.isEmpty(), this.indexColor_, true ^ voiceRoomCallPlaceResource.indexColor_.isEmpty(), voiceRoomCallPlaceResource.indexColor_);
                    GeneratedMessageLite.g gVar = GeneratedMessageLite.g.INSTANCE;
                    return this;
                case 6:
                    e eVar = (e) obj;
                    boolean z = false;
                    while (!z) {
                        try {
                            int iM = eVar.M();
                            if (iM != 0) {
                                if (iM == 10) {
                                    this.bgUrl_ = eVar.L();
                                } else if (iM == 18) {
                                    this.addUrl_ = eVar.L();
                                } else if (iM == 26) {
                                    this.bossUrl_ = eVar.L();
                                } else if (iM == 34) {
                                    this.indexColor_ = eVar.L();
                                } else if (!eVar.R(iM)) {
                                }
                            }
                            z = true;
                        } catch (IOException e) {
                            aag0.a(new InvalidProtocolBufferException(e.getMessage()).setUnfinishedMessage(this));
                            return null;
                        } catch (InvalidProtocolBufferException e2) {
                            aag0.a(e2.setUnfinishedMessage(this));
                            return null;
                        }
                    }
                    break;
                case 7:
                    break;
                case 8:
                    if (PARSER == null) {
                        synchronized (VoiceRoomCallPlaceResource.class) {
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

        @Override // com.p1.mobile.longlink.msg.voicelivemessage.VoiceChangeRoomBg.VoiceRoomCallPlaceResourceOrBuilder
        public String getAddUrl() {
            return this.addUrl_;
        }

        @Override // com.p1.mobile.longlink.msg.voicelivemessage.VoiceChangeRoomBg.VoiceRoomCallPlaceResourceOrBuilder
        public ByteString getAddUrlBytes() {
            return ByteString.copyFromUtf8(this.addUrl_);
        }

        @Override // com.p1.mobile.longlink.msg.voicelivemessage.VoiceChangeRoomBg.VoiceRoomCallPlaceResourceOrBuilder
        public String getBgUrl() {
            return this.bgUrl_;
        }

        @Override // com.p1.mobile.longlink.msg.voicelivemessage.VoiceChangeRoomBg.VoiceRoomCallPlaceResourceOrBuilder
        public ByteString getBgUrlBytes() {
            return ByteString.copyFromUtf8(this.bgUrl_);
        }

        @Override // com.p1.mobile.longlink.msg.voicelivemessage.VoiceChangeRoomBg.VoiceRoomCallPlaceResourceOrBuilder
        public String getBossUrl() {
            return this.bossUrl_;
        }

        @Override // com.p1.mobile.longlink.msg.voicelivemessage.VoiceChangeRoomBg.VoiceRoomCallPlaceResourceOrBuilder
        public ByteString getBossUrlBytes() {
            return ByteString.copyFromUtf8(this.bossUrl_);
        }

        @Override // com.p1.mobile.longlink.msg.voicelivemessage.VoiceChangeRoomBg.VoiceRoomCallPlaceResourceOrBuilder
        public String getIndexColor() {
            return this.indexColor_;
        }

        @Override // com.p1.mobile.longlink.msg.voicelivemessage.VoiceChangeRoomBg.VoiceRoomCallPlaceResourceOrBuilder
        public ByteString getIndexColorBytes() {
            return ByteString.copyFromUtf8(this.indexColor_);
        }

        public int getSerializedSize() {
            int i = ((GeneratedMessageLite) this).memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int iK = !this.bgUrl_.isEmpty() ? CodedOutputStream.K(1, getBgUrl()) : 0;
            if (!this.addUrl_.isEmpty()) {
                iK += CodedOutputStream.K(2, getAddUrl());
            }
            if (!this.bossUrl_.isEmpty()) {
                iK += CodedOutputStream.K(3, getBossUrl());
            }
            if (!this.indexColor_.isEmpty()) {
                iK += CodedOutputStream.K(4, getIndexColor());
            }
            ((GeneratedMessageLite) this).memoizedSerializedSize = iK;
            return iK;
        }

        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (!this.bgUrl_.isEmpty()) {
                codedOutputStream.D0(1, getBgUrl());
            }
            if (!this.addUrl_.isEmpty()) {
                codedOutputStream.D0(2, getAddUrl());
            }
            if (!this.bossUrl_.isEmpty()) {
                codedOutputStream.D0(3, getBossUrl());
            }
            if (this.indexColor_.isEmpty()) {
                return;
            }
            codedOutputStream.D0(4, getIndexColor());
        }

        public static VoiceRoomCallPlaceResource parseDelimitedFrom(InputStream inputStream, h hVar) throws IOException {
            return (VoiceRoomCallPlaceResource) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, hVar);
        }

        public static VoiceRoomCallPlaceResource parseFrom(ByteString byteString, h hVar) throws InvalidProtocolBufferException {
            return (VoiceRoomCallPlaceResource) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, hVar);
        }

        public static VoiceRoomCallPlaceResource parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (VoiceRoomCallPlaceResource) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static VoiceRoomCallPlaceResource parseFrom(byte[] bArr, h hVar) throws InvalidProtocolBufferException {
            return (VoiceRoomCallPlaceResource) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, hVar);
        }

        public static VoiceRoomCallPlaceResource parseFrom(InputStream inputStream) throws IOException {
            return (VoiceRoomCallPlaceResource) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static VoiceRoomCallPlaceResource parseFrom(InputStream inputStream, h hVar) throws IOException {
            return (VoiceRoomCallPlaceResource) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, hVar);
        }

        public static VoiceRoomCallPlaceResource parseFrom(e eVar) throws IOException {
            return (VoiceRoomCallPlaceResource) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, eVar);
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.toBuilder();
        }

        public static VoiceRoomCallPlaceResource parseFrom(e eVar, h hVar) throws IOException {
            return (VoiceRoomCallPlaceResource) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, eVar, hVar);
        }
    }
}
