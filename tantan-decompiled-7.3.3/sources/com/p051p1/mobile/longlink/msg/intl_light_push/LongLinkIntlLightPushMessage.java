package com.p051p1.mobile.longlink.msg.intl_light_push;

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
import org.spongycastle.asn1.eac.EACTags;
import p153l.iig0;
import p153l.l710;
import p153l.lfz;
import p153l.ng60;

/* JADX INFO: loaded from: classes8.dex */
public final class LongLinkIntlLightPushMessage {

    /* JADX INFO: renamed from: com.p1.mobile.longlink.msg.intl_light_push.LongLinkIntlLightPushMessage$1 */
    public static /* synthetic */ class C45711 {

        /* JADX INFO: renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f16662xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f16662xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f16662xa1df5c61[GeneratedMessageLite.MethodToInvoke.IS_INITIALIZED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f16662xa1df5c61[GeneratedMessageLite.MethodToInvoke.MAKE_IMMUTABLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f16662xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f16662xa1df5c61[GeneratedMessageLite.MethodToInvoke.VISIT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f16662xa1df5c61[GeneratedMessageLite.MethodToInvoke.MERGE_FROM_STREAM.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f16662xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f16662xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    public interface IntlLightPushInfoOrBuilder extends lfz {
        String getAnchorId();

        ByteString getAnchorIdBytes();

        String getBackgroundEndColor();

        ByteString getBackgroundEndColorBytes();

        String getBackgroundStartColor();

        ByteString getBackgroundStartColorBytes();

        boolean getCloseAuto();

        long getCloseTimeOutMs();

        @Override // p153l.lfz
        /* synthetic */ InterfaceC3442q getDefaultInstanceForType();

        String getIcon();

        ByteString getIconBytes();

        String getIconSchema();

        ByteString getIconSchemaBytes();

        String getLiveId();

        ByteString getLiveIdBytes();

        String getRegion();

        ByteString getRegionBytes();

        String getRoomId();

        ByteString getRoomIdBytes();

        boolean getSvga();

        String getTextFirst();

        ByteString getTextFirstBytes();

        String getTextFirstColor();

        ByteString getTextFirstColorBytes();

        String getTextSchema();

        ByteString getTextSchemaBytes();

        String getTextSecond();

        ByteString getTextSecondBytes();

        String getTextSecondColor();

        ByteString getTextSecondColorBytes();

        @Override // p153l.lfz
        /* synthetic */ boolean isInitialized();
    }

    public interface RefreshGiftTabBalanceMsgOrBuilder extends lfz {
        @Override // p153l.lfz
        /* synthetic */ InterfaceC3442q getDefaultInstanceForType();

        String getPriceType();

        ByteString getPriceTypeBytes();

        String getUserId();

        ByteString getUserIdBytes();

        @Override // p153l.lfz
        /* synthetic */ boolean isInitialized();
    }

    public interface RefreshVoiceOperationMsgOrBuilder extends lfz {
        @Override // p153l.lfz
        /* synthetic */ InterfaceC3442q getDefaultInstanceForType();

        @Override // p153l.lfz
        /* synthetic */ boolean isInitialized();
    }

    private LongLinkIntlLightPushMessage() {
    }

    public static void registerAllExtensions(C3433h c3433h) {
    }

    public static final class IntlLightPushInfo extends GeneratedMessageLite<IntlLightPushInfo, Builder> implements IntlLightPushInfoOrBuilder {
        public static final int ANCHORID_FIELD_NUMBER = 3;
        public static final int BACKGROUNDENDCOLOR_FIELD_NUMBER = 13;
        public static final int BACKGROUNDSTARTCOLOR_FIELD_NUMBER = 12;
        public static final int CLOSEAUTO_FIELD_NUMBER = 14;
        public static final int CLOSETIMEOUTMS_FIELD_NUMBER = 15;
        private static final IntlLightPushInfo DEFAULT_INSTANCE;
        public static final int ICONSCHEMA_FIELD_NUMBER = 6;
        public static final int ICON_FIELD_NUMBER = 5;
        public static final int LIVEID_FIELD_NUMBER = 2;
        private static volatile ng60<IntlLightPushInfo> PARSER = null;
        public static final int REGION_FIELD_NUMBER = 4;
        public static final int ROOMID_FIELD_NUMBER = 1;
        public static final int SVGA_FIELD_NUMBER = 16;
        public static final int TEXTFIRSTCOLOR_FIELD_NUMBER = 10;
        public static final int TEXTFIRST_FIELD_NUMBER = 7;
        public static final int TEXTSCHEMA_FIELD_NUMBER = 8;
        public static final int TEXTSECONDCOLOR_FIELD_NUMBER = 11;
        public static final int TEXTSECOND_FIELD_NUMBER = 9;
        private boolean closeAuto_;
        private long closeTimeOutMs_;
        private boolean svga_;
        private String roomId_ = "";
        private String liveId_ = "";
        private String anchorId_ = "";
        private String region_ = "";
        private String icon_ = "";
        private String iconSchema_ = "";
        private String textFirst_ = "";
        private String textSchema_ = "";
        private String textSecond_ = "";
        private String textFirstColor_ = "";
        private String textSecondColor_ = "";
        private String backgroundStartColor_ = "";
        private String backgroundEndColor_ = "";

        public static final class Builder extends GeneratedMessageLite.AbstractC3403b<IntlLightPushInfo, Builder> implements IntlLightPushInfoOrBuilder {
            private Builder() {
                super(IntlLightPushInfo.DEFAULT_INSTANCE);
            }

            public Builder clearAnchorId() {
                copyOnWrite();
                ((IntlLightPushInfo) this.instance).clearAnchorId();
                return this;
            }

            public Builder clearBackgroundEndColor() {
                copyOnWrite();
                ((IntlLightPushInfo) this.instance).clearBackgroundEndColor();
                return this;
            }

            public Builder clearBackgroundStartColor() {
                copyOnWrite();
                ((IntlLightPushInfo) this.instance).clearBackgroundStartColor();
                return this;
            }

            public Builder clearCloseAuto() {
                copyOnWrite();
                ((IntlLightPushInfo) this.instance).clearCloseAuto();
                return this;
            }

            public Builder clearCloseTimeOutMs() {
                copyOnWrite();
                ((IntlLightPushInfo) this.instance).clearCloseTimeOutMs();
                return this;
            }

            public Builder clearIcon() {
                copyOnWrite();
                ((IntlLightPushInfo) this.instance).clearIcon();
                return this;
            }

            public Builder clearIconSchema() {
                copyOnWrite();
                ((IntlLightPushInfo) this.instance).clearIconSchema();
                return this;
            }

            public Builder clearLiveId() {
                copyOnWrite();
                ((IntlLightPushInfo) this.instance).clearLiveId();
                return this;
            }

            public Builder clearRegion() {
                copyOnWrite();
                ((IntlLightPushInfo) this.instance).clearRegion();
                return this;
            }

            public Builder clearRoomId() {
                copyOnWrite();
                ((IntlLightPushInfo) this.instance).clearRoomId();
                return this;
            }

