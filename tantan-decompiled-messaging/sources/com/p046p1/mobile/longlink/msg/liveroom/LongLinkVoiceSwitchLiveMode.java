package com.p046p1.mobile.longlink.msg.liveroom;

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
public final class LongLinkVoiceSwitchLiveMode {

    /* JADX INFO: renamed from: com.p1.mobile.longlink.msg.liveroom.LongLinkVoiceSwitchLiveMode$1 */
    public static /* synthetic */ class C45301 {

        /* JADX INFO: renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f15986xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f15986xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f15986xa1df5c61[GeneratedMessageLite.MethodToInvoke.IS_INITIALIZED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f15986xa1df5c61[GeneratedMessageLite.MethodToInvoke.MAKE_IMMUTABLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f15986xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f15986xa1df5c61[GeneratedMessageLite.MethodToInvoke.VISIT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f15986xa1df5c61[GeneratedMessageLite.MethodToInvoke.MERGE_FROM_STREAM.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f15986xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f15986xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    public interface VoiceLiveModeMessageOrBuilder extends o6z {
        @Override // p149l.o6z
        /* synthetic */ InterfaceC3419q getDefaultInstanceForType();

        String getLiveId();

        ByteString getLiveIdBytes();

        String getLiveMode();

        ByteString getLiveModeBytes();

        String getRoomId();

        ByteString getRoomIdBytes();

        @Override // p149l.o6z
        /* synthetic */ boolean isInitialized();
    }

    private LongLinkVoiceSwitchLiveMode() {
    }

    public static void registerAllExtensions(C3410h c3410h) {
    }

    public static final class VoiceLiveModeMessage extends GeneratedMessageLite<VoiceLiveModeMessage, Builder> implements VoiceLiveModeMessageOrBuilder {
        private static final VoiceLiveModeMessage DEFAULT_INSTANCE;
        public static final int LIVEID_FIELD_NUMBER = 2;
        public static final int LIVEMODE_FIELD_NUMBER = 3;
        private static volatile i860<VoiceLiveModeMessage> PARSER = null;
        public static final int ROOMID_FIELD_NUMBER = 1;
        private String roomId_ = "";
        private String liveId_ = "";
        private String liveMode_ = "";

        public static final class Builder extends GeneratedMessageLite.AbstractC3380b<VoiceLiveModeMessage, Builder> implements VoiceLiveModeMessageOrBuilder {
            private Builder() {
                super(VoiceLiveModeMessage.DEFAULT_INSTANCE);
            }

            public Builder clearLiveId() {
                copyOnWrite();
                ((VoiceLiveModeMessage) this.instance).clearLiveId();
                return this;
            }

            public Builder clearLiveMode() {
                copyOnWrite();
                ((VoiceLiveModeMessage) this.instance).clearLiveMode();
                return this;
            }

