package com.p046p1.mobile.longlink.msg.voicelivemessage;

import com.google.protobuf.AbstractC3403a;
import com.google.protobuf.ByteString;
import com.google.protobuf.C3407e;
import com.google.protobuf.C3410h;
import com.google.protobuf.C3414l;
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
public final class VoiceRollDice {

    /* JADX INFO: renamed from: com.p1.mobile.longlink.msg.voicelivemessage.VoiceRollDice$1 */
    public static /* synthetic */ class C45721 {

        /* JADX INFO: renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f16010xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f16010xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f16010xa1df5c61[GeneratedMessageLite.MethodToInvoke.IS_INITIALIZED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f16010xa1df5c61[GeneratedMessageLite.MethodToInvoke.MAKE_IMMUTABLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f16010xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f16010xa1df5c61[GeneratedMessageLite.MethodToInvoke.VISIT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f16010xa1df5c61[GeneratedMessageLite.MethodToInvoke.MERGE_FROM_STREAM.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f16010xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f16010xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    public interface VoiceGiftWallLightNoticeMessageOrBuilder extends o6z {
        GiftWallLightAction getAction();

        int getActionValue();

        @Override // p149l.o6z
        /* synthetic */ InterfaceC3419q getDefaultInstanceForType();

        String getLiveId();

        ByteString getLiveIdBytes();

        String getProfileUserId();

        ByteString getProfileUserIdBytes();

        String getRoomId();

        ByteString getRoomIdBytes();

        @Override // p149l.o6z
        /* synthetic */ boolean isInitialized();
    }

    private VoiceRollDice() {
    }

    public static void registerAllExtensions(C3410h c3410h) {
    }

    public enum GiftWallLightAction implements C3414l.c {
        refreshTab(0),
        UNRECOGNIZED(-1);

        private static final C3414l.d<GiftWallLightAction> internalValueMap = new C3414l.d<GiftWallLightAction>() { // from class: com.p1.mobile.longlink.msg.voicelivemessage.VoiceRollDice.GiftWallLightAction.1
            @Override // com.google.protobuf.C3414l.d
            public GiftWallLightAction findValueByNumber(int i) {
                return GiftWallLightAction.forNumber(i);
            }
        };
        public static final int refreshTab_VALUE = 0;
        private final int value;

        GiftWallLightAction(int i) {
            this.value = i;
        }

        public static GiftWallLightAction forNumber(int i) {
            if (i != 0) {
                return null;
            }
            return refreshTab;
        }

        public static C3414l.d<GiftWallLightAction> internalGetValueMap() {
            return internalValueMap;
        }

        @Override // com.google.protobuf.C3414l.c
        public final int getNumber() {
            return this.value;
        }

        @Deprecated
        public static GiftWallLightAction valueOf(int i) {
            return forNumber(i);
        }
    }

    public static final class VoiceGiftWallLightNoticeMessage extends GeneratedMessageLite<VoiceGiftWallLightNoticeMessage, Builder> implements VoiceGiftWallLightNoticeMessageOrBuilder {
        public static final int ACTION_FIELD_NUMBER = 4;
        private static final VoiceGiftWallLightNoticeMessage DEFAULT_INSTANCE;
        public static final int LIVEID_FIELD_NUMBER = 2;
        private static volatile i860<VoiceGiftWallLightNoticeMessage> PARSER = null;
        public static final int PROFILEUSERID_FIELD_NUMBER = 3;
        public static final int ROOMID_FIELD_NUMBER = 1;
        private int action_;
        private String roomId_ = "";
        private String liveId_ = "";
        private String profileUserId_ = "";

        public static final class Builder extends GeneratedMessageLite.AbstractC3380b<VoiceGiftWallLightNoticeMessage, Builder> implements VoiceGiftWallLightNoticeMessageOrBuilder {
            private Builder() {
                super(VoiceGiftWallLightNoticeMessage.DEFAULT_INSTANCE);
            }

            public Builder clearAction() {
                copyOnWrite();
                ((VoiceGiftWallLightNoticeMessage) this.instance).clearAction();
                return this;
            }

