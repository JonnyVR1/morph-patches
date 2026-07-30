package com.p051p1.mobile.longlink.msg.voicegift;

import com.google.protobuf.AbstractC3426a;
import com.google.protobuf.ByteString;
import com.google.protobuf.C3430e;
import com.google.protobuf.C3433h;
import com.google.protobuf.C3437l;
import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InterfaceC3442q;
import com.google.protobuf.InvalidProtocolBufferException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Collections;
import java.util.List;
import p153l.iig0;
import p153l.l710;
import p153l.lfz;
import p153l.ng60;

/* JADX INFO: loaded from: classes9.dex */
public final class VoiceNewCampaign {

    /* JADX INFO: renamed from: com.p1.mobile.longlink.msg.voicegift.VoiceNewCampaign$1 */
    public static /* synthetic */ class C47051 {

        /* JADX INFO: renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f16719xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f16719xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f16719xa1df5c61[GeneratedMessageLite.MethodToInvoke.IS_INITIALIZED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f16719xa1df5c61[GeneratedMessageLite.MethodToInvoke.MAKE_IMMUTABLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f16719xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f16719xa1df5c61[GeneratedMessageLite.MethodToInvoke.VISIT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f16719xa1df5c61[GeneratedMessageLite.MethodToInvoke.MERGE_FROM_STREAM.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f16719xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f16719xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    public interface VoiceLiveCampaignInfoOrBuilder extends lfz {
        String getData();

        ByteString getDataBytes();

        @Override // p153l.lfz
        /* synthetic */ InterfaceC3442q getDefaultInstanceForType();

        String getId();

        ByteString getIdBytes();

        long getPosition();

        String getSubscribeType();

        ByteString getSubscribeTypeBytes();

        VoiceLiveCampaignType getType();

        int getTypeValue();

        String getUpdateType();

        ByteString getUpdateTypeBytes();

        @Override // p153l.lfz
        /* synthetic */ boolean isInitialized();
    }

    public interface VoiceLiveContentUpdateNoticeOrBuilder extends lfz {
        VoiceLongLinkUpdateAction getAction();

        int getActionValue();

        @Override // p153l.lfz
        /* synthetic */ InterfaceC3442q getDefaultInstanceForType();

        VoiceLiveCampaignInfo getLiveCampaigns(int i);

        int getLiveCampaignsCount();

        List<VoiceLiveCampaignInfo> getLiveCampaignsList();

        VoiceLongLinkUpdatePosition getPosition();

        int getPositionValue();

        String getRoomId();

        ByteString getRoomIdBytes();

        @Override // p153l.lfz
        /* synthetic */ boolean isInitialized();
    }

    private VoiceNewCampaign() {
    }

    public static void registerAllExtensions(C3433h c3433h) {
    }

    public static final class VoiceLiveCampaignInfo extends GeneratedMessageLite<VoiceLiveCampaignInfo, Builder> implements VoiceLiveCampaignInfoOrBuilder {
        public static final int DATA_FIELD_NUMBER = 6;
        private static final VoiceLiveCampaignInfo DEFAULT_INSTANCE;
        public static final int ID_FIELD_NUMBER = 2;
        private static volatile ng60<VoiceLiveCampaignInfo> PARSER = null;
        public static final int POSITION_FIELD_NUMBER = 3;
        public static final int SUBSCRIBETYPE_FIELD_NUMBER = 4;
        public static final int TYPE_FIELD_NUMBER = 1;
        public static final int UPDATETYPE_FIELD_NUMBER = 5;
        private long position_;
        private int type_;
        private String id_ = "";
        private String subscribeType_ = "";
        private String updateType_ = "";
        private String data_ = "";

        public static final class Builder extends GeneratedMessageLite.AbstractC3403b<VoiceLiveCampaignInfo, Builder> implements VoiceLiveCampaignInfoOrBuilder {
            private Builder() {
                super(VoiceLiveCampaignInfo.DEFAULT_INSTANCE);
            }

            public Builder clearData() {
                copyOnWrite();
                ((VoiceLiveCampaignInfo) this.instance).clearData();
                return this;
            }

            public Builder clearId() {
                copyOnWrite();
                ((VoiceLiveCampaignInfo) this.instance).clearId();
                return this;
            }

            public Builder clearPosition() {
                copyOnWrite();
                ((VoiceLiveCampaignInfo) this.instance).clearPosition();
                return this;
            }

            public Builder clearSubscribeType() {
                copyOnWrite();
                ((VoiceLiveCampaignInfo) this.instance).clearSubscribeType();
                return this;
            }

            public Builder clearType() {
                copyOnWrite();
                ((VoiceLiveCampaignInfo) this.instance).clearType();
                return this;
            }

            public Builder clearUpdateType() {
                copyOnWrite();
                ((VoiceLiveCampaignInfo) this.instance).clearUpdateType();
                return this;
            }

            @Override // com.p1.mobile.longlink.msg.voicegift.VoiceNewCampaign.VoiceLiveCampaignInfoOrBuilder
            public String getData() {
                return ((VoiceLiveCampaignInfo) this.instance).getData();
            }

            @Override // com.p1.mobile.longlink.msg.voicegift.VoiceNewCampaign.VoiceLiveCampaignInfoOrBuilder
            public ByteString getDataBytes() {
                return ((VoiceLiveCampaignInfo) this.instance).getDataBytes();
            }

            @Override // com.p1.mobile.longlink.msg.voicegift.VoiceNewCampaign.VoiceLiveCampaignInfoOrBuilder
            public String getId() {
                return ((VoiceLiveCampaignInfo) this.instance).getId();
            }

            @Override // com.p1.mobile.longlink.msg.voicegift.VoiceNewCampaign.VoiceLiveCampaignInfoOrBuilder
            public ByteString getIdBytes() {
                return ((VoiceLiveCampaignInfo) this.instance).getIdBytes();
            }

