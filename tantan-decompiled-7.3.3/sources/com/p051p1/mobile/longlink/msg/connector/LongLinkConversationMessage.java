package com.p051p1.mobile.longlink.msg.connector;

import com.google.protobuf.AbstractC3426a;
import com.google.protobuf.ByteString;
import com.google.protobuf.C3430e;
import com.google.protobuf.C3433h;
import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InterfaceC3442q;
import com.google.protobuf.InvalidProtocolBufferException;
import java.io.IOException;
import java.io.InputStream;
import p153l.iig0;
import p153l.l710;
import p153l.lfz;
import p153l.ng60;

/* JADX INFO: loaded from: classes8.dex */
public final class LongLinkConversationMessage {

    /* JADX INFO: renamed from: com.p1.mobile.longlink.msg.connector.LongLinkConversationMessage$1 */
    public static /* synthetic */ class C45471 {

        /* JADX INFO: renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f16648xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f16648xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f16648xa1df5c61[GeneratedMessageLite.MethodToInvoke.IS_INITIALIZED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f16648xa1df5c61[GeneratedMessageLite.MethodToInvoke.MAKE_IMMUTABLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f16648xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f16648xa1df5c61[GeneratedMessageLite.MethodToInvoke.VISIT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f16648xa1df5c61[GeneratedMessageLite.MethodToInvoke.MERGE_FROM_STREAM.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f16648xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f16648xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    public interface BlockConversationOrBuilder extends lfz {
        @Override // p153l.lfz
        /* synthetic */ InterfaceC3442q getDefaultInstanceForType();

        String getOtherUserId();

        ByteString getOtherUserIdBytes();

        @Override // p153l.lfz
        /* synthetic */ boolean isInitialized();
    }

    public interface CreateConversationOrBuilder extends lfz {
        @Override // p153l.lfz
        /* synthetic */ InterfaceC3442q getDefaultInstanceForType();

        String getOtherUserId();

        ByteString getOtherUserIdBytes();

        @Override // p153l.lfz
        /* synthetic */ boolean isInitialized();
    }

    public interface DeleteConversationOrBuilder extends lfz {
        String getAction();

        ByteString getActionBytes();

        @Override // p153l.lfz
        /* synthetic */ InterfaceC3442q getDefaultInstanceForType();

        String getOtherUserId();

        ByteString getOtherUserIdBytes();

        @Override // p153l.lfz
        /* synthetic */ boolean isInitialized();
    }

    private LongLinkConversationMessage() {
    }

    public static void registerAllExtensions(C3433h c3433h) {
    }

    public static final class BlockConversation extends GeneratedMessageLite<BlockConversation, Builder> implements BlockConversationOrBuilder {
        private static final BlockConversation DEFAULT_INSTANCE;
        public static final int OTHERUSERID_FIELD_NUMBER = 1;
        private static volatile ng60<BlockConversation> PARSER;
        private String otherUserId_ = "";

        public static final class Builder extends GeneratedMessageLite.AbstractC3403b<BlockConversation, Builder> implements BlockConversationOrBuilder {
            private Builder() {
                super(BlockConversation.DEFAULT_INSTANCE);
            }

            public Builder clearOtherUserId() {
                copyOnWrite();
                ((BlockConversation) this.instance).clearOtherUserId();
                return this;
            }

            @Override // com.p1.mobile.longlink.msg.connector.LongLinkConversationMessage.BlockConversationOrBuilder
            public String getOtherUserId() {
                return ((BlockConversation) this.instance).getOtherUserId();
            }

            @Override // com.p1.mobile.longlink.msg.connector.LongLinkConversationMessage.BlockConversationOrBuilder
            public ByteString getOtherUserIdBytes() {
                return ((BlockConversation) this.instance).getOtherUserIdBytes();
            }

            public Builder setOtherUserId(String str) {
                copyOnWrite();
                ((BlockConversation) this.instance).setOtherUserId(str);
                return this;
            }

            public Builder setOtherUserIdBytes(ByteString byteString) {
                copyOnWrite();
                ((BlockConversation) this.instance).setOtherUserIdBytes(byteString);
                return this;
            }
        }

