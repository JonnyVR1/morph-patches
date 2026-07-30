package com.p046p1.mobile.longlink.msg.liveConnector;

import com.google.protobuf.AbstractC3403a;
import com.google.protobuf.Any;
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
public final class liveAuthMessageNew {

    /* JADX INFO: renamed from: com.p1.mobile.longlink.msg.liveConnector.liveAuthMessageNew$1 */
    public static /* synthetic */ class C44291 {

        /* JADX INFO: renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f15950xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f15950xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f15950xa1df5c61[GeneratedMessageLite.MethodToInvoke.IS_INITIALIZED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f15950xa1df5c61[GeneratedMessageLite.MethodToInvoke.MAKE_IMMUTABLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f15950xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f15950xa1df5c61[GeneratedMessageLite.MethodToInvoke.VISIT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f15950xa1df5c61[GeneratedMessageLite.MethodToInvoke.MERGE_FROM_STREAM.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f15950xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f15950xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    public interface AckOrBuilder extends o6z {
        @Override // p149l.o6z
        /* synthetic */ InterfaceC3419q getDefaultInstanceForType();

        String getMsgId();

        ByteString getMsgIdBytes();

        String getMsgTypeName();

        ByteString getMsgTypeNameBytes();

        long getRecvTimestamp();

        @Override // p149l.o6z
        /* synthetic */ boolean isInitialized();
    }

    public interface AuthKeyOrBuilder extends o6z {
        @Override // p149l.o6z
        /* synthetic */ InterfaceC3419q getDefaultInstanceForType();

        String getRoomKey();

        ByteString getRoomKeyBytes();

        @Override // p149l.o6z
        /* synthetic */ boolean isInitialized();
    }

    public interface AuthOrBuilder extends o6z {
        long getCurrentStartLinkTime();

        long getCurrentTime();

        @Override // p149l.o6z
        /* synthetic */ InterfaceC3419q getDefaultInstanceForType();

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

        @Override // p149l.o6z
        /* synthetic */ boolean isInitialized();
    }

    public interface ChatReadedOrBuilder extends o6z {
        @Override // p149l.o6z
        /* synthetic */ InterfaceC3419q getDefaultInstanceForType();

        long getSeq();

        @Override // p149l.o6z
        /* synthetic */ boolean isInitialized();
    }

    public interface LocationOrBuilder extends o6z {
        @Override // p149l.o6z
        /* synthetic */ InterfaceC3419q getDefaultInstanceForType();

        float getLat();

        float getLon();

        @Override // p149l.o6z
        /* synthetic */ boolean isInitialized();
    }

    public interface MsgOrBuilder extends o6z {
        Any getData();

        @Override // p149l.o6z
        /* synthetic */ InterfaceC3419q getDefaultInstanceForType();

        boolean getIsResponse();

        String getMsgId();

        ByteString getMsgIdBytes();

        String getMsgTypeName();

        ByteString getMsgTypeNameBytes();

        Status getStatus();

        int getVersion();

        boolean hasData();

        boolean hasStatus();

        @Override // p149l.o6z
        /* synthetic */ boolean isInitialized();
    }

    public interface MsgsOrBuilder extends o6z {
        @Override // p149l.o6z
        /* synthetic */ InterfaceC3419q getDefaultInstanceForType();

        Msg getMsgs(int i);

        int getMsgsCount();

        List<Msg> getMsgsList();

        @Override // p149l.o6z
        /* synthetic */ boolean isInitialized();
    }

    public interface MultiDeviceOrBuilder extends o6z {
        @Override // p149l.o6z
        /* synthetic */ InterfaceC3419q getDefaultInstanceForType();

        ByteString getMsg();

        @Override // p149l.o6z
        /* synthetic */ boolean isInitialized();
    }

    public interface StatusOrBuilder extends o6z {
        @Override // p149l.o6z
        /* synthetic */ InterfaceC3419q getDefaultInstanceForType();

        boolean getNeedAck();

        long getRecvTs();

        int getStatus();

        @Override // p149l.o6z
        /* synthetic */ boolean isInitialized();
    }

    public interface SwitchSideOrBuilder extends o6z {
        @Override // p149l.o6z
        /* synthetic */ InterfaceC3419q getDefaultInstanceForType();

        AppStaySideEnum getToSide();

        int getToSideValue();

        @Override // p149l.o6z
        /* synthetic */ boolean isInitialized();
    }

    public interface UserAgentOrBuilder extends o6z {
        String getAppVersion();

        ByteString getAppVersionBytes();

        String getBrand();

        ByteString getBrandBytes();

        @Override // p149l.o6z
        /* synthetic */ InterfaceC3419q getDefaultInstanceForType();

        String getModel();

        ByteString getModelBytes();

        ClientSourceEnum getSource();

        int getSourceValue();

        String getSourceVersion();

        ByteString getSourceVersionBytes();

        @Override // p149l.o6z
        /* synthetic */ boolean isInitialized();
    }

    private liveAuthMessageNew() {
    }