            @Override // com.p1.mobile.longlink.msg.voicegift.VoiceNewCampaign.VoiceLiveCampaignInfoOrBuilder
            public long getPosition() {
                return ((VoiceLiveCampaignInfo) this.instance).getPosition();
            }

            @Override // com.p1.mobile.longlink.msg.voicegift.VoiceNewCampaign.VoiceLiveCampaignInfoOrBuilder
            public String getSubscribeType() {
                return ((VoiceLiveCampaignInfo) this.instance).getSubscribeType();
            }

            @Override // com.p1.mobile.longlink.msg.voicegift.VoiceNewCampaign.VoiceLiveCampaignInfoOrBuilder
            public ByteString getSubscribeTypeBytes() {
                return ((VoiceLiveCampaignInfo) this.instance).getSubscribeTypeBytes();
            }

            @Override // com.p1.mobile.longlink.msg.voicegift.VoiceNewCampaign.VoiceLiveCampaignInfoOrBuilder
            public VoiceLiveCampaignType getType() {
                return ((VoiceLiveCampaignInfo) this.instance).getType();
            }

            @Override // com.p1.mobile.longlink.msg.voicegift.VoiceNewCampaign.VoiceLiveCampaignInfoOrBuilder
            public int getTypeValue() {
                return ((VoiceLiveCampaignInfo) this.instance).getTypeValue();
            }

            @Override // com.p1.mobile.longlink.msg.voicegift.VoiceNewCampaign.VoiceLiveCampaignInfoOrBuilder
            public String getUpdateType() {
                return ((VoiceLiveCampaignInfo) this.instance).getUpdateType();
            }

            @Override // com.p1.mobile.longlink.msg.voicegift.VoiceNewCampaign.VoiceLiveCampaignInfoOrBuilder
            public ByteString getUpdateTypeBytes() {
                return ((VoiceLiveCampaignInfo) this.instance).getUpdateTypeBytes();
            }

            public Builder setData(String str) {
                copyOnWrite();
                ((VoiceLiveCampaignInfo) this.instance).setData(str);
                return this;
            }

            public Builder setDataBytes(ByteString byteString) {
                copyOnWrite();
                ((VoiceLiveCampaignInfo) this.instance).setDataBytes(byteString);
                return this;
            }

            public Builder setId(String str) {
                copyOnWrite();
                ((VoiceLiveCampaignInfo) this.instance).setId(str);
                return this;
            }

            public Builder setIdBytes(ByteString byteString) {
                copyOnWrite();
                ((VoiceLiveCampaignInfo) this.instance).setIdBytes(byteString);
                return this;
            }

            public Builder setPosition(long j) {
                copyOnWrite();
                ((VoiceLiveCampaignInfo) this.instance).setPosition(j);
                return this;
            }

            public Builder setSubscribeType(String str) {
                copyOnWrite();
                ((VoiceLiveCampaignInfo) this.instance).setSubscribeType(str);
                return this;
            }

            public Builder setSubscribeTypeBytes(ByteString byteString) {
                copyOnWrite();
                ((VoiceLiveCampaignInfo) this.instance).setSubscribeTypeBytes(byteString);
                return this;
            }

            public Builder setType(VoiceLiveCampaignType voiceLiveCampaignType) {
                copyOnWrite();
                ((VoiceLiveCampaignInfo) this.instance).setType(voiceLiveCampaignType);
                return this;
            }

            public Builder setTypeValue(int i) {
                copyOnWrite();
                ((VoiceLiveCampaignInfo) this.instance).setTypeValue(i);
                return this;
            }

            public Builder setUpdateType(String str) {
                copyOnWrite();
                ((VoiceLiveCampaignInfo) this.instance).setUpdateType(str);
                return this;
            }

            public Builder setUpdateTypeBytes(ByteString byteString) {
                copyOnWrite();
                ((VoiceLiveCampaignInfo) this.instance).setUpdateTypeBytes(byteString);
                return this;
            }
        }

        static {
            VoiceLiveCampaignInfo voiceLiveCampaignInfo = new VoiceLiveCampaignInfo();
            DEFAULT_INSTANCE = voiceLiveCampaignInfo;
            voiceLiveCampaignInfo.makeImmutable();
        }

