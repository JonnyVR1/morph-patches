package com.p003p1.mobile.longlink.msg.liveroom;

import com.google.protobuf.ByteString;
import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.a;
import com.google.protobuf.e;
import com.google.protobuf.h;
import com.google.protobuf.q;
import java.io.IOException;
import java.io.InputStream;
import l.aag0;
import l.bz00;
import l.i860;
import l.o6z;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes8.dex */
public final class LiveChatAreaOperationMessage {

    /* JADX INFO: renamed from: com.p1.mobile.longlink.msg.liveroom.LiveChatAreaOperationMessage$1 */
    public static /* synthetic */ class C03821 {

        /* JADX INFO: renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f1665xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f1665xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f1665xa1df5c61[GeneratedMessageLite.MethodToInvoke.IS_INITIALIZED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f1665xa1df5c61[GeneratedMessageLite.MethodToInvoke.MAKE_IMMUTABLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f1665xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f1665xa1df5c61[GeneratedMessageLite.MethodToInvoke.VISIT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f1665xa1df5c61[GeneratedMessageLite.MethodToInvoke.MERGE_FROM_STREAM.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f1665xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f1665xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    public interface ChatAreaOperationSiteContainerOrBuilder extends o6z {
        /* synthetic */ q getDefaultInstanceForType();

        JumpLink getJumpLinkItem();

        boolean hasJumpLinkItem();

        /* synthetic */ boolean isInitialized();
    }

    public interface JumpLinkOrBuilder extends o6z {
        /* synthetic */ q getDefaultInstanceForType();

        boolean getEnableClose();

        boolean getIsClientDeal();

        String getSchema();

        ByteString getSchemaBytes();

        long getShowTime();

        String getUrl();

        ByteString getUrlBytes();

        float getWidthHighRatio();

        float getWidthScreenRatio();

        /* synthetic */ boolean isInitialized();
    }

    private LiveChatAreaOperationMessage() {
    }

    public static void registerAllExtensions(h hVar) {
    }

    public static final class ChatAreaOperationSiteContainer extends GeneratedMessageLite<ChatAreaOperationSiteContainer, Builder> implements ChatAreaOperationSiteContainerOrBuilder {
        private static final ChatAreaOperationSiteContainer DEFAULT_INSTANCE;
        public static final int JUMPLINKITEM_FIELD_NUMBER = 1;
        private static volatile i860<ChatAreaOperationSiteContainer> PARSER;
        private JumpLink jumpLinkItem_;

        static {
            ChatAreaOperationSiteContainer chatAreaOperationSiteContainer = new ChatAreaOperationSiteContainer();
            DEFAULT_INSTANCE = chatAreaOperationSiteContainer;
            chatAreaOperationSiteContainer.makeImmutable();
        }

        private ChatAreaOperationSiteContainer() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearJumpLinkItem() {
            this.jumpLinkItem_ = null;
        }

        public static ChatAreaOperationSiteContainer getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeJumpLinkItem(JumpLink jumpLink) {
            JumpLink jumpLink2 = this.jumpLinkItem_;
            if (jumpLink2 == null || jumpLink2 == JumpLink.getDefaultInstance()) {
                this.jumpLinkItem_ = jumpLink;
            } else {
                this.jumpLinkItem_ = (JumpLink) ((JumpLink.Builder) JumpLink.newBuilder(this.jumpLinkItem_).mergeFrom(jumpLink)).buildPartial();
            }
        }

        public static Builder newBuilder(ChatAreaOperationSiteContainer chatAreaOperationSiteContainer) {
            return (Builder) ((Builder) DEFAULT_INSTANCE.toBuilder()).mergeFrom(chatAreaOperationSiteContainer);
        }

