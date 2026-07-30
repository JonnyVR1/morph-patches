package com.p003p1.mobile.longlink.msg.connector;

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
import l.aag0;
import l.bz00;
import l.i860;
import l.o6z;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes8.dex */
public final class LongLinkAuthMessage {

    /* JADX INFO: renamed from: com.p1.mobile.longlink.msg.connector.LongLinkAuthMessage$1 */
    public static /* synthetic */ class C03021 {

        /* JADX INFO: renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f1625xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f1625xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f1625xa1df5c61[GeneratedMessageLite.MethodToInvoke.IS_INITIALIZED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f1625xa1df5c61[GeneratedMessageLite.MethodToInvoke.MAKE_IMMUTABLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f1625xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f1625xa1df5c61[GeneratedMessageLite.MethodToInvoke.VISIT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f1625xa1df5c61[GeneratedMessageLite.MethodToInvoke.MERGE_FROM_STREAM.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f1625xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f1625xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    public interface AuthAckOrBuilder extends o6z {
        AuthResCode getCode();

        int getCodeValue();

        /* synthetic */ q getDefaultInstanceForType();

        /* synthetic */ boolean isInitialized();
    }

    public interface AuthAndHistoryAckOrBuilder extends o6z {
        AuthResCode getCode();

        int getCodeValue();

        /* synthetic */ q getDefaultInstanceForType();

        String getSenderId();

        ByteString getSenderIdBytes();

        /* synthetic */ boolean isInitialized();
    }

    public interface AuthAndHistoryOrBuilder extends o6z {
        String getAccessToken();

        ByteString getAccessTokenBytes();

        /* synthetic */ q getDefaultInstanceForType();

        String getModel();

        ByteString getModelBytes();

        ClientSourceEnum getSource();

        int getSourceValue();

        /* synthetic */ boolean isInitialized();
    }

    public interface AuthOrBuilder extends o6z {
        String getAccessToken();

        ByteString getAccessTokenBytes();

        String getAppID();

        ByteString getAppIDBytes();

        String getChannel();

        ByteString getChannelBytes();

        /* synthetic */ q getDefaultInstanceForType();

        String getDeviceIdentifer();

        ByteString getDeviceIdentiferBytes();

        String getExt();

        ByteString getExtBytes();

        ByteString getFlag();

        Location getLoc();

        String getLocale();

        ByteString getLocaleBytes();

        int getMCC();

        boolean getMute();

        String getRoomId();

        ByteString getRoomIdBytes();

        ClientSourceEnum getSource();

        int getSourceValue();

        AppStaySideEnum getStaySide();

        int getStaySideValue();

        UserAgent getUa();

        String getUserID();

        ByteString getUserIDBytes();

        ByteString getXTTClientInfo();

        ByteString getXTestingGroup();

        boolean hasLoc();

        boolean hasUa();

        /* synthetic */ boolean isInitialized();
    }

    public interface ConnInfoOrBuilder extends o6z {
        /* synthetic */ q getDefaultInstanceForType();

        Location getLoc();

        String getLocale();

        ByteString getLocaleBytes();

        String getRoomId();

        ByteString getRoomIdBytes();

        AppStaySideEnum getSide();

        int getSideValue();

        ClientSourceEnum getSource();

        int getSourceValue();

        UserAgent getUa();

        boolean hasLoc();

        boolean hasUa();

        /* synthetic */ boolean isInitialized();
    }

    public interface LocationOrBuilder extends o6z {
        /* synthetic */ q getDefaultInstanceForType();

        float getLat();

        float getLon();

        /* synthetic */ boolean isInitialized();
    }

    public interface PushAckOrBuilder extends o6z {
        /* synthetic */ q getDefaultInstanceForType();

        boolean getIsReliable();

        long getRecvTs();

        AppStaySideEnum getStaySide();

        int getStaySideValue();

        /* synthetic */ boolean isInitialized();
    }

    public interface SwitchSideOrBuilder extends o6z {
        /* synthetic */ q getDefaultInstanceForType();

        boolean getMute();

        AppStaySideEnum getToSide();

        int getToSideValue();

        /* synthetic */ boolean isInitialized();
    }

    public interface UserAgentOrBuilder extends o6z {
        String getAppUIVersion();

        ByteString getAppUIVersionBytes();

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

    private LongLinkAuthMessage() {
    }

    public static void registerAllExtensions(h hVar) {
    }

    public enum AppStaySideEnum implements l.c {
        APP_STAY_SIDE_FOREGROUND(0),
        APP_STAY_SIDE_BACKGROUND(1),
        UNRECOGNIZED(-1);

