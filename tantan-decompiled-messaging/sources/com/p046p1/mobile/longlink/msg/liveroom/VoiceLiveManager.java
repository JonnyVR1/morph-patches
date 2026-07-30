package com.p046p1.mobile.longlink.msg.liveroom;

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
public final class VoiceLiveManager {

    /* JADX INFO: renamed from: com.p1.mobile.longlink.msg.liveroom.VoiceLiveManager$1 */
    public static /* synthetic */ class C45321 {

        /* JADX INFO: renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f15988xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f15988xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f15988xa1df5c61[GeneratedMessageLite.MethodToInvoke.IS_INITIALIZED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f15988xa1df5c61[GeneratedMessageLite.MethodToInvoke.MAKE_IMMUTABLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f15988xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f15988xa1df5c61[GeneratedMessageLite.MethodToInvoke.VISIT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f15988xa1df5c61[GeneratedMessageLite.MethodToInvoke.MERGE_FROM_STREAM.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f15988xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f15988xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    public interface VoiceFreeCallUpdateOrBuilder extends o6z {
        @Override // p149l.o6z
        /* synthetic */ InterfaceC3419q getDefaultInstanceForType();

        boolean getFreeCall();

        String getRoomId();

        ByteString getRoomIdBytes();

        String getUserId();

        ByteString getUserIdBytes();

        @Override // p149l.o6z
        /* synthetic */ boolean isInitialized();
    }

    public interface VoiceLiveHeartBeatInfoOrBuilder extends o6z {
        @Override // p149l.o6z
        /* synthetic */ InterfaceC3419q getDefaultInstanceForType();

        long getHeartBeats();

        String getLiveId();

        ByteString getLiveIdBytes();

        String getRoomId();

        ByteString getRoomIdBytes();

        long getTimestamp();

        @Override // p149l.o6z
        /* synthetic */ boolean isInitialized();
    }

    public interface VoiceLiveInfoOrBuilder extends o6z {
        @Override // p149l.o6z
        /* synthetic */ InterfaceC3419q getDefaultInstanceForType();

        String getLiveId();

        ByteString getLiveIdBytes();

        VoiceLiveInfo.VoiceLiveMode getLiveMode();

        int getLiveModeValue();

        long getRewardPoint();

        String getRoomId();

        ByteString getRoomIdBytes();

        String getTemplate();

        ByteString getTemplateBytes();

        @Override // p149l.o6z
        /* synthetic */ boolean isInitialized();
    }

    public interface VoiceManagerInviteOrBuilder extends o6z {
        @Override // p149l.o6z
        /* synthetic */ InterfaceC3419q getDefaultInstanceForType();

        String getInviteId();

        ByteString getInviteIdBytes();

        String getLiveId();

        ByteString getLiveIdBytes();

        String getUserId();

        ByteString getUserIdBytes();

        @Override // p149l.o6z
        /* synthetic */ boolean isInitialized();
    }

    public interface VoiceManagerUpdateOrBuilder extends o6z {
        @Override // p149l.o6z
        /* synthetic */ InterfaceC3419q getDefaultInstanceForType();

        String getLiveId();

        ByteString getLiveIdBytes();

        VoiceManagerUpdate.UpdateType getType();

        int getTypeValue();

        String getUserId();

        ByteString getUserIdBytes();

        @Override // p149l.o6z
        /* synthetic */ boolean isInitialized();
    }

    private VoiceLiveManager() {
    }

