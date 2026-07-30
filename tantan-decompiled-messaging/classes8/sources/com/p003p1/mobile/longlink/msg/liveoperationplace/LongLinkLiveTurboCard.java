package com.p003p1.mobile.longlink.msg.liveoperationplace;

import com.google.protobuf.ByteString;
import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.a;
import com.google.protobuf.e;
import com.google.protobuf.h;
import com.google.protobuf.q;
import com.momo.xeengine.gift.XEGiftErrorCode;
import com.p003p1.mobile.longlink.msg.livechat.LongLinkChatMessage;
import java.io.IOException;
import java.io.InputStream;
import l.aag0;
import l.bz00;
import l.i860;
import l.o6z;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes8.dex */
public final class LongLinkLiveTurboCard {

    /* JADX INFO: renamed from: com.p1.mobile.longlink.msg.liveoperationplace.LongLinkLiveTurboCard$1 */
    public static /* synthetic */ class C03661 {

        /* JADX INFO: renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f1661xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f1661xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f1661xa1df5c61[GeneratedMessageLite.MethodToInvoke.IS_INITIALIZED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f1661xa1df5c61[GeneratedMessageLite.MethodToInvoke.MAKE_IMMUTABLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f1661xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f1661xa1df5c61[GeneratedMessageLite.MethodToInvoke.VISIT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f1661xa1df5c61[GeneratedMessageLite.MethodToInvoke.MERGE_FROM_STREAM.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f1661xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f1661xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    public interface OperationPlaceOrBuilder extends o6z {
        String getClickAction();

        ByteString getClickActionBytes();

        /* synthetic */ q getDefaultInstanceForType();

        String getIcon();

        ByteString getIconBytes();

        String getId();

        ByteString getIdBytes();

        TurboCardInfo getTurboCardInfo();

        String getType();

        ByteString getTypeBytes();

        String getUrl();

        ByteString getUrlBytes();

        boolean hasTurboCardInfo();

        /* synthetic */ boolean isInitialized();
    }

    public interface TurboCardEventMsgOrBuilder extends o6z {
        /* synthetic */ q getDefaultInstanceForType();

        String getIcon();

        ByteString getIconBytes();

        long getRoomId();

        String getText();

        ByteString getTextBytes();

        /* synthetic */ boolean isInitialized();
    }

    public interface TurboCardInfoOrBuilder extends o6z {
        String getAction();

        ByteString getActionBytes();

        String getCardType();

        ByteString getCardTypeBytes();

        /* synthetic */ q getDefaultInstanceForType();

        long getExposureTimeEnd();

        long getExposureTimeStart();

        String getMsgType();

        ByteString getMsgTypeBytes();

        long getPrepareTimeEnd();

        long getPrepareTimeStart();

        String getRoomId();

        ByteString getRoomIdBytes();

        String getText();

        ByteString getTextBytes();

        long getUserHierarchy();

        String getUserId();

        ByteString getUserIdBytes();

        String getUserMedal();

        ByteString getUserMedalBytes();

        String getUserName();

        ByteString getUserNameBytes();

        String getUserType();

        ByteString getUserTypeBytes();

        /* synthetic */ boolean isInitialized();
    }

    private LongLinkLiveTurboCard() {
    }

    public static void registerAllExtensions(h hVar) {
    }

    public static final class OperationPlace extends GeneratedMessageLite<OperationPlace, Builder> implements OperationPlaceOrBuilder {
        public static final int CLICKACTION_FIELD_NUMBER = 2;
        private static final OperationPlace DEFAULT_INSTANCE;
        public static final int ICON_FIELD_NUMBER = 1;
        public static final int ID_FIELD_NUMBER = 4;
        private static volatile i860<OperationPlace> PARSER = null;
        public static final int TURBOCARDINFO_FIELD_NUMBER = 6;
        public static final int TYPE_FIELD_NUMBER = 5;
        public static final int URL_FIELD_NUMBER = 3;
        private TurboCardInfo turboCardInfo_;
        private String icon_ = "";
        private String clickAction_ = "";
        private String url_ = "";
        private String id_ = "";
        private String type_ = "";

        static {
            OperationPlace operationPlace = new OperationPlace();
            DEFAULT_INSTANCE = operationPlace;
            operationPlace.makeImmutable();
        }

