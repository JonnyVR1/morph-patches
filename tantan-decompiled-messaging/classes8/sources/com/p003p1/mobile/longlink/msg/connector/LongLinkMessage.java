package com.p003p1.mobile.longlink.msg.connector;

import com.google.protobuf.Any;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.MapFieldLite;
import com.google.protobuf.WireFormat;
import com.google.protobuf.a;
import com.google.protobuf.e;
import com.google.protobuf.h;
import com.google.protobuf.l;
import com.google.protobuf.p;
import com.google.protobuf.q;
import com.momo.xeengine.gift.XEGiftErrorCode;
import java.io.IOException;
import java.io.InputStream;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import l.aag0;
import l.bz00;
import l.i860;
import l.o6z;
import l.x9g0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes8.dex */
public final class LongLinkMessage {

    /* JADX INFO: renamed from: com.p1.mobile.longlink.msg.connector.LongLinkMessage$1 */
    public static /* synthetic */ class C03151 {

        /* JADX INFO: renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f1634xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f1634xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f1634xa1df5c61[GeneratedMessageLite.MethodToInvoke.IS_INITIALIZED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f1634xa1df5c61[GeneratedMessageLite.MethodToInvoke.MAKE_IMMUTABLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f1634xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f1634xa1df5c61[GeneratedMessageLite.MethodToInvoke.VISIT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f1634xa1df5c61[GeneratedMessageLite.MethodToInvoke.MERGE_FROM_STREAM.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f1634xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f1634xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    public interface I18nOrBuilder extends o6z {
        boolean containsLocales(String str);

        /* synthetic */ q getDefaultInstanceForType();

        @Deprecated
        Map<String, String> getLocales();

        int getLocalesCount();

        Map<String, String> getLocalesMap();

        String getLocalesOrDefault(String str, String str2);

        String getLocalesOrThrow(String str);

        String getParams(int i);

        ByteString getParamsBytes(int i);

        int getParamsCount();

        List<String> getParamsList();

        String getValue();

        ByteString getValueBytes();

        /* synthetic */ boolean isInitialized();
    }

    public interface IdTypeOrBuilder extends o6z {
        /* synthetic */ q getDefaultInstanceForType();

        String getId();

        ByteString getIdBytes();

        IdType getParent();

        String getType();

        ByteString getTypeBytes();

        boolean hasParent();

        /* synthetic */ boolean isInitialized();
    }

    public interface MsgOrBuilder extends o6z {
        Any getData();

        /* synthetic */ q getDefaultInstanceForType();

        boolean getIsAck();

        boolean getIsReliable();

        String getMsgId();

        ByteString getMsgIdBytes();

        String getMsgTypeName();

        ByteString getMsgTypeNameBytes();

        PushContent getPush();

        MsgTypeEnum getType();

        int getTypeValue();

        String getVersion();

        ByteString getVersionBytes();

        boolean hasData();

        boolean hasPush();

        /* synthetic */ boolean isInitialized();
    }

    public interface MsgsOrBuilder extends o6z {
        /* synthetic */ q getDefaultInstanceForType();

        Msg getMsgs(int i);

        int getMsgsCount();

        List<Msg> getMsgsList();

        /* synthetic */ boolean isInitialized();
    }

    public interface PushContentOrBuilder extends o6z {
        boolean containsMessageCustom(String str);

        IdType getContent();

        int getCounter();

        long getCreateTime();

        /* synthetic */ q getDefaultInstanceForType();

        String getImageURLWithoutFormat();

        ByteString getImageURLWithoutFormatBytes();

        String getIntent();

        ByteString getIntentBytes();

        String getLink();

        ByteString getLinkBytes();

        String getMessage();

        ByteString getMessageBytes();

        @Deprecated
        Map<String, String> getMessageCustom();

        int getMessageCustomCount();

        Map<String, String> getMessageCustomMap();

        String getMessageCustomOrDefault(String str, String str2);

        String getMessageCustomOrThrow(String str);

        String getPrimaryPicture();

        ByteString getPrimaryPictureBytes();

        int getPriority();

        String getReqId();

        ByteString getReqIdBytes();

        boolean getSilent();

        boolean getSilentAggregation();

        int getStackId();

        I18n getTicker();

        I18n getTitle();

        I18n getValue();

        boolean hasContent();

        boolean hasTicker();

        boolean hasTitle();

        boolean hasValue();

        /* synthetic */ boolean isInitialized();
    }

    private LongLinkMessage() {
    }

    public static void registerAllExtensions(h hVar) {
    }

    public static final class I18n extends GeneratedMessageLite<I18n, Builder> implements I18nOrBuilder {
        private static final I18n DEFAULT_INSTANCE;
        public static final int LOCALES_FIELD_NUMBER = 2;
        public static final int PARAMS_FIELD_NUMBER = 3;
        private static volatile i860<I18n> PARSER = null;
        public static final int VALUE_FIELD_NUMBER = 1;
        private int bitField0_;
        private MapFieldLite<String, String> locales_ = MapFieldLite.emptyMapField();
        private String value_ = "";
        private l.h<String> params_ = GeneratedMessageLite.emptyProtobufList();

        public static final class LocalesDefaultEntryHolder {
            static final p<String, String> defaultEntry;

            static {
                WireFormat.FieldType fieldType = WireFormat.FieldType.STRING;
                defaultEntry = p.c(fieldType, "", fieldType, "");
            }

            private LocalesDefaultEntryHolder() {
            }
        }

        static {
            I18n i18n = new I18n();
            DEFAULT_INSTANCE = i18n;
            i18n.makeImmutable();
        }

