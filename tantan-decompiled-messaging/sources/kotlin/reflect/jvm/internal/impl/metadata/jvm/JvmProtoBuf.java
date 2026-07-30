package kotlin.reflect.jvm.internal.impl.metadata.jvm;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite;
import kotlin.reflect.jvm.internal.impl.protobuf.AbstractParser;
import kotlin.reflect.jvm.internal.impl.protobuf.ByteString;
import kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream;
import kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream;
import kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite;
import kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite;
import kotlin.reflect.jvm.internal.impl.protobuf.Internal;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;
import kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder;
import kotlin.reflect.jvm.internal.impl.protobuf.Parser;
import kotlin.reflect.jvm.internal.impl.protobuf.WireFormat;

/* JADX INFO: loaded from: classes2.dex */
public final class JvmProtoBuf {

    /* JADX INFO: renamed from: a */
    public static final GeneratedMessageLite.GeneratedExtension<ProtoBuf.Constructor, JvmMethodSignature> f65407a;

    /* JADX INFO: renamed from: b */
    public static final GeneratedMessageLite.GeneratedExtension<ProtoBuf.Function, JvmMethodSignature> f65408b;

    /* JADX INFO: renamed from: c */
    public static final GeneratedMessageLite.GeneratedExtension<ProtoBuf.Function, Integer> f65409c;

    /* JADX INFO: renamed from: d */
    public static final GeneratedMessageLite.GeneratedExtension<ProtoBuf.Property, JvmPropertySignature> f65410d;

    /* JADX INFO: renamed from: e */
    public static final GeneratedMessageLite.GeneratedExtension<ProtoBuf.Property, Integer> f65411e;

    /* JADX INFO: renamed from: f */
    public static final GeneratedMessageLite.GeneratedExtension<ProtoBuf.Type, List<ProtoBuf.Annotation>> f65412f;

    /* JADX INFO: renamed from: g */
    public static final GeneratedMessageLite.GeneratedExtension<ProtoBuf.Type, Boolean> f65413g;

    /* JADX INFO: renamed from: h */
    public static final GeneratedMessageLite.GeneratedExtension<ProtoBuf.TypeParameter, List<ProtoBuf.Annotation>> f65414h;

    /* JADX INFO: renamed from: i */
    public static final GeneratedMessageLite.GeneratedExtension<ProtoBuf.Class, Integer> f65415i;

    /* JADX INFO: renamed from: j */
    public static final GeneratedMessageLite.GeneratedExtension<ProtoBuf.Class, List<ProtoBuf.Property>> f65416j;

    /* JADX INFO: renamed from: k */
    public static final GeneratedMessageLite.GeneratedExtension<ProtoBuf.Class, Integer> f65417k;

    /* JADX INFO: renamed from: l */
    public static final GeneratedMessageLite.GeneratedExtension<ProtoBuf.Class, Integer> f65418l;

    /* JADX INFO: renamed from: m */
    public static final GeneratedMessageLite.GeneratedExtension<ProtoBuf.Package, Integer> f65419m;

    /* JADX INFO: renamed from: n */
    public static final GeneratedMessageLite.GeneratedExtension<ProtoBuf.Package, List<ProtoBuf.Property>> f65420n;

    public interface JvmFieldSignatureOrBuilder extends MessageLiteOrBuilder {
    }

    public interface JvmMethodSignatureOrBuilder extends MessageLiteOrBuilder {
    }

    public interface JvmPropertySignatureOrBuilder extends MessageLiteOrBuilder {
    }

    public interface StringTableTypesOrBuilder extends MessageLiteOrBuilder {
    }

    static {
        ProtoBuf.Constructor defaultInstance = ProtoBuf.Constructor.getDefaultInstance();
        JvmMethodSignature defaultInstance2 = JvmMethodSignature.getDefaultInstance();
        JvmMethodSignature defaultInstance3 = JvmMethodSignature.getDefaultInstance();
        WireFormat.FieldType fieldType = WireFormat.FieldType.MESSAGE;
        f65407a = GeneratedMessageLite.newSingularGeneratedExtension(defaultInstance, defaultInstance2, defaultInstance3, null, 100, fieldType, JvmMethodSignature.class);
        f65408b = GeneratedMessageLite.newSingularGeneratedExtension(ProtoBuf.Function.getDefaultInstance(), JvmMethodSignature.getDefaultInstance(), JvmMethodSignature.getDefaultInstance(), null, 100, fieldType, JvmMethodSignature.class);
        ProtoBuf.Function defaultInstance4 = ProtoBuf.Function.getDefaultInstance();
        WireFormat.FieldType fieldType2 = WireFormat.FieldType.INT32;
        f65409c = GeneratedMessageLite.newSingularGeneratedExtension(defaultInstance4, 0, null, null, 101, fieldType2, Integer.class);
        f65410d = GeneratedMessageLite.newSingularGeneratedExtension(ProtoBuf.Property.getDefaultInstance(), JvmPropertySignature.getDefaultInstance(), JvmPropertySignature.getDefaultInstance(), null, 100, fieldType, JvmPropertySignature.class);
        f65411e = GeneratedMessageLite.newSingularGeneratedExtension(ProtoBuf.Property.getDefaultInstance(), 0, null, null, 101, fieldType2, Integer.class);
        f65412f = GeneratedMessageLite.newRepeatedGeneratedExtension(ProtoBuf.Type.getDefaultInstance(), ProtoBuf.Annotation.getDefaultInstance(), null, 100, fieldType, false, ProtoBuf.Annotation.class);
        f65413g = GeneratedMessageLite.newSingularGeneratedExtension(ProtoBuf.Type.getDefaultInstance(), Boolean.FALSE, null, null, 101, WireFormat.FieldType.BOOL, Boolean.class);
        f65414h = GeneratedMessageLite.newRepeatedGeneratedExtension(ProtoBuf.TypeParameter.getDefaultInstance(), ProtoBuf.Annotation.getDefaultInstance(), null, 100, fieldType, false, ProtoBuf.Annotation.class);
        f65415i = GeneratedMessageLite.newSingularGeneratedExtension(ProtoBuf.Class.getDefaultInstance(), 0, null, null, 101, fieldType2, Integer.class);
        f65416j = GeneratedMessageLite.newRepeatedGeneratedExtension(ProtoBuf.Class.getDefaultInstance(), ProtoBuf.Property.getDefaultInstance(), null, 102, fieldType, false, ProtoBuf.Property.class);
        f65417k = GeneratedMessageLite.newSingularGeneratedExtension(ProtoBuf.Class.getDefaultInstance(), 0, null, null, 103, fieldType2, Integer.class);
        f65418l = GeneratedMessageLite.newSingularGeneratedExtension(ProtoBuf.Class.getDefaultInstance(), 0, null, null, 104, fieldType2, Integer.class);
        f65419m = GeneratedMessageLite.newSingularGeneratedExtension(ProtoBuf.Package.getDefaultInstance(), 0, null, null, 101, fieldType2, Integer.class);
        f65420n = GeneratedMessageLite.newRepeatedGeneratedExtension(ProtoBuf.Package.getDefaultInstance(), ProtoBuf.Property.getDefaultInstance(), null, 102, fieldType, false, ProtoBuf.Property.class);
    }

    /* JADX INFO: renamed from: a */
    public static void m90936a(ExtensionRegistryLite extensionRegistryLite) {
        extensionRegistryLite.m91301a(f65407a);
        extensionRegistryLite.m91301a(f65408b);
        extensionRegistryLite.m91301a(f65409c);
        extensionRegistryLite.m91301a(f65410d);
        extensionRegistryLite.m91301a(f65411e);
        extensionRegistryLite.m91301a(f65412f);
        extensionRegistryLite.m91301a(f65413g);
        extensionRegistryLite.m91301a(f65414h);
        extensionRegistryLite.m91301a(f65415i);
        extensionRegistryLite.m91301a(f65416j);
        extensionRegistryLite.m91301a(f65417k);
        extensionRegistryLite.m91301a(f65418l);
        extensionRegistryLite.m91301a(f65419m);
        extensionRegistryLite.m91301a(f65420n);
    }

    public static final class StringTableTypes extends GeneratedMessageLite implements StringTableTypesOrBuilder {
        public static Parser<StringTableTypes> PARSER = new C15282a();
        private static final StringTableTypes defaultInstance;
        private int localNameMemoizedSerializedSize;
        private List<Integer> localName_;
        private byte memoizedIsInitialized;
        private int memoizedSerializedSize;
        private List<Record> record_;
        private final ByteString unknownFields;

        public static final class Builder extends GeneratedMessageLite.Builder<StringTableTypes, Builder> implements StringTableTypesOrBuilder {

            /* JADX INFO: renamed from: b */
            public int f65433b;

