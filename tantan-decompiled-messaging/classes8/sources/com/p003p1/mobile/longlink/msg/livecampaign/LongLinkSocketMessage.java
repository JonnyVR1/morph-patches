package com.p003p1.mobile.longlink.msg.livecampaign;

import com.google.protobuf.ByteString;
import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.a;
import com.google.protobuf.e;
import com.google.protobuf.h;
import com.google.protobuf.l;
import com.google.protobuf.q;
import com.p003p1.mobile.longlink.msg.template.Template;
import java.io.IOException;
import java.io.InputStream;
import java.util.Collections;
import java.util.List;
import l.aag0;
import l.bz00;
import l.i860;
import l.o6z;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes8.dex */
public final class LongLinkSocketMessage {

    /* JADX INFO: renamed from: com.p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage$1 */
    public static /* synthetic */ class C03491 {

        /* JADX INFO: renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f1653xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f1653xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f1653xa1df5c61[GeneratedMessageLite.MethodToInvoke.IS_INITIALIZED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f1653xa1df5c61[GeneratedMessageLite.MethodToInvoke.MAKE_IMMUTABLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f1653xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f1653xa1df5c61[GeneratedMessageLite.MethodToInvoke.VISIT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f1653xa1df5c61[GeneratedMessageLite.MethodToInvoke.MERGE_FROM_STREAM.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f1653xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f1653xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    public interface DragonScourgeRecordsOrBuilder extends o6z {
        /* synthetic */ q getDefaultInstanceForType();

        String getMonsterUrls(int i);

        ByteString getMonsterUrlsBytes(int i);

        int getMonsterUrlsCount();

        List<String> getMonsterUrlsList();

        long getMonsters(int i);

        int getMonstersCount();

        List<Long> getMonstersList();

        String getSchema();

        ByteString getSchemaBytes();

        String getTitle();

        ByteString getTitleBytes();

        /* synthetic */ boolean isInitialized();
    }

    public interface H5DrawerLoadingOrBuilder extends o6z {
        /* synthetic */ q getDefaultInstanceForType();

        String getEndColor();

        ByteString getEndColorBytes();

        String getImageUrl();

        ByteString getImageUrlBytes();

        String getLoadingType();

        ByteString getLoadingTypeBytes();

        String getStartColor();

        ByteString getStartColorBytes();

        long getTransparency();

        /* synthetic */ boolean isInitialized();
    }

    public interface H5DrawerOrBuilder extends o6z {
        String getCloseButtonUrl();

        ByteString getCloseButtonUrlBytes();

        /* synthetic */ q getDefaultInstanceForType();

        long getFadingSeconds();

        String getH5Url();

        ByteString getH5UrlBytes();

        double getHeight();

        H5DrawerLoading getLoading();

        double getWidth();

        boolean hasLoading();

        /* synthetic */ boolean isInitialized();
    }

    public interface H5PopUpOrBuilder extends o6z {
        /* synthetic */ q getDefaultInstanceForType();

        String getJumpScheme();

        ByteString getJumpSchemeBytes();

        /* synthetic */ boolean isInitialized();
    }

    public interface LiveAnimationPlayMsgOrBuilder extends o6z {
        String getAnimationType();

        ByteString getAnimationTypeBytes();

        /* synthetic */ q getDefaultInstanceForType();

        long getDuration();

        String getLiveResourceId();

        ByteString getLiveResourceIdBytes();

        long getPriority();

        String getRoomId();

        ByteString getRoomIdBytes();

        SvgaEffectExtra getSvgaEffectExtras(int i);

        int getSvgaEffectExtrasCount();

        List<SvgaEffectExtra> getSvgaEffectExtrasList();

        boolean getToMyQueue();

        VideoEffectExtra getVideoEffectExtras(int i);

        int getVideoEffectExtrasCount();

        List<VideoEffectExtra> getVideoEffectExtrasList();

        /* synthetic */ boolean isInitialized();
    }

    public interface LotteryGiftRedPacketAnimationMsgOrBuilder extends o6z {
        /* synthetic */ q getDefaultInstanceForType();

        LotteryGiftRedPacketGift getGift();

        LotteryGiftRedPacketSender getSender();

        long getShowSeconds();

        boolean hasGift();

        boolean hasSender();

        /* synthetic */ boolean isInitialized();
    }

    public interface LotteryGiftRedPacketGiftOrBuilder extends o6z {
        long getAmount();

        /* synthetic */ q getDefaultInstanceForType();

        String getId();

        ByteString getIdBytes();

        String getName();

        ByteString getNameBytes();

        long getNum();

        String getUrl();

        ByteString getUrlBytes();

        /* synthetic */ boolean isInitialized();
    }

    public interface LotteryGiftRedPacketSenderOrBuilder extends o6z {
        String getAvatarUrl();

        ByteString getAvatarUrlBytes();

        /* synthetic */ q getDefaultInstanceForType();

        String getName();

        ByteString getNameBytes();

        String getUserId();

        ByteString getUserIdBytes();

        /* synthetic */ boolean isInitialized();
    }

    public interface MysteryBoxRecordOrBuilder extends o6z {
        /* synthetic */ q getDefaultInstanceForType();

        String getIconUrl();

        ByteString getIconUrlBytes();

        long getNum();

        MysteryBoxReward getRewards(int i);

        int getRewardsCount();

        List<MysteryBoxReward> getRewardsList();

        Template.TemplateData getTemplate();

        boolean hasTemplate();

        /* synthetic */ boolean isInitialized();
    }

    public interface MysteryBoxRewardOrBuilder extends o6z {
        /* synthetic */ q getDefaultInstanceForType();

        String getName();

        ByteString getNameBytes();

        long getNum();

        String getUrl();

        ByteString getUrlBytes();

        /* synthetic */ boolean isInitialized();
    }

    public interface OperationAnimationEnterOrBuilder extends o6z {
        String getAnimationType();

        ByteString getAnimationTypeBytes();

        /* synthetic */ q getDefaultInstanceForType();

        String getImageUrl();

        ByteString getImageUrlBytes();

        boolean getIsTop();

        /* synthetic */ boolean isInitialized();
    }

    public interface OperationAnimationOrBuilder extends o6z {
        /* synthetic */ q getDefaultInstanceForType();

        OperationAnimationEnter getEnter();

        boolean hasEnter();

        /* synthetic */ boolean isInitialized();
    }

    public interface OperationHierarchyOrBuilder extends o6z {
        /* synthetic */ q getDefaultInstanceForType();

        long getUserHierarchy();

        /* synthetic */ boolean isInitialized();
    }

    public interface OperationPopupNoticeOrBuilder extends o6z {
        /* synthetic */ q getDefaultInstanceForType();

        H5Drawer getDrawer();

        H5PopUp getH5PopUp();

        String getOperationType();

        ByteString getOperationTypeBytes();

        OperationPopupNotice.OperationPopupType getPopupType();

        int getPopupTypeValue();

        TextDrawer getTextDrawer();

        long getTimestamp();

        boolean hasDrawer();

        boolean hasH5PopUp();

        boolean hasTextDrawer();

        /* synthetic */ boolean isInitialized();
    }

    public interface OperationSubscriptionOrBuilder extends o6z {
        String getData();

        ByteString getDataBytes();

        /* synthetic */ q getDefaultInstanceForType();

        String getSubscribeType();

        ByteString getSubscribeTypeBytes();

        String getUpdateType();

        ByteString getUpdateTypeBytes();

        /* synthetic */ boolean isInitialized();
    }

    public interface OperationUpdateNoticeOrBuilder extends o6z {
        OperationAnimation getAnimation();

        String getData();

        ByteString getDataBytes();

        /* synthetic */ q getDefaultInstanceForType();

        String getOperationType();

        ByteString getOperationTypeBytes();

        OperationUpdateNotice.OperationUpdatePosition getPosition();

        int getPositionValue();

        long getRandomDelaySeconds();

        OperationSubscription getSubscription();

        long getTimestamp();

        boolean hasAnimation();

        boolean hasSubscription();

        /* synthetic */ boolean isInitialized();
    }

    public interface PopUpContentUpdateNoticeOrBuilder extends o6z {
        String getData();

        ByteString getDataBytes();

        /* synthetic */ q getDefaultInstanceForType();

        String getRoomId();

        ByteString getRoomIdBytes();

        String getUpdateType();

        ByteString getUpdateTypeBytes();

        String getUrl();

        ByteString getUrlBytes();

        /* synthetic */ boolean isInitialized();
    }

    public interface PopUpOrBuilder extends o6z {
        String getCampaignId();

        ByteString getCampaignIdBytes();

        /* synthetic */ q getDefaultInstanceForType();

        String getRoomId();

        ByteString getRoomIdBytes();

        /* synthetic */ boolean isInitialized();
    }

    public interface ReceiveLiveRedPacketMsgOrBuilder extends o6z {
        long getAmount();

        /* synthetic */ q getDefaultInstanceForType();

        Template.TemplateData getTemplate();

        String getUserId();

        ByteString getUserIdBytes();

        String getUserName();

        ByteString getUserNameBytes();

        boolean hasTemplate();

        /* synthetic */ boolean isInitialized();
    }

    public interface SendLiveRedPacketMsgOrBuilder extends o6z {
        /* synthetic */ q getDefaultInstanceForType();

        long getNumberOfPackets();

        String getRedPacketID();

        ByteString getRedPacketIDBytes();

        String getSendUserID();

        ByteString getSendUserIDBytes();

        Template.TemplateData getTemplate();

        String getToken();

        ByteString getTokenBytes();

        boolean hasTemplate();

        /* synthetic */ boolean isInitialized();
    }

    public interface ShadingOrBuilder extends o6z {
        /* synthetic */ q getDefaultInstanceForType();

        String getEndColor();

        ByteString getEndColorBytes();

        String getImageUrl();

        ByteString getImageUrlBytes();

        String getShadingType();

        ByteString getShadingTypeBytes();

        String getStartColor();

        ByteString getStartColorBytes();

        long getTransparency();

        /* synthetic */ boolean isInitialized();
    }

    public interface SvgaEffectExtraOrBuilder extends o6z {
        /* synthetic */ q getDefaultInstanceForType();

        String getId();

        ByteString getIdBytes();

        String getTextColor();

        ByteString getTextColorBytes();

        long getTextSize();

        long getType();

        String getValue();

        ByteString getValueBytes();

        /* synthetic */ boolean isInitialized();
    }

    public interface TextDrawerContentOrBuilder extends o6z {
        /* synthetic */ q getDefaultInstanceForType();

        OperationHierarchy getHierarchy();

        String getTemplateFields(int i);

        ByteString getTemplateFieldsBytes(int i);

        int getTemplateFieldsCount();

        List<String> getTemplateFieldsList();

        long getTemplateId();

        boolean hasHierarchy();

        /* synthetic */ boolean isInitialized();
    }

    public interface TextDrawerOrBuilder extends o6z {
        String getActionAfterClick();

        ByteString getActionAfterClickBytes();

        TextDrawerContent getContent();

        /* synthetic */ q getDefaultInstanceForType();

        String getIconUrl();

        ByteString getIconUrlBytes();

        String getJumpScheme();

        ByteString getJumpSchemeBytes();

        Shading getShading();

        boolean hasContent();

        boolean hasShading();

        /* synthetic */ boolean isInitialized();
    }

    public interface TopEffectOrBuilder extends o6z {
        String getAvatarUrl();

        ByteString getAvatarUrlBytes();

        String getBackgroundSVGAUrl();

        ByteString getBackgroundSVGAUrlBytes();

        String getBackgroundUrl();

        ByteString getBackgroundUrlBytes();

        String getContent();

        ByteString getContentBytes();

        /* synthetic */ q getDefaultInstanceForType();

        long getDuration();

        String getEffectBackgroundUrl();

        ByteString getEffectBackgroundUrlBytes();

        String getEndBackendColor();

        ByteString getEndBackendColorBytes();

        String getRoomId();

        ByteString getRoomIdBytes();

        String getStartBackendColor();

        ByteString getStartBackendColorBytes();

        String getSubtitleColor();

        ByteString getSubtitleColorBytes();

        String getUserName();

        ByteString getUserNameBytes();

        /* synthetic */ boolean isInitialized();
    }

    public interface VideoEffectExtraOrBuilder extends o6z {
        /* synthetic */ q getDefaultInstanceForType();

        String getId();

        ByteString getIdBytes();

        long getType();

        String getValue();

        ByteString getValueBytes();

        /* synthetic */ boolean isInitialized();
    }

    private LongLinkSocketMessage() {
    }

    public static void registerAllExtensions(h hVar) {
    }

    public static final class OperationPopupNotice extends GeneratedMessageLite<OperationPopupNotice, Builder> implements OperationPopupNoticeOrBuilder {
        private static final OperationPopupNotice DEFAULT_INSTANCE;
        public static final int DRAWER_FIELD_NUMBER = 4;
        public static final int H5POPUP_FIELD_NUMBER = 5;
        public static final int OPERATIONTYPE_FIELD_NUMBER = 1;
        private static volatile i860<OperationPopupNotice> PARSER = null;
        public static final int POPUPTYPE_FIELD_NUMBER = 2;
        public static final int TEXTDRAWER_FIELD_NUMBER = 3;
        public static final int TIMESTAMP_FIELD_NUMBER = 6;
        private H5Drawer drawer_;
        private H5PopUp h5PopUp_;
        private String operationType_ = "";
        private int popupType_;
        private TextDrawer textDrawer_;
        private long timestamp_;

        static {
            OperationPopupNotice operationPopupNotice = new OperationPopupNotice();
            DEFAULT_INSTANCE = operationPopupNotice;
            operationPopupNotice.makeImmutable();
        }

        private OperationPopupNotice() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearDrawer() {
            this.drawer_ = null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearH5PopUp() {
            this.h5PopUp_ = null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearOperationType() {
            this.operationType_ = getDefaultInstance().getOperationType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearPopupType() {
            this.popupType_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearTextDrawer() {
            this.textDrawer_ = null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearTimestamp() {
            this.timestamp_ = 0L;
        }

        public static OperationPopupNotice getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeDrawer(H5Drawer h5Drawer) {
            H5Drawer h5Drawer2 = this.drawer_;
            if (h5Drawer2 == null || h5Drawer2 == H5Drawer.getDefaultInstance()) {
                this.drawer_ = h5Drawer;
            } else {
                this.drawer_ = (H5Drawer) ((H5Drawer.Builder) H5Drawer.newBuilder(this.drawer_).mergeFrom(h5Drawer)).buildPartial();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeH5PopUp(H5PopUp h5PopUp) {
            H5PopUp h5PopUp2 = this.h5PopUp_;
            if (h5PopUp2 == null || h5PopUp2 == H5PopUp.getDefaultInstance()) {
                this.h5PopUp_ = h5PopUp;
            } else {
                this.h5PopUp_ = (H5PopUp) ((H5PopUp.Builder) H5PopUp.newBuilder(this.h5PopUp_).mergeFrom(h5PopUp)).buildPartial();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeTextDrawer(TextDrawer textDrawer) {
            TextDrawer textDrawer2 = this.textDrawer_;
            if (textDrawer2 == null || textDrawer2 == TextDrawer.getDefaultInstance()) {
                this.textDrawer_ = textDrawer;
            } else {
                this.textDrawer_ = (TextDrawer) ((TextDrawer.Builder) TextDrawer.newBuilder(this.textDrawer_).mergeFrom(textDrawer)).buildPartial();
            }
        }

        public static Builder newBuilder(OperationPopupNotice operationPopupNotice) {
            return (Builder) ((Builder) DEFAULT_INSTANCE.toBuilder()).mergeFrom(operationPopupNotice);
        }

        public static OperationPopupNotice parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (OperationPopupNotice) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static OperationPopupNotice parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (OperationPopupNotice) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static i860<OperationPopupNotice> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setDrawer(H5Drawer.Builder builder) {
            this.drawer_ = (H5Drawer) builder.build();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setH5PopUp(H5PopUp.Builder builder) {
            this.h5PopUp_ = (H5PopUp) builder.build();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setOperationType(String str) {
            str.getClass();
            this.operationType_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setOperationTypeBytes(ByteString byteString) {
            byteString.getClass();
            a.checkByteStringIsUtf8(byteString);
            this.operationType_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setPopupType(OperationPopupType operationPopupType) {
            operationPopupType.getClass();
            this.popupType_ = operationPopupType.getNumber();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setPopupTypeValue(int i) {
            this.popupType_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTextDrawer(TextDrawer.Builder builder) {
            this.textDrawer_ = (TextDrawer) builder.build();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTimestamp(long j) {
            this.timestamp_ = j;
        }

        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            boolean z = false;
            switch (C03491.f1653xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new OperationPopupNotice();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                    return null;
                case 4:
                    return new Builder();
                case 5:
                    GeneratedMessageLite.h hVar = (GeneratedMessageLite.h) obj;
                    OperationPopupNotice operationPopupNotice = (OperationPopupNotice) obj2;
                    this.operationType_ = hVar.f(!this.operationType_.isEmpty(), this.operationType_, !operationPopupNotice.operationType_.isEmpty(), operationPopupNotice.operationType_);
                    int i = this.popupType_;
                    boolean z2 = i != 0;
                    int i2 = operationPopupNotice.popupType_;
                    this.popupType_ = hVar.e(z2, i, i2 != 0, i2);
                    this.textDrawer_ = hVar.o(this.textDrawer_, operationPopupNotice.textDrawer_);
                    this.drawer_ = hVar.o(this.drawer_, operationPopupNotice.drawer_);
                    this.h5PopUp_ = hVar.o(this.h5PopUp_, operationPopupNotice.h5PopUp_);
                    long j = this.timestamp_;
                    boolean z3 = j != 0;
                    long j2 = operationPopupNotice.timestamp_;
                    this.timestamp_ = hVar.i(z3, j, j2 != 0, j2);
                    GeneratedMessageLite.g gVar = GeneratedMessageLite.g.INSTANCE;
                    return this;
                case 6:
                    e eVar = (e) obj;
                    h hVar2 = (h) obj2;
                    while (!z) {
                        try {
                            int iM = eVar.M();
                            if (iM != 0) {
                                if (iM == 10) {
                                    this.operationType_ = eVar.L();
                                } else if (iM == 16) {
                                    this.popupType_ = eVar.p();
                                } else if (iM == 26) {
                                    TextDrawer textDrawer = this.textDrawer_;
                                    TextDrawer.Builder builder = textDrawer != null ? (TextDrawer.Builder) textDrawer.toBuilder() : null;
                                    TextDrawer textDrawerW = eVar.w(TextDrawer.parser(), hVar2);
                                    this.textDrawer_ = textDrawerW;
                                    if (builder != null) {
                                        builder.mergeFrom(textDrawerW);
                                        this.textDrawer_ = (TextDrawer) builder.buildPartial();
                                    }
                                } else if (iM == 34) {
                                    H5Drawer h5Drawer = this.drawer_;
                                    H5Drawer.Builder builder2 = h5Drawer != null ? (H5Drawer.Builder) h5Drawer.toBuilder() : null;
                                    H5Drawer h5DrawerW = eVar.w(H5Drawer.parser(), hVar2);
                                    this.drawer_ = h5DrawerW;
                                    if (builder2 != null) {
                                        builder2.mergeFrom(h5DrawerW);
                                        this.drawer_ = (H5Drawer) builder2.buildPartial();
                                    }
                                } else if (iM == 42) {
                                    H5PopUp h5PopUp = this.h5PopUp_;
                                    H5PopUp.Builder builder3 = h5PopUp != null ? (H5PopUp.Builder) h5PopUp.toBuilder() : null;
                                    H5PopUp h5PopUpW = eVar.w(H5PopUp.parser(), hVar2);
                                    this.h5PopUp_ = h5PopUpW;
                                    if (builder3 != null) {
                                        builder3.mergeFrom(h5PopUpW);
                                        this.h5PopUp_ = (H5PopUp) builder3.buildPartial();
                                    }
                                } else if (iM == 48) {
                                    this.timestamp_ = eVar.v();
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
                        synchronized (OperationPopupNotice.class) {
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

        @Override // com.p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage.OperationPopupNoticeOrBuilder
        public H5Drawer getDrawer() {
            H5Drawer h5Drawer = this.drawer_;
            return h5Drawer == null ? H5Drawer.getDefaultInstance() : h5Drawer;
        }

        @Override // com.p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage.OperationPopupNoticeOrBuilder
        public H5PopUp getH5PopUp() {
            H5PopUp h5PopUp = this.h5PopUp_;
            return h5PopUp == null ? H5PopUp.getDefaultInstance() : h5PopUp;
        }

        @Override // com.p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage.OperationPopupNoticeOrBuilder
        public String getOperationType() {
            return this.operationType_;
        }

        @Override // com.p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage.OperationPopupNoticeOrBuilder
        public ByteString getOperationTypeBytes() {
            return ByteString.copyFromUtf8(this.operationType_);
        }

        @Override // com.p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage.OperationPopupNoticeOrBuilder
        public OperationPopupType getPopupType() {
            OperationPopupType operationPopupTypeForNumber = OperationPopupType.forNumber(this.popupType_);
            return operationPopupTypeForNumber == null ? OperationPopupType.UNRECOGNIZED : operationPopupTypeForNumber;
        }

        @Override // com.p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage.OperationPopupNoticeOrBuilder
        public int getPopupTypeValue() {
            return this.popupType_;
        }

        public int getSerializedSize() {
            int i = ((GeneratedMessageLite) this).memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int iK = !this.operationType_.isEmpty() ? CodedOutputStream.K(1, getOperationType()) : 0;
            if (this.popupType_ != OperationPopupType.Unknown.getNumber()) {
                iK += CodedOutputStream.m(2, this.popupType_);
            }
            if (this.textDrawer_ != null) {
                iK += CodedOutputStream.C(3, getTextDrawer());
            }
            if (this.drawer_ != null) {
                iK += CodedOutputStream.C(4, getDrawer());
            }
            if (this.h5PopUp_ != null) {
                iK += CodedOutputStream.C(5, getH5PopUp());
            }
            long j = this.timestamp_;
            if (j != 0) {
                iK += CodedOutputStream.v(6, j);
            }
            ((GeneratedMessageLite) this).memoizedSerializedSize = iK;
            return iK;
        }

        @Override // com.p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage.OperationPopupNoticeOrBuilder
        public TextDrawer getTextDrawer() {
            TextDrawer textDrawer = this.textDrawer_;
            return textDrawer == null ? TextDrawer.getDefaultInstance() : textDrawer;
        }

        @Override // com.p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage.OperationPopupNoticeOrBuilder
        public long getTimestamp() {
            return this.timestamp_;
        }

        @Override // com.p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage.OperationPopupNoticeOrBuilder
        public boolean hasDrawer() {
            return this.drawer_ != null;
        }

        @Override // com.p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage.OperationPopupNoticeOrBuilder
        public boolean hasH5PopUp() {
            return this.h5PopUp_ != null;
        }

        @Override // com.p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage.OperationPopupNoticeOrBuilder
        public boolean hasTextDrawer() {
            return this.textDrawer_ != null;
        }

        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (!this.operationType_.isEmpty()) {
                codedOutputStream.D0(1, getOperationType());
            }
            if (this.popupType_ != OperationPopupType.Unknown.getNumber()) {
                codedOutputStream.i0(2, this.popupType_);
            }
            if (this.textDrawer_ != null) {
                codedOutputStream.w0(3, getTextDrawer());
            }
            if (this.drawer_ != null) {
                codedOutputStream.w0(4, getDrawer());
            }
            if (this.h5PopUp_ != null) {
                codedOutputStream.w0(5, getH5PopUp());
            }
            long j = this.timestamp_;
            if (j != 0) {
                codedOutputStream.u0(6, j);
            }
        }

        public enum OperationPopupType implements l.c {
            Unknown(0),
            H5Drawer(1),
            TextDrawer(2),
            H5PopUp(3),
            UNRECOGNIZED(-1);

            public static final int H5Drawer_VALUE = 1;
            public static final int H5PopUp_VALUE = 3;
            public static final int TextDrawer_VALUE = 2;
            public static final int Unknown_VALUE = 0;
            private static final l.d<OperationPopupType> internalValueMap = new l.d<OperationPopupType>() { // from class: com.p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage.OperationPopupNotice.OperationPopupType.1
                public OperationPopupType findValueByNumber(int i) {
                    return OperationPopupType.forNumber(i);
                }
            };
            private final int value;

            OperationPopupType(int i) {
                this.value = i;
            }

            public static OperationPopupType forNumber(int i) {
                if (i == 0) {
                    return Unknown;
                }
                if (i == 1) {
                    return H5Drawer;
                }
                if (i == 2) {
                    return TextDrawer;
                }
                if (i != 3) {
                    return null;
                }
                return H5PopUp;
            }

            public static l.d<OperationPopupType> internalGetValueMap() {
                return internalValueMap;
            }

            public final int getNumber() {
                return this.value;
            }

            @Deprecated
            public static OperationPopupType valueOf(int i) {
                return forNumber(i);
            }
        }

        public static OperationPopupNotice parseDelimitedFrom(InputStream inputStream, h hVar) throws IOException {
            return (OperationPopupNotice) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, hVar);
        }

        public static OperationPopupNotice parseFrom(ByteString byteString, h hVar) throws InvalidProtocolBufferException {
            return (OperationPopupNotice) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, hVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setDrawer(H5Drawer h5Drawer) {
            h5Drawer.getClass();
            this.drawer_ = h5Drawer;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setH5PopUp(H5PopUp h5PopUp) {
            h5PopUp.getClass();
            this.h5PopUp_ = h5PopUp;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTextDrawer(TextDrawer textDrawer) {
            textDrawer.getClass();
            this.textDrawer_ = textDrawer;
        }

        public static final class Builder extends GeneratedMessageLite.b<OperationPopupNotice, Builder> implements OperationPopupNoticeOrBuilder {
            private Builder() {
                super(OperationPopupNotice.DEFAULT_INSTANCE);
            }

            public Builder clearDrawer() {
                copyOnWrite();
                ((OperationPopupNotice) ((GeneratedMessageLite.b) this).instance).clearDrawer();
                return this;
            }

            public Builder clearH5PopUp() {
                copyOnWrite();
                ((OperationPopupNotice) ((GeneratedMessageLite.b) this).instance).clearH5PopUp();
                return this;
            }

            public Builder clearOperationType() {
                copyOnWrite();
                ((OperationPopupNotice) ((GeneratedMessageLite.b) this).instance).clearOperationType();
                return this;
            }

            public Builder clearPopupType() {
                copyOnWrite();
                ((OperationPopupNotice) ((GeneratedMessageLite.b) this).instance).clearPopupType();
                return this;
            }

            public Builder clearTextDrawer() {
                copyOnWrite();
                ((OperationPopupNotice) ((GeneratedMessageLite.b) this).instance).clearTextDrawer();
                return this;
            }

            public Builder clearTimestamp() {
                copyOnWrite();
                ((OperationPopupNotice) ((GeneratedMessageLite.b) this).instance).clearTimestamp();
                return this;
            }

            @Override // com.p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage.OperationPopupNoticeOrBuilder
            public H5Drawer getDrawer() {
                return ((OperationPopupNotice) ((GeneratedMessageLite.b) this).instance).getDrawer();
            }

            @Override // com.p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage.OperationPopupNoticeOrBuilder
            public H5PopUp getH5PopUp() {
                return ((OperationPopupNotice) ((GeneratedMessageLite.b) this).instance).getH5PopUp();
            }

            @Override // com.p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage.OperationPopupNoticeOrBuilder
            public String getOperationType() {
                return ((OperationPopupNotice) ((GeneratedMessageLite.b) this).instance).getOperationType();
            }

            @Override // com.p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage.OperationPopupNoticeOrBuilder
            public ByteString getOperationTypeBytes() {
                return ((OperationPopupNotice) ((GeneratedMessageLite.b) this).instance).getOperationTypeBytes();
            }

            @Override // com.p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage.OperationPopupNoticeOrBuilder
            public OperationPopupType getPopupType() {
                return ((OperationPopupNotice) ((GeneratedMessageLite.b) this).instance).getPopupType();
            }

            @Override // com.p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage.OperationPopupNoticeOrBuilder
            public int getPopupTypeValue() {
                return ((OperationPopupNotice) ((GeneratedMessageLite.b) this).instance).getPopupTypeValue();
            }

            @Override // com.p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage.OperationPopupNoticeOrBuilder
            public TextDrawer getTextDrawer() {
                return ((OperationPopupNotice) ((GeneratedMessageLite.b) this).instance).getTextDrawer();
            }

            @Override // com.p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage.OperationPopupNoticeOrBuilder
            public long getTimestamp() {
                return ((OperationPopupNotice) ((GeneratedMessageLite.b) this).instance).getTimestamp();
            }

            @Override // com.p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage.OperationPopupNoticeOrBuilder
            public boolean hasDrawer() {
                return ((OperationPopupNotice) ((GeneratedMessageLite.b) this).instance).hasDrawer();
            }

            @Override // com.p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage.OperationPopupNoticeOrBuilder
            public boolean hasH5PopUp() {
                return ((OperationPopupNotice) ((GeneratedMessageLite.b) this).instance).hasH5PopUp();
            }

            @Override // com.p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage.OperationPopupNoticeOrBuilder
            public boolean hasTextDrawer() {
                return ((OperationPopupNotice) ((GeneratedMessageLite.b) this).instance).hasTextDrawer();
            }

            public Builder mergeDrawer(H5Drawer h5Drawer) {
                copyOnWrite();
                ((OperationPopupNotice) ((GeneratedMessageLite.b) this).instance).mergeDrawer(h5Drawer);
                return this;
            }

            public Builder mergeH5PopUp(H5PopUp h5PopUp) {
                copyOnWrite();
                ((OperationPopupNotice) ((GeneratedMessageLite.b) this).instance).mergeH5PopUp(h5PopUp);
                return this;
            }

            public Builder mergeTextDrawer(TextDrawer textDrawer) {
                copyOnWrite();
                ((OperationPopupNotice) ((GeneratedMessageLite.b) this).instance).mergeTextDrawer(textDrawer);
                return this;
            }

            public Builder setDrawer(H5Drawer h5Drawer) {
                copyOnWrite();
                ((OperationPopupNotice) ((GeneratedMessageLite.b) this).instance).setDrawer(h5Drawer);
                return this;
            }

            public Builder setH5PopUp(H5PopUp h5PopUp) {
                copyOnWrite();
                ((OperationPopupNotice) ((GeneratedMessageLite.b) this).instance).setH5PopUp(h5PopUp);
                return this;
            }

            public Builder setOperationType(String str) {
                copyOnWrite();
                ((OperationPopupNotice) ((GeneratedMessageLite.b) this).instance).setOperationType(str);
                return this;
            }

            public Builder setOperationTypeBytes(ByteString byteString) {
                copyOnWrite();
                ((OperationPopupNotice) ((GeneratedMessageLite.b) this).instance).setOperationTypeBytes(byteString);
                return this;
            }

            public Builder setPopupType(OperationPopupType operationPopupType) {
                copyOnWrite();
                ((OperationPopupNotice) ((GeneratedMessageLite.b) this).instance).setPopupType(operationPopupType);
                return this;
            }

            public Builder setPopupTypeValue(int i) {
                copyOnWrite();
                ((OperationPopupNotice) ((GeneratedMessageLite.b) this).instance).setPopupTypeValue(i);
                return this;
            }

            public Builder setTextDrawer(TextDrawer textDrawer) {
                copyOnWrite();
                ((OperationPopupNotice) ((GeneratedMessageLite.b) this).instance).setTextDrawer(textDrawer);
                return this;
            }

            public Builder setTimestamp(long j) {
                copyOnWrite();
                ((OperationPopupNotice) ((GeneratedMessageLite.b) this).instance).setTimestamp(j);
                return this;
            }

            public Builder setDrawer(H5Drawer.Builder builder) {
                copyOnWrite();
                ((OperationPopupNotice) ((GeneratedMessageLite.b) this).instance).setDrawer(builder);
                return this;
            }

            public Builder setH5PopUp(H5PopUp.Builder builder) {
                copyOnWrite();
                ((OperationPopupNotice) ((GeneratedMessageLite.b) this).instance).setH5PopUp(builder);
                return this;
            }

            public Builder setTextDrawer(TextDrawer.Builder builder) {
                copyOnWrite();
                ((OperationPopupNotice) ((GeneratedMessageLite.b) this).instance).setTextDrawer(builder);
                return this;
            }
        }

        public static OperationPopupNotice parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (OperationPopupNotice) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static OperationPopupNotice parseFrom(byte[] bArr, h hVar) throws InvalidProtocolBufferException {
            return (OperationPopupNotice) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, hVar);
        }

        public static OperationPopupNotice parseFrom(InputStream inputStream) throws IOException {
            return (OperationPopupNotice) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static OperationPopupNotice parseFrom(InputStream inputStream, h hVar) throws IOException {
            return (OperationPopupNotice) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, hVar);
        }

        public static OperationPopupNotice parseFrom(e eVar) throws IOException {
            return (OperationPopupNotice) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, eVar);
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.toBuilder();
        }

        public static OperationPopupNotice parseFrom(e eVar, h hVar) throws IOException {
            return (OperationPopupNotice) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, eVar, hVar);
        }
    }

    public static final class OperationUpdateNotice extends GeneratedMessageLite<OperationUpdateNotice, Builder> implements OperationUpdateNoticeOrBuilder {
        public static final int ANIMATION_FIELD_NUMBER = 7;
        public static final int DATA_FIELD_NUMBER = 6;
        private static final OperationUpdateNotice DEFAULT_INSTANCE;
        public static final int OPERATIONTYPE_FIELD_NUMBER = 3;
        private static volatile i860<OperationUpdateNotice> PARSER = null;
        public static final int POSITION_FIELD_NUMBER = 1;
        public static final int RANDOMDELAYSECONDS_FIELD_NUMBER = 4;
        public static final int SUBSCRIPTION_FIELD_NUMBER = 2;
        public static final int TIMESTAMP_FIELD_NUMBER = 5;
        private OperationAnimation animation_;
        private int position_;
        private long randomDelaySeconds_;
        private OperationSubscription subscription_;
        private long timestamp_;
        private String operationType_ = "";
        private String data_ = "";

        static {
            OperationUpdateNotice operationUpdateNotice = new OperationUpdateNotice();
            DEFAULT_INSTANCE = operationUpdateNotice;
            operationUpdateNotice.makeImmutable();
        }

        private OperationUpdateNotice() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAnimation() {
            this.animation_ = null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearData() {
            this.data_ = getDefaultInstance().getData();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearOperationType() {
            this.operationType_ = getDefaultInstance().getOperationType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearPosition() {
            this.position_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearRandomDelaySeconds() {
            this.randomDelaySeconds_ = 0L;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearSubscription() {
            this.subscription_ = null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearTimestamp() {
            this.timestamp_ = 0L;
        }

        public static OperationUpdateNotice getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeAnimation(OperationAnimation operationAnimation) {
            OperationAnimation operationAnimation2 = this.animation_;
            if (operationAnimation2 == null || operationAnimation2 == OperationAnimation.getDefaultInstance()) {
                this.animation_ = operationAnimation;
            } else {
                this.animation_ = (OperationAnimation) ((OperationAnimation.Builder) OperationAnimation.newBuilder(this.animation_).mergeFrom(operationAnimation)).buildPartial();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeSubscription(OperationSubscription operationSubscription) {
            OperationSubscription operationSubscription2 = this.subscription_;
            if (operationSubscription2 == null || operationSubscription2 == OperationSubscription.getDefaultInstance()) {
                this.subscription_ = operationSubscription;
            } else {
                this.subscription_ = (OperationSubscription) ((OperationSubscription.Builder) OperationSubscription.newBuilder(this.subscription_).mergeFrom(operationSubscription)).buildPartial();
            }
        }

        public static Builder newBuilder(OperationUpdateNotice operationUpdateNotice) {
            return (Builder) ((Builder) DEFAULT_INSTANCE.toBuilder()).mergeFrom(operationUpdateNotice);
        }

        public static OperationUpdateNotice parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (OperationUpdateNotice) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static OperationUpdateNotice parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (OperationUpdateNotice) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static i860<OperationUpdateNotice> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAnimation(OperationAnimation.Builder builder) {
            this.animation_ = (OperationAnimation) builder.build();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setData(String str) {
            str.getClass();
            this.data_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setDataBytes(ByteString byteString) {
            byteString.getClass();
            a.checkByteStringIsUtf8(byteString);
            this.data_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setOperationType(String str) {
            str.getClass();
            this.operationType_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setOperationTypeBytes(ByteString byteString) {
            byteString.getClass();
            a.checkByteStringIsUtf8(byteString);
            this.operationType_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setPosition(OperationUpdatePosition operationUpdatePosition) {
            operationUpdatePosition.getClass();
            this.position_ = operationUpdatePosition.getNumber();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setPositionValue(int i) {
            this.position_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setRandomDelaySeconds(long j) {
            this.randomDelaySeconds_ = j;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSubscription(OperationSubscription.Builder builder) {
            this.subscription_ = (OperationSubscription) builder.build();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTimestamp(long j) {
            this.timestamp_ = j;
        }

        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            boolean z = false;
            switch (C03491.f1653xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new OperationUpdateNotice();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                    return null;
                case 4:
                    return new Builder();
                case 5:
                    GeneratedMessageLite.h hVar = (GeneratedMessageLite.h) obj;
                    OperationUpdateNotice operationUpdateNotice = (OperationUpdateNotice) obj2;
                    int i = this.position_;
                    boolean z2 = i != 0;
                    int i2 = operationUpdateNotice.position_;
                    this.position_ = hVar.e(z2, i, i2 != 0, i2);
                    this.subscription_ = hVar.o(this.subscription_, operationUpdateNotice.subscription_);
                    this.operationType_ = hVar.f(!this.operationType_.isEmpty(), this.operationType_, !operationUpdateNotice.operationType_.isEmpty(), operationUpdateNotice.operationType_);
                    long j = this.randomDelaySeconds_;
                    boolean z3 = j != 0;
                    long j2 = operationUpdateNotice.randomDelaySeconds_;
                    this.randomDelaySeconds_ = hVar.i(z3, j, j2 != 0, j2);
                    long j3 = this.timestamp_;
                    boolean z4 = j3 != 0;
                    long j4 = operationUpdateNotice.timestamp_;
                    this.timestamp_ = hVar.i(z4, j3, j4 != 0, j4);
                    this.data_ = hVar.f(!this.data_.isEmpty(), this.data_, !operationUpdateNotice.data_.isEmpty(), operationUpdateNotice.data_);
                    this.animation_ = hVar.o(this.animation_, operationUpdateNotice.animation_);
                    GeneratedMessageLite.g gVar = GeneratedMessageLite.g.INSTANCE;
                    return this;
                case 6:
                    e eVar = (e) obj;
                    h hVar2 = (h) obj2;
                    while (!z) {
                        try {
                            int iM = eVar.M();
                            if (iM != 0) {
                                if (iM == 8) {
                                    this.position_ = eVar.p();
                                } else if (iM == 18) {
                                    OperationSubscription operationSubscription = this.subscription_;
                                    OperationSubscription.Builder builder = operationSubscription != null ? (OperationSubscription.Builder) operationSubscription.toBuilder() : null;
                                    OperationSubscription operationSubscriptionW = eVar.w(OperationSubscription.parser(), hVar2);
                                    this.subscription_ = operationSubscriptionW;
                                    if (builder != null) {
                                        builder.mergeFrom(operationSubscriptionW);
                                        this.subscription_ = (OperationSubscription) builder.buildPartial();
                                    }
                                } else if (iM == 26) {
                                    this.operationType_ = eVar.L();
                                } else if (iM == 32) {
                                    this.randomDelaySeconds_ = eVar.v();
                                } else if (iM == 40) {
                                    this.timestamp_ = eVar.v();
                                } else if (iM == 50) {
                                    this.data_ = eVar.L();
                                } else if (iM == 58) {
                                    OperationAnimation operationAnimation = this.animation_;
                                    OperationAnimation.Builder builder2 = operationAnimation != null ? (OperationAnimation.Builder) operationAnimation.toBuilder() : null;
                                    OperationAnimation operationAnimationW = eVar.w(OperationAnimation.parser(), hVar2);
                                    this.animation_ = operationAnimationW;
                                    if (builder2 != null) {
                                        builder2.mergeFrom(operationAnimationW);
                                        this.animation_ = (OperationAnimation) builder2.buildPartial();
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
                        synchronized (OperationUpdateNotice.class) {
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

        @Override // com.p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage.OperationUpdateNoticeOrBuilder
        public OperationAnimation getAnimation() {
            OperationAnimation operationAnimation = this.animation_;
            return operationAnimation == null ? OperationAnimation.getDefaultInstance() : operationAnimation;
        }

        @Override // com.p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage.OperationUpdateNoticeOrBuilder
        public String getData() {
            return this.data_;
        }

        @Override // com.p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage.OperationUpdateNoticeOrBuilder
        public ByteString getDataBytes() {
            return ByteString.copyFromUtf8(this.data_);
        }

        @Override // com.p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage.OperationUpdateNoticeOrBuilder
        public String getOperationType() {
            return this.operationType_;
        }

        @Override // com.p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage.OperationUpdateNoticeOrBuilder
        public ByteString getOperationTypeBytes() {
            return ByteString.copyFromUtf8(this.operationType_);
        }

        @Override // com.p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage.OperationUpdateNoticeOrBuilder
        public OperationUpdatePosition getPosition() {
            OperationUpdatePosition operationUpdatePositionForNumber = OperationUpdatePosition.forNumber(this.position_);
            return operationUpdatePositionForNumber == null ? OperationUpdatePosition.UNRECOGNIZED : operationUpdatePositionForNumber;
        }

        @Override // com.p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage.OperationUpdateNoticeOrBuilder
        public int getPositionValue() {
            return this.position_;
        }

        @Override // com.p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage.OperationUpdateNoticeOrBuilder
        public long getRandomDelaySeconds() {
            return this.randomDelaySeconds_;
        }

        public int getSerializedSize() {
            int i = ((GeneratedMessageLite) this).memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int iM = this.position_ != OperationUpdatePosition.Unknown.getNumber() ? CodedOutputStream.m(1, this.position_) : 0;
            if (this.subscription_ != null) {
                iM += CodedOutputStream.C(2, getSubscription());
            }
            if (!this.operationType_.isEmpty()) {
                iM += CodedOutputStream.K(3, getOperationType());
            }
            long j = this.randomDelaySeconds_;
            if (j != 0) {
                iM += CodedOutputStream.v(4, j);
            }
            long j2 = this.timestamp_;
            if (j2 != 0) {
                iM += CodedOutputStream.v(5, j2);
            }
            if (!this.data_.isEmpty()) {
                iM += CodedOutputStream.K(6, getData());
            }
            if (this.animation_ != null) {
                iM += CodedOutputStream.C(7, getAnimation());
            }
            ((GeneratedMessageLite) this).memoizedSerializedSize = iM;
            return iM;
        }

        @Override // com.p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage.OperationUpdateNoticeOrBuilder
        public OperationSubscription getSubscription() {
            OperationSubscription operationSubscription = this.subscription_;
            return operationSubscription == null ? OperationSubscription.getDefaultInstance() : operationSubscription;
        }

        @Override // com.p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage.OperationUpdateNoticeOrBuilder
        public long getTimestamp() {
            return this.timestamp_;
        }

        @Override // com.p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage.OperationUpdateNoticeOrBuilder
        public boolean hasAnimation() {
            return this.animation_ != null;
        }

        @Override // com.p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage.OperationUpdateNoticeOrBuilder
        public boolean hasSubscription() {
            return this.subscription_ != null;
        }

        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (this.position_ != OperationUpdatePosition.Unknown.getNumber()) {
                codedOutputStream.i0(1, this.position_);
            }
            if (this.subscription_ != null) {
                codedOutputStream.w0(2, getSubscription());
            }
            if (!this.operationType_.isEmpty()) {
                codedOutputStream.D0(3, getOperationType());
            }
            long j = this.randomDelaySeconds_;
            if (j != 0) {
                codedOutputStream.u0(4, j);
            }
            long j2 = this.timestamp_;
            if (j2 != 0) {
                codedOutputStream.u0(5, j2);
            }
            if (!this.data_.isEmpty()) {
                codedOutputStream.D0(6, getData());
            }
            if (this.animation_ != null) {
                codedOutputStream.w0(7, getAnimation());
            }
        }

        public enum OperationUpdatePosition implements l.c {
            Unknown(0),
            List(1),
            Element(2),
            H5Drawer(3),
            Data(4),
            UNRECOGNIZED(-1);

            public static final int Data_VALUE = 4;
            public static final int Element_VALUE = 2;
            public static final int H5Drawer_VALUE = 3;
            public static final int List_VALUE = 1;
            public static final int Unknown_VALUE = 0;
            private static final l.d<OperationUpdatePosition> internalValueMap = new l.d<OperationUpdatePosition>() { // from class: com.p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage.OperationUpdateNotice.OperationUpdatePosition.1
                public OperationUpdatePosition findValueByNumber(int i) {
                    return OperationUpdatePosition.forNumber(i);
                }
            };
            private final int value;

            OperationUpdatePosition(int i) {
                this.value = i;
            }

            public static OperationUpdatePosition forNumber(int i) {
                if (i == 0) {
                    return Unknown;
                }
                if (i == 1) {
                    return List;
                }
                if (i == 2) {
                    return Element;
                }
                if (i == 3) {
                    return H5Drawer;
                }
                if (i != 4) {
                    return null;
                }
                return Data;
            }

            public static l.d<OperationUpdatePosition> internalGetValueMap() {
                return internalValueMap;
            }

            public final int getNumber() {
                return this.value;
            }

            @Deprecated
            public static OperationUpdatePosition valueOf(int i) {
                return forNumber(i);
            }
        }

        public static OperationUpdateNotice parseDelimitedFrom(InputStream inputStream, h hVar) throws IOException {
            return (OperationUpdateNotice) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, hVar);
        }

        public static OperationUpdateNotice parseFrom(ByteString byteString, h hVar) throws InvalidProtocolBufferException {
            return (OperationUpdateNotice) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, hVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAnimation(OperationAnimation operationAnimation) {
            operationAnimation.getClass();
            this.animation_ = operationAnimation;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSubscription(OperationSubscription operationSubscription) {
            operationSubscription.getClass();
            this.subscription_ = operationSubscription;
        }

        public static final class Builder extends GeneratedMessageLite.b<OperationUpdateNotice, Builder> implements OperationUpdateNoticeOrBuilder {
            private Builder() {
                super(OperationUpdateNotice.DEFAULT_INSTANCE);
            }

            public Builder clearAnimation() {
                copyOnWrite();
                ((OperationUpdateNotice) ((GeneratedMessageLite.b) this).instance).clearAnimation();
                return this;
            }

            public Builder clearData() {
                copyOnWrite();
                ((OperationUpdateNotice) ((GeneratedMessageLite.b) this).instance).clearData();
                return this;
            }

            public Builder clearOperationType() {
                copyOnWrite();
                ((OperationUpdateNotice) ((GeneratedMessageLite.b) this).instance).clearOperationType();
                return this;
            }

            public Builder clearPosition() {
                copyOnWrite();
                ((OperationUpdateNotice) ((GeneratedMessageLite.b) this).instance).clearPosition();
                return this;
            }

            public Builder clearRandomDelaySeconds() {
                copyOnWrite();
                ((OperationUpdateNotice) ((GeneratedMessageLite.b) this).instance).clearRandomDelaySeconds();
                return this;
            }

            public Builder clearSubscription() {
                copyOnWrite();
                ((OperationUpdateNotice) ((GeneratedMessageLite.b) this).instance).clearSubscription();
                return this;
            }

            public Builder clearTimestamp() {
                copyOnWrite();
                ((OperationUpdateNotice) ((GeneratedMessageLite.b) this).instance).clearTimestamp();
                return this;
            }

            @Override // com.p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage.OperationUpdateNoticeOrBuilder
            public OperationAnimation getAnimation() {
                return ((OperationUpdateNotice) ((GeneratedMessageLite.b) this).instance).getAnimation();
            }

            @Override // com.p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage.OperationUpdateNoticeOrBuilder
            public String getData() {
                return ((OperationUpdateNotice) ((GeneratedMessageLite.b) this).instance).getData();
            }

            @Override // com.p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage.OperationUpdateNoticeOrBuilder
            public ByteString getDataBytes() {
                return ((OperationUpdateNotice) ((GeneratedMessageLite.b) this).instance).getDataBytes();
            }

            @Override // com.p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage.OperationUpdateNoticeOrBuilder
            public String getOperationType() {
                return ((OperationUpdateNotice) ((GeneratedMessageLite.b) this).instance).getOperationType();
            }

            @Override // com.p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage.OperationUpdateNoticeOrBuilder
            public ByteString getOperationTypeBytes() {
                return ((OperationUpdateNotice) ((GeneratedMessageLite.b) this).instance).getOperationTypeBytes();
            }

            @Override // com.p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage.OperationUpdateNoticeOrBuilder
            public OperationUpdatePosition getPosition() {
                return ((OperationUpdateNotice) ((GeneratedMessageLite.b) this).instance).getPosition();
            }

            @Override // com.p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage.OperationUpdateNoticeOrBuilder
            public int getPositionValue() {
                return ((OperationUpdateNotice) ((GeneratedMessageLite.b) this).instance).getPositionValue();
            }

            @Override // com.p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage.OperationUpdateNoticeOrBuilder
            public long getRandomDelaySeconds() {
                return ((OperationUpdateNotice) ((GeneratedMessageLite.b) this).instance).getRandomDelaySeconds();
            }

            @Override // com.p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage.OperationUpdateNoticeOrBuilder
            public OperationSubscription getSubscription() {
                return ((OperationUpdateNotice) ((GeneratedMessageLite.b) this).instance).getSubscription();
            }

            @Override // com.p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage.OperationUpdateNoticeOrBuilder
            public long getTimestamp() {
                return ((OperationUpdateNotice) ((GeneratedMessageLite.b) this).instance).getTimestamp();
            }

            @Override // com.p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage.OperationUpdateNoticeOrBuilder
            public boolean hasAnimation() {
                return ((OperationUpdateNotice) ((GeneratedMessageLite.b) this).instance).hasAnimation();
            }

            @Override // com.p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage.OperationUpdateNoticeOrBuilder
            public boolean hasSubscription() {
                return ((OperationUpdateNotice) ((GeneratedMessageLite.b) this).instance).hasSubscription();
            }

            public Builder mergeAnimation(OperationAnimation operationAnimation) {
                copyOnWrite();
                ((OperationUpdateNotice) ((GeneratedMessageLite.b) this).instance).mergeAnimation(operationAnimation);
                return this;
            }

            public Builder mergeSubscription(OperationSubscription operationSubscription) {
                copyOnWrite();
                ((OperationUpdateNotice) ((GeneratedMessageLite.b) this).instance).mergeSubscription(operationSubscription);
                return this;
            }

            public Builder setAnimation(OperationAnimation operationAnimation) {
                copyOnWrite();
                ((OperationUpdateNotice) ((GeneratedMessageLite.b) this).instance).setAnimation(operationAnimation);
                return this;
            }

            public Builder setData(String str) {
                copyOnWrite();
                ((OperationUpdateNotice) ((GeneratedMessageLite.b) this).instance).setData(str);
                return this;
            }

            public Builder setDataBytes(ByteString byteString) {
                copyOnWrite();
                ((OperationUpdateNotice) ((GeneratedMessageLite.b) this).instance).setDataBytes(byteString);
                return this;
            }

            public Builder setOperationType(String str) {
                copyOnWrite();
                ((OperationUpdateNotice) ((GeneratedMessageLite.b) this).instance).setOperationType(str);
                return this;
            }

            public Builder setOperationTypeBytes(ByteString byteString) {
                copyOnWrite();
                ((OperationUpdateNotice) ((GeneratedMessageLite.b) this).instance).setOperationTypeBytes(byteString);
                return this;
            }

            public Builder setPosition(OperationUpdatePosition operationUpdatePosition) {
                copyOnWrite();
                ((OperationUpdateNotice) ((GeneratedMessageLite.b) this).instance).setPosition(operationUpdatePosition);
                return this;
            }

            public Builder setPositionValue(int i) {
                copyOnWrite();
                ((OperationUpdateNotice) ((GeneratedMessageLite.b) this).instance).setPositionValue(i);
                return this;
            }

            public Builder setRandomDelaySeconds(long j) {
                copyOnWrite();
                ((OperationUpdateNotice) ((GeneratedMessageLite.b) this).instance).setRandomDelaySeconds(j);
                return this;
            }

            public Builder setSubscription(OperationSubscription operationSubscription) {
                copyOnWrite();
                ((OperationUpdateNotice) ((GeneratedMessageLite.b) this).instance).setSubscription(operationSubscription);
                return this;
            }

            public Builder setTimestamp(long j) {
                copyOnWrite();
                ((OperationUpdateNotice) ((GeneratedMessageLite.b) this).instance).setTimestamp(j);
                return this;
            }

            public Builder setAnimation(OperationAnimation.Builder builder) {
                copyOnWrite();
                ((OperationUpdateNotice) ((GeneratedMessageLite.b) this).instance).setAnimation(builder);
                return this;
            }

            public Builder setSubscription(OperationSubscription.Builder builder) {
                copyOnWrite();
                ((OperationUpdateNotice) ((GeneratedMessageLite.b) this).instance).setSubscription(builder);
                return this;
            }
        }

        public static OperationUpdateNotice parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (OperationUpdateNotice) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static OperationUpdateNotice parseFrom(byte[] bArr, h hVar) throws InvalidProtocolBufferException {
            return (OperationUpdateNotice) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, hVar);
        }

        public static OperationUpdateNotice parseFrom(InputStream inputStream) throws IOException {
            return (OperationUpdateNotice) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static OperationUpdateNotice parseFrom(InputStream inputStream, h hVar) throws IOException {
            return (OperationUpdateNotice) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, hVar);
        }

        public static OperationUpdateNotice parseFrom(e eVar) throws IOException {
            return (OperationUpdateNotice) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, eVar);
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.toBuilder();
        }

        public static OperationUpdateNotice parseFrom(e eVar, h hVar) throws IOException {
            return (OperationUpdateNotice) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, eVar, hVar);
        }
    }

    public static final class DragonScourgeRecords extends GeneratedMessageLite<DragonScourgeRecords, Builder> implements DragonScourgeRecordsOrBuilder {
        private static final DragonScourgeRecords DEFAULT_INSTANCE;
        public static final int MONSTERS_FIELD_NUMBER = 3;
        public static final int MONSTERURLS_FIELD_NUMBER = 1;
        private static volatile i860<DragonScourgeRecords> PARSER = null;
        public static final int SCHEMA_FIELD_NUMBER = 4;
        public static final int TITLE_FIELD_NUMBER = 2;
        private int bitField0_;
        private l.h<String> monsterUrls_ = GeneratedMessageLite.emptyProtobufList();
        private String title_ = "";
        private l.g monsters_ = GeneratedMessageLite.emptyLongList();
        private String schema_ = "";

        public static final class Builder extends GeneratedMessageLite.b<DragonScourgeRecords, Builder> implements DragonScourgeRecordsOrBuilder {
            private Builder() {
                super(DragonScourgeRecords.DEFAULT_INSTANCE);
            }

            public Builder addAllMonsterUrls(Iterable<String> iterable) {
                copyOnWrite();
                ((DragonScourgeRecords) ((GeneratedMessageLite.b) this).instance).addAllMonsterUrls(iterable);
                return this;
            }

            public Builder addAllMonsters(Iterable<? extends Long> iterable) {
                copyOnWrite();
                ((DragonScourgeRecords) ((GeneratedMessageLite.b) this).instance).addAllMonsters(iterable);
                return this;
            }

            public Builder addMonsterUrls(String str) {
                copyOnWrite();
                ((DragonScourgeRecords) ((GeneratedMessageLite.b) this).instance).addMonsterUrls(str);
                return this;
            }

            public Builder addMonsterUrlsBytes(ByteString byteString) {
                copyOnWrite();
                ((DragonScourgeRecords) ((GeneratedMessageLite.b) this).instance).addMonsterUrlsBytes(byteString);
                return this;
            }

            public Builder addMonsters(long j) {
                copyOnWrite();
                ((DragonScourgeRecords) ((GeneratedMessageLite.b) this).instance).addMonsters(j);
                return this;
            }

            public Builder clearMonsterUrls() {
                copyOnWrite();
                ((DragonScourgeRecords) ((GeneratedMessageLite.b) this).instance).clearMonsterUrls();
                return this;
            }

            public Builder clearMonsters() {
                copyOnWrite();
                ((DragonScourgeRecords) ((GeneratedMessageLite.b) this).instance).clearMonsters();
                return this;
            }

            public Builder clearSchema() {
                copyOnWrite();
                ((DragonScourgeRecords) ((GeneratedMessageLite.b) this).instance).clearSchema();
                return this;
            }

            public Builder clearTitle() {
                copyOnWrite();
                ((DragonScourgeRecords) ((GeneratedMessageLite.b) this).instance).clearTitle();
                return this;
            }

            @Override // com.p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage.DragonScourgeRecordsOrBuilder
            public String getMonsterUrls(int i) {
                return ((DragonScourgeRecords) ((GeneratedMessageLite.b) this).instance).getMonsterUrls(i);
            }

            @Override // com.p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage.DragonScourgeRecordsOrBuilder
            public ByteString getMonsterUrlsBytes(int i) {
                return ((DragonScourgeRecords) ((GeneratedMessageLite.b) this).instance).getMonsterUrlsBytes(i);
            }

            @Override // com.p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage.DragonScourgeRecordsOrBuilder
            public int getMonsterUrlsCount() {
                return ((DragonScourgeRecords) ((GeneratedMessageLite.b) this).instance).getMonsterUrlsCount();
            }

            @Override // com.p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage.DragonScourgeRecordsOrBuilder
            public List<String> getMonsterUrlsList() {
                return Collections.unmodifiableList(((DragonScourgeRecords) ((GeneratedMessageLite.b) this).instance).getMonsterUrlsList());
            }

            @Override // com.p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage.DragonScourgeRecordsOrBuilder
            public long getMonsters(int i) {
                return ((DragonScourgeRecords) ((GeneratedMessageLite.b) this).instance).getMonsters(i);
            }

            @Override // com.p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage.DragonScourgeRecordsOrBuilder
            public int getMonstersCount() {
                return ((DragonScourgeRecords) ((GeneratedMessageLite.b) this).instance).getMonstersCount();
            }

            @Override // com.p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage.DragonScourgeRecordsOrBuilder
            public List<Long> getMonstersList() {
                return Collections.unmodifiableList(((DragonScourgeRecords) ((GeneratedMessageLite.b) this).instance).getMonstersList());
            }

            @Override // com.p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage.DragonScourgeRecordsOrBuilder
            public String getSchema() {
                return ((DragonScourgeRecords) ((GeneratedMessageLite.b) this).instance).getSchema();
            }

            @Override // com.p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage.DragonScourgeRecordsOrBuilder
            public ByteString getSchemaBytes() {
                return ((DragonScourgeRecords) ((GeneratedMessageLite.b) this).instance).getSchemaBytes();
            }

            @Override // com.p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage.DragonScourgeRecordsOrBuilder
            public String getTitle() {
                return ((DragonScourgeRecords) ((GeneratedMessageLite.b) this).instance).getTitle();
            }

            @Override // com.p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage.DragonScourgeRecordsOrBuilder
            public ByteString getTitleBytes() {
                return ((DragonScourgeRecords) ((GeneratedMessageLite.b) this).instance).getTitleBytes();
            }

            public Builder setMonsterUrls(int i, String str) {
                copyOnWrite();
                ((DragonScourgeRecords) ((GeneratedMessageLite.b) this).instance).setMonsterUrls(i, str);
                return this;
            }

            public Builder setMonsters(int i, long j) {
                copyOnWrite();
                ((DragonScourgeRecords) ((GeneratedMessageLite.b) this).instance).setMonsters(i, j);
                return this;
            }

            public Builder setSchema(String str) {
                copyOnWrite();
                ((DragonScourgeRecords) ((GeneratedMessageLite.b) this).instance).setSchema(str);
                return this;
            }

            public Builder setSchemaBytes(ByteString byteString) {
                copyOnWrite();
                ((DragonScourgeRecords) ((GeneratedMessageLite.b) this).instance).setSchemaBytes(byteString);
                return this;
            }

            public Builder setTitle(String str) {
                copyOnWrite();
                ((DragonScourgeRecords) ((GeneratedMessageLite.b) this).instance).setTitle(str);
                return this;
            }

            public Builder setTitleBytes(ByteString byteString) {
                copyOnWrite();
                ((DragonScourgeRecords) ((GeneratedMessageLite.b) this).instance).setTitleBytes(byteString);
                return this;
            }
        }

        static {
            DragonScourgeRecords dragonScourgeRecords = new DragonScourgeRecords();
            DEFAULT_INSTANCE = dragonScourgeRecords;
            dragonScourgeRecords.makeImmutable();
        }

        private DragonScourgeRecords() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllMonsterUrls(Iterable<String> iterable) {
            ensureMonsterUrlsIsMutable();
            a.addAll(iterable, this.monsterUrls_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllMonsters(Iterable<? extends Long> iterable) {
            ensureMonstersIsMutable();
            a.addAll(iterable, this.monsters_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addMonsterUrls(String str) {
            str.getClass();
            ensureMonsterUrlsIsMutable();
            this.monsterUrls_.add(str);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addMonsterUrlsBytes(ByteString byteString) {
            byteString.getClass();
            a.checkByteStringIsUtf8(byteString);
            ensureMonsterUrlsIsMutable();
            this.monsterUrls_.add(byteString.toStringUtf8());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addMonsters(long j) {
            ensureMonstersIsMutable();
            this.monsters_.u(j);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearMonsterUrls() {
            this.monsterUrls_ = GeneratedMessageLite.emptyProtobufList();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearMonsters() {
            this.monsters_ = GeneratedMessageLite.emptyLongList();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearSchema() {
            this.schema_ = getDefaultInstance().getSchema();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearTitle() {
            this.title_ = getDefaultInstance().getTitle();
        }

        private void ensureMonsterUrlsIsMutable() {
            if (this.monsterUrls_.q()) {
                return;
            }
            this.monsterUrls_ = GeneratedMessageLite.mutableCopy(this.monsterUrls_);
        }

        private void ensureMonstersIsMutable() {
            if (this.monsters_.q()) {
                return;
            }
            this.monsters_ = GeneratedMessageLite.mutableCopy(this.monsters_);
        }

        public static DragonScourgeRecords getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder(DragonScourgeRecords dragonScourgeRecords) {
            return (Builder) ((Builder) DEFAULT_INSTANCE.toBuilder()).mergeFrom(dragonScourgeRecords);
        }

        public static DragonScourgeRecords parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (DragonScourgeRecords) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static DragonScourgeRecords parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (DragonScourgeRecords) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static i860<DragonScourgeRecords> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setMonsterUrls(int i, String str) {
            str.getClass();
            ensureMonsterUrlsIsMutable();
            this.monsterUrls_.set(i, str);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setMonsters(int i, long j) {
            ensureMonstersIsMutable();
            this.monsters_.setLong(i, j);
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

        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (C03491.f1653xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new DragonScourgeRecords();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                    this.monsterUrls_.n();
                    this.monsters_.n();
                    return null;
                case 4:
                    return new Builder();
                case 5:
                    GeneratedMessageLite.g gVar = (GeneratedMessageLite.h) obj;
                    DragonScourgeRecords dragonScourgeRecords = (DragonScourgeRecords) obj2;
                    this.monsterUrls_ = gVar.g(this.monsterUrls_, dragonScourgeRecords.monsterUrls_);
                    this.title_ = gVar.f(!this.title_.isEmpty(), this.title_, !dragonScourgeRecords.title_.isEmpty(), dragonScourgeRecords.title_);
                    this.monsters_ = gVar.q(this.monsters_, dragonScourgeRecords.monsters_);
                    this.schema_ = gVar.f(!this.schema_.isEmpty(), this.schema_, true ^ dragonScourgeRecords.schema_.isEmpty(), dragonScourgeRecords.schema_);
                    if (gVar == GeneratedMessageLite.g.INSTANCE) {
                        this.bitField0_ |= dragonScourgeRecords.bitField0_;
                    }
                    return this;
                case 6:
                    e eVar = (e) obj;
                    boolean z = false;
                    while (!z) {
                        try {
                            int iM = eVar.M();
                            if (iM != 0) {
                                if (iM == 10) {
                                    String strL = eVar.L();
                                    if (!this.monsterUrls_.q()) {
                                        this.monsterUrls_ = GeneratedMessageLite.mutableCopy(this.monsterUrls_);
                                    }
                                    this.monsterUrls_.add(strL);
                                } else if (iM == 18) {
                                    this.title_ = eVar.L();
                                } else if (iM == 24) {
                                    if (!this.monsters_.q()) {
                                        this.monsters_ = GeneratedMessageLite.mutableCopy(this.monsters_);
                                    }
                                    this.monsters_.u(eVar.v());
                                } else if (iM == 26) {
                                    int iL = eVar.l(eVar.C());
                                    if (!this.monsters_.q() && eVar.d() > 0) {
                                        this.monsters_ = GeneratedMessageLite.mutableCopy(this.monsters_);
                                    }
                                    while (eVar.d() > 0) {
                                        this.monsters_.u(eVar.v());
                                    }
                                    eVar.k(iL);
                                } else if (iM == 34) {
                                    this.schema_ = eVar.L();
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
                        synchronized (DragonScourgeRecords.class) {
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

        @Override // com.p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage.DragonScourgeRecordsOrBuilder
        public String getMonsterUrls(int i) {
            return (String) this.monsterUrls_.get(i);
        }

        @Override // com.p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage.DragonScourgeRecordsOrBuilder
        public ByteString getMonsterUrlsBytes(int i) {
            return ByteString.copyFromUtf8((String) this.monsterUrls_.get(i));
        }

        @Override // com.p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage.DragonScourgeRecordsOrBuilder
        public int getMonsterUrlsCount() {
            return this.monsterUrls_.size();
        }

        @Override // com.p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage.DragonScourgeRecordsOrBuilder
        public List<String> getMonsterUrlsList() {
            return this.monsterUrls_;
        }

        @Override // com.p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage.DragonScourgeRecordsOrBuilder
        public long getMonsters(int i) {
            return this.monsters_.getLong(i);
        }

        @Override // com.p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage.DragonScourgeRecordsOrBuilder
        public int getMonstersCount() {
            return this.monsters_.size();
        }

        @Override // com.p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage.DragonScourgeRecordsOrBuilder
        public List<Long> getMonstersList() {
            return this.monsters_;
        }

        @Override // com.p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage.DragonScourgeRecordsOrBuilder
        public String getSchema() {
            return this.schema_;
        }

        @Override // com.p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage.DragonScourgeRecordsOrBuilder
        public ByteString getSchemaBytes() {
            return ByteString.copyFromUtf8(this.schema_);
        }

        public int getSerializedSize() {
            int i = ((GeneratedMessageLite) this).memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int iL = 0;
            for (int i2 = 0; i2 < this.monsterUrls_.size(); i2++) {
                iL += CodedOutputStream.L((String) this.monsterUrls_.get(i2));
            }
            int size = iL + getMonsterUrlsList().size();
            if (!this.title_.isEmpty()) {
                size += CodedOutputStream.K(2, getTitle());
            }
            int iW = 0;
            for (int i3 = 0; i3 < this.monsters_.size(); i3++) {
                iW += CodedOutputStream.w(this.monsters_.getLong(i3));
            }
            int size2 = size + iW + getMonstersList().size();
            if (!this.schema_.isEmpty()) {
                size2 += CodedOutputStream.K(4, getSchema());
            }
            ((GeneratedMessageLite) this).memoizedSerializedSize = size2;
            return size2;
        }

        @Override // com.p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage.DragonScourgeRecordsOrBuilder
        public String getTitle() {
            return this.title_;
        }

        @Override // com.p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage.DragonScourgeRecordsOrBuilder
        public ByteString getTitleBytes() {
            return ByteString.copyFromUtf8(this.title_);
        }

        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            getSerializedSize();
            for (int i = 0; i < this.monsterUrls_.size(); i++) {
                codedOutputStream.D0(1, (String) this.monsterUrls_.get(i));
            }
            if (!this.title_.isEmpty()) {
                codedOutputStream.D0(2, getTitle());
            }
            for (int i2 = 0; i2 < this.monsters_.size(); i2++) {
                codedOutputStream.u0(3, this.monsters_.getLong(i2));
            }
            if (this.schema_.isEmpty()) {
                return;
            }
            codedOutputStream.D0(4, getSchema());
        }

        public static DragonScourgeRecords parseDelimitedFrom(InputStream inputStream, h hVar) throws IOException {
            return (DragonScourgeRecords) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, hVar);
        }

        public static DragonScourgeRecords parseFrom(ByteString byteString, h hVar) throws InvalidProtocolBufferException {
            return (DragonScourgeRecords) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, hVar);
        }

        public static DragonScourgeRecords parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (DragonScourgeRecords) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static DragonScourgeRecords parseFrom(byte[] bArr, h hVar) throws InvalidProtocolBufferException {
            return (DragonScourgeRecords) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, hVar);
        }

        public static DragonScourgeRecords parseFrom(InputStream inputStream) throws IOException {
            return (DragonScourgeRecords) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static DragonScourgeRecords parseFrom(InputStream inputStream, h hVar) throws IOException {
            return (DragonScourgeRecords) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, hVar);
        }

        public static DragonScourgeRecords parseFrom(e eVar) throws IOException {
            return (DragonScourgeRecords) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, eVar);
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.toBuilder();
        }

        public static DragonScourgeRecords parseFrom(e eVar, h hVar) throws IOException {
            return (DragonScourgeRecords) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, eVar, hVar);
        }
    }

    public static final class H5Drawer extends GeneratedMessageLite<H5Drawer, Builder> implements H5DrawerOrBuilder {
        public static final int CLOSEBUTTONURL_FIELD_NUMBER = 3;
        private static final H5Drawer DEFAULT_INSTANCE;
        public static final int FADINGSECONDS_FIELD_NUMBER = 2;
        public static final int H5URL_FIELD_NUMBER = 1;
        public static final int HEIGHT_FIELD_NUMBER = 4;
        public static final int LOADING_FIELD_NUMBER = 6;
        private static volatile i860<H5Drawer> PARSER = null;
        public static final int WIDTH_FIELD_NUMBER = 5;
        private long fadingSeconds_;
        private double height_;
        private H5DrawerLoading loading_;
        private double width_;
        private String h5Url_ = "";
        private String closeButtonUrl_ = "";

        static {
            H5Drawer h5Drawer = new H5Drawer();
            DEFAULT_INSTANCE = h5Drawer;
            h5Drawer.makeImmutable();
        }

        private H5Drawer() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearCloseButtonUrl() {
            this.closeButtonUrl_ = getDefaultInstance().getCloseButtonUrl();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearFadingSeconds() {
            this.fadingSeconds_ = 0L;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearH5Url() {
            this.h5Url_ = getDefaultInstance().getH5Url();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearHeight() {
            this.height_ = 0.0d;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearLoading() {
            this.loading_ = null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearWidth() {
            this.width_ = 0.0d;
        }

        public static H5Drawer getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeLoading(H5DrawerLoading h5DrawerLoading) {
            H5DrawerLoading h5DrawerLoading2 = this.loading_;
            if (h5DrawerLoading2 == null || h5DrawerLoading2 == H5DrawerLoading.getDefaultInstance()) {
                this.loading_ = h5DrawerLoading;
            } else {
                this.loading_ = (H5DrawerLoading) ((H5DrawerLoading.Builder) H5DrawerLoading.newBuilder(this.loading_).mergeFrom(h5DrawerLoading)).buildPartial();
            }
        }

        public static Builder newBuilder(H5Drawer h5Drawer) {
            return (Builder) ((Builder) DEFAULT_INSTANCE.toBuilder()).mergeFrom(h5Drawer);
        }

        public static H5Drawer parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (H5Drawer) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static H5Drawer parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (H5Drawer) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static i860<H5Drawer> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setCloseButtonUrl(String str) {
            str.getClass();
            this.closeButtonUrl_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setCloseButtonUrlBytes(ByteString byteString) {
            byteString.getClass();
            a.checkByteStringIsUtf8(byteString);
            this.closeButtonUrl_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setFadingSeconds(long j) {
            this.fadingSeconds_ = j;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setH5Url(String str) {
            str.getClass();
            this.h5Url_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setH5UrlBytes(ByteString byteString) {
            byteString.getClass();
            a.checkByteStringIsUtf8(byteString);
            this.h5Url_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setHeight(double d) {
            this.height_ = d;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setLoading(H5DrawerLoading.Builder builder) {
            this.loading_ = (H5DrawerLoading) builder.build();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setWidth(double d) {
            this.width_ = d;
        }

        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            boolean z = false;
            switch (C03491.f1653xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new H5Drawer();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                    return null;
                case 4:
                    return new Builder();
                case 5:
                    GeneratedMessageLite.h hVar = (GeneratedMessageLite.h) obj;
                    H5Drawer h5Drawer = (H5Drawer) obj2;
                    this.h5Url_ = hVar.f(!this.h5Url_.isEmpty(), this.h5Url_, !h5Drawer.h5Url_.isEmpty(), h5Drawer.h5Url_);
                    long j = this.fadingSeconds_;
                    boolean z2 = j != 0;
                    long j2 = h5Drawer.fadingSeconds_;
                    this.fadingSeconds_ = hVar.i(z2, j, j2 != 0, j2);
                    this.closeButtonUrl_ = hVar.f(!this.closeButtonUrl_.isEmpty(), this.closeButtonUrl_, !h5Drawer.closeButtonUrl_.isEmpty(), h5Drawer.closeButtonUrl_);
                    double d = this.height_;
                    boolean z3 = d != 0.0d;
                    double d2 = h5Drawer.height_;
                    this.height_ = hVar.j(z3, d, d2 != 0.0d, d2);
                    boolean z4 = false;
                    double d3 = this.width_;
                    if (d3 != 0.0d) {
                        z4 = true;
                    }
                    double d4 = h5Drawer.width_;
                    this.width_ = hVar.j(z4, d3, d4 != 0.0d, d4);
                    this.loading_ = hVar.o(this.loading_, h5Drawer.loading_);
                    GeneratedMessageLite.g gVar = GeneratedMessageLite.g.INSTANCE;
                    return this;
                case 6:
                    e eVar = (e) obj;
                    h hVar2 = (h) obj2;
                    while (!z) {
                        try {
                            int iM = eVar.M();
                            if (iM != 0) {
                                if (iM == 10) {
                                    this.h5Url_ = eVar.L();
                                } else if (iM == 16) {
                                    this.fadingSeconds_ = eVar.v();
                                } else if (iM == 26) {
                                    this.closeButtonUrl_ = eVar.L();
                                } else if (iM == 33) {
                                    this.height_ = eVar.o();
                                } else if (iM == 41) {
                                    this.width_ = eVar.o();
                                } else if (iM == 50) {
                                    H5DrawerLoading h5DrawerLoading = this.loading_;
                                    H5DrawerLoading.Builder builder = h5DrawerLoading != null ? (H5DrawerLoading.Builder) h5DrawerLoading.toBuilder() : null;
                                    H5DrawerLoading h5DrawerLoadingW = eVar.w(H5DrawerLoading.parser(), hVar2);
                                    this.loading_ = h5DrawerLoadingW;
                                    if (builder != null) {
                                        builder.mergeFrom(h5DrawerLoadingW);
                                        this.loading_ = (H5DrawerLoading) builder.buildPartial();
                                    }
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
                        synchronized (H5Drawer.class) {
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

        @Override // com.p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage.H5DrawerOrBuilder
        public String getCloseButtonUrl() {
            return this.closeButtonUrl_;
        }

        @Override // com.p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage.H5DrawerOrBuilder
        public ByteString getCloseButtonUrlBytes() {
            return ByteString.copyFromUtf8(this.closeButtonUrl_);
        }

        @Override // com.p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage.H5DrawerOrBuilder
        public long getFadingSeconds() {
            return this.fadingSeconds_;
        }

        @Override // com.p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage.H5DrawerOrBuilder
        public String getH5Url() {
            return this.h5Url_;
        }

        @Override // com.p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage.H5DrawerOrBuilder
        public ByteString getH5UrlBytes() {
            return ByteString.copyFromUtf8(this.h5Url_);
        }

        @Override // com.p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage.H5DrawerOrBuilder
        public double getHeight() {
            return this.height_;
        }

        @Override // com.p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage.H5DrawerOrBuilder
        public H5DrawerLoading getLoading() {
            H5DrawerLoading h5DrawerLoading = this.loading_;
            return h5DrawerLoading == null ? H5DrawerLoading.getDefaultInstance() : h5DrawerLoading;
        }

        public int getSerializedSize() {
            int i = ((GeneratedMessageLite) this).memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int iK = !this.h5Url_.isEmpty() ? CodedOutputStream.K(1, getH5Url()) : 0;
            long j = this.fadingSeconds_;
            if (j != 0) {
                iK += CodedOutputStream.v(2, j);
            }
            if (!this.closeButtonUrl_.isEmpty()) {
                iK += CodedOutputStream.K(3, getCloseButtonUrl());
            }
            double d = this.height_;
            if (d != 0.0d) {
                iK += CodedOutputStream.k(4, d);
            }
            double d2 = this.width_;
            if (d2 != 0.0d) {
                iK += CodedOutputStream.k(5, d2);
            }
            if (this.loading_ != null) {
                iK += CodedOutputStream.C(6, getLoading());
            }
            ((GeneratedMessageLite) this).memoizedSerializedSize = iK;
            return iK;
        }

        @Override // com.p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage.H5DrawerOrBuilder
        public double getWidth() {
            return this.width_;
        }

        @Override // com.p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage.H5DrawerOrBuilder
        public boolean hasLoading() {
            return this.loading_ != null;
        }

        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (!this.h5Url_.isEmpty()) {
                codedOutputStream.D0(1, getH5Url());
            }
            long j = this.fadingSeconds_;
            if (j != 0) {
                codedOutputStream.u0(2, j);
            }
            if (!this.closeButtonUrl_.isEmpty()) {
                codedOutputStream.D0(3, getCloseButtonUrl());
            }
            double d = this.height_;
            if (d != 0.0d) {
                codedOutputStream.g0(4, d);
            }
            double d2 = this.width_;
            if (d2 != 0.0d) {
                codedOutputStream.g0(5, d2);
            }
            if (this.loading_ != null) {
                codedOutputStream.w0(6, getLoading());
            }
        }

        public static H5Drawer parseDelimitedFrom(InputStream inputStream, h hVar) throws IOException {
            return (H5Drawer) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, hVar);
        }

        public static H5Drawer parseFrom(ByteString byteString, h hVar) throws InvalidProtocolBufferException {
            return (H5Drawer) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, hVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setLoading(H5DrawerLoading h5DrawerLoading) {
            h5DrawerLoading.getClass();
            this.loading_ = h5DrawerLoading;
        }

        public static final class Builder extends GeneratedMessageLite.b<H5Drawer, Builder> implements H5DrawerOrBuilder {
            private Builder() {
                super(H5Drawer.DEFAULT_INSTANCE);
            }

            public Builder clearCloseButtonUrl() {
                copyOnWrite();
                ((H5Drawer) ((GeneratedMessageLite.b) this).instance).clearCloseButtonUrl();
                return this;
            }

            public Builder clearFadingSeconds() {
                copyOnWrite();
                ((H5Drawer) ((GeneratedMessageLite.b) this).instance).clearFadingSeconds();
                return this;
            }

            public Builder clearH5Url() {
                copyOnWrite();
                ((H5Drawer) ((GeneratedMessageLite.b) this).instance).clearH5Url();
                return this;
            }

            public Builder clearHeight() {
                copyOnWrite();
                ((H5Drawer) ((GeneratedMessageLite.b) this).instance).clearHeight();
                return this;
            }

            public Builder clearLoading() {
                copyOnWrite();
                ((H5Drawer) ((GeneratedMessageLite.b) this).instance).clearLoading();
                return this;
            }

            public Builder clearWidth() {
                copyOnWrite();
                ((H5Drawer) ((GeneratedMessageLite.b) this).instance).clearWidth();
                return this;
            }

            @Override // com.p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage.H5DrawerOrBuilder
            public String getCloseButtonUrl() {
                return ((H5Drawer) ((GeneratedMessageLite.b) this).instance).getCloseButtonUrl();
            }

            @Override // com.p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage.H5DrawerOrBuilder
            public ByteString getCloseButtonUrlBytes() {
                return ((H5Drawer) ((GeneratedMessageLite.b) this).instance).getCloseButtonUrlBytes();
            }

            @Override // com.p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage.H5DrawerOrBuilder
            public long getFadingSeconds() {
                return ((H5Drawer) ((GeneratedMessageLite.b) this).instance).getFadingSeconds();
            }

            @Override // com.p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage.H5DrawerOrBuilder
            public String getH5Url() {
                return ((H5Drawer) ((GeneratedMessageLite.b) this).instance).getH5Url();
            }

            @Override // com.p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage.H5DrawerOrBuilder
            public ByteString getH5UrlBytes() {
                return ((H5Drawer) ((GeneratedMessageLite.b) this).instance).getH5UrlBytes();
            }

            @Override // com.p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage.H5DrawerOrBuilder
            public double getHeight() {
                return ((H5Drawer) ((GeneratedMessageLite.b) this).instance).getHeight();
            }

            @Override // com.p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage.H5DrawerOrBuilder
            public H5DrawerLoading getLoading() {
                return ((H5Drawer) ((GeneratedMessageLite.b) this).instance).getLoading();
            }

            @Override // com.p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage.H5DrawerOrBuilder
            public double getWidth() {
                return ((H5Drawer) ((GeneratedMessageLite.b) this).instance).getWidth();
            }

            @Override // com.p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage.H5DrawerOrBuilder
            public boolean hasLoading() {
                return ((H5Drawer) ((GeneratedMessageLite.b) this).instance).hasLoading();
            }

            public Builder mergeLoading(H5DrawerLoading h5DrawerLoading) {
                copyOnWrite();
                ((H5Drawer) ((GeneratedMessageLite.b) this).instance).mergeLoading(h5DrawerLoading);
                return this;
            }

            public Builder setCloseButtonUrl(String str) {
                copyOnWrite();
                ((H5Drawer) ((GeneratedMessageLite.b) this).instance).setCloseButtonUrl(str);
                return this;
            }

            public Builder setCloseButtonUrlBytes(ByteString byteString) {
                copyOnWrite();
                ((H5Drawer) ((GeneratedMessageLite.b) this).instance).setCloseButtonUrlBytes(byteString);
                return this;
            }

            public Builder setFadingSeconds(long j) {
                copyOnWrite();
                ((H5Drawer) ((GeneratedMessageLite.b) this).instance).setFadingSeconds(j);
                return this;
            }

            public Builder setH5Url(String str) {
                copyOnWrite();
                ((H5Drawer) ((GeneratedMessageLite.b) this).instance).setH5Url(str);
                return this;
            }

            public Builder setH5UrlBytes(ByteString byteString) {
                copyOnWrite();
                ((H5Drawer) ((GeneratedMessageLite.b) this).instance).setH5UrlBytes(byteString);
                return this;
            }

            public Builder setHeight(double d) {
                copyOnWrite();
                ((H5Drawer) ((GeneratedMessageLite.b) this).instance).setHeight(d);
                return this;
            }

            public Builder setLoading(H5DrawerLoading h5DrawerLoading) {
                copyOnWrite();
                ((H5Drawer) ((GeneratedMessageLite.b) this).instance).setLoading(h5DrawerLoading);
                return this;
            }

            public Builder setWidth(double d) {
                copyOnWrite();
                ((H5Drawer) ((GeneratedMessageLite.b) this).instance).setWidth(d);
                return this;
            }

            public Builder setLoading(H5DrawerLoading.Builder builder) {
                copyOnWrite();
                ((H5Drawer) ((GeneratedMessageLite.b) this).instance).setLoading(builder);
                return this;
            }
        }

        public static H5Drawer parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (H5Drawer) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static H5Drawer parseFrom(byte[] bArr, h hVar) throws InvalidProtocolBufferException {
            return (H5Drawer) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, hVar);
        }

        public static H5Drawer parseFrom(InputStream inputStream) throws IOException {
            return (H5Drawer) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static H5Drawer parseFrom(InputStream inputStream, h hVar) throws IOException {
            return (H5Drawer) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, hVar);
        }

        public static H5Drawer parseFrom(e eVar) throws IOException {
            return (H5Drawer) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, eVar);
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.toBuilder();
        }

        public static H5Drawer parseFrom(e eVar, h hVar) throws IOException {
            return (H5Drawer) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, eVar, hVar);
        }
    }

    public static final class H5DrawerLoading extends GeneratedMessageLite<H5DrawerLoading, Builder> implements H5DrawerLoadingOrBuilder {
        private static final H5DrawerLoading DEFAULT_INSTANCE;
        public static final int ENDCOLOR_FIELD_NUMBER = 2;
        public static final int IMAGEURL_FIELD_NUMBER = 3;
        public static final int LOADINGTYPE_FIELD_NUMBER = 5;
        private static volatile i860<H5DrawerLoading> PARSER = null;
        public static final int STARTCOLOR_FIELD_NUMBER = 1;
        public static final int TRANSPARENCY_FIELD_NUMBER = 4;
        private long transparency_;
        private String startColor_ = "";
        private String endColor_ = "";
        private String imageUrl_ = "";
        private String loadingType_ = "";

        public static final class Builder extends GeneratedMessageLite.b<H5DrawerLoading, Builder> implements H5DrawerLoadingOrBuilder {
            private Builder() {
                super(H5DrawerLoading.DEFAULT_INSTANCE);
            }

            public Builder clearEndColor() {
                copyOnWrite();
                ((H5DrawerLoading) ((GeneratedMessageLite.b) this).instance).clearEndColor();
                return this;
            }

            public Builder clearImageUrl() {
                copyOnWrite();
                ((H5DrawerLoading) ((GeneratedMessageLite.b) this).instance).clearImageUrl();
                return this;
            }

            public Builder clearLoadingType() {
                copyOnWrite();
                ((H5DrawerLoading) ((GeneratedMessageLite.b) this).instance).clearLoadingType();
                return this;
            }

            public Builder clearStartColor() {
                copyOnWrite();
                ((H5DrawerLoading) ((GeneratedMessageLite.b) this).instance).clearStartColor();
                return this;
            }

            public Builder clearTransparency() {
                copyOnWrite();
                ((H5DrawerLoading) ((GeneratedMessageLite.b) this).instance).clearTransparency();
                return this;
            }

            @Override // com.p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage.H5DrawerLoadingOrBuilder
            public String getEndColor() {
                return ((H5DrawerLoading) ((GeneratedMessageLite.b) this).instance).getEndColor();
            }

            @Override // com.p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage.H5DrawerLoadingOrBuilder
            public ByteString getEndColorBytes() {
                return ((H5DrawerLoading) ((GeneratedMessageLite.b) this).instance).getEndColorBytes();
            }

            @Override // com.p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage.H5DrawerLoadingOrBuilder
            public String getImageUrl() {
                return ((H5DrawerLoading) ((GeneratedMessageLite.b) this).instance).getImageUrl();
            }

            @Override // com.p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage.H5DrawerLoadingOrBuilder
            public ByteString getImageUrlBytes() {
                return ((H5DrawerLoading) ((GeneratedMessageLite.b) this).instance).getImageUrlBytes();
            }

            @Override // com.p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage.H5DrawerLoadingOrBuilder
            public String getLoadingType() {
                return ((H5DrawerLoading) ((GeneratedMessageLite.b) this).instance).getLoadingType();
            }

            @Override // com.p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage.H5DrawerLoadingOrBuilder
            public ByteString getLoadingTypeBytes() {
                return ((H5DrawerLoading) ((GeneratedMessageLite.b) this).instance).getLoadingTypeBytes();
            }

            @Override // com.p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage.H5DrawerLoadingOrBuilder
            public String getStartColor() {
                return ((H5DrawerLoading) ((GeneratedMessageLite.b) this).instance).getStartColor();
            }

            @Override // com.p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage.H5DrawerLoadingOrBuilder
            public ByteString getStartColorBytes() {
                return ((H5DrawerLoading) ((GeneratedMessageLite.b) this).instance).getStartColorBytes();
            }

            @Override // com.p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage.H5DrawerLoadingOrBuilder
            public long getTransparency() {
                return ((H5DrawerLoading) ((GeneratedMessageLite.b) this).instance).getTransparency();
            }

            public Builder setEndColor(String str) {
                copyOnWrite();
                ((H5DrawerLoading) ((GeneratedMessageLite.b) this).instance).setEndColor(str);
                return this;
            }

            public Builder setEndColorBytes(ByteString byteString) {
                copyOnWrite();
                ((H5DrawerLoading) ((GeneratedMessageLite.b) this).instance).setEndColorBytes(byteString);
                return this;
            }

            public Builder setImageUrl(String str) {
                copyOnWrite();
                ((H5DrawerLoading) ((GeneratedMessageLite.b) this).instance).setImageUrl(str);
                return this;
            }

            public Builder setImageUrlBytes(ByteString byteString) {
                copyOnWrite();
                ((H5DrawerLoading) ((GeneratedMessageLite.b) this).instance).setImageUrlBytes(byteString);
                return this;
            }

            public Builder setLoadingType(String str) {
                copyOnWrite();
                ((H5DrawerLoading) ((GeneratedMessageLite.b) this).instance).setLoadingType(str);
                return this;
            }

            public Builder setLoadingTypeBytes(ByteString byteString) {
                copyOnWrite();
                ((H5DrawerLoading) ((GeneratedMessageLite.b) this).instance).setLoadingTypeBytes(byteString);
                return this;
            }

            public Builder setStartColor(String str) {
                copyOnWrite();
                ((H5DrawerLoading) ((GeneratedMessageLite.b) this).instance).setStartColor(str);
                return this;
            }

            public Builder setStartColorBytes(ByteString byteString) {
                copyOnWrite();
                ((H5DrawerLoading) ((GeneratedMessageLite.b) this).instance).setStartColorBytes(byteString);
                return this;
            }

            public Builder setTransparency(long j) {
                copyOnWrite();
                ((H5DrawerLoading) ((GeneratedMessageLite.b) this).instance).setTransparency(j);
                return this;
            }
        }

        static {
            H5DrawerLoading h5DrawerLoading = new H5DrawerLoading();
            DEFAULT_INSTANCE = h5DrawerLoading;
            h5DrawerLoading.makeImmutable();
        }

        private H5DrawerLoading() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearEndColor() {
            this.endColor_ = getDefaultInstance().getEndColor();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearImageUrl() {
            this.imageUrl_ = getDefaultInstance().getImageUrl();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearLoadingType() {
            this.loadingType_ = getDefaultInstance().getLoadingType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearStartColor() {
            this.startColor_ = getDefaultInstance().getStartColor();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearTransparency() {
            this.transparency_ = 0L;
        }

        public static H5DrawerLoading getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder(H5DrawerLoading h5DrawerLoading) {
            return (Builder) ((Builder) DEFAULT_INSTANCE.toBuilder()).mergeFrom(h5DrawerLoading);
        }

        public static H5DrawerLoading parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (H5DrawerLoading) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static H5DrawerLoading parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (H5DrawerLoading) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static i860<H5DrawerLoading> parser() {
            return DEFAULT_INSTANCE.getParserForType();
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
        public void setImageUrl(String str) {
            str.getClass();
            this.imageUrl_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setImageUrlBytes(ByteString byteString) {
            byteString.getClass();
            a.checkByteStringIsUtf8(byteString);
            this.imageUrl_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setLoadingType(String str) {
            str.getClass();
            this.loadingType_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setLoadingTypeBytes(ByteString byteString) {
            byteString.getClass();
            a.checkByteStringIsUtf8(byteString);
            this.loadingType_ = byteString.toStringUtf8();
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
        public void setTransparency(long j) {
            this.transparency_ = j;
        }

        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            boolean z = false;
            switch (C03491.f1653xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new H5DrawerLoading();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                    return null;
                case 4:
                    return new Builder();
                case 5:
                    GeneratedMessageLite.h hVar = (GeneratedMessageLite.h) obj;
                    H5DrawerLoading h5DrawerLoading = (H5DrawerLoading) obj2;
                    this.startColor_ = hVar.f(!this.startColor_.isEmpty(), this.startColor_, !h5DrawerLoading.startColor_.isEmpty(), h5DrawerLoading.startColor_);
                    this.endColor_ = hVar.f(!this.endColor_.isEmpty(), this.endColor_, !h5DrawerLoading.endColor_.isEmpty(), h5DrawerLoading.endColor_);
                    this.imageUrl_ = hVar.f(!this.imageUrl_.isEmpty(), this.imageUrl_, !h5DrawerLoading.imageUrl_.isEmpty(), h5DrawerLoading.imageUrl_);
                    long j = this.transparency_;
                    boolean z2 = j != 0;
                    long j2 = h5DrawerLoading.transparency_;
                    this.transparency_ = hVar.i(z2, j, j2 != 0, j2);
                    this.loadingType_ = hVar.f(!this.loadingType_.isEmpty(), this.loadingType_, !h5DrawerLoading.loadingType_.isEmpty(), h5DrawerLoading.loadingType_);
                    GeneratedMessageLite.g gVar = GeneratedMessageLite.g.INSTANCE;
                    return this;
                case 6:
                    e eVar = (e) obj;
                    while (!z) {
                        try {
                            int iM = eVar.M();
                            if (iM != 0) {
                                if (iM == 10) {
                                    this.startColor_ = eVar.L();
                                } else if (iM == 18) {
                                    this.endColor_ = eVar.L();
                                } else if (iM == 26) {
                                    this.imageUrl_ = eVar.L();
                                } else if (iM == 32) {
                                    this.transparency_ = eVar.v();
                                } else if (iM == 42) {
                                    this.loadingType_ = eVar.L();
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
                        synchronized (H5DrawerLoading.class) {
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

        @Override // com.p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage.H5DrawerLoadingOrBuilder
        public String getEndColor() {
            return this.endColor_;
        }

        @Override // com.p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage.H5DrawerLoadingOrBuilder
        public ByteString getEndColorBytes() {
            return ByteString.copyFromUtf8(this.endColor_);
        }

        @Override // com.p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage.H5DrawerLoadingOrBuilder
        public String getImageUrl() {
            return this.imageUrl_;
        }

        @Override // com.p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage.H5DrawerLoadingOrBuilder
        public ByteString getImageUrlBytes() {
            return ByteString.copyFromUtf8(this.imageUrl_);
        }

        @Override // com.p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage.H5DrawerLoadingOrBuilder
        public String getLoadingType() {
            return this.loadingType_;
        }

        @Override // com.p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage.H5DrawerLoadingOrBuilder
        public ByteString getLoadingTypeBytes() {
            return ByteString.copyFromUtf8(this.loadingType_);
        }

        public int getSerializedSize() {
            int i = ((GeneratedMessageLite) this).memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int iK = !this.startColor_.isEmpty() ? CodedOutputStream.K(1, getStartColor()) : 0;
            if (!this.endColor_.isEmpty()) {
                iK += CodedOutputStream.K(2, getEndColor());
            }
            if (!this.imageUrl_.isEmpty()) {
                iK += CodedOutputStream.K(3, getImageUrl());
            }
            long j = this.transparency_;
            if (j != 0) {
                iK += CodedOutputStream.v(4, j);
            }
            if (!this.loadingType_.isEmpty()) {
                iK += CodedOutputStream.K(5, getLoadingType());
            }
            ((GeneratedMessageLite) this).memoizedSerializedSize = iK;
            return iK;
        }

        @Override // com.p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage.H5DrawerLoadingOrBuilder
        public String getStartColor() {
            return this.startColor_;
        }

        @Override // com.p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage.H5DrawerLoadingOrBuilder
        public ByteString getStartColorBytes() {
            return ByteString.copyFromUtf8(this.startColor_);
        }

        @Override // com.p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage.H5DrawerLoadingOrBuilder
        public long getTransparency() {
            return this.transparency_;
        }

        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (!this.startColor_.isEmpty()) {
                codedOutputStream.D0(1, getStartColor());
            }
            if (!this.endColor_.isEmpty()) {
                codedOutputStream.D0(2, getEndColor());
            }
            if (!this.imageUrl_.isEmpty()) {
                codedOutputStream.D0(3, getImageUrl());
            }
            long j = this.transparency_;
            if (j != 0) {
                codedOutputStream.u0(4, j);
            }
            if (this.loadingType_.isEmpty()) {
                return;
            }
            codedOutputStream.D0(5, getLoadingType());
        }

        public static H5DrawerLoading parseDelimitedFrom(InputStream inputStream, h hVar) throws IOException {
            return (H5DrawerLoading) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, hVar);
        }

        public static H5DrawerLoading parseFrom(ByteString byteString, h hVar) throws InvalidProtocolBufferException {
            return (H5DrawerLoading) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, hVar);
        }

        public static H5DrawerLoading parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (H5DrawerLoading) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static H5DrawerLoading parseFrom(byte[] bArr, h hVar) throws InvalidProtocolBufferException {
            return (H5DrawerLoading) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, hVar);
        }

        public static H5DrawerLoading parseFrom(InputStream inputStream) throws IOException {
            return (H5DrawerLoading) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static H5DrawerLoading parseFrom(InputStream inputStream, h hVar) throws IOException {
            return (H5DrawerLoading) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, hVar);
        }

        public static H5DrawerLoading parseFrom(e eVar) throws IOException {
            return (H5DrawerLoading) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, eVar);
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.toBuilder();
        }

        public static H5DrawerLoading parseFrom(e eVar, h hVar) throws IOException {
            return (H5DrawerLoading) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, eVar, hVar);
        }
    }

    public static final class H5PopUp extends GeneratedMessageLite<H5PopUp, Builder> implements H5PopUpOrBuilder {
        private static final H5PopUp DEFAULT_INSTANCE;
        public static final int JUMPSCHEME_FIELD_NUMBER = 1;
        private static volatile i860<H5PopUp> PARSER;
        private String jumpScheme_ = "";

        public static final class Builder extends GeneratedMessageLite.b<H5PopUp, Builder> implements H5PopUpOrBuilder {
            private Builder() {
                super(H5PopUp.DEFAULT_INSTANCE);
            }

            public Builder clearJumpScheme() {
                copyOnWrite();
                ((H5PopUp) ((GeneratedMessageLite.b) this).instance).clearJumpScheme();
                return this;
            }

            @Override // com.p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage.H5PopUpOrBuilder
            public String getJumpScheme() {
                return ((H5PopUp) ((GeneratedMessageLite.b) this).instance).getJumpScheme();
            }

            @Override // com.p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage.H5PopUpOrBuilder
            public ByteString getJumpSchemeBytes() {
                return ((H5PopUp) ((GeneratedMessageLite.b) this).instance).getJumpSchemeBytes();
            }

            public Builder setJumpScheme(String str) {
                copyOnWrite();
                ((H5PopUp) ((GeneratedMessageLite.b) this).instance).setJumpScheme(str);
                return this;
            }

            public Builder setJumpSchemeBytes(ByteString byteString) {
                copyOnWrite();
                ((H5PopUp) ((GeneratedMessageLite.b) this).instance).setJumpSchemeBytes(byteString);
                return this;
            }
        }

        static {
            H5PopUp h5PopUp = new H5PopUp();
            DEFAULT_INSTANCE = h5PopUp;
            h5PopUp.makeImmutable();
        }

        private H5PopUp() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearJumpScheme() {
            this.jumpScheme_ = getDefaultInstance().getJumpScheme();
        }

        public static H5PopUp getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder(H5PopUp h5PopUp) {
            return (Builder) ((Builder) DEFAULT_INSTANCE.toBuilder()).mergeFrom(h5PopUp);
        }

        public static H5PopUp parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (H5PopUp) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static H5PopUp parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (H5PopUp) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static i860<H5PopUp> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setJumpScheme(String str) {
            str.getClass();
            this.jumpScheme_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setJumpSchemeBytes(ByteString byteString) {
            byteString.getClass();
            a.checkByteStringIsUtf8(byteString);
            this.jumpScheme_ = byteString.toStringUtf8();
        }

        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (C03491.f1653xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new H5PopUp();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                    return null;
                case 4:
                    return new Builder();
                case 5:
                    H5PopUp h5PopUp = (H5PopUp) obj2;
                    this.jumpScheme_ = ((GeneratedMessageLite.h) obj).f(!this.jumpScheme_.isEmpty(), this.jumpScheme_, true ^ h5PopUp.jumpScheme_.isEmpty(), h5PopUp.jumpScheme_);
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
                                    this.jumpScheme_ = eVar.L();
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
                        synchronized (H5PopUp.class) {
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

        @Override // com.p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage.H5PopUpOrBuilder
        public String getJumpScheme() {
            return this.jumpScheme_;
        }

        @Override // com.p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage.H5PopUpOrBuilder
        public ByteString getJumpSchemeBytes() {
            return ByteString.copyFromUtf8(this.jumpScheme_);
        }

        public int getSerializedSize() {
            int i = ((GeneratedMessageLite) this).memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int iK = !this.jumpScheme_.isEmpty() ? CodedOutputStream.K(1, getJumpScheme()) : 0;
            ((GeneratedMessageLite) this).memoizedSerializedSize = iK;
            return iK;
        }

        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (this.jumpScheme_.isEmpty()) {
                return;
            }
            codedOutputStream.D0(1, getJumpScheme());
        }

        public static H5PopUp parseDelimitedFrom(InputStream inputStream, h hVar) throws IOException {
            return (H5PopUp) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, hVar);
        }

        public static H5PopUp parseFrom(ByteString byteString, h hVar) throws InvalidProtocolBufferException {
            return (H5PopUp) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, hVar);
        }

        public static H5PopUp parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (H5PopUp) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static H5PopUp parseFrom(byte[] bArr, h hVar) throws InvalidProtocolBufferException {
            return (H5PopUp) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, hVar);
        }

        public static H5PopUp parseFrom(InputStream inputStream) throws IOException {
            return (H5PopUp) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static H5PopUp parseFrom(InputStream inputStream, h hVar) throws IOException {
            return (H5PopUp) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, hVar);
        }

        public static H5PopUp parseFrom(e eVar) throws IOException {
            return (H5PopUp) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, eVar);
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.toBuilder();
        }

        public static H5PopUp parseFrom(e eVar, h hVar) throws IOException {
            return (H5PopUp) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, eVar, hVar);
        }
    }

    public static final class LiveAnimationPlayMsg extends GeneratedMessageLite<LiveAnimationPlayMsg, Builder> implements LiveAnimationPlayMsgOrBuilder {
        public static final int ANIMATIONTYPE_FIELD_NUMBER = 13;
        private static final LiveAnimationPlayMsg DEFAULT_INSTANCE;
        public static final int DURATION_FIELD_NUMBER = 3;
        public static final int LIVERESOURCEID_FIELD_NUMBER = 2;
        private static volatile i860<LiveAnimationPlayMsg> PARSER = null;
        public static final int PRIORITY_FIELD_NUMBER = 4;
        public static final int ROOMID_FIELD_NUMBER = 1;
        public static final int SVGAEFFECTEXTRAS_FIELD_NUMBER = 14;
        public static final int TOMYQUEUE_FIELD_NUMBER = 7;
        public static final int VIDEOEFFECTEXTRAS_FIELD_NUMBER = 6;
        private int bitField0_;
        private long duration_;
        private long priority_;
        private boolean toMyQueue_;
        private String roomId_ = "";
        private String liveResourceId_ = "";
        private l.h<VideoEffectExtra> videoEffectExtras_ = GeneratedMessageLite.emptyProtobufList();
        private String animationType_ = "";
        private l.h<SvgaEffectExtra> svgaEffectExtras_ = GeneratedMessageLite.emptyProtobufList();

        static {
            LiveAnimationPlayMsg liveAnimationPlayMsg = new LiveAnimationPlayMsg();
            DEFAULT_INSTANCE = liveAnimationPlayMsg;
            liveAnimationPlayMsg.makeImmutable();
        }

        private LiveAnimationPlayMsg() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllSvgaEffectExtras(Iterable<? extends SvgaEffectExtra> iterable) {
            ensureSvgaEffectExtrasIsMutable();
            a.addAll(iterable, this.svgaEffectExtras_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllVideoEffectExtras(Iterable<? extends VideoEffectExtra> iterable) {
            ensureVideoEffectExtrasIsMutable();
            a.addAll(iterable, this.videoEffectExtras_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addSvgaEffectExtras(SvgaEffectExtra.Builder builder) {
            ensureSvgaEffectExtrasIsMutable();
            this.svgaEffectExtras_.add((SvgaEffectExtra) builder.build());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addVideoEffectExtras(VideoEffectExtra.Builder builder) {
            ensureVideoEffectExtrasIsMutable();
            this.videoEffectExtras_.add((VideoEffectExtra) builder.build());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAnimationType() {
            this.animationType_ = getDefaultInstance().getAnimationType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearDuration() {
            this.duration_ = 0L;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearLiveResourceId() {
            this.liveResourceId_ = getDefaultInstance().getLiveResourceId();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearPriority() {
            this.priority_ = 0L;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearRoomId() {
            this.roomId_ = getDefaultInstance().getRoomId();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearSvgaEffectExtras() {
            this.svgaEffectExtras_ = GeneratedMessageLite.emptyProtobufList();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearToMyQueue() {
            this.toMyQueue_ = false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearVideoEffectExtras() {
            this.videoEffectExtras_ = GeneratedMessageLite.emptyProtobufList();
        }

        private void ensureSvgaEffectExtrasIsMutable() {
            if (this.svgaEffectExtras_.q()) {
                return;
            }
            this.svgaEffectExtras_ = GeneratedMessageLite.mutableCopy(this.svgaEffectExtras_);
        }

        private void ensureVideoEffectExtrasIsMutable() {
            if (this.videoEffectExtras_.q()) {
                return;
            }
            this.videoEffectExtras_ = GeneratedMessageLite.mutableCopy(this.videoEffectExtras_);
        }

        public static LiveAnimationPlayMsg getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder(LiveAnimationPlayMsg liveAnimationPlayMsg) {
            return (Builder) ((Builder) DEFAULT_INSTANCE.toBuilder()).mergeFrom(liveAnimationPlayMsg);
        }

        public static LiveAnimationPlayMsg parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (LiveAnimationPlayMsg) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static LiveAnimationPlayMsg parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (LiveAnimationPlayMsg) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static i860<LiveAnimationPlayMsg> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void removeSvgaEffectExtras(int i) {
            ensureSvgaEffectExtrasIsMutable();
            this.svgaEffectExtras_.remove(i);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void removeVideoEffectExtras(int i) {
            ensureVideoEffectExtrasIsMutable();
            this.videoEffectExtras_.remove(i);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAnimationType(String str) {
            str.getClass();
            this.animationType_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAnimationTypeBytes(ByteString byteString) {
            byteString.getClass();
            a.checkByteStringIsUtf8(byteString);
            this.animationType_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setDuration(long j) {
            this.duration_ = j;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setLiveResourceId(String str) {
            str.getClass();
            this.liveResourceId_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setLiveResourceIdBytes(ByteString byteString) {
            byteString.getClass();
            a.checkByteStringIsUtf8(byteString);
            this.liveResourceId_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setPriority(long j) {
            this.priority_ = j;
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
        public void setSvgaEffectExtras(int i, SvgaEffectExtra.Builder builder) {
            ensureSvgaEffectExtrasIsMutable();
            this.svgaEffectExtras_.set(i, (SvgaEffectExtra) builder.build());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setToMyQueue(boolean z) {
            this.toMyQueue_ = z;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setVideoEffectExtras(int i, VideoEffectExtra.Builder builder) {
            ensureVideoEffectExtrasIsMutable();
            this.videoEffectExtras_.set(i, (VideoEffectExtra) builder.build());
        }

        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            boolean z = false;
            switch (C03491.f1653xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new LiveAnimationPlayMsg();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                    this.videoEffectExtras_.n();
                    this.svgaEffectExtras_.n();
                    return null;
                case 4:
                    return new Builder();
                case 5:
                    GeneratedMessageLite.g gVar = (GeneratedMessageLite.h) obj;
                    LiveAnimationPlayMsg liveAnimationPlayMsg = (LiveAnimationPlayMsg) obj2;
                    this.roomId_ = gVar.f(!this.roomId_.isEmpty(), this.roomId_, !liveAnimationPlayMsg.roomId_.isEmpty(), liveAnimationPlayMsg.roomId_);
                    this.liveResourceId_ = gVar.f(!this.liveResourceId_.isEmpty(), this.liveResourceId_, !liveAnimationPlayMsg.liveResourceId_.isEmpty(), liveAnimationPlayMsg.liveResourceId_);
                    long j = this.duration_;
                    boolean z2 = j != 0;
                    long j2 = liveAnimationPlayMsg.duration_;
                    this.duration_ = gVar.i(z2, j, j2 != 0, j2);
                    long j3 = this.priority_;
                    boolean z3 = j3 != 0;
                    long j4 = liveAnimationPlayMsg.priority_;
                    this.priority_ = gVar.i(z3, j3, j4 != 0, j4);
                    this.videoEffectExtras_ = gVar.g(this.videoEffectExtras_, liveAnimationPlayMsg.videoEffectExtras_);
                    boolean z4 = this.toMyQueue_;
                    boolean z5 = liveAnimationPlayMsg.toMyQueue_;
                    this.toMyQueue_ = gVar.d(z4, z4, z5, z5);
                    this.animationType_ = gVar.f(!this.animationType_.isEmpty(), this.animationType_, !liveAnimationPlayMsg.animationType_.isEmpty(), liveAnimationPlayMsg.animationType_);
                    this.svgaEffectExtras_ = gVar.g(this.svgaEffectExtras_, liveAnimationPlayMsg.svgaEffectExtras_);
                    if (gVar == GeneratedMessageLite.g.INSTANCE) {
                        this.bitField0_ |= liveAnimationPlayMsg.bitField0_;
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
                                    this.roomId_ = eVar.L();
                                } else if (iM == 18) {
                                    this.liveResourceId_ = eVar.L();
                                } else if (iM == 24) {
                                    this.duration_ = eVar.v();
                                } else if (iM == 32) {
                                    this.priority_ = eVar.v();
                                } else if (iM == 50) {
                                    if (!this.videoEffectExtras_.q()) {
                                        this.videoEffectExtras_ = GeneratedMessageLite.mutableCopy(this.videoEffectExtras_);
                                    }
                                    this.videoEffectExtras_.add(eVar.w(VideoEffectExtra.parser(), hVar));
                                } else if (iM == 56) {
                                    this.toMyQueue_ = eVar.m();
                                } else if (iM == 106) {
                                    this.animationType_ = eVar.L();
                                } else if (iM == 114) {
                                    if (!this.svgaEffectExtras_.q()) {
                                        this.svgaEffectExtras_ = GeneratedMessageLite.mutableCopy(this.svgaEffectExtras_);
                                    }
                                    this.svgaEffectExtras_.add(eVar.w(SvgaEffectExtra.parser(), hVar));
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
                        synchronized (LiveAnimationPlayMsg.class) {
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

        @Override // com.p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage.LiveAnimationPlayMsgOrBuilder
        public String getAnimationType() {
            return this.animationType_;
        }

        @Override // com.p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage.LiveAnimationPlayMsgOrBuilder
        public ByteString getAnimationTypeBytes() {
            return ByteString.copyFromUtf8(this.animationType_);
        }

        @Override // com.p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage.LiveAnimationPlayMsgOrBuilder
        public long getDuration() {
            return this.duration_;
        }

        @Override // com.p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage.LiveAnimationPlayMsgOrBuilder
        public String getLiveResourceId() {
            return this.liveResourceId_;
        }

        @Override // com.p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage.LiveAnimationPlayMsgOrBuilder
        public ByteString getLiveResourceIdBytes() {
            return ByteString.copyFromUtf8(this.liveResourceId_);
        }

        @Override // com.p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage.LiveAnimationPlayMsgOrBuilder
        public long getPriority() {
            return this.priority_;
        }

        @Override // com.p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage.LiveAnimationPlayMsgOrBuilder
        public String getRoomId() {
            return this.roomId_;
        }

        @Override // com.p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage.LiveAnimationPlayMsgOrBuilder
        public ByteString getRoomIdBytes() {
            return ByteString.copyFromUtf8(this.roomId_);
        }

        public int getSerializedSize() {
            int i = ((GeneratedMessageLite) this).memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int iK = !this.roomId_.isEmpty() ? CodedOutputStream.K(1, getRoomId()) : 0;
            if (!this.liveResourceId_.isEmpty()) {
                iK += CodedOutputStream.K(2, getLiveResourceId());
            }
            long j = this.duration_;
            if (j != 0) {
                iK += CodedOutputStream.v(3, j);
            }
            long j2 = this.priority_;
            if (j2 != 0) {
                iK += CodedOutputStream.v(4, j2);
            }
            for (int i2 = 0; i2 < this.videoEffectExtras_.size(); i2++) {
                iK += CodedOutputStream.C(6, (q) this.videoEffectExtras_.get(i2));
            }
            boolean z = this.toMyQueue_;
            if (z) {
                iK += CodedOutputStream.f(7, z);
            }
            if (!this.animationType_.isEmpty()) {
                iK += CodedOutputStream.K(13, getAnimationType());
            }
            for (int i3 = 0; i3 < this.svgaEffectExtras_.size(); i3++) {
                iK += CodedOutputStream.C(14, (q) this.svgaEffectExtras_.get(i3));
            }
            ((GeneratedMessageLite) this).memoizedSerializedSize = iK;
            return iK;
        }

        @Override // com.p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage.LiveAnimationPlayMsgOrBuilder
        public SvgaEffectExtra getSvgaEffectExtras(int i) {
            return (SvgaEffectExtra) this.svgaEffectExtras_.get(i);
        }

        @Override // com.p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage.LiveAnimationPlayMsgOrBuilder
        public int getSvgaEffectExtrasCount() {
            return this.svgaEffectExtras_.size();
        }

        @Override // com.p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage.LiveAnimationPlayMsgOrBuilder
        public List<SvgaEffectExtra> getSvgaEffectExtrasList() {
            return this.svgaEffectExtras_;
        }

        public SvgaEffectExtraOrBuilder getSvgaEffectExtrasOrBuilder(int i) {
            return (SvgaEffectExtraOrBuilder) this.svgaEffectExtras_.get(i);
        }

        public List<? extends SvgaEffectExtraOrBuilder> getSvgaEffectExtrasOrBuilderList() {
            return this.svgaEffectExtras_;
        }

        @Override // com.p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage.LiveAnimationPlayMsgOrBuilder
        public boolean getToMyQueue() {
            return this.toMyQueue_;
        }

        @Override // com.p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage.LiveAnimationPlayMsgOrBuilder
        public VideoEffectExtra getVideoEffectExtras(int i) {
            return (VideoEffectExtra) this.videoEffectExtras_.get(i);
        }

        @Override // com.p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage.LiveAnimationPlayMsgOrBuilder
        public int getVideoEffectExtrasCount() {
            return this.videoEffectExtras_.size();
        }

        @Override // com.p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage.LiveAnimationPlayMsgOrBuilder
        public List<VideoEffectExtra> getVideoEffectExtrasList() {
            return this.videoEffectExtras_;
        }

        public VideoEffectExtraOrBuilder getVideoEffectExtrasOrBuilder(int i) {
            return (VideoEffectExtraOrBuilder) this.videoEffectExtras_.get(i);
        }

        public List<? extends VideoEffectExtraOrBuilder> getVideoEffectExtrasOrBuilderList() {
            return this.videoEffectExtras_;
        }

        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (!this.roomId_.isEmpty()) {
                codedOutputStream.D0(1, getRoomId());
            }
            if (!this.liveResourceId_.isEmpty()) {
                codedOutputStream.D0(2, getLiveResourceId());
            }
            long j = this.duration_;
            if (j != 0) {
                codedOutputStream.u0(3, j);
            }
            long j2 = this.priority_;
            if (j2 != 0) {
                codedOutputStream.u0(4, j2);
            }
            for (int i = 0; i < this.videoEffectExtras_.size(); i++) {
                codedOutputStream.w0(6, (q) this.videoEffectExtras_.get(i));
            }
            boolean z = this.toMyQueue_;
            if (z) {
                codedOutputStream.a0(7, z);
            }
            if (!this.animationType_.isEmpty()) {
                codedOutputStream.D0(13, getAnimationType());
            }
            for (int i2 = 0; i2 < this.svgaEffectExtras_.size(); i2++) {
                codedOutputStream.w0(14, (q) this.svgaEffectExtras_.get(i2));
            }
        }

        public static LiveAnimationPlayMsg parseDelimitedFrom(InputStream inputStream, h hVar) throws IOException {
            return (LiveAnimationPlayMsg) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, hVar);
        }

        public static LiveAnimationPlayMsg parseFrom(ByteString byteString, h hVar) throws InvalidProtocolBufferException {
            return (LiveAnimationPlayMsg) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, hVar);
        }

        public static final class Builder extends GeneratedMessageLite.b<LiveAnimationPlayMsg, Builder> implements LiveAnimationPlayMsgOrBuilder {
            private Builder() {
                super(LiveAnimationPlayMsg.DEFAULT_INSTANCE);
            }

            public Builder addAllSvgaEffectExtras(Iterable<? extends SvgaEffectExtra> iterable) {
                copyOnWrite();
                ((LiveAnimationPlayMsg) ((GeneratedMessageLite.b) this).instance).addAllSvgaEffectExtras(iterable);
                return this;
            }

            public Builder addAllVideoEffectExtras(Iterable<? extends VideoEffectExtra> iterable) {
                copyOnWrite();
                ((LiveAnimationPlayMsg) ((GeneratedMessageLite.b) this).instance).addAllVideoEffectExtras(iterable);
                return this;
            }

            public Builder addSvgaEffectExtras(SvgaEffectExtra svgaEffectExtra) {
                copyOnWrite();
                ((LiveAnimationPlayMsg) ((GeneratedMessageLite.b) this).instance).addSvgaEffectExtras(svgaEffectExtra);
                return this;
            }

            public Builder addVideoEffectExtras(VideoEffectExtra videoEffectExtra) {
                copyOnWrite();
                ((LiveAnimationPlayMsg) ((GeneratedMessageLite.b) this).instance).addVideoEffectExtras(videoEffectExtra);
                return this;
            }

            public Builder clearAnimationType() {
                copyOnWrite();
                ((LiveAnimationPlayMsg) ((GeneratedMessageLite.b) this).instance).clearAnimationType();
                return this;
            }

            public Builder clearDuration() {
                copyOnWrite();
                ((LiveAnimationPlayMsg) ((GeneratedMessageLite.b) this).instance).clearDuration();
                return this;
            }

            public Builder clearLiveResourceId() {
                copyOnWrite();
                ((LiveAnimationPlayMsg) ((GeneratedMessageLite.b) this).instance).clearLiveResourceId();
                return this;
            }

            public Builder clearPriority() {
                copyOnWrite();
                ((LiveAnimationPlayMsg) ((GeneratedMessageLite.b) this).instance).clearPriority();
                return this;
            }

            public Builder clearRoomId() {
                copyOnWrite();
                ((LiveAnimationPlayMsg) ((GeneratedMessageLite.b) this).instance).clearRoomId();
                return this;
            }

            public Builder clearSvgaEffectExtras() {
                copyOnWrite();
                ((LiveAnimationPlayMsg) ((GeneratedMessageLite.b) this).instance).clearSvgaEffectExtras();
                return this;
            }

            public Builder clearToMyQueue() {
                copyOnWrite();
                ((LiveAnimationPlayMsg) ((GeneratedMessageLite.b) this).instance).clearToMyQueue();
                return this;
            }

            public Builder clearVideoEffectExtras() {
                copyOnWrite();
                ((LiveAnimationPlayMsg) ((GeneratedMessageLite.b) this).instance).clearVideoEffectExtras();
                return this;
            }

            @Override // com.p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage.LiveAnimationPlayMsgOrBuilder
            public String getAnimationType() {
                return ((LiveAnimationPlayMsg) ((GeneratedMessageLite.b) this).instance).getAnimationType();
            }

            @Override // com.p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage.LiveAnimationPlayMsgOrBuilder
            public ByteString getAnimationTypeBytes() {
                return ((LiveAnimationPlayMsg) ((GeneratedMessageLite.b) this).instance).getAnimationTypeBytes();
            }

            @Override // com.p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage.LiveAnimationPlayMsgOrBuilder
            public long getDuration() {
                return ((LiveAnimationPlayMsg) ((GeneratedMessageLite.b) this).instance).getDuration();
            }

            @Override // com.p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage.LiveAnimationPlayMsgOrBuilder
            public String getLiveResourceId() {
                return ((LiveAnimationPlayMsg) ((GeneratedMessageLite.b) this).instance).getLiveResourceId();
            }

            @Override // com.p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage.LiveAnimationPlayMsgOrBuilder
            public ByteString getLiveResourceIdBytes() {
                return ((LiveAnimationPlayMsg) ((GeneratedMessageLite.b) this).instance).getLiveResourceIdBytes();
            }

            @Override // com.p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage.LiveAnimationPlayMsgOrBuilder
            public long getPriority() {
                return ((LiveAnimationPlayMsg) ((GeneratedMessageLite.b) this).instance).getPriority();
            }

            @Override // com.p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage.LiveAnimationPlayMsgOrBuilder
            public String getRoomId() {
                return ((LiveAnimationPlayMsg) ((GeneratedMessageLite.b) this).instance).getRoomId();
            }

            @Override // com.p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage.LiveAnimationPlayMsgOrBuilder
            public ByteString getRoomIdBytes() {
                return ((LiveAnimationPlayMsg) ((GeneratedMessageLite.b) this).instance).getRoomIdBytes();
            }

            @Override // com.p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage.LiveAnimationPlayMsgOrBuilder
            public SvgaEffectExtra getSvgaEffectExtras(int i) {
                return ((LiveAnimationPlayMsg) ((GeneratedMessageLite.b) this).instance).getSvgaEffectExtras(i);
            }

            @Override // com.p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage.LiveAnimationPlayMsgOrBuilder
            public int getSvgaEffectExtrasCount() {
                return ((LiveAnimationPlayMsg) ((GeneratedMessageLite.b) this).instance).getSvgaEffectExtrasCount();
            }

            @Override // com.p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage.LiveAnimationPlayMsgOrBuilder
            public List<SvgaEffectExtra> getSvgaEffectExtrasList() {
                return Collections.unmodifiableList(((LiveAnimationPlayMsg) ((GeneratedMessageLite.b) this).instance).getSvgaEffectExtrasList());
            }

            @Override // com.p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage.LiveAnimationPlayMsgOrBuilder
            public boolean getToMyQueue() {
                return ((LiveAnimationPlayMsg) ((GeneratedMessageLite.b) this).instance).getToMyQueue();
            }

            @Override // com.p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage.LiveAnimationPlayMsgOrBuilder
            public VideoEffectExtra getVideoEffectExtras(int i) {
                return ((LiveAnimationPlayMsg) ((GeneratedMessageLite.b) this).instance).getVideoEffectExtras(i);
            }

            @Override // com.p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage.LiveAnimationPlayMsgOrBuilder
            public int getVideoEffectExtrasCount() {
                return ((LiveAnimationPlayMsg) ((GeneratedMessageLite.b) this).instance).getVideoEffectExtrasCount();
            }

            @Override // com.p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage.LiveAnimationPlayMsgOrBuilder
            public List<VideoEffectExtra> getVideoEffectExtrasList() {
                return Collections.unmodifiableList(((LiveAnimationPlayMsg) ((GeneratedMessageLite.b) this).instance).getVideoEffectExtrasList());
            }

            public Builder removeSvgaEffectExtras(int i) {
                copyOnWrite();
                ((LiveAnimationPlayMsg) ((GeneratedMessageLite.b) this).instance).removeSvgaEffectExtras(i);
                return this;
            }

            public Builder removeVideoEffectExtras(int i) {
                copyOnWrite();
                ((LiveAnimationPlayMsg) ((GeneratedMessageLite.b) this).instance).removeVideoEffectExtras(i);
                return this;
            }

            public Builder setAnimationType(String str) {
                copyOnWrite();
                ((LiveAnimationPlayMsg) ((GeneratedMessageLite.b) this).instance).setAnimationType(str);
                return this;
            }

            public Builder setAnimationTypeBytes(ByteString byteString) {
                copyOnWrite();
                ((LiveAnimationPlayMsg) ((GeneratedMessageLite.b) this).instance).setAnimationTypeBytes(byteString);
                return this;
            }

            public Builder setDuration(long j) {
                copyOnWrite();
                ((LiveAnimationPlayMsg) ((GeneratedMessageLite.b) this).instance).setDuration(j);
                return this;
            }

            public Builder setLiveResourceId(String str) {
                copyOnWrite();
                ((LiveAnimationPlayMsg) ((GeneratedMessageLite.b) this).instance).setLiveResourceId(str);
                return this;
            }

            public Builder setLiveResourceIdBytes(ByteString byteString) {
                copyOnWrite();
                ((LiveAnimationPlayMsg) ((GeneratedMessageLite.b) this).instance).setLiveResourceIdBytes(byteString);
                return this;
            }

            public Builder setPriority(long j) {
                copyOnWrite();
                ((LiveAnimationPlayMsg) ((GeneratedMessageLite.b) this).instance).setPriority(j);
                return this;
            }

            public Builder setRoomId(String str) {
                copyOnWrite();
                ((LiveAnimationPlayMsg) ((GeneratedMessageLite.b) this).instance).setRoomId(str);
                return this;
            }

            public Builder setRoomIdBytes(ByteString byteString) {
                copyOnWrite();
                ((LiveAnimationPlayMsg) ((GeneratedMessageLite.b) this).instance).setRoomIdBytes(byteString);
                return this;
            }

            public Builder setSvgaEffectExtras(int i, SvgaEffectExtra svgaEffectExtra) {
                copyOnWrite();
                ((LiveAnimationPlayMsg) ((GeneratedMessageLite.b) this).instance).setSvgaEffectExtras(i, svgaEffectExtra);
                return this;
            }

            public Builder setToMyQueue(boolean z) {
                copyOnWrite();
                ((LiveAnimationPlayMsg) ((GeneratedMessageLite.b) this).instance).setToMyQueue(z);
                return this;
            }

            public Builder setVideoEffectExtras(int i, VideoEffectExtra videoEffectExtra) {
                copyOnWrite();
                ((LiveAnimationPlayMsg) ((GeneratedMessageLite.b) this).instance).setVideoEffectExtras(i, videoEffectExtra);
                return this;
            }

            public Builder addSvgaEffectExtras(int i, SvgaEffectExtra svgaEffectExtra) {
                copyOnWrite();
                ((LiveAnimationPlayMsg) ((GeneratedMessageLite.b) this).instance).addSvgaEffectExtras(i, svgaEffectExtra);
                return this;
            }

            public Builder addVideoEffectExtras(int i, VideoEffectExtra videoEffectExtra) {
                copyOnWrite();
                ((LiveAnimationPlayMsg) ((GeneratedMessageLite.b) this).instance).addVideoEffectExtras(i, videoEffectExtra);
                return this;
            }

            public Builder setSvgaEffectExtras(int i, SvgaEffectExtra.Builder builder) {
                copyOnWrite();
                ((LiveAnimationPlayMsg) ((GeneratedMessageLite.b) this).instance).setSvgaEffectExtras(i, builder);
                return this;
            }

            public Builder setVideoEffectExtras(int i, VideoEffectExtra.Builder builder) {
                copyOnWrite();
                ((LiveAnimationPlayMsg) ((GeneratedMessageLite.b) this).instance).setVideoEffectExtras(i, builder);
                return this;
            }

            public Builder addSvgaEffectExtras(SvgaEffectExtra.Builder builder) {
                copyOnWrite();
                ((LiveAnimationPlayMsg) ((GeneratedMessageLite.b) this).instance).addSvgaEffectExtras(builder);
                return this;
            }

            public Builder addVideoEffectExtras(VideoEffectExtra.Builder builder) {
                copyOnWrite();
                ((LiveAnimationPlayMsg) ((GeneratedMessageLite.b) this).instance).addVideoEffectExtras(builder);
                return this;
            }

            public Builder addSvgaEffectExtras(int i, SvgaEffectExtra.Builder builder) {
                copyOnWrite();
                ((LiveAnimationPlayMsg) ((GeneratedMessageLite.b) this).instance).addSvgaEffectExtras(i, builder);
                return this;
            }

            public Builder addVideoEffectExtras(int i, VideoEffectExtra.Builder builder) {
                copyOnWrite();
                ((LiveAnimationPlayMsg) ((GeneratedMessageLite.b) this).instance).addVideoEffectExtras(i, builder);
                return this;
            }
        }

        public static LiveAnimationPlayMsg parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (LiveAnimationPlayMsg) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static LiveAnimationPlayMsg parseFrom(byte[] bArr, h hVar) throws InvalidProtocolBufferException {
            return (LiveAnimationPlayMsg) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, hVar);
        }

        public static LiveAnimationPlayMsg parseFrom(InputStream inputStream) throws IOException {
            return (LiveAnimationPlayMsg) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static LiveAnimationPlayMsg parseFrom(InputStream inputStream, h hVar) throws IOException {
            return (LiveAnimationPlayMsg) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, hVar);
        }

        public static LiveAnimationPlayMsg parseFrom(e eVar) throws IOException {
            return (LiveAnimationPlayMsg) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addSvgaEffectExtras(int i, SvgaEffectExtra svgaEffectExtra) {
            svgaEffectExtra.getClass();
            ensureSvgaEffectExtrasIsMutable();
            this.svgaEffectExtras_.add(i, svgaEffectExtra);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addVideoEffectExtras(int i, VideoEffectExtra videoEffectExtra) {
            videoEffectExtra.getClass();
            ensureVideoEffectExtrasIsMutable();
            this.videoEffectExtras_.add(i, videoEffectExtra);
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.toBuilder();
        }

        public static LiveAnimationPlayMsg parseFrom(e eVar, h hVar) throws IOException {
            return (LiveAnimationPlayMsg) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, eVar, hVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSvgaEffectExtras(int i, SvgaEffectExtra svgaEffectExtra) {
            svgaEffectExtra.getClass();
            ensureSvgaEffectExtrasIsMutable();
            this.svgaEffectExtras_.set(i, svgaEffectExtra);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setVideoEffectExtras(int i, VideoEffectExtra videoEffectExtra) {
            videoEffectExtra.getClass();
            ensureVideoEffectExtrasIsMutable();
            this.videoEffectExtras_.set(i, videoEffectExtra);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addSvgaEffectExtras(SvgaEffectExtra svgaEffectExtra) {
            svgaEffectExtra.getClass();
            ensureSvgaEffectExtrasIsMutable();
            this.svgaEffectExtras_.add(svgaEffectExtra);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addVideoEffectExtras(VideoEffectExtra videoEffectExtra) {
            videoEffectExtra.getClass();
            ensureVideoEffectExtrasIsMutable();
            this.videoEffectExtras_.add(videoEffectExtra);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addSvgaEffectExtras(int i, SvgaEffectExtra.Builder builder) {
            ensureSvgaEffectExtrasIsMutable();
            this.svgaEffectExtras_.add(i, (SvgaEffectExtra) builder.build());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addVideoEffectExtras(int i, VideoEffectExtra.Builder builder) {
            ensureVideoEffectExtrasIsMutable();
            this.videoEffectExtras_.add(i, (VideoEffectExtra) builder.build());
        }
    }

    public static final class LotteryGiftRedPacketAnimationMsg extends GeneratedMessageLite<LotteryGiftRedPacketAnimationMsg, Builder> implements LotteryGiftRedPacketAnimationMsgOrBuilder {
        private static final LotteryGiftRedPacketAnimationMsg DEFAULT_INSTANCE;
        public static final int GIFT_FIELD_NUMBER = 2;
        private static volatile i860<LotteryGiftRedPacketAnimationMsg> PARSER = null;
        public static final int SENDER_FIELD_NUMBER = 1;
        public static final int SHOWSECONDS_FIELD_NUMBER = 3;
        private LotteryGiftRedPacketGift gift_;
        private LotteryGiftRedPacketSender sender_;
        private long showSeconds_;

        static {
            LotteryGiftRedPacketAnimationMsg lotteryGiftRedPacketAnimationMsg = new LotteryGiftRedPacketAnimationMsg();
            DEFAULT_INSTANCE = lotteryGiftRedPacketAnimationMsg;
            lotteryGiftRedPacketAnimationMsg.makeImmutable();
        }

        private LotteryGiftRedPacketAnimationMsg() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearGift() {
            this.gift_ = null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearSender() {
            this.sender_ = null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearShowSeconds() {
            this.showSeconds_ = 0L;
        }

        public static LotteryGiftRedPacketAnimationMsg getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeGift(LotteryGiftRedPacketGift lotteryGiftRedPacketGift) {
            LotteryGiftRedPacketGift lotteryGiftRedPacketGift2 = this.gift_;
            if (lotteryGiftRedPacketGift2 == null || lotteryGiftRedPacketGift2 == LotteryGiftRedPacketGift.getDefaultInstance()) {
                this.gift_ = lotteryGiftRedPacketGift;
            } else {
                this.gift_ = (LotteryGiftRedPacketGift) ((LotteryGiftRedPacketGift.Builder) LotteryGiftRedPacketGift.newBuilder(this.gift_).mergeFrom(lotteryGiftRedPacketGift)).buildPartial();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeSender(LotteryGiftRedPacketSender lotteryGiftRedPacketSender) {
            LotteryGiftRedPacketSender lotteryGiftRedPacketSender2 = this.sender_;
            if (lotteryGiftRedPacketSender2 == null || lotteryGiftRedPacketSender2 == LotteryGiftRedPacketSender.getDefaultInstance()) {
                this.sender_ = lotteryGiftRedPacketSender;
            } else {
                this.sender_ = (LotteryGiftRedPacketSender) ((LotteryGiftRedPacketSender.Builder) LotteryGiftRedPacketSender.newBuilder(this.sender_).mergeFrom(lotteryGiftRedPacketSender)).buildPartial();
            }
        }

        public static Builder newBuilder(LotteryGiftRedPacketAnimationMsg lotteryGiftRedPacketAnimationMsg) {
            return (Builder) ((Builder) DEFAULT_INSTANCE.toBuilder()).mergeFrom(lotteryGiftRedPacketAnimationMsg);
        }

        public static LotteryGiftRedPacketAnimationMsg parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (LotteryGiftRedPacketAnimationMsg) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static LotteryGiftRedPacketAnimationMsg parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (LotteryGiftRedPacketAnimationMsg) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static i860<LotteryGiftRedPacketAnimationMsg> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setGift(LotteryGiftRedPacketGift.Builder builder) {
            this.gift_ = (LotteryGiftRedPacketGift) builder.build();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSender(LotteryGiftRedPacketSender.Builder builder) {
            this.sender_ = (LotteryGiftRedPacketSender) builder.build();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setShowSeconds(long j) {
            this.showSeconds_ = j;
        }

        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            boolean z = false;
            switch (C03491.f1653xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new LotteryGiftRedPacketAnimationMsg();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                    return null;
                case 4:
                    return new Builder();
                case 5:
                    GeneratedMessageLite.h hVar = (GeneratedMessageLite.h) obj;
                    LotteryGiftRedPacketAnimationMsg lotteryGiftRedPacketAnimationMsg = (LotteryGiftRedPacketAnimationMsg) obj2;
                    this.sender_ = hVar.o(this.sender_, lotteryGiftRedPacketAnimationMsg.sender_);
                    this.gift_ = hVar.o(this.gift_, lotteryGiftRedPacketAnimationMsg.gift_);
                    long j = this.showSeconds_;
                    boolean z2 = j != 0;
                    long j2 = lotteryGiftRedPacketAnimationMsg.showSeconds_;
                    this.showSeconds_ = hVar.i(z2, j, j2 != 0, j2);
                    GeneratedMessageLite.g gVar = GeneratedMessageLite.g.INSTANCE;
                    return this;
                case 6:
                    e eVar = (e) obj;
                    h hVar2 = (h) obj2;
                    while (!z) {
                        try {
                            int iM = eVar.M();
                            if (iM != 0) {
                                if (iM == 10) {
                                    LotteryGiftRedPacketSender lotteryGiftRedPacketSender = this.sender_;
                                    LotteryGiftRedPacketSender.Builder builder = lotteryGiftRedPacketSender != null ? (LotteryGiftRedPacketSender.Builder) lotteryGiftRedPacketSender.toBuilder() : null;
                                    LotteryGiftRedPacketSender lotteryGiftRedPacketSenderW = eVar.w(LotteryGiftRedPacketSender.parser(), hVar2);
                                    this.sender_ = lotteryGiftRedPacketSenderW;
                                    if (builder != null) {
                                        builder.mergeFrom(lotteryGiftRedPacketSenderW);
                                        this.sender_ = (LotteryGiftRedPacketSender) builder.buildPartial();
                                    }
                                } else if (iM == 18) {
                                    LotteryGiftRedPacketGift lotteryGiftRedPacketGift = this.gift_;
                                    LotteryGiftRedPacketGift.Builder builder2 = lotteryGiftRedPacketGift != null ? (LotteryGiftRedPacketGift.Builder) lotteryGiftRedPacketGift.toBuilder() : null;
                                    LotteryGiftRedPacketGift lotteryGiftRedPacketGiftW = eVar.w(LotteryGiftRedPacketGift.parser(), hVar2);
                                    this.gift_ = lotteryGiftRedPacketGiftW;
                                    if (builder2 != null) {
                                        builder2.mergeFrom(lotteryGiftRedPacketGiftW);
                                        this.gift_ = (LotteryGiftRedPacketGift) builder2.buildPartial();
                                    }
                                } else if (iM == 24) {
                                    this.showSeconds_ = eVar.v();
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
                        synchronized (LotteryGiftRedPacketAnimationMsg.class) {
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

        @Override // com.p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage.LotteryGiftRedPacketAnimationMsgOrBuilder
        public LotteryGiftRedPacketGift getGift() {
            LotteryGiftRedPacketGift lotteryGiftRedPacketGift = this.gift_;
            return lotteryGiftRedPacketGift == null ? LotteryGiftRedPacketGift.getDefaultInstance() : lotteryGiftRedPacketGift;
        }

        @Override // com.p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage.LotteryGiftRedPacketAnimationMsgOrBuilder
        public LotteryGiftRedPacketSender getSender() {
            LotteryGiftRedPacketSender lotteryGiftRedPacketSender = this.sender_;
            return lotteryGiftRedPacketSender == null ? LotteryGiftRedPacketSender.getDefaultInstance() : lotteryGiftRedPacketSender;
        }

        public int getSerializedSize() {
            int i = ((GeneratedMessageLite) this).memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int iC = this.sender_ != null ? CodedOutputStream.C(1, getSender()) : 0;
            if (this.gift_ != null) {
                iC += CodedOutputStream.C(2, getGift());
            }
            long j = this.showSeconds_;
            if (j != 0) {
                iC += CodedOutputStream.v(3, j);
            }
            ((GeneratedMessageLite) this).memoizedSerializedSize = iC;
            return iC;
        }

        @Override // com.p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage.LotteryGiftRedPacketAnimationMsgOrBuilder
        public long getShowSeconds() {
            return this.showSeconds_;
        }

        @Override // com.p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage.LotteryGiftRedPacketAnimationMsgOrBuilder
        public boolean hasGift() {
            return this.gift_ != null;
        }

        @Override // com.p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage.LotteryGiftRedPacketAnimationMsgOrBuilder
        public boolean hasSender() {
            return this.sender_ != null;
        }

        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (this.sender_ != null) {
                codedOutputStream.w0(1, getSender());
            }
            if (this.gift_ != null) {
                codedOutputStream.w0(2, getGift());
            }
            long j = this.showSeconds_;
            if (j != 0) {
                codedOutputStream.u0(3, j);
            }
        }

        public static LotteryGiftRedPacketAnimationMsg parseDelimitedFrom(InputStream inputStream, h hVar) throws IOException {
            return (LotteryGiftRedPacketAnimationMsg) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, hVar);
        }

        public static LotteryGiftRedPacketAnimationMsg parseFrom(ByteString byteString, h hVar) throws InvalidProtocolBufferException {
            return (LotteryGiftRedPacketAnimationMsg) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, hVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setGift(LotteryGiftRedPacketGift lotteryGiftRedPacketGift) {
            lotteryGiftRedPacketGift.getClass();
            this.gift_ = lotteryGiftRedPacketGift;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSender(LotteryGiftRedPacketSender lotteryGiftRedPacketSender) {
            lotteryGiftRedPacketSender.getClass();
            this.sender_ = lotteryGiftRedPacketSender;
        }

        public static final class Builder extends GeneratedMessageLite.b<LotteryGiftRedPacketAnimationMsg, Builder> implements LotteryGiftRedPacketAnimationMsgOrBuilder {
            private Builder() {
                super(LotteryGiftRedPacketAnimationMsg.DEFAULT_INSTANCE);
            }

            public Builder clearGift() {
                copyOnWrite();
                ((LotteryGiftRedPacketAnimationMsg) ((GeneratedMessageLite.b) this).instance).clearGift();
                return this;
            }

            public Builder clearSender() {
                copyOnWrite();
                ((LotteryGiftRedPacketAnimationMsg) ((GeneratedMessageLite.b) this).instance).clearSender();
                return this;
            }

            public Builder clearShowSeconds() {
                copyOnWrite();
                ((LotteryGiftRedPacketAnimationMsg) ((GeneratedMessageLite.b) this).instance).clearShowSeconds();
                return this;
            }

            @Override // com.p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage.LotteryGiftRedPacketAnimationMsgOrBuilder
            public LotteryGiftRedPacketGift getGift() {
                return ((LotteryGiftRedPacketAnimationMsg) ((GeneratedMessageLite.b) this).instance).getGift();
            }

            @Override // com.p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage.LotteryGiftRedPacketAnimationMsgOrBuilder
            public LotteryGiftRedPacketSender getSender() {
                return ((LotteryGiftRedPacketAnimationMsg) ((GeneratedMessageLite.b) this).instance).getSender();
            }

            @Override // com.p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage.LotteryGiftRedPacketAnimationMsgOrBuilder
            public long getShowSeconds() {
                return ((LotteryGiftRedPacketAnimationMsg) ((GeneratedMessageLite.b) this).instance).getShowSeconds();
            }

            @Override // com.p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage.LotteryGiftRedPacketAnimationMsgOrBuilder
            public boolean hasGift() {
                return ((LotteryGiftRedPacketAnimationMsg) ((GeneratedMessageLite.b) this).instance).hasGift();
            }

            @Override // com.p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage.LotteryGiftRedPacketAnimationMsgOrBuilder
            public boolean hasSender() {
                return ((LotteryGiftRedPacketAnimationMsg) ((GeneratedMessageLite.b) this).instance).hasSender();
            }

            public Builder mergeGift(LotteryGiftRedPacketGift lotteryGiftRedPacketGift) {
                copyOnWrite();
                ((LotteryGiftRedPacketAnimationMsg) ((GeneratedMessageLite.b) this).instance).mergeGift(lotteryGiftRedPacketGift);
                return this;
            }

            public Builder mergeSender(LotteryGiftRedPacketSender lotteryGiftRedPacketSender) {
                copyOnWrite();
                ((LotteryGiftRedPacketAnimationMsg) ((GeneratedMessageLite.b) this).instance).mergeSender(lotteryGiftRedPacketSender);
                return this;
            }

            public Builder setGift(LotteryGiftRedPacketGift lotteryGiftRedPacketGift) {
                copyOnWrite();
                ((LotteryGiftRedPacketAnimationMsg) ((GeneratedMessageLite.b) this).instance).setGift(lotteryGiftRedPacketGift);
                return this;
            }

            public Builder setSender(LotteryGiftRedPacketSender lotteryGiftRedPacketSender) {
                copyOnWrite();
                ((LotteryGiftRedPacketAnimationMsg) ((GeneratedMessageLite.b) this).instance).setSender(lotteryGiftRedPacketSender);
                return this;
            }

            public Builder setShowSeconds(long j) {
                copyOnWrite();
                ((LotteryGiftRedPacketAnimationMsg) ((GeneratedMessageLite.b) this).instance).setShowSeconds(j);
                return this;
            }

            public Builder setGift(LotteryGiftRedPacketGift.Builder builder) {
                copyOnWrite();
                ((LotteryGiftRedPacketAnimationMsg) ((GeneratedMessageLite.b) this).instance).setGift(builder);
                return this;
            }

            public Builder setSender(LotteryGiftRedPacketSender.Builder builder) {
                copyOnWrite();
                ((LotteryGiftRedPacketAnimationMsg) ((GeneratedMessageLite.b) this).instance).setSender(builder);
                return this;
            }
        }

        public static LotteryGiftRedPacketAnimationMsg parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (LotteryGiftRedPacketAnimationMsg) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static LotteryGiftRedPacketAnimationMsg parseFrom(byte[] bArr, h hVar) throws InvalidProtocolBufferException {
            return (LotteryGiftRedPacketAnimationMsg) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, hVar);
        }

        public static LotteryGiftRedPacketAnimationMsg parseFrom(InputStream inputStream) throws IOException {
            return (LotteryGiftRedPacketAnimationMsg) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static LotteryGiftRedPacketAnimationMsg parseFrom(InputStream inputStream, h hVar) throws IOException {
            return (LotteryGiftRedPacketAnimationMsg) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, hVar);
        }

        public static LotteryGiftRedPacketAnimationMsg parseFrom(e eVar) throws IOException {
            return (LotteryGiftRedPacketAnimationMsg) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, eVar);
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.toBuilder();
        }

        public static LotteryGiftRedPacketAnimationMsg parseFrom(e eVar, h hVar) throws IOException {
            return (LotteryGiftRedPacketAnimationMsg) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, eVar, hVar);
        }
    }

    public static final class LotteryGiftRedPacketGift extends GeneratedMessageLite<LotteryGiftRedPacketGift, Builder> implements LotteryGiftRedPacketGiftOrBuilder {
        public static final int AMOUNT_FIELD_NUMBER = 5;
        private static final LotteryGiftRedPacketGift DEFAULT_INSTANCE;
        public static final int ID_FIELD_NUMBER = 1;
        public static final int NAME_FIELD_NUMBER = 2;
        public static final int NUM_FIELD_NUMBER = 4;
        private static volatile i860<LotteryGiftRedPacketGift> PARSER = null;
        public static final int URL_FIELD_NUMBER = 3;
        private long amount_;
        private long num_;
        private String id_ = "";
        private String name_ = "";
        private String url_ = "";

        public static final class Builder extends GeneratedMessageLite.b<LotteryGiftRedPacketGift, Builder> implements LotteryGiftRedPacketGiftOrBuilder {
            private Builder() {
                super(LotteryGiftRedPacketGift.DEFAULT_INSTANCE);
            }

            public Builder clearAmount() {
                copyOnWrite();
                ((LotteryGiftRedPacketGift) ((GeneratedMessageLite.b) this).instance).clearAmount();
                return this;
            }

            public Builder clearId() {
                copyOnWrite();
                ((LotteryGiftRedPacketGift) ((GeneratedMessageLite.b) this).instance).clearId();
                return this;
            }

            public Builder clearName() {
                copyOnWrite();
                ((LotteryGiftRedPacketGift) ((GeneratedMessageLite.b) this).instance).clearName();
                return this;
            }

            public Builder clearNum() {
                copyOnWrite();
                ((LotteryGiftRedPacketGift) ((GeneratedMessageLite.b) this).instance).clearNum();
                return this;
            }

            public Builder clearUrl() {
                copyOnWrite();
                ((LotteryGiftRedPacketGift) ((GeneratedMessageLite.b) this).instance).clearUrl();
                return this;
            }

            @Override // com.p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage.LotteryGiftRedPacketGiftOrBuilder
            public long getAmount() {
                return ((LotteryGiftRedPacketGift) ((GeneratedMessageLite.b) this).instance).getAmount();
            }

            @Override // com.p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage.LotteryGiftRedPacketGiftOrBuilder
            public String getId() {
                return ((LotteryGiftRedPacketGift) ((GeneratedMessageLite.b) this).instance).getId();
            }

            @Override // com.p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage.LotteryGiftRedPacketGiftOrBuilder
            public ByteString getIdBytes() {
                return ((LotteryGiftRedPacketGift) ((GeneratedMessageLite.b) this).instance).getIdBytes();
            }

            @Override // com.p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage.LotteryGiftRedPacketGiftOrBuilder
            public String getName() {
                return ((LotteryGiftRedPacketGift) ((GeneratedMessageLite.b) this).instance).getName();
            }

            @Override // com.p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage.LotteryGiftRedPacketGiftOrBuilder
            public ByteString getNameBytes() {
                return ((LotteryGiftRedPacketGift) ((GeneratedMessageLite.b) this).instance).getNameBytes();
            }

            @Override // com.p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage.LotteryGiftRedPacketGiftOrBuilder
            public long getNum() {
                return ((LotteryGiftRedPacketGift) ((GeneratedMessageLite.b) this).instance).getNum();
            }

            @Override // com.p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage.LotteryGiftRedPacketGiftOrBuilder
            public String getUrl() {
                return ((LotteryGiftRedPacketGift) ((GeneratedMessageLite.b) this).instance).getUrl();
            }

            @Override // com.p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage.LotteryGiftRedPacketGiftOrBuilder
            public ByteString getUrlBytes() {
                return ((LotteryGiftRedPacketGift) ((GeneratedMessageLite.b) this).instance).getUrlBytes();
            }

            public Builder setAmount(long j) {
                copyOnWrite();
                ((LotteryGiftRedPacketGift) ((GeneratedMessageLite.b) this).instance).setAmount(j);
                return this;
            }

            public Builder setId(String str) {
                copyOnWrite();
                ((LotteryGiftRedPacketGift) ((GeneratedMessageLite.b) this).instance).setId(str);
                return this;
            }

            public Builder setIdBytes(ByteString byteString) {
                copyOnWrite();
                ((LotteryGiftRedPacketGift) ((GeneratedMessageLite.b) this).instance).setIdBytes(byteString);
                return this;
            }

            public Builder setName(String str) {
                copyOnWrite();
                ((LotteryGiftRedPacketGift) ((GeneratedMessageLite.b) this).instance).setName(str);
                return this;
            }

            public Builder setNameBytes(ByteString byteString) {
                copyOnWrite();
                ((LotteryGiftRedPacketGift) ((GeneratedMessageLite.b) this).instance).setNameBytes(byteString);
                return this;
            }

            public Builder setNum(long j) {
                copyOnWrite();
                ((LotteryGiftRedPacketGift) ((GeneratedMessageLite.b) this).instance).setNum(j);
                return this;
            }

            public Builder setUrl(String str) {
                copyOnWrite();
                ((LotteryGiftRedPacketGift) ((GeneratedMessageLite.b) this).instance).setUrl(str);
                return this;
            }

            public Builder setUrlBytes(ByteString byteString) {
                copyOnWrite();
                ((LotteryGiftRedPacketGift) ((GeneratedMessageLite.b) this).instance).setUrlBytes(byteString);
                return this;
            }
        }

        static {
            LotteryGiftRedPacketGift lotteryGiftRedPacketGift = new LotteryGiftRedPacketGift();
            DEFAULT_INSTANCE = lotteryGiftRedPacketGift;
            lotteryGiftRedPacketGift.makeImmutable();
        }

        private LotteryGiftRedPacketGift() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAmount() {
            this.amount_ = 0L;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearId() {
            this.id_ = getDefaultInstance().getId();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearName() {
            this.name_ = getDefaultInstance().getName();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearNum() {
            this.num_ = 0L;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearUrl() {
            this.url_ = getDefaultInstance().getUrl();
        }

        public static LotteryGiftRedPacketGift getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder(LotteryGiftRedPacketGift lotteryGiftRedPacketGift) {
            return (Builder) ((Builder) DEFAULT_INSTANCE.toBuilder()).mergeFrom(lotteryGiftRedPacketGift);
        }

        public static LotteryGiftRedPacketGift parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (LotteryGiftRedPacketGift) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static LotteryGiftRedPacketGift parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (LotteryGiftRedPacketGift) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static i860<LotteryGiftRedPacketGift> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAmount(long j) {
            this.amount_ = j;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setId(String str) {
            str.getClass();
            this.id_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setIdBytes(ByteString byteString) {
            byteString.getClass();
            a.checkByteStringIsUtf8(byteString);
            this.id_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setName(String str) {
            str.getClass();
            this.name_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setNameBytes(ByteString byteString) {
            byteString.getClass();
            a.checkByteStringIsUtf8(byteString);
            this.name_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setNum(long j) {
            this.num_ = j;
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
            switch (C03491.f1653xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new LotteryGiftRedPacketGift();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                    return null;
                case 4:
                    return new Builder();
                case 5:
                    GeneratedMessageLite.h hVar = (GeneratedMessageLite.h) obj;
                    LotteryGiftRedPacketGift lotteryGiftRedPacketGift = (LotteryGiftRedPacketGift) obj2;
                    this.id_ = hVar.f(!this.id_.isEmpty(), this.id_, !lotteryGiftRedPacketGift.id_.isEmpty(), lotteryGiftRedPacketGift.id_);
                    this.name_ = hVar.f(!this.name_.isEmpty(), this.name_, !lotteryGiftRedPacketGift.name_.isEmpty(), lotteryGiftRedPacketGift.name_);
                    this.url_ = hVar.f(!this.url_.isEmpty(), this.url_, !lotteryGiftRedPacketGift.url_.isEmpty(), lotteryGiftRedPacketGift.url_);
                    long j = this.num_;
                    boolean z2 = j != 0;
                    long j2 = lotteryGiftRedPacketGift.num_;
                    this.num_ = hVar.i(z2, j, j2 != 0, j2);
                    boolean z3 = false;
                    long j3 = this.amount_;
                    if (j3 != 0) {
                        z3 = true;
                    }
                    long j4 = lotteryGiftRedPacketGift.amount_;
                    this.amount_ = hVar.i(z3, j3, j4 != 0, j4);
                    GeneratedMessageLite.g gVar = GeneratedMessageLite.g.INSTANCE;
                    return this;
                case 6:
                    e eVar = (e) obj;
                    while (!z) {
                        try {
                            int iM = eVar.M();
                            if (iM != 0) {
                                if (iM == 10) {
                                    this.id_ = eVar.L();
                                } else if (iM == 18) {
                                    this.name_ = eVar.L();
                                } else if (iM == 26) {
                                    this.url_ = eVar.L();
                                } else if (iM == 32) {
                                    this.num_ = eVar.v();
                                } else if (iM == 40) {
                                    this.amount_ = eVar.v();
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
                        synchronized (LotteryGiftRedPacketGift.class) {
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

        @Override // com.p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage.LotteryGiftRedPacketGiftOrBuilder
        public long getAmount() {
            return this.amount_;
        }

        @Override // com.p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage.LotteryGiftRedPacketGiftOrBuilder
        public String getId() {
            return this.id_;
        }

        @Override // com.p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage.LotteryGiftRedPacketGiftOrBuilder
        public ByteString getIdBytes() {
            return ByteString.copyFromUtf8(this.id_);
        }

        @Override // com.p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage.LotteryGiftRedPacketGiftOrBuilder
        public String getName() {
            return this.name_;
        }

        @Override // com.p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage.LotteryGiftRedPacketGiftOrBuilder
        public ByteString getNameBytes() {
            return ByteString.copyFromUtf8(this.name_);
        }

        @Override // com.p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage.LotteryGiftRedPacketGiftOrBuilder
        public long getNum() {
            return this.num_;
        }

        public int getSerializedSize() {
            int i = ((GeneratedMessageLite) this).memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int iK = !this.id_.isEmpty() ? CodedOutputStream.K(1, getId()) : 0;
            if (!this.name_.isEmpty()) {
                iK += CodedOutputStream.K(2, getName());
            }
            if (!this.url_.isEmpty()) {
                iK += CodedOutputStream.K(3, getUrl());
            }
            long j = this.num_;
            if (j != 0) {
                iK += CodedOutputStream.v(4, j);
            }
            long j2 = this.amount_;
            if (j2 != 0) {
                iK += CodedOutputStream.v(5, j2);
            }
            ((GeneratedMessageLite) this).memoizedSerializedSize = iK;
            return iK;
        }

        @Override // com.p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage.LotteryGiftRedPacketGiftOrBuilder
        public String getUrl() {
            return this.url_;
        }

        @Override // com.p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage.LotteryGiftRedPacketGiftOrBuilder
        public ByteString getUrlBytes() {
            return ByteString.copyFromUtf8(this.url_);
        }

        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (!this.id_.isEmpty()) {
                codedOutputStream.D0(1, getId());
            }
            if (!this.name_.isEmpty()) {
                codedOutputStream.D0(2, getName());
            }
            if (!this.url_.isEmpty()) {
                codedOutputStream.D0(3, getUrl());
            }
            long j = this.num_;
            if (j != 0) {
                codedOutputStream.u0(4, j);
            }
            long j2 = this.amount_;
            if (j2 != 0) {
                codedOutputStream.u0(5, j2);
            }
        }

        public static LotteryGiftRedPacketGift parseDelimitedFrom(InputStream inputStream, h hVar) throws IOException {
            return (LotteryGiftRedPacketGift) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, hVar);
        }

        public static LotteryGiftRedPacketGift parseFrom(ByteString byteString, h hVar) throws InvalidProtocolBufferException {
            return (LotteryGiftRedPacketGift) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, hVar);
        }

        public static LotteryGiftRedPacketGift parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (LotteryGiftRedPacketGift) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static LotteryGiftRedPacketGift parseFrom(byte[] bArr, h hVar) throws InvalidProtocolBufferException {
            return (LotteryGiftRedPacketGift) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, hVar);
        }

        public static LotteryGiftRedPacketGift parseFrom(InputStream inputStream) throws IOException {
            return (LotteryGiftRedPacketGift) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static LotteryGiftRedPacketGift parseFrom(InputStream inputStream, h hVar) throws IOException {
            return (LotteryGiftRedPacketGift) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, hVar);
        }

        public static LotteryGiftRedPacketGift parseFrom(e eVar) throws IOException {
            return (LotteryGiftRedPacketGift) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, eVar);
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.toBuilder();
        }

        public static LotteryGiftRedPacketGift parseFrom(e eVar, h hVar) throws IOException {
            return (LotteryGiftRedPacketGift) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, eVar, hVar);
        }
    }

    public static final class LotteryGiftRedPacketSender extends GeneratedMessageLite<LotteryGiftRedPacketSender, Builder> implements LotteryGiftRedPacketSenderOrBuilder {
        public static final int AVATARURL_FIELD_NUMBER = 3;
        private static final LotteryGiftRedPacketSender DEFAULT_INSTANCE;
        public static final int NAME_FIELD_NUMBER = 2;
        private static volatile i860<LotteryGiftRedPacketSender> PARSER = null;
        public static final int USERID_FIELD_NUMBER = 1;
        private String userId_ = "";
        private String name_ = "";
        private String avatarUrl_ = "";

        public static final class Builder extends GeneratedMessageLite.b<LotteryGiftRedPacketSender, Builder> implements LotteryGiftRedPacketSenderOrBuilder {
            private Builder() {
                super(LotteryGiftRedPacketSender.DEFAULT_INSTANCE);
            }

            public Builder clearAvatarUrl() {
                copyOnWrite();
                ((LotteryGiftRedPacketSender) ((GeneratedMessageLite.b) this).instance).clearAvatarUrl();
                return this;
            }

            public Builder clearName() {
                copyOnWrite();
                ((LotteryGiftRedPacketSender) ((GeneratedMessageLite.b) this).instance).clearName();
                return this;
            }

            public Builder clearUserId() {
                copyOnWrite();
                ((LotteryGiftRedPacketSender) ((GeneratedMessageLite.b) this).instance).clearUserId();
                return this;
            }

            @Override // com.p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage.LotteryGiftRedPacketSenderOrBuilder
            public String getAvatarUrl() {
                return ((LotteryGiftRedPacketSender) ((GeneratedMessageLite.b) this).instance).getAvatarUrl();
            }

            @Override // com.p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage.LotteryGiftRedPacketSenderOrBuilder
            public ByteString getAvatarUrlBytes() {
                return ((LotteryGiftRedPacketSender) ((GeneratedMessageLite.b) this).instance).getAvatarUrlBytes();
            }

            @Override // com.p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage.LotteryGiftRedPacketSenderOrBuilder
            public String getName() {
                return ((LotteryGiftRedPacketSender) ((GeneratedMessageLite.b) this).instance).getName();
            }

            @Override // com.p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage.LotteryGiftRedPacketSenderOrBuilder
            public ByteString getNameBytes() {
                return ((LotteryGiftRedPacketSender) ((GeneratedMessageLite.b) this).instance).getNameBytes();
            }

            @Override // com.p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage.LotteryGiftRedPacketSenderOrBuilder
            public String getUserId() {
                return ((LotteryGiftRedPacketSender) ((GeneratedMessageLite.b) this).instance).getUserId();
            }

            @Override // com.p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage.LotteryGiftRedPacketSenderOrBuilder
            public ByteString getUserIdBytes() {
                return ((LotteryGiftRedPacketSender) ((GeneratedMessageLite.b) this).instance).getUserIdBytes();
            }

            public Builder setAvatarUrl(String str) {
                copyOnWrite();
                ((LotteryGiftRedPacketSender) ((GeneratedMessageLite.b) this).instance).setAvatarUrl(str);
                return this;
            }

            public Builder setAvatarUrlBytes(ByteString byteString) {
                copyOnWrite();
                ((LotteryGiftRedPacketSender) ((GeneratedMessageLite.b) this).instance).setAvatarUrlBytes(byteString);
                return this;
            }

            public Builder setName(String str) {
                copyOnWrite();
                ((LotteryGiftRedPacketSender) ((GeneratedMessageLite.b) this).instance).setName(str);
                return this;
            }

            public Builder setNameBytes(ByteString byteString) {
                copyOnWrite();
                ((LotteryGiftRedPacketSender) ((GeneratedMessageLite.b) this).instance).setNameBytes(byteString);
                return this;
            }

            public Builder setUserId(String str) {
                copyOnWrite();
                ((LotteryGiftRedPacketSender) ((GeneratedMessageLite.b) this).instance).setUserId(str);
                return this;
            }

            public Builder setUserIdBytes(ByteString byteString) {
                copyOnWrite();
                ((LotteryGiftRedPacketSender) ((GeneratedMessageLite.b) this).instance).setUserIdBytes(byteString);
                return this;
            }
        }

        static {
            LotteryGiftRedPacketSender lotteryGiftRedPacketSender = new LotteryGiftRedPacketSender();
            DEFAULT_INSTANCE = lotteryGiftRedPacketSender;
            lotteryGiftRedPacketSender.makeImmutable();
        }

        private LotteryGiftRedPacketSender() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAvatarUrl() {
            this.avatarUrl_ = getDefaultInstance().getAvatarUrl();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearName() {
            this.name_ = getDefaultInstance().getName();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearUserId() {
            this.userId_ = getDefaultInstance().getUserId();
        }

        public static LotteryGiftRedPacketSender getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder(LotteryGiftRedPacketSender lotteryGiftRedPacketSender) {
            return (Builder) ((Builder) DEFAULT_INSTANCE.toBuilder()).mergeFrom(lotteryGiftRedPacketSender);
        }

        public static LotteryGiftRedPacketSender parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (LotteryGiftRedPacketSender) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static LotteryGiftRedPacketSender parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (LotteryGiftRedPacketSender) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static i860<LotteryGiftRedPacketSender> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAvatarUrl(String str) {
            str.getClass();
            this.avatarUrl_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAvatarUrlBytes(ByteString byteString) {
            byteString.getClass();
            a.checkByteStringIsUtf8(byteString);
            this.avatarUrl_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setName(String str) {
            str.getClass();
            this.name_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setNameBytes(ByteString byteString) {
            byteString.getClass();
            a.checkByteStringIsUtf8(byteString);
            this.name_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setUserId(String str) {
            str.getClass();
            this.userId_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setUserIdBytes(ByteString byteString) {
            byteString.getClass();
            a.checkByteStringIsUtf8(byteString);
            this.userId_ = byteString.toStringUtf8();
        }

        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (C03491.f1653xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new LotteryGiftRedPacketSender();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                    return null;
                case 4:
                    return new Builder();
                case 5:
                    GeneratedMessageLite.h hVar = (GeneratedMessageLite.h) obj;
                    LotteryGiftRedPacketSender lotteryGiftRedPacketSender = (LotteryGiftRedPacketSender) obj2;
                    this.userId_ = hVar.f(!this.userId_.isEmpty(), this.userId_, !lotteryGiftRedPacketSender.userId_.isEmpty(), lotteryGiftRedPacketSender.userId_);
                    this.name_ = hVar.f(!this.name_.isEmpty(), this.name_, !lotteryGiftRedPacketSender.name_.isEmpty(), lotteryGiftRedPacketSender.name_);
                    this.avatarUrl_ = hVar.f(!this.avatarUrl_.isEmpty(), this.avatarUrl_, true ^ lotteryGiftRedPacketSender.avatarUrl_.isEmpty(), lotteryGiftRedPacketSender.avatarUrl_);
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
                                    this.userId_ = eVar.L();
                                } else if (iM == 18) {
                                    this.name_ = eVar.L();
                                } else if (iM == 26) {
                                    this.avatarUrl_ = eVar.L();
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
                        synchronized (LotteryGiftRedPacketSender.class) {
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

        @Override // com.p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage.LotteryGiftRedPacketSenderOrBuilder
        public String getAvatarUrl() {
            return this.avatarUrl_;
        }

        @Override // com.p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage.LotteryGiftRedPacketSenderOrBuilder
        public ByteString getAvatarUrlBytes() {
            return ByteString.copyFromUtf8(this.avatarUrl_);
        }

        @Override // com.p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage.LotteryGiftRedPacketSenderOrBuilder
        public String getName() {
            return this.name_;
        }

        @Override // com.p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage.LotteryGiftRedPacketSenderOrBuilder
        public ByteString getNameBytes() {
            return ByteString.copyFromUtf8(this.name_);
        }

        public int getSerializedSize() {
            int i = ((GeneratedMessageLite) this).memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int iK = !this.userId_.isEmpty() ? CodedOutputStream.K(1, getUserId()) : 0;
            if (!this.name_.isEmpty()) {
                iK += CodedOutputStream.K(2, getName());
            }
            if (!this.avatarUrl_.isEmpty()) {
                iK += CodedOutputStream.K(3, getAvatarUrl());
            }
            ((GeneratedMessageLite) this).memoizedSerializedSize = iK;
            return iK;
        }

        @Override // com.p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage.LotteryGiftRedPacketSenderOrBuilder
        public String getUserId() {
            return this.userId_;
        }

        @Override // com.p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage.LotteryGiftRedPacketSenderOrBuilder
        public ByteString getUserIdBytes() {
            return ByteString.copyFromUtf8(this.userId_);
        }

        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (!this.userId_.isEmpty()) {
                codedOutputStream.D0(1, getUserId());
            }
            if (!this.name_.isEmpty()) {
                codedOutputStream.D0(2, getName());
            }
            if (this.avatarUrl_.isEmpty()) {
                return;
            }
            codedOutputStream.D0(3, getAvatarUrl());
        }

        public static LotteryGiftRedPacketSender parseDelimitedFrom(InputStream inputStream, h hVar) throws IOException {
            return (LotteryGiftRedPacketSender) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, hVar);
        }

        public static LotteryGiftRedPacketSender parseFrom(ByteString byteString, h hVar) throws InvalidProtocolBufferException {
            return (LotteryGiftRedPacketSender) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, hVar);
        }

        public static LotteryGiftRedPacketSender parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (LotteryGiftRedPacketSender) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static LotteryGiftRedPacketSender parseFrom(byte[] bArr, h hVar) throws InvalidProtocolBufferException {
            return (LotteryGiftRedPacketSender) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, hVar);
        }

        public static LotteryGiftRedPacketSender parseFrom(InputStream inputStream) throws IOException {
            return (LotteryGiftRedPacketSender) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static LotteryGiftRedPacketSender parseFrom(InputStream inputStream, h hVar) throws IOException {
            return (LotteryGiftRedPacketSender) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, hVar);
        }

        public static LotteryGiftRedPacketSender parseFrom(e eVar) throws IOException {
            return (LotteryGiftRedPacketSender) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, eVar);
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.toBuilder();
        }

        public static LotteryGiftRedPacketSender parseFrom(e eVar, h hVar) throws IOException {
            return (LotteryGiftRedPacketSender) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, eVar, hVar);
        }
    }

    public static final class MysteryBoxRecord extends GeneratedMessageLite<MysteryBoxRecord, Builder> implements MysteryBoxRecordOrBuilder {
        private static final MysteryBoxRecord DEFAULT_INSTANCE;
        public static final int ICONURL_FIELD_NUMBER = 2;
        public static final int NUM_FIELD_NUMBER = 3;
        private static volatile i860<MysteryBoxRecord> PARSER = null;
        public static final int REWARDS_FIELD_NUMBER = 4;
        public static final int TEMPLATE_FIELD_NUMBER = 1;
        private int bitField0_;
        private long num_;
        private Template.TemplateData template_;
        private String iconUrl_ = "";
        private l.h<MysteryBoxReward> rewards_ = GeneratedMessageLite.emptyProtobufList();

        static {
            MysteryBoxRecord mysteryBoxRecord = new MysteryBoxRecord();
            DEFAULT_INSTANCE = mysteryBoxRecord;
            mysteryBoxRecord.makeImmutable();
        }

        private MysteryBoxRecord() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllRewards(Iterable<? extends MysteryBoxReward> iterable) {
            ensureRewardsIsMutable();
            a.addAll(iterable, this.rewards_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addRewards(MysteryBoxReward.Builder builder) {
            ensureRewardsIsMutable();
            this.rewards_.add((MysteryBoxReward) builder.build());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearIconUrl() {
            this.iconUrl_ = getDefaultInstance().getIconUrl();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearNum() {
            this.num_ = 0L;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearRewards() {
            this.rewards_ = GeneratedMessageLite.emptyProtobufList();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearTemplate() {
            this.template_ = null;
        }

        private void ensureRewardsIsMutable() {
            if (this.rewards_.q()) {
                return;
            }
            this.rewards_ = GeneratedMessageLite.mutableCopy(this.rewards_);
        }

        public static MysteryBoxRecord getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeTemplate(Template.TemplateData templateData) {
            Template.TemplateData templateData2 = this.template_;
            if (templateData2 == null || templateData2 == Template.TemplateData.getDefaultInstance()) {
                this.template_ = templateData;
            } else {
                this.template_ = (Template.TemplateData) ((Template.TemplateData.Builder) Template.TemplateData.newBuilder(this.template_).mergeFrom(templateData)).buildPartial();
            }
        }

        public static Builder newBuilder(MysteryBoxRecord mysteryBoxRecord) {
            return (Builder) ((Builder) DEFAULT_INSTANCE.toBuilder()).mergeFrom(mysteryBoxRecord);
        }

        public static MysteryBoxRecord parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (MysteryBoxRecord) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static MysteryBoxRecord parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (MysteryBoxRecord) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static i860<MysteryBoxRecord> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void removeRewards(int i) {
            ensureRewardsIsMutable();
            this.rewards_.remove(i);
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
        public void setNum(long j) {
            this.num_ = j;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setRewards(int i, MysteryBoxReward.Builder builder) {
            ensureRewardsIsMutable();
            this.rewards_.set(i, (MysteryBoxReward) builder.build());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTemplate(Template.TemplateData.Builder builder) {
            this.template_ = (Template.TemplateData) builder.build();
        }

        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            boolean z = false;
            switch (C03491.f1653xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new MysteryBoxRecord();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                    this.rewards_.n();
                    return null;
                case 4:
                    return new Builder();
                case 5:
                    GeneratedMessageLite.g gVar = (GeneratedMessageLite.h) obj;
                    MysteryBoxRecord mysteryBoxRecord = (MysteryBoxRecord) obj2;
                    this.template_ = gVar.o(this.template_, mysteryBoxRecord.template_);
                    this.iconUrl_ = gVar.f(!this.iconUrl_.isEmpty(), this.iconUrl_, !mysteryBoxRecord.iconUrl_.isEmpty(), mysteryBoxRecord.iconUrl_);
                    long j = this.num_;
                    boolean z2 = j != 0;
                    long j2 = mysteryBoxRecord.num_;
                    this.num_ = gVar.i(z2, j, j2 != 0, j2);
                    this.rewards_ = gVar.g(this.rewards_, mysteryBoxRecord.rewards_);
                    if (gVar == GeneratedMessageLite.g.INSTANCE) {
                        this.bitField0_ |= mysteryBoxRecord.bitField0_;
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
                                    Template.TemplateData templateData = this.template_;
                                    Template.TemplateData.Builder builder = templateData != null ? (Template.TemplateData.Builder) templateData.toBuilder() : null;
                                    Template.TemplateData templateDataW = eVar.w(Template.TemplateData.parser(), hVar);
                                    this.template_ = templateDataW;
                                    if (builder != null) {
                                        builder.mergeFrom(templateDataW);
                                        this.template_ = (Template.TemplateData) builder.buildPartial();
                                    }
                                } else if (iM == 18) {
                                    this.iconUrl_ = eVar.L();
                                } else if (iM == 24) {
                                    this.num_ = eVar.v();
                                } else if (iM == 34) {
                                    if (!this.rewards_.q()) {
                                        this.rewards_ = GeneratedMessageLite.mutableCopy(this.rewards_);
                                    }
                                    this.rewards_.add(eVar.w(MysteryBoxReward.parser(), hVar));
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
                        synchronized (MysteryBoxRecord.class) {
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

        @Override // com.p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage.MysteryBoxRecordOrBuilder
        public String getIconUrl() {
            return this.iconUrl_;
        }

        @Override // com.p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage.MysteryBoxRecordOrBuilder
        public ByteString getIconUrlBytes() {
            return ByteString.copyFromUtf8(this.iconUrl_);
        }

        @Override // com.p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage.MysteryBoxRecordOrBuilder
        public long getNum() {
            return this.num_;
        }

        @Override // com.p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage.MysteryBoxRecordOrBuilder
        public MysteryBoxReward getRewards(int i) {
            return (MysteryBoxReward) this.rewards_.get(i);
        }

        @Override // com.p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage.MysteryBoxRecordOrBuilder
        public int getRewardsCount() {
            return this.rewards_.size();
        }

        @Override // com.p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage.MysteryBoxRecordOrBuilder
        public List<MysteryBoxReward> getRewardsList() {
            return this.rewards_;
        }

        public MysteryBoxRewardOrBuilder getRewardsOrBuilder(int i) {
            return (MysteryBoxRewardOrBuilder) this.rewards_.get(i);
        }

        public List<? extends MysteryBoxRewardOrBuilder> getRewardsOrBuilderList() {
            return this.rewards_;
        }

        public int getSerializedSize() {
            int i = ((GeneratedMessageLite) this).memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int iC = this.template_ != null ? CodedOutputStream.C(1, getTemplate()) : 0;
            if (!this.iconUrl_.isEmpty()) {
                iC += CodedOutputStream.K(2, getIconUrl());
            }
            long j = this.num_;
            if (j != 0) {
                iC += CodedOutputStream.v(3, j);
            }
            for (int i2 = 0; i2 < this.rewards_.size(); i2++) {
                iC += CodedOutputStream.C(4, (q) this.rewards_.get(i2));
            }
            ((GeneratedMessageLite) this).memoizedSerializedSize = iC;
            return iC;
        }

        @Override // com.p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage.MysteryBoxRecordOrBuilder
        public Template.TemplateData getTemplate() {
            Template.TemplateData templateData = this.template_;
            return templateData == null ? Template.TemplateData.getDefaultInstance() : templateData;
        }

        @Override // com.p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage.MysteryBoxRecordOrBuilder
        public boolean hasTemplate() {
            return this.template_ != null;
        }

        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (this.template_ != null) {
                codedOutputStream.w0(1, getTemplate());
            }
            if (!this.iconUrl_.isEmpty()) {
                codedOutputStream.D0(2, getIconUrl());
            }
            long j = this.num_;
            if (j != 0) {
                codedOutputStream.u0(3, j);
            }
            for (int i = 0; i < this.rewards_.size(); i++) {
                codedOutputStream.w0(4, (q) this.rewards_.get(i));
            }
        }

        public static MysteryBoxRecord parseDelimitedFrom(InputStream inputStream, h hVar) throws IOException {
            return (MysteryBoxRecord) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, hVar);
        }

        public static MysteryBoxRecord parseFrom(ByteString byteString, h hVar) throws InvalidProtocolBufferException {
            return (MysteryBoxRecord) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, hVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTemplate(Template.TemplateData templateData) {
            templateData.getClass();
            this.template_ = templateData;
        }

        public static final class Builder extends GeneratedMessageLite.b<MysteryBoxRecord, Builder> implements MysteryBoxRecordOrBuilder {
            private Builder() {
                super(MysteryBoxRecord.DEFAULT_INSTANCE);
            }

            public Builder addAllRewards(Iterable<? extends MysteryBoxReward> iterable) {
                copyOnWrite();
                ((MysteryBoxRecord) ((GeneratedMessageLite.b) this).instance).addAllRewards(iterable);
                return this;
            }

            public Builder addRewards(MysteryBoxReward mysteryBoxReward) {
                copyOnWrite();
                ((MysteryBoxRecord) ((GeneratedMessageLite.b) this).instance).addRewards(mysteryBoxReward);
                return this;
            }

            public Builder clearIconUrl() {
                copyOnWrite();
                ((MysteryBoxRecord) ((GeneratedMessageLite.b) this).instance).clearIconUrl();
                return this;
            }

            public Builder clearNum() {
                copyOnWrite();
                ((MysteryBoxRecord) ((GeneratedMessageLite.b) this).instance).clearNum();
                return this;
            }

            public Builder clearRewards() {
                copyOnWrite();
                ((MysteryBoxRecord) ((GeneratedMessageLite.b) this).instance).clearRewards();
                return this;
            }

            public Builder clearTemplate() {
                copyOnWrite();
                ((MysteryBoxRecord) ((GeneratedMessageLite.b) this).instance).clearTemplate();
                return this;
            }

            @Override // com.p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage.MysteryBoxRecordOrBuilder
            public String getIconUrl() {
                return ((MysteryBoxRecord) ((GeneratedMessageLite.b) this).instance).getIconUrl();
            }

            @Override // com.p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage.MysteryBoxRecordOrBuilder
            public ByteString getIconUrlBytes() {
                return ((MysteryBoxRecord) ((GeneratedMessageLite.b) this).instance).getIconUrlBytes();
            }

            @Override // com.p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage.MysteryBoxRecordOrBuilder
            public long getNum() {
                return ((MysteryBoxRecord) ((GeneratedMessageLite.b) this).instance).getNum();
            }

            @Override // com.p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage.MysteryBoxRecordOrBuilder
            public MysteryBoxReward getRewards(int i) {
                return ((MysteryBoxRecord) ((GeneratedMessageLite.b) this).instance).getRewards(i);
            }

            @Override // com.p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage.MysteryBoxRecordOrBuilder
            public int getRewardsCount() {
                return ((MysteryBoxRecord) ((GeneratedMessageLite.b) this).instance).getRewardsCount();
            }

            @Override // com.p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage.MysteryBoxRecordOrBuilder
            public List<MysteryBoxReward> getRewardsList() {
                return Collections.unmodifiableList(((MysteryBoxRecord) ((GeneratedMessageLite.b) this).instance).getRewardsList());
            }

            @Override // com.p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage.MysteryBoxRecordOrBuilder
            public Template.TemplateData getTemplate() {
                return ((MysteryBoxRecord) ((GeneratedMessageLite.b) this).instance).getTemplate();
            }

            @Override // com.p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage.MysteryBoxRecordOrBuilder
            public boolean hasTemplate() {
                return ((MysteryBoxRecord) ((GeneratedMessageLite.b) this).instance).hasTemplate();
            }

            public Builder mergeTemplate(Template.TemplateData templateData) {
                copyOnWrite();
                ((MysteryBoxRecord) ((GeneratedMessageLite.b) this).instance).mergeTemplate(templateData);
                return this;
            }

            public Builder removeRewards(int i) {
                copyOnWrite();
                ((MysteryBoxRecord) ((GeneratedMessageLite.b) this).instance).removeRewards(i);
                return this;
            }

            public Builder setIconUrl(String str) {
                copyOnWrite();
                ((MysteryBoxRecord) ((GeneratedMessageLite.b) this).instance).setIconUrl(str);
                return this;
            }

            public Builder setIconUrlBytes(ByteString byteString) {
                copyOnWrite();
                ((MysteryBoxRecord) ((GeneratedMessageLite.b) this).instance).setIconUrlBytes(byteString);
                return this;
            }

            public Builder setNum(long j) {
                copyOnWrite();
                ((MysteryBoxRecord) ((GeneratedMessageLite.b) this).instance).setNum(j);
                return this;
            }

            public Builder setRewards(int i, MysteryBoxReward mysteryBoxReward) {
                copyOnWrite();
                ((MysteryBoxRecord) ((GeneratedMessageLite.b) this).instance).setRewards(i, mysteryBoxReward);
                return this;
            }

            public Builder setTemplate(Template.TemplateData templateData) {
                copyOnWrite();
                ((MysteryBoxRecord) ((GeneratedMessageLite.b) this).instance).setTemplate(templateData);
                return this;
            }

            public Builder addRewards(int i, MysteryBoxReward mysteryBoxReward) {
                copyOnWrite();
                ((MysteryBoxRecord) ((GeneratedMessageLite.b) this).instance).addRewards(i, mysteryBoxReward);
                return this;
            }

            public Builder setRewards(int i, MysteryBoxReward.Builder builder) {
                copyOnWrite();
                ((MysteryBoxRecord) ((GeneratedMessageLite.b) this).instance).setRewards(i, builder);
                return this;
            }

            public Builder setTemplate(Template.TemplateData.Builder builder) {
                copyOnWrite();
                ((MysteryBoxRecord) ((GeneratedMessageLite.b) this).instance).setTemplate(builder);
                return this;
            }

            public Builder addRewards(MysteryBoxReward.Builder builder) {
                copyOnWrite();
                ((MysteryBoxRecord) ((GeneratedMessageLite.b) this).instance).addRewards(builder);
                return this;
            }

            public Builder addRewards(int i, MysteryBoxReward.Builder builder) {
                copyOnWrite();
                ((MysteryBoxRecord) ((GeneratedMessageLite.b) this).instance).addRewards(i, builder);
                return this;
            }
        }

        public static MysteryBoxRecord parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (MysteryBoxRecord) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static MysteryBoxRecord parseFrom(byte[] bArr, h hVar) throws InvalidProtocolBufferException {
            return (MysteryBoxRecord) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, hVar);
        }

        public static MysteryBoxRecord parseFrom(InputStream inputStream) throws IOException {
            return (MysteryBoxRecord) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static MysteryBoxRecord parseFrom(InputStream inputStream, h hVar) throws IOException {
            return (MysteryBoxRecord) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, hVar);
        }

        public static MysteryBoxRecord parseFrom(e eVar) throws IOException {
            return (MysteryBoxRecord) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addRewards(int i, MysteryBoxReward mysteryBoxReward) {
            mysteryBoxReward.getClass();
            ensureRewardsIsMutable();
            this.rewards_.add(i, mysteryBoxReward);
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.toBuilder();
        }

        public static MysteryBoxRecord parseFrom(e eVar, h hVar) throws IOException {
            return (MysteryBoxRecord) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, eVar, hVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setRewards(int i, MysteryBoxReward mysteryBoxReward) {
            mysteryBoxReward.getClass();
            ensureRewardsIsMutable();
            this.rewards_.set(i, mysteryBoxReward);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addRewards(MysteryBoxReward mysteryBoxReward) {
            mysteryBoxReward.getClass();
            ensureRewardsIsMutable();
            this.rewards_.add(mysteryBoxReward);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addRewards(int i, MysteryBoxReward.Builder builder) {
            ensureRewardsIsMutable();
            this.rewards_.add(i, (MysteryBoxReward) builder.build());
        }
    }

    public static final class MysteryBoxReward extends GeneratedMessageLite<MysteryBoxReward, Builder> implements MysteryBoxRewardOrBuilder {
        private static final MysteryBoxReward DEFAULT_INSTANCE;
        public static final int NAME_FIELD_NUMBER = 1;
        public static final int NUM_FIELD_NUMBER = 3;
        private static volatile i860<MysteryBoxReward> PARSER = null;
        public static final int URL_FIELD_NUMBER = 2;
        private long num_;
        private String name_ = "";
        private String url_ = "";

        public static final class Builder extends GeneratedMessageLite.b<MysteryBoxReward, Builder> implements MysteryBoxRewardOrBuilder {
            private Builder() {
                super(MysteryBoxReward.DEFAULT_INSTANCE);
            }

            public Builder clearName() {
                copyOnWrite();
                ((MysteryBoxReward) ((GeneratedMessageLite.b) this).instance).clearName();
                return this;
            }

            public Builder clearNum() {
                copyOnWrite();
                ((MysteryBoxReward) ((GeneratedMessageLite.b) this).instance).clearNum();
                return this;
            }

            public Builder clearUrl() {
                copyOnWrite();
                ((MysteryBoxReward) ((GeneratedMessageLite.b) this).instance).clearUrl();
                return this;
            }

            @Override // com.p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage.MysteryBoxRewardOrBuilder
            public String getName() {
                return ((MysteryBoxReward) ((GeneratedMessageLite.b) this).instance).getName();
            }

            @Override // com.p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage.MysteryBoxRewardOrBuilder
            public ByteString getNameBytes() {
                return ((MysteryBoxReward) ((GeneratedMessageLite.b) this).instance).getNameBytes();
            }

            @Override // com.p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage.MysteryBoxRewardOrBuilder
            public long getNum() {
                return ((MysteryBoxReward) ((GeneratedMessageLite.b) this).instance).getNum();
            }

            @Override // com.p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage.MysteryBoxRewardOrBuilder
            public String getUrl() {
                return ((MysteryBoxReward) ((GeneratedMessageLite.b) this).instance).getUrl();
            }

            @Override // com.p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage.MysteryBoxRewardOrBuilder
            public ByteString getUrlBytes() {
                return ((MysteryBoxReward) ((GeneratedMessageLite.b) this).instance).getUrlBytes();
            }

            public Builder setName(String str) {
                copyOnWrite();
                ((MysteryBoxReward) ((GeneratedMessageLite.b) this).instance).setName(str);
                return this;
            }

            public Builder setNameBytes(ByteString byteString) {
                copyOnWrite();
                ((MysteryBoxReward) ((GeneratedMessageLite.b) this).instance).setNameBytes(byteString);
                return this;
            }

            public Builder setNum(long j) {
                copyOnWrite();
                ((MysteryBoxReward) ((GeneratedMessageLite.b) this).instance).setNum(j);
                return this;
            }

            public Builder setUrl(String str) {
                copyOnWrite();
                ((MysteryBoxReward) ((GeneratedMessageLite.b) this).instance).setUrl(str);
                return this;
            }

            public Builder setUrlBytes(ByteString byteString) {
                copyOnWrite();
                ((MysteryBoxReward) ((GeneratedMessageLite.b) this).instance).setUrlBytes(byteString);
                return this;
            }
        }

        static {
            MysteryBoxReward mysteryBoxReward = new MysteryBoxReward();
            DEFAULT_INSTANCE = mysteryBoxReward;
            mysteryBoxReward.makeImmutable();
        }

        private MysteryBoxReward() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearName() {
            this.name_ = getDefaultInstance().getName();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearNum() {
            this.num_ = 0L;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearUrl() {
            this.url_ = getDefaultInstance().getUrl();
        }

        public static MysteryBoxReward getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder(MysteryBoxReward mysteryBoxReward) {
            return (Builder) ((Builder) DEFAULT_INSTANCE.toBuilder()).mergeFrom(mysteryBoxReward);
        }

        public static MysteryBoxReward parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (MysteryBoxReward) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static MysteryBoxReward parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (MysteryBoxReward) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static i860<MysteryBoxReward> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setName(String str) {
            str.getClass();
            this.name_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setNameBytes(ByteString byteString) {
            byteString.getClass();
            a.checkByteStringIsUtf8(byteString);
            this.name_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setNum(long j) {
            this.num_ = j;
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
            switch (C03491.f1653xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new MysteryBoxReward();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                    return null;
                case 4:
                    return new Builder();
                case 5:
                    GeneratedMessageLite.h hVar = (GeneratedMessageLite.h) obj;
                    MysteryBoxReward mysteryBoxReward = (MysteryBoxReward) obj2;
                    this.name_ = hVar.f(!this.name_.isEmpty(), this.name_, !mysteryBoxReward.name_.isEmpty(), mysteryBoxReward.name_);
                    this.url_ = hVar.f(!this.url_.isEmpty(), this.url_, !mysteryBoxReward.url_.isEmpty(), mysteryBoxReward.url_);
                    long j = this.num_;
                    boolean z2 = j != 0;
                    long j2 = mysteryBoxReward.num_;
                    this.num_ = hVar.i(z2, j, j2 != 0, j2);
                    GeneratedMessageLite.g gVar = GeneratedMessageLite.g.INSTANCE;
                    return this;
                case 6:
                    e eVar = (e) obj;
                    while (!z) {
                        try {
                            int iM = eVar.M();
                            if (iM != 0) {
                                if (iM == 10) {
                                    this.name_ = eVar.L();
                                } else if (iM == 18) {
                                    this.url_ = eVar.L();
                                } else if (iM == 24) {
                                    this.num_ = eVar.v();
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
                        synchronized (MysteryBoxReward.class) {
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

        @Override // com.p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage.MysteryBoxRewardOrBuilder
        public String getName() {
            return this.name_;
        }

        @Override // com.p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage.MysteryBoxRewardOrBuilder
        public ByteString getNameBytes() {
            return ByteString.copyFromUtf8(this.name_);
        }

        @Override // com.p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage.MysteryBoxRewardOrBuilder
        public long getNum() {
            return this.num_;
        }

        public int getSerializedSize() {
            int i = ((GeneratedMessageLite) this).memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int iK = !this.name_.isEmpty() ? CodedOutputStream.K(1, getName()) : 0;
            if (!this.url_.isEmpty()) {
                iK += CodedOutputStream.K(2, getUrl());
            }
            long j = this.num_;
            if (j != 0) {
                iK += CodedOutputStream.v(3, j);
            }
            ((GeneratedMessageLite) this).memoizedSerializedSize = iK;
            return iK;
        }

        @Override // com.p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage.MysteryBoxRewardOrBuilder
        public String getUrl() {
            return this.url_;
        }

        @Override // com.p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage.MysteryBoxRewardOrBuilder
        public ByteString getUrlBytes() {
            return ByteString.copyFromUtf8(this.url_);
        }

        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (!this.name_.isEmpty()) {
                codedOutputStream.D0(1, getName());
            }
            if (!this.url_.isEmpty()) {
                codedOutputStream.D0(2, getUrl());
            }
            long j = this.num_;
            if (j != 0) {
                codedOutputStream.u0(3, j);
            }
        }

        public static MysteryBoxReward parseDelimitedFrom(InputStream inputStream, h hVar) throws IOException {
            return (MysteryBoxReward) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, hVar);
        }

        public static MysteryBoxReward parseFrom(ByteString byteString, h hVar) throws InvalidProtocolBufferException {
            return (MysteryBoxReward) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, hVar);
        }

        public static MysteryBoxReward parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (MysteryBoxReward) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static MysteryBoxReward parseFrom(byte[] bArr, h hVar) throws InvalidProtocolBufferException {
            return (MysteryBoxReward) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, hVar);
        }

        public static MysteryBoxReward parseFrom(InputStream inputStream) throws IOException {
            return (MysteryBoxReward) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static MysteryBoxReward parseFrom(InputStream inputStream, h hVar) throws IOException {
            return (MysteryBoxReward) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, hVar);
        }

        public static MysteryBoxReward parseFrom(e eVar) throws IOException {
            return (MysteryBoxReward) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, eVar);
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.toBuilder();
        }

        public static MysteryBoxReward parseFrom(e eVar, h hVar) throws IOException {
            return (MysteryBoxReward) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, eVar, hVar);
        }
    }

    public static final class OperationAnimation extends GeneratedMessageLite<OperationAnimation, Builder> implements OperationAnimationOrBuilder {
        private static final OperationAnimation DEFAULT_INSTANCE;
        public static final int ENTER_FIELD_NUMBER = 1;
        private static volatile i860<OperationAnimation> PARSER;
        private OperationAnimationEnter enter_;

        static {
            OperationAnimation operationAnimation = new OperationAnimation();
            DEFAULT_INSTANCE = operationAnimation;
            operationAnimation.makeImmutable();
        }

        private OperationAnimation() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearEnter() {
            this.enter_ = null;
        }

        public static OperationAnimation getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeEnter(OperationAnimationEnter operationAnimationEnter) {
            OperationAnimationEnter operationAnimationEnter2 = this.enter_;
            if (operationAnimationEnter2 == null || operationAnimationEnter2 == OperationAnimationEnter.getDefaultInstance()) {
                this.enter_ = operationAnimationEnter;
            } else {
                this.enter_ = (OperationAnimationEnter) ((OperationAnimationEnter.Builder) OperationAnimationEnter.newBuilder(this.enter_).mergeFrom(operationAnimationEnter)).buildPartial();
            }
        }

        public static Builder newBuilder(OperationAnimation operationAnimation) {
            return (Builder) ((Builder) DEFAULT_INSTANCE.toBuilder()).mergeFrom(operationAnimation);
        }

        public static OperationAnimation parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (OperationAnimation) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static OperationAnimation parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (OperationAnimation) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static i860<OperationAnimation> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setEnter(OperationAnimationEnter.Builder builder) {
            this.enter_ = (OperationAnimationEnter) builder.build();
        }

        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (C03491.f1653xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new OperationAnimation();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                    return null;
                case 4:
                    return new Builder();
                case 5:
                    this.enter_ = ((GeneratedMessageLite.h) obj).o(this.enter_, ((OperationAnimation) obj2).enter_);
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
                                    OperationAnimationEnter operationAnimationEnter = this.enter_;
                                    OperationAnimationEnter.Builder builder = operationAnimationEnter != null ? (OperationAnimationEnter.Builder) operationAnimationEnter.toBuilder() : null;
                                    OperationAnimationEnter operationAnimationEnterW = eVar.w(OperationAnimationEnter.parser(), hVar);
                                    this.enter_ = operationAnimationEnterW;
                                    if (builder != null) {
                                        builder.mergeFrom(operationAnimationEnterW);
                                        this.enter_ = (OperationAnimationEnter) builder.buildPartial();
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
                        synchronized (OperationAnimation.class) {
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

        @Override // com.p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage.OperationAnimationOrBuilder
        public OperationAnimationEnter getEnter() {
            OperationAnimationEnter operationAnimationEnter = this.enter_;
            return operationAnimationEnter == null ? OperationAnimationEnter.getDefaultInstance() : operationAnimationEnter;
        }

        public int getSerializedSize() {
            int i = ((GeneratedMessageLite) this).memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int iC = this.enter_ != null ? CodedOutputStream.C(1, getEnter()) : 0;
            ((GeneratedMessageLite) this).memoizedSerializedSize = iC;
            return iC;
        }

        @Override // com.p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage.OperationAnimationOrBuilder
        public boolean hasEnter() {
            return this.enter_ != null;
        }

        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (this.enter_ != null) {
                codedOutputStream.w0(1, getEnter());
            }
        }

        public static OperationAnimation parseDelimitedFrom(InputStream inputStream, h hVar) throws IOException {
            return (OperationAnimation) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, hVar);
        }

        public static OperationAnimation parseFrom(ByteString byteString, h hVar) throws InvalidProtocolBufferException {
            return (OperationAnimation) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, hVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setEnter(OperationAnimationEnter operationAnimationEnter) {
            operationAnimationEnter.getClass();
            this.enter_ = operationAnimationEnter;
        }

        public static final class Builder extends GeneratedMessageLite.b<OperationAnimation, Builder> implements OperationAnimationOrBuilder {
            private Builder() {
                super(OperationAnimation.DEFAULT_INSTANCE);
            }

            public Builder clearEnter() {
                copyOnWrite();
                ((OperationAnimation) ((GeneratedMessageLite.b) this).instance).clearEnter();
                return this;
            }

            @Override // com.p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage.OperationAnimationOrBuilder
            public OperationAnimationEnter getEnter() {
                return ((OperationAnimation) ((GeneratedMessageLite.b) this).instance).getEnter();
            }

            @Override // com.p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage.OperationAnimationOrBuilder
            public boolean hasEnter() {
                return ((OperationAnimation) ((GeneratedMessageLite.b) this).instance).hasEnter();
            }

            public Builder mergeEnter(OperationAnimationEnter operationAnimationEnter) {
                copyOnWrite();
                ((OperationAnimation) ((GeneratedMessageLite.b) this).instance).mergeEnter(operationAnimationEnter);
                return this;
            }

            public Builder setEnter(OperationAnimationEnter operationAnimationEnter) {
                copyOnWrite();
                ((OperationAnimation) ((GeneratedMessageLite.b) this).instance).setEnter(operationAnimationEnter);
                return this;
            }

            public Builder setEnter(OperationAnimationEnter.Builder builder) {
                copyOnWrite();
                ((OperationAnimation) ((GeneratedMessageLite.b) this).instance).setEnter(builder);
                return this;
            }
        }

        public static OperationAnimation parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (OperationAnimation) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static OperationAnimation parseFrom(byte[] bArr, h hVar) throws InvalidProtocolBufferException {
            return (OperationAnimation) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, hVar);
        }

        public static OperationAnimation parseFrom(InputStream inputStream) throws IOException {
            return (OperationAnimation) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static OperationAnimation parseFrom(InputStream inputStream, h hVar) throws IOException {
            return (OperationAnimation) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, hVar);
        }

        public static OperationAnimation parseFrom(e eVar) throws IOException {
            return (OperationAnimation) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, eVar);
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.toBuilder();
        }

        public static OperationAnimation parseFrom(e eVar, h hVar) throws IOException {
            return (OperationAnimation) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, eVar, hVar);
        }
    }

    public static final class OperationAnimationEnter extends GeneratedMessageLite<OperationAnimationEnter, Builder> implements OperationAnimationEnterOrBuilder {
        public static final int ANIMATIONTYPE_FIELD_NUMBER = 1;
        private static final OperationAnimationEnter DEFAULT_INSTANCE;
        public static final int IMAGEURL_FIELD_NUMBER = 3;
        public static final int ISTOP_FIELD_NUMBER = 2;
        private static volatile i860<OperationAnimationEnter> PARSER;
        private String animationType_ = "";
        private String imageUrl_ = "";
        private boolean isTop_;

        public static final class Builder extends GeneratedMessageLite.b<OperationAnimationEnter, Builder> implements OperationAnimationEnterOrBuilder {
            private Builder() {
                super(OperationAnimationEnter.DEFAULT_INSTANCE);
            }

            public Builder clearAnimationType() {
                copyOnWrite();
                ((OperationAnimationEnter) ((GeneratedMessageLite.b) this).instance).clearAnimationType();
                return this;
            }

            public Builder clearImageUrl() {
                copyOnWrite();
                ((OperationAnimationEnter) ((GeneratedMessageLite.b) this).instance).clearImageUrl();
                return this;
            }

            public Builder clearIsTop() {
                copyOnWrite();
                ((OperationAnimationEnter) ((GeneratedMessageLite.b) this).instance).clearIsTop();
                return this;
            }

            @Override // com.p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage.OperationAnimationEnterOrBuilder
            public String getAnimationType() {
                return ((OperationAnimationEnter) ((GeneratedMessageLite.b) this).instance).getAnimationType();
            }

            @Override // com.p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage.OperationAnimationEnterOrBuilder
            public ByteString getAnimationTypeBytes() {
                return ((OperationAnimationEnter) ((GeneratedMessageLite.b) this).instance).getAnimationTypeBytes();
            }

            @Override // com.p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage.OperationAnimationEnterOrBuilder
            public String getImageUrl() {
                return ((OperationAnimationEnter) ((GeneratedMessageLite.b) this).instance).getImageUrl();
            }

            @Override // com.p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage.OperationAnimationEnterOrBuilder
            public ByteString getImageUrlBytes() {
                return ((OperationAnimationEnter) ((GeneratedMessageLite.b) this).instance).getImageUrlBytes();
            }

            @Override // com.p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage.OperationAnimationEnterOrBuilder
            public boolean getIsTop() {
                return ((OperationAnimationEnter) ((GeneratedMessageLite.b) this).instance).getIsTop();
            }

            public Builder setAnimationType(String str) {
                copyOnWrite();
                ((OperationAnimationEnter) ((GeneratedMessageLite.b) this).instance).setAnimationType(str);
                return this;
            }

            public Builder setAnimationTypeBytes(ByteString byteString) {
                copyOnWrite();
                ((OperationAnimationEnter) ((GeneratedMessageLite.b) this).instance).setAnimationTypeBytes(byteString);
                return this;
            }

            public Builder setImageUrl(String str) {
                copyOnWrite();
                ((OperationAnimationEnter) ((GeneratedMessageLite.b) this).instance).setImageUrl(str);
                return this;
            }

            public Builder setImageUrlBytes(ByteString byteString) {
                copyOnWrite();
                ((OperationAnimationEnter) ((GeneratedMessageLite.b) this).instance).setImageUrlBytes(byteString);
                return this;
            }

            public Builder setIsTop(boolean z) {
                copyOnWrite();
                ((OperationAnimationEnter) ((GeneratedMessageLite.b) this).instance).setIsTop(z);
                return this;
            }
        }

        static {
            OperationAnimationEnter operationAnimationEnter = new OperationAnimationEnter();
            DEFAULT_INSTANCE = operationAnimationEnter;
            operationAnimationEnter.makeImmutable();
        }

        private OperationAnimationEnter() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAnimationType() {
            this.animationType_ = getDefaultInstance().getAnimationType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearImageUrl() {
            this.imageUrl_ = getDefaultInstance().getImageUrl();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearIsTop() {
            this.isTop_ = false;
        }

        public static OperationAnimationEnter getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder(OperationAnimationEnter operationAnimationEnter) {
            return (Builder) ((Builder) DEFAULT_INSTANCE.toBuilder()).mergeFrom(operationAnimationEnter);
        }

        public static OperationAnimationEnter parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (OperationAnimationEnter) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static OperationAnimationEnter parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (OperationAnimationEnter) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static i860<OperationAnimationEnter> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAnimationType(String str) {
            str.getClass();
            this.animationType_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAnimationTypeBytes(ByteString byteString) {
            byteString.getClass();
            a.checkByteStringIsUtf8(byteString);
            this.animationType_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setImageUrl(String str) {
            str.getClass();
            this.imageUrl_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setImageUrlBytes(ByteString byteString) {
            byteString.getClass();
            a.checkByteStringIsUtf8(byteString);
            this.imageUrl_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setIsTop(boolean z) {
            this.isTop_ = z;
        }

        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (C03491.f1653xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new OperationAnimationEnter();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                    return null;
                case 4:
                    return new Builder();
                case 5:
                    GeneratedMessageLite.h hVar = (GeneratedMessageLite.h) obj;
                    OperationAnimationEnter operationAnimationEnter = (OperationAnimationEnter) obj2;
                    this.animationType_ = hVar.f(!this.animationType_.isEmpty(), this.animationType_, !operationAnimationEnter.animationType_.isEmpty(), operationAnimationEnter.animationType_);
                    boolean z = this.isTop_;
                    boolean z2 = operationAnimationEnter.isTop_;
                    this.isTop_ = hVar.d(z, z, z2, z2);
                    this.imageUrl_ = hVar.f(!this.imageUrl_.isEmpty(), this.imageUrl_, true ^ operationAnimationEnter.imageUrl_.isEmpty(), operationAnimationEnter.imageUrl_);
                    GeneratedMessageLite.g gVar = GeneratedMessageLite.g.INSTANCE;
                    return this;
                case 6:
                    e eVar = (e) obj;
                    boolean z3 = false;
                    while (!z3) {
                        try {
                            int iM = eVar.M();
                            if (iM != 0) {
                                if (iM == 10) {
                                    this.animationType_ = eVar.L();
                                } else if (iM == 16) {
                                    this.isTop_ = eVar.m();
                                } else if (iM == 26) {
                                    this.imageUrl_ = eVar.L();
                                } else if (!eVar.R(iM)) {
                                }
                            }
                            z3 = true;
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
                        synchronized (OperationAnimationEnter.class) {
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

        @Override // com.p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage.OperationAnimationEnterOrBuilder
        public String getAnimationType() {
            return this.animationType_;
        }

        @Override // com.p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage.OperationAnimationEnterOrBuilder
        public ByteString getAnimationTypeBytes() {
            return ByteString.copyFromUtf8(this.animationType_);
        }

        @Override // com.p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage.OperationAnimationEnterOrBuilder
        public String getImageUrl() {
            return this.imageUrl_;
        }

        @Override // com.p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage.OperationAnimationEnterOrBuilder
        public ByteString getImageUrlBytes() {
            return ByteString.copyFromUtf8(this.imageUrl_);
        }

        @Override // com.p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage.OperationAnimationEnterOrBuilder
        public boolean getIsTop() {
            return this.isTop_;
        }

        public int getSerializedSize() {
            int i = ((GeneratedMessageLite) this).memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int iK = !this.animationType_.isEmpty() ? CodedOutputStream.K(1, getAnimationType()) : 0;
            boolean z = this.isTop_;
            if (z) {
                iK += CodedOutputStream.f(2, z);
            }
            if (!this.imageUrl_.isEmpty()) {
                iK += CodedOutputStream.K(3, getImageUrl());
            }
            ((GeneratedMessageLite) this).memoizedSerializedSize = iK;
            return iK;
        }

        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (!this.animationType_.isEmpty()) {
                codedOutputStream.D0(1, getAnimationType());
            }
            boolean z = this.isTop_;
            if (z) {
                codedOutputStream.a0(2, z);
            }
            if (this.imageUrl_.isEmpty()) {
                return;
            }
            codedOutputStream.D0(3, getImageUrl());
        }

        public static OperationAnimationEnter parseDelimitedFrom(InputStream inputStream, h hVar) throws IOException {
            return (OperationAnimationEnter) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, hVar);
        }

        public static OperationAnimationEnter parseFrom(ByteString byteString, h hVar) throws InvalidProtocolBufferException {
            return (OperationAnimationEnter) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, hVar);
        }

        public static OperationAnimationEnter parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (OperationAnimationEnter) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static OperationAnimationEnter parseFrom(byte[] bArr, h hVar) throws InvalidProtocolBufferException {
            return (OperationAnimationEnter) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, hVar);
        }

        public static OperationAnimationEnter parseFrom(InputStream inputStream) throws IOException {
            return (OperationAnimationEnter) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static OperationAnimationEnter parseFrom(InputStream inputStream, h hVar) throws IOException {
            return (OperationAnimationEnter) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, hVar);
        }

        public static OperationAnimationEnter parseFrom(e eVar) throws IOException {
            return (OperationAnimationEnter) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, eVar);
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.toBuilder();
        }

        public static OperationAnimationEnter parseFrom(e eVar, h hVar) throws IOException {
            return (OperationAnimationEnter) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, eVar, hVar);
        }
    }

    public static final class OperationHierarchy extends GeneratedMessageLite<OperationHierarchy, Builder> implements OperationHierarchyOrBuilder {
        private static final OperationHierarchy DEFAULT_INSTANCE;
        private static volatile i860<OperationHierarchy> PARSER = null;
        public static final int USERHIERARCHY_FIELD_NUMBER = 1;
        private long userHierarchy_;

        public static final class Builder extends GeneratedMessageLite.b<OperationHierarchy, Builder> implements OperationHierarchyOrBuilder {
            private Builder() {
                super(OperationHierarchy.DEFAULT_INSTANCE);
            }

            public Builder clearUserHierarchy() {
                copyOnWrite();
                ((OperationHierarchy) ((GeneratedMessageLite.b) this).instance).clearUserHierarchy();
                return this;
            }

            @Override // com.p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage.OperationHierarchyOrBuilder
            public long getUserHierarchy() {
                return ((OperationHierarchy) ((GeneratedMessageLite.b) this).instance).getUserHierarchy();
            }

            public Builder setUserHierarchy(long j) {
                copyOnWrite();
                ((OperationHierarchy) ((GeneratedMessageLite.b) this).instance).setUserHierarchy(j);
                return this;
            }
        }

        static {
            OperationHierarchy operationHierarchy = new OperationHierarchy();
            DEFAULT_INSTANCE = operationHierarchy;
            operationHierarchy.makeImmutable();
        }

        private OperationHierarchy() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearUserHierarchy() {
            this.userHierarchy_ = 0L;
        }

        public static OperationHierarchy getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder(OperationHierarchy operationHierarchy) {
            return (Builder) ((Builder) DEFAULT_INSTANCE.toBuilder()).mergeFrom(operationHierarchy);
        }

        public static OperationHierarchy parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (OperationHierarchy) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static OperationHierarchy parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (OperationHierarchy) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static i860<OperationHierarchy> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setUserHierarchy(long j) {
            this.userHierarchy_ = j;
        }

        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            boolean z = false;
            switch (C03491.f1653xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new OperationHierarchy();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                    return null;
                case 4:
                    return new Builder();
                case 5:
                    GeneratedMessageLite.h hVar = (GeneratedMessageLite.h) obj;
                    OperationHierarchy operationHierarchy = (OperationHierarchy) obj2;
                    long j = this.userHierarchy_;
                    boolean z2 = j != 0;
                    long j2 = operationHierarchy.userHierarchy_;
                    this.userHierarchy_ = hVar.i(z2, j, j2 != 0, j2);
                    GeneratedMessageLite.g gVar = GeneratedMessageLite.g.INSTANCE;
                    return this;
                case 6:
                    e eVar = (e) obj;
                    while (!z) {
                        try {
                            int iM = eVar.M();
                            if (iM != 0) {
                                if (iM == 8) {
                                    this.userHierarchy_ = eVar.v();
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
                        synchronized (OperationHierarchy.class) {
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

        public int getSerializedSize() {
            int i = ((GeneratedMessageLite) this).memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            long j = this.userHierarchy_;
            int iV = j != 0 ? CodedOutputStream.v(1, j) : 0;
            ((GeneratedMessageLite) this).memoizedSerializedSize = iV;
            return iV;
        }

        @Override // com.p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage.OperationHierarchyOrBuilder
        public long getUserHierarchy() {
            return this.userHierarchy_;
        }

        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            long j = this.userHierarchy_;
            if (j != 0) {
                codedOutputStream.u0(1, j);
            }
        }

        public static OperationHierarchy parseDelimitedFrom(InputStream inputStream, h hVar) throws IOException {
            return (OperationHierarchy) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, hVar);
        }

        public static OperationHierarchy parseFrom(ByteString byteString, h hVar) throws InvalidProtocolBufferException {
            return (OperationHierarchy) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, hVar);
        }

        public static OperationHierarchy parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (OperationHierarchy) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static OperationHierarchy parseFrom(byte[] bArr, h hVar) throws InvalidProtocolBufferException {
            return (OperationHierarchy) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, hVar);
        }

        public static OperationHierarchy parseFrom(InputStream inputStream) throws IOException {
            return (OperationHierarchy) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static OperationHierarchy parseFrom(InputStream inputStream, h hVar) throws IOException {
            return (OperationHierarchy) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, hVar);
        }

        public static OperationHierarchy parseFrom(e eVar) throws IOException {
            return (OperationHierarchy) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, eVar);
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.toBuilder();
        }

        public static OperationHierarchy parseFrom(e eVar, h hVar) throws IOException {
            return (OperationHierarchy) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, eVar, hVar);
        }
    }

    public static final class OperationSubscription extends GeneratedMessageLite<OperationSubscription, Builder> implements OperationSubscriptionOrBuilder {
        public static final int DATA_FIELD_NUMBER = 3;
        private static final OperationSubscription DEFAULT_INSTANCE;
        private static volatile i860<OperationSubscription> PARSER = null;
        public static final int SUBSCRIBETYPE_FIELD_NUMBER = 1;
        public static final int UPDATETYPE_FIELD_NUMBER = 2;
        private String subscribeType_ = "";
        private String updateType_ = "";
        private String data_ = "";

        public static final class Builder extends GeneratedMessageLite.b<OperationSubscription, Builder> implements OperationSubscriptionOrBuilder {
            private Builder() {
                super(OperationSubscription.DEFAULT_INSTANCE);
            }

            public Builder clearData() {
                copyOnWrite();
                ((OperationSubscription) ((GeneratedMessageLite.b) this).instance).clearData();
                return this;
            }

            public Builder clearSubscribeType() {
                copyOnWrite();
                ((OperationSubscription) ((GeneratedMessageLite.b) this).instance).clearSubscribeType();
                return this;
            }

            public Builder clearUpdateType() {
                copyOnWrite();
                ((OperationSubscription) ((GeneratedMessageLite.b) this).instance).clearUpdateType();
                return this;
            }

            @Override // com.p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage.OperationSubscriptionOrBuilder
            public String getData() {
                return ((OperationSubscription) ((GeneratedMessageLite.b) this).instance).getData();
            }

            @Override // com.p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage.OperationSubscriptionOrBuilder
            public ByteString getDataBytes() {
                return ((OperationSubscription) ((GeneratedMessageLite.b) this).instance).getDataBytes();
            }

            @Override // com.p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage.OperationSubscriptionOrBuilder
            public String getSubscribeType() {
                return ((OperationSubscription) ((GeneratedMessageLite.b) this).instance).getSubscribeType();
            }

            @Override // com.p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage.OperationSubscriptionOrBuilder
            public ByteString getSubscribeTypeBytes() {
                return ((OperationSubscription) ((GeneratedMessageLite.b) this).instance).getSubscribeTypeBytes();
            }

            @Override // com.p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage.OperationSubscriptionOrBuilder
            public String getUpdateType() {
                return ((OperationSubscription) ((GeneratedMessageLite.b) this).instance).getUpdateType();
            }

            @Override // com.p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage.OperationSubscriptionOrBuilder
            public ByteString getUpdateTypeBytes() {
                return ((OperationSubscription) ((GeneratedMessageLite.b) this).instance).getUpdateTypeBytes();
            }

            public Builder setData(String str) {
                copyOnWrite();
                ((OperationSubscription) ((GeneratedMessageLite.b) this).instance).setData(str);
                return this;
            }

            public Builder setDataBytes(ByteString byteString) {
                copyOnWrite();
                ((OperationSubscription) ((GeneratedMessageLite.b) this).instance).setDataBytes(byteString);
                return this;
            }

            public Builder setSubscribeType(String str) {
                copyOnWrite();
                ((OperationSubscription) ((GeneratedMessageLite.b) this).instance).setSubscribeType(str);
                return this;
            }

            public Builder setSubscribeTypeBytes(ByteString byteString) {
                copyOnWrite();
                ((OperationSubscription) ((GeneratedMessageLite.b) this).instance).setSubscribeTypeBytes(byteString);
                return this;
            }

            public Builder setUpdateType(String str) {
                copyOnWrite();
                ((OperationSubscription) ((GeneratedMessageLite.b) this).instance).setUpdateType(str);
                return this;
            }

            public Builder setUpdateTypeBytes(ByteString byteString) {
                copyOnWrite();
                ((OperationSubscription) ((GeneratedMessageLite.b) this).instance).setUpdateTypeBytes(byteString);
                return this;
            }
        }

        static {
            OperationSubscription operationSubscription = new OperationSubscription();
            DEFAULT_INSTANCE = operationSubscription;
            operationSubscription.makeImmutable();
        }

        private OperationSubscription() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearData() {
            this.data_ = getDefaultInstance().getData();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearSubscribeType() {
            this.subscribeType_ = getDefaultInstance().getSubscribeType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearUpdateType() {
            this.updateType_ = getDefaultInstance().getUpdateType();
        }

        public static OperationSubscription getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder(OperationSubscription operationSubscription) {
            return (Builder) ((Builder) DEFAULT_INSTANCE.toBuilder()).mergeFrom(operationSubscription);
        }

        public static OperationSubscription parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (OperationSubscription) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static OperationSubscription parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (OperationSubscription) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static i860<OperationSubscription> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setData(String str) {
            str.getClass();
            this.data_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setDataBytes(ByteString byteString) {
            byteString.getClass();
            a.checkByteStringIsUtf8(byteString);
            this.data_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSubscribeType(String str) {
            str.getClass();
            this.subscribeType_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSubscribeTypeBytes(ByteString byteString) {
            byteString.getClass();
            a.checkByteStringIsUtf8(byteString);
            this.subscribeType_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setUpdateType(String str) {
            str.getClass();
            this.updateType_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setUpdateTypeBytes(ByteString byteString) {
            byteString.getClass();
            a.checkByteStringIsUtf8(byteString);
            this.updateType_ = byteString.toStringUtf8();
        }

        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (C03491.f1653xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new OperationSubscription();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                    return null;
                case 4:
                    return new Builder();
                case 5:
                    GeneratedMessageLite.h hVar = (GeneratedMessageLite.h) obj;
                    OperationSubscription operationSubscription = (OperationSubscription) obj2;
                    this.subscribeType_ = hVar.f(!this.subscribeType_.isEmpty(), this.subscribeType_, !operationSubscription.subscribeType_.isEmpty(), operationSubscription.subscribeType_);
                    this.updateType_ = hVar.f(!this.updateType_.isEmpty(), this.updateType_, !operationSubscription.updateType_.isEmpty(), operationSubscription.updateType_);
                    this.data_ = hVar.f(!this.data_.isEmpty(), this.data_, true ^ operationSubscription.data_.isEmpty(), operationSubscription.data_);
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
                                    this.subscribeType_ = eVar.L();
                                } else if (iM == 18) {
                                    this.updateType_ = eVar.L();
                                } else if (iM == 26) {
                                    this.data_ = eVar.L();
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
                        synchronized (OperationSubscription.class) {
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

        @Override // com.p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage.OperationSubscriptionOrBuilder
        public String getData() {
            return this.data_;
        }

        @Override // com.p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage.OperationSubscriptionOrBuilder
        public ByteString getDataBytes() {
            return ByteString.copyFromUtf8(this.data_);
        }

        public int getSerializedSize() {
            int i = ((GeneratedMessageLite) this).memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int iK = !this.subscribeType_.isEmpty() ? CodedOutputStream.K(1, getSubscribeType()) : 0;
            if (!this.updateType_.isEmpty()) {
                iK += CodedOutputStream.K(2, getUpdateType());
            }
            if (!this.data_.isEmpty()) {
                iK += CodedOutputStream.K(3, getData());
            }
            ((GeneratedMessageLite) this).memoizedSerializedSize = iK;
            return iK;
        }

        @Override // com.p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage.OperationSubscriptionOrBuilder
        public String getSubscribeType() {
            return this.subscribeType_;
        }

        @Override // com.p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage.OperationSubscriptionOrBuilder
        public ByteString getSubscribeTypeBytes() {
            return ByteString.copyFromUtf8(this.subscribeType_);
        }

        @Override // com.p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage.OperationSubscriptionOrBuilder
        public String getUpdateType() {
            return this.updateType_;
        }

        @Override // com.p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage.OperationSubscriptionOrBuilder
        public ByteString getUpdateTypeBytes() {
            return ByteString.copyFromUtf8(this.updateType_);
        }

        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (!this.subscribeType_.isEmpty()) {
                codedOutputStream.D0(1, getSubscribeType());
            }
            if (!this.updateType_.isEmpty()) {
                codedOutputStream.D0(2, getUpdateType());
            }
            if (this.data_.isEmpty()) {
                return;
            }
            codedOutputStream.D0(3, getData());
        }

        public static OperationSubscription parseDelimitedFrom(InputStream inputStream, h hVar) throws IOException {
            return (OperationSubscription) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, hVar);
        }

        public static OperationSubscription parseFrom(ByteString byteString, h hVar) throws InvalidProtocolBufferException {
            return (OperationSubscription) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, hVar);
        }

        public static OperationSubscription parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (OperationSubscription) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static OperationSubscription parseFrom(byte[] bArr, h hVar) throws InvalidProtocolBufferException {
            return (OperationSubscription) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, hVar);
        }

        public static OperationSubscription parseFrom(InputStream inputStream) throws IOException {
            return (OperationSubscription) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static OperationSubscription parseFrom(InputStream inputStream, h hVar) throws IOException {
            return (OperationSubscription) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, hVar);
        }

        public static OperationSubscription parseFrom(e eVar) throws IOException {
            return (OperationSubscription) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, eVar);
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.toBuilder();
        }

        public static OperationSubscription parseFrom(e eVar, h hVar) throws IOException {
            return (OperationSubscription) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, eVar, hVar);
        }
    }

    public static final class PopUp extends GeneratedMessageLite<PopUp, Builder> implements PopUpOrBuilder {
        public static final int CAMPAIGNID_FIELD_NUMBER = 1;
        private static final PopUp DEFAULT_INSTANCE;
        private static volatile i860<PopUp> PARSER = null;
        public static final int ROOMID_FIELD_NUMBER = 2;
        private String campaignId_ = "";
        private String roomId_ = "";

        public static final class Builder extends GeneratedMessageLite.b<PopUp, Builder> implements PopUpOrBuilder {
            private Builder() {
                super(PopUp.DEFAULT_INSTANCE);
            }

            public Builder clearCampaignId() {
                copyOnWrite();
                ((PopUp) ((GeneratedMessageLite.b) this).instance).clearCampaignId();
                return this;
            }

            public Builder clearRoomId() {
                copyOnWrite();
                ((PopUp) ((GeneratedMessageLite.b) this).instance).clearRoomId();
                return this;
            }

            @Override // com.p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage.PopUpOrBuilder
            public String getCampaignId() {
                return ((PopUp) ((GeneratedMessageLite.b) this).instance).getCampaignId();
            }

            @Override // com.p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage.PopUpOrBuilder
            public ByteString getCampaignIdBytes() {
                return ((PopUp) ((GeneratedMessageLite.b) this).instance).getCampaignIdBytes();
            }

            @Override // com.p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage.PopUpOrBuilder
            public String getRoomId() {
                return ((PopUp) ((GeneratedMessageLite.b) this).instance).getRoomId();
            }

            @Override // com.p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage.PopUpOrBuilder
            public ByteString getRoomIdBytes() {
                return ((PopUp) ((GeneratedMessageLite.b) this).instance).getRoomIdBytes();
            }

            public Builder setCampaignId(String str) {
                copyOnWrite();
                ((PopUp) ((GeneratedMessageLite.b) this).instance).setCampaignId(str);
                return this;
            }

            public Builder setCampaignIdBytes(ByteString byteString) {
                copyOnWrite();
                ((PopUp) ((GeneratedMessageLite.b) this).instance).setCampaignIdBytes(byteString);
                return this;
            }

            public Builder setRoomId(String str) {
                copyOnWrite();
                ((PopUp) ((GeneratedMessageLite.b) this).instance).setRoomId(str);
                return this;
            }

            public Builder setRoomIdBytes(ByteString byteString) {
                copyOnWrite();
                ((PopUp) ((GeneratedMessageLite.b) this).instance).setRoomIdBytes(byteString);
                return this;
            }
        }

        static {
            PopUp popUp = new PopUp();
            DEFAULT_INSTANCE = popUp;
            popUp.makeImmutable();
        }

        private PopUp() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearCampaignId() {
            this.campaignId_ = getDefaultInstance().getCampaignId();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearRoomId() {
            this.roomId_ = getDefaultInstance().getRoomId();
        }

        public static PopUp getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder(PopUp popUp) {
            return (Builder) ((Builder) DEFAULT_INSTANCE.toBuilder()).mergeFrom(popUp);
        }

        public static PopUp parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (PopUp) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static PopUp parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (PopUp) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static i860<PopUp> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setCampaignId(String str) {
            str.getClass();
            this.campaignId_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setCampaignIdBytes(ByteString byteString) {
            byteString.getClass();
            a.checkByteStringIsUtf8(byteString);
            this.campaignId_ = byteString.toStringUtf8();
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

        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (C03491.f1653xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new PopUp();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                    return null;
                case 4:
                    return new Builder();
                case 5:
                    GeneratedMessageLite.h hVar = (GeneratedMessageLite.h) obj;
                    PopUp popUp = (PopUp) obj2;
                    this.campaignId_ = hVar.f(!this.campaignId_.isEmpty(), this.campaignId_, !popUp.campaignId_.isEmpty(), popUp.campaignId_);
                    this.roomId_ = hVar.f(!this.roomId_.isEmpty(), this.roomId_, true ^ popUp.roomId_.isEmpty(), popUp.roomId_);
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
                                    this.campaignId_ = eVar.L();
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
                        synchronized (PopUp.class) {
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

        @Override // com.p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage.PopUpOrBuilder
        public String getCampaignId() {
            return this.campaignId_;
        }

        @Override // com.p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage.PopUpOrBuilder
        public ByteString getCampaignIdBytes() {
            return ByteString.copyFromUtf8(this.campaignId_);
        }

        @Override // com.p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage.PopUpOrBuilder
        public String getRoomId() {
            return this.roomId_;
        }

        @Override // com.p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage.PopUpOrBuilder
        public ByteString getRoomIdBytes() {
            return ByteString.copyFromUtf8(this.roomId_);
        }

        public int getSerializedSize() {
            int i = ((GeneratedMessageLite) this).memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int iK = !this.campaignId_.isEmpty() ? CodedOutputStream.K(1, getCampaignId()) : 0;
            if (!this.roomId_.isEmpty()) {
                iK += CodedOutputStream.K(2, getRoomId());
            }
            ((GeneratedMessageLite) this).memoizedSerializedSize = iK;
            return iK;
        }

        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (!this.campaignId_.isEmpty()) {
                codedOutputStream.D0(1, getCampaignId());
            }
            if (this.roomId_.isEmpty()) {
                return;
            }
            codedOutputStream.D0(2, getRoomId());
        }

        public static PopUp parseDelimitedFrom(InputStream inputStream, h hVar) throws IOException {
            return (PopUp) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, hVar);
        }

        public static PopUp parseFrom(ByteString byteString, h hVar) throws InvalidProtocolBufferException {
            return (PopUp) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, hVar);
        }

        public static PopUp parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (PopUp) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static PopUp parseFrom(byte[] bArr, h hVar) throws InvalidProtocolBufferException {
            return (PopUp) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, hVar);
        }

        public static PopUp parseFrom(InputStream inputStream) throws IOException {
            return (PopUp) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static PopUp parseFrom(InputStream inputStream, h hVar) throws IOException {
            return (PopUp) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, hVar);
        }

        public static PopUp parseFrom(e eVar) throws IOException {
            return (PopUp) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, eVar);
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.toBuilder();
        }

        public static PopUp parseFrom(e eVar, h hVar) throws IOException {
            return (PopUp) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, eVar, hVar);
        }
    }

    public static final class PopUpContentUpdateNotice extends GeneratedMessageLite<PopUpContentUpdateNotice, Builder> implements PopUpContentUpdateNoticeOrBuilder {
        public static final int DATA_FIELD_NUMBER = 4;
        private static final PopUpContentUpdateNotice DEFAULT_INSTANCE;
        private static volatile i860<PopUpContentUpdateNotice> PARSER = null;
        public static final int ROOMID_FIELD_NUMBER = 1;
        public static final int UPDATETYPE_FIELD_NUMBER = 3;
        public static final int URL_FIELD_NUMBER = 2;
        private String roomId_ = "";
        private String url_ = "";
        private String updateType_ = "";
        private String data_ = "";

        public static final class Builder extends GeneratedMessageLite.b<PopUpContentUpdateNotice, Builder> implements PopUpContentUpdateNoticeOrBuilder {
            private Builder() {
                super(PopUpContentUpdateNotice.DEFAULT_INSTANCE);
            }

            public Builder clearData() {
                copyOnWrite();
                ((PopUpContentUpdateNotice) ((GeneratedMessageLite.b) this).instance).clearData();
                return this;
            }

            public Builder clearRoomId() {
                copyOnWrite();
                ((PopUpContentUpdateNotice) ((GeneratedMessageLite.b) this).instance).clearRoomId();
                return this;
            }

            public Builder clearUpdateType() {
                copyOnWrite();
                ((PopUpContentUpdateNotice) ((GeneratedMessageLite.b) this).instance).clearUpdateType();
                return this;
            }

            public Builder clearUrl() {
                copyOnWrite();
                ((PopUpContentUpdateNotice) ((GeneratedMessageLite.b) this).instance).clearUrl();
                return this;
            }

            @Override // com.p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage.PopUpContentUpdateNoticeOrBuilder
            public String getData() {
                return ((PopUpContentUpdateNotice) ((GeneratedMessageLite.b) this).instance).getData();
            }

            @Override // com.p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage.PopUpContentUpdateNoticeOrBuilder
            public ByteString getDataBytes() {
                return ((PopUpContentUpdateNotice) ((GeneratedMessageLite.b) this).instance).getDataBytes();
            }

            @Override // com.p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage.PopUpContentUpdateNoticeOrBuilder
            public String getRoomId() {
                return ((PopUpContentUpdateNotice) ((GeneratedMessageLite.b) this).instance).getRoomId();
            }

            @Override // com.p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage.PopUpContentUpdateNoticeOrBuilder
            public ByteString getRoomIdBytes() {
                return ((PopUpContentUpdateNotice) ((GeneratedMessageLite.b) this).instance).getRoomIdBytes();
            }

            @Override // com.p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage.PopUpContentUpdateNoticeOrBuilder
            public String getUpdateType() {
                return ((PopUpContentUpdateNotice) ((GeneratedMessageLite.b) this).instance).getUpdateType();
            }

            @Override // com.p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage.PopUpContentUpdateNoticeOrBuilder
            public ByteString getUpdateTypeBytes() {
                return ((PopUpContentUpdateNotice) ((GeneratedMessageLite.b) this).instance).getUpdateTypeBytes();
            }

            @Override // com.p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage.PopUpContentUpdateNoticeOrBuilder
            public String getUrl() {
                return ((PopUpContentUpdateNotice) ((GeneratedMessageLite.b) this).instance).getUrl();
            }

            @Override // com.p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage.PopUpContentUpdateNoticeOrBuilder
            public ByteString getUrlBytes() {
                return ((PopUpContentUpdateNotice) ((GeneratedMessageLite.b) this).instance).getUrlBytes();
            }

            public Builder setData(String str) {
                copyOnWrite();
                ((PopUpContentUpdateNotice) ((GeneratedMessageLite.b) this).instance).setData(str);
                return this;
            }

            public Builder setDataBytes(ByteString byteString) {
                copyOnWrite();
                ((PopUpContentUpdateNotice) ((GeneratedMessageLite.b) this).instance).setDataBytes(byteString);
                return this;
            }

            public Builder setRoomId(String str) {
                copyOnWrite();
                ((PopUpContentUpdateNotice) ((GeneratedMessageLite.b) this).instance).setRoomId(str);
                return this;
            }

            public Builder setRoomIdBytes(ByteString byteString) {
                copyOnWrite();
                ((PopUpContentUpdateNotice) ((GeneratedMessageLite.b) this).instance).setRoomIdBytes(byteString);
                return this;
            }

            public Builder setUpdateType(String str) {
                copyOnWrite();
                ((PopUpContentUpdateNotice) ((GeneratedMessageLite.b) this).instance).setUpdateType(str);
                return this;
            }

            public Builder setUpdateTypeBytes(ByteString byteString) {
                copyOnWrite();
                ((PopUpContentUpdateNotice) ((GeneratedMessageLite.b) this).instance).setUpdateTypeBytes(byteString);
                return this;
            }

            public Builder setUrl(String str) {
                copyOnWrite();
                ((PopUpContentUpdateNotice) ((GeneratedMessageLite.b) this).instance).setUrl(str);
                return this;
            }

            public Builder setUrlBytes(ByteString byteString) {
                copyOnWrite();
                ((PopUpContentUpdateNotice) ((GeneratedMessageLite.b) this).instance).setUrlBytes(byteString);
                return this;
            }
        }

        static {
            PopUpContentUpdateNotice popUpContentUpdateNotice = new PopUpContentUpdateNotice();
            DEFAULT_INSTANCE = popUpContentUpdateNotice;
            popUpContentUpdateNotice.makeImmutable();
        }

        private PopUpContentUpdateNotice() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearData() {
            this.data_ = getDefaultInstance().getData();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearRoomId() {
            this.roomId_ = getDefaultInstance().getRoomId();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearUpdateType() {
            this.updateType_ = getDefaultInstance().getUpdateType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearUrl() {
            this.url_ = getDefaultInstance().getUrl();
        }

        public static PopUpContentUpdateNotice getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder(PopUpContentUpdateNotice popUpContentUpdateNotice) {
            return (Builder) ((Builder) DEFAULT_INSTANCE.toBuilder()).mergeFrom(popUpContentUpdateNotice);
        }

        public static PopUpContentUpdateNotice parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (PopUpContentUpdateNotice) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static PopUpContentUpdateNotice parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (PopUpContentUpdateNotice) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static i860<PopUpContentUpdateNotice> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setData(String str) {
            str.getClass();
            this.data_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setDataBytes(ByteString byteString) {
            byteString.getClass();
            a.checkByteStringIsUtf8(byteString);
            this.data_ = byteString.toStringUtf8();
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
        public void setUpdateType(String str) {
            str.getClass();
            this.updateType_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setUpdateTypeBytes(ByteString byteString) {
            byteString.getClass();
            a.checkByteStringIsUtf8(byteString);
            this.updateType_ = byteString.toStringUtf8();
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
            switch (C03491.f1653xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new PopUpContentUpdateNotice();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                    return null;
                case 4:
                    return new Builder();
                case 5:
                    GeneratedMessageLite.h hVar = (GeneratedMessageLite.h) obj;
                    PopUpContentUpdateNotice popUpContentUpdateNotice = (PopUpContentUpdateNotice) obj2;
                    this.roomId_ = hVar.f(!this.roomId_.isEmpty(), this.roomId_, !popUpContentUpdateNotice.roomId_.isEmpty(), popUpContentUpdateNotice.roomId_);
                    this.url_ = hVar.f(!this.url_.isEmpty(), this.url_, !popUpContentUpdateNotice.url_.isEmpty(), popUpContentUpdateNotice.url_);
                    this.updateType_ = hVar.f(!this.updateType_.isEmpty(), this.updateType_, !popUpContentUpdateNotice.updateType_.isEmpty(), popUpContentUpdateNotice.updateType_);
                    this.data_ = hVar.f(!this.data_.isEmpty(), this.data_, true ^ popUpContentUpdateNotice.data_.isEmpty(), popUpContentUpdateNotice.data_);
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
                                    this.roomId_ = eVar.L();
                                } else if (iM == 18) {
                                    this.url_ = eVar.L();
                                } else if (iM == 26) {
                                    this.updateType_ = eVar.L();
                                } else if (iM == 34) {
                                    this.data_ = eVar.L();
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
                        synchronized (PopUpContentUpdateNotice.class) {
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

        @Override // com.p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage.PopUpContentUpdateNoticeOrBuilder
        public String getData() {
            return this.data_;
        }

        @Override // com.p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage.PopUpContentUpdateNoticeOrBuilder
        public ByteString getDataBytes() {
            return ByteString.copyFromUtf8(this.data_);
        }

        @Override // com.p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage.PopUpContentUpdateNoticeOrBuilder
        public String getRoomId() {
            return this.roomId_;
        }

        @Override // com.p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage.PopUpContentUpdateNoticeOrBuilder
        public ByteString getRoomIdBytes() {
            return ByteString.copyFromUtf8(this.roomId_);
        }

        public int getSerializedSize() {
            int i = ((GeneratedMessageLite) this).memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int iK = !this.roomId_.isEmpty() ? CodedOutputStream.K(1, getRoomId()) : 0;
            if (!this.url_.isEmpty()) {
                iK += CodedOutputStream.K(2, getUrl());
            }
            if (!this.updateType_.isEmpty()) {
                iK += CodedOutputStream.K(3, getUpdateType());
            }
            if (!this.data_.isEmpty()) {
                iK += CodedOutputStream.K(4, getData());
            }
            ((GeneratedMessageLite) this).memoizedSerializedSize = iK;
            return iK;
        }

        @Override // com.p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage.PopUpContentUpdateNoticeOrBuilder
        public String getUpdateType() {
            return this.updateType_;
        }

        @Override // com.p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage.PopUpContentUpdateNoticeOrBuilder
        public ByteString getUpdateTypeBytes() {
            return ByteString.copyFromUtf8(this.updateType_);
        }

        @Override // com.p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage.PopUpContentUpdateNoticeOrBuilder
        public String getUrl() {
            return this.url_;
        }

        @Override // com.p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage.PopUpContentUpdateNoticeOrBuilder
        public ByteString getUrlBytes() {
            return ByteString.copyFromUtf8(this.url_);
        }

        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (!this.roomId_.isEmpty()) {
                codedOutputStream.D0(1, getRoomId());
            }
            if (!this.url_.isEmpty()) {
                codedOutputStream.D0(2, getUrl());
            }
            if (!this.updateType_.isEmpty()) {
                codedOutputStream.D0(3, getUpdateType());
            }
            if (this.data_.isEmpty()) {
                return;
            }
            codedOutputStream.D0(4, getData());
        }

        public static PopUpContentUpdateNotice parseDelimitedFrom(InputStream inputStream, h hVar) throws IOException {
            return (PopUpContentUpdateNotice) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, hVar);
        }

        public static PopUpContentUpdateNotice parseFrom(ByteString byteString, h hVar) throws InvalidProtocolBufferException {
            return (PopUpContentUpdateNotice) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, hVar);
        }

        public static PopUpContentUpdateNotice parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (PopUpContentUpdateNotice) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static PopUpContentUpdateNotice parseFrom(byte[] bArr, h hVar) throws InvalidProtocolBufferException {
            return (PopUpContentUpdateNotice) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, hVar);
        }

        public static PopUpContentUpdateNotice parseFrom(InputStream inputStream) throws IOException {
            return (PopUpContentUpdateNotice) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static PopUpContentUpdateNotice parseFrom(InputStream inputStream, h hVar) throws IOException {
            return (PopUpContentUpdateNotice) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, hVar);
        }

        public static PopUpContentUpdateNotice parseFrom(e eVar) throws IOException {
            return (PopUpContentUpdateNotice) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, eVar);
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.toBuilder();
        }

        public static PopUpContentUpdateNotice parseFrom(e eVar, h hVar) throws IOException {
            return (PopUpContentUpdateNotice) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, eVar, hVar);
        }
    }

    public static final class ReceiveLiveRedPacketMsg extends GeneratedMessageLite<ReceiveLiveRedPacketMsg, Builder> implements ReceiveLiveRedPacketMsgOrBuilder {
        public static final int AMOUNT_FIELD_NUMBER = 3;
        private static final ReceiveLiveRedPacketMsg DEFAULT_INSTANCE;
        private static volatile i860<ReceiveLiveRedPacketMsg> PARSER = null;
        public static final int TEMPLATE_FIELD_NUMBER = 4;
        public static final int USERID_FIELD_NUMBER = 1;
        public static final int USERNAME_FIELD_NUMBER = 2;
        private long amount_;
        private Template.TemplateData template_;
        private String userId_ = "";
        private String userName_ = "";

        static {
            ReceiveLiveRedPacketMsg receiveLiveRedPacketMsg = new ReceiveLiveRedPacketMsg();
            DEFAULT_INSTANCE = receiveLiveRedPacketMsg;
            receiveLiveRedPacketMsg.makeImmutable();
        }

        private ReceiveLiveRedPacketMsg() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAmount() {
            this.amount_ = 0L;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearTemplate() {
            this.template_ = null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearUserId() {
            this.userId_ = getDefaultInstance().getUserId();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearUserName() {
            this.userName_ = getDefaultInstance().getUserName();
        }

        public static ReceiveLiveRedPacketMsg getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeTemplate(Template.TemplateData templateData) {
            Template.TemplateData templateData2 = this.template_;
            if (templateData2 == null || templateData2 == Template.TemplateData.getDefaultInstance()) {
                this.template_ = templateData;
            } else {
                this.template_ = (Template.TemplateData) ((Template.TemplateData.Builder) Template.TemplateData.newBuilder(this.template_).mergeFrom(templateData)).buildPartial();
            }
        }

        public static Builder newBuilder(ReceiveLiveRedPacketMsg receiveLiveRedPacketMsg) {
            return (Builder) ((Builder) DEFAULT_INSTANCE.toBuilder()).mergeFrom(receiveLiveRedPacketMsg);
        }

        public static ReceiveLiveRedPacketMsg parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (ReceiveLiveRedPacketMsg) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static ReceiveLiveRedPacketMsg parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (ReceiveLiveRedPacketMsg) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static i860<ReceiveLiveRedPacketMsg> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAmount(long j) {
            this.amount_ = j;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTemplate(Template.TemplateData.Builder builder) {
            this.template_ = (Template.TemplateData) builder.build();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setUserId(String str) {
            str.getClass();
            this.userId_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setUserIdBytes(ByteString byteString) {
            byteString.getClass();
            a.checkByteStringIsUtf8(byteString);
            this.userId_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setUserName(String str) {
            str.getClass();
            this.userName_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setUserNameBytes(ByteString byteString) {
            byteString.getClass();
            a.checkByteStringIsUtf8(byteString);
            this.userName_ = byteString.toStringUtf8();
        }

        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            boolean z = false;
            switch (C03491.f1653xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new ReceiveLiveRedPacketMsg();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                    return null;
                case 4:
                    return new Builder();
                case 5:
                    GeneratedMessageLite.h hVar = (GeneratedMessageLite.h) obj;
                    ReceiveLiveRedPacketMsg receiveLiveRedPacketMsg = (ReceiveLiveRedPacketMsg) obj2;
                    this.userId_ = hVar.f(!this.userId_.isEmpty(), this.userId_, !receiveLiveRedPacketMsg.userId_.isEmpty(), receiveLiveRedPacketMsg.userId_);
                    this.userName_ = hVar.f(!this.userName_.isEmpty(), this.userName_, !receiveLiveRedPacketMsg.userName_.isEmpty(), receiveLiveRedPacketMsg.userName_);
                    long j = this.amount_;
                    boolean z2 = j != 0;
                    long j2 = receiveLiveRedPacketMsg.amount_;
                    this.amount_ = hVar.i(z2, j, j2 != 0, j2);
                    this.template_ = hVar.o(this.template_, receiveLiveRedPacketMsg.template_);
                    GeneratedMessageLite.g gVar = GeneratedMessageLite.g.INSTANCE;
                    return this;
                case 6:
                    e eVar = (e) obj;
                    h hVar2 = (h) obj2;
                    while (!z) {
                        try {
                            int iM = eVar.M();
                            if (iM != 0) {
                                if (iM == 10) {
                                    this.userId_ = eVar.L();
                                } else if (iM == 18) {
                                    this.userName_ = eVar.L();
                                } else if (iM == 24) {
                                    this.amount_ = eVar.v();
                                } else if (iM == 34) {
                                    Template.TemplateData templateData = this.template_;
                                    Template.TemplateData.Builder builder = templateData != null ? (Template.TemplateData.Builder) templateData.toBuilder() : null;
                                    Template.TemplateData templateDataW = eVar.w(Template.TemplateData.parser(), hVar2);
                                    this.template_ = templateDataW;
                                    if (builder != null) {
                                        builder.mergeFrom(templateDataW);
                                        this.template_ = (Template.TemplateData) builder.buildPartial();
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
                        synchronized (ReceiveLiveRedPacketMsg.class) {
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

        @Override // com.p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage.ReceiveLiveRedPacketMsgOrBuilder
        public long getAmount() {
            return this.amount_;
        }

        public int getSerializedSize() {
            int i = ((GeneratedMessageLite) this).memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int iK = !this.userId_.isEmpty() ? CodedOutputStream.K(1, getUserId()) : 0;
            if (!this.userName_.isEmpty()) {
                iK += CodedOutputStream.K(2, getUserName());
            }
            long j = this.amount_;
            if (j != 0) {
                iK += CodedOutputStream.v(3, j);
            }
            if (this.template_ != null) {
                iK += CodedOutputStream.C(4, getTemplate());
            }
            ((GeneratedMessageLite) this).memoizedSerializedSize = iK;
            return iK;
        }

        @Override // com.p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage.ReceiveLiveRedPacketMsgOrBuilder
        public Template.TemplateData getTemplate() {
            Template.TemplateData templateData = this.template_;
            return templateData == null ? Template.TemplateData.getDefaultInstance() : templateData;
        }

        @Override // com.p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage.ReceiveLiveRedPacketMsgOrBuilder
        public String getUserId() {
            return this.userId_;
        }

        @Override // com.p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage.ReceiveLiveRedPacketMsgOrBuilder
        public ByteString getUserIdBytes() {
            return ByteString.copyFromUtf8(this.userId_);
        }

        @Override // com.p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage.ReceiveLiveRedPacketMsgOrBuilder
        public String getUserName() {
            return this.userName_;
        }

        @Override // com.p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage.ReceiveLiveRedPacketMsgOrBuilder
        public ByteString getUserNameBytes() {
            return ByteString.copyFromUtf8(this.userName_);
        }

        @Override // com.p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage.ReceiveLiveRedPacketMsgOrBuilder
        public boolean hasTemplate() {
            return this.template_ != null;
        }

        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (!this.userId_.isEmpty()) {
                codedOutputStream.D0(1, getUserId());
            }
            if (!this.userName_.isEmpty()) {
                codedOutputStream.D0(2, getUserName());
            }
            long j = this.amount_;
            if (j != 0) {
                codedOutputStream.u0(3, j);
            }
            if (this.template_ != null) {
                codedOutputStream.w0(4, getTemplate());
            }
        }

        public static ReceiveLiveRedPacketMsg parseDelimitedFrom(InputStream inputStream, h hVar) throws IOException {
            return (ReceiveLiveRedPacketMsg) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, hVar);
        }

        public static ReceiveLiveRedPacketMsg parseFrom(ByteString byteString, h hVar) throws InvalidProtocolBufferException {
            return (ReceiveLiveRedPacketMsg) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, hVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTemplate(Template.TemplateData templateData) {
            templateData.getClass();
            this.template_ = templateData;
        }

        public static final class Builder extends GeneratedMessageLite.b<ReceiveLiveRedPacketMsg, Builder> implements ReceiveLiveRedPacketMsgOrBuilder {
            private Builder() {
                super(ReceiveLiveRedPacketMsg.DEFAULT_INSTANCE);
            }

            public Builder clearAmount() {
                copyOnWrite();
                ((ReceiveLiveRedPacketMsg) ((GeneratedMessageLite.b) this).instance).clearAmount();
                return this;
            }

            public Builder clearTemplate() {
                copyOnWrite();
                ((ReceiveLiveRedPacketMsg) ((GeneratedMessageLite.b) this).instance).clearTemplate();
                return this;
            }

            public Builder clearUserId() {
                copyOnWrite();
                ((ReceiveLiveRedPacketMsg) ((GeneratedMessageLite.b) this).instance).clearUserId();
                return this;
            }

            public Builder clearUserName() {
                copyOnWrite();
                ((ReceiveLiveRedPacketMsg) ((GeneratedMessageLite.b) this).instance).clearUserName();
                return this;
            }

            @Override // com.p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage.ReceiveLiveRedPacketMsgOrBuilder
            public long getAmount() {
                return ((ReceiveLiveRedPacketMsg) ((GeneratedMessageLite.b) this).instance).getAmount();
            }

            @Override // com.p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage.ReceiveLiveRedPacketMsgOrBuilder
            public Template.TemplateData getTemplate() {
                return ((ReceiveLiveRedPacketMsg) ((GeneratedMessageLite.b) this).instance).getTemplate();
            }

            @Override // com.p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage.ReceiveLiveRedPacketMsgOrBuilder
            public String getUserId() {
                return ((ReceiveLiveRedPacketMsg) ((GeneratedMessageLite.b) this).instance).getUserId();
            }

            @Override // com.p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage.ReceiveLiveRedPacketMsgOrBuilder
            public ByteString getUserIdBytes() {
                return ((ReceiveLiveRedPacketMsg) ((GeneratedMessageLite.b) this).instance).getUserIdBytes();
            }

            @Override // com.p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage.ReceiveLiveRedPacketMsgOrBuilder
            public String getUserName() {
                return ((ReceiveLiveRedPacketMsg) ((GeneratedMessageLite.b) this).instance).getUserName();
            }

            @Override // com.p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage.ReceiveLiveRedPacketMsgOrBuilder
            public ByteString getUserNameBytes() {
                return ((ReceiveLiveRedPacketMsg) ((GeneratedMessageLite.b) this).instance).getUserNameBytes();
            }

            @Override // com.p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage.ReceiveLiveRedPacketMsgOrBuilder
            public boolean hasTemplate() {
                return ((ReceiveLiveRedPacketMsg) ((GeneratedMessageLite.b) this).instance).hasTemplate();
            }

            public Builder mergeTemplate(Template.TemplateData templateData) {
                copyOnWrite();
                ((ReceiveLiveRedPacketMsg) ((GeneratedMessageLite.b) this).instance).mergeTemplate(templateData);
                return this;
            }

            public Builder setAmount(long j) {
                copyOnWrite();
                ((ReceiveLiveRedPacketMsg) ((GeneratedMessageLite.b) this).instance).setAmount(j);
                return this;
            }

            public Builder setTemplate(Template.TemplateData templateData) {
                copyOnWrite();
                ((ReceiveLiveRedPacketMsg) ((GeneratedMessageLite.b) this).instance).setTemplate(templateData);
                return this;
            }

            public Builder setUserId(String str) {
                copyOnWrite();
                ((ReceiveLiveRedPacketMsg) ((GeneratedMessageLite.b) this).instance).setUserId(str);
                return this;
            }

            public Builder setUserIdBytes(ByteString byteString) {
                copyOnWrite();
                ((ReceiveLiveRedPacketMsg) ((GeneratedMessageLite.b) this).instance).setUserIdBytes(byteString);
                return this;
            }

            public Builder setUserName(String str) {
                copyOnWrite();
                ((ReceiveLiveRedPacketMsg) ((GeneratedMessageLite.b) this).instance).setUserName(str);
                return this;
            }

            public Builder setUserNameBytes(ByteString byteString) {
                copyOnWrite();
                ((ReceiveLiveRedPacketMsg) ((GeneratedMessageLite.b) this).instance).setUserNameBytes(byteString);
                return this;
            }

            public Builder setTemplate(Template.TemplateData.Builder builder) {
                copyOnWrite();
                ((ReceiveLiveRedPacketMsg) ((GeneratedMessageLite.b) this).instance).setTemplate(builder);
                return this;
            }
        }

        public static ReceiveLiveRedPacketMsg parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (ReceiveLiveRedPacketMsg) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static ReceiveLiveRedPacketMsg parseFrom(byte[] bArr, h hVar) throws InvalidProtocolBufferException {
            return (ReceiveLiveRedPacketMsg) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, hVar);
        }

        public static ReceiveLiveRedPacketMsg parseFrom(InputStream inputStream) throws IOException {
            return (ReceiveLiveRedPacketMsg) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static ReceiveLiveRedPacketMsg parseFrom(InputStream inputStream, h hVar) throws IOException {
            return (ReceiveLiveRedPacketMsg) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, hVar);
        }

        public static ReceiveLiveRedPacketMsg parseFrom(e eVar) throws IOException {
            return (ReceiveLiveRedPacketMsg) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, eVar);
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.toBuilder();
        }

        public static ReceiveLiveRedPacketMsg parseFrom(e eVar, h hVar) throws IOException {
            return (ReceiveLiveRedPacketMsg) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, eVar, hVar);
        }
    }

    public static final class SendLiveRedPacketMsg extends GeneratedMessageLite<SendLiveRedPacketMsg, Builder> implements SendLiveRedPacketMsgOrBuilder {
        private static final SendLiveRedPacketMsg DEFAULT_INSTANCE;
        public static final int NUMBEROFPACKETS_FIELD_NUMBER = 4;
        private static volatile i860<SendLiveRedPacketMsg> PARSER = null;
        public static final int REDPACKETID_FIELD_NUMBER = 2;
        public static final int SENDUSERID_FIELD_NUMBER = 1;
        public static final int TEMPLATE_FIELD_NUMBER = 5;
        public static final int TOKEN_FIELD_NUMBER = 3;
        private long numberOfPackets_;
        private Template.TemplateData template_;
        private String sendUserID_ = "";
        private String redPacketID_ = "";
        private String token_ = "";

        static {
            SendLiveRedPacketMsg sendLiveRedPacketMsg = new SendLiveRedPacketMsg();
            DEFAULT_INSTANCE = sendLiveRedPacketMsg;
            sendLiveRedPacketMsg.makeImmutable();
        }

        private SendLiveRedPacketMsg() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearNumberOfPackets() {
            this.numberOfPackets_ = 0L;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearRedPacketID() {
            this.redPacketID_ = getDefaultInstance().getRedPacketID();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearSendUserID() {
            this.sendUserID_ = getDefaultInstance().getSendUserID();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearTemplate() {
            this.template_ = null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearToken() {
            this.token_ = getDefaultInstance().getToken();
        }

        public static SendLiveRedPacketMsg getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeTemplate(Template.TemplateData templateData) {
            Template.TemplateData templateData2 = this.template_;
            if (templateData2 == null || templateData2 == Template.TemplateData.getDefaultInstance()) {
                this.template_ = templateData;
            } else {
                this.template_ = (Template.TemplateData) ((Template.TemplateData.Builder) Template.TemplateData.newBuilder(this.template_).mergeFrom(templateData)).buildPartial();
            }
        }

        public static Builder newBuilder(SendLiveRedPacketMsg sendLiveRedPacketMsg) {
            return (Builder) ((Builder) DEFAULT_INSTANCE.toBuilder()).mergeFrom(sendLiveRedPacketMsg);
        }

        public static SendLiveRedPacketMsg parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (SendLiveRedPacketMsg) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static SendLiveRedPacketMsg parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (SendLiveRedPacketMsg) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static i860<SendLiveRedPacketMsg> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setNumberOfPackets(long j) {
            this.numberOfPackets_ = j;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setRedPacketID(String str) {
            str.getClass();
            this.redPacketID_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setRedPacketIDBytes(ByteString byteString) {
            byteString.getClass();
            a.checkByteStringIsUtf8(byteString);
            this.redPacketID_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSendUserID(String str) {
            str.getClass();
            this.sendUserID_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSendUserIDBytes(ByteString byteString) {
            byteString.getClass();
            a.checkByteStringIsUtf8(byteString);
            this.sendUserID_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTemplate(Template.TemplateData.Builder builder) {
            this.template_ = (Template.TemplateData) builder.build();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setToken(String str) {
            str.getClass();
            this.token_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTokenBytes(ByteString byteString) {
            byteString.getClass();
            a.checkByteStringIsUtf8(byteString);
            this.token_ = byteString.toStringUtf8();
        }

        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            boolean z = false;
            switch (C03491.f1653xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new SendLiveRedPacketMsg();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                    return null;
                case 4:
                    return new Builder();
                case 5:
                    GeneratedMessageLite.h hVar = (GeneratedMessageLite.h) obj;
                    SendLiveRedPacketMsg sendLiveRedPacketMsg = (SendLiveRedPacketMsg) obj2;
                    this.sendUserID_ = hVar.f(!this.sendUserID_.isEmpty(), this.sendUserID_, !sendLiveRedPacketMsg.sendUserID_.isEmpty(), sendLiveRedPacketMsg.sendUserID_);
                    this.redPacketID_ = hVar.f(!this.redPacketID_.isEmpty(), this.redPacketID_, !sendLiveRedPacketMsg.redPacketID_.isEmpty(), sendLiveRedPacketMsg.redPacketID_);
                    this.token_ = hVar.f(!this.token_.isEmpty(), this.token_, !sendLiveRedPacketMsg.token_.isEmpty(), sendLiveRedPacketMsg.token_);
                    long j = this.numberOfPackets_;
                    boolean z2 = j != 0;
                    long j2 = sendLiveRedPacketMsg.numberOfPackets_;
                    this.numberOfPackets_ = hVar.i(z2, j, j2 != 0, j2);
                    this.template_ = hVar.o(this.template_, sendLiveRedPacketMsg.template_);
                    GeneratedMessageLite.g gVar = GeneratedMessageLite.g.INSTANCE;
                    return this;
                case 6:
                    e eVar = (e) obj;
                    h hVar2 = (h) obj2;
                    while (!z) {
                        try {
                            int iM = eVar.M();
                            if (iM != 0) {
                                if (iM == 10) {
                                    this.sendUserID_ = eVar.L();
                                } else if (iM == 18) {
                                    this.redPacketID_ = eVar.L();
                                } else if (iM == 26) {
                                    this.token_ = eVar.L();
                                } else if (iM == 32) {
                                    this.numberOfPackets_ = eVar.v();
                                } else if (iM == 42) {
                                    Template.TemplateData templateData = this.template_;
                                    Template.TemplateData.Builder builder = templateData != null ? (Template.TemplateData.Builder) templateData.toBuilder() : null;
                                    Template.TemplateData templateDataW = eVar.w(Template.TemplateData.parser(), hVar2);
                                    this.template_ = templateDataW;
                                    if (builder != null) {
                                        builder.mergeFrom(templateDataW);
                                        this.template_ = (Template.TemplateData) builder.buildPartial();
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
                        synchronized (SendLiveRedPacketMsg.class) {
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

        @Override // com.p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage.SendLiveRedPacketMsgOrBuilder
        public long getNumberOfPackets() {
            return this.numberOfPackets_;
        }

        @Override // com.p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage.SendLiveRedPacketMsgOrBuilder
        public String getRedPacketID() {
            return this.redPacketID_;
        }

        @Override // com.p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage.SendLiveRedPacketMsgOrBuilder
        public ByteString getRedPacketIDBytes() {
            return ByteString.copyFromUtf8(this.redPacketID_);
        }

        @Override // com.p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage.SendLiveRedPacketMsgOrBuilder
        public String getSendUserID() {
            return this.sendUserID_;
        }

        @Override // com.p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage.SendLiveRedPacketMsgOrBuilder
        public ByteString getSendUserIDBytes() {
            return ByteString.copyFromUtf8(this.sendUserID_);
        }

        public int getSerializedSize() {
            int i = ((GeneratedMessageLite) this).memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int iK = !this.sendUserID_.isEmpty() ? CodedOutputStream.K(1, getSendUserID()) : 0;
            if (!this.redPacketID_.isEmpty()) {
                iK += CodedOutputStream.K(2, getRedPacketID());
            }
            if (!this.token_.isEmpty()) {
                iK += CodedOutputStream.K(3, getToken());
            }
            long j = this.numberOfPackets_;
            if (j != 0) {
                iK += CodedOutputStream.v(4, j);
            }
            if (this.template_ != null) {
                iK += CodedOutputStream.C(5, getTemplate());
            }
            ((GeneratedMessageLite) this).memoizedSerializedSize = iK;
            return iK;
        }

        @Override // com.p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage.SendLiveRedPacketMsgOrBuilder
        public Template.TemplateData getTemplate() {
            Template.TemplateData templateData = this.template_;
            return templateData == null ? Template.TemplateData.getDefaultInstance() : templateData;
        }

        @Override // com.p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage.SendLiveRedPacketMsgOrBuilder
        public String getToken() {
            return this.token_;
        }

        @Override // com.p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage.SendLiveRedPacketMsgOrBuilder
        public ByteString getTokenBytes() {
            return ByteString.copyFromUtf8(this.token_);
        }

        @Override // com.p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage.SendLiveRedPacketMsgOrBuilder
        public boolean hasTemplate() {
            return this.template_ != null;
        }

        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (!this.sendUserID_.isEmpty()) {
                codedOutputStream.D0(1, getSendUserID());
            }
            if (!this.redPacketID_.isEmpty()) {
                codedOutputStream.D0(2, getRedPacketID());
            }
            if (!this.token_.isEmpty()) {
                codedOutputStream.D0(3, getToken());
            }
            long j = this.numberOfPackets_;
            if (j != 0) {
                codedOutputStream.u0(4, j);
            }
            if (this.template_ != null) {
                codedOutputStream.w0(5, getTemplate());
            }
        }

        public static SendLiveRedPacketMsg parseDelimitedFrom(InputStream inputStream, h hVar) throws IOException {
            return (SendLiveRedPacketMsg) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, hVar);
        }

        public static SendLiveRedPacketMsg parseFrom(ByteString byteString, h hVar) throws InvalidProtocolBufferException {
            return (SendLiveRedPacketMsg) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, hVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTemplate(Template.TemplateData templateData) {
            templateData.getClass();
            this.template_ = templateData;
        }

        public static final class Builder extends GeneratedMessageLite.b<SendLiveRedPacketMsg, Builder> implements SendLiveRedPacketMsgOrBuilder {
            private Builder() {
                super(SendLiveRedPacketMsg.DEFAULT_INSTANCE);
            }

            public Builder clearNumberOfPackets() {
                copyOnWrite();
                ((SendLiveRedPacketMsg) ((GeneratedMessageLite.b) this).instance).clearNumberOfPackets();
                return this;
            }

            public Builder clearRedPacketID() {
                copyOnWrite();
                ((SendLiveRedPacketMsg) ((GeneratedMessageLite.b) this).instance).clearRedPacketID();
                return this;
            }

            public Builder clearSendUserID() {
                copyOnWrite();
                ((SendLiveRedPacketMsg) ((GeneratedMessageLite.b) this).instance).clearSendUserID();
                return this;
            }

            public Builder clearTemplate() {
                copyOnWrite();
                ((SendLiveRedPacketMsg) ((GeneratedMessageLite.b) this).instance).clearTemplate();
                return this;
            }

            public Builder clearToken() {
                copyOnWrite();
                ((SendLiveRedPacketMsg) ((GeneratedMessageLite.b) this).instance).clearToken();
                return this;
            }

            @Override // com.p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage.SendLiveRedPacketMsgOrBuilder
            public long getNumberOfPackets() {
                return ((SendLiveRedPacketMsg) ((GeneratedMessageLite.b) this).instance).getNumberOfPackets();
            }

            @Override // com.p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage.SendLiveRedPacketMsgOrBuilder
            public String getRedPacketID() {
                return ((SendLiveRedPacketMsg) ((GeneratedMessageLite.b) this).instance).getRedPacketID();
            }

            @Override // com.p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage.SendLiveRedPacketMsgOrBuilder
            public ByteString getRedPacketIDBytes() {
                return ((SendLiveRedPacketMsg) ((GeneratedMessageLite.b) this).instance).getRedPacketIDBytes();
            }

            @Override // com.p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage.SendLiveRedPacketMsgOrBuilder
            public String getSendUserID() {
                return ((SendLiveRedPacketMsg) ((GeneratedMessageLite.b) this).instance).getSendUserID();
            }

            @Override // com.p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage.SendLiveRedPacketMsgOrBuilder
            public ByteString getSendUserIDBytes() {
                return ((SendLiveRedPacketMsg) ((GeneratedMessageLite.b) this).instance).getSendUserIDBytes();
            }

            @Override // com.p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage.SendLiveRedPacketMsgOrBuilder
            public Template.TemplateData getTemplate() {
                return ((SendLiveRedPacketMsg) ((GeneratedMessageLite.b) this).instance).getTemplate();
            }

            @Override // com.p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage.SendLiveRedPacketMsgOrBuilder
            public String getToken() {
                return ((SendLiveRedPacketMsg) ((GeneratedMessageLite.b) this).instance).getToken();
            }

            @Override // com.p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage.SendLiveRedPacketMsgOrBuilder
            public ByteString getTokenBytes() {
                return ((SendLiveRedPacketMsg) ((GeneratedMessageLite.b) this).instance).getTokenBytes();
            }

            @Override // com.p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage.SendLiveRedPacketMsgOrBuilder
            public boolean hasTemplate() {
                return ((SendLiveRedPacketMsg) ((GeneratedMessageLite.b) this).instance).hasTemplate();
            }

            public Builder mergeTemplate(Template.TemplateData templateData) {
                copyOnWrite();
                ((SendLiveRedPacketMsg) ((GeneratedMessageLite.b) this).instance).mergeTemplate(templateData);
                return this;
            }

            public Builder setNumberOfPackets(long j) {
                copyOnWrite();
                ((SendLiveRedPacketMsg) ((GeneratedMessageLite.b) this).instance).setNumberOfPackets(j);
                return this;
            }

            public Builder setRedPacketID(String str) {
                copyOnWrite();
                ((SendLiveRedPacketMsg) ((GeneratedMessageLite.b) this).instance).setRedPacketID(str);
                return this;
            }

            public Builder setRedPacketIDBytes(ByteString byteString) {
                copyOnWrite();
                ((SendLiveRedPacketMsg) ((GeneratedMessageLite.b) this).instance).setRedPacketIDBytes(byteString);
                return this;
            }

            public Builder setSendUserID(String str) {
                copyOnWrite();
                ((SendLiveRedPacketMsg) ((GeneratedMessageLite.b) this).instance).setSendUserID(str);
                return this;
            }

            public Builder setSendUserIDBytes(ByteString byteString) {
                copyOnWrite();
                ((SendLiveRedPacketMsg) ((GeneratedMessageLite.b) this).instance).setSendUserIDBytes(byteString);
                return this;
            }

            public Builder setTemplate(Template.TemplateData templateData) {
                copyOnWrite();
                ((SendLiveRedPacketMsg) ((GeneratedMessageLite.b) this).instance).setTemplate(templateData);
                return this;
            }

            public Builder setToken(String str) {
                copyOnWrite();
                ((SendLiveRedPacketMsg) ((GeneratedMessageLite.b) this).instance).setToken(str);
                return this;
            }

            public Builder setTokenBytes(ByteString byteString) {
                copyOnWrite();
                ((SendLiveRedPacketMsg) ((GeneratedMessageLite.b) this).instance).setTokenBytes(byteString);
                return this;
            }

            public Builder setTemplate(Template.TemplateData.Builder builder) {
                copyOnWrite();
                ((SendLiveRedPacketMsg) ((GeneratedMessageLite.b) this).instance).setTemplate(builder);
                return this;
            }
        }

        public static SendLiveRedPacketMsg parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (SendLiveRedPacketMsg) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static SendLiveRedPacketMsg parseFrom(byte[] bArr, h hVar) throws InvalidProtocolBufferException {
            return (SendLiveRedPacketMsg) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, hVar);
        }

        public static SendLiveRedPacketMsg parseFrom(InputStream inputStream) throws IOException {
            return (SendLiveRedPacketMsg) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static SendLiveRedPacketMsg parseFrom(InputStream inputStream, h hVar) throws IOException {
            return (SendLiveRedPacketMsg) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, hVar);
        }

        public static SendLiveRedPacketMsg parseFrom(e eVar) throws IOException {
            return (SendLiveRedPacketMsg) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, eVar);
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.toBuilder();
        }

        public static SendLiveRedPacketMsg parseFrom(e eVar, h hVar) throws IOException {
            return (SendLiveRedPacketMsg) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, eVar, hVar);
        }
    }

    public static final class Shading extends GeneratedMessageLite<Shading, Builder> implements ShadingOrBuilder {
        private static final Shading DEFAULT_INSTANCE;
        public static final int ENDCOLOR_FIELD_NUMBER = 2;
        public static final int IMAGEURL_FIELD_NUMBER = 3;
        private static volatile i860<Shading> PARSER = null;
        public static final int SHADINGTYPE_FIELD_NUMBER = 5;
        public static final int STARTCOLOR_FIELD_NUMBER = 1;
        public static final int TRANSPARENCY_FIELD_NUMBER = 4;
        private long transparency_;
        private String startColor_ = "";
        private String endColor_ = "";
        private String imageUrl_ = "";
        private String shadingType_ = "";

        public static final class Builder extends GeneratedMessageLite.b<Shading, Builder> implements ShadingOrBuilder {
            private Builder() {
                super(Shading.DEFAULT_INSTANCE);
            }

            public Builder clearEndColor() {
                copyOnWrite();
                ((Shading) ((GeneratedMessageLite.b) this).instance).clearEndColor();
                return this;
            }

            public Builder clearImageUrl() {
                copyOnWrite();
                ((Shading) ((GeneratedMessageLite.b) this).instance).clearImageUrl();
                return this;
            }

            public Builder clearShadingType() {
                copyOnWrite();
                ((Shading) ((GeneratedMessageLite.b) this).instance).clearShadingType();
                return this;
            }

            public Builder clearStartColor() {
                copyOnWrite();
                ((Shading) ((GeneratedMessageLite.b) this).instance).clearStartColor();
                return this;
            }

            public Builder clearTransparency() {
                copyOnWrite();
                ((Shading) ((GeneratedMessageLite.b) this).instance).clearTransparency();
                return this;
            }

            @Override // com.p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage.ShadingOrBuilder
            public String getEndColor() {
                return ((Shading) ((GeneratedMessageLite.b) this).instance).getEndColor();
            }

            @Override // com.p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage.ShadingOrBuilder
            public ByteString getEndColorBytes() {
                return ((Shading) ((GeneratedMessageLite.b) this).instance).getEndColorBytes();
            }

            @Override // com.p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage.ShadingOrBuilder
            public String getImageUrl() {
                return ((Shading) ((GeneratedMessageLite.b) this).instance).getImageUrl();
            }

            @Override // com.p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage.ShadingOrBuilder
            public ByteString getImageUrlBytes() {
                return ((Shading) ((GeneratedMessageLite.b) this).instance).getImageUrlBytes();
            }

            @Override // com.p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage.ShadingOrBuilder
            public String getShadingType() {
                return ((Shading) ((GeneratedMessageLite.b) this).instance).getShadingType();
            }

            @Override // com.p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage.ShadingOrBuilder
            public ByteString getShadingTypeBytes() {
                return ((Shading) ((GeneratedMessageLite.b) this).instance).getShadingTypeBytes();
            }

            @Override // com.p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage.ShadingOrBuilder
            public String getStartColor() {
                return ((Shading) ((GeneratedMessageLite.b) this).instance).getStartColor();
            }

            @Override // com.p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage.ShadingOrBuilder
            public ByteString getStartColorBytes() {
                return ((Shading) ((GeneratedMessageLite.b) this).instance).getStartColorBytes();
            }

            @Override // com.p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage.ShadingOrBuilder
            public long getTransparency() {
                return ((Shading) ((GeneratedMessageLite.b) this).instance).getTransparency();
            }

            public Builder setEndColor(String str) {
                copyOnWrite();
                ((Shading) ((GeneratedMessageLite.b) this).instance).setEndColor(str);
                return this;
            }

            public Builder setEndColorBytes(ByteString byteString) {
                copyOnWrite();
                ((Shading) ((GeneratedMessageLite.b) this).instance).setEndColorBytes(byteString);
                return this;
            }

            public Builder setImageUrl(String str) {
                copyOnWrite();
                ((Shading) ((GeneratedMessageLite.b) this).instance).setImageUrl(str);
                return this;
            }

            public Builder setImageUrlBytes(ByteString byteString) {
                copyOnWrite();
                ((Shading) ((GeneratedMessageLite.b) this).instance).setImageUrlBytes(byteString);
                return this;
            }

            public Builder setShadingType(String str) {
                copyOnWrite();
                ((Shading) ((GeneratedMessageLite.b) this).instance).setShadingType(str);
                return this;
            }

            public Builder setShadingTypeBytes(ByteString byteString) {
                copyOnWrite();
                ((Shading) ((GeneratedMessageLite.b) this).instance).setShadingTypeBytes(byteString);
                return this;
            }

            public Builder setStartColor(String str) {
                copyOnWrite();
                ((Shading) ((GeneratedMessageLite.b) this).instance).setStartColor(str);
                return this;
            }

            public Builder setStartColorBytes(ByteString byteString) {
                copyOnWrite();
                ((Shading) ((GeneratedMessageLite.b) this).instance).setStartColorBytes(byteString);
                return this;
            }

            public Builder setTransparency(long j) {
                copyOnWrite();
                ((Shading) ((GeneratedMessageLite.b) this).instance).setTransparency(j);
                return this;
            }
        }

        static {
            Shading shading = new Shading();
            DEFAULT_INSTANCE = shading;
            shading.makeImmutable();
        }

        private Shading() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearEndColor() {
            this.endColor_ = getDefaultInstance().getEndColor();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearImageUrl() {
            this.imageUrl_ = getDefaultInstance().getImageUrl();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearShadingType() {
            this.shadingType_ = getDefaultInstance().getShadingType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearStartColor() {
            this.startColor_ = getDefaultInstance().getStartColor();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearTransparency() {
            this.transparency_ = 0L;
        }

        public static Shading getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder(Shading shading) {
            return (Builder) ((Builder) DEFAULT_INSTANCE.toBuilder()).mergeFrom(shading);
        }

        public static Shading parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (Shading) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Shading parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (Shading) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static i860<Shading> parser() {
            return DEFAULT_INSTANCE.getParserForType();
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
        public void setImageUrl(String str) {
            str.getClass();
            this.imageUrl_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setImageUrlBytes(ByteString byteString) {
            byteString.getClass();
            a.checkByteStringIsUtf8(byteString);
            this.imageUrl_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setShadingType(String str) {
            str.getClass();
            this.shadingType_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setShadingTypeBytes(ByteString byteString) {
            byteString.getClass();
            a.checkByteStringIsUtf8(byteString);
            this.shadingType_ = byteString.toStringUtf8();
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
        public void setTransparency(long j) {
            this.transparency_ = j;
        }

        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            boolean z = false;
            switch (C03491.f1653xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new Shading();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                    return null;
                case 4:
                    return new Builder();
                case 5:
                    GeneratedMessageLite.h hVar = (GeneratedMessageLite.h) obj;
                    Shading shading = (Shading) obj2;
                    this.startColor_ = hVar.f(!this.startColor_.isEmpty(), this.startColor_, !shading.startColor_.isEmpty(), shading.startColor_);
                    this.endColor_ = hVar.f(!this.endColor_.isEmpty(), this.endColor_, !shading.endColor_.isEmpty(), shading.endColor_);
                    this.imageUrl_ = hVar.f(!this.imageUrl_.isEmpty(), this.imageUrl_, !shading.imageUrl_.isEmpty(), shading.imageUrl_);
                    long j = this.transparency_;
                    boolean z2 = j != 0;
                    long j2 = shading.transparency_;
                    this.transparency_ = hVar.i(z2, j, j2 != 0, j2);
                    this.shadingType_ = hVar.f(!this.shadingType_.isEmpty(), this.shadingType_, !shading.shadingType_.isEmpty(), shading.shadingType_);
                    GeneratedMessageLite.g gVar = GeneratedMessageLite.g.INSTANCE;
                    return this;
                case 6:
                    e eVar = (e) obj;
                    while (!z) {
                        try {
                            int iM = eVar.M();
                            if (iM != 0) {
                                if (iM == 10) {
                                    this.startColor_ = eVar.L();
                                } else if (iM == 18) {
                                    this.endColor_ = eVar.L();
                                } else if (iM == 26) {
                                    this.imageUrl_ = eVar.L();
                                } else if (iM == 32) {
                                    this.transparency_ = eVar.v();
                                } else if (iM == 42) {
                                    this.shadingType_ = eVar.L();
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
                        synchronized (Shading.class) {
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

        @Override // com.p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage.ShadingOrBuilder
        public String getEndColor() {
            return this.endColor_;
        }

        @Override // com.p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage.ShadingOrBuilder
        public ByteString getEndColorBytes() {
            return ByteString.copyFromUtf8(this.endColor_);
        }

        @Override // com.p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage.ShadingOrBuilder
        public String getImageUrl() {
            return this.imageUrl_;
        }

        @Override // com.p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage.ShadingOrBuilder
        public ByteString getImageUrlBytes() {
            return ByteString.copyFromUtf8(this.imageUrl_);
        }

        public int getSerializedSize() {
            int i = ((GeneratedMessageLite) this).memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int iK = !this.startColor_.isEmpty() ? CodedOutputStream.K(1, getStartColor()) : 0;
            if (!this.endColor_.isEmpty()) {
                iK += CodedOutputStream.K(2, getEndColor());
            }
            if (!this.imageUrl_.isEmpty()) {
                iK += CodedOutputStream.K(3, getImageUrl());
            }
            long j = this.transparency_;
            if (j != 0) {
                iK += CodedOutputStream.v(4, j);
            }
            if (!this.shadingType_.isEmpty()) {
                iK += CodedOutputStream.K(5, getShadingType());
            }
            ((GeneratedMessageLite) this).memoizedSerializedSize = iK;
            return iK;
        }

        @Override // com.p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage.ShadingOrBuilder
        public String getShadingType() {
            return this.shadingType_;
        }

        @Override // com.p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage.ShadingOrBuilder
        public ByteString getShadingTypeBytes() {
            return ByteString.copyFromUtf8(this.shadingType_);
        }

        @Override // com.p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage.ShadingOrBuilder
        public String getStartColor() {
            return this.startColor_;
        }

        @Override // com.p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage.ShadingOrBuilder
        public ByteString getStartColorBytes() {
            return ByteString.copyFromUtf8(this.startColor_);
        }

        @Override // com.p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage.ShadingOrBuilder
        public long getTransparency() {
            return this.transparency_;
        }

        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (!this.startColor_.isEmpty()) {
                codedOutputStream.D0(1, getStartColor());
            }
            if (!this.endColor_.isEmpty()) {
                codedOutputStream.D0(2, getEndColor());
            }
            if (!this.imageUrl_.isEmpty()) {
                codedOutputStream.D0(3, getImageUrl());
            }
            long j = this.transparency_;
            if (j != 0) {
                codedOutputStream.u0(4, j);
            }
            if (this.shadingType_.isEmpty()) {
                return;
            }
            codedOutputStream.D0(5, getShadingType());
        }

        public static Shading parseDelimitedFrom(InputStream inputStream, h hVar) throws IOException {
            return (Shading) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, hVar);
        }

        public static Shading parseFrom(ByteString byteString, h hVar) throws InvalidProtocolBufferException {
            return (Shading) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, hVar);
        }

        public static Shading parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (Shading) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static Shading parseFrom(byte[] bArr, h hVar) throws InvalidProtocolBufferException {
            return (Shading) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, hVar);
        }

        public static Shading parseFrom(InputStream inputStream) throws IOException {
            return (Shading) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Shading parseFrom(InputStream inputStream, h hVar) throws IOException {
            return (Shading) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, hVar);
        }

        public static Shading parseFrom(e eVar) throws IOException {
            return (Shading) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, eVar);
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.toBuilder();
        }

        public static Shading parseFrom(e eVar, h hVar) throws IOException {
            return (Shading) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, eVar, hVar);
        }
    }

    public static final class SvgaEffectExtra extends GeneratedMessageLite<SvgaEffectExtra, Builder> implements SvgaEffectExtraOrBuilder {
        private static final SvgaEffectExtra DEFAULT_INSTANCE;
        public static final int ID_FIELD_NUMBER = 1;
        private static volatile i860<SvgaEffectExtra> PARSER = null;
        public static final int TEXTCOLOR_FIELD_NUMBER = 5;
        public static final int TEXTSIZE_FIELD_NUMBER = 4;
        public static final int TYPE_FIELD_NUMBER = 2;
        public static final int VALUE_FIELD_NUMBER = 3;
        private long textSize_;
        private long type_;
        private String id_ = "";
        private String value_ = "";
        private String textColor_ = "";

        public static final class Builder extends GeneratedMessageLite.b<SvgaEffectExtra, Builder> implements SvgaEffectExtraOrBuilder {
            private Builder() {
                super(SvgaEffectExtra.DEFAULT_INSTANCE);
            }

            public Builder clearId() {
                copyOnWrite();
                ((SvgaEffectExtra) ((GeneratedMessageLite.b) this).instance).clearId();
                return this;
            }

            public Builder clearTextColor() {
                copyOnWrite();
                ((SvgaEffectExtra) ((GeneratedMessageLite.b) this).instance).clearTextColor();
                return this;
            }

            public Builder clearTextSize() {
                copyOnWrite();
                ((SvgaEffectExtra) ((GeneratedMessageLite.b) this).instance).clearTextSize();
                return this;
            }

            public Builder clearType() {
                copyOnWrite();
                ((SvgaEffectExtra) ((GeneratedMessageLite.b) this).instance).clearType();
                return this;
            }

            public Builder clearValue() {
                copyOnWrite();
                ((SvgaEffectExtra) ((GeneratedMessageLite.b) this).instance).clearValue();
                return this;
            }

            @Override // com.p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage.SvgaEffectExtraOrBuilder
            public String getId() {
                return ((SvgaEffectExtra) ((GeneratedMessageLite.b) this).instance).getId();
            }

            @Override // com.p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage.SvgaEffectExtraOrBuilder
            public ByteString getIdBytes() {
                return ((SvgaEffectExtra) ((GeneratedMessageLite.b) this).instance).getIdBytes();
            }

            @Override // com.p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage.SvgaEffectExtraOrBuilder
            public String getTextColor() {
                return ((SvgaEffectExtra) ((GeneratedMessageLite.b) this).instance).getTextColor();
            }

            @Override // com.p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage.SvgaEffectExtraOrBuilder
            public ByteString getTextColorBytes() {
                return ((SvgaEffectExtra) ((GeneratedMessageLite.b) this).instance).getTextColorBytes();
            }

            @Override // com.p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage.SvgaEffectExtraOrBuilder
            public long getTextSize() {
                return ((SvgaEffectExtra) ((GeneratedMessageLite.b) this).instance).getTextSize();
            }

            @Override // com.p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage.SvgaEffectExtraOrBuilder
            public long getType() {
                return ((SvgaEffectExtra) ((GeneratedMessageLite.b) this).instance).getType();
            }

            @Override // com.p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage.SvgaEffectExtraOrBuilder
            public String getValue() {
                return ((SvgaEffectExtra) ((GeneratedMessageLite.b) this).instance).getValue();
            }

            @Override // com.p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage.SvgaEffectExtraOrBuilder
            public ByteString getValueBytes() {
                return ((SvgaEffectExtra) ((GeneratedMessageLite.b) this).instance).getValueBytes();
            }

            public Builder setId(String str) {
                copyOnWrite();
                ((SvgaEffectExtra) ((GeneratedMessageLite.b) this).instance).setId(str);
                return this;
            }

            public Builder setIdBytes(ByteString byteString) {
                copyOnWrite();
                ((SvgaEffectExtra) ((GeneratedMessageLite.b) this).instance).setIdBytes(byteString);
                return this;
            }

            public Builder setTextColor(String str) {
                copyOnWrite();
                ((SvgaEffectExtra) ((GeneratedMessageLite.b) this).instance).setTextColor(str);
                return this;
            }

            public Builder setTextColorBytes(ByteString byteString) {
                copyOnWrite();
                ((SvgaEffectExtra) ((GeneratedMessageLite.b) this).instance).setTextColorBytes(byteString);
                return this;
            }

            public Builder setTextSize(long j) {
                copyOnWrite();
                ((SvgaEffectExtra) ((GeneratedMessageLite.b) this).instance).setTextSize(j);
                return this;
            }

            public Builder setType(long j) {
                copyOnWrite();
                ((SvgaEffectExtra) ((GeneratedMessageLite.b) this).instance).setType(j);
                return this;
            }

            public Builder setValue(String str) {
                copyOnWrite();
                ((SvgaEffectExtra) ((GeneratedMessageLite.b) this).instance).setValue(str);
                return this;
            }

            public Builder setValueBytes(ByteString byteString) {
                copyOnWrite();
                ((SvgaEffectExtra) ((GeneratedMessageLite.b) this).instance).setValueBytes(byteString);
                return this;
            }
        }

        static {
            SvgaEffectExtra svgaEffectExtra = new SvgaEffectExtra();
            DEFAULT_INSTANCE = svgaEffectExtra;
            svgaEffectExtra.makeImmutable();
        }

        private SvgaEffectExtra() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearId() {
            this.id_ = getDefaultInstance().getId();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearTextColor() {
            this.textColor_ = getDefaultInstance().getTextColor();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearTextSize() {
            this.textSize_ = 0L;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearType() {
            this.type_ = 0L;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearValue() {
            this.value_ = getDefaultInstance().getValue();
        }

        public static SvgaEffectExtra getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder(SvgaEffectExtra svgaEffectExtra) {
            return (Builder) ((Builder) DEFAULT_INSTANCE.toBuilder()).mergeFrom(svgaEffectExtra);
        }

        public static SvgaEffectExtra parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (SvgaEffectExtra) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static SvgaEffectExtra parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (SvgaEffectExtra) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static i860<SvgaEffectExtra> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setId(String str) {
            str.getClass();
            this.id_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setIdBytes(ByteString byteString) {
            byteString.getClass();
            a.checkByteStringIsUtf8(byteString);
            this.id_ = byteString.toStringUtf8();
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
        public void setTextSize(long j) {
            this.textSize_ = j;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setType(long j) {
            this.type_ = j;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setValue(String str) {
            str.getClass();
            this.value_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setValueBytes(ByteString byteString) {
            byteString.getClass();
            a.checkByteStringIsUtf8(byteString);
            this.value_ = byteString.toStringUtf8();
        }

        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            boolean z = false;
            switch (C03491.f1653xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new SvgaEffectExtra();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                    return null;
                case 4:
                    return new Builder();
                case 5:
                    GeneratedMessageLite.h hVar = (GeneratedMessageLite.h) obj;
                    SvgaEffectExtra svgaEffectExtra = (SvgaEffectExtra) obj2;
                    this.id_ = hVar.f(!this.id_.isEmpty(), this.id_, !svgaEffectExtra.id_.isEmpty(), svgaEffectExtra.id_);
                    long j = this.type_;
                    boolean z2 = j != 0;
                    long j2 = svgaEffectExtra.type_;
                    this.type_ = hVar.i(z2, j, j2 != 0, j2);
                    this.value_ = hVar.f(!this.value_.isEmpty(), this.value_, !svgaEffectExtra.value_.isEmpty(), svgaEffectExtra.value_);
                    long j3 = this.textSize_;
                    boolean z3 = j3 != 0;
                    long j4 = svgaEffectExtra.textSize_;
                    this.textSize_ = hVar.i(z3, j3, j4 != 0, j4);
                    this.textColor_ = hVar.f(!this.textColor_.isEmpty(), this.textColor_, !svgaEffectExtra.textColor_.isEmpty(), svgaEffectExtra.textColor_);
                    GeneratedMessageLite.g gVar = GeneratedMessageLite.g.INSTANCE;
                    return this;
                case 6:
                    e eVar = (e) obj;
                    while (!z) {
                        try {
                            int iM = eVar.M();
                            if (iM != 0) {
                                if (iM == 10) {
                                    this.id_ = eVar.L();
                                } else if (iM == 16) {
                                    this.type_ = eVar.v();
                                } else if (iM == 26) {
                                    this.value_ = eVar.L();
                                } else if (iM == 32) {
                                    this.textSize_ = eVar.v();
                                } else if (iM == 42) {
                                    this.textColor_ = eVar.L();
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
                        synchronized (SvgaEffectExtra.class) {
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

        @Override // com.p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage.SvgaEffectExtraOrBuilder
        public String getId() {
            return this.id_;
        }

        @Override // com.p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage.SvgaEffectExtraOrBuilder
        public ByteString getIdBytes() {
            return ByteString.copyFromUtf8(this.id_);
        }

        public int getSerializedSize() {
            int i = ((GeneratedMessageLite) this).memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int iK = !this.id_.isEmpty() ? CodedOutputStream.K(1, getId()) : 0;
            long j = this.type_;
            if (j != 0) {
                iK += CodedOutputStream.v(2, j);
            }
            if (!this.value_.isEmpty()) {
                iK += CodedOutputStream.K(3, getValue());
            }
            long j2 = this.textSize_;
            if (j2 != 0) {
                iK += CodedOutputStream.v(4, j2);
            }
            if (!this.textColor_.isEmpty()) {
                iK += CodedOutputStream.K(5, getTextColor());
            }
            ((GeneratedMessageLite) this).memoizedSerializedSize = iK;
            return iK;
        }

        @Override // com.p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage.SvgaEffectExtraOrBuilder
        public String getTextColor() {
            return this.textColor_;
        }

        @Override // com.p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage.SvgaEffectExtraOrBuilder
        public ByteString getTextColorBytes() {
            return ByteString.copyFromUtf8(this.textColor_);
        }

        @Override // com.p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage.SvgaEffectExtraOrBuilder
        public long getTextSize() {
            return this.textSize_;
        }

        @Override // com.p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage.SvgaEffectExtraOrBuilder
        public long getType() {
            return this.type_;
        }

        @Override // com.p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage.SvgaEffectExtraOrBuilder
        public String getValue() {
            return this.value_;
        }

        @Override // com.p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage.SvgaEffectExtraOrBuilder
        public ByteString getValueBytes() {
            return ByteString.copyFromUtf8(this.value_);
        }

        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (!this.id_.isEmpty()) {
                codedOutputStream.D0(1, getId());
            }
            long j = this.type_;
            if (j != 0) {
                codedOutputStream.u0(2, j);
            }
            if (!this.value_.isEmpty()) {
                codedOutputStream.D0(3, getValue());
            }
            long j2 = this.textSize_;
            if (j2 != 0) {
                codedOutputStream.u0(4, j2);
            }
            if (this.textColor_.isEmpty()) {
                return;
            }
            codedOutputStream.D0(5, getTextColor());
        }

        public static SvgaEffectExtra parseDelimitedFrom(InputStream inputStream, h hVar) throws IOException {
            return (SvgaEffectExtra) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, hVar);
        }

        public static SvgaEffectExtra parseFrom(ByteString byteString, h hVar) throws InvalidProtocolBufferException {
            return (SvgaEffectExtra) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, hVar);
        }

        public static SvgaEffectExtra parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (SvgaEffectExtra) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static SvgaEffectExtra parseFrom(byte[] bArr, h hVar) throws InvalidProtocolBufferException {
            return (SvgaEffectExtra) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, hVar);
        }

        public static SvgaEffectExtra parseFrom(InputStream inputStream) throws IOException {
            return (SvgaEffectExtra) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static SvgaEffectExtra parseFrom(InputStream inputStream, h hVar) throws IOException {
            return (SvgaEffectExtra) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, hVar);
        }

        public static SvgaEffectExtra parseFrom(e eVar) throws IOException {
            return (SvgaEffectExtra) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, eVar);
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.toBuilder();
        }

        public static SvgaEffectExtra parseFrom(e eVar, h hVar) throws IOException {
            return (SvgaEffectExtra) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, eVar, hVar);
        }
    }

    public static final class TextDrawer extends GeneratedMessageLite<TextDrawer, Builder> implements TextDrawerOrBuilder {
        public static final int ACTIONAFTERCLICK_FIELD_NUMBER = 5;
        public static final int CONTENT_FIELD_NUMBER = 3;
        private static final TextDrawer DEFAULT_INSTANCE;
        public static final int ICONURL_FIELD_NUMBER = 1;
        public static final int JUMPSCHEME_FIELD_NUMBER = 4;
        private static volatile i860<TextDrawer> PARSER = null;
        public static final int SHADING_FIELD_NUMBER = 2;
        private TextDrawerContent content_;
        private Shading shading_;
        private String iconUrl_ = "";
        private String jumpScheme_ = "";
        private String actionAfterClick_ = "";

        static {
            TextDrawer textDrawer = new TextDrawer();
            DEFAULT_INSTANCE = textDrawer;
            textDrawer.makeImmutable();
        }

        private TextDrawer() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearActionAfterClick() {
            this.actionAfterClick_ = getDefaultInstance().getActionAfterClick();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearContent() {
            this.content_ = null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearIconUrl() {
            this.iconUrl_ = getDefaultInstance().getIconUrl();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearJumpScheme() {
            this.jumpScheme_ = getDefaultInstance().getJumpScheme();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearShading() {
            this.shading_ = null;
        }

        public static TextDrawer getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeContent(TextDrawerContent textDrawerContent) {
            TextDrawerContent textDrawerContent2 = this.content_;
            if (textDrawerContent2 == null || textDrawerContent2 == TextDrawerContent.getDefaultInstance()) {
                this.content_ = textDrawerContent;
            } else {
                this.content_ = (TextDrawerContent) ((TextDrawerContent.Builder) TextDrawerContent.newBuilder(this.content_).mergeFrom(textDrawerContent)).buildPartial();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeShading(Shading shading) {
            Shading shading2 = this.shading_;
            if (shading2 == null || shading2 == Shading.getDefaultInstance()) {
                this.shading_ = shading;
            } else {
                this.shading_ = (Shading) ((Shading.Builder) Shading.newBuilder(this.shading_).mergeFrom(shading)).buildPartial();
            }
        }

        public static Builder newBuilder(TextDrawer textDrawer) {
            return (Builder) ((Builder) DEFAULT_INSTANCE.toBuilder()).mergeFrom(textDrawer);
        }

        public static TextDrawer parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (TextDrawer) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static TextDrawer parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (TextDrawer) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static i860<TextDrawer> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setActionAfterClick(String str) {
            str.getClass();
            this.actionAfterClick_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setActionAfterClickBytes(ByteString byteString) {
            byteString.getClass();
            a.checkByteStringIsUtf8(byteString);
            this.actionAfterClick_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setContent(TextDrawerContent.Builder builder) {
            this.content_ = (TextDrawerContent) builder.build();
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
        public void setJumpScheme(String str) {
            str.getClass();
            this.jumpScheme_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setJumpSchemeBytes(ByteString byteString) {
            byteString.getClass();
            a.checkByteStringIsUtf8(byteString);
            this.jumpScheme_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setShading(Shading.Builder builder) {
            this.shading_ = (Shading) builder.build();
        }

        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (C03491.f1653xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new TextDrawer();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                    return null;
                case 4:
                    return new Builder();
                case 5:
                    GeneratedMessageLite.h hVar = (GeneratedMessageLite.h) obj;
                    TextDrawer textDrawer = (TextDrawer) obj2;
                    this.iconUrl_ = hVar.f(!this.iconUrl_.isEmpty(), this.iconUrl_, !textDrawer.iconUrl_.isEmpty(), textDrawer.iconUrl_);
                    this.shading_ = hVar.o(this.shading_, textDrawer.shading_);
                    this.content_ = hVar.o(this.content_, textDrawer.content_);
                    this.jumpScheme_ = hVar.f(!this.jumpScheme_.isEmpty(), this.jumpScheme_, !textDrawer.jumpScheme_.isEmpty(), textDrawer.jumpScheme_);
                    this.actionAfterClick_ = hVar.f(!this.actionAfterClick_.isEmpty(), this.actionAfterClick_, true ^ textDrawer.actionAfterClick_.isEmpty(), textDrawer.actionAfterClick_);
                    GeneratedMessageLite.g gVar = GeneratedMessageLite.g.INSTANCE;
                    return this;
                case 6:
                    e eVar = (e) obj;
                    h hVar2 = (h) obj2;
                    boolean z = false;
                    while (!z) {
                        try {
                            int iM = eVar.M();
                            if (iM != 0) {
                                if (iM == 10) {
                                    this.iconUrl_ = eVar.L();
                                } else if (iM == 18) {
                                    Shading shading = this.shading_;
                                    Shading.Builder builder = shading != null ? (Shading.Builder) shading.toBuilder() : null;
                                    Shading shadingW = eVar.w(Shading.parser(), hVar2);
                                    this.shading_ = shadingW;
                                    if (builder != null) {
                                        builder.mergeFrom(shadingW);
                                        this.shading_ = (Shading) builder.buildPartial();
                                    }
                                } else if (iM == 26) {
                                    TextDrawerContent textDrawerContent = this.content_;
                                    TextDrawerContent.Builder builder2 = textDrawerContent != null ? (TextDrawerContent.Builder) textDrawerContent.toBuilder() : null;
                                    TextDrawerContent textDrawerContentW = eVar.w(TextDrawerContent.parser(), hVar2);
                                    this.content_ = textDrawerContentW;
                                    if (builder2 != null) {
                                        builder2.mergeFrom(textDrawerContentW);
                                        this.content_ = (TextDrawerContent) builder2.buildPartial();
                                    }
                                } else if (iM == 34) {
                                    this.jumpScheme_ = eVar.L();
                                } else if (iM == 42) {
                                    this.actionAfterClick_ = eVar.L();
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
                        synchronized (TextDrawer.class) {
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

        @Override // com.p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage.TextDrawerOrBuilder
        public String getActionAfterClick() {
            return this.actionAfterClick_;
        }

        @Override // com.p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage.TextDrawerOrBuilder
        public ByteString getActionAfterClickBytes() {
            return ByteString.copyFromUtf8(this.actionAfterClick_);
        }

        @Override // com.p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage.TextDrawerOrBuilder
        public TextDrawerContent getContent() {
            TextDrawerContent textDrawerContent = this.content_;
            return textDrawerContent == null ? TextDrawerContent.getDefaultInstance() : textDrawerContent;
        }

        @Override // com.p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage.TextDrawerOrBuilder
        public String getIconUrl() {
            return this.iconUrl_;
        }

        @Override // com.p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage.TextDrawerOrBuilder
        public ByteString getIconUrlBytes() {
            return ByteString.copyFromUtf8(this.iconUrl_);
        }

        @Override // com.p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage.TextDrawerOrBuilder
        public String getJumpScheme() {
            return this.jumpScheme_;
        }

        @Override // com.p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage.TextDrawerOrBuilder
        public ByteString getJumpSchemeBytes() {
            return ByteString.copyFromUtf8(this.jumpScheme_);
        }

        public int getSerializedSize() {
            int i = ((GeneratedMessageLite) this).memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int iK = !this.iconUrl_.isEmpty() ? CodedOutputStream.K(1, getIconUrl()) : 0;
            if (this.shading_ != null) {
                iK += CodedOutputStream.C(2, getShading());
            }
            if (this.content_ != null) {
                iK += CodedOutputStream.C(3, getContent());
            }
            if (!this.jumpScheme_.isEmpty()) {
                iK += CodedOutputStream.K(4, getJumpScheme());
            }
            if (!this.actionAfterClick_.isEmpty()) {
                iK += CodedOutputStream.K(5, getActionAfterClick());
            }
            ((GeneratedMessageLite) this).memoizedSerializedSize = iK;
            return iK;
        }

        @Override // com.p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage.TextDrawerOrBuilder
        public Shading getShading() {
            Shading shading = this.shading_;
            return shading == null ? Shading.getDefaultInstance() : shading;
        }

        @Override // com.p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage.TextDrawerOrBuilder
        public boolean hasContent() {
            return this.content_ != null;
        }

        @Override // com.p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage.TextDrawerOrBuilder
        public boolean hasShading() {
            return this.shading_ != null;
        }

        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (!this.iconUrl_.isEmpty()) {
                codedOutputStream.D0(1, getIconUrl());
            }
            if (this.shading_ != null) {
                codedOutputStream.w0(2, getShading());
            }
            if (this.content_ != null) {
                codedOutputStream.w0(3, getContent());
            }
            if (!this.jumpScheme_.isEmpty()) {
                codedOutputStream.D0(4, getJumpScheme());
            }
            if (this.actionAfterClick_.isEmpty()) {
                return;
            }
            codedOutputStream.D0(5, getActionAfterClick());
        }

        public static TextDrawer parseDelimitedFrom(InputStream inputStream, h hVar) throws IOException {
            return (TextDrawer) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, hVar);
        }

        public static TextDrawer parseFrom(ByteString byteString, h hVar) throws InvalidProtocolBufferException {
            return (TextDrawer) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, hVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setContent(TextDrawerContent textDrawerContent) {
            textDrawerContent.getClass();
            this.content_ = textDrawerContent;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setShading(Shading shading) {
            shading.getClass();
            this.shading_ = shading;
        }

        public static final class Builder extends GeneratedMessageLite.b<TextDrawer, Builder> implements TextDrawerOrBuilder {
            private Builder() {
                super(TextDrawer.DEFAULT_INSTANCE);
            }

            public Builder clearActionAfterClick() {
                copyOnWrite();
                ((TextDrawer) ((GeneratedMessageLite.b) this).instance).clearActionAfterClick();
                return this;
            }

            public Builder clearContent() {
                copyOnWrite();
                ((TextDrawer) ((GeneratedMessageLite.b) this).instance).clearContent();
                return this;
            }

            public Builder clearIconUrl() {
                copyOnWrite();
                ((TextDrawer) ((GeneratedMessageLite.b) this).instance).clearIconUrl();
                return this;
            }

            public Builder clearJumpScheme() {
                copyOnWrite();
                ((TextDrawer) ((GeneratedMessageLite.b) this).instance).clearJumpScheme();
                return this;
            }

            public Builder clearShading() {
                copyOnWrite();
                ((TextDrawer) ((GeneratedMessageLite.b) this).instance).clearShading();
                return this;
            }

            @Override // com.p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage.TextDrawerOrBuilder
            public String getActionAfterClick() {
                return ((TextDrawer) ((GeneratedMessageLite.b) this).instance).getActionAfterClick();
            }

            @Override // com.p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage.TextDrawerOrBuilder
            public ByteString getActionAfterClickBytes() {
                return ((TextDrawer) ((GeneratedMessageLite.b) this).instance).getActionAfterClickBytes();
            }

            @Override // com.p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage.TextDrawerOrBuilder
            public TextDrawerContent getContent() {
                return ((TextDrawer) ((GeneratedMessageLite.b) this).instance).getContent();
            }

            @Override // com.p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage.TextDrawerOrBuilder
            public String getIconUrl() {
                return ((TextDrawer) ((GeneratedMessageLite.b) this).instance).getIconUrl();
            }

            @Override // com.p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage.TextDrawerOrBuilder
            public ByteString getIconUrlBytes() {
                return ((TextDrawer) ((GeneratedMessageLite.b) this).instance).getIconUrlBytes();
            }

            @Override // com.p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage.TextDrawerOrBuilder
            public String getJumpScheme() {
                return ((TextDrawer) ((GeneratedMessageLite.b) this).instance).getJumpScheme();
            }

            @Override // com.p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage.TextDrawerOrBuilder
            public ByteString getJumpSchemeBytes() {
                return ((TextDrawer) ((GeneratedMessageLite.b) this).instance).getJumpSchemeBytes();
            }

            @Override // com.p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage.TextDrawerOrBuilder
            public Shading getShading() {
                return ((TextDrawer) ((GeneratedMessageLite.b) this).instance).getShading();
            }

            @Override // com.p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage.TextDrawerOrBuilder
            public boolean hasContent() {
                return ((TextDrawer) ((GeneratedMessageLite.b) this).instance).hasContent();
            }

            @Override // com.p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage.TextDrawerOrBuilder
            public boolean hasShading() {
                return ((TextDrawer) ((GeneratedMessageLite.b) this).instance).hasShading();
            }

            public Builder mergeContent(TextDrawerContent textDrawerContent) {
                copyOnWrite();
                ((TextDrawer) ((GeneratedMessageLite.b) this).instance).mergeContent(textDrawerContent);
                return this;
            }

            public Builder mergeShading(Shading shading) {
                copyOnWrite();
                ((TextDrawer) ((GeneratedMessageLite.b) this).instance).mergeShading(shading);
                return this;
            }

            public Builder setActionAfterClick(String str) {
                copyOnWrite();
                ((TextDrawer) ((GeneratedMessageLite.b) this).instance).setActionAfterClick(str);
                return this;
            }

            public Builder setActionAfterClickBytes(ByteString byteString) {
                copyOnWrite();
                ((TextDrawer) ((GeneratedMessageLite.b) this).instance).setActionAfterClickBytes(byteString);
                return this;
            }

            public Builder setContent(TextDrawerContent textDrawerContent) {
                copyOnWrite();
                ((TextDrawer) ((GeneratedMessageLite.b) this).instance).setContent(textDrawerContent);
                return this;
            }

            public Builder setIconUrl(String str) {
                copyOnWrite();
                ((TextDrawer) ((GeneratedMessageLite.b) this).instance).setIconUrl(str);
                return this;
            }

            public Builder setIconUrlBytes(ByteString byteString) {
                copyOnWrite();
                ((TextDrawer) ((GeneratedMessageLite.b) this).instance).setIconUrlBytes(byteString);
                return this;
            }

            public Builder setJumpScheme(String str) {
                copyOnWrite();
                ((TextDrawer) ((GeneratedMessageLite.b) this).instance).setJumpScheme(str);
                return this;
            }

            public Builder setJumpSchemeBytes(ByteString byteString) {
                copyOnWrite();
                ((TextDrawer) ((GeneratedMessageLite.b) this).instance).setJumpSchemeBytes(byteString);
                return this;
            }

            public Builder setShading(Shading shading) {
                copyOnWrite();
                ((TextDrawer) ((GeneratedMessageLite.b) this).instance).setShading(shading);
                return this;
            }

            public Builder setContent(TextDrawerContent.Builder builder) {
                copyOnWrite();
                ((TextDrawer) ((GeneratedMessageLite.b) this).instance).setContent(builder);
                return this;
            }

            public Builder setShading(Shading.Builder builder) {
                copyOnWrite();
                ((TextDrawer) ((GeneratedMessageLite.b) this).instance).setShading(builder);
                return this;
            }
        }

        public static TextDrawer parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (TextDrawer) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static TextDrawer parseFrom(byte[] bArr, h hVar) throws InvalidProtocolBufferException {
            return (TextDrawer) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, hVar);
        }

        public static TextDrawer parseFrom(InputStream inputStream) throws IOException {
            return (TextDrawer) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static TextDrawer parseFrom(InputStream inputStream, h hVar) throws IOException {
            return (TextDrawer) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, hVar);
        }

        public static TextDrawer parseFrom(e eVar) throws IOException {
            return (TextDrawer) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, eVar);
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.toBuilder();
        }

        public static TextDrawer parseFrom(e eVar, h hVar) throws IOException {
            return (TextDrawer) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, eVar, hVar);
        }
    }

    public static final class TextDrawerContent extends GeneratedMessageLite<TextDrawerContent, Builder> implements TextDrawerContentOrBuilder {
        private static final TextDrawerContent DEFAULT_INSTANCE;
        public static final int HIERARCHY_FIELD_NUMBER = 3;
        private static volatile i860<TextDrawerContent> PARSER = null;
        public static final int TEMPLATEFIELDS_FIELD_NUMBER = 2;
        public static final int TEMPLATEID_FIELD_NUMBER = 1;
        private int bitField0_;
        private OperationHierarchy hierarchy_;
        private l.h<String> templateFields_ = GeneratedMessageLite.emptyProtobufList();
        private long templateId_;

        static {
            TextDrawerContent textDrawerContent = new TextDrawerContent();
            DEFAULT_INSTANCE = textDrawerContent;
            textDrawerContent.makeImmutable();
        }

        private TextDrawerContent() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllTemplateFields(Iterable<String> iterable) {
            ensureTemplateFieldsIsMutable();
            a.addAll(iterable, this.templateFields_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addTemplateFields(String str) {
            str.getClass();
            ensureTemplateFieldsIsMutable();
            this.templateFields_.add(str);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addTemplateFieldsBytes(ByteString byteString) {
            byteString.getClass();
            a.checkByteStringIsUtf8(byteString);
            ensureTemplateFieldsIsMutable();
            this.templateFields_.add(byteString.toStringUtf8());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearHierarchy() {
            this.hierarchy_ = null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearTemplateFields() {
            this.templateFields_ = GeneratedMessageLite.emptyProtobufList();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearTemplateId() {
            this.templateId_ = 0L;
        }

        private void ensureTemplateFieldsIsMutable() {
            if (this.templateFields_.q()) {
                return;
            }
            this.templateFields_ = GeneratedMessageLite.mutableCopy(this.templateFields_);
        }

        public static TextDrawerContent getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeHierarchy(OperationHierarchy operationHierarchy) {
            OperationHierarchy operationHierarchy2 = this.hierarchy_;
            if (operationHierarchy2 == null || operationHierarchy2 == OperationHierarchy.getDefaultInstance()) {
                this.hierarchy_ = operationHierarchy;
            } else {
                this.hierarchy_ = (OperationHierarchy) ((OperationHierarchy.Builder) OperationHierarchy.newBuilder(this.hierarchy_).mergeFrom(operationHierarchy)).buildPartial();
            }
        }

        public static Builder newBuilder(TextDrawerContent textDrawerContent) {
            return (Builder) ((Builder) DEFAULT_INSTANCE.toBuilder()).mergeFrom(textDrawerContent);
        }

        public static TextDrawerContent parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (TextDrawerContent) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static TextDrawerContent parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (TextDrawerContent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static i860<TextDrawerContent> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setHierarchy(OperationHierarchy.Builder builder) {
            this.hierarchy_ = (OperationHierarchy) builder.build();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTemplateFields(int i, String str) {
            str.getClass();
            ensureTemplateFieldsIsMutable();
            this.templateFields_.set(i, str);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTemplateId(long j) {
            this.templateId_ = j;
        }

        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            boolean z = false;
            switch (C03491.f1653xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new TextDrawerContent();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                    this.templateFields_.n();
                    return null;
                case 4:
                    return new Builder();
                case 5:
                    GeneratedMessageLite.g gVar = (GeneratedMessageLite.h) obj;
                    TextDrawerContent textDrawerContent = (TextDrawerContent) obj2;
                    long j = this.templateId_;
                    boolean z2 = j != 0;
                    long j2 = textDrawerContent.templateId_;
                    this.templateId_ = gVar.i(z2, j, j2 != 0, j2);
                    this.templateFields_ = gVar.g(this.templateFields_, textDrawerContent.templateFields_);
                    this.hierarchy_ = gVar.o(this.hierarchy_, textDrawerContent.hierarchy_);
                    if (gVar == GeneratedMessageLite.g.INSTANCE) {
                        this.bitField0_ |= textDrawerContent.bitField0_;
                    }
                    return this;
                case 6:
                    e eVar = (e) obj;
                    h hVar = (h) obj2;
                    while (!z) {
                        try {
                            int iM = eVar.M();
                            if (iM != 0) {
                                if (iM == 8) {
                                    this.templateId_ = eVar.v();
                                } else if (iM == 18) {
                                    String strL = eVar.L();
                                    if (!this.templateFields_.q()) {
                                        this.templateFields_ = GeneratedMessageLite.mutableCopy(this.templateFields_);
                                    }
                                    this.templateFields_.add(strL);
                                } else if (iM == 26) {
                                    OperationHierarchy operationHierarchy = this.hierarchy_;
                                    OperationHierarchy.Builder builder = operationHierarchy != null ? (OperationHierarchy.Builder) operationHierarchy.toBuilder() : null;
                                    OperationHierarchy operationHierarchyW = eVar.w(OperationHierarchy.parser(), hVar);
                                    this.hierarchy_ = operationHierarchyW;
                                    if (builder != null) {
                                        builder.mergeFrom(operationHierarchyW);
                                        this.hierarchy_ = (OperationHierarchy) builder.buildPartial();
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
                        synchronized (TextDrawerContent.class) {
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

        @Override // com.p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage.TextDrawerContentOrBuilder
        public OperationHierarchy getHierarchy() {
            OperationHierarchy operationHierarchy = this.hierarchy_;
            return operationHierarchy == null ? OperationHierarchy.getDefaultInstance() : operationHierarchy;
        }

        public int getSerializedSize() {
            int i = ((GeneratedMessageLite) this).memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            long j = this.templateId_;
            int iV = j != 0 ? CodedOutputStream.v(1, j) : 0;
            int iL = 0;
            for (int i2 = 0; i2 < this.templateFields_.size(); i2++) {
                iL += CodedOutputStream.L((String) this.templateFields_.get(i2));
            }
            int size = iV + iL + getTemplateFieldsList().size();
            if (this.hierarchy_ != null) {
                size += CodedOutputStream.C(3, getHierarchy());
            }
            ((GeneratedMessageLite) this).memoizedSerializedSize = size;
            return size;
        }

        @Override // com.p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage.TextDrawerContentOrBuilder
        public String getTemplateFields(int i) {
            return (String) this.templateFields_.get(i);
        }

        @Override // com.p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage.TextDrawerContentOrBuilder
        public ByteString getTemplateFieldsBytes(int i) {
            return ByteString.copyFromUtf8((String) this.templateFields_.get(i));
        }

        @Override // com.p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage.TextDrawerContentOrBuilder
        public int getTemplateFieldsCount() {
            return this.templateFields_.size();
        }

        @Override // com.p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage.TextDrawerContentOrBuilder
        public List<String> getTemplateFieldsList() {
            return this.templateFields_;
        }

        @Override // com.p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage.TextDrawerContentOrBuilder
        public long getTemplateId() {
            return this.templateId_;
        }

        @Override // com.p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage.TextDrawerContentOrBuilder
        public boolean hasHierarchy() {
            return this.hierarchy_ != null;
        }

        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            long j = this.templateId_;
            if (j != 0) {
                codedOutputStream.u0(1, j);
            }
            for (int i = 0; i < this.templateFields_.size(); i++) {
                codedOutputStream.D0(2, (String) this.templateFields_.get(i));
            }
            if (this.hierarchy_ != null) {
                codedOutputStream.w0(3, getHierarchy());
            }
        }

        public static TextDrawerContent parseDelimitedFrom(InputStream inputStream, h hVar) throws IOException {
            return (TextDrawerContent) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, hVar);
        }

        public static TextDrawerContent parseFrom(ByteString byteString, h hVar) throws InvalidProtocolBufferException {
            return (TextDrawerContent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, hVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setHierarchy(OperationHierarchy operationHierarchy) {
            operationHierarchy.getClass();
            this.hierarchy_ = operationHierarchy;
        }

        public static final class Builder extends GeneratedMessageLite.b<TextDrawerContent, Builder> implements TextDrawerContentOrBuilder {
            private Builder() {
                super(TextDrawerContent.DEFAULT_INSTANCE);
            }

            public Builder addAllTemplateFields(Iterable<String> iterable) {
                copyOnWrite();
                ((TextDrawerContent) ((GeneratedMessageLite.b) this).instance).addAllTemplateFields(iterable);
                return this;
            }

            public Builder addTemplateFields(String str) {
                copyOnWrite();
                ((TextDrawerContent) ((GeneratedMessageLite.b) this).instance).addTemplateFields(str);
                return this;
            }

            public Builder addTemplateFieldsBytes(ByteString byteString) {
                copyOnWrite();
                ((TextDrawerContent) ((GeneratedMessageLite.b) this).instance).addTemplateFieldsBytes(byteString);
                return this;
            }

            public Builder clearHierarchy() {
                copyOnWrite();
                ((TextDrawerContent) ((GeneratedMessageLite.b) this).instance).clearHierarchy();
                return this;
            }

            public Builder clearTemplateFields() {
                copyOnWrite();
                ((TextDrawerContent) ((GeneratedMessageLite.b) this).instance).clearTemplateFields();
                return this;
            }

            public Builder clearTemplateId() {
                copyOnWrite();
                ((TextDrawerContent) ((GeneratedMessageLite.b) this).instance).clearTemplateId();
                return this;
            }

            @Override // com.p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage.TextDrawerContentOrBuilder
            public OperationHierarchy getHierarchy() {
                return ((TextDrawerContent) ((GeneratedMessageLite.b) this).instance).getHierarchy();
            }

            @Override // com.p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage.TextDrawerContentOrBuilder
            public String getTemplateFields(int i) {
                return ((TextDrawerContent) ((GeneratedMessageLite.b) this).instance).getTemplateFields(i);
            }

            @Override // com.p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage.TextDrawerContentOrBuilder
            public ByteString getTemplateFieldsBytes(int i) {
                return ((TextDrawerContent) ((GeneratedMessageLite.b) this).instance).getTemplateFieldsBytes(i);
            }

            @Override // com.p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage.TextDrawerContentOrBuilder
            public int getTemplateFieldsCount() {
                return ((TextDrawerContent) ((GeneratedMessageLite.b) this).instance).getTemplateFieldsCount();
            }

            @Override // com.p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage.TextDrawerContentOrBuilder
            public List<String> getTemplateFieldsList() {
                return Collections.unmodifiableList(((TextDrawerContent) ((GeneratedMessageLite.b) this).instance).getTemplateFieldsList());
            }

            @Override // com.p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage.TextDrawerContentOrBuilder
            public long getTemplateId() {
                return ((TextDrawerContent) ((GeneratedMessageLite.b) this).instance).getTemplateId();
            }

            @Override // com.p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage.TextDrawerContentOrBuilder
            public boolean hasHierarchy() {
                return ((TextDrawerContent) ((GeneratedMessageLite.b) this).instance).hasHierarchy();
            }

            public Builder mergeHierarchy(OperationHierarchy operationHierarchy) {
                copyOnWrite();
                ((TextDrawerContent) ((GeneratedMessageLite.b) this).instance).mergeHierarchy(operationHierarchy);
                return this;
            }

            public Builder setHierarchy(OperationHierarchy operationHierarchy) {
                copyOnWrite();
                ((TextDrawerContent) ((GeneratedMessageLite.b) this).instance).setHierarchy(operationHierarchy);
                return this;
            }

            public Builder setTemplateFields(int i, String str) {
                copyOnWrite();
                ((TextDrawerContent) ((GeneratedMessageLite.b) this).instance).setTemplateFields(i, str);
                return this;
            }

            public Builder setTemplateId(long j) {
                copyOnWrite();
                ((TextDrawerContent) ((GeneratedMessageLite.b) this).instance).setTemplateId(j);
                return this;
            }

            public Builder setHierarchy(OperationHierarchy.Builder builder) {
                copyOnWrite();
                ((TextDrawerContent) ((GeneratedMessageLite.b) this).instance).setHierarchy(builder);
                return this;
            }
        }

        public static TextDrawerContent parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (TextDrawerContent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static TextDrawerContent parseFrom(byte[] bArr, h hVar) throws InvalidProtocolBufferException {
            return (TextDrawerContent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, hVar);
        }

        public static TextDrawerContent parseFrom(InputStream inputStream) throws IOException {
            return (TextDrawerContent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static TextDrawerContent parseFrom(InputStream inputStream, h hVar) throws IOException {
            return (TextDrawerContent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, hVar);
        }

        public static TextDrawerContent parseFrom(e eVar) throws IOException {
            return (TextDrawerContent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, eVar);
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.toBuilder();
        }

        public static TextDrawerContent parseFrom(e eVar, h hVar) throws IOException {
            return (TextDrawerContent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, eVar, hVar);
        }
    }

    public static final class TopEffect extends GeneratedMessageLite<TopEffect, Builder> implements TopEffectOrBuilder {
        public static final int AVATARURL_FIELD_NUMBER = 2;
        public static final int BACKGROUNDSVGAURL_FIELD_NUMBER = 9;
        public static final int BACKGROUNDURL_FIELD_NUMBER = 8;
        public static final int CONTENT_FIELD_NUMBER = 3;
        private static final TopEffect DEFAULT_INSTANCE;
        public static final int DURATION_FIELD_NUMBER = 6;
        public static final int EFFECTBACKGROUNDURL_FIELD_NUMBER = 10;
        public static final int ENDBACKENDCOLOR_FIELD_NUMBER = 5;
        private static volatile i860<TopEffect> PARSER = null;
        public static final int ROOMID_FIELD_NUMBER = 7;
        public static final int STARTBACKENDCOLOR_FIELD_NUMBER = 4;
        public static final int SUBTITLECOLOR_FIELD_NUMBER = 11;
        public static final int USERNAME_FIELD_NUMBER = 1;
        private long duration_;
        private String userName_ = "";
        private String avatarUrl_ = "";
        private String content_ = "";
        private String startBackendColor_ = "";
        private String endBackendColor_ = "";
        private String roomId_ = "";
        private String backgroundUrl_ = "";
        private String backgroundSVGAUrl_ = "";
        private String effectBackgroundUrl_ = "";
        private String subtitleColor_ = "";

        public static final class Builder extends GeneratedMessageLite.b<TopEffect, Builder> implements TopEffectOrBuilder {
            private Builder() {
                super(TopEffect.DEFAULT_INSTANCE);
            }

            public Builder clearAvatarUrl() {
                copyOnWrite();
                ((TopEffect) ((GeneratedMessageLite.b) this).instance).clearAvatarUrl();
                return this;
            }

            public Builder clearBackgroundSVGAUrl() {
                copyOnWrite();
                ((TopEffect) ((GeneratedMessageLite.b) this).instance).clearBackgroundSVGAUrl();
                return this;
            }

            public Builder clearBackgroundUrl() {
                copyOnWrite();
                ((TopEffect) ((GeneratedMessageLite.b) this).instance).clearBackgroundUrl();
                return this;
            }

            public Builder clearContent() {
                copyOnWrite();
                ((TopEffect) ((GeneratedMessageLite.b) this).instance).clearContent();
                return this;
            }

            public Builder clearDuration() {
                copyOnWrite();
                ((TopEffect) ((GeneratedMessageLite.b) this).instance).clearDuration();
                return this;
            }

            public Builder clearEffectBackgroundUrl() {
                copyOnWrite();
                ((TopEffect) ((GeneratedMessageLite.b) this).instance).clearEffectBackgroundUrl();
                return this;
            }

            public Builder clearEndBackendColor() {
                copyOnWrite();
                ((TopEffect) ((GeneratedMessageLite.b) this).instance).clearEndBackendColor();
                return this;
            }

            public Builder clearRoomId() {
                copyOnWrite();
                ((TopEffect) ((GeneratedMessageLite.b) this).instance).clearRoomId();
                return this;
            }

            public Builder clearStartBackendColor() {
                copyOnWrite();
                ((TopEffect) ((GeneratedMessageLite.b) this).instance).clearStartBackendColor();
                return this;
            }

            public Builder clearSubtitleColor() {
                copyOnWrite();
                ((TopEffect) ((GeneratedMessageLite.b) this).instance).clearSubtitleColor();
                return this;
            }

            public Builder clearUserName() {
                copyOnWrite();
                ((TopEffect) ((GeneratedMessageLite.b) this).instance).clearUserName();
                return this;
            }

            @Override // com.p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage.TopEffectOrBuilder
            public String getAvatarUrl() {
                return ((TopEffect) ((GeneratedMessageLite.b) this).instance).getAvatarUrl();
            }

            @Override // com.p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage.TopEffectOrBuilder
            public ByteString getAvatarUrlBytes() {
                return ((TopEffect) ((GeneratedMessageLite.b) this).instance).getAvatarUrlBytes();
            }

            @Override // com.p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage.TopEffectOrBuilder
            public String getBackgroundSVGAUrl() {
                return ((TopEffect) ((GeneratedMessageLite.b) this).instance).getBackgroundSVGAUrl();
            }

            @Override // com.p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage.TopEffectOrBuilder
            public ByteString getBackgroundSVGAUrlBytes() {
                return ((TopEffect) ((GeneratedMessageLite.b) this).instance).getBackgroundSVGAUrlBytes();
            }

            @Override // com.p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage.TopEffectOrBuilder
            public String getBackgroundUrl() {
                return ((TopEffect) ((GeneratedMessageLite.b) this).instance).getBackgroundUrl();
            }

            @Override // com.p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage.TopEffectOrBuilder
            public ByteString getBackgroundUrlBytes() {
                return ((TopEffect) ((GeneratedMessageLite.b) this).instance).getBackgroundUrlBytes();
            }

            @Override // com.p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage.TopEffectOrBuilder
            public String getContent() {
                return ((TopEffect) ((GeneratedMessageLite.b) this).instance).getContent();
            }

            @Override // com.p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage.TopEffectOrBuilder
            public ByteString getContentBytes() {
                return ((TopEffect) ((GeneratedMessageLite.b) this).instance).getContentBytes();
            }

            @Override // com.p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage.TopEffectOrBuilder
            public long getDuration() {
                return ((TopEffect) ((GeneratedMessageLite.b) this).instance).getDuration();
            }

            @Override // com.p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage.TopEffectOrBuilder
            public String getEffectBackgroundUrl() {
                return ((TopEffect) ((GeneratedMessageLite.b) this).instance).getEffectBackgroundUrl();
            }

            @Override // com.p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage.TopEffectOrBuilder
            public ByteString getEffectBackgroundUrlBytes() {
                return ((TopEffect) ((GeneratedMessageLite.b) this).instance).getEffectBackgroundUrlBytes();
            }

            @Override // com.p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage.TopEffectOrBuilder
            public String getEndBackendColor() {
                return ((TopEffect) ((GeneratedMessageLite.b) this).instance).getEndBackendColor();
            }

            @Override // com.p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage.TopEffectOrBuilder
            public ByteString getEndBackendColorBytes() {
                return ((TopEffect) ((GeneratedMessageLite.b) this).instance).getEndBackendColorBytes();
            }

            @Override // com.p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage.TopEffectOrBuilder
            public String getRoomId() {
                return ((TopEffect) ((GeneratedMessageLite.b) this).instance).getRoomId();
            }

            @Override // com.p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage.TopEffectOrBuilder
            public ByteString getRoomIdBytes() {
                return ((TopEffect) ((GeneratedMessageLite.b) this).instance).getRoomIdBytes();
            }

            @Override // com.p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage.TopEffectOrBuilder
            public String getStartBackendColor() {
                return ((TopEffect) ((GeneratedMessageLite.b) this).instance).getStartBackendColor();
            }

            @Override // com.p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage.TopEffectOrBuilder
            public ByteString getStartBackendColorBytes() {
                return ((TopEffect) ((GeneratedMessageLite.b) this).instance).getStartBackendColorBytes();
            }

            @Override // com.p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage.TopEffectOrBuilder
            public String getSubtitleColor() {
                return ((TopEffect) ((GeneratedMessageLite.b) this).instance).getSubtitleColor();
            }

            @Override // com.p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage.TopEffectOrBuilder
            public ByteString getSubtitleColorBytes() {
                return ((TopEffect) ((GeneratedMessageLite.b) this).instance).getSubtitleColorBytes();
            }

            @Override // com.p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage.TopEffectOrBuilder
            public String getUserName() {
                return ((TopEffect) ((GeneratedMessageLite.b) this).instance).getUserName();
            }

            @Override // com.p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage.TopEffectOrBuilder
            public ByteString getUserNameBytes() {
                return ((TopEffect) ((GeneratedMessageLite.b) this).instance).getUserNameBytes();
            }

            public Builder setAvatarUrl(String str) {
                copyOnWrite();
                ((TopEffect) ((GeneratedMessageLite.b) this).instance).setAvatarUrl(str);
                return this;
            }

            public Builder setAvatarUrlBytes(ByteString byteString) {
                copyOnWrite();
                ((TopEffect) ((GeneratedMessageLite.b) this).instance).setAvatarUrlBytes(byteString);
                return this;
            }

            public Builder setBackgroundSVGAUrl(String str) {
                copyOnWrite();
                ((TopEffect) ((GeneratedMessageLite.b) this).instance).setBackgroundSVGAUrl(str);
                return this;
            }

            public Builder setBackgroundSVGAUrlBytes(ByteString byteString) {
                copyOnWrite();
                ((TopEffect) ((GeneratedMessageLite.b) this).instance).setBackgroundSVGAUrlBytes(byteString);
                return this;
            }

            public Builder setBackgroundUrl(String str) {
                copyOnWrite();
                ((TopEffect) ((GeneratedMessageLite.b) this).instance).setBackgroundUrl(str);
                return this;
            }

            public Builder setBackgroundUrlBytes(ByteString byteString) {
                copyOnWrite();
                ((TopEffect) ((GeneratedMessageLite.b) this).instance).setBackgroundUrlBytes(byteString);
                return this;
            }

            public Builder setContent(String str) {
                copyOnWrite();
                ((TopEffect) ((GeneratedMessageLite.b) this).instance).setContent(str);
                return this;
            }

            public Builder setContentBytes(ByteString byteString) {
                copyOnWrite();
                ((TopEffect) ((GeneratedMessageLite.b) this).instance).setContentBytes(byteString);
                return this;
            }

            public Builder setDuration(long j) {
                copyOnWrite();
                ((TopEffect) ((GeneratedMessageLite.b) this).instance).setDuration(j);
                return this;
            }

            public Builder setEffectBackgroundUrl(String str) {
                copyOnWrite();
                ((TopEffect) ((GeneratedMessageLite.b) this).instance).setEffectBackgroundUrl(str);
                return this;
            }

            public Builder setEffectBackgroundUrlBytes(ByteString byteString) {
                copyOnWrite();
                ((TopEffect) ((GeneratedMessageLite.b) this).instance).setEffectBackgroundUrlBytes(byteString);
                return this;
            }

            public Builder setEndBackendColor(String str) {
                copyOnWrite();
                ((TopEffect) ((GeneratedMessageLite.b) this).instance).setEndBackendColor(str);
                return this;
            }

            public Builder setEndBackendColorBytes(ByteString byteString) {
                copyOnWrite();
                ((TopEffect) ((GeneratedMessageLite.b) this).instance).setEndBackendColorBytes(byteString);
                return this;
            }

            public Builder setRoomId(String str) {
                copyOnWrite();
                ((TopEffect) ((GeneratedMessageLite.b) this).instance).setRoomId(str);
                return this;
            }

            public Builder setRoomIdBytes(ByteString byteString) {
                copyOnWrite();
                ((TopEffect) ((GeneratedMessageLite.b) this).instance).setRoomIdBytes(byteString);
                return this;
            }

            public Builder setStartBackendColor(String str) {
                copyOnWrite();
                ((TopEffect) ((GeneratedMessageLite.b) this).instance).setStartBackendColor(str);
                return this;
            }

            public Builder setStartBackendColorBytes(ByteString byteString) {
                copyOnWrite();
                ((TopEffect) ((GeneratedMessageLite.b) this).instance).setStartBackendColorBytes(byteString);
                return this;
            }

            public Builder setSubtitleColor(String str) {
                copyOnWrite();
                ((TopEffect) ((GeneratedMessageLite.b) this).instance).setSubtitleColor(str);
                return this;
            }

            public Builder setSubtitleColorBytes(ByteString byteString) {
                copyOnWrite();
                ((TopEffect) ((GeneratedMessageLite.b) this).instance).setSubtitleColorBytes(byteString);
                return this;
            }

            public Builder setUserName(String str) {
                copyOnWrite();
                ((TopEffect) ((GeneratedMessageLite.b) this).instance).setUserName(str);
                return this;
            }

            public Builder setUserNameBytes(ByteString byteString) {
                copyOnWrite();
                ((TopEffect) ((GeneratedMessageLite.b) this).instance).setUserNameBytes(byteString);
                return this;
            }
        }

        static {
            TopEffect topEffect = new TopEffect();
            DEFAULT_INSTANCE = topEffect;
            topEffect.makeImmutable();
        }

        private TopEffect() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAvatarUrl() {
            this.avatarUrl_ = getDefaultInstance().getAvatarUrl();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearBackgroundSVGAUrl() {
            this.backgroundSVGAUrl_ = getDefaultInstance().getBackgroundSVGAUrl();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearBackgroundUrl() {
            this.backgroundUrl_ = getDefaultInstance().getBackgroundUrl();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearContent() {
            this.content_ = getDefaultInstance().getContent();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearDuration() {
            this.duration_ = 0L;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearEffectBackgroundUrl() {
            this.effectBackgroundUrl_ = getDefaultInstance().getEffectBackgroundUrl();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearEndBackendColor() {
            this.endBackendColor_ = getDefaultInstance().getEndBackendColor();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearRoomId() {
            this.roomId_ = getDefaultInstance().getRoomId();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearStartBackendColor() {
            this.startBackendColor_ = getDefaultInstance().getStartBackendColor();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearSubtitleColor() {
            this.subtitleColor_ = getDefaultInstance().getSubtitleColor();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearUserName() {
            this.userName_ = getDefaultInstance().getUserName();
        }

        public static TopEffect getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder(TopEffect topEffect) {
            return (Builder) ((Builder) DEFAULT_INSTANCE.toBuilder()).mergeFrom(topEffect);
        }

        public static TopEffect parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (TopEffect) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static TopEffect parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (TopEffect) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static i860<TopEffect> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAvatarUrl(String str) {
            str.getClass();
            this.avatarUrl_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAvatarUrlBytes(ByteString byteString) {
            byteString.getClass();
            a.checkByteStringIsUtf8(byteString);
            this.avatarUrl_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setBackgroundSVGAUrl(String str) {
            str.getClass();
            this.backgroundSVGAUrl_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setBackgroundSVGAUrlBytes(ByteString byteString) {
            byteString.getClass();
            a.checkByteStringIsUtf8(byteString);
            this.backgroundSVGAUrl_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setBackgroundUrl(String str) {
            str.getClass();
            this.backgroundUrl_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setBackgroundUrlBytes(ByteString byteString) {
            byteString.getClass();
            a.checkByteStringIsUtf8(byteString);
            this.backgroundUrl_ = byteString.toStringUtf8();
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
        public void setDuration(long j) {
            this.duration_ = j;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setEffectBackgroundUrl(String str) {
            str.getClass();
            this.effectBackgroundUrl_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setEffectBackgroundUrlBytes(ByteString byteString) {
            byteString.getClass();
            a.checkByteStringIsUtf8(byteString);
            this.effectBackgroundUrl_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setEndBackendColor(String str) {
            str.getClass();
            this.endBackendColor_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setEndBackendColorBytes(ByteString byteString) {
            byteString.getClass();
            a.checkByteStringIsUtf8(byteString);
            this.endBackendColor_ = byteString.toStringUtf8();
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
        public void setStartBackendColor(String str) {
            str.getClass();
            this.startBackendColor_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setStartBackendColorBytes(ByteString byteString) {
            byteString.getClass();
            a.checkByteStringIsUtf8(byteString);
            this.startBackendColor_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSubtitleColor(String str) {
            str.getClass();
            this.subtitleColor_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSubtitleColorBytes(ByteString byteString) {
            byteString.getClass();
            a.checkByteStringIsUtf8(byteString);
            this.subtitleColor_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setUserName(String str) {
            str.getClass();
            this.userName_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setUserNameBytes(ByteString byteString) {
            byteString.getClass();
            a.checkByteStringIsUtf8(byteString);
            this.userName_ = byteString.toStringUtf8();
        }

        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            boolean z = false;
            switch (C03491.f1653xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new TopEffect();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                    return null;
                case 4:
                    return new Builder();
                case 5:
                    GeneratedMessageLite.h hVar = (GeneratedMessageLite.h) obj;
                    TopEffect topEffect = (TopEffect) obj2;
                    this.userName_ = hVar.f(!this.userName_.isEmpty(), this.userName_, !topEffect.userName_.isEmpty(), topEffect.userName_);
                    this.avatarUrl_ = hVar.f(!this.avatarUrl_.isEmpty(), this.avatarUrl_, !topEffect.avatarUrl_.isEmpty(), topEffect.avatarUrl_);
                    this.content_ = hVar.f(!this.content_.isEmpty(), this.content_, !topEffect.content_.isEmpty(), topEffect.content_);
                    this.startBackendColor_ = hVar.f(!this.startBackendColor_.isEmpty(), this.startBackendColor_, !topEffect.startBackendColor_.isEmpty(), topEffect.startBackendColor_);
                    this.endBackendColor_ = hVar.f(!this.endBackendColor_.isEmpty(), this.endBackendColor_, !topEffect.endBackendColor_.isEmpty(), topEffect.endBackendColor_);
                    long j = this.duration_;
                    boolean z2 = j != 0;
                    long j2 = topEffect.duration_;
                    this.duration_ = hVar.i(z2, j, j2 != 0, j2);
                    this.roomId_ = hVar.f(!this.roomId_.isEmpty(), this.roomId_, !topEffect.roomId_.isEmpty(), topEffect.roomId_);
                    this.backgroundUrl_ = hVar.f(!this.backgroundUrl_.isEmpty(), this.backgroundUrl_, !topEffect.backgroundUrl_.isEmpty(), topEffect.backgroundUrl_);
                    this.backgroundSVGAUrl_ = hVar.f(!this.backgroundSVGAUrl_.isEmpty(), this.backgroundSVGAUrl_, !topEffect.backgroundSVGAUrl_.isEmpty(), topEffect.backgroundSVGAUrl_);
                    this.effectBackgroundUrl_ = hVar.f(!this.effectBackgroundUrl_.isEmpty(), this.effectBackgroundUrl_, !topEffect.effectBackgroundUrl_.isEmpty(), topEffect.effectBackgroundUrl_);
                    this.subtitleColor_ = hVar.f(!this.subtitleColor_.isEmpty(), this.subtitleColor_, !topEffect.subtitleColor_.isEmpty(), topEffect.subtitleColor_);
                    GeneratedMessageLite.g gVar = GeneratedMessageLite.g.INSTANCE;
                    return this;
                case 6:
                    e eVar = (e) obj;
                    while (!z) {
                        try {
                            int iM = eVar.M();
                            switch (iM) {
                                case 0:
                                    break;
                                case 10:
                                    this.userName_ = eVar.L();
                                    continue;
                                case 18:
                                    this.avatarUrl_ = eVar.L();
                                    continue;
                                case 26:
                                    this.content_ = eVar.L();
                                    continue;
                                case 34:
                                    this.startBackendColor_ = eVar.L();
                                    continue;
                                case 42:
                                    this.endBackendColor_ = eVar.L();
                                    continue;
                                case 48:
                                    this.duration_ = eVar.v();
                                    continue;
                                case 58:
                                    this.roomId_ = eVar.L();
                                    continue;
                                case 66:
                                    this.backgroundUrl_ = eVar.L();
                                    continue;
                                case 74:
                                    this.backgroundSVGAUrl_ = eVar.L();
                                    continue;
                                case 82:
                                    this.effectBackgroundUrl_ = eVar.L();
                                    continue;
                                case 90:
                                    this.subtitleColor_ = eVar.L();
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
                        synchronized (TopEffect.class) {
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

        @Override // com.p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage.TopEffectOrBuilder
        public String getAvatarUrl() {
            return this.avatarUrl_;
        }

        @Override // com.p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage.TopEffectOrBuilder
        public ByteString getAvatarUrlBytes() {
            return ByteString.copyFromUtf8(this.avatarUrl_);
        }

        @Override // com.p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage.TopEffectOrBuilder
        public String getBackgroundSVGAUrl() {
            return this.backgroundSVGAUrl_;
        }

        @Override // com.p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage.TopEffectOrBuilder
        public ByteString getBackgroundSVGAUrlBytes() {
            return ByteString.copyFromUtf8(this.backgroundSVGAUrl_);
        }

        @Override // com.p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage.TopEffectOrBuilder
        public String getBackgroundUrl() {
            return this.backgroundUrl_;
        }

        @Override // com.p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage.TopEffectOrBuilder
        public ByteString getBackgroundUrlBytes() {
            return ByteString.copyFromUtf8(this.backgroundUrl_);
        }

        @Override // com.p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage.TopEffectOrBuilder
        public String getContent() {
            return this.content_;
        }

        @Override // com.p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage.TopEffectOrBuilder
        public ByteString getContentBytes() {
            return ByteString.copyFromUtf8(this.content_);
        }

        @Override // com.p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage.TopEffectOrBuilder
        public long getDuration() {
            return this.duration_;
        }

        @Override // com.p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage.TopEffectOrBuilder
        public String getEffectBackgroundUrl() {
            return this.effectBackgroundUrl_;
        }

        @Override // com.p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage.TopEffectOrBuilder
        public ByteString getEffectBackgroundUrlBytes() {
            return ByteString.copyFromUtf8(this.effectBackgroundUrl_);
        }

        @Override // com.p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage.TopEffectOrBuilder
        public String getEndBackendColor() {
            return this.endBackendColor_;
        }

        @Override // com.p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage.TopEffectOrBuilder
        public ByteString getEndBackendColorBytes() {
            return ByteString.copyFromUtf8(this.endBackendColor_);
        }

        @Override // com.p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage.TopEffectOrBuilder
        public String getRoomId() {
            return this.roomId_;
        }

        @Override // com.p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage.TopEffectOrBuilder
        public ByteString getRoomIdBytes() {
            return ByteString.copyFromUtf8(this.roomId_);
        }

        public int getSerializedSize() {
            int i = ((GeneratedMessageLite) this).memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int iK = !this.userName_.isEmpty() ? CodedOutputStream.K(1, getUserName()) : 0;
            if (!this.avatarUrl_.isEmpty()) {
                iK += CodedOutputStream.K(2, getAvatarUrl());
            }
            if (!this.content_.isEmpty()) {
                iK += CodedOutputStream.K(3, getContent());
            }
            if (!this.startBackendColor_.isEmpty()) {
                iK += CodedOutputStream.K(4, getStartBackendColor());
            }
            if (!this.endBackendColor_.isEmpty()) {
                iK += CodedOutputStream.K(5, getEndBackendColor());
            }
            long j = this.duration_;
            if (j != 0) {
                iK += CodedOutputStream.v(6, j);
            }
            if (!this.roomId_.isEmpty()) {
                iK += CodedOutputStream.K(7, getRoomId());
            }
            if (!this.backgroundUrl_.isEmpty()) {
                iK += CodedOutputStream.K(8, getBackgroundUrl());
            }
            if (!this.backgroundSVGAUrl_.isEmpty()) {
                iK += CodedOutputStream.K(9, getBackgroundSVGAUrl());
            }
            if (!this.effectBackgroundUrl_.isEmpty()) {
                iK += CodedOutputStream.K(10, getEffectBackgroundUrl());
            }
            if (!this.subtitleColor_.isEmpty()) {
                iK += CodedOutputStream.K(11, getSubtitleColor());
            }
            ((GeneratedMessageLite) this).memoizedSerializedSize = iK;
            return iK;
        }

        @Override // com.p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage.TopEffectOrBuilder
        public String getStartBackendColor() {
            return this.startBackendColor_;
        }

        @Override // com.p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage.TopEffectOrBuilder
        public ByteString getStartBackendColorBytes() {
            return ByteString.copyFromUtf8(this.startBackendColor_);
        }

        @Override // com.p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage.TopEffectOrBuilder
        public String getSubtitleColor() {
            return this.subtitleColor_;
        }

        @Override // com.p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage.TopEffectOrBuilder
        public ByteString getSubtitleColorBytes() {
            return ByteString.copyFromUtf8(this.subtitleColor_);
        }

        @Override // com.p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage.TopEffectOrBuilder
        public String getUserName() {
            return this.userName_;
        }

        @Override // com.p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage.TopEffectOrBuilder
        public ByteString getUserNameBytes() {
            return ByteString.copyFromUtf8(this.userName_);
        }

        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (!this.userName_.isEmpty()) {
                codedOutputStream.D0(1, getUserName());
            }
            if (!this.avatarUrl_.isEmpty()) {
                codedOutputStream.D0(2, getAvatarUrl());
            }
            if (!this.content_.isEmpty()) {
                codedOutputStream.D0(3, getContent());
            }
            if (!this.startBackendColor_.isEmpty()) {
                codedOutputStream.D0(4, getStartBackendColor());
            }
            if (!this.endBackendColor_.isEmpty()) {
                codedOutputStream.D0(5, getEndBackendColor());
            }
            long j = this.duration_;
            if (j != 0) {
                codedOutputStream.u0(6, j);
            }
            if (!this.roomId_.isEmpty()) {
                codedOutputStream.D0(7, getRoomId());
            }
            if (!this.backgroundUrl_.isEmpty()) {
                codedOutputStream.D0(8, getBackgroundUrl());
            }
            if (!this.backgroundSVGAUrl_.isEmpty()) {
                codedOutputStream.D0(9, getBackgroundSVGAUrl());
            }
            if (!this.effectBackgroundUrl_.isEmpty()) {
                codedOutputStream.D0(10, getEffectBackgroundUrl());
            }
            if (this.subtitleColor_.isEmpty()) {
                return;
            }
            codedOutputStream.D0(11, getSubtitleColor());
        }

        public static TopEffect parseDelimitedFrom(InputStream inputStream, h hVar) throws IOException {
            return (TopEffect) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, hVar);
        }

        public static TopEffect parseFrom(ByteString byteString, h hVar) throws InvalidProtocolBufferException {
            return (TopEffect) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, hVar);
        }

        public static TopEffect parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (TopEffect) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static TopEffect parseFrom(byte[] bArr, h hVar) throws InvalidProtocolBufferException {
            return (TopEffect) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, hVar);
        }

        public static TopEffect parseFrom(InputStream inputStream) throws IOException {
            return (TopEffect) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static TopEffect parseFrom(InputStream inputStream, h hVar) throws IOException {
            return (TopEffect) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, hVar);
        }

        public static TopEffect parseFrom(e eVar) throws IOException {
            return (TopEffect) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, eVar);
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.toBuilder();
        }

        public static TopEffect parseFrom(e eVar, h hVar) throws IOException {
            return (TopEffect) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, eVar, hVar);
        }
    }

    public static final class VideoEffectExtra extends GeneratedMessageLite<VideoEffectExtra, Builder> implements VideoEffectExtraOrBuilder {
        private static final VideoEffectExtra DEFAULT_INSTANCE;
        public static final int ID_FIELD_NUMBER = 1;
        private static volatile i860<VideoEffectExtra> PARSER = null;
        public static final int TYPE_FIELD_NUMBER = 2;
        public static final int VALUE_FIELD_NUMBER = 3;
        private long type_;
        private String id_ = "";
        private String value_ = "";

        public static final class Builder extends GeneratedMessageLite.b<VideoEffectExtra, Builder> implements VideoEffectExtraOrBuilder {
            private Builder() {
                super(VideoEffectExtra.DEFAULT_INSTANCE);
            }

            public Builder clearId() {
                copyOnWrite();
                ((VideoEffectExtra) ((GeneratedMessageLite.b) this).instance).clearId();
                return this;
            }

            public Builder clearType() {
                copyOnWrite();
                ((VideoEffectExtra) ((GeneratedMessageLite.b) this).instance).clearType();
                return this;
            }

            public Builder clearValue() {
                copyOnWrite();
                ((VideoEffectExtra) ((GeneratedMessageLite.b) this).instance).clearValue();
                return this;
            }

            @Override // com.p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage.VideoEffectExtraOrBuilder
            public String getId() {
                return ((VideoEffectExtra) ((GeneratedMessageLite.b) this).instance).getId();
            }

            @Override // com.p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage.VideoEffectExtraOrBuilder
            public ByteString getIdBytes() {
                return ((VideoEffectExtra) ((GeneratedMessageLite.b) this).instance).getIdBytes();
            }

            @Override // com.p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage.VideoEffectExtraOrBuilder
            public long getType() {
                return ((VideoEffectExtra) ((GeneratedMessageLite.b) this).instance).getType();
            }

            @Override // com.p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage.VideoEffectExtraOrBuilder
            public String getValue() {
                return ((VideoEffectExtra) ((GeneratedMessageLite.b) this).instance).getValue();
            }

            @Override // com.p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage.VideoEffectExtraOrBuilder
            public ByteString getValueBytes() {
                return ((VideoEffectExtra) ((GeneratedMessageLite.b) this).instance).getValueBytes();
            }

            public Builder setId(String str) {
                copyOnWrite();
                ((VideoEffectExtra) ((GeneratedMessageLite.b) this).instance).setId(str);
                return this;
            }

            public Builder setIdBytes(ByteString byteString) {
                copyOnWrite();
                ((VideoEffectExtra) ((GeneratedMessageLite.b) this).instance).setIdBytes(byteString);
                return this;
            }

            public Builder setType(long j) {
                copyOnWrite();
                ((VideoEffectExtra) ((GeneratedMessageLite.b) this).instance).setType(j);
                return this;
            }

            public Builder setValue(String str) {
                copyOnWrite();
                ((VideoEffectExtra) ((GeneratedMessageLite.b) this).instance).setValue(str);
                return this;
            }

            public Builder setValueBytes(ByteString byteString) {
                copyOnWrite();
                ((VideoEffectExtra) ((GeneratedMessageLite.b) this).instance).setValueBytes(byteString);
                return this;
            }
        }

        static {
            VideoEffectExtra videoEffectExtra = new VideoEffectExtra();
            DEFAULT_INSTANCE = videoEffectExtra;
            videoEffectExtra.makeImmutable();
        }

        private VideoEffectExtra() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearId() {
            this.id_ = getDefaultInstance().getId();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearType() {
            this.type_ = 0L;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearValue() {
            this.value_ = getDefaultInstance().getValue();
        }

        public static VideoEffectExtra getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder(VideoEffectExtra videoEffectExtra) {
            return (Builder) ((Builder) DEFAULT_INSTANCE.toBuilder()).mergeFrom(videoEffectExtra);
        }

        public static VideoEffectExtra parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (VideoEffectExtra) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static VideoEffectExtra parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (VideoEffectExtra) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static i860<VideoEffectExtra> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setId(String str) {
            str.getClass();
            this.id_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setIdBytes(ByteString byteString) {
            byteString.getClass();
            a.checkByteStringIsUtf8(byteString);
            this.id_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setType(long j) {
            this.type_ = j;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setValue(String str) {
            str.getClass();
            this.value_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setValueBytes(ByteString byteString) {
            byteString.getClass();
            a.checkByteStringIsUtf8(byteString);
            this.value_ = byteString.toStringUtf8();
        }

        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            boolean z = false;
            switch (C03491.f1653xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new VideoEffectExtra();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                    return null;
                case 4:
                    return new Builder();
                case 5:
                    GeneratedMessageLite.h hVar = (GeneratedMessageLite.h) obj;
                    VideoEffectExtra videoEffectExtra = (VideoEffectExtra) obj2;
                    this.id_ = hVar.f(!this.id_.isEmpty(), this.id_, !videoEffectExtra.id_.isEmpty(), videoEffectExtra.id_);
                    long j = this.type_;
                    boolean z2 = j != 0;
                    long j2 = videoEffectExtra.type_;
                    this.type_ = hVar.i(z2, j, j2 != 0, j2);
                    this.value_ = hVar.f(!this.value_.isEmpty(), this.value_, !videoEffectExtra.value_.isEmpty(), videoEffectExtra.value_);
                    GeneratedMessageLite.g gVar = GeneratedMessageLite.g.INSTANCE;
                    return this;
                case 6:
                    e eVar = (e) obj;
                    while (!z) {
                        try {
                            int iM = eVar.M();
                            if (iM != 0) {
                                if (iM == 10) {
                                    this.id_ = eVar.L();
                                } else if (iM == 16) {
                                    this.type_ = eVar.v();
                                } else if (iM == 26) {
                                    this.value_ = eVar.L();
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
                        synchronized (VideoEffectExtra.class) {
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

        @Override // com.p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage.VideoEffectExtraOrBuilder
        public String getId() {
            return this.id_;
        }

        @Override // com.p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage.VideoEffectExtraOrBuilder
        public ByteString getIdBytes() {
            return ByteString.copyFromUtf8(this.id_);
        }

        public int getSerializedSize() {
            int i = ((GeneratedMessageLite) this).memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int iK = !this.id_.isEmpty() ? CodedOutputStream.K(1, getId()) : 0;
            long j = this.type_;
            if (j != 0) {
                iK += CodedOutputStream.v(2, j);
            }
            if (!this.value_.isEmpty()) {
                iK += CodedOutputStream.K(3, getValue());
            }
            ((GeneratedMessageLite) this).memoizedSerializedSize = iK;
            return iK;
        }

        @Override // com.p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage.VideoEffectExtraOrBuilder
        public long getType() {
            return this.type_;
        }

        @Override // com.p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage.VideoEffectExtraOrBuilder
        public String getValue() {
            return this.value_;
        }

        @Override // com.p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage.VideoEffectExtraOrBuilder
        public ByteString getValueBytes() {
            return ByteString.copyFromUtf8(this.value_);
        }

        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (!this.id_.isEmpty()) {
                codedOutputStream.D0(1, getId());
            }
            long j = this.type_;
            if (j != 0) {
                codedOutputStream.u0(2, j);
            }
            if (this.value_.isEmpty()) {
                return;
            }
            codedOutputStream.D0(3, getValue());
        }

        public static VideoEffectExtra parseDelimitedFrom(InputStream inputStream, h hVar) throws IOException {
            return (VideoEffectExtra) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, hVar);
        }

        public static VideoEffectExtra parseFrom(ByteString byteString, h hVar) throws InvalidProtocolBufferException {
            return (VideoEffectExtra) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, hVar);
        }

        public static VideoEffectExtra parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (VideoEffectExtra) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static VideoEffectExtra parseFrom(byte[] bArr, h hVar) throws InvalidProtocolBufferException {
            return (VideoEffectExtra) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, hVar);
        }

        public static VideoEffectExtra parseFrom(InputStream inputStream) throws IOException {
            return (VideoEffectExtra) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static VideoEffectExtra parseFrom(InputStream inputStream, h hVar) throws IOException {
            return (VideoEffectExtra) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, hVar);
        }

        public static VideoEffectExtra parseFrom(e eVar) throws IOException {
            return (VideoEffectExtra) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, eVar);
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.toBuilder();
        }

        public static VideoEffectExtra parseFrom(e eVar, h hVar) throws IOException {
            return (VideoEffectExtra) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, eVar, hVar);
        }
    }
}
