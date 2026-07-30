package com.p003p1.mobile.longlink.msg.liveConnector;

import com.google.protobuf.Any;
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
import com.p003p1.mobile.longlink.msg.livechat.LongLinkChatMessage;
import java.io.IOException;
import java.io.InputStream;
import java.util.Collections;
import java.util.List;
import l.aag0;
import l.bz00;
import l.i860;
import l.o6z;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes8.dex */
public final class liveAuthMessageNew {

    /* JADX INFO: renamed from: com.p1.mobile.longlink.msg.liveConnector.liveAuthMessageNew$1 */
    public static /* synthetic */ class C03411 {

        /* JADX INFO: renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f1649xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f1649xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f1649xa1df5c61[GeneratedMessageLite.MethodToInvoke.IS_INITIALIZED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f1649xa1df5c61[GeneratedMessageLite.MethodToInvoke.MAKE_IMMUTABLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f1649xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f1649xa1df5c61[GeneratedMessageLite.MethodToInvoke.VISIT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f1649xa1df5c61[GeneratedMessageLite.MethodToInvoke.MERGE_FROM_STREAM.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f1649xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f1649xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    public interface AckOrBuilder extends o6z {
        /* synthetic */ q getDefaultInstanceForType();

        String getMsgId();

        ByteString getMsgIdBytes();

        String getMsgTypeName();

        ByteString getMsgTypeNameBytes();

        long getRecvTimestamp();

        /* synthetic */ boolean isInitialized();
    }

    public interface AuthKeyOrBuilder extends o6z {
        /* synthetic */ q getDefaultInstanceForType();

        String getRoomKey();

        ByteString getRoomKeyBytes();

        /* synthetic */ boolean isInitialized();
    }

    public interface AuthOrBuilder extends o6z {
        long getCurrentStartLinkTime();

        long getCurrentTime();

        /* synthetic */ q getDefaultInstanceForType();

        String getEnterSource();

        ByteString getEnterSourceBytes();

        String getExt();

        ByteString getExtBytes();

        long getFirstLinkTime();

        ByteString getFlag();

        long getInterruptLinkTime();

        boolean getIosVerify();

        String getIpHost();

        ByteString getIpHostBytes();

        int getLinkState();

        String getLiveId();

        ByteString getLiveIdBytes();

        String getLiveMode();

        ByteString getLiveModeBytes();

        Location getLoc();

        String getLocale();

        ByteString getLocaleBytes();

        int getRetryCount();

        String getRoomId();

        ByteString getRoomIdBytes();

        String getRoomType();

        ByteString getRoomTypeBytes();

        String getSessionId();

        ByteString getSessionIdBytes();

        ClientSourceEnum getSource();

        int getSourceValue();

        AppStaySideEnum getStaySide();

        int getStaySideValue();

        UserAgent getUa();

        String getUserId();

        ByteString getUserIdBytes();

        ByteString getXTTClientInfo();

        ByteString getXTestingGroup();

        boolean hasLoc();

        boolean hasUa();

        /* synthetic */ boolean isInitialized();
    }

    public interface ChatReadedOrBuilder extends o6z {
        /* synthetic */ q getDefaultInstanceForType();

        long getSeq();

        /* synthetic */ boolean isInitialized();
    }

    public interface LocationOrBuilder extends o6z {
        /* synthetic */ q getDefaultInstanceForType();

        float getLat();

        float getLon();

        /* synthetic */ boolean isInitialized();
    }

    public interface MsgOrBuilder extends o6z {
        Any getData();

        /* synthetic */ q getDefaultInstanceForType();

        boolean getIsResponse();

        String getMsgId();

        ByteString getMsgIdBytes();

        String getMsgTypeName();

        ByteString getMsgTypeNameBytes();

        Status getStatus();

        int getVersion();

        boolean hasData();

        boolean hasStatus();

        /* synthetic */ boolean isInitialized();
    }

    public interface MsgsOrBuilder extends o6z {
        /* synthetic */ q getDefaultInstanceForType();

        Msg getMsgs(int i);

        int getMsgsCount();

        List<Msg> getMsgsList();

        /* synthetic */ boolean isInitialized();
    }

    public interface MultiDeviceOrBuilder extends o6z {
        /* synthetic */ q getDefaultInstanceForType();

        ByteString getMsg();

        /* synthetic */ boolean isInitialized();
    }

    public interface StatusOrBuilder extends o6z {
        /* synthetic */ q getDefaultInstanceForType();

        boolean getNeedAck();

        long getRecvTs();

        int getStatus();

        /* synthetic */ boolean isInitialized();
    }

    public interface SwitchSideOrBuilder extends o6z {
        /* synthetic */ q getDefaultInstanceForType();

        AppStaySideEnum getToSide();

        int getToSideValue();

        /* synthetic */ boolean isInitialized();
    }

    public interface UserAgentOrBuilder extends o6z {
        String getAppVersion();

        ByteString getAppVersionBytes();

        String getBrand();

        ByteString getBrandBytes();

        /* synthetic */ q getDefaultInstanceForType();

        String getModel();

        ByteString getModelBytes();

        ClientSourceEnum getSource();

        int getSourceValue();

        String getSourceVersion();

        ByteString getSourceVersionBytes();

        /* synthetic */ boolean isInitialized();
    }

    private liveAuthMessageNew() {
    }

    public static void registerAllExtensions(h hVar) {
    }

    public static final class Ack extends GeneratedMessageLite<Ack, Builder> implements AckOrBuilder {
        private static final Ack DEFAULT_INSTANCE;
        public static final int MSGID_FIELD_NUMBER = 1;
        public static final int MSGTYPENAME_FIELD_NUMBER = 2;
        private static volatile i860<Ack> PARSER = null;
        public static final int RECVTIMESTAMP_FIELD_NUMBER = 3;
        private String msgId_ = "";
        private String msgTypeName_ = "";
        private long recvTimestamp_;

        public static final class Builder extends GeneratedMessageLite.b<Ack, Builder> implements AckOrBuilder {
            private Builder() {
                super(Ack.DEFAULT_INSTANCE);
            }

            public Builder clearMsgId() {
                copyOnWrite();
                ((Ack) ((GeneratedMessageLite.b) this).instance).clearMsgId();
                return this;
            }

            public Builder clearMsgTypeName() {
                copyOnWrite();
                ((Ack) ((GeneratedMessageLite.b) this).instance).clearMsgTypeName();
                return this;
            }

            public Builder clearRecvTimestamp() {
                copyOnWrite();
                ((Ack) ((GeneratedMessageLite.b) this).instance).clearRecvTimestamp();
                return this;
            }

            @Override // com.p1.mobile.longlink.msg.liveConnector.liveAuthMessageNew.AckOrBuilder
            public String getMsgId() {
                return ((Ack) ((GeneratedMessageLite.b) this).instance).getMsgId();
            }

            @Override // com.p1.mobile.longlink.msg.liveConnector.liveAuthMessageNew.AckOrBuilder
            public ByteString getMsgIdBytes() {
                return ((Ack) ((GeneratedMessageLite.b) this).instance).getMsgIdBytes();
            }

            @Override // com.p1.mobile.longlink.msg.liveConnector.liveAuthMessageNew.AckOrBuilder
            public String getMsgTypeName() {
                return ((Ack) ((GeneratedMessageLite.b) this).instance).getMsgTypeName();
            }

            @Override // com.p1.mobile.longlink.msg.liveConnector.liveAuthMessageNew.AckOrBuilder
            public ByteString getMsgTypeNameBytes() {
                return ((Ack) ((GeneratedMessageLite.b) this).instance).getMsgTypeNameBytes();
            }

            @Override // com.p1.mobile.longlink.msg.liveConnector.liveAuthMessageNew.AckOrBuilder
            public long getRecvTimestamp() {
                return ((Ack) ((GeneratedMessageLite.b) this).instance).getRecvTimestamp();
            }

            public Builder setMsgId(String str) {
                copyOnWrite();
                ((Ack) ((GeneratedMessageLite.b) this).instance).setMsgId(str);
                return this;
            }

            public Builder setMsgIdBytes(ByteString byteString) {
                copyOnWrite();
                ((Ack) ((GeneratedMessageLite.b) this).instance).setMsgIdBytes(byteString);
                return this;
            }

            public Builder setMsgTypeName(String str) {
                copyOnWrite();
                ((Ack) ((GeneratedMessageLite.b) this).instance).setMsgTypeName(str);
                return this;
            }

            public Builder setMsgTypeNameBytes(ByteString byteString) {
                copyOnWrite();
                ((Ack) ((GeneratedMessageLite.b) this).instance).setMsgTypeNameBytes(byteString);
                return this;
            }

            public Builder setRecvTimestamp(long j) {
                copyOnWrite();
                ((Ack) ((GeneratedMessageLite.b) this).instance).setRecvTimestamp(j);
                return this;
            }
        }

        static {
            Ack ack = new Ack();
            DEFAULT_INSTANCE = ack;
            ack.makeImmutable();
        }

