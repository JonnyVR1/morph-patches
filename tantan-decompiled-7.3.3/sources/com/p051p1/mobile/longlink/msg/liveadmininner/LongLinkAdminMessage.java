package com.p051p1.mobile.longlink.msg.liveadmininner;

import com.alibaba.fastjson.asm.Opcodes;
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
import p153l.iig0;
import p153l.l710;
import p153l.lfz;
import p153l.ng60;

/* JADX INFO: loaded from: classes8.dex */
public final class LongLinkAdminMessage {

    /* JADX INFO: renamed from: com.p1.mobile.longlink.msg.liveadmininner.LongLinkAdminMessage$1 */
    public static /* synthetic */ class C45851 {

        /* JADX INFO: renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f16672xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f16672xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f16672xa1df5c61[GeneratedMessageLite.MethodToInvoke.IS_INITIALIZED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f16672xa1df5c61[GeneratedMessageLite.MethodToInvoke.MAKE_IMMUTABLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f16672xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f16672xa1df5c61[GeneratedMessageLite.MethodToInvoke.VISIT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f16672xa1df5c61[GeneratedMessageLite.MethodToInvoke.MERGE_FROM_STREAM.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f16672xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f16672xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    public interface BgStyleOrBuilder extends lfz {
        String getAlpha();

        ByteString getAlphaBytes();

        @Override // p153l.lfz
        /* synthetic */ InterfaceC3442q getDefaultInstanceForType();

        String getEndColor();

        ByteString getEndColorBytes();

        String getStartColor();

        ByteString getStartColorBytes();

        @Override // p153l.lfz
        /* synthetic */ boolean isInitialized();
    }

    public interface ButtonJumpStyleOrBuilder extends lfz {
        BgStyle getBgcolor();

        String getContent();

        ByteString getContentBytes();

        @Override // p153l.lfz
        /* synthetic */ InterfaceC3442q getDefaultInstanceForType();

        String getIcon();

        ByteString getIconBytes();

        String getTextColor();

        ByteString getTextColorBytes();

        String getUrl();

        ByteString getUrlBytes();

        boolean hasBgcolor();

        @Override // p153l.lfz
        /* synthetic */ boolean isInitialized();
    }

    public interface IconStyleOrBuilder extends lfz {
        @Override // p153l.lfz
        /* synthetic */ InterfaceC3442q getDefaultInstanceForType();

        IconType getType();

        int getTypeValue();

        String getUrl();

        ByteString getUrlBytes();

        @Override // p153l.lfz
        /* synthetic */ boolean isInitialized();
    }

    public interface JumpStyleOrBuilder extends lfz {
        ButtonJumpStyle getButton();

        @Override // p153l.lfz
        /* synthetic */ InterfaceC3442q getDefaultInstanceForType();

        String getSchema();

        ByteString getSchemaBytes();

        JumpType getType();

        int getTypeValue();

        boolean hasButton();

        @Override // p153l.lfz
        /* synthetic */ boolean isInitialized();
    }

    public interface UserWithBgColorSocketNotificationOrBuilder extends lfz {
        BgStyle getBgStyle();

        String getContent();

        ByteString getContentBytes();

        @Override // p153l.lfz
        /* synthetic */ InterfaceC3442q getDefaultInstanceForType();

        IconStyle getIcon();

        boolean getIsCountdown();

        boolean getIsFixed();

        JumpStyle getJump();

        boolean getMoveUp();

        String getRoomId();

        ByteString getRoomIdBytes();

        long getRotationInterval();

        long getShowSeconds();

        long getShowTimes();

        String getType();

        ByteString getTypeBytes();

        boolean hasBgStyle();

        boolean hasIcon();

        boolean hasJump();

        @Override // p153l.lfz
        /* synthetic */ boolean isInitialized();
    }

    private LongLinkAdminMessage() {
    }

    public static void registerAllExtensions(C3433h c3433h) {
    }

    public static final class BgStyle extends GeneratedMessageLite<BgStyle, Builder> implements BgStyleOrBuilder {
        public static final int ALPHA_FIELD_NUMBER = 3;
        private static final BgStyle DEFAULT_INSTANCE;
        public static final int ENDCOLOR_FIELD_NUMBER = 2;
        private static volatile ng60<BgStyle> PARSER = null;
        public static final int STARTCOLOR_FIELD_NUMBER = 1;
        private String startColor_ = "";
        private String endColor_ = "";
        private String alpha_ = "";

        public static final class Builder extends GeneratedMessageLite.AbstractC3403b<BgStyle, Builder> implements BgStyleOrBuilder {
            private Builder() {
                super(BgStyle.DEFAULT_INSTANCE);
            }

            public Builder clearAlpha() {
                copyOnWrite();
                ((BgStyle) this.instance).clearAlpha();
                return this;
            }

            public Builder clearEndColor() {
                copyOnWrite();
                ((BgStyle) this.instance).clearEndColor();
                return this;
            }

            public Builder clearStartColor() {
                copyOnWrite();
                ((BgStyle) this.instance).clearStartColor();
                return this;
            }

            @Override // com.p1.mobile.longlink.msg.liveadmininner.LongLinkAdminMessage.BgStyleOrBuilder
            public String getAlpha() {
                return ((BgStyle) this.instance).getAlpha();
            }

            @Override // com.p1.mobile.longlink.msg.liveadmininner.LongLinkAdminMessage.BgStyleOrBuilder
            public ByteString getAlphaBytes() {
                return ((BgStyle) this.instance).getAlphaBytes();
            }

            @Override // com.p1.mobile.longlink.msg.liveadmininner.LongLinkAdminMessage.BgStyleOrBuilder
            public String getEndColor() {
                return ((BgStyle) this.instance).getEndColor();
            }

            @Override // com.p1.mobile.longlink.msg.liveadmininner.LongLinkAdminMessage.BgStyleOrBuilder
            public ByteString getEndColorBytes() {
                return ((BgStyle) this.instance).getEndColorBytes();
            }

            @Override // com.p1.mobile.longlink.msg.liveadmininner.LongLinkAdminMessage.BgStyleOrBuilder
            public String getStartColor() {
                return ((BgStyle) this.instance).getStartColor();
            }

            @Override // com.p1.mobile.longlink.msg.liveadmininner.LongLinkAdminMessage.BgStyleOrBuilder
            public ByteString getStartColorBytes() {
                return ((BgStyle) this.instance).getStartColorBytes();
            }

            public Builder setAlpha(String str) {
                copyOnWrite();
                ((BgStyle) this.instance).setAlpha(str);
                return this;
            }

            public Builder setAlphaBytes(ByteString byteString) {
                copyOnWrite();
                ((BgStyle) this.instance).setAlphaBytes(byteString);
                return this;
            }

            public Builder setEndColor(String str) {
                copyOnWrite();
                ((BgStyle) this.instance).setEndColor(str);
                return this;
            }

            public Builder setEndColorBytes(ByteString byteString) {
                copyOnWrite();
                ((BgStyle) this.instance).setEndColorBytes(byteString);
                return this;
            }

            public Builder setStartColor(String str) {
                copyOnWrite();
                ((BgStyle) this.instance).setStartColor(str);
                return this;
            }

            public Builder setStartColorBytes(ByteString byteString) {
                copyOnWrite();
                ((BgStyle) this.instance).setStartColorBytes(byteString);
                return this;
            }
        }

        static {
            BgStyle bgStyle = new BgStyle();
            DEFAULT_INSTANCE = bgStyle;
            bgStyle.makeImmutable();
        }

