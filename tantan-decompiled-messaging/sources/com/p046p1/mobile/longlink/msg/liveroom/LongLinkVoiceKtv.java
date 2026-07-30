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
import com.p046p1.mobile.longlink.msg.userMask.userMaskConfig;
import java.io.IOException;
import java.io.InputStream;
import org.spongycastle.asn1.eac.EACTags;
import org.spongycastle.crypto.tls.CipherSuite;
import p149l.aag0;
import p149l.bz00;
import p149l.i860;
import p149l.o6z;

/* JADX INFO: loaded from: classes8.dex */
public final class LongLinkVoiceKtv {

    /* JADX INFO: renamed from: com.p1.mobile.longlink.msg.liveroom.LongLinkVoiceKtv$1 */
    public static /* synthetic */ class C45231 {

        /* JADX INFO: renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f15982xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f15982xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f15982xa1df5c61[GeneratedMessageLite.MethodToInvoke.IS_INITIALIZED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f15982xa1df5c61[GeneratedMessageLite.MethodToInvoke.MAKE_IMMUTABLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f15982xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f15982xa1df5c61[GeneratedMessageLite.MethodToInvoke.VISIT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f15982xa1df5c61[GeneratedMessageLite.MethodToInvoke.MERGE_FROM_STREAM.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f15982xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f15982xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    public interface PanelBgInfoOrBuilder extends o6z {
        @Override // p149l.o6z
        /* synthetic */ InterfaceC3419q getDefaultInstanceForType();

        int getRemainSeconds();

        long getUpdatedTime();

        String getUrl();

        ByteString getUrlBytes();

        @Override // p149l.o6z
        /* synthetic */ boolean isInitialized();
    }

    public interface PlayInfoOrBuilder extends o6z {
        String getAuthor();

        ByteString getAuthorBytes();

        String getBestSingerName();

        ByteString getBestSingerNameBytes();

        String getCover();

        ByteString getCoverBytes();

        @Override // p149l.o6z
        /* synthetic */ InterfaceC3419q getDefaultInstanceForType();

        int getDurationSecond();

        int getGiftUv();

        int getLevel();

        String getLevelTip();

        ByteString getLevelTipBytes();

        String getLyricType();

        ByteString getLyricTypeBytes();

        String getLyricUrl();

        ByteString getLyricUrlBytes();

        userMaskConfig.UserMask getMask();

        int getMaxLevel();

        int getNextLevelGiftUv();

        String getOrderId();

        ByteString getOrderIdBytes();

        int getPrepareRemainSeconds();

        String getProvider();

        ByteString getProviderBytes();

        QuickGiftInfo getQuickGiftInfo();

        String getSchema();

        ByteString getSchemaBytes();

        long getScore();

        String getShowBgSvgaUrl();

        ByteString getShowBgSvgaUrlBytes();

        boolean getShowLevel();

        String getSongCode();

        ByteString getSongCodeBytes();

        String getSongUrl();

        ByteString getSongUrlBytes();

        String getStatus();

        ByteString getStatusBytes();

        String getTitle();

        ByteString getTitleBytes();

        String getUserId();

        ByteString getUserIdBytes();

        boolean hasMask();

        boolean hasQuickGiftInfo();

        @Override // p149l.o6z
        /* synthetic */ boolean isInitialized();
    }

    public interface QuickGiftInfoOrBuilder extends o6z {
        @Override // p149l.o6z
        /* synthetic */ InterfaceC3419q getDefaultInstanceForType();

        long getGiftId();

        String getName();

        ByteString getNameBytes();

        String getUrl();

        ByteString getUrlBytes();

        @Override // p149l.o6z
        /* synthetic */ boolean isInitialized();
    }

    public interface VoiceKTVBubbleOrBuilder extends o6z {
        String getContent();

        ByteString getContentBytes();

        @Override // p149l.o6z
        /* synthetic */ InterfaceC3419q getDefaultInstanceForType();

        String getGameId();

        ByteString getGameIdBytes();

        @Override // p149l.o6z
        /* synthetic */ boolean isInitialized();
    }

    public interface VoiceKTVGameOrBuilder extends o6z {
        String getBackgroundUrl();

        ByteString getBackgroundUrlBytes();

        @Override // p149l.o6z
        /* synthetic */ InterfaceC3419q getDefaultInstanceForType();

        String getId();

        ByteString getIdBytes();

        PlayInfo getNextPlayInfo();

        PanelBgInfo getPanelBgInfo();

        PlayInfo getPlayInfo();

        String getStatus();

        ByteString getStatusBytes();

        String getToast();

        ByteString getToastBytes();

        boolean hasNextPlayInfo();

        boolean hasPanelBgInfo();

        boolean hasPlayInfo();

        @Override // p149l.o6z
        /* synthetic */ boolean isInitialized();
    }

    public interface VoiceKTVOrderRatingOrBuilder extends o6z {
        @Override // p149l.o6z
        /* synthetic */ InterfaceC3419q getDefaultInstanceForType();

        int getGiftUv();

        int getLevel();

        String getLevelTip();

        ByteString getLevelTipBytes();

        int getMaxLevel();

        int getNextLevelGiftUv();

        String getOrderId();

        ByteString getOrderIdBytes();

        String getSchema();

        ByteString getSchemaBytes();

        int getScore();

        String getShowBgSvgaUrl();

        ByteString getShowBgSvgaUrlBytes();

        @Override // p149l.o6z
        /* synthetic */ boolean isInitialized();
    }

    public interface VoiceKTVOrderRefreshOrBuilder extends o6z {
        VoiceKTVOrderRefresh.Action getAction();

        int getActionValue();

        @Override // p149l.o6z
        /* synthetic */ InterfaceC3419q getDefaultInstanceForType();

        String getLiveId();

        ByteString getLiveIdBytes();

        String getUserId();

        ByteString getUserIdBytes();

        @Override // p149l.o6z
        /* synthetic */ boolean isInitialized();
    }

    public interface VoiceKTVPanelBgOrBuilder extends o6z {
        @Override // p149l.o6z
        /* synthetic */ InterfaceC3419q getDefaultInstanceForType();

        String getGameId();

        ByteString getGameIdBytes();

        int getRemainSeconds();

        long getUpdatedTime();

        String getUrl();

        ByteString getUrlBytes();

        String getUserId();

        ByteString getUserIdBytes();

        @Override // p149l.o6z
        /* synthetic */ boolean isInitialized();
    }

    private LongLinkVoiceKtv() {
    }

    public static void registerAllExtensions(C3410h c3410h) {
    }

    public static final class VoiceKTVOrderRefresh extends GeneratedMessageLite<VoiceKTVOrderRefresh, Builder> implements VoiceKTVOrderRefreshOrBuilder {
        public static final int ACTION_FIELD_NUMBER = 3;
        private static final VoiceKTVOrderRefresh DEFAULT_INSTANCE;
        public static final int LIVEID_FIELD_NUMBER = 1;
        private static volatile i860<VoiceKTVOrderRefresh> PARSER = null;
        public static final int USERID_FIELD_NUMBER = 2;
        private int action_;
        private String liveId_ = "";
        private String userId_ = "";

        public static final class Builder extends GeneratedMessageLite.AbstractC3380b<VoiceKTVOrderRefresh, Builder> implements VoiceKTVOrderRefreshOrBuilder {
            private Builder() {
                super(VoiceKTVOrderRefresh.DEFAULT_INSTANCE);
            }

            public Builder clearAction() {
                copyOnWrite();
                ((VoiceKTVOrderRefresh) this.instance).clearAction();
                return this;
            }

            public Builder clearLiveId() {
                copyOnWrite();
                ((VoiceKTVOrderRefresh) this.instance).clearLiveId();
                return this;
            }

