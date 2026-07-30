package com.p046p1.mobile.longlink.msg.voicelivecampaign;

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
public final class VoiceNewCampaignPopUp {

    /* JADX INFO: renamed from: com.p1.mobile.longlink.msg.voicelivecampaign.VoiceNewCampaignPopUp$1 */
    public static /* synthetic */ class C45581 {

        /* JADX INFO: renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f16001xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f16001xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f16001xa1df5c61[GeneratedMessageLite.MethodToInvoke.IS_INITIALIZED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f16001xa1df5c61[GeneratedMessageLite.MethodToInvoke.MAKE_IMMUTABLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f16001xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f16001xa1df5c61[GeneratedMessageLite.MethodToInvoke.VISIT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f16001xa1df5c61[GeneratedMessageLite.MethodToInvoke.MERGE_FROM_STREAM.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f16001xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f16001xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    public interface VoiceLivePopUpOrBuilder extends o6z {
        String getCampaignId();

        ByteString getCampaignIdBytes();

        @Override // p149l.o6z
        /* synthetic */ InterfaceC3419q getDefaultInstanceForType();

        String getRoomId();

        ByteString getRoomIdBytes();

        @Override // p149l.o6z
        /* synthetic */ boolean isInitialized();
    }

    private VoiceNewCampaignPopUp() {
    }

    public static void registerAllExtensions(C3410h c3410h) {
    }

    public static final class VoiceLivePopUp extends GeneratedMessageLite<VoiceLivePopUp, Builder> implements VoiceLivePopUpOrBuilder {
        public static final int CAMPAIGNID_FIELD_NUMBER = 1;
        private static final VoiceLivePopUp DEFAULT_INSTANCE;
        private static volatile i860<VoiceLivePopUp> PARSER = null;
        public static final int ROOMID_FIELD_NUMBER = 2;
        private String campaignId_ = "";
        private String roomId_ = "";

        public static final class Builder extends GeneratedMessageLite.AbstractC3380b<VoiceLivePopUp, Builder> implements VoiceLivePopUpOrBuilder {
            private Builder() {
                super(VoiceLivePopUp.DEFAULT_INSTANCE);
            }

            public Builder clearCampaignId() {
                copyOnWrite();
                ((VoiceLivePopUp) this.instance).clearCampaignId();
                return this;
            }

            public Builder clearRoomId() {
                copyOnWrite();
                ((VoiceLivePopUp) this.instance).clearRoomId();
                return this;
            }

            @Override // com.p1.mobile.longlink.msg.voicelivecampaign.VoiceNewCampaignPopUp.VoiceLivePopUpOrBuilder
            public String getCampaignId() {
                return ((VoiceLivePopUp) this.instance).getCampaignId();
            }

            @Override // com.p1.mobile.longlink.msg.voicelivecampaign.VoiceNewCampaignPopUp.VoiceLivePopUpOrBuilder
            public ByteString getCampaignIdBytes() {
                return ((VoiceLivePopUp) this.instance).getCampaignIdBytes();
            }

            @Override // com.p1.mobile.longlink.msg.voicelivecampaign.VoiceNewCampaignPopUp.VoiceLivePopUpOrBuilder
            public String getRoomId() {
                return ((VoiceLivePopUp) this.instance).getRoomId();
            }

            @Override // com.p1.mobile.longlink.msg.voicelivecampaign.VoiceNewCampaignPopUp.VoiceLivePopUpOrBuilder
            public ByteString getRoomIdBytes() {
                return ((VoiceLivePopUp) this.instance).getRoomIdBytes();
            }

            public Builder setCampaignId(String str) {
                copyOnWrite();
                ((VoiceLivePopUp) this.instance).setCampaignId(str);
                return this;
            }

            public Builder setCampaignIdBytes(ByteString byteString) {
                copyOnWrite();
                ((VoiceLivePopUp) this.instance).setCampaignIdBytes(byteString);
                return this;
            }

            public Builder setRoomId(String str) {
                copyOnWrite();
                ((VoiceLivePopUp) this.instance).setRoomId(str);
                return this;
            }

            public Builder setRoomIdBytes(ByteString byteString) {
                copyOnWrite();
                ((VoiceLivePopUp) this.instance).setRoomIdBytes(byteString);
                return this;
            }
        }

        static {
            VoiceLivePopUp voiceLivePopUp = new VoiceLivePopUp();
            DEFAULT_INSTANCE = voiceLivePopUp;
            voiceLivePopUp.makeImmutable();
        }

        private VoiceLivePopUp() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearCampaignId() {
            this.campaignId_ = getDefaultInstance().getCampaignId();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearRoomId() {
            this.roomId_ = getDefaultInstance().getRoomId();
        }

        public static VoiceLivePopUp getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder(VoiceLivePopUp voiceLivePopUp) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(voiceLivePopUp);
        }