        public static ChatAreaOperationSiteContainer parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (ChatAreaOperationSiteContainer) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static ChatAreaOperationSiteContainer parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (ChatAreaOperationSiteContainer) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static i860<ChatAreaOperationSiteContainer> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setJumpLinkItem(JumpLink.Builder builder) {
            this.jumpLinkItem_ = (JumpLink) builder.build();
        }

        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (C03821.f1665xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new ChatAreaOperationSiteContainer();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                    return null;
                case 4:
                    return new Builder();
                case 5:
                    this.jumpLinkItem_ = ((GeneratedMessageLite.h) obj).o(this.jumpLinkItem_, ((ChatAreaOperationSiteContainer) obj2).jumpLinkItem_);
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
                                    JumpLink jumpLink = this.jumpLinkItem_;
                                    JumpLink.Builder builder = jumpLink != null ? (JumpLink.Builder) jumpLink.toBuilder() : null;
                                    JumpLink jumpLinkW = eVar.w(JumpLink.parser(), hVar);
                                    this.jumpLinkItem_ = jumpLinkW;
                                    if (builder != null) {
                                        builder.mergeFrom(jumpLinkW);
                                        this.jumpLinkItem_ = (JumpLink) builder.buildPartial();
                                    }
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
                        synchronized (ChatAreaOperationSiteContainer.class) {
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

        @Override // com.p1.mobile.longlink.msg.liveroom.LiveChatAreaOperationMessage.ChatAreaOperationSiteContainerOrBuilder
        public JumpLink getJumpLinkItem() {
            JumpLink jumpLink = this.jumpLinkItem_;
            return jumpLink == null ? JumpLink.getDefaultInstance() : jumpLink;
        }

        public int getSerializedSize() {
            int i = ((GeneratedMessageLite) this).memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int iC = this.jumpLinkItem_ != null ? CodedOutputStream.C(1, getJumpLinkItem()) : 0;
            ((GeneratedMessageLite) this).memoizedSerializedSize = iC;
            return iC;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LiveChatAreaOperationMessage.ChatAreaOperationSiteContainerOrBuilder
        public boolean hasJumpLinkItem() {
            return this.jumpLinkItem_ != null;
        }

        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (this.jumpLinkItem_ != null) {
                codedOutputStream.w0(1, getJumpLinkItem());
            }
        }

        public static ChatAreaOperationSiteContainer parseDelimitedFrom(InputStream inputStream, h hVar) throws IOException {
            return (ChatAreaOperationSiteContainer) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, hVar);
        }

        public static ChatAreaOperationSiteContainer parseFrom(ByteString byteString, h hVar) throws InvalidProtocolBufferException {
            return (ChatAreaOperationSiteContainer) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, hVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setJumpLinkItem(JumpLink jumpLink) {
            jumpLink.getClass();
            this.jumpLinkItem_ = jumpLink;
        }

        public static final class Builder extends GeneratedMessageLite.b<ChatAreaOperationSiteContainer, Builder> implements ChatAreaOperationSiteContainerOrBuilder {
            private Builder() {
                super(ChatAreaOperationSiteContainer.DEFAULT_INSTANCE);
            }

            public Builder clearJumpLinkItem() {
                copyOnWrite();
                ((ChatAreaOperationSiteContainer) ((GeneratedMessageLite.b) this).instance).clearJumpLinkItem();
                return this;
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LiveChatAreaOperationMessage.ChatAreaOperationSiteContainerOrBuilder
            public JumpLink getJumpLinkItem() {
                return ((ChatAreaOperationSiteContainer) ((GeneratedMessageLite.b) this).instance).getJumpLinkItem();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LiveChatAreaOperationMessage.ChatAreaOperationSiteContainerOrBuilder
            public boolean hasJumpLinkItem() {
                return ((ChatAreaOperationSiteContainer) ((GeneratedMessageLite.b) this).instance).hasJumpLinkItem();
            }

            public Builder mergeJumpLinkItem(JumpLink jumpLink) {
                copyOnWrite();
                ((ChatAreaOperationSiteContainer) ((GeneratedMessageLite.b) this).instance).mergeJumpLinkItem(jumpLink);
                return this;
            }

            public Builder setJumpLinkItem(JumpLink jumpLink) {
                copyOnWrite();
                ((ChatAreaOperationSiteContainer) ((GeneratedMessageLite.b) this).instance).setJumpLinkItem(jumpLink);
                return this;
            }

            public Builder setJumpLinkItem(JumpLink.Builder builder) {
                copyOnWrite();
                ((ChatAreaOperationSiteContainer) ((GeneratedMessageLite.b) this).instance).setJumpLinkItem(builder);
                return this;
            }
        }

        public static ChatAreaOperationSiteContainer parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (ChatAreaOperationSiteContainer) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static ChatAreaOperationSiteContainer parseFrom(byte[] bArr, h hVar) throws InvalidProtocolBufferException {
            return (ChatAreaOperationSiteContainer) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, hVar);
        }

        public static ChatAreaOperationSiteContainer parseFrom(InputStream inputStream) throws IOException {
            return (ChatAreaOperationSiteContainer) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static ChatAreaOperationSiteContainer parseFrom(InputStream inputStream, h hVar) throws IOException {
            return (ChatAreaOperationSiteContainer) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, hVar);
        }

        public static ChatAreaOperationSiteContainer parseFrom(e eVar) throws IOException {
            return (ChatAreaOperationSiteContainer) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, eVar);
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.toBuilder();
        }

        public static ChatAreaOperationSiteContainer parseFrom(e eVar, h hVar) throws IOException {
            return (ChatAreaOperationSiteContainer) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, eVar, hVar);
        }
    }