    public static void registerAllExtensions(C3410h c3410h) {
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

        public static final class Builder extends GeneratedMessageLite.AbstractC3380b<VoiceLiveInfo, Builder> implements VoiceLiveInfoOrBuilder {
            private Builder() {
                super(VoiceLiveInfo.DEFAULT_INSTANCE);
            }

            public Builder clearLiveId() {
                copyOnWrite();
                ((VoiceLiveInfo) this.instance).clearLiveId();
                return this;
            }

            public Builder clearLiveMode() {
                copyOnWrite();
                ((VoiceLiveInfo) this.instance).clearLiveMode();
                return this;
            }

            public Builder clearRewardPoint() {
                copyOnWrite();
                ((VoiceLiveInfo) this.instance).clearRewardPoint();
                return this;
            }

            public Builder clearRoomId() {
                copyOnWrite();
                ((VoiceLiveInfo) this.instance).clearRoomId();
                return this;
            }

            public Builder clearTemplate() {
                copyOnWrite();
                ((VoiceLiveInfo) this.instance).clearTemplate();
                return this;
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.VoiceLiveManager.VoiceLiveInfoOrBuilder
            public String getLiveId() {
                return ((VoiceLiveInfo) this.instance).getLiveId();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.VoiceLiveManager.VoiceLiveInfoOrBuilder
            public ByteString getLiveIdBytes() {
                return ((VoiceLiveInfo) this.instance).getLiveIdBytes();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.VoiceLiveManager.VoiceLiveInfoOrBuilder
            public VoiceLiveMode getLiveMode() {
                return ((VoiceLiveInfo) this.instance).getLiveMode();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.VoiceLiveManager.VoiceLiveInfoOrBuilder
            public int getLiveModeValue() {
                return ((VoiceLiveInfo) this.instance).getLiveModeValue();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.VoiceLiveManager.VoiceLiveInfoOrBuilder
            public long getRewardPoint() {
                return ((VoiceLiveInfo) this.instance).getRewardPoint();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.VoiceLiveManager.VoiceLiveInfoOrBuilder
            public String getRoomId() {
                return ((VoiceLiveInfo) this.instance).getRoomId();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.VoiceLiveManager.VoiceLiveInfoOrBuilder
            public ByteString getRoomIdBytes() {
                return ((VoiceLiveInfo) this.instance).getRoomIdBytes();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.VoiceLiveManager.VoiceLiveInfoOrBuilder
            public String getTemplate() {
                return ((VoiceLiveInfo) this.instance).getTemplate();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.VoiceLiveManager.VoiceLiveInfoOrBuilder
            public ByteString getTemplateBytes() {
                return ((VoiceLiveInfo) this.instance).getTemplateBytes();
            }

            public Builder setLiveId(String str) {
                copyOnWrite();
                ((VoiceLiveInfo) this.instance).setLiveId(str);
                return this;
            }

            public Builder setLiveIdBytes(ByteString byteString) {
                copyOnWrite();
                ((VoiceLiveInfo) this.instance).setLiveIdBytes(byteString);
                return this;
            }

            public Builder setLiveMode(VoiceLiveMode voiceLiveMode) {
                copyOnWrite();
                ((VoiceLiveInfo) this.instance).setLiveMode(voiceLiveMode);
                return this;
            }

            public Builder setLiveModeValue(int i) {
                copyOnWrite();
                ((VoiceLiveInfo) this.instance).setLiveModeValue(i);
                return this;
            }

            public Builder setRewardPoint(long j) {
                copyOnWrite();
                ((VoiceLiveInfo) this.instance).setRewardPoint(j);
                return this;
            }

            public Builder setRoomId(String str) {
                copyOnWrite();
                ((VoiceLiveInfo) this.instance).setRoomId(str);
                return this;
            }

            public Builder setRoomIdBytes(ByteString byteString) {
                copyOnWrite();
                ((VoiceLiveInfo) this.instance).setRoomIdBytes(byteString);
                return this;
            }

            public Builder setTemplate(String str) {
                copyOnWrite();
                ((VoiceLiveInfo) this.instance).setTemplate(str);
                return this;
            }

            public Builder setTemplateBytes(ByteString byteString) {
                copyOnWrite();
                ((VoiceLiveInfo) this.instance).setTemplateBytes(byteString);
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
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(voiceLiveInfo);
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
            AbstractC3403a.checkByteStringIsUtf8(byteString);
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
            AbstractC3403a.checkByteStringIsUtf8(byteString);
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
            AbstractC3403a.checkByteStringIsUtf8(byteString);
            this.template_ = byteString.toStringUtf8();
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            boolean z = false;
            switch (C45321.f15988xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new VoiceLiveInfo();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                    return null;
                case 4:
                    return new Builder();
                case 5:
                    GeneratedMessageLite.InterfaceC3386h interfaceC3386h = (GeneratedMessageLite.InterfaceC3386h) obj;
                    VoiceLiveInfo voiceLiveInfo = (VoiceLiveInfo) obj2;
                    this.roomId_ = interfaceC3386h.mo16997f(!this.roomId_.isEmpty(), this.roomId_, !voiceLiveInfo.roomId_.isEmpty(), voiceLiveInfo.roomId_);
                    this.liveId_ = interfaceC3386h.mo16997f(!this.liveId_.isEmpty(), this.liveId_, !voiceLiveInfo.liveId_.isEmpty(), voiceLiveInfo.liveId_);
                    long j = this.rewardPoint_;
                    boolean z2 = j != 0;
                    long j2 = voiceLiveInfo.rewardPoint_;
                    this.rewardPoint_ = interfaceC3386h.mo17000i(z2, j, j2 != 0, j2);
                    int i = this.liveMode_;
                    boolean z3 = i != 0;
                    int i2 = voiceLiveInfo.liveMode_;
                    this.liveMode_ = interfaceC3386h.mo16996e(z3, i, i2 != 0, i2);
                    this.template_ = interfaceC3386h.mo16997f(!this.template_.isEmpty(), this.template_, !voiceLiveInfo.template_.isEmpty(), voiceLiveInfo.template_);
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
                                } else if (iM17116M == 24) {
                                    this.rewardPoint_ = c3407e.m17118O();
                                } else if (iM17116M == 32) {
                                    this.liveMode_ = c3407e.m17136p();
                                } else if (iM17116M == 42) {
                                    this.template_ = c3407e.m17115L();
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
                        synchronized (VoiceLiveInfo.class) {
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
            long j = this.rewardPoint_;
            if (j != 0) {
                iM16901K += CodedOutputStream.m16906P(3, j);
            }
            if (this.liveMode_ != VoiceLiveMode.normal.getNumber()) {
                iM16901K += CodedOutputStream.m16922m(4, this.liveMode_);
            }
            if (!this.template_.isEmpty()) {
                iM16901K += CodedOutputStream.m16901K(5, getTemplate());
            }
            this.memoizedSerializedSize = iM16901K;
            return iM16901K;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.VoiceLiveManager.VoiceLiveInfoOrBuilder
        public String getTemplate() {
            return this.template_;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.VoiceLiveManager.VoiceLiveInfoOrBuilder
        public ByteString getTemplateBytes() {
            return ByteString.copyFromUtf8(this.template_);
        }

        @Override // com.google.protobuf.InterfaceC3419q
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (!this.roomId_.isEmpty()) {
                codedOutputStream.mo16939D0(1, getRoomId());
            }
            if (!this.liveId_.isEmpty()) {
                codedOutputStream.mo16939D0(2, getLiveId());
            }
            long j = this.rewardPoint_;
            if (j != 0) {
                codedOutputStream.mo16944I0(3, j);
            }
            if (this.liveMode_ != VoiceLiveMode.normal.getNumber()) {
                codedOutputStream.m16960i0(4, this.liveMode_);
            }
            if (this.template_.isEmpty()) {
                return;
            }
            codedOutputStream.mo16939D0(5, getTemplate());
        }

        public enum VoiceLiveMode implements C3414l.c {
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
            private static final C3414l.d<VoiceLiveMode> internalValueMap = new C3414l.d<VoiceLiveMode>() { // from class: com.p1.mobile.longlink.msg.liveroom.VoiceLiveManager.VoiceLiveInfo.VoiceLiveMode.1
                @Override // com.google.protobuf.C3414l.d
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

            public static C3414l.d<VoiceLiveMode> internalGetValueMap() {
                return internalValueMap;
            }

            @Override // com.google.protobuf.C3414l.c
            public final int getNumber() {
                return this.value;
            }

            @Deprecated
            public static VoiceLiveMode valueOf(int i) {
                return forNumber(i);
            }
        }

        public static VoiceLiveInfo parseDelimitedFrom(InputStream inputStream, C3410h c3410h) throws IOException {
            return (VoiceLiveInfo) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, c3410h);
        }

        public static VoiceLiveInfo parseFrom(ByteString byteString, C3410h c3410h) throws InvalidProtocolBufferException {
            return (VoiceLiveInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, c3410h);
        }

        public static VoiceLiveInfo parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (VoiceLiveInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static VoiceLiveInfo parseFrom(byte[] bArr, C3410h c3410h) throws InvalidProtocolBufferException {
            return (VoiceLiveInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, c3410h);
        }

        public static VoiceLiveInfo parseFrom(InputStream inputStream) throws IOException {
            return (VoiceLiveInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static VoiceLiveInfo parseFrom(InputStream inputStream, C3410h c3410h) throws IOException {
            return (VoiceLiveInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, c3410h);
        }

        public static VoiceLiveInfo parseFrom(C3407e c3407e) throws IOException {
            return (VoiceLiveInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, c3407e);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static VoiceLiveInfo parseFrom(C3407e c3407e, C3410h c3410h) throws IOException {
            return (VoiceLiveInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, c3407e, c3410h);
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

        public static final class Builder extends GeneratedMessageLite.AbstractC3380b<VoiceManagerUpdate, Builder> implements VoiceManagerUpdateOrBuilder {
            private Builder() {
                super(VoiceManagerUpdate.DEFAULT_INSTANCE);
            }

            public Builder clearLiveId() {
                copyOnWrite();
                ((VoiceManagerUpdate) this.instance).clearLiveId();
                return this;
            }

            public Builder clearType() {
                copyOnWrite();
                ((VoiceManagerUpdate) this.instance).clearType();
                return this;
            }

            public Builder clearUserId() {
                copyOnWrite();
                ((VoiceManagerUpdate) this.instance).clearUserId();
                return this;
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.VoiceLiveManager.VoiceManagerUpdateOrBuilder
            public String getLiveId() {
                return ((VoiceManagerUpdate) this.instance).getLiveId();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.VoiceLiveManager.VoiceManagerUpdateOrBuilder
            public ByteString getLiveIdBytes() {
                return ((VoiceManagerUpdate) this.instance).getLiveIdBytes();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.VoiceLiveManager.VoiceManagerUpdateOrBuilder
            public UpdateType getType() {
                return ((VoiceManagerUpdate) this.instance).getType();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.VoiceLiveManager.VoiceManagerUpdateOrBuilder
            public int getTypeValue() {
                return ((VoiceManagerUpdate) this.instance).getTypeValue();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.VoiceLiveManager.VoiceManagerUpdateOrBuilder
            public String getUserId() {
                return ((VoiceManagerUpdate) this.instance).getUserId();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.VoiceLiveManager.VoiceManagerUpdateOrBuilder
            public ByteString getUserIdBytes() {
                return ((VoiceManagerUpdate) this.instance).getUserIdBytes();
            }

            public Builder setLiveId(String str) {
                copyOnWrite();
                ((VoiceManagerUpdate) this.instance).setLiveId(str);
                return this;
            }

            public Builder setLiveIdBytes(ByteString byteString) {
                copyOnWrite();
                ((VoiceManagerUpdate) this.instance).setLiveIdBytes(byteString);
                return this;
            }

            public Builder setType(UpdateType updateType) {
                copyOnWrite();
                ((VoiceManagerUpdate) this.instance).setType(updateType);
                return this;
            }

            public Builder setTypeValue(int i) {
                copyOnWrite();
                ((VoiceManagerUpdate) this.instance).setTypeValue(i);
                return this;
            }

            public Builder setUserId(String str) {
                copyOnWrite();
                ((VoiceManagerUpdate) this.instance).setUserId(str);
                return this;
            }

            public Builder setUserIdBytes(ByteString byteString) {
                copyOnWrite();
                ((VoiceManagerUpdate) this.instance).setUserIdBytes(byteString);
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
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(voiceManagerUpdate);
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
            AbstractC3403a.checkByteStringIsUtf8(byteString);
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
            AbstractC3403a.checkByteStringIsUtf8(byteString);
            this.userId_ = byteString.toStringUtf8();
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            boolean z = false;
            switch (C45321.f15988xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new VoiceManagerUpdate();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                    return null;
                case 4:
                    return new Builder();
                case 5:
                    GeneratedMessageLite.InterfaceC3386h interfaceC3386h = (GeneratedMessageLite.InterfaceC3386h) obj;
                    VoiceManagerUpdate voiceManagerUpdate = (VoiceManagerUpdate) obj2;
                    this.liveId_ = interfaceC3386h.mo16997f(!this.liveId_.isEmpty(), this.liveId_, !voiceManagerUpdate.liveId_.isEmpty(), voiceManagerUpdate.liveId_);
                    this.userId_ = interfaceC3386h.mo16997f(!this.userId_.isEmpty(), this.userId_, !voiceManagerUpdate.userId_.isEmpty(), voiceManagerUpdate.userId_);
                    int i = this.type_;
                    boolean z2 = i != 0;
                    int i2 = voiceManagerUpdate.type_;
                    this.type_ = interfaceC3386h.mo16996e(z2, i, i2 != 0, i2);
                    GeneratedMessageLite.C3385g c3385g = GeneratedMessageLite.C3385g.INSTANCE;
                    return this;
                case 6:
                    C3407e c3407e = (C3407e) obj;
                    while (!z) {
                        try {
                            int iM17116M = c3407e.m17116M();
                            if (iM17116M != 0) {
                                if (iM17116M == 10) {
                                    this.liveId_ = c3407e.m17115L();
                                } else if (iM17116M == 18) {
                                    this.userId_ = c3407e.m17115L();
                                } else if (iM17116M == 24) {
                                    this.type_ = c3407e.m17136p();
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
                        synchronized (VoiceManagerUpdate.class) {
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

        @Override // com.p1.mobile.longlink.msg.liveroom.VoiceLiveManager.VoiceManagerUpdateOrBuilder
        public String getLiveId() {
            return this.liveId_;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.VoiceLiveManager.VoiceManagerUpdateOrBuilder
        public ByteString getLiveIdBytes() {
            return ByteString.copyFromUtf8(this.liveId_);
        }

        @Override // com.google.protobuf.InterfaceC3419q
        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int iM16901K = !this.liveId_.isEmpty() ? CodedOutputStream.m16901K(1, getLiveId()) : 0;
            if (!this.userId_.isEmpty()) {
                iM16901K += CodedOutputStream.m16901K(2, getUserId());
            }
            if (this.type_ != UpdateType.Add.getNumber()) {
                iM16901K += CodedOutputStream.m16922m(3, this.type_);
            }
            this.memoizedSerializedSize = iM16901K;
            return iM16901K;
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

        @Override // com.google.protobuf.InterfaceC3419q
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (!this.liveId_.isEmpty()) {
                codedOutputStream.mo16939D0(1, getLiveId());
            }
            if (!this.userId_.isEmpty()) {
                codedOutputStream.mo16939D0(2, getUserId());
            }
            if (this.type_ != UpdateType.Add.getNumber()) {
                codedOutputStream.m16960i0(3, this.type_);
            }
        }

        public enum UpdateType implements C3414l.c {
            Add(0),
            Remove(1),
            UNRECOGNIZED(-1);

            public static final int Add_VALUE = 0;
            public static final int Remove_VALUE = 1;
            private static final C3414l.d<UpdateType> internalValueMap = new C3414l.d<UpdateType>() { // from class: com.p1.mobile.longlink.msg.liveroom.VoiceLiveManager.VoiceManagerUpdate.UpdateType.1
                @Override // com.google.protobuf.C3414l.d
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

            public static C3414l.d<UpdateType> internalGetValueMap() {
                return internalValueMap;
            }

            @Override // com.google.protobuf.C3414l.c
            public final int getNumber() {
                return this.value;
            }

            @Deprecated
            public static UpdateType valueOf(int i) {
                return forNumber(i);
            }
        }

        public static VoiceManagerUpdate parseDelimitedFrom(InputStream inputStream, C3410h c3410h) throws IOException {
            return (VoiceManagerUpdate) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, c3410h);
        }

        public static VoiceManagerUpdate parseFrom(ByteString byteString, C3410h c3410h) throws InvalidProtocolBufferException {
            return (VoiceManagerUpdate) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, c3410h);
        }

        public static VoiceManagerUpdate parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (VoiceManagerUpdate) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static VoiceManagerUpdate parseFrom(byte[] bArr, C3410h c3410h) throws InvalidProtocolBufferException {
            return (VoiceManagerUpdate) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, c3410h);
        }

        public static VoiceManagerUpdate parseFrom(InputStream inputStream) throws IOException {
            return (VoiceManagerUpdate) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static VoiceManagerUpdate parseFrom(InputStream inputStream, C3410h c3410h) throws IOException {
            return (VoiceManagerUpdate) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, c3410h);
        }

        public static VoiceManagerUpdate parseFrom(C3407e c3407e) throws IOException {
            return (VoiceManagerUpdate) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, c3407e);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static VoiceManagerUpdate parseFrom(C3407e c3407e, C3410h c3410h) throws IOException {
            return (VoiceManagerUpdate) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, c3407e, c3410h);
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

        public static final class Builder extends GeneratedMessageLite.AbstractC3380b<VoiceFreeCallUpdate, Builder> implements VoiceFreeCallUpdateOrBuilder {
            private Builder() {
                super(VoiceFreeCallUpdate.DEFAULT_INSTANCE);
            }

            public Builder clearFreeCall() {
                copyOnWrite();
                ((VoiceFreeCallUpdate) this.instance).clearFreeCall();
                return this;
            }

            public Builder clearRoomId() {
                copyOnWrite();
                ((VoiceFreeCallUpdate) this.instance).clearRoomId();
                return this;
            }

            public Builder clearUserId() {
                copyOnWrite();
                ((VoiceFreeCallUpdate) this.instance).clearUserId();
                return this;
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.VoiceLiveManager.VoiceFreeCallUpdateOrBuilder
            public boolean getFreeCall() {
                return ((VoiceFreeCallUpdate) this.instance).getFreeCall();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.VoiceLiveManager.VoiceFreeCallUpdateOrBuilder
            public String getRoomId() {
                return ((VoiceFreeCallUpdate) this.instance).getRoomId();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.VoiceLiveManager.VoiceFreeCallUpdateOrBuilder
            public ByteString getRoomIdBytes() {
                return ((VoiceFreeCallUpdate) this.instance).getRoomIdBytes();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.VoiceLiveManager.VoiceFreeCallUpdateOrBuilder
            public String getUserId() {
                return ((VoiceFreeCallUpdate) this.instance).getUserId();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.VoiceLiveManager.VoiceFreeCallUpdateOrBuilder
            public ByteString getUserIdBytes() {
                return ((VoiceFreeCallUpdate) this.instance).getUserIdBytes();
            }

            public Builder setFreeCall(boolean z) {
                copyOnWrite();
                ((VoiceFreeCallUpdate) this.instance).setFreeCall(z);
                return this;
            }

            public Builder setRoomId(String str) {
                copyOnWrite();
                ((VoiceFreeCallUpdate) this.instance).setRoomId(str);
                return this;
            }

            public Builder setRoomIdBytes(ByteString byteString) {
                copyOnWrite();
                ((VoiceFreeCallUpdate) this.instance).setRoomIdBytes(byteString);
                return this;
            }

            public Builder setUserId(String str) {
                copyOnWrite();
                ((VoiceFreeCallUpdate) this.instance).setUserId(str);
                return this;
            }

            public Builder setUserIdBytes(ByteString byteString) {
                copyOnWrite();
                ((VoiceFreeCallUpdate) this.instance).setUserIdBytes(byteString);
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
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(voiceFreeCallUpdate);
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
            AbstractC3403a.checkByteStringIsUtf8(byteString);
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
            AbstractC3403a.checkByteStringIsUtf8(byteString);
            this.userId_ = byteString.toStringUtf8();
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (C45321.f15988xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new VoiceFreeCallUpdate();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                    return null;
                case 4:
                    return new Builder();
                case 5:
                    GeneratedMessageLite.InterfaceC3386h interfaceC3386h = (GeneratedMessageLite.InterfaceC3386h) obj;
                    VoiceFreeCallUpdate voiceFreeCallUpdate = (VoiceFreeCallUpdate) obj2;
                    this.roomId_ = interfaceC3386h.mo16997f(!this.roomId_.isEmpty(), this.roomId_, !voiceFreeCallUpdate.roomId_.isEmpty(), voiceFreeCallUpdate.roomId_);
                    this.userId_ = interfaceC3386h.mo16997f(!this.userId_.isEmpty(), this.userId_, true ^ voiceFreeCallUpdate.userId_.isEmpty(), voiceFreeCallUpdate.userId_);
                    boolean z = this.freeCall_;
                    boolean z2 = voiceFreeCallUpdate.freeCall_;
                    this.freeCall_ = interfaceC3386h.mo16995d(z, z, z2, z2);
                    GeneratedMessageLite.C3385g c3385g = GeneratedMessageLite.C3385g.INSTANCE;
                    return this;
                case 6:
                    C3407e c3407e = (C3407e) obj;
                    boolean z3 = false;
                    while (!z3) {
                        try {
                            int iM17116M = c3407e.m17116M();
                            if (iM17116M != 0) {
                                if (iM17116M == 10) {
                                    this.roomId_ = c3407e.m17115L();
                                } else if (iM17116M == 18) {
                                    this.userId_ = c3407e.m17115L();
                                } else if (iM17116M == 24) {
                                    this.freeCall_ = c3407e.m17133m();
                                } else if (!c3407e.m17121R(iM17116M)) {
                                }
                            }
                            z3 = true;
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
                        synchronized (VoiceFreeCallUpdate.class) {
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

        @Override // com.google.protobuf.InterfaceC3419q
        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int iM16901K = !this.roomId_.isEmpty() ? CodedOutputStream.m16901K(1, getRoomId()) : 0;
            if (!this.userId_.isEmpty()) {
                iM16901K += CodedOutputStream.m16901K(2, getUserId());
            }
            boolean z = this.freeCall_;
            if (z) {
                iM16901K += CodedOutputStream.m16915f(3, z);
            }
            this.memoizedSerializedSize = iM16901K;
            return iM16901K;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.VoiceLiveManager.VoiceFreeCallUpdateOrBuilder
        public String getUserId() {
            return this.userId_;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.VoiceLiveManager.VoiceFreeCallUpdateOrBuilder
        public ByteString getUserIdBytes() {
            return ByteString.copyFromUtf8(this.userId_);
        }

        @Override // com.google.protobuf.InterfaceC3419q
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (!this.roomId_.isEmpty()) {
                codedOutputStream.mo16939D0(1, getRoomId());
            }
            if (!this.userId_.isEmpty()) {
                codedOutputStream.mo16939D0(2, getUserId());
            }
            boolean z = this.freeCall_;
            if (z) {
                codedOutputStream.mo16950a0(3, z);
            }
        }

        public static VoiceFreeCallUpdate parseDelimitedFrom(InputStream inputStream, C3410h c3410h) throws IOException {
            return (VoiceFreeCallUpdate) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, c3410h);
        }

        public static VoiceFreeCallUpdate parseFrom(ByteString byteString, C3410h c3410h) throws InvalidProtocolBufferException {
            return (VoiceFreeCallUpdate) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, c3410h);
        }

        public static VoiceFreeCallUpdate parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (VoiceFreeCallUpdate) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static VoiceFreeCallUpdate parseFrom(byte[] bArr, C3410h c3410h) throws InvalidProtocolBufferException {
            return (VoiceFreeCallUpdate) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, c3410h);
        }

        public static VoiceFreeCallUpdate parseFrom(InputStream inputStream) throws IOException {
            return (VoiceFreeCallUpdate) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static VoiceFreeCallUpdate parseFrom(InputStream inputStream, C3410h c3410h) throws IOException {
            return (VoiceFreeCallUpdate) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, c3410h);
        }

        public static VoiceFreeCallUpdate parseFrom(C3407e c3407e) throws IOException {
            return (VoiceFreeCallUpdate) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, c3407e);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static VoiceFreeCallUpdate parseFrom(C3407e c3407e, C3410h c3410h) throws IOException {
            return (VoiceFreeCallUpdate) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, c3407e, c3410h);
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

        public static final class Builder extends GeneratedMessageLite.AbstractC3380b<VoiceLiveHeartBeatInfo, Builder> implements VoiceLiveHeartBeatInfoOrBuilder {
            private Builder() {
                super(VoiceLiveHeartBeatInfo.DEFAULT_INSTANCE);
            }

            public Builder clearHeartBeats() {
                copyOnWrite();
                ((VoiceLiveHeartBeatInfo) this.instance).clearHeartBeats();
                return this;
            }

            public Builder clearLiveId() {
                copyOnWrite();
                ((VoiceLiveHeartBeatInfo) this.instance).clearLiveId();
                return this;
            }

            public Builder clearRoomId() {
                copyOnWrite();
                ((VoiceLiveHeartBeatInfo) this.instance).clearRoomId();
                return this;
            }

            public Builder clearTimestamp() {
                copyOnWrite();
                ((VoiceLiveHeartBeatInfo) this.instance).clearTimestamp();
                return this;
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.VoiceLiveManager.VoiceLiveHeartBeatInfoOrBuilder
            public long getHeartBeats() {
                return ((VoiceLiveHeartBeatInfo) this.instance).getHeartBeats();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.VoiceLiveManager.VoiceLiveHeartBeatInfoOrBuilder
            public String getLiveId() {
                return ((VoiceLiveHeartBeatInfo) this.instance).getLiveId();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.VoiceLiveManager.VoiceLiveHeartBeatInfoOrBuilder
            public ByteString getLiveIdBytes() {
                return ((VoiceLiveHeartBeatInfo) this.instance).getLiveIdBytes();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.VoiceLiveManager.VoiceLiveHeartBeatInfoOrBuilder
            public String getRoomId() {
                return ((VoiceLiveHeartBeatInfo) this.instance).getRoomId();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.VoiceLiveManager.VoiceLiveHeartBeatInfoOrBuilder
            public ByteString getRoomIdBytes() {
                return ((VoiceLiveHeartBeatInfo) this.instance).getRoomIdBytes();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.VoiceLiveManager.VoiceLiveHeartBeatInfoOrBuilder
            public long getTimestamp() {
                return ((VoiceLiveHeartBeatInfo) this.instance).getTimestamp();
            }

            public Builder setHeartBeats(long j) {
                copyOnWrite();
                ((VoiceLiveHeartBeatInfo) this.instance).setHeartBeats(j);
                return this;
            }

            public Builder setLiveId(String str) {
                copyOnWrite();
                ((VoiceLiveHeartBeatInfo) this.instance).setLiveId(str);
                return this;
            }

            public Builder setLiveIdBytes(ByteString byteString) {
                copyOnWrite();
                ((VoiceLiveHeartBeatInfo) this.instance).setLiveIdBytes(byteString);
                return this;
            }

            public Builder setRoomId(String str) {
                copyOnWrite();
                ((VoiceLiveHeartBeatInfo) this.instance).setRoomId(str);
                return this;
            }

            public Builder setRoomIdBytes(ByteString byteString) {
                copyOnWrite();
                ((VoiceLiveHeartBeatInfo) this.instance).setRoomIdBytes(byteString);
                return this;
            }

            public Builder setTimestamp(long j) {
                copyOnWrite();
                ((VoiceLiveHeartBeatInfo) this.instance).setTimestamp(j);
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
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(voiceLiveHeartBeatInfo);
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
        public void setTimestamp(long j) {
            this.timestamp_ = j;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            boolean z = false;
            switch (C45321.f15988xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new VoiceLiveHeartBeatInfo();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                    return null;
                case 4:
                    return new Builder();
                case 5:
                    GeneratedMessageLite.InterfaceC3386h interfaceC3386h = (GeneratedMessageLite.InterfaceC3386h) obj;
                    VoiceLiveHeartBeatInfo voiceLiveHeartBeatInfo = (VoiceLiveHeartBeatInfo) obj2;
                    this.roomId_ = interfaceC3386h.mo16997f(!this.roomId_.isEmpty(), this.roomId_, !voiceLiveHeartBeatInfo.roomId_.isEmpty(), voiceLiveHeartBeatInfo.roomId_);
                    this.liveId_ = interfaceC3386h.mo16997f(!this.liveId_.isEmpty(), this.liveId_, !voiceLiveHeartBeatInfo.liveId_.isEmpty(), voiceLiveHeartBeatInfo.liveId_);
                    long j = this.heartBeats_;
                    boolean z2 = j != 0;
                    long j2 = voiceLiveHeartBeatInfo.heartBeats_;
                    this.heartBeats_ = interfaceC3386h.mo17000i(z2, j, j2 != 0, j2);
                    boolean z3 = false;
                    long j3 = this.timestamp_;
                    if (j3 != 0) {
                        z3 = true;
                    }
                    long j4 = voiceLiveHeartBeatInfo.timestamp_;
                    this.timestamp_ = interfaceC3386h.mo17000i(z3, j3, j4 != 0, j4);
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
                                } else if (iM17116M == 24) {
                                    this.heartBeats_ = c3407e.m17142v();
                                } else if (iM17116M == 32) {
                                    this.timestamp_ = c3407e.m17142v();
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
                        synchronized (VoiceLiveHeartBeatInfo.class) {
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
            long j = this.heartBeats_;
            if (j != 0) {
                iM16901K += CodedOutputStream.m16931v(3, j);
            }
            long j2 = this.timestamp_;
            if (j2 != 0) {
                iM16901K += CodedOutputStream.m16931v(4, j2);
            }
            this.memoizedSerializedSize = iM16901K;
            return iM16901K;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.VoiceLiveManager.VoiceLiveHeartBeatInfoOrBuilder
        public long getTimestamp() {
            return this.timestamp_;
        }

        @Override // com.google.protobuf.InterfaceC3419q
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (!this.roomId_.isEmpty()) {
                codedOutputStream.mo16939D0(1, getRoomId());
            }
            if (!this.liveId_.isEmpty()) {
                codedOutputStream.mo16939D0(2, getLiveId());
            }
            long j = this.heartBeats_;
            if (j != 0) {
                codedOutputStream.m16972u0(3, j);
            }
            long j2 = this.timestamp_;
            if (j2 != 0) {
                codedOutputStream.m16972u0(4, j2);
            }
        }

        public static VoiceLiveHeartBeatInfo parseDelimitedFrom(InputStream inputStream, C3410h c3410h) throws IOException {
            return (VoiceLiveHeartBeatInfo) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, c3410h);
        }

        public static VoiceLiveHeartBeatInfo parseFrom(ByteString byteString, C3410h c3410h) throws InvalidProtocolBufferException {
            return (VoiceLiveHeartBeatInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, c3410h);
        }

        public static VoiceLiveHeartBeatInfo parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (VoiceLiveHeartBeatInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static VoiceLiveHeartBeatInfo parseFrom(byte[] bArr, C3410h c3410h) throws InvalidProtocolBufferException {
            return (VoiceLiveHeartBeatInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, c3410h);
        }

        public static VoiceLiveHeartBeatInfo parseFrom(InputStream inputStream) throws IOException {
            return (VoiceLiveHeartBeatInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static VoiceLiveHeartBeatInfo parseFrom(InputStream inputStream, C3410h c3410h) throws IOException {
            return (VoiceLiveHeartBeatInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, c3410h);
        }

        public static VoiceLiveHeartBeatInfo parseFrom(C3407e c3407e) throws IOException {
            return (VoiceLiveHeartBeatInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, c3407e);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static VoiceLiveHeartBeatInfo parseFrom(C3407e c3407e, C3410h c3410h) throws IOException {
            return (VoiceLiveHeartBeatInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, c3407e, c3410h);
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

        public static final class Builder extends GeneratedMessageLite.AbstractC3380b<VoiceManagerInvite, Builder> implements VoiceManagerInviteOrBuilder {
            private Builder() {
                super(VoiceManagerInvite.DEFAULT_INSTANCE);
            }

            public Builder clearInviteId() {
                copyOnWrite();
                ((VoiceManagerInvite) this.instance).clearInviteId();
                return this;
            }

            public Builder clearLiveId() {
                copyOnWrite();
                ((VoiceManagerInvite) this.instance).clearLiveId();
                return this;
            }

            public Builder clearUserId() {
                copyOnWrite();
                ((VoiceManagerInvite) this.instance).clearUserId();
                return this;
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.VoiceLiveManager.VoiceManagerInviteOrBuilder
            public String getInviteId() {
                return ((VoiceManagerInvite) this.instance).getInviteId();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.VoiceLiveManager.VoiceManagerInviteOrBuilder
            public ByteString getInviteIdBytes() {
                return ((VoiceManagerInvite) this.instance).getInviteIdBytes();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.VoiceLiveManager.VoiceManagerInviteOrBuilder
            public String getLiveId() {
                return ((VoiceManagerInvite) this.instance).getLiveId();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.VoiceLiveManager.VoiceManagerInviteOrBuilder
            public ByteString getLiveIdBytes() {
                return ((VoiceManagerInvite) this.instance).getLiveIdBytes();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.VoiceLiveManager.VoiceManagerInviteOrBuilder
            public String getUserId() {
                return ((VoiceManagerInvite) this.instance).getUserId();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.VoiceLiveManager.VoiceManagerInviteOrBuilder
            public ByteString getUserIdBytes() {
                return ((VoiceManagerInvite) this.instance).getUserIdBytes();
            }

            public Builder setInviteId(String str) {
                copyOnWrite();
                ((VoiceManagerInvite) this.instance).setInviteId(str);
                return this;
            }

            public Builder setInviteIdBytes(ByteString byteString) {
                copyOnWrite();
                ((VoiceManagerInvite) this.instance).setInviteIdBytes(byteString);
                return this;
            }

            public Builder setLiveId(String str) {
                copyOnWrite();
                ((VoiceManagerInvite) this.instance).setLiveId(str);
                return this;
            }

            public Builder setLiveIdBytes(ByteString byteString) {
                copyOnWrite();
                ((VoiceManagerInvite) this.instance).setLiveIdBytes(byteString);
                return this;
            }

            public Builder setUserId(String str) {
                copyOnWrite();
                ((VoiceManagerInvite) this.instance).setUserId(str);
                return this;
            }

            public Builder setUserIdBytes(ByteString byteString) {
                copyOnWrite();
                ((VoiceManagerInvite) this.instance).setUserIdBytes(byteString);
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
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(voiceManagerInvite);
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
            AbstractC3403a.checkByteStringIsUtf8(byteString);
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
            AbstractC3403a.checkByteStringIsUtf8(byteString);
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
            AbstractC3403a.checkByteStringIsUtf8(byteString);
            this.userId_ = byteString.toStringUtf8();
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (C45321.f15988xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new VoiceManagerInvite();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                    return null;
                case 4:
                    return new Builder();
                case 5:
                    GeneratedMessageLite.InterfaceC3386h interfaceC3386h = (GeneratedMessageLite.InterfaceC3386h) obj;
                    VoiceManagerInvite voiceManagerInvite = (VoiceManagerInvite) obj2;
                    this.liveId_ = interfaceC3386h.mo16997f(!this.liveId_.isEmpty(), this.liveId_, !voiceManagerInvite.liveId_.isEmpty(), voiceManagerInvite.liveId_);
                    this.userId_ = interfaceC3386h.mo16997f(!this.userId_.isEmpty(), this.userId_, !voiceManagerInvite.userId_.isEmpty(), voiceManagerInvite.userId_);
                    this.inviteId_ = interfaceC3386h.mo16997f(!this.inviteId_.isEmpty(), this.inviteId_, true ^ voiceManagerInvite.inviteId_.isEmpty(), voiceManagerInvite.inviteId_);
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
                                    this.liveId_ = c3407e.m17115L();
                                } else if (iM17116M == 18) {
                                    this.userId_ = c3407e.m17115L();
                                } else if (iM17116M == 26) {
                                    this.inviteId_ = c3407e.m17115L();
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
                        synchronized (VoiceManagerInvite.class) {
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

        @Override // com.google.protobuf.InterfaceC3419q
        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int iM16901K = !this.liveId_.isEmpty() ? CodedOutputStream.m16901K(1, getLiveId()) : 0;
            if (!this.userId_.isEmpty()) {
                iM16901K += CodedOutputStream.m16901K(2, getUserId());
            }
            if (!this.inviteId_.isEmpty()) {
                iM16901K += CodedOutputStream.m16901K(3, getInviteId());
            }
            this.memoizedSerializedSize = iM16901K;
            return iM16901K;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.VoiceLiveManager.VoiceManagerInviteOrBuilder
        public String getUserId() {
            return this.userId_;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.VoiceLiveManager.VoiceManagerInviteOrBuilder
        public ByteString getUserIdBytes() {
            return ByteString.copyFromUtf8(this.userId_);
        }

        @Override // com.google.protobuf.InterfaceC3419q
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (!this.liveId_.isEmpty()) {
                codedOutputStream.mo16939D0(1, getLiveId());
            }
            if (!this.userId_.isEmpty()) {
                codedOutputStream.mo16939D0(2, getUserId());
            }
            if (this.inviteId_.isEmpty()) {
                return;
            }
            codedOutputStream.mo16939D0(3, getInviteId());
        }

        public static VoiceManagerInvite parseDelimitedFrom(InputStream inputStream, C3410h c3410h) throws IOException {
            return (VoiceManagerInvite) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, c3410h);
        }

        public static VoiceManagerInvite parseFrom(ByteString byteString, C3410h c3410h) throws InvalidProtocolBufferException {
            return (VoiceManagerInvite) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, c3410h);
        }

        public static VoiceManagerInvite parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (VoiceManagerInvite) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static VoiceManagerInvite parseFrom(byte[] bArr, C3410h c3410h) throws InvalidProtocolBufferException {
            return (VoiceManagerInvite) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, c3410h);
        }

        public static VoiceManagerInvite parseFrom(InputStream inputStream) throws IOException {
            return (VoiceManagerInvite) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static VoiceManagerInvite parseFrom(InputStream inputStream, C3410h c3410h) throws IOException {
            return (VoiceManagerInvite) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, c3410h);
        }

        public static VoiceManagerInvite parseFrom(C3407e c3407e) throws IOException {
            return (VoiceManagerInvite) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, c3407e);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static VoiceManagerInvite parseFrom(C3407e c3407e, C3410h c3410h) throws IOException {
            return (VoiceManagerInvite) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, c3407e, c3410h);
        }
    }
}
