package com.p051p1.mobile.longlink.msg.livecampaign;

import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.google.protobuf.AbstractC3426a;
import com.google.protobuf.ByteString;
import com.google.protobuf.C3430e;
import com.google.protobuf.C3433h;
import com.google.protobuf.C3437l;
import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InterfaceC3442q;
import com.google.protobuf.InvalidProtocolBufferException;
import com.p051p1.mobile.longlink.msg.template.Template;
import java.io.IOException;
import java.io.InputStream;
import java.util.Collections;
import java.util.List;
import org.spongycastle.asn1.eac.EACTags;
import p153l.iig0;
import p153l.l710;
import p153l.lfz;
import p153l.ng60;

/* JADX INFO: loaded from: classes8.dex */
public final class LongLinkSocketMessage {

    /* JADX INFO: renamed from: com.p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage$1 */
    public static /* synthetic */ class C45881 {

        /* JADX INFO: renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f16673xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f16673xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f16673xa1df5c61[GeneratedMessageLite.MethodToInvoke.IS_INITIALIZED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f16673xa1df5c61[GeneratedMessageLite.MethodToInvoke.MAKE_IMMUTABLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f16673xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f16673xa1df5c61[GeneratedMessageLite.MethodToInvoke.VISIT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f16673xa1df5c61[GeneratedMessageLite.MethodToInvoke.MERGE_FROM_STREAM.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f16673xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f16673xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    public interface DragonScourgeRecordsOrBuilder extends lfz {
        @Override // p153l.lfz
        /* synthetic */ InterfaceC3442q getDefaultInstanceForType();

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

        @Override // p153l.lfz
        /* synthetic */ boolean isInitialized();
    }

    public interface H5DrawerLoadingOrBuilder extends lfz {
        @Override // p153l.lfz
        /* synthetic */ InterfaceC3442q getDefaultInstanceForType();

        String getEndColor();

        ByteString getEndColorBytes();

        String getImageUrl();

        ByteString getImageUrlBytes();

        String getLoadingType();

        ByteString getLoadingTypeBytes();

        String getStartColor();

        ByteString getStartColorBytes();

        long getTransparency();

        @Override // p153l.lfz
        /* synthetic */ boolean isInitialized();
    }

    public interface H5DrawerOrBuilder extends lfz {
        String getCloseButtonUrl();

        ByteString getCloseButtonUrlBytes();

        @Override // p153l.lfz
        /* synthetic */ InterfaceC3442q getDefaultInstanceForType();

        long getFadingSeconds();

        String getH5Url();

        ByteString getH5UrlBytes();

        double getHeight();

        H5DrawerLoading getLoading();

        double getWidth();

        boolean hasLoading();

        @Override // p153l.lfz
        /* synthetic */ boolean isInitialized();
    }

    public interface H5PopUpOrBuilder extends lfz {
        @Override // p153l.lfz
        /* synthetic */ InterfaceC3442q getDefaultInstanceForType();

        String getJumpScheme();

        ByteString getJumpSchemeBytes();

        @Override // p153l.lfz
        /* synthetic */ boolean isInitialized();
    }

    public interface LiveAnimationPlayMsgOrBuilder extends lfz {
        String getAnimationType();

        ByteString getAnimationTypeBytes();

        @Override // p153l.lfz
        /* synthetic */ InterfaceC3442q getDefaultInstanceForType();

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

        @Override // p153l.lfz
        /* synthetic */ boolean isInitialized();
    }

    public interface LotteryGiftRedPacketAnimationMsgOrBuilder extends lfz {
        @Override // p153l.lfz
        /* synthetic */ InterfaceC3442q getDefaultInstanceForType();

        LotteryGiftRedPacketGift getGift();

        LotteryGiftRedPacketSender getSender();

        long getShowSeconds();

        boolean hasGift();

        boolean hasSender();

        @Override // p153l.lfz
        /* synthetic */ boolean isInitialized();
    }

    public interface LotteryGiftRedPacketGiftOrBuilder extends lfz {
        long getAmount();

        @Override // p153l.lfz
        /* synthetic */ InterfaceC3442q getDefaultInstanceForType();

        String getId();

        ByteString getIdBytes();

        String getName();

        ByteString getNameBytes();

        long getNum();

        String getUrl();

        ByteString getUrlBytes();

        @Override // p153l.lfz
        /* synthetic */ boolean isInitialized();
    }

    public interface LotteryGiftRedPacketSenderOrBuilder extends lfz {
        String getAvatarUrl();

        ByteString getAvatarUrlBytes();

        @Override // p153l.lfz
        /* synthetic */ InterfaceC3442q getDefaultInstanceForType();

        String getName();

        ByteString getNameBytes();

        String getUserId();

        ByteString getUserIdBytes();

        @Override // p153l.lfz
        /* synthetic */ boolean isInitialized();
    }

    public interface MysteryBoxRecordOrBuilder extends lfz {
        @Override // p153l.lfz
        /* synthetic */ InterfaceC3442q getDefaultInstanceForType();

        String getIconUrl();

        ByteString getIconUrlBytes();

        long getNum();

        MysteryBoxReward getRewards(int i);

        int getRewardsCount();

        List<MysteryBoxReward> getRewardsList();

        Template.TemplateData getTemplate();

        boolean hasTemplate();

        @Override // p153l.lfz
        /* synthetic */ boolean isInitialized();
    }

    public interface MysteryBoxRewardOrBuilder extends lfz {
        @Override // p153l.lfz
        /* synthetic */ InterfaceC3442q getDefaultInstanceForType();

        String getName();

        ByteString getNameBytes();

        long getNum();

        String getUrl();

        ByteString getUrlBytes();

        @Override // p153l.lfz
        /* synthetic */ boolean isInitialized();
    }

    public interface OperationAnimationEnterOrBuilder extends lfz {
        String getAnimationType();

        ByteString getAnimationTypeBytes();

        @Override // p153l.lfz
        /* synthetic */ InterfaceC3442q getDefaultInstanceForType();

        String getImageUrl();

        ByteString getImageUrlBytes();

        boolean getIsTop();

        @Override // p153l.lfz
        /* synthetic */ boolean isInitialized();
    }

    public interface OperationAnimationOrBuilder extends lfz {
        @Override // p153l.lfz
        /* synthetic */ InterfaceC3442q getDefaultInstanceForType();

        OperationAnimationEnter getEnter();

        boolean hasEnter();

        @Override // p153l.lfz
        /* synthetic */ boolean isInitialized();
    }

    public interface OperationHierarchyOrBuilder extends lfz {
        @Override // p153l.lfz
        /* synthetic */ InterfaceC3442q getDefaultInstanceForType();

        long getUserHierarchy();

        @Override // p153l.lfz
        /* synthetic */ boolean isInitialized();
    }

    public interface OperationPopupNoticeOrBuilder extends lfz {
        @Override // p153l.lfz
        /* synthetic */ InterfaceC3442q getDefaultInstanceForType();

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

        @Override // p153l.lfz
        /* synthetic */ boolean isInitialized();
    }

    public interface OperationSubscriptionOrBuilder extends lfz {
        String getData();

        ByteString getDataBytes();

        @Override // p153l.lfz
        /* synthetic */ InterfaceC3442q getDefaultInstanceForType();

        String getSubscribeType();

        ByteString getSubscribeTypeBytes();

        String getUpdateType();

        ByteString getUpdateTypeBytes();

        @Override // p153l.lfz
        /* synthetic */ boolean isInitialized();
    }

    public interface OperationUpdateNoticeOrBuilder extends lfz {
        OperationAnimation getAnimation();

        String getData();

        ByteString getDataBytes();

        @Override // p153l.lfz
        /* synthetic */ InterfaceC3442q getDefaultInstanceForType();

        String getOperationType();

        ByteString getOperationTypeBytes();

        OperationUpdateNotice.OperationUpdatePosition getPosition();

        int getPositionValue();

        long getRandomDelaySeconds();

        OperationSubscription getSubscription();

        long getTimestamp();

        boolean hasAnimation();

        boolean hasSubscription();

        @Override // p153l.lfz
        /* synthetic */ boolean isInitialized();
    }

    public interface PopUpContentUpdateNoticeOrBuilder extends lfz {
        String getData();

        ByteString getDataBytes();

        @Override // p153l.lfz
        /* synthetic */ InterfaceC3442q getDefaultInstanceForType();

        String getRoomId();

        ByteString getRoomIdBytes();

        String getUpdateType();

        ByteString getUpdateTypeBytes();

        String getUrl();

        ByteString getUrlBytes();

        @Override // p153l.lfz
        /* synthetic */ boolean isInitialized();
    }

    public interface PopUpOrBuilder extends lfz {
        String getCampaignId();

        ByteString getCampaignIdBytes();

        @Override // p153l.lfz
        /* synthetic */ InterfaceC3442q getDefaultInstanceForType();

        String getRoomId();

        ByteString getRoomIdBytes();

        @Override // p153l.lfz
        /* synthetic */ boolean isInitialized();
    }

    public interface ReceiveLiveRedPacketMsgOrBuilder extends lfz {
        long getAmount();

        @Override // p153l.lfz
        /* synthetic */ InterfaceC3442q getDefaultInstanceForType();

        Template.TemplateData getTemplate();

        String getUserId();

        ByteString getUserIdBytes();

        String getUserName();

        ByteString getUserNameBytes();

        boolean hasTemplate();

        @Override // p153l.lfz
        /* synthetic */ boolean isInitialized();
    }

    public interface SendLiveRedPacketMsgOrBuilder extends lfz {
        @Override // p153l.lfz
        /* synthetic */ InterfaceC3442q getDefaultInstanceForType();

        long getNumberOfPackets();

        String getRedPacketID();

        ByteString getRedPacketIDBytes();

        String getSendUserID();

        ByteString getSendUserIDBytes();

        Template.TemplateData getTemplate();

        String getToken();

        ByteString getTokenBytes();

        boolean hasTemplate();

        @Override // p153l.lfz
        /* synthetic */ boolean isInitialized();
    }

    public interface ShadingOrBuilder extends lfz {
        @Override // p153l.lfz
        /* synthetic */ InterfaceC3442q getDefaultInstanceForType();

        String getEndColor();

        ByteString getEndColorBytes();

        String getImageUrl();

        ByteString getImageUrlBytes();

        String getShadingType();

        ByteString getShadingTypeBytes();

        String getStartColor();

        ByteString getStartColorBytes();

        long getTransparency();

        @Override // p153l.lfz
        /* synthetic */ boolean isInitialized();
    }

    public interface SvgaEffectExtraOrBuilder extends lfz {
        @Override // p153l.lfz
        /* synthetic */ InterfaceC3442q getDefaultInstanceForType();

        String getId();

        ByteString getIdBytes();

        String getTextColor();

        ByteString getTextColorBytes();

        long getTextSize();

        long getType();

        String getValue();

        ByteString getValueBytes();

        @Override // p153l.lfz
        /* synthetic */ boolean isInitialized();
    }

    public interface TextDrawerContentOrBuilder extends lfz {
        @Override // p153l.lfz
        /* synthetic */ InterfaceC3442q getDefaultInstanceForType();

        OperationHierarchy getHierarchy();

        String getTemplateFields(int i);

        ByteString getTemplateFieldsBytes(int i);

        int getTemplateFieldsCount();

        List<String> getTemplateFieldsList();

        long getTemplateId();

        boolean hasHierarchy();

        @Override // p153l.lfz
        /* synthetic */ boolean isInitialized();
    }

    public interface TextDrawerOrBuilder extends lfz {
        String getActionAfterClick();

        ByteString getActionAfterClickBytes();

        TextDrawerContent getContent();

        @Override // p153l.lfz
        /* synthetic */ InterfaceC3442q getDefaultInstanceForType();

        String getIconUrl();

        ByteString getIconUrlBytes();

        String getJumpScheme();

        ByteString getJumpSchemeBytes();

        Shading getShading();

        boolean hasContent();

        boolean hasShading();

        @Override // p153l.lfz
        /* synthetic */ boolean isInitialized();
    }

    public interface TopEffectOrBuilder extends lfz {
        String getAvatarUrl();

        ByteString getAvatarUrlBytes();

        String getBackgroundSVGAUrl();

        ByteString getBackgroundSVGAUrlBytes();

        String getBackgroundUrl();

        ByteString getBackgroundUrlBytes();

        String getContent();

        ByteString getContentBytes();

        @Override // p153l.lfz
        /* synthetic */ InterfaceC3442q getDefaultInstanceForType();

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

        @Override // p153l.lfz
        /* synthetic */ boolean isInitialized();
    }

    public interface VideoEffectExtraOrBuilder extends lfz {
        @Override // p153l.lfz
        /* synthetic */ InterfaceC3442q getDefaultInstanceForType();

        String getId();

        ByteString getIdBytes();

        long getType();

        String getValue();

        ByteString getValueBytes();

        @Override // p153l.lfz
        /* synthetic */ boolean isInitialized();
    }

    private LongLinkSocketMessage() {
    }

    public static void registerAllExtensions(C3433h c3433h) {
    }

