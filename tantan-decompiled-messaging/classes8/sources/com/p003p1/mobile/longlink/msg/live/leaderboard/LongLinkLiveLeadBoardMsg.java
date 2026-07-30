package com.p003p1.mobile.longlink.msg.live.leaderboard;

import com.google.protobuf.ByteString;
import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.a;
import com.google.protobuf.e;
import com.google.protobuf.h;
import com.google.protobuf.l;
import com.google.protobuf.q;
import java.io.IOException;
import java.io.InputStream;
import l.aag0;
import l.bz00;
import l.i860;
import l.o6z;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes8.dex */
public final class LongLinkLiveLeadBoardMsg {

    /* JADX INFO: renamed from: com.p1.mobile.longlink.msg.live.leaderboard.LongLinkLiveLeadBoardMsg$1 */
    public static /* synthetic */ class C03371 {

        /* JADX INFO: renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f1647xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f1647xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f1647xa1df5c61[GeneratedMessageLite.MethodToInvoke.IS_INITIALIZED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f1647xa1df5c61[GeneratedMessageLite.MethodToInvoke.MAKE_IMMUTABLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f1647xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f1647xa1df5c61[GeneratedMessageLite.MethodToInvoke.VISIT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f1647xa1df5c61[GeneratedMessageLite.MethodToInvoke.MERGE_FROM_STREAM.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f1647xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f1647xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    public interface LeaderboardEffectInfoOrBuilder extends o6z {
        String getContent();

        ByteString getContentBytes();

        /* synthetic */ q getDefaultInstanceForType();

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

        /* synthetic */ boolean isInitialized();
    }

    private LongLinkLiveLeadBoardMsg() {
    }

    public static void registerAllExtensions(h hVar) {
    }

    public static final class LeaderboardEffectInfo extends GeneratedMessageLite<LeaderboardEffectInfo, Builder> implements LeaderboardEffectInfoOrBuilder {
        public static final int CONTENT_FIELD_NUMBER = 5;
        private static final LeaderboardEffectInfo DEFAULT_INSTANCE;
        private static volatile i860<LeaderboardEffectInfo> PARSER = null;
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

        public static final class Builder extends GeneratedMessageLite.b<LeaderboardEffectInfo, Builder> implements LeaderboardEffectInfoOrBuilder {
            private Builder() {
                super(LeaderboardEffectInfo.DEFAULT_INSTANCE);
            }

            public Builder clearContent() {
                copyOnWrite();
                ((LeaderboardEffectInfo) ((GeneratedMessageLite.b) this).instance).clearContent();
                return this;
            }

            public Builder clearSvgUrl() {
                copyOnWrite();
                ((LeaderboardEffectInfo) ((GeneratedMessageLite.b) this).instance).clearSvgUrl();
                return this;
            }

            public Builder clearTitle() {
                copyOnWrite();
                ((LeaderboardEffectInfo) ((GeneratedMessageLite.b) this).instance).clearTitle();
                return this;
            }

            public Builder clearType() {
                copyOnWrite();
                ((LeaderboardEffectInfo) ((GeneratedMessageLite.b) this).instance).clearType();
                return this;
            }

            public Builder clearUserName() {
                copyOnWrite();
                ((LeaderboardEffectInfo) ((GeneratedMessageLite.b) this).instance).clearUserName();
                return this;
            }

            public Builder clearUserPic() {
                copyOnWrite();
                ((LeaderboardEffectInfo) ((GeneratedMessageLite.b) this).instance).clearUserPic();
                return this;
            }

            @Override // com.p1.mobile.longlink.msg.live.leaderboard.LongLinkLiveLeadBoardMsg.LeaderboardEffectInfoOrBuilder
            public String getContent() {
                return ((LeaderboardEffectInfo) ((GeneratedMessageLite.b) this).instance).getContent();
            }

            @Override // com.p1.mobile.longlink.msg.live.leaderboard.LongLinkLiveLeadBoardMsg.LeaderboardEffectInfoOrBuilder
            public ByteString getContentBytes() {
                return ((LeaderboardEffectInfo) ((GeneratedMessageLite.b) this).instance).getContentBytes();
            }

