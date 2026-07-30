package com.p003p1.mobile.longlink.msg.liveroom;

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
public final class VoiceLiveManager {

    /* JADX INFO: renamed from: com.p1.mobile.longlink.msg.liveroom.VoiceLiveManager$1 */
    public static /* synthetic */ class C04441 {

        /* JADX INFO: renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f1687xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f1687xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f1687xa1df5c61[GeneratedMessageLite.MethodToInvoke.IS_INITIALIZED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f1687xa1df5c61[GeneratedMessageLite.MethodToInvoke.MAKE_IMMUTABLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f1687xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f1687xa1df5c61[GeneratedMessageLite.MethodToInvoke.VISIT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f1687xa1df5c61[GeneratedMessageLite.MethodToInvoke.MERGE_FROM_STREAM.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f1687xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f1687xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    public interface VoiceFreeCallUpdateOrBuilder extends o6z {
        /* synthetic */ q getDefaultInstanceForType();

        boolean getFreeCall();

        String getRoomId();

        ByteString getRoomIdBytes();

        String getUserId();

        ByteString getUserIdBytes();

        /* synthetic */ boolean isInitialized();
    }

    public interface VoiceLiveHeartBeatInfoOrBuilder extends o6z {
        /* synthetic */ q getDefaultInstanceForType();

        long getHeartBeats();

        String getLiveId();

        ByteString getLiveIdBytes();

        String getRoomId();

        ByteString getRoomIdBytes();

        long getTimestamp();

        /* synthetic */ boolean isInitialized();
    }

    public interface VoiceLiveInfoOrBuilder extends o6z {
        /* synthetic */ q getDefaultInstanceForType();

        String getLiveId();

        ByteString getLiveIdBytes();

        VoiceLiveInfo.VoiceLiveMode getLiveMode();

        int getLiveModeValue();

        long getRewardPoint();

        String getRoomId();

        ByteString getRoomIdBytes();

        String getTemplate();

        ByteString getTemplateBytes();

        /* synthetic */ boolean isInitialized();
    }

    public interface VoiceManagerInviteOrBuilder extends o6z {
        /* synthetic */ q getDefaultInstanceForType();

        String getInviteId();

        ByteString getInviteIdBytes();

        String getLiveId();

        ByteString getLiveIdBytes();

        String getUserId();

        ByteString getUserIdBytes();

        /* synthetic */ boolean isInitialized();
    }

    public interface VoiceManagerUpdateOrBuilder extends o6z {
        /* synthetic */ q getDefaultInstanceForType();

        String getLiveId();

        ByteString getLiveIdBytes();

        VoiceManagerUpdate.UpdateType getType();

        int getTypeValue();

        String getUserId();

        ByteString getUserIdBytes();

        /* synthetic */ boolean isInitialized();
    }

    private VoiceLiveManager() {
    }

    public static void registerAllExtensions(h hVar) {
    }

    public static final class VoiceLiveInfo extends GeneratedMessageLite<VoiceLiveInfo, Builder> implements VoiceLiveInfoOrBuilder {
        private static final VoiceLiveInfo DEFAULT_INSTANCE;
        public static final int LIVEID_FIELD_NUMBER = 2;
        public static final int LIVEMODE_FIELD_NUMBER = 4;
        private static volatile i860<VoiceLiveInfo> PARSER = null;
        public static final int REWARDPOINT_FIELD_NUMBER = 3;
        public static final int ROOMID_FIELD_NUMBER = 1;
        public static final int TEMPLATE_FIELD_NUMBER = 5;
        private int liveMode_;
        private long rewardPoint_;
        private String roomId_ = "";
        private String liveId_ = "";
        private String template_ = "";

        public static final class Builder extends GeneratedMessageLite.b<VoiceLiveInfo, Builder> implements VoiceLiveInfoOrBuilder {
            private Builder() {
                super(VoiceLiveInfo.DEFAULT_INSTANCE);
            }

            public Builder clearLiveId() {
                copyOnWrite();
                ((VoiceLiveInfo) ((GeneratedMessageLite.b) this).instance).clearLiveId();
                return this;
            }

            public Builder clearLiveMode() {
                copyOnWrite();
                ((VoiceLiveInfo) ((GeneratedMessageLite.b) this).instance).clearLiveMode();
                return this;
            }

            public Builder clearRewardPoint() {
                copyOnWrite();
                ((VoiceLiveInfo) ((GeneratedMessageLite.b) this).instance).clearRewardPoint();
                return this;
            }

            public Builder clearRoomId() {
                copyOnWrite();
                ((VoiceLiveInfo) ((GeneratedMessageLite.b) this).instance).clearRoomId();
                return this;
            }

