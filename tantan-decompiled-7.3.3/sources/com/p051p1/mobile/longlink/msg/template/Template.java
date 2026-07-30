package com.p051p1.mobile.longlink.msg.template;

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

/* JADX INFO: loaded from: classes8.dex */
public final class Template {

    /* JADX INFO: renamed from: com.p1.mobile.longlink.msg.template.Template$1 */
    public static /* synthetic */ class C46981 {

        /* JADX INFO: renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f16716xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f16716xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f16716xa1df5c61[GeneratedMessageLite.MethodToInvoke.IS_INITIALIZED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f16716xa1df5c61[GeneratedMessageLite.MethodToInvoke.MAKE_IMMUTABLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f16716xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f16716xa1df5c61[GeneratedMessageLite.MethodToInvoke.VISIT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f16716xa1df5c61[GeneratedMessageLite.MethodToInvoke.MERGE_FROM_STREAM.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f16716xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f16716xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    public interface TemplateDataOrBuilder extends lfz {
        @Override // p153l.lfz
        /* synthetic */ InterfaceC3442q getDefaultInstanceForType();

        String getFields(int i);

        ByteString getFieldsBytes(int i);

        int getFieldsCount();

        List<String> getFieldsList();

        int getId();

        @Override // p153l.lfz
        /* synthetic */ boolean isInitialized();
    }

    private Template() {
    }

    public static void registerAllExtensions(C3433h c3433h) {
    }

    public static final class TemplateData extends GeneratedMessageLite<TemplateData, Builder> implements TemplateDataOrBuilder {
        private static final TemplateData DEFAULT_INSTANCE;
        public static final int FIELDS_FIELD_NUMBER = 2;
        public static final int ID_FIELD_NUMBER = 1;
        private static volatile ng60<TemplateData> PARSER;
        private int bitField0_;
        private C3437l.h<String> fields_ = GeneratedMessageLite.emptyProtobufList();
        private int id_;

        public static final class Builder extends GeneratedMessageLite.AbstractC3403b<TemplateData, Builder> implements TemplateDataOrBuilder {
            private Builder() {
                super(TemplateData.DEFAULT_INSTANCE);
            }

            public Builder addAllFields(Iterable<String> iterable) {
                copyOnWrite();
                ((TemplateData) this.instance).addAllFields(iterable);
                return this;
            }

            public Builder addFields(String str) {
                copyOnWrite();
                ((TemplateData) this.instance).addFields(str);
                return this;
            }

            public Builder addFieldsBytes(ByteString byteString) {
                copyOnWrite();
                ((TemplateData) this.instance).addFieldsBytes(byteString);
                return this;
            }

            public Builder clearFields() {
                copyOnWrite();
                ((TemplateData) this.instance).clearFields();
                return this;
            }

            public Builder clearId() {
                copyOnWrite();
                ((TemplateData) this.instance).clearId();
                return this;
            }

            @Override // com.p1.mobile.longlink.msg.template.Template.TemplateDataOrBuilder
            public String getFields(int i) {
                return ((TemplateData) this.instance).getFields(i);
            }

            @Override // com.p1.mobile.longlink.msg.template.Template.TemplateDataOrBuilder
            public ByteString getFieldsBytes(int i) {
                return ((TemplateData) this.instance).getFieldsBytes(i);
            }

            @Override // com.p1.mobile.longlink.msg.template.Template.TemplateDataOrBuilder
            public int getFieldsCount() {
                return ((TemplateData) this.instance).getFieldsCount();
            }

            @Override // com.p1.mobile.longlink.msg.template.Template.TemplateDataOrBuilder
            public List<String> getFieldsList() {
                return Collections.unmodifiableList(((TemplateData) this.instance).getFieldsList());
            }

            @Override // com.p1.mobile.longlink.msg.template.Template.TemplateDataOrBuilder
            public int getId() {
                return ((TemplateData) this.instance).getId();
            }

            public Builder setFields(int i, String str) {
                copyOnWrite();
                ((TemplateData) this.instance).setFields(i, str);
                return this;
            }

            public Builder setId(int i) {
                copyOnWrite();
                ((TemplateData) this.instance).setId(i);
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
            AbstractC3426a.addAll(iterable, this.fields_);
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
            AbstractC3426a.checkByteStringIsUtf8(byteString);
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
            if (this.fields_.mo17140q()) {
                return;
            }
            this.fields_ = GeneratedMessageLite.mutableCopy(this.fields_);
        }

        public static TemplateData getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder(TemplateData templateData) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(templateData);
        }