        static {
            BlockConversation blockConversation = new BlockConversation();
            DEFAULT_INSTANCE = blockConversation;
            blockConversation.makeImmutable();
        }

        private BlockConversation() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearOtherUserId() {
            this.otherUserId_ = getDefaultInstance().getOtherUserId();
        }

        public static BlockConversation getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder(BlockConversation blockConversation) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(blockConversation);
        }

        public static BlockConversation parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (BlockConversation) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static BlockConversation parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (BlockConversation) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static ng60<BlockConversation> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setOtherUserId(String str) {
            str.getClass();
            this.otherUserId_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setOtherUserIdBytes(ByteString byteString) {
            byteString.getClass();
            AbstractC3426a.checkByteStringIsUtf8(byteString);
            this.otherUserId_ = byteString.toStringUtf8();
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (C45471.f16648xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new BlockConversation();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                    return null;
                case 4:
                    return new Builder();
                case 5:
                    BlockConversation blockConversation = (BlockConversation) obj2;
                    this.otherUserId_ = ((GeneratedMessageLite.InterfaceC3409h) obj).mo17052f(!this.otherUserId_.isEmpty(), this.otherUserId_, true ^ blockConversation.otherUserId_.isEmpty(), blockConversation.otherUserId_);
                    GeneratedMessageLite.C3408g c3408g = GeneratedMessageLite.C3408g.INSTANCE;
                    return this;
                case 6:
                    C3430e c3430e = (C3430e) obj;
                    boolean z = false;
                    while (!z) {
                        try {
                            int iM17171M = c3430e.m17171M();
                            if (iM17171M != 0) {
                                if (iM17171M == 10) {
                                    this.otherUserId_ = c3430e.m17170L();
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
                        synchronized (BlockConversation.class) {
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

        @Override // com.p1.mobile.longlink.msg.connector.LongLinkConversationMessage.BlockConversationOrBuilder
        public String getOtherUserId() {
            return this.otherUserId_;
        }

        @Override // com.p1.mobile.longlink.msg.connector.LongLinkConversationMessage.BlockConversationOrBuilder
        public ByteString getOtherUserIdBytes() {
            return ByteString.copyFromUtf8(this.otherUserId_);
        }

        @Override // com.google.protobuf.InterfaceC3442q
        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int iM16956K = !this.otherUserId_.isEmpty() ? CodedOutputStream.m16956K(1, getOtherUserId()) : 0;
            this.memoizedSerializedSize = iM16956K;
            return iM16956K;
        }

        @Override // com.google.protobuf.InterfaceC3442q
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (this.otherUserId_.isEmpty()) {
                return;
            }
            codedOutputStream.mo16994D0(1, getOtherUserId());
        }

        public static BlockConversation parseDelimitedFrom(InputStream inputStream, C3433h c3433h) throws IOException {
            return (BlockConversation) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, c3433h);
        }

        public static BlockConversation parseFrom(ByteString byteString, C3433h c3433h) throws InvalidProtocolBufferException {
            return (BlockConversation) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, c3433h);
        }

        public static BlockConversation parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (BlockConversation) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static BlockConversation parseFrom(byte[] bArr, C3433h c3433h) throws InvalidProtocolBufferException {
            return (BlockConversation) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, c3433h);
        }

        public static BlockConversation parseFrom(InputStream inputStream) throws IOException {
            return (BlockConversation) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static BlockConversation parseFrom(InputStream inputStream, C3433h c3433h) throws IOException {
            return (BlockConversation) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, c3433h);
        }

        public static BlockConversation parseFrom(C3430e c3430e) throws IOException {
            return (BlockConversation) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, c3430e);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static BlockConversation parseFrom(C3430e c3430e, C3433h c3433h) throws IOException {
            return (BlockConversation) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, c3430e, c3433h);
        }
    }

    public static final class CreateConversation extends GeneratedMessageLite<CreateConversation, Builder> implements CreateConversationOrBuilder {
        private static final CreateConversation DEFAULT_INSTANCE;
        public static final int OTHERUSERID_FIELD_NUMBER = 1;
        private static volatile ng60<CreateConversation> PARSER;
        private String otherUserId_ = "";

        public static final class Builder extends GeneratedMessageLite.AbstractC3403b<CreateConversation, Builder> implements CreateConversationOrBuilder {
            private Builder() {
                super(CreateConversation.DEFAULT_INSTANCE);
            }

            public Builder clearOtherUserId() {
                copyOnWrite();
                ((CreateConversation) this.instance).clearOtherUserId();
                return this;
            }

            @Override // com.p1.mobile.longlink.msg.connector.LongLinkConversationMessage.CreateConversationOrBuilder
            public String getOtherUserId() {
                return ((CreateConversation) this.instance).getOtherUserId();
            }

            @Override // com.p1.mobile.longlink.msg.connector.LongLinkConversationMessage.CreateConversationOrBuilder
            public ByteString getOtherUserIdBytes() {
                return ((CreateConversation) this.instance).getOtherUserIdBytes();
            }

            public Builder setOtherUserId(String str) {
                copyOnWrite();
                ((CreateConversation) this.instance).setOtherUserId(str);
                return this;
            }

            public Builder setOtherUserIdBytes(ByteString byteString) {
                copyOnWrite();
                ((CreateConversation) this.instance).setOtherUserIdBytes(byteString);
                return this;
            }
        }

        static {
            CreateConversation createConversation = new CreateConversation();
            DEFAULT_INSTANCE = createConversation;
            createConversation.makeImmutable();
        }

        private CreateConversation() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearOtherUserId() {
            this.otherUserId_ = getDefaultInstance().getOtherUserId();
        }

        public static CreateConversation getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder(CreateConversation createConversation) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(createConversation);
        }

        public static CreateConversation parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (CreateConversation) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static CreateConversation parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (CreateConversation) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static ng60<CreateConversation> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setOtherUserId(String str) {
            str.getClass();
            this.otherUserId_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setOtherUserIdBytes(ByteString byteString) {
            byteString.getClass();
            AbstractC3426a.checkByteStringIsUtf8(byteString);
            this.otherUserId_ = byteString.toStringUtf8();
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (C45471.f16648xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new CreateConversation();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                    return null;
                case 4:
                    return new Builder();
                case 5:
                    CreateConversation createConversation = (CreateConversation) obj2;
                    this.otherUserId_ = ((GeneratedMessageLite.InterfaceC3409h) obj).mo17052f(!this.otherUserId_.isEmpty(), this.otherUserId_, true ^ createConversation.otherUserId_.isEmpty(), createConversation.otherUserId_);
                    GeneratedMessageLite.C3408g c3408g = GeneratedMessageLite.C3408g.INSTANCE;
                    return this;
                case 6:
                    C3430e c3430e = (C3430e) obj;
                    boolean z = false;
                    while (!z) {
                        try {
                            int iM17171M = c3430e.m17171M();
                            if (iM17171M != 0) {
                                if (iM17171M == 10) {
                                    this.otherUserId_ = c3430e.m17170L();
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
                        synchronized (CreateConversation.class) {
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

        @Override // com.p1.mobile.longlink.msg.connector.LongLinkConversationMessage.CreateConversationOrBuilder
        public String getOtherUserId() {
            return this.otherUserId_;
        }

        @Override // com.p1.mobile.longlink.msg.connector.LongLinkConversationMessage.CreateConversationOrBuilder
        public ByteString getOtherUserIdBytes() {
            return ByteString.copyFromUtf8(this.otherUserId_);
        }

        @Override // com.google.protobuf.InterfaceC3442q
        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int iM16956K = !this.otherUserId_.isEmpty() ? CodedOutputStream.m16956K(1, getOtherUserId()) : 0;
            this.memoizedSerializedSize = iM16956K;
            return iM16956K;
        }

        @Override // com.google.protobuf.InterfaceC3442q
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (this.otherUserId_.isEmpty()) {
                return;
            }
            codedOutputStream.mo16994D0(1, getOtherUserId());
        }

        public static CreateConversation parseDelimitedFrom(InputStream inputStream, C3433h c3433h) throws IOException {
            return (CreateConversation) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, c3433h);
        }

        public static CreateConversation parseFrom(ByteString byteString, C3433h c3433h) throws InvalidProtocolBufferException {
            return (CreateConversation) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, c3433h);
        }

        public static CreateConversation parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (CreateConversation) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static CreateConversation parseFrom(byte[] bArr, C3433h c3433h) throws InvalidProtocolBufferException {
            return (CreateConversation) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, c3433h);
        }

        public static CreateConversation parseFrom(InputStream inputStream) throws IOException {
            return (CreateConversation) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static CreateConversation parseFrom(InputStream inputStream, C3433h c3433h) throws IOException {
            return (CreateConversation) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, c3433h);
        }

        public static CreateConversation parseFrom(C3430e c3430e) throws IOException {
            return (CreateConversation) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, c3430e);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static CreateConversation parseFrom(C3430e c3430e, C3433h c3433h) throws IOException {
            return (CreateConversation) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, c3430e, c3433h);
        }
    }

    public static final class DeleteConversation extends GeneratedMessageLite<DeleteConversation, Builder> implements DeleteConversationOrBuilder {
        public static final int ACTION_FIELD_NUMBER = 2;
        private static final DeleteConversation DEFAULT_INSTANCE;
        public static final int OTHERUSERID_FIELD_NUMBER = 1;
        private static volatile ng60<DeleteConversation> PARSER;
        private String otherUserId_ = "";
        private String action_ = "";

        public static final class Builder extends GeneratedMessageLite.AbstractC3403b<DeleteConversation, Builder> implements DeleteConversationOrBuilder {
            private Builder() {
                super(DeleteConversation.DEFAULT_INSTANCE);
            }

            public Builder clearAction() {
                copyOnWrite();
                ((DeleteConversation) this.instance).clearAction();
                return this;
            }

            public Builder clearOtherUserId() {
                copyOnWrite();
                ((DeleteConversation) this.instance).clearOtherUserId();
                return this;
            }

            @Override // com.p1.mobile.longlink.msg.connector.LongLinkConversationMessage.DeleteConversationOrBuilder
            public String getAction() {
                return ((DeleteConversation) this.instance).getAction();
            }

            @Override // com.p1.mobile.longlink.msg.connector.LongLinkConversationMessage.DeleteConversationOrBuilder
            public ByteString getActionBytes() {
                return ((DeleteConversation) this.instance).getActionBytes();
            }

            @Override // com.p1.mobile.longlink.msg.connector.LongLinkConversationMessage.DeleteConversationOrBuilder
            public String getOtherUserId() {
                return ((DeleteConversation) this.instance).getOtherUserId();
            }

            @Override // com.p1.mobile.longlink.msg.connector.LongLinkConversationMessage.DeleteConversationOrBuilder
            public ByteString getOtherUserIdBytes() {
                return ((DeleteConversation) this.instance).getOtherUserIdBytes();
            }

            public Builder setAction(String str) {
                copyOnWrite();
                ((DeleteConversation) this.instance).setAction(str);
                return this;
            }

            public Builder setActionBytes(ByteString byteString) {
                copyOnWrite();
                ((DeleteConversation) this.instance).setActionBytes(byteString);
                return this;
            }

            public Builder setOtherUserId(String str) {
                copyOnWrite();
                ((DeleteConversation) this.instance).setOtherUserId(str);
                return this;
            }

            public Builder setOtherUserIdBytes(ByteString byteString) {
                copyOnWrite();
                ((DeleteConversation) this.instance).setOtherUserIdBytes(byteString);
                return this;
            }
        }

        static {
            DeleteConversation deleteConversation = new DeleteConversation();
            DEFAULT_INSTANCE = deleteConversation;
            deleteConversation.makeImmutable();
        }

        private DeleteConversation() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAction() {
            this.action_ = getDefaultInstance().getAction();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearOtherUserId() {
            this.otherUserId_ = getDefaultInstance().getOtherUserId();
        }

        public static DeleteConversation getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder(DeleteConversation deleteConversation) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(deleteConversation);
        }

        public static DeleteConversation parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (DeleteConversation) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static DeleteConversation parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (DeleteConversation) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static ng60<DeleteConversation> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAction(String str) {
            str.getClass();
            this.action_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setActionBytes(ByteString byteString) {
            byteString.getClass();
            AbstractC3426a.checkByteStringIsUtf8(byteString);
            this.action_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setOtherUserId(String str) {
            str.getClass();
            this.otherUserId_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setOtherUserIdBytes(ByteString byteString) {
            byteString.getClass();
            AbstractC3426a.checkByteStringIsUtf8(byteString);
            this.otherUserId_ = byteString.toStringUtf8();
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (C45471.f16648xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new DeleteConversation();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                    return null;
                case 4:
                    return new Builder();
                case 5:
                    GeneratedMessageLite.InterfaceC3409h interfaceC3409h = (GeneratedMessageLite.InterfaceC3409h) obj;
                    DeleteConversation deleteConversation = (DeleteConversation) obj2;
                    this.otherUserId_ = interfaceC3409h.mo17052f(!this.otherUserId_.isEmpty(), this.otherUserId_, !deleteConversation.otherUserId_.isEmpty(), deleteConversation.otherUserId_);
                    this.action_ = interfaceC3409h.mo17052f(!this.action_.isEmpty(), this.action_, true ^ deleteConversation.action_.isEmpty(), deleteConversation.action_);
                    GeneratedMessageLite.C3408g c3408g = GeneratedMessageLite.C3408g.INSTANCE;
                    return this;
                case 6:
                    C3430e c3430e = (C3430e) obj;
                    boolean z = false;
                    while (!z) {
                        try {
                            int iM17171M = c3430e.m17171M();
                            if (iM17171M != 0) {
                                if (iM17171M == 10) {
                                    this.otherUserId_ = c3430e.m17170L();
                                } else if (iM17171M == 18) {
                                    this.action_ = c3430e.m17170L();
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
                        synchronized (DeleteConversation.class) {
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

        @Override // com.p1.mobile.longlink.msg.connector.LongLinkConversationMessage.DeleteConversationOrBuilder
        public String getAction() {
            return this.action_;
        }

        @Override // com.p1.mobile.longlink.msg.connector.LongLinkConversationMessage.DeleteConversationOrBuilder
        public ByteString getActionBytes() {
            return ByteString.copyFromUtf8(this.action_);
        }

        @Override // com.p1.mobile.longlink.msg.connector.LongLinkConversationMessage.DeleteConversationOrBuilder
        public String getOtherUserId() {
            return this.otherUserId_;
        }

        @Override // com.p1.mobile.longlink.msg.connector.LongLinkConversationMessage.DeleteConversationOrBuilder
        public ByteString getOtherUserIdBytes() {
            return ByteString.copyFromUtf8(this.otherUserId_);
        }

        @Override // com.google.protobuf.InterfaceC3442q
        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int iM16956K = !this.otherUserId_.isEmpty() ? CodedOutputStream.m16956K(1, getOtherUserId()) : 0;
            if (!this.action_.isEmpty()) {
                iM16956K += CodedOutputStream.m16956K(2, getAction());
            }
            this.memoizedSerializedSize = iM16956K;
            return iM16956K;
        }

        @Override // com.google.protobuf.InterfaceC3442q
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (!this.otherUserId_.isEmpty()) {
                codedOutputStream.mo16994D0(1, getOtherUserId());
            }
            if (this.action_.isEmpty()) {
                return;
            }
            codedOutputStream.mo16994D0(2, getAction());
        }

        public static DeleteConversation parseDelimitedFrom(InputStream inputStream, C3433h c3433h) throws IOException {
            return (DeleteConversation) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, c3433h);
        }

        public static DeleteConversation parseFrom(ByteString byteString, C3433h c3433h) throws InvalidProtocolBufferException {
            return (DeleteConversation) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, c3433h);
        }

        public static DeleteConversation parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (DeleteConversation) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static DeleteConversation parseFrom(byte[] bArr, C3433h c3433h) throws InvalidProtocolBufferException {
            return (DeleteConversation) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, c3433h);
        }

        public static DeleteConversation parseFrom(InputStream inputStream) throws IOException {
            return (DeleteConversation) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static DeleteConversation parseFrom(InputStream inputStream, C3433h c3433h) throws IOException {
            return (DeleteConversation) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, c3433h);
        }

        public static DeleteConversation parseFrom(C3430e c3430e) throws IOException {
            return (DeleteConversation) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, c3430e);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static DeleteConversation parseFrom(C3430e c3430e, C3433h c3433h) throws IOException {
            return (DeleteConversation) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, c3430e, c3433h);
        }
    }
}