            public Builder clearLiveId() {
                copyOnWrite();
                ((VoiceGiftWallLightNoticeMessage) this.instance).clearLiveId();
                return this;
            }

            public Builder clearProfileUserId() {
                copyOnWrite();
                ((VoiceGiftWallLightNoticeMessage) this.instance).clearProfileUserId();
                return this;
            }

            public Builder clearRoomId() {
                copyOnWrite();
                ((VoiceGiftWallLightNoticeMessage) this.instance).clearRoomId();
                return this;
            }

            @Override // com.p1.mobile.longlink.msg.voicelivemessage.VoiceRollDice.VoiceGiftWallLightNoticeMessageOrBuilder
            public GiftWallLightAction getAction() {
                return ((VoiceGiftWallLightNoticeMessage) this.instance).getAction();
            }

            @Override // com.p1.mobile.longlink.msg.voicelivemessage.VoiceRollDice.VoiceGiftWallLightNoticeMessageOrBuilder
            public int getActionValue() {
                return ((VoiceGiftWallLightNoticeMessage) this.instance).getActionValue();
            }

            @Override // com.p1.mobile.longlink.msg.voicelivemessage.VoiceRollDice.VoiceGiftWallLightNoticeMessageOrBuilder
            public String getLiveId() {
                return ((VoiceGiftWallLightNoticeMessage) this.instance).getLiveId();
            }

            @Override // com.p1.mobile.longlink.msg.voicelivemessage.VoiceRollDice.VoiceGiftWallLightNoticeMessageOrBuilder
            public ByteString getLiveIdBytes() {
                return ((VoiceGiftWallLightNoticeMessage) this.instance).getLiveIdBytes();
            }

            @Override // com.p1.mobile.longlink.msg.voicelivemessage.VoiceRollDice.VoiceGiftWallLightNoticeMessageOrBuilder
            public String getProfileUserId() {
                return ((VoiceGiftWallLightNoticeMessage) this.instance).getProfileUserId();
            }

            @Override // com.p1.mobile.longlink.msg.voicelivemessage.VoiceRollDice.VoiceGiftWallLightNoticeMessageOrBuilder
            public ByteString getProfileUserIdBytes() {
                return ((VoiceGiftWallLightNoticeMessage) this.instance).getProfileUserIdBytes();
            }

            @Override // com.p1.mobile.longlink.msg.voicelivemessage.VoiceRollDice.VoiceGiftWallLightNoticeMessageOrBuilder
            public String getRoomId() {
                return ((VoiceGiftWallLightNoticeMessage) this.instance).getRoomId();
            }

            @Override // com.p1.mobile.longlink.msg.voicelivemessage.VoiceRollDice.VoiceGiftWallLightNoticeMessageOrBuilder
            public ByteString getRoomIdBytes() {
                return ((VoiceGiftWallLightNoticeMessage) this.instance).getRoomIdBytes();
            }

            public Builder setAction(GiftWallLightAction giftWallLightAction) {
                copyOnWrite();
                ((VoiceGiftWallLightNoticeMessage) this.instance).setAction(giftWallLightAction);
                return this;
            }

            public Builder setActionValue(int i) {
                copyOnWrite();
                ((VoiceGiftWallLightNoticeMessage) this.instance).setActionValue(i);
                return this;
            }

            public Builder setLiveId(String str) {
                copyOnWrite();
                ((VoiceGiftWallLightNoticeMessage) this.instance).setLiveId(str);
                return this;
            }

            public Builder setLiveIdBytes(ByteString byteString) {
                copyOnWrite();
                ((VoiceGiftWallLightNoticeMessage) this.instance).setLiveIdBytes(byteString);
                return this;
            }

            public Builder setProfileUserId(String str) {
                copyOnWrite();
                ((VoiceGiftWallLightNoticeMessage) this.instance).setProfileUserId(str);
                return this;
            }

            public Builder setProfileUserIdBytes(ByteString byteString) {
                copyOnWrite();
                ((VoiceGiftWallLightNoticeMessage) this.instance).setProfileUserIdBytes(byteString);
                return this;
            }

