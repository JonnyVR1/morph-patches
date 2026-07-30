package com.p051p1.mobile.longlink.msg.live.leaderboard;

import com.google.protobuf.AbstractC3426a;
import com.google.protobuf.ByteString;
import com.google.protobuf.C3430e;
import com.google.protobuf.C3433h;
import com.google.protobuf.C3437l;
import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InterfaceC3442q;
import com.google.protobuf.InvalidProtocolBufferException;
import java.io.IOException;
import java.io.InputStream;
import p153l.iig0;
import p153l.l710;
import p153l.lfz;
import p153l.ng60;

/* JADX INFO: loaded from: classes8.dex */
public final class LongLinkLiveLeadBoardMsg {

    /* JADX INFO: renamed from: com.p1.mobile.longlink.msg.live.leaderboard.LongLinkLiveLeadBoardMsg$1 */
    public static /* synthetic */ class C45761 {

        /* JADX INFO: renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f16667xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f16667xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f16667xa1df5c61[GeneratedMessageLite.MethodToInvoke.IS_INITIALIZED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f16667xa1df5c61[GeneratedMessageLite.MethodToInvoke.MAKE_IMMUTABLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f16667xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f16667xa1df5c61[GeneratedMessageLite.MethodToInvoke.VISIT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f16667xa1df5c61[GeneratedMessageLite.MethodToInvoke.MERGE_FROM_STREAM.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f16667xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f16667xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    public interface LeaderboardEffectInfoOrBuilder extends lfz {
        String getContent();

        ByteString getContentBytes();

        @Override // p153l.lfz
        /* synthetic */ InterfaceC3442q getDefaultInstanceForType();

        String getSvgUrl();

        ByteString getSvgUrlBytes();

        String getTitle();

        ByteString getTitleBytes();

        LeaderboardEffectType getType();

        int getTypeValue();

        String getUserName();

        ByteString getUserNameBytes();

        String getUserPic();

        ByteString getUserPicBytes();

        @Override // p153l.lfz
        /* synthetic */ boolean isInitialized();
    }

    private LongLinkLiveLeadBoardMsg() {
    }

    public static void registerAllExtensions(C3433h c3433h) {
    }

    public static final class LeaderboardEffectInfo extends GeneratedMessageLite<LeaderboardEffectInfo, Builder> implements LeaderboardEffectInfoOrBuilder {
        public static final int CONTENT_FIELD_NUMBER = 5;
        private static final LeaderboardEffectInfo DEFAULT_INSTANCE;
        private static volatile ng60<LeaderboardEffectInfo> PARSER = null;
        public static final int SVGURL_FIELD_NUMBER = 6;
        public static final int TITLE_FIELD_NUMBER = 4;
        public static final int TYPE_FIELD_NUMBER = 1;
        public static final int USERNAME_FIELD_NUMBER = 2;
        public static final int USERPIC_FIELD_NUMBER = 3;
        private int type_;
        private String userName_ = "";
        private String userPic_ = "";
        private String title_ = "";
        private String content_ = "";
        private String svgUrl_ = "";

        public static final class Builder extends GeneratedMessageLite.AbstractC3403b<LeaderboardEffectInfo, Builder> implements LeaderboardEffectInfoOrBuilder {
            private Builder() {
                super(LeaderboardEffectInfo.DEFAULT_INSTANCE);
            }

            public Builder clearContent() {
                copyOnWrite();
                ((LeaderboardEffectInfo) this.instance).clearContent();
                return this;
            }

            public Builder clearSvgUrl() {
                copyOnWrite();
                ((LeaderboardEffectInfo) this.instance).clearSvgUrl();
                return this;
            }

            public Builder clearTitle() {
                copyOnWrite();
                ((LeaderboardEffectInfo) this.instance).clearTitle();
                return this;
            }

            public Builder clearType() {
                copyOnWrite();
                ((LeaderboardEffectInfo) this.instance).clearType();
                return this;
            }

            public Builder clearUserName() {
                copyOnWrite();
                ((LeaderboardEffectInfo) this.instance).clearUserName();
                return this;
            }

            public Builder clearUserPic() {
                copyOnWrite();
                ((LeaderboardEffectInfo) this.instance).clearUserPic();
                return this;
            }

            @Override // com.p1.mobile.longlink.msg.live.leaderboard.LongLinkLiveLeadBoardMsg.LeaderboardEffectInfoOrBuilder
            public String getContent() {
                return ((LeaderboardEffectInfo) this.instance).getContent();
            }