            @Override // com.p1.mobile.longlink.msg.live.leaderboard.LongLinkLiveLeadBoardMsg.LeaderboardEffectInfoOrBuilder
            public String getSvgUrl() {
                return ((LeaderboardEffectInfo) ((GeneratedMessageLite.b) this).instance).getSvgUrl();
            }

            @Override // com.p1.mobile.longlink.msg.live.leaderboard.LongLinkLiveLeadBoardMsg.LeaderboardEffectInfoOrBuilder
            public ByteString getSvgUrlBytes() {
                return ((LeaderboardEffectInfo) ((GeneratedMessageLite.b) this).instance).getSvgUrlBytes();
            }

            @Override // com.p1.mobile.longlink.msg.live.leaderboard.LongLinkLiveLeadBoardMsg.LeaderboardEffectInfoOrBuilder
            public String getTitle() {
                return ((LeaderboardEffectInfo) ((GeneratedMessageLite.b) this).instance).getTitle();
            }

            @Override // com.p1.mobile.longlink.msg.live.leaderboard.LongLinkLiveLeadBoardMsg.LeaderboardEffectInfoOrBuilder
            public ByteString getTitleBytes() {
                return ((LeaderboardEffectInfo) ((GeneratedMessageLite.b) this).instance).getTitleBytes();
            }

            @Override // com.p1.mobile.longlink.msg.live.leaderboard.LongLinkLiveLeadBoardMsg.LeaderboardEffectInfoOrBuilder
            public LeaderboardEffectType getType() {
                return ((LeaderboardEffectInfo) ((GeneratedMessageLite.b) this).instance).getType();
            }

            @Override // com.p1.mobile.longlink.msg.live.leaderboard.LongLinkLiveLeadBoardMsg.LeaderboardEffectInfoOrBuilder
            public int getTypeValue() {
                return ((LeaderboardEffectInfo) ((GeneratedMessageLite.b) this).instance).getTypeValue();
            }

            @Override // com.p1.mobile.longlink.msg.live.leaderboard.LongLinkLiveLeadBoardMsg.LeaderboardEffectInfoOrBuilder
            public String getUserName() {
                return ((LeaderboardEffectInfo) ((GeneratedMessageLite.b) this).instance).getUserName();
            }

            @Override // com.p1.mobile.longlink.msg.live.leaderboard.LongLinkLiveLeadBoardMsg.LeaderboardEffectInfoOrBuilder
            public ByteString getUserNameBytes() {
                return ((LeaderboardEffectInfo) ((GeneratedMessageLite.b) this).instance).getUserNameBytes();
            }

            @Override // com.p1.mobile.longlink.msg.live.leaderboard.LongLinkLiveLeadBoardMsg.LeaderboardEffectInfoOrBuilder
            public String getUserPic() {
                return ((LeaderboardEffectInfo) ((GeneratedMessageLite.b) this).instance).getUserPic();
            }

            @Override // com.p1.mobile.longlink.msg.live.leaderboard.LongLinkLiveLeadBoardMsg.LeaderboardEffectInfoOrBuilder
            public ByteString getUserPicBytes() {
                return ((LeaderboardEffectInfo) ((GeneratedMessageLite.b) this).instance).getUserPicBytes();
            }

            public Builder setContent(String str) {
                copyOnWrite();
                ((LeaderboardEffectInfo) ((GeneratedMessageLite.b) this).instance).setContent(str);
                return this;
            }

            public Builder setContentBytes(ByteString byteString) {
                copyOnWrite();
                ((LeaderboardEffectInfo) ((GeneratedMessageLite.b) this).instance).setContentBytes(byteString);
                return this;
            }

            public Builder setSvgUrl(String str) {
                copyOnWrite();
                ((LeaderboardEffectInfo) ((GeneratedMessageLite.b) this).instance).setSvgUrl(str);
                return this;
            }

            public Builder setSvgUrlBytes(ByteString byteString) {
                copyOnWrite();
                ((LeaderboardEffectInfo) ((GeneratedMessageLite.b) this).instance).setSvgUrlBytes(byteString);
                return this;
            }

            public Builder setTitle(String str) {
                copyOnWrite();
                ((LeaderboardEffectInfo) ((GeneratedMessageLite.b) this).instance).setTitle(str);
                return this;
            }

