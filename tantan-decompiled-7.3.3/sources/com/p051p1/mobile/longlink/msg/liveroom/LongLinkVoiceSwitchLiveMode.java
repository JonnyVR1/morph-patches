package com.p051p1.mobile.longlink.msg.liveroom;

import com.google.protobuf.AbstractC3426a;
import com.google.protobuf.ByteString;
import com.google.protobuf.C3430e;
import com.google.protobuf.C3433h;
import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InterfaceC3442q;
import com.google.protobuf.InvalidProtocolBufferException;
import java.io.IOException;
import java.io.InputStream;
import p153l.iig0;
import p153l.l710;
import p153l.lfz;
import p153l.ng60;

/* JADX INFO: loaded from: classes8.dex */
public final class LongLinkVoiceSwitchLiveMode {

    /* JADX INFO: renamed from: com.p1.mobile.longlink.msg.liveroom.LongLinkVoiceSwitchLiveMode$1 */
    public static /* synthetic */ class C46811 {

        /* JADX INFO: renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f16705xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f16705xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f16705xa1df5c61[GeneratedMessageLite.MethodToInvoke.IS_INITIALIZED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f16705xa1df5c61[GeneratedMessageLite.MethodToInvoke.MAKE_IMMUTABLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f16705xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f16705xa1df5c61[GeneratedMessageLite.MethodToInvoke.VISIT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f16705xa1df5c61[GeneratedMessageLite.MethodToInvoke.MERGE_FROM_STREAM.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f16705xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f16705xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    public interface VoiceLiveModeMessageOrBuilder extends lfz {
        @Override // p153l.lfz
        /* synthetic */ InterfaceC3442q getDefaultInstanceForType();

        String getLiveId();

        ByteString getLiveIdBytes();

        String getLiveMode();

        ByteString getLiveModeBytes();

        String getRoomId();

        ByteString getRoomIdBytes();

        @Override // p153l.lfz
        /* synthetic */ boolean isInitialized();
    }

    private LongLinkVoiceSwitchLiveMode() {
    }

    public static void registerAllExtensions(C3433h c3433h) {
    }

    public static final class VoiceLiveModeMessage extends GeneratedMessageLite<VoiceLiveModeMessage, Builder> implements VoiceLiveModeMessageOrBuilder {
        private static final VoiceLiveModeMessage DEFAULT_INSTANCE;
        public static final int LIVEID_FIELD_NUMBER = 2;
        public static final int LIVEMODE_FIELD_NUMBER = 3;
        private static volatile ng60<VoiceLiveModeMessage> PARSER = null;
        public static final int ROOMID_FIELD_NUMBER = 1;
        private String roomId_ = "";
        private String liveId_ = "";
        private String liveMode_ = "";

        public static final class Builder extends GeneratedMessageLite.AbstractC3403b<VoiceLiveModeMessage, Builder> implements VoiceLiveModeMessageOrBuilder {
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

        public static ng60<VoiceLiveModeMessage> parser() {
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
        public void setLiveMode(String str) {
            str.getClass();
            this.liveMode_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setLiveModeBytes(ByteString byteString) {
            byteString.getClass();
            AbstractC3426a.checkByteStringIsUtf8(byteString);
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
            AbstractC3426a.checkByteStringIsUtf8(byteString);
            this.roomId_ = byteString.toStringUtf8();
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (C46811.f16705xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new VoiceLiveModeMessage();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                    return null;
                case 4:
                    return new Builder();
                case 5:
                    GeneratedMessageLite.InterfaceC3409h interfaceC3409h = (GeneratedMessageLite.InterfaceC3409h) obj;
                    VoiceLiveModeMessage voiceLiveModeMessage = (VoiceLiveModeMessage) obj2;
                    this.roomId_ = interfaceC3409h.mo17052f(!this.roomId_.isEmpty(), this.roomId_, !voiceLiveModeMessage.roomId_.isEmpty(), voiceLiveModeMessage.roomId_);
                    this.liveId_ = interfaceC3409h.mo17052f(!this.liveId_.isEmpty(), this.liveId_, !voiceLiveModeMessage.liveId_.isEmpty(), voiceLiveModeMessage.liveId_);
                    this.liveMode_ = interfaceC3409h.mo17052f(!this.liveMode_.isEmpty(), this.liveMode_, true ^ voiceLiveModeMessage.liveMode_.isEmpty(), voiceLiveModeMessage.liveMode_);
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
                                    this.roomId_ = c3430e.m17170L();
                                } else if (iM17171M == 18) {
                                    this.liveId_ = c3430e.m17170L();
                                } else if (iM17171M == 26) {
                                    this.liveMode_ = c3430e.m17170L();
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
                        synchronized (VoiceLiveModeMessage.class) {
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

        @Override // com.google.protobuf.InterfaceC3442q
        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int iM16956K = !this.roomId_.isEmpty() ? CodedOutputStream.m16956K(1, getRoomId()) : 0;
            if (!this.liveId_.isEmpty()) {
                iM16956K += CodedOutputStream.m16956K(2, getLiveId());
            }
            if (!this.liveMode_.isEmpty()) {
                iM16956K += CodedOutputStream.m16956K(3, getLiveMode());
            }
            this.memoizedSerializedSize = iM16956K;
            return iM16956K;
        }

        @Override // com.google.protobuf.InterfaceC3442q
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (!this.roomId_.isEmpty()) {
                codedOutputStream.mo16994D0(1, getRoomId());
            }
            if (!this.liveId_.isEmpty()) {
                codedOutputStream.mo16994D0(2, getLiveId());
            }
            if (this.liveMode_.isEmpty()) {
                return;
            }
            codedOutputStream.mo16994D0(3, getLiveMode());
        }

        public static VoiceLiveModeMessage parseDelimitedFrom(InputStream inputStream, C3433h c3433h) throws IOException {
            return (VoiceLiveModeMessage) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, c3433h);
        }

        public static VoiceLiveModeMessage parseFrom(ByteString byteString, C3433h c3433h) throws InvalidProtocolBufferException {
            return (VoiceLiveModeMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, c3433h);
        }

        public static VoiceLiveModeMessage parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (VoiceLiveModeMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static VoiceLiveModeMessage parseFrom(byte[] bArr, C3433h c3433h) throws InvalidProtocolBufferException {
            return (VoiceLiveModeMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, c3433h);
        }

        public static VoiceLiveModeMessage parseFrom(InputStream inputStream) throws IOException {
            return (VoiceLiveModeMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static VoiceLiveModeMessage parseFrom(InputStream inputStream, C3433h c3433h) throws IOException {
            return (VoiceLiveModeMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, c3433h);
        }

        public static VoiceLiveModeMessage parseFrom(C3430e c3430e) throws IOException {
            return (VoiceLiveModeMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, c3430e);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static VoiceLiveModeMessage parseFrom(C3430e c3430e, C3433h c3433h) throws IOException {
            return (VoiceLiveModeMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, c3430e, c3433h);
        }
    }
}
