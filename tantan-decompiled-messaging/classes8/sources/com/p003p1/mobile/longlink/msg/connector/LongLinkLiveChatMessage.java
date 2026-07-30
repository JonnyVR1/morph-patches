package com.p003p1.mobile.longlink.msg.connector;

import com.google.protobuf.ByteString;
import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.a;
import com.google.protobuf.e;
import com.google.protobuf.h;
import com.google.protobuf.q;
import com.momo.xeengine.gift.XEGiftErrorCode;
import java.io.IOException;
import java.io.InputStream;
import l.aag0;
import l.bz00;
import l.i860;
import l.o6z;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes8.dex */
public final class LongLinkLiveChatMessage {

    /* JADX INFO: renamed from: com.p1.mobile.longlink.msg.connector.LongLinkLiveChatMessage$1 */
    public static /* synthetic */ class C03131 {

        /* JADX INFO: renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f1632xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f1632xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f1632xa1df5c61[GeneratedMessageLite.MethodToInvoke.IS_INITIALIZED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f1632xa1df5c61[GeneratedMessageLite.MethodToInvoke.MAKE_IMMUTABLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f1632xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f1632xa1df5c61[GeneratedMessageLite.MethodToInvoke.VISIT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f1632xa1df5c61[GeneratedMessageLite.MethodToInvoke.MERGE_FROM_STREAM.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f1632xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f1632xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    public interface LiveChatPopupOrBuilder extends o6z {
        /* synthetic */ q getDefaultInstanceForType();

        String getOtherUserId();

        ByteString getOtherUserIdBytes();

        /* synthetic */ boolean isInitialized();
    }

    public interface LiveChatRecallOrBuilder extends o6z {
        String getAge();

        ByteString getAgeBytes();

        String getAuth();

        ByteString getAuthBytes();

        long getBirthday();

        String getBroadcastID();

        ByteString getBroadcastIDBytes();

        /* synthetic */ q getDefaultInstanceForType();

        String getGender();

        ByteString getGenderBytes();

        String getName();

        ByteString getNameBytes();

        String getOpeningRemark();

        ByteString getOpeningRemarkBytes();

        String getOtherUserId();

        ByteString getOtherUserIdBytes();

        String getPoolID();

        ByteString getPoolIDBytes();

        String getQueryToken();

        ByteString getQueryTokenBytes();

        String getSessionID();

        ByteString getSessionIDBytes();

        String getTag1();

        ByteString getTag1Bytes();

        String getTag2();

        ByteString getTag2Bytes();

        String getTag3();

        ByteString getTag3Bytes();

        String getTopic();

        ByteString getTopicBytes();

        String getUrl();

        ByteString getUrlBytes();

        /* synthetic */ boolean isInitialized();
    }

    private LongLinkLiveChatMessage() {
    }

    public static void registerAllExtensions(h hVar) {
    }

    public static final class LiveChatPopup extends GeneratedMessageLite<LiveChatPopup, Builder> implements LiveChatPopupOrBuilder {
        private static final LiveChatPopup DEFAULT_INSTANCE;
        public static final int OTHERUSERID_FIELD_NUMBER = 1;
        private static volatile i860<LiveChatPopup> PARSER;
        private String otherUserId_ = "";

        public static final class Builder extends GeneratedMessageLite.b<LiveChatPopup, Builder> implements LiveChatPopupOrBuilder {
            private Builder() {
                super(LiveChatPopup.DEFAULT_INSTANCE);
            }

            public Builder clearOtherUserId() {
                copyOnWrite();
                ((LiveChatPopup) ((GeneratedMessageLite.b) this).instance).clearOtherUserId();
                return this;
            }

            @Override // com.p1.mobile.longlink.msg.connector.LongLinkLiveChatMessage.LiveChatPopupOrBuilder
            public String getOtherUserId() {
                return ((LiveChatPopup) ((GeneratedMessageLite.b) this).instance).getOtherUserId();
            }

            @Override // com.p1.mobile.longlink.msg.connector.LongLinkLiveChatMessage.LiveChatPopupOrBuilder
            public ByteString getOtherUserIdBytes() {
                return ((LiveChatPopup) ((GeneratedMessageLite.b) this).instance).getOtherUserIdBytes();
            }

            public Builder setOtherUserId(String str) {
                copyOnWrite();
                ((LiveChatPopup) ((GeneratedMessageLite.b) this).instance).setOtherUserId(str);
                return this;
            }

            public Builder setOtherUserIdBytes(ByteString byteString) {
                copyOnWrite();
                ((LiveChatPopup) ((GeneratedMessageLite.b) this).instance).setOtherUserIdBytes(byteString);
                return this;
            }
        }

        static {
            LiveChatPopup liveChatPopup = new LiveChatPopup();
            DEFAULT_INSTANCE = liveChatPopup;
            liveChatPopup.makeImmutable();
        }

        private LiveChatPopup() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearOtherUserId() {
            this.otherUserId_ = getDefaultInstance().getOtherUserId();
        }

        public static LiveChatPopup getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder(LiveChatPopup liveChatPopup) {
            return (Builder) ((Builder) DEFAULT_INSTANCE.toBuilder()).mergeFrom(liveChatPopup);
        }

