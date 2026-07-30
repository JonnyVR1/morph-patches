package com.p003p1.mobile.longlink.msg.template;

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
import java.util.Collections;
import java.util.List;
import l.aag0;
import l.bz00;
import l.i860;
import l.o6z;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes8.dex */
public final class Template {

    /* JADX INFO: renamed from: com.p1.mobile.longlink.msg.template.Template$1 */
    public static /* synthetic */ class C04591 {

        /* JADX INFO: renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f1696xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f1696xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f1696xa1df5c61[GeneratedMessageLite.MethodToInvoke.IS_INITIALIZED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f1696xa1df5c61[GeneratedMessageLite.MethodToInvoke.MAKE_IMMUTABLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f1696xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f1696xa1df5c61[GeneratedMessageLite.MethodToInvoke.VISIT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f1696xa1df5c61[GeneratedMessageLite.MethodToInvoke.MERGE_FROM_STREAM.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f1696xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f1696xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    public interface TemplateDataOrBuilder extends o6z {
        /* synthetic */ q getDefaultInstanceForType();

        String getFields(int i);

        ByteString getFieldsBytes(int i);

        int getFieldsCount();

        List<String> getFieldsList();

        int getId();

        /* synthetic */ boolean isInitialized();
    }

    private Template() {
    }

    public static void registerAllExtensions(h hVar) {
    }

    public static final class TemplateData extends GeneratedMessageLite<TemplateData, Builder> implements TemplateDataOrBuilder {
        private static final TemplateData DEFAULT_INSTANCE;
        public static final int FIELDS_FIELD_NUMBER = 2;
        public static final int ID_FIELD_NUMBER = 1;
        private static volatile i860<TemplateData> PARSER;
        private int bitField0_;
        private l.h<String> fields_ = GeneratedMessageLite.emptyProtobufList();
        private int id_;

        public static final class Builder extends GeneratedMessageLite.b<TemplateData, Builder> implements TemplateDataOrBuilder {
            private Builder() {
                super(TemplateData.DEFAULT_INSTANCE);
            }

            public Builder addAllFields(Iterable<String> iterable) {
                copyOnWrite();
                ((TemplateData) ((GeneratedMessageLite.b) this).instance).addAllFields(iterable);
                return this;
            }

            public Builder addFields(String str) {
                copyOnWrite();
                ((TemplateData) ((GeneratedMessageLite.b) this).instance).addFields(str);
                return this;
            }

            public Builder addFieldsBytes(ByteString byteString) {
                copyOnWrite();
                ((TemplateData) ((GeneratedMessageLite.b) this).instance).addFieldsBytes(byteString);
                return this;
            }

            public Builder clearFields() {
                copyOnWrite();
                ((TemplateData) ((GeneratedMessageLite.b) this).instance).clearFields();
                return this;
            }

            public Builder clearId() {
                copyOnWrite();
                ((TemplateData) ((GeneratedMessageLite.b) this).instance).clearId();
                return this;
            }

            @Override // com.p1.mobile.longlink.msg.template.Template.TemplateDataOrBuilder
            public String getFields(int i) {
                return ((TemplateData) ((GeneratedMessageLite.b) this).instance).getFields(i);
            }

            @Override // com.p1.mobile.longlink.msg.template.Template.TemplateDataOrBuilder
            public ByteString getFieldsBytes(int i) {
                return ((TemplateData) ((GeneratedMessageLite.b) this).instance).getFieldsBytes(i);
            }

            @Override // com.p1.mobile.longlink.msg.template.Template.TemplateDataOrBuilder
            public int getFieldsCount() {
                return ((TemplateData) ((GeneratedMessageLite.b) this).instance).getFieldsCount();
            }

            @Override // com.p1.mobile.longlink.msg.template.Template.TemplateDataOrBuilder
            public List<String> getFieldsList() {
                return Collections.unmodifiableList(((TemplateData) ((GeneratedMessageLite.b) this).instance).getFieldsList());
            }

            @Override // com.p1.mobile.longlink.msg.template.Template.TemplateDataOrBuilder
            public int getId() {
                return ((TemplateData) ((GeneratedMessageLite.b) this).instance).getId();
            }

