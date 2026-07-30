package com.p003p1.mobile.longlink.msg.intl_light_push;

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
public final class LongLinkIntlLightPushMessage {

    /* JADX INFO: renamed from: com.p1.mobile.longlink.msg.intl_light_push.LongLinkIntlLightPushMessage$1 */
    public static /* synthetic */ class C03321 {

        /* JADX INFO: renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f1642xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f1642xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f1642xa1df5c61[GeneratedMessageLite.MethodToInvoke.IS_INITIALIZED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f1642xa1df5c61[GeneratedMessageLite.MethodToInvoke.MAKE_IMMUTABLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f1642xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f1642xa1df5c61[GeneratedMessageLite.MethodToInvoke.VISIT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f1642xa1df5c61[GeneratedMessageLite.MethodToInvoke.MERGE_FROM_STREAM.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f1642xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f1642xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    public interface IntlLightPushInfoOrBuilder extends o6z {
        String getAnchorId();

        ByteString getAnchorIdBytes();

        String getBackgroundEndColor();

        ByteString getBackgroundEndColorBytes();

        String getBackgroundStartColor();

        ByteString getBackgroundStartColorBytes();

        boolean getCloseAuto();

        long getCloseTimeOutMs();

        /* synthetic */ q getDefaultInstanceForType();

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

        /* synthetic */ boolean isInitialized();
    }

    public interface RefreshGiftTabBalanceMsgOrBuilder extends o6z {
        /* synthetic */ q getDefaultInstanceForType();

        String getPriceType();

        ByteString getPriceTypeBytes();

        String getUserId();

        ByteString getUserIdBytes();

        /* synthetic */ boolean isInitialized();
    }

    public interface RefreshVoiceOperationMsgOrBuilder extends o6z {
        /* synthetic */ q getDefaultInstanceForType();

        /* synthetic */ boolean isInitialized();
    }

    private LongLinkIntlLightPushMessage() {
    }