        private VoiceLiveCampaignInfo() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearData() {
            this.data_ = getDefaultInstance().getData();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearId() {
            this.id_ = getDefaultInstance().getId();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearPosition() {
            this.position_ = 0L;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearSubscribeType() {
            this.subscribeType_ = getDefaultInstance().getSubscribeType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearType() {
            this.type_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearUpdateType() {
            this.updateType_ = getDefaultInstance().getUpdateType();
        }

        public static VoiceLiveCampaignInfo getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder(VoiceLiveCampaignInfo voiceLiveCampaignInfo) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(voiceLiveCampaignInfo);
        }

        public static VoiceLiveCampaignInfo parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (VoiceLiveCampaignInfo) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static VoiceLiveCampaignInfo parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (VoiceLiveCampaignInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static ng60<VoiceLiveCampaignInfo> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setData(String str) {
            str.getClass();
            this.data_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setDataBytes(ByteString byteString) {
            byteString.getClass();
            AbstractC3426a.checkByteStringIsUtf8(byteString);
            this.data_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setId(String str) {
            str.getClass();
            this.id_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setIdBytes(ByteString byteString) {
            byteString.getClass();
            AbstractC3426a.checkByteStringIsUtf8(byteString);
            this.id_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setPosition(long j) {
            this.position_ = j;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSubscribeType(String str) {
            str.getClass();
            this.subscribeType_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSubscribeTypeBytes(ByteString byteString) {
            byteString.getClass();
            AbstractC3426a.checkByteStringIsUtf8(byteString);
            this.subscribeType_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setType(VoiceLiveCampaignType voiceLiveCampaignType) {
            voiceLiveCampaignType.getClass();
            this.type_ = voiceLiveCampaignType.getNumber();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTypeValue(int i) {
            this.type_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setUpdateType(String str) {
            str.getClass();
            this.updateType_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setUpdateTypeBytes(ByteString byteString) {
            byteString.getClass();
            AbstractC3426a.checkByteStringIsUtf8(byteString);
            this.updateType_ = byteString.toStringUtf8();
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            boolean z = false;
            switch (C47051.f16719xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new VoiceLiveCampaignInfo();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                    return null;
                case 4:
                    return new Builder();
                case 5:
                    GeneratedMessageLite.InterfaceC3409h interfaceC3409h = (GeneratedMessageLite.InterfaceC3409h) obj;
                    VoiceLiveCampaignInfo voiceLiveCampaignInfo = (VoiceLiveCampaignInfo) obj2;
                    int i = this.type_;
                    boolean z2 = i != 0;
                    int i2 = voiceLiveCampaignInfo.type_;
                    this.type_ = interfaceC3409h.mo17051e(z2, i, i2 != 0, i2);
                    this.id_ = interfaceC3409h.mo17052f(!this.id_.isEmpty(), this.id_, !voiceLiveCampaignInfo.id_.isEmpty(), voiceLiveCampaignInfo.id_);
                    long j = this.position_;
                    boolean z3 = j != 0;
                    long j2 = voiceLiveCampaignInfo.position_;
                    this.position_ = interfaceC3409h.mo17055i(z3, j, j2 != 0, j2);
                    this.subscribeType_ = interfaceC3409h.mo17052f(!this.subscribeType_.isEmpty(), this.subscribeType_, !voiceLiveCampaignInfo.subscribeType_.isEmpty(), voiceLiveCampaignInfo.subscribeType_);
                    this.updateType_ = interfaceC3409h.mo17052f(!this.updateType_.isEmpty(), this.updateType_, !voiceLiveCampaignInfo.updateType_.isEmpty(), voiceLiveCampaignInfo.updateType_);
                    this.data_ = interfaceC3409h.mo17052f(!this.data_.isEmpty(), this.data_, !voiceLiveCampaignInfo.data_.isEmpty(), voiceLiveCampaignInfo.data_);
                    GeneratedMessageLite.C3408g c3408g = GeneratedMessageLite.C3408g.INSTANCE;
                    return this;
                case 6:
                    C3430e c3430e = (C3430e) obj;
                    while (!z) {
                        try {
                            int iM17171M = c3430e.m17171M();
                            if (iM17171M != 0) {
                                if (iM17171M == 8) {
                                    this.type_ = c3430e.m17191p();
                                } else if (iM17171M == 18) {
                                    this.id_ = c3430e.m17170L();
                                } else if (iM17171M == 24) {
                                    this.position_ = c3430e.m17197v();
                                } else if (iM17171M == 34) {
                                    this.subscribeType_ = c3430e.m17170L();
                                } else if (iM17171M == 42) {
                                    this.updateType_ = c3430e.m17170L();
                                } else if (iM17171M == 50) {
                                    this.data_ = c3430e.m17170L();
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
                        synchronized (VoiceLiveCampaignInfo.class) {
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

        @Override // com.p1.mobile.longlink.msg.voicegift.VoiceNewCampaign.VoiceLiveCampaignInfoOrBuilder
        public String getData() {
            return this.data_;
        }

        @Override // com.p1.mobile.longlink.msg.voicegift.VoiceNewCampaign.VoiceLiveCampaignInfoOrBuilder
        public ByteString getDataBytes() {
            return ByteString.copyFromUtf8(this.data_);
        }

        @Override // com.p1.mobile.longlink.msg.voicegift.VoiceNewCampaign.VoiceLiveCampaignInfoOrBuilder
        public String getId() {
            return this.id_;
        }

        @Override // com.p1.mobile.longlink.msg.voicegift.VoiceNewCampaign.VoiceLiveCampaignInfoOrBuilder
        public ByteString getIdBytes() {
            return ByteString.copyFromUtf8(this.id_);
        }

        @Override // com.p1.mobile.longlink.msg.voicegift.VoiceNewCampaign.VoiceLiveCampaignInfoOrBuilder
        public long getPosition() {
            return this.position_;
        }

        @Override // com.google.protobuf.InterfaceC3442q
        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int iM16977m = this.type_ != VoiceLiveCampaignType.List.getNumber() ? CodedOutputStream.m16977m(1, this.type_) : 0;
            if (!this.id_.isEmpty()) {
                iM16977m += CodedOutputStream.m16956K(2, getId());
            }
            long j = this.position_;
            if (j != 0) {
                iM16977m += CodedOutputStream.m16986v(3, j);
            }
            if (!this.subscribeType_.isEmpty()) {
                iM16977m += CodedOutputStream.m16956K(4, getSubscribeType());
            }
            if (!this.updateType_.isEmpty()) {
                iM16977m += CodedOutputStream.m16956K(5, getUpdateType());
            }
            if (!this.data_.isEmpty()) {
                iM16977m += CodedOutputStream.m16956K(6, getData());
            }
            this.memoizedSerializedSize = iM16977m;
            return iM16977m;
        }

        @Override // com.p1.mobile.longlink.msg.voicegift.VoiceNewCampaign.VoiceLiveCampaignInfoOrBuilder
        public String getSubscribeType() {
            return this.subscribeType_;
        }

        @Override // com.p1.mobile.longlink.msg.voicegift.VoiceNewCampaign.VoiceLiveCampaignInfoOrBuilder
        public ByteString getSubscribeTypeBytes() {
            return ByteString.copyFromUtf8(this.subscribeType_);
        }

        @Override // com.p1.mobile.longlink.msg.voicegift.VoiceNewCampaign.VoiceLiveCampaignInfoOrBuilder
        public VoiceLiveCampaignType getType() {
            VoiceLiveCampaignType voiceLiveCampaignTypeForNumber = VoiceLiveCampaignType.forNumber(this.type_);
            return voiceLiveCampaignTypeForNumber == null ? VoiceLiveCampaignType.UNRECOGNIZED : voiceLiveCampaignTypeForNumber;
        }

        @Override // com.p1.mobile.longlink.msg.voicegift.VoiceNewCampaign.VoiceLiveCampaignInfoOrBuilder
        public int getTypeValue() {
            return this.type_;
        }

        @Override // com.p1.mobile.longlink.msg.voicegift.VoiceNewCampaign.VoiceLiveCampaignInfoOrBuilder
        public String getUpdateType() {
            return this.updateType_;
        }

        @Override // com.p1.mobile.longlink.msg.voicegift.VoiceNewCampaign.VoiceLiveCampaignInfoOrBuilder
        public ByteString getUpdateTypeBytes() {
            return ByteString.copyFromUtf8(this.updateType_);
        }

        @Override // com.google.protobuf.InterfaceC3442q
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (this.type_ != VoiceLiveCampaignType.List.getNumber()) {
                codedOutputStream.m17015i0(1, this.type_);
            }
            if (!this.id_.isEmpty()) {
                codedOutputStream.mo16994D0(2, getId());
            }
            long j = this.position_;
            if (j != 0) {
                codedOutputStream.m17027u0(3, j);
            }
            if (!this.subscribeType_.isEmpty()) {
                codedOutputStream.mo16994D0(4, getSubscribeType());
            }
            if (!this.updateType_.isEmpty()) {
                codedOutputStream.mo16994D0(5, getUpdateType());
            }
            if (this.data_.isEmpty()) {
                return;
            }
            codedOutputStream.mo16994D0(6, getData());
        }

        public static VoiceLiveCampaignInfo parseDelimitedFrom(InputStream inputStream, C3433h c3433h) throws IOException {
            return (VoiceLiveCampaignInfo) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, c3433h);
        }

        public static VoiceLiveCampaignInfo parseFrom(ByteString byteString, C3433h c3433h) throws InvalidProtocolBufferException {
            return (VoiceLiveCampaignInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, c3433h);
        }

        public static VoiceLiveCampaignInfo parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (VoiceLiveCampaignInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static VoiceLiveCampaignInfo parseFrom(byte[] bArr, C3433h c3433h) throws InvalidProtocolBufferException {
            return (VoiceLiveCampaignInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, c3433h);
        }

        public static VoiceLiveCampaignInfo parseFrom(InputStream inputStream) throws IOException {
            return (VoiceLiveCampaignInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static VoiceLiveCampaignInfo parseFrom(InputStream inputStream, C3433h c3433h) throws IOException {
            return (VoiceLiveCampaignInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, c3433h);
        }

        public static VoiceLiveCampaignInfo parseFrom(C3430e c3430e) throws IOException {
            return (VoiceLiveCampaignInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, c3430e);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static VoiceLiveCampaignInfo parseFrom(C3430e c3430e, C3433h c3433h) throws IOException {
            return (VoiceLiveCampaignInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, c3430e, c3433h);
        }
    }

    public enum VoiceLiveCampaignType implements C3437l.c {
        List(0),
        Entrance(1),
        UNRECOGNIZED(-1);

        public static final int Entrance_VALUE = 1;
        public static final int List_VALUE = 0;
        private static final C3437l.d<VoiceLiveCampaignType> internalValueMap = new C3437l.d<VoiceLiveCampaignType>() { // from class: com.p1.mobile.longlink.msg.voicegift.VoiceNewCampaign.VoiceLiveCampaignType.1
            @Override // com.google.protobuf.C3437l.d
            public VoiceLiveCampaignType findValueByNumber(int i) {
                return VoiceLiveCampaignType.forNumber(i);
            }
        };
        private final int value;

        VoiceLiveCampaignType(int i) {
            this.value = i;
        }

        public static VoiceLiveCampaignType forNumber(int i) {
            if (i == 0) {
                return List;
            }
            if (i != 1) {
                return null;
            }
            return Entrance;
        }

        public static C3437l.d<VoiceLiveCampaignType> internalGetValueMap() {
            return internalValueMap;
        }

        @Override // com.google.protobuf.C3437l.c
        public final int getNumber() {
            return this.value;
        }

        @Deprecated
        public static VoiceLiveCampaignType valueOf(int i) {
            return forNumber(i);
        }
    }

    public static final class VoiceLiveContentUpdateNotice extends GeneratedMessageLite<VoiceLiveContentUpdateNotice, Builder> implements VoiceLiveContentUpdateNoticeOrBuilder {
        public static final int ACTION_FIELD_NUMBER = 1;
        private static final VoiceLiveContentUpdateNotice DEFAULT_INSTANCE;
        public static final int LIVECAMPAIGNS_FIELD_NUMBER = 4;
        private static volatile ng60<VoiceLiveContentUpdateNotice> PARSER = null;
        public static final int POSITION_FIELD_NUMBER = 2;
        public static final int ROOMID_FIELD_NUMBER = 3;
        private int action_;
        private int bitField0_;
        private int position_;
        private String roomId_ = "";
        private C3437l.h<VoiceLiveCampaignInfo> liveCampaigns_ = GeneratedMessageLite.emptyProtobufList();

        static {
            VoiceLiveContentUpdateNotice voiceLiveContentUpdateNotice = new VoiceLiveContentUpdateNotice();
            DEFAULT_INSTANCE = voiceLiveContentUpdateNotice;
            voiceLiveContentUpdateNotice.makeImmutable();
        }

        private VoiceLiveContentUpdateNotice() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllLiveCampaigns(Iterable<? extends VoiceLiveCampaignInfo> iterable) {
            ensureLiveCampaignsIsMutable();
            AbstractC3426a.addAll(iterable, this.liveCampaigns_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addLiveCampaigns(VoiceLiveCampaignInfo.Builder builder) {
            ensureLiveCampaignsIsMutable();
            this.liveCampaigns_.add(builder.build());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAction() {
            this.action_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearLiveCampaigns() {
            this.liveCampaigns_ = GeneratedMessageLite.emptyProtobufList();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearPosition() {
            this.position_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearRoomId() {
            this.roomId_ = getDefaultInstance().getRoomId();
        }

        private void ensureLiveCampaignsIsMutable() {
            if (this.liveCampaigns_.mo17140q()) {
                return;
            }
            this.liveCampaigns_ = GeneratedMessageLite.mutableCopy(this.liveCampaigns_);
        }

        public static VoiceLiveContentUpdateNotice getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder(VoiceLiveContentUpdateNotice voiceLiveContentUpdateNotice) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(voiceLiveContentUpdateNotice);
        }

        public static VoiceLiveContentUpdateNotice parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (VoiceLiveContentUpdateNotice) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static VoiceLiveContentUpdateNotice parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (VoiceLiveContentUpdateNotice) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static ng60<VoiceLiveContentUpdateNotice> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void removeLiveCampaigns(int i) {
            ensureLiveCampaignsIsMutable();
            this.liveCampaigns_.remove(i);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAction(VoiceLongLinkUpdateAction voiceLongLinkUpdateAction) {
            voiceLongLinkUpdateAction.getClass();
            this.action_ = voiceLongLinkUpdateAction.getNumber();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setActionValue(int i) {
            this.action_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setLiveCampaigns(int i, VoiceLiveCampaignInfo.Builder builder) {
            ensureLiveCampaignsIsMutable();
            this.liveCampaigns_.set(i, builder.build());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setPosition(VoiceLongLinkUpdatePosition voiceLongLinkUpdatePosition) {
            voiceLongLinkUpdatePosition.getClass();
            this.position_ = voiceLongLinkUpdatePosition.getNumber();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setPositionValue(int i) {
            this.position_ = i;
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
            boolean z = false;
            switch (C47051.f16719xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new VoiceLiveContentUpdateNotice();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                    this.liveCampaigns_.mo17139n();
                    return null;
                case 4:
                    return new Builder();
                case 5:
                    GeneratedMessageLite.InterfaceC3409h interfaceC3409h = (GeneratedMessageLite.InterfaceC3409h) obj;
                    VoiceLiveContentUpdateNotice voiceLiveContentUpdateNotice = (VoiceLiveContentUpdateNotice) obj2;
                    int i = this.action_;
                    boolean z2 = i != 0;
                    int i2 = voiceLiveContentUpdateNotice.action_;
                    this.action_ = interfaceC3409h.mo17051e(z2, i, i2 != 0, i2);
                    int i3 = this.position_;
                    boolean z3 = i3 != 0;
                    int i4 = voiceLiveContentUpdateNotice.position_;
                    this.position_ = interfaceC3409h.mo17051e(z3, i3, i4 != 0, i4);
                    this.roomId_ = interfaceC3409h.mo17052f(!this.roomId_.isEmpty(), this.roomId_, !voiceLiveContentUpdateNotice.roomId_.isEmpty(), voiceLiveContentUpdateNotice.roomId_);
                    this.liveCampaigns_ = interfaceC3409h.mo17053g(this.liveCampaigns_, voiceLiveContentUpdateNotice.liveCampaigns_);
                    if (interfaceC3409h == GeneratedMessageLite.C3408g.INSTANCE) {
                        this.bitField0_ |= voiceLiveContentUpdateNotice.bitField0_;
                    }
                    return this;
                case 6:
                    C3430e c3430e = (C3430e) obj;
                    C3433h c3433h = (C3433h) obj2;
                    while (!z) {
                        try {
                            int iM17171M = c3430e.m17171M();
                            if (iM17171M != 0) {
                                if (iM17171M == 8) {
                                    this.action_ = c3430e.m17191p();
                                } else if (iM17171M == 16) {
                                    this.position_ = c3430e.m17191p();
                                } else if (iM17171M == 26) {
                                    this.roomId_ = c3430e.m17170L();
                                } else if (iM17171M == 34) {
                                    if (!this.liveCampaigns_.mo17140q()) {
                                        this.liveCampaigns_ = GeneratedMessageLite.mutableCopy(this.liveCampaigns_);
                                    }
                                    this.liveCampaigns_.add((VoiceLiveCampaignInfo) c3430e.m17198w(VoiceLiveCampaignInfo.parser(), c3433h));
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
                        synchronized (VoiceLiveContentUpdateNotice.class) {
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

        @Override // com.p1.mobile.longlink.msg.voicegift.VoiceNewCampaign.VoiceLiveContentUpdateNoticeOrBuilder
        public VoiceLongLinkUpdateAction getAction() {
            VoiceLongLinkUpdateAction voiceLongLinkUpdateActionForNumber = VoiceLongLinkUpdateAction.forNumber(this.action_);
            return voiceLongLinkUpdateActionForNumber == null ? VoiceLongLinkUpdateAction.UNRECOGNIZED : voiceLongLinkUpdateActionForNumber;
        }

        @Override // com.p1.mobile.longlink.msg.voicegift.VoiceNewCampaign.VoiceLiveContentUpdateNoticeOrBuilder
        public int getActionValue() {
            return this.action_;
        }

        @Override // com.p1.mobile.longlink.msg.voicegift.VoiceNewCampaign.VoiceLiveContentUpdateNoticeOrBuilder
        public VoiceLiveCampaignInfo getLiveCampaigns(int i) {
            return this.liveCampaigns_.get(i);
        }

        @Override // com.p1.mobile.longlink.msg.voicegift.VoiceNewCampaign.VoiceLiveContentUpdateNoticeOrBuilder
        public int getLiveCampaignsCount() {
            return this.liveCampaigns_.size();
        }

        @Override // com.p1.mobile.longlink.msg.voicegift.VoiceNewCampaign.VoiceLiveContentUpdateNoticeOrBuilder
        public List<VoiceLiveCampaignInfo> getLiveCampaignsList() {
            return this.liveCampaigns_;
        }

        public VoiceLiveCampaignInfoOrBuilder getLiveCampaignsOrBuilder(int i) {
            return this.liveCampaigns_.get(i);
        }

        public List<? extends VoiceLiveCampaignInfoOrBuilder> getLiveCampaignsOrBuilderList() {
            return this.liveCampaigns_;
        }

        @Override // com.p1.mobile.longlink.msg.voicegift.VoiceNewCampaign.VoiceLiveContentUpdateNoticeOrBuilder
        public VoiceLongLinkUpdatePosition getPosition() {
            VoiceLongLinkUpdatePosition voiceLongLinkUpdatePositionForNumber = VoiceLongLinkUpdatePosition.forNumber(this.position_);
            return voiceLongLinkUpdatePositionForNumber == null ? VoiceLongLinkUpdatePosition.UNRECOGNIZED : voiceLongLinkUpdatePositionForNumber;
        }

        @Override // com.p1.mobile.longlink.msg.voicegift.VoiceNewCampaign.VoiceLiveContentUpdateNoticeOrBuilder
        public int getPositionValue() {
            return this.position_;
        }

        @Override // com.p1.mobile.longlink.msg.voicegift.VoiceNewCampaign.VoiceLiveContentUpdateNoticeOrBuilder
        public String getRoomId() {
            return this.roomId_;
        }

        @Override // com.p1.mobile.longlink.msg.voicegift.VoiceNewCampaign.VoiceLiveContentUpdateNoticeOrBuilder
        public ByteString getRoomIdBytes() {
            return ByteString.copyFromUtf8(this.roomId_);
        }

        @Override // com.google.protobuf.InterfaceC3442q
        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int iM16977m = this.action_ != VoiceLongLinkUpdateAction.ActionUnknow.getNumber() ? CodedOutputStream.m16977m(1, this.action_) : 0;
            if (this.position_ != VoiceLongLinkUpdatePosition.PositionUnknow.getNumber()) {
                iM16977m += CodedOutputStream.m16977m(2, this.position_);
            }
            if (!this.roomId_.isEmpty()) {
                iM16977m += CodedOutputStream.m16956K(3, getRoomId());
            }
            for (int i2 = 0; i2 < this.liveCampaigns_.size(); i2++) {
                iM16977m += CodedOutputStream.m16948C(4, this.liveCampaigns_.get(i2));
            }
            this.memoizedSerializedSize = iM16977m;
            return iM16977m;
        }

        @Override // com.google.protobuf.InterfaceC3442q
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (this.action_ != VoiceLongLinkUpdateAction.ActionUnknow.getNumber()) {
                codedOutputStream.m17015i0(1, this.action_);
            }
            if (this.position_ != VoiceLongLinkUpdatePosition.PositionUnknow.getNumber()) {
                codedOutputStream.m17015i0(2, this.position_);
            }
            if (!this.roomId_.isEmpty()) {
                codedOutputStream.mo16994D0(3, getRoomId());
            }
            for (int i = 0; i < this.liveCampaigns_.size(); i++) {
                codedOutputStream.mo17029w0(4, this.liveCampaigns_.get(i));
            }
        }

        public static VoiceLiveContentUpdateNotice parseDelimitedFrom(InputStream inputStream, C3433h c3433h) throws IOException {
            return (VoiceLiveContentUpdateNotice) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, c3433h);
        }

        public static VoiceLiveContentUpdateNotice parseFrom(ByteString byteString, C3433h c3433h) throws InvalidProtocolBufferException {
            return (VoiceLiveContentUpdateNotice) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, c3433h);
        }

        public static final class Builder extends GeneratedMessageLite.AbstractC3403b<VoiceLiveContentUpdateNotice, Builder> implements VoiceLiveContentUpdateNoticeOrBuilder {
            private Builder() {
                super(VoiceLiveContentUpdateNotice.DEFAULT_INSTANCE);
            }

            public Builder addAllLiveCampaigns(Iterable<? extends VoiceLiveCampaignInfo> iterable) {
                copyOnWrite();
                ((VoiceLiveContentUpdateNotice) this.instance).addAllLiveCampaigns(iterable);
                return this;
            }

            public Builder addLiveCampaigns(VoiceLiveCampaignInfo voiceLiveCampaignInfo) {
                copyOnWrite();
                ((VoiceLiveContentUpdateNotice) this.instance).addLiveCampaigns(voiceLiveCampaignInfo);
                return this;
            }

            public Builder clearAction() {
                copyOnWrite();
                ((VoiceLiveContentUpdateNotice) this.instance).clearAction();
                return this;
            }

            public Builder clearLiveCampaigns() {
                copyOnWrite();
                ((VoiceLiveContentUpdateNotice) this.instance).clearLiveCampaigns();
                return this;
            }

            public Builder clearPosition() {
                copyOnWrite();
                ((VoiceLiveContentUpdateNotice) this.instance).clearPosition();
                return this;
            }

            public Builder clearRoomId() {
                copyOnWrite();
                ((VoiceLiveContentUpdateNotice) this.instance).clearRoomId();
                return this;
            }

            @Override // com.p1.mobile.longlink.msg.voicegift.VoiceNewCampaign.VoiceLiveContentUpdateNoticeOrBuilder
            public VoiceLongLinkUpdateAction getAction() {
                return ((VoiceLiveContentUpdateNotice) this.instance).getAction();
            }

            @Override // com.p1.mobile.longlink.msg.voicegift.VoiceNewCampaign.VoiceLiveContentUpdateNoticeOrBuilder
            public int getActionValue() {
                return ((VoiceLiveContentUpdateNotice) this.instance).getActionValue();
            }

            @Override // com.p1.mobile.longlink.msg.voicegift.VoiceNewCampaign.VoiceLiveContentUpdateNoticeOrBuilder
            public VoiceLiveCampaignInfo getLiveCampaigns(int i) {
                return ((VoiceLiveContentUpdateNotice) this.instance).getLiveCampaigns(i);
            }

            @Override // com.p1.mobile.longlink.msg.voicegift.VoiceNewCampaign.VoiceLiveContentUpdateNoticeOrBuilder
            public int getLiveCampaignsCount() {
                return ((VoiceLiveContentUpdateNotice) this.instance).getLiveCampaignsCount();
            }

            @Override // com.p1.mobile.longlink.msg.voicegift.VoiceNewCampaign.VoiceLiveContentUpdateNoticeOrBuilder
            public List<VoiceLiveCampaignInfo> getLiveCampaignsList() {
                return Collections.unmodifiableList(((VoiceLiveContentUpdateNotice) this.instance).getLiveCampaignsList());
            }

            @Override // com.p1.mobile.longlink.msg.voicegift.VoiceNewCampaign.VoiceLiveContentUpdateNoticeOrBuilder
            public VoiceLongLinkUpdatePosition getPosition() {
                return ((VoiceLiveContentUpdateNotice) this.instance).getPosition();
            }

            @Override // com.p1.mobile.longlink.msg.voicegift.VoiceNewCampaign.VoiceLiveContentUpdateNoticeOrBuilder
            public int getPositionValue() {
                return ((VoiceLiveContentUpdateNotice) this.instance).getPositionValue();
            }

            @Override // com.p1.mobile.longlink.msg.voicegift.VoiceNewCampaign.VoiceLiveContentUpdateNoticeOrBuilder
            public String getRoomId() {
                return ((VoiceLiveContentUpdateNotice) this.instance).getRoomId();
            }

            @Override // com.p1.mobile.longlink.msg.voicegift.VoiceNewCampaign.VoiceLiveContentUpdateNoticeOrBuilder
            public ByteString getRoomIdBytes() {
                return ((VoiceLiveContentUpdateNotice) this.instance).getRoomIdBytes();
            }

            public Builder removeLiveCampaigns(int i) {
                copyOnWrite();
                ((VoiceLiveContentUpdateNotice) this.instance).removeLiveCampaigns(i);
                return this;
            }

            public Builder setAction(VoiceLongLinkUpdateAction voiceLongLinkUpdateAction) {
                copyOnWrite();
                ((VoiceLiveContentUpdateNotice) this.instance).setAction(voiceLongLinkUpdateAction);
                return this;
            }

            public Builder setActionValue(int i) {
                copyOnWrite();
                ((VoiceLiveContentUpdateNotice) this.instance).setActionValue(i);
                return this;
            }

            public Builder setLiveCampaigns(int i, VoiceLiveCampaignInfo voiceLiveCampaignInfo) {
                copyOnWrite();
                ((VoiceLiveContentUpdateNotice) this.instance).setLiveCampaigns(i, voiceLiveCampaignInfo);
                return this;
            }

            public Builder setPosition(VoiceLongLinkUpdatePosition voiceLongLinkUpdatePosition) {
                copyOnWrite();
                ((VoiceLiveContentUpdateNotice) this.instance).setPosition(voiceLongLinkUpdatePosition);
                return this;
            }

            public Builder setPositionValue(int i) {
                copyOnWrite();
                ((VoiceLiveContentUpdateNotice) this.instance).setPositionValue(i);
                return this;
            }

            public Builder setRoomId(String str) {
                copyOnWrite();
                ((VoiceLiveContentUpdateNotice) this.instance).setRoomId(str);
                return this;
            }

            public Builder setRoomIdBytes(ByteString byteString) {
                copyOnWrite();
                ((VoiceLiveContentUpdateNotice) this.instance).setRoomIdBytes(byteString);
                return this;
            }

            public Builder addLiveCampaigns(int i, VoiceLiveCampaignInfo voiceLiveCampaignInfo) {
                copyOnWrite();
                ((VoiceLiveContentUpdateNotice) this.instance).addLiveCampaigns(i, voiceLiveCampaignInfo);
                return this;
            }

            public Builder setLiveCampaigns(int i, VoiceLiveCampaignInfo.Builder builder) {
                copyOnWrite();
                ((VoiceLiveContentUpdateNotice) this.instance).setLiveCampaigns(i, builder);
                return this;
            }

            public Builder addLiveCampaigns(VoiceLiveCampaignInfo.Builder builder) {
                copyOnWrite();
                ((VoiceLiveContentUpdateNotice) this.instance).addLiveCampaigns(builder);
                return this;
            }

            public Builder addLiveCampaigns(int i, VoiceLiveCampaignInfo.Builder builder) {
                copyOnWrite();
                ((VoiceLiveContentUpdateNotice) this.instance).addLiveCampaigns(i, builder);
                return this;
            }
        }

        public static VoiceLiveContentUpdateNotice parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (VoiceLiveContentUpdateNotice) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static VoiceLiveContentUpdateNotice parseFrom(byte[] bArr, C3433h c3433h) throws InvalidProtocolBufferException {
            return (VoiceLiveContentUpdateNotice) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, c3433h);
        }

        public static VoiceLiveContentUpdateNotice parseFrom(InputStream inputStream) throws IOException {
            return (VoiceLiveContentUpdateNotice) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static VoiceLiveContentUpdateNotice parseFrom(InputStream inputStream, C3433h c3433h) throws IOException {
            return (VoiceLiveContentUpdateNotice) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, c3433h);
        }

        public static VoiceLiveContentUpdateNotice parseFrom(C3430e c3430e) throws IOException {
            return (VoiceLiveContentUpdateNotice) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, c3430e);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addLiveCampaigns(int i, VoiceLiveCampaignInfo voiceLiveCampaignInfo) {
            voiceLiveCampaignInfo.getClass();
            ensureLiveCampaignsIsMutable();
            this.liveCampaigns_.add(i, voiceLiveCampaignInfo);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static VoiceLiveContentUpdateNotice parseFrom(C3430e c3430e, C3433h c3433h) throws IOException {
            return (VoiceLiveContentUpdateNotice) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, c3430e, c3433h);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setLiveCampaigns(int i, VoiceLiveCampaignInfo voiceLiveCampaignInfo) {
            voiceLiveCampaignInfo.getClass();
            ensureLiveCampaignsIsMutable();
            this.liveCampaigns_.set(i, voiceLiveCampaignInfo);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addLiveCampaigns(VoiceLiveCampaignInfo voiceLiveCampaignInfo) {
            voiceLiveCampaignInfo.getClass();
            ensureLiveCampaignsIsMutable();
            this.liveCampaigns_.add(voiceLiveCampaignInfo);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addLiveCampaigns(int i, VoiceLiveCampaignInfo.Builder builder) {
            ensureLiveCampaignsIsMutable();
            this.liveCampaigns_.add(i, builder.build());
        }
    }

    public enum VoiceLongLinkUpdateAction implements C3437l.c {
        ActionUnknow(0),
        ReRequest(1),
        Refresh(2),
        Complete(3),
        UNRECOGNIZED(-1);

        public static final int ActionUnknow_VALUE = 0;
        public static final int Complete_VALUE = 3;
        public static final int ReRequest_VALUE = 1;
        public static final int Refresh_VALUE = 2;
        private static final C3437l.d<VoiceLongLinkUpdateAction> internalValueMap = new C3437l.d<VoiceLongLinkUpdateAction>() { // from class: com.p1.mobile.longlink.msg.voicegift.VoiceNewCampaign.VoiceLongLinkUpdateAction.1
            @Override // com.google.protobuf.C3437l.d
            public VoiceLongLinkUpdateAction findValueByNumber(int i) {
                return VoiceLongLinkUpdateAction.forNumber(i);
            }
        };
        private final int value;

        VoiceLongLinkUpdateAction(int i) {
            this.value = i;
        }

        public static VoiceLongLinkUpdateAction forNumber(int i) {
            if (i == 0) {
                return ActionUnknow;
            }
            if (i == 1) {
                return ReRequest;
            }
            if (i == 2) {
                return Refresh;
            }
            if (i != 3) {
                return null;
            }
            return Complete;
        }

        public static C3437l.d<VoiceLongLinkUpdateAction> internalGetValueMap() {
            return internalValueMap;
        }

        @Override // com.google.protobuf.C3437l.c
        public final int getNumber() {
            return this.value;
        }

        @Deprecated
        public static VoiceLongLinkUpdateAction valueOf(int i) {
            return forNumber(i);
        }
    }

    public enum VoiceLongLinkUpdatePosition implements C3437l.c {
        PositionUnknow(0),
        CampaignEntrance(1),
        GiftList(2),
        FirstRechargeCampaign(3),
        LiveCampaign(4),
        FirstRechargeStimulus(5),
        UNRECOGNIZED(-1);

        public static final int CampaignEntrance_VALUE = 1;
        public static final int FirstRechargeCampaign_VALUE = 3;
        public static final int FirstRechargeStimulus_VALUE = 5;
        public static final int GiftList_VALUE = 2;
        public static final int LiveCampaign_VALUE = 4;
        public static final int PositionUnknow_VALUE = 0;
        private static final C3437l.d<VoiceLongLinkUpdatePosition> internalValueMap = new C3437l.d<VoiceLongLinkUpdatePosition>() { // from class: com.p1.mobile.longlink.msg.voicegift.VoiceNewCampaign.VoiceLongLinkUpdatePosition.1
            @Override // com.google.protobuf.C3437l.d
            public VoiceLongLinkUpdatePosition findValueByNumber(int i) {
                return VoiceLongLinkUpdatePosition.forNumber(i);
            }
        };
        private final int value;

        VoiceLongLinkUpdatePosition(int i) {
            this.value = i;
        }

        public static VoiceLongLinkUpdatePosition forNumber(int i) {
            if (i == 0) {
                return PositionUnknow;
            }
            if (i == 1) {
                return CampaignEntrance;
            }
            if (i == 2) {
                return GiftList;
            }
            if (i == 3) {
                return FirstRechargeCampaign;
            }
            if (i == 4) {
                return LiveCampaign;
            }
            if (i != 5) {
                return null;
            }
            return FirstRechargeStimulus;
        }

        public static C3437l.d<VoiceLongLinkUpdatePosition> internalGetValueMap() {
            return internalValueMap;
        }

        @Override // com.google.protobuf.C3437l.c
        public final int getNumber() {
            return this.value;
        }

        @Deprecated
        public static VoiceLongLinkUpdatePosition valueOf(int i) {
            return forNumber(i);
        }
    }
}