        public static LiveChatPopup parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (LiveChatPopup) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static LiveChatPopup parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (LiveChatPopup) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static i860<LiveChatPopup> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setOtherUserId(String str) {
            str.getClass();
            this.otherUserId_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setOtherUserIdBytes(ByteString byteString) {
            byteString.getClass();
            a.checkByteStringIsUtf8(byteString);
            this.otherUserId_ = byteString.toStringUtf8();
        }

        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (C03131.f1632xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new LiveChatPopup();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                    return null;
                case 4:
                    return new Builder();
                case 5:
                    LiveChatPopup liveChatPopup = (LiveChatPopup) obj2;
                    this.otherUserId_ = ((GeneratedMessageLite.h) obj).f(!this.otherUserId_.isEmpty(), this.otherUserId_, true ^ liveChatPopup.otherUserId_.isEmpty(), liveChatPopup.otherUserId_);
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
                                    this.otherUserId_ = eVar.L();
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
                        synchronized (LiveChatPopup.class) {
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

        @Override // com.p1.mobile.longlink.msg.connector.LongLinkLiveChatMessage.LiveChatPopupOrBuilder
        public String getOtherUserId() {
            return this.otherUserId_;
        }

        @Override // com.p1.mobile.longlink.msg.connector.LongLinkLiveChatMessage.LiveChatPopupOrBuilder
        public ByteString getOtherUserIdBytes() {
            return ByteString.copyFromUtf8(this.otherUserId_);
        }

        public int getSerializedSize() {
            int i = ((GeneratedMessageLite) this).memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int iK = !this.otherUserId_.isEmpty() ? CodedOutputStream.K(1, getOtherUserId()) : 0;
            ((GeneratedMessageLite) this).memoizedSerializedSize = iK;
            return iK;
        }

        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (this.otherUserId_.isEmpty()) {
                return;
            }
            codedOutputStream.D0(1, getOtherUserId());
        }

        public static LiveChatPopup parseDelimitedFrom(InputStream inputStream, h hVar) throws IOException {
            return (LiveChatPopup) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, hVar);
        }

        public static LiveChatPopup parseFrom(ByteString byteString, h hVar) throws InvalidProtocolBufferException {
            return (LiveChatPopup) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, hVar);
        }

        public static LiveChatPopup parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (LiveChatPopup) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static LiveChatPopup parseFrom(byte[] bArr, h hVar) throws InvalidProtocolBufferException {
            return (LiveChatPopup) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, hVar);
        }

        public static LiveChatPopup parseFrom(InputStream inputStream) throws IOException {
            return (LiveChatPopup) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static LiveChatPopup parseFrom(InputStream inputStream, h hVar) throws IOException {
            return (LiveChatPopup) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, hVar);
        }