        public static TemplateData parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (TemplateData) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static TemplateData parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (TemplateData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static ng60<TemplateData> parser() {
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

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            boolean z = false;
            switch (C46981.f16716xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new TemplateData();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                    this.fields_.mo17139n();
                    return null;
                case 4:
                    return new Builder();
                case 5:
                    GeneratedMessageLite.InterfaceC3409h interfaceC3409h = (GeneratedMessageLite.InterfaceC3409h) obj;
                    TemplateData templateData = (TemplateData) obj2;
                    int i = this.id_;
                    boolean z2 = i != 0;
                    int i2 = templateData.id_;
                    this.id_ = interfaceC3409h.mo17051e(z2, i, i2 != 0, i2);
                    this.fields_ = interfaceC3409h.mo17053g(this.fields_, templateData.fields_);
                    if (interfaceC3409h == GeneratedMessageLite.C3408g.INSTANCE) {
                        this.bitField0_ |= templateData.bitField0_;
                    }
                    return this;
                case 6:
                    C3430e c3430e = (C3430e) obj;
                    while (!z) {
                        try {
                            int iM17171M = c3430e.m17171M();
                            if (iM17171M != 0) {
                                if (iM17171M == 8) {
                                    this.id_ = c3430e.m17172N();
                                } else if (iM17171M == 18) {
                                    String strM17170L = c3430e.m17170L();
                                    if (!this.fields_.mo17140q()) {
                                        this.fields_ = GeneratedMessageLite.mutableCopy(this.fields_);
                                    }
                                    this.fields_.add(strM17170L);
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
                        synchronized (TemplateData.class) {
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

        @Override // com.p1.mobile.longlink.msg.template.Template.TemplateDataOrBuilder
        public String getFields(int i) {
            return this.fields_.get(i);
        }

        @Override // com.p1.mobile.longlink.msg.template.Template.TemplateDataOrBuilder
        public ByteString getFieldsBytes(int i) {
            return ByteString.copyFromUtf8(this.fields_.get(i));
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

        @Override // com.google.protobuf.InterfaceC3442q
        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int i2 = this.id_;
            int iM16959N = i2 != 0 ? CodedOutputStream.m16959N(1, i2) : 0;
            int iM16957L = 0;
            for (int i3 = 0; i3 < this.fields_.size(); i3++) {
                iM16957L += CodedOutputStream.m16957L(this.fields_.get(i3));
            }
            int size = iM16959N + iM16957L + getFieldsList().size();
            this.memoizedSerializedSize = size;
            return size;
        }

        @Override // com.google.protobuf.InterfaceC3442q
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            int i = this.id_;
            if (i != 0) {
                codedOutputStream.mo16997G0(1, i);
            }
            for (int i2 = 0; i2 < this.fields_.size(); i2++) {
                codedOutputStream.mo16994D0(2, this.fields_.get(i2));
            }
        }

        public static TemplateData parseDelimitedFrom(InputStream inputStream, C3433h c3433h) throws IOException {
            return (TemplateData) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, c3433h);
        }

        public static TemplateData parseFrom(ByteString byteString, C3433h c3433h) throws InvalidProtocolBufferException {
            return (TemplateData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, c3433h);
        }

        public static TemplateData parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (TemplateData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static TemplateData parseFrom(byte[] bArr, C3433h c3433h) throws InvalidProtocolBufferException {
            return (TemplateData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, c3433h);
        }

        public static TemplateData parseFrom(InputStream inputStream) throws IOException {
            return (TemplateData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static TemplateData parseFrom(InputStream inputStream, C3433h c3433h) throws IOException {
            return (TemplateData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, c3433h);
        }

        public static TemplateData parseFrom(C3430e c3430e) throws IOException {
            return (TemplateData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, c3430e);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static TemplateData parseFrom(C3430e c3430e, C3433h c3433h) throws IOException {
            return (TemplateData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, c3430e, c3433h);
        }
    }

    public enum TemplateType implements C3437l.c {
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
        private static final C3437l.d<TemplateType> internalValueMap = new C3437l.d<TemplateType>() { // from class: com.p1.mobile.longlink.msg.template.Template.TemplateType.1
            @Override // com.google.protobuf.C3437l.d
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

        public static C3437l.d<TemplateType> internalGetValueMap() {
            return internalValueMap;
        }

        @Override // com.google.protobuf.C3437l.c
        public final int getNumber() {
            return this.value;
        }

        @Deprecated
        public static TemplateType valueOf(int i) {
            return forNumber(i);
        }
    }
}
