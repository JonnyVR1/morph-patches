package com.p046p1.mobile.longlink.msg.liveroom;

import com.google.protobuf.AbstractC3403a;
import com.google.protobuf.ByteString;
import com.google.protobuf.C3407e;
import com.google.protobuf.C3410h;
import com.google.protobuf.C3414l;
import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InterfaceC3419q;
import com.google.protobuf.InvalidProtocolBufferException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Collections;
import java.util.List;
import org.spongycastle.asn1.eac.EACTags;
import org.spongycastle.crypto.tls.CipherSuite;
import p149l.aag0;
import p149l.bz00;
import p149l.i860;
import p149l.o6z;

/* JADX INFO: loaded from: classes8.dex */
public final class LongLinkLiveBottomPopup {

    /* JADX INFO: renamed from: com.p1.mobile.longlink.msg.liveroom.LongLinkLiveBottomPopup$1 */
    public static /* synthetic */ class C44741 {

        /* JADX INFO: renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f15969xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f15969xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f15969xa1df5c61[GeneratedMessageLite.MethodToInvoke.IS_INITIALIZED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f15969xa1df5c61[GeneratedMessageLite.MethodToInvoke.MAKE_IMMUTABLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f15969xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f15969xa1df5c61[GeneratedMessageLite.MethodToInvoke.VISIT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f15969xa1df5c61[GeneratedMessageLite.MethodToInvoke.MERGE_FROM_STREAM.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f15969xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f15969xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    public interface LiveBottomContentOrBuilder extends o6z {
        LiveBottomCountdownOverActionEnum getCountDownOverAction();

        int getCountDownOverActionValue();

        long getCountdownCurrentTime();

        long getCountdownEndTime();

        @Override // p149l.o6z
        /* synthetic */ InterfaceC3419q getDefaultInstanceForType();

        String getText();

        ByteString getTextBytes();

        String getTextColor();

        ByteString getTextColorBytes();

        LiveBottomContentTypeEnum getType();

        int getTypeValue();

        String getUrl();

        ByteString getUrlBytes();

        @Override // p149l.o6z
        /* synthetic */ boolean isInitialized();
    }

    public interface LiveBottomPopupButtonOrBuilder extends o6z {
        @Override // p149l.o6z
        /* synthetic */ InterfaceC3419q getDefaultInstanceForType();

        String getEndAfterColor();

        ByteString getEndAfterColorBytes();

        String getEndColor();

        ByteString getEndColorBytes();

        String getJumpSchema();

        ByteString getJumpSchemaBytes();

        LiveBottomPopupButton.LiveBottomPopupButtonJumpType getJumpType();

        int getJumpTypeValue();

        LiveBottomContent getRichText(int i);

        int getRichTextCount();

        List<LiveBottomContent> getRichTextList();

        String getStartAfterColor();

        ByteString getStartAfterColorBytes();

        String getStartColor();

        ByteString getStartColorBytes();

        String getText();

        ByteString getTextBytes();

        String getTextColor();

        ByteString getTextColorBytes();

        @Override // p149l.o6z
        /* synthetic */ boolean isInitialized();
    }

    public interface LiveBottomPopupHeaderOrBuilder extends o6z {
        @Override // p149l.o6z
        /* synthetic */ InterfaceC3419q getDefaultInstanceForType();

        LiveBottomPopupHeader.Position getPosition();

        int getPositionValue();

        String getTextColor();

        ByteString getTextColorBytes();

        @Override // p149l.o6z
        /* synthetic */ boolean isInitialized();
    }

    public interface LiveBottomPopupOrBuilder extends o6z {
        String getBackgroundColor();

        ByteString getBackgroundColorBytes();

        boolean getBlankClose();

        LiveBottomPopupButton getButton();

        String getContent();

        ByteString getContentBytes();

        String getContentColor();

        ByteString getContentColorBytes();

        @Override // p149l.o6z
        /* synthetic */ InterfaceC3419q getDefaultInstanceForType();

        LiveBottomContent getDescriptions(int i);

        int getDescriptionsCount();

        List<LiveBottomContent> getDescriptionsList();

        String getExtra();

        ByteString getExtraBytes();

        LiveBottomPopupHeader getHeader();

        String getIconUrl();

        ByteString getIconUrlBytes();

        long getRemainDuration();

        LiveBottomPopupRemind getRemind();

        boolean getShowClose();

        String getSource();

        ByteString getSourceBytes();

        LiveBottomPopupStyleTypeEnum getStyleType();

        int getStyleTypeValue();

        String getTitle();

        ByteString getTitleBytes();

        LiveBottomPopupToast getToast();

        String getType();

        ByteString getTypeBytes();

        LiveBottomWindown getWindow(int i);

        int getWindowCount();

        List<LiveBottomWindown> getWindowList();

        boolean hasButton();

        boolean hasHeader();

        boolean hasRemind();

        boolean hasToast();

        @Override // p149l.o6z
        /* synthetic */ boolean isInitialized();
    }

    public interface LiveBottomPopupRemindOrBuilder extends o6z {
        boolean getClick();

        @Override // p149l.o6z
        /* synthetic */ InterfaceC3419q getDefaultInstanceForType();

        boolean getShow();

        String getTextColor();

        ByteString getTextColorBytes();

        @Override // p149l.o6z
        /* synthetic */ boolean isInitialized();
    }

    public interface LiveBottomPopupToastOrBuilder extends o6z {
        @Override // p149l.o6z
        /* synthetic */ InterfaceC3419q getDefaultInstanceForType();

        String getFailText();

        ByteString getFailTextBytes();

        String getSuccessText();

        ByteString getSuccessTextBytes();

        @Override // p149l.o6z
        /* synthetic */ boolean isInitialized();
    }

    public interface LiveBottomWindownOrBuilder extends o6z {
        String getBackgroundColor();

        ByteString getBackgroundColorBytes();

        @Override // p149l.o6z
        /* synthetic */ InterfaceC3419q getDefaultInstanceForType();

        String getPicture();

        ByteString getPictureBytes();

        LiveBottomContent getText(int i);

        int getTextCount();

        List<LiveBottomContent> getTextList();

        @Override // p149l.o6z
        /* synthetic */ boolean isInitialized();
    }

    public interface VideoLiveToastOrBuilder extends o6z {
        @Override // p149l.o6z
        /* synthetic */ InterfaceC3419q getDefaultInstanceForType();

        String getRoomId();

        ByteString getRoomIdBytes();

        String getToast();

        ByteString getToastBytes();

        @Override // p149l.o6z
        /* synthetic */ boolean isInitialized();
    }

    private LongLinkLiveBottomPopup() {
    }

    public static void registerAllExtensions(C3410h c3410h) {
    }

    public static final class LiveBottomPopupButton extends GeneratedMessageLite<LiveBottomPopupButton, Builder> implements LiveBottomPopupButtonOrBuilder {
        private static final LiveBottomPopupButton DEFAULT_INSTANCE;
        public static final int ENDAFTERCOLOR_FIELD_NUMBER = 8;
        public static final int ENDCOLOR_FIELD_NUMBER = 4;
        public static final int JUMPSCHEMA_FIELD_NUMBER = 6;
        public static final int JUMPTYPE_FIELD_NUMBER = 5;
        private static volatile i860<LiveBottomPopupButton> PARSER = null;
        public static final int RICHTEXT_FIELD_NUMBER = 9;
        public static final int STARTAFTERCOLOR_FIELD_NUMBER = 7;
        public static final int STARTCOLOR_FIELD_NUMBER = 3;
        public static final int TEXTCOLOR_FIELD_NUMBER = 2;
        public static final int TEXT_FIELD_NUMBER = 1;
        private int bitField0_;
        private int jumpType_;
        private String text_ = "";
        private String textColor_ = "";
        private String startColor_ = "";
        private String endColor_ = "";
        private String jumpSchema_ = "";
        private String startAfterColor_ = "";
        private String endAfterColor_ = "";
        private C3414l.h<LiveBottomContent> richText_ = GeneratedMessageLite.emptyProtobufList();

        static {
            LiveBottomPopupButton liveBottomPopupButton = new LiveBottomPopupButton();
            DEFAULT_INSTANCE = liveBottomPopupButton;
            liveBottomPopupButton.makeImmutable();
        }

