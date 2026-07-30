package com.p003p1.mobile.longlink.msg.liveroom;

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
public final class LongLinkVoiceSwitchLiveMode {

    /* JADX INFO: renamed from: com.p1.mobile.longlink.msg.liveroom.LongLinkVoiceSwitchLiveMode$1 */
    public static /* synthetic */ class C04421 {

        /* JADX INFO: renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f1685xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f1685xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f1685xa1df5c61[GeneratedMessageLite.MethodToInvoke.IS_INITIALIZED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f1685xa1df5c61[GeneratedMessageLite.MethodToInvoke.MAKE_IMMUTABLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f1685xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f1685xa1df5c61[GeneratedMessageLite.MethodToInvoke.VISIT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f1685xa1df5c61[GeneratedMessageLite.MethodToInvoke.MERGE_FROM_STREAM.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f1685xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f1685xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    public interface VoiceLiveModeMessageOrBuilder extends o6z {
        /* synthetic */ q getDefaultInstanceForType();

        String getLiveId();

        ByteString getLiveIdBytes();

        String getLiveMode();

        ByteString getLiveModeBytes();

        String getRoomId();

        ByteString getRoomIdBytes();

        /* synthetic */ boolean isInitialized();
    }

    private LongLinkVoiceSwitchLiveMode() {
    }