        private BgStyle() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAlpha() {
            this.alpha_ = getDefaultInstance().getAlpha();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearEndColor() {
            this.endColor_ = getDefaultInstance().getEndColor();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearStartColor() {
            this.startColor_ = getDefaultInstance().getStartColor();
        }

        public static BgStyle getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder(BgStyle bgStyle) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(bgStyle);
        }

        public static BgStyle parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (BgStyle) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static BgStyle parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (BgStyle) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static ng60<BgStyle> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAlpha(String str) {
            str.getClass();
            this.alpha_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAlphaBytes(ByteString byteString) {
            byteString.getClass();
            AbstractC3426a.checkByteStringIsUtf8(byteString);
            this.alpha_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setEndColor(String str) {
            str.getClass();
            this.endColor_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setEndColorBytes(ByteString byteString) {
            byteString.getClass();
            AbstractC3426a.checkByteStringIsUtf8(byteString);
            this.endColor_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setStartColor(String str) {
            str.getClass();
            this.startColor_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setStartColorBytes(ByteString byteString) {
            byteString.getClass();
            AbstractC3426a.checkByteStringIsUtf8(byteString);
            this.startColor_ = byteString.toStringUtf8();
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (C45851.f16672xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new BgStyle();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                    return null;
                case 4:
                    return new Builder();
                case 5:
                    GeneratedMessageLite.InterfaceC3409h interfaceC3409h = (GeneratedMessageLite.InterfaceC3409h) obj;
                    BgStyle bgStyle = (BgStyle) obj2;
                    this.startColor_ = interfaceC3409h.mo17052f(!this.startColor_.isEmpty(), this.startColor_, !bgStyle.startColor_.isEmpty(), bgStyle.startColor_);
                    this.endColor_ = interfaceC3409h.mo17052f(!this.endColor_.isEmpty(), this.endColor_, !bgStyle.endColor_.isEmpty(), bgStyle.endColor_);
                    this.alpha_ = interfaceC3409h.mo17052f(!this.alpha_.isEmpty(), this.alpha_, true ^ bgStyle.alpha_.isEmpty(), bgStyle.alpha_);
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
                                    this.startColor_ = c3430e.m17170L();
                                } else if (iM17171M == 18) {
                                    this.endColor_ = c3430e.m17170L();
                                } else if (iM17171M == 26) {
                                    this.alpha_ = c3430e.m17170L();
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
                        synchronized (BgStyle.class) {
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

        @Override // com.p1.mobile.longlink.msg.liveadmininner.LongLinkAdminMessage.BgStyleOrBuilder
        public String getAlpha() {
            return this.alpha_;
        }

        @Override // com.p1.mobile.longlink.msg.liveadmininner.LongLinkAdminMessage.BgStyleOrBuilder
        public ByteString getAlphaBytes() {
            return ByteString.copyFromUtf8(this.alpha_);
        }

        @Override // com.p1.mobile.longlink.msg.liveadmininner.LongLinkAdminMessage.BgStyleOrBuilder
        public String getEndColor() {
            return this.endColor_;
        }

        @Override // com.p1.mobile.longlink.msg.liveadmininner.LongLinkAdminMessage.BgStyleOrBuilder
        public ByteString getEndColorBytes() {
            return ByteString.copyFromUtf8(this.endColor_);
        }

        @Override // com.google.protobuf.InterfaceC3442q
        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int iM16956K = !this.startColor_.isEmpty() ? CodedOutputStream.m16956K(1, getStartColor()) : 0;
            if (!this.endColor_.isEmpty()) {
                iM16956K += CodedOutputStream.m16956K(2, getEndColor());
            }
            if (!this.alpha_.isEmpty()) {
                iM16956K += CodedOutputStream.m16956K(3, getAlpha());
            }
            this.memoizedSerializedSize = iM16956K;
            return iM16956K;
        }

        @Override // com.p1.mobile.longlink.msg.liveadmininner.LongLinkAdminMessage.BgStyleOrBuilder
        public String getStartColor() {
            return this.startColor_;
        }

        @Override // com.p1.mobile.longlink.msg.liveadmininner.LongLinkAdminMessage.BgStyleOrBuilder
        public ByteString getStartColorBytes() {
            return ByteString.copyFromUtf8(this.startColor_);
        }

        @Override // com.google.protobuf.InterfaceC3442q
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (!this.startColor_.isEmpty()) {
                codedOutputStream.mo16994D0(1, getStartColor());
            }
            if (!this.endColor_.isEmpty()) {
                codedOutputStream.mo16994D0(2, getEndColor());
            }
            if (this.alpha_.isEmpty()) {
                return;
            }
            codedOutputStream.mo16994D0(3, getAlpha());
        }

        public static BgStyle parseDelimitedFrom(InputStream inputStream, C3433h c3433h) throws IOException {
            return (BgStyle) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, c3433h);
        }

        public static BgStyle parseFrom(ByteString byteString, C3433h c3433h) throws InvalidProtocolBufferException {
            return (BgStyle) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, c3433h);
        }

        public static BgStyle parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (BgStyle) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static BgStyle parseFrom(byte[] bArr, C3433h c3433h) throws InvalidProtocolBufferException {
            return (BgStyle) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, c3433h);
        }

        public static BgStyle parseFrom(InputStream inputStream) throws IOException {
            return (BgStyle) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static BgStyle parseFrom(InputStream inputStream, C3433h c3433h) throws IOException {
            return (BgStyle) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, c3433h);
        }

        public static BgStyle parseFrom(C3430e c3430e) throws IOException {
            return (BgStyle) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, c3430e);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static BgStyle parseFrom(C3430e c3430e, C3433h c3433h) throws IOException {
            return (BgStyle) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, c3430e, c3433h);
        }
    }

    public static final class ButtonJumpStyle extends GeneratedMessageLite<ButtonJumpStyle, Builder> implements ButtonJumpStyleOrBuilder {
        public static final int BGCOLOR_FIELD_NUMBER = 1;
        public static final int CONTENT_FIELD_NUMBER = 3;
        private static final ButtonJumpStyle DEFAULT_INSTANCE;
        public static final int ICON_FIELD_NUMBER = 4;
        private static volatile ng60<ButtonJumpStyle> PARSER = null;
        public static final int TEXTCOLOR_FIELD_NUMBER = 2;
        public static final int URL_FIELD_NUMBER = 5;
        private BgStyle bgcolor_;
        private String textColor_ = "";
        private String content_ = "";
        private String icon_ = "";
        private String url_ = "";

        static {
            ButtonJumpStyle buttonJumpStyle = new ButtonJumpStyle();
            DEFAULT_INSTANCE = buttonJumpStyle;
            buttonJumpStyle.makeImmutable();
        }

        private ButtonJumpStyle() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearBgcolor() {
            this.bgcolor_ = null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearContent() {
            this.content_ = getDefaultInstance().getContent();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearIcon() {
            this.icon_ = getDefaultInstance().getIcon();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearTextColor() {
            this.textColor_ = getDefaultInstance().getTextColor();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearUrl() {
            this.url_ = getDefaultInstance().getUrl();
        }

        public static ButtonJumpStyle getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeBgcolor(BgStyle bgStyle) {
            BgStyle bgStyle2 = this.bgcolor_;
            if (bgStyle2 == null || bgStyle2 == BgStyle.getDefaultInstance()) {
                this.bgcolor_ = bgStyle;
            } else {
                this.bgcolor_ = BgStyle.newBuilder(this.bgcolor_).mergeFrom(bgStyle).buildPartial();
            }
        }

        public static Builder newBuilder(ButtonJumpStyle buttonJumpStyle) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(buttonJumpStyle);
        }

        public static ButtonJumpStyle parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (ButtonJumpStyle) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static ButtonJumpStyle parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (ButtonJumpStyle) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static ng60<ButtonJumpStyle> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setBgcolor(BgStyle.Builder builder) {
            this.bgcolor_ = builder.build();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setContent(String str) {
            str.getClass();
            this.content_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setContentBytes(ByteString byteString) {
            byteString.getClass();
            AbstractC3426a.checkByteStringIsUtf8(byteString);
            this.content_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setIcon(String str) {
            str.getClass();
            this.icon_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setIconBytes(ByteString byteString) {
            byteString.getClass();
            AbstractC3426a.checkByteStringIsUtf8(byteString);
            this.icon_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTextColor(String str) {
            str.getClass();
            this.textColor_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTextColorBytes(ByteString byteString) {
            byteString.getClass();
            AbstractC3426a.checkByteStringIsUtf8(byteString);
            this.textColor_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setUrl(String str) {
            str.getClass();
            this.url_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setUrlBytes(ByteString byteString) {
            byteString.getClass();
            AbstractC3426a.checkByteStringIsUtf8(byteString);
            this.url_ = byteString.toStringUtf8();
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (C45851.f16672xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new ButtonJumpStyle();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                    return null;
                case 4:
                    return new Builder();
                case 5:
                    GeneratedMessageLite.InterfaceC3409h interfaceC3409h = (GeneratedMessageLite.InterfaceC3409h) obj;
                    ButtonJumpStyle buttonJumpStyle = (ButtonJumpStyle) obj2;
                    this.bgcolor_ = (BgStyle) interfaceC3409h.mo17061o(this.bgcolor_, buttonJumpStyle.bgcolor_);
                    this.textColor_ = interfaceC3409h.mo17052f(!this.textColor_.isEmpty(), this.textColor_, !buttonJumpStyle.textColor_.isEmpty(), buttonJumpStyle.textColor_);
                    this.content_ = interfaceC3409h.mo17052f(!this.content_.isEmpty(), this.content_, !buttonJumpStyle.content_.isEmpty(), buttonJumpStyle.content_);
                    this.icon_ = interfaceC3409h.mo17052f(!this.icon_.isEmpty(), this.icon_, !buttonJumpStyle.icon_.isEmpty(), buttonJumpStyle.icon_);
                    this.url_ = interfaceC3409h.mo17052f(!this.url_.isEmpty(), this.url_, true ^ buttonJumpStyle.url_.isEmpty(), buttonJumpStyle.url_);
                    GeneratedMessageLite.C3408g c3408g = GeneratedMessageLite.C3408g.INSTANCE;
                    return this;
                case 6:
                    C3430e c3430e = (C3430e) obj;
                    C3433h c3433h = (C3433h) obj2;
                    boolean z = false;
                    while (!z) {
                        try {
                            int iM17171M = c3430e.m17171M();
                            if (iM17171M != 0) {
                                if (iM17171M == 10) {
                                    BgStyle bgStyle = this.bgcolor_;
                                    BgStyle.Builder builder = bgStyle != null ? bgStyle.toBuilder() : null;
                                    BgStyle bgStyle2 = (BgStyle) c3430e.m17198w(BgStyle.parser(), c3433h);
                                    this.bgcolor_ = bgStyle2;
                                    if (builder != null) {
                                        builder.mergeFrom(bgStyle2);
                                        this.bgcolor_ = builder.buildPartial();
                                    }
                                } else if (iM17171M == 18) {
                                    this.textColor_ = c3430e.m17170L();
                                } else if (iM17171M == 26) {
                                    this.content_ = c3430e.m17170L();
                                } else if (iM17171M == 34) {
                                    this.icon_ = c3430e.m17170L();
                                } else if (iM17171M == 42) {
                                    this.url_ = c3430e.m17170L();
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
                        synchronized (ButtonJumpStyle.class) {
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

        @Override // com.p1.mobile.longlink.msg.liveadmininner.LongLinkAdminMessage.ButtonJumpStyleOrBuilder
        public BgStyle getBgcolor() {
            BgStyle bgStyle = this.bgcolor_;
            return bgStyle == null ? BgStyle.getDefaultInstance() : bgStyle;
        }

        @Override // com.p1.mobile.longlink.msg.liveadmininner.LongLinkAdminMessage.ButtonJumpStyleOrBuilder
        public String getContent() {
            return this.content_;
        }

        @Override // com.p1.mobile.longlink.msg.liveadmininner.LongLinkAdminMessage.ButtonJumpStyleOrBuilder
        public ByteString getContentBytes() {
            return ByteString.copyFromUtf8(this.content_);
        }

        @Override // com.p1.mobile.longlink.msg.liveadmininner.LongLinkAdminMessage.ButtonJumpStyleOrBuilder
        public String getIcon() {
            return this.icon_;
        }

        @Override // com.p1.mobile.longlink.msg.liveadmininner.LongLinkAdminMessage.ButtonJumpStyleOrBuilder
        public ByteString getIconBytes() {
            return ByteString.copyFromUtf8(this.icon_);
        }

        @Override // com.google.protobuf.InterfaceC3442q
        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int iM16948C = this.bgcolor_ != null ? CodedOutputStream.m16948C(1, getBgcolor()) : 0;
            if (!this.textColor_.isEmpty()) {
                iM16948C += CodedOutputStream.m16956K(2, getTextColor());
            }
            if (!this.content_.isEmpty()) {
                iM16948C += CodedOutputStream.m16956K(3, getContent());
            }
            if (!this.icon_.isEmpty()) {
                iM16948C += CodedOutputStream.m16956K(4, getIcon());
            }
            if (!this.url_.isEmpty()) {
                iM16948C += CodedOutputStream.m16956K(5, getUrl());
            }
            this.memoizedSerializedSize = iM16948C;
            return iM16948C;
        }

        @Override // com.p1.mobile.longlink.msg.liveadmininner.LongLinkAdminMessage.ButtonJumpStyleOrBuilder
        public String getTextColor() {
            return this.textColor_;
        }

        @Override // com.p1.mobile.longlink.msg.liveadmininner.LongLinkAdminMessage.ButtonJumpStyleOrBuilder
        public ByteString getTextColorBytes() {
            return ByteString.copyFromUtf8(this.textColor_);
        }

        @Override // com.p1.mobile.longlink.msg.liveadmininner.LongLinkAdminMessage.ButtonJumpStyleOrBuilder
        public String getUrl() {
            return this.url_;
        }

        @Override // com.p1.mobile.longlink.msg.liveadmininner.LongLinkAdminMessage.ButtonJumpStyleOrBuilder
        public ByteString getUrlBytes() {
            return ByteString.copyFromUtf8(this.url_);
        }

        @Override // com.p1.mobile.longlink.msg.liveadmininner.LongLinkAdminMessage.ButtonJumpStyleOrBuilder
        public boolean hasBgcolor() {
            return this.bgcolor_ != null;
        }

        @Override // com.google.protobuf.InterfaceC3442q
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (this.bgcolor_ != null) {
                codedOutputStream.mo17029w0(1, getBgcolor());
            }
            if (!this.textColor_.isEmpty()) {
                codedOutputStream.mo16994D0(2, getTextColor());
            }
            if (!this.content_.isEmpty()) {
                codedOutputStream.mo16994D0(3, getContent());
            }
            if (!this.icon_.isEmpty()) {
                codedOutputStream.mo16994D0(4, getIcon());
            }
            if (this.url_.isEmpty()) {
                return;
            }
            codedOutputStream.mo16994D0(5, getUrl());
        }

        public static ButtonJumpStyle parseDelimitedFrom(InputStream inputStream, C3433h c3433h) throws IOException {
            return (ButtonJumpStyle) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, c3433h);
        }

        public static ButtonJumpStyle parseFrom(ByteString byteString, C3433h c3433h) throws InvalidProtocolBufferException {
            return (ButtonJumpStyle) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, c3433h);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setBgcolor(BgStyle bgStyle) {
            bgStyle.getClass();
            this.bgcolor_ = bgStyle;
        }

        public static final class Builder extends GeneratedMessageLite.AbstractC3403b<ButtonJumpStyle, Builder> implements ButtonJumpStyleOrBuilder {
            private Builder() {
                super(ButtonJumpStyle.DEFAULT_INSTANCE);
            }

            public Builder clearBgcolor() {
                copyOnWrite();
                ((ButtonJumpStyle) this.instance).clearBgcolor();
                return this;
            }

            public Builder clearContent() {
                copyOnWrite();
                ((ButtonJumpStyle) this.instance).clearContent();
                return this;
            }

            public Builder clearIcon() {
                copyOnWrite();
                ((ButtonJumpStyle) this.instance).clearIcon();
                return this;
            }

            public Builder clearTextColor() {
                copyOnWrite();
                ((ButtonJumpStyle) this.instance).clearTextColor();
                return this;
            }

            public Builder clearUrl() {
                copyOnWrite();
                ((ButtonJumpStyle) this.instance).clearUrl();
                return this;
            }

            @Override // com.p1.mobile.longlink.msg.liveadmininner.LongLinkAdminMessage.ButtonJumpStyleOrBuilder
            public BgStyle getBgcolor() {
                return ((ButtonJumpStyle) this.instance).getBgcolor();
            }

            @Override // com.p1.mobile.longlink.msg.liveadmininner.LongLinkAdminMessage.ButtonJumpStyleOrBuilder
            public String getContent() {
                return ((ButtonJumpStyle) this.instance).getContent();
            }

            @Override // com.p1.mobile.longlink.msg.liveadmininner.LongLinkAdminMessage.ButtonJumpStyleOrBuilder
            public ByteString getContentBytes() {
                return ((ButtonJumpStyle) this.instance).getContentBytes();
            }

            @Override // com.p1.mobile.longlink.msg.liveadmininner.LongLinkAdminMessage.ButtonJumpStyleOrBuilder
            public String getIcon() {
                return ((ButtonJumpStyle) this.instance).getIcon();
            }

            @Override // com.p1.mobile.longlink.msg.liveadmininner.LongLinkAdminMessage.ButtonJumpStyleOrBuilder
            public ByteString getIconBytes() {
                return ((ButtonJumpStyle) this.instance).getIconBytes();
            }

            @Override // com.p1.mobile.longlink.msg.liveadmininner.LongLinkAdminMessage.ButtonJumpStyleOrBuilder
            public String getTextColor() {
                return ((ButtonJumpStyle) this.instance).getTextColor();
            }

            @Override // com.p1.mobile.longlink.msg.liveadmininner.LongLinkAdminMessage.ButtonJumpStyleOrBuilder
            public ByteString getTextColorBytes() {
                return ((ButtonJumpStyle) this.instance).getTextColorBytes();
            }

            @Override // com.p1.mobile.longlink.msg.liveadmininner.LongLinkAdminMessage.ButtonJumpStyleOrBuilder
            public String getUrl() {
                return ((ButtonJumpStyle) this.instance).getUrl();
            }

            @Override // com.p1.mobile.longlink.msg.liveadmininner.LongLinkAdminMessage.ButtonJumpStyleOrBuilder
            public ByteString getUrlBytes() {
                return ((ButtonJumpStyle) this.instance).getUrlBytes();
            }

            @Override // com.p1.mobile.longlink.msg.liveadmininner.LongLinkAdminMessage.ButtonJumpStyleOrBuilder
            public boolean hasBgcolor() {
                return ((ButtonJumpStyle) this.instance).hasBgcolor();
            }

            public Builder mergeBgcolor(BgStyle bgStyle) {
                copyOnWrite();
                ((ButtonJumpStyle) this.instance).mergeBgcolor(bgStyle);
                return this;
            }

            public Builder setBgcolor(BgStyle bgStyle) {
                copyOnWrite();
                ((ButtonJumpStyle) this.instance).setBgcolor(bgStyle);
                return this;
            }

            public Builder setContent(String str) {
                copyOnWrite();
                ((ButtonJumpStyle) this.instance).setContent(str);
                return this;
            }

            public Builder setContentBytes(ByteString byteString) {
                copyOnWrite();
                ((ButtonJumpStyle) this.instance).setContentBytes(byteString);
                return this;
            }

            public Builder setIcon(String str) {
                copyOnWrite();
                ((ButtonJumpStyle) this.instance).setIcon(str);
                return this;
            }

            public Builder setIconBytes(ByteString byteString) {
                copyOnWrite();
                ((ButtonJumpStyle) this.instance).setIconBytes(byteString);
                return this;
            }

            public Builder setTextColor(String str) {
                copyOnWrite();
                ((ButtonJumpStyle) this.instance).setTextColor(str);
                return this;
            }

            public Builder setTextColorBytes(ByteString byteString) {
                copyOnWrite();
                ((ButtonJumpStyle) this.instance).setTextColorBytes(byteString);
                return this;
            }

            public Builder setUrl(String str) {
                copyOnWrite();
                ((ButtonJumpStyle) this.instance).setUrl(str);
                return this;
            }

            public Builder setUrlBytes(ByteString byteString) {
                copyOnWrite();
                ((ButtonJumpStyle) this.instance).setUrlBytes(byteString);
                return this;
            }

            public Builder setBgcolor(BgStyle.Builder builder) {
                copyOnWrite();
                ((ButtonJumpStyle) this.instance).setBgcolor(builder);
                return this;
            }
        }

        public static ButtonJumpStyle parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (ButtonJumpStyle) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static ButtonJumpStyle parseFrom(byte[] bArr, C3433h c3433h) throws InvalidProtocolBufferException {
            return (ButtonJumpStyle) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, c3433h);
        }

        public static ButtonJumpStyle parseFrom(InputStream inputStream) throws IOException {
            return (ButtonJumpStyle) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static ButtonJumpStyle parseFrom(InputStream inputStream, C3433h c3433h) throws IOException {
            return (ButtonJumpStyle) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, c3433h);
        }

        public static ButtonJumpStyle parseFrom(C3430e c3430e) throws IOException {
            return (ButtonJumpStyle) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, c3430e);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static ButtonJumpStyle parseFrom(C3430e c3430e, C3433h c3433h) throws IOException {
            return (ButtonJumpStyle) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, c3430e, c3433h);
        }
    }

    public static final class IconStyle extends GeneratedMessageLite<IconStyle, Builder> implements IconStyleOrBuilder {
        private static final IconStyle DEFAULT_INSTANCE;
        private static volatile ng60<IconStyle> PARSER = null;
        public static final int TYPE_FIELD_NUMBER = 1;
        public static final int URL_FIELD_NUMBER = 2;
        private int type_;
        private String url_ = "";

        public static final class Builder extends GeneratedMessageLite.AbstractC3403b<IconStyle, Builder> implements IconStyleOrBuilder {
            private Builder() {
                super(IconStyle.DEFAULT_INSTANCE);
            }

            public Builder clearType() {
                copyOnWrite();
                ((IconStyle) this.instance).clearType();
                return this;
            }

            public Builder clearUrl() {
                copyOnWrite();
                ((IconStyle) this.instance).clearUrl();
                return this;
            }

            @Override // com.p1.mobile.longlink.msg.liveadmininner.LongLinkAdminMessage.IconStyleOrBuilder
            public IconType getType() {
                return ((IconStyle) this.instance).getType();
            }

            @Override // com.p1.mobile.longlink.msg.liveadmininner.LongLinkAdminMessage.IconStyleOrBuilder
            public int getTypeValue() {
                return ((IconStyle) this.instance).getTypeValue();
            }

            @Override // com.p1.mobile.longlink.msg.liveadmininner.LongLinkAdminMessage.IconStyleOrBuilder
            public String getUrl() {
                return ((IconStyle) this.instance).getUrl();
            }

            @Override // com.p1.mobile.longlink.msg.liveadmininner.LongLinkAdminMessage.IconStyleOrBuilder
            public ByteString getUrlBytes() {
                return ((IconStyle) this.instance).getUrlBytes();
            }

            public Builder setType(IconType iconType) {
                copyOnWrite();
                ((IconStyle) this.instance).setType(iconType);
                return this;
            }

            public Builder setTypeValue(int i) {
                copyOnWrite();
                ((IconStyle) this.instance).setTypeValue(i);
                return this;
            }

            public Builder setUrl(String str) {
                copyOnWrite();
                ((IconStyle) this.instance).setUrl(str);
                return this;
            }

            public Builder setUrlBytes(ByteString byteString) {
                copyOnWrite();
                ((IconStyle) this.instance).setUrlBytes(byteString);
                return this;
            }
        }

        static {
            IconStyle iconStyle = new IconStyle();
            DEFAULT_INSTANCE = iconStyle;
            iconStyle.makeImmutable();
        }

        private IconStyle() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearType() {
            this.type_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearUrl() {
            this.url_ = getDefaultInstance().getUrl();
        }

        public static IconStyle getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder(IconStyle iconStyle) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(iconStyle);
        }

        public static IconStyle parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (IconStyle) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static IconStyle parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (IconStyle) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static ng60<IconStyle> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setType(IconType iconType) {
            iconType.getClass();
            this.type_ = iconType.getNumber();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTypeValue(int i) {
            this.type_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setUrl(String str) {
            str.getClass();
            this.url_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setUrlBytes(ByteString byteString) {
            byteString.getClass();
            AbstractC3426a.checkByteStringIsUtf8(byteString);
            this.url_ = byteString.toStringUtf8();
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            boolean z = false;
            switch (C45851.f16672xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new IconStyle();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                    return null;
                case 4:
                    return new Builder();
                case 5:
                    GeneratedMessageLite.InterfaceC3409h interfaceC3409h = (GeneratedMessageLite.InterfaceC3409h) obj;
                    IconStyle iconStyle = (IconStyle) obj2;
                    int i = this.type_;
                    boolean z2 = i != 0;
                    int i2 = iconStyle.type_;
                    this.type_ = interfaceC3409h.mo17051e(z2, i, i2 != 0, i2);
                    this.url_ = interfaceC3409h.mo17052f(!this.url_.isEmpty(), this.url_, !iconStyle.url_.isEmpty(), iconStyle.url_);
                    GeneratedMessageLite.C3408g c3408g = GeneratedMessageLite.C3408g.INSTANCE;
                    return this;
                case 6:
                    C3430e c3430e = (C3430e) obj;
                    while (!z) {
                        try {
                            int iM17171M = c3430e.m17171M();
                            if (iM17171M != 0) {
                                if (iM17171M == 8) {
                                    this.type_ = c3430e.m17191p();
                                } else if (iM17171M == 18) {
                                    this.url_ = c3430e.m17170L();
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
                        synchronized (IconStyle.class) {
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

        @Override // com.google.protobuf.InterfaceC3442q
        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int iM16977m = this.type_ != IconType.iconUrl.getNumber() ? CodedOutputStream.m16977m(1, this.type_) : 0;
            if (!this.url_.isEmpty()) {
                iM16977m += CodedOutputStream.m16956K(2, getUrl());
            }
            this.memoizedSerializedSize = iM16977m;
            return iM16977m;
        }

        @Override // com.p1.mobile.longlink.msg.liveadmininner.LongLinkAdminMessage.IconStyleOrBuilder
        public IconType getType() {
            IconType iconTypeForNumber = IconType.forNumber(this.type_);
            return iconTypeForNumber == null ? IconType.UNRECOGNIZED : iconTypeForNumber;
        }

        @Override // com.p1.mobile.longlink.msg.liveadmininner.LongLinkAdminMessage.IconStyleOrBuilder
        public int getTypeValue() {
            return this.type_;
        }

        @Override // com.p1.mobile.longlink.msg.liveadmininner.LongLinkAdminMessage.IconStyleOrBuilder
        public String getUrl() {
            return this.url_;
        }

        @Override // com.p1.mobile.longlink.msg.liveadmininner.LongLinkAdminMessage.IconStyleOrBuilder
        public ByteString getUrlBytes() {
            return ByteString.copyFromUtf8(this.url_);
        }

        @Override // com.google.protobuf.InterfaceC3442q
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (this.type_ != IconType.iconUrl.getNumber()) {
                codedOutputStream.m17015i0(1, this.type_);
            }
            if (this.url_.isEmpty()) {
                return;
            }
            codedOutputStream.mo16994D0(2, getUrl());
        }

        public static IconStyle parseDelimitedFrom(InputStream inputStream, C3433h c3433h) throws IOException {
            return (IconStyle) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, c3433h);
        }

        public static IconStyle parseFrom(ByteString byteString, C3433h c3433h) throws InvalidProtocolBufferException {
            return (IconStyle) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, c3433h);
        }

        public static IconStyle parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (IconStyle) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static IconStyle parseFrom(byte[] bArr, C3433h c3433h) throws InvalidProtocolBufferException {
            return (IconStyle) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, c3433h);
        }

        public static IconStyle parseFrom(InputStream inputStream) throws IOException {
            return (IconStyle) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static IconStyle parseFrom(InputStream inputStream, C3433h c3433h) throws IOException {
            return (IconStyle) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, c3433h);
        }

        public static IconStyle parseFrom(C3430e c3430e) throws IOException {
            return (IconStyle) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, c3430e);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static IconStyle parseFrom(C3430e c3430e, C3433h c3433h) throws IOException {
            return (IconStyle) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, c3430e, c3433h);
        }
    }

    public enum IconType implements C3437l.c {
        iconUrl(0),
        userSelf(1),
        UNRECOGNIZED(-1);

        public static final int iconUrl_VALUE = 0;
        private static final C3437l.d<IconType> internalValueMap = new C3437l.d<IconType>() { // from class: com.p1.mobile.longlink.msg.liveadmininner.LongLinkAdminMessage.IconType.1
            @Override // com.google.protobuf.C3437l.d
            public IconType findValueByNumber(int i) {
                return IconType.forNumber(i);
            }
        };
        public static final int userSelf_VALUE = 1;
        private final int value;

        IconType(int i) {
            this.value = i;
        }

        public static IconType forNumber(int i) {
            if (i == 0) {
                return iconUrl;
            }
            if (i != 1) {
                return null;
            }
            return userSelf;
        }

        public static C3437l.d<IconType> internalGetValueMap() {
            return internalValueMap;
        }

        @Override // com.google.protobuf.C3437l.c
        public final int getNumber() {
            return this.value;
        }

        @Deprecated
        public static IconType valueOf(int i) {
            return forNumber(i);
        }
    }

    public static final class JumpStyle extends GeneratedMessageLite<JumpStyle, Builder> implements JumpStyleOrBuilder {
        public static final int BUTTON_FIELD_NUMBER = 3;
        private static final JumpStyle DEFAULT_INSTANCE;
        private static volatile ng60<JumpStyle> PARSER = null;
        public static final int SCHEMA_FIELD_NUMBER = 2;
        public static final int TYPE_FIELD_NUMBER = 1;
        private ButtonJumpStyle button_;
        private String schema_ = "";
        private int type_;

        static {
            JumpStyle jumpStyle = new JumpStyle();
            DEFAULT_INSTANCE = jumpStyle;
            jumpStyle.makeImmutable();
        }

        private JumpStyle() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearButton() {
            this.button_ = null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearSchema() {
            this.schema_ = getDefaultInstance().getSchema();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearType() {
            this.type_ = 0;
        }

        public static JumpStyle getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeButton(ButtonJumpStyle buttonJumpStyle) {
            ButtonJumpStyle buttonJumpStyle2 = this.button_;
            if (buttonJumpStyle2 == null || buttonJumpStyle2 == ButtonJumpStyle.getDefaultInstance()) {
                this.button_ = buttonJumpStyle;
            } else {
                this.button_ = ButtonJumpStyle.newBuilder(this.button_).mergeFrom(buttonJumpStyle).buildPartial();
            }
        }

        public static Builder newBuilder(JumpStyle jumpStyle) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(jumpStyle);
        }

        public static JumpStyle parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (JumpStyle) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static JumpStyle parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (JumpStyle) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static ng60<JumpStyle> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setButton(ButtonJumpStyle.Builder builder) {
            this.button_ = builder.build();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSchema(String str) {
            str.getClass();
            this.schema_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSchemaBytes(ByteString byteString) {
            byteString.getClass();
            AbstractC3426a.checkByteStringIsUtf8(byteString);
            this.schema_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setType(JumpType jumpType) {
            jumpType.getClass();
            this.type_ = jumpType.getNumber();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTypeValue(int i) {
            this.type_ = i;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            boolean z = false;
            switch (C45851.f16672xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new JumpStyle();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                    return null;
                case 4:
                    return new Builder();
                case 5:
                    GeneratedMessageLite.InterfaceC3409h interfaceC3409h = (GeneratedMessageLite.InterfaceC3409h) obj;
                    JumpStyle jumpStyle = (JumpStyle) obj2;
                    int i = this.type_;
                    boolean z2 = i != 0;
                    int i2 = jumpStyle.type_;
                    this.type_ = interfaceC3409h.mo17051e(z2, i, i2 != 0, i2);
                    this.schema_ = interfaceC3409h.mo17052f(!this.schema_.isEmpty(), this.schema_, !jumpStyle.schema_.isEmpty(), jumpStyle.schema_);
                    this.button_ = (ButtonJumpStyle) interfaceC3409h.mo17061o(this.button_, jumpStyle.button_);
                    GeneratedMessageLite.C3408g c3408g = GeneratedMessageLite.C3408g.INSTANCE;
                    return this;
                case 6:
                    C3430e c3430e = (C3430e) obj;
                    C3433h c3433h = (C3433h) obj2;
                    while (!z) {
                        try {
                            int iM17171M = c3430e.m17171M();
                            if (iM17171M != 0) {
                                if (iM17171M == 8) {
                                    this.type_ = c3430e.m17191p();
                                } else if (iM17171M == 18) {
                                    this.schema_ = c3430e.m17170L();
                                } else if (iM17171M == 26) {
                                    ButtonJumpStyle buttonJumpStyle = this.button_;
                                    ButtonJumpStyle.Builder builder = buttonJumpStyle != null ? buttonJumpStyle.toBuilder() : null;
                                    ButtonJumpStyle buttonJumpStyle2 = (ButtonJumpStyle) c3430e.m17198w(ButtonJumpStyle.parser(), c3433h);
                                    this.button_ = buttonJumpStyle2;
                                    if (builder != null) {
                                        builder.mergeFrom(buttonJumpStyle2);
                                        this.button_ = builder.buildPartial();
                                    }
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
                        synchronized (JumpStyle.class) {
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

        @Override // com.p1.mobile.longlink.msg.liveadmininner.LongLinkAdminMessage.JumpStyleOrBuilder
        public ButtonJumpStyle getButton() {
            ButtonJumpStyle buttonJumpStyle = this.button_;
            return buttonJumpStyle == null ? ButtonJumpStyle.getDefaultInstance() : buttonJumpStyle;
        }

        @Override // com.p1.mobile.longlink.msg.liveadmininner.LongLinkAdminMessage.JumpStyleOrBuilder
        public String getSchema() {
            return this.schema_;
        }

        @Override // com.p1.mobile.longlink.msg.liveadmininner.LongLinkAdminMessage.JumpStyleOrBuilder
        public ByteString getSchemaBytes() {
            return ByteString.copyFromUtf8(this.schema_);
        }

        @Override // com.google.protobuf.InterfaceC3442q
        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int iM16977m = this.type_ != JumpType.gotoLink.getNumber() ? CodedOutputStream.m16977m(1, this.type_) : 0;
            if (!this.schema_.isEmpty()) {
                iM16977m += CodedOutputStream.m16956K(2, getSchema());
            }
            if (this.button_ != null) {
                iM16977m += CodedOutputStream.m16948C(3, getButton());
            }
            this.memoizedSerializedSize = iM16977m;
            return iM16977m;
        }

        @Override // com.p1.mobile.longlink.msg.liveadmininner.LongLinkAdminMessage.JumpStyleOrBuilder
        public JumpType getType() {
            JumpType jumpTypeForNumber = JumpType.forNumber(this.type_);
            return jumpTypeForNumber == null ? JumpType.UNRECOGNIZED : jumpTypeForNumber;
        }

        @Override // com.p1.mobile.longlink.msg.liveadmininner.LongLinkAdminMessage.JumpStyleOrBuilder
        public int getTypeValue() {
            return this.type_;
        }

        @Override // com.p1.mobile.longlink.msg.liveadmininner.LongLinkAdminMessage.JumpStyleOrBuilder
        public boolean hasButton() {
            return this.button_ != null;
        }

        @Override // com.google.protobuf.InterfaceC3442q
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (this.type_ != JumpType.gotoLink.getNumber()) {
                codedOutputStream.m17015i0(1, this.type_);
            }
            if (!this.schema_.isEmpty()) {
                codedOutputStream.mo16994D0(2, getSchema());
            }
            if (this.button_ != null) {
                codedOutputStream.mo17029w0(3, getButton());
            }
        }

        public static JumpStyle parseDelimitedFrom(InputStream inputStream, C3433h c3433h) throws IOException {
            return (JumpStyle) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, c3433h);
        }

        public static JumpStyle parseFrom(ByteString byteString, C3433h c3433h) throws InvalidProtocolBufferException {
            return (JumpStyle) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, c3433h);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setButton(ButtonJumpStyle buttonJumpStyle) {
            buttonJumpStyle.getClass();
            this.button_ = buttonJumpStyle;
        }

        public static final class Builder extends GeneratedMessageLite.AbstractC3403b<JumpStyle, Builder> implements JumpStyleOrBuilder {
            private Builder() {
                super(JumpStyle.DEFAULT_INSTANCE);
            }

            public Builder clearButton() {
                copyOnWrite();
                ((JumpStyle) this.instance).clearButton();
                return this;
            }

            public Builder clearSchema() {
                copyOnWrite();
                ((JumpStyle) this.instance).clearSchema();
                return this;
            }

            public Builder clearType() {
                copyOnWrite();
                ((JumpStyle) this.instance).clearType();
                return this;
            }

            @Override // com.p1.mobile.longlink.msg.liveadmininner.LongLinkAdminMessage.JumpStyleOrBuilder
            public ButtonJumpStyle getButton() {
                return ((JumpStyle) this.instance).getButton();
            }

            @Override // com.p1.mobile.longlink.msg.liveadmininner.LongLinkAdminMessage.JumpStyleOrBuilder
            public String getSchema() {
                return ((JumpStyle) this.instance).getSchema();
            }

            @Override // com.p1.mobile.longlink.msg.liveadmininner.LongLinkAdminMessage.JumpStyleOrBuilder
            public ByteString getSchemaBytes() {
                return ((JumpStyle) this.instance).getSchemaBytes();
            }

            @Override // com.p1.mobile.longlink.msg.liveadmininner.LongLinkAdminMessage.JumpStyleOrBuilder
            public JumpType getType() {
                return ((JumpStyle) this.instance).getType();
            }

            @Override // com.p1.mobile.longlink.msg.liveadmininner.LongLinkAdminMessage.JumpStyleOrBuilder
            public int getTypeValue() {
                return ((JumpStyle) this.instance).getTypeValue();
            }

            @Override // com.p1.mobile.longlink.msg.liveadmininner.LongLinkAdminMessage.JumpStyleOrBuilder
            public boolean hasButton() {
                return ((JumpStyle) this.instance).hasButton();
            }

            public Builder mergeButton(ButtonJumpStyle buttonJumpStyle) {
                copyOnWrite();
                ((JumpStyle) this.instance).mergeButton(buttonJumpStyle);
                return this;
            }

            public Builder setButton(ButtonJumpStyle buttonJumpStyle) {
                copyOnWrite();
                ((JumpStyle) this.instance).setButton(buttonJumpStyle);
                return this;
            }

            public Builder setSchema(String str) {
                copyOnWrite();
                ((JumpStyle) this.instance).setSchema(str);
                return this;
            }

            public Builder setSchemaBytes(ByteString byteString) {
                copyOnWrite();
                ((JumpStyle) this.instance).setSchemaBytes(byteString);
                return this;
            }

            public Builder setType(JumpType jumpType) {
                copyOnWrite();
                ((JumpStyle) this.instance).setType(jumpType);
                return this;
            }

            public Builder setTypeValue(int i) {
                copyOnWrite();
                ((JumpStyle) this.instance).setTypeValue(i);
                return this;
            }

            public Builder setButton(ButtonJumpStyle.Builder builder) {
                copyOnWrite();
                ((JumpStyle) this.instance).setButton(builder);
                return this;
            }
        }

        public static JumpStyle parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (JumpStyle) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static JumpStyle parseFrom(byte[] bArr, C3433h c3433h) throws InvalidProtocolBufferException {
            return (JumpStyle) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, c3433h);
        }

        public static JumpStyle parseFrom(InputStream inputStream) throws IOException {
            return (JumpStyle) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static JumpStyle parseFrom(InputStream inputStream, C3433h c3433h) throws IOException {
            return (JumpStyle) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, c3433h);
        }

        public static JumpStyle parseFrom(C3430e c3430e) throws IOException {
            return (JumpStyle) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, c3430e);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static JumpStyle parseFrom(C3430e c3430e, C3433h c3433h) throws IOException {
            return (JumpStyle) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, c3430e, c3433h);
        }
    }

    public enum JumpType implements C3437l.c {
        gotoLink(0),
        staticButton(1),
        dynamicButton(2),
        UNRECOGNIZED(-1);

        public static final int dynamicButton_VALUE = 2;
        public static final int gotoLink_VALUE = 0;
        private static final C3437l.d<JumpType> internalValueMap = new C3437l.d<JumpType>() { // from class: com.p1.mobile.longlink.msg.liveadmininner.LongLinkAdminMessage.JumpType.1
            @Override // com.google.protobuf.C3437l.d
            public JumpType findValueByNumber(int i) {
                return JumpType.forNumber(i);
            }
        };
        public static final int staticButton_VALUE = 1;
        private final int value;

        JumpType(int i) {
            this.value = i;
        }

        public static JumpType forNumber(int i) {
            if (i == 0) {
                return gotoLink;
            }
            if (i == 1) {
                return staticButton;
            }
            if (i != 2) {
                return null;
            }
            return dynamicButton;
        }

        public static C3437l.d<JumpType> internalGetValueMap() {
            return internalValueMap;
        }

        @Override // com.google.protobuf.C3437l.c
        public final int getNumber() {
            return this.value;
        }

        @Deprecated
        public static JumpType valueOf(int i) {
            return forNumber(i);
        }
    }

    public static final class UserWithBgColorSocketNotification extends GeneratedMessageLite<UserWithBgColorSocketNotification, Builder> implements UserWithBgColorSocketNotificationOrBuilder {
        public static final int BGSTYLE_FIELD_NUMBER = 3;
        public static final int CONTENT_FIELD_NUMBER = 4;
        private static final UserWithBgColorSocketNotification DEFAULT_INSTANCE;
        public static final int ICON_FIELD_NUMBER = 2;
        public static final int ISCOUNTDOWN_FIELD_NUMBER = 11;
        public static final int ISFIXED_FIELD_NUMBER = 12;
        public static final int JUMP_FIELD_NUMBER = 5;
        public static final int MOVEUP_FIELD_NUMBER = 10;
        private static volatile ng60<UserWithBgColorSocketNotification> PARSER = null;
        public static final int ROOMID_FIELD_NUMBER = 1;
        public static final int ROTATIONINTERVAL_FIELD_NUMBER = 8;
        public static final int SHOWSECONDS_FIELD_NUMBER = 7;
        public static final int SHOWTIMES_FIELD_NUMBER = 6;
        public static final int TYPE_FIELD_NUMBER = 9;
        private BgStyle bgStyle_;
        private IconStyle icon_;
        private boolean isCountdown_;
        private boolean isFixed_;
        private JumpStyle jump_;
        private boolean moveUp_;
        private long rotationInterval_;
        private long showSeconds_;
        private long showTimes_;
        private String roomId_ = "";
        private String content_ = "";
        private String type_ = "";

        static {
            UserWithBgColorSocketNotification userWithBgColorSocketNotification = new UserWithBgColorSocketNotification();
            DEFAULT_INSTANCE = userWithBgColorSocketNotification;
            userWithBgColorSocketNotification.makeImmutable();
        }

        private UserWithBgColorSocketNotification() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearBgStyle() {
            this.bgStyle_ = null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearContent() {
            this.content_ = getDefaultInstance().getContent();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearIcon() {
            this.icon_ = null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearIsCountdown() {
            this.isCountdown_ = false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearIsFixed() {
            this.isFixed_ = false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearJump() {
            this.jump_ = null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearMoveUp() {
            this.moveUp_ = false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearRoomId() {
            this.roomId_ = getDefaultInstance().getRoomId();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearRotationInterval() {
            this.rotationInterval_ = 0L;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearShowSeconds() {
            this.showSeconds_ = 0L;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearShowTimes() {
            this.showTimes_ = 0L;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearType() {
            this.type_ = getDefaultInstance().getType();
        }

        public static UserWithBgColorSocketNotification getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeBgStyle(BgStyle bgStyle) {
            BgStyle bgStyle2 = this.bgStyle_;
            if (bgStyle2 == null || bgStyle2 == BgStyle.getDefaultInstance()) {
                this.bgStyle_ = bgStyle;
            } else {
                this.bgStyle_ = BgStyle.newBuilder(this.bgStyle_).mergeFrom(bgStyle).buildPartial();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeIcon(IconStyle iconStyle) {
            IconStyle iconStyle2 = this.icon_;
            if (iconStyle2 == null || iconStyle2 == IconStyle.getDefaultInstance()) {
                this.icon_ = iconStyle;
            } else {
                this.icon_ = IconStyle.newBuilder(this.icon_).mergeFrom(iconStyle).buildPartial();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeJump(JumpStyle jumpStyle) {
            JumpStyle jumpStyle2 = this.jump_;
            if (jumpStyle2 == null || jumpStyle2 == JumpStyle.getDefaultInstance()) {
                this.jump_ = jumpStyle;
            } else {
                this.jump_ = JumpStyle.newBuilder(this.jump_).mergeFrom(jumpStyle).buildPartial();
            }
        }

        public static Builder newBuilder(UserWithBgColorSocketNotification userWithBgColorSocketNotification) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(userWithBgColorSocketNotification);
        }

        public static UserWithBgColorSocketNotification parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (UserWithBgColorSocketNotification) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static UserWithBgColorSocketNotification parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (UserWithBgColorSocketNotification) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static ng60<UserWithBgColorSocketNotification> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setBgStyle(BgStyle.Builder builder) {
            this.bgStyle_ = builder.build();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setContent(String str) {
            str.getClass();
            this.content_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setContentBytes(ByteString byteString) {
            byteString.getClass();
            AbstractC3426a.checkByteStringIsUtf8(byteString);
            this.content_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setIcon(IconStyle.Builder builder) {
            this.icon_ = builder.build();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setIsCountdown(boolean z) {
            this.isCountdown_ = z;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setIsFixed(boolean z) {
            this.isFixed_ = z;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setJump(JumpStyle.Builder builder) {
            this.jump_ = builder.build();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setMoveUp(boolean z) {
            this.moveUp_ = z;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setRoomId(String str) {
            str.getClass();
            this.roomId_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setRoomIdBytes(ByteString byteString) {
            byteString.getClass();
            AbstractC3426a.checkByteStringIsUtf8(byteString);
            this.roomId_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setRotationInterval(long j) {
            this.rotationInterval_ = j;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setShowSeconds(long j) {
            this.showSeconds_ = j;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setShowTimes(long j) {
            this.showTimes_ = j;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setType(String str) {
            str.getClass();
            this.type_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTypeBytes(ByteString byteString) {
            byteString.getClass();
            AbstractC3426a.checkByteStringIsUtf8(byteString);
            this.type_ = byteString.toStringUtf8();
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            boolean z = false;
            switch (C45851.f16672xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new UserWithBgColorSocketNotification();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                    return null;
                case 4:
                    return new Builder();
                case 5:
                    GeneratedMessageLite.InterfaceC3409h interfaceC3409h = (GeneratedMessageLite.InterfaceC3409h) obj;
                    UserWithBgColorSocketNotification userWithBgColorSocketNotification = (UserWithBgColorSocketNotification) obj2;
                    this.roomId_ = interfaceC3409h.mo17052f(!this.roomId_.isEmpty(), this.roomId_, !userWithBgColorSocketNotification.roomId_.isEmpty(), userWithBgColorSocketNotification.roomId_);
                    this.icon_ = (IconStyle) interfaceC3409h.mo17061o(this.icon_, userWithBgColorSocketNotification.icon_);
                    this.bgStyle_ = (BgStyle) interfaceC3409h.mo17061o(this.bgStyle_, userWithBgColorSocketNotification.bgStyle_);
                    this.content_ = interfaceC3409h.mo17052f(!this.content_.isEmpty(), this.content_, !userWithBgColorSocketNotification.content_.isEmpty(), userWithBgColorSocketNotification.content_);
                    this.jump_ = (JumpStyle) interfaceC3409h.mo17061o(this.jump_, userWithBgColorSocketNotification.jump_);
                    long j = this.showTimes_;
                    boolean z2 = j != 0;
                    long j2 = userWithBgColorSocketNotification.showTimes_;
                    this.showTimes_ = interfaceC3409h.mo17055i(z2, j, j2 != 0, j2);
                    long j3 = this.showSeconds_;
                    boolean z3 = j3 != 0;
                    long j4 = userWithBgColorSocketNotification.showSeconds_;
                    this.showSeconds_ = interfaceC3409h.mo17055i(z3, j3, j4 != 0, j4);
                    long j5 = this.rotationInterval_;
                    boolean z4 = j5 != 0;
                    long j6 = userWithBgColorSocketNotification.rotationInterval_;
                    this.rotationInterval_ = interfaceC3409h.mo17055i(z4, j5, j6 != 0, j6);
                    this.type_ = interfaceC3409h.mo17052f(!this.type_.isEmpty(), this.type_, !userWithBgColorSocketNotification.type_.isEmpty(), userWithBgColorSocketNotification.type_);
                    boolean z5 = this.moveUp_;
                    boolean z6 = userWithBgColorSocketNotification.moveUp_;
                    this.moveUp_ = interfaceC3409h.mo17050d(z5, z5, z6, z6);
                    boolean z7 = this.isCountdown_;
                    boolean z8 = userWithBgColorSocketNotification.isCountdown_;
                    this.isCountdown_ = interfaceC3409h.mo17050d(z7, z7, z8, z8);
                    boolean z9 = this.isFixed_;
                    boolean z10 = userWithBgColorSocketNotification.isFixed_;
                    this.isFixed_ = interfaceC3409h.mo17050d(z9, z9, z10, z10);
                    GeneratedMessageLite.C3408g c3408g = GeneratedMessageLite.C3408g.INSTANCE;
                    return this;
                case 6:
                    C3430e c3430e = (C3430e) obj;
                    C3433h c3433h = (C3433h) obj2;
                    while (!z) {
                        try {
                            int iM17171M = c3430e.m17171M();
                            switch (iM17171M) {
                                case 0:
                                    break;
                                case 10:
                                    this.roomId_ = c3430e.m17170L();
                                    continue;
                                case 18:
                                    IconStyle iconStyle = this.icon_;
                                    IconStyle.Builder builder = iconStyle != null ? iconStyle.toBuilder() : null;
                                    IconStyle iconStyle2 = (IconStyle) c3430e.m17198w(IconStyle.parser(), c3433h);
                                    this.icon_ = iconStyle2;
                                    if (builder != null) {
                                        builder.mergeFrom(iconStyle2);
                                        this.icon_ = builder.buildPartial();
                                    } else {
                                        continue;
                                    }
                                    break;
                                case 26:
                                    BgStyle bgStyle = this.bgStyle_;
                                    BgStyle.Builder builder2 = bgStyle != null ? bgStyle.toBuilder() : null;
                                    BgStyle bgStyle2 = (BgStyle) c3430e.m17198w(BgStyle.parser(), c3433h);
                                    this.bgStyle_ = bgStyle2;
                                    if (builder2 != null) {
                                        builder2.mergeFrom(bgStyle2);
                                        this.bgStyle_ = builder2.buildPartial();
                                    } else {
                                        continue;
                                    }
                                    break;
                                case 34:
                                    this.content_ = c3430e.m17170L();
                                    continue;
                                case 42:
                                    JumpStyle jumpStyle = this.jump_;
                                    JumpStyle.Builder builder3 = jumpStyle != null ? jumpStyle.toBuilder() : null;
                                    JumpStyle jumpStyle2 = (JumpStyle) c3430e.m17198w(JumpStyle.parser(), c3433h);
                                    this.jump_ = jumpStyle2;
                                    if (builder3 != null) {
                                        builder3.mergeFrom(jumpStyle2);
                                        this.jump_ = builder3.buildPartial();
                                    } else {
                                        continue;
                                    }
                                    break;
                                case 48:
                                    this.showTimes_ = c3430e.m17197v();
                                    continue;
                                case 56:
                                    this.showSeconds_ = c3430e.m17197v();
                                    continue;
                                case 64:
                                    this.rotationInterval_ = c3430e.m17197v();
                                    continue;
                                case 74:
                                    this.type_ = c3430e.m17170L();
                                    continue;
                                case 80:
                                    this.moveUp_ = c3430e.m17188m();
                                    continue;
                                case 88:
                                    this.isCountdown_ = c3430e.m17188m();
                                    continue;
                                case Opcodes.IADD /* 96 */:
                                    this.isFixed_ = c3430e.m17188m();
                                    continue;
                                default:
                                    if (!c3430e.m17176R(iM17171M)) {
                                        break;
                                    }
                                    break;
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
                        synchronized (UserWithBgColorSocketNotification.class) {
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

        @Override // com.p1.mobile.longlink.msg.liveadmininner.LongLinkAdminMessage.UserWithBgColorSocketNotificationOrBuilder
        public BgStyle getBgStyle() {
            BgStyle bgStyle = this.bgStyle_;
            return bgStyle == null ? BgStyle.getDefaultInstance() : bgStyle;
        }

        @Override // com.p1.mobile.longlink.msg.liveadmininner.LongLinkAdminMessage.UserWithBgColorSocketNotificationOrBuilder
        public String getContent() {
            return this.content_;
        }

        @Override // com.p1.mobile.longlink.msg.liveadmininner.LongLinkAdminMessage.UserWithBgColorSocketNotificationOrBuilder
        public ByteString getContentBytes() {
            return ByteString.copyFromUtf8(this.content_);
        }

        @Override // com.p1.mobile.longlink.msg.liveadmininner.LongLinkAdminMessage.UserWithBgColorSocketNotificationOrBuilder
        public IconStyle getIcon() {
            IconStyle iconStyle = this.icon_;
            return iconStyle == null ? IconStyle.getDefaultInstance() : iconStyle;
        }

        @Override // com.p1.mobile.longlink.msg.liveadmininner.LongLinkAdminMessage.UserWithBgColorSocketNotificationOrBuilder
        public boolean getIsCountdown() {
            return this.isCountdown_;
        }

        @Override // com.p1.mobile.longlink.msg.liveadmininner.LongLinkAdminMessage.UserWithBgColorSocketNotificationOrBuilder
        public boolean getIsFixed() {
            return this.isFixed_;
        }

        @Override // com.p1.mobile.longlink.msg.liveadmininner.LongLinkAdminMessage.UserWithBgColorSocketNotificationOrBuilder
        public JumpStyle getJump() {
            JumpStyle jumpStyle = this.jump_;
            return jumpStyle == null ? JumpStyle.getDefaultInstance() : jumpStyle;
        }

        @Override // com.p1.mobile.longlink.msg.liveadmininner.LongLinkAdminMessage.UserWithBgColorSocketNotificationOrBuilder
        public boolean getMoveUp() {
            return this.moveUp_;
        }

        @Override // com.p1.mobile.longlink.msg.liveadmininner.LongLinkAdminMessage.UserWithBgColorSocketNotificationOrBuilder
        public String getRoomId() {
            return this.roomId_;
        }

        @Override // com.p1.mobile.longlink.msg.liveadmininner.LongLinkAdminMessage.UserWithBgColorSocketNotificationOrBuilder
        public ByteString getRoomIdBytes() {
            return ByteString.copyFromUtf8(this.roomId_);
        }

        @Override // com.p1.mobile.longlink.msg.liveadmininner.LongLinkAdminMessage.UserWithBgColorSocketNotificationOrBuilder
        public long getRotationInterval() {
            return this.rotationInterval_;
        }

        @Override // com.google.protobuf.InterfaceC3442q
        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int iM16956K = !this.roomId_.isEmpty() ? CodedOutputStream.m16956K(1, getRoomId()) : 0;
            if (this.icon_ != null) {
                iM16956K += CodedOutputStream.m16948C(2, getIcon());
            }
            if (this.bgStyle_ != null) {
                iM16956K += CodedOutputStream.m16948C(3, getBgStyle());
            }
            if (!this.content_.isEmpty()) {
                iM16956K += CodedOutputStream.m16956K(4, getContent());
            }
            if (this.jump_ != null) {
                iM16956K += CodedOutputStream.m16948C(5, getJump());
            }
            long j = this.showTimes_;
            if (j != 0) {
                iM16956K += CodedOutputStream.m16986v(6, j);
            }
            long j2 = this.showSeconds_;
            if (j2 != 0) {
                iM16956K += CodedOutputStream.m16986v(7, j2);
            }
            long j3 = this.rotationInterval_;
            if (j3 != 0) {
                iM16956K += CodedOutputStream.m16986v(8, j3);
            }
            if (!this.type_.isEmpty()) {
                iM16956K += CodedOutputStream.m16956K(9, getType());
            }
            boolean z = this.moveUp_;
            if (z) {
                iM16956K += CodedOutputStream.m16970f(10, z);
            }
            boolean z2 = this.isCountdown_;
            if (z2) {
                iM16956K += CodedOutputStream.m16970f(11, z2);
            }
            boolean z3 = this.isFixed_;
            if (z3) {
                iM16956K += CodedOutputStream.m16970f(12, z3);
            }
            this.memoizedSerializedSize = iM16956K;
            return iM16956K;
        }

        @Override // com.p1.mobile.longlink.msg.liveadmininner.LongLinkAdminMessage.UserWithBgColorSocketNotificationOrBuilder
        public long getShowSeconds() {
            return this.showSeconds_;
        }

        @Override // com.p1.mobile.longlink.msg.liveadmininner.LongLinkAdminMessage.UserWithBgColorSocketNotificationOrBuilder
        public long getShowTimes() {
            return this.showTimes_;
        }

        @Override // com.p1.mobile.longlink.msg.liveadmininner.LongLinkAdminMessage.UserWithBgColorSocketNotificationOrBuilder
        public String getType() {
            return this.type_;
        }

        @Override // com.p1.mobile.longlink.msg.liveadmininner.LongLinkAdminMessage.UserWithBgColorSocketNotificationOrBuilder
        public ByteString getTypeBytes() {
            return ByteString.copyFromUtf8(this.type_);
        }

        @Override // com.p1.mobile.longlink.msg.liveadmininner.LongLinkAdminMessage.UserWithBgColorSocketNotificationOrBuilder
        public boolean hasBgStyle() {
            return this.bgStyle_ != null;
        }

        @Override // com.p1.mobile.longlink.msg.liveadmininner.LongLinkAdminMessage.UserWithBgColorSocketNotificationOrBuilder
        public boolean hasIcon() {
            return this.icon_ != null;
        }

        @Override // com.p1.mobile.longlink.msg.liveadmininner.LongLinkAdminMessage.UserWithBgColorSocketNotificationOrBuilder
        public boolean hasJump() {
            return this.jump_ != null;
        }

        @Override // com.google.protobuf.InterfaceC3442q
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (!this.roomId_.isEmpty()) {
                codedOutputStream.mo16994D0(1, getRoomId());
            }
            if (this.icon_ != null) {
                codedOutputStream.mo17029w0(2, getIcon());
            }
            if (this.bgStyle_ != null) {
                codedOutputStream.mo17029w0(3, getBgStyle());
            }
            if (!this.content_.isEmpty()) {
                codedOutputStream.mo16994D0(4, getContent());
            }
            if (this.jump_ != null) {
                codedOutputStream.mo17029w0(5, getJump());
            }
            long j = this.showTimes_;
            if (j != 0) {
                codedOutputStream.m17027u0(6, j);
            }
            long j2 = this.showSeconds_;
            if (j2 != 0) {
                codedOutputStream.m17027u0(7, j2);
            }
            long j3 = this.rotationInterval_;
            if (j3 != 0) {
                codedOutputStream.m17027u0(8, j3);
            }
            if (!this.type_.isEmpty()) {
                codedOutputStream.mo16994D0(9, getType());
            }
            boolean z = this.moveUp_;
            if (z) {
                codedOutputStream.mo17005a0(10, z);
            }
            boolean z2 = this.isCountdown_;
            if (z2) {
                codedOutputStream.mo17005a0(11, z2);
            }
            boolean z3 = this.isFixed_;
            if (z3) {
                codedOutputStream.mo17005a0(12, z3);
            }
        }

        public static UserWithBgColorSocketNotification parseDelimitedFrom(InputStream inputStream, C3433h c3433h) throws IOException {
            return (UserWithBgColorSocketNotification) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, c3433h);
        }

        public static UserWithBgColorSocketNotification parseFrom(ByteString byteString, C3433h c3433h) throws InvalidProtocolBufferException {
            return (UserWithBgColorSocketNotification) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, c3433h);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setBgStyle(BgStyle bgStyle) {
            bgStyle.getClass();
            this.bgStyle_ = bgStyle;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setIcon(IconStyle iconStyle) {
            iconStyle.getClass();
            this.icon_ = iconStyle;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setJump(JumpStyle jumpStyle) {
            jumpStyle.getClass();
            this.jump_ = jumpStyle;
        }

        public static final class Builder extends GeneratedMessageLite.AbstractC3403b<UserWithBgColorSocketNotification, Builder> implements UserWithBgColorSocketNotificationOrBuilder {
            private Builder() {
                super(UserWithBgColorSocketNotification.DEFAULT_INSTANCE);
            }

            public Builder clearBgStyle() {
                copyOnWrite();
                ((UserWithBgColorSocketNotification) this.instance).clearBgStyle();
                return this;
            }

            public Builder clearContent() {
                copyOnWrite();
                ((UserWithBgColorSocketNotification) this.instance).clearContent();
                return this;
            }

            public Builder clearIcon() {
                copyOnWrite();
                ((UserWithBgColorSocketNotification) this.instance).clearIcon();
                return this;
            }

            public Builder clearIsCountdown() {
                copyOnWrite();
                ((UserWithBgColorSocketNotification) this.instance).clearIsCountdown();
                return this;
            }

            public Builder clearIsFixed() {
                copyOnWrite();
                ((UserWithBgColorSocketNotification) this.instance).clearIsFixed();
                return this;
            }

            public Builder clearJump() {
                copyOnWrite();
                ((UserWithBgColorSocketNotification) this.instance).clearJump();
                return this;
            }

            public Builder clearMoveUp() {
                copyOnWrite();
                ((UserWithBgColorSocketNotification) this.instance).clearMoveUp();
                return this;
            }

            public Builder clearRoomId() {
                copyOnWrite();
                ((UserWithBgColorSocketNotification) this.instance).clearRoomId();
                return this;
            }

            public Builder clearRotationInterval() {
                copyOnWrite();
                ((UserWithBgColorSocketNotification) this.instance).clearRotationInterval();
                return this;
            }

            public Builder clearShowSeconds() {
                copyOnWrite();
                ((UserWithBgColorSocketNotification) this.instance).clearShowSeconds();
                return this;
            }

            public Builder clearShowTimes() {
                copyOnWrite();
                ((UserWithBgColorSocketNotification) this.instance).clearShowTimes();
                return this;
            }

            public Builder clearType() {
                copyOnWrite();
                ((UserWithBgColorSocketNotification) this.instance).clearType();
                return this;
            }

            @Override // com.p1.mobile.longlink.msg.liveadmininner.LongLinkAdminMessage.UserWithBgColorSocketNotificationOrBuilder
            public BgStyle getBgStyle() {
                return ((UserWithBgColorSocketNotification) this.instance).getBgStyle();
            }

            @Override // com.p1.mobile.longlink.msg.liveadmininner.LongLinkAdminMessage.UserWithBgColorSocketNotificationOrBuilder
            public String getContent() {
                return ((UserWithBgColorSocketNotification) this.instance).getContent();
            }

            @Override // com.p1.mobile.longlink.msg.liveadmininner.LongLinkAdminMessage.UserWithBgColorSocketNotificationOrBuilder
            public ByteString getContentBytes() {
                return ((UserWithBgColorSocketNotification) this.instance).getContentBytes();
            }

            @Override // com.p1.mobile.longlink.msg.liveadmininner.LongLinkAdminMessage.UserWithBgColorSocketNotificationOrBuilder
            public IconStyle getIcon() {
                return ((UserWithBgColorSocketNotification) this.instance).getIcon();
            }

            @Override // com.p1.mobile.longlink.msg.liveadmininner.LongLinkAdminMessage.UserWithBgColorSocketNotificationOrBuilder
            public boolean getIsCountdown() {
                return ((UserWithBgColorSocketNotification) this.instance).getIsCountdown();
            }

            @Override // com.p1.mobile.longlink.msg.liveadmininner.LongLinkAdminMessage.UserWithBgColorSocketNotificationOrBuilder
            public boolean getIsFixed() {
                return ((UserWithBgColorSocketNotification) this.instance).getIsFixed();
            }

            @Override // com.p1.mobile.longlink.msg.liveadmininner.LongLinkAdminMessage.UserWithBgColorSocketNotificationOrBuilder
            public JumpStyle getJump() {
                return ((UserWithBgColorSocketNotification) this.instance).getJump();
            }

            @Override // com.p1.mobile.longlink.msg.liveadmininner.LongLinkAdminMessage.UserWithBgColorSocketNotificationOrBuilder
            public boolean getMoveUp() {
                return ((UserWithBgColorSocketNotification) this.instance).getMoveUp();
            }

            @Override // com.p1.mobile.longlink.msg.liveadmininner.LongLinkAdminMessage.UserWithBgColorSocketNotificationOrBuilder
            public String getRoomId() {
                return ((UserWithBgColorSocketNotification) this.instance).getRoomId();
            }

            @Override // com.p1.mobile.longlink.msg.liveadmininner.LongLinkAdminMessage.UserWithBgColorSocketNotificationOrBuilder
            public ByteString getRoomIdBytes() {
                return ((UserWithBgColorSocketNotification) this.instance).getRoomIdBytes();
            }

            @Override // com.p1.mobile.longlink.msg.liveadmininner.LongLinkAdminMessage.UserWithBgColorSocketNotificationOrBuilder
            public long getRotationInterval() {
                return ((UserWithBgColorSocketNotification) this.instance).getRotationInterval();
            }

            @Override // com.p1.mobile.longlink.msg.liveadmininner.LongLinkAdminMessage.UserWithBgColorSocketNotificationOrBuilder
            public long getShowSeconds() {
                return ((UserWithBgColorSocketNotification) this.instance).getShowSeconds();
            }

            @Override // com.p1.mobile.longlink.msg.liveadmininner.LongLinkAdminMessage.UserWithBgColorSocketNotificationOrBuilder
            public long getShowTimes() {
                return ((UserWithBgColorSocketNotification) this.instance).getShowTimes();
            }

            @Override // com.p1.mobile.longlink.msg.liveadmininner.LongLinkAdminMessage.UserWithBgColorSocketNotificationOrBuilder
            public String getType() {
                return ((UserWithBgColorSocketNotification) this.instance).getType();
            }

            @Override // com.p1.mobile.longlink.msg.liveadmininner.LongLinkAdminMessage.UserWithBgColorSocketNotificationOrBuilder
            public ByteString getTypeBytes() {
                return ((UserWithBgColorSocketNotification) this.instance).getTypeBytes();
            }

            @Override // com.p1.mobile.longlink.msg.liveadmininner.LongLinkAdminMessage.UserWithBgColorSocketNotificationOrBuilder
            public boolean hasBgStyle() {
                return ((UserWithBgColorSocketNotification) this.instance).hasBgStyle();
            }

            @Override // com.p1.mobile.longlink.msg.liveadmininner.LongLinkAdminMessage.UserWithBgColorSocketNotificationOrBuilder
            public boolean hasIcon() {
                return ((UserWithBgColorSocketNotification) this.instance).hasIcon();
            }

            @Override // com.p1.mobile.longlink.msg.liveadmininner.LongLinkAdminMessage.UserWithBgColorSocketNotificationOrBuilder
            public boolean hasJump() {
                return ((UserWithBgColorSocketNotification) this.instance).hasJump();
            }

            public Builder mergeBgStyle(BgStyle bgStyle) {
                copyOnWrite();
                ((UserWithBgColorSocketNotification) this.instance).mergeBgStyle(bgStyle);
                return this;
            }

            public Builder mergeIcon(IconStyle iconStyle) {
                copyOnWrite();
                ((UserWithBgColorSocketNotification) this.instance).mergeIcon(iconStyle);
                return this;
            }

            public Builder mergeJump(JumpStyle jumpStyle) {
                copyOnWrite();
                ((UserWithBgColorSocketNotification) this.instance).mergeJump(jumpStyle);
                return this;
            }

            public Builder setBgStyle(BgStyle bgStyle) {
                copyOnWrite();
                ((UserWithBgColorSocketNotification) this.instance).setBgStyle(bgStyle);
                return this;
            }

            public Builder setContent(String str) {
                copyOnWrite();
                ((UserWithBgColorSocketNotification) this.instance).setContent(str);
                return this;
            }

            public Builder setContentBytes(ByteString byteString) {
                copyOnWrite();
                ((UserWithBgColorSocketNotification) this.instance).setContentBytes(byteString);
                return this;
            }

            public Builder setIcon(IconStyle iconStyle) {
                copyOnWrite();
                ((UserWithBgColorSocketNotification) this.instance).setIcon(iconStyle);
                return this;
            }

            public Builder setIsCountdown(boolean z) {
                copyOnWrite();
                ((UserWithBgColorSocketNotification) this.instance).setIsCountdown(z);
                return this;
            }

            public Builder setIsFixed(boolean z) {
                copyOnWrite();
                ((UserWithBgColorSocketNotification) this.instance).setIsFixed(z);
                return this;
            }

            public Builder setJump(JumpStyle jumpStyle) {
                copyOnWrite();
                ((UserWithBgColorSocketNotification) this.instance).setJump(jumpStyle);
                return this;
            }

            public Builder setMoveUp(boolean z) {
                copyOnWrite();
                ((UserWithBgColorSocketNotification) this.instance).setMoveUp(z);
                return this;
            }

            public Builder setRoomId(String str) {
                copyOnWrite();
                ((UserWithBgColorSocketNotification) this.instance).setRoomId(str);
                return this;
            }

            public Builder setRoomIdBytes(ByteString byteString) {
                copyOnWrite();
                ((UserWithBgColorSocketNotification) this.instance).setRoomIdBytes(byteString);
                return this;
            }

            public Builder setRotationInterval(long j) {
                copyOnWrite();
                ((UserWithBgColorSocketNotification) this.instance).setRotationInterval(j);
                return this;
            }

            public Builder setShowSeconds(long j) {
                copyOnWrite();
                ((UserWithBgColorSocketNotification) this.instance).setShowSeconds(j);
                return this;
            }

            public Builder setShowTimes(long j) {
                copyOnWrite();
                ((UserWithBgColorSocketNotification) this.instance).setShowTimes(j);
                return this;
            }

            public Builder setType(String str) {
                copyOnWrite();
                ((UserWithBgColorSocketNotification) this.instance).setType(str);
                return this;
            }

            public Builder setTypeBytes(ByteString byteString) {
                copyOnWrite();
                ((UserWithBgColorSocketNotification) this.instance).setTypeBytes(byteString);
                return this;
            }

            public Builder setBgStyle(BgStyle.Builder builder) {
                copyOnWrite();
                ((UserWithBgColorSocketNotification) this.instance).setBgStyle(builder);
                return this;
            }

            public Builder setIcon(IconStyle.Builder builder) {
                copyOnWrite();
                ((UserWithBgColorSocketNotification) this.instance).setIcon(builder);
                return this;
            }

            public Builder setJump(JumpStyle.Builder builder) {
                copyOnWrite();
                ((UserWithBgColorSocketNotification) this.instance).setJump(builder);
                return this;
            }
        }

        public static UserWithBgColorSocketNotification parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (UserWithBgColorSocketNotification) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static UserWithBgColorSocketNotification parseFrom(byte[] bArr, C3433h c3433h) throws InvalidProtocolBufferException {
            return (UserWithBgColorSocketNotification) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, c3433h);
        }

        public static UserWithBgColorSocketNotification parseFrom(InputStream inputStream) throws IOException {
            return (UserWithBgColorSocketNotification) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static UserWithBgColorSocketNotification parseFrom(InputStream inputStream, C3433h c3433h) throws IOException {
            return (UserWithBgColorSocketNotification) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, c3433h);
        }

        public static UserWithBgColorSocketNotification parseFrom(C3430e c3430e) throws IOException {
            return (UserWithBgColorSocketNotification) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, c3430e);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static UserWithBgColorSocketNotification parseFrom(C3430e c3430e, C3433h c3433h) throws IOException {
            return (UserWithBgColorSocketNotification) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, c3430e, c3433h);
        }
    }
}