        private I18n() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllParams(Iterable<String> iterable) {
            ensureParamsIsMutable();
            a.addAll(iterable, this.params_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addParams(String str) {
            str.getClass();
            ensureParamsIsMutable();
            this.params_.add(str);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addParamsBytes(ByteString byteString) {
            byteString.getClass();
            a.checkByteStringIsUtf8(byteString);
            ensureParamsIsMutable();
            this.params_.add(byteString.toStringUtf8());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearParams() {
            this.params_ = GeneratedMessageLite.emptyProtobufList();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearValue() {
            this.value_ = getDefaultInstance().getValue();
        }

        private void ensureParamsIsMutable() {
            if (this.params_.q()) {
                return;
            }
            this.params_ = GeneratedMessageLite.mutableCopy(this.params_);
        }

        public static I18n getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public Map<String, String> getMutableLocalesMap() {
            return internalGetMutableLocales();
        }

        private MapFieldLite<String, String> internalGetLocales() {
            return this.locales_;
        }

        private MapFieldLite<String, String> internalGetMutableLocales() {
            if (!this.locales_.isMutable()) {
                this.locales_ = this.locales_.mutableCopy();
            }
            return this.locales_;
        }

        public static Builder newBuilder(I18n i18n) {
            return (Builder) ((Builder) DEFAULT_INSTANCE.toBuilder()).mergeFrom(i18n);
        }

        public static I18n parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (I18n) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static I18n parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (I18n) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static i860<I18n> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setParams(int i, String str) {
            str.getClass();
            ensureParamsIsMutable();
            this.params_.set(i, str);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setValue(String str) {
            str.getClass();
            this.value_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setValueBytes(ByteString byteString) {
            byteString.getClass();
            a.checkByteStringIsUtf8(byteString);
            this.value_ = byteString.toStringUtf8();
        }

        @Override // com.p1.mobile.longlink.msg.connector.LongLinkMessage.I18nOrBuilder
        public boolean containsLocales(String str) {
            str.getClass();
            return internalGetLocales().containsKey(str);
        }

        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            C03151 c03151 = null;
            switch (C03151.f1634xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new I18n();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                    this.locales_.makeImmutable();
                    this.params_.n();
                    return null;
                case 4:
                    return new Builder(c03151);
                case 5:
                    GeneratedMessageLite.g gVar = (GeneratedMessageLite.h) obj;
                    I18n i18n = (I18n) obj2;
                    this.value_ = gVar.f(!this.value_.isEmpty(), this.value_, true ^ i18n.value_.isEmpty(), i18n.value_);
                    this.locales_ = gVar.l(this.locales_, i18n.internalGetLocales());
                    this.params_ = gVar.g(this.params_, i18n.params_);
                    if (gVar == GeneratedMessageLite.g.INSTANCE) {
                        this.bitField0_ |= i18n.bitField0_;
                    }
                    return this;
                case 6:
                    e eVar = (e) obj;
                    h hVar = (h) obj2;
                    boolean z = false;
                    while (!z) {
                        try {
                            int iM = eVar.M();
                            if (iM != 0) {
                                if (iM == 10) {
                                    this.value_ = eVar.L();
                                } else if (iM == 18) {
                                    if (!this.locales_.isMutable()) {
                                        this.locales_ = this.locales_.mutableCopy();
                                    }
                                    LocalesDefaultEntryHolder.defaultEntry.e(this.locales_, eVar, hVar);
                                } else if (iM == 26) {
                                    String strL = eVar.L();
                                    if (!this.params_.q()) {
                                        this.params_ = GeneratedMessageLite.mutableCopy(this.params_);
                                    }
                                    this.params_.add(strL);
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
                        synchronized (I18n.class) {
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

        @Override // com.p1.mobile.longlink.msg.connector.LongLinkMessage.I18nOrBuilder
        @Deprecated
        public Map<String, String> getLocales() {
            return getLocalesMap();
        }

        @Override // com.p1.mobile.longlink.msg.connector.LongLinkMessage.I18nOrBuilder
        public int getLocalesCount() {
            return internalGetLocales().size();
        }

        @Override // com.p1.mobile.longlink.msg.connector.LongLinkMessage.I18nOrBuilder
        public Map<String, String> getLocalesMap() {
            return Collections.unmodifiableMap(internalGetLocales());
        }

        @Override // com.p1.mobile.longlink.msg.connector.LongLinkMessage.I18nOrBuilder
        public String getLocalesOrDefault(String str, String str2) {
            str.getClass();
            MapFieldLite<String, String> mapFieldLiteInternalGetLocales = internalGetLocales();
            return mapFieldLiteInternalGetLocales.containsKey(str) ? (String) mapFieldLiteInternalGetLocales.get(str) : str2;
        }

        @Override // com.p1.mobile.longlink.msg.connector.LongLinkMessage.I18nOrBuilder
        public String getLocalesOrThrow(String str) {
            str.getClass();
            MapFieldLite<String, String> mapFieldLiteInternalGetLocales = internalGetLocales();
            if (mapFieldLiteInternalGetLocales.containsKey(str)) {
                return (String) mapFieldLiteInternalGetLocales.get(str);
            }
            x9g0.a();
            return null;
        }

        @Override // com.p1.mobile.longlink.msg.connector.LongLinkMessage.I18nOrBuilder
        public String getParams(int i) {
            return (String) this.params_.get(i);
        }

        @Override // com.p1.mobile.longlink.msg.connector.LongLinkMessage.I18nOrBuilder
        public ByteString getParamsBytes(int i) {
            return ByteString.copyFromUtf8((String) this.params_.get(i));
        }

        @Override // com.p1.mobile.longlink.msg.connector.LongLinkMessage.I18nOrBuilder
        public int getParamsCount() {
            return this.params_.size();
        }

        @Override // com.p1.mobile.longlink.msg.connector.LongLinkMessage.I18nOrBuilder
        public List<String> getParamsList() {
            return this.params_;
        }

        public int getSerializedSize() {
            int i = ((GeneratedMessageLite) this).memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int iK = !this.value_.isEmpty() ? CodedOutputStream.K(1, getValue()) : 0;
            for (Map.Entry entry : internalGetLocales().entrySet()) {
                iK += LocalesDefaultEntryHolder.defaultEntry.a(2, (String) entry.getKey(), (String) entry.getValue());
            }
            int iL = 0;
            for (int i2 = 0; i2 < this.params_.size(); i2++) {
                iL += CodedOutputStream.L((String) this.params_.get(i2));
            }
            int size = iK + iL + getParamsList().size();
            ((GeneratedMessageLite) this).memoizedSerializedSize = size;
            return size;
        }

        @Override // com.p1.mobile.longlink.msg.connector.LongLinkMessage.I18nOrBuilder
        public String getValue() {
            return this.value_;
        }

        @Override // com.p1.mobile.longlink.msg.connector.LongLinkMessage.I18nOrBuilder
        public ByteString getValueBytes() {
            return ByteString.copyFromUtf8(this.value_);
        }

        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (!this.value_.isEmpty()) {
                codedOutputStream.D0(1, getValue());
            }
            for (Map.Entry entry : internalGetLocales().entrySet()) {
                LocalesDefaultEntryHolder.defaultEntry.f(codedOutputStream, 2, (String) entry.getKey(), (String) entry.getValue());
            }
            for (int i = 0; i < this.params_.size(); i++) {
                codedOutputStream.D0(3, (String) this.params_.get(i));
            }
        }

        public static final class Builder extends GeneratedMessageLite.b<I18n, Builder> implements I18nOrBuilder {
            private Builder() {
                super(I18n.DEFAULT_INSTANCE);
            }

            public Builder addAllParams(Iterable<String> iterable) {
                copyOnWrite();
                ((I18n) ((GeneratedMessageLite.b) this).instance).addAllParams(iterable);
                return this;
            }

            public Builder addParams(String str) {
                copyOnWrite();
                ((I18n) ((GeneratedMessageLite.b) this).instance).addParams(str);
                return this;
            }

            public Builder addParamsBytes(ByteString byteString) {
                copyOnWrite();
                ((I18n) ((GeneratedMessageLite.b) this).instance).addParamsBytes(byteString);
                return this;
            }

            public Builder clearLocales() {
                copyOnWrite();
                ((I18n) ((GeneratedMessageLite.b) this).instance).getMutableLocalesMap().clear();
                return this;
            }

            public Builder clearParams() {
                copyOnWrite();
                ((I18n) ((GeneratedMessageLite.b) this).instance).clearParams();
                return this;
            }

            public Builder clearValue() {
                copyOnWrite();
                ((I18n) ((GeneratedMessageLite.b) this).instance).clearValue();
                return this;
            }

            @Override // com.p1.mobile.longlink.msg.connector.LongLinkMessage.I18nOrBuilder
            public boolean containsLocales(String str) {
                str.getClass();
                return ((I18n) ((GeneratedMessageLite.b) this).instance).getLocalesMap().containsKey(str);
            }

            @Override // com.p1.mobile.longlink.msg.connector.LongLinkMessage.I18nOrBuilder
            @Deprecated
            public Map<String, String> getLocales() {
                return getLocalesMap();
            }

            @Override // com.p1.mobile.longlink.msg.connector.LongLinkMessage.I18nOrBuilder
            public int getLocalesCount() {
                return ((I18n) ((GeneratedMessageLite.b) this).instance).getLocalesMap().size();
            }

            @Override // com.p1.mobile.longlink.msg.connector.LongLinkMessage.I18nOrBuilder
            public Map<String, String> getLocalesMap() {
                return Collections.unmodifiableMap(((I18n) ((GeneratedMessageLite.b) this).instance).getLocalesMap());
            }

            @Override // com.p1.mobile.longlink.msg.connector.LongLinkMessage.I18nOrBuilder
            public String getLocalesOrDefault(String str, String str2) {
                str.getClass();
                Map<String, String> localesMap = ((I18n) ((GeneratedMessageLite.b) this).instance).getLocalesMap();
                return localesMap.containsKey(str) ? localesMap.get(str) : str2;
            }

            @Override // com.p1.mobile.longlink.msg.connector.LongLinkMessage.I18nOrBuilder
            public String getLocalesOrThrow(String str) {
                str.getClass();
                Map<String, String> localesMap = ((I18n) ((GeneratedMessageLite.b) this).instance).getLocalesMap();
                if (localesMap.containsKey(str)) {
                    return localesMap.get(str);
                }
                x9g0.a();
                return null;
            }

            @Override // com.p1.mobile.longlink.msg.connector.LongLinkMessage.I18nOrBuilder
            public String getParams(int i) {
                return ((I18n) ((GeneratedMessageLite.b) this).instance).getParams(i);
            }

            @Override // com.p1.mobile.longlink.msg.connector.LongLinkMessage.I18nOrBuilder
            public ByteString getParamsBytes(int i) {
                return ((I18n) ((GeneratedMessageLite.b) this).instance).getParamsBytes(i);
            }

            @Override // com.p1.mobile.longlink.msg.connector.LongLinkMessage.I18nOrBuilder
            public int getParamsCount() {
                return ((I18n) ((GeneratedMessageLite.b) this).instance).getParamsCount();
            }

            @Override // com.p1.mobile.longlink.msg.connector.LongLinkMessage.I18nOrBuilder
            public List<String> getParamsList() {
                return Collections.unmodifiableList(((I18n) ((GeneratedMessageLite.b) this).instance).getParamsList());
            }

            @Override // com.p1.mobile.longlink.msg.connector.LongLinkMessage.I18nOrBuilder
            public String getValue() {
                return ((I18n) ((GeneratedMessageLite.b) this).instance).getValue();
            }

            @Override // com.p1.mobile.longlink.msg.connector.LongLinkMessage.I18nOrBuilder
            public ByteString getValueBytes() {
                return ((I18n) ((GeneratedMessageLite.b) this).instance).getValueBytes();
            }

            public Builder putAllLocales(Map<String, String> map) {
                copyOnWrite();
                ((I18n) ((GeneratedMessageLite.b) this).instance).getMutableLocalesMap().putAll(map);
                return this;
            }

            public Builder putLocales(String str, String str2) {
                str.getClass();
                str2.getClass();
                copyOnWrite();
                ((I18n) ((GeneratedMessageLite.b) this).instance).getMutableLocalesMap().put(str, str2);
                return this;
            }

            public Builder removeLocales(String str) {
                str.getClass();
                copyOnWrite();
                ((I18n) ((GeneratedMessageLite.b) this).instance).getMutableLocalesMap().remove(str);
                return this;
            }

            public Builder setParams(int i, String str) {
                copyOnWrite();
                ((I18n) ((GeneratedMessageLite.b) this).instance).setParams(i, str);
                return this;
            }

            public Builder setValue(String str) {
                copyOnWrite();
                ((I18n) ((GeneratedMessageLite.b) this).instance).setValue(str);
                return this;
            }

            public Builder setValueBytes(ByteString byteString) {
                copyOnWrite();
                ((I18n) ((GeneratedMessageLite.b) this).instance).setValueBytes(byteString);
                return this;
            }

            public /* synthetic */ Builder(C03151 c03151) {
                this();
            }
        }

        public static I18n parseDelimitedFrom(InputStream inputStream, h hVar) throws IOException {
            return (I18n) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, hVar);
        }

        public static I18n parseFrom(ByteString byteString, h hVar) throws InvalidProtocolBufferException {
            return (I18n) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, hVar);
        }

        public static I18n parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (I18n) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static I18n parseFrom(byte[] bArr, h hVar) throws InvalidProtocolBufferException {
            return (I18n) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, hVar);
        }

        public static I18n parseFrom(InputStream inputStream) throws IOException {
            return (I18n) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static I18n parseFrom(InputStream inputStream, h hVar) throws IOException {
            return (I18n) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, hVar);
        }

        public static I18n parseFrom(e eVar) throws IOException {
            return (I18n) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, eVar);
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.toBuilder();
        }

        public static I18n parseFrom(e eVar, h hVar) throws IOException {
            return (I18n) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, eVar, hVar);
        }
    }

    public static final class IdType extends GeneratedMessageLite<IdType, Builder> implements IdTypeOrBuilder {
        private static final IdType DEFAULT_INSTANCE;
        public static final int ID_FIELD_NUMBER = 1;
        public static final int PARENT_FIELD_NUMBER = 3;
        private static volatile i860<IdType> PARSER = null;
        public static final int TYPE_FIELD_NUMBER = 2;
        private IdType parent_;
        private String id_ = "";
        private String type_ = "";

        static {
            IdType idType = new IdType();
            DEFAULT_INSTANCE = idType;
            idType.makeImmutable();
        }

        private IdType() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearId() {
            this.id_ = getDefaultInstance().getId();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearParent() {
            this.parent_ = null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearType() {
            this.type_ = getDefaultInstance().getType();
        }

        public static IdType getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeParent(IdType idType) {
            IdType idType2 = this.parent_;
            if (idType2 == null || idType2 == getDefaultInstance()) {
                this.parent_ = idType;
            } else {
                this.parent_ = (IdType) ((Builder) newBuilder(this.parent_).mergeFrom(idType)).buildPartial();
            }
        }

        public static Builder newBuilder(IdType idType) {
            return (Builder) ((Builder) DEFAULT_INSTANCE.toBuilder()).mergeFrom(idType);
        }

        public static IdType parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (IdType) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static IdType parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (IdType) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static i860<IdType> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setId(String str) {
            str.getClass();
            this.id_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setIdBytes(ByteString byteString) {
            byteString.getClass();
            a.checkByteStringIsUtf8(byteString);
            this.id_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setParent(Builder builder) {
            this.parent_ = (IdType) builder.build();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setType(String str) {
            str.getClass();
            this.type_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTypeBytes(ByteString byteString) {
            byteString.getClass();
            a.checkByteStringIsUtf8(byteString);
            this.type_ = byteString.toStringUtf8();
        }

        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            C03151 c03151 = null;
            switch (C03151.f1634xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new IdType();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                    return null;
                case 4:
                    return new Builder(c03151);
                case 5:
                    GeneratedMessageLite.h hVar = (GeneratedMessageLite.h) obj;
                    IdType idType = (IdType) obj2;
                    this.id_ = hVar.f(!this.id_.isEmpty(), this.id_, !idType.id_.isEmpty(), idType.id_);
                    this.type_ = hVar.f(!this.type_.isEmpty(), this.type_, true ^ idType.type_.isEmpty(), idType.type_);
                    this.parent_ = hVar.o(this.parent_, idType.parent_);
                    GeneratedMessageLite.g gVar = GeneratedMessageLite.g.INSTANCE;
                    return this;
                case 6:
                    e eVar = (e) obj;
                    h hVar2 = (h) obj2;
                    boolean z = false;
                    while (!z) {
                        try {
                            int iM = eVar.M();
                            if (iM != 0) {
                                if (iM == 10) {
                                    this.id_ = eVar.L();
                                } else if (iM == 18) {
                                    this.type_ = eVar.L();
                                } else if (iM == 26) {
                                    IdType idType2 = this.parent_;
                                    Builder builder = idType2 != null ? (Builder) idType2.toBuilder() : null;
                                    IdType idTypeW = eVar.w(parser(), hVar2);
                                    this.parent_ = idTypeW;
                                    if (builder != null) {
                                        builder.mergeFrom(idTypeW);
                                        this.parent_ = (IdType) builder.buildPartial();
                                    }
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
                        synchronized (IdType.class) {
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

        @Override // com.p1.mobile.longlink.msg.connector.LongLinkMessage.IdTypeOrBuilder
        public String getId() {
            return this.id_;
        }

        @Override // com.p1.mobile.longlink.msg.connector.LongLinkMessage.IdTypeOrBuilder
        public ByteString getIdBytes() {
            return ByteString.copyFromUtf8(this.id_);
        }

        @Override // com.p1.mobile.longlink.msg.connector.LongLinkMessage.IdTypeOrBuilder
        public IdType getParent() {
            IdType idType = this.parent_;
            return idType == null ? getDefaultInstance() : idType;
        }

        public int getSerializedSize() {
            int i = ((GeneratedMessageLite) this).memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int iK = !this.id_.isEmpty() ? CodedOutputStream.K(1, getId()) : 0;
            if (!this.type_.isEmpty()) {
                iK += CodedOutputStream.K(2, getType());
            }
            if (this.parent_ != null) {
                iK += CodedOutputStream.C(3, getParent());
            }
            ((GeneratedMessageLite) this).memoizedSerializedSize = iK;
            return iK;
        }

        @Override // com.p1.mobile.longlink.msg.connector.LongLinkMessage.IdTypeOrBuilder
        public String getType() {
            return this.type_;
        }

        @Override // com.p1.mobile.longlink.msg.connector.LongLinkMessage.IdTypeOrBuilder
        public ByteString getTypeBytes() {
            return ByteString.copyFromUtf8(this.type_);
        }

        @Override // com.p1.mobile.longlink.msg.connector.LongLinkMessage.IdTypeOrBuilder
        public boolean hasParent() {
            return this.parent_ != null;
        }

        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (!this.id_.isEmpty()) {
                codedOutputStream.D0(1, getId());
            }
            if (!this.type_.isEmpty()) {
                codedOutputStream.D0(2, getType());
            }
            if (this.parent_ != null) {
                codedOutputStream.w0(3, getParent());
            }
        }

        public static final class Builder extends GeneratedMessageLite.b<IdType, Builder> implements IdTypeOrBuilder {
            private Builder() {
                super(IdType.DEFAULT_INSTANCE);
            }

            public Builder clearId() {
                copyOnWrite();
                ((IdType) ((GeneratedMessageLite.b) this).instance).clearId();
                return this;
            }

            public Builder clearParent() {
                copyOnWrite();
                ((IdType) ((GeneratedMessageLite.b) this).instance).clearParent();
                return this;
            }

            public Builder clearType() {
                copyOnWrite();
                ((IdType) ((GeneratedMessageLite.b) this).instance).clearType();
                return this;
            }

            @Override // com.p1.mobile.longlink.msg.connector.LongLinkMessage.IdTypeOrBuilder
            public String getId() {
                return ((IdType) ((GeneratedMessageLite.b) this).instance).getId();
            }

            @Override // com.p1.mobile.longlink.msg.connector.LongLinkMessage.IdTypeOrBuilder
            public ByteString getIdBytes() {
                return ((IdType) ((GeneratedMessageLite.b) this).instance).getIdBytes();
            }

            @Override // com.p1.mobile.longlink.msg.connector.LongLinkMessage.IdTypeOrBuilder
            public IdType getParent() {
                return ((IdType) ((GeneratedMessageLite.b) this).instance).getParent();
            }

            @Override // com.p1.mobile.longlink.msg.connector.LongLinkMessage.IdTypeOrBuilder
            public String getType() {
                return ((IdType) ((GeneratedMessageLite.b) this).instance).getType();
            }

            @Override // com.p1.mobile.longlink.msg.connector.LongLinkMessage.IdTypeOrBuilder
            public ByteString getTypeBytes() {
                return ((IdType) ((GeneratedMessageLite.b) this).instance).getTypeBytes();
            }

            @Override // com.p1.mobile.longlink.msg.connector.LongLinkMessage.IdTypeOrBuilder
            public boolean hasParent() {
                return ((IdType) ((GeneratedMessageLite.b) this).instance).hasParent();
            }

            public Builder mergeParent(IdType idType) {
                copyOnWrite();
                ((IdType) ((GeneratedMessageLite.b) this).instance).mergeParent(idType);
                return this;
            }

            public Builder setId(String str) {
                copyOnWrite();
                ((IdType) ((GeneratedMessageLite.b) this).instance).setId(str);
                return this;
            }

            public Builder setIdBytes(ByteString byteString) {
                copyOnWrite();
                ((IdType) ((GeneratedMessageLite.b) this).instance).setIdBytes(byteString);
                return this;
            }

            public Builder setParent(IdType idType) {
                copyOnWrite();
                ((IdType) ((GeneratedMessageLite.b) this).instance).setParent(idType);
                return this;
            }

            public Builder setType(String str) {
                copyOnWrite();
                ((IdType) ((GeneratedMessageLite.b) this).instance).setType(str);
                return this;
            }

            public Builder setTypeBytes(ByteString byteString) {
                copyOnWrite();
                ((IdType) ((GeneratedMessageLite.b) this).instance).setTypeBytes(byteString);
                return this;
            }

            public /* synthetic */ Builder(C03151 c03151) {
                this();
            }

            public Builder setParent(Builder builder) {
                copyOnWrite();
                ((IdType) ((GeneratedMessageLite.b) this).instance).setParent(builder);
                return this;
            }
        }

        public static IdType parseDelimitedFrom(InputStream inputStream, h hVar) throws IOException {
            return (IdType) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, hVar);
        }

        public static IdType parseFrom(ByteString byteString, h hVar) throws InvalidProtocolBufferException {
            return (IdType) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, hVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setParent(IdType idType) {
            idType.getClass();
            this.parent_ = idType;
        }

        public static IdType parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (IdType) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static IdType parseFrom(byte[] bArr, h hVar) throws InvalidProtocolBufferException {
            return (IdType) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, hVar);
        }

        public static IdType parseFrom(InputStream inputStream) throws IOException {
            return (IdType) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static IdType parseFrom(InputStream inputStream, h hVar) throws IOException {
            return (IdType) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, hVar);
        }

        public static IdType parseFrom(e eVar) throws IOException {
            return (IdType) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, eVar);
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.toBuilder();
        }

        public static IdType parseFrom(e eVar, h hVar) throws IOException {
            return (IdType) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, eVar, hVar);
        }
    }

    public static final class Msg extends GeneratedMessageLite<Msg, Builder> implements MsgOrBuilder {
        public static final int DATA_FIELD_NUMBER = 3;
        private static final Msg DEFAULT_INSTANCE;
        public static final int ISACK_FIELD_NUMBER = 8;
        public static final int ISRELIABLE_FIELD_NUMBER = 9;
        public static final int MSGID_FIELD_NUMBER = 2;
        public static final int MSGTYPENAME_FIELD_NUMBER = 5;
        private static volatile i860<Msg> PARSER = null;
        public static final int PUSH_FIELD_NUMBER = 4;
        public static final int TYPE_FIELD_NUMBER = 1;
        public static final int VERSION_FIELD_NUMBER = 7;
        private Any data_;
        private boolean isAck_;
        private boolean isReliable_;
        private PushContent push_;
        private int type_;
        private String msgId_ = "";
        private String msgTypeName_ = "";
        private String version_ = "";

        static {
            Msg msg = new Msg();
            DEFAULT_INSTANCE = msg;
            msg.makeImmutable();
        }

        private Msg() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearData() {
            this.data_ = null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearIsAck() {
            this.isAck_ = false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearIsReliable() {
            this.isReliable_ = false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearMsgId() {
            this.msgId_ = getDefaultInstance().getMsgId();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearMsgTypeName() {
            this.msgTypeName_ = getDefaultInstance().getMsgTypeName();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearPush() {
            this.push_ = null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearType() {
            this.type_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearVersion() {
            this.version_ = getDefaultInstance().getVersion();
        }

        public static Msg getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeData(Any any) {
            Any any2 = this.data_;
            if (any2 == null || any2 == Any.getDefaultInstance()) {
                this.data_ = any;
            } else {
                this.data_ = Any.newBuilder(this.data_).mergeFrom(any).buildPartial();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergePush(PushContent pushContent) {
            PushContent pushContent2 = this.push_;
            if (pushContent2 == null || pushContent2 == PushContent.getDefaultInstance()) {
                this.push_ = pushContent;
            } else {
                this.push_ = (PushContent) ((PushContent.Builder) PushContent.newBuilder(this.push_).mergeFrom(pushContent)).buildPartial();
            }
        }

        public static Builder newBuilder(Msg msg) {
            return (Builder) ((Builder) DEFAULT_INSTANCE.toBuilder()).mergeFrom(msg);
        }

        public static Msg parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (Msg) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Msg parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (Msg) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static i860<Msg> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setData(Any.b bVar) {
            this.data_ = bVar.build();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setIsAck(boolean z) {
            this.isAck_ = z;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setIsReliable(boolean z) {
            this.isReliable_ = z;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setMsgId(String str) {
            str.getClass();
            this.msgId_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setMsgIdBytes(ByteString byteString) {
            byteString.getClass();
            a.checkByteStringIsUtf8(byteString);
            this.msgId_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setMsgTypeName(String str) {
            str.getClass();
            this.msgTypeName_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setMsgTypeNameBytes(ByteString byteString) {
            byteString.getClass();
            a.checkByteStringIsUtf8(byteString);
            this.msgTypeName_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setPush(PushContent.Builder builder) {
            this.push_ = (PushContent) builder.build();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setType(MsgTypeEnum msgTypeEnum) {
            msgTypeEnum.getClass();
            this.type_ = msgTypeEnum.getNumber();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTypeValue(int i) {
            this.type_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setVersion(String str) {
            str.getClass();
            this.version_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setVersionBytes(ByteString byteString) {
            byteString.getClass();
            a.checkByteStringIsUtf8(byteString);
            this.version_ = byteString.toStringUtf8();
        }

        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            boolean z = false;
            C03151 c03151 = null;
            switch (C03151.f1634xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new Msg();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                    return null;
                case 4:
                    return new Builder(c03151);
                case 5:
                    GeneratedMessageLite.h hVar = (GeneratedMessageLite.h) obj;
                    Msg msg = (Msg) obj2;
                    int i = this.type_;
                    boolean z2 = i != 0;
                    int i2 = msg.type_;
                    this.type_ = hVar.e(z2, i, i2 != 0, i2);
                    this.msgId_ = hVar.f(!this.msgId_.isEmpty(), this.msgId_, !msg.msgId_.isEmpty(), msg.msgId_);
                    this.data_ = hVar.o(this.data_, msg.data_);
                    this.push_ = hVar.o(this.push_, msg.push_);
                    this.msgTypeName_ = hVar.f(!this.msgTypeName_.isEmpty(), this.msgTypeName_, !msg.msgTypeName_.isEmpty(), msg.msgTypeName_);
                    this.version_ = hVar.f(!this.version_.isEmpty(), this.version_, !msg.version_.isEmpty(), msg.version_);
                    boolean z3 = this.isAck_;
                    boolean z4 = msg.isAck_;
                    this.isAck_ = hVar.d(z3, z3, z4, z4);
                    boolean z5 = this.isReliable_;
                    boolean z6 = msg.isReliable_;
                    this.isReliable_ = hVar.d(z5, z5, z6, z6);
                    GeneratedMessageLite.g gVar = GeneratedMessageLite.g.INSTANCE;
                    return this;
                case 6:
                    e eVar = (e) obj;
                    h hVar2 = (h) obj2;
                    while (!z) {
                        try {
                            int iM = eVar.M();
                            if (iM != 0) {
                                if (iM == 8) {
                                    this.type_ = eVar.p();
                                } else if (iM == 18) {
                                    this.msgId_ = eVar.L();
                                } else if (iM == 26) {
                                    Any any = this.data_;
                                    Any.b builder = any != null ? any.toBuilder() : null;
                                    Any anyW = eVar.w(Any.parser(), hVar2);
                                    this.data_ = anyW;
                                    if (builder != null) {
                                        builder.mergeFrom(anyW);
                                        this.data_ = builder.buildPartial();
                                    }
                                } else if (iM == 34) {
                                    PushContent pushContent = this.push_;
                                    PushContent.Builder builder2 = pushContent != null ? (PushContent.Builder) pushContent.toBuilder() : null;
                                    PushContent pushContentW = eVar.w(PushContent.parser(), hVar2);
                                    this.push_ = pushContentW;
                                    if (builder2 != null) {
                                        builder2.mergeFrom(pushContentW);
                                        this.push_ = (PushContent) builder2.buildPartial();
                                    }
                                } else if (iM == 42) {
                                    this.msgTypeName_ = eVar.L();
                                } else if (iM == 58) {
                                    this.version_ = eVar.L();
                                } else if (iM == 64) {
                                    this.isAck_ = eVar.m();
                                } else if (iM == 72) {
                                    this.isReliable_ = eVar.m();
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
                        synchronized (Msg.class) {
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

        @Override // com.p1.mobile.longlink.msg.connector.LongLinkMessage.MsgOrBuilder
        public Any getData() {
            Any any = this.data_;
            return any == null ? Any.getDefaultInstance() : any;
        }

        @Override // com.p1.mobile.longlink.msg.connector.LongLinkMessage.MsgOrBuilder
        public boolean getIsAck() {
            return this.isAck_;
        }

        @Override // com.p1.mobile.longlink.msg.connector.LongLinkMessage.MsgOrBuilder
        public boolean getIsReliable() {
            return this.isReliable_;
        }

        @Override // com.p1.mobile.longlink.msg.connector.LongLinkMessage.MsgOrBuilder
        public String getMsgId() {
            return this.msgId_;
        }

        @Override // com.p1.mobile.longlink.msg.connector.LongLinkMessage.MsgOrBuilder
        public ByteString getMsgIdBytes() {
            return ByteString.copyFromUtf8(this.msgId_);
        }

        @Override // com.p1.mobile.longlink.msg.connector.LongLinkMessage.MsgOrBuilder
        public String getMsgTypeName() {
            return this.msgTypeName_;
        }

        @Override // com.p1.mobile.longlink.msg.connector.LongLinkMessage.MsgOrBuilder
        public ByteString getMsgTypeNameBytes() {
            return ByteString.copyFromUtf8(this.msgTypeName_);
        }

        @Override // com.p1.mobile.longlink.msg.connector.LongLinkMessage.MsgOrBuilder
        public PushContent getPush() {
            PushContent pushContent = this.push_;
            return pushContent == null ? PushContent.getDefaultInstance() : pushContent;
        }

        public int getSerializedSize() {
            int i = ((GeneratedMessageLite) this).memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int iM = this.type_ != MsgTypeEnum.MSG_TYPE_CHAT_MSG.getNumber() ? CodedOutputStream.m(1, this.type_) : 0;
            if (!this.msgId_.isEmpty()) {
                iM += CodedOutputStream.K(2, getMsgId());
            }
            if (this.data_ != null) {
                iM += CodedOutputStream.C(3, getData());
            }
            if (this.push_ != null) {
                iM += CodedOutputStream.C(4, getPush());
            }
            if (!this.msgTypeName_.isEmpty()) {
                iM += CodedOutputStream.K(5, getMsgTypeName());
            }
            if (!this.version_.isEmpty()) {
                iM += CodedOutputStream.K(7, getVersion());
            }
            boolean z = this.isAck_;
            if (z) {
                iM += CodedOutputStream.f(8, z);
            }
            boolean z2 = this.isReliable_;
            if (z2) {
                iM += CodedOutputStream.f(9, z2);
            }
            ((GeneratedMessageLite) this).memoizedSerializedSize = iM;
            return iM;
        }

        @Override // com.p1.mobile.longlink.msg.connector.LongLinkMessage.MsgOrBuilder
        public MsgTypeEnum getType() {
            MsgTypeEnum msgTypeEnumForNumber = MsgTypeEnum.forNumber(this.type_);
            return msgTypeEnumForNumber == null ? MsgTypeEnum.UNRECOGNIZED : msgTypeEnumForNumber;
        }

        @Override // com.p1.mobile.longlink.msg.connector.LongLinkMessage.MsgOrBuilder
        public int getTypeValue() {
            return this.type_;
        }

        @Override // com.p1.mobile.longlink.msg.connector.LongLinkMessage.MsgOrBuilder
        public String getVersion() {
            return this.version_;
        }

        @Override // com.p1.mobile.longlink.msg.connector.LongLinkMessage.MsgOrBuilder
        public ByteString getVersionBytes() {
            return ByteString.copyFromUtf8(this.version_);
        }

        @Override // com.p1.mobile.longlink.msg.connector.LongLinkMessage.MsgOrBuilder
        public boolean hasData() {
            return this.data_ != null;
        }

        @Override // com.p1.mobile.longlink.msg.connector.LongLinkMessage.MsgOrBuilder
        public boolean hasPush() {
            return this.push_ != null;
        }

        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (this.type_ != MsgTypeEnum.MSG_TYPE_CHAT_MSG.getNumber()) {
                codedOutputStream.i0(1, this.type_);
            }
            if (!this.msgId_.isEmpty()) {
                codedOutputStream.D0(2, getMsgId());
            }
            if (this.data_ != null) {
                codedOutputStream.w0(3, getData());
            }
            if (this.push_ != null) {
                codedOutputStream.w0(4, getPush());
            }
            if (!this.msgTypeName_.isEmpty()) {
                codedOutputStream.D0(5, getMsgTypeName());
            }
            if (!this.version_.isEmpty()) {
                codedOutputStream.D0(7, getVersion());
            }
            boolean z = this.isAck_;
            if (z) {
                codedOutputStream.a0(8, z);
            }
            boolean z2 = this.isReliable_;
            if (z2) {
                codedOutputStream.a0(9, z2);
            }
        }

        public static final class Builder extends GeneratedMessageLite.b<Msg, Builder> implements MsgOrBuilder {
            private Builder() {
                super(Msg.DEFAULT_INSTANCE);
            }

            public Builder clearData() {
                copyOnWrite();
                ((Msg) ((GeneratedMessageLite.b) this).instance).clearData();
                return this;
            }

            public Builder clearIsAck() {
                copyOnWrite();
                ((Msg) ((GeneratedMessageLite.b) this).instance).clearIsAck();
                return this;
            }

            public Builder clearIsReliable() {
                copyOnWrite();
                ((Msg) ((GeneratedMessageLite.b) this).instance).clearIsReliable();
                return this;
            }

            public Builder clearMsgId() {
                copyOnWrite();
                ((Msg) ((GeneratedMessageLite.b) this).instance).clearMsgId();
                return this;
            }

            public Builder clearMsgTypeName() {
                copyOnWrite();
                ((Msg) ((GeneratedMessageLite.b) this).instance).clearMsgTypeName();
                return this;
            }

            public Builder clearPush() {
                copyOnWrite();
                ((Msg) ((GeneratedMessageLite.b) this).instance).clearPush();
                return this;
            }

            public Builder clearType() {
                copyOnWrite();
                ((Msg) ((GeneratedMessageLite.b) this).instance).clearType();
                return this;
            }

            public Builder clearVersion() {
                copyOnWrite();
                ((Msg) ((GeneratedMessageLite.b) this).instance).clearVersion();
                return this;
            }

            @Override // com.p1.mobile.longlink.msg.connector.LongLinkMessage.MsgOrBuilder
            public Any getData() {
                return ((Msg) ((GeneratedMessageLite.b) this).instance).getData();
            }

            @Override // com.p1.mobile.longlink.msg.connector.LongLinkMessage.MsgOrBuilder
            public boolean getIsAck() {
                return ((Msg) ((GeneratedMessageLite.b) this).instance).getIsAck();
            }

            @Override // com.p1.mobile.longlink.msg.connector.LongLinkMessage.MsgOrBuilder
            public boolean getIsReliable() {
                return ((Msg) ((GeneratedMessageLite.b) this).instance).getIsReliable();
            }

            @Override // com.p1.mobile.longlink.msg.connector.LongLinkMessage.MsgOrBuilder
            public String getMsgId() {
                return ((Msg) ((GeneratedMessageLite.b) this).instance).getMsgId();
            }

            @Override // com.p1.mobile.longlink.msg.connector.LongLinkMessage.MsgOrBuilder
            public ByteString getMsgIdBytes() {
                return ((Msg) ((GeneratedMessageLite.b) this).instance).getMsgIdBytes();
            }

            @Override // com.p1.mobile.longlink.msg.connector.LongLinkMessage.MsgOrBuilder
            public String getMsgTypeName() {
                return ((Msg) ((GeneratedMessageLite.b) this).instance).getMsgTypeName();
            }

            @Override // com.p1.mobile.longlink.msg.connector.LongLinkMessage.MsgOrBuilder
            public ByteString getMsgTypeNameBytes() {
                return ((Msg) ((GeneratedMessageLite.b) this).instance).getMsgTypeNameBytes();
            }

            @Override // com.p1.mobile.longlink.msg.connector.LongLinkMessage.MsgOrBuilder
            public PushContent getPush() {
                return ((Msg) ((GeneratedMessageLite.b) this).instance).getPush();
            }

            @Override // com.p1.mobile.longlink.msg.connector.LongLinkMessage.MsgOrBuilder
            public MsgTypeEnum getType() {
                return ((Msg) ((GeneratedMessageLite.b) this).instance).getType();
            }

            @Override // com.p1.mobile.longlink.msg.connector.LongLinkMessage.MsgOrBuilder
            public int getTypeValue() {
                return ((Msg) ((GeneratedMessageLite.b) this).instance).getTypeValue();
            }

            @Override // com.p1.mobile.longlink.msg.connector.LongLinkMessage.MsgOrBuilder
            public String getVersion() {
                return ((Msg) ((GeneratedMessageLite.b) this).instance).getVersion();
            }

            @Override // com.p1.mobile.longlink.msg.connector.LongLinkMessage.MsgOrBuilder
            public ByteString getVersionBytes() {
                return ((Msg) ((GeneratedMessageLite.b) this).instance).getVersionBytes();
            }

            @Override // com.p1.mobile.longlink.msg.connector.LongLinkMessage.MsgOrBuilder
            public boolean hasData() {
                return ((Msg) ((GeneratedMessageLite.b) this).instance).hasData();
            }

            @Override // com.p1.mobile.longlink.msg.connector.LongLinkMessage.MsgOrBuilder
            public boolean hasPush() {
                return ((Msg) ((GeneratedMessageLite.b) this).instance).hasPush();
            }

            public Builder mergeData(Any any) {
                copyOnWrite();
                ((Msg) ((GeneratedMessageLite.b) this).instance).mergeData(any);
                return this;
            }

            public Builder mergePush(PushContent pushContent) {
                copyOnWrite();
                ((Msg) ((GeneratedMessageLite.b) this).instance).mergePush(pushContent);
                return this;
            }

            public Builder setData(Any any) {
                copyOnWrite();
                ((Msg) ((GeneratedMessageLite.b) this).instance).setData(any);
                return this;
            }

            public Builder setIsAck(boolean z) {
                copyOnWrite();
                ((Msg) ((GeneratedMessageLite.b) this).instance).setIsAck(z);
                return this;
            }

            public Builder setIsReliable(boolean z) {
                copyOnWrite();
                ((Msg) ((GeneratedMessageLite.b) this).instance).setIsReliable(z);
                return this;
            }

            public Builder setMsgId(String str) {
                copyOnWrite();
                ((Msg) ((GeneratedMessageLite.b) this).instance).setMsgId(str);
                return this;
            }

            public Builder setMsgIdBytes(ByteString byteString) {
                copyOnWrite();
                ((Msg) ((GeneratedMessageLite.b) this).instance).setMsgIdBytes(byteString);
                return this;
            }

            public Builder setMsgTypeName(String str) {
                copyOnWrite();
                ((Msg) ((GeneratedMessageLite.b) this).instance).setMsgTypeName(str);
                return this;
            }

            public Builder setMsgTypeNameBytes(ByteString byteString) {
                copyOnWrite();
                ((Msg) ((GeneratedMessageLite.b) this).instance).setMsgTypeNameBytes(byteString);
                return this;
            }

            public Builder setPush(PushContent pushContent) {
                copyOnWrite();
                ((Msg) ((GeneratedMessageLite.b) this).instance).setPush(pushContent);
                return this;
            }

            public Builder setType(MsgTypeEnum msgTypeEnum) {
                copyOnWrite();
                ((Msg) ((GeneratedMessageLite.b) this).instance).setType(msgTypeEnum);
                return this;
            }

            public Builder setTypeValue(int i) {
                copyOnWrite();
                ((Msg) ((GeneratedMessageLite.b) this).instance).setTypeValue(i);
                return this;
            }

            public Builder setVersion(String str) {
                copyOnWrite();
                ((Msg) ((GeneratedMessageLite.b) this).instance).setVersion(str);
                return this;
            }

            public Builder setVersionBytes(ByteString byteString) {
                copyOnWrite();
                ((Msg) ((GeneratedMessageLite.b) this).instance).setVersionBytes(byteString);
                return this;
            }

            public /* synthetic */ Builder(C03151 c03151) {
                this();
            }

            public Builder setData(Any.b bVar) {
                copyOnWrite();
                ((Msg) ((GeneratedMessageLite.b) this).instance).setData(bVar);
                return this;
            }

            public Builder setPush(PushContent.Builder builder) {
                copyOnWrite();
                ((Msg) ((GeneratedMessageLite.b) this).instance).setPush(builder);
                return this;
            }
        }

        public static Msg parseDelimitedFrom(InputStream inputStream, h hVar) throws IOException {
            return (Msg) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, hVar);
        }

        public static Msg parseFrom(ByteString byteString, h hVar) throws InvalidProtocolBufferException {
            return (Msg) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, hVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setData(Any any) {
            any.getClass();
            this.data_ = any;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setPush(PushContent pushContent) {
            pushContent.getClass();
            this.push_ = pushContent;
        }

        public static Msg parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (Msg) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static Msg parseFrom(byte[] bArr, h hVar) throws InvalidProtocolBufferException {
            return (Msg) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, hVar);
        }

        public static Msg parseFrom(InputStream inputStream) throws IOException {
            return (Msg) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Msg parseFrom(InputStream inputStream, h hVar) throws IOException {
            return (Msg) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, hVar);
        }

        public static Msg parseFrom(e eVar) throws IOException {
            return (Msg) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, eVar);
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.toBuilder();
        }

        public static Msg parseFrom(e eVar, h hVar) throws IOException {
            return (Msg) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, eVar, hVar);
        }
    }

    public static final class Msgs extends GeneratedMessageLite<Msgs, Builder> implements MsgsOrBuilder {
        private static final Msgs DEFAULT_INSTANCE;
        public static final int MSGS_FIELD_NUMBER = 1;
        private static volatile i860<Msgs> PARSER;
        private l.h<Msg> msgs_ = GeneratedMessageLite.emptyProtobufList();

        static {
            Msgs msgs = new Msgs();
            DEFAULT_INSTANCE = msgs;
            msgs.makeImmutable();
        }

        private Msgs() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllMsgs(Iterable<? extends Msg> iterable) {
            ensureMsgsIsMutable();
            a.addAll(iterable, this.msgs_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addMsgs(Msg.Builder builder) {
            ensureMsgsIsMutable();
            this.msgs_.add((Msg) builder.build());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearMsgs() {
            this.msgs_ = GeneratedMessageLite.emptyProtobufList();
        }

        private void ensureMsgsIsMutable() {
            if (this.msgs_.q()) {
                return;
            }
            this.msgs_ = GeneratedMessageLite.mutableCopy(this.msgs_);
        }

        public static Msgs getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder(Msgs msgs) {
            return (Builder) ((Builder) DEFAULT_INSTANCE.toBuilder()).mergeFrom(msgs);
        }

        public static Msgs parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (Msgs) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Msgs parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (Msgs) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static i860<Msgs> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void removeMsgs(int i) {
            ensureMsgsIsMutable();
            this.msgs_.remove(i);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setMsgs(int i, Msg.Builder builder) {
            ensureMsgsIsMutable();
            this.msgs_.set(i, (Msg) builder.build());
        }

        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            C03151 c03151 = null;
            switch (C03151.f1634xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new Msgs();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                    this.msgs_.n();
                    return null;
                case 4:
                    return new Builder(c03151);
                case 5:
                    this.msgs_ = ((GeneratedMessageLite.h) obj).g(this.msgs_, ((Msgs) obj2).msgs_);
                    GeneratedMessageLite.g gVar = GeneratedMessageLite.g.INSTANCE;
                    return this;
                case 6:
                    e eVar = (e) obj;
                    h hVar = (h) obj2;
                    boolean z = false;
                    while (!z) {
                        try {
                            int iM = eVar.M();
                            if (iM != 0) {
                                if (iM == 10) {
                                    if (!this.msgs_.q()) {
                                        this.msgs_ = GeneratedMessageLite.mutableCopy(this.msgs_);
                                    }
                                    this.msgs_.add(eVar.w(Msg.parser(), hVar));
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
                        synchronized (Msgs.class) {
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

        @Override // com.p1.mobile.longlink.msg.connector.LongLinkMessage.MsgsOrBuilder
        public Msg getMsgs(int i) {
            return (Msg) this.msgs_.get(i);
        }

        @Override // com.p1.mobile.longlink.msg.connector.LongLinkMessage.MsgsOrBuilder
        public int getMsgsCount() {
            return this.msgs_.size();
        }

        @Override // com.p1.mobile.longlink.msg.connector.LongLinkMessage.MsgsOrBuilder
        public List<Msg> getMsgsList() {
            return this.msgs_;
        }

        public MsgOrBuilder getMsgsOrBuilder(int i) {
            return (MsgOrBuilder) this.msgs_.get(i);
        }

        public List<? extends MsgOrBuilder> getMsgsOrBuilderList() {
            return this.msgs_;
        }

        public int getSerializedSize() {
            int i = ((GeneratedMessageLite) this).memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int iC = 0;
            for (int i2 = 0; i2 < this.msgs_.size(); i2++) {
                iC += CodedOutputStream.C(1, (q) this.msgs_.get(i2));
            }
            ((GeneratedMessageLite) this).memoizedSerializedSize = iC;
            return iC;
        }

        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            for (int i = 0; i < this.msgs_.size(); i++) {
                codedOutputStream.w0(1, (q) this.msgs_.get(i));
            }
        }

        public static final class Builder extends GeneratedMessageLite.b<Msgs, Builder> implements MsgsOrBuilder {
            private Builder() {
                super(Msgs.DEFAULT_INSTANCE);
            }

            public Builder addAllMsgs(Iterable<? extends Msg> iterable) {
                copyOnWrite();
                ((Msgs) ((GeneratedMessageLite.b) this).instance).addAllMsgs(iterable);
                return this;
            }

            public Builder addMsgs(Msg msg) {
                copyOnWrite();
                ((Msgs) ((GeneratedMessageLite.b) this).instance).addMsgs(msg);
                return this;
            }

            public Builder clearMsgs() {
                copyOnWrite();
                ((Msgs) ((GeneratedMessageLite.b) this).instance).clearMsgs();
                return this;
            }

            @Override // com.p1.mobile.longlink.msg.connector.LongLinkMessage.MsgsOrBuilder
            public Msg getMsgs(int i) {
                return ((Msgs) ((GeneratedMessageLite.b) this).instance).getMsgs(i);
            }

            @Override // com.p1.mobile.longlink.msg.connector.LongLinkMessage.MsgsOrBuilder
            public int getMsgsCount() {
                return ((Msgs) ((GeneratedMessageLite.b) this).instance).getMsgsCount();
            }

            @Override // com.p1.mobile.longlink.msg.connector.LongLinkMessage.MsgsOrBuilder
            public List<Msg> getMsgsList() {
                return Collections.unmodifiableList(((Msgs) ((GeneratedMessageLite.b) this).instance).getMsgsList());
            }

            public Builder removeMsgs(int i) {
                copyOnWrite();
                ((Msgs) ((GeneratedMessageLite.b) this).instance).removeMsgs(i);
                return this;
            }

            public Builder setMsgs(int i, Msg msg) {
                copyOnWrite();
                ((Msgs) ((GeneratedMessageLite.b) this).instance).setMsgs(i, msg);
                return this;
            }

            public /* synthetic */ Builder(C03151 c03151) {
                this();
            }

            public Builder addMsgs(int i, Msg msg) {
                copyOnWrite();
                ((Msgs) ((GeneratedMessageLite.b) this).instance).addMsgs(i, msg);
                return this;
            }

            public Builder setMsgs(int i, Msg.Builder builder) {
                copyOnWrite();
                ((Msgs) ((GeneratedMessageLite.b) this).instance).setMsgs(i, builder);
                return this;
            }

            public Builder addMsgs(Msg.Builder builder) {
                copyOnWrite();
                ((Msgs) ((GeneratedMessageLite.b) this).instance).addMsgs(builder);
                return this;
            }

            public Builder addMsgs(int i, Msg.Builder builder) {
                copyOnWrite();
                ((Msgs) ((GeneratedMessageLite.b) this).instance).addMsgs(i, builder);
                return this;
            }
        }

        public static Msgs parseDelimitedFrom(InputStream inputStream, h hVar) throws IOException {
            return (Msgs) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, hVar);
        }

        public static Msgs parseFrom(ByteString byteString, h hVar) throws InvalidProtocolBufferException {
            return (Msgs) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, hVar);
        }

        public static Msgs parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (Msgs) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static Msgs parseFrom(byte[] bArr, h hVar) throws InvalidProtocolBufferException {
            return (Msgs) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, hVar);
        }

        public static Msgs parseFrom(InputStream inputStream) throws IOException {
            return (Msgs) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Msgs parseFrom(InputStream inputStream, h hVar) throws IOException {
            return (Msgs) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, hVar);
        }

        public static Msgs parseFrom(e eVar) throws IOException {
            return (Msgs) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addMsgs(int i, Msg msg) {
            msg.getClass();
            ensureMsgsIsMutable();
            this.msgs_.add(i, msg);
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.toBuilder();
        }

        public static Msgs parseFrom(e eVar, h hVar) throws IOException {
            return (Msgs) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, eVar, hVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setMsgs(int i, Msg msg) {
            msg.getClass();
            ensureMsgsIsMutable();
            this.msgs_.set(i, msg);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addMsgs(Msg msg) {
            msg.getClass();
            ensureMsgsIsMutable();
            this.msgs_.add(msg);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addMsgs(int i, Msg.Builder builder) {
            ensureMsgsIsMutable();
            this.msgs_.add(i, (Msg) builder.build());
        }
    }

    public static final class PushContent extends GeneratedMessageLite<PushContent, Builder> implements PushContentOrBuilder {
        public static final int CONTENT_FIELD_NUMBER = 1;
        public static final int COUNTER_FIELD_NUMBER = 16;
        public static final int CREATETIME_FIELD_NUMBER = 12;
        private static final PushContent DEFAULT_INSTANCE;
        public static final int IMAGEURLWITHOUTFORMAT_FIELD_NUMBER = 13;
        public static final int INTENT_FIELD_NUMBER = 11;
        public static final int LINK_FIELD_NUMBER = 15;
        public static final int MESSAGECUSTOM_FIELD_NUMBER = 17;
        public static final int MESSAGE_FIELD_NUMBER = 10;
        private static volatile i860<PushContent> PARSER = null;
        public static final int PRIMARYPICTURE_FIELD_NUMBER = 5;
        public static final int PRIORITY_FIELD_NUMBER = 6;
        public static final int REQID_FIELD_NUMBER = 14;
        public static final int SILENTAGGREGATION_FIELD_NUMBER = 8;
        public static final int SILENT_FIELD_NUMBER = 9;
        public static final int STACKID_FIELD_NUMBER = 7;
        public static final int TICKER_FIELD_NUMBER = 4;
        public static final int TITLE_FIELD_NUMBER = 2;
        public static final int VALUE_FIELD_NUMBER = 3;
        private int bitField0_;
        private IdType content_;
        private int counter_;
        private long createTime_;
        private int priority_;
        private boolean silentAggregation_;
        private boolean silent_;
        private int stackId_;
        private I18n ticker_;
        private I18n title_;
        private I18n value_;
        private MapFieldLite<String, String> messageCustom_ = MapFieldLite.emptyMapField();
        private String primaryPicture_ = "";
        private String message_ = "";
        private String intent_ = "";
        private String imageURLWithoutFormat_ = "";
        private String reqId_ = "";
        private String link_ = "";

        public static final class MessageCustomDefaultEntryHolder {
            static final p<String, String> defaultEntry;

            static {
                WireFormat.FieldType fieldType = WireFormat.FieldType.STRING;
                defaultEntry = p.c(fieldType, "", fieldType, "");
            }

            private MessageCustomDefaultEntryHolder() {
            }
        }

        static {
            PushContent pushContent = new PushContent();
            DEFAULT_INSTANCE = pushContent;
            pushContent.makeImmutable();
        }

        private PushContent() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearContent() {
            this.content_ = null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearCounter() {
            this.counter_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearCreateTime() {
            this.createTime_ = 0L;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearImageURLWithoutFormat() {
            this.imageURLWithoutFormat_ = getDefaultInstance().getImageURLWithoutFormat();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearIntent() {
            this.intent_ = getDefaultInstance().getIntent();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearLink() {
            this.link_ = getDefaultInstance().getLink();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearMessage() {
            this.message_ = getDefaultInstance().getMessage();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearPrimaryPicture() {
            this.primaryPicture_ = getDefaultInstance().getPrimaryPicture();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearPriority() {
            this.priority_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearReqId() {
            this.reqId_ = getDefaultInstance().getReqId();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearSilent() {
            this.silent_ = false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearSilentAggregation() {
            this.silentAggregation_ = false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearStackId() {
            this.stackId_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearTicker() {
            this.ticker_ = null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearTitle() {
            this.title_ = null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearValue() {
            this.value_ = null;
        }

        public static PushContent getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public Map<String, String> getMutableMessageCustomMap() {
            return internalGetMutableMessageCustom();
        }

        private MapFieldLite<String, String> internalGetMessageCustom() {
            return this.messageCustom_;
        }

        private MapFieldLite<String, String> internalGetMutableMessageCustom() {
            if (!this.messageCustom_.isMutable()) {
                this.messageCustom_ = this.messageCustom_.mutableCopy();
            }
            return this.messageCustom_;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeContent(IdType idType) {
            IdType idType2 = this.content_;
            if (idType2 == null || idType2 == IdType.getDefaultInstance()) {
                this.content_ = idType;
            } else {
                this.content_ = (IdType) ((IdType.Builder) IdType.newBuilder(this.content_).mergeFrom(idType)).buildPartial();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeTicker(I18n i18n) {
            I18n i18n2 = this.ticker_;
            if (i18n2 == null || i18n2 == I18n.getDefaultInstance()) {
                this.ticker_ = i18n;
            } else {
                this.ticker_ = (I18n) ((I18n.Builder) I18n.newBuilder(this.ticker_).mergeFrom(i18n)).buildPartial();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeTitle(I18n i18n) {
            I18n i18n2 = this.title_;
            if (i18n2 == null || i18n2 == I18n.getDefaultInstance()) {
                this.title_ = i18n;
            } else {
                this.title_ = (I18n) ((I18n.Builder) I18n.newBuilder(this.title_).mergeFrom(i18n)).buildPartial();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeValue(I18n i18n) {
            I18n i18n2 = this.value_;
            if (i18n2 == null || i18n2 == I18n.getDefaultInstance()) {
                this.value_ = i18n;
            } else {
                this.value_ = (I18n) ((I18n.Builder) I18n.newBuilder(this.value_).mergeFrom(i18n)).buildPartial();
            }
        }

        public static Builder newBuilder(PushContent pushContent) {
            return (Builder) ((Builder) DEFAULT_INSTANCE.toBuilder()).mergeFrom(pushContent);
        }

        public static PushContent parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (PushContent) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static PushContent parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (PushContent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static i860<PushContent> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setContent(IdType.Builder builder) {
            this.content_ = (IdType) builder.build();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setCounter(int i) {
            this.counter_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setCreateTime(long j) {
            this.createTime_ = j;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setImageURLWithoutFormat(String str) {
            str.getClass();
            this.imageURLWithoutFormat_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setImageURLWithoutFormatBytes(ByteString byteString) {
            byteString.getClass();
            a.checkByteStringIsUtf8(byteString);
            this.imageURLWithoutFormat_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setIntent(String str) {
            str.getClass();
            this.intent_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setIntentBytes(ByteString byteString) {
            byteString.getClass();
            a.checkByteStringIsUtf8(byteString);
            this.intent_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setLink(String str) {
            str.getClass();
            this.link_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setLinkBytes(ByteString byteString) {
            byteString.getClass();
            a.checkByteStringIsUtf8(byteString);
            this.link_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setMessage(String str) {
            str.getClass();
            this.message_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setMessageBytes(ByteString byteString) {
            byteString.getClass();
            a.checkByteStringIsUtf8(byteString);
            this.message_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setPrimaryPicture(String str) {
            str.getClass();
            this.primaryPicture_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setPrimaryPictureBytes(ByteString byteString) {
            byteString.getClass();
            a.checkByteStringIsUtf8(byteString);
            this.primaryPicture_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setPriority(int i) {
            this.priority_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setReqId(String str) {
            str.getClass();
            this.reqId_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setReqIdBytes(ByteString byteString) {
            byteString.getClass();
            a.checkByteStringIsUtf8(byteString);
            this.reqId_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSilent(boolean z) {
            this.silent_ = z;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSilentAggregation(boolean z) {
            this.silentAggregation_ = z;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setStackId(int i) {
            this.stackId_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTicker(I18n.Builder builder) {
            this.ticker_ = (I18n) builder.build();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTitle(I18n.Builder builder) {
            this.title_ = (I18n) builder.build();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setValue(I18n.Builder builder) {
            this.value_ = (I18n) builder.build();
        }

        @Override // com.p1.mobile.longlink.msg.connector.LongLinkMessage.PushContentOrBuilder
        public boolean containsMessageCustom(String str) {
            str.getClass();
            return internalGetMessageCustom().containsKey(str);
        }

        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            C03151 c03151 = null;
            boolean z = false;
            switch (C03151.f1634xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new PushContent();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                    this.messageCustom_.makeImmutable();
                    return null;
                case 4:
                    return new Builder(c03151);
                case 5:
                    GeneratedMessageLite.g gVar = (GeneratedMessageLite.h) obj;
                    PushContent pushContent = (PushContent) obj2;
                    this.content_ = gVar.o(this.content_, pushContent.content_);
                    this.title_ = gVar.o(this.title_, pushContent.title_);
                    this.value_ = gVar.o(this.value_, pushContent.value_);
                    this.ticker_ = gVar.o(this.ticker_, pushContent.ticker_);
                    this.primaryPicture_ = gVar.f(!this.primaryPicture_.isEmpty(), this.primaryPicture_, !pushContent.primaryPicture_.isEmpty(), pushContent.primaryPicture_);
                    int i = this.priority_;
                    boolean z2 = i != 0;
                    int i2 = pushContent.priority_;
                    this.priority_ = gVar.e(z2, i, i2 != 0, i2);
                    int i3 = this.stackId_;
                    boolean z3 = i3 != 0;
                    int i4 = pushContent.stackId_;
                    this.stackId_ = gVar.e(z3, i3, i4 != 0, i4);
                    boolean z4 = this.silentAggregation_;
                    boolean z5 = pushContent.silentAggregation_;
                    this.silentAggregation_ = gVar.d(z4, z4, z5, z5);
                    boolean z6 = this.silent_;
                    boolean z7 = pushContent.silent_;
                    this.silent_ = gVar.d(z6, z6, z7, z7);
                    this.message_ = gVar.f(!this.message_.isEmpty(), this.message_, !pushContent.message_.isEmpty(), pushContent.message_);
                    this.intent_ = gVar.f(!this.intent_.isEmpty(), this.intent_, !pushContent.intent_.isEmpty(), pushContent.intent_);
                    long j = this.createTime_;
                    boolean z8 = j != 0;
                    long j2 = pushContent.createTime_;
                    this.createTime_ = gVar.i(z8, j, j2 != 0, j2);
                    this.imageURLWithoutFormat_ = gVar.f(!this.imageURLWithoutFormat_.isEmpty(), this.imageURLWithoutFormat_, !pushContent.imageURLWithoutFormat_.isEmpty(), pushContent.imageURLWithoutFormat_);
                    this.reqId_ = gVar.f(!this.reqId_.isEmpty(), this.reqId_, !pushContent.reqId_.isEmpty(), pushContent.reqId_);
                    this.link_ = gVar.f(!this.link_.isEmpty(), this.link_, !pushContent.link_.isEmpty(), pushContent.link_);
                    int i5 = this.counter_;
                    boolean z9 = i5 != 0;
                    int i6 = pushContent.counter_;
                    this.counter_ = gVar.e(z9, i5, i6 != 0, i6);
                    this.messageCustom_ = gVar.l(this.messageCustom_, pushContent.internalGetMessageCustom());
                    if (gVar == GeneratedMessageLite.g.INSTANCE) {
                        this.bitField0_ |= pushContent.bitField0_;
                    }
                    return this;
                case 6:
                    e eVar = (e) obj;
                    h hVar = (h) obj2;
                    while (!z) {
                        try {
                            int iM = eVar.M();
                            switch (iM) {
                                case 0:
                                    break;
                                case 10:
                                    IdType idType = this.content_;
                                    IdType.Builder builder = idType != null ? (IdType.Builder) idType.toBuilder() : null;
                                    IdType idTypeW = eVar.w(IdType.parser(), hVar);
                                    this.content_ = idTypeW;
                                    if (builder != null) {
                                        builder.mergeFrom(idTypeW);
                                        this.content_ = (IdType) builder.buildPartial();
                                    } else {
                                        continue;
                                    }
                                    break;
                                case 18:
                                    I18n i18n = this.title_;
                                    I18n.Builder builder2 = i18n != null ? (I18n.Builder) i18n.toBuilder() : null;
                                    I18n i18nW = eVar.w(I18n.parser(), hVar);
                                    this.title_ = i18nW;
                                    if (builder2 != null) {
                                        builder2.mergeFrom(i18nW);
                                        this.title_ = (I18n) builder2.buildPartial();
                                    } else {
                                        continue;
                                    }
                                    break;
                                case 26:
                                    I18n i18n2 = this.value_;
                                    I18n.Builder builder3 = i18n2 != null ? (I18n.Builder) i18n2.toBuilder() : null;
                                    I18n i18nW2 = eVar.w(I18n.parser(), hVar);
                                    this.value_ = i18nW2;
                                    if (builder3 != null) {
                                        builder3.mergeFrom(i18nW2);
                                        this.value_ = (I18n) builder3.buildPartial();
                                    } else {
                                        continue;
                                    }
                                    break;
                                case 34:
                                    I18n i18n3 = this.ticker_;
                                    I18n.Builder builder4 = i18n3 != null ? (I18n.Builder) i18n3.toBuilder() : null;
                                    I18n i18nW3 = eVar.w(I18n.parser(), hVar);
                                    this.ticker_ = i18nW3;
                                    if (builder4 != null) {
                                        builder4.mergeFrom(i18nW3);
                                        this.ticker_ = (I18n) builder4.buildPartial();
                                    } else {
                                        continue;
                                    }
                                    break;
                                case 42:
                                    this.primaryPicture_ = eVar.L();
                                    continue;
                                case 48:
                                    this.priority_ = eVar.u();
                                    continue;
                                case 56:
                                    this.stackId_ = eVar.u();
                                    continue;
                                case 64:
                                    this.silentAggregation_ = eVar.m();
                                    continue;
                                case 72:
                                    this.silent_ = eVar.m();
                                    continue;
                                case 82:
                                    this.message_ = eVar.L();
                                    continue;
                                case 90:
                                    this.intent_ = eVar.L();
                                    continue;
                                case 96:
                                    this.createTime_ = eVar.v();
                                    continue;
                                case 106:
                                    this.imageURLWithoutFormat_ = eVar.L();
                                    continue;
                                case XEGiftErrorCode.ERROR_CODE_VIDEO_TIMEOUT /* 114 */:
                                    this.reqId_ = eVar.L();
                                    continue;
                                case 122:
                                    this.link_ = eVar.L();
                                    continue;
                                case 128:
                                    this.counter_ = eVar.u();
                                    continue;
                                case 138:
                                    if (!this.messageCustom_.isMutable()) {
                                        this.messageCustom_ = this.messageCustom_.mutableCopy();
                                    }
                                    MessageCustomDefaultEntryHolder.defaultEntry.e(this.messageCustom_, eVar, hVar);
                                    continue;
                                default:
                                    if (!eVar.R(iM)) {
                                        break;
                                    }
                                    break;
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
                        synchronized (PushContent.class) {
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

        @Override // com.p1.mobile.longlink.msg.connector.LongLinkMessage.PushContentOrBuilder
        public IdType getContent() {
            IdType idType = this.content_;
            return idType == null ? IdType.getDefaultInstance() : idType;
        }

        @Override // com.p1.mobile.longlink.msg.connector.LongLinkMessage.PushContentOrBuilder
        public int getCounter() {
            return this.counter_;
        }

        @Override // com.p1.mobile.longlink.msg.connector.LongLinkMessage.PushContentOrBuilder
        public long getCreateTime() {
            return this.createTime_;
        }

        @Override // com.p1.mobile.longlink.msg.connector.LongLinkMessage.PushContentOrBuilder
        public String getImageURLWithoutFormat() {
            return this.imageURLWithoutFormat_;
        }

        @Override // com.p1.mobile.longlink.msg.connector.LongLinkMessage.PushContentOrBuilder
        public ByteString getImageURLWithoutFormatBytes() {
            return ByteString.copyFromUtf8(this.imageURLWithoutFormat_);
        }

        @Override // com.p1.mobile.longlink.msg.connector.LongLinkMessage.PushContentOrBuilder
        public String getIntent() {
            return this.intent_;
        }

        @Override // com.p1.mobile.longlink.msg.connector.LongLinkMessage.PushContentOrBuilder
        public ByteString getIntentBytes() {
            return ByteString.copyFromUtf8(this.intent_);
        }

        @Override // com.p1.mobile.longlink.msg.connector.LongLinkMessage.PushContentOrBuilder
        public String getLink() {
            return this.link_;
        }

        @Override // com.p1.mobile.longlink.msg.connector.LongLinkMessage.PushContentOrBuilder
        public ByteString getLinkBytes() {
            return ByteString.copyFromUtf8(this.link_);
        }

        @Override // com.p1.mobile.longlink.msg.connector.LongLinkMessage.PushContentOrBuilder
        public String getMessage() {
            return this.message_;
        }

        @Override // com.p1.mobile.longlink.msg.connector.LongLinkMessage.PushContentOrBuilder
        public ByteString getMessageBytes() {
            return ByteString.copyFromUtf8(this.message_);
        }

        @Override // com.p1.mobile.longlink.msg.connector.LongLinkMessage.PushContentOrBuilder
        @Deprecated
        public Map<String, String> getMessageCustom() {
            return getMessageCustomMap();
        }

        @Override // com.p1.mobile.longlink.msg.connector.LongLinkMessage.PushContentOrBuilder
        public int getMessageCustomCount() {
            return internalGetMessageCustom().size();
        }

        @Override // com.p1.mobile.longlink.msg.connector.LongLinkMessage.PushContentOrBuilder
        public Map<String, String> getMessageCustomMap() {
            return Collections.unmodifiableMap(internalGetMessageCustom());
        }

        @Override // com.p1.mobile.longlink.msg.connector.LongLinkMessage.PushContentOrBuilder
        public String getMessageCustomOrDefault(String str, String str2) {
            str.getClass();
            MapFieldLite<String, String> mapFieldLiteInternalGetMessageCustom = internalGetMessageCustom();
            return mapFieldLiteInternalGetMessageCustom.containsKey(str) ? (String) mapFieldLiteInternalGetMessageCustom.get(str) : str2;
        }

        @Override // com.p1.mobile.longlink.msg.connector.LongLinkMessage.PushContentOrBuilder
        public String getMessageCustomOrThrow(String str) {
            str.getClass();
            MapFieldLite<String, String> mapFieldLiteInternalGetMessageCustom = internalGetMessageCustom();
            if (mapFieldLiteInternalGetMessageCustom.containsKey(str)) {
                return (String) mapFieldLiteInternalGetMessageCustom.get(str);
            }
            x9g0.a();
            return null;
        }

        @Override // com.p1.mobile.longlink.msg.connector.LongLinkMessage.PushContentOrBuilder
        public String getPrimaryPicture() {
            return this.primaryPicture_;
        }

        @Override // com.p1.mobile.longlink.msg.connector.LongLinkMessage.PushContentOrBuilder
        public ByteString getPrimaryPictureBytes() {
            return ByteString.copyFromUtf8(this.primaryPicture_);
        }

        @Override // com.p1.mobile.longlink.msg.connector.LongLinkMessage.PushContentOrBuilder
        public int getPriority() {
            return this.priority_;
        }

        @Override // com.p1.mobile.longlink.msg.connector.LongLinkMessage.PushContentOrBuilder
        public String getReqId() {
            return this.reqId_;
        }

        @Override // com.p1.mobile.longlink.msg.connector.LongLinkMessage.PushContentOrBuilder
        public ByteString getReqIdBytes() {
            return ByteString.copyFromUtf8(this.reqId_);
        }

        public int getSerializedSize() {
            int i = ((GeneratedMessageLite) this).memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int iC = this.content_ != null ? CodedOutputStream.C(1, getContent()) : 0;
            if (this.title_ != null) {
                iC += CodedOutputStream.C(2, getTitle());
            }
            if (this.value_ != null) {
                iC += CodedOutputStream.C(3, getValue());
            }
            if (this.ticker_ != null) {
                iC += CodedOutputStream.C(4, getTicker());
            }
            if (!this.primaryPicture_.isEmpty()) {
                iC += CodedOutputStream.K(5, getPrimaryPicture());
            }
            int i2 = this.priority_;
            if (i2 != 0) {
                iC += CodedOutputStream.t(6, i2);
            }
            int i3 = this.stackId_;
            if (i3 != 0) {
                iC += CodedOutputStream.t(7, i3);
            }
            boolean z = this.silentAggregation_;
            if (z) {
                iC += CodedOutputStream.f(8, z);
            }
            boolean z2 = this.silent_;
            if (z2) {
                iC += CodedOutputStream.f(9, z2);
            }
            if (!this.message_.isEmpty()) {
                iC += CodedOutputStream.K(10, getMessage());
            }
            if (!this.intent_.isEmpty()) {
                iC += CodedOutputStream.K(11, getIntent());
            }
            long j = this.createTime_;
            if (j != 0) {
                iC += CodedOutputStream.v(12, j);
            }
            if (!this.imageURLWithoutFormat_.isEmpty()) {
                iC += CodedOutputStream.K(13, getImageURLWithoutFormat());
            }
            if (!this.reqId_.isEmpty()) {
                iC += CodedOutputStream.K(14, getReqId());
            }
            if (!this.link_.isEmpty()) {
                iC += CodedOutputStream.K(15, getLink());
            }
            int i4 = this.counter_;
            if (i4 != 0) {
                iC += CodedOutputStream.t(16, i4);
            }
            for (Map.Entry entry : internalGetMessageCustom().entrySet()) {
                iC += MessageCustomDefaultEntryHolder.defaultEntry.a(17, (String) entry.getKey(), (String) entry.getValue());
            }
            ((GeneratedMessageLite) this).memoizedSerializedSize = iC;
            return iC;
        }

        @Override // com.p1.mobile.longlink.msg.connector.LongLinkMessage.PushContentOrBuilder
        public boolean getSilent() {
            return this.silent_;
        }

        @Override // com.p1.mobile.longlink.msg.connector.LongLinkMessage.PushContentOrBuilder
        public boolean getSilentAggregation() {
            return this.silentAggregation_;
        }

        @Override // com.p1.mobile.longlink.msg.connector.LongLinkMessage.PushContentOrBuilder
        public int getStackId() {
            return this.stackId_;
        }

        @Override // com.p1.mobile.longlink.msg.connector.LongLinkMessage.PushContentOrBuilder
        public I18n getTicker() {
            I18n i18n = this.ticker_;
            return i18n == null ? I18n.getDefaultInstance() : i18n;
        }

        @Override // com.p1.mobile.longlink.msg.connector.LongLinkMessage.PushContentOrBuilder
        public I18n getTitle() {
            I18n i18n = this.title_;
            return i18n == null ? I18n.getDefaultInstance() : i18n;
        }

        @Override // com.p1.mobile.longlink.msg.connector.LongLinkMessage.PushContentOrBuilder
        public I18n getValue() {
            I18n i18n = this.value_;
            return i18n == null ? I18n.getDefaultInstance() : i18n;
        }

        @Override // com.p1.mobile.longlink.msg.connector.LongLinkMessage.PushContentOrBuilder
        public boolean hasContent() {
            return this.content_ != null;
        }

        @Override // com.p1.mobile.longlink.msg.connector.LongLinkMessage.PushContentOrBuilder
        public boolean hasTicker() {
            return this.ticker_ != null;
        }

        @Override // com.p1.mobile.longlink.msg.connector.LongLinkMessage.PushContentOrBuilder
        public boolean hasTitle() {
            return this.title_ != null;
        }

        @Override // com.p1.mobile.longlink.msg.connector.LongLinkMessage.PushContentOrBuilder
        public boolean hasValue() {
            return this.value_ != null;
        }

        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (this.content_ != null) {
                codedOutputStream.w0(1, getContent());
            }
            if (this.title_ != null) {
                codedOutputStream.w0(2, getTitle());
            }
            if (this.value_ != null) {
                codedOutputStream.w0(3, getValue());
            }
            if (this.ticker_ != null) {
                codedOutputStream.w0(4, getTicker());
            }
            if (!this.primaryPicture_.isEmpty()) {
                codedOutputStream.D0(5, getPrimaryPicture());
            }
            int i = this.priority_;
            if (i != 0) {
                codedOutputStream.s0(6, i);
            }
            int i2 = this.stackId_;
            if (i2 != 0) {
                codedOutputStream.s0(7, i2);
            }
            boolean z = this.silentAggregation_;
            if (z) {
                codedOutputStream.a0(8, z);
            }
            boolean z2 = this.silent_;
            if (z2) {
                codedOutputStream.a0(9, z2);
            }
            if (!this.message_.isEmpty()) {
                codedOutputStream.D0(10, getMessage());
            }
            if (!this.intent_.isEmpty()) {
                codedOutputStream.D0(11, getIntent());
            }
            long j = this.createTime_;
            if (j != 0) {
                codedOutputStream.u0(12, j);
            }
            if (!this.imageURLWithoutFormat_.isEmpty()) {
                codedOutputStream.D0(13, getImageURLWithoutFormat());
            }
            if (!this.reqId_.isEmpty()) {
                codedOutputStream.D0(14, getReqId());
            }
            if (!this.link_.isEmpty()) {
                codedOutputStream.D0(15, getLink());
            }
            int i3 = this.counter_;
            if (i3 != 0) {
                codedOutputStream.s0(16, i3);
            }
            for (Map.Entry entry : internalGetMessageCustom().entrySet()) {
                MessageCustomDefaultEntryHolder.defaultEntry.f(codedOutputStream, 17, (String) entry.getKey(), (String) entry.getValue());
            }
        }

        public static final class Builder extends GeneratedMessageLite.b<PushContent, Builder> implements PushContentOrBuilder {
            private Builder() {
                super(PushContent.DEFAULT_INSTANCE);
            }

            public Builder clearContent() {
                copyOnWrite();
                ((PushContent) ((GeneratedMessageLite.b) this).instance).clearContent();
                return this;
            }

            public Builder clearCounter() {
                copyOnWrite();
                ((PushContent) ((GeneratedMessageLite.b) this).instance).clearCounter();
                return this;
            }

            public Builder clearCreateTime() {
                copyOnWrite();
                ((PushContent) ((GeneratedMessageLite.b) this).instance).clearCreateTime();
                return this;
            }

            public Builder clearImageURLWithoutFormat() {
                copyOnWrite();
                ((PushContent) ((GeneratedMessageLite.b) this).instance).clearImageURLWithoutFormat();
                return this;
            }

            public Builder clearIntent() {
                copyOnWrite();
                ((PushContent) ((GeneratedMessageLite.b) this).instance).clearIntent();
                return this;
            }

            public Builder clearLink() {
                copyOnWrite();
                ((PushContent) ((GeneratedMessageLite.b) this).instance).clearLink();
                return this;
            }

            public Builder clearMessage() {
                copyOnWrite();
                ((PushContent) ((GeneratedMessageLite.b) this).instance).clearMessage();
                return this;
            }

            public Builder clearMessageCustom() {
                copyOnWrite();
                ((PushContent) ((GeneratedMessageLite.b) this).instance).getMutableMessageCustomMap().clear();
                return this;
            }

            public Builder clearPrimaryPicture() {
                copyOnWrite();
                ((PushContent) ((GeneratedMessageLite.b) this).instance).clearPrimaryPicture();
                return this;
            }

            public Builder clearPriority() {
                copyOnWrite();
                ((PushContent) ((GeneratedMessageLite.b) this).instance).clearPriority();
                return this;
            }

            public Builder clearReqId() {
                copyOnWrite();
                ((PushContent) ((GeneratedMessageLite.b) this).instance).clearReqId();
                return this;
            }

            public Builder clearSilent() {
                copyOnWrite();
                ((PushContent) ((GeneratedMessageLite.b) this).instance).clearSilent();
                return this;
            }

            public Builder clearSilentAggregation() {
                copyOnWrite();
                ((PushContent) ((GeneratedMessageLite.b) this).instance).clearSilentAggregation();
                return this;
            }

            public Builder clearStackId() {
                copyOnWrite();
                ((PushContent) ((GeneratedMessageLite.b) this).instance).clearStackId();
                return this;
            }

            public Builder clearTicker() {
                copyOnWrite();
                ((PushContent) ((GeneratedMessageLite.b) this).instance).clearTicker();
                return this;
            }

            public Builder clearTitle() {
                copyOnWrite();
                ((PushContent) ((GeneratedMessageLite.b) this).instance).clearTitle();
                return this;
            }

            public Builder clearValue() {
                copyOnWrite();
                ((PushContent) ((GeneratedMessageLite.b) this).instance).clearValue();
                return this;
            }

            @Override // com.p1.mobile.longlink.msg.connector.LongLinkMessage.PushContentOrBuilder
            public boolean containsMessageCustom(String str) {
                str.getClass();
                return ((PushContent) ((GeneratedMessageLite.b) this).instance).getMessageCustomMap().containsKey(str);
            }

            @Override // com.p1.mobile.longlink.msg.connector.LongLinkMessage.PushContentOrBuilder
            public IdType getContent() {
                return ((PushContent) ((GeneratedMessageLite.b) this).instance).getContent();
            }

            @Override // com.p1.mobile.longlink.msg.connector.LongLinkMessage.PushContentOrBuilder
            public int getCounter() {
                return ((PushContent) ((GeneratedMessageLite.b) this).instance).getCounter();
            }

            @Override // com.p1.mobile.longlink.msg.connector.LongLinkMessage.PushContentOrBuilder
            public long getCreateTime() {
                return ((PushContent) ((GeneratedMessageLite.b) this).instance).getCreateTime();
            }

            @Override // com.p1.mobile.longlink.msg.connector.LongLinkMessage.PushContentOrBuilder
            public String getImageURLWithoutFormat() {
                return ((PushContent) ((GeneratedMessageLite.b) this).instance).getImageURLWithoutFormat();
            }

            @Override // com.p1.mobile.longlink.msg.connector.LongLinkMessage.PushContentOrBuilder
            public ByteString getImageURLWithoutFormatBytes() {
                return ((PushContent) ((GeneratedMessageLite.b) this).instance).getImageURLWithoutFormatBytes();
            }

            @Override // com.p1.mobile.longlink.msg.connector.LongLinkMessage.PushContentOrBuilder
            public String getIntent() {
                return ((PushContent) ((GeneratedMessageLite.b) this).instance).getIntent();
            }

            @Override // com.p1.mobile.longlink.msg.connector.LongLinkMessage.PushContentOrBuilder
            public ByteString getIntentBytes() {
                return ((PushContent) ((GeneratedMessageLite.b) this).instance).getIntentBytes();
            }

            @Override // com.p1.mobile.longlink.msg.connector.LongLinkMessage.PushContentOrBuilder
            public String getLink() {
                return ((PushContent) ((GeneratedMessageLite.b) this).instance).getLink();
            }

            @Override // com.p1.mobile.longlink.msg.connector.LongLinkMessage.PushContentOrBuilder
            public ByteString getLinkBytes() {
                return ((PushContent) ((GeneratedMessageLite.b) this).instance).getLinkBytes();
            }

            @Override // com.p1.mobile.longlink.msg.connector.LongLinkMessage.PushContentOrBuilder
            public String getMessage() {
                return ((PushContent) ((GeneratedMessageLite.b) this).instance).getMessage();
            }

            @Override // com.p1.mobile.longlink.msg.connector.LongLinkMessage.PushContentOrBuilder
            public ByteString getMessageBytes() {
                return ((PushContent) ((GeneratedMessageLite.b) this).instance).getMessageBytes();
            }

            @Override // com.p1.mobile.longlink.msg.connector.LongLinkMessage.PushContentOrBuilder
            @Deprecated
            public Map<String, String> getMessageCustom() {
                return getMessageCustomMap();
            }

            @Override // com.p1.mobile.longlink.msg.connector.LongLinkMessage.PushContentOrBuilder
            public int getMessageCustomCount() {
                return ((PushContent) ((GeneratedMessageLite.b) this).instance).getMessageCustomMap().size();
            }

            @Override // com.p1.mobile.longlink.msg.connector.LongLinkMessage.PushContentOrBuilder
            public Map<String, String> getMessageCustomMap() {
                return Collections.unmodifiableMap(((PushContent) ((GeneratedMessageLite.b) this).instance).getMessageCustomMap());
            }

            @Override // com.p1.mobile.longlink.msg.connector.LongLinkMessage.PushContentOrBuilder
            public String getMessageCustomOrDefault(String str, String str2) {
                str.getClass();
                Map<String, String> messageCustomMap = ((PushContent) ((GeneratedMessageLite.b) this).instance).getMessageCustomMap();
                return messageCustomMap.containsKey(str) ? messageCustomMap.get(str) : str2;
            }

            @Override // com.p1.mobile.longlink.msg.connector.LongLinkMessage.PushContentOrBuilder
            public String getMessageCustomOrThrow(String str) {
                str.getClass();
                Map<String, String> messageCustomMap = ((PushContent) ((GeneratedMessageLite.b) this).instance).getMessageCustomMap();
                if (messageCustomMap.containsKey(str)) {
                    return messageCustomMap.get(str);
                }
                x9g0.a();
                return null;
            }

            @Override // com.p1.mobile.longlink.msg.connector.LongLinkMessage.PushContentOrBuilder
            public String getPrimaryPicture() {
                return ((PushContent) ((GeneratedMessageLite.b) this).instance).getPrimaryPicture();
            }

            @Override // com.p1.mobile.longlink.msg.connector.LongLinkMessage.PushContentOrBuilder
            public ByteString getPrimaryPictureBytes() {
                return ((PushContent) ((GeneratedMessageLite.b) this).instance).getPrimaryPictureBytes();
            }

            @Override // com.p1.mobile.longlink.msg.connector.LongLinkMessage.PushContentOrBuilder
            public int getPriority() {
                return ((PushContent) ((GeneratedMessageLite.b) this).instance).getPriority();
            }

            @Override // com.p1.mobile.longlink.msg.connector.LongLinkMessage.PushContentOrBuilder
            public String getReqId() {
                return ((PushContent) ((GeneratedMessageLite.b) this).instance).getReqId();
            }

            @Override // com.p1.mobile.longlink.msg.connector.LongLinkMessage.PushContentOrBuilder
            public ByteString getReqIdBytes() {
                return ((PushContent) ((GeneratedMessageLite.b) this).instance).getReqIdBytes();
            }

            @Override // com.p1.mobile.longlink.msg.connector.LongLinkMessage.PushContentOrBuilder
            public boolean getSilent() {
                return ((PushContent) ((GeneratedMessageLite.b) this).instance).getSilent();
            }

            @Override // com.p1.mobile.longlink.msg.connector.LongLinkMessage.PushContentOrBuilder
            public boolean getSilentAggregation() {
                return ((PushContent) ((GeneratedMessageLite.b) this).instance).getSilentAggregation();
            }

            @Override // com.p1.mobile.longlink.msg.connector.LongLinkMessage.PushContentOrBuilder
            public int getStackId() {
                return ((PushContent) ((GeneratedMessageLite.b) this).instance).getStackId();
            }

            @Override // com.p1.mobile.longlink.msg.connector.LongLinkMessage.PushContentOrBuilder
            public I18n getTicker() {
                return ((PushContent) ((GeneratedMessageLite.b) this).instance).getTicker();
            }

            @Override // com.p1.mobile.longlink.msg.connector.LongLinkMessage.PushContentOrBuilder
            public I18n getTitle() {
                return ((PushContent) ((GeneratedMessageLite.b) this).instance).getTitle();
            }

            @Override // com.p1.mobile.longlink.msg.connector.LongLinkMessage.PushContentOrBuilder
            public I18n getValue() {
                return ((PushContent) ((GeneratedMessageLite.b) this).instance).getValue();
            }

            @Override // com.p1.mobile.longlink.msg.connector.LongLinkMessage.PushContentOrBuilder
            public boolean hasContent() {
                return ((PushContent) ((GeneratedMessageLite.b) this).instance).hasContent();
            }

            @Override // com.p1.mobile.longlink.msg.connector.LongLinkMessage.PushContentOrBuilder
            public boolean hasTicker() {
                return ((PushContent) ((GeneratedMessageLite.b) this).instance).hasTicker();
            }

            @Override // com.p1.mobile.longlink.msg.connector.LongLinkMessage.PushContentOrBuilder
            public boolean hasTitle() {
                return ((PushContent) ((GeneratedMessageLite.b) this).instance).hasTitle();
            }

            @Override // com.p1.mobile.longlink.msg.connector.LongLinkMessage.PushContentOrBuilder
            public boolean hasValue() {
                return ((PushContent) ((GeneratedMessageLite.b) this).instance).hasValue();
            }

            public Builder mergeContent(IdType idType) {
                copyOnWrite();
                ((PushContent) ((GeneratedMessageLite.b) this).instance).mergeContent(idType);
                return this;
            }

            public Builder mergeTicker(I18n i18n) {
                copyOnWrite();
                ((PushContent) ((GeneratedMessageLite.b) this).instance).mergeTicker(i18n);
                return this;
            }

            public Builder mergeTitle(I18n i18n) {
                copyOnWrite();
                ((PushContent) ((GeneratedMessageLite.b) this).instance).mergeTitle(i18n);
                return this;
            }

            public Builder mergeValue(I18n i18n) {
                copyOnWrite();
                ((PushContent) ((GeneratedMessageLite.b) this).instance).mergeValue(i18n);
                return this;
            }

            public Builder putAllMessageCustom(Map<String, String> map) {
                copyOnWrite();
                ((PushContent) ((GeneratedMessageLite.b) this).instance).getMutableMessageCustomMap().putAll(map);
                return this;
            }

            public Builder putMessageCustom(String str, String str2) {
                str.getClass();
                str2.getClass();
                copyOnWrite();
                ((PushContent) ((GeneratedMessageLite.b) this).instance).getMutableMessageCustomMap().put(str, str2);
                return this;
            }

            public Builder removeMessageCustom(String str) {
                str.getClass();
                copyOnWrite();
                ((PushContent) ((GeneratedMessageLite.b) this).instance).getMutableMessageCustomMap().remove(str);
                return this;
            }

            public Builder setContent(IdType idType) {
                copyOnWrite();
                ((PushContent) ((GeneratedMessageLite.b) this).instance).setContent(idType);
                return this;
            }

            public Builder setCounter(int i) {
                copyOnWrite();
                ((PushContent) ((GeneratedMessageLite.b) this).instance).setCounter(i);
                return this;
            }

            public Builder setCreateTime(long j) {
                copyOnWrite();
                ((PushContent) ((GeneratedMessageLite.b) this).instance).setCreateTime(j);
                return this;
            }

            public Builder setImageURLWithoutFormat(String str) {
                copyOnWrite();
                ((PushContent) ((GeneratedMessageLite.b) this).instance).setImageURLWithoutFormat(str);
                return this;
            }

            public Builder setImageURLWithoutFormatBytes(ByteString byteString) {
                copyOnWrite();
                ((PushContent) ((GeneratedMessageLite.b) this).instance).setImageURLWithoutFormatBytes(byteString);
                return this;
            }

            public Builder setIntent(String str) {
                copyOnWrite();
                ((PushContent) ((GeneratedMessageLite.b) this).instance).setIntent(str);
                return this;
            }

            public Builder setIntentBytes(ByteString byteString) {
                copyOnWrite();
                ((PushContent) ((GeneratedMessageLite.b) this).instance).setIntentBytes(byteString);
                return this;
            }

            public Builder setLink(String str) {
                copyOnWrite();
                ((PushContent) ((GeneratedMessageLite.b) this).instance).setLink(str);
                return this;
            }

            public Builder setLinkBytes(ByteString byteString) {
                copyOnWrite();
                ((PushContent) ((GeneratedMessageLite.b) this).instance).setLinkBytes(byteString);
                return this;
            }

            public Builder setMessage(String str) {
                copyOnWrite();
                ((PushContent) ((GeneratedMessageLite.b) this).instance).setMessage(str);
                return this;
            }

            public Builder setMessageBytes(ByteString byteString) {
                copyOnWrite();
                ((PushContent) ((GeneratedMessageLite.b) this).instance).setMessageBytes(byteString);
                return this;
            }

            public Builder setPrimaryPicture(String str) {
                copyOnWrite();
                ((PushContent) ((GeneratedMessageLite.b) this).instance).setPrimaryPicture(str);
                return this;
            }

            public Builder setPrimaryPictureBytes(ByteString byteString) {
                copyOnWrite();
                ((PushContent) ((GeneratedMessageLite.b) this).instance).setPrimaryPictureBytes(byteString);
                return this;
            }

            public Builder setPriority(int i) {
                copyOnWrite();
                ((PushContent) ((GeneratedMessageLite.b) this).instance).setPriority(i);
                return this;
            }

            public Builder setReqId(String str) {
                copyOnWrite();
                ((PushContent) ((GeneratedMessageLite.b) this).instance).setReqId(str);
                return this;
            }

            public Builder setReqIdBytes(ByteString byteString) {
                copyOnWrite();
                ((PushContent) ((GeneratedMessageLite.b) this).instance).setReqIdBytes(byteString);
                return this;
            }

            public Builder setSilent(boolean z) {
                copyOnWrite();
                ((PushContent) ((GeneratedMessageLite.b) this).instance).setSilent(z);
                return this;
            }

            public Builder setSilentAggregation(boolean z) {
                copyOnWrite();
                ((PushContent) ((GeneratedMessageLite.b) this).instance).setSilentAggregation(z);
                return this;
            }

            public Builder setStackId(int i) {
                copyOnWrite();
                ((PushContent) ((GeneratedMessageLite.b) this).instance).setStackId(i);
                return this;
            }

            public Builder setTicker(I18n i18n) {
                copyOnWrite();
                ((PushContent) ((GeneratedMessageLite.b) this).instance).setTicker(i18n);
                return this;
            }

            public Builder setTitle(I18n i18n) {
                copyOnWrite();
                ((PushContent) ((GeneratedMessageLite.b) this).instance).setTitle(i18n);
                return this;
            }

            public Builder setValue(I18n i18n) {
                copyOnWrite();
                ((PushContent) ((GeneratedMessageLite.b) this).instance).setValue(i18n);
                return this;
            }

            public /* synthetic */ Builder(C03151 c03151) {
                this();
            }

            public Builder setContent(IdType.Builder builder) {
                copyOnWrite();
                ((PushContent) ((GeneratedMessageLite.b) this).instance).setContent(builder);
                return this;
            }

            public Builder setTicker(I18n.Builder builder) {
                copyOnWrite();
                ((PushContent) ((GeneratedMessageLite.b) this).instance).setTicker(builder);
                return this;
            }

            public Builder setTitle(I18n.Builder builder) {
                copyOnWrite();
                ((PushContent) ((GeneratedMessageLite.b) this).instance).setTitle(builder);
                return this;
            }

            public Builder setValue(I18n.Builder builder) {
                copyOnWrite();
                ((PushContent) ((GeneratedMessageLite.b) this).instance).setValue(builder);
                return this;
            }
        }

        public static PushContent parseDelimitedFrom(InputStream inputStream, h hVar) throws IOException {
            return (PushContent) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, hVar);
        }

        public static PushContent parseFrom(ByteString byteString, h hVar) throws InvalidProtocolBufferException {
            return (PushContent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, hVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setContent(IdType idType) {
            idType.getClass();
            this.content_ = idType;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTicker(I18n i18n) {
            i18n.getClass();
            this.ticker_ = i18n;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTitle(I18n i18n) {
            i18n.getClass();
            this.title_ = i18n;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setValue(I18n i18n) {
            i18n.getClass();
            this.value_ = i18n;
        }

        public static PushContent parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (PushContent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static PushContent parseFrom(byte[] bArr, h hVar) throws InvalidProtocolBufferException {
            return (PushContent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, hVar);
        }

        public static PushContent parseFrom(InputStream inputStream) throws IOException {
            return (PushContent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static PushContent parseFrom(InputStream inputStream, h hVar) throws IOException {
            return (PushContent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, hVar);
        }

        public static PushContent parseFrom(e eVar) throws IOException {
            return (PushContent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, eVar);
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.toBuilder();
        }

        public static PushContent parseFrom(e eVar, h hVar) throws IOException {
            return (PushContent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, eVar, hVar);
        }
    }

    public enum MsgTypeEnum implements l.c {
        MSG_TYPE_CHAT_MSG(0),
        MSG_TYPE_PUSH_ACK(1),
        MSG_TYPE_AUTH(2),
        MSG_TYPE_AUTH_ACK(3),
        MSG_TYPE_NEW_CONVERSATION(4),
        MSG_TYPE_DELETE_CONVERSATION(5),
        MSG_TYPE_CANCEL_MSG(6),
        MSG_TYPE_MOMENT_LIKE(7),
        MSG_TYPE_MOMENT_CANCEL_LIKE(8),
        MSG_TYPE_SWITCH_SIDE(9),
        MSG_TYPE_MOMENT_COMMENT(10),
        MSG_TYPE_LIVECHAT_POPUP(11),
        MSG_TYPE_RED_PACKETS_BROADCAST(12),
        MSG_TYPE_RED_PACKETS_RECEIVED(13),
        MSG_TYPE_LIVE_CHAT_RECALL(14),
        MSG_TYPE_CHAT_TYPING(16),
        MSG_TYPE_LIVE_SYSTEM_MSG(100),
        MSG_TYPE_LIVE_CHAT_MSG(101),
        MSG_TYPE_LIVE_START(102),
        MSG_TYPE_LIVE_STOP(103),
        MSG_TYPE_LIVE_PAUSE(104),
        MSG_TYPE_LIVE_RECOVER(105),
        MSG_TYPE_LIVE_ENTER_ROOM(106),
        MSG_TYPE_LIVE_LEAVE_ROOM(107),
        MSG_TYPE_LIVE_JAIL(108),
        MSG_TYPE_LIVE_BOOT(109),
        MSG_TYPE_LIVE_BLOCK_MSG(110),
        MSG_TYPE_LIVE_LIVEINFO(111),
        MSG_TYPE_LIVE_FORCE_STOP(112),
        MSG_TYPE_LIVE_FORBIDDEN_MULTIDEVICE(113),
        MSG_TYPE_LIVE_FOLLOW(MSG_TYPE_LIVE_FOLLOW_VALUE),
        MSG_TYPE_LIVE_CLIENT_CHATREQ(MSG_TYPE_LIVE_CLIENT_CHATREQ_VALUE),
        MSG_TYPE_LIVE_CHAT_GIFT_MSG(MSG_TYPE_LIVE_CHAT_GIFT_MSG_VALUE),
        MSG_TYPE_LIVE_GIFT_RECEIVED(MSG_TYPE_LIVE_GIFT_RECEIVED_VALUE),
        MSG_TYPE_LIVE_GIFT_LEADERBOARD(MSG_TYPE_LIVE_GIFT_LEADERBOARD_VALUE),
        MSG_TYPE_LIVE_CLIENT_CHATACK(200),
        MSG_TYPE_LIVE_SERVER_ACK(201),
        MSG_TYPE_CHAT_BLOCK(17),
        MSG_TYPE_COMMON(MSG_TYPE_COMMON_VALUE),
        UNRECOGNIZED(-1);

        public static final int MSG_TYPE_AUTH_ACK_VALUE = 3;
        public static final int MSG_TYPE_AUTH_VALUE = 2;
        public static final int MSG_TYPE_CANCEL_MSG_VALUE = 6;
        public static final int MSG_TYPE_CHAT_BLOCK_VALUE = 17;
        public static final int MSG_TYPE_CHAT_MSG_VALUE = 0;
        public static final int MSG_TYPE_CHAT_TYPING_VALUE = 16;
        public static final int MSG_TYPE_COMMON_VALUE = 1000;
        public static final int MSG_TYPE_DELETE_CONVERSATION_VALUE = 5;
        public static final int MSG_TYPE_LIVECHAT_POPUP_VALUE = 11;
        public static final int MSG_TYPE_LIVE_BLOCK_MSG_VALUE = 110;
        public static final int MSG_TYPE_LIVE_BOOT_VALUE = 109;
        public static final int MSG_TYPE_LIVE_CHAT_GIFT_MSG_VALUE = 151;
        public static final int MSG_TYPE_LIVE_CHAT_MSG_VALUE = 101;
        public static final int MSG_TYPE_LIVE_CHAT_RECALL_VALUE = 14;
        public static final int MSG_TYPE_LIVE_CLIENT_CHATACK_VALUE = 200;
        public static final int MSG_TYPE_LIVE_CLIENT_CHATREQ_VALUE = 150;
        public static final int MSG_TYPE_LIVE_ENTER_ROOM_VALUE = 106;
        public static final int MSG_TYPE_LIVE_FOLLOW_VALUE = 140;
        public static final int MSG_TYPE_LIVE_FORBIDDEN_MULTIDEVICE_VALUE = 113;
        public static final int MSG_TYPE_LIVE_FORCE_STOP_VALUE = 112;
        public static final int MSG_TYPE_LIVE_GIFT_LEADERBOARD_VALUE = 161;
        public static final int MSG_TYPE_LIVE_GIFT_RECEIVED_VALUE = 160;
        public static final int MSG_TYPE_LIVE_JAIL_VALUE = 108;
        public static final int MSG_TYPE_LIVE_LEAVE_ROOM_VALUE = 107;
        public static final int MSG_TYPE_LIVE_LIVEINFO_VALUE = 111;
        public static final int MSG_TYPE_LIVE_PAUSE_VALUE = 104;
        public static final int MSG_TYPE_LIVE_RECOVER_VALUE = 105;
        public static final int MSG_TYPE_LIVE_SERVER_ACK_VALUE = 201;
        public static final int MSG_TYPE_LIVE_START_VALUE = 102;
        public static final int MSG_TYPE_LIVE_STOP_VALUE = 103;
        public static final int MSG_TYPE_LIVE_SYSTEM_MSG_VALUE = 100;
        public static final int MSG_TYPE_MOMENT_CANCEL_LIKE_VALUE = 8;
        public static final int MSG_TYPE_MOMENT_COMMENT_VALUE = 10;
        public static final int MSG_TYPE_MOMENT_LIKE_VALUE = 7;
        public static final int MSG_TYPE_NEW_CONVERSATION_VALUE = 4;
        public static final int MSG_TYPE_PUSH_ACK_VALUE = 1;
        public static final int MSG_TYPE_RED_PACKETS_BROADCAST_VALUE = 12;
        public static final int MSG_TYPE_RED_PACKETS_RECEIVED_VALUE = 13;
        public static final int MSG_TYPE_SWITCH_SIDE_VALUE = 9;
        private static final l.d<MsgTypeEnum> internalValueMap = new l.d<MsgTypeEnum>() { // from class: com.p1.mobile.longlink.msg.connector.LongLinkMessage.MsgTypeEnum.1
            public MsgTypeEnum findValueByNumber(int i) {
                return MsgTypeEnum.forNumber(i);
            }
        };
        private final int value;

        MsgTypeEnum(int i) {
            this.value = i;
        }

        public static MsgTypeEnum forNumber(int i) {
            if (i == 16) {
                return MSG_TYPE_CHAT_TYPING;
            }
            if (i == 17) {
                return MSG_TYPE_CHAT_BLOCK;
            }
            if (i == 140) {
                return MSG_TYPE_LIVE_FOLLOW;
            }
            if (i == 1000) {
                return MSG_TYPE_COMMON;
            }
            if (i == 150) {
                return MSG_TYPE_LIVE_CLIENT_CHATREQ;
            }
            if (i == 151) {
                return MSG_TYPE_LIVE_CHAT_GIFT_MSG;
            }
            if (i == 160) {
                return MSG_TYPE_LIVE_GIFT_RECEIVED;
            }
            if (i == 161) {
                return MSG_TYPE_LIVE_GIFT_LEADERBOARD;
            }
            if (i == 200) {
                return MSG_TYPE_LIVE_CLIENT_CHATACK;
            }
            if (i == 201) {
                return MSG_TYPE_LIVE_SERVER_ACK;
            }
            switch (i) {
                case 0:
                    return MSG_TYPE_CHAT_MSG;
                case 1:
                    return MSG_TYPE_PUSH_ACK;
                case 2:
                    return MSG_TYPE_AUTH;
                case 3:
                    return MSG_TYPE_AUTH_ACK;
                case 4:
                    return MSG_TYPE_NEW_CONVERSATION;
                case 5:
                    return MSG_TYPE_DELETE_CONVERSATION;
                case 6:
                    return MSG_TYPE_CANCEL_MSG;
                case 7:
                    return MSG_TYPE_MOMENT_LIKE;
                case 8:
                    return MSG_TYPE_MOMENT_CANCEL_LIKE;
                case 9:
                    return MSG_TYPE_SWITCH_SIDE;
                case 10:
                    return MSG_TYPE_MOMENT_COMMENT;
                case 11:
                    return MSG_TYPE_LIVECHAT_POPUP;
                case 12:
                    return MSG_TYPE_RED_PACKETS_BROADCAST;
                case 13:
                    return MSG_TYPE_RED_PACKETS_RECEIVED;
                case 14:
                    return MSG_TYPE_LIVE_CHAT_RECALL;
                default:
                    switch (i) {
                        case 100:
                            return MSG_TYPE_LIVE_SYSTEM_MSG;
                        case 101:
                            return MSG_TYPE_LIVE_CHAT_MSG;
                        case 102:
                            return MSG_TYPE_LIVE_START;
                        case 103:
                            return MSG_TYPE_LIVE_STOP;
                        case 104:
                            return MSG_TYPE_LIVE_PAUSE;
                        case 105:
                            return MSG_TYPE_LIVE_RECOVER;
                        case 106:
                            return MSG_TYPE_LIVE_ENTER_ROOM;
                        case 107:
                            return MSG_TYPE_LIVE_LEAVE_ROOM;
                        case 108:
                            return MSG_TYPE_LIVE_JAIL;
                        case 109:
                            return MSG_TYPE_LIVE_BOOT;
                        case 110:
                            return MSG_TYPE_LIVE_BLOCK_MSG;
                        case 111:
                            return MSG_TYPE_LIVE_LIVEINFO;
                        case 112:
                            return MSG_TYPE_LIVE_FORCE_STOP;
                        case 113:
                            return MSG_TYPE_LIVE_FORBIDDEN_MULTIDEVICE;
                        default:
                            return null;
                    }
            }
        }

        public static l.d<MsgTypeEnum> internalGetValueMap() {
            return internalValueMap;
        }

        public final int getNumber() {
            return this.value;
        }

        @Deprecated
        public static MsgTypeEnum valueOf(int i) {
            return forNumber(i);
        }
    }
}