    public static void registerAllExtensions(h hVar) {
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

        public static final class Builder extends GeneratedMessageLite.b<VoiceLiveModeMessage, Builder> implements VoiceLiveModeMessageOrBuilder {
            private Builder() {
                super(VoiceLiveModeMessage.DEFAULT_INSTANCE);
            }

            public Builder clearLiveId() {
                copyOnWrite();
                ((VoiceLiveModeMessage) ((GeneratedMessageLite.b) this).instance).clearLiveId();
                return this;
            }

            public Builder clearLiveMode() {
                copyOnWrite();
                ((VoiceLiveModeMessage) ((GeneratedMessageLite.b) this).instance).clearLiveMode();
                return this;
            }

            public Builder clearRoomId() {
                copyOnWrite();
                ((VoiceLiveModeMessage) ((GeneratedMessageLite.b) this).instance).clearRoomId();
                return this;
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVoiceSwitchLiveMode.VoiceLiveModeMessageOrBuilder
            public String getLiveId() {
                return ((VoiceLiveModeMessage) ((GeneratedMessageLite.b) this).instance).getLiveId();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVoiceSwitchLiveMode.VoiceLiveModeMessageOrBuilder
            public ByteString getLiveIdBytes() {
                return ((VoiceLiveModeMessage) ((GeneratedMessageLite.b) this).instance).getLiveIdBytes();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVoiceSwitchLiveMode.VoiceLiveModeMessageOrBuilder
            public String getLiveMode() {
                return ((VoiceLiveModeMessage) ((GeneratedMessageLite.b) this).instance).getLiveMode();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVoiceSwitchLiveMode.VoiceLiveModeMessageOrBuilder
            public ByteString getLiveModeBytes() {
                return ((VoiceLiveModeMessage) ((GeneratedMessageLite.b) this).instance).getLiveModeBytes();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVoiceSwitchLiveMode.VoiceLiveModeMessageOrBuilder
            public String getRoomId() {
                return ((VoiceLiveModeMessage) ((GeneratedMessageLite.b) this).instance).getRoomId();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVoiceSwitchLiveMode.VoiceLiveModeMessageOrBuilder
            public ByteString getRoomIdBytes() {
                return ((VoiceLiveModeMessage) ((GeneratedMessageLite.b) this).instance).getRoomIdBytes();
            }

            public Builder setLiveId(String str) {
                copyOnWrite();
                ((VoiceLiveModeMessage) ((GeneratedMessageLite.b) this).instance).setLiveId(str);
                return this;
            }

            public Builder setLiveIdBytes(ByteString byteString) {
                copyOnWrite();
                ((VoiceLiveModeMessage) ((GeneratedMessageLite.b) this).instance).setLiveIdBytes(byteString);
                return this;
            }

            public Builder setLiveMode(String str) {
                copyOnWrite();
                ((VoiceLiveModeMessage) ((GeneratedMessageLite.b) this).instance).setLiveMode(str);
                return this;
            }

            public Builder setLiveModeBytes(ByteString byteString) {
                copyOnWrite();
                ((VoiceLiveModeMessage) ((GeneratedMessageLite.b) this).instance).setLiveModeBytes(byteString);
                return this;
            }

            public Builder setRoomId(String str) {
                copyOnWrite();
                ((VoiceLiveModeMessage) ((GeneratedMessageLite.b) this).instance).setRoomId(str);
                return this;
            }

            public Builder setRoomIdBytes(ByteString byteString) {
                copyOnWrite();
                ((VoiceLiveModeMessage) ((GeneratedMessageLite.b) this).instance).setRoomIdBytes(byteString);
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
            return (Builder) ((Builder) DEFAULT_INSTANCE.toBuilder()).mergeFrom(voiceLiveModeMessage);
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
            a.checkByteStringIsUtf8(byteString);
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
            a.checkByteStringIsUtf8(byteString);
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
            a.checkByteStringIsUtf8(byteString);
            this.roomId_ = byteString.toStringUtf8();
        }

        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (C04421.f1685xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new VoiceLiveModeMessage();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                    return null;
                case 4:
                    return new Builder();
                case 5:
                    GeneratedMessageLite.h hVar = (GeneratedMessageLite.h) obj;
                    VoiceLiveModeMessage voiceLiveModeMessage = (VoiceLiveModeMessage) obj2;
                    this.roomId_ = hVar.f(!this.roomId_.isEmpty(), this.roomId_, !voiceLiveModeMessage.roomId_.isEmpty(), voiceLiveModeMessage.roomId_);
                    this.liveId_ = hVar.f(!this.liveId_.isEmpty(), this.liveId_, !voiceLiveModeMessage.liveId_.isEmpty(), voiceLiveModeMessage.liveId_);
                    this.liveMode_ = hVar.f(!this.liveMode_.isEmpty(), this.liveMode_, true ^ voiceLiveModeMessage.liveMode_.isEmpty(), voiceLiveModeMessage.liveMode_);
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
                                    this.roomId_ = eVar.L();
                                } else if (iM == 18) {
                                    this.liveId_ = eVar.L();
                                } else if (iM == 26) {
                                    this.liveMode_ = eVar.L();
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
                        synchronized (VoiceLiveModeMessage.class) {
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

        public int getSerializedSize() {
            int i = ((GeneratedMessageLite) this).memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int iK = !this.roomId_.isEmpty() ? CodedOutputStream.K(1, getRoomId()) : 0;
            if (!this.liveId_.isEmpty()) {
                iK += CodedOutputStream.K(2, getLiveId());
            }
            if (!this.liveMode_.isEmpty()) {
                iK += CodedOutputStream.K(3, getLiveMode());
            }
            ((GeneratedMessageLite) this).memoizedSerializedSize = iK;
            return iK;
        }

        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (!this.roomId_.isEmpty()) {
                codedOutputStream.D0(1, getRoomId());
            }
            if (!this.liveId_.isEmpty()) {
                codedOutputStream.D0(2, getLiveId());
            }
            if (this.liveMode_.isEmpty()) {
                return;
            }
            codedOutputStream.D0(3, getLiveMode());
        }

        public static VoiceLiveModeMessage parseDelimitedFrom(InputStream inputStream, h hVar) throws IOException {
            return (VoiceLiveModeMessage) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, hVar);
        }

        public static VoiceLiveModeMessage parseFrom(ByteString byteString, h hVar) throws InvalidProtocolBufferException {
            return (VoiceLiveModeMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, hVar);
        }

        public static VoiceLiveModeMessage parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (VoiceLiveModeMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static VoiceLiveModeMessage parseFrom(byte[] bArr, h hVar) throws InvalidProtocolBufferException {
            return (VoiceLiveModeMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, hVar);
        }

        public static VoiceLiveModeMessage parseFrom(InputStream inputStream) throws IOException {
            return (VoiceLiveModeMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static VoiceLiveModeMessage parseFrom(InputStream inputStream, h hVar) throws IOException {
            return (VoiceLiveModeMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, hVar);
        }

        public static VoiceLiveModeMessage parseFrom(e eVar) throws IOException {
            return (VoiceLiveModeMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, eVar);
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.toBuilder();
        }

        public static VoiceLiveModeMessage parseFrom(e eVar, h hVar) throws IOException {
            return (VoiceLiveModeMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, eVar, hVar);
        }
    }
}