            public Builder clearSvga() {
                copyOnWrite();
                ((IntlLightPushInfo) this.instance).clearSvga();
                return this;
            }

            public Builder clearTextFirst() {
                copyOnWrite();
                ((IntlLightPushInfo) this.instance).clearTextFirst();
                return this;
            }

            public Builder clearTextFirstColor() {
                copyOnWrite();
                ((IntlLightPushInfo) this.instance).clearTextFirstColor();
                return this;
            }

            public Builder clearTextSchema() {
                copyOnWrite();
                ((IntlLightPushInfo) this.instance).clearTextSchema();
                return this;
            }

            public Builder clearTextSecond() {
                copyOnWrite();
                ((IntlLightPushInfo) this.instance).clearTextSecond();
                return this;
            }

            public Builder clearTextSecondColor() {
                copyOnWrite();
                ((IntlLightPushInfo) this.instance).clearTextSecondColor();
                return this;
            }

            @Override // com.p1.mobile.longlink.msg.intl_light_push.LongLinkIntlLightPushMessage.IntlLightPushInfoOrBuilder
            public String getAnchorId() {
                return ((IntlLightPushInfo) this.instance).getAnchorId();
            }

            @Override // com.p1.mobile.longlink.msg.intl_light_push.LongLinkIntlLightPushMessage.IntlLightPushInfoOrBuilder
            public ByteString getAnchorIdBytes() {
                return ((IntlLightPushInfo) this.instance).getAnchorIdBytes();
            }

            @Override // com.p1.mobile.longlink.msg.intl_light_push.LongLinkIntlLightPushMessage.IntlLightPushInfoOrBuilder
            public String getBackgroundEndColor() {
                return ((IntlLightPushInfo) this.instance).getBackgroundEndColor();
            }

            @Override // com.p1.mobile.longlink.msg.intl_light_push.LongLinkIntlLightPushMessage.IntlLightPushInfoOrBuilder
            public ByteString getBackgroundEndColorBytes() {
                return ((IntlLightPushInfo) this.instance).getBackgroundEndColorBytes();
            }

            @Override // com.p1.mobile.longlink.msg.intl_light_push.LongLinkIntlLightPushMessage.IntlLightPushInfoOrBuilder
            public String getBackgroundStartColor() {
                return ((IntlLightPushInfo) this.instance).getBackgroundStartColor();
            }

            @Override // com.p1.mobile.longlink.msg.intl_light_push.LongLinkIntlLightPushMessage.IntlLightPushInfoOrBuilder
            public ByteString getBackgroundStartColorBytes() {
                return ((IntlLightPushInfo) this.instance).getBackgroundStartColorBytes();
            }

            @Override // com.p1.mobile.longlink.msg.intl_light_push.LongLinkIntlLightPushMessage.IntlLightPushInfoOrBuilder
            public boolean getCloseAuto() {
                return ((IntlLightPushInfo) this.instance).getCloseAuto();
            }

            @Override // com.p1.mobile.longlink.msg.intl_light_push.LongLinkIntlLightPushMessage.IntlLightPushInfoOrBuilder
            public long getCloseTimeOutMs() {
                return ((IntlLightPushInfo) this.instance).getCloseTimeOutMs();
            }

            @Override // com.p1.mobile.longlink.msg.intl_light_push.LongLinkIntlLightPushMessage.IntlLightPushInfoOrBuilder
            public String getIcon() {
                return ((IntlLightPushInfo) this.instance).getIcon();
            }

            @Override // com.p1.mobile.longlink.msg.intl_light_push.LongLinkIntlLightPushMessage.IntlLightPushInfoOrBuilder
            public ByteString getIconBytes() {
                return ((IntlLightPushInfo) this.instance).getIconBytes();
            }

            @Override // com.p1.mobile.longlink.msg.intl_light_push.LongLinkIntlLightPushMessage.IntlLightPushInfoOrBuilder
            public String getIconSchema() {
                return ((IntlLightPushInfo) this.instance).getIconSchema();
            }

            @Override // com.p1.mobile.longlink.msg.intl_light_push.LongLinkIntlLightPushMessage.IntlLightPushInfoOrBuilder
            public ByteString getIconSchemaBytes() {
                return ((IntlLightPushInfo) this.instance).getIconSchemaBytes();
            }

            @Override // com.p1.mobile.longlink.msg.intl_light_push.LongLinkIntlLightPushMessage.IntlLightPushInfoOrBuilder
            public String getLiveId() {
                return ((IntlLightPushInfo) this.instance).getLiveId();
            }

            @Override // com.p1.mobile.longlink.msg.intl_light_push.LongLinkIntlLightPushMessage.IntlLightPushInfoOrBuilder
            public ByteString getLiveIdBytes() {
                return ((IntlLightPushInfo) this.instance).getLiveIdBytes();
            }

            @Override // com.p1.mobile.longlink.msg.intl_light_push.LongLinkIntlLightPushMessage.IntlLightPushInfoOrBuilder
            public String getRegion() {
                return ((IntlLightPushInfo) this.instance).getRegion();
            }

            @Override // com.p1.mobile.longlink.msg.intl_light_push.LongLinkIntlLightPushMessage.IntlLightPushInfoOrBuilder
            public ByteString getRegionBytes() {
                return ((IntlLightPushInfo) this.instance).getRegionBytes();
            }

            @Override // com.p1.mobile.longlink.msg.intl_light_push.LongLinkIntlLightPushMessage.IntlLightPushInfoOrBuilder
            public String getRoomId() {
                return ((IntlLightPushInfo) this.instance).getRoomId();
            }

            @Override // com.p1.mobile.longlink.msg.intl_light_push.LongLinkIntlLightPushMessage.IntlLightPushInfoOrBuilder
            public ByteString getRoomIdBytes() {
                return ((IntlLightPushInfo) this.instance).getRoomIdBytes();
            }

            @Override // com.p1.mobile.longlink.msg.intl_light_push.LongLinkIntlLightPushMessage.IntlLightPushInfoOrBuilder
            public boolean getSvga() {
                return ((IntlLightPushInfo) this.instance).getSvga();
            }

            @Override // com.p1.mobile.longlink.msg.intl_light_push.LongLinkIntlLightPushMessage.IntlLightPushInfoOrBuilder
            public String getTextFirst() {
                return ((IntlLightPushInfo) this.instance).getTextFirst();
            }

            @Override // com.p1.mobile.longlink.msg.intl_light_push.LongLinkIntlLightPushMessage.IntlLightPushInfoOrBuilder
            public ByteString getTextFirstBytes() {
                return ((IntlLightPushInfo) this.instance).getTextFirstBytes();
            }

            @Override // com.p1.mobile.longlink.msg.intl_light_push.LongLinkIntlLightPushMessage.IntlLightPushInfoOrBuilder
            public String getTextFirstColor() {
                return ((IntlLightPushInfo) this.instance).getTextFirstColor();
            }

