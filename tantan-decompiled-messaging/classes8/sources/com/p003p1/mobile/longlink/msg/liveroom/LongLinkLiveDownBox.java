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
public final class LongLinkLiveDownBox {

    /* JADX INFO: renamed from: com.p1.mobile.longlink.msg.liveroom.LongLinkLiveDownBox$1 */
    public static /* synthetic */ class C03931 {

        /* JADX INFO: renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f1670xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f1670xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f1670xa1df5c61[GeneratedMessageLite.MethodToInvoke.IS_INITIALIZED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f1670xa1df5c61[GeneratedMessageLite.MethodToInvoke.MAKE_IMMUTABLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f1670xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f1670xa1df5c61[GeneratedMessageLite.MethodToInvoke.VISIT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f1670xa1df5c61[GeneratedMessageLite.MethodToInvoke.MERGE_FROM_STREAM.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f1670xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f1670xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    public interface LiveAccessChannelOrBuilder extends o6z {
        long getBottomRemainDuration();

        /* synthetic */ q getDefaultInstanceForType();

        DynamicType getDynamicType();

        int getDynamicTypeValue();

        String getInnerIcon();

        ByteString getInnerIconBytes();

        String getJumpSchema();

        ByteString getJumpSchemaBytes();

        AccessChannelJumpType getJumpType();

        int getJumpTypeValue();

        String getOuterIcon();

        ByteString getOuterIconBytes();

        String getOuterVanishDynamic();

        ByteString getOuterVanishDynamicBytes();

        String getSource();

        ByteString getSourceBytes();

        /* synthetic */ boolean isInitialized();
    }

    private LongLinkLiveDownBox() {
    }

    public static void registerAllExtensions(h hVar) {
    }

    public enum AccessChannelJumpType implements l.c {
        url(0),
        schema(1),
        UNRECOGNIZED(-1);

        private static final l.d<AccessChannelJumpType> internalValueMap = new l.d<AccessChannelJumpType>() { // from class: com.p1.mobile.longlink.msg.liveroom.LongLinkLiveDownBox.AccessChannelJumpType.1
            public AccessChannelJumpType findValueByNumber(int i) {
                return AccessChannelJumpType.forNumber(i);
            }
        };
        public static final int schema_VALUE = 1;
        public static final int url_VALUE = 0;
        private final int value;

        AccessChannelJumpType(int i) {
            this.value = i;
        }

        public static AccessChannelJumpType forNumber(int i) {
            if (i == 0) {
                return url;
            }
            if (i != 1) {
                return null;
            }
            return schema;
        }

        public static l.d<AccessChannelJumpType> internalGetValueMap() {
            return internalValueMap;
        }

        public final int getNumber() {
            return this.value;
        }

        @Deprecated
        public static AccessChannelJumpType valueOf(int i) {
            return forNumber(i);
        }
    }

    public enum DynamicType implements l.c {
        fall(0),
        UNRECOGNIZED(-1);

        public static final int fall_VALUE = 0;
        private static final l.d<DynamicType> internalValueMap = new l.d<DynamicType>() { // from class: com.p1.mobile.longlink.msg.liveroom.LongLinkLiveDownBox.DynamicType.1
            public DynamicType findValueByNumber(int i) {
                return DynamicType.forNumber(i);
            }
        };
        private final int value;

        DynamicType(int i) {
            this.value = i;
        }

        public static DynamicType forNumber(int i) {
            if (i != 0) {
                return null;
            }
            return fall;
        }

        public static l.d<DynamicType> internalGetValueMap() {
            return internalValueMap;
        }

        public final int getNumber() {
            return this.value;
        }

        @Deprecated
        public static DynamicType valueOf(int i) {
            return forNumber(i);
        }
    }