            public Builder setTitleBytes(ByteString byteString) {
                copyOnWrite();
                ((LeaderboardEffectInfo) ((GeneratedMessageLite.b) this).instance).setTitleBytes(byteString);
                return this;
            }

            public Builder setType(LeaderboardEffectType leaderboardEffectType) {
                copyOnWrite();
                ((LeaderboardEffectInfo) ((GeneratedMessageLite.b) this).instance).setType(leaderboardEffectType);
                return this;
            }

            public Builder setTypeValue(int i) {
                copyOnWrite();
                ((LeaderboardEffectInfo) ((GeneratedMessageLite.b) this).instance).setTypeValue(i);
                return this;
            }

            public Builder setUserName(String str) {
                copyOnWrite();
                ((LeaderboardEffectInfo) ((GeneratedMessageLite.b) this).instance).setUserName(str);
                return this;
            }

            public Builder setUserNameBytes(ByteString byteString) {
                copyOnWrite();
                ((LeaderboardEffectInfo) ((GeneratedMessageLite.b) this).instance).setUserNameBytes(byteString);
                return this;
            }

            public Builder setUserPic(String str) {
                copyOnWrite();
                ((LeaderboardEffectInfo) ((GeneratedMessageLite.b) this).instance).setUserPic(str);
                return this;
            }

            public Builder setUserPicBytes(ByteString byteString) {
                copyOnWrite();
                ((LeaderboardEffectInfo) ((GeneratedMessageLite.b) this).instance).setUserPicBytes(byteString);
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
            return (Builder) ((Builder) DEFAULT_INSTANCE.toBuilder()).mergeFrom(leaderboardEffectInfo);
        }