        private Ack() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearMsgId() {
            this.msgId_ = getDefaultInstance().getMsgId();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearMsgTypeName() {
            this.msgTypeName_ = getDefaultInstance().getMsgTypeName();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearRecvTimestamp() {
            this.recvTimestamp_ = 0L;
        }

        public static Ack getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder(Ack ack) {
            return (Builder) ((Builder) DEFAULT_INSTANCE.toBuilder()).mergeFrom(ack);
        }

        public static Ack parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (Ack) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Ack parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (Ack) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static i860<Ack> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setMsgId(String str) {
            str.getClass();
            this.msgId_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setMsgIdBytes(ByteString byteString) {
            byteString.getClass();
            a.checkByteStringIsUtf8(byteString);
            this.msgId_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setMsgTypeName(String str) {
            str.getClass();
            this.msgTypeName_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setMsgTypeNameBytes(ByteString byteString) {
            byteString.getClass();
            a.checkByteStringIsUtf8(byteString);
            this.msgTypeName_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setRecvTimestamp(long j) {
            this.recvTimestamp_ = j;
        }

        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            boolean z = false;
            switch (C03411.f1649xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new Ack();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                    return null;
                case 4:
                    return new Builder();
                case 5:
                    GeneratedMessageLite.h hVar = (GeneratedMessageLite.h) obj;
                    Ack ack = (Ack) obj2;
                    this.msgId_ = hVar.f(!this.msgId_.isEmpty(), this.msgId_, !ack.msgId_.isEmpty(), ack.msgId_);
                    this.msgTypeName_ = hVar.f(!this.msgTypeName_.isEmpty(), this.msgTypeName_, !ack.msgTypeName_.isEmpty(), ack.msgTypeName_);
                    long j = this.recvTimestamp_;
                    boolean z2 = j != 0;
                    long j2 = ack.recvTimestamp_;
                    this.recvTimestamp_ = hVar.i(z2, j, j2 != 0, j2);
                    GeneratedMessageLite.g gVar = GeneratedMessageLite.g.INSTANCE;
                    return this;
                case 6:
                    e eVar = (e) obj;
                    while (!z) {
                        try {
                            int iM = eVar.M();
                            if (iM != 0) {
                                if (iM == 10) {
                                    this.msgId_ = eVar.L();
                                } else if (iM == 18) {
                                    this.msgTypeName_ = eVar.L();
                                } else if (iM == 24) {
                                    this.recvTimestamp_ = eVar.v();
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
                        synchronized (Ack.class) {
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

        @Override // com.p1.mobile.longlink.msg.liveConnector.liveAuthMessageNew.AckOrBuilder
        public String getMsgId() {
            return this.msgId_;
        }

        @Override // com.p1.mobile.longlink.msg.liveConnector.liveAuthMessageNew.AckOrBuilder
        public ByteString getMsgIdBytes() {
            return ByteString.copyFromUtf8(this.msgId_);
        }

        @Override // com.p1.mobile.longlink.msg.liveConnector.liveAuthMessageNew.AckOrBuilder
        public String getMsgTypeName() {
            return this.msgTypeName_;
        }

        @Override // com.p1.mobile.longlink.msg.liveConnector.liveAuthMessageNew.AckOrBuilder
        public ByteString getMsgTypeNameBytes() {
            return ByteString.copyFromUtf8(this.msgTypeName_);
        }

        @Override // com.p1.mobile.longlink.msg.liveConnector.liveAuthMessageNew.AckOrBuilder
        public long getRecvTimestamp() {
            return this.recvTimestamp_;
        }

        public int getSerializedSize() {
            int i = ((GeneratedMessageLite) this).memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int iK = !this.msgId_.isEmpty() ? CodedOutputStream.K(1, getMsgId()) : 0;
            if (!this.msgTypeName_.isEmpty()) {
                iK += CodedOutputStream.K(2, getMsgTypeName());
            }
            long j = this.recvTimestamp_;
            if (j != 0) {
                iK += CodedOutputStream.v(3, j);
            }
            ((GeneratedMessageLite) this).memoizedSerializedSize = iK;
            return iK;
        }

        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (!this.msgId_.isEmpty()) {
                codedOutputStream.D0(1, getMsgId());
            }
            if (!this.msgTypeName_.isEmpty()) {
                codedOutputStream.D0(2, getMsgTypeName());
            }
            long j = this.recvTimestamp_;
            if (j != 0) {
                codedOutputStream.u0(3, j);
            }
        }

        public static Ack parseDelimitedFrom(InputStream inputStream, h hVar) throws IOException {
            return (Ack) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, hVar);
        }

        public static Ack parseFrom(ByteString byteString, h hVar) throws InvalidProtocolBufferException {
            return (Ack) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, hVar);
        }

        public static Ack parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (Ack) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static Ack parseFrom(byte[] bArr, h hVar) throws InvalidProtocolBufferException {
            return (Ack) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, hVar);
        }

        public static Ack parseFrom(InputStream inputStream) throws IOException {
            return (Ack) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Ack parseFrom(InputStream inputStream, h hVar) throws IOException {
            return (Ack) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, hVar);
        }

        public static Ack parseFrom(e eVar) throws IOException {
            return (Ack) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, eVar);
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.toBuilder();
        }

        public static Ack parseFrom(e eVar, h hVar) throws IOException {
            return (Ack) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, eVar, hVar);
        }
    }

    public enum AppStaySideEnum implements l.c {
        APP_STAY_SIDE_FOREGROUND(0),
        APP_STAY_SIDE_BACKGROUND(1),
        UNRECOGNIZED(-1);

        public static final int APP_STAY_SIDE_BACKGROUND_VALUE = 1;
        public static final int APP_STAY_SIDE_FOREGROUND_VALUE = 0;
        private static final l.d<AppStaySideEnum> internalValueMap = new l.d<AppStaySideEnum>() { // from class: com.p1.mobile.longlink.msg.liveConnector.liveAuthMessageNew.AppStaySideEnum.1
            public AppStaySideEnum findValueByNumber(int i) {
                return AppStaySideEnum.forNumber(i);
            }
        };
        private final int value;

        AppStaySideEnum(int i) {
            this.value = i;
        }

        public static AppStaySideEnum forNumber(int i) {
            if (i == 0) {
                return APP_STAY_SIDE_FOREGROUND;
            }
            if (i != 1) {
                return null;
            }
            return APP_STAY_SIDE_BACKGROUND;
        }

        public static l.d<AppStaySideEnum> internalGetValueMap() {
            return internalValueMap;
        }

        public final int getNumber() {
            return this.value;
        }

        @Deprecated
        public static AppStaySideEnum valueOf(int i) {
            return forNumber(i);
        }
    }

    public static final class Auth extends GeneratedMessageLite<Auth, Builder> implements AuthOrBuilder {
        public static final int CURRENTSTARTLINKTIME_FIELD_NUMBER = 24;
        public static final int CURRENTTIME_FIELD_NUMBER = 21;
        private static final Auth DEFAULT_INSTANCE;
        public static final int ENTERSOURCE_FIELD_NUMBER = 16;
        public static final int EXT_FIELD_NUMBER = 11;
        public static final int FIRSTLINKTIME_FIELD_NUMBER = 19;
        public static final int FLAG_FIELD_NUMBER = 10;
        public static final int INTERRUPTLINKTIME_FIELD_NUMBER = 20;
        public static final int IOSVERIFY_FIELD_NUMBER = 13;
        public static final int IPHOST_FIELD_NUMBER = 22;
        public static final int LINKSTATE_FIELD_NUMBER = 18;
        public static final int LIVEID_FIELD_NUMBER = 15;
        public static final int LIVEMODE_FIELD_NUMBER = 14;
        public static final int LOCALE_FIELD_NUMBER = 6;
        public static final int LOC_FIELD_NUMBER = 3;
        private static volatile i860<Auth> PARSER = null;
        public static final int RETRYCOUNT_FIELD_NUMBER = 23;
        public static final int ROOMID_FIELD_NUMBER = 7;
        public static final int ROOMTYPE_FIELD_NUMBER = 12;
        public static final int SESSIONID_FIELD_NUMBER = 17;
        public static final int SOURCE_FIELD_NUMBER = 2;
        public static final int STAYSIDE_FIELD_NUMBER = 4;
        public static final int UA_FIELD_NUMBER = 5;
        public static final int USERID_FIELD_NUMBER = 1;
        public static final int XTESTINGGROUP_FIELD_NUMBER = 8;
        public static final int XTTCLIENTINFO_FIELD_NUMBER = 9;
        private long currentStartLinkTime_;
        private long currentTime_;
        private String enterSource_;
        private String ext_;
        private long firstLinkTime_;
        private ByteString flag_;
        private long interruptLinkTime_;
        private boolean iosVerify_;
        private String ipHost_;
        private int linkState_;
        private String liveId_;
        private String liveMode_;
        private Location loc_;
        private int retryCount_;
        private String roomType_;
        private String sessionId_;
        private int source_;
        private int staySide_;
        private UserAgent ua_;
        private ByteString xTTClientInfo_;
        private ByteString xTestingGroup_;
        private String userId_ = "";
        private String locale_ = "";
        private String roomId_ = "";

        static {
            Auth auth = new Auth();
            DEFAULT_INSTANCE = auth;
            auth.makeImmutable();
        }

        private Auth() {
            ByteString byteString = ByteString.EMPTY;
            this.xTestingGroup_ = byteString;
            this.xTTClientInfo_ = byteString;
            this.flag_ = byteString;
            this.ext_ = "";
            this.roomType_ = "";
            this.liveMode_ = "";
            this.liveId_ = "";
            this.enterSource_ = "";
            this.sessionId_ = "";
            this.ipHost_ = "";
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearCurrentStartLinkTime() {
            this.currentStartLinkTime_ = 0L;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearCurrentTime() {
            this.currentTime_ = 0L;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearEnterSource() {
            this.enterSource_ = getDefaultInstance().getEnterSource();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearExt() {
            this.ext_ = getDefaultInstance().getExt();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearFirstLinkTime() {
            this.firstLinkTime_ = 0L;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearFlag() {
            this.flag_ = getDefaultInstance().getFlag();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearInterruptLinkTime() {
            this.interruptLinkTime_ = 0L;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearIosVerify() {
            this.iosVerify_ = false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearIpHost() {
            this.ipHost_ = getDefaultInstance().getIpHost();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearLinkState() {
            this.linkState_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearLiveId() {
            this.liveId_ = getDefaultInstance().getLiveId();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearLiveMode() {
            this.liveMode_ = getDefaultInstance().getLiveMode();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearLoc() {
            this.loc_ = null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearLocale() {
            this.locale_ = getDefaultInstance().getLocale();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearRetryCount() {
            this.retryCount_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearRoomId() {
            this.roomId_ = getDefaultInstance().getRoomId();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearRoomType() {
            this.roomType_ = getDefaultInstance().getRoomType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearSessionId() {
            this.sessionId_ = getDefaultInstance().getSessionId();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearSource() {
            this.source_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearStaySide() {
            this.staySide_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearUa() {
            this.ua_ = null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearUserId() {
            this.userId_ = getDefaultInstance().getUserId();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearXTTClientInfo() {
            this.xTTClientInfo_ = getDefaultInstance().getXTTClientInfo();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearXTestingGroup() {
            this.xTestingGroup_ = getDefaultInstance().getXTestingGroup();
        }

        public static Auth getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeLoc(Location location) {
            Location location2 = this.loc_;
            if (location2 == null || location2 == Location.getDefaultInstance()) {
                this.loc_ = location;
            } else {
                this.loc_ = (Location) ((Location.Builder) Location.newBuilder(this.loc_).mergeFrom(location)).buildPartial();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeUa(UserAgent userAgent) {
            UserAgent userAgent2 = this.ua_;
            if (userAgent2 == null || userAgent2 == UserAgent.getDefaultInstance()) {
                this.ua_ = userAgent;
            } else {
                this.ua_ = (UserAgent) ((UserAgent.Builder) UserAgent.newBuilder(this.ua_).mergeFrom(userAgent)).buildPartial();
            }
        }

        public static Builder newBuilder(Auth auth) {
            return (Builder) ((Builder) DEFAULT_INSTANCE.toBuilder()).mergeFrom(auth);
        }

        public static Auth parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (Auth) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Auth parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (Auth) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static i860<Auth> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setCurrentStartLinkTime(long j) {
            this.currentStartLinkTime_ = j;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setCurrentTime(long j) {
            this.currentTime_ = j;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setEnterSource(String str) {
            str.getClass();
            this.enterSource_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setEnterSourceBytes(ByteString byteString) {
            byteString.getClass();
            a.checkByteStringIsUtf8(byteString);
            this.enterSource_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setExt(String str) {
            str.getClass();
            this.ext_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setExtBytes(ByteString byteString) {
            byteString.getClass();
            a.checkByteStringIsUtf8(byteString);
            this.ext_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setFirstLinkTime(long j) {
            this.firstLinkTime_ = j;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setFlag(ByteString byteString) {
            byteString.getClass();
            this.flag_ = byteString;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setInterruptLinkTime(long j) {
            this.interruptLinkTime_ = j;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setIosVerify(boolean z) {
            this.iosVerify_ = z;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setIpHost(String str) {
            str.getClass();
            this.ipHost_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setIpHostBytes(ByteString byteString) {
            byteString.getClass();
            a.checkByteStringIsUtf8(byteString);
            this.ipHost_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setLinkState(int i) {
            this.linkState_ = i;
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
        public void setLiveMode(String str) {
            str.getClass();
            this.liveMode_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setLiveModeBytes(ByteString byteString) {
            byteString.getClass();
            a.checkByteStringIsUtf8(byteString);
            this.liveMode_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setLoc(Location.Builder builder) {
            this.loc_ = (Location) builder.build();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setLocale(String str) {
            str.getClass();
            this.locale_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setLocaleBytes(ByteString byteString) {
            byteString.getClass();
            a.checkByteStringIsUtf8(byteString);
            this.locale_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setRetryCount(int i) {
            this.retryCount_ = i;
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
        public void setRoomType(String str) {
            str.getClass();
            this.roomType_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setRoomTypeBytes(ByteString byteString) {
            byteString.getClass();
            a.checkByteStringIsUtf8(byteString);
            this.roomType_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSessionId(String str) {
            str.getClass();
            this.sessionId_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSessionIdBytes(ByteString byteString) {
            byteString.getClass();
            a.checkByteStringIsUtf8(byteString);
            this.sessionId_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSource(ClientSourceEnum clientSourceEnum) {
            clientSourceEnum.getClass();
            this.source_ = clientSourceEnum.getNumber();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSourceValue(int i) {
            this.source_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setStaySide(AppStaySideEnum appStaySideEnum) {
            appStaySideEnum.getClass();
            this.staySide_ = appStaySideEnum.getNumber();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setStaySideValue(int i) {
            this.staySide_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setUa(UserAgent.Builder builder) {
            this.ua_ = (UserAgent) builder.build();
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
        public void setXTTClientInfo(ByteString byteString) {
            byteString.getClass();
            this.xTTClientInfo_ = byteString;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setXTestingGroup(ByteString byteString) {
            byteString.getClass();
            this.xTestingGroup_ = byteString;
        }

        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            boolean z = false;
            switch (C03411.f1649xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new Auth();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                    return null;
                case 4:
                    return new Builder();
                case 5:
                    GeneratedMessageLite.h hVar = (GeneratedMessageLite.h) obj;
                    Auth auth = (Auth) obj2;
                    this.userId_ = hVar.f(!this.userId_.isEmpty(), this.userId_, !auth.userId_.isEmpty(), auth.userId_);
                    int i = this.source_;
                    boolean z2 = i != 0;
                    int i2 = auth.source_;
                    this.source_ = hVar.e(z2, i, i2 != 0, i2);
                    this.loc_ = hVar.o(this.loc_, auth.loc_);
                    int i3 = this.staySide_;
                    boolean z3 = i3 != 0;
                    int i4 = auth.staySide_;
                    this.staySide_ = hVar.e(z3, i3, i4 != 0, i4);
                    this.ua_ = hVar.o(this.ua_, auth.ua_);
                    this.locale_ = hVar.f(!this.locale_.isEmpty(), this.locale_, !auth.locale_.isEmpty(), auth.locale_);
                    this.roomId_ = hVar.f(!this.roomId_.isEmpty(), this.roomId_, !auth.roomId_.isEmpty(), auth.roomId_);
                    ByteString byteString = this.xTestingGroup_;
                    ByteString byteString2 = ByteString.EMPTY;
                    boolean z4 = byteString != byteString2;
                    ByteString byteString3 = auth.xTestingGroup_;
                    this.xTestingGroup_ = hVar.h(z4, byteString, byteString3 != byteString2, byteString3);
                    ByteString byteString4 = this.xTTClientInfo_;
                    boolean z5 = byteString4 != byteString2;
                    ByteString byteString5 = auth.xTTClientInfo_;
                    this.xTTClientInfo_ = hVar.h(z5, byteString4, byteString5 != byteString2, byteString5);
                    ByteString byteString6 = this.flag_;
                    boolean z6 = byteString6 != byteString2;
                    ByteString byteString7 = auth.flag_;
                    this.flag_ = hVar.h(z6, byteString6, byteString7 != byteString2, byteString7);
                    this.ext_ = hVar.f(!this.ext_.isEmpty(), this.ext_, !auth.ext_.isEmpty(), auth.ext_);
                    this.roomType_ = hVar.f(!this.roomType_.isEmpty(), this.roomType_, !auth.roomType_.isEmpty(), auth.roomType_);
                    boolean z7 = this.iosVerify_;
                    boolean z8 = auth.iosVerify_;
                    this.iosVerify_ = hVar.d(z7, z7, z8, z8);
                    this.liveMode_ = hVar.f(!this.liveMode_.isEmpty(), this.liveMode_, !auth.liveMode_.isEmpty(), auth.liveMode_);
                    this.liveId_ = hVar.f(!this.liveId_.isEmpty(), this.liveId_, !auth.liveId_.isEmpty(), auth.liveId_);
                    this.enterSource_ = hVar.f(!this.enterSource_.isEmpty(), this.enterSource_, !auth.enterSource_.isEmpty(), auth.enterSource_);
                    this.sessionId_ = hVar.f(!this.sessionId_.isEmpty(), this.sessionId_, !auth.sessionId_.isEmpty(), auth.sessionId_);
                    int i5 = this.linkState_;
                    boolean z9 = i5 != 0;
                    int i6 = auth.linkState_;
                    this.linkState_ = hVar.e(z9, i5, i6 != 0, i6);
                    long j = this.firstLinkTime_;
                    boolean z10 = j != 0;
                    long j2 = auth.firstLinkTime_;
                    this.firstLinkTime_ = hVar.i(z10, j, j2 != 0, j2);
                    long j3 = this.interruptLinkTime_;
                    boolean z11 = j3 != 0;
                    long j4 = auth.interruptLinkTime_;
                    this.interruptLinkTime_ = hVar.i(z11, j3, j4 != 0, j4);
                    long j5 = this.currentTime_;
                    boolean z12 = j5 != 0;
                    long j6 = auth.currentTime_;
                    this.currentTime_ = hVar.i(z12, j5, j6 != 0, j6);
                    this.ipHost_ = hVar.f(!this.ipHost_.isEmpty(), this.ipHost_, !auth.ipHost_.isEmpty(), auth.ipHost_);
                    int i7 = this.retryCount_;
                    boolean z13 = i7 != 0;
                    int i8 = auth.retryCount_;
                    this.retryCount_ = hVar.e(z13, i7, i8 != 0, i8);
                    boolean z14 = false;
                    long j7 = this.currentStartLinkTime_;
                    if (j7 != 0) {
                        z14 = true;
                    }
                    long j8 = auth.currentStartLinkTime_;
                    this.currentStartLinkTime_ = hVar.i(z14, j7, j8 != 0, j8);
                    GeneratedMessageLite.g gVar = GeneratedMessageLite.g.INSTANCE;
                    return this;
                case 6:
                    e eVar = (e) obj;
                    h hVar2 = (h) obj2;
                    while (!z) {
                        try {
                            int iM = eVar.M();
                            switch (iM) {
                                case 0:
                                    break;
                                case 10:
                                    this.userId_ = eVar.L();
                                    continue;
                                case 16:
                                    this.source_ = eVar.p();
                                    continue;
                                case 26:
                                    Location location = this.loc_;
                                    Location.Builder builder = location != null ? (Location.Builder) location.toBuilder() : null;
                                    Location locationW = eVar.w(Location.parser(), hVar2);
                                    this.loc_ = locationW;
                                    if (builder != null) {
                                        builder.mergeFrom(locationW);
                                        this.loc_ = (Location) builder.buildPartial();
                                    } else {
                                        continue;
                                    }
                                    break;
                                case LongLinkChatMessage.LiveChatMessage.SOURCE_FIELD_NUMBER /* 32 */:
                                    this.staySide_ = eVar.p();
                                    continue;
                                case 42:
                                    UserAgent userAgent = this.ua_;
                                    UserAgent.Builder builder2 = userAgent != null ? (UserAgent.Builder) userAgent.toBuilder() : null;
                                    UserAgent userAgentW = eVar.w(UserAgent.parser(), hVar2);
                                    this.ua_ = userAgentW;
                                    if (builder2 != null) {
                                        builder2.mergeFrom(userAgentW);
                                        this.ua_ = (UserAgent) builder2.buildPartial();
                                    } else {
                                        continue;
                                    }
                                    break;
                                case 50:
                                    this.locale_ = eVar.L();
                                    continue;
                                case 58:
                                    this.roomId_ = eVar.L();
                                    continue;
                                case 66:
                                    this.xTestingGroup_ = eVar.n();
                                    continue;
                                case 74:
                                    this.xTTClientInfo_ = eVar.n();
                                    continue;
                                case 82:
                                    this.flag_ = eVar.n();
                                    continue;
                                case 90:
                                    this.ext_ = eVar.L();
                                    continue;
                                case 98:
                                    this.roomType_ = eVar.L();
                                    continue;
                                case 104:
                                    this.iosVerify_ = eVar.m();
                                    continue;
                                case XEGiftErrorCode.ERROR_CODE_VIDEO_TIMEOUT /* 114 */:
                                    this.liveMode_ = eVar.L();
                                    continue;
                                case 122:
                                    this.liveId_ = eVar.L();
                                    continue;
                                case 130:
                                    this.enterSource_ = eVar.L();
                                    continue;
                                case 138:
                                    this.sessionId_ = eVar.L();
                                    continue;
                                case 144:
                                    this.linkState_ = eVar.u();
                                    continue;
                                case 152:
                                    this.firstLinkTime_ = eVar.v();
                                    continue;
                                case MSG_TYPE_LIVE_GIFT_RECEIVED_VALUE:
                                    this.interruptLinkTime_ = eVar.v();
                                    continue;
                                case 168:
                                    this.currentTime_ = eVar.v();
                                    continue;
                                case 178:
                                    this.ipHost_ = eVar.L();
                                    continue;
                                case 184:
                                    this.retryCount_ = eVar.u();
                                    continue;
                                case 192:
                                    this.currentStartLinkTime_ = eVar.v();
                                    continue;
                                default:
                                    if (!eVar.R(iM)) {
                                        break;
                                    }
                                    break;
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
                        synchronized (Auth.class) {
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

        @Override // com.p1.mobile.longlink.msg.liveConnector.liveAuthMessageNew.AuthOrBuilder
        public long getCurrentStartLinkTime() {
            return this.currentStartLinkTime_;
        }

        @Override // com.p1.mobile.longlink.msg.liveConnector.liveAuthMessageNew.AuthOrBuilder
        public long getCurrentTime() {
            return this.currentTime_;
        }

        @Override // com.p1.mobile.longlink.msg.liveConnector.liveAuthMessageNew.AuthOrBuilder
        public String getEnterSource() {
            return this.enterSource_;
        }

        @Override // com.p1.mobile.longlink.msg.liveConnector.liveAuthMessageNew.AuthOrBuilder
        public ByteString getEnterSourceBytes() {
            return ByteString.copyFromUtf8(this.enterSource_);
        }

        @Override // com.p1.mobile.longlink.msg.liveConnector.liveAuthMessageNew.AuthOrBuilder
        public String getExt() {
            return this.ext_;
        }

        @Override // com.p1.mobile.longlink.msg.liveConnector.liveAuthMessageNew.AuthOrBuilder
        public ByteString getExtBytes() {
            return ByteString.copyFromUtf8(this.ext_);
        }

        @Override // com.p1.mobile.longlink.msg.liveConnector.liveAuthMessageNew.AuthOrBuilder
        public long getFirstLinkTime() {
            return this.firstLinkTime_;
        }

        @Override // com.p1.mobile.longlink.msg.liveConnector.liveAuthMessageNew.AuthOrBuilder
        public ByteString getFlag() {
            return this.flag_;
        }

        @Override // com.p1.mobile.longlink.msg.liveConnector.liveAuthMessageNew.AuthOrBuilder
        public long getInterruptLinkTime() {
            return this.interruptLinkTime_;
        }

        @Override // com.p1.mobile.longlink.msg.liveConnector.liveAuthMessageNew.AuthOrBuilder
        public boolean getIosVerify() {
            return this.iosVerify_;
        }

        @Override // com.p1.mobile.longlink.msg.liveConnector.liveAuthMessageNew.AuthOrBuilder
        public String getIpHost() {
            return this.ipHost_;
        }

        @Override // com.p1.mobile.longlink.msg.liveConnector.liveAuthMessageNew.AuthOrBuilder
        public ByteString getIpHostBytes() {
            return ByteString.copyFromUtf8(this.ipHost_);
        }

        @Override // com.p1.mobile.longlink.msg.liveConnector.liveAuthMessageNew.AuthOrBuilder
        public int getLinkState() {
            return this.linkState_;
        }

        @Override // com.p1.mobile.longlink.msg.liveConnector.liveAuthMessageNew.AuthOrBuilder
        public String getLiveId() {
            return this.liveId_;
        }

        @Override // com.p1.mobile.longlink.msg.liveConnector.liveAuthMessageNew.AuthOrBuilder
        public ByteString getLiveIdBytes() {
            return ByteString.copyFromUtf8(this.liveId_);
        }

        @Override // com.p1.mobile.longlink.msg.liveConnector.liveAuthMessageNew.AuthOrBuilder
        public String getLiveMode() {
            return this.liveMode_;
        }

        @Override // com.p1.mobile.longlink.msg.liveConnector.liveAuthMessageNew.AuthOrBuilder
        public ByteString getLiveModeBytes() {
            return ByteString.copyFromUtf8(this.liveMode_);
        }

        @Override // com.p1.mobile.longlink.msg.liveConnector.liveAuthMessageNew.AuthOrBuilder
        public Location getLoc() {
            Location location = this.loc_;
            return location == null ? Location.getDefaultInstance() : location;
        }

        @Override // com.p1.mobile.longlink.msg.liveConnector.liveAuthMessageNew.AuthOrBuilder
        public String getLocale() {
            return this.locale_;
        }

        @Override // com.p1.mobile.longlink.msg.liveConnector.liveAuthMessageNew.AuthOrBuilder
        public ByteString getLocaleBytes() {
            return ByteString.copyFromUtf8(this.locale_);
        }

        @Override // com.p1.mobile.longlink.msg.liveConnector.liveAuthMessageNew.AuthOrBuilder
        public int getRetryCount() {
            return this.retryCount_;
        }

        @Override // com.p1.mobile.longlink.msg.liveConnector.liveAuthMessageNew.AuthOrBuilder
        public String getRoomId() {
            return this.roomId_;
        }

        @Override // com.p1.mobile.longlink.msg.liveConnector.liveAuthMessageNew.AuthOrBuilder
        public ByteString getRoomIdBytes() {
            return ByteString.copyFromUtf8(this.roomId_);
        }

        @Override // com.p1.mobile.longlink.msg.liveConnector.liveAuthMessageNew.AuthOrBuilder
        public String getRoomType() {
            return this.roomType_;
        }

        @Override // com.p1.mobile.longlink.msg.liveConnector.liveAuthMessageNew.AuthOrBuilder
        public ByteString getRoomTypeBytes() {
            return ByteString.copyFromUtf8(this.roomType_);
        }

        public int getSerializedSize() {
            int i = ((GeneratedMessageLite) this).memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int iK = !this.userId_.isEmpty() ? CodedOutputStream.K(1, getUserId()) : 0;
            if (this.source_ != ClientSourceEnum.CLIENT_SOURCE_ANDROID.getNumber()) {
                iK += CodedOutputStream.m(2, this.source_);
            }
            if (this.loc_ != null) {
                iK += CodedOutputStream.C(3, getLoc());
            }
            if (this.staySide_ != AppStaySideEnum.APP_STAY_SIDE_FOREGROUND.getNumber()) {
                iK += CodedOutputStream.m(4, this.staySide_);
            }
            if (this.ua_ != null) {
                iK += CodedOutputStream.C(5, getUa());
            }
            if (!this.locale_.isEmpty()) {
                iK += CodedOutputStream.K(6, getLocale());
            }
            if (!this.roomId_.isEmpty()) {
                iK += CodedOutputStream.K(7, getRoomId());
            }
            if (!this.xTestingGroup_.isEmpty()) {
                iK += CodedOutputStream.i(8, this.xTestingGroup_);
            }
            if (!this.xTTClientInfo_.isEmpty()) {
                iK += CodedOutputStream.i(9, this.xTTClientInfo_);
            }
            if (!this.flag_.isEmpty()) {
                iK += CodedOutputStream.i(10, this.flag_);
            }
            if (!this.ext_.isEmpty()) {
                iK += CodedOutputStream.K(11, getExt());
            }
            if (!this.roomType_.isEmpty()) {
                iK += CodedOutputStream.K(12, getRoomType());
            }
            boolean z = this.iosVerify_;
            if (z) {
                iK += CodedOutputStream.f(13, z);
            }
            if (!this.liveMode_.isEmpty()) {
                iK += CodedOutputStream.K(14, getLiveMode());
            }
            if (!this.liveId_.isEmpty()) {
                iK += CodedOutputStream.K(15, getLiveId());
            }
            if (!this.enterSource_.isEmpty()) {
                iK += CodedOutputStream.K(16, getEnterSource());
            }
            if (!this.sessionId_.isEmpty()) {
                iK += CodedOutputStream.K(17, getSessionId());
            }
            int i2 = this.linkState_;
            if (i2 != 0) {
                iK += CodedOutputStream.t(18, i2);
            }
            long j = this.firstLinkTime_;
            if (j != 0) {
                iK += CodedOutputStream.v(19, j);
            }
            long j2 = this.interruptLinkTime_;
            if (j2 != 0) {
                iK += CodedOutputStream.v(20, j2);
            }
            long j3 = this.currentTime_;
            if (j3 != 0) {
                iK += CodedOutputStream.v(21, j3);
            }
            if (!this.ipHost_.isEmpty()) {
                iK += CodedOutputStream.K(22, getIpHost());
            }
            int i3 = this.retryCount_;
            if (i3 != 0) {
                iK += CodedOutputStream.t(23, i3);
            }
            long j4 = this.currentStartLinkTime_;
            if (j4 != 0) {
                iK += CodedOutputStream.v(24, j4);
            }
            ((GeneratedMessageLite) this).memoizedSerializedSize = iK;
            return iK;
        }

        @Override // com.p1.mobile.longlink.msg.liveConnector.liveAuthMessageNew.AuthOrBuilder
        public String getSessionId() {
            return this.sessionId_;
        }

        @Override // com.p1.mobile.longlink.msg.liveConnector.liveAuthMessageNew.AuthOrBuilder
        public ByteString getSessionIdBytes() {
            return ByteString.copyFromUtf8(this.sessionId_);
        }

        @Override // com.p1.mobile.longlink.msg.liveConnector.liveAuthMessageNew.AuthOrBuilder
        public ClientSourceEnum getSource() {
            ClientSourceEnum clientSourceEnumForNumber = ClientSourceEnum.forNumber(this.source_);
            return clientSourceEnumForNumber == null ? ClientSourceEnum.UNRECOGNIZED : clientSourceEnumForNumber;
        }

        @Override // com.p1.mobile.longlink.msg.liveConnector.liveAuthMessageNew.AuthOrBuilder
        public int getSourceValue() {
            return this.source_;
        }

        @Override // com.p1.mobile.longlink.msg.liveConnector.liveAuthMessageNew.AuthOrBuilder
        public AppStaySideEnum getStaySide() {
            AppStaySideEnum appStaySideEnumForNumber = AppStaySideEnum.forNumber(this.staySide_);
            return appStaySideEnumForNumber == null ? AppStaySideEnum.UNRECOGNIZED : appStaySideEnumForNumber;
        }

        @Override // com.p1.mobile.longlink.msg.liveConnector.liveAuthMessageNew.AuthOrBuilder
        public int getStaySideValue() {
            return this.staySide_;
        }

        @Override // com.p1.mobile.longlink.msg.liveConnector.liveAuthMessageNew.AuthOrBuilder
        public UserAgent getUa() {
            UserAgent userAgent = this.ua_;
            return userAgent == null ? UserAgent.getDefaultInstance() : userAgent;
        }

        @Override // com.p1.mobile.longlink.msg.liveConnector.liveAuthMessageNew.AuthOrBuilder
        public String getUserId() {
            return this.userId_;
        }

        @Override // com.p1.mobile.longlink.msg.liveConnector.liveAuthMessageNew.AuthOrBuilder
        public ByteString getUserIdBytes() {
            return ByteString.copyFromUtf8(this.userId_);
        }

        @Override // com.p1.mobile.longlink.msg.liveConnector.liveAuthMessageNew.AuthOrBuilder
        public ByteString getXTTClientInfo() {
            return this.xTTClientInfo_;
        }

        @Override // com.p1.mobile.longlink.msg.liveConnector.liveAuthMessageNew.AuthOrBuilder
        public ByteString getXTestingGroup() {
            return this.xTestingGroup_;
        }

        @Override // com.p1.mobile.longlink.msg.liveConnector.liveAuthMessageNew.AuthOrBuilder
        public boolean hasLoc() {
            return this.loc_ != null;
        }

        @Override // com.p1.mobile.longlink.msg.liveConnector.liveAuthMessageNew.AuthOrBuilder
        public boolean hasUa() {
            return this.ua_ != null;
        }

        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (!this.userId_.isEmpty()) {
                codedOutputStream.D0(1, getUserId());
            }
            if (this.source_ != ClientSourceEnum.CLIENT_SOURCE_ANDROID.getNumber()) {
                codedOutputStream.i0(2, this.source_);
            }
            if (this.loc_ != null) {
                codedOutputStream.w0(3, getLoc());
            }
            if (this.staySide_ != AppStaySideEnum.APP_STAY_SIDE_FOREGROUND.getNumber()) {
                codedOutputStream.i0(4, this.staySide_);
            }
            if (this.ua_ != null) {
                codedOutputStream.w0(5, getUa());
            }
            if (!this.locale_.isEmpty()) {
                codedOutputStream.D0(6, getLocale());
            }
            if (!this.roomId_.isEmpty()) {
                codedOutputStream.D0(7, getRoomId());
            }
            if (!this.xTestingGroup_.isEmpty()) {
                codedOutputStream.e0(8, this.xTestingGroup_);
            }
            if (!this.xTTClientInfo_.isEmpty()) {
                codedOutputStream.e0(9, this.xTTClientInfo_);
            }
            if (!this.flag_.isEmpty()) {
                codedOutputStream.e0(10, this.flag_);
            }
            if (!this.ext_.isEmpty()) {
                codedOutputStream.D0(11, getExt());
            }
            if (!this.roomType_.isEmpty()) {
                codedOutputStream.D0(12, getRoomType());
            }
            boolean z = this.iosVerify_;
            if (z) {
                codedOutputStream.a0(13, z);
            }
            if (!this.liveMode_.isEmpty()) {
                codedOutputStream.D0(14, getLiveMode());
            }
            if (!this.liveId_.isEmpty()) {
                codedOutputStream.D0(15, getLiveId());
            }
            if (!this.enterSource_.isEmpty()) {
                codedOutputStream.D0(16, getEnterSource());
            }
            if (!this.sessionId_.isEmpty()) {
                codedOutputStream.D0(17, getSessionId());
            }
            int i = this.linkState_;
            if (i != 0) {
                codedOutputStream.s0(18, i);
            }
            long j = this.firstLinkTime_;
            if (j != 0) {
                codedOutputStream.u0(19, j);
            }
            long j2 = this.interruptLinkTime_;
            if (j2 != 0) {
                codedOutputStream.u0(20, j2);
            }
            long j3 = this.currentTime_;
            if (j3 != 0) {
                codedOutputStream.u0(21, j3);
            }
            if (!this.ipHost_.isEmpty()) {
                codedOutputStream.D0(22, getIpHost());
            }
            int i2 = this.retryCount_;
            if (i2 != 0) {
                codedOutputStream.s0(23, i2);
            }
            long j4 = this.currentStartLinkTime_;
            if (j4 != 0) {
                codedOutputStream.u0(24, j4);
            }
        }

        public static Auth parseDelimitedFrom(InputStream inputStream, h hVar) throws IOException {
            return (Auth) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, hVar);
        }

        public static Auth parseFrom(ByteString byteString, h hVar) throws InvalidProtocolBufferException {
            return (Auth) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, hVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setLoc(Location location) {
            location.getClass();
            this.loc_ = location;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setUa(UserAgent userAgent) {
            userAgent.getClass();
            this.ua_ = userAgent;
        }

        public static final class Builder extends GeneratedMessageLite.b<Auth, Builder> implements AuthOrBuilder {
            private Builder() {
                super(Auth.DEFAULT_INSTANCE);
            }

            public Builder clearCurrentStartLinkTime() {
                copyOnWrite();
                ((Auth) ((GeneratedMessageLite.b) this).instance).clearCurrentStartLinkTime();
                return this;
            }

            public Builder clearCurrentTime() {
                copyOnWrite();
                ((Auth) ((GeneratedMessageLite.b) this).instance).clearCurrentTime();
                return this;
            }

            public Builder clearEnterSource() {
                copyOnWrite();
                ((Auth) ((GeneratedMessageLite.b) this).instance).clearEnterSource();
                return this;
            }

            public Builder clearExt() {
                copyOnWrite();
                ((Auth) ((GeneratedMessageLite.b) this).instance).clearExt();
                return this;
            }

            public Builder clearFirstLinkTime() {
                copyOnWrite();
                ((Auth) ((GeneratedMessageLite.b) this).instance).clearFirstLinkTime();
                return this;
            }

            public Builder clearFlag() {
                copyOnWrite();
                ((Auth) ((GeneratedMessageLite.b) this).instance).clearFlag();
                return this;
            }

            public Builder clearInterruptLinkTime() {
                copyOnWrite();
                ((Auth) ((GeneratedMessageLite.b) this).instance).clearInterruptLinkTime();
                return this;
            }

            public Builder clearIosVerify() {
                copyOnWrite();
                ((Auth) ((GeneratedMessageLite.b) this).instance).clearIosVerify();
                return this;
            }

            public Builder clearIpHost() {
                copyOnWrite();
                ((Auth) ((GeneratedMessageLite.b) this).instance).clearIpHost();
                return this;
            }

            public Builder clearLinkState() {
                copyOnWrite();
                ((Auth) ((GeneratedMessageLite.b) this).instance).clearLinkState();
                return this;
            }

            public Builder clearLiveId() {
                copyOnWrite();
                ((Auth) ((GeneratedMessageLite.b) this).instance).clearLiveId();
                return this;
            }

            public Builder clearLiveMode() {
                copyOnWrite();
                ((Auth) ((GeneratedMessageLite.b) this).instance).clearLiveMode();
                return this;
            }

            public Builder clearLoc() {
                copyOnWrite();
                ((Auth) ((GeneratedMessageLite.b) this).instance).clearLoc();
                return this;
            }

            public Builder clearLocale() {
                copyOnWrite();
                ((Auth) ((GeneratedMessageLite.b) this).instance).clearLocale();
                return this;
            }

            public Builder clearRetryCount() {
                copyOnWrite();
                ((Auth) ((GeneratedMessageLite.b) this).instance).clearRetryCount();
                return this;
            }

            public Builder clearRoomId() {
                copyOnWrite();
                ((Auth) ((GeneratedMessageLite.b) this).instance).clearRoomId();
                return this;
            }

            public Builder clearRoomType() {
                copyOnWrite();
                ((Auth) ((GeneratedMessageLite.b) this).instance).clearRoomType();
                return this;
            }

            public Builder clearSessionId() {
                copyOnWrite();
                ((Auth) ((GeneratedMessageLite.b) this).instance).clearSessionId();
                return this;
            }

            public Builder clearSource() {
                copyOnWrite();
                ((Auth) ((GeneratedMessageLite.b) this).instance).clearSource();
                return this;
            }

            public Builder clearStaySide() {
                copyOnWrite();
                ((Auth) ((GeneratedMessageLite.b) this).instance).clearStaySide();
                return this;
            }

            public Builder clearUa() {
                copyOnWrite();
                ((Auth) ((GeneratedMessageLite.b) this).instance).clearUa();
                return this;
            }

            public Builder clearUserId() {
                copyOnWrite();
                ((Auth) ((GeneratedMessageLite.b) this).instance).clearUserId();
                return this;
            }

            public Builder clearXTTClientInfo() {
                copyOnWrite();
                ((Auth) ((GeneratedMessageLite.b) this).instance).clearXTTClientInfo();
                return this;
            }

            public Builder clearXTestingGroup() {
                copyOnWrite();
                ((Auth) ((GeneratedMessageLite.b) this).instance).clearXTestingGroup();
                return this;
            }

            @Override // com.p1.mobile.longlink.msg.liveConnector.liveAuthMessageNew.AuthOrBuilder
            public long getCurrentStartLinkTime() {
                return ((Auth) ((GeneratedMessageLite.b) this).instance).getCurrentStartLinkTime();
            }

            @Override // com.p1.mobile.longlink.msg.liveConnector.liveAuthMessageNew.AuthOrBuilder
            public long getCurrentTime() {
                return ((Auth) ((GeneratedMessageLite.b) this).instance).getCurrentTime();
            }

            @Override // com.p1.mobile.longlink.msg.liveConnector.liveAuthMessageNew.AuthOrBuilder
            public String getEnterSource() {
                return ((Auth) ((GeneratedMessageLite.b) this).instance).getEnterSource();
            }

            @Override // com.p1.mobile.longlink.msg.liveConnector.liveAuthMessageNew.AuthOrBuilder
            public ByteString getEnterSourceBytes() {
                return ((Auth) ((GeneratedMessageLite.b) this).instance).getEnterSourceBytes();
            }

            @Override // com.p1.mobile.longlink.msg.liveConnector.liveAuthMessageNew.AuthOrBuilder
            public String getExt() {
                return ((Auth) ((GeneratedMessageLite.b) this).instance).getExt();
            }

            @Override // com.p1.mobile.longlink.msg.liveConnector.liveAuthMessageNew.AuthOrBuilder
            public ByteString getExtBytes() {
                return ((Auth) ((GeneratedMessageLite.b) this).instance).getExtBytes();
            }

            @Override // com.p1.mobile.longlink.msg.liveConnector.liveAuthMessageNew.AuthOrBuilder
            public long getFirstLinkTime() {
                return ((Auth) ((GeneratedMessageLite.b) this).instance).getFirstLinkTime();
            }

            @Override // com.p1.mobile.longlink.msg.liveConnector.liveAuthMessageNew.AuthOrBuilder
            public ByteString getFlag() {
                return ((Auth) ((GeneratedMessageLite.b) this).instance).getFlag();
            }

            @Override // com.p1.mobile.longlink.msg.liveConnector.liveAuthMessageNew.AuthOrBuilder
            public long getInterruptLinkTime() {
                return ((Auth) ((GeneratedMessageLite.b) this).instance).getInterruptLinkTime();
            }

            @Override // com.p1.mobile.longlink.msg.liveConnector.liveAuthMessageNew.AuthOrBuilder
            public boolean getIosVerify() {
                return ((Auth) ((GeneratedMessageLite.b) this).instance).getIosVerify();
            }

            @Override // com.p1.mobile.longlink.msg.liveConnector.liveAuthMessageNew.AuthOrBuilder
            public String getIpHost() {
                return ((Auth) ((GeneratedMessageLite.b) this).instance).getIpHost();
            }

            @Override // com.p1.mobile.longlink.msg.liveConnector.liveAuthMessageNew.AuthOrBuilder
            public ByteString getIpHostBytes() {
                return ((Auth) ((GeneratedMessageLite.b) this).instance).getIpHostBytes();
            }

            @Override // com.p1.mobile.longlink.msg.liveConnector.liveAuthMessageNew.AuthOrBuilder
            public int getLinkState() {
                return ((Auth) ((GeneratedMessageLite.b) this).instance).getLinkState();
            }

            @Override // com.p1.mobile.longlink.msg.liveConnector.liveAuthMessageNew.AuthOrBuilder
            public String getLiveId() {
                return ((Auth) ((GeneratedMessageLite.b) this).instance).getLiveId();
            }

            @Override // com.p1.mobile.longlink.msg.liveConnector.liveAuthMessageNew.AuthOrBuilder
            public ByteString getLiveIdBytes() {
                return ((Auth) ((GeneratedMessageLite.b) this).instance).getLiveIdBytes();
            }

            @Override // com.p1.mobile.longlink.msg.liveConnector.liveAuthMessageNew.AuthOrBuilder
            public String getLiveMode() {
                return ((Auth) ((GeneratedMessageLite.b) this).instance).getLiveMode();
            }

            @Override // com.p1.mobile.longlink.msg.liveConnector.liveAuthMessageNew.AuthOrBuilder
            public ByteString getLiveModeBytes() {
                return ((Auth) ((GeneratedMessageLite.b) this).instance).getLiveModeBytes();
            }

            @Override // com.p1.mobile.longlink.msg.liveConnector.liveAuthMessageNew.AuthOrBuilder
            public Location getLoc() {
                return ((Auth) ((GeneratedMessageLite.b) this).instance).getLoc();
            }

            @Override // com.p1.mobile.longlink.msg.liveConnector.liveAuthMessageNew.AuthOrBuilder
            public String getLocale() {
                return ((Auth) ((GeneratedMessageLite.b) this).instance).getLocale();
            }

            @Override // com.p1.mobile.longlink.msg.liveConnector.liveAuthMessageNew.AuthOrBuilder
            public ByteString getLocaleBytes() {
                return ((Auth) ((GeneratedMessageLite.b) this).instance).getLocaleBytes();
            }

            @Override // com.p1.mobile.longlink.msg.liveConnector.liveAuthMessageNew.AuthOrBuilder
            public int getRetryCount() {
                return ((Auth) ((GeneratedMessageLite.b) this).instance).getRetryCount();
            }

            @Override // com.p1.mobile.longlink.msg.liveConnector.liveAuthMessageNew.AuthOrBuilder
            public String getRoomId() {
                return ((Auth) ((GeneratedMessageLite.b) this).instance).getRoomId();
            }

            @Override // com.p1.mobile.longlink.msg.liveConnector.liveAuthMessageNew.AuthOrBuilder
            public ByteString getRoomIdBytes() {
                return ((Auth) ((GeneratedMessageLite.b) this).instance).getRoomIdBytes();
            }

            @Override // com.p1.mobile.longlink.msg.liveConnector.liveAuthMessageNew.AuthOrBuilder
            public String getRoomType() {
                return ((Auth) ((GeneratedMessageLite.b) this).instance).getRoomType();
            }

            @Override // com.p1.mobile.longlink.msg.liveConnector.liveAuthMessageNew.AuthOrBuilder
            public ByteString getRoomTypeBytes() {
                return ((Auth) ((GeneratedMessageLite.b) this).instance).getRoomTypeBytes();
            }

            @Override // com.p1.mobile.longlink.msg.liveConnector.liveAuthMessageNew.AuthOrBuilder
            public String getSessionId() {
                return ((Auth) ((GeneratedMessageLite.b) this).instance).getSessionId();
            }

            @Override // com.p1.mobile.longlink.msg.liveConnector.liveAuthMessageNew.AuthOrBuilder
            public ByteString getSessionIdBytes() {
                return ((Auth) ((GeneratedMessageLite.b) this).instance).getSessionIdBytes();
            }

            @Override // com.p1.mobile.longlink.msg.liveConnector.liveAuthMessageNew.AuthOrBuilder
            public ClientSourceEnum getSource() {
                return ((Auth) ((GeneratedMessageLite.b) this).instance).getSource();
            }

            @Override // com.p1.mobile.longlink.msg.liveConnector.liveAuthMessageNew.AuthOrBuilder
            public int getSourceValue() {
                return ((Auth) ((GeneratedMessageLite.b) this).instance).getSourceValue();
            }

            @Override // com.p1.mobile.longlink.msg.liveConnector.liveAuthMessageNew.AuthOrBuilder
            public AppStaySideEnum getStaySide() {
                return ((Auth) ((GeneratedMessageLite.b) this).instance).getStaySide();
            }

            @Override // com.p1.mobile.longlink.msg.liveConnector.liveAuthMessageNew.AuthOrBuilder
            public int getStaySideValue() {
                return ((Auth) ((GeneratedMessageLite.b) this).instance).getStaySideValue();
            }

            @Override // com.p1.mobile.longlink.msg.liveConnector.liveAuthMessageNew.AuthOrBuilder
            public UserAgent getUa() {
                return ((Auth) ((GeneratedMessageLite.b) this).instance).getUa();
            }

            @Override // com.p1.mobile.longlink.msg.liveConnector.liveAuthMessageNew.AuthOrBuilder
            public String getUserId() {
                return ((Auth) ((GeneratedMessageLite.b) this).instance).getUserId();
            }

            @Override // com.p1.mobile.longlink.msg.liveConnector.liveAuthMessageNew.AuthOrBuilder
            public ByteString getUserIdBytes() {
                return ((Auth) ((GeneratedMessageLite.b) this).instance).getUserIdBytes();
            }

            @Override // com.p1.mobile.longlink.msg.liveConnector.liveAuthMessageNew.AuthOrBuilder
            public ByteString getXTTClientInfo() {
                return ((Auth) ((GeneratedMessageLite.b) this).instance).getXTTClientInfo();
            }

            @Override // com.p1.mobile.longlink.msg.liveConnector.liveAuthMessageNew.AuthOrBuilder
            public ByteString getXTestingGroup() {
                return ((Auth) ((GeneratedMessageLite.b) this).instance).getXTestingGroup();
            }

            @Override // com.p1.mobile.longlink.msg.liveConnector.liveAuthMessageNew.AuthOrBuilder
            public boolean hasLoc() {
                return ((Auth) ((GeneratedMessageLite.b) this).instance).hasLoc();
            }

            @Override // com.p1.mobile.longlink.msg.liveConnector.liveAuthMessageNew.AuthOrBuilder
            public boolean hasUa() {
                return ((Auth) ((GeneratedMessageLite.b) this).instance).hasUa();
            }

            public Builder mergeLoc(Location location) {
                copyOnWrite();
                ((Auth) ((GeneratedMessageLite.b) this).instance).mergeLoc(location);
                return this;
            }

            public Builder mergeUa(UserAgent userAgent) {
                copyOnWrite();
                ((Auth) ((GeneratedMessageLite.b) this).instance).mergeUa(userAgent);
                return this;
            }

            public Builder setCurrentStartLinkTime(long j) {
                copyOnWrite();
                ((Auth) ((GeneratedMessageLite.b) this).instance).setCurrentStartLinkTime(j);
                return this;
            }

            public Builder setCurrentTime(long j) {
                copyOnWrite();
                ((Auth) ((GeneratedMessageLite.b) this).instance).setCurrentTime(j);
                return this;
            }

            public Builder setEnterSource(String str) {
                copyOnWrite();
                ((Auth) ((GeneratedMessageLite.b) this).instance).setEnterSource(str);
                return this;
            }

            public Builder setEnterSourceBytes(ByteString byteString) {
                copyOnWrite();
                ((Auth) ((GeneratedMessageLite.b) this).instance).setEnterSourceBytes(byteString);
                return this;
            }

            public Builder setExt(String str) {
                copyOnWrite();
                ((Auth) ((GeneratedMessageLite.b) this).instance).setExt(str);
                return this;
            }

            public Builder setExtBytes(ByteString byteString) {
                copyOnWrite();
                ((Auth) ((GeneratedMessageLite.b) this).instance).setExtBytes(byteString);
                return this;
            }

            public Builder setFirstLinkTime(long j) {
                copyOnWrite();
                ((Auth) ((GeneratedMessageLite.b) this).instance).setFirstLinkTime(j);
                return this;
            }

            public Builder setFlag(ByteString byteString) {
                copyOnWrite();
                ((Auth) ((GeneratedMessageLite.b) this).instance).setFlag(byteString);
                return this;
            }

            public Builder setInterruptLinkTime(long j) {
                copyOnWrite();
                ((Auth) ((GeneratedMessageLite.b) this).instance).setInterruptLinkTime(j);
                return this;
            }

            public Builder setIosVerify(boolean z) {
                copyOnWrite();
                ((Auth) ((GeneratedMessageLite.b) this).instance).setIosVerify(z);
                return this;
            }

            public Builder setIpHost(String str) {
                copyOnWrite();
                ((Auth) ((GeneratedMessageLite.b) this).instance).setIpHost(str);
                return this;
            }

            public Builder setIpHostBytes(ByteString byteString) {
                copyOnWrite();
                ((Auth) ((GeneratedMessageLite.b) this).instance).setIpHostBytes(byteString);
                return this;
            }

            public Builder setLinkState(int i) {
                copyOnWrite();
                ((Auth) ((GeneratedMessageLite.b) this).instance).setLinkState(i);
                return this;
            }

            public Builder setLiveId(String str) {
                copyOnWrite();
                ((Auth) ((GeneratedMessageLite.b) this).instance).setLiveId(str);
                return this;
            }

            public Builder setLiveIdBytes(ByteString byteString) {
                copyOnWrite();
                ((Auth) ((GeneratedMessageLite.b) this).instance).setLiveIdBytes(byteString);
                return this;
            }

            public Builder setLiveMode(String str) {
                copyOnWrite();
                ((Auth) ((GeneratedMessageLite.b) this).instance).setLiveMode(str);
                return this;
            }

            public Builder setLiveModeBytes(ByteString byteString) {
                copyOnWrite();
                ((Auth) ((GeneratedMessageLite.b) this).instance).setLiveModeBytes(byteString);
                return this;
            }

            public Builder setLoc(Location location) {
                copyOnWrite();
                ((Auth) ((GeneratedMessageLite.b) this).instance).setLoc(location);
                return this;
            }

            public Builder setLocale(String str) {
                copyOnWrite();
                ((Auth) ((GeneratedMessageLite.b) this).instance).setLocale(str);
                return this;
            }

            public Builder setLocaleBytes(ByteString byteString) {
                copyOnWrite();
                ((Auth) ((GeneratedMessageLite.b) this).instance).setLocaleBytes(byteString);
                return this;
            }

            public Builder setRetryCount(int i) {
                copyOnWrite();
                ((Auth) ((GeneratedMessageLite.b) this).instance).setRetryCount(i);
                return this;
            }

            public Builder setRoomId(String str) {
                copyOnWrite();
                ((Auth) ((GeneratedMessageLite.b) this).instance).setRoomId(str);
                return this;
            }

            public Builder setRoomIdBytes(ByteString byteString) {
                copyOnWrite();
                ((Auth) ((GeneratedMessageLite.b) this).instance).setRoomIdBytes(byteString);
                return this;
            }

            public Builder setRoomType(String str) {
                copyOnWrite();
                ((Auth) ((GeneratedMessageLite.b) this).instance).setRoomType(str);
                return this;
            }

            public Builder setRoomTypeBytes(ByteString byteString) {
                copyOnWrite();
                ((Auth) ((GeneratedMessageLite.b) this).instance).setRoomTypeBytes(byteString);
                return this;
            }

            public Builder setSessionId(String str) {
                copyOnWrite();
                ((Auth) ((GeneratedMessageLite.b) this).instance).setSessionId(str);
                return this;
            }

            public Builder setSessionIdBytes(ByteString byteString) {
                copyOnWrite();
                ((Auth) ((GeneratedMessageLite.b) this).instance).setSessionIdBytes(byteString);
                return this;
            }

            public Builder setSource(ClientSourceEnum clientSourceEnum) {
                copyOnWrite();
                ((Auth) ((GeneratedMessageLite.b) this).instance).setSource(clientSourceEnum);
                return this;
            }

            public Builder setSourceValue(int i) {
                copyOnWrite();
                ((Auth) ((GeneratedMessageLite.b) this).instance).setSourceValue(i);
                return this;
            }

            public Builder setStaySide(AppStaySideEnum appStaySideEnum) {
                copyOnWrite();
                ((Auth) ((GeneratedMessageLite.b) this).instance).setStaySide(appStaySideEnum);
                return this;
            }

            public Builder setStaySideValue(int i) {
                copyOnWrite();
                ((Auth) ((GeneratedMessageLite.b) this).instance).setStaySideValue(i);
                return this;
            }

            public Builder setUa(UserAgent userAgent) {
                copyOnWrite();
                ((Auth) ((GeneratedMessageLite.b) this).instance).setUa(userAgent);
                return this;
            }

            public Builder setUserId(String str) {
                copyOnWrite();
                ((Auth) ((GeneratedMessageLite.b) this).instance).setUserId(str);
                return this;
            }

            public Builder setUserIdBytes(ByteString byteString) {
                copyOnWrite();
                ((Auth) ((GeneratedMessageLite.b) this).instance).setUserIdBytes(byteString);
                return this;
            }

            public Builder setXTTClientInfo(ByteString byteString) {
                copyOnWrite();
                ((Auth) ((GeneratedMessageLite.b) this).instance).setXTTClientInfo(byteString);
                return this;
            }

            public Builder setXTestingGroup(ByteString byteString) {
                copyOnWrite();
                ((Auth) ((GeneratedMessageLite.b) this).instance).setXTestingGroup(byteString);
                return this;
            }

            public Builder setLoc(Location.Builder builder) {
                copyOnWrite();
                ((Auth) ((GeneratedMessageLite.b) this).instance).setLoc(builder);
                return this;
            }

            public Builder setUa(UserAgent.Builder builder) {
                copyOnWrite();
                ((Auth) ((GeneratedMessageLite.b) this).instance).setUa(builder);
                return this;
            }
        }

        public static Auth parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (Auth) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static Auth parseFrom(byte[] bArr, h hVar) throws InvalidProtocolBufferException {
            return (Auth) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, hVar);
        }

        public static Auth parseFrom(InputStream inputStream) throws IOException {
            return (Auth) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Auth parseFrom(InputStream inputStream, h hVar) throws IOException {
            return (Auth) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, hVar);
        }

        public static Auth parseFrom(e eVar) throws IOException {
            return (Auth) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, eVar);
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.toBuilder();
        }

        public static Auth parseFrom(e eVar, h hVar) throws IOException {
            return (Auth) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, eVar, hVar);
        }
    }

    public static final class AuthKey extends GeneratedMessageLite<AuthKey, Builder> implements AuthKeyOrBuilder {
        private static final AuthKey DEFAULT_INSTANCE;
        private static volatile i860<AuthKey> PARSER = null;
        public static final int ROOMKEY_FIELD_NUMBER = 1;
        private String roomKey_ = "";

        public static final class Builder extends GeneratedMessageLite.b<AuthKey, Builder> implements AuthKeyOrBuilder {
            private Builder() {
                super(AuthKey.DEFAULT_INSTANCE);
            }

            public Builder clearRoomKey() {
                copyOnWrite();
                ((AuthKey) ((GeneratedMessageLite.b) this).instance).clearRoomKey();
                return this;
            }

            @Override // com.p1.mobile.longlink.msg.liveConnector.liveAuthMessageNew.AuthKeyOrBuilder
            public String getRoomKey() {
                return ((AuthKey) ((GeneratedMessageLite.b) this).instance).getRoomKey();
            }

            @Override // com.p1.mobile.longlink.msg.liveConnector.liveAuthMessageNew.AuthKeyOrBuilder
            public ByteString getRoomKeyBytes() {
                return ((AuthKey) ((GeneratedMessageLite.b) this).instance).getRoomKeyBytes();
            }

            public Builder setRoomKey(String str) {
                copyOnWrite();
                ((AuthKey) ((GeneratedMessageLite.b) this).instance).setRoomKey(str);
                return this;
            }

            public Builder setRoomKeyBytes(ByteString byteString) {
                copyOnWrite();
                ((AuthKey) ((GeneratedMessageLite.b) this).instance).setRoomKeyBytes(byteString);
                return this;
            }
        }

        static {
            AuthKey authKey = new AuthKey();
            DEFAULT_INSTANCE = authKey;
            authKey.makeImmutable();
        }

        private AuthKey() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearRoomKey() {
            this.roomKey_ = getDefaultInstance().getRoomKey();
        }

        public static AuthKey getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder(AuthKey authKey) {
            return (Builder) ((Builder) DEFAULT_INSTANCE.toBuilder()).mergeFrom(authKey);
        }

        public static AuthKey parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (AuthKey) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static AuthKey parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (AuthKey) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static i860<AuthKey> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setRoomKey(String str) {
            str.getClass();
            this.roomKey_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setRoomKeyBytes(ByteString byteString) {
            byteString.getClass();
            a.checkByteStringIsUtf8(byteString);
            this.roomKey_ = byteString.toStringUtf8();
        }

        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (C03411.f1649xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new AuthKey();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                    return null;
                case 4:
                    return new Builder();
                case 5:
                    AuthKey authKey = (AuthKey) obj2;
                    this.roomKey_ = ((GeneratedMessageLite.h) obj).f(!this.roomKey_.isEmpty(), this.roomKey_, true ^ authKey.roomKey_.isEmpty(), authKey.roomKey_);
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
                                    this.roomKey_ = eVar.L();
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
                        synchronized (AuthKey.class) {
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

        @Override // com.p1.mobile.longlink.msg.liveConnector.liveAuthMessageNew.AuthKeyOrBuilder
        public String getRoomKey() {
            return this.roomKey_;
        }

        @Override // com.p1.mobile.longlink.msg.liveConnector.liveAuthMessageNew.AuthKeyOrBuilder
        public ByteString getRoomKeyBytes() {
            return ByteString.copyFromUtf8(this.roomKey_);
        }

        public int getSerializedSize() {
            int i = ((GeneratedMessageLite) this).memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int iK = !this.roomKey_.isEmpty() ? CodedOutputStream.K(1, getRoomKey()) : 0;
            ((GeneratedMessageLite) this).memoizedSerializedSize = iK;
            return iK;
        }

        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (this.roomKey_.isEmpty()) {
                return;
            }
            codedOutputStream.D0(1, getRoomKey());
        }

        public static AuthKey parseDelimitedFrom(InputStream inputStream, h hVar) throws IOException {
            return (AuthKey) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, hVar);
        }

        public static AuthKey parseFrom(ByteString byteString, h hVar) throws InvalidProtocolBufferException {
            return (AuthKey) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, hVar);
        }

        public static AuthKey parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (AuthKey) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static AuthKey parseFrom(byte[] bArr, h hVar) throws InvalidProtocolBufferException {
            return (AuthKey) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, hVar);
        }

        public static AuthKey parseFrom(InputStream inputStream) throws IOException {
            return (AuthKey) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static AuthKey parseFrom(InputStream inputStream, h hVar) throws IOException {
            return (AuthKey) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, hVar);
        }

        public static AuthKey parseFrom(e eVar) throws IOException {
            return (AuthKey) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, eVar);
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.toBuilder();
        }

        public static AuthKey parseFrom(e eVar, h hVar) throws IOException {
            return (AuthKey) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, eVar, hVar);
        }
    }

    public static final class ChatReaded extends GeneratedMessageLite<ChatReaded, Builder> implements ChatReadedOrBuilder {
        private static final ChatReaded DEFAULT_INSTANCE;
        private static volatile i860<ChatReaded> PARSER = null;
        public static final int SEQ_FIELD_NUMBER = 1;
        private long seq_;

        public static final class Builder extends GeneratedMessageLite.b<ChatReaded, Builder> implements ChatReadedOrBuilder {
            private Builder() {
                super(ChatReaded.DEFAULT_INSTANCE);
            }

            public Builder clearSeq() {
                copyOnWrite();
                ((ChatReaded) ((GeneratedMessageLite.b) this).instance).clearSeq();
                return this;
            }

            @Override // com.p1.mobile.longlink.msg.liveConnector.liveAuthMessageNew.ChatReadedOrBuilder
            public long getSeq() {
                return ((ChatReaded) ((GeneratedMessageLite.b) this).instance).getSeq();
            }

            public Builder setSeq(long j) {
                copyOnWrite();
                ((ChatReaded) ((GeneratedMessageLite.b) this).instance).setSeq(j);
                return this;
            }
        }

        static {
            ChatReaded chatReaded = new ChatReaded();
            DEFAULT_INSTANCE = chatReaded;
            chatReaded.makeImmutable();
        }

        private ChatReaded() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearSeq() {
            this.seq_ = 0L;
        }

        public static ChatReaded getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder(ChatReaded chatReaded) {
            return (Builder) ((Builder) DEFAULT_INSTANCE.toBuilder()).mergeFrom(chatReaded);
        }

        public static ChatReaded parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (ChatReaded) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static ChatReaded parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (ChatReaded) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static i860<ChatReaded> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSeq(long j) {
            this.seq_ = j;
        }

        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            boolean z = false;
            switch (C03411.f1649xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new ChatReaded();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                    return null;
                case 4:
                    return new Builder();
                case 5:
                    GeneratedMessageLite.h hVar = (GeneratedMessageLite.h) obj;
                    ChatReaded chatReaded = (ChatReaded) obj2;
                    long j = this.seq_;
                    boolean z2 = j != 0;
                    long j2 = chatReaded.seq_;
                    this.seq_ = hVar.i(z2, j, j2 != 0, j2);
                    GeneratedMessageLite.g gVar = GeneratedMessageLite.g.INSTANCE;
                    return this;
                case 6:
                    e eVar = (e) obj;
                    while (!z) {
                        try {
                            int iM = eVar.M();
                            if (iM != 0) {
                                if (iM == 8) {
                                    this.seq_ = eVar.O();
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
                        synchronized (ChatReaded.class) {
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

        @Override // com.p1.mobile.longlink.msg.liveConnector.liveAuthMessageNew.ChatReadedOrBuilder
        public long getSeq() {
            return this.seq_;
        }

        public int getSerializedSize() {
            int i = ((GeneratedMessageLite) this).memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            long j = this.seq_;
            int iP = j != 0 ? CodedOutputStream.P(1, j) : 0;
            ((GeneratedMessageLite) this).memoizedSerializedSize = iP;
            return iP;
        }

        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            long j = this.seq_;
            if (j != 0) {
                codedOutputStream.I0(1, j);
            }
        }

        public static ChatReaded parseDelimitedFrom(InputStream inputStream, h hVar) throws IOException {
            return (ChatReaded) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, hVar);
        }

        public static ChatReaded parseFrom(ByteString byteString, h hVar) throws InvalidProtocolBufferException {
            return (ChatReaded) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, hVar);
        }

        public static ChatReaded parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (ChatReaded) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static ChatReaded parseFrom(byte[] bArr, h hVar) throws InvalidProtocolBufferException {
            return (ChatReaded) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, hVar);
        }

        public static ChatReaded parseFrom(InputStream inputStream) throws IOException {
            return (ChatReaded) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static ChatReaded parseFrom(InputStream inputStream, h hVar) throws IOException {
            return (ChatReaded) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, hVar);
        }

        public static ChatReaded parseFrom(e eVar) throws IOException {
            return (ChatReaded) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, eVar);
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.toBuilder();
        }

        public static ChatReaded parseFrom(e eVar, h hVar) throws IOException {
            return (ChatReaded) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, eVar, hVar);
        }
    }

    public enum ClientSourceEnum implements l.c {
        CLIENT_SOURCE_ANDROID(0),
        CLIENT_SOURCE_IOS(1),
        CLIENT_SOURCE_WEB(2),
        UNRECOGNIZED(-1);

        public static final int CLIENT_SOURCE_ANDROID_VALUE = 0;
        public static final int CLIENT_SOURCE_IOS_VALUE = 1;
        public static final int CLIENT_SOURCE_WEB_VALUE = 2;
        private static final l.d<ClientSourceEnum> internalValueMap = new l.d<ClientSourceEnum>() { // from class: com.p1.mobile.longlink.msg.liveConnector.liveAuthMessageNew.ClientSourceEnum.1
            public ClientSourceEnum findValueByNumber(int i) {
                return ClientSourceEnum.forNumber(i);
            }
        };
        private final int value;

        ClientSourceEnum(int i) {
            this.value = i;
        }

        public static ClientSourceEnum forNumber(int i) {
            if (i == 0) {
                return CLIENT_SOURCE_ANDROID;
            }
            if (i == 1) {
                return CLIENT_SOURCE_IOS;
            }
            if (i != 2) {
                return null;
            }
            return CLIENT_SOURCE_WEB;
        }

        public static l.d<ClientSourceEnum> internalGetValueMap() {
            return internalValueMap;
        }

        public final int getNumber() {
            return this.value;
        }

        @Deprecated
        public static ClientSourceEnum valueOf(int i) {
            return forNumber(i);
        }
    }

    public static final class Location extends GeneratedMessageLite<Location, Builder> implements LocationOrBuilder {
        private static final Location DEFAULT_INSTANCE;
        public static final int LAT_FIELD_NUMBER = 2;
        public static final int LON_FIELD_NUMBER = 1;
        private static volatile i860<Location> PARSER;
        private float lat_;
        private float lon_;

        public static final class Builder extends GeneratedMessageLite.b<Location, Builder> implements LocationOrBuilder {
            private Builder() {
                super(Location.DEFAULT_INSTANCE);
            }

            public Builder clearLat() {
                copyOnWrite();
                ((Location) ((GeneratedMessageLite.b) this).instance).clearLat();
                return this;
            }

            public Builder clearLon() {
                copyOnWrite();
                ((Location) ((GeneratedMessageLite.b) this).instance).clearLon();
                return this;
            }

            @Override // com.p1.mobile.longlink.msg.liveConnector.liveAuthMessageNew.LocationOrBuilder
            public float getLat() {
                return ((Location) ((GeneratedMessageLite.b) this).instance).getLat();
            }

            @Override // com.p1.mobile.longlink.msg.liveConnector.liveAuthMessageNew.LocationOrBuilder
            public float getLon() {
                return ((Location) ((GeneratedMessageLite.b) this).instance).getLon();
            }

            public Builder setLat(float f) {
                copyOnWrite();
                ((Location) ((GeneratedMessageLite.b) this).instance).setLat(f);
                return this;
            }

            public Builder setLon(float f) {
                copyOnWrite();
                ((Location) ((GeneratedMessageLite.b) this).instance).setLon(f);
                return this;
            }
        }

        static {
            Location location = new Location();
            DEFAULT_INSTANCE = location;
            location.makeImmutable();
        }

        private Location() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearLat() {
            this.lat_ = 0.0f;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearLon() {
            this.lon_ = 0.0f;
        }

        public static Location getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder(Location location) {
            return (Builder) ((Builder) DEFAULT_INSTANCE.toBuilder()).mergeFrom(location);
        }

        public static Location parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (Location) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Location parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (Location) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static i860<Location> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setLat(float f) {
            this.lat_ = f;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setLon(float f) {
            this.lon_ = f;
        }

        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            boolean z = false;
            switch (C03411.f1649xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new Location();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                    return null;
                case 4:
                    return new Builder();
                case 5:
                    GeneratedMessageLite.h hVar = (GeneratedMessageLite.h) obj;
                    Location location = (Location) obj2;
                    float f = this.lon_;
                    boolean z2 = f != 0.0f;
                    float f2 = location.lon_;
                    this.lon_ = hVar.p(z2, f, f2 != 0.0f, f2);
                    float f3 = this.lat_;
                    boolean z3 = f3 != 0.0f;
                    float f4 = location.lat_;
                    this.lat_ = hVar.p(z3, f3, f4 != 0.0f, f4);
                    GeneratedMessageLite.g gVar = GeneratedMessageLite.g.INSTANCE;
                    return this;
                case 6:
                    e eVar = (e) obj;
                    while (!z) {
                        try {
                            int iM = eVar.M();
                            if (iM != 0) {
                                if (iM == 13) {
                                    this.lon_ = eVar.s();
                                } else if (iM == 21) {
                                    this.lat_ = eVar.s();
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
                        synchronized (Location.class) {
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

        @Override // com.p1.mobile.longlink.msg.liveConnector.liveAuthMessageNew.LocationOrBuilder
        public float getLat() {
            return this.lat_;
        }

        @Override // com.p1.mobile.longlink.msg.liveConnector.liveAuthMessageNew.LocationOrBuilder
        public float getLon() {
            return this.lon_;
        }

        public int getSerializedSize() {
            int i = ((GeneratedMessageLite) this).memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            float f = this.lon_;
            int iQ = f != 0.0f ? CodedOutputStream.q(1, f) : 0;
            float f2 = this.lat_;
            if (f2 != 0.0f) {
                iQ += CodedOutputStream.q(2, f2);
            }
            ((GeneratedMessageLite) this).memoizedSerializedSize = iQ;
            return iQ;
        }

        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            float f = this.lon_;
            if (f != 0.0f) {
                codedOutputStream.o0(1, f);
            }
            float f2 = this.lat_;
            if (f2 != 0.0f) {
                codedOutputStream.o0(2, f2);
            }
        }

        public static Location parseDelimitedFrom(InputStream inputStream, h hVar) throws IOException {
            return (Location) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, hVar);
        }

        public static Location parseFrom(ByteString byteString, h hVar) throws InvalidProtocolBufferException {
            return (Location) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, hVar);
        }

        public static Location parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (Location) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static Location parseFrom(byte[] bArr, h hVar) throws InvalidProtocolBufferException {
            return (Location) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, hVar);
        }

        public static Location parseFrom(InputStream inputStream) throws IOException {
            return (Location) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Location parseFrom(InputStream inputStream, h hVar) throws IOException {
            return (Location) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, hVar);
        }

        public static Location parseFrom(e eVar) throws IOException {
            return (Location) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, eVar);
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.toBuilder();
        }

        public static Location parseFrom(e eVar, h hVar) throws IOException {
            return (Location) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, eVar, hVar);
        }
    }

    public static final class Msg extends GeneratedMessageLite<Msg, Builder> implements MsgOrBuilder {
        public static final int DATA_FIELD_NUMBER = 6;
        private static final Msg DEFAULT_INSTANCE;
        public static final int ISRESPONSE_FIELD_NUMBER = 4;
        public static final int MSGID_FIELD_NUMBER = 2;
        public static final int MSGTYPENAME_FIELD_NUMBER = 3;
        private static volatile i860<Msg> PARSER = null;
        public static final int STATUS_FIELD_NUMBER = 5;
        public static final int VERSION_FIELD_NUMBER = 1;
        private Any data_;
        private boolean isResponse_;
        private String msgId_ = "";
        private String msgTypeName_ = "";
        private Status status_;
        private int version_;

        static {
            Msg msg = new Msg();
            DEFAULT_INSTANCE = msg;
            msg.makeImmutable();
        }

        private Msg() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearData() {
            this.data_ = null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearIsResponse() {
            this.isResponse_ = false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearMsgId() {
            this.msgId_ = getDefaultInstance().getMsgId();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearMsgTypeName() {
            this.msgTypeName_ = getDefaultInstance().getMsgTypeName();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearStatus() {
            this.status_ = null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearVersion() {
            this.version_ = 0;
        }

        public static Msg getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeData(Any any) {
            Any any2 = this.data_;
            if (any2 == null || any2 == Any.getDefaultInstance()) {
                this.data_ = any;
            } else {
                this.data_ = Any.newBuilder(this.data_).mergeFrom(any).buildPartial();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeStatus(Status status) {
            Status status2 = this.status_;
            if (status2 == null || status2 == Status.getDefaultInstance()) {
                this.status_ = status;
            } else {
                this.status_ = (Status) ((Status.Builder) Status.newBuilder(this.status_).mergeFrom(status)).buildPartial();
            }
        }

        public static Builder newBuilder(Msg msg) {
            return (Builder) ((Builder) DEFAULT_INSTANCE.toBuilder()).mergeFrom(msg);
        }

        public static Msg parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (Msg) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Msg parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (Msg) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static i860<Msg> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setData(Any.b bVar) {
            this.data_ = bVar.build();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setIsResponse(boolean z) {
            this.isResponse_ = z;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setMsgId(String str) {
            str.getClass();
            this.msgId_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setMsgIdBytes(ByteString byteString) {
            byteString.getClass();
            a.checkByteStringIsUtf8(byteString);
            this.msgId_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setMsgTypeName(String str) {
            str.getClass();
            this.msgTypeName_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setMsgTypeNameBytes(ByteString byteString) {
            byteString.getClass();
            a.checkByteStringIsUtf8(byteString);
            this.msgTypeName_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setStatus(Status.Builder builder) {
            this.status_ = (Status) builder.build();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setVersion(int i) {
            this.version_ = i;
        }

        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            boolean z = false;
            switch (C03411.f1649xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new Msg();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                    return null;
                case 4:
                    return new Builder();
                case 5:
                    GeneratedMessageLite.h hVar = (GeneratedMessageLite.h) obj;
                    Msg msg = (Msg) obj2;
                    int i = this.version_;
                    boolean z2 = i != 0;
                    int i2 = msg.version_;
                    this.version_ = hVar.e(z2, i, i2 != 0, i2);
                    this.msgId_ = hVar.f(!this.msgId_.isEmpty(), this.msgId_, !msg.msgId_.isEmpty(), msg.msgId_);
                    this.msgTypeName_ = hVar.f(!this.msgTypeName_.isEmpty(), this.msgTypeName_, !msg.msgTypeName_.isEmpty(), msg.msgTypeName_);
                    boolean z3 = this.isResponse_;
                    boolean z4 = msg.isResponse_;
                    this.isResponse_ = hVar.d(z3, z3, z4, z4);
                    this.status_ = hVar.o(this.status_, msg.status_);
                    this.data_ = hVar.o(this.data_, msg.data_);
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
                                    this.version_ = eVar.u();
                                } else if (iM == 18) {
                                    this.msgId_ = eVar.L();
                                } else if (iM == 26) {
                                    this.msgTypeName_ = eVar.L();
                                } else if (iM == 32) {
                                    this.isResponse_ = eVar.m();
                                } else if (iM == 42) {
                                    Status status = this.status_;
                                    Status.Builder builder = status != null ? (Status.Builder) status.toBuilder() : null;
                                    Status statusW = eVar.w(Status.parser(), hVar2);
                                    this.status_ = statusW;
                                    if (builder != null) {
                                        builder.mergeFrom(statusW);
                                        this.status_ = (Status) builder.buildPartial();
                                    }
                                } else if (iM == 50) {
                                    Any any = this.data_;
                                    Any.b builder2 = any != null ? any.toBuilder() : null;
                                    Any anyW = eVar.w(Any.parser(), hVar2);
                                    this.data_ = anyW;
                                    if (builder2 != null) {
                                        builder2.mergeFrom(anyW);
                                        this.data_ = builder2.buildPartial();
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
                        synchronized (Msg.class) {
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

        @Override // com.p1.mobile.longlink.msg.liveConnector.liveAuthMessageNew.MsgOrBuilder
        public Any getData() {
            Any any = this.data_;
            return any == null ? Any.getDefaultInstance() : any;
        }

        @Override // com.p1.mobile.longlink.msg.liveConnector.liveAuthMessageNew.MsgOrBuilder
        public boolean getIsResponse() {
            return this.isResponse_;
        }

        @Override // com.p1.mobile.longlink.msg.liveConnector.liveAuthMessageNew.MsgOrBuilder
        public String getMsgId() {
            return this.msgId_;
        }

        @Override // com.p1.mobile.longlink.msg.liveConnector.liveAuthMessageNew.MsgOrBuilder
        public ByteString getMsgIdBytes() {
            return ByteString.copyFromUtf8(this.msgId_);
        }

        @Override // com.p1.mobile.longlink.msg.liveConnector.liveAuthMessageNew.MsgOrBuilder
        public String getMsgTypeName() {
            return this.msgTypeName_;
        }

        @Override // com.p1.mobile.longlink.msg.liveConnector.liveAuthMessageNew.MsgOrBuilder
        public ByteString getMsgTypeNameBytes() {
            return ByteString.copyFromUtf8(this.msgTypeName_);
        }

        public int getSerializedSize() {
            int i = ((GeneratedMessageLite) this).memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int i2 = this.version_;
            int iT = i2 != 0 ? CodedOutputStream.t(1, i2) : 0;
            if (!this.msgId_.isEmpty()) {
                iT += CodedOutputStream.K(2, getMsgId());
            }
            if (!this.msgTypeName_.isEmpty()) {
                iT += CodedOutputStream.K(3, getMsgTypeName());
            }
            boolean z = this.isResponse_;
            if (z) {
                iT += CodedOutputStream.f(4, z);
            }
            if (this.status_ != null) {
                iT += CodedOutputStream.C(5, getStatus());
            }
            if (this.data_ != null) {
                iT += CodedOutputStream.C(6, getData());
            }
            ((GeneratedMessageLite) this).memoizedSerializedSize = iT;
            return iT;
        }

        @Override // com.p1.mobile.longlink.msg.liveConnector.liveAuthMessageNew.MsgOrBuilder
        public Status getStatus() {
            Status status = this.status_;
            return status == null ? Status.getDefaultInstance() : status;
        }

        @Override // com.p1.mobile.longlink.msg.liveConnector.liveAuthMessageNew.MsgOrBuilder
        public int getVersion() {
            return this.version_;
        }

        @Override // com.p1.mobile.longlink.msg.liveConnector.liveAuthMessageNew.MsgOrBuilder
        public boolean hasData() {
            return this.data_ != null;
        }

        @Override // com.p1.mobile.longlink.msg.liveConnector.liveAuthMessageNew.MsgOrBuilder
        public boolean hasStatus() {
            return this.status_ != null;
        }

        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            int i = this.version_;
            if (i != 0) {
                codedOutputStream.s0(1, i);
            }
            if (!this.msgId_.isEmpty()) {
                codedOutputStream.D0(2, getMsgId());
            }
            if (!this.msgTypeName_.isEmpty()) {
                codedOutputStream.D0(3, getMsgTypeName());
            }
            boolean z = this.isResponse_;
            if (z) {
                codedOutputStream.a0(4, z);
            }
            if (this.status_ != null) {
                codedOutputStream.w0(5, getStatus());
            }
            if (this.data_ != null) {
                codedOutputStream.w0(6, getData());
            }
        }

        public static Msg parseDelimitedFrom(InputStream inputStream, h hVar) throws IOException {
            return (Msg) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, hVar);
        }

        public static Msg parseFrom(ByteString byteString, h hVar) throws InvalidProtocolBufferException {
            return (Msg) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, hVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setData(Any any) {
            any.getClass();
            this.data_ = any;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setStatus(Status status) {
            status.getClass();
            this.status_ = status;
        }

        public static final class Builder extends GeneratedMessageLite.b<Msg, Builder> implements MsgOrBuilder {
            private Builder() {
                super(Msg.DEFAULT_INSTANCE);
            }

            public Builder clearData() {
                copyOnWrite();
                ((Msg) ((GeneratedMessageLite.b) this).instance).clearData();
                return this;
            }

            public Builder clearIsResponse() {
                copyOnWrite();
                ((Msg) ((GeneratedMessageLite.b) this).instance).clearIsResponse();
                return this;
            }

            public Builder clearMsgId() {
                copyOnWrite();
                ((Msg) ((GeneratedMessageLite.b) this).instance).clearMsgId();
                return this;
            }

            public Builder clearMsgTypeName() {
                copyOnWrite();
                ((Msg) ((GeneratedMessageLite.b) this).instance).clearMsgTypeName();
                return this;
            }

            public Builder clearStatus() {
                copyOnWrite();
                ((Msg) ((GeneratedMessageLite.b) this).instance).clearStatus();
                return this;
            }

            public Builder clearVersion() {
                copyOnWrite();
                ((Msg) ((GeneratedMessageLite.b) this).instance).clearVersion();
                return this;
            }

            @Override // com.p1.mobile.longlink.msg.liveConnector.liveAuthMessageNew.MsgOrBuilder
            public Any getData() {
                return ((Msg) ((GeneratedMessageLite.b) this).instance).getData();
            }

            @Override // com.p1.mobile.longlink.msg.liveConnector.liveAuthMessageNew.MsgOrBuilder
            public boolean getIsResponse() {
                return ((Msg) ((GeneratedMessageLite.b) this).instance).getIsResponse();
            }

            @Override // com.p1.mobile.longlink.msg.liveConnector.liveAuthMessageNew.MsgOrBuilder
            public String getMsgId() {
                return ((Msg) ((GeneratedMessageLite.b) this).instance).getMsgId();
            }

            @Override // com.p1.mobile.longlink.msg.liveConnector.liveAuthMessageNew.MsgOrBuilder
            public ByteString getMsgIdBytes() {
                return ((Msg) ((GeneratedMessageLite.b) this).instance).getMsgIdBytes();
            }

            @Override // com.p1.mobile.longlink.msg.liveConnector.liveAuthMessageNew.MsgOrBuilder
            public String getMsgTypeName() {
                return ((Msg) ((GeneratedMessageLite.b) this).instance).getMsgTypeName();
            }

            @Override // com.p1.mobile.longlink.msg.liveConnector.liveAuthMessageNew.MsgOrBuilder
            public ByteString getMsgTypeNameBytes() {
                return ((Msg) ((GeneratedMessageLite.b) this).instance).getMsgTypeNameBytes();
            }

            @Override // com.p1.mobile.longlink.msg.liveConnector.liveAuthMessageNew.MsgOrBuilder
            public Status getStatus() {
                return ((Msg) ((GeneratedMessageLite.b) this).instance).getStatus();
            }

            @Override // com.p1.mobile.longlink.msg.liveConnector.liveAuthMessageNew.MsgOrBuilder
            public int getVersion() {
                return ((Msg) ((GeneratedMessageLite.b) this).instance).getVersion();
            }

            @Override // com.p1.mobile.longlink.msg.liveConnector.liveAuthMessageNew.MsgOrBuilder
            public boolean hasData() {
                return ((Msg) ((GeneratedMessageLite.b) this).instance).hasData();
            }

            @Override // com.p1.mobile.longlink.msg.liveConnector.liveAuthMessageNew.MsgOrBuilder
            public boolean hasStatus() {
                return ((Msg) ((GeneratedMessageLite.b) this).instance).hasStatus();
            }

            public Builder mergeData(Any any) {
                copyOnWrite();
                ((Msg) ((GeneratedMessageLite.b) this).instance).mergeData(any);
                return this;
            }

            public Builder mergeStatus(Status status) {
                copyOnWrite();
                ((Msg) ((GeneratedMessageLite.b) this).instance).mergeStatus(status);
                return this;
            }

            public Builder setData(Any any) {
                copyOnWrite();
                ((Msg) ((GeneratedMessageLite.b) this).instance).setData(any);
                return this;
            }

            public Builder setIsResponse(boolean z) {
                copyOnWrite();
                ((Msg) ((GeneratedMessageLite.b) this).instance).setIsResponse(z);
                return this;
            }

            public Builder setMsgId(String str) {
                copyOnWrite();
                ((Msg) ((GeneratedMessageLite.b) this).instance).setMsgId(str);
                return this;
            }

            public Builder setMsgIdBytes(ByteString byteString) {
                copyOnWrite();
                ((Msg) ((GeneratedMessageLite.b) this).instance).setMsgIdBytes(byteString);
                return this;
            }

            public Builder setMsgTypeName(String str) {
                copyOnWrite();
                ((Msg) ((GeneratedMessageLite.b) this).instance).setMsgTypeName(str);
                return this;
            }

            public Builder setMsgTypeNameBytes(ByteString byteString) {
                copyOnWrite();
                ((Msg) ((GeneratedMessageLite.b) this).instance).setMsgTypeNameBytes(byteString);
                return this;
            }

            public Builder setStatus(Status status) {
                copyOnWrite();
                ((Msg) ((GeneratedMessageLite.b) this).instance).setStatus(status);
                return this;
            }

            public Builder setVersion(int i) {
                copyOnWrite();
                ((Msg) ((GeneratedMessageLite.b) this).instance).setVersion(i);
                return this;
            }

            public Builder setData(Any.b bVar) {
                copyOnWrite();
                ((Msg) ((GeneratedMessageLite.b) this).instance).setData(bVar);
                return this;
            }

            public Builder setStatus(Status.Builder builder) {
                copyOnWrite();
                ((Msg) ((GeneratedMessageLite.b) this).instance).setStatus(builder);
                return this;
            }
        }

        public static Msg parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (Msg) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static Msg parseFrom(byte[] bArr, h hVar) throws InvalidProtocolBufferException {
            return (Msg) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, hVar);
        }

        public static Msg parseFrom(InputStream inputStream) throws IOException {
            return (Msg) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Msg parseFrom(InputStream inputStream, h hVar) throws IOException {
            return (Msg) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, hVar);
        }

        public static Msg parseFrom(e eVar) throws IOException {
            return (Msg) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, eVar);
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.toBuilder();
        }

        public static Msg parseFrom(e eVar, h hVar) throws IOException {
            return (Msg) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, eVar, hVar);
        }
    }

    public static final class Msgs extends GeneratedMessageLite<Msgs, Builder> implements MsgsOrBuilder {
        private static final Msgs DEFAULT_INSTANCE;
        public static final int MSGS_FIELD_NUMBER = 1;
        private static volatile i860<Msgs> PARSER;
        private l.h<Msg> msgs_ = GeneratedMessageLite.emptyProtobufList();

        static {
            Msgs msgs = new Msgs();
            DEFAULT_INSTANCE = msgs;
            msgs.makeImmutable();
        }

        private Msgs() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllMsgs(Iterable<? extends Msg> iterable) {
            ensureMsgsIsMutable();
            a.addAll(iterable, this.msgs_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addMsgs(Msg.Builder builder) {
            ensureMsgsIsMutable();
            this.msgs_.add((Msg) builder.build());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearMsgs() {
            this.msgs_ = GeneratedMessageLite.emptyProtobufList();
        }

        private void ensureMsgsIsMutable() {
            if (this.msgs_.q()) {
                return;
            }
            this.msgs_ = GeneratedMessageLite.mutableCopy(this.msgs_);
        }

        public static Msgs getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder(Msgs msgs) {
            return (Builder) ((Builder) DEFAULT_INSTANCE.toBuilder()).mergeFrom(msgs);
        }

        public static Msgs parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (Msgs) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Msgs parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (Msgs) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static i860<Msgs> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void removeMsgs(int i) {
            ensureMsgsIsMutable();
            this.msgs_.remove(i);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setMsgs(int i, Msg.Builder builder) {
            ensureMsgsIsMutable();
            this.msgs_.set(i, (Msg) builder.build());
        }

        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (C03411.f1649xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new Msgs();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                    this.msgs_.n();
                    return null;
                case 4:
                    return new Builder();
                case 5:
                    this.msgs_ = ((GeneratedMessageLite.h) obj).g(this.msgs_, ((Msgs) obj2).msgs_);
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
                                    if (!this.msgs_.q()) {
                                        this.msgs_ = GeneratedMessageLite.mutableCopy(this.msgs_);
                                    }
                                    this.msgs_.add(eVar.w(Msg.parser(), hVar));
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
                        synchronized (Msgs.class) {
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

        @Override // com.p1.mobile.longlink.msg.liveConnector.liveAuthMessageNew.MsgsOrBuilder
        public Msg getMsgs(int i) {
            return (Msg) this.msgs_.get(i);
        }

        @Override // com.p1.mobile.longlink.msg.liveConnector.liveAuthMessageNew.MsgsOrBuilder
        public int getMsgsCount() {
            return this.msgs_.size();
        }

        @Override // com.p1.mobile.longlink.msg.liveConnector.liveAuthMessageNew.MsgsOrBuilder
        public List<Msg> getMsgsList() {
            return this.msgs_;
        }

        public MsgOrBuilder getMsgsOrBuilder(int i) {
            return (MsgOrBuilder) this.msgs_.get(i);
        }

        public List<? extends MsgOrBuilder> getMsgsOrBuilderList() {
            return this.msgs_;
        }

        public int getSerializedSize() {
            int i = ((GeneratedMessageLite) this).memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int iC = 0;
            for (int i2 = 0; i2 < this.msgs_.size(); i2++) {
                iC += CodedOutputStream.C(1, (q) this.msgs_.get(i2));
            }
            ((GeneratedMessageLite) this).memoizedSerializedSize = iC;
            return iC;
        }

        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            for (int i = 0; i < this.msgs_.size(); i++) {
                codedOutputStream.w0(1, (q) this.msgs_.get(i));
            }
        }

        public static Msgs parseDelimitedFrom(InputStream inputStream, h hVar) throws IOException {
            return (Msgs) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, hVar);
        }

        public static Msgs parseFrom(ByteString byteString, h hVar) throws InvalidProtocolBufferException {
            return (Msgs) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, hVar);
        }

        public static final class Builder extends GeneratedMessageLite.b<Msgs, Builder> implements MsgsOrBuilder {
            private Builder() {
                super(Msgs.DEFAULT_INSTANCE);
            }

            public Builder addAllMsgs(Iterable<? extends Msg> iterable) {
                copyOnWrite();
                ((Msgs) ((GeneratedMessageLite.b) this).instance).addAllMsgs(iterable);
                return this;
            }

            public Builder addMsgs(Msg msg) {
                copyOnWrite();
                ((Msgs) ((GeneratedMessageLite.b) this).instance).addMsgs(msg);
                return this;
            }

            public Builder clearMsgs() {
                copyOnWrite();
                ((Msgs) ((GeneratedMessageLite.b) this).instance).clearMsgs();
                return this;
            }

            @Override // com.p1.mobile.longlink.msg.liveConnector.liveAuthMessageNew.MsgsOrBuilder
            public Msg getMsgs(int i) {
                return ((Msgs) ((GeneratedMessageLite.b) this).instance).getMsgs(i);
            }

            @Override // com.p1.mobile.longlink.msg.liveConnector.liveAuthMessageNew.MsgsOrBuilder
            public int getMsgsCount() {
                return ((Msgs) ((GeneratedMessageLite.b) this).instance).getMsgsCount();
            }

            @Override // com.p1.mobile.longlink.msg.liveConnector.liveAuthMessageNew.MsgsOrBuilder
            public List<Msg> getMsgsList() {
                return Collections.unmodifiableList(((Msgs) ((GeneratedMessageLite.b) this).instance).getMsgsList());
            }

            public Builder removeMsgs(int i) {
                copyOnWrite();
                ((Msgs) ((GeneratedMessageLite.b) this).instance).removeMsgs(i);
                return this;
            }

            public Builder setMsgs(int i, Msg msg) {
                copyOnWrite();
                ((Msgs) ((GeneratedMessageLite.b) this).instance).setMsgs(i, msg);
                return this;
            }

            public Builder addMsgs(int i, Msg msg) {
                copyOnWrite();
                ((Msgs) ((GeneratedMessageLite.b) this).instance).addMsgs(i, msg);
                return this;
            }

            public Builder setMsgs(int i, Msg.Builder builder) {
                copyOnWrite();
                ((Msgs) ((GeneratedMessageLite.b) this).instance).setMsgs(i, builder);
                return this;
            }

            public Builder addMsgs(Msg.Builder builder) {
                copyOnWrite();
                ((Msgs) ((GeneratedMessageLite.b) this).instance).addMsgs(builder);
                return this;
            }

            public Builder addMsgs(int i, Msg.Builder builder) {
                copyOnWrite();
                ((Msgs) ((GeneratedMessageLite.b) this).instance).addMsgs(i, builder);
                return this;
            }
        }

        public static Msgs parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (Msgs) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static Msgs parseFrom(byte[] bArr, h hVar) throws InvalidProtocolBufferException {
            return (Msgs) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, hVar);
        }

        public static Msgs parseFrom(InputStream inputStream) throws IOException {
            return (Msgs) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Msgs parseFrom(InputStream inputStream, h hVar) throws IOException {
            return (Msgs) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, hVar);
        }

        public static Msgs parseFrom(e eVar) throws IOException {
            return (Msgs) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addMsgs(int i, Msg msg) {
            msg.getClass();
            ensureMsgsIsMutable();
            this.msgs_.add(i, msg);
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.toBuilder();
        }

        public static Msgs parseFrom(e eVar, h hVar) throws IOException {
            return (Msgs) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, eVar, hVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setMsgs(int i, Msg msg) {
            msg.getClass();
            ensureMsgsIsMutable();
            this.msgs_.set(i, msg);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addMsgs(Msg msg) {
            msg.getClass();
            ensureMsgsIsMutable();
            this.msgs_.add(msg);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addMsgs(int i, Msg.Builder builder) {
            ensureMsgsIsMutable();
            this.msgs_.add(i, (Msg) builder.build());
        }
    }

    public static final class MultiDevice extends GeneratedMessageLite<MultiDevice, Builder> implements MultiDeviceOrBuilder {
        private static final MultiDevice DEFAULT_INSTANCE;
        public static final int MSG_FIELD_NUMBER = 1;
        private static volatile i860<MultiDevice> PARSER;
        private ByteString msg_ = ByteString.EMPTY;

        public static final class Builder extends GeneratedMessageLite.b<MultiDevice, Builder> implements MultiDeviceOrBuilder {
            private Builder() {
                super(MultiDevice.DEFAULT_INSTANCE);
            }

            public Builder clearMsg() {
                copyOnWrite();
                ((MultiDevice) ((GeneratedMessageLite.b) this).instance).clearMsg();
                return this;
            }

            @Override // com.p1.mobile.longlink.msg.liveConnector.liveAuthMessageNew.MultiDeviceOrBuilder
            public ByteString getMsg() {
                return ((MultiDevice) ((GeneratedMessageLite.b) this).instance).getMsg();
            }

            public Builder setMsg(ByteString byteString) {
                copyOnWrite();
                ((MultiDevice) ((GeneratedMessageLite.b) this).instance).setMsg(byteString);
                return this;
            }
        }

        static {
            MultiDevice multiDevice = new MultiDevice();
            DEFAULT_INSTANCE = multiDevice;
            multiDevice.makeImmutable();
        }

        private MultiDevice() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearMsg() {
            this.msg_ = getDefaultInstance().getMsg();
        }

        public static MultiDevice getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder(MultiDevice multiDevice) {
            return (Builder) ((Builder) DEFAULT_INSTANCE.toBuilder()).mergeFrom(multiDevice);
        }

        public static MultiDevice parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (MultiDevice) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static MultiDevice parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (MultiDevice) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static i860<MultiDevice> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setMsg(ByteString byteString) {
            byteString.getClass();
            this.msg_ = byteString;
        }

        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            boolean z = false;
            switch (C03411.f1649xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new MultiDevice();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                    return null;
                case 4:
                    return new Builder();
                case 5:
                    GeneratedMessageLite.h hVar = (GeneratedMessageLite.h) obj;
                    MultiDevice multiDevice = (MultiDevice) obj2;
                    ByteString byteString = this.msg_;
                    ByteString byteString2 = ByteString.EMPTY;
                    boolean z2 = byteString != byteString2;
                    ByteString byteString3 = multiDevice.msg_;
                    this.msg_ = hVar.h(z2, byteString, byteString3 != byteString2, byteString3);
                    GeneratedMessageLite.g gVar = GeneratedMessageLite.g.INSTANCE;
                    return this;
                case 6:
                    e eVar = (e) obj;
                    while (!z) {
                        try {
                            int iM = eVar.M();
                            if (iM != 0) {
                                if (iM == 10) {
                                    this.msg_ = eVar.n();
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
                        synchronized (MultiDevice.class) {
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

        @Override // com.p1.mobile.longlink.msg.liveConnector.liveAuthMessageNew.MultiDeviceOrBuilder
        public ByteString getMsg() {
            return this.msg_;
        }

        public int getSerializedSize() {
            int i = ((GeneratedMessageLite) this).memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int i2 = !this.msg_.isEmpty() ? CodedOutputStream.i(1, this.msg_) : 0;
            ((GeneratedMessageLite) this).memoizedSerializedSize = i2;
            return i2;
        }

        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (this.msg_.isEmpty()) {
                return;
            }
            codedOutputStream.e0(1, this.msg_);
        }

        public static MultiDevice parseDelimitedFrom(InputStream inputStream, h hVar) throws IOException {
            return (MultiDevice) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, hVar);
        }

        public static MultiDevice parseFrom(ByteString byteString, h hVar) throws InvalidProtocolBufferException {
            return (MultiDevice) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, hVar);
        }

        public static MultiDevice parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (MultiDevice) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static MultiDevice parseFrom(byte[] bArr, h hVar) throws InvalidProtocolBufferException {
            return (MultiDevice) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, hVar);
        }

        public static MultiDevice parseFrom(InputStream inputStream) throws IOException {
            return (MultiDevice) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static MultiDevice parseFrom(InputStream inputStream, h hVar) throws IOException {
            return (MultiDevice) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, hVar);
        }

        public static MultiDevice parseFrom(e eVar) throws IOException {
            return (MultiDevice) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, eVar);
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.toBuilder();
        }

        public static MultiDevice parseFrom(e eVar, h hVar) throws IOException {
            return (MultiDevice) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, eVar, hVar);
        }
    }

    public static final class Status extends GeneratedMessageLite<Status, Builder> implements StatusOrBuilder {
        private static final Status DEFAULT_INSTANCE;
        public static final int NEEDACK_FIELD_NUMBER = 3;
        private static volatile i860<Status> PARSER = null;
        public static final int RECVTS_FIELD_NUMBER = 1;
        public static final int STATUS_FIELD_NUMBER = 2;
        private boolean needAck_;
        private long recvTs_;
        private int status_;

        public static final class Builder extends GeneratedMessageLite.b<Status, Builder> implements StatusOrBuilder {
            private Builder() {
                super(Status.DEFAULT_INSTANCE);
            }

            public Builder clearNeedAck() {
                copyOnWrite();
                ((Status) ((GeneratedMessageLite.b) this).instance).clearNeedAck();
                return this;
            }

            public Builder clearRecvTs() {
                copyOnWrite();
                ((Status) ((GeneratedMessageLite.b) this).instance).clearRecvTs();
                return this;
            }

            public Builder clearStatus() {
                copyOnWrite();
                ((Status) ((GeneratedMessageLite.b) this).instance).clearStatus();
                return this;
            }

            @Override // com.p1.mobile.longlink.msg.liveConnector.liveAuthMessageNew.StatusOrBuilder
            public boolean getNeedAck() {
                return ((Status) ((GeneratedMessageLite.b) this).instance).getNeedAck();
            }

            @Override // com.p1.mobile.longlink.msg.liveConnector.liveAuthMessageNew.StatusOrBuilder
            public long getRecvTs() {
                return ((Status) ((GeneratedMessageLite.b) this).instance).getRecvTs();
            }

            @Override // com.p1.mobile.longlink.msg.liveConnector.liveAuthMessageNew.StatusOrBuilder
            public int getStatus() {
                return ((Status) ((GeneratedMessageLite.b) this).instance).getStatus();
            }

            public Builder setNeedAck(boolean z) {
                copyOnWrite();
                ((Status) ((GeneratedMessageLite.b) this).instance).setNeedAck(z);
                return this;
            }

            public Builder setRecvTs(long j) {
                copyOnWrite();
                ((Status) ((GeneratedMessageLite.b) this).instance).setRecvTs(j);
                return this;
            }

            public Builder setStatus(int i) {
                copyOnWrite();
                ((Status) ((GeneratedMessageLite.b) this).instance).setStatus(i);
                return this;
            }
        }

        static {
            Status status = new Status();
            DEFAULT_INSTANCE = status;
            status.makeImmutable();
        }

        private Status() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearNeedAck() {
            this.needAck_ = false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearRecvTs() {
            this.recvTs_ = 0L;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearStatus() {
            this.status_ = 0;
        }

        public static Status getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder(Status status) {
            return (Builder) ((Builder) DEFAULT_INSTANCE.toBuilder()).mergeFrom(status);
        }

        public static Status parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (Status) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Status parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (Status) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static i860<Status> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setNeedAck(boolean z) {
            this.needAck_ = z;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setRecvTs(long j) {
            this.recvTs_ = j;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setStatus(int i) {
            this.status_ = i;
        }

        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            boolean z = false;
            switch (C03411.f1649xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new Status();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                    return null;
                case 4:
                    return new Builder();
                case 5:
                    GeneratedMessageLite.h hVar = (GeneratedMessageLite.h) obj;
                    Status status = (Status) obj2;
                    long j = this.recvTs_;
                    boolean z2 = j != 0;
                    long j2 = status.recvTs_;
                    this.recvTs_ = hVar.i(z2, j, j2 != 0, j2);
                    int i = this.status_;
                    boolean z3 = i != 0;
                    int i2 = status.status_;
                    this.status_ = hVar.e(z3, i, i2 != 0, i2);
                    boolean z4 = this.needAck_;
                    boolean z5 = status.needAck_;
                    this.needAck_ = hVar.d(z4, z4, z5, z5);
                    GeneratedMessageLite.g gVar = GeneratedMessageLite.g.INSTANCE;
                    return this;
                case 6:
                    e eVar = (e) obj;
                    while (!z) {
                        try {
                            int iM = eVar.M();
                            if (iM != 0) {
                                if (iM == 8) {
                                    this.recvTs_ = eVar.v();
                                } else if (iM == 16) {
                                    this.status_ = eVar.u();
                                } else if (iM == 24) {
                                    this.needAck_ = eVar.m();
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
                        synchronized (Status.class) {
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

        @Override // com.p1.mobile.longlink.msg.liveConnector.liveAuthMessageNew.StatusOrBuilder
        public boolean getNeedAck() {
            return this.needAck_;
        }

        @Override // com.p1.mobile.longlink.msg.liveConnector.liveAuthMessageNew.StatusOrBuilder
        public long getRecvTs() {
            return this.recvTs_;
        }

        public int getSerializedSize() {
            int i = ((GeneratedMessageLite) this).memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            long j = this.recvTs_;
            int iV = j != 0 ? CodedOutputStream.v(1, j) : 0;
            int i2 = this.status_;
            if (i2 != 0) {
                iV += CodedOutputStream.t(2, i2);
            }
            boolean z = this.needAck_;
            if (z) {
                iV += CodedOutputStream.f(3, z);
            }
            ((GeneratedMessageLite) this).memoizedSerializedSize = iV;
            return iV;
        }

        @Override // com.p1.mobile.longlink.msg.liveConnector.liveAuthMessageNew.StatusOrBuilder
        public int getStatus() {
            return this.status_;
        }

        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            long j = this.recvTs_;
            if (j != 0) {
                codedOutputStream.u0(1, j);
            }
            int i = this.status_;
            if (i != 0) {
                codedOutputStream.s0(2, i);
            }
            boolean z = this.needAck_;
            if (z) {
                codedOutputStream.a0(3, z);
            }
        }

        public static Status parseDelimitedFrom(InputStream inputStream, h hVar) throws IOException {
            return (Status) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, hVar);
        }

        public static Status parseFrom(ByteString byteString, h hVar) throws InvalidProtocolBufferException {
            return (Status) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, hVar);
        }

        public static Status parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (Status) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static Status parseFrom(byte[] bArr, h hVar) throws InvalidProtocolBufferException {
            return (Status) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, hVar);
        }

        public static Status parseFrom(InputStream inputStream) throws IOException {
            return (Status) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Status parseFrom(InputStream inputStream, h hVar) throws IOException {
            return (Status) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, hVar);
        }

        public static Status parseFrom(e eVar) throws IOException {
            return (Status) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, eVar);
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.toBuilder();
        }

        public static Status parseFrom(e eVar, h hVar) throws IOException {
            return (Status) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, eVar, hVar);
        }
    }

    public static final class SwitchSide extends GeneratedMessageLite<SwitchSide, Builder> implements SwitchSideOrBuilder {
        private static final SwitchSide DEFAULT_INSTANCE;
        private static volatile i860<SwitchSide> PARSER = null;
        public static final int TOSIDE_FIELD_NUMBER = 1;
        private int toSide_;

        public static final class Builder extends GeneratedMessageLite.b<SwitchSide, Builder> implements SwitchSideOrBuilder {
            private Builder() {
                super(SwitchSide.DEFAULT_INSTANCE);
            }

            public Builder clearToSide() {
                copyOnWrite();
                ((SwitchSide) ((GeneratedMessageLite.b) this).instance).clearToSide();
                return this;
            }

            @Override // com.p1.mobile.longlink.msg.liveConnector.liveAuthMessageNew.SwitchSideOrBuilder
            public AppStaySideEnum getToSide() {
                return ((SwitchSide) ((GeneratedMessageLite.b) this).instance).getToSide();
            }

            @Override // com.p1.mobile.longlink.msg.liveConnector.liveAuthMessageNew.SwitchSideOrBuilder
            public int getToSideValue() {
                return ((SwitchSide) ((GeneratedMessageLite.b) this).instance).getToSideValue();
            }

            public Builder setToSide(AppStaySideEnum appStaySideEnum) {
                copyOnWrite();
                ((SwitchSide) ((GeneratedMessageLite.b) this).instance).setToSide(appStaySideEnum);
                return this;
            }

            public Builder setToSideValue(int i) {
                copyOnWrite();
                ((SwitchSide) ((GeneratedMessageLite.b) this).instance).setToSideValue(i);
                return this;
            }
        }

        static {
            SwitchSide switchSide = new SwitchSide();
            DEFAULT_INSTANCE = switchSide;
            switchSide.makeImmutable();
        }

        private SwitchSide() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearToSide() {
            this.toSide_ = 0;
        }

        public static SwitchSide getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder(SwitchSide switchSide) {
            return (Builder) ((Builder) DEFAULT_INSTANCE.toBuilder()).mergeFrom(switchSide);
        }

        public static SwitchSide parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (SwitchSide) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static SwitchSide parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (SwitchSide) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static i860<SwitchSide> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setToSide(AppStaySideEnum appStaySideEnum) {
            appStaySideEnum.getClass();
            this.toSide_ = appStaySideEnum.getNumber();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setToSideValue(int i) {
            this.toSide_ = i;
        }

        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            boolean z = false;
            switch (C03411.f1649xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new SwitchSide();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                    return null;
                case 4:
                    return new Builder();
                case 5:
                    GeneratedMessageLite.h hVar = (GeneratedMessageLite.h) obj;
                    SwitchSide switchSide = (SwitchSide) obj2;
                    int i = this.toSide_;
                    boolean z2 = i != 0;
                    int i2 = switchSide.toSide_;
                    this.toSide_ = hVar.e(z2, i, i2 != 0, i2);
                    GeneratedMessageLite.g gVar = GeneratedMessageLite.g.INSTANCE;
                    return this;
                case 6:
                    e eVar = (e) obj;
                    while (!z) {
                        try {
                            int iM = eVar.M();
                            if (iM != 0) {
                                if (iM == 8) {
                                    this.toSide_ = eVar.p();
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
                        synchronized (SwitchSide.class) {
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
            int iM = this.toSide_ != AppStaySideEnum.APP_STAY_SIDE_FOREGROUND.getNumber() ? CodedOutputStream.m(1, this.toSide_) : 0;
            ((GeneratedMessageLite) this).memoizedSerializedSize = iM;
            return iM;
        }

        @Override // com.p1.mobile.longlink.msg.liveConnector.liveAuthMessageNew.SwitchSideOrBuilder
        public AppStaySideEnum getToSide() {
            AppStaySideEnum appStaySideEnumForNumber = AppStaySideEnum.forNumber(this.toSide_);
            return appStaySideEnumForNumber == null ? AppStaySideEnum.UNRECOGNIZED : appStaySideEnumForNumber;
        }

        @Override // com.p1.mobile.longlink.msg.liveConnector.liveAuthMessageNew.SwitchSideOrBuilder
        public int getToSideValue() {
            return this.toSide_;
        }

        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (this.toSide_ != AppStaySideEnum.APP_STAY_SIDE_FOREGROUND.getNumber()) {
                codedOutputStream.i0(1, this.toSide_);
            }
        }

        public static SwitchSide parseDelimitedFrom(InputStream inputStream, h hVar) throws IOException {
            return (SwitchSide) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, hVar);
        }

        public static SwitchSide parseFrom(ByteString byteString, h hVar) throws InvalidProtocolBufferException {
            return (SwitchSide) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, hVar);
        }

        public static SwitchSide parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (SwitchSide) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static SwitchSide parseFrom(byte[] bArr, h hVar) throws InvalidProtocolBufferException {
            return (SwitchSide) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, hVar);
        }

        public static SwitchSide parseFrom(InputStream inputStream) throws IOException {
            return (SwitchSide) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static SwitchSide parseFrom(InputStream inputStream, h hVar) throws IOException {
            return (SwitchSide) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, hVar);
        }

        public static SwitchSide parseFrom(e eVar) throws IOException {
            return (SwitchSide) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, eVar);
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.toBuilder();
        }

        public static SwitchSide parseFrom(e eVar, h hVar) throws IOException {
            return (SwitchSide) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, eVar, hVar);
        }
    }

    public static final class UserAgent extends GeneratedMessageLite<UserAgent, Builder> implements UserAgentOrBuilder {
        public static final int APPVERSION_FIELD_NUMBER = 2;
        public static final int BRAND_FIELD_NUMBER = 4;
        private static final UserAgent DEFAULT_INSTANCE;
        public static final int MODEL_FIELD_NUMBER = 5;
        private static volatile i860<UserAgent> PARSER = null;
        public static final int SOURCEVERSION_FIELD_NUMBER = 3;
        public static final int SOURCE_FIELD_NUMBER = 1;
        private int source_;
        private String appVersion_ = "";
        private String sourceVersion_ = "";
        private String brand_ = "";
        private String model_ = "";

        public static final class Builder extends GeneratedMessageLite.b<UserAgent, Builder> implements UserAgentOrBuilder {
            private Builder() {
                super(UserAgent.DEFAULT_INSTANCE);
            }

            public Builder clearAppVersion() {
                copyOnWrite();
                ((UserAgent) ((GeneratedMessageLite.b) this).instance).clearAppVersion();
                return this;
            }

            public Builder clearBrand() {
                copyOnWrite();
                ((UserAgent) ((GeneratedMessageLite.b) this).instance).clearBrand();
                return this;
            }

            public Builder clearModel() {
                copyOnWrite();
                ((UserAgent) ((GeneratedMessageLite.b) this).instance).clearModel();
                return this;
            }

            public Builder clearSource() {
                copyOnWrite();
                ((UserAgent) ((GeneratedMessageLite.b) this).instance).clearSource();
                return this;
            }

            public Builder clearSourceVersion() {
                copyOnWrite();
                ((UserAgent) ((GeneratedMessageLite.b) this).instance).clearSourceVersion();
                return this;
            }

            @Override // com.p1.mobile.longlink.msg.liveConnector.liveAuthMessageNew.UserAgentOrBuilder
            public String getAppVersion() {
                return ((UserAgent) ((GeneratedMessageLite.b) this).instance).getAppVersion();
            }

            @Override // com.p1.mobile.longlink.msg.liveConnector.liveAuthMessageNew.UserAgentOrBuilder
            public ByteString getAppVersionBytes() {
                return ((UserAgent) ((GeneratedMessageLite.b) this).instance).getAppVersionBytes();
            }

            @Override // com.p1.mobile.longlink.msg.liveConnector.liveAuthMessageNew.UserAgentOrBuilder
            public String getBrand() {
                return ((UserAgent) ((GeneratedMessageLite.b) this).instance).getBrand();
            }

            @Override // com.p1.mobile.longlink.msg.liveConnector.liveAuthMessageNew.UserAgentOrBuilder
            public ByteString getBrandBytes() {
                return ((UserAgent) ((GeneratedMessageLite.b) this).instance).getBrandBytes();
            }

            @Override // com.p1.mobile.longlink.msg.liveConnector.liveAuthMessageNew.UserAgentOrBuilder
            public String getModel() {
                return ((UserAgent) ((GeneratedMessageLite.b) this).instance).getModel();
            }

            @Override // com.p1.mobile.longlink.msg.liveConnector.liveAuthMessageNew.UserAgentOrBuilder
            public ByteString getModelBytes() {
                return ((UserAgent) ((GeneratedMessageLite.b) this).instance).getModelBytes();
            }

            @Override // com.p1.mobile.longlink.msg.liveConnector.liveAuthMessageNew.UserAgentOrBuilder
            public ClientSourceEnum getSource() {
                return ((UserAgent) ((GeneratedMessageLite.b) this).instance).getSource();
            }

            @Override // com.p1.mobile.longlink.msg.liveConnector.liveAuthMessageNew.UserAgentOrBuilder
            public int getSourceValue() {
                return ((UserAgent) ((GeneratedMessageLite.b) this).instance).getSourceValue();
            }

            @Override // com.p1.mobile.longlink.msg.liveConnector.liveAuthMessageNew.UserAgentOrBuilder
            public String getSourceVersion() {
                return ((UserAgent) ((GeneratedMessageLite.b) this).instance).getSourceVersion();
            }

            @Override // com.p1.mobile.longlink.msg.liveConnector.liveAuthMessageNew.UserAgentOrBuilder
            public ByteString getSourceVersionBytes() {
                return ((UserAgent) ((GeneratedMessageLite.b) this).instance).getSourceVersionBytes();
            }

            public Builder setAppVersion(String str) {
                copyOnWrite();
                ((UserAgent) ((GeneratedMessageLite.b) this).instance).setAppVersion(str);
                return this;
            }

            public Builder setAppVersionBytes(ByteString byteString) {
                copyOnWrite();
                ((UserAgent) ((GeneratedMessageLite.b) this).instance).setAppVersionBytes(byteString);
                return this;
            }

            public Builder setBrand(String str) {
                copyOnWrite();
                ((UserAgent) ((GeneratedMessageLite.b) this).instance).setBrand(str);
                return this;
            }

            public Builder setBrandBytes(ByteString byteString) {
                copyOnWrite();
                ((UserAgent) ((GeneratedMessageLite.b) this).instance).setBrandBytes(byteString);
                return this;
            }

            public Builder setModel(String str) {
                copyOnWrite();
                ((UserAgent) ((GeneratedMessageLite.b) this).instance).setModel(str);
                return this;
            }

            public Builder setModelBytes(ByteString byteString) {
                copyOnWrite();
                ((UserAgent) ((GeneratedMessageLite.b) this).instance).setModelBytes(byteString);
                return this;
            }

            public Builder setSource(ClientSourceEnum clientSourceEnum) {
                copyOnWrite();
                ((UserAgent) ((GeneratedMessageLite.b) this).instance).setSource(clientSourceEnum);
                return this;
            }

            public Builder setSourceValue(int i) {
                copyOnWrite();
                ((UserAgent) ((GeneratedMessageLite.b) this).instance).setSourceValue(i);
                return this;
            }

            public Builder setSourceVersion(String str) {
                copyOnWrite();
                ((UserAgent) ((GeneratedMessageLite.b) this).instance).setSourceVersion(str);
                return this;
            }

            public Builder setSourceVersionBytes(ByteString byteString) {
                copyOnWrite();
                ((UserAgent) ((GeneratedMessageLite.b) this).instance).setSourceVersionBytes(byteString);
                return this;
            }
        }

        static {
            UserAgent userAgent = new UserAgent();
            DEFAULT_INSTANCE = userAgent;
            userAgent.makeImmutable();
        }

        private UserAgent() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAppVersion() {
            this.appVersion_ = getDefaultInstance().getAppVersion();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearBrand() {
            this.brand_ = getDefaultInstance().getBrand();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearModel() {
            this.model_ = getDefaultInstance().getModel();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearSource() {
            this.source_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearSourceVersion() {
            this.sourceVersion_ = getDefaultInstance().getSourceVersion();
        }

        public static UserAgent getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder(UserAgent userAgent) {
            return (Builder) ((Builder) DEFAULT_INSTANCE.toBuilder()).mergeFrom(userAgent);
        }

        public static UserAgent parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (UserAgent) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static UserAgent parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (UserAgent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static i860<UserAgent> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAppVersion(String str) {
            str.getClass();
            this.appVersion_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAppVersionBytes(ByteString byteString) {
            byteString.getClass();
            a.checkByteStringIsUtf8(byteString);
            this.appVersion_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setBrand(String str) {
            str.getClass();
            this.brand_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setBrandBytes(ByteString byteString) {
            byteString.getClass();
            a.checkByteStringIsUtf8(byteString);
            this.brand_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setModel(String str) {
            str.getClass();
            this.model_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setModelBytes(ByteString byteString) {
            byteString.getClass();
            a.checkByteStringIsUtf8(byteString);
            this.model_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSource(ClientSourceEnum clientSourceEnum) {
            clientSourceEnum.getClass();
            this.source_ = clientSourceEnum.getNumber();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSourceValue(int i) {
            this.source_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSourceVersion(String str) {
            str.getClass();
            this.sourceVersion_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSourceVersionBytes(ByteString byteString) {
            byteString.getClass();
            a.checkByteStringIsUtf8(byteString);
            this.sourceVersion_ = byteString.toStringUtf8();
        }

        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            boolean z = false;
            switch (C03411.f1649xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new UserAgent();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                    return null;
                case 4:
                    return new Builder();
                case 5:
                    GeneratedMessageLite.h hVar = (GeneratedMessageLite.h) obj;
                    UserAgent userAgent = (UserAgent) obj2;
                    int i = this.source_;
                    boolean z2 = i != 0;
                    int i2 = userAgent.source_;
                    this.source_ = hVar.e(z2, i, i2 != 0, i2);
                    this.appVersion_ = hVar.f(!this.appVersion_.isEmpty(), this.appVersion_, !userAgent.appVersion_.isEmpty(), userAgent.appVersion_);
                    this.sourceVersion_ = hVar.f(!this.sourceVersion_.isEmpty(), this.sourceVersion_, !userAgent.sourceVersion_.isEmpty(), userAgent.sourceVersion_);
                    this.brand_ = hVar.f(!this.brand_.isEmpty(), this.brand_, !userAgent.brand_.isEmpty(), userAgent.brand_);
                    this.model_ = hVar.f(!this.model_.isEmpty(), this.model_, !userAgent.model_.isEmpty(), userAgent.model_);
                    GeneratedMessageLite.g gVar = GeneratedMessageLite.g.INSTANCE;
                    return this;
                case 6:
                    e eVar = (e) obj;
                    while (!z) {
                        try {
                            int iM = eVar.M();
                            if (iM != 0) {
                                if (iM == 8) {
                                    this.source_ = eVar.p();
                                } else if (iM == 18) {
                                    this.appVersion_ = eVar.L();
                                } else if (iM == 26) {
                                    this.sourceVersion_ = eVar.L();
                                } else if (iM == 34) {
                                    this.brand_ = eVar.L();
                                } else if (iM == 42) {
                                    this.model_ = eVar.L();
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
                        synchronized (UserAgent.class) {
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

        @Override // com.p1.mobile.longlink.msg.liveConnector.liveAuthMessageNew.UserAgentOrBuilder
        public String getAppVersion() {
            return this.appVersion_;
        }

        @Override // com.p1.mobile.longlink.msg.liveConnector.liveAuthMessageNew.UserAgentOrBuilder
        public ByteString getAppVersionBytes() {
            return ByteString.copyFromUtf8(this.appVersion_);
        }

        @Override // com.p1.mobile.longlink.msg.liveConnector.liveAuthMessageNew.UserAgentOrBuilder
        public String getBrand() {
            return this.brand_;
        }

        @Override // com.p1.mobile.longlink.msg.liveConnector.liveAuthMessageNew.UserAgentOrBuilder
        public ByteString getBrandBytes() {
            return ByteString.copyFromUtf8(this.brand_);
        }

        @Override // com.p1.mobile.longlink.msg.liveConnector.liveAuthMessageNew.UserAgentOrBuilder
        public String getModel() {
            return this.model_;
        }

        @Override // com.p1.mobile.longlink.msg.liveConnector.liveAuthMessageNew.UserAgentOrBuilder
        public ByteString getModelBytes() {
            return ByteString.copyFromUtf8(this.model_);
        }

        public int getSerializedSize() {
            int i = ((GeneratedMessageLite) this).memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int iM = this.source_ != ClientSourceEnum.CLIENT_SOURCE_ANDROID.getNumber() ? CodedOutputStream.m(1, this.source_) : 0;
            if (!this.appVersion_.isEmpty()) {
                iM += CodedOutputStream.K(2, getAppVersion());
            }
            if (!this.sourceVersion_.isEmpty()) {
                iM += CodedOutputStream.K(3, getSourceVersion());
            }
            if (!this.brand_.isEmpty()) {
                iM += CodedOutputStream.K(4, getBrand());
            }
            if (!this.model_.isEmpty()) {
                iM += CodedOutputStream.K(5, getModel());
            }
            ((GeneratedMessageLite) this).memoizedSerializedSize = iM;
            return iM;
        }

        @Override // com.p1.mobile.longlink.msg.liveConnector.liveAuthMessageNew.UserAgentOrBuilder
        public ClientSourceEnum getSource() {
            ClientSourceEnum clientSourceEnumForNumber = ClientSourceEnum.forNumber(this.source_);
            return clientSourceEnumForNumber == null ? ClientSourceEnum.UNRECOGNIZED : clientSourceEnumForNumber;
        }

        @Override // com.p1.mobile.longlink.msg.liveConnector.liveAuthMessageNew.UserAgentOrBuilder
        public int getSourceValue() {
            return this.source_;
        }

        @Override // com.p1.mobile.longlink.msg.liveConnector.liveAuthMessageNew.UserAgentOrBuilder
        public String getSourceVersion() {
            return this.sourceVersion_;
        }

        @Override // com.p1.mobile.longlink.msg.liveConnector.liveAuthMessageNew.UserAgentOrBuilder
        public ByteString getSourceVersionBytes() {
            return ByteString.copyFromUtf8(this.sourceVersion_);
        }

        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (this.source_ != ClientSourceEnum.CLIENT_SOURCE_ANDROID.getNumber()) {
                codedOutputStream.i0(1, this.source_);
            }
            if (!this.appVersion_.isEmpty()) {
                codedOutputStream.D0(2, getAppVersion());
            }
            if (!this.sourceVersion_.isEmpty()) {
                codedOutputStream.D0(3, getSourceVersion());
            }
            if (!this.brand_.isEmpty()) {
                codedOutputStream.D0(4, getBrand());
            }
            if (this.model_.isEmpty()) {
                return;
            }
            codedOutputStream.D0(5, getModel());
        }

        public static UserAgent parseDelimitedFrom(InputStream inputStream, h hVar) throws IOException {
            return (UserAgent) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, hVar);
        }

        public static UserAgent parseFrom(ByteString byteString, h hVar) throws InvalidProtocolBufferException {
            return (UserAgent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, hVar);
        }

        public static UserAgent parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (UserAgent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static UserAgent parseFrom(byte[] bArr, h hVar) throws InvalidProtocolBufferException {
            return (UserAgent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, hVar);
        }

        public static UserAgent parseFrom(InputStream inputStream) throws IOException {
            return (UserAgent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static UserAgent parseFrom(InputStream inputStream, h hVar) throws IOException {
            return (UserAgent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, hVar);
        }

        public static UserAgent parseFrom(e eVar) throws IOException {
            return (UserAgent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, eVar);
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.toBuilder();
        }

        public static UserAgent parseFrom(e eVar, h hVar) throws IOException {
            return (UserAgent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, eVar, hVar);
        }
    }
}