    public static void registerAllExtensions(h hVar) {
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
        private static volatile i860<IntlLightPushInfo> PARSER = null;
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

        public static final class Builder extends GeneratedMessageLite.b<IntlLightPushInfo, Builder> implements IntlLightPushInfoOrBuilder {
            private Builder() {
                super(IntlLightPushInfo.DEFAULT_INSTANCE);
            }

            public Builder clearAnchorId() {
                copyOnWrite();
                ((IntlLightPushInfo) ((GeneratedMessageLite.b) this).instance).clearAnchorId();
                return this;
            }

            public Builder clearBackgroundEndColor() {
                copyOnWrite();
                ((IntlLightPushInfo) ((GeneratedMessageLite.b) this).instance).clearBackgroundEndColor();
                return this;
            }

            public Builder clearBackgroundStartColor() {
                copyOnWrite();
                ((IntlLightPushInfo) ((GeneratedMessageLite.b) this).instance).clearBackgroundStartColor();
                return this;
            }

            public Builder clearCloseAuto() {
                copyOnWrite();
                ((IntlLightPushInfo) ((GeneratedMessageLite.b) this).instance).clearCloseAuto();
                return this;
            }

            public Builder clearCloseTimeOutMs() {
                copyOnWrite();
                ((IntlLightPushInfo) ((GeneratedMessageLite.b) this).instance).clearCloseTimeOutMs();
                return this;
            }

            public Builder clearIcon() {
                copyOnWrite();
                ((IntlLightPushInfo) ((GeneratedMessageLite.b) this).instance).clearIcon();
                return this;
            }

            public Builder clearIconSchema() {
                copyOnWrite();
                ((IntlLightPushInfo) ((GeneratedMessageLite.b) this).instance).clearIconSchema();
                return this;
            }

            public Builder clearLiveId() {
                copyOnWrite();
                ((IntlLightPushInfo) ((GeneratedMessageLite.b) this).instance).clearLiveId();
                return this;
            }

            public Builder clearRegion() {
                copyOnWrite();
                ((IntlLightPushInfo) ((GeneratedMessageLite.b) this).instance).clearRegion();
                return this;
            }

            public Builder clearRoomId() {
                copyOnWrite();
                ((IntlLightPushInfo) ((GeneratedMessageLite.b) this).instance).clearRoomId();
                return this;
            }

            public Builder clearSvga() {
                copyOnWrite();
                ((IntlLightPushInfo) ((GeneratedMessageLite.b) this).instance).clearSvga();
                return this;
            }

            public Builder clearTextFirst() {
                copyOnWrite();
                ((IntlLightPushInfo) ((GeneratedMessageLite.b) this).instance).clearTextFirst();
                return this;
            }

            public Builder clearTextFirstColor() {
                copyOnWrite();
                ((IntlLightPushInfo) ((GeneratedMessageLite.b) this).instance).clearTextFirstColor();
                return this;
            }

            public Builder clearTextSchema() {
                copyOnWrite();
                ((IntlLightPushInfo) ((GeneratedMessageLite.b) this).instance).clearTextSchema();
                return this;
            }

            public Builder clearTextSecond() {
                copyOnWrite();
                ((IntlLightPushInfo) ((GeneratedMessageLite.b) this).instance).clearTextSecond();
                return this;
            }

            public Builder clearTextSecondColor() {
                copyOnWrite();
                ((IntlLightPushInfo) ((GeneratedMessageLite.b) this).instance).clearTextSecondColor();
                return this;
            }

            @Override // com.p1.mobile.longlink.msg.intl_light_push.LongLinkIntlLightPushMessage.IntlLightPushInfoOrBuilder
            public String getAnchorId() {
                return ((IntlLightPushInfo) ((GeneratedMessageLite.b) this).instance).getAnchorId();
            }

            @Override // com.p1.mobile.longlink.msg.intl_light_push.LongLinkIntlLightPushMessage.IntlLightPushInfoOrBuilder
            public ByteString getAnchorIdBytes() {
                return ((IntlLightPushInfo) ((GeneratedMessageLite.b) this).instance).getAnchorIdBytes();
            }

            @Override // com.p1.mobile.longlink.msg.intl_light_push.LongLinkIntlLightPushMessage.IntlLightPushInfoOrBuilder
            public String getBackgroundEndColor() {
                return ((IntlLightPushInfo) ((GeneratedMessageLite.b) this).instance).getBackgroundEndColor();
            }

            @Override // com.p1.mobile.longlink.msg.intl_light_push.LongLinkIntlLightPushMessage.IntlLightPushInfoOrBuilder
            public ByteString getBackgroundEndColorBytes() {
                return ((IntlLightPushInfo) ((GeneratedMessageLite.b) this).instance).getBackgroundEndColorBytes();
            }

            @Override // com.p1.mobile.longlink.msg.intl_light_push.LongLinkIntlLightPushMessage.IntlLightPushInfoOrBuilder
            public String getBackgroundStartColor() {
                return ((IntlLightPushInfo) ((GeneratedMessageLite.b) this).instance).getBackgroundStartColor();
            }

            @Override // com.p1.mobile.longlink.msg.intl_light_push.LongLinkIntlLightPushMessage.IntlLightPushInfoOrBuilder
            public ByteString getBackgroundStartColorBytes() {
                return ((IntlLightPushInfo) ((GeneratedMessageLite.b) this).instance).getBackgroundStartColorBytes();
            }

            @Override // com.p1.mobile.longlink.msg.intl_light_push.LongLinkIntlLightPushMessage.IntlLightPushInfoOrBuilder
            public boolean getCloseAuto() {
                return ((IntlLightPushInfo) ((GeneratedMessageLite.b) this).instance).getCloseAuto();
            }

            @Override // com.p1.mobile.longlink.msg.intl_light_push.LongLinkIntlLightPushMessage.IntlLightPushInfoOrBuilder
            public long getCloseTimeOutMs() {
                return ((IntlLightPushInfo) ((GeneratedMessageLite.b) this).instance).getCloseTimeOutMs();
            }

            @Override // com.p1.mobile.longlink.msg.intl_light_push.LongLinkIntlLightPushMessage.IntlLightPushInfoOrBuilder
            public String getIcon() {
                return ((IntlLightPushInfo) ((GeneratedMessageLite.b) this).instance).getIcon();
            }

            @Override // com.p1.mobile.longlink.msg.intl_light_push.LongLinkIntlLightPushMessage.IntlLightPushInfoOrBuilder
            public ByteString getIconBytes() {
                return ((IntlLightPushInfo) ((GeneratedMessageLite.b) this).instance).getIconBytes();
            }

            @Override // com.p1.mobile.longlink.msg.intl_light_push.LongLinkIntlLightPushMessage.IntlLightPushInfoOrBuilder
            public String getIconSchema() {
                return ((IntlLightPushInfo) ((GeneratedMessageLite.b) this).instance).getIconSchema();
            }

            @Override // com.p1.mobile.longlink.msg.intl_light_push.LongLinkIntlLightPushMessage.IntlLightPushInfoOrBuilder
            public ByteString getIconSchemaBytes() {
                return ((IntlLightPushInfo) ((GeneratedMessageLite.b) this).instance).getIconSchemaBytes();
            }

            @Override // com.p1.mobile.longlink.msg.intl_light_push.LongLinkIntlLightPushMessage.IntlLightPushInfoOrBuilder
            public String getLiveId() {
                return ((IntlLightPushInfo) ((GeneratedMessageLite.b) this).instance).getLiveId();
            }

            @Override // com.p1.mobile.longlink.msg.intl_light_push.LongLinkIntlLightPushMessage.IntlLightPushInfoOrBuilder
            public ByteString getLiveIdBytes() {
                return ((IntlLightPushInfo) ((GeneratedMessageLite.b) this).instance).getLiveIdBytes();
            }

            @Override // com.p1.mobile.longlink.msg.intl_light_push.LongLinkIntlLightPushMessage.IntlLightPushInfoOrBuilder
            public String getRegion() {
                return ((IntlLightPushInfo) ((GeneratedMessageLite.b) this).instance).getRegion();
            }

            @Override // com.p1.mobile.longlink.msg.intl_light_push.LongLinkIntlLightPushMessage.IntlLightPushInfoOrBuilder
            public ByteString getRegionBytes() {
                return ((IntlLightPushInfo) ((GeneratedMessageLite.b) this).instance).getRegionBytes();
            }

            @Override // com.p1.mobile.longlink.msg.intl_light_push.LongLinkIntlLightPushMessage.IntlLightPushInfoOrBuilder
            public String getRoomId() {
                return ((IntlLightPushInfo) ((GeneratedMessageLite.b) this).instance).getRoomId();
            }

            @Override // com.p1.mobile.longlink.msg.intl_light_push.LongLinkIntlLightPushMessage.IntlLightPushInfoOrBuilder
            public ByteString getRoomIdBytes() {
                return ((IntlLightPushInfo) ((GeneratedMessageLite.b) this).instance).getRoomIdBytes();
            }

            @Override // com.p1.mobile.longlink.msg.intl_light_push.LongLinkIntlLightPushMessage.IntlLightPushInfoOrBuilder
            public boolean getSvga() {
                return ((IntlLightPushInfo) ((GeneratedMessageLite.b) this).instance).getSvga();
            }

            @Override // com.p1.mobile.longlink.msg.intl_light_push.LongLinkIntlLightPushMessage.IntlLightPushInfoOrBuilder
            public String getTextFirst() {
                return ((IntlLightPushInfo) ((GeneratedMessageLite.b) this).instance).getTextFirst();
            }

            @Override // com.p1.mobile.longlink.msg.intl_light_push.LongLinkIntlLightPushMessage.IntlLightPushInfoOrBuilder
            public ByteString getTextFirstBytes() {
                return ((IntlLightPushInfo) ((GeneratedMessageLite.b) this).instance).getTextFirstBytes();
            }

            @Override // com.p1.mobile.longlink.msg.intl_light_push.LongLinkIntlLightPushMessage.IntlLightPushInfoOrBuilder
            public String getTextFirstColor() {
                return ((IntlLightPushInfo) ((GeneratedMessageLite.b) this).instance).getTextFirstColor();
            }

            @Override // com.p1.mobile.longlink.msg.intl_light_push.LongLinkIntlLightPushMessage.IntlLightPushInfoOrBuilder
            public ByteString getTextFirstColorBytes() {
                return ((IntlLightPushInfo) ((GeneratedMessageLite.b) this).instance).getTextFirstColorBytes();
            }

            @Override // com.p1.mobile.longlink.msg.intl_light_push.LongLinkIntlLightPushMessage.IntlLightPushInfoOrBuilder
            public String getTextSchema() {
                return ((IntlLightPushInfo) ((GeneratedMessageLite.b) this).instance).getTextSchema();
            }

            @Override // com.p1.mobile.longlink.msg.intl_light_push.LongLinkIntlLightPushMessage.IntlLightPushInfoOrBuilder
            public ByteString getTextSchemaBytes() {
                return ((IntlLightPushInfo) ((GeneratedMessageLite.b) this).instance).getTextSchemaBytes();
            }

            @Override // com.p1.mobile.longlink.msg.intl_light_push.LongLinkIntlLightPushMessage.IntlLightPushInfoOrBuilder
            public String getTextSecond() {
                return ((IntlLightPushInfo) ((GeneratedMessageLite.b) this).instance).getTextSecond();
            }

            @Override // com.p1.mobile.longlink.msg.intl_light_push.LongLinkIntlLightPushMessage.IntlLightPushInfoOrBuilder
            public ByteString getTextSecondBytes() {
                return ((IntlLightPushInfo) ((GeneratedMessageLite.b) this).instance).getTextSecondBytes();
            }

            @Override // com.p1.mobile.longlink.msg.intl_light_push.LongLinkIntlLightPushMessage.IntlLightPushInfoOrBuilder
            public String getTextSecondColor() {
                return ((IntlLightPushInfo) ((GeneratedMessageLite.b) this).instance).getTextSecondColor();
            }

            @Override // com.p1.mobile.longlink.msg.intl_light_push.LongLinkIntlLightPushMessage.IntlLightPushInfoOrBuilder
            public ByteString getTextSecondColorBytes() {
                return ((IntlLightPushInfo) ((GeneratedMessageLite.b) this).instance).getTextSecondColorBytes();
            }

            public Builder setAnchorId(String str) {
                copyOnWrite();
                ((IntlLightPushInfo) ((GeneratedMessageLite.b) this).instance).setAnchorId(str);
                return this;
            }

            public Builder setAnchorIdBytes(ByteString byteString) {
                copyOnWrite();
                ((IntlLightPushInfo) ((GeneratedMessageLite.b) this).instance).setAnchorIdBytes(byteString);
                return this;
            }

            public Builder setBackgroundEndColor(String str) {
                copyOnWrite();
                ((IntlLightPushInfo) ((GeneratedMessageLite.b) this).instance).setBackgroundEndColor(str);
                return this;
            }

            public Builder setBackgroundEndColorBytes(ByteString byteString) {
                copyOnWrite();
                ((IntlLightPushInfo) ((GeneratedMessageLite.b) this).instance).setBackgroundEndColorBytes(byteString);
                return this;
            }

            public Builder setBackgroundStartColor(String str) {
                copyOnWrite();
                ((IntlLightPushInfo) ((GeneratedMessageLite.b) this).instance).setBackgroundStartColor(str);
                return this;
            }

            public Builder setBackgroundStartColorBytes(ByteString byteString) {
                copyOnWrite();
                ((IntlLightPushInfo) ((GeneratedMessageLite.b) this).instance).setBackgroundStartColorBytes(byteString);
                return this;
            }

            public Builder setCloseAuto(boolean z) {
                copyOnWrite();
                ((IntlLightPushInfo) ((GeneratedMessageLite.b) this).instance).setCloseAuto(z);
                return this;
            }

            public Builder setCloseTimeOutMs(long j) {
                copyOnWrite();
                ((IntlLightPushInfo) ((GeneratedMessageLite.b) this).instance).setCloseTimeOutMs(j);
                return this;
            }

            public Builder setIcon(String str) {
                copyOnWrite();
                ((IntlLightPushInfo) ((GeneratedMessageLite.b) this).instance).setIcon(str);
                return this;
            }

            public Builder setIconBytes(ByteString byteString) {
                copyOnWrite();
                ((IntlLightPushInfo) ((GeneratedMessageLite.b) this).instance).setIconBytes(byteString);
                return this;
            }

            public Builder setIconSchema(String str) {
                copyOnWrite();
                ((IntlLightPushInfo) ((GeneratedMessageLite.b) this).instance).setIconSchema(str);
                return this;
            }

            public Builder setIconSchemaBytes(ByteString byteString) {
                copyOnWrite();
                ((IntlLightPushInfo) ((GeneratedMessageLite.b) this).instance).setIconSchemaBytes(byteString);
                return this;
            }

            public Builder setLiveId(String str) {
                copyOnWrite();
                ((IntlLightPushInfo) ((GeneratedMessageLite.b) this).instance).setLiveId(str);
                return this;
            }

            public Builder setLiveIdBytes(ByteString byteString) {
                copyOnWrite();
                ((IntlLightPushInfo) ((GeneratedMessageLite.b) this).instance).setLiveIdBytes(byteString);
                return this;
            }

            public Builder setRegion(String str) {
                copyOnWrite();
                ((IntlLightPushInfo) ((GeneratedMessageLite.b) this).instance).setRegion(str);
                return this;
            }

            public Builder setRegionBytes(ByteString byteString) {
                copyOnWrite();
                ((IntlLightPushInfo) ((GeneratedMessageLite.b) this).instance).setRegionBytes(byteString);
                return this;
            }

            public Builder setRoomId(String str) {
                copyOnWrite();
                ((IntlLightPushInfo) ((GeneratedMessageLite.b) this).instance).setRoomId(str);
                return this;
            }

            public Builder setRoomIdBytes(ByteString byteString) {
                copyOnWrite();
                ((IntlLightPushInfo) ((GeneratedMessageLite.b) this).instance).setRoomIdBytes(byteString);
                return this;
            }

            public Builder setSvga(boolean z) {
                copyOnWrite();
                ((IntlLightPushInfo) ((GeneratedMessageLite.b) this).instance).setSvga(z);
                return this;
            }

            public Builder setTextFirst(String str) {
                copyOnWrite();
                ((IntlLightPushInfo) ((GeneratedMessageLite.b) this).instance).setTextFirst(str);
                return this;
            }

            public Builder setTextFirstBytes(ByteString byteString) {
                copyOnWrite();
                ((IntlLightPushInfo) ((GeneratedMessageLite.b) this).instance).setTextFirstBytes(byteString);
                return this;
            }

            public Builder setTextFirstColor(String str) {
                copyOnWrite();
                ((IntlLightPushInfo) ((GeneratedMessageLite.b) this).instance).setTextFirstColor(str);
                return this;
            }

            public Builder setTextFirstColorBytes(ByteString byteString) {
                copyOnWrite();
                ((IntlLightPushInfo) ((GeneratedMessageLite.b) this).instance).setTextFirstColorBytes(byteString);
                return this;
            }

            public Builder setTextSchema(String str) {
                copyOnWrite();
                ((IntlLightPushInfo) ((GeneratedMessageLite.b) this).instance).setTextSchema(str);
                return this;
            }

            public Builder setTextSchemaBytes(ByteString byteString) {
                copyOnWrite();
                ((IntlLightPushInfo) ((GeneratedMessageLite.b) this).instance).setTextSchemaBytes(byteString);
                return this;
            }

            public Builder setTextSecond(String str) {
                copyOnWrite();
                ((IntlLightPushInfo) ((GeneratedMessageLite.b) this).instance).setTextSecond(str);
                return this;
            }

            public Builder setTextSecondBytes(ByteString byteString) {
                copyOnWrite();
                ((IntlLightPushInfo) ((GeneratedMessageLite.b) this).instance).setTextSecondBytes(byteString);
                return this;
            }

            public Builder setTextSecondColor(String str) {
                copyOnWrite();
                ((IntlLightPushInfo) ((GeneratedMessageLite.b) this).instance).setTextSecondColor(str);
                return this;
            }

            public Builder setTextSecondColorBytes(ByteString byteString) {
                copyOnWrite();
                ((IntlLightPushInfo) ((GeneratedMessageLite.b) this).instance).setTextSecondColorBytes(byteString);
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
            return (Builder) ((Builder) DEFAULT_INSTANCE.toBuilder()).mergeFrom(intlLightPushInfo);
        }

        public static IntlLightPushInfo parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (IntlLightPushInfo) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static IntlLightPushInfo parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (IntlLightPushInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static i860<IntlLightPushInfo> parser() {
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
            a.checkByteStringIsUtf8(byteString);
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
            a.checkByteStringIsUtf8(byteString);
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
            a.checkByteStringIsUtf8(byteString);
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
            a.checkByteStringIsUtf8(byteString);
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
            a.checkByteStringIsUtf8(byteString);
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
            a.checkByteStringIsUtf8(byteString);
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
            a.checkByteStringIsUtf8(byteString);
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
            a.checkByteStringIsUtf8(byteString);
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
            a.checkByteStringIsUtf8(byteString);
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
            a.checkByteStringIsUtf8(byteString);
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
            a.checkByteStringIsUtf8(byteString);
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
            a.checkByteStringIsUtf8(byteString);
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
            a.checkByteStringIsUtf8(byteString);
            this.textSecondColor_ = byteString.toStringUtf8();
        }

        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            boolean z = false;
            switch (C03321.f1642xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new IntlLightPushInfo();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                    return null;
                case 4:
                    return new Builder();
                case 5:
                    GeneratedMessageLite.h hVar = (GeneratedMessageLite.h) obj;
                    IntlLightPushInfo intlLightPushInfo = (IntlLightPushInfo) obj2;
                    this.roomId_ = hVar.f(!this.roomId_.isEmpty(), this.roomId_, !intlLightPushInfo.roomId_.isEmpty(), intlLightPushInfo.roomId_);
                    this.liveId_ = hVar.f(!this.liveId_.isEmpty(), this.liveId_, !intlLightPushInfo.liveId_.isEmpty(), intlLightPushInfo.liveId_);
                    this.anchorId_ = hVar.f(!this.anchorId_.isEmpty(), this.anchorId_, !intlLightPushInfo.anchorId_.isEmpty(), intlLightPushInfo.anchorId_);
                    this.region_ = hVar.f(!this.region_.isEmpty(), this.region_, !intlLightPushInfo.region_.isEmpty(), intlLightPushInfo.region_);
                    this.icon_ = hVar.f(!this.icon_.isEmpty(), this.icon_, !intlLightPushInfo.icon_.isEmpty(), intlLightPushInfo.icon_);
                    this.iconSchema_ = hVar.f(!this.iconSchema_.isEmpty(), this.iconSchema_, !intlLightPushInfo.iconSchema_.isEmpty(), intlLightPushInfo.iconSchema_);
                    this.textFirst_ = hVar.f(!this.textFirst_.isEmpty(), this.textFirst_, !intlLightPushInfo.textFirst_.isEmpty(), intlLightPushInfo.textFirst_);
                    this.textSchema_ = hVar.f(!this.textSchema_.isEmpty(), this.textSchema_, !intlLightPushInfo.textSchema_.isEmpty(), intlLightPushInfo.textSchema_);
                    this.textSecond_ = hVar.f(!this.textSecond_.isEmpty(), this.textSecond_, !intlLightPushInfo.textSecond_.isEmpty(), intlLightPushInfo.textSecond_);
                    this.textFirstColor_ = hVar.f(!this.textFirstColor_.isEmpty(), this.textFirstColor_, !intlLightPushInfo.textFirstColor_.isEmpty(), intlLightPushInfo.textFirstColor_);
                    this.textSecondColor_ = hVar.f(!this.textSecondColor_.isEmpty(), this.textSecondColor_, !intlLightPushInfo.textSecondColor_.isEmpty(), intlLightPushInfo.textSecondColor_);
                    this.backgroundStartColor_ = hVar.f(!this.backgroundStartColor_.isEmpty(), this.backgroundStartColor_, !intlLightPushInfo.backgroundStartColor_.isEmpty(), intlLightPushInfo.backgroundStartColor_);
                    this.backgroundEndColor_ = hVar.f(!this.backgroundEndColor_.isEmpty(), this.backgroundEndColor_, !intlLightPushInfo.backgroundEndColor_.isEmpty(), intlLightPushInfo.backgroundEndColor_);
                    boolean z2 = this.closeAuto_;
                    boolean z3 = intlLightPushInfo.closeAuto_;
                    this.closeAuto_ = hVar.d(z2, z2, z3, z3);
                    long j = this.closeTimeOutMs_;
                    boolean z4 = j != 0;
                    long j2 = intlLightPushInfo.closeTimeOutMs_;
                    this.closeTimeOutMs_ = hVar.i(z4, j, j2 != 0, j2);
                    boolean z5 = this.svga_;
                    boolean z6 = intlLightPushInfo.svga_;
                    this.svga_ = hVar.d(z5, z5, z6, z6);
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
                                    this.roomId_ = eVar.L();
                                    continue;
                                case 18:
                                    this.liveId_ = eVar.L();
                                    continue;
                                case 26:
                                    this.anchorId_ = eVar.L();
                                    continue;
                                case 34:
                                    this.region_ = eVar.L();
                                    continue;
                                case 42:
                                    this.icon_ = eVar.L();
                                    continue;
                                case 50:
                                    this.iconSchema_ = eVar.L();
                                    continue;
                                case 58:
                                    this.textFirst_ = eVar.L();
                                    continue;
                                case 66:
                                    this.textSchema_ = eVar.L();
                                    continue;
                                case 74:
                                    this.textSecond_ = eVar.L();
                                    continue;
                                case 82:
                                    this.textFirstColor_ = eVar.L();
                                    continue;
                                case 90:
                                    this.textSecondColor_ = eVar.L();
                                    continue;
                                case 98:
                                    this.backgroundStartColor_ = eVar.L();
                                    continue;
                                case 106:
                                    this.backgroundEndColor_ = eVar.L();
                                    continue;
                                case 112:
                                    this.closeAuto_ = eVar.m();
                                    continue;
                                case 120:
                                    this.closeTimeOutMs_ = eVar.v();
                                    continue;
                                case 128:
                                    this.svga_ = eVar.m();
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
                        synchronized (IntlLightPushInfo.class) {
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

        public int getSerializedSize() {
            int i = ((GeneratedMessageLite) this).memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int iK = !this.roomId_.isEmpty() ? CodedOutputStream.K(1, getRoomId()) : 0;
            if (!this.liveId_.isEmpty()) {
                iK += CodedOutputStream.K(2, getLiveId());
            }
            if (!this.anchorId_.isEmpty()) {
                iK += CodedOutputStream.K(3, getAnchorId());
            }
            if (!this.region_.isEmpty()) {
                iK += CodedOutputStream.K(4, getRegion());
            }
            if (!this.icon_.isEmpty()) {
                iK += CodedOutputStream.K(5, getIcon());
            }
            if (!this.iconSchema_.isEmpty()) {
                iK += CodedOutputStream.K(6, getIconSchema());
            }
            if (!this.textFirst_.isEmpty()) {
                iK += CodedOutputStream.K(7, getTextFirst());
            }
            if (!this.textSchema_.isEmpty()) {
                iK += CodedOutputStream.K(8, getTextSchema());
            }
            if (!this.textSecond_.isEmpty()) {
                iK += CodedOutputStream.K(9, getTextSecond());
            }
            if (!this.textFirstColor_.isEmpty()) {
                iK += CodedOutputStream.K(10, getTextFirstColor());
            }
            if (!this.textSecondColor_.isEmpty()) {
                iK += CodedOutputStream.K(11, getTextSecondColor());
            }
            if (!this.backgroundStartColor_.isEmpty()) {
                iK += CodedOutputStream.K(12, getBackgroundStartColor());
            }
            if (!this.backgroundEndColor_.isEmpty()) {
                iK += CodedOutputStream.K(13, getBackgroundEndColor());
            }
            boolean z = this.closeAuto_;
            if (z) {
                iK += CodedOutputStream.f(14, z);
            }
            long j = this.closeTimeOutMs_;
            if (j != 0) {
                iK += CodedOutputStream.v(15, j);
            }
            boolean z2 = this.svga_;
            if (z2) {
                iK += CodedOutputStream.f(16, z2);
            }
            ((GeneratedMessageLite) this).memoizedSerializedSize = iK;
            return iK;
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

        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (!this.roomId_.isEmpty()) {
                codedOutputStream.D0(1, getRoomId());
            }
            if (!this.liveId_.isEmpty()) {
                codedOutputStream.D0(2, getLiveId());
            }
            if (!this.anchorId_.isEmpty()) {
                codedOutputStream.D0(3, getAnchorId());
            }
            if (!this.region_.isEmpty()) {
                codedOutputStream.D0(4, getRegion());
            }
            if (!this.icon_.isEmpty()) {
                codedOutputStream.D0(5, getIcon());
            }
            if (!this.iconSchema_.isEmpty()) {
                codedOutputStream.D0(6, getIconSchema());
            }
            if (!this.textFirst_.isEmpty()) {
                codedOutputStream.D0(7, getTextFirst());
            }
            if (!this.textSchema_.isEmpty()) {
                codedOutputStream.D0(8, getTextSchema());
            }
            if (!this.textSecond_.isEmpty()) {
                codedOutputStream.D0(9, getTextSecond());
            }
            if (!this.textFirstColor_.isEmpty()) {
                codedOutputStream.D0(10, getTextFirstColor());
            }
            if (!this.textSecondColor_.isEmpty()) {
                codedOutputStream.D0(11, getTextSecondColor());
            }
            if (!this.backgroundStartColor_.isEmpty()) {
                codedOutputStream.D0(12, getBackgroundStartColor());
            }
            if (!this.backgroundEndColor_.isEmpty()) {
                codedOutputStream.D0(13, getBackgroundEndColor());
            }
            boolean z = this.closeAuto_;
            if (z) {
                codedOutputStream.a0(14, z);
            }
            long j = this.closeTimeOutMs_;
            if (j != 0) {
                codedOutputStream.u0(15, j);
            }
            boolean z2 = this.svga_;
            if (z2) {
                codedOutputStream.a0(16, z2);
            }
        }

        public static IntlLightPushInfo parseDelimitedFrom(InputStream inputStream, h hVar) throws IOException {
            return (IntlLightPushInfo) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, hVar);
        }

        public static IntlLightPushInfo parseFrom(ByteString byteString, h hVar) throws InvalidProtocolBufferException {
            return (IntlLightPushInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, hVar);
        }

        public static IntlLightPushInfo parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (IntlLightPushInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static IntlLightPushInfo parseFrom(byte[] bArr, h hVar) throws InvalidProtocolBufferException {
            return (IntlLightPushInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, hVar);
        }

        public static IntlLightPushInfo parseFrom(InputStream inputStream) throws IOException {
            return (IntlLightPushInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static IntlLightPushInfo parseFrom(InputStream inputStream, h hVar) throws IOException {
            return (IntlLightPushInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, hVar);
        }

        public static IntlLightPushInfo parseFrom(e eVar) throws IOException {
            return (IntlLightPushInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, eVar);
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.toBuilder();
        }

        public static IntlLightPushInfo parseFrom(e eVar, h hVar) throws IOException {
            return (IntlLightPushInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, eVar, hVar);
        }
    }

    public static final class RefreshGiftTabBalanceMsg extends GeneratedMessageLite<RefreshGiftTabBalanceMsg, Builder> implements RefreshGiftTabBalanceMsgOrBuilder {
        private static final RefreshGiftTabBalanceMsg DEFAULT_INSTANCE;
        private static volatile i860<RefreshGiftTabBalanceMsg> PARSER = null;
        public static final int PRICETYPE_FIELD_NUMBER = 2;
        public static final int USERID_FIELD_NUMBER = 1;
        private String userId_ = "";
        private String priceType_ = "";

        public static final class Builder extends GeneratedMessageLite.b<RefreshGiftTabBalanceMsg, Builder> implements RefreshGiftTabBalanceMsgOrBuilder {
            private Builder() {
                super(RefreshGiftTabBalanceMsg.DEFAULT_INSTANCE);
            }

            public Builder clearPriceType() {
                copyOnWrite();
                ((RefreshGiftTabBalanceMsg) ((GeneratedMessageLite.b) this).instance).clearPriceType();
                return this;
            }

            public Builder clearUserId() {
                copyOnWrite();
                ((RefreshGiftTabBalanceMsg) ((GeneratedMessageLite.b) this).instance).clearUserId();
                return this;
            }

            @Override // com.p1.mobile.longlink.msg.intl_light_push.LongLinkIntlLightPushMessage.RefreshGiftTabBalanceMsgOrBuilder
            public String getPriceType() {
                return ((RefreshGiftTabBalanceMsg) ((GeneratedMessageLite.b) this).instance).getPriceType();
            }

            @Override // com.p1.mobile.longlink.msg.intl_light_push.LongLinkIntlLightPushMessage.RefreshGiftTabBalanceMsgOrBuilder
            public ByteString getPriceTypeBytes() {
                return ((RefreshGiftTabBalanceMsg) ((GeneratedMessageLite.b) this).instance).getPriceTypeBytes();
            }

            @Override // com.p1.mobile.longlink.msg.intl_light_push.LongLinkIntlLightPushMessage.RefreshGiftTabBalanceMsgOrBuilder
            public String getUserId() {
                return ((RefreshGiftTabBalanceMsg) ((GeneratedMessageLite.b) this).instance).getUserId();
            }

            @Override // com.p1.mobile.longlink.msg.intl_light_push.LongLinkIntlLightPushMessage.RefreshGiftTabBalanceMsgOrBuilder
            public ByteString getUserIdBytes() {
                return ((RefreshGiftTabBalanceMsg) ((GeneratedMessageLite.b) this).instance).getUserIdBytes();
            }

            public Builder setPriceType(String str) {
                copyOnWrite();
                ((RefreshGiftTabBalanceMsg) ((GeneratedMessageLite.b) this).instance).setPriceType(str);
                return this;
            }

            public Builder setPriceTypeBytes(ByteString byteString) {
                copyOnWrite();
                ((RefreshGiftTabBalanceMsg) ((GeneratedMessageLite.b) this).instance).setPriceTypeBytes(byteString);
                return this;
            }

            public Builder setUserId(String str) {
                copyOnWrite();
                ((RefreshGiftTabBalanceMsg) ((GeneratedMessageLite.b) this).instance).setUserId(str);
                return this;
            }

            public Builder setUserIdBytes(ByteString byteString) {
                copyOnWrite();
                ((RefreshGiftTabBalanceMsg) ((GeneratedMessageLite.b) this).instance).setUserIdBytes(byteString);
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
            return (Builder) ((Builder) DEFAULT_INSTANCE.toBuilder()).mergeFrom(refreshGiftTabBalanceMsg);
        }

        public static RefreshGiftTabBalanceMsg parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (RefreshGiftTabBalanceMsg) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static RefreshGiftTabBalanceMsg parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (RefreshGiftTabBalanceMsg) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static i860<RefreshGiftTabBalanceMsg> parser() {
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
            a.checkByteStringIsUtf8(byteString);
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
            a.checkByteStringIsUtf8(byteString);
            this.userId_ = byteString.toStringUtf8();
        }

        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (C03321.f1642xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new RefreshGiftTabBalanceMsg();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                    return null;
                case 4:
                    return new Builder();
                case 5:
                    GeneratedMessageLite.h hVar = (GeneratedMessageLite.h) obj;
                    RefreshGiftTabBalanceMsg refreshGiftTabBalanceMsg = (RefreshGiftTabBalanceMsg) obj2;
                    this.userId_ = hVar.f(!this.userId_.isEmpty(), this.userId_, !refreshGiftTabBalanceMsg.userId_.isEmpty(), refreshGiftTabBalanceMsg.userId_);
                    this.priceType_ = hVar.f(!this.priceType_.isEmpty(), this.priceType_, true ^ refreshGiftTabBalanceMsg.priceType_.isEmpty(), refreshGiftTabBalanceMsg.priceType_);
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
                                    this.priceType_ = eVar.L();
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
                        synchronized (RefreshGiftTabBalanceMsg.class) {
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

        @Override // com.p1.mobile.longlink.msg.intl_light_push.LongLinkIntlLightPushMessage.RefreshGiftTabBalanceMsgOrBuilder
        public String getPriceType() {
            return this.priceType_;
        }

        @Override // com.p1.mobile.longlink.msg.intl_light_push.LongLinkIntlLightPushMessage.RefreshGiftTabBalanceMsgOrBuilder
        public ByteString getPriceTypeBytes() {
            return ByteString.copyFromUtf8(this.priceType_);
        }

        public int getSerializedSize() {
            int i = ((GeneratedMessageLite) this).memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int iK = !this.userId_.isEmpty() ? CodedOutputStream.K(1, getUserId()) : 0;
            if (!this.priceType_.isEmpty()) {
                iK += CodedOutputStream.K(2, getPriceType());
            }
            ((GeneratedMessageLite) this).memoizedSerializedSize = iK;
            return iK;
        }

        @Override // com.p1.mobile.longlink.msg.intl_light_push.LongLinkIntlLightPushMessage.RefreshGiftTabBalanceMsgOrBuilder
        public String getUserId() {
            return this.userId_;
        }

        @Override // com.p1.mobile.longlink.msg.intl_light_push.LongLinkIntlLightPushMessage.RefreshGiftTabBalanceMsgOrBuilder
        public ByteString getUserIdBytes() {
            return ByteString.copyFromUtf8(this.userId_);
        }

        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (!this.userId_.isEmpty()) {
                codedOutputStream.D0(1, getUserId());
            }
            if (this.priceType_.isEmpty()) {
                return;
            }
            codedOutputStream.D0(2, getPriceType());
        }

        public static RefreshGiftTabBalanceMsg parseDelimitedFrom(InputStream inputStream, h hVar) throws IOException {
            return (RefreshGiftTabBalanceMsg) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, hVar);
        }

        public static RefreshGiftTabBalanceMsg parseFrom(ByteString byteString, h hVar) throws InvalidProtocolBufferException {
            return (RefreshGiftTabBalanceMsg) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, hVar);
        }

        public static RefreshGiftTabBalanceMsg parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (RefreshGiftTabBalanceMsg) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static RefreshGiftTabBalanceMsg parseFrom(byte[] bArr, h hVar) throws InvalidProtocolBufferException {
            return (RefreshGiftTabBalanceMsg) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, hVar);
        }

        public static RefreshGiftTabBalanceMsg parseFrom(InputStream inputStream) throws IOException {
            return (RefreshGiftTabBalanceMsg) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static RefreshGiftTabBalanceMsg parseFrom(InputStream inputStream, h hVar) throws IOException {
            return (RefreshGiftTabBalanceMsg) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, hVar);
        }

        public static RefreshGiftTabBalanceMsg parseFrom(e eVar) throws IOException {
            return (RefreshGiftTabBalanceMsg) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, eVar);
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.toBuilder();
        }

        public static RefreshGiftTabBalanceMsg parseFrom(e eVar, h hVar) throws IOException {
            return (RefreshGiftTabBalanceMsg) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, eVar, hVar);
        }
    }

    public static final class RefreshVoiceOperationMsg extends GeneratedMessageLite<RefreshVoiceOperationMsg, Builder> implements RefreshVoiceOperationMsgOrBuilder {
        private static final RefreshVoiceOperationMsg DEFAULT_INSTANCE;
        private static volatile i860<RefreshVoiceOperationMsg> PARSER;

        public static final class Builder extends GeneratedMessageLite.b<RefreshVoiceOperationMsg, Builder> implements RefreshVoiceOperationMsgOrBuilder {
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
            return (Builder) ((Builder) DEFAULT_INSTANCE.toBuilder()).mergeFrom(refreshVoiceOperationMsg);
        }

        public static RefreshVoiceOperationMsg parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (RefreshVoiceOperationMsg) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static RefreshVoiceOperationMsg parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (RefreshVoiceOperationMsg) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static i860<RefreshVoiceOperationMsg> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (C03321.f1642xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new RefreshVoiceOperationMsg();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                    return null;
                case 4:
                    return new Builder();
                case 5:
                    GeneratedMessageLite.g gVar = GeneratedMessageLite.g.INSTANCE;
                    return this;
                case 6:
                    e eVar = (e) obj;
                    boolean z = false;
                    while (!z) {
                        try {
                            int iM = eVar.M();
                            if (iM == 0 || !eVar.R(iM)) {
                                z = true;
                            }
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
                        synchronized (RefreshVoiceOperationMsg.class) {
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
            ((GeneratedMessageLite) this).memoizedSerializedSize = 0;
            return 0;
        }

        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        }

        public static RefreshVoiceOperationMsg parseDelimitedFrom(InputStream inputStream, h hVar) throws IOException {
            return (RefreshVoiceOperationMsg) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, hVar);
        }

        public static RefreshVoiceOperationMsg parseFrom(ByteString byteString, h hVar) throws InvalidProtocolBufferException {
            return (RefreshVoiceOperationMsg) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, hVar);
        }

        public static RefreshVoiceOperationMsg parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (RefreshVoiceOperationMsg) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static RefreshVoiceOperationMsg parseFrom(byte[] bArr, h hVar) throws InvalidProtocolBufferException {
            return (RefreshVoiceOperationMsg) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, hVar);
        }

        public static RefreshVoiceOperationMsg parseFrom(InputStream inputStream) throws IOException {
            return (RefreshVoiceOperationMsg) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static RefreshVoiceOperationMsg parseFrom(InputStream inputStream, h hVar) throws IOException {
            return (RefreshVoiceOperationMsg) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, hVar);
        }

        public static RefreshVoiceOperationMsg parseFrom(e eVar) throws IOException {
            return (RefreshVoiceOperationMsg) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, eVar);
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.toBuilder();
        }

        public static RefreshVoiceOperationMsg parseFrom(e eVar, h hVar) throws IOException {
            return (RefreshVoiceOperationMsg) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, eVar, hVar);
        }
    }
}
