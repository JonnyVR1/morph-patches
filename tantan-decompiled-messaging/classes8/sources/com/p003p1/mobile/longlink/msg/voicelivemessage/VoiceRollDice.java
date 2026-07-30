package com.p003p1.mobile.longlink.msg.voicelivemessage;

import com.google.protobuf.ByteString;
import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.a;
import com.google.protobuf.e;
import com.google.protobuf.h;
import com.google.protobuf.l;
import com.google.protobuf.q;
import java.io.IOException;
import java.io.InputStream;
import l.aag0;
import l.bz00;
import l.i860;
import l.o6z;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes8.dex */
public final class VoiceRollDice {

    /* JADX INFO: renamed from: com.p1.mobile.longlink.msg.voicelivemessage.VoiceRollDice$1 */
    public static /* synthetic */ class C04841 {

        /* JADX INFO: renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f1709xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f1709xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f1709xa1df5c61[GeneratedMessageLite.MethodToInvoke.IS_INITIALIZED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f1709xa1df5c61[GeneratedMessageLite.MethodToInvoke.MAKE_IMMUTABLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f1709xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f1709xa1df5c61[GeneratedMessageLite.MethodToInvoke.VISIT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f1709xa1df5c61[GeneratedMessageLite.MethodToInvoke.MERGE_FROM_STREAM.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f1709xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f1709xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    public interface VoiceGiftWallLightNoticeMessageOrBuilder extends o6z {
        GiftWallLightAction getAction();

        int getActionValue();

        /* synthetic */ q getDefaultInstanceForType();

        String getLiveId();

        ByteString getLiveIdBytes();

        String getProfileUserId();

        ByteString getProfileUserIdBytes();

        String getRoomId();

        ByteString getRoomIdBytes();

        /* synthetic */ boolean isInitialized();
    }

    private VoiceRollDice() {
    }

    public static void registerAllExtensions(h hVar) {
    }

    public enum GiftWallLightAction implements l.c {
        refreshTab(0),
        UNRECOGNIZED(-1);