    public static void registerAllExtensions(C3410h c3410h) {
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

        public static final class Builder extends GeneratedMessageLite.AbstractC3380b<Ack, Builder> implements AckOrBuilder {
            private Builder() {
                super(Ack.DEFAULT_INSTANCE);
            }

            public Builder clearMsgId() {
                copyOnWrite();
                ((Ack) this.instance).clearMsgId();
                return this;
            }

            public Builder clearMsgTypeName() {
                copyOnWrite();
                ((Ack) this.instance).clearMsgTypeName();
                return this;
            }

            public Builder clearRecvTimestamp() {
                copyOnWrite();
                ((Ack) this.instance).clearRecvTimestamp();
                return this;
            }

            @Override // com.p1.mobile.longlink.msg.liveConnector.liveAuthMessageNew.AckOrBuilder
            public String getMsgId() {
                return ((Ack) this.instance).getMsgId();
            }

            @Override // com.p1.mobile.longlink.msg.liveConnector.liveAuthMessageNew.AckOrBuilder
            public ByteString getMsgIdBytes() {
                return ((Ack) this.instance).getMsgIdBytes();
            }

            @Override // com.p1.mobile.longlink.msg.liveConnector.liveAuthMessageNew.AckOrBuilder
            public String getMsgTypeName() {
                return ((Ack) this.instance).getMsgTypeName();
            }

            @Override // com.p1.mobile.longlink.msg.liveConnector.liveAuthMessageNew.AckOrBuilder
            public ByteString getMsgTypeNameBytes() {
                return ((Ack) this.instance).getMsgTypeNameBytes();
            }

            @Override // com.p1.mobile.longlink.msg.liveConnector.liveAuthMessageNew.AckOrBuilder
            public long getRecvTimestamp() {
                return ((Ack) this.instance).getRecvTimestamp();
            }

            public Builder setMsgId(String str) {
                copyOnWrite();
                ((Ack) this.instance).setMsgId(str);
                return this;
            }

            public Builder setMsgIdBytes(ByteString byteString) {
                copyOnWrite();
                ((Ack) this.instance).setMsgIdBytes(byteString);
                return this;
            }

            public Builder setMsgTypeName(String str) {
                copyOnWrite();
                ((Ack) this.instance).setMsgTypeName(str);
                return this;
            }

            public Builder setMsgTypeNameBytes(ByteString byteString) {
                copyOnWrite();
                ((Ack) this.instance).setMsgTypeNameBytes(byteString);
                return this;
            }

            public Builder setRecvTimestamp(long j) {
                copyOnWrite();
                ((Ack) this.instance).setRecvTimestamp(j);
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
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(ack);
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
            AbstractC3403a.checkByteStringIsUtf8(byteString);
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
            AbstractC3403a.checkByteStringIsUtf8(byteString);
            this.msgTypeName_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setRecvTimestamp(long j) {
            this.recvTimestamp_ = j;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            boolean z = false;
            switch (C44291.f15950xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new Ack();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                    return null;
                case 4:
                    return new Builder();
                case 5:
                    GeneratedMessageLite.InterfaceC3386h interfaceC3386h = (GeneratedMessageLite.InterfaceC3386h) obj;
                    Ack ack = (Ack) obj2;
                    this.msgId_ = interfaceC3386h.mo16997f(!this.msgId_.isEmpty(), this.msgId_, !ack.msgId_.isEmpty(), ack.msgId_);
                    this.msgTypeName_ = interfaceC3386h.mo16997f(!this.msgTypeName_.isEmpty(), this.msgTypeName_, !ack.msgTypeName_.isEmpty(), ack.msgTypeName_);
                    long j = this.recvTimestamp_;
                    boolean z2 = j != 0;
                    long j2 = ack.recvTimestamp_;
                    this.recvTimestamp_ = interfaceC3386h.mo17000i(z2, j, j2 != 0, j2);
                    GeneratedMessageLite.C3385g c3385g = GeneratedMessageLite.C3385g.INSTANCE;
                    return this;
                case 6:
                    C3407e c3407e = (C3407e) obj;
                    while (!z) {
                        try {
                            int iM17116M = c3407e.m17116M();
                            if (iM17116M != 0) {
                                if (iM17116M == 10) {
                                    this.msgId_ = c3407e.m17115L();
                                } else if (iM17116M == 18) {
                                    this.msgTypeName_ = c3407e.m17115L();
                                } else if (iM17116M == 24) {
                                    this.recvTimestamp_ = c3407e.m17142v();
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
                        synchronized (Ack.class) {
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

        @Override // com.google.protobuf.InterfaceC3419q
        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int iM16901K = !this.msgId_.isEmpty() ? CodedOutputStream.m16901K(1, getMsgId()) : 0;
            if (!this.msgTypeName_.isEmpty()) {
                iM16901K += CodedOutputStream.m16901K(2, getMsgTypeName());
            }
            long j = this.recvTimestamp_;
            if (j != 0) {
                iM16901K += CodedOutputStream.m16931v(3, j);
            }
            this.memoizedSerializedSize = iM16901K;
            return iM16901K;
        }

        @Override // com.google.protobuf.InterfaceC3419q
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (!this.msgId_.isEmpty()) {
                codedOutputStream.mo16939D0(1, getMsgId());
            }
            if (!this.msgTypeName_.isEmpty()) {
                codedOutputStream.mo16939D0(2, getMsgTypeName());
            }
            long j = this.recvTimestamp_;
            if (j != 0) {
                codedOutputStream.m16972u0(3, j);
            }
        }

        public static Ack parseDelimitedFrom(InputStream inputStream, C3410h c3410h) throws IOException {
            return (Ack) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, c3410h);
        }

        public static Ack parseFrom(ByteString byteString, C3410h c3410h) throws InvalidProtocolBufferException {
            return (Ack) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, c3410h);
        }

        public static Ack parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (Ack) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static Ack parseFrom(byte[] bArr, C3410h c3410h) throws InvalidProtocolBufferException {
            return (Ack) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, c3410h);
        }

        public static Ack parseFrom(InputStream inputStream) throws IOException {
            return (Ack) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Ack parseFrom(InputStream inputStream, C3410h c3410h) throws IOException {
            return (Ack) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, c3410h);
        }

        public static Ack parseFrom(C3407e c3407e) throws IOException {
            return (Ack) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, c3407e);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static Ack parseFrom(C3407e c3407e, C3410h c3410h) throws IOException {
            return (Ack) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, c3407e, c3410h);
        }
    }

    public enum AppStaySideEnum implements C3414l.c {
        APP_STAY_SIDE_FOREGROUND(0),
        APP_STAY_SIDE_BACKGROUND(1),
        UNRECOGNIZED(-1);

        public static final int APP_STAY_SIDE_BACKGROUND_VALUE = 1;
        public static final int APP_STAY_SIDE_FOREGROUND_VALUE = 0;
        private static final C3414l.d<AppStaySideEnum> internalValueMap = new C3414l.d<AppStaySideEnum>() { // from class: com.p1.mobile.longlink.msg.liveConnector.liveAuthMessageNew.AppStaySideEnum.1
            @Override // com.google.protobuf.C3414l.d
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

        public static C3414l.d<AppStaySideEnum> internalGetValueMap() {
            return internalValueMap;
        }

        @Override // com.google.protobuf.C3414l.c
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
                this.loc_ = Location.newBuilder(this.loc_).mergeFrom(location).buildPartial();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeUa(UserAgent userAgent) {
            UserAgent userAgent2 = this.ua_;
            if (userAgent2 == null || userAgent2 == UserAgent.getDefaultInstance()) {
                this.ua_ = userAgent;
            } else {
                this.ua_ = UserAgent.newBuilder(this.ua_).mergeFrom(userAgent).buildPartial();
            }
        }

        public static Builder newBuilder(Auth auth) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(auth);
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
            AbstractC3403a.checkByteStringIsUtf8(byteString);
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
            AbstractC3403a.checkByteStringIsUtf8(byteString);
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
            AbstractC3403a.checkByteStringIsUtf8(byteString);
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
            AbstractC3403a.checkByteStringIsUtf8(byteString);
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
            AbstractC3403a.checkByteStringIsUtf8(byteString);
            this.liveMode_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setLoc(Location.Builder builder) {
            this.loc_ = builder.build();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setLocale(String str) {
            str.getClass();
            this.locale_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setLocaleBytes(ByteString byteString) {
            byteString.getClass();
            AbstractC3403a.checkByteStringIsUtf8(byteString);
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
            AbstractC3403a.checkByteStringIsUtf8(byteString);
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
            AbstractC3403a.checkByteStringIsUtf8(byteString);
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
            AbstractC3403a.checkByteStringIsUtf8(byteString);
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
            this.ua_ = builder.build();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setUserId(String str) {
            str.getClass();
            this.userId_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setUserIdBytes(ByteString byteString) {
            byteString.getClass();
            AbstractC3403a.checkByteStringIsUtf8(byteString);
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

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            boolean z = false;
            switch (C44291.f15950xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new Auth();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                    return null;
                case 4:
                    return new Builder();
                case 5:
                    GeneratedMessageLite.InterfaceC3386h interfaceC3386h = (GeneratedMessageLite.InterfaceC3386h) obj;
                    Auth auth = (Auth) obj2;
                    this.userId_ = interfaceC3386h.mo16997f(!this.userId_.isEmpty(), this.userId_, !auth.userId_.isEmpty(), auth.userId_);
                    int i = this.source_;
                    boolean z2 = i != 0;
                    int i2 = auth.source_;
                    this.source_ = interfaceC3386h.mo16996e(z2, i, i2 != 0, i2);
                    this.loc_ = (Location) interfaceC3386h.mo17006o(this.loc_, auth.loc_);
                    int i3 = this.staySide_;
                    boolean z3 = i3 != 0;
                    int i4 = auth.staySide_;
                    this.staySide_ = interfaceC3386h.mo16996e(z3, i3, i4 != 0, i4);
                    this.ua_ = (UserAgent) interfaceC3386h.mo17006o(this.ua_, auth.ua_);
                    this.locale_ = interfaceC3386h.mo16997f(!this.locale_.isEmpty(), this.locale_, !auth.locale_.isEmpty(), auth.locale_);
                    this.roomId_ = interfaceC3386h.mo16997f(!this.roomId_.isEmpty(), this.roomId_, !auth.roomId_.isEmpty(), auth.roomId_);
                    ByteString byteString = this.xTestingGroup_;
                    ByteString byteString2 = ByteString.EMPTY;
                    boolean z4 = byteString != byteString2;
                    ByteString byteString3 = auth.xTestingGroup_;
                    this.xTestingGroup_ = interfaceC3386h.mo16999h(z4, byteString, byteString3 != byteString2, byteString3);
                    ByteString byteString4 = this.xTTClientInfo_;
                    boolean z5 = byteString4 != byteString2;
                    ByteString byteString5 = auth.xTTClientInfo_;
                    this.xTTClientInfo_ = interfaceC3386h.mo16999h(z5, byteString4, byteString5 != byteString2, byteString5);
                    ByteString byteString6 = this.flag_;
                    boolean z6 = byteString6 != byteString2;
                    ByteString byteString7 = auth.flag_;
                    this.flag_ = interfaceC3386h.mo16999h(z6, byteString6, byteString7 != byteString2, byteString7);
                    this.ext_ = interfaceC3386h.mo16997f(!this.ext_.isEmpty(), this.ext_, !auth.ext_.isEmpty(), auth.ext_);
                    this.roomType_ = interfaceC3386h.mo16997f(!this.roomType_.isEmpty(), this.roomType_, !auth.roomType_.isEmpty(), auth.roomType_);
                    boolean z7 = this.iosVerify_;
                    boolean z8 = auth.iosVerify_;
                    this.iosVerify_ = interfaceC3386h.mo16995d(z7, z7, z8, z8);
                    this.liveMode_ = interfaceC3386h.mo16997f(!this.liveMode_.isEmpty(), this.liveMode_, !auth.liveMode_.isEmpty(), auth.liveMode_);
                    this.liveId_ = interfaceC3386h.mo16997f(!this.liveId_.isEmpty(), this.liveId_, !auth.liveId_.isEmpty(), auth.liveId_);
                    this.enterSource_ = interfaceC3386h.mo16997f(!this.enterSource_.isEmpty(), this.enterSource_, !auth.enterSource_.isEmpty(), auth.enterSource_);
                    this.sessionId_ = interfaceC3386h.mo16997f(!this.sessionId_.isEmpty(), this.sessionId_, !auth.sessionId_.isEmpty(), auth.sessionId_);
                    int i5 = this.linkState_;
                    boolean z9 = i5 != 0;
                    int i6 = auth.linkState_;
                    this.linkState_ = interfaceC3386h.mo16996e(z9, i5, i6 != 0, i6);
                    long j = this.firstLinkTime_;
                    boolean z10 = j != 0;
                    long j2 = auth.firstLinkTime_;
                    this.firstLinkTime_ = interfaceC3386h.mo17000i(z10, j, j2 != 0, j2);
                    long j3 = this.interruptLinkTime_;
                    boolean z11 = j3 != 0;
                    long j4 = auth.interruptLinkTime_;
                    this.interruptLinkTime_ = interfaceC3386h.mo17000i(z11, j3, j4 != 0, j4);
                    long j5 = this.currentTime_;
                    boolean z12 = j5 != 0;
                    long j6 = auth.currentTime_;
                    this.currentTime_ = interfaceC3386h.mo17000i(z12, j5, j6 != 0, j6);
                    this.ipHost_ = interfaceC3386h.mo16997f(!this.ipHost_.isEmpty(), this.ipHost_, !auth.ipHost_.isEmpty(), auth.ipHost_);
                    int i7 = this.retryCount_;
                    boolean z13 = i7 != 0;
                    int i8 = auth.retryCount_;
                    this.retryCount_ = interfaceC3386h.mo16996e(z13, i7, i8 != 0, i8);
                    boolean z14 = false;
                    long j7 = this.currentStartLinkTime_;
                    if (j7 != 0) {
                        z14 = true;
                    }
                    long j8 = auth.currentStartLinkTime_;
                    this.currentStartLinkTime_ = interfaceC3386h.mo17000i(z14, j7, j8 != 0, j8);
                    GeneratedMessageLite.C3385g c3385g = GeneratedMessageLite.C3385g.INSTANCE;
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
                                    this.userId_ = c3407e.m17115L();
                                    continue;
                                case 16:
                                    this.source_ = c3407e.m17136p();
                                    continue;
                                case 26:
                                    Location location = this.loc_;
                                    Location.Builder builder = location != null ? location.toBuilder() : null;
                                    Location location2 = (Location) c3407e.m17143w(Location.parser(), c3410h);
                                    this.loc_ = location2;
                                    if (builder != null) {
                                        builder.mergeFrom(location2);
                                        this.loc_ = builder.buildPartial();
                                    } else {
                                        continue;
                                    }
                                    break;
                                case 32:
                                    this.staySide_ = c3407e.m17136p();
                                    continue;
                                case 42:
                                    UserAgent userAgent = this.ua_;
                                    UserAgent.Builder builder2 = userAgent != null ? userAgent.toBuilder() : null;
                                    UserAgent userAgent2 = (UserAgent) c3407e.m17143w(UserAgent.parser(), c3410h);
                                    this.ua_ = userAgent2;
                                    if (builder2 != null) {
                                        builder2.mergeFrom(userAgent2);
                                        this.ua_ = builder2.buildPartial();
                                    } else {
                                        continue;
                                    }
                                    break;
                                case 50:
                                    this.locale_ = c3407e.m17115L();
                                    continue;
                                case 58:
                                    this.roomId_ = c3407e.m17115L();
                                    continue;
                                case 66:
                                    this.xTestingGroup_ = c3407e.m17134n();
                                    continue;
                                case 74:
                                    this.xTTClientInfo_ = c3407e.m17134n();
                                    continue;
                                case EACTags.COMMAND_TO_PERFORM /* 82 */:
                                    this.flag_ = c3407e.m17134n();
                                    continue;
                                case 90:
                                    this.ext_ = c3407e.m17115L();
                                    continue;
                                case EACTags.FCP_TEMPLATE /* 98 */:
                                    this.roomType_ = c3407e.m17115L();
                                    continue;
                                case 104:
                                    this.iosVerify_ = c3407e.m17133m();
                                    continue;
                                case 114:
                                    this.liveMode_ = c3407e.m17115L();
                                    continue;
                                case 122:
                                    this.liveId_ = c3407e.m17115L();
                                    continue;
                                case 130:
                                    this.enterSource_ = c3407e.m17115L();
                                    continue;
                                case CipherSuite.TLS_PSK_WITH_RC4_128_SHA /* 138 */:
                                    this.sessionId_ = c3407e.m17115L();
                                    continue;
                                case 144:
                                    this.linkState_ = c3407e.m17141u();
                                    continue;
                                case CipherSuite.TLS_DH_RSA_WITH_SEED_CBC_SHA /* 152 */:
                                    this.firstLinkTime_ = c3407e.m17142v();
                                    continue;
                                case 160:
                                    this.interruptLinkTime_ = c3407e.m17142v();
                                    continue;
                                case CipherSuite.TLS_PSK_WITH_AES_128_GCM_SHA256 /* 168 */:
                                    this.currentTime_ = c3407e.m17142v();
                                    continue;
                                case 178:
                                    this.ipHost_ = c3407e.m17115L();
                                    continue;
                                case 184:
                                    this.retryCount_ = c3407e.m17141u();
                                    continue;
                                case 192:
                                    this.currentStartLinkTime_ = c3407e.m17142v();
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
                        synchronized (Auth.class) {
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

        @Override // com.google.protobuf.InterfaceC3419q
        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int iM16901K = !this.userId_.isEmpty() ? CodedOutputStream.m16901K(1, getUserId()) : 0;
            if (this.source_ != ClientSourceEnum.CLIENT_SOURCE_ANDROID.getNumber()) {
                iM16901K += CodedOutputStream.m16922m(2, this.source_);
            }
            if (this.loc_ != null) {
                iM16901K += CodedOutputStream.m16893C(3, getLoc());
            }
            if (this.staySide_ != AppStaySideEnum.APP_STAY_SIDE_FOREGROUND.getNumber()) {
                iM16901K += CodedOutputStream.m16922m(4, this.staySide_);
            }
            if (this.ua_ != null) {
                iM16901K += CodedOutputStream.m16893C(5, getUa());
            }
            if (!this.locale_.isEmpty()) {
                iM16901K += CodedOutputStream.m16901K(6, getLocale());
            }
            if (!this.roomId_.isEmpty()) {
                iM16901K += CodedOutputStream.m16901K(7, getRoomId());
            }
            if (!this.xTestingGroup_.isEmpty()) {
                iM16901K += CodedOutputStream.m16918i(8, this.xTestingGroup_);
            }
            if (!this.xTTClientInfo_.isEmpty()) {
                iM16901K += CodedOutputStream.m16918i(9, this.xTTClientInfo_);
            }
            if (!this.flag_.isEmpty()) {
                iM16901K += CodedOutputStream.m16918i(10, this.flag_);
            }
            if (!this.ext_.isEmpty()) {
                iM16901K += CodedOutputStream.m16901K(11, getExt());
            }
            if (!this.roomType_.isEmpty()) {
                iM16901K += CodedOutputStream.m16901K(12, getRoomType());
            }
            boolean z = this.iosVerify_;
            if (z) {
                iM16901K += CodedOutputStream.m16915f(13, z);
            }
            if (!this.liveMode_.isEmpty()) {
                iM16901K += CodedOutputStream.m16901K(14, getLiveMode());
            }
            if (!this.liveId_.isEmpty()) {
                iM16901K += CodedOutputStream.m16901K(15, getLiveId());
            }
            if (!this.enterSource_.isEmpty()) {
                iM16901K += CodedOutputStream.m16901K(16, getEnterSource());
            }
            if (!this.sessionId_.isEmpty()) {
                iM16901K += CodedOutputStream.m16901K(17, getSessionId());
            }
            int i2 = this.linkState_;
            if (i2 != 0) {
                iM16901K += CodedOutputStream.m16929t(18, i2);
            }
            long j = this.firstLinkTime_;
            if (j != 0) {
                iM16901K += CodedOutputStream.m16931v(19, j);
            }
            long j2 = this.interruptLinkTime_;
            if (j2 != 0) {
                iM16901K += CodedOutputStream.m16931v(20, j2);
            }
            long j3 = this.currentTime_;
            if (j3 != 0) {
                iM16901K += CodedOutputStream.m16931v(21, j3);
            }
            if (!this.ipHost_.isEmpty()) {
                iM16901K += CodedOutputStream.m16901K(22, getIpHost());
            }
            int i3 = this.retryCount_;
            if (i3 != 0) {
                iM16901K += CodedOutputStream.m16929t(23, i3);
            }
            long j4 = this.currentStartLinkTime_;
            if (j4 != 0) {
                iM16901K += CodedOutputStream.m16931v(24, j4);
            }
            this.memoizedSerializedSize = iM16901K;
            return iM16901K;
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

        @Override // com.google.protobuf.InterfaceC3419q
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (!this.userId_.isEmpty()) {
                codedOutputStream.mo16939D0(1, getUserId());
            }
            if (this.source_ != ClientSourceEnum.CLIENT_SOURCE_ANDROID.getNumber()) {
                codedOutputStream.m16960i0(2, this.source_);
            }
            if (this.loc_ != null) {
                codedOutputStream.mo16974w0(3, getLoc());
            }
            if (this.staySide_ != AppStaySideEnum.APP_STAY_SIDE_FOREGROUND.getNumber()) {
                codedOutputStream.m16960i0(4, this.staySide_);
            }
            if (this.ua_ != null) {
                codedOutputStream.mo16974w0(5, getUa());
            }
            if (!this.locale_.isEmpty()) {
                codedOutputStream.mo16939D0(6, getLocale());
            }
            if (!this.roomId_.isEmpty()) {
                codedOutputStream.mo16939D0(7, getRoomId());
            }
            if (!this.xTestingGroup_.isEmpty()) {
                codedOutputStream.mo16956e0(8, this.xTestingGroup_);
            }
            if (!this.xTTClientInfo_.isEmpty()) {
                codedOutputStream.mo16956e0(9, this.xTTClientInfo_);
            }
            if (!this.flag_.isEmpty()) {
                codedOutputStream.mo16956e0(10, this.flag_);
            }
            if (!this.ext_.isEmpty()) {
                codedOutputStream.mo16939D0(11, getExt());
            }
            if (!this.roomType_.isEmpty()) {
                codedOutputStream.mo16939D0(12, getRoomType());
            }
            boolean z = this.iosVerify_;
            if (z) {
                codedOutputStream.mo16950a0(13, z);
            }
            if (!this.liveMode_.isEmpty()) {
                codedOutputStream.mo16939D0(14, getLiveMode());
            }
            if (!this.liveId_.isEmpty()) {
                codedOutputStream.mo16939D0(15, getLiveId());
            }
            if (!this.enterSource_.isEmpty()) {
                codedOutputStream.mo16939D0(16, getEnterSource());
            }
            if (!this.sessionId_.isEmpty()) {
                codedOutputStream.mo16939D0(17, getSessionId());
            }
            int i = this.linkState_;
            if (i != 0) {
                codedOutputStream.mo16970s0(18, i);
            }
            long j = this.firstLinkTime_;
            if (j != 0) {
                codedOutputStream.m16972u0(19, j);
            }
            long j2 = this.interruptLinkTime_;
            if (j2 != 0) {
                codedOutputStream.m16972u0(20, j2);
            }
            long j3 = this.currentTime_;
            if (j3 != 0) {
                codedOutputStream.m16972u0(21, j3);
            }
            if (!this.ipHost_.isEmpty()) {
                codedOutputStream.mo16939D0(22, getIpHost());
            }
            int i2 = this.retryCount_;
            if (i2 != 0) {
                codedOutputStream.mo16970s0(23, i2);
            }
            long j4 = this.currentStartLinkTime_;
            if (j4 != 0) {
                codedOutputStream.m16972u0(24, j4);
            }
        }

        public static Auth parseDelimitedFrom(InputStream inputStream, C3410h c3410h) throws IOException {
            return (Auth) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, c3410h);
        }

        public static Auth parseFrom(ByteString byteString, C3410h c3410h) throws InvalidProtocolBufferException {
            return (Auth) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, c3410h);
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

        public static final class Builder extends GeneratedMessageLite.AbstractC3380b<Auth, Builder> implements AuthOrBuilder {
            private Builder() {
                super(Auth.DEFAULT_INSTANCE);
            }

            public Builder clearCurrentStartLinkTime() {
                copyOnWrite();
                ((Auth) this.instance).clearCurrentStartLinkTime();
                return this;
            }

            public Builder clearCurrentTime() {
                copyOnWrite();
                ((Auth) this.instance).clearCurrentTime();
                return this;
            }

            public Builder clearEnterSource() {
                copyOnWrite();
                ((Auth) this.instance).clearEnterSource();
                return this;
            }

            public Builder clearExt() {
                copyOnWrite();
                ((Auth) this.instance).clearExt();
                return this;
            }

            public Builder clearFirstLinkTime() {
                copyOnWrite();
                ((Auth) this.instance).clearFirstLinkTime();
                return this;
            }

            public Builder clearFlag() {
                copyOnWrite();
                ((Auth) this.instance).clearFlag();
                return this;
            }

            public Builder clearInterruptLinkTime() {
                copyOnWrite();
                ((Auth) this.instance).clearInterruptLinkTime();
                return this;
            }

            public Builder clearIosVerify() {
                copyOnWrite();
                ((Auth) this.instance).clearIosVerify();
                return this;
            }

            public Builder clearIpHost() {
                copyOnWrite();
                ((Auth) this.instance).clearIpHost();
                return this;
            }

            public Builder clearLinkState() {
                copyOnWrite();
                ((Auth) this.instance).clearLinkState();
                return this;
            }

            public Builder clearLiveId() {
                copyOnWrite();
                ((Auth) this.instance).clearLiveId();
                return this;
            }

            public Builder clearLiveMode() {
                copyOnWrite();
                ((Auth) this.instance).clearLiveMode();
                return this;
            }

            public Builder clearLoc() {
                copyOnWrite();
                ((Auth) this.instance).clearLoc();
                return this;
            }

            public Builder clearLocale() {
                copyOnWrite();
                ((Auth) this.instance).clearLocale();
                return this;
            }

            public Builder clearRetryCount() {
                copyOnWrite();
                ((Auth) this.instance).clearRetryCount();
                return this;
            }

            public Builder clearRoomId() {
                copyOnWrite();
                ((Auth) this.instance).clearRoomId();
                return this;
            }

            public Builder clearRoomType() {
                copyOnWrite();
                ((Auth) this.instance).clearRoomType();
                return this;
            }

            public Builder clearSessionId() {
                copyOnWrite();
                ((Auth) this.instance).clearSessionId();
                return this;
            }

            public Builder clearSource() {
                copyOnWrite();
                ((Auth) this.instance).clearSource();
                return this;
            }

            public Builder clearStaySide() {
                copyOnWrite();
                ((Auth) this.instance).clearStaySide();
                return this;
            }

            public Builder clearUa() {
                copyOnWrite();
                ((Auth) this.instance).clearUa();
                return this;
            }

            public Builder clearUserId() {
                copyOnWrite();
                ((Auth) this.instance).clearUserId();
                return this;
            }

            public Builder clearXTTClientInfo() {
                copyOnWrite();
                ((Auth) this.instance).clearXTTClientInfo();
                return this;
            }

            public Builder clearXTestingGroup() {
                copyOnWrite();
                ((Auth) this.instance).clearXTestingGroup();
                return this;
            }

            @Override // com.p1.mobile.longlink.msg.liveConnector.liveAuthMessageNew.AuthOrBuilder
            public long getCurrentStartLinkTime() {
                return ((Auth) this.instance).getCurrentStartLinkTime();
            }

            @Override // com.p1.mobile.longlink.msg.liveConnector.liveAuthMessageNew.AuthOrBuilder
            public long getCurrentTime() {
                return ((Auth) this.instance).getCurrentTime();
            }

            @Override // com.p1.mobile.longlink.msg.liveConnector.liveAuthMessageNew.AuthOrBuilder
            public String getEnterSource() {
                return ((Auth) this.instance).getEnterSource();
            }

            @Override // com.p1.mobile.longlink.msg.liveConnector.liveAuthMessageNew.AuthOrBuilder
            public ByteString getEnterSourceBytes() {
                return ((Auth) this.instance).getEnterSourceBytes();
            }

            @Override // com.p1.mobile.longlink.msg.liveConnector.liveAuthMessageNew.AuthOrBuilder
            public String getExt() {
                return ((Auth) this.instance).getExt();
            }

            @Override // com.p1.mobile.longlink.msg.liveConnector.liveAuthMessageNew.AuthOrBuilder
            public ByteString getExtBytes() {
                return ((Auth) this.instance).getExtBytes();
            }

            @Override // com.p1.mobile.longlink.msg.liveConnector.liveAuthMessageNew.AuthOrBuilder
            public long getFirstLinkTime() {
                return ((Auth) this.instance).getFirstLinkTime();
            }

            @Override // com.p1.mobile.longlink.msg.liveConnector.liveAuthMessageNew.AuthOrBuilder
            public ByteString getFlag() {
                return ((Auth) this.instance).getFlag();
            }

            @Override // com.p1.mobile.longlink.msg.liveConnector.liveAuthMessageNew.AuthOrBuilder
            public long getInterruptLinkTime() {
                return ((Auth) this.instance).getInterruptLinkTime();
            }

            @Override // com.p1.mobile.longlink.msg.liveConnector.liveAuthMessageNew.AuthOrBuilder
            public boolean getIosVerify() {
                return ((Auth) this.instance).getIosVerify();
            }

            @Override // com.p1.mobile.longlink.msg.liveConnector.liveAuthMessageNew.AuthOrBuilder
            public String getIpHost() {
                return ((Auth) this.instance).getIpHost();
            }

            @Override // com.p1.mobile.longlink.msg.liveConnector.liveAuthMessageNew.AuthOrBuilder
            public ByteString getIpHostBytes() {
                return ((Auth) this.instance).getIpHostBytes();
            }

            @Override // com.p1.mobile.longlink.msg.liveConnector.liveAuthMessageNew.AuthOrBuilder
            public int getLinkState() {
                return ((Auth) this.instance).getLinkState();
            }

            @Override // com.p1.mobile.longlink.msg.liveConnector.liveAuthMessageNew.AuthOrBuilder
            public String getLiveId() {
                return ((Auth) this.instance).getLiveId();
            }

            @Override // com.p1.mobile.longlink.msg.liveConnector.liveAuthMessageNew.AuthOrBuilder
            public ByteString getLiveIdBytes() {
                return ((Auth) this.instance).getLiveIdBytes();
            }

            @Override // com.p1.mobile.longlink.msg.liveConnector.liveAuthMessageNew.AuthOrBuilder
            public String getLiveMode() {
                return ((Auth) this.instance).getLiveMode();
            }

            @Override // com.p1.mobile.longlink.msg.liveConnector.liveAuthMessageNew.AuthOrBuilder
            public ByteString getLiveModeBytes() {
                return ((Auth) this.instance).getLiveModeBytes();
            }

            @Override // com.p1.mobile.longlink.msg.liveConnector.liveAuthMessageNew.AuthOrBuilder
            public Location getLoc() {
                return ((Auth) this.instance).getLoc();
            }

            @Override // com.p1.mobile.longlink.msg.liveConnector.liveAuthMessageNew.AuthOrBuilder
            public String getLocale() {
                return ((Auth) this.instance).getLocale();
            }

            @Override // com.p1.mobile.longlink.msg.liveConnector.liveAuthMessageNew.AuthOrBuilder
            public ByteString getLocaleBytes() {
                return ((Auth) this.instance).getLocaleBytes();
            }

            @Override // com.p1.mobile.longlink.msg.liveConnector.liveAuthMessageNew.AuthOrBuilder
            public int getRetryCount() {
                return ((Auth) this.instance).getRetryCount();
            }

            @Override // com.p1.mobile.longlink.msg.liveConnector.liveAuthMessageNew.AuthOrBuilder
            public String getRoomId() {
                return ((Auth) this.instance).getRoomId();
            }

            @Override // com.p1.mobile.longlink.msg.liveConnector.liveAuthMessageNew.AuthOrBuilder
            public ByteString getRoomIdBytes() {
                return ((Auth) this.instance).getRoomIdBytes();
            }

            @Override // com.p1.mobile.longlink.msg.liveConnector.liveAuthMessageNew.AuthOrBuilder
            public String getRoomType() {
                return ((Auth) this.instance).getRoomType();
            }

            @Override // com.p1.mobile.longlink.msg.liveConnector.liveAuthMessageNew.AuthOrBuilder
            public ByteString getRoomTypeBytes() {
                return ((Auth) this.instance).getRoomTypeBytes();
            }

            @Override // com.p1.mobile.longlink.msg.liveConnector.liveAuthMessageNew.AuthOrBuilder
            public String getSessionId() {
                return ((Auth) this.instance).getSessionId();
            }

            @Override // com.p1.mobile.longlink.msg.liveConnector.liveAuthMessageNew.AuthOrBuilder
            public ByteString getSessionIdBytes() {
                return ((Auth) this.instance).getSessionIdBytes();
            }

            @Override // com.p1.mobile.longlink.msg.liveConnector.liveAuthMessageNew.AuthOrBuilder
            public ClientSourceEnum getSource() {
                return ((Auth) this.instance).getSource();
            }

            @Override // com.p1.mobile.longlink.msg.liveConnector.liveAuthMessageNew.AuthOrBuilder
            public int getSourceValue() {
                return ((Auth) this.instance).getSourceValue();
            }

            @Override // com.p1.mobile.longlink.msg.liveConnector.liveAuthMessageNew.AuthOrBuilder
            public AppStaySideEnum getStaySide() {
                return ((Auth) this.instance).getStaySide();
            }

            @Override // com.p1.mobile.longlink.msg.liveConnector.liveAuthMessageNew.AuthOrBuilder
            public int getStaySideValue() {
                return ((Auth) this.instance).getStaySideValue();
            }

            @Override // com.p1.mobile.longlink.msg.liveConnector.liveAuthMessageNew.AuthOrBuilder
            public UserAgent getUa() {
                return ((Auth) this.instance).getUa();
            }

            @Override // com.p1.mobile.longlink.msg.liveConnector.liveAuthMessageNew.AuthOrBuilder
            public String getUserId() {
                return ((Auth) this.instance).getUserId();
            }

            @Override // com.p1.mobile.longlink.msg.liveConnector.liveAuthMessageNew.AuthOrBuilder
            public ByteString getUserIdBytes() {
                return ((Auth) this.instance).getUserIdBytes();
            }

            @Override // com.p1.mobile.longlink.msg.liveConnector.liveAuthMessageNew.AuthOrBuilder
            public ByteString getXTTClientInfo() {
                return ((Auth) this.instance).getXTTClientInfo();
            }

            @Override // com.p1.mobile.longlink.msg.liveConnector.liveAuthMessageNew.AuthOrBuilder
            public ByteString getXTestingGroup() {
                return ((Auth) this.instance).getXTestingGroup();
            }

            @Override // com.p1.mobile.longlink.msg.liveConnector.liveAuthMessageNew.AuthOrBuilder
            public boolean hasLoc() {
                return ((Auth) this.instance).hasLoc();
            }

            @Override // com.p1.mobile.longlink.msg.liveConnector.liveAuthMessageNew.AuthOrBuilder
            public boolean hasUa() {
                return ((Auth) this.instance).hasUa();
            }

            public Builder mergeLoc(Location location) {
                copyOnWrite();
                ((Auth) this.instance).mergeLoc(location);
                return this;
            }

            public Builder mergeUa(UserAgent userAgent) {
                copyOnWrite();
                ((Auth) this.instance).mergeUa(userAgent);
                return this;
            }

            public Builder setCurrentStartLinkTime(long j) {
                copyOnWrite();
                ((Auth) this.instance).setCurrentStartLinkTime(j);
                return this;
            }

            public Builder setCurrentTime(long j) {
                copyOnWrite();
                ((Auth) this.instance).setCurrentTime(j);
                return this;
            }

            public Builder setEnterSource(String str) {
                copyOnWrite();
                ((Auth) this.instance).setEnterSource(str);
                return this;
            }

            public Builder setEnterSourceBytes(ByteString byteString) {
                copyOnWrite();
                ((Auth) this.instance).setEnterSourceBytes(byteString);
                return this;
            }

            public Builder setExt(String str) {
                copyOnWrite();
                ((Auth) this.instance).setExt(str);
                return this;
            }

            public Builder setExtBytes(ByteString byteString) {
                copyOnWrite();
                ((Auth) this.instance).setExtBytes(byteString);
                return this;
            }

            public Builder setFirstLinkTime(long j) {
                copyOnWrite();
                ((Auth) this.instance).setFirstLinkTime(j);
                return this;
            }

            public Builder setFlag(ByteString byteString) {
                copyOnWrite();
                ((Auth) this.instance).setFlag(byteString);
                return this;
            }

            public Builder setInterruptLinkTime(long j) {
                copyOnWrite();
                ((Auth) this.instance).setInterruptLinkTime(j);
                return this;
            }

            public Builder setIosVerify(boolean z) {
                copyOnWrite();
                ((Auth) this.instance).setIosVerify(z);
                return this;
            }

            public Builder setIpHost(String str) {
                copyOnWrite();
                ((Auth) this.instance).setIpHost(str);
                return this;
            }

            public Builder setIpHostBytes(ByteString byteString) {
                copyOnWrite();
                ((Auth) this.instance).setIpHostBytes(byteString);
                return this;
            }

            public Builder setLinkState(int i) {
                copyOnWrite();
                ((Auth) this.instance).setLinkState(i);
                return this;
            }

            public Builder setLiveId(String str) {
                copyOnWrite();
                ((Auth) this.instance).setLiveId(str);
                return this;
            }

            public Builder setLiveIdBytes(ByteString byteString) {
                copyOnWrite();
                ((Auth) this.instance).setLiveIdBytes(byteString);
                return this;
            }

            public Builder setLiveMode(String str) {
                copyOnWrite();
                ((Auth) this.instance).setLiveMode(str);
                return this;
            }

            public Builder setLiveModeBytes(ByteString byteString) {
                copyOnWrite();
                ((Auth) this.instance).setLiveModeBytes(byteString);
                return this;
            }

            public Builder setLoc(Location location) {
                copyOnWrite();
                ((Auth) this.instance).setLoc(location);
                return this;
            }

            public Builder setLocale(String str) {
                copyOnWrite();
                ((Auth) this.instance).setLocale(str);
                return this;
            }

            public Builder setLocaleBytes(ByteString byteString) {
                copyOnWrite();
                ((Auth) this.instance).setLocaleBytes(byteString);
                return this;
            }

            public Builder setRetryCount(int i) {
                copyOnWrite();
                ((Auth) this.instance).setRetryCount(i);
                return this;
            }

            public Builder setRoomId(String str) {
                copyOnWrite();
                ((Auth) this.instance).setRoomId(str);
                return this;
            }

            public Builder setRoomIdBytes(ByteString byteString) {
                copyOnWrite();
                ((Auth) this.instance).setRoomIdBytes(byteString);
                return this;
            }

            public Builder setRoomType(String str) {
                copyOnWrite();
                ((Auth) this.instance).setRoomType(str);
                return this;
            }

            public Builder setRoomTypeBytes(ByteString byteString) {
                copyOnWrite();
                ((Auth) this.instance).setRoomTypeBytes(byteString);
                return this;
            }

            public Builder setSessionId(String str) {
                copyOnWrite();
                ((Auth) this.instance).setSessionId(str);
                return this;
            }

            public Builder setSessionIdBytes(ByteString byteString) {
                copyOnWrite();
                ((Auth) this.instance).setSessionIdBytes(byteString);
                return this;
            }

            public Builder setSource(ClientSourceEnum clientSourceEnum) {
                copyOnWrite();
                ((Auth) this.instance).setSource(clientSourceEnum);
                return this;
            }

            public Builder setSourceValue(int i) {
                copyOnWrite();
                ((Auth) this.instance).setSourceValue(i);
                return this;
            }

            public Builder setStaySide(AppStaySideEnum appStaySideEnum) {
                copyOnWrite();
                ((Auth) this.instance).setStaySide(appStaySideEnum);
                return this;
            }

            public Builder setStaySideValue(int i) {
                copyOnWrite();
                ((Auth) this.instance).setStaySideValue(i);
                return this;
            }

            public Builder setUa(UserAgent userAgent) {
                copyOnWrite();
                ((Auth) this.instance).setUa(userAgent);
                return this;
            }

            public Builder setUserId(String str) {
                copyOnWrite();
                ((Auth) this.instance).setUserId(str);
                return this;
            }

            public Builder setUserIdBytes(ByteString byteString) {
                copyOnWrite();
                ((Auth) this.instance).setUserIdBytes(byteString);
                return this;
            }

            public Builder setXTTClientInfo(ByteString byteString) {
                copyOnWrite();
                ((Auth) this.instance).setXTTClientInfo(byteString);
                return this;
            }

            public Builder setXTestingGroup(ByteString byteString) {
                copyOnWrite();
                ((Auth) this.instance).setXTestingGroup(byteString);
                return this;
            }

            public Builder setLoc(Location.Builder builder) {
                copyOnWrite();
                ((Auth) this.instance).setLoc(builder);
                return this;
            }

            public Builder setUa(UserAgent.Builder builder) {
                copyOnWrite();
                ((Auth) this.instance).setUa(builder);
                return this;
            }
        }

        public static Auth parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (Auth) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static Auth parseFrom(byte[] bArr, C3410h c3410h) throws InvalidProtocolBufferException {
            return (Auth) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, c3410h);
        }

        public static Auth parseFrom(InputStream inputStream) throws IOException {
            return (Auth) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Auth parseFrom(InputStream inputStream, C3410h c3410h) throws IOException {
            return (Auth) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, c3410h);
        }

        public static Auth parseFrom(C3407e c3407e) throws IOException {
            return (Auth) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, c3407e);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static Auth parseFrom(C3407e c3407e, C3410h c3410h) throws IOException {
            return (Auth) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, c3407e, c3410h);
        }
    }

    public static final class AuthKey extends GeneratedMessageLite<AuthKey, Builder> implements AuthKeyOrBuilder {
        private static final AuthKey DEFAULT_INSTANCE;
        private static volatile i860<AuthKey> PARSER = null;
        public static final int ROOMKEY_FIELD_NUMBER = 1;
        private String roomKey_ = "";

        public static final class Builder extends GeneratedMessageLite.AbstractC3380b<AuthKey, Builder> implements AuthKeyOrBuilder {
            private Builder() {
                super(AuthKey.DEFAULT_INSTANCE);
            }

            public Builder clearRoomKey() {
                copyOnWrite();
                ((AuthKey) this.instance).clearRoomKey();
                return this;
            }

            @Override // com.p1.mobile.longlink.msg.liveConnector.liveAuthMessageNew.AuthKeyOrBuilder
            public String getRoomKey() {
                return ((AuthKey) this.instance).getRoomKey();
            }

            @Override // com.p1.mobile.longlink.msg.liveConnector.liveAuthMessageNew.AuthKeyOrBuilder
            public ByteString getRoomKeyBytes() {
                return ((AuthKey) this.instance).getRoomKeyBytes();
            }

            public Builder setRoomKey(String str) {
                copyOnWrite();
                ((AuthKey) this.instance).setRoomKey(str);
                return this;
            }

            public Builder setRoomKeyBytes(ByteString byteString) {
                copyOnWrite();
                ((AuthKey) this.instance).setRoomKeyBytes(byteString);
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
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(authKey);
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
            AbstractC3403a.checkByteStringIsUtf8(byteString);
            this.roomKey_ = byteString.toStringUtf8();
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (C44291.f15950xa1df5c61[methodToInvoke.ordinal()]) {
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
                    this.roomKey_ = ((GeneratedMessageLite.InterfaceC3386h) obj).mo16997f(!this.roomKey_.isEmpty(), this.roomKey_, true ^ authKey.roomKey_.isEmpty(), authKey.roomKey_);
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
                                    this.roomKey_ = c3407e.m17115L();
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
                        synchronized (AuthKey.class) {
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

        @Override // com.p1.mobile.longlink.msg.liveConnector.liveAuthMessageNew.AuthKeyOrBuilder
        public String getRoomKey() {
            return this.roomKey_;
        }

        @Override // com.p1.mobile.longlink.msg.liveConnector.liveAuthMessageNew.AuthKeyOrBuilder
        public ByteString getRoomKeyBytes() {
            return ByteString.copyFromUtf8(this.roomKey_);
        }

        @Override // com.google.protobuf.InterfaceC3419q
        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int iM16901K = !this.roomKey_.isEmpty() ? CodedOutputStream.m16901K(1, getRoomKey()) : 0;
            this.memoizedSerializedSize = iM16901K;
            return iM16901K;
        }

        @Override // com.google.protobuf.InterfaceC3419q
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (this.roomKey_.isEmpty()) {
                return;
            }
            codedOutputStream.mo16939D0(1, getRoomKey());
        }

        public static AuthKey parseDelimitedFrom(InputStream inputStream, C3410h c3410h) throws IOException {
            return (AuthKey) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, c3410h);
        }

        public static AuthKey parseFrom(ByteString byteString, C3410h c3410h) throws InvalidProtocolBufferException {
            return (AuthKey) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, c3410h);
        }

        public static AuthKey parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (AuthKey) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static AuthKey parseFrom(byte[] bArr, C3410h c3410h) throws InvalidProtocolBufferException {
            return (AuthKey) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, c3410h);
        }

        public static AuthKey parseFrom(InputStream inputStream) throws IOException {
            return (AuthKey) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static AuthKey parseFrom(InputStream inputStream, C3410h c3410h) throws IOException {
            return (AuthKey) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, c3410h);
        }

        public static AuthKey parseFrom(C3407e c3407e) throws IOException {
            return (AuthKey) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, c3407e);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static AuthKey parseFrom(C3407e c3407e, C3410h c3410h) throws IOException {
            return (AuthKey) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, c3407e, c3410h);
        }
    }

    public static final class ChatReaded extends GeneratedMessageLite<ChatReaded, Builder> implements ChatReadedOrBuilder {
        private static final ChatReaded DEFAULT_INSTANCE;
        private static volatile i860<ChatReaded> PARSER = null;
        public static final int SEQ_FIELD_NUMBER = 1;
        private long seq_;

        public static final class Builder extends GeneratedMessageLite.AbstractC3380b<ChatReaded, Builder> implements ChatReadedOrBuilder {
            private Builder() {
                super(ChatReaded.DEFAULT_INSTANCE);
            }

            public Builder clearSeq() {
                copyOnWrite();
                ((ChatReaded) this.instance).clearSeq();
                return this;
            }

            @Override // com.p1.mobile.longlink.msg.liveConnector.liveAuthMessageNew.ChatReadedOrBuilder
            public long getSeq() {
                return ((ChatReaded) this.instance).getSeq();
            }

            public Builder setSeq(long j) {
                copyOnWrite();
                ((ChatReaded) this.instance).setSeq(j);
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
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(chatReaded);
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

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            boolean z = false;
            switch (C44291.f15950xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new ChatReaded();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                    return null;
                case 4:
                    return new Builder();
                case 5:
                    GeneratedMessageLite.InterfaceC3386h interfaceC3386h = (GeneratedMessageLite.InterfaceC3386h) obj;
                    ChatReaded chatReaded = (ChatReaded) obj2;
                    long j = this.seq_;
                    boolean z2 = j != 0;
                    long j2 = chatReaded.seq_;
                    this.seq_ = interfaceC3386h.mo17000i(z2, j, j2 != 0, j2);
                    GeneratedMessageLite.C3385g c3385g = GeneratedMessageLite.C3385g.INSTANCE;
                    return this;
                case 6:
                    C3407e c3407e = (C3407e) obj;
                    while (!z) {
                        try {
                            int iM17116M = c3407e.m17116M();
                            if (iM17116M != 0) {
                                if (iM17116M == 8) {
                                    this.seq_ = c3407e.m17118O();
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
                        synchronized (ChatReaded.class) {
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

        @Override // com.p1.mobile.longlink.msg.liveConnector.liveAuthMessageNew.ChatReadedOrBuilder
        public long getSeq() {
            return this.seq_;
        }

        @Override // com.google.protobuf.InterfaceC3419q
        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            long j = this.seq_;
            int iM16906P = j != 0 ? CodedOutputStream.m16906P(1, j) : 0;
            this.memoizedSerializedSize = iM16906P;
            return iM16906P;
        }

        @Override // com.google.protobuf.InterfaceC3419q
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            long j = this.seq_;
            if (j != 0) {
                codedOutputStream.mo16944I0(1, j);
            }
        }

        public static ChatReaded parseDelimitedFrom(InputStream inputStream, C3410h c3410h) throws IOException {
            return (ChatReaded) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, c3410h);
        }

        public static ChatReaded parseFrom(ByteString byteString, C3410h c3410h) throws InvalidProtocolBufferException {
            return (ChatReaded) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, c3410h);
        }

        public static ChatReaded parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (ChatReaded) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static ChatReaded parseFrom(byte[] bArr, C3410h c3410h) throws InvalidProtocolBufferException {
            return (ChatReaded) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, c3410h);
        }

        public static ChatReaded parseFrom(InputStream inputStream) throws IOException {
            return (ChatReaded) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static ChatReaded parseFrom(InputStream inputStream, C3410h c3410h) throws IOException {
            return (ChatReaded) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, c3410h);
        }

        public static ChatReaded parseFrom(C3407e c3407e) throws IOException {
            return (ChatReaded) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, c3407e);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static ChatReaded parseFrom(C3407e c3407e, C3410h c3410h) throws IOException {
            return (ChatReaded) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, c3407e, c3410h);
        }
    }

    public enum ClientSourceEnum implements C3414l.c {
        CLIENT_SOURCE_ANDROID(0),
        CLIENT_SOURCE_IOS(1),
        CLIENT_SOURCE_WEB(2),
        UNRECOGNIZED(-1);

        public static final int CLIENT_SOURCE_ANDROID_VALUE = 0;
        public static final int CLIENT_SOURCE_IOS_VALUE = 1;
        public static final int CLIENT_SOURCE_WEB_VALUE = 2;
        private static final C3414l.d<ClientSourceEnum> internalValueMap = new C3414l.d<ClientSourceEnum>() { // from class: com.p1.mobile.longlink.msg.liveConnector.liveAuthMessageNew.ClientSourceEnum.1
            @Override // com.google.protobuf.C3414l.d
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

        public static C3414l.d<ClientSourceEnum> internalGetValueMap() {
            return internalValueMap;
        }

        @Override // com.google.protobuf.C3414l.c
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

        public static final class Builder extends GeneratedMessageLite.AbstractC3380b<Location, Builder> implements LocationOrBuilder {
            private Builder() {
                super(Location.DEFAULT_INSTANCE);
            }

            public Builder clearLat() {
                copyOnWrite();
                ((Location) this.instance).clearLat();
                return this;
            }

            public Builder clearLon() {
                copyOnWrite();
                ((Location) this.instance).clearLon();
                return this;
            }

            @Override // com.p1.mobile.longlink.msg.liveConnector.liveAuthMessageNew.LocationOrBuilder
            public float getLat() {
                return ((Location) this.instance).getLat();
            }

            @Override // com.p1.mobile.longlink.msg.liveConnector.liveAuthMessageNew.LocationOrBuilder
            public float getLon() {
                return ((Location) this.instance).getLon();
            }

            public Builder setLat(float f) {
                copyOnWrite();
                ((Location) this.instance).setLat(f);
                return this;
            }

            public Builder setLon(float f) {
                copyOnWrite();
                ((Location) this.instance).setLon(f);
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
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(location);
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

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            boolean z = false;
            switch (C44291.f15950xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new Location();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                    return null;
                case 4:
                    return new Builder();
                case 5:
                    GeneratedMessageLite.InterfaceC3386h interfaceC3386h = (GeneratedMessageLite.InterfaceC3386h) obj;
                    Location location = (Location) obj2;
                    float f = this.lon_;
                    boolean z2 = f != 0.0f;
                    float f2 = location.lon_;
                    this.lon_ = interfaceC3386h.mo17007p(z2, f, f2 != 0.0f, f2);
                    float f3 = this.lat_;
                    boolean z3 = f3 != 0.0f;
                    float f4 = location.lat_;
                    this.lat_ = interfaceC3386h.mo17007p(z3, f3, f4 != 0.0f, f4);
                    GeneratedMessageLite.C3385g c3385g = GeneratedMessageLite.C3385g.INSTANCE;
                    return this;
                case 6:
                    C3407e c3407e = (C3407e) obj;
                    while (!z) {
                        try {
                            int iM17116M = c3407e.m17116M();
                            if (iM17116M != 0) {
                                if (iM17116M == 13) {
                                    this.lon_ = c3407e.m17139s();
                                } else if (iM17116M == 21) {
                                    this.lat_ = c3407e.m17139s();
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
                        synchronized (Location.class) {
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

        @Override // com.p1.mobile.longlink.msg.liveConnector.liveAuthMessageNew.LocationOrBuilder
        public float getLat() {
            return this.lat_;
        }

        @Override // com.p1.mobile.longlink.msg.liveConnector.liveAuthMessageNew.LocationOrBuilder
        public float getLon() {
            return this.lon_;
        }

        @Override // com.google.protobuf.InterfaceC3419q
        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            float f = this.lon_;
            int iM16926q = f != 0.0f ? CodedOutputStream.m16926q(1, f) : 0;
            float f2 = this.lat_;
            if (f2 != 0.0f) {
                iM16926q += CodedOutputStream.m16926q(2, f2);
            }
            this.memoizedSerializedSize = iM16926q;
            return iM16926q;
        }

        @Override // com.google.protobuf.InterfaceC3419q
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            float f = this.lon_;
            if (f != 0.0f) {
                codedOutputStream.m16966o0(1, f);
            }
            float f2 = this.lat_;
            if (f2 != 0.0f) {
                codedOutputStream.m16966o0(2, f2);
            }
        }

        public static Location parseDelimitedFrom(InputStream inputStream, C3410h c3410h) throws IOException {
            return (Location) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, c3410h);
        }

        public static Location parseFrom(ByteString byteString, C3410h c3410h) throws InvalidProtocolBufferException {
            return (Location) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, c3410h);
        }

        public static Location parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (Location) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static Location parseFrom(byte[] bArr, C3410h c3410h) throws InvalidProtocolBufferException {
            return (Location) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, c3410h);
        }

        public static Location parseFrom(InputStream inputStream) throws IOException {
            return (Location) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Location parseFrom(InputStream inputStream, C3410h c3410h) throws IOException {
            return (Location) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, c3410h);
        }

        public static Location parseFrom(C3407e c3407e) throws IOException {
            return (Location) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, c3407e);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static Location parseFrom(C3407e c3407e, C3410h c3410h) throws IOException {
            return (Location) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, c3407e, c3410h);
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
                this.status_ = Status.newBuilder(this.status_).mergeFrom(status).buildPartial();
            }
        }

        public static Builder newBuilder(Msg msg) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(msg);
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
        public void setData(Any.C3366b c3366b) {
            this.data_ = c3366b.build();
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
            AbstractC3403a.checkByteStringIsUtf8(byteString);
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
            AbstractC3403a.checkByteStringIsUtf8(byteString);
            this.msgTypeName_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setStatus(Status.Builder builder) {
            this.status_ = builder.build();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setVersion(int i) {
            this.version_ = i;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            boolean z = false;
            switch (C44291.f15950xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new Msg();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                    return null;
                case 4:
                    return new Builder();
                case 5:
                    GeneratedMessageLite.InterfaceC3386h interfaceC3386h = (GeneratedMessageLite.InterfaceC3386h) obj;
                    Msg msg = (Msg) obj2;
                    int i = this.version_;
                    boolean z2 = i != 0;
                    int i2 = msg.version_;
                    this.version_ = interfaceC3386h.mo16996e(z2, i, i2 != 0, i2);
                    this.msgId_ = interfaceC3386h.mo16997f(!this.msgId_.isEmpty(), this.msgId_, !msg.msgId_.isEmpty(), msg.msgId_);
                    this.msgTypeName_ = interfaceC3386h.mo16997f(!this.msgTypeName_.isEmpty(), this.msgTypeName_, !msg.msgTypeName_.isEmpty(), msg.msgTypeName_);
                    boolean z3 = this.isResponse_;
                    boolean z4 = msg.isResponse_;
                    this.isResponse_ = interfaceC3386h.mo16995d(z3, z3, z4, z4);
                    this.status_ = (Status) interfaceC3386h.mo17006o(this.status_, msg.status_);
                    this.data_ = (Any) interfaceC3386h.mo17006o(this.data_, msg.data_);
                    GeneratedMessageLite.C3385g c3385g = GeneratedMessageLite.C3385g.INSTANCE;
                    return this;
                case 6:
                    C3407e c3407e = (C3407e) obj;
                    C3410h c3410h = (C3410h) obj2;
                    while (!z) {
                        try {
                            int iM17116M = c3407e.m17116M();
                            if (iM17116M != 0) {
                                if (iM17116M == 8) {
                                    this.version_ = c3407e.m17141u();
                                } else if (iM17116M == 18) {
                                    this.msgId_ = c3407e.m17115L();
                                } else if (iM17116M == 26) {
                                    this.msgTypeName_ = c3407e.m17115L();
                                } else if (iM17116M == 32) {
                                    this.isResponse_ = c3407e.m17133m();
                                } else if (iM17116M == 42) {
                                    Status status = this.status_;
                                    Status.Builder builder = status != null ? status.toBuilder() : null;
                                    Status status2 = (Status) c3407e.m17143w(Status.parser(), c3410h);
                                    this.status_ = status2;
                                    if (builder != null) {
                                        builder.mergeFrom(status2);
                                        this.status_ = builder.buildPartial();
                                    }
                                } else if (iM17116M == 50) {
                                    Any any = this.data_;
                                    Any.C3366b builder2 = any != null ? any.toBuilder() : null;
                                    Any any2 = (Any) c3407e.m17143w(Any.parser(), c3410h);
                                    this.data_ = any2;
                                    if (builder2 != null) {
                                        builder2.mergeFrom(any2);
                                        this.data_ = builder2.buildPartial();
                                    }
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
                        synchronized (Msg.class) {
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

        @Override // com.google.protobuf.InterfaceC3419q
        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int i2 = this.version_;
            int iM16929t = i2 != 0 ? CodedOutputStream.m16929t(1, i2) : 0;
            if (!this.msgId_.isEmpty()) {
                iM16929t += CodedOutputStream.m16901K(2, getMsgId());
            }
            if (!this.msgTypeName_.isEmpty()) {
                iM16929t += CodedOutputStream.m16901K(3, getMsgTypeName());
            }
            boolean z = this.isResponse_;
            if (z) {
                iM16929t += CodedOutputStream.m16915f(4, z);
            }
            if (this.status_ != null) {
                iM16929t += CodedOutputStream.m16893C(5, getStatus());
            }
            if (this.data_ != null) {
                iM16929t += CodedOutputStream.m16893C(6, getData());
            }
            this.memoizedSerializedSize = iM16929t;
            return iM16929t;
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

        @Override // com.google.protobuf.InterfaceC3419q
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            int i = this.version_;
            if (i != 0) {
                codedOutputStream.mo16970s0(1, i);
            }
            if (!this.msgId_.isEmpty()) {
                codedOutputStream.mo16939D0(2, getMsgId());
            }
            if (!this.msgTypeName_.isEmpty()) {
                codedOutputStream.mo16939D0(3, getMsgTypeName());
            }
            boolean z = this.isResponse_;
            if (z) {
                codedOutputStream.mo16950a0(4, z);
            }
            if (this.status_ != null) {
                codedOutputStream.mo16974w0(5, getStatus());
            }
            if (this.data_ != null) {
                codedOutputStream.mo16974w0(6, getData());
            }
        }

        public static Msg parseDelimitedFrom(InputStream inputStream, C3410h c3410h) throws IOException {
            return (Msg) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, c3410h);
        }

        public static Msg parseFrom(ByteString byteString, C3410h c3410h) throws InvalidProtocolBufferException {
            return (Msg) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, c3410h);
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

        public static final class Builder extends GeneratedMessageLite.AbstractC3380b<Msg, Builder> implements MsgOrBuilder {
            private Builder() {
                super(Msg.DEFAULT_INSTANCE);
            }

            public Builder clearData() {
                copyOnWrite();
                ((Msg) this.instance).clearData();
                return this;
            }

            public Builder clearIsResponse() {
                copyOnWrite();
                ((Msg) this.instance).clearIsResponse();
                return this;
            }

            public Builder clearMsgId() {
                copyOnWrite();
                ((Msg) this.instance).clearMsgId();
                return this;
            }

            public Builder clearMsgTypeName() {
                copyOnWrite();
                ((Msg) this.instance).clearMsgTypeName();
                return this;
            }

            public Builder clearStatus() {
                copyOnWrite();
                ((Msg) this.instance).clearStatus();
                return this;
            }

            public Builder clearVersion() {
                copyOnWrite();
                ((Msg) this.instance).clearVersion();
                return this;
            }

            @Override // com.p1.mobile.longlink.msg.liveConnector.liveAuthMessageNew.MsgOrBuilder
            public Any getData() {
                return ((Msg) this.instance).getData();
            }

            @Override // com.p1.mobile.longlink.msg.liveConnector.liveAuthMessageNew.MsgOrBuilder
            public boolean getIsResponse() {
                return ((Msg) this.instance).getIsResponse();
            }

            @Override // com.p1.mobile.longlink.msg.liveConnector.liveAuthMessageNew.MsgOrBuilder
            public String getMsgId() {
                return ((Msg) this.instance).getMsgId();
            }

            @Override // com.p1.mobile.longlink.msg.liveConnector.liveAuthMessageNew.MsgOrBuilder
            public ByteString getMsgIdBytes() {
                return ((Msg) this.instance).getMsgIdBytes();
            }

            @Override // com.p1.mobile.longlink.msg.liveConnector.liveAuthMessageNew.MsgOrBuilder
            public String getMsgTypeName() {
                return ((Msg) this.instance).getMsgTypeName();
            }

            @Override // com.p1.mobile.longlink.msg.liveConnector.liveAuthMessageNew.MsgOrBuilder
            public ByteString getMsgTypeNameBytes() {
                return ((Msg) this.instance).getMsgTypeNameBytes();
            }

            @Override // com.p1.mobile.longlink.msg.liveConnector.liveAuthMessageNew.MsgOrBuilder
            public Status getStatus() {
                return ((Msg) this.instance).getStatus();
            }

            @Override // com.p1.mobile.longlink.msg.liveConnector.liveAuthMessageNew.MsgOrBuilder
            public int getVersion() {
                return ((Msg) this.instance).getVersion();
            }

            @Override // com.p1.mobile.longlink.msg.liveConnector.liveAuthMessageNew.MsgOrBuilder
            public boolean hasData() {
                return ((Msg) this.instance).hasData();
            }

            @Override // com.p1.mobile.longlink.msg.liveConnector.liveAuthMessageNew.MsgOrBuilder
            public boolean hasStatus() {
                return ((Msg) this.instance).hasStatus();
            }

            public Builder mergeData(Any any) {
                copyOnWrite();
                ((Msg) this.instance).mergeData(any);
                return this;
            }

            public Builder mergeStatus(Status status) {
                copyOnWrite();
                ((Msg) this.instance).mergeStatus(status);
                return this;
            }

            public Builder setData(Any any) {
                copyOnWrite();
                ((Msg) this.instance).setData(any);
                return this;
            }

            public Builder setIsResponse(boolean z) {
                copyOnWrite();
                ((Msg) this.instance).setIsResponse(z);
                return this;
            }

            public Builder setMsgId(String str) {
                copyOnWrite();
                ((Msg) this.instance).setMsgId(str);
                return this;
            }

            public Builder setMsgIdBytes(ByteString byteString) {
                copyOnWrite();
                ((Msg) this.instance).setMsgIdBytes(byteString);
                return this;
            }

            public Builder setMsgTypeName(String str) {
                copyOnWrite();
                ((Msg) this.instance).setMsgTypeName(str);
                return this;
            }

            public Builder setMsgTypeNameBytes(ByteString byteString) {
                copyOnWrite();
                ((Msg) this.instance).setMsgTypeNameBytes(byteString);
                return this;
            }

            public Builder setStatus(Status status) {
                copyOnWrite();
                ((Msg) this.instance).setStatus(status);
                return this;
            }

            public Builder setVersion(int i) {
                copyOnWrite();
                ((Msg) this.instance).setVersion(i);
                return this;
            }

            public Builder setData(Any.C3366b c3366b) {
                copyOnWrite();
                ((Msg) this.instance).setData(c3366b);
                return this;
            }

            public Builder setStatus(Status.Builder builder) {
                copyOnWrite();
                ((Msg) this.instance).setStatus(builder);
                return this;
            }
        }

        public static Msg parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (Msg) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static Msg parseFrom(byte[] bArr, C3410h c3410h) throws InvalidProtocolBufferException {
            return (Msg) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, c3410h);
        }

        public static Msg parseFrom(InputStream inputStream) throws IOException {
            return (Msg) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Msg parseFrom(InputStream inputStream, C3410h c3410h) throws IOException {
            return (Msg) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, c3410h);
        }

        public static Msg parseFrom(C3407e c3407e) throws IOException {
            return (Msg) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, c3407e);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static Msg parseFrom(C3407e c3407e, C3410h c3410h) throws IOException {
            return (Msg) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, c3407e, c3410h);
        }
    }

    public static final class Msgs extends GeneratedMessageLite<Msgs, Builder> implements MsgsOrBuilder {
        private static final Msgs DEFAULT_INSTANCE;
        public static final int MSGS_FIELD_NUMBER = 1;
        private static volatile i860<Msgs> PARSER;
        private C3414l.h<Msg> msgs_ = GeneratedMessageLite.emptyProtobufList();

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
            AbstractC3403a.addAll(iterable, this.msgs_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addMsgs(Msg.Builder builder) {
            ensureMsgsIsMutable();
            this.msgs_.add(builder.build());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearMsgs() {
            this.msgs_ = GeneratedMessageLite.emptyProtobufList();
        }

        private void ensureMsgsIsMutable() {
            if (this.msgs_.mo17085q()) {
                return;
            }
            this.msgs_ = GeneratedMessageLite.mutableCopy(this.msgs_);
        }

        public static Msgs getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder(Msgs msgs) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(msgs);
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
            this.msgs_.set(i, builder.build());
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (C44291.f15950xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new Msgs();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                    this.msgs_.mo17084n();
                    return null;
                case 4:
                    return new Builder();
                case 5:
                    this.msgs_ = ((GeneratedMessageLite.InterfaceC3386h) obj).mo16998g(this.msgs_, ((Msgs) obj2).msgs_);
                    GeneratedMessageLite.C3385g c3385g = GeneratedMessageLite.C3385g.INSTANCE;
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
                                    if (!this.msgs_.mo17085q()) {
                                        this.msgs_ = GeneratedMessageLite.mutableCopy(this.msgs_);
                                    }
                                    this.msgs_.add((Msg) c3407e.m17143w(Msg.parser(), c3410h));
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
                        synchronized (Msgs.class) {
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

        @Override // com.p1.mobile.longlink.msg.liveConnector.liveAuthMessageNew.MsgsOrBuilder
        public Msg getMsgs(int i) {
            return this.msgs_.get(i);
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
            return this.msgs_.get(i);
        }

        public List<? extends MsgOrBuilder> getMsgsOrBuilderList() {
            return this.msgs_;
        }

        @Override // com.google.protobuf.InterfaceC3419q
        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int iM16893C = 0;
            for (int i2 = 0; i2 < this.msgs_.size(); i2++) {
                iM16893C += CodedOutputStream.m16893C(1, this.msgs_.get(i2));
            }
            this.memoizedSerializedSize = iM16893C;
            return iM16893C;
        }

        @Override // com.google.protobuf.InterfaceC3419q
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            for (int i = 0; i < this.msgs_.size(); i++) {
                codedOutputStream.mo16974w0(1, this.msgs_.get(i));
            }
        }

        public static Msgs parseDelimitedFrom(InputStream inputStream, C3410h c3410h) throws IOException {
            return (Msgs) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, c3410h);
        }

        public static Msgs parseFrom(ByteString byteString, C3410h c3410h) throws InvalidProtocolBufferException {
            return (Msgs) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, c3410h);
        }

        public static final class Builder extends GeneratedMessageLite.AbstractC3380b<Msgs, Builder> implements MsgsOrBuilder {
            private Builder() {
                super(Msgs.DEFAULT_INSTANCE);
            }

            public Builder addAllMsgs(Iterable<? extends Msg> iterable) {
                copyOnWrite();
                ((Msgs) this.instance).addAllMsgs(iterable);
                return this;
            }

            public Builder addMsgs(Msg msg) {
                copyOnWrite();
                ((Msgs) this.instance).addMsgs(msg);
                return this;
            }

            public Builder clearMsgs() {
                copyOnWrite();
                ((Msgs) this.instance).clearMsgs();
                return this;
            }

            @Override // com.p1.mobile.longlink.msg.liveConnector.liveAuthMessageNew.MsgsOrBuilder
            public Msg getMsgs(int i) {
                return ((Msgs) this.instance).getMsgs(i);
            }

            @Override // com.p1.mobile.longlink.msg.liveConnector.liveAuthMessageNew.MsgsOrBuilder
            public int getMsgsCount() {
                return ((Msgs) this.instance).getMsgsCount();
            }

            @Override // com.p1.mobile.longlink.msg.liveConnector.liveAuthMessageNew.MsgsOrBuilder
            public List<Msg> getMsgsList() {
                return Collections.unmodifiableList(((Msgs) this.instance).getMsgsList());
            }

            public Builder removeMsgs(int i) {
                copyOnWrite();
                ((Msgs) this.instance).removeMsgs(i);
                return this;
            }

            public Builder setMsgs(int i, Msg msg) {
                copyOnWrite();
                ((Msgs) this.instance).setMsgs(i, msg);
                return this;
            }

            public Builder addMsgs(int i, Msg msg) {
                copyOnWrite();
                ((Msgs) this.instance).addMsgs(i, msg);
                return this;
            }

            public Builder setMsgs(int i, Msg.Builder builder) {
                copyOnWrite();
                ((Msgs) this.instance).setMsgs(i, builder);
                return this;
            }

            public Builder addMsgs(Msg.Builder builder) {
                copyOnWrite();
                ((Msgs) this.instance).addMsgs(builder);
                return this;
            }

            public Builder addMsgs(int i, Msg.Builder builder) {
                copyOnWrite();
                ((Msgs) this.instance).addMsgs(i, builder);
                return this;
            }
        }

        public static Msgs parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (Msgs) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static Msgs parseFrom(byte[] bArr, C3410h c3410h) throws InvalidProtocolBufferException {
            return (Msgs) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, c3410h);
        }

        public static Msgs parseFrom(InputStream inputStream) throws IOException {
            return (Msgs) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Msgs parseFrom(InputStream inputStream, C3410h c3410h) throws IOException {
            return (Msgs) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, c3410h);
        }

        public static Msgs parseFrom(C3407e c3407e) throws IOException {
            return (Msgs) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, c3407e);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addMsgs(int i, Msg msg) {
            msg.getClass();
            ensureMsgsIsMutable();
            this.msgs_.add(i, msg);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static Msgs parseFrom(C3407e c3407e, C3410h c3410h) throws IOException {
            return (Msgs) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, c3407e, c3410h);
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
            this.msgs_.add(i, builder.build());
        }
    }

    public static final class MultiDevice extends GeneratedMessageLite<MultiDevice, Builder> implements MultiDeviceOrBuilder {
        private static final MultiDevice DEFAULT_INSTANCE;
        public static final int MSG_FIELD_NUMBER = 1;
        private static volatile i860<MultiDevice> PARSER;
        private ByteString msg_ = ByteString.EMPTY;

        public static final class Builder extends GeneratedMessageLite.AbstractC3380b<MultiDevice, Builder> implements MultiDeviceOrBuilder {
            private Builder() {
                super(MultiDevice.DEFAULT_INSTANCE);
            }

            public Builder clearMsg() {
                copyOnWrite();
                ((MultiDevice) this.instance).clearMsg();
                return this;
            }

            @Override // com.p1.mobile.longlink.msg.liveConnector.liveAuthMessageNew.MultiDeviceOrBuilder
            public ByteString getMsg() {
                return ((MultiDevice) this.instance).getMsg();
            }

            public Builder setMsg(ByteString byteString) {
                copyOnWrite();
                ((MultiDevice) this.instance).setMsg(byteString);
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
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(multiDevice);
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

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            boolean z = false;
            switch (C44291.f15950xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new MultiDevice();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                    return null;
                case 4:
                    return new Builder();
                case 5:
                    GeneratedMessageLite.InterfaceC3386h interfaceC3386h = (GeneratedMessageLite.InterfaceC3386h) obj;
                    MultiDevice multiDevice = (MultiDevice) obj2;
                    ByteString byteString = this.msg_;
                    ByteString byteString2 = ByteString.EMPTY;
                    boolean z2 = byteString != byteString2;
                    ByteString byteString3 = multiDevice.msg_;
                    this.msg_ = interfaceC3386h.mo16999h(z2, byteString, byteString3 != byteString2, byteString3);
                    GeneratedMessageLite.C3385g c3385g = GeneratedMessageLite.C3385g.INSTANCE;
                    return this;
                case 6:
                    C3407e c3407e = (C3407e) obj;
                    while (!z) {
                        try {
                            int iM17116M = c3407e.m17116M();
                            if (iM17116M != 0) {
                                if (iM17116M == 10) {
                                    this.msg_ = c3407e.m17134n();
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
                        synchronized (MultiDevice.class) {
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

        @Override // com.p1.mobile.longlink.msg.liveConnector.liveAuthMessageNew.MultiDeviceOrBuilder
        public ByteString getMsg() {
            return this.msg_;
        }

        @Override // com.google.protobuf.InterfaceC3419q
        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int iM16918i = !this.msg_.isEmpty() ? CodedOutputStream.m16918i(1, this.msg_) : 0;
            this.memoizedSerializedSize = iM16918i;
            return iM16918i;
        }

        @Override // com.google.protobuf.InterfaceC3419q
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (this.msg_.isEmpty()) {
                return;
            }
            codedOutputStream.mo16956e0(1, this.msg_);
        }

        public static MultiDevice parseDelimitedFrom(InputStream inputStream, C3410h c3410h) throws IOException {
            return (MultiDevice) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, c3410h);
        }

        public static MultiDevice parseFrom(ByteString byteString, C3410h c3410h) throws InvalidProtocolBufferException {
            return (MultiDevice) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, c3410h);
        }

        public static MultiDevice parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (MultiDevice) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static MultiDevice parseFrom(byte[] bArr, C3410h c3410h) throws InvalidProtocolBufferException {
            return (MultiDevice) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, c3410h);
        }

        public static MultiDevice parseFrom(InputStream inputStream) throws IOException {
            return (MultiDevice) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static MultiDevice parseFrom(InputStream inputStream, C3410h c3410h) throws IOException {
            return (MultiDevice) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, c3410h);
        }

        public static MultiDevice parseFrom(C3407e c3407e) throws IOException {
            return (MultiDevice) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, c3407e);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static MultiDevice parseFrom(C3407e c3407e, C3410h c3410h) throws IOException {
            return (MultiDevice) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, c3407e, c3410h);
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

        public static final class Builder extends GeneratedMessageLite.AbstractC3380b<Status, Builder> implements StatusOrBuilder {
            private Builder() {
                super(Status.DEFAULT_INSTANCE);
            }

            public Builder clearNeedAck() {
                copyOnWrite();
                ((Status) this.instance).clearNeedAck();
                return this;
            }

            public Builder clearRecvTs() {
                copyOnWrite();
                ((Status) this.instance).clearRecvTs();
                return this;
            }

            public Builder clearStatus() {
                copyOnWrite();
                ((Status) this.instance).clearStatus();
                return this;
            }

            @Override // com.p1.mobile.longlink.msg.liveConnector.liveAuthMessageNew.StatusOrBuilder
            public boolean getNeedAck() {
                return ((Status) this.instance).getNeedAck();
            }

            @Override // com.p1.mobile.longlink.msg.liveConnector.liveAuthMessageNew.StatusOrBuilder
            public long getRecvTs() {
                return ((Status) this.instance).getRecvTs();
            }

            @Override // com.p1.mobile.longlink.msg.liveConnector.liveAuthMessageNew.StatusOrBuilder
            public int getStatus() {
                return ((Status) this.instance).getStatus();
            }

            public Builder setNeedAck(boolean z) {
                copyOnWrite();
                ((Status) this.instance).setNeedAck(z);
                return this;
            }

            public Builder setRecvTs(long j) {
                copyOnWrite();
                ((Status) this.instance).setRecvTs(j);
                return this;
            }

            public Builder setStatus(int i) {
                copyOnWrite();
                ((Status) this.instance).setStatus(i);
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
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(status);
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

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            boolean z = false;
            switch (C44291.f15950xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new Status();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                    return null;
                case 4:
                    return new Builder();
                case 5:
                    GeneratedMessageLite.InterfaceC3386h interfaceC3386h = (GeneratedMessageLite.InterfaceC3386h) obj;
                    Status status = (Status) obj2;
                    long j = this.recvTs_;
                    boolean z2 = j != 0;
                    long j2 = status.recvTs_;
                    this.recvTs_ = interfaceC3386h.mo17000i(z2, j, j2 != 0, j2);
                    int i = this.status_;
                    boolean z3 = i != 0;
                    int i2 = status.status_;
                    this.status_ = interfaceC3386h.mo16996e(z3, i, i2 != 0, i2);
                    boolean z4 = this.needAck_;
                    boolean z5 = status.needAck_;
                    this.needAck_ = interfaceC3386h.mo16995d(z4, z4, z5, z5);
                    GeneratedMessageLite.C3385g c3385g = GeneratedMessageLite.C3385g.INSTANCE;
                    return this;
                case 6:
                    C3407e c3407e = (C3407e) obj;
                    while (!z) {
                        try {
                            int iM17116M = c3407e.m17116M();
                            if (iM17116M != 0) {
                                if (iM17116M == 8) {
                                    this.recvTs_ = c3407e.m17142v();
                                } else if (iM17116M == 16) {
                                    this.status_ = c3407e.m17141u();
                                } else if (iM17116M == 24) {
                                    this.needAck_ = c3407e.m17133m();
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
                        synchronized (Status.class) {
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

        @Override // com.p1.mobile.longlink.msg.liveConnector.liveAuthMessageNew.StatusOrBuilder
        public boolean getNeedAck() {
            return this.needAck_;
        }

        @Override // com.p1.mobile.longlink.msg.liveConnector.liveAuthMessageNew.StatusOrBuilder
        public long getRecvTs() {
            return this.recvTs_;
        }

        @Override // com.google.protobuf.InterfaceC3419q
        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            long j = this.recvTs_;
            int iM16931v = j != 0 ? CodedOutputStream.m16931v(1, j) : 0;
            int i2 = this.status_;
            if (i2 != 0) {
                iM16931v += CodedOutputStream.m16929t(2, i2);
            }
            boolean z = this.needAck_;
            if (z) {
                iM16931v += CodedOutputStream.m16915f(3, z);
            }
            this.memoizedSerializedSize = iM16931v;
            return iM16931v;
        }

        @Override // com.p1.mobile.longlink.msg.liveConnector.liveAuthMessageNew.StatusOrBuilder
        public int getStatus() {
            return this.status_;
        }

        @Override // com.google.protobuf.InterfaceC3419q
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            long j = this.recvTs_;
            if (j != 0) {
                codedOutputStream.m16972u0(1, j);
            }
            int i = this.status_;
            if (i != 0) {
                codedOutputStream.mo16970s0(2, i);
            }
            boolean z = this.needAck_;
            if (z) {
                codedOutputStream.mo16950a0(3, z);
            }
        }

        public static Status parseDelimitedFrom(InputStream inputStream, C3410h c3410h) throws IOException {
            return (Status) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, c3410h);
        }

        public static Status parseFrom(ByteString byteString, C3410h c3410h) throws InvalidProtocolBufferException {
            return (Status) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, c3410h);
        }

        public static Status parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (Status) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static Status parseFrom(byte[] bArr, C3410h c3410h) throws InvalidProtocolBufferException {
            return (Status) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, c3410h);
        }

        public static Status parseFrom(InputStream inputStream) throws IOException {
            return (Status) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Status parseFrom(InputStream inputStream, C3410h c3410h) throws IOException {
            return (Status) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, c3410h);
        }

        public static Status parseFrom(C3407e c3407e) throws IOException {
            return (Status) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, c3407e);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static Status parseFrom(C3407e c3407e, C3410h c3410h) throws IOException {
            return (Status) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, c3407e, c3410h);
        }
    }

    public static final class SwitchSide extends GeneratedMessageLite<SwitchSide, Builder> implements SwitchSideOrBuilder {
        private static final SwitchSide DEFAULT_INSTANCE;
        private static volatile i860<SwitchSide> PARSER = null;
        public static final int TOSIDE_FIELD_NUMBER = 1;
        private int toSide_;

        public static final class Builder extends GeneratedMessageLite.AbstractC3380b<SwitchSide, Builder> implements SwitchSideOrBuilder {
            private Builder() {
                super(SwitchSide.DEFAULT_INSTANCE);
            }

            public Builder clearToSide() {
                copyOnWrite();
                ((SwitchSide) this.instance).clearToSide();
                return this;
            }

            @Override // com.p1.mobile.longlink.msg.liveConnector.liveAuthMessageNew.SwitchSideOrBuilder
            public AppStaySideEnum getToSide() {
                return ((SwitchSide) this.instance).getToSide();
            }

            @Override // com.p1.mobile.longlink.msg.liveConnector.liveAuthMessageNew.SwitchSideOrBuilder
            public int getToSideValue() {
                return ((SwitchSide) this.instance).getToSideValue();
            }

            public Builder setToSide(AppStaySideEnum appStaySideEnum) {
                copyOnWrite();
                ((SwitchSide) this.instance).setToSide(appStaySideEnum);
                return this;
            }

            public Builder setToSideValue(int i) {
                copyOnWrite();
                ((SwitchSide) this.instance).setToSideValue(i);
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
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(switchSide);
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

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            boolean z = false;
            switch (C44291.f15950xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new SwitchSide();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                    return null;
                case 4:
                    return new Builder();
                case 5:
                    GeneratedMessageLite.InterfaceC3386h interfaceC3386h = (GeneratedMessageLite.InterfaceC3386h) obj;
                    SwitchSide switchSide = (SwitchSide) obj2;
                    int i = this.toSide_;
                    boolean z2 = i != 0;
                    int i2 = switchSide.toSide_;
                    this.toSide_ = interfaceC3386h.mo16996e(z2, i, i2 != 0, i2);
                    GeneratedMessageLite.C3385g c3385g = GeneratedMessageLite.C3385g.INSTANCE;
                    return this;
                case 6:
                    C3407e c3407e = (C3407e) obj;
                    while (!z) {
                        try {
                            int iM17116M = c3407e.m17116M();
                            if (iM17116M != 0) {
                                if (iM17116M == 8) {
                                    this.toSide_ = c3407e.m17136p();
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
                        synchronized (SwitchSide.class) {
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

        @Override // com.google.protobuf.InterfaceC3419q
        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int iM16922m = this.toSide_ != AppStaySideEnum.APP_STAY_SIDE_FOREGROUND.getNumber() ? CodedOutputStream.m16922m(1, this.toSide_) : 0;
            this.memoizedSerializedSize = iM16922m;
            return iM16922m;
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

        @Override // com.google.protobuf.InterfaceC3419q
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (this.toSide_ != AppStaySideEnum.APP_STAY_SIDE_FOREGROUND.getNumber()) {
                codedOutputStream.m16960i0(1, this.toSide_);
            }
        }

        public static SwitchSide parseDelimitedFrom(InputStream inputStream, C3410h c3410h) throws IOException {
            return (SwitchSide) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, c3410h);
        }

        public static SwitchSide parseFrom(ByteString byteString, C3410h c3410h) throws InvalidProtocolBufferException {
            return (SwitchSide) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, c3410h);
        }

        public static SwitchSide parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (SwitchSide) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static SwitchSide parseFrom(byte[] bArr, C3410h c3410h) throws InvalidProtocolBufferException {
            return (SwitchSide) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, c3410h);
        }

        public static SwitchSide parseFrom(InputStream inputStream) throws IOException {
            return (SwitchSide) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static SwitchSide parseFrom(InputStream inputStream, C3410h c3410h) throws IOException {
            return (SwitchSide) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, c3410h);
        }

        public static SwitchSide parseFrom(C3407e c3407e) throws IOException {
            return (SwitchSide) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, c3407e);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static SwitchSide parseFrom(C3407e c3407e, C3410h c3410h) throws IOException {
            return (SwitchSide) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, c3407e, c3410h);
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

        public static final class Builder extends GeneratedMessageLite.AbstractC3380b<UserAgent, Builder> implements UserAgentOrBuilder {
            private Builder() {
                super(UserAgent.DEFAULT_INSTANCE);
            }

            public Builder clearAppVersion() {
                copyOnWrite();
                ((UserAgent) this.instance).clearAppVersion();
                return this;
            }

            public Builder clearBrand() {
                copyOnWrite();
                ((UserAgent) this.instance).clearBrand();
                return this;
            }

            public Builder clearModel() {
                copyOnWrite();
                ((UserAgent) this.instance).clearModel();
                return this;
            }

            public Builder clearSource() {
                copyOnWrite();
                ((UserAgent) this.instance).clearSource();
                return this;
            }

            public Builder clearSourceVersion() {
                copyOnWrite();
                ((UserAgent) this.instance).clearSourceVersion();
                return this;
            }

            @Override // com.p1.mobile.longlink.msg.liveConnector.liveAuthMessageNew.UserAgentOrBuilder
            public String getAppVersion() {
                return ((UserAgent) this.instance).getAppVersion();
            }

            @Override // com.p1.mobile.longlink.msg.liveConnector.liveAuthMessageNew.UserAgentOrBuilder
            public ByteString getAppVersionBytes() {
                return ((UserAgent) this.instance).getAppVersionBytes();
            }

            @Override // com.p1.mobile.longlink.msg.liveConnector.liveAuthMessageNew.UserAgentOrBuilder
            public String getBrand() {
                return ((UserAgent) this.instance).getBrand();
            }

            @Override // com.p1.mobile.longlink.msg.liveConnector.liveAuthMessageNew.UserAgentOrBuilder
            public ByteString getBrandBytes() {
                return ((UserAgent) this.instance).getBrandBytes();
            }

            @Override // com.p1.mobile.longlink.msg.liveConnector.liveAuthMessageNew.UserAgentOrBuilder
            public String getModel() {
                return ((UserAgent) this.instance).getModel();
            }

            @Override // com.p1.mobile.longlink.msg.liveConnector.liveAuthMessageNew.UserAgentOrBuilder
            public ByteString getModelBytes() {
                return ((UserAgent) this.instance).getModelBytes();
            }

            @Override // com.p1.mobile.longlink.msg.liveConnector.liveAuthMessageNew.UserAgentOrBuilder
            public ClientSourceEnum getSource() {
                return ((UserAgent) this.instance).getSource();
            }

            @Override // com.p1.mobile.longlink.msg.liveConnector.liveAuthMessageNew.UserAgentOrBuilder
            public int getSourceValue() {
                return ((UserAgent) this.instance).getSourceValue();
            }

            @Override // com.p1.mobile.longlink.msg.liveConnector.liveAuthMessageNew.UserAgentOrBuilder
            public String getSourceVersion() {
                return ((UserAgent) this.instance).getSourceVersion();
            }

            @Override // com.p1.mobile.longlink.msg.liveConnector.liveAuthMessageNew.UserAgentOrBuilder
            public ByteString getSourceVersionBytes() {
                return ((UserAgent) this.instance).getSourceVersionBytes();
            }

            public Builder setAppVersion(String str) {
                copyOnWrite();
                ((UserAgent) this.instance).setAppVersion(str);
                return this;
            }

            public Builder setAppVersionBytes(ByteString byteString) {
                copyOnWrite();
                ((UserAgent) this.instance).setAppVersionBytes(byteString);
                return this;
            }

            public Builder setBrand(String str) {
                copyOnWrite();
                ((UserAgent) this.instance).setBrand(str);
                return this;
            }

            public Builder setBrandBytes(ByteString byteString) {
                copyOnWrite();
                ((UserAgent) this.instance).setBrandBytes(byteString);
                return this;
            }

            public Builder setModel(String str) {
                copyOnWrite();
                ((UserAgent) this.instance).setModel(str);
                return this;
            }

            public Builder setModelBytes(ByteString byteString) {
                copyOnWrite();
                ((UserAgent) this.instance).setModelBytes(byteString);
                return this;
            }

            public Builder setSource(ClientSourceEnum clientSourceEnum) {
                copyOnWrite();
                ((UserAgent) this.instance).setSource(clientSourceEnum);
                return this;
            }

            public Builder setSourceValue(int i) {
                copyOnWrite();
                ((UserAgent) this.instance).setSourceValue(i);
                return this;
            }

            public Builder setSourceVersion(String str) {
                copyOnWrite();
                ((UserAgent) this.instance).setSourceVersion(str);
                return this;
            }

            public Builder setSourceVersionBytes(ByteString byteString) {
                copyOnWrite();
                ((UserAgent) this.instance).setSourceVersionBytes(byteString);
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
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(userAgent);
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
            AbstractC3403a.checkByteStringIsUtf8(byteString);
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
            AbstractC3403a.checkByteStringIsUtf8(byteString);
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
            AbstractC3403a.checkByteStringIsUtf8(byteString);
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
            AbstractC3403a.checkByteStringIsUtf8(byteString);
            this.sourceVersion_ = byteString.toStringUtf8();
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            boolean z = false;
            switch (C44291.f15950xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new UserAgent();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                    return null;
                case 4:
                    return new Builder();
                case 5:
                    GeneratedMessageLite.InterfaceC3386h interfaceC3386h = (GeneratedMessageLite.InterfaceC3386h) obj;
                    UserAgent userAgent = (UserAgent) obj2;
                    int i = this.source_;
                    boolean z2 = i != 0;
                    int i2 = userAgent.source_;
                    this.source_ = interfaceC3386h.mo16996e(z2, i, i2 != 0, i2);
                    this.appVersion_ = interfaceC3386h.mo16997f(!this.appVersion_.isEmpty(), this.appVersion_, !userAgent.appVersion_.isEmpty(), userAgent.appVersion_);
                    this.sourceVersion_ = interfaceC3386h.mo16997f(!this.sourceVersion_.isEmpty(), this.sourceVersion_, !userAgent.sourceVersion_.isEmpty(), userAgent.sourceVersion_);
                    this.brand_ = interfaceC3386h.mo16997f(!this.brand_.isEmpty(), this.brand_, !userAgent.brand_.isEmpty(), userAgent.brand_);
                    this.model_ = interfaceC3386h.mo16997f(!this.model_.isEmpty(), this.model_, !userAgent.model_.isEmpty(), userAgent.model_);
                    GeneratedMessageLite.C3385g c3385g = GeneratedMessageLite.C3385g.INSTANCE;
                    return this;
                case 6:
                    C3407e c3407e = (C3407e) obj;
                    while (!z) {
                        try {
                            int iM17116M = c3407e.m17116M();
                            if (iM17116M != 0) {
                                if (iM17116M == 8) {
                                    this.source_ = c3407e.m17136p();
                                } else if (iM17116M == 18) {
                                    this.appVersion_ = c3407e.m17115L();
                                } else if (iM17116M == 26) {
                                    this.sourceVersion_ = c3407e.m17115L();
                                } else if (iM17116M == 34) {
                                    this.brand_ = c3407e.m17115L();
                                } else if (iM17116M == 42) {
                                    this.model_ = c3407e.m17115L();
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
                        synchronized (UserAgent.class) {
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

        @Override // com.google.protobuf.InterfaceC3419q
        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int iM16922m = this.source_ != ClientSourceEnum.CLIENT_SOURCE_ANDROID.getNumber() ? CodedOutputStream.m16922m(1, this.source_) : 0;
            if (!this.appVersion_.isEmpty()) {
                iM16922m += CodedOutputStream.m16901K(2, getAppVersion());
            }
            if (!this.sourceVersion_.isEmpty()) {
                iM16922m += CodedOutputStream.m16901K(3, getSourceVersion());
            }
            if (!this.brand_.isEmpty()) {
                iM16922m += CodedOutputStream.m16901K(4, getBrand());
            }
            if (!this.model_.isEmpty()) {
                iM16922m += CodedOutputStream.m16901K(5, getModel());
            }
            this.memoizedSerializedSize = iM16922m;
            return iM16922m;
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

        @Override // com.google.protobuf.InterfaceC3419q
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (this.source_ != ClientSourceEnum.CLIENT_SOURCE_ANDROID.getNumber()) {
                codedOutputStream.m16960i0(1, this.source_);
            }
            if (!this.appVersion_.isEmpty()) {
                codedOutputStream.mo16939D0(2, getAppVersion());
            }
            if (!this.sourceVersion_.isEmpty()) {
                codedOutputStream.mo16939D0(3, getSourceVersion());
            }
            if (!this.brand_.isEmpty()) {
                codedOutputStream.mo16939D0(4, getBrand());
            }
            if (this.model_.isEmpty()) {
                return;
            }
            codedOutputStream.mo16939D0(5, getModel());
        }

        public static UserAgent parseDelimitedFrom(InputStream inputStream, C3410h c3410h) throws IOException {
            return (UserAgent) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, c3410h);
        }

        public static UserAgent parseFrom(ByteString byteString, C3410h c3410h) throws InvalidProtocolBufferException {
            return (UserAgent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, c3410h);
        }

        public static UserAgent parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (UserAgent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static UserAgent parseFrom(byte[] bArr, C3410h c3410h) throws InvalidProtocolBufferException {
            return (UserAgent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, c3410h);
        }

        public static UserAgent parseFrom(InputStream inputStream) throws IOException {
            return (UserAgent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static UserAgent parseFrom(InputStream inputStream, C3410h c3410h) throws IOException {
            return (UserAgent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, c3410h);
        }

        public static UserAgent parseFrom(C3407e c3407e) throws IOException {
            return (UserAgent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, c3407e);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static UserAgent parseFrom(C3407e c3407e, C3410h c3410h) throws IOException {
            return (UserAgent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, c3407e, c3410h);
        }
    }
}