            @Override // com.p1.mobile.longlink.msg.intl_light_push.LongLinkIntlLightPushMessage.IntlLightPushInfoOrBuilder
            public ByteString getTextFirstColorBytes() {
                return ((IntlLightPushInfo) this.instance).getTextFirstColorBytes();
            }

            @Override // com.p1.mobile.longlink.msg.intl_light_push.LongLinkIntlLightPushMessage.IntlLightPushInfoOrBuilder
            public String getTextSchema() {
                return ((IntlLightPushInfo) this.instance).getTextSchema();
            }

            @Override // com.p1.mobile.longlink.msg.intl_light_push.LongLinkIntlLightPushMessage.IntlLightPushInfoOrBuilder
            public ByteString getTextSchemaBytes() {
                return ((IntlLightPushInfo) this.instance).getTextSchemaBytes();
            }

            @Override // com.p1.mobile.longlink.msg.intl_light_push.LongLinkIntlLightPushMessage.IntlLightPushInfoOrBuilder
            public String getTextSecond() {
                return ((IntlLightPushInfo) this.instance).getTextSecond();
            }

            @Override // com.p1.mobile.longlink.msg.intl_light_push.LongLinkIntlLightPushMessage.IntlLightPushInfoOrBuilder
            public ByteString getTextSecondBytes() {
                return ((IntlLightPushInfo) this.instance).getTextSecondBytes();
            }

            @Override // com.p1.mobile.longlink.msg.intl_light_push.LongLinkIntlLightPushMessage.IntlLightPushInfoOrBuilder
            public String getTextSecondColor() {
                return ((IntlLightPushInfo) this.instance).getTextSecondColor();
            }

            @Override // com.p1.mobile.longlink.msg.intl_light_push.LongLinkIntlLightPushMessage.IntlLightPushInfoOrBuilder
            public ByteString getTextSecondColorBytes() {
                return ((IntlLightPushInfo) this.instance).getTextSecondColorBytes();
            }

            public Builder setAnchorId(String str) {
                copyOnWrite();
                ((IntlLightPushInfo) this.instance).setAnchorId(str);
                return this;
            }

            public Builder setAnchorIdBytes(ByteString byteString) {
                copyOnWrite();
                ((IntlLightPushInfo) this.instance).setAnchorIdBytes(byteString);
                return this;
            }

            public Builder setBackgroundEndColor(String str) {
                copyOnWrite();
                ((IntlLightPushInfo) this.instance).setBackgroundEndColor(str);
                return this;
            }

            public Builder setBackgroundEndColorBytes(ByteString byteString) {
                copyOnWrite();
                ((IntlLightPushInfo) this.instance).setBackgroundEndColorBytes(byteString);
                return this;
            }

            public Builder setBackgroundStartColor(String str) {
                copyOnWrite();
                ((IntlLightPushInfo) this.instance).setBackgroundStartColor(str);
                return this;
            }

            public Builder setBackgroundStartColorBytes(ByteString byteString) {
                copyOnWrite();
                ((IntlLightPushInfo) this.instance).setBackgroundStartColorBytes(byteString);
                return this;
            }

            public Builder setCloseAuto(boolean z) {
                copyOnWrite();
                ((IntlLightPushInfo) this.instance).setCloseAuto(z);
                return this;
            }

            public Builder setCloseTimeOutMs(long j) {
                copyOnWrite();
                ((IntlLightPushInfo) this.instance).setCloseTimeOutMs(j);
                return this;
            }

            public Builder setIcon(String str) {
                copyOnWrite();
                ((IntlLightPushInfo) this.instance).setIcon(str);
                return this;
            }

            public Builder setIconBytes(ByteString byteString) {
                copyOnWrite();
                ((IntlLightPushInfo) this.instance).setIconBytes(byteString);
                return this;
            }

            public Builder setIconSchema(String str) {
                copyOnWrite();
                ((IntlLightPushInfo) this.instance).setIconSchema(str);
                return this;
            }

            public Builder setIconSchemaBytes(ByteString byteString) {
                copyOnWrite();
                ((IntlLightPushInfo) this.instance).setIconSchemaBytes(byteString);
                return this;
            }

            public Builder setLiveId(String str) {
                copyOnWrite();
                ((IntlLightPushInfo) this.instance).setLiveId(str);
                return this;
            }

            public Builder setLiveIdBytes(ByteString byteString) {
                copyOnWrite();
                ((IntlLightPushInfo) this.instance).setLiveIdBytes(byteString);
                return this;
            }

            public Builder setRegion(String str) {
                copyOnWrite();
                ((IntlLightPushInfo) this.instance).setRegion(str);
                return this;
            }

            public Builder setRegionBytes(ByteString byteString) {
                copyOnWrite();
                ((IntlLightPushInfo) this.instance).setRegionBytes(byteString);
                return this;
            }

            public Builder setRoomId(String str) {
                copyOnWrite();
                ((IntlLightPushInfo) this.instance).setRoomId(str);
                return this;
            }

            public Builder setRoomIdBytes(ByteString byteString) {
                copyOnWrite();
                ((IntlLightPushInfo) this.instance).setRoomIdBytes(byteString);
                return this;
            }

            public Builder setSvga(boolean z) {
                copyOnWrite();
                ((IntlLightPushInfo) this.instance).setSvga(z);
                return this;
            }

            public Builder setTextFirst(String str) {
                copyOnWrite();
                ((IntlLightPushInfo) this.instance).setTextFirst(str);
                return this;
            }

            public Builder setTextFirstBytes(ByteString byteString) {
                copyOnWrite();
                ((IntlLightPushInfo) this.instance).setTextFirstBytes(byteString);
                return this;
            }

            public Builder setTextFirstColor(String str) {
                copyOnWrite();
                ((IntlLightPushInfo) this.instance).setTextFirstColor(str);
                return this;
            }

            public Builder setTextFirstColorBytes(ByteString byteString) {
                copyOnWrite();
                ((IntlLightPushInfo) this.instance).setTextFirstColorBytes(byteString);
                return this;
            }

            public Builder setTextSchema(String str) {
                copyOnWrite();
                ((IntlLightPushInfo) this.instance).setTextSchema(str);
                return this;
            }

            public Builder setTextSchemaBytes(ByteString byteString) {
                copyOnWrite();
                ((IntlLightPushInfo) this.instance).setTextSchemaBytes(byteString);
                return this;
            }

            public Builder setTextSecond(String str) {
                copyOnWrite();
                ((IntlLightPushInfo) this.instance).setTextSecond(str);
                return this;
            }

            public Builder setTextSecondBytes(ByteString byteString) {
                copyOnWrite();
                ((IntlLightPushInfo) this.instance).setTextSecondBytes(byteString);
                return this;
            }

            public Builder setTextSecondColor(String str) {
                copyOnWrite();
                ((IntlLightPushInfo) this.instance).setTextSecondColor(str);
                return this;
            }

            public Builder setTextSecondColorBytes(ByteString byteString) {
                copyOnWrite();
                ((IntlLightPushInfo) this.instance).setTextSecondColorBytes(byteString);
                return this;
            }
        }