            public Builder clearUserId() {
                copyOnWrite();
                ((VoiceKTVOrderRefresh) this.instance).clearUserId();
                return this;
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVoiceKtv.VoiceKTVOrderRefreshOrBuilder
            public Action getAction() {
                return ((VoiceKTVOrderRefresh) this.instance).getAction();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVoiceKtv.VoiceKTVOrderRefreshOrBuilder
            public int getActionValue() {
                return ((VoiceKTVOrderRefresh) this.instance).getActionValue();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVoiceKtv.VoiceKTVOrderRefreshOrBuilder
            public String getLiveId() {
                return ((VoiceKTVOrderRefresh) this.instance).getLiveId();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVoiceKtv.VoiceKTVOrderRefreshOrBuilder
            public ByteString getLiveIdBytes() {
                return ((VoiceKTVOrderRefresh) this.instance).getLiveIdBytes();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVoiceKtv.VoiceKTVOrderRefreshOrBuilder
            public String getUserId() {
                return ((VoiceKTVOrderRefresh) this.instance).getUserId();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVoiceKtv.VoiceKTVOrderRefreshOrBuilder
            public ByteString getUserIdBytes() {
                return ((VoiceKTVOrderRefresh) this.instance).getUserIdBytes();
            }

            public Builder setAction(Action action) {
                copyOnWrite();
                ((VoiceKTVOrderRefresh) this.instance).setAction(action);
                return this;
            }

            public Builder setActionValue(int i) {
                copyOnWrite();
                ((VoiceKTVOrderRefresh) this.instance).setActionValue(i);
                return this;
            }

            public Builder setLiveId(String str) {
                copyOnWrite();
                ((VoiceKTVOrderRefresh) this.instance).setLiveId(str);
                return this;
            }

            public Builder setLiveIdBytes(ByteString byteString) {
                copyOnWrite();
                ((VoiceKTVOrderRefresh) this.instance).setLiveIdBytes(byteString);
                return this;
            }

            public Builder setUserId(String str) {
                copyOnWrite();
                ((VoiceKTVOrderRefresh) this.instance).setUserId(str);
                return this;
            }

            public Builder setUserIdBytes(ByteString byteString) {
                copyOnWrite();
                ((VoiceKTVOrderRefresh) this.instance).setUserIdBytes(byteString);
                return this;
            }
        }

        static {
            VoiceKTVOrderRefresh voiceKTVOrderRefresh = new VoiceKTVOrderRefresh();
            DEFAULT_INSTANCE = voiceKTVOrderRefresh;
            voiceKTVOrderRefresh.makeImmutable();
        }

        private VoiceKTVOrderRefresh() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAction() {
            this.action_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearLiveId() {
            this.liveId_ = getDefaultInstance().getLiveId();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearUserId() {
            this.userId_ = getDefaultInstance().getUserId();
        }

        public static VoiceKTVOrderRefresh getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder(VoiceKTVOrderRefresh voiceKTVOrderRefresh) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(voiceKTVOrderRefresh);
        }

        public static VoiceKTVOrderRefresh parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (VoiceKTVOrderRefresh) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static VoiceKTVOrderRefresh parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (VoiceKTVOrderRefresh) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static i860<VoiceKTVOrderRefresh> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAction(Action action) {
            action.getClass();
            this.action_ = action.getNumber();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setActionValue(int i) {
            this.action_ = i;
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

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            boolean z = false;
            switch (C45231.f15982xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new VoiceKTVOrderRefresh();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                    return null;
                case 4:
                    return new Builder();
                case 5:
                    GeneratedMessageLite.InterfaceC3386h interfaceC3386h = (GeneratedMessageLite.InterfaceC3386h) obj;
                    VoiceKTVOrderRefresh voiceKTVOrderRefresh = (VoiceKTVOrderRefresh) obj2;
                    this.liveId_ = interfaceC3386h.mo16997f(!this.liveId_.isEmpty(), this.liveId_, !voiceKTVOrderRefresh.liveId_.isEmpty(), voiceKTVOrderRefresh.liveId_);
                    this.userId_ = interfaceC3386h.mo16997f(!this.userId_.isEmpty(), this.userId_, !voiceKTVOrderRefresh.userId_.isEmpty(), voiceKTVOrderRefresh.userId_);
                    int i = this.action_;
                    boolean z2 = i != 0;
                    int i2 = voiceKTVOrderRefresh.action_;
                    this.action_ = interfaceC3386h.mo16996e(z2, i, i2 != 0, i2);
                    GeneratedMessageLite.C3385g c3385g = GeneratedMessageLite.C3385g.INSTANCE;
                    return this;
                case 6:
                    C3407e c3407e = (C3407e) obj;
                    while (!z) {
                        try {
                            int iM17116M = c3407e.m17116M();
                            if (iM17116M != 0) {
                                if (iM17116M == 10) {
                                    this.liveId_ = c3407e.m17115L();
                                } else if (iM17116M == 18) {
                                    this.userId_ = c3407e.m17115L();
                                } else if (iM17116M == 24) {
                                    this.action_ = c3407e.m17136p();
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
                        synchronized (VoiceKTVOrderRefresh.class) {
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

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVoiceKtv.VoiceKTVOrderRefreshOrBuilder
        public Action getAction() {
            Action actionForNumber = Action.forNumber(this.action_);
            return actionForNumber == null ? Action.UNRECOGNIZED : actionForNumber;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVoiceKtv.VoiceKTVOrderRefreshOrBuilder
        public int getActionValue() {
            return this.action_;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVoiceKtv.VoiceKTVOrderRefreshOrBuilder
        public String getLiveId() {
            return this.liveId_;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVoiceKtv.VoiceKTVOrderRefreshOrBuilder
        public ByteString getLiveIdBytes() {
            return ByteString.copyFromUtf8(this.liveId_);
        }

        @Override // com.google.protobuf.InterfaceC3419q
        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int iM16901K = !this.liveId_.isEmpty() ? CodedOutputStream.m16901K(1, getLiveId()) : 0;
            if (!this.userId_.isEmpty()) {
                iM16901K += CodedOutputStream.m16901K(2, getUserId());
            }
            if (this.action_ != Action.ADD.getNumber()) {
                iM16901K += CodedOutputStream.m16922m(3, this.action_);
            }
            this.memoizedSerializedSize = iM16901K;
            return iM16901K;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVoiceKtv.VoiceKTVOrderRefreshOrBuilder
        public String getUserId() {
            return this.userId_;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVoiceKtv.VoiceKTVOrderRefreshOrBuilder
        public ByteString getUserIdBytes() {
            return ByteString.copyFromUtf8(this.userId_);
        }

        @Override // com.google.protobuf.InterfaceC3419q
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (!this.liveId_.isEmpty()) {
                codedOutputStream.mo16939D0(1, getLiveId());
            }
            if (!this.userId_.isEmpty()) {
                codedOutputStream.mo16939D0(2, getUserId());
            }
            if (this.action_ != Action.ADD.getNumber()) {
                codedOutputStream.m16960i0(3, this.action_);
            }
        }

        public enum Action implements C3414l.c {
            ADD(0),
            REMOVE(1),
            UNRECOGNIZED(-1);

            public static final int ADD_VALUE = 0;
            public static final int REMOVE_VALUE = 1;
            private static final C3414l.d<Action> internalValueMap = new C3414l.d<Action>() { // from class: com.p1.mobile.longlink.msg.liveroom.LongLinkVoiceKtv.VoiceKTVOrderRefresh.Action.1
                @Override // com.google.protobuf.C3414l.d
                public Action findValueByNumber(int i) {
                    return Action.forNumber(i);
                }
            };
            private final int value;

            Action(int i) {
                this.value = i;
            }

            public static Action forNumber(int i) {
                if (i == 0) {
                    return ADD;
                }
                if (i != 1) {
                    return null;
                }
                return REMOVE;
            }

            public static C3414l.d<Action> internalGetValueMap() {
                return internalValueMap;
            }

            @Override // com.google.protobuf.C3414l.c
            public final int getNumber() {
                return this.value;
            }

            @Deprecated
            public static Action valueOf(int i) {
                return forNumber(i);
            }
        }

        public static VoiceKTVOrderRefresh parseDelimitedFrom(InputStream inputStream, C3410h c3410h) throws IOException {
            return (VoiceKTVOrderRefresh) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, c3410h);
        }

        public static VoiceKTVOrderRefresh parseFrom(ByteString byteString, C3410h c3410h) throws InvalidProtocolBufferException {
            return (VoiceKTVOrderRefresh) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, c3410h);
        }

        public static VoiceKTVOrderRefresh parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (VoiceKTVOrderRefresh) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static VoiceKTVOrderRefresh parseFrom(byte[] bArr, C3410h c3410h) throws InvalidProtocolBufferException {
            return (VoiceKTVOrderRefresh) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, c3410h);
        }

        public static VoiceKTVOrderRefresh parseFrom(InputStream inputStream) throws IOException {
            return (VoiceKTVOrderRefresh) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static VoiceKTVOrderRefresh parseFrom(InputStream inputStream, C3410h c3410h) throws IOException {
            return (VoiceKTVOrderRefresh) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, c3410h);
        }

        public static VoiceKTVOrderRefresh parseFrom(C3407e c3407e) throws IOException {
            return (VoiceKTVOrderRefresh) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, c3407e);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static VoiceKTVOrderRefresh parseFrom(C3407e c3407e, C3410h c3410h) throws IOException {
            return (VoiceKTVOrderRefresh) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, c3407e, c3410h);
        }
    }

    public static final class PanelBgInfo extends GeneratedMessageLite<PanelBgInfo, Builder> implements PanelBgInfoOrBuilder {
        private static final PanelBgInfo DEFAULT_INSTANCE;
        private static volatile i860<PanelBgInfo> PARSER = null;
        public static final int REMAINSECONDS_FIELD_NUMBER = 2;
        public static final int UPDATEDTIME_FIELD_NUMBER = 3;
        public static final int URL_FIELD_NUMBER = 1;
        private int remainSeconds_;
        private long updatedTime_;
        private String url_ = "";

        public static final class Builder extends GeneratedMessageLite.AbstractC3380b<PanelBgInfo, Builder> implements PanelBgInfoOrBuilder {
            private Builder() {
                super(PanelBgInfo.DEFAULT_INSTANCE);
            }

            public Builder clearRemainSeconds() {
                copyOnWrite();
                ((PanelBgInfo) this.instance).clearRemainSeconds();
                return this;
            }

            public Builder clearUpdatedTime() {
                copyOnWrite();
                ((PanelBgInfo) this.instance).clearUpdatedTime();
                return this;
            }

            public Builder clearUrl() {
                copyOnWrite();
                ((PanelBgInfo) this.instance).clearUrl();
                return this;
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVoiceKtv.PanelBgInfoOrBuilder
            public int getRemainSeconds() {
                return ((PanelBgInfo) this.instance).getRemainSeconds();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVoiceKtv.PanelBgInfoOrBuilder
            public long getUpdatedTime() {
                return ((PanelBgInfo) this.instance).getUpdatedTime();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVoiceKtv.PanelBgInfoOrBuilder
            public String getUrl() {
                return ((PanelBgInfo) this.instance).getUrl();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVoiceKtv.PanelBgInfoOrBuilder
            public ByteString getUrlBytes() {
                return ((PanelBgInfo) this.instance).getUrlBytes();
            }

            public Builder setRemainSeconds(int i) {
                copyOnWrite();
                ((PanelBgInfo) this.instance).setRemainSeconds(i);
                return this;
            }

            public Builder setUpdatedTime(long j) {
                copyOnWrite();
                ((PanelBgInfo) this.instance).setUpdatedTime(j);
                return this;
            }

            public Builder setUrl(String str) {
                copyOnWrite();
                ((PanelBgInfo) this.instance).setUrl(str);
                return this;
            }

            public Builder setUrlBytes(ByteString byteString) {
                copyOnWrite();
                ((PanelBgInfo) this.instance).setUrlBytes(byteString);
                return this;
            }
        }

        static {
            PanelBgInfo panelBgInfo = new PanelBgInfo();
            DEFAULT_INSTANCE = panelBgInfo;
            panelBgInfo.makeImmutable();
        }

        private PanelBgInfo() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearRemainSeconds() {
            this.remainSeconds_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearUpdatedTime() {
            this.updatedTime_ = 0L;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearUrl() {
            this.url_ = getDefaultInstance().getUrl();
        }

        public static PanelBgInfo getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder(PanelBgInfo panelBgInfo) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(panelBgInfo);
        }

        public static PanelBgInfo parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (PanelBgInfo) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static PanelBgInfo parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (PanelBgInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static i860<PanelBgInfo> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setRemainSeconds(int i) {
            this.remainSeconds_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setUpdatedTime(long j) {
            this.updatedTime_ = j;
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
            switch (C45231.f15982xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new PanelBgInfo();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                    return null;
                case 4:
                    return new Builder();
                case 5:
                    GeneratedMessageLite.InterfaceC3386h interfaceC3386h = (GeneratedMessageLite.InterfaceC3386h) obj;
                    PanelBgInfo panelBgInfo = (PanelBgInfo) obj2;
                    this.url_ = interfaceC3386h.mo16997f(!this.url_.isEmpty(), this.url_, !panelBgInfo.url_.isEmpty(), panelBgInfo.url_);
                    int i = this.remainSeconds_;
                    boolean z2 = i != 0;
                    int i2 = panelBgInfo.remainSeconds_;
                    this.remainSeconds_ = interfaceC3386h.mo16996e(z2, i, i2 != 0, i2);
                    long j = this.updatedTime_;
                    boolean z3 = j != 0;
                    long j2 = panelBgInfo.updatedTime_;
                    this.updatedTime_ = interfaceC3386h.mo17000i(z3, j, j2 != 0, j2);
                    GeneratedMessageLite.C3385g c3385g = GeneratedMessageLite.C3385g.INSTANCE;
                    return this;
                case 6:
                    C3407e c3407e = (C3407e) obj;
                    while (!z) {
                        try {
                            int iM17116M = c3407e.m17116M();
                            if (iM17116M != 0) {
                                if (iM17116M == 10) {
                                    this.url_ = c3407e.m17115L();
                                } else if (iM17116M == 16) {
                                    this.remainSeconds_ = c3407e.m17141u();
                                } else if (iM17116M == 24) {
                                    this.updatedTime_ = c3407e.m17142v();
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
                        synchronized (PanelBgInfo.class) {
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

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVoiceKtv.PanelBgInfoOrBuilder
        public int getRemainSeconds() {
            return this.remainSeconds_;
        }

        @Override // com.google.protobuf.InterfaceC3419q
        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int iM16901K = !this.url_.isEmpty() ? CodedOutputStream.m16901K(1, getUrl()) : 0;
            int i2 = this.remainSeconds_;
            if (i2 != 0) {
                iM16901K += CodedOutputStream.m16929t(2, i2);
            }
            long j = this.updatedTime_;
            if (j != 0) {
                iM16901K += CodedOutputStream.m16931v(3, j);
            }
            this.memoizedSerializedSize = iM16901K;
            return iM16901K;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVoiceKtv.PanelBgInfoOrBuilder
        public long getUpdatedTime() {
            return this.updatedTime_;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVoiceKtv.PanelBgInfoOrBuilder
        public String getUrl() {
            return this.url_;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVoiceKtv.PanelBgInfoOrBuilder
        public ByteString getUrlBytes() {
            return ByteString.copyFromUtf8(this.url_);
        }

        @Override // com.google.protobuf.InterfaceC3419q
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (!this.url_.isEmpty()) {
                codedOutputStream.mo16939D0(1, getUrl());
            }
            int i = this.remainSeconds_;
            if (i != 0) {
                codedOutputStream.mo16970s0(2, i);
            }
            long j = this.updatedTime_;
            if (j != 0) {
                codedOutputStream.m16972u0(3, j);
            }
        }

        public static PanelBgInfo parseDelimitedFrom(InputStream inputStream, C3410h c3410h) throws IOException {
            return (PanelBgInfo) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, c3410h);
        }

        public static PanelBgInfo parseFrom(ByteString byteString, C3410h c3410h) throws InvalidProtocolBufferException {
            return (PanelBgInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, c3410h);
        }

        public static PanelBgInfo parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (PanelBgInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static PanelBgInfo parseFrom(byte[] bArr, C3410h c3410h) throws InvalidProtocolBufferException {
            return (PanelBgInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, c3410h);
        }

        public static PanelBgInfo parseFrom(InputStream inputStream) throws IOException {
            return (PanelBgInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static PanelBgInfo parseFrom(InputStream inputStream, C3410h c3410h) throws IOException {
            return (PanelBgInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, c3410h);
        }

        public static PanelBgInfo parseFrom(C3407e c3407e) throws IOException {
            return (PanelBgInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, c3407e);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static PanelBgInfo parseFrom(C3407e c3407e, C3410h c3410h) throws IOException {
            return (PanelBgInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, c3407e, c3410h);
        }
    }

    public static final class PlayInfo extends GeneratedMessageLite<PlayInfo, Builder> implements PlayInfoOrBuilder {
        public static final int AUTHOR_FIELD_NUMBER = 12;
        public static final int BESTSINGERNAME_FIELD_NUMBER = 22;
        public static final int COVER_FIELD_NUMBER = 13;
        private static final PlayInfo DEFAULT_INSTANCE;
        public static final int DURATIONSECOND_FIELD_NUMBER = 11;
        public static final int GIFTUV_FIELD_NUMBER = 24;
        public static final int LEVELTIP_FIELD_NUMBER = 19;
        public static final int LEVEL_FIELD_NUMBER = 17;
        public static final int LYRICTYPE_FIELD_NUMBER = 7;
        public static final int LYRICURL_FIELD_NUMBER = 6;
        public static final int MASK_FIELD_NUMBER = 4;
        public static final int MAXLEVEL_FIELD_NUMBER = 18;
        public static final int NEXTLEVELGIFTUV_FIELD_NUMBER = 25;
        public static final int ORDERID_FIELD_NUMBER = 1;
        private static volatile i860<PlayInfo> PARSER = null;
        public static final int PREPAREREMAINSECONDS_FIELD_NUMBER = 9;
        public static final int PROVIDER_FIELD_NUMBER = 15;
        public static final int QUICKGIFTINFO_FIELD_NUMBER = 14;
        public static final int SCHEMA_FIELD_NUMBER = 21;
        public static final int SCORE_FIELD_NUMBER = 20;
        public static final int SHOWBGSVGAURL_FIELD_NUMBER = 23;
        public static final int SHOWLEVEL_FIELD_NUMBER = 16;
        public static final int SONGCODE_FIELD_NUMBER = 2;
        public static final int SONGURL_FIELD_NUMBER = 8;
        public static final int STATUS_FIELD_NUMBER = 10;
        public static final int TITLE_FIELD_NUMBER = 5;
        public static final int USERID_FIELD_NUMBER = 3;
        private int durationSecond_;
        private int giftUv_;
        private int level_;
        private userMaskConfig.UserMask mask_;
        private int maxLevel_;
        private int nextLevelGiftUv_;
        private int prepareRemainSeconds_;
        private QuickGiftInfo quickGiftInfo_;
        private long score_;
        private boolean showLevel_;
        private String orderId_ = "";
        private String songCode_ = "";
        private String userId_ = "";
        private String title_ = "";
        private String lyricUrl_ = "";
        private String lyricType_ = "";
        private String songUrl_ = "";
        private String status_ = "";
        private String author_ = "";
        private String cover_ = "";
        private String provider_ = "";
        private String levelTip_ = "";
        private String schema_ = "";
        private String bestSingerName_ = "";
        private String showBgSvgaUrl_ = "";

        static {
            PlayInfo playInfo = new PlayInfo();
            DEFAULT_INSTANCE = playInfo;
            playInfo.makeImmutable();
        }

        private PlayInfo() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAuthor() {
            this.author_ = getDefaultInstance().getAuthor();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearBestSingerName() {
            this.bestSingerName_ = getDefaultInstance().getBestSingerName();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearCover() {
            this.cover_ = getDefaultInstance().getCover();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearDurationSecond() {
            this.durationSecond_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearGiftUv() {
            this.giftUv_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearLevel() {
            this.level_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearLevelTip() {
            this.levelTip_ = getDefaultInstance().getLevelTip();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearLyricType() {
            this.lyricType_ = getDefaultInstance().getLyricType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearLyricUrl() {
            this.lyricUrl_ = getDefaultInstance().getLyricUrl();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearMask() {
            this.mask_ = null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearMaxLevel() {
            this.maxLevel_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearNextLevelGiftUv() {
            this.nextLevelGiftUv_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearOrderId() {
            this.orderId_ = getDefaultInstance().getOrderId();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearPrepareRemainSeconds() {
            this.prepareRemainSeconds_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearProvider() {
            this.provider_ = getDefaultInstance().getProvider();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearQuickGiftInfo() {
            this.quickGiftInfo_ = null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearSchema() {
            this.schema_ = getDefaultInstance().getSchema();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearScore() {
            this.score_ = 0L;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearShowBgSvgaUrl() {
            this.showBgSvgaUrl_ = getDefaultInstance().getShowBgSvgaUrl();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearShowLevel() {
            this.showLevel_ = false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearSongCode() {
            this.songCode_ = getDefaultInstance().getSongCode();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearSongUrl() {
            this.songUrl_ = getDefaultInstance().getSongUrl();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearStatus() {
            this.status_ = getDefaultInstance().getStatus();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearTitle() {
            this.title_ = getDefaultInstance().getTitle();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearUserId() {
            this.userId_ = getDefaultInstance().getUserId();
        }

        public static PlayInfo getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeMask(userMaskConfig.UserMask userMask) {
            userMaskConfig.UserMask userMask2 = this.mask_;
            if (userMask2 == null || userMask2 == userMaskConfig.UserMask.getDefaultInstance()) {
                this.mask_ = userMask;
            } else {
                this.mask_ = userMaskConfig.UserMask.newBuilder(this.mask_).mergeFrom(userMask).buildPartial();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeQuickGiftInfo(QuickGiftInfo quickGiftInfo) {
            QuickGiftInfo quickGiftInfo2 = this.quickGiftInfo_;
            if (quickGiftInfo2 == null || quickGiftInfo2 == QuickGiftInfo.getDefaultInstance()) {
                this.quickGiftInfo_ = quickGiftInfo;
            } else {
                this.quickGiftInfo_ = QuickGiftInfo.newBuilder(this.quickGiftInfo_).mergeFrom(quickGiftInfo).buildPartial();
            }
        }

        public static Builder newBuilder(PlayInfo playInfo) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(playInfo);
        }

        public static PlayInfo parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (PlayInfo) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static PlayInfo parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (PlayInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static i860<PlayInfo> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAuthor(String str) {
            str.getClass();
            this.author_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAuthorBytes(ByteString byteString) {
            byteString.getClass();
            AbstractC3403a.checkByteStringIsUtf8(byteString);
            this.author_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setBestSingerName(String str) {
            str.getClass();
            this.bestSingerName_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setBestSingerNameBytes(ByteString byteString) {
            byteString.getClass();
            AbstractC3403a.checkByteStringIsUtf8(byteString);
            this.bestSingerName_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setCover(String str) {
            str.getClass();
            this.cover_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setCoverBytes(ByteString byteString) {
            byteString.getClass();
            AbstractC3403a.checkByteStringIsUtf8(byteString);
            this.cover_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setDurationSecond(int i) {
            this.durationSecond_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setGiftUv(int i) {
            this.giftUv_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setLevel(int i) {
            this.level_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setLevelTip(String str) {
            str.getClass();
            this.levelTip_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setLevelTipBytes(ByteString byteString) {
            byteString.getClass();
            AbstractC3403a.checkByteStringIsUtf8(byteString);
            this.levelTip_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setLyricType(String str) {
            str.getClass();
            this.lyricType_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setLyricTypeBytes(ByteString byteString) {
            byteString.getClass();
            AbstractC3403a.checkByteStringIsUtf8(byteString);
            this.lyricType_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setLyricUrl(String str) {
            str.getClass();
            this.lyricUrl_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setLyricUrlBytes(ByteString byteString) {
            byteString.getClass();
            AbstractC3403a.checkByteStringIsUtf8(byteString);
            this.lyricUrl_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setMask(userMaskConfig.UserMask.Builder builder) {
            this.mask_ = builder.build();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setMaxLevel(int i) {
            this.maxLevel_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setNextLevelGiftUv(int i) {
            this.nextLevelGiftUv_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setOrderId(String str) {
            str.getClass();
            this.orderId_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setOrderIdBytes(ByteString byteString) {
            byteString.getClass();
            AbstractC3403a.checkByteStringIsUtf8(byteString);
            this.orderId_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setPrepareRemainSeconds(int i) {
            this.prepareRemainSeconds_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setProvider(String str) {
            str.getClass();
            this.provider_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setProviderBytes(ByteString byteString) {
            byteString.getClass();
            AbstractC3403a.checkByteStringIsUtf8(byteString);
            this.provider_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setQuickGiftInfo(QuickGiftInfo.Builder builder) {
            this.quickGiftInfo_ = builder.build();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSchema(String str) {
            str.getClass();
            this.schema_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSchemaBytes(ByteString byteString) {
            byteString.getClass();
            AbstractC3403a.checkByteStringIsUtf8(byteString);
            this.schema_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setScore(long j) {
            this.score_ = j;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setShowBgSvgaUrl(String str) {
            str.getClass();
            this.showBgSvgaUrl_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setShowBgSvgaUrlBytes(ByteString byteString) {
            byteString.getClass();
            AbstractC3403a.checkByteStringIsUtf8(byteString);
            this.showBgSvgaUrl_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setShowLevel(boolean z) {
            this.showLevel_ = z;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSongCode(String str) {
            str.getClass();
            this.songCode_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSongCodeBytes(ByteString byteString) {
            byteString.getClass();
            AbstractC3403a.checkByteStringIsUtf8(byteString);
            this.songCode_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSongUrl(String str) {
            str.getClass();
            this.songUrl_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSongUrlBytes(ByteString byteString) {
            byteString.getClass();
            AbstractC3403a.checkByteStringIsUtf8(byteString);
            this.songUrl_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setStatus(String str) {
            str.getClass();
            this.status_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setStatusBytes(ByteString byteString) {
            byteString.getClass();
            AbstractC3403a.checkByteStringIsUtf8(byteString);
            this.status_ = byteString.toStringUtf8();
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

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            boolean z = false;
            switch (C45231.f15982xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new PlayInfo();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                    return null;
                case 4:
                    return new Builder();
                case 5:
                    GeneratedMessageLite.InterfaceC3386h interfaceC3386h = (GeneratedMessageLite.InterfaceC3386h) obj;
                    PlayInfo playInfo = (PlayInfo) obj2;
                    this.orderId_ = interfaceC3386h.mo16997f(!this.orderId_.isEmpty(), this.orderId_, !playInfo.orderId_.isEmpty(), playInfo.orderId_);
                    this.songCode_ = interfaceC3386h.mo16997f(!this.songCode_.isEmpty(), this.songCode_, !playInfo.songCode_.isEmpty(), playInfo.songCode_);
                    this.userId_ = interfaceC3386h.mo16997f(!this.userId_.isEmpty(), this.userId_, !playInfo.userId_.isEmpty(), playInfo.userId_);
                    this.mask_ = (userMaskConfig.UserMask) interfaceC3386h.mo17006o(this.mask_, playInfo.mask_);
                    this.title_ = interfaceC3386h.mo16997f(!this.title_.isEmpty(), this.title_, !playInfo.title_.isEmpty(), playInfo.title_);
                    this.lyricUrl_ = interfaceC3386h.mo16997f(!this.lyricUrl_.isEmpty(), this.lyricUrl_, !playInfo.lyricUrl_.isEmpty(), playInfo.lyricUrl_);
                    this.lyricType_ = interfaceC3386h.mo16997f(!this.lyricType_.isEmpty(), this.lyricType_, !playInfo.lyricType_.isEmpty(), playInfo.lyricType_);
                    this.songUrl_ = interfaceC3386h.mo16997f(!this.songUrl_.isEmpty(), this.songUrl_, !playInfo.songUrl_.isEmpty(), playInfo.songUrl_);
                    int i = this.prepareRemainSeconds_;
                    boolean z2 = i != 0;
                    int i2 = playInfo.prepareRemainSeconds_;
                    this.prepareRemainSeconds_ = interfaceC3386h.mo16996e(z2, i, i2 != 0, i2);
                    this.status_ = interfaceC3386h.mo16997f(!this.status_.isEmpty(), this.status_, !playInfo.status_.isEmpty(), playInfo.status_);
                    int i3 = this.durationSecond_;
                    boolean z3 = i3 != 0;
                    int i4 = playInfo.durationSecond_;
                    this.durationSecond_ = interfaceC3386h.mo16996e(z3, i3, i4 != 0, i4);
                    this.author_ = interfaceC3386h.mo16997f(!this.author_.isEmpty(), this.author_, !playInfo.author_.isEmpty(), playInfo.author_);
                    this.cover_ = interfaceC3386h.mo16997f(!this.cover_.isEmpty(), this.cover_, !playInfo.cover_.isEmpty(), playInfo.cover_);
                    this.quickGiftInfo_ = (QuickGiftInfo) interfaceC3386h.mo17006o(this.quickGiftInfo_, playInfo.quickGiftInfo_);
                    this.provider_ = interfaceC3386h.mo16997f(!this.provider_.isEmpty(), this.provider_, !playInfo.provider_.isEmpty(), playInfo.provider_);
                    boolean z4 = this.showLevel_;
                    boolean z5 = playInfo.showLevel_;
                    this.showLevel_ = interfaceC3386h.mo16995d(z4, z4, z5, z5);
                    int i5 = this.level_;
                    boolean z6 = i5 != 0;
                    int i6 = playInfo.level_;
                    this.level_ = interfaceC3386h.mo16996e(z6, i5, i6 != 0, i6);
                    int i7 = this.maxLevel_;
                    boolean z7 = i7 != 0;
                    int i8 = playInfo.maxLevel_;
                    this.maxLevel_ = interfaceC3386h.mo16996e(z7, i7, i8 != 0, i8);
                    this.levelTip_ = interfaceC3386h.mo16997f(!this.levelTip_.isEmpty(), this.levelTip_, !playInfo.levelTip_.isEmpty(), playInfo.levelTip_);
                    long j = this.score_;
                    boolean z8 = j != 0;
                    long j2 = playInfo.score_;
                    this.score_ = interfaceC3386h.mo17000i(z8, j, j2 != 0, j2);
                    this.schema_ = interfaceC3386h.mo16997f(!this.schema_.isEmpty(), this.schema_, !playInfo.schema_.isEmpty(), playInfo.schema_);
                    this.bestSingerName_ = interfaceC3386h.mo16997f(!this.bestSingerName_.isEmpty(), this.bestSingerName_, !playInfo.bestSingerName_.isEmpty(), playInfo.bestSingerName_);
                    this.showBgSvgaUrl_ = interfaceC3386h.mo16997f(!this.showBgSvgaUrl_.isEmpty(), this.showBgSvgaUrl_, !playInfo.showBgSvgaUrl_.isEmpty(), playInfo.showBgSvgaUrl_);
                    int i9 = this.giftUv_;
                    boolean z9 = i9 != 0;
                    int i10 = playInfo.giftUv_;
                    this.giftUv_ = interfaceC3386h.mo16996e(z9, i9, i10 != 0, i10);
                    int i11 = this.nextLevelGiftUv_;
                    boolean z10 = i11 != 0;
                    int i12 = playInfo.nextLevelGiftUv_;
                    this.nextLevelGiftUv_ = interfaceC3386h.mo16996e(z10, i11, i12 != 0, i12);
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
                                    this.orderId_ = c3407e.m17115L();
                                    continue;
                                case 18:
                                    this.songCode_ = c3407e.m17115L();
                                    continue;
                                case 26:
                                    this.userId_ = c3407e.m17115L();
                                    continue;
                                case 34:
                                    userMaskConfig.UserMask userMask = this.mask_;
                                    userMaskConfig.UserMask.Builder builder = userMask != null ? userMask.toBuilder() : null;
                                    userMaskConfig.UserMask userMask2 = (userMaskConfig.UserMask) c3407e.m17143w(userMaskConfig.UserMask.parser(), c3410h);
                                    this.mask_ = userMask2;
                                    if (builder != null) {
                                        builder.mergeFrom(userMask2);
                                        this.mask_ = builder.buildPartial();
                                    } else {
                                        continue;
                                    }
                                    break;
                                case 42:
                                    this.title_ = c3407e.m17115L();
                                    continue;
                                case 50:
                                    this.lyricUrl_ = c3407e.m17115L();
                                    continue;
                                case 58:
                                    this.lyricType_ = c3407e.m17115L();
                                    continue;
                                case 66:
                                    this.songUrl_ = c3407e.m17115L();
                                    continue;
                                case 72:
                                    this.prepareRemainSeconds_ = c3407e.m17141u();
                                    continue;
                                case EACTags.COMMAND_TO_PERFORM /* 82 */:
                                    this.status_ = c3407e.m17115L();
                                    continue;
                                case 88:
                                    this.durationSecond_ = c3407e.m17141u();
                                    continue;
                                case EACTags.FCP_TEMPLATE /* 98 */:
                                    this.author_ = c3407e.m17115L();
                                    continue;
                                case 106:
                                    this.cover_ = c3407e.m17115L();
                                    continue;
                                case 114:
                                    QuickGiftInfo quickGiftInfo = this.quickGiftInfo_;
                                    QuickGiftInfo.Builder builder2 = quickGiftInfo != null ? quickGiftInfo.toBuilder() : null;
                                    QuickGiftInfo quickGiftInfo2 = (QuickGiftInfo) c3407e.m17143w(QuickGiftInfo.parser(), c3410h);
                                    this.quickGiftInfo_ = quickGiftInfo2;
                                    if (builder2 != null) {
                                        builder2.mergeFrom(quickGiftInfo2);
                                        this.quickGiftInfo_ = builder2.buildPartial();
                                    } else {
                                        continue;
                                    }
                                    break;
                                case 122:
                                    this.provider_ = c3407e.m17115L();
                                    continue;
                                case 128:
                                    this.showLevel_ = c3407e.m17133m();
                                    continue;
                                case CipherSuite.TLS_DHE_RSA_WITH_CAMELLIA_256_CBC_SHA /* 136 */:
                                    this.level_ = c3407e.m17141u();
                                    continue;
                                case 144:
                                    this.maxLevel_ = c3407e.m17141u();
                                    continue;
                                case 154:
                                    this.levelTip_ = c3407e.m17115L();
                                    continue;
                                case 160:
                                    this.score_ = c3407e.m17142v();
                                    continue;
                                case CipherSuite.TLS_DHE_PSK_WITH_AES_128_GCM_SHA256 /* 170 */:
                                    this.schema_ = c3407e.m17115L();
                                    continue;
                                case 178:
                                    this.bestSingerName_ = c3407e.m17115L();
                                    continue;
                                case CipherSuite.TLS_RSA_WITH_CAMELLIA_128_CBC_SHA256 /* 186 */:
                                    this.showBgSvgaUrl_ = c3407e.m17115L();
                                    continue;
                                case 192:
                                    this.giftUv_ = c3407e.m17141u();
                                    continue;
                                case 200:
                                    this.nextLevelGiftUv_ = c3407e.m17141u();
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
                        synchronized (PlayInfo.class) {
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

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVoiceKtv.PlayInfoOrBuilder
        public String getAuthor() {
            return this.author_;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVoiceKtv.PlayInfoOrBuilder
        public ByteString getAuthorBytes() {
            return ByteString.copyFromUtf8(this.author_);
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVoiceKtv.PlayInfoOrBuilder
        public String getBestSingerName() {
            return this.bestSingerName_;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVoiceKtv.PlayInfoOrBuilder
        public ByteString getBestSingerNameBytes() {
            return ByteString.copyFromUtf8(this.bestSingerName_);
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVoiceKtv.PlayInfoOrBuilder
        public String getCover() {
            return this.cover_;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVoiceKtv.PlayInfoOrBuilder
        public ByteString getCoverBytes() {
            return ByteString.copyFromUtf8(this.cover_);
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVoiceKtv.PlayInfoOrBuilder
        public int getDurationSecond() {
            return this.durationSecond_;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVoiceKtv.PlayInfoOrBuilder
        public int getGiftUv() {
            return this.giftUv_;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVoiceKtv.PlayInfoOrBuilder
        public int getLevel() {
            return this.level_;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVoiceKtv.PlayInfoOrBuilder
        public String getLevelTip() {
            return this.levelTip_;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVoiceKtv.PlayInfoOrBuilder
        public ByteString getLevelTipBytes() {
            return ByteString.copyFromUtf8(this.levelTip_);
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVoiceKtv.PlayInfoOrBuilder
        public String getLyricType() {
            return this.lyricType_;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVoiceKtv.PlayInfoOrBuilder
        public ByteString getLyricTypeBytes() {
            return ByteString.copyFromUtf8(this.lyricType_);
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVoiceKtv.PlayInfoOrBuilder
        public String getLyricUrl() {
            return this.lyricUrl_;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVoiceKtv.PlayInfoOrBuilder
        public ByteString getLyricUrlBytes() {
            return ByteString.copyFromUtf8(this.lyricUrl_);
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVoiceKtv.PlayInfoOrBuilder
        public userMaskConfig.UserMask getMask() {
            userMaskConfig.UserMask userMask = this.mask_;
            return userMask == null ? userMaskConfig.UserMask.getDefaultInstance() : userMask;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVoiceKtv.PlayInfoOrBuilder
        public int getMaxLevel() {
            return this.maxLevel_;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVoiceKtv.PlayInfoOrBuilder
        public int getNextLevelGiftUv() {
            return this.nextLevelGiftUv_;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVoiceKtv.PlayInfoOrBuilder
        public String getOrderId() {
            return this.orderId_;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVoiceKtv.PlayInfoOrBuilder
        public ByteString getOrderIdBytes() {
            return ByteString.copyFromUtf8(this.orderId_);
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVoiceKtv.PlayInfoOrBuilder
        public int getPrepareRemainSeconds() {
            return this.prepareRemainSeconds_;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVoiceKtv.PlayInfoOrBuilder
        public String getProvider() {
            return this.provider_;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVoiceKtv.PlayInfoOrBuilder
        public ByteString getProviderBytes() {
            return ByteString.copyFromUtf8(this.provider_);
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVoiceKtv.PlayInfoOrBuilder
        public QuickGiftInfo getQuickGiftInfo() {
            QuickGiftInfo quickGiftInfo = this.quickGiftInfo_;
            return quickGiftInfo == null ? QuickGiftInfo.getDefaultInstance() : quickGiftInfo;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVoiceKtv.PlayInfoOrBuilder
        public String getSchema() {
            return this.schema_;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVoiceKtv.PlayInfoOrBuilder
        public ByteString getSchemaBytes() {
            return ByteString.copyFromUtf8(this.schema_);
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVoiceKtv.PlayInfoOrBuilder
        public long getScore() {
            return this.score_;
        }

        @Override // com.google.protobuf.InterfaceC3419q
        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int iM16901K = !this.orderId_.isEmpty() ? CodedOutputStream.m16901K(1, getOrderId()) : 0;
            if (!this.songCode_.isEmpty()) {
                iM16901K += CodedOutputStream.m16901K(2, getSongCode());
            }
            if (!this.userId_.isEmpty()) {
                iM16901K += CodedOutputStream.m16901K(3, getUserId());
            }
            if (this.mask_ != null) {
                iM16901K += CodedOutputStream.m16893C(4, getMask());
            }
            if (!this.title_.isEmpty()) {
                iM16901K += CodedOutputStream.m16901K(5, getTitle());
            }
            if (!this.lyricUrl_.isEmpty()) {
                iM16901K += CodedOutputStream.m16901K(6, getLyricUrl());
            }
            if (!this.lyricType_.isEmpty()) {
                iM16901K += CodedOutputStream.m16901K(7, getLyricType());
            }
            if (!this.songUrl_.isEmpty()) {
                iM16901K += CodedOutputStream.m16901K(8, getSongUrl());
            }
            int i2 = this.prepareRemainSeconds_;
            if (i2 != 0) {
                iM16901K += CodedOutputStream.m16929t(9, i2);
            }
            if (!this.status_.isEmpty()) {
                iM16901K += CodedOutputStream.m16901K(10, getStatus());
            }
            int i3 = this.durationSecond_;
            if (i3 != 0) {
                iM16901K += CodedOutputStream.m16929t(11, i3);
            }
            if (!this.author_.isEmpty()) {
                iM16901K += CodedOutputStream.m16901K(12, getAuthor());
            }
            if (!this.cover_.isEmpty()) {
                iM16901K += CodedOutputStream.m16901K(13, getCover());
            }
            if (this.quickGiftInfo_ != null) {
                iM16901K += CodedOutputStream.m16893C(14, getQuickGiftInfo());
            }
            if (!this.provider_.isEmpty()) {
                iM16901K += CodedOutputStream.m16901K(15, getProvider());
            }
            boolean z = this.showLevel_;
            if (z) {
                iM16901K += CodedOutputStream.m16915f(16, z);
            }
            int i4 = this.level_;
            if (i4 != 0) {
                iM16901K += CodedOutputStream.m16929t(17, i4);
            }
            int i5 = this.maxLevel_;
            if (i5 != 0) {
                iM16901K += CodedOutputStream.m16929t(18, i5);
            }
            if (!this.levelTip_.isEmpty()) {
                iM16901K += CodedOutputStream.m16901K(19, getLevelTip());
            }
            long j = this.score_;
            if (j != 0) {
                iM16901K += CodedOutputStream.m16931v(20, j);
            }
            if (!this.schema_.isEmpty()) {
                iM16901K += CodedOutputStream.m16901K(21, getSchema());
            }
            if (!this.bestSingerName_.isEmpty()) {
                iM16901K += CodedOutputStream.m16901K(22, getBestSingerName());
            }
            if (!this.showBgSvgaUrl_.isEmpty()) {
                iM16901K += CodedOutputStream.m16901K(23, getShowBgSvgaUrl());
            }
            int i6 = this.giftUv_;
            if (i6 != 0) {
                iM16901K += CodedOutputStream.m16929t(24, i6);
            }
            int i7 = this.nextLevelGiftUv_;
            if (i7 != 0) {
                iM16901K += CodedOutputStream.m16929t(25, i7);
            }
            this.memoizedSerializedSize = iM16901K;
            return iM16901K;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVoiceKtv.PlayInfoOrBuilder
        public String getShowBgSvgaUrl() {
            return this.showBgSvgaUrl_;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVoiceKtv.PlayInfoOrBuilder
        public ByteString getShowBgSvgaUrlBytes() {
            return ByteString.copyFromUtf8(this.showBgSvgaUrl_);
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVoiceKtv.PlayInfoOrBuilder
        public boolean getShowLevel() {
            return this.showLevel_;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVoiceKtv.PlayInfoOrBuilder
        public String getSongCode() {
            return this.songCode_;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVoiceKtv.PlayInfoOrBuilder
        public ByteString getSongCodeBytes() {
            return ByteString.copyFromUtf8(this.songCode_);
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVoiceKtv.PlayInfoOrBuilder
        public String getSongUrl() {
            return this.songUrl_;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVoiceKtv.PlayInfoOrBuilder
        public ByteString getSongUrlBytes() {
            return ByteString.copyFromUtf8(this.songUrl_);
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVoiceKtv.PlayInfoOrBuilder
        public String getStatus() {
            return this.status_;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVoiceKtv.PlayInfoOrBuilder
        public ByteString getStatusBytes() {
            return ByteString.copyFromUtf8(this.status_);
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVoiceKtv.PlayInfoOrBuilder
        public String getTitle() {
            return this.title_;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVoiceKtv.PlayInfoOrBuilder
        public ByteString getTitleBytes() {
            return ByteString.copyFromUtf8(this.title_);
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVoiceKtv.PlayInfoOrBuilder
        public String getUserId() {
            return this.userId_;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVoiceKtv.PlayInfoOrBuilder
        public ByteString getUserIdBytes() {
            return ByteString.copyFromUtf8(this.userId_);
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVoiceKtv.PlayInfoOrBuilder
        public boolean hasMask() {
            return this.mask_ != null;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVoiceKtv.PlayInfoOrBuilder
        public boolean hasQuickGiftInfo() {
            return this.quickGiftInfo_ != null;
        }

        @Override // com.google.protobuf.InterfaceC3419q
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (!this.orderId_.isEmpty()) {
                codedOutputStream.mo16939D0(1, getOrderId());
            }
            if (!this.songCode_.isEmpty()) {
                codedOutputStream.mo16939D0(2, getSongCode());
            }
            if (!this.userId_.isEmpty()) {
                codedOutputStream.mo16939D0(3, getUserId());
            }
            if (this.mask_ != null) {
                codedOutputStream.mo16974w0(4, getMask());
            }
            if (!this.title_.isEmpty()) {
                codedOutputStream.mo16939D0(5, getTitle());
            }
            if (!this.lyricUrl_.isEmpty()) {
                codedOutputStream.mo16939D0(6, getLyricUrl());
            }
            if (!this.lyricType_.isEmpty()) {
                codedOutputStream.mo16939D0(7, getLyricType());
            }
            if (!this.songUrl_.isEmpty()) {
                codedOutputStream.mo16939D0(8, getSongUrl());
            }
            int i = this.prepareRemainSeconds_;
            if (i != 0) {
                codedOutputStream.mo16970s0(9, i);
            }
            if (!this.status_.isEmpty()) {
                codedOutputStream.mo16939D0(10, getStatus());
            }
            int i2 = this.durationSecond_;
            if (i2 != 0) {
                codedOutputStream.mo16970s0(11, i2);
            }
            if (!this.author_.isEmpty()) {
                codedOutputStream.mo16939D0(12, getAuthor());
            }
            if (!this.cover_.isEmpty()) {
                codedOutputStream.mo16939D0(13, getCover());
            }
            if (this.quickGiftInfo_ != null) {
                codedOutputStream.mo16974w0(14, getQuickGiftInfo());
            }
            if (!this.provider_.isEmpty()) {
                codedOutputStream.mo16939D0(15, getProvider());
            }
            boolean z = this.showLevel_;
            if (z) {
                codedOutputStream.mo16950a0(16, z);
            }
            int i3 = this.level_;
            if (i3 != 0) {
                codedOutputStream.mo16970s0(17, i3);
            }
            int i4 = this.maxLevel_;
            if (i4 != 0) {
                codedOutputStream.mo16970s0(18, i4);
            }
            if (!this.levelTip_.isEmpty()) {
                codedOutputStream.mo16939D0(19, getLevelTip());
            }
            long j = this.score_;
            if (j != 0) {
                codedOutputStream.m16972u0(20, j);
            }
            if (!this.schema_.isEmpty()) {
                codedOutputStream.mo16939D0(21, getSchema());
            }
            if (!this.bestSingerName_.isEmpty()) {
                codedOutputStream.mo16939D0(22, getBestSingerName());
            }
            if (!this.showBgSvgaUrl_.isEmpty()) {
                codedOutputStream.mo16939D0(23, getShowBgSvgaUrl());
            }
            int i5 = this.giftUv_;
            if (i5 != 0) {
                codedOutputStream.mo16970s0(24, i5);
            }
            int i6 = this.nextLevelGiftUv_;
            if (i6 != 0) {
                codedOutputStream.mo16970s0(25, i6);
            }
        }

        public static PlayInfo parseDelimitedFrom(InputStream inputStream, C3410h c3410h) throws IOException {
            return (PlayInfo) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, c3410h);
        }

        public static PlayInfo parseFrom(ByteString byteString, C3410h c3410h) throws InvalidProtocolBufferException {
            return (PlayInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, c3410h);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setMask(userMaskConfig.UserMask userMask) {
            userMask.getClass();
            this.mask_ = userMask;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setQuickGiftInfo(QuickGiftInfo quickGiftInfo) {
            quickGiftInfo.getClass();
            this.quickGiftInfo_ = quickGiftInfo;
        }

        public static final class Builder extends GeneratedMessageLite.AbstractC3380b<PlayInfo, Builder> implements PlayInfoOrBuilder {
            private Builder() {
                super(PlayInfo.DEFAULT_INSTANCE);
            }

            public Builder clearAuthor() {
                copyOnWrite();
                ((PlayInfo) this.instance).clearAuthor();
                return this;
            }

            public Builder clearBestSingerName() {
                copyOnWrite();
                ((PlayInfo) this.instance).clearBestSingerName();
                return this;
            }

            public Builder clearCover() {
                copyOnWrite();
                ((PlayInfo) this.instance).clearCover();
                return this;
            }

            public Builder clearDurationSecond() {
                copyOnWrite();
                ((PlayInfo) this.instance).clearDurationSecond();
                return this;
            }

            public Builder clearGiftUv() {
                copyOnWrite();
                ((PlayInfo) this.instance).clearGiftUv();
                return this;
            }

            public Builder clearLevel() {
                copyOnWrite();
                ((PlayInfo) this.instance).clearLevel();
                return this;
            }

            public Builder clearLevelTip() {
                copyOnWrite();
                ((PlayInfo) this.instance).clearLevelTip();
                return this;
            }

            public Builder clearLyricType() {
                copyOnWrite();
                ((PlayInfo) this.instance).clearLyricType();
                return this;
            }

            public Builder clearLyricUrl() {
                copyOnWrite();
                ((PlayInfo) this.instance).clearLyricUrl();
                return this;
            }

            public Builder clearMask() {
                copyOnWrite();
                ((PlayInfo) this.instance).clearMask();
                return this;
            }

            public Builder clearMaxLevel() {
                copyOnWrite();
                ((PlayInfo) this.instance).clearMaxLevel();
                return this;
            }

            public Builder clearNextLevelGiftUv() {
                copyOnWrite();
                ((PlayInfo) this.instance).clearNextLevelGiftUv();
                return this;
            }

            public Builder clearOrderId() {
                copyOnWrite();
                ((PlayInfo) this.instance).clearOrderId();
                return this;
            }

            public Builder clearPrepareRemainSeconds() {
                copyOnWrite();
                ((PlayInfo) this.instance).clearPrepareRemainSeconds();
                return this;
            }

            public Builder clearProvider() {
                copyOnWrite();
                ((PlayInfo) this.instance).clearProvider();
                return this;
            }

            public Builder clearQuickGiftInfo() {
                copyOnWrite();
                ((PlayInfo) this.instance).clearQuickGiftInfo();
                return this;
            }

            public Builder clearSchema() {
                copyOnWrite();
                ((PlayInfo) this.instance).clearSchema();
                return this;
            }

            public Builder clearScore() {
                copyOnWrite();
                ((PlayInfo) this.instance).clearScore();
                return this;
            }

            public Builder clearShowBgSvgaUrl() {
                copyOnWrite();
                ((PlayInfo) this.instance).clearShowBgSvgaUrl();
                return this;
            }

            public Builder clearShowLevel() {
                copyOnWrite();
                ((PlayInfo) this.instance).clearShowLevel();
                return this;
            }

            public Builder clearSongCode() {
                copyOnWrite();
                ((PlayInfo) this.instance).clearSongCode();
                return this;
            }

            public Builder clearSongUrl() {
                copyOnWrite();
                ((PlayInfo) this.instance).clearSongUrl();
                return this;
            }

            public Builder clearStatus() {
                copyOnWrite();
                ((PlayInfo) this.instance).clearStatus();
                return this;
            }

            public Builder clearTitle() {
                copyOnWrite();
                ((PlayInfo) this.instance).clearTitle();
                return this;
            }

            public Builder clearUserId() {
                copyOnWrite();
                ((PlayInfo) this.instance).clearUserId();
                return this;
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVoiceKtv.PlayInfoOrBuilder
            public String getAuthor() {
                return ((PlayInfo) this.instance).getAuthor();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVoiceKtv.PlayInfoOrBuilder
            public ByteString getAuthorBytes() {
                return ((PlayInfo) this.instance).getAuthorBytes();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVoiceKtv.PlayInfoOrBuilder
            public String getBestSingerName() {
                return ((PlayInfo) this.instance).getBestSingerName();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVoiceKtv.PlayInfoOrBuilder
            public ByteString getBestSingerNameBytes() {
                return ((PlayInfo) this.instance).getBestSingerNameBytes();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVoiceKtv.PlayInfoOrBuilder
            public String getCover() {
                return ((PlayInfo) this.instance).getCover();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVoiceKtv.PlayInfoOrBuilder
            public ByteString getCoverBytes() {
                return ((PlayInfo) this.instance).getCoverBytes();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVoiceKtv.PlayInfoOrBuilder
            public int getDurationSecond() {
                return ((PlayInfo) this.instance).getDurationSecond();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVoiceKtv.PlayInfoOrBuilder
            public int getGiftUv() {
                return ((PlayInfo) this.instance).getGiftUv();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVoiceKtv.PlayInfoOrBuilder
            public int getLevel() {
                return ((PlayInfo) this.instance).getLevel();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVoiceKtv.PlayInfoOrBuilder
            public String getLevelTip() {
                return ((PlayInfo) this.instance).getLevelTip();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVoiceKtv.PlayInfoOrBuilder
            public ByteString getLevelTipBytes() {
                return ((PlayInfo) this.instance).getLevelTipBytes();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVoiceKtv.PlayInfoOrBuilder
            public String getLyricType() {
                return ((PlayInfo) this.instance).getLyricType();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVoiceKtv.PlayInfoOrBuilder
            public ByteString getLyricTypeBytes() {
                return ((PlayInfo) this.instance).getLyricTypeBytes();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVoiceKtv.PlayInfoOrBuilder
            public String getLyricUrl() {
                return ((PlayInfo) this.instance).getLyricUrl();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVoiceKtv.PlayInfoOrBuilder
            public ByteString getLyricUrlBytes() {
                return ((PlayInfo) this.instance).getLyricUrlBytes();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVoiceKtv.PlayInfoOrBuilder
            public userMaskConfig.UserMask getMask() {
                return ((PlayInfo) this.instance).getMask();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVoiceKtv.PlayInfoOrBuilder
            public int getMaxLevel() {
                return ((PlayInfo) this.instance).getMaxLevel();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVoiceKtv.PlayInfoOrBuilder
            public int getNextLevelGiftUv() {
                return ((PlayInfo) this.instance).getNextLevelGiftUv();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVoiceKtv.PlayInfoOrBuilder
            public String getOrderId() {
                return ((PlayInfo) this.instance).getOrderId();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVoiceKtv.PlayInfoOrBuilder
            public ByteString getOrderIdBytes() {
                return ((PlayInfo) this.instance).getOrderIdBytes();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVoiceKtv.PlayInfoOrBuilder
            public int getPrepareRemainSeconds() {
                return ((PlayInfo) this.instance).getPrepareRemainSeconds();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVoiceKtv.PlayInfoOrBuilder
            public String getProvider() {
                return ((PlayInfo) this.instance).getProvider();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVoiceKtv.PlayInfoOrBuilder
            public ByteString getProviderBytes() {
                return ((PlayInfo) this.instance).getProviderBytes();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVoiceKtv.PlayInfoOrBuilder
            public QuickGiftInfo getQuickGiftInfo() {
                return ((PlayInfo) this.instance).getQuickGiftInfo();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVoiceKtv.PlayInfoOrBuilder
            public String getSchema() {
                return ((PlayInfo) this.instance).getSchema();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVoiceKtv.PlayInfoOrBuilder
            public ByteString getSchemaBytes() {
                return ((PlayInfo) this.instance).getSchemaBytes();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVoiceKtv.PlayInfoOrBuilder
            public long getScore() {
                return ((PlayInfo) this.instance).getScore();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVoiceKtv.PlayInfoOrBuilder
            public String getShowBgSvgaUrl() {
                return ((PlayInfo) this.instance).getShowBgSvgaUrl();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVoiceKtv.PlayInfoOrBuilder
            public ByteString getShowBgSvgaUrlBytes() {
                return ((PlayInfo) this.instance).getShowBgSvgaUrlBytes();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVoiceKtv.PlayInfoOrBuilder
            public boolean getShowLevel() {
                return ((PlayInfo) this.instance).getShowLevel();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVoiceKtv.PlayInfoOrBuilder
            public String getSongCode() {
                return ((PlayInfo) this.instance).getSongCode();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVoiceKtv.PlayInfoOrBuilder
            public ByteString getSongCodeBytes() {
                return ((PlayInfo) this.instance).getSongCodeBytes();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVoiceKtv.PlayInfoOrBuilder
            public String getSongUrl() {
                return ((PlayInfo) this.instance).getSongUrl();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVoiceKtv.PlayInfoOrBuilder
            public ByteString getSongUrlBytes() {
                return ((PlayInfo) this.instance).getSongUrlBytes();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVoiceKtv.PlayInfoOrBuilder
            public String getStatus() {
                return ((PlayInfo) this.instance).getStatus();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVoiceKtv.PlayInfoOrBuilder
            public ByteString getStatusBytes() {
                return ((PlayInfo) this.instance).getStatusBytes();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVoiceKtv.PlayInfoOrBuilder
            public String getTitle() {
                return ((PlayInfo) this.instance).getTitle();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVoiceKtv.PlayInfoOrBuilder
            public ByteString getTitleBytes() {
                return ((PlayInfo) this.instance).getTitleBytes();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVoiceKtv.PlayInfoOrBuilder
            public String getUserId() {
                return ((PlayInfo) this.instance).getUserId();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVoiceKtv.PlayInfoOrBuilder
            public ByteString getUserIdBytes() {
                return ((PlayInfo) this.instance).getUserIdBytes();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVoiceKtv.PlayInfoOrBuilder
            public boolean hasMask() {
                return ((PlayInfo) this.instance).hasMask();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVoiceKtv.PlayInfoOrBuilder
            public boolean hasQuickGiftInfo() {
                return ((PlayInfo) this.instance).hasQuickGiftInfo();
            }

            public Builder mergeMask(userMaskConfig.UserMask userMask) {
                copyOnWrite();
                ((PlayInfo) this.instance).mergeMask(userMask);
                return this;
            }

            public Builder mergeQuickGiftInfo(QuickGiftInfo quickGiftInfo) {
                copyOnWrite();
                ((PlayInfo) this.instance).mergeQuickGiftInfo(quickGiftInfo);
                return this;
            }

            public Builder setAuthor(String str) {
                copyOnWrite();
                ((PlayInfo) this.instance).setAuthor(str);
                return this;
            }

            public Builder setAuthorBytes(ByteString byteString) {
                copyOnWrite();
                ((PlayInfo) this.instance).setAuthorBytes(byteString);
                return this;
            }

            public Builder setBestSingerName(String str) {
                copyOnWrite();
                ((PlayInfo) this.instance).setBestSingerName(str);
                return this;
            }

            public Builder setBestSingerNameBytes(ByteString byteString) {
                copyOnWrite();
                ((PlayInfo) this.instance).setBestSingerNameBytes(byteString);
                return this;
            }

            public Builder setCover(String str) {
                copyOnWrite();
                ((PlayInfo) this.instance).setCover(str);
                return this;
            }

            public Builder setCoverBytes(ByteString byteString) {
                copyOnWrite();
                ((PlayInfo) this.instance).setCoverBytes(byteString);
                return this;
            }

            public Builder setDurationSecond(int i) {
                copyOnWrite();
                ((PlayInfo) this.instance).setDurationSecond(i);
                return this;
            }

            public Builder setGiftUv(int i) {
                copyOnWrite();
                ((PlayInfo) this.instance).setGiftUv(i);
                return this;
            }

            public Builder setLevel(int i) {
                copyOnWrite();
                ((PlayInfo) this.instance).setLevel(i);
                return this;
            }

            public Builder setLevelTip(String str) {
                copyOnWrite();
                ((PlayInfo) this.instance).setLevelTip(str);
                return this;
            }

            public Builder setLevelTipBytes(ByteString byteString) {
                copyOnWrite();
                ((PlayInfo) this.instance).setLevelTipBytes(byteString);
                return this;
            }

            public Builder setLyricType(String str) {
                copyOnWrite();
                ((PlayInfo) this.instance).setLyricType(str);
                return this;
            }

            public Builder setLyricTypeBytes(ByteString byteString) {
                copyOnWrite();
                ((PlayInfo) this.instance).setLyricTypeBytes(byteString);
                return this;
            }

            public Builder setLyricUrl(String str) {
                copyOnWrite();
                ((PlayInfo) this.instance).setLyricUrl(str);
                return this;
            }

            public Builder setLyricUrlBytes(ByteString byteString) {
                copyOnWrite();
                ((PlayInfo) this.instance).setLyricUrlBytes(byteString);
                return this;
            }

            public Builder setMask(userMaskConfig.UserMask userMask) {
                copyOnWrite();
                ((PlayInfo) this.instance).setMask(userMask);
                return this;
            }

            public Builder setMaxLevel(int i) {
                copyOnWrite();
                ((PlayInfo) this.instance).setMaxLevel(i);
                return this;
            }

            public Builder setNextLevelGiftUv(int i) {
                copyOnWrite();
                ((PlayInfo) this.instance).setNextLevelGiftUv(i);
                return this;
            }

            public Builder setOrderId(String str) {
                copyOnWrite();
                ((PlayInfo) this.instance).setOrderId(str);
                return this;
            }

            public Builder setOrderIdBytes(ByteString byteString) {
                copyOnWrite();
                ((PlayInfo) this.instance).setOrderIdBytes(byteString);
                return this;
            }

            public Builder setPrepareRemainSeconds(int i) {
                copyOnWrite();
                ((PlayInfo) this.instance).setPrepareRemainSeconds(i);
                return this;
            }

            public Builder setProvider(String str) {
                copyOnWrite();
                ((PlayInfo) this.instance).setProvider(str);
                return this;
            }

            public Builder setProviderBytes(ByteString byteString) {
                copyOnWrite();
                ((PlayInfo) this.instance).setProviderBytes(byteString);
                return this;
            }

            public Builder setQuickGiftInfo(QuickGiftInfo quickGiftInfo) {
                copyOnWrite();
                ((PlayInfo) this.instance).setQuickGiftInfo(quickGiftInfo);
                return this;
            }

            public Builder setSchema(String str) {
                copyOnWrite();
                ((PlayInfo) this.instance).setSchema(str);
                return this;
            }

            public Builder setSchemaBytes(ByteString byteString) {
                copyOnWrite();
                ((PlayInfo) this.instance).setSchemaBytes(byteString);
                return this;
            }

            public Builder setScore(long j) {
                copyOnWrite();
                ((PlayInfo) this.instance).setScore(j);
                return this;
            }

            public Builder setShowBgSvgaUrl(String str) {
                copyOnWrite();
                ((PlayInfo) this.instance).setShowBgSvgaUrl(str);
                return this;
            }

            public Builder setShowBgSvgaUrlBytes(ByteString byteString) {
                copyOnWrite();
                ((PlayInfo) this.instance).setShowBgSvgaUrlBytes(byteString);
                return this;
            }

            public Builder setShowLevel(boolean z) {
                copyOnWrite();
                ((PlayInfo) this.instance).setShowLevel(z);
                return this;
            }

            public Builder setSongCode(String str) {
                copyOnWrite();
                ((PlayInfo) this.instance).setSongCode(str);
                return this;
            }

            public Builder setSongCodeBytes(ByteString byteString) {
                copyOnWrite();
                ((PlayInfo) this.instance).setSongCodeBytes(byteString);
                return this;
            }

            public Builder setSongUrl(String str) {
                copyOnWrite();
                ((PlayInfo) this.instance).setSongUrl(str);
                return this;
            }

            public Builder setSongUrlBytes(ByteString byteString) {
                copyOnWrite();
                ((PlayInfo) this.instance).setSongUrlBytes(byteString);
                return this;
            }

            public Builder setStatus(String str) {
                copyOnWrite();
                ((PlayInfo) this.instance).setStatus(str);
                return this;
            }

            public Builder setStatusBytes(ByteString byteString) {
                copyOnWrite();
                ((PlayInfo) this.instance).setStatusBytes(byteString);
                return this;
            }

            public Builder setTitle(String str) {
                copyOnWrite();
                ((PlayInfo) this.instance).setTitle(str);
                return this;
            }

            public Builder setTitleBytes(ByteString byteString) {
                copyOnWrite();
                ((PlayInfo) this.instance).setTitleBytes(byteString);
                return this;
            }

            public Builder setUserId(String str) {
                copyOnWrite();
                ((PlayInfo) this.instance).setUserId(str);
                return this;
            }

            public Builder setUserIdBytes(ByteString byteString) {
                copyOnWrite();
                ((PlayInfo) this.instance).setUserIdBytes(byteString);
                return this;
            }

            public Builder setMask(userMaskConfig.UserMask.Builder builder) {
                copyOnWrite();
                ((PlayInfo) this.instance).setMask(builder);
                return this;
            }

            public Builder setQuickGiftInfo(QuickGiftInfo.Builder builder) {
                copyOnWrite();
                ((PlayInfo) this.instance).setQuickGiftInfo(builder);
                return this;
            }
        }

        public static PlayInfo parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (PlayInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static PlayInfo parseFrom(byte[] bArr, C3410h c3410h) throws InvalidProtocolBufferException {
            return (PlayInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, c3410h);
        }

        public static PlayInfo parseFrom(InputStream inputStream) throws IOException {
            return (PlayInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static PlayInfo parseFrom(InputStream inputStream, C3410h c3410h) throws IOException {
            return (PlayInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, c3410h);
        }

        public static PlayInfo parseFrom(C3407e c3407e) throws IOException {
            return (PlayInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, c3407e);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static PlayInfo parseFrom(C3407e c3407e, C3410h c3410h) throws IOException {
            return (PlayInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, c3407e, c3410h);
        }
    }

    public static final class QuickGiftInfo extends GeneratedMessageLite<QuickGiftInfo, Builder> implements QuickGiftInfoOrBuilder {
        private static final QuickGiftInfo DEFAULT_INSTANCE;
        public static final int GIFTID_FIELD_NUMBER = 1;
        public static final int NAME_FIELD_NUMBER = 2;
        private static volatile i860<QuickGiftInfo> PARSER = null;
        public static final int URL_FIELD_NUMBER = 3;
        private long giftId_;
        private String name_ = "";
        private String url_ = "";

        public static final class Builder extends GeneratedMessageLite.AbstractC3380b<QuickGiftInfo, Builder> implements QuickGiftInfoOrBuilder {
            private Builder() {
                super(QuickGiftInfo.DEFAULT_INSTANCE);
            }

            public Builder clearGiftId() {
                copyOnWrite();
                ((QuickGiftInfo) this.instance).clearGiftId();
                return this;
            }

            public Builder clearName() {
                copyOnWrite();
                ((QuickGiftInfo) this.instance).clearName();
                return this;
            }

            public Builder clearUrl() {
                copyOnWrite();
                ((QuickGiftInfo) this.instance).clearUrl();
                return this;
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVoiceKtv.QuickGiftInfoOrBuilder
            public long getGiftId() {
                return ((QuickGiftInfo) this.instance).getGiftId();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVoiceKtv.QuickGiftInfoOrBuilder
            public String getName() {
                return ((QuickGiftInfo) this.instance).getName();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVoiceKtv.QuickGiftInfoOrBuilder
            public ByteString getNameBytes() {
                return ((QuickGiftInfo) this.instance).getNameBytes();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVoiceKtv.QuickGiftInfoOrBuilder
            public String getUrl() {
                return ((QuickGiftInfo) this.instance).getUrl();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVoiceKtv.QuickGiftInfoOrBuilder
            public ByteString getUrlBytes() {
                return ((QuickGiftInfo) this.instance).getUrlBytes();
            }

            public Builder setGiftId(long j) {
                copyOnWrite();
                ((QuickGiftInfo) this.instance).setGiftId(j);
                return this;
            }

            public Builder setName(String str) {
                copyOnWrite();
                ((QuickGiftInfo) this.instance).setName(str);
                return this;
            }

            public Builder setNameBytes(ByteString byteString) {
                copyOnWrite();
                ((QuickGiftInfo) this.instance).setNameBytes(byteString);
                return this;
            }

            public Builder setUrl(String str) {
                copyOnWrite();
                ((QuickGiftInfo) this.instance).setUrl(str);
                return this;
            }

            public Builder setUrlBytes(ByteString byteString) {
                copyOnWrite();
                ((QuickGiftInfo) this.instance).setUrlBytes(byteString);
                return this;
            }
        }

        static {
            QuickGiftInfo quickGiftInfo = new QuickGiftInfo();
            DEFAULT_INSTANCE = quickGiftInfo;
            quickGiftInfo.makeImmutable();
        }

        private QuickGiftInfo() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearGiftId() {
            this.giftId_ = 0L;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearName() {
            this.name_ = getDefaultInstance().getName();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearUrl() {
            this.url_ = getDefaultInstance().getUrl();
        }

        public static QuickGiftInfo getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder(QuickGiftInfo quickGiftInfo) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(quickGiftInfo);
        }

        public static QuickGiftInfo parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (QuickGiftInfo) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static QuickGiftInfo parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (QuickGiftInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static i860<QuickGiftInfo> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setGiftId(long j) {
            this.giftId_ = j;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setName(String str) {
            str.getClass();
            this.name_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setNameBytes(ByteString byteString) {
            byteString.getClass();
            AbstractC3403a.checkByteStringIsUtf8(byteString);
            this.name_ = byteString.toStringUtf8();
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
            switch (C45231.f15982xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new QuickGiftInfo();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                    return null;
                case 4:
                    return new Builder();
                case 5:
                    GeneratedMessageLite.InterfaceC3386h interfaceC3386h = (GeneratedMessageLite.InterfaceC3386h) obj;
                    QuickGiftInfo quickGiftInfo = (QuickGiftInfo) obj2;
                    long j = this.giftId_;
                    boolean z2 = j != 0;
                    long j2 = quickGiftInfo.giftId_;
                    this.giftId_ = interfaceC3386h.mo17000i(z2, j, j2 != 0, j2);
                    this.name_ = interfaceC3386h.mo16997f(!this.name_.isEmpty(), this.name_, !quickGiftInfo.name_.isEmpty(), quickGiftInfo.name_);
                    this.url_ = interfaceC3386h.mo16997f(!this.url_.isEmpty(), this.url_, !quickGiftInfo.url_.isEmpty(), quickGiftInfo.url_);
                    GeneratedMessageLite.C3385g c3385g = GeneratedMessageLite.C3385g.INSTANCE;
                    return this;
                case 6:
                    C3407e c3407e = (C3407e) obj;
                    while (!z) {
                        try {
                            int iM17116M = c3407e.m17116M();
                            if (iM17116M != 0) {
                                if (iM17116M == 8) {
                                    this.giftId_ = c3407e.m17142v();
                                } else if (iM17116M == 18) {
                                    this.name_ = c3407e.m17115L();
                                } else if (iM17116M == 26) {
                                    this.url_ = c3407e.m17115L();
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
                        synchronized (QuickGiftInfo.class) {
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

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVoiceKtv.QuickGiftInfoOrBuilder
        public long getGiftId() {
            return this.giftId_;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVoiceKtv.QuickGiftInfoOrBuilder
        public String getName() {
            return this.name_;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVoiceKtv.QuickGiftInfoOrBuilder
        public ByteString getNameBytes() {
            return ByteString.copyFromUtf8(this.name_);
        }

        @Override // com.google.protobuf.InterfaceC3419q
        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            long j = this.giftId_;
            int iM16931v = j != 0 ? CodedOutputStream.m16931v(1, j) : 0;
            if (!this.name_.isEmpty()) {
                iM16931v += CodedOutputStream.m16901K(2, getName());
            }
            if (!this.url_.isEmpty()) {
                iM16931v += CodedOutputStream.m16901K(3, getUrl());
            }
            this.memoizedSerializedSize = iM16931v;
            return iM16931v;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVoiceKtv.QuickGiftInfoOrBuilder
        public String getUrl() {
            return this.url_;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVoiceKtv.QuickGiftInfoOrBuilder
        public ByteString getUrlBytes() {
            return ByteString.copyFromUtf8(this.url_);
        }

        @Override // com.google.protobuf.InterfaceC3419q
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            long j = this.giftId_;
            if (j != 0) {
                codedOutputStream.m16972u0(1, j);
            }
            if (!this.name_.isEmpty()) {
                codedOutputStream.mo16939D0(2, getName());
            }
            if (this.url_.isEmpty()) {
                return;
            }
            codedOutputStream.mo16939D0(3, getUrl());
        }

        public static QuickGiftInfo parseDelimitedFrom(InputStream inputStream, C3410h c3410h) throws IOException {
            return (QuickGiftInfo) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, c3410h);
        }

        public static QuickGiftInfo parseFrom(ByteString byteString, C3410h c3410h) throws InvalidProtocolBufferException {
            return (QuickGiftInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, c3410h);
        }

        public static QuickGiftInfo parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (QuickGiftInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static QuickGiftInfo parseFrom(byte[] bArr, C3410h c3410h) throws InvalidProtocolBufferException {
            return (QuickGiftInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, c3410h);
        }

        public static QuickGiftInfo parseFrom(InputStream inputStream) throws IOException {
            return (QuickGiftInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static QuickGiftInfo parseFrom(InputStream inputStream, C3410h c3410h) throws IOException {
            return (QuickGiftInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, c3410h);
        }

        public static QuickGiftInfo parseFrom(C3407e c3407e) throws IOException {
            return (QuickGiftInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, c3407e);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static QuickGiftInfo parseFrom(C3407e c3407e, C3410h c3410h) throws IOException {
            return (QuickGiftInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, c3407e, c3410h);
        }
    }

    public static final class VoiceKTVBubble extends GeneratedMessageLite<VoiceKTVBubble, Builder> implements VoiceKTVBubbleOrBuilder {
        public static final int CONTENT_FIELD_NUMBER = 2;
        private static final VoiceKTVBubble DEFAULT_INSTANCE;
        public static final int GAMEID_FIELD_NUMBER = 1;
        private static volatile i860<VoiceKTVBubble> PARSER;
        private String gameId_ = "";
        private String content_ = "";

        public static final class Builder extends GeneratedMessageLite.AbstractC3380b<VoiceKTVBubble, Builder> implements VoiceKTVBubbleOrBuilder {
            private Builder() {
                super(VoiceKTVBubble.DEFAULT_INSTANCE);
            }

            public Builder clearContent() {
                copyOnWrite();
                ((VoiceKTVBubble) this.instance).clearContent();
                return this;
            }

            public Builder clearGameId() {
                copyOnWrite();
                ((VoiceKTVBubble) this.instance).clearGameId();
                return this;
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVoiceKtv.VoiceKTVBubbleOrBuilder
            public String getContent() {
                return ((VoiceKTVBubble) this.instance).getContent();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVoiceKtv.VoiceKTVBubbleOrBuilder
            public ByteString getContentBytes() {
                return ((VoiceKTVBubble) this.instance).getContentBytes();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVoiceKtv.VoiceKTVBubbleOrBuilder
            public String getGameId() {
                return ((VoiceKTVBubble) this.instance).getGameId();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVoiceKtv.VoiceKTVBubbleOrBuilder
            public ByteString getGameIdBytes() {
                return ((VoiceKTVBubble) this.instance).getGameIdBytes();
            }

            public Builder setContent(String str) {
                copyOnWrite();
                ((VoiceKTVBubble) this.instance).setContent(str);
                return this;
            }

            public Builder setContentBytes(ByteString byteString) {
                copyOnWrite();
                ((VoiceKTVBubble) this.instance).setContentBytes(byteString);
                return this;
            }

            public Builder setGameId(String str) {
                copyOnWrite();
                ((VoiceKTVBubble) this.instance).setGameId(str);
                return this;
            }

            public Builder setGameIdBytes(ByteString byteString) {
                copyOnWrite();
                ((VoiceKTVBubble) this.instance).setGameIdBytes(byteString);
                return this;
            }
        }

        static {
            VoiceKTVBubble voiceKTVBubble = new VoiceKTVBubble();
            DEFAULT_INSTANCE = voiceKTVBubble;
            voiceKTVBubble.makeImmutable();
        }

        private VoiceKTVBubble() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearContent() {
            this.content_ = getDefaultInstance().getContent();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearGameId() {
            this.gameId_ = getDefaultInstance().getGameId();
        }

        public static VoiceKTVBubble getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder(VoiceKTVBubble voiceKTVBubble) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(voiceKTVBubble);
        }

        public static VoiceKTVBubble parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (VoiceKTVBubble) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static VoiceKTVBubble parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (VoiceKTVBubble) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static i860<VoiceKTVBubble> parser() {
            return DEFAULT_INSTANCE.getParserForType();
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
        public void setGameId(String str) {
            str.getClass();
            this.gameId_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setGameIdBytes(ByteString byteString) {
            byteString.getClass();
            AbstractC3403a.checkByteStringIsUtf8(byteString);
            this.gameId_ = byteString.toStringUtf8();
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (C45231.f15982xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new VoiceKTVBubble();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                    return null;
                case 4:
                    return new Builder();
                case 5:
                    GeneratedMessageLite.InterfaceC3386h interfaceC3386h = (GeneratedMessageLite.InterfaceC3386h) obj;
                    VoiceKTVBubble voiceKTVBubble = (VoiceKTVBubble) obj2;
                    this.gameId_ = interfaceC3386h.mo16997f(!this.gameId_.isEmpty(), this.gameId_, !voiceKTVBubble.gameId_.isEmpty(), voiceKTVBubble.gameId_);
                    this.content_ = interfaceC3386h.mo16997f(!this.content_.isEmpty(), this.content_, true ^ voiceKTVBubble.content_.isEmpty(), voiceKTVBubble.content_);
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
                                    this.gameId_ = c3407e.m17115L();
                                } else if (iM17116M == 18) {
                                    this.content_ = c3407e.m17115L();
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
                        synchronized (VoiceKTVBubble.class) {
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

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVoiceKtv.VoiceKTVBubbleOrBuilder
        public String getContent() {
            return this.content_;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVoiceKtv.VoiceKTVBubbleOrBuilder
        public ByteString getContentBytes() {
            return ByteString.copyFromUtf8(this.content_);
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVoiceKtv.VoiceKTVBubbleOrBuilder
        public String getGameId() {
            return this.gameId_;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVoiceKtv.VoiceKTVBubbleOrBuilder
        public ByteString getGameIdBytes() {
            return ByteString.copyFromUtf8(this.gameId_);
        }

        @Override // com.google.protobuf.InterfaceC3419q
        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int iM16901K = !this.gameId_.isEmpty() ? CodedOutputStream.m16901K(1, getGameId()) : 0;
            if (!this.content_.isEmpty()) {
                iM16901K += CodedOutputStream.m16901K(2, getContent());
            }
            this.memoizedSerializedSize = iM16901K;
            return iM16901K;
        }

        @Override // com.google.protobuf.InterfaceC3419q
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (!this.gameId_.isEmpty()) {
                codedOutputStream.mo16939D0(1, getGameId());
            }
            if (this.content_.isEmpty()) {
                return;
            }
            codedOutputStream.mo16939D0(2, getContent());
        }

        public static VoiceKTVBubble parseDelimitedFrom(InputStream inputStream, C3410h c3410h) throws IOException {
            return (VoiceKTVBubble) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, c3410h);
        }

        public static VoiceKTVBubble parseFrom(ByteString byteString, C3410h c3410h) throws InvalidProtocolBufferException {
            return (VoiceKTVBubble) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, c3410h);
        }

        public static VoiceKTVBubble parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (VoiceKTVBubble) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static VoiceKTVBubble parseFrom(byte[] bArr, C3410h c3410h) throws InvalidProtocolBufferException {
            return (VoiceKTVBubble) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, c3410h);
        }

        public static VoiceKTVBubble parseFrom(InputStream inputStream) throws IOException {
            return (VoiceKTVBubble) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static VoiceKTVBubble parseFrom(InputStream inputStream, C3410h c3410h) throws IOException {
            return (VoiceKTVBubble) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, c3410h);
        }

        public static VoiceKTVBubble parseFrom(C3407e c3407e) throws IOException {
            return (VoiceKTVBubble) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, c3407e);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static VoiceKTVBubble parseFrom(C3407e c3407e, C3410h c3410h) throws IOException {
            return (VoiceKTVBubble) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, c3407e, c3410h);
        }
    }

    public static final class VoiceKTVGame extends GeneratedMessageLite<VoiceKTVGame, Builder> implements VoiceKTVGameOrBuilder {
        public static final int BACKGROUNDURL_FIELD_NUMBER = 6;
        private static final VoiceKTVGame DEFAULT_INSTANCE;
        public static final int ID_FIELD_NUMBER = 1;
        public static final int NEXTPLAYINFO_FIELD_NUMBER = 4;
        public static final int PANELBGINFO_FIELD_NUMBER = 7;
        private static volatile i860<VoiceKTVGame> PARSER = null;
        public static final int PLAYINFO_FIELD_NUMBER = 3;
        public static final int STATUS_FIELD_NUMBER = 2;
        public static final int TOAST_FIELD_NUMBER = 5;
        private PlayInfo nextPlayInfo_;
        private PanelBgInfo panelBgInfo_;
        private PlayInfo playInfo_;
        private String id_ = "";
        private String status_ = "";
        private String toast_ = "";
        private String backgroundUrl_ = "";

        static {
            VoiceKTVGame voiceKTVGame = new VoiceKTVGame();
            DEFAULT_INSTANCE = voiceKTVGame;
            voiceKTVGame.makeImmutable();
        }

        private VoiceKTVGame() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearBackgroundUrl() {
            this.backgroundUrl_ = getDefaultInstance().getBackgroundUrl();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearId() {
            this.id_ = getDefaultInstance().getId();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearNextPlayInfo() {
            this.nextPlayInfo_ = null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearPanelBgInfo() {
            this.panelBgInfo_ = null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearPlayInfo() {
            this.playInfo_ = null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearStatus() {
            this.status_ = getDefaultInstance().getStatus();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearToast() {
            this.toast_ = getDefaultInstance().getToast();
        }

        public static VoiceKTVGame getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeNextPlayInfo(PlayInfo playInfo) {
            PlayInfo playInfo2 = this.nextPlayInfo_;
            if (playInfo2 == null || playInfo2 == PlayInfo.getDefaultInstance()) {
                this.nextPlayInfo_ = playInfo;
            } else {
                this.nextPlayInfo_ = PlayInfo.newBuilder(this.nextPlayInfo_).mergeFrom(playInfo).buildPartial();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergePanelBgInfo(PanelBgInfo panelBgInfo) {
            PanelBgInfo panelBgInfo2 = this.panelBgInfo_;
            if (panelBgInfo2 == null || panelBgInfo2 == PanelBgInfo.getDefaultInstance()) {
                this.panelBgInfo_ = panelBgInfo;
            } else {
                this.panelBgInfo_ = PanelBgInfo.newBuilder(this.panelBgInfo_).mergeFrom(panelBgInfo).buildPartial();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergePlayInfo(PlayInfo playInfo) {
            PlayInfo playInfo2 = this.playInfo_;
            if (playInfo2 == null || playInfo2 == PlayInfo.getDefaultInstance()) {
                this.playInfo_ = playInfo;
            } else {
                this.playInfo_ = PlayInfo.newBuilder(this.playInfo_).mergeFrom(playInfo).buildPartial();
            }
        }

        public static Builder newBuilder(VoiceKTVGame voiceKTVGame) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(voiceKTVGame);
        }

        public static VoiceKTVGame parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (VoiceKTVGame) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static VoiceKTVGame parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (VoiceKTVGame) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static i860<VoiceKTVGame> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setBackgroundUrl(String str) {
            str.getClass();
            this.backgroundUrl_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setBackgroundUrlBytes(ByteString byteString) {
            byteString.getClass();
            AbstractC3403a.checkByteStringIsUtf8(byteString);
            this.backgroundUrl_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setId(String str) {
            str.getClass();
            this.id_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setIdBytes(ByteString byteString) {
            byteString.getClass();
            AbstractC3403a.checkByteStringIsUtf8(byteString);
            this.id_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setNextPlayInfo(PlayInfo.Builder builder) {
            this.nextPlayInfo_ = builder.build();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setPanelBgInfo(PanelBgInfo.Builder builder) {
            this.panelBgInfo_ = builder.build();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setPlayInfo(PlayInfo.Builder builder) {
            this.playInfo_ = builder.build();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setStatus(String str) {
            str.getClass();
            this.status_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setStatusBytes(ByteString byteString) {
            byteString.getClass();
            AbstractC3403a.checkByteStringIsUtf8(byteString);
            this.status_ = byteString.toStringUtf8();
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
            switch (C45231.f15982xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new VoiceKTVGame();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                    return null;
                case 4:
                    return new Builder();
                case 5:
                    GeneratedMessageLite.InterfaceC3386h interfaceC3386h = (GeneratedMessageLite.InterfaceC3386h) obj;
                    VoiceKTVGame voiceKTVGame = (VoiceKTVGame) obj2;
                    this.id_ = interfaceC3386h.mo16997f(!this.id_.isEmpty(), this.id_, !voiceKTVGame.id_.isEmpty(), voiceKTVGame.id_);
                    this.status_ = interfaceC3386h.mo16997f(!this.status_.isEmpty(), this.status_, !voiceKTVGame.status_.isEmpty(), voiceKTVGame.status_);
                    this.playInfo_ = (PlayInfo) interfaceC3386h.mo17006o(this.playInfo_, voiceKTVGame.playInfo_);
                    this.nextPlayInfo_ = (PlayInfo) interfaceC3386h.mo17006o(this.nextPlayInfo_, voiceKTVGame.nextPlayInfo_);
                    this.toast_ = interfaceC3386h.mo16997f(!this.toast_.isEmpty(), this.toast_, !voiceKTVGame.toast_.isEmpty(), voiceKTVGame.toast_);
                    this.backgroundUrl_ = interfaceC3386h.mo16997f(!this.backgroundUrl_.isEmpty(), this.backgroundUrl_, true ^ voiceKTVGame.backgroundUrl_.isEmpty(), voiceKTVGame.backgroundUrl_);
                    this.panelBgInfo_ = (PanelBgInfo) interfaceC3386h.mo17006o(this.panelBgInfo_, voiceKTVGame.panelBgInfo_);
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
                                    this.id_ = c3407e.m17115L();
                                } else if (iM17116M == 18) {
                                    this.status_ = c3407e.m17115L();
                                } else if (iM17116M == 26) {
                                    PlayInfo playInfo = this.playInfo_;
                                    PlayInfo.Builder builder = playInfo != null ? playInfo.toBuilder() : null;
                                    PlayInfo playInfo2 = (PlayInfo) c3407e.m17143w(PlayInfo.parser(), c3410h);
                                    this.playInfo_ = playInfo2;
                                    if (builder != null) {
                                        builder.mergeFrom(playInfo2);
                                        this.playInfo_ = builder.buildPartial();
                                    }
                                } else if (iM17116M == 34) {
                                    PlayInfo playInfo3 = this.nextPlayInfo_;
                                    PlayInfo.Builder builder2 = playInfo3 != null ? playInfo3.toBuilder() : null;
                                    PlayInfo playInfo4 = (PlayInfo) c3407e.m17143w(PlayInfo.parser(), c3410h);
                                    this.nextPlayInfo_ = playInfo4;
                                    if (builder2 != null) {
                                        builder2.mergeFrom(playInfo4);
                                        this.nextPlayInfo_ = builder2.buildPartial();
                                    }
                                } else if (iM17116M == 42) {
                                    this.toast_ = c3407e.m17115L();
                                } else if (iM17116M == 50) {
                                    this.backgroundUrl_ = c3407e.m17115L();
                                } else if (iM17116M == 58) {
                                    PanelBgInfo panelBgInfo = this.panelBgInfo_;
                                    PanelBgInfo.Builder builder3 = panelBgInfo != null ? panelBgInfo.toBuilder() : null;
                                    PanelBgInfo panelBgInfo2 = (PanelBgInfo) c3407e.m17143w(PanelBgInfo.parser(), c3410h);
                                    this.panelBgInfo_ = panelBgInfo2;
                                    if (builder3 != null) {
                                        builder3.mergeFrom(panelBgInfo2);
                                        this.panelBgInfo_ = builder3.buildPartial();
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
                        synchronized (VoiceKTVGame.class) {
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

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVoiceKtv.VoiceKTVGameOrBuilder
        public String getBackgroundUrl() {
            return this.backgroundUrl_;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVoiceKtv.VoiceKTVGameOrBuilder
        public ByteString getBackgroundUrlBytes() {
            return ByteString.copyFromUtf8(this.backgroundUrl_);
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVoiceKtv.VoiceKTVGameOrBuilder
        public String getId() {
            return this.id_;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVoiceKtv.VoiceKTVGameOrBuilder
        public ByteString getIdBytes() {
            return ByteString.copyFromUtf8(this.id_);
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVoiceKtv.VoiceKTVGameOrBuilder
        public PlayInfo getNextPlayInfo() {
            PlayInfo playInfo = this.nextPlayInfo_;
            return playInfo == null ? PlayInfo.getDefaultInstance() : playInfo;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVoiceKtv.VoiceKTVGameOrBuilder
        public PanelBgInfo getPanelBgInfo() {
            PanelBgInfo panelBgInfo = this.panelBgInfo_;
            return panelBgInfo == null ? PanelBgInfo.getDefaultInstance() : panelBgInfo;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVoiceKtv.VoiceKTVGameOrBuilder
        public PlayInfo getPlayInfo() {
            PlayInfo playInfo = this.playInfo_;
            return playInfo == null ? PlayInfo.getDefaultInstance() : playInfo;
        }

        @Override // com.google.protobuf.InterfaceC3419q
        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int iM16901K = !this.id_.isEmpty() ? CodedOutputStream.m16901K(1, getId()) : 0;
            if (!this.status_.isEmpty()) {
                iM16901K += CodedOutputStream.m16901K(2, getStatus());
            }
            if (this.playInfo_ != null) {
                iM16901K += CodedOutputStream.m16893C(3, getPlayInfo());
            }
            if (this.nextPlayInfo_ != null) {
                iM16901K += CodedOutputStream.m16893C(4, getNextPlayInfo());
            }
            if (!this.toast_.isEmpty()) {
                iM16901K += CodedOutputStream.m16901K(5, getToast());
            }
            if (!this.backgroundUrl_.isEmpty()) {
                iM16901K += CodedOutputStream.m16901K(6, getBackgroundUrl());
            }
            if (this.panelBgInfo_ != null) {
                iM16901K += CodedOutputStream.m16893C(7, getPanelBgInfo());
            }
            this.memoizedSerializedSize = iM16901K;
            return iM16901K;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVoiceKtv.VoiceKTVGameOrBuilder
        public String getStatus() {
            return this.status_;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVoiceKtv.VoiceKTVGameOrBuilder
        public ByteString getStatusBytes() {
            return ByteString.copyFromUtf8(this.status_);
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVoiceKtv.VoiceKTVGameOrBuilder
        public String getToast() {
            return this.toast_;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVoiceKtv.VoiceKTVGameOrBuilder
        public ByteString getToastBytes() {
            return ByteString.copyFromUtf8(this.toast_);
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVoiceKtv.VoiceKTVGameOrBuilder
        public boolean hasNextPlayInfo() {
            return this.nextPlayInfo_ != null;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVoiceKtv.VoiceKTVGameOrBuilder
        public boolean hasPanelBgInfo() {
            return this.panelBgInfo_ != null;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVoiceKtv.VoiceKTVGameOrBuilder
        public boolean hasPlayInfo() {
            return this.playInfo_ != null;
        }

        @Override // com.google.protobuf.InterfaceC3419q
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (!this.id_.isEmpty()) {
                codedOutputStream.mo16939D0(1, getId());
            }
            if (!this.status_.isEmpty()) {
                codedOutputStream.mo16939D0(2, getStatus());
            }
            if (this.playInfo_ != null) {
                codedOutputStream.mo16974w0(3, getPlayInfo());
            }
            if (this.nextPlayInfo_ != null) {
                codedOutputStream.mo16974w0(4, getNextPlayInfo());
            }
            if (!this.toast_.isEmpty()) {
                codedOutputStream.mo16939D0(5, getToast());
            }
            if (!this.backgroundUrl_.isEmpty()) {
                codedOutputStream.mo16939D0(6, getBackgroundUrl());
            }
            if (this.panelBgInfo_ != null) {
                codedOutputStream.mo16974w0(7, getPanelBgInfo());
            }
        }

        public static VoiceKTVGame parseDelimitedFrom(InputStream inputStream, C3410h c3410h) throws IOException {
            return (VoiceKTVGame) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, c3410h);
        }

        public static VoiceKTVGame parseFrom(ByteString byteString, C3410h c3410h) throws InvalidProtocolBufferException {
            return (VoiceKTVGame) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, c3410h);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setNextPlayInfo(PlayInfo playInfo) {
            playInfo.getClass();
            this.nextPlayInfo_ = playInfo;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setPanelBgInfo(PanelBgInfo panelBgInfo) {
            panelBgInfo.getClass();
            this.panelBgInfo_ = panelBgInfo;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setPlayInfo(PlayInfo playInfo) {
            playInfo.getClass();
            this.playInfo_ = playInfo;
        }

        public static final class Builder extends GeneratedMessageLite.AbstractC3380b<VoiceKTVGame, Builder> implements VoiceKTVGameOrBuilder {
            private Builder() {
                super(VoiceKTVGame.DEFAULT_INSTANCE);
            }

            public Builder clearBackgroundUrl() {
                copyOnWrite();
                ((VoiceKTVGame) this.instance).clearBackgroundUrl();
                return this;
            }

            public Builder clearId() {
                copyOnWrite();
                ((VoiceKTVGame) this.instance).clearId();
                return this;
            }

            public Builder clearNextPlayInfo() {
                copyOnWrite();
                ((VoiceKTVGame) this.instance).clearNextPlayInfo();
                return this;
            }

            public Builder clearPanelBgInfo() {
                copyOnWrite();
                ((VoiceKTVGame) this.instance).clearPanelBgInfo();
                return this;
            }

            public Builder clearPlayInfo() {
                copyOnWrite();
                ((VoiceKTVGame) this.instance).clearPlayInfo();
                return this;
            }

            public Builder clearStatus() {
                copyOnWrite();
                ((VoiceKTVGame) this.instance).clearStatus();
                return this;
            }

            public Builder clearToast() {
                copyOnWrite();
                ((VoiceKTVGame) this.instance).clearToast();
                return this;
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVoiceKtv.VoiceKTVGameOrBuilder
            public String getBackgroundUrl() {
                return ((VoiceKTVGame) this.instance).getBackgroundUrl();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVoiceKtv.VoiceKTVGameOrBuilder
            public ByteString getBackgroundUrlBytes() {
                return ((VoiceKTVGame) this.instance).getBackgroundUrlBytes();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVoiceKtv.VoiceKTVGameOrBuilder
            public String getId() {
                return ((VoiceKTVGame) this.instance).getId();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVoiceKtv.VoiceKTVGameOrBuilder
            public ByteString getIdBytes() {
                return ((VoiceKTVGame) this.instance).getIdBytes();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVoiceKtv.VoiceKTVGameOrBuilder
            public PlayInfo getNextPlayInfo() {
                return ((VoiceKTVGame) this.instance).getNextPlayInfo();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVoiceKtv.VoiceKTVGameOrBuilder
            public PanelBgInfo getPanelBgInfo() {
                return ((VoiceKTVGame) this.instance).getPanelBgInfo();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVoiceKtv.VoiceKTVGameOrBuilder
            public PlayInfo getPlayInfo() {
                return ((VoiceKTVGame) this.instance).getPlayInfo();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVoiceKtv.VoiceKTVGameOrBuilder
            public String getStatus() {
                return ((VoiceKTVGame) this.instance).getStatus();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVoiceKtv.VoiceKTVGameOrBuilder
            public ByteString getStatusBytes() {
                return ((VoiceKTVGame) this.instance).getStatusBytes();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVoiceKtv.VoiceKTVGameOrBuilder
            public String getToast() {
                return ((VoiceKTVGame) this.instance).getToast();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVoiceKtv.VoiceKTVGameOrBuilder
            public ByteString getToastBytes() {
                return ((VoiceKTVGame) this.instance).getToastBytes();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVoiceKtv.VoiceKTVGameOrBuilder
            public boolean hasNextPlayInfo() {
                return ((VoiceKTVGame) this.instance).hasNextPlayInfo();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVoiceKtv.VoiceKTVGameOrBuilder
            public boolean hasPanelBgInfo() {
                return ((VoiceKTVGame) this.instance).hasPanelBgInfo();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVoiceKtv.VoiceKTVGameOrBuilder
            public boolean hasPlayInfo() {
                return ((VoiceKTVGame) this.instance).hasPlayInfo();
            }

            public Builder mergeNextPlayInfo(PlayInfo playInfo) {
                copyOnWrite();
                ((VoiceKTVGame) this.instance).mergeNextPlayInfo(playInfo);
                return this;
            }

            public Builder mergePanelBgInfo(PanelBgInfo panelBgInfo) {
                copyOnWrite();
                ((VoiceKTVGame) this.instance).mergePanelBgInfo(panelBgInfo);
                return this;
            }

            public Builder mergePlayInfo(PlayInfo playInfo) {
                copyOnWrite();
                ((VoiceKTVGame) this.instance).mergePlayInfo(playInfo);
                return this;
            }

            public Builder setBackgroundUrl(String str) {
                copyOnWrite();
                ((VoiceKTVGame) this.instance).setBackgroundUrl(str);
                return this;
            }

            public Builder setBackgroundUrlBytes(ByteString byteString) {
                copyOnWrite();
                ((VoiceKTVGame) this.instance).setBackgroundUrlBytes(byteString);
                return this;
            }

            public Builder setId(String str) {
                copyOnWrite();
                ((VoiceKTVGame) this.instance).setId(str);
                return this;
            }

            public Builder setIdBytes(ByteString byteString) {
                copyOnWrite();
                ((VoiceKTVGame) this.instance).setIdBytes(byteString);
                return this;
            }

            public Builder setNextPlayInfo(PlayInfo playInfo) {
                copyOnWrite();
                ((VoiceKTVGame) this.instance).setNextPlayInfo(playInfo);
                return this;
            }

            public Builder setPanelBgInfo(PanelBgInfo panelBgInfo) {
                copyOnWrite();
                ((VoiceKTVGame) this.instance).setPanelBgInfo(panelBgInfo);
                return this;
            }

            public Builder setPlayInfo(PlayInfo playInfo) {
                copyOnWrite();
                ((VoiceKTVGame) this.instance).setPlayInfo(playInfo);
                return this;
            }

            public Builder setStatus(String str) {
                copyOnWrite();
                ((VoiceKTVGame) this.instance).setStatus(str);
                return this;
            }

            public Builder setStatusBytes(ByteString byteString) {
                copyOnWrite();
                ((VoiceKTVGame) this.instance).setStatusBytes(byteString);
                return this;
            }

            public Builder setToast(String str) {
                copyOnWrite();
                ((VoiceKTVGame) this.instance).setToast(str);
                return this;
            }

            public Builder setToastBytes(ByteString byteString) {
                copyOnWrite();
                ((VoiceKTVGame) this.instance).setToastBytes(byteString);
                return this;
            }

            public Builder setNextPlayInfo(PlayInfo.Builder builder) {
                copyOnWrite();
                ((VoiceKTVGame) this.instance).setNextPlayInfo(builder);
                return this;
            }

            public Builder setPanelBgInfo(PanelBgInfo.Builder builder) {
                copyOnWrite();
                ((VoiceKTVGame) this.instance).setPanelBgInfo(builder);
                return this;
            }

            public Builder setPlayInfo(PlayInfo.Builder builder) {
                copyOnWrite();
                ((VoiceKTVGame) this.instance).setPlayInfo(builder);
                return this;
            }
        }

        public static VoiceKTVGame parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (VoiceKTVGame) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static VoiceKTVGame parseFrom(byte[] bArr, C3410h c3410h) throws InvalidProtocolBufferException {
            return (VoiceKTVGame) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, c3410h);
        }

        public static VoiceKTVGame parseFrom(InputStream inputStream) throws IOException {
            return (VoiceKTVGame) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static VoiceKTVGame parseFrom(InputStream inputStream, C3410h c3410h) throws IOException {
            return (VoiceKTVGame) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, c3410h);
        }

        public static VoiceKTVGame parseFrom(C3407e c3407e) throws IOException {
            return (VoiceKTVGame) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, c3407e);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static VoiceKTVGame parseFrom(C3407e c3407e, C3410h c3410h) throws IOException {
            return (VoiceKTVGame) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, c3407e, c3410h);
        }
    }

    public static final class VoiceKTVOrderRating extends GeneratedMessageLite<VoiceKTVOrderRating, Builder> implements VoiceKTVOrderRatingOrBuilder {
        private static final VoiceKTVOrderRating DEFAULT_INSTANCE;
        public static final int GIFTUV_FIELD_NUMBER = 7;
        public static final int LEVELTIP_FIELD_NUMBER = 4;
        public static final int LEVEL_FIELD_NUMBER = 2;
        public static final int MAXLEVEL_FIELD_NUMBER = 3;
        public static final int NEXTLEVELGIFTUV_FIELD_NUMBER = 8;
        public static final int ORDERID_FIELD_NUMBER = 1;
        private static volatile i860<VoiceKTVOrderRating> PARSER = null;
        public static final int SCHEMA_FIELD_NUMBER = 6;
        public static final int SCORE_FIELD_NUMBER = 5;
        public static final int SHOWBGSVGAURL_FIELD_NUMBER = 9;
        private int giftUv_;
        private int level_;
        private int maxLevel_;
        private int nextLevelGiftUv_;
        private int score_;
        private String orderId_ = "";
        private String levelTip_ = "";
        private String schema_ = "";
        private String showBgSvgaUrl_ = "";

        public static final class Builder extends GeneratedMessageLite.AbstractC3380b<VoiceKTVOrderRating, Builder> implements VoiceKTVOrderRatingOrBuilder {
            private Builder() {
                super(VoiceKTVOrderRating.DEFAULT_INSTANCE);
            }

            public Builder clearGiftUv() {
                copyOnWrite();
                ((VoiceKTVOrderRating) this.instance).clearGiftUv();
                return this;
            }

            public Builder clearLevel() {
                copyOnWrite();
                ((VoiceKTVOrderRating) this.instance).clearLevel();
                return this;
            }

            public Builder clearLevelTip() {
                copyOnWrite();
                ((VoiceKTVOrderRating) this.instance).clearLevelTip();
                return this;
            }

            public Builder clearMaxLevel() {
                copyOnWrite();
                ((VoiceKTVOrderRating) this.instance).clearMaxLevel();
                return this;
            }

            public Builder clearNextLevelGiftUv() {
                copyOnWrite();
                ((VoiceKTVOrderRating) this.instance).clearNextLevelGiftUv();
                return this;
            }

            public Builder clearOrderId() {
                copyOnWrite();
                ((VoiceKTVOrderRating) this.instance).clearOrderId();
                return this;
            }

            public Builder clearSchema() {
                copyOnWrite();
                ((VoiceKTVOrderRating) this.instance).clearSchema();
                return this;
            }

            public Builder clearScore() {
                copyOnWrite();
                ((VoiceKTVOrderRating) this.instance).clearScore();
                return this;
            }

            public Builder clearShowBgSvgaUrl() {
                copyOnWrite();
                ((VoiceKTVOrderRating) this.instance).clearShowBgSvgaUrl();
                return this;
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVoiceKtv.VoiceKTVOrderRatingOrBuilder
            public int getGiftUv() {
                return ((VoiceKTVOrderRating) this.instance).getGiftUv();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVoiceKtv.VoiceKTVOrderRatingOrBuilder
            public int getLevel() {
                return ((VoiceKTVOrderRating) this.instance).getLevel();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVoiceKtv.VoiceKTVOrderRatingOrBuilder
            public String getLevelTip() {
                return ((VoiceKTVOrderRating) this.instance).getLevelTip();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVoiceKtv.VoiceKTVOrderRatingOrBuilder
            public ByteString getLevelTipBytes() {
                return ((VoiceKTVOrderRating) this.instance).getLevelTipBytes();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVoiceKtv.VoiceKTVOrderRatingOrBuilder
            public int getMaxLevel() {
                return ((VoiceKTVOrderRating) this.instance).getMaxLevel();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVoiceKtv.VoiceKTVOrderRatingOrBuilder
            public int getNextLevelGiftUv() {
                return ((VoiceKTVOrderRating) this.instance).getNextLevelGiftUv();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVoiceKtv.VoiceKTVOrderRatingOrBuilder
            public String getOrderId() {
                return ((VoiceKTVOrderRating) this.instance).getOrderId();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVoiceKtv.VoiceKTVOrderRatingOrBuilder
            public ByteString getOrderIdBytes() {
                return ((VoiceKTVOrderRating) this.instance).getOrderIdBytes();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVoiceKtv.VoiceKTVOrderRatingOrBuilder
            public String getSchema() {
                return ((VoiceKTVOrderRating) this.instance).getSchema();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVoiceKtv.VoiceKTVOrderRatingOrBuilder
            public ByteString getSchemaBytes() {
                return ((VoiceKTVOrderRating) this.instance).getSchemaBytes();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVoiceKtv.VoiceKTVOrderRatingOrBuilder
            public int getScore() {
                return ((VoiceKTVOrderRating) this.instance).getScore();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVoiceKtv.VoiceKTVOrderRatingOrBuilder
            public String getShowBgSvgaUrl() {
                return ((VoiceKTVOrderRating) this.instance).getShowBgSvgaUrl();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVoiceKtv.VoiceKTVOrderRatingOrBuilder
            public ByteString getShowBgSvgaUrlBytes() {
                return ((VoiceKTVOrderRating) this.instance).getShowBgSvgaUrlBytes();
            }

            public Builder setGiftUv(int i) {
                copyOnWrite();
                ((VoiceKTVOrderRating) this.instance).setGiftUv(i);
                return this;
            }

            public Builder setLevel(int i) {
                copyOnWrite();
                ((VoiceKTVOrderRating) this.instance).setLevel(i);
                return this;
            }

            public Builder setLevelTip(String str) {
                copyOnWrite();
                ((VoiceKTVOrderRating) this.instance).setLevelTip(str);
                return this;
            }

            public Builder setLevelTipBytes(ByteString byteString) {
                copyOnWrite();
                ((VoiceKTVOrderRating) this.instance).setLevelTipBytes(byteString);
                return this;
            }

            public Builder setMaxLevel(int i) {
                copyOnWrite();
                ((VoiceKTVOrderRating) this.instance).setMaxLevel(i);
                return this;
            }

            public Builder setNextLevelGiftUv(int i) {
                copyOnWrite();
                ((VoiceKTVOrderRating) this.instance).setNextLevelGiftUv(i);
                return this;
            }

            public Builder setOrderId(String str) {
                copyOnWrite();
                ((VoiceKTVOrderRating) this.instance).setOrderId(str);
                return this;
            }

            public Builder setOrderIdBytes(ByteString byteString) {
                copyOnWrite();
                ((VoiceKTVOrderRating) this.instance).setOrderIdBytes(byteString);
                return this;
            }

            public Builder setSchema(String str) {
                copyOnWrite();
                ((VoiceKTVOrderRating) this.instance).setSchema(str);
                return this;
            }

            public Builder setSchemaBytes(ByteString byteString) {
                copyOnWrite();
                ((VoiceKTVOrderRating) this.instance).setSchemaBytes(byteString);
                return this;
            }

            public Builder setScore(int i) {
                copyOnWrite();
                ((VoiceKTVOrderRating) this.instance).setScore(i);
                return this;
            }

            public Builder setShowBgSvgaUrl(String str) {
                copyOnWrite();
                ((VoiceKTVOrderRating) this.instance).setShowBgSvgaUrl(str);
                return this;
            }

            public Builder setShowBgSvgaUrlBytes(ByteString byteString) {
                copyOnWrite();
                ((VoiceKTVOrderRating) this.instance).setShowBgSvgaUrlBytes(byteString);
                return this;
            }
        }

        static {
            VoiceKTVOrderRating voiceKTVOrderRating = new VoiceKTVOrderRating();
            DEFAULT_INSTANCE = voiceKTVOrderRating;
            voiceKTVOrderRating.makeImmutable();
        }

        private VoiceKTVOrderRating() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearGiftUv() {
            this.giftUv_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearLevel() {
            this.level_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearLevelTip() {
            this.levelTip_ = getDefaultInstance().getLevelTip();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearMaxLevel() {
            this.maxLevel_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearNextLevelGiftUv() {
            this.nextLevelGiftUv_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearOrderId() {
            this.orderId_ = getDefaultInstance().getOrderId();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearSchema() {
            this.schema_ = getDefaultInstance().getSchema();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearScore() {
            this.score_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearShowBgSvgaUrl() {
            this.showBgSvgaUrl_ = getDefaultInstance().getShowBgSvgaUrl();
        }

        public static VoiceKTVOrderRating getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder(VoiceKTVOrderRating voiceKTVOrderRating) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(voiceKTVOrderRating);
        }

        public static VoiceKTVOrderRating parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (VoiceKTVOrderRating) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static VoiceKTVOrderRating parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (VoiceKTVOrderRating) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static i860<VoiceKTVOrderRating> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setGiftUv(int i) {
            this.giftUv_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setLevel(int i) {
            this.level_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setLevelTip(String str) {
            str.getClass();
            this.levelTip_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setLevelTipBytes(ByteString byteString) {
            byteString.getClass();
            AbstractC3403a.checkByteStringIsUtf8(byteString);
            this.levelTip_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setMaxLevel(int i) {
            this.maxLevel_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setNextLevelGiftUv(int i) {
            this.nextLevelGiftUv_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setOrderId(String str) {
            str.getClass();
            this.orderId_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setOrderIdBytes(ByteString byteString) {
            byteString.getClass();
            AbstractC3403a.checkByteStringIsUtf8(byteString);
            this.orderId_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSchema(String str) {
            str.getClass();
            this.schema_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSchemaBytes(ByteString byteString) {
            byteString.getClass();
            AbstractC3403a.checkByteStringIsUtf8(byteString);
            this.schema_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setScore(int i) {
            this.score_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setShowBgSvgaUrl(String str) {
            str.getClass();
            this.showBgSvgaUrl_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setShowBgSvgaUrlBytes(ByteString byteString) {
            byteString.getClass();
            AbstractC3403a.checkByteStringIsUtf8(byteString);
            this.showBgSvgaUrl_ = byteString.toStringUtf8();
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            boolean z = false;
            switch (C45231.f15982xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new VoiceKTVOrderRating();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                    return null;
                case 4:
                    return new Builder();
                case 5:
                    GeneratedMessageLite.InterfaceC3386h interfaceC3386h = (GeneratedMessageLite.InterfaceC3386h) obj;
                    VoiceKTVOrderRating voiceKTVOrderRating = (VoiceKTVOrderRating) obj2;
                    this.orderId_ = interfaceC3386h.mo16997f(!this.orderId_.isEmpty(), this.orderId_, !voiceKTVOrderRating.orderId_.isEmpty(), voiceKTVOrderRating.orderId_);
                    int i = this.level_;
                    boolean z2 = i != 0;
                    int i2 = voiceKTVOrderRating.level_;
                    this.level_ = interfaceC3386h.mo16996e(z2, i, i2 != 0, i2);
                    int i3 = this.maxLevel_;
                    boolean z3 = i3 != 0;
                    int i4 = voiceKTVOrderRating.maxLevel_;
                    this.maxLevel_ = interfaceC3386h.mo16996e(z3, i3, i4 != 0, i4);
                    this.levelTip_ = interfaceC3386h.mo16997f(!this.levelTip_.isEmpty(), this.levelTip_, !voiceKTVOrderRating.levelTip_.isEmpty(), voiceKTVOrderRating.levelTip_);
                    int i5 = this.score_;
                    boolean z4 = i5 != 0;
                    int i6 = voiceKTVOrderRating.score_;
                    this.score_ = interfaceC3386h.mo16996e(z4, i5, i6 != 0, i6);
                    this.schema_ = interfaceC3386h.mo16997f(!this.schema_.isEmpty(), this.schema_, !voiceKTVOrderRating.schema_.isEmpty(), voiceKTVOrderRating.schema_);
                    int i7 = this.giftUv_;
                    boolean z5 = i7 != 0;
                    int i8 = voiceKTVOrderRating.giftUv_;
                    this.giftUv_ = interfaceC3386h.mo16996e(z5, i7, i8 != 0, i8);
                    int i9 = this.nextLevelGiftUv_;
                    boolean z6 = i9 != 0;
                    int i10 = voiceKTVOrderRating.nextLevelGiftUv_;
                    this.nextLevelGiftUv_ = interfaceC3386h.mo16996e(z6, i9, i10 != 0, i10);
                    this.showBgSvgaUrl_ = interfaceC3386h.mo16997f(!this.showBgSvgaUrl_.isEmpty(), this.showBgSvgaUrl_, !voiceKTVOrderRating.showBgSvgaUrl_.isEmpty(), voiceKTVOrderRating.showBgSvgaUrl_);
                    GeneratedMessageLite.C3385g c3385g = GeneratedMessageLite.C3385g.INSTANCE;
                    return this;
                case 6:
                    C3407e c3407e = (C3407e) obj;
                    while (!z) {
                        try {
                            int iM17116M = c3407e.m17116M();
                            if (iM17116M != 0) {
                                if (iM17116M == 10) {
                                    this.orderId_ = c3407e.m17115L();
                                } else if (iM17116M == 16) {
                                    this.level_ = c3407e.m17141u();
                                } else if (iM17116M == 24) {
                                    this.maxLevel_ = c3407e.m17141u();
                                } else if (iM17116M == 34) {
                                    this.levelTip_ = c3407e.m17115L();
                                } else if (iM17116M == 40) {
                                    this.score_ = c3407e.m17141u();
                                } else if (iM17116M == 50) {
                                    this.schema_ = c3407e.m17115L();
                                } else if (iM17116M == 56) {
                                    this.giftUv_ = c3407e.m17141u();
                                } else if (iM17116M == 64) {
                                    this.nextLevelGiftUv_ = c3407e.m17141u();
                                } else if (iM17116M == 74) {
                                    this.showBgSvgaUrl_ = c3407e.m17115L();
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
                        synchronized (VoiceKTVOrderRating.class) {
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

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVoiceKtv.VoiceKTVOrderRatingOrBuilder
        public int getGiftUv() {
            return this.giftUv_;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVoiceKtv.VoiceKTVOrderRatingOrBuilder
        public int getLevel() {
            return this.level_;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVoiceKtv.VoiceKTVOrderRatingOrBuilder
        public String getLevelTip() {
            return this.levelTip_;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVoiceKtv.VoiceKTVOrderRatingOrBuilder
        public ByteString getLevelTipBytes() {
            return ByteString.copyFromUtf8(this.levelTip_);
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVoiceKtv.VoiceKTVOrderRatingOrBuilder
        public int getMaxLevel() {
            return this.maxLevel_;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVoiceKtv.VoiceKTVOrderRatingOrBuilder
        public int getNextLevelGiftUv() {
            return this.nextLevelGiftUv_;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVoiceKtv.VoiceKTVOrderRatingOrBuilder
        public String getOrderId() {
            return this.orderId_;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVoiceKtv.VoiceKTVOrderRatingOrBuilder
        public ByteString getOrderIdBytes() {
            return ByteString.copyFromUtf8(this.orderId_);
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVoiceKtv.VoiceKTVOrderRatingOrBuilder
        public String getSchema() {
            return this.schema_;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVoiceKtv.VoiceKTVOrderRatingOrBuilder
        public ByteString getSchemaBytes() {
            return ByteString.copyFromUtf8(this.schema_);
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVoiceKtv.VoiceKTVOrderRatingOrBuilder
        public int getScore() {
            return this.score_;
        }

        @Override // com.google.protobuf.InterfaceC3419q
        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int iM16901K = !this.orderId_.isEmpty() ? CodedOutputStream.m16901K(1, getOrderId()) : 0;
            int i2 = this.level_;
            if (i2 != 0) {
                iM16901K += CodedOutputStream.m16929t(2, i2);
            }
            int i3 = this.maxLevel_;
            if (i3 != 0) {
                iM16901K += CodedOutputStream.m16929t(3, i3);
            }
            if (!this.levelTip_.isEmpty()) {
                iM16901K += CodedOutputStream.m16901K(4, getLevelTip());
            }
            int i4 = this.score_;
            if (i4 != 0) {
                iM16901K += CodedOutputStream.m16929t(5, i4);
            }
            if (!this.schema_.isEmpty()) {
                iM16901K += CodedOutputStream.m16901K(6, getSchema());
            }
            int i5 = this.giftUv_;
            if (i5 != 0) {
                iM16901K += CodedOutputStream.m16929t(7, i5);
            }
            int i6 = this.nextLevelGiftUv_;
            if (i6 != 0) {
                iM16901K += CodedOutputStream.m16929t(8, i6);
            }
            if (!this.showBgSvgaUrl_.isEmpty()) {
                iM16901K += CodedOutputStream.m16901K(9, getShowBgSvgaUrl());
            }
            this.memoizedSerializedSize = iM16901K;
            return iM16901K;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVoiceKtv.VoiceKTVOrderRatingOrBuilder
        public String getShowBgSvgaUrl() {
            return this.showBgSvgaUrl_;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVoiceKtv.VoiceKTVOrderRatingOrBuilder
        public ByteString getShowBgSvgaUrlBytes() {
            return ByteString.copyFromUtf8(this.showBgSvgaUrl_);
        }

        @Override // com.google.protobuf.InterfaceC3419q
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (!this.orderId_.isEmpty()) {
                codedOutputStream.mo16939D0(1, getOrderId());
            }
            int i = this.level_;
            if (i != 0) {
                codedOutputStream.mo16970s0(2, i);
            }
            int i2 = this.maxLevel_;
            if (i2 != 0) {
                codedOutputStream.mo16970s0(3, i2);
            }
            if (!this.levelTip_.isEmpty()) {
                codedOutputStream.mo16939D0(4, getLevelTip());
            }
            int i3 = this.score_;
            if (i3 != 0) {
                codedOutputStream.mo16970s0(5, i3);
            }
            if (!this.schema_.isEmpty()) {
                codedOutputStream.mo16939D0(6, getSchema());
            }
            int i4 = this.giftUv_;
            if (i4 != 0) {
                codedOutputStream.mo16970s0(7, i4);
            }
            int i5 = this.nextLevelGiftUv_;
            if (i5 != 0) {
                codedOutputStream.mo16970s0(8, i5);
            }
            if (this.showBgSvgaUrl_.isEmpty()) {
                return;
            }
            codedOutputStream.mo16939D0(9, getShowBgSvgaUrl());
        }

        public static VoiceKTVOrderRating parseDelimitedFrom(InputStream inputStream, C3410h c3410h) throws IOException {
            return (VoiceKTVOrderRating) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, c3410h);
        }

        public static VoiceKTVOrderRating parseFrom(ByteString byteString, C3410h c3410h) throws InvalidProtocolBufferException {
            return (VoiceKTVOrderRating) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, c3410h);
        }

        public static VoiceKTVOrderRating parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (VoiceKTVOrderRating) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static VoiceKTVOrderRating parseFrom(byte[] bArr, C3410h c3410h) throws InvalidProtocolBufferException {
            return (VoiceKTVOrderRating) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, c3410h);
        }

        public static VoiceKTVOrderRating parseFrom(InputStream inputStream) throws IOException {
            return (VoiceKTVOrderRating) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static VoiceKTVOrderRating parseFrom(InputStream inputStream, C3410h c3410h) throws IOException {
            return (VoiceKTVOrderRating) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, c3410h);
        }

        public static VoiceKTVOrderRating parseFrom(C3407e c3407e) throws IOException {
            return (VoiceKTVOrderRating) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, c3407e);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static VoiceKTVOrderRating parseFrom(C3407e c3407e, C3410h c3410h) throws IOException {
            return (VoiceKTVOrderRating) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, c3407e, c3410h);
        }
    }

    public static final class VoiceKTVPanelBg extends GeneratedMessageLite<VoiceKTVPanelBg, Builder> implements VoiceKTVPanelBgOrBuilder {
        private static final VoiceKTVPanelBg DEFAULT_INSTANCE;
        public static final int GAMEID_FIELD_NUMBER = 1;
        private static volatile i860<VoiceKTVPanelBg> PARSER = null;
        public static final int REMAINSECONDS_FIELD_NUMBER = 3;
        public static final int UPDATEDTIME_FIELD_NUMBER = 5;
        public static final int URL_FIELD_NUMBER = 2;
        public static final int USERID_FIELD_NUMBER = 4;
        private int remainSeconds_;
        private long updatedTime_;
        private String gameId_ = "";
        private String url_ = "";
        private String userId_ = "";

        public static final class Builder extends GeneratedMessageLite.AbstractC3380b<VoiceKTVPanelBg, Builder> implements VoiceKTVPanelBgOrBuilder {
            private Builder() {
                super(VoiceKTVPanelBg.DEFAULT_INSTANCE);
            }

            public Builder clearGameId() {
                copyOnWrite();
                ((VoiceKTVPanelBg) this.instance).clearGameId();
                return this;
            }

            public Builder clearRemainSeconds() {
                copyOnWrite();
                ((VoiceKTVPanelBg) this.instance).clearRemainSeconds();
                return this;
            }

            public Builder clearUpdatedTime() {
                copyOnWrite();
                ((VoiceKTVPanelBg) this.instance).clearUpdatedTime();
                return this;
            }

            public Builder clearUrl() {
                copyOnWrite();
                ((VoiceKTVPanelBg) this.instance).clearUrl();
                return this;
            }

            public Builder clearUserId() {
                copyOnWrite();
                ((VoiceKTVPanelBg) this.instance).clearUserId();
                return this;
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVoiceKtv.VoiceKTVPanelBgOrBuilder
            public String getGameId() {
                return ((VoiceKTVPanelBg) this.instance).getGameId();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVoiceKtv.VoiceKTVPanelBgOrBuilder
            public ByteString getGameIdBytes() {
                return ((VoiceKTVPanelBg) this.instance).getGameIdBytes();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVoiceKtv.VoiceKTVPanelBgOrBuilder
            public int getRemainSeconds() {
                return ((VoiceKTVPanelBg) this.instance).getRemainSeconds();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVoiceKtv.VoiceKTVPanelBgOrBuilder
            public long getUpdatedTime() {
                return ((VoiceKTVPanelBg) this.instance).getUpdatedTime();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVoiceKtv.VoiceKTVPanelBgOrBuilder
            public String getUrl() {
                return ((VoiceKTVPanelBg) this.instance).getUrl();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVoiceKtv.VoiceKTVPanelBgOrBuilder
            public ByteString getUrlBytes() {
                return ((VoiceKTVPanelBg) this.instance).getUrlBytes();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVoiceKtv.VoiceKTVPanelBgOrBuilder
            public String getUserId() {
                return ((VoiceKTVPanelBg) this.instance).getUserId();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVoiceKtv.VoiceKTVPanelBgOrBuilder
            public ByteString getUserIdBytes() {
                return ((VoiceKTVPanelBg) this.instance).getUserIdBytes();
            }

            public Builder setGameId(String str) {
                copyOnWrite();
                ((VoiceKTVPanelBg) this.instance).setGameId(str);
                return this;
            }

            public Builder setGameIdBytes(ByteString byteString) {
                copyOnWrite();
                ((VoiceKTVPanelBg) this.instance).setGameIdBytes(byteString);
                return this;
            }

            public Builder setRemainSeconds(int i) {
                copyOnWrite();
                ((VoiceKTVPanelBg) this.instance).setRemainSeconds(i);
                return this;
            }

            public Builder setUpdatedTime(long j) {
                copyOnWrite();
                ((VoiceKTVPanelBg) this.instance).setUpdatedTime(j);
                return this;
            }

            public Builder setUrl(String str) {
                copyOnWrite();
                ((VoiceKTVPanelBg) this.instance).setUrl(str);
                return this;
            }

            public Builder setUrlBytes(ByteString byteString) {
                copyOnWrite();
                ((VoiceKTVPanelBg) this.instance).setUrlBytes(byteString);
                return this;
            }

            public Builder setUserId(String str) {
                copyOnWrite();
                ((VoiceKTVPanelBg) this.instance).setUserId(str);
                return this;
            }

            public Builder setUserIdBytes(ByteString byteString) {
                copyOnWrite();
                ((VoiceKTVPanelBg) this.instance).setUserIdBytes(byteString);
                return this;
            }
        }

        static {
            VoiceKTVPanelBg voiceKTVPanelBg = new VoiceKTVPanelBg();
            DEFAULT_INSTANCE = voiceKTVPanelBg;
            voiceKTVPanelBg.makeImmutable();
        }

        private VoiceKTVPanelBg() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearGameId() {
            this.gameId_ = getDefaultInstance().getGameId();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearRemainSeconds() {
            this.remainSeconds_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearUpdatedTime() {
            this.updatedTime_ = 0L;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearUrl() {
            this.url_ = getDefaultInstance().getUrl();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearUserId() {
            this.userId_ = getDefaultInstance().getUserId();
        }

        public static VoiceKTVPanelBg getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder(VoiceKTVPanelBg voiceKTVPanelBg) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(voiceKTVPanelBg);
        }

        public static VoiceKTVPanelBg parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (VoiceKTVPanelBg) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static VoiceKTVPanelBg parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (VoiceKTVPanelBg) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static i860<VoiceKTVPanelBg> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setGameId(String str) {
            str.getClass();
            this.gameId_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setGameIdBytes(ByteString byteString) {
            byteString.getClass();
            AbstractC3403a.checkByteStringIsUtf8(byteString);
            this.gameId_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setRemainSeconds(int i) {
            this.remainSeconds_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setUpdatedTime(long j) {
            this.updatedTime_ = j;
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

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            boolean z = false;
            switch (C45231.f15982xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new VoiceKTVPanelBg();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                    return null;
                case 4:
                    return new Builder();
                case 5:
                    GeneratedMessageLite.InterfaceC3386h interfaceC3386h = (GeneratedMessageLite.InterfaceC3386h) obj;
                    VoiceKTVPanelBg voiceKTVPanelBg = (VoiceKTVPanelBg) obj2;
                    this.gameId_ = interfaceC3386h.mo16997f(!this.gameId_.isEmpty(), this.gameId_, !voiceKTVPanelBg.gameId_.isEmpty(), voiceKTVPanelBg.gameId_);
                    this.url_ = interfaceC3386h.mo16997f(!this.url_.isEmpty(), this.url_, !voiceKTVPanelBg.url_.isEmpty(), voiceKTVPanelBg.url_);
                    int i = this.remainSeconds_;
                    boolean z2 = i != 0;
                    int i2 = voiceKTVPanelBg.remainSeconds_;
                    this.remainSeconds_ = interfaceC3386h.mo16996e(z2, i, i2 != 0, i2);
                    this.userId_ = interfaceC3386h.mo16997f(!this.userId_.isEmpty(), this.userId_, !voiceKTVPanelBg.userId_.isEmpty(), voiceKTVPanelBg.userId_);
                    long j = this.updatedTime_;
                    boolean z3 = j != 0;
                    long j2 = voiceKTVPanelBg.updatedTime_;
                    this.updatedTime_ = interfaceC3386h.mo17000i(z3, j, j2 != 0, j2);
                    GeneratedMessageLite.C3385g c3385g = GeneratedMessageLite.C3385g.INSTANCE;
                    return this;
                case 6:
                    C3407e c3407e = (C3407e) obj;
                    while (!z) {
                        try {
                            int iM17116M = c3407e.m17116M();
                            if (iM17116M != 0) {
                                if (iM17116M == 10) {
                                    this.gameId_ = c3407e.m17115L();
                                } else if (iM17116M == 18) {
                                    this.url_ = c3407e.m17115L();
                                } else if (iM17116M == 24) {
                                    this.remainSeconds_ = c3407e.m17141u();
                                } else if (iM17116M == 34) {
                                    this.userId_ = c3407e.m17115L();
                                } else if (iM17116M == 40) {
                                    this.updatedTime_ = c3407e.m17142v();
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
                        synchronized (VoiceKTVPanelBg.class) {
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

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVoiceKtv.VoiceKTVPanelBgOrBuilder
        public String getGameId() {
            return this.gameId_;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVoiceKtv.VoiceKTVPanelBgOrBuilder
        public ByteString getGameIdBytes() {
            return ByteString.copyFromUtf8(this.gameId_);
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVoiceKtv.VoiceKTVPanelBgOrBuilder
        public int getRemainSeconds() {
            return this.remainSeconds_;
        }

        @Override // com.google.protobuf.InterfaceC3419q
        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int iM16901K = !this.gameId_.isEmpty() ? CodedOutputStream.m16901K(1, getGameId()) : 0;
            if (!this.url_.isEmpty()) {
                iM16901K += CodedOutputStream.m16901K(2, getUrl());
            }
            int i2 = this.remainSeconds_;
            if (i2 != 0) {
                iM16901K += CodedOutputStream.m16929t(3, i2);
            }
            if (!this.userId_.isEmpty()) {
                iM16901K += CodedOutputStream.m16901K(4, getUserId());
            }
            long j = this.updatedTime_;
            if (j != 0) {
                iM16901K += CodedOutputStream.m16931v(5, j);
            }
            this.memoizedSerializedSize = iM16901K;
            return iM16901K;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVoiceKtv.VoiceKTVPanelBgOrBuilder
        public long getUpdatedTime() {
            return this.updatedTime_;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVoiceKtv.VoiceKTVPanelBgOrBuilder
        public String getUrl() {
            return this.url_;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVoiceKtv.VoiceKTVPanelBgOrBuilder
        public ByteString getUrlBytes() {
            return ByteString.copyFromUtf8(this.url_);
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVoiceKtv.VoiceKTVPanelBgOrBuilder
        public String getUserId() {
            return this.userId_;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVoiceKtv.VoiceKTVPanelBgOrBuilder
        public ByteString getUserIdBytes() {
            return ByteString.copyFromUtf8(this.userId_);
        }

        @Override // com.google.protobuf.InterfaceC3419q
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (!this.gameId_.isEmpty()) {
                codedOutputStream.mo16939D0(1, getGameId());
            }
            if (!this.url_.isEmpty()) {
                codedOutputStream.mo16939D0(2, getUrl());
            }
            int i = this.remainSeconds_;
            if (i != 0) {
                codedOutputStream.mo16970s0(3, i);
            }
            if (!this.userId_.isEmpty()) {
                codedOutputStream.mo16939D0(4, getUserId());
            }
            long j = this.updatedTime_;
            if (j != 0) {
                codedOutputStream.m16972u0(5, j);
            }
        }

        public static VoiceKTVPanelBg parseDelimitedFrom(InputStream inputStream, C3410h c3410h) throws IOException {
            return (VoiceKTVPanelBg) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, c3410h);
        }

        public static VoiceKTVPanelBg parseFrom(ByteString byteString, C3410h c3410h) throws InvalidProtocolBufferException {
            return (VoiceKTVPanelBg) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, c3410h);
        }

        public static VoiceKTVPanelBg parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (VoiceKTVPanelBg) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static VoiceKTVPanelBg parseFrom(byte[] bArr, C3410h c3410h) throws InvalidProtocolBufferException {
            return (VoiceKTVPanelBg) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, c3410h);
        }

        public static VoiceKTVPanelBg parseFrom(InputStream inputStream) throws IOException {
            return (VoiceKTVPanelBg) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static VoiceKTVPanelBg parseFrom(InputStream inputStream, C3410h c3410h) throws IOException {
            return (VoiceKTVPanelBg) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, c3410h);
        }

        public static VoiceKTVPanelBg parseFrom(C3407e c3407e) throws IOException {
            return (VoiceKTVPanelBg) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, c3407e);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static VoiceKTVPanelBg parseFrom(C3407e c3407e, C3410h c3410h) throws IOException {
            return (VoiceKTVPanelBg) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, c3407e, c3410h);
        }
    }
}