        public static LeaderboardEffectInfo parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (LeaderboardEffectInfo) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static LeaderboardEffectInfo parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (LeaderboardEffectInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static i860<LeaderboardEffectInfo> parser() {
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
            a.checkByteStringIsUtf8(byteString);
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
            a.checkByteStringIsUtf8(byteString);
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
            a.checkByteStringIsUtf8(byteString);
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
            a.checkByteStringIsUtf8(byteString);
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
            a.checkByteStringIsUtf8(byteString);
            this.userPic_ = byteString.toStringUtf8();
        }

        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            boolean z = false;
            switch (C03371.f1647xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new LeaderboardEffectInfo();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                    return null;
                case 4:
                    return new Builder();
                case 5:
                    GeneratedMessageLite.h hVar = (GeneratedMessageLite.h) obj;
                    LeaderboardEffectInfo leaderboardEffectInfo = (LeaderboardEffectInfo) obj2;
                    int i = this.type_;
                    boolean z2 = i != 0;
                    int i2 = leaderboardEffectInfo.type_;
                    this.type_ = hVar.e(z2, i, i2 != 0, i2);
                    this.userName_ = hVar.f(!this.userName_.isEmpty(), this.userName_, !leaderboardEffectInfo.userName_.isEmpty(), leaderboardEffectInfo.userName_);
                    this.userPic_ = hVar.f(!this.userPic_.isEmpty(), this.userPic_, !leaderboardEffectInfo.userPic_.isEmpty(), leaderboardEffectInfo.userPic_);
                    this.title_ = hVar.f(!this.title_.isEmpty(), this.title_, !leaderboardEffectInfo.title_.isEmpty(), leaderboardEffectInfo.title_);
                    this.content_ = hVar.f(!this.content_.isEmpty(), this.content_, !leaderboardEffectInfo.content_.isEmpty(), leaderboardEffectInfo.content_);
                    this.svgUrl_ = hVar.f(!this.svgUrl_.isEmpty(), this.svgUrl_, !leaderboardEffectInfo.svgUrl_.isEmpty(), leaderboardEffectInfo.svgUrl_);
                    GeneratedMessageLite.g gVar = GeneratedMessageLite.g.INSTANCE;
                    return this;
                case 6:
                    e eVar = (e) obj;
                    while (!z) {
                        try {
                            int iM = eVar.M();
                            if (iM != 0) {
                                if (iM == 8) {
                                    this.type_ = eVar.p();
                                } else if (iM == 18) {
                                    this.userName_ = eVar.L();
                                } else if (iM == 26) {
                                    this.userPic_ = eVar.L();
                                } else if (iM == 34) {
                                    this.title_ = eVar.L();
                                } else if (iM == 42) {
                                    this.content_ = eVar.L();
                                } else if (iM == 50) {
                                    this.svgUrl_ = eVar.L();
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
                        synchronized (LeaderboardEffectInfo.class) {
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

        @Override // com.p1.mobile.longlink.msg.live.leaderboard.LongLinkLiveLeadBoardMsg.LeaderboardEffectInfoOrBuilder
        public String getContent() {
            return this.content_;
        }

        @Override // com.p1.mobile.longlink.msg.live.leaderboard.LongLinkLiveLeadBoardMsg.LeaderboardEffectInfoOrBuilder
        public ByteString getContentBytes() {
            return ByteString.copyFromUtf8(this.content_);
        }

        public int getSerializedSize() {
            int i = ((GeneratedMessageLite) this).memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int iM = this.type_ != LeaderboardEffectType.week.getNumber() ? CodedOutputStream.m(1, this.type_) : 0;
            if (!this.userName_.isEmpty()) {
                iM += CodedOutputStream.K(2, getUserName());
            }
            if (!this.userPic_.isEmpty()) {
                iM += CodedOutputStream.K(3, getUserPic());
            }
            if (!this.title_.isEmpty()) {
                iM += CodedOutputStream.K(4, getTitle());
            }
            if (!this.content_.isEmpty()) {
                iM += CodedOutputStream.K(5, getContent());
            }
            if (!this.svgUrl_.isEmpty()) {
                iM += CodedOutputStream.K(6, getSvgUrl());
            }
            ((GeneratedMessageLite) this).memoizedSerializedSize = iM;
            return iM;
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

        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (this.type_ != LeaderboardEffectType.week.getNumber()) {
                codedOutputStream.i0(1, this.type_);
            }
            if (!this.userName_.isEmpty()) {
                codedOutputStream.D0(2, getUserName());
            }
            if (!this.userPic_.isEmpty()) {
                codedOutputStream.D0(3, getUserPic());
            }
            if (!this.title_.isEmpty()) {
                codedOutputStream.D0(4, getTitle());
            }
            if (!this.content_.isEmpty()) {
                codedOutputStream.D0(5, getContent());
            }
            if (this.svgUrl_.isEmpty()) {
                return;
            }
            codedOutputStream.D0(6, getSvgUrl());
        }

        public static LeaderboardEffectInfo parseDelimitedFrom(InputStream inputStream, h hVar) throws IOException {
            return (LeaderboardEffectInfo) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, hVar);
        }

        public static LeaderboardEffectInfo parseFrom(ByteString byteString, h hVar) throws InvalidProtocolBufferException {
            return (LeaderboardEffectInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, hVar);
        }

        public static LeaderboardEffectInfo parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (LeaderboardEffectInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static LeaderboardEffectInfo parseFrom(byte[] bArr, h hVar) throws InvalidProtocolBufferException {
            return (LeaderboardEffectInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, hVar);
        }

        public static LeaderboardEffectInfo parseFrom(InputStream inputStream) throws IOException {
            return (LeaderboardEffectInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static LeaderboardEffectInfo parseFrom(InputStream inputStream, h hVar) throws IOException {
            return (LeaderboardEffectInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, hVar);
        }

        public static LeaderboardEffectInfo parseFrom(e eVar) throws IOException {
            return (LeaderboardEffectInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, eVar);
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.toBuilder();
        }

        public static LeaderboardEffectInfo parseFrom(e eVar, h hVar) throws IOException {
            return (LeaderboardEffectInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, eVar, hVar);
        }
    }

    public enum LeaderboardEffectType implements l.c {
        week(0),
        second(1),
        love(2),
        UNRECOGNIZED(-1);

        private static final l.d<LeaderboardEffectType> internalValueMap = new l.d<LeaderboardEffectType>() { // from class: com.p1.mobile.longlink.msg.live.leaderboard.LongLinkLiveLeadBoardMsg.LeaderboardEffectType.1
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

        public static l.d<LeaderboardEffectType> internalGetValueMap() {
            return internalValueMap;
        }

        public final int getNumber() {
            return this.value;
        }

        @Deprecated
        public static LeaderboardEffectType valueOf(int i) {
            return forNumber(i);
        }
    }
}