            @Override // com.p1.mobile.longlink.msg.live.leaderboard.LongLinkLiveLeadBoardMsg.LeaderboardEffectInfoOrBuilder
            public ByteString getContentBytes() {
                return ((LeaderboardEffectInfo) this.instance).getContentBytes();
            }

            @Override // com.p1.mobile.longlink.msg.live.leaderboard.LongLinkLiveLeadBoardMsg.LeaderboardEffectInfoOrBuilder
            public String getSvgUrl() {
                return ((LeaderboardEffectInfo) this.instance).getSvgUrl();
            }

            @Override // com.p1.mobile.longlink.msg.live.leaderboard.LongLinkLiveLeadBoardMsg.LeaderboardEffectInfoOrBuilder
            public ByteString getSvgUrlBytes() {
                return ((LeaderboardEffectInfo) this.instance).getSvgUrlBytes();
            }

            @Override // com.p1.mobile.longlink.msg.live.leaderboard.LongLinkLiveLeadBoardMsg.LeaderboardEffectInfoOrBuilder
            public String getTitle() {
                return ((LeaderboardEffectInfo) this.instance).getTitle();
            }

            @Override // com.p1.mobile.longlink.msg.live.leaderboard.LongLinkLiveLeadBoardMsg.LeaderboardEffectInfoOrBuilder
            public ByteString getTitleBytes() {
                return ((LeaderboardEffectInfo) this.instance).getTitleBytes();
            }

            @Override // com.p1.mobile.longlink.msg.live.leaderboard.LongLinkLiveLeadBoardMsg.LeaderboardEffectInfoOrBuilder
            public LeaderboardEffectType getType() {
                return ((LeaderboardEffectInfo) this.instance).getType();
            }

            @Override // com.p1.mobile.longlink.msg.live.leaderboard.LongLinkLiveLeadBoardMsg.LeaderboardEffectInfoOrBuilder
            public int getTypeValue() {
                return ((LeaderboardEffectInfo) this.instance).getTypeValue();
            }

            @Override // com.p1.mobile.longlink.msg.live.leaderboard.LongLinkLiveLeadBoardMsg.LeaderboardEffectInfoOrBuilder
            public String getUserName() {
                return ((LeaderboardEffectInfo) this.instance).getUserName();
            }

            @Override // com.p1.mobile.longlink.msg.live.leaderboard.LongLinkLiveLeadBoardMsg.LeaderboardEffectInfoOrBuilder
            public ByteString getUserNameBytes() {
                return ((LeaderboardEffectInfo) this.instance).getUserNameBytes();
            }

            @Override // com.p1.mobile.longlink.msg.live.leaderboard.LongLinkLiveLeadBoardMsg.LeaderboardEffectInfoOrBuilder
            public String getUserPic() {
                return ((LeaderboardEffectInfo) this.instance).getUserPic();
            }

            @Override // com.p1.mobile.longlink.msg.live.leaderboard.LongLinkLiveLeadBoardMsg.LeaderboardEffectInfoOrBuilder
            public ByteString getUserPicBytes() {
                return ((LeaderboardEffectInfo) this.instance).getUserPicBytes();
            }

            public Builder setContent(String str) {
                copyOnWrite();
                ((LeaderboardEffectInfo) this.instance).setContent(str);
                return this;
            }

            public Builder setContentBytes(ByteString byteString) {
                copyOnWrite();
                ((LeaderboardEffectInfo) this.instance).setContentBytes(byteString);
                return this;
            }

            public Builder setSvgUrl(String str) {
                copyOnWrite();
                ((LeaderboardEffectInfo) this.instance).setSvgUrl(str);
                return this;
            }

            public Builder setSvgUrlBytes(ByteString byteString) {
                copyOnWrite();
                ((LeaderboardEffectInfo) this.instance).setSvgUrlBytes(byteString);
                return this;
            }

            public Builder setTitle(String str) {
                copyOnWrite();
                ((LeaderboardEffectInfo) this.instance).setTitle(str);
                return this;
            }

            public Builder setTitleBytes(ByteString byteString) {
                copyOnWrite();
                ((LeaderboardEffectInfo) this.instance).setTitleBytes(byteString);
                return this;
            }

            public Builder setType(LeaderboardEffectType leaderboardEffectType) {
                copyOnWrite();
                ((LeaderboardEffectInfo) this.instance).setType(leaderboardEffectType);
                return this;
            }