        private OperationPlace() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearClickAction() {
            this.clickAction_ = getDefaultInstance().getClickAction();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearIcon() {
            this.icon_ = getDefaultInstance().getIcon();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearId() {
            this.id_ = getDefaultInstance().getId();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearTurboCardInfo() {
            this.turboCardInfo_ = null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearType() {
            this.type_ = getDefaultInstance().getType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearUrl() {
            this.url_ = getDefaultInstance().getUrl();
        }

        public static OperationPlace getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeTurboCardInfo(TurboCardInfo turboCardInfo) {
            TurboCardInfo turboCardInfo2 = this.turboCardInfo_;
            if (turboCardInfo2 == null || turboCardInfo2 == TurboCardInfo.getDefaultInstance()) {
                this.turboCardInfo_ = turboCardInfo;
            } else {
                this.turboCardInfo_ = (TurboCardInfo) ((TurboCardInfo.Builder) TurboCardInfo.newBuilder(this.turboCardInfo_).mergeFrom(turboCardInfo)).buildPartial();
            }
        }

        public static Builder newBuilder(OperationPlace operationPlace) {
            return (Builder) ((Builder) DEFAULT_INSTANCE.toBuilder()).mergeFrom(operationPlace);
        }

        public static OperationPlace parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (OperationPlace) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static OperationPlace parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (OperationPlace) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static i860<OperationPlace> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setClickAction(String str) {
            str.getClass();
            this.clickAction_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setClickActionBytes(ByteString byteString) {
            byteString.getClass();
            a.checkByteStringIsUtf8(byteString);
            this.clickAction_ = byteString.toStringUtf8();
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
        public void setTurboCardInfo(TurboCardInfo.Builder builder) {
            this.turboCardInfo_ = (TurboCardInfo) builder.build();
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
            switch (C03661.f1661xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new OperationPlace();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                    return null;
                case 4:
                    return new Builder();
                case 5:
                    GeneratedMessageLite.h hVar = (GeneratedMessageLite.h) obj;
                    OperationPlace operationPlace = (OperationPlace) obj2;
                    this.icon_ = hVar.f(!this.icon_.isEmpty(), this.icon_, !operationPlace.icon_.isEmpty(), operationPlace.icon_);
                    this.clickAction_ = hVar.f(!this.clickAction_.isEmpty(), this.clickAction_, !operationPlace.clickAction_.isEmpty(), operationPlace.clickAction_);
                    this.url_ = hVar.f(!this.url_.isEmpty(), this.url_, !operationPlace.url_.isEmpty(), operationPlace.url_);
                    this.id_ = hVar.f(!this.id_.isEmpty(), this.id_, !operationPlace.id_.isEmpty(), operationPlace.id_);
                    this.type_ = hVar.f(!this.type_.isEmpty(), this.type_, true ^ operationPlace.type_.isEmpty(), operationPlace.type_);
                    this.turboCardInfo_ = hVar.o(this.turboCardInfo_, operationPlace.turboCardInfo_);
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
                                    this.icon_ = eVar.L();
                                } else if (iM == 18) {
                                    this.clickAction_ = eVar.L();
                                } else if (iM == 26) {
                                    this.url_ = eVar.L();
                                } else if (iM == 34) {
                                    this.id_ = eVar.L();
                                } else if (iM == 42) {
                                    this.type_ = eVar.L();
                                } else if (iM == 50) {
                                    TurboCardInfo turboCardInfo = this.turboCardInfo_;
                                    TurboCardInfo.Builder builder = turboCardInfo != null ? (TurboCardInfo.Builder) turboCardInfo.toBuilder() : null;
                                    TurboCardInfo turboCardInfoW = eVar.w(TurboCardInfo.parser(), hVar2);
                                    this.turboCardInfo_ = turboCardInfoW;
                                    if (builder != null) {
                                        builder.mergeFrom(turboCardInfoW);
                                        this.turboCardInfo_ = (TurboCardInfo) builder.buildPartial();
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
                        synchronized (OperationPlace.class) {
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

        @Override // com.p1.mobile.longlink.msg.liveoperationplace.LongLinkLiveTurboCard.OperationPlaceOrBuilder
        public String getClickAction() {
            return this.clickAction_;
        }

        @Override // com.p1.mobile.longlink.msg.liveoperationplace.LongLinkLiveTurboCard.OperationPlaceOrBuilder
        public ByteString getClickActionBytes() {
            return ByteString.copyFromUtf8(this.clickAction_);
        }

        @Override // com.p1.mobile.longlink.msg.liveoperationplace.LongLinkLiveTurboCard.OperationPlaceOrBuilder
        public String getIcon() {
            return this.icon_;
        }

        @Override // com.p1.mobile.longlink.msg.liveoperationplace.LongLinkLiveTurboCard.OperationPlaceOrBuilder
        public ByteString getIconBytes() {
            return ByteString.copyFromUtf8(this.icon_);
        }

        @Override // com.p1.mobile.longlink.msg.liveoperationplace.LongLinkLiveTurboCard.OperationPlaceOrBuilder
        public String getId() {
            return this.id_;
        }

        @Override // com.p1.mobile.longlink.msg.liveoperationplace.LongLinkLiveTurboCard.OperationPlaceOrBuilder
        public ByteString getIdBytes() {
            return ByteString.copyFromUtf8(this.id_);
        }

        public int getSerializedSize() {
            int i = ((GeneratedMessageLite) this).memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int iK = !this.icon_.isEmpty() ? CodedOutputStream.K(1, getIcon()) : 0;
            if (!this.clickAction_.isEmpty()) {
                iK += CodedOutputStream.K(2, getClickAction());
            }
            if (!this.url_.isEmpty()) {
                iK += CodedOutputStream.K(3, getUrl());
            }
            if (!this.id_.isEmpty()) {
                iK += CodedOutputStream.K(4, getId());
            }
            if (!this.type_.isEmpty()) {
                iK += CodedOutputStream.K(5, getType());
            }
            if (this.turboCardInfo_ != null) {
                iK += CodedOutputStream.C(6, getTurboCardInfo());
            }
            ((GeneratedMessageLite) this).memoizedSerializedSize = iK;
            return iK;
        }

        @Override // com.p1.mobile.longlink.msg.liveoperationplace.LongLinkLiveTurboCard.OperationPlaceOrBuilder
        public TurboCardInfo getTurboCardInfo() {
            TurboCardInfo turboCardInfo = this.turboCardInfo_;
            return turboCardInfo == null ? TurboCardInfo.getDefaultInstance() : turboCardInfo;
        }

        @Override // com.p1.mobile.longlink.msg.liveoperationplace.LongLinkLiveTurboCard.OperationPlaceOrBuilder
        public String getType() {
            return this.type_;
        }

        @Override // com.p1.mobile.longlink.msg.liveoperationplace.LongLinkLiveTurboCard.OperationPlaceOrBuilder
        public ByteString getTypeBytes() {
            return ByteString.copyFromUtf8(this.type_);
        }

        @Override // com.p1.mobile.longlink.msg.liveoperationplace.LongLinkLiveTurboCard.OperationPlaceOrBuilder
        public String getUrl() {
            return this.url_;
        }

        @Override // com.p1.mobile.longlink.msg.liveoperationplace.LongLinkLiveTurboCard.OperationPlaceOrBuilder
        public ByteString getUrlBytes() {
            return ByteString.copyFromUtf8(this.url_);
        }

        @Override // com.p1.mobile.longlink.msg.liveoperationplace.LongLinkLiveTurboCard.OperationPlaceOrBuilder
        public boolean hasTurboCardInfo() {
            return this.turboCardInfo_ != null;
        }

        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (!this.icon_.isEmpty()) {
                codedOutputStream.D0(1, getIcon());
            }
            if (!this.clickAction_.isEmpty()) {
                codedOutputStream.D0(2, getClickAction());
            }
            if (!this.url_.isEmpty()) {
                codedOutputStream.D0(3, getUrl());
            }
            if (!this.id_.isEmpty()) {
                codedOutputStream.D0(4, getId());
            }
            if (!this.type_.isEmpty()) {
                codedOutputStream.D0(5, getType());
            }
            if (this.turboCardInfo_ != null) {
                codedOutputStream.w0(6, getTurboCardInfo());
            }
        }

        public static OperationPlace parseDelimitedFrom(InputStream inputStream, h hVar) throws IOException {
            return (OperationPlace) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, hVar);
        }

        public static OperationPlace parseFrom(ByteString byteString, h hVar) throws InvalidProtocolBufferException {
            return (OperationPlace) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, hVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTurboCardInfo(TurboCardInfo turboCardInfo) {
            turboCardInfo.getClass();
            this.turboCardInfo_ = turboCardInfo;
        }

        public static final class Builder extends GeneratedMessageLite.b<OperationPlace, Builder> implements OperationPlaceOrBuilder {
            private Builder() {
                super(OperationPlace.DEFAULT_INSTANCE);
            }

            public Builder clearClickAction() {
                copyOnWrite();
                ((OperationPlace) ((GeneratedMessageLite.b) this).instance).clearClickAction();
                return this;
            }

            public Builder clearIcon() {
                copyOnWrite();
                ((OperationPlace) ((GeneratedMessageLite.b) this).instance).clearIcon();
                return this;
            }

            public Builder clearId() {
                copyOnWrite();
                ((OperationPlace) ((GeneratedMessageLite.b) this).instance).clearId();
                return this;
            }

            public Builder clearTurboCardInfo() {
                copyOnWrite();
                ((OperationPlace) ((GeneratedMessageLite.b) this).instance).clearTurboCardInfo();
                return this;
            }

            public Builder clearType() {
                copyOnWrite();
                ((OperationPlace) ((GeneratedMessageLite.b) this).instance).clearType();
                return this;
            }

            public Builder clearUrl() {
                copyOnWrite();
                ((OperationPlace) ((GeneratedMessageLite.b) this).instance).clearUrl();
                return this;
            }

            @Override // com.p1.mobile.longlink.msg.liveoperationplace.LongLinkLiveTurboCard.OperationPlaceOrBuilder
            public String getClickAction() {
                return ((OperationPlace) ((GeneratedMessageLite.b) this).instance).getClickAction();
            }

            @Override // com.p1.mobile.longlink.msg.liveoperationplace.LongLinkLiveTurboCard.OperationPlaceOrBuilder
            public ByteString getClickActionBytes() {
                return ((OperationPlace) ((GeneratedMessageLite.b) this).instance).getClickActionBytes();
            }

            @Override // com.p1.mobile.longlink.msg.liveoperationplace.LongLinkLiveTurboCard.OperationPlaceOrBuilder
            public String getIcon() {
                return ((OperationPlace) ((GeneratedMessageLite.b) this).instance).getIcon();
            }

            @Override // com.p1.mobile.longlink.msg.liveoperationplace.LongLinkLiveTurboCard.OperationPlaceOrBuilder
            public ByteString getIconBytes() {
                return ((OperationPlace) ((GeneratedMessageLite.b) this).instance).getIconBytes();
            }

            @Override // com.p1.mobile.longlink.msg.liveoperationplace.LongLinkLiveTurboCard.OperationPlaceOrBuilder
            public String getId() {
                return ((OperationPlace) ((GeneratedMessageLite.b) this).instance).getId();
            }

            @Override // com.p1.mobile.longlink.msg.liveoperationplace.LongLinkLiveTurboCard.OperationPlaceOrBuilder
            public ByteString getIdBytes() {
                return ((OperationPlace) ((GeneratedMessageLite.b) this).instance).getIdBytes();
            }

            @Override // com.p1.mobile.longlink.msg.liveoperationplace.LongLinkLiveTurboCard.OperationPlaceOrBuilder
            public TurboCardInfo getTurboCardInfo() {
                return ((OperationPlace) ((GeneratedMessageLite.b) this).instance).getTurboCardInfo();
            }

            @Override // com.p1.mobile.longlink.msg.liveoperationplace.LongLinkLiveTurboCard.OperationPlaceOrBuilder
            public String getType() {
                return ((OperationPlace) ((GeneratedMessageLite.b) this).instance).getType();
            }

            @Override // com.p1.mobile.longlink.msg.liveoperationplace.LongLinkLiveTurboCard.OperationPlaceOrBuilder
            public ByteString getTypeBytes() {
                return ((OperationPlace) ((GeneratedMessageLite.b) this).instance).getTypeBytes();
            }

            @Override // com.p1.mobile.longlink.msg.liveoperationplace.LongLinkLiveTurboCard.OperationPlaceOrBuilder
            public String getUrl() {
                return ((OperationPlace) ((GeneratedMessageLite.b) this).instance).getUrl();
            }

            @Override // com.p1.mobile.longlink.msg.liveoperationplace.LongLinkLiveTurboCard.OperationPlaceOrBuilder
            public ByteString getUrlBytes() {
                return ((OperationPlace) ((GeneratedMessageLite.b) this).instance).getUrlBytes();
            }

            @Override // com.p1.mobile.longlink.msg.liveoperationplace.LongLinkLiveTurboCard.OperationPlaceOrBuilder
            public boolean hasTurboCardInfo() {
                return ((OperationPlace) ((GeneratedMessageLite.b) this).instance).hasTurboCardInfo();
            }

            public Builder mergeTurboCardInfo(TurboCardInfo turboCardInfo) {
                copyOnWrite();
                ((OperationPlace) ((GeneratedMessageLite.b) this).instance).mergeTurboCardInfo(turboCardInfo);
                return this;
            }

            public Builder setClickAction(String str) {
                copyOnWrite();
                ((OperationPlace) ((GeneratedMessageLite.b) this).instance).setClickAction(str);
                return this;
            }

            public Builder setClickActionBytes(ByteString byteString) {
                copyOnWrite();
                ((OperationPlace) ((GeneratedMessageLite.b) this).instance).setClickActionBytes(byteString);
                return this;
            }

            public Builder setIcon(String str) {
                copyOnWrite();
                ((OperationPlace) ((GeneratedMessageLite.b) this).instance).setIcon(str);
                return this;
            }

            public Builder setIconBytes(ByteString byteString) {
                copyOnWrite();
                ((OperationPlace) ((GeneratedMessageLite.b) this).instance).setIconBytes(byteString);
                return this;
            }

            public Builder setId(String str) {
                copyOnWrite();
                ((OperationPlace) ((GeneratedMessageLite.b) this).instance).setId(str);
                return this;
            }

            public Builder setIdBytes(ByteString byteString) {
                copyOnWrite();
                ((OperationPlace) ((GeneratedMessageLite.b) this).instance).setIdBytes(byteString);
                return this;
            }

            public Builder setTurboCardInfo(TurboCardInfo turboCardInfo) {
                copyOnWrite();
                ((OperationPlace) ((GeneratedMessageLite.b) this).instance).setTurboCardInfo(turboCardInfo);
                return this;
            }

            public Builder setType(String str) {
                copyOnWrite();
                ((OperationPlace) ((GeneratedMessageLite.b) this).instance).setType(str);
                return this;
            }

            public Builder setTypeBytes(ByteString byteString) {
                copyOnWrite();
                ((OperationPlace) ((GeneratedMessageLite.b) this).instance).setTypeBytes(byteString);
                return this;
            }

            public Builder setUrl(String str) {
                copyOnWrite();
                ((OperationPlace) ((GeneratedMessageLite.b) this).instance).setUrl(str);
                return this;
            }

            public Builder setUrlBytes(ByteString byteString) {
                copyOnWrite();
                ((OperationPlace) ((GeneratedMessageLite.b) this).instance).setUrlBytes(byteString);
                return this;
            }

            public Builder setTurboCardInfo(TurboCardInfo.Builder builder) {
                copyOnWrite();
                ((OperationPlace) ((GeneratedMessageLite.b) this).instance).setTurboCardInfo(builder);
                return this;
            }
        }

        public static OperationPlace parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (OperationPlace) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static OperationPlace parseFrom(byte[] bArr, h hVar) throws InvalidProtocolBufferException {
            return (OperationPlace) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, hVar);
        }

        public static OperationPlace parseFrom(InputStream inputStream) throws IOException {
            return (OperationPlace) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static OperationPlace parseFrom(InputStream inputStream, h hVar) throws IOException {
            return (OperationPlace) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, hVar);
        }

        public static OperationPlace parseFrom(e eVar) throws IOException {
            return (OperationPlace) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, eVar);
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.toBuilder();
        }

        public static OperationPlace parseFrom(e eVar, h hVar) throws IOException {
            return (OperationPlace) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, eVar, hVar);
        }
    }

    public static final class TurboCardEventMsg extends GeneratedMessageLite<TurboCardEventMsg, Builder> implements TurboCardEventMsgOrBuilder {
        private static final TurboCardEventMsg DEFAULT_INSTANCE;
        public static final int ICON_FIELD_NUMBER = 3;
        private static volatile i860<TurboCardEventMsg> PARSER = null;
        public static final int ROOMID_FIELD_NUMBER = 2;
        public static final int TEXT_FIELD_NUMBER = 1;
        private long roomId_;
        private String text_ = "";
        private String icon_ = "";

        public static final class Builder extends GeneratedMessageLite.b<TurboCardEventMsg, Builder> implements TurboCardEventMsgOrBuilder {
            private Builder() {
                super(TurboCardEventMsg.DEFAULT_INSTANCE);
            }

            public Builder clearIcon() {
                copyOnWrite();
                ((TurboCardEventMsg) ((GeneratedMessageLite.b) this).instance).clearIcon();
                return this;
            }

            public Builder clearRoomId() {
                copyOnWrite();
                ((TurboCardEventMsg) ((GeneratedMessageLite.b) this).instance).clearRoomId();
                return this;
            }

            public Builder clearText() {
                copyOnWrite();
                ((TurboCardEventMsg) ((GeneratedMessageLite.b) this).instance).clearText();
                return this;
            }

            @Override // com.p1.mobile.longlink.msg.liveoperationplace.LongLinkLiveTurboCard.TurboCardEventMsgOrBuilder
            public String getIcon() {
                return ((TurboCardEventMsg) ((GeneratedMessageLite.b) this).instance).getIcon();
            }

            @Override // com.p1.mobile.longlink.msg.liveoperationplace.LongLinkLiveTurboCard.TurboCardEventMsgOrBuilder
            public ByteString getIconBytes() {
                return ((TurboCardEventMsg) ((GeneratedMessageLite.b) this).instance).getIconBytes();
            }

            @Override // com.p1.mobile.longlink.msg.liveoperationplace.LongLinkLiveTurboCard.TurboCardEventMsgOrBuilder
            public long getRoomId() {
                return ((TurboCardEventMsg) ((GeneratedMessageLite.b) this).instance).getRoomId();
            }

            @Override // com.p1.mobile.longlink.msg.liveoperationplace.LongLinkLiveTurboCard.TurboCardEventMsgOrBuilder
            public String getText() {
                return ((TurboCardEventMsg) ((GeneratedMessageLite.b) this).instance).getText();
            }

            @Override // com.p1.mobile.longlink.msg.liveoperationplace.LongLinkLiveTurboCard.TurboCardEventMsgOrBuilder
            public ByteString getTextBytes() {
                return ((TurboCardEventMsg) ((GeneratedMessageLite.b) this).instance).getTextBytes();
            }

            public Builder setIcon(String str) {
                copyOnWrite();
                ((TurboCardEventMsg) ((GeneratedMessageLite.b) this).instance).setIcon(str);
                return this;
            }

            public Builder setIconBytes(ByteString byteString) {
                copyOnWrite();
                ((TurboCardEventMsg) ((GeneratedMessageLite.b) this).instance).setIconBytes(byteString);
                return this;
            }

            public Builder setRoomId(long j) {
                copyOnWrite();
                ((TurboCardEventMsg) ((GeneratedMessageLite.b) this).instance).setRoomId(j);
                return this;
            }

            public Builder setText(String str) {
                copyOnWrite();
                ((TurboCardEventMsg) ((GeneratedMessageLite.b) this).instance).setText(str);
                return this;
            }

            public Builder setTextBytes(ByteString byteString) {
                copyOnWrite();
                ((TurboCardEventMsg) ((GeneratedMessageLite.b) this).instance).setTextBytes(byteString);
                return this;
            }
        }

        static {
            TurboCardEventMsg turboCardEventMsg = new TurboCardEventMsg();
            DEFAULT_INSTANCE = turboCardEventMsg;
            turboCardEventMsg.makeImmutable();
        }

        private TurboCardEventMsg() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearIcon() {
            this.icon_ = getDefaultInstance().getIcon();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearRoomId() {
            this.roomId_ = 0L;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearText() {
            this.text_ = getDefaultInstance().getText();
        }

        public static TurboCardEventMsg getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder(TurboCardEventMsg turboCardEventMsg) {
            return (Builder) ((Builder) DEFAULT_INSTANCE.toBuilder()).mergeFrom(turboCardEventMsg);
        }

        public static TurboCardEventMsg parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (TurboCardEventMsg) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static TurboCardEventMsg parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (TurboCardEventMsg) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static i860<TurboCardEventMsg> parser() {
            return DEFAULT_INSTANCE.getParserForType();
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
        public void setRoomId(long j) {
            this.roomId_ = j;
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

        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            boolean z = false;
            switch (C03661.f1661xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new TurboCardEventMsg();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                    return null;
                case 4:
                    return new Builder();
                case 5:
                    GeneratedMessageLite.h hVar = (GeneratedMessageLite.h) obj;
                    TurboCardEventMsg turboCardEventMsg = (TurboCardEventMsg) obj2;
                    this.text_ = hVar.f(!this.text_.isEmpty(), this.text_, !turboCardEventMsg.text_.isEmpty(), turboCardEventMsg.text_);
                    long j = this.roomId_;
                    boolean z2 = j != 0;
                    long j2 = turboCardEventMsg.roomId_;
                    this.roomId_ = hVar.i(z2, j, j2 != 0, j2);
                    this.icon_ = hVar.f(!this.icon_.isEmpty(), this.icon_, !turboCardEventMsg.icon_.isEmpty(), turboCardEventMsg.icon_);
                    GeneratedMessageLite.g gVar = GeneratedMessageLite.g.INSTANCE;
                    return this;
                case 6:
                    e eVar = (e) obj;
                    while (!z) {
                        try {
                            int iM = eVar.M();
                            if (iM != 0) {
                                if (iM == 10) {
                                    this.text_ = eVar.L();
                                } else if (iM == 16) {
                                    this.roomId_ = eVar.v();
                                } else if (iM == 26) {
                                    this.icon_ = eVar.L();
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
                        synchronized (TurboCardEventMsg.class) {
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

        @Override // com.p1.mobile.longlink.msg.liveoperationplace.LongLinkLiveTurboCard.TurboCardEventMsgOrBuilder
        public String getIcon() {
            return this.icon_;
        }

        @Override // com.p1.mobile.longlink.msg.liveoperationplace.LongLinkLiveTurboCard.TurboCardEventMsgOrBuilder
        public ByteString getIconBytes() {
            return ByteString.copyFromUtf8(this.icon_);
        }

        @Override // com.p1.mobile.longlink.msg.liveoperationplace.LongLinkLiveTurboCard.TurboCardEventMsgOrBuilder
        public long getRoomId() {
            return this.roomId_;
        }

        public int getSerializedSize() {
            int i = ((GeneratedMessageLite) this).memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int iK = !this.text_.isEmpty() ? CodedOutputStream.K(1, getText()) : 0;
            long j = this.roomId_;
            if (j != 0) {
                iK += CodedOutputStream.v(2, j);
            }
            if (!this.icon_.isEmpty()) {
                iK += CodedOutputStream.K(3, getIcon());
            }
            ((GeneratedMessageLite) this).memoizedSerializedSize = iK;
            return iK;
        }

        @Override // com.p1.mobile.longlink.msg.liveoperationplace.LongLinkLiveTurboCard.TurboCardEventMsgOrBuilder
        public String getText() {
            return this.text_;
        }

        @Override // com.p1.mobile.longlink.msg.liveoperationplace.LongLinkLiveTurboCard.TurboCardEventMsgOrBuilder
        public ByteString getTextBytes() {
            return ByteString.copyFromUtf8(this.text_);
        }

        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (!this.text_.isEmpty()) {
                codedOutputStream.D0(1, getText());
            }
            long j = this.roomId_;
            if (j != 0) {
                codedOutputStream.u0(2, j);
            }
            if (this.icon_.isEmpty()) {
                return;
            }
            codedOutputStream.D0(3, getIcon());
        }

        public static TurboCardEventMsg parseDelimitedFrom(InputStream inputStream, h hVar) throws IOException {
            return (TurboCardEventMsg) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, hVar);
        }

        public static TurboCardEventMsg parseFrom(ByteString byteString, h hVar) throws InvalidProtocolBufferException {
            return (TurboCardEventMsg) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, hVar);
        }

        public static TurboCardEventMsg parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (TurboCardEventMsg) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static TurboCardEventMsg parseFrom(byte[] bArr, h hVar) throws InvalidProtocolBufferException {
            return (TurboCardEventMsg) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, hVar);
        }

        public static TurboCardEventMsg parseFrom(InputStream inputStream) throws IOException {
            return (TurboCardEventMsg) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static TurboCardEventMsg parseFrom(InputStream inputStream, h hVar) throws IOException {
            return (TurboCardEventMsg) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, hVar);
        }

        public static TurboCardEventMsg parseFrom(e eVar) throws IOException {
            return (TurboCardEventMsg) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, eVar);
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.toBuilder();
        }

        public static TurboCardEventMsg parseFrom(e eVar, h hVar) throws IOException {
            return (TurboCardEventMsg) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, eVar, hVar);
        }
    }

    public static final class TurboCardInfo extends GeneratedMessageLite<TurboCardInfo, Builder> implements TurboCardInfoOrBuilder {
        public static final int ACTION_FIELD_NUMBER = 1;
        public static final int CARDTYPE_FIELD_NUMBER = 14;
        private static final TurboCardInfo DEFAULT_INSTANCE;
        public static final int EXPOSURETIMEEND_FIELD_NUMBER = 5;
        public static final int EXPOSURETIMESTART_FIELD_NUMBER = 4;
        public static final int MSGTYPE_FIELD_NUMBER = 13;
        private static volatile i860<TurboCardInfo> PARSER = null;
        public static final int PREPARETIMEEND_FIELD_NUMBER = 3;
        public static final int PREPARETIMESTART_FIELD_NUMBER = 2;
        public static final int ROOMID_FIELD_NUMBER = 11;
        public static final int TEXT_FIELD_NUMBER = 12;
        public static final int USERHIERARCHY_FIELD_NUMBER = 9;
        public static final int USERID_FIELD_NUMBER = 7;
        public static final int USERMEDAL_FIELD_NUMBER = 10;
        public static final int USERNAME_FIELD_NUMBER = 8;
        public static final int USERTYPE_FIELD_NUMBER = 6;
        private long exposureTimeEnd_;
        private long exposureTimeStart_;
        private long prepareTimeEnd_;
        private long prepareTimeStart_;
        private long userHierarchy_;
        private String action_ = "";
        private String userType_ = "";
        private String userId_ = "";
        private String userName_ = "";
        private String userMedal_ = "";
        private String roomId_ = "";
        private String text_ = "";
        private String msgType_ = "";
        private String cardType_ = "";

        public static final class Builder extends GeneratedMessageLite.b<TurboCardInfo, Builder> implements TurboCardInfoOrBuilder {
            private Builder() {
                super(TurboCardInfo.DEFAULT_INSTANCE);
            }

            public Builder clearAction() {
                copyOnWrite();
                ((TurboCardInfo) ((GeneratedMessageLite.b) this).instance).clearAction();
                return this;
            }

            public Builder clearCardType() {
                copyOnWrite();
                ((TurboCardInfo) ((GeneratedMessageLite.b) this).instance).clearCardType();
                return this;
            }

            public Builder clearExposureTimeEnd() {
                copyOnWrite();
                ((TurboCardInfo) ((GeneratedMessageLite.b) this).instance).clearExposureTimeEnd();
                return this;
            }

            public Builder clearExposureTimeStart() {
                copyOnWrite();
                ((TurboCardInfo) ((GeneratedMessageLite.b) this).instance).clearExposureTimeStart();
                return this;
            }

            public Builder clearMsgType() {
                copyOnWrite();
                ((TurboCardInfo) ((GeneratedMessageLite.b) this).instance).clearMsgType();
                return this;
            }

            public Builder clearPrepareTimeEnd() {
                copyOnWrite();
                ((TurboCardInfo) ((GeneratedMessageLite.b) this).instance).clearPrepareTimeEnd();
                return this;
            }

            public Builder clearPrepareTimeStart() {
                copyOnWrite();
                ((TurboCardInfo) ((GeneratedMessageLite.b) this).instance).clearPrepareTimeStart();
                return this;
            }

            public Builder clearRoomId() {
                copyOnWrite();
                ((TurboCardInfo) ((GeneratedMessageLite.b) this).instance).clearRoomId();
                return this;
            }

            public Builder clearText() {
                copyOnWrite();
                ((TurboCardInfo) ((GeneratedMessageLite.b) this).instance).clearText();
                return this;
            }

            public Builder clearUserHierarchy() {
                copyOnWrite();
                ((TurboCardInfo) ((GeneratedMessageLite.b) this).instance).clearUserHierarchy();
                return this;
            }

            public Builder clearUserId() {
                copyOnWrite();
                ((TurboCardInfo) ((GeneratedMessageLite.b) this).instance).clearUserId();
                return this;
            }

            public Builder clearUserMedal() {
                copyOnWrite();
                ((TurboCardInfo) ((GeneratedMessageLite.b) this).instance).clearUserMedal();
                return this;
            }

            public Builder clearUserName() {
                copyOnWrite();
                ((TurboCardInfo) ((GeneratedMessageLite.b) this).instance).clearUserName();
                return this;
            }

            public Builder clearUserType() {
                copyOnWrite();
                ((TurboCardInfo) ((GeneratedMessageLite.b) this).instance).clearUserType();
                return this;
            }

            @Override // com.p1.mobile.longlink.msg.liveoperationplace.LongLinkLiveTurboCard.TurboCardInfoOrBuilder
            public String getAction() {
                return ((TurboCardInfo) ((GeneratedMessageLite.b) this).instance).getAction();
            }

            @Override // com.p1.mobile.longlink.msg.liveoperationplace.LongLinkLiveTurboCard.TurboCardInfoOrBuilder
            public ByteString getActionBytes() {
                return ((TurboCardInfo) ((GeneratedMessageLite.b) this).instance).getActionBytes();
            }

            @Override // com.p1.mobile.longlink.msg.liveoperationplace.LongLinkLiveTurboCard.TurboCardInfoOrBuilder
            public String getCardType() {
                return ((TurboCardInfo) ((GeneratedMessageLite.b) this).instance).getCardType();
            }

            @Override // com.p1.mobile.longlink.msg.liveoperationplace.LongLinkLiveTurboCard.TurboCardInfoOrBuilder
            public ByteString getCardTypeBytes() {
                return ((TurboCardInfo) ((GeneratedMessageLite.b) this).instance).getCardTypeBytes();
            }

            @Override // com.p1.mobile.longlink.msg.liveoperationplace.LongLinkLiveTurboCard.TurboCardInfoOrBuilder
            public long getExposureTimeEnd() {
                return ((TurboCardInfo) ((GeneratedMessageLite.b) this).instance).getExposureTimeEnd();
            }

            @Override // com.p1.mobile.longlink.msg.liveoperationplace.LongLinkLiveTurboCard.TurboCardInfoOrBuilder
            public long getExposureTimeStart() {
                return ((TurboCardInfo) ((GeneratedMessageLite.b) this).instance).getExposureTimeStart();
            }

            @Override // com.p1.mobile.longlink.msg.liveoperationplace.LongLinkLiveTurboCard.TurboCardInfoOrBuilder
            public String getMsgType() {
                return ((TurboCardInfo) ((GeneratedMessageLite.b) this).instance).getMsgType();
            }

            @Override // com.p1.mobile.longlink.msg.liveoperationplace.LongLinkLiveTurboCard.TurboCardInfoOrBuilder
            public ByteString getMsgTypeBytes() {
                return ((TurboCardInfo) ((GeneratedMessageLite.b) this).instance).getMsgTypeBytes();
            }

            @Override // com.p1.mobile.longlink.msg.liveoperationplace.LongLinkLiveTurboCard.TurboCardInfoOrBuilder
            public long getPrepareTimeEnd() {
                return ((TurboCardInfo) ((GeneratedMessageLite.b) this).instance).getPrepareTimeEnd();
            }

            @Override // com.p1.mobile.longlink.msg.liveoperationplace.LongLinkLiveTurboCard.TurboCardInfoOrBuilder
            public long getPrepareTimeStart() {
                return ((TurboCardInfo) ((GeneratedMessageLite.b) this).instance).getPrepareTimeStart();
            }

            @Override // com.p1.mobile.longlink.msg.liveoperationplace.LongLinkLiveTurboCard.TurboCardInfoOrBuilder
            public String getRoomId() {
                return ((TurboCardInfo) ((GeneratedMessageLite.b) this).instance).getRoomId();
            }

            @Override // com.p1.mobile.longlink.msg.liveoperationplace.LongLinkLiveTurboCard.TurboCardInfoOrBuilder
            public ByteString getRoomIdBytes() {
                return ((TurboCardInfo) ((GeneratedMessageLite.b) this).instance).getRoomIdBytes();
            }

            @Override // com.p1.mobile.longlink.msg.liveoperationplace.LongLinkLiveTurboCard.TurboCardInfoOrBuilder
            public String getText() {
                return ((TurboCardInfo) ((GeneratedMessageLite.b) this).instance).getText();
            }

            @Override // com.p1.mobile.longlink.msg.liveoperationplace.LongLinkLiveTurboCard.TurboCardInfoOrBuilder
            public ByteString getTextBytes() {
                return ((TurboCardInfo) ((GeneratedMessageLite.b) this).instance).getTextBytes();
            }

            @Override // com.p1.mobile.longlink.msg.liveoperationplace.LongLinkLiveTurboCard.TurboCardInfoOrBuilder
            public long getUserHierarchy() {
                return ((TurboCardInfo) ((GeneratedMessageLite.b) this).instance).getUserHierarchy();
            }

            @Override // com.p1.mobile.longlink.msg.liveoperationplace.LongLinkLiveTurboCard.TurboCardInfoOrBuilder
            public String getUserId() {
                return ((TurboCardInfo) ((GeneratedMessageLite.b) this).instance).getUserId();
            }

            @Override // com.p1.mobile.longlink.msg.liveoperationplace.LongLinkLiveTurboCard.TurboCardInfoOrBuilder
            public ByteString getUserIdBytes() {
                return ((TurboCardInfo) ((GeneratedMessageLite.b) this).instance).getUserIdBytes();
            }

            @Override // com.p1.mobile.longlink.msg.liveoperationplace.LongLinkLiveTurboCard.TurboCardInfoOrBuilder
            public String getUserMedal() {
                return ((TurboCardInfo) ((GeneratedMessageLite.b) this).instance).getUserMedal();
            }

            @Override // com.p1.mobile.longlink.msg.liveoperationplace.LongLinkLiveTurboCard.TurboCardInfoOrBuilder
            public ByteString getUserMedalBytes() {
                return ((TurboCardInfo) ((GeneratedMessageLite.b) this).instance).getUserMedalBytes();
            }

            @Override // com.p1.mobile.longlink.msg.liveoperationplace.LongLinkLiveTurboCard.TurboCardInfoOrBuilder
            public String getUserName() {
                return ((TurboCardInfo) ((GeneratedMessageLite.b) this).instance).getUserName();
            }

            @Override // com.p1.mobile.longlink.msg.liveoperationplace.LongLinkLiveTurboCard.TurboCardInfoOrBuilder
            public ByteString getUserNameBytes() {
                return ((TurboCardInfo) ((GeneratedMessageLite.b) this).instance).getUserNameBytes();
            }

            @Override // com.p1.mobile.longlink.msg.liveoperationplace.LongLinkLiveTurboCard.TurboCardInfoOrBuilder
            public String getUserType() {
                return ((TurboCardInfo) ((GeneratedMessageLite.b) this).instance).getUserType();
            }

            @Override // com.p1.mobile.longlink.msg.liveoperationplace.LongLinkLiveTurboCard.TurboCardInfoOrBuilder
            public ByteString getUserTypeBytes() {
                return ((TurboCardInfo) ((GeneratedMessageLite.b) this).instance).getUserTypeBytes();
            }

            public Builder setAction(String str) {
                copyOnWrite();
                ((TurboCardInfo) ((GeneratedMessageLite.b) this).instance).setAction(str);
                return this;
            }

            public Builder setActionBytes(ByteString byteString) {
                copyOnWrite();
                ((TurboCardInfo) ((GeneratedMessageLite.b) this).instance).setActionBytes(byteString);
                return this;
            }

            public Builder setCardType(String str) {
                copyOnWrite();
                ((TurboCardInfo) ((GeneratedMessageLite.b) this).instance).setCardType(str);
                return this;
            }

            public Builder setCardTypeBytes(ByteString byteString) {
                copyOnWrite();
                ((TurboCardInfo) ((GeneratedMessageLite.b) this).instance).setCardTypeBytes(byteString);
                return this;
            }

            public Builder setExposureTimeEnd(long j) {
                copyOnWrite();
                ((TurboCardInfo) ((GeneratedMessageLite.b) this).instance).setExposureTimeEnd(j);
                return this;
            }

            public Builder setExposureTimeStart(long j) {
                copyOnWrite();
                ((TurboCardInfo) ((GeneratedMessageLite.b) this).instance).setExposureTimeStart(j);
                return this;
            }

            public Builder setMsgType(String str) {
                copyOnWrite();
                ((TurboCardInfo) ((GeneratedMessageLite.b) this).instance).setMsgType(str);
                return this;
            }

            public Builder setMsgTypeBytes(ByteString byteString) {
                copyOnWrite();
                ((TurboCardInfo) ((GeneratedMessageLite.b) this).instance).setMsgTypeBytes(byteString);
                return this;
            }

            public Builder setPrepareTimeEnd(long j) {
                copyOnWrite();
                ((TurboCardInfo) ((GeneratedMessageLite.b) this).instance).setPrepareTimeEnd(j);
                return this;
            }

            public Builder setPrepareTimeStart(long j) {
                copyOnWrite();
                ((TurboCardInfo) ((GeneratedMessageLite.b) this).instance).setPrepareTimeStart(j);
                return this;
            }

            public Builder setRoomId(String str) {
                copyOnWrite();
                ((TurboCardInfo) ((GeneratedMessageLite.b) this).instance).setRoomId(str);
                return this;
            }

            public Builder setRoomIdBytes(ByteString byteString) {
                copyOnWrite();
                ((TurboCardInfo) ((GeneratedMessageLite.b) this).instance).setRoomIdBytes(byteString);
                return this;
            }

            public Builder setText(String str) {
                copyOnWrite();
                ((TurboCardInfo) ((GeneratedMessageLite.b) this).instance).setText(str);
                return this;
            }

            public Builder setTextBytes(ByteString byteString) {
                copyOnWrite();
                ((TurboCardInfo) ((GeneratedMessageLite.b) this).instance).setTextBytes(byteString);
                return this;
            }

            public Builder setUserHierarchy(long j) {
                copyOnWrite();
                ((TurboCardInfo) ((GeneratedMessageLite.b) this).instance).setUserHierarchy(j);
                return this;
            }

            public Builder setUserId(String str) {
                copyOnWrite();
                ((TurboCardInfo) ((GeneratedMessageLite.b) this).instance).setUserId(str);
                return this;
            }

            public Builder setUserIdBytes(ByteString byteString) {
                copyOnWrite();
                ((TurboCardInfo) ((GeneratedMessageLite.b) this).instance).setUserIdBytes(byteString);
                return this;
            }

            public Builder setUserMedal(String str) {
                copyOnWrite();
                ((TurboCardInfo) ((GeneratedMessageLite.b) this).instance).setUserMedal(str);
                return this;
            }

            public Builder setUserMedalBytes(ByteString byteString) {
                copyOnWrite();
                ((TurboCardInfo) ((GeneratedMessageLite.b) this).instance).setUserMedalBytes(byteString);
                return this;
            }

            public Builder setUserName(String str) {
                copyOnWrite();
                ((TurboCardInfo) ((GeneratedMessageLite.b) this).instance).setUserName(str);
                return this;
            }

            public Builder setUserNameBytes(ByteString byteString) {
                copyOnWrite();
                ((TurboCardInfo) ((GeneratedMessageLite.b) this).instance).setUserNameBytes(byteString);
                return this;
            }

            public Builder setUserType(String str) {
                copyOnWrite();
                ((TurboCardInfo) ((GeneratedMessageLite.b) this).instance).setUserType(str);
                return this;
            }

            public Builder setUserTypeBytes(ByteString byteString) {
                copyOnWrite();
                ((TurboCardInfo) ((GeneratedMessageLite.b) this).instance).setUserTypeBytes(byteString);
                return this;
            }
        }

        static {
            TurboCardInfo turboCardInfo = new TurboCardInfo();
            DEFAULT_INSTANCE = turboCardInfo;
            turboCardInfo.makeImmutable();
        }

        private TurboCardInfo() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAction() {
            this.action_ = getDefaultInstance().getAction();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearCardType() {
            this.cardType_ = getDefaultInstance().getCardType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearExposureTimeEnd() {
            this.exposureTimeEnd_ = 0L;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearExposureTimeStart() {
            this.exposureTimeStart_ = 0L;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearMsgType() {
            this.msgType_ = getDefaultInstance().getMsgType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearPrepareTimeEnd() {
            this.prepareTimeEnd_ = 0L;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearPrepareTimeStart() {
            this.prepareTimeStart_ = 0L;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearRoomId() {
            this.roomId_ = getDefaultInstance().getRoomId();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearText() {
            this.text_ = getDefaultInstance().getText();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearUserHierarchy() {
            this.userHierarchy_ = 0L;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearUserId() {
            this.userId_ = getDefaultInstance().getUserId();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearUserMedal() {
            this.userMedal_ = getDefaultInstance().getUserMedal();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearUserName() {
            this.userName_ = getDefaultInstance().getUserName();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearUserType() {
            this.userType_ = getDefaultInstance().getUserType();
        }

        public static TurboCardInfo getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder(TurboCardInfo turboCardInfo) {
            return (Builder) ((Builder) DEFAULT_INSTANCE.toBuilder()).mergeFrom(turboCardInfo);
        }

        public static TurboCardInfo parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (TurboCardInfo) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static TurboCardInfo parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (TurboCardInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static i860<TurboCardInfo> parser() {
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
            a.checkByteStringIsUtf8(byteString);
            this.action_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setCardType(String str) {
            str.getClass();
            this.cardType_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setCardTypeBytes(ByteString byteString) {
            byteString.getClass();
            a.checkByteStringIsUtf8(byteString);
            this.cardType_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setExposureTimeEnd(long j) {
            this.exposureTimeEnd_ = j;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setExposureTimeStart(long j) {
            this.exposureTimeStart_ = j;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setMsgType(String str) {
            str.getClass();
            this.msgType_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setMsgTypeBytes(ByteString byteString) {
            byteString.getClass();
            a.checkByteStringIsUtf8(byteString);
            this.msgType_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setPrepareTimeEnd(long j) {
            this.prepareTimeEnd_ = j;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setPrepareTimeStart(long j) {
            this.prepareTimeStart_ = j;
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
        public void setUserHierarchy(long j) {
            this.userHierarchy_ = j;
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
        public void setUserMedal(String str) {
            str.getClass();
            this.userMedal_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setUserMedalBytes(ByteString byteString) {
            byteString.getClass();
            a.checkByteStringIsUtf8(byteString);
            this.userMedal_ = byteString.toStringUtf8();
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

        /* JADX INFO: Access modifiers changed from: private */
        public void setUserType(String str) {
            str.getClass();
            this.userType_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setUserTypeBytes(ByteString byteString) {
            byteString.getClass();
            a.checkByteStringIsUtf8(byteString);
            this.userType_ = byteString.toStringUtf8();
        }

        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            boolean z = false;
            switch (C03661.f1661xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new TurboCardInfo();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                    return null;
                case 4:
                    return new Builder();
                case 5:
                    GeneratedMessageLite.h hVar = (GeneratedMessageLite.h) obj;
                    TurboCardInfo turboCardInfo = (TurboCardInfo) obj2;
                    this.action_ = hVar.f(!this.action_.isEmpty(), this.action_, !turboCardInfo.action_.isEmpty(), turboCardInfo.action_);
                    long j = this.prepareTimeStart_;
                    boolean z2 = j != 0;
                    long j2 = turboCardInfo.prepareTimeStart_;
                    this.prepareTimeStart_ = hVar.i(z2, j, j2 != 0, j2);
                    long j3 = this.prepareTimeEnd_;
                    boolean z3 = j3 != 0;
                    long j4 = turboCardInfo.prepareTimeEnd_;
                    this.prepareTimeEnd_ = hVar.i(z3, j3, j4 != 0, j4);
                    long j5 = this.exposureTimeStart_;
                    boolean z4 = j5 != 0;
                    long j6 = turboCardInfo.exposureTimeStart_;
                    this.exposureTimeStart_ = hVar.i(z4, j5, j6 != 0, j6);
                    long j7 = this.exposureTimeEnd_;
                    boolean z5 = j7 != 0;
                    long j8 = turboCardInfo.exposureTimeEnd_;
                    this.exposureTimeEnd_ = hVar.i(z5, j7, j8 != 0, j8);
                    this.userType_ = hVar.f(!this.userType_.isEmpty(), this.userType_, !turboCardInfo.userType_.isEmpty(), turboCardInfo.userType_);
                    this.userId_ = hVar.f(!this.userId_.isEmpty(), this.userId_, !turboCardInfo.userId_.isEmpty(), turboCardInfo.userId_);
                    this.userName_ = hVar.f(!this.userName_.isEmpty(), this.userName_, !turboCardInfo.userName_.isEmpty(), turboCardInfo.userName_);
                    long j9 = this.userHierarchy_;
                    boolean z6 = j9 != 0;
                    long j10 = turboCardInfo.userHierarchy_;
                    this.userHierarchy_ = hVar.i(z6, j9, j10 != 0, j10);
                    this.userMedal_ = hVar.f(!this.userMedal_.isEmpty(), this.userMedal_, !turboCardInfo.userMedal_.isEmpty(), turboCardInfo.userMedal_);
                    this.roomId_ = hVar.f(!this.roomId_.isEmpty(), this.roomId_, !turboCardInfo.roomId_.isEmpty(), turboCardInfo.roomId_);
                    this.text_ = hVar.f(!this.text_.isEmpty(), this.text_, !turboCardInfo.text_.isEmpty(), turboCardInfo.text_);
                    this.msgType_ = hVar.f(!this.msgType_.isEmpty(), this.msgType_, !turboCardInfo.msgType_.isEmpty(), turboCardInfo.msgType_);
                    this.cardType_ = hVar.f(!this.cardType_.isEmpty(), this.cardType_, !turboCardInfo.cardType_.isEmpty(), turboCardInfo.cardType_);
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
                                    this.action_ = eVar.L();
                                    continue;
                                case 16:
                                    this.prepareTimeStart_ = eVar.v();
                                    continue;
                                case 24:
                                    this.prepareTimeEnd_ = eVar.v();
                                    continue;
                                case LongLinkChatMessage.LiveChatMessage.SOURCE_FIELD_NUMBER /* 32 */:
                                    this.exposureTimeStart_ = eVar.v();
                                    continue;
                                case 40:
                                    this.exposureTimeEnd_ = eVar.v();
                                    continue;
                                case 50:
                                    this.userType_ = eVar.L();
                                    continue;
                                case 58:
                                    this.userId_ = eVar.L();
                                    continue;
                                case 66:
                                    this.userName_ = eVar.L();
                                    continue;
                                case 72:
                                    this.userHierarchy_ = eVar.v();
                                    continue;
                                case 82:
                                    this.userMedal_ = eVar.L();
                                    continue;
                                case 90:
                                    this.roomId_ = eVar.L();
                                    continue;
                                case 98:
                                    this.text_ = eVar.L();
                                    continue;
                                case 106:
                                    this.msgType_ = eVar.L();
                                    continue;
                                case XEGiftErrorCode.ERROR_CODE_VIDEO_TIMEOUT /* 114 */:
                                    this.cardType_ = eVar.L();
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
                        synchronized (TurboCardInfo.class) {
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

        @Override // com.p1.mobile.longlink.msg.liveoperationplace.LongLinkLiveTurboCard.TurboCardInfoOrBuilder
        public String getAction() {
            return this.action_;
        }

        @Override // com.p1.mobile.longlink.msg.liveoperationplace.LongLinkLiveTurboCard.TurboCardInfoOrBuilder
        public ByteString getActionBytes() {
            return ByteString.copyFromUtf8(this.action_);
        }

        @Override // com.p1.mobile.longlink.msg.liveoperationplace.LongLinkLiveTurboCard.TurboCardInfoOrBuilder
        public String getCardType() {
            return this.cardType_;
        }

        @Override // com.p1.mobile.longlink.msg.liveoperationplace.LongLinkLiveTurboCard.TurboCardInfoOrBuilder
        public ByteString getCardTypeBytes() {
            return ByteString.copyFromUtf8(this.cardType_);
        }

        @Override // com.p1.mobile.longlink.msg.liveoperationplace.LongLinkLiveTurboCard.TurboCardInfoOrBuilder
        public long getExposureTimeEnd() {
            return this.exposureTimeEnd_;
        }

        @Override // com.p1.mobile.longlink.msg.liveoperationplace.LongLinkLiveTurboCard.TurboCardInfoOrBuilder
        public long getExposureTimeStart() {
            return this.exposureTimeStart_;
        }

        @Override // com.p1.mobile.longlink.msg.liveoperationplace.LongLinkLiveTurboCard.TurboCardInfoOrBuilder
        public String getMsgType() {
            return this.msgType_;
        }

        @Override // com.p1.mobile.longlink.msg.liveoperationplace.LongLinkLiveTurboCard.TurboCardInfoOrBuilder
        public ByteString getMsgTypeBytes() {
            return ByteString.copyFromUtf8(this.msgType_);
        }

        @Override // com.p1.mobile.longlink.msg.liveoperationplace.LongLinkLiveTurboCard.TurboCardInfoOrBuilder
        public long getPrepareTimeEnd() {
            return this.prepareTimeEnd_;
        }

        @Override // com.p1.mobile.longlink.msg.liveoperationplace.LongLinkLiveTurboCard.TurboCardInfoOrBuilder
        public long getPrepareTimeStart() {
            return this.prepareTimeStart_;
        }

        @Override // com.p1.mobile.longlink.msg.liveoperationplace.LongLinkLiveTurboCard.TurboCardInfoOrBuilder
        public String getRoomId() {
            return this.roomId_;
        }

        @Override // com.p1.mobile.longlink.msg.liveoperationplace.LongLinkLiveTurboCard.TurboCardInfoOrBuilder
        public ByteString getRoomIdBytes() {
            return ByteString.copyFromUtf8(this.roomId_);
        }

        public int getSerializedSize() {
            int i = ((GeneratedMessageLite) this).memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int iK = !this.action_.isEmpty() ? CodedOutputStream.K(1, getAction()) : 0;
            long j = this.prepareTimeStart_;
            if (j != 0) {
                iK += CodedOutputStream.v(2, j);
            }
            long j2 = this.prepareTimeEnd_;
            if (j2 != 0) {
                iK += CodedOutputStream.v(3, j2);
            }
            long j3 = this.exposureTimeStart_;
            if (j3 != 0) {
                iK += CodedOutputStream.v(4, j3);
            }
            long j4 = this.exposureTimeEnd_;
            if (j4 != 0) {
                iK += CodedOutputStream.v(5, j4);
            }
            if (!this.userType_.isEmpty()) {
                iK += CodedOutputStream.K(6, getUserType());
            }
            if (!this.userId_.isEmpty()) {
                iK += CodedOutputStream.K(7, getUserId());
            }
            if (!this.userName_.isEmpty()) {
                iK += CodedOutputStream.K(8, getUserName());
            }
            long j5 = this.userHierarchy_;
            if (j5 != 0) {
                iK += CodedOutputStream.v(9, j5);
            }
            if (!this.userMedal_.isEmpty()) {
                iK += CodedOutputStream.K(10, getUserMedal());
            }
            if (!this.roomId_.isEmpty()) {
                iK += CodedOutputStream.K(11, getRoomId());
            }
            if (!this.text_.isEmpty()) {
                iK += CodedOutputStream.K(12, getText());
            }
            if (!this.msgType_.isEmpty()) {
                iK += CodedOutputStream.K(13, getMsgType());
            }
            if (!this.cardType_.isEmpty()) {
                iK += CodedOutputStream.K(14, getCardType());
            }
            ((GeneratedMessageLite) this).memoizedSerializedSize = iK;
            return iK;
        }

        @Override // com.p1.mobile.longlink.msg.liveoperationplace.LongLinkLiveTurboCard.TurboCardInfoOrBuilder
        public String getText() {
            return this.text_;
        }

        @Override // com.p1.mobile.longlink.msg.liveoperationplace.LongLinkLiveTurboCard.TurboCardInfoOrBuilder
        public ByteString getTextBytes() {
            return ByteString.copyFromUtf8(this.text_);
        }

        @Override // com.p1.mobile.longlink.msg.liveoperationplace.LongLinkLiveTurboCard.TurboCardInfoOrBuilder
        public long getUserHierarchy() {
            return this.userHierarchy_;
        }

        @Override // com.p1.mobile.longlink.msg.liveoperationplace.LongLinkLiveTurboCard.TurboCardInfoOrBuilder
        public String getUserId() {
            return this.userId_;
        }

        @Override // com.p1.mobile.longlink.msg.liveoperationplace.LongLinkLiveTurboCard.TurboCardInfoOrBuilder
        public ByteString getUserIdBytes() {
            return ByteString.copyFromUtf8(this.userId_);
        }

        @Override // com.p1.mobile.longlink.msg.liveoperationplace.LongLinkLiveTurboCard.TurboCardInfoOrBuilder
        public String getUserMedal() {
            return this.userMedal_;
        }

        @Override // com.p1.mobile.longlink.msg.liveoperationplace.LongLinkLiveTurboCard.TurboCardInfoOrBuilder
        public ByteString getUserMedalBytes() {
            return ByteString.copyFromUtf8(this.userMedal_);
        }

        @Override // com.p1.mobile.longlink.msg.liveoperationplace.LongLinkLiveTurboCard.TurboCardInfoOrBuilder
        public String getUserName() {
            return this.userName_;
        }

        @Override // com.p1.mobile.longlink.msg.liveoperationplace.LongLinkLiveTurboCard.TurboCardInfoOrBuilder
        public ByteString getUserNameBytes() {
            return ByteString.copyFromUtf8(this.userName_);
        }

        @Override // com.p1.mobile.longlink.msg.liveoperationplace.LongLinkLiveTurboCard.TurboCardInfoOrBuilder
        public String getUserType() {
            return this.userType_;
        }

        @Override // com.p1.mobile.longlink.msg.liveoperationplace.LongLinkLiveTurboCard.TurboCardInfoOrBuilder
        public ByteString getUserTypeBytes() {
            return ByteString.copyFromUtf8(this.userType_);
        }

        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (!this.action_.isEmpty()) {
                codedOutputStream.D0(1, getAction());
            }
            long j = this.prepareTimeStart_;
            if (j != 0) {
                codedOutputStream.u0(2, j);
            }
            long j2 = this.prepareTimeEnd_;
            if (j2 != 0) {
                codedOutputStream.u0(3, j2);
            }
            long j3 = this.exposureTimeStart_;
            if (j3 != 0) {
                codedOutputStream.u0(4, j3);
            }
            long j4 = this.exposureTimeEnd_;
            if (j4 != 0) {
                codedOutputStream.u0(5, j4);
            }
            if (!this.userType_.isEmpty()) {
                codedOutputStream.D0(6, getUserType());
            }
            if (!this.userId_.isEmpty()) {
                codedOutputStream.D0(7, getUserId());
            }
            if (!this.userName_.isEmpty()) {
                codedOutputStream.D0(8, getUserName());
            }
            long j5 = this.userHierarchy_;
            if (j5 != 0) {
                codedOutputStream.u0(9, j5);
            }
            if (!this.userMedal_.isEmpty()) {
                codedOutputStream.D0(10, getUserMedal());
            }
            if (!this.roomId_.isEmpty()) {
                codedOutputStream.D0(11, getRoomId());
            }
            if (!this.text_.isEmpty()) {
                codedOutputStream.D0(12, getText());
            }
            if (!this.msgType_.isEmpty()) {
                codedOutputStream.D0(13, getMsgType());
            }
            if (this.cardType_.isEmpty()) {
                return;
            }
            codedOutputStream.D0(14, getCardType());
        }

        public static TurboCardInfo parseDelimitedFrom(InputStream inputStream, h hVar) throws IOException {
            return (TurboCardInfo) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, hVar);
        }

        public static TurboCardInfo parseFrom(ByteString byteString, h hVar) throws InvalidProtocolBufferException {
            return (TurboCardInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, hVar);
        }

        public static TurboCardInfo parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (TurboCardInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static TurboCardInfo parseFrom(byte[] bArr, h hVar) throws InvalidProtocolBufferException {
            return (TurboCardInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, hVar);
        }

        public static TurboCardInfo parseFrom(InputStream inputStream) throws IOException {
            return (TurboCardInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static TurboCardInfo parseFrom(InputStream inputStream, h hVar) throws IOException {
            return (TurboCardInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, hVar);
        }

        public static TurboCardInfo parseFrom(e eVar) throws IOException {
            return (TurboCardInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, eVar);
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.toBuilder();
        }

        public static TurboCardInfo parseFrom(e eVar, h hVar) throws IOException {
            return (TurboCardInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, eVar, hVar);
        }
    }
}
