package kotlin.reflect.jvm.internal.impl.metadata;

import com.alibaba.fastjson.asm.Opcodes;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.p074ss.bytertc.engine.type.ErrorCode;
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

        private static Internal.EnumLiteMap<MemberKind> internalValueMap = new C15359a();
        private final int value;

        /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$MemberKind$a */
        public static class C15359a implements Internal.EnumLiteMap<MemberKind> {
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

        private static Internal.EnumLiteMap<Modality> internalValueMap = new C15360a();
        private final int value;

        /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Modality$a */
        public static class C15360a implements Internal.EnumLiteMap<Modality> {
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

        private static Internal.EnumLiteMap<Visibility> internalValueMap = new C15380a();
        private final int value;

        /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Visibility$a */
        public static class C15380a implements Internal.EnumLiteMap<Visibility> {
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
        public static Parser<Annotation> PARSER = new C15345a();
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
            public int f65820b;

            /* JADX INFO: renamed from: c */
            public int f65821c;

            /* JADX INFO: renamed from: d */
            public List<Argument> f65822d = Collections.EMPTY_LIST;

            private Builder() {
                m91383q();
            }

            /* JADX INFO: renamed from: o */
            public static Builder m91382o() {
                return new Builder();
            }

            /* JADX INFO: renamed from: q */
            private void m91383q() {
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
            public Annotation build() {
                Annotation annotationM91385m = m91385m();
                if (annotationM91385m.isInitialized()) {
                    return annotationM91385m;
                }
                throw AbstractMessageLite.Builder.m92024c(annotationM91385m);
            }

            /* JADX INFO: renamed from: m */
            public Annotation m91385m() {
                Annotation annotation = new Annotation(this);
                int i = (this.f65820b & 1) != 1 ? 0 : 1;
                annotation.id_ = this.f65821c;
                if ((this.f65820b & 2) == 2) {
                    this.f65822d = Collections.unmodifiableList(this.f65822d);
                    this.f65820b &= -3;
                }
                annotation.argument_ = this.f65822d;
                annotation.bitField0_ = i;
                return annotation;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder
            /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
            public Builder mo91414m() {
                return m91382o().mo91349f(m91385m());
            }

            /* JADX INFO: renamed from: p */
            public final void m91387p() {
                if ((this.f65820b & 2) != 2) {
                    this.f65822d = new ArrayList(this.f65822d);
                    this.f65820b |= 2;
                }
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder
            /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
            public Builder mo91349f(Annotation annotation) {
                if (annotation == Annotation.getDefaultInstance()) {
                    return this;
                }
                if (annotation.hasId()) {
                    m91390t(annotation.getId());
                }
                if (!annotation.argument_.isEmpty()) {
                    if (this.f65822d.isEmpty()) {
                        this.f65822d = annotation.argument_;
                        this.f65820b &= -3;
                    } else {
                        m91387p();
                        this.f65822d.addAll(annotation.argument_);
                    }
                }
                m92224j(m92223e().m92047c(annotation.unknownFields));
                return this;
            }

            /* JADX WARN: Code duplicated, block: B:15:0x001d  */
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
            public Builder mo91350i(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws Throwable {
                Annotation annotation = null;
                try {
                    try {
                        Annotation annotationMo91378d = Annotation.PARSER.mo91378d(codedInputStream, extensionRegistryLite);
                        if (annotationMo91378d != null) {
                            mo91349f(annotationMo91378d);
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
                                mo91349f(annotation);
                            }
                            throw th;
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                    if (annotation != null) {
                        mo91349f(annotation);
                    }
                    throw th;
                }
            }

            /* JADX INFO: renamed from: t */
            public Builder m91390t(int i) {
                this.f65820b |= 1;
                this.f65821c = i;
                return this;
            }
        }

        /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Annotation$a */
        public static class C15345a extends AbstractParser<Annotation> {
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.Parser
            /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
            public Annotation mo91378d(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
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
            ByteString.Output outputM92041w = ByteString.m92041w();
            CodedOutputStream codedOutputStreamM92117K = CodedOutputStream.m92117K(outputM92041w, 1);
            boolean z = false;
            char c = 0;
            while (!z) {
                try {
                    try {
                        int iM92076K = codedInputStream.m92076K();
                        if (iM92076K != 0) {
                            if (iM92076K == 8) {
                                this.bitField0_ |= 1;
                                this.id_ = codedInputStream.m92100s();
                            } else if (iM92076K == 18) {
                                if ((c & 2) != 2) {
                                    this.argument_ = new ArrayList();
                                    c = 2;
                                }
                                this.argument_.add((Argument) codedInputStream.m92102u(Argument.PARSER, extensionRegistryLite));
                            } else if (!parseUnknownField(codedInputStream, codedOutputStreamM92117K, extensionRegistryLite, iM92076K)) {
                            }
                        }
                        z = true;
                    } catch (Throwable th) {
                        if ((c & 2) == 2) {
                            this.argument_ = Collections.unmodifiableList(this.argument_);
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
            if ((c & 2) == 2) {
                this.argument_ = Collections.unmodifiableList(this.argument_);
            }
            try {
                codedOutputStreamM92117K.m92149J();
            } catch (IOException unused2) {
            } finally {
                this.unknownFields = outputM92041w.m92061m();
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
            return newBuilder().mo91349f(annotation);
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
            int iM92134p = (this.bitField0_ & 1) == 1 ? CodedOutputStream.m92134p(1, this.id_) : 0;
            for (int i2 = 0; i2 < this.argument_.size(); i2++) {
                iM92134p += CodedOutputStream.m92138t(2, this.argument_.get(i2));
            }
            int size = iM92134p + this.unknownFields.size();
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
                codedOutputStream.m92168e0(1, this.id_);
            }
            for (int i = 0; i < this.argument_.size(); i++) {
                codedOutputStream.m92171h0(2, this.argument_.get(i));
            }
            codedOutputStream.m92176m0(this.unknownFields);
        }

        public static final class Argument extends GeneratedMessageLite implements ArgumentOrBuilder {
            public static Parser<Argument> PARSER = new C15344a();
            private static final Argument defaultInstance;
            private int bitField0_;
            private byte memoizedIsInitialized;
            private int memoizedSerializedSize;
            private int nameId_;
            private final ByteString unknownFields;
            private Value value_;

            public static final class Builder extends GeneratedMessageLite.Builder<Argument, Builder> implements ArgumentOrBuilder {

                /* JADX INFO: renamed from: b */
                public int f65805b;

                /* JADX INFO: renamed from: c */
                public int f65806c;

                /* JADX INFO: renamed from: d */
                public Value f65807d = Value.getDefaultInstance();

                private Builder() {
                    m91345p();
                }

                /* JADX INFO: renamed from: o */
                public static Builder m91344o() {
                    return new Builder();
                }

                /* JADX INFO: renamed from: p */
                private void m91345p() {
                }

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
                /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
                public Argument build() {
                    Argument argumentM91352m = m91352m();
                    if (argumentM91352m.isInitialized()) {
                        return argumentM91352m;
                    }
                    throw AbstractMessageLite.Builder.m92024c(argumentM91352m);
                }

                /* JADX INFO: renamed from: m */
                public Argument m91352m() {
                    Argument argument = new Argument(this);
                    int i = this.f65805b;
                    int i2 = (i & 1) != 1 ? 0 : 1;
                    argument.nameId_ = this.f65806c;
                    if ((i & 2) == 2) {
                        i2 |= 2;
                    }
                    argument.value_ = this.f65807d;
                    argument.bitField0_ = i2;
                    return argument;
                }

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder
                /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
                public Builder mo91414m() {
                    return m91344o().mo91349f(m91352m());
                }

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder
                /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
                public Builder mo91349f(Argument argument) {
                    if (argument == Argument.getDefaultInstance()) {
                        return this;
                    }
                    if (argument.hasNameId()) {
                        m91357t(argument.getNameId());
                    }
                    if (argument.hasValue()) {
                        m91356s(argument.getValue());
                    }
                    m92224j(m92223e().m92047c(argument.unknownFields));
                    return this;
                }

                /* JADX WARN: Code duplicated, block: B:15:0x001d  */
                @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
                /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
                public Builder mo91350i(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws Throwable {
                    Argument argument = null;
                    try {
                        try {
                            Argument argumentMo91378d = Argument.PARSER.mo91378d(codedInputStream, extensionRegistryLite);
                            if (argumentMo91378d != null) {
                                mo91349f(argumentMo91378d);
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
                                    mo91349f(argument);
                                }
                                throw th;
                            }
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        if (argument != null) {
                            mo91349f(argument);
                        }
                        throw th;
                    }
                }

                /* JADX INFO: renamed from: s */
                public Builder m91356s(Value value) {
                    if ((this.f65805b & 2) != 2 || this.f65807d == Value.getDefaultInstance()) {
                        this.f65807d = value;
                    } else {
                        this.f65807d = Value.newBuilder(this.f65807d).mo91349f(value).m91364m();
                    }
                    this.f65805b |= 2;
                    return this;
                }

                /* JADX INFO: renamed from: t */
                public Builder m91357t(int i) {
                    this.f65805b |= 1;
                    this.f65806c = i;
                    return this;
                }
            }

            public interface ValueOrBuilder extends MessageLiteOrBuilder {
            }

            /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Annotation$Argument$a */
            public static class C15344a extends AbstractParser<Argument> {
                @Override // kotlin.reflect.jvm.internal.impl.protobuf.Parser
                /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
                public Argument mo91378d(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
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
                                    this.nameId_ = codedInputStream.m92100s();
                                } else if (iM92076K == 18) {
                                    Value.Builder builder = (this.bitField0_ & 2) == 2 ? this.value_.toBuilder() : null;
                                    Value value = (Value) codedInputStream.m92102u(Value.PARSER, extensionRegistryLite);
                                    this.value_ = value;
                                    if (builder != null) {
                                        builder.mo91349f(value);
                                        this.value_ = builder.m91364m();
                                    }
                                    this.bitField0_ |= 2;
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

            public static Argument getDefaultInstance() {
                return defaultInstance;
            }

            private void initFields() {
                this.nameId_ = 0;
                this.value_ = Value.getDefaultInstance();
            }

            public static Builder newBuilder(Argument argument) {
                return newBuilder().mo91349f(argument);
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
                int iM92134p = (this.bitField0_ & 1) == 1 ? CodedOutputStream.m92134p(1, this.nameId_) : 0;
                if ((this.bitField0_ & 2) == 2) {
                    iM92134p += CodedOutputStream.m92138t(2, this.value_);
                }
                int size = iM92134p + this.unknownFields.size();
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
                    codedOutputStream.m92168e0(1, this.nameId_);
                }
                if ((this.bitField0_ & 2) == 2) {
                    codedOutputStream.m92171h0(2, this.value_);
                }
                codedOutputStream.m92176m0(this.unknownFields);
            }

            public static final class Value extends GeneratedMessageLite implements ValueOrBuilder {
                public static Parser<Value> PARSER = new C15343a();
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
                    public int f65808b;

                    /* JADX INFO: renamed from: d */
                    public long f65810d;

                    /* JADX INFO: renamed from: e */
                    public float f65811e;

                    /* JADX INFO: renamed from: f */
                    public double f65812f;

                    /* JADX INFO: renamed from: g */
                    public int f65813g;

                    /* JADX INFO: renamed from: h */
                    public int f65814h;

                    /* JADX INFO: renamed from: i */
                    public int f65815i;

                    /* JADX INFO: renamed from: l */
                    public int f65818l;

                    /* JADX INFO: renamed from: m */
                    public int f65819m;

                    /* JADX INFO: renamed from: c */
                    public Type f65809c = Type.BYTE;

                    /* JADX INFO: renamed from: j */
                    public Annotation f65816j = Annotation.getDefaultInstance();

                    /* JADX INFO: renamed from: k */
                    public List<Value> f65817k = Collections.EMPTY_LIST;

                    private Builder() {
                        m91367q();
                    }

                    /* JADX INFO: renamed from: o */
                    public static Builder m91359o() {
                        return new Builder();
                    }

                    /* JADX INFO: renamed from: A */
                    public Builder m91360A(long j) {
                        this.f65808b |= 2;
                        this.f65810d = j;
                        return this;
                    }

                    /* JADX INFO: renamed from: B */
                    public Builder m91361B(int i) {
                        this.f65808b |= 16;
                        this.f65813g = i;
                        return this;
                    }

                    /* JADX INFO: renamed from: C */
                    public Builder m91362C(Type type) {
                        type.getClass();
                        this.f65808b |= 1;
                        this.f65809c = type;
                        return this;
                    }

                    @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
                    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
                    public Value build() {
                        Value valueM91364m = m91364m();
                        if (valueM91364m.isInitialized()) {
                            return valueM91364m;
                        }
                        throw AbstractMessageLite.Builder.m92024c(valueM91364m);
                    }

                    /* JADX INFO: renamed from: m */
                    public Value m91364m() {
                        Value value = new Value(this);
                        int i = this.f65808b;
                        int i2 = (i & 1) != 1 ? 0 : 1;
                        value.type_ = this.f65809c;
                        if ((i & 2) == 2) {
                            i2 |= 2;
                        }
                        value.intValue_ = this.f65810d;
                        if ((i & 4) == 4) {
                            i2 |= 4;
                        }
                        value.floatValue_ = this.f65811e;
                        if ((i & 8) == 8) {
                            i2 |= 8;
                        }
                        value.doubleValue_ = this.f65812f;
                        if ((i & 16) == 16) {
                            i2 |= 16;
                        }
                        value.stringValue_ = this.f65813g;
                        if ((i & 32) == 32) {
                            i2 |= 32;
                        }
                        value.classId_ = this.f65814h;
                        if ((i & 64) == 64) {
                            i2 |= 64;
                        }
                        value.enumValueId_ = this.f65815i;
                        if ((i & 128) == 128) {
                            i2 |= 128;
                        }
                        value.annotation_ = this.f65816j;
                        if ((this.f65808b & 256) == 256) {
                            this.f65817k = Collections.unmodifiableList(this.f65817k);
                            this.f65808b &= -257;
                        }
                        value.arrayElement_ = this.f65817k;
                        if ((i & 512) == 512) {
                            i2 |= 256;
                        }
                        value.arrayDimensionCount_ = this.f65818l;
                        if ((i & 1024) == 1024) {
                            i2 |= 512;
                        }
                        value.flags_ = this.f65819m;
                        value.bitField0_ = i2;
                        return value;
                    }

                    @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder
                    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
                    public Builder mo91414m() {
                        return m91359o().mo91349f(m91364m());
                    }

                    /* JADX INFO: renamed from: p */
                    public final void m91366p() {
                        if ((this.f65808b & 256) != 256) {
                            this.f65817k = new ArrayList(this.f65817k);
                            this.f65808b |= 256;
                        }
                    }

                    /* JADX INFO: renamed from: q */
                    public final void m91367q() {
                    }

                    /* JADX INFO: renamed from: r */
                    public Builder m91368r(Annotation annotation) {
                        if ((this.f65808b & 128) != 128 || this.f65816j == Annotation.getDefaultInstance()) {
                            this.f65816j = annotation;
                        } else {
                            this.f65816j = Annotation.newBuilder(this.f65816j).mo91349f(annotation).m91385m();
                        }
                        this.f65808b |= 128;
                        return this;
                    }

                    @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder
                    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
                    public Builder mo91349f(Value value) {
                        if (value == Value.getDefaultInstance()) {
                            return this;
                        }
                        if (value.hasType()) {
                            m91362C(value.getType());
                        }
                        if (value.hasIntValue()) {
                            m91360A(value.getIntValue());
                        }
                        if (value.hasFloatValue()) {
                            m91376z(value.getFloatValue());
                        }
                        if (value.hasDoubleValue()) {
                            m91373w(value.getDoubleValue());
                        }
                        if (value.hasStringValue()) {
                            m91361B(value.getStringValue());
                        }
                        if (value.hasClassId()) {
                            m91372v(value.getClassId());
                        }
                        if (value.hasEnumValueId()) {
                            m91374x(value.getEnumValueId());
                        }
                        if (value.hasAnnotation()) {
                            m91368r(value.getAnnotation());
                        }
                        if (!value.arrayElement_.isEmpty()) {
                            if (this.f65817k.isEmpty()) {
                                this.f65817k = value.arrayElement_;
                                this.f65808b &= -257;
                            } else {
                                m91366p();
                                this.f65817k.addAll(value.arrayElement_);
                            }
                        }
                        if (value.hasArrayDimensionCount()) {
                            m91371u(value.getArrayDimensionCount());
                        }
                        if (value.hasFlags()) {
                            m91375y(value.getFlags());
                        }
                        m92224j(m92223e().m92047c(value.unknownFields));
                        return this;
                    }

                    /* JADX WARN: Code duplicated, block: B:15:0x001d  */
                    @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
                    /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
                    public Builder mo91350i(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws Throwable {
                        Value value = null;
                        try {
                            try {
                                Value valueMo91378d = Value.PARSER.mo91378d(codedInputStream, extensionRegistryLite);
                                if (valueMo91378d != null) {
                                    mo91349f(valueMo91378d);
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
                                        mo91349f(value);
                                    }
                                    throw th;
                                }
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            if (value != null) {
                                mo91349f(value);
                            }
                            throw th;
                        }
                    }

                    /* JADX INFO: renamed from: u */
                    public Builder m91371u(int i) {
                        this.f65808b |= 512;
                        this.f65818l = i;
                        return this;
                    }

                    /* JADX INFO: renamed from: v */
                    public Builder m91372v(int i) {
                        this.f65808b |= 32;
                        this.f65814h = i;
                        return this;
                    }

                    /* JADX INFO: renamed from: w */
                    public Builder m91373w(double d) {
                        this.f65808b |= 8;
                        this.f65812f = d;
                        return this;
                    }

                    /* JADX INFO: renamed from: x */
                    public Builder m91374x(int i) {
                        this.f65808b |= 64;
                        this.f65815i = i;
                        return this;
                    }

                    /* JADX INFO: renamed from: y */
                    public Builder m91375y(int i) {
                        this.f65808b |= 1024;
                        this.f65819m = i;
                        return this;
                    }

                    /* JADX INFO: renamed from: z */
                    public Builder m91376z(float f) {
                        this.f65808b |= 4;
                        this.f65811e = f;
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

                    private static Internal.EnumLiteMap<Type> internalValueMap = new C15342a();
                    private final int value;

                    /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Annotation$Argument$Value$Type$a */
                    public static class C15342a implements Internal.EnumLiteMap<Type> {
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
                public static class C15343a extends AbstractParser<Value> {
                    @Override // kotlin.reflect.jvm.internal.impl.protobuf.Parser
                    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
                    public Value mo91378d(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
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
                    ByteString.Output outputM92041w = ByteString.m92041w();
                    CodedOutputStream codedOutputStreamM92117K = CodedOutputStream.m92117K(outputM92041w, 1);
                    boolean z = false;
                    char c = 0;
                    while (!z) {
                        try {
                            try {
                                int iM92076K = codedInputStream.m92076K();
                                switch (iM92076K) {
                                    case 0:
                                        break;
                                    case 8:
                                        int iM92095n = codedInputStream.m92095n();
                                        Type typeValueOf = Type.valueOf(iM92095n);
                                        if (typeValueOf == null) {
                                            codedOutputStreamM92117K.m92182s0(iM92076K);
                                            codedOutputStreamM92117K.m92182s0(iM92095n);
                                        } else {
                                            this.bitField0_ |= 1;
                                            this.type_ = typeValueOf;
                                            continue;
                                        }
                                        break;
                                    case 16:
                                        this.bitField0_ |= 2;
                                        this.intValue_ = codedInputStream.m92073H();
                                        continue;
                                    case 29:
                                        this.bitField0_ |= 4;
                                        this.floatValue_ = codedInputStream.m92098q();
                                        continue;
                                    case 33:
                                        this.bitField0_ |= 8;
                                        this.doubleValue_ = codedInputStream.m92094m();
                                        continue;
                                    case 40:
                                        this.bitField0_ |= 16;
                                        this.stringValue_ = codedInputStream.m92100s();
                                        continue;
                                    case 48:
                                        this.bitField0_ |= 32;
                                        this.classId_ = codedInputStream.m92100s();
                                        continue;
                                    case 56:
                                        this.bitField0_ |= 64;
                                        this.enumValueId_ = codedInputStream.m92100s();
                                        continue;
                                    case 66:
                                        Builder builder = (this.bitField0_ & 128) == 128 ? this.annotation_.toBuilder() : null;
                                        Annotation annotation = (Annotation) codedInputStream.m92102u(Annotation.PARSER, extensionRegistryLite);
                                        this.annotation_ = annotation;
                                        if (builder != null) {
                                            builder.mo91349f(annotation);
                                            this.annotation_ = builder.m91385m();
                                        }
                                        this.bitField0_ |= 128;
                                        continue;
                                    case 74:
                                        if ((c & 256) != 256) {
                                            this.arrayElement_ = new ArrayList();
                                            c = 256;
                                        }
                                        this.arrayElement_.add((Value) codedInputStream.m92102u(PARSER, extensionRegistryLite));
                                        continue;
                                    case 80:
                                        this.bitField0_ |= 512;
                                        this.flags_ = codedInputStream.m92100s();
                                        continue;
                                    case 88:
                                        this.bitField0_ |= 256;
                                        this.arrayDimensionCount_ = codedInputStream.m92100s();
                                        continue;
                                    default:
                                        if (!parseUnknownField(codedInputStream, codedOutputStreamM92117K, extensionRegistryLite, iM92076K)) {
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
                    if ((c & 256) == 256) {
                        this.arrayElement_ = Collections.unmodifiableList(this.arrayElement_);
                    }
                    try {
                        codedOutputStreamM92117K.m92149J();
                    } catch (IOException unused2) {
                    } finally {
                        this.unknownFields = outputM92041w.m92061m();
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
                    return newBuilder().mo91349f(value);
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
                    int iM92127i = (this.bitField0_ & 1) == 1 ? CodedOutputStream.m92127i(1, this.type_.getNumber()) : 0;
                    if ((this.bitField0_ & 2) == 2) {
                        iM92127i += CodedOutputStream.m92109B(2, this.intValue_);
                    }
                    if ((this.bitField0_ & 4) == 4) {
                        iM92127i += CodedOutputStream.m92131m(3, this.floatValue_);
                    }
                    if ((this.bitField0_ & 8) == 8) {
                        iM92127i += CodedOutputStream.m92125g(4, this.doubleValue_);
                    }
                    if ((this.bitField0_ & 16) == 16) {
                        iM92127i += CodedOutputStream.m92134p(5, this.stringValue_);
                    }
                    if ((this.bitField0_ & 32) == 32) {
                        iM92127i += CodedOutputStream.m92134p(6, this.classId_);
                    }
                    if ((this.bitField0_ & 64) == 64) {
                        iM92127i += CodedOutputStream.m92134p(7, this.enumValueId_);
                    }
                    if ((this.bitField0_ & 128) == 128) {
                        iM92127i += CodedOutputStream.m92138t(8, this.annotation_);
                    }
                    for (int i2 = 0; i2 < this.arrayElement_.size(); i2++) {
                        iM92127i += CodedOutputStream.m92138t(9, this.arrayElement_.get(i2));
                    }
                    if ((this.bitField0_ & 512) == 512) {
                        iM92127i += CodedOutputStream.m92134p(10, this.flags_);
                    }
                    if ((this.bitField0_ & 256) == 256) {
                        iM92127i += CodedOutputStream.m92134p(11, this.arrayDimensionCount_);
                    }
                    int size = iM92127i + this.unknownFields.size();
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
                        codedOutputStream.m92159W(1, this.type_.getNumber());
                    }
                    if ((this.bitField0_ & 2) == 2) {
                        codedOutputStream.m92187x0(2, this.intValue_);
                    }
                    if ((this.bitField0_ & 4) == 4) {
                        codedOutputStream.m92164a0(3, this.floatValue_);
                    }
                    if ((this.bitField0_ & 8) == 8) {
                        codedOutputStream.m92157U(4, this.doubleValue_);
                    }
                    if ((this.bitField0_ & 16) == 16) {
                        codedOutputStream.m92168e0(5, this.stringValue_);
                    }
                    if ((this.bitField0_ & 32) == 32) {
                        codedOutputStream.m92168e0(6, this.classId_);
                    }
                    if ((this.bitField0_ & 64) == 64) {
                        codedOutputStream.m92168e0(7, this.enumValueId_);
                    }
                    if ((this.bitField0_ & 128) == 128) {
                        codedOutputStream.m92171h0(8, this.annotation_);
                    }
                    for (int i = 0; i < this.arrayElement_.size(); i++) {
                        codedOutputStream.m92171h0(9, this.arrayElement_.get(i));
                    }
                    if ((this.bitField0_ & 512) == 512) {
                        codedOutputStream.m92168e0(10, this.flags_);
                    }
                    if ((this.bitField0_ & 256) == 256) {
                        codedOutputStream.m92168e0(11, this.arrayDimensionCount_);
                    }
                    codedOutputStream.m92176m0(this.unknownFields);
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
                    return Builder.m91359o();
                }

                private Value(GeneratedMessageLite.Builder builder) {
                    super(builder);
                    this.memoizedIsInitialized = (byte) -1;
                    this.memoizedSerializedSize = -1;
                    this.unknownFields = builder.m92223e();
                }

                private Value(boolean z) {
                    this.memoizedIsInitialized = (byte) -1;
                    this.memoizedSerializedSize = -1;
                    this.unknownFields = ByteString.f66289a;
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
                return Builder.m91344o();
            }

            private Argument(GeneratedMessageLite.Builder builder) {
                super(builder);
                this.memoizedIsInitialized = (byte) -1;
                this.memoizedSerializedSize = -1;
                this.unknownFields = builder.m92223e();
            }

            private Argument(boolean z) {
                this.memoizedIsInitialized = (byte) -1;
                this.memoizedSerializedSize = -1;
                this.unknownFields = ByteString.f66289a;
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
            return Builder.m91382o();
        }

        private Annotation(GeneratedMessageLite.Builder builder) {
            super(builder);
            this.memoizedIsInitialized = (byte) -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = builder.m92223e();
        }

        private Annotation(boolean z) {
            this.memoizedIsInitialized = (byte) -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = ByteString.f66289a;
        }
    }

    public static final class QualifiedNameTable extends GeneratedMessageLite implements QualifiedNameTableOrBuilder {
        public static Parser<QualifiedNameTable> PARSER = new C15366a();
        private static final QualifiedNameTable defaultInstance;
        private byte memoizedIsInitialized;
        private int memoizedSerializedSize;
        private List<QualifiedName> qualifiedName_;
        private final ByteString unknownFields;

        public static final class Builder extends GeneratedMessageLite.Builder<QualifiedNameTable, Builder> implements QualifiedNameTableOrBuilder {

            /* JADX INFO: renamed from: b */
            public int f65928b;

            /* JADX INFO: renamed from: c */
            public List<QualifiedName> f65929c = Collections.EMPTY_LIST;

            private Builder() {
                m91595q();
            }

            /* JADX INFO: renamed from: o */
            public static Builder m91594o() {
                return new Builder();
            }

            /* JADX INFO: renamed from: q */
            private void m91595q() {
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
            public QualifiedNameTable build() {
                QualifiedNameTable qualifiedNameTableM91597m = m91597m();
                if (qualifiedNameTableM91597m.isInitialized()) {
                    return qualifiedNameTableM91597m;
                }
                throw AbstractMessageLite.Builder.m92024c(qualifiedNameTableM91597m);
            }

            /* JADX INFO: renamed from: m */
            public QualifiedNameTable m91597m() {
                QualifiedNameTable qualifiedNameTable = new QualifiedNameTable(this);
                if ((this.f65928b & 1) == 1) {
                    this.f65929c = Collections.unmodifiableList(this.f65929c);
                    this.f65928b &= -2;
                }
                qualifiedNameTable.qualifiedName_ = this.f65929c;
                return qualifiedNameTable;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder
            /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
            public Builder mo91414m() {
                return m91594o().mo91349f(m91597m());
            }

            /* JADX INFO: renamed from: p */
            public final void m91599p() {
                if ((this.f65928b & 1) != 1) {
                    this.f65929c = new ArrayList(this.f65929c);
                    this.f65928b |= 1;
                }
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder
            /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
            public Builder mo91349f(QualifiedNameTable qualifiedNameTable) {
                if (qualifiedNameTable == QualifiedNameTable.getDefaultInstance()) {
                    return this;
                }
                if (!qualifiedNameTable.qualifiedName_.isEmpty()) {
                    if (this.f65929c.isEmpty()) {
                        this.f65929c = qualifiedNameTable.qualifiedName_;
                        this.f65928b &= -2;
                    } else {
                        m91599p();
                        this.f65929c.addAll(qualifiedNameTable.qualifiedName_);
                    }
                }
                m92224j(m92223e().m92047c(qualifiedNameTable.unknownFields));
                return this;
            }

            /* JADX WARN: Code duplicated, block: B:15:0x001d  */
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
            public Builder mo91350i(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws Throwable {
                QualifiedNameTable qualifiedNameTable = null;
                try {
                    try {
                        QualifiedNameTable qualifiedNameTableMo91378d = QualifiedNameTable.PARSER.mo91378d(codedInputStream, extensionRegistryLite);
                        if (qualifiedNameTableMo91378d != null) {
                            mo91349f(qualifiedNameTableMo91378d);
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
                                mo91349f(qualifiedNameTable);
                            }
                            throw th;
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                    if (qualifiedNameTable != null) {
                        mo91349f(qualifiedNameTable);
                    }
                    throw th;
                }
            }
        }

        public interface QualifiedNameOrBuilder extends MessageLiteOrBuilder {
        }

        /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$QualifiedNameTable$a */
        public static class C15366a extends AbstractParser<QualifiedNameTable> {
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.Parser
            /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
            public QualifiedNameTable mo91378d(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
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
            ByteString.Output outputM92041w = ByteString.m92041w();
            CodedOutputStream codedOutputStreamM92117K = CodedOutputStream.m92117K(outputM92041w, 1);
            boolean z = false;
            boolean z2 = false;
            while (!z) {
                try {
                    try {
                        try {
                            int iM92076K = codedInputStream.m92076K();
                            if (iM92076K != 0) {
                                if (iM92076K == 10) {
                                    if (!z2) {
                                        this.qualifiedName_ = new ArrayList();
                                        z2 = true;
                                    }
                                    this.qualifiedName_.add((QualifiedName) codedInputStream.m92102u(QualifiedName.PARSER, extensionRegistryLite));
                                } else if (!parseUnknownField(codedInputStream, codedOutputStreamM92117K, extensionRegistryLite, iM92076K)) {
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
                        codedOutputStreamM92117K.m92149J();
                    } catch (IOException unused) {
                    } finally {
                        this.unknownFields = outputM92041w.m92061m();
                    }
                    makeExtensionsImmutable();
                    throw th;
                }
            }
            if (z2) {
                this.qualifiedName_ = Collections.unmodifiableList(this.qualifiedName_);
            }
            try {
                codedOutputStreamM92117K.m92149J();
            } catch (IOException unused2) {
            } finally {
                this.unknownFields = outputM92041w.m92061m();
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
            return newBuilder().mo91349f(qualifiedNameTable);
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
            int iM92138t = 0;
            for (int i2 = 0; i2 < this.qualifiedName_.size(); i2++) {
                iM92138t += CodedOutputStream.m92138t(1, this.qualifiedName_.get(i2));
            }
            int size = iM92138t + this.unknownFields.size();
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
                codedOutputStream.m92171h0(1, this.qualifiedName_.get(i));
            }
            codedOutputStream.m92176m0(this.unknownFields);
        }

        public static final class QualifiedName extends GeneratedMessageLite implements QualifiedNameOrBuilder {
            public static Parser<QualifiedName> PARSER = new C15365a();
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
                public int f65930b;

                /* JADX INFO: renamed from: d */
                public int f65932d;

                /* JADX INFO: renamed from: c */
                public int f65931c = -1;

                /* JADX INFO: renamed from: e */
                public Kind f65933e = Kind.PACKAGE;

                private Builder() {
                    m91604p();
                }

                /* JADX INFO: renamed from: o */
                public static Builder m91603o() {
                    return new Builder();
                }

                /* JADX INFO: renamed from: p */
                private void m91604p() {
                }

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
                /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
                public QualifiedName build() {
                    QualifiedName qualifiedNameM91606m = m91606m();
                    if (qualifiedNameM91606m.isInitialized()) {
                        return qualifiedNameM91606m;
                    }
                    throw AbstractMessageLite.Builder.m92024c(qualifiedNameM91606m);
                }

                /* JADX INFO: renamed from: m */
                public QualifiedName m91606m() {
                    QualifiedName qualifiedName = new QualifiedName(this);
                    int i = this.f65930b;
                    int i2 = (i & 1) != 1 ? 0 : 1;
                    qualifiedName.parentQualifiedName_ = this.f65931c;
                    if ((i & 2) == 2) {
                        i2 |= 2;
                    }
                    qualifiedName.shortName_ = this.f65932d;
                    if ((i & 4) == 4) {
                        i2 |= 4;
                    }
                    qualifiedName.kind_ = this.f65933e;
                    qualifiedName.bitField0_ = i2;
                    return qualifiedName;
                }

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder
                /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
                public Builder mo91414m() {
                    return m91603o().mo91349f(m91606m());
                }

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder
                /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
                public Builder mo91349f(QualifiedName qualifiedName) {
                    if (qualifiedName == QualifiedName.getDefaultInstance()) {
                        return this;
                    }
                    if (qualifiedName.hasParentQualifiedName()) {
                        m91611t(qualifiedName.getParentQualifiedName());
                    }
                    if (qualifiedName.hasShortName()) {
                        m91612u(qualifiedName.getShortName());
                    }
                    if (qualifiedName.hasKind()) {
                        m91610s(qualifiedName.getKind());
                    }
                    m92224j(m92223e().m92047c(qualifiedName.unknownFields));
                    return this;
                }

                /* JADX WARN: Code duplicated, block: B:15:0x001d  */
                @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
                /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
                public Builder mo91350i(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws Throwable {
                    QualifiedName qualifiedName = null;
                    try {
                        try {
                            QualifiedName qualifiedNameMo91378d = QualifiedName.PARSER.mo91378d(codedInputStream, extensionRegistryLite);
                            if (qualifiedNameMo91378d != null) {
                                mo91349f(qualifiedNameMo91378d);
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
                                    mo91349f(qualifiedName);
                                }
                                throw th;
                            }
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        if (qualifiedName != null) {
                            mo91349f(qualifiedName);
                        }
                        throw th;
                    }
                }

                /* JADX INFO: renamed from: s */
                public Builder m91610s(Kind kind) {
                    kind.getClass();
                    this.f65930b |= 4;
                    this.f65933e = kind;
                    return this;
                }

                /* JADX INFO: renamed from: t */
                public Builder m91611t(int i) {
                    this.f65930b |= 1;
                    this.f65931c = i;
                    return this;
                }

                /* JADX INFO: renamed from: u */
                public Builder m91612u(int i) {
                    this.f65930b |= 2;
                    this.f65932d = i;
                    return this;
                }
            }

            public enum Kind implements Internal.EnumLite {
                CLASS(0, 0),
                PACKAGE(1, 1),
                LOCAL(2, 2);

                private static Internal.EnumLiteMap<Kind> internalValueMap = new C15364a();
                private final int value;

                /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$QualifiedNameTable$QualifiedName$Kind$a */
                public static class C15364a implements Internal.EnumLiteMap<Kind> {
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
            public static class C15365a extends AbstractParser<QualifiedName> {
                @Override // kotlin.reflect.jvm.internal.impl.protobuf.Parser
                /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
                public QualifiedName mo91378d(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
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
                ByteString.Output outputM92041w = ByteString.m92041w();
                CodedOutputStream codedOutputStreamM92117K = CodedOutputStream.m92117K(outputM92041w, 1);
                boolean z = false;
                while (!z) {
                    try {
                        try {
                            try {
                                int iM92076K = codedInputStream.m92076K();
                                if (iM92076K != 0) {
                                    if (iM92076K == 8) {
                                        this.bitField0_ |= 1;
                                        this.parentQualifiedName_ = codedInputStream.m92100s();
                                    } else if (iM92076K == 16) {
                                        this.bitField0_ |= 2;
                                        this.shortName_ = codedInputStream.m92100s();
                                    } else if (iM92076K == 24) {
                                        int iM92095n = codedInputStream.m92095n();
                                        Kind kindValueOf = Kind.valueOf(iM92095n);
                                        if (kindValueOf == null) {
                                            codedOutputStreamM92117K.m92182s0(iM92076K);
                                            codedOutputStreamM92117K.m92182s0(iM92095n);
                                        } else {
                                            this.bitField0_ |= 4;
                                            this.kind_ = kindValueOf;
                                        }
                                    } else if (!parseUnknownField(codedInputStream, codedOutputStreamM92117K, extensionRegistryLite, iM92076K)) {
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
                            codedOutputStreamM92117K.m92149J();
                        } catch (IOException unused) {
                        } finally {
                            this.unknownFields = outputM92041w.m92061m();
                        }
                        makeExtensionsImmutable();
                        throw th;
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

            public static QualifiedName getDefaultInstance() {
                return defaultInstance;
            }

            private void initFields() {
                this.parentQualifiedName_ = -1;
                this.shortName_ = 0;
                this.kind_ = Kind.PACKAGE;
            }

            public static Builder newBuilder(QualifiedName qualifiedName) {
                return newBuilder().mo91349f(qualifiedName);
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
                int iM92134p = (this.bitField0_ & 1) == 1 ? CodedOutputStream.m92134p(1, this.parentQualifiedName_) : 0;
                if ((this.bitField0_ & 2) == 2) {
                    iM92134p += CodedOutputStream.m92134p(2, this.shortName_);
                }
                if ((this.bitField0_ & 4) == 4) {
                    iM92134p += CodedOutputStream.m92127i(3, this.kind_.getNumber());
                }
                int size = iM92134p + this.unknownFields.size();
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
                    codedOutputStream.m92168e0(1, this.parentQualifiedName_);
                }
                if ((this.bitField0_ & 2) == 2) {
                    codedOutputStream.m92168e0(2, this.shortName_);
                }
                if ((this.bitField0_ & 4) == 4) {
                    codedOutputStream.m92159W(3, this.kind_.getNumber());
                }
                codedOutputStream.m92176m0(this.unknownFields);
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
                return Builder.m91603o();
            }

            private QualifiedName(GeneratedMessageLite.Builder builder) {
                super(builder);
                this.memoizedIsInitialized = (byte) -1;
                this.memoizedSerializedSize = -1;
                this.unknownFields = builder.m92223e();
            }

            private QualifiedName(boolean z) {
                this.memoizedIsInitialized = (byte) -1;
                this.memoizedSerializedSize = -1;
                this.unknownFields = ByteString.f66289a;
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
            return Builder.m91594o();
        }

        private QualifiedNameTable(GeneratedMessageLite.Builder builder) {
            super(builder);
            this.memoizedIsInitialized = (byte) -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = builder.m92223e();
        }

        private QualifiedNameTable(boolean z) {
            this.memoizedIsInitialized = (byte) -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = ByteString.f66289a;
        }
    }

    public static final class Type extends GeneratedMessageLite.ExtendableMessage<Type> implements TypeOrBuilder {
        public static Parser<Type> PARSER = new C15370a();
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
            public int f65941d;

            /* JADX INFO: renamed from: f */
            public boolean f65943f;

            /* JADX INFO: renamed from: g */
            public int f65944g;

            /* JADX INFO: renamed from: i */
            public int f65946i;

            /* JADX INFO: renamed from: j */
            public int f65947j;

            /* JADX INFO: renamed from: k */
            public int f65948k;

            /* JADX INFO: renamed from: l */
            public int f65949l;

            /* JADX INFO: renamed from: m */
            public int f65950m;

            /* JADX INFO: renamed from: o */
            public int f65952o;

            /* JADX INFO: renamed from: q */
            public int f65954q;

            /* JADX INFO: renamed from: r */
            public int f65955r;

            /* JADX INFO: renamed from: e */
            public List<Argument> f65942e = Collections.EMPTY_LIST;

            /* JADX INFO: renamed from: h */
            public Type f65945h = Type.getDefaultInstance();

            /* JADX INFO: renamed from: n */
            public Type f65951n = Type.getDefaultInstance();

            /* JADX INFO: renamed from: p */
            public Type f65953p = Type.getDefaultInstance();

            private Builder() {
                m91642v();
            }

            /* JADX INFO: renamed from: t */
            public static Builder m91640t() {
                return new Builder();
            }

            /* JADX INFO: renamed from: u */
            private void m91641u() {
                if ((this.f65941d & 1) != 1) {
                    this.f65942e = new ArrayList(this.f65942e);
                    this.f65941d |= 1;
                }
            }

            /* JADX INFO: renamed from: v */
            private void m91642v() {
            }

            /* JADX INFO: renamed from: A */
            public Builder m91643A(Type type) {
                if ((this.f65941d & 512) != 512 || this.f65951n == Type.getDefaultInstance()) {
                    this.f65951n = type;
                } else {
                    this.f65951n = Type.newBuilder(this.f65951n).mo91349f(type).m91655r();
                }
                this.f65941d |= 512;
                return this;
            }

            /* JADX INFO: renamed from: B */
            public Builder m91644B(int i) {
                this.f65941d |= 4096;
                this.f65954q = i;
                return this;
            }

            /* JADX INFO: renamed from: C */
            public Builder m91645C(int i) {
                this.f65941d |= 32;
                this.f65947j = i;
                return this;
            }

            /* JADX INFO: renamed from: D */
            public Builder m91646D(int i) {
                this.f65941d |= 8192;
                this.f65955r = i;
                return this;
            }

            /* JADX INFO: renamed from: E */
            public Builder m91647E(int i) {
                this.f65941d |= 4;
                this.f65944g = i;
                return this;
            }

            /* JADX INFO: renamed from: G */
            public Builder m91648G(int i) {
                this.f65941d |= 16;
                this.f65946i = i;
                return this;
            }

            /* JADX INFO: renamed from: K */
            public Builder m91649K(boolean z) {
                this.f65941d |= 2;
                this.f65943f = z;
                return this;
            }

            /* JADX INFO: renamed from: L */
            public Builder m91650L(int i) {
                this.f65941d |= 1024;
                this.f65952o = i;
                return this;
            }

            /* JADX INFO: renamed from: M */
            public Builder m91651M(int i) {
                this.f65941d |= 256;
                this.f65950m = i;
                return this;
            }

            /* JADX INFO: renamed from: N */
            public Builder m91652N(int i) {
                this.f65941d |= 64;
                this.f65948k = i;
                return this;
            }

            /* JADX INFO: renamed from: O */
            public Builder m91653O(int i) {
                this.f65941d |= 128;
                this.f65949l = i;
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
            public Type build() {
                Type typeM91655r = m91655r();
                if (typeM91655r.isInitialized()) {
                    return typeM91655r;
                }
                throw AbstractMessageLite.Builder.m92024c(typeM91655r);
            }

            /* JADX INFO: renamed from: r */
            public Type m91655r() {
                Type type = new Type(this);
                int i = this.f65941d;
                if ((i & 1) == 1) {
                    this.f65942e = Collections.unmodifiableList(this.f65942e);
                    this.f65941d &= -2;
                }
                type.argument_ = this.f65942e;
                int i2 = (i & 2) != 2 ? 0 : 1;
                type.nullable_ = this.f65943f;
                if ((i & 4) == 4) {
                    i2 |= 2;
                }
                type.flexibleTypeCapabilitiesId_ = this.f65944g;
                if ((i & 8) == 8) {
                    i2 |= 4;
                }
                type.flexibleUpperBound_ = this.f65945h;
                if ((i & 16) == 16) {
                    i2 |= 8;
                }
                type.flexibleUpperBoundId_ = this.f65946i;
                if ((i & 32) == 32) {
                    i2 |= 16;
                }
                type.className_ = this.f65947j;
                if ((i & 64) == 64) {
                    i2 |= 32;
                }
                type.typeParameter_ = this.f65948k;
                if ((i & 128) == 128) {
                    i2 |= 64;
                }
                type.typeParameterName_ = this.f65949l;
                if ((i & 256) == 256) {
                    i2 |= 128;
                }
                type.typeAliasName_ = this.f65950m;
                if ((i & 512) == 512) {
                    i2 |= 256;
                }
                type.outerType_ = this.f65951n;
                if ((i & 1024) == 1024) {
                    i2 |= 512;
                }
                type.outerTypeId_ = this.f65952o;
                if ((i & 2048) == 2048) {
                    i2 |= 1024;
                }
                type.abbreviatedType_ = this.f65953p;
                if ((i & 4096) == 4096) {
                    i2 |= 2048;
                }
                type.abbreviatedTypeId_ = this.f65954q;
                if ((i & 8192) == 8192) {
                    i2 |= 4096;
                }
                type.flags_ = this.f65955r;
                type.bitField0_ = i2;
                return type;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableBuilder
            /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
            public Builder mo91414m() {
                return m91640t().mo91349f(m91655r());
            }

            /* JADX INFO: renamed from: w */
            public Builder m91657w(Type type) {
                if ((this.f65941d & 2048) != 2048 || this.f65953p == Type.getDefaultInstance()) {
                    this.f65953p = type;
                } else {
                    this.f65953p = Type.newBuilder(this.f65953p).mo91349f(type).m91655r();
                }
                this.f65941d |= 2048;
                return this;
            }

            /* JADX INFO: renamed from: x */
            public Builder m91658x(Type type) {
                if ((this.f65941d & 8) != 8 || this.f65945h == Type.getDefaultInstance()) {
                    this.f65945h = type;
                } else {
                    this.f65945h = Type.newBuilder(this.f65945h).mo91349f(type).m91655r();
                }
                this.f65941d |= 8;
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder
            /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
            public Builder mo91349f(Type type) {
                if (type == Type.getDefaultInstance()) {
                    return this;
                }
                if (!type.argument_.isEmpty()) {
                    if (this.f65942e.isEmpty()) {
                        this.f65942e = type.argument_;
                        this.f65941d &= -2;
                    } else {
                        m91641u();
                        this.f65942e.addAll(type.argument_);
                    }
                }
                if (type.hasNullable()) {
                    m91649K(type.getNullable());
                }
                if (type.hasFlexibleTypeCapabilitiesId()) {
                    m91647E(type.getFlexibleTypeCapabilitiesId());
                }
                if (type.hasFlexibleUpperBound()) {
                    m91658x(type.getFlexibleUpperBound());
                }
                if (type.hasFlexibleUpperBoundId()) {
                    m91648G(type.getFlexibleUpperBoundId());
                }
                if (type.hasClassName()) {
                    m91645C(type.getClassName());
                }
                if (type.hasTypeParameter()) {
                    m91652N(type.getTypeParameter());
                }
                if (type.hasTypeParameterName()) {
                    m91653O(type.getTypeParameterName());
                }
                if (type.hasTypeAliasName()) {
                    m91651M(type.getTypeAliasName());
                }
                if (type.hasOuterType()) {
                    m91643A(type.getOuterType());
                }
                if (type.hasOuterTypeId()) {
                    m91650L(type.getOuterTypeId());
                }
                if (type.hasAbbreviatedType()) {
                    m91657w(type.getAbbreviatedType());
                }
                if (type.hasAbbreviatedTypeId()) {
                    m91644B(type.getAbbreviatedTypeId());
                }
                if (type.hasFlags()) {
                    m91646D(type.getFlags());
                }
                m92228o(type);
                m92224j(m92223e().m92047c(type.unknownFields));
                return this;
            }

            /* JADX WARN: Code duplicated, block: B:15:0x001d  */
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
            public Builder mo91350i(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws Throwable {
                Type type = null;
                try {
                    try {
                        Type typeMo91378d = Type.PARSER.mo91378d(codedInputStream, extensionRegistryLite);
                        if (typeMo91378d != null) {
                            mo91349f(typeMo91378d);
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
                                mo91349f(type);
                            }
                            throw th;
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                    if (type != null) {
                        mo91349f(type);
                    }
                    throw th;
                }
            }
        }

        /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Type$a */
        public static class C15370a extends AbstractParser<Type> {
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.Parser
            /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
            public Type mo91378d(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
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
            ByteString.Output outputM92041w = ByteString.m92041w();
            CodedOutputStream codedOutputStreamM92117K = CodedOutputStream.m92117K(outputM92041w, 1);
            boolean z = false;
            boolean z2 = false;
            while (!z) {
                try {
                    try {
                        try {
                            int iM92076K = codedInputStream.m92076K();
                            switch (iM92076K) {
                                case 0:
                                    break;
                                case 8:
                                    this.bitField0_ |= 4096;
                                    this.flags_ = codedInputStream.m92100s();
                                    continue;
                                case 18:
                                    if (!z2) {
                                        this.argument_ = new ArrayList();
                                        z2 = true;
                                    }
                                    this.argument_.add((Argument) codedInputStream.m92102u(Argument.PARSER, extensionRegistryLite));
                                    continue;
                                case 24:
                                    this.bitField0_ |= 1;
                                    this.nullable_ = codedInputStream.m92092k();
                                    continue;
                                case 32:
                                    this.bitField0_ |= 2;
                                    this.flexibleTypeCapabilitiesId_ = codedInputStream.m92100s();
                                    continue;
                                case 42:
                                    builder = (this.bitField0_ & 4) == 4 ? this.flexibleUpperBound_.toBuilder() : null;
                                    Type type = (Type) codedInputStream.m92102u(PARSER, extensionRegistryLite);
                                    this.flexibleUpperBound_ = type;
                                    if (builder != null) {
                                        builder.mo91349f(type);
                                        this.flexibleUpperBound_ = builder.m91655r();
                                    }
                                    this.bitField0_ |= 4;
                                    continue;
                                case 48:
                                    this.bitField0_ |= 16;
                                    this.className_ = codedInputStream.m92100s();
                                    continue;
                                case 56:
                                    this.bitField0_ |= 32;
                                    this.typeParameter_ = codedInputStream.m92100s();
                                    continue;
                                case 64:
                                    this.bitField0_ |= 8;
                                    this.flexibleUpperBoundId_ = codedInputStream.m92100s();
                                    continue;
                                case 72:
                                    this.bitField0_ |= 64;
                                    this.typeParameterName_ = codedInputStream.m92100s();
                                    continue;
                                case EACTags.COMMAND_TO_PERFORM /* 82 */:
                                    builder = (this.bitField0_ & 256) == 256 ? this.outerType_.toBuilder() : null;
                                    Type type2 = (Type) codedInputStream.m92102u(PARSER, extensionRegistryLite);
                                    this.outerType_ = type2;
                                    if (builder != null) {
                                        builder.mo91349f(type2);
                                        this.outerType_ = builder.m91655r();
                                    }
                                    this.bitField0_ |= 256;
                                    continue;
                                case 88:
                                    this.bitField0_ |= 512;
                                    this.outerTypeId_ = codedInputStream.m92100s();
                                    continue;
                                case Opcodes.IADD /* 96 */:
                                    this.bitField0_ |= 128;
                                    this.typeAliasName_ = codedInputStream.m92100s();
                                    continue;
                                case 106:
                                    builder = (this.bitField0_ & 1024) == 1024 ? this.abbreviatedType_.toBuilder() : null;
                                    Type type3 = (Type) codedInputStream.m92102u(PARSER, extensionRegistryLite);
                                    this.abbreviatedType_ = type3;
                                    if (builder != null) {
                                        builder.mo91349f(type3);
                                        this.abbreviatedType_ = builder.m91655r();
                                    }
                                    this.bitField0_ |= 1024;
                                    continue;
                                case 112:
                                    this.bitField0_ |= 2048;
                                    this.abbreviatedTypeId_ = codedInputStream.m92100s();
                                    continue;
                                default:
                                    if (!parseUnknownField(codedInputStream, codedOutputStreamM92117K, extensionRegistryLite, iM92076K)) {
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
                        codedOutputStreamM92117K.m92149J();
                    } catch (IOException unused) {
                    } finally {
                        this.unknownFields = outputM92041w.m92061m();
                    }
                    makeExtensionsImmutable();
                    throw th;
                }
            }
            if (z2) {
                this.argument_ = Collections.unmodifiableList(this.argument_);
            }
            try {
                codedOutputStreamM92117K.m92149J();
            } catch (IOException unused2) {
            } finally {
                this.unknownFields = outputM92041w.m92061m();
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
            return newBuilder().mo91349f(type);
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
            int iM92134p = (this.bitField0_ & 4096) == 4096 ? CodedOutputStream.m92134p(1, this.flags_) : 0;
            for (int i2 = 0; i2 < this.argument_.size(); i2++) {
                iM92134p += CodedOutputStream.m92138t(2, this.argument_.get(i2));
            }
            if ((this.bitField0_ & 1) == 1) {
                iM92134p += CodedOutputStream.m92120b(3, this.nullable_);
            }
            if ((this.bitField0_ & 2) == 2) {
                iM92134p += CodedOutputStream.m92134p(4, this.flexibleTypeCapabilitiesId_);
            }
            if ((this.bitField0_ & 4) == 4) {
                iM92134p += CodedOutputStream.m92138t(5, this.flexibleUpperBound_);
            }
            if ((this.bitField0_ & 16) == 16) {
                iM92134p += CodedOutputStream.m92134p(6, this.className_);
            }
            if ((this.bitField0_ & 32) == 32) {
                iM92134p += CodedOutputStream.m92134p(7, this.typeParameter_);
            }
            if ((this.bitField0_ & 8) == 8) {
                iM92134p += CodedOutputStream.m92134p(8, this.flexibleUpperBoundId_);
            }
            if ((this.bitField0_ & 64) == 64) {
                iM92134p += CodedOutputStream.m92134p(9, this.typeParameterName_);
            }
            if ((this.bitField0_ & 256) == 256) {
                iM92134p += CodedOutputStream.m92138t(10, this.outerType_);
            }
            if ((this.bitField0_ & 512) == 512) {
                iM92134p += CodedOutputStream.m92134p(11, this.outerTypeId_);
            }
            if ((this.bitField0_ & 128) == 128) {
                iM92134p += CodedOutputStream.m92134p(12, this.typeAliasName_);
            }
            if ((this.bitField0_ & 1024) == 1024) {
                iM92134p += CodedOutputStream.m92138t(13, this.abbreviatedType_);
            }
            if ((this.bitField0_ & 2048) == 2048) {
                iM92134p += CodedOutputStream.m92134p(14, this.abbreviatedTypeId_);
            }
            int iExtensionsSerializedSize = iM92134p + extensionsSerializedSize() + this.unknownFields.size();
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
                codedOutputStream.m92168e0(1, this.flags_);
            }
            for (int i = 0; i < this.argument_.size(); i++) {
                codedOutputStream.m92171h0(2, this.argument_.get(i));
            }
            if ((this.bitField0_ & 1) == 1) {
                codedOutputStream.m92152P(3, this.nullable_);
            }
            if ((this.bitField0_ & 2) == 2) {
                codedOutputStream.m92168e0(4, this.flexibleTypeCapabilitiesId_);
            }
            if ((this.bitField0_ & 4) == 4) {
                codedOutputStream.m92171h0(5, this.flexibleUpperBound_);
            }
            if ((this.bitField0_ & 16) == 16) {
                codedOutputStream.m92168e0(6, this.className_);
            }
            if ((this.bitField0_ & 32) == 32) {
                codedOutputStream.m92168e0(7, this.typeParameter_);
            }
            if ((this.bitField0_ & 8) == 8) {
                codedOutputStream.m92168e0(8, this.flexibleUpperBoundId_);
            }
            if ((this.bitField0_ & 64) == 64) {
                codedOutputStream.m92168e0(9, this.typeParameterName_);
            }
            if ((this.bitField0_ & 256) == 256) {
                codedOutputStream.m92171h0(10, this.outerType_);
            }
            if ((this.bitField0_ & 512) == 512) {
                codedOutputStream.m92168e0(11, this.outerTypeId_);
            }
            if ((this.bitField0_ & 128) == 128) {
                codedOutputStream.m92168e0(12, this.typeAliasName_);
            }
            if ((this.bitField0_ & 1024) == 1024) {
                codedOutputStream.m92171h0(13, this.abbreviatedType_);
            }
            if ((this.bitField0_ & 2048) == 2048) {
                codedOutputStream.m92168e0(14, this.abbreviatedTypeId_);
            }
            extensionWriterNewExtensionWriter.m92229a(200, codedOutputStream);
            codedOutputStream.m92176m0(this.unknownFields);
        }

        public static final class Argument extends GeneratedMessageLite implements ArgumentOrBuilder {
            public static Parser<Argument> PARSER = new C15369a();
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
                public int f65936b;

                /* JADX INFO: renamed from: c */
                public Projection f65937c = Projection.INV;

                /* JADX INFO: renamed from: d */
                public Type f65938d = Type.getDefaultInstance();

                /* JADX INFO: renamed from: e */
                public int f65939e;

                private Builder() {
                    m91628p();
                }

                /* JADX INFO: renamed from: o */
                public static Builder m91627o() {
                    return new Builder();
                }

                /* JADX INFO: renamed from: p */
                private void m91628p() {
                }

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
                /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
                public Argument build() {
                    Argument argumentM91630m = m91630m();
                    if (argumentM91630m.isInitialized()) {
                        return argumentM91630m;
                    }
                    throw AbstractMessageLite.Builder.m92024c(argumentM91630m);
                }

                /* JADX INFO: renamed from: m */
                public Argument m91630m() {
                    Argument argument = new Argument(this);
                    int i = this.f65936b;
                    int i2 = (i & 1) != 1 ? 0 : 1;
                    argument.projection_ = this.f65937c;
                    if ((i & 2) == 2) {
                        i2 |= 2;
                    }
                    argument.type_ = this.f65938d;
                    if ((i & 4) == 4) {
                        i2 |= 4;
                    }
                    argument.typeId_ = this.f65939e;
                    argument.bitField0_ = i2;
                    return argument;
                }

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder
                /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
                public Builder mo91414m() {
                    return m91627o().mo91349f(m91630m());
                }

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder
                /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
                public Builder mo91349f(Argument argument) {
                    if (argument == Argument.getDefaultInstance()) {
                        return this;
                    }
                    if (argument.hasProjection()) {
                        m91635t(argument.getProjection());
                    }
                    if (argument.hasType()) {
                        m91634s(argument.getType());
                    }
                    if (argument.hasTypeId()) {
                        m91636u(argument.getTypeId());
                    }
                    m92224j(m92223e().m92047c(argument.unknownFields));
                    return this;
                }

                /* JADX WARN: Code duplicated, block: B:15:0x001d  */
                @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
                /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
                public Builder mo91350i(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws Throwable {
                    Argument argument = null;
                    try {
                        try {
                            Argument argumentMo91378d = Argument.PARSER.mo91378d(codedInputStream, extensionRegistryLite);
                            if (argumentMo91378d != null) {
                                mo91349f(argumentMo91378d);
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
                                    mo91349f(argument);
                                }
                                throw th;
                            }
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        if (argument != null) {
                            mo91349f(argument);
                        }
                        throw th;
                    }
                }

                /* JADX INFO: renamed from: s */
                public Builder m91634s(Type type) {
                    if ((this.f65936b & 2) != 2 || this.f65938d == Type.getDefaultInstance()) {
                        this.f65938d = type;
                    } else {
                        this.f65938d = Type.newBuilder(this.f65938d).mo91349f(type).m91655r();
                    }
                    this.f65936b |= 2;
                    return this;
                }

                /* JADX INFO: renamed from: t */
                public Builder m91635t(Projection projection) {
                    projection.getClass();
                    this.f65936b |= 1;
                    this.f65937c = projection;
                    return this;
                }

                /* JADX INFO: renamed from: u */
                public Builder m91636u(int i) {
                    this.f65936b |= 4;
                    this.f65939e = i;
                    return this;
                }
            }

            public enum Projection implements Internal.EnumLite {
                IN(0, 0),
                OUT(1, 1),
                INV(2, 2),
                STAR(3, 3);

                private static Internal.EnumLiteMap<Projection> internalValueMap = new C15368a();
                private final int value;

                /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Type$Argument$Projection$a */
                public static class C15368a implements Internal.EnumLiteMap<Projection> {
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
            public static class C15369a extends AbstractParser<Argument> {
                @Override // kotlin.reflect.jvm.internal.impl.protobuf.Parser
                /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
                public Argument mo91378d(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
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
                ByteString.Output outputM92041w = ByteString.m92041w();
                CodedOutputStream codedOutputStreamM92117K = CodedOutputStream.m92117K(outputM92041w, 1);
                boolean z = false;
                while (!z) {
                    try {
                        try {
                            try {
                                int iM92076K = codedInputStream.m92076K();
                                if (iM92076K != 0) {
                                    if (iM92076K == 8) {
                                        int iM92095n = codedInputStream.m92095n();
                                        Projection projectionValueOf = Projection.valueOf(iM92095n);
                                        if (projectionValueOf == null) {
                                            codedOutputStreamM92117K.m92182s0(iM92076K);
                                            codedOutputStreamM92117K.m92182s0(iM92095n);
                                        } else {
                                            this.bitField0_ |= 1;
                                            this.projection_ = projectionValueOf;
                                        }
                                    } else if (iM92076K == 18) {
                                        Builder builder = (this.bitField0_ & 2) == 2 ? this.type_.toBuilder() : null;
                                        Type type = (Type) codedInputStream.m92102u(Type.PARSER, extensionRegistryLite);
                                        this.type_ = type;
                                        if (builder != null) {
                                            builder.mo91349f(type);
                                            this.type_ = builder.m91655r();
                                        }
                                        this.bitField0_ |= 2;
                                    } else if (iM92076K == 24) {
                                        this.bitField0_ |= 4;
                                        this.typeId_ = codedInputStream.m92100s();
                                    } else if (!parseUnknownField(codedInputStream, codedOutputStreamM92117K, extensionRegistryLite, iM92076K)) {
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
                            codedOutputStreamM92117K.m92149J();
                        } catch (IOException unused) {
                        } finally {
                            this.unknownFields = outputM92041w.m92061m();
                        }
                        makeExtensionsImmutable();
                        throw th;
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

            public static Argument getDefaultInstance() {
                return defaultInstance;
            }

            private void initFields() {
                this.projection_ = Projection.INV;
                this.type_ = Type.getDefaultInstance();
                this.typeId_ = 0;
            }

            public static Builder newBuilder(Argument argument) {
                return newBuilder().mo91349f(argument);
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
                int iM92127i = (this.bitField0_ & 1) == 1 ? CodedOutputStream.m92127i(1, this.projection_.getNumber()) : 0;
                if ((this.bitField0_ & 2) == 2) {
                    iM92127i += CodedOutputStream.m92138t(2, this.type_);
                }
                if ((this.bitField0_ & 4) == 4) {
                    iM92127i += CodedOutputStream.m92134p(3, this.typeId_);
                }
                int size = iM92127i + this.unknownFields.size();
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
                    codedOutputStream.m92159W(1, this.projection_.getNumber());
                }
                if ((this.bitField0_ & 2) == 2) {
                    codedOutputStream.m92171h0(2, this.type_);
                }
                if ((this.bitField0_ & 4) == 4) {
                    codedOutputStream.m92168e0(3, this.typeId_);
                }
                codedOutputStream.m92176m0(this.unknownFields);
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
                return Builder.m91627o();
            }

            private Argument(GeneratedMessageLite.Builder builder) {
                super(builder);
                this.memoizedIsInitialized = (byte) -1;
                this.memoizedSerializedSize = -1;
                this.unknownFields = builder.m92223e();
            }

            private Argument(boolean z) {
                this.memoizedIsInitialized = (byte) -1;
                this.memoizedSerializedSize = -1;
                this.unknownFields = ByteString.f66289a;
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
            return Builder.m91640t();
        }

        private Type(GeneratedMessageLite.ExtendableBuilder<Type, ?> extendableBuilder) {
            super(extendableBuilder);
            this.memoizedIsInitialized = (byte) -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = extendableBuilder.m92223e();
        }

        private Type(boolean z) {
            this.memoizedIsInitialized = (byte) -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = ByteString.f66289a;
        }
    }

    public static final class Class extends GeneratedMessageLite.ExtendableMessage<Class> implements ClassOrBuilder {
        public static Parser<Class> PARSER = new C15347a();
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
            public List<CompilerPluginData> f65823A;

            /* JADX INFO: renamed from: d */
            public int f65824d;

            /* JADX INFO: renamed from: e */
            public int f65825e = 6;

            /* JADX INFO: renamed from: f */
            public int f65826f;

            /* JADX INFO: renamed from: g */
            public int f65827g;

            /* JADX INFO: renamed from: h */
            public List<TypeParameter> f65828h;

            /* JADX INFO: renamed from: i */
            public List<Type> f65829i;

            /* JADX INFO: renamed from: j */
            public List<Integer> f65830j;

            /* JADX INFO: renamed from: k */
            public List<Integer> f65831k;

            /* JADX INFO: renamed from: l */
            public List<Type> f65832l;

            /* JADX INFO: renamed from: m */
            public List<Integer> f65833m;

            /* JADX INFO: renamed from: n */
            public List<Constructor> f65834n;

            /* JADX INFO: renamed from: o */
            public List<Function> f65835o;

            /* JADX INFO: renamed from: p */
            public List<Property> f65836p;

            /* JADX INFO: renamed from: q */
            public List<TypeAlias> f65837q;

            /* JADX INFO: renamed from: r */
            public List<EnumEntry> f65838r;

            /* JADX INFO: renamed from: s */
            public List<Integer> f65839s;

            /* JADX INFO: renamed from: t */
            public int f65840t;

            /* JADX INFO: renamed from: u */
            public Type f65841u;

            /* JADX INFO: renamed from: v */
            public int f65842v;

            /* JADX INFO: renamed from: w */
            public List<Annotation> f65843w;

            /* JADX INFO: renamed from: x */
            public TypeTable f65844x;

            /* JADX INFO: renamed from: y */
            public List<Integer> f65845y;

            /* JADX INFO: renamed from: z */
            public VersionRequirementTable f65846z;

            private Builder() {
                List list = Collections.EMPTY_LIST;
                this.f65828h = list;
                this.f65829i = list;
                this.f65830j = list;
                this.f65831k = list;
                this.f65832l = list;
                this.f65833m = list;
                this.f65834n = list;
                this.f65835o = list;
                this.f65836p = list;
                this.f65837q = list;
                this.f65838r = list;
                this.f65839s = list;
                this.f65841u = Type.getDefaultInstance();
                this.f65843w = list;
                this.f65844x = TypeTable.getDefaultInstance();
                this.f65845y = list;
                this.f65846z = VersionRequirementTable.getDefaultInstance();
                this.f65823A = list;
                m91392N();
            }

            /* JADX INFO: renamed from: N */
            private void m91392N() {
            }

            /* JADX INFO: renamed from: t */
            public static Builder m91394t() {
                return new Builder();
            }

            /* JADX INFO: renamed from: A */
            public final void m91395A() {
                if ((this.f65824d & 1024) != 1024) {
                    this.f65835o = new ArrayList(this.f65835o);
                    this.f65824d |= 1024;
                }
            }

            /* JADX INFO: renamed from: B */
            public final void m91396B() {
                if ((this.f65824d & 64) != 64) {
                    this.f65831k = new ArrayList(this.f65831k);
                    this.f65824d |= 64;
                }
            }

            /* JADX INFO: renamed from: C */
            public final void m91397C() {
                if ((this.f65824d & 2048) != 2048) {
                    this.f65836p = new ArrayList(this.f65836p);
                    this.f65824d |= 2048;
                }
            }

            /* JADX INFO: renamed from: D */
            public final void m91398D() {
                if ((this.f65824d & 16384) != 16384) {
                    this.f65839s = new ArrayList(this.f65839s);
                    this.f65824d |= 16384;
                }
            }

            /* JADX INFO: renamed from: E */
            public final void m91399E() {
                if ((this.f65824d & 32) != 32) {
                    this.f65830j = new ArrayList(this.f65830j);
                    this.f65824d |= 32;
                }
            }

            /* JADX INFO: renamed from: G */
            public final void m91400G() {
                if ((this.f65824d & 16) != 16) {
                    this.f65829i = new ArrayList(this.f65829i);
                    this.f65824d |= 16;
                }
            }

            /* JADX INFO: renamed from: K */
            public final void m91401K() {
                if ((this.f65824d & 4096) != 4096) {
                    this.f65837q = new ArrayList(this.f65837q);
                    this.f65824d |= 4096;
                }
            }

            /* JADX INFO: renamed from: L */
            public final void m91402L() {
                if ((this.f65824d & 8) != 8) {
                    this.f65828h = new ArrayList(this.f65828h);
                    this.f65824d |= 8;
                }
            }

            /* JADX INFO: renamed from: M */
            public final void m91403M() {
                if ((this.f65824d & 1048576) != 1048576) {
                    this.f65845y = new ArrayList(this.f65845y);
                    this.f65824d |= 1048576;
                }
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder
            /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
            public Builder mo91349f(Class r3) {
                if (r3 == Class.getDefaultInstance()) {
                    return this;
                }
                if (r3.hasFlags()) {
                    m91410U(r3.getFlags());
                }
                if (r3.hasFqName()) {
                    m91411V(r3.getFqName());
                }
                if (r3.hasCompanionObjectName()) {
                    m91409T(r3.getCompanionObjectName());
                }
                if (!r3.typeParameter_.isEmpty()) {
                    if (this.f65828h.isEmpty()) {
                        this.f65828h = r3.typeParameter_;
                        this.f65824d &= -9;
                    } else {
                        m91402L();
                        this.f65828h.addAll(r3.typeParameter_);
                    }
                }
                if (!r3.supertype_.isEmpty()) {
                    if (this.f65829i.isEmpty()) {
                        this.f65829i = r3.supertype_;
                        this.f65824d &= -17;
                    } else {
                        m91400G();
                        this.f65829i.addAll(r3.supertype_);
                    }
                }
                if (!r3.supertypeId_.isEmpty()) {
                    if (this.f65830j.isEmpty()) {
                        this.f65830j = r3.supertypeId_;
                        this.f65824d &= -33;
                    } else {
                        m91399E();
                        this.f65830j.addAll(r3.supertypeId_);
                    }
                }
                if (!r3.nestedClassName_.isEmpty()) {
                    if (this.f65831k.isEmpty()) {
                        this.f65831k = r3.nestedClassName_;
                        this.f65824d &= -65;
                    } else {
                        m91396B();
                        this.f65831k.addAll(r3.nestedClassName_);
                    }
                }
                if (!r3.contextReceiverType_.isEmpty()) {
                    if (this.f65832l.isEmpty()) {
                        this.f65832l = r3.contextReceiverType_;
                        this.f65824d &= -129;
                    } else {
                        m91422y();
                        this.f65832l.addAll(r3.contextReceiverType_);
                    }
                }
                if (!r3.contextReceiverTypeId_.isEmpty()) {
                    if (this.f65833m.isEmpty()) {
                        this.f65833m = r3.contextReceiverTypeId_;
                        this.f65824d &= -257;
                    } else {
                        m91421x();
                        this.f65833m.addAll(r3.contextReceiverTypeId_);
                    }
                }
                if (!r3.constructor_.isEmpty()) {
                    if (this.f65834n.isEmpty()) {
                        this.f65834n = r3.constructor_;
                        this.f65824d &= -513;
                    } else {
                        m91420w();
                        this.f65834n.addAll(r3.constructor_);
                    }
                }
                if (!r3.function_.isEmpty()) {
                    if (this.f65835o.isEmpty()) {
                        this.f65835o = r3.function_;
                        this.f65824d &= ErrorCode.ERROR_CODE_JOIN_ROOM_ROOM_FORBIDDEN;
                    } else {
                        m91395A();
                        this.f65835o.addAll(r3.function_);
                    }
                }
                if (!r3.property_.isEmpty()) {
                    if (this.f65836p.isEmpty()) {
                        this.f65836p = r3.property_;
                        this.f65824d &= -2049;
                    } else {
                        m91397C();
                        this.f65836p.addAll(r3.property_);
                    }
                }
                if (!r3.typeAlias_.isEmpty()) {
                    if (this.f65837q.isEmpty()) {
                        this.f65837q = r3.typeAlias_;
                        this.f65824d &= -4097;
                    } else {
                        m91401K();
                        this.f65837q.addAll(r3.typeAlias_);
                    }
                }
                if (!r3.enumEntry_.isEmpty()) {
                    if (this.f65838r.isEmpty()) {
                        this.f65838r = r3.enumEntry_;
                        this.f65824d &= -8193;
                    } else {
                        m91423z();
                        this.f65838r.addAll(r3.enumEntry_);
                    }
                }
                if (!r3.sealedSubclassFqName_.isEmpty()) {
                    if (this.f65839s.isEmpty()) {
                        this.f65839s = r3.sealedSubclassFqName_;
                        this.f65824d &= -16385;
                    } else {
                        m91398D();
                        this.f65839s.addAll(r3.sealedSubclassFqName_);
                    }
                }
                if (r3.hasInlineClassUnderlyingPropertyName()) {
                    m91412W(r3.getInlineClassUnderlyingPropertyName());
                }
                if (r3.hasInlineClassUnderlyingType()) {
                    m91406Q(r3.getInlineClassUnderlyingType());
                }
                if (r3.hasInlineClassUnderlyingTypeId()) {
                    m91413X(r3.getInlineClassUnderlyingTypeId());
                }
                if (!r3.annotation_.isEmpty()) {
                    if (this.f65843w.isEmpty()) {
                        this.f65843w = r3.annotation_;
                        this.f65824d &= -262145;
                    } else {
                        m91418u();
                        this.f65843w.addAll(r3.annotation_);
                    }
                }
                if (r3.hasTypeTable()) {
                    m91407R(r3.getTypeTable());
                }
                if (!r3.versionRequirement_.isEmpty()) {
                    if (this.f65845y.isEmpty()) {
                        this.f65845y = r3.versionRequirement_;
                        this.f65824d &= -1048577;
                    } else {
                        m91403M();
                        this.f65845y.addAll(r3.versionRequirement_);
                    }
                }
                if (r3.hasVersionRequirementTable()) {
                    m91408S(r3.getVersionRequirementTable());
                }
                if (!r3.compilerPluginData_.isEmpty()) {
                    if (this.f65823A.isEmpty()) {
                        this.f65823A = r3.compilerPluginData_;
                        this.f65824d &= -4194305;
                    } else {
                        m91419v();
                        this.f65823A.addAll(r3.compilerPluginData_);
                    }
                }
                m92228o(r3);
                m92224j(m92223e().m92047c(r3.unknownFields));
                return this;
            }

            /* JADX WARN: Code duplicated, block: B:15:0x001d  */
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            /* JADX INFO: renamed from: P, reason: merged with bridge method [inline-methods] */
            public Builder mo91350i(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws Throwable {
                Class r0 = null;
                try {
                    try {
                        Class classMo91378d = Class.PARSER.mo91378d(codedInputStream, extensionRegistryLite);
                        if (classMo91378d != null) {
                            mo91349f(classMo91378d);
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
                                mo91349f(r0);
                            }
                            throw th;
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                    if (r0 != null) {
                        mo91349f(r0);
                    }
                    throw th;
                }
            }

            /* JADX INFO: renamed from: Q */
            public Builder m91406Q(Type type) {
                if ((this.f65824d & 65536) != 65536 || this.f65841u == Type.getDefaultInstance()) {
                    this.f65841u = type;
                } else {
                    this.f65841u = Type.newBuilder(this.f65841u).mo91349f(type).m91655r();
                }
                this.f65824d |= 65536;
                return this;
            }

            /* JADX INFO: renamed from: R */
            public Builder m91407R(TypeTable typeTable) {
                if ((this.f65824d & 524288) != 524288 || this.f65844x == TypeTable.getDefaultInstance()) {
                    this.f65844x = typeTable;
                } else {
                    this.f65844x = TypeTable.newBuilder(this.f65844x).mo91349f(typeTable).m91701m();
                }
                this.f65824d |= 524288;
                return this;
            }

            /* JADX INFO: renamed from: S */
            public Builder m91408S(VersionRequirementTable versionRequirementTable) {
                if ((this.f65824d & 2097152) != 2097152 || this.f65846z == VersionRequirementTable.getDefaultInstance()) {
                    this.f65846z = versionRequirementTable;
                } else {
                    this.f65846z = VersionRequirementTable.newBuilder(this.f65846z).mo91349f(versionRequirementTable).m91746m();
                }
                this.f65824d |= 2097152;
                return this;
            }

            /* JADX INFO: renamed from: T */
            public Builder m91409T(int i) {
                this.f65824d |= 4;
                this.f65827g = i;
                return this;
            }

            /* JADX INFO: renamed from: U */
            public Builder m91410U(int i) {
                this.f65824d |= 1;
                this.f65825e = i;
                return this;
            }

            /* JADX INFO: renamed from: V */
            public Builder m91411V(int i) {
                this.f65824d |= 2;
                this.f65826f = i;
                return this;
            }

            /* JADX INFO: renamed from: W */
            public Builder m91412W(int i) {
                this.f65824d |= 32768;
                this.f65840t = i;
                return this;
            }

            /* JADX INFO: renamed from: X */
            public Builder m91413X(int i) {
                this.f65824d |= 131072;
                this.f65842v = i;
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
            public Class build() {
                Class classM91416r = m91416r();
                if (classM91416r.isInitialized()) {
                    return classM91416r;
                }
                throw AbstractMessageLite.Builder.m92024c(classM91416r);
            }

            /* JADX INFO: renamed from: r */
            public Class m91416r() {
                Class r0 = new Class(this);
                int i = this.f65824d;
                int i2 = (i & 1) != 1 ? 0 : 1;
                r0.flags_ = this.f65825e;
                if ((i & 2) == 2) {
                    i2 |= 2;
                }
                r0.fqName_ = this.f65826f;
                if ((i & 4) == 4) {
                    i2 |= 4;
                }
                r0.companionObjectName_ = this.f65827g;
                if ((this.f65824d & 8) == 8) {
                    this.f65828h = Collections.unmodifiableList(this.f65828h);
                    this.f65824d &= -9;
                }
                r0.typeParameter_ = this.f65828h;
                if ((this.f65824d & 16) == 16) {
                    this.f65829i = Collections.unmodifiableList(this.f65829i);
                    this.f65824d &= -17;
                }
                r0.supertype_ = this.f65829i;
                if ((this.f65824d & 32) == 32) {
                    this.f65830j = Collections.unmodifiableList(this.f65830j);
                    this.f65824d &= -33;
                }
                r0.supertypeId_ = this.f65830j;
                if ((this.f65824d & 64) == 64) {
                    this.f65831k = Collections.unmodifiableList(this.f65831k);
                    this.f65824d &= -65;
                }
                r0.nestedClassName_ = this.f65831k;
                if ((this.f65824d & 128) == 128) {
                    this.f65832l = Collections.unmodifiableList(this.f65832l);
                    this.f65824d &= -129;
                }
                r0.contextReceiverType_ = this.f65832l;
                if ((this.f65824d & 256) == 256) {
                    this.f65833m = Collections.unmodifiableList(this.f65833m);
                    this.f65824d &= -257;
                }
                r0.contextReceiverTypeId_ = this.f65833m;
                if ((this.f65824d & 512) == 512) {
                    this.f65834n = Collections.unmodifiableList(this.f65834n);
                    this.f65824d &= -513;
                }
                r0.constructor_ = this.f65834n;
                if ((this.f65824d & 1024) == 1024) {
                    this.f65835o = Collections.unmodifiableList(this.f65835o);
                    this.f65824d &= ErrorCode.ERROR_CODE_JOIN_ROOM_ROOM_FORBIDDEN;
                }
                r0.function_ = this.f65835o;
                if ((this.f65824d & 2048) == 2048) {
                    this.f65836p = Collections.unmodifiableList(this.f65836p);
                    this.f65824d &= -2049;
                }
                r0.property_ = this.f65836p;
                if ((this.f65824d & 4096) == 4096) {
                    this.f65837q = Collections.unmodifiableList(this.f65837q);
                    this.f65824d &= -4097;
                }
                r0.typeAlias_ = this.f65837q;
                if ((this.f65824d & 8192) == 8192) {
                    this.f65838r = Collections.unmodifiableList(this.f65838r);
                    this.f65824d &= -8193;
                }
                r0.enumEntry_ = this.f65838r;
                if ((this.f65824d & 16384) == 16384) {
                    this.f65839s = Collections.unmodifiableList(this.f65839s);
                    this.f65824d &= -16385;
                }
                r0.sealedSubclassFqName_ = this.f65839s;
                if ((i & 32768) == 32768) {
                    i2 |= 8;
                }
                r0.inlineClassUnderlyingPropertyName_ = this.f65840t;
                if ((i & 65536) == 65536) {
                    i2 |= 16;
                }
                r0.inlineClassUnderlyingType_ = this.f65841u;
                if ((i & 131072) == 131072) {
                    i2 |= 32;
                }
                r0.inlineClassUnderlyingTypeId_ = this.f65842v;
                if ((this.f65824d & 262144) == 262144) {
                    this.f65843w = Collections.unmodifiableList(this.f65843w);
                    this.f65824d &= -262145;
                }
                r0.annotation_ = this.f65843w;
                if ((i & 524288) == 524288) {
                    i2 |= 64;
                }
                r0.typeTable_ = this.f65844x;
                if ((this.f65824d & 1048576) == 1048576) {
                    this.f65845y = Collections.unmodifiableList(this.f65845y);
                    this.f65824d &= -1048577;
                }
                r0.versionRequirement_ = this.f65845y;
                if ((i & 2097152) == 2097152) {
                    i2 |= 128;
                }
                r0.versionRequirementTable_ = this.f65846z;
                if ((this.f65824d & 4194304) == 4194304) {
                    this.f65823A = Collections.unmodifiableList(this.f65823A);
                    this.f65824d &= -4194305;
                }
                r0.compilerPluginData_ = this.f65823A;
                r0.bitField0_ = i2;
                return r0;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableBuilder
            /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
            public Builder mo91414m() {
                return m91394t().mo91349f(m91416r());
            }

            /* JADX INFO: renamed from: u */
            public final void m91418u() {
                if ((this.f65824d & 262144) != 262144) {
                    this.f65843w = new ArrayList(this.f65843w);
                    this.f65824d |= 262144;
                }
            }

            /* JADX INFO: renamed from: v */
            public final void m91419v() {
                if ((this.f65824d & 4194304) != 4194304) {
                    this.f65823A = new ArrayList(this.f65823A);
                    this.f65824d |= 4194304;
                }
            }

            /* JADX INFO: renamed from: w */
            public final void m91420w() {
                if ((this.f65824d & 512) != 512) {
                    this.f65834n = new ArrayList(this.f65834n);
                    this.f65824d |= 512;
                }
            }

            /* JADX INFO: renamed from: x */
            public final void m91421x() {
                if ((this.f65824d & 256) != 256) {
                    this.f65833m = new ArrayList(this.f65833m);
                    this.f65824d |= 256;
                }
            }

            /* JADX INFO: renamed from: y */
            public final void m91422y() {
                if ((this.f65824d & 128) != 128) {
                    this.f65832l = new ArrayList(this.f65832l);
                    this.f65824d |= 128;
                }
            }

            /* JADX INFO: renamed from: z */
            public final void m91423z() {
                if ((this.f65824d & 8192) != 8192) {
                    this.f65838r = new ArrayList(this.f65838r);
                    this.f65824d |= 8192;
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

            private static Internal.EnumLiteMap<Kind> internalValueMap = new C15346a();
            private final int value;

            /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Class$Kind$a */
            public static class C15346a implements Internal.EnumLiteMap<Kind> {
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
        public static class C15347a extends AbstractParser<Class> {
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.Parser
            /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
            public Class mo91378d(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
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
            return newBuilder().mo91349f(r1);
        }

        public static Class parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return PARSER.mo92026b(inputStream, extensionRegistryLite);
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
            int iM92134p = (this.bitField0_ & 1) == 1 ? CodedOutputStream.m92134p(1, this.flags_) : 0;
            int iM92135q = 0;
            for (int i2 = 0; i2 < this.supertypeId_.size(); i2++) {
                iM92135q += CodedOutputStream.m92135q(this.supertypeId_.get(i2).intValue());
            }
            int iM92138t = iM92134p + iM92135q;
            if (!getSupertypeIdList().isEmpty()) {
                iM92138t = iM92138t + 1 + CodedOutputStream.m92135q(iM92135q);
            }
            this.supertypeIdMemoizedSerializedSize = iM92135q;
            if ((this.bitField0_ & 2) == 2) {
                iM92138t += CodedOutputStream.m92134p(3, this.fqName_);
            }
            if ((this.bitField0_ & 4) == 4) {
                iM92138t += CodedOutputStream.m92134p(4, this.companionObjectName_);
            }
            for (int i3 = 0; i3 < this.typeParameter_.size(); i3++) {
                iM92138t += CodedOutputStream.m92138t(5, this.typeParameter_.get(i3));
            }
            for (int i4 = 0; i4 < this.supertype_.size(); i4++) {
                iM92138t += CodedOutputStream.m92138t(6, this.supertype_.get(i4));
            }
            int iM92135q2 = 0;
            for (int i5 = 0; i5 < this.nestedClassName_.size(); i5++) {
                iM92135q2 += CodedOutputStream.m92135q(this.nestedClassName_.get(i5).intValue());
            }
            int iM92138t2 = iM92138t + iM92135q2;
            if (!getNestedClassNameList().isEmpty()) {
                iM92138t2 = iM92138t2 + 1 + CodedOutputStream.m92135q(iM92135q2);
            }
            this.nestedClassNameMemoizedSerializedSize = iM92135q2;
            for (int i6 = 0; i6 < this.constructor_.size(); i6++) {
                iM92138t2 += CodedOutputStream.m92138t(8, this.constructor_.get(i6));
            }
            for (int i7 = 0; i7 < this.function_.size(); i7++) {
                iM92138t2 += CodedOutputStream.m92138t(9, this.function_.get(i7));
            }
            for (int i8 = 0; i8 < this.property_.size(); i8++) {
                iM92138t2 += CodedOutputStream.m92138t(10, this.property_.get(i8));
            }
            for (int i9 = 0; i9 < this.typeAlias_.size(); i9++) {
                iM92138t2 += CodedOutputStream.m92138t(11, this.typeAlias_.get(i9));
            }
            for (int i10 = 0; i10 < this.enumEntry_.size(); i10++) {
                iM92138t2 += CodedOutputStream.m92138t(13, this.enumEntry_.get(i10));
            }
            int iM92135q3 = 0;
            for (int i11 = 0; i11 < this.sealedSubclassFqName_.size(); i11++) {
                iM92135q3 += CodedOutputStream.m92135q(this.sealedSubclassFqName_.get(i11).intValue());
            }
            int iM92138t3 = iM92138t2 + iM92135q3;
            if (!getSealedSubclassFqNameList().isEmpty()) {
                iM92138t3 = iM92138t3 + 2 + CodedOutputStream.m92135q(iM92135q3);
            }
            this.sealedSubclassFqNameMemoizedSerializedSize = iM92135q3;
            if ((this.bitField0_ & 8) == 8) {
                iM92138t3 += CodedOutputStream.m92134p(17, this.inlineClassUnderlyingPropertyName_);
            }
            if ((this.bitField0_ & 16) == 16) {
                iM92138t3 += CodedOutputStream.m92138t(18, this.inlineClassUnderlyingType_);
            }
            if ((this.bitField0_ & 32) == 32) {
                iM92138t3 += CodedOutputStream.m92134p(19, this.inlineClassUnderlyingTypeId_);
            }
            for (int i12 = 0; i12 < this.contextReceiverType_.size(); i12++) {
                iM92138t3 += CodedOutputStream.m92138t(20, this.contextReceiverType_.get(i12));
            }
            int iM92135q4 = 0;
            for (int i13 = 0; i13 < this.contextReceiverTypeId_.size(); i13++) {
                iM92135q4 += CodedOutputStream.m92135q(this.contextReceiverTypeId_.get(i13).intValue());
            }
            int iM92138t4 = iM92138t3 + iM92135q4;
            if (!getContextReceiverTypeIdList().isEmpty()) {
                iM92138t4 = iM92138t4 + 2 + CodedOutputStream.m92135q(iM92135q4);
            }
            this.contextReceiverTypeIdMemoizedSerializedSize = iM92135q4;
            for (int i14 = 0; i14 < this.annotation_.size(); i14++) {
                iM92138t4 += CodedOutputStream.m92138t(25, this.annotation_.get(i14));
            }
            if ((this.bitField0_ & 64) == 64) {
                iM92138t4 += CodedOutputStream.m92138t(30, this.typeTable_);
            }
            int iM92135q5 = 0;
            for (int i15 = 0; i15 < this.versionRequirement_.size(); i15++) {
                iM92135q5 += CodedOutputStream.m92135q(this.versionRequirement_.get(i15).intValue());
            }
            int size = iM92138t4 + iM92135q5 + (getVersionRequirementList().size() * 2);
            if ((this.bitField0_ & 128) == 128) {
                size += CodedOutputStream.m92138t(32, this.versionRequirementTable_);
            }
            for (int i16 = 0; i16 < this.compilerPluginData_.size(); i16++) {
                size += CodedOutputStream.m92138t(33, this.compilerPluginData_.get(i16));
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
                codedOutputStream.m92168e0(1, this.flags_);
            }
            if (getSupertypeIdList().size() > 0) {
                codedOutputStream.m92182s0(18);
                codedOutputStream.m92182s0(this.supertypeIdMemoizedSerializedSize);
            }
            for (int i = 0; i < this.supertypeId_.size(); i++) {
                codedOutputStream.m92169f0(this.supertypeId_.get(i).intValue());
            }
            if ((this.bitField0_ & 2) == 2) {
                codedOutputStream.m92168e0(3, this.fqName_);
            }
            if ((this.bitField0_ & 4) == 4) {
                codedOutputStream.m92168e0(4, this.companionObjectName_);
            }
            for (int i2 = 0; i2 < this.typeParameter_.size(); i2++) {
                codedOutputStream.m92171h0(5, this.typeParameter_.get(i2));
            }
            for (int i3 = 0; i3 < this.supertype_.size(); i3++) {
                codedOutputStream.m92171h0(6, this.supertype_.get(i3));
            }
            if (getNestedClassNameList().size() > 0) {
                codedOutputStream.m92182s0(58);
                codedOutputStream.m92182s0(this.nestedClassNameMemoizedSerializedSize);
            }
            for (int i4 = 0; i4 < this.nestedClassName_.size(); i4++) {
                codedOutputStream.m92169f0(this.nestedClassName_.get(i4).intValue());
            }
            for (int i5 = 0; i5 < this.constructor_.size(); i5++) {
                codedOutputStream.m92171h0(8, this.constructor_.get(i5));
            }
            for (int i6 = 0; i6 < this.function_.size(); i6++) {
                codedOutputStream.m92171h0(9, this.function_.get(i6));
            }
            for (int i7 = 0; i7 < this.property_.size(); i7++) {
                codedOutputStream.m92171h0(10, this.property_.get(i7));
            }
            for (int i8 = 0; i8 < this.typeAlias_.size(); i8++) {
                codedOutputStream.m92171h0(11, this.typeAlias_.get(i8));
            }
            for (int i9 = 0; i9 < this.enumEntry_.size(); i9++) {
                codedOutputStream.m92171h0(13, this.enumEntry_.get(i9));
            }
            if (getSealedSubclassFqNameList().size() > 0) {
                codedOutputStream.m92182s0(130);
                codedOutputStream.m92182s0(this.sealedSubclassFqNameMemoizedSerializedSize);
            }
            for (int i10 = 0; i10 < this.sealedSubclassFqName_.size(); i10++) {
                codedOutputStream.m92169f0(this.sealedSubclassFqName_.get(i10).intValue());
            }
            if ((this.bitField0_ & 8) == 8) {
                codedOutputStream.m92168e0(17, this.inlineClassUnderlyingPropertyName_);
            }
            if ((this.bitField0_ & 16) == 16) {
                codedOutputStream.m92171h0(18, this.inlineClassUnderlyingType_);
            }
            if ((this.bitField0_ & 32) == 32) {
                codedOutputStream.m92168e0(19, this.inlineClassUnderlyingTypeId_);
            }
            for (int i11 = 0; i11 < this.contextReceiverType_.size(); i11++) {
                codedOutputStream.m92171h0(20, this.contextReceiverType_.get(i11));
            }
            if (getContextReceiverTypeIdList().size() > 0) {
                codedOutputStream.m92182s0(CipherSuite.TLS_DHE_PSK_WITH_AES_128_GCM_SHA256);
                codedOutputStream.m92182s0(this.contextReceiverTypeIdMemoizedSerializedSize);
            }
            for (int i12 = 0; i12 < this.contextReceiverTypeId_.size(); i12++) {
                codedOutputStream.m92169f0(this.contextReceiverTypeId_.get(i12).intValue());
            }
            for (int i13 = 0; i13 < this.annotation_.size(); i13++) {
                codedOutputStream.m92171h0(25, this.annotation_.get(i13));
            }
            if ((this.bitField0_ & 64) == 64) {
                codedOutputStream.m92171h0(30, this.typeTable_);
            }
            for (int i14 = 0; i14 < this.versionRequirement_.size(); i14++) {
                codedOutputStream.m92168e0(31, this.versionRequirement_.get(i14).intValue());
            }
            if ((this.bitField0_ & 128) == 128) {
                codedOutputStream.m92171h0(32, this.versionRequirementTable_);
            }
            for (int i15 = 0; i15 < this.compilerPluginData_.size(); i15++) {
                codedOutputStream.m92171h0(33, this.compilerPluginData_.get(i15));
            }
            extensionWriterNewExtensionWriter.m92229a(19000, codedOutputStream);
            codedOutputStream.m92176m0(this.unknownFields);
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
            return Builder.m91394t();
        }

        private Class(GeneratedMessageLite.ExtendableBuilder<Class, ?> extendableBuilder) {
            super(extendableBuilder);
            this.supertypeIdMemoizedSerializedSize = -1;
            this.nestedClassNameMemoizedSerializedSize = -1;
            this.contextReceiverTypeIdMemoizedSerializedSize = -1;
            this.sealedSubclassFqNameMemoizedSerializedSize = -1;
            this.memoizedIsInitialized = (byte) -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = extendableBuilder.m92223e();
        }

        private Class(boolean z) {
            this.supertypeIdMemoizedSerializedSize = -1;
            this.nestedClassNameMemoizedSerializedSize = -1;
            this.contextReceiverTypeIdMemoizedSerializedSize = -1;
            this.sealedSubclassFqNameMemoizedSerializedSize = -1;
            this.memoizedIsInitialized = (byte) -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = ByteString.f66289a;
        }
    }

    public static final class CompilerPluginData extends GeneratedMessageLite implements CompilerPluginDataOrBuilder {
        public static Parser<CompilerPluginData> PARSER = new C15348a();
        private static final CompilerPluginData defaultInstance;
        private int bitField0_;
        private ByteString data_;
        private byte memoizedIsInitialized;
        private int memoizedSerializedSize;
        private int pluginId_;
        private final ByteString unknownFields;

        public static final class Builder extends GeneratedMessageLite.Builder<CompilerPluginData, Builder> implements CompilerPluginDataOrBuilder {

            /* JADX INFO: renamed from: b */
            public int f65847b;

            /* JADX INFO: renamed from: c */
            public int f65848c;

            /* JADX INFO: renamed from: d */
            public ByteString f65849d = ByteString.f66289a;

            private Builder() {
                m91428p();
            }

            /* JADX INFO: renamed from: o */
            public static Builder m91427o() {
                return new Builder();
            }

            /* JADX INFO: renamed from: p */
            private void m91428p() {
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
            public CompilerPluginData build() {
                CompilerPluginData compilerPluginDataM91430m = m91430m();
                if (compilerPluginDataM91430m.isInitialized()) {
                    return compilerPluginDataM91430m;
                }
                throw AbstractMessageLite.Builder.m92024c(compilerPluginDataM91430m);
            }

            /* JADX INFO: renamed from: m */
            public CompilerPluginData m91430m() {
                CompilerPluginData compilerPluginData = new CompilerPluginData(this);
                int i = this.f65847b;
                int i2 = (i & 1) != 1 ? 0 : 1;
                compilerPluginData.pluginId_ = this.f65848c;
                if ((i & 2) == 2) {
                    i2 |= 2;
                }
                compilerPluginData.data_ = this.f65849d;
                compilerPluginData.bitField0_ = i2;
                return compilerPluginData;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder
            /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
            public Builder mo91414m() {
                return m91427o().mo91349f(m91430m());
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder
            /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
            public Builder mo91349f(CompilerPluginData compilerPluginData) {
                if (compilerPluginData == CompilerPluginData.getDefaultInstance()) {
                    return this;
                }
                if (compilerPluginData.hasPluginId()) {
                    m91435t(compilerPluginData.getPluginId());
                }
                if (compilerPluginData.hasData()) {
                    m91434s(compilerPluginData.getData());
                }
                m92224j(m92223e().m92047c(compilerPluginData.unknownFields));
                return this;
            }

            /* JADX WARN: Code duplicated, block: B:15:0x001d  */
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
            public Builder mo91350i(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws Throwable {
                CompilerPluginData compilerPluginData = null;
                try {
                    try {
                        CompilerPluginData compilerPluginDataMo91378d = CompilerPluginData.PARSER.mo91378d(codedInputStream, extensionRegistryLite);
                        if (compilerPluginDataMo91378d != null) {
                            mo91349f(compilerPluginDataMo91378d);
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
                                mo91349f(compilerPluginData);
                            }
                            throw th;
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                    if (compilerPluginData != null) {
                        mo91349f(compilerPluginData);
                    }
                    throw th;
                }
            }

            /* JADX INFO: renamed from: s */
            public Builder m91434s(ByteString byteString) {
                byteString.getClass();
                this.f65847b |= 2;
                this.f65849d = byteString;
                return this;
            }

            /* JADX INFO: renamed from: t */
            public Builder m91435t(int i) {
                this.f65847b |= 1;
                this.f65848c = i;
                return this;
            }
        }

        /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$CompilerPluginData$a */
        public static class C15348a extends AbstractParser<CompilerPluginData> {
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.Parser
            /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
            public CompilerPluginData mo91378d(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
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
                                this.pluginId_ = codedInputStream.m92100s();
                            } else if (iM92076K == 18) {
                                this.bitField0_ |= 2;
                                this.data_ = codedInputStream.m92093l();
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

        public static CompilerPluginData getDefaultInstance() {
            return defaultInstance;
        }

        private void initFields() {
            this.pluginId_ = 0;
            this.data_ = ByteString.f66289a;
        }

        public static Builder newBuilder(CompilerPluginData compilerPluginData) {
            return newBuilder().mo91349f(compilerPluginData);
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
            int iM92134p = (this.bitField0_ & 1) == 1 ? CodedOutputStream.m92134p(1, this.pluginId_) : 0;
            if ((this.bitField0_ & 2) == 2) {
                iM92134p += CodedOutputStream.m92123e(2, this.data_);
            }
            int size = iM92134p + this.unknownFields.size();
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
                codedOutputStream.m92168e0(1, this.pluginId_);
            }
            if ((this.bitField0_ & 2) == 2) {
                codedOutputStream.m92155S(2, this.data_);
            }
            codedOutputStream.m92176m0(this.unknownFields);
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
            return Builder.m91427o();
        }

        private CompilerPluginData(GeneratedMessageLite.Builder builder) {
            super(builder);
            this.memoizedIsInitialized = (byte) -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = builder.m92223e();
        }

        private CompilerPluginData(boolean z) {
            this.memoizedIsInitialized = (byte) -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = ByteString.f66289a;
        }
    }

    public static final class Constructor extends GeneratedMessageLite.ExtendableMessage<Constructor> implements ConstructorOrBuilder {
        public static Parser<Constructor> PARSER = new C15349a();
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
            public int f65850d;

            /* JADX INFO: renamed from: e */
            public int f65851e = 6;

            /* JADX INFO: renamed from: f */
            public List<ValueParameter> f65852f;

            /* JADX INFO: renamed from: g */
            public List<Integer> f65853g;

            /* JADX INFO: renamed from: h */
            public List<CompilerPluginData> f65854h;

            /* JADX INFO: renamed from: i */
            public List<Annotation> f65855i;

            private Builder() {
                List list = Collections.EMPTY_LIST;
                this.f65852f = list;
                this.f65853g = list;
                this.f65854h = list;
                this.f65855i = list;
                m91442y();
            }

            /* JADX INFO: renamed from: t */
            public static Builder m91438t() {
                return new Builder();
            }

            /* JADX INFO: renamed from: u */
            private void m91439u() {
                if ((this.f65850d & 16) != 16) {
                    this.f65855i = new ArrayList(this.f65855i);
                    this.f65850d |= 16;
                }
            }

            /* JADX INFO: renamed from: v */
            private void m91440v() {
                if ((this.f65850d & 8) != 8) {
                    this.f65854h = new ArrayList(this.f65854h);
                    this.f65850d |= 8;
                }
            }

            /* JADX INFO: renamed from: x */
            private void m91441x() {
                if ((this.f65850d & 4) != 4) {
                    this.f65853g = new ArrayList(this.f65853g);
                    this.f65850d |= 4;
                }
            }

            /* JADX INFO: renamed from: y */
            private void m91442y() {
            }

            /* JADX WARN: Code duplicated, block: B:15:0x001d  */
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
            public Builder mo91350i(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws Throwable {
                Constructor constructor = null;
                try {
                    try {
                        Constructor constructorMo91378d = Constructor.PARSER.mo91378d(codedInputStream, extensionRegistryLite);
                        if (constructorMo91378d != null) {
                            mo91349f(constructorMo91378d);
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
                                mo91349f(constructor);
                            }
                            throw th;
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                    if (constructor != null) {
                        mo91349f(constructor);
                    }
                    throw th;
                }
            }

            /* JADX INFO: renamed from: B */
            public Builder m91444B(int i) {
                this.f65850d |= 1;
                this.f65851e = i;
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
            public Constructor build() {
                Constructor constructorM91446r = m91446r();
                if (constructorM91446r.isInitialized()) {
                    return constructorM91446r;
                }
                throw AbstractMessageLite.Builder.m92024c(constructorM91446r);
            }

            /* JADX INFO: renamed from: r */
            public Constructor m91446r() {
                Constructor constructor = new Constructor(this);
                int i = (this.f65850d & 1) != 1 ? 0 : 1;
                constructor.flags_ = this.f65851e;
                if ((this.f65850d & 2) == 2) {
                    this.f65852f = Collections.unmodifiableList(this.f65852f);
                    this.f65850d &= -3;
                }
                constructor.valueParameter_ = this.f65852f;
                if ((this.f65850d & 4) == 4) {
                    this.f65853g = Collections.unmodifiableList(this.f65853g);
                    this.f65850d &= -5;
                }
                constructor.versionRequirement_ = this.f65853g;
                if ((this.f65850d & 8) == 8) {
                    this.f65854h = Collections.unmodifiableList(this.f65854h);
                    this.f65850d &= -9;
                }
                constructor.compilerPluginData_ = this.f65854h;
                if ((this.f65850d & 16) == 16) {
                    this.f65855i = Collections.unmodifiableList(this.f65855i);
                    this.f65850d &= -17;
                }
                constructor.annotation_ = this.f65855i;
                constructor.bitField0_ = i;
                return constructor;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableBuilder
            /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
            public Builder mo91414m() {
                return m91438t().mo91349f(m91446r());
            }

            /* JADX INFO: renamed from: w */
            public final void m91448w() {
                if ((this.f65850d & 2) != 2) {
                    this.f65852f = new ArrayList(this.f65852f);
                    this.f65850d |= 2;
                }
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder
            /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
            public Builder mo91349f(Constructor constructor) {
                if (constructor == Constructor.getDefaultInstance()) {
                    return this;
                }
                if (constructor.hasFlags()) {
                    m91444B(constructor.getFlags());
                }
                if (!constructor.valueParameter_.isEmpty()) {
                    if (this.f65852f.isEmpty()) {
                        this.f65852f = constructor.valueParameter_;
                        this.f65850d &= -3;
                    } else {
                        m91448w();
                        this.f65852f.addAll(constructor.valueParameter_);
                    }
                }
                if (!constructor.versionRequirement_.isEmpty()) {
                    if (this.f65853g.isEmpty()) {
                        this.f65853g = constructor.versionRequirement_;
                        this.f65850d &= -5;
                    } else {
                        m91441x();
                        this.f65853g.addAll(constructor.versionRequirement_);
                    }
                }
                if (!constructor.compilerPluginData_.isEmpty()) {
                    if (this.f65854h.isEmpty()) {
                        this.f65854h = constructor.compilerPluginData_;
                        this.f65850d &= -9;
                    } else {
                        m91440v();
                        this.f65854h.addAll(constructor.compilerPluginData_);
                    }
                }
                if (!constructor.annotation_.isEmpty()) {
                    if (this.f65855i.isEmpty()) {
                        this.f65855i = constructor.annotation_;
                        this.f65850d &= -17;
                    } else {
                        m91439u();
                        this.f65855i.addAll(constructor.annotation_);
                    }
                }
                m92228o(constructor);
                m92224j(m92223e().m92047c(constructor.unknownFields));
                return this;
            }
        }

        /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Constructor$a */
        public static class C15349a extends AbstractParser<Constructor> {
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.Parser
            /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
            public Constructor mo91378d(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
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
                                this.flags_ = codedInputStream.m92100s();
                            } else if (iM92076K == 18) {
                                if ((i & 2) != 2) {
                                    this.valueParameter_ = new ArrayList();
                                    i |= 2;
                                }
                                this.valueParameter_.add((ValueParameter) codedInputStream.m92102u(ValueParameter.PARSER, extensionRegistryLite));
                            } else if (iM92076K == 26) {
                                if ((i & 16) != 16) {
                                    this.annotation_ = new ArrayList();
                                    i |= 16;
                                }
                                this.annotation_.add((Annotation) codedInputStream.m92102u(Annotation.PARSER, extensionRegistryLite));
                            } else if (iM92076K == 248) {
                                if ((i & 4) != 4) {
                                    this.versionRequirement_ = new ArrayList();
                                    i |= 4;
                                }
                                this.versionRequirement_.add(Integer.valueOf(codedInputStream.m92100s()));
                            } else if (iM92076K == 250) {
                                int iM92091j = codedInputStream.m92091j(codedInputStream.m92067A());
                                if ((i & 4) != 4 && codedInputStream.m92088e() > 0) {
                                    this.versionRequirement_ = new ArrayList();
                                    i |= 4;
                                }
                                while (codedInputStream.m92088e() > 0) {
                                    this.versionRequirement_.add(Integer.valueOf(codedInputStream.m92100s()));
                                }
                                codedInputStream.m92090i(iM92091j);
                            } else if (iM92076K == 258) {
                                if ((i & 8) != 8) {
                                    this.compilerPluginData_ = new ArrayList();
                                    i |= 8;
                                }
                                this.compilerPluginData_.add((CompilerPluginData) codedInputStream.m92102u(CompilerPluginData.PARSER, extensionRegistryLite));
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
                        codedOutputStreamM92117K.m92149J();
                    } catch (IOException unused) {
                    } finally {
                        this.unknownFields = outputM92041w.m92061m();
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
                codedOutputStreamM92117K.m92149J();
            } catch (IOException unused2) {
            } finally {
                this.unknownFields = outputM92041w.m92061m();
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
            return newBuilder().mo91349f(constructor);
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
            int iM92134p = (this.bitField0_ & 1) == 1 ? CodedOutputStream.m92134p(1, this.flags_) : 0;
            for (int i2 = 0; i2 < this.valueParameter_.size(); i2++) {
                iM92134p += CodedOutputStream.m92138t(2, this.valueParameter_.get(i2));
            }
            for (int i3 = 0; i3 < this.annotation_.size(); i3++) {
                iM92134p += CodedOutputStream.m92138t(3, this.annotation_.get(i3));
            }
            int iM92135q = 0;
            for (int i4 = 0; i4 < this.versionRequirement_.size(); i4++) {
                iM92135q += CodedOutputStream.m92135q(this.versionRequirement_.get(i4).intValue());
            }
            int size = iM92134p + iM92135q + (getVersionRequirementList().size() * 2);
            for (int i5 = 0; i5 < this.compilerPluginData_.size(); i5++) {
                size += CodedOutputStream.m92138t(32, this.compilerPluginData_.get(i5));
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
                codedOutputStream.m92168e0(1, this.flags_);
            }
            for (int i = 0; i < this.valueParameter_.size(); i++) {
                codedOutputStream.m92171h0(2, this.valueParameter_.get(i));
            }
            for (int i2 = 0; i2 < this.annotation_.size(); i2++) {
                codedOutputStream.m92171h0(3, this.annotation_.get(i2));
            }
            for (int i3 = 0; i3 < this.versionRequirement_.size(); i3++) {
                codedOutputStream.m92168e0(31, this.versionRequirement_.get(i3).intValue());
            }
            for (int i4 = 0; i4 < this.compilerPluginData_.size(); i4++) {
                codedOutputStream.m92171h0(32, this.compilerPluginData_.get(i4));
            }
            extensionWriterNewExtensionWriter.m92229a(19000, codedOutputStream);
            codedOutputStream.m92176m0(this.unknownFields);
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
            return Builder.m91438t();
        }

        private Constructor(GeneratedMessageLite.ExtendableBuilder<Constructor, ?> extendableBuilder) {
            super(extendableBuilder);
            this.memoizedIsInitialized = (byte) -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = extendableBuilder.m92223e();
        }

        private Constructor(boolean z) {
            this.memoizedIsInitialized = (byte) -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = ByteString.f66289a;
        }
    }

    public static final class Contract extends GeneratedMessageLite implements ContractOrBuilder {
        public static Parser<Contract> PARSER = new C15350a();
        private static final Contract defaultInstance;
        private List<Effect> effect_;
        private byte memoizedIsInitialized;
        private int memoizedSerializedSize;
        private final ByteString unknownFields;

        public static final class Builder extends GeneratedMessageLite.Builder<Contract, Builder> implements ContractOrBuilder {

            /* JADX INFO: renamed from: b */
            public int f65856b;

            /* JADX INFO: renamed from: c */
            public List<Effect> f65857c = Collections.EMPTY_LIST;

            private Builder() {
                m91453q();
            }

            /* JADX INFO: renamed from: o */
            public static Builder m91452o() {
                return new Builder();
            }

            /* JADX INFO: renamed from: q */
            private void m91453q() {
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
            public Contract build() {
                Contract contractM91455m = m91455m();
                if (contractM91455m.isInitialized()) {
                    return contractM91455m;
                }
                throw AbstractMessageLite.Builder.m92024c(contractM91455m);
            }

            /* JADX INFO: renamed from: m */
            public Contract m91455m() {
                Contract contract = new Contract(this);
                if ((this.f65856b & 1) == 1) {
                    this.f65857c = Collections.unmodifiableList(this.f65857c);
                    this.f65856b &= -2;
                }
                contract.effect_ = this.f65857c;
                return contract;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder
            /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
            public Builder mo91414m() {
                return m91452o().mo91349f(m91455m());
            }

            /* JADX INFO: renamed from: p */
            public final void m91457p() {
                if ((this.f65856b & 1) != 1) {
                    this.f65857c = new ArrayList(this.f65857c);
                    this.f65856b |= 1;
                }
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder
            /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
            public Builder mo91349f(Contract contract) {
                if (contract == Contract.getDefaultInstance()) {
                    return this;
                }
                if (!contract.effect_.isEmpty()) {
                    if (this.f65857c.isEmpty()) {
                        this.f65857c = contract.effect_;
                        this.f65856b &= -2;
                    } else {
                        m91457p();
                        this.f65857c.addAll(contract.effect_);
                    }
                }
                m92224j(m92223e().m92047c(contract.unknownFields));
                return this;
            }

            /* JADX WARN: Code duplicated, block: B:15:0x001d  */
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
            public Builder mo91350i(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws Throwable {
                Contract contract = null;
                try {
                    try {
                        Contract contractMo91378d = Contract.PARSER.mo91378d(codedInputStream, extensionRegistryLite);
                        if (contractMo91378d != null) {
                            mo91349f(contractMo91378d);
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
                                mo91349f(contract);
                            }
                            throw th;
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                    if (contract != null) {
                        mo91349f(contract);
                    }
                    throw th;
                }
            }
        }

        /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Contract$a */
        public static class C15350a extends AbstractParser<Contract> {
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.Parser
            /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
            public Contract mo91378d(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
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
            ByteString.Output outputM92041w = ByteString.m92041w();
            CodedOutputStream codedOutputStreamM92117K = CodedOutputStream.m92117K(outputM92041w, 1);
            boolean z = false;
            boolean z2 = false;
            while (!z) {
                try {
                    try {
                        try {
                            int iM92076K = codedInputStream.m92076K();
                            if (iM92076K != 0) {
                                if (iM92076K == 10) {
                                    if (!z2) {
                                        this.effect_ = new ArrayList();
                                        z2 = true;
                                    }
                                    this.effect_.add((Effect) codedInputStream.m92102u(Effect.PARSER, extensionRegistryLite));
                                } else if (!parseUnknownField(codedInputStream, codedOutputStreamM92117K, extensionRegistryLite, iM92076K)) {
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
                        codedOutputStreamM92117K.m92149J();
                    } catch (IOException unused) {
                    } finally {
                        this.unknownFields = outputM92041w.m92061m();
                    }
                    makeExtensionsImmutable();
                    throw th;
                }
            }
            if (z2) {
                this.effect_ = Collections.unmodifiableList(this.effect_);
            }
            try {
                codedOutputStreamM92117K.m92149J();
            } catch (IOException unused2) {
            } finally {
                this.unknownFields = outputM92041w.m92061m();
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
            return newBuilder().mo91349f(contract);
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
            int iM92138t = 0;
            for (int i2 = 0; i2 < this.effect_.size(); i2++) {
                iM92138t += CodedOutputStream.m92138t(1, this.effect_.get(i2));
            }
            int size = iM92138t + this.unknownFields.size();
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
                codedOutputStream.m92171h0(1, this.effect_.get(i));
            }
            codedOutputStream.m92176m0(this.unknownFields);
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
            return Builder.m91452o();
        }

        private Contract(GeneratedMessageLite.Builder builder) {
            super(builder);
            this.memoizedIsInitialized = (byte) -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = builder.m92223e();
        }

        private Contract(boolean z) {
            this.memoizedIsInitialized = (byte) -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = ByteString.f66289a;
        }
    }

    public static final class Effect extends GeneratedMessageLite implements EffectOrBuilder {
        public static Parser<Effect> PARSER = new C15354a();
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
            public int f65858b;

            /* JADX INFO: renamed from: c */
            public EffectType f65859c = EffectType.RETURNS_CONSTANT;

            /* JADX INFO: renamed from: d */
            public List<Expression> f65860d = Collections.EMPTY_LIST;

            /* JADX INFO: renamed from: e */
            public Expression f65861e = Expression.getDefaultInstance();

            /* JADX INFO: renamed from: f */
            public InvocationKind f65862f = InvocationKind.AT_MOST_ONCE;

            /* JADX INFO: renamed from: g */
            public EffectConditionKind f65863g = EffectConditionKind.CONCLUSION_CONDITION;

            private Builder() {
                m91463q();
            }

            /* JADX INFO: renamed from: o */
            public static Builder m91462o() {
                return new Builder();
            }

            /* JADX INFO: renamed from: q */
            private void m91463q() {
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
            public Effect build() {
                Effect effectM91465m = m91465m();
                if (effectM91465m.isInitialized()) {
                    return effectM91465m;
                }
                throw AbstractMessageLite.Builder.m92024c(effectM91465m);
            }

            /* JADX INFO: renamed from: m */
            public Effect m91465m() {
                Effect effect = new Effect(this);
                int i = this.f65858b;
                int i2 = (i & 1) != 1 ? 0 : 1;
                effect.effectType_ = this.f65859c;
                if ((this.f65858b & 2) == 2) {
                    this.f65860d = Collections.unmodifiableList(this.f65860d);
                    this.f65858b &= -3;
                }
                effect.effectConstructorArgument_ = this.f65860d;
                if ((i & 4) == 4) {
                    i2 |= 2;
                }
                effect.conclusionOfConditionalEffect_ = this.f65861e;
                if ((i & 8) == 8) {
                    i2 |= 4;
                }
                effect.kind_ = this.f65862f;
                if ((i & 16) == 16) {
                    i2 |= 8;
                }
                effect.conditionKind_ = this.f65863g;
                effect.bitField0_ = i2;
                return effect;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder
            /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
            public Builder mo91414m() {
                return m91462o().mo91349f(m91465m());
            }

            /* JADX INFO: renamed from: p */
            public final void m91467p() {
                if ((this.f65858b & 2) != 2) {
                    this.f65860d = new ArrayList(this.f65860d);
                    this.f65858b |= 2;
                }
            }

            /* JADX INFO: renamed from: r */
            public Builder m91468r(Expression expression) {
                if ((this.f65858b & 4) != 4 || this.f65861e == Expression.getDefaultInstance()) {
                    this.f65861e = expression;
                } else {
                    this.f65861e = Expression.newBuilder(this.f65861e).mo91349f(expression).m91493m();
                }
                this.f65858b |= 4;
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder
            /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
            public Builder mo91349f(Effect effect) {
                if (effect == Effect.getDefaultInstance()) {
                    return this;
                }
                if (effect.hasEffectType()) {
                    m91472v(effect.getEffectType());
                }
                if (!effect.effectConstructorArgument_.isEmpty()) {
                    if (this.f65860d.isEmpty()) {
                        this.f65860d = effect.effectConstructorArgument_;
                        this.f65858b &= -3;
                    } else {
                        m91467p();
                        this.f65860d.addAll(effect.effectConstructorArgument_);
                    }
                }
                if (effect.hasConclusionOfConditionalEffect()) {
                    m91468r(effect.getConclusionOfConditionalEffect());
                }
                if (effect.hasKind()) {
                    m91473w(effect.getKind());
                }
                if (effect.hasConditionKind()) {
                    m91471u(effect.getConditionKind());
                }
                m92224j(m92223e().m92047c(effect.unknownFields));
                return this;
            }

            /* JADX WARN: Code duplicated, block: B:15:0x001d  */
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
            public Builder mo91350i(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws Throwable {
                Effect effect = null;
                try {
                    try {
                        Effect effectMo91378d = Effect.PARSER.mo91378d(codedInputStream, extensionRegistryLite);
                        if (effectMo91378d != null) {
                            mo91349f(effectMo91378d);
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
                                mo91349f(effect);
                            }
                            throw th;
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                    if (effect != null) {
                        mo91349f(effect);
                    }
                    throw th;
                }
            }

            /* JADX INFO: renamed from: u */
            public Builder m91471u(EffectConditionKind effectConditionKind) {
                effectConditionKind.getClass();
                this.f65858b |= 16;
                this.f65863g = effectConditionKind;
                return this;
            }

            /* JADX INFO: renamed from: v */
            public Builder m91472v(EffectType effectType) {
                effectType.getClass();
                this.f65858b |= 1;
                this.f65859c = effectType;
                return this;
            }

            /* JADX INFO: renamed from: w */
            public Builder m91473w(InvocationKind invocationKind) {
                invocationKind.getClass();
                this.f65858b |= 8;
                this.f65862f = invocationKind;
                return this;
            }
        }

        public enum EffectConditionKind implements Internal.EnumLite {
            CONCLUSION_CONDITION(0, 0),
            RETURNS_CONDITION(1, 1),
            HOLDSIN_CONDITION(2, 2);

            private static Internal.EnumLiteMap<EffectConditionKind> internalValueMap = new C15351a();
            private final int value;

            /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Effect$EffectConditionKind$a */
            public static class C15351a implements Internal.EnumLiteMap<EffectConditionKind> {
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

            private static Internal.EnumLiteMap<EffectType> internalValueMap = new C15352a();
            private final int value;

            /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Effect$EffectType$a */
            public static class C15352a implements Internal.EnumLiteMap<EffectType> {
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

            private static Internal.EnumLiteMap<InvocationKind> internalValueMap = new C15353a();
            private final int value;

            /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Effect$InvocationKind$a */
            public static class C15353a implements Internal.EnumLiteMap<InvocationKind> {
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
        public static class C15354a extends AbstractParser<Effect> {
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.Parser
            /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
            public Effect mo91378d(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
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
            ByteString.Output outputM92041w = ByteString.m92041w();
            CodedOutputStream codedOutputStreamM92117K = CodedOutputStream.m92117K(outputM92041w, 1);
            boolean z = false;
            char c = 0;
            while (!z) {
                try {
                    try {
                        int iM92076K = codedInputStream.m92076K();
                        if (iM92076K != 0) {
                            if (iM92076K == 8) {
                                int iM92095n = codedInputStream.m92095n();
                                EffectType effectTypeValueOf = EffectType.valueOf(iM92095n);
                                if (effectTypeValueOf == null) {
                                    codedOutputStreamM92117K.m92182s0(iM92076K);
                                    codedOutputStreamM92117K.m92182s0(iM92095n);
                                } else {
                                    this.bitField0_ |= 1;
                                    this.effectType_ = effectTypeValueOf;
                                }
                            } else if (iM92076K == 18) {
                                if ((c & 2) != 2) {
                                    this.effectConstructorArgument_ = new ArrayList();
                                    c = 2;
                                }
                                this.effectConstructorArgument_.add((Expression) codedInputStream.m92102u(Expression.PARSER, extensionRegistryLite));
                            } else if (iM92076K == 26) {
                                Expression.Builder builder = (this.bitField0_ & 2) == 2 ? this.conclusionOfConditionalEffect_.toBuilder() : null;
                                Expression expression = (Expression) codedInputStream.m92102u(Expression.PARSER, extensionRegistryLite);
                                this.conclusionOfConditionalEffect_ = expression;
                                if (builder != null) {
                                    builder.mo91349f(expression);
                                    this.conclusionOfConditionalEffect_ = builder.m91493m();
                                }
                                this.bitField0_ |= 2;
                            } else if (iM92076K == 32) {
                                int iM92095n2 = codedInputStream.m92095n();
                                InvocationKind invocationKindValueOf = InvocationKind.valueOf(iM92095n2);
                                if (invocationKindValueOf == null) {
                                    codedOutputStreamM92117K.m92182s0(iM92076K);
                                    codedOutputStreamM92117K.m92182s0(iM92095n2);
                                } else {
                                    this.bitField0_ |= 4;
                                    this.kind_ = invocationKindValueOf;
                                }
                            } else if (iM92076K == 40) {
                                int iM92095n3 = codedInputStream.m92095n();
                                EffectConditionKind effectConditionKindValueOf = EffectConditionKind.valueOf(iM92095n3);
                                if (effectConditionKindValueOf == null) {
                                    codedOutputStreamM92117K.m92182s0(iM92076K);
                                    codedOutputStreamM92117K.m92182s0(iM92095n3);
                                } else {
                                    this.bitField0_ |= 8;
                                    this.conditionKind_ = effectConditionKindValueOf;
                                }
                            } else if (!parseUnknownField(codedInputStream, codedOutputStreamM92117K, extensionRegistryLite, iM92076K)) {
                            }
                        }
                        z = true;
                    } catch (Throwable th) {
                        if ((c & 2) == 2) {
                            this.effectConstructorArgument_ = Collections.unmodifiableList(this.effectConstructorArgument_);
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
            if ((c & 2) == 2) {
                this.effectConstructorArgument_ = Collections.unmodifiableList(this.effectConstructorArgument_);
            }
            try {
                codedOutputStreamM92117K.m92149J();
            } catch (IOException unused2) {
            } finally {
                this.unknownFields = outputM92041w.m92061m();
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
            return newBuilder().mo91349f(effect);
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
            int iM92127i = (this.bitField0_ & 1) == 1 ? CodedOutputStream.m92127i(1, this.effectType_.getNumber()) : 0;
            for (int i2 = 0; i2 < this.effectConstructorArgument_.size(); i2++) {
                iM92127i += CodedOutputStream.m92138t(2, this.effectConstructorArgument_.get(i2));
            }
            if ((this.bitField0_ & 2) == 2) {
                iM92127i += CodedOutputStream.m92138t(3, this.conclusionOfConditionalEffect_);
            }
            if ((this.bitField0_ & 4) == 4) {
                iM92127i += CodedOutputStream.m92127i(4, this.kind_.getNumber());
            }
            if ((this.bitField0_ & 8) == 8) {
                iM92127i += CodedOutputStream.m92127i(5, this.conditionKind_.getNumber());
            }
            int size = iM92127i + this.unknownFields.size();
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
                codedOutputStream.m92159W(1, this.effectType_.getNumber());
            }
            for (int i = 0; i < this.effectConstructorArgument_.size(); i++) {
                codedOutputStream.m92171h0(2, this.effectConstructorArgument_.get(i));
            }
            if ((this.bitField0_ & 2) == 2) {
                codedOutputStream.m92171h0(3, this.conclusionOfConditionalEffect_);
            }
            if ((this.bitField0_ & 4) == 4) {
                codedOutputStream.m92159W(4, this.kind_.getNumber());
            }
            if ((this.bitField0_ & 8) == 8) {
                codedOutputStream.m92159W(5, this.conditionKind_.getNumber());
            }
            codedOutputStream.m92176m0(this.unknownFields);
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
            return Builder.m91462o();
        }

        private Effect(GeneratedMessageLite.Builder builder) {
            super(builder);
            this.memoizedIsInitialized = (byte) -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = builder.m92223e();
        }

        private Effect(boolean z) {
            this.memoizedIsInitialized = (byte) -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = ByteString.f66289a;
        }
    }

    public static final class EnumEntry extends GeneratedMessageLite.ExtendableMessage<EnumEntry> implements EnumEntryOrBuilder {
        public static Parser<EnumEntry> PARSER = new C15355a();
        private static final EnumEntry defaultInstance;
        private List<Annotation> annotation_;
        private int bitField0_;
        private byte memoizedIsInitialized;
        private int memoizedSerializedSize;
        private int name_;
        private final ByteString unknownFields;

        public static final class Builder extends GeneratedMessageLite.ExtendableBuilder<EnumEntry, Builder> implements EnumEntryOrBuilder {

            /* JADX INFO: renamed from: d */
            public int f65864d;

            /* JADX INFO: renamed from: e */
            public int f65865e;

            /* JADX INFO: renamed from: f */
            public List<Annotation> f65866f = Collections.EMPTY_LIST;

            private Builder() {
                m91481v();
            }

            /* JADX INFO: renamed from: t */
            public static Builder m91479t() {
                return new Builder();
            }

            /* JADX INFO: renamed from: u */
            private void m91480u() {
                if ((this.f65864d & 2) != 2) {
                    this.f65866f = new ArrayList(this.f65866f);
                    this.f65864d |= 2;
                }
            }

            /* JADX INFO: renamed from: v */
            private void m91481v() {
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
            public EnumEntry build() {
                EnumEntry enumEntryM91483r = m91483r();
                if (enumEntryM91483r.isInitialized()) {
                    return enumEntryM91483r;
                }
                throw AbstractMessageLite.Builder.m92024c(enumEntryM91483r);
            }

            /* JADX INFO: renamed from: r */
            public EnumEntry m91483r() {
                EnumEntry enumEntry = new EnumEntry(this);
                int i = (this.f65864d & 1) != 1 ? 0 : 1;
                enumEntry.name_ = this.f65865e;
                if ((this.f65864d & 2) == 2) {
                    this.f65866f = Collections.unmodifiableList(this.f65866f);
                    this.f65864d &= -3;
                }
                enumEntry.annotation_ = this.f65866f;
                enumEntry.bitField0_ = i;
                return enumEntry;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableBuilder
            /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
            public Builder mo91414m() {
                return m91479t().mo91349f(m91483r());
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder
            /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
            public Builder mo91349f(EnumEntry enumEntry) {
                if (enumEntry == EnumEntry.getDefaultInstance()) {
                    return this;
                }
                if (enumEntry.hasName()) {
                    m91487y(enumEntry.getName());
                }
                if (!enumEntry.annotation_.isEmpty()) {
                    if (this.f65866f.isEmpty()) {
                        this.f65866f = enumEntry.annotation_;
                        this.f65864d &= -3;
                    } else {
                        m91480u();
                        this.f65866f.addAll(enumEntry.annotation_);
                    }
                }
                m92228o(enumEntry);
                m92224j(m92223e().m92047c(enumEntry.unknownFields));
                return this;
            }

            /* JADX WARN: Code duplicated, block: B:15:0x001d  */
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            /* JADX INFO: renamed from: x, reason: merged with bridge method [inline-methods] */
            public Builder mo91350i(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws Throwable {
                EnumEntry enumEntry = null;
                try {
                    try {
                        EnumEntry enumEntryMo91378d = EnumEntry.PARSER.mo91378d(codedInputStream, extensionRegistryLite);
                        if (enumEntryMo91378d != null) {
                            mo91349f(enumEntryMo91378d);
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
                                mo91349f(enumEntry);
                            }
                            throw th;
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                    if (enumEntry != null) {
                        mo91349f(enumEntry);
                    }
                    throw th;
                }
            }

            /* JADX INFO: renamed from: y */
            public Builder m91487y(int i) {
                this.f65864d |= 1;
                this.f65865e = i;
                return this;
            }
        }

        /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$EnumEntry$a */
        public static class C15355a extends AbstractParser<EnumEntry> {
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.Parser
            /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
            public EnumEntry mo91378d(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
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
            ByteString.Output outputM92041w = ByteString.m92041w();
            CodedOutputStream codedOutputStreamM92117K = CodedOutputStream.m92117K(outputM92041w, 1);
            boolean z = false;
            char c = 0;
            while (!z) {
                try {
                    try {
                        int iM92076K = codedInputStream.m92076K();
                        if (iM92076K != 0) {
                            if (iM92076K == 8) {
                                this.bitField0_ |= 1;
                                this.name_ = codedInputStream.m92100s();
                            } else if (iM92076K == 18) {
                                if ((c & 2) != 2) {
                                    this.annotation_ = new ArrayList();
                                    c = 2;
                                }
                                this.annotation_.add((Annotation) codedInputStream.m92102u(Annotation.PARSER, extensionRegistryLite));
                            } else if (!parseUnknownField(codedInputStream, codedOutputStreamM92117K, extensionRegistryLite, iM92076K)) {
                            }
                        }
                        z = true;
                    } catch (Throwable th) {
                        if ((c & 2) == 2) {
                            this.annotation_ = Collections.unmodifiableList(this.annotation_);
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
            if ((c & 2) == 2) {
                this.annotation_ = Collections.unmodifiableList(this.annotation_);
            }
            try {
                codedOutputStreamM92117K.m92149J();
            } catch (IOException unused2) {
            } finally {
                this.unknownFields = outputM92041w.m92061m();
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
            return newBuilder().mo91349f(enumEntry);
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
            int iM92134p = (this.bitField0_ & 1) == 1 ? CodedOutputStream.m92134p(1, this.name_) : 0;
            for (int i2 = 0; i2 < this.annotation_.size(); i2++) {
                iM92134p += CodedOutputStream.m92138t(2, this.annotation_.get(i2));
            }
            int iExtensionsSerializedSize = iM92134p + extensionsSerializedSize() + this.unknownFields.size();
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
                codedOutputStream.m92168e0(1, this.name_);
            }
            for (int i = 0; i < this.annotation_.size(); i++) {
                codedOutputStream.m92171h0(2, this.annotation_.get(i));
            }
            extensionWriterNewExtensionWriter.m92229a(200, codedOutputStream);
            codedOutputStream.m92176m0(this.unknownFields);
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
            return Builder.m91479t();
        }

        private EnumEntry(GeneratedMessageLite.ExtendableBuilder<EnumEntry, ?> extendableBuilder) {
            super(extendableBuilder);
            this.memoizedIsInitialized = (byte) -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = extendableBuilder.m92223e();
        }

        private EnumEntry(boolean z) {
            this.memoizedIsInitialized = (byte) -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = ByteString.f66289a;
        }
    }

    public static final class Expression extends GeneratedMessageLite implements ExpressionOrBuilder {
        public static Parser<Expression> PARSER = new C15357a();
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
            public int f65867b;

            /* JADX INFO: renamed from: c */
            public int f65868c;

            /* JADX INFO: renamed from: d */
            public int f65869d;

            /* JADX INFO: renamed from: e */
            public ConstantValue f65870e = ConstantValue.TRUE;

            /* JADX INFO: renamed from: f */
            public Type f65871f = Type.getDefaultInstance();

            /* JADX INFO: renamed from: g */
            public int f65872g;

            /* JADX INFO: renamed from: h */
            public List<Expression> f65873h;

            /* JADX INFO: renamed from: i */
            public List<Expression> f65874i;

            private Builder() {
                List<Expression> list = Collections.EMPTY_LIST;
                this.f65873h = list;
                this.f65874i = list;
                m91491r();
            }

            /* JADX INFO: renamed from: o */
            public static Builder m91490o() {
                return new Builder();
            }

            /* JADX INFO: renamed from: r */
            private void m91491r() {
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
            public Expression build() {
                Expression expressionM91493m = m91493m();
                if (expressionM91493m.isInitialized()) {
                    return expressionM91493m;
                }
                throw AbstractMessageLite.Builder.m92024c(expressionM91493m);
            }

            /* JADX INFO: renamed from: m */
            public Expression m91493m() {
                Expression expression = new Expression(this);
                int i = this.f65867b;
                int i2 = (i & 1) != 1 ? 0 : 1;
                expression.flags_ = this.f65868c;
                if ((i & 2) == 2) {
                    i2 |= 2;
                }
                expression.valueParameterReference_ = this.f65869d;
                if ((i & 4) == 4) {
                    i2 |= 4;
                }
                expression.constantValue_ = this.f65870e;
                if ((i & 8) == 8) {
                    i2 |= 8;
                }
                expression.isInstanceType_ = this.f65871f;
                if ((i & 16) == 16) {
                    i2 |= 16;
                }
                expression.isInstanceTypeId_ = this.f65872g;
                if ((this.f65867b & 32) == 32) {
                    this.f65873h = Collections.unmodifiableList(this.f65873h);
                    this.f65867b &= -33;
                }
                expression.andArgument_ = this.f65873h;
                if ((this.f65867b & 64) == 64) {
                    this.f65874i = Collections.unmodifiableList(this.f65874i);
                    this.f65867b &= -65;
                }
                expression.orArgument_ = this.f65874i;
                expression.bitField0_ = i2;
                return expression;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder
            /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
            public Builder mo91414m() {
                return m91490o().mo91349f(m91493m());
            }

            /* JADX INFO: renamed from: p */
            public final void m91495p() {
                if ((this.f65867b & 32) != 32) {
                    this.f65873h = new ArrayList(this.f65873h);
                    this.f65867b |= 32;
                }
            }

            /* JADX INFO: renamed from: q */
            public final void m91496q() {
                if ((this.f65867b & 64) != 64) {
                    this.f65874i = new ArrayList(this.f65874i);
                    this.f65867b |= 64;
                }
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder
            /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
            public Builder mo91349f(Expression expression) {
                if (expression == Expression.getDefaultInstance()) {
                    return this;
                }
                if (expression.hasFlags()) {
                    m91501w(expression.getFlags());
                }
                if (expression.hasValueParameterReference()) {
                    m91503y(expression.getValueParameterReference());
                }
                if (expression.hasConstantValue()) {
                    m91500v(expression.getConstantValue());
                }
                if (expression.hasIsInstanceType()) {
                    m91499u(expression.getIsInstanceType());
                }
                if (expression.hasIsInstanceTypeId()) {
                    m91502x(expression.getIsInstanceTypeId());
                }
                if (!expression.andArgument_.isEmpty()) {
                    if (this.f65873h.isEmpty()) {
                        this.f65873h = expression.andArgument_;
                        this.f65867b &= -33;
                    } else {
                        m91495p();
                        this.f65873h.addAll(expression.andArgument_);
                    }
                }
                if (!expression.orArgument_.isEmpty()) {
                    if (this.f65874i.isEmpty()) {
                        this.f65874i = expression.orArgument_;
                        this.f65867b &= -65;
                    } else {
                        m91496q();
                        this.f65874i.addAll(expression.orArgument_);
                    }
                }
                m92224j(m92223e().m92047c(expression.unknownFields));
                return this;
            }

            /* JADX WARN: Code duplicated, block: B:15:0x001d  */
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
            public Builder mo91350i(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws Throwable {
                Expression expression = null;
                try {
                    try {
                        Expression expressionMo91378d = Expression.PARSER.mo91378d(codedInputStream, extensionRegistryLite);
                        if (expressionMo91378d != null) {
                            mo91349f(expressionMo91378d);
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
                                mo91349f(expression);
                            }
                            throw th;
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                    if (expression != null) {
                        mo91349f(expression);
                    }
                    throw th;
                }
            }

            /* JADX INFO: renamed from: u */
            public Builder m91499u(Type type) {
                if ((this.f65867b & 8) != 8 || this.f65871f == Type.getDefaultInstance()) {
                    this.f65871f = type;
                } else {
                    this.f65871f = Type.newBuilder(this.f65871f).mo91349f(type).m91655r();
                }
                this.f65867b |= 8;
                return this;
            }

            /* JADX INFO: renamed from: v */
            public Builder m91500v(ConstantValue constantValue) {
                constantValue.getClass();
                this.f65867b |= 4;
                this.f65870e = constantValue;
                return this;
            }

            /* JADX INFO: renamed from: w */
            public Builder m91501w(int i) {
                this.f65867b |= 1;
                this.f65868c = i;
                return this;
            }

            /* JADX INFO: renamed from: x */
            public Builder m91502x(int i) {
                this.f65867b |= 16;
                this.f65872g = i;
                return this;
            }

            /* JADX INFO: renamed from: y */
            public Builder m91503y(int i) {
                this.f65867b |= 2;
                this.f65869d = i;
                return this;
            }
        }

        public enum ConstantValue implements Internal.EnumLite {
            TRUE(0, 0),
            FALSE(1, 1),
            NULL(2, 2);

            private static Internal.EnumLiteMap<ConstantValue> internalValueMap = new C15356a();
            private final int value;

            /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Expression$ConstantValue$a */
            public static class C15356a implements Internal.EnumLiteMap<ConstantValue> {
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
        public static class C15357a extends AbstractParser<Expression> {
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.Parser
            /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
            public Expression mo91378d(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
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
                                this.flags_ = codedInputStream.m92100s();
                            } else if (iM92076K == 16) {
                                this.bitField0_ |= 2;
                                this.valueParameterReference_ = codedInputStream.m92100s();
                            } else if (iM92076K == 24) {
                                int iM92095n = codedInputStream.m92095n();
                                ConstantValue constantValueValueOf = ConstantValue.valueOf(iM92095n);
                                if (constantValueValueOf == null) {
                                    codedOutputStreamM92117K.m92182s0(iM92076K);
                                    codedOutputStreamM92117K.m92182s0(iM92095n);
                                } else {
                                    this.bitField0_ |= 4;
                                    this.constantValue_ = constantValueValueOf;
                                }
                            } else if (iM92076K == 34) {
                                Type.Builder builder = (this.bitField0_ & 8) == 8 ? this.isInstanceType_.toBuilder() : null;
                                Type type = (Type) codedInputStream.m92102u(Type.PARSER, extensionRegistryLite);
                                this.isInstanceType_ = type;
                                if (builder != null) {
                                    builder.mo91349f(type);
                                    this.isInstanceType_ = builder.m91655r();
                                }
                                this.bitField0_ |= 8;
                            } else if (iM92076K == 40) {
                                this.bitField0_ |= 16;
                                this.isInstanceTypeId_ = codedInputStream.m92100s();
                            } else if (iM92076K == 50) {
                                if ((i & 32) != 32) {
                                    this.andArgument_ = new ArrayList();
                                    i |= 32;
                                }
                                this.andArgument_.add((Expression) codedInputStream.m92102u(PARSER, extensionRegistryLite));
                            } else if (iM92076K == 58) {
                                if ((i & 64) != 64) {
                                    this.orArgument_ = new ArrayList();
                                    i |= 64;
                                }
                                this.orArgument_.add((Expression) codedInputStream.m92102u(PARSER, extensionRegistryLite));
                            } else if (!parseUnknownField(codedInputStream, codedOutputStreamM92117K, extensionRegistryLite, iM92076K)) {
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
            if ((i & 32) == 32) {
                this.andArgument_ = Collections.unmodifiableList(this.andArgument_);
            }
            if ((i & 64) == 64) {
                this.orArgument_ = Collections.unmodifiableList(this.orArgument_);
            }
            try {
                codedOutputStreamM92117K.m92149J();
            } catch (IOException unused2) {
            } finally {
                this.unknownFields = outputM92041w.m92061m();
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
            return newBuilder().mo91349f(expression);
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
            int iM92134p = (this.bitField0_ & 1) == 1 ? CodedOutputStream.m92134p(1, this.flags_) : 0;
            if ((this.bitField0_ & 2) == 2) {
                iM92134p += CodedOutputStream.m92134p(2, this.valueParameterReference_);
            }
            if ((this.bitField0_ & 4) == 4) {
                iM92134p += CodedOutputStream.m92127i(3, this.constantValue_.getNumber());
            }
            if ((this.bitField0_ & 8) == 8) {
                iM92134p += CodedOutputStream.m92138t(4, this.isInstanceType_);
            }
            if ((this.bitField0_ & 16) == 16) {
                iM92134p += CodedOutputStream.m92134p(5, this.isInstanceTypeId_);
            }
            for (int i2 = 0; i2 < this.andArgument_.size(); i2++) {
                iM92134p += CodedOutputStream.m92138t(6, this.andArgument_.get(i2));
            }
            for (int i3 = 0; i3 < this.orArgument_.size(); i3++) {
                iM92134p += CodedOutputStream.m92138t(7, this.orArgument_.get(i3));
            }
            int size = iM92134p + this.unknownFields.size();
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
                codedOutputStream.m92168e0(1, this.flags_);
            }
            if ((this.bitField0_ & 2) == 2) {
                codedOutputStream.m92168e0(2, this.valueParameterReference_);
            }
            if ((this.bitField0_ & 4) == 4) {
                codedOutputStream.m92159W(3, this.constantValue_.getNumber());
            }
            if ((this.bitField0_ & 8) == 8) {
                codedOutputStream.m92171h0(4, this.isInstanceType_);
            }
            if ((this.bitField0_ & 16) == 16) {
                codedOutputStream.m92168e0(5, this.isInstanceTypeId_);
            }
            for (int i = 0; i < this.andArgument_.size(); i++) {
                codedOutputStream.m92171h0(6, this.andArgument_.get(i));
            }
            for (int i2 = 0; i2 < this.orArgument_.size(); i2++) {
                codedOutputStream.m92171h0(7, this.orArgument_.get(i2));
            }
            codedOutputStream.m92176m0(this.unknownFields);
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
            return Builder.m91490o();
        }

        private Expression(GeneratedMessageLite.Builder builder) {
            super(builder);
            this.memoizedIsInitialized = (byte) -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = builder.m92223e();
        }

        private Expression(boolean z) {
            this.memoizedIsInitialized = (byte) -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = ByteString.f66289a;
        }
    }

    public static final class Function extends GeneratedMessageLite.ExtendableMessage<Function> implements FunctionOrBuilder {
        public static Parser<Function> PARSER = new C15358a();
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
            public int f65875d;

            /* JADX INFO: renamed from: g */
            public int f65878g;

            /* JADX INFO: renamed from: i */
            public int f65880i;

            /* JADX INFO: renamed from: j */
            public List<TypeParameter> f65881j;

            /* JADX INFO: renamed from: k */
            public Type f65882k;

            /* JADX INFO: renamed from: l */
            public int f65883l;

            /* JADX INFO: renamed from: m */
            public List<Type> f65884m;

            /* JADX INFO: renamed from: n */
            public List<Integer> f65885n;

            /* JADX INFO: renamed from: o */
            public List<ValueParameter> f65886o;

            /* JADX INFO: renamed from: p */
            public List<ValueParameter> f65887p;

            /* JADX INFO: renamed from: q */
            public TypeTable f65888q;

            /* JADX INFO: renamed from: r */
            public List<Integer> f65889r;

            /* JADX INFO: renamed from: s */
            public Contract f65890s;

            /* JADX INFO: renamed from: t */
            public List<CompilerPluginData> f65891t;

            /* JADX INFO: renamed from: u */
            public List<Annotation> f65892u;

            /* JADX INFO: renamed from: v */
            public List<Annotation> f65893v;

            /* JADX INFO: renamed from: e */
            public int f65876e = 6;

            /* JADX INFO: renamed from: f */
            public int f65877f = 6;

            /* JADX INFO: renamed from: h */
            public Type f65879h = Type.getDefaultInstance();

            private Builder() {
                List list = Collections.EMPTY_LIST;
                this.f65881j = list;
                this.f65882k = Type.getDefaultInstance();
                this.f65884m = list;
                this.f65885n = list;
                this.f65886o = list;
                this.f65887p = list;
                this.f65888q = TypeTable.getDefaultInstance();
                this.f65889r = list;
                this.f65890s = Contract.getDefaultInstance();
                this.f65891t = list;
                this.f65892u = list;
                this.f65893v = list;
                m91509D();
            }

            /* JADX INFO: renamed from: A */
            private void m91506A() {
                if ((this.f65875d & 32) != 32) {
                    this.f65881j = new ArrayList(this.f65881j);
                    this.f65875d |= 32;
                }
            }

            /* JADX INFO: renamed from: B */
            private void m91507B() {
                if ((this.f65875d & 2048) != 2048) {
                    this.f65887p = new ArrayList(this.f65887p);
                    this.f65875d |= 2048;
                }
            }

            /* JADX INFO: renamed from: C */
            private void m91508C() {
                if ((this.f65875d & 8192) != 8192) {
                    this.f65889r = new ArrayList(this.f65889r);
                    this.f65875d |= 8192;
                }
            }

            /* JADX INFO: renamed from: D */
            private void m91509D() {
            }

            /* JADX INFO: renamed from: t */
            public static Builder m91511t() {
                return new Builder();
            }

            /* JADX INFO: renamed from: u */
            private void m91512u() {
                if ((this.f65875d & 65536) != 65536) {
                    this.f65892u = new ArrayList(this.f65892u);
                    this.f65875d |= 65536;
                }
            }

            /* JADX INFO: renamed from: v */
            private void m91513v() {
                if ((this.f65875d & 32768) != 32768) {
                    this.f65891t = new ArrayList(this.f65891t);
                    this.f65875d |= 32768;
                }
            }

            /* JADX INFO: renamed from: x */
            private void m91514x() {
                if ((this.f65875d & 512) != 512) {
                    this.f65885n = new ArrayList(this.f65885n);
                    this.f65875d |= 512;
                }
            }

            /* JADX INFO: renamed from: y */
            private void m91515y() {
                if ((this.f65875d & 256) != 256) {
                    this.f65884m = new ArrayList(this.f65884m);
                    this.f65875d |= 256;
                }
            }

            /* JADX INFO: renamed from: E */
            public Builder m91516E(Contract contract) {
                if ((this.f65875d & 16384) != 16384 || this.f65890s == Contract.getDefaultInstance()) {
                    this.f65890s = contract;
                } else {
                    this.f65890s = Contract.newBuilder(this.f65890s).mo91349f(contract).m91455m();
                }
                this.f65875d |= 16384;
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder
            /* JADX INFO: renamed from: G, reason: merged with bridge method [inline-methods] */
            public Builder mo91349f(Function function) {
                if (function == Function.getDefaultInstance()) {
                    return this;
                }
                if (function.hasFlags()) {
                    m91522O(function.getFlags());
                }
                if (function.hasOldFlags()) {
                    m91524Q(function.getOldFlags());
                }
                if (function.hasName()) {
                    m91523P(function.getName());
                }
                if (function.hasReturnType()) {
                    m91520M(function.getReturnType());
                }
                if (function.hasReturnTypeId()) {
                    m91526S(function.getReturnTypeId());
                }
                if (!function.typeParameter_.isEmpty()) {
                    if (this.f65881j.isEmpty()) {
                        this.f65881j = function.typeParameter_;
                        this.f65875d &= -33;
                    } else {
                        m91506A();
                        this.f65881j.addAll(function.typeParameter_);
                    }
                }
                if (function.hasReceiverType()) {
                    m91519L(function.getReceiverType());
                }
                if (function.hasReceiverTypeId()) {
                    m91525R(function.getReceiverTypeId());
                }
                if (!function.contextReceiverType_.isEmpty()) {
                    if (this.f65884m.isEmpty()) {
                        this.f65884m = function.contextReceiverType_;
                        this.f65875d &= -257;
                    } else {
                        m91515y();
                        this.f65884m.addAll(function.contextReceiverType_);
                    }
                }
                if (!function.contextReceiverTypeId_.isEmpty()) {
                    if (this.f65885n.isEmpty()) {
                        this.f65885n = function.contextReceiverTypeId_;
                        this.f65875d &= -513;
                    } else {
                        m91514x();
                        this.f65885n.addAll(function.contextReceiverTypeId_);
                    }
                }
                if (!function.contextParameter_.isEmpty()) {
                    if (this.f65886o.isEmpty()) {
                        this.f65886o = function.contextParameter_;
                        this.f65875d &= ErrorCode.ERROR_CODE_JOIN_ROOM_ROOM_FORBIDDEN;
                    } else {
                        m91530w();
                        this.f65886o.addAll(function.contextParameter_);
                    }
                }
                if (!function.valueParameter_.isEmpty()) {
                    if (this.f65887p.isEmpty()) {
                        this.f65887p = function.valueParameter_;
                        this.f65875d &= -2049;
                    } else {
                        m91507B();
                        this.f65887p.addAll(function.valueParameter_);
                    }
                }
                if (function.hasTypeTable()) {
                    m91521N(function.getTypeTable());
                }
                if (!function.versionRequirement_.isEmpty()) {
                    if (this.f65889r.isEmpty()) {
                        this.f65889r = function.versionRequirement_;
                        this.f65875d &= -8193;
                    } else {
                        m91508C();
                        this.f65889r.addAll(function.versionRequirement_);
                    }
                }
                if (function.hasContract()) {
                    m91516E(function.getContract());
                }
                if (!function.compilerPluginData_.isEmpty()) {
                    if (this.f65891t.isEmpty()) {
                        this.f65891t = function.compilerPluginData_;
                        this.f65875d &= -32769;
                    } else {
                        m91513v();
                        this.f65891t.addAll(function.compilerPluginData_);
                    }
                }
                if (!function.annotation_.isEmpty()) {
                    if (this.f65892u.isEmpty()) {
                        this.f65892u = function.annotation_;
                        this.f65875d &= -65537;
                    } else {
                        m91512u();
                        this.f65892u.addAll(function.annotation_);
                    }
                }
                if (!function.extensionReceiverAnnotation_.isEmpty()) {
                    if (this.f65893v.isEmpty()) {
                        this.f65893v = function.extensionReceiverAnnotation_;
                        this.f65875d &= -131073;
                    } else {
                        m91531z();
                        this.f65893v.addAll(function.extensionReceiverAnnotation_);
                    }
                }
                m92228o(function);
                m92224j(m92223e().m92047c(function.unknownFields));
                return this;
            }

            /* JADX WARN: Code duplicated, block: B:15:0x001d  */
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            /* JADX INFO: renamed from: K, reason: merged with bridge method [inline-methods] */
            public Builder mo91350i(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws Throwable {
                Function function = null;
                try {
                    try {
                        Function functionMo91378d = Function.PARSER.mo91378d(codedInputStream, extensionRegistryLite);
                        if (functionMo91378d != null) {
                            mo91349f(functionMo91378d);
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
                                mo91349f(function);
                            }
                            throw th;
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                    if (function != null) {
                        mo91349f(function);
                    }
                    throw th;
                }
            }

            /* JADX INFO: renamed from: L */
            public Builder m91519L(Type type) {
                if ((this.f65875d & 64) != 64 || this.f65882k == Type.getDefaultInstance()) {
                    this.f65882k = type;
                } else {
                    this.f65882k = Type.newBuilder(this.f65882k).mo91349f(type).m91655r();
                }
                this.f65875d |= 64;
                return this;
            }

            /* JADX INFO: renamed from: M */
            public Builder m91520M(Type type) {
                if ((this.f65875d & 8) != 8 || this.f65879h == Type.getDefaultInstance()) {
                    this.f65879h = type;
                } else {
                    this.f65879h = Type.newBuilder(this.f65879h).mo91349f(type).m91655r();
                }
                this.f65875d |= 8;
                return this;
            }

            /* JADX INFO: renamed from: N */
            public Builder m91521N(TypeTable typeTable) {
                if ((this.f65875d & 4096) != 4096 || this.f65888q == TypeTable.getDefaultInstance()) {
                    this.f65888q = typeTable;
                } else {
                    this.f65888q = TypeTable.newBuilder(this.f65888q).mo91349f(typeTable).m91701m();
                }
                this.f65875d |= 4096;
                return this;
            }

            /* JADX INFO: renamed from: O */
            public Builder m91522O(int i) {
                this.f65875d |= 1;
                this.f65876e = i;
                return this;
            }

            /* JADX INFO: renamed from: P */
            public Builder m91523P(int i) {
                this.f65875d |= 4;
                this.f65878g = i;
                return this;
            }

            /* JADX INFO: renamed from: Q */
            public Builder m91524Q(int i) {
                this.f65875d |= 2;
                this.f65877f = i;
                return this;
            }

            /* JADX INFO: renamed from: R */
            public Builder m91525R(int i) {
                this.f65875d |= 128;
                this.f65883l = i;
                return this;
            }

            /* JADX INFO: renamed from: S */
            public Builder m91526S(int i) {
                this.f65875d |= 16;
                this.f65880i = i;
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
            public Function build() {
                Function functionM91528r = m91528r();
                if (functionM91528r.isInitialized()) {
                    return functionM91528r;
                }
                throw AbstractMessageLite.Builder.m92024c(functionM91528r);
            }

            /* JADX INFO: renamed from: r */
            public Function m91528r() {
                Function function = new Function(this);
                int i = this.f65875d;
                int i2 = (i & 1) != 1 ? 0 : 1;
                function.flags_ = this.f65876e;
                if ((i & 2) == 2) {
                    i2 |= 2;
                }
                function.oldFlags_ = this.f65877f;
                if ((i & 4) == 4) {
                    i2 |= 4;
                }
                function.name_ = this.f65878g;
                if ((i & 8) == 8) {
                    i2 |= 8;
                }
                function.returnType_ = this.f65879h;
                if ((i & 16) == 16) {
                    i2 |= 16;
                }
                function.returnTypeId_ = this.f65880i;
                if ((this.f65875d & 32) == 32) {
                    this.f65881j = Collections.unmodifiableList(this.f65881j);
                    this.f65875d &= -33;
                }
                function.typeParameter_ = this.f65881j;
                if ((i & 64) == 64) {
                    i2 |= 32;
                }
                function.receiverType_ = this.f65882k;
                if ((i & 128) == 128) {
                    i2 |= 64;
                }
                function.receiverTypeId_ = this.f65883l;
                if ((this.f65875d & 256) == 256) {
                    this.f65884m = Collections.unmodifiableList(this.f65884m);
                    this.f65875d &= -257;
                }
                function.contextReceiverType_ = this.f65884m;
                if ((this.f65875d & 512) == 512) {
                    this.f65885n = Collections.unmodifiableList(this.f65885n);
                    this.f65875d &= -513;
                }
                function.contextReceiverTypeId_ = this.f65885n;
                if ((this.f65875d & 1024) == 1024) {
                    this.f65886o = Collections.unmodifiableList(this.f65886o);
                    this.f65875d &= ErrorCode.ERROR_CODE_JOIN_ROOM_ROOM_FORBIDDEN;
                }
                function.contextParameter_ = this.f65886o;
                if ((this.f65875d & 2048) == 2048) {
                    this.f65887p = Collections.unmodifiableList(this.f65887p);
                    this.f65875d &= -2049;
                }
                function.valueParameter_ = this.f65887p;
                if ((i & 4096) == 4096) {
                    i2 |= 128;
                }
                function.typeTable_ = this.f65888q;
                if ((this.f65875d & 8192) == 8192) {
                    this.f65889r = Collections.unmodifiableList(this.f65889r);
                    this.f65875d &= -8193;
                }
                function.versionRequirement_ = this.f65889r;
                if ((i & 16384) == 16384) {
                    i2 |= 256;
                }
                function.contract_ = this.f65890s;
                if ((this.f65875d & 32768) == 32768) {
                    this.f65891t = Collections.unmodifiableList(this.f65891t);
                    this.f65875d &= -32769;
                }
                function.compilerPluginData_ = this.f65891t;
                if ((this.f65875d & 65536) == 65536) {
                    this.f65892u = Collections.unmodifiableList(this.f65892u);
                    this.f65875d &= -65537;
                }
                function.annotation_ = this.f65892u;
                if ((this.f65875d & 131072) == 131072) {
                    this.f65893v = Collections.unmodifiableList(this.f65893v);
                    this.f65875d &= -131073;
                }
                function.extensionReceiverAnnotation_ = this.f65893v;
                function.bitField0_ = i2;
                return function;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableBuilder
            /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
            public Builder mo91414m() {
                return m91511t().mo91349f(m91528r());
            }

            /* JADX INFO: renamed from: w */
            public final void m91530w() {
                if ((this.f65875d & 1024) != 1024) {
                    this.f65886o = new ArrayList(this.f65886o);
                    this.f65875d |= 1024;
                }
            }

            /* JADX INFO: renamed from: z */
            public final void m91531z() {
                if ((this.f65875d & 131072) != 131072) {
                    this.f65893v = new ArrayList(this.f65893v);
                    this.f65875d |= 131072;
                }
            }
        }

        /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Function$a */
        public static class C15358a extends AbstractParser<Function> {
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.Parser
            /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
            public Function mo91378d(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
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
            ByteString.Output outputM92041w = ByteString.m92041w();
            boolean z = true;
            CodedOutputStream codedOutputStreamM92117K = CodedOutputStream.m92117K(outputM92041w, 1);
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
                        codedOutputStreamM92117K.m92149J();
                    } catch (IOException unused) {
                    } finally {
                        this.unknownFields = outputM92041w.m92061m();
                    }
                    makeExtensionsImmutable();
                    return;
                }
                try {
                    int iM92076K = codedInputStream.m92076K();
                    switch (iM92076K) {
                        case 0:
                            z2 = z3;
                            z = z3;
                            break;
                        case 8:
                            this.bitField0_ |= 2;
                            this.oldFlags_ = codedInputStream.m92100s();
                            z = z3;
                            break;
                        case 16:
                            this.bitField0_ |= 4;
                            this.name_ = codedInputStream.m92100s();
                            z = z3;
                            break;
                        case 26:
                            Type.Builder builder = (this.bitField0_ & 8) == 8 ? this.returnType_.toBuilder() : null;
                            Type type = (Type) codedInputStream.m92102u(Type.PARSER, extensionRegistryLite);
                            this.returnType_ = type;
                            if (builder != 0) {
                                builder.mo91349f(type);
                                this.returnType_ = builder.m91655r();
                            }
                            this.bitField0_ |= 8;
                            z = z3;
                            break;
                        case 34:
                            if ((i2 & 32) != 32) {
                                this.typeParameter_ = new ArrayList();
                                i2 |= 32;
                            }
                            this.typeParameter_.add((TypeParameter) codedInputStream.m92102u(TypeParameter.PARSER, extensionRegistryLite));
                            z = z3;
                            break;
                        case 42:
                            Type.Builder builder2 = (this.bitField0_ & 32) == 32 ? this.receiverType_.toBuilder() : null;
                            Type type2 = (Type) codedInputStream.m92102u(Type.PARSER, extensionRegistryLite);
                            this.receiverType_ = type2;
                            if (builder2 != 0) {
                                builder2.mo91349f(type2);
                                this.receiverType_ = builder2.m91655r();
                            }
                            this.bitField0_ |= 32;
                            z = z3;
                            break;
                        case 50:
                            if ((i2 & 2048) != 2048) {
                                this.valueParameter_ = new ArrayList();
                                i2 |= 2048;
                            }
                            this.valueParameter_.add((ValueParameter) codedInputStream.m92102u(ValueParameter.PARSER, extensionRegistryLite));
                            z = z3;
                            break;
                        case 56:
                            this.bitField0_ |= 16;
                            this.returnTypeId_ = codedInputStream.m92100s();
                            z = z3;
                            break;
                        case 64:
                            this.bitField0_ |= 64;
                            this.receiverTypeId_ = codedInputStream.m92100s();
                            z = z3;
                            break;
                        case 72:
                            this.bitField0_ |= 1;
                            this.flags_ = codedInputStream.m92100s();
                            z = z3;
                            break;
                        case EACTags.COMMAND_TO_PERFORM /* 82 */:
                            if ((i2 & 256) != 256) {
                                this.contextReceiverType_ = new ArrayList();
                                i2 |= 256;
                            }
                            this.contextReceiverType_.add((Type) codedInputStream.m92102u(Type.PARSER, extensionRegistryLite));
                            z = z3;
                            break;
                        case 88:
                            if ((i2 & 512) != 512) {
                                this.contextReceiverTypeId_ = new ArrayList();
                                i2 |= 512;
                            }
                            this.contextReceiverTypeId_.add(Integer.valueOf(codedInputStream.m92100s()));
                            z = z3;
                            break;
                        case 90:
                            int iM92091j = codedInputStream.m92091j(codedInputStream.m92067A());
                            if ((i2 & 512) != 512 && codedInputStream.m92088e() > 0) {
                                this.contextReceiverTypeId_ = new ArrayList();
                                i2 |= 512;
                            }
                            while (codedInputStream.m92088e() > 0) {
                                this.contextReceiverTypeId_.add(Integer.valueOf(codedInputStream.m92100s()));
                            }
                            codedInputStream.m92090i(iM92091j);
                            z = z3;
                            break;
                        case EACTags.FCP_TEMPLATE /* 98 */:
                            if ((i2 & 65536) != 65536) {
                                this.annotation_ = new ArrayList();
                                i2 |= 65536;
                            }
                            this.annotation_.add((Annotation) codedInputStream.m92102u(Annotation.PARSER, extensionRegistryLite));
                            z = z3;
                            break;
                        case 106:
                            if ((i2 & 1024) != 1024) {
                                this.contextParameter_ = new ArrayList();
                                i2 |= 1024;
                            }
                            this.contextParameter_.add((ValueParameter) codedInputStream.m92102u(ValueParameter.PARSER, extensionRegistryLite));
                            z = z3;
                            break;
                        case 242:
                            TypeTable.Builder builder3 = (this.bitField0_ & 128) == 128 ? this.typeTable_.toBuilder() : null;
                            TypeTable typeTable = (TypeTable) codedInputStream.m92102u(TypeTable.PARSER, extensionRegistryLite);
                            this.typeTable_ = typeTable;
                            if (builder3 != 0) {
                                builder3.mo91349f(typeTable);
                                this.typeTable_ = builder3.m91701m();
                            }
                            this.bitField0_ |= 128;
                            z = z3;
                            break;
                        case 248:
                            if ((i2 & 8192) != 8192) {
                                this.versionRequirement_ = new ArrayList();
                                i2 |= 8192;
                            }
                            this.versionRequirement_.add(Integer.valueOf(codedInputStream.m92100s()));
                            z = z3;
                            break;
                        case 250:
                            i4 = 131072;
                            int iM92091j2 = codedInputStream.m92091j(codedInputStream.m92067A());
                            if ((i2 & 8192) != 8192 && codedInputStream.m92088e() > 0) {
                                this.versionRequirement_ = new ArrayList();
                                i2 |= 8192;
                            }
                            while (codedInputStream.m92088e() > 0) {
                                i = i3;
                                try {
                                    try {
                                        this.versionRequirement_.add(Integer.valueOf(codedInputStream.m92100s()));
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
                                            codedOutputStreamM92117K.m92149J();
                                            break;
                                        } catch (IOException unused2) {
                                        } finally {
                                            this.unknownFields = outputM92041w.m92061m();
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
                            codedInputStream.m92090i(iM92091j2);
                            z = z3;
                            break;
                        case 258:
                            Contract.Builder builder4 = (this.bitField0_ & 256) == 256 ? this.contract_.toBuilder() : null;
                            Contract contract = (Contract) codedInputStream.m92102u(Contract.PARSER, extensionRegistryLite);
                            this.contract_ = contract;
                            if (builder4 != 0) {
                                builder4.mo91349f(contract);
                                this.contract_ = builder4.m91455m();
                            }
                            this.bitField0_ |= 256;
                            z = z3;
                            break;
                        case 266:
                            if ((i2 & 32768) != 32768) {
                                this.compilerPluginData_ = new ArrayList();
                                i2 |= 32768;
                            }
                            this.compilerPluginData_.add((CompilerPluginData) codedInputStream.m92102u(CompilerPluginData.PARSER, extensionRegistryLite));
                            z = z3;
                            break;
                        case 274:
                            if ((i2 & 131072) != 131072) {
                                this.extensionReceiverAnnotation_ = new ArrayList();
                                i2 |= 131072;
                            }
                            try {
                                try {
                                    this.extensionReceiverAnnotation_.add((Annotation) codedInputStream.m92102u(Annotation.PARSER, extensionRegistryLite));
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
                                    codedOutputStreamM92117K.m92149J();
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
                            if (!parseUnknownField(codedInputStream, codedOutputStreamM92117K, extensionRegistryLite, iM92076K)) {
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
            return newBuilder().mo91349f(function);
        }

        public static Function parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return PARSER.mo92026b(inputStream, extensionRegistryLite);
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
            int iM92134p = (this.bitField0_ & 2) == 2 ? CodedOutputStream.m92134p(1, this.oldFlags_) : 0;
            if ((this.bitField0_ & 4) == 4) {
                iM92134p += CodedOutputStream.m92134p(2, this.name_);
            }
            if ((this.bitField0_ & 8) == 8) {
                iM92134p += CodedOutputStream.m92138t(3, this.returnType_);
            }
            for (int i2 = 0; i2 < this.typeParameter_.size(); i2++) {
                iM92134p += CodedOutputStream.m92138t(4, this.typeParameter_.get(i2));
            }
            if ((this.bitField0_ & 32) == 32) {
                iM92134p += CodedOutputStream.m92138t(5, this.receiverType_);
            }
            for (int i3 = 0; i3 < this.valueParameter_.size(); i3++) {
                iM92134p += CodedOutputStream.m92138t(6, this.valueParameter_.get(i3));
            }
            if ((this.bitField0_ & 16) == 16) {
                iM92134p += CodedOutputStream.m92134p(7, this.returnTypeId_);
            }
            if ((this.bitField0_ & 64) == 64) {
                iM92134p += CodedOutputStream.m92134p(8, this.receiverTypeId_);
            }
            if ((this.bitField0_ & 1) == 1) {
                iM92134p += CodedOutputStream.m92134p(9, this.flags_);
            }
            for (int i4 = 0; i4 < this.contextReceiverType_.size(); i4++) {
                iM92134p += CodedOutputStream.m92138t(10, this.contextReceiverType_.get(i4));
            }
            int iM92135q = 0;
            for (int i5 = 0; i5 < this.contextReceiverTypeId_.size(); i5++) {
                iM92135q += CodedOutputStream.m92135q(this.contextReceiverTypeId_.get(i5).intValue());
            }
            int iM92138t = iM92134p + iM92135q;
            if (!getContextReceiverTypeIdList().isEmpty()) {
                iM92138t = iM92138t + 1 + CodedOutputStream.m92135q(iM92135q);
            }
            this.contextReceiverTypeIdMemoizedSerializedSize = iM92135q;
            for (int i6 = 0; i6 < this.annotation_.size(); i6++) {
                iM92138t += CodedOutputStream.m92138t(12, this.annotation_.get(i6));
            }
            for (int i7 = 0; i7 < this.contextParameter_.size(); i7++) {
                iM92138t += CodedOutputStream.m92138t(13, this.contextParameter_.get(i7));
            }
            if ((this.bitField0_ & 128) == 128) {
                iM92138t += CodedOutputStream.m92138t(30, this.typeTable_);
            }
            int iM92135q2 = 0;
            for (int i8 = 0; i8 < this.versionRequirement_.size(); i8++) {
                iM92135q2 += CodedOutputStream.m92135q(this.versionRequirement_.get(i8).intValue());
            }
            int size = iM92138t + iM92135q2 + (getVersionRequirementList().size() * 2);
            if ((this.bitField0_ & 256) == 256) {
                size += CodedOutputStream.m92138t(32, this.contract_);
            }
            for (int i9 = 0; i9 < this.compilerPluginData_.size(); i9++) {
                size += CodedOutputStream.m92138t(33, this.compilerPluginData_.get(i9));
            }
            for (int i10 = 0; i10 < this.extensionReceiverAnnotation_.size(); i10++) {
                size += CodedOutputStream.m92138t(34, this.extensionReceiverAnnotation_.get(i10));
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
                codedOutputStream.m92168e0(1, this.oldFlags_);
            }
            if ((this.bitField0_ & 4) == 4) {
                codedOutputStream.m92168e0(2, this.name_);
            }
            if ((this.bitField0_ & 8) == 8) {
                codedOutputStream.m92171h0(3, this.returnType_);
            }
            for (int i = 0; i < this.typeParameter_.size(); i++) {
                codedOutputStream.m92171h0(4, this.typeParameter_.get(i));
            }
            if ((this.bitField0_ & 32) == 32) {
                codedOutputStream.m92171h0(5, this.receiverType_);
            }
            for (int i2 = 0; i2 < this.valueParameter_.size(); i2++) {
                codedOutputStream.m92171h0(6, this.valueParameter_.get(i2));
            }
            if ((this.bitField0_ & 16) == 16) {
                codedOutputStream.m92168e0(7, this.returnTypeId_);
            }
            if ((this.bitField0_ & 64) == 64) {
                codedOutputStream.m92168e0(8, this.receiverTypeId_);
            }
            if ((this.bitField0_ & 1) == 1) {
                codedOutputStream.m92168e0(9, this.flags_);
            }
            for (int i3 = 0; i3 < this.contextReceiverType_.size(); i3++) {
                codedOutputStream.m92171h0(10, this.contextReceiverType_.get(i3));
            }
            if (getContextReceiverTypeIdList().size() > 0) {
                codedOutputStream.m92182s0(90);
                codedOutputStream.m92182s0(this.contextReceiverTypeIdMemoizedSerializedSize);
            }
            for (int i4 = 0; i4 < this.contextReceiverTypeId_.size(); i4++) {
                codedOutputStream.m92169f0(this.contextReceiverTypeId_.get(i4).intValue());
            }
            for (int i5 = 0; i5 < this.annotation_.size(); i5++) {
                codedOutputStream.m92171h0(12, this.annotation_.get(i5));
            }
            for (int i6 = 0; i6 < this.contextParameter_.size(); i6++) {
                codedOutputStream.m92171h0(13, this.contextParameter_.get(i6));
            }
            if ((this.bitField0_ & 128) == 128) {
                codedOutputStream.m92171h0(30, this.typeTable_);
            }
            for (int i7 = 0; i7 < this.versionRequirement_.size(); i7++) {
                codedOutputStream.m92168e0(31, this.versionRequirement_.get(i7).intValue());
            }
            if ((this.bitField0_ & 256) == 256) {
                codedOutputStream.m92171h0(32, this.contract_);
            }
            for (int i8 = 0; i8 < this.compilerPluginData_.size(); i8++) {
                codedOutputStream.m92171h0(33, this.compilerPluginData_.get(i8));
            }
            for (int i9 = 0; i9 < this.extensionReceiverAnnotation_.size(); i9++) {
                codedOutputStream.m92171h0(34, this.extensionReceiverAnnotation_.get(i9));
            }
            extensionWriterNewExtensionWriter.m92229a(19000, codedOutputStream);
            codedOutputStream.m92176m0(this.unknownFields);
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
            return Builder.m91511t();
        }

        private Function(GeneratedMessageLite.ExtendableBuilder<Function, ?> extendableBuilder) {
            super(extendableBuilder);
            this.contextReceiverTypeIdMemoizedSerializedSize = -1;
            this.memoizedIsInitialized = (byte) -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = extendableBuilder.m92223e();
        }

        private Function(boolean z) {
            this.contextReceiverTypeIdMemoizedSerializedSize = -1;
            this.memoizedIsInitialized = (byte) -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = ByteString.f66289a;
        }
    }

    public static final class Package extends GeneratedMessageLite.ExtendableMessage<Package> implements PackageOrBuilder {
        public static Parser<Package> PARSER = new C15361a();
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
            public int f65894d;

            /* JADX INFO: renamed from: e */
            public List<Function> f65895e;

            /* JADX INFO: renamed from: f */
            public List<Property> f65896f;

            /* JADX INFO: renamed from: g */
            public List<TypeAlias> f65897g;

            /* JADX INFO: renamed from: h */
            public TypeTable f65898h;

            /* JADX INFO: renamed from: i */
            public VersionRequirementTable f65899i;

            private Builder() {
                List list = Collections.EMPTY_LIST;
                this.f65895e = list;
                this.f65896f = list;
                this.f65897g = list;
                this.f65898h = TypeTable.getDefaultInstance();
                this.f65899i = VersionRequirementTable.getDefaultInstance();
                m91540x();
            }

            /* JADX INFO: renamed from: t */
            public static Builder m91536t() {
                return new Builder();
            }

            /* JADX INFO: renamed from: u */
            private void m91537u() {
                if ((this.f65894d & 1) != 1) {
                    this.f65895e = new ArrayList(this.f65895e);
                    this.f65894d |= 1;
                }
            }

            /* JADX INFO: renamed from: v */
            private void m91538v() {
                if ((this.f65894d & 2) != 2) {
                    this.f65896f = new ArrayList(this.f65896f);
                    this.f65894d |= 2;
                }
            }

            /* JADX INFO: renamed from: w */
            private void m91539w() {
                if ((this.f65894d & 4) != 4) {
                    this.f65897g = new ArrayList(this.f65897g);
                    this.f65894d |= 4;
                }
            }

            /* JADX INFO: renamed from: x */
            private void m91540x() {
            }

            /* JADX INFO: renamed from: A */
            public Builder m91541A(TypeTable typeTable) {
                if ((this.f65894d & 8) != 8 || this.f65898h == TypeTable.getDefaultInstance()) {
                    this.f65898h = typeTable;
                } else {
                    this.f65898h = TypeTable.newBuilder(this.f65898h).mo91349f(typeTable).m91701m();
                }
                this.f65894d |= 8;
                return this;
            }

            /* JADX INFO: renamed from: B */
            public Builder m91542B(VersionRequirementTable versionRequirementTable) {
                if ((this.f65894d & 16) != 16 || this.f65899i == VersionRequirementTable.getDefaultInstance()) {
                    this.f65899i = versionRequirementTable;
                } else {
                    this.f65899i = VersionRequirementTable.newBuilder(this.f65899i).mo91349f(versionRequirementTable).m91746m();
                }
                this.f65894d |= 16;
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
            public Package build() {
                Package packageM91544r = m91544r();
                if (packageM91544r.isInitialized()) {
                    return packageM91544r;
                }
                throw AbstractMessageLite.Builder.m92024c(packageM91544r);
            }

            /* JADX INFO: renamed from: r */
            public Package m91544r() {
                Package r0 = new Package(this);
                int i = this.f65894d;
                if ((i & 1) == 1) {
                    this.f65895e = Collections.unmodifiableList(this.f65895e);
                    this.f65894d &= -2;
                }
                r0.function_ = this.f65895e;
                if ((this.f65894d & 2) == 2) {
                    this.f65896f = Collections.unmodifiableList(this.f65896f);
                    this.f65894d &= -3;
                }
                r0.property_ = this.f65896f;
                if ((this.f65894d & 4) == 4) {
                    this.f65897g = Collections.unmodifiableList(this.f65897g);
                    this.f65894d &= -5;
                }
                r0.typeAlias_ = this.f65897g;
                int i2 = (i & 8) != 8 ? 0 : 1;
                r0.typeTable_ = this.f65898h;
                if ((i & 16) == 16) {
                    i2 |= 2;
                }
                r0.versionRequirementTable_ = this.f65899i;
                r0.bitField0_ = i2;
                return r0;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableBuilder
            /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
            public Builder mo91414m() {
                return m91536t().mo91349f(m91544r());
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder
            /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
            public Builder mo91349f(Package r3) {
                if (r3 == Package.getDefaultInstance()) {
                    return this;
                }
                if (!r3.function_.isEmpty()) {
                    if (this.f65895e.isEmpty()) {
                        this.f65895e = r3.function_;
                        this.f65894d &= -2;
                    } else {
                        m91537u();
                        this.f65895e.addAll(r3.function_);
                    }
                }
                if (!r3.property_.isEmpty()) {
                    if (this.f65896f.isEmpty()) {
                        this.f65896f = r3.property_;
                        this.f65894d &= -3;
                    } else {
                        m91538v();
                        this.f65896f.addAll(r3.property_);
                    }
                }
                if (!r3.typeAlias_.isEmpty()) {
                    if (this.f65897g.isEmpty()) {
                        this.f65897g = r3.typeAlias_;
                        this.f65894d &= -5;
                    } else {
                        m91539w();
                        this.f65897g.addAll(r3.typeAlias_);
                    }
                }
                if (r3.hasTypeTable()) {
                    m91541A(r3.getTypeTable());
                }
                if (r3.hasVersionRequirementTable()) {
                    m91542B(r3.getVersionRequirementTable());
                }
                m92228o(r3);
                m92224j(m92223e().m92047c(r3.unknownFields));
                return this;
            }

            /* JADX WARN: Code duplicated, block: B:15:0x001d  */
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
            public Builder mo91350i(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws Throwable {
                Package r0 = null;
                try {
                    try {
                        Package packageMo91378d = Package.PARSER.mo91378d(codedInputStream, extensionRegistryLite);
                        if (packageMo91378d != null) {
                            mo91349f(packageMo91378d);
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
                                mo91349f(r0);
                            }
                            throw th;
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                    if (r0 != null) {
                        mo91349f(r0);
                    }
                    throw th;
                }
            }
        }

        /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Package$a */
        public static class C15361a extends AbstractParser<Package> {
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.Parser
            /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
            public Package mo91378d(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
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
            ByteString.Output outputM92041w = ByteString.m92041w();
            CodedOutputStream codedOutputStreamM92117K = CodedOutputStream.m92117K(outputM92041w, 1);
            boolean z = false;
            int i = 0;
            while (!z) {
                try {
                    try {
                        int iM92076K = codedInputStream.m92076K();
                        if (iM92076K != 0) {
                            if (iM92076K == 26) {
                                int i2 = (i == true ? 1 : 0) & 1;
                                i = i;
                                if (i2 != 1) {
                                    this.function_ = new ArrayList();
                                    i = (i == true ? 1 : 0) | 1;
                                }
                                this.function_.add((Function) codedInputStream.m92102u(Function.PARSER, extensionRegistryLite));
                            } else if (iM92076K == 34) {
                                int i3 = (i == true ? 1 : 0) & 2;
                                i = i;
                                if (i3 != 2) {
                                    this.property_ = new ArrayList();
                                    i = (i == true ? 1 : 0) | 2;
                                }
                                this.property_.add((Property) codedInputStream.m92102u(Property.PARSER, extensionRegistryLite));
                            } else if (iM92076K != 42) {
                                if (iM92076K == 242) {
                                    TypeTable.Builder builder = (this.bitField0_ & 1) == 1 ? this.typeTable_.toBuilder() : null;
                                    TypeTable typeTable = (TypeTable) codedInputStream.m92102u(TypeTable.PARSER, extensionRegistryLite);
                                    this.typeTable_ = typeTable;
                                    if (builder != null) {
                                        builder.mo91349f(typeTable);
                                        this.typeTable_ = builder.m91701m();
                                    }
                                    this.bitField0_ |= 1;
                                } else if (iM92076K == 258) {
                                    VersionRequirementTable.Builder builder2 = (this.bitField0_ & 2) == 2 ? this.versionRequirementTable_.toBuilder() : null;
                                    VersionRequirementTable versionRequirementTable = (VersionRequirementTable) codedInputStream.m92102u(VersionRequirementTable.PARSER, extensionRegistryLite);
                                    this.versionRequirementTable_ = versionRequirementTable;
                                    if (builder2 != null) {
                                        builder2.mo91349f(versionRequirementTable);
                                        this.versionRequirementTable_ = builder2.m91746m();
                                    }
                                    this.bitField0_ |= 2;
                                } else if (!parseUnknownField(codedInputStream, codedOutputStreamM92117K, extensionRegistryLite, iM92076K)) {
                                }
                            } else {
                                int i4 = (i == true ? 1 : 0) & 4;
                                i = i;
                                if (i4 != 4) {
                                    this.typeAlias_ = new ArrayList();
                                    i = (i == true ? 1 : 0) | 4;
                                }
                                this.typeAlias_.add((TypeAlias) codedInputStream.m92102u(TypeAlias.PARSER, extensionRegistryLite));
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
                codedOutputStreamM92117K.m92149J();
            } catch (IOException unused2) {
            } finally {
                this.unknownFields = outputM92041w.m92061m();
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
            return newBuilder().mo91349f(r1);
        }

        public static Package parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return PARSER.mo92026b(inputStream, extensionRegistryLite);
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
            int iM92138t = 0;
            for (int i2 = 0; i2 < this.function_.size(); i2++) {
                iM92138t += CodedOutputStream.m92138t(3, this.function_.get(i2));
            }
            for (int i3 = 0; i3 < this.property_.size(); i3++) {
                iM92138t += CodedOutputStream.m92138t(4, this.property_.get(i3));
            }
            for (int i4 = 0; i4 < this.typeAlias_.size(); i4++) {
                iM92138t += CodedOutputStream.m92138t(5, this.typeAlias_.get(i4));
            }
            if ((this.bitField0_ & 1) == 1) {
                iM92138t += CodedOutputStream.m92138t(30, this.typeTable_);
            }
            if ((this.bitField0_ & 2) == 2) {
                iM92138t += CodedOutputStream.m92138t(32, this.versionRequirementTable_);
            }
            int iExtensionsSerializedSize = iM92138t + extensionsSerializedSize() + this.unknownFields.size();
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
                codedOutputStream.m92171h0(3, this.function_.get(i));
            }
            for (int i2 = 0; i2 < this.property_.size(); i2++) {
                codedOutputStream.m92171h0(4, this.property_.get(i2));
            }
            for (int i3 = 0; i3 < this.typeAlias_.size(); i3++) {
                codedOutputStream.m92171h0(5, this.typeAlias_.get(i3));
            }
            if ((this.bitField0_ & 1) == 1) {
                codedOutputStream.m92171h0(30, this.typeTable_);
            }
            if ((this.bitField0_ & 2) == 2) {
                codedOutputStream.m92171h0(32, this.versionRequirementTable_);
            }
            extensionWriterNewExtensionWriter.m92229a(200, codedOutputStream);
            codedOutputStream.m92176m0(this.unknownFields);
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
            return Builder.m91536t();
        }

        private Package(GeneratedMessageLite.ExtendableBuilder<Package, ?> extendableBuilder) {
            super(extendableBuilder);
            this.memoizedIsInitialized = (byte) -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = extendableBuilder.m92223e();
        }

        private Package(boolean z) {
            this.memoizedIsInitialized = (byte) -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = ByteString.f66289a;
        }
    }

    public static final class PackageFragment extends GeneratedMessageLite.ExtendableMessage<PackageFragment> implements PackageFragmentOrBuilder {
        public static Parser<PackageFragment> PARSER = new C15362a();
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
            public int f65900d;

            /* JADX INFO: renamed from: e */
            public StringTable f65901e = StringTable.getDefaultInstance();

            /* JADX INFO: renamed from: f */
            public QualifiedNameTable f65902f = QualifiedNameTable.getDefaultInstance();

            /* JADX INFO: renamed from: g */
            public Package f65903g = Package.getDefaultInstance();

            /* JADX INFO: renamed from: h */
            public List<Class> f65904h = Collections.EMPTY_LIST;

            private Builder() {
                m91551v();
            }

            /* JADX INFO: renamed from: t */
            public static Builder m91550t() {
                return new Builder();
            }

            /* JADX INFO: renamed from: v */
            private void m91551v() {
            }

            /* JADX INFO: renamed from: A */
            public Builder m91552A(StringTable stringTable) {
                if ((this.f65900d & 1) != 1 || this.f65901e == StringTable.getDefaultInstance()) {
                    this.f65901e = stringTable;
                } else {
                    this.f65901e = StringTable.newBuilder(this.f65901e).mo91349f(stringTable).m91620m();
                }
                this.f65900d |= 1;
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
            public PackageFragment build() {
                PackageFragment packageFragmentM91554r = m91554r();
                if (packageFragmentM91554r.isInitialized()) {
                    return packageFragmentM91554r;
                }
                throw AbstractMessageLite.Builder.m92024c(packageFragmentM91554r);
            }

            /* JADX INFO: renamed from: r */
            public PackageFragment m91554r() {
                PackageFragment packageFragment = new PackageFragment(this);
                int i = this.f65900d;
                int i2 = (i & 1) != 1 ? 0 : 1;
                packageFragment.strings_ = this.f65901e;
                if ((i & 2) == 2) {
                    i2 |= 2;
                }
                packageFragment.qualifiedNames_ = this.f65902f;
                if ((i & 4) == 4) {
                    i2 |= 4;
                }
                packageFragment.package_ = this.f65903g;
                if ((this.f65900d & 8) == 8) {
                    this.f65904h = Collections.unmodifiableList(this.f65904h);
                    this.f65900d &= -9;
                }
                packageFragment.class__ = this.f65904h;
                packageFragment.bitField0_ = i2;
                return packageFragment;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableBuilder
            /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
            public Builder mo91414m() {
                return m91550t().mo91349f(m91554r());
            }

            /* JADX INFO: renamed from: u */
            public final void m91556u() {
                if ((this.f65900d & 8) != 8) {
                    this.f65904h = new ArrayList(this.f65904h);
                    this.f65900d |= 8;
                }
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder
            /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
            public Builder mo91349f(PackageFragment packageFragment) {
                if (packageFragment == PackageFragment.getDefaultInstance()) {
                    return this;
                }
                if (packageFragment.hasStrings()) {
                    m91552A(packageFragment.getStrings());
                }
                if (packageFragment.hasQualifiedNames()) {
                    m91560z(packageFragment.getQualifiedNames());
                }
                if (packageFragment.hasPackage()) {
                    m91559y(packageFragment.getPackage());
                }
                if (!packageFragment.class__.isEmpty()) {
                    if (this.f65904h.isEmpty()) {
                        this.f65904h = packageFragment.class__;
                        this.f65900d &= -9;
                    } else {
                        m91556u();
                        this.f65904h.addAll(packageFragment.class__);
                    }
                }
                m92228o(packageFragment);
                m92224j(m92223e().m92047c(packageFragment.unknownFields));
                return this;
            }

            /* JADX WARN: Code duplicated, block: B:15:0x001d  */
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            /* JADX INFO: renamed from: x, reason: merged with bridge method [inline-methods] */
            public Builder mo91350i(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws Throwable {
                PackageFragment packageFragment = null;
                try {
                    try {
                        PackageFragment packageFragmentMo91378d = PackageFragment.PARSER.mo91378d(codedInputStream, extensionRegistryLite);
                        if (packageFragmentMo91378d != null) {
                            mo91349f(packageFragmentMo91378d);
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
                                mo91349f(packageFragment);
                            }
                            throw th;
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                    if (packageFragment != null) {
                        mo91349f(packageFragment);
                    }
                    throw th;
                }
            }

            /* JADX INFO: renamed from: y */
            public Builder m91559y(Package r4) {
                if ((this.f65900d & 4) != 4 || this.f65903g == Package.getDefaultInstance()) {
                    this.f65903g = r4;
                } else {
                    this.f65903g = Package.newBuilder(this.f65903g).mo91349f(r4).m91544r();
                }
                this.f65900d |= 4;
                return this;
            }

            /* JADX INFO: renamed from: z */
            public Builder m91560z(QualifiedNameTable qualifiedNameTable) {
                if ((this.f65900d & 2) != 2 || this.f65902f == QualifiedNameTable.getDefaultInstance()) {
                    this.f65902f = qualifiedNameTable;
                } else {
                    this.f65902f = QualifiedNameTable.newBuilder(this.f65902f).mo91349f(qualifiedNameTable).m91597m();
                }
                this.f65900d |= 2;
                return this;
            }
        }

        /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$PackageFragment$a */
        public static class C15362a extends AbstractParser<PackageFragment> {
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.Parser
            /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
            public PackageFragment mo91378d(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
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
            ByteString.Output outputM92041w = ByteString.m92041w();
            CodedOutputStream codedOutputStreamM92117K = CodedOutputStream.m92117K(outputM92041w, 1);
            boolean z = false;
            char c = 0;
            while (!z) {
                try {
                    try {
                        int iM92076K = codedInputStream.m92076K();
                        if (iM92076K != 0) {
                            if (iM92076K == 10) {
                                StringTable.Builder builder = (this.bitField0_ & 1) == 1 ? this.strings_.toBuilder() : null;
                                StringTable stringTable = (StringTable) codedInputStream.m92102u(StringTable.PARSER, extensionRegistryLite);
                                this.strings_ = stringTable;
                                if (builder != null) {
                                    builder.mo91349f(stringTable);
                                    this.strings_ = builder.m91620m();
                                }
                                this.bitField0_ |= 1;
                            } else if (iM92076K == 18) {
                                QualifiedNameTable.Builder builder2 = (this.bitField0_ & 2) == 2 ? this.qualifiedNames_.toBuilder() : null;
                                QualifiedNameTable qualifiedNameTable = (QualifiedNameTable) codedInputStream.m92102u(QualifiedNameTable.PARSER, extensionRegistryLite);
                                this.qualifiedNames_ = qualifiedNameTable;
                                if (builder2 != null) {
                                    builder2.mo91349f(qualifiedNameTable);
                                    this.qualifiedNames_ = builder2.m91597m();
                                }
                                this.bitField0_ |= 2;
                            } else if (iM92076K == 26) {
                                Package.Builder builder3 = (this.bitField0_ & 4) == 4 ? this.package_.toBuilder() : null;
                                Package r6 = (Package) codedInputStream.m92102u(Package.PARSER, extensionRegistryLite);
                                this.package_ = r6;
                                if (builder3 != null) {
                                    builder3.mo91349f(r6);
                                    this.package_ = builder3.m91544r();
                                }
                                this.bitField0_ |= 4;
                            } else if (iM92076K == 34) {
                                int i = (c == true ? 1 : 0) & '\b';
                                c = c;
                                if (i != 8) {
                                    this.class__ = new ArrayList();
                                    c = '\b';
                                }
                                this.class__.add((Class) codedInputStream.m92102u(Class.PARSER, extensionRegistryLite));
                            } else if (!parseUnknownField(codedInputStream, codedOutputStreamM92117K, extensionRegistryLite, iM92076K)) {
                            }
                        }
                        z = true;
                    } catch (Throwable th) {
                        if (((c == true ? 1 : 0) & '\b') == 8) {
                            this.class__ = Collections.unmodifiableList(this.class__);
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
            if (((c == true ? 1 : 0) & '\b') == 8) {
                this.class__ = Collections.unmodifiableList(this.class__);
            }
            try {
                codedOutputStreamM92117K.m92149J();
            } catch (IOException unused2) {
            } finally {
                this.unknownFields = outputM92041w.m92061m();
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
            return newBuilder().mo91349f(packageFragment);
        }

        public static PackageFragment parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return PARSER.mo92026b(inputStream, extensionRegistryLite);
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
            int iM92138t = (this.bitField0_ & 1) == 1 ? CodedOutputStream.m92138t(1, this.strings_) : 0;
            if ((this.bitField0_ & 2) == 2) {
                iM92138t += CodedOutputStream.m92138t(2, this.qualifiedNames_);
            }
            if ((this.bitField0_ & 4) == 4) {
                iM92138t += CodedOutputStream.m92138t(3, this.package_);
            }
            for (int i2 = 0; i2 < this.class__.size(); i2++) {
                iM92138t += CodedOutputStream.m92138t(4, this.class__.get(i2));
            }
            int iExtensionsSerializedSize = iM92138t + extensionsSerializedSize() + this.unknownFields.size();
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
                codedOutputStream.m92171h0(1, this.strings_);
            }
            if ((this.bitField0_ & 2) == 2) {
                codedOutputStream.m92171h0(2, this.qualifiedNames_);
            }
            if ((this.bitField0_ & 4) == 4) {
                codedOutputStream.m92171h0(3, this.package_);
            }
            for (int i = 0; i < this.class__.size(); i++) {
                codedOutputStream.m92171h0(4, this.class__.get(i));
            }
            extensionWriterNewExtensionWriter.m92229a(200, codedOutputStream);
            codedOutputStream.m92176m0(this.unknownFields);
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
            return Builder.m91550t();
        }

        private PackageFragment(GeneratedMessageLite.ExtendableBuilder<PackageFragment, ?> extendableBuilder) {
            super(extendableBuilder);
            this.memoizedIsInitialized = (byte) -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = extendableBuilder.m92223e();
        }

        private PackageFragment(boolean z) {
            this.memoizedIsInitialized = (byte) -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = ByteString.f66289a;
        }
    }

    public static final class Property extends GeneratedMessageLite.ExtendableMessage<Property> implements PropertyOrBuilder {
        public static Parser<Property> PARSER = new C15363a();
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
            public int f65905d;

            /* JADX INFO: renamed from: g */
            public int f65908g;

            /* JADX INFO: renamed from: i */
            public int f65910i;

            /* JADX INFO: renamed from: j */
            public List<TypeParameter> f65911j;

            /* JADX INFO: renamed from: k */
            public Type f65912k;

            /* JADX INFO: renamed from: l */
            public int f65913l;

            /* JADX INFO: renamed from: m */
            public List<Type> f65914m;

            /* JADX INFO: renamed from: n */
            public List<Integer> f65915n;

            /* JADX INFO: renamed from: o */
            public List<ValueParameter> f65916o;

            /* JADX INFO: renamed from: p */
            public ValueParameter f65917p;

            /* JADX INFO: renamed from: q */
            public int f65918q;

            /* JADX INFO: renamed from: r */
            public int f65919r;

            /* JADX INFO: renamed from: s */
            public List<Integer> f65920s;

            /* JADX INFO: renamed from: t */
            public List<CompilerPluginData> f65921t;

            /* JADX INFO: renamed from: u */
            public List<Annotation> f65922u;

            /* JADX INFO: renamed from: v */
            public List<Annotation> f65923v;

            /* JADX INFO: renamed from: w */
            public List<Annotation> f65924w;

            /* JADX INFO: renamed from: x */
            public List<Annotation> f65925x;

            /* JADX INFO: renamed from: y */
            public List<Annotation> f65926y;

            /* JADX INFO: renamed from: z */
            public List<Annotation> f65927z;

            /* JADX INFO: renamed from: e */
            public int f65906e = 518;

            /* JADX INFO: renamed from: f */
            public int f65907f = 2054;

            /* JADX INFO: renamed from: h */
            public Type f65909h = Type.getDefaultInstance();

            private Builder() {
                List list = Collections.EMPTY_LIST;
                this.f65911j = list;
                this.f65912k = Type.getDefaultInstance();
                this.f65914m = list;
                this.f65915n = list;
                this.f65916o = list;
                this.f65917p = ValueParameter.getDefaultInstance();
                this.f65920s = list;
                this.f65921t = list;
                this.f65922u = list;
                this.f65923v = list;
                this.f65924w = list;
                this.f65925x = list;
                this.f65926y = list;
                this.f65927z = list;
                m91565K();
            }

            /* JADX INFO: renamed from: B */
            private void m91562B() {
                if ((this.f65905d & 524288) != 524288) {
                    this.f65925x = new ArrayList(this.f65925x);
                    this.f65905d |= 524288;
                }
            }

            /* JADX INFO: renamed from: E */
            private void m91563E() {
                if ((this.f65905d & 32) != 32) {
                    this.f65911j = new ArrayList(this.f65911j);
                    this.f65905d |= 32;
                }
            }

            /* JADX INFO: renamed from: G */
            private void m91564G() {
                if ((this.f65905d & 16384) != 16384) {
                    this.f65920s = new ArrayList(this.f65920s);
                    this.f65905d |= 16384;
                }
            }

            /* JADX INFO: renamed from: K */
            private void m91565K() {
            }

            /* JADX INFO: renamed from: t */
            public static Builder m91567t() {
                return new Builder();
            }

            /* JADX INFO: renamed from: u */
            private void m91568u() {
                if ((this.f65905d & 65536) != 65536) {
                    this.f65922u = new ArrayList(this.f65922u);
                    this.f65905d |= 65536;
                }
            }

            /* JADX INFO: renamed from: w */
            private void m91569w() {
                if ((this.f65905d & 32768) != 32768) {
                    this.f65921t = new ArrayList(this.f65921t);
                    this.f65905d |= 32768;
                }
            }

            /* JADX INFO: renamed from: x */
            private void m91570x() {
                if ((this.f65905d & 1024) != 1024) {
                    this.f65916o = new ArrayList(this.f65916o);
                    this.f65905d |= 1024;
                }
            }

            /* JADX INFO: renamed from: y */
            private void m91571y() {
                if ((this.f65905d & 512) != 512) {
                    this.f65915n = new ArrayList(this.f65915n);
                    this.f65905d |= 512;
                }
            }

            /* JADX INFO: renamed from: z */
            private void m91572z() {
                if ((this.f65905d & 256) != 256) {
                    this.f65914m = new ArrayList(this.f65914m);
                    this.f65905d |= 256;
                }
            }

            /* JADX INFO: renamed from: A */
            public final void m91573A() {
                if ((this.f65905d & 2097152) != 2097152) {
                    this.f65927z = new ArrayList(this.f65927z);
                    this.f65905d |= 2097152;
                }
            }

            /* JADX INFO: renamed from: C */
            public final void m91574C() {
                if ((this.f65905d & 131072) != 131072) {
                    this.f65923v = new ArrayList(this.f65923v);
                    this.f65905d |= 131072;
                }
            }

            /* JADX INFO: renamed from: D */
            public final void m91575D() {
                if ((this.f65905d & 262144) != 262144) {
                    this.f65924w = new ArrayList(this.f65924w);
                    this.f65905d |= 262144;
                }
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder
            /* JADX INFO: renamed from: L, reason: merged with bridge method [inline-methods] */
            public Builder mo91349f(Property property) {
                if (property == Property.getDefaultInstance()) {
                    return this;
                }
                if (property.hasFlags()) {
                    m91581Q(property.getFlags());
                }
                if (property.hasOldFlags()) {
                    m91584T(property.getOldFlags());
                }
                if (property.hasName()) {
                    m91583S(property.getName());
                }
                if (property.hasReturnType()) {
                    m91579O(property.getReturnType());
                }
                if (property.hasReturnTypeId()) {
                    m91586V(property.getReturnTypeId());
                }
                if (!property.typeParameter_.isEmpty()) {
                    if (this.f65911j.isEmpty()) {
                        this.f65911j = property.typeParameter_;
                        this.f65905d &= -33;
                    } else {
                        m91563E();
                        this.f65911j.addAll(property.typeParameter_);
                    }
                }
                if (property.hasReceiverType()) {
                    m91578N(property.getReceiverType());
                }
                if (property.hasReceiverTypeId()) {
                    m91585U(property.getReceiverTypeId());
                }
                if (!property.contextReceiverType_.isEmpty()) {
                    if (this.f65914m.isEmpty()) {
                        this.f65914m = property.contextReceiverType_;
                        this.f65905d &= -257;
                    } else {
                        m91572z();
                        this.f65914m.addAll(property.contextReceiverType_);
                    }
                }
                if (!property.contextReceiverTypeId_.isEmpty()) {
                    if (this.f65915n.isEmpty()) {
                        this.f65915n = property.contextReceiverTypeId_;
                        this.f65905d &= -513;
                    } else {
                        m91571y();
                        this.f65915n.addAll(property.contextReceiverTypeId_);
                    }
                }
                if (!property.contextParameter_.isEmpty()) {
                    if (this.f65916o.isEmpty()) {
                        this.f65916o = property.contextParameter_;
                        this.f65905d &= ErrorCode.ERROR_CODE_JOIN_ROOM_ROOM_FORBIDDEN;
                    } else {
                        m91570x();
                        this.f65916o.addAll(property.contextParameter_);
                    }
                }
                if (property.hasSetterValueParameter()) {
                    m91580P(property.getSetterValueParameter());
                }
                if (property.hasGetterFlags()) {
                    m91582R(property.getGetterFlags());
                }
                if (property.hasSetterFlags()) {
                    m91587W(property.getSetterFlags());
                }
                if (!property.versionRequirement_.isEmpty()) {
                    if (this.f65920s.isEmpty()) {
                        this.f65920s = property.versionRequirement_;
                        this.f65905d &= -16385;
                    } else {
                        m91564G();
                        this.f65920s.addAll(property.versionRequirement_);
                    }
                }
                if (!property.compilerPluginData_.isEmpty()) {
                    if (this.f65921t.isEmpty()) {
                        this.f65921t = property.compilerPluginData_;
                        this.f65905d &= -32769;
                    } else {
                        m91569w();
                        this.f65921t.addAll(property.compilerPluginData_);
                    }
                }
                if (!property.annotation_.isEmpty()) {
                    if (this.f65922u.isEmpty()) {
                        this.f65922u = property.annotation_;
                        this.f65905d &= -65537;
                    } else {
                        m91568u();
                        this.f65922u.addAll(property.annotation_);
                    }
                }
                if (!property.getterAnnotation_.isEmpty()) {
                    if (this.f65923v.isEmpty()) {
                        this.f65923v = property.getterAnnotation_;
                        this.f65905d &= -131073;
                    } else {
                        m91574C();
                        this.f65923v.addAll(property.getterAnnotation_);
                    }
                }
                if (!property.setterAnnotation_.isEmpty()) {
                    if (this.f65924w.isEmpty()) {
                        this.f65924w = property.setterAnnotation_;
                        this.f65905d &= -262145;
                    } else {
                        m91575D();
                        this.f65924w.addAll(property.setterAnnotation_);
                    }
                }
                if (!property.extensionReceiverAnnotation_.isEmpty()) {
                    if (this.f65925x.isEmpty()) {
                        this.f65925x = property.extensionReceiverAnnotation_;
                        this.f65905d &= -524289;
                    } else {
                        m91562B();
                        this.f65925x.addAll(property.extensionReceiverAnnotation_);
                    }
                }
                if (!property.backingFieldAnnotation_.isEmpty()) {
                    if (this.f65926y.isEmpty()) {
                        this.f65926y = property.backingFieldAnnotation_;
                        this.f65905d &= -1048577;
                    } else {
                        m91591v();
                        this.f65926y.addAll(property.backingFieldAnnotation_);
                    }
                }
                if (!property.delegateFieldAnnotation_.isEmpty()) {
                    if (this.f65927z.isEmpty()) {
                        this.f65927z = property.delegateFieldAnnotation_;
                        this.f65905d &= -2097153;
                    } else {
                        m91573A();
                        this.f65927z.addAll(property.delegateFieldAnnotation_);
                    }
                }
                m92228o(property);
                m92224j(m92223e().m92047c(property.unknownFields));
                return this;
            }

            /* JADX WARN: Code duplicated, block: B:15:0x001d  */
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
            public Builder mo91350i(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws Throwable {
                Property property = null;
                try {
                    try {
                        Property propertyMo91378d = Property.PARSER.mo91378d(codedInputStream, extensionRegistryLite);
                        if (propertyMo91378d != null) {
                            mo91349f(propertyMo91378d);
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
                                mo91349f(property);
                            }
                            throw th;
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                    if (property != null) {
                        mo91349f(property);
                    }
                    throw th;
                }
            }

            /* JADX INFO: renamed from: N */
            public Builder m91578N(Type type) {
                if ((this.f65905d & 64) != 64 || this.f65912k == Type.getDefaultInstance()) {
                    this.f65912k = type;
                } else {
                    this.f65912k = Type.newBuilder(this.f65912k).mo91349f(type).m91655r();
                }
                this.f65905d |= 64;
                return this;
            }

            /* JADX INFO: renamed from: O */
            public Builder m91579O(Type type) {
                if ((this.f65905d & 8) != 8 || this.f65909h == Type.getDefaultInstance()) {
                    this.f65909h = type;
                } else {
                    this.f65909h = Type.newBuilder(this.f65909h).mo91349f(type).m91655r();
                }
                this.f65905d |= 8;
                return this;
            }

            /* JADX INFO: renamed from: P */
            public Builder m91580P(ValueParameter valueParameter) {
                if ((this.f65905d & 2048) != 2048 || this.f65917p == ValueParameter.getDefaultInstance()) {
                    this.f65917p = valueParameter;
                } else {
                    this.f65917p = ValueParameter.newBuilder(this.f65917p).mo91349f(valueParameter).m91718r();
                }
                this.f65905d |= 2048;
                return this;
            }

            /* JADX INFO: renamed from: Q */
            public Builder m91581Q(int i) {
                this.f65905d |= 1;
                this.f65906e = i;
                return this;
            }

            /* JADX INFO: renamed from: R */
            public Builder m91582R(int i) {
                this.f65905d |= 4096;
                this.f65918q = i;
                return this;
            }

            /* JADX INFO: renamed from: S */
            public Builder m91583S(int i) {
                this.f65905d |= 4;
                this.f65908g = i;
                return this;
            }

            /* JADX INFO: renamed from: T */
            public Builder m91584T(int i) {
                this.f65905d |= 2;
                this.f65907f = i;
                return this;
            }

            /* JADX INFO: renamed from: U */
            public Builder m91585U(int i) {
                this.f65905d |= 128;
                this.f65913l = i;
                return this;
            }

            /* JADX INFO: renamed from: V */
            public Builder m91586V(int i) {
                this.f65905d |= 16;
                this.f65910i = i;
                return this;
            }

            /* JADX INFO: renamed from: W */
            public Builder m91587W(int i) {
                this.f65905d |= 8192;
                this.f65919r = i;
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
            public Property build() {
                Property propertyM91589r = m91589r();
                if (propertyM91589r.isInitialized()) {
                    return propertyM91589r;
                }
                throw AbstractMessageLite.Builder.m92024c(propertyM91589r);
            }

            /* JADX INFO: renamed from: r */
            public Property m91589r() {
                Property property = new Property(this);
                int i = this.f65905d;
                int i2 = (i & 1) != 1 ? 0 : 1;
                property.flags_ = this.f65906e;
                if ((i & 2) == 2) {
                    i2 |= 2;
                }
                property.oldFlags_ = this.f65907f;
                if ((i & 4) == 4) {
                    i2 |= 4;
                }
                property.name_ = this.f65908g;
                if ((i & 8) == 8) {
                    i2 |= 8;
                }
                property.returnType_ = this.f65909h;
                if ((i & 16) == 16) {
                    i2 |= 16;
                }
                property.returnTypeId_ = this.f65910i;
                if ((this.f65905d & 32) == 32) {
                    this.f65911j = Collections.unmodifiableList(this.f65911j);
                    this.f65905d &= -33;
                }
                property.typeParameter_ = this.f65911j;
                if ((i & 64) == 64) {
                    i2 |= 32;
                }
                property.receiverType_ = this.f65912k;
                if ((i & 128) == 128) {
                    i2 |= 64;
                }
                property.receiverTypeId_ = this.f65913l;
                if ((this.f65905d & 256) == 256) {
                    this.f65914m = Collections.unmodifiableList(this.f65914m);
                    this.f65905d &= -257;
                }
                property.contextReceiverType_ = this.f65914m;
                if ((this.f65905d & 512) == 512) {
                    this.f65915n = Collections.unmodifiableList(this.f65915n);
                    this.f65905d &= -513;
                }
                property.contextReceiverTypeId_ = this.f65915n;
                if ((this.f65905d & 1024) == 1024) {
                    this.f65916o = Collections.unmodifiableList(this.f65916o);
                    this.f65905d &= ErrorCode.ERROR_CODE_JOIN_ROOM_ROOM_FORBIDDEN;
                }
                property.contextParameter_ = this.f65916o;
                if ((i & 2048) == 2048) {
                    i2 |= 128;
                }
                property.setterValueParameter_ = this.f65917p;
                if ((i & 4096) == 4096) {
                    i2 |= 256;
                }
                property.getterFlags_ = this.f65918q;
                if ((i & 8192) == 8192) {
                    i2 |= 512;
                }
                property.setterFlags_ = this.f65919r;
                if ((this.f65905d & 16384) == 16384) {
                    this.f65920s = Collections.unmodifiableList(this.f65920s);
                    this.f65905d &= -16385;
                }
                property.versionRequirement_ = this.f65920s;
                if ((this.f65905d & 32768) == 32768) {
                    this.f65921t = Collections.unmodifiableList(this.f65921t);
                    this.f65905d &= -32769;
                }
                property.compilerPluginData_ = this.f65921t;
                if ((this.f65905d & 65536) == 65536) {
                    this.f65922u = Collections.unmodifiableList(this.f65922u);
                    this.f65905d &= -65537;
                }
                property.annotation_ = this.f65922u;
                if ((this.f65905d & 131072) == 131072) {
                    this.f65923v = Collections.unmodifiableList(this.f65923v);
                    this.f65905d &= -131073;
                }
                property.getterAnnotation_ = this.f65923v;
                if ((this.f65905d & 262144) == 262144) {
                    this.f65924w = Collections.unmodifiableList(this.f65924w);
                    this.f65905d &= -262145;
                }
                property.setterAnnotation_ = this.f65924w;
                if ((this.f65905d & 524288) == 524288) {
                    this.f65925x = Collections.unmodifiableList(this.f65925x);
                    this.f65905d &= -524289;
                }
                property.extensionReceiverAnnotation_ = this.f65925x;
                if ((this.f65905d & 1048576) == 1048576) {
                    this.f65926y = Collections.unmodifiableList(this.f65926y);
                    this.f65905d &= -1048577;
                }
                property.backingFieldAnnotation_ = this.f65926y;
                if ((this.f65905d & 2097152) == 2097152) {
                    this.f65927z = Collections.unmodifiableList(this.f65927z);
                    this.f65905d &= -2097153;
                }
                property.delegateFieldAnnotation_ = this.f65927z;
                property.bitField0_ = i2;
                return property;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableBuilder
            /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
            public Builder mo91414m() {
                return m91567t().mo91349f(m91589r());
            }

            /* JADX INFO: renamed from: v */
            public final void m91591v() {
                if ((this.f65905d & 1048576) != 1048576) {
                    this.f65926y = new ArrayList(this.f65926y);
                    this.f65905d |= 1048576;
                }
            }
        }

        /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Property$a */
        public static class C15363a extends AbstractParser<Property> {
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.Parser
            /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
            public Property mo91378d(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
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
            ByteString.Output outputM92041w = ByteString.m92041w();
            boolean z = true;
            CodedOutputStream codedOutputStreamM92117K = CodedOutputStream.m92117K(outputM92041w, 1);
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
                        codedOutputStreamM92117K.m92149J();
                    } catch (IOException unused) {
                    } finally {
                        this.unknownFields = outputM92041w.m92061m();
                    }
                    makeExtensionsImmutable();
                    return;
                }
                try {
                    int iM92076K = codedInputStream.m92076K();
                    switch (iM92076K) {
                        case 0:
                            z2 = z3;
                            z = z3;
                            break;
                        case 8:
                            this.bitField0_ |= 2;
                            this.oldFlags_ = codedInputStream.m92100s();
                            z = z3;
                            break;
                        case 16:
                            this.bitField0_ |= 4;
                            this.name_ = codedInputStream.m92100s();
                            z = z3;
                            break;
                        case 26:
                            Type.Builder builder = (this.bitField0_ & 8) == 8 ? this.returnType_.toBuilder() : null;
                            Type type = (Type) codedInputStream.m92102u(Type.PARSER, extensionRegistryLite);
                            this.returnType_ = type;
                            if (builder != 0) {
                                builder.mo91349f(type);
                                this.returnType_ = builder.m91655r();
                            }
                            this.bitField0_ |= 8;
                            z = z3;
                            break;
                        case 34:
                            if ((i2 & 32) != 32) {
                                this.typeParameter_ = new ArrayList();
                                i2 |= 32;
                            }
                            this.typeParameter_.add((TypeParameter) codedInputStream.m92102u(TypeParameter.PARSER, extensionRegistryLite));
                            z = z3;
                            break;
                        case 42:
                            Type.Builder builder2 = (this.bitField0_ & 32) == 32 ? this.receiverType_.toBuilder() : null;
                            Type type2 = (Type) codedInputStream.m92102u(Type.PARSER, extensionRegistryLite);
                            this.receiverType_ = type2;
                            if (builder2 != 0) {
                                builder2.mo91349f(type2);
                                this.receiverType_ = builder2.m91655r();
                            }
                            this.bitField0_ |= 32;
                            z = z3;
                            break;
                        case 50:
                            ValueParameter.Builder builder3 = (this.bitField0_ & 128) == 128 ? this.setterValueParameter_.toBuilder() : null;
                            ValueParameter valueParameter = (ValueParameter) codedInputStream.m92102u(ValueParameter.PARSER, extensionRegistryLite);
                            this.setterValueParameter_ = valueParameter;
                            if (builder3 != 0) {
                                builder3.mo91349f(valueParameter);
                                this.setterValueParameter_ = builder3.m91718r();
                            }
                            this.bitField0_ |= 128;
                            z = z3;
                            break;
                        case 56:
                            this.bitField0_ |= 256;
                            this.getterFlags_ = codedInputStream.m92100s();
                            z = z3;
                            break;
                        case 64:
                            this.bitField0_ |= 512;
                            this.setterFlags_ = codedInputStream.m92100s();
                            z = z3;
                            break;
                        case 72:
                            this.bitField0_ |= 16;
                            this.returnTypeId_ = codedInputStream.m92100s();
                            z = z3;
                            break;
                        case 80:
                            this.bitField0_ |= 64;
                            this.receiverTypeId_ = codedInputStream.m92100s();
                            z = z3;
                            break;
                        case 88:
                            this.bitField0_ |= 1;
                            this.flags_ = codedInputStream.m92100s();
                            z = z3;
                            break;
                        case EACTags.FCP_TEMPLATE /* 98 */:
                            if ((i2 & 256) != 256) {
                                this.contextReceiverType_ = new ArrayList();
                                i2 |= 256;
                            }
                            this.contextReceiverType_.add((Type) codedInputStream.m92102u(Type.PARSER, extensionRegistryLite));
                            z = z3;
                            break;
                        case 104:
                            if ((i2 & 512) != 512) {
                                this.contextReceiverTypeId_ = new ArrayList();
                                i2 |= 512;
                            }
                            this.contextReceiverTypeId_.add(Integer.valueOf(codedInputStream.m92100s()));
                            z = z3;
                            break;
                        case 106:
                            int iM92091j = codedInputStream.m92091j(codedInputStream.m92067A());
                            if ((i2 & 512) != 512 && codedInputStream.m92088e() > 0) {
                                this.contextReceiverTypeId_ = new ArrayList();
                                i2 |= 512;
                            }
                            while (codedInputStream.m92088e() > 0) {
                                this.contextReceiverTypeId_.add(Integer.valueOf(codedInputStream.m92100s()));
                            }
                            codedInputStream.m92090i(iM92091j);
                            z = z3;
                            break;
                        case 114:
                            if ((i2 & 65536) != 65536) {
                                this.annotation_ = new ArrayList();
                                i2 |= 65536;
                            }
                            this.annotation_.add((Annotation) codedInputStream.m92102u(Annotation.PARSER, extensionRegistryLite));
                            z = z3;
                            break;
                        case 122:
                            if ((i2 & 131072) != 131072) {
                                this.getterAnnotation_ = new ArrayList();
                                i2 |= 131072;
                            }
                            this.getterAnnotation_.add((Annotation) codedInputStream.m92102u(Annotation.PARSER, extensionRegistryLite));
                            z = z3;
                            break;
                        case 130:
                            if ((i2 & 262144) != 262144) {
                                this.setterAnnotation_ = new ArrayList();
                                i2 |= 262144;
                            }
                            this.setterAnnotation_.add((Annotation) codedInputStream.m92102u(Annotation.PARSER, extensionRegistryLite));
                            z = z3;
                            break;
                        case CipherSuite.TLS_PSK_WITH_RC4_128_SHA /* 138 */:
                            if ((i2 & 1024) != 1024) {
                                this.contextParameter_ = new ArrayList();
                                i2 |= 1024;
                            }
                            this.contextParameter_.add((ValueParameter) codedInputStream.m92102u(ValueParameter.PARSER, extensionRegistryLite));
                            z = z3;
                            break;
                        case 248:
                            if ((i2 & 16384) != 16384) {
                                this.versionRequirement_ = new ArrayList();
                                i2 |= 16384;
                            }
                            this.versionRequirement_.add(Integer.valueOf(codedInputStream.m92100s()));
                            z = z3;
                            break;
                        case 250:
                            i4 = 2097152;
                            int iM92091j2 = codedInputStream.m92091j(codedInputStream.m92067A());
                            if ((i2 & 16384) != 16384 && codedInputStream.m92088e() > 0) {
                                this.versionRequirement_ = new ArrayList();
                                i2 |= 16384;
                            }
                            while (codedInputStream.m92088e() > 0) {
                                i = i3;
                                try {
                                    try {
                                        this.versionRequirement_.add(Integer.valueOf(codedInputStream.m92100s()));
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
                                            codedOutputStreamM92117K.m92149J();
                                            break;
                                        } catch (IOException unused2) {
                                        } finally {
                                            this.unknownFields = outputM92041w.m92061m();
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
                            codedInputStream.m92090i(iM92091j2);
                            z = z3;
                            break;
                        case 258:
                            if ((i2 & 32768) != 32768) {
                                this.compilerPluginData_ = new ArrayList();
                                i2 |= 32768;
                            }
                            this.compilerPluginData_.add((CompilerPluginData) codedInputStream.m92102u(CompilerPluginData.PARSER, extensionRegistryLite));
                            z = z3;
                            break;
                        case 266:
                            if ((i2 & 524288) != 524288) {
                                this.extensionReceiverAnnotation_ = new ArrayList();
                                i2 |= 524288;
                            }
                            this.extensionReceiverAnnotation_.add((Annotation) codedInputStream.m92102u(Annotation.PARSER, extensionRegistryLite));
                            z = z3;
                            break;
                        case 274:
                            if ((i2 & 1048576) != 1048576) {
                                this.backingFieldAnnotation_ = new ArrayList();
                                i2 |= 1048576;
                            }
                            this.backingFieldAnnotation_.add((Annotation) codedInputStream.m92102u(Annotation.PARSER, extensionRegistryLite));
                            z = z3;
                            break;
                        case 282:
                            if ((i2 & 2097152) != 2097152) {
                                this.delegateFieldAnnotation_ = new ArrayList();
                                i2 |= 2097152;
                            }
                            try {
                                try {
                                    this.delegateFieldAnnotation_.add((Annotation) codedInputStream.m92102u(Annotation.PARSER, extensionRegistryLite));
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
                                    codedOutputStreamM92117K.m92149J();
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
                            if (!parseUnknownField(codedInputStream, codedOutputStreamM92117K, extensionRegistryLite, iM92076K)) {
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
            return newBuilder().mo91349f(property);
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
            int iM92134p = (this.bitField0_ & 2) == 2 ? CodedOutputStream.m92134p(1, this.oldFlags_) : 0;
            if ((this.bitField0_ & 4) == 4) {
                iM92134p += CodedOutputStream.m92134p(2, this.name_);
            }
            if ((this.bitField0_ & 8) == 8) {
                iM92134p += CodedOutputStream.m92138t(3, this.returnType_);
            }
            for (int i2 = 0; i2 < this.typeParameter_.size(); i2++) {
                iM92134p += CodedOutputStream.m92138t(4, this.typeParameter_.get(i2));
            }
            if ((this.bitField0_ & 32) == 32) {
                iM92134p += CodedOutputStream.m92138t(5, this.receiverType_);
            }
            if ((this.bitField0_ & 128) == 128) {
                iM92134p += CodedOutputStream.m92138t(6, this.setterValueParameter_);
            }
            if ((this.bitField0_ & 256) == 256) {
                iM92134p += CodedOutputStream.m92134p(7, this.getterFlags_);
            }
            if ((this.bitField0_ & 512) == 512) {
                iM92134p += CodedOutputStream.m92134p(8, this.setterFlags_);
            }
            if ((this.bitField0_ & 16) == 16) {
                iM92134p += CodedOutputStream.m92134p(9, this.returnTypeId_);
            }
            if ((this.bitField0_ & 64) == 64) {
                iM92134p += CodedOutputStream.m92134p(10, this.receiverTypeId_);
            }
            if ((this.bitField0_ & 1) == 1) {
                iM92134p += CodedOutputStream.m92134p(11, this.flags_);
            }
            for (int i3 = 0; i3 < this.contextReceiverType_.size(); i3++) {
                iM92134p += CodedOutputStream.m92138t(12, this.contextReceiverType_.get(i3));
            }
            int iM92135q = 0;
            for (int i4 = 0; i4 < this.contextReceiverTypeId_.size(); i4++) {
                iM92135q += CodedOutputStream.m92135q(this.contextReceiverTypeId_.get(i4).intValue());
            }
            int iM92138t = iM92134p + iM92135q;
            if (!getContextReceiverTypeIdList().isEmpty()) {
                iM92138t = iM92138t + 1 + CodedOutputStream.m92135q(iM92135q);
            }
            this.contextReceiverTypeIdMemoizedSerializedSize = iM92135q;
            for (int i5 = 0; i5 < this.annotation_.size(); i5++) {
                iM92138t += CodedOutputStream.m92138t(14, this.annotation_.get(i5));
            }
            for (int i6 = 0; i6 < this.getterAnnotation_.size(); i6++) {
                iM92138t += CodedOutputStream.m92138t(15, this.getterAnnotation_.get(i6));
            }
            for (int i7 = 0; i7 < this.setterAnnotation_.size(); i7++) {
                iM92138t += CodedOutputStream.m92138t(16, this.setterAnnotation_.get(i7));
            }
            for (int i8 = 0; i8 < this.contextParameter_.size(); i8++) {
                iM92138t += CodedOutputStream.m92138t(17, this.contextParameter_.get(i8));
            }
            int iM92135q2 = 0;
            for (int i9 = 0; i9 < this.versionRequirement_.size(); i9++) {
                iM92135q2 += CodedOutputStream.m92135q(this.versionRequirement_.get(i9).intValue());
            }
            int size = iM92138t + iM92135q2 + (getVersionRequirementList().size() * 2);
            for (int i10 = 0; i10 < this.compilerPluginData_.size(); i10++) {
                size += CodedOutputStream.m92138t(32, this.compilerPluginData_.get(i10));
            }
            for (int i11 = 0; i11 < this.extensionReceiverAnnotation_.size(); i11++) {
                size += CodedOutputStream.m92138t(33, this.extensionReceiverAnnotation_.get(i11));
            }
            for (int i12 = 0; i12 < this.backingFieldAnnotation_.size(); i12++) {
                size += CodedOutputStream.m92138t(34, this.backingFieldAnnotation_.get(i12));
            }
            for (int i13 = 0; i13 < this.delegateFieldAnnotation_.size(); i13++) {
                size += CodedOutputStream.m92138t(35, this.delegateFieldAnnotation_.get(i13));
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
                codedOutputStream.m92168e0(1, this.oldFlags_);
            }
            if ((this.bitField0_ & 4) == 4) {
                codedOutputStream.m92168e0(2, this.name_);
            }
            if ((this.bitField0_ & 8) == 8) {
                codedOutputStream.m92171h0(3, this.returnType_);
            }
            for (int i = 0; i < this.typeParameter_.size(); i++) {
                codedOutputStream.m92171h0(4, this.typeParameter_.get(i));
            }
            if ((this.bitField0_ & 32) == 32) {
                codedOutputStream.m92171h0(5, this.receiverType_);
            }
            if ((this.bitField0_ & 128) == 128) {
                codedOutputStream.m92171h0(6, this.setterValueParameter_);
            }
            if ((this.bitField0_ & 256) == 256) {
                codedOutputStream.m92168e0(7, this.getterFlags_);
            }
            if ((this.bitField0_ & 512) == 512) {
                codedOutputStream.m92168e0(8, this.setterFlags_);
            }
            if ((this.bitField0_ & 16) == 16) {
                codedOutputStream.m92168e0(9, this.returnTypeId_);
            }
            if ((this.bitField0_ & 64) == 64) {
                codedOutputStream.m92168e0(10, this.receiverTypeId_);
            }
            if ((this.bitField0_ & 1) == 1) {
                codedOutputStream.m92168e0(11, this.flags_);
            }
            for (int i2 = 0; i2 < this.contextReceiverType_.size(); i2++) {
                codedOutputStream.m92171h0(12, this.contextReceiverType_.get(i2));
            }
            if (getContextReceiverTypeIdList().size() > 0) {
                codedOutputStream.m92182s0(106);
                codedOutputStream.m92182s0(this.contextReceiverTypeIdMemoizedSerializedSize);
            }
            for (int i3 = 0; i3 < this.contextReceiverTypeId_.size(); i3++) {
                codedOutputStream.m92169f0(this.contextReceiverTypeId_.get(i3).intValue());
            }
            for (int i4 = 0; i4 < this.annotation_.size(); i4++) {
                codedOutputStream.m92171h0(14, this.annotation_.get(i4));
            }
            for (int i5 = 0; i5 < this.getterAnnotation_.size(); i5++) {
                codedOutputStream.m92171h0(15, this.getterAnnotation_.get(i5));
            }
            for (int i6 = 0; i6 < this.setterAnnotation_.size(); i6++) {
                codedOutputStream.m92171h0(16, this.setterAnnotation_.get(i6));
            }
            for (int i7 = 0; i7 < this.contextParameter_.size(); i7++) {
                codedOutputStream.m92171h0(17, this.contextParameter_.get(i7));
            }
            for (int i8 = 0; i8 < this.versionRequirement_.size(); i8++) {
                codedOutputStream.m92168e0(31, this.versionRequirement_.get(i8).intValue());
            }
            for (int i9 = 0; i9 < this.compilerPluginData_.size(); i9++) {
                codedOutputStream.m92171h0(32, this.compilerPluginData_.get(i9));
            }
            for (int i10 = 0; i10 < this.extensionReceiverAnnotation_.size(); i10++) {
                codedOutputStream.m92171h0(33, this.extensionReceiverAnnotation_.get(i10));
            }
            for (int i11 = 0; i11 < this.backingFieldAnnotation_.size(); i11++) {
                codedOutputStream.m92171h0(34, this.backingFieldAnnotation_.get(i11));
            }
            for (int i12 = 0; i12 < this.delegateFieldAnnotation_.size(); i12++) {
                codedOutputStream.m92171h0(35, this.delegateFieldAnnotation_.get(i12));
            }
            extensionWriterNewExtensionWriter.m92229a(19000, codedOutputStream);
            codedOutputStream.m92176m0(this.unknownFields);
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
            return Builder.m91567t();
        }

        private Property(GeneratedMessageLite.ExtendableBuilder<Property, ?> extendableBuilder) {
            super(extendableBuilder);
            this.contextReceiverTypeIdMemoizedSerializedSize = -1;
            this.memoizedIsInitialized = (byte) -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = extendableBuilder.m92223e();
        }

        private Property(boolean z) {
            this.contextReceiverTypeIdMemoizedSerializedSize = -1;
            this.memoizedIsInitialized = (byte) -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = ByteString.f66289a;
        }
    }

    public static final class StringTable extends GeneratedMessageLite implements StringTableOrBuilder {
        public static Parser<StringTable> PARSER = new C15367a();
        private static final StringTable defaultInstance;
        private byte memoizedIsInitialized;
        private int memoizedSerializedSize;
        private LazyStringList string_;
        private final ByteString unknownFields;

        public static final class Builder extends GeneratedMessageLite.Builder<StringTable, Builder> implements StringTableOrBuilder {

            /* JADX INFO: renamed from: b */
            public int f65934b;

            /* JADX INFO: renamed from: c */
            public LazyStringList f65935c = LazyStringArrayList.f66352b;

            private Builder() {
                m91618q();
            }

            /* JADX INFO: renamed from: o */
            public static Builder m91617o() {
                return new Builder();
            }

            /* JADX INFO: renamed from: q */
            private void m91618q() {
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
            public StringTable build() {
                StringTable stringTableM91620m = m91620m();
                if (stringTableM91620m.isInitialized()) {
                    return stringTableM91620m;
                }
                throw AbstractMessageLite.Builder.m92024c(stringTableM91620m);
            }

            /* JADX INFO: renamed from: m */
            public StringTable m91620m() {
                StringTable stringTable = new StringTable(this);
                if ((this.f65934b & 1) == 1) {
                    this.f65935c = this.f65935c.mo92254m();
                    this.f65934b &= -2;
                }
                stringTable.string_ = this.f65935c;
                return stringTable;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder
            /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
            public Builder mo91414m() {
                return m91617o().mo91349f(m91620m());
            }

            /* JADX INFO: renamed from: p */
            public final void m91622p() {
                if ((this.f65934b & 1) != 1) {
                    this.f65935c = new LazyStringArrayList(this.f65935c);
                    this.f65934b |= 1;
                }
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder
            /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
            public Builder mo91349f(StringTable stringTable) {
                if (stringTable == StringTable.getDefaultInstance()) {
                    return this;
                }
                if (!stringTable.string_.isEmpty()) {
                    if (this.f65935c.isEmpty()) {
                        this.f65935c = stringTable.string_;
                        this.f65934b &= -2;
                    } else {
                        m91622p();
                        this.f65935c.addAll(stringTable.string_);
                    }
                }
                m92224j(m92223e().m92047c(stringTable.unknownFields));
                return this;
            }

            /* JADX WARN: Code duplicated, block: B:15:0x001d  */
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
            public Builder mo91350i(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws Throwable {
                StringTable stringTable = null;
                try {
                    try {
                        StringTable stringTableMo91378d = StringTable.PARSER.mo91378d(codedInputStream, extensionRegistryLite);
                        if (stringTableMo91378d != null) {
                            mo91349f(stringTableMo91378d);
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
                                mo91349f(stringTable);
                            }
                            throw th;
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                    if (stringTable != null) {
                        mo91349f(stringTable);
                    }
                    throw th;
                }
            }
        }

        /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$StringTable$a */
        public static class C15367a extends AbstractParser<StringTable> {
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.Parser
            /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
            public StringTable mo91378d(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
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
            ByteString.Output outputM92041w = ByteString.m92041w();
            CodedOutputStream codedOutputStreamM92117K = CodedOutputStream.m92117K(outputM92041w, 1);
            boolean z = false;
            boolean z2 = false;
            while (!z) {
                try {
                    try {
                        try {
                            int iM92076K = codedInputStream.m92076K();
                            if (iM92076K != 0) {
                                if (iM92076K == 10) {
                                    ByteString byteStringM92093l = codedInputStream.m92093l();
                                    if (!z2) {
                                        this.string_ = new LazyStringArrayList();
                                        z2 = true;
                                    }
                                    this.string_.mo92249S(byteStringM92093l);
                                } else if (!parseUnknownField(codedInputStream, codedOutputStreamM92117K, extensionRegistryLite, iM92076K)) {
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
                        this.string_ = this.string_.mo92254m();
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
            if (z2) {
                this.string_ = this.string_.mo92254m();
            }
            try {
                codedOutputStreamM92117K.m92149J();
            } catch (IOException unused2) {
            } finally {
                this.unknownFields = outputM92041w.m92061m();
            }
            makeExtensionsImmutable();
        }

        public static StringTable getDefaultInstance() {
            return defaultInstance;
        }

        private void initFields() {
            this.string_ = LazyStringArrayList.f66352b;
        }

        public static Builder newBuilder(StringTable stringTable) {
            return newBuilder().mo91349f(stringTable);
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
            int iM92124f = 0;
            for (int i2 = 0; i2 < this.string_.size(); i2++) {
                iM92124f += CodedOutputStream.m92124f(this.string_.mo92248Q(i2));
            }
            int size = iM92124f + getStringList().size() + this.unknownFields.size();
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
                codedOutputStream.m92155S(1, this.string_.mo92248Q(i));
            }
            codedOutputStream.m92176m0(this.unknownFields);
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
            return Builder.m91617o();
        }

        private StringTable(GeneratedMessageLite.Builder builder) {
            super(builder);
            this.memoizedIsInitialized = (byte) -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = builder.m92223e();
        }

        private StringTable(boolean z) {
            this.memoizedIsInitialized = (byte) -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = ByteString.f66289a;
        }
    }

    public static final class TypeAlias extends GeneratedMessageLite.ExtendableMessage<TypeAlias> implements TypeAliasOrBuilder {
        public static Parser<TypeAlias> PARSER = new C15371a();
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
            public int f65956d;

            /* JADX INFO: renamed from: e */
            public int f65957e = 6;

            /* JADX INFO: renamed from: f */
            public int f65958f;

            /* JADX INFO: renamed from: g */
            public List<TypeParameter> f65959g;

            /* JADX INFO: renamed from: h */
            public Type f65960h;

            /* JADX INFO: renamed from: i */
            public int f65961i;

            /* JADX INFO: renamed from: j */
            public Type f65962j;

            /* JADX INFO: renamed from: k */
            public int f65963k;

            /* JADX INFO: renamed from: l */
            public List<Annotation> f65964l;

            /* JADX INFO: renamed from: m */
            public List<Integer> f65965m;

            /* JADX INFO: renamed from: n */
            public List<CompilerPluginData> f65966n;

            private Builder() {
                List list = Collections.EMPTY_LIST;
                this.f65959g = list;
                this.f65960h = Type.getDefaultInstance();
                this.f65962j = Type.getDefaultInstance();
                this.f65964l = list;
                this.f65965m = list;
                this.f65966n = list;
                m91668y();
            }

            /* JADX INFO: renamed from: t */
            public static Builder m91663t() {
                return new Builder();
            }

            /* JADX INFO: renamed from: u */
            private void m91664u() {
                if ((this.f65956d & 128) != 128) {
                    this.f65964l = new ArrayList(this.f65964l);
                    this.f65956d |= 128;
                }
            }

            /* JADX INFO: renamed from: v */
            private void m91665v() {
                if ((this.f65956d & 512) != 512) {
                    this.f65966n = new ArrayList(this.f65966n);
                    this.f65956d |= 512;
                }
            }

            /* JADX INFO: renamed from: w */
            private void m91666w() {
                if ((this.f65956d & 4) != 4) {
                    this.f65959g = new ArrayList(this.f65959g);
                    this.f65956d |= 4;
                }
            }

            /* JADX INFO: renamed from: x */
            private void m91667x() {
                if ((this.f65956d & 256) != 256) {
                    this.f65965m = new ArrayList(this.f65965m);
                    this.f65956d |= 256;
                }
            }

            /* JADX INFO: renamed from: y */
            private void m91668y() {
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder
            /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
            public Builder mo91349f(TypeAlias typeAlias) {
                if (typeAlias == TypeAlias.getDefaultInstance()) {
                    return this;
                }
                if (typeAlias.hasFlags()) {
                    m91673E(typeAlias.getFlags());
                }
                if (typeAlias.hasName()) {
                    m91674G(typeAlias.getName());
                }
                if (!typeAlias.typeParameter_.isEmpty()) {
                    if (this.f65959g.isEmpty()) {
                        this.f65959g = typeAlias.typeParameter_;
                        this.f65956d &= -5;
                    } else {
                        m91666w();
                        this.f65959g.addAll(typeAlias.typeParameter_);
                    }
                }
                if (typeAlias.hasUnderlyingType()) {
                    m91671C(typeAlias.getUnderlyingType());
                }
                if (typeAlias.hasUnderlyingTypeId()) {
                    m91675K(typeAlias.getUnderlyingTypeId());
                }
                if (typeAlias.hasExpandedType()) {
                    m91679z(typeAlias.getExpandedType());
                }
                if (typeAlias.hasExpandedTypeId()) {
                    m91672D(typeAlias.getExpandedTypeId());
                }
                if (!typeAlias.annotation_.isEmpty()) {
                    if (this.f65964l.isEmpty()) {
                        this.f65964l = typeAlias.annotation_;
                        this.f65956d &= -129;
                    } else {
                        m91664u();
                        this.f65964l.addAll(typeAlias.annotation_);
                    }
                }
                if (!typeAlias.versionRequirement_.isEmpty()) {
                    if (this.f65965m.isEmpty()) {
                        this.f65965m = typeAlias.versionRequirement_;
                        this.f65956d &= -257;
                    } else {
                        m91667x();
                        this.f65965m.addAll(typeAlias.versionRequirement_);
                    }
                }
                if (!typeAlias.compilerPluginData_.isEmpty()) {
                    if (this.f65966n.isEmpty()) {
                        this.f65966n = typeAlias.compilerPluginData_;
                        this.f65956d &= -513;
                    } else {
                        m91665v();
                        this.f65966n.addAll(typeAlias.compilerPluginData_);
                    }
                }
                m92228o(typeAlias);
                m92224j(m92223e().m92047c(typeAlias.unknownFields));
                return this;
            }

            /* JADX WARN: Code duplicated, block: B:15:0x001d  */
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
            public Builder mo91350i(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws Throwable {
                TypeAlias typeAlias = null;
                try {
                    try {
                        TypeAlias typeAliasMo91378d = TypeAlias.PARSER.mo91378d(codedInputStream, extensionRegistryLite);
                        if (typeAliasMo91378d != null) {
                            mo91349f(typeAliasMo91378d);
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
                                mo91349f(typeAlias);
                            }
                            throw th;
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                    if (typeAlias != null) {
                        mo91349f(typeAlias);
                    }
                    throw th;
                }
            }

            /* JADX INFO: renamed from: C */
            public Builder m91671C(Type type) {
                if ((this.f65956d & 8) != 8 || this.f65960h == Type.getDefaultInstance()) {
                    this.f65960h = type;
                } else {
                    this.f65960h = Type.newBuilder(this.f65960h).mo91349f(type).m91655r();
                }
                this.f65956d |= 8;
                return this;
            }

            /* JADX INFO: renamed from: D */
            public Builder m91672D(int i) {
                this.f65956d |= 64;
                this.f65963k = i;
                return this;
            }

            /* JADX INFO: renamed from: E */
            public Builder m91673E(int i) {
                this.f65956d |= 1;
                this.f65957e = i;
                return this;
            }

            /* JADX INFO: renamed from: G */
            public Builder m91674G(int i) {
                this.f65956d |= 2;
                this.f65958f = i;
                return this;
            }

            /* JADX INFO: renamed from: K */
            public Builder m91675K(int i) {
                this.f65956d |= 16;
                this.f65961i = i;
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
            public TypeAlias build() {
                TypeAlias typeAliasM91677r = m91677r();
                if (typeAliasM91677r.isInitialized()) {
                    return typeAliasM91677r;
                }
                throw AbstractMessageLite.Builder.m92024c(typeAliasM91677r);
            }

            /* JADX INFO: renamed from: r */
            public TypeAlias m91677r() {
                TypeAlias typeAlias = new TypeAlias(this);
                int i = this.f65956d;
                int i2 = (i & 1) != 1 ? 0 : 1;
                typeAlias.flags_ = this.f65957e;
                if ((i & 2) == 2) {
                    i2 |= 2;
                }
                typeAlias.name_ = this.f65958f;
                if ((this.f65956d & 4) == 4) {
                    this.f65959g = Collections.unmodifiableList(this.f65959g);
                    this.f65956d &= -5;
                }
                typeAlias.typeParameter_ = this.f65959g;
                if ((i & 8) == 8) {
                    i2 |= 4;
                }
                typeAlias.underlyingType_ = this.f65960h;
                if ((i & 16) == 16) {
                    i2 |= 8;
                }
                typeAlias.underlyingTypeId_ = this.f65961i;
                if ((i & 32) == 32) {
                    i2 |= 16;
                }
                typeAlias.expandedType_ = this.f65962j;
                if ((i & 64) == 64) {
                    i2 |= 32;
                }
                typeAlias.expandedTypeId_ = this.f65963k;
                if ((this.f65956d & 128) == 128) {
                    this.f65964l = Collections.unmodifiableList(this.f65964l);
                    this.f65956d &= -129;
                }
                typeAlias.annotation_ = this.f65964l;
                if ((this.f65956d & 256) == 256) {
                    this.f65965m = Collections.unmodifiableList(this.f65965m);
                    this.f65956d &= -257;
                }
                typeAlias.versionRequirement_ = this.f65965m;
                if ((this.f65956d & 512) == 512) {
                    this.f65966n = Collections.unmodifiableList(this.f65966n);
                    this.f65956d &= -513;
                }
                typeAlias.compilerPluginData_ = this.f65966n;
                typeAlias.bitField0_ = i2;
                return typeAlias;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableBuilder
            /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
            public Builder mo91414m() {
                return m91663t().mo91349f(m91677r());
            }

            /* JADX INFO: renamed from: z */
            public Builder m91679z(Type type) {
                if ((this.f65956d & 32) != 32 || this.f65962j == Type.getDefaultInstance()) {
                    this.f65962j = type;
                } else {
                    this.f65962j = Type.newBuilder(this.f65962j).mo91349f(type).m91655r();
                }
                this.f65956d |= 32;
                return this;
            }
        }

        /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$TypeAlias$a */
        public static class C15371a extends AbstractParser<TypeAlias> {
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.Parser
            /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
            public TypeAlias mo91378d(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
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
            ByteString.Output outputM92041w = ByteString.m92041w();
            CodedOutputStream codedOutputStreamM92117K = CodedOutputStream.m92117K(outputM92041w, 1);
            boolean z = false;
            int i = 0;
            while (!z) {
                try {
                    try {
                        int iM92076K = codedInputStream.m92076K();
                        switch (iM92076K) {
                            case 0:
                                break;
                            case 8:
                                this.bitField0_ |= 1;
                                this.flags_ = codedInputStream.m92100s();
                                continue;
                            case 16:
                                this.bitField0_ |= 2;
                                this.name_ = codedInputStream.m92100s();
                                continue;
                            case 26:
                                if ((i & 4) != 4) {
                                    this.typeParameter_ = new ArrayList();
                                    i |= 4;
                                }
                                this.typeParameter_.add((TypeParameter) codedInputStream.m92102u(TypeParameter.PARSER, extensionRegistryLite));
                                continue;
                            case 34:
                                builder = (this.bitField0_ & 4) == 4 ? this.underlyingType_.toBuilder() : null;
                                Type type = (Type) codedInputStream.m92102u(Type.PARSER, extensionRegistryLite);
                                this.underlyingType_ = type;
                                if (builder != null) {
                                    builder.mo91349f(type);
                                    this.underlyingType_ = builder.m91655r();
                                }
                                this.bitField0_ |= 4;
                                continue;
                            case 40:
                                this.bitField0_ |= 8;
                                this.underlyingTypeId_ = codedInputStream.m92100s();
                                continue;
                            case 50:
                                builder = (this.bitField0_ & 16) == 16 ? this.expandedType_.toBuilder() : null;
                                Type type2 = (Type) codedInputStream.m92102u(Type.PARSER, extensionRegistryLite);
                                this.expandedType_ = type2;
                                if (builder != null) {
                                    builder.mo91349f(type2);
                                    this.expandedType_ = builder.m91655r();
                                }
                                this.bitField0_ |= 16;
                                continue;
                            case 56:
                                this.bitField0_ |= 32;
                                this.expandedTypeId_ = codedInputStream.m92100s();
                                continue;
                            case 66:
                                if ((i & 128) != 128) {
                                    this.annotation_ = new ArrayList();
                                    i |= 128;
                                }
                                this.annotation_.add((Annotation) codedInputStream.m92102u(Annotation.PARSER, extensionRegistryLite));
                                continue;
                            case 248:
                                if ((i & 256) != 256) {
                                    this.versionRequirement_ = new ArrayList();
                                    i |= 256;
                                }
                                this.versionRequirement_.add(Integer.valueOf(codedInputStream.m92100s()));
                                continue;
                            case 250:
                                int iM92091j = codedInputStream.m92091j(codedInputStream.m92067A());
                                if ((i & 256) != 256 && codedInputStream.m92088e() > 0) {
                                    this.versionRequirement_ = new ArrayList();
                                    i |= 256;
                                }
                                while (codedInputStream.m92088e() > 0) {
                                    this.versionRequirement_.add(Integer.valueOf(codedInputStream.m92100s()));
                                }
                                codedInputStream.m92090i(iM92091j);
                                continue;
                            case 258:
                                if ((i & 512) != 512) {
                                    this.compilerPluginData_ = new ArrayList();
                                    i |= 512;
                                }
                                this.compilerPluginData_.add((CompilerPluginData) codedInputStream.m92102u(CompilerPluginData.PARSER, extensionRegistryLite));
                                continue;
                            default:
                                if (!parseUnknownField(codedInputStream, codedOutputStreamM92117K, extensionRegistryLite, iM92076K)) {
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
                codedOutputStreamM92117K.m92149J();
            } catch (IOException unused2) {
            } finally {
                this.unknownFields = outputM92041w.m92061m();
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
            return newBuilder().mo91349f(typeAlias);
        }

        public static TypeAlias parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return PARSER.mo92025a(inputStream, extensionRegistryLite);
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
            int iM92134p = (this.bitField0_ & 1) == 1 ? CodedOutputStream.m92134p(1, this.flags_) : 0;
            if ((this.bitField0_ & 2) == 2) {
                iM92134p += CodedOutputStream.m92134p(2, this.name_);
            }
            for (int i2 = 0; i2 < this.typeParameter_.size(); i2++) {
                iM92134p += CodedOutputStream.m92138t(3, this.typeParameter_.get(i2));
            }
            if ((this.bitField0_ & 4) == 4) {
                iM92134p += CodedOutputStream.m92138t(4, this.underlyingType_);
            }
            if ((this.bitField0_ & 8) == 8) {
                iM92134p += CodedOutputStream.m92134p(5, this.underlyingTypeId_);
            }
            if ((this.bitField0_ & 16) == 16) {
                iM92134p += CodedOutputStream.m92138t(6, this.expandedType_);
            }
            if ((this.bitField0_ & 32) == 32) {
                iM92134p += CodedOutputStream.m92134p(7, this.expandedTypeId_);
            }
            for (int i3 = 0; i3 < this.annotation_.size(); i3++) {
                iM92134p += CodedOutputStream.m92138t(8, this.annotation_.get(i3));
            }
            int iM92135q = 0;
            for (int i4 = 0; i4 < this.versionRequirement_.size(); i4++) {
                iM92135q += CodedOutputStream.m92135q(this.versionRequirement_.get(i4).intValue());
            }
            int size = iM92134p + iM92135q + (getVersionRequirementList().size() * 2);
            for (int i5 = 0; i5 < this.compilerPluginData_.size(); i5++) {
                size += CodedOutputStream.m92138t(32, this.compilerPluginData_.get(i5));
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
                codedOutputStream.m92168e0(1, this.flags_);
            }
            if ((this.bitField0_ & 2) == 2) {
                codedOutputStream.m92168e0(2, this.name_);
            }
            for (int i = 0; i < this.typeParameter_.size(); i++) {
                codedOutputStream.m92171h0(3, this.typeParameter_.get(i));
            }
            if ((this.bitField0_ & 4) == 4) {
                codedOutputStream.m92171h0(4, this.underlyingType_);
            }
            if ((this.bitField0_ & 8) == 8) {
                codedOutputStream.m92168e0(5, this.underlyingTypeId_);
            }
            if ((this.bitField0_ & 16) == 16) {
                codedOutputStream.m92171h0(6, this.expandedType_);
            }
            if ((this.bitField0_ & 32) == 32) {
                codedOutputStream.m92168e0(7, this.expandedTypeId_);
            }
            for (int i2 = 0; i2 < this.annotation_.size(); i2++) {
                codedOutputStream.m92171h0(8, this.annotation_.get(i2));
            }
            for (int i3 = 0; i3 < this.versionRequirement_.size(); i3++) {
                codedOutputStream.m92168e0(31, this.versionRequirement_.get(i3).intValue());
            }
            for (int i4 = 0; i4 < this.compilerPluginData_.size(); i4++) {
                codedOutputStream.m92171h0(32, this.compilerPluginData_.get(i4));
            }
            extensionWriterNewExtensionWriter.m92229a(200, codedOutputStream);
            codedOutputStream.m92176m0(this.unknownFields);
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
            return Builder.m91663t();
        }

        private TypeAlias(GeneratedMessageLite.ExtendableBuilder<TypeAlias, ?> extendableBuilder) {
            super(extendableBuilder);
            this.memoizedIsInitialized = (byte) -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = extendableBuilder.m92223e();
        }

        private TypeAlias(boolean z) {
            this.memoizedIsInitialized = (byte) -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = ByteString.f66289a;
        }
    }

    public static final class TypeParameter extends GeneratedMessageLite.ExtendableMessage<TypeParameter> implements TypeParameterOrBuilder {
        public static Parser<TypeParameter> PARSER = new C15373a();
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
            public int f65967d;

            /* JADX INFO: renamed from: e */
            public int f65968e;

            /* JADX INFO: renamed from: f */
            public int f65969f;

            /* JADX INFO: renamed from: g */
            public boolean f65970g;

            /* JADX INFO: renamed from: h */
            public Variance f65971h = Variance.INV;

            /* JADX INFO: renamed from: i */
            public List<Type> f65972i;

            /* JADX INFO: renamed from: j */
            public List<Integer> f65973j;

            private Builder() {
                List list = Collections.EMPTY_LIST;
                this.f65972i = list;
                this.f65973j = list;
                m91683w();
            }

            /* JADX INFO: renamed from: t */
            public static Builder m91682t() {
                return new Builder();
            }

            /* JADX INFO: renamed from: w */
            private void m91683w() {
            }

            /* JADX INFO: renamed from: A */
            public Builder m91684A(int i) {
                this.f65967d |= 2;
                this.f65969f = i;
                return this;
            }

            /* JADX INFO: renamed from: B */
            public Builder m91685B(boolean z) {
                this.f65967d |= 4;
                this.f65970g = z;
                return this;
            }

            /* JADX INFO: renamed from: C */
            public Builder m91686C(Variance variance) {
                variance.getClass();
                this.f65967d |= 8;
                this.f65971h = variance;
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
            public TypeParameter build() {
                TypeParameter typeParameterM91688r = m91688r();
                if (typeParameterM91688r.isInitialized()) {
                    return typeParameterM91688r;
                }
                throw AbstractMessageLite.Builder.m92024c(typeParameterM91688r);
            }

            /* JADX INFO: renamed from: r */
            public TypeParameter m91688r() {
                TypeParameter typeParameter = new TypeParameter(this);
                int i = this.f65967d;
                int i2 = (i & 1) != 1 ? 0 : 1;
                typeParameter.id_ = this.f65968e;
                if ((i & 2) == 2) {
                    i2 |= 2;
                }
                typeParameter.name_ = this.f65969f;
                if ((i & 4) == 4) {
                    i2 |= 4;
                }
                typeParameter.reified_ = this.f65970g;
                if ((i & 8) == 8) {
                    i2 |= 8;
                }
                typeParameter.variance_ = this.f65971h;
                if ((this.f65967d & 16) == 16) {
                    this.f65972i = Collections.unmodifiableList(this.f65972i);
                    this.f65967d &= -17;
                }
                typeParameter.upperBound_ = this.f65972i;
                if ((this.f65967d & 32) == 32) {
                    this.f65973j = Collections.unmodifiableList(this.f65973j);
                    this.f65967d &= -33;
                }
                typeParameter.upperBoundId_ = this.f65973j;
                typeParameter.bitField0_ = i2;
                return typeParameter;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableBuilder
            /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
            public Builder mo91414m() {
                return m91682t().mo91349f(m91688r());
            }

            /* JADX INFO: renamed from: u */
            public final void m91690u() {
                if ((this.f65967d & 32) != 32) {
                    this.f65973j = new ArrayList(this.f65973j);
                    this.f65967d |= 32;
                }
            }

            /* JADX INFO: renamed from: v */
            public final void m91691v() {
                if ((this.f65967d & 16) != 16) {
                    this.f65972i = new ArrayList(this.f65972i);
                    this.f65967d |= 16;
                }
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder
            /* JADX INFO: renamed from: x, reason: merged with bridge method [inline-methods] */
            public Builder mo91349f(TypeParameter typeParameter) {
                if (typeParameter == TypeParameter.getDefaultInstance()) {
                    return this;
                }
                if (typeParameter.hasId()) {
                    m91694z(typeParameter.getId());
                }
                if (typeParameter.hasName()) {
                    m91684A(typeParameter.getName());
                }
                if (typeParameter.hasReified()) {
                    m91685B(typeParameter.getReified());
                }
                if (typeParameter.hasVariance()) {
                    m91686C(typeParameter.getVariance());
                }
                if (!typeParameter.upperBound_.isEmpty()) {
                    if (this.f65972i.isEmpty()) {
                        this.f65972i = typeParameter.upperBound_;
                        this.f65967d &= -17;
                    } else {
                        m91691v();
                        this.f65972i.addAll(typeParameter.upperBound_);
                    }
                }
                if (!typeParameter.upperBoundId_.isEmpty()) {
                    if (this.f65973j.isEmpty()) {
                        this.f65973j = typeParameter.upperBoundId_;
                        this.f65967d &= -33;
                    } else {
                        m91690u();
                        this.f65973j.addAll(typeParameter.upperBoundId_);
                    }
                }
                m92228o(typeParameter);
                m92224j(m92223e().m92047c(typeParameter.unknownFields));
                return this;
            }

            /* JADX WARN: Code duplicated, block: B:15:0x001d  */
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
            public Builder mo91350i(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws Throwable {
                TypeParameter typeParameter = null;
                try {
                    try {
                        TypeParameter typeParameterMo91378d = TypeParameter.PARSER.mo91378d(codedInputStream, extensionRegistryLite);
                        if (typeParameterMo91378d != null) {
                            mo91349f(typeParameterMo91378d);
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
                                mo91349f(typeParameter);
                            }
                            throw th;
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                    if (typeParameter != null) {
                        mo91349f(typeParameter);
                    }
                    throw th;
                }
            }

            /* JADX INFO: renamed from: z */
            public Builder m91694z(int i) {
                this.f65967d |= 1;
                this.f65968e = i;
                return this;
            }
        }

        public enum Variance implements Internal.EnumLite {
            IN(0, 0),
            OUT(1, 1),
            INV(2, 2);

            private static Internal.EnumLiteMap<Variance> internalValueMap = new C15372a();
            private final int value;

            /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$TypeParameter$Variance$a */
            public static class C15372a implements Internal.EnumLiteMap<Variance> {
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
        public static class C15373a extends AbstractParser<TypeParameter> {
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.Parser
            /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
            public TypeParameter mo91378d(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
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
                                this.id_ = codedInputStream.m92100s();
                            } else if (iM92076K == 16) {
                                this.bitField0_ |= 2;
                                this.name_ = codedInputStream.m92100s();
                            } else if (iM92076K == 24) {
                                this.bitField0_ |= 4;
                                this.reified_ = codedInputStream.m92092k();
                            } else if (iM92076K == 32) {
                                int iM92095n = codedInputStream.m92095n();
                                Variance varianceValueOf = Variance.valueOf(iM92095n);
                                if (varianceValueOf == null) {
                                    codedOutputStreamM92117K.m92182s0(iM92076K);
                                    codedOutputStreamM92117K.m92182s0(iM92095n);
                                } else {
                                    this.bitField0_ |= 8;
                                    this.variance_ = varianceValueOf;
                                }
                            } else if (iM92076K == 42) {
                                if ((i & 16) != 16) {
                                    this.upperBound_ = new ArrayList();
                                    i |= 16;
                                }
                                this.upperBound_.add((Type) codedInputStream.m92102u(Type.PARSER, extensionRegistryLite));
                            } else if (iM92076K == 48) {
                                if ((i & 32) != 32) {
                                    this.upperBoundId_ = new ArrayList();
                                    i |= 32;
                                }
                                this.upperBoundId_.add(Integer.valueOf(codedInputStream.m92100s()));
                            } else if (iM92076K == 50) {
                                int iM92091j = codedInputStream.m92091j(codedInputStream.m92067A());
                                if ((i & 32) != 32 && codedInputStream.m92088e() > 0) {
                                    this.upperBoundId_ = new ArrayList();
                                    i |= 32;
                                }
                                while (codedInputStream.m92088e() > 0) {
                                    this.upperBoundId_.add(Integer.valueOf(codedInputStream.m92100s()));
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
                    if ((i & 16) == 16) {
                        this.upperBound_ = Collections.unmodifiableList(this.upperBound_);
                    }
                    if ((i & 32) == 32) {
                        this.upperBoundId_ = Collections.unmodifiableList(this.upperBoundId_);
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
            if ((i & 16) == 16) {
                this.upperBound_ = Collections.unmodifiableList(this.upperBound_);
            }
            if ((i & 32) == 32) {
                this.upperBoundId_ = Collections.unmodifiableList(this.upperBoundId_);
            }
            try {
                codedOutputStreamM92117K.m92149J();
            } catch (IOException unused2) {
            } finally {
                this.unknownFields = outputM92041w.m92061m();
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
            return newBuilder().mo91349f(typeParameter);
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
            int iM92134p = (this.bitField0_ & 1) == 1 ? CodedOutputStream.m92134p(1, this.id_) : 0;
            if ((this.bitField0_ & 2) == 2) {
                iM92134p += CodedOutputStream.m92134p(2, this.name_);
            }
            if ((this.bitField0_ & 4) == 4) {
                iM92134p += CodedOutputStream.m92120b(3, this.reified_);
            }
            if ((this.bitField0_ & 8) == 8) {
                iM92134p += CodedOutputStream.m92127i(4, this.variance_.getNumber());
            }
            for (int i2 = 0; i2 < this.upperBound_.size(); i2++) {
                iM92134p += CodedOutputStream.m92138t(5, this.upperBound_.get(i2));
            }
            int iM92135q = 0;
            for (int i3 = 0; i3 < this.upperBoundId_.size(); i3++) {
                iM92135q += CodedOutputStream.m92135q(this.upperBoundId_.get(i3).intValue());
            }
            int iM92135q2 = iM92134p + iM92135q;
            if (!getUpperBoundIdList().isEmpty()) {
                iM92135q2 = iM92135q2 + 1 + CodedOutputStream.m92135q(iM92135q);
            }
            this.upperBoundIdMemoizedSerializedSize = iM92135q;
            int iExtensionsSerializedSize = iM92135q2 + extensionsSerializedSize() + this.unknownFields.size();
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
                codedOutputStream.m92168e0(1, this.id_);
            }
            if ((this.bitField0_ & 2) == 2) {
                codedOutputStream.m92168e0(2, this.name_);
            }
            if ((this.bitField0_ & 4) == 4) {
                codedOutputStream.m92152P(3, this.reified_);
            }
            if ((this.bitField0_ & 8) == 8) {
                codedOutputStream.m92159W(4, this.variance_.getNumber());
            }
            for (int i = 0; i < this.upperBound_.size(); i++) {
                codedOutputStream.m92171h0(5, this.upperBound_.get(i));
            }
            if (getUpperBoundIdList().size() > 0) {
                codedOutputStream.m92182s0(50);
                codedOutputStream.m92182s0(this.upperBoundIdMemoizedSerializedSize);
            }
            for (int i2 = 0; i2 < this.upperBoundId_.size(); i2++) {
                codedOutputStream.m92169f0(this.upperBoundId_.get(i2).intValue());
            }
            extensionWriterNewExtensionWriter.m92229a(1000, codedOutputStream);
            codedOutputStream.m92176m0(this.unknownFields);
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
            return Builder.m91682t();
        }

        private TypeParameter(GeneratedMessageLite.ExtendableBuilder<TypeParameter, ?> extendableBuilder) {
            super(extendableBuilder);
            this.upperBoundIdMemoizedSerializedSize = -1;
            this.memoizedIsInitialized = (byte) -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = extendableBuilder.m92223e();
        }

        private TypeParameter(boolean z) {
            this.upperBoundIdMemoizedSerializedSize = -1;
            this.memoizedIsInitialized = (byte) -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = ByteString.f66289a;
        }
    }

    public static final class TypeTable extends GeneratedMessageLite implements TypeTableOrBuilder {
        public static Parser<TypeTable> PARSER = new C15374a();
        private static final TypeTable defaultInstance;
        private int bitField0_;
        private int firstNullable_;
        private byte memoizedIsInitialized;
        private int memoizedSerializedSize;
        private List<Type> type_;
        private final ByteString unknownFields;

        public static final class Builder extends GeneratedMessageLite.Builder<TypeTable, Builder> implements TypeTableOrBuilder {

            /* JADX INFO: renamed from: b */
            public int f65975b;

            /* JADX INFO: renamed from: c */
            public List<Type> f65976c = Collections.EMPTY_LIST;

            /* JADX INFO: renamed from: d */
            public int f65977d = -1;

            private Builder() {
                m91699q();
            }

            /* JADX INFO: renamed from: o */
            public static Builder m91698o() {
                return new Builder();
            }

            /* JADX INFO: renamed from: q */
            private void m91699q() {
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
            public TypeTable build() {
                TypeTable typeTableM91701m = m91701m();
                if (typeTableM91701m.isInitialized()) {
                    return typeTableM91701m;
                }
                throw AbstractMessageLite.Builder.m92024c(typeTableM91701m);
            }

            /* JADX INFO: renamed from: m */
            public TypeTable m91701m() {
                TypeTable typeTable = new TypeTable(this);
                int i = this.f65975b;
                if ((i & 1) == 1) {
                    this.f65976c = Collections.unmodifiableList(this.f65976c);
                    this.f65975b &= -2;
                }
                typeTable.type_ = this.f65976c;
                int i2 = (i & 2) != 2 ? 0 : 1;
                typeTable.firstNullable_ = this.f65977d;
                typeTable.bitField0_ = i2;
                return typeTable;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder
            /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
            public Builder mo91414m() {
                return m91698o().mo91349f(m91701m());
            }

            /* JADX INFO: renamed from: p */
            public final void m91703p() {
                if ((this.f65975b & 1) != 1) {
                    this.f65976c = new ArrayList(this.f65976c);
                    this.f65975b |= 1;
                }
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder
            /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
            public Builder mo91349f(TypeTable typeTable) {
                if (typeTable == TypeTable.getDefaultInstance()) {
                    return this;
                }
                if (!typeTable.type_.isEmpty()) {
                    if (this.f65976c.isEmpty()) {
                        this.f65976c = typeTable.type_;
                        this.f65975b &= -2;
                    } else {
                        m91703p();
                        this.f65976c.addAll(typeTable.type_);
                    }
                }
                if (typeTable.hasFirstNullable()) {
                    m91706t(typeTable.getFirstNullable());
                }
                m92224j(m92223e().m92047c(typeTable.unknownFields));
                return this;
            }

            /* JADX WARN: Code duplicated, block: B:15:0x001d  */
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
            public Builder mo91350i(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws Throwable {
                TypeTable typeTable = null;
                try {
                    try {
                        TypeTable typeTableMo91378d = TypeTable.PARSER.mo91378d(codedInputStream, extensionRegistryLite);
                        if (typeTableMo91378d != null) {
                            mo91349f(typeTableMo91378d);
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
                                mo91349f(typeTable);
                            }
                            throw th;
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                    if (typeTable != null) {
                        mo91349f(typeTable);
                    }
                    throw th;
                }
            }

            /* JADX INFO: renamed from: t */
            public Builder m91706t(int i) {
                this.f65975b |= 2;
                this.f65977d = i;
                return this;
            }
        }

        /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$TypeTable$a */
        public static class C15374a extends AbstractParser<TypeTable> {
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.Parser
            /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
            public TypeTable mo91378d(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
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
            ByteString.Output outputM92041w = ByteString.m92041w();
            CodedOutputStream codedOutputStreamM92117K = CodedOutputStream.m92117K(outputM92041w, 1);
            boolean z = false;
            boolean z2 = false;
            while (!z) {
                try {
                    try {
                        int iM92076K = codedInputStream.m92076K();
                        if (iM92076K != 0) {
                            if (iM92076K == 10) {
                                if (!z2) {
                                    this.type_ = new ArrayList();
                                    z2 = true;
                                }
                                this.type_.add((Type) codedInputStream.m92102u(Type.PARSER, extensionRegistryLite));
                            } else if (iM92076K == 16) {
                                this.bitField0_ |= 1;
                                this.firstNullable_ = codedInputStream.m92100s();
                            } else if (!parseUnknownField(codedInputStream, codedOutputStreamM92117K, extensionRegistryLite, iM92076K)) {
                            }
                        }
                        z = true;
                    } catch (Throwable th) {
                        if (z2) {
                            this.type_ = Collections.unmodifiableList(this.type_);
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
            if (z2) {
                this.type_ = Collections.unmodifiableList(this.type_);
            }
            try {
                codedOutputStreamM92117K.m92149J();
            } catch (IOException unused2) {
            } finally {
                this.unknownFields = outputM92041w.m92061m();
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
            return newBuilder().mo91349f(typeTable);
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
            int iM92134p = 0;
            for (int i2 = 0; i2 < this.type_.size(); i2++) {
                iM92134p += CodedOutputStream.m92138t(1, this.type_.get(i2));
            }
            if ((this.bitField0_ & 1) == 1) {
                iM92134p += CodedOutputStream.m92134p(2, this.firstNullable_);
            }
            int size = iM92134p + this.unknownFields.size();
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
                codedOutputStream.m92171h0(1, this.type_.get(i));
            }
            if ((this.bitField0_ & 1) == 1) {
                codedOutputStream.m92168e0(2, this.firstNullable_);
            }
            codedOutputStream.m92176m0(this.unknownFields);
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
            return Builder.m91698o();
        }

        private TypeTable(GeneratedMessageLite.Builder builder) {
            super(builder);
            this.memoizedIsInitialized = (byte) -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = builder.m92223e();
        }

        private TypeTable(boolean z) {
            this.memoizedIsInitialized = (byte) -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = ByteString.f66289a;
        }
    }

    public static final class ValueParameter extends GeneratedMessageLite.ExtendableMessage<ValueParameter> implements ValueParameterOrBuilder {
        public static Parser<ValueParameter> PARSER = new C15375a();
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
            public int f65978d;

            /* JADX INFO: renamed from: e */
            public int f65979e;

            /* JADX INFO: renamed from: f */
            public int f65980f;

            /* JADX INFO: renamed from: h */
            public int f65982h;

            /* JADX INFO: renamed from: j */
            public int f65984j;

            /* JADX INFO: renamed from: g */
            public Type f65981g = Type.getDefaultInstance();

            /* JADX INFO: renamed from: i */
            public Type f65983i = Type.getDefaultInstance();

            /* JADX INFO: renamed from: k */
            public List<Annotation> f65985k = Collections.EMPTY_LIST;

            /* JADX INFO: renamed from: l */
            public Annotation.Argument.Value f65986l = Annotation.Argument.Value.getDefaultInstance();

            private Builder() {
                m91711v();
            }

            /* JADX INFO: renamed from: t */
            public static Builder m91709t() {
                return new Builder();
            }

            /* JADX INFO: renamed from: u */
            private void m91710u() {
                if ((this.f65978d & 64) != 64) {
                    this.f65985k = new ArrayList(this.f65985k);
                    this.f65978d |= 64;
                }
            }

            /* JADX INFO: renamed from: v */
            private void m91711v() {
            }

            /* JADX INFO: renamed from: A */
            public Builder m91712A(Type type) {
                if ((this.f65978d & 16) != 16 || this.f65983i == Type.getDefaultInstance()) {
                    this.f65983i = type;
                } else {
                    this.f65983i = Type.newBuilder(this.f65983i).mo91349f(type).m91655r();
                }
                this.f65978d |= 16;
                return this;
            }

            /* JADX INFO: renamed from: B */
            public Builder m91713B(int i) {
                this.f65978d |= 1;
                this.f65979e = i;
                return this;
            }

            /* JADX INFO: renamed from: C */
            public Builder m91714C(int i) {
                this.f65978d |= 2;
                this.f65980f = i;
                return this;
            }

            /* JADX INFO: renamed from: D */
            public Builder m91715D(int i) {
                this.f65978d |= 8;
                this.f65982h = i;
                return this;
            }

            /* JADX INFO: renamed from: E */
            public Builder m91716E(int i) {
                this.f65978d |= 32;
                this.f65984j = i;
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
            public ValueParameter build() {
                ValueParameter valueParameterM91718r = m91718r();
                if (valueParameterM91718r.isInitialized()) {
                    return valueParameterM91718r;
                }
                throw AbstractMessageLite.Builder.m92024c(valueParameterM91718r);
            }

            /* JADX INFO: renamed from: r */
            public ValueParameter m91718r() {
                ValueParameter valueParameter = new ValueParameter(this);
                int i = this.f65978d;
                int i2 = (i & 1) != 1 ? 0 : 1;
                valueParameter.flags_ = this.f65979e;
                if ((i & 2) == 2) {
                    i2 |= 2;
                }
                valueParameter.name_ = this.f65980f;
                if ((i & 4) == 4) {
                    i2 |= 4;
                }
                valueParameter.type_ = this.f65981g;
                if ((i & 8) == 8) {
                    i2 |= 8;
                }
                valueParameter.typeId_ = this.f65982h;
                if ((i & 16) == 16) {
                    i2 |= 16;
                }
                valueParameter.varargElementType_ = this.f65983i;
                if ((i & 32) == 32) {
                    i2 |= 32;
                }
                valueParameter.varargElementTypeId_ = this.f65984j;
                if ((this.f65978d & 64) == 64) {
                    this.f65985k = Collections.unmodifiableList(this.f65985k);
                    this.f65978d &= -65;
                }
                valueParameter.annotation_ = this.f65985k;
                if ((i & 128) == 128) {
                    i2 |= 64;
                }
                valueParameter.annotationParameterDefaultValue_ = this.f65986l;
                valueParameter.bitField0_ = i2;
                return valueParameter;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableBuilder
            /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
            public Builder mo91414m() {
                return m91709t().mo91349f(m91718r());
            }

            /* JADX INFO: renamed from: w */
            public Builder m91720w(Annotation.Argument.Value value) {
                if ((this.f65978d & 128) != 128 || this.f65986l == Annotation.Argument.Value.getDefaultInstance()) {
                    this.f65986l = value;
                } else {
                    this.f65986l = Annotation.Argument.Value.newBuilder(this.f65986l).mo91349f(value).m91364m();
                }
                this.f65978d |= 128;
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder
            /* JADX INFO: renamed from: x, reason: merged with bridge method [inline-methods] */
            public Builder mo91349f(ValueParameter valueParameter) {
                if (valueParameter == ValueParameter.getDefaultInstance()) {
                    return this;
                }
                if (valueParameter.hasFlags()) {
                    m91713B(valueParameter.getFlags());
                }
                if (valueParameter.hasName()) {
                    m91714C(valueParameter.getName());
                }
                if (valueParameter.hasType()) {
                    m91723z(valueParameter.getType());
                }
                if (valueParameter.hasTypeId()) {
                    m91715D(valueParameter.getTypeId());
                }
                if (valueParameter.hasVarargElementType()) {
                    m91712A(valueParameter.getVarargElementType());
                }
                if (valueParameter.hasVarargElementTypeId()) {
                    m91716E(valueParameter.getVarargElementTypeId());
                }
                if (!valueParameter.annotation_.isEmpty()) {
                    if (this.f65985k.isEmpty()) {
                        this.f65985k = valueParameter.annotation_;
                        this.f65978d &= -65;
                    } else {
                        m91710u();
                        this.f65985k.addAll(valueParameter.annotation_);
                    }
                }
                if (valueParameter.hasAnnotationParameterDefaultValue()) {
                    m91720w(valueParameter.getAnnotationParameterDefaultValue());
                }
                m92228o(valueParameter);
                m92224j(m92223e().m92047c(valueParameter.unknownFields));
                return this;
            }

            /* JADX WARN: Code duplicated, block: B:15:0x001d  */
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
            public Builder mo91350i(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws Throwable {
                ValueParameter valueParameter = null;
                try {
                    try {
                        ValueParameter valueParameterMo91378d = ValueParameter.PARSER.mo91378d(codedInputStream, extensionRegistryLite);
                        if (valueParameterMo91378d != null) {
                            mo91349f(valueParameterMo91378d);
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
                                mo91349f(valueParameter);
                            }
                            throw th;
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                    if (valueParameter != null) {
                        mo91349f(valueParameter);
                    }
                    throw th;
                }
            }

            /* JADX INFO: renamed from: z */
            public Builder m91723z(Type type) {
                if ((this.f65978d & 4) != 4 || this.f65981g == Type.getDefaultInstance()) {
                    this.f65981g = type;
                } else {
                    this.f65981g = Type.newBuilder(this.f65981g).mo91349f(type).m91655r();
                }
                this.f65978d |= 4;
                return this;
            }
        }

        /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$ValueParameter$a */
        public static class C15375a extends AbstractParser<ValueParameter> {
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.Parser
            /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
            public ValueParameter mo91378d(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
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
            ByteString.Output outputM92041w = ByteString.m92041w();
            CodedOutputStream codedOutputStreamM92117K = CodedOutputStream.m92117K(outputM92041w, 1);
            boolean z = false;
            char c = 0;
            while (!z) {
                try {
                    try {
                        int iM92076K = codedInputStream.m92076K();
                        if (iM92076K != 0) {
                            if (iM92076K == 8) {
                                this.bitField0_ |= 1;
                                this.flags_ = codedInputStream.m92100s();
                            } else if (iM92076K != 16) {
                                if (iM92076K == 26) {
                                    Type.Builder builder = (this.bitField0_ & 4) == 4 ? this.type_.toBuilder() : null;
                                    Type type = (Type) codedInputStream.m92102u(Type.PARSER, extensionRegistryLite);
                                    this.type_ = type;
                                    if (builder != null) {
                                        builder.mo91349f(type);
                                        this.type_ = builder.m91655r();
                                    }
                                    this.bitField0_ |= 4;
                                } else if (iM92076K == 34) {
                                    Type.Builder builder2 = (this.bitField0_ & 16) == 16 ? this.varargElementType_.toBuilder() : null;
                                    Type type2 = (Type) codedInputStream.m92102u(Type.PARSER, extensionRegistryLite);
                                    this.varargElementType_ = type2;
                                    if (builder2 != null) {
                                        builder2.mo91349f(type2);
                                        this.varargElementType_ = builder2.m91655r();
                                    }
                                    this.bitField0_ |= 16;
                                } else if (iM92076K == 40) {
                                    this.bitField0_ |= 8;
                                    this.typeId_ = codedInputStream.m92100s();
                                } else if (iM92076K == 48) {
                                    this.bitField0_ |= 32;
                                    this.varargElementTypeId_ = codedInputStream.m92100s();
                                } else if (iM92076K == 58) {
                                    int i = (c == true ? 1 : 0) & '@';
                                    c = c;
                                    if (i != 64) {
                                        this.annotation_ = new ArrayList();
                                        c = '@';
                                    }
                                    this.annotation_.add((Annotation) codedInputStream.m92102u(Annotation.PARSER, extensionRegistryLite));
                                } else if (iM92076K == 66) {
                                    Annotation.Argument.Value.Builder builder3 = (this.bitField0_ & 64) == 64 ? this.annotationParameterDefaultValue_.toBuilder() : null;
                                    Annotation.Argument.Value value = (Annotation.Argument.Value) codedInputStream.m92102u(Annotation.Argument.Value.PARSER, extensionRegistryLite);
                                    this.annotationParameterDefaultValue_ = value;
                                    if (builder3 != null) {
                                        builder3.mo91349f(value);
                                        this.annotationParameterDefaultValue_ = builder3.m91364m();
                                    }
                                    this.bitField0_ |= 64;
                                } else if (!parseUnknownField(codedInputStream, codedOutputStreamM92117K, extensionRegistryLite, iM92076K)) {
                                }
                            } else {
                                this.bitField0_ |= 2;
                                this.name_ = codedInputStream.m92100s();
                            }
                        }
                        z = true;
                    } catch (Throwable th) {
                        if (((c == true ? 1 : 0) & '@') == 64) {
                            this.annotation_ = Collections.unmodifiableList(this.annotation_);
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
            if (((c == true ? 1 : 0) & '@') == 64) {
                this.annotation_ = Collections.unmodifiableList(this.annotation_);
            }
            try {
                codedOutputStreamM92117K.m92149J();
            } catch (IOException unused2) {
            } finally {
                this.unknownFields = outputM92041w.m92061m();
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
            return newBuilder().mo91349f(valueParameter);
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
            int iM92134p = (this.bitField0_ & 1) == 1 ? CodedOutputStream.m92134p(1, this.flags_) : 0;
            if ((this.bitField0_ & 2) == 2) {
                iM92134p += CodedOutputStream.m92134p(2, this.name_);
            }
            if ((this.bitField0_ & 4) == 4) {
                iM92134p += CodedOutputStream.m92138t(3, this.type_);
            }
            if ((this.bitField0_ & 16) == 16) {
                iM92134p += CodedOutputStream.m92138t(4, this.varargElementType_);
            }
            if ((this.bitField0_ & 8) == 8) {
                iM92134p += CodedOutputStream.m92134p(5, this.typeId_);
            }
            if ((this.bitField0_ & 32) == 32) {
                iM92134p += CodedOutputStream.m92134p(6, this.varargElementTypeId_);
            }
            for (int i2 = 0; i2 < this.annotation_.size(); i2++) {
                iM92134p += CodedOutputStream.m92138t(7, this.annotation_.get(i2));
            }
            if ((this.bitField0_ & 64) == 64) {
                iM92134p += CodedOutputStream.m92138t(8, this.annotationParameterDefaultValue_);
            }
            int iExtensionsSerializedSize = iM92134p + extensionsSerializedSize() + this.unknownFields.size();
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
                codedOutputStream.m92168e0(1, this.flags_);
            }
            if ((this.bitField0_ & 2) == 2) {
                codedOutputStream.m92168e0(2, this.name_);
            }
            if ((this.bitField0_ & 4) == 4) {
                codedOutputStream.m92171h0(3, this.type_);
            }
            if ((this.bitField0_ & 16) == 16) {
                codedOutputStream.m92171h0(4, this.varargElementType_);
            }
            if ((this.bitField0_ & 8) == 8) {
                codedOutputStream.m92168e0(5, this.typeId_);
            }
            if ((this.bitField0_ & 32) == 32) {
                codedOutputStream.m92168e0(6, this.varargElementTypeId_);
            }
            for (int i = 0; i < this.annotation_.size(); i++) {
                codedOutputStream.m92171h0(7, this.annotation_.get(i));
            }
            if ((this.bitField0_ & 64) == 64) {
                codedOutputStream.m92171h0(8, this.annotationParameterDefaultValue_);
            }
            extensionWriterNewExtensionWriter.m92229a(200, codedOutputStream);
            codedOutputStream.m92176m0(this.unknownFields);
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
            return Builder.m91709t();
        }

        private ValueParameter(GeneratedMessageLite.ExtendableBuilder<ValueParameter, ?> extendableBuilder) {
            super(extendableBuilder);
            this.memoizedIsInitialized = (byte) -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = extendableBuilder.m92223e();
        }

        private ValueParameter(boolean z) {
            this.memoizedIsInitialized = (byte) -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = ByteString.f66289a;
        }
    }

    public static final class VersionRequirement extends GeneratedMessageLite implements VersionRequirementOrBuilder {
        public static Parser<VersionRequirement> PARSER = new C15378a();
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
            public int f65987b;

            /* JADX INFO: renamed from: c */
            public int f65988c;

            /* JADX INFO: renamed from: d */
            public int f65989d;

            /* JADX INFO: renamed from: f */
            public int f65991f;

            /* JADX INFO: renamed from: g */
            public int f65992g;

            /* JADX INFO: renamed from: e */
            public Level f65990e = Level.ERROR;

            /* JADX INFO: renamed from: h */
            public VersionKind f65993h = VersionKind.LANGUAGE_VERSION;

            private Builder() {
                m91727p();
            }

            /* JADX INFO: renamed from: o */
            public static Builder m91726o() {
                return new Builder();
            }

            /* JADX INFO: renamed from: p */
            private void m91727p() {
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
            public VersionRequirement build() {
                VersionRequirement versionRequirementM91729m = m91729m();
                if (versionRequirementM91729m.isInitialized()) {
                    return versionRequirementM91729m;
                }
                throw AbstractMessageLite.Builder.m92024c(versionRequirementM91729m);
            }

            /* JADX INFO: renamed from: m */
            public VersionRequirement m91729m() {
                VersionRequirement versionRequirement = new VersionRequirement(this);
                int i = this.f65987b;
                int i2 = (i & 1) != 1 ? 0 : 1;
                versionRequirement.version_ = this.f65988c;
                if ((i & 2) == 2) {
                    i2 |= 2;
                }
                versionRequirement.versionFull_ = this.f65989d;
                if ((i & 4) == 4) {
                    i2 |= 4;
                }
                versionRequirement.level_ = this.f65990e;
                if ((i & 8) == 8) {
                    i2 |= 8;
                }
                versionRequirement.errorCode_ = this.f65991f;
                if ((i & 16) == 16) {
                    i2 |= 16;
                }
                versionRequirement.message_ = this.f65992g;
                if ((i & 32) == 32) {
                    i2 |= 32;
                }
                versionRequirement.versionKind_ = this.f65993h;
                versionRequirement.bitField0_ = i2;
                return versionRequirement;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder
            /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
            public Builder mo91414m() {
                return m91726o().mo91349f(m91729m());
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder
            /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
            public Builder mo91349f(VersionRequirement versionRequirement) {
                if (versionRequirement == VersionRequirement.getDefaultInstance()) {
                    return this;
                }
                if (versionRequirement.hasVersion()) {
                    m91736v(versionRequirement.getVersion());
                }
                if (versionRequirement.hasVersionFull()) {
                    m91737w(versionRequirement.getVersionFull());
                }
                if (versionRequirement.hasLevel()) {
                    m91734t(versionRequirement.getLevel());
                }
                if (versionRequirement.hasErrorCode()) {
                    m91733s(versionRequirement.getErrorCode());
                }
                if (versionRequirement.hasMessage()) {
                    m91735u(versionRequirement.getMessage());
                }
                if (versionRequirement.hasVersionKind()) {
                    m91738x(versionRequirement.getVersionKind());
                }
                m92224j(m92223e().m92047c(versionRequirement.unknownFields));
                return this;
            }

            /* JADX WARN: Code duplicated, block: B:15:0x001d  */
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
            public Builder mo91350i(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws Throwable {
                VersionRequirement versionRequirement = null;
                try {
                    try {
                        VersionRequirement versionRequirementMo91378d = VersionRequirement.PARSER.mo91378d(codedInputStream, extensionRegistryLite);
                        if (versionRequirementMo91378d != null) {
                            mo91349f(versionRequirementMo91378d);
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
                                mo91349f(versionRequirement);
                            }
                            throw th;
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                    if (versionRequirement != null) {
                        mo91349f(versionRequirement);
                    }
                    throw th;
                }
            }

            /* JADX INFO: renamed from: s */
            public Builder m91733s(int i) {
                this.f65987b |= 8;
                this.f65991f = i;
                return this;
            }

            /* JADX INFO: renamed from: t */
            public Builder m91734t(Level level) {
                level.getClass();
                this.f65987b |= 4;
                this.f65990e = level;
                return this;
            }

            /* JADX INFO: renamed from: u */
            public Builder m91735u(int i) {
                this.f65987b |= 16;
                this.f65992g = i;
                return this;
            }

            /* JADX INFO: renamed from: v */
            public Builder m91736v(int i) {
                this.f65987b |= 1;
                this.f65988c = i;
                return this;
            }

            /* JADX INFO: renamed from: w */
            public Builder m91737w(int i) {
                this.f65987b |= 2;
                this.f65989d = i;
                return this;
            }

            /* JADX INFO: renamed from: x */
            public Builder m91738x(VersionKind versionKind) {
                versionKind.getClass();
                this.f65987b |= 32;
                this.f65993h = versionKind;
                return this;
            }
        }

        public enum Level implements Internal.EnumLite {
            WARNING(0, 0),
            ERROR(1, 1),
            HIDDEN(2, 2);

            private static Internal.EnumLiteMap<Level> internalValueMap = new C15376a();
            private final int value;

            /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$VersionRequirement$Level$a */
            public static class C15376a implements Internal.EnumLiteMap<Level> {
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

            private static Internal.EnumLiteMap<VersionKind> internalValueMap = new C15377a();
            private final int value;

            /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$VersionRequirement$VersionKind$a */
            public static class C15377a implements Internal.EnumLiteMap<VersionKind> {
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
        public static class C15378a extends AbstractParser<VersionRequirement> {
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.Parser
            /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
            public VersionRequirement mo91378d(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
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
                                this.version_ = codedInputStream.m92100s();
                            } else if (iM92076K == 16) {
                                this.bitField0_ |= 2;
                                this.versionFull_ = codedInputStream.m92100s();
                            } else if (iM92076K == 24) {
                                int iM92095n = codedInputStream.m92095n();
                                Level levelValueOf = Level.valueOf(iM92095n);
                                if (levelValueOf == null) {
                                    codedOutputStreamM92117K.m92182s0(iM92076K);
                                    codedOutputStreamM92117K.m92182s0(iM92095n);
                                } else {
                                    this.bitField0_ |= 4;
                                    this.level_ = levelValueOf;
                                }
                            } else if (iM92076K == 32) {
                                this.bitField0_ |= 8;
                                this.errorCode_ = codedInputStream.m92100s();
                            } else if (iM92076K == 40) {
                                this.bitField0_ |= 16;
                                this.message_ = codedInputStream.m92100s();
                            } else if (iM92076K == 48) {
                                int iM92095n2 = codedInputStream.m92095n();
                                VersionKind versionKindValueOf = VersionKind.valueOf(iM92095n2);
                                if (versionKindValueOf == null) {
                                    codedOutputStreamM92117K.m92182s0(iM92076K);
                                    codedOutputStreamM92117K.m92182s0(iM92095n2);
                                } else {
                                    this.bitField0_ |= 32;
                                    this.versionKind_ = versionKindValueOf;
                                }
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
            return newBuilder().mo91349f(versionRequirement);
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
            int iM92134p = (this.bitField0_ & 1) == 1 ? CodedOutputStream.m92134p(1, this.version_) : 0;
            if ((this.bitField0_ & 2) == 2) {
                iM92134p += CodedOutputStream.m92134p(2, this.versionFull_);
            }
            if ((this.bitField0_ & 4) == 4) {
                iM92134p += CodedOutputStream.m92127i(3, this.level_.getNumber());
            }
            if ((this.bitField0_ & 8) == 8) {
                iM92134p += CodedOutputStream.m92134p(4, this.errorCode_);
            }
            if ((this.bitField0_ & 16) == 16) {
                iM92134p += CodedOutputStream.m92134p(5, this.message_);
            }
            if ((this.bitField0_ & 32) == 32) {
                iM92134p += CodedOutputStream.m92127i(6, this.versionKind_.getNumber());
            }
            int size = iM92134p + this.unknownFields.size();
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
                codedOutputStream.m92168e0(1, this.version_);
            }
            if ((this.bitField0_ & 2) == 2) {
                codedOutputStream.m92168e0(2, this.versionFull_);
            }
            if ((this.bitField0_ & 4) == 4) {
                codedOutputStream.m92159W(3, this.level_.getNumber());
            }
            if ((this.bitField0_ & 8) == 8) {
                codedOutputStream.m92168e0(4, this.errorCode_);
            }
            if ((this.bitField0_ & 16) == 16) {
                codedOutputStream.m92168e0(5, this.message_);
            }
            if ((this.bitField0_ & 32) == 32) {
                codedOutputStream.m92159W(6, this.versionKind_.getNumber());
            }
            codedOutputStream.m92176m0(this.unknownFields);
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
            return Builder.m91726o();
        }

        private VersionRequirement(GeneratedMessageLite.Builder builder) {
            super(builder);
            this.memoizedIsInitialized = (byte) -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = builder.m92223e();
        }

        private VersionRequirement(boolean z) {
            this.memoizedIsInitialized = (byte) -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = ByteString.f66289a;
        }
    }

    public static final class VersionRequirementTable extends GeneratedMessageLite implements VersionRequirementTableOrBuilder {
        public static Parser<VersionRequirementTable> PARSER = new C15379a();
        private static final VersionRequirementTable defaultInstance;
        private byte memoizedIsInitialized;
        private int memoizedSerializedSize;
        private List<VersionRequirement> requirement_;
        private final ByteString unknownFields;

        public static final class Builder extends GeneratedMessageLite.Builder<VersionRequirementTable, Builder> implements VersionRequirementTableOrBuilder {

            /* JADX INFO: renamed from: b */
            public int f65994b;

            /* JADX INFO: renamed from: c */
            public List<VersionRequirement> f65995c = Collections.EMPTY_LIST;

            private Builder() {
                m91744q();
            }

            /* JADX INFO: renamed from: o */
            public static Builder m91743o() {
                return new Builder();
            }

            /* JADX INFO: renamed from: q */
            private void m91744q() {
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
            public VersionRequirementTable build() {
                VersionRequirementTable versionRequirementTableM91746m = m91746m();
                if (versionRequirementTableM91746m.isInitialized()) {
                    return versionRequirementTableM91746m;
                }
                throw AbstractMessageLite.Builder.m92024c(versionRequirementTableM91746m);
            }

            /* JADX INFO: renamed from: m */
            public VersionRequirementTable m91746m() {
                VersionRequirementTable versionRequirementTable = new VersionRequirementTable(this);
                if ((this.f65994b & 1) == 1) {
                    this.f65995c = Collections.unmodifiableList(this.f65995c);
                    this.f65994b &= -2;
                }
                versionRequirementTable.requirement_ = this.f65995c;
                return versionRequirementTable;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder
            /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
            public Builder mo91414m() {
                return m91743o().mo91349f(m91746m());
            }

            /* JADX INFO: renamed from: p */
            public final void m91748p() {
                if ((this.f65994b & 1) != 1) {
                    this.f65995c = new ArrayList(this.f65995c);
                    this.f65994b |= 1;
                }
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder
            /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
            public Builder mo91349f(VersionRequirementTable versionRequirementTable) {
                if (versionRequirementTable == VersionRequirementTable.getDefaultInstance()) {
                    return this;
                }
                if (!versionRequirementTable.requirement_.isEmpty()) {
                    if (this.f65995c.isEmpty()) {
                        this.f65995c = versionRequirementTable.requirement_;
                        this.f65994b &= -2;
                    } else {
                        m91748p();
                        this.f65995c.addAll(versionRequirementTable.requirement_);
                    }
                }
                m92224j(m92223e().m92047c(versionRequirementTable.unknownFields));
                return this;
            }

            /* JADX WARN: Code duplicated, block: B:15:0x001d  */
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
            public Builder mo91350i(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws Throwable {
                VersionRequirementTable versionRequirementTable = null;
                try {
                    try {
                        VersionRequirementTable versionRequirementTableMo91378d = VersionRequirementTable.PARSER.mo91378d(codedInputStream, extensionRegistryLite);
                        if (versionRequirementTableMo91378d != null) {
                            mo91349f(versionRequirementTableMo91378d);
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
                                mo91349f(versionRequirementTable);
                            }
                            throw th;
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                    if (versionRequirementTable != null) {
                        mo91349f(versionRequirementTable);
                    }
                    throw th;
                }
            }
        }

        /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$VersionRequirementTable$a */
        public static class C15379a extends AbstractParser<VersionRequirementTable> {
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.Parser
            /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
            public VersionRequirementTable mo91378d(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
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
            ByteString.Output outputM92041w = ByteString.m92041w();
            CodedOutputStream codedOutputStreamM92117K = CodedOutputStream.m92117K(outputM92041w, 1);
            boolean z = false;
            boolean z2 = false;
            while (!z) {
                try {
                    try {
                        try {
                            int iM92076K = codedInputStream.m92076K();
                            if (iM92076K != 0) {
                                if (iM92076K == 10) {
                                    if (!z2) {
                                        this.requirement_ = new ArrayList();
                                        z2 = true;
                                    }
                                    this.requirement_.add((VersionRequirement) codedInputStream.m92102u(VersionRequirement.PARSER, extensionRegistryLite));
                                } else if (!parseUnknownField(codedInputStream, codedOutputStreamM92117K, extensionRegistryLite, iM92076K)) {
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
                        codedOutputStreamM92117K.m92149J();
                    } catch (IOException unused) {
                    } finally {
                        this.unknownFields = outputM92041w.m92061m();
                    }
                    makeExtensionsImmutable();
                    throw th;
                }
            }
            if (z2) {
                this.requirement_ = Collections.unmodifiableList(this.requirement_);
            }
            try {
                codedOutputStreamM92117K.m92149J();
            } catch (IOException unused2) {
            } finally {
                this.unknownFields = outputM92041w.m92061m();
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
            return newBuilder().mo91349f(versionRequirementTable);
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
            int iM92138t = 0;
            for (int i2 = 0; i2 < this.requirement_.size(); i2++) {
                iM92138t += CodedOutputStream.m92138t(1, this.requirement_.get(i2));
            }
            int size = iM92138t + this.unknownFields.size();
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
                codedOutputStream.m92171h0(1, this.requirement_.get(i));
            }
            codedOutputStream.m92176m0(this.unknownFields);
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
            return Builder.m91743o();
        }

        private VersionRequirementTable(GeneratedMessageLite.Builder builder) {
            super(builder);
            this.memoizedIsInitialized = (byte) -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = builder.m92223e();
        }

        private VersionRequirementTable(boolean z) {
            this.memoizedIsInitialized = (byte) -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = ByteString.f66289a;
        }
    }
}