            public Builder setTypeValue(int i) {
                copyOnWrite();
                ((LeaderboardEffectInfo) this.instance).setTypeValue(i);
                return this;
            }

            public Builder setUserName(String str) {
                copyOnWrite();
                ((LeaderboardEffectInfo) this.instance).setUserName(str);
                return this;
            }

            public Builder setUserNameBytes(ByteString byteString) {
                copyOnWrite();
                ((LeaderboardEffectInfo) this.instance).setUserNameBytes(byteString);
                return this;
            }

            public Builder setUserPic(String str) {
                copyOnWrite();
                ((LeaderboardEffectInfo) this.instance).setUserPic(str);
                return this;
            }

            public Builder setUserPicBytes(ByteString byteString) {
                copyOnWrite();
                ((LeaderboardEffectInfo) this.instance).setUserPicBytes(byteString);
                return this;
            }
        }

        static {
            LeaderboardEffectInfo leaderboardEffectInfo = new LeaderboardEffectInfo();
            DEFAULT_INSTANCE = leaderboardEffectInfo;
            leaderboardEffectInfo.makeImmutable();
        }

        private LeaderboardEffectInfo() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearContent() {
            this.content_ = getDefaultInstance().getContent();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearSvgUrl() {
            this.svgUrl_ = getDefaultInstance().getSvgUrl();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearTitle() {
            this.title_ = getDefaultInstance().getTitle();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearType() {
            this.type_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearUserName() {
            this.userName_ = getDefaultInstance().getUserName();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearUserPic() {
            this.userPic_ = getDefaultInstance().getUserPic();
        }

        public static LeaderboardEffectInfo getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder(LeaderboardEffectInfo leaderboardEffectInfo) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(leaderboardEffectInfo);
        }

        public static LeaderboardEffectInfo parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (LeaderboardEffectInfo) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static LeaderboardEffectInfo parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (LeaderboardEffectInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static ng60<LeaderboardEffectInfo> parser() {
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
            AbstractC3426a.checkByteStringIsUtf8(byteString);
            this.content_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSvgUrl(String str) {
            str.getClass();
            this.svgUrl_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSvgUrlBytes(ByteString byteString) {
            byteString.getClass();
            AbstractC3426a.checkByteStringIsUtf8(byteString);
            this.svgUrl_ = byteString.toStringUtf8();
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

        /* JADX INFO: Access modifiers changed from: private */
        public void setType(LeaderboardEffectType leaderboardEffectType) {
            leaderboardEffectType.getClass();
            this.type_ = leaderboardEffectType.getNumber();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTypeValue(int i) {
            this.type_ = i;
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

        /* JADX INFO: Access modifiers changed from: private */
        public void setUserPic(String str) {
            str.getClass();
            this.userPic_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setUserPicBytes(ByteString byteString) {
            byteString.getClass();
            AbstractC3426a.checkByteStringIsUtf8(byteString);
            this.userPic_ = byteString.toStringUtf8();
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            boolean z = false;
            switch (C45761.f16667xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new LeaderboardEffectInfo();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                    return null;
                case 4:
                    return new Builder();
                case 5:
                    GeneratedMessageLite.InterfaceC3409h interfaceC3409h = (GeneratedMessageLite.InterfaceC3409h) obj;
                    LeaderboardEffectInfo leaderboardEffectInfo = (LeaderboardEffectInfo) obj2;
                    int i = this.type_;
                    boolean z2 = i != 0;
                    int i2 = leaderboardEffectInfo.type_;
                    this.type_ = interfaceC3409h.mo17051e(z2, i, i2 != 0, i2);
                    this.userName_ = interfaceC3409h.mo17052f(!this.userName_.isEmpty(), this.userName_, !leaderboardEffectInfo.userName_.isEmpty(), leaderboardEffectInfo.userName_);
                    this.userPic_ = interfaceC3409h.mo17052f(!this.userPic_.isEmpty(), this.userPic_, !leaderboardEffectInfo.userPic_.isEmpty(), leaderboardEffectInfo.userPic_);
                    this.title_ = interfaceC3409h.mo17052f(!this.title_.isEmpty(), this.title_, !leaderboardEffectInfo.title_.isEmpty(), leaderboardEffectInfo.title_);
                    this.content_ = interfaceC3409h.mo17052f(!this.content_.isEmpty(), this.content_, !leaderboardEffectInfo.content_.isEmpty(), leaderboardEffectInfo.content_);
                    this.svgUrl_ = interfaceC3409h.mo17052f(!this.svgUrl_.isEmpty(), this.svgUrl_, !leaderboardEffectInfo.svgUrl_.isEmpty(), leaderboardEffectInfo.svgUrl_);
                    GeneratedMessageLite.C3408g c3408g = GeneratedMessageLite.C3408g.INSTANCE;
                    return this;
                case 6:
                    C3430e c3430e = (C3430e) obj;
                    while (!z) {
                        try {
                            int iM17171M = c3430e.m17171M();
                            if (iM17171M != 0) {
                                if (iM17171M == 8) {
                                    this.type_ = c3430e.m17191p();
                                } else if (iM17171M == 18) {
                                    this.userName_ = c3430e.m17170L();
                                } else if (iM17171M == 26) {
                                    this.userPic_ = c3430e.m17170L();
                                } else if (iM17171M == 34) {
                                    this.title_ = c3430e.m17170L();
                                } else if (iM17171M == 42) {
                                    this.content_ = c3430e.m17170L();
                                } else if (iM17171M == 50) {
                                    this.svgUrl_ = c3430e.m17170L();
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
                        synchronized (LeaderboardEffectInfo.class) {
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

        @Override // com.p1.mobile.longlink.msg.live.leaderboard.LongLinkLiveLeadBoardMsg.LeaderboardEffectInfoOrBuilder
        public String getContent() {
            return this.content_;
        }

        @Override // com.p1.mobile.longlink.msg.live.leaderboard.LongLinkLiveLeadBoardMsg.LeaderboardEffectInfoOrBuilder
        public ByteString getContentBytes() {
            return ByteString.copyFromUtf8(this.content_);
        }

        @Override // com.google.protobuf.InterfaceC3442q
        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int iM16977m = this.type_ != LeaderboardEffectType.week.getNumber() ? CodedOutputStream.m16977m(1, this.type_) : 0;
            if (!this.userName_.isEmpty()) {
                iM16977m += CodedOutputStream.m16956K(2, getUserName());
            }
            if (!this.userPic_.isEmpty()) {
                iM16977m += CodedOutputStream.m16956K(3, getUserPic());
            }
            if (!this.title_.isEmpty()) {
                iM16977m += CodedOutputStream.m16956K(4, getTitle());
            }
            if (!this.content_.isEmpty()) {
                iM16977m += CodedOutputStream.m16956K(5, getContent());
            }
            if (!this.svgUrl_.isEmpty()) {
                iM16977m += CodedOutputStream.m16956K(6, getSvgUrl());
            }
            this.memoizedSerializedSize = iM16977m;
            return iM16977m;
        }

        @Override // com.p1.mobile.longlink.msg.live.leaderboard.LongLinkLiveLeadBoardMsg.LeaderboardEffectInfoOrBuilder
        public String getSvgUrl() {
            return this.svgUrl_;
        }

        @Override // com.p1.mobile.longlink.msg.live.leaderboard.LongLinkLiveLeadBoardMsg.LeaderboardEffectInfoOrBuilder
        public ByteString getSvgUrlBytes() {
            return ByteString.copyFromUtf8(this.svgUrl_);
        }

        @Override // com.p1.mobile.longlink.msg.live.leaderboard.LongLinkLiveLeadBoardMsg.LeaderboardEffectInfoOrBuilder
        public String getTitle() {
            return this.title_;
        }

        @Override // com.p1.mobile.longlink.msg.live.leaderboard.LongLinkLiveLeadBoardMsg.LeaderboardEffectInfoOrBuilder
        public ByteString getTitleBytes() {
            return ByteString.copyFromUtf8(this.title_);
        }

        @Override // com.p1.mobile.longlink.msg.live.leaderboard.LongLinkLiveLeadBoardMsg.LeaderboardEffectInfoOrBuilder
        public LeaderboardEffectType getType() {
            LeaderboardEffectType leaderboardEffectTypeForNumber = LeaderboardEffectType.forNumber(this.type_);
            return leaderboardEffectTypeForNumber == null ? LeaderboardEffectType.UNRECOGNIZED : leaderboardEffectTypeForNumber;
        }

        @Override // com.p1.mobile.longlink.msg.live.leaderboard.LongLinkLiveLeadBoardMsg.LeaderboardEffectInfoOrBuilder
        public int getTypeValue() {
            return this.type_;
        }

        @Override // com.p1.mobile.longlink.msg.live.leaderboard.LongLinkLiveLeadBoardMsg.LeaderboardEffectInfoOrBuilder
        public String getUserName() {
            return this.userName_;
        }

        @Override // com.p1.mobile.longlink.msg.live.leaderboard.LongLinkLiveLeadBoardMsg.LeaderboardEffectInfoOrBuilder
        public ByteString getUserNameBytes() {
            return ByteString.copyFromUtf8(this.userName_);
        }

        @Override // com.p1.mobile.longlink.msg.live.leaderboard.LongLinkLiveLeadBoardMsg.LeaderboardEffectInfoOrBuilder
        public String getUserPic() {
            return this.userPic_;
        }

        @Override // com.p1.mobile.longlink.msg.live.leaderboard.LongLinkLiveLeadBoardMsg.LeaderboardEffectInfoOrBuilder
        public ByteString getUserPicBytes() {
            return ByteString.copyFromUtf8(this.userPic_);
        }

        @Override // com.google.protobuf.InterfaceC3442q
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (this.type_ != LeaderboardEffectType.week.getNumber()) {
                codedOutputStream.m17015i0(1, this.type_);
            }
            if (!this.userName_.isEmpty()) {
                codedOutputStream.mo16994D0(2, getUserName());
            }
            if (!this.userPic_.isEmpty()) {
                codedOutputStream.mo16994D0(3, getUserPic());
            }
            if (!this.title_.isEmpty()) {
                codedOutputStream.mo16994D0(4, getTitle());
            }
            if (!this.content_.isEmpty()) {
                codedOutputStream.mo16994D0(5, getContent());
            }
            if (this.svgUrl_.isEmpty()) {
                return;
            }
            codedOutputStream.mo16994D0(6, getSvgUrl());
        }

        public static LeaderboardEffectInfo parseDelimitedFrom(InputStream inputStream, C3433h c3433h) throws IOException {
            return (LeaderboardEffectInfo) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, c3433h);
        }

        public static LeaderboardEffectInfo parseFrom(ByteString byteString, C3433h c3433h) throws InvalidProtocolBufferException {
            return (LeaderboardEffectInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, c3433h);
        }

        public static LeaderboardEffectInfo parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (LeaderboardEffectInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static LeaderboardEffectInfo parseFrom(byte[] bArr, C3433h c3433h) throws InvalidProtocolBufferException {
            return (LeaderboardEffectInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, c3433h);
        }

        public static LeaderboardEffectInfo parseFrom(InputStream inputStream) throws IOException {
            return (LeaderboardEffectInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static LeaderboardEffectInfo parseFrom(InputStream inputStream, C3433h c3433h) throws IOException {
            return (LeaderboardEffectInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, c3433h);
        }

        public static LeaderboardEffectInfo parseFrom(C3430e c3430e) throws IOException {
            return (LeaderboardEffectInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, c3430e);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static LeaderboardEffectInfo parseFrom(C3430e c3430e, C3433h c3433h) throws IOException {
            return (LeaderboardEffectInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, c3430e, c3433h);
        }
    }

    public enum LeaderboardEffectType implements C3437l.c {
        week(0),
        second(1),
        love(2),
        UNRECOGNIZED(-1);

        private static final C3437l.d<LeaderboardEffectType> internalValueMap = new C3437l.d<LeaderboardEffectType>() { // from class: com.p1.mobile.longlink.msg.live.leaderboard.LongLinkLiveLeadBoardMsg.LeaderboardEffectType.1
            @Override // com.google.protobuf.C3437l.d
            public LeaderboardEffectType findValueByNumber(int i) {
                return LeaderboardEffectType.forNumber(i);
            }
        };
        public static final int love_VALUE = 2;
        public static final int second_VALUE = 1;
        public static final int week_VALUE = 0;
        private final int value;

        LeaderboardEffectType(int i) {
            this.value = i;
        }

        public static LeaderboardEffectType forNumber(int i) {
            if (i == 0) {
                return week;
            }
            if (i == 1) {
                return second;
            }
            if (i != 2) {
                return null;
            }
            return love;
        }

        public static C3437l.d<LeaderboardEffectType> internalGetValueMap() {
            return internalValueMap;
        }

        @Override // com.google.protobuf.C3437l.c
        public final int getNumber() {
            return this.value;
        }

        @Deprecated
        public static LeaderboardEffectType valueOf(int i) {
            return forNumber(i);
        }
    }
}