        static {
            IntlLightPushInfo intlLightPushInfo = new IntlLightPushInfo();
            DEFAULT_INSTANCE = intlLightPushInfo;
            intlLightPushInfo.makeImmutable();
        }

        private IntlLightPushInfo() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAnchorId() {
            this.anchorId_ = getDefaultInstance().getAnchorId();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearBackgroundEndColor() {
            this.backgroundEndColor_ = getDefaultInstance().getBackgroundEndColor();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearBackgroundStartColor() {
            this.backgroundStartColor_ = getDefaultInstance().getBackgroundStartColor();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearCloseAuto() {
            this.closeAuto_ = false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearCloseTimeOutMs() {
            this.closeTimeOutMs_ = 0L;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearIcon() {
            this.icon_ = getDefaultInstance().getIcon();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearIconSchema() {
            this.iconSchema_ = getDefaultInstance().getIconSchema();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearLiveId() {
            this.liveId_ = getDefaultInstance().getLiveId();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearRegion() {
            this.region_ = getDefaultInstance().getRegion();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearRoomId() {
            this.roomId_ = getDefaultInstance().getRoomId();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearSvga() {
            this.svga_ = false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearTextFirst() {
            this.textFirst_ = getDefaultInstance().getTextFirst();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearTextFirstColor() {
            this.textFirstColor_ = getDefaultInstance().getTextFirstColor();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearTextSchema() {
            this.textSchema_ = getDefaultInstance().getTextSchema();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearTextSecond() {
            this.textSecond_ = getDefaultInstance().getTextSecond();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearTextSecondColor() {
            this.textSecondColor_ = getDefaultInstance().getTextSecondColor();
        }

        public static IntlLightPushInfo getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder(IntlLightPushInfo intlLightPushInfo) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(intlLightPushInfo);
        }

        public static IntlLightPushInfo parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (IntlLightPushInfo) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static IntlLightPushInfo parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (IntlLightPushInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static ng60<IntlLightPushInfo> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAnchorId(String str) {
            str.getClass();
            this.anchorId_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAnchorIdBytes(ByteString byteString) {
            byteString.getClass();
            AbstractC3426a.checkByteStringIsUtf8(byteString);
            this.anchorId_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setBackgroundEndColor(String str) {
            str.getClass();
            this.backgroundEndColor_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setBackgroundEndColorBytes(ByteString byteString) {
            byteString.getClass();
            AbstractC3426a.checkByteStringIsUtf8(byteString);
            this.backgroundEndColor_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setBackgroundStartColor(String str) {
            str.getClass();
            this.backgroundStartColor_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setBackgroundStartColorBytes(ByteString byteString) {
            byteString.getClass();
            AbstractC3426a.checkByteStringIsUtf8(byteString);
            this.backgroundStartColor_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setCloseAuto(boolean z) {
            this.closeAuto_ = z;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setCloseTimeOutMs(long j) {
            this.closeTimeOutMs_ = j;
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
        public void setIconSchema(String str) {
            str.getClass();
            this.iconSchema_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setIconSchemaBytes(ByteString byteString) {
            byteString.getClass();
            AbstractC3426a.checkByteStringIsUtf8(byteString);
            this.iconSchema_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setLiveId(String str) {
            str.getClass();
            this.liveId_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setLiveIdBytes(ByteString byteString) {
            byteString.getClass();
            AbstractC3426a.checkByteStringIsUtf8(byteString);
            this.liveId_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setRegion(String str) {
            str.getClass();
            this.region_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setRegionBytes(ByteString byteString) {
            byteString.getClass();
            AbstractC3426a.checkByteStringIsUtf8(byteString);
            this.region_ = byteString.toStringUtf8();
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
        public void setSvga(boolean z) {
            this.svga_ = z;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTextFirst(String str) {
            str.getClass();
            this.textFirst_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTextFirstBytes(ByteString byteString) {
            byteString.getClass();
            AbstractC3426a.checkByteStringIsUtf8(byteString);
            this.textFirst_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTextFirstColor(String str) {
            str.getClass();
            this.textFirstColor_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTextFirstColorBytes(ByteString byteString) {
            byteString.getClass();
            AbstractC3426a.checkByteStringIsUtf8(byteString);
            this.textFirstColor_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTextSchema(String str) {
            str.getClass();
            this.textSchema_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTextSchemaBytes(ByteString byteString) {
            byteString.getClass();
            AbstractC3426a.checkByteStringIsUtf8(byteString);
            this.textSchema_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTextSecond(String str) {
            str.getClass();
            this.textSecond_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTextSecondBytes(ByteString byteString) {
            byteString.getClass();
            AbstractC3426a.checkByteStringIsUtf8(byteString);
            this.textSecond_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTextSecondColor(String str) {
            str.getClass();
            this.textSecondColor_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTextSecondColorBytes(ByteString byteString) {
            byteString.getClass();
            AbstractC3426a.checkByteStringIsUtf8(byteString);
            this.textSecondColor_ = byteString.toStringUtf8();
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            boolean z = false;
            switch (C45711.f16662xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new IntlLightPushInfo();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                    return null;
                case 4:
                    return new Builder();
                case 5:
                    GeneratedMessageLite.InterfaceC3409h interfaceC3409h = (GeneratedMessageLite.InterfaceC3409h) obj;
                    IntlLightPushInfo intlLightPushInfo = (IntlLightPushInfo) obj2;
                    this.roomId_ = interfaceC3409h.mo17052f(!this.roomId_.isEmpty(), this.roomId_, !intlLightPushInfo.roomId_.isEmpty(), intlLightPushInfo.roomId_);
                    this.liveId_ = interfaceC3409h.mo17052f(!this.liveId_.isEmpty(), this.liveId_, !intlLightPushInfo.liveId_.isEmpty(), intlLightPushInfo.liveId_);
                    this.anchorId_ = interfaceC3409h.mo17052f(!this.anchorId_.isEmpty(), this.anchorId_, !intlLightPushInfo.anchorId_.isEmpty(), intlLightPushInfo.anchorId_);
                    this.region_ = interfaceC3409h.mo17052f(!this.region_.isEmpty(), this.region_, !intlLightPushInfo.region_.isEmpty(), intlLightPushInfo.region_);
                    this.icon_ = interfaceC3409h.mo17052f(!this.icon_.isEmpty(), this.icon_, !intlLightPushInfo.icon_.isEmpty(), intlLightPushInfo.icon_);
                    this.iconSchema_ = interfaceC3409h.mo17052f(!this.iconSchema_.isEmpty(), this.iconSchema_, !intlLightPushInfo.iconSchema_.isEmpty(), intlLightPushInfo.iconSchema_);
                    this.textFirst_ = interfaceC3409h.mo17052f(!this.textFirst_.isEmpty(), this.textFirst_, !intlLightPushInfo.textFirst_.isEmpty(), intlLightPushInfo.textFirst_);
                    this.textSchema_ = interfaceC3409h.mo17052f(!this.textSchema_.isEmpty(), this.textSchema_, !intlLightPushInfo.textSchema_.isEmpty(), intlLightPushInfo.textSchema_);
                    this.textSecond_ = interfaceC3409h.mo17052f(!this.textSecond_.isEmpty(), this.textSecond_, !intlLightPushInfo.textSecond_.isEmpty(), intlLightPushInfo.textSecond_);
                    this.textFirstColor_ = interfaceC3409h.mo17052f(!this.textFirstColor_.isEmpty(), this.textFirstColor_, !intlLightPushInfo.textFirstColor_.isEmpty(), intlLightPushInfo.textFirstColor_);
                    this.textSecondColor_ = interfaceC3409h.mo17052f(!this.textSecondColor_.isEmpty(), this.textSecondColor_, !intlLightPushInfo.textSecondColor_.isEmpty(), intlLightPushInfo.textSecondColor_);
                    this.backgroundStartColor_ = interfaceC3409h.mo17052f(!this.backgroundStartColor_.isEmpty(), this.backgroundStartColor_, !intlLightPushInfo.backgroundStartColor_.isEmpty(), intlLightPushInfo.backgroundStartColor_);
                    this.backgroundEndColor_ = interfaceC3409h.mo17052f(!this.backgroundEndColor_.isEmpty(), this.backgroundEndColor_, !intlLightPushInfo.backgroundEndColor_.isEmpty(), intlLightPushInfo.backgroundEndColor_);
                    boolean z2 = this.closeAuto_;
                    boolean z3 = intlLightPushInfo.closeAuto_;
                    this.closeAuto_ = interfaceC3409h.mo17050d(z2, z2, z3, z3);
                    long j = this.closeTimeOutMs_;
                    boolean z4 = j != 0;
                    long j2 = intlLightPushInfo.closeTimeOutMs_;
                    this.closeTimeOutMs_ = interfaceC3409h.mo17055i(z4, j, j2 != 0, j2);
                    boolean z5 = this.svga_;
                    boolean z6 = intlLightPushInfo.svga_;
                    this.svga_ = interfaceC3409h.mo17050d(z5, z5, z6, z6);
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
                                    this.roomId_ = c3430e.m17170L();
                                    continue;
                                case 18:
                                    this.liveId_ = c3430e.m17170L();
                                    continue;
                                case 26:
                                    this.anchorId_ = c3430e.m17170L();
                                    continue;
                                case 34:
                                    this.region_ = c3430e.m17170L();
                                    continue;
                                case 42:
                                    this.icon_ = c3430e.m17170L();
                                    continue;
                                case 50:
                                    this.iconSchema_ = c3430e.m17170L();
                                    continue;
                                case 58:
                                    this.textFirst_ = c3430e.m17170L();
                                    continue;
                                case 66:
                                    this.textSchema_ = c3430e.m17170L();
                                    continue;
                                case 74:
                                    this.textSecond_ = c3430e.m17170L();
                                    continue;
                                case EACTags.COMMAND_TO_PERFORM /* 82 */:
                                    this.textFirstColor_ = c3430e.m17170L();
                                    continue;
                                case 90:
                                    this.textSecondColor_ = c3430e.m17170L();
                                    continue;
                                case EACTags.FCP_TEMPLATE /* 98 */:
                                    this.backgroundStartColor_ = c3430e.m17170L();
                                    continue;
                                case 106:
                                    this.backgroundEndColor_ = c3430e.m17170L();
                                    continue;
                                case 112:
                                    this.closeAuto_ = c3430e.m17188m();
                                    continue;
                                case 120:
                                    this.closeTimeOutMs_ = c3430e.m17197v();
                                    continue;
                                case 128:
                                    this.svga_ = c3430e.m17188m();
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
                        synchronized (IntlLightPushInfo.class) {
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

        @Override // com.p1.mobile.longlink.msg.intl_light_push.LongLinkIntlLightPushMessage.IntlLightPushInfoOrBuilder
        public String getAnchorId() {
            return this.anchorId_;
        }

        @Override // com.p1.mobile.longlink.msg.intl_light_push.LongLinkIntlLightPushMessage.IntlLightPushInfoOrBuilder
        public ByteString getAnchorIdBytes() {
            return ByteString.copyFromUtf8(this.anchorId_);
        }

        @Override // com.p1.mobile.longlink.msg.intl_light_push.LongLinkIntlLightPushMessage.IntlLightPushInfoOrBuilder
        public String getBackgroundEndColor() {
            return this.backgroundEndColor_;
        }

        @Override // com.p1.mobile.longlink.msg.intl_light_push.LongLinkIntlLightPushMessage.IntlLightPushInfoOrBuilder
        public ByteString getBackgroundEndColorBytes() {
            return ByteString.copyFromUtf8(this.backgroundEndColor_);
        }

        @Override // com.p1.mobile.longlink.msg.intl_light_push.LongLinkIntlLightPushMessage.IntlLightPushInfoOrBuilder
        public String getBackgroundStartColor() {
            return this.backgroundStartColor_;
        }

        @Override // com.p1.mobile.longlink.msg.intl_light_push.LongLinkIntlLightPushMessage.IntlLightPushInfoOrBuilder
        public ByteString getBackgroundStartColorBytes() {
            return ByteString.copyFromUtf8(this.backgroundStartColor_);
        }

        @Override // com.p1.mobile.longlink.msg.intl_light_push.LongLinkIntlLightPushMessage.IntlLightPushInfoOrBuilder
        public boolean getCloseAuto() {
            return this.closeAuto_;
        }

        @Override // com.p1.mobile.longlink.msg.intl_light_push.LongLinkIntlLightPushMessage.IntlLightPushInfoOrBuilder
        public long getCloseTimeOutMs() {
            return this.closeTimeOutMs_;
        }

        @Override // com.p1.mobile.longlink.msg.intl_light_push.LongLinkIntlLightPushMessage.IntlLightPushInfoOrBuilder
        public String getIcon() {
            return this.icon_;
        }

        @Override // com.p1.mobile.longlink.msg.intl_light_push.LongLinkIntlLightPushMessage.IntlLightPushInfoOrBuilder
        public ByteString getIconBytes() {
            return ByteString.copyFromUtf8(this.icon_);
        }

        @Override // com.p1.mobile.longlink.msg.intl_light_push.LongLinkIntlLightPushMessage.IntlLightPushInfoOrBuilder
        public String getIconSchema() {
            return this.iconSchema_;
        }

        @Override // com.p1.mobile.longlink.msg.intl_light_push.LongLinkIntlLightPushMessage.IntlLightPushInfoOrBuilder
        public ByteString getIconSchemaBytes() {
            return ByteString.copyFromUtf8(this.iconSchema_);
        }

        @Override // com.p1.mobile.longlink.msg.intl_light_push.LongLinkIntlLightPushMessage.IntlLightPushInfoOrBuilder
        public String getLiveId() {
            return this.liveId_;
        }

        @Override // com.p1.mobile.longlink.msg.intl_light_push.LongLinkIntlLightPushMessage.IntlLightPushInfoOrBuilder
        public ByteString getLiveIdBytes() {
            return ByteString.copyFromUtf8(this.liveId_);
        }

        @Override // com.p1.mobile.longlink.msg.intl_light_push.LongLinkIntlLightPushMessage.IntlLightPushInfoOrBuilder
        public String getRegion() {
            return this.region_;
        }

        @Override // com.p1.mobile.longlink.msg.intl_light_push.LongLinkIntlLightPushMessage.IntlLightPushInfoOrBuilder
        public ByteString getRegionBytes() {
            return ByteString.copyFromUtf8(this.region_);
        }

        @Override // com.p1.mobile.longlink.msg.intl_light_push.LongLinkIntlLightPushMessage.IntlLightPushInfoOrBuilder
        public String getRoomId() {
            return this.roomId_;
        }

        @Override // com.p1.mobile.longlink.msg.intl_light_push.LongLinkIntlLightPushMessage.IntlLightPushInfoOrBuilder
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
            if (!this.liveId_.isEmpty()) {
                iM16956K += CodedOutputStream.m16956K(2, getLiveId());
            }
            if (!this.anchorId_.isEmpty()) {
                iM16956K += CodedOutputStream.m16956K(3, getAnchorId());
            }
            if (!this.region_.isEmpty()) {
                iM16956K += CodedOutputStream.m16956K(4, getRegion());
            }
            if (!this.icon_.isEmpty()) {
                iM16956K += CodedOutputStream.m16956K(5, getIcon());
            }
            if (!this.iconSchema_.isEmpty()) {
                iM16956K += CodedOutputStream.m16956K(6, getIconSchema());
            }
            if (!this.textFirst_.isEmpty()) {
                iM16956K += CodedOutputStream.m16956K(7, getTextFirst());
            }
            if (!this.textSchema_.isEmpty()) {
                iM16956K += CodedOutputStream.m16956K(8, getTextSchema());
            }
            if (!this.textSecond_.isEmpty()) {
                iM16956K += CodedOutputStream.m16956K(9, getTextSecond());
            }
            if (!this.textFirstColor_.isEmpty()) {
                iM16956K += CodedOutputStream.m16956K(10, getTextFirstColor());
            }
            if (!this.textSecondColor_.isEmpty()) {
                iM16956K += CodedOutputStream.m16956K(11, getTextSecondColor());
            }
            if (!this.backgroundStartColor_.isEmpty()) {
                iM16956K += CodedOutputStream.m16956K(12, getBackgroundStartColor());
            }
            if (!this.backgroundEndColor_.isEmpty()) {
                iM16956K += CodedOutputStream.m16956K(13, getBackgroundEndColor());
            }
            boolean z = this.closeAuto_;
            if (z) {
                iM16956K += CodedOutputStream.m16970f(14, z);
            }
            long j = this.closeTimeOutMs_;
            if (j != 0) {
                iM16956K += CodedOutputStream.m16986v(15, j);
            }
            boolean z2 = this.svga_;
            if (z2) {
                iM16956K += CodedOutputStream.m16970f(16, z2);
            }
            this.memoizedSerializedSize = iM16956K;
            return iM16956K;
        }

        @Override // com.p1.mobile.longlink.msg.intl_light_push.LongLinkIntlLightPushMessage.IntlLightPushInfoOrBuilder
        public boolean getSvga() {
            return this.svga_;
        }

        @Override // com.p1.mobile.longlink.msg.intl_light_push.LongLinkIntlLightPushMessage.IntlLightPushInfoOrBuilder
        public String getTextFirst() {
            return this.textFirst_;
        }

        @Override // com.p1.mobile.longlink.msg.intl_light_push.LongLinkIntlLightPushMessage.IntlLightPushInfoOrBuilder
        public ByteString getTextFirstBytes() {
            return ByteString.copyFromUtf8(this.textFirst_);
        }

        @Override // com.p1.mobile.longlink.msg.intl_light_push.LongLinkIntlLightPushMessage.IntlLightPushInfoOrBuilder
        public String getTextFirstColor() {
            return this.textFirstColor_;
        }

        @Override // com.p1.mobile.longlink.msg.intl_light_push.LongLinkIntlLightPushMessage.IntlLightPushInfoOrBuilder
        public ByteString getTextFirstColorBytes() {
            return ByteString.copyFromUtf8(this.textFirstColor_);
        }

        @Override // com.p1.mobile.longlink.msg.intl_light_push.LongLinkIntlLightPushMessage.IntlLightPushInfoOrBuilder
        public String getTextSchema() {
            return this.textSchema_;
        }

        @Override // com.p1.mobile.longlink.msg.intl_light_push.LongLinkIntlLightPushMessage.IntlLightPushInfoOrBuilder
        public ByteString getTextSchemaBytes() {
            return ByteString.copyFromUtf8(this.textSchema_);
        }

        @Override // com.p1.mobile.longlink.msg.intl_light_push.LongLinkIntlLightPushMessage.IntlLightPushInfoOrBuilder
        public String getTextSecond() {
            return this.textSecond_;
        }

        @Override // com.p1.mobile.longlink.msg.intl_light_push.LongLinkIntlLightPushMessage.IntlLightPushInfoOrBuilder
        public ByteString getTextSecondBytes() {
            return ByteString.copyFromUtf8(this.textSecond_);
        }

        @Override // com.p1.mobile.longlink.msg.intl_light_push.LongLinkIntlLightPushMessage.IntlLightPushInfoOrBuilder
        public String getTextSecondColor() {
            return this.textSecondColor_;
        }

        @Override // com.p1.mobile.longlink.msg.intl_light_push.LongLinkIntlLightPushMessage.IntlLightPushInfoOrBuilder
        public ByteString getTextSecondColorBytes() {
            return ByteString.copyFromUtf8(this.textSecondColor_);
        }

        @Override // com.google.protobuf.InterfaceC3442q
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (!this.roomId_.isEmpty()) {
                codedOutputStream.mo16994D0(1, getRoomId());
            }
            if (!this.liveId_.isEmpty()) {
                codedOutputStream.mo16994D0(2, getLiveId());
            }
            if (!this.anchorId_.isEmpty()) {
                codedOutputStream.mo16994D0(3, getAnchorId());
            }
            if (!this.region_.isEmpty()) {
                codedOutputStream.mo16994D0(4, getRegion());
            }
            if (!this.icon_.isEmpty()) {
                codedOutputStream.mo16994D0(5, getIcon());
            }
            if (!this.iconSchema_.isEmpty()) {
                codedOutputStream.mo16994D0(6, getIconSchema());
            }
            if (!this.textFirst_.isEmpty()) {
                codedOutputStream.mo16994D0(7, getTextFirst());
            }
            if (!this.textSchema_.isEmpty()) {
                codedOutputStream.mo16994D0(8, getTextSchema());
            }
            if (!this.textSecond_.isEmpty()) {
                codedOutputStream.mo16994D0(9, getTextSecond());
            }
            if (!this.textFirstColor_.isEmpty()) {
                codedOutputStream.mo16994D0(10, getTextFirstColor());
            }
            if (!this.textSecondColor_.isEmpty()) {
                codedOutputStream.mo16994D0(11, getTextSecondColor());
            }
            if (!this.backgroundStartColor_.isEmpty()) {
                codedOutputStream.mo16994D0(12, getBackgroundStartColor());
            }
            if (!this.backgroundEndColor_.isEmpty()) {
                codedOutputStream.mo16994D0(13, getBackgroundEndColor());
            }
            boolean z = this.closeAuto_;
            if (z) {
                codedOutputStream.mo17005a0(14, z);
            }
            long j = this.closeTimeOutMs_;
            if (j != 0) {
                codedOutputStream.m17027u0(15, j);
            }
            boolean z2 = this.svga_;
            if (z2) {
                codedOutputStream.mo17005a0(16, z2);
            }
        }

        public static IntlLightPushInfo parseDelimitedFrom(InputStream inputStream, C3433h c3433h) throws IOException {
            return (IntlLightPushInfo) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, c3433h);
        }

        public static IntlLightPushInfo parseFrom(ByteString byteString, C3433h c3433h) throws InvalidProtocolBufferException {
            return (IntlLightPushInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, c3433h);
        }

        public static IntlLightPushInfo parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (IntlLightPushInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static IntlLightPushInfo parseFrom(byte[] bArr, C3433h c3433h) throws InvalidProtocolBufferException {
            return (IntlLightPushInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, c3433h);
        }

        public static IntlLightPushInfo parseFrom(InputStream inputStream) throws IOException {
            return (IntlLightPushInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static IntlLightPushInfo parseFrom(InputStream inputStream, C3433h c3433h) throws IOException {
            return (IntlLightPushInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, c3433h);
        }

        public static IntlLightPushInfo parseFrom(C3430e c3430e) throws IOException {
            return (IntlLightPushInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, c3430e);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static IntlLightPushInfo parseFrom(C3430e c3430e, C3433h c3433h) throws IOException {
            return (IntlLightPushInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, c3430e, c3433h);
        }
    }

    public static final class RefreshGiftTabBalanceMsg extends GeneratedMessageLite<RefreshGiftTabBalanceMsg, Builder> implements RefreshGiftTabBalanceMsgOrBuilder {
        private static final RefreshGiftTabBalanceMsg DEFAULT_INSTANCE;
        private static volatile ng60<RefreshGiftTabBalanceMsg> PARSER = null;
        public static final int PRICETYPE_FIELD_NUMBER = 2;
        public static final int USERID_FIELD_NUMBER = 1;
        private String userId_ = "";
        private String priceType_ = "";

        public static final class Builder extends GeneratedMessageLite.AbstractC3403b<RefreshGiftTabBalanceMsg, Builder> implements RefreshGiftTabBalanceMsgOrBuilder {
            private Builder() {
                super(RefreshGiftTabBalanceMsg.DEFAULT_INSTANCE);
            }

            public Builder clearPriceType() {
                copyOnWrite();
                ((RefreshGiftTabBalanceMsg) this.instance).clearPriceType();
                return this;
            }

            public Builder clearUserId() {
                copyOnWrite();
                ((RefreshGiftTabBalanceMsg) this.instance).clearUserId();
                return this;
            }

            @Override // com.p1.mobile.longlink.msg.intl_light_push.LongLinkIntlLightPushMessage.RefreshGiftTabBalanceMsgOrBuilder
            public String getPriceType() {
                return ((RefreshGiftTabBalanceMsg) this.instance).getPriceType();
            }

            @Override // com.p1.mobile.longlink.msg.intl_light_push.LongLinkIntlLightPushMessage.RefreshGiftTabBalanceMsgOrBuilder
            public ByteString getPriceTypeBytes() {
                return ((RefreshGiftTabBalanceMsg) this.instance).getPriceTypeBytes();
            }

            @Override // com.p1.mobile.longlink.msg.intl_light_push.LongLinkIntlLightPushMessage.RefreshGiftTabBalanceMsgOrBuilder
            public String getUserId() {
                return ((RefreshGiftTabBalanceMsg) this.instance).getUserId();
            }

            @Override // com.p1.mobile.longlink.msg.intl_light_push.LongLinkIntlLightPushMessage.RefreshGiftTabBalanceMsgOrBuilder
            public ByteString getUserIdBytes() {
                return ((RefreshGiftTabBalanceMsg) this.instance).getUserIdBytes();
            }

            public Builder setPriceType(String str) {
                copyOnWrite();
                ((RefreshGiftTabBalanceMsg) this.instance).setPriceType(str);
                return this;
            }

            public Builder setPriceTypeBytes(ByteString byteString) {
                copyOnWrite();
                ((RefreshGiftTabBalanceMsg) this.instance).setPriceTypeBytes(byteString);
                return this;
            }

            public Builder setUserId(String str) {
                copyOnWrite();
                ((RefreshGiftTabBalanceMsg) this.instance).setUserId(str);
                return this;
            }

            public Builder setUserIdBytes(ByteString byteString) {
                copyOnWrite();
                ((RefreshGiftTabBalanceMsg) this.instance).setUserIdBytes(byteString);
                return this;
            }
        }

        static {
            RefreshGiftTabBalanceMsg refreshGiftTabBalanceMsg = new RefreshGiftTabBalanceMsg();
            DEFAULT_INSTANCE = refreshGiftTabBalanceMsg;
            refreshGiftTabBalanceMsg.makeImmutable();
        }

        private RefreshGiftTabBalanceMsg() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearPriceType() {
            this.priceType_ = getDefaultInstance().getPriceType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearUserId() {
            this.userId_ = getDefaultInstance().getUserId();
        }

        public static RefreshGiftTabBalanceMsg getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder(RefreshGiftTabBalanceMsg refreshGiftTabBalanceMsg) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(refreshGiftTabBalanceMsg);
        }

        public static RefreshGiftTabBalanceMsg parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (RefreshGiftTabBalanceMsg) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static RefreshGiftTabBalanceMsg parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (RefreshGiftTabBalanceMsg) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static ng60<RefreshGiftTabBalanceMsg> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setPriceType(String str) {
            str.getClass();
            this.priceType_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setPriceTypeBytes(ByteString byteString) {
            byteString.getClass();
            AbstractC3426a.checkByteStringIsUtf8(byteString);
            this.priceType_ = byteString.toStringUtf8();
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
            switch (C45711.f16662xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new RefreshGiftTabBalanceMsg();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                    return null;
                case 4:
                    return new Builder();
                case 5:
                    GeneratedMessageLite.InterfaceC3409h interfaceC3409h = (GeneratedMessageLite.InterfaceC3409h) obj;
                    RefreshGiftTabBalanceMsg refreshGiftTabBalanceMsg = (RefreshGiftTabBalanceMsg) obj2;
                    this.userId_ = interfaceC3409h.mo17052f(!this.userId_.isEmpty(), this.userId_, !refreshGiftTabBalanceMsg.userId_.isEmpty(), refreshGiftTabBalanceMsg.userId_);
                    this.priceType_ = interfaceC3409h.mo17052f(!this.priceType_.isEmpty(), this.priceType_, true ^ refreshGiftTabBalanceMsg.priceType_.isEmpty(), refreshGiftTabBalanceMsg.priceType_);
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
                                    this.priceType_ = c3430e.m17170L();
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
                        synchronized (RefreshGiftTabBalanceMsg.class) {
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

        @Override // com.p1.mobile.longlink.msg.intl_light_push.LongLinkIntlLightPushMessage.RefreshGiftTabBalanceMsgOrBuilder
        public String getPriceType() {
            return this.priceType_;
        }

        @Override // com.p1.mobile.longlink.msg.intl_light_push.LongLinkIntlLightPushMessage.RefreshGiftTabBalanceMsgOrBuilder
        public ByteString getPriceTypeBytes() {
            return ByteString.copyFromUtf8(this.priceType_);
        }

        @Override // com.google.protobuf.InterfaceC3442q
        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int iM16956K = !this.userId_.isEmpty() ? CodedOutputStream.m16956K(1, getUserId()) : 0;
            if (!this.priceType_.isEmpty()) {
                iM16956K += CodedOutputStream.m16956K(2, getPriceType());
            }
            this.memoizedSerializedSize = iM16956K;
            return iM16956K;
        }

        @Override // com.p1.mobile.longlink.msg.intl_light_push.LongLinkIntlLightPushMessage.RefreshGiftTabBalanceMsgOrBuilder
        public String getUserId() {
            return this.userId_;
        }

        @Override // com.p1.mobile.longlink.msg.intl_light_push.LongLinkIntlLightPushMessage.RefreshGiftTabBalanceMsgOrBuilder
        public ByteString getUserIdBytes() {
            return ByteString.copyFromUtf8(this.userId_);
        }

        @Override // com.google.protobuf.InterfaceC3442q
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (!this.userId_.isEmpty()) {
                codedOutputStream.mo16994D0(1, getUserId());
            }
            if (this.priceType_.isEmpty()) {
                return;
            }
            codedOutputStream.mo16994D0(2, getPriceType());
        }

        public static RefreshGiftTabBalanceMsg parseDelimitedFrom(InputStream inputStream, C3433h c3433h) throws IOException {
            return (RefreshGiftTabBalanceMsg) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, c3433h);
        }

        public static RefreshGiftTabBalanceMsg parseFrom(ByteString byteString, C3433h c3433h) throws InvalidProtocolBufferException {
            return (RefreshGiftTabBalanceMsg) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, c3433h);
        }

        public static RefreshGiftTabBalanceMsg parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (RefreshGiftTabBalanceMsg) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static RefreshGiftTabBalanceMsg parseFrom(byte[] bArr, C3433h c3433h) throws InvalidProtocolBufferException {
            return (RefreshGiftTabBalanceMsg) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, c3433h);
        }

        public static RefreshGiftTabBalanceMsg parseFrom(InputStream inputStream) throws IOException {
            return (RefreshGiftTabBalanceMsg) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static RefreshGiftTabBalanceMsg parseFrom(InputStream inputStream, C3433h c3433h) throws IOException {
            return (RefreshGiftTabBalanceMsg) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, c3433h);
        }

        public static RefreshGiftTabBalanceMsg parseFrom(C3430e c3430e) throws IOException {
            return (RefreshGiftTabBalanceMsg) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, c3430e);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static RefreshGiftTabBalanceMsg parseFrom(C3430e c3430e, C3433h c3433h) throws IOException {
            return (RefreshGiftTabBalanceMsg) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, c3430e, c3433h);
        }
    }

    public static final class RefreshVoiceOperationMsg extends GeneratedMessageLite<RefreshVoiceOperationMsg, Builder> implements RefreshVoiceOperationMsgOrBuilder {
        private static final RefreshVoiceOperationMsg DEFAULT_INSTANCE;
        private static volatile ng60<RefreshVoiceOperationMsg> PARSER;

        public static final class Builder extends GeneratedMessageLite.AbstractC3403b<RefreshVoiceOperationMsg, Builder> implements RefreshVoiceOperationMsgOrBuilder {
            private Builder() {
                super(RefreshVoiceOperationMsg.DEFAULT_INSTANCE);
            }
        }

        static {
            RefreshVoiceOperationMsg refreshVoiceOperationMsg = new RefreshVoiceOperationMsg();
            DEFAULT_INSTANCE = refreshVoiceOperationMsg;
            refreshVoiceOperationMsg.makeImmutable();
        }

        private RefreshVoiceOperationMsg() {
        }

        public static RefreshVoiceOperationMsg getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder(RefreshVoiceOperationMsg refreshVoiceOperationMsg) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(refreshVoiceOperationMsg);
        }

        public static RefreshVoiceOperationMsg parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (RefreshVoiceOperationMsg) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static RefreshVoiceOperationMsg parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (RefreshVoiceOperationMsg) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static ng60<RefreshVoiceOperationMsg> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (C45711.f16662xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new RefreshVoiceOperationMsg();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                    return null;
                case 4:
                    return new Builder();
                case 5:
                    GeneratedMessageLite.C3408g c3408g = GeneratedMessageLite.C3408g.INSTANCE;
                    return this;
                case 6:
                    C3430e c3430e = (C3430e) obj;
                    boolean z = false;
                    while (!z) {
                        try {
                            int iM17171M = c3430e.m17171M();
                            if (iM17171M == 0 || !c3430e.m17176R(iM17171M)) {
                                z = true;
                            }
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
                        synchronized (RefreshVoiceOperationMsg.class) {
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
            this.memoizedSerializedSize = 0;
            return 0;
        }

        @Override // com.google.protobuf.InterfaceC3442q
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        }

        public static RefreshVoiceOperationMsg parseDelimitedFrom(InputStream inputStream, C3433h c3433h) throws IOException {
            return (RefreshVoiceOperationMsg) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, c3433h);
        }

        public static RefreshVoiceOperationMsg parseFrom(ByteString byteString, C3433h c3433h) throws InvalidProtocolBufferException {
            return (RefreshVoiceOperationMsg) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, c3433h);
        }

        public static RefreshVoiceOperationMsg parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (RefreshVoiceOperationMsg) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static RefreshVoiceOperationMsg parseFrom(byte[] bArr, C3433h c3433h) throws InvalidProtocolBufferException {
            return (RefreshVoiceOperationMsg) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, c3433h);
        }

        public static RefreshVoiceOperationMsg parseFrom(InputStream inputStream) throws IOException {
            return (RefreshVoiceOperationMsg) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static RefreshVoiceOperationMsg parseFrom(InputStream inputStream, C3433h c3433h) throws IOException {
            return (RefreshVoiceOperationMsg) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, c3433h);
        }

        public static RefreshVoiceOperationMsg parseFrom(C3430e c3430e) throws IOException {
            return (RefreshVoiceOperationMsg) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, c3430e);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static RefreshVoiceOperationMsg parseFrom(C3430e c3430e, C3433h c3433h) throws IOException {
            return (RefreshVoiceOperationMsg) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, c3430e, c3433h);
        }
    }
}