        private static final l.d<GiftWallLightAction> internalValueMap = new l.d<GiftWallLightAction>() { // from class: com.p1.mobile.longlink.msg.voicelivemessage.VoiceRollDice.GiftWallLightAction.1
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

        public static l.d<GiftWallLightAction> internalGetValueMap() {
            return internalValueMap;
        }

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

        public static final class Builder extends GeneratedMessageLite.b<VoiceGiftWallLightNoticeMessage, Builder> implements VoiceGiftWallLightNoticeMessageOrBuilder {
            private Builder() {
                super(VoiceGiftWallLightNoticeMessage.DEFAULT_INSTANCE);
            }

            public Builder clearAction() {
                copyOnWrite();
                ((VoiceGiftWallLightNoticeMessage) ((GeneratedMessageLite.b) this).instance).clearAction();
                return this;
            }

            public Builder clearLiveId() {
                copyOnWrite();
                ((VoiceGiftWallLightNoticeMessage) ((GeneratedMessageLite.b) this).instance).clearLiveId();
                return this;
            }

            public Builder clearProfileUserId() {
                copyOnWrite();
                ((VoiceGiftWallLightNoticeMessage) ((GeneratedMessageLite.b) this).instance).clearProfileUserId();
                return this;
            }

            public Builder clearRoomId() {
                copyOnWrite();
                ((VoiceGiftWallLightNoticeMessage) ((GeneratedMessageLite.b) this).instance).clearRoomId();
                return this;
            }

            @Override // com.p1.mobile.longlink.msg.voicelivemessage.VoiceRollDice.VoiceGiftWallLightNoticeMessageOrBuilder
            public GiftWallLightAction getAction() {
                return ((VoiceGiftWallLightNoticeMessage) ((GeneratedMessageLite.b) this).instance).getAction();
            }

            @Override // com.p1.mobile.longlink.msg.voicelivemessage.VoiceRollDice.VoiceGiftWallLightNoticeMessageOrBuilder
            public int getActionValue() {
                return ((VoiceGiftWallLightNoticeMessage) ((GeneratedMessageLite.b) this).instance).getActionValue();
            }

            @Override // com.p1.mobile.longlink.msg.voicelivemessage.VoiceRollDice.VoiceGiftWallLightNoticeMessageOrBuilder
            public String getLiveId() {
                return ((VoiceGiftWallLightNoticeMessage) ((GeneratedMessageLite.b) this).instance).getLiveId();
            }

            @Override // com.p1.mobile.longlink.msg.voicelivemessage.VoiceRollDice.VoiceGiftWallLightNoticeMessageOrBuilder
            public ByteString getLiveIdBytes() {
                return ((VoiceGiftWallLightNoticeMessage) ((GeneratedMessageLite.b) this).instance).getLiveIdBytes();
            }

            @Override // com.p1.mobile.longlink.msg.voicelivemessage.VoiceRollDice.VoiceGiftWallLightNoticeMessageOrBuilder
            public String getProfileUserId() {
                return ((VoiceGiftWallLightNoticeMessage) ((GeneratedMessageLite.b) this).instance).getProfileUserId();
            }

            @Override // com.p1.mobile.longlink.msg.voicelivemessage.VoiceRollDice.VoiceGiftWallLightNoticeMessageOrBuilder
            public ByteString getProfileUserIdBytes() {
                return ((VoiceGiftWallLightNoticeMessage) ((GeneratedMessageLite.b) this).instance).getProfileUserIdBytes();
            }

            @Override // com.p1.mobile.longlink.msg.voicelivemessage.VoiceRollDice.VoiceGiftWallLightNoticeMessageOrBuilder
            public String getRoomId() {
                return ((VoiceGiftWallLightNoticeMessage) ((GeneratedMessageLite.b) this).instance).getRoomId();
            }

            @Override // com.p1.mobile.longlink.msg.voicelivemessage.VoiceRollDice.VoiceGiftWallLightNoticeMessageOrBuilder
            public ByteString getRoomIdBytes() {
                return ((VoiceGiftWallLightNoticeMessage) ((GeneratedMessageLite.b) this).instance).getRoomIdBytes();
            }

            public Builder setAction(GiftWallLightAction giftWallLightAction) {
                copyOnWrite();
                ((VoiceGiftWallLightNoticeMessage) ((GeneratedMessageLite.b) this).instance).setAction(giftWallLightAction);
                return this;
            }

            public Builder setActionValue(int i) {
                copyOnWrite();
                ((VoiceGiftWallLightNoticeMessage) ((GeneratedMessageLite.b) this).instance).setActionValue(i);
                return this;
            }

            public Builder setLiveId(String str) {
                copyOnWrite();
                ((VoiceGiftWallLightNoticeMessage) ((GeneratedMessageLite.b) this).instance).setLiveId(str);
                return this;
            }

            public Builder setLiveIdBytes(ByteString byteString) {
                copyOnWrite();
                ((VoiceGiftWallLightNoticeMessage) ((GeneratedMessageLite.b) this).instance).setLiveIdBytes(byteString);
                return this;
            }

            public Builder setProfileUserId(String str) {
                copyOnWrite();
                ((VoiceGiftWallLightNoticeMessage) ((GeneratedMessageLite.b) this).instance).setProfileUserId(str);
                return this;
            }

            public Builder setProfileUserIdBytes(ByteString byteString) {
                copyOnWrite();
                ((VoiceGiftWallLightNoticeMessage) ((GeneratedMessageLite.b) this).instance).setProfileUserIdBytes(byteString);
                return this;
            }

            public Builder setRoomId(String str) {
                copyOnWrite();
                ((VoiceGiftWallLightNoticeMessage) ((GeneratedMessageLite.b) this).instance).setRoomId(str);
                return this;
            }

            public Builder setRoomIdBytes(ByteString byteString) {
                copyOnWrite();
                ((VoiceGiftWallLightNoticeMessage) ((GeneratedMessageLite.b) this).instance).setRoomIdBytes(byteString);
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
            return (Builder) ((Builder) DEFAULT_INSTANCE.toBuilder()).mergeFrom(voiceGiftWallLightNoticeMessage);
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
            a.checkByteStringIsUtf8(byteString);
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
            a.checkByteStringIsUtf8(byteString);
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
            a.checkByteStringIsUtf8(byteString);
            this.roomId_ = byteString.toStringUtf8();
        }

        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            boolean z = false;
            switch (C04841.f1709xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new VoiceGiftWallLightNoticeMessage();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                    return null;
                case 4:
                    return new Builder();
                case 5:
                    GeneratedMessageLite.h hVar = (GeneratedMessageLite.h) obj;
                    VoiceGiftWallLightNoticeMessage voiceGiftWallLightNoticeMessage = (VoiceGiftWallLightNoticeMessage) obj2;
                    this.roomId_ = hVar.f(!this.roomId_.isEmpty(), this.roomId_, !voiceGiftWallLightNoticeMessage.roomId_.isEmpty(), voiceGiftWallLightNoticeMessage.roomId_);
                    this.liveId_ = hVar.f(!this.liveId_.isEmpty(), this.liveId_, !voiceGiftWallLightNoticeMessage.liveId_.isEmpty(), voiceGiftWallLightNoticeMessage.liveId_);
                    this.profileUserId_ = hVar.f(!this.profileUserId_.isEmpty(), this.profileUserId_, !voiceGiftWallLightNoticeMessage.profileUserId_.isEmpty(), voiceGiftWallLightNoticeMessage.profileUserId_);
                    int i = this.action_;
                    boolean z2 = i != 0;
                    int i2 = voiceGiftWallLightNoticeMessage.action_;
                    this.action_ = hVar.e(z2, i, i2 != 0, i2);
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
                                    this.profileUserId_ = eVar.L();
                                } else if (iM == 32) {
                                    this.action_ = eVar.p();
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
                        synchronized (VoiceGiftWallLightNoticeMessage.class) {
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

        public int getSerializedSize() {
            int i = ((GeneratedMessageLite) this).memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int iK = !this.roomId_.isEmpty() ? CodedOutputStream.K(1, getRoomId()) : 0;
            if (!this.liveId_.isEmpty()) {
                iK += CodedOutputStream.K(2, getLiveId());
            }
            if (!this.profileUserId_.isEmpty()) {
                iK += CodedOutputStream.K(3, getProfileUserId());
            }
            if (this.action_ != GiftWallLightAction.refreshTab.getNumber()) {
                iK += CodedOutputStream.m(4, this.action_);
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
            if (!this.profileUserId_.isEmpty()) {
                codedOutputStream.D0(3, getProfileUserId());
            }
            if (this.action_ != GiftWallLightAction.refreshTab.getNumber()) {
                codedOutputStream.i0(4, this.action_);
            }
        }

        public static VoiceGiftWallLightNoticeMessage parseDelimitedFrom(InputStream inputStream, h hVar) throws IOException {
            return (VoiceGiftWallLightNoticeMessage) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, hVar);
        }

        public static VoiceGiftWallLightNoticeMessage parseFrom(ByteString byteString, h hVar) throws InvalidProtocolBufferException {
            return (VoiceGiftWallLightNoticeMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, hVar);
        }

        public static VoiceGiftWallLightNoticeMessage parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (VoiceGiftWallLightNoticeMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static VoiceGiftWallLightNoticeMessage parseFrom(byte[] bArr, h hVar) throws InvalidProtocolBufferException {
            return (VoiceGiftWallLightNoticeMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, hVar);
        }

        public static VoiceGiftWallLightNoticeMessage parseFrom(InputStream inputStream) throws IOException {
            return (VoiceGiftWallLightNoticeMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static VoiceGiftWallLightNoticeMessage parseFrom(InputStream inputStream, h hVar) throws IOException {
            return (VoiceGiftWallLightNoticeMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, hVar);
        }

        public static VoiceGiftWallLightNoticeMessage parseFrom(e eVar) throws IOException {
            return (VoiceGiftWallLightNoticeMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, eVar);
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.toBuilder();
        }

        public static VoiceGiftWallLightNoticeMessage parseFrom(e eVar, h hVar) throws IOException {
            return (VoiceGiftWallLightNoticeMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, eVar, hVar);
        }
    }
}