            public Builder setFields(int i, String str) {
                copyOnWrite();
                ((TemplateData) ((GeneratedMessageLite.b) this).instance).setFields(i, str);
                return this;
            }

            public Builder setId(int i) {
                copyOnWrite();
                ((TemplateData) ((GeneratedMessageLite.b) this).instance).setId(i);
                return this;
            }
        }

        static {
            TemplateData templateData = new TemplateData();
            DEFAULT_INSTANCE = templateData;
            templateData.makeImmutable();
        }

        private TemplateData() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllFields(Iterable<String> iterable) {
            ensureFieldsIsMutable();
            a.addAll(iterable, this.fields_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addFields(String str) {
            str.getClass();
            ensureFieldsIsMutable();
            this.fields_.add(str);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addFieldsBytes(ByteString byteString) {
            byteString.getClass();
            a.checkByteStringIsUtf8(byteString);
            ensureFieldsIsMutable();
            this.fields_.add(byteString.toStringUtf8());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearFields() {
            this.fields_ = GeneratedMessageLite.emptyProtobufList();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearId() {
            this.id_ = 0;
        }

        private void ensureFieldsIsMutable() {
            if (this.fields_.q()) {
                return;
            }
            this.fields_ = GeneratedMessageLite.mutableCopy(this.fields_);
        }

        public static TemplateData getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder(TemplateData templateData) {
            return (Builder) ((Builder) DEFAULT_INSTANCE.toBuilder()).mergeFrom(templateData);
        }

        public static TemplateData parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (TemplateData) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static TemplateData parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (TemplateData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static i860<TemplateData> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setFields(int i, String str) {
            str.getClass();
            ensureFieldsIsMutable();
            this.fields_.set(i, str);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setId(int i) {
            this.id_ = i;
        }

        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            boolean z = false;
            switch (C04591.f1696xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new TemplateData();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                    this.fields_.n();
                    return null;
                case 4:
                    return new Builder();
                case 5:
                    GeneratedMessageLite.g gVar = (GeneratedMessageLite.h) obj;
                    TemplateData templateData = (TemplateData) obj2;
                    int i = this.id_;
                    boolean z2 = i != 0;
                    int i2 = templateData.id_;
                    this.id_ = gVar.e(z2, i, i2 != 0, i2);
                    this.fields_ = gVar.g(this.fields_, templateData.fields_);
                    if (gVar == GeneratedMessageLite.g.INSTANCE) {
                        this.bitField0_ |= templateData.bitField0_;
                    }
                    return this;
                case 6:
                    e eVar = (e) obj;
                    while (!z) {
                        try {
                            int iM = eVar.M();
                            if (iM != 0) {
                                if (iM == 8) {
                                    this.id_ = eVar.N();
                                } else if (iM == 18) {
                                    String strL = eVar.L();
                                    if (!this.fields_.q()) {
                                        this.fields_ = GeneratedMessageLite.mutableCopy(this.fields_);
                                    }
                                    this.fields_.add(strL);
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
                        synchronized (TemplateData.class) {
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

        @Override // com.p1.mobile.longlink.msg.template.Template.TemplateDataOrBuilder
        public String getFields(int i) {
            return (String) this.fields_.get(i);
        }

        @Override // com.p1.mobile.longlink.msg.template.Template.TemplateDataOrBuilder
        public ByteString getFieldsBytes(int i) {
            return ByteString.copyFromUtf8((String) this.fields_.get(i));
        }

        @Override // com.p1.mobile.longlink.msg.template.Template.TemplateDataOrBuilder
        public int getFieldsCount() {
            return this.fields_.size();
        }

        @Override // com.p1.mobile.longlink.msg.template.Template.TemplateDataOrBuilder
        public List<String> getFieldsList() {
            return this.fields_;
        }

        @Override // com.p1.mobile.longlink.msg.template.Template.TemplateDataOrBuilder
        public int getId() {
            return this.id_;
        }

        public int getSerializedSize() {
            int i = ((GeneratedMessageLite) this).memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int i2 = this.id_;
            int iN = i2 != 0 ? CodedOutputStream.N(1, i2) : 0;
            int iL = 0;
            for (int i3 = 0; i3 < this.fields_.size(); i3++) {
                iL += CodedOutputStream.L((String) this.fields_.get(i3));
            }
            int size = iN + iL + getFieldsList().size();
            ((GeneratedMessageLite) this).memoizedSerializedSize = size;
            return size;
        }

        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            int i = this.id_;
            if (i != 0) {
                codedOutputStream.G0(1, i);
            }
            for (int i2 = 0; i2 < this.fields_.size(); i2++) {
                codedOutputStream.D0(2, (String) this.fields_.get(i2));
            }
        }

        public static TemplateData parseDelimitedFrom(InputStream inputStream, h hVar) throws IOException {
            return (TemplateData) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, hVar);
        }

        public static TemplateData parseFrom(ByteString byteString, h hVar) throws InvalidProtocolBufferException {
            return (TemplateData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, hVar);
        }

        public static TemplateData parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (TemplateData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static TemplateData parseFrom(byte[] bArr, h hVar) throws InvalidProtocolBufferException {
            return (TemplateData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, hVar);
        }

        public static TemplateData parseFrom(InputStream inputStream) throws IOException {
            return (TemplateData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static TemplateData parseFrom(InputStream inputStream, h hVar) throws IOException {
            return (TemplateData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, hVar);
        }

        public static TemplateData parseFrom(e eVar) throws IOException {
            return (TemplateData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, eVar);
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.toBuilder();
        }

        public static TemplateData parseFrom(e eVar, h hVar) throws IOException {
            return (TemplateData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, eVar, hVar);
        }
    }

    public enum TemplateType implements l.c {
        TP_DEFAULT(0),
        TP_ROOM_ENTER(1),
        TP_CHAT_NORMAL(2),
        TP_CHAT_GIFT(3),
        TP_FOLLOW(4),
        TP_OPENLIVE_NOTICE(5),
        TP_ENTER_NOTICE(6),
        TP_PUNISH(7),
        TP_KICK(8),
        TP_JAIL(9),
        UNRECOGNIZED(-1);

        public static final int TP_CHAT_GIFT_VALUE = 3;
        public static final int TP_CHAT_NORMAL_VALUE = 2;
        public static final int TP_DEFAULT_VALUE = 0;
        public static final int TP_ENTER_NOTICE_VALUE = 6;
        public static final int TP_FOLLOW_VALUE = 4;
        public static final int TP_JAIL_VALUE = 9;
        public static final int TP_KICK_VALUE = 8;
        public static final int TP_OPENLIVE_NOTICE_VALUE = 5;
        public static final int TP_PUNISH_VALUE = 7;
        public static final int TP_ROOM_ENTER_VALUE = 1;
        private static final l.d<TemplateType> internalValueMap = new l.d<TemplateType>() { // from class: com.p1.mobile.longlink.msg.template.Template.TemplateType.1
            public TemplateType findValueByNumber(int i) {
                return TemplateType.forNumber(i);
            }
        };
        private final int value;

        TemplateType(int i) {
            this.value = i;
        }

        public static TemplateType forNumber(int i) {
            switch (i) {
                case 0:
                    return TP_DEFAULT;
                case 1:
                    return TP_ROOM_ENTER;
                case 2:
                    return TP_CHAT_NORMAL;
                case 3:
                    return TP_CHAT_GIFT;
                case 4:
                    return TP_FOLLOW;
                case 5:
                    return TP_OPENLIVE_NOTICE;
                case 6:
                    return TP_ENTER_NOTICE;
                case 7:
                    return TP_PUNISH;
                case 8:
                    return TP_KICK;
                case 9:
                    return TP_JAIL;
                default:
                    return null;
            }
        }

        public static l.d<TemplateType> internalGetValueMap() {
            return internalValueMap;
        }

        public final int getNumber() {
            return this.value;
        }

        @Deprecated
        public static TemplateType valueOf(int i) {
            return forNumber(i);
        }
    }
}
