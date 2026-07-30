package com.p003p1.mobile.longlink.msg.liveroom;

import com.google.protobuf.ByteString;
import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.a;
import com.google.protobuf.e;
import com.google.protobuf.h;
import com.google.protobuf.l;
import com.google.protobuf.q;
import com.momo.xeengine.gift.XEGiftErrorCode;
import java.io.IOException;
import java.io.InputStream;
import java.util.Collections;
import java.util.List;
import l.aag0;
import l.bz00;
import l.i860;
import l.o6z;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes8.dex */
public final class LongLinkLiveBottomPopup {

    /* JADX INFO: renamed from: com.p1.mobile.longlink.msg.liveroom.LongLinkLiveBottomPopup$1 */
    public static /* synthetic */ class C03861 {

        /* JADX INFO: renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f1668xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f1668xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f1668xa1df5c61[GeneratedMessageLite.MethodToInvoke.IS_INITIALIZED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f1668xa1df5c61[GeneratedMessageLite.MethodToInvoke.MAKE_IMMUTABLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f1668xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f1668xa1df5c61[GeneratedMessageLite.MethodToInvoke.VISIT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f1668xa1df5c61[GeneratedMessageLite.MethodToInvoke.MERGE_FROM_STREAM.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f1668xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f1668xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    public interface LiveBottomContentOrBuilder extends o6z {
        LiveBottomCountdownOverActionEnum getCountDownOverAction();

        int getCountDownOverActionValue();

        long getCountdownCurrentTime();

        long getCountdownEndTime();

        /* synthetic */ q getDefaultInstanceForType();

        String getText();

        ByteString getTextBytes();

        String getTextColor();

        ByteString getTextColorBytes();

        LiveBottomContentTypeEnum getType();

        int getTypeValue();

        String getUrl();

        ByteString getUrlBytes();

        /* synthetic */ boolean isInitialized();
    }

    public interface LiveBottomPopupButtonOrBuilder extends o6z {
        /* synthetic */ q getDefaultInstanceForType();

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

        /* synthetic */ boolean isInitialized();
    }

    public interface LiveBottomPopupHeaderOrBuilder extends o6z {
        /* synthetic */ q getDefaultInstanceForType();

        LiveBottomPopupHeader.Position getPosition();

        int getPositionValue();

        String getTextColor();

        ByteString getTextColorBytes();

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

        /* synthetic */ q getDefaultInstanceForType();

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

        /* synthetic */ boolean isInitialized();
    }

    public interface LiveBottomPopupRemindOrBuilder extends o6z {
        boolean getClick();

        /* synthetic */ q getDefaultInstanceForType();

        boolean getShow();

        String getTextColor();

        ByteString getTextColorBytes();

        /* synthetic */ boolean isInitialized();
    }

    public interface LiveBottomPopupToastOrBuilder extends o6z {
        /* synthetic */ q getDefaultInstanceForType();

        String getFailText();

        ByteString getFailTextBytes();

        String getSuccessText();

        ByteString getSuccessTextBytes();

        /* synthetic */ boolean isInitialized();
    }

    public interface LiveBottomWindownOrBuilder extends o6z {
        String getBackgroundColor();

        ByteString getBackgroundColorBytes();

        /* synthetic */ q getDefaultInstanceForType();

        String getPicture();

        ByteString getPictureBytes();

        LiveBottomContent getText(int i);

        int getTextCount();

        List<LiveBottomContent> getTextList();

        /* synthetic */ boolean isInitialized();
    }

    public interface VideoLiveToastOrBuilder extends o6z {
        /* synthetic */ q getDefaultInstanceForType();

        String getRoomId();

        ByteString getRoomIdBytes();

        String getToast();

        ByteString getToastBytes();

        /* synthetic */ boolean isInitialized();
    }

    private LongLinkLiveBottomPopup() {
    }