        public static VoiceLivePopUp parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (VoiceLivePopUp) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static VoiceLivePopUp parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (VoiceLivePopUp) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static i860<VoiceLivePopUp> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setCampaignId(String str) {
            str.getClass();
            this.campaignId_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setCampaignIdBytes(ByteString byteString) {
            byteString.getClass();
            AbstractC3403a.checkByteStringIsUtf8(byteString);
            this.campaignId_ = byteString.toStringUtf8();
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

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (C45581.f16001xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new VoiceLivePopUp();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                    return null;
                case 4:
                    return new Builder();
                case 5:
                    GeneratedMessageLite.InterfaceC3386h interfaceC3386h = (GeneratedMessageLite.InterfaceC3386h) obj;
                    VoiceLivePopUp voiceLivePopUp = (VoiceLivePopUp) obj2;
                    this.campaignId_ = interfaceC3386h.mo16997f(!this.campaignId_.isEmpty(), this.campaignId_, !voiceLivePopUp.campaignId_.isEmpty(), voiceLivePopUp.campaignId_);
                    this.roomId_ = interfaceC3386h.mo16997f(!this.roomId_.isEmpty(), this.roomId_, true ^ voiceLivePopUp.roomId_.isEmpty(), voiceLivePopUp.roomId_);
                    GeneratedMessageLite.C3385g c3385g = GeneratedMessageLite.C3385g.INSTANCE;
                    return this;
                case 6:
                    C3407e c3407e = (C3407e) obj;
                    boolean z = false;
                    while (!z) {
                        try {
                            int iM17116M = c3407e.m17116M();
                            if (iM17116M != 0) {
                                if (iM17116M == 10) {
                                    this.campaignId_ = c3407e.m17115L();
                                } else if (iM17116M == 18) {
                                    this.roomId_ = c3407e.m17115L();
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
                        synchronized (VoiceLivePopUp.class) {
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

        @Override // com.p1.mobile.longlink.msg.voicelivecampaign.VoiceNewCampaignPopUp.VoiceLivePopUpOrBuilder
        public String getCampaignId() {
            return this.campaignId_;
        }

        @Override // com.p1.mobile.longlink.msg.voicelivecampaign.VoiceNewCampaignPopUp.VoiceLivePopUpOrBuilder
        public ByteString getCampaignIdBytes() {
            return ByteString.copyFromUtf8(this.campaignId_);
        }

        @Override // com.p1.mobile.longlink.msg.voicelivecampaign.VoiceNewCampaignPopUp.VoiceLivePopUpOrBuilder
        public String getRoomId() {
            return this.roomId_;
        }

        @Override // com.p1.mobile.longlink.msg.voicelivecampaign.VoiceNewCampaignPopUp.VoiceLivePopUpOrBuilder
        public ByteString getRoomIdBytes() {
            return ByteString.copyFromUtf8(this.roomId_);
        }

        @Override // com.google.protobuf.InterfaceC3419q
        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int iM16901K = !this.campaignId_.isEmpty() ? CodedOutputStream.m16901K(1, getCampaignId()) : 0;
            if (!this.roomId_.isEmpty()) {
                iM16901K += CodedOutputStream.m16901K(2, getRoomId());
            }
            this.memoizedSerializedSize = iM16901K;
            return iM16901K;
        }

        @Override // com.google.protobuf.InterfaceC3419q
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (!this.campaignId_.isEmpty()) {
                codedOutputStream.mo16939D0(1, getCampaignId());
            }
            if (this.roomId_.isEmpty()) {
                return;
            }
            codedOutputStream.mo16939D0(2, getRoomId());
        }

        public static VoiceLivePopUp parseDelimitedFrom(InputStream inputStream, C3410h c3410h) throws IOException {
            return (VoiceLivePopUp) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, c3410h);
        }

        public static VoiceLivePopUp parseFrom(ByteString byteString, C3410h c3410h) throws InvalidProtocolBufferException {
            return (VoiceLivePopUp) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, c3410h);
        }

        public static VoiceLivePopUp parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (VoiceLivePopUp) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static VoiceLivePopUp parseFrom(byte[] bArr, C3410h c3410h) throws InvalidProtocolBufferException {
            return (VoiceLivePopUp) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, c3410h);
        }

        public static VoiceLivePopUp parseFrom(InputStream inputStream) throws IOException {
            return (VoiceLivePopUp) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static VoiceLivePopUp parseFrom(InputStream inputStream, C3410h c3410h) throws IOException {
            return (VoiceLivePopUp) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, c3410h);
        }

        public static VoiceLivePopUp parseFrom(C3407e c3407e) throws IOException {
            return (VoiceLivePopUp) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, c3407e);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static VoiceLivePopUp parseFrom(C3407e c3407e, C3410h c3410h) throws IOException {
            return (VoiceLivePopUp) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, c3407e, c3410h);
        }
    }
}