    public static final class LiveAccessChannel extends GeneratedMessageLite<LiveAccessChannel, Builder> implements LiveAccessChannelOrBuilder {
        public static final int BOTTOMREMAINDURATION_FIELD_NUMBER = 8;
        private static final LiveAccessChannel DEFAULT_INSTANCE;
        public static final int DYNAMICTYPE_FIELD_NUMBER = 3;
        public static final int INNERICON_FIELD_NUMBER = 2;
        public static final int JUMPSCHEMA_FIELD_NUMBER = 5;
        public static final int JUMPTYPE_FIELD_NUMBER = 4;
        public static final int OUTERICON_FIELD_NUMBER = 1;
        public static final int OUTERVANISHDYNAMIC_FIELD_NUMBER = 6;
        private static volatile i860<LiveAccessChannel> PARSER = null;
        public static final int SOURCE_FIELD_NUMBER = 7;
        private long bottomRemainDuration_;
        private int dynamicType_;
        private int jumpType_;
        private String outerIcon_ = "";
        private String innerIcon_ = "";
        private String jumpSchema_ = "";
        private String outerVanishDynamic_ = "";
        private String source_ = "";

        public static final class Builder extends GeneratedMessageLite.b<LiveAccessChannel, Builder> implements LiveAccessChannelOrBuilder {
            private Builder() {
                super(LiveAccessChannel.DEFAULT_INSTANCE);
            }

            public Builder clearBottomRemainDuration() {
                copyOnWrite();
                ((LiveAccessChannel) ((GeneratedMessageLite.b) this).instance).clearBottomRemainDuration();
                return this;
            }

            public Builder clearDynamicType() {
                copyOnWrite();
                ((LiveAccessChannel) ((GeneratedMessageLite.b) this).instance).clearDynamicType();
                return this;
            }

            public Builder clearInnerIcon() {
                copyOnWrite();
                ((LiveAccessChannel) ((GeneratedMessageLite.b) this).instance).clearInnerIcon();
                return this;
            }

            public Builder clearJumpSchema() {
                copyOnWrite();
                ((LiveAccessChannel) ((GeneratedMessageLite.b) this).instance).clearJumpSchema();
                return this;
            }

            public Builder clearJumpType() {
                copyOnWrite();
                ((LiveAccessChannel) ((GeneratedMessageLite.b) this).instance).clearJumpType();
                return this;
            }

            public Builder clearOuterIcon() {
                copyOnWrite();
                ((LiveAccessChannel) ((GeneratedMessageLite.b) this).instance).clearOuterIcon();
                return this;
            }

            public Builder clearOuterVanishDynamic() {
                copyOnWrite();
                ((LiveAccessChannel) ((GeneratedMessageLite.b) this).instance).clearOuterVanishDynamic();
                return this;
            }