    public static final class OperationPopupNotice extends GeneratedMessageLite<OperationPopupNotice, Builder> implements OperationPopupNoticeOrBuilder {
        private static final OperationPopupNotice DEFAULT_INSTANCE;
        public static final int DRAWER_FIELD_NUMBER = 4;
        public static final int H5POPUP_FIELD_NUMBER = 5;
        public static final int OPERATIONTYPE_FIELD_NUMBER = 1;
        private static volatile ng60<OperationPopupNotice> PARSER = null;
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
                this.drawer_ = H5Drawer.newBuilder(this.drawer_).mergeFrom(h5Drawer).buildPartial();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeH5PopUp(H5PopUp h5PopUp) {
            H5PopUp h5PopUp2 = this.h5PopUp_;
            if (h5PopUp2 == null || h5PopUp2 == H5PopUp.getDefaultInstance()) {
                this.h5PopUp_ = h5PopUp;
            } else {
                this.h5PopUp_ = H5PopUp.newBuilder(this.h5PopUp_).mergeFrom(h5PopUp).buildPartial();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeTextDrawer(TextDrawer textDrawer) {
            TextDrawer textDrawer2 = this.textDrawer_;
            if (textDrawer2 == null || textDrawer2 == TextDrawer.getDefaultInstance()) {
                this.textDrawer_ = textDrawer;
            } else {
                this.textDrawer_ = TextDrawer.newBuilder(this.textDrawer_).mergeFrom(textDrawer).buildPartial();
            }
        }

        public static Builder newBuilder(OperationPopupNotice operationPopupNotice) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(operationPopupNotice);
        }

        public static OperationPopupNotice parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (OperationPopupNotice) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static OperationPopupNotice parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (OperationPopupNotice) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static ng60<OperationPopupNotice> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setDrawer(H5Drawer.Builder builder) {
            this.drawer_ = builder.build();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setH5PopUp(H5PopUp.Builder builder) {
            this.h5PopUp_ = builder.build();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setOperationType(String str) {
            str.getClass();
            this.operationType_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setOperationTypeBytes(ByteString byteString) {
            byteString.getClass();
            AbstractC3426a.checkByteStringIsUtf8(byteString);
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
            this.textDrawer_ = builder.build();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTimestamp(long j) {
            this.timestamp_ = j;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            boolean z = false;
            switch (C45881.f16673xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new OperationPopupNotice();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                    return null;
                case 4:
                    return new Builder();
                case 5:
                    GeneratedMessageLite.InterfaceC3409h interfaceC3409h = (GeneratedMessageLite.InterfaceC3409h) obj;
                    OperationPopupNotice operationPopupNotice = (OperationPopupNotice) obj2;
                    this.operationType_ = interfaceC3409h.mo17052f(!this.operationType_.isEmpty(), this.operationType_, !operationPopupNotice.operationType_.isEmpty(), operationPopupNotice.operationType_);
                    int i = this.popupType_;
                    boolean z2 = i != 0;
                    int i2 = operationPopupNotice.popupType_;
                    this.popupType_ = interfaceC3409h.mo17051e(z2, i, i2 != 0, i2);
                    this.textDrawer_ = (TextDrawer) interfaceC3409h.mo17061o(this.textDrawer_, operationPopupNotice.textDrawer_);
                    this.drawer_ = (H5Drawer) interfaceC3409h.mo17061o(this.drawer_, operationPopupNotice.drawer_);
                    this.h5PopUp_ = (H5PopUp) interfaceC3409h.mo17061o(this.h5PopUp_, operationPopupNotice.h5PopUp_);
                    long j = this.timestamp_;
                    boolean z3 = j != 0;
                    long j2 = operationPopupNotice.timestamp_;
                    this.timestamp_ = interfaceC3409h.mo17055i(z3, j, j2 != 0, j2);
                    GeneratedMessageLite.C3408g c3408g = GeneratedMessageLite.C3408g.INSTANCE;
                    return this;
                case 6:
                    C3430e c3430e = (C3430e) obj;
                    C3433h c3433h = (C3433h) obj2;
                    while (!z) {
                        try {
                            int iM17171M = c3430e.m17171M();
                            if (iM17171M != 0) {
                                if (iM17171M == 10) {
                                    this.operationType_ = c3430e.m17170L();
                                } else if (iM17171M == 16) {
                                    this.popupType_ = c3430e.m17191p();
                                } else if (iM17171M == 26) {
                                    TextDrawer textDrawer = this.textDrawer_;
                                    TextDrawer.Builder builder = textDrawer != null ? textDrawer.toBuilder() : null;
                                    TextDrawer textDrawer2 = (TextDrawer) c3430e.m17198w(TextDrawer.parser(), c3433h);
                                    this.textDrawer_ = textDrawer2;
                                    if (builder != null) {
                                        builder.mergeFrom(textDrawer2);
                                        this.textDrawer_ = builder.buildPartial();
                                    }
                                } else if (iM17171M == 34) {
                                    H5Drawer h5Drawer = this.drawer_;
                                    H5Drawer.Builder builder2 = h5Drawer != null ? h5Drawer.toBuilder() : null;
                                    H5Drawer h5Drawer2 = (H5Drawer) c3430e.m17198w(H5Drawer.parser(), c3433h);
                                    this.drawer_ = h5Drawer2;
                                    if (builder2 != null) {
                                        builder2.mergeFrom(h5Drawer2);
                                        this.drawer_ = builder2.buildPartial();
                                    }
                                } else if (iM17171M == 42) {
                                    H5PopUp h5PopUp = this.h5PopUp_;
                                    H5PopUp.Builder builder3 = h5PopUp != null ? h5PopUp.toBuilder() : null;
                                    H5PopUp h5PopUp2 = (H5PopUp) c3430e.m17198w(H5PopUp.parser(), c3433h);
                                    this.h5PopUp_ = h5PopUp2;
                                    if (builder3 != null) {
                                        builder3.mergeFrom(h5PopUp2);
                                        this.h5PopUp_ = builder3.buildPartial();
                                    }
                                } else if (iM17171M == 48) {
                                    this.timestamp_ = c3430e.m17197v();
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
                        synchronized (OperationPopupNotice.class) {
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

        @Override // com.google.protobuf.InterfaceC3442q
        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int iM16956K = !this.operationType_.isEmpty() ? CodedOutputStream.m16956K(1, getOperationType()) : 0;
            if (this.popupType_ != OperationPopupType.Unknown.getNumber()) {
                iM16956K += CodedOutputStream.m16977m(2, this.popupType_);
            }
            if (this.textDrawer_ != null) {
                iM16956K += CodedOutputStream.m16948C(3, getTextDrawer());
            }
            if (this.drawer_ != null) {
                iM16956K += CodedOutputStream.m16948C(4, getDrawer());
            }
            if (this.h5PopUp_ != null) {
                iM16956K += CodedOutputStream.m16948C(5, getH5PopUp());
            }
            long j = this.timestamp_;
            if (j != 0) {
                iM16956K += CodedOutputStream.m16986v(6, j);
            }
            this.memoizedSerializedSize = iM16956K;
            return iM16956K;
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

        @Override // com.google.protobuf.InterfaceC3442q
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (!this.operationType_.isEmpty()) {
                codedOutputStream.mo16994D0(1, getOperationType());
            }
            if (this.popupType_ != OperationPopupType.Unknown.getNumber()) {
                codedOutputStream.m17015i0(2, this.popupType_);
            }
            if (this.textDrawer_ != null) {
                codedOutputStream.mo17029w0(3, getTextDrawer());
            }
            if (this.drawer_ != null) {
                codedOutputStream.mo17029w0(4, getDrawer());
            }
            if (this.h5PopUp_ != null) {
                codedOutputStream.mo17029w0(5, getH5PopUp());
            }
            long j = this.timestamp_;
            if (j != 0) {
                codedOutputStream.m17027u0(6, j);
            }
        }

        public enum OperationPopupType implements C3437l.c {
            Unknown(0),
            H5Drawer(1),
            TextDrawer(2),
            H5PopUp(3),
            UNRECOGNIZED(-1);

            public static final int H5Drawer_VALUE = 1;
            public static final int H5PopUp_VALUE = 3;
            public static final int TextDrawer_VALUE = 2;
            public static final int Unknown_VALUE = 0;
            private static final C3437l.d<OperationPopupType> internalValueMap = new C3437l.d<OperationPopupType>() { // from class: com.p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage.OperationPopupNotice.OperationPopupType.1
                @Override // com.google.protobuf.C3437l.d
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

            public static C3437l.d<OperationPopupType> internalGetValueMap() {
                return internalValueMap;
            }

            @Override // com.google.protobuf.C3437l.c
            public final int getNumber() {
                return this.value;
            }

            @Deprecated
            public static OperationPopupType valueOf(int i) {
                return forNumber(i);
            }
        }

        public static OperationPopupNotice parseDelimitedFrom(InputStream inputStream, C3433h c3433h) throws IOException {
            return (OperationPopupNotice) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, c3433h);
        }

        public static OperationPopupNotice parseFrom(ByteString byteString, C3433h c3433h) throws InvalidProtocolBufferException {
            return (OperationPopupNotice) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, c3433h);
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

        public static final class Builder extends GeneratedMessageLite.AbstractC3403b<OperationPopupNotice, Builder> implements OperationPopupNoticeOrBuilder {
            private Builder() {
                super(OperationPopupNotice.DEFAULT_INSTANCE);
            }

            public Builder clearDrawer() {
                copyOnWrite();
                ((OperationPopupNotice) this.instance).clearDrawer();
                return this;
            }

            public Builder clearH5PopUp() {
                copyOnWrite();
                ((OperationPopupNotice) this.instance).clearH5PopUp();
                return this;
            }

            public Builder clearOperationType() {
                copyOnWrite();
                ((OperationPopupNotice) this.instance).clearOperationType();
                return this;
            }

            public Builder clearPopupType() {
                copyOnWrite();
                ((OperationPopupNotice) this.instance).clearPopupType();
                return this;
            }

            public Builder clearTextDrawer() {
                copyOnWrite();
                ((OperationPopupNotice) this.instance).clearTextDrawer();
                return this;
            }

            public Builder clearTimestamp() {
                copyOnWrite();
                ((OperationPopupNotice) this.instance).clearTimestamp();
                return this;
            }

            @Override // com.p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage.OperationPopupNoticeOrBuilder
            public H5Drawer getDrawer() {
                return ((OperationPopupNotice) this.instance).getDrawer();
            }

            @Override // com.p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage.OperationPopupNoticeOrBuilder
            public H5PopUp getH5PopUp() {
                return ((OperationPopupNotice) this.instance).getH5PopUp();
            }

            @Override // com.p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage.OperationPopupNoticeOrBuilder
            public String getOperationType() {
                return ((OperationPopupNotice) this.instance).getOperationType();
            }

            @Override // com.p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage.OperationPopupNoticeOrBuilder
            public ByteString getOperationTypeBytes() {
                return ((OperationPopupNotice) this.instance).getOperationTypeBytes();
            }

            @Override // com.p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage.OperationPopupNoticeOrBuilder
            public OperationPopupType getPopupType() {
                return ((OperationPopupNotice) this.instance).getPopupType();
            }

            @Override // com.p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage.OperationPopupNoticeOrBuilder
            public int getPopupTypeValue() {
                return ((OperationPopupNotice) this.instance).getPopupTypeValue();
            }

            @Override // com.p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage.OperationPopupNoticeOrBuilder
            public TextDrawer getTextDrawer() {
                return ((OperationPopupNotice) this.instance).getTextDrawer();
            }

            @Override // com.p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage.OperationPopupNoticeOrBuilder
            public long getTimestamp() {
                return ((OperationPopupNotice) this.instance).getTimestamp();
            }

            @Override // com.p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage.OperationPopupNoticeOrBuilder
            public boolean hasDrawer() {
                return ((OperationPopupNotice) this.instance).hasDrawer();
            }

            @Override // com.p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage.OperationPopupNoticeOrBuilder
            public boolean hasH5PopUp() {
                return ((OperationPopupNotice) this.instance).hasH5PopUp();
            }

            @Override // com.p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage.OperationPopupNoticeOrBuilder
            public boolean hasTextDrawer() {
                return ((OperationPopupNotice) this.instance).hasTextDrawer();
            }

            public Builder mergeDrawer(H5Drawer h5Drawer) {
                copyOnWrite();
                ((OperationPopupNotice) this.instance).mergeDrawer(h5Drawer);
                return this;
            }

            public Builder mergeH5PopUp(H5PopUp h5PopUp) {
                copyOnWrite();
                ((OperationPopupNotice) this.instance).mergeH5PopUp(h5PopUp);
                return this;
            }

            public Builder mergeTextDrawer(TextDrawer textDrawer) {
                copyOnWrite();
                ((OperationPopupNotice) this.instance).mergeTextDrawer(textDrawer);
                return this;
            }

            public Builder setDrawer(H5Drawer h5Drawer) {
                copyOnWrite();
                ((OperationPopupNotice) this.instance).setDrawer(h5Drawer);
                return this;
            }

            public Builder setH5PopUp(H5PopUp h5PopUp) {
                copyOnWrite();
                ((OperationPopupNotice) this.instance).setH5PopUp(h5PopUp);
                return this;
            }

            public Builder setOperationType(String str) {
                copyOnWrite();
                ((OperationPopupNotice) this.instance).setOperationType(str);
                return this;
            }

            public Builder setOperationTypeBytes(ByteString byteString) {
                copyOnWrite();
                ((OperationPopupNotice) this.instance).setOperationTypeBytes(byteString);
                return this;
            }

            public Builder setPopupType(OperationPopupType operationPopupType) {
                copyOnWrite();
                ((OperationPopupNotice) this.instance).setPopupType(operationPopupType);
                return this;
            }

            public Builder setPopupTypeValue(int i) {
                copyOnWrite();
                ((OperationPopupNotice) this.instance).setPopupTypeValue(i);
                return this;
            }

            public Builder setTextDrawer(TextDrawer textDrawer) {
                copyOnWrite();
                ((OperationPopupNotice) this.instance).setTextDrawer(textDrawer);
                return this;
            }

            public Builder setTimestamp(long j) {
                copyOnWrite();
                ((OperationPopupNotice) this.instance).setTimestamp(j);
                return this;
            }

            public Builder setDrawer(H5Drawer.Builder builder) {
                copyOnWrite();
                ((OperationPopupNotice) this.instance).setDrawer(builder);
                return this;
            }

            public Builder setH5PopUp(H5PopUp.Builder builder) {
                copyOnWrite();
                ((OperationPopupNotice) this.instance).setH5PopUp(builder);
                return this;
            }

            public Builder setTextDrawer(TextDrawer.Builder builder) {
                copyOnWrite();
                ((OperationPopupNotice) this.instance).setTextDrawer(builder);
                return this;
            }
        }

        public static OperationPopupNotice parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (OperationPopupNotice) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static OperationPopupNotice parseFrom(byte[] bArr, C3433h c3433h) throws InvalidProtocolBufferException {
            return (OperationPopupNotice) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, c3433h);
        }

        public static OperationPopupNotice parseFrom(InputStream inputStream) throws IOException {
            return (OperationPopupNotice) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static OperationPopupNotice parseFrom(InputStream inputStream, C3433h c3433h) throws IOException {
            return (OperationPopupNotice) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, c3433h);
        }

        public static OperationPopupNotice parseFrom(C3430e c3430e) throws IOException {
            return (OperationPopupNotice) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, c3430e);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static OperationPopupNotice parseFrom(C3430e c3430e, C3433h c3433h) throws IOException {
            return (OperationPopupNotice) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, c3430e, c3433h);
        }
    }

    public static final class OperationUpdateNotice extends GeneratedMessageLite<OperationUpdateNotice, Builder> implements OperationUpdateNoticeOrBuilder {
        public static final int ANIMATION_FIELD_NUMBER = 7;
        public static final int DATA_FIELD_NUMBER = 6;
        private static final OperationUpdateNotice DEFAULT_INSTANCE;
        public static final int OPERATIONTYPE_FIELD_NUMBER = 3;
        private static volatile ng60<OperationUpdateNotice> PARSER = null;
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
                this.animation_ = OperationAnimation.newBuilder(this.animation_).mergeFrom(operationAnimation).buildPartial();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeSubscription(OperationSubscription operationSubscription) {
            OperationSubscription operationSubscription2 = this.subscription_;
            if (operationSubscription2 == null || operationSubscription2 == OperationSubscription.getDefaultInstance()) {
                this.subscription_ = operationSubscription;
            } else {
                this.subscription_ = OperationSubscription.newBuilder(this.subscription_).mergeFrom(operationSubscription).buildPartial();
            }
        }

        public static Builder newBuilder(OperationUpdateNotice operationUpdateNotice) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(operationUpdateNotice);
        }

        public static OperationUpdateNotice parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (OperationUpdateNotice) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static OperationUpdateNotice parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (OperationUpdateNotice) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static ng60<OperationUpdateNotice> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAnimation(OperationAnimation.Builder builder) {
            this.animation_ = builder.build();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setData(String str) {
            str.getClass();
            this.data_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setDataBytes(ByteString byteString) {
            byteString.getClass();
            AbstractC3426a.checkByteStringIsUtf8(byteString);
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
            AbstractC3426a.checkByteStringIsUtf8(byteString);
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
            this.subscription_ = builder.build();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTimestamp(long j) {
            this.timestamp_ = j;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            boolean z = false;
            switch (C45881.f16673xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new OperationUpdateNotice();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                    return null;
                case 4:
                    return new Builder();
                case 5:
                    GeneratedMessageLite.InterfaceC3409h interfaceC3409h = (GeneratedMessageLite.InterfaceC3409h) obj;
                    OperationUpdateNotice operationUpdateNotice = (OperationUpdateNotice) obj2;
                    int i = this.position_;
                    boolean z2 = i != 0;
                    int i2 = operationUpdateNotice.position_;
                    this.position_ = interfaceC3409h.mo17051e(z2, i, i2 != 0, i2);
                    this.subscription_ = (OperationSubscription) interfaceC3409h.mo17061o(this.subscription_, operationUpdateNotice.subscription_);
                    this.operationType_ = interfaceC3409h.mo17052f(!this.operationType_.isEmpty(), this.operationType_, !operationUpdateNotice.operationType_.isEmpty(), operationUpdateNotice.operationType_);
                    long j = this.randomDelaySeconds_;
                    boolean z3 = j != 0;
                    long j2 = operationUpdateNotice.randomDelaySeconds_;
                    this.randomDelaySeconds_ = interfaceC3409h.mo17055i(z3, j, j2 != 0, j2);
                    long j3 = this.timestamp_;
                    boolean z4 = j3 != 0;
                    long j4 = operationUpdateNotice.timestamp_;
                    this.timestamp_ = interfaceC3409h.mo17055i(z4, j3, j4 != 0, j4);
                    this.data_ = interfaceC3409h.mo17052f(!this.data_.isEmpty(), this.data_, !operationUpdateNotice.data_.isEmpty(), operationUpdateNotice.data_);
                    this.animation_ = (OperationAnimation) interfaceC3409h.mo17061o(this.animation_, operationUpdateNotice.animation_);
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
                                    this.position_ = c3430e.m17191p();
                                } else if (iM17171M == 18) {
                                    OperationSubscription operationSubscription = this.subscription_;
                                    OperationSubscription.Builder builder = operationSubscription != null ? operationSubscription.toBuilder() : null;
                                    OperationSubscription operationSubscription2 = (OperationSubscription) c3430e.m17198w(OperationSubscription.parser(), c3433h);
                                    this.subscription_ = operationSubscription2;
                                    if (builder != null) {
                                        builder.mergeFrom(operationSubscription2);
                                        this.subscription_ = builder.buildPartial();
                                    }
                                } else if (iM17171M == 26) {
                                    this.operationType_ = c3430e.m17170L();
                                } else if (iM17171M == 32) {
                                    this.randomDelaySeconds_ = c3430e.m17197v();
                                } else if (iM17171M == 40) {
                                    this.timestamp_ = c3430e.m17197v();
                                } else if (iM17171M == 50) {
                                    this.data_ = c3430e.m17170L();
                                } else if (iM17171M == 58) {
                                    OperationAnimation operationAnimation = this.animation_;
                                    OperationAnimation.Builder builder2 = operationAnimation != null ? operationAnimation.toBuilder() : null;
                                    OperationAnimation operationAnimation2 = (OperationAnimation) c3430e.m17198w(OperationAnimation.parser(), c3433h);
                                    this.animation_ = operationAnimation2;
                                    if (builder2 != null) {
                                        builder2.mergeFrom(operationAnimation2);
                                        this.animation_ = builder2.buildPartial();
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
                        synchronized (OperationUpdateNotice.class) {
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

        @Override // com.google.protobuf.InterfaceC3442q
        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int iM16977m = this.position_ != OperationUpdatePosition.Unknown.getNumber() ? CodedOutputStream.m16977m(1, this.position_) : 0;
            if (this.subscription_ != null) {
                iM16977m += CodedOutputStream.m16948C(2, getSubscription());
            }
            if (!this.operationType_.isEmpty()) {
                iM16977m += CodedOutputStream.m16956K(3, getOperationType());
            }
            long j = this.randomDelaySeconds_;
            if (j != 0) {
                iM16977m += CodedOutputStream.m16986v(4, j);
            }
            long j2 = this.timestamp_;
            if (j2 != 0) {
                iM16977m += CodedOutputStream.m16986v(5, j2);
            }
            if (!this.data_.isEmpty()) {
                iM16977m += CodedOutputStream.m16956K(6, getData());
            }
            if (this.animation_ != null) {
                iM16977m += CodedOutputStream.m16948C(7, getAnimation());
            }
            this.memoizedSerializedSize = iM16977m;
            return iM16977m;
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

        @Override // com.google.protobuf.InterfaceC3442q
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (this.position_ != OperationUpdatePosition.Unknown.getNumber()) {
                codedOutputStream.m17015i0(1, this.position_);
            }
            if (this.subscription_ != null) {
                codedOutputStream.mo17029w0(2, getSubscription());
            }
            if (!this.operationType_.isEmpty()) {
                codedOutputStream.mo16994D0(3, getOperationType());
            }
            long j = this.randomDelaySeconds_;
            if (j != 0) {
                codedOutputStream.m17027u0(4, j);
            }
            long j2 = this.timestamp_;
            if (j2 != 0) {
                codedOutputStream.m17027u0(5, j2);
            }
            if (!this.data_.isEmpty()) {
                codedOutputStream.mo16994D0(6, getData());
            }
            if (this.animation_ != null) {
                codedOutputStream.mo17029w0(7, getAnimation());
            }
        }

        public enum OperationUpdatePosition implements C3437l.c {
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
            private static final C3437l.d<OperationUpdatePosition> internalValueMap = new C3437l.d<OperationUpdatePosition>() { // from class: com.p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage.OperationUpdateNotice.OperationUpdatePosition.1
                @Override // com.google.protobuf.C3437l.d
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

            public static C3437l.d<OperationUpdatePosition> internalGetValueMap() {
                return internalValueMap;
            }

            @Override // com.google.protobuf.C3437l.c
            public final int getNumber() {
                return this.value;
            }

            @Deprecated
            public static OperationUpdatePosition valueOf(int i) {
                return forNumber(i);
            }
        }

        public static OperationUpdateNotice parseDelimitedFrom(InputStream inputStream, C3433h c3433h) throws IOException {
            return (OperationUpdateNotice) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, c3433h);
        }

        public static OperationUpdateNotice parseFrom(ByteString byteString, C3433h c3433h) throws InvalidProtocolBufferException {
            return (OperationUpdateNotice) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, c3433h);
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

        public static final class Builder extends GeneratedMessageLite.AbstractC3403b<OperationUpdateNotice, Builder> implements OperationUpdateNoticeOrBuilder {
            private Builder() {
                super(OperationUpdateNotice.DEFAULT_INSTANCE);
            }

            public Builder clearAnimation() {
                copyOnWrite();
                ((OperationUpdateNotice) this.instance).clearAnimation();
                return this;
            }

            public Builder clearData() {
                copyOnWrite();
                ((OperationUpdateNotice) this.instance).clearData();
                return this;
            }

            public Builder clearOperationType() {
                copyOnWrite();
                ((OperationUpdateNotice) this.instance).clearOperationType();
                return this;
            }

            public Builder clearPosition() {
                copyOnWrite();
                ((OperationUpdateNotice) this.instance).clearPosition();
                return this;
            }

            public Builder clearRandomDelaySeconds() {
                copyOnWrite();
                ((OperationUpdateNotice) this.instance).clearRandomDelaySeconds();
                return this;
            }

            public Builder clearSubscription() {
                copyOnWrite();
                ((OperationUpdateNotice) this.instance).clearSubscription();
                return this;
            }

            public Builder clearTimestamp() {
                copyOnWrite();
                ((OperationUpdateNotice) this.instance).clearTimestamp();
                return this;
            }

            @Override // com.p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage.OperationUpdateNoticeOrBuilder
            public OperationAnimation getAnimation() {
                return ((OperationUpdateNotice) this.instance).getAnimation();
            }

            @Override // com.p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage.OperationUpdateNoticeOrBuilder
            public String getData() {
                return ((OperationUpdateNotice) this.instance).getData();
            }

            @Override // com.p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage.OperationUpdateNoticeOrBuilder
            public ByteString getDataBytes() {
                return ((OperationUpdateNotice) this.instance).getDataBytes();
            }

            @Override // com.p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage.OperationUpdateNoticeOrBuilder
            public String getOperationType() {
                return ((OperationUpdateNotice) this.instance).getOperationType();
            }

            @Override // com.p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage.OperationUpdateNoticeOrBuilder
            public ByteString getOperationTypeBytes() {
                return ((OperationUpdateNotice) this.instance).getOperationTypeBytes();
            }

            @Override // com.p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage.OperationUpdateNoticeOrBuilder
            public OperationUpdatePosition getPosition() {
                return ((OperationUpdateNotice) this.instance).getPosition();
            }

            @Override // com.p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage.OperationUpdateNoticeOrBuilder
            public int getPositionValue() {
                return ((OperationUpdateNotice) this.instance).getPositionValue();
            }

            @Override // com.p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage.OperationUpdateNoticeOrBuilder
            public long getRandomDelaySeconds() {
                return ((OperationUpdateNotice) this.instance).getRandomDelaySeconds();
            }

            @Override // com.p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage.OperationUpdateNoticeOrBuilder
            public OperationSubscription getSubscription() {
                return ((OperationUpdateNotice) this.instance).getSubscription();
            }

            @Override // com.p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage.OperationUpdateNoticeOrBuilder
            public long getTimestamp() {
                return ((OperationUpdateNotice) this.instance).getTimestamp();
            }

            @Override // com.p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage.OperationUpdateNoticeOrBuilder
            public boolean hasAnimation() {
                return ((OperationUpdateNotice) this.instance).hasAnimation();
            }

            @Override // com.p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage.OperationUpdateNoticeOrBuilder
            public boolean hasSubscription() {
                return ((OperationUpdateNotice) this.instance).hasSubscription();
            }

            public Builder mergeAnimation(OperationAnimation operationAnimation) {
                copyOnWrite();
                ((OperationUpdateNotice) this.instance).mergeAnimation(operationAnimation);
                return this;
            }

            public Builder mergeSubscription(OperationSubscription operationSubscription) {
                copyOnWrite();
                ((OperationUpdateNotice) this.instance).mergeSubscription(operationSubscription);
                return this;
            }

            public Builder setAnimation(OperationAnimation operationAnimation) {
                copyOnWrite();
                ((OperationUpdateNotice) this.instance).setAnimation(operationAnimation);
                return this;
            }

            public Builder setData(String str) {
                copyOnWrite();
                ((OperationUpdateNotice) this.instance).setData(str);
                return this;
            }

            public Builder setDataBytes(ByteString byteString) {
                copyOnWrite();
                ((OperationUpdateNotice) this.instance).setDataBytes(byteString);
                return this;
            }

            public Builder setOperationType(String str) {
                copyOnWrite();
                ((OperationUpdateNotice) this.instance).setOperationType(str);
                return this;
            }

            public Builder setOperationTypeBytes(ByteString byteString) {
                copyOnWrite();
                ((OperationUpdateNotice) this.instance).setOperationTypeBytes(byteString);
                return this;
            }

            public Builder setPosition(OperationUpdatePosition operationUpdatePosition) {
                copyOnWrite();
                ((OperationUpdateNotice) this.instance).setPosition(operationUpdatePosition);
                return this;
            }

            public Builder setPositionValue(int i) {
                copyOnWrite();
                ((OperationUpdateNotice) this.instance).setPositionValue(i);
                return this;
            }

            public Builder setRandomDelaySeconds(long j) {
                copyOnWrite();
                ((OperationUpdateNotice) this.instance).setRandomDelaySeconds(j);
                return this;
            }

            public Builder setSubscription(OperationSubscription operationSubscription) {
                copyOnWrite();
                ((OperationUpdateNotice) this.instance).setSubscription(operationSubscription);
                return this;
            }

            public Builder setTimestamp(long j) {
                copyOnWrite();
                ((OperationUpdateNotice) this.instance).setTimestamp(j);
                return this;
            }

            public Builder setAnimation(OperationAnimation.Builder builder) {
                copyOnWrite();
                ((OperationUpdateNotice) this.instance).setAnimation(builder);
                return this;
            }

            public Builder setSubscription(OperationSubscription.Builder builder) {
                copyOnWrite();
                ((OperationUpdateNotice) this.instance).setSubscription(builder);
                return this;
            }
        }

        public static OperationUpdateNotice parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (OperationUpdateNotice) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static OperationUpdateNotice parseFrom(byte[] bArr, C3433h c3433h) throws InvalidProtocolBufferException {
            return (OperationUpdateNotice) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, c3433h);
        }

        public static OperationUpdateNotice parseFrom(InputStream inputStream) throws IOException {
            return (OperationUpdateNotice) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static OperationUpdateNotice parseFrom(InputStream inputStream, C3433h c3433h) throws IOException {
            return (OperationUpdateNotice) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, c3433h);
        }

        public static OperationUpdateNotice parseFrom(C3430e c3430e) throws IOException {
            return (OperationUpdateNotice) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, c3430e);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static OperationUpdateNotice parseFrom(C3430e c3430e, C3433h c3433h) throws IOException {
            return (OperationUpdateNotice) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, c3430e, c3433h);
        }
    }

    public static final class DragonScourgeRecords extends GeneratedMessageLite<DragonScourgeRecords, Builder> implements DragonScourgeRecordsOrBuilder {
        private static final DragonScourgeRecords DEFAULT_INSTANCE;
        public static final int MONSTERS_FIELD_NUMBER = 3;
        public static final int MONSTERURLS_FIELD_NUMBER = 1;
        private static volatile ng60<DragonScourgeRecords> PARSER = null;
        public static final int SCHEMA_FIELD_NUMBER = 4;
        public static final int TITLE_FIELD_NUMBER = 2;
        private int bitField0_;
        private C3437l.h<String> monsterUrls_ = GeneratedMessageLite.emptyProtobufList();
        private String title_ = "";
        private C3437l.g monsters_ = GeneratedMessageLite.emptyLongList();
        private String schema_ = "";

        public static final class Builder extends GeneratedMessageLite.AbstractC3403b<DragonScourgeRecords, Builder> implements DragonScourgeRecordsOrBuilder {
            private Builder() {
                super(DragonScourgeRecords.DEFAULT_INSTANCE);
            }

            public Builder addAllMonsterUrls(Iterable<String> iterable) {
                copyOnWrite();
                ((DragonScourgeRecords) this.instance).addAllMonsterUrls(iterable);
                return this;
            }

            public Builder addAllMonsters(Iterable<? extends Long> iterable) {
                copyOnWrite();
                ((DragonScourgeRecords) this.instance).addAllMonsters(iterable);
                return this;
            }

            public Builder addMonsterUrls(String str) {
                copyOnWrite();
                ((DragonScourgeRecords) this.instance).addMonsterUrls(str);
                return this;
            }

            public Builder addMonsterUrlsBytes(ByteString byteString) {
                copyOnWrite();
                ((DragonScourgeRecords) this.instance).addMonsterUrlsBytes(byteString);
                return this;
            }

            public Builder addMonsters(long j) {
                copyOnWrite();
                ((DragonScourgeRecords) this.instance).addMonsters(j);
                return this;
            }

            public Builder clearMonsterUrls() {
                copyOnWrite();
                ((DragonScourgeRecords) this.instance).clearMonsterUrls();
                return this;
            }

            public Builder clearMonsters() {
                copyOnWrite();
                ((DragonScourgeRecords) this.instance).clearMonsters();
                return this;
            }

            public Builder clearSchema() {
                copyOnWrite();
                ((DragonScourgeRecords) this.instance).clearSchema();
                return this;
            }

            public Builder clearTitle() {
                copyOnWrite();
                ((DragonScourgeRecords) this.instance).clearTitle();
                return this;
            }

            @Override // com.p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage.DragonScourgeRecordsOrBuilder
            public String getMonsterUrls(int i) {
                return ((DragonScourgeRecords) this.instance).getMonsterUrls(i);
            }

            @Override // com.p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage.DragonScourgeRecordsOrBuilder
            public ByteString getMonsterUrlsBytes(int i) {
                return ((DragonScourgeRecords) this.instance).getMonsterUrlsBytes(i);
            }

            @Override // com.p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage.DragonScourgeRecordsOrBuilder
            public int getMonsterUrlsCount() {
                return ((DragonScourgeRecords) this.instance).getMonsterUrlsCount();
            }

            @Override // com.p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage.DragonScourgeRecordsOrBuilder
            public List<String> getMonsterUrlsList() {
                return Collections.unmodifiableList(((DragonScourgeRecords) this.instance).getMonsterUrlsList());
            }

            @Override // com.p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage.DragonScourgeRecordsOrBuilder
            public long getMonsters(int i) {
                return ((DragonScourgeRecords) this.instance).getMonsters(i);
            }

            @Override // com.p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage.DragonScourgeRecordsOrBuilder
            public int getMonstersCount() {
                return ((DragonScourgeRecords) this.instance).getMonstersCount();
            }

            @Override // com.p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage.DragonScourgeRecordsOrBuilder
            public List<Long> getMonstersList() {
                return Collections.unmodifiableList(((DragonScourgeRecords) this.instance).getMonstersList());
            }

            @Override // com.p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage.DragonScourgeRecordsOrBuilder
            public String getSchema() {
                return ((DragonScourgeRecords) this.instance).getSchema();
            }

            @Override // com.p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage.DragonScourgeRecordsOrBuilder
            public ByteString getSchemaBytes() {
                return ((DragonScourgeRecords) this.instance).getSchemaBytes();
            }

            @Override // com.p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage.DragonScourgeRecordsOrBuilder
            public String getTitle() {
                return ((DragonScourgeRecords) this.instance).getTitle();
            }

            @Override // com.p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage.DragonScourgeRecordsOrBuilder
            public ByteString getTitleBytes() {
                return ((DragonScourgeRecords) this.instance).getTitleBytes();
            }

            public Builder setMonsterUrls(int i, String str) {
                copyOnWrite();
                ((DragonScourgeRecords) this.instance).setMonsterUrls(i, str);
                return this;
            }

            public Builder setMonsters(int i, long j) {
                copyOnWrite();
                ((DragonScourgeRecords) this.instance).setMonsters(i, j);
                return this;
            }

            public Builder setSchema(String str) {
                copyOnWrite();
                ((DragonScourgeRecords) this.instance).setSchema(str);
                return this;
            }

            public Builder setSchemaBytes(ByteString byteString) {
                copyOnWrite();
                ((DragonScourgeRecords) this.instance).setSchemaBytes(byteString);
                return this;
            }

            public Builder setTitle(String str) {
                copyOnWrite();
                ((DragonScourgeRecords) this.instance).setTitle(str);
                return this;
            }

            public Builder setTitleBytes(ByteString byteString) {
                copyOnWrite();
                ((DragonScourgeRecords) this.instance).setTitleBytes(byteString);
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
            AbstractC3426a.addAll(iterable, this.monsterUrls_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllMonsters(Iterable<? extends Long> iterable) {
            ensureMonstersIsMutable();
            AbstractC3426a.addAll(iterable, this.monsters_);
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
            AbstractC3426a.checkByteStringIsUtf8(byteString);
            ensureMonsterUrlsIsMutable();
            this.monsterUrls_.add(byteString.toStringUtf8());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addMonsters(long j) {
            ensureMonstersIsMutable();
            this.monsters_.mo17267u(j);
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
            if (this.monsterUrls_.mo17140q()) {
                return;
            }
            this.monsterUrls_ = GeneratedMessageLite.mutableCopy(this.monsterUrls_);
        }

        private void ensureMonstersIsMutable() {
            if (this.monsters_.mo17140q()) {
                return;
            }
            this.monsters_ = GeneratedMessageLite.mutableCopy(this.monsters_);
        }

        public static DragonScourgeRecords getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder(DragonScourgeRecords dragonScourgeRecords) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(dragonScourgeRecords);
        }

        public static DragonScourgeRecords parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (DragonScourgeRecords) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static DragonScourgeRecords parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (DragonScourgeRecords) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static ng60<DragonScourgeRecords> parser() {
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
            AbstractC3426a.checkByteStringIsUtf8(byteString);
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
            AbstractC3426a.checkByteStringIsUtf8(byteString);
            this.title_ = byteString.toStringUtf8();
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (C45881.f16673xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new DragonScourgeRecords();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                    this.monsterUrls_.mo17139n();
                    this.monsters_.mo17139n();
                    return null;
                case 4:
                    return new Builder();
                case 5:
                    GeneratedMessageLite.InterfaceC3409h interfaceC3409h = (GeneratedMessageLite.InterfaceC3409h) obj;
                    DragonScourgeRecords dragonScourgeRecords = (DragonScourgeRecords) obj2;
                    this.monsterUrls_ = interfaceC3409h.mo17053g(this.monsterUrls_, dragonScourgeRecords.monsterUrls_);
                    this.title_ = interfaceC3409h.mo17052f(!this.title_.isEmpty(), this.title_, !dragonScourgeRecords.title_.isEmpty(), dragonScourgeRecords.title_);
                    this.monsters_ = interfaceC3409h.mo17063q(this.monsters_, dragonScourgeRecords.monsters_);
                    this.schema_ = interfaceC3409h.mo17052f(!this.schema_.isEmpty(), this.schema_, true ^ dragonScourgeRecords.schema_.isEmpty(), dragonScourgeRecords.schema_);
                    if (interfaceC3409h == GeneratedMessageLite.C3408g.INSTANCE) {
                        this.bitField0_ |= dragonScourgeRecords.bitField0_;
                    }
                    return this;
                case 6:
                    C3430e c3430e = (C3430e) obj;
                    boolean z = false;
                    while (!z) {
                        try {
                            int iM17171M = c3430e.m17171M();
                            if (iM17171M != 0) {
                                if (iM17171M == 10) {
                                    String strM17170L = c3430e.m17170L();
                                    if (!this.monsterUrls_.mo17140q()) {
                                        this.monsterUrls_ = GeneratedMessageLite.mutableCopy(this.monsterUrls_);
                                    }
                                    this.monsterUrls_.add(strM17170L);
                                } else if (iM17171M == 18) {
                                    this.title_ = c3430e.m17170L();
                                } else if (iM17171M == 24) {
                                    if (!this.monsters_.mo17140q()) {
                                        this.monsters_ = GeneratedMessageLite.mutableCopy(this.monsters_);
                                    }
                                    this.monsters_.mo17267u(c3430e.m17197v());
                                } else if (iM17171M == 26) {
                                    int iM17187l = c3430e.m17187l(c3430e.m17162C());
                                    if (!this.monsters_.mo17140q() && c3430e.m17184d() > 0) {
                                        this.monsters_ = GeneratedMessageLite.mutableCopy(this.monsters_);
                                    }
                                    while (c3430e.m17184d() > 0) {
                                        this.monsters_.mo17267u(c3430e.m17197v());
                                    }
                                    c3430e.m17186k(iM17187l);
                                } else if (iM17171M == 34) {
                                    this.schema_ = c3430e.m17170L();
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
                        synchronized (DragonScourgeRecords.class) {
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

        @Override // com.p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage.DragonScourgeRecordsOrBuilder
        public String getMonsterUrls(int i) {
            return this.monsterUrls_.get(i);
        }

        @Override // com.p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage.DragonScourgeRecordsOrBuilder
        public ByteString getMonsterUrlsBytes(int i) {
            return ByteString.copyFromUtf8(this.monsterUrls_.get(i));
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

        @Override // com.google.protobuf.InterfaceC3442q
        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int iM16957L = 0;
            for (int i2 = 0; i2 < this.monsterUrls_.size(); i2++) {
                iM16957L += CodedOutputStream.m16957L(this.monsterUrls_.get(i2));
            }
            int size = iM16957L + getMonsterUrlsList().size();
            if (!this.title_.isEmpty()) {
                size += CodedOutputStream.m16956K(2, getTitle());
            }
            int iM16987w = 0;
            for (int i3 = 0; i3 < this.monsters_.size(); i3++) {
                iM16987w += CodedOutputStream.m16987w(this.monsters_.getLong(i3));
            }
            int size2 = size + iM16987w + getMonstersList().size();
            if (!this.schema_.isEmpty()) {
                size2 += CodedOutputStream.m16956K(4, getSchema());
            }
            this.memoizedSerializedSize = size2;
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

        @Override // com.google.protobuf.InterfaceC3442q
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            getSerializedSize();
            for (int i = 0; i < this.monsterUrls_.size(); i++) {
                codedOutputStream.mo16994D0(1, this.monsterUrls_.get(i));
            }
            if (!this.title_.isEmpty()) {
                codedOutputStream.mo16994D0(2, getTitle());
            }
            for (int i2 = 0; i2 < this.monsters_.size(); i2++) {
                codedOutputStream.m17027u0(3, this.monsters_.getLong(i2));
            }
            if (this.schema_.isEmpty()) {
                return;
            }
            codedOutputStream.mo16994D0(4, getSchema());
        }

        public static DragonScourgeRecords parseDelimitedFrom(InputStream inputStream, C3433h c3433h) throws IOException {
            return (DragonScourgeRecords) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, c3433h);
        }

        public static DragonScourgeRecords parseFrom(ByteString byteString, C3433h c3433h) throws InvalidProtocolBufferException {
            return (DragonScourgeRecords) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, c3433h);
        }

        public static DragonScourgeRecords parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (DragonScourgeRecords) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static DragonScourgeRecords parseFrom(byte[] bArr, C3433h c3433h) throws InvalidProtocolBufferException {
            return (DragonScourgeRecords) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, c3433h);
        }

        public static DragonScourgeRecords parseFrom(InputStream inputStream) throws IOException {
            return (DragonScourgeRecords) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static DragonScourgeRecords parseFrom(InputStream inputStream, C3433h c3433h) throws IOException {
            return (DragonScourgeRecords) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, c3433h);
        }

        public static DragonScourgeRecords parseFrom(C3430e c3430e) throws IOException {
            return (DragonScourgeRecords) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, c3430e);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static DragonScourgeRecords parseFrom(C3430e c3430e, C3433h c3433h) throws IOException {
            return (DragonScourgeRecords) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, c3430e, c3433h);
        }
    }

    public static final class H5Drawer extends GeneratedMessageLite<H5Drawer, Builder> implements H5DrawerOrBuilder {
        public static final int CLOSEBUTTONURL_FIELD_NUMBER = 3;
        private static final H5Drawer DEFAULT_INSTANCE;
        public static final int FADINGSECONDS_FIELD_NUMBER = 2;
        public static final int H5URL_FIELD_NUMBER = 1;
        public static final int HEIGHT_FIELD_NUMBER = 4;
        public static final int LOADING_FIELD_NUMBER = 6;
        private static volatile ng60<H5Drawer> PARSER = null;
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
            this.height_ = FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearLoading() {
            this.loading_ = null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearWidth() {
            this.width_ = FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
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
                this.loading_ = H5DrawerLoading.newBuilder(this.loading_).mergeFrom(h5DrawerLoading).buildPartial();
            }
        }

        public static Builder newBuilder(H5Drawer h5Drawer) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(h5Drawer);
        }

        public static H5Drawer parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (H5Drawer) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static H5Drawer parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (H5Drawer) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static ng60<H5Drawer> parser() {
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
            AbstractC3426a.checkByteStringIsUtf8(byteString);
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
            AbstractC3426a.checkByteStringIsUtf8(byteString);
            this.h5Url_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setHeight(double d) {
            this.height_ = d;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setLoading(H5DrawerLoading.Builder builder) {
            this.loading_ = builder.build();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setWidth(double d) {
            this.width_ = d;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            boolean z = false;
            switch (C45881.f16673xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new H5Drawer();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                    return null;
                case 4:
                    return new Builder();
                case 5:
                    GeneratedMessageLite.InterfaceC3409h interfaceC3409h = (GeneratedMessageLite.InterfaceC3409h) obj;
                    H5Drawer h5Drawer = (H5Drawer) obj2;
                    this.h5Url_ = interfaceC3409h.mo17052f(!this.h5Url_.isEmpty(), this.h5Url_, !h5Drawer.h5Url_.isEmpty(), h5Drawer.h5Url_);
                    long j = this.fadingSeconds_;
                    boolean z2 = j != 0;
                    long j2 = h5Drawer.fadingSeconds_;
                    this.fadingSeconds_ = interfaceC3409h.mo17055i(z2, j, j2 != 0, j2);
                    this.closeButtonUrl_ = interfaceC3409h.mo17052f(!this.closeButtonUrl_.isEmpty(), this.closeButtonUrl_, !h5Drawer.closeButtonUrl_.isEmpty(), h5Drawer.closeButtonUrl_);
                    double d = this.height_;
                    boolean z3 = d != FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
                    double d2 = h5Drawer.height_;
                    this.height_ = interfaceC3409h.mo17056j(z3, d, d2 != FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE, d2);
                    boolean z4 = false;
                    double d3 = this.width_;
                    if (d3 != FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
                        z4 = true;
                    }
                    double d4 = h5Drawer.width_;
                    this.width_ = interfaceC3409h.mo17056j(z4, d3, d4 != FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE, d4);
                    this.loading_ = (H5DrawerLoading) interfaceC3409h.mo17061o(this.loading_, h5Drawer.loading_);
                    GeneratedMessageLite.C3408g c3408g = GeneratedMessageLite.C3408g.INSTANCE;
                    return this;
                case 6:
                    C3430e c3430e = (C3430e) obj;
                    C3433h c3433h = (C3433h) obj2;
                    while (!z) {
                        try {
                            int iM17171M = c3430e.m17171M();
                            if (iM17171M != 0) {
                                if (iM17171M == 10) {
                                    this.h5Url_ = c3430e.m17170L();
                                } else if (iM17171M == 16) {
                                    this.fadingSeconds_ = c3430e.m17197v();
                                } else if (iM17171M == 26) {
                                    this.closeButtonUrl_ = c3430e.m17170L();
                                } else if (iM17171M == 33) {
                                    this.height_ = c3430e.m17190o();
                                } else if (iM17171M == 41) {
                                    this.width_ = c3430e.m17190o();
                                } else if (iM17171M == 50) {
                                    H5DrawerLoading h5DrawerLoading = this.loading_;
                                    H5DrawerLoading.Builder builder = h5DrawerLoading != null ? h5DrawerLoading.toBuilder() : null;
                                    H5DrawerLoading h5DrawerLoading2 = (H5DrawerLoading) c3430e.m17198w(H5DrawerLoading.parser(), c3433h);
                                    this.loading_ = h5DrawerLoading2;
                                    if (builder != null) {
                                        builder.mergeFrom(h5DrawerLoading2);
                                        this.loading_ = builder.buildPartial();
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
                        synchronized (H5Drawer.class) {
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

        @Override // com.google.protobuf.InterfaceC3442q
        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int iM16956K = !this.h5Url_.isEmpty() ? CodedOutputStream.m16956K(1, getH5Url()) : 0;
            long j = this.fadingSeconds_;
            if (j != 0) {
                iM16956K += CodedOutputStream.m16986v(2, j);
            }
            if (!this.closeButtonUrl_.isEmpty()) {
                iM16956K += CodedOutputStream.m16956K(3, getCloseButtonUrl());
            }
            double d = this.height_;
            if (d != FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
                iM16956K += CodedOutputStream.m16975k(4, d);
            }
            double d2 = this.width_;
            if (d2 != FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
                iM16956K += CodedOutputStream.m16975k(5, d2);
            }
            if (this.loading_ != null) {
                iM16956K += CodedOutputStream.m16948C(6, getLoading());
            }
            this.memoizedSerializedSize = iM16956K;
            return iM16956K;
        }

        @Override // com.p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage.H5DrawerOrBuilder
        public double getWidth() {
            return this.width_;
        }

        @Override // com.p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage.H5DrawerOrBuilder
        public boolean hasLoading() {
            return this.loading_ != null;
        }

        @Override // com.google.protobuf.InterfaceC3442q
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (!this.h5Url_.isEmpty()) {
                codedOutputStream.mo16994D0(1, getH5Url());
            }
            long j = this.fadingSeconds_;
            if (j != 0) {
                codedOutputStream.m17027u0(2, j);
            }
            if (!this.closeButtonUrl_.isEmpty()) {
                codedOutputStream.mo16994D0(3, getCloseButtonUrl());
            }
            double d = this.height_;
            if (d != FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
                codedOutputStream.m17013g0(4, d);
            }
            double d2 = this.width_;
            if (d2 != FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
                codedOutputStream.m17013g0(5, d2);
            }
            if (this.loading_ != null) {
                codedOutputStream.mo17029w0(6, getLoading());
            }
        }

        public static H5Drawer parseDelimitedFrom(InputStream inputStream, C3433h c3433h) throws IOException {
            return (H5Drawer) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, c3433h);
        }

        public static H5Drawer parseFrom(ByteString byteString, C3433h c3433h) throws InvalidProtocolBufferException {
            return (H5Drawer) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, c3433h);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setLoading(H5DrawerLoading h5DrawerLoading) {
            h5DrawerLoading.getClass();
            this.loading_ = h5DrawerLoading;
        }

        public static final class Builder extends GeneratedMessageLite.AbstractC3403b<H5Drawer, Builder> implements H5DrawerOrBuilder {
            private Builder() {
                super(H5Drawer.DEFAULT_INSTANCE);
            }

            public Builder clearCloseButtonUrl() {
                copyOnWrite();
                ((H5Drawer) this.instance).clearCloseButtonUrl();
                return this;
            }

            public Builder clearFadingSeconds() {
                copyOnWrite();
                ((H5Drawer) this.instance).clearFadingSeconds();
                return this;
            }

            public Builder clearH5Url() {
                copyOnWrite();
                ((H5Drawer) this.instance).clearH5Url();
                return this;
            }

            public Builder clearHeight() {
                copyOnWrite();
                ((H5Drawer) this.instance).clearHeight();
                return this;
            }

            public Builder clearLoading() {
                copyOnWrite();
                ((H5Drawer) this.instance).clearLoading();
                return this;
            }

            public Builder clearWidth() {
                copyOnWrite();
                ((H5Drawer) this.instance).clearWidth();
                return this;
            }

            @Override // com.p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage.H5DrawerOrBuilder
            public String getCloseButtonUrl() {
                return ((H5Drawer) this.instance).getCloseButtonUrl();
            }

            @Override // com.p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage.H5DrawerOrBuilder
            public ByteString getCloseButtonUrlBytes() {
                return ((H5Drawer) this.instance).getCloseButtonUrlBytes();
            }

            @Override // com.p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage.H5DrawerOrBuilder
            public long getFadingSeconds() {
                return ((H5Drawer) this.instance).getFadingSeconds();
            }

            @Override // com.p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage.H5DrawerOrBuilder
            public String getH5Url() {
                return ((H5Drawer) this.instance).getH5Url();
            }

            @Override // com.p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage.H5DrawerOrBuilder
            public ByteString getH5UrlBytes() {
                return ((H5Drawer) this.instance).getH5UrlBytes();
            }

            @Override // com.p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage.H5DrawerOrBuilder
            public double getHeight() {
                return ((H5Drawer) this.instance).getHeight();
            }

            @Override // com.p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage.H5DrawerOrBuilder
            public H5DrawerLoading getLoading() {
                return ((H5Drawer) this.instance).getLoading();
            }

            @Override // com.p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage.H5DrawerOrBuilder
            public double getWidth() {
                return ((H5Drawer) this.instance).getWidth();
            }

            @Override // com.p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage.H5DrawerOrBuilder
            public boolean hasLoading() {
                return ((H5Drawer) this.instance).hasLoading();
            }

            public Builder mergeLoading(H5DrawerLoading h5DrawerLoading) {
                copyOnWrite();
                ((H5Drawer) this.instance).mergeLoading(h5DrawerLoading);
                return this;
            }

            public Builder setCloseButtonUrl(String str) {
                copyOnWrite();
                ((H5Drawer) this.instance).setCloseButtonUrl(str);
                return this;
            }

            public Builder setCloseButtonUrlBytes(ByteString byteString) {
                copyOnWrite();
                ((H5Drawer) this.instance).setCloseButtonUrlBytes(byteString);
                return this;
            }

            public Builder setFadingSeconds(long j) {
                copyOnWrite();
                ((H5Drawer) this.instance).setFadingSeconds(j);
                return this;
            }

            public Builder setH5Url(String str) {
                copyOnWrite();
                ((H5Drawer) this.instance).setH5Url(str);
                return this;
            }

            public Builder setH5UrlBytes(ByteString byteString) {
                copyOnWrite();
                ((H5Drawer) this.instance).setH5UrlBytes(byteString);
                return this;
            }

            public Builder setHeight(double d) {
                copyOnWrite();
                ((H5Drawer) this.instance).setHeight(d);
                return this;
            }

            public Builder setLoading(H5DrawerLoading h5DrawerLoading) {
                copyOnWrite();
                ((H5Drawer) this.instance).setLoading(h5DrawerLoading);
                return this;
            }

            public Builder setWidth(double d) {
                copyOnWrite();
                ((H5Drawer) this.instance).setWidth(d);
                return this;
            }

            public Builder setLoading(H5DrawerLoading.Builder builder) {
                copyOnWrite();
                ((H5Drawer) this.instance).setLoading(builder);
                return this;
            }
        }

        public static H5Drawer parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (H5Drawer) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static H5Drawer parseFrom(byte[] bArr, C3433h c3433h) throws InvalidProtocolBufferException {
            return (H5Drawer) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, c3433h);
        }

        public static H5Drawer parseFrom(InputStream inputStream) throws IOException {
            return (H5Drawer) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static H5Drawer parseFrom(InputStream inputStream, C3433h c3433h) throws IOException {
            return (H5Drawer) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, c3433h);
        }

        public static H5Drawer parseFrom(C3430e c3430e) throws IOException {
            return (H5Drawer) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, c3430e);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static H5Drawer parseFrom(C3430e c3430e, C3433h c3433h) throws IOException {
            return (H5Drawer) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, c3430e, c3433h);
        }
    }

    public static final class H5DrawerLoading extends GeneratedMessageLite<H5DrawerLoading, Builder> implements H5DrawerLoadingOrBuilder {
        private static final H5DrawerLoading DEFAULT_INSTANCE;
        public static final int ENDCOLOR_FIELD_NUMBER = 2;
        public static final int IMAGEURL_FIELD_NUMBER = 3;
        public static final int LOADINGTYPE_FIELD_NUMBER = 5;
        private static volatile ng60<H5DrawerLoading> PARSER = null;
        public static final int STARTCOLOR_FIELD_NUMBER = 1;
        public static final int TRANSPARENCY_FIELD_NUMBER = 4;
        private long transparency_;
        private String startColor_ = "";
        private String endColor_ = "";
        private String imageUrl_ = "";
        private String loadingType_ = "";

        public static final class Builder extends GeneratedMessageLite.AbstractC3403b<H5DrawerLoading, Builder> implements H5DrawerLoadingOrBuilder {
            private Builder() {
                super(H5DrawerLoading.DEFAULT_INSTANCE);
            }

            public Builder clearEndColor() {
                copyOnWrite();
                ((H5DrawerLoading) this.instance).clearEndColor();
                return this;
            }

            public Builder clearImageUrl() {
                copyOnWrite();
                ((H5DrawerLoading) this.instance).clearImageUrl();
                return this;
            }

            public Builder clearLoadingType() {
                copyOnWrite();
                ((H5DrawerLoading) this.instance).clearLoadingType();
                return this;
            }

            public Builder clearStartColor() {
                copyOnWrite();
                ((H5DrawerLoading) this.instance).clearStartColor();
                return this;
            }

            public Builder clearTransparency() {
                copyOnWrite();
                ((H5DrawerLoading) this.instance).clearTransparency();
                return this;
            }

            @Override // com.p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage.H5DrawerLoadingOrBuilder
            public String getEndColor() {
                return ((H5DrawerLoading) this.instance).getEndColor();
            }

            @Override // com.p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage.H5DrawerLoadingOrBuilder
            public ByteString getEndColorBytes() {
                return ((H5DrawerLoading) this.instance).getEndColorBytes();
            }

            @Override // com.p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage.H5DrawerLoadingOrBuilder
            public String getImageUrl() {
                return ((H5DrawerLoading) this.instance).getImageUrl();
            }

            @Override // com.p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage.H5DrawerLoadingOrBuilder
            public ByteString getImageUrlBytes() {
                return ((H5DrawerLoading) this.instance).getImageUrlBytes();
            }

            @Override // com.p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage.H5DrawerLoadingOrBuilder
            public String getLoadingType() {
                return ((H5DrawerLoading) this.instance).getLoadingType();
            }

            @Override // com.p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage.H5DrawerLoadingOrBuilder
            public ByteString getLoadingTypeBytes() {
                return ((H5DrawerLoading) this.instance).getLoadingTypeBytes();
            }

            @Override // com.p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage.H5DrawerLoadingOrBuilder
            public String getStartColor() {
                return ((H5DrawerLoading) this.instance).getStartColor();
            }

            @Override // com.p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage.H5DrawerLoadingOrBuilder
            public ByteString getStartColorBytes() {
                return ((H5DrawerLoading) this.instance).getStartColorBytes();
            }

            @Override // com.p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage.H5DrawerLoadingOrBuilder
            public long getTransparency() {
                return ((H5DrawerLoading) this.instance).getTransparency();
            }

            public Builder setEndColor(String str) {
                copyOnWrite();
                ((H5DrawerLoading) this.instance).setEndColor(str);
                return this;
            }

            public Builder setEndColorBytes(ByteString byteString) {
                copyOnWrite();
                ((H5DrawerLoading) this.instance).setEndColorBytes(byteString);
                return this;
            }

            public Builder setImageUrl(String str) {
                copyOnWrite();
                ((H5DrawerLoading) this.instance).setImageUrl(str);
                return this;
            }

            public Builder setImageUrlBytes(ByteString byteString) {
                copyOnWrite();
                ((H5DrawerLoading) this.instance).setImageUrlBytes(byteString);
                return this;
            }

            public Builder setLoadingType(String str) {
                copyOnWrite();
                ((H5DrawerLoading) this.instance).setLoadingType(str);
                return this;
            }

            public Builder setLoadingTypeBytes(ByteString byteString) {
                copyOnWrite();
                ((H5DrawerLoading) this.instance).setLoadingTypeBytes(byteString);
                return this;
            }

            public Builder setStartColor(String str) {
                copyOnWrite();
                ((H5DrawerLoading) this.instance).setStartColor(str);
                return this;
            }

            public Builder setStartColorBytes(ByteString byteString) {
                copyOnWrite();
                ((H5DrawerLoading) this.instance).setStartColorBytes(byteString);
                return this;
            }

            public Builder setTransparency(long j) {
                copyOnWrite();
                ((H5DrawerLoading) this.instance).setTransparency(j);
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
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(h5DrawerLoading);
        }

        public static H5DrawerLoading parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (H5DrawerLoading) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static H5DrawerLoading parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (H5DrawerLoading) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static ng60<H5DrawerLoading> parser() {
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
            AbstractC3426a.checkByteStringIsUtf8(byteString);
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
            AbstractC3426a.checkByteStringIsUtf8(byteString);
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
            AbstractC3426a.checkByteStringIsUtf8(byteString);
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
            AbstractC3426a.checkByteStringIsUtf8(byteString);
            this.startColor_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTransparency(long j) {
            this.transparency_ = j;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            boolean z = false;
            switch (C45881.f16673xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new H5DrawerLoading();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                    return null;
                case 4:
                    return new Builder();
                case 5:
                    GeneratedMessageLite.InterfaceC3409h interfaceC3409h = (GeneratedMessageLite.InterfaceC3409h) obj;
                    H5DrawerLoading h5DrawerLoading = (H5DrawerLoading) obj2;
                    this.startColor_ = interfaceC3409h.mo17052f(!this.startColor_.isEmpty(), this.startColor_, !h5DrawerLoading.startColor_.isEmpty(), h5DrawerLoading.startColor_);
                    this.endColor_ = interfaceC3409h.mo17052f(!this.endColor_.isEmpty(), this.endColor_, !h5DrawerLoading.endColor_.isEmpty(), h5DrawerLoading.endColor_);
                    this.imageUrl_ = interfaceC3409h.mo17052f(!this.imageUrl_.isEmpty(), this.imageUrl_, !h5DrawerLoading.imageUrl_.isEmpty(), h5DrawerLoading.imageUrl_);
                    long j = this.transparency_;
                    boolean z2 = j != 0;
                    long j2 = h5DrawerLoading.transparency_;
                    this.transparency_ = interfaceC3409h.mo17055i(z2, j, j2 != 0, j2);
                    this.loadingType_ = interfaceC3409h.mo17052f(!this.loadingType_.isEmpty(), this.loadingType_, !h5DrawerLoading.loadingType_.isEmpty(), h5DrawerLoading.loadingType_);
                    GeneratedMessageLite.C3408g c3408g = GeneratedMessageLite.C3408g.INSTANCE;
                    return this;
                case 6:
                    C3430e c3430e = (C3430e) obj;
                    while (!z) {
                        try {
                            int iM17171M = c3430e.m17171M();
                            if (iM17171M != 0) {
                                if (iM17171M == 10) {
                                    this.startColor_ = c3430e.m17170L();
                                } else if (iM17171M == 18) {
                                    this.endColor_ = c3430e.m17170L();
                                } else if (iM17171M == 26) {
                                    this.imageUrl_ = c3430e.m17170L();
                                } else if (iM17171M == 32) {
                                    this.transparency_ = c3430e.m17197v();
                                } else if (iM17171M == 42) {
                                    this.loadingType_ = c3430e.m17170L();
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
                        synchronized (H5DrawerLoading.class) {
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
            if (!this.imageUrl_.isEmpty()) {
                iM16956K += CodedOutputStream.m16956K(3, getImageUrl());
            }
            long j = this.transparency_;
            if (j != 0) {
                iM16956K += CodedOutputStream.m16986v(4, j);
            }
            if (!this.loadingType_.isEmpty()) {
                iM16956K += CodedOutputStream.m16956K(5, getLoadingType());
            }
            this.memoizedSerializedSize = iM16956K;
            return iM16956K;
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

        @Override // com.google.protobuf.InterfaceC3442q
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (!this.startColor_.isEmpty()) {
                codedOutputStream.mo16994D0(1, getStartColor());
            }
            if (!this.endColor_.isEmpty()) {
                codedOutputStream.mo16994D0(2, getEndColor());
            }
            if (!this.imageUrl_.isEmpty()) {
                codedOutputStream.mo16994D0(3, getImageUrl());
            }
            long j = this.transparency_;
            if (j != 0) {
                codedOutputStream.m17027u0(4, j);
            }
            if (this.loadingType_.isEmpty()) {
                return;
            }
            codedOutputStream.mo16994D0(5, getLoadingType());
        }

        public static H5DrawerLoading parseDelimitedFrom(InputStream inputStream, C3433h c3433h) throws IOException {
            return (H5DrawerLoading) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, c3433h);
        }

        public static H5DrawerLoading parseFrom(ByteString byteString, C3433h c3433h) throws InvalidProtocolBufferException {
            return (H5DrawerLoading) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, c3433h);
        }

        public static H5DrawerLoading parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (H5DrawerLoading) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static H5DrawerLoading parseFrom(byte[] bArr, C3433h c3433h) throws InvalidProtocolBufferException {
            return (H5DrawerLoading) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, c3433h);
        }

        public static H5DrawerLoading parseFrom(InputStream inputStream) throws IOException {
            return (H5DrawerLoading) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static H5DrawerLoading parseFrom(InputStream inputStream, C3433h c3433h) throws IOException {
            return (H5DrawerLoading) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, c3433h);
        }

        public static H5DrawerLoading parseFrom(C3430e c3430e) throws IOException {
            return (H5DrawerLoading) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, c3430e);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static H5DrawerLoading parseFrom(C3430e c3430e, C3433h c3433h) throws IOException {
            return (H5DrawerLoading) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, c3430e, c3433h);
        }
    }

    public static final class H5PopUp extends GeneratedMessageLite<H5PopUp, Builder> implements H5PopUpOrBuilder {
        private static final H5PopUp DEFAULT_INSTANCE;
        public static final int JUMPSCHEME_FIELD_NUMBER = 1;
        private static volatile ng60<H5PopUp> PARSER;
        private String jumpScheme_ = "";

        public static final class Builder extends GeneratedMessageLite.AbstractC3403b<H5PopUp, Builder> implements H5PopUpOrBuilder {
            private Builder() {
                super(H5PopUp.DEFAULT_INSTANCE);
            }

            public Builder clearJumpScheme() {
                copyOnWrite();
                ((H5PopUp) this.instance).clearJumpScheme();
                return this;
            }

            @Override // com.p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage.H5PopUpOrBuilder
            public String getJumpScheme() {
                return ((H5PopUp) this.instance).getJumpScheme();
            }

            @Override // com.p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage.H5PopUpOrBuilder
            public ByteString getJumpSchemeBytes() {
                return ((H5PopUp) this.instance).getJumpSchemeBytes();
            }

            public Builder setJumpScheme(String str) {
                copyOnWrite();
                ((H5PopUp) this.instance).setJumpScheme(str);
                return this;
            }

            public Builder setJumpSchemeBytes(ByteString byteString) {
                copyOnWrite();
                ((H5PopUp) this.instance).setJumpSchemeBytes(byteString);
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
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(h5PopUp);
        }

        public static H5PopUp parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (H5PopUp) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static H5PopUp parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (H5PopUp) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static ng60<H5PopUp> parser() {
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
            AbstractC3426a.checkByteStringIsUtf8(byteString);
            this.jumpScheme_ = byteString.toStringUtf8();
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (C45881.f16673xa1df5c61[methodToInvoke.ordinal()]) {
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
                    this.jumpScheme_ = ((GeneratedMessageLite.InterfaceC3409h) obj).mo17052f(!this.jumpScheme_.isEmpty(), this.jumpScheme_, true ^ h5PopUp.jumpScheme_.isEmpty(), h5PopUp.jumpScheme_);
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
                                    this.jumpScheme_ = c3430e.m17170L();
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
                        synchronized (H5PopUp.class) {
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

        @Override // com.p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage.H5PopUpOrBuilder
        public String getJumpScheme() {
            return this.jumpScheme_;
        }

        @Override // com.p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage.H5PopUpOrBuilder
        public ByteString getJumpSchemeBytes() {
            return ByteString.copyFromUtf8(this.jumpScheme_);
        }

        @Override // com.google.protobuf.InterfaceC3442q
        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int iM16956K = !this.jumpScheme_.isEmpty() ? CodedOutputStream.m16956K(1, getJumpScheme()) : 0;
            this.memoizedSerializedSize = iM16956K;
            return iM16956K;
        }

        @Override // com.google.protobuf.InterfaceC3442q
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (this.jumpScheme_.isEmpty()) {
                return;
            }
            codedOutputStream.mo16994D0(1, getJumpScheme());
        }

        public static H5PopUp parseDelimitedFrom(InputStream inputStream, C3433h c3433h) throws IOException {
            return (H5PopUp) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, c3433h);
        }

        public static H5PopUp parseFrom(ByteString byteString, C3433h c3433h) throws InvalidProtocolBufferException {
            return (H5PopUp) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, c3433h);
        }

        public static H5PopUp parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (H5PopUp) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static H5PopUp parseFrom(byte[] bArr, C3433h c3433h) throws InvalidProtocolBufferException {
            return (H5PopUp) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, c3433h);
        }

        public static H5PopUp parseFrom(InputStream inputStream) throws IOException {
            return (H5PopUp) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static H5PopUp parseFrom(InputStream inputStream, C3433h c3433h) throws IOException {
            return (H5PopUp) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, c3433h);
        }

        public static H5PopUp parseFrom(C3430e c3430e) throws IOException {
            return (H5PopUp) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, c3430e);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static H5PopUp parseFrom(C3430e c3430e, C3433h c3433h) throws IOException {
            return (H5PopUp) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, c3430e, c3433h);
        }
    }

    public static final class LiveAnimationPlayMsg extends GeneratedMessageLite<LiveAnimationPlayMsg, Builder> implements LiveAnimationPlayMsgOrBuilder {
        public static final int ANIMATIONTYPE_FIELD_NUMBER = 13;
        private static final LiveAnimationPlayMsg DEFAULT_INSTANCE;
        public static final int DURATION_FIELD_NUMBER = 3;
        public static final int LIVERESOURCEID_FIELD_NUMBER = 2;
        private static volatile ng60<LiveAnimationPlayMsg> PARSER = null;
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
        private C3437l.h<VideoEffectExtra> videoEffectExtras_ = GeneratedMessageLite.emptyProtobufList();
        private String animationType_ = "";
        private C3437l.h<SvgaEffectExtra> svgaEffectExtras_ = GeneratedMessageLite.emptyProtobufList();

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
            AbstractC3426a.addAll(iterable, this.svgaEffectExtras_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllVideoEffectExtras(Iterable<? extends VideoEffectExtra> iterable) {
            ensureVideoEffectExtrasIsMutable();
            AbstractC3426a.addAll(iterable, this.videoEffectExtras_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addSvgaEffectExtras(SvgaEffectExtra.Builder builder) {
            ensureSvgaEffectExtrasIsMutable();
            this.svgaEffectExtras_.add(builder.build());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addVideoEffectExtras(VideoEffectExtra.Builder builder) {
            ensureVideoEffectExtrasIsMutable();
            this.videoEffectExtras_.add(builder.build());
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
            if (this.svgaEffectExtras_.mo17140q()) {
                return;
            }
            this.svgaEffectExtras_ = GeneratedMessageLite.mutableCopy(this.svgaEffectExtras_);
        }

        private void ensureVideoEffectExtrasIsMutable() {
            if (this.videoEffectExtras_.mo17140q()) {
                return;
            }
            this.videoEffectExtras_ = GeneratedMessageLite.mutableCopy(this.videoEffectExtras_);
        }

        public static LiveAnimationPlayMsg getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder(LiveAnimationPlayMsg liveAnimationPlayMsg) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(liveAnimationPlayMsg);
        }

        public static LiveAnimationPlayMsg parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (LiveAnimationPlayMsg) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static LiveAnimationPlayMsg parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (LiveAnimationPlayMsg) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static ng60<LiveAnimationPlayMsg> parser() {
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
            AbstractC3426a.checkByteStringIsUtf8(byteString);
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
            AbstractC3426a.checkByteStringIsUtf8(byteString);
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
            AbstractC3426a.checkByteStringIsUtf8(byteString);
            this.roomId_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSvgaEffectExtras(int i, SvgaEffectExtra.Builder builder) {
            ensureSvgaEffectExtrasIsMutable();
            this.svgaEffectExtras_.set(i, builder.build());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setToMyQueue(boolean z) {
            this.toMyQueue_ = z;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setVideoEffectExtras(int i, VideoEffectExtra.Builder builder) {
            ensureVideoEffectExtrasIsMutable();
            this.videoEffectExtras_.set(i, builder.build());
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            boolean z = false;
            switch (C45881.f16673xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new LiveAnimationPlayMsg();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                    this.videoEffectExtras_.mo17139n();
                    this.svgaEffectExtras_.mo17139n();
                    return null;
                case 4:
                    return new Builder();
                case 5:
                    GeneratedMessageLite.InterfaceC3409h interfaceC3409h = (GeneratedMessageLite.InterfaceC3409h) obj;
                    LiveAnimationPlayMsg liveAnimationPlayMsg = (LiveAnimationPlayMsg) obj2;
                    this.roomId_ = interfaceC3409h.mo17052f(!this.roomId_.isEmpty(), this.roomId_, !liveAnimationPlayMsg.roomId_.isEmpty(), liveAnimationPlayMsg.roomId_);
                    this.liveResourceId_ = interfaceC3409h.mo17052f(!this.liveResourceId_.isEmpty(), this.liveResourceId_, !liveAnimationPlayMsg.liveResourceId_.isEmpty(), liveAnimationPlayMsg.liveResourceId_);
                    long j = this.duration_;
                    boolean z2 = j != 0;
                    long j2 = liveAnimationPlayMsg.duration_;
                    this.duration_ = interfaceC3409h.mo17055i(z2, j, j2 != 0, j2);
                    long j3 = this.priority_;
                    boolean z3 = j3 != 0;
                    long j4 = liveAnimationPlayMsg.priority_;
                    this.priority_ = interfaceC3409h.mo17055i(z3, j3, j4 != 0, j4);
                    this.videoEffectExtras_ = interfaceC3409h.mo17053g(this.videoEffectExtras_, liveAnimationPlayMsg.videoEffectExtras_);
                    boolean z4 = this.toMyQueue_;
                    boolean z5 = liveAnimationPlayMsg.toMyQueue_;
                    this.toMyQueue_ = interfaceC3409h.mo17050d(z4, z4, z5, z5);
                    this.animationType_ = interfaceC3409h.mo17052f(!this.animationType_.isEmpty(), this.animationType_, !liveAnimationPlayMsg.animationType_.isEmpty(), liveAnimationPlayMsg.animationType_);
                    this.svgaEffectExtras_ = interfaceC3409h.mo17053g(this.svgaEffectExtras_, liveAnimationPlayMsg.svgaEffectExtras_);
                    if (interfaceC3409h == GeneratedMessageLite.C3408g.INSTANCE) {
                        this.bitField0_ |= liveAnimationPlayMsg.bitField0_;
                    }
                    return this;
                case 6:
                    C3430e c3430e = (C3430e) obj;
                    C3433h c3433h = (C3433h) obj2;
                    while (!z) {
                        try {
                            int iM17171M = c3430e.m17171M();
                            if (iM17171M != 0) {
                                if (iM17171M == 10) {
                                    this.roomId_ = c3430e.m17170L();
                                } else if (iM17171M == 18) {
                                    this.liveResourceId_ = c3430e.m17170L();
                                } else if (iM17171M == 24) {
                                    this.duration_ = c3430e.m17197v();
                                } else if (iM17171M == 32) {
                                    this.priority_ = c3430e.m17197v();
                                } else if (iM17171M == 50) {
                                    if (!this.videoEffectExtras_.mo17140q()) {
                                        this.videoEffectExtras_ = GeneratedMessageLite.mutableCopy(this.videoEffectExtras_);
                                    }
                                    this.videoEffectExtras_.add((VideoEffectExtra) c3430e.m17198w(VideoEffectExtra.parser(), c3433h));
                                } else if (iM17171M == 56) {
                                    this.toMyQueue_ = c3430e.m17188m();
                                } else if (iM17171M == 106) {
                                    this.animationType_ = c3430e.m17170L();
                                } else if (iM17171M == 114) {
                                    if (!this.svgaEffectExtras_.mo17140q()) {
                                        this.svgaEffectExtras_ = GeneratedMessageLite.mutableCopy(this.svgaEffectExtras_);
                                    }
                                    this.svgaEffectExtras_.add((SvgaEffectExtra) c3430e.m17198w(SvgaEffectExtra.parser(), c3433h));
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
                        synchronized (LiveAnimationPlayMsg.class) {
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

        @Override // com.google.protobuf.InterfaceC3442q
        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int iM16956K = !this.roomId_.isEmpty() ? CodedOutputStream.m16956K(1, getRoomId()) : 0;
            if (!this.liveResourceId_.isEmpty()) {
                iM16956K += CodedOutputStream.m16956K(2, getLiveResourceId());
            }
            long j = this.duration_;
            if (j != 0) {
                iM16956K += CodedOutputStream.m16986v(3, j);
            }
            long j2 = this.priority_;
            if (j2 != 0) {
                iM16956K += CodedOutputStream.m16986v(4, j2);
            }
            for (int i2 = 0; i2 < this.videoEffectExtras_.size(); i2++) {
                iM16956K += CodedOutputStream.m16948C(6, this.videoEffectExtras_.get(i2));
            }
            boolean z = this.toMyQueue_;
            if (z) {
                iM16956K += CodedOutputStream.m16970f(7, z);
            }
            if (!this.animationType_.isEmpty()) {
                iM16956K += CodedOutputStream.m16956K(13, getAnimationType());
            }
            for (int i3 = 0; i3 < this.svgaEffectExtras_.size(); i3++) {
                iM16956K += CodedOutputStream.m16948C(14, this.svgaEffectExtras_.get(i3));
            }
            this.memoizedSerializedSize = iM16956K;
            return iM16956K;
        }

        @Override // com.p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage.LiveAnimationPlayMsgOrBuilder
        public SvgaEffectExtra getSvgaEffectExtras(int i) {
            return this.svgaEffectExtras_.get(i);
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
            return this.svgaEffectExtras_.get(i);
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
            return this.videoEffectExtras_.get(i);
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
            return this.videoEffectExtras_.get(i);
        }

        public List<? extends VideoEffectExtraOrBuilder> getVideoEffectExtrasOrBuilderList() {
            return this.videoEffectExtras_;
        }

        @Override // com.google.protobuf.InterfaceC3442q
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (!this.roomId_.isEmpty()) {
                codedOutputStream.mo16994D0(1, getRoomId());
            }
            if (!this.liveResourceId_.isEmpty()) {
                codedOutputStream.mo16994D0(2, getLiveResourceId());
            }
            long j = this.duration_;
            if (j != 0) {
                codedOutputStream.m17027u0(3, j);
            }
            long j2 = this.priority_;
            if (j2 != 0) {
                codedOutputStream.m17027u0(4, j2);
            }
            for (int i = 0; i < this.videoEffectExtras_.size(); i++) {
                codedOutputStream.mo17029w0(6, this.videoEffectExtras_.get(i));
            }
            boolean z = this.toMyQueue_;
            if (z) {
                codedOutputStream.mo17005a0(7, z);
            }
            if (!this.animationType_.isEmpty()) {
                codedOutputStream.mo16994D0(13, getAnimationType());
            }
            for (int i2 = 0; i2 < this.svgaEffectExtras_.size(); i2++) {
                codedOutputStream.mo17029w0(14, this.svgaEffectExtras_.get(i2));
            }
        }

        public static LiveAnimationPlayMsg parseDelimitedFrom(InputStream inputStream, C3433h c3433h) throws IOException {
            return (LiveAnimationPlayMsg) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, c3433h);
        }

        public static LiveAnimationPlayMsg parseFrom(ByteString byteString, C3433h c3433h) throws InvalidProtocolBufferException {
            return (LiveAnimationPlayMsg) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, c3433h);
        }

        public static final class Builder extends GeneratedMessageLite.AbstractC3403b<LiveAnimationPlayMsg, Builder> implements LiveAnimationPlayMsgOrBuilder {
            private Builder() {
                super(LiveAnimationPlayMsg.DEFAULT_INSTANCE);
            }

            public Builder addAllSvgaEffectExtras(Iterable<? extends SvgaEffectExtra> iterable) {
                copyOnWrite();
                ((LiveAnimationPlayMsg) this.instance).addAllSvgaEffectExtras(iterable);
                return this;
            }

            public Builder addAllVideoEffectExtras(Iterable<? extends VideoEffectExtra> iterable) {
                copyOnWrite();
                ((LiveAnimationPlayMsg) this.instance).addAllVideoEffectExtras(iterable);
                return this;
            }

            public Builder addSvgaEffectExtras(SvgaEffectExtra svgaEffectExtra) {
                copyOnWrite();
                ((LiveAnimationPlayMsg) this.instance).addSvgaEffectExtras(svgaEffectExtra);
                return this;
            }

            public Builder addVideoEffectExtras(VideoEffectExtra videoEffectExtra) {
                copyOnWrite();
                ((LiveAnimationPlayMsg) this.instance).addVideoEffectExtras(videoEffectExtra);
                return this;
            }

            public Builder clearAnimationType() {
                copyOnWrite();
                ((LiveAnimationPlayMsg) this.instance).clearAnimationType();
                return this;
            }

            public Builder clearDuration() {
                copyOnWrite();
                ((LiveAnimationPlayMsg) this.instance).clearDuration();
                return this;
            }

            public Builder clearLiveResourceId() {
                copyOnWrite();
                ((LiveAnimationPlayMsg) this.instance).clearLiveResourceId();
                return this;
            }

            public Builder clearPriority() {
                copyOnWrite();
                ((LiveAnimationPlayMsg) this.instance).clearPriority();
                return this;
            }

            public Builder clearRoomId() {
                copyOnWrite();
                ((LiveAnimationPlayMsg) this.instance).clearRoomId();
                return this;
            }

            public Builder clearSvgaEffectExtras() {
                copyOnWrite();
                ((LiveAnimationPlayMsg) this.instance).clearSvgaEffectExtras();
                return this;
            }

            public Builder clearToMyQueue() {
                copyOnWrite();
                ((LiveAnimationPlayMsg) this.instance).clearToMyQueue();
                return this;
            }

            public Builder clearVideoEffectExtras() {
                copyOnWrite();
                ((LiveAnimationPlayMsg) this.instance).clearVideoEffectExtras();
                return this;
            }

            @Override // com.p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage.LiveAnimationPlayMsgOrBuilder
            public String getAnimationType() {
                return ((LiveAnimationPlayMsg) this.instance).getAnimationType();
            }

            @Override // com.p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage.LiveAnimationPlayMsgOrBuilder
            public ByteString getAnimationTypeBytes() {
                return ((LiveAnimationPlayMsg) this.instance).getAnimationTypeBytes();
            }

            @Override // com.p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage.LiveAnimationPlayMsgOrBuilder
            public long getDuration() {
                return ((LiveAnimationPlayMsg) this.instance).getDuration();
            }

            @Override // com.p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage.LiveAnimationPlayMsgOrBuilder
            public String getLiveResourceId() {
                return ((LiveAnimationPlayMsg) this.instance).getLiveResourceId();
            }

            @Override // com.p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage.LiveAnimationPlayMsgOrBuilder
            public ByteString getLiveResourceIdBytes() {
                return ((LiveAnimationPlayMsg) this.instance).getLiveResourceIdBytes();
            }

            @Override // com.p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage.LiveAnimationPlayMsgOrBuilder
            public long getPriority() {
                return ((LiveAnimationPlayMsg) this.instance).getPriority();
            }

            @Override // com.p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage.LiveAnimationPlayMsgOrBuilder
            public String getRoomId() {
                return ((LiveAnimationPlayMsg) this.instance).getRoomId();
            }

            @Override // com.p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage.LiveAnimationPlayMsgOrBuilder
            public ByteString getRoomIdBytes() {
                return ((LiveAnimationPlayMsg) this.instance).getRoomIdBytes();
            }

            @Override // com.p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage.LiveAnimationPlayMsgOrBuilder
            public SvgaEffectExtra getSvgaEffectExtras(int i) {
                return ((LiveAnimationPlayMsg) this.instance).getSvgaEffectExtras(i);
            }

            @Override // com.p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage.LiveAnimationPlayMsgOrBuilder
            public int getSvgaEffectExtrasCount() {
                return ((LiveAnimationPlayMsg) this.instance).getSvgaEffectExtrasCount();
            }

            @Override // com.p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage.LiveAnimationPlayMsgOrBuilder
            public List<SvgaEffectExtra> getSvgaEffectExtrasList() {
                return Collections.unmodifiableList(((LiveAnimationPlayMsg) this.instance).getSvgaEffectExtrasList());
            }

            @Override // com.p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage.LiveAnimationPlayMsgOrBuilder
            public boolean getToMyQueue() {
                return ((LiveAnimationPlayMsg) this.instance).getToMyQueue();
            }

            @Override // com.p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage.LiveAnimationPlayMsgOrBuilder
            public VideoEffectExtra getVideoEffectExtras(int i) {
                return ((LiveAnimationPlayMsg) this.instance).getVideoEffectExtras(i);
            }

            @Override // com.p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage.LiveAnimationPlayMsgOrBuilder
            public int getVideoEffectExtrasCount() {
                return ((LiveAnimationPlayMsg) this.instance).getVideoEffectExtrasCount();
            }

            @Override // com.p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage.LiveAnimationPlayMsgOrBuilder
            public List<VideoEffectExtra> getVideoEffectExtrasList() {
                return Collections.unmodifiableList(((LiveAnimationPlayMsg) this.instance).getVideoEffectExtrasList());
            }

            public Builder removeSvgaEffectExtras(int i) {
                copyOnWrite();
                ((LiveAnimationPlayMsg) this.instance).removeSvgaEffectExtras(i);
                return this;
            }

            public Builder removeVideoEffectExtras(int i) {
                copyOnWrite();
                ((LiveAnimationPlayMsg) this.instance).removeVideoEffectExtras(i);
                return this;
            }

            public Builder setAnimationType(String str) {
                copyOnWrite();
                ((LiveAnimationPlayMsg) this.instance).setAnimationType(str);
                return this;
            }

            public Builder setAnimationTypeBytes(ByteString byteString) {
                copyOnWrite();
                ((LiveAnimationPlayMsg) this.instance).setAnimationTypeBytes(byteString);
                return this;
            }

            public Builder setDuration(long j) {
                copyOnWrite();
                ((LiveAnimationPlayMsg) this.instance).setDuration(j);
                return this;
            }

            public Builder setLiveResourceId(String str) {
                copyOnWrite();
                ((LiveAnimationPlayMsg) this.instance).setLiveResourceId(str);
                return this;
            }

            public Builder setLiveResourceIdBytes(ByteString byteString) {
                copyOnWrite();
                ((LiveAnimationPlayMsg) this.instance).setLiveResourceIdBytes(byteString);
                return this;
            }

            public Builder setPriority(long j) {
                copyOnWrite();
                ((LiveAnimationPlayMsg) this.instance).setPriority(j);
                return this;
            }

            public Builder setRoomId(String str) {
                copyOnWrite();
                ((LiveAnimationPlayMsg) this.instance).setRoomId(str);
                return this;
            }

            public Builder setRoomIdBytes(ByteString byteString) {
                copyOnWrite();
                ((LiveAnimationPlayMsg) this.instance).setRoomIdBytes(byteString);
                return this;
            }

            public Builder setSvgaEffectExtras(int i, SvgaEffectExtra svgaEffectExtra) {
                copyOnWrite();
                ((LiveAnimationPlayMsg) this.instance).setSvgaEffectExtras(i, svgaEffectExtra);
                return this;
            }

            public Builder setToMyQueue(boolean z) {
                copyOnWrite();
                ((LiveAnimationPlayMsg) this.instance).setToMyQueue(z);
                return this;
            }

            public Builder setVideoEffectExtras(int i, VideoEffectExtra videoEffectExtra) {
                copyOnWrite();
                ((LiveAnimationPlayMsg) this.instance).setVideoEffectExtras(i, videoEffectExtra);
                return this;
            }

            public Builder addSvgaEffectExtras(int i, SvgaEffectExtra svgaEffectExtra) {
                copyOnWrite();
                ((LiveAnimationPlayMsg) this.instance).addSvgaEffectExtras(i, svgaEffectExtra);
                return this;
            }

            public Builder addVideoEffectExtras(int i, VideoEffectExtra videoEffectExtra) {
                copyOnWrite();
                ((LiveAnimationPlayMsg) this.instance).addVideoEffectExtras(i, videoEffectExtra);
                return this;
            }

            public Builder setSvgaEffectExtras(int i, SvgaEffectExtra.Builder builder) {
                copyOnWrite();
                ((LiveAnimationPlayMsg) this.instance).setSvgaEffectExtras(i, builder);
                return this;
            }

            public Builder setVideoEffectExtras(int i, VideoEffectExtra.Builder builder) {
                copyOnWrite();
                ((LiveAnimationPlayMsg) this.instance).setVideoEffectExtras(i, builder);
                return this;
            }

            public Builder addSvgaEffectExtras(SvgaEffectExtra.Builder builder) {
                copyOnWrite();
                ((LiveAnimationPlayMsg) this.instance).addSvgaEffectExtras(builder);
                return this;
            }

            public Builder addVideoEffectExtras(VideoEffectExtra.Builder builder) {
                copyOnWrite();
                ((LiveAnimationPlayMsg) this.instance).addVideoEffectExtras(builder);
                return this;
            }

            public Builder addSvgaEffectExtras(int i, SvgaEffectExtra.Builder builder) {
                copyOnWrite();
                ((LiveAnimationPlayMsg) this.instance).addSvgaEffectExtras(i, builder);
                return this;
            }

            public Builder addVideoEffectExtras(int i, VideoEffectExtra.Builder builder) {
                copyOnWrite();
                ((LiveAnimationPlayMsg) this.instance).addVideoEffectExtras(i, builder);
                return this;
            }
        }

        public static LiveAnimationPlayMsg parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (LiveAnimationPlayMsg) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static LiveAnimationPlayMsg parseFrom(byte[] bArr, C3433h c3433h) throws InvalidProtocolBufferException {
            return (LiveAnimationPlayMsg) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, c3433h);
        }

        public static LiveAnimationPlayMsg parseFrom(InputStream inputStream) throws IOException {
            return (LiveAnimationPlayMsg) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static LiveAnimationPlayMsg parseFrom(InputStream inputStream, C3433h c3433h) throws IOException {
            return (LiveAnimationPlayMsg) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, c3433h);
        }

        public static LiveAnimationPlayMsg parseFrom(C3430e c3430e) throws IOException {
            return (LiveAnimationPlayMsg) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, c3430e);
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
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static LiveAnimationPlayMsg parseFrom(C3430e c3430e, C3433h c3433h) throws IOException {
            return (LiveAnimationPlayMsg) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, c3430e, c3433h);
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
            this.svgaEffectExtras_.add(i, builder.build());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addVideoEffectExtras(int i, VideoEffectExtra.Builder builder) {
            ensureVideoEffectExtrasIsMutable();
            this.videoEffectExtras_.add(i, builder.build());
        }
    }

    public static final class LotteryGiftRedPacketAnimationMsg extends GeneratedMessageLite<LotteryGiftRedPacketAnimationMsg, Builder> implements LotteryGiftRedPacketAnimationMsgOrBuilder {
        private static final LotteryGiftRedPacketAnimationMsg DEFAULT_INSTANCE;
        public static final int GIFT_FIELD_NUMBER = 2;
        private static volatile ng60<LotteryGiftRedPacketAnimationMsg> PARSER = null;
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
                this.gift_ = LotteryGiftRedPacketGift.newBuilder(this.gift_).mergeFrom(lotteryGiftRedPacketGift).buildPartial();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeSender(LotteryGiftRedPacketSender lotteryGiftRedPacketSender) {
            LotteryGiftRedPacketSender lotteryGiftRedPacketSender2 = this.sender_;
            if (lotteryGiftRedPacketSender2 == null || lotteryGiftRedPacketSender2 == LotteryGiftRedPacketSender.getDefaultInstance()) {
                this.sender_ = lotteryGiftRedPacketSender;
            } else {
                this.sender_ = LotteryGiftRedPacketSender.newBuilder(this.sender_).mergeFrom(lotteryGiftRedPacketSender).buildPartial();
            }
        }

        public static Builder newBuilder(LotteryGiftRedPacketAnimationMsg lotteryGiftRedPacketAnimationMsg) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(lotteryGiftRedPacketAnimationMsg);
        }

        public static LotteryGiftRedPacketAnimationMsg parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (LotteryGiftRedPacketAnimationMsg) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static LotteryGiftRedPacketAnimationMsg parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (LotteryGiftRedPacketAnimationMsg) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static ng60<LotteryGiftRedPacketAnimationMsg> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setGift(LotteryGiftRedPacketGift.Builder builder) {
            this.gift_ = builder.build();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSender(LotteryGiftRedPacketSender.Builder builder) {
            this.sender_ = builder.build();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setShowSeconds(long j) {
            this.showSeconds_ = j;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            boolean z = false;
            switch (C45881.f16673xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new LotteryGiftRedPacketAnimationMsg();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                    return null;
                case 4:
                    return new Builder();
                case 5:
                    GeneratedMessageLite.InterfaceC3409h interfaceC3409h = (GeneratedMessageLite.InterfaceC3409h) obj;
                    LotteryGiftRedPacketAnimationMsg lotteryGiftRedPacketAnimationMsg = (LotteryGiftRedPacketAnimationMsg) obj2;
                    this.sender_ = (LotteryGiftRedPacketSender) interfaceC3409h.mo17061o(this.sender_, lotteryGiftRedPacketAnimationMsg.sender_);
                    this.gift_ = (LotteryGiftRedPacketGift) interfaceC3409h.mo17061o(this.gift_, lotteryGiftRedPacketAnimationMsg.gift_);
                    long j = this.showSeconds_;
                    boolean z2 = j != 0;
                    long j2 = lotteryGiftRedPacketAnimationMsg.showSeconds_;
                    this.showSeconds_ = interfaceC3409h.mo17055i(z2, j, j2 != 0, j2);
                    GeneratedMessageLite.C3408g c3408g = GeneratedMessageLite.C3408g.INSTANCE;
                    return this;
                case 6:
                    C3430e c3430e = (C3430e) obj;
                    C3433h c3433h = (C3433h) obj2;
                    while (!z) {
                        try {
                            int iM17171M = c3430e.m17171M();
                            if (iM17171M != 0) {
                                if (iM17171M == 10) {
                                    LotteryGiftRedPacketSender lotteryGiftRedPacketSender = this.sender_;
                                    LotteryGiftRedPacketSender.Builder builder = lotteryGiftRedPacketSender != null ? lotteryGiftRedPacketSender.toBuilder() : null;
                                    LotteryGiftRedPacketSender lotteryGiftRedPacketSender2 = (LotteryGiftRedPacketSender) c3430e.m17198w(LotteryGiftRedPacketSender.parser(), c3433h);
                                    this.sender_ = lotteryGiftRedPacketSender2;
                                    if (builder != null) {
                                        builder.mergeFrom(lotteryGiftRedPacketSender2);
                                        this.sender_ = builder.buildPartial();
                                    }
                                } else if (iM17171M == 18) {
                                    LotteryGiftRedPacketGift lotteryGiftRedPacketGift = this.gift_;
                                    LotteryGiftRedPacketGift.Builder builder2 = lotteryGiftRedPacketGift != null ? lotteryGiftRedPacketGift.toBuilder() : null;
                                    LotteryGiftRedPacketGift lotteryGiftRedPacketGift2 = (LotteryGiftRedPacketGift) c3430e.m17198w(LotteryGiftRedPacketGift.parser(), c3433h);
                                    this.gift_ = lotteryGiftRedPacketGift2;
                                    if (builder2 != null) {
                                        builder2.mergeFrom(lotteryGiftRedPacketGift2);
                                        this.gift_ = builder2.buildPartial();
                                    }
                                } else if (iM17171M == 24) {
                                    this.showSeconds_ = c3430e.m17197v();
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
                        synchronized (LotteryGiftRedPacketAnimationMsg.class) {
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

        @Override // com.google.protobuf.InterfaceC3442q
        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int iM16948C = this.sender_ != null ? CodedOutputStream.m16948C(1, getSender()) : 0;
            if (this.gift_ != null) {
                iM16948C += CodedOutputStream.m16948C(2, getGift());
            }
            long j = this.showSeconds_;
            if (j != 0) {
                iM16948C += CodedOutputStream.m16986v(3, j);
            }
            this.memoizedSerializedSize = iM16948C;
            return iM16948C;
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

        @Override // com.google.protobuf.InterfaceC3442q
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (this.sender_ != null) {
                codedOutputStream.mo17029w0(1, getSender());
            }
            if (this.gift_ != null) {
                codedOutputStream.mo17029w0(2, getGift());
            }
            long j = this.showSeconds_;
            if (j != 0) {
                codedOutputStream.m17027u0(3, j);
            }
        }

        public static LotteryGiftRedPacketAnimationMsg parseDelimitedFrom(InputStream inputStream, C3433h c3433h) throws IOException {
            return (LotteryGiftRedPacketAnimationMsg) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, c3433h);
        }

        public static LotteryGiftRedPacketAnimationMsg parseFrom(ByteString byteString, C3433h c3433h) throws InvalidProtocolBufferException {
            return (LotteryGiftRedPacketAnimationMsg) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, c3433h);
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

        public static final class Builder extends GeneratedMessageLite.AbstractC3403b<LotteryGiftRedPacketAnimationMsg, Builder> implements LotteryGiftRedPacketAnimationMsgOrBuilder {
            private Builder() {
                super(LotteryGiftRedPacketAnimationMsg.DEFAULT_INSTANCE);
            }

            public Builder clearGift() {
                copyOnWrite();
                ((LotteryGiftRedPacketAnimationMsg) this.instance).clearGift();
                return this;
            }

            public Builder clearSender() {
                copyOnWrite();
                ((LotteryGiftRedPacketAnimationMsg) this.instance).clearSender();
                return this;
            }

            public Builder clearShowSeconds() {
                copyOnWrite();
                ((LotteryGiftRedPacketAnimationMsg) this.instance).clearShowSeconds();
                return this;
            }

            @Override // com.p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage.LotteryGiftRedPacketAnimationMsgOrBuilder
            public LotteryGiftRedPacketGift getGift() {
                return ((LotteryGiftRedPacketAnimationMsg) this.instance).getGift();
            }

            @Override // com.p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage.LotteryGiftRedPacketAnimationMsgOrBuilder
            public LotteryGiftRedPacketSender getSender() {
                return ((LotteryGiftRedPacketAnimationMsg) this.instance).getSender();
            }

            @Override // com.p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage.LotteryGiftRedPacketAnimationMsgOrBuilder
            public long getShowSeconds() {
                return ((LotteryGiftRedPacketAnimationMsg) this.instance).getShowSeconds();
            }

            @Override // com.p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage.LotteryGiftRedPacketAnimationMsgOrBuilder
            public boolean hasGift() {
                return ((LotteryGiftRedPacketAnimationMsg) this.instance).hasGift();
            }

            @Override // com.p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage.LotteryGiftRedPacketAnimationMsgOrBuilder
            public boolean hasSender() {
                return ((LotteryGiftRedPacketAnimationMsg) this.instance).hasSender();
            }

            public Builder mergeGift(LotteryGiftRedPacketGift lotteryGiftRedPacketGift) {
                copyOnWrite();
                ((LotteryGiftRedPacketAnimationMsg) this.instance).mergeGift(lotteryGiftRedPacketGift);
                return this;
            }

            public Builder mergeSender(LotteryGiftRedPacketSender lotteryGiftRedPacketSender) {
                copyOnWrite();
                ((LotteryGiftRedPacketAnimationMsg) this.instance).mergeSender(lotteryGiftRedPacketSender);
                return this;
            }

            public Builder setGift(LotteryGiftRedPacketGift lotteryGiftRedPacketGift) {
                copyOnWrite();
                ((LotteryGiftRedPacketAnimationMsg) this.instance).setGift(lotteryGiftRedPacketGift);
                return this;
            }

            public Builder setSender(LotteryGiftRedPacketSender lotteryGiftRedPacketSender) {
                copyOnWrite();
                ((LotteryGiftRedPacketAnimationMsg) this.instance).setSender(lotteryGiftRedPacketSender);
                return this;
            }

            public Builder setShowSeconds(long j) {
                copyOnWrite();
                ((LotteryGiftRedPacketAnimationMsg) this.instance).setShowSeconds(j);
                return this;
            }

            public Builder setGift(LotteryGiftRedPacketGift.Builder builder) {
                copyOnWrite();
                ((LotteryGiftRedPacketAnimationMsg) this.instance).setGift(builder);
                return this;
            }

            public Builder setSender(LotteryGiftRedPacketSender.Builder builder) {
                copyOnWrite();
                ((LotteryGiftRedPacketAnimationMsg) this.instance).setSender(builder);
                return this;
            }
        }

        public static LotteryGiftRedPacketAnimationMsg parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (LotteryGiftRedPacketAnimationMsg) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static LotteryGiftRedPacketAnimationMsg parseFrom(byte[] bArr, C3433h c3433h) throws InvalidProtocolBufferException {
            return (LotteryGiftRedPacketAnimationMsg) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, c3433h);
        }

        public static LotteryGiftRedPacketAnimationMsg parseFrom(InputStream inputStream) throws IOException {
            return (LotteryGiftRedPacketAnimationMsg) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static LotteryGiftRedPacketAnimationMsg parseFrom(InputStream inputStream, C3433h c3433h) throws IOException {
            return (LotteryGiftRedPacketAnimationMsg) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, c3433h);
        }

        public static LotteryGiftRedPacketAnimationMsg parseFrom(C3430e c3430e) throws IOException {
            return (LotteryGiftRedPacketAnimationMsg) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, c3430e);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static LotteryGiftRedPacketAnimationMsg parseFrom(C3430e c3430e, C3433h c3433h) throws IOException {
            return (LotteryGiftRedPacketAnimationMsg) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, c3430e, c3433h);
        }
    }

    public static final class LotteryGiftRedPacketGift extends GeneratedMessageLite<LotteryGiftRedPacketGift, Builder> implements LotteryGiftRedPacketGiftOrBuilder {
        public static final int AMOUNT_FIELD_NUMBER = 5;
        private static final LotteryGiftRedPacketGift DEFAULT_INSTANCE;
        public static final int ID_FIELD_NUMBER = 1;
        public static final int NAME_FIELD_NUMBER = 2;
        public static final int NUM_FIELD_NUMBER = 4;
        private static volatile ng60<LotteryGiftRedPacketGift> PARSER = null;
        public static final int URL_FIELD_NUMBER = 3;
        private long amount_;
        private long num_;
        private String id_ = "";
        private String name_ = "";
        private String url_ = "";

        public static final class Builder extends GeneratedMessageLite.AbstractC3403b<LotteryGiftRedPacketGift, Builder> implements LotteryGiftRedPacketGiftOrBuilder {
            private Builder() {
                super(LotteryGiftRedPacketGift.DEFAULT_INSTANCE);
            }

            public Builder clearAmount() {
                copyOnWrite();
                ((LotteryGiftRedPacketGift) this.instance).clearAmount();
                return this;
            }

            public Builder clearId() {
                copyOnWrite();
                ((LotteryGiftRedPacketGift) this.instance).clearId();
                return this;
            }

            public Builder clearName() {
                copyOnWrite();
                ((LotteryGiftRedPacketGift) this.instance).clearName();
                return this;
            }

            public Builder clearNum() {
                copyOnWrite();
                ((LotteryGiftRedPacketGift) this.instance).clearNum();
                return this;
            }

            public Builder clearUrl() {
                copyOnWrite();
                ((LotteryGiftRedPacketGift) this.instance).clearUrl();
                return this;
            }

            @Override // com.p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage.LotteryGiftRedPacketGiftOrBuilder
            public long getAmount() {
                return ((LotteryGiftRedPacketGift) this.instance).getAmount();
            }

            @Override // com.p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage.LotteryGiftRedPacketGiftOrBuilder
            public String getId() {
                return ((LotteryGiftRedPacketGift) this.instance).getId();
            }

            @Override // com.p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage.LotteryGiftRedPacketGiftOrBuilder
            public ByteString getIdBytes() {
                return ((LotteryGiftRedPacketGift) this.instance).getIdBytes();
            }

            @Override // com.p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage.LotteryGiftRedPacketGiftOrBuilder
            public String getName() {
                return ((LotteryGiftRedPacketGift) this.instance).getName();
            }

            @Override // com.p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage.LotteryGiftRedPacketGiftOrBuilder
            public ByteString getNameBytes() {
                return ((LotteryGiftRedPacketGift) this.instance).getNameBytes();
            }

            @Override // com.p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage.LotteryGiftRedPacketGiftOrBuilder
            public long getNum() {
                return ((LotteryGiftRedPacketGift) this.instance).getNum();
            }

            @Override // com.p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage.LotteryGiftRedPacketGiftOrBuilder
            public String getUrl() {
                return ((LotteryGiftRedPacketGift) this.instance).getUrl();
            }

            @Override // com.p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage.LotteryGiftRedPacketGiftOrBuilder
            public ByteString getUrlBytes() {
                return ((LotteryGiftRedPacketGift) this.instance).getUrlBytes();
            }

            public Builder setAmount(long j) {
                copyOnWrite();
                ((LotteryGiftRedPacketGift) this.instance).setAmount(j);
                return this;
            }

            public Builder setId(String str) {
                copyOnWrite();
                ((LotteryGiftRedPacketGift) this.instance).setId(str);
                return this;
            }

            public Builder setIdBytes(ByteString byteString) {
                copyOnWrite();
                ((LotteryGiftRedPacketGift) this.instance).setIdBytes(byteString);
                return this;
            }

            public Builder setName(String str) {
                copyOnWrite();
                ((LotteryGiftRedPacketGift) this.instance).setName(str);
                return this;
            }

            public Builder setNameBytes(ByteString byteString) {
                copyOnWrite();
                ((LotteryGiftRedPacketGift) this.instance).setNameBytes(byteString);
                return this;
            }

            public Builder setNum(long j) {
                copyOnWrite();
                ((LotteryGiftRedPacketGift) this.instance).setNum(j);
                return this;
            }

            public Builder setUrl(String str) {
                copyOnWrite();
                ((LotteryGiftRedPacketGift) this.instance).setUrl(str);
                return this;
            }

            public Builder setUrlBytes(ByteString byteString) {
                copyOnWrite();
                ((LotteryGiftRedPacketGift) this.instance).setUrlBytes(byteString);
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
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(lotteryGiftRedPacketGift);
        }

        public static LotteryGiftRedPacketGift parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (LotteryGiftRedPacketGift) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static LotteryGiftRedPacketGift parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (LotteryGiftRedPacketGift) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static ng60<LotteryGiftRedPacketGift> parser() {
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
            AbstractC3426a.checkByteStringIsUtf8(byteString);
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
            AbstractC3426a.checkByteStringIsUtf8(byteString);
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
            AbstractC3426a.checkByteStringIsUtf8(byteString);
            this.url_ = byteString.toStringUtf8();
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            boolean z = false;
            switch (C45881.f16673xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new LotteryGiftRedPacketGift();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                    return null;
                case 4:
                    return new Builder();
                case 5:
                    GeneratedMessageLite.InterfaceC3409h interfaceC3409h = (GeneratedMessageLite.InterfaceC3409h) obj;
                    LotteryGiftRedPacketGift lotteryGiftRedPacketGift = (LotteryGiftRedPacketGift) obj2;
                    this.id_ = interfaceC3409h.mo17052f(!this.id_.isEmpty(), this.id_, !lotteryGiftRedPacketGift.id_.isEmpty(), lotteryGiftRedPacketGift.id_);
                    this.name_ = interfaceC3409h.mo17052f(!this.name_.isEmpty(), this.name_, !lotteryGiftRedPacketGift.name_.isEmpty(), lotteryGiftRedPacketGift.name_);
                    this.url_ = interfaceC3409h.mo17052f(!this.url_.isEmpty(), this.url_, !lotteryGiftRedPacketGift.url_.isEmpty(), lotteryGiftRedPacketGift.url_);
                    long j = this.num_;
                    boolean z2 = j != 0;
                    long j2 = lotteryGiftRedPacketGift.num_;
                    this.num_ = interfaceC3409h.mo17055i(z2, j, j2 != 0, j2);
                    boolean z3 = false;
                    long j3 = this.amount_;
                    if (j3 != 0) {
                        z3 = true;
                    }
                    long j4 = lotteryGiftRedPacketGift.amount_;
                    this.amount_ = interfaceC3409h.mo17055i(z3, j3, j4 != 0, j4);
                    GeneratedMessageLite.C3408g c3408g = GeneratedMessageLite.C3408g.INSTANCE;
                    return this;
                case 6:
                    C3430e c3430e = (C3430e) obj;
                    while (!z) {
                        try {
                            int iM17171M = c3430e.m17171M();
                            if (iM17171M != 0) {
                                if (iM17171M == 10) {
                                    this.id_ = c3430e.m17170L();
                                } else if (iM17171M == 18) {
                                    this.name_ = c3430e.m17170L();
                                } else if (iM17171M == 26) {
                                    this.url_ = c3430e.m17170L();
                                } else if (iM17171M == 32) {
                                    this.num_ = c3430e.m17197v();
                                } else if (iM17171M == 40) {
                                    this.amount_ = c3430e.m17197v();
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
                        synchronized (LotteryGiftRedPacketGift.class) {
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

        @Override // com.google.protobuf.InterfaceC3442q
        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int iM16956K = !this.id_.isEmpty() ? CodedOutputStream.m16956K(1, getId()) : 0;
            if (!this.name_.isEmpty()) {
                iM16956K += CodedOutputStream.m16956K(2, getName());
            }
            if (!this.url_.isEmpty()) {
                iM16956K += CodedOutputStream.m16956K(3, getUrl());
            }
            long j = this.num_;
            if (j != 0) {
                iM16956K += CodedOutputStream.m16986v(4, j);
            }
            long j2 = this.amount_;
            if (j2 != 0) {
                iM16956K += CodedOutputStream.m16986v(5, j2);
            }
            this.memoizedSerializedSize = iM16956K;
            return iM16956K;
        }

        @Override // com.p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage.LotteryGiftRedPacketGiftOrBuilder
        public String getUrl() {
            return this.url_;
        }

        @Override // com.p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage.LotteryGiftRedPacketGiftOrBuilder
        public ByteString getUrlBytes() {
            return ByteString.copyFromUtf8(this.url_);
        }

        @Override // com.google.protobuf.InterfaceC3442q
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (!this.id_.isEmpty()) {
                codedOutputStream.mo16994D0(1, getId());
            }
            if (!this.name_.isEmpty()) {
                codedOutputStream.mo16994D0(2, getName());
            }
            if (!this.url_.isEmpty()) {
                codedOutputStream.mo16994D0(3, getUrl());
            }
            long j = this.num_;
            if (j != 0) {
                codedOutputStream.m17027u0(4, j);
            }
            long j2 = this.amount_;
            if (j2 != 0) {
                codedOutputStream.m17027u0(5, j2);
            }
        }

        public static LotteryGiftRedPacketGift parseDelimitedFrom(InputStream inputStream, C3433h c3433h) throws IOException {
            return (LotteryGiftRedPacketGift) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, c3433h);
        }

        public static LotteryGiftRedPacketGift parseFrom(ByteString byteString, C3433h c3433h) throws InvalidProtocolBufferException {
            return (LotteryGiftRedPacketGift) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, c3433h);
        }

        public static LotteryGiftRedPacketGift parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (LotteryGiftRedPacketGift) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static LotteryGiftRedPacketGift parseFrom(byte[] bArr, C3433h c3433h) throws InvalidProtocolBufferException {
            return (LotteryGiftRedPacketGift) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, c3433h);
        }

        public static LotteryGiftRedPacketGift parseFrom(InputStream inputStream) throws IOException {
            return (LotteryGiftRedPacketGift) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static LotteryGiftRedPacketGift parseFrom(InputStream inputStream, C3433h c3433h) throws IOException {
            return (LotteryGiftRedPacketGift) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, c3433h);
        }

        public static LotteryGiftRedPacketGift parseFrom(C3430e c3430e) throws IOException {
            return (LotteryGiftRedPacketGift) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, c3430e);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static LotteryGiftRedPacketGift parseFrom(C3430e c3430e, C3433h c3433h) throws IOException {
            return (LotteryGiftRedPacketGift) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, c3430e, c3433h);
        }
    }

    public static final class LotteryGiftRedPacketSender extends GeneratedMessageLite<LotteryGiftRedPacketSender, Builder> implements LotteryGiftRedPacketSenderOrBuilder {
        public static final int AVATARURL_FIELD_NUMBER = 3;
        private static final LotteryGiftRedPacketSender DEFAULT_INSTANCE;
        public static final int NAME_FIELD_NUMBER = 2;
        private static volatile ng60<LotteryGiftRedPacketSender> PARSER = null;
        public static final int USERID_FIELD_NUMBER = 1;
        private String userId_ = "";
        private String name_ = "";
        private String avatarUrl_ = "";

        public static final class Builder extends GeneratedMessageLite.AbstractC3403b<LotteryGiftRedPacketSender, Builder> implements LotteryGiftRedPacketSenderOrBuilder {
            private Builder() {
                super(LotteryGiftRedPacketSender.DEFAULT_INSTANCE);
            }

            public Builder clearAvatarUrl() {
                copyOnWrite();
                ((LotteryGiftRedPacketSender) this.instance).clearAvatarUrl();
                return this;
            }

            public Builder clearName() {
                copyOnWrite();
                ((LotteryGiftRedPacketSender) this.instance).clearName();
                return this;
            }

            public Builder clearUserId() {
                copyOnWrite();
                ((LotteryGiftRedPacketSender) this.instance).clearUserId();
                return this;
            }

            @Override // com.p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage.LotteryGiftRedPacketSenderOrBuilder
            public String getAvatarUrl() {
                return ((LotteryGiftRedPacketSender) this.instance).getAvatarUrl();
            }

            @Override // com.p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage.LotteryGiftRedPacketSenderOrBuilder
            public ByteString getAvatarUrlBytes() {
                return ((LotteryGiftRedPacketSender) this.instance).getAvatarUrlBytes();
            }

            @Override // com.p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage.LotteryGiftRedPacketSenderOrBuilder
            public String getName() {
                return ((LotteryGiftRedPacketSender) this.instance).getName();
            }

            @Override // com.p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage.LotteryGiftRedPacketSenderOrBuilder
            public ByteString getNameBytes() {
                return ((LotteryGiftRedPacketSender) this.instance).getNameBytes();
            }

            @Override // com.p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage.LotteryGiftRedPacketSenderOrBuilder
            public String getUserId() {
                return ((LotteryGiftRedPacketSender) this.instance).getUserId();
            }

            @Override // com.p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage.LotteryGiftRedPacketSenderOrBuilder
            public ByteString getUserIdBytes() {
                return ((LotteryGiftRedPacketSender) this.instance).getUserIdBytes();
            }

            public Builder setAvatarUrl(String str) {
                copyOnWrite();
                ((LotteryGiftRedPacketSender) this.instance).setAvatarUrl(str);
                return this;
            }

            public Builder setAvatarUrlBytes(ByteString byteString) {
                copyOnWrite();
                ((LotteryGiftRedPacketSender) this.instance).setAvatarUrlBytes(byteString);
                return this;
            }

            public Builder setName(String str) {
                copyOnWrite();
                ((LotteryGiftRedPacketSender) this.instance).setName(str);
                return this;
            }

            public Builder setNameBytes(ByteString byteString) {
                copyOnWrite();
                ((LotteryGiftRedPacketSender) this.instance).setNameBytes(byteString);
                return this;
            }

            public Builder setUserId(String str) {
                copyOnWrite();
                ((LotteryGiftRedPacketSender) this.instance).setUserId(str);
                return this;
            }

            public Builder setUserIdBytes(ByteString byteString) {
                copyOnWrite();
                ((LotteryGiftRedPacketSender) this.instance).setUserIdBytes(byteString);
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
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(lotteryGiftRedPacketSender);
        }

        public static LotteryGiftRedPacketSender parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (LotteryGiftRedPacketSender) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static LotteryGiftRedPacketSender parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (LotteryGiftRedPacketSender) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static ng60<LotteryGiftRedPacketSender> parser() {
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
            AbstractC3426a.checkByteStringIsUtf8(byteString);
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
            AbstractC3426a.checkByteStringIsUtf8(byteString);
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
            AbstractC3426a.checkByteStringIsUtf8(byteString);
            this.userId_ = byteString.toStringUtf8();
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (C45881.f16673xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new LotteryGiftRedPacketSender();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                    return null;
                case 4:
                    return new Builder();
                case 5:
                    GeneratedMessageLite.InterfaceC3409h interfaceC3409h = (GeneratedMessageLite.InterfaceC3409h) obj;
                    LotteryGiftRedPacketSender lotteryGiftRedPacketSender = (LotteryGiftRedPacketSender) obj2;
                    this.userId_ = interfaceC3409h.mo17052f(!this.userId_.isEmpty(), this.userId_, !lotteryGiftRedPacketSender.userId_.isEmpty(), lotteryGiftRedPacketSender.userId_);
                    this.name_ = interfaceC3409h.mo17052f(!this.name_.isEmpty(), this.name_, !lotteryGiftRedPacketSender.name_.isEmpty(), lotteryGiftRedPacketSender.name_);
                    this.avatarUrl_ = interfaceC3409h.mo17052f(!this.avatarUrl_.isEmpty(), this.avatarUrl_, true ^ lotteryGiftRedPacketSender.avatarUrl_.isEmpty(), lotteryGiftRedPacketSender.avatarUrl_);
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
                                    this.userId_ = c3430e.m17170L();
                                } else if (iM17171M == 18) {
                                    this.name_ = c3430e.m17170L();
                                } else if (iM17171M == 26) {
                                    this.avatarUrl_ = c3430e.m17170L();
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
                        synchronized (LotteryGiftRedPacketSender.class) {
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

        @Override // com.google.protobuf.InterfaceC3442q
        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int iM16956K = !this.userId_.isEmpty() ? CodedOutputStream.m16956K(1, getUserId()) : 0;
            if (!this.name_.isEmpty()) {
                iM16956K += CodedOutputStream.m16956K(2, getName());
            }
            if (!this.avatarUrl_.isEmpty()) {
                iM16956K += CodedOutputStream.m16956K(3, getAvatarUrl());
            }
            this.memoizedSerializedSize = iM16956K;
            return iM16956K;
        }

        @Override // com.p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage.LotteryGiftRedPacketSenderOrBuilder
        public String getUserId() {
            return this.userId_;
        }

        @Override // com.p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage.LotteryGiftRedPacketSenderOrBuilder
        public ByteString getUserIdBytes() {
            return ByteString.copyFromUtf8(this.userId_);
        }

        @Override // com.google.protobuf.InterfaceC3442q
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (!this.userId_.isEmpty()) {
                codedOutputStream.mo16994D0(1, getUserId());
            }
            if (!this.name_.isEmpty()) {
                codedOutputStream.mo16994D0(2, getName());
            }
            if (this.avatarUrl_.isEmpty()) {
                return;
            }
            codedOutputStream.mo16994D0(3, getAvatarUrl());
        }

        public static LotteryGiftRedPacketSender parseDelimitedFrom(InputStream inputStream, C3433h c3433h) throws IOException {
            return (LotteryGiftRedPacketSender) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, c3433h);
        }

        public static LotteryGiftRedPacketSender parseFrom(ByteString byteString, C3433h c3433h) throws InvalidProtocolBufferException {
            return (LotteryGiftRedPacketSender) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, c3433h);
        }

        public static LotteryGiftRedPacketSender parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (LotteryGiftRedPacketSender) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static LotteryGiftRedPacketSender parseFrom(byte[] bArr, C3433h c3433h) throws InvalidProtocolBufferException {
            return (LotteryGiftRedPacketSender) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, c3433h);
        }

        public static LotteryGiftRedPacketSender parseFrom(InputStream inputStream) throws IOException {
            return (LotteryGiftRedPacketSender) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static LotteryGiftRedPacketSender parseFrom(InputStream inputStream, C3433h c3433h) throws IOException {
            return (LotteryGiftRedPacketSender) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, c3433h);
        }

        public static LotteryGiftRedPacketSender parseFrom(C3430e c3430e) throws IOException {
            return (LotteryGiftRedPacketSender) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, c3430e);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static LotteryGiftRedPacketSender parseFrom(C3430e c3430e, C3433h c3433h) throws IOException {
            return (LotteryGiftRedPacketSender) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, c3430e, c3433h);
        }
    }

    public static final class MysteryBoxRecord extends GeneratedMessageLite<MysteryBoxRecord, Builder> implements MysteryBoxRecordOrBuilder {
        private static final MysteryBoxRecord DEFAULT_INSTANCE;
        public static final int ICONURL_FIELD_NUMBER = 2;
        public static final int NUM_FIELD_NUMBER = 3;
        private static volatile ng60<MysteryBoxRecord> PARSER = null;
        public static final int REWARDS_FIELD_NUMBER = 4;
        public static final int TEMPLATE_FIELD_NUMBER = 1;
        private int bitField0_;
        private long num_;
        private Template.TemplateData template_;
        private String iconUrl_ = "";
        private C3437l.h<MysteryBoxReward> rewards_ = GeneratedMessageLite.emptyProtobufList();

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
            AbstractC3426a.addAll(iterable, this.rewards_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addRewards(MysteryBoxReward.Builder builder) {
            ensureRewardsIsMutable();
            this.rewards_.add(builder.build());
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
            if (this.rewards_.mo17140q()) {
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
                this.template_ = Template.TemplateData.newBuilder(this.template_).mergeFrom(templateData).buildPartial();
            }
        }

        public static Builder newBuilder(MysteryBoxRecord mysteryBoxRecord) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(mysteryBoxRecord);
        }

        public static MysteryBoxRecord parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (MysteryBoxRecord) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static MysteryBoxRecord parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (MysteryBoxRecord) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static ng60<MysteryBoxRecord> parser() {
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
            AbstractC3426a.checkByteStringIsUtf8(byteString);
            this.iconUrl_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setNum(long j) {
            this.num_ = j;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setRewards(int i, MysteryBoxReward.Builder builder) {
            ensureRewardsIsMutable();
            this.rewards_.set(i, builder.build());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTemplate(Template.TemplateData.Builder builder) {
            this.template_ = builder.build();
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            boolean z = false;
            switch (C45881.f16673xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new MysteryBoxRecord();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                    this.rewards_.mo17139n();
                    return null;
                case 4:
                    return new Builder();
                case 5:
                    GeneratedMessageLite.InterfaceC3409h interfaceC3409h = (GeneratedMessageLite.InterfaceC3409h) obj;
                    MysteryBoxRecord mysteryBoxRecord = (MysteryBoxRecord) obj2;
                    this.template_ = (Template.TemplateData) interfaceC3409h.mo17061o(this.template_, mysteryBoxRecord.template_);
                    this.iconUrl_ = interfaceC3409h.mo17052f(!this.iconUrl_.isEmpty(), this.iconUrl_, !mysteryBoxRecord.iconUrl_.isEmpty(), mysteryBoxRecord.iconUrl_);
                    long j = this.num_;
                    boolean z2 = j != 0;
                    long j2 = mysteryBoxRecord.num_;
                    this.num_ = interfaceC3409h.mo17055i(z2, j, j2 != 0, j2);
                    this.rewards_ = interfaceC3409h.mo17053g(this.rewards_, mysteryBoxRecord.rewards_);
                    if (interfaceC3409h == GeneratedMessageLite.C3408g.INSTANCE) {
                        this.bitField0_ |= mysteryBoxRecord.bitField0_;
                    }
                    return this;
                case 6:
                    C3430e c3430e = (C3430e) obj;
                    C3433h c3433h = (C3433h) obj2;
                    while (!z) {
                        try {
                            int iM17171M = c3430e.m17171M();
                            if (iM17171M != 0) {
                                if (iM17171M == 10) {
                                    Template.TemplateData templateData = this.template_;
                                    Template.TemplateData.Builder builder = templateData != null ? templateData.toBuilder() : null;
                                    Template.TemplateData templateData2 = (Template.TemplateData) c3430e.m17198w(Template.TemplateData.parser(), c3433h);
                                    this.template_ = templateData2;
                                    if (builder != null) {
                                        builder.mergeFrom(templateData2);
                                        this.template_ = builder.buildPartial();
                                    }
                                } else if (iM17171M == 18) {
                                    this.iconUrl_ = c3430e.m17170L();
                                } else if (iM17171M == 24) {
                                    this.num_ = c3430e.m17197v();
                                } else if (iM17171M == 34) {
                                    if (!this.rewards_.mo17140q()) {
                                        this.rewards_ = GeneratedMessageLite.mutableCopy(this.rewards_);
                                    }
                                    this.rewards_.add((MysteryBoxReward) c3430e.m17198w(MysteryBoxReward.parser(), c3433h));
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
                        synchronized (MysteryBoxRecord.class) {
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
            return this.rewards_.get(i);
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
            return this.rewards_.get(i);
        }

        public List<? extends MysteryBoxRewardOrBuilder> getRewardsOrBuilderList() {
            return this.rewards_;
        }

        @Override // com.google.protobuf.InterfaceC3442q
        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int iM16948C = this.template_ != null ? CodedOutputStream.m16948C(1, getTemplate()) : 0;
            if (!this.iconUrl_.isEmpty()) {
                iM16948C += CodedOutputStream.m16956K(2, getIconUrl());
            }
            long j = this.num_;
            if (j != 0) {
                iM16948C += CodedOutputStream.m16986v(3, j);
            }
            for (int i2 = 0; i2 < this.rewards_.size(); i2++) {
                iM16948C += CodedOutputStream.m16948C(4, this.rewards_.get(i2));
            }
            this.memoizedSerializedSize = iM16948C;
            return iM16948C;
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

        @Override // com.google.protobuf.InterfaceC3442q
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (this.template_ != null) {
                codedOutputStream.mo17029w0(1, getTemplate());
            }
            if (!this.iconUrl_.isEmpty()) {
                codedOutputStream.mo16994D0(2, getIconUrl());
            }
            long j = this.num_;
            if (j != 0) {
                codedOutputStream.m17027u0(3, j);
            }
            for (int i = 0; i < this.rewards_.size(); i++) {
                codedOutputStream.mo17029w0(4, this.rewards_.get(i));
            }
        }

        public static MysteryBoxRecord parseDelimitedFrom(InputStream inputStream, C3433h c3433h) throws IOException {
            return (MysteryBoxRecord) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, c3433h);
        }

        public static MysteryBoxRecord parseFrom(ByteString byteString, C3433h c3433h) throws InvalidProtocolBufferException {
            return (MysteryBoxRecord) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, c3433h);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTemplate(Template.TemplateData templateData) {
            templateData.getClass();
            this.template_ = templateData;
        }

        public static final class Builder extends GeneratedMessageLite.AbstractC3403b<MysteryBoxRecord, Builder> implements MysteryBoxRecordOrBuilder {
            private Builder() {
                super(MysteryBoxRecord.DEFAULT_INSTANCE);
            }

            public Builder addAllRewards(Iterable<? extends MysteryBoxReward> iterable) {
                copyOnWrite();
                ((MysteryBoxRecord) this.instance).addAllRewards(iterable);
                return this;
            }

            public Builder addRewards(MysteryBoxReward mysteryBoxReward) {
                copyOnWrite();
                ((MysteryBoxRecord) this.instance).addRewards(mysteryBoxReward);
                return this;
            }

            public Builder clearIconUrl() {
                copyOnWrite();
                ((MysteryBoxRecord) this.instance).clearIconUrl();
                return this;
            }

            public Builder clearNum() {
                copyOnWrite();
                ((MysteryBoxRecord) this.instance).clearNum();
                return this;
            }

            public Builder clearRewards() {
                copyOnWrite();
                ((MysteryBoxRecord) this.instance).clearRewards();
                return this;
            }

            public Builder clearTemplate() {
                copyOnWrite();
                ((MysteryBoxRecord) this.instance).clearTemplate();
                return this;
            }

            @Override // com.p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage.MysteryBoxRecordOrBuilder
            public String getIconUrl() {
                return ((MysteryBoxRecord) this.instance).getIconUrl();
            }

            @Override // com.p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage.MysteryBoxRecordOrBuilder
            public ByteString getIconUrlBytes() {
                return ((MysteryBoxRecord) this.instance).getIconUrlBytes();
            }

            @Override // com.p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage.MysteryBoxRecordOrBuilder
            public long getNum() {
                return ((MysteryBoxRecord) this.instance).getNum();
            }

            @Override // com.p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage.MysteryBoxRecordOrBuilder
            public MysteryBoxReward getRewards(int i) {
                return ((MysteryBoxRecord) this.instance).getRewards(i);
            }

            @Override // com.p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage.MysteryBoxRecordOrBuilder
            public int getRewardsCount() {
                return ((MysteryBoxRecord) this.instance).getRewardsCount();
            }

            @Override // com.p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage.MysteryBoxRecordOrBuilder
            public List<MysteryBoxReward> getRewardsList() {
                return Collections.unmodifiableList(((MysteryBoxRecord) this.instance).getRewardsList());
            }

            @Override // com.p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage.MysteryBoxRecordOrBuilder
            public Template.TemplateData getTemplate() {
                return ((MysteryBoxRecord) this.instance).getTemplate();
            }

            @Override // com.p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage.MysteryBoxRecordOrBuilder
            public boolean hasTemplate() {
                return ((MysteryBoxRecord) this.instance).hasTemplate();
            }

            public Builder mergeTemplate(Template.TemplateData templateData) {
                copyOnWrite();
                ((MysteryBoxRecord) this.instance).mergeTemplate(templateData);
                return this;
            }

            public Builder removeRewards(int i) {
                copyOnWrite();
                ((MysteryBoxRecord) this.instance).removeRewards(i);
                return this;
            }

            public Builder setIconUrl(String str) {
                copyOnWrite();
                ((MysteryBoxRecord) this.instance).setIconUrl(str);
                return this;
            }

            public Builder setIconUrlBytes(ByteString byteString) {
                copyOnWrite();
                ((MysteryBoxRecord) this.instance).setIconUrlBytes(byteString);
                return this;
            }

            public Builder setNum(long j) {
                copyOnWrite();
                ((MysteryBoxRecord) this.instance).setNum(j);
                return this;
            }

            public Builder setRewards(int i, MysteryBoxReward mysteryBoxReward) {
                copyOnWrite();
                ((MysteryBoxRecord) this.instance).setRewards(i, mysteryBoxReward);
                return this;
            }

            public Builder setTemplate(Template.TemplateData templateData) {
                copyOnWrite();
                ((MysteryBoxRecord) this.instance).setTemplate(templateData);
                return this;
            }

            public Builder addRewards(int i, MysteryBoxReward mysteryBoxReward) {
                copyOnWrite();
                ((MysteryBoxRecord) this.instance).addRewards(i, mysteryBoxReward);
                return this;
            }

            public Builder setRewards(int i, MysteryBoxReward.Builder builder) {
                copyOnWrite();
                ((MysteryBoxRecord) this.instance).setRewards(i, builder);
                return this;
            }

            public Builder setTemplate(Template.TemplateData.Builder builder) {
                copyOnWrite();
                ((MysteryBoxRecord) this.instance).setTemplate(builder);
                return this;
            }

            public Builder addRewards(MysteryBoxReward.Builder builder) {
                copyOnWrite();
                ((MysteryBoxRecord) this.instance).addRewards(builder);
                return this;
            }

            public Builder addRewards(int i, MysteryBoxReward.Builder builder) {
                copyOnWrite();
                ((MysteryBoxRecord) this.instance).addRewards(i, builder);
                return this;
            }
        }

        public static MysteryBoxRecord parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (MysteryBoxRecord) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static MysteryBoxRecord parseFrom(byte[] bArr, C3433h c3433h) throws InvalidProtocolBufferException {
            return (MysteryBoxRecord) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, c3433h);
        }

        public static MysteryBoxRecord parseFrom(InputStream inputStream) throws IOException {
            return (MysteryBoxRecord) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static MysteryBoxRecord parseFrom(InputStream inputStream, C3433h c3433h) throws IOException {
            return (MysteryBoxRecord) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, c3433h);
        }

        public static MysteryBoxRecord parseFrom(C3430e c3430e) throws IOException {
            return (MysteryBoxRecord) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, c3430e);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addRewards(int i, MysteryBoxReward mysteryBoxReward) {
            mysteryBoxReward.getClass();
            ensureRewardsIsMutable();
            this.rewards_.add(i, mysteryBoxReward);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static MysteryBoxRecord parseFrom(C3430e c3430e, C3433h c3433h) throws IOException {
            return (MysteryBoxRecord) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, c3430e, c3433h);
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
            this.rewards_.add(i, builder.build());
        }
    }

    public static final class MysteryBoxReward extends GeneratedMessageLite<MysteryBoxReward, Builder> implements MysteryBoxRewardOrBuilder {
        private static final MysteryBoxReward DEFAULT_INSTANCE;
        public static final int NAME_FIELD_NUMBER = 1;
        public static final int NUM_FIELD_NUMBER = 3;
        private static volatile ng60<MysteryBoxReward> PARSER = null;
        public static final int URL_FIELD_NUMBER = 2;
        private long num_;
        private String name_ = "";
        private String url_ = "";

        public static final class Builder extends GeneratedMessageLite.AbstractC3403b<MysteryBoxReward, Builder> implements MysteryBoxRewardOrBuilder {
            private Builder() {
                super(MysteryBoxReward.DEFAULT_INSTANCE);
            }

            public Builder clearName() {
                copyOnWrite();
                ((MysteryBoxReward) this.instance).clearName();
                return this;
            }

            public Builder clearNum() {
                copyOnWrite();
                ((MysteryBoxReward) this.instance).clearNum();
                return this;
            }

            public Builder clearUrl() {
                copyOnWrite();
                ((MysteryBoxReward) this.instance).clearUrl();
                return this;
            }

            @Override // com.p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage.MysteryBoxRewardOrBuilder
            public String getName() {
                return ((MysteryBoxReward) this.instance).getName();
            }

            @Override // com.p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage.MysteryBoxRewardOrBuilder
            public ByteString getNameBytes() {
                return ((MysteryBoxReward) this.instance).getNameBytes();
            }

            @Override // com.p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage.MysteryBoxRewardOrBuilder
            public long getNum() {
                return ((MysteryBoxReward) this.instance).getNum();
            }

            @Override // com.p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage.MysteryBoxRewardOrBuilder
            public String getUrl() {
                return ((MysteryBoxReward) this.instance).getUrl();
            }

            @Override // com.p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage.MysteryBoxRewardOrBuilder
            public ByteString getUrlBytes() {
                return ((MysteryBoxReward) this.instance).getUrlBytes();
            }

            public Builder setName(String str) {
                copyOnWrite();
                ((MysteryBoxReward) this.instance).setName(str);
                return this;
            }

            public Builder setNameBytes(ByteString byteString) {
                copyOnWrite();
                ((MysteryBoxReward) this.instance).setNameBytes(byteString);
                return this;
            }

            public Builder setNum(long j) {
                copyOnWrite();
                ((MysteryBoxReward) this.instance).setNum(j);
                return this;
            }

            public Builder setUrl(String str) {
                copyOnWrite();
                ((MysteryBoxReward) this.instance).setUrl(str);
                return this;
            }

            public Builder setUrlBytes(ByteString byteString) {
                copyOnWrite();
                ((MysteryBoxReward) this.instance).setUrlBytes(byteString);
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
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(mysteryBoxReward);
        }

        public static MysteryBoxReward parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (MysteryBoxReward) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static MysteryBoxReward parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (MysteryBoxReward) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static ng60<MysteryBoxReward> parser() {
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
            AbstractC3426a.checkByteStringIsUtf8(byteString);
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
            AbstractC3426a.checkByteStringIsUtf8(byteString);
            this.url_ = byteString.toStringUtf8();
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            boolean z = false;
            switch (C45881.f16673xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new MysteryBoxReward();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                    return null;
                case 4:
                    return new Builder();
                case 5:
                    GeneratedMessageLite.InterfaceC3409h interfaceC3409h = (GeneratedMessageLite.InterfaceC3409h) obj;
                    MysteryBoxReward mysteryBoxReward = (MysteryBoxReward) obj2;
                    this.name_ = interfaceC3409h.mo17052f(!this.name_.isEmpty(), this.name_, !mysteryBoxReward.name_.isEmpty(), mysteryBoxReward.name_);
                    this.url_ = interfaceC3409h.mo17052f(!this.url_.isEmpty(), this.url_, !mysteryBoxReward.url_.isEmpty(), mysteryBoxReward.url_);
                    long j = this.num_;
                    boolean z2 = j != 0;
                    long j2 = mysteryBoxReward.num_;
                    this.num_ = interfaceC3409h.mo17055i(z2, j, j2 != 0, j2);
                    GeneratedMessageLite.C3408g c3408g = GeneratedMessageLite.C3408g.INSTANCE;
                    return this;
                case 6:
                    C3430e c3430e = (C3430e) obj;
                    while (!z) {
                        try {
                            int iM17171M = c3430e.m17171M();
                            if (iM17171M != 0) {
                                if (iM17171M == 10) {
                                    this.name_ = c3430e.m17170L();
                                } else if (iM17171M == 18) {
                                    this.url_ = c3430e.m17170L();
                                } else if (iM17171M == 24) {
                                    this.num_ = c3430e.m17197v();
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
                        synchronized (MysteryBoxReward.class) {
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

        @Override // com.google.protobuf.InterfaceC3442q
        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int iM16956K = !this.name_.isEmpty() ? CodedOutputStream.m16956K(1, getName()) : 0;
            if (!this.url_.isEmpty()) {
                iM16956K += CodedOutputStream.m16956K(2, getUrl());
            }
            long j = this.num_;
            if (j != 0) {
                iM16956K += CodedOutputStream.m16986v(3, j);
            }
            this.memoizedSerializedSize = iM16956K;
            return iM16956K;
        }

        @Override // com.p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage.MysteryBoxRewardOrBuilder
        public String getUrl() {
            return this.url_;
        }

        @Override // com.p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage.MysteryBoxRewardOrBuilder
        public ByteString getUrlBytes() {
            return ByteString.copyFromUtf8(this.url_);
        }

        @Override // com.google.protobuf.InterfaceC3442q
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (!this.name_.isEmpty()) {
                codedOutputStream.mo16994D0(1, getName());
            }
            if (!this.url_.isEmpty()) {
                codedOutputStream.mo16994D0(2, getUrl());
            }
            long j = this.num_;
            if (j != 0) {
                codedOutputStream.m17027u0(3, j);
            }
        }

        public static MysteryBoxReward parseDelimitedFrom(InputStream inputStream, C3433h c3433h) throws IOException {
            return (MysteryBoxReward) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, c3433h);
        }

        public static MysteryBoxReward parseFrom(ByteString byteString, C3433h c3433h) throws InvalidProtocolBufferException {
            return (MysteryBoxReward) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, c3433h);
        }

        public static MysteryBoxReward parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (MysteryBoxReward) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static MysteryBoxReward parseFrom(byte[] bArr, C3433h c3433h) throws InvalidProtocolBufferException {
            return (MysteryBoxReward) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, c3433h);
        }

        public static MysteryBoxReward parseFrom(InputStream inputStream) throws IOException {
            return (MysteryBoxReward) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static MysteryBoxReward parseFrom(InputStream inputStream, C3433h c3433h) throws IOException {
            return (MysteryBoxReward) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, c3433h);
        }

        public static MysteryBoxReward parseFrom(C3430e c3430e) throws IOException {
            return (MysteryBoxReward) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, c3430e);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static MysteryBoxReward parseFrom(C3430e c3430e, C3433h c3433h) throws IOException {
            return (MysteryBoxReward) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, c3430e, c3433h);
        }
    }

    public static final class OperationAnimation extends GeneratedMessageLite<OperationAnimation, Builder> implements OperationAnimationOrBuilder {
        private static final OperationAnimation DEFAULT_INSTANCE;
        public static final int ENTER_FIELD_NUMBER = 1;
        private static volatile ng60<OperationAnimation> PARSER;
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
                this.enter_ = OperationAnimationEnter.newBuilder(this.enter_).mergeFrom(operationAnimationEnter).buildPartial();
            }
        }

        public static Builder newBuilder(OperationAnimation operationAnimation) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(operationAnimation);
        }

        public static OperationAnimation parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (OperationAnimation) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static OperationAnimation parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (OperationAnimation) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static ng60<OperationAnimation> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setEnter(OperationAnimationEnter.Builder builder) {
            this.enter_ = builder.build();
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (C45881.f16673xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new OperationAnimation();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                    return null;
                case 4:
                    return new Builder();
                case 5:
                    this.enter_ = (OperationAnimationEnter) ((GeneratedMessageLite.InterfaceC3409h) obj).mo17061o(this.enter_, ((OperationAnimation) obj2).enter_);
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
                                    OperationAnimationEnter operationAnimationEnter = this.enter_;
                                    OperationAnimationEnter.Builder builder = operationAnimationEnter != null ? operationAnimationEnter.toBuilder() : null;
                                    OperationAnimationEnter operationAnimationEnter2 = (OperationAnimationEnter) c3430e.m17198w(OperationAnimationEnter.parser(), c3433h);
                                    this.enter_ = operationAnimationEnter2;
                                    if (builder != null) {
                                        builder.mergeFrom(operationAnimationEnter2);
                                        this.enter_ = builder.buildPartial();
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
                        synchronized (OperationAnimation.class) {
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

        @Override // com.p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage.OperationAnimationOrBuilder
        public OperationAnimationEnter getEnter() {
            OperationAnimationEnter operationAnimationEnter = this.enter_;
            return operationAnimationEnter == null ? OperationAnimationEnter.getDefaultInstance() : operationAnimationEnter;
        }

        @Override // com.google.protobuf.InterfaceC3442q
        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int iM16948C = this.enter_ != null ? CodedOutputStream.m16948C(1, getEnter()) : 0;
            this.memoizedSerializedSize = iM16948C;
            return iM16948C;
        }

        @Override // com.p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage.OperationAnimationOrBuilder
        public boolean hasEnter() {
            return this.enter_ != null;
        }

        @Override // com.google.protobuf.InterfaceC3442q
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (this.enter_ != null) {
                codedOutputStream.mo17029w0(1, getEnter());
            }
        }

        public static OperationAnimation parseDelimitedFrom(InputStream inputStream, C3433h c3433h) throws IOException {
            return (OperationAnimation) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, c3433h);
        }

        public static OperationAnimation parseFrom(ByteString byteString, C3433h c3433h) throws InvalidProtocolBufferException {
            return (OperationAnimation) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, c3433h);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setEnter(OperationAnimationEnter operationAnimationEnter) {
            operationAnimationEnter.getClass();
            this.enter_ = operationAnimationEnter;
        }

        public static final class Builder extends GeneratedMessageLite.AbstractC3403b<OperationAnimation, Builder> implements OperationAnimationOrBuilder {
            private Builder() {
                super(OperationAnimation.DEFAULT_INSTANCE);
            }

            public Builder clearEnter() {
                copyOnWrite();
                ((OperationAnimation) this.instance).clearEnter();
                return this;
            }

            @Override // com.p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage.OperationAnimationOrBuilder
            public OperationAnimationEnter getEnter() {
                return ((OperationAnimation) this.instance).getEnter();
            }

            @Override // com.p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage.OperationAnimationOrBuilder
            public boolean hasEnter() {
                return ((OperationAnimation) this.instance).hasEnter();
            }

            public Builder mergeEnter(OperationAnimationEnter operationAnimationEnter) {
                copyOnWrite();
                ((OperationAnimation) this.instance).mergeEnter(operationAnimationEnter);
                return this;
            }

            public Builder setEnter(OperationAnimationEnter operationAnimationEnter) {
                copyOnWrite();
                ((OperationAnimation) this.instance).setEnter(operationAnimationEnter);
                return this;
            }

            public Builder setEnter(OperationAnimationEnter.Builder builder) {
                copyOnWrite();
                ((OperationAnimation) this.instance).setEnter(builder);
                return this;
            }
        }

        public static OperationAnimation parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (OperationAnimation) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static OperationAnimation parseFrom(byte[] bArr, C3433h c3433h) throws InvalidProtocolBufferException {
            return (OperationAnimation) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, c3433h);
        }

        public static OperationAnimation parseFrom(InputStream inputStream) throws IOException {
            return (OperationAnimation) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static OperationAnimation parseFrom(InputStream inputStream, C3433h c3433h) throws IOException {
            return (OperationAnimation) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, c3433h);
        }

        public static OperationAnimation parseFrom(C3430e c3430e) throws IOException {
            return (OperationAnimation) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, c3430e);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static OperationAnimation parseFrom(C3430e c3430e, C3433h c3433h) throws IOException {
            return (OperationAnimation) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, c3430e, c3433h);
        }
    }

    public static final class OperationAnimationEnter extends GeneratedMessageLite<OperationAnimationEnter, Builder> implements OperationAnimationEnterOrBuilder {
        public static final int ANIMATIONTYPE_FIELD_NUMBER = 1;
        private static final OperationAnimationEnter DEFAULT_INSTANCE;
        public static final int IMAGEURL_FIELD_NUMBER = 3;
        public static final int ISTOP_FIELD_NUMBER = 2;
        private static volatile ng60<OperationAnimationEnter> PARSER;
        private String animationType_ = "";
        private String imageUrl_ = "";
        private boolean isTop_;

        public static final class Builder extends GeneratedMessageLite.AbstractC3403b<OperationAnimationEnter, Builder> implements OperationAnimationEnterOrBuilder {
            private Builder() {
                super(OperationAnimationEnter.DEFAULT_INSTANCE);
            }

            public Builder clearAnimationType() {
                copyOnWrite();
                ((OperationAnimationEnter) this.instance).clearAnimationType();
                return this;
            }

            public Builder clearImageUrl() {
                copyOnWrite();
                ((OperationAnimationEnter) this.instance).clearImageUrl();
                return this;
            }

            public Builder clearIsTop() {
                copyOnWrite();
                ((OperationAnimationEnter) this.instance).clearIsTop();
                return this;
            }

            @Override // com.p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage.OperationAnimationEnterOrBuilder
            public String getAnimationType() {
                return ((OperationAnimationEnter) this.instance).getAnimationType();
            }

            @Override // com.p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage.OperationAnimationEnterOrBuilder
            public ByteString getAnimationTypeBytes() {
                return ((OperationAnimationEnter) this.instance).getAnimationTypeBytes();
            }

            @Override // com.p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage.OperationAnimationEnterOrBuilder
            public String getImageUrl() {
                return ((OperationAnimationEnter) this.instance).getImageUrl();
            }

            @Override // com.p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage.OperationAnimationEnterOrBuilder
            public ByteString getImageUrlBytes() {
                return ((OperationAnimationEnter) this.instance).getImageUrlBytes();
            }

            @Override // com.p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage.OperationAnimationEnterOrBuilder
            public boolean getIsTop() {
                return ((OperationAnimationEnter) this.instance).getIsTop();
            }

            public Builder setAnimationType(String str) {
                copyOnWrite();
                ((OperationAnimationEnter) this.instance).setAnimationType(str);
                return this;
            }

            public Builder setAnimationTypeBytes(ByteString byteString) {
                copyOnWrite();
                ((OperationAnimationEnter) this.instance).setAnimationTypeBytes(byteString);
                return this;
            }

            public Builder setImageUrl(String str) {
                copyOnWrite();
                ((OperationAnimationEnter) this.instance).setImageUrl(str);
                return this;
            }

            public Builder setImageUrlBytes(ByteString byteString) {
                copyOnWrite();
                ((OperationAnimationEnter) this.instance).setImageUrlBytes(byteString);
                return this;
            }

            public Builder setIsTop(boolean z) {
                copyOnWrite();
                ((OperationAnimationEnter) this.instance).setIsTop(z);
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
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(operationAnimationEnter);
        }

        public static OperationAnimationEnter parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (OperationAnimationEnter) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static OperationAnimationEnter parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (OperationAnimationEnter) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static ng60<OperationAnimationEnter> parser() {
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
            AbstractC3426a.checkByteStringIsUtf8(byteString);
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
            AbstractC3426a.checkByteStringIsUtf8(byteString);
            this.imageUrl_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setIsTop(boolean z) {
            this.isTop_ = z;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (C45881.f16673xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new OperationAnimationEnter();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                    return null;
                case 4:
                    return new Builder();
                case 5:
                    GeneratedMessageLite.InterfaceC3409h interfaceC3409h = (GeneratedMessageLite.InterfaceC3409h) obj;
                    OperationAnimationEnter operationAnimationEnter = (OperationAnimationEnter) obj2;
                    this.animationType_ = interfaceC3409h.mo17052f(!this.animationType_.isEmpty(), this.animationType_, !operationAnimationEnter.animationType_.isEmpty(), operationAnimationEnter.animationType_);
                    boolean z = this.isTop_;
                    boolean z2 = operationAnimationEnter.isTop_;
                    this.isTop_ = interfaceC3409h.mo17050d(z, z, z2, z2);
                    this.imageUrl_ = interfaceC3409h.mo17052f(!this.imageUrl_.isEmpty(), this.imageUrl_, true ^ operationAnimationEnter.imageUrl_.isEmpty(), operationAnimationEnter.imageUrl_);
                    GeneratedMessageLite.C3408g c3408g = GeneratedMessageLite.C3408g.INSTANCE;
                    return this;
                case 6:
                    C3430e c3430e = (C3430e) obj;
                    boolean z3 = false;
                    while (!z3) {
                        try {
                            int iM17171M = c3430e.m17171M();
                            if (iM17171M != 0) {
                                if (iM17171M == 10) {
                                    this.animationType_ = c3430e.m17170L();
                                } else if (iM17171M == 16) {
                                    this.isTop_ = c3430e.m17188m();
                                } else if (iM17171M == 26) {
                                    this.imageUrl_ = c3430e.m17170L();
                                } else if (!c3430e.m17176R(iM17171M)) {
                                }
                            }
                            z3 = true;
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
                        synchronized (OperationAnimationEnter.class) {
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

        @Override // com.google.protobuf.InterfaceC3442q
        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int iM16956K = !this.animationType_.isEmpty() ? CodedOutputStream.m16956K(1, getAnimationType()) : 0;
            boolean z = this.isTop_;
            if (z) {
                iM16956K += CodedOutputStream.m16970f(2, z);
            }
            if (!this.imageUrl_.isEmpty()) {
                iM16956K += CodedOutputStream.m16956K(3, getImageUrl());
            }
            this.memoizedSerializedSize = iM16956K;
            return iM16956K;
        }

        @Override // com.google.protobuf.InterfaceC3442q
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (!this.animationType_.isEmpty()) {
                codedOutputStream.mo16994D0(1, getAnimationType());
            }
            boolean z = this.isTop_;
            if (z) {
                codedOutputStream.mo17005a0(2, z);
            }
            if (this.imageUrl_.isEmpty()) {
                return;
            }
            codedOutputStream.mo16994D0(3, getImageUrl());
        }

        public static OperationAnimationEnter parseDelimitedFrom(InputStream inputStream, C3433h c3433h) throws IOException {
            return (OperationAnimationEnter) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, c3433h);
        }

        public static OperationAnimationEnter parseFrom(ByteString byteString, C3433h c3433h) throws InvalidProtocolBufferException {
            return (OperationAnimationEnter) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, c3433h);
        }

        public static OperationAnimationEnter parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (OperationAnimationEnter) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static OperationAnimationEnter parseFrom(byte[] bArr, C3433h c3433h) throws InvalidProtocolBufferException {
            return (OperationAnimationEnter) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, c3433h);
        }

        public static OperationAnimationEnter parseFrom(InputStream inputStream) throws IOException {
            return (OperationAnimationEnter) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static OperationAnimationEnter parseFrom(InputStream inputStream, C3433h c3433h) throws IOException {
            return (OperationAnimationEnter) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, c3433h);
        }

        public static OperationAnimationEnter parseFrom(C3430e c3430e) throws IOException {
            return (OperationAnimationEnter) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, c3430e);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static OperationAnimationEnter parseFrom(C3430e c3430e, C3433h c3433h) throws IOException {
            return (OperationAnimationEnter) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, c3430e, c3433h);
        }
    }

    public static final class OperationHierarchy extends GeneratedMessageLite<OperationHierarchy, Builder> implements OperationHierarchyOrBuilder {
        private static final OperationHierarchy DEFAULT_INSTANCE;
        private static volatile ng60<OperationHierarchy> PARSER = null;
        public static final int USERHIERARCHY_FIELD_NUMBER = 1;
        private long userHierarchy_;

        public static final class Builder extends GeneratedMessageLite.AbstractC3403b<OperationHierarchy, Builder> implements OperationHierarchyOrBuilder {
            private Builder() {
                super(OperationHierarchy.DEFAULT_INSTANCE);
            }

            public Builder clearUserHierarchy() {
                copyOnWrite();
                ((OperationHierarchy) this.instance).clearUserHierarchy();
                return this;
            }

            @Override // com.p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage.OperationHierarchyOrBuilder
            public long getUserHierarchy() {
                return ((OperationHierarchy) this.instance).getUserHierarchy();
            }

            public Builder setUserHierarchy(long j) {
                copyOnWrite();
                ((OperationHierarchy) this.instance).setUserHierarchy(j);
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
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(operationHierarchy);
        }

        public static OperationHierarchy parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (OperationHierarchy) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static OperationHierarchy parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (OperationHierarchy) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static ng60<OperationHierarchy> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setUserHierarchy(long j) {
            this.userHierarchy_ = j;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            boolean z = false;
            switch (C45881.f16673xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new OperationHierarchy();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                    return null;
                case 4:
                    return new Builder();
                case 5:
                    GeneratedMessageLite.InterfaceC3409h interfaceC3409h = (GeneratedMessageLite.InterfaceC3409h) obj;
                    OperationHierarchy operationHierarchy = (OperationHierarchy) obj2;
                    long j = this.userHierarchy_;
                    boolean z2 = j != 0;
                    long j2 = operationHierarchy.userHierarchy_;
                    this.userHierarchy_ = interfaceC3409h.mo17055i(z2, j, j2 != 0, j2);
                    GeneratedMessageLite.C3408g c3408g = GeneratedMessageLite.C3408g.INSTANCE;
                    return this;
                case 6:
                    C3430e c3430e = (C3430e) obj;
                    while (!z) {
                        try {
                            int iM17171M = c3430e.m17171M();
                            if (iM17171M != 0) {
                                if (iM17171M == 8) {
                                    this.userHierarchy_ = c3430e.m17197v();
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
                        synchronized (OperationHierarchy.class) {
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
            long j = this.userHierarchy_;
            int iM16986v = j != 0 ? CodedOutputStream.m16986v(1, j) : 0;
            this.memoizedSerializedSize = iM16986v;
            return iM16986v;
        }

        @Override // com.p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage.OperationHierarchyOrBuilder
        public long getUserHierarchy() {
            return this.userHierarchy_;
        }

        @Override // com.google.protobuf.InterfaceC3442q
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            long j = this.userHierarchy_;
            if (j != 0) {
                codedOutputStream.m17027u0(1, j);
            }
        }

        public static OperationHierarchy parseDelimitedFrom(InputStream inputStream, C3433h c3433h) throws IOException {
            return (OperationHierarchy) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, c3433h);
        }

        public static OperationHierarchy parseFrom(ByteString byteString, C3433h c3433h) throws InvalidProtocolBufferException {
            return (OperationHierarchy) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, c3433h);
        }

        public static OperationHierarchy parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (OperationHierarchy) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static OperationHierarchy parseFrom(byte[] bArr, C3433h c3433h) throws InvalidProtocolBufferException {
            return (OperationHierarchy) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, c3433h);
        }

        public static OperationHierarchy parseFrom(InputStream inputStream) throws IOException {
            return (OperationHierarchy) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static OperationHierarchy parseFrom(InputStream inputStream, C3433h c3433h) throws IOException {
            return (OperationHierarchy) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, c3433h);
        }

        public static OperationHierarchy parseFrom(C3430e c3430e) throws IOException {
            return (OperationHierarchy) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, c3430e);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static OperationHierarchy parseFrom(C3430e c3430e, C3433h c3433h) throws IOException {
            return (OperationHierarchy) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, c3430e, c3433h);
        }
    }

    public static final class OperationSubscription extends GeneratedMessageLite<OperationSubscription, Builder> implements OperationSubscriptionOrBuilder {
        public static final int DATA_FIELD_NUMBER = 3;
        private static final OperationSubscription DEFAULT_INSTANCE;
        private static volatile ng60<OperationSubscription> PARSER = null;
        public static final int SUBSCRIBETYPE_FIELD_NUMBER = 1;
        public static final int UPDATETYPE_FIELD_NUMBER = 2;
        private String subscribeType_ = "";
        private String updateType_ = "";
        private String data_ = "";

        public static final class Builder extends GeneratedMessageLite.AbstractC3403b<OperationSubscription, Builder> implements OperationSubscriptionOrBuilder {
            private Builder() {
                super(OperationSubscription.DEFAULT_INSTANCE);
            }

            public Builder clearData() {
                copyOnWrite();
                ((OperationSubscription) this.instance).clearData();
                return this;
            }

            public Builder clearSubscribeType() {
                copyOnWrite();
                ((OperationSubscription) this.instance).clearSubscribeType();
                return this;
            }

            public Builder clearUpdateType() {
                copyOnWrite();
                ((OperationSubscription) this.instance).clearUpdateType();
                return this;
            }

            @Override // com.p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage.OperationSubscriptionOrBuilder
            public String getData() {
                return ((OperationSubscription) this.instance).getData();
            }

            @Override // com.p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage.OperationSubscriptionOrBuilder
            public ByteString getDataBytes() {
                return ((OperationSubscription) this.instance).getDataBytes();
            }

            @Override // com.p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage.OperationSubscriptionOrBuilder
            public String getSubscribeType() {
                return ((OperationSubscription) this.instance).getSubscribeType();
            }

            @Override // com.p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage.OperationSubscriptionOrBuilder
            public ByteString getSubscribeTypeBytes() {
                return ((OperationSubscription) this.instance).getSubscribeTypeBytes();
            }

            @Override // com.p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage.OperationSubscriptionOrBuilder
            public String getUpdateType() {
                return ((OperationSubscription) this.instance).getUpdateType();
            }

            @Override // com.p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage.OperationSubscriptionOrBuilder
            public ByteString getUpdateTypeBytes() {
                return ((OperationSubscription) this.instance).getUpdateTypeBytes();
            }

            public Builder setData(String str) {
                copyOnWrite();
                ((OperationSubscription) this.instance).setData(str);
                return this;
            }

            public Builder setDataBytes(ByteString byteString) {
                copyOnWrite();
                ((OperationSubscription) this.instance).setDataBytes(byteString);
                return this;
            }

            public Builder setSubscribeType(String str) {
                copyOnWrite();
                ((OperationSubscription) this.instance).setSubscribeType(str);
                return this;
            }

            public Builder setSubscribeTypeBytes(ByteString byteString) {
                copyOnWrite();
                ((OperationSubscription) this.instance).setSubscribeTypeBytes(byteString);
                return this;
            }

            public Builder setUpdateType(String str) {
                copyOnWrite();
                ((OperationSubscription) this.instance).setUpdateType(str);
                return this;
            }

            public Builder setUpdateTypeBytes(ByteString byteString) {
                copyOnWrite();
                ((OperationSubscription) this.instance).setUpdateTypeBytes(byteString);
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
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(operationSubscription);
        }

        public static OperationSubscription parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (OperationSubscription) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static OperationSubscription parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (OperationSubscription) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static ng60<OperationSubscription> parser() {
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
            AbstractC3426a.checkByteStringIsUtf8(byteString);
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
            AbstractC3426a.checkByteStringIsUtf8(byteString);
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
            AbstractC3426a.checkByteStringIsUtf8(byteString);
            this.updateType_ = byteString.toStringUtf8();
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (C45881.f16673xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new OperationSubscription();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                    return null;
                case 4:
                    return new Builder();
                case 5:
                    GeneratedMessageLite.InterfaceC3409h interfaceC3409h = (GeneratedMessageLite.InterfaceC3409h) obj;
                    OperationSubscription operationSubscription = (OperationSubscription) obj2;
                    this.subscribeType_ = interfaceC3409h.mo17052f(!this.subscribeType_.isEmpty(), this.subscribeType_, !operationSubscription.subscribeType_.isEmpty(), operationSubscription.subscribeType_);
                    this.updateType_ = interfaceC3409h.mo17052f(!this.updateType_.isEmpty(), this.updateType_, !operationSubscription.updateType_.isEmpty(), operationSubscription.updateType_);
                    this.data_ = interfaceC3409h.mo17052f(!this.data_.isEmpty(), this.data_, true ^ operationSubscription.data_.isEmpty(), operationSubscription.data_);
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
                                    this.subscribeType_ = c3430e.m17170L();
                                } else if (iM17171M == 18) {
                                    this.updateType_ = c3430e.m17170L();
                                } else if (iM17171M == 26) {
                                    this.data_ = c3430e.m17170L();
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
                        synchronized (OperationSubscription.class) {
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

        @Override // com.p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage.OperationSubscriptionOrBuilder
        public String getData() {
            return this.data_;
        }

        @Override // com.p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage.OperationSubscriptionOrBuilder
        public ByteString getDataBytes() {
            return ByteString.copyFromUtf8(this.data_);
        }

        @Override // com.google.protobuf.InterfaceC3442q
        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int iM16956K = !this.subscribeType_.isEmpty() ? CodedOutputStream.m16956K(1, getSubscribeType()) : 0;
            if (!this.updateType_.isEmpty()) {
                iM16956K += CodedOutputStream.m16956K(2, getUpdateType());
            }
            if (!this.data_.isEmpty()) {
                iM16956K += CodedOutputStream.m16956K(3, getData());
            }
            this.memoizedSerializedSize = iM16956K;
            return iM16956K;
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

        @Override // com.google.protobuf.InterfaceC3442q
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (!this.subscribeType_.isEmpty()) {
                codedOutputStream.mo16994D0(1, getSubscribeType());
            }
            if (!this.updateType_.isEmpty()) {
                codedOutputStream.mo16994D0(2, getUpdateType());
            }
            if (this.data_.isEmpty()) {
                return;
            }
            codedOutputStream.mo16994D0(3, getData());
        }

        public static OperationSubscription parseDelimitedFrom(InputStream inputStream, C3433h c3433h) throws IOException {
            return (OperationSubscription) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, c3433h);
        }

        public static OperationSubscription parseFrom(ByteString byteString, C3433h c3433h) throws InvalidProtocolBufferException {
            return (OperationSubscription) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, c3433h);
        }

        public static OperationSubscription parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (OperationSubscription) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static OperationSubscription parseFrom(byte[] bArr, C3433h c3433h) throws InvalidProtocolBufferException {
            return (OperationSubscription) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, c3433h);
        }

        public static OperationSubscription parseFrom(InputStream inputStream) throws IOException {
            return (OperationSubscription) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static OperationSubscription parseFrom(InputStream inputStream, C3433h c3433h) throws IOException {
            return (OperationSubscription) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, c3433h);
        }

        public static OperationSubscription parseFrom(C3430e c3430e) throws IOException {
            return (OperationSubscription) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, c3430e);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static OperationSubscription parseFrom(C3430e c3430e, C3433h c3433h) throws IOException {
            return (OperationSubscription) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, c3430e, c3433h);
        }
    }

    public static final class PopUp extends GeneratedMessageLite<PopUp, Builder> implements PopUpOrBuilder {
        public static final int CAMPAIGNID_FIELD_NUMBER = 1;
        private static final PopUp DEFAULT_INSTANCE;
        private static volatile ng60<PopUp> PARSER = null;
        public static final int ROOMID_FIELD_NUMBER = 2;
        private String campaignId_ = "";
        private String roomId_ = "";

        public static final class Builder extends GeneratedMessageLite.AbstractC3403b<PopUp, Builder> implements PopUpOrBuilder {
            private Builder() {
                super(PopUp.DEFAULT_INSTANCE);
            }

            public Builder clearCampaignId() {
                copyOnWrite();
                ((PopUp) this.instance).clearCampaignId();
                return this;
            }

            public Builder clearRoomId() {
                copyOnWrite();
                ((PopUp) this.instance).clearRoomId();
                return this;
            }

            @Override // com.p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage.PopUpOrBuilder
            public String getCampaignId() {
                return ((PopUp) this.instance).getCampaignId();
            }

            @Override // com.p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage.PopUpOrBuilder
            public ByteString getCampaignIdBytes() {
                return ((PopUp) this.instance).getCampaignIdBytes();
            }

            @Override // com.p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage.PopUpOrBuilder
            public String getRoomId() {
                return ((PopUp) this.instance).getRoomId();
            }

            @Override // com.p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage.PopUpOrBuilder
            public ByteString getRoomIdBytes() {
                return ((PopUp) this.instance).getRoomIdBytes();
            }

            public Builder setCampaignId(String str) {
                copyOnWrite();
                ((PopUp) this.instance).setCampaignId(str);
                return this;
            }

            public Builder setCampaignIdBytes(ByteString byteString) {
                copyOnWrite();
                ((PopUp) this.instance).setCampaignIdBytes(byteString);
                return this;
            }

            public Builder setRoomId(String str) {
                copyOnWrite();
                ((PopUp) this.instance).setRoomId(str);
                return this;
            }

            public Builder setRoomIdBytes(ByteString byteString) {
                copyOnWrite();
                ((PopUp) this.instance).setRoomIdBytes(byteString);
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
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(popUp);
        }

        public static PopUp parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (PopUp) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static PopUp parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (PopUp) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static ng60<PopUp> parser() {
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
            AbstractC3426a.checkByteStringIsUtf8(byteString);
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
            AbstractC3426a.checkByteStringIsUtf8(byteString);
            this.roomId_ = byteString.toStringUtf8();
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (C45881.f16673xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new PopUp();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                    return null;
                case 4:
                    return new Builder();
                case 5:
                    GeneratedMessageLite.InterfaceC3409h interfaceC3409h = (GeneratedMessageLite.InterfaceC3409h) obj;
                    PopUp popUp = (PopUp) obj2;
                    this.campaignId_ = interfaceC3409h.mo17052f(!this.campaignId_.isEmpty(), this.campaignId_, !popUp.campaignId_.isEmpty(), popUp.campaignId_);
                    this.roomId_ = interfaceC3409h.mo17052f(!this.roomId_.isEmpty(), this.roomId_, true ^ popUp.roomId_.isEmpty(), popUp.roomId_);
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
                                    this.campaignId_ = c3430e.m17170L();
                                } else if (iM17171M == 18) {
                                    this.roomId_ = c3430e.m17170L();
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
                        synchronized (PopUp.class) {
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

        @Override // com.google.protobuf.InterfaceC3442q
        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int iM16956K = !this.campaignId_.isEmpty() ? CodedOutputStream.m16956K(1, getCampaignId()) : 0;
            if (!this.roomId_.isEmpty()) {
                iM16956K += CodedOutputStream.m16956K(2, getRoomId());
            }
            this.memoizedSerializedSize = iM16956K;
            return iM16956K;
        }

        @Override // com.google.protobuf.InterfaceC3442q
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (!this.campaignId_.isEmpty()) {
                codedOutputStream.mo16994D0(1, getCampaignId());
            }
            if (this.roomId_.isEmpty()) {
                return;
            }
            codedOutputStream.mo16994D0(2, getRoomId());
        }

        public static PopUp parseDelimitedFrom(InputStream inputStream, C3433h c3433h) throws IOException {
            return (PopUp) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, c3433h);
        }

        public static PopUp parseFrom(ByteString byteString, C3433h c3433h) throws InvalidProtocolBufferException {
            return (PopUp) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, c3433h);
        }

        public static PopUp parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (PopUp) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static PopUp parseFrom(byte[] bArr, C3433h c3433h) throws InvalidProtocolBufferException {
            return (PopUp) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, c3433h);
        }

        public static PopUp parseFrom(InputStream inputStream) throws IOException {
            return (PopUp) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static PopUp parseFrom(InputStream inputStream, C3433h c3433h) throws IOException {
            return (PopUp) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, c3433h);
        }

        public static PopUp parseFrom(C3430e c3430e) throws IOException {
            return (PopUp) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, c3430e);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static PopUp parseFrom(C3430e c3430e, C3433h c3433h) throws IOException {
            return (PopUp) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, c3430e, c3433h);
        }
    }

    public static final class PopUpContentUpdateNotice extends GeneratedMessageLite<PopUpContentUpdateNotice, Builder> implements PopUpContentUpdateNoticeOrBuilder {
        public static final int DATA_FIELD_NUMBER = 4;
        private static final PopUpContentUpdateNotice DEFAULT_INSTANCE;
        private static volatile ng60<PopUpContentUpdateNotice> PARSER = null;
        public static final int ROOMID_FIELD_NUMBER = 1;
        public static final int UPDATETYPE_FIELD_NUMBER = 3;
        public static final int URL_FIELD_NUMBER = 2;
        private String roomId_ = "";
        private String url_ = "";
        private String updateType_ = "";
        private String data_ = "";

        public static final class Builder extends GeneratedMessageLite.AbstractC3403b<PopUpContentUpdateNotice, Builder> implements PopUpContentUpdateNoticeOrBuilder {
            private Builder() {
                super(PopUpContentUpdateNotice.DEFAULT_INSTANCE);
            }

            public Builder clearData() {
                copyOnWrite();
                ((PopUpContentUpdateNotice) this.instance).clearData();
                return this;
            }

            public Builder clearRoomId() {
                copyOnWrite();
                ((PopUpContentUpdateNotice) this.instance).clearRoomId();
                return this;
            }

            public Builder clearUpdateType() {
                copyOnWrite();
                ((PopUpContentUpdateNotice) this.instance).clearUpdateType();
                return this;
            }

            public Builder clearUrl() {
                copyOnWrite();
                ((PopUpContentUpdateNotice) this.instance).clearUrl();
                return this;
            }

            @Override // com.p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage.PopUpContentUpdateNoticeOrBuilder
            public String getData() {
                return ((PopUpContentUpdateNotice) this.instance).getData();
            }

            @Override // com.p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage.PopUpContentUpdateNoticeOrBuilder
            public ByteString getDataBytes() {
                return ((PopUpContentUpdateNotice) this.instance).getDataBytes();
            }

            @Override // com.p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage.PopUpContentUpdateNoticeOrBuilder
            public String getRoomId() {
                return ((PopUpContentUpdateNotice) this.instance).getRoomId();
            }

            @Override // com.p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage.PopUpContentUpdateNoticeOrBuilder
            public ByteString getRoomIdBytes() {
                return ((PopUpContentUpdateNotice) this.instance).getRoomIdBytes();
            }

            @Override // com.p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage.PopUpContentUpdateNoticeOrBuilder
            public String getUpdateType() {
                return ((PopUpContentUpdateNotice) this.instance).getUpdateType();
            }

            @Override // com.p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage.PopUpContentUpdateNoticeOrBuilder
            public ByteString getUpdateTypeBytes() {
                return ((PopUpContentUpdateNotice) this.instance).getUpdateTypeBytes();
            }

            @Override // com.p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage.PopUpContentUpdateNoticeOrBuilder
            public String getUrl() {
                return ((PopUpContentUpdateNotice) this.instance).getUrl();
            }

            @Override // com.p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage.PopUpContentUpdateNoticeOrBuilder
            public ByteString getUrlBytes() {
                return ((PopUpContentUpdateNotice) this.instance).getUrlBytes();
            }

            public Builder setData(String str) {
                copyOnWrite();
                ((PopUpContentUpdateNotice) this.instance).setData(str);
                return this;
            }

            public Builder setDataBytes(ByteString byteString) {
                copyOnWrite();
                ((PopUpContentUpdateNotice) this.instance).setDataBytes(byteString);
                return this;
            }

            public Builder setRoomId(String str) {
                copyOnWrite();
                ((PopUpContentUpdateNotice) this.instance).setRoomId(str);
                return this;
            }

            public Builder setRoomIdBytes(ByteString byteString) {
                copyOnWrite();
                ((PopUpContentUpdateNotice) this.instance).setRoomIdBytes(byteString);
                return this;
            }

            public Builder setUpdateType(String str) {
                copyOnWrite();
                ((PopUpContentUpdateNotice) this.instance).setUpdateType(str);
                return this;
            }

            public Builder setUpdateTypeBytes(ByteString byteString) {
                copyOnWrite();
                ((PopUpContentUpdateNotice) this.instance).setUpdateTypeBytes(byteString);
                return this;
            }

            public Builder setUrl(String str) {
                copyOnWrite();
                ((PopUpContentUpdateNotice) this.instance).setUrl(str);
                return this;
            }

            public Builder setUrlBytes(ByteString byteString) {
                copyOnWrite();
                ((PopUpContentUpdateNotice) this.instance).setUrlBytes(byteString);
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
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(popUpContentUpdateNotice);
        }

        public static PopUpContentUpdateNotice parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (PopUpContentUpdateNotice) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static PopUpContentUpdateNotice parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (PopUpContentUpdateNotice) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static ng60<PopUpContentUpdateNotice> parser() {
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
            AbstractC3426a.checkByteStringIsUtf8(byteString);
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
            AbstractC3426a.checkByteStringIsUtf8(byteString);
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
            AbstractC3426a.checkByteStringIsUtf8(byteString);
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
            AbstractC3426a.checkByteStringIsUtf8(byteString);
            this.url_ = byteString.toStringUtf8();
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (C45881.f16673xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new PopUpContentUpdateNotice();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                    return null;
                case 4:
                    return new Builder();
                case 5:
                    GeneratedMessageLite.InterfaceC3409h interfaceC3409h = (GeneratedMessageLite.InterfaceC3409h) obj;
                    PopUpContentUpdateNotice popUpContentUpdateNotice = (PopUpContentUpdateNotice) obj2;
                    this.roomId_ = interfaceC3409h.mo17052f(!this.roomId_.isEmpty(), this.roomId_, !popUpContentUpdateNotice.roomId_.isEmpty(), popUpContentUpdateNotice.roomId_);
                    this.url_ = interfaceC3409h.mo17052f(!this.url_.isEmpty(), this.url_, !popUpContentUpdateNotice.url_.isEmpty(), popUpContentUpdateNotice.url_);
                    this.updateType_ = interfaceC3409h.mo17052f(!this.updateType_.isEmpty(), this.updateType_, !popUpContentUpdateNotice.updateType_.isEmpty(), popUpContentUpdateNotice.updateType_);
                    this.data_ = interfaceC3409h.mo17052f(!this.data_.isEmpty(), this.data_, true ^ popUpContentUpdateNotice.data_.isEmpty(), popUpContentUpdateNotice.data_);
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
                                    this.roomId_ = c3430e.m17170L();
                                } else if (iM17171M == 18) {
                                    this.url_ = c3430e.m17170L();
                                } else if (iM17171M == 26) {
                                    this.updateType_ = c3430e.m17170L();
                                } else if (iM17171M == 34) {
                                    this.data_ = c3430e.m17170L();
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
                        synchronized (PopUpContentUpdateNotice.class) {
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

        @Override // com.google.protobuf.InterfaceC3442q
        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int iM16956K = !this.roomId_.isEmpty() ? CodedOutputStream.m16956K(1, getRoomId()) : 0;
            if (!this.url_.isEmpty()) {
                iM16956K += CodedOutputStream.m16956K(2, getUrl());
            }
            if (!this.updateType_.isEmpty()) {
                iM16956K += CodedOutputStream.m16956K(3, getUpdateType());
            }
            if (!this.data_.isEmpty()) {
                iM16956K += CodedOutputStream.m16956K(4, getData());
            }
            this.memoizedSerializedSize = iM16956K;
            return iM16956K;
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

        @Override // com.google.protobuf.InterfaceC3442q
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (!this.roomId_.isEmpty()) {
                codedOutputStream.mo16994D0(1, getRoomId());
            }
            if (!this.url_.isEmpty()) {
                codedOutputStream.mo16994D0(2, getUrl());
            }
            if (!this.updateType_.isEmpty()) {
                codedOutputStream.mo16994D0(3, getUpdateType());
            }
            if (this.data_.isEmpty()) {
                return;
            }
            codedOutputStream.mo16994D0(4, getData());
        }

        public static PopUpContentUpdateNotice parseDelimitedFrom(InputStream inputStream, C3433h c3433h) throws IOException {
            return (PopUpContentUpdateNotice) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, c3433h);
        }

        public static PopUpContentUpdateNotice parseFrom(ByteString byteString, C3433h c3433h) throws InvalidProtocolBufferException {
            return (PopUpContentUpdateNotice) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, c3433h);
        }

        public static PopUpContentUpdateNotice parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (PopUpContentUpdateNotice) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static PopUpContentUpdateNotice parseFrom(byte[] bArr, C3433h c3433h) throws InvalidProtocolBufferException {
            return (PopUpContentUpdateNotice) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, c3433h);
        }

        public static PopUpContentUpdateNotice parseFrom(InputStream inputStream) throws IOException {
            return (PopUpContentUpdateNotice) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static PopUpContentUpdateNotice parseFrom(InputStream inputStream, C3433h c3433h) throws IOException {
            return (PopUpContentUpdateNotice) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, c3433h);
        }

        public static PopUpContentUpdateNotice parseFrom(C3430e c3430e) throws IOException {
            return (PopUpContentUpdateNotice) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, c3430e);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static PopUpContentUpdateNotice parseFrom(C3430e c3430e, C3433h c3433h) throws IOException {
            return (PopUpContentUpdateNotice) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, c3430e, c3433h);
        }
    }

    public static final class ReceiveLiveRedPacketMsg extends GeneratedMessageLite<ReceiveLiveRedPacketMsg, Builder> implements ReceiveLiveRedPacketMsgOrBuilder {
        public static final int AMOUNT_FIELD_NUMBER = 3;
        private static final ReceiveLiveRedPacketMsg DEFAULT_INSTANCE;
        private static volatile ng60<ReceiveLiveRedPacketMsg> PARSER = null;
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
                this.template_ = Template.TemplateData.newBuilder(this.template_).mergeFrom(templateData).buildPartial();
            }
        }

        public static Builder newBuilder(ReceiveLiveRedPacketMsg receiveLiveRedPacketMsg) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(receiveLiveRedPacketMsg);
        }

        public static ReceiveLiveRedPacketMsg parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (ReceiveLiveRedPacketMsg) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static ReceiveLiveRedPacketMsg parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (ReceiveLiveRedPacketMsg) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static ng60<ReceiveLiveRedPacketMsg> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAmount(long j) {
            this.amount_ = j;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTemplate(Template.TemplateData.Builder builder) {
            this.template_ = builder.build();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setUserId(String str) {
            str.getClass();
            this.userId_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setUserIdBytes(ByteString byteString) {
            byteString.getClass();
            AbstractC3426a.checkByteStringIsUtf8(byteString);
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
            AbstractC3426a.checkByteStringIsUtf8(byteString);
            this.userName_ = byteString.toStringUtf8();
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            boolean z = false;
            switch (C45881.f16673xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new ReceiveLiveRedPacketMsg();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                    return null;
                case 4:
                    return new Builder();
                case 5:
                    GeneratedMessageLite.InterfaceC3409h interfaceC3409h = (GeneratedMessageLite.InterfaceC3409h) obj;
                    ReceiveLiveRedPacketMsg receiveLiveRedPacketMsg = (ReceiveLiveRedPacketMsg) obj2;
                    this.userId_ = interfaceC3409h.mo17052f(!this.userId_.isEmpty(), this.userId_, !receiveLiveRedPacketMsg.userId_.isEmpty(), receiveLiveRedPacketMsg.userId_);
                    this.userName_ = interfaceC3409h.mo17052f(!this.userName_.isEmpty(), this.userName_, !receiveLiveRedPacketMsg.userName_.isEmpty(), receiveLiveRedPacketMsg.userName_);
                    long j = this.amount_;
                    boolean z2 = j != 0;
                    long j2 = receiveLiveRedPacketMsg.amount_;
                    this.amount_ = interfaceC3409h.mo17055i(z2, j, j2 != 0, j2);
                    this.template_ = (Template.TemplateData) interfaceC3409h.mo17061o(this.template_, receiveLiveRedPacketMsg.template_);
                    GeneratedMessageLite.C3408g c3408g = GeneratedMessageLite.C3408g.INSTANCE;
                    return this;
                case 6:
                    C3430e c3430e = (C3430e) obj;
                    C3433h c3433h = (C3433h) obj2;
                    while (!z) {
                        try {
                            int iM17171M = c3430e.m17171M();
                            if (iM17171M != 0) {
                                if (iM17171M == 10) {
                                    this.userId_ = c3430e.m17170L();
                                } else if (iM17171M == 18) {
                                    this.userName_ = c3430e.m17170L();
                                } else if (iM17171M == 24) {
                                    this.amount_ = c3430e.m17197v();
                                } else if (iM17171M == 34) {
                                    Template.TemplateData templateData = this.template_;
                                    Template.TemplateData.Builder builder = templateData != null ? templateData.toBuilder() : null;
                                    Template.TemplateData templateData2 = (Template.TemplateData) c3430e.m17198w(Template.TemplateData.parser(), c3433h);
                                    this.template_ = templateData2;
                                    if (builder != null) {
                                        builder.mergeFrom(templateData2);
                                        this.template_ = builder.buildPartial();
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
                        synchronized (ReceiveLiveRedPacketMsg.class) {
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

        @Override // com.p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage.ReceiveLiveRedPacketMsgOrBuilder
        public long getAmount() {
            return this.amount_;
        }

        @Override // com.google.protobuf.InterfaceC3442q
        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int iM16956K = !this.userId_.isEmpty() ? CodedOutputStream.m16956K(1, getUserId()) : 0;
            if (!this.userName_.isEmpty()) {
                iM16956K += CodedOutputStream.m16956K(2, getUserName());
            }
            long j = this.amount_;
            if (j != 0) {
                iM16956K += CodedOutputStream.m16986v(3, j);
            }
            if (this.template_ != null) {
                iM16956K += CodedOutputStream.m16948C(4, getTemplate());
            }
            this.memoizedSerializedSize = iM16956K;
            return iM16956K;
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

        @Override // com.google.protobuf.InterfaceC3442q
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (!this.userId_.isEmpty()) {
                codedOutputStream.mo16994D0(1, getUserId());
            }
            if (!this.userName_.isEmpty()) {
                codedOutputStream.mo16994D0(2, getUserName());
            }
            long j = this.amount_;
            if (j != 0) {
                codedOutputStream.m17027u0(3, j);
            }
            if (this.template_ != null) {
                codedOutputStream.mo17029w0(4, getTemplate());
            }
        }

        public static ReceiveLiveRedPacketMsg parseDelimitedFrom(InputStream inputStream, C3433h c3433h) throws IOException {
            return (ReceiveLiveRedPacketMsg) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, c3433h);
        }

        public static ReceiveLiveRedPacketMsg parseFrom(ByteString byteString, C3433h c3433h) throws InvalidProtocolBufferException {
            return (ReceiveLiveRedPacketMsg) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, c3433h);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTemplate(Template.TemplateData templateData) {
            templateData.getClass();
            this.template_ = templateData;
        }

        public static final class Builder extends GeneratedMessageLite.AbstractC3403b<ReceiveLiveRedPacketMsg, Builder> implements ReceiveLiveRedPacketMsgOrBuilder {
            private Builder() {
                super(ReceiveLiveRedPacketMsg.DEFAULT_INSTANCE);
            }

            public Builder clearAmount() {
                copyOnWrite();
                ((ReceiveLiveRedPacketMsg) this.instance).clearAmount();
                return this;
            }

            public Builder clearTemplate() {
                copyOnWrite();
                ((ReceiveLiveRedPacketMsg) this.instance).clearTemplate();
                return this;
            }

            public Builder clearUserId() {
                copyOnWrite();
                ((ReceiveLiveRedPacketMsg) this.instance).clearUserId();
                return this;
            }

            public Builder clearUserName() {
                copyOnWrite();
                ((ReceiveLiveRedPacketMsg) this.instance).clearUserName();
                return this;
            }

            @Override // com.p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage.ReceiveLiveRedPacketMsgOrBuilder
            public long getAmount() {
                return ((ReceiveLiveRedPacketMsg) this.instance).getAmount();
            }

            @Override // com.p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage.ReceiveLiveRedPacketMsgOrBuilder
            public Template.TemplateData getTemplate() {
                return ((ReceiveLiveRedPacketMsg) this.instance).getTemplate();
            }

            @Override // com.p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage.ReceiveLiveRedPacketMsgOrBuilder
            public String getUserId() {
                return ((ReceiveLiveRedPacketMsg) this.instance).getUserId();
            }

            @Override // com.p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage.ReceiveLiveRedPacketMsgOrBuilder
            public ByteString getUserIdBytes() {
                return ((ReceiveLiveRedPacketMsg) this.instance).getUserIdBytes();
            }

            @Override // com.p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage.ReceiveLiveRedPacketMsgOrBuilder
            public String getUserName() {
                return ((ReceiveLiveRedPacketMsg) this.instance).getUserName();
            }

            @Override // com.p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage.ReceiveLiveRedPacketMsgOrBuilder
            public ByteString getUserNameBytes() {
                return ((ReceiveLiveRedPacketMsg) this.instance).getUserNameBytes();
            }

            @Override // com.p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage.ReceiveLiveRedPacketMsgOrBuilder
            public boolean hasTemplate() {
                return ((ReceiveLiveRedPacketMsg) this.instance).hasTemplate();
            }

            public Builder mergeTemplate(Template.TemplateData templateData) {
                copyOnWrite();
                ((ReceiveLiveRedPacketMsg) this.instance).mergeTemplate(templateData);
                return this;
            }

            public Builder setAmount(long j) {
                copyOnWrite();
                ((ReceiveLiveRedPacketMsg) this.instance).setAmount(j);
                return this;
            }

            public Builder setTemplate(Template.TemplateData templateData) {
                copyOnWrite();
                ((ReceiveLiveRedPacketMsg) this.instance).setTemplate(templateData);
                return this;
            }

            public Builder setUserId(String str) {
                copyOnWrite();
                ((ReceiveLiveRedPacketMsg) this.instance).setUserId(str);
                return this;
            }

            public Builder setUserIdBytes(ByteString byteString) {
                copyOnWrite();
                ((ReceiveLiveRedPacketMsg) this.instance).setUserIdBytes(byteString);
                return this;
            }

            public Builder setUserName(String str) {
                copyOnWrite();
                ((ReceiveLiveRedPacketMsg) this.instance).setUserName(str);
                return this;
            }

            public Builder setUserNameBytes(ByteString byteString) {
                copyOnWrite();
                ((ReceiveLiveRedPacketMsg) this.instance).setUserNameBytes(byteString);
                return this;
            }

            public Builder setTemplate(Template.TemplateData.Builder builder) {
                copyOnWrite();
                ((ReceiveLiveRedPacketMsg) this.instance).setTemplate(builder);
                return this;
            }
        }

        public static ReceiveLiveRedPacketMsg parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (ReceiveLiveRedPacketMsg) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static ReceiveLiveRedPacketMsg parseFrom(byte[] bArr, C3433h c3433h) throws InvalidProtocolBufferException {
            return (ReceiveLiveRedPacketMsg) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, c3433h);
        }

        public static ReceiveLiveRedPacketMsg parseFrom(InputStream inputStream) throws IOException {
            return (ReceiveLiveRedPacketMsg) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static ReceiveLiveRedPacketMsg parseFrom(InputStream inputStream, C3433h c3433h) throws IOException {
            return (ReceiveLiveRedPacketMsg) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, c3433h);
        }

        public static ReceiveLiveRedPacketMsg parseFrom(C3430e c3430e) throws IOException {
            return (ReceiveLiveRedPacketMsg) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, c3430e);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static ReceiveLiveRedPacketMsg parseFrom(C3430e c3430e, C3433h c3433h) throws IOException {
            return (ReceiveLiveRedPacketMsg) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, c3430e, c3433h);
        }
    }

    public static final class SendLiveRedPacketMsg extends GeneratedMessageLite<SendLiveRedPacketMsg, Builder> implements SendLiveRedPacketMsgOrBuilder {
        private static final SendLiveRedPacketMsg DEFAULT_INSTANCE;
        public static final int NUMBEROFPACKETS_FIELD_NUMBER = 4;
        private static volatile ng60<SendLiveRedPacketMsg> PARSER = null;
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
                this.template_ = Template.TemplateData.newBuilder(this.template_).mergeFrom(templateData).buildPartial();
            }
        }

        public static Builder newBuilder(SendLiveRedPacketMsg sendLiveRedPacketMsg) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(sendLiveRedPacketMsg);
        }

        public static SendLiveRedPacketMsg parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (SendLiveRedPacketMsg) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static SendLiveRedPacketMsg parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (SendLiveRedPacketMsg) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static ng60<SendLiveRedPacketMsg> parser() {
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
            AbstractC3426a.checkByteStringIsUtf8(byteString);
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
            AbstractC3426a.checkByteStringIsUtf8(byteString);
            this.sendUserID_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTemplate(Template.TemplateData.Builder builder) {
            this.template_ = builder.build();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setToken(String str) {
            str.getClass();
            this.token_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTokenBytes(ByteString byteString) {
            byteString.getClass();
            AbstractC3426a.checkByteStringIsUtf8(byteString);
            this.token_ = byteString.toStringUtf8();
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            boolean z = false;
            switch (C45881.f16673xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new SendLiveRedPacketMsg();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                    return null;
                case 4:
                    return new Builder();
                case 5:
                    GeneratedMessageLite.InterfaceC3409h interfaceC3409h = (GeneratedMessageLite.InterfaceC3409h) obj;
                    SendLiveRedPacketMsg sendLiveRedPacketMsg = (SendLiveRedPacketMsg) obj2;
                    this.sendUserID_ = interfaceC3409h.mo17052f(!this.sendUserID_.isEmpty(), this.sendUserID_, !sendLiveRedPacketMsg.sendUserID_.isEmpty(), sendLiveRedPacketMsg.sendUserID_);
                    this.redPacketID_ = interfaceC3409h.mo17052f(!this.redPacketID_.isEmpty(), this.redPacketID_, !sendLiveRedPacketMsg.redPacketID_.isEmpty(), sendLiveRedPacketMsg.redPacketID_);
                    this.token_ = interfaceC3409h.mo17052f(!this.token_.isEmpty(), this.token_, !sendLiveRedPacketMsg.token_.isEmpty(), sendLiveRedPacketMsg.token_);
                    long j = this.numberOfPackets_;
                    boolean z2 = j != 0;
                    long j2 = sendLiveRedPacketMsg.numberOfPackets_;
                    this.numberOfPackets_ = interfaceC3409h.mo17055i(z2, j, j2 != 0, j2);
                    this.template_ = (Template.TemplateData) interfaceC3409h.mo17061o(this.template_, sendLiveRedPacketMsg.template_);
                    GeneratedMessageLite.C3408g c3408g = GeneratedMessageLite.C3408g.INSTANCE;
                    return this;
                case 6:
                    C3430e c3430e = (C3430e) obj;
                    C3433h c3433h = (C3433h) obj2;
                    while (!z) {
                        try {
                            int iM17171M = c3430e.m17171M();
                            if (iM17171M != 0) {
                                if (iM17171M == 10) {
                                    this.sendUserID_ = c3430e.m17170L();
                                } else if (iM17171M == 18) {
                                    this.redPacketID_ = c3430e.m17170L();
                                } else if (iM17171M == 26) {
                                    this.token_ = c3430e.m17170L();
                                } else if (iM17171M == 32) {
                                    this.numberOfPackets_ = c3430e.m17197v();
                                } else if (iM17171M == 42) {
                                    Template.TemplateData templateData = this.template_;
                                    Template.TemplateData.Builder builder = templateData != null ? templateData.toBuilder() : null;
                                    Template.TemplateData templateData2 = (Template.TemplateData) c3430e.m17198w(Template.TemplateData.parser(), c3433h);
                                    this.template_ = templateData2;
                                    if (builder != null) {
                                        builder.mergeFrom(templateData2);
                                        this.template_ = builder.buildPartial();
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
                        synchronized (SendLiveRedPacketMsg.class) {
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

        @Override // com.google.protobuf.InterfaceC3442q
        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int iM16956K = !this.sendUserID_.isEmpty() ? CodedOutputStream.m16956K(1, getSendUserID()) : 0;
            if (!this.redPacketID_.isEmpty()) {
                iM16956K += CodedOutputStream.m16956K(2, getRedPacketID());
            }
            if (!this.token_.isEmpty()) {
                iM16956K += CodedOutputStream.m16956K(3, getToken());
            }
            long j = this.numberOfPackets_;
            if (j != 0) {
                iM16956K += CodedOutputStream.m16986v(4, j);
            }
            if (this.template_ != null) {
                iM16956K += CodedOutputStream.m16948C(5, getTemplate());
            }
            this.memoizedSerializedSize = iM16956K;
            return iM16956K;
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

        @Override // com.google.protobuf.InterfaceC3442q
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (!this.sendUserID_.isEmpty()) {
                codedOutputStream.mo16994D0(1, getSendUserID());
            }
            if (!this.redPacketID_.isEmpty()) {
                codedOutputStream.mo16994D0(2, getRedPacketID());
            }
            if (!this.token_.isEmpty()) {
                codedOutputStream.mo16994D0(3, getToken());
            }
            long j = this.numberOfPackets_;
            if (j != 0) {
                codedOutputStream.m17027u0(4, j);
            }
            if (this.template_ != null) {
                codedOutputStream.mo17029w0(5, getTemplate());
            }
        }

        public static SendLiveRedPacketMsg parseDelimitedFrom(InputStream inputStream, C3433h c3433h) throws IOException {
            return (SendLiveRedPacketMsg) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, c3433h);
        }

        public static SendLiveRedPacketMsg parseFrom(ByteString byteString, C3433h c3433h) throws InvalidProtocolBufferException {
            return (SendLiveRedPacketMsg) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, c3433h);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTemplate(Template.TemplateData templateData) {
            templateData.getClass();
            this.template_ = templateData;
        }

        public static final class Builder extends GeneratedMessageLite.AbstractC3403b<SendLiveRedPacketMsg, Builder> implements SendLiveRedPacketMsgOrBuilder {
            private Builder() {
                super(SendLiveRedPacketMsg.DEFAULT_INSTANCE);
            }

            public Builder clearNumberOfPackets() {
                copyOnWrite();
                ((SendLiveRedPacketMsg) this.instance).clearNumberOfPackets();
                return this;
            }

            public Builder clearRedPacketID() {
                copyOnWrite();
                ((SendLiveRedPacketMsg) this.instance).clearRedPacketID();
                return this;
            }

            public Builder clearSendUserID() {
                copyOnWrite();
                ((SendLiveRedPacketMsg) this.instance).clearSendUserID();
                return this;
            }

            public Builder clearTemplate() {
                copyOnWrite();
                ((SendLiveRedPacketMsg) this.instance).clearTemplate();
                return this;
            }

            public Builder clearToken() {
                copyOnWrite();
                ((SendLiveRedPacketMsg) this.instance).clearToken();
                return this;
            }

            @Override // com.p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage.SendLiveRedPacketMsgOrBuilder
            public long getNumberOfPackets() {
                return ((SendLiveRedPacketMsg) this.instance).getNumberOfPackets();
            }

            @Override // com.p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage.SendLiveRedPacketMsgOrBuilder
            public String getRedPacketID() {
                return ((SendLiveRedPacketMsg) this.instance).getRedPacketID();
            }

            @Override // com.p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage.SendLiveRedPacketMsgOrBuilder
            public ByteString getRedPacketIDBytes() {
                return ((SendLiveRedPacketMsg) this.instance).getRedPacketIDBytes();
            }

            @Override // com.p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage.SendLiveRedPacketMsgOrBuilder
            public String getSendUserID() {
                return ((SendLiveRedPacketMsg) this.instance).getSendUserID();
            }

            @Override // com.p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage.SendLiveRedPacketMsgOrBuilder
            public ByteString getSendUserIDBytes() {
                return ((SendLiveRedPacketMsg) this.instance).getSendUserIDBytes();
            }

            @Override // com.p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage.SendLiveRedPacketMsgOrBuilder
            public Template.TemplateData getTemplate() {
                return ((SendLiveRedPacketMsg) this.instance).getTemplate();
            }

            @Override // com.p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage.SendLiveRedPacketMsgOrBuilder
            public String getToken() {
                return ((SendLiveRedPacketMsg) this.instance).getToken();
            }

            @Override // com.p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage.SendLiveRedPacketMsgOrBuilder
            public ByteString getTokenBytes() {
                return ((SendLiveRedPacketMsg) this.instance).getTokenBytes();
            }

            @Override // com.p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage.SendLiveRedPacketMsgOrBuilder
            public boolean hasTemplate() {
                return ((SendLiveRedPacketMsg) this.instance).hasTemplate();
            }

            public Builder mergeTemplate(Template.TemplateData templateData) {
                copyOnWrite();
                ((SendLiveRedPacketMsg) this.instance).mergeTemplate(templateData);
                return this;
            }

            public Builder setNumberOfPackets(long j) {
                copyOnWrite();
                ((SendLiveRedPacketMsg) this.instance).setNumberOfPackets(j);
                return this;
            }

            public Builder setRedPacketID(String str) {
                copyOnWrite();
                ((SendLiveRedPacketMsg) this.instance).setRedPacketID(str);
                return this;
            }

            public Builder setRedPacketIDBytes(ByteString byteString) {
                copyOnWrite();
                ((SendLiveRedPacketMsg) this.instance).setRedPacketIDBytes(byteString);
                return this;
            }

            public Builder setSendUserID(String str) {
                copyOnWrite();
                ((SendLiveRedPacketMsg) this.instance).setSendUserID(str);
                return this;
            }

            public Builder setSendUserIDBytes(ByteString byteString) {
                copyOnWrite();
                ((SendLiveRedPacketMsg) this.instance).setSendUserIDBytes(byteString);
                return this;
            }

            public Builder setTemplate(Template.TemplateData templateData) {
                copyOnWrite();
                ((SendLiveRedPacketMsg) this.instance).setTemplate(templateData);
                return this;
            }

            public Builder setToken(String str) {
                copyOnWrite();
                ((SendLiveRedPacketMsg) this.instance).setToken(str);
                return this;
            }

            public Builder setTokenBytes(ByteString byteString) {
                copyOnWrite();
                ((SendLiveRedPacketMsg) this.instance).setTokenBytes(byteString);
                return this;
            }

            public Builder setTemplate(Template.TemplateData.Builder builder) {
                copyOnWrite();
                ((SendLiveRedPacketMsg) this.instance).setTemplate(builder);
                return this;
            }
        }

        public static SendLiveRedPacketMsg parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (SendLiveRedPacketMsg) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static SendLiveRedPacketMsg parseFrom(byte[] bArr, C3433h c3433h) throws InvalidProtocolBufferException {
            return (SendLiveRedPacketMsg) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, c3433h);
        }

        public static SendLiveRedPacketMsg parseFrom(InputStream inputStream) throws IOException {
            return (SendLiveRedPacketMsg) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static SendLiveRedPacketMsg parseFrom(InputStream inputStream, C3433h c3433h) throws IOException {
            return (SendLiveRedPacketMsg) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, c3433h);
        }

        public static SendLiveRedPacketMsg parseFrom(C3430e c3430e) throws IOException {
            return (SendLiveRedPacketMsg) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, c3430e);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static SendLiveRedPacketMsg parseFrom(C3430e c3430e, C3433h c3433h) throws IOException {
            return (SendLiveRedPacketMsg) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, c3430e, c3433h);
        }
    }

    public static final class Shading extends GeneratedMessageLite<Shading, Builder> implements ShadingOrBuilder {
        private static final Shading DEFAULT_INSTANCE;
        public static final int ENDCOLOR_FIELD_NUMBER = 2;
        public static final int IMAGEURL_FIELD_NUMBER = 3;
        private static volatile ng60<Shading> PARSER = null;
        public static final int SHADINGTYPE_FIELD_NUMBER = 5;
        public static final int STARTCOLOR_FIELD_NUMBER = 1;
        public static final int TRANSPARENCY_FIELD_NUMBER = 4;
        private long transparency_;
        private String startColor_ = "";
        private String endColor_ = "";
        private String imageUrl_ = "";
        private String shadingType_ = "";

        public static final class Builder extends GeneratedMessageLite.AbstractC3403b<Shading, Builder> implements ShadingOrBuilder {
            private Builder() {
                super(Shading.DEFAULT_INSTANCE);
            }

            public Builder clearEndColor() {
                copyOnWrite();
                ((Shading) this.instance).clearEndColor();
                return this;
            }

            public Builder clearImageUrl() {
                copyOnWrite();
                ((Shading) this.instance).clearImageUrl();
                return this;
            }

            public Builder clearShadingType() {
                copyOnWrite();
                ((Shading) this.instance).clearShadingType();
                return this;
            }

            public Builder clearStartColor() {
                copyOnWrite();
                ((Shading) this.instance).clearStartColor();
                return this;
            }

            public Builder clearTransparency() {
                copyOnWrite();
                ((Shading) this.instance).clearTransparency();
                return this;
            }

            @Override // com.p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage.ShadingOrBuilder
            public String getEndColor() {
                return ((Shading) this.instance).getEndColor();
            }

            @Override // com.p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage.ShadingOrBuilder
            public ByteString getEndColorBytes() {
                return ((Shading) this.instance).getEndColorBytes();
            }

            @Override // com.p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage.ShadingOrBuilder
            public String getImageUrl() {
                return ((Shading) this.instance).getImageUrl();
            }

            @Override // com.p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage.ShadingOrBuilder
            public ByteString getImageUrlBytes() {
                return ((Shading) this.instance).getImageUrlBytes();
            }

            @Override // com.p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage.ShadingOrBuilder
            public String getShadingType() {
                return ((Shading) this.instance).getShadingType();
            }

            @Override // com.p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage.ShadingOrBuilder
            public ByteString getShadingTypeBytes() {
                return ((Shading) this.instance).getShadingTypeBytes();
            }

            @Override // com.p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage.ShadingOrBuilder
            public String getStartColor() {
                return ((Shading) this.instance).getStartColor();
            }

            @Override // com.p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage.ShadingOrBuilder
            public ByteString getStartColorBytes() {
                return ((Shading) this.instance).getStartColorBytes();
            }

            @Override // com.p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage.ShadingOrBuilder
            public long getTransparency() {
                return ((Shading) this.instance).getTransparency();
            }

            public Builder setEndColor(String str) {
                copyOnWrite();
                ((Shading) this.instance).setEndColor(str);
                return this;
            }

            public Builder setEndColorBytes(ByteString byteString) {
                copyOnWrite();
                ((Shading) this.instance).setEndColorBytes(byteString);
                return this;
            }

            public Builder setImageUrl(String str) {
                copyOnWrite();
                ((Shading) this.instance).setImageUrl(str);
                return this;
            }

            public Builder setImageUrlBytes(ByteString byteString) {
                copyOnWrite();
                ((Shading) this.instance).setImageUrlBytes(byteString);
                return this;
            }

            public Builder setShadingType(String str) {
                copyOnWrite();
                ((Shading) this.instance).setShadingType(str);
                return this;
            }

            public Builder setShadingTypeBytes(ByteString byteString) {
                copyOnWrite();
                ((Shading) this.instance).setShadingTypeBytes(byteString);
                return this;
            }

            public Builder setStartColor(String str) {
                copyOnWrite();
                ((Shading) this.instance).setStartColor(str);
                return this;
            }

            public Builder setStartColorBytes(ByteString byteString) {
                copyOnWrite();
                ((Shading) this.instance).setStartColorBytes(byteString);
                return this;
            }

            public Builder setTransparency(long j) {
                copyOnWrite();
                ((Shading) this.instance).setTransparency(j);
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
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(shading);
        }

        public static Shading parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (Shading) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Shading parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (Shading) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static ng60<Shading> parser() {
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
            AbstractC3426a.checkByteStringIsUtf8(byteString);
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
            AbstractC3426a.checkByteStringIsUtf8(byteString);
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
            AbstractC3426a.checkByteStringIsUtf8(byteString);
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
            AbstractC3426a.checkByteStringIsUtf8(byteString);
            this.startColor_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTransparency(long j) {
            this.transparency_ = j;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            boolean z = false;
            switch (C45881.f16673xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new Shading();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                    return null;
                case 4:
                    return new Builder();
                case 5:
                    GeneratedMessageLite.InterfaceC3409h interfaceC3409h = (GeneratedMessageLite.InterfaceC3409h) obj;
                    Shading shading = (Shading) obj2;
                    this.startColor_ = interfaceC3409h.mo17052f(!this.startColor_.isEmpty(), this.startColor_, !shading.startColor_.isEmpty(), shading.startColor_);
                    this.endColor_ = interfaceC3409h.mo17052f(!this.endColor_.isEmpty(), this.endColor_, !shading.endColor_.isEmpty(), shading.endColor_);
                    this.imageUrl_ = interfaceC3409h.mo17052f(!this.imageUrl_.isEmpty(), this.imageUrl_, !shading.imageUrl_.isEmpty(), shading.imageUrl_);
                    long j = this.transparency_;
                    boolean z2 = j != 0;
                    long j2 = shading.transparency_;
                    this.transparency_ = interfaceC3409h.mo17055i(z2, j, j2 != 0, j2);
                    this.shadingType_ = interfaceC3409h.mo17052f(!this.shadingType_.isEmpty(), this.shadingType_, !shading.shadingType_.isEmpty(), shading.shadingType_);
                    GeneratedMessageLite.C3408g c3408g = GeneratedMessageLite.C3408g.INSTANCE;
                    return this;
                case 6:
                    C3430e c3430e = (C3430e) obj;
                    while (!z) {
                        try {
                            int iM17171M = c3430e.m17171M();
                            if (iM17171M != 0) {
                                if (iM17171M == 10) {
                                    this.startColor_ = c3430e.m17170L();
                                } else if (iM17171M == 18) {
                                    this.endColor_ = c3430e.m17170L();
                                } else if (iM17171M == 26) {
                                    this.imageUrl_ = c3430e.m17170L();
                                } else if (iM17171M == 32) {
                                    this.transparency_ = c3430e.m17197v();
                                } else if (iM17171M == 42) {
                                    this.shadingType_ = c3430e.m17170L();
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
                        synchronized (Shading.class) {
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
            if (!this.imageUrl_.isEmpty()) {
                iM16956K += CodedOutputStream.m16956K(3, getImageUrl());
            }
            long j = this.transparency_;
            if (j != 0) {
                iM16956K += CodedOutputStream.m16986v(4, j);
            }
            if (!this.shadingType_.isEmpty()) {
                iM16956K += CodedOutputStream.m16956K(5, getShadingType());
            }
            this.memoizedSerializedSize = iM16956K;
            return iM16956K;
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

        @Override // com.google.protobuf.InterfaceC3442q
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (!this.startColor_.isEmpty()) {
                codedOutputStream.mo16994D0(1, getStartColor());
            }
            if (!this.endColor_.isEmpty()) {
                codedOutputStream.mo16994D0(2, getEndColor());
            }
            if (!this.imageUrl_.isEmpty()) {
                codedOutputStream.mo16994D0(3, getImageUrl());
            }
            long j = this.transparency_;
            if (j != 0) {
                codedOutputStream.m17027u0(4, j);
            }
            if (this.shadingType_.isEmpty()) {
                return;
            }
            codedOutputStream.mo16994D0(5, getShadingType());
        }

        public static Shading parseDelimitedFrom(InputStream inputStream, C3433h c3433h) throws IOException {
            return (Shading) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, c3433h);
        }

        public static Shading parseFrom(ByteString byteString, C3433h c3433h) throws InvalidProtocolBufferException {
            return (Shading) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, c3433h);
        }

        public static Shading parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (Shading) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static Shading parseFrom(byte[] bArr, C3433h c3433h) throws InvalidProtocolBufferException {
            return (Shading) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, c3433h);
        }

        public static Shading parseFrom(InputStream inputStream) throws IOException {
            return (Shading) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Shading parseFrom(InputStream inputStream, C3433h c3433h) throws IOException {
            return (Shading) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, c3433h);
        }

        public static Shading parseFrom(C3430e c3430e) throws IOException {
            return (Shading) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, c3430e);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static Shading parseFrom(C3430e c3430e, C3433h c3433h) throws IOException {
            return (Shading) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, c3430e, c3433h);
        }
    }

    public static final class SvgaEffectExtra extends GeneratedMessageLite<SvgaEffectExtra, Builder> implements SvgaEffectExtraOrBuilder {
        private static final SvgaEffectExtra DEFAULT_INSTANCE;
        public static final int ID_FIELD_NUMBER = 1;
        private static volatile ng60<SvgaEffectExtra> PARSER = null;
        public static final int TEXTCOLOR_FIELD_NUMBER = 5;
        public static final int TEXTSIZE_FIELD_NUMBER = 4;
        public static final int TYPE_FIELD_NUMBER = 2;
        public static final int VALUE_FIELD_NUMBER = 3;
        private long textSize_;
        private long type_;
        private String id_ = "";
        private String value_ = "";
        private String textColor_ = "";

        public static final class Builder extends GeneratedMessageLite.AbstractC3403b<SvgaEffectExtra, Builder> implements SvgaEffectExtraOrBuilder {
            private Builder() {
                super(SvgaEffectExtra.DEFAULT_INSTANCE);
            }

            public Builder clearId() {
                copyOnWrite();
                ((SvgaEffectExtra) this.instance).clearId();
                return this;
            }

            public Builder clearTextColor() {
                copyOnWrite();
                ((SvgaEffectExtra) this.instance).clearTextColor();
                return this;
            }

            public Builder clearTextSize() {
                copyOnWrite();
                ((SvgaEffectExtra) this.instance).clearTextSize();
                return this;
            }

            public Builder clearType() {
                copyOnWrite();
                ((SvgaEffectExtra) this.instance).clearType();
                return this;
            }

            public Builder clearValue() {
                copyOnWrite();
                ((SvgaEffectExtra) this.instance).clearValue();
                return this;
            }

            @Override // com.p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage.SvgaEffectExtraOrBuilder
            public String getId() {
                return ((SvgaEffectExtra) this.instance).getId();
            }

            @Override // com.p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage.SvgaEffectExtraOrBuilder
            public ByteString getIdBytes() {
                return ((SvgaEffectExtra) this.instance).getIdBytes();
            }

            @Override // com.p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage.SvgaEffectExtraOrBuilder
            public String getTextColor() {
                return ((SvgaEffectExtra) this.instance).getTextColor();
            }

            @Override // com.p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage.SvgaEffectExtraOrBuilder
            public ByteString getTextColorBytes() {
                return ((SvgaEffectExtra) this.instance).getTextColorBytes();
            }

            @Override // com.p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage.SvgaEffectExtraOrBuilder
            public long getTextSize() {
                return ((SvgaEffectExtra) this.instance).getTextSize();
            }

            @Override // com.p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage.SvgaEffectExtraOrBuilder
            public long getType() {
                return ((SvgaEffectExtra) this.instance).getType();
            }

            @Override // com.p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage.SvgaEffectExtraOrBuilder
            public String getValue() {
                return ((SvgaEffectExtra) this.instance).getValue();
            }

            @Override // com.p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage.SvgaEffectExtraOrBuilder
            public ByteString getValueBytes() {
                return ((SvgaEffectExtra) this.instance).getValueBytes();
            }

            public Builder setId(String str) {
                copyOnWrite();
                ((SvgaEffectExtra) this.instance).setId(str);
                return this;
            }

            public Builder setIdBytes(ByteString byteString) {
                copyOnWrite();
                ((SvgaEffectExtra) this.instance).setIdBytes(byteString);
                return this;
            }

            public Builder setTextColor(String str) {
                copyOnWrite();
                ((SvgaEffectExtra) this.instance).setTextColor(str);
                return this;
            }

            public Builder setTextColorBytes(ByteString byteString) {
                copyOnWrite();
                ((SvgaEffectExtra) this.instance).setTextColorBytes(byteString);
                return this;
            }

            public Builder setTextSize(long j) {
                copyOnWrite();
                ((SvgaEffectExtra) this.instance).setTextSize(j);
                return this;
            }

            public Builder setType(long j) {
                copyOnWrite();
                ((SvgaEffectExtra) this.instance).setType(j);
                return this;
            }

            public Builder setValue(String str) {
                copyOnWrite();
                ((SvgaEffectExtra) this.instance).setValue(str);
                return this;
            }

            public Builder setValueBytes(ByteString byteString) {
                copyOnWrite();
                ((SvgaEffectExtra) this.instance).setValueBytes(byteString);
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
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(svgaEffectExtra);
        }

        public static SvgaEffectExtra parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (SvgaEffectExtra) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static SvgaEffectExtra parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (SvgaEffectExtra) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static ng60<SvgaEffectExtra> parser() {
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
            AbstractC3426a.checkByteStringIsUtf8(byteString);
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
            AbstractC3426a.checkByteStringIsUtf8(byteString);
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
            AbstractC3426a.checkByteStringIsUtf8(byteString);
            this.value_ = byteString.toStringUtf8();
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            boolean z = false;
            switch (C45881.f16673xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new SvgaEffectExtra();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                    return null;
                case 4:
                    return new Builder();
                case 5:
                    GeneratedMessageLite.InterfaceC3409h interfaceC3409h = (GeneratedMessageLite.InterfaceC3409h) obj;
                    SvgaEffectExtra svgaEffectExtra = (SvgaEffectExtra) obj2;
                    this.id_ = interfaceC3409h.mo17052f(!this.id_.isEmpty(), this.id_, !svgaEffectExtra.id_.isEmpty(), svgaEffectExtra.id_);
                    long j = this.type_;
                    boolean z2 = j != 0;
                    long j2 = svgaEffectExtra.type_;
                    this.type_ = interfaceC3409h.mo17055i(z2, j, j2 != 0, j2);
                    this.value_ = interfaceC3409h.mo17052f(!this.value_.isEmpty(), this.value_, !svgaEffectExtra.value_.isEmpty(), svgaEffectExtra.value_);
                    long j3 = this.textSize_;
                    boolean z3 = j3 != 0;
                    long j4 = svgaEffectExtra.textSize_;
                    this.textSize_ = interfaceC3409h.mo17055i(z3, j3, j4 != 0, j4);
                    this.textColor_ = interfaceC3409h.mo17052f(!this.textColor_.isEmpty(), this.textColor_, !svgaEffectExtra.textColor_.isEmpty(), svgaEffectExtra.textColor_);
                    GeneratedMessageLite.C3408g c3408g = GeneratedMessageLite.C3408g.INSTANCE;
                    return this;
                case 6:
                    C3430e c3430e = (C3430e) obj;
                    while (!z) {
                        try {
                            int iM17171M = c3430e.m17171M();
                            if (iM17171M != 0) {
                                if (iM17171M == 10) {
                                    this.id_ = c3430e.m17170L();
                                } else if (iM17171M == 16) {
                                    this.type_ = c3430e.m17197v();
                                } else if (iM17171M == 26) {
                                    this.value_ = c3430e.m17170L();
                                } else if (iM17171M == 32) {
                                    this.textSize_ = c3430e.m17197v();
                                } else if (iM17171M == 42) {
                                    this.textColor_ = c3430e.m17170L();
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
                        synchronized (SvgaEffectExtra.class) {
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

        @Override // com.p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage.SvgaEffectExtraOrBuilder
        public String getId() {
            return this.id_;
        }

        @Override // com.p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage.SvgaEffectExtraOrBuilder
        public ByteString getIdBytes() {
            return ByteString.copyFromUtf8(this.id_);
        }

        @Override // com.google.protobuf.InterfaceC3442q
        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int iM16956K = !this.id_.isEmpty() ? CodedOutputStream.m16956K(1, getId()) : 0;
            long j = this.type_;
            if (j != 0) {
                iM16956K += CodedOutputStream.m16986v(2, j);
            }
            if (!this.value_.isEmpty()) {
                iM16956K += CodedOutputStream.m16956K(3, getValue());
            }
            long j2 = this.textSize_;
            if (j2 != 0) {
                iM16956K += CodedOutputStream.m16986v(4, j2);
            }
            if (!this.textColor_.isEmpty()) {
                iM16956K += CodedOutputStream.m16956K(5, getTextColor());
            }
            this.memoizedSerializedSize = iM16956K;
            return iM16956K;
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

        @Override // com.google.protobuf.InterfaceC3442q
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (!this.id_.isEmpty()) {
                codedOutputStream.mo16994D0(1, getId());
            }
            long j = this.type_;
            if (j != 0) {
                codedOutputStream.m17027u0(2, j);
            }
            if (!this.value_.isEmpty()) {
                codedOutputStream.mo16994D0(3, getValue());
            }
            long j2 = this.textSize_;
            if (j2 != 0) {
                codedOutputStream.m17027u0(4, j2);
            }
            if (this.textColor_.isEmpty()) {
                return;
            }
            codedOutputStream.mo16994D0(5, getTextColor());
        }

        public static SvgaEffectExtra parseDelimitedFrom(InputStream inputStream, C3433h c3433h) throws IOException {
            return (SvgaEffectExtra) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, c3433h);
        }

        public static SvgaEffectExtra parseFrom(ByteString byteString, C3433h c3433h) throws InvalidProtocolBufferException {
            return (SvgaEffectExtra) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, c3433h);
        }

        public static SvgaEffectExtra parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (SvgaEffectExtra) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static SvgaEffectExtra parseFrom(byte[] bArr, C3433h c3433h) throws InvalidProtocolBufferException {
            return (SvgaEffectExtra) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, c3433h);
        }

        public static SvgaEffectExtra parseFrom(InputStream inputStream) throws IOException {
            return (SvgaEffectExtra) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static SvgaEffectExtra parseFrom(InputStream inputStream, C3433h c3433h) throws IOException {
            return (SvgaEffectExtra) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, c3433h);
        }

        public static SvgaEffectExtra parseFrom(C3430e c3430e) throws IOException {
            return (SvgaEffectExtra) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, c3430e);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static SvgaEffectExtra parseFrom(C3430e c3430e, C3433h c3433h) throws IOException {
            return (SvgaEffectExtra) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, c3430e, c3433h);
        }
    }

    public static final class TextDrawer extends GeneratedMessageLite<TextDrawer, Builder> implements TextDrawerOrBuilder {
        public static final int ACTIONAFTERCLICK_FIELD_NUMBER = 5;
        public static final int CONTENT_FIELD_NUMBER = 3;
        private static final TextDrawer DEFAULT_INSTANCE;
        public static final int ICONURL_FIELD_NUMBER = 1;
        public static final int JUMPSCHEME_FIELD_NUMBER = 4;
        private static volatile ng60<TextDrawer> PARSER = null;
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
                this.content_ = TextDrawerContent.newBuilder(this.content_).mergeFrom(textDrawerContent).buildPartial();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeShading(Shading shading) {
            Shading shading2 = this.shading_;
            if (shading2 == null || shading2 == Shading.getDefaultInstance()) {
                this.shading_ = shading;
            } else {
                this.shading_ = Shading.newBuilder(this.shading_).mergeFrom(shading).buildPartial();
            }
        }

        public static Builder newBuilder(TextDrawer textDrawer) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(textDrawer);
        }

        public static TextDrawer parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (TextDrawer) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static TextDrawer parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (TextDrawer) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static ng60<TextDrawer> parser() {
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
            AbstractC3426a.checkByteStringIsUtf8(byteString);
            this.actionAfterClick_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setContent(TextDrawerContent.Builder builder) {
            this.content_ = builder.build();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setIconUrl(String str) {
            str.getClass();
            this.iconUrl_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setIconUrlBytes(ByteString byteString) {
            byteString.getClass();
            AbstractC3426a.checkByteStringIsUtf8(byteString);
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
            AbstractC3426a.checkByteStringIsUtf8(byteString);
            this.jumpScheme_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setShading(Shading.Builder builder) {
            this.shading_ = builder.build();
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (C45881.f16673xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new TextDrawer();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                    return null;
                case 4:
                    return new Builder();
                case 5:
                    GeneratedMessageLite.InterfaceC3409h interfaceC3409h = (GeneratedMessageLite.InterfaceC3409h) obj;
                    TextDrawer textDrawer = (TextDrawer) obj2;
                    this.iconUrl_ = interfaceC3409h.mo17052f(!this.iconUrl_.isEmpty(), this.iconUrl_, !textDrawer.iconUrl_.isEmpty(), textDrawer.iconUrl_);
                    this.shading_ = (Shading) interfaceC3409h.mo17061o(this.shading_, textDrawer.shading_);
                    this.content_ = (TextDrawerContent) interfaceC3409h.mo17061o(this.content_, textDrawer.content_);
                    this.jumpScheme_ = interfaceC3409h.mo17052f(!this.jumpScheme_.isEmpty(), this.jumpScheme_, !textDrawer.jumpScheme_.isEmpty(), textDrawer.jumpScheme_);
                    this.actionAfterClick_ = interfaceC3409h.mo17052f(!this.actionAfterClick_.isEmpty(), this.actionAfterClick_, true ^ textDrawer.actionAfterClick_.isEmpty(), textDrawer.actionAfterClick_);
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
                                    this.iconUrl_ = c3430e.m17170L();
                                } else if (iM17171M == 18) {
                                    Shading shading = this.shading_;
                                    Shading.Builder builder = shading != null ? shading.toBuilder() : null;
                                    Shading shading2 = (Shading) c3430e.m17198w(Shading.parser(), c3433h);
                                    this.shading_ = shading2;
                                    if (builder != null) {
                                        builder.mergeFrom(shading2);
                                        this.shading_ = builder.buildPartial();
                                    }
                                } else if (iM17171M == 26) {
                                    TextDrawerContent textDrawerContent = this.content_;
                                    TextDrawerContent.Builder builder2 = textDrawerContent != null ? textDrawerContent.toBuilder() : null;
                                    TextDrawerContent textDrawerContent2 = (TextDrawerContent) c3430e.m17198w(TextDrawerContent.parser(), c3433h);
                                    this.content_ = textDrawerContent2;
                                    if (builder2 != null) {
                                        builder2.mergeFrom(textDrawerContent2);
                                        this.content_ = builder2.buildPartial();
                                    }
                                } else if (iM17171M == 34) {
                                    this.jumpScheme_ = c3430e.m17170L();
                                } else if (iM17171M == 42) {
                                    this.actionAfterClick_ = c3430e.m17170L();
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
                        synchronized (TextDrawer.class) {
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

        @Override // com.google.protobuf.InterfaceC3442q
        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int iM16956K = !this.iconUrl_.isEmpty() ? CodedOutputStream.m16956K(1, getIconUrl()) : 0;
            if (this.shading_ != null) {
                iM16956K += CodedOutputStream.m16948C(2, getShading());
            }
            if (this.content_ != null) {
                iM16956K += CodedOutputStream.m16948C(3, getContent());
            }
            if (!this.jumpScheme_.isEmpty()) {
                iM16956K += CodedOutputStream.m16956K(4, getJumpScheme());
            }
            if (!this.actionAfterClick_.isEmpty()) {
                iM16956K += CodedOutputStream.m16956K(5, getActionAfterClick());
            }
            this.memoizedSerializedSize = iM16956K;
            return iM16956K;
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

        @Override // com.google.protobuf.InterfaceC3442q
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (!this.iconUrl_.isEmpty()) {
                codedOutputStream.mo16994D0(1, getIconUrl());
            }
            if (this.shading_ != null) {
                codedOutputStream.mo17029w0(2, getShading());
            }
            if (this.content_ != null) {
                codedOutputStream.mo17029w0(3, getContent());
            }
            if (!this.jumpScheme_.isEmpty()) {
                codedOutputStream.mo16994D0(4, getJumpScheme());
            }
            if (this.actionAfterClick_.isEmpty()) {
                return;
            }
            codedOutputStream.mo16994D0(5, getActionAfterClick());
        }

        public static TextDrawer parseDelimitedFrom(InputStream inputStream, C3433h c3433h) throws IOException {
            return (TextDrawer) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, c3433h);
        }

        public static TextDrawer parseFrom(ByteString byteString, C3433h c3433h) throws InvalidProtocolBufferException {
            return (TextDrawer) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, c3433h);
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

        public static final class Builder extends GeneratedMessageLite.AbstractC3403b<TextDrawer, Builder> implements TextDrawerOrBuilder {
            private Builder() {
                super(TextDrawer.DEFAULT_INSTANCE);
            }

            public Builder clearActionAfterClick() {
                copyOnWrite();
                ((TextDrawer) this.instance).clearActionAfterClick();
                return this;
            }

            public Builder clearContent() {
                copyOnWrite();
                ((TextDrawer) this.instance).clearContent();
                return this;
            }

            public Builder clearIconUrl() {
                copyOnWrite();
                ((TextDrawer) this.instance).clearIconUrl();
                return this;
            }

            public Builder clearJumpScheme() {
                copyOnWrite();
                ((TextDrawer) this.instance).clearJumpScheme();
                return this;
            }

            public Builder clearShading() {
                copyOnWrite();
                ((TextDrawer) this.instance).clearShading();
                return this;
            }

            @Override // com.p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage.TextDrawerOrBuilder
            public String getActionAfterClick() {
                return ((TextDrawer) this.instance).getActionAfterClick();
            }

            @Override // com.p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage.TextDrawerOrBuilder
            public ByteString getActionAfterClickBytes() {
                return ((TextDrawer) this.instance).getActionAfterClickBytes();
            }

            @Override // com.p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage.TextDrawerOrBuilder
            public TextDrawerContent getContent() {
                return ((TextDrawer) this.instance).getContent();
            }

            @Override // com.p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage.TextDrawerOrBuilder
            public String getIconUrl() {
                return ((TextDrawer) this.instance).getIconUrl();
            }

            @Override // com.p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage.TextDrawerOrBuilder
            public ByteString getIconUrlBytes() {
                return ((TextDrawer) this.instance).getIconUrlBytes();
            }

            @Override // com.p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage.TextDrawerOrBuilder
            public String getJumpScheme() {
                return ((TextDrawer) this.instance).getJumpScheme();
            }

            @Override // com.p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage.TextDrawerOrBuilder
            public ByteString getJumpSchemeBytes() {
                return ((TextDrawer) this.instance).getJumpSchemeBytes();
            }

            @Override // com.p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage.TextDrawerOrBuilder
            public Shading getShading() {
                return ((TextDrawer) this.instance).getShading();
            }

            @Override // com.p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage.TextDrawerOrBuilder
            public boolean hasContent() {
                return ((TextDrawer) this.instance).hasContent();
            }

            @Override // com.p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage.TextDrawerOrBuilder
            public boolean hasShading() {
                return ((TextDrawer) this.instance).hasShading();
            }

            public Builder mergeContent(TextDrawerContent textDrawerContent) {
                copyOnWrite();
                ((TextDrawer) this.instance).mergeContent(textDrawerContent);
                return this;
            }

            public Builder mergeShading(Shading shading) {
                copyOnWrite();
                ((TextDrawer) this.instance).mergeShading(shading);
                return this;
            }

            public Builder setActionAfterClick(String str) {
                copyOnWrite();
                ((TextDrawer) this.instance).setActionAfterClick(str);
                return this;
            }

            public Builder setActionAfterClickBytes(ByteString byteString) {
                copyOnWrite();
                ((TextDrawer) this.instance).setActionAfterClickBytes(byteString);
                return this;
            }

            public Builder setContent(TextDrawerContent textDrawerContent) {
                copyOnWrite();
                ((TextDrawer) this.instance).setContent(textDrawerContent);
                return this;
            }

            public Builder setIconUrl(String str) {
                copyOnWrite();
                ((TextDrawer) this.instance).setIconUrl(str);
                return this;
            }

            public Builder setIconUrlBytes(ByteString byteString) {
                copyOnWrite();
                ((TextDrawer) this.instance).setIconUrlBytes(byteString);
                return this;
            }

            public Builder setJumpScheme(String str) {
                copyOnWrite();
                ((TextDrawer) this.instance).setJumpScheme(str);
                return this;
            }

            public Builder setJumpSchemeBytes(ByteString byteString) {
                copyOnWrite();
                ((TextDrawer) this.instance).setJumpSchemeBytes(byteString);
                return this;
            }

            public Builder setShading(Shading shading) {
                copyOnWrite();
                ((TextDrawer) this.instance).setShading(shading);
                return this;
            }

            public Builder setContent(TextDrawerContent.Builder builder) {
                copyOnWrite();
                ((TextDrawer) this.instance).setContent(builder);
                return this;
            }

            public Builder setShading(Shading.Builder builder) {
                copyOnWrite();
                ((TextDrawer) this.instance).setShading(builder);
                return this;
            }
        }

        public static TextDrawer parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (TextDrawer) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static TextDrawer parseFrom(byte[] bArr, C3433h c3433h) throws InvalidProtocolBufferException {
            return (TextDrawer) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, c3433h);
        }

        public static TextDrawer parseFrom(InputStream inputStream) throws IOException {
            return (TextDrawer) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static TextDrawer parseFrom(InputStream inputStream, C3433h c3433h) throws IOException {
            return (TextDrawer) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, c3433h);
        }

        public static TextDrawer parseFrom(C3430e c3430e) throws IOException {
            return (TextDrawer) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, c3430e);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static TextDrawer parseFrom(C3430e c3430e, C3433h c3433h) throws IOException {
            return (TextDrawer) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, c3430e, c3433h);
        }
    }

    public static final class TextDrawerContent extends GeneratedMessageLite<TextDrawerContent, Builder> implements TextDrawerContentOrBuilder {
        private static final TextDrawerContent DEFAULT_INSTANCE;
        public static final int HIERARCHY_FIELD_NUMBER = 3;
        private static volatile ng60<TextDrawerContent> PARSER = null;
        public static final int TEMPLATEFIELDS_FIELD_NUMBER = 2;
        public static final int TEMPLATEID_FIELD_NUMBER = 1;
        private int bitField0_;
        private OperationHierarchy hierarchy_;
        private C3437l.h<String> templateFields_ = GeneratedMessageLite.emptyProtobufList();
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
            AbstractC3426a.addAll(iterable, this.templateFields_);
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
            AbstractC3426a.checkByteStringIsUtf8(byteString);
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
            if (this.templateFields_.mo17140q()) {
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
                this.hierarchy_ = OperationHierarchy.newBuilder(this.hierarchy_).mergeFrom(operationHierarchy).buildPartial();
            }
        }

        public static Builder newBuilder(TextDrawerContent textDrawerContent) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(textDrawerContent);
        }

        public static TextDrawerContent parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (TextDrawerContent) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static TextDrawerContent parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (TextDrawerContent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static ng60<TextDrawerContent> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setHierarchy(OperationHierarchy.Builder builder) {
            this.hierarchy_ = builder.build();
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

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            boolean z = false;
            switch (C45881.f16673xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new TextDrawerContent();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                    this.templateFields_.mo17139n();
                    return null;
                case 4:
                    return new Builder();
                case 5:
                    GeneratedMessageLite.InterfaceC3409h interfaceC3409h = (GeneratedMessageLite.InterfaceC3409h) obj;
                    TextDrawerContent textDrawerContent = (TextDrawerContent) obj2;
                    long j = this.templateId_;
                    boolean z2 = j != 0;
                    long j2 = textDrawerContent.templateId_;
                    this.templateId_ = interfaceC3409h.mo17055i(z2, j, j2 != 0, j2);
                    this.templateFields_ = interfaceC3409h.mo17053g(this.templateFields_, textDrawerContent.templateFields_);
                    this.hierarchy_ = (OperationHierarchy) interfaceC3409h.mo17061o(this.hierarchy_, textDrawerContent.hierarchy_);
                    if (interfaceC3409h == GeneratedMessageLite.C3408g.INSTANCE) {
                        this.bitField0_ |= textDrawerContent.bitField0_;
                    }
                    return this;
                case 6:
                    C3430e c3430e = (C3430e) obj;
                    C3433h c3433h = (C3433h) obj2;
                    while (!z) {
                        try {
                            int iM17171M = c3430e.m17171M();
                            if (iM17171M != 0) {
                                if (iM17171M == 8) {
                                    this.templateId_ = c3430e.m17197v();
                                } else if (iM17171M == 18) {
                                    String strM17170L = c3430e.m17170L();
                                    if (!this.templateFields_.mo17140q()) {
                                        this.templateFields_ = GeneratedMessageLite.mutableCopy(this.templateFields_);
                                    }
                                    this.templateFields_.add(strM17170L);
                                } else if (iM17171M == 26) {
                                    OperationHierarchy operationHierarchy = this.hierarchy_;
                                    OperationHierarchy.Builder builder = operationHierarchy != null ? operationHierarchy.toBuilder() : null;
                                    OperationHierarchy operationHierarchy2 = (OperationHierarchy) c3430e.m17198w(OperationHierarchy.parser(), c3433h);
                                    this.hierarchy_ = operationHierarchy2;
                                    if (builder != null) {
                                        builder.mergeFrom(operationHierarchy2);
                                        this.hierarchy_ = builder.buildPartial();
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
                        synchronized (TextDrawerContent.class) {
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

        @Override // com.p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage.TextDrawerContentOrBuilder
        public OperationHierarchy getHierarchy() {
            OperationHierarchy operationHierarchy = this.hierarchy_;
            return operationHierarchy == null ? OperationHierarchy.getDefaultInstance() : operationHierarchy;
        }

        @Override // com.google.protobuf.InterfaceC3442q
        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            long j = this.templateId_;
            int iM16986v = j != 0 ? CodedOutputStream.m16986v(1, j) : 0;
            int iM16957L = 0;
            for (int i2 = 0; i2 < this.templateFields_.size(); i2++) {
                iM16957L += CodedOutputStream.m16957L(this.templateFields_.get(i2));
            }
            int size = iM16986v + iM16957L + getTemplateFieldsList().size();
            if (this.hierarchy_ != null) {
                size += CodedOutputStream.m16948C(3, getHierarchy());
            }
            this.memoizedSerializedSize = size;
            return size;
        }

        @Override // com.p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage.TextDrawerContentOrBuilder
        public String getTemplateFields(int i) {
            return this.templateFields_.get(i);
        }

        @Override // com.p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage.TextDrawerContentOrBuilder
        public ByteString getTemplateFieldsBytes(int i) {
            return ByteString.copyFromUtf8(this.templateFields_.get(i));
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

        @Override // com.google.protobuf.InterfaceC3442q
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            long j = this.templateId_;
            if (j != 0) {
                codedOutputStream.m17027u0(1, j);
            }
            for (int i = 0; i < this.templateFields_.size(); i++) {
                codedOutputStream.mo16994D0(2, this.templateFields_.get(i));
            }
            if (this.hierarchy_ != null) {
                codedOutputStream.mo17029w0(3, getHierarchy());
            }
        }

        public static TextDrawerContent parseDelimitedFrom(InputStream inputStream, C3433h c3433h) throws IOException {
            return (TextDrawerContent) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, c3433h);
        }

        public static TextDrawerContent parseFrom(ByteString byteString, C3433h c3433h) throws InvalidProtocolBufferException {
            return (TextDrawerContent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, c3433h);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setHierarchy(OperationHierarchy operationHierarchy) {
            operationHierarchy.getClass();
            this.hierarchy_ = operationHierarchy;
        }

        public static final class Builder extends GeneratedMessageLite.AbstractC3403b<TextDrawerContent, Builder> implements TextDrawerContentOrBuilder {
            private Builder() {
                super(TextDrawerContent.DEFAULT_INSTANCE);
            }

            public Builder addAllTemplateFields(Iterable<String> iterable) {
                copyOnWrite();
                ((TextDrawerContent) this.instance).addAllTemplateFields(iterable);
                return this;
            }

            public Builder addTemplateFields(String str) {
                copyOnWrite();
                ((TextDrawerContent) this.instance).addTemplateFields(str);
                return this;
            }

            public Builder addTemplateFieldsBytes(ByteString byteString) {
                copyOnWrite();
                ((TextDrawerContent) this.instance).addTemplateFieldsBytes(byteString);
                return this;
            }

            public Builder clearHierarchy() {
                copyOnWrite();
                ((TextDrawerContent) this.instance).clearHierarchy();
                return this;
            }

            public Builder clearTemplateFields() {
                copyOnWrite();
                ((TextDrawerContent) this.instance).clearTemplateFields();
                return this;
            }

            public Builder clearTemplateId() {
                copyOnWrite();
                ((TextDrawerContent) this.instance).clearTemplateId();
                return this;
            }

            @Override // com.p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage.TextDrawerContentOrBuilder
            public OperationHierarchy getHierarchy() {
                return ((TextDrawerContent) this.instance).getHierarchy();
            }

            @Override // com.p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage.TextDrawerContentOrBuilder
            public String getTemplateFields(int i) {
                return ((TextDrawerContent) this.instance).getTemplateFields(i);
            }

            @Override // com.p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage.TextDrawerContentOrBuilder
            public ByteString getTemplateFieldsBytes(int i) {
                return ((TextDrawerContent) this.instance).getTemplateFieldsBytes(i);
            }

            @Override // com.p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage.TextDrawerContentOrBuilder
            public int getTemplateFieldsCount() {
                return ((TextDrawerContent) this.instance).getTemplateFieldsCount();
            }

            @Override // com.p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage.TextDrawerContentOrBuilder
            public List<String> getTemplateFieldsList() {
                return Collections.unmodifiableList(((TextDrawerContent) this.instance).getTemplateFieldsList());
            }

            @Override // com.p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage.TextDrawerContentOrBuilder
            public long getTemplateId() {
                return ((TextDrawerContent) this.instance).getTemplateId();
            }

            @Override // com.p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage.TextDrawerContentOrBuilder
            public boolean hasHierarchy() {
                return ((TextDrawerContent) this.instance).hasHierarchy();
            }

            public Builder mergeHierarchy(OperationHierarchy operationHierarchy) {
                copyOnWrite();
                ((TextDrawerContent) this.instance).mergeHierarchy(operationHierarchy);
                return this;
            }

            public Builder setHierarchy(OperationHierarchy operationHierarchy) {
                copyOnWrite();
                ((TextDrawerContent) this.instance).setHierarchy(operationHierarchy);
                return this;
            }

            public Builder setTemplateFields(int i, String str) {
                copyOnWrite();
                ((TextDrawerContent) this.instance).setTemplateFields(i, str);
                return this;
            }

            public Builder setTemplateId(long j) {
                copyOnWrite();
                ((TextDrawerContent) this.instance).setTemplateId(j);
                return this;
            }

            public Builder setHierarchy(OperationHierarchy.Builder builder) {
                copyOnWrite();
                ((TextDrawerContent) this.instance).setHierarchy(builder);
                return this;
            }
        }

        public static TextDrawerContent parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (TextDrawerContent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static TextDrawerContent parseFrom(byte[] bArr, C3433h c3433h) throws InvalidProtocolBufferException {
            return (TextDrawerContent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, c3433h);
        }

        public static TextDrawerContent parseFrom(InputStream inputStream) throws IOException {
            return (TextDrawerContent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static TextDrawerContent parseFrom(InputStream inputStream, C3433h c3433h) throws IOException {
            return (TextDrawerContent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, c3433h);
        }

        public static TextDrawerContent parseFrom(C3430e c3430e) throws IOException {
            return (TextDrawerContent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, c3430e);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static TextDrawerContent parseFrom(C3430e c3430e, C3433h c3433h) throws IOException {
            return (TextDrawerContent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, c3430e, c3433h);
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
        private static volatile ng60<TopEffect> PARSER = null;
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

        public static final class Builder extends GeneratedMessageLite.AbstractC3403b<TopEffect, Builder> implements TopEffectOrBuilder {
            private Builder() {
                super(TopEffect.DEFAULT_INSTANCE);
            }

            public Builder clearAvatarUrl() {
                copyOnWrite();
                ((TopEffect) this.instance).clearAvatarUrl();
                return this;
            }

            public Builder clearBackgroundSVGAUrl() {
                copyOnWrite();
                ((TopEffect) this.instance).clearBackgroundSVGAUrl();
                return this;
            }

            public Builder clearBackgroundUrl() {
                copyOnWrite();
                ((TopEffect) this.instance).clearBackgroundUrl();
                return this;
            }

            public Builder clearContent() {
                copyOnWrite();
                ((TopEffect) this.instance).clearContent();
                return this;
            }

            public Builder clearDuration() {
                copyOnWrite();
                ((TopEffect) this.instance).clearDuration();
                return this;
            }

            public Builder clearEffectBackgroundUrl() {
                copyOnWrite();
                ((TopEffect) this.instance).clearEffectBackgroundUrl();
                return this;
            }

            public Builder clearEndBackendColor() {
                copyOnWrite();
                ((TopEffect) this.instance).clearEndBackendColor();
                return this;
            }

            public Builder clearRoomId() {
                copyOnWrite();
                ((TopEffect) this.instance).clearRoomId();
                return this;
            }

            public Builder clearStartBackendColor() {
                copyOnWrite();
                ((TopEffect) this.instance).clearStartBackendColor();
                return this;
            }

            public Builder clearSubtitleColor() {
                copyOnWrite();
                ((TopEffect) this.instance).clearSubtitleColor();
                return this;
            }

            public Builder clearUserName() {
                copyOnWrite();
                ((TopEffect) this.instance).clearUserName();
                return this;
            }

            @Override // com.p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage.TopEffectOrBuilder
            public String getAvatarUrl() {
                return ((TopEffect) this.instance).getAvatarUrl();
            }

            @Override // com.p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage.TopEffectOrBuilder
            public ByteString getAvatarUrlBytes() {
                return ((TopEffect) this.instance).getAvatarUrlBytes();
            }

            @Override // com.p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage.TopEffectOrBuilder
            public String getBackgroundSVGAUrl() {
                return ((TopEffect) this.instance).getBackgroundSVGAUrl();
            }

            @Override // com.p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage.TopEffectOrBuilder
            public ByteString getBackgroundSVGAUrlBytes() {
                return ((TopEffect) this.instance).getBackgroundSVGAUrlBytes();
            }

            @Override // com.p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage.TopEffectOrBuilder
            public String getBackgroundUrl() {
                return ((TopEffect) this.instance).getBackgroundUrl();
            }

            @Override // com.p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage.TopEffectOrBuilder
            public ByteString getBackgroundUrlBytes() {
                return ((TopEffect) this.instance).getBackgroundUrlBytes();
            }

            @Override // com.p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage.TopEffectOrBuilder
            public String getContent() {
                return ((TopEffect) this.instance).getContent();
            }

            @Override // com.p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage.TopEffectOrBuilder
            public ByteString getContentBytes() {
                return ((TopEffect) this.instance).getContentBytes();
            }

            @Override // com.p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage.TopEffectOrBuilder
            public long getDuration() {
                return ((TopEffect) this.instance).getDuration();
            }

            @Override // com.p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage.TopEffectOrBuilder
            public String getEffectBackgroundUrl() {
                return ((TopEffect) this.instance).getEffectBackgroundUrl();
            }

            @Override // com.p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage.TopEffectOrBuilder
            public ByteString getEffectBackgroundUrlBytes() {
                return ((TopEffect) this.instance).getEffectBackgroundUrlBytes();
            }

            @Override // com.p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage.TopEffectOrBuilder
            public String getEndBackendColor() {
                return ((TopEffect) this.instance).getEndBackendColor();
            }

            @Override // com.p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage.TopEffectOrBuilder
            public ByteString getEndBackendColorBytes() {
                return ((TopEffect) this.instance).getEndBackendColorBytes();
            }

            @Override // com.p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage.TopEffectOrBuilder
            public String getRoomId() {
                return ((TopEffect) this.instance).getRoomId();
            }

            @Override // com.p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage.TopEffectOrBuilder
            public ByteString getRoomIdBytes() {
                return ((TopEffect) this.instance).getRoomIdBytes();
            }

            @Override // com.p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage.TopEffectOrBuilder
            public String getStartBackendColor() {
                return ((TopEffect) this.instance).getStartBackendColor();
            }

            @Override // com.p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage.TopEffectOrBuilder
            public ByteString getStartBackendColorBytes() {
                return ((TopEffect) this.instance).getStartBackendColorBytes();
            }

            @Override // com.p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage.TopEffectOrBuilder
            public String getSubtitleColor() {
                return ((TopEffect) this.instance).getSubtitleColor();
            }

            @Override // com.p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage.TopEffectOrBuilder
            public ByteString getSubtitleColorBytes() {
                return ((TopEffect) this.instance).getSubtitleColorBytes();
            }

            @Override // com.p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage.TopEffectOrBuilder
            public String getUserName() {
                return ((TopEffect) this.instance).getUserName();
            }

            @Override // com.p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage.TopEffectOrBuilder
            public ByteString getUserNameBytes() {
                return ((TopEffect) this.instance).getUserNameBytes();
            }

            public Builder setAvatarUrl(String str) {
                copyOnWrite();
                ((TopEffect) this.instance).setAvatarUrl(str);
                return this;
            }

            public Builder setAvatarUrlBytes(ByteString byteString) {
                copyOnWrite();
                ((TopEffect) this.instance).setAvatarUrlBytes(byteString);
                return this;
            }

            public Builder setBackgroundSVGAUrl(String str) {
                copyOnWrite();
                ((TopEffect) this.instance).setBackgroundSVGAUrl(str);
                return this;
            }

            public Builder setBackgroundSVGAUrlBytes(ByteString byteString) {
                copyOnWrite();
                ((TopEffect) this.instance).setBackgroundSVGAUrlBytes(byteString);
                return this;
            }

            public Builder setBackgroundUrl(String str) {
                copyOnWrite();
                ((TopEffect) this.instance).setBackgroundUrl(str);
                return this;
            }

            public Builder setBackgroundUrlBytes(ByteString byteString) {
                copyOnWrite();
                ((TopEffect) this.instance).setBackgroundUrlBytes(byteString);
                return this;
            }

            public Builder setContent(String str) {
                copyOnWrite();
                ((TopEffect) this.instance).setContent(str);
                return this;
            }

            public Builder setContentBytes(ByteString byteString) {
                copyOnWrite();
                ((TopEffect) this.instance).setContentBytes(byteString);
                return this;
            }

            public Builder setDuration(long j) {
                copyOnWrite();
                ((TopEffect) this.instance).setDuration(j);
                return this;
            }

            public Builder setEffectBackgroundUrl(String str) {
                copyOnWrite();
                ((TopEffect) this.instance).setEffectBackgroundUrl(str);
                return this;
            }

            public Builder setEffectBackgroundUrlBytes(ByteString byteString) {
                copyOnWrite();
                ((TopEffect) this.instance).setEffectBackgroundUrlBytes(byteString);
                return this;
            }

            public Builder setEndBackendColor(String str) {
                copyOnWrite();
                ((TopEffect) this.instance).setEndBackendColor(str);
                return this;
            }

            public Builder setEndBackendColorBytes(ByteString byteString) {
                copyOnWrite();
                ((TopEffect) this.instance).setEndBackendColorBytes(byteString);
                return this;
            }

            public Builder setRoomId(String str) {
                copyOnWrite();
                ((TopEffect) this.instance).setRoomId(str);
                return this;
            }

            public Builder setRoomIdBytes(ByteString byteString) {
                copyOnWrite();
                ((TopEffect) this.instance).setRoomIdBytes(byteString);
                return this;
            }

            public Builder setStartBackendColor(String str) {
                copyOnWrite();
                ((TopEffect) this.instance).setStartBackendColor(str);
                return this;
            }

            public Builder setStartBackendColorBytes(ByteString byteString) {
                copyOnWrite();
                ((TopEffect) this.instance).setStartBackendColorBytes(byteString);
                return this;
            }

            public Builder setSubtitleColor(String str) {
                copyOnWrite();
                ((TopEffect) this.instance).setSubtitleColor(str);
                return this;
            }

            public Builder setSubtitleColorBytes(ByteString byteString) {
                copyOnWrite();
                ((TopEffect) this.instance).setSubtitleColorBytes(byteString);
                return this;
            }

            public Builder setUserName(String str) {
                copyOnWrite();
                ((TopEffect) this.instance).setUserName(str);
                return this;
            }

            public Builder setUserNameBytes(ByteString byteString) {
                copyOnWrite();
                ((TopEffect) this.instance).setUserNameBytes(byteString);
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
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(topEffect);
        }

        public static TopEffect parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (TopEffect) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static TopEffect parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (TopEffect) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static ng60<TopEffect> parser() {
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
            AbstractC3426a.checkByteStringIsUtf8(byteString);
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
            AbstractC3426a.checkByteStringIsUtf8(byteString);
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
            AbstractC3426a.checkByteStringIsUtf8(byteString);
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
            AbstractC3426a.checkByteStringIsUtf8(byteString);
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
            AbstractC3426a.checkByteStringIsUtf8(byteString);
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
            AbstractC3426a.checkByteStringIsUtf8(byteString);
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
            AbstractC3426a.checkByteStringIsUtf8(byteString);
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
            AbstractC3426a.checkByteStringIsUtf8(byteString);
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
            AbstractC3426a.checkByteStringIsUtf8(byteString);
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
            AbstractC3426a.checkByteStringIsUtf8(byteString);
            this.userName_ = byteString.toStringUtf8();
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            boolean z = false;
            switch (C45881.f16673xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new TopEffect();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                    return null;
                case 4:
                    return new Builder();
                case 5:
                    GeneratedMessageLite.InterfaceC3409h interfaceC3409h = (GeneratedMessageLite.InterfaceC3409h) obj;
                    TopEffect topEffect = (TopEffect) obj2;
                    this.userName_ = interfaceC3409h.mo17052f(!this.userName_.isEmpty(), this.userName_, !topEffect.userName_.isEmpty(), topEffect.userName_);
                    this.avatarUrl_ = interfaceC3409h.mo17052f(!this.avatarUrl_.isEmpty(), this.avatarUrl_, !topEffect.avatarUrl_.isEmpty(), topEffect.avatarUrl_);
                    this.content_ = interfaceC3409h.mo17052f(!this.content_.isEmpty(), this.content_, !topEffect.content_.isEmpty(), topEffect.content_);
                    this.startBackendColor_ = interfaceC3409h.mo17052f(!this.startBackendColor_.isEmpty(), this.startBackendColor_, !topEffect.startBackendColor_.isEmpty(), topEffect.startBackendColor_);
                    this.endBackendColor_ = interfaceC3409h.mo17052f(!this.endBackendColor_.isEmpty(), this.endBackendColor_, !topEffect.endBackendColor_.isEmpty(), topEffect.endBackendColor_);
                    long j = this.duration_;
                    boolean z2 = j != 0;
                    long j2 = topEffect.duration_;
                    this.duration_ = interfaceC3409h.mo17055i(z2, j, j2 != 0, j2);
                    this.roomId_ = interfaceC3409h.mo17052f(!this.roomId_.isEmpty(), this.roomId_, !topEffect.roomId_.isEmpty(), topEffect.roomId_);
                    this.backgroundUrl_ = interfaceC3409h.mo17052f(!this.backgroundUrl_.isEmpty(), this.backgroundUrl_, !topEffect.backgroundUrl_.isEmpty(), topEffect.backgroundUrl_);
                    this.backgroundSVGAUrl_ = interfaceC3409h.mo17052f(!this.backgroundSVGAUrl_.isEmpty(), this.backgroundSVGAUrl_, !topEffect.backgroundSVGAUrl_.isEmpty(), topEffect.backgroundSVGAUrl_);
                    this.effectBackgroundUrl_ = interfaceC3409h.mo17052f(!this.effectBackgroundUrl_.isEmpty(), this.effectBackgroundUrl_, !topEffect.effectBackgroundUrl_.isEmpty(), topEffect.effectBackgroundUrl_);
                    this.subtitleColor_ = interfaceC3409h.mo17052f(!this.subtitleColor_.isEmpty(), this.subtitleColor_, !topEffect.subtitleColor_.isEmpty(), topEffect.subtitleColor_);
                    GeneratedMessageLite.C3408g c3408g = GeneratedMessageLite.C3408g.INSTANCE;
                    return this;
                case 6:
                    C3430e c3430e = (C3430e) obj;
                    while (!z) {
                        try {
                            int iM17171M = c3430e.m17171M();
                            switch (iM17171M) {
                                case 0:
                                    break;
                                case 10:
                                    this.userName_ = c3430e.m17170L();
                                    continue;
                                case 18:
                                    this.avatarUrl_ = c3430e.m17170L();
                                    continue;
                                case 26:
                                    this.content_ = c3430e.m17170L();
                                    continue;
                                case 34:
                                    this.startBackendColor_ = c3430e.m17170L();
                                    continue;
                                case 42:
                                    this.endBackendColor_ = c3430e.m17170L();
                                    continue;
                                case 48:
                                    this.duration_ = c3430e.m17197v();
                                    continue;
                                case 58:
                                    this.roomId_ = c3430e.m17170L();
                                    continue;
                                case 66:
                                    this.backgroundUrl_ = c3430e.m17170L();
                                    continue;
                                case 74:
                                    this.backgroundSVGAUrl_ = c3430e.m17170L();
                                    continue;
                                case EACTags.COMMAND_TO_PERFORM /* 82 */:
                                    this.effectBackgroundUrl_ = c3430e.m17170L();
                                    continue;
                                case 90:
                                    this.subtitleColor_ = c3430e.m17170L();
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
                        synchronized (TopEffect.class) {
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

        @Override // com.google.protobuf.InterfaceC3442q
        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int iM16956K = !this.userName_.isEmpty() ? CodedOutputStream.m16956K(1, getUserName()) : 0;
            if (!this.avatarUrl_.isEmpty()) {
                iM16956K += CodedOutputStream.m16956K(2, getAvatarUrl());
            }
            if (!this.content_.isEmpty()) {
                iM16956K += CodedOutputStream.m16956K(3, getContent());
            }
            if (!this.startBackendColor_.isEmpty()) {
                iM16956K += CodedOutputStream.m16956K(4, getStartBackendColor());
            }
            if (!this.endBackendColor_.isEmpty()) {
                iM16956K += CodedOutputStream.m16956K(5, getEndBackendColor());
            }
            long j = this.duration_;
            if (j != 0) {
                iM16956K += CodedOutputStream.m16986v(6, j);
            }
            if (!this.roomId_.isEmpty()) {
                iM16956K += CodedOutputStream.m16956K(7, getRoomId());
            }
            if (!this.backgroundUrl_.isEmpty()) {
                iM16956K += CodedOutputStream.m16956K(8, getBackgroundUrl());
            }
            if (!this.backgroundSVGAUrl_.isEmpty()) {
                iM16956K += CodedOutputStream.m16956K(9, getBackgroundSVGAUrl());
            }
            if (!this.effectBackgroundUrl_.isEmpty()) {
                iM16956K += CodedOutputStream.m16956K(10, getEffectBackgroundUrl());
            }
            if (!this.subtitleColor_.isEmpty()) {
                iM16956K += CodedOutputStream.m16956K(11, getSubtitleColor());
            }
            this.memoizedSerializedSize = iM16956K;
            return iM16956K;
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

        @Override // com.google.protobuf.InterfaceC3442q
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (!this.userName_.isEmpty()) {
                codedOutputStream.mo16994D0(1, getUserName());
            }
            if (!this.avatarUrl_.isEmpty()) {
                codedOutputStream.mo16994D0(2, getAvatarUrl());
            }
            if (!this.content_.isEmpty()) {
                codedOutputStream.mo16994D0(3, getContent());
            }
            if (!this.startBackendColor_.isEmpty()) {
                codedOutputStream.mo16994D0(4, getStartBackendColor());
            }
            if (!this.endBackendColor_.isEmpty()) {
                codedOutputStream.mo16994D0(5, getEndBackendColor());
            }
            long j = this.duration_;
            if (j != 0) {
                codedOutputStream.m17027u0(6, j);
            }
            if (!this.roomId_.isEmpty()) {
                codedOutputStream.mo16994D0(7, getRoomId());
            }
            if (!this.backgroundUrl_.isEmpty()) {
                codedOutputStream.mo16994D0(8, getBackgroundUrl());
            }
            if (!this.backgroundSVGAUrl_.isEmpty()) {
                codedOutputStream.mo16994D0(9, getBackgroundSVGAUrl());
            }
            if (!this.effectBackgroundUrl_.isEmpty()) {
                codedOutputStream.mo16994D0(10, getEffectBackgroundUrl());
            }
            if (this.subtitleColor_.isEmpty()) {
                return;
            }
            codedOutputStream.mo16994D0(11, getSubtitleColor());
        }

        public static TopEffect parseDelimitedFrom(InputStream inputStream, C3433h c3433h) throws IOException {
            return (TopEffect) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, c3433h);
        }

        public static TopEffect parseFrom(ByteString byteString, C3433h c3433h) throws InvalidProtocolBufferException {
            return (TopEffect) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, c3433h);
        }

        public static TopEffect parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (TopEffect) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static TopEffect parseFrom(byte[] bArr, C3433h c3433h) throws InvalidProtocolBufferException {
            return (TopEffect) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, c3433h);
        }

        public static TopEffect parseFrom(InputStream inputStream) throws IOException {
            return (TopEffect) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static TopEffect parseFrom(InputStream inputStream, C3433h c3433h) throws IOException {
            return (TopEffect) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, c3433h);
        }

        public static TopEffect parseFrom(C3430e c3430e) throws IOException {
            return (TopEffect) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, c3430e);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static TopEffect parseFrom(C3430e c3430e, C3433h c3433h) throws IOException {
            return (TopEffect) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, c3430e, c3433h);
        }
    }

    public static final class VideoEffectExtra extends GeneratedMessageLite<VideoEffectExtra, Builder> implements VideoEffectExtraOrBuilder {
        private static final VideoEffectExtra DEFAULT_INSTANCE;
        public static final int ID_FIELD_NUMBER = 1;
        private static volatile ng60<VideoEffectExtra> PARSER = null;
        public static final int TYPE_FIELD_NUMBER = 2;
        public static final int VALUE_FIELD_NUMBER = 3;
        private long type_;
        private String id_ = "";
        private String value_ = "";

        public static final class Builder extends GeneratedMessageLite.AbstractC3403b<VideoEffectExtra, Builder> implements VideoEffectExtraOrBuilder {
            private Builder() {
                super(VideoEffectExtra.DEFAULT_INSTANCE);
            }

            public Builder clearId() {
                copyOnWrite();
                ((VideoEffectExtra) this.instance).clearId();
                return this;
            }

            public Builder clearType() {
                copyOnWrite();
                ((VideoEffectExtra) this.instance).clearType();
                return this;
            }

            public Builder clearValue() {
                copyOnWrite();
                ((VideoEffectExtra) this.instance).clearValue();
                return this;
            }

            @Override // com.p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage.VideoEffectExtraOrBuilder
            public String getId() {
                return ((VideoEffectExtra) this.instance).getId();
            }

            @Override // com.p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage.VideoEffectExtraOrBuilder
            public ByteString getIdBytes() {
                return ((VideoEffectExtra) this.instance).getIdBytes();
            }

            @Override // com.p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage.VideoEffectExtraOrBuilder
            public long getType() {
                return ((VideoEffectExtra) this.instance).getType();
            }

            @Override // com.p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage.VideoEffectExtraOrBuilder
            public String getValue() {
                return ((VideoEffectExtra) this.instance).getValue();
            }

            @Override // com.p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage.VideoEffectExtraOrBuilder
            public ByteString getValueBytes() {
                return ((VideoEffectExtra) this.instance).getValueBytes();
            }

            public Builder setId(String str) {
                copyOnWrite();
                ((VideoEffectExtra) this.instance).setId(str);
                return this;
            }

            public Builder setIdBytes(ByteString byteString) {
                copyOnWrite();
                ((VideoEffectExtra) this.instance).setIdBytes(byteString);
                return this;
            }

            public Builder setType(long j) {
                copyOnWrite();
                ((VideoEffectExtra) this.instance).setType(j);
                return this;
            }

            public Builder setValue(String str) {
                copyOnWrite();
                ((VideoEffectExtra) this.instance).setValue(str);
                return this;
            }

            public Builder setValueBytes(ByteString byteString) {
                copyOnWrite();
                ((VideoEffectExtra) this.instance).setValueBytes(byteString);
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
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(videoEffectExtra);
        }

        public static VideoEffectExtra parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (VideoEffectExtra) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static VideoEffectExtra parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (VideoEffectExtra) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static ng60<VideoEffectExtra> parser() {
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
            AbstractC3426a.checkByteStringIsUtf8(byteString);
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
            AbstractC3426a.checkByteStringIsUtf8(byteString);
            this.value_ = byteString.toStringUtf8();
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            boolean z = false;
            switch (C45881.f16673xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new VideoEffectExtra();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                    return null;
                case 4:
                    return new Builder();
                case 5:
                    GeneratedMessageLite.InterfaceC3409h interfaceC3409h = (GeneratedMessageLite.InterfaceC3409h) obj;
                    VideoEffectExtra videoEffectExtra = (VideoEffectExtra) obj2;
                    this.id_ = interfaceC3409h.mo17052f(!this.id_.isEmpty(), this.id_, !videoEffectExtra.id_.isEmpty(), videoEffectExtra.id_);
                    long j = this.type_;
                    boolean z2 = j != 0;
                    long j2 = videoEffectExtra.type_;
                    this.type_ = interfaceC3409h.mo17055i(z2, j, j2 != 0, j2);
                    this.value_ = interfaceC3409h.mo17052f(!this.value_.isEmpty(), this.value_, !videoEffectExtra.value_.isEmpty(), videoEffectExtra.value_);
                    GeneratedMessageLite.C3408g c3408g = GeneratedMessageLite.C3408g.INSTANCE;
                    return this;
                case 6:
                    C3430e c3430e = (C3430e) obj;
                    while (!z) {
                        try {
                            int iM17171M = c3430e.m17171M();
                            if (iM17171M != 0) {
                                if (iM17171M == 10) {
                                    this.id_ = c3430e.m17170L();
                                } else if (iM17171M == 16) {
                                    this.type_ = c3430e.m17197v();
                                } else if (iM17171M == 26) {
                                    this.value_ = c3430e.m17170L();
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
                        synchronized (VideoEffectExtra.class) {
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

        @Override // com.p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage.VideoEffectExtraOrBuilder
        public String getId() {
            return this.id_;
        }

        @Override // com.p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage.VideoEffectExtraOrBuilder
        public ByteString getIdBytes() {
            return ByteString.copyFromUtf8(this.id_);
        }

        @Override // com.google.protobuf.InterfaceC3442q
        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int iM16956K = !this.id_.isEmpty() ? CodedOutputStream.m16956K(1, getId()) : 0;
            long j = this.type_;
            if (j != 0) {
                iM16956K += CodedOutputStream.m16986v(2, j);
            }
            if (!this.value_.isEmpty()) {
                iM16956K += CodedOutputStream.m16956K(3, getValue());
            }
            this.memoizedSerializedSize = iM16956K;
            return iM16956K;
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

        @Override // com.google.protobuf.InterfaceC3442q
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (!this.id_.isEmpty()) {
                codedOutputStream.mo16994D0(1, getId());
            }
            long j = this.type_;
            if (j != 0) {
                codedOutputStream.m17027u0(2, j);
            }
            if (this.value_.isEmpty()) {
                return;
            }
            codedOutputStream.mo16994D0(3, getValue());
        }

        public static VideoEffectExtra parseDelimitedFrom(InputStream inputStream, C3433h c3433h) throws IOException {
            return (VideoEffectExtra) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, c3433h);
        }

        public static VideoEffectExtra parseFrom(ByteString byteString, C3433h c3433h) throws InvalidProtocolBufferException {
            return (VideoEffectExtra) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, c3433h);
        }

        public static VideoEffectExtra parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (VideoEffectExtra) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static VideoEffectExtra parseFrom(byte[] bArr, C3433h c3433h) throws InvalidProtocolBufferException {
            return (VideoEffectExtra) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, c3433h);
        }

        public static VideoEffectExtra parseFrom(InputStream inputStream) throws IOException {
            return (VideoEffectExtra) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static VideoEffectExtra parseFrom(InputStream inputStream, C3433h c3433h) throws IOException {
            return (VideoEffectExtra) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, c3433h);
        }

        public static VideoEffectExtra parseFrom(C3430e c3430e) throws IOException {
            return (VideoEffectExtra) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, c3430e);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static VideoEffectExtra parseFrom(C3430e c3430e, C3433h c3433h) throws IOException {
            return (VideoEffectExtra) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, c3430e, c3433h);
        }
    }
}