        public static LiveChatPopup parseFrom(e eVar) throws IOException {
            return (LiveChatPopup) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, eVar);
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.toBuilder();
        }

        public static LiveChatPopup parseFrom(e eVar, h hVar) throws IOException {
            return (LiveChatPopup) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, eVar, hVar);
        }
    }

    public static final class LiveChatRecall extends GeneratedMessageLite<LiveChatRecall, Builder> implements LiveChatRecallOrBuilder {
        public static final int AGE_FIELD_NUMBER = 6;
        public static final int AUTH_FIELD_NUMBER = 2;
        public static final int BIRTHDAY_FIELD_NUMBER = 15;
        public static final int BROADCASTID_FIELD_NUMBER = 16;
        private static final LiveChatRecall DEFAULT_INSTANCE;
        public static final int GENDER_FIELD_NUMBER = 4;
        public static final int NAME_FIELD_NUMBER = 5;
        public static final int OPENINGREMARK_FIELD_NUMBER = 13;
        public static final int OTHERUSERID_FIELD_NUMBER = 1;
        private static volatile i860<LiveChatRecall> PARSER = null;
        public static final int POOLID_FIELD_NUMBER = 14;
        public static final int QUERYTOKEN_FIELD_NUMBER = 10;
        public static final int SESSIONID_FIELD_NUMBER = 12;
        public static final int TAG1_FIELD_NUMBER = 7;
        public static final int TAG2_FIELD_NUMBER = 8;
        public static final int TAG3_FIELD_NUMBER = 9;
        public static final int TOPIC_FIELD_NUMBER = 11;
        public static final int URL_FIELD_NUMBER = 3;
        private long birthday_;
        private String otherUserId_ = "";
        private String auth_ = "";
        private String url_ = "";
        private String gender_ = "";
        private String name_ = "";
        private String age_ = "";
        private String tag1_ = "";
        private String tag2_ = "";
        private String tag3_ = "";
        private String queryToken_ = "";
        private String topic_ = "";
        private String sessionID_ = "";
        private String openingRemark_ = "";
        private String poolID_ = "";
        private String broadcastID_ = "";

        public static final class Builder extends GeneratedMessageLite.b<LiveChatRecall, Builder> implements LiveChatRecallOrBuilder {
            private Builder() {
                super(LiveChatRecall.DEFAULT_INSTANCE);
            }

            public Builder clearAge() {
                copyOnWrite();
                ((LiveChatRecall) ((GeneratedMessageLite.b) this).instance).clearAge();
                return this;
            }

            public Builder clearAuth() {
                copyOnWrite();
                ((LiveChatRecall) ((GeneratedMessageLite.b) this).instance).clearAuth();
                return this;
            }

            public Builder clearBirthday() {
                copyOnWrite();
                ((LiveChatRecall) ((GeneratedMessageLite.b) this).instance).clearBirthday();
                return this;
            }

            public Builder clearBroadcastID() {
                copyOnWrite();
                ((LiveChatRecall) ((GeneratedMessageLite.b) this).instance).clearBroadcastID();
                return this;
            }

            public Builder clearGender() {
                copyOnWrite();
                ((LiveChatRecall) ((GeneratedMessageLite.b) this).instance).clearGender();
                return this;
            }

            public Builder clearName() {
                copyOnWrite();
                ((LiveChatRecall) ((GeneratedMessageLite.b) this).instance).clearName();
                return this;
            }

            public Builder clearOpeningRemark() {
                copyOnWrite();
                ((LiveChatRecall) ((GeneratedMessageLite.b) this).instance).clearOpeningRemark();
                return this;
            }

            public Builder clearOtherUserId() {
                copyOnWrite();
                ((LiveChatRecall) ((GeneratedMessageLite.b) this).instance).clearOtherUserId();
                return this;
            }

            public Builder clearPoolID() {
                copyOnWrite();
                ((LiveChatRecall) ((GeneratedMessageLite.b) this).instance).clearPoolID();
                return this;
            }

            public Builder clearQueryToken() {
                copyOnWrite();
                ((LiveChatRecall) ((GeneratedMessageLite.b) this).instance).clearQueryToken();
                return this;
            }

            public Builder clearSessionID() {
                copyOnWrite();
                ((LiveChatRecall) ((GeneratedMessageLite.b) this).instance).clearSessionID();
                return this;
            }

            public Builder clearTag1() {
                copyOnWrite();
                ((LiveChatRecall) ((GeneratedMessageLite.b) this).instance).clearTag1();
                return this;
            }

            public Builder clearTag2() {
                copyOnWrite();
                ((LiveChatRecall) ((GeneratedMessageLite.b) this).instance).clearTag2();
                return this;
            }

            public Builder clearTag3() {
                copyOnWrite();
                ((LiveChatRecall) ((GeneratedMessageLite.b) this).instance).clearTag3();
                return this;
            }

            public Builder clearTopic() {
                copyOnWrite();
                ((LiveChatRecall) ((GeneratedMessageLite.b) this).instance).clearTopic();
                return this;
            }

            public Builder clearUrl() {
                copyOnWrite();
                ((LiveChatRecall) ((GeneratedMessageLite.b) this).instance).clearUrl();
                return this;
            }

            @Override // com.p1.mobile.longlink.msg.connector.LongLinkLiveChatMessage.LiveChatRecallOrBuilder
            public String getAge() {
                return ((LiveChatRecall) ((GeneratedMessageLite.b) this).instance).getAge();
            }

            @Override // com.p1.mobile.longlink.msg.connector.LongLinkLiveChatMessage.LiveChatRecallOrBuilder
            public ByteString getAgeBytes() {
                return ((LiveChatRecall) ((GeneratedMessageLite.b) this).instance).getAgeBytes();
            }

            @Override // com.p1.mobile.longlink.msg.connector.LongLinkLiveChatMessage.LiveChatRecallOrBuilder
            public String getAuth() {
                return ((LiveChatRecall) ((GeneratedMessageLite.b) this).instance).getAuth();
            }

            @Override // com.p1.mobile.longlink.msg.connector.LongLinkLiveChatMessage.LiveChatRecallOrBuilder
            public ByteString getAuthBytes() {
                return ((LiveChatRecall) ((GeneratedMessageLite.b) this).instance).getAuthBytes();
            }

            @Override // com.p1.mobile.longlink.msg.connector.LongLinkLiveChatMessage.LiveChatRecallOrBuilder
            public long getBirthday() {
                return ((LiveChatRecall) ((GeneratedMessageLite.b) this).instance).getBirthday();
            }

            @Override // com.p1.mobile.longlink.msg.connector.LongLinkLiveChatMessage.LiveChatRecallOrBuilder
            public String getBroadcastID() {
                return ((LiveChatRecall) ((GeneratedMessageLite.b) this).instance).getBroadcastID();
            }

            @Override // com.p1.mobile.longlink.msg.connector.LongLinkLiveChatMessage.LiveChatRecallOrBuilder
            public ByteString getBroadcastIDBytes() {
                return ((LiveChatRecall) ((GeneratedMessageLite.b) this).instance).getBroadcastIDBytes();
            }

            @Override // com.p1.mobile.longlink.msg.connector.LongLinkLiveChatMessage.LiveChatRecallOrBuilder
            public String getGender() {
                return ((LiveChatRecall) ((GeneratedMessageLite.b) this).instance).getGender();
            }

            @Override // com.p1.mobile.longlink.msg.connector.LongLinkLiveChatMessage.LiveChatRecallOrBuilder
            public ByteString getGenderBytes() {
                return ((LiveChatRecall) ((GeneratedMessageLite.b) this).instance).getGenderBytes();
            }

            @Override // com.p1.mobile.longlink.msg.connector.LongLinkLiveChatMessage.LiveChatRecallOrBuilder
            public String getName() {
                return ((LiveChatRecall) ((GeneratedMessageLite.b) this).instance).getName();
            }

            @Override // com.p1.mobile.longlink.msg.connector.LongLinkLiveChatMessage.LiveChatRecallOrBuilder
            public ByteString getNameBytes() {
                return ((LiveChatRecall) ((GeneratedMessageLite.b) this).instance).getNameBytes();
            }

            @Override // com.p1.mobile.longlink.msg.connector.LongLinkLiveChatMessage.LiveChatRecallOrBuilder
            public String getOpeningRemark() {
                return ((LiveChatRecall) ((GeneratedMessageLite.b) this).instance).getOpeningRemark();
            }

            @Override // com.p1.mobile.longlink.msg.connector.LongLinkLiveChatMessage.LiveChatRecallOrBuilder
            public ByteString getOpeningRemarkBytes() {
                return ((LiveChatRecall) ((GeneratedMessageLite.b) this).instance).getOpeningRemarkBytes();
            }

            @Override // com.p1.mobile.longlink.msg.connector.LongLinkLiveChatMessage.LiveChatRecallOrBuilder
            public String getOtherUserId() {
                return ((LiveChatRecall) ((GeneratedMessageLite.b) this).instance).getOtherUserId();
            }

            @Override // com.p1.mobile.longlink.msg.connector.LongLinkLiveChatMessage.LiveChatRecallOrBuilder
            public ByteString getOtherUserIdBytes() {
                return ((LiveChatRecall) ((GeneratedMessageLite.b) this).instance).getOtherUserIdBytes();
            }

            @Override // com.p1.mobile.longlink.msg.connector.LongLinkLiveChatMessage.LiveChatRecallOrBuilder
            public String getPoolID() {
                return ((LiveChatRecall) ((GeneratedMessageLite.b) this).instance).getPoolID();
            }

            @Override // com.p1.mobile.longlink.msg.connector.LongLinkLiveChatMessage.LiveChatRecallOrBuilder
            public ByteString getPoolIDBytes() {
                return ((LiveChatRecall) ((GeneratedMessageLite.b) this).instance).getPoolIDBytes();
            }

            @Override // com.p1.mobile.longlink.msg.connector.LongLinkLiveChatMessage.LiveChatRecallOrBuilder
            public String getQueryToken() {
                return ((LiveChatRecall) ((GeneratedMessageLite.b) this).instance).getQueryToken();
            }

            @Override // com.p1.mobile.longlink.msg.connector.LongLinkLiveChatMessage.LiveChatRecallOrBuilder
            public ByteString getQueryTokenBytes() {
                return ((LiveChatRecall) ((GeneratedMessageLite.b) this).instance).getQueryTokenBytes();
            }

            @Override // com.p1.mobile.longlink.msg.connector.LongLinkLiveChatMessage.LiveChatRecallOrBuilder
            public String getSessionID() {
                return ((LiveChatRecall) ((GeneratedMessageLite.b) this).instance).getSessionID();
            }

            @Override // com.p1.mobile.longlink.msg.connector.LongLinkLiveChatMessage.LiveChatRecallOrBuilder
            public ByteString getSessionIDBytes() {
                return ((LiveChatRecall) ((GeneratedMessageLite.b) this).instance).getSessionIDBytes();
            }

            @Override // com.p1.mobile.longlink.msg.connector.LongLinkLiveChatMessage.LiveChatRecallOrBuilder
            public String getTag1() {
                return ((LiveChatRecall) ((GeneratedMessageLite.b) this).instance).getTag1();
            }

            @Override // com.p1.mobile.longlink.msg.connector.LongLinkLiveChatMessage.LiveChatRecallOrBuilder
            public ByteString getTag1Bytes() {
                return ((LiveChatRecall) ((GeneratedMessageLite.b) this).instance).getTag1Bytes();
            }

            @Override // com.p1.mobile.longlink.msg.connector.LongLinkLiveChatMessage.LiveChatRecallOrBuilder
            public String getTag2() {
                return ((LiveChatRecall) ((GeneratedMessageLite.b) this).instance).getTag2();
            }

            @Override // com.p1.mobile.longlink.msg.connector.LongLinkLiveChatMessage.LiveChatRecallOrBuilder
            public ByteString getTag2Bytes() {
                return ((LiveChatRecall) ((GeneratedMessageLite.b) this).instance).getTag2Bytes();
            }

            @Override // com.p1.mobile.longlink.msg.connector.LongLinkLiveChatMessage.LiveChatRecallOrBuilder
            public String getTag3() {
                return ((LiveChatRecall) ((GeneratedMessageLite.b) this).instance).getTag3();
            }

            @Override // com.p1.mobile.longlink.msg.connector.LongLinkLiveChatMessage.LiveChatRecallOrBuilder
            public ByteString getTag3Bytes() {
                return ((LiveChatRecall) ((GeneratedMessageLite.b) this).instance).getTag3Bytes();
            }

            @Override // com.p1.mobile.longlink.msg.connector.LongLinkLiveChatMessage.LiveChatRecallOrBuilder
            public String getTopic() {
                return ((LiveChatRecall) ((GeneratedMessageLite.b) this).instance).getTopic();
            }

            @Override // com.p1.mobile.longlink.msg.connector.LongLinkLiveChatMessage.LiveChatRecallOrBuilder
            public ByteString getTopicBytes() {
                return ((LiveChatRecall) ((GeneratedMessageLite.b) this).instance).getTopicBytes();
            }

            @Override // com.p1.mobile.longlink.msg.connector.LongLinkLiveChatMessage.LiveChatRecallOrBuilder
            public String getUrl() {
                return ((LiveChatRecall) ((GeneratedMessageLite.b) this).instance).getUrl();
            }

            @Override // com.p1.mobile.longlink.msg.connector.LongLinkLiveChatMessage.LiveChatRecallOrBuilder
            public ByteString getUrlBytes() {
                return ((LiveChatRecall) ((GeneratedMessageLite.b) this).instance).getUrlBytes();
            }

            public Builder setAge(String str) {
                copyOnWrite();
                ((LiveChatRecall) ((GeneratedMessageLite.b) this).instance).setAge(str);
                return this;
            }

            public Builder setAgeBytes(ByteString byteString) {
                copyOnWrite();
                ((LiveChatRecall) ((GeneratedMessageLite.b) this).instance).setAgeBytes(byteString);
                return this;
            }

            public Builder setAuth(String str) {
                copyOnWrite();
                ((LiveChatRecall) ((GeneratedMessageLite.b) this).instance).setAuth(str);
                return this;
            }

            public Builder setAuthBytes(ByteString byteString) {
                copyOnWrite();
                ((LiveChatRecall) ((GeneratedMessageLite.b) this).instance).setAuthBytes(byteString);
                return this;
            }

            public Builder setBirthday(long j) {
                copyOnWrite();
                ((LiveChatRecall) ((GeneratedMessageLite.b) this).instance).setBirthday(j);
                return this;
            }

            public Builder setBroadcastID(String str) {
                copyOnWrite();
                ((LiveChatRecall) ((GeneratedMessageLite.b) this).instance).setBroadcastID(str);
                return this;
            }

            public Builder setBroadcastIDBytes(ByteString byteString) {
                copyOnWrite();
                ((LiveChatRecall) ((GeneratedMessageLite.b) this).instance).setBroadcastIDBytes(byteString);
                return this;
            }

            public Builder setGender(String str) {
                copyOnWrite();
                ((LiveChatRecall) ((GeneratedMessageLite.b) this).instance).setGender(str);
                return this;
            }

            public Builder setGenderBytes(ByteString byteString) {
                copyOnWrite();
                ((LiveChatRecall) ((GeneratedMessageLite.b) this).instance).setGenderBytes(byteString);
                return this;
            }

            public Builder setName(String str) {
                copyOnWrite();
                ((LiveChatRecall) ((GeneratedMessageLite.b) this).instance).setName(str);
                return this;
            }

            public Builder setNameBytes(ByteString byteString) {
                copyOnWrite();
                ((LiveChatRecall) ((GeneratedMessageLite.b) this).instance).setNameBytes(byteString);
                return this;
            }

            public Builder setOpeningRemark(String str) {
                copyOnWrite();
                ((LiveChatRecall) ((GeneratedMessageLite.b) this).instance).setOpeningRemark(str);
                return this;
            }

            public Builder setOpeningRemarkBytes(ByteString byteString) {
                copyOnWrite();
                ((LiveChatRecall) ((GeneratedMessageLite.b) this).instance).setOpeningRemarkBytes(byteString);
                return this;
            }

            public Builder setOtherUserId(String str) {
                copyOnWrite();
                ((LiveChatRecall) ((GeneratedMessageLite.b) this).instance).setOtherUserId(str);
                return this;
            }

            public Builder setOtherUserIdBytes(ByteString byteString) {
                copyOnWrite();
                ((LiveChatRecall) ((GeneratedMessageLite.b) this).instance).setOtherUserIdBytes(byteString);
                return this;
            }

            public Builder setPoolID(String str) {
                copyOnWrite();
                ((LiveChatRecall) ((GeneratedMessageLite.b) this).instance).setPoolID(str);
                return this;
            }

            public Builder setPoolIDBytes(ByteString byteString) {
                copyOnWrite();
                ((LiveChatRecall) ((GeneratedMessageLite.b) this).instance).setPoolIDBytes(byteString);
                return this;
            }

            public Builder setQueryToken(String str) {
                copyOnWrite();
                ((LiveChatRecall) ((GeneratedMessageLite.b) this).instance).setQueryToken(str);
                return this;
            }

            public Builder setQueryTokenBytes(ByteString byteString) {
                copyOnWrite();
                ((LiveChatRecall) ((GeneratedMessageLite.b) this).instance).setQueryTokenBytes(byteString);
                return this;
            }

            public Builder setSessionID(String str) {
                copyOnWrite();
                ((LiveChatRecall) ((GeneratedMessageLite.b) this).instance).setSessionID(str);
                return this;
            }

            public Builder setSessionIDBytes(ByteString byteString) {
                copyOnWrite();
                ((LiveChatRecall) ((GeneratedMessageLite.b) this).instance).setSessionIDBytes(byteString);
                return this;
            }

            public Builder setTag1(String str) {
                copyOnWrite();
                ((LiveChatRecall) ((GeneratedMessageLite.b) this).instance).setTag1(str);
                return this;
            }

            public Builder setTag1Bytes(ByteString byteString) {
                copyOnWrite();
                ((LiveChatRecall) ((GeneratedMessageLite.b) this).instance).setTag1Bytes(byteString);
                return this;
            }

            public Builder setTag2(String str) {
                copyOnWrite();
                ((LiveChatRecall) ((GeneratedMessageLite.b) this).instance).setTag2(str);
                return this;
            }

            public Builder setTag2Bytes(ByteString byteString) {
                copyOnWrite();
                ((LiveChatRecall) ((GeneratedMessageLite.b) this).instance).setTag2Bytes(byteString);
                return this;
            }

            public Builder setTag3(String str) {
                copyOnWrite();
                ((LiveChatRecall) ((GeneratedMessageLite.b) this).instance).setTag3(str);
                return this;
            }

            public Builder setTag3Bytes(ByteString byteString) {
                copyOnWrite();
                ((LiveChatRecall) ((GeneratedMessageLite.b) this).instance).setTag3Bytes(byteString);
                return this;
            }

            public Builder setTopic(String str) {
                copyOnWrite();
                ((LiveChatRecall) ((GeneratedMessageLite.b) this).instance).setTopic(str);
                return this;
            }

            public Builder setTopicBytes(ByteString byteString) {
                copyOnWrite();
                ((LiveChatRecall) ((GeneratedMessageLite.b) this).instance).setTopicBytes(byteString);
                return this;
            }

            public Builder setUrl(String str) {
                copyOnWrite();
                ((LiveChatRecall) ((GeneratedMessageLite.b) this).instance).setUrl(str);
                return this;
            }

            public Builder setUrlBytes(ByteString byteString) {
                copyOnWrite();
                ((LiveChatRecall) ((GeneratedMessageLite.b) this).instance).setUrlBytes(byteString);
                return this;
            }
        }

        static {
            LiveChatRecall liveChatRecall = new LiveChatRecall();
            DEFAULT_INSTANCE = liveChatRecall;
            liveChatRecall.makeImmutable();
        }

        private LiveChatRecall() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAge() {
            this.age_ = getDefaultInstance().getAge();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAuth() {
            this.auth_ = getDefaultInstance().getAuth();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearBirthday() {
            this.birthday_ = 0L;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearBroadcastID() {
            this.broadcastID_ = getDefaultInstance().getBroadcastID();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearGender() {
            this.gender_ = getDefaultInstance().getGender();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearName() {
            this.name_ = getDefaultInstance().getName();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearOpeningRemark() {
            this.openingRemark_ = getDefaultInstance().getOpeningRemark();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearOtherUserId() {
            this.otherUserId_ = getDefaultInstance().getOtherUserId();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearPoolID() {
            this.poolID_ = getDefaultInstance().getPoolID();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearQueryToken() {
            this.queryToken_ = getDefaultInstance().getQueryToken();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearSessionID() {
            this.sessionID_ = getDefaultInstance().getSessionID();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearTag1() {
            this.tag1_ = getDefaultInstance().getTag1();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearTag2() {
            this.tag2_ = getDefaultInstance().getTag2();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearTag3() {
            this.tag3_ = getDefaultInstance().getTag3();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearTopic() {
            this.topic_ = getDefaultInstance().getTopic();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearUrl() {
            this.url_ = getDefaultInstance().getUrl();
        }

        public static LiveChatRecall getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder(LiveChatRecall liveChatRecall) {
            return (Builder) ((Builder) DEFAULT_INSTANCE.toBuilder()).mergeFrom(liveChatRecall);
        }

        public static LiveChatRecall parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (LiveChatRecall) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static LiveChatRecall parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (LiveChatRecall) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static i860<LiveChatRecall> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAge(String str) {
            str.getClass();
            this.age_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAgeBytes(ByteString byteString) {
            byteString.getClass();
            a.checkByteStringIsUtf8(byteString);
            this.age_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAuth(String str) {
            str.getClass();
            this.auth_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAuthBytes(ByteString byteString) {
            byteString.getClass();
            a.checkByteStringIsUtf8(byteString);
            this.auth_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setBirthday(long j) {
            this.birthday_ = j;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setBroadcastID(String str) {
            str.getClass();
            this.broadcastID_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setBroadcastIDBytes(ByteString byteString) {
            byteString.getClass();
            a.checkByteStringIsUtf8(byteString);
            this.broadcastID_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setGender(String str) {
            str.getClass();
            this.gender_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setGenderBytes(ByteString byteString) {
            byteString.getClass();
            a.checkByteStringIsUtf8(byteString);
            this.gender_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setName(String str) {
            str.getClass();
            this.name_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setNameBytes(ByteString byteString) {
            byteString.getClass();
            a.checkByteStringIsUtf8(byteString);
            this.name_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setOpeningRemark(String str) {
            str.getClass();
            this.openingRemark_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setOpeningRemarkBytes(ByteString byteString) {
            byteString.getClass();
            a.checkByteStringIsUtf8(byteString);
            this.openingRemark_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setOtherUserId(String str) {
            str.getClass();
            this.otherUserId_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setOtherUserIdBytes(ByteString byteString) {
            byteString.getClass();
            a.checkByteStringIsUtf8(byteString);
            this.otherUserId_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setPoolID(String str) {
            str.getClass();
            this.poolID_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setPoolIDBytes(ByteString byteString) {
            byteString.getClass();
            a.checkByteStringIsUtf8(byteString);
            this.poolID_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setQueryToken(String str) {
            str.getClass();
            this.queryToken_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setQueryTokenBytes(ByteString byteString) {
            byteString.getClass();
            a.checkByteStringIsUtf8(byteString);
            this.queryToken_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSessionID(String str) {
            str.getClass();
            this.sessionID_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSessionIDBytes(ByteString byteString) {
            byteString.getClass();
            a.checkByteStringIsUtf8(byteString);
            this.sessionID_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTag1(String str) {
            str.getClass();
            this.tag1_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTag1Bytes(ByteString byteString) {
            byteString.getClass();
            a.checkByteStringIsUtf8(byteString);
            this.tag1_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTag2(String str) {
            str.getClass();
            this.tag2_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTag2Bytes(ByteString byteString) {
            byteString.getClass();
            a.checkByteStringIsUtf8(byteString);
            this.tag2_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTag3(String str) {
            str.getClass();
            this.tag3_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTag3Bytes(ByteString byteString) {
            byteString.getClass();
            a.checkByteStringIsUtf8(byteString);
            this.tag3_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTopic(String str) {
            str.getClass();
            this.topic_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTopicBytes(ByteString byteString) {
            byteString.getClass();
            a.checkByteStringIsUtf8(byteString);
            this.topic_ = byteString.toStringUtf8();
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
            boolean z = false;
            switch (C03131.f1632xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new LiveChatRecall();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                    return null;
                case 4:
                    return new Builder();
                case 5:
                    GeneratedMessageLite.h hVar = (GeneratedMessageLite.h) obj;
                    LiveChatRecall liveChatRecall = (LiveChatRecall) obj2;
                    this.otherUserId_ = hVar.f(!this.otherUserId_.isEmpty(), this.otherUserId_, !liveChatRecall.otherUserId_.isEmpty(), liveChatRecall.otherUserId_);
                    this.auth_ = hVar.f(!this.auth_.isEmpty(), this.auth_, !liveChatRecall.auth_.isEmpty(), liveChatRecall.auth_);
                    this.url_ = hVar.f(!this.url_.isEmpty(), this.url_, !liveChatRecall.url_.isEmpty(), liveChatRecall.url_);
                    this.gender_ = hVar.f(!this.gender_.isEmpty(), this.gender_, !liveChatRecall.gender_.isEmpty(), liveChatRecall.gender_);
                    this.name_ = hVar.f(!this.name_.isEmpty(), this.name_, !liveChatRecall.name_.isEmpty(), liveChatRecall.name_);
                    this.age_ = hVar.f(!this.age_.isEmpty(), this.age_, !liveChatRecall.age_.isEmpty(), liveChatRecall.age_);
                    this.tag1_ = hVar.f(!this.tag1_.isEmpty(), this.tag1_, !liveChatRecall.tag1_.isEmpty(), liveChatRecall.tag1_);
                    this.tag2_ = hVar.f(!this.tag2_.isEmpty(), this.tag2_, !liveChatRecall.tag2_.isEmpty(), liveChatRecall.tag2_);
                    this.tag3_ = hVar.f(!this.tag3_.isEmpty(), this.tag3_, !liveChatRecall.tag3_.isEmpty(), liveChatRecall.tag3_);
                    this.queryToken_ = hVar.f(!this.queryToken_.isEmpty(), this.queryToken_, !liveChatRecall.queryToken_.isEmpty(), liveChatRecall.queryToken_);
                    this.topic_ = hVar.f(!this.topic_.isEmpty(), this.topic_, !liveChatRecall.topic_.isEmpty(), liveChatRecall.topic_);
                    this.sessionID_ = hVar.f(!this.sessionID_.isEmpty(), this.sessionID_, !liveChatRecall.sessionID_.isEmpty(), liveChatRecall.sessionID_);
                    this.openingRemark_ = hVar.f(!this.openingRemark_.isEmpty(), this.openingRemark_, !liveChatRecall.openingRemark_.isEmpty(), liveChatRecall.openingRemark_);
                    this.poolID_ = hVar.f(!this.poolID_.isEmpty(), this.poolID_, !liveChatRecall.poolID_.isEmpty(), liveChatRecall.poolID_);
                    long j = this.birthday_;
                    boolean z2 = j != 0;
                    long j2 = liveChatRecall.birthday_;
                    this.birthday_ = hVar.i(z2, j, j2 != 0, j2);
                    this.broadcastID_ = hVar.f(!this.broadcastID_.isEmpty(), this.broadcastID_, !liveChatRecall.broadcastID_.isEmpty(), liveChatRecall.broadcastID_);
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
                                    this.otherUserId_ = eVar.L();
                                    continue;
                                case 18:
                                    this.auth_ = eVar.L();
                                    continue;
                                case 26:
                                    this.url_ = eVar.L();
                                    continue;
                                case 34:
                                    this.gender_ = eVar.L();
                                    continue;
                                case 42:
                                    this.name_ = eVar.L();
                                    continue;
                                case 50:
                                    this.age_ = eVar.L();
                                    continue;
                                case 58:
                                    this.tag1_ = eVar.L();
                                    continue;
                                case 66:
                                    this.tag2_ = eVar.L();
                                    continue;
                                case 74:
                                    this.tag3_ = eVar.L();
                                    continue;
                                case 82:
                                    this.queryToken_ = eVar.L();
                                    continue;
                                case 90:
                                    this.topic_ = eVar.L();
                                    continue;
                                case 98:
                                    this.sessionID_ = eVar.L();
                                    continue;
                                case 106:
                                    this.openingRemark_ = eVar.L();
                                    continue;
                                case XEGiftErrorCode.ERROR_CODE_VIDEO_TIMEOUT /* 114 */:
                                    this.poolID_ = eVar.L();
                                    continue;
                                case 120:
                                    this.birthday_ = eVar.v();
                                    continue;
                                case 130:
                                    this.broadcastID_ = eVar.L();
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
                        synchronized (LiveChatRecall.class) {
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

        @Override // com.p1.mobile.longlink.msg.connector.LongLinkLiveChatMessage.LiveChatRecallOrBuilder
        public String getAge() {
            return this.age_;
        }

        @Override // com.p1.mobile.longlink.msg.connector.LongLinkLiveChatMessage.LiveChatRecallOrBuilder
        public ByteString getAgeBytes() {
            return ByteString.copyFromUtf8(this.age_);
        }

        @Override // com.p1.mobile.longlink.msg.connector.LongLinkLiveChatMessage.LiveChatRecallOrBuilder
        public String getAuth() {
            return this.auth_;
        }

        @Override // com.p1.mobile.longlink.msg.connector.LongLinkLiveChatMessage.LiveChatRecallOrBuilder
        public ByteString getAuthBytes() {
            return ByteString.copyFromUtf8(this.auth_);
        }

        @Override // com.p1.mobile.longlink.msg.connector.LongLinkLiveChatMessage.LiveChatRecallOrBuilder
        public long getBirthday() {
            return this.birthday_;
        }

        @Override // com.p1.mobile.longlink.msg.connector.LongLinkLiveChatMessage.LiveChatRecallOrBuilder
        public String getBroadcastID() {
            return this.broadcastID_;
        }

        @Override // com.p1.mobile.longlink.msg.connector.LongLinkLiveChatMessage.LiveChatRecallOrBuilder
        public ByteString getBroadcastIDBytes() {
            return ByteString.copyFromUtf8(this.broadcastID_);
        }

        @Override // com.p1.mobile.longlink.msg.connector.LongLinkLiveChatMessage.LiveChatRecallOrBuilder
        public String getGender() {
            return this.gender_;
        }

        @Override // com.p1.mobile.longlink.msg.connector.LongLinkLiveChatMessage.LiveChatRecallOrBuilder
        public ByteString getGenderBytes() {
            return ByteString.copyFromUtf8(this.gender_);
        }

        @Override // com.p1.mobile.longlink.msg.connector.LongLinkLiveChatMessage.LiveChatRecallOrBuilder
        public String getName() {
            return this.name_;
        }

        @Override // com.p1.mobile.longlink.msg.connector.LongLinkLiveChatMessage.LiveChatRecallOrBuilder
        public ByteString getNameBytes() {
            return ByteString.copyFromUtf8(this.name_);
        }

        @Override // com.p1.mobile.longlink.msg.connector.LongLinkLiveChatMessage.LiveChatRecallOrBuilder
        public String getOpeningRemark() {
            return this.openingRemark_;
        }

        @Override // com.p1.mobile.longlink.msg.connector.LongLinkLiveChatMessage.LiveChatRecallOrBuilder
        public ByteString getOpeningRemarkBytes() {
            return ByteString.copyFromUtf8(this.openingRemark_);
        }

        @Override // com.p1.mobile.longlink.msg.connector.LongLinkLiveChatMessage.LiveChatRecallOrBuilder
        public String getOtherUserId() {
            return this.otherUserId_;
        }

        @Override // com.p1.mobile.longlink.msg.connector.LongLinkLiveChatMessage.LiveChatRecallOrBuilder
        public ByteString getOtherUserIdBytes() {
            return ByteString.copyFromUtf8(this.otherUserId_);
        }

        @Override // com.p1.mobile.longlink.msg.connector.LongLinkLiveChatMessage.LiveChatRecallOrBuilder
        public String getPoolID() {
            return this.poolID_;
        }

        @Override // com.p1.mobile.longlink.msg.connector.LongLinkLiveChatMessage.LiveChatRecallOrBuilder
        public ByteString getPoolIDBytes() {
            return ByteString.copyFromUtf8(this.poolID_);
        }

        @Override // com.p1.mobile.longlink.msg.connector.LongLinkLiveChatMessage.LiveChatRecallOrBuilder
        public String getQueryToken() {
            return this.queryToken_;
        }

        @Override // com.p1.mobile.longlink.msg.connector.LongLinkLiveChatMessage.LiveChatRecallOrBuilder
        public ByteString getQueryTokenBytes() {
            return ByteString.copyFromUtf8(this.queryToken_);
        }

        public int getSerializedSize() {
            int i = ((GeneratedMessageLite) this).memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int iK = !this.otherUserId_.isEmpty() ? CodedOutputStream.K(1, getOtherUserId()) : 0;
            if (!this.auth_.isEmpty()) {
                iK += CodedOutputStream.K(2, getAuth());
            }
            if (!this.url_.isEmpty()) {
                iK += CodedOutputStream.K(3, getUrl());
            }
            if (!this.gender_.isEmpty()) {
                iK += CodedOutputStream.K(4, getGender());
            }
            if (!this.name_.isEmpty()) {
                iK += CodedOutputStream.K(5, getName());
            }
            if (!this.age_.isEmpty()) {
                iK += CodedOutputStream.K(6, getAge());
            }
            if (!this.tag1_.isEmpty()) {
                iK += CodedOutputStream.K(7, getTag1());
            }
            if (!this.tag2_.isEmpty()) {
                iK += CodedOutputStream.K(8, getTag2());
            }
            if (!this.tag3_.isEmpty()) {
                iK += CodedOutputStream.K(9, getTag3());
            }
            if (!this.queryToken_.isEmpty()) {
                iK += CodedOutputStream.K(10, getQueryToken());
            }
            if (!this.topic_.isEmpty()) {
                iK += CodedOutputStream.K(11, getTopic());
            }
            if (!this.sessionID_.isEmpty()) {
                iK += CodedOutputStream.K(12, getSessionID());
            }
            if (!this.openingRemark_.isEmpty()) {
                iK += CodedOutputStream.K(13, getOpeningRemark());
            }
            if (!this.poolID_.isEmpty()) {
                iK += CodedOutputStream.K(14, getPoolID());
            }
            long j = this.birthday_;
            if (j != 0) {
                iK += CodedOutputStream.v(15, j);
            }
            if (!this.broadcastID_.isEmpty()) {
                iK += CodedOutputStream.K(16, getBroadcastID());
            }
            ((GeneratedMessageLite) this).memoizedSerializedSize = iK;
            return iK;
        }

        @Override // com.p1.mobile.longlink.msg.connector.LongLinkLiveChatMessage.LiveChatRecallOrBuilder
        public String getSessionID() {
            return this.sessionID_;
        }

        @Override // com.p1.mobile.longlink.msg.connector.LongLinkLiveChatMessage.LiveChatRecallOrBuilder
        public ByteString getSessionIDBytes() {
            return ByteString.copyFromUtf8(this.sessionID_);
        }

        @Override // com.p1.mobile.longlink.msg.connector.LongLinkLiveChatMessage.LiveChatRecallOrBuilder
        public String getTag1() {
            return this.tag1_;
        }

        @Override // com.p1.mobile.longlink.msg.connector.LongLinkLiveChatMessage.LiveChatRecallOrBuilder
        public ByteString getTag1Bytes() {
            return ByteString.copyFromUtf8(this.tag1_);
        }

        @Override // com.p1.mobile.longlink.msg.connector.LongLinkLiveChatMessage.LiveChatRecallOrBuilder
        public String getTag2() {
            return this.tag2_;
        }

        @Override // com.p1.mobile.longlink.msg.connector.LongLinkLiveChatMessage.LiveChatRecallOrBuilder
        public ByteString getTag2Bytes() {
            return ByteString.copyFromUtf8(this.tag2_);
        }

        @Override // com.p1.mobile.longlink.msg.connector.LongLinkLiveChatMessage.LiveChatRecallOrBuilder
        public String getTag3() {
            return this.tag3_;
        }

        @Override // com.p1.mobile.longlink.msg.connector.LongLinkLiveChatMessage.LiveChatRecallOrBuilder
        public ByteString getTag3Bytes() {
            return ByteString.copyFromUtf8(this.tag3_);
        }

        @Override // com.p1.mobile.longlink.msg.connector.LongLinkLiveChatMessage.LiveChatRecallOrBuilder
        public String getTopic() {
            return this.topic_;
        }

        @Override // com.p1.mobile.longlink.msg.connector.LongLinkLiveChatMessage.LiveChatRecallOrBuilder
        public ByteString getTopicBytes() {
            return ByteString.copyFromUtf8(this.topic_);
        }

        @Override // com.p1.mobile.longlink.msg.connector.LongLinkLiveChatMessage.LiveChatRecallOrBuilder
        public String getUrl() {
            return this.url_;
        }

        @Override // com.p1.mobile.longlink.msg.connector.LongLinkLiveChatMessage.LiveChatRecallOrBuilder
        public ByteString getUrlBytes() {
            return ByteString.copyFromUtf8(this.url_);
        }

        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (!this.otherUserId_.isEmpty()) {
                codedOutputStream.D0(1, getOtherUserId());
            }
            if (!this.auth_.isEmpty()) {
                codedOutputStream.D0(2, getAuth());
            }
            if (!this.url_.isEmpty()) {
                codedOutputStream.D0(3, getUrl());
            }
            if (!this.gender_.isEmpty()) {
                codedOutputStream.D0(4, getGender());
            }
            if (!this.name_.isEmpty()) {
                codedOutputStream.D0(5, getName());
            }
            if (!this.age_.isEmpty()) {
                codedOutputStream.D0(6, getAge());
            }
            if (!this.tag1_.isEmpty()) {
                codedOutputStream.D0(7, getTag1());
            }
            if (!this.tag2_.isEmpty()) {
                codedOutputStream.D0(8, getTag2());
            }
            if (!this.tag3_.isEmpty()) {
                codedOutputStream.D0(9, getTag3());
            }
            if (!this.queryToken_.isEmpty()) {
                codedOutputStream.D0(10, getQueryToken());
            }
            if (!this.topic_.isEmpty()) {
                codedOutputStream.D0(11, getTopic());
            }
            if (!this.sessionID_.isEmpty()) {
                codedOutputStream.D0(12, getSessionID());
            }
            if (!this.openingRemark_.isEmpty()) {
                codedOutputStream.D0(13, getOpeningRemark());
            }
            if (!this.poolID_.isEmpty()) {
                codedOutputStream.D0(14, getPoolID());
            }
            long j = this.birthday_;
            if (j != 0) {
                codedOutputStream.u0(15, j);
            }
            if (this.broadcastID_.isEmpty()) {
                return;
            }
            codedOutputStream.D0(16, getBroadcastID());
        }

        public static LiveChatRecall parseDelimitedFrom(InputStream inputStream, h hVar) throws IOException {
            return (LiveChatRecall) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, hVar);
        }

        public static LiveChatRecall parseFrom(ByteString byteString, h hVar) throws InvalidProtocolBufferException {
            return (LiveChatRecall) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, hVar);
        }

        public static LiveChatRecall parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (LiveChatRecall) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static LiveChatRecall parseFrom(byte[] bArr, h hVar) throws InvalidProtocolBufferException {
            return (LiveChatRecall) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, hVar);
        }

        public static LiveChatRecall parseFrom(InputStream inputStream) throws IOException {
            return (LiveChatRecall) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static LiveChatRecall parseFrom(InputStream inputStream, h hVar) throws IOException {
            return (LiveChatRecall) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, hVar);
        }

        public static LiveChatRecall parseFrom(e eVar) throws IOException {
            return (LiveChatRecall) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, eVar);
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.toBuilder();
        }

        public static LiveChatRecall parseFrom(e eVar, h hVar) throws IOException {
            return (LiveChatRecall) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, eVar, hVar);
        }
    }
}