            public Builder clearTemplate() {
                copyOnWrite();
                ((VoiceLiveInfo) ((GeneratedMessageLite.b) this).instance).clearTemplate();
                return this;
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.VoiceLiveManager.VoiceLiveInfoOrBuilder
            public String getLiveId() {
                return ((VoiceLiveInfo) ((GeneratedMessageLite.b) this).instance).getLiveId();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.VoiceLiveManager.VoiceLiveInfoOrBuilder
            public ByteString getLiveIdBytes() {
                return ((VoiceLiveInfo) ((GeneratedMessageLite.b) this).instance).getLiveIdBytes();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.VoiceLiveManager.VoiceLiveInfoOrBuilder
            public VoiceLiveMode getLiveMode() {
                return ((VoiceLiveInfo) ((GeneratedMessageLite.b) this).instance).getLiveMode();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.VoiceLiveManager.VoiceLiveInfoOrBuilder
            public int getLiveModeValue() {
                return ((VoiceLiveInfo) ((GeneratedMessageLite.b) this).instance).getLiveModeValue();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.VoiceLiveManager.VoiceLiveInfoOrBuilder
            public long getRewardPoint() {
                return ((VoiceLiveInfo) ((GeneratedMessageLite.b) this).instance).getRewardPoint();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.VoiceLiveManager.VoiceLiveInfoOrBuilder
            public String getRoomId() {
                return ((VoiceLiveInfo) ((GeneratedMessageLite.b) this).instance).getRoomId();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.VoiceLiveManager.VoiceLiveInfoOrBuilder
            public ByteString getRoomIdBytes() {
                return ((VoiceLiveInfo) ((GeneratedMessageLite.b) this).instance).getRoomIdBytes();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.VoiceLiveManager.VoiceLiveInfoOrBuilder
            public String getTemplate() {
                return ((VoiceLiveInfo) ((GeneratedMessageLite.b) this).instance).getTemplate();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.VoiceLiveManager.VoiceLiveInfoOrBuilder
            public ByteString getTemplateBytes() {
                return ((VoiceLiveInfo) ((GeneratedMessageLite.b) this).instance).getTemplateBytes();
            }

            public Builder setLiveId(String str) {
                copyOnWrite();
                ((VoiceLiveInfo) ((GeneratedMessageLite.b) this).instance).setLiveId(str);
                return this;
            }

            public Builder setLiveIdBytes(ByteString byteString) {
                copyOnWrite();
                ((VoiceLiveInfo) ((GeneratedMessageLite.b) this).instance).setLiveIdBytes(byteString);
                return this;
            }

            public Builder setLiveMode(VoiceLiveMode voiceLiveMode) {
                copyOnWrite();
                ((VoiceLiveInfo) ((GeneratedMessageLite.b) this).instance).setLiveMode(voiceLiveMode);
                return this;
            }

            public Builder setLiveModeValue(int i) {
                copyOnWrite();
                ((VoiceLiveInfo) ((GeneratedMessageLite.b) this).instance).setLiveModeValue(i);
                return this;
            }

            public Builder setRewardPoint(long j) {
                copyOnWrite();
                ((VoiceLiveInfo) ((GeneratedMessageLite.b) this).instance).setRewardPoint(j);
                return this;
            }

            public Builder setRoomId(String str) {
                copyOnWrite();
                ((VoiceLiveInfo) ((GeneratedMessageLite.b) this).instance).setRoomId(str);
                return this;
            }

            public Builder setRoomIdBytes(ByteString byteString) {
                copyOnWrite();
                ((VoiceLiveInfo) ((GeneratedMessageLite.b) this).instance).setRoomIdBytes(byteString);
                return this;
            }

            public Builder setTemplate(String str) {
                copyOnWrite();
                ((VoiceLiveInfo) ((GeneratedMessageLite.b) this).instance).setTemplate(str);
                return this;
            }

            public Builder setTemplateBytes(ByteString byteString) {
                copyOnWrite();
                ((VoiceLiveInfo) ((GeneratedMessageLite.b) this).instance).setTemplateBytes(byteString);
                return this;
            }
        }

        static {
            VoiceLiveInfo voiceLiveInfo = new VoiceLiveInfo();
            DEFAULT_INSTANCE = voiceLiveInfo;
            voiceLiveInfo.makeImmutable();
        }

        private VoiceLiveInfo() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearLiveId() {
            this.liveId_ = getDefaultInstance().getLiveId();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearLiveMode() {
            this.liveMode_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearRewardPoint() {
            this.rewardPoint_ = 0L;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearRoomId() {
            this.roomId_ = getDefaultInstance().getRoomId();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearTemplate() {
            this.template_ = getDefaultInstance().getTemplate();
        }

        public static VoiceLiveInfo getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder(VoiceLiveInfo voiceLiveInfo) {
            return (Builder) ((Builder) DEFAULT_INSTANCE.toBuilder()).mergeFrom(voiceLiveInfo);
        }

        public static VoiceLiveInfo parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (VoiceLiveInfo) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static VoiceLiveInfo parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (VoiceLiveInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static i860<VoiceLiveInfo> parser() {
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
        public void setLiveMode(VoiceLiveMode voiceLiveMode) {
            voiceLiveMode.getClass();
            this.liveMode_ = voiceLiveMode.getNumber();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setLiveModeValue(int i) {
            this.liveMode_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setRewardPoint(long j) {
            this.rewardPoint_ = j;
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
        public void setTemplate(String str) {
            str.getClass();
            this.template_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTemplateBytes(ByteString byteString) {
            byteString.getClass();
            a.checkByteStringIsUtf8(byteString);
            this.template_ = byteString.toStringUtf8();
        }

        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            boolean z = false;
            switch (C04441.f1687xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new VoiceLiveInfo();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                    return null;
                case 4:
                    return new Builder();
                case 5:
                    GeneratedMessageLite.h hVar = (GeneratedMessageLite.h) obj;
                    VoiceLiveInfo voiceLiveInfo = (VoiceLiveInfo) obj2;
                    this.roomId_ = hVar.f(!this.roomId_.isEmpty(), this.roomId_, !voiceLiveInfo.roomId_.isEmpty(), voiceLiveInfo.roomId_);
                    this.liveId_ = hVar.f(!this.liveId_.isEmpty(), this.liveId_, !voiceLiveInfo.liveId_.isEmpty(), voiceLiveInfo.liveId_);
                    long j = this.rewardPoint_;
                    boolean z2 = j != 0;
                    long j2 = voiceLiveInfo.rewardPoint_;
                    this.rewardPoint_ = hVar.i(z2, j, j2 != 0, j2);
                    int i = this.liveMode_;
                    boolean z3 = i != 0;
                    int i2 = voiceLiveInfo.liveMode_;
                    this.liveMode_ = hVar.e(z3, i, i2 != 0, i2);
                    this.template_ = hVar.f(!this.template_.isEmpty(), this.template_, !voiceLiveInfo.template_.isEmpty(), voiceLiveInfo.template_);
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
                                } else if (iM == 24) {
                                    this.rewardPoint_ = eVar.O();
                                } else if (iM == 32) {
                                    this.liveMode_ = eVar.p();
                                } else if (iM == 42) {
                                    this.template_ = eVar.L();
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
                        synchronized (VoiceLiveInfo.class) {
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

        @Override // com.p1.mobile.longlink.msg.liveroom.VoiceLiveManager.VoiceLiveInfoOrBuilder
        public String getLiveId() {
            return this.liveId_;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.VoiceLiveManager.VoiceLiveInfoOrBuilder
        public ByteString getLiveIdBytes() {
            return ByteString.copyFromUtf8(this.liveId_);
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.VoiceLiveManager.VoiceLiveInfoOrBuilder
        public VoiceLiveMode getLiveMode() {
            VoiceLiveMode voiceLiveModeForNumber = VoiceLiveMode.forNumber(this.liveMode_);
            return voiceLiveModeForNumber == null ? VoiceLiveMode.UNRECOGNIZED : voiceLiveModeForNumber;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.VoiceLiveManager.VoiceLiveInfoOrBuilder
        public int getLiveModeValue() {
            return this.liveMode_;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.VoiceLiveManager.VoiceLiveInfoOrBuilder
        public long getRewardPoint() {
            return this.rewardPoint_;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.VoiceLiveManager.VoiceLiveInfoOrBuilder
        public String getRoomId() {
            return this.roomId_;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.VoiceLiveManager.VoiceLiveInfoOrBuilder
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
            long j = this.rewardPoint_;
            if (j != 0) {
                iK += CodedOutputStream.P(3, j);
            }
            if (this.liveMode_ != VoiceLiveMode.normal.getNumber()) {
                iK += CodedOutputStream.m(4, this.liveMode_);
            }
            if (!this.template_.isEmpty()) {
                iK += CodedOutputStream.K(5, getTemplate());
            }
            ((GeneratedMessageLite) this).memoizedSerializedSize = iK;
            return iK;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.VoiceLiveManager.VoiceLiveInfoOrBuilder
        public String getTemplate() {
            return this.template_;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.VoiceLiveManager.VoiceLiveInfoOrBuilder
        public ByteString getTemplateBytes() {
            return ByteString.copyFromUtf8(this.template_);
        }

        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (!this.roomId_.isEmpty()) {
                codedOutputStream.D0(1, getRoomId());
            }
            if (!this.liveId_.isEmpty()) {
                codedOutputStream.D0(2, getLiveId());
            }
            long j = this.rewardPoint_;
            if (j != 0) {
                codedOutputStream.I0(3, j);
            }
            if (this.liveMode_ != VoiceLiveMode.normal.getNumber()) {
                codedOutputStream.i0(4, this.liveMode_);
            }
            if (this.template_.isEmpty()) {
                return;
            }
            codedOutputStream.D0(5, getTemplate());
        }

        public enum VoiceLiveMode implements l.c {
            normal(0),
            auction(1),
            boss(2),
            virtualAvatar(4),
            commercialRoom(5),
            radio3(6),
            radio5(7),
            UNRECOGNIZED(-1);

            public static final int auction_VALUE = 1;
            public static final int boss_VALUE = 2;
            public static final int commercialRoom_VALUE = 5;
            private static final l.d<VoiceLiveMode> internalValueMap = new l.d<VoiceLiveMode>() { // from class: com.p1.mobile.longlink.msg.liveroom.VoiceLiveManager.VoiceLiveInfo.VoiceLiveMode.1
                public VoiceLiveMode findValueByNumber(int i) {
                    return VoiceLiveMode.forNumber(i);
                }
            };
            public static final int normal_VALUE = 0;
            public static final int radio3_VALUE = 6;
            public static final int radio5_VALUE = 7;
            public static final int virtualAvatar_VALUE = 4;
            private final int value;

            VoiceLiveMode(int i) {
                this.value = i;
            }

            public static VoiceLiveMode forNumber(int i) {
                if (i == 0) {
                    return normal;
                }
                if (i == 1) {
                    return auction;
                }
                if (i == 2) {
                    return boss;
                }
                if (i == 4) {
                    return virtualAvatar;
                }
                if (i == 5) {
                    return commercialRoom;
                }
                if (i == 6) {
                    return radio3;
                }
                if (i != 7) {
                    return null;
                }
                return radio5;
            }

            public static l.d<VoiceLiveMode> internalGetValueMap() {
                return internalValueMap;
            }

            public final int getNumber() {
                return this.value;
            }

            @Deprecated
            public static VoiceLiveMode valueOf(int i) {
                return forNumber(i);
            }
        }

        public static VoiceLiveInfo parseDelimitedFrom(InputStream inputStream, h hVar) throws IOException {
            return (VoiceLiveInfo) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, hVar);
        }

        public static VoiceLiveInfo parseFrom(ByteString byteString, h hVar) throws InvalidProtocolBufferException {
            return (VoiceLiveInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, hVar);
        }

        public static VoiceLiveInfo parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (VoiceLiveInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static VoiceLiveInfo parseFrom(byte[] bArr, h hVar) throws InvalidProtocolBufferException {
            return (VoiceLiveInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, hVar);
        }

        public static VoiceLiveInfo parseFrom(InputStream inputStream) throws IOException {
            return (VoiceLiveInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static VoiceLiveInfo parseFrom(InputStream inputStream, h hVar) throws IOException {
            return (VoiceLiveInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, hVar);
        }

        public static VoiceLiveInfo parseFrom(e eVar) throws IOException {
            return (VoiceLiveInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, eVar);
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.toBuilder();
        }

        public static VoiceLiveInfo parseFrom(e eVar, h hVar) throws IOException {
            return (VoiceLiveInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, eVar, hVar);
        }
    }

    public static final class VoiceManagerUpdate extends GeneratedMessageLite<VoiceManagerUpdate, Builder> implements VoiceManagerUpdateOrBuilder {
        private static final VoiceManagerUpdate DEFAULT_INSTANCE;
        public static final int LIVEID_FIELD_NUMBER = 1;
        private static volatile i860<VoiceManagerUpdate> PARSER = null;
        public static final int TYPE_FIELD_NUMBER = 3;
        public static final int USERID_FIELD_NUMBER = 2;
        private int type_;
        private String liveId_ = "";
        private String userId_ = "";

        public static final class Builder extends GeneratedMessageLite.b<VoiceManagerUpdate, Builder> implements VoiceManagerUpdateOrBuilder {
            private Builder() {
                super(VoiceManagerUpdate.DEFAULT_INSTANCE);
            }

            public Builder clearLiveId() {
                copyOnWrite();
                ((VoiceManagerUpdate) ((GeneratedMessageLite.b) this).instance).clearLiveId();
                return this;
            }

            public Builder clearType() {
                copyOnWrite();
                ((VoiceManagerUpdate) ((GeneratedMessageLite.b) this).instance).clearType();
                return this;
            }

            public Builder clearUserId() {
                copyOnWrite();
                ((VoiceManagerUpdate) ((GeneratedMessageLite.b) this).instance).clearUserId();
                return this;
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.VoiceLiveManager.VoiceManagerUpdateOrBuilder
            public String getLiveId() {
                return ((VoiceManagerUpdate) ((GeneratedMessageLite.b) this).instance).getLiveId();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.VoiceLiveManager.VoiceManagerUpdateOrBuilder
            public ByteString getLiveIdBytes() {
                return ((VoiceManagerUpdate) ((GeneratedMessageLite.b) this).instance).getLiveIdBytes();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.VoiceLiveManager.VoiceManagerUpdateOrBuilder
            public UpdateType getType() {
                return ((VoiceManagerUpdate) ((GeneratedMessageLite.b) this).instance).getType();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.VoiceLiveManager.VoiceManagerUpdateOrBuilder
            public int getTypeValue() {
                return ((VoiceManagerUpdate) ((GeneratedMessageLite.b) this).instance).getTypeValue();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.VoiceLiveManager.VoiceManagerUpdateOrBuilder
            public String getUserId() {
                return ((VoiceManagerUpdate) ((GeneratedMessageLite.b) this).instance).getUserId();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.VoiceLiveManager.VoiceManagerUpdateOrBuilder
            public ByteString getUserIdBytes() {
                return ((VoiceManagerUpdate) ((GeneratedMessageLite.b) this).instance).getUserIdBytes();
            }

            public Builder setLiveId(String str) {
                copyOnWrite();
                ((VoiceManagerUpdate) ((GeneratedMessageLite.b) this).instance).setLiveId(str);
                return this;
            }

            public Builder setLiveIdBytes(ByteString byteString) {
                copyOnWrite();
                ((VoiceManagerUpdate) ((GeneratedMessageLite.b) this).instance).setLiveIdBytes(byteString);
                return this;
            }

            public Builder setType(UpdateType updateType) {
                copyOnWrite();
                ((VoiceManagerUpdate) ((GeneratedMessageLite.b) this).instance).setType(updateType);
                return this;
            }

            public Builder setTypeValue(int i) {
                copyOnWrite();
                ((VoiceManagerUpdate) ((GeneratedMessageLite.b) this).instance).setTypeValue(i);
                return this;
            }

            public Builder setUserId(String str) {
                copyOnWrite();
                ((VoiceManagerUpdate) ((GeneratedMessageLite.b) this).instance).setUserId(str);
                return this;
            }

            public Builder setUserIdBytes(ByteString byteString) {
                copyOnWrite();
                ((VoiceManagerUpdate) ((GeneratedMessageLite.b) this).instance).setUserIdBytes(byteString);
                return this;
            }
        }

        static {
            VoiceManagerUpdate voiceManagerUpdate = new VoiceManagerUpdate();
            DEFAULT_INSTANCE = voiceManagerUpdate;
            voiceManagerUpdate.makeImmutable();
        }

        private VoiceManagerUpdate() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearLiveId() {
            this.liveId_ = getDefaultInstance().getLiveId();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearType() {
            this.type_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearUserId() {
            this.userId_ = getDefaultInstance().getUserId();
        }

        public static VoiceManagerUpdate getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder(VoiceManagerUpdate voiceManagerUpdate) {
            return (Builder) ((Builder) DEFAULT_INSTANCE.toBuilder()).mergeFrom(voiceManagerUpdate);
        }

        public static VoiceManagerUpdate parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (VoiceManagerUpdate) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static VoiceManagerUpdate parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (VoiceManagerUpdate) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static i860<VoiceManagerUpdate> parser() {
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
        public void setType(UpdateType updateType) {
            updateType.getClass();
            this.type_ = updateType.getNumber();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTypeValue(int i) {
            this.type_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setUserId(String str) {
            str.getClass();
            this.userId_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setUserIdBytes(ByteString byteString) {
            byteString.getClass();
            a.checkByteStringIsUtf8(byteString);
            this.userId_ = byteString.toStringUtf8();
        }

        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            boolean z = false;
            switch (C04441.f1687xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new VoiceManagerUpdate();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                    return null;
                case 4:
                    return new Builder();
                case 5:
                    GeneratedMessageLite.h hVar = (GeneratedMessageLite.h) obj;
                    VoiceManagerUpdate voiceManagerUpdate = (VoiceManagerUpdate) obj2;
                    this.liveId_ = hVar.f(!this.liveId_.isEmpty(), this.liveId_, !voiceManagerUpdate.liveId_.isEmpty(), voiceManagerUpdate.liveId_);
                    this.userId_ = hVar.f(!this.userId_.isEmpty(), this.userId_, !voiceManagerUpdate.userId_.isEmpty(), voiceManagerUpdate.userId_);
                    int i = this.type_;
                    boolean z2 = i != 0;
                    int i2 = voiceManagerUpdate.type_;
                    this.type_ = hVar.e(z2, i, i2 != 0, i2);
                    GeneratedMessageLite.g gVar = GeneratedMessageLite.g.INSTANCE;
                    return this;
                case 6:
                    e eVar = (e) obj;
                    while (!z) {
                        try {
                            int iM = eVar.M();
                            if (iM != 0) {
                                if (iM == 10) {
                                    this.liveId_ = eVar.L();
                                } else if (iM == 18) {
                                    this.userId_ = eVar.L();
                                } else if (iM == 24) {
                                    this.type_ = eVar.p();
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
                        synchronized (VoiceManagerUpdate.class) {
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

        @Override // com.p1.mobile.longlink.msg.liveroom.VoiceLiveManager.VoiceManagerUpdateOrBuilder
        public String getLiveId() {
            return this.liveId_;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.VoiceLiveManager.VoiceManagerUpdateOrBuilder
        public ByteString getLiveIdBytes() {
            return ByteString.copyFromUtf8(this.liveId_);
        }

        public int getSerializedSize() {
            int i = ((GeneratedMessageLite) this).memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int iK = !this.liveId_.isEmpty() ? CodedOutputStream.K(1, getLiveId()) : 0;
            if (!this.userId_.isEmpty()) {
                iK += CodedOutputStream.K(2, getUserId());
            }
            if (this.type_ != UpdateType.Add.getNumber()) {
                iK += CodedOutputStream.m(3, this.type_);
            }
            ((GeneratedMessageLite) this).memoizedSerializedSize = iK;
            return iK;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.VoiceLiveManager.VoiceManagerUpdateOrBuilder
        public UpdateType getType() {
            UpdateType updateTypeForNumber = UpdateType.forNumber(this.type_);
            return updateTypeForNumber == null ? UpdateType.UNRECOGNIZED : updateTypeForNumber;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.VoiceLiveManager.VoiceManagerUpdateOrBuilder
        public int getTypeValue() {
            return this.type_;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.VoiceLiveManager.VoiceManagerUpdateOrBuilder
        public String getUserId() {
            return this.userId_;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.VoiceLiveManager.VoiceManagerUpdateOrBuilder
        public ByteString getUserIdBytes() {
            return ByteString.copyFromUtf8(this.userId_);
        }

        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (!this.liveId_.isEmpty()) {
                codedOutputStream.D0(1, getLiveId());
            }
            if (!this.userId_.isEmpty()) {
                codedOutputStream.D0(2, getUserId());
            }
            if (this.type_ != UpdateType.Add.getNumber()) {
                codedOutputStream.i0(3, this.type_);
            }
        }

        public enum UpdateType implements l.c {
            Add(0),
            Remove(1),
            UNRECOGNIZED(-1);

            public static final int Add_VALUE = 0;
            public static final int Remove_VALUE = 1;
            private static final l.d<UpdateType> internalValueMap = new l.d<UpdateType>() { // from class: com.p1.mobile.longlink.msg.liveroom.VoiceLiveManager.VoiceManagerUpdate.UpdateType.1
                public UpdateType findValueByNumber(int i) {
                    return UpdateType.forNumber(i);
                }
            };
            private final int value;

            UpdateType(int i) {
                this.value = i;
            }

            public static UpdateType forNumber(int i) {
                if (i == 0) {
                    return Add;
                }
                if (i != 1) {
                    return null;
                }
                return Remove;
            }

            public static l.d<UpdateType> internalGetValueMap() {
                return internalValueMap;
            }

            public final int getNumber() {
                return this.value;
            }

            @Deprecated
            public static UpdateType valueOf(int i) {
                return forNumber(i);
            }
        }

        public static VoiceManagerUpdate parseDelimitedFrom(InputStream inputStream, h hVar) throws IOException {
            return (VoiceManagerUpdate) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, hVar);
        }

        public static VoiceManagerUpdate parseFrom(ByteString byteString, h hVar) throws InvalidProtocolBufferException {
            return (VoiceManagerUpdate) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, hVar);
        }

        public static VoiceManagerUpdate parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (VoiceManagerUpdate) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static VoiceManagerUpdate parseFrom(byte[] bArr, h hVar) throws InvalidProtocolBufferException {
            return (VoiceManagerUpdate) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, hVar);
        }

        public static VoiceManagerUpdate parseFrom(InputStream inputStream) throws IOException {
            return (VoiceManagerUpdate) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static VoiceManagerUpdate parseFrom(InputStream inputStream, h hVar) throws IOException {
            return (VoiceManagerUpdate) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, hVar);
        }

        public static VoiceManagerUpdate parseFrom(e eVar) throws IOException {
            return (VoiceManagerUpdate) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, eVar);
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.toBuilder();
        }

        public static VoiceManagerUpdate parseFrom(e eVar, h hVar) throws IOException {
            return (VoiceManagerUpdate) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, eVar, hVar);
        }
    }

    public static final class VoiceFreeCallUpdate extends GeneratedMessageLite<VoiceFreeCallUpdate, Builder> implements VoiceFreeCallUpdateOrBuilder {
        private static final VoiceFreeCallUpdate DEFAULT_INSTANCE;
        public static final int FREECALL_FIELD_NUMBER = 3;
        private static volatile i860<VoiceFreeCallUpdate> PARSER = null;
        public static final int ROOMID_FIELD_NUMBER = 1;
        public static final int USERID_FIELD_NUMBER = 2;
        private boolean freeCall_;
        private String roomId_ = "";
        private String userId_ = "";

        public static final class Builder extends GeneratedMessageLite.b<VoiceFreeCallUpdate, Builder> implements VoiceFreeCallUpdateOrBuilder {
            private Builder() {
                super(VoiceFreeCallUpdate.DEFAULT_INSTANCE);
            }

            public Builder clearFreeCall() {
                copyOnWrite();
                ((VoiceFreeCallUpdate) ((GeneratedMessageLite.b) this).instance).clearFreeCall();
                return this;
            }

            public Builder clearRoomId() {
                copyOnWrite();
                ((VoiceFreeCallUpdate) ((GeneratedMessageLite.b) this).instance).clearRoomId();
                return this;
            }

            public Builder clearUserId() {
                copyOnWrite();
                ((VoiceFreeCallUpdate) ((GeneratedMessageLite.b) this).instance).clearUserId();
                return this;
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.VoiceLiveManager.VoiceFreeCallUpdateOrBuilder
            public boolean getFreeCall() {
                return ((VoiceFreeCallUpdate) ((GeneratedMessageLite.b) this).instance).getFreeCall();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.VoiceLiveManager.VoiceFreeCallUpdateOrBuilder
            public String getRoomId() {
                return ((VoiceFreeCallUpdate) ((GeneratedMessageLite.b) this).instance).getRoomId();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.VoiceLiveManager.VoiceFreeCallUpdateOrBuilder
            public ByteString getRoomIdBytes() {
                return ((VoiceFreeCallUpdate) ((GeneratedMessageLite.b) this).instance).getRoomIdBytes();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.VoiceLiveManager.VoiceFreeCallUpdateOrBuilder
            public String getUserId() {
                return ((VoiceFreeCallUpdate) ((GeneratedMessageLite.b) this).instance).getUserId();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.VoiceLiveManager.VoiceFreeCallUpdateOrBuilder
            public ByteString getUserIdBytes() {
                return ((VoiceFreeCallUpdate) ((GeneratedMessageLite.b) this).instance).getUserIdBytes();
            }

            public Builder setFreeCall(boolean z) {
                copyOnWrite();
                ((VoiceFreeCallUpdate) ((GeneratedMessageLite.b) this).instance).setFreeCall(z);
                return this;
            }

            public Builder setRoomId(String str) {
                copyOnWrite();
                ((VoiceFreeCallUpdate) ((GeneratedMessageLite.b) this).instance).setRoomId(str);
                return this;
            }

            public Builder setRoomIdBytes(ByteString byteString) {
                copyOnWrite();
                ((VoiceFreeCallUpdate) ((GeneratedMessageLite.b) this).instance).setRoomIdBytes(byteString);
                return this;
            }

            public Builder setUserId(String str) {
                copyOnWrite();
                ((VoiceFreeCallUpdate) ((GeneratedMessageLite.b) this).instance).setUserId(str);
                return this;
            }

            public Builder setUserIdBytes(ByteString byteString) {
                copyOnWrite();
                ((VoiceFreeCallUpdate) ((GeneratedMessageLite.b) this).instance).setUserIdBytes(byteString);
                return this;
            }
        }

        static {
            VoiceFreeCallUpdate voiceFreeCallUpdate = new VoiceFreeCallUpdate();
            DEFAULT_INSTANCE = voiceFreeCallUpdate;
            voiceFreeCallUpdate.makeImmutable();
        }

        private VoiceFreeCallUpdate() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearFreeCall() {
            this.freeCall_ = false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearRoomId() {
            this.roomId_ = getDefaultInstance().getRoomId();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearUserId() {
            this.userId_ = getDefaultInstance().getUserId();
        }

        public static VoiceFreeCallUpdate getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder(VoiceFreeCallUpdate voiceFreeCallUpdate) {
            return (Builder) ((Builder) DEFAULT_INSTANCE.toBuilder()).mergeFrom(voiceFreeCallUpdate);
        }

        public static VoiceFreeCallUpdate parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (VoiceFreeCallUpdate) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static VoiceFreeCallUpdate parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (VoiceFreeCallUpdate) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static i860<VoiceFreeCallUpdate> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setFreeCall(boolean z) {
            this.freeCall_ = z;
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
        public void setUserId(String str) {
            str.getClass();
            this.userId_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setUserIdBytes(ByteString byteString) {
            byteString.getClass();
            a.checkByteStringIsUtf8(byteString);
            this.userId_ = byteString.toStringUtf8();
        }

        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (C04441.f1687xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new VoiceFreeCallUpdate();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                    return null;
                case 4:
                    return new Builder();
                case 5:
                    GeneratedMessageLite.h hVar = (GeneratedMessageLite.h) obj;
                    VoiceFreeCallUpdate voiceFreeCallUpdate = (VoiceFreeCallUpdate) obj2;
                    this.roomId_ = hVar.f(!this.roomId_.isEmpty(), this.roomId_, !voiceFreeCallUpdate.roomId_.isEmpty(), voiceFreeCallUpdate.roomId_);
                    this.userId_ = hVar.f(!this.userId_.isEmpty(), this.userId_, true ^ voiceFreeCallUpdate.userId_.isEmpty(), voiceFreeCallUpdate.userId_);
                    boolean z = this.freeCall_;
                    boolean z2 = voiceFreeCallUpdate.freeCall_;
                    this.freeCall_ = hVar.d(z, z, z2, z2);
                    GeneratedMessageLite.g gVar = GeneratedMessageLite.g.INSTANCE;
                    return this;
                case 6:
                    e eVar = (e) obj;
                    boolean z3 = false;
                    while (!z3) {
                        try {
                            int iM = eVar.M();
                            if (iM != 0) {
                                if (iM == 10) {
                                    this.roomId_ = eVar.L();
                                } else if (iM == 18) {
                                    this.userId_ = eVar.L();
                                } else if (iM == 24) {
                                    this.freeCall_ = eVar.m();
                                } else if (!eVar.R(iM)) {
                                }
                            }
                            z3 = true;
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
                        synchronized (VoiceFreeCallUpdate.class) {
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

        @Override // com.p1.mobile.longlink.msg.liveroom.VoiceLiveManager.VoiceFreeCallUpdateOrBuilder
        public boolean getFreeCall() {
            return this.freeCall_;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.VoiceLiveManager.VoiceFreeCallUpdateOrBuilder
        public String getRoomId() {
            return this.roomId_;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.VoiceLiveManager.VoiceFreeCallUpdateOrBuilder
        public ByteString getRoomIdBytes() {
            return ByteString.copyFromUtf8(this.roomId_);
        }

        public int getSerializedSize() {
            int i = ((GeneratedMessageLite) this).memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int iK = !this.roomId_.isEmpty() ? CodedOutputStream.K(1, getRoomId()) : 0;
            if (!this.userId_.isEmpty()) {
                iK += CodedOutputStream.K(2, getUserId());
            }
            boolean z = this.freeCall_;
            if (z) {
                iK += CodedOutputStream.f(3, z);
            }
            ((GeneratedMessageLite) this).memoizedSerializedSize = iK;
            return iK;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.VoiceLiveManager.VoiceFreeCallUpdateOrBuilder
        public String getUserId() {
            return this.userId_;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.VoiceLiveManager.VoiceFreeCallUpdateOrBuilder
        public ByteString getUserIdBytes() {
            return ByteString.copyFromUtf8(this.userId_);
        }

        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (!this.roomId_.isEmpty()) {
                codedOutputStream.D0(1, getRoomId());
            }
            if (!this.userId_.isEmpty()) {
                codedOutputStream.D0(2, getUserId());
            }
            boolean z = this.freeCall_;
            if (z) {
                codedOutputStream.a0(3, z);
            }
        }

        public static VoiceFreeCallUpdate parseDelimitedFrom(InputStream inputStream, h hVar) throws IOException {
            return (VoiceFreeCallUpdate) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, hVar);
        }

        public static VoiceFreeCallUpdate parseFrom(ByteString byteString, h hVar) throws InvalidProtocolBufferException {
            return (VoiceFreeCallUpdate) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, hVar);
        }

        public static VoiceFreeCallUpdate parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (VoiceFreeCallUpdate) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static VoiceFreeCallUpdate parseFrom(byte[] bArr, h hVar) throws InvalidProtocolBufferException {
            return (VoiceFreeCallUpdate) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, hVar);
        }

        public static VoiceFreeCallUpdate parseFrom(InputStream inputStream) throws IOException {
            return (VoiceFreeCallUpdate) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static VoiceFreeCallUpdate parseFrom(InputStream inputStream, h hVar) throws IOException {
            return (VoiceFreeCallUpdate) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, hVar);
        }

        public static VoiceFreeCallUpdate parseFrom(e eVar) throws IOException {
            return (VoiceFreeCallUpdate) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, eVar);
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.toBuilder();
        }

        public static VoiceFreeCallUpdate parseFrom(e eVar, h hVar) throws IOException {
            return (VoiceFreeCallUpdate) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, eVar, hVar);
        }
    }

    public static final class VoiceLiveHeartBeatInfo extends GeneratedMessageLite<VoiceLiveHeartBeatInfo, Builder> implements VoiceLiveHeartBeatInfoOrBuilder {
        private static final VoiceLiveHeartBeatInfo DEFAULT_INSTANCE;
        public static final int HEARTBEATS_FIELD_NUMBER = 3;
        public static final int LIVEID_FIELD_NUMBER = 2;
        private static volatile i860<VoiceLiveHeartBeatInfo> PARSER = null;
        public static final int ROOMID_FIELD_NUMBER = 1;
        public static final int TIMESTAMP_FIELD_NUMBER = 4;
        private long heartBeats_;
        private long timestamp_;
        private String roomId_ = "";
        private String liveId_ = "";

        public static final class Builder extends GeneratedMessageLite.b<VoiceLiveHeartBeatInfo, Builder> implements VoiceLiveHeartBeatInfoOrBuilder {
            private Builder() {
                super(VoiceLiveHeartBeatInfo.DEFAULT_INSTANCE);
            }

            public Builder clearHeartBeats() {
                copyOnWrite();
                ((VoiceLiveHeartBeatInfo) ((GeneratedMessageLite.b) this).instance).clearHeartBeats();
                return this;
            }

            public Builder clearLiveId() {
                copyOnWrite();
                ((VoiceLiveHeartBeatInfo) ((GeneratedMessageLite.b) this).instance).clearLiveId();
                return this;
            }

            public Builder clearRoomId() {
                copyOnWrite();
                ((VoiceLiveHeartBeatInfo) ((GeneratedMessageLite.b) this).instance).clearRoomId();
                return this;
            }

            public Builder clearTimestamp() {
                copyOnWrite();
                ((VoiceLiveHeartBeatInfo) ((GeneratedMessageLite.b) this).instance).clearTimestamp();
                return this;
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.VoiceLiveManager.VoiceLiveHeartBeatInfoOrBuilder
            public long getHeartBeats() {
                return ((VoiceLiveHeartBeatInfo) ((GeneratedMessageLite.b) this).instance).getHeartBeats();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.VoiceLiveManager.VoiceLiveHeartBeatInfoOrBuilder
            public String getLiveId() {
                return ((VoiceLiveHeartBeatInfo) ((GeneratedMessageLite.b) this).instance).getLiveId();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.VoiceLiveManager.VoiceLiveHeartBeatInfoOrBuilder
            public ByteString getLiveIdBytes() {
                return ((VoiceLiveHeartBeatInfo) ((GeneratedMessageLite.b) this).instance).getLiveIdBytes();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.VoiceLiveManager.VoiceLiveHeartBeatInfoOrBuilder
            public String getRoomId() {
                return ((VoiceLiveHeartBeatInfo) ((GeneratedMessageLite.b) this).instance).getRoomId();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.VoiceLiveManager.VoiceLiveHeartBeatInfoOrBuilder
            public ByteString getRoomIdBytes() {
                return ((VoiceLiveHeartBeatInfo) ((GeneratedMessageLite.b) this).instance).getRoomIdBytes();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.VoiceLiveManager.VoiceLiveHeartBeatInfoOrBuilder
            public long getTimestamp() {
                return ((VoiceLiveHeartBeatInfo) ((GeneratedMessageLite.b) this).instance).getTimestamp();
            }

            public Builder setHeartBeats(long j) {
                copyOnWrite();
                ((VoiceLiveHeartBeatInfo) ((GeneratedMessageLite.b) this).instance).setHeartBeats(j);
                return this;
            }

            public Builder setLiveId(String str) {
                copyOnWrite();
                ((VoiceLiveHeartBeatInfo) ((GeneratedMessageLite.b) this).instance).setLiveId(str);
                return this;
            }

            public Builder setLiveIdBytes(ByteString byteString) {
                copyOnWrite();
                ((VoiceLiveHeartBeatInfo) ((GeneratedMessageLite.b) this).instance).setLiveIdBytes(byteString);
                return this;
            }

            public Builder setRoomId(String str) {
                copyOnWrite();
                ((VoiceLiveHeartBeatInfo) ((GeneratedMessageLite.b) this).instance).setRoomId(str);
                return this;
            }

            public Builder setRoomIdBytes(ByteString byteString) {
                copyOnWrite();
                ((VoiceLiveHeartBeatInfo) ((GeneratedMessageLite.b) this).instance).setRoomIdBytes(byteString);
                return this;
            }

            public Builder setTimestamp(long j) {
                copyOnWrite();
                ((VoiceLiveHeartBeatInfo) ((GeneratedMessageLite.b) this).instance).setTimestamp(j);
                return this;
            }
        }

        static {
            VoiceLiveHeartBeatInfo voiceLiveHeartBeatInfo = new VoiceLiveHeartBeatInfo();
            DEFAULT_INSTANCE = voiceLiveHeartBeatInfo;
            voiceLiveHeartBeatInfo.makeImmutable();
        }

        private VoiceLiveHeartBeatInfo() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearHeartBeats() {
            this.heartBeats_ = 0L;
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
        public void clearTimestamp() {
            this.timestamp_ = 0L;
        }

        public static VoiceLiveHeartBeatInfo getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder(VoiceLiveHeartBeatInfo voiceLiveHeartBeatInfo) {
            return (Builder) ((Builder) DEFAULT_INSTANCE.toBuilder()).mergeFrom(voiceLiveHeartBeatInfo);
        }

        public static VoiceLiveHeartBeatInfo parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (VoiceLiveHeartBeatInfo) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static VoiceLiveHeartBeatInfo parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (VoiceLiveHeartBeatInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static i860<VoiceLiveHeartBeatInfo> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setHeartBeats(long j) {
            this.heartBeats_ = j;
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
        public void setTimestamp(long j) {
            this.timestamp_ = j;
        }

        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            boolean z = false;
            switch (C04441.f1687xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new VoiceLiveHeartBeatInfo();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                    return null;
                case 4:
                    return new Builder();
                case 5:
                    GeneratedMessageLite.h hVar = (GeneratedMessageLite.h) obj;
                    VoiceLiveHeartBeatInfo voiceLiveHeartBeatInfo = (VoiceLiveHeartBeatInfo) obj2;
                    this.roomId_ = hVar.f(!this.roomId_.isEmpty(), this.roomId_, !voiceLiveHeartBeatInfo.roomId_.isEmpty(), voiceLiveHeartBeatInfo.roomId_);
                    this.liveId_ = hVar.f(!this.liveId_.isEmpty(), this.liveId_, !voiceLiveHeartBeatInfo.liveId_.isEmpty(), voiceLiveHeartBeatInfo.liveId_);
                    long j = this.heartBeats_;
                    boolean z2 = j != 0;
                    long j2 = voiceLiveHeartBeatInfo.heartBeats_;
                    this.heartBeats_ = hVar.i(z2, j, j2 != 0, j2);
                    boolean z3 = false;
                    long j3 = this.timestamp_;
                    if (j3 != 0) {
                        z3 = true;
                    }
                    long j4 = voiceLiveHeartBeatInfo.timestamp_;
                    this.timestamp_ = hVar.i(z3, j3, j4 != 0, j4);
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
                                } else if (iM == 24) {
                                    this.heartBeats_ = eVar.v();
                                } else if (iM == 32) {
                                    this.timestamp_ = eVar.v();
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
                        synchronized (VoiceLiveHeartBeatInfo.class) {
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

        @Override // com.p1.mobile.longlink.msg.liveroom.VoiceLiveManager.VoiceLiveHeartBeatInfoOrBuilder
        public long getHeartBeats() {
            return this.heartBeats_;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.VoiceLiveManager.VoiceLiveHeartBeatInfoOrBuilder
        public String getLiveId() {
            return this.liveId_;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.VoiceLiveManager.VoiceLiveHeartBeatInfoOrBuilder
        public ByteString getLiveIdBytes() {
            return ByteString.copyFromUtf8(this.liveId_);
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.VoiceLiveManager.VoiceLiveHeartBeatInfoOrBuilder
        public String getRoomId() {
            return this.roomId_;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.VoiceLiveManager.VoiceLiveHeartBeatInfoOrBuilder
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
            long j = this.heartBeats_;
            if (j != 0) {
                iK += CodedOutputStream.v(3, j);
            }
            long j2 = this.timestamp_;
            if (j2 != 0) {
                iK += CodedOutputStream.v(4, j2);
            }
            ((GeneratedMessageLite) this).memoizedSerializedSize = iK;
            return iK;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.VoiceLiveManager.VoiceLiveHeartBeatInfoOrBuilder
        public long getTimestamp() {
            return this.timestamp_;
        }

        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (!this.roomId_.isEmpty()) {
                codedOutputStream.D0(1, getRoomId());
            }
            if (!this.liveId_.isEmpty()) {
                codedOutputStream.D0(2, getLiveId());
            }
            long j = this.heartBeats_;
            if (j != 0) {
                codedOutputStream.u0(3, j);
            }
            long j2 = this.timestamp_;
            if (j2 != 0) {
                codedOutputStream.u0(4, j2);
            }
        }

        public static VoiceLiveHeartBeatInfo parseDelimitedFrom(InputStream inputStream, h hVar) throws IOException {
            return (VoiceLiveHeartBeatInfo) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, hVar);
        }

        public static VoiceLiveHeartBeatInfo parseFrom(ByteString byteString, h hVar) throws InvalidProtocolBufferException {
            return (VoiceLiveHeartBeatInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, hVar);
        }

        public static VoiceLiveHeartBeatInfo parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (VoiceLiveHeartBeatInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static VoiceLiveHeartBeatInfo parseFrom(byte[] bArr, h hVar) throws InvalidProtocolBufferException {
            return (VoiceLiveHeartBeatInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, hVar);
        }

        public static VoiceLiveHeartBeatInfo parseFrom(InputStream inputStream) throws IOException {
            return (VoiceLiveHeartBeatInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static VoiceLiveHeartBeatInfo parseFrom(InputStream inputStream, h hVar) throws IOException {
            return (VoiceLiveHeartBeatInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, hVar);
        }

        public static VoiceLiveHeartBeatInfo parseFrom(e eVar) throws IOException {
            return (VoiceLiveHeartBeatInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, eVar);
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.toBuilder();
        }

        public static VoiceLiveHeartBeatInfo parseFrom(e eVar, h hVar) throws IOException {
            return (VoiceLiveHeartBeatInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, eVar, hVar);
        }
    }

    public static final class VoiceManagerInvite extends GeneratedMessageLite<VoiceManagerInvite, Builder> implements VoiceManagerInviteOrBuilder {
        private static final VoiceManagerInvite DEFAULT_INSTANCE;
        public static final int INVITEID_FIELD_NUMBER = 3;
        public static final int LIVEID_FIELD_NUMBER = 1;
        private static volatile i860<VoiceManagerInvite> PARSER = null;
        public static final int USERID_FIELD_NUMBER = 2;
        private String liveId_ = "";
        private String userId_ = "";
        private String inviteId_ = "";

        public static final class Builder extends GeneratedMessageLite.b<VoiceManagerInvite, Builder> implements VoiceManagerInviteOrBuilder {
            private Builder() {
                super(VoiceManagerInvite.DEFAULT_INSTANCE);
            }

            public Builder clearInviteId() {
                copyOnWrite();
                ((VoiceManagerInvite) ((GeneratedMessageLite.b) this).instance).clearInviteId();
                return this;
            }

            public Builder clearLiveId() {
                copyOnWrite();
                ((VoiceManagerInvite) ((GeneratedMessageLite.b) this).instance).clearLiveId();
                return this;
            }

            public Builder clearUserId() {
                copyOnWrite();
                ((VoiceManagerInvite) ((GeneratedMessageLite.b) this).instance).clearUserId();
                return this;
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.VoiceLiveManager.VoiceManagerInviteOrBuilder
            public String getInviteId() {
                return ((VoiceManagerInvite) ((GeneratedMessageLite.b) this).instance).getInviteId();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.VoiceLiveManager.VoiceManagerInviteOrBuilder
            public ByteString getInviteIdBytes() {
                return ((VoiceManagerInvite) ((GeneratedMessageLite.b) this).instance).getInviteIdBytes();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.VoiceLiveManager.VoiceManagerInviteOrBuilder
            public String getLiveId() {
                return ((VoiceManagerInvite) ((GeneratedMessageLite.b) this).instance).getLiveId();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.VoiceLiveManager.VoiceManagerInviteOrBuilder
            public ByteString getLiveIdBytes() {
                return ((VoiceManagerInvite) ((GeneratedMessageLite.b) this).instance).getLiveIdBytes();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.VoiceLiveManager.VoiceManagerInviteOrBuilder
            public String getUserId() {
                return ((VoiceManagerInvite) ((GeneratedMessageLite.b) this).instance).getUserId();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.VoiceLiveManager.VoiceManagerInviteOrBuilder
            public ByteString getUserIdBytes() {
                return ((VoiceManagerInvite) ((GeneratedMessageLite.b) this).instance).getUserIdBytes();
            }

            public Builder setInviteId(String str) {
                copyOnWrite();
                ((VoiceManagerInvite) ((GeneratedMessageLite.b) this).instance).setInviteId(str);
                return this;
            }

            public Builder setInviteIdBytes(ByteString byteString) {
                copyOnWrite();
                ((VoiceManagerInvite) ((GeneratedMessageLite.b) this).instance).setInviteIdBytes(byteString);
                return this;
            }

            public Builder setLiveId(String str) {
                copyOnWrite();
                ((VoiceManagerInvite) ((GeneratedMessageLite.b) this).instance).setLiveId(str);
                return this;
            }

            public Builder setLiveIdBytes(ByteString byteString) {
                copyOnWrite();
                ((VoiceManagerInvite) ((GeneratedMessageLite.b) this).instance).setLiveIdBytes(byteString);
                return this;
            }

            public Builder setUserId(String str) {
                copyOnWrite();
                ((VoiceManagerInvite) ((GeneratedMessageLite.b) this).instance).setUserId(str);
                return this;
            }

            public Builder setUserIdBytes(ByteString byteString) {
                copyOnWrite();
                ((VoiceManagerInvite) ((GeneratedMessageLite.b) this).instance).setUserIdBytes(byteString);
                return this;
            }
        }

        static {
            VoiceManagerInvite voiceManagerInvite = new VoiceManagerInvite();
            DEFAULT_INSTANCE = voiceManagerInvite;
            voiceManagerInvite.makeImmutable();
        }

        private VoiceManagerInvite() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearInviteId() {
            this.inviteId_ = getDefaultInstance().getInviteId();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearLiveId() {
            this.liveId_ = getDefaultInstance().getLiveId();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearUserId() {
            this.userId_ = getDefaultInstance().getUserId();
        }

        public static VoiceManagerInvite getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder(VoiceManagerInvite voiceManagerInvite) {
            return (Builder) ((Builder) DEFAULT_INSTANCE.toBuilder()).mergeFrom(voiceManagerInvite);
        }

        public static VoiceManagerInvite parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (VoiceManagerInvite) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static VoiceManagerInvite parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (VoiceManagerInvite) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static i860<VoiceManagerInvite> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setInviteId(String str) {
            str.getClass();
            this.inviteId_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setInviteIdBytes(ByteString byteString) {
            byteString.getClass();
            a.checkByteStringIsUtf8(byteString);
            this.inviteId_ = byteString.toStringUtf8();
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
        public void setUserId(String str) {
            str.getClass();
            this.userId_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setUserIdBytes(ByteString byteString) {
            byteString.getClass();
            a.checkByteStringIsUtf8(byteString);
            this.userId_ = byteString.toStringUtf8();
        }

        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (C04441.f1687xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new VoiceManagerInvite();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                    return null;
                case 4:
                    return new Builder();
                case 5:
                    GeneratedMessageLite.h hVar = (GeneratedMessageLite.h) obj;
                    VoiceManagerInvite voiceManagerInvite = (VoiceManagerInvite) obj2;
                    this.liveId_ = hVar.f(!this.liveId_.isEmpty(), this.liveId_, !voiceManagerInvite.liveId_.isEmpty(), voiceManagerInvite.liveId_);
                    this.userId_ = hVar.f(!this.userId_.isEmpty(), this.userId_, !voiceManagerInvite.userId_.isEmpty(), voiceManagerInvite.userId_);
                    this.inviteId_ = hVar.f(!this.inviteId_.isEmpty(), this.inviteId_, true ^ voiceManagerInvite.inviteId_.isEmpty(), voiceManagerInvite.inviteId_);
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
                                    this.liveId_ = eVar.L();
                                } else if (iM == 18) {
                                    this.userId_ = eVar.L();
                                } else if (iM == 26) {
                                    this.inviteId_ = eVar.L();
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
                        synchronized (VoiceManagerInvite.class) {
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

        @Override // com.p1.mobile.longlink.msg.liveroom.VoiceLiveManager.VoiceManagerInviteOrBuilder
        public String getInviteId() {
            return this.inviteId_;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.VoiceLiveManager.VoiceManagerInviteOrBuilder
        public ByteString getInviteIdBytes() {
            return ByteString.copyFromUtf8(this.inviteId_);
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.VoiceLiveManager.VoiceManagerInviteOrBuilder
        public String getLiveId() {
            return this.liveId_;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.VoiceLiveManager.VoiceManagerInviteOrBuilder
        public ByteString getLiveIdBytes() {
            return ByteString.copyFromUtf8(this.liveId_);
        }

        public int getSerializedSize() {
            int i = ((GeneratedMessageLite) this).memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int iK = !this.liveId_.isEmpty() ? CodedOutputStream.K(1, getLiveId()) : 0;
            if (!this.userId_.isEmpty()) {
                iK += CodedOutputStream.K(2, getUserId());
            }
            if (!this.inviteId_.isEmpty()) {
                iK += CodedOutputStream.K(3, getInviteId());
            }
            ((GeneratedMessageLite) this).memoizedSerializedSize = iK;
            return iK;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.VoiceLiveManager.VoiceManagerInviteOrBuilder
        public String getUserId() {
            return this.userId_;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.VoiceLiveManager.VoiceManagerInviteOrBuilder
        public ByteString getUserIdBytes() {
            return ByteString.copyFromUtf8(this.userId_);
        }

        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (!this.liveId_.isEmpty()) {
                codedOutputStream.D0(1, getLiveId());
            }
            if (!this.userId_.isEmpty()) {
                codedOutputStream.D0(2, getUserId());
            }
            if (this.inviteId_.isEmpty()) {
                return;
            }
            codedOutputStream.D0(3, getInviteId());
        }

        public static VoiceManagerInvite parseDelimitedFrom(InputStream inputStream, h hVar) throws IOException {
            return (VoiceManagerInvite) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, hVar);
        }

        public static VoiceManagerInvite parseFrom(ByteString byteString, h hVar) throws InvalidProtocolBufferException {
            return (VoiceManagerInvite) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, hVar);
        }

        public static VoiceManagerInvite parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (VoiceManagerInvite) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static VoiceManagerInvite parseFrom(byte[] bArr, h hVar) throws InvalidProtocolBufferException {
            return (VoiceManagerInvite) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, hVar);
        }

        public static VoiceManagerInvite parseFrom(InputStream inputStream) throws IOException {
            return (VoiceManagerInvite) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static VoiceManagerInvite parseFrom(InputStream inputStream, h hVar) throws IOException {
            return (VoiceManagerInvite) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, hVar);
        }

        public static VoiceManagerInvite parseFrom(e eVar) throws IOException {
            return (VoiceManagerInvite) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, eVar);
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.toBuilder();
        }

        public static VoiceManagerInvite parseFrom(e eVar, h hVar) throws IOException {
            return (VoiceManagerInvite) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, eVar, hVar);
        }
    }
}
