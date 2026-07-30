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
    public static final GeneratedMessageLite.GeneratedExtension<ProtoBuf.Constructor, JvmMethodSignature> f66081a;

    /* JADX INFO: renamed from: b */
    public static final GeneratedMessageLite.GeneratedExtension<ProtoBuf.Function, JvmMethodSignature> f66082b;

    /* JADX INFO: renamed from: c */
    public static final GeneratedMessageLite.GeneratedExtension<ProtoBuf.Function, Integer> f66083c;

    /* JADX INFO: renamed from: d */
    public static final GeneratedMessageLite.GeneratedExtension<ProtoBuf.Property, JvmPropertySignature> f66084d;

    /* JADX INFO: renamed from: e */
    public static final GeneratedMessageLite.GeneratedExtension<ProtoBuf.Property, Integer> f66085e;

    /* JADX INFO: renamed from: f */
    public static final GeneratedMessageLite.GeneratedExtension<ProtoBuf.Type, List<ProtoBuf.Annotation>> f66086f;

    /* JADX INFO: renamed from: g */
    public static final GeneratedMessageLite.GeneratedExtension<ProtoBuf.Type, Boolean> f66087g;

    /* JADX INFO: renamed from: h */
    public static final GeneratedMessageLite.GeneratedExtension<ProtoBuf.TypeParameter, List<ProtoBuf.Annotation>> f66088h;

    /* JADX INFO: renamed from: i */
    public static final GeneratedMessageLite.GeneratedExtension<ProtoBuf.Class, Integer> f66089i;

    /* JADX INFO: renamed from: j */
    public static final GeneratedMessageLite.GeneratedExtension<ProtoBuf.Class, List<ProtoBuf.Property>> f66090j;

    /* JADX INFO: renamed from: k */
    public static final GeneratedMessageLite.GeneratedExtension<ProtoBuf.Class, Integer> f66091k;

    /* JADX INFO: renamed from: l */
    public static final GeneratedMessageLite.GeneratedExtension<ProtoBuf.Class, Integer> f66092l;

    /* JADX INFO: renamed from: m */
    public static final GeneratedMessageLite.GeneratedExtension<ProtoBuf.Package, Integer> f66093m;

    /* JADX INFO: renamed from: n */
    public static final GeneratedMessageLite.GeneratedExtension<ProtoBuf.Package, List<ProtoBuf.Property>> f66094n;

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
        f66081a = GeneratedMessageLite.newSingularGeneratedExtension(defaultInstance, defaultInstance2, defaultInstance3, null, 100, fieldType, JvmMethodSignature.class);
        f66082b = GeneratedMessageLite.newSingularGeneratedExtension(ProtoBuf.Function.getDefaultInstance(), JvmMethodSignature.getDefaultInstance(), JvmMethodSignature.getDefaultInstance(), null, 100, fieldType, JvmMethodSignature.class);
        ProtoBuf.Function defaultInstance4 = ProtoBuf.Function.getDefaultInstance();
        WireFormat.FieldType fieldType2 = WireFormat.FieldType.INT32;
        f66083c = GeneratedMessageLite.newSingularGeneratedExtension(defaultInstance4, 0, null, null, 101, fieldType2, Integer.class);
        f66084d = GeneratedMessageLite.newSingularGeneratedExtension(ProtoBuf.Property.getDefaultInstance(), JvmPropertySignature.getDefaultInstance(), JvmPropertySignature.getDefaultInstance(), null, 100, fieldType, JvmPropertySignature.class);
        f66085e = GeneratedMessageLite.newSingularGeneratedExtension(ProtoBuf.Property.getDefaultInstance(), 0, null, null, 101, fieldType2, Integer.class);
        f66086f = GeneratedMessageLite.newRepeatedGeneratedExtension(ProtoBuf.Type.getDefaultInstance(), ProtoBuf.Annotation.getDefaultInstance(), null, 100, fieldType, false, ProtoBuf.Annotation.class);
        f66087g = GeneratedMessageLite.newSingularGeneratedExtension(ProtoBuf.Type.getDefaultInstance(), Boolean.FALSE, null, null, 101, WireFormat.FieldType.BOOL, Boolean.class);
        f66088h = GeneratedMessageLite.newRepeatedGeneratedExtension(ProtoBuf.TypeParameter.getDefaultInstance(), ProtoBuf.Annotation.getDefaultInstance(), null, 100, fieldType, false, ProtoBuf.Annotation.class);
        f66089i = GeneratedMessageLite.newSingularGeneratedExtension(ProtoBuf.Class.getDefaultInstance(), 0, null, null, 101, fieldType2, Integer.class);
        f66090j = GeneratedMessageLite.newRepeatedGeneratedExtension(ProtoBuf.Class.getDefaultInstance(), ProtoBuf.Property.getDefaultInstance(), null, 102, fieldType, false, ProtoBuf.Property.class);
        f66091k = GeneratedMessageLite.newSingularGeneratedExtension(ProtoBuf.Class.getDefaultInstance(), 0, null, null, 103, fieldType2, Integer.class);
        f66092l = GeneratedMessageLite.newSingularGeneratedExtension(ProtoBuf.Class.getDefaultInstance(), 0, null, null, 104, fieldType2, Integer.class);
        f66093m = GeneratedMessageLite.newSingularGeneratedExtension(ProtoBuf.Package.getDefaultInstance(), 0, null, null, 101, fieldType2, Integer.class);
        f66094n = GeneratedMessageLite.newRepeatedGeneratedExtension(ProtoBuf.Package.getDefaultInstance(), ProtoBuf.Property.getDefaultInstance(), null, 102, fieldType, false, ProtoBuf.Property.class);
    }

    /* JADX INFO: renamed from: a */
    public static void m91827a(ExtensionRegistryLite extensionRegistryLite) {
        extensionRegistryLite.m92192a(f66081a);
        extensionRegistryLite.m92192a(f66082b);
        extensionRegistryLite.m92192a(f66083c);
        extensionRegistryLite.m92192a(f66084d);
        extensionRegistryLite.m92192a(f66085e);
        extensionRegistryLite.m92192a(f66086f);
        extensionRegistryLite.m92192a(f66087g);
        extensionRegistryLite.m92192a(f66088h);
        extensionRegistryLite.m92192a(f66089i);
        extensionRegistryLite.m92192a(f66090j);
        extensionRegistryLite.m92192a(f66091k);
        extensionRegistryLite.m92192a(f66092l);
        extensionRegistryLite.m92192a(f66093m);
        extensionRegistryLite.m92192a(f66094n);
    }

    public static final class StringTableTypes extends GeneratedMessageLite implements StringTableTypesOrBuilder {
        public static Parser<StringTableTypes> PARSER = new C15389a();
        private static final StringTableTypes defaultInstance;
        private int localNameMemoizedSerializedSize;
        private List<Integer> localName_;
        private byte memoizedIsInitialized;
        private int memoizedSerializedSize;
        private List<Record> record_;
        private final ByteString unknownFields;

        public static final class Builder extends GeneratedMessageLite.Builder<StringTableTypes, Builder> implements StringTableTypesOrBuilder {

            /* JADX INFO: renamed from: b */
            public int f66107b;

            /* JADX INFO: renamed from: c */
            public List<Record> f66108c;

            /* JADX INFO: renamed from: d */
            public List<Integer> f66109d;

            private Builder() {
                List list = Collections.EMPTY_LIST;
                this.f66108c = list;
                this.f66109d = list;
                m91866r();
            }

            /* JADX INFO: renamed from: o */
            public static Builder m91865o() {
                return new Builder();
            }

            /* JADX INFO: renamed from: r */
            private void m91866r() {
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
            public StringTableTypes build() {
                StringTableTypes stringTableTypesM91868m = m91868m();
                if (stringTableTypesM91868m.isInitialized()) {
                    return stringTableTypesM91868m;
                }
                throw AbstractMessageLite.Builder.m92024c(stringTableTypesM91868m);
            }

            /* JADX INFO: renamed from: m */
            public StringTableTypes m91868m() {
                StringTableTypes stringTableTypes = new StringTableTypes(this);
                if ((this.f66107b & 1) == 1) {
                    this.f66108c = Collections.unmodifiableList(this.f66108c);
                    this.f66107b &= -2;
                }
                stringTableTypes.record_ = this.f66108c;
                if ((this.f66107b & 2) == 2) {
                    this.f66109d = Collections.unmodifiableList(this.f66109d);
                    this.f66107b &= -3;
                }
                stringTableTypes.localName_ = this.f66109d;
                return stringTableTypes;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder
            /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
            public Builder mo91414m() {
                return m91865o().mo91349f(m91868m());
            }

            /* JADX INFO: renamed from: p */
            public final void m91870p() {
                if ((this.f66107b & 2) != 2) {
                    this.f66109d = new ArrayList(this.f66109d);
                    this.f66107b |= 2;
                }
            }

            /* JADX INFO: renamed from: q */
            public final void m91871q() {
                if ((this.f66107b & 1) != 1) {
                    this.f66108c = new ArrayList(this.f66108c);
                    this.f66107b |= 1;
                }
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder
            /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
            public Builder mo91349f(StringTableTypes stringTableTypes) {
                if (stringTableTypes == StringTableTypes.getDefaultInstance()) {
                    return this;
                }
                if (!stringTableTypes.record_.isEmpty()) {
                    if (this.f66108c.isEmpty()) {
                        this.f66108c = stringTableTypes.record_;
                        this.f66107b &= -2;
                    } else {
                        m91871q();
                        this.f66108c.addAll(stringTableTypes.record_);
                    }
                }
                if (!stringTableTypes.localName_.isEmpty()) {
                    if (this.f66109d.isEmpty()) {
                        this.f66109d = stringTableTypes.localName_;
                        this.f66107b &= -3;
                    } else {
                        m91870p();
                        this.f66109d.addAll(stringTableTypes.localName_);
                    }
                }
                m92224j(m92223e().m92047c(stringTableTypes.unknownFields));
                return this;
            }

            /* JADX WARN: Code duplicated, block: B:15:0x001d  */
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
            public Builder mo91350i(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws Throwable {
                StringTableTypes stringTableTypes = null;
                try {
                    try {
                        StringTableTypes stringTableTypesMo91378d = StringTableTypes.PARSER.mo91378d(codedInputStream, extensionRegistryLite);
                        if (stringTableTypesMo91378d != null) {
                            mo91349f(stringTableTypesMo91378d);
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
                                mo91349f(stringTableTypes);
                            }
                            throw th;
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                    if (stringTableTypes != null) {
                        mo91349f(stringTableTypes);
                    }
                    throw th;
                }
            }
        }

        public interface RecordOrBuilder extends MessageLiteOrBuilder {
        }

        /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf$StringTableTypes$a */
        public static class C15389a extends AbstractParser<StringTableTypes> {
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.Parser
            /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
            public StringTableTypes mo91378d(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
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
            ByteString.Output outputM92041w = ByteString.m92041w();
            CodedOutputStream codedOutputStreamM92117K = CodedOutputStream.m92117K(outputM92041w, 1);
            boolean z = false;
            int i = 0;
            while (!z) {
                try {
                    try {
                        int iM92076K = codedInputStream.m92076K();
                        if (iM92076K != 0) {
                            if (iM92076K == 10) {
                                if ((i & 1) != 1) {
                                    this.record_ = new ArrayList();
                                    i |= 1;
                                }
                                this.record_.add((Record) codedInputStream.m92102u(Record.PARSER, extensionRegistryLite));
                            } else if (iM92076K == 40) {
                                if ((i & 2) != 2) {
                                    this.localName_ = new ArrayList();
                                    i |= 2;
                                }
                                this.localName_.add(Integer.valueOf(codedInputStream.m92100s()));
                            } else if (iM92076K == 42) {
                                int iM92091j = codedInputStream.m92091j(codedInputStream.m92067A());
                                if ((i & 2) != 2 && codedInputStream.m92088e() > 0) {
                                    this.localName_ = new ArrayList();
                                    i |= 2;
                                }
                                while (codedInputStream.m92088e() > 0) {
                                    this.localName_.add(Integer.valueOf(codedInputStream.m92100s()));
                                }
                                codedInputStream.m92090i(iM92091j);
                            } else if (!parseUnknownField(codedInputStream, codedOutputStreamM92117K, extensionRegistryLite, iM92076K)) {
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
                        codedOutputStreamM92117K.m92149J();
                    } catch (IOException unused) {
                    } finally {
                        this.unknownFields = outputM92041w.m92061m();
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
                codedOutputStreamM92117K.m92149J();
            } catch (IOException unused2) {
            } finally {
                this.unknownFields = outputM92041w.m92061m();
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
            return newBuilder().mo91349f(stringTableTypes);
        }

        public static StringTableTypes parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return PARSER.mo92025a(inputStream, extensionRegistryLite);
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
            int iM92138t = 0;
            for (int i2 = 0; i2 < this.record_.size(); i2++) {
                iM92138t += CodedOutputStream.m92138t(1, this.record_.get(i2));
            }
            int iM92135q = 0;
            for (int i3 = 0; i3 < this.localName_.size(); i3++) {
                iM92135q += CodedOutputStream.m92135q(this.localName_.get(i3).intValue());
            }
            int iM92135q2 = iM92138t + iM92135q;
            if (!getLocalNameList().isEmpty()) {
                iM92135q2 = iM92135q2 + 1 + CodedOutputStream.m92135q(iM92135q);
            }
            this.localNameMemoizedSerializedSize = iM92135q;
            int size = iM92135q2 + this.unknownFields.size();
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
                codedOutputStream.m92171h0(1, this.record_.get(i));
            }
            if (getLocalNameList().size() > 0) {
                codedOutputStream.m92182s0(42);
                codedOutputStream.m92182s0(this.localNameMemoizedSerializedSize);
            }
            for (int i2 = 0; i2 < this.localName_.size(); i2++) {
                codedOutputStream.m92169f0(this.localName_.get(i2).intValue());
            }
            codedOutputStream.m92176m0(this.unknownFields);
        }

        public static final class Record extends GeneratedMessageLite implements RecordOrBuilder {
            public static Parser<Record> PARSER = new C15388a();
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
                public int f66110b;

                /* JADX INFO: renamed from: d */
                public int f66112d;

                /* JADX INFO: renamed from: g */
                public List<Integer> f66115g;

                /* JADX INFO: renamed from: h */
                public List<Integer> f66116h;

                /* JADX INFO: renamed from: c */
                public int f66111c = 1;

                /* JADX INFO: renamed from: e */
                public Object f66113e = "";

                /* JADX INFO: renamed from: f */
                public Operation f66114f = Operation.NONE;

                private Builder() {
                    List<Integer> list = Collections.EMPTY_LIST;
                    this.f66115g = list;
                    this.f66116h = list;
                    m91876r();
                }

                /* JADX INFO: renamed from: o */
                public static Builder m91875o() {
                    return new Builder();
                }

                /* JADX INFO: renamed from: r */
                private void m91876r() {
                }

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
                /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
                public Record build() {
                    Record recordM91878m = m91878m();
                    if (recordM91878m.isInitialized()) {
                        return recordM91878m;
                    }
                    throw AbstractMessageLite.Builder.m92024c(recordM91878m);
                }

                /* JADX INFO: renamed from: m */
                public Record m91878m() {
                    Record record = new Record(this);
                    int i = this.f66110b;
                    int i2 = (i & 1) != 1 ? 0 : 1;
                    record.range_ = this.f66111c;
                    if ((i & 2) == 2) {
                        i2 |= 2;
                    }
                    record.predefinedIndex_ = this.f66112d;
                    if ((i & 4) == 4) {
                        i2 |= 4;
                    }
                    record.string_ = this.f66113e;
                    if ((i & 8) == 8) {
                        i2 |= 8;
                    }
                    record.operation_ = this.f66114f;
                    if ((this.f66110b & 16) == 16) {
                        this.f66115g = Collections.unmodifiableList(this.f66115g);
                        this.f66110b &= -17;
                    }
                    record.substringIndex_ = this.f66115g;
                    if ((this.f66110b & 32) == 32) {
                        this.f66116h = Collections.unmodifiableList(this.f66116h);
                        this.f66110b &= -33;
                    }
                    record.replaceChar_ = this.f66116h;
                    record.bitField0_ = i2;
                    return record;
                }

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder
                /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
                public Builder mo91414m() {
                    return m91875o().mo91349f(m91878m());
                }

                /* JADX INFO: renamed from: p */
                public final void m91880p() {
                    if ((this.f66110b & 32) != 32) {
                        this.f66116h = new ArrayList(this.f66116h);
                        this.f66110b |= 32;
                    }
                }

                /* JADX INFO: renamed from: q */
                public final void m91881q() {
                    if ((this.f66110b & 16) != 16) {
                        this.f66115g = new ArrayList(this.f66115g);
                        this.f66110b |= 16;
                    }
                }

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder
                /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
                public Builder mo91349f(Record record) {
                    if (record == Record.getDefaultInstance()) {
                        return this;
                    }
                    if (record.hasRange()) {
                        m91886w(record.getRange());
                    }
                    if (record.hasPredefinedIndex()) {
                        m91885v(record.getPredefinedIndex());
                    }
                    if (record.hasString()) {
                        this.f66110b |= 4;
                        this.f66113e = record.string_;
                    }
                    if (record.hasOperation()) {
                        m91884u(record.getOperation());
                    }
                    if (!record.substringIndex_.isEmpty()) {
                        if (this.f66115g.isEmpty()) {
                            this.f66115g = record.substringIndex_;
                            this.f66110b &= -17;
                        } else {
                            m91881q();
                            this.f66115g.addAll(record.substringIndex_);
                        }
                    }
                    if (!record.replaceChar_.isEmpty()) {
                        if (this.f66116h.isEmpty()) {
                            this.f66116h = record.replaceChar_;
                            this.f66110b &= -33;
                        } else {
                            m91880p();
                            this.f66116h.addAll(record.replaceChar_);
                        }
                    }
                    m92224j(m92223e().m92047c(record.unknownFields));
                    return this;
                }

                /* JADX WARN: Code duplicated, block: B:15:0x001d  */
                @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
                /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
                public Builder mo91350i(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws Throwable {
                    Record record = null;
                    try {
                        try {
                            Record recordMo91378d = Record.PARSER.mo91378d(codedInputStream, extensionRegistryLite);
                            if (recordMo91378d != null) {
                                mo91349f(recordMo91378d);
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
                                    mo91349f(record);
                                }
                                throw th;
                            }
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        if (record != null) {
                            mo91349f(record);
                        }
                        throw th;
                    }
                }

                /* JADX INFO: renamed from: u */
                public Builder m91884u(Operation operation) {
                    operation.getClass();
                    this.f66110b |= 8;
                    this.f66114f = operation;
                    return this;
                }

                /* JADX INFO: renamed from: v */
                public Builder m91885v(int i) {
                    this.f66110b |= 2;
                    this.f66112d = i;
                    return this;
                }

                /* JADX INFO: renamed from: w */
                public Builder m91886w(int i) {
                    this.f66110b |= 1;
                    this.f66111c = i;
                    return this;
                }
            }

            public enum Operation implements Internal.EnumLite {
                NONE(0, 0),
                INTERNAL_TO_CLASS_ID(1, 1),
                DESC_TO_CLASS_ID(2, 2);

                private static Internal.EnumLiteMap<Operation> internalValueMap = new C15387a();
                private final int value;

                /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf$StringTableTypes$Record$Operation$a */
                public static class C15387a implements Internal.EnumLiteMap<Operation> {
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
            public static class C15388a extends AbstractParser<Record> {
                @Override // kotlin.reflect.jvm.internal.impl.protobuf.Parser
                /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
                public Record mo91378d(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
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
                ByteString.Output outputM92041w = ByteString.m92041w();
                CodedOutputStream codedOutputStreamM92117K = CodedOutputStream.m92117K(outputM92041w, 1);
                boolean z = false;
                int i = 0;
                while (!z) {
                    try {
                        try {
                            int iM92076K = codedInputStream.m92076K();
                            if (iM92076K != 0) {
                                if (iM92076K == 8) {
                                    this.bitField0_ |= 1;
                                    this.range_ = codedInputStream.m92100s();
                                } else if (iM92076K == 16) {
                                    this.bitField0_ |= 2;
                                    this.predefinedIndex_ = codedInputStream.m92100s();
                                } else if (iM92076K == 24) {
                                    int iM92095n = codedInputStream.m92095n();
                                    Operation operationValueOf = Operation.valueOf(iM92095n);
                                    if (operationValueOf == null) {
                                        codedOutputStreamM92117K.m92182s0(iM92076K);
                                        codedOutputStreamM92117K.m92182s0(iM92095n);
                                    } else {
                                        this.bitField0_ |= 8;
                                        this.operation_ = operationValueOf;
                                    }
                                } else if (iM92076K == 32) {
                                    if ((i & 16) != 16) {
                                        this.substringIndex_ = new ArrayList();
                                        i |= 16;
                                    }
                                    this.substringIndex_.add(Integer.valueOf(codedInputStream.m92100s()));
                                } else if (iM92076K == 34) {
                                    int iM92091j = codedInputStream.m92091j(codedInputStream.m92067A());
                                    if ((i & 16) != 16 && codedInputStream.m92088e() > 0) {
                                        this.substringIndex_ = new ArrayList();
                                        i |= 16;
                                    }
                                    while (codedInputStream.m92088e() > 0) {
                                        this.substringIndex_.add(Integer.valueOf(codedInputStream.m92100s()));
                                    }
                                    codedInputStream.m92090i(iM92091j);
                                } else if (iM92076K == 40) {
                                    if ((i & 32) != 32) {
                                        this.replaceChar_ = new ArrayList();
                                        i |= 32;
                                    }
                                    this.replaceChar_.add(Integer.valueOf(codedInputStream.m92100s()));
                                } else if (iM92076K == 42) {
                                    int iM92091j2 = codedInputStream.m92091j(codedInputStream.m92067A());
                                    if ((i & 32) != 32 && codedInputStream.m92088e() > 0) {
                                        this.replaceChar_ = new ArrayList();
                                        i |= 32;
                                    }
                                    while (codedInputStream.m92088e() > 0) {
                                        this.replaceChar_.add(Integer.valueOf(codedInputStream.m92100s()));
                                    }
                                    codedInputStream.m92090i(iM92091j2);
                                } else if (iM92076K == 50) {
                                    ByteString byteStringM92093l = codedInputStream.m92093l();
                                    this.bitField0_ |= 4;
                                    this.string_ = byteStringM92093l;
                                } else if (!parseUnknownField(codedInputStream, codedOutputStreamM92117K, extensionRegistryLite, iM92076K)) {
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
                                codedOutputStreamM92117K.m92149J();
                            } catch (IOException unused) {
                            } finally {
                                this.unknownFields = outputM92041w.m92061m();
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
                    codedOutputStreamM92117K.m92149J();
                } catch (IOException unused2) {
                } finally {
                    this.unknownFields = outputM92041w.m92061m();
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
                return newBuilder().mo91349f(record);
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
                int iM92134p = (this.bitField0_ & 1) == 1 ? CodedOutputStream.m92134p(1, this.range_) : 0;
                if ((this.bitField0_ & 2) == 2) {
                    iM92134p += CodedOutputStream.m92134p(2, this.predefinedIndex_);
                }
                if ((this.bitField0_ & 8) == 8) {
                    iM92134p += CodedOutputStream.m92127i(3, this.operation_.getNumber());
                }
                int iM92135q = 0;
                for (int i2 = 0; i2 < this.substringIndex_.size(); i2++) {
                    iM92135q += CodedOutputStream.m92135q(this.substringIndex_.get(i2).intValue());
                }
                int iM92135q2 = iM92134p + iM92135q;
                if (!getSubstringIndexList().isEmpty()) {
                    iM92135q2 = iM92135q2 + 1 + CodedOutputStream.m92135q(iM92135q);
                }
                this.substringIndexMemoizedSerializedSize = iM92135q;
                int iM92135q3 = 0;
                for (int i3 = 0; i3 < this.replaceChar_.size(); i3++) {
                    iM92135q3 += CodedOutputStream.m92135q(this.replaceChar_.get(i3).intValue());
                }
                int iM92123e = iM92135q2 + iM92135q3;
                if (!getReplaceCharList().isEmpty()) {
                    iM92123e = iM92123e + 1 + CodedOutputStream.m92135q(iM92135q3);
                }
                this.replaceCharMemoizedSerializedSize = iM92135q3;
                if ((this.bitField0_ & 4) == 4) {
                    iM92123e += CodedOutputStream.m92123e(6, getStringBytes());
                }
                int size = iM92123e + this.unknownFields.size();
                this.memoizedSerializedSize = size;
                return size;
            }

            public String getString() {
                Object obj = this.string_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                ByteString byteString = (ByteString) obj;
                String strM92044D = byteString.m92044D();
                if (byteString.mo92052r()) {
                    this.string_ = strM92044D;
                }
                return strM92044D;
            }

            public ByteString getStringBytes() {
                Object obj = this.string_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringM92040i = ByteString.m92040i((String) obj);
                this.string_ = byteStringM92040i;
                return byteStringM92040i;
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
                    codedOutputStream.m92168e0(1, this.range_);
                }
                if ((this.bitField0_ & 2) == 2) {
                    codedOutputStream.m92168e0(2, this.predefinedIndex_);
                }
                if ((this.bitField0_ & 8) == 8) {
                    codedOutputStream.m92159W(3, this.operation_.getNumber());
                }
                if (getSubstringIndexList().size() > 0) {
                    codedOutputStream.m92182s0(34);
                    codedOutputStream.m92182s0(this.substringIndexMemoizedSerializedSize);
                }
                for (int i = 0; i < this.substringIndex_.size(); i++) {
                    codedOutputStream.m92169f0(this.substringIndex_.get(i).intValue());
                }
                if (getReplaceCharList().size() > 0) {
                    codedOutputStream.m92182s0(42);
                    codedOutputStream.m92182s0(this.replaceCharMemoizedSerializedSize);
                }
                for (int i2 = 0; i2 < this.replaceChar_.size(); i2++) {
                    codedOutputStream.m92169f0(this.replaceChar_.get(i2).intValue());
                }
                if ((this.bitField0_ & 4) == 4) {
                    codedOutputStream.m92155S(6, getStringBytes());
                }
                codedOutputStream.m92176m0(this.unknownFields);
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
                return Builder.m91875o();
            }

            private Record(GeneratedMessageLite.Builder builder) {
                super(builder);
                this.substringIndexMemoizedSerializedSize = -1;
                this.replaceCharMemoizedSerializedSize = -1;
                this.memoizedIsInitialized = (byte) -1;
                this.memoizedSerializedSize = -1;
                this.unknownFields = builder.m92223e();
            }

            private Record(boolean z) {
                this.substringIndexMemoizedSerializedSize = -1;
                this.replaceCharMemoizedSerializedSize = -1;
                this.memoizedIsInitialized = (byte) -1;
                this.memoizedSerializedSize = -1;
                this.unknownFields = ByteString.f66289a;
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
            return Builder.m91865o();
        }

        private StringTableTypes(GeneratedMessageLite.Builder builder) {
            super(builder);
            this.localNameMemoizedSerializedSize = -1;
            this.memoizedIsInitialized = (byte) -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = builder.m92223e();
        }

        private StringTableTypes(boolean z) {
            this.localNameMemoizedSerializedSize = -1;
            this.memoizedIsInitialized = (byte) -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = ByteString.f66289a;
        }
    }

    public static final class JvmFieldSignature extends GeneratedMessageLite implements JvmFieldSignatureOrBuilder {
        public static Parser<JvmFieldSignature> PARSER = new C15384a();
        private static final JvmFieldSignature defaultInstance;
        private int bitField0_;
        private int desc_;
        private byte memoizedIsInitialized;
        private int memoizedSerializedSize;
        private int name_;
        private final ByteString unknownFields;

        public static final class Builder extends GeneratedMessageLite.Builder<JvmFieldSignature, Builder> implements JvmFieldSignatureOrBuilder {

            /* JADX INFO: renamed from: b */
            public int f66095b;

            /* JADX INFO: renamed from: c */
            public int f66096c;

            /* JADX INFO: renamed from: d */
            public int f66097d;

            private Builder() {
                m91830p();
            }

            /* JADX INFO: renamed from: o */
            public static Builder m91829o() {
                return new Builder();
            }

            /* JADX INFO: renamed from: p */
            private void m91830p() {
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
            public JvmFieldSignature build() {
                JvmFieldSignature jvmFieldSignatureM91832m = m91832m();
                if (jvmFieldSignatureM91832m.isInitialized()) {
                    return jvmFieldSignatureM91832m;
                }
                throw AbstractMessageLite.Builder.m92024c(jvmFieldSignatureM91832m);
            }

            /* JADX INFO: renamed from: m */
            public JvmFieldSignature m91832m() {
                JvmFieldSignature jvmFieldSignature = new JvmFieldSignature(this);
                int i = this.f66095b;
                int i2 = (i & 1) != 1 ? 0 : 1;
                jvmFieldSignature.name_ = this.f66096c;
                if ((i & 2) == 2) {
                    i2 |= 2;
                }
                jvmFieldSignature.desc_ = this.f66097d;
                jvmFieldSignature.bitField0_ = i2;
                return jvmFieldSignature;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder
            /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
            public Builder mo91414m() {
                return m91829o().mo91349f(m91832m());
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder
            /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
            public Builder mo91349f(JvmFieldSignature jvmFieldSignature) {
                if (jvmFieldSignature == JvmFieldSignature.getDefaultInstance()) {
                    return this;
                }
                if (jvmFieldSignature.hasName()) {
                    m91837t(jvmFieldSignature.getName());
                }
                if (jvmFieldSignature.hasDesc()) {
                    m91836s(jvmFieldSignature.getDesc());
                }
                m92224j(m92223e().m92047c(jvmFieldSignature.unknownFields));
                return this;
            }

            /* JADX WARN: Code duplicated, block: B:15:0x001d  */
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
            public Builder mo91350i(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws Throwable {
                JvmFieldSignature jvmFieldSignature = null;
                try {
                    try {
                        JvmFieldSignature jvmFieldSignatureMo91378d = JvmFieldSignature.PARSER.mo91378d(codedInputStream, extensionRegistryLite);
                        if (jvmFieldSignatureMo91378d != null) {
                            mo91349f(jvmFieldSignatureMo91378d);
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
                                mo91349f(jvmFieldSignature);
                            }
                            throw th;
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                    if (jvmFieldSignature != null) {
                        mo91349f(jvmFieldSignature);
                    }
                    throw th;
                }
            }

            /* JADX INFO: renamed from: s */
            public Builder m91836s(int i) {
                this.f66095b |= 2;
                this.f66097d = i;
                return this;
            }

            /* JADX INFO: renamed from: t */
            public Builder m91837t(int i) {
                this.f66095b |= 1;
                this.f66096c = i;
                return this;
            }
        }

        /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf$JvmFieldSignature$a */
        public static class C15384a extends AbstractParser<JvmFieldSignature> {
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.Parser
            /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
            public JvmFieldSignature mo91378d(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
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
            ByteString.Output outputM92041w = ByteString.m92041w();
            CodedOutputStream codedOutputStreamM92117K = CodedOutputStream.m92117K(outputM92041w, 1);
            boolean z = false;
            while (!z) {
                try {
                    try {
                        int iM92076K = codedInputStream.m92076K();
                        if (iM92076K != 0) {
                            if (iM92076K == 8) {
                                this.bitField0_ |= 1;
                                this.name_ = codedInputStream.m92100s();
                            } else if (iM92076K == 16) {
                                this.bitField0_ |= 2;
                                this.desc_ = codedInputStream.m92100s();
                            } else if (!parseUnknownField(codedInputStream, codedOutputStreamM92117K, extensionRegistryLite, iM92076K)) {
                            }
                        }
                        z = true;
                    } catch (Throwable th) {
                        try {
                            codedOutputStreamM92117K.m92149J();
                        } catch (IOException unused) {
                        } finally {
                            this.unknownFields = outputM92041w.m92061m();
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
                codedOutputStreamM92117K.m92149J();
            } catch (IOException unused2) {
            } finally {
                this.unknownFields = outputM92041w.m92061m();
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
            return newBuilder().mo91349f(jvmFieldSignature);
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
            int iM92134p = (this.bitField0_ & 1) == 1 ? CodedOutputStream.m92134p(1, this.name_) : 0;
            if ((this.bitField0_ & 2) == 2) {
                iM92134p += CodedOutputStream.m92134p(2, this.desc_);
            }
            int size = iM92134p + this.unknownFields.size();
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
                codedOutputStream.m92168e0(1, this.name_);
            }
            if ((this.bitField0_ & 2) == 2) {
                codedOutputStream.m92168e0(2, this.desc_);
            }
            codedOutputStream.m92176m0(this.unknownFields);
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
            return Builder.m91829o();
        }

        private JvmFieldSignature(GeneratedMessageLite.Builder builder) {
            super(builder);
            this.memoizedIsInitialized = (byte) -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = builder.m92223e();
        }

        private JvmFieldSignature(boolean z) {
            this.memoizedIsInitialized = (byte) -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = ByteString.f66289a;
        }
    }

    public static final class JvmMethodSignature extends GeneratedMessageLite implements JvmMethodSignatureOrBuilder {
        public static Parser<JvmMethodSignature> PARSER = new C15385a();
        private static final JvmMethodSignature defaultInstance;
        private int bitField0_;
        private int desc_;
        private byte memoizedIsInitialized;
        private int memoizedSerializedSize;
        private int name_;
        private final ByteString unknownFields;

        public static final class Builder extends GeneratedMessageLite.Builder<JvmMethodSignature, Builder> implements JvmMethodSignatureOrBuilder {

            /* JADX INFO: renamed from: b */
            public int f66098b;

            /* JADX INFO: renamed from: c */
            public int f66099c;

            /* JADX INFO: renamed from: d */
            public int f66100d;

            private Builder() {
                m91841p();
            }

            /* JADX INFO: renamed from: o */
            public static Builder m91840o() {
                return new Builder();
            }

            /* JADX INFO: renamed from: p */
            private void m91841p() {
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
            public JvmMethodSignature build() {
                JvmMethodSignature jvmMethodSignatureM91843m = m91843m();
                if (jvmMethodSignatureM91843m.isInitialized()) {
                    return jvmMethodSignatureM91843m;
                }
                throw AbstractMessageLite.Builder.m92024c(jvmMethodSignatureM91843m);
            }

            /* JADX INFO: renamed from: m */
            public JvmMethodSignature m91843m() {
                JvmMethodSignature jvmMethodSignature = new JvmMethodSignature(this);
                int i = this.f66098b;
                int i2 = (i & 1) != 1 ? 0 : 1;
                jvmMethodSignature.name_ = this.f66099c;
                if ((i & 2) == 2) {
                    i2 |= 2;
                }
                jvmMethodSignature.desc_ = this.f66100d;
                jvmMethodSignature.bitField0_ = i2;
                return jvmMethodSignature;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder
            /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
            public Builder mo91414m() {
                return m91840o().mo91349f(m91843m());
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder
            /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
            public Builder mo91349f(JvmMethodSignature jvmMethodSignature) {
                if (jvmMethodSignature == JvmMethodSignature.getDefaultInstance()) {
                    return this;
                }
                if (jvmMethodSignature.hasName()) {
                    m91848t(jvmMethodSignature.getName());
                }
                if (jvmMethodSignature.hasDesc()) {
                    m91847s(jvmMethodSignature.getDesc());
                }
                m92224j(m92223e().m92047c(jvmMethodSignature.unknownFields));
                return this;
            }

            /* JADX WARN: Code duplicated, block: B:15:0x001d  */
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
            public Builder mo91350i(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws Throwable {
                JvmMethodSignature jvmMethodSignature = null;
                try {
                    try {
                        JvmMethodSignature jvmMethodSignatureMo91378d = JvmMethodSignature.PARSER.mo91378d(codedInputStream, extensionRegistryLite);
                        if (jvmMethodSignatureMo91378d != null) {
                            mo91349f(jvmMethodSignatureMo91378d);
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
                                mo91349f(jvmMethodSignature);
                            }
                            throw th;
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                    if (jvmMethodSignature != null) {
                        mo91349f(jvmMethodSignature);
                    }
                    throw th;
                }
            }

            /* JADX INFO: renamed from: s */
            public Builder m91847s(int i) {
                this.f66098b |= 2;
                this.f66100d = i;
                return this;
            }

            /* JADX INFO: renamed from: t */
            public Builder m91848t(int i) {
                this.f66098b |= 1;
                this.f66099c = i;
                return this;
            }
        }

        /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf$JvmMethodSignature$a */
        public static class C15385a extends AbstractParser<JvmMethodSignature> {
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.Parser
            /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
            public JvmMethodSignature mo91378d(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
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
            ByteString.Output outputM92041w = ByteString.m92041w();
            CodedOutputStream codedOutputStreamM92117K = CodedOutputStream.m92117K(outputM92041w, 1);
            boolean z = false;
            while (!z) {
                try {
                    try {
                        int iM92076K = codedInputStream.m92076K();
                        if (iM92076K != 0) {
                            if (iM92076K == 8) {
                                this.bitField0_ |= 1;
                                this.name_ = codedInputStream.m92100s();
                            } else if (iM92076K == 16) {
                                this.bitField0_ |= 2;
                                this.desc_ = codedInputStream.m92100s();
                            } else if (!parseUnknownField(codedInputStream, codedOutputStreamM92117K, extensionRegistryLite, iM92076K)) {
                            }
                        }
                        z = true;
                    } catch (Throwable th) {
                        try {
                            codedOutputStreamM92117K.m92149J();
                        } catch (IOException unused) {
                        } finally {
                            this.unknownFields = outputM92041w.m92061m();
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
                codedOutputStreamM92117K.m92149J();
            } catch (IOException unused2) {
            } finally {
                this.unknownFields = outputM92041w.m92061m();
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
            return newBuilder().mo91349f(jvmMethodSignature);
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
            int iM92134p = (this.bitField0_ & 1) == 1 ? CodedOutputStream.m92134p(1, this.name_) : 0;
            if ((this.bitField0_ & 2) == 2) {
                iM92134p += CodedOutputStream.m92134p(2, this.desc_);
            }
            int size = iM92134p + this.unknownFields.size();
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
                codedOutputStream.m92168e0(1, this.name_);
            }
            if ((this.bitField0_ & 2) == 2) {
                codedOutputStream.m92168e0(2, this.desc_);
            }
            codedOutputStream.m92176m0(this.unknownFields);
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
            return Builder.m91840o();
        }

        private JvmMethodSignature(GeneratedMessageLite.Builder builder) {
            super(builder);
            this.memoizedIsInitialized = (byte) -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = builder.m92223e();
        }

        private JvmMethodSignature(boolean z) {
            this.memoizedIsInitialized = (byte) -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = ByteString.f66289a;
        }
    }

    public static final class JvmPropertySignature extends GeneratedMessageLite implements JvmPropertySignatureOrBuilder {
        public static Parser<JvmPropertySignature> PARSER = new C15386a();
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
            public int f66101b;

            /* JADX INFO: renamed from: c */
            public JvmFieldSignature f66102c = JvmFieldSignature.getDefaultInstance();

            /* JADX INFO: renamed from: d */
            public JvmMethodSignature f66103d = JvmMethodSignature.getDefaultInstance();

            /* JADX INFO: renamed from: e */
            public JvmMethodSignature f66104e = JvmMethodSignature.getDefaultInstance();

            /* JADX INFO: renamed from: f */
            public JvmMethodSignature f66105f = JvmMethodSignature.getDefaultInstance();

            /* JADX INFO: renamed from: g */
            public JvmMethodSignature f66106g = JvmMethodSignature.getDefaultInstance();

            private Builder() {
                m91852p();
            }

            /* JADX INFO: renamed from: o */
            public static Builder m91851o() {
                return new Builder();
            }

            /* JADX INFO: renamed from: p */
            private void m91852p() {
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
            public JvmPropertySignature build() {
                JvmPropertySignature jvmPropertySignatureM91854m = m91854m();
                if (jvmPropertySignatureM91854m.isInitialized()) {
                    return jvmPropertySignatureM91854m;
                }
                throw AbstractMessageLite.Builder.m92024c(jvmPropertySignatureM91854m);
            }

            /* JADX INFO: renamed from: m */
            public JvmPropertySignature m91854m() {
                JvmPropertySignature jvmPropertySignature = new JvmPropertySignature(this);
                int i = this.f66101b;
                int i2 = (i & 1) != 1 ? 0 : 1;
                jvmPropertySignature.field_ = this.f66102c;
                if ((i & 2) == 2) {
                    i2 |= 2;
                }
                jvmPropertySignature.syntheticMethod_ = this.f66103d;
                if ((i & 4) == 4) {
                    i2 |= 4;
                }
                jvmPropertySignature.getter_ = this.f66104e;
                if ((i & 8) == 8) {
                    i2 |= 8;
                }
                jvmPropertySignature.setter_ = this.f66105f;
                if ((i & 16) == 16) {
                    i2 |= 16;
                }
                jvmPropertySignature.delegateMethod_ = this.f66106g;
                jvmPropertySignature.bitField0_ = i2;
                return jvmPropertySignature;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder
            /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
            public Builder mo91414m() {
                return m91851o().mo91349f(m91854m());
            }

            /* JADX INFO: renamed from: q */
            public Builder m91856q(JvmMethodSignature jvmMethodSignature) {
                if ((this.f66101b & 16) != 16 || this.f66106g == JvmMethodSignature.getDefaultInstance()) {
                    this.f66106g = jvmMethodSignature;
                } else {
                    this.f66106g = JvmMethodSignature.newBuilder(this.f66106g).mo91349f(jvmMethodSignature).m91843m();
                }
                this.f66101b |= 16;
                return this;
            }

            /* JADX INFO: renamed from: r */
            public Builder m91857r(JvmFieldSignature jvmFieldSignature) {
                if ((this.f66101b & 1) != 1 || this.f66102c == JvmFieldSignature.getDefaultInstance()) {
                    this.f66102c = jvmFieldSignature;
                } else {
                    this.f66102c = JvmFieldSignature.newBuilder(this.f66102c).mo91349f(jvmFieldSignature).m91832m();
                }
                this.f66101b |= 1;
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder
            /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
            public Builder mo91349f(JvmPropertySignature jvmPropertySignature) {
                if (jvmPropertySignature == JvmPropertySignature.getDefaultInstance()) {
                    return this;
                }
                if (jvmPropertySignature.hasField()) {
                    m91857r(jvmPropertySignature.getField());
                }
                if (jvmPropertySignature.hasSyntheticMethod()) {
                    m91862w(jvmPropertySignature.getSyntheticMethod());
                }
                if (jvmPropertySignature.hasGetter()) {
                    m91860u(jvmPropertySignature.getGetter());
                }
                if (jvmPropertySignature.hasSetter()) {
                    m91861v(jvmPropertySignature.getSetter());
                }
                if (jvmPropertySignature.hasDelegateMethod()) {
                    m91856q(jvmPropertySignature.getDelegateMethod());
                }
                m92224j(m92223e().m92047c(jvmPropertySignature.unknownFields));
                return this;
            }

            /* JADX WARN: Code duplicated, block: B:15:0x001d  */
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
            public Builder mo91350i(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws Throwable {
                JvmPropertySignature jvmPropertySignature = null;
                try {
                    try {
                        JvmPropertySignature jvmPropertySignatureMo91378d = JvmPropertySignature.PARSER.mo91378d(codedInputStream, extensionRegistryLite);
                        if (jvmPropertySignatureMo91378d != null) {
                            mo91349f(jvmPropertySignatureMo91378d);
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
                                mo91349f(jvmPropertySignature);
                            }
                            throw th;
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                    if (jvmPropertySignature != null) {
                        mo91349f(jvmPropertySignature);
                    }
                    throw th;
                }
            }

            /* JADX INFO: renamed from: u */
            public Builder m91860u(JvmMethodSignature jvmMethodSignature) {
                if ((this.f66101b & 4) != 4 || this.f66104e == JvmMethodSignature.getDefaultInstance()) {
                    this.f66104e = jvmMethodSignature;
                } else {
                    this.f66104e = JvmMethodSignature.newBuilder(this.f66104e).mo91349f(jvmMethodSignature).m91843m();
                }
                this.f66101b |= 4;
                return this;
            }

            /* JADX INFO: renamed from: v */
            public Builder m91861v(JvmMethodSignature jvmMethodSignature) {
                if ((this.f66101b & 8) != 8 || this.f66105f == JvmMethodSignature.getDefaultInstance()) {
                    this.f66105f = jvmMethodSignature;
                } else {
                    this.f66105f = JvmMethodSignature.newBuilder(this.f66105f).mo91349f(jvmMethodSignature).m91843m();
                }
                this.f66101b |= 8;
                return this;
            }

            /* JADX INFO: renamed from: w */
            public Builder m91862w(JvmMethodSignature jvmMethodSignature) {
                if ((this.f66101b & 2) != 2 || this.f66103d == JvmMethodSignature.getDefaultInstance()) {
                    this.f66103d = jvmMethodSignature;
                } else {
                    this.f66103d = JvmMethodSignature.newBuilder(this.f66103d).mo91349f(jvmMethodSignature).m91843m();
                }
                this.f66101b |= 2;
                return this;
            }
        }

        /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf$JvmPropertySignature$a */
        public static class C15386a extends AbstractParser<JvmPropertySignature> {
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.Parser
            /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
            public JvmPropertySignature mo91378d(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
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
            ByteString.Output outputM92041w = ByteString.m92041w();
            CodedOutputStream codedOutputStreamM92117K = CodedOutputStream.m92117K(outputM92041w, 1);
            boolean z = false;
            while (!z) {
                try {
                    try {
                        int iM92076K = codedInputStream.m92076K();
                        if (iM92076K != 0) {
                            if (iM92076K == 10) {
                                JvmFieldSignature.Builder builder = (this.bitField0_ & 1) == 1 ? this.field_.toBuilder() : null;
                                JvmFieldSignature jvmFieldSignature = (JvmFieldSignature) codedInputStream.m92102u(JvmFieldSignature.PARSER, extensionRegistryLite);
                                this.field_ = jvmFieldSignature;
                                if (builder != null) {
                                    builder.mo91349f(jvmFieldSignature);
                                    this.field_ = builder.m91832m();
                                }
                                this.bitField0_ |= 1;
                            } else if (iM92076K == 18) {
                                JvmMethodSignature.Builder builder2 = (this.bitField0_ & 2) == 2 ? this.syntheticMethod_.toBuilder() : null;
                                JvmMethodSignature jvmMethodSignature = (JvmMethodSignature) codedInputStream.m92102u(JvmMethodSignature.PARSER, extensionRegistryLite);
                                this.syntheticMethod_ = jvmMethodSignature;
                                if (builder2 != null) {
                                    builder2.mo91349f(jvmMethodSignature);
                                    this.syntheticMethod_ = builder2.m91843m();
                                }
                                this.bitField0_ |= 2;
                            } else if (iM92076K == 26) {
                                JvmMethodSignature.Builder builder3 = (this.bitField0_ & 4) == 4 ? this.getter_.toBuilder() : null;
                                JvmMethodSignature jvmMethodSignature2 = (JvmMethodSignature) codedInputStream.m92102u(JvmMethodSignature.PARSER, extensionRegistryLite);
                                this.getter_ = jvmMethodSignature2;
                                if (builder3 != null) {
                                    builder3.mo91349f(jvmMethodSignature2);
                                    this.getter_ = builder3.m91843m();
                                }
                                this.bitField0_ |= 4;
                            } else if (iM92076K == 34) {
                                JvmMethodSignature.Builder builder4 = (this.bitField0_ & 8) == 8 ? this.setter_.toBuilder() : null;
                                JvmMethodSignature jvmMethodSignature3 = (JvmMethodSignature) codedInputStream.m92102u(JvmMethodSignature.PARSER, extensionRegistryLite);
                                this.setter_ = jvmMethodSignature3;
                                if (builder4 != null) {
                                    builder4.mo91349f(jvmMethodSignature3);
                                    this.setter_ = builder4.m91843m();
                                }
                                this.bitField0_ |= 8;
                            } else if (iM92076K == 42) {
                                JvmMethodSignature.Builder builder5 = (this.bitField0_ & 16) == 16 ? this.delegateMethod_.toBuilder() : null;
                                JvmMethodSignature jvmMethodSignature4 = (JvmMethodSignature) codedInputStream.m92102u(JvmMethodSignature.PARSER, extensionRegistryLite);
                                this.delegateMethod_ = jvmMethodSignature4;
                                if (builder5 != null) {
                                    builder5.mo91349f(jvmMethodSignature4);
                                    this.delegateMethod_ = builder5.m91843m();
                                }
                                this.bitField0_ |= 16;
                            } else if (!parseUnknownField(codedInputStream, codedOutputStreamM92117K, extensionRegistryLite, iM92076K)) {
                            }
                        }
                        z = true;
                    } catch (Throwable th) {
                        try {
                            codedOutputStreamM92117K.m92149J();
                        } catch (IOException unused) {
                        } finally {
                            this.unknownFields = outputM92041w.m92061m();
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
                codedOutputStreamM92117K.m92149J();
            } catch (IOException unused2) {
            } finally {
                this.unknownFields = outputM92041w.m92061m();
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
            return newBuilder().mo91349f(jvmPropertySignature);
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
            int iM92138t = (this.bitField0_ & 1) == 1 ? CodedOutputStream.m92138t(1, this.field_) : 0;
            if ((this.bitField0_ & 2) == 2) {
                iM92138t += CodedOutputStream.m92138t(2, this.syntheticMethod_);
            }
            if ((this.bitField0_ & 4) == 4) {
                iM92138t += CodedOutputStream.m92138t(3, this.getter_);
            }
            if ((this.bitField0_ & 8) == 8) {
                iM92138t += CodedOutputStream.m92138t(4, this.setter_);
            }
            if ((this.bitField0_ & 16) == 16) {
                iM92138t += CodedOutputStream.m92138t(5, this.delegateMethod_);
            }
            int size = iM92138t + this.unknownFields.size();
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
                codedOutputStream.m92171h0(1, this.field_);
            }
            if ((this.bitField0_ & 2) == 2) {
                codedOutputStream.m92171h0(2, this.syntheticMethod_);
            }
            if ((this.bitField0_ & 4) == 4) {
                codedOutputStream.m92171h0(3, this.getter_);
            }
            if ((this.bitField0_ & 8) == 8) {
                codedOutputStream.m92171h0(4, this.setter_);
            }
            if ((this.bitField0_ & 16) == 16) {
                codedOutputStream.m92171h0(5, this.delegateMethod_);
            }
            codedOutputStream.m92176m0(this.unknownFields);
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
            return Builder.m91851o();
        }

        private JvmPropertySignature(GeneratedMessageLite.Builder builder) {
            super(builder);
            this.memoizedIsInitialized = (byte) -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = builder.m92223e();
        }

        private JvmPropertySignature(boolean z) {
            this.memoizedIsInitialized = (byte) -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = ByteString.f66289a;
        }
    }
}