    public static final class JumpLink extends GeneratedMessageLite<JumpLink, Builder> implements JumpLinkOrBuilder {
        private static final JumpLink DEFAULT_INSTANCE;
        public static final int ENABLECLOSE_FIELD_NUMBER = 5;
        public static final int ISCLIENTDEAL_FIELD_NUMBER = 7;
        private static volatile i860<JumpLink> PARSER = null;
        public static final int SCHEMA_FIELD_NUMBER = 6;
        public static final int SHOWTIME_FIELD_NUMBER = 2;
        public static final int URL_FIELD_NUMBER = 1;
        public static final int WIDTHHIGHRATIO_FIELD_NUMBER = 3;
        public static final int WIDTHSCREENRATIO_FIELD_NUMBER = 4;
        private boolean enableClose_;
        private boolean isClientDeal_;
        private long showTime_;
        private float widthHighRatio_;
        private float widthScreenRatio_;
        private String url_ = "";
        private String schema_ = "";

        public static final class Builder extends GeneratedMessageLite.b<JumpLink, Builder> implements JumpLinkOrBuilder {
            private Builder() {
                super(JumpLink.DEFAULT_INSTANCE);
            }

            public Builder clearEnableClose() {
                copyOnWrite();
                ((JumpLink) ((GeneratedMessageLite.b) this).instance).clearEnableClose();
                return this;
            }

            public Builder clearIsClientDeal() {
                copyOnWrite();
                ((JumpLink) ((GeneratedMessageLite.b) this).instance).clearIsClientDeal();
                return this;
            }

            public Builder clearSchema() {
                copyOnWrite();
                ((JumpLink) ((GeneratedMessageLite.b) this).instance).clearSchema();
                return this;
            }

            public Builder clearShowTime() {
                copyOnWrite();
                ((JumpLink) ((GeneratedMessageLite.b) this).instance).clearShowTime();
                return this;
            }

            public Builder clearUrl() {
                copyOnWrite();
                ((JumpLink) ((GeneratedMessageLite.b) this).instance).clearUrl();
                return this;
            }

            public Builder clearWidthHighRatio() {
                copyOnWrite();
                ((JumpLink) ((GeneratedMessageLite.b) this).instance).clearWidthHighRatio();
                return this;
            }