        private LiveBottomPopupButton() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllRichText(Iterable<? extends LiveBottomContent> iterable) {
            ensureRichTextIsMutable();
            AbstractC3403a.addAll(iterable, this.richText_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addRichText(LiveBottomContent.Builder builder) {
            ensureRichTextIsMutable();
            this.richText_.add(builder.build());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearEndAfterColor() {
            this.endAfterColor_ = getDefaultInstance().getEndAfterColor();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearEndColor() {
            this.endColor_ = getDefaultInstance().getEndColor();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearJumpSchema() {
            this.jumpSchema_ = getDefaultInstance().getJumpSchema();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearJumpType() {
            this.jumpType_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearRichText() {
            this.richText_ = GeneratedMessageLite.emptyProtobufList();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearStartAfterColor() {
            this.startAfterColor_ = getDefaultInstance().getStartAfterColor();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearStartColor() {
            this.startColor_ = getDefaultInstance().getStartColor();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearText() {
            this.text_ = getDefaultInstance().getText();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearTextColor() {
            this.textColor_ = getDefaultInstance().getTextColor();
        }

        private void ensureRichTextIsMutable() {
            if (this.richText_.mo17085q()) {
                return;
            }
            this.richText_ = GeneratedMessageLite.mutableCopy(this.richText_);
        }

        public static LiveBottomPopupButton getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder(LiveBottomPopupButton liveBottomPopupButton) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(liveBottomPopupButton);
        }

        public static LiveBottomPopupButton parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (LiveBottomPopupButton) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static LiveBottomPopupButton parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (LiveBottomPopupButton) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static i860<LiveBottomPopupButton> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void removeRichText(int i) {
            ensureRichTextIsMutable();
            this.richText_.remove(i);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setEndAfterColor(String str) {
            str.getClass();
            this.endAfterColor_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setEndAfterColorBytes(ByteString byteString) {
            byteString.getClass();
            AbstractC3403a.checkByteStringIsUtf8(byteString);
            this.endAfterColor_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setEndColor(String str) {
            str.getClass();
            this.endColor_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setEndColorBytes(ByteString byteString) {
            byteString.getClass();
            AbstractC3403a.checkByteStringIsUtf8(byteString);
            this.endColor_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setJumpSchema(String str) {
            str.getClass();
            this.jumpSchema_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setJumpSchemaBytes(ByteString byteString) {
            byteString.getClass();
            AbstractC3403a.checkByteStringIsUtf8(byteString);
            this.jumpSchema_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setJumpType(LiveBottomPopupButtonJumpType liveBottomPopupButtonJumpType) {
            liveBottomPopupButtonJumpType.getClass();
            this.jumpType_ = liveBottomPopupButtonJumpType.getNumber();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setJumpTypeValue(int i) {
            this.jumpType_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setRichText(int i, LiveBottomContent.Builder builder) {
            ensureRichTextIsMutable();
            this.richText_.set(i, builder.build());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setStartAfterColor(String str) {
            str.getClass();
            this.startAfterColor_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setStartAfterColorBytes(ByteString byteString) {
            byteString.getClass();
            AbstractC3403a.checkByteStringIsUtf8(byteString);
            this.startAfterColor_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setStartColor(String str) {
            str.getClass();
            this.startColor_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setStartColorBytes(ByteString byteString) {
            byteString.getClass();
            AbstractC3403a.checkByteStringIsUtf8(byteString);
            this.startColor_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setText(String str) {
            str.getClass();
            this.text_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTextBytes(ByteString byteString) {
            byteString.getClass();
            AbstractC3403a.checkByteStringIsUtf8(byteString);
            this.text_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTextColor(String str) {
            str.getClass();
            this.textColor_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTextColorBytes(ByteString byteString) {
            byteString.getClass();
            AbstractC3403a.checkByteStringIsUtf8(byteString);
            this.textColor_ = byteString.toStringUtf8();
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            boolean z = false;
            switch (C44741.f15969xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new LiveBottomPopupButton();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                    this.richText_.mo17084n();
                    return null;
                case 4:
                    return new Builder();
                case 5:
                    GeneratedMessageLite.InterfaceC3386h interfaceC3386h = (GeneratedMessageLite.InterfaceC3386h) obj;
                    LiveBottomPopupButton liveBottomPopupButton = (LiveBottomPopupButton) obj2;
                    this.text_ = interfaceC3386h.mo16997f(!this.text_.isEmpty(), this.text_, !liveBottomPopupButton.text_.isEmpty(), liveBottomPopupButton.text_);
                    this.textColor_ = interfaceC3386h.mo16997f(!this.textColor_.isEmpty(), this.textColor_, !liveBottomPopupButton.textColor_.isEmpty(), liveBottomPopupButton.textColor_);
                    this.startColor_ = interfaceC3386h.mo16997f(!this.startColor_.isEmpty(), this.startColor_, !liveBottomPopupButton.startColor_.isEmpty(), liveBottomPopupButton.startColor_);
                    this.endColor_ = interfaceC3386h.mo16997f(!this.endColor_.isEmpty(), this.endColor_, !liveBottomPopupButton.endColor_.isEmpty(), liveBottomPopupButton.endColor_);
                    int i = this.jumpType_;
                    boolean z2 = i != 0;
                    int i2 = liveBottomPopupButton.jumpType_;
                    this.jumpType_ = interfaceC3386h.mo16996e(z2, i, i2 != 0, i2);
                    this.jumpSchema_ = interfaceC3386h.mo16997f(!this.jumpSchema_.isEmpty(), this.jumpSchema_, !liveBottomPopupButton.jumpSchema_.isEmpty(), liveBottomPopupButton.jumpSchema_);
                    this.startAfterColor_ = interfaceC3386h.mo16997f(!this.startAfterColor_.isEmpty(), this.startAfterColor_, !liveBottomPopupButton.startAfterColor_.isEmpty(), liveBottomPopupButton.startAfterColor_);
                    this.endAfterColor_ = interfaceC3386h.mo16997f(!this.endAfterColor_.isEmpty(), this.endAfterColor_, !liveBottomPopupButton.endAfterColor_.isEmpty(), liveBottomPopupButton.endAfterColor_);
                    this.richText_ = interfaceC3386h.mo16998g(this.richText_, liveBottomPopupButton.richText_);
                    if (interfaceC3386h == GeneratedMessageLite.C3385g.INSTANCE) {
                        this.bitField0_ |= liveBottomPopupButton.bitField0_;
                    }
                    return this;
                case 6:
                    C3407e c3407e = (C3407e) obj;
                    C3410h c3410h = (C3410h) obj2;
                    while (!z) {
                        try {
                            int iM17116M = c3407e.m17116M();
                            if (iM17116M != 0) {
                                if (iM17116M == 10) {
                                    this.text_ = c3407e.m17115L();
                                } else if (iM17116M == 18) {
                                    this.textColor_ = c3407e.m17115L();
                                } else if (iM17116M == 26) {
                                    this.startColor_ = c3407e.m17115L();
                                } else if (iM17116M == 34) {
                                    this.endColor_ = c3407e.m17115L();
                                } else if (iM17116M == 40) {
                                    this.jumpType_ = c3407e.m17136p();
                                } else if (iM17116M == 50) {
                                    this.jumpSchema_ = c3407e.m17115L();
                                } else if (iM17116M == 58) {
                                    this.startAfterColor_ = c3407e.m17115L();
                                } else if (iM17116M == 66) {
                                    this.endAfterColor_ = c3407e.m17115L();
                                } else if (iM17116M == 74) {
                                    if (!this.richText_.mo17085q()) {
                                        this.richText_ = GeneratedMessageLite.mutableCopy(this.richText_);
                                    }
                                    this.richText_.add((LiveBottomContent) c3407e.m17143w(LiveBottomContent.parser(), c3410h));
                                } else if (!c3407e.m17121R(iM17116M)) {
                                }
                            }
                            z = true;
                        } catch (InvalidProtocolBufferException e) {
                            aag0.m95543a(e.setUnfinishedMessage(this));
                            return null;
                        } catch (IOException e2) {
                            aag0.m95543a(new InvalidProtocolBufferException(e2.getMessage()).setUnfinishedMessage(this));
                            return null;
                        }
                    }
                    break;
                case 7:
                    break;
                case 8:
                    if (PARSER == null) {
                        synchronized (LiveBottomPopupButton.class) {
                            try {
                                if (PARSER == null) {
                                    PARSER = new GeneratedMessageLite.C3381c(DEFAULT_INSTANCE);
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                            break;
                        }
                    }
                    return PARSER;
                default:
                    bz00.m104536a();
                    return null;
            }
            return DEFAULT_INSTANCE;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkLiveBottomPopup.LiveBottomPopupButtonOrBuilder
        public String getEndAfterColor() {
            return this.endAfterColor_;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkLiveBottomPopup.LiveBottomPopupButtonOrBuilder
        public ByteString getEndAfterColorBytes() {
            return ByteString.copyFromUtf8(this.endAfterColor_);
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkLiveBottomPopup.LiveBottomPopupButtonOrBuilder
        public String getEndColor() {
            return this.endColor_;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkLiveBottomPopup.LiveBottomPopupButtonOrBuilder
        public ByteString getEndColorBytes() {
            return ByteString.copyFromUtf8(this.endColor_);
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkLiveBottomPopup.LiveBottomPopupButtonOrBuilder
        public String getJumpSchema() {
            return this.jumpSchema_;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkLiveBottomPopup.LiveBottomPopupButtonOrBuilder
        public ByteString getJumpSchemaBytes() {
            return ByteString.copyFromUtf8(this.jumpSchema_);
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkLiveBottomPopup.LiveBottomPopupButtonOrBuilder
        public LiveBottomPopupButtonJumpType getJumpType() {
            LiveBottomPopupButtonJumpType liveBottomPopupButtonJumpTypeForNumber = LiveBottomPopupButtonJumpType.forNumber(this.jumpType_);
            return liveBottomPopupButtonJumpTypeForNumber == null ? LiveBottomPopupButtonJumpType.UNRECOGNIZED : liveBottomPopupButtonJumpTypeForNumber;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkLiveBottomPopup.LiveBottomPopupButtonOrBuilder
        public int getJumpTypeValue() {
            return this.jumpType_;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkLiveBottomPopup.LiveBottomPopupButtonOrBuilder
        public LiveBottomContent getRichText(int i) {
            return this.richText_.get(i);
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkLiveBottomPopup.LiveBottomPopupButtonOrBuilder
        public int getRichTextCount() {
            return this.richText_.size();
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkLiveBottomPopup.LiveBottomPopupButtonOrBuilder
        public List<LiveBottomContent> getRichTextList() {
            return this.richText_;
        }

        public LiveBottomContentOrBuilder getRichTextOrBuilder(int i) {
            return this.richText_.get(i);
        }

        public List<? extends LiveBottomContentOrBuilder> getRichTextOrBuilderList() {
            return this.richText_;
        }

        @Override // com.google.protobuf.InterfaceC3419q
        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int iM16901K = !this.text_.isEmpty() ? CodedOutputStream.m16901K(1, getText()) : 0;
            if (!this.textColor_.isEmpty()) {
                iM16901K += CodedOutputStream.m16901K(2, getTextColor());
            }
            if (!this.startColor_.isEmpty()) {
                iM16901K += CodedOutputStream.m16901K(3, getStartColor());
            }
            if (!this.endColor_.isEmpty()) {
                iM16901K += CodedOutputStream.m16901K(4, getEndColor());
            }
            if (this.jumpType_ != LiveBottomPopupButtonJumpType.url.getNumber()) {
                iM16901K += CodedOutputStream.m16922m(5, this.jumpType_);
            }
            if (!this.jumpSchema_.isEmpty()) {
                iM16901K += CodedOutputStream.m16901K(6, getJumpSchema());
            }
            if (!this.startAfterColor_.isEmpty()) {
                iM16901K += CodedOutputStream.m16901K(7, getStartAfterColor());
            }
            if (!this.endAfterColor_.isEmpty()) {
                iM16901K += CodedOutputStream.m16901K(8, getEndAfterColor());
            }
            for (int i2 = 0; i2 < this.richText_.size(); i2++) {
                iM16901K += CodedOutputStream.m16893C(9, this.richText_.get(i2));
            }
            this.memoizedSerializedSize = iM16901K;
            return iM16901K;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkLiveBottomPopup.LiveBottomPopupButtonOrBuilder
        public String getStartAfterColor() {
            return this.startAfterColor_;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkLiveBottomPopup.LiveBottomPopupButtonOrBuilder
        public ByteString getStartAfterColorBytes() {
            return ByteString.copyFromUtf8(this.startAfterColor_);
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkLiveBottomPopup.LiveBottomPopupButtonOrBuilder
        public String getStartColor() {
            return this.startColor_;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkLiveBottomPopup.LiveBottomPopupButtonOrBuilder
        public ByteString getStartColorBytes() {
            return ByteString.copyFromUtf8(this.startColor_);
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkLiveBottomPopup.LiveBottomPopupButtonOrBuilder
        public String getText() {
            return this.text_;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkLiveBottomPopup.LiveBottomPopupButtonOrBuilder
        public ByteString getTextBytes() {
            return ByteString.copyFromUtf8(this.text_);
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkLiveBottomPopup.LiveBottomPopupButtonOrBuilder
        public String getTextColor() {
            return this.textColor_;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkLiveBottomPopup.LiveBottomPopupButtonOrBuilder
        public ByteString getTextColorBytes() {
            return ByteString.copyFromUtf8(this.textColor_);
        }

        @Override // com.google.protobuf.InterfaceC3419q
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (!this.text_.isEmpty()) {
                codedOutputStream.mo16939D0(1, getText());
            }
            if (!this.textColor_.isEmpty()) {
                codedOutputStream.mo16939D0(2, getTextColor());
            }
            if (!this.startColor_.isEmpty()) {
                codedOutputStream.mo16939D0(3, getStartColor());
            }
            if (!this.endColor_.isEmpty()) {
                codedOutputStream.mo16939D0(4, getEndColor());
            }
            if (this.jumpType_ != LiveBottomPopupButtonJumpType.url.getNumber()) {
                codedOutputStream.m16960i0(5, this.jumpType_);
            }
            if (!this.jumpSchema_.isEmpty()) {
                codedOutputStream.mo16939D0(6, getJumpSchema());
            }
            if (!this.startAfterColor_.isEmpty()) {
                codedOutputStream.mo16939D0(7, getStartAfterColor());
            }
            if (!this.endAfterColor_.isEmpty()) {
                codedOutputStream.mo16939D0(8, getEndAfterColor());
            }
            for (int i = 0; i < this.richText_.size(); i++) {
                codedOutputStream.mo16974w0(9, this.richText_.get(i));
            }
        }

        public enum LiveBottomPopupButtonJumpType implements C3414l.c {
            url(0),
            schema(1),
            UNRECOGNIZED(-1);

            private static final C3414l.d<LiveBottomPopupButtonJumpType> internalValueMap = new C3414l.d<LiveBottomPopupButtonJumpType>() { // from class: com.p1.mobile.longlink.msg.liveroom.LongLinkLiveBottomPopup.LiveBottomPopupButton.LiveBottomPopupButtonJumpType.1
                @Override // com.google.protobuf.C3414l.d
                public LiveBottomPopupButtonJumpType findValueByNumber(int i) {
                    return LiveBottomPopupButtonJumpType.forNumber(i);
                }
            };
            public static final int schema_VALUE = 1;
            public static final int url_VALUE = 0;
            private final int value;

            LiveBottomPopupButtonJumpType(int i) {
                this.value = i;
            }

            public static LiveBottomPopupButtonJumpType forNumber(int i) {
                if (i == 0) {
                    return url;
                }
                if (i != 1) {
                    return null;
                }
                return schema;
            }

            public static C3414l.d<LiveBottomPopupButtonJumpType> internalGetValueMap() {
                return internalValueMap;
            }

            @Override // com.google.protobuf.C3414l.c
            public final int getNumber() {
                return this.value;
            }

            @Deprecated
            public static LiveBottomPopupButtonJumpType valueOf(int i) {
                return forNumber(i);
            }
        }

        public static LiveBottomPopupButton parseDelimitedFrom(InputStream inputStream, C3410h c3410h) throws IOException {
            return (LiveBottomPopupButton) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, c3410h);
        }

        public static LiveBottomPopupButton parseFrom(ByteString byteString, C3410h c3410h) throws InvalidProtocolBufferException {
            return (LiveBottomPopupButton) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, c3410h);
        }

        public static final class Builder extends GeneratedMessageLite.AbstractC3380b<LiveBottomPopupButton, Builder> implements LiveBottomPopupButtonOrBuilder {
            private Builder() {
                super(LiveBottomPopupButton.DEFAULT_INSTANCE);
            }

            public Builder addAllRichText(Iterable<? extends LiveBottomContent> iterable) {
                copyOnWrite();
                ((LiveBottomPopupButton) this.instance).addAllRichText(iterable);
                return this;
            }

            public Builder addRichText(LiveBottomContent liveBottomContent) {
                copyOnWrite();
                ((LiveBottomPopupButton) this.instance).addRichText(liveBottomContent);
                return this;
            }

            public Builder clearEndAfterColor() {
                copyOnWrite();
                ((LiveBottomPopupButton) this.instance).clearEndAfterColor();
                return this;
            }

            public Builder clearEndColor() {
                copyOnWrite();
                ((LiveBottomPopupButton) this.instance).clearEndColor();
                return this;
            }

            public Builder clearJumpSchema() {
                copyOnWrite();
                ((LiveBottomPopupButton) this.instance).clearJumpSchema();
                return this;
            }

            public Builder clearJumpType() {
                copyOnWrite();
                ((LiveBottomPopupButton) this.instance).clearJumpType();
                return this;
            }

            public Builder clearRichText() {
                copyOnWrite();
                ((LiveBottomPopupButton) this.instance).clearRichText();
                return this;
            }

            public Builder clearStartAfterColor() {
                copyOnWrite();
                ((LiveBottomPopupButton) this.instance).clearStartAfterColor();
                return this;
            }

            public Builder clearStartColor() {
                copyOnWrite();
                ((LiveBottomPopupButton) this.instance).clearStartColor();
                return this;
            }

            public Builder clearText() {
                copyOnWrite();
                ((LiveBottomPopupButton) this.instance).clearText();
                return this;
            }

            public Builder clearTextColor() {
                copyOnWrite();
                ((LiveBottomPopupButton) this.instance).clearTextColor();
                return this;
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkLiveBottomPopup.LiveBottomPopupButtonOrBuilder
            public String getEndAfterColor() {
                return ((LiveBottomPopupButton) this.instance).getEndAfterColor();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkLiveBottomPopup.LiveBottomPopupButtonOrBuilder
            public ByteString getEndAfterColorBytes() {
                return ((LiveBottomPopupButton) this.instance).getEndAfterColorBytes();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkLiveBottomPopup.LiveBottomPopupButtonOrBuilder
            public String getEndColor() {
                return ((LiveBottomPopupButton) this.instance).getEndColor();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkLiveBottomPopup.LiveBottomPopupButtonOrBuilder
            public ByteString getEndColorBytes() {
                return ((LiveBottomPopupButton) this.instance).getEndColorBytes();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkLiveBottomPopup.LiveBottomPopupButtonOrBuilder
            public String getJumpSchema() {
                return ((LiveBottomPopupButton) this.instance).getJumpSchema();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkLiveBottomPopup.LiveBottomPopupButtonOrBuilder
            public ByteString getJumpSchemaBytes() {
                return ((LiveBottomPopupButton) this.instance).getJumpSchemaBytes();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkLiveBottomPopup.LiveBottomPopupButtonOrBuilder
            public LiveBottomPopupButtonJumpType getJumpType() {
                return ((LiveBottomPopupButton) this.instance).getJumpType();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkLiveBottomPopup.LiveBottomPopupButtonOrBuilder
            public int getJumpTypeValue() {
                return ((LiveBottomPopupButton) this.instance).getJumpTypeValue();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkLiveBottomPopup.LiveBottomPopupButtonOrBuilder
            public LiveBottomContent getRichText(int i) {
                return ((LiveBottomPopupButton) this.instance).getRichText(i);
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkLiveBottomPopup.LiveBottomPopupButtonOrBuilder
            public int getRichTextCount() {
                return ((LiveBottomPopupButton) this.instance).getRichTextCount();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkLiveBottomPopup.LiveBottomPopupButtonOrBuilder
            public List<LiveBottomContent> getRichTextList() {
                return Collections.unmodifiableList(((LiveBottomPopupButton) this.instance).getRichTextList());
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkLiveBottomPopup.LiveBottomPopupButtonOrBuilder
            public String getStartAfterColor() {
                return ((LiveBottomPopupButton) this.instance).getStartAfterColor();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkLiveBottomPopup.LiveBottomPopupButtonOrBuilder
            public ByteString getStartAfterColorBytes() {
                return ((LiveBottomPopupButton) this.instance).getStartAfterColorBytes();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkLiveBottomPopup.LiveBottomPopupButtonOrBuilder
            public String getStartColor() {
                return ((LiveBottomPopupButton) this.instance).getStartColor();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkLiveBottomPopup.LiveBottomPopupButtonOrBuilder
            public ByteString getStartColorBytes() {
                return ((LiveBottomPopupButton) this.instance).getStartColorBytes();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkLiveBottomPopup.LiveBottomPopupButtonOrBuilder
            public String getText() {
                return ((LiveBottomPopupButton) this.instance).getText();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkLiveBottomPopup.LiveBottomPopupButtonOrBuilder
            public ByteString getTextBytes() {
                return ((LiveBottomPopupButton) this.instance).getTextBytes();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkLiveBottomPopup.LiveBottomPopupButtonOrBuilder
            public String getTextColor() {
                return ((LiveBottomPopupButton) this.instance).getTextColor();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkLiveBottomPopup.LiveBottomPopupButtonOrBuilder
            public ByteString getTextColorBytes() {
                return ((LiveBottomPopupButton) this.instance).getTextColorBytes();
            }

            public Builder removeRichText(int i) {
                copyOnWrite();
                ((LiveBottomPopupButton) this.instance).removeRichText(i);
                return this;
            }

            public Builder setEndAfterColor(String str) {
                copyOnWrite();
                ((LiveBottomPopupButton) this.instance).setEndAfterColor(str);
                return this;
            }

            public Builder setEndAfterColorBytes(ByteString byteString) {
                copyOnWrite();
                ((LiveBottomPopupButton) this.instance).setEndAfterColorBytes(byteString);
                return this;
            }

            public Builder setEndColor(String str) {
                copyOnWrite();
                ((LiveBottomPopupButton) this.instance).setEndColor(str);
                return this;
            }

            public Builder setEndColorBytes(ByteString byteString) {
                copyOnWrite();
                ((LiveBottomPopupButton) this.instance).setEndColorBytes(byteString);
                return this;
            }

            public Builder setJumpSchema(String str) {
                copyOnWrite();
                ((LiveBottomPopupButton) this.instance).setJumpSchema(str);
                return this;
            }

            public Builder setJumpSchemaBytes(ByteString byteString) {
                copyOnWrite();
                ((LiveBottomPopupButton) this.instance).setJumpSchemaBytes(byteString);
                return this;
            }

            public Builder setJumpType(LiveBottomPopupButtonJumpType liveBottomPopupButtonJumpType) {
                copyOnWrite();
                ((LiveBottomPopupButton) this.instance).setJumpType(liveBottomPopupButtonJumpType);
                return this;
            }

            public Builder setJumpTypeValue(int i) {
                copyOnWrite();
                ((LiveBottomPopupButton) this.instance).setJumpTypeValue(i);
                return this;
            }

            public Builder setRichText(int i, LiveBottomContent liveBottomContent) {
                copyOnWrite();
                ((LiveBottomPopupButton) this.instance).setRichText(i, liveBottomContent);
                return this;
            }

            public Builder setStartAfterColor(String str) {
                copyOnWrite();
                ((LiveBottomPopupButton) this.instance).setStartAfterColor(str);
                return this;
            }

            public Builder setStartAfterColorBytes(ByteString byteString) {
                copyOnWrite();
                ((LiveBottomPopupButton) this.instance).setStartAfterColorBytes(byteString);
                return this;
            }

            public Builder setStartColor(String str) {
                copyOnWrite();
                ((LiveBottomPopupButton) this.instance).setStartColor(str);
                return this;
            }

            public Builder setStartColorBytes(ByteString byteString) {
                copyOnWrite();
                ((LiveBottomPopupButton) this.instance).setStartColorBytes(byteString);
                return this;
            }

            public Builder setText(String str) {
                copyOnWrite();
                ((LiveBottomPopupButton) this.instance).setText(str);
                return this;
            }

            public Builder setTextBytes(ByteString byteString) {
                copyOnWrite();
                ((LiveBottomPopupButton) this.instance).setTextBytes(byteString);
                return this;
            }

            public Builder setTextColor(String str) {
                copyOnWrite();
                ((LiveBottomPopupButton) this.instance).setTextColor(str);
                return this;
            }

            public Builder setTextColorBytes(ByteString byteString) {
                copyOnWrite();
                ((LiveBottomPopupButton) this.instance).setTextColorBytes(byteString);
                return this;
            }

            public Builder addRichText(int i, LiveBottomContent liveBottomContent) {
                copyOnWrite();
                ((LiveBottomPopupButton) this.instance).addRichText(i, liveBottomContent);
                return this;
            }

            public Builder setRichText(int i, LiveBottomContent.Builder builder) {
                copyOnWrite();
                ((LiveBottomPopupButton) this.instance).setRichText(i, builder);
                return this;
            }

            public Builder addRichText(LiveBottomContent.Builder builder) {
                copyOnWrite();
                ((LiveBottomPopupButton) this.instance).addRichText(builder);
                return this;
            }

            public Builder addRichText(int i, LiveBottomContent.Builder builder) {
                copyOnWrite();
                ((LiveBottomPopupButton) this.instance).addRichText(i, builder);
                return this;
            }
        }

        public static LiveBottomPopupButton parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (LiveBottomPopupButton) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static LiveBottomPopupButton parseFrom(byte[] bArr, C3410h c3410h) throws InvalidProtocolBufferException {
            return (LiveBottomPopupButton) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, c3410h);
        }

        public static LiveBottomPopupButton parseFrom(InputStream inputStream) throws IOException {
            return (LiveBottomPopupButton) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static LiveBottomPopupButton parseFrom(InputStream inputStream, C3410h c3410h) throws IOException {
            return (LiveBottomPopupButton) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, c3410h);
        }

        public static LiveBottomPopupButton parseFrom(C3407e c3407e) throws IOException {
            return (LiveBottomPopupButton) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, c3407e);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addRichText(int i, LiveBottomContent liveBottomContent) {
            liveBottomContent.getClass();
            ensureRichTextIsMutable();
            this.richText_.add(i, liveBottomContent);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static LiveBottomPopupButton parseFrom(C3407e c3407e, C3410h c3410h) throws IOException {
            return (LiveBottomPopupButton) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, c3407e, c3410h);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setRichText(int i, LiveBottomContent liveBottomContent) {
            liveBottomContent.getClass();
            ensureRichTextIsMutable();
            this.richText_.set(i, liveBottomContent);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addRichText(LiveBottomContent liveBottomContent) {
            liveBottomContent.getClass();
            ensureRichTextIsMutable();
            this.richText_.add(liveBottomContent);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addRichText(int i, LiveBottomContent.Builder builder) {
            ensureRichTextIsMutable();
            this.richText_.add(i, builder.build());
        }
    }

    public static final class LiveBottomPopupHeader extends GeneratedMessageLite<LiveBottomPopupHeader, Builder> implements LiveBottomPopupHeaderOrBuilder {
        private static final LiveBottomPopupHeader DEFAULT_INSTANCE;
        private static volatile i860<LiveBottomPopupHeader> PARSER = null;
        public static final int POSITION_FIELD_NUMBER = 2;
        public static final int TEXTCOLOR_FIELD_NUMBER = 1;
        private int position_;
        private String textColor_ = "";

        public static final class Builder extends GeneratedMessageLite.AbstractC3380b<LiveBottomPopupHeader, Builder> implements LiveBottomPopupHeaderOrBuilder {
            private Builder() {
                super(LiveBottomPopupHeader.DEFAULT_INSTANCE);
            }

            public Builder clearPosition() {
                copyOnWrite();
                ((LiveBottomPopupHeader) this.instance).clearPosition();
                return this;
            }

            public Builder clearTextColor() {
                copyOnWrite();
                ((LiveBottomPopupHeader) this.instance).clearTextColor();
                return this;
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkLiveBottomPopup.LiveBottomPopupHeaderOrBuilder
            public Position getPosition() {
                return ((LiveBottomPopupHeader) this.instance).getPosition();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkLiveBottomPopup.LiveBottomPopupHeaderOrBuilder
            public int getPositionValue() {
                return ((LiveBottomPopupHeader) this.instance).getPositionValue();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkLiveBottomPopup.LiveBottomPopupHeaderOrBuilder
            public String getTextColor() {
                return ((LiveBottomPopupHeader) this.instance).getTextColor();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkLiveBottomPopup.LiveBottomPopupHeaderOrBuilder
            public ByteString getTextColorBytes() {
                return ((LiveBottomPopupHeader) this.instance).getTextColorBytes();
            }

            public Builder setPosition(Position position) {
                copyOnWrite();
                ((LiveBottomPopupHeader) this.instance).setPosition(position);
                return this;
            }

            public Builder setPositionValue(int i) {
                copyOnWrite();
                ((LiveBottomPopupHeader) this.instance).setPositionValue(i);
                return this;
            }

            public Builder setTextColor(String str) {
                copyOnWrite();
                ((LiveBottomPopupHeader) this.instance).setTextColor(str);
                return this;
            }

            public Builder setTextColorBytes(ByteString byteString) {
                copyOnWrite();
                ((LiveBottomPopupHeader) this.instance).setTextColorBytes(byteString);
                return this;
            }
        }

        static {
            LiveBottomPopupHeader liveBottomPopupHeader = new LiveBottomPopupHeader();
            DEFAULT_INSTANCE = liveBottomPopupHeader;
            liveBottomPopupHeader.makeImmutable();
        }

        private LiveBottomPopupHeader() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearPosition() {
            this.position_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearTextColor() {
            this.textColor_ = getDefaultInstance().getTextColor();
        }

        public static LiveBottomPopupHeader getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder(LiveBottomPopupHeader liveBottomPopupHeader) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(liveBottomPopupHeader);
        }

        public static LiveBottomPopupHeader parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (LiveBottomPopupHeader) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static LiveBottomPopupHeader parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (LiveBottomPopupHeader) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static i860<LiveBottomPopupHeader> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setPosition(Position position) {
            position.getClass();
            this.position_ = position.getNumber();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setPositionValue(int i) {
            this.position_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTextColor(String str) {
            str.getClass();
            this.textColor_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTextColorBytes(ByteString byteString) {
            byteString.getClass();
            AbstractC3403a.checkByteStringIsUtf8(byteString);
            this.textColor_ = byteString.toStringUtf8();
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            boolean z = false;
            switch (C44741.f15969xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new LiveBottomPopupHeader();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                    return null;
                case 4:
                    return new Builder();
                case 5:
                    GeneratedMessageLite.InterfaceC3386h interfaceC3386h = (GeneratedMessageLite.InterfaceC3386h) obj;
                    LiveBottomPopupHeader liveBottomPopupHeader = (LiveBottomPopupHeader) obj2;
                    this.textColor_ = interfaceC3386h.mo16997f(!this.textColor_.isEmpty(), this.textColor_, !liveBottomPopupHeader.textColor_.isEmpty(), liveBottomPopupHeader.textColor_);
                    int i = this.position_;
                    boolean z2 = i != 0;
                    int i2 = liveBottomPopupHeader.position_;
                    this.position_ = interfaceC3386h.mo16996e(z2, i, i2 != 0, i2);
                    GeneratedMessageLite.C3385g c3385g = GeneratedMessageLite.C3385g.INSTANCE;
                    return this;
                case 6:
                    C3407e c3407e = (C3407e) obj;
                    while (!z) {
                        try {
                            int iM17116M = c3407e.m17116M();
                            if (iM17116M != 0) {
                                if (iM17116M == 10) {
                                    this.textColor_ = c3407e.m17115L();
                                } else if (iM17116M == 16) {
                                    this.position_ = c3407e.m17136p();
                                } else if (!c3407e.m17121R(iM17116M)) {
                                }
                            }
                            z = true;
                        } catch (InvalidProtocolBufferException e) {
                            aag0.m95543a(e.setUnfinishedMessage(this));
                            return null;
                        } catch (IOException e2) {
                            aag0.m95543a(new InvalidProtocolBufferException(e2.getMessage()).setUnfinishedMessage(this));
                            return null;
                        }
                    }
                    break;
                case 7:
                    break;
                case 8:
                    if (PARSER == null) {
                        synchronized (LiveBottomPopupHeader.class) {
                            try {
                                if (PARSER == null) {
                                    PARSER = new GeneratedMessageLite.C3381c(DEFAULT_INSTANCE);
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                            break;
                        }
                    }
                    return PARSER;
                default:
                    bz00.m104536a();
                    return null;
            }
            return DEFAULT_INSTANCE;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkLiveBottomPopup.LiveBottomPopupHeaderOrBuilder
        public Position getPosition() {
            Position positionForNumber = Position.forNumber(this.position_);
            return positionForNumber == null ? Position.UNRECOGNIZED : positionForNumber;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkLiveBottomPopup.LiveBottomPopupHeaderOrBuilder
        public int getPositionValue() {
            return this.position_;
        }

        @Override // com.google.protobuf.InterfaceC3419q
        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int iM16901K = !this.textColor_.isEmpty() ? CodedOutputStream.m16901K(1, getTextColor()) : 0;
            if (this.position_ != Position.left.getNumber()) {
                iM16901K += CodedOutputStream.m16922m(2, this.position_);
            }
            this.memoizedSerializedSize = iM16901K;
            return iM16901K;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkLiveBottomPopup.LiveBottomPopupHeaderOrBuilder
        public String getTextColor() {
            return this.textColor_;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkLiveBottomPopup.LiveBottomPopupHeaderOrBuilder
        public ByteString getTextColorBytes() {
            return ByteString.copyFromUtf8(this.textColor_);
        }

        @Override // com.google.protobuf.InterfaceC3419q
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (!this.textColor_.isEmpty()) {
                codedOutputStream.mo16939D0(1, getTextColor());
            }
            if (this.position_ != Position.left.getNumber()) {
                codedOutputStream.m16960i0(2, this.position_);
            }
        }

        public enum Position implements C3414l.c {
            left(0),
            middle(1),
            UNRECOGNIZED(-1);

            private static final C3414l.d<Position> internalValueMap = new C3414l.d<Position>() { // from class: com.p1.mobile.longlink.msg.liveroom.LongLinkLiveBottomPopup.LiveBottomPopupHeader.Position.1
                @Override // com.google.protobuf.C3414l.d
                public Position findValueByNumber(int i) {
                    return Position.forNumber(i);
                }
            };
            public static final int left_VALUE = 0;
            public static final int middle_VALUE = 1;
            private final int value;

            Position(int i) {
                this.value = i;
            }

            public static Position forNumber(int i) {
                if (i == 0) {
                    return left;
                }
                if (i != 1) {
                    return null;
                }
                return middle;
            }

            public static C3414l.d<Position> internalGetValueMap() {
                return internalValueMap;
            }

            @Override // com.google.protobuf.C3414l.c
            public final int getNumber() {
                return this.value;
            }

            @Deprecated
            public static Position valueOf(int i) {
                return forNumber(i);
            }
        }

        public static LiveBottomPopupHeader parseDelimitedFrom(InputStream inputStream, C3410h c3410h) throws IOException {
            return (LiveBottomPopupHeader) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, c3410h);
        }

        public static LiveBottomPopupHeader parseFrom(ByteString byteString, C3410h c3410h) throws InvalidProtocolBufferException {
            return (LiveBottomPopupHeader) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, c3410h);
        }

        public static LiveBottomPopupHeader parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (LiveBottomPopupHeader) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static LiveBottomPopupHeader parseFrom(byte[] bArr, C3410h c3410h) throws InvalidProtocolBufferException {
            return (LiveBottomPopupHeader) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, c3410h);
        }

        public static LiveBottomPopupHeader parseFrom(InputStream inputStream) throws IOException {
            return (LiveBottomPopupHeader) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static LiveBottomPopupHeader parseFrom(InputStream inputStream, C3410h c3410h) throws IOException {
            return (LiveBottomPopupHeader) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, c3410h);
        }

        public static LiveBottomPopupHeader parseFrom(C3407e c3407e) throws IOException {
            return (LiveBottomPopupHeader) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, c3407e);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static LiveBottomPopupHeader parseFrom(C3407e c3407e, C3410h c3410h) throws IOException {
            return (LiveBottomPopupHeader) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, c3407e, c3410h);
        }
    }

    public static final class LiveBottomContent extends GeneratedMessageLite<LiveBottomContent, Builder> implements LiveBottomContentOrBuilder {
        public static final int COUNTDOWNCURRENTTIME_FIELD_NUMBER = 6;
        public static final int COUNTDOWNENDTIME_FIELD_NUMBER = 5;
        public static final int COUNTDOWNOVERACTION_FIELD_NUMBER = 7;
        private static final LiveBottomContent DEFAULT_INSTANCE;
        private static volatile i860<LiveBottomContent> PARSER = null;
        public static final int TEXTCOLOR_FIELD_NUMBER = 3;
        public static final int TEXT_FIELD_NUMBER = 2;
        public static final int TYPE_FIELD_NUMBER = 1;
        public static final int URL_FIELD_NUMBER = 4;
        private int countDownOverAction_;
        private long countdownCurrentTime_;
        private long countdownEndTime_;
        private int type_;
        private String text_ = "";
        private String textColor_ = "";
        private String url_ = "";

        public static final class Builder extends GeneratedMessageLite.AbstractC3380b<LiveBottomContent, Builder> implements LiveBottomContentOrBuilder {
            private Builder() {
                super(LiveBottomContent.DEFAULT_INSTANCE);
            }

            public Builder clearCountDownOverAction() {
                copyOnWrite();
                ((LiveBottomContent) this.instance).clearCountDownOverAction();
                return this;
            }

            public Builder clearCountdownCurrentTime() {
                copyOnWrite();
                ((LiveBottomContent) this.instance).clearCountdownCurrentTime();
                return this;
            }

            public Builder clearCountdownEndTime() {
                copyOnWrite();
                ((LiveBottomContent) this.instance).clearCountdownEndTime();
                return this;
            }

            public Builder clearText() {
                copyOnWrite();
                ((LiveBottomContent) this.instance).clearText();
                return this;
            }

            public Builder clearTextColor() {
                copyOnWrite();
                ((LiveBottomContent) this.instance).clearTextColor();
                return this;
            }

            public Builder clearType() {
                copyOnWrite();
                ((LiveBottomContent) this.instance).clearType();
                return this;
            }

            public Builder clearUrl() {
                copyOnWrite();
                ((LiveBottomContent) this.instance).clearUrl();
                return this;
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkLiveBottomPopup.LiveBottomContentOrBuilder
            public LiveBottomCountdownOverActionEnum getCountDownOverAction() {
                return ((LiveBottomContent) this.instance).getCountDownOverAction();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkLiveBottomPopup.LiveBottomContentOrBuilder
            public int getCountDownOverActionValue() {
                return ((LiveBottomContent) this.instance).getCountDownOverActionValue();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkLiveBottomPopup.LiveBottomContentOrBuilder
            public long getCountdownCurrentTime() {
                return ((LiveBottomContent) this.instance).getCountdownCurrentTime();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkLiveBottomPopup.LiveBottomContentOrBuilder
            public long getCountdownEndTime() {
                return ((LiveBottomContent) this.instance).getCountdownEndTime();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkLiveBottomPopup.LiveBottomContentOrBuilder
            public String getText() {
                return ((LiveBottomContent) this.instance).getText();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkLiveBottomPopup.LiveBottomContentOrBuilder
            public ByteString getTextBytes() {
                return ((LiveBottomContent) this.instance).getTextBytes();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkLiveBottomPopup.LiveBottomContentOrBuilder
            public String getTextColor() {
                return ((LiveBottomContent) this.instance).getTextColor();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkLiveBottomPopup.LiveBottomContentOrBuilder
            public ByteString getTextColorBytes() {
                return ((LiveBottomContent) this.instance).getTextColorBytes();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkLiveBottomPopup.LiveBottomContentOrBuilder
            public LiveBottomContentTypeEnum getType() {
                return ((LiveBottomContent) this.instance).getType();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkLiveBottomPopup.LiveBottomContentOrBuilder
            public int getTypeValue() {
                return ((LiveBottomContent) this.instance).getTypeValue();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkLiveBottomPopup.LiveBottomContentOrBuilder
            public String getUrl() {
                return ((LiveBottomContent) this.instance).getUrl();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkLiveBottomPopup.LiveBottomContentOrBuilder
            public ByteString getUrlBytes() {
                return ((LiveBottomContent) this.instance).getUrlBytes();
            }

            public Builder setCountDownOverAction(LiveBottomCountdownOverActionEnum liveBottomCountdownOverActionEnum) {
                copyOnWrite();
                ((LiveBottomContent) this.instance).setCountDownOverAction(liveBottomCountdownOverActionEnum);
                return this;
            }

            public Builder setCountDownOverActionValue(int i) {
                copyOnWrite();
                ((LiveBottomContent) this.instance).setCountDownOverActionValue(i);
                return this;
            }

            public Builder setCountdownCurrentTime(long j) {
                copyOnWrite();
                ((LiveBottomContent) this.instance).setCountdownCurrentTime(j);
                return this;
            }

            public Builder setCountdownEndTime(long j) {
                copyOnWrite();
                ((LiveBottomContent) this.instance).setCountdownEndTime(j);
                return this;
            }

            public Builder setText(String str) {
                copyOnWrite();
                ((LiveBottomContent) this.instance).setText(str);
                return this;
            }

            public Builder setTextBytes(ByteString byteString) {
                copyOnWrite();
                ((LiveBottomContent) this.instance).setTextBytes(byteString);
                return this;
            }

            public Builder setTextColor(String str) {
                copyOnWrite();
                ((LiveBottomContent) this.instance).setTextColor(str);
                return this;
            }

            public Builder setTextColorBytes(ByteString byteString) {
                copyOnWrite();
                ((LiveBottomContent) this.instance).setTextColorBytes(byteString);
                return this;
            }

            public Builder setType(LiveBottomContentTypeEnum liveBottomContentTypeEnum) {
                copyOnWrite();
                ((LiveBottomContent) this.instance).setType(liveBottomContentTypeEnum);
                return this;
            }

            public Builder setTypeValue(int i) {
                copyOnWrite();
                ((LiveBottomContent) this.instance).setTypeValue(i);
                return this;
            }

            public Builder setUrl(String str) {
                copyOnWrite();
                ((LiveBottomContent) this.instance).setUrl(str);
                return this;
            }

            public Builder setUrlBytes(ByteString byteString) {
                copyOnWrite();
                ((LiveBottomContent) this.instance).setUrlBytes(byteString);
                return this;
            }
        }

        static {
            LiveBottomContent liveBottomContent = new LiveBottomContent();
            DEFAULT_INSTANCE = liveBottomContent;
            liveBottomContent.makeImmutable();
        }

        private LiveBottomContent() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearCountDownOverAction() {
            this.countDownOverAction_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearCountdownCurrentTime() {
            this.countdownCurrentTime_ = 0L;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearCountdownEndTime() {
            this.countdownEndTime_ = 0L;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearText() {
            this.text_ = getDefaultInstance().getText();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearTextColor() {
            this.textColor_ = getDefaultInstance().getTextColor();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearType() {
            this.type_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearUrl() {
            this.url_ = getDefaultInstance().getUrl();
        }

        public static LiveBottomContent getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder(LiveBottomContent liveBottomContent) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(liveBottomContent);
        }

        public static LiveBottomContent parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (LiveBottomContent) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static LiveBottomContent parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (LiveBottomContent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static i860<LiveBottomContent> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setCountDownOverAction(LiveBottomCountdownOverActionEnum liveBottomCountdownOverActionEnum) {
            liveBottomCountdownOverActionEnum.getClass();
            this.countDownOverAction_ = liveBottomCountdownOverActionEnum.getNumber();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setCountDownOverActionValue(int i) {
            this.countDownOverAction_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setCountdownCurrentTime(long j) {
            this.countdownCurrentTime_ = j;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setCountdownEndTime(long j) {
            this.countdownEndTime_ = j;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setText(String str) {
            str.getClass();
            this.text_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTextBytes(ByteString byteString) {
            byteString.getClass();
            AbstractC3403a.checkByteStringIsUtf8(byteString);
            this.text_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTextColor(String str) {
            str.getClass();
            this.textColor_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTextColorBytes(ByteString byteString) {
            byteString.getClass();
            AbstractC3403a.checkByteStringIsUtf8(byteString);
            this.textColor_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setType(LiveBottomContentTypeEnum liveBottomContentTypeEnum) {
            liveBottomContentTypeEnum.getClass();
            this.type_ = liveBottomContentTypeEnum.getNumber();
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
            AbstractC3403a.checkByteStringIsUtf8(byteString);
            this.url_ = byteString.toStringUtf8();
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            boolean z = false;
            switch (C44741.f15969xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new LiveBottomContent();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                    return null;
                case 4:
                    return new Builder();
                case 5:
                    GeneratedMessageLite.InterfaceC3386h interfaceC3386h = (GeneratedMessageLite.InterfaceC3386h) obj;
                    LiveBottomContent liveBottomContent = (LiveBottomContent) obj2;
                    int i = this.type_;
                    boolean z2 = i != 0;
                    int i2 = liveBottomContent.type_;
                    this.type_ = interfaceC3386h.mo16996e(z2, i, i2 != 0, i2);
                    this.text_ = interfaceC3386h.mo16997f(!this.text_.isEmpty(), this.text_, !liveBottomContent.text_.isEmpty(), liveBottomContent.text_);
                    this.textColor_ = interfaceC3386h.mo16997f(!this.textColor_.isEmpty(), this.textColor_, !liveBottomContent.textColor_.isEmpty(), liveBottomContent.textColor_);
                    this.url_ = interfaceC3386h.mo16997f(!this.url_.isEmpty(), this.url_, !liveBottomContent.url_.isEmpty(), liveBottomContent.url_);
                    long j = this.countdownEndTime_;
                    boolean z3 = j != 0;
                    long j2 = liveBottomContent.countdownEndTime_;
                    this.countdownEndTime_ = interfaceC3386h.mo17000i(z3, j, j2 != 0, j2);
                    long j3 = this.countdownCurrentTime_;
                    boolean z4 = j3 != 0;
                    long j4 = liveBottomContent.countdownCurrentTime_;
                    this.countdownCurrentTime_ = interfaceC3386h.mo17000i(z4, j3, j4 != 0, j4);
                    int i3 = this.countDownOverAction_;
                    boolean z5 = i3 != 0;
                    int i4 = liveBottomContent.countDownOverAction_;
                    this.countDownOverAction_ = interfaceC3386h.mo16996e(z5, i3, i4 != 0, i4);
                    GeneratedMessageLite.C3385g c3385g = GeneratedMessageLite.C3385g.INSTANCE;
                    return this;
                case 6:
                    C3407e c3407e = (C3407e) obj;
                    while (!z) {
                        try {
                            int iM17116M = c3407e.m17116M();
                            if (iM17116M != 0) {
                                if (iM17116M == 8) {
                                    this.type_ = c3407e.m17136p();
                                } else if (iM17116M == 18) {
                                    this.text_ = c3407e.m17115L();
                                } else if (iM17116M == 26) {
                                    this.textColor_ = c3407e.m17115L();
                                } else if (iM17116M == 34) {
                                    this.url_ = c3407e.m17115L();
                                } else if (iM17116M == 40) {
                                    this.countdownEndTime_ = c3407e.m17142v();
                                } else if (iM17116M == 48) {
                                    this.countdownCurrentTime_ = c3407e.m17142v();
                                } else if (iM17116M == 56) {
                                    this.countDownOverAction_ = c3407e.m17136p();
                                } else if (!c3407e.m17121R(iM17116M)) {
                                }
                            }
                            z = true;
                        } catch (InvalidProtocolBufferException e) {
                            aag0.m95543a(e.setUnfinishedMessage(this));
                            return null;
                        } catch (IOException e2) {
                            aag0.m95543a(new InvalidProtocolBufferException(e2.getMessage()).setUnfinishedMessage(this));
                            return null;
                        }
                    }
                    break;
                case 7:
                    break;
                case 8:
                    if (PARSER == null) {
                        synchronized (LiveBottomContent.class) {
                            try {
                                if (PARSER == null) {
                                    PARSER = new GeneratedMessageLite.C3381c(DEFAULT_INSTANCE);
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                            break;
                        }
                    }
                    return PARSER;
                default:
                    bz00.m104536a();
                    return null;
            }
            return DEFAULT_INSTANCE;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkLiveBottomPopup.LiveBottomContentOrBuilder
        public LiveBottomCountdownOverActionEnum getCountDownOverAction() {
            LiveBottomCountdownOverActionEnum liveBottomCountdownOverActionEnumForNumber = LiveBottomCountdownOverActionEnum.forNumber(this.countDownOverAction_);
            return liveBottomCountdownOverActionEnumForNumber == null ? LiveBottomCountdownOverActionEnum.UNRECOGNIZED : liveBottomCountdownOverActionEnumForNumber;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkLiveBottomPopup.LiveBottomContentOrBuilder
        public int getCountDownOverActionValue() {
            return this.countDownOverAction_;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkLiveBottomPopup.LiveBottomContentOrBuilder
        public long getCountdownCurrentTime() {
            return this.countdownCurrentTime_;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkLiveBottomPopup.LiveBottomContentOrBuilder
        public long getCountdownEndTime() {
            return this.countdownEndTime_;
        }

        @Override // com.google.protobuf.InterfaceC3419q
        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int iM16922m = this.type_ != LiveBottomContentTypeEnum.text.getNumber() ? CodedOutputStream.m16922m(1, this.type_) : 0;
            if (!this.text_.isEmpty()) {
                iM16922m += CodedOutputStream.m16901K(2, getText());
            }
            if (!this.textColor_.isEmpty()) {
                iM16922m += CodedOutputStream.m16901K(3, getTextColor());
            }
            if (!this.url_.isEmpty()) {
                iM16922m += CodedOutputStream.m16901K(4, getUrl());
            }
            long j = this.countdownEndTime_;
            if (j != 0) {
                iM16922m += CodedOutputStream.m16931v(5, j);
            }
            long j2 = this.countdownCurrentTime_;
            if (j2 != 0) {
                iM16922m += CodedOutputStream.m16931v(6, j2);
            }
            if (this.countDownOverAction_ != LiveBottomCountdownOverActionEnum.none.getNumber()) {
                iM16922m += CodedOutputStream.m16922m(7, this.countDownOverAction_);
            }
            this.memoizedSerializedSize = iM16922m;
            return iM16922m;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkLiveBottomPopup.LiveBottomContentOrBuilder
        public String getText() {
            return this.text_;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkLiveBottomPopup.LiveBottomContentOrBuilder
        public ByteString getTextBytes() {
            return ByteString.copyFromUtf8(this.text_);
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkLiveBottomPopup.LiveBottomContentOrBuilder
        public String getTextColor() {
            return this.textColor_;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkLiveBottomPopup.LiveBottomContentOrBuilder
        public ByteString getTextColorBytes() {
            return ByteString.copyFromUtf8(this.textColor_);
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkLiveBottomPopup.LiveBottomContentOrBuilder
        public LiveBottomContentTypeEnum getType() {
            LiveBottomContentTypeEnum liveBottomContentTypeEnumForNumber = LiveBottomContentTypeEnum.forNumber(this.type_);
            return liveBottomContentTypeEnumForNumber == null ? LiveBottomContentTypeEnum.UNRECOGNIZED : liveBottomContentTypeEnumForNumber;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkLiveBottomPopup.LiveBottomContentOrBuilder
        public int getTypeValue() {
            return this.type_;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkLiveBottomPopup.LiveBottomContentOrBuilder
        public String getUrl() {
            return this.url_;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkLiveBottomPopup.LiveBottomContentOrBuilder
        public ByteString getUrlBytes() {
            return ByteString.copyFromUtf8(this.url_);
        }

        @Override // com.google.protobuf.InterfaceC3419q
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (this.type_ != LiveBottomContentTypeEnum.text.getNumber()) {
                codedOutputStream.m16960i0(1, this.type_);
            }
            if (!this.text_.isEmpty()) {
                codedOutputStream.mo16939D0(2, getText());
            }
            if (!this.textColor_.isEmpty()) {
                codedOutputStream.mo16939D0(3, getTextColor());
            }
            if (!this.url_.isEmpty()) {
                codedOutputStream.mo16939D0(4, getUrl());
            }
            long j = this.countdownEndTime_;
            if (j != 0) {
                codedOutputStream.m16972u0(5, j);
            }
            long j2 = this.countdownCurrentTime_;
            if (j2 != 0) {
                codedOutputStream.m16972u0(6, j2);
            }
            if (this.countDownOverAction_ != LiveBottomCountdownOverActionEnum.none.getNumber()) {
                codedOutputStream.m16960i0(7, this.countDownOverAction_);
            }
        }

        public static LiveBottomContent parseDelimitedFrom(InputStream inputStream, C3410h c3410h) throws IOException {
            return (LiveBottomContent) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, c3410h);
        }

        public static LiveBottomContent parseFrom(ByteString byteString, C3410h c3410h) throws InvalidProtocolBufferException {
            return (LiveBottomContent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, c3410h);
        }

        public static LiveBottomContent parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (LiveBottomContent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static LiveBottomContent parseFrom(byte[] bArr, C3410h c3410h) throws InvalidProtocolBufferException {
            return (LiveBottomContent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, c3410h);
        }

        public static LiveBottomContent parseFrom(InputStream inputStream) throws IOException {
            return (LiveBottomContent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static LiveBottomContent parseFrom(InputStream inputStream, C3410h c3410h) throws IOException {
            return (LiveBottomContent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, c3410h);
        }

        public static LiveBottomContent parseFrom(C3407e c3407e) throws IOException {
            return (LiveBottomContent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, c3407e);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static LiveBottomContent parseFrom(C3407e c3407e, C3410h c3410h) throws IOException {
            return (LiveBottomContent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, c3407e, c3410h);
        }
    }

    public enum LiveBottomContentTypeEnum implements C3414l.c {
        text(0),
        picture(1),
        countdown(2),
        UNRECOGNIZED(-1);

        public static final int countdown_VALUE = 2;
        private static final C3414l.d<LiveBottomContentTypeEnum> internalValueMap = new C3414l.d<LiveBottomContentTypeEnum>() { // from class: com.p1.mobile.longlink.msg.liveroom.LongLinkLiveBottomPopup.LiveBottomContentTypeEnum.1
            @Override // com.google.protobuf.C3414l.d
            public LiveBottomContentTypeEnum findValueByNumber(int i) {
                return LiveBottomContentTypeEnum.forNumber(i);
            }
        };
        public static final int picture_VALUE = 1;
        public static final int text_VALUE = 0;
        private final int value;

        LiveBottomContentTypeEnum(int i) {
            this.value = i;
        }

        public static LiveBottomContentTypeEnum forNumber(int i) {
            if (i == 0) {
                return text;
            }
            if (i == 1) {
                return picture;
            }
            if (i != 2) {
                return null;
            }
            return countdown;
        }

        public static C3414l.d<LiveBottomContentTypeEnum> internalGetValueMap() {
            return internalValueMap;
        }

        @Override // com.google.protobuf.C3414l.c
        public final int getNumber() {
            return this.value;
        }

        @Deprecated
        public static LiveBottomContentTypeEnum valueOf(int i) {
            return forNumber(i);
        }
    }

    public enum LiveBottomCountdownOverActionEnum implements C3414l.c {
        none(0),
        buttonLightUp(1),
        buttonLightDown(2),
        UNRECOGNIZED(-1);

        public static final int buttonLightDown_VALUE = 2;
        public static final int buttonLightUp_VALUE = 1;
        private static final C3414l.d<LiveBottomCountdownOverActionEnum> internalValueMap = new C3414l.d<LiveBottomCountdownOverActionEnum>() { // from class: com.p1.mobile.longlink.msg.liveroom.LongLinkLiveBottomPopup.LiveBottomCountdownOverActionEnum.1
            @Override // com.google.protobuf.C3414l.d
            public LiveBottomCountdownOverActionEnum findValueByNumber(int i) {
                return LiveBottomCountdownOverActionEnum.forNumber(i);
            }
        };
        public static final int none_VALUE = 0;
        private final int value;

        LiveBottomCountdownOverActionEnum(int i) {
            this.value = i;
        }

        public static LiveBottomCountdownOverActionEnum forNumber(int i) {
            if (i == 0) {
                return none;
            }
            if (i == 1) {
                return buttonLightUp;
            }
            if (i != 2) {
                return null;
            }
            return buttonLightDown;
        }

        public static C3414l.d<LiveBottomCountdownOverActionEnum> internalGetValueMap() {
            return internalValueMap;
        }

        @Override // com.google.protobuf.C3414l.c
        public final int getNumber() {
            return this.value;
        }

        @Deprecated
        public static LiveBottomCountdownOverActionEnum valueOf(int i) {
            return forNumber(i);
        }
    }

    public static final class LiveBottomPopup extends GeneratedMessageLite<LiveBottomPopup, Builder> implements LiveBottomPopupOrBuilder {
        public static final int BACKGROUNDCOLOR_FIELD_NUMBER = 13;
        public static final int BLANKCLOSE_FIELD_NUMBER = 15;
        public static final int BUTTON_FIELD_NUMBER = 4;
        public static final int CONTENTCOLOR_FIELD_NUMBER = 14;
        public static final int CONTENT_FIELD_NUMBER = 3;
        private static final LiveBottomPopup DEFAULT_INSTANCE;
        public static final int DESCRIPTIONS_FIELD_NUMBER = 18;
        public static final int EXTRA_FIELD_NUMBER = 9;
        public static final int HEADER_FIELD_NUMBER = 12;
        public static final int ICONURL_FIELD_NUMBER = 1;
        private static volatile i860<LiveBottomPopup> PARSER = null;
        public static final int REMAINDURATION_FIELD_NUMBER = 7;
        public static final int REMIND_FIELD_NUMBER = 8;
        public static final int SHOWCLOSE_FIELD_NUMBER = 11;
        public static final int SOURCE_FIELD_NUMBER = 5;
        public static final int STYLETYPE_FIELD_NUMBER = 17;
        public static final int TITLE_FIELD_NUMBER = 2;
        public static final int TOAST_FIELD_NUMBER = 10;
        public static final int TYPE_FIELD_NUMBER = 6;
        public static final int WINDOW_FIELD_NUMBER = 19;
        private int bitField0_;
        private boolean blankClose_;
        private LiveBottomPopupButton button_;
        private LiveBottomPopupHeader header_;
        private long remainDuration_;
        private LiveBottomPopupRemind remind_;
        private boolean showClose_;
        private int styleType_;
        private LiveBottomPopupToast toast_;
        private String iconUrl_ = "";
        private String title_ = "";
        private String content_ = "";
        private String source_ = "";
        private String type_ = "";
        private String extra_ = "";
        private String backgroundColor_ = "";
        private String contentColor_ = "";
        private C3414l.h<LiveBottomContent> descriptions_ = GeneratedMessageLite.emptyProtobufList();
        private C3414l.h<LiveBottomWindown> window_ = GeneratedMessageLite.emptyProtobufList();

        static {
            LiveBottomPopup liveBottomPopup = new LiveBottomPopup();
            DEFAULT_INSTANCE = liveBottomPopup;
            liveBottomPopup.makeImmutable();
        }

        private LiveBottomPopup() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllDescriptions(Iterable<? extends LiveBottomContent> iterable) {
            ensureDescriptionsIsMutable();
            AbstractC3403a.addAll(iterable, this.descriptions_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllWindow(Iterable<? extends LiveBottomWindown> iterable) {
            ensureWindowIsMutable();
            AbstractC3403a.addAll(iterable, this.window_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addDescriptions(LiveBottomContent.Builder builder) {
            ensureDescriptionsIsMutable();
            this.descriptions_.add(builder.build());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addWindow(LiveBottomWindown.Builder builder) {
            ensureWindowIsMutable();
            this.window_.add(builder.build());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearBackgroundColor() {
            this.backgroundColor_ = getDefaultInstance().getBackgroundColor();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearBlankClose() {
            this.blankClose_ = false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearButton() {
            this.button_ = null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearContent() {
            this.content_ = getDefaultInstance().getContent();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearContentColor() {
            this.contentColor_ = getDefaultInstance().getContentColor();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearDescriptions() {
            this.descriptions_ = GeneratedMessageLite.emptyProtobufList();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearExtra() {
            this.extra_ = getDefaultInstance().getExtra();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearHeader() {
            this.header_ = null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearIconUrl() {
            this.iconUrl_ = getDefaultInstance().getIconUrl();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearRemainDuration() {
            this.remainDuration_ = 0L;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearRemind() {
            this.remind_ = null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearShowClose() {
            this.showClose_ = false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearSource() {
            this.source_ = getDefaultInstance().getSource();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearStyleType() {
            this.styleType_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearTitle() {
            this.title_ = getDefaultInstance().getTitle();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearToast() {
            this.toast_ = null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearType() {
            this.type_ = getDefaultInstance().getType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearWindow() {
            this.window_ = GeneratedMessageLite.emptyProtobufList();
        }

        private void ensureDescriptionsIsMutable() {
            if (this.descriptions_.mo17085q()) {
                return;
            }
            this.descriptions_ = GeneratedMessageLite.mutableCopy(this.descriptions_);
        }

        private void ensureWindowIsMutable() {
            if (this.window_.mo17085q()) {
                return;
            }
            this.window_ = GeneratedMessageLite.mutableCopy(this.window_);
        }

        public static LiveBottomPopup getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeButton(LiveBottomPopupButton liveBottomPopupButton) {
            LiveBottomPopupButton liveBottomPopupButton2 = this.button_;
            if (liveBottomPopupButton2 == null || liveBottomPopupButton2 == LiveBottomPopupButton.getDefaultInstance()) {
                this.button_ = liveBottomPopupButton;
            } else {
                this.button_ = LiveBottomPopupButton.newBuilder(this.button_).mergeFrom(liveBottomPopupButton).buildPartial();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeHeader(LiveBottomPopupHeader liveBottomPopupHeader) {
            LiveBottomPopupHeader liveBottomPopupHeader2 = this.header_;
            if (liveBottomPopupHeader2 == null || liveBottomPopupHeader2 == LiveBottomPopupHeader.getDefaultInstance()) {
                this.header_ = liveBottomPopupHeader;
            } else {
                this.header_ = LiveBottomPopupHeader.newBuilder(this.header_).mergeFrom(liveBottomPopupHeader).buildPartial();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeRemind(LiveBottomPopupRemind liveBottomPopupRemind) {
            LiveBottomPopupRemind liveBottomPopupRemind2 = this.remind_;
            if (liveBottomPopupRemind2 == null || liveBottomPopupRemind2 == LiveBottomPopupRemind.getDefaultInstance()) {
                this.remind_ = liveBottomPopupRemind;
            } else {
                this.remind_ = LiveBottomPopupRemind.newBuilder(this.remind_).mergeFrom(liveBottomPopupRemind).buildPartial();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeToast(LiveBottomPopupToast liveBottomPopupToast) {
            LiveBottomPopupToast liveBottomPopupToast2 = this.toast_;
            if (liveBottomPopupToast2 == null || liveBottomPopupToast2 == LiveBottomPopupToast.getDefaultInstance()) {
                this.toast_ = liveBottomPopupToast;
            } else {
                this.toast_ = LiveBottomPopupToast.newBuilder(this.toast_).mergeFrom(liveBottomPopupToast).buildPartial();
            }
        }

        public static Builder newBuilder(LiveBottomPopup liveBottomPopup) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(liveBottomPopup);
        }

        public static LiveBottomPopup parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (LiveBottomPopup) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static LiveBottomPopup parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (LiveBottomPopup) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static i860<LiveBottomPopup> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void removeDescriptions(int i) {
            ensureDescriptionsIsMutable();
            this.descriptions_.remove(i);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void removeWindow(int i) {
            ensureWindowIsMutable();
            this.window_.remove(i);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setBackgroundColor(String str) {
            str.getClass();
            this.backgroundColor_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setBackgroundColorBytes(ByteString byteString) {
            byteString.getClass();
            AbstractC3403a.checkByteStringIsUtf8(byteString);
            this.backgroundColor_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setBlankClose(boolean z) {
            this.blankClose_ = z;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setButton(LiveBottomPopupButton.Builder builder) {
            this.button_ = builder.build();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setContent(String str) {
            str.getClass();
            this.content_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setContentBytes(ByteString byteString) {
            byteString.getClass();
            AbstractC3403a.checkByteStringIsUtf8(byteString);
            this.content_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setContentColor(String str) {
            str.getClass();
            this.contentColor_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setContentColorBytes(ByteString byteString) {
            byteString.getClass();
            AbstractC3403a.checkByteStringIsUtf8(byteString);
            this.contentColor_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setDescriptions(int i, LiveBottomContent.Builder builder) {
            ensureDescriptionsIsMutable();
            this.descriptions_.set(i, builder.build());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setExtra(String str) {
            str.getClass();
            this.extra_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setExtraBytes(ByteString byteString) {
            byteString.getClass();
            AbstractC3403a.checkByteStringIsUtf8(byteString);
            this.extra_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setHeader(LiveBottomPopupHeader.Builder builder) {
            this.header_ = builder.build();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setIconUrl(String str) {
            str.getClass();
            this.iconUrl_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setIconUrlBytes(ByteString byteString) {
            byteString.getClass();
            AbstractC3403a.checkByteStringIsUtf8(byteString);
            this.iconUrl_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setRemainDuration(long j) {
            this.remainDuration_ = j;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setRemind(LiveBottomPopupRemind.Builder builder) {
            this.remind_ = builder.build();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setShowClose(boolean z) {
            this.showClose_ = z;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSource(String str) {
            str.getClass();
            this.source_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSourceBytes(ByteString byteString) {
            byteString.getClass();
            AbstractC3403a.checkByteStringIsUtf8(byteString);
            this.source_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setStyleType(LiveBottomPopupStyleTypeEnum liveBottomPopupStyleTypeEnum) {
            liveBottomPopupStyleTypeEnum.getClass();
            this.styleType_ = liveBottomPopupStyleTypeEnum.getNumber();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setStyleTypeValue(int i) {
            this.styleType_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTitle(String str) {
            str.getClass();
            this.title_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTitleBytes(ByteString byteString) {
            byteString.getClass();
            AbstractC3403a.checkByteStringIsUtf8(byteString);
            this.title_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setToast(LiveBottomPopupToast.Builder builder) {
            this.toast_ = builder.build();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setType(String str) {
            str.getClass();
            this.type_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTypeBytes(ByteString byteString) {
            byteString.getClass();
            AbstractC3403a.checkByteStringIsUtf8(byteString);
            this.type_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setWindow(int i, LiveBottomWindown.Builder builder) {
            ensureWindowIsMutable();
            this.window_.set(i, builder.build());
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            boolean z = false;
            switch (C44741.f15969xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new LiveBottomPopup();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                    this.descriptions_.mo17084n();
                    this.window_.mo17084n();
                    return null;
                case 4:
                    return new Builder();
                case 5:
                    GeneratedMessageLite.InterfaceC3386h interfaceC3386h = (GeneratedMessageLite.InterfaceC3386h) obj;
                    LiveBottomPopup liveBottomPopup = (LiveBottomPopup) obj2;
                    this.iconUrl_ = interfaceC3386h.mo16997f(!this.iconUrl_.isEmpty(), this.iconUrl_, !liveBottomPopup.iconUrl_.isEmpty(), liveBottomPopup.iconUrl_);
                    this.title_ = interfaceC3386h.mo16997f(!this.title_.isEmpty(), this.title_, !liveBottomPopup.title_.isEmpty(), liveBottomPopup.title_);
                    this.content_ = interfaceC3386h.mo16997f(!this.content_.isEmpty(), this.content_, !liveBottomPopup.content_.isEmpty(), liveBottomPopup.content_);
                    this.button_ = (LiveBottomPopupButton) interfaceC3386h.mo17006o(this.button_, liveBottomPopup.button_);
                    this.source_ = interfaceC3386h.mo16997f(!this.source_.isEmpty(), this.source_, !liveBottomPopup.source_.isEmpty(), liveBottomPopup.source_);
                    this.type_ = interfaceC3386h.mo16997f(!this.type_.isEmpty(), this.type_, !liveBottomPopup.type_.isEmpty(), liveBottomPopup.type_);
                    long j = this.remainDuration_;
                    boolean z2 = j != 0;
                    long j2 = liveBottomPopup.remainDuration_;
                    this.remainDuration_ = interfaceC3386h.mo17000i(z2, j, j2 != 0, j2);
                    this.remind_ = (LiveBottomPopupRemind) interfaceC3386h.mo17006o(this.remind_, liveBottomPopup.remind_);
                    this.extra_ = interfaceC3386h.mo16997f(!this.extra_.isEmpty(), this.extra_, !liveBottomPopup.extra_.isEmpty(), liveBottomPopup.extra_);
                    this.toast_ = (LiveBottomPopupToast) interfaceC3386h.mo17006o(this.toast_, liveBottomPopup.toast_);
                    boolean z3 = this.showClose_;
                    boolean z4 = liveBottomPopup.showClose_;
                    this.showClose_ = interfaceC3386h.mo16995d(z3, z3, z4, z4);
                    this.header_ = (LiveBottomPopupHeader) interfaceC3386h.mo17006o(this.header_, liveBottomPopup.header_);
                    this.backgroundColor_ = interfaceC3386h.mo16997f(!this.backgroundColor_.isEmpty(), this.backgroundColor_, !liveBottomPopup.backgroundColor_.isEmpty(), liveBottomPopup.backgroundColor_);
                    this.contentColor_ = interfaceC3386h.mo16997f(!this.contentColor_.isEmpty(), this.contentColor_, !liveBottomPopup.contentColor_.isEmpty(), liveBottomPopup.contentColor_);
                    boolean z5 = this.blankClose_;
                    boolean z6 = liveBottomPopup.blankClose_;
                    this.blankClose_ = interfaceC3386h.mo16995d(z5, z5, z6, z6);
                    int i = this.styleType_;
                    boolean z7 = i != 0;
                    int i2 = liveBottomPopup.styleType_;
                    this.styleType_ = interfaceC3386h.mo16996e(z7, i, i2 != 0, i2);
                    this.descriptions_ = interfaceC3386h.mo16998g(this.descriptions_, liveBottomPopup.descriptions_);
                    this.window_ = interfaceC3386h.mo16998g(this.window_, liveBottomPopup.window_);
                    if (interfaceC3386h == GeneratedMessageLite.C3385g.INSTANCE) {
                        this.bitField0_ |= liveBottomPopup.bitField0_;
                    }
                    return this;
                case 6:
                    C3407e c3407e = (C3407e) obj;
                    C3410h c3410h = (C3410h) obj2;
                    while (!z) {
                        try {
                            int iM17116M = c3407e.m17116M();
                            switch (iM17116M) {
                                case 0:
                                    break;
                                case 10:
                                    this.iconUrl_ = c3407e.m17115L();
                                    continue;
                                case 18:
                                    this.title_ = c3407e.m17115L();
                                    continue;
                                case 26:
                                    this.content_ = c3407e.m17115L();
                                    continue;
                                case 34:
                                    LiveBottomPopupButton liveBottomPopupButton = this.button_;
                                    LiveBottomPopupButton.Builder builder = liveBottomPopupButton != null ? liveBottomPopupButton.toBuilder() : null;
                                    LiveBottomPopupButton liveBottomPopupButton2 = (LiveBottomPopupButton) c3407e.m17143w(LiveBottomPopupButton.parser(), c3410h);
                                    this.button_ = liveBottomPopupButton2;
                                    if (builder != null) {
                                        builder.mergeFrom(liveBottomPopupButton2);
                                        this.button_ = builder.buildPartial();
                                    } else {
                                        continue;
                                    }
                                    break;
                                case 42:
                                    this.source_ = c3407e.m17115L();
                                    continue;
                                case 50:
                                    this.type_ = c3407e.m17115L();
                                    continue;
                                case 56:
                                    this.remainDuration_ = c3407e.m17142v();
                                    continue;
                                case 66:
                                    LiveBottomPopupRemind liveBottomPopupRemind = this.remind_;
                                    LiveBottomPopupRemind.Builder builder2 = liveBottomPopupRemind != null ? liveBottomPopupRemind.toBuilder() : null;
                                    LiveBottomPopupRemind liveBottomPopupRemind2 = (LiveBottomPopupRemind) c3407e.m17143w(LiveBottomPopupRemind.parser(), c3410h);
                                    this.remind_ = liveBottomPopupRemind2;
                                    if (builder2 != null) {
                                        builder2.mergeFrom(liveBottomPopupRemind2);
                                        this.remind_ = builder2.buildPartial();
                                    } else {
                                        continue;
                                    }
                                    break;
                                case 74:
                                    this.extra_ = c3407e.m17115L();
                                    continue;
                                case EACTags.COMMAND_TO_PERFORM /* 82 */:
                                    LiveBottomPopupToast liveBottomPopupToast = this.toast_;
                                    LiveBottomPopupToast.Builder builder3 = liveBottomPopupToast != null ? liveBottomPopupToast.toBuilder() : null;
                                    LiveBottomPopupToast liveBottomPopupToast2 = (LiveBottomPopupToast) c3407e.m17143w(LiveBottomPopupToast.parser(), c3410h);
                                    this.toast_ = liveBottomPopupToast2;
                                    if (builder3 != null) {
                                        builder3.mergeFrom(liveBottomPopupToast2);
                                        this.toast_ = builder3.buildPartial();
                                    } else {
                                        continue;
                                    }
                                    break;
                                case 88:
                                    this.showClose_ = c3407e.m17133m();
                                    continue;
                                case EACTags.FCP_TEMPLATE /* 98 */:
                                    LiveBottomPopupHeader liveBottomPopupHeader = this.header_;
                                    LiveBottomPopupHeader.Builder builder4 = liveBottomPopupHeader != null ? liveBottomPopupHeader.toBuilder() : null;
                                    LiveBottomPopupHeader liveBottomPopupHeader2 = (LiveBottomPopupHeader) c3407e.m17143w(LiveBottomPopupHeader.parser(), c3410h);
                                    this.header_ = liveBottomPopupHeader2;
                                    if (builder4 != null) {
                                        builder4.mergeFrom(liveBottomPopupHeader2);
                                        this.header_ = builder4.buildPartial();
                                    } else {
                                        continue;
                                    }
                                    break;
                                case 106:
                                    this.backgroundColor_ = c3407e.m17115L();
                                    continue;
                                case 114:
                                    this.contentColor_ = c3407e.m17115L();
                                    continue;
                                case 120:
                                    this.blankClose_ = c3407e.m17133m();
                                    continue;
                                case CipherSuite.TLS_DHE_RSA_WITH_CAMELLIA_256_CBC_SHA /* 136 */:
                                    this.styleType_ = c3407e.m17136p();
                                    continue;
                                case CipherSuite.TLS_RSA_PSK_WITH_RC4_128_SHA /* 146 */:
                                    if (!this.descriptions_.mo17085q()) {
                                        this.descriptions_ = GeneratedMessageLite.mutableCopy(this.descriptions_);
                                    }
                                    this.descriptions_.add((LiveBottomContent) c3407e.m17143w(LiveBottomContent.parser(), c3410h));
                                    continue;
                                case 154:
                                    if (!this.window_.mo17085q()) {
                                        this.window_ = GeneratedMessageLite.mutableCopy(this.window_);
                                    }
                                    this.window_.add((LiveBottomWindown) c3407e.m17143w(LiveBottomWindown.parser(), c3410h));
                                    continue;
                                default:
                                    if (!c3407e.m17121R(iM17116M)) {
                                        break;
                                    }
                                    break;
                            }
                            z = true;
                        } catch (InvalidProtocolBufferException e) {
                            aag0.m95543a(e.setUnfinishedMessage(this));
                            return null;
                        } catch (IOException e2) {
                            aag0.m95543a(new InvalidProtocolBufferException(e2.getMessage()).setUnfinishedMessage(this));
                            return null;
                        }
                    }
                    break;
                case 7:
                    break;
                case 8:
                    if (PARSER == null) {
                        synchronized (LiveBottomPopup.class) {
                            try {
                                if (PARSER == null) {
                                    PARSER = new GeneratedMessageLite.C3381c(DEFAULT_INSTANCE);
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                            break;
                        }
                    }
                    return PARSER;
                default:
                    bz00.m104536a();
                    return null;
            }
            return DEFAULT_INSTANCE;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkLiveBottomPopup.LiveBottomPopupOrBuilder
        public String getBackgroundColor() {
            return this.backgroundColor_;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkLiveBottomPopup.LiveBottomPopupOrBuilder
        public ByteString getBackgroundColorBytes() {
            return ByteString.copyFromUtf8(this.backgroundColor_);
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkLiveBottomPopup.LiveBottomPopupOrBuilder
        public boolean getBlankClose() {
            return this.blankClose_;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkLiveBottomPopup.LiveBottomPopupOrBuilder
        public LiveBottomPopupButton getButton() {
            LiveBottomPopupButton liveBottomPopupButton = this.button_;
            return liveBottomPopupButton == null ? LiveBottomPopupButton.getDefaultInstance() : liveBottomPopupButton;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkLiveBottomPopup.LiveBottomPopupOrBuilder
        public String getContent() {
            return this.content_;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkLiveBottomPopup.LiveBottomPopupOrBuilder
        public ByteString getContentBytes() {
            return ByteString.copyFromUtf8(this.content_);
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkLiveBottomPopup.LiveBottomPopupOrBuilder
        public String getContentColor() {
            return this.contentColor_;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkLiveBottomPopup.LiveBottomPopupOrBuilder
        public ByteString getContentColorBytes() {
            return ByteString.copyFromUtf8(this.contentColor_);
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkLiveBottomPopup.LiveBottomPopupOrBuilder
        public LiveBottomContent getDescriptions(int i) {
            return this.descriptions_.get(i);
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkLiveBottomPopup.LiveBottomPopupOrBuilder
        public int getDescriptionsCount() {
            return this.descriptions_.size();
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkLiveBottomPopup.LiveBottomPopupOrBuilder
        public List<LiveBottomContent> getDescriptionsList() {
            return this.descriptions_;
        }

        public LiveBottomContentOrBuilder getDescriptionsOrBuilder(int i) {
            return this.descriptions_.get(i);
        }

        public List<? extends LiveBottomContentOrBuilder> getDescriptionsOrBuilderList() {
            return this.descriptions_;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkLiveBottomPopup.LiveBottomPopupOrBuilder
        public String getExtra() {
            return this.extra_;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkLiveBottomPopup.LiveBottomPopupOrBuilder
        public ByteString getExtraBytes() {
            return ByteString.copyFromUtf8(this.extra_);
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkLiveBottomPopup.LiveBottomPopupOrBuilder
        public LiveBottomPopupHeader getHeader() {
            LiveBottomPopupHeader liveBottomPopupHeader = this.header_;
            return liveBottomPopupHeader == null ? LiveBottomPopupHeader.getDefaultInstance() : liveBottomPopupHeader;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkLiveBottomPopup.LiveBottomPopupOrBuilder
        public String getIconUrl() {
            return this.iconUrl_;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkLiveBottomPopup.LiveBottomPopupOrBuilder
        public ByteString getIconUrlBytes() {
            return ByteString.copyFromUtf8(this.iconUrl_);
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkLiveBottomPopup.LiveBottomPopupOrBuilder
        public long getRemainDuration() {
            return this.remainDuration_;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkLiveBottomPopup.LiveBottomPopupOrBuilder
        public LiveBottomPopupRemind getRemind() {
            LiveBottomPopupRemind liveBottomPopupRemind = this.remind_;
            return liveBottomPopupRemind == null ? LiveBottomPopupRemind.getDefaultInstance() : liveBottomPopupRemind;
        }

        @Override // com.google.protobuf.InterfaceC3419q
        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int iM16901K = !this.iconUrl_.isEmpty() ? CodedOutputStream.m16901K(1, getIconUrl()) : 0;
            if (!this.title_.isEmpty()) {
                iM16901K += CodedOutputStream.m16901K(2, getTitle());
            }
            if (!this.content_.isEmpty()) {
                iM16901K += CodedOutputStream.m16901K(3, getContent());
            }
            if (this.button_ != null) {
                iM16901K += CodedOutputStream.m16893C(4, getButton());
            }
            if (!this.source_.isEmpty()) {
                iM16901K += CodedOutputStream.m16901K(5, getSource());
            }
            if (!this.type_.isEmpty()) {
                iM16901K += CodedOutputStream.m16901K(6, getType());
            }
            long j = this.remainDuration_;
            if (j != 0) {
                iM16901K += CodedOutputStream.m16931v(7, j);
            }
            if (this.remind_ != null) {
                iM16901K += CodedOutputStream.m16893C(8, getRemind());
            }
            if (!this.extra_.isEmpty()) {
                iM16901K += CodedOutputStream.m16901K(9, getExtra());
            }
            if (this.toast_ != null) {
                iM16901K += CodedOutputStream.m16893C(10, getToast());
            }
            boolean z = this.showClose_;
            if (z) {
                iM16901K += CodedOutputStream.m16915f(11, z);
            }
            if (this.header_ != null) {
                iM16901K += CodedOutputStream.m16893C(12, getHeader());
            }
            if (!this.backgroundColor_.isEmpty()) {
                iM16901K += CodedOutputStream.m16901K(13, getBackgroundColor());
            }
            if (!this.contentColor_.isEmpty()) {
                iM16901K += CodedOutputStream.m16901K(14, getContentColor());
            }
            boolean z2 = this.blankClose_;
            if (z2) {
                iM16901K += CodedOutputStream.m16915f(15, z2);
            }
            if (this.styleType_ != LiveBottomPopupStyleTypeEnum.common.getNumber()) {
                iM16901K += CodedOutputStream.m16922m(17, this.styleType_);
            }
            for (int i2 = 0; i2 < this.descriptions_.size(); i2++) {
                iM16901K += CodedOutputStream.m16893C(18, this.descriptions_.get(i2));
            }
            for (int i3 = 0; i3 < this.window_.size(); i3++) {
                iM16901K += CodedOutputStream.m16893C(19, this.window_.get(i3));
            }
            this.memoizedSerializedSize = iM16901K;
            return iM16901K;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkLiveBottomPopup.LiveBottomPopupOrBuilder
        public boolean getShowClose() {
            return this.showClose_;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkLiveBottomPopup.LiveBottomPopupOrBuilder
        public String getSource() {
            return this.source_;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkLiveBottomPopup.LiveBottomPopupOrBuilder
        public ByteString getSourceBytes() {
            return ByteString.copyFromUtf8(this.source_);
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkLiveBottomPopup.LiveBottomPopupOrBuilder
        public LiveBottomPopupStyleTypeEnum getStyleType() {
            LiveBottomPopupStyleTypeEnum liveBottomPopupStyleTypeEnumForNumber = LiveBottomPopupStyleTypeEnum.forNumber(this.styleType_);
            return liveBottomPopupStyleTypeEnumForNumber == null ? LiveBottomPopupStyleTypeEnum.UNRECOGNIZED : liveBottomPopupStyleTypeEnumForNumber;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkLiveBottomPopup.LiveBottomPopupOrBuilder
        public int getStyleTypeValue() {
            return this.styleType_;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkLiveBottomPopup.LiveBottomPopupOrBuilder
        public String getTitle() {
            return this.title_;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkLiveBottomPopup.LiveBottomPopupOrBuilder
        public ByteString getTitleBytes() {
            return ByteString.copyFromUtf8(this.title_);
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkLiveBottomPopup.LiveBottomPopupOrBuilder
        public LiveBottomPopupToast getToast() {
            LiveBottomPopupToast liveBottomPopupToast = this.toast_;
            return liveBottomPopupToast == null ? LiveBottomPopupToast.getDefaultInstance() : liveBottomPopupToast;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkLiveBottomPopup.LiveBottomPopupOrBuilder
        public String getType() {
            return this.type_;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkLiveBottomPopup.LiveBottomPopupOrBuilder
        public ByteString getTypeBytes() {
            return ByteString.copyFromUtf8(this.type_);
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkLiveBottomPopup.LiveBottomPopupOrBuilder
        public LiveBottomWindown getWindow(int i) {
            return this.window_.get(i);
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkLiveBottomPopup.LiveBottomPopupOrBuilder
        public int getWindowCount() {
            return this.window_.size();
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkLiveBottomPopup.LiveBottomPopupOrBuilder
        public List<LiveBottomWindown> getWindowList() {
            return this.window_;
        }

        public LiveBottomWindownOrBuilder getWindowOrBuilder(int i) {
            return this.window_.get(i);
        }

        public List<? extends LiveBottomWindownOrBuilder> getWindowOrBuilderList() {
            return this.window_;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkLiveBottomPopup.LiveBottomPopupOrBuilder
        public boolean hasButton() {
            return this.button_ != null;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkLiveBottomPopup.LiveBottomPopupOrBuilder
        public boolean hasHeader() {
            return this.header_ != null;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkLiveBottomPopup.LiveBottomPopupOrBuilder
        public boolean hasRemind() {
            return this.remind_ != null;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkLiveBottomPopup.LiveBottomPopupOrBuilder
        public boolean hasToast() {
            return this.toast_ != null;
        }

        @Override // com.google.protobuf.InterfaceC3419q
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (!this.iconUrl_.isEmpty()) {
                codedOutputStream.mo16939D0(1, getIconUrl());
            }
            if (!this.title_.isEmpty()) {
                codedOutputStream.mo16939D0(2, getTitle());
            }
            if (!this.content_.isEmpty()) {
                codedOutputStream.mo16939D0(3, getContent());
            }
            if (this.button_ != null) {
                codedOutputStream.mo16974w0(4, getButton());
            }
            if (!this.source_.isEmpty()) {
                codedOutputStream.mo16939D0(5, getSource());
            }
            if (!this.type_.isEmpty()) {
                codedOutputStream.mo16939D0(6, getType());
            }
            long j = this.remainDuration_;
            if (j != 0) {
                codedOutputStream.m16972u0(7, j);
            }
            if (this.remind_ != null) {
                codedOutputStream.mo16974w0(8, getRemind());
            }
            if (!this.extra_.isEmpty()) {
                codedOutputStream.mo16939D0(9, getExtra());
            }
            if (this.toast_ != null) {
                codedOutputStream.mo16974w0(10, getToast());
            }
            boolean z = this.showClose_;
            if (z) {
                codedOutputStream.mo16950a0(11, z);
            }
            if (this.header_ != null) {
                codedOutputStream.mo16974w0(12, getHeader());
            }
            if (!this.backgroundColor_.isEmpty()) {
                codedOutputStream.mo16939D0(13, getBackgroundColor());
            }
            if (!this.contentColor_.isEmpty()) {
                codedOutputStream.mo16939D0(14, getContentColor());
            }
            boolean z2 = this.blankClose_;
            if (z2) {
                codedOutputStream.mo16950a0(15, z2);
            }
            if (this.styleType_ != LiveBottomPopupStyleTypeEnum.common.getNumber()) {
                codedOutputStream.m16960i0(17, this.styleType_);
            }
            for (int i = 0; i < this.descriptions_.size(); i++) {
                codedOutputStream.mo16974w0(18, this.descriptions_.get(i));
            }
            for (int i2 = 0; i2 < this.window_.size(); i2++) {
                codedOutputStream.mo16974w0(19, this.window_.get(i2));
            }
        }

        public static LiveBottomPopup parseDelimitedFrom(InputStream inputStream, C3410h c3410h) throws IOException {
            return (LiveBottomPopup) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, c3410h);
        }

        public static LiveBottomPopup parseFrom(ByteString byteString, C3410h c3410h) throws InvalidProtocolBufferException {
            return (LiveBottomPopup) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, c3410h);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setButton(LiveBottomPopupButton liveBottomPopupButton) {
            liveBottomPopupButton.getClass();
            this.button_ = liveBottomPopupButton;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setHeader(LiveBottomPopupHeader liveBottomPopupHeader) {
            liveBottomPopupHeader.getClass();
            this.header_ = liveBottomPopupHeader;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setRemind(LiveBottomPopupRemind liveBottomPopupRemind) {
            liveBottomPopupRemind.getClass();
            this.remind_ = liveBottomPopupRemind;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setToast(LiveBottomPopupToast liveBottomPopupToast) {
            liveBottomPopupToast.getClass();
            this.toast_ = liveBottomPopupToast;
        }

        public static final class Builder extends GeneratedMessageLite.AbstractC3380b<LiveBottomPopup, Builder> implements LiveBottomPopupOrBuilder {
            private Builder() {
                super(LiveBottomPopup.DEFAULT_INSTANCE);
            }

            public Builder addAllDescriptions(Iterable<? extends LiveBottomContent> iterable) {
                copyOnWrite();
                ((LiveBottomPopup) this.instance).addAllDescriptions(iterable);
                return this;
            }

            public Builder addAllWindow(Iterable<? extends LiveBottomWindown> iterable) {
                copyOnWrite();
                ((LiveBottomPopup) this.instance).addAllWindow(iterable);
                return this;
            }

            public Builder addDescriptions(LiveBottomContent liveBottomContent) {
                copyOnWrite();
                ((LiveBottomPopup) this.instance).addDescriptions(liveBottomContent);
                return this;
            }

            public Builder addWindow(LiveBottomWindown liveBottomWindown) {
                copyOnWrite();
                ((LiveBottomPopup) this.instance).addWindow(liveBottomWindown);
                return this;
            }

            public Builder clearBackgroundColor() {
                copyOnWrite();
                ((LiveBottomPopup) this.instance).clearBackgroundColor();
                return this;
            }

            public Builder clearBlankClose() {
                copyOnWrite();
                ((LiveBottomPopup) this.instance).clearBlankClose();
                return this;
            }

            public Builder clearButton() {
                copyOnWrite();
                ((LiveBottomPopup) this.instance).clearButton();
                return this;
            }

            public Builder clearContent() {
                copyOnWrite();
                ((LiveBottomPopup) this.instance).clearContent();
                return this;
            }

            public Builder clearContentColor() {
                copyOnWrite();
                ((LiveBottomPopup) this.instance).clearContentColor();
                return this;
            }

            public Builder clearDescriptions() {
                copyOnWrite();
                ((LiveBottomPopup) this.instance).clearDescriptions();
                return this;
            }

            public Builder clearExtra() {
                copyOnWrite();
                ((LiveBottomPopup) this.instance).clearExtra();
                return this;
            }

            public Builder clearHeader() {
                copyOnWrite();
                ((LiveBottomPopup) this.instance).clearHeader();
                return this;
            }

            public Builder clearIconUrl() {
                copyOnWrite();
                ((LiveBottomPopup) this.instance).clearIconUrl();
                return this;
            }

            public Builder clearRemainDuration() {
                copyOnWrite();
                ((LiveBottomPopup) this.instance).clearRemainDuration();
                return this;
            }

            public Builder clearRemind() {
                copyOnWrite();
                ((LiveBottomPopup) this.instance).clearRemind();
                return this;
            }

            public Builder clearShowClose() {
                copyOnWrite();
                ((LiveBottomPopup) this.instance).clearShowClose();
                return this;
            }

            public Builder clearSource() {
                copyOnWrite();
                ((LiveBottomPopup) this.instance).clearSource();
                return this;
            }

            public Builder clearStyleType() {
                copyOnWrite();
                ((LiveBottomPopup) this.instance).clearStyleType();
                return this;
            }

            public Builder clearTitle() {
                copyOnWrite();
                ((LiveBottomPopup) this.instance).clearTitle();
                return this;
            }

            public Builder clearToast() {
                copyOnWrite();
                ((LiveBottomPopup) this.instance).clearToast();
                return this;
            }

            public Builder clearType() {
                copyOnWrite();
                ((LiveBottomPopup) this.instance).clearType();
                return this;
            }

            public Builder clearWindow() {
                copyOnWrite();
                ((LiveBottomPopup) this.instance).clearWindow();
                return this;
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkLiveBottomPopup.LiveBottomPopupOrBuilder
            public String getBackgroundColor() {
                return ((LiveBottomPopup) this.instance).getBackgroundColor();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkLiveBottomPopup.LiveBottomPopupOrBuilder
            public ByteString getBackgroundColorBytes() {
                return ((LiveBottomPopup) this.instance).getBackgroundColorBytes();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkLiveBottomPopup.LiveBottomPopupOrBuilder
            public boolean getBlankClose() {
                return ((LiveBottomPopup) this.instance).getBlankClose();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkLiveBottomPopup.LiveBottomPopupOrBuilder
            public LiveBottomPopupButton getButton() {
                return ((LiveBottomPopup) this.instance).getButton();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkLiveBottomPopup.LiveBottomPopupOrBuilder
            public String getContent() {
                return ((LiveBottomPopup) this.instance).getContent();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkLiveBottomPopup.LiveBottomPopupOrBuilder
            public ByteString getContentBytes() {
                return ((LiveBottomPopup) this.instance).getContentBytes();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkLiveBottomPopup.LiveBottomPopupOrBuilder
            public String getContentColor() {
                return ((LiveBottomPopup) this.instance).getContentColor();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkLiveBottomPopup.LiveBottomPopupOrBuilder
            public ByteString getContentColorBytes() {
                return ((LiveBottomPopup) this.instance).getContentColorBytes();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkLiveBottomPopup.LiveBottomPopupOrBuilder
            public LiveBottomContent getDescriptions(int i) {
                return ((LiveBottomPopup) this.instance).getDescriptions(i);
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkLiveBottomPopup.LiveBottomPopupOrBuilder
            public int getDescriptionsCount() {
                return ((LiveBottomPopup) this.instance).getDescriptionsCount();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkLiveBottomPopup.LiveBottomPopupOrBuilder
            public List<LiveBottomContent> getDescriptionsList() {
                return Collections.unmodifiableList(((LiveBottomPopup) this.instance).getDescriptionsList());
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkLiveBottomPopup.LiveBottomPopupOrBuilder
            public String getExtra() {
                return ((LiveBottomPopup) this.instance).getExtra();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkLiveBottomPopup.LiveBottomPopupOrBuilder
            public ByteString getExtraBytes() {
                return ((LiveBottomPopup) this.instance).getExtraBytes();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkLiveBottomPopup.LiveBottomPopupOrBuilder
            public LiveBottomPopupHeader getHeader() {
                return ((LiveBottomPopup) this.instance).getHeader();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkLiveBottomPopup.LiveBottomPopupOrBuilder
            public String getIconUrl() {
                return ((LiveBottomPopup) this.instance).getIconUrl();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkLiveBottomPopup.LiveBottomPopupOrBuilder
            public ByteString getIconUrlBytes() {
                return ((LiveBottomPopup) this.instance).getIconUrlBytes();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkLiveBottomPopup.LiveBottomPopupOrBuilder
            public long getRemainDuration() {
                return ((LiveBottomPopup) this.instance).getRemainDuration();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkLiveBottomPopup.LiveBottomPopupOrBuilder
            public LiveBottomPopupRemind getRemind() {
                return ((LiveBottomPopup) this.instance).getRemind();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkLiveBottomPopup.LiveBottomPopupOrBuilder
            public boolean getShowClose() {
                return ((LiveBottomPopup) this.instance).getShowClose();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkLiveBottomPopup.LiveBottomPopupOrBuilder
            public String getSource() {
                return ((LiveBottomPopup) this.instance).getSource();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkLiveBottomPopup.LiveBottomPopupOrBuilder
            public ByteString getSourceBytes() {
                return ((LiveBottomPopup) this.instance).getSourceBytes();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkLiveBottomPopup.LiveBottomPopupOrBuilder
            public LiveBottomPopupStyleTypeEnum getStyleType() {
                return ((LiveBottomPopup) this.instance).getStyleType();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkLiveBottomPopup.LiveBottomPopupOrBuilder
            public int getStyleTypeValue() {
                return ((LiveBottomPopup) this.instance).getStyleTypeValue();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkLiveBottomPopup.LiveBottomPopupOrBuilder
            public String getTitle() {
                return ((LiveBottomPopup) this.instance).getTitle();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkLiveBottomPopup.LiveBottomPopupOrBuilder
            public ByteString getTitleBytes() {
                return ((LiveBottomPopup) this.instance).getTitleBytes();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkLiveBottomPopup.LiveBottomPopupOrBuilder
            public LiveBottomPopupToast getToast() {
                return ((LiveBottomPopup) this.instance).getToast();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkLiveBottomPopup.LiveBottomPopupOrBuilder
            public String getType() {
                return ((LiveBottomPopup) this.instance).getType();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkLiveBottomPopup.LiveBottomPopupOrBuilder
            public ByteString getTypeBytes() {
                return ((LiveBottomPopup) this.instance).getTypeBytes();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkLiveBottomPopup.LiveBottomPopupOrBuilder
            public LiveBottomWindown getWindow(int i) {
                return ((LiveBottomPopup) this.instance).getWindow(i);
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkLiveBottomPopup.LiveBottomPopupOrBuilder
            public int getWindowCount() {
                return ((LiveBottomPopup) this.instance).getWindowCount();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkLiveBottomPopup.LiveBottomPopupOrBuilder
            public List<LiveBottomWindown> getWindowList() {
                return Collections.unmodifiableList(((LiveBottomPopup) this.instance).getWindowList());
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkLiveBottomPopup.LiveBottomPopupOrBuilder
            public boolean hasButton() {
                return ((LiveBottomPopup) this.instance).hasButton();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkLiveBottomPopup.LiveBottomPopupOrBuilder
            public boolean hasHeader() {
                return ((LiveBottomPopup) this.instance).hasHeader();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkLiveBottomPopup.LiveBottomPopupOrBuilder
            public boolean hasRemind() {
                return ((LiveBottomPopup) this.instance).hasRemind();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkLiveBottomPopup.LiveBottomPopupOrBuilder
            public boolean hasToast() {
                return ((LiveBottomPopup) this.instance).hasToast();
            }

            public Builder mergeButton(LiveBottomPopupButton liveBottomPopupButton) {
                copyOnWrite();
                ((LiveBottomPopup) this.instance).mergeButton(liveBottomPopupButton);
                return this;
            }

            public Builder mergeHeader(LiveBottomPopupHeader liveBottomPopupHeader) {
                copyOnWrite();
                ((LiveBottomPopup) this.instance).mergeHeader(liveBottomPopupHeader);
                return this;
            }

            public Builder mergeRemind(LiveBottomPopupRemind liveBottomPopupRemind) {
                copyOnWrite();
                ((LiveBottomPopup) this.instance).mergeRemind(liveBottomPopupRemind);
                return this;
            }

            public Builder mergeToast(LiveBottomPopupToast liveBottomPopupToast) {
                copyOnWrite();
                ((LiveBottomPopup) this.instance).mergeToast(liveBottomPopupToast);
                return this;
            }

            public Builder removeDescriptions(int i) {
                copyOnWrite();
                ((LiveBottomPopup) this.instance).removeDescriptions(i);
                return this;
            }

            public Builder removeWindow(int i) {
                copyOnWrite();
                ((LiveBottomPopup) this.instance).removeWindow(i);
                return this;
            }

            public Builder setBackgroundColor(String str) {
                copyOnWrite();
                ((LiveBottomPopup) this.instance).setBackgroundColor(str);
                return this;
            }

            public Builder setBackgroundColorBytes(ByteString byteString) {
                copyOnWrite();
                ((LiveBottomPopup) this.instance).setBackgroundColorBytes(byteString);
                return this;
            }

            public Builder setBlankClose(boolean z) {
                copyOnWrite();
                ((LiveBottomPopup) this.instance).setBlankClose(z);
                return this;
            }

            public Builder setButton(LiveBottomPopupButton liveBottomPopupButton) {
                copyOnWrite();
                ((LiveBottomPopup) this.instance).setButton(liveBottomPopupButton);
                return this;
            }

            public Builder setContent(String str) {
                copyOnWrite();
                ((LiveBottomPopup) this.instance).setContent(str);
                return this;
            }

            public Builder setContentBytes(ByteString byteString) {
                copyOnWrite();
                ((LiveBottomPopup) this.instance).setContentBytes(byteString);
                return this;
            }

            public Builder setContentColor(String str) {
                copyOnWrite();
                ((LiveBottomPopup) this.instance).setContentColor(str);
                return this;
            }

            public Builder setContentColorBytes(ByteString byteString) {
                copyOnWrite();
                ((LiveBottomPopup) this.instance).setContentColorBytes(byteString);
                return this;
            }

            public Builder setDescriptions(int i, LiveBottomContent liveBottomContent) {
                copyOnWrite();
                ((LiveBottomPopup) this.instance).setDescriptions(i, liveBottomContent);
                return this;
            }

            public Builder setExtra(String str) {
                copyOnWrite();
                ((LiveBottomPopup) this.instance).setExtra(str);
                return this;
            }

            public Builder setExtraBytes(ByteString byteString) {
                copyOnWrite();
                ((LiveBottomPopup) this.instance).setExtraBytes(byteString);
                return this;
            }

            public Builder setHeader(LiveBottomPopupHeader liveBottomPopupHeader) {
                copyOnWrite();
                ((LiveBottomPopup) this.instance).setHeader(liveBottomPopupHeader);
                return this;
            }

            public Builder setIconUrl(String str) {
                copyOnWrite();
                ((LiveBottomPopup) this.instance).setIconUrl(str);
                return this;
            }

            public Builder setIconUrlBytes(ByteString byteString) {
                copyOnWrite();
                ((LiveBottomPopup) this.instance).setIconUrlBytes(byteString);
                return this;
            }

            public Builder setRemainDuration(long j) {
                copyOnWrite();
                ((LiveBottomPopup) this.instance).setRemainDuration(j);
                return this;
            }

            public Builder setRemind(LiveBottomPopupRemind liveBottomPopupRemind) {
                copyOnWrite();
                ((LiveBottomPopup) this.instance).setRemind(liveBottomPopupRemind);
                return this;
            }

            public Builder setShowClose(boolean z) {
                copyOnWrite();
                ((LiveBottomPopup) this.instance).setShowClose(z);
                return this;
            }

            public Builder setSource(String str) {
                copyOnWrite();
                ((LiveBottomPopup) this.instance).setSource(str);
                return this;
            }

            public Builder setSourceBytes(ByteString byteString) {
                copyOnWrite();
                ((LiveBottomPopup) this.instance).setSourceBytes(byteString);
                return this;
            }

            public Builder setStyleType(LiveBottomPopupStyleTypeEnum liveBottomPopupStyleTypeEnum) {
                copyOnWrite();
                ((LiveBottomPopup) this.instance).setStyleType(liveBottomPopupStyleTypeEnum);
                return this;
            }

            public Builder setStyleTypeValue(int i) {
                copyOnWrite();
                ((LiveBottomPopup) this.instance).setStyleTypeValue(i);
                return this;
            }

            public Builder setTitle(String str) {
                copyOnWrite();
                ((LiveBottomPopup) this.instance).setTitle(str);
                return this;
            }

            public Builder setTitleBytes(ByteString byteString) {
                copyOnWrite();
                ((LiveBottomPopup) this.instance).setTitleBytes(byteString);
                return this;
            }

            public Builder setToast(LiveBottomPopupToast liveBottomPopupToast) {
                copyOnWrite();
                ((LiveBottomPopup) this.instance).setToast(liveBottomPopupToast);
                return this;
            }

            public Builder setType(String str) {
                copyOnWrite();
                ((LiveBottomPopup) this.instance).setType(str);
                return this;
            }

            public Builder setTypeBytes(ByteString byteString) {
                copyOnWrite();
                ((LiveBottomPopup) this.instance).setTypeBytes(byteString);
                return this;
            }

            public Builder setWindow(int i, LiveBottomWindown liveBottomWindown) {
                copyOnWrite();
                ((LiveBottomPopup) this.instance).setWindow(i, liveBottomWindown);
                return this;
            }

            public Builder addDescriptions(int i, LiveBottomContent liveBottomContent) {
                copyOnWrite();
                ((LiveBottomPopup) this.instance).addDescriptions(i, liveBottomContent);
                return this;
            }

            public Builder addWindow(int i, LiveBottomWindown liveBottomWindown) {
                copyOnWrite();
                ((LiveBottomPopup) this.instance).addWindow(i, liveBottomWindown);
                return this;
            }

            public Builder setButton(LiveBottomPopupButton.Builder builder) {
                copyOnWrite();
                ((LiveBottomPopup) this.instance).setButton(builder);
                return this;
            }

            public Builder setDescriptions(int i, LiveBottomContent.Builder builder) {
                copyOnWrite();
                ((LiveBottomPopup) this.instance).setDescriptions(i, builder);
                return this;
            }

            public Builder setHeader(LiveBottomPopupHeader.Builder builder) {
                copyOnWrite();
                ((LiveBottomPopup) this.instance).setHeader(builder);
                return this;
            }

            public Builder setRemind(LiveBottomPopupRemind.Builder builder) {
                copyOnWrite();
                ((LiveBottomPopup) this.instance).setRemind(builder);
                return this;
            }

            public Builder setToast(LiveBottomPopupToast.Builder builder) {
                copyOnWrite();
                ((LiveBottomPopup) this.instance).setToast(builder);
                return this;
            }

            public Builder setWindow(int i, LiveBottomWindown.Builder builder) {
                copyOnWrite();
                ((LiveBottomPopup) this.instance).setWindow(i, builder);
                return this;
            }

            public Builder addDescriptions(LiveBottomContent.Builder builder) {
                copyOnWrite();
                ((LiveBottomPopup) this.instance).addDescriptions(builder);
                return this;
            }

            public Builder addWindow(LiveBottomWindown.Builder builder) {
                copyOnWrite();
                ((LiveBottomPopup) this.instance).addWindow(builder);
                return this;
            }

            public Builder addDescriptions(int i, LiveBottomContent.Builder builder) {
                copyOnWrite();
                ((LiveBottomPopup) this.instance).addDescriptions(i, builder);
                return this;
            }

            public Builder addWindow(int i, LiveBottomWindown.Builder builder) {
                copyOnWrite();
                ((LiveBottomPopup) this.instance).addWindow(i, builder);
                return this;
            }
        }

        public static LiveBottomPopup parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (LiveBottomPopup) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static LiveBottomPopup parseFrom(byte[] bArr, C3410h c3410h) throws InvalidProtocolBufferException {
            return (LiveBottomPopup) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, c3410h);
        }

        public static LiveBottomPopup parseFrom(InputStream inputStream) throws IOException {
            return (LiveBottomPopup) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static LiveBottomPopup parseFrom(InputStream inputStream, C3410h c3410h) throws IOException {
            return (LiveBottomPopup) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, c3410h);
        }

        public static LiveBottomPopup parseFrom(C3407e c3407e) throws IOException {
            return (LiveBottomPopup) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, c3407e);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addDescriptions(int i, LiveBottomContent liveBottomContent) {
            liveBottomContent.getClass();
            ensureDescriptionsIsMutable();
            this.descriptions_.add(i, liveBottomContent);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addWindow(int i, LiveBottomWindown liveBottomWindown) {
            liveBottomWindown.getClass();
            ensureWindowIsMutable();
            this.window_.add(i, liveBottomWindown);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static LiveBottomPopup parseFrom(C3407e c3407e, C3410h c3410h) throws IOException {
            return (LiveBottomPopup) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, c3407e, c3410h);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setDescriptions(int i, LiveBottomContent liveBottomContent) {
            liveBottomContent.getClass();
            ensureDescriptionsIsMutable();
            this.descriptions_.set(i, liveBottomContent);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setWindow(int i, LiveBottomWindown liveBottomWindown) {
            liveBottomWindown.getClass();
            ensureWindowIsMutable();
            this.window_.set(i, liveBottomWindown);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addDescriptions(LiveBottomContent liveBottomContent) {
            liveBottomContent.getClass();
            ensureDescriptionsIsMutable();
            this.descriptions_.add(liveBottomContent);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addWindow(LiveBottomWindown liveBottomWindown) {
            liveBottomWindown.getClass();
            ensureWindowIsMutable();
            this.window_.add(liveBottomWindown);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addDescriptions(int i, LiveBottomContent.Builder builder) {
            ensureDescriptionsIsMutable();
            this.descriptions_.add(i, builder.build());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addWindow(int i, LiveBottomWindown.Builder builder) {
            ensureWindowIsMutable();
            this.window_.add(i, builder.build());
        }
    }

    public static final class LiveBottomPopupRemind extends GeneratedMessageLite<LiveBottomPopupRemind, Builder> implements LiveBottomPopupRemindOrBuilder {
        public static final int CLICK_FIELD_NUMBER = 2;
        private static final LiveBottomPopupRemind DEFAULT_INSTANCE;
        private static volatile i860<LiveBottomPopupRemind> PARSER = null;
        public static final int SHOW_FIELD_NUMBER = 1;
        public static final int TEXTCOLOR_FIELD_NUMBER = 3;
        private boolean click_;
        private boolean show_;
        private String textColor_ = "";

        public static final class Builder extends GeneratedMessageLite.AbstractC3380b<LiveBottomPopupRemind, Builder> implements LiveBottomPopupRemindOrBuilder {
            private Builder() {
                super(LiveBottomPopupRemind.DEFAULT_INSTANCE);
            }

            public Builder clearClick() {
                copyOnWrite();
                ((LiveBottomPopupRemind) this.instance).clearClick();
                return this;
            }

            public Builder clearShow() {
                copyOnWrite();
                ((LiveBottomPopupRemind) this.instance).clearShow();
                return this;
            }

            public Builder clearTextColor() {
                copyOnWrite();
                ((LiveBottomPopupRemind) this.instance).clearTextColor();
                return this;
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkLiveBottomPopup.LiveBottomPopupRemindOrBuilder
            public boolean getClick() {
                return ((LiveBottomPopupRemind) this.instance).getClick();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkLiveBottomPopup.LiveBottomPopupRemindOrBuilder
            public boolean getShow() {
                return ((LiveBottomPopupRemind) this.instance).getShow();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkLiveBottomPopup.LiveBottomPopupRemindOrBuilder
            public String getTextColor() {
                return ((LiveBottomPopupRemind) this.instance).getTextColor();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkLiveBottomPopup.LiveBottomPopupRemindOrBuilder
            public ByteString getTextColorBytes() {
                return ((LiveBottomPopupRemind) this.instance).getTextColorBytes();
            }

            public Builder setClick(boolean z) {
                copyOnWrite();
                ((LiveBottomPopupRemind) this.instance).setClick(z);
                return this;
            }

            public Builder setShow(boolean z) {
                copyOnWrite();
                ((LiveBottomPopupRemind) this.instance).setShow(z);
                return this;
            }

            public Builder setTextColor(String str) {
                copyOnWrite();
                ((LiveBottomPopupRemind) this.instance).setTextColor(str);
                return this;
            }

            public Builder setTextColorBytes(ByteString byteString) {
                copyOnWrite();
                ((LiveBottomPopupRemind) this.instance).setTextColorBytes(byteString);
                return this;
            }
        }

        static {
            LiveBottomPopupRemind liveBottomPopupRemind = new LiveBottomPopupRemind();
            DEFAULT_INSTANCE = liveBottomPopupRemind;
            liveBottomPopupRemind.makeImmutable();
        }

        private LiveBottomPopupRemind() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearClick() {
            this.click_ = false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearShow() {
            this.show_ = false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearTextColor() {
            this.textColor_ = getDefaultInstance().getTextColor();
        }

        public static LiveBottomPopupRemind getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder(LiveBottomPopupRemind liveBottomPopupRemind) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(liveBottomPopupRemind);
        }

        public static LiveBottomPopupRemind parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (LiveBottomPopupRemind) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static LiveBottomPopupRemind parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (LiveBottomPopupRemind) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static i860<LiveBottomPopupRemind> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setClick(boolean z) {
            this.click_ = z;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setShow(boolean z) {
            this.show_ = z;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTextColor(String str) {
            str.getClass();
            this.textColor_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTextColorBytes(ByteString byteString) {
            byteString.getClass();
            AbstractC3403a.checkByteStringIsUtf8(byteString);
            this.textColor_ = byteString.toStringUtf8();
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (C44741.f15969xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new LiveBottomPopupRemind();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                    return null;
                case 4:
                    return new Builder();
                case 5:
                    GeneratedMessageLite.InterfaceC3386h interfaceC3386h = (GeneratedMessageLite.InterfaceC3386h) obj;
                    LiveBottomPopupRemind liveBottomPopupRemind = (LiveBottomPopupRemind) obj2;
                    boolean z = this.show_;
                    boolean z2 = liveBottomPopupRemind.show_;
                    this.show_ = interfaceC3386h.mo16995d(z, z, z2, z2);
                    boolean z3 = this.click_;
                    boolean z4 = liveBottomPopupRemind.click_;
                    this.click_ = interfaceC3386h.mo16995d(z3, z3, z4, z4);
                    this.textColor_ = interfaceC3386h.mo16997f(!this.textColor_.isEmpty(), this.textColor_, true ^ liveBottomPopupRemind.textColor_.isEmpty(), liveBottomPopupRemind.textColor_);
                    GeneratedMessageLite.C3385g c3385g = GeneratedMessageLite.C3385g.INSTANCE;
                    return this;
                case 6:
                    C3407e c3407e = (C3407e) obj;
                    boolean z5 = false;
                    while (!z5) {
                        try {
                            int iM17116M = c3407e.m17116M();
                            if (iM17116M != 0) {
                                if (iM17116M == 8) {
                                    this.show_ = c3407e.m17133m();
                                } else if (iM17116M == 16) {
                                    this.click_ = c3407e.m17133m();
                                } else if (iM17116M == 26) {
                                    this.textColor_ = c3407e.m17115L();
                                } else if (!c3407e.m17121R(iM17116M)) {
                                }
                            }
                            z5 = true;
                        } catch (InvalidProtocolBufferException e) {
                            aag0.m95543a(e.setUnfinishedMessage(this));
                            return null;
                        } catch (IOException e2) {
                            aag0.m95543a(new InvalidProtocolBufferException(e2.getMessage()).setUnfinishedMessage(this));
                            return null;
                        }
                    }
                    break;
                case 7:
                    break;
                case 8:
                    if (PARSER == null) {
                        synchronized (LiveBottomPopupRemind.class) {
                            try {
                                if (PARSER == null) {
                                    PARSER = new GeneratedMessageLite.C3381c(DEFAULT_INSTANCE);
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                            break;
                        }
                    }
                    return PARSER;
                default:
                    bz00.m104536a();
                    return null;
            }
            return DEFAULT_INSTANCE;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkLiveBottomPopup.LiveBottomPopupRemindOrBuilder
        public boolean getClick() {
            return this.click_;
        }

        @Override // com.google.protobuf.InterfaceC3419q
        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            boolean z = this.show_;
            int iM16915f = z ? CodedOutputStream.m16915f(1, z) : 0;
            boolean z2 = this.click_;
            if (z2) {
                iM16915f += CodedOutputStream.m16915f(2, z2);
            }
            if (!this.textColor_.isEmpty()) {
                iM16915f += CodedOutputStream.m16901K(3, getTextColor());
            }
            this.memoizedSerializedSize = iM16915f;
            return iM16915f;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkLiveBottomPopup.LiveBottomPopupRemindOrBuilder
        public boolean getShow() {
            return this.show_;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkLiveBottomPopup.LiveBottomPopupRemindOrBuilder
        public String getTextColor() {
            return this.textColor_;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkLiveBottomPopup.LiveBottomPopupRemindOrBuilder
        public ByteString getTextColorBytes() {
            return ByteString.copyFromUtf8(this.textColor_);
        }

        @Override // com.google.protobuf.InterfaceC3419q
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            boolean z = this.show_;
            if (z) {
                codedOutputStream.mo16950a0(1, z);
            }
            boolean z2 = this.click_;
            if (z2) {
                codedOutputStream.mo16950a0(2, z2);
            }
            if (this.textColor_.isEmpty()) {
                return;
            }
            codedOutputStream.mo16939D0(3, getTextColor());
        }

        public static LiveBottomPopupRemind parseDelimitedFrom(InputStream inputStream, C3410h c3410h) throws IOException {
            return (LiveBottomPopupRemind) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, c3410h);
        }

        public static LiveBottomPopupRemind parseFrom(ByteString byteString, C3410h c3410h) throws InvalidProtocolBufferException {
            return (LiveBottomPopupRemind) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, c3410h);
        }

        public static LiveBottomPopupRemind parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (LiveBottomPopupRemind) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static LiveBottomPopupRemind parseFrom(byte[] bArr, C3410h c3410h) throws InvalidProtocolBufferException {
            return (LiveBottomPopupRemind) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, c3410h);
        }

        public static LiveBottomPopupRemind parseFrom(InputStream inputStream) throws IOException {
            return (LiveBottomPopupRemind) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static LiveBottomPopupRemind parseFrom(InputStream inputStream, C3410h c3410h) throws IOException {
            return (LiveBottomPopupRemind) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, c3410h);
        }

        public static LiveBottomPopupRemind parseFrom(C3407e c3407e) throws IOException {
            return (LiveBottomPopupRemind) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, c3407e);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static LiveBottomPopupRemind parseFrom(C3407e c3407e, C3410h c3410h) throws IOException {
            return (LiveBottomPopupRemind) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, c3407e, c3410h);
        }
    }

    public enum LiveBottomPopupStyleTypeEnum implements C3414l.c {
        common(0),
        window(1),
        UNRECOGNIZED(-1);

        public static final int common_VALUE = 0;
        private static final C3414l.d<LiveBottomPopupStyleTypeEnum> internalValueMap = new C3414l.d<LiveBottomPopupStyleTypeEnum>() { // from class: com.p1.mobile.longlink.msg.liveroom.LongLinkLiveBottomPopup.LiveBottomPopupStyleTypeEnum.1
            @Override // com.google.protobuf.C3414l.d
            public LiveBottomPopupStyleTypeEnum findValueByNumber(int i) {
                return LiveBottomPopupStyleTypeEnum.forNumber(i);
            }
        };
        public static final int window_VALUE = 1;
        private final int value;

        LiveBottomPopupStyleTypeEnum(int i) {
            this.value = i;
        }

        public static LiveBottomPopupStyleTypeEnum forNumber(int i) {
            if (i == 0) {
                return common;
            }
            if (i != 1) {
                return null;
            }
            return window;
        }

        public static C3414l.d<LiveBottomPopupStyleTypeEnum> internalGetValueMap() {
            return internalValueMap;
        }

        @Override // com.google.protobuf.C3414l.c
        public final int getNumber() {
            return this.value;
        }

        @Deprecated
        public static LiveBottomPopupStyleTypeEnum valueOf(int i) {
            return forNumber(i);
        }
    }

    public static final class LiveBottomPopupToast extends GeneratedMessageLite<LiveBottomPopupToast, Builder> implements LiveBottomPopupToastOrBuilder {
        private static final LiveBottomPopupToast DEFAULT_INSTANCE;
        public static final int FAILTEXT_FIELD_NUMBER = 2;
        private static volatile i860<LiveBottomPopupToast> PARSER = null;
        public static final int SUCCESSTEXT_FIELD_NUMBER = 1;
        private String successText_ = "";
        private String failText_ = "";

        public static final class Builder extends GeneratedMessageLite.AbstractC3380b<LiveBottomPopupToast, Builder> implements LiveBottomPopupToastOrBuilder {
            private Builder() {
                super(LiveBottomPopupToast.DEFAULT_INSTANCE);
            }

            public Builder clearFailText() {
                copyOnWrite();
                ((LiveBottomPopupToast) this.instance).clearFailText();
                return this;
            }

            public Builder clearSuccessText() {
                copyOnWrite();
                ((LiveBottomPopupToast) this.instance).clearSuccessText();
                return this;
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkLiveBottomPopup.LiveBottomPopupToastOrBuilder
            public String getFailText() {
                return ((LiveBottomPopupToast) this.instance).getFailText();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkLiveBottomPopup.LiveBottomPopupToastOrBuilder
            public ByteString getFailTextBytes() {
                return ((LiveBottomPopupToast) this.instance).getFailTextBytes();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkLiveBottomPopup.LiveBottomPopupToastOrBuilder
            public String getSuccessText() {
                return ((LiveBottomPopupToast) this.instance).getSuccessText();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkLiveBottomPopup.LiveBottomPopupToastOrBuilder
            public ByteString getSuccessTextBytes() {
                return ((LiveBottomPopupToast) this.instance).getSuccessTextBytes();
            }

            public Builder setFailText(String str) {
                copyOnWrite();
                ((LiveBottomPopupToast) this.instance).setFailText(str);
                return this;
            }

            public Builder setFailTextBytes(ByteString byteString) {
                copyOnWrite();
                ((LiveBottomPopupToast) this.instance).setFailTextBytes(byteString);
                return this;
            }

            public Builder setSuccessText(String str) {
                copyOnWrite();
                ((LiveBottomPopupToast) this.instance).setSuccessText(str);
                return this;
            }

            public Builder setSuccessTextBytes(ByteString byteString) {
                copyOnWrite();
                ((LiveBottomPopupToast) this.instance).setSuccessTextBytes(byteString);
                return this;
            }
        }

        static {
            LiveBottomPopupToast liveBottomPopupToast = new LiveBottomPopupToast();
            DEFAULT_INSTANCE = liveBottomPopupToast;
            liveBottomPopupToast.makeImmutable();
        }

        private LiveBottomPopupToast() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearFailText() {
            this.failText_ = getDefaultInstance().getFailText();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearSuccessText() {
            this.successText_ = getDefaultInstance().getSuccessText();
        }

        public static LiveBottomPopupToast getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder(LiveBottomPopupToast liveBottomPopupToast) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(liveBottomPopupToast);
        }

        public static LiveBottomPopupToast parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (LiveBottomPopupToast) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static LiveBottomPopupToast parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (LiveBottomPopupToast) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static i860<LiveBottomPopupToast> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setFailText(String str) {
            str.getClass();
            this.failText_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setFailTextBytes(ByteString byteString) {
            byteString.getClass();
            AbstractC3403a.checkByteStringIsUtf8(byteString);
            this.failText_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSuccessText(String str) {
            str.getClass();
            this.successText_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSuccessTextBytes(ByteString byteString) {
            byteString.getClass();
            AbstractC3403a.checkByteStringIsUtf8(byteString);
            this.successText_ = byteString.toStringUtf8();
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (C44741.f15969xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new LiveBottomPopupToast();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                    return null;
                case 4:
                    return new Builder();
                case 5:
                    GeneratedMessageLite.InterfaceC3386h interfaceC3386h = (GeneratedMessageLite.InterfaceC3386h) obj;
                    LiveBottomPopupToast liveBottomPopupToast = (LiveBottomPopupToast) obj2;
                    this.successText_ = interfaceC3386h.mo16997f(!this.successText_.isEmpty(), this.successText_, !liveBottomPopupToast.successText_.isEmpty(), liveBottomPopupToast.successText_);
                    this.failText_ = interfaceC3386h.mo16997f(!this.failText_.isEmpty(), this.failText_, true ^ liveBottomPopupToast.failText_.isEmpty(), liveBottomPopupToast.failText_);
                    GeneratedMessageLite.C3385g c3385g = GeneratedMessageLite.C3385g.INSTANCE;
                    return this;
                case 6:
                    C3407e c3407e = (C3407e) obj;
                    boolean z = false;
                    while (!z) {
                        try {
                            int iM17116M = c3407e.m17116M();
                            if (iM17116M != 0) {
                                if (iM17116M == 10) {
                                    this.successText_ = c3407e.m17115L();
                                } else if (iM17116M == 18) {
                                    this.failText_ = c3407e.m17115L();
                                } else if (!c3407e.m17121R(iM17116M)) {
                                }
                            }
                            z = true;
                        } catch (InvalidProtocolBufferException e) {
                            aag0.m95543a(e.setUnfinishedMessage(this));
                            return null;
                        } catch (IOException e2) {
                            aag0.m95543a(new InvalidProtocolBufferException(e2.getMessage()).setUnfinishedMessage(this));
                            return null;
                        }
                    }
                    break;
                case 7:
                    break;
                case 8:
                    if (PARSER == null) {
                        synchronized (LiveBottomPopupToast.class) {
                            try {
                                if (PARSER == null) {
                                    PARSER = new GeneratedMessageLite.C3381c(DEFAULT_INSTANCE);
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                            break;
                        }
                    }
                    return PARSER;
                default:
                    bz00.m104536a();
                    return null;
            }
            return DEFAULT_INSTANCE;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkLiveBottomPopup.LiveBottomPopupToastOrBuilder
        public String getFailText() {
            return this.failText_;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkLiveBottomPopup.LiveBottomPopupToastOrBuilder
        public ByteString getFailTextBytes() {
            return ByteString.copyFromUtf8(this.failText_);
        }

        @Override // com.google.protobuf.InterfaceC3419q
        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int iM16901K = !this.successText_.isEmpty() ? CodedOutputStream.m16901K(1, getSuccessText()) : 0;
            if (!this.failText_.isEmpty()) {
                iM16901K += CodedOutputStream.m16901K(2, getFailText());
            }
            this.memoizedSerializedSize = iM16901K;
            return iM16901K;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkLiveBottomPopup.LiveBottomPopupToastOrBuilder
        public String getSuccessText() {
            return this.successText_;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkLiveBottomPopup.LiveBottomPopupToastOrBuilder
        public ByteString getSuccessTextBytes() {
            return ByteString.copyFromUtf8(this.successText_);
        }

        @Override // com.google.protobuf.InterfaceC3419q
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (!this.successText_.isEmpty()) {
                codedOutputStream.mo16939D0(1, getSuccessText());
            }
            if (this.failText_.isEmpty()) {
                return;
            }
            codedOutputStream.mo16939D0(2, getFailText());
        }

        public static LiveBottomPopupToast parseDelimitedFrom(InputStream inputStream, C3410h c3410h) throws IOException {
            return (LiveBottomPopupToast) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, c3410h);
        }

        public static LiveBottomPopupToast parseFrom(ByteString byteString, C3410h c3410h) throws InvalidProtocolBufferException {
            return (LiveBottomPopupToast) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, c3410h);
        }

        public static LiveBottomPopupToast parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (LiveBottomPopupToast) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static LiveBottomPopupToast parseFrom(byte[] bArr, C3410h c3410h) throws InvalidProtocolBufferException {
            return (LiveBottomPopupToast) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, c3410h);
        }

        public static LiveBottomPopupToast parseFrom(InputStream inputStream) throws IOException {
            return (LiveBottomPopupToast) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static LiveBottomPopupToast parseFrom(InputStream inputStream, C3410h c3410h) throws IOException {
            return (LiveBottomPopupToast) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, c3410h);
        }

        public static LiveBottomPopupToast parseFrom(C3407e c3407e) throws IOException {
            return (LiveBottomPopupToast) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, c3407e);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static LiveBottomPopupToast parseFrom(C3407e c3407e, C3410h c3410h) throws IOException {
            return (LiveBottomPopupToast) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, c3407e, c3410h);
        }
    }

    public static final class LiveBottomWindown extends GeneratedMessageLite<LiveBottomWindown, Builder> implements LiveBottomWindownOrBuilder {
        public static final int BACKGROUNDCOLOR_FIELD_NUMBER = 3;
        private static final LiveBottomWindown DEFAULT_INSTANCE;
        private static volatile i860<LiveBottomWindown> PARSER = null;
        public static final int PICTURE_FIELD_NUMBER = 1;
        public static final int TEXT_FIELD_NUMBER = 2;
        private int bitField0_;
        private String picture_ = "";
        private C3414l.h<LiveBottomContent> text_ = GeneratedMessageLite.emptyProtobufList();
        private String backgroundColor_ = "";

        static {
            LiveBottomWindown liveBottomWindown = new LiveBottomWindown();
            DEFAULT_INSTANCE = liveBottomWindown;
            liveBottomWindown.makeImmutable();
        }

        private LiveBottomWindown() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllText(Iterable<? extends LiveBottomContent> iterable) {
            ensureTextIsMutable();
            AbstractC3403a.addAll(iterable, this.text_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addText(LiveBottomContent.Builder builder) {
            ensureTextIsMutable();
            this.text_.add(builder.build());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearBackgroundColor() {
            this.backgroundColor_ = getDefaultInstance().getBackgroundColor();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearPicture() {
            this.picture_ = getDefaultInstance().getPicture();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearText() {
            this.text_ = GeneratedMessageLite.emptyProtobufList();
        }

        private void ensureTextIsMutable() {
            if (this.text_.mo17085q()) {
                return;
            }
            this.text_ = GeneratedMessageLite.mutableCopy(this.text_);
        }

        public static LiveBottomWindown getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder(LiveBottomWindown liveBottomWindown) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(liveBottomWindown);
        }

        public static LiveBottomWindown parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (LiveBottomWindown) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static LiveBottomWindown parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (LiveBottomWindown) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static i860<LiveBottomWindown> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void removeText(int i) {
            ensureTextIsMutable();
            this.text_.remove(i);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setBackgroundColor(String str) {
            str.getClass();
            this.backgroundColor_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setBackgroundColorBytes(ByteString byteString) {
            byteString.getClass();
            AbstractC3403a.checkByteStringIsUtf8(byteString);
            this.backgroundColor_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setPicture(String str) {
            str.getClass();
            this.picture_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setPictureBytes(ByteString byteString) {
            byteString.getClass();
            AbstractC3403a.checkByteStringIsUtf8(byteString);
            this.picture_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setText(int i, LiveBottomContent.Builder builder) {
            ensureTextIsMutable();
            this.text_.set(i, builder.build());
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (C44741.f15969xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new LiveBottomWindown();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                    this.text_.mo17084n();
                    return null;
                case 4:
                    return new Builder();
                case 5:
                    GeneratedMessageLite.InterfaceC3386h interfaceC3386h = (GeneratedMessageLite.InterfaceC3386h) obj;
                    LiveBottomWindown liveBottomWindown = (LiveBottomWindown) obj2;
                    this.picture_ = interfaceC3386h.mo16997f(!this.picture_.isEmpty(), this.picture_, !liveBottomWindown.picture_.isEmpty(), liveBottomWindown.picture_);
                    this.text_ = interfaceC3386h.mo16998g(this.text_, liveBottomWindown.text_);
                    this.backgroundColor_ = interfaceC3386h.mo16997f(!this.backgroundColor_.isEmpty(), this.backgroundColor_, true ^ liveBottomWindown.backgroundColor_.isEmpty(), liveBottomWindown.backgroundColor_);
                    if (interfaceC3386h == GeneratedMessageLite.C3385g.INSTANCE) {
                        this.bitField0_ |= liveBottomWindown.bitField0_;
                    }
                    return this;
                case 6:
                    C3407e c3407e = (C3407e) obj;
                    C3410h c3410h = (C3410h) obj2;
                    boolean z = false;
                    while (!z) {
                        try {
                            int iM17116M = c3407e.m17116M();
                            if (iM17116M != 0) {
                                if (iM17116M == 10) {
                                    this.picture_ = c3407e.m17115L();
                                } else if (iM17116M == 18) {
                                    if (!this.text_.mo17085q()) {
                                        this.text_ = GeneratedMessageLite.mutableCopy(this.text_);
                                    }
                                    this.text_.add((LiveBottomContent) c3407e.m17143w(LiveBottomContent.parser(), c3410h));
                                } else if (iM17116M == 26) {
                                    this.backgroundColor_ = c3407e.m17115L();
                                } else if (!c3407e.m17121R(iM17116M)) {
                                }
                            }
                            z = true;
                        } catch (InvalidProtocolBufferException e) {
                            aag0.m95543a(e.setUnfinishedMessage(this));
                            return null;
                        } catch (IOException e2) {
                            aag0.m95543a(new InvalidProtocolBufferException(e2.getMessage()).setUnfinishedMessage(this));
                            return null;
                        }
                    }
                    break;
                case 7:
                    break;
                case 8:
                    if (PARSER == null) {
                        synchronized (LiveBottomWindown.class) {
                            try {
                                if (PARSER == null) {
                                    PARSER = new GeneratedMessageLite.C3381c(DEFAULT_INSTANCE);
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                            break;
                        }
                    }
                    return PARSER;
                default:
                    bz00.m104536a();
                    return null;
            }
            return DEFAULT_INSTANCE;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkLiveBottomPopup.LiveBottomWindownOrBuilder
        public String getBackgroundColor() {
            return this.backgroundColor_;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkLiveBottomPopup.LiveBottomWindownOrBuilder
        public ByteString getBackgroundColorBytes() {
            return ByteString.copyFromUtf8(this.backgroundColor_);
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkLiveBottomPopup.LiveBottomWindownOrBuilder
        public String getPicture() {
            return this.picture_;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkLiveBottomPopup.LiveBottomWindownOrBuilder
        public ByteString getPictureBytes() {
            return ByteString.copyFromUtf8(this.picture_);
        }

        @Override // com.google.protobuf.InterfaceC3419q
        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int iM16901K = !this.picture_.isEmpty() ? CodedOutputStream.m16901K(1, getPicture()) : 0;
            for (int i2 = 0; i2 < this.text_.size(); i2++) {
                iM16901K += CodedOutputStream.m16893C(2, this.text_.get(i2));
            }
            if (!this.backgroundColor_.isEmpty()) {
                iM16901K += CodedOutputStream.m16901K(3, getBackgroundColor());
            }
            this.memoizedSerializedSize = iM16901K;
            return iM16901K;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkLiveBottomPopup.LiveBottomWindownOrBuilder
        public LiveBottomContent getText(int i) {
            return this.text_.get(i);
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkLiveBottomPopup.LiveBottomWindownOrBuilder
        public int getTextCount() {
            return this.text_.size();
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkLiveBottomPopup.LiveBottomWindownOrBuilder
        public List<LiveBottomContent> getTextList() {
            return this.text_;
        }

        public LiveBottomContentOrBuilder getTextOrBuilder(int i) {
            return this.text_.get(i);
        }

        public List<? extends LiveBottomContentOrBuilder> getTextOrBuilderList() {
            return this.text_;
        }

        @Override // com.google.protobuf.InterfaceC3419q
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (!this.picture_.isEmpty()) {
                codedOutputStream.mo16939D0(1, getPicture());
            }
            for (int i = 0; i < this.text_.size(); i++) {
                codedOutputStream.mo16974w0(2, this.text_.get(i));
            }
            if (this.backgroundColor_.isEmpty()) {
                return;
            }
            codedOutputStream.mo16939D0(3, getBackgroundColor());
        }

        public static LiveBottomWindown parseDelimitedFrom(InputStream inputStream, C3410h c3410h) throws IOException {
            return (LiveBottomWindown) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, c3410h);
        }

        public static LiveBottomWindown parseFrom(ByteString byteString, C3410h c3410h) throws InvalidProtocolBufferException {
            return (LiveBottomWindown) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, c3410h);
        }

        public static final class Builder extends GeneratedMessageLite.AbstractC3380b<LiveBottomWindown, Builder> implements LiveBottomWindownOrBuilder {
            private Builder() {
                super(LiveBottomWindown.DEFAULT_INSTANCE);
            }

            public Builder addAllText(Iterable<? extends LiveBottomContent> iterable) {
                copyOnWrite();
                ((LiveBottomWindown) this.instance).addAllText(iterable);
                return this;
            }

            public Builder addText(LiveBottomContent liveBottomContent) {
                copyOnWrite();
                ((LiveBottomWindown) this.instance).addText(liveBottomContent);
                return this;
            }

            public Builder clearBackgroundColor() {
                copyOnWrite();
                ((LiveBottomWindown) this.instance).clearBackgroundColor();
                return this;
            }

            public Builder clearPicture() {
                copyOnWrite();
                ((LiveBottomWindown) this.instance).clearPicture();
                return this;
            }

            public Builder clearText() {
                copyOnWrite();
                ((LiveBottomWindown) this.instance).clearText();
                return this;
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkLiveBottomPopup.LiveBottomWindownOrBuilder
            public String getBackgroundColor() {
                return ((LiveBottomWindown) this.instance).getBackgroundColor();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkLiveBottomPopup.LiveBottomWindownOrBuilder
            public ByteString getBackgroundColorBytes() {
                return ((LiveBottomWindown) this.instance).getBackgroundColorBytes();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkLiveBottomPopup.LiveBottomWindownOrBuilder
            public String getPicture() {
                return ((LiveBottomWindown) this.instance).getPicture();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkLiveBottomPopup.LiveBottomWindownOrBuilder
            public ByteString getPictureBytes() {
                return ((LiveBottomWindown) this.instance).getPictureBytes();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkLiveBottomPopup.LiveBottomWindownOrBuilder
            public LiveBottomContent getText(int i) {
                return ((LiveBottomWindown) this.instance).getText(i);
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkLiveBottomPopup.LiveBottomWindownOrBuilder
            public int getTextCount() {
                return ((LiveBottomWindown) this.instance).getTextCount();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkLiveBottomPopup.LiveBottomWindownOrBuilder
            public List<LiveBottomContent> getTextList() {
                return Collections.unmodifiableList(((LiveBottomWindown) this.instance).getTextList());
            }

            public Builder removeText(int i) {
                copyOnWrite();
                ((LiveBottomWindown) this.instance).removeText(i);
                return this;
            }

            public Builder setBackgroundColor(String str) {
                copyOnWrite();
                ((LiveBottomWindown) this.instance).setBackgroundColor(str);
                return this;
            }

            public Builder setBackgroundColorBytes(ByteString byteString) {
                copyOnWrite();
                ((LiveBottomWindown) this.instance).setBackgroundColorBytes(byteString);
                return this;
            }

            public Builder setPicture(String str) {
                copyOnWrite();
                ((LiveBottomWindown) this.instance).setPicture(str);
                return this;
            }

            public Builder setPictureBytes(ByteString byteString) {
                copyOnWrite();
                ((LiveBottomWindown) this.instance).setPictureBytes(byteString);
                return this;
            }

            public Builder setText(int i, LiveBottomContent liveBottomContent) {
                copyOnWrite();
                ((LiveBottomWindown) this.instance).setText(i, liveBottomContent);
                return this;
            }

            public Builder addText(int i, LiveBottomContent liveBottomContent) {
                copyOnWrite();
                ((LiveBottomWindown) this.instance).addText(i, liveBottomContent);
                return this;
            }

            public Builder setText(int i, LiveBottomContent.Builder builder) {
                copyOnWrite();
                ((LiveBottomWindown) this.instance).setText(i, builder);
                return this;
            }

            public Builder addText(LiveBottomContent.Builder builder) {
                copyOnWrite();
                ((LiveBottomWindown) this.instance).addText(builder);
                return this;
            }

            public Builder addText(int i, LiveBottomContent.Builder builder) {
                copyOnWrite();
                ((LiveBottomWindown) this.instance).addText(i, builder);
                return this;
            }
        }

        public static LiveBottomWindown parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (LiveBottomWindown) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static LiveBottomWindown parseFrom(byte[] bArr, C3410h c3410h) throws InvalidProtocolBufferException {
            return (LiveBottomWindown) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, c3410h);
        }

        public static LiveBottomWindown parseFrom(InputStream inputStream) throws IOException {
            return (LiveBottomWindown) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static LiveBottomWindown parseFrom(InputStream inputStream, C3410h c3410h) throws IOException {
            return (LiveBottomWindown) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, c3410h);
        }

        public static LiveBottomWindown parseFrom(C3407e c3407e) throws IOException {
            return (LiveBottomWindown) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, c3407e);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addText(int i, LiveBottomContent liveBottomContent) {
            liveBottomContent.getClass();
            ensureTextIsMutable();
            this.text_.add(i, liveBottomContent);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static LiveBottomWindown parseFrom(C3407e c3407e, C3410h c3410h) throws IOException {
            return (LiveBottomWindown) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, c3407e, c3410h);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setText(int i, LiveBottomContent liveBottomContent) {
            liveBottomContent.getClass();
            ensureTextIsMutable();
            this.text_.set(i, liveBottomContent);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addText(LiveBottomContent liveBottomContent) {
            liveBottomContent.getClass();
            ensureTextIsMutable();
            this.text_.add(liveBottomContent);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addText(int i, LiveBottomContent.Builder builder) {
            ensureTextIsMutable();
            this.text_.add(i, builder.build());
        }
    }

    public static final class VideoLiveToast extends GeneratedMessageLite<VideoLiveToast, Builder> implements VideoLiveToastOrBuilder {
        private static final VideoLiveToast DEFAULT_INSTANCE;
        private static volatile i860<VideoLiveToast> PARSER = null;
        public static final int ROOMID_FIELD_NUMBER = 2;
        public static final int TOAST_FIELD_NUMBER = 1;
        private String toast_ = "";
        private String roomId_ = "";

        public static final class Builder extends GeneratedMessageLite.AbstractC3380b<VideoLiveToast, Builder> implements VideoLiveToastOrBuilder {
            private Builder() {
                super(VideoLiveToast.DEFAULT_INSTANCE);
            }

            public Builder clearRoomId() {
                copyOnWrite();
                ((VideoLiveToast) this.instance).clearRoomId();
                return this;
            }

            public Builder clearToast() {
                copyOnWrite();
                ((VideoLiveToast) this.instance).clearToast();
                return this;
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkLiveBottomPopup.VideoLiveToastOrBuilder
            public String getRoomId() {
                return ((VideoLiveToast) this.instance).getRoomId();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkLiveBottomPopup.VideoLiveToastOrBuilder
            public ByteString getRoomIdBytes() {
                return ((VideoLiveToast) this.instance).getRoomIdBytes();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkLiveBottomPopup.VideoLiveToastOrBuilder
            public String getToast() {
                return ((VideoLiveToast) this.instance).getToast();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkLiveBottomPopup.VideoLiveToastOrBuilder
            public ByteString getToastBytes() {
                return ((VideoLiveToast) this.instance).getToastBytes();
            }

            public Builder setRoomId(String str) {
                copyOnWrite();
                ((VideoLiveToast) this.instance).setRoomId(str);
                return this;
            }

            public Builder setRoomIdBytes(ByteString byteString) {
                copyOnWrite();
                ((VideoLiveToast) this.instance).setRoomIdBytes(byteString);
                return this;
            }

            public Builder setToast(String str) {
                copyOnWrite();
                ((VideoLiveToast) this.instance).setToast(str);
                return this;
            }

            public Builder setToastBytes(ByteString byteString) {
                copyOnWrite();
                ((VideoLiveToast) this.instance).setToastBytes(byteString);
                return this;
            }
        }

        static {
            VideoLiveToast videoLiveToast = new VideoLiveToast();
            DEFAULT_INSTANCE = videoLiveToast;
            videoLiveToast.makeImmutable();
        }

        private VideoLiveToast() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearRoomId() {
            this.roomId_ = getDefaultInstance().getRoomId();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearToast() {
            this.toast_ = getDefaultInstance().getToast();
        }

        public static VideoLiveToast getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder(VideoLiveToast videoLiveToast) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(videoLiveToast);
        }

        public static VideoLiveToast parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (VideoLiveToast) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static VideoLiveToast parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (VideoLiveToast) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static i860<VideoLiveToast> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setRoomId(String str) {
            str.getClass();
            this.roomId_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setRoomIdBytes(ByteString byteString) {
            byteString.getClass();
            AbstractC3403a.checkByteStringIsUtf8(byteString);
            this.roomId_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setToast(String str) {
            str.getClass();
            this.toast_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setToastBytes(ByteString byteString) {
            byteString.getClass();
            AbstractC3403a.checkByteStringIsUtf8(byteString);
            this.toast_ = byteString.toStringUtf8();
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (C44741.f15969xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new VideoLiveToast();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                    return null;
                case 4:
                    return new Builder();
                case 5:
                    GeneratedMessageLite.InterfaceC3386h interfaceC3386h = (GeneratedMessageLite.InterfaceC3386h) obj;
                    VideoLiveToast videoLiveToast = (VideoLiveToast) obj2;
                    this.toast_ = interfaceC3386h.mo16997f(!this.toast_.isEmpty(), this.toast_, !videoLiveToast.toast_.isEmpty(), videoLiveToast.toast_);
                    this.roomId_ = interfaceC3386h.mo16997f(!this.roomId_.isEmpty(), this.roomId_, true ^ videoLiveToast.roomId_.isEmpty(), videoLiveToast.roomId_);
                    GeneratedMessageLite.C3385g c3385g = GeneratedMessageLite.C3385g.INSTANCE;
                    return this;
                case 6:
                    C3407e c3407e = (C3407e) obj;
                    boolean z = false;
                    while (!z) {
                        try {
                            int iM17116M = c3407e.m17116M();
                            if (iM17116M != 0) {
                                if (iM17116M == 10) {
                                    this.toast_ = c3407e.m17115L();
                                } else if (iM17116M == 18) {
                                    this.roomId_ = c3407e.m17115L();
                                } else if (!c3407e.m17121R(iM17116M)) {
                                }
                            }
                            z = true;
                        } catch (InvalidProtocolBufferException e) {
                            aag0.m95543a(e.setUnfinishedMessage(this));
                            return null;
                        } catch (IOException e2) {
                            aag0.m95543a(new InvalidProtocolBufferException(e2.getMessage()).setUnfinishedMessage(this));
                            return null;
                        }
                    }
                    break;
                case 7:
                    break;
                case 8:
                    if (PARSER == null) {
                        synchronized (VideoLiveToast.class) {
                            try {
                                if (PARSER == null) {
                                    PARSER = new GeneratedMessageLite.C3381c(DEFAULT_INSTANCE);
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                            break;
                        }
                    }
                    return PARSER;
                default:
                    bz00.m104536a();
                    return null;
            }
            return DEFAULT_INSTANCE;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkLiveBottomPopup.VideoLiveToastOrBuilder
        public String getRoomId() {
            return this.roomId_;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkLiveBottomPopup.VideoLiveToastOrBuilder
        public ByteString getRoomIdBytes() {
            return ByteString.copyFromUtf8(this.roomId_);
        }

        @Override // com.google.protobuf.InterfaceC3419q
        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int iM16901K = !this.toast_.isEmpty() ? CodedOutputStream.m16901K(1, getToast()) : 0;
            if (!this.roomId_.isEmpty()) {
                iM16901K += CodedOutputStream.m16901K(2, getRoomId());
            }
            this.memoizedSerializedSize = iM16901K;
            return iM16901K;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkLiveBottomPopup.VideoLiveToastOrBuilder
        public String getToast() {
            return this.toast_;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkLiveBottomPopup.VideoLiveToastOrBuilder
        public ByteString getToastBytes() {
            return ByteString.copyFromUtf8(this.toast_);
        }

        @Override // com.google.protobuf.InterfaceC3419q
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (!this.toast_.isEmpty()) {
                codedOutputStream.mo16939D0(1, getToast());
            }
            if (this.roomId_.isEmpty()) {
                return;
            }
            codedOutputStream.mo16939D0(2, getRoomId());
        }

        public static VideoLiveToast parseDelimitedFrom(InputStream inputStream, C3410h c3410h) throws IOException {
            return (VideoLiveToast) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, c3410h);
        }

        public static VideoLiveToast parseFrom(ByteString byteString, C3410h c3410h) throws InvalidProtocolBufferException {
            return (VideoLiveToast) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, c3410h);
        }

        public static VideoLiveToast parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (VideoLiveToast) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static VideoLiveToast parseFrom(byte[] bArr, C3410h c3410h) throws InvalidProtocolBufferException {
            return (VideoLiveToast) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, c3410h);
        }

        public static VideoLiveToast parseFrom(InputStream inputStream) throws IOException {
            return (VideoLiveToast) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static VideoLiveToast parseFrom(InputStream inputStream, C3410h c3410h) throws IOException {
            return (VideoLiveToast) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, c3410h);
        }

        public static VideoLiveToast parseFrom(C3407e c3407e) throws IOException {
            return (VideoLiveToast) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, c3407e);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static VideoLiveToast parseFrom(C3407e c3407e, C3410h c3410h) throws IOException {
            return (VideoLiveToast) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, c3407e, c3410h);
        }
    }
}