            public Builder clearRoomId() {
                copyOnWrite();
                ((VoiceLiveModeMessage) this.instance).clearRoomId();
                return this;
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVoiceSwitchLiveMode.VoiceLiveModeMessageOrBuilder
            public String getLiveId() {
                return ((VoiceLiveModeMessage) this.instance).getLiveId();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVoiceSwitchLiveMode.VoiceLiveModeMessageOrBuilder
            public ByteString getLiveIdBytes() {
                return ((VoiceLiveModeMessage) this.instance).getLiveIdBytes();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVoiceSwitchLiveMode.VoiceLiveModeMessageOrBuilder
            public String getLiveMode() {
                return ((VoiceLiveModeMessage) this.instance).getLiveMode();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVoiceSwitchLiveMode.VoiceLiveModeMessageOrBuilder
            public ByteString getLiveModeBytes() {
                return ((VoiceLiveModeMessage) this.instance).getLiveModeBytes();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVoiceSwitchLiveMode.VoiceLiveModeMessageOrBuilder
            public String getRoomId() {
                return ((VoiceLiveModeMessage) this.instance).getRoomId();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVoiceSwitchLiveMode.VoiceLiveModeMessageOrBuilder
            public ByteString getRoomIdBytes() {
                return ((VoiceLiveModeMessage) this.instance).getRoomIdBytes();
            }

            public Builder setLiveId(String str) {
                copyOnWrite();
                ((VoiceLiveModeMessage) this.instance).setLiveId(str);
                return this;
            }

            public Builder setLiveIdBytes(ByteString byteString) {
                copyOnWrite();
                ((VoiceLiveModeMessage) this.instance).setLiveIdBytes(byteString);
                return this;
            }

            public Builder setLiveMode(String str) {
                copyOnWrite();
                ((VoiceLiveModeMessage) this.instance).setLiveMode(str);
                return this;
            }

            public Builder setLiveModeBytes(ByteString byteString) {
                copyOnWrite();
                ((VoiceLiveModeMessage) this.instance).setLiveModeBytes(byteString);
                return this;
            }

            public Builder setRoomId(String str) {
                copyOnWrite();
                ((VoiceLiveModeMessage) this.instance).setRoomId(str);
                return this;
            }

            public Builder setRoomIdBytes(ByteString byteString) {
                copyOnWrite();
                ((VoiceLiveModeMessage) this.instance).setRoomIdBytes(byteString);
                return this;
            }
        }

        static {
            VoiceLiveModeMessage voiceLiveModeMessage = new VoiceLiveModeMessage();
            DEFAULT_INSTANCE = voiceLiveModeMessage;
            voiceLiveModeMessage.makeImmutable();
        }

        private VoiceLiveModeMessage() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearLiveId() {
            this.liveId_ = getDefaultInstance().getLiveId();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearLiveMode() {
            this.liveMode_ = getDefaultInstance().getLiveMode();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearRoomId() {
            this.roomId_ = getDefaultInstance().getRoomId();
        }

        public static VoiceLiveModeMessage getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder(VoiceLiveModeMessage voiceLiveModeMessage) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(voiceLiveModeMessage);
        }

        public static VoiceLiveModeMessage parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (VoiceLiveModeMessage) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static VoiceLiveModeMessage parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (VoiceLiveModeMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static i860<VoiceLiveModeMessage> parser() {
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
            AbstractC3403a.checkByteStringIsUtf8(byteString);
            this.liveId_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setLiveMode(String str) {
            str.getClass();
            this.liveMode_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setLiveModeBytes(ByteString byteString) {
            byteString.getClass();
            AbstractC3403a.checkByteStringIsUtf8(byteString);
            this.liveMode_ = byteString.toStringUtf8();
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
            switch (C45301.f15986xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new VoiceLiveModeMessage();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                    return null;
                case 4:
                    return new Builder();
                case 5:
                    GeneratedMessageLite.InterfaceC3386h interfaceC3386h = (GeneratedMessageLite.InterfaceC3386h) obj;
                    VoiceLiveModeMessage voiceLiveModeMessage = (VoiceLiveModeMessage) obj2;
                    this.roomId_ = interfaceC3386h.mo16997f(!this.roomId_.isEmpty(), this.roomId_, !voiceLiveModeMessage.roomId_.isEmpty(), voiceLiveModeMessage.roomId_);
                    this.liveId_ = interfaceC3386h.mo16997f(!this.liveId_.isEmpty(), this.liveId_, !voiceLiveModeMessage.liveId_.isEmpty(), voiceLiveModeMessage.liveId_);
                    this.liveMode_ = interfaceC3386h.mo16997f(!this.liveMode_.isEmpty(), this.liveMode_, true ^ voiceLiveModeMessage.liveMode_.isEmpty(), voiceLiveModeMessage.liveMode_);
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
                                    this.roomId_ = c3407e.m17115L();
                                } else if (iM17116M == 18) {
                                    this.liveId_ = c3407e.m17115L();
                                } else if (iM17116M == 26) {
                                    this.liveMode_ = c3407e.m17115L();
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
                        synchronized (VoiceLiveModeMessage.class) {
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

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVoiceSwitchLiveMode.VoiceLiveModeMessageOrBuilder
        public String getLiveId() {
            return this.liveId_;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVoiceSwitchLiveMode.VoiceLiveModeMessageOrBuilder
        public ByteString getLiveIdBytes() {
            return ByteString.copyFromUtf8(this.liveId_);
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVoiceSwitchLiveMode.VoiceLiveModeMessageOrBuilder
        public String getLiveMode() {
            return this.liveMode_;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVoiceSwitchLiveMode.VoiceLiveModeMessageOrBuilder
        public ByteString getLiveModeBytes() {
            return ByteString.copyFromUtf8(this.liveMode_);
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVoiceSwitchLiveMode.VoiceLiveModeMessageOrBuilder
        public String getRoomId() {
            return this.roomId_;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVoiceSwitchLiveMode.VoiceLiveModeMessageOrBuilder
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
            if (!this.liveMode_.isEmpty()) {
                iM16901K += CodedOutputStream.m16901K(3, getLiveMode());
            }
            this.memoizedSerializedSize = iM16901K;
            return iM16901K;
        }

        @Override // com.google.protobuf.InterfaceC3419q
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (!this.roomId_.isEmpty()) {
                codedOutputStream.mo16939D0(1, getRoomId());
            }
            if (!this.liveId_.isEmpty()) {
                codedOutputStream.mo16939D0(2, getLiveId());
            }
            if (this.liveMode_.isEmpty()) {
                return;
            }
            codedOutputStream.mo16939D0(3, getLiveMode());
        }

        public static VoiceLiveModeMessage parseDelimitedFrom(InputStream inputStream, C3410h c3410h) throws IOException {
            return (VoiceLiveModeMessage) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, c3410h);
        }

        public static VoiceLiveModeMessage parseFrom(ByteString byteString, C3410h c3410h) throws InvalidProtocolBufferException {
            return (VoiceLiveModeMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, c3410h);
        }

        public static VoiceLiveModeMessage parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (VoiceLiveModeMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static VoiceLiveModeMessage parseFrom(byte[] bArr, C3410h c3410h) throws InvalidProtocolBufferException {
            return (VoiceLiveModeMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, c3410h);
        }

        public static VoiceLiveModeMessage parseFrom(InputStream inputStream) throws IOException {
            return (VoiceLiveModeMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static VoiceLiveModeMessage parseFrom(InputStream inputStream, C3410h c3410h) throws IOException {
            return (VoiceLiveModeMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, c3410h);
        }

        public static VoiceLiveModeMessage parseFrom(C3407e c3407e) throws IOException {
            return (VoiceLiveModeMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, c3407e);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static VoiceLiveModeMessage parseFrom(C3407e c3407e, C3410h c3410h) throws IOException {
            return (VoiceLiveModeMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, c3407e, c3410h);
        }
    }
}