    public static void registerAllExtensions(h hVar) {
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
        private l.h<LiveBottomContent> richText_ = GeneratedMessageLite.emptyProtobufList();

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
            a.addAll(iterable, this.richText_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addRichText(LiveBottomContent.Builder builder) {
            ensureRichTextIsMutable();
            this.richText_.add((LiveBottomContent) builder.build());
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
            if (this.richText_.q()) {
                return;
            }
            this.richText_ = GeneratedMessageLite.mutableCopy(this.richText_);
        }

        public static LiveBottomPopupButton getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder(LiveBottomPopupButton liveBottomPopupButton) {
            return (Builder) ((Builder) DEFAULT_INSTANCE.toBuilder()).mergeFrom(liveBottomPopupButton);
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
            a.checkByteStringIsUtf8(byteString);
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
            a.checkByteStringIsUtf8(byteString);
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
            a.checkByteStringIsUtf8(byteString);
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
            this.richText_.set(i, (LiveBottomContent) builder.build());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setStartAfterColor(String str) {
            str.getClass();
            this.startAfterColor_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setStartAfterColorBytes(ByteString byteString) {
            byteString.getClass();
            a.checkByteStringIsUtf8(byteString);
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
            a.checkByteStringIsUtf8(byteString);
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
            a.checkByteStringIsUtf8(byteString);
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
            a.checkByteStringIsUtf8(byteString);
            this.textColor_ = byteString.toStringUtf8();
        }

        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            boolean z = false;
            switch (C03861.f1668xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new LiveBottomPopupButton();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                    this.richText_.n();
                    return null;
                case 4:
                    return new Builder();
                case 5:
                    GeneratedMessageLite.g gVar = (GeneratedMessageLite.h) obj;
                    LiveBottomPopupButton liveBottomPopupButton = (LiveBottomPopupButton) obj2;
                    this.text_ = gVar.f(!this.text_.isEmpty(), this.text_, !liveBottomPopupButton.text_.isEmpty(), liveBottomPopupButton.text_);
                    this.textColor_ = gVar.f(!this.textColor_.isEmpty(), this.textColor_, !liveBottomPopupButton.textColor_.isEmpty(), liveBottomPopupButton.textColor_);
                    this.startColor_ = gVar.f(!this.startColor_.isEmpty(), this.startColor_, !liveBottomPopupButton.startColor_.isEmpty(), liveBottomPopupButton.startColor_);
                    this.endColor_ = gVar.f(!this.endColor_.isEmpty(), this.endColor_, !liveBottomPopupButton.endColor_.isEmpty(), liveBottomPopupButton.endColor_);
                    int i = this.jumpType_;
                    boolean z2 = i != 0;
                    int i2 = liveBottomPopupButton.jumpType_;
                    this.jumpType_ = gVar.e(z2, i, i2 != 0, i2);
                    this.jumpSchema_ = gVar.f(!this.jumpSchema_.isEmpty(), this.jumpSchema_, !liveBottomPopupButton.jumpSchema_.isEmpty(), liveBottomPopupButton.jumpSchema_);
                    this.startAfterColor_ = gVar.f(!this.startAfterColor_.isEmpty(), this.startAfterColor_, !liveBottomPopupButton.startAfterColor_.isEmpty(), liveBottomPopupButton.startAfterColor_);
                    this.endAfterColor_ = gVar.f(!this.endAfterColor_.isEmpty(), this.endAfterColor_, !liveBottomPopupButton.endAfterColor_.isEmpty(), liveBottomPopupButton.endAfterColor_);
                    this.richText_ = gVar.g(this.richText_, liveBottomPopupButton.richText_);
                    if (gVar == GeneratedMessageLite.g.INSTANCE) {
                        this.bitField0_ |= liveBottomPopupButton.bitField0_;
                    }
                    return this;
                case 6:
                    e eVar = (e) obj;
                    h hVar = (h) obj2;
                    while (!z) {
                        try {
                            int iM = eVar.M();
                            if (iM != 0) {
                                if (iM == 10) {
                                    this.text_ = eVar.L();
                                } else if (iM == 18) {
                                    this.textColor_ = eVar.L();
                                } else if (iM == 26) {
                                    this.startColor_ = eVar.L();
                                } else if (iM == 34) {
                                    this.endColor_ = eVar.L();
                                } else if (iM == 40) {
                                    this.jumpType_ = eVar.p();
                                } else if (iM == 50) {
                                    this.jumpSchema_ = eVar.L();
                                } else if (iM == 58) {
                                    this.startAfterColor_ = eVar.L();
                                } else if (iM == 66) {
                                    this.endAfterColor_ = eVar.L();
                                } else if (iM == 74) {
                                    if (!this.richText_.q()) {
                                        this.richText_ = GeneratedMessageLite.mutableCopy(this.richText_);
                                    }
                                    this.richText_.add(eVar.w(LiveBottomContent.parser(), hVar));
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
                        synchronized (LiveBottomPopupButton.class) {
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
            return (LiveBottomContent) this.richText_.get(i);
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
            return (LiveBottomContentOrBuilder) this.richText_.get(i);
        }

        public List<? extends LiveBottomContentOrBuilder> getRichTextOrBuilderList() {
            return this.richText_;
        }

        public int getSerializedSize() {
            int i = ((GeneratedMessageLite) this).memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int iK = !this.text_.isEmpty() ? CodedOutputStream.K(1, getText()) : 0;
            if (!this.textColor_.isEmpty()) {
                iK += CodedOutputStream.K(2, getTextColor());
            }
            if (!this.startColor_.isEmpty()) {
                iK += CodedOutputStream.K(3, getStartColor());
            }
            if (!this.endColor_.isEmpty()) {
                iK += CodedOutputStream.K(4, getEndColor());
            }
            if (this.jumpType_ != LiveBottomPopupButtonJumpType.url.getNumber()) {
                iK += CodedOutputStream.m(5, this.jumpType_);
            }
            if (!this.jumpSchema_.isEmpty()) {
                iK += CodedOutputStream.K(6, getJumpSchema());
            }
            if (!this.startAfterColor_.isEmpty()) {
                iK += CodedOutputStream.K(7, getStartAfterColor());
            }
            if (!this.endAfterColor_.isEmpty()) {
                iK += CodedOutputStream.K(8, getEndAfterColor());
            }
            for (int i2 = 0; i2 < this.richText_.size(); i2++) {
                iK += CodedOutputStream.C(9, (q) this.richText_.get(i2));
            }
            ((GeneratedMessageLite) this).memoizedSerializedSize = iK;
            return iK;
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

        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (!this.text_.isEmpty()) {
                codedOutputStream.D0(1, getText());
            }
            if (!this.textColor_.isEmpty()) {
                codedOutputStream.D0(2, getTextColor());
            }
            if (!this.startColor_.isEmpty()) {
                codedOutputStream.D0(3, getStartColor());
            }
            if (!this.endColor_.isEmpty()) {
                codedOutputStream.D0(4, getEndColor());
            }
            if (this.jumpType_ != LiveBottomPopupButtonJumpType.url.getNumber()) {
                codedOutputStream.i0(5, this.jumpType_);
            }
            if (!this.jumpSchema_.isEmpty()) {
                codedOutputStream.D0(6, getJumpSchema());
            }
            if (!this.startAfterColor_.isEmpty()) {
                codedOutputStream.D0(7, getStartAfterColor());
            }
            if (!this.endAfterColor_.isEmpty()) {
                codedOutputStream.D0(8, getEndAfterColor());
            }
            for (int i = 0; i < this.richText_.size(); i++) {
                codedOutputStream.w0(9, (q) this.richText_.get(i));
            }
        }

        public enum LiveBottomPopupButtonJumpType implements l.c {
            url(0),
            schema(1),
            UNRECOGNIZED(-1);

            private static final l.d<LiveBottomPopupButtonJumpType> internalValueMap = new l.d<LiveBottomPopupButtonJumpType>() { // from class: com.p1.mobile.longlink.msg.liveroom.LongLinkLiveBottomPopup.LiveBottomPopupButton.LiveBottomPopupButtonJumpType.1
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

            public static l.d<LiveBottomPopupButtonJumpType> internalGetValueMap() {
                return internalValueMap;
            }

            public final int getNumber() {
                return this.value;
            }

            @Deprecated
            public static LiveBottomPopupButtonJumpType valueOf(int i) {
                return forNumber(i);
            }
        }

        public static LiveBottomPopupButton parseDelimitedFrom(InputStream inputStream, h hVar) throws IOException {
            return (LiveBottomPopupButton) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, hVar);
        }

        public static LiveBottomPopupButton parseFrom(ByteString byteString, h hVar) throws InvalidProtocolBufferException {
            return (LiveBottomPopupButton) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, hVar);
        }

        public static final class Builder extends GeneratedMessageLite.b<LiveBottomPopupButton, Builder> implements LiveBottomPopupButtonOrBuilder {
            private Builder() {
                super(LiveBottomPopupButton.DEFAULT_INSTANCE);
            }

            public Builder addAllRichText(Iterable<? extends LiveBottomContent> iterable) {
                copyOnWrite();
                ((LiveBottomPopupButton) ((GeneratedMessageLite.b) this).instance).addAllRichText(iterable);
                return this;
            }

            public Builder addRichText(LiveBottomContent liveBottomContent) {
                copyOnWrite();
                ((LiveBottomPopupButton) ((GeneratedMessageLite.b) this).instance).addRichText(liveBottomContent);
                return this;
            }

            public Builder clearEndAfterColor() {
                copyOnWrite();
                ((LiveBottomPopupButton) ((GeneratedMessageLite.b) this).instance).clearEndAfterColor();
                return this;
            }

            public Builder clearEndColor() {
                copyOnWrite();
                ((LiveBottomPopupButton) ((GeneratedMessageLite.b) this).instance).clearEndColor();
                return this;
            }

            public Builder clearJumpSchema() {
                copyOnWrite();
                ((LiveBottomPopupButton) ((GeneratedMessageLite.b) this).instance).clearJumpSchema();
                return this;
            }

            public Builder clearJumpType() {
                copyOnWrite();
                ((LiveBottomPopupButton) ((GeneratedMessageLite.b) this).instance).clearJumpType();
                return this;
            }

            public Builder clearRichText() {
                copyOnWrite();
                ((LiveBottomPopupButton) ((GeneratedMessageLite.b) this).instance).clearRichText();
                return this;
            }

            public Builder clearStartAfterColor() {
                copyOnWrite();
                ((LiveBottomPopupButton) ((GeneratedMessageLite.b) this).instance).clearStartAfterColor();
                return this;
            }

            public Builder clearStartColor() {
                copyOnWrite();
                ((LiveBottomPopupButton) ((GeneratedMessageLite.b) this).instance).clearStartColor();
                return this;
            }

            public Builder clearText() {
                copyOnWrite();
                ((LiveBottomPopupButton) ((GeneratedMessageLite.b) this).instance).clearText();
                return this;
            }

            public Builder clearTextColor() {
                copyOnWrite();
                ((LiveBottomPopupButton) ((GeneratedMessageLite.b) this).instance).clearTextColor();
                return this;
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkLiveBottomPopup.LiveBottomPopupButtonOrBuilder
            public String getEndAfterColor() {
                return ((LiveBottomPopupButton) ((GeneratedMessageLite.b) this).instance).getEndAfterColor();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkLiveBottomPopup.LiveBottomPopupButtonOrBuilder
            public ByteString getEndAfterColorBytes() {
                return ((LiveBottomPopupButton) ((GeneratedMessageLite.b) this).instance).getEndAfterColorBytes();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkLiveBottomPopup.LiveBottomPopupButtonOrBuilder
            public String getEndColor() {
                return ((LiveBottomPopupButton) ((GeneratedMessageLite.b) this).instance).getEndColor();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkLiveBottomPopup.LiveBottomPopupButtonOrBuilder
            public ByteString getEndColorBytes() {
                return ((LiveBottomPopupButton) ((GeneratedMessageLite.b) this).instance).getEndColorBytes();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkLiveBottomPopup.LiveBottomPopupButtonOrBuilder
            public String getJumpSchema() {
                return ((LiveBottomPopupButton) ((GeneratedMessageLite.b) this).instance).getJumpSchema();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkLiveBottomPopup.LiveBottomPopupButtonOrBuilder
            public ByteString getJumpSchemaBytes() {
                return ((LiveBottomPopupButton) ((GeneratedMessageLite.b) this).instance).getJumpSchemaBytes();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkLiveBottomPopup.LiveBottomPopupButtonOrBuilder
            public LiveBottomPopupButtonJumpType getJumpType() {
                return ((LiveBottomPopupButton) ((GeneratedMessageLite.b) this).instance).getJumpType();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkLiveBottomPopup.LiveBottomPopupButtonOrBuilder
            public int getJumpTypeValue() {
                return ((LiveBottomPopupButton) ((GeneratedMessageLite.b) this).instance).getJumpTypeValue();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkLiveBottomPopup.LiveBottomPopupButtonOrBuilder
            public LiveBottomContent getRichText(int i) {
                return ((LiveBottomPopupButton) ((GeneratedMessageLite.b) this).instance).getRichText(i);
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkLiveBottomPopup.LiveBottomPopupButtonOrBuilder
            public int getRichTextCount() {
                return ((LiveBottomPopupButton) ((GeneratedMessageLite.b) this).instance).getRichTextCount();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkLiveBottomPopup.LiveBottomPopupButtonOrBuilder
            public List<LiveBottomContent> getRichTextList() {
                return Collections.unmodifiableList(((LiveBottomPopupButton) ((GeneratedMessageLite.b) this).instance).getRichTextList());
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkLiveBottomPopup.LiveBottomPopupButtonOrBuilder
            public String getStartAfterColor() {
                return ((LiveBottomPopupButton) ((GeneratedMessageLite.b) this).instance).getStartAfterColor();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkLiveBottomPopup.LiveBottomPopupButtonOrBuilder
            public ByteString getStartAfterColorBytes() {
                return ((LiveBottomPopupButton) ((GeneratedMessageLite.b) this).instance).getStartAfterColorBytes();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkLiveBottomPopup.LiveBottomPopupButtonOrBuilder
            public String getStartColor() {
                return ((LiveBottomPopupButton) ((GeneratedMessageLite.b) this).instance).getStartColor();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkLiveBottomPopup.LiveBottomPopupButtonOrBuilder
            public ByteString getStartColorBytes() {
                return ((LiveBottomPopupButton) ((GeneratedMessageLite.b) this).instance).getStartColorBytes();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkLiveBottomPopup.LiveBottomPopupButtonOrBuilder
            public String getText() {
                return ((LiveBottomPopupButton) ((GeneratedMessageLite.b) this).instance).getText();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkLiveBottomPopup.LiveBottomPopupButtonOrBuilder
            public ByteString getTextBytes() {
                return ((LiveBottomPopupButton) ((GeneratedMessageLite.b) this).instance).getTextBytes();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkLiveBottomPopup.LiveBottomPopupButtonOrBuilder
            public String getTextColor() {
                return ((LiveBottomPopupButton) ((GeneratedMessageLite.b) this).instance).getTextColor();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkLiveBottomPopup.LiveBottomPopupButtonOrBuilder
            public ByteString getTextColorBytes() {
                return ((LiveBottomPopupButton) ((GeneratedMessageLite.b) this).instance).getTextColorBytes();
            }

            public Builder removeRichText(int i) {
                copyOnWrite();
                ((LiveBottomPopupButton) ((GeneratedMessageLite.b) this).instance).removeRichText(i);
                return this;
            }

            public Builder setEndAfterColor(String str) {
                copyOnWrite();
                ((LiveBottomPopupButton) ((GeneratedMessageLite.b) this).instance).setEndAfterColor(str);
                return this;
            }

            public Builder setEndAfterColorBytes(ByteString byteString) {
                copyOnWrite();
                ((LiveBottomPopupButton) ((GeneratedMessageLite.b) this).instance).setEndAfterColorBytes(byteString);
                return this;
            }

            public Builder setEndColor(String str) {
                copyOnWrite();
                ((LiveBottomPopupButton) ((GeneratedMessageLite.b) this).instance).setEndColor(str);
                return this;
            }

            public Builder setEndColorBytes(ByteString byteString) {
                copyOnWrite();
                ((LiveBottomPopupButton) ((GeneratedMessageLite.b) this).instance).setEndColorBytes(byteString);
                return this;
            }

            public Builder setJumpSchema(String str) {
                copyOnWrite();
                ((LiveBottomPopupButton) ((GeneratedMessageLite.b) this).instance).setJumpSchema(str);
                return this;
            }

            public Builder setJumpSchemaBytes(ByteString byteString) {
                copyOnWrite();
                ((LiveBottomPopupButton) ((GeneratedMessageLite.b) this).instance).setJumpSchemaBytes(byteString);
                return this;
            }

            public Builder setJumpType(LiveBottomPopupButtonJumpType liveBottomPopupButtonJumpType) {
                copyOnWrite();
                ((LiveBottomPopupButton) ((GeneratedMessageLite.b) this).instance).setJumpType(liveBottomPopupButtonJumpType);
                return this;
            }

            public Builder setJumpTypeValue(int i) {
                copyOnWrite();
                ((LiveBottomPopupButton) ((GeneratedMessageLite.b) this).instance).setJumpTypeValue(i);
                return this;
            }

            public Builder setRichText(int i, LiveBottomContent liveBottomContent) {
                copyOnWrite();
                ((LiveBottomPopupButton) ((GeneratedMessageLite.b) this).instance).setRichText(i, liveBottomContent);
                return this;
            }

            public Builder setStartAfterColor(String str) {
                copyOnWrite();
                ((LiveBottomPopupButton) ((GeneratedMessageLite.b) this).instance).setStartAfterColor(str);
                return this;
            }

            public Builder setStartAfterColorBytes(ByteString byteString) {
                copyOnWrite();
                ((LiveBottomPopupButton) ((GeneratedMessageLite.b) this).instance).setStartAfterColorBytes(byteString);
                return this;
            }

            public Builder setStartColor(String str) {
                copyOnWrite();
                ((LiveBottomPopupButton) ((GeneratedMessageLite.b) this).instance).setStartColor(str);
                return this;
            }

            public Builder setStartColorBytes(ByteString byteString) {
                copyOnWrite();
                ((LiveBottomPopupButton) ((GeneratedMessageLite.b) this).instance).setStartColorBytes(byteString);
                return this;
            }

            public Builder setText(String str) {
                copyOnWrite();
                ((LiveBottomPopupButton) ((GeneratedMessageLite.b) this).instance).setText(str);
                return this;
            }

            public Builder setTextBytes(ByteString byteString) {
                copyOnWrite();
                ((LiveBottomPopupButton) ((GeneratedMessageLite.b) this).instance).setTextBytes(byteString);
                return this;
            }

            public Builder setTextColor(String str) {
                copyOnWrite();
                ((LiveBottomPopupButton) ((GeneratedMessageLite.b) this).instance).setTextColor(str);
                return this;
            }

            public Builder setTextColorBytes(ByteString byteString) {
                copyOnWrite();
                ((LiveBottomPopupButton) ((GeneratedMessageLite.b) this).instance).setTextColorBytes(byteString);
                return this;
            }

            public Builder addRichText(int i, LiveBottomContent liveBottomContent) {
                copyOnWrite();
                ((LiveBottomPopupButton) ((GeneratedMessageLite.b) this).instance).addRichText(i, liveBottomContent);
                return this;
            }

            public Builder setRichText(int i, LiveBottomContent.Builder builder) {
                copyOnWrite();
                ((LiveBottomPopupButton) ((GeneratedMessageLite.b) this).instance).setRichText(i, builder);
                return this;
            }

            public Builder addRichText(LiveBottomContent.Builder builder) {
                copyOnWrite();
                ((LiveBottomPopupButton) ((GeneratedMessageLite.b) this).instance).addRichText(builder);
                return this;
            }

            public Builder addRichText(int i, LiveBottomContent.Builder builder) {
                copyOnWrite();
                ((LiveBottomPopupButton) ((GeneratedMessageLite.b) this).instance).addRichText(i, builder);
                return this;
            }
        }

        public static LiveBottomPopupButton parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (LiveBottomPopupButton) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static LiveBottomPopupButton parseFrom(byte[] bArr, h hVar) throws InvalidProtocolBufferException {
            return (LiveBottomPopupButton) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, hVar);
        }

        public static LiveBottomPopupButton parseFrom(InputStream inputStream) throws IOException {
            return (LiveBottomPopupButton) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static LiveBottomPopupButton parseFrom(InputStream inputStream, h hVar) throws IOException {
            return (LiveBottomPopupButton) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, hVar);
        }

        public static LiveBottomPopupButton parseFrom(e eVar) throws IOException {
            return (LiveBottomPopupButton) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addRichText(int i, LiveBottomContent liveBottomContent) {
            liveBottomContent.getClass();
            ensureRichTextIsMutable();
            this.richText_.add(i, liveBottomContent);
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.toBuilder();
        }

        public static LiveBottomPopupButton parseFrom(e eVar, h hVar) throws IOException {
            return (LiveBottomPopupButton) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, eVar, hVar);
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
            this.richText_.add(i, (LiveBottomContent) builder.build());
        }
    }

    public static final class LiveBottomPopupHeader extends GeneratedMessageLite<LiveBottomPopupHeader, Builder> implements LiveBottomPopupHeaderOrBuilder {
        private static final LiveBottomPopupHeader DEFAULT_INSTANCE;
        private static volatile i860<LiveBottomPopupHeader> PARSER = null;
        public static final int POSITION_FIELD_NUMBER = 2;
        public static final int TEXTCOLOR_FIELD_NUMBER = 1;
        private int position_;
        private String textColor_ = "";

        public static final class Builder extends GeneratedMessageLite.b<LiveBottomPopupHeader, Builder> implements LiveBottomPopupHeaderOrBuilder {
            private Builder() {
                super(LiveBottomPopupHeader.DEFAULT_INSTANCE);
            }

            public Builder clearPosition() {
                copyOnWrite();
                ((LiveBottomPopupHeader) ((GeneratedMessageLite.b) this).instance).clearPosition();
                return this;
            }

            public Builder clearTextColor() {
                copyOnWrite();
                ((LiveBottomPopupHeader) ((GeneratedMessageLite.b) this).instance).clearTextColor();
                return this;
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkLiveBottomPopup.LiveBottomPopupHeaderOrBuilder
            public Position getPosition() {
                return ((LiveBottomPopupHeader) ((GeneratedMessageLite.b) this).instance).getPosition();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkLiveBottomPopup.LiveBottomPopupHeaderOrBuilder
            public int getPositionValue() {
                return ((LiveBottomPopupHeader) ((GeneratedMessageLite.b) this).instance).getPositionValue();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkLiveBottomPopup.LiveBottomPopupHeaderOrBuilder
            public String getTextColor() {
                return ((LiveBottomPopupHeader) ((GeneratedMessageLite.b) this).instance).getTextColor();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkLiveBottomPopup.LiveBottomPopupHeaderOrBuilder
            public ByteString getTextColorBytes() {
                return ((LiveBottomPopupHeader) ((GeneratedMessageLite.b) this).instance).getTextColorBytes();
            }

            public Builder setPosition(Position position) {
                copyOnWrite();
                ((LiveBottomPopupHeader) ((GeneratedMessageLite.b) this).instance).setPosition(position);
                return this;
            }

            public Builder setPositionValue(int i) {
                copyOnWrite();
                ((LiveBottomPopupHeader) ((GeneratedMessageLite.b) this).instance).setPositionValue(i);
                return this;
            }

            public Builder setTextColor(String str) {
                copyOnWrite();
                ((LiveBottomPopupHeader) ((GeneratedMessageLite.b) this).instance).setTextColor(str);
                return this;
            }

            public Builder setTextColorBytes(ByteString byteString) {
                copyOnWrite();
                ((LiveBottomPopupHeader) ((GeneratedMessageLite.b) this).instance).setTextColorBytes(byteString);
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
            return (Builder) ((Builder) DEFAULT_INSTANCE.toBuilder()).mergeFrom(liveBottomPopupHeader);
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
            a.checkByteStringIsUtf8(byteString);
            this.textColor_ = byteString.toStringUtf8();
        }

        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            boolean z = false;
            switch (C03861.f1668xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new LiveBottomPopupHeader();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                    return null;
                case 4:
                    return new Builder();
                case 5:
                    GeneratedMessageLite.h hVar = (GeneratedMessageLite.h) obj;
                    LiveBottomPopupHeader liveBottomPopupHeader = (LiveBottomPopupHeader) obj2;
                    this.textColor_ = hVar.f(!this.textColor_.isEmpty(), this.textColor_, !liveBottomPopupHeader.textColor_.isEmpty(), liveBottomPopupHeader.textColor_);
                    int i = this.position_;
                    boolean z2 = i != 0;
                    int i2 = liveBottomPopupHeader.position_;
                    this.position_ = hVar.e(z2, i, i2 != 0, i2);
                    GeneratedMessageLite.g gVar = GeneratedMessageLite.g.INSTANCE;
                    return this;
                case 6:
                    e eVar = (e) obj;
                    while (!z) {
                        try {
                            int iM = eVar.M();
                            if (iM != 0) {
                                if (iM == 10) {
                                    this.textColor_ = eVar.L();
                                } else if (iM == 16) {
                                    this.position_ = eVar.p();
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
                        synchronized (LiveBottomPopupHeader.class) {
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

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkLiveBottomPopup.LiveBottomPopupHeaderOrBuilder
        public Position getPosition() {
            Position positionForNumber = Position.forNumber(this.position_);
            return positionForNumber == null ? Position.UNRECOGNIZED : positionForNumber;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkLiveBottomPopup.LiveBottomPopupHeaderOrBuilder
        public int getPositionValue() {
            return this.position_;
        }

        public int getSerializedSize() {
            int i = ((GeneratedMessageLite) this).memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int iK = !this.textColor_.isEmpty() ? CodedOutputStream.K(1, getTextColor()) : 0;
            if (this.position_ != Position.left.getNumber()) {
                iK += CodedOutputStream.m(2, this.position_);
            }
            ((GeneratedMessageLite) this).memoizedSerializedSize = iK;
            return iK;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkLiveBottomPopup.LiveBottomPopupHeaderOrBuilder
        public String getTextColor() {
            return this.textColor_;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkLiveBottomPopup.LiveBottomPopupHeaderOrBuilder
        public ByteString getTextColorBytes() {
            return ByteString.copyFromUtf8(this.textColor_);
        }

        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (!this.textColor_.isEmpty()) {
                codedOutputStream.D0(1, getTextColor());
            }
            if (this.position_ != Position.left.getNumber()) {
                codedOutputStream.i0(2, this.position_);
            }
        }

        public enum Position implements l.c {
            left(0),
            middle(1),
            UNRECOGNIZED(-1);

            private static final l.d<Position> internalValueMap = new l.d<Position>() { // from class: com.p1.mobile.longlink.msg.liveroom.LongLinkLiveBottomPopup.LiveBottomPopupHeader.Position.1
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

            public static l.d<Position> internalGetValueMap() {
                return internalValueMap;
            }

            public final int getNumber() {
                return this.value;
            }

            @Deprecated
            public static Position valueOf(int i) {
                return forNumber(i);
            }
        }

        public static LiveBottomPopupHeader parseDelimitedFrom(InputStream inputStream, h hVar) throws IOException {
            return (LiveBottomPopupHeader) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, hVar);
        }

        public static LiveBottomPopupHeader parseFrom(ByteString byteString, h hVar) throws InvalidProtocolBufferException {
            return (LiveBottomPopupHeader) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, hVar);
        }

        public static LiveBottomPopupHeader parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (LiveBottomPopupHeader) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static LiveBottomPopupHeader parseFrom(byte[] bArr, h hVar) throws InvalidProtocolBufferException {
            return (LiveBottomPopupHeader) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, hVar);
        }

        public static LiveBottomPopupHeader parseFrom(InputStream inputStream) throws IOException {
            return (LiveBottomPopupHeader) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static LiveBottomPopupHeader parseFrom(InputStream inputStream, h hVar) throws IOException {
            return (LiveBottomPopupHeader) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, hVar);
        }

        public static LiveBottomPopupHeader parseFrom(e eVar) throws IOException {
            return (LiveBottomPopupHeader) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, eVar);
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.toBuilder();
        }

        public static LiveBottomPopupHeader parseFrom(e eVar, h hVar) throws IOException {
            return (LiveBottomPopupHeader) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, eVar, hVar);
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

        public static final class Builder extends GeneratedMessageLite.b<LiveBottomContent, Builder> implements LiveBottomContentOrBuilder {
            private Builder() {
                super(LiveBottomContent.DEFAULT_INSTANCE);
            }

            public Builder clearCountDownOverAction() {
                copyOnWrite();
                ((LiveBottomContent) ((GeneratedMessageLite.b) this).instance).clearCountDownOverAction();
                return this;
            }

            public Builder clearCountdownCurrentTime() {
                copyOnWrite();
                ((LiveBottomContent) ((GeneratedMessageLite.b) this).instance).clearCountdownCurrentTime();
                return this;
            }

            public Builder clearCountdownEndTime() {
                copyOnWrite();
                ((LiveBottomContent) ((GeneratedMessageLite.b) this).instance).clearCountdownEndTime();
                return this;
            }

            public Builder clearText() {
                copyOnWrite();
                ((LiveBottomContent) ((GeneratedMessageLite.b) this).instance).clearText();
                return this;
            }

            public Builder clearTextColor() {
                copyOnWrite();
                ((LiveBottomContent) ((GeneratedMessageLite.b) this).instance).clearTextColor();
                return this;
            }

            public Builder clearType() {
                copyOnWrite();
                ((LiveBottomContent) ((GeneratedMessageLite.b) this).instance).clearType();
                return this;
            }

            public Builder clearUrl() {
                copyOnWrite();
                ((LiveBottomContent) ((GeneratedMessageLite.b) this).instance).clearUrl();
                return this;
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkLiveBottomPopup.LiveBottomContentOrBuilder
            public LiveBottomCountdownOverActionEnum getCountDownOverAction() {
                return ((LiveBottomContent) ((GeneratedMessageLite.b) this).instance).getCountDownOverAction();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkLiveBottomPopup.LiveBottomContentOrBuilder
            public int getCountDownOverActionValue() {
                return ((LiveBottomContent) ((GeneratedMessageLite.b) this).instance).getCountDownOverActionValue();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkLiveBottomPopup.LiveBottomContentOrBuilder
            public long getCountdownCurrentTime() {
                return ((LiveBottomContent) ((GeneratedMessageLite.b) this).instance).getCountdownCurrentTime();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkLiveBottomPopup.LiveBottomContentOrBuilder
            public long getCountdownEndTime() {
                return ((LiveBottomContent) ((GeneratedMessageLite.b) this).instance).getCountdownEndTime();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkLiveBottomPopup.LiveBottomContentOrBuilder
            public String getText() {
                return ((LiveBottomContent) ((GeneratedMessageLite.b) this).instance).getText();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkLiveBottomPopup.LiveBottomContentOrBuilder
            public ByteString getTextBytes() {
                return ((LiveBottomContent) ((GeneratedMessageLite.b) this).instance).getTextBytes();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkLiveBottomPopup.LiveBottomContentOrBuilder
            public String getTextColor() {
                return ((LiveBottomContent) ((GeneratedMessageLite.b) this).instance).getTextColor();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkLiveBottomPopup.LiveBottomContentOrBuilder
            public ByteString getTextColorBytes() {
                return ((LiveBottomContent) ((GeneratedMessageLite.b) this).instance).getTextColorBytes();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkLiveBottomPopup.LiveBottomContentOrBuilder
            public LiveBottomContentTypeEnum getType() {
                return ((LiveBottomContent) ((GeneratedMessageLite.b) this).instance).getType();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkLiveBottomPopup.LiveBottomContentOrBuilder
            public int getTypeValue() {
                return ((LiveBottomContent) ((GeneratedMessageLite.b) this).instance).getTypeValue();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkLiveBottomPopup.LiveBottomContentOrBuilder
            public String getUrl() {
                return ((LiveBottomContent) ((GeneratedMessageLite.b) this).instance).getUrl();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkLiveBottomPopup.LiveBottomContentOrBuilder
            public ByteString getUrlBytes() {
                return ((LiveBottomContent) ((GeneratedMessageLite.b) this).instance).getUrlBytes();
            }

            public Builder setCountDownOverAction(LiveBottomCountdownOverActionEnum liveBottomCountdownOverActionEnum) {
                copyOnWrite();
                ((LiveBottomContent) ((GeneratedMessageLite.b) this).instance).setCountDownOverAction(liveBottomCountdownOverActionEnum);
                return this;
            }

            public Builder setCountDownOverActionValue(int i) {
                copyOnWrite();
                ((LiveBottomContent) ((GeneratedMessageLite.b) this).instance).setCountDownOverActionValue(i);
                return this;
            }

            public Builder setCountdownCurrentTime(long j) {
                copyOnWrite();
                ((LiveBottomContent) ((GeneratedMessageLite.b) this).instance).setCountdownCurrentTime(j);
                return this;
            }

            public Builder setCountdownEndTime(long j) {
                copyOnWrite();
                ((LiveBottomContent) ((GeneratedMessageLite.b) this).instance).setCountdownEndTime(j);
                return this;
            }

            public Builder setText(String str) {
                copyOnWrite();
                ((LiveBottomContent) ((GeneratedMessageLite.b) this).instance).setText(str);
                return this;
            }

            public Builder setTextBytes(ByteString byteString) {
                copyOnWrite();
                ((LiveBottomContent) ((GeneratedMessageLite.b) this).instance).setTextBytes(byteString);
                return this;
            }

            public Builder setTextColor(String str) {
                copyOnWrite();
                ((LiveBottomContent) ((GeneratedMessageLite.b) this).instance).setTextColor(str);
                return this;
            }

            public Builder setTextColorBytes(ByteString byteString) {
                copyOnWrite();
                ((LiveBottomContent) ((GeneratedMessageLite.b) this).instance).setTextColorBytes(byteString);
                return this;
            }

            public Builder setType(LiveBottomContentTypeEnum liveBottomContentTypeEnum) {
                copyOnWrite();
                ((LiveBottomContent) ((GeneratedMessageLite.b) this).instance).setType(liveBottomContentTypeEnum);
                return this;
            }

            public Builder setTypeValue(int i) {
                copyOnWrite();
                ((LiveBottomContent) ((GeneratedMessageLite.b) this).instance).setTypeValue(i);
                return this;
            }

            public Builder setUrl(String str) {
                copyOnWrite();
                ((LiveBottomContent) ((GeneratedMessageLite.b) this).instance).setUrl(str);
                return this;
            }

            public Builder setUrlBytes(ByteString byteString) {
                copyOnWrite();
                ((LiveBottomContent) ((GeneratedMessageLite.b) this).instance).setUrlBytes(byteString);
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
            return (Builder) ((Builder) DEFAULT_INSTANCE.toBuilder()).mergeFrom(liveBottomContent);
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
            a.checkByteStringIsUtf8(byteString);
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
            a.checkByteStringIsUtf8(byteString);
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
            a.checkByteStringIsUtf8(byteString);
            this.url_ = byteString.toStringUtf8();
        }

        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            boolean z = false;
            switch (C03861.f1668xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new LiveBottomContent();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                    return null;
                case 4:
                    return new Builder();
                case 5:
                    GeneratedMessageLite.h hVar = (GeneratedMessageLite.h) obj;
                    LiveBottomContent liveBottomContent = (LiveBottomContent) obj2;
                    int i = this.type_;
                    boolean z2 = i != 0;
                    int i2 = liveBottomContent.type_;
                    this.type_ = hVar.e(z2, i, i2 != 0, i2);
                    this.text_ = hVar.f(!this.text_.isEmpty(), this.text_, !liveBottomContent.text_.isEmpty(), liveBottomContent.text_);
                    this.textColor_ = hVar.f(!this.textColor_.isEmpty(), this.textColor_, !liveBottomContent.textColor_.isEmpty(), liveBottomContent.textColor_);
                    this.url_ = hVar.f(!this.url_.isEmpty(), this.url_, !liveBottomContent.url_.isEmpty(), liveBottomContent.url_);
                    long j = this.countdownEndTime_;
                    boolean z3 = j != 0;
                    long j2 = liveBottomContent.countdownEndTime_;
                    this.countdownEndTime_ = hVar.i(z3, j, j2 != 0, j2);
                    long j3 = this.countdownCurrentTime_;
                    boolean z4 = j3 != 0;
                    long j4 = liveBottomContent.countdownCurrentTime_;
                    this.countdownCurrentTime_ = hVar.i(z4, j3, j4 != 0, j4);
                    int i3 = this.countDownOverAction_;
                    boolean z5 = i3 != 0;
                    int i4 = liveBottomContent.countDownOverAction_;
                    this.countDownOverAction_ = hVar.e(z5, i3, i4 != 0, i4);
                    GeneratedMessageLite.g gVar = GeneratedMessageLite.g.INSTANCE;
                    return this;
                case 6:
                    e eVar = (e) obj;
                    while (!z) {
                        try {
                            int iM = eVar.M();
                            if (iM != 0) {
                                if (iM == 8) {
                                    this.type_ = eVar.p();
                                } else if (iM == 18) {
                                    this.text_ = eVar.L();
                                } else if (iM == 26) {
                                    this.textColor_ = eVar.L();
                                } else if (iM == 34) {
                                    this.url_ = eVar.L();
                                } else if (iM == 40) {
                                    this.countdownEndTime_ = eVar.v();
                                } else if (iM == 48) {
                                    this.countdownCurrentTime_ = eVar.v();
                                } else if (iM == 56) {
                                    this.countDownOverAction_ = eVar.p();
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
                        synchronized (LiveBottomContent.class) {
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

        public int getSerializedSize() {
            int i = ((GeneratedMessageLite) this).memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int iM = this.type_ != LiveBottomContentTypeEnum.text.getNumber() ? CodedOutputStream.m(1, this.type_) : 0;
            if (!this.text_.isEmpty()) {
                iM += CodedOutputStream.K(2, getText());
            }
            if (!this.textColor_.isEmpty()) {
                iM += CodedOutputStream.K(3, getTextColor());
            }
            if (!this.url_.isEmpty()) {
                iM += CodedOutputStream.K(4, getUrl());
            }
            long j = this.countdownEndTime_;
            if (j != 0) {
                iM += CodedOutputStream.v(5, j);
            }
            long j2 = this.countdownCurrentTime_;
            if (j2 != 0) {
                iM += CodedOutputStream.v(6, j2);
            }
            if (this.countDownOverAction_ != LiveBottomCountdownOverActionEnum.none.getNumber()) {
                iM += CodedOutputStream.m(7, this.countDownOverAction_);
            }
            ((GeneratedMessageLite) this).memoizedSerializedSize = iM;
            return iM;
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

        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (this.type_ != LiveBottomContentTypeEnum.text.getNumber()) {
                codedOutputStream.i0(1, this.type_);
            }
            if (!this.text_.isEmpty()) {
                codedOutputStream.D0(2, getText());
            }
            if (!this.textColor_.isEmpty()) {
                codedOutputStream.D0(3, getTextColor());
            }
            if (!this.url_.isEmpty()) {
                codedOutputStream.D0(4, getUrl());
            }
            long j = this.countdownEndTime_;
            if (j != 0) {
                codedOutputStream.u0(5, j);
            }
            long j2 = this.countdownCurrentTime_;
            if (j2 != 0) {
                codedOutputStream.u0(6, j2);
            }
            if (this.countDownOverAction_ != LiveBottomCountdownOverActionEnum.none.getNumber()) {
                codedOutputStream.i0(7, this.countDownOverAction_);
            }
        }

        public static LiveBottomContent parseDelimitedFrom(InputStream inputStream, h hVar) throws IOException {
            return (LiveBottomContent) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, hVar);
        }

        public static LiveBottomContent parseFrom(ByteString byteString, h hVar) throws InvalidProtocolBufferException {
            return (LiveBottomContent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, hVar);
        }

        public static LiveBottomContent parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (LiveBottomContent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static LiveBottomContent parseFrom(byte[] bArr, h hVar) throws InvalidProtocolBufferException {
            return (LiveBottomContent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, hVar);
        }

        public static LiveBottomContent parseFrom(InputStream inputStream) throws IOException {
            return (LiveBottomContent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static LiveBottomContent parseFrom(InputStream inputStream, h hVar) throws IOException {
            return (LiveBottomContent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, hVar);
        }

        public static LiveBottomContent parseFrom(e eVar) throws IOException {
            return (LiveBottomContent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, eVar);
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.toBuilder();
        }

        public static LiveBottomContent parseFrom(e eVar, h hVar) throws IOException {
            return (LiveBottomContent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, eVar, hVar);
        }
    }

    public enum LiveBottomContentTypeEnum implements l.c {
        text(0),
        picture(1),
        countdown(2),
        UNRECOGNIZED(-1);

        public static final int countdown_VALUE = 2;
        private static final l.d<LiveBottomContentTypeEnum> internalValueMap = new l.d<LiveBottomContentTypeEnum>() { // from class: com.p1.mobile.longlink.msg.liveroom.LongLinkLiveBottomPopup.LiveBottomContentTypeEnum.1
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

        public static l.d<LiveBottomContentTypeEnum> internalGetValueMap() {
            return internalValueMap;
        }

        public final int getNumber() {
            return this.value;
        }

        @Deprecated
        public static LiveBottomContentTypeEnum valueOf(int i) {
            return forNumber(i);
        }
    }

    public enum LiveBottomCountdownOverActionEnum implements l.c {
        none(0),
        buttonLightUp(1),
        buttonLightDown(2),
        UNRECOGNIZED(-1);

        public static final int buttonLightDown_VALUE = 2;
        public static final int buttonLightUp_VALUE = 1;
        private static final l.d<LiveBottomCountdownOverActionEnum> internalValueMap = new l.d<LiveBottomCountdownOverActionEnum>() { // from class: com.p1.mobile.longlink.msg.liveroom.LongLinkLiveBottomPopup.LiveBottomCountdownOverActionEnum.1
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

        public static l.d<LiveBottomCountdownOverActionEnum> internalGetValueMap() {
            return internalValueMap;
        }

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
        private l.h<LiveBottomContent> descriptions_ = GeneratedMessageLite.emptyProtobufList();
        private l.h<LiveBottomWindown> window_ = GeneratedMessageLite.emptyProtobufList();

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
            a.addAll(iterable, this.descriptions_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllWindow(Iterable<? extends LiveBottomWindown> iterable) {
            ensureWindowIsMutable();
            a.addAll(iterable, this.window_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addDescriptions(LiveBottomContent.Builder builder) {
            ensureDescriptionsIsMutable();
            this.descriptions_.add((LiveBottomContent) builder.build());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addWindow(LiveBottomWindown.Builder builder) {
            ensureWindowIsMutable();
            this.window_.add((LiveBottomWindown) builder.build());
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
            if (this.descriptions_.q()) {
                return;
            }
            this.descriptions_ = GeneratedMessageLite.mutableCopy(this.descriptions_);
        }

        private void ensureWindowIsMutable() {
            if (this.window_.q()) {
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
                this.button_ = (LiveBottomPopupButton) ((LiveBottomPopupButton.Builder) LiveBottomPopupButton.newBuilder(this.button_).mergeFrom(liveBottomPopupButton)).buildPartial();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeHeader(LiveBottomPopupHeader liveBottomPopupHeader) {
            LiveBottomPopupHeader liveBottomPopupHeader2 = this.header_;
            if (liveBottomPopupHeader2 == null || liveBottomPopupHeader2 == LiveBottomPopupHeader.getDefaultInstance()) {
                this.header_ = liveBottomPopupHeader;
            } else {
                this.header_ = (LiveBottomPopupHeader) ((LiveBottomPopupHeader.Builder) LiveBottomPopupHeader.newBuilder(this.header_).mergeFrom(liveBottomPopupHeader)).buildPartial();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeRemind(LiveBottomPopupRemind liveBottomPopupRemind) {
            LiveBottomPopupRemind liveBottomPopupRemind2 = this.remind_;
            if (liveBottomPopupRemind2 == null || liveBottomPopupRemind2 == LiveBottomPopupRemind.getDefaultInstance()) {
                this.remind_ = liveBottomPopupRemind;
            } else {
                this.remind_ = (LiveBottomPopupRemind) ((LiveBottomPopupRemind.Builder) LiveBottomPopupRemind.newBuilder(this.remind_).mergeFrom(liveBottomPopupRemind)).buildPartial();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeToast(LiveBottomPopupToast liveBottomPopupToast) {
            LiveBottomPopupToast liveBottomPopupToast2 = this.toast_;
            if (liveBottomPopupToast2 == null || liveBottomPopupToast2 == LiveBottomPopupToast.getDefaultInstance()) {
                this.toast_ = liveBottomPopupToast;
            } else {
                this.toast_ = (LiveBottomPopupToast) ((LiveBottomPopupToast.Builder) LiveBottomPopupToast.newBuilder(this.toast_).mergeFrom(liveBottomPopupToast)).buildPartial();
            }
        }

        public static Builder newBuilder(LiveBottomPopup liveBottomPopup) {
            return (Builder) ((Builder) DEFAULT_INSTANCE.toBuilder()).mergeFrom(liveBottomPopup);
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
            a.checkByteStringIsUtf8(byteString);
            this.backgroundColor_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setBlankClose(boolean z) {
            this.blankClose_ = z;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setButton(LiveBottomPopupButton.Builder builder) {
            this.button_ = (LiveBottomPopupButton) builder.build();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setContent(String str) {
            str.getClass();
            this.content_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setContentBytes(ByteString byteString) {
            byteString.getClass();
            a.checkByteStringIsUtf8(byteString);
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
            a.checkByteStringIsUtf8(byteString);
            this.contentColor_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setDescriptions(int i, LiveBottomContent.Builder builder) {
            ensureDescriptionsIsMutable();
            this.descriptions_.set(i, (LiveBottomContent) builder.build());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setExtra(String str) {
            str.getClass();
            this.extra_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setExtraBytes(ByteString byteString) {
            byteString.getClass();
            a.checkByteStringIsUtf8(byteString);
            this.extra_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setHeader(LiveBottomPopupHeader.Builder builder) {
            this.header_ = (LiveBottomPopupHeader) builder.build();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setIconUrl(String str) {
            str.getClass();
            this.iconUrl_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setIconUrlBytes(ByteString byteString) {
            byteString.getClass();
            a.checkByteStringIsUtf8(byteString);
            this.iconUrl_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setRemainDuration(long j) {
            this.remainDuration_ = j;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setRemind(LiveBottomPopupRemind.Builder builder) {
            this.remind_ = (LiveBottomPopupRemind) builder.build();
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
            a.checkByteStringIsUtf8(byteString);
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
            a.checkByteStringIsUtf8(byteString);
            this.title_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setToast(LiveBottomPopupToast.Builder builder) {
            this.toast_ = (LiveBottomPopupToast) builder.build();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setType(String str) {
            str.getClass();
            this.type_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTypeBytes(ByteString byteString) {
            byteString.getClass();
            a.checkByteStringIsUtf8(byteString);
            this.type_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setWindow(int i, LiveBottomWindown.Builder builder) {
            ensureWindowIsMutable();
            this.window_.set(i, (LiveBottomWindown) builder.build());
        }

        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            boolean z = false;
            switch (C03861.f1668xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new LiveBottomPopup();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                    this.descriptions_.n();
                    this.window_.n();
                    return null;
                case 4:
                    return new Builder();
                case 5:
                    GeneratedMessageLite.g gVar = (GeneratedMessageLite.h) obj;
                    LiveBottomPopup liveBottomPopup = (LiveBottomPopup) obj2;
                    this.iconUrl_ = gVar.f(!this.iconUrl_.isEmpty(), this.iconUrl_, !liveBottomPopup.iconUrl_.isEmpty(), liveBottomPopup.iconUrl_);
                    this.title_ = gVar.f(!this.title_.isEmpty(), this.title_, !liveBottomPopup.title_.isEmpty(), liveBottomPopup.title_);
                    this.content_ = gVar.f(!this.content_.isEmpty(), this.content_, !liveBottomPopup.content_.isEmpty(), liveBottomPopup.content_);
                    this.button_ = gVar.o(this.button_, liveBottomPopup.button_);
                    this.source_ = gVar.f(!this.source_.isEmpty(), this.source_, !liveBottomPopup.source_.isEmpty(), liveBottomPopup.source_);
                    this.type_ = gVar.f(!this.type_.isEmpty(), this.type_, !liveBottomPopup.type_.isEmpty(), liveBottomPopup.type_);
                    long j = this.remainDuration_;
                    boolean z2 = j != 0;
                    long j2 = liveBottomPopup.remainDuration_;
                    this.remainDuration_ = gVar.i(z2, j, j2 != 0, j2);
                    this.remind_ = gVar.o(this.remind_, liveBottomPopup.remind_);
                    this.extra_ = gVar.f(!this.extra_.isEmpty(), this.extra_, !liveBottomPopup.extra_.isEmpty(), liveBottomPopup.extra_);
                    this.toast_ = gVar.o(this.toast_, liveBottomPopup.toast_);
                    boolean z3 = this.showClose_;
                    boolean z4 = liveBottomPopup.showClose_;
                    this.showClose_ = gVar.d(z3, z3, z4, z4);
                    this.header_ = gVar.o(this.header_, liveBottomPopup.header_);
                    this.backgroundColor_ = gVar.f(!this.backgroundColor_.isEmpty(), this.backgroundColor_, !liveBottomPopup.backgroundColor_.isEmpty(), liveBottomPopup.backgroundColor_);
                    this.contentColor_ = gVar.f(!this.contentColor_.isEmpty(), this.contentColor_, !liveBottomPopup.contentColor_.isEmpty(), liveBottomPopup.contentColor_);
                    boolean z5 = this.blankClose_;
                    boolean z6 = liveBottomPopup.blankClose_;
                    this.blankClose_ = gVar.d(z5, z5, z6, z6);
                    int i = this.styleType_;
                    boolean z7 = i != 0;
                    int i2 = liveBottomPopup.styleType_;
                    this.styleType_ = gVar.e(z7, i, i2 != 0, i2);
                    this.descriptions_ = gVar.g(this.descriptions_, liveBottomPopup.descriptions_);
                    this.window_ = gVar.g(this.window_, liveBottomPopup.window_);
                    if (gVar == GeneratedMessageLite.g.INSTANCE) {
                        this.bitField0_ |= liveBottomPopup.bitField0_;
                    }
                    return this;
                case 6:
                    e eVar = (e) obj;
                    h hVar = (h) obj2;
                    while (!z) {
                        try {
                            int iM = eVar.M();
                            switch (iM) {
                                case 0:
                                    break;
                                case 10:
                                    this.iconUrl_ = eVar.L();
                                    continue;
                                case 18:
                                    this.title_ = eVar.L();
                                    continue;
                                case 26:
                                    this.content_ = eVar.L();
                                    continue;
                                case 34:
                                    LiveBottomPopupButton liveBottomPopupButton = this.button_;
                                    LiveBottomPopupButton.Builder builder = liveBottomPopupButton != null ? (LiveBottomPopupButton.Builder) liveBottomPopupButton.toBuilder() : null;
                                    LiveBottomPopupButton liveBottomPopupButtonW = eVar.w(LiveBottomPopupButton.parser(), hVar);
                                    this.button_ = liveBottomPopupButtonW;
                                    if (builder != null) {
                                        builder.mergeFrom(liveBottomPopupButtonW);
                                        this.button_ = (LiveBottomPopupButton) builder.buildPartial();
                                    } else {
                                        continue;
                                    }
                                    break;
                                case 42:
                                    this.source_ = eVar.L();
                                    continue;
                                case 50:
                                    this.type_ = eVar.L();
                                    continue;
                                case 56:
                                    this.remainDuration_ = eVar.v();
                                    continue;
                                case 66:
                                    LiveBottomPopupRemind liveBottomPopupRemind = this.remind_;
                                    LiveBottomPopupRemind.Builder builder2 = liveBottomPopupRemind != null ? (LiveBottomPopupRemind.Builder) liveBottomPopupRemind.toBuilder() : null;
                                    LiveBottomPopupRemind liveBottomPopupRemindW = eVar.w(LiveBottomPopupRemind.parser(), hVar);
                                    this.remind_ = liveBottomPopupRemindW;
                                    if (builder2 != null) {
                                        builder2.mergeFrom(liveBottomPopupRemindW);
                                        this.remind_ = (LiveBottomPopupRemind) builder2.buildPartial();
                                    } else {
                                        continue;
                                    }
                                    break;
                                case 74:
                                    this.extra_ = eVar.L();
                                    continue;
                                case 82:
                                    LiveBottomPopupToast liveBottomPopupToast = this.toast_;
                                    LiveBottomPopupToast.Builder builder3 = liveBottomPopupToast != null ? (LiveBottomPopupToast.Builder) liveBottomPopupToast.toBuilder() : null;
                                    LiveBottomPopupToast liveBottomPopupToastW = eVar.w(LiveBottomPopupToast.parser(), hVar);
                                    this.toast_ = liveBottomPopupToastW;
                                    if (builder3 != null) {
                                        builder3.mergeFrom(liveBottomPopupToastW);
                                        this.toast_ = (LiveBottomPopupToast) builder3.buildPartial();
                                    } else {
                                        continue;
                                    }
                                    break;
                                case 88:
                                    this.showClose_ = eVar.m();
                                    continue;
                                case 98:
                                    LiveBottomPopupHeader liveBottomPopupHeader = this.header_;
                                    LiveBottomPopupHeader.Builder builder4 = liveBottomPopupHeader != null ? (LiveBottomPopupHeader.Builder) liveBottomPopupHeader.toBuilder() : null;
                                    LiveBottomPopupHeader liveBottomPopupHeaderW = eVar.w(LiveBottomPopupHeader.parser(), hVar);
                                    this.header_ = liveBottomPopupHeaderW;
                                    if (builder4 != null) {
                                        builder4.mergeFrom(liveBottomPopupHeaderW);
                                        this.header_ = (LiveBottomPopupHeader) builder4.buildPartial();
                                    } else {
                                        continue;
                                    }
                                    break;
                                case 106:
                                    this.backgroundColor_ = eVar.L();
                                    continue;
                                case XEGiftErrorCode.ERROR_CODE_VIDEO_TIMEOUT /* 114 */:
                                    this.contentColor_ = eVar.L();
                                    continue;
                                case 120:
                                    this.blankClose_ = eVar.m();
                                    continue;
                                case 136:
                                    this.styleType_ = eVar.p();
                                    continue;
                                case 146:
                                    if (!this.descriptions_.q()) {
                                        this.descriptions_ = GeneratedMessageLite.mutableCopy(this.descriptions_);
                                    }
                                    this.descriptions_.add(eVar.w(LiveBottomContent.parser(), hVar));
                                    continue;
                                case 154:
                                    if (!this.window_.q()) {
                                        this.window_ = GeneratedMessageLite.mutableCopy(this.window_);
                                    }
                                    this.window_.add(eVar.w(LiveBottomWindown.parser(), hVar));
                                    continue;
                                default:
                                    if (!eVar.R(iM)) {
                                        break;
                                    }
                                    break;
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
                        synchronized (LiveBottomPopup.class) {
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
            return (LiveBottomContent) this.descriptions_.get(i);
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
            return (LiveBottomContentOrBuilder) this.descriptions_.get(i);
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

        public int getSerializedSize() {
            int i = ((GeneratedMessageLite) this).memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int iK = !this.iconUrl_.isEmpty() ? CodedOutputStream.K(1, getIconUrl()) : 0;
            if (!this.title_.isEmpty()) {
                iK += CodedOutputStream.K(2, getTitle());
            }
            if (!this.content_.isEmpty()) {
                iK += CodedOutputStream.K(3, getContent());
            }
            if (this.button_ != null) {
                iK += CodedOutputStream.C(4, getButton());
            }
            if (!this.source_.isEmpty()) {
                iK += CodedOutputStream.K(5, getSource());
            }
            if (!this.type_.isEmpty()) {
                iK += CodedOutputStream.K(6, getType());
            }
            long j = this.remainDuration_;
            if (j != 0) {
                iK += CodedOutputStream.v(7, j);
            }
            if (this.remind_ != null) {
                iK += CodedOutputStream.C(8, getRemind());
            }
            if (!this.extra_.isEmpty()) {
                iK += CodedOutputStream.K(9, getExtra());
            }
            if (this.toast_ != null) {
                iK += CodedOutputStream.C(10, getToast());
            }
            boolean z = this.showClose_;
            if (z) {
                iK += CodedOutputStream.f(11, z);
            }
            if (this.header_ != null) {
                iK += CodedOutputStream.C(12, getHeader());
            }
            if (!this.backgroundColor_.isEmpty()) {
                iK += CodedOutputStream.K(13, getBackgroundColor());
            }
            if (!this.contentColor_.isEmpty()) {
                iK += CodedOutputStream.K(14, getContentColor());
            }
            boolean z2 = this.blankClose_;
            if (z2) {
                iK += CodedOutputStream.f(15, z2);
            }
            if (this.styleType_ != LiveBottomPopupStyleTypeEnum.common.getNumber()) {
                iK += CodedOutputStream.m(17, this.styleType_);
            }
            for (int i2 = 0; i2 < this.descriptions_.size(); i2++) {
                iK += CodedOutputStream.C(18, (q) this.descriptions_.get(i2));
            }
            for (int i3 = 0; i3 < this.window_.size(); i3++) {
                iK += CodedOutputStream.C(19, (q) this.window_.get(i3));
            }
            ((GeneratedMessageLite) this).memoizedSerializedSize = iK;
            return iK;
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
            return (LiveBottomWindown) this.window_.get(i);
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
            return (LiveBottomWindownOrBuilder) this.window_.get(i);
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

        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (!this.iconUrl_.isEmpty()) {
                codedOutputStream.D0(1, getIconUrl());
            }
            if (!this.title_.isEmpty()) {
                codedOutputStream.D0(2, getTitle());
            }
            if (!this.content_.isEmpty()) {
                codedOutputStream.D0(3, getContent());
            }
            if (this.button_ != null) {
                codedOutputStream.w0(4, getButton());
            }
            if (!this.source_.isEmpty()) {
                codedOutputStream.D0(5, getSource());
            }
            if (!this.type_.isEmpty()) {
                codedOutputStream.D0(6, getType());
            }
            long j = this.remainDuration_;
            if (j != 0) {
                codedOutputStream.u0(7, j);
            }
            if (this.remind_ != null) {
                codedOutputStream.w0(8, getRemind());
            }
            if (!this.extra_.isEmpty()) {
                codedOutputStream.D0(9, getExtra());
            }
            if (this.toast_ != null) {
                codedOutputStream.w0(10, getToast());
            }
            boolean z = this.showClose_;
            if (z) {
                codedOutputStream.a0(11, z);
            }
            if (this.header_ != null) {
                codedOutputStream.w0(12, getHeader());
            }
            if (!this.backgroundColor_.isEmpty()) {
                codedOutputStream.D0(13, getBackgroundColor());
            }
            if (!this.contentColor_.isEmpty()) {
                codedOutputStream.D0(14, getContentColor());
            }
            boolean z2 = this.blankClose_;
            if (z2) {
                codedOutputStream.a0(15, z2);
            }
            if (this.styleType_ != LiveBottomPopupStyleTypeEnum.common.getNumber()) {
                codedOutputStream.i0(17, this.styleType_);
            }
            for (int i = 0; i < this.descriptions_.size(); i++) {
                codedOutputStream.w0(18, (q) this.descriptions_.get(i));
            }
            for (int i2 = 0; i2 < this.window_.size(); i2++) {
                codedOutputStream.w0(19, (q) this.window_.get(i2));
            }
        }

        public static LiveBottomPopup parseDelimitedFrom(InputStream inputStream, h hVar) throws IOException {
            return (LiveBottomPopup) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, hVar);
        }

        public static LiveBottomPopup parseFrom(ByteString byteString, h hVar) throws InvalidProtocolBufferException {
            return (LiveBottomPopup) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, hVar);
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

        public static final class Builder extends GeneratedMessageLite.b<LiveBottomPopup, Builder> implements LiveBottomPopupOrBuilder {
            private Builder() {
                super(LiveBottomPopup.DEFAULT_INSTANCE);
            }

            public Builder addAllDescriptions(Iterable<? extends LiveBottomContent> iterable) {
                copyOnWrite();
                ((LiveBottomPopup) ((GeneratedMessageLite.b) this).instance).addAllDescriptions(iterable);
                return this;
            }

            public Builder addAllWindow(Iterable<? extends LiveBottomWindown> iterable) {
                copyOnWrite();
                ((LiveBottomPopup) ((GeneratedMessageLite.b) this).instance).addAllWindow(iterable);
                return this;
            }

            public Builder addDescriptions(LiveBottomContent liveBottomContent) {
                copyOnWrite();
                ((LiveBottomPopup) ((GeneratedMessageLite.b) this).instance).addDescriptions(liveBottomContent);
                return this;
            }

            public Builder addWindow(LiveBottomWindown liveBottomWindown) {
                copyOnWrite();
                ((LiveBottomPopup) ((GeneratedMessageLite.b) this).instance).addWindow(liveBottomWindown);
                return this;
            }

            public Builder clearBackgroundColor() {
                copyOnWrite();
                ((LiveBottomPopup) ((GeneratedMessageLite.b) this).instance).clearBackgroundColor();
                return this;
            }

            public Builder clearBlankClose() {
                copyOnWrite();
                ((LiveBottomPopup) ((GeneratedMessageLite.b) this).instance).clearBlankClose();
                return this;
            }

            public Builder clearButton() {
                copyOnWrite();
                ((LiveBottomPopup) ((GeneratedMessageLite.b) this).instance).clearButton();
                return this;
            }

            public Builder clearContent() {
                copyOnWrite();
                ((LiveBottomPopup) ((GeneratedMessageLite.b) this).instance).clearContent();
                return this;
            }

            public Builder clearContentColor() {
                copyOnWrite();
                ((LiveBottomPopup) ((GeneratedMessageLite.b) this).instance).clearContentColor();
                return this;
            }

            public Builder clearDescriptions() {
                copyOnWrite();
                ((LiveBottomPopup) ((GeneratedMessageLite.b) this).instance).clearDescriptions();
                return this;
            }

            public Builder clearExtra() {
                copyOnWrite();
                ((LiveBottomPopup) ((GeneratedMessageLite.b) this).instance).clearExtra();
                return this;
            }

            public Builder clearHeader() {
                copyOnWrite();
                ((LiveBottomPopup) ((GeneratedMessageLite.b) this).instance).clearHeader();
                return this;
            }

            public Builder clearIconUrl() {
                copyOnWrite();
                ((LiveBottomPopup) ((GeneratedMessageLite.b) this).instance).clearIconUrl();
                return this;
            }

            public Builder clearRemainDuration() {
                copyOnWrite();
                ((LiveBottomPopup) ((GeneratedMessageLite.b) this).instance).clearRemainDuration();
                return this;
            }

            public Builder clearRemind() {
                copyOnWrite();
                ((LiveBottomPopup) ((GeneratedMessageLite.b) this).instance).clearRemind();
                return this;
            }

            public Builder clearShowClose() {
                copyOnWrite();
                ((LiveBottomPopup) ((GeneratedMessageLite.b) this).instance).clearShowClose();
                return this;
            }

            public Builder clearSource() {
                copyOnWrite();
                ((LiveBottomPopup) ((GeneratedMessageLite.b) this).instance).clearSource();
                return this;
            }

            public Builder clearStyleType() {
                copyOnWrite();
                ((LiveBottomPopup) ((GeneratedMessageLite.b) this).instance).clearStyleType();
                return this;
            }

            public Builder clearTitle() {
                copyOnWrite();
                ((LiveBottomPopup) ((GeneratedMessageLite.b) this).instance).clearTitle();
                return this;
            }

            public Builder clearToast() {
                copyOnWrite();
                ((LiveBottomPopup) ((GeneratedMessageLite.b) this).instance).clearToast();
                return this;
            }

            public Builder clearType() {
                copyOnWrite();
                ((LiveBottomPopup) ((GeneratedMessageLite.b) this).instance).clearType();
                return this;
            }

            public Builder clearWindow() {
                copyOnWrite();
                ((LiveBottomPopup) ((GeneratedMessageLite.b) this).instance).clearWindow();
                return this;
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkLiveBottomPopup.LiveBottomPopupOrBuilder
            public String getBackgroundColor() {
                return ((LiveBottomPopup) ((GeneratedMessageLite.b) this).instance).getBackgroundColor();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkLiveBottomPopup.LiveBottomPopupOrBuilder
            public ByteString getBackgroundColorBytes() {
                return ((LiveBottomPopup) ((GeneratedMessageLite.b) this).instance).getBackgroundColorBytes();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkLiveBottomPopup.LiveBottomPopupOrBuilder
            public boolean getBlankClose() {
                return ((LiveBottomPopup) ((GeneratedMessageLite.b) this).instance).getBlankClose();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkLiveBottomPopup.LiveBottomPopupOrBuilder
            public LiveBottomPopupButton getButton() {
                return ((LiveBottomPopup) ((GeneratedMessageLite.b) this).instance).getButton();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkLiveBottomPopup.LiveBottomPopupOrBuilder
            public String getContent() {
                return ((LiveBottomPopup) ((GeneratedMessageLite.b) this).instance).getContent();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkLiveBottomPopup.LiveBottomPopupOrBuilder
            public ByteString getContentBytes() {
                return ((LiveBottomPopup) ((GeneratedMessageLite.b) this).instance).getContentBytes();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkLiveBottomPopup.LiveBottomPopupOrBuilder
            public String getContentColor() {
                return ((LiveBottomPopup) ((GeneratedMessageLite.b) this).instance).getContentColor();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkLiveBottomPopup.LiveBottomPopupOrBuilder
            public ByteString getContentColorBytes() {
                return ((LiveBottomPopup) ((GeneratedMessageLite.b) this).instance).getContentColorBytes();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkLiveBottomPopup.LiveBottomPopupOrBuilder
            public LiveBottomContent getDescriptions(int i) {
                return ((LiveBottomPopup) ((GeneratedMessageLite.b) this).instance).getDescriptions(i);
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkLiveBottomPopup.LiveBottomPopupOrBuilder
            public int getDescriptionsCount() {
                return ((LiveBottomPopup) ((GeneratedMessageLite.b) this).instance).getDescriptionsCount();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkLiveBottomPopup.LiveBottomPopupOrBuilder
            public List<LiveBottomContent> getDescriptionsList() {
                return Collections.unmodifiableList(((LiveBottomPopup) ((GeneratedMessageLite.b) this).instance).getDescriptionsList());
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkLiveBottomPopup.LiveBottomPopupOrBuilder
            public String getExtra() {
                return ((LiveBottomPopup) ((GeneratedMessageLite.b) this).instance).getExtra();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkLiveBottomPopup.LiveBottomPopupOrBuilder
            public ByteString getExtraBytes() {
                return ((LiveBottomPopup) ((GeneratedMessageLite.b) this).instance).getExtraBytes();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkLiveBottomPopup.LiveBottomPopupOrBuilder
            public LiveBottomPopupHeader getHeader() {
                return ((LiveBottomPopup) ((GeneratedMessageLite.b) this).instance).getHeader();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkLiveBottomPopup.LiveBottomPopupOrBuilder
            public String getIconUrl() {
                return ((LiveBottomPopup) ((GeneratedMessageLite.b) this).instance).getIconUrl();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkLiveBottomPopup.LiveBottomPopupOrBuilder
            public ByteString getIconUrlBytes() {
                return ((LiveBottomPopup) ((GeneratedMessageLite.b) this).instance).getIconUrlBytes();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkLiveBottomPopup.LiveBottomPopupOrBuilder
            public long getRemainDuration() {
                return ((LiveBottomPopup) ((GeneratedMessageLite.b) this).instance).getRemainDuration();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkLiveBottomPopup.LiveBottomPopupOrBuilder
            public LiveBottomPopupRemind getRemind() {
                return ((LiveBottomPopup) ((GeneratedMessageLite.b) this).instance).getRemind();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkLiveBottomPopup.LiveBottomPopupOrBuilder
            public boolean getShowClose() {
                return ((LiveBottomPopup) ((GeneratedMessageLite.b) this).instance).getShowClose();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkLiveBottomPopup.LiveBottomPopupOrBuilder
            public String getSource() {
                return ((LiveBottomPopup) ((GeneratedMessageLite.b) this).instance).getSource();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkLiveBottomPopup.LiveBottomPopupOrBuilder
            public ByteString getSourceBytes() {
                return ((LiveBottomPopup) ((GeneratedMessageLite.b) this).instance).getSourceBytes();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkLiveBottomPopup.LiveBottomPopupOrBuilder
            public LiveBottomPopupStyleTypeEnum getStyleType() {
                return ((LiveBottomPopup) ((GeneratedMessageLite.b) this).instance).getStyleType();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkLiveBottomPopup.LiveBottomPopupOrBuilder
            public int getStyleTypeValue() {
                return ((LiveBottomPopup) ((GeneratedMessageLite.b) this).instance).getStyleTypeValue();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkLiveBottomPopup.LiveBottomPopupOrBuilder
            public String getTitle() {
                return ((LiveBottomPopup) ((GeneratedMessageLite.b) this).instance).getTitle();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkLiveBottomPopup.LiveBottomPopupOrBuilder
            public ByteString getTitleBytes() {
                return ((LiveBottomPopup) ((GeneratedMessageLite.b) this).instance).getTitleBytes();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkLiveBottomPopup.LiveBottomPopupOrBuilder
            public LiveBottomPopupToast getToast() {
                return ((LiveBottomPopup) ((GeneratedMessageLite.b) this).instance).getToast();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkLiveBottomPopup.LiveBottomPopupOrBuilder
            public String getType() {
                return ((LiveBottomPopup) ((GeneratedMessageLite.b) this).instance).getType();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkLiveBottomPopup.LiveBottomPopupOrBuilder
            public ByteString getTypeBytes() {
                return ((LiveBottomPopup) ((GeneratedMessageLite.b) this).instance).getTypeBytes();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkLiveBottomPopup.LiveBottomPopupOrBuilder
            public LiveBottomWindown getWindow(int i) {
                return ((LiveBottomPopup) ((GeneratedMessageLite.b) this).instance).getWindow(i);
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkLiveBottomPopup.LiveBottomPopupOrBuilder
            public int getWindowCount() {
                return ((LiveBottomPopup) ((GeneratedMessageLite.b) this).instance).getWindowCount();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkLiveBottomPopup.LiveBottomPopupOrBuilder
            public List<LiveBottomWindown> getWindowList() {
                return Collections.unmodifiableList(((LiveBottomPopup) ((GeneratedMessageLite.b) this).instance).getWindowList());
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkLiveBottomPopup.LiveBottomPopupOrBuilder
            public boolean hasButton() {
                return ((LiveBottomPopup) ((GeneratedMessageLite.b) this).instance).hasButton();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkLiveBottomPopup.LiveBottomPopupOrBuilder
            public boolean hasHeader() {
                return ((LiveBottomPopup) ((GeneratedMessageLite.b) this).instance).hasHeader();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkLiveBottomPopup.LiveBottomPopupOrBuilder
            public boolean hasRemind() {
                return ((LiveBottomPopup) ((GeneratedMessageLite.b) this).instance).hasRemind();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkLiveBottomPopup.LiveBottomPopupOrBuilder
            public boolean hasToast() {
                return ((LiveBottomPopup) ((GeneratedMessageLite.b) this).instance).hasToast();
            }

            public Builder mergeButton(LiveBottomPopupButton liveBottomPopupButton) {
                copyOnWrite();
                ((LiveBottomPopup) ((GeneratedMessageLite.b) this).instance).mergeButton(liveBottomPopupButton);
                return this;
            }

            public Builder mergeHeader(LiveBottomPopupHeader liveBottomPopupHeader) {
                copyOnWrite();
                ((LiveBottomPopup) ((GeneratedMessageLite.b) this).instance).mergeHeader(liveBottomPopupHeader);
                return this;
            }

            public Builder mergeRemind(LiveBottomPopupRemind liveBottomPopupRemind) {
                copyOnWrite();
                ((LiveBottomPopup) ((GeneratedMessageLite.b) this).instance).mergeRemind(liveBottomPopupRemind);
                return this;
            }

            public Builder mergeToast(LiveBottomPopupToast liveBottomPopupToast) {
                copyOnWrite();
                ((LiveBottomPopup) ((GeneratedMessageLite.b) this).instance).mergeToast(liveBottomPopupToast);
                return this;
            }

            public Builder removeDescriptions(int i) {
                copyOnWrite();
                ((LiveBottomPopup) ((GeneratedMessageLite.b) this).instance).removeDescriptions(i);
                return this;
            }

            public Builder removeWindow(int i) {
                copyOnWrite();
                ((LiveBottomPopup) ((GeneratedMessageLite.b) this).instance).removeWindow(i);
                return this;
            }

            public Builder setBackgroundColor(String str) {
                copyOnWrite();
                ((LiveBottomPopup) ((GeneratedMessageLite.b) this).instance).setBackgroundColor(str);
                return this;
            }

            public Builder setBackgroundColorBytes(ByteString byteString) {
                copyOnWrite();
                ((LiveBottomPopup) ((GeneratedMessageLite.b) this).instance).setBackgroundColorBytes(byteString);
                return this;
            }

            public Builder setBlankClose(boolean z) {
                copyOnWrite();
                ((LiveBottomPopup) ((GeneratedMessageLite.b) this).instance).setBlankClose(z);
                return this;
            }

            public Builder setButton(LiveBottomPopupButton liveBottomPopupButton) {
                copyOnWrite();
                ((LiveBottomPopup) ((GeneratedMessageLite.b) this).instance).setButton(liveBottomPopupButton);
                return this;
            }

            public Builder setContent(String str) {
                copyOnWrite();
                ((LiveBottomPopup) ((GeneratedMessageLite.b) this).instance).setContent(str);
                return this;
            }

            public Builder setContentBytes(ByteString byteString) {
                copyOnWrite();
                ((LiveBottomPopup) ((GeneratedMessageLite.b) this).instance).setContentBytes(byteString);
                return this;
            }

            public Builder setContentColor(String str) {
                copyOnWrite();
                ((LiveBottomPopup) ((GeneratedMessageLite.b) this).instance).setContentColor(str);
                return this;
            }

            public Builder setContentColorBytes(ByteString byteString) {
                copyOnWrite();
                ((LiveBottomPopup) ((GeneratedMessageLite.b) this).instance).setContentColorBytes(byteString);
                return this;
            }

            public Builder setDescriptions(int i, LiveBottomContent liveBottomContent) {
                copyOnWrite();
                ((LiveBottomPopup) ((GeneratedMessageLite.b) this).instance).setDescriptions(i, liveBottomContent);
                return this;
            }

            public Builder setExtra(String str) {
                copyOnWrite();
                ((LiveBottomPopup) ((GeneratedMessageLite.b) this).instance).setExtra(str);
                return this;
            }

            public Builder setExtraBytes(ByteString byteString) {
                copyOnWrite();
                ((LiveBottomPopup) ((GeneratedMessageLite.b) this).instance).setExtraBytes(byteString);
                return this;
            }

            public Builder setHeader(LiveBottomPopupHeader liveBottomPopupHeader) {
                copyOnWrite();
                ((LiveBottomPopup) ((GeneratedMessageLite.b) this).instance).setHeader(liveBottomPopupHeader);
                return this;
            }

            public Builder setIconUrl(String str) {
                copyOnWrite();
                ((LiveBottomPopup) ((GeneratedMessageLite.b) this).instance).setIconUrl(str);
                return this;
            }

            public Builder setIconUrlBytes(ByteString byteString) {
                copyOnWrite();
                ((LiveBottomPopup) ((GeneratedMessageLite.b) this).instance).setIconUrlBytes(byteString);
                return this;
            }

            public Builder setRemainDuration(long j) {
                copyOnWrite();
                ((LiveBottomPopup) ((GeneratedMessageLite.b) this).instance).setRemainDuration(j);
                return this;
            }

            public Builder setRemind(LiveBottomPopupRemind liveBottomPopupRemind) {
                copyOnWrite();
                ((LiveBottomPopup) ((GeneratedMessageLite.b) this).instance).setRemind(liveBottomPopupRemind);
                return this;
            }

            public Builder setShowClose(boolean z) {
                copyOnWrite();
                ((LiveBottomPopup) ((GeneratedMessageLite.b) this).instance).setShowClose(z);
                return this;
            }

            public Builder setSource(String str) {
                copyOnWrite();
                ((LiveBottomPopup) ((GeneratedMessageLite.b) this).instance).setSource(str);
                return this;
            }

            public Builder setSourceBytes(ByteString byteString) {
                copyOnWrite();
                ((LiveBottomPopup) ((GeneratedMessageLite.b) this).instance).setSourceBytes(byteString);
                return this;
            }

            public Builder setStyleType(LiveBottomPopupStyleTypeEnum liveBottomPopupStyleTypeEnum) {
                copyOnWrite();
                ((LiveBottomPopup) ((GeneratedMessageLite.b) this).instance).setStyleType(liveBottomPopupStyleTypeEnum);
                return this;
            }

            public Builder setStyleTypeValue(int i) {
                copyOnWrite();
                ((LiveBottomPopup) ((GeneratedMessageLite.b) this).instance).setStyleTypeValue(i);
                return this;
            }

            public Builder setTitle(String str) {
                copyOnWrite();
                ((LiveBottomPopup) ((GeneratedMessageLite.b) this).instance).setTitle(str);
                return this;
            }

            public Builder setTitleBytes(ByteString byteString) {
                copyOnWrite();
                ((LiveBottomPopup) ((GeneratedMessageLite.b) this).instance).setTitleBytes(byteString);
                return this;
            }

            public Builder setToast(LiveBottomPopupToast liveBottomPopupToast) {
                copyOnWrite();
                ((LiveBottomPopup) ((GeneratedMessageLite.b) this).instance).setToast(liveBottomPopupToast);
                return this;
            }

            public Builder setType(String str) {
                copyOnWrite();
                ((LiveBottomPopup) ((GeneratedMessageLite.b) this).instance).setType(str);
                return this;
            }

            public Builder setTypeBytes(ByteString byteString) {
                copyOnWrite();
                ((LiveBottomPopup) ((GeneratedMessageLite.b) this).instance).setTypeBytes(byteString);
                return this;
            }

            public Builder setWindow(int i, LiveBottomWindown liveBottomWindown) {
                copyOnWrite();
                ((LiveBottomPopup) ((GeneratedMessageLite.b) this).instance).setWindow(i, liveBottomWindown);
                return this;
            }

            public Builder addDescriptions(int i, LiveBottomContent liveBottomContent) {
                copyOnWrite();
                ((LiveBottomPopup) ((GeneratedMessageLite.b) this).instance).addDescriptions(i, liveBottomContent);
                return this;
            }

            public Builder addWindow(int i, LiveBottomWindown liveBottomWindown) {
                copyOnWrite();
                ((LiveBottomPopup) ((GeneratedMessageLite.b) this).instance).addWindow(i, liveBottomWindown);
                return this;
            }

            public Builder setButton(LiveBottomPopupButton.Builder builder) {
                copyOnWrite();
                ((LiveBottomPopup) ((GeneratedMessageLite.b) this).instance).setButton(builder);
                return this;
            }

            public Builder setDescriptions(int i, LiveBottomContent.Builder builder) {
                copyOnWrite();
                ((LiveBottomPopup) ((GeneratedMessageLite.b) this).instance).setDescriptions(i, builder);
                return this;
            }

            public Builder setHeader(LiveBottomPopupHeader.Builder builder) {
                copyOnWrite();
                ((LiveBottomPopup) ((GeneratedMessageLite.b) this).instance).setHeader(builder);
                return this;
            }

            public Builder setRemind(LiveBottomPopupRemind.Builder builder) {
                copyOnWrite();
                ((LiveBottomPopup) ((GeneratedMessageLite.b) this).instance).setRemind(builder);
                return this;
            }

            public Builder setToast(LiveBottomPopupToast.Builder builder) {
                copyOnWrite();
                ((LiveBottomPopup) ((GeneratedMessageLite.b) this).instance).setToast(builder);
                return this;
            }

            public Builder setWindow(int i, LiveBottomWindown.Builder builder) {
                copyOnWrite();
                ((LiveBottomPopup) ((GeneratedMessageLite.b) this).instance).setWindow(i, builder);
                return this;
            }

            public Builder addDescriptions(LiveBottomContent.Builder builder) {
                copyOnWrite();
                ((LiveBottomPopup) ((GeneratedMessageLite.b) this).instance).addDescriptions(builder);
                return this;
            }

            public Builder addWindow(LiveBottomWindown.Builder builder) {
                copyOnWrite();
                ((LiveBottomPopup) ((GeneratedMessageLite.b) this).instance).addWindow(builder);
                return this;
            }

            public Builder addDescriptions(int i, LiveBottomContent.Builder builder) {
                copyOnWrite();
                ((LiveBottomPopup) ((GeneratedMessageLite.b) this).instance).addDescriptions(i, builder);
                return this;
            }

            public Builder addWindow(int i, LiveBottomWindown.Builder builder) {
                copyOnWrite();
                ((LiveBottomPopup) ((GeneratedMessageLite.b) this).instance).addWindow(i, builder);
                return this;
            }
        }

        public static LiveBottomPopup parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (LiveBottomPopup) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static LiveBottomPopup parseFrom(byte[] bArr, h hVar) throws InvalidProtocolBufferException {
            return (LiveBottomPopup) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, hVar);
        }

        public static LiveBottomPopup parseFrom(InputStream inputStream) throws IOException {
            return (LiveBottomPopup) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static LiveBottomPopup parseFrom(InputStream inputStream, h hVar) throws IOException {
            return (LiveBottomPopup) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, hVar);
        }

        public static LiveBottomPopup parseFrom(e eVar) throws IOException {
            return (LiveBottomPopup) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, eVar);
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
            return (Builder) DEFAULT_INSTANCE.toBuilder();
        }

        public static LiveBottomPopup parseFrom(e eVar, h hVar) throws IOException {
            return (LiveBottomPopup) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, eVar, hVar);
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
            this.descriptions_.add(i, (LiveBottomContent) builder.build());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addWindow(int i, LiveBottomWindown.Builder builder) {
            ensureWindowIsMutable();
            this.window_.add(i, (LiveBottomWindown) builder.build());
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

        public static final class Builder extends GeneratedMessageLite.b<LiveBottomPopupRemind, Builder> implements LiveBottomPopupRemindOrBuilder {
            private Builder() {
                super(LiveBottomPopupRemind.DEFAULT_INSTANCE);
            }

            public Builder clearClick() {
                copyOnWrite();
                ((LiveBottomPopupRemind) ((GeneratedMessageLite.b) this).instance).clearClick();
                return this;
            }

            public Builder clearShow() {
                copyOnWrite();
                ((LiveBottomPopupRemind) ((GeneratedMessageLite.b) this).instance).clearShow();
                return this;
            }

            public Builder clearTextColor() {
                copyOnWrite();
                ((LiveBottomPopupRemind) ((GeneratedMessageLite.b) this).instance).clearTextColor();
                return this;
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkLiveBottomPopup.LiveBottomPopupRemindOrBuilder
            public boolean getClick() {
                return ((LiveBottomPopupRemind) ((GeneratedMessageLite.b) this).instance).getClick();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkLiveBottomPopup.LiveBottomPopupRemindOrBuilder
            public boolean getShow() {
                return ((LiveBottomPopupRemind) ((GeneratedMessageLite.b) this).instance).getShow();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkLiveBottomPopup.LiveBottomPopupRemindOrBuilder
            public String getTextColor() {
                return ((LiveBottomPopupRemind) ((GeneratedMessageLite.b) this).instance).getTextColor();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkLiveBottomPopup.LiveBottomPopupRemindOrBuilder
            public ByteString getTextColorBytes() {
                return ((LiveBottomPopupRemind) ((GeneratedMessageLite.b) this).instance).getTextColorBytes();
            }

            public Builder setClick(boolean z) {
                copyOnWrite();
                ((LiveBottomPopupRemind) ((GeneratedMessageLite.b) this).instance).setClick(z);
                return this;
            }

            public Builder setShow(boolean z) {
                copyOnWrite();
                ((LiveBottomPopupRemind) ((GeneratedMessageLite.b) this).instance).setShow(z);
                return this;
            }

            public Builder setTextColor(String str) {
                copyOnWrite();
                ((LiveBottomPopupRemind) ((GeneratedMessageLite.b) this).instance).setTextColor(str);
                return this;
            }

            public Builder setTextColorBytes(ByteString byteString) {
                copyOnWrite();
                ((LiveBottomPopupRemind) ((GeneratedMessageLite.b) this).instance).setTextColorBytes(byteString);
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
            return (Builder) ((Builder) DEFAULT_INSTANCE.toBuilder()).mergeFrom(liveBottomPopupRemind);
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
            a.checkByteStringIsUtf8(byteString);
            this.textColor_ = byteString.toStringUtf8();
        }

        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (C03861.f1668xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new LiveBottomPopupRemind();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                    return null;
                case 4:
                    return new Builder();
                case 5:
                    GeneratedMessageLite.h hVar = (GeneratedMessageLite.h) obj;
                    LiveBottomPopupRemind liveBottomPopupRemind = (LiveBottomPopupRemind) obj2;
                    boolean z = this.show_;
                    boolean z2 = liveBottomPopupRemind.show_;
                    this.show_ = hVar.d(z, z, z2, z2);
                    boolean z3 = this.click_;
                    boolean z4 = liveBottomPopupRemind.click_;
                    this.click_ = hVar.d(z3, z3, z4, z4);
                    this.textColor_ = hVar.f(!this.textColor_.isEmpty(), this.textColor_, true ^ liveBottomPopupRemind.textColor_.isEmpty(), liveBottomPopupRemind.textColor_);
                    GeneratedMessageLite.g gVar = GeneratedMessageLite.g.INSTANCE;
                    return this;
                case 6:
                    e eVar = (e) obj;
                    boolean z5 = false;
                    while (!z5) {
                        try {
                            int iM = eVar.M();
                            if (iM != 0) {
                                if (iM == 8) {
                                    this.show_ = eVar.m();
                                } else if (iM == 16) {
                                    this.click_ = eVar.m();
                                } else if (iM == 26) {
                                    this.textColor_ = eVar.L();
                                } else if (!eVar.R(iM)) {
                                }
                            }
                            z5 = true;
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
                        synchronized (LiveBottomPopupRemind.class) {
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

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkLiveBottomPopup.LiveBottomPopupRemindOrBuilder
        public boolean getClick() {
            return this.click_;
        }

        public int getSerializedSize() {
            int i = ((GeneratedMessageLite) this).memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            boolean z = this.show_;
            int iF = z ? CodedOutputStream.f(1, z) : 0;
            boolean z2 = this.click_;
            if (z2) {
                iF += CodedOutputStream.f(2, z2);
            }
            if (!this.textColor_.isEmpty()) {
                iF += CodedOutputStream.K(3, getTextColor());
            }
            ((GeneratedMessageLite) this).memoizedSerializedSize = iF;
            return iF;
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

        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            boolean z = this.show_;
            if (z) {
                codedOutputStream.a0(1, z);
            }
            boolean z2 = this.click_;
            if (z2) {
                codedOutputStream.a0(2, z2);
            }
            if (this.textColor_.isEmpty()) {
                return;
            }
            codedOutputStream.D0(3, getTextColor());
        }

        public static LiveBottomPopupRemind parseDelimitedFrom(InputStream inputStream, h hVar) throws IOException {
            return (LiveBottomPopupRemind) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, hVar);
        }

        public static LiveBottomPopupRemind parseFrom(ByteString byteString, h hVar) throws InvalidProtocolBufferException {
            return (LiveBottomPopupRemind) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, hVar);
        }

        public static LiveBottomPopupRemind parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (LiveBottomPopupRemind) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static LiveBottomPopupRemind parseFrom(byte[] bArr, h hVar) throws InvalidProtocolBufferException {
            return (LiveBottomPopupRemind) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, hVar);
        }

        public static LiveBottomPopupRemind parseFrom(InputStream inputStream) throws IOException {
            return (LiveBottomPopupRemind) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static LiveBottomPopupRemind parseFrom(InputStream inputStream, h hVar) throws IOException {
            return (LiveBottomPopupRemind) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, hVar);
        }

        public static LiveBottomPopupRemind parseFrom(e eVar) throws IOException {
            return (LiveBottomPopupRemind) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, eVar);
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.toBuilder();
        }

        public static LiveBottomPopupRemind parseFrom(e eVar, h hVar) throws IOException {
            return (LiveBottomPopupRemind) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, eVar, hVar);
        }
    }

    public enum LiveBottomPopupStyleTypeEnum implements l.c {
        common(0),
        window(1),
        UNRECOGNIZED(-1);

        public static final int common_VALUE = 0;
        private static final l.d<LiveBottomPopupStyleTypeEnum> internalValueMap = new l.d<LiveBottomPopupStyleTypeEnum>() { // from class: com.p1.mobile.longlink.msg.liveroom.LongLinkLiveBottomPopup.LiveBottomPopupStyleTypeEnum.1
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

        public static l.d<LiveBottomPopupStyleTypeEnum> internalGetValueMap() {
            return internalValueMap;
        }

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

        public static final class Builder extends GeneratedMessageLite.b<LiveBottomPopupToast, Builder> implements LiveBottomPopupToastOrBuilder {
            private Builder() {
                super(LiveBottomPopupToast.DEFAULT_INSTANCE);
            }

            public Builder clearFailText() {
                copyOnWrite();
                ((LiveBottomPopupToast) ((GeneratedMessageLite.b) this).instance).clearFailText();
                return this;
            }

            public Builder clearSuccessText() {
                copyOnWrite();
                ((LiveBottomPopupToast) ((GeneratedMessageLite.b) this).instance).clearSuccessText();
                return this;
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkLiveBottomPopup.LiveBottomPopupToastOrBuilder
            public String getFailText() {
                return ((LiveBottomPopupToast) ((GeneratedMessageLite.b) this).instance).getFailText();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkLiveBottomPopup.LiveBottomPopupToastOrBuilder
            public ByteString getFailTextBytes() {
                return ((LiveBottomPopupToast) ((GeneratedMessageLite.b) this).instance).getFailTextBytes();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkLiveBottomPopup.LiveBottomPopupToastOrBuilder
            public String getSuccessText() {
                return ((LiveBottomPopupToast) ((GeneratedMessageLite.b) this).instance).getSuccessText();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkLiveBottomPopup.LiveBottomPopupToastOrBuilder
            public ByteString getSuccessTextBytes() {
                return ((LiveBottomPopupToast) ((GeneratedMessageLite.b) this).instance).getSuccessTextBytes();
            }

            public Builder setFailText(String str) {
                copyOnWrite();
                ((LiveBottomPopupToast) ((GeneratedMessageLite.b) this).instance).setFailText(str);
                return this;
            }

            public Builder setFailTextBytes(ByteString byteString) {
                copyOnWrite();
                ((LiveBottomPopupToast) ((GeneratedMessageLite.b) this).instance).setFailTextBytes(byteString);
                return this;
            }

            public Builder setSuccessText(String str) {
                copyOnWrite();
                ((LiveBottomPopupToast) ((GeneratedMessageLite.b) this).instance).setSuccessText(str);
                return this;
            }

            public Builder setSuccessTextBytes(ByteString byteString) {
                copyOnWrite();
                ((LiveBottomPopupToast) ((GeneratedMessageLite.b) this).instance).setSuccessTextBytes(byteString);
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
            return (Builder) ((Builder) DEFAULT_INSTANCE.toBuilder()).mergeFrom(liveBottomPopupToast);
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
            a.checkByteStringIsUtf8(byteString);
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
            a.checkByteStringIsUtf8(byteString);
            this.successText_ = byteString.toStringUtf8();
        }

        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (C03861.f1668xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new LiveBottomPopupToast();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                    return null;
                case 4:
                    return new Builder();
                case 5:
                    GeneratedMessageLite.h hVar = (GeneratedMessageLite.h) obj;
                    LiveBottomPopupToast liveBottomPopupToast = (LiveBottomPopupToast) obj2;
                    this.successText_ = hVar.f(!this.successText_.isEmpty(), this.successText_, !liveBottomPopupToast.successText_.isEmpty(), liveBottomPopupToast.successText_);
                    this.failText_ = hVar.f(!this.failText_.isEmpty(), this.failText_, true ^ liveBottomPopupToast.failText_.isEmpty(), liveBottomPopupToast.failText_);
                    GeneratedMessageLite.g gVar = GeneratedMessageLite.g.INSTANCE;
                    return this;
                case 6:
                    e eVar = (e) obj;
                    boolean z = false;
                    while (!z) {
                        try {
                            int iM = eVar.M();
                            if (iM != 0) {
                                if (iM == 10) {
                                    this.successText_ = eVar.L();
                                } else if (iM == 18) {
                                    this.failText_ = eVar.L();
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
                        synchronized (LiveBottomPopupToast.class) {
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

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkLiveBottomPopup.LiveBottomPopupToastOrBuilder
        public String getFailText() {
            return this.failText_;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkLiveBottomPopup.LiveBottomPopupToastOrBuilder
        public ByteString getFailTextBytes() {
            return ByteString.copyFromUtf8(this.failText_);
        }

        public int getSerializedSize() {
            int i = ((GeneratedMessageLite) this).memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int iK = !this.successText_.isEmpty() ? CodedOutputStream.K(1, getSuccessText()) : 0;
            if (!this.failText_.isEmpty()) {
                iK += CodedOutputStream.K(2, getFailText());
            }
            ((GeneratedMessageLite) this).memoizedSerializedSize = iK;
            return iK;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkLiveBottomPopup.LiveBottomPopupToastOrBuilder
        public String getSuccessText() {
            return this.successText_;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkLiveBottomPopup.LiveBottomPopupToastOrBuilder
        public ByteString getSuccessTextBytes() {
            return ByteString.copyFromUtf8(this.successText_);
        }

        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (!this.successText_.isEmpty()) {
                codedOutputStream.D0(1, getSuccessText());
            }
            if (this.failText_.isEmpty()) {
                return;
            }
            codedOutputStream.D0(2, getFailText());
        }

        public static LiveBottomPopupToast parseDelimitedFrom(InputStream inputStream, h hVar) throws IOException {
            return (LiveBottomPopupToast) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, hVar);
        }

        public static LiveBottomPopupToast parseFrom(ByteString byteString, h hVar) throws InvalidProtocolBufferException {
            return (LiveBottomPopupToast) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, hVar);
        }

        public static LiveBottomPopupToast parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (LiveBottomPopupToast) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static LiveBottomPopupToast parseFrom(byte[] bArr, h hVar) throws InvalidProtocolBufferException {
            return (LiveBottomPopupToast) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, hVar);
        }

        public static LiveBottomPopupToast parseFrom(InputStream inputStream) throws IOException {
            return (LiveBottomPopupToast) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static LiveBottomPopupToast parseFrom(InputStream inputStream, h hVar) throws IOException {
            return (LiveBottomPopupToast) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, hVar);
        }

        public static LiveBottomPopupToast parseFrom(e eVar) throws IOException {
            return (LiveBottomPopupToast) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, eVar);
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.toBuilder();
        }

        public static LiveBottomPopupToast parseFrom(e eVar, h hVar) throws IOException {
            return (LiveBottomPopupToast) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, eVar, hVar);
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
        private l.h<LiveBottomContent> text_ = GeneratedMessageLite.emptyProtobufList();
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
            a.addAll(iterable, this.text_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addText(LiveBottomContent.Builder builder) {
            ensureTextIsMutable();
            this.text_.add((LiveBottomContent) builder.build());
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
            if (this.text_.q()) {
                return;
            }
            this.text_ = GeneratedMessageLite.mutableCopy(this.text_);
        }

        public static LiveBottomWindown getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder(LiveBottomWindown liveBottomWindown) {
            return (Builder) ((Builder) DEFAULT_INSTANCE.toBuilder()).mergeFrom(liveBottomWindown);
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
            a.checkByteStringIsUtf8(byteString);
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
            a.checkByteStringIsUtf8(byteString);
            this.picture_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setText(int i, LiveBottomContent.Builder builder) {
            ensureTextIsMutable();
            this.text_.set(i, (LiveBottomContent) builder.build());
        }

        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (C03861.f1668xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new LiveBottomWindown();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                    this.text_.n();
                    return null;
                case 4:
                    return new Builder();
                case 5:
                    GeneratedMessageLite.g gVar = (GeneratedMessageLite.h) obj;
                    LiveBottomWindown liveBottomWindown = (LiveBottomWindown) obj2;
                    this.picture_ = gVar.f(!this.picture_.isEmpty(), this.picture_, !liveBottomWindown.picture_.isEmpty(), liveBottomWindown.picture_);
                    this.text_ = gVar.g(this.text_, liveBottomWindown.text_);
                    this.backgroundColor_ = gVar.f(!this.backgroundColor_.isEmpty(), this.backgroundColor_, true ^ liveBottomWindown.backgroundColor_.isEmpty(), liveBottomWindown.backgroundColor_);
                    if (gVar == GeneratedMessageLite.g.INSTANCE) {
                        this.bitField0_ |= liveBottomWindown.bitField0_;
                    }
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
                                    this.picture_ = eVar.L();
                                } else if (iM == 18) {
                                    if (!this.text_.q()) {
                                        this.text_ = GeneratedMessageLite.mutableCopy(this.text_);
                                    }
                                    this.text_.add(eVar.w(LiveBottomContent.parser(), hVar));
                                } else if (iM == 26) {
                                    this.backgroundColor_ = eVar.L();
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
                        synchronized (LiveBottomWindown.class) {
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

        public int getSerializedSize() {
            int i = ((GeneratedMessageLite) this).memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int iK = !this.picture_.isEmpty() ? CodedOutputStream.K(1, getPicture()) : 0;
            for (int i2 = 0; i2 < this.text_.size(); i2++) {
                iK += CodedOutputStream.C(2, (q) this.text_.get(i2));
            }
            if (!this.backgroundColor_.isEmpty()) {
                iK += CodedOutputStream.K(3, getBackgroundColor());
            }
            ((GeneratedMessageLite) this).memoizedSerializedSize = iK;
            return iK;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkLiveBottomPopup.LiveBottomWindownOrBuilder
        public LiveBottomContent getText(int i) {
            return (LiveBottomContent) this.text_.get(i);
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
            return (LiveBottomContentOrBuilder) this.text_.get(i);
        }

        public List<? extends LiveBottomContentOrBuilder> getTextOrBuilderList() {
            return this.text_;
        }

        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (!this.picture_.isEmpty()) {
                codedOutputStream.D0(1, getPicture());
            }
            for (int i = 0; i < this.text_.size(); i++) {
                codedOutputStream.w0(2, (q) this.text_.get(i));
            }
            if (this.backgroundColor_.isEmpty()) {
                return;
            }
            codedOutputStream.D0(3, getBackgroundColor());
        }

        public static LiveBottomWindown parseDelimitedFrom(InputStream inputStream, h hVar) throws IOException {
            return (LiveBottomWindown) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, hVar);
        }

        public static LiveBottomWindown parseFrom(ByteString byteString, h hVar) throws InvalidProtocolBufferException {
            return (LiveBottomWindown) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, hVar);
        }

        public static final class Builder extends GeneratedMessageLite.b<LiveBottomWindown, Builder> implements LiveBottomWindownOrBuilder {
            private Builder() {
                super(LiveBottomWindown.DEFAULT_INSTANCE);
            }

            public Builder addAllText(Iterable<? extends LiveBottomContent> iterable) {
                copyOnWrite();
                ((LiveBottomWindown) ((GeneratedMessageLite.b) this).instance).addAllText(iterable);
                return this;
            }

            public Builder addText(LiveBottomContent liveBottomContent) {
                copyOnWrite();
                ((LiveBottomWindown) ((GeneratedMessageLite.b) this).instance).addText(liveBottomContent);
                return this;
            }

            public Builder clearBackgroundColor() {
                copyOnWrite();
                ((LiveBottomWindown) ((GeneratedMessageLite.b) this).instance).clearBackgroundColor();
                return this;
            }

            public Builder clearPicture() {
                copyOnWrite();
                ((LiveBottomWindown) ((GeneratedMessageLite.b) this).instance).clearPicture();
                return this;
            }

            public Builder clearText() {
                copyOnWrite();
                ((LiveBottomWindown) ((GeneratedMessageLite.b) this).instance).clearText();
                return this;
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkLiveBottomPopup.LiveBottomWindownOrBuilder
            public String getBackgroundColor() {
                return ((LiveBottomWindown) ((GeneratedMessageLite.b) this).instance).getBackgroundColor();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkLiveBottomPopup.LiveBottomWindownOrBuilder
            public ByteString getBackgroundColorBytes() {
                return ((LiveBottomWindown) ((GeneratedMessageLite.b) this).instance).getBackgroundColorBytes();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkLiveBottomPopup.LiveBottomWindownOrBuilder
            public String getPicture() {
                return ((LiveBottomWindown) ((GeneratedMessageLite.b) this).instance).getPicture();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkLiveBottomPopup.LiveBottomWindownOrBuilder
            public ByteString getPictureBytes() {
                return ((LiveBottomWindown) ((GeneratedMessageLite.b) this).instance).getPictureBytes();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkLiveBottomPopup.LiveBottomWindownOrBuilder
            public LiveBottomContent getText(int i) {
                return ((LiveBottomWindown) ((GeneratedMessageLite.b) this).instance).getText(i);
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkLiveBottomPopup.LiveBottomWindownOrBuilder
            public int getTextCount() {
                return ((LiveBottomWindown) ((GeneratedMessageLite.b) this).instance).getTextCount();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkLiveBottomPopup.LiveBottomWindownOrBuilder
            public List<LiveBottomContent> getTextList() {
                return Collections.unmodifiableList(((LiveBottomWindown) ((GeneratedMessageLite.b) this).instance).getTextList());
            }

            public Builder removeText(int i) {
                copyOnWrite();
                ((LiveBottomWindown) ((GeneratedMessageLite.b) this).instance).removeText(i);
                return this;
            }

            public Builder setBackgroundColor(String str) {
                copyOnWrite();
                ((LiveBottomWindown) ((GeneratedMessageLite.b) this).instance).setBackgroundColor(str);
                return this;
            }

            public Builder setBackgroundColorBytes(ByteString byteString) {
                copyOnWrite();
                ((LiveBottomWindown) ((GeneratedMessageLite.b) this).instance).setBackgroundColorBytes(byteString);
                return this;
            }

            public Builder setPicture(String str) {
                copyOnWrite();
                ((LiveBottomWindown) ((GeneratedMessageLite.b) this).instance).setPicture(str);
                return this;
            }

            public Builder setPictureBytes(ByteString byteString) {
                copyOnWrite();
                ((LiveBottomWindown) ((GeneratedMessageLite.b) this).instance).setPictureBytes(byteString);
                return this;
            }

            public Builder setText(int i, LiveBottomContent liveBottomContent) {
                copyOnWrite();
                ((LiveBottomWindown) ((GeneratedMessageLite.b) this).instance).setText(i, liveBottomContent);
                return this;
            }

            public Builder addText(int i, LiveBottomContent liveBottomContent) {
                copyOnWrite();
                ((LiveBottomWindown) ((GeneratedMessageLite.b) this).instance).addText(i, liveBottomContent);
                return this;
            }

            public Builder setText(int i, LiveBottomContent.Builder builder) {
                copyOnWrite();
                ((LiveBottomWindown) ((GeneratedMessageLite.b) this).instance).setText(i, builder);
                return this;
            }

            public Builder addText(LiveBottomContent.Builder builder) {
                copyOnWrite();
                ((LiveBottomWindown) ((GeneratedMessageLite.b) this).instance).addText(builder);
                return this;
            }

            public Builder addText(int i, LiveBottomContent.Builder builder) {
                copyOnWrite();
                ((LiveBottomWindown) ((GeneratedMessageLite.b) this).instance).addText(i, builder);
                return this;
            }
        }

        public static LiveBottomWindown parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (LiveBottomWindown) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static LiveBottomWindown parseFrom(byte[] bArr, h hVar) throws InvalidProtocolBufferException {
            return (LiveBottomWindown) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, hVar);
        }

        public static LiveBottomWindown parseFrom(InputStream inputStream) throws IOException {
            return (LiveBottomWindown) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static LiveBottomWindown parseFrom(InputStream inputStream, h hVar) throws IOException {
            return (LiveBottomWindown) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, hVar);
        }

        public static LiveBottomWindown parseFrom(e eVar) throws IOException {
            return (LiveBottomWindown) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addText(int i, LiveBottomContent liveBottomContent) {
            liveBottomContent.getClass();
            ensureTextIsMutable();
            this.text_.add(i, liveBottomContent);
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.toBuilder();
        }

        public static LiveBottomWindown parseFrom(e eVar, h hVar) throws IOException {
            return (LiveBottomWindown) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, eVar, hVar);
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
            this.text_.add(i, (LiveBottomContent) builder.build());
        }
    }

    public static final class VideoLiveToast extends GeneratedMessageLite<VideoLiveToast, Builder> implements VideoLiveToastOrBuilder {
        private static final VideoLiveToast DEFAULT_INSTANCE;
        private static volatile i860<VideoLiveToast> PARSER = null;
        public static final int ROOMID_FIELD_NUMBER = 2;
        public static final int TOAST_FIELD_NUMBER = 1;
        private String toast_ = "";
        private String roomId_ = "";

        public static final class Builder extends GeneratedMessageLite.b<VideoLiveToast, Builder> implements VideoLiveToastOrBuilder {
            private Builder() {
                super(VideoLiveToast.DEFAULT_INSTANCE);
            }

            public Builder clearRoomId() {
                copyOnWrite();
                ((VideoLiveToast) ((GeneratedMessageLite.b) this).instance).clearRoomId();
                return this;
            }

            public Builder clearToast() {
                copyOnWrite();
                ((VideoLiveToast) ((GeneratedMessageLite.b) this).instance).clearToast();
                return this;
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkLiveBottomPopup.VideoLiveToastOrBuilder
            public String getRoomId() {
                return ((VideoLiveToast) ((GeneratedMessageLite.b) this).instance).getRoomId();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkLiveBottomPopup.VideoLiveToastOrBuilder
            public ByteString getRoomIdBytes() {
                return ((VideoLiveToast) ((GeneratedMessageLite.b) this).instance).getRoomIdBytes();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkLiveBottomPopup.VideoLiveToastOrBuilder
            public String getToast() {
                return ((VideoLiveToast) ((GeneratedMessageLite.b) this).instance).getToast();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkLiveBottomPopup.VideoLiveToastOrBuilder
            public ByteString getToastBytes() {
                return ((VideoLiveToast) ((GeneratedMessageLite.b) this).instance).getToastBytes();
            }

            public Builder setRoomId(String str) {
                copyOnWrite();
                ((VideoLiveToast) ((GeneratedMessageLite.b) this).instance).setRoomId(str);
                return this;
            }

            public Builder setRoomIdBytes(ByteString byteString) {
                copyOnWrite();
                ((VideoLiveToast) ((GeneratedMessageLite.b) this).instance).setRoomIdBytes(byteString);
                return this;
            }

            public Builder setToast(String str) {
                copyOnWrite();
                ((VideoLiveToast) ((GeneratedMessageLite.b) this).instance).setToast(str);
                return this;
            }

            public Builder setToastBytes(ByteString byteString) {
                copyOnWrite();
                ((VideoLiveToast) ((GeneratedMessageLite.b) this).instance).setToastBytes(byteString);
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
            return (Builder) ((Builder) DEFAULT_INSTANCE.toBuilder()).mergeFrom(videoLiveToast);
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
            a.checkByteStringIsUtf8(byteString);
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
            a.checkByteStringIsUtf8(byteString);
            this.toast_ = byteString.toStringUtf8();
        }

        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (C03861.f1668xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new VideoLiveToast();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                    return null;
                case 4:
                    return new Builder();
                case 5:
                    GeneratedMessageLite.h hVar = (GeneratedMessageLite.h) obj;
                    VideoLiveToast videoLiveToast = (VideoLiveToast) obj2;
                    this.toast_ = hVar.f(!this.toast_.isEmpty(), this.toast_, !videoLiveToast.toast_.isEmpty(), videoLiveToast.toast_);
                    this.roomId_ = hVar.f(!this.roomId_.isEmpty(), this.roomId_, true ^ videoLiveToast.roomId_.isEmpty(), videoLiveToast.roomId_);
                    GeneratedMessageLite.g gVar = GeneratedMessageLite.g.INSTANCE;
                    return this;
                case 6:
                    e eVar = (e) obj;
                    boolean z = false;
                    while (!z) {
                        try {
                            int iM = eVar.M();
                            if (iM != 0) {
                                if (iM == 10) {
                                    this.toast_ = eVar.L();
                                } else if (iM == 18) {
                                    this.roomId_ = eVar.L();
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
                        synchronized (VideoLiveToast.class) {
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

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkLiveBottomPopup.VideoLiveToastOrBuilder
        public String getRoomId() {
            return this.roomId_;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkLiveBottomPopup.VideoLiveToastOrBuilder
        public ByteString getRoomIdBytes() {
            return ByteString.copyFromUtf8(this.roomId_);
        }

        public int getSerializedSize() {
            int i = ((GeneratedMessageLite) this).memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int iK = !this.toast_.isEmpty() ? CodedOutputStream.K(1, getToast()) : 0;
            if (!this.roomId_.isEmpty()) {
                iK += CodedOutputStream.K(2, getRoomId());
            }
            ((GeneratedMessageLite) this).memoizedSerializedSize = iK;
            return iK;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkLiveBottomPopup.VideoLiveToastOrBuilder
        public String getToast() {
            return this.toast_;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkLiveBottomPopup.VideoLiveToastOrBuilder
        public ByteString getToastBytes() {
            return ByteString.copyFromUtf8(this.toast_);
        }

        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (!this.toast_.isEmpty()) {
                codedOutputStream.D0(1, getToast());
            }
            if (this.roomId_.isEmpty()) {
                return;
            }
            codedOutputStream.D0(2, getRoomId());
        }

        public static VideoLiveToast parseDelimitedFrom(InputStream inputStream, h hVar) throws IOException {
            return (VideoLiveToast) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, hVar);
        }

        public static VideoLiveToast parseFrom(ByteString byteString, h hVar) throws InvalidProtocolBufferException {
            return (VideoLiveToast) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, hVar);
        }

        public static VideoLiveToast parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (VideoLiveToast) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static VideoLiveToast parseFrom(byte[] bArr, h hVar) throws InvalidProtocolBufferException {
            return (VideoLiveToast) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, hVar);
        }

        public static VideoLiveToast parseFrom(InputStream inputStream) throws IOException {
            return (VideoLiveToast) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static VideoLiveToast parseFrom(InputStream inputStream, h hVar) throws IOException {
            return (VideoLiveToast) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, hVar);
        }

        public static VideoLiveToast parseFrom(e eVar) throws IOException {
            return (VideoLiveToast) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, eVar);
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.toBuilder();
        }

        public static VideoLiveToast parseFrom(e eVar, h hVar) throws IOException {
            return (VideoLiveToast) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, eVar, hVar);
        }
    }
}