            public Builder setRoomId(String str) {
                copyOnWrite();
                ((VoiceGiftWallLightNoticeMessage) this.instance).setRoomId(str);
                return this;
            }

            public Builder setRoomIdBytes(ByteString byteString) {
                copyOnWrite();
                ((VoiceGiftWallLightNoticeMessage) this.instance).setRoomIdBytes(byteString);
                return this;
            }
        }

        static {
            VoiceGiftWallLightNoticeMessage voiceGiftWallLightNoticeMessage = new VoiceGiftWallLightNoticeMessage();
            DEFAULT_INSTANCE = voiceGiftWallLightNoticeMessage;
            voiceGiftWallLightNoticeMessage.makeImmutable();
        }

        private VoiceGiftWallLightNoticeMessage() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAction() {
            this.action_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearLiveId() {
            this.liveId_ = getDefaultInstance().getLiveId();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearProfileUserId() {
            this.profileUserId_ = getDefaultInstance().getProfileUserId();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearRoomId() {
            this.roomId_ = getDefaultInstance().getRoomId();
        }

        public static VoiceGiftWallLightNoticeMessage getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder(VoiceGiftWallLightNoticeMessage voiceGiftWallLightNoticeMessage) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(voiceGiftWallLightNoticeMessage);
        }

        public static VoiceGiftWallLightNoticeMessage parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (VoiceGiftWallLightNoticeMessage) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static VoiceGiftWallLightNoticeMessage parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (VoiceGiftWallLightNoticeMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static i860<VoiceGiftWallLightNoticeMessage> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAction(GiftWallLightAction giftWallLightAction) {
            giftWallLightAction.getClass();
            this.action_ = giftWallLightAction.getNumber();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setActionValue(int i) {
            this.action_ = i;
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
        public void setProfileUserId(String str) {
            str.getClass();
            this.profileUserId_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setProfileUserIdBytes(ByteString byteString) {
            byteString.getClass();
            AbstractC3403a.checkByteStringIsUtf8(byteString);
            this.profileUserId_ = byteString.toStringUtf8();
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
            boolean z = false;
            switch (C45721.f16010xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new VoiceGiftWallLightNoticeMessage();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                    return null;
                case 4:
                    return new Builder();
                case 5:
                    GeneratedMessageLite.InterfaceC3386h interfaceC3386h = (GeneratedMessageLite.InterfaceC3386h) obj;
                    VoiceGiftWallLightNoticeMessage voiceGiftWallLightNoticeMessage = (VoiceGiftWallLightNoticeMessage) obj2;
                    this.roomId_ = interfaceC3386h.mo16997f(!this.roomId_.isEmpty(), this.roomId_, !voiceGiftWallLightNoticeMessage.roomId_.isEmpty(), voiceGiftWallLightNoticeMessage.roomId_);
                    this.liveId_ = interfaceC3386h.mo16997f(!this.liveId_.isEmpty(), this.liveId_, !voiceGiftWallLightNoticeMessage.liveId_.isEmpty(), voiceGiftWallLightNoticeMessage.liveId_);
                    this.profileUserId_ = interfaceC3386h.mo16997f(!this.profileUserId_.isEmpty(), this.profileUserId_, !voiceGiftWallLightNoticeMessage.profileUserId_.isEmpty(), voiceGiftWallLightNoticeMessage.profileUserId_);
                    int i = this.action_;
                    boolean z2 = i != 0;
                    int i2 = voiceGiftWallLightNoticeMessage.action_;
                    this.action_ = interfaceC3386h.mo16996e(z2, i, i2 != 0, i2);
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
                                    this.profileUserId_ = c3407e.m17115L();
                                } else if (iM17116M == 32) {
                                    this.action_ = c3407e.m17136p();
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
                        synchronized (VoiceGiftWallLightNoticeMessage.class) {
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

        @Override // com.p1.mobile.longlink.msg.voicelivemessage.VoiceRollDice.VoiceGiftWallLightNoticeMessageOrBuilder
        public GiftWallLightAction getAction() {
            GiftWallLightAction giftWallLightActionForNumber = GiftWallLightAction.forNumber(this.action_);
            return giftWallLightActionForNumber == null ? GiftWallLightAction.UNRECOGNIZED : giftWallLightActionForNumber;
        }

        @Override // com.p1.mobile.longlink.msg.voicelivemessage.VoiceRollDice.VoiceGiftWallLightNoticeMessageOrBuilder
        public int getActionValue() {
            return this.action_;
        }

        @Override // com.p1.mobile.longlink.msg.voicelivemessage.VoiceRollDice.VoiceGiftWallLightNoticeMessageOrBuilder
        public String getLiveId() {
            return this.liveId_;
        }

        @Override // com.p1.mobile.longlink.msg.voicelivemessage.VoiceRollDice.VoiceGiftWallLightNoticeMessageOrBuilder
        public ByteString getLiveIdBytes() {
            return ByteString.copyFromUtf8(this.liveId_);
        }

        @Override // com.p1.mobile.longlink.msg.voicelivemessage.VoiceRollDice.VoiceGiftWallLightNoticeMessageOrBuilder
        public String getProfileUserId() {
            return this.profileUserId_;
        }

        @Override // com.p1.mobile.longlink.msg.voicelivemessage.VoiceRollDice.VoiceGiftWallLightNoticeMessageOrBuilder
        public ByteString getProfileUserIdBytes() {
            return ByteString.copyFromUtf8(this.profileUserId_);
        }

        @Override // com.p1.mobile.longlink.msg.voicelivemessage.VoiceRollDice.VoiceGiftWallLightNoticeMessageOrBuilder
        public String getRoomId() {
            return this.roomId_;
        }

        @Override // com.p1.mobile.longlink.msg.voicelivemessage.VoiceRollDice.VoiceGiftWallLightNoticeMessageOrBuilder
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
            if (!this.profileUserId_.isEmpty()) {
                iM16901K += CodedOutputStream.m16901K(3, getProfileUserId());
            }
            if (this.action_ != GiftWallLightAction.refreshTab.getNumber()) {
                iM16901K += CodedOutputStream.m16922m(4, this.action_);
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
            if (!this.profileUserId_.isEmpty()) {
                codedOutputStream.mo16939D0(3, getProfileUserId());
            }
            if (this.action_ != GiftWallLightAction.refreshTab.getNumber()) {
                codedOutputStream.m16960i0(4, this.action_);
            }
        }

        public static VoiceGiftWallLightNoticeMessage parseDelimitedFrom(InputStream inputStream, C3410h c3410h) throws IOException {
            return (VoiceGiftWallLightNoticeMessage) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, c3410h);
        }

        public static VoiceGiftWallLightNoticeMessage parseFrom(ByteString byteString, C3410h c3410h) throws InvalidProtocolBufferException {
            return (VoiceGiftWallLightNoticeMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, c3410h);
        }

        public static VoiceGiftWallLightNoticeMessage parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (VoiceGiftWallLightNoticeMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static VoiceGiftWallLightNoticeMessage parseFrom(byte[] bArr, C3410h c3410h) throws InvalidProtocolBufferException {
            return (VoiceGiftWallLightNoticeMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, c3410h);
        }

        public static VoiceGiftWallLightNoticeMessage parseFrom(InputStream inputStream) throws IOException {
            return (VoiceGiftWallLightNoticeMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static VoiceGiftWallLightNoticeMessage parseFrom(InputStream inputStream, C3410h c3410h) throws IOException {
            return (VoiceGiftWallLightNoticeMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, c3410h);
        }

        public static VoiceGiftWallLightNoticeMessage parseFrom(C3407e c3407e) throws IOException {
            return (VoiceGiftWallLightNoticeMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, c3407e);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static VoiceGiftWallLightNoticeMessage parseFrom(C3407e c3407e, C3410h c3410h) throws IOException {
            return (VoiceGiftWallLightNoticeMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, c3407e, c3410h);
        }
    }
}