            /* JADX INFO: renamed from: c */
            public List<Record> f65434c;

            /* JADX INFO: renamed from: d */
            public List<Integer> f65435d;

            private Builder() {
                List list = Collections.EMPTY_LIST;
                this.f65434c = list;
                this.f65435d = list;
                m90975r();
            }

            /* JADX INFO: renamed from: o */
            public static Builder m90974o() {
                return new Builder();
            }

            /* JADX INFO: renamed from: r */
            private void m90975r() {
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
            public StringTableTypes build() {
                StringTableTypes stringTableTypesM90977m = m90977m();
                if (stringTableTypesM90977m.isInitialized()) {
                    return stringTableTypesM90977m;
                }
                throw AbstractMessageLite.Builder.m91133c(stringTableTypesM90977m);
            }

            /* JADX INFO: renamed from: m */
            public StringTableTypes m90977m() {
                StringTableTypes stringTableTypes = new StringTableTypes(this);
                if ((this.f65433b & 1) == 1) {
                    this.f65434c = Collections.unmodifiableList(this.f65434c);
                    this.f65433b &= -2;
                }
                stringTableTypes.record_ = this.f65434c;
                if ((this.f65433b & 2) == 2) {
                    this.f65435d = Collections.unmodifiableList(this.f65435d);
                    this.f65433b &= -3;
                }
                stringTableTypes.localName_ = this.f65435d;
                return stringTableTypes;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder
            /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
            public Builder mo90523m() {
                return m90974o().mo90458f(m90977m());
            }

            /* JADX INFO: renamed from: p */
            public final void m90979p() {
                if ((this.f65433b & 2) != 2) {
                    this.f65435d = new ArrayList(this.f65435d);
                    this.f65433b |= 2;
                }
            }

            /* JADX INFO: renamed from: q */
            public final void m90980q() {
                if ((this.f65433b & 1) != 1) {
                    this.f65434c = new ArrayList(this.f65434c);
                    this.f65433b |= 1;
                }
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder
            /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
            public Builder mo90458f(StringTableTypes stringTableTypes) {
                if (stringTableTypes == StringTableTypes.getDefaultInstance()) {
                    return this;
                }
                if (!stringTableTypes.record_.isEmpty()) {
                    if (this.f65434c.isEmpty()) {
                        this.f65434c = stringTableTypes.record_;
                        this.f65433b &= -2;
                    } else {
                        m90980q();
                        this.f65434c.addAll(stringTableTypes.record_);
                    }
                }
                if (!stringTableTypes.localName_.isEmpty()) {
                    if (this.f65435d.isEmpty()) {
                        this.f65435d = stringTableTypes.localName_;
                        this.f65433b &= -3;
                    } else {
                        m90979p();
                        this.f65435d.addAll(stringTableTypes.localName_);
                    }
                }
                m91333j(m91332e().m91156c(stringTableTypes.unknownFields));
                return this;
            }

            /* JADX WARN: Code duplicated, block: B:15:0x001d  */
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
            public Builder mo90459i(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws Throwable {
                StringTableTypes stringTableTypes = null;
                try {
                    try {
                        StringTableTypes stringTableTypesMo90487d = StringTableTypes.PARSER.mo90487d(codedInputStream, extensionRegistryLite);
                        if (stringTableTypesMo90487d != null) {
                            mo90458f(stringTableTypesMo90487d);
                        }
                        return this;
                    } catch (InvalidProtocolBufferException e) {
                        StringTableTypes stringTableTypes2 = (StringTableTypes) e.getUnfinishedMessage();
                        try {
                            throw e;
                        } catch (Throwable th) {
                            th = th;
                            stringTableTypes = stringTableTypes2;
                            if (stringTableTypes != null) {
                                mo90458f(stringTableTypes);
                            }
                            throw th;
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                    if (stringTableTypes != null) {
                        mo90458f(stringTableTypes);
                    }
                    throw th;
                }
            }
        }

        public interface RecordOrBuilder extends MessageLiteOrBuilder {
        }

        /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf$StringTableTypes$a */
        public static class C15282a extends AbstractParser<StringTableTypes> {
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.Parser
            /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
            public StringTableTypes mo90487d(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return new StringTableTypes(codedInputStream, extensionRegistryLite);
            }
        }

        static {
            StringTableTypes stringTableTypes = new StringTableTypes(true);
            defaultInstance = stringTableTypes;
            stringTableTypes.initFields();
        }

        private StringTableTypes(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            this.localNameMemoizedSerializedSize = -1;
            this.memoizedIsInitialized = (byte) -1;
            this.memoizedSerializedSize = -1;
            initFields();
            ByteString.Output outputM91150w = ByteString.m91150w();
            CodedOutputStream codedOutputStreamM91226K = CodedOutputStream.m91226K(outputM91150w, 1);
            boolean z = false;
            int i = 0;
            while (!z) {
                try {
                    try {
                        int iM91185K = codedInputStream.m91185K();
                        if (iM91185K != 0) {
                            if (iM91185K == 10) {
                                if ((i & 1) != 1) {
                                    this.record_ = new ArrayList();
                                    i |= 1;
                                }
                                this.record_.add((Record) codedInputStream.m91211u(Record.PARSER, extensionRegistryLite));
                            } else if (iM91185K == 40) {
                                if ((i & 2) != 2) {
                                    this.localName_ = new ArrayList();
                                    i |= 2;
                                }
                                this.localName_.add(Integer.valueOf(codedInputStream.m91209s()));
                            } else if (iM91185K == 42) {
                                int iM91200j = codedInputStream.m91200j(codedInputStream.m91176A());
                                if ((i & 2) != 2 && codedInputStream.m91197e() > 0) {
                                    this.localName_ = new ArrayList();
                                    i |= 2;
                                }
                                while (codedInputStream.m91197e() > 0) {
                                    this.localName_.add(Integer.valueOf(codedInputStream.m91209s()));
                                }
                                codedInputStream.m91199i(iM91200j);
                            } else if (!parseUnknownField(codedInputStream, codedOutputStreamM91226K, extensionRegistryLite, iM91185K)) {
                            }
                        }
                        z = true;
                    } catch (InvalidProtocolBufferException e) {
                        throw e.setUnfinishedMessage(this);
                    } catch (IOException e2) {
                        throw new InvalidProtocolBufferException(e2.getMessage()).setUnfinishedMessage(this);
                    }
                } catch (Throwable th) {
                    if ((i & 1) == 1) {
                        this.record_ = Collections.unmodifiableList(this.record_);
                    }
                    if ((i & 2) == 2) {
                        this.localName_ = Collections.unmodifiableList(this.localName_);
                    }
                    try {
                        codedOutputStreamM91226K.m91258J();
                    } catch (IOException unused) {
                    } finally {
                        this.unknownFields = outputM91150w.m91170m();
                    }
                    makeExtensionsImmutable();
                    throw th;
                }
            }
            if ((i & 1) == 1) {
                this.record_ = Collections.unmodifiableList(this.record_);
            }
            if ((i & 2) == 2) {
                this.localName_ = Collections.unmodifiableList(this.localName_);
            }
            try {
                codedOutputStreamM91226K.m91258J();
            } catch (IOException unused2) {
            } finally {
                this.unknownFields = outputM91150w.m91170m();
            }
            makeExtensionsImmutable();
        }

        public static StringTableTypes getDefaultInstance() {
            return defaultInstance;
        }

        private void initFields() {
            List list = Collections.EMPTY_LIST;
            this.record_ = list;
            this.localName_ = list;
        }

        public static Builder newBuilder(StringTableTypes stringTableTypes) {
            return newBuilder().mo90458f(stringTableTypes);
        }

        public static StringTableTypes parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return PARSER.mo91134a(inputStream, extensionRegistryLite);
        }

        public List<Integer> getLocalNameList() {
            return this.localName_;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public Parser<StringTableTypes> getParserForType() {
            return PARSER;
        }

        public List<Record> getRecordList() {
            return this.record_;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int iM91247t = 0;
            for (int i2 = 0; i2 < this.record_.size(); i2++) {
                iM91247t += CodedOutputStream.m91247t(1, this.record_.get(i2));
            }
            int iM91244q = 0;
            for (int i3 = 0; i3 < this.localName_.size(); i3++) {
                iM91244q += CodedOutputStream.m91244q(this.localName_.get(i3).intValue());
            }
            int iM91244q2 = iM91247t + iM91244q;
            if (!getLocalNameList().isEmpty()) {
                iM91244q2 = iM91244q2 + 1 + CodedOutputStream.m91244q(iM91244q);
            }
            this.localNameMemoizedSerializedSize = iM91244q;
            int size = iM91244q2 + this.unknownFields.size();
            this.memoizedSerializedSize = size;
            return size;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            byte b = this.memoizedIsInitialized;
            if (b == 1) {
                return true;
            }
            if (b == 0) {
                return false;
            }
            this.memoizedIsInitialized = (byte) 1;
            return true;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            getSerializedSize();
            for (int i = 0; i < this.record_.size(); i++) {
                codedOutputStream.m91280h0(1, this.record_.get(i));
            }
            if (getLocalNameList().size() > 0) {
                codedOutputStream.m91291s0(42);
                codedOutputStream.m91291s0(this.localNameMemoizedSerializedSize);
            }
            for (int i2 = 0; i2 < this.localName_.size(); i2++) {
                codedOutputStream.m91278f0(this.localName_.get(i2).intValue());
            }
            codedOutputStream.m91285m0(this.unknownFields);
        }

        public static final class Record extends GeneratedMessageLite implements RecordOrBuilder {
            public static Parser<Record> PARSER = new C15281a();
            private static final Record defaultInstance;
            private int bitField0_;
            private byte memoizedIsInitialized;
            private int memoizedSerializedSize;
            private Operation operation_;
            private int predefinedIndex_;
            private int range_;
            private int replaceCharMemoizedSerializedSize;
            private List<Integer> replaceChar_;
            private Object string_;
            private int substringIndexMemoizedSerializedSize;
            private List<Integer> substringIndex_;
            private final ByteString unknownFields;

            public static final class Builder extends GeneratedMessageLite.Builder<Record, Builder> implements RecordOrBuilder {

                /* JADX INFO: renamed from: b */
                public int f65436b;

                /* JADX INFO: renamed from: d */
                public int f65438d;

                /* JADX INFO: renamed from: g */
                public List<Integer> f65441g;

                /* JADX INFO: renamed from: h */
                public List<Integer> f65442h;

                /* JADX INFO: renamed from: c */
                public int f65437c = 1;

                /* JADX INFO: renamed from: e */
                public Object f65439e = "";

                /* JADX INFO: renamed from: f */
                public Operation f65440f = Operation.NONE;

                private Builder() {
                    List<Integer> list = Collections.EMPTY_LIST;
                    this.f65441g = list;
                    this.f65442h = list;
                    m90985r();
                }

                /* JADX INFO: renamed from: o */
                public static Builder m90984o() {
                    return new Builder();
                }

                /* JADX INFO: renamed from: r */
                private void m90985r() {
                }

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
                /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
                public Record build() {
                    Record recordM90987m = m90987m();
                    if (recordM90987m.isInitialized()) {
                        return recordM90987m;
                    }
                    throw AbstractMessageLite.Builder.m91133c(recordM90987m);
                }

                /* JADX INFO: renamed from: m */
                public Record m90987m() {
                    Record record = new Record(this);
                    int i = this.f65436b;
                    int i2 = (i & 1) != 1 ? 0 : 1;
                    record.range_ = this.f65437c;
                    if ((i & 2) == 2) {
                        i2 |= 2;
                    }
                    record.predefinedIndex_ = this.f65438d;
                    if ((i & 4) == 4) {
                        i2 |= 4;
                    }
                    record.string_ = this.f65439e;
                    if ((i & 8) == 8) {
                        i2 |= 8;
                    }
                    record.operation_ = this.f65440f;
                    if ((this.f65436b & 16) == 16) {
                        this.f65441g = Collections.unmodifiableList(this.f65441g);
                        this.f65436b &= -17;
                    }
                    record.substringIndex_ = this.f65441g;
                    if ((this.f65436b & 32) == 32) {
                        this.f65442h = Collections.unmodifiableList(this.f65442h);
                        this.f65436b &= -33;
                    }
                    record.replaceChar_ = this.f65442h;
                    record.bitField0_ = i2;
                    return record;
                }

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder
                /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
                public Builder mo90523m() {
                    return m90984o().mo90458f(m90987m());
                }

                /* JADX INFO: renamed from: p */
                public final void m90989p() {
                    if ((this.f65436b & 32) != 32) {
                        this.f65442h = new ArrayList(this.f65442h);
                        this.f65436b |= 32;
                    }
                }

                /* JADX INFO: renamed from: q */
                public final void m90990q() {
                    if ((this.f65436b & 16) != 16) {
                        this.f65441g = new ArrayList(this.f65441g);
                        this.f65436b |= 16;
                    }
                }

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder
                /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
                public Builder mo90458f(Record record) {
                    if (record == Record.getDefaultInstance()) {
                        return this;
                    }
                    if (record.hasRange()) {
                        m90995w(record.getRange());
                    }
                    if (record.hasPredefinedIndex()) {
                        m90994v(record.getPredefinedIndex());
                    }
                    if (record.hasString()) {
                        this.f65436b |= 4;
                        this.f65439e = record.string_;
                    }
                    if (record.hasOperation()) {
                        m90993u(record.getOperation());
                    }
                    if (!record.substringIndex_.isEmpty()) {
                        if (this.f65441g.isEmpty()) {
                            this.f65441g = record.substringIndex_;
                            this.f65436b &= -17;
                        } else {
                            m90990q();
                            this.f65441g.addAll(record.substringIndex_);
                        }
                    }
                    if (!record.replaceChar_.isEmpty()) {
                        if (this.f65442h.isEmpty()) {
                            this.f65442h = record.replaceChar_;
                            this.f65436b &= -33;
                        } else {
                            m90989p();
                            this.f65442h.addAll(record.replaceChar_);
                        }
                    }
                    m91333j(m91332e().m91156c(record.unknownFields));
                    return this;
                }

                /* JADX WARN: Code duplicated, block: B:15:0x001d  */
                @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
                /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
                public Builder mo90459i(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws Throwable {
                    Record record = null;
                    try {
                        try {
                            Record recordMo90487d = Record.PARSER.mo90487d(codedInputStream, extensionRegistryLite);
                            if (recordMo90487d != null) {
                                mo90458f(recordMo90487d);
                            }
                            return this;
                        } catch (InvalidProtocolBufferException e) {
                            Record record2 = (Record) e.getUnfinishedMessage();
                            try {
                                throw e;
                            } catch (Throwable th) {
                                th = th;
                                record = record2;
                                if (record != null) {
                                    mo90458f(record);
                                }
                                throw th;
                            }
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        if (record != null) {
                            mo90458f(record);
                        }
                        throw th;
                    }
                }

                /* JADX INFO: renamed from: u */
                public Builder m90993u(Operation operation) {
                    operation.getClass();
                    this.f65436b |= 8;
                    this.f65440f = operation;
                    return this;
                }

                /* JADX INFO: renamed from: v */
                public Builder m90994v(int i) {
                    this.f65436b |= 2;
                    this.f65438d = i;
                    return this;
                }

                /* JADX INFO: renamed from: w */
                public Builder m90995w(int i) {
                    this.f65436b |= 1;
                    this.f65437c = i;
                    return this;
                }
            }

            public enum Operation implements Internal.EnumLite {
                NONE(0, 0),
                INTERNAL_TO_CLASS_ID(1, 1),
                DESC_TO_CLASS_ID(2, 2);

                private static Internal.EnumLiteMap<Operation> internalValueMap = new C15280a();
                private final int value;

                /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf$StringTableTypes$Record$Operation$a */
                public static class C15280a implements Internal.EnumLiteMap<Operation> {
                    @Override // kotlin.reflect.jvm.internal.impl.protobuf.Internal.EnumLiteMap
                    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                    public Operation findValueByNumber(int i) {
                        return Operation.valueOf(i);
                    }
                }

                Operation(int i, int i2) {
                    this.value = i2;
                }

                public static Operation valueOf(int i) {
                    if (i == 0) {
                        return NONE;
                    }
                    if (i == 1) {
                        return INTERNAL_TO_CLASS_ID;
                    }
                    if (i != 2) {
                        return null;
                    }
                    return DESC_TO_CLASS_ID;
                }

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.Internal.EnumLite
                public final int getNumber() {
                    return this.value;
                }
            }

            /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf$StringTableTypes$Record$a */
            public static class C15281a extends AbstractParser<Record> {
                @Override // kotlin.reflect.jvm.internal.impl.protobuf.Parser
                /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
                public Record mo90487d(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                    return new Record(codedInputStream, extensionRegistryLite);
                }
            }

            static {
                Record record = new Record(true);
                defaultInstance = record;
                record.initFields();
            }

            private Record(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                this.substringIndexMemoizedSerializedSize = -1;
                this.replaceCharMemoizedSerializedSize = -1;
                this.memoizedIsInitialized = (byte) -1;
                this.memoizedSerializedSize = -1;
                initFields();
                ByteString.Output outputM91150w = ByteString.m91150w();
                CodedOutputStream codedOutputStreamM91226K = CodedOutputStream.m91226K(outputM91150w, 1);
                boolean z = false;
                int i = 0;
                while (!z) {
                    try {
                        try {
                            int iM91185K = codedInputStream.m91185K();
                            if (iM91185K != 0) {
                                if (iM91185K == 8) {
                                    this.bitField0_ |= 1;
                                    this.range_ = codedInputStream.m91209s();
                                } else if (iM91185K == 16) {
                                    this.bitField0_ |= 2;
                                    this.predefinedIndex_ = codedInputStream.m91209s();
                                } else if (iM91185K == 24) {
                                    int iM91204n = codedInputStream.m91204n();
                                    Operation operationValueOf = Operation.valueOf(iM91204n);
                                    if (operationValueOf == null) {
                                        codedOutputStreamM91226K.m91291s0(iM91185K);
                                        codedOutputStreamM91226K.m91291s0(iM91204n);
                                    } else {
                                        this.bitField0_ |= 8;
                                        this.operation_ = operationValueOf;
                                    }
                                } else if (iM91185K == 32) {
                                    if ((i & 16) != 16) {
                                        this.substringIndex_ = new ArrayList();
                                        i |= 16;
                                    }
                                    this.substringIndex_.add(Integer.valueOf(codedInputStream.m91209s()));
                                } else if (iM91185K == 34) {
                                    int iM91200j = codedInputStream.m91200j(codedInputStream.m91176A());
                                    if ((i & 16) != 16 && codedInputStream.m91197e() > 0) {
                                        this.substringIndex_ = new ArrayList();
                                        i |= 16;
                                    }
                                    while (codedInputStream.m91197e() > 0) {
                                        this.substringIndex_.add(Integer.valueOf(codedInputStream.m91209s()));
                                    }
                                    codedInputStream.m91199i(iM91200j);
                                } else if (iM91185K == 40) {
                                    if ((i & 32) != 32) {
                                        this.replaceChar_ = new ArrayList();
                                        i |= 32;
                                    }
                                    this.replaceChar_.add(Integer.valueOf(codedInputStream.m91209s()));
                                } else if (iM91185K == 42) {
                                    int iM91200j2 = codedInputStream.m91200j(codedInputStream.m91176A());
                                    if ((i & 32) != 32 && codedInputStream.m91197e() > 0) {
                                        this.replaceChar_ = new ArrayList();
                                        i |= 32;
                                    }
                                    while (codedInputStream.m91197e() > 0) {
                                        this.replaceChar_.add(Integer.valueOf(codedInputStream.m91209s()));
                                    }
                                    codedInputStream.m91199i(iM91200j2);
                                } else if (iM91185K == 50) {
                                    ByteString byteStringM91202l = codedInputStream.m91202l();
                                    this.bitField0_ |= 4;
                                    this.string_ = byteStringM91202l;
                                } else if (!parseUnknownField(codedInputStream, codedOutputStreamM91226K, extensionRegistryLite, iM91185K)) {
                                }
                            }
                            z = true;
                        } catch (Throwable th) {
                            if ((i & 16) == 16) {
                                this.substringIndex_ = Collections.unmodifiableList(this.substringIndex_);
                            }
                            if ((i & 32) == 32) {
                                this.replaceChar_ = Collections.unmodifiableList(this.replaceChar_);
                            }
                            try {
                                codedOutputStreamM91226K.m91258J();
                            } catch (IOException unused) {
                            } finally {
                                this.unknownFields = outputM91150w.m91170m();
                            }
                            makeExtensionsImmutable();
                            throw th;
                        }
                    } catch (InvalidProtocolBufferException e) {
                        throw e.setUnfinishedMessage(this);
                    } catch (IOException e2) {
                        throw new InvalidProtocolBufferException(e2.getMessage()).setUnfinishedMessage(this);
                    }
                }
                if ((i & 16) == 16) {
                    this.substringIndex_ = Collections.unmodifiableList(this.substringIndex_);
                }
                if ((i & 32) == 32) {
                    this.replaceChar_ = Collections.unmodifiableList(this.replaceChar_);
                }
                try {
                    codedOutputStreamM91226K.m91258J();
                } catch (IOException unused2) {
                } finally {
                    this.unknownFields = outputM91150w.m91170m();
                }
                makeExtensionsImmutable();
            }

            public static Record getDefaultInstance() {
                return defaultInstance;
            }

            private void initFields() {
                this.range_ = 1;
                this.predefinedIndex_ = 0;
                this.string_ = "";
                this.operation_ = Operation.NONE;
                List<Integer> list = Collections.EMPTY_LIST;
                this.substringIndex_ = list;
                this.replaceChar_ = list;
            }

            public static Builder newBuilder(Record record) {
                return newBuilder().mo90458f(record);
            }

            public Operation getOperation() {
                return this.operation_;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
            public Parser<Record> getParserForType() {
                return PARSER;
            }

            public int getPredefinedIndex() {
                return this.predefinedIndex_;
            }

            public int getRange() {
                return this.range_;
            }

            public int getReplaceCharCount() {
                return this.replaceChar_.size();
            }

            public List<Integer> getReplaceCharList() {
                return this.replaceChar_;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
            public int getSerializedSize() {
                int i = this.memoizedSerializedSize;
                if (i != -1) {
                    return i;
                }
                int iM91243p = (this.bitField0_ & 1) == 1 ? CodedOutputStream.m91243p(1, this.range_) : 0;
                if ((this.bitField0_ & 2) == 2) {
                    iM91243p += CodedOutputStream.m91243p(2, this.predefinedIndex_);
                }
                if ((this.bitField0_ & 8) == 8) {
                    iM91243p += CodedOutputStream.m91236i(3, this.operation_.getNumber());
                }
                int iM91244q = 0;
                for (int i2 = 0; i2 < this.substringIndex_.size(); i2++) {
                    iM91244q += CodedOutputStream.m91244q(this.substringIndex_.get(i2).intValue());
                }
                int iM91244q2 = iM91243p + iM91244q;
                if (!getSubstringIndexList().isEmpty()) {
                    iM91244q2 = iM91244q2 + 1 + CodedOutputStream.m91244q(iM91244q);
                }
                this.substringIndexMemoizedSerializedSize = iM91244q;
                int iM91244q3 = 0;
                for (int i3 = 0; i3 < this.replaceChar_.size(); i3++) {
                    iM91244q3 += CodedOutputStream.m91244q(this.replaceChar_.get(i3).intValue());
                }
                int iM91232e = iM91244q2 + iM91244q3;
                if (!getReplaceCharList().isEmpty()) {
                    iM91232e = iM91232e + 1 + CodedOutputStream.m91244q(iM91244q3);
                }
                this.replaceCharMemoizedSerializedSize = iM91244q3;
                if ((this.bitField0_ & 4) == 4) {
                    iM91232e += CodedOutputStream.m91232e(6, getStringBytes());
                }
                int size = iM91232e + this.unknownFields.size();
                this.memoizedSerializedSize = size;
                return size;
            }

            public String getString() {
                Object obj = this.string_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                ByteString byteString = (ByteString) obj;
                String strM91153D = byteString.m91153D();
                if (byteString.mo91161r()) {
                    this.string_ = strM91153D;
                }
                return strM91153D;
            }

            public ByteString getStringBytes() {
                Object obj = this.string_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringM91149i = ByteString.m91149i((String) obj);
                this.string_ = byteStringM91149i;
                return byteStringM91149i;
            }

            public int getSubstringIndexCount() {
                return this.substringIndex_.size();
            }

            public List<Integer> getSubstringIndexList() {
                return this.substringIndex_;
            }

            public boolean hasOperation() {
                return (this.bitField0_ & 8) == 8;
            }

            public boolean hasPredefinedIndex() {
                return (this.bitField0_ & 2) == 2;
            }

            public boolean hasRange() {
                return (this.bitField0_ & 1) == 1;
            }

            public boolean hasString() {
                return (this.bitField0_ & 4) == 4;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                byte b = this.memoizedIsInitialized;
                if (b == 1) {
                    return true;
                }
                if (b == 0) {
                    return false;
                }
                this.memoizedIsInitialized = (byte) 1;
                return true;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
            public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
                getSerializedSize();
                if ((this.bitField0_ & 1) == 1) {
                    codedOutputStream.m91277e0(1, this.range_);
                }
                if ((this.bitField0_ & 2) == 2) {
                    codedOutputStream.m91277e0(2, this.predefinedIndex_);
                }
                if ((this.bitField0_ & 8) == 8) {
                    codedOutputStream.m91268W(3, this.operation_.getNumber());
                }
                if (getSubstringIndexList().size() > 0) {
                    codedOutputStream.m91291s0(34);
                    codedOutputStream.m91291s0(this.substringIndexMemoizedSerializedSize);
                }
                for (int i = 0; i < this.substringIndex_.size(); i++) {
                    codedOutputStream.m91278f0(this.substringIndex_.get(i).intValue());
                }
                if (getReplaceCharList().size() > 0) {
                    codedOutputStream.m91291s0(42);
                    codedOutputStream.m91291s0(this.replaceCharMemoizedSerializedSize);
                }
                for (int i2 = 0; i2 < this.replaceChar_.size(); i2++) {
                    codedOutputStream.m91278f0(this.replaceChar_.get(i2).intValue());
                }
                if ((this.bitField0_ & 4) == 4) {
                    codedOutputStream.m91264S(6, getStringBytes());
                }
                codedOutputStream.m91285m0(this.unknownFields);
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite
            public Record getDefaultInstanceForType() {
                return defaultInstance;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
            public Builder newBuilderForType() {
                return newBuilder();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
            public Builder toBuilder() {
                return newBuilder(this);
            }

            public static Builder newBuilder() {
                return Builder.m90984o();
            }

            private Record(GeneratedMessageLite.Builder builder) {
                super(builder);
                this.substringIndexMemoizedSerializedSize = -1;
                this.replaceCharMemoizedSerializedSize = -1;
                this.memoizedIsInitialized = (byte) -1;
                this.memoizedSerializedSize = -1;
                this.unknownFields = builder.m91332e();
            }

            private Record(boolean z) {
                this.substringIndexMemoizedSerializedSize = -1;
                this.replaceCharMemoizedSerializedSize = -1;
                this.memoizedIsInitialized = (byte) -1;
                this.memoizedSerializedSize = -1;
                this.unknownFields = ByteString.f65615a;
            }
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite
        public StringTableTypes getDefaultInstanceForType() {
            return defaultInstance;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public Builder newBuilderForType() {
            return newBuilder();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public Builder toBuilder() {
            return newBuilder(this);
        }

        public static Builder newBuilder() {
            return Builder.m90974o();
        }

        private StringTableTypes(GeneratedMessageLite.Builder builder) {
            super(builder);
            this.localNameMemoizedSerializedSize = -1;
            this.memoizedIsInitialized = (byte) -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = builder.m91332e();
        }

        private StringTableTypes(boolean z) {
            this.localNameMemoizedSerializedSize = -1;
            this.memoizedIsInitialized = (byte) -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = ByteString.f65615a;
        }
    }

    public static final class JvmFieldSignature extends GeneratedMessageLite implements JvmFieldSignatureOrBuilder {
        public static Parser<JvmFieldSignature> PARSER = new C15277a();
        private static final JvmFieldSignature defaultInstance;
        private int bitField0_;
        private int desc_;
        private byte memoizedIsInitialized;
        private int memoizedSerializedSize;
        private int name_;
        private final ByteString unknownFields;

        public static final class Builder extends GeneratedMessageLite.Builder<JvmFieldSignature, Builder> implements JvmFieldSignatureOrBuilder {

            /* JADX INFO: renamed from: b */
            public int f65421b;

            /* JADX INFO: renamed from: c */
            public int f65422c;

            /* JADX INFO: renamed from: d */
            public int f65423d;

            private Builder() {
                m90939p();
            }

            /* JADX INFO: renamed from: o */
            public static Builder m90938o() {
                return new Builder();
            }

            /* JADX INFO: renamed from: p */
            private void m90939p() {
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
            public JvmFieldSignature build() {
                JvmFieldSignature jvmFieldSignatureM90941m = m90941m();
                if (jvmFieldSignatureM90941m.isInitialized()) {
                    return jvmFieldSignatureM90941m;
                }
                throw AbstractMessageLite.Builder.m91133c(jvmFieldSignatureM90941m);
            }

            /* JADX INFO: renamed from: m */
            public JvmFieldSignature m90941m() {
                JvmFieldSignature jvmFieldSignature = new JvmFieldSignature(this);
                int i = this.f65421b;
                int i2 = (i & 1) != 1 ? 0 : 1;
                jvmFieldSignature.name_ = this.f65422c;
                if ((i & 2) == 2) {
                    i2 |= 2;
                }
                jvmFieldSignature.desc_ = this.f65423d;
                jvmFieldSignature.bitField0_ = i2;
                return jvmFieldSignature;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder
            /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
            public Builder mo90523m() {
                return m90938o().mo90458f(m90941m());
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder
            /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
            public Builder mo90458f(JvmFieldSignature jvmFieldSignature) {
                if (jvmFieldSignature == JvmFieldSignature.getDefaultInstance()) {
                    return this;
                }
                if (jvmFieldSignature.hasName()) {
                    m90946t(jvmFieldSignature.getName());
                }
                if (jvmFieldSignature.hasDesc()) {
                    m90945s(jvmFieldSignature.getDesc());
                }
                m91333j(m91332e().m91156c(jvmFieldSignature.unknownFields));
                return this;
            }

            /* JADX WARN: Code duplicated, block: B:15:0x001d  */
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
            public Builder mo90459i(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws Throwable {
                JvmFieldSignature jvmFieldSignature = null;
                try {
                    try {
                        JvmFieldSignature jvmFieldSignatureMo90487d = JvmFieldSignature.PARSER.mo90487d(codedInputStream, extensionRegistryLite);
                        if (jvmFieldSignatureMo90487d != null) {
                            mo90458f(jvmFieldSignatureMo90487d);
                        }
                        return this;
                    } catch (InvalidProtocolBufferException e) {
                        JvmFieldSignature jvmFieldSignature2 = (JvmFieldSignature) e.getUnfinishedMessage();
                        try {
                            throw e;
                        } catch (Throwable th) {
                            th = th;
                            jvmFieldSignature = jvmFieldSignature2;
                            if (jvmFieldSignature != null) {
                                mo90458f(jvmFieldSignature);
                            }
                            throw th;
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                    if (jvmFieldSignature != null) {
                        mo90458f(jvmFieldSignature);
                    }
                    throw th;
                }
            }

            /* JADX INFO: renamed from: s */
            public Builder m90945s(int i) {
                this.f65421b |= 2;
                this.f65423d = i;
                return this;
            }

            /* JADX INFO: renamed from: t */
            public Builder m90946t(int i) {
                this.f65421b |= 1;
                this.f65422c = i;
                return this;
            }
        }

        /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf$JvmFieldSignature$a */
        public static class C15277a extends AbstractParser<JvmFieldSignature> {
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.Parser
            /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
            public JvmFieldSignature mo90487d(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return new JvmFieldSignature(codedInputStream, extensionRegistryLite);
            }
        }

        static {
            JvmFieldSignature jvmFieldSignature = new JvmFieldSignature(true);
            defaultInstance = jvmFieldSignature;
            jvmFieldSignature.initFields();
        }

        private JvmFieldSignature(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            this.memoizedIsInitialized = (byte) -1;
            this.memoizedSerializedSize = -1;
            initFields();
            ByteString.Output outputM91150w = ByteString.m91150w();
            CodedOutputStream codedOutputStreamM91226K = CodedOutputStream.m91226K(outputM91150w, 1);
            boolean z = false;
            while (!z) {
                try {
                    try {
                        int iM91185K = codedInputStream.m91185K();
                        if (iM91185K != 0) {
                            if (iM91185K == 8) {
                                this.bitField0_ |= 1;
                                this.name_ = codedInputStream.m91209s();
                            } else if (iM91185K == 16) {
                                this.bitField0_ |= 2;
                                this.desc_ = codedInputStream.m91209s();
                            } else if (!parseUnknownField(codedInputStream, codedOutputStreamM91226K, extensionRegistryLite, iM91185K)) {
                            }
                        }
                        z = true;
                    } catch (Throwable th) {
                        try {
                            codedOutputStreamM91226K.m91258J();
                        } catch (IOException unused) {
                        } finally {
                            this.unknownFields = outputM91150w.m91170m();
                        }
                        makeExtensionsImmutable();
                        throw th;
                    }
                } catch (InvalidProtocolBufferException e) {
                    throw e.setUnfinishedMessage(this);
                } catch (IOException e2) {
                    throw new InvalidProtocolBufferException(e2.getMessage()).setUnfinishedMessage(this);
                }
            }
            try {
                codedOutputStreamM91226K.m91258J();
            } catch (IOException unused2) {
            } finally {
                this.unknownFields = outputM91150w.m91170m();
            }
            makeExtensionsImmutable();
        }

        public static JvmFieldSignature getDefaultInstance() {
            return defaultInstance;
        }

        private void initFields() {
            this.name_ = 0;
            this.desc_ = 0;
        }

        public static Builder newBuilder(JvmFieldSignature jvmFieldSignature) {
            return newBuilder().mo90458f(jvmFieldSignature);
        }

        public int getDesc() {
            return this.desc_;
        }

        public int getName() {
            return this.name_;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public Parser<JvmFieldSignature> getParserForType() {
            return PARSER;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int iM91243p = (this.bitField0_ & 1) == 1 ? CodedOutputStream.m91243p(1, this.name_) : 0;
            if ((this.bitField0_ & 2) == 2) {
                iM91243p += CodedOutputStream.m91243p(2, this.desc_);
            }
            int size = iM91243p + this.unknownFields.size();
            this.memoizedSerializedSize = size;
            return size;
        }

        public boolean hasDesc() {
            return (this.bitField0_ & 2) == 2;
        }

        public boolean hasName() {
            return (this.bitField0_ & 1) == 1;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            byte b = this.memoizedIsInitialized;
            if (b == 1) {
                return true;
            }
            if (b == 0) {
                return false;
            }
            this.memoizedIsInitialized = (byte) 1;
            return true;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            getSerializedSize();
            if ((this.bitField0_ & 1) == 1) {
                codedOutputStream.m91277e0(1, this.name_);
            }
            if ((this.bitField0_ & 2) == 2) {
                codedOutputStream.m91277e0(2, this.desc_);
            }
            codedOutputStream.m91285m0(this.unknownFields);
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite
        public JvmFieldSignature getDefaultInstanceForType() {
            return defaultInstance;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public Builder newBuilderForType() {
            return newBuilder();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public Builder toBuilder() {
            return newBuilder(this);
        }

        public static Builder newBuilder() {
            return Builder.m90938o();
        }

        private JvmFieldSignature(GeneratedMessageLite.Builder builder) {
            super(builder);
            this.memoizedIsInitialized = (byte) -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = builder.m91332e();
        }

        private JvmFieldSignature(boolean z) {
            this.memoizedIsInitialized = (byte) -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = ByteString.f65615a;
        }
    }

    public static final class JvmMethodSignature extends GeneratedMessageLite implements JvmMethodSignatureOrBuilder {
        public static Parser<JvmMethodSignature> PARSER = new C15278a();
        private static final JvmMethodSignature defaultInstance;
        private int bitField0_;
        private int desc_;
        private byte memoizedIsInitialized;
        private int memoizedSerializedSize;
        private int name_;
        private final ByteString unknownFields;

        public static final class Builder extends GeneratedMessageLite.Builder<JvmMethodSignature, Builder> implements JvmMethodSignatureOrBuilder {

            /* JADX INFO: renamed from: b */
            public int f65424b;

            /* JADX INFO: renamed from: c */
            public int f65425c;

            /* JADX INFO: renamed from: d */
            public int f65426d;

            private Builder() {
                m90950p();
            }

            /* JADX INFO: renamed from: o */
            public static Builder m90949o() {
                return new Builder();
            }

            /* JADX INFO: renamed from: p */
            private void m90950p() {
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
            public JvmMethodSignature build() {
                JvmMethodSignature jvmMethodSignatureM90952m = m90952m();
                if (jvmMethodSignatureM90952m.isInitialized()) {
                    return jvmMethodSignatureM90952m;
                }
                throw AbstractMessageLite.Builder.m91133c(jvmMethodSignatureM90952m);
            }

            /* JADX INFO: renamed from: m */
            public JvmMethodSignature m90952m() {
                JvmMethodSignature jvmMethodSignature = new JvmMethodSignature(this);
                int i = this.f65424b;
                int i2 = (i & 1) != 1 ? 0 : 1;
                jvmMethodSignature.name_ = this.f65425c;
                if ((i & 2) == 2) {
                    i2 |= 2;
                }
                jvmMethodSignature.desc_ = this.f65426d;
                jvmMethodSignature.bitField0_ = i2;
                return jvmMethodSignature;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder
            /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
            public Builder mo90523m() {
                return m90949o().mo90458f(m90952m());
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder
            /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
            public Builder mo90458f(JvmMethodSignature jvmMethodSignature) {
                if (jvmMethodSignature == JvmMethodSignature.getDefaultInstance()) {
                    return this;
                }
                if (jvmMethodSignature.hasName()) {
                    m90957t(jvmMethodSignature.getName());
                }
                if (jvmMethodSignature.hasDesc()) {
                    m90956s(jvmMethodSignature.getDesc());
                }
                m91333j(m91332e().m91156c(jvmMethodSignature.unknownFields));
                return this;
            }

            /* JADX WARN: Code duplicated, block: B:15:0x001d  */
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
            public Builder mo90459i(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws Throwable {
                JvmMethodSignature jvmMethodSignature = null;
                try {
                    try {
                        JvmMethodSignature jvmMethodSignatureMo90487d = JvmMethodSignature.PARSER.mo90487d(codedInputStream, extensionRegistryLite);
                        if (jvmMethodSignatureMo90487d != null) {
                            mo90458f(jvmMethodSignatureMo90487d);
                        }
                        return this;
                    } catch (InvalidProtocolBufferException e) {
                        JvmMethodSignature jvmMethodSignature2 = (JvmMethodSignature) e.getUnfinishedMessage();
                        try {
                            throw e;
                        } catch (Throwable th) {
                            th = th;
                            jvmMethodSignature = jvmMethodSignature2;
                            if (jvmMethodSignature != null) {
                                mo90458f(jvmMethodSignature);
                            }
                            throw th;
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                    if (jvmMethodSignature != null) {
                        mo90458f(jvmMethodSignature);
                    }
                    throw th;
                }
            }

            /* JADX INFO: renamed from: s */
            public Builder m90956s(int i) {
                this.f65424b |= 2;
                this.f65426d = i;
                return this;
            }

            /* JADX INFO: renamed from: t */
            public Builder m90957t(int i) {
                this.f65424b |= 1;
                this.f65425c = i;
                return this;
            }
        }

        /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf$JvmMethodSignature$a */
        public static class C15278a extends AbstractParser<JvmMethodSignature> {
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.Parser
            /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
            public JvmMethodSignature mo90487d(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return new JvmMethodSignature(codedInputStream, extensionRegistryLite);
            }
        }

        static {
            JvmMethodSignature jvmMethodSignature = new JvmMethodSignature(true);
            defaultInstance = jvmMethodSignature;
            jvmMethodSignature.initFields();
        }

        private JvmMethodSignature(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            this.memoizedIsInitialized = (byte) -1;
            this.memoizedSerializedSize = -1;
            initFields();
            ByteString.Output outputM91150w = ByteString.m91150w();
            CodedOutputStream codedOutputStreamM91226K = CodedOutputStream.m91226K(outputM91150w, 1);
            boolean z = false;
            while (!z) {
                try {
                    try {
                        int iM91185K = codedInputStream.m91185K();
                        if (iM91185K != 0) {
                            if (iM91185K == 8) {
                                this.bitField0_ |= 1;
                                this.name_ = codedInputStream.m91209s();
                            } else if (iM91185K == 16) {
                                this.bitField0_ |= 2;
                                this.desc_ = codedInputStream.m91209s();
                            } else if (!parseUnknownField(codedInputStream, codedOutputStreamM91226K, extensionRegistryLite, iM91185K)) {
                            }
                        }
                        z = true;
                    } catch (Throwable th) {
                        try {
                            codedOutputStreamM91226K.m91258J();
                        } catch (IOException unused) {
                        } finally {
                            this.unknownFields = outputM91150w.m91170m();
                        }
                        makeExtensionsImmutable();
                        throw th;
                    }
                } catch (InvalidProtocolBufferException e) {
                    throw e.setUnfinishedMessage(this);
                } catch (IOException e2) {
                    throw new InvalidProtocolBufferException(e2.getMessage()).setUnfinishedMessage(this);
                }
            }
            try {
                codedOutputStreamM91226K.m91258J();
            } catch (IOException unused2) {
            } finally {
                this.unknownFields = outputM91150w.m91170m();
            }
            makeExtensionsImmutable();
        }

        public static JvmMethodSignature getDefaultInstance() {
            return defaultInstance;
        }

        private void initFields() {
            this.name_ = 0;
            this.desc_ = 0;
        }

        public static Builder newBuilder(JvmMethodSignature jvmMethodSignature) {
            return newBuilder().mo90458f(jvmMethodSignature);
        }

        public int getDesc() {
            return this.desc_;
        }

        public int getName() {
            return this.name_;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public Parser<JvmMethodSignature> getParserForType() {
            return PARSER;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int iM91243p = (this.bitField0_ & 1) == 1 ? CodedOutputStream.m91243p(1, this.name_) : 0;
            if ((this.bitField0_ & 2) == 2) {
                iM91243p += CodedOutputStream.m91243p(2, this.desc_);
            }
            int size = iM91243p + this.unknownFields.size();
            this.memoizedSerializedSize = size;
            return size;
        }

        public boolean hasDesc() {
            return (this.bitField0_ & 2) == 2;
        }

        public boolean hasName() {
            return (this.bitField0_ & 1) == 1;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            byte b = this.memoizedIsInitialized;
            if (b == 1) {
                return true;
            }
            if (b == 0) {
                return false;
            }
            this.memoizedIsInitialized = (byte) 1;
            return true;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            getSerializedSize();
            if ((this.bitField0_ & 1) == 1) {
                codedOutputStream.m91277e0(1, this.name_);
            }
            if ((this.bitField0_ & 2) == 2) {
                codedOutputStream.m91277e0(2, this.desc_);
            }
            codedOutputStream.m91285m0(this.unknownFields);
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite
        public JvmMethodSignature getDefaultInstanceForType() {
            return defaultInstance;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public Builder newBuilderForType() {
            return newBuilder();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public Builder toBuilder() {
            return newBuilder(this);
        }

        public static Builder newBuilder() {
            return Builder.m90949o();
        }

        private JvmMethodSignature(GeneratedMessageLite.Builder builder) {
            super(builder);
            this.memoizedIsInitialized = (byte) -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = builder.m91332e();
        }

        private JvmMethodSignature(boolean z) {
            this.memoizedIsInitialized = (byte) -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = ByteString.f65615a;
        }
    }

    public static final class JvmPropertySignature extends GeneratedMessageLite implements JvmPropertySignatureOrBuilder {
        public static Parser<JvmPropertySignature> PARSER = new C15279a();
        private static final JvmPropertySignature defaultInstance;
        private int bitField0_;
        private JvmMethodSignature delegateMethod_;
        private JvmFieldSignature field_;
        private JvmMethodSignature getter_;
        private byte memoizedIsInitialized;
        private int memoizedSerializedSize;
        private JvmMethodSignature setter_;
        private JvmMethodSignature syntheticMethod_;
        private final ByteString unknownFields;

        public static final class Builder extends GeneratedMessageLite.Builder<JvmPropertySignature, Builder> implements JvmPropertySignatureOrBuilder {

            /* JADX INFO: renamed from: b */
            public int f65427b;

            /* JADX INFO: renamed from: c */
            public JvmFieldSignature f65428c = JvmFieldSignature.getDefaultInstance();

            /* JADX INFO: renamed from: d */
            public JvmMethodSignature f65429d = JvmMethodSignature.getDefaultInstance();

            /* JADX INFO: renamed from: e */
            public JvmMethodSignature f65430e = JvmMethodSignature.getDefaultInstance();

            /* JADX INFO: renamed from: f */
            public JvmMethodSignature f65431f = JvmMethodSignature.getDefaultInstance();

            /* JADX INFO: renamed from: g */
            public JvmMethodSignature f65432g = JvmMethodSignature.getDefaultInstance();

            private Builder() {
                m90961p();
            }

            /* JADX INFO: renamed from: o */
            public static Builder m90960o() {
                return new Builder();
            }

            /* JADX INFO: renamed from: p */
            private void m90961p() {
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
            public JvmPropertySignature build() {
                JvmPropertySignature jvmPropertySignatureM90963m = m90963m();
                if (jvmPropertySignatureM90963m.isInitialized()) {
                    return jvmPropertySignatureM90963m;
                }
                throw AbstractMessageLite.Builder.m91133c(jvmPropertySignatureM90963m);
            }

            /* JADX INFO: renamed from: m */
            public JvmPropertySignature m90963m() {
                JvmPropertySignature jvmPropertySignature = new JvmPropertySignature(this);
                int i = this.f65427b;
                int i2 = (i & 1) != 1 ? 0 : 1;
                jvmPropertySignature.field_ = this.f65428c;
                if ((i & 2) == 2) {
                    i2 |= 2;
                }
                jvmPropertySignature.syntheticMethod_ = this.f65429d;
                if ((i & 4) == 4) {
                    i2 |= 4;
                }
                jvmPropertySignature.getter_ = this.f65430e;
                if ((i & 8) == 8) {
                    i2 |= 8;
                }
                jvmPropertySignature.setter_ = this.f65431f;
                if ((i & 16) == 16) {
                    i2 |= 16;
                }
                jvmPropertySignature.delegateMethod_ = this.f65432g;
                jvmPropertySignature.bitField0_ = i2;
                return jvmPropertySignature;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder
            /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
            public Builder mo90523m() {
                return m90960o().mo90458f(m90963m());
            }

            /* JADX INFO: renamed from: q */
            public Builder m90965q(JvmMethodSignature jvmMethodSignature) {
                if ((this.f65427b & 16) != 16 || this.f65432g == JvmMethodSignature.getDefaultInstance()) {
                    this.f65432g = jvmMethodSignature;
                } else {
                    this.f65432g = JvmMethodSignature.newBuilder(this.f65432g).mo90458f(jvmMethodSignature).m90952m();
                }
                this.f65427b |= 16;
                return this;
            }

            /* JADX INFO: renamed from: r */
            public Builder m90966r(JvmFieldSignature jvmFieldSignature) {
                if ((this.f65427b & 1) != 1 || this.f65428c == JvmFieldSignature.getDefaultInstance()) {
                    this.f65428c = jvmFieldSignature;
                } else {
                    this.f65428c = JvmFieldSignature.newBuilder(this.f65428c).mo90458f(jvmFieldSignature).m90941m();
                }
                this.f65427b |= 1;
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder
            /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
            public Builder mo90458f(JvmPropertySignature jvmPropertySignature) {
                if (jvmPropertySignature == JvmPropertySignature.getDefaultInstance()) {
                    return this;
                }
                if (jvmPropertySignature.hasField()) {
                    m90966r(jvmPropertySignature.getField());
                }
                if (jvmPropertySignature.hasSyntheticMethod()) {
                    m90971w(jvmPropertySignature.getSyntheticMethod());
                }
                if (jvmPropertySignature.hasGetter()) {
                    m90969u(jvmPropertySignature.getGetter());
                }
                if (jvmPropertySignature.hasSetter()) {
                    m90970v(jvmPropertySignature.getSetter());
                }
                if (jvmPropertySignature.hasDelegateMethod()) {
                    m90965q(jvmPropertySignature.getDelegateMethod());
                }
                m91333j(m91332e().m91156c(jvmPropertySignature.unknownFields));
                return this;
            }

            /* JADX WARN: Code duplicated, block: B:15:0x001d  */
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
            public Builder mo90459i(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws Throwable {
                JvmPropertySignature jvmPropertySignature = null;
                try {
                    try {
                        JvmPropertySignature jvmPropertySignatureMo90487d = JvmPropertySignature.PARSER.mo90487d(codedInputStream, extensionRegistryLite);
                        if (jvmPropertySignatureMo90487d != null) {
                            mo90458f(jvmPropertySignatureMo90487d);
                        }
                        return this;
                    } catch (InvalidProtocolBufferException e) {
                        JvmPropertySignature jvmPropertySignature2 = (JvmPropertySignature) e.getUnfinishedMessage();
                        try {
                            throw e;
                        } catch (Throwable th) {
                            th = th;
                            jvmPropertySignature = jvmPropertySignature2;
                            if (jvmPropertySignature != null) {
                                mo90458f(jvmPropertySignature);
                            }
                            throw th;
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                    if (jvmPropertySignature != null) {
                        mo90458f(jvmPropertySignature);
                    }
                    throw th;
                }
            }

            /* JADX INFO: renamed from: u */
            public Builder m90969u(JvmMethodSignature jvmMethodSignature) {
                if ((this.f65427b & 4) != 4 || this.f65430e == JvmMethodSignature.getDefaultInstance()) {
                    this.f65430e = jvmMethodSignature;
                } else {
                    this.f65430e = JvmMethodSignature.newBuilder(this.f65430e).mo90458f(jvmMethodSignature).m90952m();
                }
                this.f65427b |= 4;
                return this;
            }

            /* JADX INFO: renamed from: v */
            public Builder m90970v(JvmMethodSignature jvmMethodSignature) {
                if ((this.f65427b & 8) != 8 || this.f65431f == JvmMethodSignature.getDefaultInstance()) {
                    this.f65431f = jvmMethodSignature;
                } else {
                    this.f65431f = JvmMethodSignature.newBuilder(this.f65431f).mo90458f(jvmMethodSignature).m90952m();
                }
                this.f65427b |= 8;
                return this;
            }

            /* JADX INFO: renamed from: w */
            public Builder m90971w(JvmMethodSignature jvmMethodSignature) {
                if ((this.f65427b & 2) != 2 || this.f65429d == JvmMethodSignature.getDefaultInstance()) {
                    this.f65429d = jvmMethodSignature;
                } else {
                    this.f65429d = JvmMethodSignature.newBuilder(this.f65429d).mo90458f(jvmMethodSignature).m90952m();
                }
                this.f65427b |= 2;
                return this;
            }
        }

        /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf$JvmPropertySignature$a */
        public static class C15279a extends AbstractParser<JvmPropertySignature> {
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.Parser
            /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
            public JvmPropertySignature mo90487d(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return new JvmPropertySignature(codedInputStream, extensionRegistryLite);
            }
        }

        static {
            JvmPropertySignature jvmPropertySignature = new JvmPropertySignature(true);
            defaultInstance = jvmPropertySignature;
            jvmPropertySignature.initFields();
        }

        private JvmPropertySignature(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            this.memoizedIsInitialized = (byte) -1;
            this.memoizedSerializedSize = -1;
            initFields();
            ByteString.Output outputM91150w = ByteString.m91150w();
            CodedOutputStream codedOutputStreamM91226K = CodedOutputStream.m91226K(outputM91150w, 1);
            boolean z = false;
            while (!z) {
                try {
                    try {
                        int iM91185K = codedInputStream.m91185K();
                        if (iM91185K != 0) {
                            if (iM91185K == 10) {
                                JvmFieldSignature.Builder builder = (this.bitField0_ & 1) == 1 ? this.field_.toBuilder() : null;
                                JvmFieldSignature jvmFieldSignature = (JvmFieldSignature) codedInputStream.m91211u(JvmFieldSignature.PARSER, extensionRegistryLite);
                                this.field_ = jvmFieldSignature;
                                if (builder != null) {
                                    builder.mo90458f(jvmFieldSignature);
                                    this.field_ = builder.m90941m();
                                }
                                this.bitField0_ |= 1;
                            } else if (iM91185K == 18) {
                                JvmMethodSignature.Builder builder2 = (this.bitField0_ & 2) == 2 ? this.syntheticMethod_.toBuilder() : null;
                                JvmMethodSignature jvmMethodSignature = (JvmMethodSignature) codedInputStream.m91211u(JvmMethodSignature.PARSER, extensionRegistryLite);
                                this.syntheticMethod_ = jvmMethodSignature;
                                if (builder2 != null) {
                                    builder2.mo90458f(jvmMethodSignature);
                                    this.syntheticMethod_ = builder2.m90952m();
                                }
                                this.bitField0_ |= 2;
                            } else if (iM91185K == 26) {
                                JvmMethodSignature.Builder builder3 = (this.bitField0_ & 4) == 4 ? this.getter_.toBuilder() : null;
                                JvmMethodSignature jvmMethodSignature2 = (JvmMethodSignature) codedInputStream.m91211u(JvmMethodSignature.PARSER, extensionRegistryLite);
                                this.getter_ = jvmMethodSignature2;
                                if (builder3 != null) {
                                    builder3.mo90458f(jvmMethodSignature2);
                                    this.getter_ = builder3.m90952m();
                                }
                                this.bitField0_ |= 4;
                            } else if (iM91185K == 34) {
                                JvmMethodSignature.Builder builder4 = (this.bitField0_ & 8) == 8 ? this.setter_.toBuilder() : null;
                                JvmMethodSignature jvmMethodSignature3 = (JvmMethodSignature) codedInputStream.m91211u(JvmMethodSignature.PARSER, extensionRegistryLite);
                                this.setter_ = jvmMethodSignature3;
                                if (builder4 != null) {
                                    builder4.mo90458f(jvmMethodSignature3);
                                    this.setter_ = builder4.m90952m();
                                }
                                this.bitField0_ |= 8;
                            } else if (iM91185K == 42) {
                                JvmMethodSignature.Builder builder5 = (this.bitField0_ & 16) == 16 ? this.delegateMethod_.toBuilder() : null;
                                JvmMethodSignature jvmMethodSignature4 = (JvmMethodSignature) codedInputStream.m91211u(JvmMethodSignature.PARSER, extensionRegistryLite);
                                this.delegateMethod_ = jvmMethodSignature4;
                                if (builder5 != null) {
                                    builder5.mo90458f(jvmMethodSignature4);
                                    this.delegateMethod_ = builder5.m90952m();
                                }
                                this.bitField0_ |= 16;
                            } else if (!parseUnknownField(codedInputStream, codedOutputStreamM91226K, extensionRegistryLite, iM91185K)) {
                            }
                        }
                        z = true;
                    } catch (Throwable th) {
                        try {
                            codedOutputStreamM91226K.m91258J();
                        } catch (IOException unused) {
                        } finally {
                            this.unknownFields = outputM91150w.m91170m();
                        }
                        makeExtensionsImmutable();
                        throw th;
                    }
                } catch (InvalidProtocolBufferException e) {
                    throw e.setUnfinishedMessage(this);
                } catch (IOException e2) {
                    throw new InvalidProtocolBufferException(e2.getMessage()).setUnfinishedMessage(this);
                }
            }
            try {
                codedOutputStreamM91226K.m91258J();
            } catch (IOException unused2) {
            } finally {
                this.unknownFields = outputM91150w.m91170m();
            }
            makeExtensionsImmutable();
        }

        public static JvmPropertySignature getDefaultInstance() {
            return defaultInstance;
        }

        private void initFields() {
            this.field_ = JvmFieldSignature.getDefaultInstance();
            this.syntheticMethod_ = JvmMethodSignature.getDefaultInstance();
            this.getter_ = JvmMethodSignature.getDefaultInstance();
            this.setter_ = JvmMethodSignature.getDefaultInstance();
            this.delegateMethod_ = JvmMethodSignature.getDefaultInstance();
        }

        public static Builder newBuilder(JvmPropertySignature jvmPropertySignature) {
            return newBuilder().mo90458f(jvmPropertySignature);
        }

        public JvmMethodSignature getDelegateMethod() {
            return this.delegateMethod_;
        }

        public JvmFieldSignature getField() {
            return this.field_;
        }

        public JvmMethodSignature getGetter() {
            return this.getter_;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public Parser<JvmPropertySignature> getParserForType() {
            return PARSER;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int iM91247t = (this.bitField0_ & 1) == 1 ? CodedOutputStream.m91247t(1, this.field_) : 0;
            if ((this.bitField0_ & 2) == 2) {
                iM91247t += CodedOutputStream.m91247t(2, this.syntheticMethod_);
            }
            if ((this.bitField0_ & 4) == 4) {
                iM91247t += CodedOutputStream.m91247t(3, this.getter_);
            }
            if ((this.bitField0_ & 8) == 8) {
                iM91247t += CodedOutputStream.m91247t(4, this.setter_);
            }
            if ((this.bitField0_ & 16) == 16) {
                iM91247t += CodedOutputStream.m91247t(5, this.delegateMethod_);
            }
            int size = iM91247t + this.unknownFields.size();
            this.memoizedSerializedSize = size;
            return size;
        }

        public JvmMethodSignature getSetter() {
            return this.setter_;
        }

        public JvmMethodSignature getSyntheticMethod() {
            return this.syntheticMethod_;
        }

        public boolean hasDelegateMethod() {
            return (this.bitField0_ & 16) == 16;
        }

        public boolean hasField() {
            return (this.bitField0_ & 1) == 1;
        }

        public boolean hasGetter() {
            return (this.bitField0_ & 4) == 4;
        }

        public boolean hasSetter() {
            return (this.bitField0_ & 8) == 8;
        }

        public boolean hasSyntheticMethod() {
            return (this.bitField0_ & 2) == 2;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            byte b = this.memoizedIsInitialized;
            if (b == 1) {
                return true;
            }
            if (b == 0) {
                return false;
            }
            this.memoizedIsInitialized = (byte) 1;
            return true;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            getSerializedSize();
            if ((this.bitField0_ & 1) == 1) {
                codedOutputStream.m91280h0(1, this.field_);
            }
            if ((this.bitField0_ & 2) == 2) {
                codedOutputStream.m91280h0(2, this.syntheticMethod_);
            }
            if ((this.bitField0_ & 4) == 4) {
                codedOutputStream.m91280h0(3, this.getter_);
            }
            if ((this.bitField0_ & 8) == 8) {
                codedOutputStream.m91280h0(4, this.setter_);
            }
            if ((this.bitField0_ & 16) == 16) {
                codedOutputStream.m91280h0(5, this.delegateMethod_);
            }
            codedOutputStream.m91285m0(this.unknownFields);
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite
        public JvmPropertySignature getDefaultInstanceForType() {
            return defaultInstance;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public Builder newBuilderForType() {
            return newBuilder();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public Builder toBuilder() {
            return newBuilder(this);
        }

        public static Builder newBuilder() {
            return Builder.m90960o();
        }

        private JvmPropertySignature(GeneratedMessageLite.Builder builder) {
            super(builder);
            this.memoizedIsInitialized = (byte) -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = builder.m91332e();
        }

        private JvmPropertySignature(boolean z) {
            this.memoizedIsInitialized = (byte) -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = ByteString.f65615a;
        }
    }
}