        public static final int APP_STAY_SIDE_BACKGROUND_VALUE = 1;
        public static final int APP_STAY_SIDE_FOREGROUND_VALUE = 0;
        private static final l.d<AppStaySideEnum> internalValueMap = new l.d<AppStaySideEnum>() { // from class: com.p1.mobile.longlink.msg.connector.LongLinkAuthMessage.AppStaySideEnum.1
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
        public static final int ACCESSTOKEN_FIELD_NUMBER = 1;
        public static final int APPID_FIELD_NUMBER = 14;
        public static final int CHANNEL_FIELD_NUMBER = 13;
        private static final Auth DEFAULT_INSTANCE;
        public static final int DEVICEIDENTIFER_FIELD_NUMBER = 16;
        public static final int EXT_FIELD_NUMBER = 17;
        public static final int FLAG_FIELD_NUMBER = 10;
        public static final int LOCALE_FIELD_NUMBER = 6;
        public static final int LOC_FIELD_NUMBER = 3;
        public static final int MCC_FIELD_NUMBER = 12;
        public static final int MUTE_FIELD_NUMBER = 11;
        private static volatile i860<Auth> PARSER = null;
        public static final int ROOMID_FIELD_NUMBER = 7;
        public static final int SOURCE_FIELD_NUMBER = 2;
        public static final int STAYSIDE_FIELD_NUMBER = 4;
        public static final int UA_FIELD_NUMBER = 5;
        public static final int USERID_FIELD_NUMBER = 15;
        public static final int XTESTINGGROUP_FIELD_NUMBER = 8;
        public static final int XTTCLIENTINFO_FIELD_NUMBER = 9;
        private String appID_;
        private String channel_;
        private String deviceIdentifer_;
        private String ext_;
        private ByteString flag_;
        private Location loc_;
        private int mCC_;
        private boolean mute_;
        private int source_;
        private int staySide_;
        private UserAgent ua_;
        private String userID_;
        private ByteString xTTClientInfo_;
        private ByteString xTestingGroup_;
        private String accessToken_ = "";
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
            this.channel_ = "";
            this.appID_ = "";
            this.userID_ = "";
            this.deviceIdentifer_ = "";
            this.ext_ = "";
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAccessToken() {
            this.accessToken_ = getDefaultInstance().getAccessToken();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAppID() {
            this.appID_ = getDefaultInstance().getAppID();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearChannel() {
            this.channel_ = getDefaultInstance().getChannel();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearDeviceIdentifer() {
            this.deviceIdentifer_ = getDefaultInstance().getDeviceIdentifer();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearExt() {
            this.ext_ = getDefaultInstance().getExt();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearFlag() {
            this.flag_ = getDefaultInstance().getFlag();
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
        public void clearMCC() {
            this.mCC_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearMute() {
            this.mute_ = false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearRoomId() {
            this.roomId_ = getDefaultInstance().getRoomId();
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
        public void clearUserID() {
            this.userID_ = getDefaultInstance().getUserID();
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
        public void setAccessToken(String str) {
            str.getClass();
            this.accessToken_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAccessTokenBytes(ByteString byteString) {
            byteString.getClass();
            a.checkByteStringIsUtf8(byteString);
            this.accessToken_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAppID(String str) {
            str.getClass();
            this.appID_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAppIDBytes(ByteString byteString) {
            byteString.getClass();
            a.checkByteStringIsUtf8(byteString);
            this.appID_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setChannel(String str) {
            str.getClass();
            this.channel_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setChannelBytes(ByteString byteString) {
            byteString.getClass();
            a.checkByteStringIsUtf8(byteString);
            this.channel_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setDeviceIdentifer(String str) {
            str.getClass();
            this.deviceIdentifer_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setDeviceIdentiferBytes(ByteString byteString) {
            byteString.getClass();
            a.checkByteStringIsUtf8(byteString);
            this.deviceIdentifer_ = byteString.toStringUtf8();
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
        public void setFlag(ByteString byteString) {
            byteString.getClass();
            this.flag_ = byteString;
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
        public void setMCC(int i) {
            this.mCC_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setMute(boolean z) {
            this.mute_ = z;
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
        public void setUserID(String str) {
            str.getClass();
            this.userID_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setUserIDBytes(ByteString byteString) {
            byteString.getClass();
            a.checkByteStringIsUtf8(byteString);
            this.userID_ = byteString.toStringUtf8();
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
            switch (C03021.f1625xa1df5c61[methodToInvoke.ordinal()]) {
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
                    this.accessToken_ = hVar.f(!this.accessToken_.isEmpty(), this.accessToken_, !auth.accessToken_.isEmpty(), auth.accessToken_);
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
                    boolean z7 = this.mute_;
                    boolean z8 = auth.mute_;
                    this.mute_ = hVar.d(z7, z7, z8, z8);
                    int i5 = this.mCC_;
                    boolean z9 = i5 != 0;
                    int i6 = auth.mCC_;
                    this.mCC_ = hVar.e(z9, i5, i6 != 0, i6);
                    this.channel_ = hVar.f(!this.channel_.isEmpty(), this.channel_, !auth.channel_.isEmpty(), auth.channel_);
                    this.appID_ = hVar.f(!this.appID_.isEmpty(), this.appID_, !auth.appID_.isEmpty(), auth.appID_);
                    this.userID_ = hVar.f(!this.userID_.isEmpty(), this.userID_, !auth.userID_.isEmpty(), auth.userID_);
                    this.deviceIdentifer_ = hVar.f(!this.deviceIdentifer_.isEmpty(), this.deviceIdentifer_, !auth.deviceIdentifer_.isEmpty(), auth.deviceIdentifer_);
                    this.ext_ = hVar.f(!this.ext_.isEmpty(), this.ext_, !auth.ext_.isEmpty(), auth.ext_);
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
                                    this.accessToken_ = eVar.L();
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
                                case 88:
                                    this.mute_ = eVar.m();
                                    continue;
                                case 96:
                                    this.mCC_ = eVar.u();
                                    continue;
                                case 106:
                                    this.channel_ = eVar.L();
                                    continue;
                                case XEGiftErrorCode.ERROR_CODE_VIDEO_TIMEOUT /* 114 */:
                                    this.appID_ = eVar.L();
                                    continue;
                                case 122:
                                    this.userID_ = eVar.L();
                                    continue;
                                case 130:
                                    this.deviceIdentifer_ = eVar.L();
                                    continue;
                                case 138:
                                    this.ext_ = eVar.L();
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

        @Override // com.p1.mobile.longlink.msg.connector.LongLinkAuthMessage.AuthOrBuilder
        public String getAccessToken() {
            return this.accessToken_;
        }

        @Override // com.p1.mobile.longlink.msg.connector.LongLinkAuthMessage.AuthOrBuilder
        public ByteString getAccessTokenBytes() {
            return ByteString.copyFromUtf8(this.accessToken_);
        }

        @Override // com.p1.mobile.longlink.msg.connector.LongLinkAuthMessage.AuthOrBuilder
        public String getAppID() {
            return this.appID_;
        }

        @Override // com.p1.mobile.longlink.msg.connector.LongLinkAuthMessage.AuthOrBuilder
        public ByteString getAppIDBytes() {
            return ByteString.copyFromUtf8(this.appID_);
        }

        @Override // com.p1.mobile.longlink.msg.connector.LongLinkAuthMessage.AuthOrBuilder
        public String getChannel() {
            return this.channel_;
        }

        @Override // com.p1.mobile.longlink.msg.connector.LongLinkAuthMessage.AuthOrBuilder
        public ByteString getChannelBytes() {
            return ByteString.copyFromUtf8(this.channel_);
        }

        @Override // com.p1.mobile.longlink.msg.connector.LongLinkAuthMessage.AuthOrBuilder
        public String getDeviceIdentifer() {
            return this.deviceIdentifer_;
        }

        @Override // com.p1.mobile.longlink.msg.connector.LongLinkAuthMessage.AuthOrBuilder
        public ByteString getDeviceIdentiferBytes() {
            return ByteString.copyFromUtf8(this.deviceIdentifer_);
        }

        @Override // com.p1.mobile.longlink.msg.connector.LongLinkAuthMessage.AuthOrBuilder
        public String getExt() {
            return this.ext_;
        }

        @Override // com.p1.mobile.longlink.msg.connector.LongLinkAuthMessage.AuthOrBuilder
        public ByteString getExtBytes() {
            return ByteString.copyFromUtf8(this.ext_);
        }

        @Override // com.p1.mobile.longlink.msg.connector.LongLinkAuthMessage.AuthOrBuilder
        public ByteString getFlag() {
            return this.flag_;
        }

        @Override // com.p1.mobile.longlink.msg.connector.LongLinkAuthMessage.AuthOrBuilder
        public Location getLoc() {
            Location location = this.loc_;
            return location == null ? Location.getDefaultInstance() : location;
        }

        @Override // com.p1.mobile.longlink.msg.connector.LongLinkAuthMessage.AuthOrBuilder
        public String getLocale() {
            return this.locale_;
        }

        @Override // com.p1.mobile.longlink.msg.connector.LongLinkAuthMessage.AuthOrBuilder
        public ByteString getLocaleBytes() {
            return ByteString.copyFromUtf8(this.locale_);
        }

        @Override // com.p1.mobile.longlink.msg.connector.LongLinkAuthMessage.AuthOrBuilder
        public int getMCC() {
            return this.mCC_;
        }

        @Override // com.p1.mobile.longlink.msg.connector.LongLinkAuthMessage.AuthOrBuilder
        public boolean getMute() {
            return this.mute_;
        }

        @Override // com.p1.mobile.longlink.msg.connector.LongLinkAuthMessage.AuthOrBuilder
        public String getRoomId() {
            return this.roomId_;
        }

        @Override // com.p1.mobile.longlink.msg.connector.LongLinkAuthMessage.AuthOrBuilder
        public ByteString getRoomIdBytes() {
            return ByteString.copyFromUtf8(this.roomId_);
        }

        public int getSerializedSize() {
            int i = ((GeneratedMessageLite) this).memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int iK = !this.accessToken_.isEmpty() ? CodedOutputStream.K(1, getAccessToken()) : 0;
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
            boolean z = this.mute_;
            if (z) {
                iK += CodedOutputStream.f(11, z);
            }
            int i2 = this.mCC_;
            if (i2 != 0) {
                iK += CodedOutputStream.t(12, i2);
            }
            if (!this.channel_.isEmpty()) {
                iK += CodedOutputStream.K(13, getChannel());
            }
            if (!this.appID_.isEmpty()) {
                iK += CodedOutputStream.K(14, getAppID());
            }
            if (!this.userID_.isEmpty()) {
                iK += CodedOutputStream.K(15, getUserID());
            }
            if (!this.deviceIdentifer_.isEmpty()) {
                iK += CodedOutputStream.K(16, getDeviceIdentifer());
            }
            if (!this.ext_.isEmpty()) {
                iK += CodedOutputStream.K(17, getExt());
            }
            ((GeneratedMessageLite) this).memoizedSerializedSize = iK;
            return iK;
        }

        @Override // com.p1.mobile.longlink.msg.connector.LongLinkAuthMessage.AuthOrBuilder
        public ClientSourceEnum getSource() {
            ClientSourceEnum clientSourceEnumForNumber = ClientSourceEnum.forNumber(this.source_);
            return clientSourceEnumForNumber == null ? ClientSourceEnum.UNRECOGNIZED : clientSourceEnumForNumber;
        }

        @Override // com.p1.mobile.longlink.msg.connector.LongLinkAuthMessage.AuthOrBuilder
        public int getSourceValue() {
            return this.source_;
        }

        @Override // com.p1.mobile.longlink.msg.connector.LongLinkAuthMessage.AuthOrBuilder
        public AppStaySideEnum getStaySide() {
            AppStaySideEnum appStaySideEnumForNumber = AppStaySideEnum.forNumber(this.staySide_);
            return appStaySideEnumForNumber == null ? AppStaySideEnum.UNRECOGNIZED : appStaySideEnumForNumber;
        }

        @Override // com.p1.mobile.longlink.msg.connector.LongLinkAuthMessage.AuthOrBuilder
        public int getStaySideValue() {
            return this.staySide_;
        }

        @Override // com.p1.mobile.longlink.msg.connector.LongLinkAuthMessage.AuthOrBuilder
        public UserAgent getUa() {
            UserAgent userAgent = this.ua_;
            return userAgent == null ? UserAgent.getDefaultInstance() : userAgent;
        }

        @Override // com.p1.mobile.longlink.msg.connector.LongLinkAuthMessage.AuthOrBuilder
        public String getUserID() {
            return this.userID_;
        }

        @Override // com.p1.mobile.longlink.msg.connector.LongLinkAuthMessage.AuthOrBuilder
        public ByteString getUserIDBytes() {
            return ByteString.copyFromUtf8(this.userID_);
        }

        @Override // com.p1.mobile.longlink.msg.connector.LongLinkAuthMessage.AuthOrBuilder
        public ByteString getXTTClientInfo() {
            return this.xTTClientInfo_;
        }

        @Override // com.p1.mobile.longlink.msg.connector.LongLinkAuthMessage.AuthOrBuilder
        public ByteString getXTestingGroup() {
            return this.xTestingGroup_;
        }

        @Override // com.p1.mobile.longlink.msg.connector.LongLinkAuthMessage.AuthOrBuilder
        public boolean hasLoc() {
            return this.loc_ != null;
        }

        @Override // com.p1.mobile.longlink.msg.connector.LongLinkAuthMessage.AuthOrBuilder
        public boolean hasUa() {
            return this.ua_ != null;
        }

        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (!this.accessToken_.isEmpty()) {
                codedOutputStream.D0(1, getAccessToken());
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
            boolean z = this.mute_;
            if (z) {
                codedOutputStream.a0(11, z);
            }
            int i = this.mCC_;
            if (i != 0) {
                codedOutputStream.s0(12, i);
            }
            if (!this.channel_.isEmpty()) {
                codedOutputStream.D0(13, getChannel());
            }
            if (!this.appID_.isEmpty()) {
                codedOutputStream.D0(14, getAppID());
            }
            if (!this.userID_.isEmpty()) {
                codedOutputStream.D0(15, getUserID());
            }
            if (!this.deviceIdentifer_.isEmpty()) {
                codedOutputStream.D0(16, getDeviceIdentifer());
            }
            if (this.ext_.isEmpty()) {
                return;
            }
            codedOutputStream.D0(17, getExt());
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

            public Builder clearAccessToken() {
                copyOnWrite();
                ((Auth) ((GeneratedMessageLite.b) this).instance).clearAccessToken();
                return this;
            }

            public Builder clearAppID() {
                copyOnWrite();
                ((Auth) ((GeneratedMessageLite.b) this).instance).clearAppID();
                return this;
            }

            public Builder clearChannel() {
                copyOnWrite();
                ((Auth) ((GeneratedMessageLite.b) this).instance).clearChannel();
                return this;
            }

            public Builder clearDeviceIdentifer() {
                copyOnWrite();
                ((Auth) ((GeneratedMessageLite.b) this).instance).clearDeviceIdentifer();
                return this;
            }

            public Builder clearExt() {
                copyOnWrite();
                ((Auth) ((GeneratedMessageLite.b) this).instance).clearExt();
                return this;
            }

            public Builder clearFlag() {
                copyOnWrite();
                ((Auth) ((GeneratedMessageLite.b) this).instance).clearFlag();
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

            public Builder clearMCC() {
                copyOnWrite();
                ((Auth) ((GeneratedMessageLite.b) this).instance).clearMCC();
                return this;
            }

            public Builder clearMute() {
                copyOnWrite();
                ((Auth) ((GeneratedMessageLite.b) this).instance).clearMute();
                return this;
            }

            public Builder clearRoomId() {
                copyOnWrite();
                ((Auth) ((GeneratedMessageLite.b) this).instance).clearRoomId();
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

            public Builder clearUserID() {
                copyOnWrite();
                ((Auth) ((GeneratedMessageLite.b) this).instance).clearUserID();
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

            @Override // com.p1.mobile.longlink.msg.connector.LongLinkAuthMessage.AuthOrBuilder
            public String getAccessToken() {
                return ((Auth) ((GeneratedMessageLite.b) this).instance).getAccessToken();
            }

            @Override // com.p1.mobile.longlink.msg.connector.LongLinkAuthMessage.AuthOrBuilder
            public ByteString getAccessTokenBytes() {
                return ((Auth) ((GeneratedMessageLite.b) this).instance).getAccessTokenBytes();
            }

            @Override // com.p1.mobile.longlink.msg.connector.LongLinkAuthMessage.AuthOrBuilder
            public String getAppID() {
                return ((Auth) ((GeneratedMessageLite.b) this).instance).getAppID();
            }

            @Override // com.p1.mobile.longlink.msg.connector.LongLinkAuthMessage.AuthOrBuilder
            public ByteString getAppIDBytes() {
                return ((Auth) ((GeneratedMessageLite.b) this).instance).getAppIDBytes();
            }

            @Override // com.p1.mobile.longlink.msg.connector.LongLinkAuthMessage.AuthOrBuilder
            public String getChannel() {
                return ((Auth) ((GeneratedMessageLite.b) this).instance).getChannel();
            }

            @Override // com.p1.mobile.longlink.msg.connector.LongLinkAuthMessage.AuthOrBuilder
            public ByteString getChannelBytes() {
                return ((Auth) ((GeneratedMessageLite.b) this).instance).getChannelBytes();
            }

            @Override // com.p1.mobile.longlink.msg.connector.LongLinkAuthMessage.AuthOrBuilder
            public String getDeviceIdentifer() {
                return ((Auth) ((GeneratedMessageLite.b) this).instance).getDeviceIdentifer();
            }

            @Override // com.p1.mobile.longlink.msg.connector.LongLinkAuthMessage.AuthOrBuilder
            public ByteString getDeviceIdentiferBytes() {
                return ((Auth) ((GeneratedMessageLite.b) this).instance).getDeviceIdentiferBytes();
            }

            @Override // com.p1.mobile.longlink.msg.connector.LongLinkAuthMessage.AuthOrBuilder
            public String getExt() {
                return ((Auth) ((GeneratedMessageLite.b) this).instance).getExt();
            }

            @Override // com.p1.mobile.longlink.msg.connector.LongLinkAuthMessage.AuthOrBuilder
            public ByteString getExtBytes() {
                return ((Auth) ((GeneratedMessageLite.b) this).instance).getExtBytes();
            }

            @Override // com.p1.mobile.longlink.msg.connector.LongLinkAuthMessage.AuthOrBuilder
            public ByteString getFlag() {
                return ((Auth) ((GeneratedMessageLite.b) this).instance).getFlag();
            }

            @Override // com.p1.mobile.longlink.msg.connector.LongLinkAuthMessage.AuthOrBuilder
            public Location getLoc() {
                return ((Auth) ((GeneratedMessageLite.b) this).instance).getLoc();
            }

            @Override // com.p1.mobile.longlink.msg.connector.LongLinkAuthMessage.AuthOrBuilder
            public String getLocale() {
                return ((Auth) ((GeneratedMessageLite.b) this).instance).getLocale();
            }

            @Override // com.p1.mobile.longlink.msg.connector.LongLinkAuthMessage.AuthOrBuilder
            public ByteString getLocaleBytes() {
                return ((Auth) ((GeneratedMessageLite.b) this).instance).getLocaleBytes();
            }

            @Override // com.p1.mobile.longlink.msg.connector.LongLinkAuthMessage.AuthOrBuilder
            public int getMCC() {
                return ((Auth) ((GeneratedMessageLite.b) this).instance).getMCC();
            }

            @Override // com.p1.mobile.longlink.msg.connector.LongLinkAuthMessage.AuthOrBuilder
            public boolean getMute() {
                return ((Auth) ((GeneratedMessageLite.b) this).instance).getMute();
            }

            @Override // com.p1.mobile.longlink.msg.connector.LongLinkAuthMessage.AuthOrBuilder
            public String getRoomId() {
                return ((Auth) ((GeneratedMessageLite.b) this).instance).getRoomId();
            }

            @Override // com.p1.mobile.longlink.msg.connector.LongLinkAuthMessage.AuthOrBuilder
            public ByteString getRoomIdBytes() {
                return ((Auth) ((GeneratedMessageLite.b) this).instance).getRoomIdBytes();
            }

            @Override // com.p1.mobile.longlink.msg.connector.LongLinkAuthMessage.AuthOrBuilder
            public ClientSourceEnum getSource() {
                return ((Auth) ((GeneratedMessageLite.b) this).instance).getSource();
            }

            @Override // com.p1.mobile.longlink.msg.connector.LongLinkAuthMessage.AuthOrBuilder
            public int getSourceValue() {
                return ((Auth) ((GeneratedMessageLite.b) this).instance).getSourceValue();
            }

            @Override // com.p1.mobile.longlink.msg.connector.LongLinkAuthMessage.AuthOrBuilder
            public AppStaySideEnum getStaySide() {
                return ((Auth) ((GeneratedMessageLite.b) this).instance).getStaySide();
            }

            @Override // com.p1.mobile.longlink.msg.connector.LongLinkAuthMessage.AuthOrBuilder
            public int getStaySideValue() {
                return ((Auth) ((GeneratedMessageLite.b) this).instance).getStaySideValue();
            }

            @Override // com.p1.mobile.longlink.msg.connector.LongLinkAuthMessage.AuthOrBuilder
            public UserAgent getUa() {
                return ((Auth) ((GeneratedMessageLite.b) this).instance).getUa();
            }

            @Override // com.p1.mobile.longlink.msg.connector.LongLinkAuthMessage.AuthOrBuilder
            public String getUserID() {
                return ((Auth) ((GeneratedMessageLite.b) this).instance).getUserID();
            }

            @Override // com.p1.mobile.longlink.msg.connector.LongLinkAuthMessage.AuthOrBuilder
            public ByteString getUserIDBytes() {
                return ((Auth) ((GeneratedMessageLite.b) this).instance).getUserIDBytes();
            }

            @Override // com.p1.mobile.longlink.msg.connector.LongLinkAuthMessage.AuthOrBuilder
            public ByteString getXTTClientInfo() {
                return ((Auth) ((GeneratedMessageLite.b) this).instance).getXTTClientInfo();
            }

            @Override // com.p1.mobile.longlink.msg.connector.LongLinkAuthMessage.AuthOrBuilder
            public ByteString getXTestingGroup() {
                return ((Auth) ((GeneratedMessageLite.b) this).instance).getXTestingGroup();
            }

            @Override // com.p1.mobile.longlink.msg.connector.LongLinkAuthMessage.AuthOrBuilder
            public boolean hasLoc() {
                return ((Auth) ((GeneratedMessageLite.b) this).instance).hasLoc();
            }

            @Override // com.p1.mobile.longlink.msg.connector.LongLinkAuthMessage.AuthOrBuilder
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

            public Builder setAccessToken(String str) {
                copyOnWrite();
                ((Auth) ((GeneratedMessageLite.b) this).instance).setAccessToken(str);
                return this;
            }

            public Builder setAccessTokenBytes(ByteString byteString) {
                copyOnWrite();
                ((Auth) ((GeneratedMessageLite.b) this).instance).setAccessTokenBytes(byteString);
                return this;
            }

            public Builder setAppID(String str) {
                copyOnWrite();
                ((Auth) ((GeneratedMessageLite.b) this).instance).setAppID(str);
                return this;
            }

            public Builder setAppIDBytes(ByteString byteString) {
                copyOnWrite();
                ((Auth) ((GeneratedMessageLite.b) this).instance).setAppIDBytes(byteString);
                return this;
            }

            public Builder setChannel(String str) {
                copyOnWrite();
                ((Auth) ((GeneratedMessageLite.b) this).instance).setChannel(str);
                return this;
            }

            public Builder setChannelBytes(ByteString byteString) {
                copyOnWrite();
                ((Auth) ((GeneratedMessageLite.b) this).instance).setChannelBytes(byteString);
                return this;
            }

            public Builder setDeviceIdentifer(String str) {
                copyOnWrite();
                ((Auth) ((GeneratedMessageLite.b) this).instance).setDeviceIdentifer(str);
                return this;
            }

            public Builder setDeviceIdentiferBytes(ByteString byteString) {
                copyOnWrite();
                ((Auth) ((GeneratedMessageLite.b) this).instance).setDeviceIdentiferBytes(byteString);
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

            public Builder setFlag(ByteString byteString) {
                copyOnWrite();
                ((Auth) ((GeneratedMessageLite.b) this).instance).setFlag(byteString);
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

            public Builder setMCC(int i) {
                copyOnWrite();
                ((Auth) ((GeneratedMessageLite.b) this).instance).setMCC(i);
                return this;
            }

            public Builder setMute(boolean z) {
                copyOnWrite();
                ((Auth) ((GeneratedMessageLite.b) this).instance).setMute(z);
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

            public Builder setUserID(String str) {
                copyOnWrite();
                ((Auth) ((GeneratedMessageLite.b) this).instance).setUserID(str);
                return this;
            }

            public Builder setUserIDBytes(ByteString byteString) {
                copyOnWrite();
                ((Auth) ((GeneratedMessageLite.b) this).instance).setUserIDBytes(byteString);
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

    public static final class AuthAck extends GeneratedMessageLite<AuthAck, Builder> implements AuthAckOrBuilder {
        public static final int CODE_FIELD_NUMBER = 1;
        private static final AuthAck DEFAULT_INSTANCE;
        private static volatile i860<AuthAck> PARSER;
        private int code_;

        public static final class Builder extends GeneratedMessageLite.b<AuthAck, Builder> implements AuthAckOrBuilder {
            private Builder() {
                super(AuthAck.DEFAULT_INSTANCE);
            }

            public Builder clearCode() {
                copyOnWrite();
                ((AuthAck) ((GeneratedMessageLite.b) this).instance).clearCode();
                return this;
            }

            @Override // com.p1.mobile.longlink.msg.connector.LongLinkAuthMessage.AuthAckOrBuilder
            public AuthResCode getCode() {
                return ((AuthAck) ((GeneratedMessageLite.b) this).instance).getCode();
            }

            @Override // com.p1.mobile.longlink.msg.connector.LongLinkAuthMessage.AuthAckOrBuilder
            public int getCodeValue() {
                return ((AuthAck) ((GeneratedMessageLite.b) this).instance).getCodeValue();
            }

            public Builder setCode(AuthResCode authResCode) {
                copyOnWrite();
                ((AuthAck) ((GeneratedMessageLite.b) this).instance).setCode(authResCode);
                return this;
            }

            public Builder setCodeValue(int i) {
                copyOnWrite();
                ((AuthAck) ((GeneratedMessageLite.b) this).instance).setCodeValue(i);
                return this;
            }
        }

        static {
            AuthAck authAck = new AuthAck();
            DEFAULT_INSTANCE = authAck;
            authAck.makeImmutable();
        }

        private AuthAck() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearCode() {
            this.code_ = 0;
        }

        public static AuthAck getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder(AuthAck authAck) {
            return (Builder) ((Builder) DEFAULT_INSTANCE.toBuilder()).mergeFrom(authAck);
        }

        public static AuthAck parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (AuthAck) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static AuthAck parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (AuthAck) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static i860<AuthAck> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setCode(AuthResCode authResCode) {
            authResCode.getClass();
            this.code_ = authResCode.getNumber();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setCodeValue(int i) {
            this.code_ = i;
        }

        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            boolean z = false;
            switch (C03021.f1625xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new AuthAck();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                    return null;
                case 4:
                    return new Builder();
                case 5:
                    GeneratedMessageLite.h hVar = (GeneratedMessageLite.h) obj;
                    AuthAck authAck = (AuthAck) obj2;
                    int i = this.code_;
                    boolean z2 = i != 0;
                    int i2 = authAck.code_;
                    this.code_ = hVar.e(z2, i, i2 != 0, i2);
                    GeneratedMessageLite.g gVar = GeneratedMessageLite.g.INSTANCE;
                    return this;
                case 6:
                    e eVar = (e) obj;
                    while (!z) {
                        try {
                            int iM = eVar.M();
                            if (iM != 0) {
                                if (iM == 8) {
                                    this.code_ = eVar.p();
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
                        synchronized (AuthAck.class) {
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

        @Override // com.p1.mobile.longlink.msg.connector.LongLinkAuthMessage.AuthAckOrBuilder
        public AuthResCode getCode() {
            AuthResCode authResCodeForNumber = AuthResCode.forNumber(this.code_);
            return authResCodeForNumber == null ? AuthResCode.UNRECOGNIZED : authResCodeForNumber;
        }

        @Override // com.p1.mobile.longlink.msg.connector.LongLinkAuthMessage.AuthAckOrBuilder
        public int getCodeValue() {
            return this.code_;
        }

        public int getSerializedSize() {
            int i = ((GeneratedMessageLite) this).memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int iM = this.code_ != AuthResCode.AUTH_SUCC.getNumber() ? CodedOutputStream.m(1, this.code_) : 0;
            ((GeneratedMessageLite) this).memoizedSerializedSize = iM;
            return iM;
        }

        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (this.code_ != AuthResCode.AUTH_SUCC.getNumber()) {
                codedOutputStream.i0(1, this.code_);
            }
        }

        public static AuthAck parseDelimitedFrom(InputStream inputStream, h hVar) throws IOException {
            return (AuthAck) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, hVar);
        }

        public static AuthAck parseFrom(ByteString byteString, h hVar) throws InvalidProtocolBufferException {
            return (AuthAck) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, hVar);
        }

        public static AuthAck parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (AuthAck) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static AuthAck parseFrom(byte[] bArr, h hVar) throws InvalidProtocolBufferException {
            return (AuthAck) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, hVar);
        }

        public static AuthAck parseFrom(InputStream inputStream) throws IOException {
            return (AuthAck) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static AuthAck parseFrom(InputStream inputStream, h hVar) throws IOException {
            return (AuthAck) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, hVar);
        }

        public static AuthAck parseFrom(e eVar) throws IOException {
            return (AuthAck) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, eVar);
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.toBuilder();
        }

        public static AuthAck parseFrom(e eVar, h hVar) throws IOException {
            return (AuthAck) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, eVar, hVar);
        }
    }

    public static final class AuthAndHistory extends GeneratedMessageLite<AuthAndHistory, Builder> implements AuthAndHistoryOrBuilder {
        public static final int ACCESSTOKEN_FIELD_NUMBER = 1;
        private static final AuthAndHistory DEFAULT_INSTANCE;
        public static final int MODEL_FIELD_NUMBER = 3;
        private static volatile i860<AuthAndHistory> PARSER = null;
        public static final int SOURCE_FIELD_NUMBER = 2;
        private String accessToken_ = "";
        private String model_ = "";
        private int source_;

        public static final class Builder extends GeneratedMessageLite.b<AuthAndHistory, Builder> implements AuthAndHistoryOrBuilder {
            private Builder() {
                super(AuthAndHistory.DEFAULT_INSTANCE);
            }

            public Builder clearAccessToken() {
                copyOnWrite();
                ((AuthAndHistory) ((GeneratedMessageLite.b) this).instance).clearAccessToken();
                return this;
            }

            public Builder clearModel() {
                copyOnWrite();
                ((AuthAndHistory) ((GeneratedMessageLite.b) this).instance).clearModel();
                return this;
            }

            public Builder clearSource() {
                copyOnWrite();
                ((AuthAndHistory) ((GeneratedMessageLite.b) this).instance).clearSource();
                return this;
            }

            @Override // com.p1.mobile.longlink.msg.connector.LongLinkAuthMessage.AuthAndHistoryOrBuilder
            public String getAccessToken() {
                return ((AuthAndHistory) ((GeneratedMessageLite.b) this).instance).getAccessToken();
            }

            @Override // com.p1.mobile.longlink.msg.connector.LongLinkAuthMessage.AuthAndHistoryOrBuilder
            public ByteString getAccessTokenBytes() {
                return ((AuthAndHistory) ((GeneratedMessageLite.b) this).instance).getAccessTokenBytes();
            }

            @Override // com.p1.mobile.longlink.msg.connector.LongLinkAuthMessage.AuthAndHistoryOrBuilder
            public String getModel() {
                return ((AuthAndHistory) ((GeneratedMessageLite.b) this).instance).getModel();
            }

            @Override // com.p1.mobile.longlink.msg.connector.LongLinkAuthMessage.AuthAndHistoryOrBuilder
            public ByteString getModelBytes() {
                return ((AuthAndHistory) ((GeneratedMessageLite.b) this).instance).getModelBytes();
            }

            @Override // com.p1.mobile.longlink.msg.connector.LongLinkAuthMessage.AuthAndHistoryOrBuilder
            public ClientSourceEnum getSource() {
                return ((AuthAndHistory) ((GeneratedMessageLite.b) this).instance).getSource();
            }

            @Override // com.p1.mobile.longlink.msg.connector.LongLinkAuthMessage.AuthAndHistoryOrBuilder
            public int getSourceValue() {
                return ((AuthAndHistory) ((GeneratedMessageLite.b) this).instance).getSourceValue();
            }

            public Builder setAccessToken(String str) {
                copyOnWrite();
                ((AuthAndHistory) ((GeneratedMessageLite.b) this).instance).setAccessToken(str);
                return this;
            }

            public Builder setAccessTokenBytes(ByteString byteString) {
                copyOnWrite();
                ((AuthAndHistory) ((GeneratedMessageLite.b) this).instance).setAccessTokenBytes(byteString);
                return this;
            }

            public Builder setModel(String str) {
                copyOnWrite();
                ((AuthAndHistory) ((GeneratedMessageLite.b) this).instance).setModel(str);
                return this;
            }

            public Builder setModelBytes(ByteString byteString) {
                copyOnWrite();
                ((AuthAndHistory) ((GeneratedMessageLite.b) this).instance).setModelBytes(byteString);
                return this;
            }

            public Builder setSource(ClientSourceEnum clientSourceEnum) {
                copyOnWrite();
                ((AuthAndHistory) ((GeneratedMessageLite.b) this).instance).setSource(clientSourceEnum);
                return this;
            }

            public Builder setSourceValue(int i) {
                copyOnWrite();
                ((AuthAndHistory) ((GeneratedMessageLite.b) this).instance).setSourceValue(i);
                return this;
            }
        }

        static {
            AuthAndHistory authAndHistory = new AuthAndHistory();
            DEFAULT_INSTANCE = authAndHistory;
            authAndHistory.makeImmutable();
        }

        private AuthAndHistory() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAccessToken() {
            this.accessToken_ = getDefaultInstance().getAccessToken();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearModel() {
            this.model_ = getDefaultInstance().getModel();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearSource() {
            this.source_ = 0;
        }

        public static AuthAndHistory getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder(AuthAndHistory authAndHistory) {
            return (Builder) ((Builder) DEFAULT_INSTANCE.toBuilder()).mergeFrom(authAndHistory);
        }

        public static AuthAndHistory parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (AuthAndHistory) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static AuthAndHistory parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (AuthAndHistory) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static i860<AuthAndHistory> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAccessToken(String str) {
            str.getClass();
            this.accessToken_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAccessTokenBytes(ByteString byteString) {
            byteString.getClass();
            a.checkByteStringIsUtf8(byteString);
            this.accessToken_ = byteString.toStringUtf8();
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

        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            boolean z = false;
            switch (C03021.f1625xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new AuthAndHistory();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                    return null;
                case 4:
                    return new Builder();
                case 5:
                    GeneratedMessageLite.h hVar = (GeneratedMessageLite.h) obj;
                    AuthAndHistory authAndHistory = (AuthAndHistory) obj2;
                    this.accessToken_ = hVar.f(!this.accessToken_.isEmpty(), this.accessToken_, !authAndHistory.accessToken_.isEmpty(), authAndHistory.accessToken_);
                    int i = this.source_;
                    boolean z2 = i != 0;
                    int i2 = authAndHistory.source_;
                    this.source_ = hVar.e(z2, i, i2 != 0, i2);
                    this.model_ = hVar.f(!this.model_.isEmpty(), this.model_, !authAndHistory.model_.isEmpty(), authAndHistory.model_);
                    GeneratedMessageLite.g gVar = GeneratedMessageLite.g.INSTANCE;
                    return this;
                case 6:
                    e eVar = (e) obj;
                    while (!z) {
                        try {
                            int iM = eVar.M();
                            if (iM != 0) {
                                if (iM == 10) {
                                    this.accessToken_ = eVar.L();
                                } else if (iM == 16) {
                                    this.source_ = eVar.p();
                                } else if (iM == 26) {
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
                        synchronized (AuthAndHistory.class) {
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

        @Override // com.p1.mobile.longlink.msg.connector.LongLinkAuthMessage.AuthAndHistoryOrBuilder
        public String getAccessToken() {
            return this.accessToken_;
        }

        @Override // com.p1.mobile.longlink.msg.connector.LongLinkAuthMessage.AuthAndHistoryOrBuilder
        public ByteString getAccessTokenBytes() {
            return ByteString.copyFromUtf8(this.accessToken_);
        }

        @Override // com.p1.mobile.longlink.msg.connector.LongLinkAuthMessage.AuthAndHistoryOrBuilder
        public String getModel() {
            return this.model_;
        }

        @Override // com.p1.mobile.longlink.msg.connector.LongLinkAuthMessage.AuthAndHistoryOrBuilder
        public ByteString getModelBytes() {
            return ByteString.copyFromUtf8(this.model_);
        }

        public int getSerializedSize() {
            int i = ((GeneratedMessageLite) this).memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int iK = !this.accessToken_.isEmpty() ? CodedOutputStream.K(1, getAccessToken()) : 0;
            if (this.source_ != ClientSourceEnum.CLIENT_SOURCE_ANDROID.getNumber()) {
                iK += CodedOutputStream.m(2, this.source_);
            }
            if (!this.model_.isEmpty()) {
                iK += CodedOutputStream.K(3, getModel());
            }
            ((GeneratedMessageLite) this).memoizedSerializedSize = iK;
            return iK;
        }

        @Override // com.p1.mobile.longlink.msg.connector.LongLinkAuthMessage.AuthAndHistoryOrBuilder
        public ClientSourceEnum getSource() {
            ClientSourceEnum clientSourceEnumForNumber = ClientSourceEnum.forNumber(this.source_);
            return clientSourceEnumForNumber == null ? ClientSourceEnum.UNRECOGNIZED : clientSourceEnumForNumber;
        }

        @Override // com.p1.mobile.longlink.msg.connector.LongLinkAuthMessage.AuthAndHistoryOrBuilder
        public int getSourceValue() {
            return this.source_;
        }

        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (!this.accessToken_.isEmpty()) {
                codedOutputStream.D0(1, getAccessToken());
            }
            if (this.source_ != ClientSourceEnum.CLIENT_SOURCE_ANDROID.getNumber()) {
                codedOutputStream.i0(2, this.source_);
            }
            if (this.model_.isEmpty()) {
                return;
            }
            codedOutputStream.D0(3, getModel());
        }

        public static AuthAndHistory parseDelimitedFrom(InputStream inputStream, h hVar) throws IOException {
            return (AuthAndHistory) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, hVar);
        }

        public static AuthAndHistory parseFrom(ByteString byteString, h hVar) throws InvalidProtocolBufferException {
            return (AuthAndHistory) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, hVar);
        }

        public static AuthAndHistory parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (AuthAndHistory) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static AuthAndHistory parseFrom(byte[] bArr, h hVar) throws InvalidProtocolBufferException {
            return (AuthAndHistory) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, hVar);
        }

        public static AuthAndHistory parseFrom(InputStream inputStream) throws IOException {
            return (AuthAndHistory) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static AuthAndHistory parseFrom(InputStream inputStream, h hVar) throws IOException {
            return (AuthAndHistory) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, hVar);
        }

        public static AuthAndHistory parseFrom(e eVar) throws IOException {
            return (AuthAndHistory) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, eVar);
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.toBuilder();
        }

        public static AuthAndHistory parseFrom(e eVar, h hVar) throws IOException {
            return (AuthAndHistory) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, eVar, hVar);
        }
    }

    public static final class AuthAndHistoryAck extends GeneratedMessageLite<AuthAndHistoryAck, Builder> implements AuthAndHistoryAckOrBuilder {
        public static final int CODE_FIELD_NUMBER = 1;
        private static final AuthAndHistoryAck DEFAULT_INSTANCE;
        private static volatile i860<AuthAndHistoryAck> PARSER = null;
        public static final int SENDERID_FIELD_NUMBER = 2;
        private int code_;
        private String senderId_ = "";

        public static final class Builder extends GeneratedMessageLite.b<AuthAndHistoryAck, Builder> implements AuthAndHistoryAckOrBuilder {
            private Builder() {
                super(AuthAndHistoryAck.DEFAULT_INSTANCE);
            }

            public Builder clearCode() {
                copyOnWrite();
                ((AuthAndHistoryAck) ((GeneratedMessageLite.b) this).instance).clearCode();
                return this;
            }

            public Builder clearSenderId() {
                copyOnWrite();
                ((AuthAndHistoryAck) ((GeneratedMessageLite.b) this).instance).clearSenderId();
                return this;
            }

            @Override // com.p1.mobile.longlink.msg.connector.LongLinkAuthMessage.AuthAndHistoryAckOrBuilder
            public AuthResCode getCode() {
                return ((AuthAndHistoryAck) ((GeneratedMessageLite.b) this).instance).getCode();
            }

            @Override // com.p1.mobile.longlink.msg.connector.LongLinkAuthMessage.AuthAndHistoryAckOrBuilder
            public int getCodeValue() {
                return ((AuthAndHistoryAck) ((GeneratedMessageLite.b) this).instance).getCodeValue();
            }

            @Override // com.p1.mobile.longlink.msg.connector.LongLinkAuthMessage.AuthAndHistoryAckOrBuilder
            public String getSenderId() {
                return ((AuthAndHistoryAck) ((GeneratedMessageLite.b) this).instance).getSenderId();
            }

            @Override // com.p1.mobile.longlink.msg.connector.LongLinkAuthMessage.AuthAndHistoryAckOrBuilder
            public ByteString getSenderIdBytes() {
                return ((AuthAndHistoryAck) ((GeneratedMessageLite.b) this).instance).getSenderIdBytes();
            }

            public Builder setCode(AuthResCode authResCode) {
                copyOnWrite();
                ((AuthAndHistoryAck) ((GeneratedMessageLite.b) this).instance).setCode(authResCode);
                return this;
            }

            public Builder setCodeValue(int i) {
                copyOnWrite();
                ((AuthAndHistoryAck) ((GeneratedMessageLite.b) this).instance).setCodeValue(i);
                return this;
            }

            public Builder setSenderId(String str) {
                copyOnWrite();
                ((AuthAndHistoryAck) ((GeneratedMessageLite.b) this).instance).setSenderId(str);
                return this;
            }

            public Builder setSenderIdBytes(ByteString byteString) {
                copyOnWrite();
                ((AuthAndHistoryAck) ((GeneratedMessageLite.b) this).instance).setSenderIdBytes(byteString);
                return this;
            }
        }

        static {
            AuthAndHistoryAck authAndHistoryAck = new AuthAndHistoryAck();
            DEFAULT_INSTANCE = authAndHistoryAck;
            authAndHistoryAck.makeImmutable();
        }

        private AuthAndHistoryAck() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearCode() {
            this.code_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearSenderId() {
            this.senderId_ = getDefaultInstance().getSenderId();
        }

        public static AuthAndHistoryAck getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder(AuthAndHistoryAck authAndHistoryAck) {
            return (Builder) ((Builder) DEFAULT_INSTANCE.toBuilder()).mergeFrom(authAndHistoryAck);
        }

        public static AuthAndHistoryAck parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (AuthAndHistoryAck) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static AuthAndHistoryAck parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (AuthAndHistoryAck) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static i860<AuthAndHistoryAck> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setCode(AuthResCode authResCode) {
            authResCode.getClass();
            this.code_ = authResCode.getNumber();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setCodeValue(int i) {
            this.code_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSenderId(String str) {
            str.getClass();
            this.senderId_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSenderIdBytes(ByteString byteString) {
            byteString.getClass();
            a.checkByteStringIsUtf8(byteString);
            this.senderId_ = byteString.toStringUtf8();
        }

        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            boolean z = false;
            switch (C03021.f1625xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new AuthAndHistoryAck();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                    return null;
                case 4:
                    return new Builder();
                case 5:
                    GeneratedMessageLite.h hVar = (GeneratedMessageLite.h) obj;
                    AuthAndHistoryAck authAndHistoryAck = (AuthAndHistoryAck) obj2;
                    int i = this.code_;
                    boolean z2 = i != 0;
                    int i2 = authAndHistoryAck.code_;
                    this.code_ = hVar.e(z2, i, i2 != 0, i2);
                    this.senderId_ = hVar.f(!this.senderId_.isEmpty(), this.senderId_, !authAndHistoryAck.senderId_.isEmpty(), authAndHistoryAck.senderId_);
                    GeneratedMessageLite.g gVar = GeneratedMessageLite.g.INSTANCE;
                    return this;
                case 6:
                    e eVar = (e) obj;
                    while (!z) {
                        try {
                            int iM = eVar.M();
                            if (iM != 0) {
                                if (iM == 8) {
                                    this.code_ = eVar.p();
                                } else if (iM == 18) {
                                    this.senderId_ = eVar.L();
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
                        synchronized (AuthAndHistoryAck.class) {
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

        @Override // com.p1.mobile.longlink.msg.connector.LongLinkAuthMessage.AuthAndHistoryAckOrBuilder
        public AuthResCode getCode() {
            AuthResCode authResCodeForNumber = AuthResCode.forNumber(this.code_);
            return authResCodeForNumber == null ? AuthResCode.UNRECOGNIZED : authResCodeForNumber;
        }

        @Override // com.p1.mobile.longlink.msg.connector.LongLinkAuthMessage.AuthAndHistoryAckOrBuilder
        public int getCodeValue() {
            return this.code_;
        }

        @Override // com.p1.mobile.longlink.msg.connector.LongLinkAuthMessage.AuthAndHistoryAckOrBuilder
        public String getSenderId() {
            return this.senderId_;
        }

        @Override // com.p1.mobile.longlink.msg.connector.LongLinkAuthMessage.AuthAndHistoryAckOrBuilder
        public ByteString getSenderIdBytes() {
            return ByteString.copyFromUtf8(this.senderId_);
        }

        public int getSerializedSize() {
            int i = ((GeneratedMessageLite) this).memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int iM = this.code_ != AuthResCode.AUTH_SUCC.getNumber() ? CodedOutputStream.m(1, this.code_) : 0;
            if (!this.senderId_.isEmpty()) {
                iM += CodedOutputStream.K(2, getSenderId());
            }
            ((GeneratedMessageLite) this).memoizedSerializedSize = iM;
            return iM;
        }

        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (this.code_ != AuthResCode.AUTH_SUCC.getNumber()) {
                codedOutputStream.i0(1, this.code_);
            }
            if (this.senderId_.isEmpty()) {
                return;
            }
            codedOutputStream.D0(2, getSenderId());
        }

        public static AuthAndHistoryAck parseDelimitedFrom(InputStream inputStream, h hVar) throws IOException {
            return (AuthAndHistoryAck) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, hVar);
        }

        public static AuthAndHistoryAck parseFrom(ByteString byteString, h hVar) throws InvalidProtocolBufferException {
            return (AuthAndHistoryAck) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, hVar);
        }

        public static AuthAndHistoryAck parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (AuthAndHistoryAck) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static AuthAndHistoryAck parseFrom(byte[] bArr, h hVar) throws InvalidProtocolBufferException {
            return (AuthAndHistoryAck) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, hVar);
        }

        public static AuthAndHistoryAck parseFrom(InputStream inputStream) throws IOException {
            return (AuthAndHistoryAck) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static AuthAndHistoryAck parseFrom(InputStream inputStream, h hVar) throws IOException {
            return (AuthAndHistoryAck) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, hVar);
        }

        public static AuthAndHistoryAck parseFrom(e eVar) throws IOException {
            return (AuthAndHistoryAck) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, eVar);
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.toBuilder();
        }

        public static AuthAndHistoryAck parseFrom(e eVar, h hVar) throws IOException {
            return (AuthAndHistoryAck) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, eVar, hVar);
        }
    }

    public enum AuthResCode implements l.c {
        AUTH_SUCC(0),
        AUTH_FAIL(1),
        UNRECOGNIZED(-1);

        public static final int AUTH_FAIL_VALUE = 1;
        public static final int AUTH_SUCC_VALUE = 0;
        private static final l.d<AuthResCode> internalValueMap = new l.d<AuthResCode>() { // from class: com.p1.mobile.longlink.msg.connector.LongLinkAuthMessage.AuthResCode.1
            public AuthResCode findValueByNumber(int i) {
                return AuthResCode.forNumber(i);
            }
        };
        private final int value;

        AuthResCode(int i) {
            this.value = i;
        }

        public static AuthResCode forNumber(int i) {
            if (i == 0) {
                return AUTH_SUCC;
            }
            if (i != 1) {
                return null;
            }
            return AUTH_FAIL;
        }

        public static l.d<AuthResCode> internalGetValueMap() {
            return internalValueMap;
        }

        public final int getNumber() {
            return this.value;
        }

        @Deprecated
        public static AuthResCode valueOf(int i) {
            return forNumber(i);
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
        private static final l.d<ClientSourceEnum> internalValueMap = new l.d<ClientSourceEnum>() { // from class: com.p1.mobile.longlink.msg.connector.LongLinkAuthMessage.ClientSourceEnum.1
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

    public static final class ConnInfo extends GeneratedMessageLite<ConnInfo, Builder> implements ConnInfoOrBuilder {
        private static final ConnInfo DEFAULT_INSTANCE;
        public static final int LOCALE_FIELD_NUMBER = 5;
        public static final int LOC_FIELD_NUMBER = 4;
        private static volatile i860<ConnInfo> PARSER = null;
        public static final int ROOMID_FIELD_NUMBER = 6;
        public static final int SIDE_FIELD_NUMBER = 2;
        public static final int SOURCE_FIELD_NUMBER = 1;
        public static final int UA_FIELD_NUMBER = 3;
        private Location loc_;
        private String locale_ = "";
        private String roomId_ = "";
        private int side_;
        private int source_;
        private UserAgent ua_;

        static {
            ConnInfo connInfo = new ConnInfo();
            DEFAULT_INSTANCE = connInfo;
            connInfo.makeImmutable();
        }

        private ConnInfo() {
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
        public void clearRoomId() {
            this.roomId_ = getDefaultInstance().getRoomId();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearSide() {
            this.side_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearSource() {
            this.source_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearUa() {
            this.ua_ = null;
        }

        public static ConnInfo getDefaultInstance() {
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

        public static Builder newBuilder(ConnInfo connInfo) {
            return (Builder) ((Builder) DEFAULT_INSTANCE.toBuilder()).mergeFrom(connInfo);
        }

        public static ConnInfo parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (ConnInfo) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static ConnInfo parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (ConnInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static i860<ConnInfo> parser() {
            return DEFAULT_INSTANCE.getParserForType();
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
        public void setSide(AppStaySideEnum appStaySideEnum) {
            appStaySideEnum.getClass();
            this.side_ = appStaySideEnum.getNumber();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSideValue(int i) {
            this.side_ = i;
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
        public void setUa(UserAgent.Builder builder) {
            this.ua_ = (UserAgent) builder.build();
        }

        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            boolean z = false;
            switch (C03021.f1625xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new ConnInfo();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                    return null;
                case 4:
                    return new Builder();
                case 5:
                    GeneratedMessageLite.h hVar = (GeneratedMessageLite.h) obj;
                    ConnInfo connInfo = (ConnInfo) obj2;
                    int i = this.source_;
                    boolean z2 = i != 0;
                    int i2 = connInfo.source_;
                    this.source_ = hVar.e(z2, i, i2 != 0, i2);
                    int i3 = this.side_;
                    boolean z3 = i3 != 0;
                    int i4 = connInfo.side_;
                    this.side_ = hVar.e(z3, i3, i4 != 0, i4);
                    this.ua_ = hVar.o(this.ua_, connInfo.ua_);
                    this.loc_ = hVar.o(this.loc_, connInfo.loc_);
                    this.locale_ = hVar.f(!this.locale_.isEmpty(), this.locale_, !connInfo.locale_.isEmpty(), connInfo.locale_);
                    this.roomId_ = hVar.f(!this.roomId_.isEmpty(), this.roomId_, !connInfo.roomId_.isEmpty(), connInfo.roomId_);
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
                                    this.source_ = eVar.p();
                                } else if (iM == 16) {
                                    this.side_ = eVar.p();
                                } else if (iM == 26) {
                                    UserAgent userAgent = this.ua_;
                                    UserAgent.Builder builder = userAgent != null ? (UserAgent.Builder) userAgent.toBuilder() : null;
                                    UserAgent userAgentW = eVar.w(UserAgent.parser(), hVar2);
                                    this.ua_ = userAgentW;
                                    if (builder != null) {
                                        builder.mergeFrom(userAgentW);
                                        this.ua_ = (UserAgent) builder.buildPartial();
                                    }
                                } else if (iM == 34) {
                                    Location location = this.loc_;
                                    Location.Builder builder2 = location != null ? (Location.Builder) location.toBuilder() : null;
                                    Location locationW = eVar.w(Location.parser(), hVar2);
                                    this.loc_ = locationW;
                                    if (builder2 != null) {
                                        builder2.mergeFrom(locationW);
                                        this.loc_ = (Location) builder2.buildPartial();
                                    }
                                } else if (iM == 42) {
                                    this.locale_ = eVar.L();
                                } else if (iM == 50) {
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
                        synchronized (ConnInfo.class) {
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

        @Override // com.p1.mobile.longlink.msg.connector.LongLinkAuthMessage.ConnInfoOrBuilder
        public Location getLoc() {
            Location location = this.loc_;
            return location == null ? Location.getDefaultInstance() : location;
        }

        @Override // com.p1.mobile.longlink.msg.connector.LongLinkAuthMessage.ConnInfoOrBuilder
        public String getLocale() {
            return this.locale_;
        }

        @Override // com.p1.mobile.longlink.msg.connector.LongLinkAuthMessage.ConnInfoOrBuilder
        public ByteString getLocaleBytes() {
            return ByteString.copyFromUtf8(this.locale_);
        }

        @Override // com.p1.mobile.longlink.msg.connector.LongLinkAuthMessage.ConnInfoOrBuilder
        public String getRoomId() {
            return this.roomId_;
        }

        @Override // com.p1.mobile.longlink.msg.connector.LongLinkAuthMessage.ConnInfoOrBuilder
        public ByteString getRoomIdBytes() {
            return ByteString.copyFromUtf8(this.roomId_);
        }

        public int getSerializedSize() {
            int i = ((GeneratedMessageLite) this).memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int iM = this.source_ != ClientSourceEnum.CLIENT_SOURCE_ANDROID.getNumber() ? CodedOutputStream.m(1, this.source_) : 0;
            if (this.side_ != AppStaySideEnum.APP_STAY_SIDE_FOREGROUND.getNumber()) {
                iM += CodedOutputStream.m(2, this.side_);
            }
            if (this.ua_ != null) {
                iM += CodedOutputStream.C(3, getUa());
            }
            if (this.loc_ != null) {
                iM += CodedOutputStream.C(4, getLoc());
            }
            if (!this.locale_.isEmpty()) {
                iM += CodedOutputStream.K(5, getLocale());
            }
            if (!this.roomId_.isEmpty()) {
                iM += CodedOutputStream.K(6, getRoomId());
            }
            ((GeneratedMessageLite) this).memoizedSerializedSize = iM;
            return iM;
        }

        @Override // com.p1.mobile.longlink.msg.connector.LongLinkAuthMessage.ConnInfoOrBuilder
        public AppStaySideEnum getSide() {
            AppStaySideEnum appStaySideEnumForNumber = AppStaySideEnum.forNumber(this.side_);
            return appStaySideEnumForNumber == null ? AppStaySideEnum.UNRECOGNIZED : appStaySideEnumForNumber;
        }

        @Override // com.p1.mobile.longlink.msg.connector.LongLinkAuthMessage.ConnInfoOrBuilder
        public int getSideValue() {
            return this.side_;
        }

        @Override // com.p1.mobile.longlink.msg.connector.LongLinkAuthMessage.ConnInfoOrBuilder
        public ClientSourceEnum getSource() {
            ClientSourceEnum clientSourceEnumForNumber = ClientSourceEnum.forNumber(this.source_);
            return clientSourceEnumForNumber == null ? ClientSourceEnum.UNRECOGNIZED : clientSourceEnumForNumber;
        }

        @Override // com.p1.mobile.longlink.msg.connector.LongLinkAuthMessage.ConnInfoOrBuilder
        public int getSourceValue() {
            return this.source_;
        }

        @Override // com.p1.mobile.longlink.msg.connector.LongLinkAuthMessage.ConnInfoOrBuilder
        public UserAgent getUa() {
            UserAgent userAgent = this.ua_;
            return userAgent == null ? UserAgent.getDefaultInstance() : userAgent;
        }

        @Override // com.p1.mobile.longlink.msg.connector.LongLinkAuthMessage.ConnInfoOrBuilder
        public boolean hasLoc() {
            return this.loc_ != null;
        }

        @Override // com.p1.mobile.longlink.msg.connector.LongLinkAuthMessage.ConnInfoOrBuilder
        public boolean hasUa() {
            return this.ua_ != null;
        }

        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (this.source_ != ClientSourceEnum.CLIENT_SOURCE_ANDROID.getNumber()) {
                codedOutputStream.i0(1, this.source_);
            }
            if (this.side_ != AppStaySideEnum.APP_STAY_SIDE_FOREGROUND.getNumber()) {
                codedOutputStream.i0(2, this.side_);
            }
            if (this.ua_ != null) {
                codedOutputStream.w0(3, getUa());
            }
            if (this.loc_ != null) {
                codedOutputStream.w0(4, getLoc());
            }
            if (!this.locale_.isEmpty()) {
                codedOutputStream.D0(5, getLocale());
            }
            if (this.roomId_.isEmpty()) {
                return;
            }
            codedOutputStream.D0(6, getRoomId());
        }

        public static ConnInfo parseDelimitedFrom(InputStream inputStream, h hVar) throws IOException {
            return (ConnInfo) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, hVar);
        }

        public static ConnInfo parseFrom(ByteString byteString, h hVar) throws InvalidProtocolBufferException {
            return (ConnInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, hVar);
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

        public static final class Builder extends GeneratedMessageLite.b<ConnInfo, Builder> implements ConnInfoOrBuilder {
            private Builder() {
                super(ConnInfo.DEFAULT_INSTANCE);
            }

            public Builder clearLoc() {
                copyOnWrite();
                ((ConnInfo) ((GeneratedMessageLite.b) this).instance).clearLoc();
                return this;
            }

            public Builder clearLocale() {
                copyOnWrite();
                ((ConnInfo) ((GeneratedMessageLite.b) this).instance).clearLocale();
                return this;
            }

            public Builder clearRoomId() {
                copyOnWrite();
                ((ConnInfo) ((GeneratedMessageLite.b) this).instance).clearRoomId();
                return this;
            }

            public Builder clearSide() {
                copyOnWrite();
                ((ConnInfo) ((GeneratedMessageLite.b) this).instance).clearSide();
                return this;
            }

            public Builder clearSource() {
                copyOnWrite();
                ((ConnInfo) ((GeneratedMessageLite.b) this).instance).clearSource();
                return this;
            }

            public Builder clearUa() {
                copyOnWrite();
                ((ConnInfo) ((GeneratedMessageLite.b) this).instance).clearUa();
                return this;
            }

            @Override // com.p1.mobile.longlink.msg.connector.LongLinkAuthMessage.ConnInfoOrBuilder
            public Location getLoc() {
                return ((ConnInfo) ((GeneratedMessageLite.b) this).instance).getLoc();
            }

            @Override // com.p1.mobile.longlink.msg.connector.LongLinkAuthMessage.ConnInfoOrBuilder
            public String getLocale() {
                return ((ConnInfo) ((GeneratedMessageLite.b) this).instance).getLocale();
            }

            @Override // com.p1.mobile.longlink.msg.connector.LongLinkAuthMessage.ConnInfoOrBuilder
            public ByteString getLocaleBytes() {
                return ((ConnInfo) ((GeneratedMessageLite.b) this).instance).getLocaleBytes();
            }

            @Override // com.p1.mobile.longlink.msg.connector.LongLinkAuthMessage.ConnInfoOrBuilder
            public String getRoomId() {
                return ((ConnInfo) ((GeneratedMessageLite.b) this).instance).getRoomId();
            }

            @Override // com.p1.mobile.longlink.msg.connector.LongLinkAuthMessage.ConnInfoOrBuilder
            public ByteString getRoomIdBytes() {
                return ((ConnInfo) ((GeneratedMessageLite.b) this).instance).getRoomIdBytes();
            }

            @Override // com.p1.mobile.longlink.msg.connector.LongLinkAuthMessage.ConnInfoOrBuilder
            public AppStaySideEnum getSide() {
                return ((ConnInfo) ((GeneratedMessageLite.b) this).instance).getSide();
            }

            @Override // com.p1.mobile.longlink.msg.connector.LongLinkAuthMessage.ConnInfoOrBuilder
            public int getSideValue() {
                return ((ConnInfo) ((GeneratedMessageLite.b) this).instance).getSideValue();
            }

            @Override // com.p1.mobile.longlink.msg.connector.LongLinkAuthMessage.ConnInfoOrBuilder
            public ClientSourceEnum getSource() {
                return ((ConnInfo) ((GeneratedMessageLite.b) this).instance).getSource();
            }

            @Override // com.p1.mobile.longlink.msg.connector.LongLinkAuthMessage.ConnInfoOrBuilder
            public int getSourceValue() {
                return ((ConnInfo) ((GeneratedMessageLite.b) this).instance).getSourceValue();
            }

            @Override // com.p1.mobile.longlink.msg.connector.LongLinkAuthMessage.ConnInfoOrBuilder
            public UserAgent getUa() {
                return ((ConnInfo) ((GeneratedMessageLite.b) this).instance).getUa();
            }

            @Override // com.p1.mobile.longlink.msg.connector.LongLinkAuthMessage.ConnInfoOrBuilder
            public boolean hasLoc() {
                return ((ConnInfo) ((GeneratedMessageLite.b) this).instance).hasLoc();
            }

            @Override // com.p1.mobile.longlink.msg.connector.LongLinkAuthMessage.ConnInfoOrBuilder
            public boolean hasUa() {
                return ((ConnInfo) ((GeneratedMessageLite.b) this).instance).hasUa();
            }

            public Builder mergeLoc(Location location) {
                copyOnWrite();
                ((ConnInfo) ((GeneratedMessageLite.b) this).instance).mergeLoc(location);
                return this;
            }

            public Builder mergeUa(UserAgent userAgent) {
                copyOnWrite();
                ((ConnInfo) ((GeneratedMessageLite.b) this).instance).mergeUa(userAgent);
                return this;
            }

            public Builder setLoc(Location location) {
                copyOnWrite();
                ((ConnInfo) ((GeneratedMessageLite.b) this).instance).setLoc(location);
                return this;
            }

            public Builder setLocale(String str) {
                copyOnWrite();
                ((ConnInfo) ((GeneratedMessageLite.b) this).instance).setLocale(str);
                return this;
            }

            public Builder setLocaleBytes(ByteString byteString) {
                copyOnWrite();
                ((ConnInfo) ((GeneratedMessageLite.b) this).instance).setLocaleBytes(byteString);
                return this;
            }

            public Builder setRoomId(String str) {
                copyOnWrite();
                ((ConnInfo) ((GeneratedMessageLite.b) this).instance).setRoomId(str);
                return this;
            }

            public Builder setRoomIdBytes(ByteString byteString) {
                copyOnWrite();
                ((ConnInfo) ((GeneratedMessageLite.b) this).instance).setRoomIdBytes(byteString);
                return this;
            }

            public Builder setSide(AppStaySideEnum appStaySideEnum) {
                copyOnWrite();
                ((ConnInfo) ((GeneratedMessageLite.b) this).instance).setSide(appStaySideEnum);
                return this;
            }

            public Builder setSideValue(int i) {
                copyOnWrite();
                ((ConnInfo) ((GeneratedMessageLite.b) this).instance).setSideValue(i);
                return this;
            }

            public Builder setSource(ClientSourceEnum clientSourceEnum) {
                copyOnWrite();
                ((ConnInfo) ((GeneratedMessageLite.b) this).instance).setSource(clientSourceEnum);
                return this;
            }

            public Builder setSourceValue(int i) {
                copyOnWrite();
                ((ConnInfo) ((GeneratedMessageLite.b) this).instance).setSourceValue(i);
                return this;
            }

            public Builder setUa(UserAgent userAgent) {
                copyOnWrite();
                ((ConnInfo) ((GeneratedMessageLite.b) this).instance).setUa(userAgent);
                return this;
            }

            public Builder setLoc(Location.Builder builder) {
                copyOnWrite();
                ((ConnInfo) ((GeneratedMessageLite.b) this).instance).setLoc(builder);
                return this;
            }

            public Builder setUa(UserAgent.Builder builder) {
                copyOnWrite();
                ((ConnInfo) ((GeneratedMessageLite.b) this).instance).setUa(builder);
                return this;
            }
        }

        public static ConnInfo parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (ConnInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static ConnInfo parseFrom(byte[] bArr, h hVar) throws InvalidProtocolBufferException {
            return (ConnInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, hVar);
        }

        public static ConnInfo parseFrom(InputStream inputStream) throws IOException {
            return (ConnInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static ConnInfo parseFrom(InputStream inputStream, h hVar) throws IOException {
            return (ConnInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, hVar);
        }

        public static ConnInfo parseFrom(e eVar) throws IOException {
            return (ConnInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, eVar);
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.toBuilder();
        }

        public static ConnInfo parseFrom(e eVar, h hVar) throws IOException {
            return (ConnInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, eVar, hVar);
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

            @Override // com.p1.mobile.longlink.msg.connector.LongLinkAuthMessage.LocationOrBuilder
            public float getLat() {
                return ((Location) ((GeneratedMessageLite.b) this).instance).getLat();
            }

            @Override // com.p1.mobile.longlink.msg.connector.LongLinkAuthMessage.LocationOrBuilder
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
            switch (C03021.f1625xa1df5c61[methodToInvoke.ordinal()]) {
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

        @Override // com.p1.mobile.longlink.msg.connector.LongLinkAuthMessage.LocationOrBuilder
        public float getLat() {
            return this.lat_;
        }

        @Override // com.p1.mobile.longlink.msg.connector.LongLinkAuthMessage.LocationOrBuilder
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

    public static final class PushAck extends GeneratedMessageLite<PushAck, Builder> implements PushAckOrBuilder {
        private static final PushAck DEFAULT_INSTANCE;
        public static final int ISRELIABLE_FIELD_NUMBER = 3;
        private static volatile i860<PushAck> PARSER = null;
        public static final int RECVTS_FIELD_NUMBER = 1;
        public static final int STAYSIDE_FIELD_NUMBER = 2;
        private boolean isReliable_;
        private long recvTs_;
        private int staySide_;

        public static final class Builder extends GeneratedMessageLite.b<PushAck, Builder> implements PushAckOrBuilder {
            private Builder() {
                super(PushAck.DEFAULT_INSTANCE);
            }

            public Builder clearIsReliable() {
                copyOnWrite();
                ((PushAck) ((GeneratedMessageLite.b) this).instance).clearIsReliable();
                return this;
            }

            public Builder clearRecvTs() {
                copyOnWrite();
                ((PushAck) ((GeneratedMessageLite.b) this).instance).clearRecvTs();
                return this;
            }

            public Builder clearStaySide() {
                copyOnWrite();
                ((PushAck) ((GeneratedMessageLite.b) this).instance).clearStaySide();
                return this;
            }

            @Override // com.p1.mobile.longlink.msg.connector.LongLinkAuthMessage.PushAckOrBuilder
            public boolean getIsReliable() {
                return ((PushAck) ((GeneratedMessageLite.b) this).instance).getIsReliable();
            }

            @Override // com.p1.mobile.longlink.msg.connector.LongLinkAuthMessage.PushAckOrBuilder
            public long getRecvTs() {
                return ((PushAck) ((GeneratedMessageLite.b) this).instance).getRecvTs();
            }

            @Override // com.p1.mobile.longlink.msg.connector.LongLinkAuthMessage.PushAckOrBuilder
            public AppStaySideEnum getStaySide() {
                return ((PushAck) ((GeneratedMessageLite.b) this).instance).getStaySide();
            }

            @Override // com.p1.mobile.longlink.msg.connector.LongLinkAuthMessage.PushAckOrBuilder
            public int getStaySideValue() {
                return ((PushAck) ((GeneratedMessageLite.b) this).instance).getStaySideValue();
            }

            public Builder setIsReliable(boolean z) {
                copyOnWrite();
                ((PushAck) ((GeneratedMessageLite.b) this).instance).setIsReliable(z);
                return this;
            }

            public Builder setRecvTs(long j) {
                copyOnWrite();
                ((PushAck) ((GeneratedMessageLite.b) this).instance).setRecvTs(j);
                return this;
            }

            public Builder setStaySide(AppStaySideEnum appStaySideEnum) {
                copyOnWrite();
                ((PushAck) ((GeneratedMessageLite.b) this).instance).setStaySide(appStaySideEnum);
                return this;
            }

            public Builder setStaySideValue(int i) {
                copyOnWrite();
                ((PushAck) ((GeneratedMessageLite.b) this).instance).setStaySideValue(i);
                return this;
            }
        }

        static {
            PushAck pushAck = new PushAck();
            DEFAULT_INSTANCE = pushAck;
            pushAck.makeImmutable();
        }

        private PushAck() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearIsReliable() {
            this.isReliable_ = false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearRecvTs() {
            this.recvTs_ = 0L;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearStaySide() {
            this.staySide_ = 0;
        }

        public static PushAck getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder(PushAck pushAck) {
            return (Builder) ((Builder) DEFAULT_INSTANCE.toBuilder()).mergeFrom(pushAck);
        }

        public static PushAck parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (PushAck) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static PushAck parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (PushAck) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static i860<PushAck> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setIsReliable(boolean z) {
            this.isReliable_ = z;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setRecvTs(long j) {
            this.recvTs_ = j;
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

        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            boolean z = false;
            switch (C03021.f1625xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new PushAck();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                    return null;
                case 4:
                    return new Builder();
                case 5:
                    GeneratedMessageLite.h hVar = (GeneratedMessageLite.h) obj;
                    PushAck pushAck = (PushAck) obj2;
                    long j = this.recvTs_;
                    boolean z2 = j != 0;
                    long j2 = pushAck.recvTs_;
                    this.recvTs_ = hVar.i(z2, j, j2 != 0, j2);
                    int i = this.staySide_;
                    boolean z3 = i != 0;
                    int i2 = pushAck.staySide_;
                    this.staySide_ = hVar.e(z3, i, i2 != 0, i2);
                    boolean z4 = this.isReliable_;
                    boolean z5 = pushAck.isReliable_;
                    this.isReliable_ = hVar.d(z4, z4, z5, z5);
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
                                    this.staySide_ = eVar.p();
                                } else if (iM == 24) {
                                    this.isReliable_ = eVar.m();
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
                        synchronized (PushAck.class) {
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

        @Override // com.p1.mobile.longlink.msg.connector.LongLinkAuthMessage.PushAckOrBuilder
        public boolean getIsReliable() {
            return this.isReliable_;
        }

        @Override // com.p1.mobile.longlink.msg.connector.LongLinkAuthMessage.PushAckOrBuilder
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
            if (this.staySide_ != AppStaySideEnum.APP_STAY_SIDE_FOREGROUND.getNumber()) {
                iV += CodedOutputStream.m(2, this.staySide_);
            }
            boolean z = this.isReliable_;
            if (z) {
                iV += CodedOutputStream.f(3, z);
            }
            ((GeneratedMessageLite) this).memoizedSerializedSize = iV;
            return iV;
        }

        @Override // com.p1.mobile.longlink.msg.connector.LongLinkAuthMessage.PushAckOrBuilder
        public AppStaySideEnum getStaySide() {
            AppStaySideEnum appStaySideEnumForNumber = AppStaySideEnum.forNumber(this.staySide_);
            return appStaySideEnumForNumber == null ? AppStaySideEnum.UNRECOGNIZED : appStaySideEnumForNumber;
        }

        @Override // com.p1.mobile.longlink.msg.connector.LongLinkAuthMessage.PushAckOrBuilder
        public int getStaySideValue() {
            return this.staySide_;
        }

        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            long j = this.recvTs_;
            if (j != 0) {
                codedOutputStream.u0(1, j);
            }
            if (this.staySide_ != AppStaySideEnum.APP_STAY_SIDE_FOREGROUND.getNumber()) {
                codedOutputStream.i0(2, this.staySide_);
            }
            boolean z = this.isReliable_;
            if (z) {
                codedOutputStream.a0(3, z);
            }
        }

        public static PushAck parseDelimitedFrom(InputStream inputStream, h hVar) throws IOException {
            return (PushAck) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, hVar);
        }

        public static PushAck parseFrom(ByteString byteString, h hVar) throws InvalidProtocolBufferException {
            return (PushAck) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, hVar);
        }

        public static PushAck parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (PushAck) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static PushAck parseFrom(byte[] bArr, h hVar) throws InvalidProtocolBufferException {
            return (PushAck) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, hVar);
        }

        public static PushAck parseFrom(InputStream inputStream) throws IOException {
            return (PushAck) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static PushAck parseFrom(InputStream inputStream, h hVar) throws IOException {
            return (PushAck) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, hVar);
        }

        public static PushAck parseFrom(e eVar) throws IOException {
            return (PushAck) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, eVar);
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.toBuilder();
        }

        public static PushAck parseFrom(e eVar, h hVar) throws IOException {
            return (PushAck) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, eVar, hVar);
        }
    }

    public static final class SwitchSide extends GeneratedMessageLite<SwitchSide, Builder> implements SwitchSideOrBuilder {
        private static final SwitchSide DEFAULT_INSTANCE;
        public static final int MUTE_FIELD_NUMBER = 2;
        private static volatile i860<SwitchSide> PARSER = null;
        public static final int TOSIDE_FIELD_NUMBER = 1;
        private boolean mute_;
        private int toSide_;

        public static final class Builder extends GeneratedMessageLite.b<SwitchSide, Builder> implements SwitchSideOrBuilder {
            private Builder() {
                super(SwitchSide.DEFAULT_INSTANCE);
            }

            public Builder clearMute() {
                copyOnWrite();
                ((SwitchSide) ((GeneratedMessageLite.b) this).instance).clearMute();
                return this;
            }

            public Builder clearToSide() {
                copyOnWrite();
                ((SwitchSide) ((GeneratedMessageLite.b) this).instance).clearToSide();
                return this;
            }

            @Override // com.p1.mobile.longlink.msg.connector.LongLinkAuthMessage.SwitchSideOrBuilder
            public boolean getMute() {
                return ((SwitchSide) ((GeneratedMessageLite.b) this).instance).getMute();
            }

            @Override // com.p1.mobile.longlink.msg.connector.LongLinkAuthMessage.SwitchSideOrBuilder
            public AppStaySideEnum getToSide() {
                return ((SwitchSide) ((GeneratedMessageLite.b) this).instance).getToSide();
            }

            @Override // com.p1.mobile.longlink.msg.connector.LongLinkAuthMessage.SwitchSideOrBuilder
            public int getToSideValue() {
                return ((SwitchSide) ((GeneratedMessageLite.b) this).instance).getToSideValue();
            }

            public Builder setMute(boolean z) {
                copyOnWrite();
                ((SwitchSide) ((GeneratedMessageLite.b) this).instance).setMute(z);
                return this;
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
        public void clearMute() {
            this.mute_ = false;
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
        public void setMute(boolean z) {
            this.mute_ = z;
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
            switch (C03021.f1625xa1df5c61[methodToInvoke.ordinal()]) {
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
                    boolean z3 = this.mute_;
                    boolean z4 = switchSide.mute_;
                    this.mute_ = hVar.d(z3, z3, z4, z4);
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
                                } else if (iM == 16) {
                                    this.mute_ = eVar.m();
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

        @Override // com.p1.mobile.longlink.msg.connector.LongLinkAuthMessage.SwitchSideOrBuilder
        public boolean getMute() {
            return this.mute_;
        }

        public int getSerializedSize() {
            int i = ((GeneratedMessageLite) this).memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int iM = this.toSide_ != AppStaySideEnum.APP_STAY_SIDE_FOREGROUND.getNumber() ? CodedOutputStream.m(1, this.toSide_) : 0;
            boolean z = this.mute_;
            if (z) {
                iM += CodedOutputStream.f(2, z);
            }
            ((GeneratedMessageLite) this).memoizedSerializedSize = iM;
            return iM;
        }

        @Override // com.p1.mobile.longlink.msg.connector.LongLinkAuthMessage.SwitchSideOrBuilder
        public AppStaySideEnum getToSide() {
            AppStaySideEnum appStaySideEnumForNumber = AppStaySideEnum.forNumber(this.toSide_);
            return appStaySideEnumForNumber == null ? AppStaySideEnum.UNRECOGNIZED : appStaySideEnumForNumber;
        }

        @Override // com.p1.mobile.longlink.msg.connector.LongLinkAuthMessage.SwitchSideOrBuilder
        public int getToSideValue() {
            return this.toSide_;
        }

        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (this.toSide_ != AppStaySideEnum.APP_STAY_SIDE_FOREGROUND.getNumber()) {
                codedOutputStream.i0(1, this.toSide_);
            }
            boolean z = this.mute_;
            if (z) {
                codedOutputStream.a0(2, z);
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
        public static final int APPUIVERSION_FIELD_NUMBER = 6;
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
        private String appUIVersion_ = "";

        public static final class Builder extends GeneratedMessageLite.b<UserAgent, Builder> implements UserAgentOrBuilder {
            private Builder() {
                super(UserAgent.DEFAULT_INSTANCE);
            }

            public Builder clearAppUIVersion() {
                copyOnWrite();
                ((UserAgent) ((GeneratedMessageLite.b) this).instance).clearAppUIVersion();
                return this;
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

            @Override // com.p1.mobile.longlink.msg.connector.LongLinkAuthMessage.UserAgentOrBuilder
            public String getAppUIVersion() {
                return ((UserAgent) ((GeneratedMessageLite.b) this).instance).getAppUIVersion();
            }

            @Override // com.p1.mobile.longlink.msg.connector.LongLinkAuthMessage.UserAgentOrBuilder
            public ByteString getAppUIVersionBytes() {
                return ((UserAgent) ((GeneratedMessageLite.b) this).instance).getAppUIVersionBytes();
            }

            @Override // com.p1.mobile.longlink.msg.connector.LongLinkAuthMessage.UserAgentOrBuilder
            public String getAppVersion() {
                return ((UserAgent) ((GeneratedMessageLite.b) this).instance).getAppVersion();
            }

            @Override // com.p1.mobile.longlink.msg.connector.LongLinkAuthMessage.UserAgentOrBuilder
            public ByteString getAppVersionBytes() {
                return ((UserAgent) ((GeneratedMessageLite.b) this).instance).getAppVersionBytes();
            }

            @Override // com.p1.mobile.longlink.msg.connector.LongLinkAuthMessage.UserAgentOrBuilder
            public String getBrand() {
                return ((UserAgent) ((GeneratedMessageLite.b) this).instance).getBrand();
            }

            @Override // com.p1.mobile.longlink.msg.connector.LongLinkAuthMessage.UserAgentOrBuilder
            public ByteString getBrandBytes() {
                return ((UserAgent) ((GeneratedMessageLite.b) this).instance).getBrandBytes();
            }

            @Override // com.p1.mobile.longlink.msg.connector.LongLinkAuthMessage.UserAgentOrBuilder
            public String getModel() {
                return ((UserAgent) ((GeneratedMessageLite.b) this).instance).getModel();
            }

            @Override // com.p1.mobile.longlink.msg.connector.LongLinkAuthMessage.UserAgentOrBuilder
            public ByteString getModelBytes() {
                return ((UserAgent) ((GeneratedMessageLite.b) this).instance).getModelBytes();
            }

            @Override // com.p1.mobile.longlink.msg.connector.LongLinkAuthMessage.UserAgentOrBuilder
            public ClientSourceEnum getSource() {
                return ((UserAgent) ((GeneratedMessageLite.b) this).instance).getSource();
            }

            @Override // com.p1.mobile.longlink.msg.connector.LongLinkAuthMessage.UserAgentOrBuilder
            public int getSourceValue() {
                return ((UserAgent) ((GeneratedMessageLite.b) this).instance).getSourceValue();
            }

            @Override // com.p1.mobile.longlink.msg.connector.LongLinkAuthMessage.UserAgentOrBuilder
            public String getSourceVersion() {
                return ((UserAgent) ((GeneratedMessageLite.b) this).instance).getSourceVersion();
            }

            @Override // com.p1.mobile.longlink.msg.connector.LongLinkAuthMessage.UserAgentOrBuilder
            public ByteString getSourceVersionBytes() {
                return ((UserAgent) ((GeneratedMessageLite.b) this).instance).getSourceVersionBytes();
            }

            public Builder setAppUIVersion(String str) {
                copyOnWrite();
                ((UserAgent) ((GeneratedMessageLite.b) this).instance).setAppUIVersion(str);
                return this;
            }

            public Builder setAppUIVersionBytes(ByteString byteString) {
                copyOnWrite();
                ((UserAgent) ((GeneratedMessageLite.b) this).instance).setAppUIVersionBytes(byteString);
                return this;
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
        public void clearAppUIVersion() {
            this.appUIVersion_ = getDefaultInstance().getAppUIVersion();
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
        public void setAppUIVersion(String str) {
            str.getClass();
            this.appUIVersion_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAppUIVersionBytes(ByteString byteString) {
            byteString.getClass();
            a.checkByteStringIsUtf8(byteString);
            this.appUIVersion_ = byteString.toStringUtf8();
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
            switch (C03021.f1625xa1df5c61[methodToInvoke.ordinal()]) {
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
                    this.appUIVersion_ = hVar.f(!this.appUIVersion_.isEmpty(), this.appUIVersion_, !userAgent.appUIVersion_.isEmpty(), userAgent.appUIVersion_);
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
                                } else if (iM == 50) {
                                    this.appUIVersion_ = eVar.L();
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

        @Override // com.p1.mobile.longlink.msg.connector.LongLinkAuthMessage.UserAgentOrBuilder
        public String getAppUIVersion() {
            return this.appUIVersion_;
        }

        @Override // com.p1.mobile.longlink.msg.connector.LongLinkAuthMessage.UserAgentOrBuilder
        public ByteString getAppUIVersionBytes() {
            return ByteString.copyFromUtf8(this.appUIVersion_);
        }

        @Override // com.p1.mobile.longlink.msg.connector.LongLinkAuthMessage.UserAgentOrBuilder
        public String getAppVersion() {
            return this.appVersion_;
        }

        @Override // com.p1.mobile.longlink.msg.connector.LongLinkAuthMessage.UserAgentOrBuilder
        public ByteString getAppVersionBytes() {
            return ByteString.copyFromUtf8(this.appVersion_);
        }

        @Override // com.p1.mobile.longlink.msg.connector.LongLinkAuthMessage.UserAgentOrBuilder
        public String getBrand() {
            return this.brand_;
        }

        @Override // com.p1.mobile.longlink.msg.connector.LongLinkAuthMessage.UserAgentOrBuilder
        public ByteString getBrandBytes() {
            return ByteString.copyFromUtf8(this.brand_);
        }

        @Override // com.p1.mobile.longlink.msg.connector.LongLinkAuthMessage.UserAgentOrBuilder
        public String getModel() {
            return this.model_;
        }

        @Override // com.p1.mobile.longlink.msg.connector.LongLinkAuthMessage.UserAgentOrBuilder
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
            if (!this.appUIVersion_.isEmpty()) {
                iM += CodedOutputStream.K(6, getAppUIVersion());
            }
            ((GeneratedMessageLite) this).memoizedSerializedSize = iM;
            return iM;
        }

        @Override // com.p1.mobile.longlink.msg.connector.LongLinkAuthMessage.UserAgentOrBuilder
        public ClientSourceEnum getSource() {
            ClientSourceEnum clientSourceEnumForNumber = ClientSourceEnum.forNumber(this.source_);
            return clientSourceEnumForNumber == null ? ClientSourceEnum.UNRECOGNIZED : clientSourceEnumForNumber;
        }

        @Override // com.p1.mobile.longlink.msg.connector.LongLinkAuthMessage.UserAgentOrBuilder
        public int getSourceValue() {
            return this.source_;
        }

        @Override // com.p1.mobile.longlink.msg.connector.LongLinkAuthMessage.UserAgentOrBuilder
        public String getSourceVersion() {
            return this.sourceVersion_;
        }

        @Override // com.p1.mobile.longlink.msg.connector.LongLinkAuthMessage.UserAgentOrBuilder
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
            if (!this.model_.isEmpty()) {
                codedOutputStream.D0(5, getModel());
            }
            if (this.appUIVersion_.isEmpty()) {
                return;
            }
            codedOutputStream.D0(6, getAppUIVersion());
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