            public Builder clearWidthScreenRatio() {
                copyOnWrite();
                ((JumpLink) ((GeneratedMessageLite.b) this).instance).clearWidthScreenRatio();
                return this;
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LiveChatAreaOperationMessage.JumpLinkOrBuilder
            public boolean getEnableClose() {
                return ((JumpLink) ((GeneratedMessageLite.b) this).instance).getEnableClose();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LiveChatAreaOperationMessage.JumpLinkOrBuilder
            public boolean getIsClientDeal() {
                return ((JumpLink) ((GeneratedMessageLite.b) this).instance).getIsClientDeal();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LiveChatAreaOperationMessage.JumpLinkOrBuilder
            public String getSchema() {
                return ((JumpLink) ((GeneratedMessageLite.b) this).instance).getSchema();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LiveChatAreaOperationMessage.JumpLinkOrBuilder
            public ByteString getSchemaBytes() {
                return ((JumpLink) ((GeneratedMessageLite.b) this).instance).getSchemaBytes();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LiveChatAreaOperationMessage.JumpLinkOrBuilder
            public long getShowTime() {
                return ((JumpLink) ((GeneratedMessageLite.b) this).instance).getShowTime();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LiveChatAreaOperationMessage.JumpLinkOrBuilder
            public String getUrl() {
                return ((JumpLink) ((GeneratedMessageLite.b) this).instance).getUrl();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LiveChatAreaOperationMessage.JumpLinkOrBuilder
            public ByteString getUrlBytes() {
                return ((JumpLink) ((GeneratedMessageLite.b) this).instance).getUrlBytes();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LiveChatAreaOperationMessage.JumpLinkOrBuilder
            public float getWidthHighRatio() {
                return ((JumpLink) ((GeneratedMessageLite.b) this).instance).getWidthHighRatio();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LiveChatAreaOperationMessage.JumpLinkOrBuilder
            public float getWidthScreenRatio() {
                return ((JumpLink) ((GeneratedMessageLite.b) this).instance).getWidthScreenRatio();
            }

            public Builder setEnableClose(boolean z) {
                copyOnWrite();
                ((JumpLink) ((GeneratedMessageLite.b) this).instance).setEnableClose(z);
                return this;
            }

            public Builder setIsClientDeal(boolean z) {
                copyOnWrite();
                ((JumpLink) ((GeneratedMessageLite.b) this).instance).setIsClientDeal(z);
                return this;
            }

            public Builder setSchema(String str) {
                copyOnWrite();
                ((JumpLink) ((GeneratedMessageLite.b) this).instance).setSchema(str);
                return this;
            }

            public Builder setSchemaBytes(ByteString byteString) {
                copyOnWrite();
                ((JumpLink) ((GeneratedMessageLite.b) this).instance).setSchemaBytes(byteString);
                return this;
            }

            public Builder setShowTime(long j) {
                copyOnWrite();
                ((JumpLink) ((GeneratedMessageLite.b) this).instance).setShowTime(j);
                return this;
            }

            public Builder setUrl(String str) {
                copyOnWrite();
                ((JumpLink) ((GeneratedMessageLite.b) this).instance).setUrl(str);
                return this;
            }

            public Builder setUrlBytes(ByteString byteString) {
                copyOnWrite();
                ((JumpLink) ((GeneratedMessageLite.b) this).instance).setUrlBytes(byteString);
                return this;
            }

            public Builder setWidthHighRatio(float f) {
                copyOnWrite();
                ((JumpLink) ((GeneratedMessageLite.b) this).instance).setWidthHighRatio(f);
                return this;
            }

            public Builder setWidthScreenRatio(float f) {
                copyOnWrite();
                ((JumpLink) ((GeneratedMessageLite.b) this).instance).setWidthScreenRatio(f);
                return this;
            }
        }

        static {
            JumpLink jumpLink = new JumpLink();
            DEFAULT_INSTANCE = jumpLink;
            jumpLink.makeImmutable();
        }

        private JumpLink() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearEnableClose() {
            this.enableClose_ = false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearIsClientDeal() {
            this.isClientDeal_ = false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearSchema() {
            this.schema_ = getDefaultInstance().getSchema();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearShowTime() {
            this.showTime_ = 0L;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearUrl() {
            this.url_ = getDefaultInstance().getUrl();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearWidthHighRatio() {
            this.widthHighRatio_ = 0.0f;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearWidthScreenRatio() {
            this.widthScreenRatio_ = 0.0f;
        }

        public static JumpLink getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder(JumpLink jumpLink) {
            return (Builder) ((Builder) DEFAULT_INSTANCE.toBuilder()).mergeFrom(jumpLink);
        }

        public static JumpLink parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (JumpLink) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static JumpLink parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (JumpLink) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static i860<JumpLink> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setEnableClose(boolean z) {
            this.enableClose_ = z;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setIsClientDeal(boolean z) {
            this.isClientDeal_ = z;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSchema(String str) {
            str.getClass();
            this.schema_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSchemaBytes(ByteString byteString) {
            byteString.getClass();
            a.checkByteStringIsUtf8(byteString);
            this.schema_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setShowTime(long j) {
            this.showTime_ = j;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setUrl(String str) {
            str.getClass();
            this.url_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setUrlBytes(ByteString byteString) {
            byteString.getClass();
            a.checkByteStringIsUtf8(byteString);
            this.url_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setWidthHighRatio(float f) {
            this.widthHighRatio_ = f;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setWidthScreenRatio(float f) {
            this.widthScreenRatio_ = f;
        }

        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            boolean z = false;
            switch (C03821.f1665xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new JumpLink();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                    return null;
                case 4:
                    return new Builder();
                case 5:
                    GeneratedMessageLite.h hVar = (GeneratedMessageLite.h) obj;
                    JumpLink jumpLink = (JumpLink) obj2;
                    this.url_ = hVar.f(!this.url_.isEmpty(), this.url_, !jumpLink.url_.isEmpty(), jumpLink.url_);
                    long j = this.showTime_;
                    boolean z2 = j != 0;
                    long j2 = jumpLink.showTime_;
                    this.showTime_ = hVar.i(z2, j, j2 != 0, j2);
                    float f = this.widthHighRatio_;
                    boolean z3 = f != 0.0f;
                    float f2 = jumpLink.widthHighRatio_;
                    this.widthHighRatio_ = hVar.p(z3, f, f2 != 0.0f, f2);
                    float f3 = this.widthScreenRatio_;
                    boolean z4 = f3 != 0.0f;
                    float f4 = jumpLink.widthScreenRatio_;
                    this.widthScreenRatio_ = hVar.p(z4, f3, f4 != 0.0f, f4);
                    boolean z5 = this.enableClose_;
                    boolean z6 = jumpLink.enableClose_;
                    this.enableClose_ = hVar.d(z5, z5, z6, z6);
                    this.schema_ = hVar.f(!this.schema_.isEmpty(), this.schema_, !jumpLink.schema_.isEmpty(), jumpLink.schema_);
                    boolean z7 = this.isClientDeal_;
                    boolean z8 = jumpLink.isClientDeal_;
                    this.isClientDeal_ = hVar.d(z7, z7, z8, z8);
                    GeneratedMessageLite.g gVar = GeneratedMessageLite.g.INSTANCE;
                    return this;
                case 6:
                    e eVar = (e) obj;
                    while (!z) {
                        try {
                            int iM = eVar.M();
                            if (iM != 0) {
                                if (iM == 10) {
                                    this.url_ = eVar.L();
                                } else if (iM == 16) {
                                    this.showTime_ = eVar.v();
                                } else if (iM == 29) {
                                    this.widthHighRatio_ = eVar.s();
                                } else if (iM == 37) {
                                    this.widthScreenRatio_ = eVar.s();
                                } else if (iM == 40) {
                                    this.enableClose_ = eVar.m();
                                } else if (iM == 50) {
                                    this.schema_ = eVar.L();
                                } else if (iM == 56) {
                                    this.isClientDeal_ = eVar.m();
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
                        synchronized (JumpLink.class) {
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

        @Override // com.p1.mobile.longlink.msg.liveroom.LiveChatAreaOperationMessage.JumpLinkOrBuilder
        public boolean getEnableClose() {
            return this.enableClose_;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LiveChatAreaOperationMessage.JumpLinkOrBuilder
        public boolean getIsClientDeal() {
            return this.isClientDeal_;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LiveChatAreaOperationMessage.JumpLinkOrBuilder
        public String getSchema() {
            return this.schema_;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LiveChatAreaOperationMessage.JumpLinkOrBuilder
        public ByteString getSchemaBytes() {
            return ByteString.copyFromUtf8(this.schema_);
        }

        public int getSerializedSize() {
            int i = ((GeneratedMessageLite) this).memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int iK = !this.url_.isEmpty() ? CodedOutputStream.K(1, getUrl()) : 0;
            long j = this.showTime_;
            if (j != 0) {
                iK += CodedOutputStream.v(2, j);
            }
            float f = this.widthHighRatio_;
            if (f != 0.0f) {
                iK += CodedOutputStream.q(3, f);
            }
            float f2 = this.widthScreenRatio_;
            if (f2 != 0.0f) {
                iK += CodedOutputStream.q(4, f2);
            }
            boolean z = this.enableClose_;
            if (z) {
                iK += CodedOutputStream.f(5, z);
            }
            if (!this.schema_.isEmpty()) {
                iK += CodedOutputStream.K(6, getSchema());
            }
            boolean z2 = this.isClientDeal_;
            if (z2) {
                iK += CodedOutputStream.f(7, z2);
            }
            ((GeneratedMessageLite) this).memoizedSerializedSize = iK;
            return iK;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LiveChatAreaOperationMessage.JumpLinkOrBuilder
        public long getShowTime() {
            return this.showTime_;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LiveChatAreaOperationMessage.JumpLinkOrBuilder
        public String getUrl() {
            return this.url_;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LiveChatAreaOperationMessage.JumpLinkOrBuilder
        public ByteString getUrlBytes() {
            return ByteString.copyFromUtf8(this.url_);
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LiveChatAreaOperationMessage.JumpLinkOrBuilder
        public float getWidthHighRatio() {
            return this.widthHighRatio_;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LiveChatAreaOperationMessage.JumpLinkOrBuilder
        public float getWidthScreenRatio() {
            return this.widthScreenRatio_;
        }

        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (!this.url_.isEmpty()) {
                codedOutputStream.D0(1, getUrl());
            }
            long j = this.showTime_;
            if (j != 0) {
                codedOutputStream.u0(2, j);
            }
            float f = this.widthHighRatio_;
            if (f != 0.0f) {
                codedOutputStream.o0(3, f);
            }
            float f2 = this.widthScreenRatio_;
            if (f2 != 0.0f) {
                codedOutputStream.o0(4, f2);
            }
            boolean z = this.enableClose_;
            if (z) {
                codedOutputStream.a0(5, z);
            }
            if (!this.schema_.isEmpty()) {
                codedOutputStream.D0(6, getSchema());
            }
            boolean z2 = this.isClientDeal_;
            if (z2) {
                codedOutputStream.a0(7, z2);
            }
        }

        public static JumpLink parseDelimitedFrom(InputStream inputStream, h hVar) throws IOException {
            return (JumpLink) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, hVar);
        }

        public static JumpLink parseFrom(ByteString byteString, h hVar) throws InvalidProtocolBufferException {
            return (JumpLink) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, hVar);
        }

        public static JumpLink parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (JumpLink) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static JumpLink parseFrom(byte[] bArr, h hVar) throws InvalidProtocolBufferException {
            return (JumpLink) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, hVar);
        }

        public static JumpLink parseFrom(InputStream inputStream) throws IOException {
            return (JumpLink) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static JumpLink parseFrom(InputStream inputStream, h hVar) throws IOException {
            return (JumpLink) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, hVar);
        }

        public static JumpLink parseFrom(e eVar) throws IOException {
            return (JumpLink) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, eVar);
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.toBuilder();
        }

        public static JumpLink parseFrom(e eVar, h hVar) throws IOException {
            return (JumpLink) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, eVar, hVar);
        }
    }
}
