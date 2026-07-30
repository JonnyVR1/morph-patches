package kotlin.reflect.jvm.internal.impl.metadata;

import com.alibaba.fastjson.asm.Opcodes;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.p069ss.bytertc.engine.type.ErrorCode;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite;
import kotlin.reflect.jvm.internal.impl.protobuf.AbstractParser;
import kotlin.reflect.jvm.internal.impl.protobuf.ByteString;
import kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream;
import kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream;
import kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite;
import kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite;
import kotlin.reflect.jvm.internal.impl.protobuf.Internal;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;
import kotlin.reflect.jvm.internal.impl.protobuf.LazyStringArrayList;
import kotlin.reflect.jvm.internal.impl.protobuf.LazyStringList;
import kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder;
import kotlin.reflect.jvm.internal.impl.protobuf.Parser;
import kotlin.reflect.jvm.internal.impl.protobuf.ProtocolStringList;
import org.spongycastle.asn1.eac.EACTags;
import org.spongycastle.crypto.tls.CipherSuite;

/* JADX INFO: loaded from: classes2.dex */
public final class ProtoBuf {

    public interface AnnotationOrBuilder extends MessageLiteOrBuilder {
    }

    public interface ClassOrBuilder extends GeneratedMessageLite.ExtendableMessageOrBuilder {
    }

    public interface CompilerPluginDataOrBuilder extends MessageLiteOrBuilder {
    }

    public interface ConstructorOrBuilder extends GeneratedMessageLite.ExtendableMessageOrBuilder {
    }

    public interface ContractOrBuilder extends MessageLiteOrBuilder {
    }

    public interface EffectOrBuilder extends MessageLiteOrBuilder {
    }

    public interface EnumEntryOrBuilder extends GeneratedMessageLite.ExtendableMessageOrBuilder {
    }

    public interface ExpressionOrBuilder extends MessageLiteOrBuilder {
    }

    public interface FunctionOrBuilder extends GeneratedMessageLite.ExtendableMessageOrBuilder {
    }

    public enum MemberKind implements Internal.EnumLite {
        DECLARATION(0, 0),
        FAKE_OVERRIDE(1, 1),
        DELEGATION(2, 2),
        SYNTHESIZED(3, 3);

        private static Internal.EnumLiteMap<MemberKind> internalValueMap = new C15252a();
        private final int value;

        /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$MemberKind$a */
        public static class C15252a implements Internal.EnumLiteMap<MemberKind> {
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.Internal.EnumLiteMap
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public MemberKind findValueByNumber(int i) {
                return MemberKind.valueOf(i);
            }
        }

        MemberKind(int i, int i2) {
            this.value = i2;
        }

        public static MemberKind valueOf(int i) {
            if (i == 0) {
                return DECLARATION;
            }
            if (i == 1) {
                return FAKE_OVERRIDE;
            }
            if (i == 2) {
                return DELEGATION;
            }
            if (i != 3) {
                return null;
            }
            return SYNTHESIZED;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.Internal.EnumLite
        public final int getNumber() {
            return this.value;
        }
    }

    public enum Modality implements Internal.EnumLite {
        FINAL(0, 0),
        OPEN(1, 1),
        ABSTRACT(2, 2),
        SEALED(3, 3);

        private static Internal.EnumLiteMap<Modality> internalValueMap = new C15253a();
        private final int value;

        /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Modality$a */
        public static class C15253a implements Internal.EnumLiteMap<Modality> {
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.Internal.EnumLiteMap
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public Modality findValueByNumber(int i) {
                return Modality.valueOf(i);
            }
        }

        Modality(int i, int i2) {
            this.value = i2;
        }

        public static Modality valueOf(int i) {
            if (i == 0) {
                return FINAL;
            }
            if (i == 1) {
                return OPEN;
            }
            if (i == 2) {
                return ABSTRACT;
            }
            if (i != 3) {
                return null;
            }
            return SEALED;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.Internal.EnumLite
        public final int getNumber() {
            return this.value;
        }
    }

    public interface PackageFragmentOrBuilder extends GeneratedMessageLite.ExtendableMessageOrBuilder {
    }

    public interface PackageOrBuilder extends GeneratedMessageLite.ExtendableMessageOrBuilder {
    }

    public interface PropertyOrBuilder extends GeneratedMessageLite.ExtendableMessageOrBuilder {
    }

    public interface QualifiedNameTableOrBuilder extends MessageLiteOrBuilder {
    }

    public interface StringTableOrBuilder extends MessageLiteOrBuilder {
    }

    public interface TypeAliasOrBuilder extends GeneratedMessageLite.ExtendableMessageOrBuilder {
    }

    public interface TypeOrBuilder extends GeneratedMessageLite.ExtendableMessageOrBuilder {
    }

    public interface TypeParameterOrBuilder extends GeneratedMessageLite.ExtendableMessageOrBuilder {
    }

    public interface TypeTableOrBuilder extends MessageLiteOrBuilder {
    }

    public interface ValueParameterOrBuilder extends GeneratedMessageLite.ExtendableMessageOrBuilder {
    }

    public interface VersionRequirementOrBuilder extends MessageLiteOrBuilder {
    }

    public interface VersionRequirementTableOrBuilder extends MessageLiteOrBuilder {
    }

    public enum Visibility implements Internal.EnumLite {
        INTERNAL(0, 0),
        PRIVATE(1, 1),
        PROTECTED(2, 2),
        PUBLIC(3, 3),
        PRIVATE_TO_THIS(4, 4),
        LOCAL(5, 5);

        private static Internal.EnumLiteMap<Visibility> internalValueMap = new C15273a();
        private final int value;

        /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Visibility$a */
        public static class C15273a implements Internal.EnumLiteMap<Visibility> {
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.Internal.EnumLiteMap
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public Visibility findValueByNumber(int i) {
                return Visibility.valueOf(i);
            }
        }

        Visibility(int i, int i2) {
            this.value = i2;
        }

        public static Visibility valueOf(int i) {
            if (i == 0) {
                return INTERNAL;
            }
            if (i == 1) {
                return PRIVATE;
            }
            if (i == 2) {
                return PROTECTED;
            }
            if (i == 3) {
                return PUBLIC;
            }
            if (i == 4) {
                return PRIVATE_TO_THIS;
            }
            if (i != 5) {
                return null;
            }
            return LOCAL;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.Internal.EnumLite
        public final int getNumber() {
            return this.value;
        }
    }

    public static final class Annotation extends GeneratedMessageLite implements AnnotationOrBuilder {
        public static Parser<Annotation> PARSER = new C15238a();
        private static final Annotation defaultInstance;
        private List<Argument> argument_;
        private int bitField0_;
        private int id_;
        private byte memoizedIsInitialized;
        private int memoizedSerializedSize;
        private final ByteString unknownFields;

        public interface ArgumentOrBuilder extends MessageLiteOrBuilder {
        }

        public static final class Builder extends GeneratedMessageLite.Builder<Annotation, Builder> implements AnnotationOrBuilder {

            /* JADX INFO: renamed from: b */
            public int f65146b;

            /* JADX INFO: renamed from: c */
            public int f65147c;

            /* JADX INFO: renamed from: d */
            public List<Argument> f65148d = Collections.EMPTY_LIST;

            private Builder() {
                m90492q();
            }

            /* JADX INFO: renamed from: o */
            public static Builder m90491o() {
                return new Builder();
            }

            /* JADX INFO: renamed from: q */
            private void m90492q() {
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
            public Annotation build() {
                Annotation annotationM90494m = m90494m();
                if (annotationM90494m.isInitialized()) {
                    return annotationM90494m;
                }
                throw AbstractMessageLite.Builder.m91133c(annotationM90494m);
            }

            /* JADX INFO: renamed from: m */
            public Annotation m90494m() {
                Annotation annotation = new Annotation(this);
                int i = (this.f65146b & 1) != 1 ? 0 : 1;
                annotation.id_ = this.f65147c;
                if ((this.f65146b & 2) == 2) {
                    this.f65148d = Collections.unmodifiableList(this.f65148d);
                    this.f65146b &= -3;
                }
                annotation.argument_ = this.f65148d;
                annotation.bitField0_ = i;
                return annotation;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder
            /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
            public Builder mo90523m() {
                return m90491o().mo90458f(m90494m());
            }

            /* JADX INFO: renamed from: p */
            public final void m90496p() {
                if ((this.f65146b & 2) != 2) {
                    this.f65148d = new ArrayList(this.f65148d);
                    this.f65146b |= 2;
                }
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder
            /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
            public Builder mo90458f(Annotation annotation) {
                if (annotation == Annotation.getDefaultInstance()) {
                    return this;
                }
                if (annotation.hasId()) {
                    m90499t(annotation.getId());
                }
                if (!annotation.argument_.isEmpty()) {
                    if (this.f65148d.isEmpty()) {
                        this.f65148d = annotation.argument_;
                        this.f65146b &= -3;
                    } else {
                        m90496p();
                        this.f65148d.addAll(annotation.argument_);
                    }
                }
                m91333j(m91332e().m91156c(annotation.unknownFields));
                return this;
            }

            /* JADX WARN: Code duplicated, block: B:15:0x001d  */
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
            public Builder mo90459i(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws Throwable {
                Annotation annotation = null;
                try {
                    try {
                        Annotation annotationMo90487d = Annotation.PARSER.mo90487d(codedInputStream, extensionRegistryLite);
                        if (annotationMo90487d != null) {
                            mo90458f(annotationMo90487d);
                        }
                        return this;
                    } catch (InvalidProtocolBufferException e) {
                        Annotation annotation2 = (Annotation) e.getUnfinishedMessage();
                        try {
                            throw e;
                        } catch (Throwable th) {
                            th = th;
                            annotation = annotation2;
                            if (annotation != null) {
                                mo90458f(annotation);
                            }
                            throw th;
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                    if (annotation != null) {
                        mo90458f(annotation);
                    }
                    throw th;
                }
            }

            /* JADX INFO: renamed from: t */
            public Builder m90499t(int i) {
                this.f65146b |= 1;
                this.f65147c = i;
                return this;
            }
        }

        /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Annotation$a */
        public static class C15238a extends AbstractParser<Annotation> {
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.Parser
            /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
            public Annotation mo90487d(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return new Annotation(codedInputStream, extensionRegistryLite);
            }
        }

        static {
            Annotation annotation = new Annotation(true);
            defaultInstance = annotation;
            annotation.initFields();
        }

        private Annotation(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            this.memoizedIsInitialized = (byte) -1;
            this.memoizedSerializedSize = -1;
            initFields();
            ByteString.Output outputM91150w = ByteString.m91150w();
            CodedOutputStream codedOutputStreamM91226K = CodedOutputStream.m91226K(outputM91150w, 1);
            boolean z = false;
            char c = 0;
            while (!z) {
                try {
                    try {
                        int iM91185K = codedInputStream.m91185K();
                        if (iM91185K != 0) {
                            if (iM91185K == 8) {
                                this.bitField0_ |= 1;
                                this.id_ = codedInputStream.m91209s();
                            } else if (iM91185K == 18) {
                                if ((c & 2) != 2) {
                                    this.argument_ = new ArrayList();
                                    c = 2;
                                }
                                this.argument_.add((Argument) codedInputStream.m91211u(Argument.PARSER, extensionRegistryLite));
                            } else if (!parseUnknownField(codedInputStream, codedOutputStreamM91226K, extensionRegistryLite, iM91185K)) {
                            }
                        }
                        z = true;
                    } catch (Throwable th) {
                        if ((c & 2) == 2) {
                            this.argument_ = Collections.unmodifiableList(this.argument_);
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
            if ((c & 2) == 2) {
                this.argument_ = Collections.unmodifiableList(this.argument_);
            }
            try {
                codedOutputStreamM91226K.m91258J();
            } catch (IOException unused2) {
            } finally {
                this.unknownFields = outputM91150w.m91170m();
            }
            makeExtensionsImmutable();
        }

        public static Annotation getDefaultInstance() {
            return defaultInstance;
        }

        private void initFields() {
            this.id_ = 0;
            this.argument_ = Collections.EMPTY_LIST;
        }

        public static Builder newBuilder(Annotation annotation) {
            return newBuilder().mo90458f(annotation);
        }

        public Argument getArgument(int i) {
            return this.argument_.get(i);
        }

        public int getArgumentCount() {
            return this.argument_.size();
        }

        public List<Argument> getArgumentList() {
            return this.argument_;
        }

        public int getId() {
            return this.id_;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public Parser<Annotation> getParserForType() {
            return PARSER;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int iM91243p = (this.bitField0_ & 1) == 1 ? CodedOutputStream.m91243p(1, this.id_) : 0;
            for (int i2 = 0; i2 < this.argument_.size(); i2++) {
                iM91243p += CodedOutputStream.m91247t(2, this.argument_.get(i2));
            }
            int size = iM91243p + this.unknownFields.size();
            this.memoizedSerializedSize = size;
            return size;
        }

        public boolean hasId() {
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
            if (!hasId()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            for (int i = 0; i < getArgumentCount(); i++) {
                if (!getArgument(i).isInitialized()) {
                    this.memoizedIsInitialized = (byte) 0;
                    return false;
                }
            }
            this.memoizedIsInitialized = (byte) 1;
            return true;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            getSerializedSize();
            if ((this.bitField0_ & 1) == 1) {
                codedOutputStream.m91277e0(1, this.id_);
            }
            for (int i = 0; i < this.argument_.size(); i++) {
                codedOutputStream.m91280h0(2, this.argument_.get(i));
            }
            codedOutputStream.m91285m0(this.unknownFields);
        }

        public static final class Argument extends GeneratedMessageLite implements ArgumentOrBuilder {
            public static Parser<Argument> PARSER = new C15237a();
            private static final Argument defaultInstance;
            private int bitField0_;
            private byte memoizedIsInitialized;
            private int memoizedSerializedSize;
            private int nameId_;
            private final ByteString unknownFields;
            private Value value_;

            public static final class Builder extends GeneratedMessageLite.Builder<Argument, Builder> implements ArgumentOrBuilder {

                /* JADX INFO: renamed from: b */
                public int f65131b;

                /* JADX INFO: renamed from: c */
                public int f65132c;

                /* JADX INFO: renamed from: d */
                public Value f65133d = Value.getDefaultInstance();

                private Builder() {
                    m90454p();
                }

                /* JADX INFO: renamed from: o */
                public static Builder m90453o() {
                    return new Builder();
                }

                /* JADX INFO: renamed from: p */
                private void m90454p() {
                }

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
                /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
                public Argument build() {
                    Argument argumentM90461m = m90461m();
                    if (argumentM90461m.isInitialized()) {
                        return argumentM90461m;
                    }
                    throw AbstractMessageLite.Builder.m91133c(argumentM90461m);
                }

                /* JADX INFO: renamed from: m */
                public Argument m90461m() {
                    Argument argument = new Argument(this);
                    int i = this.f65131b;
                    int i2 = (i & 1) != 1 ? 0 : 1;
                    argument.nameId_ = this.f65132c;
                    if ((i & 2) == 2) {
                        i2 |= 2;
                    }
                    argument.value_ = this.f65133d;
                    argument.bitField0_ = i2;
                    return argument;
                }

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder
                /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
                public Builder mo90523m() {
                    return m90453o().mo90458f(m90461m());
                }

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder
                /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
                public Builder mo90458f(Argument argument) {
                    if (argument == Argument.getDefaultInstance()) {
                        return this;
                    }
                    if (argument.hasNameId()) {
                        m90466t(argument.getNameId());
                    }
                    if (argument.hasValue()) {
                        m90465s(argument.getValue());
                    }
                    m91333j(m91332e().m91156c(argument.unknownFields));
                    return this;
                }

                /* JADX WARN: Code duplicated, block: B:15:0x001d  */
                @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
                /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
                public Builder mo90459i(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws Throwable {
                    Argument argument = null;
                    try {
                        try {
                            Argument argumentMo90487d = Argument.PARSER.mo90487d(codedInputStream, extensionRegistryLite);
                            if (argumentMo90487d != null) {
                                mo90458f(argumentMo90487d);
                            }
                            return this;
                        } catch (InvalidProtocolBufferException e) {
                            Argument argument2 = (Argument) e.getUnfinishedMessage();
                            try {
                                throw e;
                            } catch (Throwable th) {
                                th = th;
                                argument = argument2;
                                if (argument != null) {
                                    mo90458f(argument);
                                }
                                throw th;
                            }
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        if (argument != null) {
                            mo90458f(argument);
                        }
                        throw th;
                    }
                }

                /* JADX INFO: renamed from: s */
                public Builder m90465s(Value value) {
                    if ((this.f65131b & 2) != 2 || this.f65133d == Value.getDefaultInstance()) {
                        this.f65133d = value;
                    } else {
                        this.f65133d = Value.newBuilder(this.f65133d).mo90458f(value).m90473m();
                    }
                    this.f65131b |= 2;
                    return this;
                }

                /* JADX INFO: renamed from: t */
                public Builder m90466t(int i) {
                    this.f65131b |= 1;
                    this.f65132c = i;
                    return this;
                }
            }

            public interface ValueOrBuilder extends MessageLiteOrBuilder {
            }

            /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Annotation$Argument$a */
            public static class C15237a extends AbstractParser<Argument> {
                @Override // kotlin.reflect.jvm.internal.impl.protobuf.Parser
                /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
                public Argument mo90487d(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                    return new Argument(codedInputStream, extensionRegistryLite);
                }
            }

            static {
                Argument argument = new Argument(true);
                defaultInstance = argument;
                argument.initFields();
            }

            private Argument(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
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
                                    this.nameId_ = codedInputStream.m91209s();
                                } else if (iM91185K == 18) {
                                    Value.Builder builder = (this.bitField0_ & 2) == 2 ? this.value_.toBuilder() : null;
                                    Value value = (Value) codedInputStream.m91211u(Value.PARSER, extensionRegistryLite);
                                    this.value_ = value;
                                    if (builder != null) {
                                        builder.mo90458f(value);
                                        this.value_ = builder.m90473m();
                                    }
                                    this.bitField0_ |= 2;
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

            public static Argument getDefaultInstance() {
                return defaultInstance;
            }

            private void initFields() {
                this.nameId_ = 0;
                this.value_ = Value.getDefaultInstance();
            }

            public static Builder newBuilder(Argument argument) {
                return newBuilder().mo90458f(argument);
            }

            public int getNameId() {
                return this.nameId_;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
            public Parser<Argument> getParserForType() {
                return PARSER;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
            public int getSerializedSize() {
                int i = this.memoizedSerializedSize;
                if (i != -1) {
                    return i;
                }
                int iM91243p = (this.bitField0_ & 1) == 1 ? CodedOutputStream.m91243p(1, this.nameId_) : 0;
                if ((this.bitField0_ & 2) == 2) {
                    iM91243p += CodedOutputStream.m91247t(2, this.value_);
                }
                int size = iM91243p + this.unknownFields.size();
                this.memoizedSerializedSize = size;
                return size;
            }

            public Value getValue() {
                return this.value_;
            }

            public boolean hasNameId() {
                return (this.bitField0_ & 1) == 1;
            }

            public boolean hasValue() {
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
                if (!hasNameId()) {
                    this.memoizedIsInitialized = (byte) 0;
                    return false;
                }
                if (!hasValue()) {
                    this.memoizedIsInitialized = (byte) 0;
                    return false;
                }
                if (getValue().isInitialized()) {
                    this.memoizedIsInitialized = (byte) 1;
                    return true;
                }
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
            public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
                getSerializedSize();
                if ((this.bitField0_ & 1) == 1) {
                    codedOutputStream.m91277e0(1, this.nameId_);
                }
                if ((this.bitField0_ & 2) == 2) {
                    codedOutputStream.m91280h0(2, this.value_);
                }
                codedOutputStream.m91285m0(this.unknownFields);
            }

            public static final class Value extends GeneratedMessageLite implements ValueOrBuilder {
                public static Parser<Value> PARSER = new C15236a();
                private static final Value defaultInstance;
                private Annotation annotation_;
                private int arrayDimensionCount_;
                private List<Value> arrayElement_;
                private int bitField0_;
                private int classId_;
                private double doubleValue_;
                private int enumValueId_;
                private int flags_;
                private float floatValue_;
                private long intValue_;
                private byte memoizedIsInitialized;
                private int memoizedSerializedSize;
                private int stringValue_;
                private Type type_;
                private final ByteString unknownFields;

                public static final class Builder extends GeneratedMessageLite.Builder<Value, Builder> implements ValueOrBuilder {

                    /* JADX INFO: renamed from: b */
                    public int f65134b;

                    /* JADX INFO: renamed from: d */
                    public long f65136d;

                    /* JADX INFO: renamed from: e */
                    public float f65137e;

                    /* JADX INFO: renamed from: f */
                    public double f65138f;

                    /* JADX INFO: renamed from: g */
                    public int f65139g;

                    /* JADX INFO: renamed from: h */
                    public int f65140h;

                    /* JADX INFO: renamed from: i */
                    public int f65141i;

                    /* JADX INFO: renamed from: l */
                    public int f65144l;

                    /* JADX INFO: renamed from: m */
                    public int f65145m;

                    /* JADX INFO: renamed from: c */
                    public Type f65135c = Type.BYTE;

                    /* JADX INFO: renamed from: j */
                    public Annotation f65142j = Annotation.getDefaultInstance();

                    /* JADX INFO: renamed from: k */
                    public List<Value> f65143k = Collections.EMPTY_LIST;

                    private Builder() {
                        m90476q();
                    }

                    /* JADX INFO: renamed from: o */
                    public static Builder m90468o() {
                        return new Builder();
                    }

                    /* JADX INFO: renamed from: A */
                    public Builder m90469A(long j) {
                        this.f65134b |= 2;
                        this.f65136d = j;
                        return this;
                    }

                    /* JADX INFO: renamed from: B */
                    public Builder m90470B(int i) {
                        this.f65134b |= 16;
                        this.f65139g = i;
                        return this;
                    }

                    /* JADX INFO: renamed from: C */
                    public Builder m90471C(Type type) {
                        type.getClass();
                        this.f65134b |= 1;
                        this.f65135c = type;
                        return this;
                    }

                    @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
                    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
                    public Value build() {
                        Value valueM90473m = m90473m();
                        if (valueM90473m.isInitialized()) {
                            return valueM90473m;
                        }
                        throw AbstractMessageLite.Builder.m91133c(valueM90473m);
                    }

                    /* JADX INFO: renamed from: m */
                    public Value m90473m() {
                        Value value = new Value(this);
                        int i = this.f65134b;
                        int i2 = (i & 1) != 1 ? 0 : 1;
                        value.type_ = this.f65135c;
                        if ((i & 2) == 2) {
                            i2 |= 2;
                        }
                        value.intValue_ = this.f65136d;
                        if ((i & 4) == 4) {
                            i2 |= 4;
                        }
                        value.floatValue_ = this.f65137e;
                        if ((i & 8) == 8) {
                            i2 |= 8;
                        }
                        value.doubleValue_ = this.f65138f;
                        if ((i & 16) == 16) {
                            i2 |= 16;
                        }
                        value.stringValue_ = this.f65139g;
                        if ((i & 32) == 32) {
                            i2 |= 32;
                        }
                        value.classId_ = this.f65140h;
                        if ((i & 64) == 64) {
                            i2 |= 64;
                        }
                        value.enumValueId_ = this.f65141i;
                        if ((i & 128) == 128) {
                            i2 |= 128;
                        }
                        value.annotation_ = this.f65142j;
                        if ((this.f65134b & 256) == 256) {
                            this.f65143k = Collections.unmodifiableList(this.f65143k);
                            this.f65134b &= -257;
                        }
                        value.arrayElement_ = this.f65143k;
                        if ((i & 512) == 512) {
                            i2 |= 256;
                        }
                        value.arrayDimensionCount_ = this.f65144l;
                        if ((i & 1024) == 1024) {
                            i2 |= 512;
                        }
                        value.flags_ = this.f65145m;
                        value.bitField0_ = i2;
                        return value;
                    }

                    @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder
                    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
                    public Builder mo90523m() {
                        return m90468o().mo90458f(m90473m());
                    }

                    /* JADX INFO: renamed from: p */
                    public final void m90475p() {
                        if ((this.f65134b & 256) != 256) {
                            this.f65143k = new ArrayList(this.f65143k);
                            this.f65134b |= 256;
                        }
                    }

                    /* JADX INFO: renamed from: q */
                    public final void m90476q() {
                    }

                    /* JADX INFO: renamed from: r */
                    public Builder m90477r(Annotation annotation) {
                        if ((this.f65134b & 128) != 128 || this.f65142j == Annotation.getDefaultInstance()) {
                            this.f65142j = annotation;
                        } else {
                            this.f65142j = Annotation.newBuilder(this.f65142j).mo90458f(annotation).m90494m();
                        }
                        this.f65134b |= 128;
                        return this;
                    }

                    @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder
                    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
                    public Builder mo90458f(Value value) {
                        if (value == Value.getDefaultInstance()) {
                            return this;
                        }
                        if (value.hasType()) {
                            m90471C(value.getType());
                        }
                        if (value.hasIntValue()) {
                            m90469A(value.getIntValue());
                        }
                        if (value.hasFloatValue()) {
                            m90485z(value.getFloatValue());
                        }
                        if (value.hasDoubleValue()) {
                            m90482w(value.getDoubleValue());
                        }
                        if (value.hasStringValue()) {
                            m90470B(value.getStringValue());
                        }
                        if (value.hasClassId()) {
                            m90481v(value.getClassId());
                        }
                        if (value.hasEnumValueId()) {
                            m90483x(value.getEnumValueId());
                        }
                        if (value.hasAnnotation()) {
                            m90477r(value.getAnnotation());
                        }
                        if (!value.arrayElement_.isEmpty()) {
                            if (this.f65143k.isEmpty()) {
                                this.f65143k = value.arrayElement_;
                                this.f65134b &= -257;
                            } else {
                                m90475p();
                                this.f65143k.addAll(value.arrayElement_);
                            }
                        }
                        if (value.hasArrayDimensionCount()) {
                            m90480u(value.getArrayDimensionCount());
                        }
                        if (value.hasFlags()) {
                            m90484y(value.getFlags());
                        }
                        m91333j(m91332e().m91156c(value.unknownFields));
                        return this;
                    }

                    /* JADX WARN: Code duplicated, block: B:15:0x001d  */
                    @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
                    /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
                    public Builder mo90459i(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws Throwable {
                        Value value = null;
                        try {
                            try {
                                Value valueMo90487d = Value.PARSER.mo90487d(codedInputStream, extensionRegistryLite);
                                if (valueMo90487d != null) {
                                    mo90458f(valueMo90487d);
                                }
                                return this;
                            } catch (InvalidProtocolBufferException e) {
                                Value value2 = (Value) e.getUnfinishedMessage();
                                try {
                                    throw e;
                                } catch (Throwable th) {
                                    th = th;
                                    value = value2;
                                    if (value != null) {
                                        mo90458f(value);
                                    }
                                    throw th;
                                }
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            if (value != null) {
                                mo90458f(value);
                            }
                            throw th;
                        }
                    }

                    /* JADX INFO: renamed from: u */
                    public Builder m90480u(int i) {
                        this.f65134b |= 512;
                        this.f65144l = i;
                        return this;
                    }

                    /* JADX INFO: renamed from: v */
                    public Builder m90481v(int i) {
                        this.f65134b |= 32;
                        this.f65140h = i;
                        return this;
                    }

                    /* JADX INFO: renamed from: w */
                    public Builder m90482w(double d) {
                        this.f65134b |= 8;
                        this.f65138f = d;
                        return this;
                    }

                    /* JADX INFO: renamed from: x */
                    public Builder m90483x(int i) {
                        this.f65134b |= 64;
                        this.f65141i = i;
                        return this;
                    }

                    /* JADX INFO: renamed from: y */
                    public Builder m90484y(int i) {
                        this.f65134b |= 1024;
                        this.f65145m = i;
                        return this;
                    }

                    /* JADX INFO: renamed from: z */
                    public Builder m90485z(float f) {
                        this.f65134b |= 4;
                        this.f65137e = f;
                        return this;
                    }
                }

                public enum Type implements Internal.EnumLite {
                    BYTE(0, 0),
                    CHAR(1, 1),
                    SHORT(2, 2),
                    INT(3, 3),
                    LONG(4, 4),
                    FLOAT(5, 5),
                    DOUBLE(6, 6),
                    BOOLEAN(7, 7),
                    STRING(8, 8),
                    CLASS(9, 9),
                    ENUM(10, 10),
                    ANNOTATION(11, 11),
                    ARRAY(12, 12);

                    private static Internal.EnumLiteMap<Type> internalValueMap = new C15235a();
                    private final int value;

                    /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Annotation$Argument$Value$Type$a */
                    public static class C15235a implements Internal.EnumLiteMap<Type> {
                        @Override // kotlin.reflect.jvm.internal.impl.protobuf.Internal.EnumLiteMap
                        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                        public Type findValueByNumber(int i) {
                            return Type.valueOf(i);
                        }
                    }

                    Type(int i, int i2) {
                        this.value = i2;
                    }

                    public static Type valueOf(int i) {
                        switch (i) {
                            case 0:
                                return BYTE;
                            case 1:
                                return CHAR;
                            case 2:
                                return SHORT;
                            case 3:
                                return INT;
                            case 4:
                                return LONG;
                            case 5:
                                return FLOAT;
                            case 6:
                                return DOUBLE;
                            case 7:
                                return BOOLEAN;
                            case 8:
                                return STRING;
                            case 9:
                                return CLASS;
                            case 10:
                                return ENUM;
                            case 11:
                                return ANNOTATION;
                            case 12:
                                return ARRAY;
                            default:
                                return null;
                        }
                    }

                    @Override // kotlin.reflect.jvm.internal.impl.protobuf.Internal.EnumLite
                    public final int getNumber() {
                        return this.value;
                    }
                }

                /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Annotation$Argument$Value$a */
                public static class C15236a extends AbstractParser<Value> {
                    @Override // kotlin.reflect.jvm.internal.impl.protobuf.Parser
                    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
                    public Value mo90487d(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                        return new Value(codedInputStream, extensionRegistryLite);
                    }
                }

                static {
                    Value value = new Value(true);
                    defaultInstance = value;
                    value.initFields();
                }

                private Value(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                    this.memoizedIsInitialized = (byte) -1;
                    this.memoizedSerializedSize = -1;
                    initFields();
                    ByteString.Output outputM91150w = ByteString.m91150w();
                    CodedOutputStream codedOutputStreamM91226K = CodedOutputStream.m91226K(outputM91150w, 1);
                    boolean z = false;
                    char c = 0;
                    while (!z) {
                        try {
                            try {
                                int iM91185K = codedInputStream.m91185K();
                                switch (iM91185K) {
                                    case 0:
                                        break;
                                    case 8:
                                        int iM91204n = codedInputStream.m91204n();
                                        Type typeValueOf = Type.valueOf(iM91204n);
                                        if (typeValueOf == null) {
                                            codedOutputStreamM91226K.m91291s0(iM91185K);
                                            codedOutputStreamM91226K.m91291s0(iM91204n);
                                        } else {
                                            this.bitField0_ |= 1;
                                            this.type_ = typeValueOf;
                                            continue;
                                        }
                                        break;
                                    case 16:
                                        this.bitField0_ |= 2;
                                        this.intValue_ = codedInputStream.m91182H();
                                        continue;
                                    case 29:
                                        this.bitField0_ |= 4;
                                        this.floatValue_ = codedInputStream.m91207q();
                                        continue;
                                    case 33:
                                        this.bitField0_ |= 8;
                                        this.doubleValue_ = codedInputStream.m91203m();
                                        continue;
                                    case 40:
                                        this.bitField0_ |= 16;
                                        this.stringValue_ = codedInputStream.m91209s();
                                        continue;
                                    case 48:
                                        this.bitField0_ |= 32;
                                        this.classId_ = codedInputStream.m91209s();
                                        continue;
                                    case 56:
                                        this.bitField0_ |= 64;
                                        this.enumValueId_ = codedInputStream.m91209s();
                                        continue;
                                    case 66:
                                        Builder builder = (this.bitField0_ & 128) == 128 ? this.annotation_.toBuilder() : null;
                                        Annotation annotation = (Annotation) codedInputStream.m91211u(Annotation.PARSER, extensionRegistryLite);
                                        this.annotation_ = annotation;
                                        if (builder != null) {
                                            builder.mo90458f(annotation);
                                            this.annotation_ = builder.m90494m();
                                        }
                                        this.bitField0_ |= 128;
                                        continue;
                                    case 74:
                                        if ((c & 256) != 256) {
                                            this.arrayElement_ = new ArrayList();
                                            c = 256;
                                        }
                                        this.arrayElement_.add((Value) codedInputStream.m91211u(PARSER, extensionRegistryLite));
                                        continue;
                                    case 80:
                                        this.bitField0_ |= 512;
                                        this.flags_ = codedInputStream.m91209s();
                                        continue;
                                    case 88:
                                        this.bitField0_ |= 256;
                                        this.arrayDimensionCount_ = codedInputStream.m91209s();
                                        continue;
                                    default:
                                        if (!parseUnknownField(codedInputStream, codedOutputStreamM91226K, extensionRegistryLite, iM91185K)) {
                                            break;
                                        }
                                        break;
                                }
                                z = true;
                            } catch (Throwable th) {
                                if ((c & 256) == 256) {
                                    this.arrayElement_ = Collections.unmodifiableList(this.arrayElement_);
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
                    if ((c & 256) == 256) {
                        this.arrayElement_ = Collections.unmodifiableList(this.arrayElement_);
                    }
                    try {
                        codedOutputStreamM91226K.m91258J();
                    } catch (IOException unused2) {
                    } finally {
                        this.unknownFields = outputM91150w.m91170m();
                    }
                    makeExtensionsImmutable();
                }

                public static Value getDefaultInstance() {
                    return defaultInstance;
                }

                private void initFields() {
                    this.type_ = Type.BYTE;
                    this.intValue_ = 0L;
                    this.floatValue_ = 0.0f;
                    this.doubleValue_ = FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
                    this.stringValue_ = 0;
                    this.classId_ = 0;
                    this.enumValueId_ = 0;
                    this.annotation_ = Annotation.getDefaultInstance();
                    this.arrayElement_ = Collections.EMPTY_LIST;
                    this.arrayDimensionCount_ = 0;
                    this.flags_ = 0;
                }

                public static Builder newBuilder(Value value) {
                    return newBuilder().mo90458f(value);
                }

                public Annotation getAnnotation() {
                    return this.annotation_;
                }

                public int getArrayDimensionCount() {
                    return this.arrayDimensionCount_;
                }

                public Value getArrayElement(int i) {
                    return this.arrayElement_.get(i);
                }

                public int getArrayElementCount() {
                    return this.arrayElement_.size();
                }

                public List<Value> getArrayElementList() {
                    return this.arrayElement_;
                }

                public int getClassId() {
                    return this.classId_;
                }

                public double getDoubleValue() {
                    return this.doubleValue_;
                }

                public int getEnumValueId() {
                    return this.enumValueId_;
                }

                public int getFlags() {
                    return this.flags_;
                }

                public float getFloatValue() {
                    return this.floatValue_;
                }

                public long getIntValue() {
                    return this.intValue_;
                }

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
                public Parser<Value> getParserForType() {
                    return PARSER;
                }

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
                public int getSerializedSize() {
                    int i = this.memoizedSerializedSize;
                    if (i != -1) {
                        return i;
                    }
                    int iM91236i = (this.bitField0_ & 1) == 1 ? CodedOutputStream.m91236i(1, this.type_.getNumber()) : 0;
                    if ((this.bitField0_ & 2) == 2) {
                        iM91236i += CodedOutputStream.m91218B(2, this.intValue_);
                    }
                    if ((this.bitField0_ & 4) == 4) {
                        iM91236i += CodedOutputStream.m91240m(3, this.floatValue_);
                    }
                    if ((this.bitField0_ & 8) == 8) {
                        iM91236i += CodedOutputStream.m91234g(4, this.doubleValue_);
                    }
                    if ((this.bitField0_ & 16) == 16) {
                        iM91236i += CodedOutputStream.m91243p(5, this.stringValue_);
                    }
                    if ((this.bitField0_ & 32) == 32) {
                        iM91236i += CodedOutputStream.m91243p(6, this.classId_);
                    }
                    if ((this.bitField0_ & 64) == 64) {
                        iM91236i += CodedOutputStream.m91243p(7, this.enumValueId_);
                    }
                    if ((this.bitField0_ & 128) == 128) {
                        iM91236i += CodedOutputStream.m91247t(8, this.annotation_);
                    }
                    for (int i2 = 0; i2 < this.arrayElement_.size(); i2++) {
                        iM91236i += CodedOutputStream.m91247t(9, this.arrayElement_.get(i2));
                    }
                    if ((this.bitField0_ & 512) == 512) {
                        iM91236i += CodedOutputStream.m91243p(10, this.flags_);
                    }
                    if ((this.bitField0_ & 256) == 256) {
                        iM91236i += CodedOutputStream.m91243p(11, this.arrayDimensionCount_);
                    }
                    int size = iM91236i + this.unknownFields.size();
                    this.memoizedSerializedSize = size;
                    return size;
                }

                public int getStringValue() {
                    return this.stringValue_;
                }

                public Type getType() {
                    return this.type_;
                }

                public boolean hasAnnotation() {
                    return (this.bitField0_ & 128) == 128;
                }

                public boolean hasArrayDimensionCount() {
                    return (this.bitField0_ & 256) == 256;
                }

                public boolean hasClassId() {
                    return (this.bitField0_ & 32) == 32;
                }

                public boolean hasDoubleValue() {
                    return (this.bitField0_ & 8) == 8;
                }

                public boolean hasEnumValueId() {
                    return (this.bitField0_ & 64) == 64;
                }

                public boolean hasFlags() {
                    return (this.bitField0_ & 512) == 512;
                }

                public boolean hasFloatValue() {
                    return (this.bitField0_ & 4) == 4;
                }

                public boolean hasIntValue() {
                    return (this.bitField0_ & 2) == 2;
                }

                public boolean hasStringValue() {
                    return (this.bitField0_ & 16) == 16;
                }

                public boolean hasType() {
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
                    if (hasAnnotation() && !getAnnotation().isInitialized()) {
                        this.memoizedIsInitialized = (byte) 0;
                        return false;
                    }
                    for (int i = 0; i < getArrayElementCount(); i++) {
                        if (!getArrayElement(i).isInitialized()) {
                            this.memoizedIsInitialized = (byte) 0;
                            return false;
                        }
                    }
                    this.memoizedIsInitialized = (byte) 1;
                    return true;
                }

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
                public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
                    getSerializedSize();
                    if ((this.bitField0_ & 1) == 1) {
                        codedOutputStream.m91268W(1, this.type_.getNumber());
                    }
                    if ((this.bitField0_ & 2) == 2) {
                        codedOutputStream.m91296x0(2, this.intValue_);
                    }
                    if ((this.bitField0_ & 4) == 4) {
                        codedOutputStream.m91273a0(3, this.floatValue_);
                    }
                    if ((this.bitField0_ & 8) == 8) {
                        codedOutputStream.m91266U(4, this.doubleValue_);
                    }
                    if ((this.bitField0_ & 16) == 16) {
                        codedOutputStream.m91277e0(5, this.stringValue_);
                    }
                    if ((this.bitField0_ & 32) == 32) {
                        codedOutputStream.m91277e0(6, this.classId_);
                    }
                    if ((this.bitField0_ & 64) == 64) {
                        codedOutputStream.m91277e0(7, this.enumValueId_);
                    }
                    if ((this.bitField0_ & 128) == 128) {
                        codedOutputStream.m91280h0(8, this.annotation_);
                    }
                    for (int i = 0; i < this.arrayElement_.size(); i++) {
                        codedOutputStream.m91280h0(9, this.arrayElement_.get(i));
                    }
                    if ((this.bitField0_ & 512) == 512) {
                        codedOutputStream.m91277e0(10, this.flags_);
                    }
                    if ((this.bitField0_ & 256) == 256) {
                        codedOutputStream.m91277e0(11, this.arrayDimensionCount_);
                    }
                    codedOutputStream.m91285m0(this.unknownFields);
                }

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite
                public Value getDefaultInstanceForType() {
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
                    return Builder.m90468o();
                }

                private Value(GeneratedMessageLite.Builder builder) {
                    super(builder);
                    this.memoizedIsInitialized = (byte) -1;
                    this.memoizedSerializedSize = -1;
                    this.unknownFields = builder.m91332e();
                }

                private Value(boolean z) {
                    this.memoizedIsInitialized = (byte) -1;
                    this.memoizedSerializedSize = -1;
                    this.unknownFields = ByteString.f65615a;
                }
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite
            public Argument getDefaultInstanceForType() {
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
                return Builder.m90453o();
            }

            private Argument(GeneratedMessageLite.Builder builder) {
                super(builder);
                this.memoizedIsInitialized = (byte) -1;
                this.memoizedSerializedSize = -1;
                this.unknownFields = builder.m91332e();
            }

            private Argument(boolean z) {
                this.memoizedIsInitialized = (byte) -1;
                this.memoizedSerializedSize = -1;
                this.unknownFields = ByteString.f65615a;
            }
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite
        public Annotation getDefaultInstanceForType() {
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
            return Builder.m90491o();
        }

        private Annotation(GeneratedMessageLite.Builder builder) {
            super(builder);
            this.memoizedIsInitialized = (byte) -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = builder.m91332e();
        }

        private Annotation(boolean z) {
            this.memoizedIsInitialized = (byte) -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = ByteString.f65615a;
        }
    }

    public static final class QualifiedNameTable extends GeneratedMessageLite implements QualifiedNameTableOrBuilder {
        public static Parser<QualifiedNameTable> PARSER = new C15259a();
        private static final QualifiedNameTable defaultInstance;
        private byte memoizedIsInitialized;
        private int memoizedSerializedSize;
        private List<QualifiedName> qualifiedName_;
        private final ByteString unknownFields;

        public static final class Builder extends GeneratedMessageLite.Builder<QualifiedNameTable, Builder> implements QualifiedNameTableOrBuilder {

            /* JADX INFO: renamed from: b */
            public int f65254b;

            /* JADX INFO: renamed from: c */
            public List<QualifiedName> f65255c = Collections.EMPTY_LIST;

            private Builder() {
                m90704q();
            }

            /* JADX INFO: renamed from: o */
            public static Builder m90703o() {
                return new Builder();
            }

            /* JADX INFO: renamed from: q */
            private void m90704q() {
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
            public QualifiedNameTable build() {
                QualifiedNameTable qualifiedNameTableM90706m = m90706m();
                if (qualifiedNameTableM90706m.isInitialized()) {
                    return qualifiedNameTableM90706m;
                }
                throw AbstractMessageLite.Builder.m91133c(qualifiedNameTableM90706m);
            }

            /* JADX INFO: renamed from: m */
            public QualifiedNameTable m90706m() {
                QualifiedNameTable qualifiedNameTable = new QualifiedNameTable(this);
                if ((this.f65254b & 1) == 1) {
                    this.f65255c = Collections.unmodifiableList(this.f65255c);
                    this.f65254b &= -2;
                }
                qualifiedNameTable.qualifiedName_ = this.f65255c;
                return qualifiedNameTable;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder
            /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
            public Builder mo90523m() {
                return m90703o().mo90458f(m90706m());
            }

            /* JADX INFO: renamed from: p */
            public final void m90708p() {
                if ((this.f65254b & 1) != 1) {
                    this.f65255c = new ArrayList(this.f65255c);
                    this.f65254b |= 1;
                }
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder
            /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
            public Builder mo90458f(QualifiedNameTable qualifiedNameTable) {
                if (qualifiedNameTable == QualifiedNameTable.getDefaultInstance()) {
                    return this;
                }
                if (!qualifiedNameTable.qualifiedName_.isEmpty()) {
                    if (this.f65255c.isEmpty()) {
                        this.f65255c = qualifiedNameTable.qualifiedName_;
                        this.f65254b &= -2;
                    } else {
                        m90708p();
                        this.f65255c.addAll(qualifiedNameTable.qualifiedName_);
                    }
                }
                m91333j(m91332e().m91156c(qualifiedNameTable.unknownFields));
                return this;
            }

            /* JADX WARN: Code duplicated, block: B:15:0x001d  */
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
            public Builder mo90459i(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws Throwable {
                QualifiedNameTable qualifiedNameTable = null;
                try {
                    try {
                        QualifiedNameTable qualifiedNameTableMo90487d = QualifiedNameTable.PARSER.mo90487d(codedInputStream, extensionRegistryLite);
                        if (qualifiedNameTableMo90487d != null) {
                            mo90458f(qualifiedNameTableMo90487d);
                        }
                        return this;
                    } catch (InvalidProtocolBufferException e) {
                        QualifiedNameTable qualifiedNameTable2 = (QualifiedNameTable) e.getUnfinishedMessage();
                        try {
                            throw e;
                        } catch (Throwable th) {
                            th = th;
                            qualifiedNameTable = qualifiedNameTable2;
                            if (qualifiedNameTable != null) {
                                mo90458f(qualifiedNameTable);
                            }
                            throw th;
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                    if (qualifiedNameTable != null) {
                        mo90458f(qualifiedNameTable);
                    }
                    throw th;
                }
            }
        }

        public interface QualifiedNameOrBuilder extends MessageLiteOrBuilder {
        }

        /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$QualifiedNameTable$a */
        public static class C15259a extends AbstractParser<QualifiedNameTable> {
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.Parser
            /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
            public QualifiedNameTable mo90487d(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return new QualifiedNameTable(codedInputStream, extensionRegistryLite);
            }
        }

        static {
            QualifiedNameTable qualifiedNameTable = new QualifiedNameTable(true);
            defaultInstance = qualifiedNameTable;
            qualifiedNameTable.initFields();
        }

        private QualifiedNameTable(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            this.memoizedIsInitialized = (byte) -1;
            this.memoizedSerializedSize = -1;
            initFields();
            ByteString.Output outputM91150w = ByteString.m91150w();
            CodedOutputStream codedOutputStreamM91226K = CodedOutputStream.m91226K(outputM91150w, 1);
            boolean z = false;
            boolean z2 = false;
            while (!z) {
                try {
                    try {
                        try {
                            int iM91185K = codedInputStream.m91185K();
                            if (iM91185K != 0) {
                                if (iM91185K == 10) {
                                    if (!z2) {
                                        this.qualifiedName_ = new ArrayList();
                                        z2 = true;
                                    }
                                    this.qualifiedName_.add((QualifiedName) codedInputStream.m91211u(QualifiedName.PARSER, extensionRegistryLite));
                                } else if (!parseUnknownField(codedInputStream, codedOutputStreamM91226K, extensionRegistryLite, iM91185K)) {
                                }
                            }
                            z = true;
                        } catch (InvalidProtocolBufferException e) {
                            throw e.setUnfinishedMessage(this);
                        }
                    } catch (IOException e2) {
                        throw new InvalidProtocolBufferException(e2.getMessage()).setUnfinishedMessage(this);
                    }
                } catch (Throwable th) {
                    if (z2) {
                        this.qualifiedName_ = Collections.unmodifiableList(this.qualifiedName_);
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
            if (z2) {
                this.qualifiedName_ = Collections.unmodifiableList(this.qualifiedName_);
            }
            try {
                codedOutputStreamM91226K.m91258J();
            } catch (IOException unused2) {
            } finally {
                this.unknownFields = outputM91150w.m91170m();
            }
            makeExtensionsImmutable();
        }

        public static QualifiedNameTable getDefaultInstance() {
            return defaultInstance;
        }

        private void initFields() {
            this.qualifiedName_ = Collections.EMPTY_LIST;
        }

        public static Builder newBuilder(QualifiedNameTable qualifiedNameTable) {
            return newBuilder().mo90458f(qualifiedNameTable);
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public Parser<QualifiedNameTable> getParserForType() {
            return PARSER;
        }

        public QualifiedName getQualifiedName(int i) {
            return this.qualifiedName_.get(i);
        }

        public int getQualifiedNameCount() {
            return this.qualifiedName_.size();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int iM91247t = 0;
            for (int i2 = 0; i2 < this.qualifiedName_.size(); i2++) {
                iM91247t += CodedOutputStream.m91247t(1, this.qualifiedName_.get(i2));
            }
            int size = iM91247t + this.unknownFields.size();
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
            for (int i = 0; i < getQualifiedNameCount(); i++) {
                if (!getQualifiedName(i).isInitialized()) {
                    this.memoizedIsInitialized = (byte) 0;
                    return false;
                }
            }
            this.memoizedIsInitialized = (byte) 1;
            return true;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            getSerializedSize();
            for (int i = 0; i < this.qualifiedName_.size(); i++) {
                codedOutputStream.m91280h0(1, this.qualifiedName_.get(i));
            }
            codedOutputStream.m91285m0(this.unknownFields);
        }

        public static final class QualifiedName extends GeneratedMessageLite implements QualifiedNameOrBuilder {
            public static Parser<QualifiedName> PARSER = new C15258a();
            private static final QualifiedName defaultInstance;
            private int bitField0_;
            private Kind kind_;
            private byte memoizedIsInitialized;
            private int memoizedSerializedSize;
            private int parentQualifiedName_;
            private int shortName_;
            private final ByteString unknownFields;

            public static final class Builder extends GeneratedMessageLite.Builder<QualifiedName, Builder> implements QualifiedNameOrBuilder {

                /* JADX INFO: renamed from: b */
                public int f65256b;

                /* JADX INFO: renamed from: d */
                public int f65258d;

                /* JADX INFO: renamed from: c */
                public int f65257c = -1;

                /* JADX INFO: renamed from: e */
                public Kind f65259e = Kind.PACKAGE;

                private Builder() {
                    m90713p();
                }

                /* JADX INFO: renamed from: o */
                public static Builder m90712o() {
                    return new Builder();
                }

                /* JADX INFO: renamed from: p */
                private void m90713p() {
                }

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
                /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
                public QualifiedName build() {
                    QualifiedName qualifiedNameM90715m = m90715m();
                    if (qualifiedNameM90715m.isInitialized()) {
                        return qualifiedNameM90715m;
                    }
                    throw AbstractMessageLite.Builder.m91133c(qualifiedNameM90715m);
                }

                /* JADX INFO: renamed from: m */
                public QualifiedName m90715m() {
                    QualifiedName qualifiedName = new QualifiedName(this);
                    int i = this.f65256b;
                    int i2 = (i & 1) != 1 ? 0 : 1;
                    qualifiedName.parentQualifiedName_ = this.f65257c;
                    if ((i & 2) == 2) {
                        i2 |= 2;
                    }
                    qualifiedName.shortName_ = this.f65258d;
                    if ((i & 4) == 4) {
                        i2 |= 4;
                    }
                    qualifiedName.kind_ = this.f65259e;
                    qualifiedName.bitField0_ = i2;
                    return qualifiedName;
                }

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder
                /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
                public Builder mo90523m() {
                    return m90712o().mo90458f(m90715m());
                }

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder
                /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
                public Builder mo90458f(QualifiedName qualifiedName) {
                    if (qualifiedName == QualifiedName.getDefaultInstance()) {
                        return this;
                    }
                    if (qualifiedName.hasParentQualifiedName()) {
                        m90720t(qualifiedName.getParentQualifiedName());
                    }
                    if (qualifiedName.hasShortName()) {
                        m90721u(qualifiedName.getShortName());
                    }
                    if (qualifiedName.hasKind()) {
                        m90719s(qualifiedName.getKind());
                    }
                    m91333j(m91332e().m91156c(qualifiedName.unknownFields));
                    return this;
                }

                /* JADX WARN: Code duplicated, block: B:15:0x001d  */
                @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
                /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
                public Builder mo90459i(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws Throwable {
                    QualifiedName qualifiedName = null;
                    try {
                        try {
                            QualifiedName qualifiedNameMo90487d = QualifiedName.PARSER.mo90487d(codedInputStream, extensionRegistryLite);
                            if (qualifiedNameMo90487d != null) {
                                mo90458f(qualifiedNameMo90487d);
                            }
                            return this;
                        } catch (InvalidProtocolBufferException e) {
                            QualifiedName qualifiedName2 = (QualifiedName) e.getUnfinishedMessage();
                            try {
                                throw e;
                            } catch (Throwable th) {
                                th = th;
                                qualifiedName = qualifiedName2;
                                if (qualifiedName != null) {
                                    mo90458f(qualifiedName);
                                }
                                throw th;
                            }
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        if (qualifiedName != null) {
                            mo90458f(qualifiedName);
                        }
                        throw th;
                    }
                }

                /* JADX INFO: renamed from: s */
                public Builder m90719s(Kind kind) {
                    kind.getClass();
                    this.f65256b |= 4;
                    this.f65259e = kind;
                    return this;
                }

                /* JADX INFO: renamed from: t */
                public Builder m90720t(int i) {
                    this.f65256b |= 1;
                    this.f65257c = i;
                    return this;
                }

                /* JADX INFO: renamed from: u */
                public Builder m90721u(int i) {
                    this.f65256b |= 2;
                    this.f65258d = i;
                    return this;
                }
            }

            public enum Kind implements Internal.EnumLite {
                CLASS(0, 0),
                PACKAGE(1, 1),
                LOCAL(2, 2);

                private static Internal.EnumLiteMap<Kind> internalValueMap = new C15257a();
                private final int value;

                /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$QualifiedNameTable$QualifiedName$Kind$a */
                public static class C15257a implements Internal.EnumLiteMap<Kind> {
                    @Override // kotlin.reflect.jvm.internal.impl.protobuf.Internal.EnumLiteMap
                    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                    public Kind findValueByNumber(int i) {
                        return Kind.valueOf(i);
                    }
                }

                Kind(int i, int i2) {
                    this.value = i2;
                }

                public static Kind valueOf(int i) {
                    if (i == 0) {
                        return CLASS;
                    }
                    if (i == 1) {
                        return PACKAGE;
                    }
                    if (i != 2) {
                        return null;
                    }
                    return LOCAL;
                }

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.Internal.EnumLite
                public final int getNumber() {
                    return this.value;
                }
            }

            /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$QualifiedNameTable$QualifiedName$a */
            public static class C15258a extends AbstractParser<QualifiedName> {
                @Override // kotlin.reflect.jvm.internal.impl.protobuf.Parser
                /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
                public QualifiedName mo90487d(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                    return new QualifiedName(codedInputStream, extensionRegistryLite);
                }
            }

            static {
                QualifiedName qualifiedName = new QualifiedName(true);
                defaultInstance = qualifiedName;
                qualifiedName.initFields();
            }

            private QualifiedName(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                this.memoizedIsInitialized = (byte) -1;
                this.memoizedSerializedSize = -1;
                initFields();
                ByteString.Output outputM91150w = ByteString.m91150w();
                CodedOutputStream codedOutputStreamM91226K = CodedOutputStream.m91226K(outputM91150w, 1);
                boolean z = false;
                while (!z) {
                    try {
                        try {
                            try {
                                int iM91185K = codedInputStream.m91185K();
                                if (iM91185K != 0) {
                                    if (iM91185K == 8) {
                                        this.bitField0_ |= 1;
                                        this.parentQualifiedName_ = codedInputStream.m91209s();
                                    } else if (iM91185K == 16) {
                                        this.bitField0_ |= 2;
                                        this.shortName_ = codedInputStream.m91209s();
                                    } else if (iM91185K == 24) {
                                        int iM91204n = codedInputStream.m91204n();
                                        Kind kindValueOf = Kind.valueOf(iM91204n);
                                        if (kindValueOf == null) {
                                            codedOutputStreamM91226K.m91291s0(iM91185K);
                                            codedOutputStreamM91226K.m91291s0(iM91204n);
                                        } else {
                                            this.bitField0_ |= 4;
                                            this.kind_ = kindValueOf;
                                        }
                                    } else if (!parseUnknownField(codedInputStream, codedOutputStreamM91226K, extensionRegistryLite, iM91185K)) {
                                    }
                                }
                                z = true;
                            } catch (InvalidProtocolBufferException e) {
                                throw e.setUnfinishedMessage(this);
                            }
                        } catch (IOException e2) {
                            throw new InvalidProtocolBufferException(e2.getMessage()).setUnfinishedMessage(this);
                        }
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
                }
                try {
                    codedOutputStreamM91226K.m91258J();
                } catch (IOException unused2) {
                } finally {
                    this.unknownFields = outputM91150w.m91170m();
                }
                makeExtensionsImmutable();
            }

            public static QualifiedName getDefaultInstance() {
                return defaultInstance;
            }

            private void initFields() {
                this.parentQualifiedName_ = -1;
                this.shortName_ = 0;
                this.kind_ = Kind.PACKAGE;
            }

            public static Builder newBuilder(QualifiedName qualifiedName) {
                return newBuilder().mo90458f(qualifiedName);
            }

            public Kind getKind() {
                return this.kind_;
            }

            public int getParentQualifiedName() {
                return this.parentQualifiedName_;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
            public Parser<QualifiedName> getParserForType() {
                return PARSER;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
            public int getSerializedSize() {
                int i = this.memoizedSerializedSize;
                if (i != -1) {
                    return i;
                }
                int iM91243p = (this.bitField0_ & 1) == 1 ? CodedOutputStream.m91243p(1, this.parentQualifiedName_) : 0;
                if ((this.bitField0_ & 2) == 2) {
                    iM91243p += CodedOutputStream.m91243p(2, this.shortName_);
                }
                if ((this.bitField0_ & 4) == 4) {
                    iM91243p += CodedOutputStream.m91236i(3, this.kind_.getNumber());
                }
                int size = iM91243p + this.unknownFields.size();
                this.memoizedSerializedSize = size;
                return size;
            }

            public int getShortName() {
                return this.shortName_;
            }

            public boolean hasKind() {
                return (this.bitField0_ & 4) == 4;
            }

            public boolean hasParentQualifiedName() {
                return (this.bitField0_ & 1) == 1;
            }

            public boolean hasShortName() {
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
                if (hasShortName()) {
                    this.memoizedIsInitialized = (byte) 1;
                    return true;
                }
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
            public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
                getSerializedSize();
                if ((this.bitField0_ & 1) == 1) {
                    codedOutputStream.m91277e0(1, this.parentQualifiedName_);
                }
                if ((this.bitField0_ & 2) == 2) {
                    codedOutputStream.m91277e0(2, this.shortName_);
                }
                if ((this.bitField0_ & 4) == 4) {
                    codedOutputStream.m91268W(3, this.kind_.getNumber());
                }
                codedOutputStream.m91285m0(this.unknownFields);
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite
            public QualifiedName getDefaultInstanceForType() {
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
                return Builder.m90712o();
            }

            private QualifiedName(GeneratedMessageLite.Builder builder) {
                super(builder);
                this.memoizedIsInitialized = (byte) -1;
                this.memoizedSerializedSize = -1;
                this.unknownFields = builder.m91332e();
            }

            private QualifiedName(boolean z) {
                this.memoizedIsInitialized = (byte) -1;
                this.memoizedSerializedSize = -1;
                this.unknownFields = ByteString.f65615a;
            }
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite
        public QualifiedNameTable getDefaultInstanceForType() {
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
            return Builder.m90703o();
        }

        private QualifiedNameTable(GeneratedMessageLite.Builder builder) {
            super(builder);
            this.memoizedIsInitialized = (byte) -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = builder.m91332e();
        }

        private QualifiedNameTable(boolean z) {
            this.memoizedIsInitialized = (byte) -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = ByteString.f65615a;
        }
    }

    public static final class Type extends GeneratedMessageLite.ExtendableMessage<Type> implements TypeOrBuilder {
        public static Parser<Type> PARSER = new C15263a();
        private static final Type defaultInstance;
        private int abbreviatedTypeId_;
        private Type abbreviatedType_;
        private List<Argument> argument_;
        private int bitField0_;
        private int className_;
        private int flags_;
        private int flexibleTypeCapabilitiesId_;
        private int flexibleUpperBoundId_;
        private Type flexibleUpperBound_;
        private byte memoizedIsInitialized;
        private int memoizedSerializedSize;
        private boolean nullable_;
        private int outerTypeId_;
        private Type outerType_;
        private int typeAliasName_;
        private int typeParameterName_;
        private int typeParameter_;
        private final ByteString unknownFields;

        public interface ArgumentOrBuilder extends MessageLiteOrBuilder {
        }

        public static final class Builder extends GeneratedMessageLite.ExtendableBuilder<Type, Builder> implements TypeOrBuilder {

            /* JADX INFO: renamed from: d */
            public int f65267d;

            /* JADX INFO: renamed from: f */
            public boolean f65269f;

            /* JADX INFO: renamed from: g */
            public int f65270g;

            /* JADX INFO: renamed from: i */
            public int f65272i;

            /* JADX INFO: renamed from: j */
            public int f65273j;

            /* JADX INFO: renamed from: k */
            public int f65274k;

            /* JADX INFO: renamed from: l */
            public int f65275l;

            /* JADX INFO: renamed from: m */
            public int f65276m;

            /* JADX INFO: renamed from: o */
            public int f65278o;

            /* JADX INFO: renamed from: q */
            public int f65280q;

            /* JADX INFO: renamed from: r */
            public int f65281r;

            /* JADX INFO: renamed from: e */
            public List<Argument> f65268e = Collections.EMPTY_LIST;

            /* JADX INFO: renamed from: h */
            public Type f65271h = Type.getDefaultInstance();

            /* JADX INFO: renamed from: n */
            public Type f65277n = Type.getDefaultInstance();

            /* JADX INFO: renamed from: p */
            public Type f65279p = Type.getDefaultInstance();

            private Builder() {
                m90751v();
            }

            /* JADX INFO: renamed from: t */
            public static Builder m90749t() {
                return new Builder();
            }

            /* JADX INFO: renamed from: u */
            private void m90750u() {
                if ((this.f65267d & 1) != 1) {
                    this.f65268e = new ArrayList(this.f65268e);
                    this.f65267d |= 1;
                }
            }

            /* JADX INFO: renamed from: v */
            private void m90751v() {
            }

            /* JADX INFO: renamed from: A */
            public Builder m90752A(Type type) {
                if ((this.f65267d & 512) != 512 || this.f65277n == Type.getDefaultInstance()) {
                    this.f65277n = type;
                } else {
                    this.f65277n = Type.newBuilder(this.f65277n).mo90458f(type).m90764r();
                }
                this.f65267d |= 512;
                return this;
            }

            /* JADX INFO: renamed from: B */
            public Builder m90753B(int i) {
                this.f65267d |= 4096;
                this.f65280q = i;
                return this;
            }

            /* JADX INFO: renamed from: C */
            public Builder m90754C(int i) {
                this.f65267d |= 32;
                this.f65273j = i;
                return this;
            }

            /* JADX INFO: renamed from: D */
            public Builder m90755D(int i) {
                this.f65267d |= 8192;
                this.f65281r = i;
                return this;
            }

            /* JADX INFO: renamed from: E */
            public Builder m90756E(int i) {
                this.f65267d |= 4;
                this.f65270g = i;
                return this;
            }

            /* JADX INFO: renamed from: G */
            public Builder m90757G(int i) {
                this.f65267d |= 16;
                this.f65272i = i;
                return this;
            }

            /* JADX INFO: renamed from: K */
            public Builder m90758K(boolean z) {
                this.f65267d |= 2;
                this.f65269f = z;
                return this;
            }

            /* JADX INFO: renamed from: L */
            public Builder m90759L(int i) {
                this.f65267d |= 1024;
                this.f65278o = i;
                return this;
            }

            /* JADX INFO: renamed from: M */
            public Builder m90760M(int i) {
                this.f65267d |= 256;
                this.f65276m = i;
                return this;
            }

            /* JADX INFO: renamed from: N */
            public Builder m90761N(int i) {
                this.f65267d |= 64;
                this.f65274k = i;
                return this;
            }

            /* JADX INFO: renamed from: O */
            public Builder m90762O(int i) {
                this.f65267d |= 128;
                this.f65275l = i;
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
            public Type build() {
                Type typeM90764r = m90764r();
                if (typeM90764r.isInitialized()) {
                    return typeM90764r;
                }
                throw AbstractMessageLite.Builder.m91133c(typeM90764r);
            }

            /* JADX INFO: renamed from: r */
            public Type m90764r() {
                Type type = new Type(this);
                int i = this.f65267d;
                if ((i & 1) == 1) {
                    this.f65268e = Collections.unmodifiableList(this.f65268e);
                    this.f65267d &= -2;
                }
                type.argument_ = this.f65268e;
                int i2 = (i & 2) != 2 ? 0 : 1;
                type.nullable_ = this.f65269f;
                if ((i & 4) == 4) {
                    i2 |= 2;
                }
                type.flexibleTypeCapabilitiesId_ = this.f65270g;
                if ((i & 8) == 8) {
                    i2 |= 4;
                }
                type.flexibleUpperBound_ = this.f65271h;
                if ((i & 16) == 16) {
                    i2 |= 8;
                }
                type.flexibleUpperBoundId_ = this.f65272i;
                if ((i & 32) == 32) {
                    i2 |= 16;
                }
                type.className_ = this.f65273j;
                if ((i & 64) == 64) {
                    i2 |= 32;
                }
                type.typeParameter_ = this.f65274k;
                if ((i & 128) == 128) {
                    i2 |= 64;
                }
                type.typeParameterName_ = this.f65275l;
                if ((i & 256) == 256) {
                    i2 |= 128;
                }
                type.typeAliasName_ = this.f65276m;
                if ((i & 512) == 512) {
                    i2 |= 256;
                }
                type.outerType_ = this.f65277n;
                if ((i & 1024) == 1024) {
                    i2 |= 512;
                }
                type.outerTypeId_ = this.f65278o;
                if ((i & 2048) == 2048) {
                    i2 |= 1024;
                }
                type.abbreviatedType_ = this.f65279p;
                if ((i & 4096) == 4096) {
                    i2 |= 2048;
                }
                type.abbreviatedTypeId_ = this.f65280q;
                if ((i & 8192) == 8192) {
                    i2 |= 4096;
                }
                type.flags_ = this.f65281r;
                type.bitField0_ = i2;
                return type;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableBuilder
            /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
            public Builder mo90523m() {
                return m90749t().mo90458f(m90764r());
            }

            /* JADX INFO: renamed from: w */
            public Builder m90766w(Type type) {
                if ((this.f65267d & 2048) != 2048 || this.f65279p == Type.getDefaultInstance()) {
                    this.f65279p = type;
                } else {
                    this.f65279p = Type.newBuilder(this.f65279p).mo90458f(type).m90764r();
                }
                this.f65267d |= 2048;
                return this;
            }

            /* JADX INFO: renamed from: x */
            public Builder m90767x(Type type) {
                if ((this.f65267d & 8) != 8 || this.f65271h == Type.getDefaultInstance()) {
                    this.f65271h = type;
                } else {
                    this.f65271h = Type.newBuilder(this.f65271h).mo90458f(type).m90764r();
                }
                this.f65267d |= 8;
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder
            /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
            public Builder mo90458f(Type type) {
                if (type == Type.getDefaultInstance()) {
                    return this;
                }
                if (!type.argument_.isEmpty()) {
                    if (this.f65268e.isEmpty()) {
                        this.f65268e = type.argument_;
                        this.f65267d &= -2;
                    } else {
                        m90750u();
                        this.f65268e.addAll(type.argument_);
                    }
                }
                if (type.hasNullable()) {
                    m90758K(type.getNullable());
                }
                if (type.hasFlexibleTypeCapabilitiesId()) {
                    m90756E(type.getFlexibleTypeCapabilitiesId());
                }
                if (type.hasFlexibleUpperBound()) {
                    m90767x(type.getFlexibleUpperBound());
                }
                if (type.hasFlexibleUpperBoundId()) {
                    m90757G(type.getFlexibleUpperBoundId());
                }
                if (type.hasClassName()) {
                    m90754C(type.getClassName());
                }
                if (type.hasTypeParameter()) {
                    m90761N(type.getTypeParameter());
                }
                if (type.hasTypeParameterName()) {
                    m90762O(type.getTypeParameterName());
                }
                if (type.hasTypeAliasName()) {
                    m90760M(type.getTypeAliasName());
                }
                if (type.hasOuterType()) {
                    m90752A(type.getOuterType());
                }
                if (type.hasOuterTypeId()) {
                    m90759L(type.getOuterTypeId());
                }
                if (type.hasAbbreviatedType()) {
                    m90766w(type.getAbbreviatedType());
                }
                if (type.hasAbbreviatedTypeId()) {
                    m90753B(type.getAbbreviatedTypeId());
                }
                if (type.hasFlags()) {
                    m90755D(type.getFlags());
                }
                m91337o(type);
                m91333j(m91332e().m91156c(type.unknownFields));
                return this;
            }

            /* JADX WARN: Code duplicated, block: B:15:0x001d  */
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
            public Builder mo90459i(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws Throwable {
                Type type = null;
                try {
                    try {
                        Type typeMo90487d = Type.PARSER.mo90487d(codedInputStream, extensionRegistryLite);
                        if (typeMo90487d != null) {
                            mo90458f(typeMo90487d);
                        }
                        return this;
                    } catch (InvalidProtocolBufferException e) {
                        Type type2 = (Type) e.getUnfinishedMessage();
                        try {
                            throw e;
                        } catch (Throwable th) {
                            th = th;
                            type = type2;
                            if (type != null) {
                                mo90458f(type);
                            }
                            throw th;
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                    if (type != null) {
                        mo90458f(type);
                    }
                    throw th;
                }
            }
        }

        /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Type$a */
        public static class C15263a extends AbstractParser<Type> {
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.Parser
            /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
            public Type mo90487d(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return new Type(codedInputStream, extensionRegistryLite);
            }
        }

        static {
            Type type = new Type(true);
            defaultInstance = type;
            type.initFields();
        }

        private Type(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            Builder builder;
            this.memoizedIsInitialized = (byte) -1;
            this.memoizedSerializedSize = -1;
            initFields();
            ByteString.Output outputM91150w = ByteString.m91150w();
            CodedOutputStream codedOutputStreamM91226K = CodedOutputStream.m91226K(outputM91150w, 1);
            boolean z = false;
            boolean z2 = false;
            while (!z) {
                try {
                    try {
                        try {
                            int iM91185K = codedInputStream.m91185K();
                            switch (iM91185K) {
                                case 0:
                                    break;
                                case 8:
                                    this.bitField0_ |= 4096;
                                    this.flags_ = codedInputStream.m91209s();
                                    continue;
                                case 18:
                                    if (!z2) {
                                        this.argument_ = new ArrayList();
                                        z2 = true;
                                    }
                                    this.argument_.add((Argument) codedInputStream.m91211u(Argument.PARSER, extensionRegistryLite));
                                    continue;
                                case 24:
                                    this.bitField0_ |= 1;
                                    this.nullable_ = codedInputStream.m91201k();
                                    continue;
                                case 32:
                                    this.bitField0_ |= 2;
                                    this.flexibleTypeCapabilitiesId_ = codedInputStream.m91209s();
                                    continue;
                                case 42:
                                    builder = (this.bitField0_ & 4) == 4 ? this.flexibleUpperBound_.toBuilder() : null;
                                    Type type = (Type) codedInputStream.m91211u(PARSER, extensionRegistryLite);
                                    this.flexibleUpperBound_ = type;
                                    if (builder != null) {
                                        builder.mo90458f(type);
                                        this.flexibleUpperBound_ = builder.m90764r();
                                    }
                                    this.bitField0_ |= 4;
                                    continue;
                                case 48:
                                    this.bitField0_ |= 16;
                                    this.className_ = codedInputStream.m91209s();
                                    continue;
                                case 56:
                                    this.bitField0_ |= 32;
                                    this.typeParameter_ = codedInputStream.m91209s();
                                    continue;
                                case 64:
                                    this.bitField0_ |= 8;
                                    this.flexibleUpperBoundId_ = codedInputStream.m91209s();
                                    continue;
                                case 72:
                                    this.bitField0_ |= 64;
                                    this.typeParameterName_ = codedInputStream.m91209s();
                                    continue;
                                case EACTags.COMMAND_TO_PERFORM /* 82 */:
                                    builder = (this.bitField0_ & 256) == 256 ? this.outerType_.toBuilder() : null;
                                    Type type2 = (Type) codedInputStream.m91211u(PARSER, extensionRegistryLite);
                                    this.outerType_ = type2;
                                    if (builder != null) {
                                        builder.mo90458f(type2);
                                        this.outerType_ = builder.m90764r();
                                    }
                                    this.bitField0_ |= 256;
                                    continue;
                                case 88:
                                    this.bitField0_ |= 512;
                                    this.outerTypeId_ = codedInputStream.m91209s();
                                    continue;
                                case Opcodes.IADD /* 96 */:
                                    this.bitField0_ |= 128;
                                    this.typeAliasName_ = codedInputStream.m91209s();
                                    continue;
                                case 106:
                                    builder = (this.bitField0_ & 1024) == 1024 ? this.abbreviatedType_.toBuilder() : null;
                                    Type type3 = (Type) codedInputStream.m91211u(PARSER, extensionRegistryLite);
                                    this.abbreviatedType_ = type3;
                                    if (builder != null) {
                                        builder.mo90458f(type3);
                                        this.abbreviatedType_ = builder.m90764r();
                                    }
                                    this.bitField0_ |= 1024;
                                    continue;
                                case 112:
                                    this.bitField0_ |= 2048;
                                    this.abbreviatedTypeId_ = codedInputStream.m91209s();
                                    continue;
                                default:
                                    if (!parseUnknownField(codedInputStream, codedOutputStreamM91226K, extensionRegistryLite, iM91185K)) {
                                        break;
                                    }
                                    break;
                            }
                            z = true;
                        } catch (InvalidProtocolBufferException e) {
                            throw e.setUnfinishedMessage(this);
                        }
                    } catch (IOException e2) {
                        throw new InvalidProtocolBufferException(e2.getMessage()).setUnfinishedMessage(this);
                    }
                } catch (Throwable th) {
                    if (z2) {
                        this.argument_ = Collections.unmodifiableList(this.argument_);
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
            if (z2) {
                this.argument_ = Collections.unmodifiableList(this.argument_);
            }
            try {
                codedOutputStreamM91226K.m91258J();
            } catch (IOException unused2) {
            } finally {
                this.unknownFields = outputM91150w.m91170m();
            }
            makeExtensionsImmutable();
        }

        public static Type getDefaultInstance() {
            return defaultInstance;
        }

        private void initFields() {
            this.argument_ = Collections.EMPTY_LIST;
            this.nullable_ = false;
            this.flexibleTypeCapabilitiesId_ = 0;
            this.flexibleUpperBound_ = getDefaultInstance();
            this.flexibleUpperBoundId_ = 0;
            this.className_ = 0;
            this.typeParameter_ = 0;
            this.typeParameterName_ = 0;
            this.typeAliasName_ = 0;
            this.outerType_ = getDefaultInstance();
            this.outerTypeId_ = 0;
            this.abbreviatedType_ = getDefaultInstance();
            this.abbreviatedTypeId_ = 0;
            this.flags_ = 0;
        }

        public static Builder newBuilder(Type type) {
            return newBuilder().mo90458f(type);
        }

        public Type getAbbreviatedType() {
            return this.abbreviatedType_;
        }

        public int getAbbreviatedTypeId() {
            return this.abbreviatedTypeId_;
        }

        public Argument getArgument(int i) {
            return this.argument_.get(i);
        }

        public int getArgumentCount() {
            return this.argument_.size();
        }

        public List<Argument> getArgumentList() {
            return this.argument_;
        }

        public int getClassName() {
            return this.className_;
        }

        public int getFlags() {
            return this.flags_;
        }

        public int getFlexibleTypeCapabilitiesId() {
            return this.flexibleTypeCapabilitiesId_;
        }

        public Type getFlexibleUpperBound() {
            return this.flexibleUpperBound_;
        }

        public int getFlexibleUpperBoundId() {
            return this.flexibleUpperBoundId_;
        }

        public boolean getNullable() {
            return this.nullable_;
        }

        public Type getOuterType() {
            return this.outerType_;
        }

        public int getOuterTypeId() {
            return this.outerTypeId_;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public Parser<Type> getParserForType() {
            return PARSER;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableMessage, kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int iM91243p = (this.bitField0_ & 4096) == 4096 ? CodedOutputStream.m91243p(1, this.flags_) : 0;
            for (int i2 = 0; i2 < this.argument_.size(); i2++) {
                iM91243p += CodedOutputStream.m91247t(2, this.argument_.get(i2));
            }
            if ((this.bitField0_ & 1) == 1) {
                iM91243p += CodedOutputStream.m91229b(3, this.nullable_);
            }
            if ((this.bitField0_ & 2) == 2) {
                iM91243p += CodedOutputStream.m91243p(4, this.flexibleTypeCapabilitiesId_);
            }
            if ((this.bitField0_ & 4) == 4) {
                iM91243p += CodedOutputStream.m91247t(5, this.flexibleUpperBound_);
            }
            if ((this.bitField0_ & 16) == 16) {
                iM91243p += CodedOutputStream.m91243p(6, this.className_);
            }
            if ((this.bitField0_ & 32) == 32) {
                iM91243p += CodedOutputStream.m91243p(7, this.typeParameter_);
            }
            if ((this.bitField0_ & 8) == 8) {
                iM91243p += CodedOutputStream.m91243p(8, this.flexibleUpperBoundId_);
            }
            if ((this.bitField0_ & 64) == 64) {
                iM91243p += CodedOutputStream.m91243p(9, this.typeParameterName_);
            }
            if ((this.bitField0_ & 256) == 256) {
                iM91243p += CodedOutputStream.m91247t(10, this.outerType_);
            }
            if ((this.bitField0_ & 512) == 512) {
                iM91243p += CodedOutputStream.m91243p(11, this.outerTypeId_);
            }
            if ((this.bitField0_ & 128) == 128) {
                iM91243p += CodedOutputStream.m91243p(12, this.typeAliasName_);
            }
            if ((this.bitField0_ & 1024) == 1024) {
                iM91243p += CodedOutputStream.m91247t(13, this.abbreviatedType_);
            }
            if ((this.bitField0_ & 2048) == 2048) {
                iM91243p += CodedOutputStream.m91243p(14, this.abbreviatedTypeId_);
            }
            int iExtensionsSerializedSize = iM91243p + extensionsSerializedSize() + this.unknownFields.size();
            this.memoizedSerializedSize = iExtensionsSerializedSize;
            return iExtensionsSerializedSize;
        }

        public int getTypeAliasName() {
            return this.typeAliasName_;
        }

        public int getTypeParameter() {
            return this.typeParameter_;
        }

        public int getTypeParameterName() {
            return this.typeParameterName_;
        }

        public boolean hasAbbreviatedType() {
            return (this.bitField0_ & 1024) == 1024;
        }

        public boolean hasAbbreviatedTypeId() {
            return (this.bitField0_ & 2048) == 2048;
        }

        public boolean hasClassName() {
            return (this.bitField0_ & 16) == 16;
        }

        public boolean hasFlags() {
            return (this.bitField0_ & 4096) == 4096;
        }

        public boolean hasFlexibleTypeCapabilitiesId() {
            return (this.bitField0_ & 2) == 2;
        }

        public boolean hasFlexibleUpperBound() {
            return (this.bitField0_ & 4) == 4;
        }

        public boolean hasFlexibleUpperBoundId() {
            return (this.bitField0_ & 8) == 8;
        }

        public boolean hasNullable() {
            return (this.bitField0_ & 1) == 1;
        }

        public boolean hasOuterType() {
            return (this.bitField0_ & 256) == 256;
        }

        public boolean hasOuterTypeId() {
            return (this.bitField0_ & 512) == 512;
        }

        public boolean hasTypeAliasName() {
            return (this.bitField0_ & 128) == 128;
        }

        public boolean hasTypeParameter() {
            return (this.bitField0_ & 32) == 32;
        }

        public boolean hasTypeParameterName() {
            return (this.bitField0_ & 64) == 64;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableMessage, kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            byte b = this.memoizedIsInitialized;
            if (b == 1) {
                return true;
            }
            if (b == 0) {
                return false;
            }
            for (int i = 0; i < getArgumentCount(); i++) {
                if (!getArgument(i).isInitialized()) {
                    this.memoizedIsInitialized = (byte) 0;
                    return false;
                }
            }
            if (hasFlexibleUpperBound() && !getFlexibleUpperBound().isInitialized()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (hasOuterType() && !getOuterType().isInitialized()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (hasAbbreviatedType() && !getAbbreviatedType().isInitialized()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (extensionsAreInitialized()) {
                this.memoizedIsInitialized = (byte) 1;
                return true;
            }
            this.memoizedIsInitialized = (byte) 0;
            return false;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableMessage, kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            getSerializedSize();
            GeneratedMessageLite.ExtendableMessage<MessageType>.ExtensionWriter extensionWriterNewExtensionWriter = newExtensionWriter();
            if ((this.bitField0_ & 4096) == 4096) {
                codedOutputStream.m91277e0(1, this.flags_);
            }
            for (int i = 0; i < this.argument_.size(); i++) {
                codedOutputStream.m91280h0(2, this.argument_.get(i));
            }
            if ((this.bitField0_ & 1) == 1) {
                codedOutputStream.m91261P(3, this.nullable_);
            }
            if ((this.bitField0_ & 2) == 2) {
                codedOutputStream.m91277e0(4, this.flexibleTypeCapabilitiesId_);
            }
            if ((this.bitField0_ & 4) == 4) {
                codedOutputStream.m91280h0(5, this.flexibleUpperBound_);
            }
            if ((this.bitField0_ & 16) == 16) {
                codedOutputStream.m91277e0(6, this.className_);
            }
            if ((this.bitField0_ & 32) == 32) {
                codedOutputStream.m91277e0(7, this.typeParameter_);
            }
            if ((this.bitField0_ & 8) == 8) {
                codedOutputStream.m91277e0(8, this.flexibleUpperBoundId_);
            }
            if ((this.bitField0_ & 64) == 64) {
                codedOutputStream.m91277e0(9, this.typeParameterName_);
            }
            if ((this.bitField0_ & 256) == 256) {
                codedOutputStream.m91280h0(10, this.outerType_);
            }
            if ((this.bitField0_ & 512) == 512) {
                codedOutputStream.m91277e0(11, this.outerTypeId_);
            }
            if ((this.bitField0_ & 128) == 128) {
                codedOutputStream.m91277e0(12, this.typeAliasName_);
            }
            if ((this.bitField0_ & 1024) == 1024) {
                codedOutputStream.m91280h0(13, this.abbreviatedType_);
            }
            if ((this.bitField0_ & 2048) == 2048) {
                codedOutputStream.m91277e0(14, this.abbreviatedTypeId_);
            }
            extensionWriterNewExtensionWriter.m91338a(200, codedOutputStream);
            codedOutputStream.m91285m0(this.unknownFields);
        }

        public static final class Argument extends GeneratedMessageLite implements ArgumentOrBuilder {
            public static Parser<Argument> PARSER = new C15262a();
            private static final Argument defaultInstance;
            private int bitField0_;
            private byte memoizedIsInitialized;
            private int memoizedSerializedSize;
            private Projection projection_;
            private int typeId_;
            private Type type_;
            private final ByteString unknownFields;

            public static final class Builder extends GeneratedMessageLite.Builder<Argument, Builder> implements ArgumentOrBuilder {

                /* JADX INFO: renamed from: b */
                public int f65262b;

                /* JADX INFO: renamed from: c */
                public Projection f65263c = Projection.INV;

                /* JADX INFO: renamed from: d */
                public Type f65264d = Type.getDefaultInstance();

                /* JADX INFO: renamed from: e */
                public int f65265e;

                private Builder() {
                    m90737p();
                }

                /* JADX INFO: renamed from: o */
                public static Builder m90736o() {
                    return new Builder();
                }

                /* JADX INFO: renamed from: p */
                private void m90737p() {
                }

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
                /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
                public Argument build() {
                    Argument argumentM90739m = m90739m();
                    if (argumentM90739m.isInitialized()) {
                        return argumentM90739m;
                    }
                    throw AbstractMessageLite.Builder.m91133c(argumentM90739m);
                }

                /* JADX INFO: renamed from: m */
                public Argument m90739m() {
                    Argument argument = new Argument(this);
                    int i = this.f65262b;
                    int i2 = (i & 1) != 1 ? 0 : 1;
                    argument.projection_ = this.f65263c;
                    if ((i & 2) == 2) {
                        i2 |= 2;
                    }
                    argument.type_ = this.f65264d;
                    if ((i & 4) == 4) {
                        i2 |= 4;
                    }
                    argument.typeId_ = this.f65265e;
                    argument.bitField0_ = i2;
                    return argument;
                }

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder
                /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
                public Builder mo90523m() {
                    return m90736o().mo90458f(m90739m());
                }

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder
                /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
                public Builder mo90458f(Argument argument) {
                    if (argument == Argument.getDefaultInstance()) {
                        return this;
                    }
                    if (argument.hasProjection()) {
                        m90744t(argument.getProjection());
                    }
                    if (argument.hasType()) {
                        m90743s(argument.getType());
                    }
                    if (argument.hasTypeId()) {
                        m90745u(argument.getTypeId());
                    }
                    m91333j(m91332e().m91156c(argument.unknownFields));
                    return this;
                }

                /* JADX WARN: Code duplicated, block: B:15:0x001d  */
                @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
                /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
                public Builder mo90459i(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws Throwable {
                    Argument argument = null;
                    try {
                        try {
                            Argument argumentMo90487d = Argument.PARSER.mo90487d(codedInputStream, extensionRegistryLite);
                            if (argumentMo90487d != null) {
                                mo90458f(argumentMo90487d);
                            }
                            return this;
                        } catch (InvalidProtocolBufferException e) {
                            Argument argument2 = (Argument) e.getUnfinishedMessage();
                            try {
                                throw e;
                            } catch (Throwable th) {
                                th = th;
                                argument = argument2;
                                if (argument != null) {
                                    mo90458f(argument);
                                }
                                throw th;
                            }
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        if (argument != null) {
                            mo90458f(argument);
                        }
                        throw th;
                    }
                }

                /* JADX INFO: renamed from: s */
                public Builder m90743s(Type type) {
                    if ((this.f65262b & 2) != 2 || this.f65264d == Type.getDefaultInstance()) {
                        this.f65264d = type;
                    } else {
                        this.f65264d = Type.newBuilder(this.f65264d).mo90458f(type).m90764r();
                    }
                    this.f65262b |= 2;
                    return this;
                }

                /* JADX INFO: renamed from: t */
                public Builder m90744t(Projection projection) {
                    projection.getClass();
                    this.f65262b |= 1;
                    this.f65263c = projection;
                    return this;
                }

                /* JADX INFO: renamed from: u */
                public Builder m90745u(int i) {
                    this.f65262b |= 4;
                    this.f65265e = i;
                    return this;
                }
            }

            public enum Projection implements Internal.EnumLite {
                IN(0, 0),
                OUT(1, 1),
                INV(2, 2),
                STAR(3, 3);

                private static Internal.EnumLiteMap<Projection> internalValueMap = new C15261a();
                private final int value;

                /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Type$Argument$Projection$a */
                public static class C15261a implements Internal.EnumLiteMap<Projection> {
                    @Override // kotlin.reflect.jvm.internal.impl.protobuf.Internal.EnumLiteMap
                    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                    public Projection findValueByNumber(int i) {
                        return Projection.valueOf(i);
                    }
                }

                Projection(int i, int i2) {
                    this.value = i2;
                }

                public static Projection valueOf(int i) {
                    if (i == 0) {
                        return IN;
                    }
                    if (i == 1) {
                        return OUT;
                    }
                    if (i == 2) {
                        return INV;
                    }
                    if (i != 3) {
                        return null;
                    }
                    return STAR;
                }

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.Internal.EnumLite
                public final int getNumber() {
                    return this.value;
                }
            }

            /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Type$Argument$a */
            public static class C15262a extends AbstractParser<Argument> {
                @Override // kotlin.reflect.jvm.internal.impl.protobuf.Parser
                /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
                public Argument mo90487d(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                    return new Argument(codedInputStream, extensionRegistryLite);
                }
            }

            static {
                Argument argument = new Argument(true);
                defaultInstance = argument;
                argument.initFields();
            }

            private Argument(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                this.memoizedIsInitialized = (byte) -1;
                this.memoizedSerializedSize = -1;
                initFields();
                ByteString.Output outputM91150w = ByteString.m91150w();
                CodedOutputStream codedOutputStreamM91226K = CodedOutputStream.m91226K(outputM91150w, 1);
                boolean z = false;
                while (!z) {
                    try {
                        try {
                            try {
                                int iM91185K = codedInputStream.m91185K();
                                if (iM91185K != 0) {
                                    if (iM91185K == 8) {
                                        int iM91204n = codedInputStream.m91204n();
                                        Projection projectionValueOf = Projection.valueOf(iM91204n);
                                        if (projectionValueOf == null) {
                                            codedOutputStreamM91226K.m91291s0(iM91185K);
                                            codedOutputStreamM91226K.m91291s0(iM91204n);
                                        } else {
                                            this.bitField0_ |= 1;
                                            this.projection_ = projectionValueOf;
                                        }
                                    } else if (iM91185K == 18) {
                                        Builder builder = (this.bitField0_ & 2) == 2 ? this.type_.toBuilder() : null;
                                        Type type = (Type) codedInputStream.m91211u(Type.PARSER, extensionRegistryLite);
                                        this.type_ = type;
                                        if (builder != null) {
                                            builder.mo90458f(type);
                                            this.type_ = builder.m90764r();
                                        }
                                        this.bitField0_ |= 2;
                                    } else if (iM91185K == 24) {
                                        this.bitField0_ |= 4;
                                        this.typeId_ = codedInputStream.m91209s();
                                    } else if (!parseUnknownField(codedInputStream, codedOutputStreamM91226K, extensionRegistryLite, iM91185K)) {
                                    }
                                }
                                z = true;
                            } catch (InvalidProtocolBufferException e) {
                                throw e.setUnfinishedMessage(this);
                            }
                        } catch (IOException e2) {
                            throw new InvalidProtocolBufferException(e2.getMessage()).setUnfinishedMessage(this);
                        }
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
                }
                try {
                    codedOutputStreamM91226K.m91258J();
                } catch (IOException unused2) {
                } finally {
                    this.unknownFields = outputM91150w.m91170m();
                }
                makeExtensionsImmutable();
            }

            public static Argument getDefaultInstance() {
                return defaultInstance;
            }

            private void initFields() {
                this.projection_ = Projection.INV;
                this.type_ = Type.getDefaultInstance();
                this.typeId_ = 0;
            }

            public static Builder newBuilder(Argument argument) {
                return newBuilder().mo90458f(argument);
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
            public Parser<Argument> getParserForType() {
                return PARSER;
            }

            public Projection getProjection() {
                return this.projection_;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
            public int getSerializedSize() {
                int i = this.memoizedSerializedSize;
                if (i != -1) {
                    return i;
                }
                int iM91236i = (this.bitField0_ & 1) == 1 ? CodedOutputStream.m91236i(1, this.projection_.getNumber()) : 0;
                if ((this.bitField0_ & 2) == 2) {
                    iM91236i += CodedOutputStream.m91247t(2, this.type_);
                }
                if ((this.bitField0_ & 4) == 4) {
                    iM91236i += CodedOutputStream.m91243p(3, this.typeId_);
                }
                int size = iM91236i + this.unknownFields.size();
                this.memoizedSerializedSize = size;
                return size;
            }

            public Type getType() {
                return this.type_;
            }

            public int getTypeId() {
                return this.typeId_;
            }

            public boolean hasProjection() {
                return (this.bitField0_ & 1) == 1;
            }

            public boolean hasType() {
                return (this.bitField0_ & 2) == 2;
            }

            public boolean hasTypeId() {
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
                if (!hasType() || getType().isInitialized()) {
                    this.memoizedIsInitialized = (byte) 1;
                    return true;
                }
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
            public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
                getSerializedSize();
                if ((this.bitField0_ & 1) == 1) {
                    codedOutputStream.m91268W(1, this.projection_.getNumber());
                }
                if ((this.bitField0_ & 2) == 2) {
                    codedOutputStream.m91280h0(2, this.type_);
                }
                if ((this.bitField0_ & 4) == 4) {
                    codedOutputStream.m91277e0(3, this.typeId_);
                }
                codedOutputStream.m91285m0(this.unknownFields);
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite
            public Argument getDefaultInstanceForType() {
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
                return Builder.m90736o();
            }

            private Argument(GeneratedMessageLite.Builder builder) {
                super(builder);
                this.memoizedIsInitialized = (byte) -1;
                this.memoizedSerializedSize = -1;
                this.unknownFields = builder.m91332e();
            }

            private Argument(boolean z) {
                this.memoizedIsInitialized = (byte) -1;
                this.memoizedSerializedSize = -1;
                this.unknownFields = ByteString.f65615a;
            }
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableMessage, kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite
        public Type getDefaultInstanceForType() {
            return defaultInstance;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableMessage, kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public Builder newBuilderForType() {
            return newBuilder();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableMessage, kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public Builder toBuilder() {
            return newBuilder(this);
        }

        public static Builder newBuilder() {
            return Builder.m90749t();
        }

        private Type(GeneratedMessageLite.ExtendableBuilder<Type, ?> extendableBuilder) {
            super(extendableBuilder);
            this.memoizedIsInitialized = (byte) -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = extendableBuilder.m91332e();
        }

        private Type(boolean z) {
            this.memoizedIsInitialized = (byte) -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = ByteString.f65615a;
        }
    }

    public static final class Class extends GeneratedMessageLite.ExtendableMessage<Class> implements ClassOrBuilder {
        public static Parser<Class> PARSER = new C15240a();
        private static final Class defaultInstance;
        private List<Annotation> annotation_;
        private int bitField0_;
        private int companionObjectName_;
        private List<CompilerPluginData> compilerPluginData_;
        private List<Constructor> constructor_;
        private int contextReceiverTypeIdMemoizedSerializedSize;
        private List<Integer> contextReceiverTypeId_;
        private List<Type> contextReceiverType_;
        private List<EnumEntry> enumEntry_;
        private int flags_;
        private int fqName_;
        private List<Function> function_;
        private int inlineClassUnderlyingPropertyName_;
        private int inlineClassUnderlyingTypeId_;
        private Type inlineClassUnderlyingType_;
        private byte memoizedIsInitialized;
        private int memoizedSerializedSize;
        private int nestedClassNameMemoizedSerializedSize;
        private List<Integer> nestedClassName_;
        private List<Property> property_;
        private int sealedSubclassFqNameMemoizedSerializedSize;
        private List<Integer> sealedSubclassFqName_;
        private int supertypeIdMemoizedSerializedSize;
        private List<Integer> supertypeId_;
        private List<Type> supertype_;
        private List<TypeAlias> typeAlias_;
        private List<TypeParameter> typeParameter_;
        private TypeTable typeTable_;
        private final ByteString unknownFields;
        private VersionRequirementTable versionRequirementTable_;
        private List<Integer> versionRequirement_;

        public static final class Builder extends GeneratedMessageLite.ExtendableBuilder<Class, Builder> implements ClassOrBuilder {

            /* JADX INFO: renamed from: A */
            public List<CompilerPluginData> f65149A;

            /* JADX INFO: renamed from: d */
            public int f65150d;

            /* JADX INFO: renamed from: e */
            public int f65151e = 6;

            /* JADX INFO: renamed from: f */
            public int f65152f;

            /* JADX INFO: renamed from: g */
            public int f65153g;

            /* JADX INFO: renamed from: h */
            public List<TypeParameter> f65154h;

            /* JADX INFO: renamed from: i */
            public List<Type> f65155i;

            /* JADX INFO: renamed from: j */
            public List<Integer> f65156j;

            /* JADX INFO: renamed from: k */
            public List<Integer> f65157k;

            /* JADX INFO: renamed from: l */
            public List<Type> f65158l;

            /* JADX INFO: renamed from: m */
            public List<Integer> f65159m;

            /* JADX INFO: renamed from: n */
            public List<Constructor> f65160n;

            /* JADX INFO: renamed from: o */
            public List<Function> f65161o;

            /* JADX INFO: renamed from: p */
            public List<Property> f65162p;

            /* JADX INFO: renamed from: q */
            public List<TypeAlias> f65163q;

            /* JADX INFO: renamed from: r */
            public List<EnumEntry> f65164r;

            /* JADX INFO: renamed from: s */
            public List<Integer> f65165s;

            /* JADX INFO: renamed from: t */
            public int f65166t;

            /* JADX INFO: renamed from: u */
            public Type f65167u;

            /* JADX INFO: renamed from: v */
            public int f65168v;

            /* JADX INFO: renamed from: w */
            public List<Annotation> f65169w;

            /* JADX INFO: renamed from: x */
            public TypeTable f65170x;

            /* JADX INFO: renamed from: y */
            public List<Integer> f65171y;

            /* JADX INFO: renamed from: z */
            public VersionRequirementTable f65172z;

            private Builder() {
                List list = Collections.EMPTY_LIST;
                this.f65154h = list;
                this.f65155i = list;
                this.f65156j = list;
                this.f65157k = list;
                this.f65158l = list;
                this.f65159m = list;
                this.f65160n = list;
                this.f65161o = list;
                this.f65162p = list;
                this.f65163q = list;
                this.f65164r = list;
                this.f65165s = list;
                this.f65167u = Type.getDefaultInstance();
                this.f65169w = list;
                this.f65170x = TypeTable.getDefaultInstance();
                this.f65171y = list;
                this.f65172z = VersionRequirementTable.getDefaultInstance();
                this.f65149A = list;
                m90501N();
            }

            /* JADX INFO: renamed from: N */
            private void m90501N() {
            }

            /* JADX INFO: renamed from: t */
            public static Builder m90503t() {
                return new Builder();
            }

            /* JADX INFO: renamed from: A */
            public final void m90504A() {
                if ((this.f65150d & 1024) != 1024) {
                    this.f65161o = new ArrayList(this.f65161o);
                    this.f65150d |= 1024;
                }
            }

            /* JADX INFO: renamed from: B */
            public final void m90505B() {
                if ((this.f65150d & 64) != 64) {
                    this.f65157k = new ArrayList(this.f65157k);
                    this.f65150d |= 64;
                }
            }

            /* JADX INFO: renamed from: C */
            public final void m90506C() {
                if ((this.f65150d & 2048) != 2048) {
                    this.f65162p = new ArrayList(this.f65162p);
                    this.f65150d |= 2048;
                }
            }

            /* JADX INFO: renamed from: D */
            public final void m90507D() {
                if ((this.f65150d & 16384) != 16384) {
                    this.f65165s = new ArrayList(this.f65165s);
                    this.f65150d |= 16384;
                }
            }

            /* JADX INFO: renamed from: E */
            public final void m90508E() {
                if ((this.f65150d & 32) != 32) {
                    this.f65156j = new ArrayList(this.f65156j);
                    this.f65150d |= 32;
                }
            }

            /* JADX INFO: renamed from: G */
            public final void m90509G() {
                if ((this.f65150d & 16) != 16) {
                    this.f65155i = new ArrayList(this.f65155i);
                    this.f65150d |= 16;
                }
            }

            /* JADX INFO: renamed from: K */
            public final void m90510K() {
                if ((this.f65150d & 4096) != 4096) {
                    this.f65163q = new ArrayList(this.f65163q);
                    this.f65150d |= 4096;
                }
            }

            /* JADX INFO: renamed from: L */
            public final void m90511L() {
                if ((this.f65150d & 8) != 8) {
                    this.f65154h = new ArrayList(this.f65154h);
                    this.f65150d |= 8;
                }
            }

            /* JADX INFO: renamed from: M */
            public final void m90512M() {
                if ((this.f65150d & 1048576) != 1048576) {
                    this.f65171y = new ArrayList(this.f65171y);
                    this.f65150d |= 1048576;
                }
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder
            /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
            public Builder mo90458f(Class r3) {
                if (r3 == Class.getDefaultInstance()) {
                    return this;
                }
                if (r3.hasFlags()) {
                    m90519U(r3.getFlags());
                }
                if (r3.hasFqName()) {
                    m90520V(r3.getFqName());
                }
                if (r3.hasCompanionObjectName()) {
                    m90518T(r3.getCompanionObjectName());
                }
                if (!r3.typeParameter_.isEmpty()) {
                    if (this.f65154h.isEmpty()) {
                        this.f65154h = r3.typeParameter_;
                        this.f65150d &= -9;
                    } else {
                        m90511L();
                        this.f65154h.addAll(r3.typeParameter_);
                    }
                }
                if (!r3.supertype_.isEmpty()) {
                    if (this.f65155i.isEmpty()) {
                        this.f65155i = r3.supertype_;
                        this.f65150d &= -17;
                    } else {
                        m90509G();
                        this.f65155i.addAll(r3.supertype_);
                    }
                }
                if (!r3.supertypeId_.isEmpty()) {
                    if (this.f65156j.isEmpty()) {
                        this.f65156j = r3.supertypeId_;
                        this.f65150d &= -33;
                    } else {
                        m90508E();
                        this.f65156j.addAll(r3.supertypeId_);
                    }
                }
                if (!r3.nestedClassName_.isEmpty()) {
                    if (this.f65157k.isEmpty()) {
                        this.f65157k = r3.nestedClassName_;
                        this.f65150d &= -65;
                    } else {
                        m90505B();
                        this.f65157k.addAll(r3.nestedClassName_);
                    }
                }
                if (!r3.contextReceiverType_.isEmpty()) {
                    if (this.f65158l.isEmpty()) {
                        this.f65158l = r3.contextReceiverType_;
                        this.f65150d &= -129;
                    } else {
                        m90531y();
                        this.f65158l.addAll(r3.contextReceiverType_);
                    }
                }
                if (!r3.contextReceiverTypeId_.isEmpty()) {
                    if (this.f65159m.isEmpty()) {
                        this.f65159m = r3.contextReceiverTypeId_;
                        this.f65150d &= -257;
                    } else {
                        m90530x();
                        this.f65159m.addAll(r3.contextReceiverTypeId_);
                    }
                }
                if (!r3.constructor_.isEmpty()) {
                    if (this.f65160n.isEmpty()) {
                        this.f65160n = r3.constructor_;
                        this.f65150d &= -513;
                    } else {
                        m90529w();
                        this.f65160n.addAll(r3.constructor_);
                    }
                }
                if (!r3.function_.isEmpty()) {
                    if (this.f65161o.isEmpty()) {
                        this.f65161o = r3.function_;
                        this.f65150d &= ErrorCode.ERROR_CODE_JOIN_ROOM_ROOM_FORBIDDEN;
                    } else {
                        m90504A();
                        this.f65161o.addAll(r3.function_);
                    }
                }
                if (!r3.property_.isEmpty()) {
                    if (this.f65162p.isEmpty()) {
                        this.f65162p = r3.property_;
                        this.f65150d &= -2049;
                    } else {
                        m90506C();
                        this.f65162p.addAll(r3.property_);
                    }
                }
                if (!r3.typeAlias_.isEmpty()) {
                    if (this.f65163q.isEmpty()) {
                        this.f65163q = r3.typeAlias_;
                        this.f65150d &= -4097;
                    } else {
                        m90510K();
                        this.f65163q.addAll(r3.typeAlias_);
                    }
                }
                if (!r3.enumEntry_.isEmpty()) {
                    if (this.f65164r.isEmpty()) {
                        this.f65164r = r3.enumEntry_;
                        this.f65150d &= -8193;
                    } else {
                        m90532z();
                        this.f65164r.addAll(r3.enumEntry_);
                    }
                }
                if (!r3.sealedSubclassFqName_.isEmpty()) {
                    if (this.f65165s.isEmpty()) {
                        this.f65165s = r3.sealedSubclassFqName_;
                        this.f65150d &= -16385;
                    } else {
                        m90507D();
                        this.f65165s.addAll(r3.sealedSubclassFqName_);
                    }
                }
                if (r3.hasInlineClassUnderlyingPropertyName()) {
                    m90521W(r3.getInlineClassUnderlyingPropertyName());
                }
                if (r3.hasInlineClassUnderlyingType()) {
                    m90515Q(r3.getInlineClassUnderlyingType());
                }
                if (r3.hasInlineClassUnderlyingTypeId()) {
                    m90522X(r3.getInlineClassUnderlyingTypeId());
                }
                if (!r3.annotation_.isEmpty()) {
                    if (this.f65169w.isEmpty()) {
                        this.f65169w = r3.annotation_;
                        this.f65150d &= -262145;
                    } else {
                        m90527u();
                        this.f65169w.addAll(r3.annotation_);
                    }
                }
                if (r3.hasTypeTable()) {
                    m90516R(r3.getTypeTable());
                }
                if (!r3.versionRequirement_.isEmpty()) {
                    if (this.f65171y.isEmpty()) {
                        this.f65171y = r3.versionRequirement_;
                        this.f65150d &= -1048577;
                    } else {
                        m90512M();
                        this.f65171y.addAll(r3.versionRequirement_);
                    }
                }
                if (r3.hasVersionRequirementTable()) {
                    m90517S(r3.getVersionRequirementTable());
                }
                if (!r3.compilerPluginData_.isEmpty()) {
                    if (this.f65149A.isEmpty()) {
                        this.f65149A = r3.compilerPluginData_;
                        this.f65150d &= -4194305;
                    } else {
                        m90528v();
                        this.f65149A.addAll(r3.compilerPluginData_);
                    }
                }
                m91337o(r3);
                m91333j(m91332e().m91156c(r3.unknownFields));
                return this;
            }

            /* JADX WARN: Code duplicated, block: B:15:0x001d  */
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            /* JADX INFO: renamed from: P, reason: merged with bridge method [inline-methods] */
            public Builder mo90459i(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws Throwable {
                Class r0 = null;
                try {
                    try {
                        Class classMo90487d = Class.PARSER.mo90487d(codedInputStream, extensionRegistryLite);
                        if (classMo90487d != null) {
                            mo90458f(classMo90487d);
                        }
                        return this;
                    } catch (InvalidProtocolBufferException e) {
                        Class r4 = (Class) e.getUnfinishedMessage();
                        try {
                            throw e;
                        } catch (Throwable th) {
                            th = th;
                            r0 = r4;
                            if (r0 != null) {
                                mo90458f(r0);
                            }
                            throw th;
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                    if (r0 != null) {
                        mo90458f(r0);
                    }
                    throw th;
                }
            }

            /* JADX INFO: renamed from: Q */
            public Builder m90515Q(Type type) {
                if ((this.f65150d & 65536) != 65536 || this.f65167u == Type.getDefaultInstance()) {
                    this.f65167u = type;
                } else {
                    this.f65167u = Type.newBuilder(this.f65167u).mo90458f(type).m90764r();
                }
                this.f65150d |= 65536;
                return this;
            }

            /* JADX INFO: renamed from: R */
            public Builder m90516R(TypeTable typeTable) {
                if ((this.f65150d & 524288) != 524288 || this.f65170x == TypeTable.getDefaultInstance()) {
                    this.f65170x = typeTable;
                } else {
                    this.f65170x = TypeTable.newBuilder(this.f65170x).mo90458f(typeTable).m90810m();
                }
                this.f65150d |= 524288;
                return this;
            }

            /* JADX INFO: renamed from: S */
            public Builder m90517S(VersionRequirementTable versionRequirementTable) {
                if ((this.f65150d & 2097152) != 2097152 || this.f65172z == VersionRequirementTable.getDefaultInstance()) {
                    this.f65172z = versionRequirementTable;
                } else {
                    this.f65172z = VersionRequirementTable.newBuilder(this.f65172z).mo90458f(versionRequirementTable).m90855m();
                }
                this.f65150d |= 2097152;
                return this;
            }

            /* JADX INFO: renamed from: T */
            public Builder m90518T(int i) {
                this.f65150d |= 4;
                this.f65153g = i;
                return this;
            }

            /* JADX INFO: renamed from: U */
            public Builder m90519U(int i) {
                this.f65150d |= 1;
                this.f65151e = i;
                return this;
            }

            /* JADX INFO: renamed from: V */
            public Builder m90520V(int i) {
                this.f65150d |= 2;
                this.f65152f = i;
                return this;
            }

            /* JADX INFO: renamed from: W */
            public Builder m90521W(int i) {
                this.f65150d |= 32768;
                this.f65166t = i;
                return this;
            }

            /* JADX INFO: renamed from: X */
            public Builder m90522X(int i) {
                this.f65150d |= 131072;
                this.f65168v = i;
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
            public Class build() {
                Class classM90525r = m90525r();
                if (classM90525r.isInitialized()) {
                    return classM90525r;
                }
                throw AbstractMessageLite.Builder.m91133c(classM90525r);
            }

            /* JADX INFO: renamed from: r */
            public Class m90525r() {
                Class r0 = new Class(this);
                int i = this.f65150d;
                int i2 = (i & 1) != 1 ? 0 : 1;
                r0.flags_ = this.f65151e;
                if ((i & 2) == 2) {
                    i2 |= 2;
                }
                r0.fqName_ = this.f65152f;
                if ((i & 4) == 4) {
                    i2 |= 4;
                }
                r0.companionObjectName_ = this.f65153g;
                if ((this.f65150d & 8) == 8) {
                    this.f65154h = Collections.unmodifiableList(this.f65154h);
                    this.f65150d &= -9;
                }
                r0.typeParameter_ = this.f65154h;
                if ((this.f65150d & 16) == 16) {
                    this.f65155i = Collections.unmodifiableList(this.f65155i);
                    this.f65150d &= -17;
                }
                r0.supertype_ = this.f65155i;
                if ((this.f65150d & 32) == 32) {
                    this.f65156j = Collections.unmodifiableList(this.f65156j);
                    this.f65150d &= -33;
                }
                r0.supertypeId_ = this.f65156j;
                if ((this.f65150d & 64) == 64) {
                    this.f65157k = Collections.unmodifiableList(this.f65157k);
                    this.f65150d &= -65;
                }
                r0.nestedClassName_ = this.f65157k;
                if ((this.f65150d & 128) == 128) {
                    this.f65158l = Collections.unmodifiableList(this.f65158l);
                    this.f65150d &= -129;
                }
                r0.contextReceiverType_ = this.f65158l;
                if ((this.f65150d & 256) == 256) {
                    this.f65159m = Collections.unmodifiableList(this.f65159m);
                    this.f65150d &= -257;
                }
                r0.contextReceiverTypeId_ = this.f65159m;
                if ((this.f65150d & 512) == 512) {
                    this.f65160n = Collections.unmodifiableList(this.f65160n);
                    this.f65150d &= -513;
                }
                r0.constructor_ = this.f65160n;
                if ((this.f65150d & 1024) == 1024) {
                    this.f65161o = Collections.unmodifiableList(this.f65161o);
                    this.f65150d &= ErrorCode.ERROR_CODE_JOIN_ROOM_ROOM_FORBIDDEN;
                }
                r0.function_ = this.f65161o;
                if ((this.f65150d & 2048) == 2048) {
                    this.f65162p = Collections.unmodifiableList(this.f65162p);
                    this.f65150d &= -2049;
                }
                r0.property_ = this.f65162p;
                if ((this.f65150d & 4096) == 4096) {
                    this.f65163q = Collections.unmodifiableList(this.f65163q);
                    this.f65150d &= -4097;
                }
                r0.typeAlias_ = this.f65163q;
                if ((this.f65150d & 8192) == 8192) {
                    this.f65164r = Collections.unmodifiableList(this.f65164r);
                    this.f65150d &= -8193;
                }
                r0.enumEntry_ = this.f65164r;
                if ((this.f65150d & 16384) == 16384) {
                    this.f65165s = Collections.unmodifiableList(this.f65165s);
                    this.f65150d &= -16385;
                }
                r0.sealedSubclassFqName_ = this.f65165s;
                if ((i & 32768) == 32768) {
                    i2 |= 8;
                }
                r0.inlineClassUnderlyingPropertyName_ = this.f65166t;
                if ((i & 65536) == 65536) {
                    i2 |= 16;
                }
                r0.inlineClassUnderlyingType_ = this.f65167u;
                if ((i & 131072) == 131072) {
                    i2 |= 32;
                }
                r0.inlineClassUnderlyingTypeId_ = this.f65168v;
                if ((this.f65150d & 262144) == 262144) {
                    this.f65169w = Collections.unmodifiableList(this.f65169w);
                    this.f65150d &= -262145;
                }
                r0.annotation_ = this.f65169w;
                if ((i & 524288) == 524288) {
                    i2 |= 64;
                }
                r0.typeTable_ = this.f65170x;
                if ((this.f65150d & 1048576) == 1048576) {
                    this.f65171y = Collections.unmodifiableList(this.f65171y);
                    this.f65150d &= -1048577;
                }
                r0.versionRequirement_ = this.f65171y;
                if ((i & 2097152) == 2097152) {
                    i2 |= 128;
                }
                r0.versionRequirementTable_ = this.f65172z;
                if ((this.f65150d & 4194304) == 4194304) {
                    this.f65149A = Collections.unmodifiableList(this.f65149A);
                    this.f65150d &= -4194305;
                }
                r0.compilerPluginData_ = this.f65149A;
                r0.bitField0_ = i2;
                return r0;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableBuilder
            /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
            public Builder mo90523m() {
                return m90503t().mo90458f(m90525r());
            }

            /* JADX INFO: renamed from: u */
            public final void m90527u() {
                if ((this.f65150d & 262144) != 262144) {
                    this.f65169w = new ArrayList(this.f65169w);
                    this.f65150d |= 262144;
                }
            }

            /* JADX INFO: renamed from: v */
            public final void m90528v() {
                if ((this.f65150d & 4194304) != 4194304) {
                    this.f65149A = new ArrayList(this.f65149A);
                    this.f65150d |= 4194304;
                }
            }

            /* JADX INFO: renamed from: w */
            public final void m90529w() {
                if ((this.f65150d & 512) != 512) {
                    this.f65160n = new ArrayList(this.f65160n);
                    this.f65150d |= 512;
                }
            }

            /* JADX INFO: renamed from: x */
            public final void m90530x() {
                if ((this.f65150d & 256) != 256) {
                    this.f65159m = new ArrayList(this.f65159m);
                    this.f65150d |= 256;
                }
            }

            /* JADX INFO: renamed from: y */
            public final void m90531y() {
                if ((this.f65150d & 128) != 128) {
                    this.f65158l = new ArrayList(this.f65158l);
                    this.f65150d |= 128;
                }
            }

            /* JADX INFO: renamed from: z */
            public final void m90532z() {
                if ((this.f65150d & 8192) != 8192) {
                    this.f65164r = new ArrayList(this.f65164r);
                    this.f65150d |= 8192;
                }
            }
        }

        public enum Kind implements Internal.EnumLite {
            CLASS(0, 0),
            INTERFACE(1, 1),
            ENUM_CLASS(2, 2),
            ENUM_ENTRY(3, 3),
            ANNOTATION_CLASS(4, 4),
            OBJECT(5, 5),
            COMPANION_OBJECT(6, 6);

            private static Internal.EnumLiteMap<Kind> internalValueMap = new C15239a();
            private final int value;

            /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Class$Kind$a */
            public static class C15239a implements Internal.EnumLiteMap<Kind> {
                @Override // kotlin.reflect.jvm.internal.impl.protobuf.Internal.EnumLiteMap
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public Kind findValueByNumber(int i) {
                    return Kind.valueOf(i);
                }
            }

            Kind(int i, int i2) {
                this.value = i2;
            }

            public static Kind valueOf(int i) {
                switch (i) {
                    case 0:
                        return CLASS;
                    case 1:
                        return INTERFACE;
                    case 2:
                        return ENUM_CLASS;
                    case 3:
                        return ENUM_ENTRY;
                    case 4:
                        return ANNOTATION_CLASS;
                    case 5:
                        return OBJECT;
                    case 6:
                        return COMPANION_OBJECT;
                    default:
                        return null;
                }
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.Internal.EnumLite
            public final int getNumber() {
                return this.value;
            }
        }

        /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Class$a */
        public static class C15240a extends AbstractParser<Class> {
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.Parser
            /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
            public Class mo90487d(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return new Class(codedInputStream, extensionRegistryLite);
            }
        }

        static {
            Class r0 = new Class(true);
            defaultInstance = r0;
            r0.initFields();
        }

        /*  JADX ERROR: Types fix failed
            jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r7v0 ??, new type: int
            	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
            	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryPossibleTypes(FixTypesVisitor.java:186)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:245)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
            Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
            	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
            	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
            	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
            	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
            	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
            	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
            	... 5 more
            */
        private Class(kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream r22, kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite r23) throws kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException {
            /*
                Method dump skipped, instruction units count: 1602
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Class.<init>(kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream, kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite):void");
        }

        public static Class getDefaultInstance() {
            return defaultInstance;
        }

        private void initFields() {
            this.flags_ = 6;
            this.fqName_ = 0;
            this.companionObjectName_ = 0;
            List list = Collections.EMPTY_LIST;
            this.typeParameter_ = list;
            this.supertype_ = list;
            this.supertypeId_ = list;
            this.nestedClassName_ = list;
            this.contextReceiverType_ = list;
            this.contextReceiverTypeId_ = list;
            this.constructor_ = list;
            this.function_ = list;
            this.property_ = list;
            this.typeAlias_ = list;
            this.enumEntry_ = list;
            this.sealedSubclassFqName_ = list;
            this.inlineClassUnderlyingPropertyName_ = 0;
            this.inlineClassUnderlyingType_ = Type.getDefaultInstance();
            this.inlineClassUnderlyingTypeId_ = 0;
            this.annotation_ = list;
            this.typeTable_ = TypeTable.getDefaultInstance();
            this.versionRequirement_ = list;
            this.versionRequirementTable_ = VersionRequirementTable.getDefaultInstance();
            this.compilerPluginData_ = list;
        }

        public static Builder newBuilder(Class r1) {
            return newBuilder().mo90458f(r1);
        }

        public static Class parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return PARSER.mo91135b(inputStream, extensionRegistryLite);
        }

        public Annotation getAnnotation(int i) {
            return this.annotation_.get(i);
        }

        public int getAnnotationCount() {
            return this.annotation_.size();
        }

        public List<Annotation> getAnnotationList() {
            return this.annotation_;
        }

        public int getCompanionObjectName() {
            return this.companionObjectName_;
        }

        public CompilerPluginData getCompilerPluginData(int i) {
            return this.compilerPluginData_.get(i);
        }

        public int getCompilerPluginDataCount() {
            return this.compilerPluginData_.size();
        }

        public Constructor getConstructor(int i) {
            return this.constructor_.get(i);
        }

        public int getConstructorCount() {
            return this.constructor_.size();
        }

        public List<Constructor> getConstructorList() {
            return this.constructor_;
        }

        public Type getContextReceiverType(int i) {
            return this.contextReceiverType_.get(i);
        }

        public int getContextReceiverTypeCount() {
            return this.contextReceiverType_.size();
        }

        public List<Integer> getContextReceiverTypeIdList() {
            return this.contextReceiverTypeId_;
        }

        public List<Type> getContextReceiverTypeList() {
            return this.contextReceiverType_;
        }

        public EnumEntry getEnumEntry(int i) {
            return this.enumEntry_.get(i);
        }

        public int getEnumEntryCount() {
            return this.enumEntry_.size();
        }

        public List<EnumEntry> getEnumEntryList() {
            return this.enumEntry_;
        }

        public int getFlags() {
            return this.flags_;
        }

        public int getFqName() {
            return this.fqName_;
        }

        public Function getFunction(int i) {
            return this.function_.get(i);
        }

        public int getFunctionCount() {
            return this.function_.size();
        }

        public List<Function> getFunctionList() {
            return this.function_;
        }

        public int getInlineClassUnderlyingPropertyName() {
            return this.inlineClassUnderlyingPropertyName_;
        }

        public Type getInlineClassUnderlyingType() {
            return this.inlineClassUnderlyingType_;
        }

        public int getInlineClassUnderlyingTypeId() {
            return this.inlineClassUnderlyingTypeId_;
        }

        public List<Integer> getNestedClassNameList() {
            return this.nestedClassName_;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public Parser<Class> getParserForType() {
            return PARSER;
        }

        public Property getProperty(int i) {
            return this.property_.get(i);
        }

        public int getPropertyCount() {
            return this.property_.size();
        }

        public List<Property> getPropertyList() {
            return this.property_;
        }

        public List<Integer> getSealedSubclassFqNameList() {
            return this.sealedSubclassFqName_;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableMessage, kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int iM91243p = (this.bitField0_ & 1) == 1 ? CodedOutputStream.m91243p(1, this.flags_) : 0;
            int iM91244q = 0;
            for (int i2 = 0; i2 < this.supertypeId_.size(); i2++) {
                iM91244q += CodedOutputStream.m91244q(this.supertypeId_.get(i2).intValue());
            }
            int iM91247t = iM91243p + iM91244q;
            if (!getSupertypeIdList().isEmpty()) {
                iM91247t = iM91247t + 1 + CodedOutputStream.m91244q(iM91244q);
            }
            this.supertypeIdMemoizedSerializedSize = iM91244q;
            if ((this.bitField0_ & 2) == 2) {
                iM91247t += CodedOutputStream.m91243p(3, this.fqName_);
            }
            if ((this.bitField0_ & 4) == 4) {
                iM91247t += CodedOutputStream.m91243p(4, this.companionObjectName_);
            }
            for (int i3 = 0; i3 < this.typeParameter_.size(); i3++) {
                iM91247t += CodedOutputStream.m91247t(5, this.typeParameter_.get(i3));
            }
            for (int i4 = 0; i4 < this.supertype_.size(); i4++) {
                iM91247t += CodedOutputStream.m91247t(6, this.supertype_.get(i4));
            }
            int iM91244q2 = 0;
            for (int i5 = 0; i5 < this.nestedClassName_.size(); i5++) {
                iM91244q2 += CodedOutputStream.m91244q(this.nestedClassName_.get(i5).intValue());
            }
            int iM91247t2 = iM91247t + iM91244q2;
            if (!getNestedClassNameList().isEmpty()) {
                iM91247t2 = iM91247t2 + 1 + CodedOutputStream.m91244q(iM91244q2);
            }
            this.nestedClassNameMemoizedSerializedSize = iM91244q2;
            for (int i6 = 0; i6 < this.constructor_.size(); i6++) {
                iM91247t2 += CodedOutputStream.m91247t(8, this.constructor_.get(i6));
            }
            for (int i7 = 0; i7 < this.function_.size(); i7++) {
                iM91247t2 += CodedOutputStream.m91247t(9, this.function_.get(i7));
            }
            for (int i8 = 0; i8 < this.property_.size(); i8++) {
                iM91247t2 += CodedOutputStream.m91247t(10, this.property_.get(i8));
            }
            for (int i9 = 0; i9 < this.typeAlias_.size(); i9++) {
                iM91247t2 += CodedOutputStream.m91247t(11, this.typeAlias_.get(i9));
            }
            for (int i10 = 0; i10 < this.enumEntry_.size(); i10++) {
                iM91247t2 += CodedOutputStream.m91247t(13, this.enumEntry_.get(i10));
            }
            int iM91244q3 = 0;
            for (int i11 = 0; i11 < this.sealedSubclassFqName_.size(); i11++) {
                iM91244q3 += CodedOutputStream.m91244q(this.sealedSubclassFqName_.get(i11).intValue());
            }
            int iM91247t3 = iM91247t2 + iM91244q3;
            if (!getSealedSubclassFqNameList().isEmpty()) {
                iM91247t3 = iM91247t3 + 2 + CodedOutputStream.m91244q(iM91244q3);
            }
            this.sealedSubclassFqNameMemoizedSerializedSize = iM91244q3;
            if ((this.bitField0_ & 8) == 8) {
                iM91247t3 += CodedOutputStream.m91243p(17, this.inlineClassUnderlyingPropertyName_);
            }
            if ((this.bitField0_ & 16) == 16) {
                iM91247t3 += CodedOutputStream.m91247t(18, this.inlineClassUnderlyingType_);
            }
            if ((this.bitField0_ & 32) == 32) {
                iM91247t3 += CodedOutputStream.m91243p(19, this.inlineClassUnderlyingTypeId_);
            }
            for (int i12 = 0; i12 < this.contextReceiverType_.size(); i12++) {
                iM91247t3 += CodedOutputStream.m91247t(20, this.contextReceiverType_.get(i12));
            }
            int iM91244q4 = 0;
            for (int i13 = 0; i13 < this.contextReceiverTypeId_.size(); i13++) {
                iM91244q4 += CodedOutputStream.m91244q(this.contextReceiverTypeId_.get(i13).intValue());
            }
            int iM91247t4 = iM91247t3 + iM91244q4;
            if (!getContextReceiverTypeIdList().isEmpty()) {
                iM91247t4 = iM91247t4 + 2 + CodedOutputStream.m91244q(iM91244q4);
            }
            this.contextReceiverTypeIdMemoizedSerializedSize = iM91244q4;
            for (int i14 = 0; i14 < this.annotation_.size(); i14++) {
                iM91247t4 += CodedOutputStream.m91247t(25, this.annotation_.get(i14));
            }
            if ((this.bitField0_ & 64) == 64) {
                iM91247t4 += CodedOutputStream.m91247t(30, this.typeTable_);
            }
            int iM91244q5 = 0;
            for (int i15 = 0; i15 < this.versionRequirement_.size(); i15++) {
                iM91244q5 += CodedOutputStream.m91244q(this.versionRequirement_.get(i15).intValue());
            }
            int size = iM91247t4 + iM91244q5 + (getVersionRequirementList().size() * 2);
            if ((this.bitField0_ & 128) == 128) {
                size += CodedOutputStream.m91247t(32, this.versionRequirementTable_);
            }
            for (int i16 = 0; i16 < this.compilerPluginData_.size(); i16++) {
                size += CodedOutputStream.m91247t(33, this.compilerPluginData_.get(i16));
            }
            int iExtensionsSerializedSize = size + extensionsSerializedSize() + this.unknownFields.size();
            this.memoizedSerializedSize = iExtensionsSerializedSize;
            return iExtensionsSerializedSize;
        }

        public Type getSupertype(int i) {
            return this.supertype_.get(i);
        }

        public int getSupertypeCount() {
            return this.supertype_.size();
        }

        public List<Integer> getSupertypeIdList() {
            return this.supertypeId_;
        }

        public List<Type> getSupertypeList() {
            return this.supertype_;
        }

        public TypeAlias getTypeAlias(int i) {
            return this.typeAlias_.get(i);
        }

        public int getTypeAliasCount() {
            return this.typeAlias_.size();
        }

        public List<TypeAlias> getTypeAliasList() {
            return this.typeAlias_;
        }

        public TypeParameter getTypeParameter(int i) {
            return this.typeParameter_.get(i);
        }

        public int getTypeParameterCount() {
            return this.typeParameter_.size();
        }

        public List<TypeParameter> getTypeParameterList() {
            return this.typeParameter_;
        }

        public TypeTable getTypeTable() {
            return this.typeTable_;
        }

        public List<Integer> getVersionRequirementList() {
            return this.versionRequirement_;
        }

        public VersionRequirementTable getVersionRequirementTable() {
            return this.versionRequirementTable_;
        }

        public boolean hasCompanionObjectName() {
            return (this.bitField0_ & 4) == 4;
        }

        public boolean hasFlags() {
            return (this.bitField0_ & 1) == 1;
        }

        public boolean hasFqName() {
            return (this.bitField0_ & 2) == 2;
        }

        public boolean hasInlineClassUnderlyingPropertyName() {
            return (this.bitField0_ & 8) == 8;
        }

        public boolean hasInlineClassUnderlyingType() {
            return (this.bitField0_ & 16) == 16;
        }

        public boolean hasInlineClassUnderlyingTypeId() {
            return (this.bitField0_ & 32) == 32;
        }

        public boolean hasTypeTable() {
            return (this.bitField0_ & 64) == 64;
        }

        public boolean hasVersionRequirementTable() {
            return (this.bitField0_ & 128) == 128;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableMessage, kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            byte b = this.memoizedIsInitialized;
            if (b == 1) {
                return true;
            }
            if (b == 0) {
                return false;
            }
            if (!hasFqName()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            for (int i = 0; i < getTypeParameterCount(); i++) {
                if (!getTypeParameter(i).isInitialized()) {
                    this.memoizedIsInitialized = (byte) 0;
                    return false;
                }
            }
            for (int i2 = 0; i2 < getSupertypeCount(); i2++) {
                if (!getSupertype(i2).isInitialized()) {
                    this.memoizedIsInitialized = (byte) 0;
                    return false;
                }
            }
            for (int i3 = 0; i3 < getContextReceiverTypeCount(); i3++) {
                if (!getContextReceiverType(i3).isInitialized()) {
                    this.memoizedIsInitialized = (byte) 0;
                    return false;
                }
            }
            for (int i4 = 0; i4 < getConstructorCount(); i4++) {
                if (!getConstructor(i4).isInitialized()) {
                    this.memoizedIsInitialized = (byte) 0;
                    return false;
                }
            }
            for (int i5 = 0; i5 < getFunctionCount(); i5++) {
                if (!getFunction(i5).isInitialized()) {
                    this.memoizedIsInitialized = (byte) 0;
                    return false;
                }
            }
            for (int i6 = 0; i6 < getPropertyCount(); i6++) {
                if (!getProperty(i6).isInitialized()) {
                    this.memoizedIsInitialized = (byte) 0;
                    return false;
                }
            }
            for (int i7 = 0; i7 < getTypeAliasCount(); i7++) {
                if (!getTypeAlias(i7).isInitialized()) {
                    this.memoizedIsInitialized = (byte) 0;
                    return false;
                }
            }
            for (int i8 = 0; i8 < getEnumEntryCount(); i8++) {
                if (!getEnumEntry(i8).isInitialized()) {
                    this.memoizedIsInitialized = (byte) 0;
                    return false;
                }
            }
            if (hasInlineClassUnderlyingType() && !getInlineClassUnderlyingType().isInitialized()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            for (int i9 = 0; i9 < getAnnotationCount(); i9++) {
                if (!getAnnotation(i9).isInitialized()) {
                    this.memoizedIsInitialized = (byte) 0;
                    return false;
                }
            }
            if (hasTypeTable() && !getTypeTable().isInitialized()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            for (int i10 = 0; i10 < getCompilerPluginDataCount(); i10++) {
                if (!getCompilerPluginData(i10).isInitialized()) {
                    this.memoizedIsInitialized = (byte) 0;
                    return false;
                }
            }
            if (extensionsAreInitialized()) {
                this.memoizedIsInitialized = (byte) 1;
                return true;
            }
            this.memoizedIsInitialized = (byte) 0;
            return false;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableMessage, kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            getSerializedSize();
            GeneratedMessageLite.ExtendableMessage<MessageType>.ExtensionWriter extensionWriterNewExtensionWriter = newExtensionWriter();
            if ((this.bitField0_ & 1) == 1) {
                codedOutputStream.m91277e0(1, this.flags_);
            }
            if (getSupertypeIdList().size() > 0) {
                codedOutputStream.m91291s0(18);
                codedOutputStream.m91291s0(this.supertypeIdMemoizedSerializedSize);
            }
            for (int i = 0; i < this.supertypeId_.size(); i++) {
                codedOutputStream.m91278f0(this.supertypeId_.get(i).intValue());
            }
            if ((this.bitField0_ & 2) == 2) {
                codedOutputStream.m91277e0(3, this.fqName_);
            }
            if ((this.bitField0_ & 4) == 4) {
                codedOutputStream.m91277e0(4, this.companionObjectName_);
            }
            for (int i2 = 0; i2 < this.typeParameter_.size(); i2++) {
                codedOutputStream.m91280h0(5, this.typeParameter_.get(i2));
            }
            for (int i3 = 0; i3 < this.supertype_.size(); i3++) {
                codedOutputStream.m91280h0(6, this.supertype_.get(i3));
            }
            if (getNestedClassNameList().size() > 0) {
                codedOutputStream.m91291s0(58);
                codedOutputStream.m91291s0(this.nestedClassNameMemoizedSerializedSize);
            }
            for (int i4 = 0; i4 < this.nestedClassName_.size(); i4++) {
                codedOutputStream.m91278f0(this.nestedClassName_.get(i4).intValue());
            }
            for (int i5 = 0; i5 < this.constructor_.size(); i5++) {
                codedOutputStream.m91280h0(8, this.constructor_.get(i5));
            }
            for (int i6 = 0; i6 < this.function_.size(); i6++) {
                codedOutputStream.m91280h0(9, this.function_.get(i6));
            }
            for (int i7 = 0; i7 < this.property_.size(); i7++) {
                codedOutputStream.m91280h0(10, this.property_.get(i7));
            }
            for (int i8 = 0; i8 < this.typeAlias_.size(); i8++) {
                codedOutputStream.m91280h0(11, this.typeAlias_.get(i8));
            }
            for (int i9 = 0; i9 < this.enumEntry_.size(); i9++) {
                codedOutputStream.m91280h0(13, this.enumEntry_.get(i9));
            }
            if (getSealedSubclassFqNameList().size() > 0) {
                codedOutputStream.m91291s0(130);
                codedOutputStream.m91291s0(this.sealedSubclassFqNameMemoizedSerializedSize);
            }
            for (int i10 = 0; i10 < this.sealedSubclassFqName_.size(); i10++) {
                codedOutputStream.m91278f0(this.sealedSubclassFqName_.get(i10).intValue());
            }
            if ((this.bitField0_ & 8) == 8) {
                codedOutputStream.m91277e0(17, this.inlineClassUnderlyingPropertyName_);
            }
            if ((this.bitField0_ & 16) == 16) {
                codedOutputStream.m91280h0(18, this.inlineClassUnderlyingType_);
            }
            if ((this.bitField0_ & 32) == 32) {
                codedOutputStream.m91277e0(19, this.inlineClassUnderlyingTypeId_);
            }
            for (int i11 = 0; i11 < this.contextReceiverType_.size(); i11++) {
                codedOutputStream.m91280h0(20, this.contextReceiverType_.get(i11));
            }
            if (getContextReceiverTypeIdList().size() > 0) {
                codedOutputStream.m91291s0(CipherSuite.TLS_DHE_PSK_WITH_AES_128_GCM_SHA256);
                codedOutputStream.m91291s0(this.contextReceiverTypeIdMemoizedSerializedSize);
            }
            for (int i12 = 0; i12 < this.contextReceiverTypeId_.size(); i12++) {
                codedOutputStream.m91278f0(this.contextReceiverTypeId_.get(i12).intValue());
            }
            for (int i13 = 0; i13 < this.annotation_.size(); i13++) {
                codedOutputStream.m91280h0(25, this.annotation_.get(i13));
            }
            if ((this.bitField0_ & 64) == 64) {
                codedOutputStream.m91280h0(30, this.typeTable_);
            }
            for (int i14 = 0; i14 < this.versionRequirement_.size(); i14++) {
                codedOutputStream.m91277e0(31, this.versionRequirement_.get(i14).intValue());
            }
            if ((this.bitField0_ & 128) == 128) {
                codedOutputStream.m91280h0(32, this.versionRequirementTable_);
            }
            for (int i15 = 0; i15 < this.compilerPluginData_.size(); i15++) {
                codedOutputStream.m91280h0(33, this.compilerPluginData_.get(i15));
            }
            extensionWriterNewExtensionWriter.m91338a(19000, codedOutputStream);
            codedOutputStream.m91285m0(this.unknownFields);
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableMessage, kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite
        public Class getDefaultInstanceForType() {
            return defaultInstance;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableMessage, kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public Builder newBuilderForType() {
            return newBuilder();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableMessage, kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public Builder toBuilder() {
            return newBuilder(this);
        }

        public static Builder newBuilder() {
            return Builder.m90503t();
        }

        private Class(GeneratedMessageLite.ExtendableBuilder<Class, ?> extendableBuilder) {
            super(extendableBuilder);
            this.supertypeIdMemoizedSerializedSize = -1;
            this.nestedClassNameMemoizedSerializedSize = -1;
            this.contextReceiverTypeIdMemoizedSerializedSize = -1;
            this.sealedSubclassFqNameMemoizedSerializedSize = -1;
            this.memoizedIsInitialized = (byte) -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = extendableBuilder.m91332e();
        }

        private Class(boolean z) {
            this.supertypeIdMemoizedSerializedSize = -1;
            this.nestedClassNameMemoizedSerializedSize = -1;
            this.contextReceiverTypeIdMemoizedSerializedSize = -1;
            this.sealedSubclassFqNameMemoizedSerializedSize = -1;
            this.memoizedIsInitialized = (byte) -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = ByteString.f65615a;
        }
    }

    public static final class CompilerPluginData extends GeneratedMessageLite implements CompilerPluginDataOrBuilder {
        public static Parser<CompilerPluginData> PARSER = new C15241a();
        private static final CompilerPluginData defaultInstance;
        private int bitField0_;
        private ByteString data_;
        private byte memoizedIsInitialized;
        private int memoizedSerializedSize;
        private int pluginId_;
        private final ByteString unknownFields;

        public static final class Builder extends GeneratedMessageLite.Builder<CompilerPluginData, Builder> implements CompilerPluginDataOrBuilder {

            /* JADX INFO: renamed from: b */
            public int f65173b;

            /* JADX INFO: renamed from: c */
            public int f65174c;

            /* JADX INFO: renamed from: d */
            public ByteString f65175d = ByteString.f65615a;

            private Builder() {
                m90537p();
            }

            /* JADX INFO: renamed from: o */
            public static Builder m90536o() {
                return new Builder();
            }

            /* JADX INFO: renamed from: p */
            private void m90537p() {
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
            public CompilerPluginData build() {
                CompilerPluginData compilerPluginDataM90539m = m90539m();
                if (compilerPluginDataM90539m.isInitialized()) {
                    return compilerPluginDataM90539m;
                }
                throw AbstractMessageLite.Builder.m91133c(compilerPluginDataM90539m);
            }

            /* JADX INFO: renamed from: m */
            public CompilerPluginData m90539m() {
                CompilerPluginData compilerPluginData = new CompilerPluginData(this);
                int i = this.f65173b;
                int i2 = (i & 1) != 1 ? 0 : 1;
                compilerPluginData.pluginId_ = this.f65174c;
                if ((i & 2) == 2) {
                    i2 |= 2;
                }
                compilerPluginData.data_ = this.f65175d;
                compilerPluginData.bitField0_ = i2;
                return compilerPluginData;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder
            /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
            public Builder mo90523m() {
                return m90536o().mo90458f(m90539m());
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder
            /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
            public Builder mo90458f(CompilerPluginData compilerPluginData) {
                if (compilerPluginData == CompilerPluginData.getDefaultInstance()) {
                    return this;
                }
                if (compilerPluginData.hasPluginId()) {
                    m90544t(compilerPluginData.getPluginId());
                }
                if (compilerPluginData.hasData()) {
                    m90543s(compilerPluginData.getData());
                }
                m91333j(m91332e().m91156c(compilerPluginData.unknownFields));
                return this;
            }

            /* JADX WARN: Code duplicated, block: B:15:0x001d  */
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
            public Builder mo90459i(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws Throwable {
                CompilerPluginData compilerPluginData = null;
                try {
                    try {
                        CompilerPluginData compilerPluginDataMo90487d = CompilerPluginData.PARSER.mo90487d(codedInputStream, extensionRegistryLite);
                        if (compilerPluginDataMo90487d != null) {
                            mo90458f(compilerPluginDataMo90487d);
                        }
                        return this;
                    } catch (InvalidProtocolBufferException e) {
                        CompilerPluginData compilerPluginData2 = (CompilerPluginData) e.getUnfinishedMessage();
                        try {
                            throw e;
                        } catch (Throwable th) {
                            th = th;
                            compilerPluginData = compilerPluginData2;
                            if (compilerPluginData != null) {
                                mo90458f(compilerPluginData);
                            }
                            throw th;
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                    if (compilerPluginData != null) {
                        mo90458f(compilerPluginData);
                    }
                    throw th;
                }
            }

            /* JADX INFO: renamed from: s */
            public Builder m90543s(ByteString byteString) {
                byteString.getClass();
                this.f65173b |= 2;
                this.f65175d = byteString;
                return this;
            }

            /* JADX INFO: renamed from: t */
            public Builder m90544t(int i) {
                this.f65173b |= 1;
                this.f65174c = i;
                return this;
            }
        }

        /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$CompilerPluginData$a */
        public static class C15241a extends AbstractParser<CompilerPluginData> {
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.Parser
            /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
            public CompilerPluginData mo90487d(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return new CompilerPluginData(codedInputStream, extensionRegistryLite);
            }
        }

        static {
            CompilerPluginData compilerPluginData = new CompilerPluginData(true);
            defaultInstance = compilerPluginData;
            compilerPluginData.initFields();
        }

        private CompilerPluginData(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
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
                                this.pluginId_ = codedInputStream.m91209s();
                            } else if (iM91185K == 18) {
                                this.bitField0_ |= 2;
                                this.data_ = codedInputStream.m91202l();
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

        public static CompilerPluginData getDefaultInstance() {
            return defaultInstance;
        }

        private void initFields() {
            this.pluginId_ = 0;
            this.data_ = ByteString.f65615a;
        }

        public static Builder newBuilder(CompilerPluginData compilerPluginData) {
            return newBuilder().mo90458f(compilerPluginData);
        }

        public ByteString getData() {
            return this.data_;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public Parser<CompilerPluginData> getParserForType() {
            return PARSER;
        }

        public int getPluginId() {
            return this.pluginId_;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int iM91243p = (this.bitField0_ & 1) == 1 ? CodedOutputStream.m91243p(1, this.pluginId_) : 0;
            if ((this.bitField0_ & 2) == 2) {
                iM91243p += CodedOutputStream.m91232e(2, this.data_);
            }
            int size = iM91243p + this.unknownFields.size();
            this.memoizedSerializedSize = size;
            return size;
        }

        public boolean hasData() {
            return (this.bitField0_ & 2) == 2;
        }

        public boolean hasPluginId() {
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
            if (!hasPluginId()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (hasData()) {
                this.memoizedIsInitialized = (byte) 1;
                return true;
            }
            this.memoizedIsInitialized = (byte) 0;
            return false;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            getSerializedSize();
            if ((this.bitField0_ & 1) == 1) {
                codedOutputStream.m91277e0(1, this.pluginId_);
            }
            if ((this.bitField0_ & 2) == 2) {
                codedOutputStream.m91264S(2, this.data_);
            }
            codedOutputStream.m91285m0(this.unknownFields);
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite
        public CompilerPluginData getDefaultInstanceForType() {
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
            return Builder.m90536o();
        }

        private CompilerPluginData(GeneratedMessageLite.Builder builder) {
            super(builder);
            this.memoizedIsInitialized = (byte) -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = builder.m91332e();
        }

        private CompilerPluginData(boolean z) {
            this.memoizedIsInitialized = (byte) -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = ByteString.f65615a;
        }
    }

    public static final class Constructor extends GeneratedMessageLite.ExtendableMessage<Constructor> implements ConstructorOrBuilder {
        public static Parser<Constructor> PARSER = new C15242a();
        private static final Constructor defaultInstance;
        private List<Annotation> annotation_;
        private int bitField0_;
        private List<CompilerPluginData> compilerPluginData_;
        private int flags_;
        private byte memoizedIsInitialized;
        private int memoizedSerializedSize;
        private final ByteString unknownFields;
        private List<ValueParameter> valueParameter_;
        private List<Integer> versionRequirement_;

        public static final class Builder extends GeneratedMessageLite.ExtendableBuilder<Constructor, Builder> implements ConstructorOrBuilder {

            /* JADX INFO: renamed from: d */
            public int f65176d;

            /* JADX INFO: renamed from: e */
            public int f65177e = 6;

            /* JADX INFO: renamed from: f */
            public List<ValueParameter> f65178f;

            /* JADX INFO: renamed from: g */
            public List<Integer> f65179g;

            /* JADX INFO: renamed from: h */
            public List<CompilerPluginData> f65180h;

            /* JADX INFO: renamed from: i */
            public List<Annotation> f65181i;

            private Builder() {
                List list = Collections.EMPTY_LIST;
                this.f65178f = list;
                this.f65179g = list;
                this.f65180h = list;
                this.f65181i = list;
                m90551y();
            }

            /* JADX INFO: renamed from: t */
            public static Builder m90547t() {
                return new Builder();
            }

            /* JADX INFO: renamed from: u */
            private void m90548u() {
                if ((this.f65176d & 16) != 16) {
                    this.f65181i = new ArrayList(this.f65181i);
                    this.f65176d |= 16;
                }
            }

            /* JADX INFO: renamed from: v */
            private void m90549v() {
                if ((this.f65176d & 8) != 8) {
                    this.f65180h = new ArrayList(this.f65180h);
                    this.f65176d |= 8;
                }
            }

            /* JADX INFO: renamed from: x */
            private void m90550x() {
                if ((this.f65176d & 4) != 4) {
                    this.f65179g = new ArrayList(this.f65179g);
                    this.f65176d |= 4;
                }
            }

            /* JADX INFO: renamed from: y */
            private void m90551y() {
            }

            /* JADX WARN: Code duplicated, block: B:15:0x001d  */
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
            public Builder mo90459i(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws Throwable {
                Constructor constructor = null;
                try {
                    try {
                        Constructor constructorMo90487d = Constructor.PARSER.mo90487d(codedInputStream, extensionRegistryLite);
                        if (constructorMo90487d != null) {
                            mo90458f(constructorMo90487d);
                        }
                        return this;
                    } catch (InvalidProtocolBufferException e) {
                        Constructor constructor2 = (Constructor) e.getUnfinishedMessage();
                        try {
                            throw e;
                        } catch (Throwable th) {
                            th = th;
                            constructor = constructor2;
                            if (constructor != null) {
                                mo90458f(constructor);
                            }
                            throw th;
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                    if (constructor != null) {
                        mo90458f(constructor);
                    }
                    throw th;
                }
            }

            /* JADX INFO: renamed from: B */
            public Builder m90553B(int i) {
                this.f65176d |= 1;
                this.f65177e = i;
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
            public Constructor build() {
                Constructor constructorM90555r = m90555r();
                if (constructorM90555r.isInitialized()) {
                    return constructorM90555r;
                }
                throw AbstractMessageLite.Builder.m91133c(constructorM90555r);
            }

            /* JADX INFO: renamed from: r */
            public Constructor m90555r() {
                Constructor constructor = new Constructor(this);
                int i = (this.f65176d & 1) != 1 ? 0 : 1;
                constructor.flags_ = this.f65177e;
                if ((this.f65176d & 2) == 2) {
                    this.f65178f = Collections.unmodifiableList(this.f65178f);
                    this.f65176d &= -3;
                }
                constructor.valueParameter_ = this.f65178f;
                if ((this.f65176d & 4) == 4) {
                    this.f65179g = Collections.unmodifiableList(this.f65179g);
                    this.f65176d &= -5;
                }
                constructor.versionRequirement_ = this.f65179g;
                if ((this.f65176d & 8) == 8) {
                    this.f65180h = Collections.unmodifiableList(this.f65180h);
                    this.f65176d &= -9;
                }
                constructor.compilerPluginData_ = this.f65180h;
                if ((this.f65176d & 16) == 16) {
                    this.f65181i = Collections.unmodifiableList(this.f65181i);
                    this.f65176d &= -17;
                }
                constructor.annotation_ = this.f65181i;
                constructor.bitField0_ = i;
                return constructor;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableBuilder
            /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
            public Builder mo90523m() {
                return m90547t().mo90458f(m90555r());
            }

            /* JADX INFO: renamed from: w */
            public final void m90557w() {
                if ((this.f65176d & 2) != 2) {
                    this.f65178f = new ArrayList(this.f65178f);
                    this.f65176d |= 2;
                }
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder
            /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
            public Builder mo90458f(Constructor constructor) {
                if (constructor == Constructor.getDefaultInstance()) {
                    return this;
                }
                if (constructor.hasFlags()) {
                    m90553B(constructor.getFlags());
                }
                if (!constructor.valueParameter_.isEmpty()) {
                    if (this.f65178f.isEmpty()) {
                        this.f65178f = constructor.valueParameter_;
                        this.f65176d &= -3;
                    } else {
                        m90557w();
                        this.f65178f.addAll(constructor.valueParameter_);
                    }
                }
                if (!constructor.versionRequirement_.isEmpty()) {
                    if (this.f65179g.isEmpty()) {
                        this.f65179g = constructor.versionRequirement_;
                        this.f65176d &= -5;
                    } else {
                        m90550x();
                        this.f65179g.addAll(constructor.versionRequirement_);
                    }
                }
                if (!constructor.compilerPluginData_.isEmpty()) {
                    if (this.f65180h.isEmpty()) {
                        this.f65180h = constructor.compilerPluginData_;
                        this.f65176d &= -9;
                    } else {
                        m90549v();
                        this.f65180h.addAll(constructor.compilerPluginData_);
                    }
                }
                if (!constructor.annotation_.isEmpty()) {
                    if (this.f65181i.isEmpty()) {
                        this.f65181i = constructor.annotation_;
                        this.f65176d &= -17;
                    } else {
                        m90548u();
                        this.f65181i.addAll(constructor.annotation_);
                    }
                }
                m91337o(constructor);
                m91333j(m91332e().m91156c(constructor.unknownFields));
                return this;
            }
        }

        /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Constructor$a */
        public static class C15242a extends AbstractParser<Constructor> {
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.Parser
            /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
            public Constructor mo90487d(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return new Constructor(codedInputStream, extensionRegistryLite);
            }
        }

        static {
            Constructor constructor = new Constructor(true);
            defaultInstance = constructor;
            constructor.initFields();
        }

        private Constructor(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
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
                                this.flags_ = codedInputStream.m91209s();
                            } else if (iM91185K == 18) {
                                if ((i & 2) != 2) {
                                    this.valueParameter_ = new ArrayList();
                                    i |= 2;
                                }
                                this.valueParameter_.add((ValueParameter) codedInputStream.m91211u(ValueParameter.PARSER, extensionRegistryLite));
                            } else if (iM91185K == 26) {
                                if ((i & 16) != 16) {
                                    this.annotation_ = new ArrayList();
                                    i |= 16;
                                }
                                this.annotation_.add((Annotation) codedInputStream.m91211u(Annotation.PARSER, extensionRegistryLite));
                            } else if (iM91185K == 248) {
                                if ((i & 4) != 4) {
                                    this.versionRequirement_ = new ArrayList();
                                    i |= 4;
                                }
                                this.versionRequirement_.add(Integer.valueOf(codedInputStream.m91209s()));
                            } else if (iM91185K == 250) {
                                int iM91200j = codedInputStream.m91200j(codedInputStream.m91176A());
                                if ((i & 4) != 4 && codedInputStream.m91197e() > 0) {
                                    this.versionRequirement_ = new ArrayList();
                                    i |= 4;
                                }
                                while (codedInputStream.m91197e() > 0) {
                                    this.versionRequirement_.add(Integer.valueOf(codedInputStream.m91209s()));
                                }
                                codedInputStream.m91199i(iM91200j);
                            } else if (iM91185K == 258) {
                                if ((i & 8) != 8) {
                                    this.compilerPluginData_ = new ArrayList();
                                    i |= 8;
                                }
                                this.compilerPluginData_.add((CompilerPluginData) codedInputStream.m91211u(CompilerPluginData.PARSER, extensionRegistryLite));
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
                    if ((i & 2) == 2) {
                        this.valueParameter_ = Collections.unmodifiableList(this.valueParameter_);
                    }
                    if ((i & 16) == 16) {
                        this.annotation_ = Collections.unmodifiableList(this.annotation_);
                    }
                    if ((i & 4) == 4) {
                        this.versionRequirement_ = Collections.unmodifiableList(this.versionRequirement_);
                    }
                    if ((i & 8) == 8) {
                        this.compilerPluginData_ = Collections.unmodifiableList(this.compilerPluginData_);
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
            if ((i & 2) == 2) {
                this.valueParameter_ = Collections.unmodifiableList(this.valueParameter_);
            }
            if ((i & 16) == 16) {
                this.annotation_ = Collections.unmodifiableList(this.annotation_);
            }
            if ((i & 4) == 4) {
                this.versionRequirement_ = Collections.unmodifiableList(this.versionRequirement_);
            }
            if ((i & 8) == 8) {
                this.compilerPluginData_ = Collections.unmodifiableList(this.compilerPluginData_);
            }
            try {
                codedOutputStreamM91226K.m91258J();
            } catch (IOException unused2) {
            } finally {
                this.unknownFields = outputM91150w.m91170m();
            }
            makeExtensionsImmutable();
        }

        public static Constructor getDefaultInstance() {
            return defaultInstance;
        }

        private void initFields() {
            this.flags_ = 6;
            List list = Collections.EMPTY_LIST;
            this.valueParameter_ = list;
            this.versionRequirement_ = list;
            this.compilerPluginData_ = list;
            this.annotation_ = list;
        }

        public static Builder newBuilder(Constructor constructor) {
            return newBuilder().mo90458f(constructor);
        }

        public Annotation getAnnotation(int i) {
            return this.annotation_.get(i);
        }

        public int getAnnotationCount() {
            return this.annotation_.size();
        }

        public List<Annotation> getAnnotationList() {
            return this.annotation_;
        }

        public CompilerPluginData getCompilerPluginData(int i) {
            return this.compilerPluginData_.get(i);
        }

        public int getCompilerPluginDataCount() {
            return this.compilerPluginData_.size();
        }

        public int getFlags() {
            return this.flags_;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public Parser<Constructor> getParserForType() {
            return PARSER;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableMessage, kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int iM91243p = (this.bitField0_ & 1) == 1 ? CodedOutputStream.m91243p(1, this.flags_) : 0;
            for (int i2 = 0; i2 < this.valueParameter_.size(); i2++) {
                iM91243p += CodedOutputStream.m91247t(2, this.valueParameter_.get(i2));
            }
            for (int i3 = 0; i3 < this.annotation_.size(); i3++) {
                iM91243p += CodedOutputStream.m91247t(3, this.annotation_.get(i3));
            }
            int iM91244q = 0;
            for (int i4 = 0; i4 < this.versionRequirement_.size(); i4++) {
                iM91244q += CodedOutputStream.m91244q(this.versionRequirement_.get(i4).intValue());
            }
            int size = iM91243p + iM91244q + (getVersionRequirementList().size() * 2);
            for (int i5 = 0; i5 < this.compilerPluginData_.size(); i5++) {
                size += CodedOutputStream.m91247t(32, this.compilerPluginData_.get(i5));
            }
            int iExtensionsSerializedSize = size + extensionsSerializedSize() + this.unknownFields.size();
            this.memoizedSerializedSize = iExtensionsSerializedSize;
            return iExtensionsSerializedSize;
        }

        public ValueParameter getValueParameter(int i) {
            return this.valueParameter_.get(i);
        }

        public int getValueParameterCount() {
            return this.valueParameter_.size();
        }

        public List<ValueParameter> getValueParameterList() {
            return this.valueParameter_;
        }

        public List<Integer> getVersionRequirementList() {
            return this.versionRequirement_;
        }

        public boolean hasFlags() {
            return (this.bitField0_ & 1) == 1;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableMessage, kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            byte b = this.memoizedIsInitialized;
            if (b == 1) {
                return true;
            }
            if (b == 0) {
                return false;
            }
            for (int i = 0; i < getValueParameterCount(); i++) {
                if (!getValueParameter(i).isInitialized()) {
                    this.memoizedIsInitialized = (byte) 0;
                    return false;
                }
            }
            for (int i2 = 0; i2 < getCompilerPluginDataCount(); i2++) {
                if (!getCompilerPluginData(i2).isInitialized()) {
                    this.memoizedIsInitialized = (byte) 0;
                    return false;
                }
            }
            for (int i3 = 0; i3 < getAnnotationCount(); i3++) {
                if (!getAnnotation(i3).isInitialized()) {
                    this.memoizedIsInitialized = (byte) 0;
                    return false;
                }
            }
            if (extensionsAreInitialized()) {
                this.memoizedIsInitialized = (byte) 1;
                return true;
            }
            this.memoizedIsInitialized = (byte) 0;
            return false;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableMessage, kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            getSerializedSize();
            GeneratedMessageLite.ExtendableMessage<MessageType>.ExtensionWriter extensionWriterNewExtensionWriter = newExtensionWriter();
            if ((this.bitField0_ & 1) == 1) {
                codedOutputStream.m91277e0(1, this.flags_);
            }
            for (int i = 0; i < this.valueParameter_.size(); i++) {
                codedOutputStream.m91280h0(2, this.valueParameter_.get(i));
            }
            for (int i2 = 0; i2 < this.annotation_.size(); i2++) {
                codedOutputStream.m91280h0(3, this.annotation_.get(i2));
            }
            for (int i3 = 0; i3 < this.versionRequirement_.size(); i3++) {
                codedOutputStream.m91277e0(31, this.versionRequirement_.get(i3).intValue());
            }
            for (int i4 = 0; i4 < this.compilerPluginData_.size(); i4++) {
                codedOutputStream.m91280h0(32, this.compilerPluginData_.get(i4));
            }
            extensionWriterNewExtensionWriter.m91338a(19000, codedOutputStream);
            codedOutputStream.m91285m0(this.unknownFields);
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableMessage, kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite
        public Constructor getDefaultInstanceForType() {
            return defaultInstance;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableMessage, kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public Builder newBuilderForType() {
            return newBuilder();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableMessage, kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public Builder toBuilder() {
            return newBuilder(this);
        }

        public static Builder newBuilder() {
            return Builder.m90547t();
        }

        private Constructor(GeneratedMessageLite.ExtendableBuilder<Constructor, ?> extendableBuilder) {
            super(extendableBuilder);
            this.memoizedIsInitialized = (byte) -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = extendableBuilder.m91332e();
        }

        private Constructor(boolean z) {
            this.memoizedIsInitialized = (byte) -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = ByteString.f65615a;
        }
    }

    public static final class Contract extends GeneratedMessageLite implements ContractOrBuilder {
        public static Parser<Contract> PARSER = new C15243a();
        private static final Contract defaultInstance;
        private List<Effect> effect_;
        private byte memoizedIsInitialized;
        private int memoizedSerializedSize;
        private final ByteString unknownFields;

        public static final class Builder extends GeneratedMessageLite.Builder<Contract, Builder> implements ContractOrBuilder {

            /* JADX INFO: renamed from: b */
            public int f65182b;

            /* JADX INFO: renamed from: c */
            public List<Effect> f65183c = Collections.EMPTY_LIST;

            private Builder() {
                m90562q();
            }

            /* JADX INFO: renamed from: o */
            public static Builder m90561o() {
                return new Builder();
            }

            /* JADX INFO: renamed from: q */
            private void m90562q() {
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
            public Contract build() {
                Contract contractM90564m = m90564m();
                if (contractM90564m.isInitialized()) {
                    return contractM90564m;
                }
                throw AbstractMessageLite.Builder.m91133c(contractM90564m);
            }

            /* JADX INFO: renamed from: m */
            public Contract m90564m() {
                Contract contract = new Contract(this);
                if ((this.f65182b & 1) == 1) {
                    this.f65183c = Collections.unmodifiableList(this.f65183c);
                    this.f65182b &= -2;
                }
                contract.effect_ = this.f65183c;
                return contract;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder
            /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
            public Builder mo90523m() {
                return m90561o().mo90458f(m90564m());
            }

            /* JADX INFO: renamed from: p */
            public final void m90566p() {
                if ((this.f65182b & 1) != 1) {
                    this.f65183c = new ArrayList(this.f65183c);
                    this.f65182b |= 1;
                }
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder
            /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
            public Builder mo90458f(Contract contract) {
                if (contract == Contract.getDefaultInstance()) {
                    return this;
                }
                if (!contract.effect_.isEmpty()) {
                    if (this.f65183c.isEmpty()) {
                        this.f65183c = contract.effect_;
                        this.f65182b &= -2;
                    } else {
                        m90566p();
                        this.f65183c.addAll(contract.effect_);
                    }
                }
                m91333j(m91332e().m91156c(contract.unknownFields));
                return this;
            }

            /* JADX WARN: Code duplicated, block: B:15:0x001d  */
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
            public Builder mo90459i(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws Throwable {
                Contract contract = null;
                try {
                    try {
                        Contract contractMo90487d = Contract.PARSER.mo90487d(codedInputStream, extensionRegistryLite);
                        if (contractMo90487d != null) {
                            mo90458f(contractMo90487d);
                        }
                        return this;
                    } catch (InvalidProtocolBufferException e) {
                        Contract contract2 = (Contract) e.getUnfinishedMessage();
                        try {
                            throw e;
                        } catch (Throwable th) {
                            th = th;
                            contract = contract2;
                            if (contract != null) {
                                mo90458f(contract);
                            }
                            throw th;
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                    if (contract != null) {
                        mo90458f(contract);
                    }
                    throw th;
                }
            }
        }

        /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Contract$a */
        public static class C15243a extends AbstractParser<Contract> {
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.Parser
            /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
            public Contract mo90487d(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return new Contract(codedInputStream, extensionRegistryLite);
            }
        }

        static {
            Contract contract = new Contract(true);
            defaultInstance = contract;
            contract.initFields();
        }

        private Contract(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            this.memoizedIsInitialized = (byte) -1;
            this.memoizedSerializedSize = -1;
            initFields();
            ByteString.Output outputM91150w = ByteString.m91150w();
            CodedOutputStream codedOutputStreamM91226K = CodedOutputStream.m91226K(outputM91150w, 1);
            boolean z = false;
            boolean z2 = false;
            while (!z) {
                try {
                    try {
                        try {
                            int iM91185K = codedInputStream.m91185K();
                            if (iM91185K != 0) {
                                if (iM91185K == 10) {
                                    if (!z2) {
                                        this.effect_ = new ArrayList();
                                        z2 = true;
                                    }
                                    this.effect_.add((Effect) codedInputStream.m91211u(Effect.PARSER, extensionRegistryLite));
                                } else if (!parseUnknownField(codedInputStream, codedOutputStreamM91226K, extensionRegistryLite, iM91185K)) {
                                }
                            }
                            z = true;
                        } catch (InvalidProtocolBufferException e) {
                            throw e.setUnfinishedMessage(this);
                        }
                    } catch (IOException e2) {
                        throw new InvalidProtocolBufferException(e2.getMessage()).setUnfinishedMessage(this);
                    }
                } catch (Throwable th) {
                    if (z2) {
                        this.effect_ = Collections.unmodifiableList(this.effect_);
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
            if (z2) {
                this.effect_ = Collections.unmodifiableList(this.effect_);
            }
            try {
                codedOutputStreamM91226K.m91258J();
            } catch (IOException unused2) {
            } finally {
                this.unknownFields = outputM91150w.m91170m();
            }
            makeExtensionsImmutable();
        }

        public static Contract getDefaultInstance() {
            return defaultInstance;
        }

        private void initFields() {
            this.effect_ = Collections.EMPTY_LIST;
        }

        public static Builder newBuilder(Contract contract) {
            return newBuilder().mo90458f(contract);
        }

        public Effect getEffect(int i) {
            return this.effect_.get(i);
        }

        public int getEffectCount() {
            return this.effect_.size();
        }

        public List<Effect> getEffectList() {
            return this.effect_;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public Parser<Contract> getParserForType() {
            return PARSER;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int iM91247t = 0;
            for (int i2 = 0; i2 < this.effect_.size(); i2++) {
                iM91247t += CodedOutputStream.m91247t(1, this.effect_.get(i2));
            }
            int size = iM91247t + this.unknownFields.size();
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
            for (int i = 0; i < getEffectCount(); i++) {
                if (!getEffect(i).isInitialized()) {
                    this.memoizedIsInitialized = (byte) 0;
                    return false;
                }
            }
            this.memoizedIsInitialized = (byte) 1;
            return true;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            getSerializedSize();
            for (int i = 0; i < this.effect_.size(); i++) {
                codedOutputStream.m91280h0(1, this.effect_.get(i));
            }
            codedOutputStream.m91285m0(this.unknownFields);
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite
        public Contract getDefaultInstanceForType() {
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
            return Builder.m90561o();
        }

        private Contract(GeneratedMessageLite.Builder builder) {
            super(builder);
            this.memoizedIsInitialized = (byte) -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = builder.m91332e();
        }

        private Contract(boolean z) {
            this.memoizedIsInitialized = (byte) -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = ByteString.f65615a;
        }
    }

    public static final class Effect extends GeneratedMessageLite implements EffectOrBuilder {
        public static Parser<Effect> PARSER = new C15247a();
        private static final Effect defaultInstance;
        private int bitField0_;
        private Expression conclusionOfConditionalEffect_;
        private EffectConditionKind conditionKind_;
        private List<Expression> effectConstructorArgument_;
        private EffectType effectType_;
        private InvocationKind kind_;
        private byte memoizedIsInitialized;
        private int memoizedSerializedSize;
        private final ByteString unknownFields;

        public static final class Builder extends GeneratedMessageLite.Builder<Effect, Builder> implements EffectOrBuilder {

            /* JADX INFO: renamed from: b */
            public int f65184b;

            /* JADX INFO: renamed from: c */
            public EffectType f65185c = EffectType.RETURNS_CONSTANT;

            /* JADX INFO: renamed from: d */
            public List<Expression> f65186d = Collections.EMPTY_LIST;

            /* JADX INFO: renamed from: e */
            public Expression f65187e = Expression.getDefaultInstance();

            /* JADX INFO: renamed from: f */
            public InvocationKind f65188f = InvocationKind.AT_MOST_ONCE;

            /* JADX INFO: renamed from: g */
            public EffectConditionKind f65189g = EffectConditionKind.CONCLUSION_CONDITION;

            private Builder() {
                m90572q();
            }

            /* JADX INFO: renamed from: o */
            public static Builder m90571o() {
                return new Builder();
            }

            /* JADX INFO: renamed from: q */
            private void m90572q() {
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
            public Effect build() {
                Effect effectM90574m = m90574m();
                if (effectM90574m.isInitialized()) {
                    return effectM90574m;
                }
                throw AbstractMessageLite.Builder.m91133c(effectM90574m);
            }

            /* JADX INFO: renamed from: m */
            public Effect m90574m() {
                Effect effect = new Effect(this);
                int i = this.f65184b;
                int i2 = (i & 1) != 1 ? 0 : 1;
                effect.effectType_ = this.f65185c;
                if ((this.f65184b & 2) == 2) {
                    this.f65186d = Collections.unmodifiableList(this.f65186d);
                    this.f65184b &= -3;
                }
                effect.effectConstructorArgument_ = this.f65186d;
                if ((i & 4) == 4) {
                    i2 |= 2;
                }
                effect.conclusionOfConditionalEffect_ = this.f65187e;
                if ((i & 8) == 8) {
                    i2 |= 4;
                }
                effect.kind_ = this.f65188f;
                if ((i & 16) == 16) {
                    i2 |= 8;
                }
                effect.conditionKind_ = this.f65189g;
                effect.bitField0_ = i2;
                return effect;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder
            /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
            public Builder mo90523m() {
                return m90571o().mo90458f(m90574m());
            }

            /* JADX INFO: renamed from: p */
            public final void m90576p() {
                if ((this.f65184b & 2) != 2) {
                    this.f65186d = new ArrayList(this.f65186d);
                    this.f65184b |= 2;
                }
            }

            /* JADX INFO: renamed from: r */
            public Builder m90577r(Expression expression) {
                if ((this.f65184b & 4) != 4 || this.f65187e == Expression.getDefaultInstance()) {
                    this.f65187e = expression;
                } else {
                    this.f65187e = Expression.newBuilder(this.f65187e).mo90458f(expression).m90602m();
                }
                this.f65184b |= 4;
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder
            /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
            public Builder mo90458f(Effect effect) {
                if (effect == Effect.getDefaultInstance()) {
                    return this;
                }
                if (effect.hasEffectType()) {
                    m90581v(effect.getEffectType());
                }
                if (!effect.effectConstructorArgument_.isEmpty()) {
                    if (this.f65186d.isEmpty()) {
                        this.f65186d = effect.effectConstructorArgument_;
                        this.f65184b &= -3;
                    } else {
                        m90576p();
                        this.f65186d.addAll(effect.effectConstructorArgument_);
                    }
                }
                if (effect.hasConclusionOfConditionalEffect()) {
                    m90577r(effect.getConclusionOfConditionalEffect());
                }
                if (effect.hasKind()) {
                    m90582w(effect.getKind());
                }
                if (effect.hasConditionKind()) {
                    m90580u(effect.getConditionKind());
                }
                m91333j(m91332e().m91156c(effect.unknownFields));
                return this;
            }

            /* JADX WARN: Code duplicated, block: B:15:0x001d  */
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
            public Builder mo90459i(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws Throwable {
                Effect effect = null;
                try {
                    try {
                        Effect effectMo90487d = Effect.PARSER.mo90487d(codedInputStream, extensionRegistryLite);
                        if (effectMo90487d != null) {
                            mo90458f(effectMo90487d);
                        }
                        return this;
                    } catch (InvalidProtocolBufferException e) {
                        Effect effect2 = (Effect) e.getUnfinishedMessage();
                        try {
                            throw e;
                        } catch (Throwable th) {
                            th = th;
                            effect = effect2;
                            if (effect != null) {
                                mo90458f(effect);
                            }
                            throw th;
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                    if (effect != null) {
                        mo90458f(effect);
                    }
                    throw th;
                }
            }

            /* JADX INFO: renamed from: u */
            public Builder m90580u(EffectConditionKind effectConditionKind) {
                effectConditionKind.getClass();
                this.f65184b |= 16;
                this.f65189g = effectConditionKind;
                return this;
            }

            /* JADX INFO: renamed from: v */
            public Builder m90581v(EffectType effectType) {
                effectType.getClass();
                this.f65184b |= 1;
                this.f65185c = effectType;
                return this;
            }

            /* JADX INFO: renamed from: w */
            public Builder m90582w(InvocationKind invocationKind) {
                invocationKind.getClass();
                this.f65184b |= 8;
                this.f65188f = invocationKind;
                return this;
            }
        }

        public enum EffectConditionKind implements Internal.EnumLite {
            CONCLUSION_CONDITION(0, 0),
            RETURNS_CONDITION(1, 1),
            HOLDSIN_CONDITION(2, 2);

            private static Internal.EnumLiteMap<EffectConditionKind> internalValueMap = new C15244a();
            private final int value;

            /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Effect$EffectConditionKind$a */
            public static class C15244a implements Internal.EnumLiteMap<EffectConditionKind> {
                @Override // kotlin.reflect.jvm.internal.impl.protobuf.Internal.EnumLiteMap
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public EffectConditionKind findValueByNumber(int i) {
                    return EffectConditionKind.valueOf(i);
                }
            }

            EffectConditionKind(int i, int i2) {
                this.value = i2;
            }

            public static EffectConditionKind valueOf(int i) {
                if (i == 0) {
                    return CONCLUSION_CONDITION;
                }
                if (i == 1) {
                    return RETURNS_CONDITION;
                }
                if (i != 2) {
                    return null;
                }
                return HOLDSIN_CONDITION;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.Internal.EnumLite
            public final int getNumber() {
                return this.value;
            }
        }

        public enum EffectType implements Internal.EnumLite {
            RETURNS_CONSTANT(0, 0),
            CALLS(1, 1),
            RETURNS_NOT_NULL(2, 2);

            private static Internal.EnumLiteMap<EffectType> internalValueMap = new C15245a();
            private final int value;

            /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Effect$EffectType$a */
            public static class C15245a implements Internal.EnumLiteMap<EffectType> {
                @Override // kotlin.reflect.jvm.internal.impl.protobuf.Internal.EnumLiteMap
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public EffectType findValueByNumber(int i) {
                    return EffectType.valueOf(i);
                }
            }

            EffectType(int i, int i2) {
                this.value = i2;
            }

            public static EffectType valueOf(int i) {
                if (i == 0) {
                    return RETURNS_CONSTANT;
                }
                if (i == 1) {
                    return CALLS;
                }
                if (i != 2) {
                    return null;
                }
                return RETURNS_NOT_NULL;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.Internal.EnumLite
            public final int getNumber() {
                return this.value;
            }
        }

        public enum InvocationKind implements Internal.EnumLite {
            AT_MOST_ONCE(0, 0),
            EXACTLY_ONCE(1, 1),
            AT_LEAST_ONCE(2, 2);

            private static Internal.EnumLiteMap<InvocationKind> internalValueMap = new C15246a();
            private final int value;

            /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Effect$InvocationKind$a */
            public static class C15246a implements Internal.EnumLiteMap<InvocationKind> {
                @Override // kotlin.reflect.jvm.internal.impl.protobuf.Internal.EnumLiteMap
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public InvocationKind findValueByNumber(int i) {
                    return InvocationKind.valueOf(i);
                }
            }

            InvocationKind(int i, int i2) {
                this.value = i2;
            }

            public static InvocationKind valueOf(int i) {
                if (i == 0) {
                    return AT_MOST_ONCE;
                }
                if (i == 1) {
                    return EXACTLY_ONCE;
                }
                if (i != 2) {
                    return null;
                }
                return AT_LEAST_ONCE;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.Internal.EnumLite
            public final int getNumber() {
                return this.value;
            }
        }

        /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Effect$a */
        public static class C15247a extends AbstractParser<Effect> {
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.Parser
            /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
            public Effect mo90487d(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return new Effect(codedInputStream, extensionRegistryLite);
            }
        }

        static {
            Effect effect = new Effect(true);
            defaultInstance = effect;
            effect.initFields();
        }

        private Effect(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            this.memoizedIsInitialized = (byte) -1;
            this.memoizedSerializedSize = -1;
            initFields();
            ByteString.Output outputM91150w = ByteString.m91150w();
            CodedOutputStream codedOutputStreamM91226K = CodedOutputStream.m91226K(outputM91150w, 1);
            boolean z = false;
            char c = 0;
            while (!z) {
                try {
                    try {
                        int iM91185K = codedInputStream.m91185K();
                        if (iM91185K != 0) {
                            if (iM91185K == 8) {
                                int iM91204n = codedInputStream.m91204n();
                                EffectType effectTypeValueOf = EffectType.valueOf(iM91204n);
                                if (effectTypeValueOf == null) {
                                    codedOutputStreamM91226K.m91291s0(iM91185K);
                                    codedOutputStreamM91226K.m91291s0(iM91204n);
                                } else {
                                    this.bitField0_ |= 1;
                                    this.effectType_ = effectTypeValueOf;
                                }
                            } else if (iM91185K == 18) {
                                if ((c & 2) != 2) {
                                    this.effectConstructorArgument_ = new ArrayList();
                                    c = 2;
                                }
                                this.effectConstructorArgument_.add((Expression) codedInputStream.m91211u(Expression.PARSER, extensionRegistryLite));
                            } else if (iM91185K == 26) {
                                Expression.Builder builder = (this.bitField0_ & 2) == 2 ? this.conclusionOfConditionalEffect_.toBuilder() : null;
                                Expression expression = (Expression) codedInputStream.m91211u(Expression.PARSER, extensionRegistryLite);
                                this.conclusionOfConditionalEffect_ = expression;
                                if (builder != null) {
                                    builder.mo90458f(expression);
                                    this.conclusionOfConditionalEffect_ = builder.m90602m();
                                }
                                this.bitField0_ |= 2;
                            } else if (iM91185K == 32) {
                                int iM91204n2 = codedInputStream.m91204n();
                                InvocationKind invocationKindValueOf = InvocationKind.valueOf(iM91204n2);
                                if (invocationKindValueOf == null) {
                                    codedOutputStreamM91226K.m91291s0(iM91185K);
                                    codedOutputStreamM91226K.m91291s0(iM91204n2);
                                } else {
                                    this.bitField0_ |= 4;
                                    this.kind_ = invocationKindValueOf;
                                }
                            } else if (iM91185K == 40) {
                                int iM91204n3 = codedInputStream.m91204n();
                                EffectConditionKind effectConditionKindValueOf = EffectConditionKind.valueOf(iM91204n3);
                                if (effectConditionKindValueOf == null) {
                                    codedOutputStreamM91226K.m91291s0(iM91185K);
                                    codedOutputStreamM91226K.m91291s0(iM91204n3);
                                } else {
                                    this.bitField0_ |= 8;
                                    this.conditionKind_ = effectConditionKindValueOf;
                                }
                            } else if (!parseUnknownField(codedInputStream, codedOutputStreamM91226K, extensionRegistryLite, iM91185K)) {
                            }
                        }
                        z = true;
                    } catch (Throwable th) {
                        if ((c & 2) == 2) {
                            this.effectConstructorArgument_ = Collections.unmodifiableList(this.effectConstructorArgument_);
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
            if ((c & 2) == 2) {
                this.effectConstructorArgument_ = Collections.unmodifiableList(this.effectConstructorArgument_);
            }
            try {
                codedOutputStreamM91226K.m91258J();
            } catch (IOException unused2) {
            } finally {
                this.unknownFields = outputM91150w.m91170m();
            }
            makeExtensionsImmutable();
        }

        public static Effect getDefaultInstance() {
            return defaultInstance;
        }

        private void initFields() {
            this.effectType_ = EffectType.RETURNS_CONSTANT;
            this.effectConstructorArgument_ = Collections.EMPTY_LIST;
            this.conclusionOfConditionalEffect_ = Expression.getDefaultInstance();
            this.kind_ = InvocationKind.AT_MOST_ONCE;
            this.conditionKind_ = EffectConditionKind.CONCLUSION_CONDITION;
        }

        public static Builder newBuilder(Effect effect) {
            return newBuilder().mo90458f(effect);
        }

        public Expression getConclusionOfConditionalEffect() {
            return this.conclusionOfConditionalEffect_;
        }

        public EffectConditionKind getConditionKind() {
            return this.conditionKind_;
        }

        public Expression getEffectConstructorArgument(int i) {
            return this.effectConstructorArgument_.get(i);
        }

        public int getEffectConstructorArgumentCount() {
            return this.effectConstructorArgument_.size();
        }

        public List<Expression> getEffectConstructorArgumentList() {
            return this.effectConstructorArgument_;
        }

        public EffectType getEffectType() {
            return this.effectType_;
        }

        public InvocationKind getKind() {
            return this.kind_;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public Parser<Effect> getParserForType() {
            return PARSER;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int iM91236i = (this.bitField0_ & 1) == 1 ? CodedOutputStream.m91236i(1, this.effectType_.getNumber()) : 0;
            for (int i2 = 0; i2 < this.effectConstructorArgument_.size(); i2++) {
                iM91236i += CodedOutputStream.m91247t(2, this.effectConstructorArgument_.get(i2));
            }
            if ((this.bitField0_ & 2) == 2) {
                iM91236i += CodedOutputStream.m91247t(3, this.conclusionOfConditionalEffect_);
            }
            if ((this.bitField0_ & 4) == 4) {
                iM91236i += CodedOutputStream.m91236i(4, this.kind_.getNumber());
            }
            if ((this.bitField0_ & 8) == 8) {
                iM91236i += CodedOutputStream.m91236i(5, this.conditionKind_.getNumber());
            }
            int size = iM91236i + this.unknownFields.size();
            this.memoizedSerializedSize = size;
            return size;
        }

        public boolean hasConclusionOfConditionalEffect() {
            return (this.bitField0_ & 2) == 2;
        }

        public boolean hasConditionKind() {
            return (this.bitField0_ & 8) == 8;
        }

        public boolean hasEffectType() {
            return (this.bitField0_ & 1) == 1;
        }

        public boolean hasKind() {
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
            for (int i = 0; i < getEffectConstructorArgumentCount(); i++) {
                if (!getEffectConstructorArgument(i).isInitialized()) {
                    this.memoizedIsInitialized = (byte) 0;
                    return false;
                }
            }
            if (!hasConclusionOfConditionalEffect() || getConclusionOfConditionalEffect().isInitialized()) {
                this.memoizedIsInitialized = (byte) 1;
                return true;
            }
            this.memoizedIsInitialized = (byte) 0;
            return false;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            getSerializedSize();
            if ((this.bitField0_ & 1) == 1) {
                codedOutputStream.m91268W(1, this.effectType_.getNumber());
            }
            for (int i = 0; i < this.effectConstructorArgument_.size(); i++) {
                codedOutputStream.m91280h0(2, this.effectConstructorArgument_.get(i));
            }
            if ((this.bitField0_ & 2) == 2) {
                codedOutputStream.m91280h0(3, this.conclusionOfConditionalEffect_);
            }
            if ((this.bitField0_ & 4) == 4) {
                codedOutputStream.m91268W(4, this.kind_.getNumber());
            }
            if ((this.bitField0_ & 8) == 8) {
                codedOutputStream.m91268W(5, this.conditionKind_.getNumber());
            }
            codedOutputStream.m91285m0(this.unknownFields);
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite
        public Effect getDefaultInstanceForType() {
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
            return Builder.m90571o();
        }

        private Effect(GeneratedMessageLite.Builder builder) {
            super(builder);
            this.memoizedIsInitialized = (byte) -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = builder.m91332e();
        }

        private Effect(boolean z) {
            this.memoizedIsInitialized = (byte) -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = ByteString.f65615a;
        }
    }

    public static final class EnumEntry extends GeneratedMessageLite.ExtendableMessage<EnumEntry> implements EnumEntryOrBuilder {
        public static Parser<EnumEntry> PARSER = new C15248a();
        private static final EnumEntry defaultInstance;
        private List<Annotation> annotation_;
        private int bitField0_;
        private byte memoizedIsInitialized;
        private int memoizedSerializedSize;
        private int name_;
        private final ByteString unknownFields;

        public static final class Builder extends GeneratedMessageLite.ExtendableBuilder<EnumEntry, Builder> implements EnumEntryOrBuilder {

            /* JADX INFO: renamed from: d */
            public int f65190d;

            /* JADX INFO: renamed from: e */
            public int f65191e;

            /* JADX INFO: renamed from: f */
            public List<Annotation> f65192f = Collections.EMPTY_LIST;

            private Builder() {
                m90590v();
            }

            /* JADX INFO: renamed from: t */
            public static Builder m90588t() {
                return new Builder();
            }

            /* JADX INFO: renamed from: u */
            private void m90589u() {
                if ((this.f65190d & 2) != 2) {
                    this.f65192f = new ArrayList(this.f65192f);
                    this.f65190d |= 2;
                }
            }

            /* JADX INFO: renamed from: v */
            private void m90590v() {
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
            public EnumEntry build() {
                EnumEntry enumEntryM90592r = m90592r();
                if (enumEntryM90592r.isInitialized()) {
                    return enumEntryM90592r;
                }
                throw AbstractMessageLite.Builder.m91133c(enumEntryM90592r);
            }

            /* JADX INFO: renamed from: r */
            public EnumEntry m90592r() {
                EnumEntry enumEntry = new EnumEntry(this);
                int i = (this.f65190d & 1) != 1 ? 0 : 1;
                enumEntry.name_ = this.f65191e;
                if ((this.f65190d & 2) == 2) {
                    this.f65192f = Collections.unmodifiableList(this.f65192f);
                    this.f65190d &= -3;
                }
                enumEntry.annotation_ = this.f65192f;
                enumEntry.bitField0_ = i;
                return enumEntry;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableBuilder
            /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
            public Builder mo90523m() {
                return m90588t().mo90458f(m90592r());
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder
            /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
            public Builder mo90458f(EnumEntry enumEntry) {
                if (enumEntry == EnumEntry.getDefaultInstance()) {
                    return this;
                }
                if (enumEntry.hasName()) {
                    m90596y(enumEntry.getName());
                }
                if (!enumEntry.annotation_.isEmpty()) {
                    if (this.f65192f.isEmpty()) {
                        this.f65192f = enumEntry.annotation_;
                        this.f65190d &= -3;
                    } else {
                        m90589u();
                        this.f65192f.addAll(enumEntry.annotation_);
                    }
                }
                m91337o(enumEntry);
                m91333j(m91332e().m91156c(enumEntry.unknownFields));
                return this;
            }

            /* JADX WARN: Code duplicated, block: B:15:0x001d  */
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            /* JADX INFO: renamed from: x, reason: merged with bridge method [inline-methods] */
            public Builder mo90459i(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws Throwable {
                EnumEntry enumEntry = null;
                try {
                    try {
                        EnumEntry enumEntryMo90487d = EnumEntry.PARSER.mo90487d(codedInputStream, extensionRegistryLite);
                        if (enumEntryMo90487d != null) {
                            mo90458f(enumEntryMo90487d);
                        }
                        return this;
                    } catch (InvalidProtocolBufferException e) {
                        EnumEntry enumEntry2 = (EnumEntry) e.getUnfinishedMessage();
                        try {
                            throw e;
                        } catch (Throwable th) {
                            th = th;
                            enumEntry = enumEntry2;
                            if (enumEntry != null) {
                                mo90458f(enumEntry);
                            }
                            throw th;
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                    if (enumEntry != null) {
                        mo90458f(enumEntry);
                    }
                    throw th;
                }
            }

            /* JADX INFO: renamed from: y */
            public Builder m90596y(int i) {
                this.f65190d |= 1;
                this.f65191e = i;
                return this;
            }
        }

        /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$EnumEntry$a */
        public static class C15248a extends AbstractParser<EnumEntry> {
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.Parser
            /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
            public EnumEntry mo90487d(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return new EnumEntry(codedInputStream, extensionRegistryLite);
            }
        }

        static {
            EnumEntry enumEntry = new EnumEntry(true);
            defaultInstance = enumEntry;
            enumEntry.initFields();
        }

        private EnumEntry(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            this.memoizedIsInitialized = (byte) -1;
            this.memoizedSerializedSize = -1;
            initFields();
            ByteString.Output outputM91150w = ByteString.m91150w();
            CodedOutputStream codedOutputStreamM91226K = CodedOutputStream.m91226K(outputM91150w, 1);
            boolean z = false;
            char c = 0;
            while (!z) {
                try {
                    try {
                        int iM91185K = codedInputStream.m91185K();
                        if (iM91185K != 0) {
                            if (iM91185K == 8) {
                                this.bitField0_ |= 1;
                                this.name_ = codedInputStream.m91209s();
                            } else if (iM91185K == 18) {
                                if ((c & 2) != 2) {
                                    this.annotation_ = new ArrayList();
                                    c = 2;
                                }
                                this.annotation_.add((Annotation) codedInputStream.m91211u(Annotation.PARSER, extensionRegistryLite));
                            } else if (!parseUnknownField(codedInputStream, codedOutputStreamM91226K, extensionRegistryLite, iM91185K)) {
                            }
                        }
                        z = true;
                    } catch (Throwable th) {
                        if ((c & 2) == 2) {
                            this.annotation_ = Collections.unmodifiableList(this.annotation_);
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
            if ((c & 2) == 2) {
                this.annotation_ = Collections.unmodifiableList(this.annotation_);
            }
            try {
                codedOutputStreamM91226K.m91258J();
            } catch (IOException unused2) {
            } finally {
                this.unknownFields = outputM91150w.m91170m();
            }
            makeExtensionsImmutable();
        }

        public static EnumEntry getDefaultInstance() {
            return defaultInstance;
        }

        private void initFields() {
            this.name_ = 0;
            this.annotation_ = Collections.EMPTY_LIST;
        }

        public static Builder newBuilder(EnumEntry enumEntry) {
            return newBuilder().mo90458f(enumEntry);
        }

        public Annotation getAnnotation(int i) {
            return this.annotation_.get(i);
        }

        public int getAnnotationCount() {
            return this.annotation_.size();
        }

        public List<Annotation> getAnnotationList() {
            return this.annotation_;
        }

        public int getName() {
            return this.name_;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public Parser<EnumEntry> getParserForType() {
            return PARSER;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableMessage, kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int iM91243p = (this.bitField0_ & 1) == 1 ? CodedOutputStream.m91243p(1, this.name_) : 0;
            for (int i2 = 0; i2 < this.annotation_.size(); i2++) {
                iM91243p += CodedOutputStream.m91247t(2, this.annotation_.get(i2));
            }
            int iExtensionsSerializedSize = iM91243p + extensionsSerializedSize() + this.unknownFields.size();
            this.memoizedSerializedSize = iExtensionsSerializedSize;
            return iExtensionsSerializedSize;
        }

        public boolean hasName() {
            return (this.bitField0_ & 1) == 1;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableMessage, kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            byte b = this.memoizedIsInitialized;
            if (b == 1) {
                return true;
            }
            if (b == 0) {
                return false;
            }
            for (int i = 0; i < getAnnotationCount(); i++) {
                if (!getAnnotation(i).isInitialized()) {
                    this.memoizedIsInitialized = (byte) 0;
                    return false;
                }
            }
            if (extensionsAreInitialized()) {
                this.memoizedIsInitialized = (byte) 1;
                return true;
            }
            this.memoizedIsInitialized = (byte) 0;
            return false;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableMessage, kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            getSerializedSize();
            GeneratedMessageLite.ExtendableMessage<MessageType>.ExtensionWriter extensionWriterNewExtensionWriter = newExtensionWriter();
            if ((this.bitField0_ & 1) == 1) {
                codedOutputStream.m91277e0(1, this.name_);
            }
            for (int i = 0; i < this.annotation_.size(); i++) {
                codedOutputStream.m91280h0(2, this.annotation_.get(i));
            }
            extensionWriterNewExtensionWriter.m91338a(200, codedOutputStream);
            codedOutputStream.m91285m0(this.unknownFields);
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableMessage, kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite
        public EnumEntry getDefaultInstanceForType() {
            return defaultInstance;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableMessage, kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public Builder newBuilderForType() {
            return newBuilder();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableMessage, kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public Builder toBuilder() {
            return newBuilder(this);
        }

        public static Builder newBuilder() {
            return Builder.m90588t();
        }

        private EnumEntry(GeneratedMessageLite.ExtendableBuilder<EnumEntry, ?> extendableBuilder) {
            super(extendableBuilder);
            this.memoizedIsInitialized = (byte) -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = extendableBuilder.m91332e();
        }

        private EnumEntry(boolean z) {
            this.memoizedIsInitialized = (byte) -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = ByteString.f65615a;
        }
    }

    public static final class Expression extends GeneratedMessageLite implements ExpressionOrBuilder {
        public static Parser<Expression> PARSER = new C15250a();
        private static final Expression defaultInstance;
        private List<Expression> andArgument_;
        private int bitField0_;
        private ConstantValue constantValue_;
        private int flags_;
        private int isInstanceTypeId_;
        private Type isInstanceType_;
        private byte memoizedIsInitialized;
        private int memoizedSerializedSize;
        private List<Expression> orArgument_;
        private final ByteString unknownFields;
        private int valueParameterReference_;

        public static final class Builder extends GeneratedMessageLite.Builder<Expression, Builder> implements ExpressionOrBuilder {

            /* JADX INFO: renamed from: b */
            public int f65193b;

            /* JADX INFO: renamed from: c */
            public int f65194c;

            /* JADX INFO: renamed from: d */
            public int f65195d;

            /* JADX INFO: renamed from: e */
            public ConstantValue f65196e = ConstantValue.TRUE;

            /* JADX INFO: renamed from: f */
            public Type f65197f = Type.getDefaultInstance();

            /* JADX INFO: renamed from: g */
            public int f65198g;

            /* JADX INFO: renamed from: h */
            public List<Expression> f65199h;

            /* JADX INFO: renamed from: i */
            public List<Expression> f65200i;

            private Builder() {
                List<Expression> list = Collections.EMPTY_LIST;
                this.f65199h = list;
                this.f65200i = list;
                m90600r();
            }

            /* JADX INFO: renamed from: o */
            public static Builder m90599o() {
                return new Builder();
            }

            /* JADX INFO: renamed from: r */
            private void m90600r() {
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
            public Expression build() {
                Expression expressionM90602m = m90602m();
                if (expressionM90602m.isInitialized()) {
                    return expressionM90602m;
                }
                throw AbstractMessageLite.Builder.m91133c(expressionM90602m);
            }

            /* JADX INFO: renamed from: m */
            public Expression m90602m() {
                Expression expression = new Expression(this);
                int i = this.f65193b;
                int i2 = (i & 1) != 1 ? 0 : 1;
                expression.flags_ = this.f65194c;
                if ((i & 2) == 2) {
                    i2 |= 2;
                }
                expression.valueParameterReference_ = this.f65195d;
                if ((i & 4) == 4) {
                    i2 |= 4;
                }
                expression.constantValue_ = this.f65196e;
                if ((i & 8) == 8) {
                    i2 |= 8;
                }
                expression.isInstanceType_ = this.f65197f;
                if ((i & 16) == 16) {
                    i2 |= 16;
                }
                expression.isInstanceTypeId_ = this.f65198g;
                if ((this.f65193b & 32) == 32) {
                    this.f65199h = Collections.unmodifiableList(this.f65199h);
                    this.f65193b &= -33;
                }
                expression.andArgument_ = this.f65199h;
                if ((this.f65193b & 64) == 64) {
                    this.f65200i = Collections.unmodifiableList(this.f65200i);
                    this.f65193b &= -65;
                }
                expression.orArgument_ = this.f65200i;
                expression.bitField0_ = i2;
                return expression;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder
            /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
            public Builder mo90523m() {
                return m90599o().mo90458f(m90602m());
            }

            /* JADX INFO: renamed from: p */
            public final void m90604p() {
                if ((this.f65193b & 32) != 32) {
                    this.f65199h = new ArrayList(this.f65199h);
                    this.f65193b |= 32;
                }
            }

            /* JADX INFO: renamed from: q */
            public final void m90605q() {
                if ((this.f65193b & 64) != 64) {
                    this.f65200i = new ArrayList(this.f65200i);
                    this.f65193b |= 64;
                }
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder
            /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
            public Builder mo90458f(Expression expression) {
                if (expression == Expression.getDefaultInstance()) {
                    return this;
                }
                if (expression.hasFlags()) {
                    m90610w(expression.getFlags());
                }
                if (expression.hasValueParameterReference()) {
                    m90612y(expression.getValueParameterReference());
                }
                if (expression.hasConstantValue()) {
                    m90609v(expression.getConstantValue());
                }
                if (expression.hasIsInstanceType()) {
                    m90608u(expression.getIsInstanceType());
                }
                if (expression.hasIsInstanceTypeId()) {
                    m90611x(expression.getIsInstanceTypeId());
                }
                if (!expression.andArgument_.isEmpty()) {
                    if (this.f65199h.isEmpty()) {
                        this.f65199h = expression.andArgument_;
                        this.f65193b &= -33;
                    } else {
                        m90604p();
                        this.f65199h.addAll(expression.andArgument_);
                    }
                }
                if (!expression.orArgument_.isEmpty()) {
                    if (this.f65200i.isEmpty()) {
                        this.f65200i = expression.orArgument_;
                        this.f65193b &= -65;
                    } else {
                        m90605q();
                        this.f65200i.addAll(expression.orArgument_);
                    }
                }
                m91333j(m91332e().m91156c(expression.unknownFields));
                return this;
            }

            /* JADX WARN: Code duplicated, block: B:15:0x001d  */
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
            public Builder mo90459i(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws Throwable {
                Expression expression = null;
                try {
                    try {
                        Expression expressionMo90487d = Expression.PARSER.mo90487d(codedInputStream, extensionRegistryLite);
                        if (expressionMo90487d != null) {
                            mo90458f(expressionMo90487d);
                        }
                        return this;
                    } catch (InvalidProtocolBufferException e) {
                        Expression expression2 = (Expression) e.getUnfinishedMessage();
                        try {
                            throw e;
                        } catch (Throwable th) {
                            th = th;
                            expression = expression2;
                            if (expression != null) {
                                mo90458f(expression);
                            }
                            throw th;
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                    if (expression != null) {
                        mo90458f(expression);
                    }
                    throw th;
                }
            }

            /* JADX INFO: renamed from: u */
            public Builder m90608u(Type type) {
                if ((this.f65193b & 8) != 8 || this.f65197f == Type.getDefaultInstance()) {
                    this.f65197f = type;
                } else {
                    this.f65197f = Type.newBuilder(this.f65197f).mo90458f(type).m90764r();
                }
                this.f65193b |= 8;
                return this;
            }

            /* JADX INFO: renamed from: v */
            public Builder m90609v(ConstantValue constantValue) {
                constantValue.getClass();
                this.f65193b |= 4;
                this.f65196e = constantValue;
                return this;
            }

            /* JADX INFO: renamed from: w */
            public Builder m90610w(int i) {
                this.f65193b |= 1;
                this.f65194c = i;
                return this;
            }

            /* JADX INFO: renamed from: x */
            public Builder m90611x(int i) {
                this.f65193b |= 16;
                this.f65198g = i;
                return this;
            }

            /* JADX INFO: renamed from: y */
            public Builder m90612y(int i) {
                this.f65193b |= 2;
                this.f65195d = i;
                return this;
            }
        }

        public enum ConstantValue implements Internal.EnumLite {
            TRUE(0, 0),
            FALSE(1, 1),
            NULL(2, 2);

            private static Internal.EnumLiteMap<ConstantValue> internalValueMap = new C15249a();
            private final int value;

            /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Expression$ConstantValue$a */
            public static class C15249a implements Internal.EnumLiteMap<ConstantValue> {
                @Override // kotlin.reflect.jvm.internal.impl.protobuf.Internal.EnumLiteMap
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public ConstantValue findValueByNumber(int i) {
                    return ConstantValue.valueOf(i);
                }
            }

            ConstantValue(int i, int i2) {
                this.value = i2;
            }

            public static ConstantValue valueOf(int i) {
                if (i == 0) {
                    return TRUE;
                }
                if (i == 1) {
                    return FALSE;
                }
                if (i != 2) {
                    return null;
                }
                return NULL;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.Internal.EnumLite
            public final int getNumber() {
                return this.value;
            }
        }

        /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Expression$a */
        public static class C15250a extends AbstractParser<Expression> {
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.Parser
            /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
            public Expression mo90487d(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return new Expression(codedInputStream, extensionRegistryLite);
            }
        }

        static {
            Expression expression = new Expression(true);
            defaultInstance = expression;
            expression.initFields();
        }

        private Expression(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
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
                                this.flags_ = codedInputStream.m91209s();
                            } else if (iM91185K == 16) {
                                this.bitField0_ |= 2;
                                this.valueParameterReference_ = codedInputStream.m91209s();
                            } else if (iM91185K == 24) {
                                int iM91204n = codedInputStream.m91204n();
                                ConstantValue constantValueValueOf = ConstantValue.valueOf(iM91204n);
                                if (constantValueValueOf == null) {
                                    codedOutputStreamM91226K.m91291s0(iM91185K);
                                    codedOutputStreamM91226K.m91291s0(iM91204n);
                                } else {
                                    this.bitField0_ |= 4;
                                    this.constantValue_ = constantValueValueOf;
                                }
                            } else if (iM91185K == 34) {
                                Type.Builder builder = (this.bitField0_ & 8) == 8 ? this.isInstanceType_.toBuilder() : null;
                                Type type = (Type) codedInputStream.m91211u(Type.PARSER, extensionRegistryLite);
                                this.isInstanceType_ = type;
                                if (builder != null) {
                                    builder.mo90458f(type);
                                    this.isInstanceType_ = builder.m90764r();
                                }
                                this.bitField0_ |= 8;
                            } else if (iM91185K == 40) {
                                this.bitField0_ |= 16;
                                this.isInstanceTypeId_ = codedInputStream.m91209s();
                            } else if (iM91185K == 50) {
                                if ((i & 32) != 32) {
                                    this.andArgument_ = new ArrayList();
                                    i |= 32;
                                }
                                this.andArgument_.add((Expression) codedInputStream.m91211u(PARSER, extensionRegistryLite));
                            } else if (iM91185K == 58) {
                                if ((i & 64) != 64) {
                                    this.orArgument_ = new ArrayList();
                                    i |= 64;
                                }
                                this.orArgument_.add((Expression) codedInputStream.m91211u(PARSER, extensionRegistryLite));
                            } else if (!parseUnknownField(codedInputStream, codedOutputStreamM91226K, extensionRegistryLite, iM91185K)) {
                            }
                        }
                        z = true;
                    } catch (Throwable th) {
                        if ((i & 32) == 32) {
                            this.andArgument_ = Collections.unmodifiableList(this.andArgument_);
                        }
                        if ((i & 64) == 64) {
                            this.orArgument_ = Collections.unmodifiableList(this.orArgument_);
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
            if ((i & 32) == 32) {
                this.andArgument_ = Collections.unmodifiableList(this.andArgument_);
            }
            if ((i & 64) == 64) {
                this.orArgument_ = Collections.unmodifiableList(this.orArgument_);
            }
            try {
                codedOutputStreamM91226K.m91258J();
            } catch (IOException unused2) {
            } finally {
                this.unknownFields = outputM91150w.m91170m();
            }
            makeExtensionsImmutable();
        }

        public static Expression getDefaultInstance() {
            return defaultInstance;
        }

        private void initFields() {
            this.flags_ = 0;
            this.valueParameterReference_ = 0;
            this.constantValue_ = ConstantValue.TRUE;
            this.isInstanceType_ = Type.getDefaultInstance();
            this.isInstanceTypeId_ = 0;
            List<Expression> list = Collections.EMPTY_LIST;
            this.andArgument_ = list;
            this.orArgument_ = list;
        }

        public static Builder newBuilder(Expression expression) {
            return newBuilder().mo90458f(expression);
        }

        public Expression getAndArgument(int i) {
            return this.andArgument_.get(i);
        }

        public int getAndArgumentCount() {
            return this.andArgument_.size();
        }

        public List<Expression> getAndArgumentList() {
            return this.andArgument_;
        }

        public ConstantValue getConstantValue() {
            return this.constantValue_;
        }

        public int getFlags() {
            return this.flags_;
        }

        public Type getIsInstanceType() {
            return this.isInstanceType_;
        }

        public int getIsInstanceTypeId() {
            return this.isInstanceTypeId_;
        }

        public Expression getOrArgument(int i) {
            return this.orArgument_.get(i);
        }

        public int getOrArgumentCount() {
            return this.orArgument_.size();
        }

        public List<Expression> getOrArgumentList() {
            return this.orArgument_;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public Parser<Expression> getParserForType() {
            return PARSER;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int iM91243p = (this.bitField0_ & 1) == 1 ? CodedOutputStream.m91243p(1, this.flags_) : 0;
            if ((this.bitField0_ & 2) == 2) {
                iM91243p += CodedOutputStream.m91243p(2, this.valueParameterReference_);
            }
            if ((this.bitField0_ & 4) == 4) {
                iM91243p += CodedOutputStream.m91236i(3, this.constantValue_.getNumber());
            }
            if ((this.bitField0_ & 8) == 8) {
                iM91243p += CodedOutputStream.m91247t(4, this.isInstanceType_);
            }
            if ((this.bitField0_ & 16) == 16) {
                iM91243p += CodedOutputStream.m91243p(5, this.isInstanceTypeId_);
            }
            for (int i2 = 0; i2 < this.andArgument_.size(); i2++) {
                iM91243p += CodedOutputStream.m91247t(6, this.andArgument_.get(i2));
            }
            for (int i3 = 0; i3 < this.orArgument_.size(); i3++) {
                iM91243p += CodedOutputStream.m91247t(7, this.orArgument_.get(i3));
            }
            int size = iM91243p + this.unknownFields.size();
            this.memoizedSerializedSize = size;
            return size;
        }

        public int getValueParameterReference() {
            return this.valueParameterReference_;
        }

        public boolean hasConstantValue() {
            return (this.bitField0_ & 4) == 4;
        }

        public boolean hasFlags() {
            return (this.bitField0_ & 1) == 1;
        }

        public boolean hasIsInstanceType() {
            return (this.bitField0_ & 8) == 8;
        }

        public boolean hasIsInstanceTypeId() {
            return (this.bitField0_ & 16) == 16;
        }

        public boolean hasValueParameterReference() {
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
            if (hasIsInstanceType() && !getIsInstanceType().isInitialized()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            for (int i = 0; i < getAndArgumentCount(); i++) {
                if (!getAndArgument(i).isInitialized()) {
                    this.memoizedIsInitialized = (byte) 0;
                    return false;
                }
            }
            for (int i2 = 0; i2 < getOrArgumentCount(); i2++) {
                if (!getOrArgument(i2).isInitialized()) {
                    this.memoizedIsInitialized = (byte) 0;
                    return false;
                }
            }
            this.memoizedIsInitialized = (byte) 1;
            return true;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            getSerializedSize();
            if ((this.bitField0_ & 1) == 1) {
                codedOutputStream.m91277e0(1, this.flags_);
            }
            if ((this.bitField0_ & 2) == 2) {
                codedOutputStream.m91277e0(2, this.valueParameterReference_);
            }
            if ((this.bitField0_ & 4) == 4) {
                codedOutputStream.m91268W(3, this.constantValue_.getNumber());
            }
            if ((this.bitField0_ & 8) == 8) {
                codedOutputStream.m91280h0(4, this.isInstanceType_);
            }
            if ((this.bitField0_ & 16) == 16) {
                codedOutputStream.m91277e0(5, this.isInstanceTypeId_);
            }
            for (int i = 0; i < this.andArgument_.size(); i++) {
                codedOutputStream.m91280h0(6, this.andArgument_.get(i));
            }
            for (int i2 = 0; i2 < this.orArgument_.size(); i2++) {
                codedOutputStream.m91280h0(7, this.orArgument_.get(i2));
            }
            codedOutputStream.m91285m0(this.unknownFields);
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite
        public Expression getDefaultInstanceForType() {
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
            return Builder.m90599o();
        }

        private Expression(GeneratedMessageLite.Builder builder) {
            super(builder);
            this.memoizedIsInitialized = (byte) -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = builder.m91332e();
        }

        private Expression(boolean z) {
            this.memoizedIsInitialized = (byte) -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = ByteString.f65615a;
        }
    }

    public static final class Function extends GeneratedMessageLite.ExtendableMessage<Function> implements FunctionOrBuilder {
        public static Parser<Function> PARSER = new C15251a();
        private static final Function defaultInstance;
        private List<Annotation> annotation_;
        private int bitField0_;
        private List<CompilerPluginData> compilerPluginData_;
        private List<ValueParameter> contextParameter_;
        private int contextReceiverTypeIdMemoizedSerializedSize;
        private List<Integer> contextReceiverTypeId_;
        private List<Type> contextReceiverType_;
        private Contract contract_;
        private List<Annotation> extensionReceiverAnnotation_;
        private int flags_;
        private byte memoizedIsInitialized;
        private int memoizedSerializedSize;
        private int name_;
        private int oldFlags_;
        private int receiverTypeId_;
        private Type receiverType_;
        private int returnTypeId_;
        private Type returnType_;
        private List<TypeParameter> typeParameter_;
        private TypeTable typeTable_;
        private final ByteString unknownFields;
        private List<ValueParameter> valueParameter_;
        private List<Integer> versionRequirement_;

        public static final class Builder extends GeneratedMessageLite.ExtendableBuilder<Function, Builder> implements FunctionOrBuilder {

            /* JADX INFO: renamed from: d */
            public int f65201d;

            /* JADX INFO: renamed from: g */
            public int f65204g;

            /* JADX INFO: renamed from: i */
            public int f65206i;

            /* JADX INFO: renamed from: j */
            public List<TypeParameter> f65207j;

            /* JADX INFO: renamed from: k */
            public Type f65208k;

            /* JADX INFO: renamed from: l */
            public int f65209l;

            /* JADX INFO: renamed from: m */
            public List<Type> f65210m;

            /* JADX INFO: renamed from: n */
            public List<Integer> f65211n;

            /* JADX INFO: renamed from: o */
            public List<ValueParameter> f65212o;

            /* JADX INFO: renamed from: p */
            public List<ValueParameter> f65213p;

            /* JADX INFO: renamed from: q */
            public TypeTable f65214q;

            /* JADX INFO: renamed from: r */
            public List<Integer> f65215r;

            /* JADX INFO: renamed from: s */
            public Contract f65216s;

            /* JADX INFO: renamed from: t */
            public List<CompilerPluginData> f65217t;

            /* JADX INFO: renamed from: u */
            public List<Annotation> f65218u;

            /* JADX INFO: renamed from: v */
            public List<Annotation> f65219v;

            /* JADX INFO: renamed from: e */
            public int f65202e = 6;

            /* JADX INFO: renamed from: f */
            public int f65203f = 6;

            /* JADX INFO: renamed from: h */
            public Type f65205h = Type.getDefaultInstance();

            private Builder() {
                List list = Collections.EMPTY_LIST;
                this.f65207j = list;
                this.f65208k = Type.getDefaultInstance();
                this.f65210m = list;
                this.f65211n = list;
                this.f65212o = list;
                this.f65213p = list;
                this.f65214q = TypeTable.getDefaultInstance();
                this.f65215r = list;
                this.f65216s = Contract.getDefaultInstance();
                this.f65217t = list;
                this.f65218u = list;
                this.f65219v = list;
                m90618D();
            }

            /* JADX INFO: renamed from: A */
            private void m90615A() {
                if ((this.f65201d & 32) != 32) {
                    this.f65207j = new ArrayList(this.f65207j);
                    this.f65201d |= 32;
                }
            }

            /* JADX INFO: renamed from: B */
            private void m90616B() {
                if ((this.f65201d & 2048) != 2048) {
                    this.f65213p = new ArrayList(this.f65213p);
                    this.f65201d |= 2048;
                }
            }

            /* JADX INFO: renamed from: C */
            private void m90617C() {
                if ((this.f65201d & 8192) != 8192) {
                    this.f65215r = new ArrayList(this.f65215r);
                    this.f65201d |= 8192;
                }
            }

            /* JADX INFO: renamed from: D */
            private void m90618D() {
            }

            /* JADX INFO: renamed from: t */
            public static Builder m90620t() {
                return new Builder();
            }

            /* JADX INFO: renamed from: u */
            private void m90621u() {
                if ((this.f65201d & 65536) != 65536) {
                    this.f65218u = new ArrayList(this.f65218u);
                    this.f65201d |= 65536;
                }
            }

            /* JADX INFO: renamed from: v */
            private void m90622v() {
                if ((this.f65201d & 32768) != 32768) {
                    this.f65217t = new ArrayList(this.f65217t);
                    this.f65201d |= 32768;
                }
            }

            /* JADX INFO: renamed from: x */
            private void m90623x() {
                if ((this.f65201d & 512) != 512) {
                    this.f65211n = new ArrayList(this.f65211n);
                    this.f65201d |= 512;
                }
            }

            /* JADX INFO: renamed from: y */
            private void m90624y() {
                if ((this.f65201d & 256) != 256) {
                    this.f65210m = new ArrayList(this.f65210m);
                    this.f65201d |= 256;
                }
            }

            /* JADX INFO: renamed from: E */
            public Builder m90625E(Contract contract) {
                if ((this.f65201d & 16384) != 16384 || this.f65216s == Contract.getDefaultInstance()) {
                    this.f65216s = contract;
                } else {
                    this.f65216s = Contract.newBuilder(this.f65216s).mo90458f(contract).m90564m();
                }
                this.f65201d |= 16384;
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder
            /* JADX INFO: renamed from: G, reason: merged with bridge method [inline-methods] */
            public Builder mo90458f(Function function) {
                if (function == Function.getDefaultInstance()) {
                    return this;
                }
                if (function.hasFlags()) {
                    m90631O(function.getFlags());
                }
                if (function.hasOldFlags()) {
                    m90633Q(function.getOldFlags());
                }
                if (function.hasName()) {
                    m90632P(function.getName());
                }
                if (function.hasReturnType()) {
                    m90629M(function.getReturnType());
                }
                if (function.hasReturnTypeId()) {
                    m90635S(function.getReturnTypeId());
                }
                if (!function.typeParameter_.isEmpty()) {
                    if (this.f65207j.isEmpty()) {
                        this.f65207j = function.typeParameter_;
                        this.f65201d &= -33;
                    } else {
                        m90615A();
                        this.f65207j.addAll(function.typeParameter_);
                    }
                }
                if (function.hasReceiverType()) {
                    m90628L(function.getReceiverType());
                }
                if (function.hasReceiverTypeId()) {
                    m90634R(function.getReceiverTypeId());
                }
                if (!function.contextReceiverType_.isEmpty()) {
                    if (this.f65210m.isEmpty()) {
                        this.f65210m = function.contextReceiverType_;
                        this.f65201d &= -257;
                    } else {
                        m90624y();
                        this.f65210m.addAll(function.contextReceiverType_);
                    }
                }
                if (!function.contextReceiverTypeId_.isEmpty()) {
                    if (this.f65211n.isEmpty()) {
                        this.f65211n = function.contextReceiverTypeId_;
                        this.f65201d &= -513;
                    } else {
                        m90623x();
                        this.f65211n.addAll(function.contextReceiverTypeId_);
                    }
                }
                if (!function.contextParameter_.isEmpty()) {
                    if (this.f65212o.isEmpty()) {
                        this.f65212o = function.contextParameter_;
                        this.f65201d &= ErrorCode.ERROR_CODE_JOIN_ROOM_ROOM_FORBIDDEN;
                    } else {
                        m90639w();
                        this.f65212o.addAll(function.contextParameter_);
                    }
                }
                if (!function.valueParameter_.isEmpty()) {
                    if (this.f65213p.isEmpty()) {
                        this.f65213p = function.valueParameter_;
                        this.f65201d &= -2049;
                    } else {
                        m90616B();
                        this.f65213p.addAll(function.valueParameter_);
                    }
                }
                if (function.hasTypeTable()) {
                    m90630N(function.getTypeTable());
                }
                if (!function.versionRequirement_.isEmpty()) {
                    if (this.f65215r.isEmpty()) {
                        this.f65215r = function.versionRequirement_;
                        this.f65201d &= -8193;
                    } else {
                        m90617C();
                        this.f65215r.addAll(function.versionRequirement_);
                    }
                }
                if (function.hasContract()) {
                    m90625E(function.getContract());
                }
                if (!function.compilerPluginData_.isEmpty()) {
                    if (this.f65217t.isEmpty()) {
                        this.f65217t = function.compilerPluginData_;
                        this.f65201d &= -32769;
                    } else {
                        m90622v();
                        this.f65217t.addAll(function.compilerPluginData_);
                    }
                }
                if (!function.annotation_.isEmpty()) {
                    if (this.f65218u.isEmpty()) {
                        this.f65218u = function.annotation_;
                        this.f65201d &= -65537;
                    } else {
                        m90621u();
                        this.f65218u.addAll(function.annotation_);
                    }
                }
                if (!function.extensionReceiverAnnotation_.isEmpty()) {
                    if (this.f65219v.isEmpty()) {
                        this.f65219v = function.extensionReceiverAnnotation_;
                        this.f65201d &= -131073;
                    } else {
                        m90640z();
                        this.f65219v.addAll(function.extensionReceiverAnnotation_);
                    }
                }
                m91337o(function);
                m91333j(m91332e().m91156c(function.unknownFields));
                return this;
            }

            /* JADX WARN: Code duplicated, block: B:15:0x001d  */
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            /* JADX INFO: renamed from: K, reason: merged with bridge method [inline-methods] */
            public Builder mo90459i(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws Throwable {
                Function function = null;
                try {
                    try {
                        Function functionMo90487d = Function.PARSER.mo90487d(codedInputStream, extensionRegistryLite);
                        if (functionMo90487d != null) {
                            mo90458f(functionMo90487d);
                        }
                        return this;
                    } catch (InvalidProtocolBufferException e) {
                        Function function2 = (Function) e.getUnfinishedMessage();
                        try {
                            throw e;
                        } catch (Throwable th) {
                            th = th;
                            function = function2;
                            if (function != null) {
                                mo90458f(function);
                            }
                            throw th;
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                    if (function != null) {
                        mo90458f(function);
                    }
                    throw th;
                }
            }

            /* JADX INFO: renamed from: L */
            public Builder m90628L(Type type) {
                if ((this.f65201d & 64) != 64 || this.f65208k == Type.getDefaultInstance()) {
                    this.f65208k = type;
                } else {
                    this.f65208k = Type.newBuilder(this.f65208k).mo90458f(type).m90764r();
                }
                this.f65201d |= 64;
                return this;
            }

            /* JADX INFO: renamed from: M */
            public Builder m90629M(Type type) {
                if ((this.f65201d & 8) != 8 || this.f65205h == Type.getDefaultInstance()) {
                    this.f65205h = type;
                } else {
                    this.f65205h = Type.newBuilder(this.f65205h).mo90458f(type).m90764r();
                }
                this.f65201d |= 8;
                return this;
            }

            /* JADX INFO: renamed from: N */
            public Builder m90630N(TypeTable typeTable) {
                if ((this.f65201d & 4096) != 4096 || this.f65214q == TypeTable.getDefaultInstance()) {
                    this.f65214q = typeTable;
                } else {
                    this.f65214q = TypeTable.newBuilder(this.f65214q).mo90458f(typeTable).m90810m();
                }
                this.f65201d |= 4096;
                return this;
            }

            /* JADX INFO: renamed from: O */
            public Builder m90631O(int i) {
                this.f65201d |= 1;
                this.f65202e = i;
                return this;
            }

            /* JADX INFO: renamed from: P */
            public Builder m90632P(int i) {
                this.f65201d |= 4;
                this.f65204g = i;
                return this;
            }

            /* JADX INFO: renamed from: Q */
            public Builder m90633Q(int i) {
                this.f65201d |= 2;
                this.f65203f = i;
                return this;
            }

            /* JADX INFO: renamed from: R */
            public Builder m90634R(int i) {
                this.f65201d |= 128;
                this.f65209l = i;
                return this;
            }

            /* JADX INFO: renamed from: S */
            public Builder m90635S(int i) {
                this.f65201d |= 16;
                this.f65206i = i;
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
            public Function build() {
                Function functionM90637r = m90637r();
                if (functionM90637r.isInitialized()) {
                    return functionM90637r;
                }
                throw AbstractMessageLite.Builder.m91133c(functionM90637r);
            }

            /* JADX INFO: renamed from: r */
            public Function m90637r() {
                Function function = new Function(this);
                int i = this.f65201d;
                int i2 = (i & 1) != 1 ? 0 : 1;
                function.flags_ = this.f65202e;
                if ((i & 2) == 2) {
                    i2 |= 2;
                }
                function.oldFlags_ = this.f65203f;
                if ((i & 4) == 4) {
                    i2 |= 4;
                }
                function.name_ = this.f65204g;
                if ((i & 8) == 8) {
                    i2 |= 8;
                }
                function.returnType_ = this.f65205h;
                if ((i & 16) == 16) {
                    i2 |= 16;
                }
                function.returnTypeId_ = this.f65206i;
                if ((this.f65201d & 32) == 32) {
                    this.f65207j = Collections.unmodifiableList(this.f65207j);
                    this.f65201d &= -33;
                }
                function.typeParameter_ = this.f65207j;
                if ((i & 64) == 64) {
                    i2 |= 32;
                }
                function.receiverType_ = this.f65208k;
                if ((i & 128) == 128) {
                    i2 |= 64;
                }
                function.receiverTypeId_ = this.f65209l;
                if ((this.f65201d & 256) == 256) {
                    this.f65210m = Collections.unmodifiableList(this.f65210m);
                    this.f65201d &= -257;
                }
                function.contextReceiverType_ = this.f65210m;
                if ((this.f65201d & 512) == 512) {
                    this.f65211n = Collections.unmodifiableList(this.f65211n);
                    this.f65201d &= -513;
                }
                function.contextReceiverTypeId_ = this.f65211n;
                if ((this.f65201d & 1024) == 1024) {
                    this.f65212o = Collections.unmodifiableList(this.f65212o);
                    this.f65201d &= ErrorCode.ERROR_CODE_JOIN_ROOM_ROOM_FORBIDDEN;
                }
                function.contextParameter_ = this.f65212o;
                if ((this.f65201d & 2048) == 2048) {
                    this.f65213p = Collections.unmodifiableList(this.f65213p);
                    this.f65201d &= -2049;
                }
                function.valueParameter_ = this.f65213p;
                if ((i & 4096) == 4096) {
                    i2 |= 128;
                }
                function.typeTable_ = this.f65214q;
                if ((this.f65201d & 8192) == 8192) {
                    this.f65215r = Collections.unmodifiableList(this.f65215r);
                    this.f65201d &= -8193;
                }
                function.versionRequirement_ = this.f65215r;
                if ((i & 16384) == 16384) {
                    i2 |= 256;
                }
                function.contract_ = this.f65216s;
                if ((this.f65201d & 32768) == 32768) {
                    this.f65217t = Collections.unmodifiableList(this.f65217t);
                    this.f65201d &= -32769;
                }
                function.compilerPluginData_ = this.f65217t;
                if ((this.f65201d & 65536) == 65536) {
                    this.f65218u = Collections.unmodifiableList(this.f65218u);
                    this.f65201d &= -65537;
                }
                function.annotation_ = this.f65218u;
                if ((this.f65201d & 131072) == 131072) {
                    this.f65219v = Collections.unmodifiableList(this.f65219v);
                    this.f65201d &= -131073;
                }
                function.extensionReceiverAnnotation_ = this.f65219v;
                function.bitField0_ = i2;
                return function;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableBuilder
            /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
            public Builder mo90523m() {
                return m90620t().mo90458f(m90637r());
            }

            /* JADX INFO: renamed from: w */
            public final void m90639w() {
                if ((this.f65201d & 1024) != 1024) {
                    this.f65212o = new ArrayList(this.f65212o);
                    this.f65201d |= 1024;
                }
            }

            /* JADX INFO: renamed from: z */
            public final void m90640z() {
                if ((this.f65201d & 131072) != 131072) {
                    this.f65219v = new ArrayList(this.f65219v);
                    this.f65201d |= 131072;
                }
            }
        }

        /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Function$a */
        public static class C15251a extends AbstractParser<Function> {
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.Parser
            /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
            public Function mo90487d(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return new Function(codedInputStream, extensionRegistryLite);
            }
        }

        static {
            Function function = new Function(true);
            defaultInstance = function;
            function.initFields();
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Code duplicated, block: B:10:0x0044  */
        /* JADX WARN: Code duplicated, block: B:134:0x0330  */
        /* JADX WARN: Code duplicated, block: B:137:0x033c  */
        /* JADX WARN: Code duplicated, block: B:140:0x0348  */
        /* JADX WARN: Code duplicated, block: B:143:0x0354  */
        /* JADX WARN: Code duplicated, block: B:146:0x0360  */
        /* JADX WARN: Code duplicated, block: B:149:0x036c  */
        /* JADX WARN: Code duplicated, block: B:152:0x0378  */
        /* JADX WARN: Code duplicated, block: B:155:0x0386  */
        /* JADX WARN: Code duplicated, block: B:158:0x0394  */
        /* JADX WARN: Multi-variable type inference failed */
        private Function(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws Throwable {
            int i;
            this.contextReceiverTypeIdMemoizedSerializedSize = -1;
            this.memoizedIsInitialized = (byte) -1;
            this.memoizedSerializedSize = -1;
            initFields();
            ByteString.Output outputM91150w = ByteString.m91150w();
            boolean z = true;
            CodedOutputStream codedOutputStreamM91226K = CodedOutputStream.m91226K(outputM91150w, 1);
            boolean z2 = false;
            int i2 = 0;
            while (true) {
                int i3 = 32768;
                int i4 = 131072;
                boolean z3 = z;
                if (z2) {
                    if ((i2 & 32) == 32) {
                        this.typeParameter_ = Collections.unmodifiableList(this.typeParameter_);
                    }
                    if ((i2 & 2048) == 2048) {
                        this.valueParameter_ = Collections.unmodifiableList(this.valueParameter_);
                    }
                    if ((i2 & 256) == 256) {
                        this.contextReceiverType_ = Collections.unmodifiableList(this.contextReceiverType_);
                    }
                    if ((i2 & 512) == 512) {
                        this.contextReceiverTypeId_ = Collections.unmodifiableList(this.contextReceiverTypeId_);
                    }
                    if ((i2 & 65536) == 65536) {
                        this.annotation_ = Collections.unmodifiableList(this.annotation_);
                    }
                    if ((i2 & 1024) == 1024) {
                        this.contextParameter_ = Collections.unmodifiableList(this.contextParameter_);
                    }
                    if ((i2 & 8192) == 8192) {
                        this.versionRequirement_ = Collections.unmodifiableList(this.versionRequirement_);
                    }
                    if ((i2 & 32768) == 32768) {
                        this.compilerPluginData_ = Collections.unmodifiableList(this.compilerPluginData_);
                    }
                    if ((i2 & 131072) == 131072) {
                        this.extensionReceiverAnnotation_ = Collections.unmodifiableList(this.extensionReceiverAnnotation_);
                    }
                    try {
                        codedOutputStreamM91226K.m91258J();
                    } catch (IOException unused) {
                    } finally {
                        this.unknownFields = outputM91150w.m91170m();
                    }
                    makeExtensionsImmutable();
                    return;
                }
                try {
                    int iM91185K = codedInputStream.m91185K();
                    switch (iM91185K) {
                        case 0:
                            z2 = z3;
                            z = z3;
                            break;
                        case 8:
                            this.bitField0_ |= 2;
                            this.oldFlags_ = codedInputStream.m91209s();
                            z = z3;
                            break;
                        case 16:
                            this.bitField0_ |= 4;
                            this.name_ = codedInputStream.m91209s();
                            z = z3;
                            break;
                        case 26:
                            Type.Builder builder = (this.bitField0_ & 8) == 8 ? this.returnType_.toBuilder() : null;
                            Type type = (Type) codedInputStream.m91211u(Type.PARSER, extensionRegistryLite);
                            this.returnType_ = type;
                            if (builder != 0) {
                                builder.mo90458f(type);
                                this.returnType_ = builder.m90764r();
                            }
                            this.bitField0_ |= 8;
                            z = z3;
                            break;
                        case 34:
                            if ((i2 & 32) != 32) {
                                this.typeParameter_ = new ArrayList();
                                i2 |= 32;
                            }
                            this.typeParameter_.add((TypeParameter) codedInputStream.m91211u(TypeParameter.PARSER, extensionRegistryLite));
                            z = z3;
                            break;
                        case 42:
                            Type.Builder builder2 = (this.bitField0_ & 32) == 32 ? this.receiverType_.toBuilder() : null;
                            Type type2 = (Type) codedInputStream.m91211u(Type.PARSER, extensionRegistryLite);
                            this.receiverType_ = type2;
                            if (builder2 != 0) {
                                builder2.mo90458f(type2);
                                this.receiverType_ = builder2.m90764r();
                            }
                            this.bitField0_ |= 32;
                            z = z3;
                            break;
                        case 50:
                            if ((i2 & 2048) != 2048) {
                                this.valueParameter_ = new ArrayList();
                                i2 |= 2048;
                            }
                            this.valueParameter_.add((ValueParameter) codedInputStream.m91211u(ValueParameter.PARSER, extensionRegistryLite));
                            z = z3;
                            break;
                        case 56:
                            this.bitField0_ |= 16;
                            this.returnTypeId_ = codedInputStream.m91209s();
                            z = z3;
                            break;
                        case 64:
                            this.bitField0_ |= 64;
                            this.receiverTypeId_ = codedInputStream.m91209s();
                            z = z3;
                            break;
                        case 72:
                            this.bitField0_ |= 1;
                            this.flags_ = codedInputStream.m91209s();
                            z = z3;
                            break;
                        case EACTags.COMMAND_TO_PERFORM /* 82 */:
                            if ((i2 & 256) != 256) {
                                this.contextReceiverType_ = new ArrayList();
                                i2 |= 256;
                            }
                            this.contextReceiverType_.add((Type) codedInputStream.m91211u(Type.PARSER, extensionRegistryLite));
                            z = z3;
                            break;
                        case 88:
                            if ((i2 & 512) != 512) {
                                this.contextReceiverTypeId_ = new ArrayList();
                                i2 |= 512;
                            }
                            this.contextReceiverTypeId_.add(Integer.valueOf(codedInputStream.m91209s()));
                            z = z3;
                            break;
                        case 90:
                            int iM91200j = codedInputStream.m91200j(codedInputStream.m91176A());
                            if ((i2 & 512) != 512 && codedInputStream.m91197e() > 0) {
                                this.contextReceiverTypeId_ = new ArrayList();
                                i2 |= 512;
                            }
                            while (codedInputStream.m91197e() > 0) {
                                this.contextReceiverTypeId_.add(Integer.valueOf(codedInputStream.m91209s()));
                            }
                            codedInputStream.m91199i(iM91200j);
                            z = z3;
                            break;
                        case EACTags.FCP_TEMPLATE /* 98 */:
                            if ((i2 & 65536) != 65536) {
                                this.annotation_ = new ArrayList();
                                i2 |= 65536;
                            }
                            this.annotation_.add((Annotation) codedInputStream.m91211u(Annotation.PARSER, extensionRegistryLite));
                            z = z3;
                            break;
                        case 106:
                            if ((i2 & 1024) != 1024) {
                                this.contextParameter_ = new ArrayList();
                                i2 |= 1024;
                            }
                            this.contextParameter_.add((ValueParameter) codedInputStream.m91211u(ValueParameter.PARSER, extensionRegistryLite));
                            z = z3;
                            break;
                        case 242:
                            TypeTable.Builder builder3 = (this.bitField0_ & 128) == 128 ? this.typeTable_.toBuilder() : null;
                            TypeTable typeTable = (TypeTable) codedInputStream.m91211u(TypeTable.PARSER, extensionRegistryLite);
                            this.typeTable_ = typeTable;
                            if (builder3 != 0) {
                                builder3.mo90458f(typeTable);
                                this.typeTable_ = builder3.m90810m();
                            }
                            this.bitField0_ |= 128;
                            z = z3;
                            break;
                        case 248:
                            if ((i2 & 8192) != 8192) {
                                this.versionRequirement_ = new ArrayList();
                                i2 |= 8192;
                            }
                            this.versionRequirement_.add(Integer.valueOf(codedInputStream.m91209s()));
                            z = z3;
                            break;
                        case 250:
                            i4 = 131072;
                            int iM91200j2 = codedInputStream.m91200j(codedInputStream.m91176A());
                            if ((i2 & 8192) != 8192 && codedInputStream.m91197e() > 0) {
                                this.versionRequirement_ = new ArrayList();
                                i2 |= 8192;
                            }
                            while (codedInputStream.m91197e() > 0) {
                                i = i3;
                                try {
                                    try {
                                        this.versionRequirement_.add(Integer.valueOf(codedInputStream.m91209s()));
                                        i3 = i;
                                    } catch (Throwable th) {
                                        th = th;
                                        if ((i2 & 32) == 32) {
                                            this.typeParameter_ = Collections.unmodifiableList(this.typeParameter_);
                                        }
                                        if ((i2 & 2048) == 2048) {
                                            this.valueParameter_ = Collections.unmodifiableList(this.valueParameter_);
                                        }
                                        if ((i2 & 256) == 256) {
                                            this.contextReceiverType_ = Collections.unmodifiableList(this.contextReceiverType_);
                                        }
                                        if ((i2 & 512) == 512) {
                                            this.contextReceiverTypeId_ = Collections.unmodifiableList(this.contextReceiverTypeId_);
                                        }
                                        if ((i2 & 65536) == 65536) {
                                            this.annotation_ = Collections.unmodifiableList(this.annotation_);
                                        }
                                        if ((i2 & 1024) == 1024) {
                                            this.contextParameter_ = Collections.unmodifiableList(this.contextParameter_);
                                        }
                                        if ((i2 & 8192) == 8192) {
                                            this.versionRequirement_ = Collections.unmodifiableList(this.versionRequirement_);
                                        }
                                        if ((i2 & i) == i) {
                                            this.compilerPluginData_ = Collections.unmodifiableList(this.compilerPluginData_);
                                        }
                                        if ((i2 & i4) == i4) {
                                            this.extensionReceiverAnnotation_ = Collections.unmodifiableList(this.extensionReceiverAnnotation_);
                                        }
                                        try {
                                            codedOutputStreamM91226K.m91258J();
                                            break;
                                        } catch (IOException unused2) {
                                        } finally {
                                            this.unknownFields = outputM91150w.m91170m();
                                        }
                                        makeExtensionsImmutable();
                                        throw th;
                                    }
                                } catch (InvalidProtocolBufferException e) {
                                    e = e;
                                    throw e.setUnfinishedMessage(this);
                                } catch (IOException e2) {
                                    e = e2;
                                    throw new InvalidProtocolBufferException(e.getMessage()).setUnfinishedMessage(this);
                                }
                            }
                            codedInputStream.m91199i(iM91200j2);
                            z = z3;
                            break;
                        case 258:
                            Contract.Builder builder4 = (this.bitField0_ & 256) == 256 ? this.contract_.toBuilder() : null;
                            Contract contract = (Contract) codedInputStream.m91211u(Contract.PARSER, extensionRegistryLite);
                            this.contract_ = contract;
                            if (builder4 != 0) {
                                builder4.mo90458f(contract);
                                this.contract_ = builder4.m90564m();
                            }
                            this.bitField0_ |= 256;
                            z = z3;
                            break;
                        case 266:
                            if ((i2 & 32768) != 32768) {
                                this.compilerPluginData_ = new ArrayList();
                                i2 |= 32768;
                            }
                            this.compilerPluginData_.add((CompilerPluginData) codedInputStream.m91211u(CompilerPluginData.PARSER, extensionRegistryLite));
                            z = z3;
                            break;
                        case 274:
                            if ((i2 & 131072) != 131072) {
                                this.extensionReceiverAnnotation_ = new ArrayList();
                                i2 |= 131072;
                            }
                            try {
                                try {
                                    this.extensionReceiverAnnotation_.add((Annotation) codedInputStream.m91211u(Annotation.PARSER, extensionRegistryLite));
                                    z = z3;
                                } catch (InvalidProtocolBufferException e3) {
                                    e = e3;
                                    throw e.setUnfinishedMessage(this);
                                } catch (IOException e4) {
                                    e = e4;
                                    throw new InvalidProtocolBufferException(e.getMessage()).setUnfinishedMessage(this);
                                } catch (Throwable th2) {
                                    th = th2;
                                    i = 32768;
                                    if ((i2 & 32) == 32) {
                                        this.typeParameter_ = Collections.unmodifiableList(this.typeParameter_);
                                    }
                                    if ((i2 & 2048) == 2048) {
                                        this.valueParameter_ = Collections.unmodifiableList(this.valueParameter_);
                                    }
                                    if ((i2 & 256) == 256) {
                                        this.contextReceiverType_ = Collections.unmodifiableList(this.contextReceiverType_);
                                    }
                                    if ((i2 & 512) == 512) {
                                        this.contextReceiverTypeId_ = Collections.unmodifiableList(this.contextReceiverTypeId_);
                                    }
                                    if ((i2 & 65536) == 65536) {
                                        this.annotation_ = Collections.unmodifiableList(this.annotation_);
                                    }
                                    if ((i2 & 1024) == 1024) {
                                        this.contextParameter_ = Collections.unmodifiableList(this.contextParameter_);
                                    }
                                    if ((i2 & 8192) == 8192) {
                                        this.versionRequirement_ = Collections.unmodifiableList(this.versionRequirement_);
                                    }
                                    if ((i2 & i) == i) {
                                        this.compilerPluginData_ = Collections.unmodifiableList(this.compilerPluginData_);
                                    }
                                    if ((i2 & i4) == i4) {
                                        this.extensionReceiverAnnotation_ = Collections.unmodifiableList(this.extensionReceiverAnnotation_);
                                    }
                                    codedOutputStreamM91226K.m91258J();
                                    makeExtensionsImmutable();
                                    throw th;
                                }
                            } catch (InvalidProtocolBufferException e5) {
                                e = e5;
                            } catch (IOException e6) {
                                e = e6;
                            } catch (Throwable th3) {
                                th = th3;
                            }
                            break;
                        default:
                            if (!parseUnknownField(codedInputStream, codedOutputStreamM91226K, extensionRegistryLite, iM91185K)) {
                                z2 = z3;
                            }
                            z = z3;
                            break;
                    }
                } catch (InvalidProtocolBufferException e7) {
                    e = e7;
                } catch (IOException e8) {
                    e = e8;
                } catch (Throwable th4) {
                    th = th4;
                    i = 32768;
                    i4 = 131072;
                }
            }
        }

        public static Function getDefaultInstance() {
            return defaultInstance;
        }

        private void initFields() {
            this.flags_ = 6;
            this.oldFlags_ = 6;
            this.name_ = 0;
            this.returnType_ = Type.getDefaultInstance();
            this.returnTypeId_ = 0;
            List list = Collections.EMPTY_LIST;
            this.typeParameter_ = list;
            this.receiverType_ = Type.getDefaultInstance();
            this.receiverTypeId_ = 0;
            this.contextReceiverType_ = list;
            this.contextReceiverTypeId_ = list;
            this.contextParameter_ = list;
            this.valueParameter_ = list;
            this.typeTable_ = TypeTable.getDefaultInstance();
            this.versionRequirement_ = list;
            this.contract_ = Contract.getDefaultInstance();
            this.compilerPluginData_ = list;
            this.annotation_ = list;
            this.extensionReceiverAnnotation_ = list;
        }

        public static Builder newBuilder(Function function) {
            return newBuilder().mo90458f(function);
        }

        public static Function parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return PARSER.mo91135b(inputStream, extensionRegistryLite);
        }

        public Annotation getAnnotation(int i) {
            return this.annotation_.get(i);
        }

        public int getAnnotationCount() {
            return this.annotation_.size();
        }

        public List<Annotation> getAnnotationList() {
            return this.annotation_;
        }

        public CompilerPluginData getCompilerPluginData(int i) {
            return this.compilerPluginData_.get(i);
        }

        public int getCompilerPluginDataCount() {
            return this.compilerPluginData_.size();
        }

        public ValueParameter getContextParameter(int i) {
            return this.contextParameter_.get(i);
        }

        public int getContextParameterCount() {
            return this.contextParameter_.size();
        }

        public List<ValueParameter> getContextParameterList() {
            return this.contextParameter_;
        }

        public Type getContextReceiverType(int i) {
            return this.contextReceiverType_.get(i);
        }

        public int getContextReceiverTypeCount() {
            return this.contextReceiverType_.size();
        }

        public List<Integer> getContextReceiverTypeIdList() {
            return this.contextReceiverTypeId_;
        }

        public List<Type> getContextReceiverTypeList() {
            return this.contextReceiverType_;
        }

        public Contract getContract() {
            return this.contract_;
        }

        public Annotation getExtensionReceiverAnnotation(int i) {
            return this.extensionReceiverAnnotation_.get(i);
        }

        public int getExtensionReceiverAnnotationCount() {
            return this.extensionReceiverAnnotation_.size();
        }

        public List<Annotation> getExtensionReceiverAnnotationList() {
            return this.extensionReceiverAnnotation_;
        }

        public int getFlags() {
            return this.flags_;
        }

        public int getName() {
            return this.name_;
        }

        public int getOldFlags() {
            return this.oldFlags_;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public Parser<Function> getParserForType() {
            return PARSER;
        }

        public Type getReceiverType() {
            return this.receiverType_;
        }

        public int getReceiverTypeId() {
            return this.receiverTypeId_;
        }

        public Type getReturnType() {
            return this.returnType_;
        }

        public int getReturnTypeId() {
            return this.returnTypeId_;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableMessage, kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int iM91243p = (this.bitField0_ & 2) == 2 ? CodedOutputStream.m91243p(1, this.oldFlags_) : 0;
            if ((this.bitField0_ & 4) == 4) {
                iM91243p += CodedOutputStream.m91243p(2, this.name_);
            }
            if ((this.bitField0_ & 8) == 8) {
                iM91243p += CodedOutputStream.m91247t(3, this.returnType_);
            }
            for (int i2 = 0; i2 < this.typeParameter_.size(); i2++) {
                iM91243p += CodedOutputStream.m91247t(4, this.typeParameter_.get(i2));
            }
            if ((this.bitField0_ & 32) == 32) {
                iM91243p += CodedOutputStream.m91247t(5, this.receiverType_);
            }
            for (int i3 = 0; i3 < this.valueParameter_.size(); i3++) {
                iM91243p += CodedOutputStream.m91247t(6, this.valueParameter_.get(i3));
            }
            if ((this.bitField0_ & 16) == 16) {
                iM91243p += CodedOutputStream.m91243p(7, this.returnTypeId_);
            }
            if ((this.bitField0_ & 64) == 64) {
                iM91243p += CodedOutputStream.m91243p(8, this.receiverTypeId_);
            }
            if ((this.bitField0_ & 1) == 1) {
                iM91243p += CodedOutputStream.m91243p(9, this.flags_);
            }
            for (int i4 = 0; i4 < this.contextReceiverType_.size(); i4++) {
                iM91243p += CodedOutputStream.m91247t(10, this.contextReceiverType_.get(i4));
            }
            int iM91244q = 0;
            for (int i5 = 0; i5 < this.contextReceiverTypeId_.size(); i5++) {
                iM91244q += CodedOutputStream.m91244q(this.contextReceiverTypeId_.get(i5).intValue());
            }
            int iM91247t = iM91243p + iM91244q;
            if (!getContextReceiverTypeIdList().isEmpty()) {
                iM91247t = iM91247t + 1 + CodedOutputStream.m91244q(iM91244q);
            }
            this.contextReceiverTypeIdMemoizedSerializedSize = iM91244q;
            for (int i6 = 0; i6 < this.annotation_.size(); i6++) {
                iM91247t += CodedOutputStream.m91247t(12, this.annotation_.get(i6));
            }
            for (int i7 = 0; i7 < this.contextParameter_.size(); i7++) {
                iM91247t += CodedOutputStream.m91247t(13, this.contextParameter_.get(i7));
            }
            if ((this.bitField0_ & 128) == 128) {
                iM91247t += CodedOutputStream.m91247t(30, this.typeTable_);
            }
            int iM91244q2 = 0;
            for (int i8 = 0; i8 < this.versionRequirement_.size(); i8++) {
                iM91244q2 += CodedOutputStream.m91244q(this.versionRequirement_.get(i8).intValue());
            }
            int size = iM91247t + iM91244q2 + (getVersionRequirementList().size() * 2);
            if ((this.bitField0_ & 256) == 256) {
                size += CodedOutputStream.m91247t(32, this.contract_);
            }
            for (int i9 = 0; i9 < this.compilerPluginData_.size(); i9++) {
                size += CodedOutputStream.m91247t(33, this.compilerPluginData_.get(i9));
            }
            for (int i10 = 0; i10 < this.extensionReceiverAnnotation_.size(); i10++) {
                size += CodedOutputStream.m91247t(34, this.extensionReceiverAnnotation_.get(i10));
            }
            int iExtensionsSerializedSize = size + extensionsSerializedSize() + this.unknownFields.size();
            this.memoizedSerializedSize = iExtensionsSerializedSize;
            return iExtensionsSerializedSize;
        }

        public TypeParameter getTypeParameter(int i) {
            return this.typeParameter_.get(i);
        }

        public int getTypeParameterCount() {
            return this.typeParameter_.size();
        }

        public List<TypeParameter> getTypeParameterList() {
            return this.typeParameter_;
        }

        public TypeTable getTypeTable() {
            return this.typeTable_;
        }

        public ValueParameter getValueParameter(int i) {
            return this.valueParameter_.get(i);
        }

        public int getValueParameterCount() {
            return this.valueParameter_.size();
        }

        public List<ValueParameter> getValueParameterList() {
            return this.valueParameter_;
        }

        public List<Integer> getVersionRequirementList() {
            return this.versionRequirement_;
        }

        public boolean hasContract() {
            return (this.bitField0_ & 256) == 256;
        }

        public boolean hasFlags() {
            return (this.bitField0_ & 1) == 1;
        }

        public boolean hasName() {
            return (this.bitField0_ & 4) == 4;
        }

        public boolean hasOldFlags() {
            return (this.bitField0_ & 2) == 2;
        }

        public boolean hasReceiverType() {
            return (this.bitField0_ & 32) == 32;
        }

        public boolean hasReceiverTypeId() {
            return (this.bitField0_ & 64) == 64;
        }

        public boolean hasReturnType() {
            return (this.bitField0_ & 8) == 8;
        }

        public boolean hasReturnTypeId() {
            return (this.bitField0_ & 16) == 16;
        }

        public boolean hasTypeTable() {
            return (this.bitField0_ & 128) == 128;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableMessage, kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            byte b = this.memoizedIsInitialized;
            if (b == 1) {
                return true;
            }
            if (b == 0) {
                return false;
            }
            if (!hasName()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (hasReturnType() && !getReturnType().isInitialized()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            for (int i = 0; i < getTypeParameterCount(); i++) {
                if (!getTypeParameter(i).isInitialized()) {
                    this.memoizedIsInitialized = (byte) 0;
                    return false;
                }
            }
            if (hasReceiverType() && !getReceiverType().isInitialized()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            for (int i2 = 0; i2 < getContextReceiverTypeCount(); i2++) {
                if (!getContextReceiverType(i2).isInitialized()) {
                    this.memoizedIsInitialized = (byte) 0;
                    return false;
                }
            }
            for (int i3 = 0; i3 < getContextParameterCount(); i3++) {
                if (!getContextParameter(i3).isInitialized()) {
                    this.memoizedIsInitialized = (byte) 0;
                    return false;
                }
            }
            for (int i4 = 0; i4 < getValueParameterCount(); i4++) {
                if (!getValueParameter(i4).isInitialized()) {
                    this.memoizedIsInitialized = (byte) 0;
                    return false;
                }
            }
            if (hasTypeTable() && !getTypeTable().isInitialized()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (hasContract() && !getContract().isInitialized()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            for (int i5 = 0; i5 < getCompilerPluginDataCount(); i5++) {
                if (!getCompilerPluginData(i5).isInitialized()) {
                    this.memoizedIsInitialized = (byte) 0;
                    return false;
                }
            }
            for (int i6 = 0; i6 < getAnnotationCount(); i6++) {
                if (!getAnnotation(i6).isInitialized()) {
                    this.memoizedIsInitialized = (byte) 0;
                    return false;
                }
            }
            for (int i7 = 0; i7 < getExtensionReceiverAnnotationCount(); i7++) {
                if (!getExtensionReceiverAnnotation(i7).isInitialized()) {
                    this.memoizedIsInitialized = (byte) 0;
                    return false;
                }
            }
            if (extensionsAreInitialized()) {
                this.memoizedIsInitialized = (byte) 1;
                return true;
            }
            this.memoizedIsInitialized = (byte) 0;
            return false;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableMessage, kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            getSerializedSize();
            GeneratedMessageLite.ExtendableMessage<MessageType>.ExtensionWriter extensionWriterNewExtensionWriter = newExtensionWriter();
            if ((this.bitField0_ & 2) == 2) {
                codedOutputStream.m91277e0(1, this.oldFlags_);
            }
            if ((this.bitField0_ & 4) == 4) {
                codedOutputStream.m91277e0(2, this.name_);
            }
            if ((this.bitField0_ & 8) == 8) {
                codedOutputStream.m91280h0(3, this.returnType_);
            }
            for (int i = 0; i < this.typeParameter_.size(); i++) {
                codedOutputStream.m91280h0(4, this.typeParameter_.get(i));
            }
            if ((this.bitField0_ & 32) == 32) {
                codedOutputStream.m91280h0(5, this.receiverType_);
            }
            for (int i2 = 0; i2 < this.valueParameter_.size(); i2++) {
                codedOutputStream.m91280h0(6, this.valueParameter_.get(i2));
            }
            if ((this.bitField0_ & 16) == 16) {
                codedOutputStream.m91277e0(7, this.returnTypeId_);
            }
            if ((this.bitField0_ & 64) == 64) {
                codedOutputStream.m91277e0(8, this.receiverTypeId_);
            }
            if ((this.bitField0_ & 1) == 1) {
                codedOutputStream.m91277e0(9, this.flags_);
            }
            for (int i3 = 0; i3 < this.contextReceiverType_.size(); i3++) {
                codedOutputStream.m91280h0(10, this.contextReceiverType_.get(i3));
            }
            if (getContextReceiverTypeIdList().size() > 0) {
                codedOutputStream.m91291s0(90);
                codedOutputStream.m91291s0(this.contextReceiverTypeIdMemoizedSerializedSize);
            }
            for (int i4 = 0; i4 < this.contextReceiverTypeId_.size(); i4++) {
                codedOutputStream.m91278f0(this.contextReceiverTypeId_.get(i4).intValue());
            }
            for (int i5 = 0; i5 < this.annotation_.size(); i5++) {
                codedOutputStream.m91280h0(12, this.annotation_.get(i5));
            }
            for (int i6 = 0; i6 < this.contextParameter_.size(); i6++) {
                codedOutputStream.m91280h0(13, this.contextParameter_.get(i6));
            }
            if ((this.bitField0_ & 128) == 128) {
                codedOutputStream.m91280h0(30, this.typeTable_);
            }
            for (int i7 = 0; i7 < this.versionRequirement_.size(); i7++) {
                codedOutputStream.m91277e0(31, this.versionRequirement_.get(i7).intValue());
            }
            if ((this.bitField0_ & 256) == 256) {
                codedOutputStream.m91280h0(32, this.contract_);
            }
            for (int i8 = 0; i8 < this.compilerPluginData_.size(); i8++) {
                codedOutputStream.m91280h0(33, this.compilerPluginData_.get(i8));
            }
            for (int i9 = 0; i9 < this.extensionReceiverAnnotation_.size(); i9++) {
                codedOutputStream.m91280h0(34, this.extensionReceiverAnnotation_.get(i9));
            }
            extensionWriterNewExtensionWriter.m91338a(19000, codedOutputStream);
            codedOutputStream.m91285m0(this.unknownFields);
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableMessage, kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite
        public Function getDefaultInstanceForType() {
            return defaultInstance;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableMessage, kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public Builder newBuilderForType() {
            return newBuilder();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableMessage, kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public Builder toBuilder() {
            return newBuilder(this);
        }

        public static Builder newBuilder() {
            return Builder.m90620t();
        }

        private Function(GeneratedMessageLite.ExtendableBuilder<Function, ?> extendableBuilder) {
            super(extendableBuilder);
            this.contextReceiverTypeIdMemoizedSerializedSize = -1;
            this.memoizedIsInitialized = (byte) -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = extendableBuilder.m91332e();
        }

        private Function(boolean z) {
            this.contextReceiverTypeIdMemoizedSerializedSize = -1;
            this.memoizedIsInitialized = (byte) -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = ByteString.f65615a;
        }
    }

    public static final class Package extends GeneratedMessageLite.ExtendableMessage<Package> implements PackageOrBuilder {
        public static Parser<Package> PARSER = new C15254a();
        private static final Package defaultInstance;
        private int bitField0_;
        private List<Function> function_;
        private byte memoizedIsInitialized;
        private int memoizedSerializedSize;
        private List<Property> property_;
        private List<TypeAlias> typeAlias_;
        private TypeTable typeTable_;
        private final ByteString unknownFields;
        private VersionRequirementTable versionRequirementTable_;

        public static final class Builder extends GeneratedMessageLite.ExtendableBuilder<Package, Builder> implements PackageOrBuilder {

            /* JADX INFO: renamed from: d */
            public int f65220d;

            /* JADX INFO: renamed from: e */
            public List<Function> f65221e;

            /* JADX INFO: renamed from: f */
            public List<Property> f65222f;

            /* JADX INFO: renamed from: g */
            public List<TypeAlias> f65223g;

            /* JADX INFO: renamed from: h */
            public TypeTable f65224h;

            /* JADX INFO: renamed from: i */
            public VersionRequirementTable f65225i;

            private Builder() {
                List list = Collections.EMPTY_LIST;
                this.f65221e = list;
                this.f65222f = list;
                this.f65223g = list;
                this.f65224h = TypeTable.getDefaultInstance();
                this.f65225i = VersionRequirementTable.getDefaultInstance();
                m90649x();
            }

            /* JADX INFO: renamed from: t */
            public static Builder m90645t() {
                return new Builder();
            }

            /* JADX INFO: renamed from: u */
            private void m90646u() {
                if ((this.f65220d & 1) != 1) {
                    this.f65221e = new ArrayList(this.f65221e);
                    this.f65220d |= 1;
                }
            }

            /* JADX INFO: renamed from: v */
            private void m90647v() {
                if ((this.f65220d & 2) != 2) {
                    this.f65222f = new ArrayList(this.f65222f);
                    this.f65220d |= 2;
                }
            }

            /* JADX INFO: renamed from: w */
            private void m90648w() {
                if ((this.f65220d & 4) != 4) {
                    this.f65223g = new ArrayList(this.f65223g);
                    this.f65220d |= 4;
                }
            }

            /* JADX INFO: renamed from: x */
            private void m90649x() {
            }

            /* JADX INFO: renamed from: A */
            public Builder m90650A(TypeTable typeTable) {
                if ((this.f65220d & 8) != 8 || this.f65224h == TypeTable.getDefaultInstance()) {
                    this.f65224h = typeTable;
                } else {
                    this.f65224h = TypeTable.newBuilder(this.f65224h).mo90458f(typeTable).m90810m();
                }
                this.f65220d |= 8;
                return this;
            }

            /* JADX INFO: renamed from: B */
            public Builder m90651B(VersionRequirementTable versionRequirementTable) {
                if ((this.f65220d & 16) != 16 || this.f65225i == VersionRequirementTable.getDefaultInstance()) {
                    this.f65225i = versionRequirementTable;
                } else {
                    this.f65225i = VersionRequirementTable.newBuilder(this.f65225i).mo90458f(versionRequirementTable).m90855m();
                }
                this.f65220d |= 16;
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
            public Package build() {
                Package packageM90653r = m90653r();
                if (packageM90653r.isInitialized()) {
                    return packageM90653r;
                }
                throw AbstractMessageLite.Builder.m91133c(packageM90653r);
            }

            /* JADX INFO: renamed from: r */
            public Package m90653r() {
                Package r0 = new Package(this);
                int i = this.f65220d;
                if ((i & 1) == 1) {
                    this.f65221e = Collections.unmodifiableList(this.f65221e);
                    this.f65220d &= -2;
                }
                r0.function_ = this.f65221e;
                if ((this.f65220d & 2) == 2) {
                    this.f65222f = Collections.unmodifiableList(this.f65222f);
                    this.f65220d &= -3;
                }
                r0.property_ = this.f65222f;
                if ((this.f65220d & 4) == 4) {
                    this.f65223g = Collections.unmodifiableList(this.f65223g);
                    this.f65220d &= -5;
                }
                r0.typeAlias_ = this.f65223g;
                int i2 = (i & 8) != 8 ? 0 : 1;
                r0.typeTable_ = this.f65224h;
                if ((i & 16) == 16) {
                    i2 |= 2;
                }
                r0.versionRequirementTable_ = this.f65225i;
                r0.bitField0_ = i2;
                return r0;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableBuilder
            /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
            public Builder mo90523m() {
                return m90645t().mo90458f(m90653r());
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder
            /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
            public Builder mo90458f(Package r3) {
                if (r3 == Package.getDefaultInstance()) {
                    return this;
                }
                if (!r3.function_.isEmpty()) {
                    if (this.f65221e.isEmpty()) {
                        this.f65221e = r3.function_;
                        this.f65220d &= -2;
                    } else {
                        m90646u();
                        this.f65221e.addAll(r3.function_);
                    }
                }
                if (!r3.property_.isEmpty()) {
                    if (this.f65222f.isEmpty()) {
                        this.f65222f = r3.property_;
                        this.f65220d &= -3;
                    } else {
                        m90647v();
                        this.f65222f.addAll(r3.property_);
                    }
                }
                if (!r3.typeAlias_.isEmpty()) {
                    if (this.f65223g.isEmpty()) {
                        this.f65223g = r3.typeAlias_;
                        this.f65220d &= -5;
                    } else {
                        m90648w();
                        this.f65223g.addAll(r3.typeAlias_);
                    }
                }
                if (r3.hasTypeTable()) {
                    m90650A(r3.getTypeTable());
                }
                if (r3.hasVersionRequirementTable()) {
                    m90651B(r3.getVersionRequirementTable());
                }
                m91337o(r3);
                m91333j(m91332e().m91156c(r3.unknownFields));
                return this;
            }

            /* JADX WARN: Code duplicated, block: B:15:0x001d  */
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
            public Builder mo90459i(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws Throwable {
                Package r0 = null;
                try {
                    try {
                        Package packageMo90487d = Package.PARSER.mo90487d(codedInputStream, extensionRegistryLite);
                        if (packageMo90487d != null) {
                            mo90458f(packageMo90487d);
                        }
                        return this;
                    } catch (InvalidProtocolBufferException e) {
                        Package r4 = (Package) e.getUnfinishedMessage();
                        try {
                            throw e;
                        } catch (Throwable th) {
                            th = th;
                            r0 = r4;
                            if (r0 != null) {
                                mo90458f(r0);
                            }
                            throw th;
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                    if (r0 != null) {
                        mo90458f(r0);
                    }
                    throw th;
                }
            }
        }

        /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Package$a */
        public static class C15254a extends AbstractParser<Package> {
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.Parser
            /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
            public Package mo90487d(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return new Package(codedInputStream, extensionRegistryLite);
            }
        }

        static {
            Package r0 = new Package(true);
            defaultInstance = r0;
            r0.initFields();
        }

        private Package(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
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
                            if (iM91185K == 26) {
                                int i2 = (i == true ? 1 : 0) & 1;
                                i = i;
                                if (i2 != 1) {
                                    this.function_ = new ArrayList();
                                    i = (i == true ? 1 : 0) | 1;
                                }
                                this.function_.add((Function) codedInputStream.m91211u(Function.PARSER, extensionRegistryLite));
                            } else if (iM91185K == 34) {
                                int i3 = (i == true ? 1 : 0) & 2;
                                i = i;
                                if (i3 != 2) {
                                    this.property_ = new ArrayList();
                                    i = (i == true ? 1 : 0) | 2;
                                }
                                this.property_.add((Property) codedInputStream.m91211u(Property.PARSER, extensionRegistryLite));
                            } else if (iM91185K != 42) {
                                if (iM91185K == 242) {
                                    TypeTable.Builder builder = (this.bitField0_ & 1) == 1 ? this.typeTable_.toBuilder() : null;
                                    TypeTable typeTable = (TypeTable) codedInputStream.m91211u(TypeTable.PARSER, extensionRegistryLite);
                                    this.typeTable_ = typeTable;
                                    if (builder != null) {
                                        builder.mo90458f(typeTable);
                                        this.typeTable_ = builder.m90810m();
                                    }
                                    this.bitField0_ |= 1;
                                } else if (iM91185K == 258) {
                                    VersionRequirementTable.Builder builder2 = (this.bitField0_ & 2) == 2 ? this.versionRequirementTable_.toBuilder() : null;
                                    VersionRequirementTable versionRequirementTable = (VersionRequirementTable) codedInputStream.m91211u(VersionRequirementTable.PARSER, extensionRegistryLite);
                                    this.versionRequirementTable_ = versionRequirementTable;
                                    if (builder2 != null) {
                                        builder2.mo90458f(versionRequirementTable);
                                        this.versionRequirementTable_ = builder2.m90855m();
                                    }
                                    this.bitField0_ |= 2;
                                } else if (!parseUnknownField(codedInputStream, codedOutputStreamM91226K, extensionRegistryLite, iM91185K)) {
                                }
                            } else {
                                int i4 = (i == true ? 1 : 0) & 4;
                                i = i;
                                if (i4 != 4) {
                                    this.typeAlias_ = new ArrayList();
                                    i = (i == true ? 1 : 0) | 4;
                                }
                                this.typeAlias_.add((TypeAlias) codedInputStream.m91211u(TypeAlias.PARSER, extensionRegistryLite));
                            }
                        }
                        z = true;
                    } catch (Throwable th) {
                        if (((i == true ? 1 : 0) & 1) == 1) {
                            this.function_ = Collections.unmodifiableList(this.function_);
                        }
                        if (((i == true ? 1 : 0) & 2) == 2) {
                            this.property_ = Collections.unmodifiableList(this.property_);
                        }
                        if (((i == true ? 1 : 0) & 4) == 4) {
                            this.typeAlias_ = Collections.unmodifiableList(this.typeAlias_);
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
            if (((i == true ? 1 : 0) & 1) == 1) {
                this.function_ = Collections.unmodifiableList(this.function_);
            }
            if (((i == true ? 1 : 0) & 2) == 2) {
                this.property_ = Collections.unmodifiableList(this.property_);
            }
            if (((i == true ? 1 : 0) & 4) == 4) {
                this.typeAlias_ = Collections.unmodifiableList(this.typeAlias_);
            }
            try {
                codedOutputStreamM91226K.m91258J();
            } catch (IOException unused2) {
            } finally {
                this.unknownFields = outputM91150w.m91170m();
            }
            makeExtensionsImmutable();
        }

        public static Package getDefaultInstance() {
            return defaultInstance;
        }

        private void initFields() {
            List list = Collections.EMPTY_LIST;
            this.function_ = list;
            this.property_ = list;
            this.typeAlias_ = list;
            this.typeTable_ = TypeTable.getDefaultInstance();
            this.versionRequirementTable_ = VersionRequirementTable.getDefaultInstance();
        }

        public static Builder newBuilder(Package r1) {
            return newBuilder().mo90458f(r1);
        }

        public static Package parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return PARSER.mo91135b(inputStream, extensionRegistryLite);
        }

        public Function getFunction(int i) {
            return this.function_.get(i);
        }

        public int getFunctionCount() {
            return this.function_.size();
        }

        public List<Function> getFunctionList() {
            return this.function_;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public Parser<Package> getParserForType() {
            return PARSER;
        }

        public Property getProperty(int i) {
            return this.property_.get(i);
        }

        public int getPropertyCount() {
            return this.property_.size();
        }

        public List<Property> getPropertyList() {
            return this.property_;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableMessage, kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int iM91247t = 0;
            for (int i2 = 0; i2 < this.function_.size(); i2++) {
                iM91247t += CodedOutputStream.m91247t(3, this.function_.get(i2));
            }
            for (int i3 = 0; i3 < this.property_.size(); i3++) {
                iM91247t += CodedOutputStream.m91247t(4, this.property_.get(i3));
            }
            for (int i4 = 0; i4 < this.typeAlias_.size(); i4++) {
                iM91247t += CodedOutputStream.m91247t(5, this.typeAlias_.get(i4));
            }
            if ((this.bitField0_ & 1) == 1) {
                iM91247t += CodedOutputStream.m91247t(30, this.typeTable_);
            }
            if ((this.bitField0_ & 2) == 2) {
                iM91247t += CodedOutputStream.m91247t(32, this.versionRequirementTable_);
            }
            int iExtensionsSerializedSize = iM91247t + extensionsSerializedSize() + this.unknownFields.size();
            this.memoizedSerializedSize = iExtensionsSerializedSize;
            return iExtensionsSerializedSize;
        }

        public TypeAlias getTypeAlias(int i) {
            return this.typeAlias_.get(i);
        }

        public int getTypeAliasCount() {
            return this.typeAlias_.size();
        }

        public List<TypeAlias> getTypeAliasList() {
            return this.typeAlias_;
        }

        public TypeTable getTypeTable() {
            return this.typeTable_;
        }

        public VersionRequirementTable getVersionRequirementTable() {
            return this.versionRequirementTable_;
        }

        public boolean hasTypeTable() {
            return (this.bitField0_ & 1) == 1;
        }

        public boolean hasVersionRequirementTable() {
            return (this.bitField0_ & 2) == 2;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableMessage, kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            byte b = this.memoizedIsInitialized;
            if (b == 1) {
                return true;
            }
            if (b == 0) {
                return false;
            }
            for (int i = 0; i < getFunctionCount(); i++) {
                if (!getFunction(i).isInitialized()) {
                    this.memoizedIsInitialized = (byte) 0;
                    return false;
                }
            }
            for (int i2 = 0; i2 < getPropertyCount(); i2++) {
                if (!getProperty(i2).isInitialized()) {
                    this.memoizedIsInitialized = (byte) 0;
                    return false;
                }
            }
            for (int i3 = 0; i3 < getTypeAliasCount(); i3++) {
                if (!getTypeAlias(i3).isInitialized()) {
                    this.memoizedIsInitialized = (byte) 0;
                    return false;
                }
            }
            if (hasTypeTable() && !getTypeTable().isInitialized()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (extensionsAreInitialized()) {
                this.memoizedIsInitialized = (byte) 1;
                return true;
            }
            this.memoizedIsInitialized = (byte) 0;
            return false;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableMessage, kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            getSerializedSize();
            GeneratedMessageLite.ExtendableMessage<MessageType>.ExtensionWriter extensionWriterNewExtensionWriter = newExtensionWriter();
            for (int i = 0; i < this.function_.size(); i++) {
                codedOutputStream.m91280h0(3, this.function_.get(i));
            }
            for (int i2 = 0; i2 < this.property_.size(); i2++) {
                codedOutputStream.m91280h0(4, this.property_.get(i2));
            }
            for (int i3 = 0; i3 < this.typeAlias_.size(); i3++) {
                codedOutputStream.m91280h0(5, this.typeAlias_.get(i3));
            }
            if ((this.bitField0_ & 1) == 1) {
                codedOutputStream.m91280h0(30, this.typeTable_);
            }
            if ((this.bitField0_ & 2) == 2) {
                codedOutputStream.m91280h0(32, this.versionRequirementTable_);
            }
            extensionWriterNewExtensionWriter.m91338a(200, codedOutputStream);
            codedOutputStream.m91285m0(this.unknownFields);
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableMessage, kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite
        public Package getDefaultInstanceForType() {
            return defaultInstance;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableMessage, kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public Builder newBuilderForType() {
            return newBuilder();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableMessage, kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public Builder toBuilder() {
            return newBuilder(this);
        }

        public static Builder newBuilder() {
            return Builder.m90645t();
        }

        private Package(GeneratedMessageLite.ExtendableBuilder<Package, ?> extendableBuilder) {
            super(extendableBuilder);
            this.memoizedIsInitialized = (byte) -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = extendableBuilder.m91332e();
        }

        private Package(boolean z) {
            this.memoizedIsInitialized = (byte) -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = ByteString.f65615a;
        }
    }

    public static final class PackageFragment extends GeneratedMessageLite.ExtendableMessage<PackageFragment> implements PackageFragmentOrBuilder {
        public static Parser<PackageFragment> PARSER = new C15255a();
        private static final PackageFragment defaultInstance;
        private int bitField0_;
        private List<Class> class__;
        private byte memoizedIsInitialized;
        private int memoizedSerializedSize;
        private Package package_;
        private QualifiedNameTable qualifiedNames_;
        private StringTable strings_;
        private final ByteString unknownFields;

        public static final class Builder extends GeneratedMessageLite.ExtendableBuilder<PackageFragment, Builder> implements PackageFragmentOrBuilder {

            /* JADX INFO: renamed from: d */
            public int f65226d;

            /* JADX INFO: renamed from: e */
            public StringTable f65227e = StringTable.getDefaultInstance();

            /* JADX INFO: renamed from: f */
            public QualifiedNameTable f65228f = QualifiedNameTable.getDefaultInstance();

            /* JADX INFO: renamed from: g */
            public Package f65229g = Package.getDefaultInstance();

            /* JADX INFO: renamed from: h */
            public List<Class> f65230h = Collections.EMPTY_LIST;

            private Builder() {
                m90660v();
            }

            /* JADX INFO: renamed from: t */
            public static Builder m90659t() {
                return new Builder();
            }

            /* JADX INFO: renamed from: v */
            private void m90660v() {
            }

            /* JADX INFO: renamed from: A */
            public Builder m90661A(StringTable stringTable) {
                if ((this.f65226d & 1) != 1 || this.f65227e == StringTable.getDefaultInstance()) {
                    this.f65227e = stringTable;
                } else {
                    this.f65227e = StringTable.newBuilder(this.f65227e).mo90458f(stringTable).m90729m();
                }
                this.f65226d |= 1;
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
            public PackageFragment build() {
                PackageFragment packageFragmentM90663r = m90663r();
                if (packageFragmentM90663r.isInitialized()) {
                    return packageFragmentM90663r;
                }
                throw AbstractMessageLite.Builder.m91133c(packageFragmentM90663r);
            }

            /* JADX INFO: renamed from: r */
            public PackageFragment m90663r() {
                PackageFragment packageFragment = new PackageFragment(this);
                int i = this.f65226d;
                int i2 = (i & 1) != 1 ? 0 : 1;
                packageFragment.strings_ = this.f65227e;
                if ((i & 2) == 2) {
                    i2 |= 2;
                }
                packageFragment.qualifiedNames_ = this.f65228f;
                if ((i & 4) == 4) {
                    i2 |= 4;
                }
                packageFragment.package_ = this.f65229g;
                if ((this.f65226d & 8) == 8) {
                    this.f65230h = Collections.unmodifiableList(this.f65230h);
                    this.f65226d &= -9;
                }
                packageFragment.class__ = this.f65230h;
                packageFragment.bitField0_ = i2;
                return packageFragment;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableBuilder
            /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
            public Builder mo90523m() {
                return m90659t().mo90458f(m90663r());
            }

            /* JADX INFO: renamed from: u */
            public final void m90665u() {
                if ((this.f65226d & 8) != 8) {
                    this.f65230h = new ArrayList(this.f65230h);
                    this.f65226d |= 8;
                }
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder
            /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
            public Builder mo90458f(PackageFragment packageFragment) {
                if (packageFragment == PackageFragment.getDefaultInstance()) {
                    return this;
                }
                if (packageFragment.hasStrings()) {
                    m90661A(packageFragment.getStrings());
                }
                if (packageFragment.hasQualifiedNames()) {
                    m90669z(packageFragment.getQualifiedNames());
                }
                if (packageFragment.hasPackage()) {
                    m90668y(packageFragment.getPackage());
                }
                if (!packageFragment.class__.isEmpty()) {
                    if (this.f65230h.isEmpty()) {
                        this.f65230h = packageFragment.class__;
                        this.f65226d &= -9;
                    } else {
                        m90665u();
                        this.f65230h.addAll(packageFragment.class__);
                    }
                }
                m91337o(packageFragment);
                m91333j(m91332e().m91156c(packageFragment.unknownFields));
                return this;
            }

            /* JADX WARN: Code duplicated, block: B:15:0x001d  */
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            /* JADX INFO: renamed from: x, reason: merged with bridge method [inline-methods] */
            public Builder mo90459i(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws Throwable {
                PackageFragment packageFragment = null;
                try {
                    try {
                        PackageFragment packageFragmentMo90487d = PackageFragment.PARSER.mo90487d(codedInputStream, extensionRegistryLite);
                        if (packageFragmentMo90487d != null) {
                            mo90458f(packageFragmentMo90487d);
                        }
                        return this;
                    } catch (InvalidProtocolBufferException e) {
                        PackageFragment packageFragment2 = (PackageFragment) e.getUnfinishedMessage();
                        try {
                            throw e;
                        } catch (Throwable th) {
                            th = th;
                            packageFragment = packageFragment2;
                            if (packageFragment != null) {
                                mo90458f(packageFragment);
                            }
                            throw th;
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                    if (packageFragment != null) {
                        mo90458f(packageFragment);
                    }
                    throw th;
                }
            }

            /* JADX INFO: renamed from: y */
            public Builder m90668y(Package r4) {
                if ((this.f65226d & 4) != 4 || this.f65229g == Package.getDefaultInstance()) {
                    this.f65229g = r4;
                } else {
                    this.f65229g = Package.newBuilder(this.f65229g).mo90458f(r4).m90653r();
                }
                this.f65226d |= 4;
                return this;
            }

            /* JADX INFO: renamed from: z */
            public Builder m90669z(QualifiedNameTable qualifiedNameTable) {
                if ((this.f65226d & 2) != 2 || this.f65228f == QualifiedNameTable.getDefaultInstance()) {
                    this.f65228f = qualifiedNameTable;
                } else {
                    this.f65228f = QualifiedNameTable.newBuilder(this.f65228f).mo90458f(qualifiedNameTable).m90706m();
                }
                this.f65226d |= 2;
                return this;
            }
        }

        /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$PackageFragment$a */
        public static class C15255a extends AbstractParser<PackageFragment> {
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.Parser
            /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
            public PackageFragment mo90487d(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return new PackageFragment(codedInputStream, extensionRegistryLite);
            }
        }

        static {
            PackageFragment packageFragment = new PackageFragment(true);
            defaultInstance = packageFragment;
            packageFragment.initFields();
        }

        private PackageFragment(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            this.memoizedIsInitialized = (byte) -1;
            this.memoizedSerializedSize = -1;
            initFields();
            ByteString.Output outputM91150w = ByteString.m91150w();
            CodedOutputStream codedOutputStreamM91226K = CodedOutputStream.m91226K(outputM91150w, 1);
            boolean z = false;
            char c = 0;
            while (!z) {
                try {
                    try {
                        int iM91185K = codedInputStream.m91185K();
                        if (iM91185K != 0) {
                            if (iM91185K == 10) {
                                StringTable.Builder builder = (this.bitField0_ & 1) == 1 ? this.strings_.toBuilder() : null;
                                StringTable stringTable = (StringTable) codedInputStream.m91211u(StringTable.PARSER, extensionRegistryLite);
                                this.strings_ = stringTable;
                                if (builder != null) {
                                    builder.mo90458f(stringTable);
                                    this.strings_ = builder.m90729m();
                                }
                                this.bitField0_ |= 1;
                            } else if (iM91185K == 18) {
                                QualifiedNameTable.Builder builder2 = (this.bitField0_ & 2) == 2 ? this.qualifiedNames_.toBuilder() : null;
                                QualifiedNameTable qualifiedNameTable = (QualifiedNameTable) codedInputStream.m91211u(QualifiedNameTable.PARSER, extensionRegistryLite);
                                this.qualifiedNames_ = qualifiedNameTable;
                                if (builder2 != null) {
                                    builder2.mo90458f(qualifiedNameTable);
                                    this.qualifiedNames_ = builder2.m90706m();
                                }
                                this.bitField0_ |= 2;
                            } else if (iM91185K == 26) {
                                Package.Builder builder3 = (this.bitField0_ & 4) == 4 ? this.package_.toBuilder() : null;
                                Package r6 = (Package) codedInputStream.m91211u(Package.PARSER, extensionRegistryLite);
                                this.package_ = r6;
                                if (builder3 != null) {
                                    builder3.mo90458f(r6);
                                    this.package_ = builder3.m90653r();
                                }
                                this.bitField0_ |= 4;
                            } else if (iM91185K == 34) {
                                int i = (c == true ? 1 : 0) & '\b';
                                c = c;
                                if (i != 8) {
                                    this.class__ = new ArrayList();
                                    c = '\b';
                                }
                                this.class__.add((Class) codedInputStream.m91211u(Class.PARSER, extensionRegistryLite));
                            } else if (!parseUnknownField(codedInputStream, codedOutputStreamM91226K, extensionRegistryLite, iM91185K)) {
                            }
                        }
                        z = true;
                    } catch (Throwable th) {
                        if (((c == true ? 1 : 0) & '\b') == 8) {
                            this.class__ = Collections.unmodifiableList(this.class__);
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
            if (((c == true ? 1 : 0) & '\b') == 8) {
                this.class__ = Collections.unmodifiableList(this.class__);
            }
            try {
                codedOutputStreamM91226K.m91258J();
            } catch (IOException unused2) {
            } finally {
                this.unknownFields = outputM91150w.m91170m();
            }
            makeExtensionsImmutable();
        }

        public static PackageFragment getDefaultInstance() {
            return defaultInstance;
        }

        private void initFields() {
            this.strings_ = StringTable.getDefaultInstance();
            this.qualifiedNames_ = QualifiedNameTable.getDefaultInstance();
            this.package_ = Package.getDefaultInstance();
            this.class__ = Collections.EMPTY_LIST;
        }

        public static Builder newBuilder(PackageFragment packageFragment) {
            return newBuilder().mo90458f(packageFragment);
        }

        public static PackageFragment parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return PARSER.mo91135b(inputStream, extensionRegistryLite);
        }

        public Class getClass_(int i) {
            return this.class__.get(i);
        }

        public int getClass_Count() {
            return this.class__.size();
        }

        public List<Class> getClass_List() {
            return this.class__;
        }

        public Package getPackage() {
            return this.package_;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public Parser<PackageFragment> getParserForType() {
            return PARSER;
        }

        public QualifiedNameTable getQualifiedNames() {
            return this.qualifiedNames_;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableMessage, kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int iM91247t = (this.bitField0_ & 1) == 1 ? CodedOutputStream.m91247t(1, this.strings_) : 0;
            if ((this.bitField0_ & 2) == 2) {
                iM91247t += CodedOutputStream.m91247t(2, this.qualifiedNames_);
            }
            if ((this.bitField0_ & 4) == 4) {
                iM91247t += CodedOutputStream.m91247t(3, this.package_);
            }
            for (int i2 = 0; i2 < this.class__.size(); i2++) {
                iM91247t += CodedOutputStream.m91247t(4, this.class__.get(i2));
            }
            int iExtensionsSerializedSize = iM91247t + extensionsSerializedSize() + this.unknownFields.size();
            this.memoizedSerializedSize = iExtensionsSerializedSize;
            return iExtensionsSerializedSize;
        }

        public StringTable getStrings() {
            return this.strings_;
        }

        public boolean hasPackage() {
            return (this.bitField0_ & 4) == 4;
        }

        public boolean hasQualifiedNames() {
            return (this.bitField0_ & 2) == 2;
        }

        public boolean hasStrings() {
            return (this.bitField0_ & 1) == 1;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableMessage, kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            byte b = this.memoizedIsInitialized;
            if (b == 1) {
                return true;
            }
            if (b == 0) {
                return false;
            }
            if (hasQualifiedNames() && !getQualifiedNames().isInitialized()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (hasPackage() && !getPackage().isInitialized()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            for (int i = 0; i < getClass_Count(); i++) {
                if (!getClass_(i).isInitialized()) {
                    this.memoizedIsInitialized = (byte) 0;
                    return false;
                }
            }
            if (extensionsAreInitialized()) {
                this.memoizedIsInitialized = (byte) 1;
                return true;
            }
            this.memoizedIsInitialized = (byte) 0;
            return false;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableMessage, kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            getSerializedSize();
            GeneratedMessageLite.ExtendableMessage<MessageType>.ExtensionWriter extensionWriterNewExtensionWriter = newExtensionWriter();
            if ((this.bitField0_ & 1) == 1) {
                codedOutputStream.m91280h0(1, this.strings_);
            }
            if ((this.bitField0_ & 2) == 2) {
                codedOutputStream.m91280h0(2, this.qualifiedNames_);
            }
            if ((this.bitField0_ & 4) == 4) {
                codedOutputStream.m91280h0(3, this.package_);
            }
            for (int i = 0; i < this.class__.size(); i++) {
                codedOutputStream.m91280h0(4, this.class__.get(i));
            }
            extensionWriterNewExtensionWriter.m91338a(200, codedOutputStream);
            codedOutputStream.m91285m0(this.unknownFields);
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableMessage, kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite
        public PackageFragment getDefaultInstanceForType() {
            return defaultInstance;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableMessage, kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public Builder newBuilderForType() {
            return newBuilder();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableMessage, kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public Builder toBuilder() {
            return newBuilder(this);
        }

        public static Builder newBuilder() {
            return Builder.m90659t();
        }

        private PackageFragment(GeneratedMessageLite.ExtendableBuilder<PackageFragment, ?> extendableBuilder) {
            super(extendableBuilder);
            this.memoizedIsInitialized = (byte) -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = extendableBuilder.m91332e();
        }

        private PackageFragment(boolean z) {
            this.memoizedIsInitialized = (byte) -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = ByteString.f65615a;
        }
    }

    public static final class Property extends GeneratedMessageLite.ExtendableMessage<Property> implements PropertyOrBuilder {
        public static Parser<Property> PARSER = new C15256a();
        private static final Property defaultInstance;
        private List<Annotation> annotation_;
        private List<Annotation> backingFieldAnnotation_;
        private int bitField0_;
        private List<CompilerPluginData> compilerPluginData_;
        private List<ValueParameter> contextParameter_;
        private int contextReceiverTypeIdMemoizedSerializedSize;
        private List<Integer> contextReceiverTypeId_;
        private List<Type> contextReceiverType_;
        private List<Annotation> delegateFieldAnnotation_;
        private List<Annotation> extensionReceiverAnnotation_;
        private int flags_;
        private List<Annotation> getterAnnotation_;
        private int getterFlags_;
        private byte memoizedIsInitialized;
        private int memoizedSerializedSize;
        private int name_;
        private int oldFlags_;
        private int receiverTypeId_;
        private Type receiverType_;
        private int returnTypeId_;
        private Type returnType_;
        private List<Annotation> setterAnnotation_;
        private int setterFlags_;
        private ValueParameter setterValueParameter_;
        private List<TypeParameter> typeParameter_;
        private final ByteString unknownFields;
        private List<Integer> versionRequirement_;

        public static final class Builder extends GeneratedMessageLite.ExtendableBuilder<Property, Builder> implements PropertyOrBuilder {

            /* JADX INFO: renamed from: d */
            public int f65231d;

            /* JADX INFO: renamed from: g */
            public int f65234g;

            /* JADX INFO: renamed from: i */
            public int f65236i;

            /* JADX INFO: renamed from: j */
            public List<TypeParameter> f65237j;

            /* JADX INFO: renamed from: k */
            public Type f65238k;

            /* JADX INFO: renamed from: l */
            public int f65239l;

            /* JADX INFO: renamed from: m */
            public List<Type> f65240m;

            /* JADX INFO: renamed from: n */
            public List<Integer> f65241n;

            /* JADX INFO: renamed from: o */
            public List<ValueParameter> f65242o;

            /* JADX INFO: renamed from: p */
            public ValueParameter f65243p;

            /* JADX INFO: renamed from: q */
            public int f65244q;

            /* JADX INFO: renamed from: r */
            public int f65245r;

            /* JADX INFO: renamed from: s */
            public List<Integer> f65246s;

            /* JADX INFO: renamed from: t */
            public List<CompilerPluginData> f65247t;

            /* JADX INFO: renamed from: u */
            public List<Annotation> f65248u;

            /* JADX INFO: renamed from: v */
            public List<Annotation> f65249v;

            /* JADX INFO: renamed from: w */
            public List<Annotation> f65250w;

            /* JADX INFO: renamed from: x */
            public List<Annotation> f65251x;

            /* JADX INFO: renamed from: y */
            public List<Annotation> f65252y;

            /* JADX INFO: renamed from: z */
            public List<Annotation> f65253z;

            /* JADX INFO: renamed from: e */
            public int f65232e = 518;

            /* JADX INFO: renamed from: f */
            public int f65233f = 2054;

            /* JADX INFO: renamed from: h */
            public Type f65235h = Type.getDefaultInstance();

            private Builder() {
                List list = Collections.EMPTY_LIST;
                this.f65237j = list;
                this.f65238k = Type.getDefaultInstance();
                this.f65240m = list;
                this.f65241n = list;
                this.f65242o = list;
                this.f65243p = ValueParameter.getDefaultInstance();
                this.f65246s = list;
                this.f65247t = list;
                this.f65248u = list;
                this.f65249v = list;
                this.f65250w = list;
                this.f65251x = list;
                this.f65252y = list;
                this.f65253z = list;
                m90674K();
            }

            /* JADX INFO: renamed from: B */
            private void m90671B() {
                if ((this.f65231d & 524288) != 524288) {
                    this.f65251x = new ArrayList(this.f65251x);
                    this.f65231d |= 524288;
                }
            }

            /* JADX INFO: renamed from: E */
            private void m90672E() {
                if ((this.f65231d & 32) != 32) {
                    this.f65237j = new ArrayList(this.f65237j);
                    this.f65231d |= 32;
                }
            }

            /* JADX INFO: renamed from: G */
            private void m90673G() {
                if ((this.f65231d & 16384) != 16384) {
                    this.f65246s = new ArrayList(this.f65246s);
                    this.f65231d |= 16384;
                }
            }

            /* JADX INFO: renamed from: K */
            private void m90674K() {
            }

            /* JADX INFO: renamed from: t */
            public static Builder m90676t() {
                return new Builder();
            }

            /* JADX INFO: renamed from: u */
            private void m90677u() {
                if ((this.f65231d & 65536) != 65536) {
                    this.f65248u = new ArrayList(this.f65248u);
                    this.f65231d |= 65536;
                }
            }

            /* JADX INFO: renamed from: w */
            private void m90678w() {
                if ((this.f65231d & 32768) != 32768) {
                    this.f65247t = new ArrayList(this.f65247t);
                    this.f65231d |= 32768;
                }
            }

            /* JADX INFO: renamed from: x */
            private void m90679x() {
                if ((this.f65231d & 1024) != 1024) {
                    this.f65242o = new ArrayList(this.f65242o);
                    this.f65231d |= 1024;
                }
            }

            /* JADX INFO: renamed from: y */
            private void m90680y() {
                if ((this.f65231d & 512) != 512) {
                    this.f65241n = new ArrayList(this.f65241n);
                    this.f65231d |= 512;
                }
            }

            /* JADX INFO: renamed from: z */
            private void m90681z() {
                if ((this.f65231d & 256) != 256) {
                    this.f65240m = new ArrayList(this.f65240m);
                    this.f65231d |= 256;
                }
            }

            /* JADX INFO: renamed from: A */
            public final void m90682A() {
                if ((this.f65231d & 2097152) != 2097152) {
                    this.f65253z = new ArrayList(this.f65253z);
                    this.f65231d |= 2097152;
                }
            }

            /* JADX INFO: renamed from: C */
            public final void m90683C() {
                if ((this.f65231d & 131072) != 131072) {
                    this.f65249v = new ArrayList(this.f65249v);
                    this.f65231d |= 131072;
                }
            }

            /* JADX INFO: renamed from: D */
            public final void m90684D() {
                if ((this.f65231d & 262144) != 262144) {
                    this.f65250w = new ArrayList(this.f65250w);
                    this.f65231d |= 262144;
                }
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder
            /* JADX INFO: renamed from: L, reason: merged with bridge method [inline-methods] */
            public Builder mo90458f(Property property) {
                if (property == Property.getDefaultInstance()) {
                    return this;
                }
                if (property.hasFlags()) {
                    m90690Q(property.getFlags());
                }
                if (property.hasOldFlags()) {
                    m90693T(property.getOldFlags());
                }
                if (property.hasName()) {
                    m90692S(property.getName());
                }
                if (property.hasReturnType()) {
                    m90688O(property.getReturnType());
                }
                if (property.hasReturnTypeId()) {
                    m90695V(property.getReturnTypeId());
                }
                if (!property.typeParameter_.isEmpty()) {
                    if (this.f65237j.isEmpty()) {
                        this.f65237j = property.typeParameter_;
                        this.f65231d &= -33;
                    } else {
                        m90672E();
                        this.f65237j.addAll(property.typeParameter_);
                    }
                }
                if (property.hasReceiverType()) {
                    m90687N(property.getReceiverType());
                }
                if (property.hasReceiverTypeId()) {
                    m90694U(property.getReceiverTypeId());
                }
                if (!property.contextReceiverType_.isEmpty()) {
                    if (this.f65240m.isEmpty()) {
                        this.f65240m = property.contextReceiverType_;
                        this.f65231d &= -257;
                    } else {
                        m90681z();
                        this.f65240m.addAll(property.contextReceiverType_);
                    }
                }
                if (!property.contextReceiverTypeId_.isEmpty()) {
                    if (this.f65241n.isEmpty()) {
                        this.f65241n = property.contextReceiverTypeId_;
                        this.f65231d &= -513;
                    } else {
                        m90680y();
                        this.f65241n.addAll(property.contextReceiverTypeId_);
                    }
                }
                if (!property.contextParameter_.isEmpty()) {
                    if (this.f65242o.isEmpty()) {
                        this.f65242o = property.contextParameter_;
                        this.f65231d &= ErrorCode.ERROR_CODE_JOIN_ROOM_ROOM_FORBIDDEN;
                    } else {
                        m90679x();
                        this.f65242o.addAll(property.contextParameter_);
                    }
                }
                if (property.hasSetterValueParameter()) {
                    m90689P(property.getSetterValueParameter());
                }
                if (property.hasGetterFlags()) {
                    m90691R(property.getGetterFlags());
                }
                if (property.hasSetterFlags()) {
                    m90696W(property.getSetterFlags());
                }
                if (!property.versionRequirement_.isEmpty()) {
                    if (this.f65246s.isEmpty()) {
                        this.f65246s = property.versionRequirement_;
                        this.f65231d &= -16385;
                    } else {
                        m90673G();
                        this.f65246s.addAll(property.versionRequirement_);
                    }
                }
                if (!property.compilerPluginData_.isEmpty()) {
                    if (this.f65247t.isEmpty()) {
                        this.f65247t = property.compilerPluginData_;
                        this.f65231d &= -32769;
                    } else {
                        m90678w();
                        this.f65247t.addAll(property.compilerPluginData_);
                    }
                }
                if (!property.annotation_.isEmpty()) {
                    if (this.f65248u.isEmpty()) {
                        this.f65248u = property.annotation_;
                        this.f65231d &= -65537;
                    } else {
                        m90677u();
                        this.f65248u.addAll(property.annotation_);
                    }
                }
                if (!property.getterAnnotation_.isEmpty()) {
                    if (this.f65249v.isEmpty()) {
                        this.f65249v = property.getterAnnotation_;
                        this.f65231d &= -131073;
                    } else {
                        m90683C();
                        this.f65249v.addAll(property.getterAnnotation_);
                    }
                }
                if (!property.setterAnnotation_.isEmpty()) {
                    if (this.f65250w.isEmpty()) {
                        this.f65250w = property.setterAnnotation_;
                        this.f65231d &= -262145;
                    } else {
                        m90684D();
                        this.f65250w.addAll(property.setterAnnotation_);
                    }
                }
                if (!property.extensionReceiverAnnotation_.isEmpty()) {
                    if (this.f65251x.isEmpty()) {
                        this.f65251x = property.extensionReceiverAnnotation_;
                        this.f65231d &= -524289;
                    } else {
                        m90671B();
                        this.f65251x.addAll(property.extensionReceiverAnnotation_);
                    }
                }
                if (!property.backingFieldAnnotation_.isEmpty()) {
                    if (this.f65252y.isEmpty()) {
                        this.f65252y = property.backingFieldAnnotation_;
                        this.f65231d &= -1048577;
                    } else {
                        m90700v();
                        this.f65252y.addAll(property.backingFieldAnnotation_);
                    }
                }
                if (!property.delegateFieldAnnotation_.isEmpty()) {
                    if (this.f65253z.isEmpty()) {
                        this.f65253z = property.delegateFieldAnnotation_;
                        this.f65231d &= -2097153;
                    } else {
                        m90682A();
                        this.f65253z.addAll(property.delegateFieldAnnotation_);
                    }
                }
                m91337o(property);
                m91333j(m91332e().m91156c(property.unknownFields));
                return this;
            }

            /* JADX WARN: Code duplicated, block: B:15:0x001d  */
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
            public Builder mo90459i(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws Throwable {
                Property property = null;
                try {
                    try {
                        Property propertyMo90487d = Property.PARSER.mo90487d(codedInputStream, extensionRegistryLite);
                        if (propertyMo90487d != null) {
                            mo90458f(propertyMo90487d);
                        }
                        return this;
                    } catch (InvalidProtocolBufferException e) {
                        Property property2 = (Property) e.getUnfinishedMessage();
                        try {
                            throw e;
                        } catch (Throwable th) {
                            th = th;
                            property = property2;
                            if (property != null) {
                                mo90458f(property);
                            }
                            throw th;
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                    if (property != null) {
                        mo90458f(property);
                    }
                    throw th;
                }
            }

            /* JADX INFO: renamed from: N */
            public Builder m90687N(Type type) {
                if ((this.f65231d & 64) != 64 || this.f65238k == Type.getDefaultInstance()) {
                    this.f65238k = type;
                } else {
                    this.f65238k = Type.newBuilder(this.f65238k).mo90458f(type).m90764r();
                }
                this.f65231d |= 64;
                return this;
            }

            /* JADX INFO: renamed from: O */
            public Builder m90688O(Type type) {
                if ((this.f65231d & 8) != 8 || this.f65235h == Type.getDefaultInstance()) {
                    this.f65235h = type;
                } else {
                    this.f65235h = Type.newBuilder(this.f65235h).mo90458f(type).m90764r();
                }
                this.f65231d |= 8;
                return this;
            }

            /* JADX INFO: renamed from: P */
            public Builder m90689P(ValueParameter valueParameter) {
                if ((this.f65231d & 2048) != 2048 || this.f65243p == ValueParameter.getDefaultInstance()) {
                    this.f65243p = valueParameter;
                } else {
                    this.f65243p = ValueParameter.newBuilder(this.f65243p).mo90458f(valueParameter).m90827r();
                }
                this.f65231d |= 2048;
                return this;
            }

            /* JADX INFO: renamed from: Q */
            public Builder m90690Q(int i) {
                this.f65231d |= 1;
                this.f65232e = i;
                return this;
            }

            /* JADX INFO: renamed from: R */
            public Builder m90691R(int i) {
                this.f65231d |= 4096;
                this.f65244q = i;
                return this;
            }

            /* JADX INFO: renamed from: S */
            public Builder m90692S(int i) {
                this.f65231d |= 4;
                this.f65234g = i;
                return this;
            }

            /* JADX INFO: renamed from: T */
            public Builder m90693T(int i) {
                this.f65231d |= 2;
                this.f65233f = i;
                return this;
            }

            /* JADX INFO: renamed from: U */
            public Builder m90694U(int i) {
                this.f65231d |= 128;
                this.f65239l = i;
                return this;
            }

            /* JADX INFO: renamed from: V */
            public Builder m90695V(int i) {
                this.f65231d |= 16;
                this.f65236i = i;
                return this;
            }

            /* JADX INFO: renamed from: W */
            public Builder m90696W(int i) {
                this.f65231d |= 8192;
                this.f65245r = i;
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
            public Property build() {
                Property propertyM90698r = m90698r();
                if (propertyM90698r.isInitialized()) {
                    return propertyM90698r;
                }
                throw AbstractMessageLite.Builder.m91133c(propertyM90698r);
            }

            /* JADX INFO: renamed from: r */
            public Property m90698r() {
                Property property = new Property(this);
                int i = this.f65231d;
                int i2 = (i & 1) != 1 ? 0 : 1;
                property.flags_ = this.f65232e;
                if ((i & 2) == 2) {
                    i2 |= 2;
                }
                property.oldFlags_ = this.f65233f;
                if ((i & 4) == 4) {
                    i2 |= 4;
                }
                property.name_ = this.f65234g;
                if ((i & 8) == 8) {
                    i2 |= 8;
                }
                property.returnType_ = this.f65235h;
                if ((i & 16) == 16) {
                    i2 |= 16;
                }
                property.returnTypeId_ = this.f65236i;
                if ((this.f65231d & 32) == 32) {
                    this.f65237j = Collections.unmodifiableList(this.f65237j);
                    this.f65231d &= -33;
                }
                property.typeParameter_ = this.f65237j;
                if ((i & 64) == 64) {
                    i2 |= 32;
                }
                property.receiverType_ = this.f65238k;
                if ((i & 128) == 128) {
                    i2 |= 64;
                }
                property.receiverTypeId_ = this.f65239l;
                if ((this.f65231d & 256) == 256) {
                    this.f65240m = Collections.unmodifiableList(this.f65240m);
                    this.f65231d &= -257;
                }
                property.contextReceiverType_ = this.f65240m;
                if ((this.f65231d & 512) == 512) {
                    this.f65241n = Collections.unmodifiableList(this.f65241n);
                    this.f65231d &= -513;
                }
                property.contextReceiverTypeId_ = this.f65241n;
                if ((this.f65231d & 1024) == 1024) {
                    this.f65242o = Collections.unmodifiableList(this.f65242o);
                    this.f65231d &= ErrorCode.ERROR_CODE_JOIN_ROOM_ROOM_FORBIDDEN;
                }
                property.contextParameter_ = this.f65242o;
                if ((i & 2048) == 2048) {
                    i2 |= 128;
                }
                property.setterValueParameter_ = this.f65243p;
                if ((i & 4096) == 4096) {
                    i2 |= 256;
                }
                property.getterFlags_ = this.f65244q;
                if ((i & 8192) == 8192) {
                    i2 |= 512;
                }
                property.setterFlags_ = this.f65245r;
                if ((this.f65231d & 16384) == 16384) {
                    this.f65246s = Collections.unmodifiableList(this.f65246s);
                    this.f65231d &= -16385;
                }
                property.versionRequirement_ = this.f65246s;
                if ((this.f65231d & 32768) == 32768) {
                    this.f65247t = Collections.unmodifiableList(this.f65247t);
                    this.f65231d &= -32769;
                }
                property.compilerPluginData_ = this.f65247t;
                if ((this.f65231d & 65536) == 65536) {
                    this.f65248u = Collections.unmodifiableList(this.f65248u);
                    this.f65231d &= -65537;
                }
                property.annotation_ = this.f65248u;
                if ((this.f65231d & 131072) == 131072) {
                    this.f65249v = Collections.unmodifiableList(this.f65249v);
                    this.f65231d &= -131073;
                }
                property.getterAnnotation_ = this.f65249v;
                if ((this.f65231d & 262144) == 262144) {
                    this.f65250w = Collections.unmodifiableList(this.f65250w);
                    this.f65231d &= -262145;
                }
                property.setterAnnotation_ = this.f65250w;
                if ((this.f65231d & 524288) == 524288) {
                    this.f65251x = Collections.unmodifiableList(this.f65251x);
                    this.f65231d &= -524289;
                }
                property.extensionReceiverAnnotation_ = this.f65251x;
                if ((this.f65231d & 1048576) == 1048576) {
                    this.f65252y = Collections.unmodifiableList(this.f65252y);
                    this.f65231d &= -1048577;
                }
                property.backingFieldAnnotation_ = this.f65252y;
                if ((this.f65231d & 2097152) == 2097152) {
                    this.f65253z = Collections.unmodifiableList(this.f65253z);
                    this.f65231d &= -2097153;
                }
                property.delegateFieldAnnotation_ = this.f65253z;
                property.bitField0_ = i2;
                return property;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableBuilder
            /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
            public Builder mo90523m() {
                return m90676t().mo90458f(m90698r());
            }

            /* JADX INFO: renamed from: v */
            public final void m90700v() {
                if ((this.f65231d & 1048576) != 1048576) {
                    this.f65252y = new ArrayList(this.f65252y);
                    this.f65231d |= 1048576;
                }
            }
        }

        /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Property$a */
        public static class C15256a extends AbstractParser<Property> {
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.Parser
            /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
            public Property mo90487d(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return new Property(codedInputStream, extensionRegistryLite);
            }
        }

        static {
            Property property = new Property(true);
            defaultInstance = property;
            property.initFields();
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Code duplicated, block: B:140:0x0387  */
        /* JADX WARN: Code duplicated, block: B:143:0x0395  */
        /* JADX WARN: Code duplicated, block: B:146:0x03a3  */
        /* JADX WARN: Code duplicated, block: B:149:0x03b1  */
        /* JADX WARN: Code duplicated, block: B:152:0x03bd  */
        /* JADX WARN: Code duplicated, block: B:155:0x03c9  */
        /* JADX WARN: Code duplicated, block: B:158:0x03d5  */
        /* JADX WARN: Code duplicated, block: B:161:0x03e1  */
        /* JADX WARN: Code duplicated, block: B:164:0x03ed  */
        /* JADX WARN: Code duplicated, block: B:167:0x03f9  */
        /* JADX WARN: Code duplicated, block: B:170:0x0407  */
        /* JADX WARN: Code duplicated, block: B:173:0x0415  */
        /* JADX WARN: Code duplicated, block: B:9:0x0046  */
        /* JADX WARN: Multi-variable type inference failed */
        private Property(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws Throwable {
            int i;
            this.contextReceiverTypeIdMemoizedSerializedSize = -1;
            this.memoizedIsInitialized = (byte) -1;
            this.memoizedSerializedSize = -1;
            initFields();
            ByteString.Output outputM91150w = ByteString.m91150w();
            boolean z = true;
            CodedOutputStream codedOutputStreamM91226K = CodedOutputStream.m91226K(outputM91150w, 1);
            boolean z2 = false;
            int i2 = 0;
            while (true) {
                int i3 = 1048576;
                int i4 = 2097152;
                boolean z3 = z;
                if (z2) {
                    if ((i2 & 32) == 32) {
                        this.typeParameter_ = Collections.unmodifiableList(this.typeParameter_);
                    }
                    if ((i2 & 256) == 256) {
                        this.contextReceiverType_ = Collections.unmodifiableList(this.contextReceiverType_);
                    }
                    if ((i2 & 512) == 512) {
                        this.contextReceiverTypeId_ = Collections.unmodifiableList(this.contextReceiverTypeId_);
                    }
                    if ((i2 & 65536) == 65536) {
                        this.annotation_ = Collections.unmodifiableList(this.annotation_);
                    }
                    if ((i2 & 131072) == 131072) {
                        this.getterAnnotation_ = Collections.unmodifiableList(this.getterAnnotation_);
                    }
                    if ((i2 & 262144) == 262144) {
                        this.setterAnnotation_ = Collections.unmodifiableList(this.setterAnnotation_);
                    }
                    if ((i2 & 1024) == 1024) {
                        this.contextParameter_ = Collections.unmodifiableList(this.contextParameter_);
                    }
                    if ((i2 & 16384) == 16384) {
                        this.versionRequirement_ = Collections.unmodifiableList(this.versionRequirement_);
                    }
                    if ((i2 & 32768) == 32768) {
                        this.compilerPluginData_ = Collections.unmodifiableList(this.compilerPluginData_);
                    }
                    if ((i2 & 524288) == 524288) {
                        this.extensionReceiverAnnotation_ = Collections.unmodifiableList(this.extensionReceiverAnnotation_);
                    }
                    if ((i2 & 1048576) == 1048576) {
                        this.backingFieldAnnotation_ = Collections.unmodifiableList(this.backingFieldAnnotation_);
                    }
                    if ((i2 & 2097152) == 2097152) {
                        this.delegateFieldAnnotation_ = Collections.unmodifiableList(this.delegateFieldAnnotation_);
                    }
                    try {
                        codedOutputStreamM91226K.m91258J();
                    } catch (IOException unused) {
                    } finally {
                        this.unknownFields = outputM91150w.m91170m();
                    }
                    makeExtensionsImmutable();
                    return;
                }
                try {
                    int iM91185K = codedInputStream.m91185K();
                    switch (iM91185K) {
                        case 0:
                            z2 = z3;
                            z = z3;
                            break;
                        case 8:
                            this.bitField0_ |= 2;
                            this.oldFlags_ = codedInputStream.m91209s();
                            z = z3;
                            break;
                        case 16:
                            this.bitField0_ |= 4;
                            this.name_ = codedInputStream.m91209s();
                            z = z3;
                            break;
                        case 26:
                            Type.Builder builder = (this.bitField0_ & 8) == 8 ? this.returnType_.toBuilder() : null;
                            Type type = (Type) codedInputStream.m91211u(Type.PARSER, extensionRegistryLite);
                            this.returnType_ = type;
                            if (builder != 0) {
                                builder.mo90458f(type);
                                this.returnType_ = builder.m90764r();
                            }
                            this.bitField0_ |= 8;
                            z = z3;
                            break;
                        case 34:
                            if ((i2 & 32) != 32) {
                                this.typeParameter_ = new ArrayList();
                                i2 |= 32;
                            }
                            this.typeParameter_.add((TypeParameter) codedInputStream.m91211u(TypeParameter.PARSER, extensionRegistryLite));
                            z = z3;
                            break;
                        case 42:
                            Type.Builder builder2 = (this.bitField0_ & 32) == 32 ? this.receiverType_.toBuilder() : null;
                            Type type2 = (Type) codedInputStream.m91211u(Type.PARSER, extensionRegistryLite);
                            this.receiverType_ = type2;
                            if (builder2 != 0) {
                                builder2.mo90458f(type2);
                                this.receiverType_ = builder2.m90764r();
                            }
                            this.bitField0_ |= 32;
                            z = z3;
                            break;
                        case 50:
                            ValueParameter.Builder builder3 = (this.bitField0_ & 128) == 128 ? this.setterValueParameter_.toBuilder() : null;
                            ValueParameter valueParameter = (ValueParameter) codedInputStream.m91211u(ValueParameter.PARSER, extensionRegistryLite);
                            this.setterValueParameter_ = valueParameter;
                            if (builder3 != 0) {
                                builder3.mo90458f(valueParameter);
                                this.setterValueParameter_ = builder3.m90827r();
                            }
                            this.bitField0_ |= 128;
                            z = z3;
                            break;
                        case 56:
                            this.bitField0_ |= 256;
                            this.getterFlags_ = codedInputStream.m91209s();
                            z = z3;
                            break;
                        case 64:
                            this.bitField0_ |= 512;
                            this.setterFlags_ = codedInputStream.m91209s();
                            z = z3;
                            break;
                        case 72:
                            this.bitField0_ |= 16;
                            this.returnTypeId_ = codedInputStream.m91209s();
                            z = z3;
                            break;
                        case 80:
                            this.bitField0_ |= 64;
                            this.receiverTypeId_ = codedInputStream.m91209s();
                            z = z3;
                            break;
                        case 88:
                            this.bitField0_ |= 1;
                            this.flags_ = codedInputStream.m91209s();
                            z = z3;
                            break;
                        case EACTags.FCP_TEMPLATE /* 98 */:
                            if ((i2 & 256) != 256) {
                                this.contextReceiverType_ = new ArrayList();
                                i2 |= 256;
                            }
                            this.contextReceiverType_.add((Type) codedInputStream.m91211u(Type.PARSER, extensionRegistryLite));
                            z = z3;
                            break;
                        case 104:
                            if ((i2 & 512) != 512) {
                                this.contextReceiverTypeId_ = new ArrayList();
                                i2 |= 512;
                            }
                            this.contextReceiverTypeId_.add(Integer.valueOf(codedInputStream.m91209s()));
                            z = z3;
                            break;
                        case 106:
                            int iM91200j = codedInputStream.m91200j(codedInputStream.m91176A());
                            if ((i2 & 512) != 512 && codedInputStream.m91197e() > 0) {
                                this.contextReceiverTypeId_ = new ArrayList();
                                i2 |= 512;
                            }
                            while (codedInputStream.m91197e() > 0) {
                                this.contextReceiverTypeId_.add(Integer.valueOf(codedInputStream.m91209s()));
                            }
                            codedInputStream.m91199i(iM91200j);
                            z = z3;
                            break;
                        case 114:
                            if ((i2 & 65536) != 65536) {
                                this.annotation_ = new ArrayList();
                                i2 |= 65536;
                            }
                            this.annotation_.add((Annotation) codedInputStream.m91211u(Annotation.PARSER, extensionRegistryLite));
                            z = z3;
                            break;
                        case 122:
                            if ((i2 & 131072) != 131072) {
                                this.getterAnnotation_ = new ArrayList();
                                i2 |= 131072;
                            }
                            this.getterAnnotation_.add((Annotation) codedInputStream.m91211u(Annotation.PARSER, extensionRegistryLite));
                            z = z3;
                            break;
                        case 130:
                            if ((i2 & 262144) != 262144) {
                                this.setterAnnotation_ = new ArrayList();
                                i2 |= 262144;
                            }
                            this.setterAnnotation_.add((Annotation) codedInputStream.m91211u(Annotation.PARSER, extensionRegistryLite));
                            z = z3;
                            break;
                        case CipherSuite.TLS_PSK_WITH_RC4_128_SHA /* 138 */:
                            if ((i2 & 1024) != 1024) {
                                this.contextParameter_ = new ArrayList();
                                i2 |= 1024;
                            }
                            this.contextParameter_.add((ValueParameter) codedInputStream.m91211u(ValueParameter.PARSER, extensionRegistryLite));
                            z = z3;
                            break;
                        case 248:
                            if ((i2 & 16384) != 16384) {
                                this.versionRequirement_ = new ArrayList();
                                i2 |= 16384;
                            }
                            this.versionRequirement_.add(Integer.valueOf(codedInputStream.m91209s()));
                            z = z3;
                            break;
                        case 250:
                            i4 = 2097152;
                            int iM91200j2 = codedInputStream.m91200j(codedInputStream.m91176A());
                            if ((i2 & 16384) != 16384 && codedInputStream.m91197e() > 0) {
                                this.versionRequirement_ = new ArrayList();
                                i2 |= 16384;
                            }
                            while (codedInputStream.m91197e() > 0) {
                                i = i3;
                                try {
                                    try {
                                        this.versionRequirement_.add(Integer.valueOf(codedInputStream.m91209s()));
                                        i3 = i;
                                    } catch (Throwable th) {
                                        th = th;
                                        if ((i2 & 32) == 32) {
                                            this.typeParameter_ = Collections.unmodifiableList(this.typeParameter_);
                                        }
                                        if ((i2 & 256) == 256) {
                                            this.contextReceiverType_ = Collections.unmodifiableList(this.contextReceiverType_);
                                        }
                                        if ((i2 & 512) == 512) {
                                            this.contextReceiverTypeId_ = Collections.unmodifiableList(this.contextReceiverTypeId_);
                                        }
                                        if ((i2 & 65536) == 65536) {
                                            this.annotation_ = Collections.unmodifiableList(this.annotation_);
                                        }
                                        if ((i2 & 131072) == 131072) {
                                            this.getterAnnotation_ = Collections.unmodifiableList(this.getterAnnotation_);
                                        }
                                        if ((i2 & 262144) == 262144) {
                                            this.setterAnnotation_ = Collections.unmodifiableList(this.setterAnnotation_);
                                        }
                                        if ((i2 & 1024) == 1024) {
                                            this.contextParameter_ = Collections.unmodifiableList(this.contextParameter_);
                                        }
                                        if ((i2 & 16384) == 16384) {
                                            this.versionRequirement_ = Collections.unmodifiableList(this.versionRequirement_);
                                        }
                                        if ((i2 & 32768) == 32768) {
                                            this.compilerPluginData_ = Collections.unmodifiableList(this.compilerPluginData_);
                                        }
                                        if ((i2 & 524288) == 524288) {
                                            this.extensionReceiverAnnotation_ = Collections.unmodifiableList(this.extensionReceiverAnnotation_);
                                        }
                                        if ((i2 & i) == i) {
                                            this.backingFieldAnnotation_ = Collections.unmodifiableList(this.backingFieldAnnotation_);
                                        }
                                        if ((i2 & i4) == i4) {
                                            this.delegateFieldAnnotation_ = Collections.unmodifiableList(this.delegateFieldAnnotation_);
                                        }
                                        try {
                                            codedOutputStreamM91226K.m91258J();
                                            break;
                                        } catch (IOException unused2) {
                                        } finally {
                                            this.unknownFields = outputM91150w.m91170m();
                                        }
                                        makeExtensionsImmutable();
                                        throw th;
                                    }
                                } catch (InvalidProtocolBufferException e) {
                                    e = e;
                                    throw e.setUnfinishedMessage(this);
                                } catch (IOException e2) {
                                    e = e2;
                                    throw new InvalidProtocolBufferException(e.getMessage()).setUnfinishedMessage(this);
                                }
                            }
                            codedInputStream.m91199i(iM91200j2);
                            z = z3;
                            break;
                        case 258:
                            if ((i2 & 32768) != 32768) {
                                this.compilerPluginData_ = new ArrayList();
                                i2 |= 32768;
                            }
                            this.compilerPluginData_.add((CompilerPluginData) codedInputStream.m91211u(CompilerPluginData.PARSER, extensionRegistryLite));
                            z = z3;
                            break;
                        case 266:
                            if ((i2 & 524288) != 524288) {
                                this.extensionReceiverAnnotation_ = new ArrayList();
                                i2 |= 524288;
                            }
                            this.extensionReceiverAnnotation_.add((Annotation) codedInputStream.m91211u(Annotation.PARSER, extensionRegistryLite));
                            z = z3;
                            break;
                        case 274:
                            if ((i2 & 1048576) != 1048576) {
                                this.backingFieldAnnotation_ = new ArrayList();
                                i2 |= 1048576;
                            }
                            this.backingFieldAnnotation_.add((Annotation) codedInputStream.m91211u(Annotation.PARSER, extensionRegistryLite));
                            z = z3;
                            break;
                        case 282:
                            if ((i2 & 2097152) != 2097152) {
                                this.delegateFieldAnnotation_ = new ArrayList();
                                i2 |= 2097152;
                            }
                            try {
                                try {
                                    this.delegateFieldAnnotation_.add((Annotation) codedInputStream.m91211u(Annotation.PARSER, extensionRegistryLite));
                                    z = z3;
                                } catch (InvalidProtocolBufferException e3) {
                                    e = e3;
                                    throw e.setUnfinishedMessage(this);
                                } catch (IOException e4) {
                                    e = e4;
                                    throw new InvalidProtocolBufferException(e.getMessage()).setUnfinishedMessage(this);
                                } catch (Throwable th2) {
                                    th = th2;
                                    i = 1048576;
                                    if ((i2 & 32) == 32) {
                                        this.typeParameter_ = Collections.unmodifiableList(this.typeParameter_);
                                    }
                                    if ((i2 & 256) == 256) {
                                        this.contextReceiverType_ = Collections.unmodifiableList(this.contextReceiverType_);
                                    }
                                    if ((i2 & 512) == 512) {
                                        this.contextReceiverTypeId_ = Collections.unmodifiableList(this.contextReceiverTypeId_);
                                    }
                                    if ((i2 & 65536) == 65536) {
                                        this.annotation_ = Collections.unmodifiableList(this.annotation_);
                                    }
                                    if ((i2 & 131072) == 131072) {
                                        this.getterAnnotation_ = Collections.unmodifiableList(this.getterAnnotation_);
                                    }
                                    if ((i2 & 262144) == 262144) {
                                        this.setterAnnotation_ = Collections.unmodifiableList(this.setterAnnotation_);
                                    }
                                    if ((i2 & 1024) == 1024) {
                                        this.contextParameter_ = Collections.unmodifiableList(this.contextParameter_);
                                    }
                                    if ((i2 & 16384) == 16384) {
                                        this.versionRequirement_ = Collections.unmodifiableList(this.versionRequirement_);
                                    }
                                    if ((i2 & 32768) == 32768) {
                                        this.compilerPluginData_ = Collections.unmodifiableList(this.compilerPluginData_);
                                    }
                                    if ((i2 & 524288) == 524288) {
                                        this.extensionReceiverAnnotation_ = Collections.unmodifiableList(this.extensionReceiverAnnotation_);
                                    }
                                    if ((i2 & i) == i) {
                                        this.backingFieldAnnotation_ = Collections.unmodifiableList(this.backingFieldAnnotation_);
                                    }
                                    if ((i2 & i4) == i4) {
                                        this.delegateFieldAnnotation_ = Collections.unmodifiableList(this.delegateFieldAnnotation_);
                                    }
                                    codedOutputStreamM91226K.m91258J();
                                    makeExtensionsImmutable();
                                    throw th;
                                }
                            } catch (InvalidProtocolBufferException e5) {
                                e = e5;
                            } catch (IOException e6) {
                                e = e6;
                            } catch (Throwable th3) {
                                th = th3;
                            }
                            break;
                        default:
                            if (!parseUnknownField(codedInputStream, codedOutputStreamM91226K, extensionRegistryLite, iM91185K)) {
                                z2 = z3;
                            }
                            z = z3;
                            break;
                    }
                } catch (InvalidProtocolBufferException e7) {
                    e = e7;
                } catch (IOException e8) {
                    e = e8;
                } catch (Throwable th4) {
                    th = th4;
                    i = 1048576;
                    i4 = 2097152;
                }
            }
        }

        public static Property getDefaultInstance() {
            return defaultInstance;
        }

        private void initFields() {
            this.flags_ = 518;
            this.oldFlags_ = 2054;
            this.name_ = 0;
            this.returnType_ = Type.getDefaultInstance();
            this.returnTypeId_ = 0;
            List list = Collections.EMPTY_LIST;
            this.typeParameter_ = list;
            this.receiverType_ = Type.getDefaultInstance();
            this.receiverTypeId_ = 0;
            this.contextReceiverType_ = list;
            this.contextReceiverTypeId_ = list;
            this.contextParameter_ = list;
            this.setterValueParameter_ = ValueParameter.getDefaultInstance();
            this.getterFlags_ = 0;
            this.setterFlags_ = 0;
            this.versionRequirement_ = list;
            this.compilerPluginData_ = list;
            this.annotation_ = list;
            this.getterAnnotation_ = list;
            this.setterAnnotation_ = list;
            this.extensionReceiverAnnotation_ = list;
            this.backingFieldAnnotation_ = list;
            this.delegateFieldAnnotation_ = list;
        }

        public static Builder newBuilder(Property property) {
            return newBuilder().mo90458f(property);
        }

        public Annotation getAnnotation(int i) {
            return this.annotation_.get(i);
        }

        public int getAnnotationCount() {
            return this.annotation_.size();
        }

        public List<Annotation> getAnnotationList() {
            return this.annotation_;
        }

        public Annotation getBackingFieldAnnotation(int i) {
            return this.backingFieldAnnotation_.get(i);
        }

        public int getBackingFieldAnnotationCount() {
            return this.backingFieldAnnotation_.size();
        }

        public List<Annotation> getBackingFieldAnnotationList() {
            return this.backingFieldAnnotation_;
        }

        public CompilerPluginData getCompilerPluginData(int i) {
            return this.compilerPluginData_.get(i);
        }

        public int getCompilerPluginDataCount() {
            return this.compilerPluginData_.size();
        }

        public ValueParameter getContextParameter(int i) {
            return this.contextParameter_.get(i);
        }

        public int getContextParameterCount() {
            return this.contextParameter_.size();
        }

        public List<ValueParameter> getContextParameterList() {
            return this.contextParameter_;
        }

        public Type getContextReceiverType(int i) {
            return this.contextReceiverType_.get(i);
        }

        public int getContextReceiverTypeCount() {
            return this.contextReceiverType_.size();
        }

        public List<Integer> getContextReceiverTypeIdList() {
            return this.contextReceiverTypeId_;
        }

        public List<Type> getContextReceiverTypeList() {
            return this.contextReceiverType_;
        }

        public Annotation getDelegateFieldAnnotation(int i) {
            return this.delegateFieldAnnotation_.get(i);
        }

        public int getDelegateFieldAnnotationCount() {
            return this.delegateFieldAnnotation_.size();
        }

        public List<Annotation> getDelegateFieldAnnotationList() {
            return this.delegateFieldAnnotation_;
        }

        public Annotation getExtensionReceiverAnnotation(int i) {
            return this.extensionReceiverAnnotation_.get(i);
        }

        public int getExtensionReceiverAnnotationCount() {
            return this.extensionReceiverAnnotation_.size();
        }

        public List<Annotation> getExtensionReceiverAnnotationList() {
            return this.extensionReceiverAnnotation_;
        }

        public int getFlags() {
            return this.flags_;
        }

        public Annotation getGetterAnnotation(int i) {
            return this.getterAnnotation_.get(i);
        }

        public int getGetterAnnotationCount() {
            return this.getterAnnotation_.size();
        }

        public List<Annotation> getGetterAnnotationList() {
            return this.getterAnnotation_;
        }

        public int getGetterFlags() {
            return this.getterFlags_;
        }

        public int getName() {
            return this.name_;
        }

        public int getOldFlags() {
            return this.oldFlags_;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public Parser<Property> getParserForType() {
            return PARSER;
        }

        public Type getReceiverType() {
            return this.receiverType_;
        }

        public int getReceiverTypeId() {
            return this.receiverTypeId_;
        }

        public Type getReturnType() {
            return this.returnType_;
        }

        public int getReturnTypeId() {
            return this.returnTypeId_;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableMessage, kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int iM91243p = (this.bitField0_ & 2) == 2 ? CodedOutputStream.m91243p(1, this.oldFlags_) : 0;
            if ((this.bitField0_ & 4) == 4) {
                iM91243p += CodedOutputStream.m91243p(2, this.name_);
            }
            if ((this.bitField0_ & 8) == 8) {
                iM91243p += CodedOutputStream.m91247t(3, this.returnType_);
            }
            for (int i2 = 0; i2 < this.typeParameter_.size(); i2++) {
                iM91243p += CodedOutputStream.m91247t(4, this.typeParameter_.get(i2));
            }
            if ((this.bitField0_ & 32) == 32) {
                iM91243p += CodedOutputStream.m91247t(5, this.receiverType_);
            }
            if ((this.bitField0_ & 128) == 128) {
                iM91243p += CodedOutputStream.m91247t(6, this.setterValueParameter_);
            }
            if ((this.bitField0_ & 256) == 256) {
                iM91243p += CodedOutputStream.m91243p(7, this.getterFlags_);
            }
            if ((this.bitField0_ & 512) == 512) {
                iM91243p += CodedOutputStream.m91243p(8, this.setterFlags_);
            }
            if ((this.bitField0_ & 16) == 16) {
                iM91243p += CodedOutputStream.m91243p(9, this.returnTypeId_);
            }
            if ((this.bitField0_ & 64) == 64) {
                iM91243p += CodedOutputStream.m91243p(10, this.receiverTypeId_);
            }
            if ((this.bitField0_ & 1) == 1) {
                iM91243p += CodedOutputStream.m91243p(11, this.flags_);
            }
            for (int i3 = 0; i3 < this.contextReceiverType_.size(); i3++) {
                iM91243p += CodedOutputStream.m91247t(12, this.contextReceiverType_.get(i3));
            }
            int iM91244q = 0;
            for (int i4 = 0; i4 < this.contextReceiverTypeId_.size(); i4++) {
                iM91244q += CodedOutputStream.m91244q(this.contextReceiverTypeId_.get(i4).intValue());
            }
            int iM91247t = iM91243p + iM91244q;
            if (!getContextReceiverTypeIdList().isEmpty()) {
                iM91247t = iM91247t + 1 + CodedOutputStream.m91244q(iM91244q);
            }
            this.contextReceiverTypeIdMemoizedSerializedSize = iM91244q;
            for (int i5 = 0; i5 < this.annotation_.size(); i5++) {
                iM91247t += CodedOutputStream.m91247t(14, this.annotation_.get(i5));
            }
            for (int i6 = 0; i6 < this.getterAnnotation_.size(); i6++) {
                iM91247t += CodedOutputStream.m91247t(15, this.getterAnnotation_.get(i6));
            }
            for (int i7 = 0; i7 < this.setterAnnotation_.size(); i7++) {
                iM91247t += CodedOutputStream.m91247t(16, this.setterAnnotation_.get(i7));
            }
            for (int i8 = 0; i8 < this.contextParameter_.size(); i8++) {
                iM91247t += CodedOutputStream.m91247t(17, this.contextParameter_.get(i8));
            }
            int iM91244q2 = 0;
            for (int i9 = 0; i9 < this.versionRequirement_.size(); i9++) {
                iM91244q2 += CodedOutputStream.m91244q(this.versionRequirement_.get(i9).intValue());
            }
            int size = iM91247t + iM91244q2 + (getVersionRequirementList().size() * 2);
            for (int i10 = 0; i10 < this.compilerPluginData_.size(); i10++) {
                size += CodedOutputStream.m91247t(32, this.compilerPluginData_.get(i10));
            }
            for (int i11 = 0; i11 < this.extensionReceiverAnnotation_.size(); i11++) {
                size += CodedOutputStream.m91247t(33, this.extensionReceiverAnnotation_.get(i11));
            }
            for (int i12 = 0; i12 < this.backingFieldAnnotation_.size(); i12++) {
                size += CodedOutputStream.m91247t(34, this.backingFieldAnnotation_.get(i12));
            }
            for (int i13 = 0; i13 < this.delegateFieldAnnotation_.size(); i13++) {
                size += CodedOutputStream.m91247t(35, this.delegateFieldAnnotation_.get(i13));
            }
            int iExtensionsSerializedSize = size + extensionsSerializedSize() + this.unknownFields.size();
            this.memoizedSerializedSize = iExtensionsSerializedSize;
            return iExtensionsSerializedSize;
        }

        public Annotation getSetterAnnotation(int i) {
            return this.setterAnnotation_.get(i);
        }

        public int getSetterAnnotationCount() {
            return this.setterAnnotation_.size();
        }

        public List<Annotation> getSetterAnnotationList() {
            return this.setterAnnotation_;
        }

        public int getSetterFlags() {
            return this.setterFlags_;
        }

        public ValueParameter getSetterValueParameter() {
            return this.setterValueParameter_;
        }

        public TypeParameter getTypeParameter(int i) {
            return this.typeParameter_.get(i);
        }

        public int getTypeParameterCount() {
            return this.typeParameter_.size();
        }

        public List<TypeParameter> getTypeParameterList() {
            return this.typeParameter_;
        }

        public List<Integer> getVersionRequirementList() {
            return this.versionRequirement_;
        }

        public boolean hasFlags() {
            return (this.bitField0_ & 1) == 1;
        }

        public boolean hasGetterFlags() {
            return (this.bitField0_ & 256) == 256;
        }

        public boolean hasName() {
            return (this.bitField0_ & 4) == 4;
        }

        public boolean hasOldFlags() {
            return (this.bitField0_ & 2) == 2;
        }

        public boolean hasReceiverType() {
            return (this.bitField0_ & 32) == 32;
        }

        public boolean hasReceiverTypeId() {
            return (this.bitField0_ & 64) == 64;
        }

        public boolean hasReturnType() {
            return (this.bitField0_ & 8) == 8;
        }

        public boolean hasReturnTypeId() {
            return (this.bitField0_ & 16) == 16;
        }

        public boolean hasSetterFlags() {
            return (this.bitField0_ & 512) == 512;
        }

        public boolean hasSetterValueParameter() {
            return (this.bitField0_ & 128) == 128;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableMessage, kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            byte b = this.memoizedIsInitialized;
            if (b == 1) {
                return true;
            }
            if (b == 0) {
                return false;
            }
            if (!hasName()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (hasReturnType() && !getReturnType().isInitialized()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            for (int i = 0; i < getTypeParameterCount(); i++) {
                if (!getTypeParameter(i).isInitialized()) {
                    this.memoizedIsInitialized = (byte) 0;
                    return false;
                }
            }
            if (hasReceiverType() && !getReceiverType().isInitialized()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            for (int i2 = 0; i2 < getContextReceiverTypeCount(); i2++) {
                if (!getContextReceiverType(i2).isInitialized()) {
                    this.memoizedIsInitialized = (byte) 0;
                    return false;
                }
            }
            for (int i3 = 0; i3 < getContextParameterCount(); i3++) {
                if (!getContextParameter(i3).isInitialized()) {
                    this.memoizedIsInitialized = (byte) 0;
                    return false;
                }
            }
            if (hasSetterValueParameter() && !getSetterValueParameter().isInitialized()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            for (int i4 = 0; i4 < getCompilerPluginDataCount(); i4++) {
                if (!getCompilerPluginData(i4).isInitialized()) {
                    this.memoizedIsInitialized = (byte) 0;
                    return false;
                }
            }
            for (int i5 = 0; i5 < getAnnotationCount(); i5++) {
                if (!getAnnotation(i5).isInitialized()) {
                    this.memoizedIsInitialized = (byte) 0;
                    return false;
                }
            }
            for (int i6 = 0; i6 < getGetterAnnotationCount(); i6++) {
                if (!getGetterAnnotation(i6).isInitialized()) {
                    this.memoizedIsInitialized = (byte) 0;
                    return false;
                }
            }
            for (int i7 = 0; i7 < getSetterAnnotationCount(); i7++) {
                if (!getSetterAnnotation(i7).isInitialized()) {
                    this.memoizedIsInitialized = (byte) 0;
                    return false;
                }
            }
            for (int i8 = 0; i8 < getExtensionReceiverAnnotationCount(); i8++) {
                if (!getExtensionReceiverAnnotation(i8).isInitialized()) {
                    this.memoizedIsInitialized = (byte) 0;
                    return false;
                }
            }
            for (int i9 = 0; i9 < getBackingFieldAnnotationCount(); i9++) {
                if (!getBackingFieldAnnotation(i9).isInitialized()) {
                    this.memoizedIsInitialized = (byte) 0;
                    return false;
                }
            }
            for (int i10 = 0; i10 < getDelegateFieldAnnotationCount(); i10++) {
                if (!getDelegateFieldAnnotation(i10).isInitialized()) {
                    this.memoizedIsInitialized = (byte) 0;
                    return false;
                }
            }
            if (extensionsAreInitialized()) {
                this.memoizedIsInitialized = (byte) 1;
                return true;
            }
            this.memoizedIsInitialized = (byte) 0;
            return false;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableMessage, kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            getSerializedSize();
            GeneratedMessageLite.ExtendableMessage<MessageType>.ExtensionWriter extensionWriterNewExtensionWriter = newExtensionWriter();
            if ((this.bitField0_ & 2) == 2) {
                codedOutputStream.m91277e0(1, this.oldFlags_);
            }
            if ((this.bitField0_ & 4) == 4) {
                codedOutputStream.m91277e0(2, this.name_);
            }
            if ((this.bitField0_ & 8) == 8) {
                codedOutputStream.m91280h0(3, this.returnType_);
            }
            for (int i = 0; i < this.typeParameter_.size(); i++) {
                codedOutputStream.m91280h0(4, this.typeParameter_.get(i));
            }
            if ((this.bitField0_ & 32) == 32) {
                codedOutputStream.m91280h0(5, this.receiverType_);
            }
            if ((this.bitField0_ & 128) == 128) {
                codedOutputStream.m91280h0(6, this.setterValueParameter_);
            }
            if ((this.bitField0_ & 256) == 256) {
                codedOutputStream.m91277e0(7, this.getterFlags_);
            }
            if ((this.bitField0_ & 512) == 512) {
                codedOutputStream.m91277e0(8, this.setterFlags_);
            }
            if ((this.bitField0_ & 16) == 16) {
                codedOutputStream.m91277e0(9, this.returnTypeId_);
            }
            if ((this.bitField0_ & 64) == 64) {
                codedOutputStream.m91277e0(10, this.receiverTypeId_);
            }
            if ((this.bitField0_ & 1) == 1) {
                codedOutputStream.m91277e0(11, this.flags_);
            }
            for (int i2 = 0; i2 < this.contextReceiverType_.size(); i2++) {
                codedOutputStream.m91280h0(12, this.contextReceiverType_.get(i2));
            }
            if (getContextReceiverTypeIdList().size() > 0) {
                codedOutputStream.m91291s0(106);
                codedOutputStream.m91291s0(this.contextReceiverTypeIdMemoizedSerializedSize);
            }
            for (int i3 = 0; i3 < this.contextReceiverTypeId_.size(); i3++) {
                codedOutputStream.m91278f0(this.contextReceiverTypeId_.get(i3).intValue());
            }
            for (int i4 = 0; i4 < this.annotation_.size(); i4++) {
                codedOutputStream.m91280h0(14, this.annotation_.get(i4));
            }
            for (int i5 = 0; i5 < this.getterAnnotation_.size(); i5++) {
                codedOutputStream.m91280h0(15, this.getterAnnotation_.get(i5));
            }
            for (int i6 = 0; i6 < this.setterAnnotation_.size(); i6++) {
                codedOutputStream.m91280h0(16, this.setterAnnotation_.get(i6));
            }
            for (int i7 = 0; i7 < this.contextParameter_.size(); i7++) {
                codedOutputStream.m91280h0(17, this.contextParameter_.get(i7));
            }
            for (int i8 = 0; i8 < this.versionRequirement_.size(); i8++) {
                codedOutputStream.m91277e0(31, this.versionRequirement_.get(i8).intValue());
            }
            for (int i9 = 0; i9 < this.compilerPluginData_.size(); i9++) {
                codedOutputStream.m91280h0(32, this.compilerPluginData_.get(i9));
            }
            for (int i10 = 0; i10 < this.extensionReceiverAnnotation_.size(); i10++) {
                codedOutputStream.m91280h0(33, this.extensionReceiverAnnotation_.get(i10));
            }
            for (int i11 = 0; i11 < this.backingFieldAnnotation_.size(); i11++) {
                codedOutputStream.m91280h0(34, this.backingFieldAnnotation_.get(i11));
            }
            for (int i12 = 0; i12 < this.delegateFieldAnnotation_.size(); i12++) {
                codedOutputStream.m91280h0(35, this.delegateFieldAnnotation_.get(i12));
            }
            extensionWriterNewExtensionWriter.m91338a(19000, codedOutputStream);
            codedOutputStream.m91285m0(this.unknownFields);
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableMessage, kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite
        public Property getDefaultInstanceForType() {
            return defaultInstance;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableMessage, kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public Builder newBuilderForType() {
            return newBuilder();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableMessage, kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public Builder toBuilder() {
            return newBuilder(this);
        }

        public static Builder newBuilder() {
            return Builder.m90676t();
        }

        private Property(GeneratedMessageLite.ExtendableBuilder<Property, ?> extendableBuilder) {
            super(extendableBuilder);
            this.contextReceiverTypeIdMemoizedSerializedSize = -1;
            this.memoizedIsInitialized = (byte) -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = extendableBuilder.m91332e();
        }

        private Property(boolean z) {
            this.contextReceiverTypeIdMemoizedSerializedSize = -1;
            this.memoizedIsInitialized = (byte) -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = ByteString.f65615a;
        }
    }

    public static final class StringTable extends GeneratedMessageLite implements StringTableOrBuilder {
        public static Parser<StringTable> PARSER = new C15260a();
        private static final StringTable defaultInstance;
        private byte memoizedIsInitialized;
        private int memoizedSerializedSize;
        private LazyStringList string_;
        private final ByteString unknownFields;

        public static final class Builder extends GeneratedMessageLite.Builder<StringTable, Builder> implements StringTableOrBuilder {

            /* JADX INFO: renamed from: b */
            public int f65260b;

            /* JADX INFO: renamed from: c */
            public LazyStringList f65261c = LazyStringArrayList.f65678b;

            private Builder() {
                m90727q();
            }

            /* JADX INFO: renamed from: o */
            public static Builder m90726o() {
                return new Builder();
            }

            /* JADX INFO: renamed from: q */
            private void m90727q() {
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
            public StringTable build() {
                StringTable stringTableM90729m = m90729m();
                if (stringTableM90729m.isInitialized()) {
                    return stringTableM90729m;
                }
                throw AbstractMessageLite.Builder.m91133c(stringTableM90729m);
            }

            /* JADX INFO: renamed from: m */
            public StringTable m90729m() {
                StringTable stringTable = new StringTable(this);
                if ((this.f65260b & 1) == 1) {
                    this.f65261c = this.f65261c.mo91363m();
                    this.f65260b &= -2;
                }
                stringTable.string_ = this.f65261c;
                return stringTable;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder
            /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
            public Builder mo90523m() {
                return m90726o().mo90458f(m90729m());
            }

            /* JADX INFO: renamed from: p */
            public final void m90731p() {
                if ((this.f65260b & 1) != 1) {
                    this.f65261c = new LazyStringArrayList(this.f65261c);
                    this.f65260b |= 1;
                }
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder
            /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
            public Builder mo90458f(StringTable stringTable) {
                if (stringTable == StringTable.getDefaultInstance()) {
                    return this;
                }
                if (!stringTable.string_.isEmpty()) {
                    if (this.f65261c.isEmpty()) {
                        this.f65261c = stringTable.string_;
                        this.f65260b &= -2;
                    } else {
                        m90731p();
                        this.f65261c.addAll(stringTable.string_);
                    }
                }
                m91333j(m91332e().m91156c(stringTable.unknownFields));
                return this;
            }

            /* JADX WARN: Code duplicated, block: B:15:0x001d  */
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
            public Builder mo90459i(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws Throwable {
                StringTable stringTable = null;
                try {
                    try {
                        StringTable stringTableMo90487d = StringTable.PARSER.mo90487d(codedInputStream, extensionRegistryLite);
                        if (stringTableMo90487d != null) {
                            mo90458f(stringTableMo90487d);
                        }
                        return this;
                    } catch (InvalidProtocolBufferException e) {
                        StringTable stringTable2 = (StringTable) e.getUnfinishedMessage();
                        try {
                            throw e;
                        } catch (Throwable th) {
                            th = th;
                            stringTable = stringTable2;
                            if (stringTable != null) {
                                mo90458f(stringTable);
                            }
                            throw th;
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                    if (stringTable != null) {
                        mo90458f(stringTable);
                    }
                    throw th;
                }
            }
        }

        /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$StringTable$a */
        public static class C15260a extends AbstractParser<StringTable> {
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.Parser
            /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
            public StringTable mo90487d(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return new StringTable(codedInputStream, extensionRegistryLite);
            }
        }

        static {
            StringTable stringTable = new StringTable(true);
            defaultInstance = stringTable;
            stringTable.initFields();
        }

        private StringTable(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            this.memoizedIsInitialized = (byte) -1;
            this.memoizedSerializedSize = -1;
            initFields();
            ByteString.Output outputM91150w = ByteString.m91150w();
            CodedOutputStream codedOutputStreamM91226K = CodedOutputStream.m91226K(outputM91150w, 1);
            boolean z = false;
            boolean z2 = false;
            while (!z) {
                try {
                    try {
                        try {
                            int iM91185K = codedInputStream.m91185K();
                            if (iM91185K != 0) {
                                if (iM91185K == 10) {
                                    ByteString byteStringM91202l = codedInputStream.m91202l();
                                    if (!z2) {
                                        this.string_ = new LazyStringArrayList();
                                        z2 = true;
                                    }
                                    this.string_.mo91358S(byteStringM91202l);
                                } else if (!parseUnknownField(codedInputStream, codedOutputStreamM91226K, extensionRegistryLite, iM91185K)) {
                                }
                            }
                            z = true;
                        } catch (InvalidProtocolBufferException e) {
                            throw e.setUnfinishedMessage(this);
                        }
                    } catch (IOException e2) {
                        throw new InvalidProtocolBufferException(e2.getMessage()).setUnfinishedMessage(this);
                    }
                } catch (Throwable th) {
                    if (z2) {
                        this.string_ = this.string_.mo91363m();
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
            if (z2) {
                this.string_ = this.string_.mo91363m();
            }
            try {
                codedOutputStreamM91226K.m91258J();
            } catch (IOException unused2) {
            } finally {
                this.unknownFields = outputM91150w.m91170m();
            }
            makeExtensionsImmutable();
        }

        public static StringTable getDefaultInstance() {
            return defaultInstance;
        }

        private void initFields() {
            this.string_ = LazyStringArrayList.f65678b;
        }

        public static Builder newBuilder(StringTable stringTable) {
            return newBuilder().mo90458f(stringTable);
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public Parser<StringTable> getParserForType() {
            return PARSER;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int iM91233f = 0;
            for (int i2 = 0; i2 < this.string_.size(); i2++) {
                iM91233f += CodedOutputStream.m91233f(this.string_.mo91357Q(i2));
            }
            int size = iM91233f + getStringList().size() + this.unknownFields.size();
            this.memoizedSerializedSize = size;
            return size;
        }

        public String getString(int i) {
            return this.string_.get(i);
        }

        public ProtocolStringList getStringList() {
            return this.string_;
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
            for (int i = 0; i < this.string_.size(); i++) {
                codedOutputStream.m91264S(1, this.string_.mo91357Q(i));
            }
            codedOutputStream.m91285m0(this.unknownFields);
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite
        public StringTable getDefaultInstanceForType() {
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
            return Builder.m90726o();
        }

        private StringTable(GeneratedMessageLite.Builder builder) {
            super(builder);
            this.memoizedIsInitialized = (byte) -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = builder.m91332e();
        }

        private StringTable(boolean z) {
            this.memoizedIsInitialized = (byte) -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = ByteString.f65615a;
        }
    }

    public static final class TypeAlias extends GeneratedMessageLite.ExtendableMessage<TypeAlias> implements TypeAliasOrBuilder {
        public static Parser<TypeAlias> PARSER = new C15264a();
        private static final TypeAlias defaultInstance;
        private List<Annotation> annotation_;
        private int bitField0_;
        private List<CompilerPluginData> compilerPluginData_;
        private int expandedTypeId_;
        private Type expandedType_;
        private int flags_;
        private byte memoizedIsInitialized;
        private int memoizedSerializedSize;
        private int name_;
        private List<TypeParameter> typeParameter_;
        private int underlyingTypeId_;
        private Type underlyingType_;
        private final ByteString unknownFields;
        private List<Integer> versionRequirement_;

        public static final class Builder extends GeneratedMessageLite.ExtendableBuilder<TypeAlias, Builder> implements TypeAliasOrBuilder {

            /* JADX INFO: renamed from: d */
            public int f65282d;

            /* JADX INFO: renamed from: e */
            public int f65283e = 6;

            /* JADX INFO: renamed from: f */
            public int f65284f;

            /* JADX INFO: renamed from: g */
            public List<TypeParameter> f65285g;

            /* JADX INFO: renamed from: h */
            public Type f65286h;

            /* JADX INFO: renamed from: i */
            public int f65287i;

            /* JADX INFO: renamed from: j */
            public Type f65288j;

            /* JADX INFO: renamed from: k */
            public int f65289k;

            /* JADX INFO: renamed from: l */
            public List<Annotation> f65290l;

            /* JADX INFO: renamed from: m */
            public List<Integer> f65291m;

            /* JADX INFO: renamed from: n */
            public List<CompilerPluginData> f65292n;

            private Builder() {
                List list = Collections.EMPTY_LIST;
                this.f65285g = list;
                this.f65286h = Type.getDefaultInstance();
                this.f65288j = Type.getDefaultInstance();
                this.f65290l = list;
                this.f65291m = list;
                this.f65292n = list;
                m90777y();
            }

            /* JADX INFO: renamed from: t */
            public static Builder m90772t() {
                return new Builder();
            }

            /* JADX INFO: renamed from: u */
            private void m90773u() {
                if ((this.f65282d & 128) != 128) {
                    this.f65290l = new ArrayList(this.f65290l);
                    this.f65282d |= 128;
                }
            }

            /* JADX INFO: renamed from: v */
            private void m90774v() {
                if ((this.f65282d & 512) != 512) {
                    this.f65292n = new ArrayList(this.f65292n);
                    this.f65282d |= 512;
                }
            }

            /* JADX INFO: renamed from: w */
            private void m90775w() {
                if ((this.f65282d & 4) != 4) {
                    this.f65285g = new ArrayList(this.f65285g);
                    this.f65282d |= 4;
                }
            }

            /* JADX INFO: renamed from: x */
            private void m90776x() {
                if ((this.f65282d & 256) != 256) {
                    this.f65291m = new ArrayList(this.f65291m);
                    this.f65282d |= 256;
                }
            }

            /* JADX INFO: renamed from: y */
            private void m90777y() {
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder
            /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
            public Builder mo90458f(TypeAlias typeAlias) {
                if (typeAlias == TypeAlias.getDefaultInstance()) {
                    return this;
                }
                if (typeAlias.hasFlags()) {
                    m90782E(typeAlias.getFlags());
                }
                if (typeAlias.hasName()) {
                    m90783G(typeAlias.getName());
                }
                if (!typeAlias.typeParameter_.isEmpty()) {
                    if (this.f65285g.isEmpty()) {
                        this.f65285g = typeAlias.typeParameter_;
                        this.f65282d &= -5;
                    } else {
                        m90775w();
                        this.f65285g.addAll(typeAlias.typeParameter_);
                    }
                }
                if (typeAlias.hasUnderlyingType()) {
                    m90780C(typeAlias.getUnderlyingType());
                }
                if (typeAlias.hasUnderlyingTypeId()) {
                    m90784K(typeAlias.getUnderlyingTypeId());
                }
                if (typeAlias.hasExpandedType()) {
                    m90788z(typeAlias.getExpandedType());
                }
                if (typeAlias.hasExpandedTypeId()) {
                    m90781D(typeAlias.getExpandedTypeId());
                }
                if (!typeAlias.annotation_.isEmpty()) {
                    if (this.f65290l.isEmpty()) {
                        this.f65290l = typeAlias.annotation_;
                        this.f65282d &= -129;
                    } else {
                        m90773u();
                        this.f65290l.addAll(typeAlias.annotation_);
                    }
                }
                if (!typeAlias.versionRequirement_.isEmpty()) {
                    if (this.f65291m.isEmpty()) {
                        this.f65291m = typeAlias.versionRequirement_;
                        this.f65282d &= -257;
                    } else {
                        m90776x();
                        this.f65291m.addAll(typeAlias.versionRequirement_);
                    }
                }
                if (!typeAlias.compilerPluginData_.isEmpty()) {
                    if (this.f65292n.isEmpty()) {
                        this.f65292n = typeAlias.compilerPluginData_;
                        this.f65282d &= -513;
                    } else {
                        m90774v();
                        this.f65292n.addAll(typeAlias.compilerPluginData_);
                    }
                }
                m91337o(typeAlias);
                m91333j(m91332e().m91156c(typeAlias.unknownFields));
                return this;
            }

            /* JADX WARN: Code duplicated, block: B:15:0x001d  */
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
            public Builder mo90459i(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws Throwable {
                TypeAlias typeAlias = null;
                try {
                    try {
                        TypeAlias typeAliasMo90487d = TypeAlias.PARSER.mo90487d(codedInputStream, extensionRegistryLite);
                        if (typeAliasMo90487d != null) {
                            mo90458f(typeAliasMo90487d);
                        }
                        return this;
                    } catch (InvalidProtocolBufferException e) {
                        TypeAlias typeAlias2 = (TypeAlias) e.getUnfinishedMessage();
                        try {
                            throw e;
                        } catch (Throwable th) {
                            th = th;
                            typeAlias = typeAlias2;
                            if (typeAlias != null) {
                                mo90458f(typeAlias);
                            }
                            throw th;
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                    if (typeAlias != null) {
                        mo90458f(typeAlias);
                    }
                    throw th;
                }
            }

            /* JADX INFO: renamed from: C */
            public Builder m90780C(Type type) {
                if ((this.f65282d & 8) != 8 || this.f65286h == Type.getDefaultInstance()) {
                    this.f65286h = type;
                } else {
                    this.f65286h = Type.newBuilder(this.f65286h).mo90458f(type).m90764r();
                }
                this.f65282d |= 8;
                return this;
            }

            /* JADX INFO: renamed from: D */
            public Builder m90781D(int i) {
                this.f65282d |= 64;
                this.f65289k = i;
                return this;
            }

            /* JADX INFO: renamed from: E */
            public Builder m90782E(int i) {
                this.f65282d |= 1;
                this.f65283e = i;
                return this;
            }

            /* JADX INFO: renamed from: G */
            public Builder m90783G(int i) {
                this.f65282d |= 2;
                this.f65284f = i;
                return this;
            }

            /* JADX INFO: renamed from: K */
            public Builder m90784K(int i) {
                this.f65282d |= 16;
                this.f65287i = i;
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
            public TypeAlias build() {
                TypeAlias typeAliasM90786r = m90786r();
                if (typeAliasM90786r.isInitialized()) {
                    return typeAliasM90786r;
                }
                throw AbstractMessageLite.Builder.m91133c(typeAliasM90786r);
            }

            /* JADX INFO: renamed from: r */
            public TypeAlias m90786r() {
                TypeAlias typeAlias = new TypeAlias(this);
                int i = this.f65282d;
                int i2 = (i & 1) != 1 ? 0 : 1;
                typeAlias.flags_ = this.f65283e;
                if ((i & 2) == 2) {
                    i2 |= 2;
                }
                typeAlias.name_ = this.f65284f;
                if ((this.f65282d & 4) == 4) {
                    this.f65285g = Collections.unmodifiableList(this.f65285g);
                    this.f65282d &= -5;
                }
                typeAlias.typeParameter_ = this.f65285g;
                if ((i & 8) == 8) {
                    i2 |= 4;
                }
                typeAlias.underlyingType_ = this.f65286h;
                if ((i & 16) == 16) {
                    i2 |= 8;
                }
                typeAlias.underlyingTypeId_ = this.f65287i;
                if ((i & 32) == 32) {
                    i2 |= 16;
                }
                typeAlias.expandedType_ = this.f65288j;
                if ((i & 64) == 64) {
                    i2 |= 32;
                }
                typeAlias.expandedTypeId_ = this.f65289k;
                if ((this.f65282d & 128) == 128) {
                    this.f65290l = Collections.unmodifiableList(this.f65290l);
                    this.f65282d &= -129;
                }
                typeAlias.annotation_ = this.f65290l;
                if ((this.f65282d & 256) == 256) {
                    this.f65291m = Collections.unmodifiableList(this.f65291m);
                    this.f65282d &= -257;
                }
                typeAlias.versionRequirement_ = this.f65291m;
                if ((this.f65282d & 512) == 512) {
                    this.f65292n = Collections.unmodifiableList(this.f65292n);
                    this.f65282d &= -513;
                }
                typeAlias.compilerPluginData_ = this.f65292n;
                typeAlias.bitField0_ = i2;
                return typeAlias;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableBuilder
            /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
            public Builder mo90523m() {
                return m90772t().mo90458f(m90786r());
            }

            /* JADX INFO: renamed from: z */
            public Builder m90788z(Type type) {
                if ((this.f65282d & 32) != 32 || this.f65288j == Type.getDefaultInstance()) {
                    this.f65288j = type;
                } else {
                    this.f65288j = Type.newBuilder(this.f65288j).mo90458f(type).m90764r();
                }
                this.f65282d |= 32;
                return this;
            }
        }

        /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$TypeAlias$a */
        public static class C15264a extends AbstractParser<TypeAlias> {
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.Parser
            /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
            public TypeAlias mo90487d(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return new TypeAlias(codedInputStream, extensionRegistryLite);
            }
        }

        static {
            TypeAlias typeAlias = new TypeAlias(true);
            defaultInstance = typeAlias;
            typeAlias.initFields();
        }

        private TypeAlias(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            Type.Builder builder;
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
                        switch (iM91185K) {
                            case 0:
                                break;
                            case 8:
                                this.bitField0_ |= 1;
                                this.flags_ = codedInputStream.m91209s();
                                continue;
                            case 16:
                                this.bitField0_ |= 2;
                                this.name_ = codedInputStream.m91209s();
                                continue;
                            case 26:
                                if ((i & 4) != 4) {
                                    this.typeParameter_ = new ArrayList();
                                    i |= 4;
                                }
                                this.typeParameter_.add((TypeParameter) codedInputStream.m91211u(TypeParameter.PARSER, extensionRegistryLite));
                                continue;
                            case 34:
                                builder = (this.bitField0_ & 4) == 4 ? this.underlyingType_.toBuilder() : null;
                                Type type = (Type) codedInputStream.m91211u(Type.PARSER, extensionRegistryLite);
                                this.underlyingType_ = type;
                                if (builder != null) {
                                    builder.mo90458f(type);
                                    this.underlyingType_ = builder.m90764r();
                                }
                                this.bitField0_ |= 4;
                                continue;
                            case 40:
                                this.bitField0_ |= 8;
                                this.underlyingTypeId_ = codedInputStream.m91209s();
                                continue;
                            case 50:
                                builder = (this.bitField0_ & 16) == 16 ? this.expandedType_.toBuilder() : null;
                                Type type2 = (Type) codedInputStream.m91211u(Type.PARSER, extensionRegistryLite);
                                this.expandedType_ = type2;
                                if (builder != null) {
                                    builder.mo90458f(type2);
                                    this.expandedType_ = builder.m90764r();
                                }
                                this.bitField0_ |= 16;
                                continue;
                            case 56:
                                this.bitField0_ |= 32;
                                this.expandedTypeId_ = codedInputStream.m91209s();
                                continue;
                            case 66:
                                if ((i & 128) != 128) {
                                    this.annotation_ = new ArrayList();
                                    i |= 128;
                                }
                                this.annotation_.add((Annotation) codedInputStream.m91211u(Annotation.PARSER, extensionRegistryLite));
                                continue;
                            case 248:
                                if ((i & 256) != 256) {
                                    this.versionRequirement_ = new ArrayList();
                                    i |= 256;
                                }
                                this.versionRequirement_.add(Integer.valueOf(codedInputStream.m91209s()));
                                continue;
                            case 250:
                                int iM91200j = codedInputStream.m91200j(codedInputStream.m91176A());
                                if ((i & 256) != 256 && codedInputStream.m91197e() > 0) {
                                    this.versionRequirement_ = new ArrayList();
                                    i |= 256;
                                }
                                while (codedInputStream.m91197e() > 0) {
                                    this.versionRequirement_.add(Integer.valueOf(codedInputStream.m91209s()));
                                }
                                codedInputStream.m91199i(iM91200j);
                                continue;
                            case 258:
                                if ((i & 512) != 512) {
                                    this.compilerPluginData_ = new ArrayList();
                                    i |= 512;
                                }
                                this.compilerPluginData_.add((CompilerPluginData) codedInputStream.m91211u(CompilerPluginData.PARSER, extensionRegistryLite));
                                continue;
                            default:
                                if (!parseUnknownField(codedInputStream, codedOutputStreamM91226K, extensionRegistryLite, iM91185K)) {
                                    break;
                                }
                                break;
                        }
                        z = true;
                    } catch (Throwable th) {
                        if ((i & 4) == 4) {
                            this.typeParameter_ = Collections.unmodifiableList(this.typeParameter_);
                        }
                        if ((i & 128) == 128) {
                            this.annotation_ = Collections.unmodifiableList(this.annotation_);
                        }
                        if ((i & 256) == 256) {
                            this.versionRequirement_ = Collections.unmodifiableList(this.versionRequirement_);
                        }
                        if ((i & 512) == 512) {
                            this.compilerPluginData_ = Collections.unmodifiableList(this.compilerPluginData_);
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
            if ((i & 4) == 4) {
                this.typeParameter_ = Collections.unmodifiableList(this.typeParameter_);
            }
            if ((i & 128) == 128) {
                this.annotation_ = Collections.unmodifiableList(this.annotation_);
            }
            if ((i & 256) == 256) {
                this.versionRequirement_ = Collections.unmodifiableList(this.versionRequirement_);
            }
            if ((i & 512) == 512) {
                this.compilerPluginData_ = Collections.unmodifiableList(this.compilerPluginData_);
            }
            try {
                codedOutputStreamM91226K.m91258J();
            } catch (IOException unused2) {
            } finally {
                this.unknownFields = outputM91150w.m91170m();
            }
            makeExtensionsImmutable();
        }

        public static TypeAlias getDefaultInstance() {
            return defaultInstance;
        }

        private void initFields() {
            this.flags_ = 6;
            this.name_ = 0;
            List list = Collections.EMPTY_LIST;
            this.typeParameter_ = list;
            this.underlyingType_ = Type.getDefaultInstance();
            this.underlyingTypeId_ = 0;
            this.expandedType_ = Type.getDefaultInstance();
            this.expandedTypeId_ = 0;
            this.annotation_ = list;
            this.versionRequirement_ = list;
            this.compilerPluginData_ = list;
        }

        public static Builder newBuilder(TypeAlias typeAlias) {
            return newBuilder().mo90458f(typeAlias);
        }

        public static TypeAlias parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return PARSER.mo91134a(inputStream, extensionRegistryLite);
        }

        public Annotation getAnnotation(int i) {
            return this.annotation_.get(i);
        }

        public int getAnnotationCount() {
            return this.annotation_.size();
        }

        public List<Annotation> getAnnotationList() {
            return this.annotation_;
        }

        public CompilerPluginData getCompilerPluginData(int i) {
            return this.compilerPluginData_.get(i);
        }

        public int getCompilerPluginDataCount() {
            return this.compilerPluginData_.size();
        }

        public Type getExpandedType() {
            return this.expandedType_;
        }

        public int getExpandedTypeId() {
            return this.expandedTypeId_;
        }

        public int getFlags() {
            return this.flags_;
        }

        public int getName() {
            return this.name_;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public Parser<TypeAlias> getParserForType() {
            return PARSER;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableMessage, kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int iM91243p = (this.bitField0_ & 1) == 1 ? CodedOutputStream.m91243p(1, this.flags_) : 0;
            if ((this.bitField0_ & 2) == 2) {
                iM91243p += CodedOutputStream.m91243p(2, this.name_);
            }
            for (int i2 = 0; i2 < this.typeParameter_.size(); i2++) {
                iM91243p += CodedOutputStream.m91247t(3, this.typeParameter_.get(i2));
            }
            if ((this.bitField0_ & 4) == 4) {
                iM91243p += CodedOutputStream.m91247t(4, this.underlyingType_);
            }
            if ((this.bitField0_ & 8) == 8) {
                iM91243p += CodedOutputStream.m91243p(5, this.underlyingTypeId_);
            }
            if ((this.bitField0_ & 16) == 16) {
                iM91243p += CodedOutputStream.m91247t(6, this.expandedType_);
            }
            if ((this.bitField0_ & 32) == 32) {
                iM91243p += CodedOutputStream.m91243p(7, this.expandedTypeId_);
            }
            for (int i3 = 0; i3 < this.annotation_.size(); i3++) {
                iM91243p += CodedOutputStream.m91247t(8, this.annotation_.get(i3));
            }
            int iM91244q = 0;
            for (int i4 = 0; i4 < this.versionRequirement_.size(); i4++) {
                iM91244q += CodedOutputStream.m91244q(this.versionRequirement_.get(i4).intValue());
            }
            int size = iM91243p + iM91244q + (getVersionRequirementList().size() * 2);
            for (int i5 = 0; i5 < this.compilerPluginData_.size(); i5++) {
                size += CodedOutputStream.m91247t(32, this.compilerPluginData_.get(i5));
            }
            int iExtensionsSerializedSize = size + extensionsSerializedSize() + this.unknownFields.size();
            this.memoizedSerializedSize = iExtensionsSerializedSize;
            return iExtensionsSerializedSize;
        }

        public TypeParameter getTypeParameter(int i) {
            return this.typeParameter_.get(i);
        }

        public int getTypeParameterCount() {
            return this.typeParameter_.size();
        }

        public List<TypeParameter> getTypeParameterList() {
            return this.typeParameter_;
        }

        public Type getUnderlyingType() {
            return this.underlyingType_;
        }

        public int getUnderlyingTypeId() {
            return this.underlyingTypeId_;
        }

        public List<Integer> getVersionRequirementList() {
            return this.versionRequirement_;
        }

        public boolean hasExpandedType() {
            return (this.bitField0_ & 16) == 16;
        }

        public boolean hasExpandedTypeId() {
            return (this.bitField0_ & 32) == 32;
        }

        public boolean hasFlags() {
            return (this.bitField0_ & 1) == 1;
        }

        public boolean hasName() {
            return (this.bitField0_ & 2) == 2;
        }

        public boolean hasUnderlyingType() {
            return (this.bitField0_ & 4) == 4;
        }

        public boolean hasUnderlyingTypeId() {
            return (this.bitField0_ & 8) == 8;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableMessage, kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            byte b = this.memoizedIsInitialized;
            if (b == 1) {
                return true;
            }
            if (b == 0) {
                return false;
            }
            if (!hasName()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            for (int i = 0; i < getTypeParameterCount(); i++) {
                if (!getTypeParameter(i).isInitialized()) {
                    this.memoizedIsInitialized = (byte) 0;
                    return false;
                }
            }
            if (hasUnderlyingType() && !getUnderlyingType().isInitialized()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (hasExpandedType() && !getExpandedType().isInitialized()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            for (int i2 = 0; i2 < getAnnotationCount(); i2++) {
                if (!getAnnotation(i2).isInitialized()) {
                    this.memoizedIsInitialized = (byte) 0;
                    return false;
                }
            }
            for (int i3 = 0; i3 < getCompilerPluginDataCount(); i3++) {
                if (!getCompilerPluginData(i3).isInitialized()) {
                    this.memoizedIsInitialized = (byte) 0;
                    return false;
                }
            }
            if (extensionsAreInitialized()) {
                this.memoizedIsInitialized = (byte) 1;
                return true;
            }
            this.memoizedIsInitialized = (byte) 0;
            return false;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableMessage, kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            getSerializedSize();
            GeneratedMessageLite.ExtendableMessage<MessageType>.ExtensionWriter extensionWriterNewExtensionWriter = newExtensionWriter();
            if ((this.bitField0_ & 1) == 1) {
                codedOutputStream.m91277e0(1, this.flags_);
            }
            if ((this.bitField0_ & 2) == 2) {
                codedOutputStream.m91277e0(2, this.name_);
            }
            for (int i = 0; i < this.typeParameter_.size(); i++) {
                codedOutputStream.m91280h0(3, this.typeParameter_.get(i));
            }
            if ((this.bitField0_ & 4) == 4) {
                codedOutputStream.m91280h0(4, this.underlyingType_);
            }
            if ((this.bitField0_ & 8) == 8) {
                codedOutputStream.m91277e0(5, this.underlyingTypeId_);
            }
            if ((this.bitField0_ & 16) == 16) {
                codedOutputStream.m91280h0(6, this.expandedType_);
            }
            if ((this.bitField0_ & 32) == 32) {
                codedOutputStream.m91277e0(7, this.expandedTypeId_);
            }
            for (int i2 = 0; i2 < this.annotation_.size(); i2++) {
                codedOutputStream.m91280h0(8, this.annotation_.get(i2));
            }
            for (int i3 = 0; i3 < this.versionRequirement_.size(); i3++) {
                codedOutputStream.m91277e0(31, this.versionRequirement_.get(i3).intValue());
            }
            for (int i4 = 0; i4 < this.compilerPluginData_.size(); i4++) {
                codedOutputStream.m91280h0(32, this.compilerPluginData_.get(i4));
            }
            extensionWriterNewExtensionWriter.m91338a(200, codedOutputStream);
            codedOutputStream.m91285m0(this.unknownFields);
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableMessage, kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite
        public TypeAlias getDefaultInstanceForType() {
            return defaultInstance;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableMessage, kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public Builder newBuilderForType() {
            return newBuilder();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableMessage, kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public Builder toBuilder() {
            return newBuilder(this);
        }

        public static Builder newBuilder() {
            return Builder.m90772t();
        }

        private TypeAlias(GeneratedMessageLite.ExtendableBuilder<TypeAlias, ?> extendableBuilder) {
            super(extendableBuilder);
            this.memoizedIsInitialized = (byte) -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = extendableBuilder.m91332e();
        }

        private TypeAlias(boolean z) {
            this.memoizedIsInitialized = (byte) -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = ByteString.f65615a;
        }
    }

    public static final class TypeParameter extends GeneratedMessageLite.ExtendableMessage<TypeParameter> implements TypeParameterOrBuilder {
        public static Parser<TypeParameter> PARSER = new C15266a();
        private static final TypeParameter defaultInstance;
        private int bitField0_;
        private int id_;
        private byte memoizedIsInitialized;
        private int memoizedSerializedSize;
        private int name_;
        private boolean reified_;
        private final ByteString unknownFields;
        private int upperBoundIdMemoizedSerializedSize;
        private List<Integer> upperBoundId_;
        private List<Type> upperBound_;
        private Variance variance_;

        public static final class Builder extends GeneratedMessageLite.ExtendableBuilder<TypeParameter, Builder> implements TypeParameterOrBuilder {

            /* JADX INFO: renamed from: d */
            public int f65293d;

            /* JADX INFO: renamed from: e */
            public int f65294e;

            /* JADX INFO: renamed from: f */
            public int f65295f;

            /* JADX INFO: renamed from: g */
            public boolean f65296g;

            /* JADX INFO: renamed from: h */
            public Variance f65297h = Variance.INV;

            /* JADX INFO: renamed from: i */
            public List<Type> f65298i;

            /* JADX INFO: renamed from: j */
            public List<Integer> f65299j;

            private Builder() {
                List list = Collections.EMPTY_LIST;
                this.f65298i = list;
                this.f65299j = list;
                m90792w();
            }

            /* JADX INFO: renamed from: t */
            public static Builder m90791t() {
                return new Builder();
            }

            /* JADX INFO: renamed from: w */
            private void m90792w() {
            }

            /* JADX INFO: renamed from: A */
            public Builder m90793A(int i) {
                this.f65293d |= 2;
                this.f65295f = i;
                return this;
            }

            /* JADX INFO: renamed from: B */
            public Builder m90794B(boolean z) {
                this.f65293d |= 4;
                this.f65296g = z;
                return this;
            }

            /* JADX INFO: renamed from: C */
            public Builder m90795C(Variance variance) {
                variance.getClass();
                this.f65293d |= 8;
                this.f65297h = variance;
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
            public TypeParameter build() {
                TypeParameter typeParameterM90797r = m90797r();
                if (typeParameterM90797r.isInitialized()) {
                    return typeParameterM90797r;
                }
                throw AbstractMessageLite.Builder.m91133c(typeParameterM90797r);
            }

            /* JADX INFO: renamed from: r */
            public TypeParameter m90797r() {
                TypeParameter typeParameter = new TypeParameter(this);
                int i = this.f65293d;
                int i2 = (i & 1) != 1 ? 0 : 1;
                typeParameter.id_ = this.f65294e;
                if ((i & 2) == 2) {
                    i2 |= 2;
                }
                typeParameter.name_ = this.f65295f;
                if ((i & 4) == 4) {
                    i2 |= 4;
                }
                typeParameter.reified_ = this.f65296g;
                if ((i & 8) == 8) {
                    i2 |= 8;
                }
                typeParameter.variance_ = this.f65297h;
                if ((this.f65293d & 16) == 16) {
                    this.f65298i = Collections.unmodifiableList(this.f65298i);
                    this.f65293d &= -17;
                }
                typeParameter.upperBound_ = this.f65298i;
                if ((this.f65293d & 32) == 32) {
                    this.f65299j = Collections.unmodifiableList(this.f65299j);
                    this.f65293d &= -33;
                }
                typeParameter.upperBoundId_ = this.f65299j;
                typeParameter.bitField0_ = i2;
                return typeParameter;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableBuilder
            /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
            public Builder mo90523m() {
                return m90791t().mo90458f(m90797r());
            }

            /* JADX INFO: renamed from: u */
            public final void m90799u() {
                if ((this.f65293d & 32) != 32) {
                    this.f65299j = new ArrayList(this.f65299j);
                    this.f65293d |= 32;
                }
            }

            /* JADX INFO: renamed from: v */
            public final void m90800v() {
                if ((this.f65293d & 16) != 16) {
                    this.f65298i = new ArrayList(this.f65298i);
                    this.f65293d |= 16;
                }
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder
            /* JADX INFO: renamed from: x, reason: merged with bridge method [inline-methods] */
            public Builder mo90458f(TypeParameter typeParameter) {
                if (typeParameter == TypeParameter.getDefaultInstance()) {
                    return this;
                }
                if (typeParameter.hasId()) {
                    m90803z(typeParameter.getId());
                }
                if (typeParameter.hasName()) {
                    m90793A(typeParameter.getName());
                }
                if (typeParameter.hasReified()) {
                    m90794B(typeParameter.getReified());
                }
                if (typeParameter.hasVariance()) {
                    m90795C(typeParameter.getVariance());
                }
                if (!typeParameter.upperBound_.isEmpty()) {
                    if (this.f65298i.isEmpty()) {
                        this.f65298i = typeParameter.upperBound_;
                        this.f65293d &= -17;
                    } else {
                        m90800v();
                        this.f65298i.addAll(typeParameter.upperBound_);
                    }
                }
                if (!typeParameter.upperBoundId_.isEmpty()) {
                    if (this.f65299j.isEmpty()) {
                        this.f65299j = typeParameter.upperBoundId_;
                        this.f65293d &= -33;
                    } else {
                        m90799u();
                        this.f65299j.addAll(typeParameter.upperBoundId_);
                    }
                }
                m91337o(typeParameter);
                m91333j(m91332e().m91156c(typeParameter.unknownFields));
                return this;
            }

            /* JADX WARN: Code duplicated, block: B:15:0x001d  */
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
            public Builder mo90459i(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws Throwable {
                TypeParameter typeParameter = null;
                try {
                    try {
                        TypeParameter typeParameterMo90487d = TypeParameter.PARSER.mo90487d(codedInputStream, extensionRegistryLite);
                        if (typeParameterMo90487d != null) {
                            mo90458f(typeParameterMo90487d);
                        }
                        return this;
                    } catch (InvalidProtocolBufferException e) {
                        TypeParameter typeParameter2 = (TypeParameter) e.getUnfinishedMessage();
                        try {
                            throw e;
                        } catch (Throwable th) {
                            th = th;
                            typeParameter = typeParameter2;
                            if (typeParameter != null) {
                                mo90458f(typeParameter);
                            }
                            throw th;
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                    if (typeParameter != null) {
                        mo90458f(typeParameter);
                    }
                    throw th;
                }
            }

            /* JADX INFO: renamed from: z */
            public Builder m90803z(int i) {
                this.f65293d |= 1;
                this.f65294e = i;
                return this;
            }
        }

        public enum Variance implements Internal.EnumLite {
            IN(0, 0),
            OUT(1, 1),
            INV(2, 2);

            private static Internal.EnumLiteMap<Variance> internalValueMap = new C15265a();
            private final int value;

            /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$TypeParameter$Variance$a */
            public static class C15265a implements Internal.EnumLiteMap<Variance> {
                @Override // kotlin.reflect.jvm.internal.impl.protobuf.Internal.EnumLiteMap
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public Variance findValueByNumber(int i) {
                    return Variance.valueOf(i);
                }
            }

            Variance(int i, int i2) {
                this.value = i2;
            }

            public static Variance valueOf(int i) {
                if (i == 0) {
                    return IN;
                }
                if (i == 1) {
                    return OUT;
                }
                if (i != 2) {
                    return null;
                }
                return INV;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.Internal.EnumLite
            public final int getNumber() {
                return this.value;
            }
        }

        /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$TypeParameter$a */
        public static class C15266a extends AbstractParser<TypeParameter> {
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.Parser
            /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
            public TypeParameter mo90487d(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return new TypeParameter(codedInputStream, extensionRegistryLite);
            }
        }

        static {
            TypeParameter typeParameter = new TypeParameter(true);
            defaultInstance = typeParameter;
            typeParameter.initFields();
        }

        private TypeParameter(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            this.upperBoundIdMemoizedSerializedSize = -1;
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
                                this.id_ = codedInputStream.m91209s();
                            } else if (iM91185K == 16) {
                                this.bitField0_ |= 2;
                                this.name_ = codedInputStream.m91209s();
                            } else if (iM91185K == 24) {
                                this.bitField0_ |= 4;
                                this.reified_ = codedInputStream.m91201k();
                            } else if (iM91185K == 32) {
                                int iM91204n = codedInputStream.m91204n();
                                Variance varianceValueOf = Variance.valueOf(iM91204n);
                                if (varianceValueOf == null) {
                                    codedOutputStreamM91226K.m91291s0(iM91185K);
                                    codedOutputStreamM91226K.m91291s0(iM91204n);
                                } else {
                                    this.bitField0_ |= 8;
                                    this.variance_ = varianceValueOf;
                                }
                            } else if (iM91185K == 42) {
                                if ((i & 16) != 16) {
                                    this.upperBound_ = new ArrayList();
                                    i |= 16;
                                }
                                this.upperBound_.add((Type) codedInputStream.m91211u(Type.PARSER, extensionRegistryLite));
                            } else if (iM91185K == 48) {
                                if ((i & 32) != 32) {
                                    this.upperBoundId_ = new ArrayList();
                                    i |= 32;
                                }
                                this.upperBoundId_.add(Integer.valueOf(codedInputStream.m91209s()));
                            } else if (iM91185K == 50) {
                                int iM91200j = codedInputStream.m91200j(codedInputStream.m91176A());
                                if ((i & 32) != 32 && codedInputStream.m91197e() > 0) {
                                    this.upperBoundId_ = new ArrayList();
                                    i |= 32;
                                }
                                while (codedInputStream.m91197e() > 0) {
                                    this.upperBoundId_.add(Integer.valueOf(codedInputStream.m91209s()));
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
                    if ((i & 16) == 16) {
                        this.upperBound_ = Collections.unmodifiableList(this.upperBound_);
                    }
                    if ((i & 32) == 32) {
                        this.upperBoundId_ = Collections.unmodifiableList(this.upperBoundId_);
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
            if ((i & 16) == 16) {
                this.upperBound_ = Collections.unmodifiableList(this.upperBound_);
            }
            if ((i & 32) == 32) {
                this.upperBoundId_ = Collections.unmodifiableList(this.upperBoundId_);
            }
            try {
                codedOutputStreamM91226K.m91258J();
            } catch (IOException unused2) {
            } finally {
                this.unknownFields = outputM91150w.m91170m();
            }
            makeExtensionsImmutable();
        }

        public static TypeParameter getDefaultInstance() {
            return defaultInstance;
        }

        private void initFields() {
            this.id_ = 0;
            this.name_ = 0;
            this.reified_ = false;
            this.variance_ = Variance.INV;
            List list = Collections.EMPTY_LIST;
            this.upperBound_ = list;
            this.upperBoundId_ = list;
        }

        public static Builder newBuilder(TypeParameter typeParameter) {
            return newBuilder().mo90458f(typeParameter);
        }

        public int getId() {
            return this.id_;
        }

        public int getName() {
            return this.name_;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public Parser<TypeParameter> getParserForType() {
            return PARSER;
        }

        public boolean getReified() {
            return this.reified_;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableMessage, kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int iM91243p = (this.bitField0_ & 1) == 1 ? CodedOutputStream.m91243p(1, this.id_) : 0;
            if ((this.bitField0_ & 2) == 2) {
                iM91243p += CodedOutputStream.m91243p(2, this.name_);
            }
            if ((this.bitField0_ & 4) == 4) {
                iM91243p += CodedOutputStream.m91229b(3, this.reified_);
            }
            if ((this.bitField0_ & 8) == 8) {
                iM91243p += CodedOutputStream.m91236i(4, this.variance_.getNumber());
            }
            for (int i2 = 0; i2 < this.upperBound_.size(); i2++) {
                iM91243p += CodedOutputStream.m91247t(5, this.upperBound_.get(i2));
            }
            int iM91244q = 0;
            for (int i3 = 0; i3 < this.upperBoundId_.size(); i3++) {
                iM91244q += CodedOutputStream.m91244q(this.upperBoundId_.get(i3).intValue());
            }
            int iM91244q2 = iM91243p + iM91244q;
            if (!getUpperBoundIdList().isEmpty()) {
                iM91244q2 = iM91244q2 + 1 + CodedOutputStream.m91244q(iM91244q);
            }
            this.upperBoundIdMemoizedSerializedSize = iM91244q;
            int iExtensionsSerializedSize = iM91244q2 + extensionsSerializedSize() + this.unknownFields.size();
            this.memoizedSerializedSize = iExtensionsSerializedSize;
            return iExtensionsSerializedSize;
        }

        public Type getUpperBound(int i) {
            return this.upperBound_.get(i);
        }

        public int getUpperBoundCount() {
            return this.upperBound_.size();
        }

        public List<Integer> getUpperBoundIdList() {
            return this.upperBoundId_;
        }

        public List<Type> getUpperBoundList() {
            return this.upperBound_;
        }

        public Variance getVariance() {
            return this.variance_;
        }

        public boolean hasId() {
            return (this.bitField0_ & 1) == 1;
        }

        public boolean hasName() {
            return (this.bitField0_ & 2) == 2;
        }

        public boolean hasReified() {
            return (this.bitField0_ & 4) == 4;
        }

        public boolean hasVariance() {
            return (this.bitField0_ & 8) == 8;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableMessage, kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            byte b = this.memoizedIsInitialized;
            if (b == 1) {
                return true;
            }
            if (b == 0) {
                return false;
            }
            if (!hasId()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (!hasName()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            for (int i = 0; i < getUpperBoundCount(); i++) {
                if (!getUpperBound(i).isInitialized()) {
                    this.memoizedIsInitialized = (byte) 0;
                    return false;
                }
            }
            if (extensionsAreInitialized()) {
                this.memoizedIsInitialized = (byte) 1;
                return true;
            }
            this.memoizedIsInitialized = (byte) 0;
            return false;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableMessage, kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            getSerializedSize();
            GeneratedMessageLite.ExtendableMessage<MessageType>.ExtensionWriter extensionWriterNewExtensionWriter = newExtensionWriter();
            if ((this.bitField0_ & 1) == 1) {
                codedOutputStream.m91277e0(1, this.id_);
            }
            if ((this.bitField0_ & 2) == 2) {
                codedOutputStream.m91277e0(2, this.name_);
            }
            if ((this.bitField0_ & 4) == 4) {
                codedOutputStream.m91261P(3, this.reified_);
            }
            if ((this.bitField0_ & 8) == 8) {
                codedOutputStream.m91268W(4, this.variance_.getNumber());
            }
            for (int i = 0; i < this.upperBound_.size(); i++) {
                codedOutputStream.m91280h0(5, this.upperBound_.get(i));
            }
            if (getUpperBoundIdList().size() > 0) {
                codedOutputStream.m91291s0(50);
                codedOutputStream.m91291s0(this.upperBoundIdMemoizedSerializedSize);
            }
            for (int i2 = 0; i2 < this.upperBoundId_.size(); i2++) {
                codedOutputStream.m91278f0(this.upperBoundId_.get(i2).intValue());
            }
            extensionWriterNewExtensionWriter.m91338a(1000, codedOutputStream);
            codedOutputStream.m91285m0(this.unknownFields);
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableMessage, kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite
        public TypeParameter getDefaultInstanceForType() {
            return defaultInstance;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableMessage, kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public Builder newBuilderForType() {
            return newBuilder();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableMessage, kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public Builder toBuilder() {
            return newBuilder(this);
        }

        public static Builder newBuilder() {
            return Builder.m90791t();
        }

        private TypeParameter(GeneratedMessageLite.ExtendableBuilder<TypeParameter, ?> extendableBuilder) {
            super(extendableBuilder);
            this.upperBoundIdMemoizedSerializedSize = -1;
            this.memoizedIsInitialized = (byte) -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = extendableBuilder.m91332e();
        }

        private TypeParameter(boolean z) {
            this.upperBoundIdMemoizedSerializedSize = -1;
            this.memoizedIsInitialized = (byte) -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = ByteString.f65615a;
        }
    }

    public static final class TypeTable extends GeneratedMessageLite implements TypeTableOrBuilder {
        public static Parser<TypeTable> PARSER = new C15267a();
        private static final TypeTable defaultInstance;
        private int bitField0_;
        private int firstNullable_;
        private byte memoizedIsInitialized;
        private int memoizedSerializedSize;
        private List<Type> type_;
        private final ByteString unknownFields;

        public static final class Builder extends GeneratedMessageLite.Builder<TypeTable, Builder> implements TypeTableOrBuilder {

            /* JADX INFO: renamed from: b */
            public int f65301b;

            /* JADX INFO: renamed from: c */
            public List<Type> f65302c = Collections.EMPTY_LIST;

            /* JADX INFO: renamed from: d */
            public int f65303d = -1;

            private Builder() {
                m90808q();
            }

            /* JADX INFO: renamed from: o */
            public static Builder m90807o() {
                return new Builder();
            }

            /* JADX INFO: renamed from: q */
            private void m90808q() {
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
            public TypeTable build() {
                TypeTable typeTableM90810m = m90810m();
                if (typeTableM90810m.isInitialized()) {
                    return typeTableM90810m;
                }
                throw AbstractMessageLite.Builder.m91133c(typeTableM90810m);
            }

            /* JADX INFO: renamed from: m */
            public TypeTable m90810m() {
                TypeTable typeTable = new TypeTable(this);
                int i = this.f65301b;
                if ((i & 1) == 1) {
                    this.f65302c = Collections.unmodifiableList(this.f65302c);
                    this.f65301b &= -2;
                }
                typeTable.type_ = this.f65302c;
                int i2 = (i & 2) != 2 ? 0 : 1;
                typeTable.firstNullable_ = this.f65303d;
                typeTable.bitField0_ = i2;
                return typeTable;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder
            /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
            public Builder mo90523m() {
                return m90807o().mo90458f(m90810m());
            }

            /* JADX INFO: renamed from: p */
            public final void m90812p() {
                if ((this.f65301b & 1) != 1) {
                    this.f65302c = new ArrayList(this.f65302c);
                    this.f65301b |= 1;
                }
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder
            /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
            public Builder mo90458f(TypeTable typeTable) {
                if (typeTable == TypeTable.getDefaultInstance()) {
                    return this;
                }
                if (!typeTable.type_.isEmpty()) {
                    if (this.f65302c.isEmpty()) {
                        this.f65302c = typeTable.type_;
                        this.f65301b &= -2;
                    } else {
                        m90812p();
                        this.f65302c.addAll(typeTable.type_);
                    }
                }
                if (typeTable.hasFirstNullable()) {
                    m90815t(typeTable.getFirstNullable());
                }
                m91333j(m91332e().m91156c(typeTable.unknownFields));
                return this;
            }

            /* JADX WARN: Code duplicated, block: B:15:0x001d  */
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
            public Builder mo90459i(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws Throwable {
                TypeTable typeTable = null;
                try {
                    try {
                        TypeTable typeTableMo90487d = TypeTable.PARSER.mo90487d(codedInputStream, extensionRegistryLite);
                        if (typeTableMo90487d != null) {
                            mo90458f(typeTableMo90487d);
                        }
                        return this;
                    } catch (InvalidProtocolBufferException e) {
                        TypeTable typeTable2 = (TypeTable) e.getUnfinishedMessage();
                        try {
                            throw e;
                        } catch (Throwable th) {
                            th = th;
                            typeTable = typeTable2;
                            if (typeTable != null) {
                                mo90458f(typeTable);
                            }
                            throw th;
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                    if (typeTable != null) {
                        mo90458f(typeTable);
                    }
                    throw th;
                }
            }

            /* JADX INFO: renamed from: t */
            public Builder m90815t(int i) {
                this.f65301b |= 2;
                this.f65303d = i;
                return this;
            }
        }

        /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$TypeTable$a */
        public static class C15267a extends AbstractParser<TypeTable> {
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.Parser
            /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
            public TypeTable mo90487d(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return new TypeTable(codedInputStream, extensionRegistryLite);
            }
        }

        static {
            TypeTable typeTable = new TypeTable(true);
            defaultInstance = typeTable;
            typeTable.initFields();
        }

        private TypeTable(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            this.memoizedIsInitialized = (byte) -1;
            this.memoizedSerializedSize = -1;
            initFields();
            ByteString.Output outputM91150w = ByteString.m91150w();
            CodedOutputStream codedOutputStreamM91226K = CodedOutputStream.m91226K(outputM91150w, 1);
            boolean z = false;
            boolean z2 = false;
            while (!z) {
                try {
                    try {
                        int iM91185K = codedInputStream.m91185K();
                        if (iM91185K != 0) {
                            if (iM91185K == 10) {
                                if (!z2) {
                                    this.type_ = new ArrayList();
                                    z2 = true;
                                }
                                this.type_.add((Type) codedInputStream.m91211u(Type.PARSER, extensionRegistryLite));
                            } else if (iM91185K == 16) {
                                this.bitField0_ |= 1;
                                this.firstNullable_ = codedInputStream.m91209s();
                            } else if (!parseUnknownField(codedInputStream, codedOutputStreamM91226K, extensionRegistryLite, iM91185K)) {
                            }
                        }
                        z = true;
                    } catch (Throwable th) {
                        if (z2) {
                            this.type_ = Collections.unmodifiableList(this.type_);
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
            if (z2) {
                this.type_ = Collections.unmodifiableList(this.type_);
            }
            try {
                codedOutputStreamM91226K.m91258J();
            } catch (IOException unused2) {
            } finally {
                this.unknownFields = outputM91150w.m91170m();
            }
            makeExtensionsImmutable();
        }

        public static TypeTable getDefaultInstance() {
            return defaultInstance;
        }

        private void initFields() {
            this.type_ = Collections.EMPTY_LIST;
            this.firstNullable_ = -1;
        }

        public static Builder newBuilder(TypeTable typeTable) {
            return newBuilder().mo90458f(typeTable);
        }

        public int getFirstNullable() {
            return this.firstNullable_;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public Parser<TypeTable> getParserForType() {
            return PARSER;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int iM91243p = 0;
            for (int i2 = 0; i2 < this.type_.size(); i2++) {
                iM91243p += CodedOutputStream.m91247t(1, this.type_.get(i2));
            }
            if ((this.bitField0_ & 1) == 1) {
                iM91243p += CodedOutputStream.m91243p(2, this.firstNullable_);
            }
            int size = iM91243p + this.unknownFields.size();
            this.memoizedSerializedSize = size;
            return size;
        }

        public Type getType(int i) {
            return this.type_.get(i);
        }

        public int getTypeCount() {
            return this.type_.size();
        }

        public List<Type> getTypeList() {
            return this.type_;
        }

        public boolean hasFirstNullable() {
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
            for (int i = 0; i < getTypeCount(); i++) {
                if (!getType(i).isInitialized()) {
                    this.memoizedIsInitialized = (byte) 0;
                    return false;
                }
            }
            this.memoizedIsInitialized = (byte) 1;
            return true;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            getSerializedSize();
            for (int i = 0; i < this.type_.size(); i++) {
                codedOutputStream.m91280h0(1, this.type_.get(i));
            }
            if ((this.bitField0_ & 1) == 1) {
                codedOutputStream.m91277e0(2, this.firstNullable_);
            }
            codedOutputStream.m91285m0(this.unknownFields);
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite
        public TypeTable getDefaultInstanceForType() {
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
            return Builder.m90807o();
        }

        private TypeTable(GeneratedMessageLite.Builder builder) {
            super(builder);
            this.memoizedIsInitialized = (byte) -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = builder.m91332e();
        }

        private TypeTable(boolean z) {
            this.memoizedIsInitialized = (byte) -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = ByteString.f65615a;
        }
    }

    public static final class ValueParameter extends GeneratedMessageLite.ExtendableMessage<ValueParameter> implements ValueParameterOrBuilder {
        public static Parser<ValueParameter> PARSER = new C15268a();
        private static final ValueParameter defaultInstance;
        private Annotation.Argument.Value annotationParameterDefaultValue_;
        private List<Annotation> annotation_;
        private int bitField0_;
        private int flags_;
        private byte memoizedIsInitialized;
        private int memoizedSerializedSize;
        private int name_;
        private int typeId_;
        private Type type_;
        private final ByteString unknownFields;
        private int varargElementTypeId_;
        private Type varargElementType_;

        public static final class Builder extends GeneratedMessageLite.ExtendableBuilder<ValueParameter, Builder> implements ValueParameterOrBuilder {

            /* JADX INFO: renamed from: d */
            public int f65304d;

            /* JADX INFO: renamed from: e */
            public int f65305e;

            /* JADX INFO: renamed from: f */
            public int f65306f;

            /* JADX INFO: renamed from: h */
            public int f65308h;

            /* JADX INFO: renamed from: j */
            public int f65310j;

            /* JADX INFO: renamed from: g */
            public Type f65307g = Type.getDefaultInstance();

            /* JADX INFO: renamed from: i */
            public Type f65309i = Type.getDefaultInstance();

            /* JADX INFO: renamed from: k */
            public List<Annotation> f65311k = Collections.EMPTY_LIST;

            /* JADX INFO: renamed from: l */
            public Annotation.Argument.Value f65312l = Annotation.Argument.Value.getDefaultInstance();

            private Builder() {
                m90820v();
            }

            /* JADX INFO: renamed from: t */
            public static Builder m90818t() {
                return new Builder();
            }

            /* JADX INFO: renamed from: u */
            private void m90819u() {
                if ((this.f65304d & 64) != 64) {
                    this.f65311k = new ArrayList(this.f65311k);
                    this.f65304d |= 64;
                }
            }

            /* JADX INFO: renamed from: v */
            private void m90820v() {
            }

            /* JADX INFO: renamed from: A */
            public Builder m90821A(Type type) {
                if ((this.f65304d & 16) != 16 || this.f65309i == Type.getDefaultInstance()) {
                    this.f65309i = type;
                } else {
                    this.f65309i = Type.newBuilder(this.f65309i).mo90458f(type).m90764r();
                }
                this.f65304d |= 16;
                return this;
            }

            /* JADX INFO: renamed from: B */
            public Builder m90822B(int i) {
                this.f65304d |= 1;
                this.f65305e = i;
                return this;
            }

            /* JADX INFO: renamed from: C */
            public Builder m90823C(int i) {
                this.f65304d |= 2;
                this.f65306f = i;
                return this;
            }

            /* JADX INFO: renamed from: D */
            public Builder m90824D(int i) {
                this.f65304d |= 8;
                this.f65308h = i;
                return this;
            }

            /* JADX INFO: renamed from: E */
            public Builder m90825E(int i) {
                this.f65304d |= 32;
                this.f65310j = i;
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
            public ValueParameter build() {
                ValueParameter valueParameterM90827r = m90827r();
                if (valueParameterM90827r.isInitialized()) {
                    return valueParameterM90827r;
                }
                throw AbstractMessageLite.Builder.m91133c(valueParameterM90827r);
            }

            /* JADX INFO: renamed from: r */
            public ValueParameter m90827r() {
                ValueParameter valueParameter = new ValueParameter(this);
                int i = this.f65304d;
                int i2 = (i & 1) != 1 ? 0 : 1;
                valueParameter.flags_ = this.f65305e;
                if ((i & 2) == 2) {
                    i2 |= 2;
                }
                valueParameter.name_ = this.f65306f;
                if ((i & 4) == 4) {
                    i2 |= 4;
                }
                valueParameter.type_ = this.f65307g;
                if ((i & 8) == 8) {
                    i2 |= 8;
                }
                valueParameter.typeId_ = this.f65308h;
                if ((i & 16) == 16) {
                    i2 |= 16;
                }
                valueParameter.varargElementType_ = this.f65309i;
                if ((i & 32) == 32) {
                    i2 |= 32;
                }
                valueParameter.varargElementTypeId_ = this.f65310j;
                if ((this.f65304d & 64) == 64) {
                    this.f65311k = Collections.unmodifiableList(this.f65311k);
                    this.f65304d &= -65;
                }
                valueParameter.annotation_ = this.f65311k;
                if ((i & 128) == 128) {
                    i2 |= 64;
                }
                valueParameter.annotationParameterDefaultValue_ = this.f65312l;
                valueParameter.bitField0_ = i2;
                return valueParameter;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableBuilder
            /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
            public Builder mo90523m() {
                return m90818t().mo90458f(m90827r());
            }

            /* JADX INFO: renamed from: w */
            public Builder m90829w(Annotation.Argument.Value value) {
                if ((this.f65304d & 128) != 128 || this.f65312l == Annotation.Argument.Value.getDefaultInstance()) {
                    this.f65312l = value;
                } else {
                    this.f65312l = Annotation.Argument.Value.newBuilder(this.f65312l).mo90458f(value).m90473m();
                }
                this.f65304d |= 128;
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder
            /* JADX INFO: renamed from: x, reason: merged with bridge method [inline-methods] */
            public Builder mo90458f(ValueParameter valueParameter) {
                if (valueParameter == ValueParameter.getDefaultInstance()) {
                    return this;
                }
                if (valueParameter.hasFlags()) {
                    m90822B(valueParameter.getFlags());
                }
                if (valueParameter.hasName()) {
                    m90823C(valueParameter.getName());
                }
                if (valueParameter.hasType()) {
                    m90832z(valueParameter.getType());
                }
                if (valueParameter.hasTypeId()) {
                    m90824D(valueParameter.getTypeId());
                }
                if (valueParameter.hasVarargElementType()) {
                    m90821A(valueParameter.getVarargElementType());
                }
                if (valueParameter.hasVarargElementTypeId()) {
                    m90825E(valueParameter.getVarargElementTypeId());
                }
                if (!valueParameter.annotation_.isEmpty()) {
                    if (this.f65311k.isEmpty()) {
                        this.f65311k = valueParameter.annotation_;
                        this.f65304d &= -65;
                    } else {
                        m90819u();
                        this.f65311k.addAll(valueParameter.annotation_);
                    }
                }
                if (valueParameter.hasAnnotationParameterDefaultValue()) {
                    m90829w(valueParameter.getAnnotationParameterDefaultValue());
                }
                m91337o(valueParameter);
                m91333j(m91332e().m91156c(valueParameter.unknownFields));
                return this;
            }

            /* JADX WARN: Code duplicated, block: B:15:0x001d  */
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
            public Builder mo90459i(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws Throwable {
                ValueParameter valueParameter = null;
                try {
                    try {
                        ValueParameter valueParameterMo90487d = ValueParameter.PARSER.mo90487d(codedInputStream, extensionRegistryLite);
                        if (valueParameterMo90487d != null) {
                            mo90458f(valueParameterMo90487d);
                        }
                        return this;
                    } catch (InvalidProtocolBufferException e) {
                        ValueParameter valueParameter2 = (ValueParameter) e.getUnfinishedMessage();
                        try {
                            throw e;
                        } catch (Throwable th) {
                            th = th;
                            valueParameter = valueParameter2;
                            if (valueParameter != null) {
                                mo90458f(valueParameter);
                            }
                            throw th;
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                    if (valueParameter != null) {
                        mo90458f(valueParameter);
                    }
                    throw th;
                }
            }

            /* JADX INFO: renamed from: z */
            public Builder m90832z(Type type) {
                if ((this.f65304d & 4) != 4 || this.f65307g == Type.getDefaultInstance()) {
                    this.f65307g = type;
                } else {
                    this.f65307g = Type.newBuilder(this.f65307g).mo90458f(type).m90764r();
                }
                this.f65304d |= 4;
                return this;
            }
        }

        /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$ValueParameter$a */
        public static class C15268a extends AbstractParser<ValueParameter> {
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.Parser
            /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
            public ValueParameter mo90487d(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return new ValueParameter(codedInputStream, extensionRegistryLite);
            }
        }

        static {
            ValueParameter valueParameter = new ValueParameter(true);
            defaultInstance = valueParameter;
            valueParameter.initFields();
        }

        private ValueParameter(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            this.memoizedIsInitialized = (byte) -1;
            this.memoizedSerializedSize = -1;
            initFields();
            ByteString.Output outputM91150w = ByteString.m91150w();
            CodedOutputStream codedOutputStreamM91226K = CodedOutputStream.m91226K(outputM91150w, 1);
            boolean z = false;
            char c = 0;
            while (!z) {
                try {
                    try {
                        int iM91185K = codedInputStream.m91185K();
                        if (iM91185K != 0) {
                            if (iM91185K == 8) {
                                this.bitField0_ |= 1;
                                this.flags_ = codedInputStream.m91209s();
                            } else if (iM91185K != 16) {
                                if (iM91185K == 26) {
                                    Type.Builder builder = (this.bitField0_ & 4) == 4 ? this.type_.toBuilder() : null;
                                    Type type = (Type) codedInputStream.m91211u(Type.PARSER, extensionRegistryLite);
                                    this.type_ = type;
                                    if (builder != null) {
                                        builder.mo90458f(type);
                                        this.type_ = builder.m90764r();
                                    }
                                    this.bitField0_ |= 4;
                                } else if (iM91185K == 34) {
                                    Type.Builder builder2 = (this.bitField0_ & 16) == 16 ? this.varargElementType_.toBuilder() : null;
                                    Type type2 = (Type) codedInputStream.m91211u(Type.PARSER, extensionRegistryLite);
                                    this.varargElementType_ = type2;
                                    if (builder2 != null) {
                                        builder2.mo90458f(type2);
                                        this.varargElementType_ = builder2.m90764r();
                                    }
                                    this.bitField0_ |= 16;
                                } else if (iM91185K == 40) {
                                    this.bitField0_ |= 8;
                                    this.typeId_ = codedInputStream.m91209s();
                                } else if (iM91185K == 48) {
                                    this.bitField0_ |= 32;
                                    this.varargElementTypeId_ = codedInputStream.m91209s();
                                } else if (iM91185K == 58) {
                                    int i = (c == true ? 1 : 0) & '@';
                                    c = c;
                                    if (i != 64) {
                                        this.annotation_ = new ArrayList();
                                        c = '@';
                                    }
                                    this.annotation_.add((Annotation) codedInputStream.m91211u(Annotation.PARSER, extensionRegistryLite));
                                } else if (iM91185K == 66) {
                                    Annotation.Argument.Value.Builder builder3 = (this.bitField0_ & 64) == 64 ? this.annotationParameterDefaultValue_.toBuilder() : null;
                                    Annotation.Argument.Value value = (Annotation.Argument.Value) codedInputStream.m91211u(Annotation.Argument.Value.PARSER, extensionRegistryLite);
                                    this.annotationParameterDefaultValue_ = value;
                                    if (builder3 != null) {
                                        builder3.mo90458f(value);
                                        this.annotationParameterDefaultValue_ = builder3.m90473m();
                                    }
                                    this.bitField0_ |= 64;
                                } else if (!parseUnknownField(codedInputStream, codedOutputStreamM91226K, extensionRegistryLite, iM91185K)) {
                                }
                            } else {
                                this.bitField0_ |= 2;
                                this.name_ = codedInputStream.m91209s();
                            }
                        }
                        z = true;
                    } catch (Throwable th) {
                        if (((c == true ? 1 : 0) & '@') == 64) {
                            this.annotation_ = Collections.unmodifiableList(this.annotation_);
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
            if (((c == true ? 1 : 0) & '@') == 64) {
                this.annotation_ = Collections.unmodifiableList(this.annotation_);
            }
            try {
                codedOutputStreamM91226K.m91258J();
            } catch (IOException unused2) {
            } finally {
                this.unknownFields = outputM91150w.m91170m();
            }
            makeExtensionsImmutable();
        }

        public static ValueParameter getDefaultInstance() {
            return defaultInstance;
        }

        private void initFields() {
            this.flags_ = 0;
            this.name_ = 0;
            this.type_ = Type.getDefaultInstance();
            this.typeId_ = 0;
            this.varargElementType_ = Type.getDefaultInstance();
            this.varargElementTypeId_ = 0;
            this.annotation_ = Collections.EMPTY_LIST;
            this.annotationParameterDefaultValue_ = Annotation.Argument.Value.getDefaultInstance();
        }

        public static Builder newBuilder(ValueParameter valueParameter) {
            return newBuilder().mo90458f(valueParameter);
        }

        public Annotation getAnnotation(int i) {
            return this.annotation_.get(i);
        }

        public int getAnnotationCount() {
            return this.annotation_.size();
        }

        public List<Annotation> getAnnotationList() {
            return this.annotation_;
        }

        public Annotation.Argument.Value getAnnotationParameterDefaultValue() {
            return this.annotationParameterDefaultValue_;
        }

        public int getFlags() {
            return this.flags_;
        }

        public int getName() {
            return this.name_;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public Parser<ValueParameter> getParserForType() {
            return PARSER;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableMessage, kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int iM91243p = (this.bitField0_ & 1) == 1 ? CodedOutputStream.m91243p(1, this.flags_) : 0;
            if ((this.bitField0_ & 2) == 2) {
                iM91243p += CodedOutputStream.m91243p(2, this.name_);
            }
            if ((this.bitField0_ & 4) == 4) {
                iM91243p += CodedOutputStream.m91247t(3, this.type_);
            }
            if ((this.bitField0_ & 16) == 16) {
                iM91243p += CodedOutputStream.m91247t(4, this.varargElementType_);
            }
            if ((this.bitField0_ & 8) == 8) {
                iM91243p += CodedOutputStream.m91243p(5, this.typeId_);
            }
            if ((this.bitField0_ & 32) == 32) {
                iM91243p += CodedOutputStream.m91243p(6, this.varargElementTypeId_);
            }
            for (int i2 = 0; i2 < this.annotation_.size(); i2++) {
                iM91243p += CodedOutputStream.m91247t(7, this.annotation_.get(i2));
            }
            if ((this.bitField0_ & 64) == 64) {
                iM91243p += CodedOutputStream.m91247t(8, this.annotationParameterDefaultValue_);
            }
            int iExtensionsSerializedSize = iM91243p + extensionsSerializedSize() + this.unknownFields.size();
            this.memoizedSerializedSize = iExtensionsSerializedSize;
            return iExtensionsSerializedSize;
        }

        public Type getType() {
            return this.type_;
        }

        public int getTypeId() {
            return this.typeId_;
        }

        public Type getVarargElementType() {
            return this.varargElementType_;
        }

        public int getVarargElementTypeId() {
            return this.varargElementTypeId_;
        }

        public boolean hasAnnotationParameterDefaultValue() {
            return (this.bitField0_ & 64) == 64;
        }

        public boolean hasFlags() {
            return (this.bitField0_ & 1) == 1;
        }

        public boolean hasName() {
            return (this.bitField0_ & 2) == 2;
        }

        public boolean hasType() {
            return (this.bitField0_ & 4) == 4;
        }

        public boolean hasTypeId() {
            return (this.bitField0_ & 8) == 8;
        }

        public boolean hasVarargElementType() {
            return (this.bitField0_ & 16) == 16;
        }

        public boolean hasVarargElementTypeId() {
            return (this.bitField0_ & 32) == 32;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableMessage, kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            byte b = this.memoizedIsInitialized;
            if (b == 1) {
                return true;
            }
            if (b == 0) {
                return false;
            }
            if (!hasName()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (hasType() && !getType().isInitialized()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (hasVarargElementType() && !getVarargElementType().isInitialized()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            for (int i = 0; i < getAnnotationCount(); i++) {
                if (!getAnnotation(i).isInitialized()) {
                    this.memoizedIsInitialized = (byte) 0;
                    return false;
                }
            }
            if (hasAnnotationParameterDefaultValue() && !getAnnotationParameterDefaultValue().isInitialized()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (extensionsAreInitialized()) {
                this.memoizedIsInitialized = (byte) 1;
                return true;
            }
            this.memoizedIsInitialized = (byte) 0;
            return false;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableMessage, kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            getSerializedSize();
            GeneratedMessageLite.ExtendableMessage<MessageType>.ExtensionWriter extensionWriterNewExtensionWriter = newExtensionWriter();
            if ((this.bitField0_ & 1) == 1) {
                codedOutputStream.m91277e0(1, this.flags_);
            }
            if ((this.bitField0_ & 2) == 2) {
                codedOutputStream.m91277e0(2, this.name_);
            }
            if ((this.bitField0_ & 4) == 4) {
                codedOutputStream.m91280h0(3, this.type_);
            }
            if ((this.bitField0_ & 16) == 16) {
                codedOutputStream.m91280h0(4, this.varargElementType_);
            }
            if ((this.bitField0_ & 8) == 8) {
                codedOutputStream.m91277e0(5, this.typeId_);
            }
            if ((this.bitField0_ & 32) == 32) {
                codedOutputStream.m91277e0(6, this.varargElementTypeId_);
            }
            for (int i = 0; i < this.annotation_.size(); i++) {
                codedOutputStream.m91280h0(7, this.annotation_.get(i));
            }
            if ((this.bitField0_ & 64) == 64) {
                codedOutputStream.m91280h0(8, this.annotationParameterDefaultValue_);
            }
            extensionWriterNewExtensionWriter.m91338a(200, codedOutputStream);
            codedOutputStream.m91285m0(this.unknownFields);
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableMessage, kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite
        public ValueParameter getDefaultInstanceForType() {
            return defaultInstance;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableMessage, kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public Builder newBuilderForType() {
            return newBuilder();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableMessage, kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public Builder toBuilder() {
            return newBuilder(this);
        }

        public static Builder newBuilder() {
            return Builder.m90818t();
        }

        private ValueParameter(GeneratedMessageLite.ExtendableBuilder<ValueParameter, ?> extendableBuilder) {
            super(extendableBuilder);
            this.memoizedIsInitialized = (byte) -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = extendableBuilder.m91332e();
        }

        private ValueParameter(boolean z) {
            this.memoizedIsInitialized = (byte) -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = ByteString.f65615a;
        }
    }

    public static final class VersionRequirement extends GeneratedMessageLite implements VersionRequirementOrBuilder {
        public static Parser<VersionRequirement> PARSER = new C15271a();
        private static final VersionRequirement defaultInstance;
        private int bitField0_;
        private int errorCode_;
        private Level level_;
        private byte memoizedIsInitialized;
        private int memoizedSerializedSize;
        private int message_;
        private final ByteString unknownFields;
        private int versionFull_;
        private VersionKind versionKind_;
        private int version_;

        public static final class Builder extends GeneratedMessageLite.Builder<VersionRequirement, Builder> implements VersionRequirementOrBuilder {

            /* JADX INFO: renamed from: b */
            public int f65313b;

            /* JADX INFO: renamed from: c */
            public int f65314c;

            /* JADX INFO: renamed from: d */
            public int f65315d;

            /* JADX INFO: renamed from: f */
            public int f65317f;

            /* JADX INFO: renamed from: g */
            public int f65318g;

            /* JADX INFO: renamed from: e */
            public Level f65316e = Level.ERROR;

            /* JADX INFO: renamed from: h */
            public VersionKind f65319h = VersionKind.LANGUAGE_VERSION;

            private Builder() {
                m90836p();
            }

            /* JADX INFO: renamed from: o */
            public static Builder m90835o() {
                return new Builder();
            }

            /* JADX INFO: renamed from: p */
            private void m90836p() {
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
            public VersionRequirement build() {
                VersionRequirement versionRequirementM90838m = m90838m();
                if (versionRequirementM90838m.isInitialized()) {
                    return versionRequirementM90838m;
                }
                throw AbstractMessageLite.Builder.m91133c(versionRequirementM90838m);
            }

            /* JADX INFO: renamed from: m */
            public VersionRequirement m90838m() {
                VersionRequirement versionRequirement = new VersionRequirement(this);
                int i = this.f65313b;
                int i2 = (i & 1) != 1 ? 0 : 1;
                versionRequirement.version_ = this.f65314c;
                if ((i & 2) == 2) {
                    i2 |= 2;
                }
                versionRequirement.versionFull_ = this.f65315d;
                if ((i & 4) == 4) {
                    i2 |= 4;
                }
                versionRequirement.level_ = this.f65316e;
                if ((i & 8) == 8) {
                    i2 |= 8;
                }
                versionRequirement.errorCode_ = this.f65317f;
                if ((i & 16) == 16) {
                    i2 |= 16;
                }
                versionRequirement.message_ = this.f65318g;
                if ((i & 32) == 32) {
                    i2 |= 32;
                }
                versionRequirement.versionKind_ = this.f65319h;
                versionRequirement.bitField0_ = i2;
                return versionRequirement;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder
            /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
            public Builder mo90523m() {
                return m90835o().mo90458f(m90838m());
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder
            /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
            public Builder mo90458f(VersionRequirement versionRequirement) {
                if (versionRequirement == VersionRequirement.getDefaultInstance()) {
                    return this;
                }
                if (versionRequirement.hasVersion()) {
                    m90845v(versionRequirement.getVersion());
                }
                if (versionRequirement.hasVersionFull()) {
                    m90846w(versionRequirement.getVersionFull());
                }
                if (versionRequirement.hasLevel()) {
                    m90843t(versionRequirement.getLevel());
                }
                if (versionRequirement.hasErrorCode()) {
                    m90842s(versionRequirement.getErrorCode());
                }
                if (versionRequirement.hasMessage()) {
                    m90844u(versionRequirement.getMessage());
                }
                if (versionRequirement.hasVersionKind()) {
                    m90847x(versionRequirement.getVersionKind());
                }
                m91333j(m91332e().m91156c(versionRequirement.unknownFields));
                return this;
            }

            /* JADX WARN: Code duplicated, block: B:15:0x001d  */
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
            public Builder mo90459i(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws Throwable {
                VersionRequirement versionRequirement = null;
                try {
                    try {
                        VersionRequirement versionRequirementMo90487d = VersionRequirement.PARSER.mo90487d(codedInputStream, extensionRegistryLite);
                        if (versionRequirementMo90487d != null) {
                            mo90458f(versionRequirementMo90487d);
                        }
                        return this;
                    } catch (InvalidProtocolBufferException e) {
                        VersionRequirement versionRequirement2 = (VersionRequirement) e.getUnfinishedMessage();
                        try {
                            throw e;
                        } catch (Throwable th) {
                            th = th;
                            versionRequirement = versionRequirement2;
                            if (versionRequirement != null) {
                                mo90458f(versionRequirement);
                            }
                            throw th;
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                    if (versionRequirement != null) {
                        mo90458f(versionRequirement);
                    }
                    throw th;
                }
            }

            /* JADX INFO: renamed from: s */
            public Builder m90842s(int i) {
                this.f65313b |= 8;
                this.f65317f = i;
                return this;
            }

            /* JADX INFO: renamed from: t */
            public Builder m90843t(Level level) {
                level.getClass();
                this.f65313b |= 4;
                this.f65316e = level;
                return this;
            }

            /* JADX INFO: renamed from: u */
            public Builder m90844u(int i) {
                this.f65313b |= 16;
                this.f65318g = i;
                return this;
            }

            /* JADX INFO: renamed from: v */
            public Builder m90845v(int i) {
                this.f65313b |= 1;
                this.f65314c = i;
                return this;
            }

            /* JADX INFO: renamed from: w */
            public Builder m90846w(int i) {
                this.f65313b |= 2;
                this.f65315d = i;
                return this;
            }

            /* JADX INFO: renamed from: x */
            public Builder m90847x(VersionKind versionKind) {
                versionKind.getClass();
                this.f65313b |= 32;
                this.f65319h = versionKind;
                return this;
            }
        }

        public enum Level implements Internal.EnumLite {
            WARNING(0, 0),
            ERROR(1, 1),
            HIDDEN(2, 2);

            private static Internal.EnumLiteMap<Level> internalValueMap = new C15269a();
            private final int value;

            /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$VersionRequirement$Level$a */
            public static class C15269a implements Internal.EnumLiteMap<Level> {
                @Override // kotlin.reflect.jvm.internal.impl.protobuf.Internal.EnumLiteMap
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public Level findValueByNumber(int i) {
                    return Level.valueOf(i);
                }
            }

            Level(int i, int i2) {
                this.value = i2;
            }

            public static Level valueOf(int i) {
                if (i == 0) {
                    return WARNING;
                }
                if (i == 1) {
                    return ERROR;
                }
                if (i != 2) {
                    return null;
                }
                return HIDDEN;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.Internal.EnumLite
            public final int getNumber() {
                return this.value;
            }
        }

        public enum VersionKind implements Internal.EnumLite {
            LANGUAGE_VERSION(0, 0),
            COMPILER_VERSION(1, 1),
            API_VERSION(2, 2);

            private static Internal.EnumLiteMap<VersionKind> internalValueMap = new C15270a();
            private final int value;

            /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$VersionRequirement$VersionKind$a */
            public static class C15270a implements Internal.EnumLiteMap<VersionKind> {
                @Override // kotlin.reflect.jvm.internal.impl.protobuf.Internal.EnumLiteMap
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public VersionKind findValueByNumber(int i) {
                    return VersionKind.valueOf(i);
                }
            }

            VersionKind(int i, int i2) {
                this.value = i2;
            }

            public static VersionKind valueOf(int i) {
                if (i == 0) {
                    return LANGUAGE_VERSION;
                }
                if (i == 1) {
                    return COMPILER_VERSION;
                }
                if (i != 2) {
                    return null;
                }
                return API_VERSION;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.Internal.EnumLite
            public final int getNumber() {
                return this.value;
            }
        }

        /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$VersionRequirement$a */
        public static class C15271a extends AbstractParser<VersionRequirement> {
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.Parser
            /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
            public VersionRequirement mo90487d(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return new VersionRequirement(codedInputStream, extensionRegistryLite);
            }
        }

        static {
            VersionRequirement versionRequirement = new VersionRequirement(true);
            defaultInstance = versionRequirement;
            versionRequirement.initFields();
        }

        private VersionRequirement(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
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
                                this.version_ = codedInputStream.m91209s();
                            } else if (iM91185K == 16) {
                                this.bitField0_ |= 2;
                                this.versionFull_ = codedInputStream.m91209s();
                            } else if (iM91185K == 24) {
                                int iM91204n = codedInputStream.m91204n();
                                Level levelValueOf = Level.valueOf(iM91204n);
                                if (levelValueOf == null) {
                                    codedOutputStreamM91226K.m91291s0(iM91185K);
                                    codedOutputStreamM91226K.m91291s0(iM91204n);
                                } else {
                                    this.bitField0_ |= 4;
                                    this.level_ = levelValueOf;
                                }
                            } else if (iM91185K == 32) {
                                this.bitField0_ |= 8;
                                this.errorCode_ = codedInputStream.m91209s();
                            } else if (iM91185K == 40) {
                                this.bitField0_ |= 16;
                                this.message_ = codedInputStream.m91209s();
                            } else if (iM91185K == 48) {
                                int iM91204n2 = codedInputStream.m91204n();
                                VersionKind versionKindValueOf = VersionKind.valueOf(iM91204n2);
                                if (versionKindValueOf == null) {
                                    codedOutputStreamM91226K.m91291s0(iM91185K);
                                    codedOutputStreamM91226K.m91291s0(iM91204n2);
                                } else {
                                    this.bitField0_ |= 32;
                                    this.versionKind_ = versionKindValueOf;
                                }
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

        public static VersionRequirement getDefaultInstance() {
            return defaultInstance;
        }

        private void initFields() {
            this.version_ = 0;
            this.versionFull_ = 0;
            this.level_ = Level.ERROR;
            this.errorCode_ = 0;
            this.message_ = 0;
            this.versionKind_ = VersionKind.LANGUAGE_VERSION;
        }

        public static Builder newBuilder(VersionRequirement versionRequirement) {
            return newBuilder().mo90458f(versionRequirement);
        }

        public int getErrorCode() {
            return this.errorCode_;
        }

        public Level getLevel() {
            return this.level_;
        }

        public int getMessage() {
            return this.message_;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public Parser<VersionRequirement> getParserForType() {
            return PARSER;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int iM91243p = (this.bitField0_ & 1) == 1 ? CodedOutputStream.m91243p(1, this.version_) : 0;
            if ((this.bitField0_ & 2) == 2) {
                iM91243p += CodedOutputStream.m91243p(2, this.versionFull_);
            }
            if ((this.bitField0_ & 4) == 4) {
                iM91243p += CodedOutputStream.m91236i(3, this.level_.getNumber());
            }
            if ((this.bitField0_ & 8) == 8) {
                iM91243p += CodedOutputStream.m91243p(4, this.errorCode_);
            }
            if ((this.bitField0_ & 16) == 16) {
                iM91243p += CodedOutputStream.m91243p(5, this.message_);
            }
            if ((this.bitField0_ & 32) == 32) {
                iM91243p += CodedOutputStream.m91236i(6, this.versionKind_.getNumber());
            }
            int size = iM91243p + this.unknownFields.size();
            this.memoizedSerializedSize = size;
            return size;
        }

        public int getVersion() {
            return this.version_;
        }

        public int getVersionFull() {
            return this.versionFull_;
        }

        public VersionKind getVersionKind() {
            return this.versionKind_;
        }

        public boolean hasErrorCode() {
            return (this.bitField0_ & 8) == 8;
        }

        public boolean hasLevel() {
            return (this.bitField0_ & 4) == 4;
        }

        public boolean hasMessage() {
            return (this.bitField0_ & 16) == 16;
        }

        public boolean hasVersion() {
            return (this.bitField0_ & 1) == 1;
        }

        public boolean hasVersionFull() {
            return (this.bitField0_ & 2) == 2;
        }

        public boolean hasVersionKind() {
            return (this.bitField0_ & 32) == 32;
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
                codedOutputStream.m91277e0(1, this.version_);
            }
            if ((this.bitField0_ & 2) == 2) {
                codedOutputStream.m91277e0(2, this.versionFull_);
            }
            if ((this.bitField0_ & 4) == 4) {
                codedOutputStream.m91268W(3, this.level_.getNumber());
            }
            if ((this.bitField0_ & 8) == 8) {
                codedOutputStream.m91277e0(4, this.errorCode_);
            }
            if ((this.bitField0_ & 16) == 16) {
                codedOutputStream.m91277e0(5, this.message_);
            }
            if ((this.bitField0_ & 32) == 32) {
                codedOutputStream.m91268W(6, this.versionKind_.getNumber());
            }
            codedOutputStream.m91285m0(this.unknownFields);
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite
        public VersionRequirement getDefaultInstanceForType() {
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
            return Builder.m90835o();
        }

        private VersionRequirement(GeneratedMessageLite.Builder builder) {
            super(builder);
            this.memoizedIsInitialized = (byte) -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = builder.m91332e();
        }

        private VersionRequirement(boolean z) {
            this.memoizedIsInitialized = (byte) -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = ByteString.f65615a;
        }
    }

    public static final class VersionRequirementTable extends GeneratedMessageLite implements VersionRequirementTableOrBuilder {
        public static Parser<VersionRequirementTable> PARSER = new C15272a();
        private static final VersionRequirementTable defaultInstance;
        private byte memoizedIsInitialized;
        private int memoizedSerializedSize;
        private List<VersionRequirement> requirement_;
        private final ByteString unknownFields;

        public static final class Builder extends GeneratedMessageLite.Builder<VersionRequirementTable, Builder> implements VersionRequirementTableOrBuilder {

            /* JADX INFO: renamed from: b */
            public int f65320b;

            /* JADX INFO: renamed from: c */
            public List<VersionRequirement> f65321c = Collections.EMPTY_LIST;

            private Builder() {
                m90853q();
            }

            /* JADX INFO: renamed from: o */
            public static Builder m90852o() {
                return new Builder();
            }

            /* JADX INFO: renamed from: q */
            private void m90853q() {
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
            public VersionRequirementTable build() {
                VersionRequirementTable versionRequirementTableM90855m = m90855m();
                if (versionRequirementTableM90855m.isInitialized()) {
                    return versionRequirementTableM90855m;
                }
                throw AbstractMessageLite.Builder.m91133c(versionRequirementTableM90855m);
            }

            /* JADX INFO: renamed from: m */
            public VersionRequirementTable m90855m() {
                VersionRequirementTable versionRequirementTable = new VersionRequirementTable(this);
                if ((this.f65320b & 1) == 1) {
                    this.f65321c = Collections.unmodifiableList(this.f65321c);
                    this.f65320b &= -2;
                }
                versionRequirementTable.requirement_ = this.f65321c;
                return versionRequirementTable;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder
            /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
            public Builder mo90523m() {
                return m90852o().mo90458f(m90855m());
            }

            /* JADX INFO: renamed from: p */
            public final void m90857p() {
                if ((this.f65320b & 1) != 1) {
                    this.f65321c = new ArrayList(this.f65321c);
                    this.f65320b |= 1;
                }
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder
            /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
            public Builder mo90458f(VersionRequirementTable versionRequirementTable) {
                if (versionRequirementTable == VersionRequirementTable.getDefaultInstance()) {
                    return this;
                }
                if (!versionRequirementTable.requirement_.isEmpty()) {
                    if (this.f65321c.isEmpty()) {
                        this.f65321c = versionRequirementTable.requirement_;
                        this.f65320b &= -2;
                    } else {
                        m90857p();
                        this.f65321c.addAll(versionRequirementTable.requirement_);
                    }
                }
                m91333j(m91332e().m91156c(versionRequirementTable.unknownFields));
                return this;
            }

            /* JADX WARN: Code duplicated, block: B:15:0x001d  */
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
            public Builder mo90459i(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws Throwable {
                VersionRequirementTable versionRequirementTable = null;
                try {
                    try {
                        VersionRequirementTable versionRequirementTableMo90487d = VersionRequirementTable.PARSER.mo90487d(codedInputStream, extensionRegistryLite);
                        if (versionRequirementTableMo90487d != null) {
                            mo90458f(versionRequirementTableMo90487d);
                        }
                        return this;
                    } catch (InvalidProtocolBufferException e) {
                        VersionRequirementTable versionRequirementTable2 = (VersionRequirementTable) e.getUnfinishedMessage();
                        try {
                            throw e;
                        } catch (Throwable th) {
                            th = th;
                            versionRequirementTable = versionRequirementTable2;
                            if (versionRequirementTable != null) {
                                mo90458f(versionRequirementTable);
                            }
                            throw th;
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                    if (versionRequirementTable != null) {
                        mo90458f(versionRequirementTable);
                    }
                    throw th;
                }
            }
        }

        /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$VersionRequirementTable$a */
        public static class C15272a extends AbstractParser<VersionRequirementTable> {
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.Parser
            /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
            public VersionRequirementTable mo90487d(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return new VersionRequirementTable(codedInputStream, extensionRegistryLite);
            }
        }

        static {
            VersionRequirementTable versionRequirementTable = new VersionRequirementTable(true);
            defaultInstance = versionRequirementTable;
            versionRequirementTable.initFields();
        }

        private VersionRequirementTable(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            this.memoizedIsInitialized = (byte) -1;
            this.memoizedSerializedSize = -1;
            initFields();
            ByteString.Output outputM91150w = ByteString.m91150w();
            CodedOutputStream codedOutputStreamM91226K = CodedOutputStream.m91226K(outputM91150w, 1);
            boolean z = false;
            boolean z2 = false;
            while (!z) {
                try {
                    try {
                        try {
                            int iM91185K = codedInputStream.m91185K();
                            if (iM91185K != 0) {
                                if (iM91185K == 10) {
                                    if (!z2) {
                                        this.requirement_ = new ArrayList();
                                        z2 = true;
                                    }
                                    this.requirement_.add((VersionRequirement) codedInputStream.m91211u(VersionRequirement.PARSER, extensionRegistryLite));
                                } else if (!parseUnknownField(codedInputStream, codedOutputStreamM91226K, extensionRegistryLite, iM91185K)) {
                                }
                            }
                            z = true;
                        } catch (InvalidProtocolBufferException e) {
                            throw e.setUnfinishedMessage(this);
                        }
                    } catch (IOException e2) {
                        throw new InvalidProtocolBufferException(e2.getMessage()).setUnfinishedMessage(this);
                    }
                } catch (Throwable th) {
                    if (z2) {
                        this.requirement_ = Collections.unmodifiableList(this.requirement_);
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
            if (z2) {
                this.requirement_ = Collections.unmodifiableList(this.requirement_);
            }
            try {
                codedOutputStreamM91226K.m91258J();
            } catch (IOException unused2) {
            } finally {
                this.unknownFields = outputM91150w.m91170m();
            }
            makeExtensionsImmutable();
        }

        public static VersionRequirementTable getDefaultInstance() {
            return defaultInstance;
        }

        private void initFields() {
            this.requirement_ = Collections.EMPTY_LIST;
        }

        public static Builder newBuilder(VersionRequirementTable versionRequirementTable) {
            return newBuilder().mo90458f(versionRequirementTable);
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public Parser<VersionRequirementTable> getParserForType() {
            return PARSER;
        }

        public int getRequirementCount() {
            return this.requirement_.size();
        }

        public List<VersionRequirement> getRequirementList() {
            return this.requirement_;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int iM91247t = 0;
            for (int i2 = 0; i2 < this.requirement_.size(); i2++) {
                iM91247t += CodedOutputStream.m91247t(1, this.requirement_.get(i2));
            }
            int size = iM91247t + this.unknownFields.size();
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
            for (int i = 0; i < this.requirement_.size(); i++) {
                codedOutputStream.m91280h0(1, this.requirement_.get(i));
            }
            codedOutputStream.m91285m0(this.unknownFields);
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite
        public VersionRequirementTable getDefaultInstanceForType() {
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
            return Builder.m90852o();
        }

        private VersionRequirementTable(GeneratedMessageLite.Builder builder) {
            super(builder);
            this.memoizedIsInitialized = (byte) -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = builder.m91332e();
        }

        private VersionRequirementTable(boolean z) {
            this.memoizedIsInitialized = (byte) -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = ByteString.f65615a;
        }
    }
}