            public Builder clearSource() {
                copyOnWrite();
                ((LiveAccessChannel) ((GeneratedMessageLite.b) this).instance).clearSource();
                return this;
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkLiveDownBox.LiveAccessChannelOrBuilder
            public long getBottomRemainDuration() {
                return ((LiveAccessChannel) ((GeneratedMessageLite.b) this).instance).getBottomRemainDuration();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkLiveDownBox.LiveAccessChannelOrBuilder
            public DynamicType getDynamicType() {
                return ((LiveAccessChannel) ((GeneratedMessageLite.b) this).instance).getDynamicType();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkLiveDownBox.LiveAccessChannelOrBuilder
            public int getDynamicTypeValue() {
                return ((LiveAccessChannel) ((GeneratedMessageLite.b) this).instance).getDynamicTypeValue();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkLiveDownBox.LiveAccessChannelOrBuilder
            public String getInnerIcon() {
                return ((LiveAccessChannel) ((GeneratedMessageLite.b) this).instance).getInnerIcon();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkLiveDownBox.LiveAccessChannelOrBuilder
            public ByteString getInnerIconBytes() {
                return ((LiveAccessChannel) ((GeneratedMessageLite.b) this).instance).getInnerIconBytes();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkLiveDownBox.LiveAccessChannelOrBuilder
            public String getJumpSchema() {
                return ((LiveAccessChannel) ((GeneratedMessageLite.b) this).instance).getJumpSchema();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkLiveDownBox.LiveAccessChannelOrBuilder
            public ByteString getJumpSchemaBytes() {
                return ((LiveAccessChannel) ((GeneratedMessageLite.b) this).instance).getJumpSchemaBytes();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkLiveDownBox.LiveAccessChannelOrBuilder
            public AccessChannelJumpType getJumpType() {
                return ((LiveAccessChannel) ((GeneratedMessageLite.b) this).instance).getJumpType();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkLiveDownBox.LiveAccessChannelOrBuilder
            public int getJumpTypeValue() {
                return ((LiveAccessChannel) ((GeneratedMessageLite.b) this).instance).getJumpTypeValue();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkLiveDownBox.LiveAccessChannelOrBuilder
            public String getOuterIcon() {
                return ((LiveAccessChannel) ((GeneratedMessageLite.b) this).instance).getOuterIcon();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkLiveDownBox.LiveAccessChannelOrBuilder
            public ByteString getOuterIconBytes() {
                return ((LiveAccessChannel) ((GeneratedMessageLite.b) this).instance).getOuterIconBytes();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkLiveDownBox.LiveAccessChannelOrBuilder
            public String getOuterVanishDynamic() {
                return ((LiveAccessChannel) ((GeneratedMessageLite.b) this).instance).getOuterVanishDynamic();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkLiveDownBox.LiveAccessChannelOrBuilder
            public ByteString getOuterVanishDynamicBytes() {
                return ((LiveAccessChannel) ((GeneratedMessageLite.b) this).instance).getOuterVanishDynamicBytes();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkLiveDownBox.LiveAccessChannelOrBuilder
            public String getSource() {
                return ((LiveAccessChannel) ((GeneratedMessageLite.b) this).instance).getSource();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkLiveDownBox.LiveAccessChannelOrBuilder
            public ByteString getSourceBytes() {
                return ((LiveAccessChannel) ((GeneratedMessageLite.b) this).instance).getSourceBytes();
            }

            public Builder setBottomRemainDuration(long j) {
                copyOnWrite();
                ((LiveAccessChannel) ((GeneratedMessageLite.b) this).instance).setBottomRemainDuration(j);
                return this;
            }

            public Builder setDynamicType(DynamicType dynamicType) {
                copyOnWrite();
                ((LiveAccessChannel) ((GeneratedMessageLite.b) this).instance).setDynamicType(dynamicType);
                return this;
            }

            public Builder setDynamicTypeValue(int i) {
                copyOnWrite();
                ((LiveAccessChannel) ((GeneratedMessageLite.b) this).instance).setDynamicTypeValue(i);
                return this;
            }

            public Builder setInnerIcon(String str) {
                copyOnWrite();
                ((LiveAccessChannel) ((GeneratedMessageLite.b) this).instance).setInnerIcon(str);
                return this;
            }

            public Builder setInnerIconBytes(ByteString byteString) {
                copyOnWrite();
                ((LiveAccessChannel) ((GeneratedMessageLite.b) this).instance).setInnerIconBytes(byteString);
                return this;
            }

            public Builder setJumpSchema(String str) {
                copyOnWrite();
                ((LiveAccessChannel) ((GeneratedMessageLite.b) this).instance).setJumpSchema(str);
                return this;
            }

            public Builder setJumpSchemaBytes(ByteString byteString) {
                copyOnWrite();
                ((LiveAccessChannel) ((GeneratedMessageLite.b) this).instance).setJumpSchemaBytes(byteString);
                return this;
            }

            public Builder setJumpType(AccessChannelJumpType accessChannelJumpType) {
                copyOnWrite();
                ((LiveAccessChannel) ((GeneratedMessageLite.b) this).instance).setJumpType(accessChannelJumpType);
                return this;
            }

            public Builder setJumpTypeValue(int i) {
                copyOnWrite();
                ((LiveAccessChannel) ((GeneratedMessageLite.b) this).instance).setJumpTypeValue(i);
                return this;
            }

            public Builder setOuterIcon(String str) {
                copyOnWrite();
                ((LiveAccessChannel) ((GeneratedMessageLite.b) this).instance).setOuterIcon(str);
                return this;
            }

            public Builder setOuterIconBytes(ByteString byteString) {
                copyOnWrite();
                ((LiveAccessChannel) ((GeneratedMessageLite.b) this).instance).setOuterIconBytes(byteString);
                return this;
            }

            public Builder setOuterVanishDynamic(String str) {
                copyOnWrite();
                ((LiveAccessChannel) ((GeneratedMessageLite.b) this).instance).setOuterVanishDynamic(str);
                return this;
            }

            public Builder setOuterVanishDynamicBytes(ByteString byteString) {
                copyOnWrite();
                ((LiveAccessChannel) ((GeneratedMessageLite.b) this).instance).setOuterVanishDynamicBytes(byteString);
                return this;
            }

            public Builder setSource(String str) {
                copyOnWrite();
                ((LiveAccessChannel) ((GeneratedMessageLite.b) this).instance).setSource(str);
                return this;
            }

            public Builder setSourceBytes(ByteString byteString) {
                copyOnWrite();
                ((LiveAccessChannel) ((GeneratedMessageLite.b) this).instance).setSourceBytes(byteString);
                return this;
            }
        }

        static {
            LiveAccessChannel liveAccessChannel = new LiveAccessChannel();
            DEFAULT_INSTANCE = liveAccessChannel;
            liveAccessChannel.makeImmutable();
        }

        private LiveAccessChannel() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearBottomRemainDuration() {
            this.bottomRemainDuration_ = 0L;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearDynamicType() {
            this.dynamicType_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearInnerIcon() {
            this.innerIcon_ = getDefaultInstance().getInnerIcon();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearJumpSchema() {
            this.jumpSchema_ = getDefaultInstance().getJumpSchema();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearJumpType() {
            this.jumpType_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearOuterIcon() {
            this.outerIcon_ = getDefaultInstance().getOuterIcon();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearOuterVanishDynamic() {
            this.outerVanishDynamic_ = getDefaultInstance().getOuterVanishDynamic();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearSource() {
            this.source_ = getDefaultInstance().getSource();
        }

        public static LiveAccessChannel getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder(LiveAccessChannel liveAccessChannel) {
            return (Builder) ((Builder) DEFAULT_INSTANCE.toBuilder()).mergeFrom(liveAccessChannel);
        }

        public static LiveAccessChannel parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (LiveAccessChannel) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static LiveAccessChannel parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (LiveAccessChannel) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static i860<LiveAccessChannel> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setBottomRemainDuration(long j) {
            this.bottomRemainDuration_ = j;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setDynamicType(DynamicType dynamicType) {
            dynamicType.getClass();
            this.dynamicType_ = dynamicType.getNumber();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setDynamicTypeValue(int i) {
            this.dynamicType_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setInnerIcon(String str) {
            str.getClass();
            this.innerIcon_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setInnerIconBytes(ByteString byteString) {
            byteString.getClass();
            a.checkByteStringIsUtf8(byteString);
            this.innerIcon_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setJumpSchema(String str) {
            str.getClass();
            this.jumpSchema_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setJumpSchemaBytes(ByteString byteString) {
            byteString.getClass();
            a.checkByteStringIsUtf8(byteString);
            this.jumpSchema_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setJumpType(AccessChannelJumpType accessChannelJumpType) {
            accessChannelJumpType.getClass();
            this.jumpType_ = accessChannelJumpType.getNumber();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setJumpTypeValue(int i) {
            this.jumpType_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setOuterIcon(String str) {
            str.getClass();
            this.outerIcon_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setOuterIconBytes(ByteString byteString) {
            byteString.getClass();
            a.checkByteStringIsUtf8(byteString);
            this.outerIcon_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setOuterVanishDynamic(String str) {
            str.getClass();
            this.outerVanishDynamic_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setOuterVanishDynamicBytes(ByteString byteString) {
            byteString.getClass();
            a.checkByteStringIsUtf8(byteString);
            this.outerVanishDynamic_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSource(String str) {
            str.getClass();
            this.source_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSourceBytes(ByteString byteString) {
            byteString.getClass();
            a.checkByteStringIsUtf8(byteString);
            this.source_ = byteString.toStringUtf8();
        }

        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            boolean z = false;
            switch (C03931.f1670xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new LiveAccessChannel();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                    return null;
                case 4:
                    return new Builder();
                case 5:
                    GeneratedMessageLite.h hVar = (GeneratedMessageLite.h) obj;
                    LiveAccessChannel liveAccessChannel = (LiveAccessChannel) obj2;
                    this.outerIcon_ = hVar.f(!this.outerIcon_.isEmpty(), this.outerIcon_, !liveAccessChannel.outerIcon_.isEmpty(), liveAccessChannel.outerIcon_);
                    this.innerIcon_ = hVar.f(!this.innerIcon_.isEmpty(), this.innerIcon_, !liveAccessChannel.innerIcon_.isEmpty(), liveAccessChannel.innerIcon_);
                    int i = this.dynamicType_;
                    boolean z2 = i != 0;
                    int i2 = liveAccessChannel.dynamicType_;
                    this.dynamicType_ = hVar.e(z2, i, i2 != 0, i2);
                    int i3 = this.jumpType_;
                    boolean z3 = i3 != 0;
                    int i4 = liveAccessChannel.jumpType_;
                    this.jumpType_ = hVar.e(z3, i3, i4 != 0, i4);
                    this.jumpSchema_ = hVar.f(!this.jumpSchema_.isEmpty(), this.jumpSchema_, !liveAccessChannel.jumpSchema_.isEmpty(), liveAccessChannel.jumpSchema_);
                    this.outerVanishDynamic_ = hVar.f(!this.outerVanishDynamic_.isEmpty(), this.outerVanishDynamic_, !liveAccessChannel.outerVanishDynamic_.isEmpty(), liveAccessChannel.outerVanishDynamic_);
                    this.source_ = hVar.f(!this.source_.isEmpty(), this.source_, !liveAccessChannel.source_.isEmpty(), liveAccessChannel.source_);
                    long j = this.bottomRemainDuration_;
                    boolean z4 = j != 0;
                    long j2 = liveAccessChannel.bottomRemainDuration_;
                    this.bottomRemainDuration_ = hVar.i(z4, j, j2 != 0, j2);
                    GeneratedMessageLite.g gVar = GeneratedMessageLite.g.INSTANCE;
                    return this;
                case 6:
                    e eVar = (e) obj;
                    while (!z) {
                        try {
                            int iM = eVar.M();
                            if (iM != 0) {
                                if (iM == 10) {
                                    this.outerIcon_ = eVar.L();
                                } else if (iM == 18) {
                                    this.innerIcon_ = eVar.L();
                                } else if (iM == 24) {
                                    this.dynamicType_ = eVar.p();
                                } else if (iM == 32) {
                                    this.jumpType_ = eVar.p();
                                } else if (iM == 42) {
                                    this.jumpSchema_ = eVar.L();
                                } else if (iM == 50) {
                                    this.outerVanishDynamic_ = eVar.L();
                                } else if (iM == 58) {
                                    this.source_ = eVar.L();
                                } else if (iM == 64) {
                                    this.bottomRemainDuration_ = eVar.v();
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
                        synchronized (LiveAccessChannel.class) {
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

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkLiveDownBox.LiveAccessChannelOrBuilder
        public long getBottomRemainDuration() {
            return this.bottomRemainDuration_;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkLiveDownBox.LiveAccessChannelOrBuilder
        public DynamicType getDynamicType() {
            DynamicType dynamicTypeForNumber = DynamicType.forNumber(this.dynamicType_);
            return dynamicTypeForNumber == null ? DynamicType.UNRECOGNIZED : dynamicTypeForNumber;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkLiveDownBox.LiveAccessChannelOrBuilder
        public int getDynamicTypeValue() {
            return this.dynamicType_;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkLiveDownBox.LiveAccessChannelOrBuilder
        public String getInnerIcon() {
            return this.innerIcon_;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkLiveDownBox.LiveAccessChannelOrBuilder
        public ByteString getInnerIconBytes() {
            return ByteString.copyFromUtf8(this.innerIcon_);
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkLiveDownBox.LiveAccessChannelOrBuilder
        public String getJumpSchema() {
            return this.jumpSchema_;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkLiveDownBox.LiveAccessChannelOrBuilder
        public ByteString getJumpSchemaBytes() {
            return ByteString.copyFromUtf8(this.jumpSchema_);
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkLiveDownBox.LiveAccessChannelOrBuilder
        public AccessChannelJumpType getJumpType() {
            AccessChannelJumpType accessChannelJumpTypeForNumber = AccessChannelJumpType.forNumber(this.jumpType_);
            return accessChannelJumpTypeForNumber == null ? AccessChannelJumpType.UNRECOGNIZED : accessChannelJumpTypeForNumber;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkLiveDownBox.LiveAccessChannelOrBuilder
        public int getJumpTypeValue() {
            return this.jumpType_;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkLiveDownBox.LiveAccessChannelOrBuilder
        public String getOuterIcon() {
            return this.outerIcon_;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkLiveDownBox.LiveAccessChannelOrBuilder
        public ByteString getOuterIconBytes() {
            return ByteString.copyFromUtf8(this.outerIcon_);
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkLiveDownBox.LiveAccessChannelOrBuilder
        public String getOuterVanishDynamic() {
            return this.outerVanishDynamic_;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkLiveDownBox.LiveAccessChannelOrBuilder
        public ByteString getOuterVanishDynamicBytes() {
            return ByteString.copyFromUtf8(this.outerVanishDynamic_);
        }

        public int getSerializedSize() {
            int i = ((GeneratedMessageLite) this).memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int iK = !this.outerIcon_.isEmpty() ? CodedOutputStream.K(1, getOuterIcon()) : 0;
            if (!this.innerIcon_.isEmpty()) {
                iK += CodedOutputStream.K(2, getInnerIcon());
            }
            if (this.dynamicType_ != DynamicType.fall.getNumber()) {
                iK += CodedOutputStream.m(3, this.dynamicType_);
            }
            if (this.jumpType_ != AccessChannelJumpType.url.getNumber()) {
                iK += CodedOutputStream.m(4, this.jumpType_);
            }
            if (!this.jumpSchema_.isEmpty()) {
                iK += CodedOutputStream.K(5, getJumpSchema());
            }
            if (!this.outerVanishDynamic_.isEmpty()) {
                iK += CodedOutputStream.K(6, getOuterVanishDynamic());
            }
            if (!this.source_.isEmpty()) {
                iK += CodedOutputStream.K(7, getSource());
            }
            long j = this.bottomRemainDuration_;
            if (j != 0) {
                iK += CodedOutputStream.v(8, j);
            }
            ((GeneratedMessageLite) this).memoizedSerializedSize = iK;
            return iK;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkLiveDownBox.LiveAccessChannelOrBuilder
        public String getSource() {
            return this.source_;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkLiveDownBox.LiveAccessChannelOrBuilder
        public ByteString getSourceBytes() {
            return ByteString.copyFromUtf8(this.source_);
        }

        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (!this.outerIcon_.isEmpty()) {
                codedOutputStream.D0(1, getOuterIcon());
            }
            if (!this.innerIcon_.isEmpty()) {
                codedOutputStream.D0(2, getInnerIcon());
            }
            if (this.dynamicType_ != DynamicType.fall.getNumber()) {
                codedOutputStream.i0(3, this.dynamicType_);
            }
            if (this.jumpType_ != AccessChannelJumpType.url.getNumber()) {
                codedOutputStream.i0(4, this.jumpType_);
            }
            if (!this.jumpSchema_.isEmpty()) {
                codedOutputStream.D0(5, getJumpSchema());
            }
            if (!this.outerVanishDynamic_.isEmpty()) {
                codedOutputStream.D0(6, getOuterVanishDynamic());
            }
            if (!this.source_.isEmpty()) {
                codedOutputStream.D0(7, getSource());
            }
            long j = this.bottomRemainDuration_;
            if (j != 0) {
                codedOutputStream.u0(8, j);
            }
        }

        public static LiveAccessChannel parseDelimitedFrom(InputStream inputStream, h hVar) throws IOException {
            return (LiveAccessChannel) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, hVar);
        }

        public static LiveAccessChannel parseFrom(ByteString byteString, h hVar) throws InvalidProtocolBufferException {
            return (LiveAccessChannel) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, hVar);
        }

        public static LiveAccessChannel parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (LiveAccessChannel) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static LiveAccessChannel parseFrom(byte[] bArr, h hVar) throws InvalidProtocolBufferException {
            return (LiveAccessChannel) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, hVar);
        }

        public static LiveAccessChannel parseFrom(InputStream inputStream) throws IOException {
            return (LiveAccessChannel) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static LiveAccessChannel parseFrom(InputStream inputStream, h hVar) throws IOException {
            return (LiveAccessChannel) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, hVar);
        }

        public static LiveAccessChannel parseFrom(e eVar) throws IOException {
            return (LiveAccessChannel) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, eVar);
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.toBuilder();
        }

        public static LiveAccessChannel parseFrom(e eVar, h hVar) throws IOException {
            return (LiveAccessChannel) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, eVar, hVar);
        }
    }
}
