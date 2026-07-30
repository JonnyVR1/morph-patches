package com.p003p1.mobile.longlink.msg;

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
public final class LongLinkmediaquickchatmeassage {

    /* JADX INFO: renamed from: com.p1.mobile.longlink.msg.LongLinkmediaquickchatmeassage$1 */
    public static /* synthetic */ class C03001 {

        /* JADX INFO: renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f1624xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f1624xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f1624xa1df5c61[GeneratedMessageLite.MethodToInvoke.IS_INITIALIZED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f1624xa1df5c61[GeneratedMessageLite.MethodToInvoke.MAKE_IMMUTABLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f1624xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f1624xa1df5c61[GeneratedMessageLite.MethodToInvoke.VISIT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f1624xa1df5c61[GeneratedMessageLite.MethodToInvoke.MERGE_FROM_STREAM.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f1624xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f1624xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    public interface QuickchatChannelEventOrBuilder extends o6z {
        /* synthetic */ q getDefaultInstanceForType();

        String getEventName();

        ByteString getEventNameBytes();

        QuickchatChannel getStatus();

        long getVersion();

        boolean hasStatus();

        /* synthetic */ boolean isInitialized();
    }

    public interface QuickchatChannelOrBuilder extends o6z {
        String getChannelID();

        ByteString getChannelIDBytes();

        /* synthetic */ q getDefaultInstanceForType();

        long getExpiredTime();

        String getSuperlikeSentUserID();

        ByteString getSuperlikeSentUserIDBytes();

        String getUsedExpiredPropUserID();

        ByteString getUsedExpiredPropUserIDBytes();

        boolean getUserMatched();

        /* synthetic */ boolean isInitialized();
    }

    public interface QuickchatMatchedOrBuilder extends o6z {
        /* synthetic */ q getDefaultInstanceForType();

        String getOtherUserID();

        ByteString getOtherUserIDBytes();

        String getQueryOtherUserToken();

        ByteString getQueryOtherUserTokenBytes();

        QuickchatType getQuickchatType();

        int getQuickchatTypeValue();

        String getRtcChannel();

        ByteString getRtcChannelBytes();

        long getRtcChannelWaittingTime();

        String getRtcToken();

        ByteString getRtcTokenBytes();

        /* synthetic */ boolean isInitialized();
    }

    private LongLinkmediaquickchatmeassage() {
    }

    public static void registerAllExtensions(h hVar) {
    }

    public static final class QuickchatChannel extends GeneratedMessageLite<QuickchatChannel, Builder> implements QuickchatChannelOrBuilder {
        public static final int CHANNELID_FIELD_NUMBER = 1;
        private static final QuickchatChannel DEFAULT_INSTANCE;
        public static final int EXPIREDTIME_FIELD_NUMBER = 4;
        private static volatile i860<QuickchatChannel> PARSER = null;
        public static final int SUPERLIKESENTUSERID_FIELD_NUMBER = 3;
        public static final int USEDEXPIREDPROPUSERID_FIELD_NUMBER = 2;
        public static final int USERMATCHED_FIELD_NUMBER = 5;
        private long expiredTime_;
        private boolean userMatched_;
        private String channelID_ = "";
        private String usedExpiredPropUserID_ = "";
        private String superlikeSentUserID_ = "";

        public static final class Builder extends GeneratedMessageLite.b<QuickchatChannel, Builder> implements QuickchatChannelOrBuilder {
            private Builder() {
                super(QuickchatChannel.DEFAULT_INSTANCE);
            }

            public Builder clearChannelID() {
                copyOnWrite();
                ((QuickchatChannel) ((GeneratedMessageLite.b) this).instance).clearChannelID();
                return this;
            }

            public Builder clearExpiredTime() {
                copyOnWrite();
                ((QuickchatChannel) ((GeneratedMessageLite.b) this).instance).clearExpiredTime();
                return this;
            }

            public Builder clearSuperlikeSentUserID() {
                copyOnWrite();
                ((QuickchatChannel) ((GeneratedMessageLite.b) this).instance).clearSuperlikeSentUserID();
                return this;
            }

            public Builder clearUsedExpiredPropUserID() {
                copyOnWrite();
                ((QuickchatChannel) ((GeneratedMessageLite.b) this).instance).clearUsedExpiredPropUserID();
                return this;
            }

            public Builder clearUserMatched() {
                copyOnWrite();
                ((QuickchatChannel) ((GeneratedMessageLite.b) this).instance).clearUserMatched();
                return this;
            }

            @Override // com.p1.mobile.longlink.msg.LongLinkmediaquickchatmeassage.QuickchatChannelOrBuilder
            public String getChannelID() {
                return ((QuickchatChannel) ((GeneratedMessageLite.b) this).instance).getChannelID();
            }

            @Override // com.p1.mobile.longlink.msg.LongLinkmediaquickchatmeassage.QuickchatChannelOrBuilder
            public ByteString getChannelIDBytes() {
                return ((QuickchatChannel) ((GeneratedMessageLite.b) this).instance).getChannelIDBytes();
            }

            @Override // com.p1.mobile.longlink.msg.LongLinkmediaquickchatmeassage.QuickchatChannelOrBuilder
            public long getExpiredTime() {
                return ((QuickchatChannel) ((GeneratedMessageLite.b) this).instance).getExpiredTime();
            }

            @Override // com.p1.mobile.longlink.msg.LongLinkmediaquickchatmeassage.QuickchatChannelOrBuilder
            public String getSuperlikeSentUserID() {
                return ((QuickchatChannel) ((GeneratedMessageLite.b) this).instance).getSuperlikeSentUserID();
            }

            @Override // com.p1.mobile.longlink.msg.LongLinkmediaquickchatmeassage.QuickchatChannelOrBuilder
            public ByteString getSuperlikeSentUserIDBytes() {
                return ((QuickchatChannel) ((GeneratedMessageLite.b) this).instance).getSuperlikeSentUserIDBytes();
            }

            @Override // com.p1.mobile.longlink.msg.LongLinkmediaquickchatmeassage.QuickchatChannelOrBuilder
            public String getUsedExpiredPropUserID() {
                return ((QuickchatChannel) ((GeneratedMessageLite.b) this).instance).getUsedExpiredPropUserID();
            }

            @Override // com.p1.mobile.longlink.msg.LongLinkmediaquickchatmeassage.QuickchatChannelOrBuilder
            public ByteString getUsedExpiredPropUserIDBytes() {
                return ((QuickchatChannel) ((GeneratedMessageLite.b) this).instance).getUsedExpiredPropUserIDBytes();
            }

            @Override // com.p1.mobile.longlink.msg.LongLinkmediaquickchatmeassage.QuickchatChannelOrBuilder
            public boolean getUserMatched() {
                return ((QuickchatChannel) ((GeneratedMessageLite.b) this).instance).getUserMatched();
            }

            public Builder setChannelID(String str) {
                copyOnWrite();
                ((QuickchatChannel) ((GeneratedMessageLite.b) this).instance).setChannelID(str);
                return this;
            }

            public Builder setChannelIDBytes(ByteString byteString) {
                copyOnWrite();
                ((QuickchatChannel) ((GeneratedMessageLite.b) this).instance).setChannelIDBytes(byteString);
                return this;
            }

            public Builder setExpiredTime(long j) {
                copyOnWrite();
                ((QuickchatChannel) ((GeneratedMessageLite.b) this).instance).setExpiredTime(j);
                return this;
            }

            public Builder setSuperlikeSentUserID(String str) {
                copyOnWrite();
                ((QuickchatChannel) ((GeneratedMessageLite.b) this).instance).setSuperlikeSentUserID(str);
                return this;
            }

            public Builder setSuperlikeSentUserIDBytes(ByteString byteString) {
                copyOnWrite();
                ((QuickchatChannel) ((GeneratedMessageLite.b) this).instance).setSuperlikeSentUserIDBytes(byteString);
                return this;
            }

            public Builder setUsedExpiredPropUserID(String str) {
                copyOnWrite();
                ((QuickchatChannel) ((GeneratedMessageLite.b) this).instance).setUsedExpiredPropUserID(str);
                return this;
            }

            public Builder setUsedExpiredPropUserIDBytes(ByteString byteString) {
                copyOnWrite();
                ((QuickchatChannel) ((GeneratedMessageLite.b) this).instance).setUsedExpiredPropUserIDBytes(byteString);
                return this;
            }

            public Builder setUserMatched(boolean z) {
                copyOnWrite();
                ((QuickchatChannel) ((GeneratedMessageLite.b) this).instance).setUserMatched(z);
                return this;
            }
        }

        static {
            QuickchatChannel quickchatChannel = new QuickchatChannel();
            DEFAULT_INSTANCE = quickchatChannel;
            quickchatChannel.makeImmutable();
        }

        private QuickchatChannel() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearChannelID() {
            this.channelID_ = getDefaultInstance().getChannelID();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearExpiredTime() {
            this.expiredTime_ = 0L;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearSuperlikeSentUserID() {
            this.superlikeSentUserID_ = getDefaultInstance().getSuperlikeSentUserID();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearUsedExpiredPropUserID() {
            this.usedExpiredPropUserID_ = getDefaultInstance().getUsedExpiredPropUserID();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearUserMatched() {
            this.userMatched_ = false;
        }

        public static QuickchatChannel getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder(QuickchatChannel quickchatChannel) {
            return (Builder) ((Builder) DEFAULT_INSTANCE.toBuilder()).mergeFrom(quickchatChannel);
        }

        public static QuickchatChannel parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (QuickchatChannel) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static QuickchatChannel parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (QuickchatChannel) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static i860<QuickchatChannel> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setChannelID(String str) {
            str.getClass();
            this.channelID_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setChannelIDBytes(ByteString byteString) {
            byteString.getClass();
            a.checkByteStringIsUtf8(byteString);
            this.channelID_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setExpiredTime(long j) {
            this.expiredTime_ = j;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSuperlikeSentUserID(String str) {
            str.getClass();
            this.superlikeSentUserID_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSuperlikeSentUserIDBytes(ByteString byteString) {
            byteString.getClass();
            a.checkByteStringIsUtf8(byteString);
            this.superlikeSentUserID_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setUsedExpiredPropUserID(String str) {
            str.getClass();
            this.usedExpiredPropUserID_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setUsedExpiredPropUserIDBytes(ByteString byteString) {
            byteString.getClass();
            a.checkByteStringIsUtf8(byteString);
            this.usedExpiredPropUserID_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setUserMatched(boolean z) {
            this.userMatched_ = z;
        }

        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            boolean z = false;
            switch (C03001.f1624xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new QuickchatChannel();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                    return null;
                case 4:
                    return new Builder();
                case 5:
                    GeneratedMessageLite.h hVar = (GeneratedMessageLite.h) obj;
                    QuickchatChannel quickchatChannel = (QuickchatChannel) obj2;
                    this.channelID_ = hVar.f(!this.channelID_.isEmpty(), this.channelID_, !quickchatChannel.channelID_.isEmpty(), quickchatChannel.channelID_);
                    this.usedExpiredPropUserID_ = hVar.f(!this.usedExpiredPropUserID_.isEmpty(), this.usedExpiredPropUserID_, !quickchatChannel.usedExpiredPropUserID_.isEmpty(), quickchatChannel.usedExpiredPropUserID_);
                    this.superlikeSentUserID_ = hVar.f(!this.superlikeSentUserID_.isEmpty(), this.superlikeSentUserID_, !quickchatChannel.superlikeSentUserID_.isEmpty(), quickchatChannel.superlikeSentUserID_);
                    long j = this.expiredTime_;
                    boolean z2 = j != 0;
                    long j2 = quickchatChannel.expiredTime_;
                    this.expiredTime_ = hVar.i(z2, j, j2 != 0, j2);
                    boolean z3 = this.userMatched_;
                    boolean z4 = quickchatChannel.userMatched_;
                    this.userMatched_ = hVar.d(z3, z3, z4, z4);
                    GeneratedMessageLite.g gVar = GeneratedMessageLite.g.INSTANCE;
                    return this;
                case 6:
                    e eVar = (e) obj;
                    while (!z) {
                        try {
                            int iM = eVar.M();
                            if (iM != 0) {
                                if (iM == 10) {
                                    this.channelID_ = eVar.L();
                                } else if (iM == 18) {
                                    this.usedExpiredPropUserID_ = eVar.L();
                                } else if (iM == 26) {
                                    this.superlikeSentUserID_ = eVar.L();
                                } else if (iM == 32) {
                                    this.expiredTime_ = eVar.v();
                                } else if (iM == 40) {
                                    this.userMatched_ = eVar.m();
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
                        synchronized (QuickchatChannel.class) {
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

        @Override // com.p1.mobile.longlink.msg.LongLinkmediaquickchatmeassage.QuickchatChannelOrBuilder
        public String getChannelID() {
            return this.channelID_;
        }

        @Override // com.p1.mobile.longlink.msg.LongLinkmediaquickchatmeassage.QuickchatChannelOrBuilder
        public ByteString getChannelIDBytes() {
            return ByteString.copyFromUtf8(this.channelID_);
        }

        @Override // com.p1.mobile.longlink.msg.LongLinkmediaquickchatmeassage.QuickchatChannelOrBuilder
        public long getExpiredTime() {
            return this.expiredTime_;
        }

        public int getSerializedSize() {
            int i = ((GeneratedMessageLite) this).memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int iK = !this.channelID_.isEmpty() ? CodedOutputStream.K(1, getChannelID()) : 0;
            if (!this.usedExpiredPropUserID_.isEmpty()) {
                iK += CodedOutputStream.K(2, getUsedExpiredPropUserID());
            }
            if (!this.superlikeSentUserID_.isEmpty()) {
                iK += CodedOutputStream.K(3, getSuperlikeSentUserID());
            }
            long j = this.expiredTime_;
            if (j != 0) {
                iK += CodedOutputStream.v(4, j);
            }
            boolean z = this.userMatched_;
            if (z) {
                iK += CodedOutputStream.f(5, z);
            }
            ((GeneratedMessageLite) this).memoizedSerializedSize = iK;
            return iK;
        }

        @Override // com.p1.mobile.longlink.msg.LongLinkmediaquickchatmeassage.QuickchatChannelOrBuilder
        public String getSuperlikeSentUserID() {
            return this.superlikeSentUserID_;
        }

        @Override // com.p1.mobile.longlink.msg.LongLinkmediaquickchatmeassage.QuickchatChannelOrBuilder
        public ByteString getSuperlikeSentUserIDBytes() {
            return ByteString.copyFromUtf8(this.superlikeSentUserID_);
        }

        @Override // com.p1.mobile.longlink.msg.LongLinkmediaquickchatmeassage.QuickchatChannelOrBuilder
        public String getUsedExpiredPropUserID() {
            return this.usedExpiredPropUserID_;
        }

        @Override // com.p1.mobile.longlink.msg.LongLinkmediaquickchatmeassage.QuickchatChannelOrBuilder
        public ByteString getUsedExpiredPropUserIDBytes() {
            return ByteString.copyFromUtf8(this.usedExpiredPropUserID_);
        }

        @Override // com.p1.mobile.longlink.msg.LongLinkmediaquickchatmeassage.QuickchatChannelOrBuilder
        public boolean getUserMatched() {
            return this.userMatched_;
        }

        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (!this.channelID_.isEmpty()) {
                codedOutputStream.D0(1, getChannelID());
            }
            if (!this.usedExpiredPropUserID_.isEmpty()) {
                codedOutputStream.D0(2, getUsedExpiredPropUserID());
            }
            if (!this.superlikeSentUserID_.isEmpty()) {
                codedOutputStream.D0(3, getSuperlikeSentUserID());
            }
            long j = this.expiredTime_;
            if (j != 0) {
                codedOutputStream.u0(4, j);
            }
            boolean z = this.userMatched_;
            if (z) {
                codedOutputStream.a0(5, z);
            }
        }

        public static QuickchatChannel parseDelimitedFrom(InputStream inputStream, h hVar) throws IOException {
            return (QuickchatChannel) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, hVar);
        }

        public static QuickchatChannel parseFrom(ByteString byteString, h hVar) throws InvalidProtocolBufferException {
            return (QuickchatChannel) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, hVar);
        }

        public static QuickchatChannel parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (QuickchatChannel) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static QuickchatChannel parseFrom(byte[] bArr, h hVar) throws InvalidProtocolBufferException {
            return (QuickchatChannel) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, hVar);
        }

        public static QuickchatChannel parseFrom(InputStream inputStream) throws IOException {
            return (QuickchatChannel) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static QuickchatChannel parseFrom(InputStream inputStream, h hVar) throws IOException {
            return (QuickchatChannel) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, hVar);
        }

        public static QuickchatChannel parseFrom(e eVar) throws IOException {
            return (QuickchatChannel) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, eVar);
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.toBuilder();
        }

        public static QuickchatChannel parseFrom(e eVar, h hVar) throws IOException {
            return (QuickchatChannel) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, eVar, hVar);
        }
    }

    public static final class QuickchatChannelEvent extends GeneratedMessageLite<QuickchatChannelEvent, Builder> implements QuickchatChannelEventOrBuilder {
        private static final QuickchatChannelEvent DEFAULT_INSTANCE;
        public static final int EVENTNAME_FIELD_NUMBER = 1;
        private static volatile i860<QuickchatChannelEvent> PARSER = null;
        public static final int STATUS_FIELD_NUMBER = 2;
        public static final int VERSION_FIELD_NUMBER = 3;
        private String eventName_ = "";
        private QuickchatChannel status_;
        private long version_;

        static {
            QuickchatChannelEvent quickchatChannelEvent = new QuickchatChannelEvent();
            DEFAULT_INSTANCE = quickchatChannelEvent;
            quickchatChannelEvent.makeImmutable();
        }

        private QuickchatChannelEvent() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearEventName() {
            this.eventName_ = getDefaultInstance().getEventName();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearStatus() {
            this.status_ = null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearVersion() {
            this.version_ = 0L;
        }

        public static QuickchatChannelEvent getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeStatus(QuickchatChannel quickchatChannel) {
            QuickchatChannel quickchatChannel2 = this.status_;
            if (quickchatChannel2 == null || quickchatChannel2 == QuickchatChannel.getDefaultInstance()) {
                this.status_ = quickchatChannel;
            } else {
                this.status_ = (QuickchatChannel) ((QuickchatChannel.Builder) QuickchatChannel.newBuilder(this.status_).mergeFrom(quickchatChannel)).buildPartial();
            }
        }

        public static Builder newBuilder(QuickchatChannelEvent quickchatChannelEvent) {
            return (Builder) ((Builder) DEFAULT_INSTANCE.toBuilder()).mergeFrom(quickchatChannelEvent);
        }

        public static QuickchatChannelEvent parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (QuickchatChannelEvent) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static QuickchatChannelEvent parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (QuickchatChannelEvent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static i860<QuickchatChannelEvent> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setEventName(String str) {
            str.getClass();
            this.eventName_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setEventNameBytes(ByteString byteString) {
            byteString.getClass();
            a.checkByteStringIsUtf8(byteString);
            this.eventName_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setStatus(QuickchatChannel.Builder builder) {
            this.status_ = (QuickchatChannel) builder.build();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setVersion(long j) {
            this.version_ = j;
        }

        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            boolean z = false;
            switch (C03001.f1624xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new QuickchatChannelEvent();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                    return null;
                case 4:
                    return new Builder();
                case 5:
                    GeneratedMessageLite.h hVar = (GeneratedMessageLite.h) obj;
                    QuickchatChannelEvent quickchatChannelEvent = (QuickchatChannelEvent) obj2;
                    this.eventName_ = hVar.f(!this.eventName_.isEmpty(), this.eventName_, !quickchatChannelEvent.eventName_.isEmpty(), quickchatChannelEvent.eventName_);
                    this.status_ = hVar.o(this.status_, quickchatChannelEvent.status_);
                    long j = this.version_;
                    boolean z2 = j != 0;
                    long j2 = quickchatChannelEvent.version_;
                    this.version_ = hVar.i(z2, j, j2 != 0, j2);
                    GeneratedMessageLite.g gVar = GeneratedMessageLite.g.INSTANCE;
                    return this;
                case 6:
                    e eVar = (e) obj;
                    h hVar2 = (h) obj2;
                    while (!z) {
                        try {
                            int iM = eVar.M();
                            if (iM != 0) {
                                if (iM == 10) {
                                    this.eventName_ = eVar.L();
                                } else if (iM == 18) {
                                    QuickchatChannel quickchatChannel = this.status_;
                                    QuickchatChannel.Builder builder = quickchatChannel != null ? (QuickchatChannel.Builder) quickchatChannel.toBuilder() : null;
                                    QuickchatChannel quickchatChannelW = eVar.w(QuickchatChannel.parser(), hVar2);
                                    this.status_ = quickchatChannelW;
                                    if (builder != null) {
                                        builder.mergeFrom(quickchatChannelW);
                                        this.status_ = (QuickchatChannel) builder.buildPartial();
                                    }
                                } else if (iM == 24) {
                                    this.version_ = eVar.v();
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
                        synchronized (QuickchatChannelEvent.class) {
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

        @Override // com.p1.mobile.longlink.msg.LongLinkmediaquickchatmeassage.QuickchatChannelEventOrBuilder
        public String getEventName() {
            return this.eventName_;
        }

        @Override // com.p1.mobile.longlink.msg.LongLinkmediaquickchatmeassage.QuickchatChannelEventOrBuilder
        public ByteString getEventNameBytes() {
            return ByteString.copyFromUtf8(this.eventName_);
        }

        public int getSerializedSize() {
            int i = ((GeneratedMessageLite) this).memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int iK = !this.eventName_.isEmpty() ? CodedOutputStream.K(1, getEventName()) : 0;
            if (this.status_ != null) {
                iK += CodedOutputStream.C(2, getStatus());
            }
            long j = this.version_;
            if (j != 0) {
                iK += CodedOutputStream.v(3, j);
            }
            ((GeneratedMessageLite) this).memoizedSerializedSize = iK;
            return iK;
        }

        @Override // com.p1.mobile.longlink.msg.LongLinkmediaquickchatmeassage.QuickchatChannelEventOrBuilder
        public QuickchatChannel getStatus() {
            QuickchatChannel quickchatChannel = this.status_;
            return quickchatChannel == null ? QuickchatChannel.getDefaultInstance() : quickchatChannel;
        }

        @Override // com.p1.mobile.longlink.msg.LongLinkmediaquickchatmeassage.QuickchatChannelEventOrBuilder
        public long getVersion() {
            return this.version_;
        }

        @Override // com.p1.mobile.longlink.msg.LongLinkmediaquickchatmeassage.QuickchatChannelEventOrBuilder
        public boolean hasStatus() {
            return this.status_ != null;
        }

        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (!this.eventName_.isEmpty()) {
                codedOutputStream.D0(1, getEventName());
            }
            if (this.status_ != null) {
                codedOutputStream.w0(2, getStatus());
            }
            long j = this.version_;
            if (j != 0) {
                codedOutputStream.u0(3, j);
            }
        }

        public static QuickchatChannelEvent parseDelimitedFrom(InputStream inputStream, h hVar) throws IOException {
            return (QuickchatChannelEvent) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, hVar);
        }

        public static QuickchatChannelEvent parseFrom(ByteString byteString, h hVar) throws InvalidProtocolBufferException {
            return (QuickchatChannelEvent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, hVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setStatus(QuickchatChannel quickchatChannel) {
            quickchatChannel.getClass();
            this.status_ = quickchatChannel;
        }

        public static final class Builder extends GeneratedMessageLite.b<QuickchatChannelEvent, Builder> implements QuickchatChannelEventOrBuilder {
            private Builder() {
                super(QuickchatChannelEvent.DEFAULT_INSTANCE);
            }

            public Builder clearEventName() {
                copyOnWrite();
                ((QuickchatChannelEvent) ((GeneratedMessageLite.b) this).instance).clearEventName();
                return this;
            }

            public Builder clearStatus() {
                copyOnWrite();
                ((QuickchatChannelEvent) ((GeneratedMessageLite.b) this).instance).clearStatus();
                return this;
            }

            public Builder clearVersion() {
                copyOnWrite();
                ((QuickchatChannelEvent) ((GeneratedMessageLite.b) this).instance).clearVersion();
                return this;
            }

            @Override // com.p1.mobile.longlink.msg.LongLinkmediaquickchatmeassage.QuickchatChannelEventOrBuilder
            public String getEventName() {
                return ((QuickchatChannelEvent) ((GeneratedMessageLite.b) this).instance).getEventName();
            }

            @Override // com.p1.mobile.longlink.msg.LongLinkmediaquickchatmeassage.QuickchatChannelEventOrBuilder
            public ByteString getEventNameBytes() {
                return ((QuickchatChannelEvent) ((GeneratedMessageLite.b) this).instance).getEventNameBytes();
            }

            @Override // com.p1.mobile.longlink.msg.LongLinkmediaquickchatmeassage.QuickchatChannelEventOrBuilder
            public QuickchatChannel getStatus() {
                return ((QuickchatChannelEvent) ((GeneratedMessageLite.b) this).instance).getStatus();
            }

            @Override // com.p1.mobile.longlink.msg.LongLinkmediaquickchatmeassage.QuickchatChannelEventOrBuilder
            public long getVersion() {
                return ((QuickchatChannelEvent) ((GeneratedMessageLite.b) this).instance).getVersion();
            }

            @Override // com.p1.mobile.longlink.msg.LongLinkmediaquickchatmeassage.QuickchatChannelEventOrBuilder
            public boolean hasStatus() {
                return ((QuickchatChannelEvent) ((GeneratedMessageLite.b) this).instance).hasStatus();
            }

            public Builder mergeStatus(QuickchatChannel quickchatChannel) {
                copyOnWrite();
                ((QuickchatChannelEvent) ((GeneratedMessageLite.b) this).instance).mergeStatus(quickchatChannel);
                return this;
            }

            public Builder setEventName(String str) {
                copyOnWrite();
                ((QuickchatChannelEvent) ((GeneratedMessageLite.b) this).instance).setEventName(str);
                return this;
            }

            public Builder setEventNameBytes(ByteString byteString) {
                copyOnWrite();
                ((QuickchatChannelEvent) ((GeneratedMessageLite.b) this).instance).setEventNameBytes(byteString);
                return this;
            }

            public Builder setStatus(QuickchatChannel quickchatChannel) {
                copyOnWrite();
                ((QuickchatChannelEvent) ((GeneratedMessageLite.b) this).instance).setStatus(quickchatChannel);
                return this;
            }

            public Builder setVersion(long j) {
                copyOnWrite();
                ((QuickchatChannelEvent) ((GeneratedMessageLite.b) this).instance).setVersion(j);
                return this;
            }

            public Builder setStatus(QuickchatChannel.Builder builder) {
                copyOnWrite();
                ((QuickchatChannelEvent) ((GeneratedMessageLite.b) this).instance).setStatus(builder);
                return this;
            }
        }

        public static QuickchatChannelEvent parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (QuickchatChannelEvent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static QuickchatChannelEvent parseFrom(byte[] bArr, h hVar) throws InvalidProtocolBufferException {
            return (QuickchatChannelEvent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, hVar);
        }

        public static QuickchatChannelEvent parseFrom(InputStream inputStream) throws IOException {
            return (QuickchatChannelEvent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static QuickchatChannelEvent parseFrom(InputStream inputStream, h hVar) throws IOException {
            return (QuickchatChannelEvent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, hVar);
        }

        public static QuickchatChannelEvent parseFrom(e eVar) throws IOException {
            return (QuickchatChannelEvent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, eVar);
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.toBuilder();
        }

        public static QuickchatChannelEvent parseFrom(e eVar, h hVar) throws IOException {
            return (QuickchatChannelEvent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, eVar, hVar);
        }
    }

    public static final class QuickchatMatched extends GeneratedMessageLite<QuickchatMatched, Builder> implements QuickchatMatchedOrBuilder {
        private static final QuickchatMatched DEFAULT_INSTANCE;
        public static final int OTHERUSERID_FIELD_NUMBER = 1;
        private static volatile i860<QuickchatMatched> PARSER = null;
        public static final int QUERYOTHERUSERTOKEN_FIELD_NUMBER = 6;
        public static final int QUICKCHATTYPE_FIELD_NUMBER = 2;
        public static final int RTCCHANNELWAITTINGTIME_FIELD_NUMBER = 5;
        public static final int RTCCHANNEL_FIELD_NUMBER = 4;
        public static final int RTCTOKEN_FIELD_NUMBER = 3;
        private int quickchatType_;
        private long rtcChannelWaittingTime_;
        private String otherUserID_ = "";
        private String rtcToken_ = "";
        private String rtcChannel_ = "";
        private String queryOtherUserToken_ = "";

        public static final class Builder extends GeneratedMessageLite.b<QuickchatMatched, Builder> implements QuickchatMatchedOrBuilder {
            private Builder() {
                super(QuickchatMatched.DEFAULT_INSTANCE);
            }

            public Builder clearOtherUserID() {
                copyOnWrite();
                ((QuickchatMatched) ((GeneratedMessageLite.b) this).instance).clearOtherUserID();
                return this;
            }

            public Builder clearQueryOtherUserToken() {
                copyOnWrite();
                ((QuickchatMatched) ((GeneratedMessageLite.b) this).instance).clearQueryOtherUserToken();
                return this;
            }

            public Builder clearQuickchatType() {
                copyOnWrite();
                ((QuickchatMatched) ((GeneratedMessageLite.b) this).instance).clearQuickchatType();
                return this;
            }

            public Builder clearRtcChannel() {
                copyOnWrite();
                ((QuickchatMatched) ((GeneratedMessageLite.b) this).instance).clearRtcChannel();
                return this;
            }

            public Builder clearRtcChannelWaittingTime() {
                copyOnWrite();
                ((QuickchatMatched) ((GeneratedMessageLite.b) this).instance).clearRtcChannelWaittingTime();
                return this;
            }

            public Builder clearRtcToken() {
                copyOnWrite();
                ((QuickchatMatched) ((GeneratedMessageLite.b) this).instance).clearRtcToken();
                return this;
            }

            @Override // com.p1.mobile.longlink.msg.LongLinkmediaquickchatmeassage.QuickchatMatchedOrBuilder
            public String getOtherUserID() {
                return ((QuickchatMatched) ((GeneratedMessageLite.b) this).instance).getOtherUserID();
            }

            @Override // com.p1.mobile.longlink.msg.LongLinkmediaquickchatmeassage.QuickchatMatchedOrBuilder
            public ByteString getOtherUserIDBytes() {
                return ((QuickchatMatched) ((GeneratedMessageLite.b) this).instance).getOtherUserIDBytes();
            }

            @Override // com.p1.mobile.longlink.msg.LongLinkmediaquickchatmeassage.QuickchatMatchedOrBuilder
            public String getQueryOtherUserToken() {
                return ((QuickchatMatched) ((GeneratedMessageLite.b) this).instance).getQueryOtherUserToken();
            }

            @Override // com.p1.mobile.longlink.msg.LongLinkmediaquickchatmeassage.QuickchatMatchedOrBuilder
            public ByteString getQueryOtherUserTokenBytes() {
                return ((QuickchatMatched) ((GeneratedMessageLite.b) this).instance).getQueryOtherUserTokenBytes();
            }

            @Override // com.p1.mobile.longlink.msg.LongLinkmediaquickchatmeassage.QuickchatMatchedOrBuilder
            public QuickchatType getQuickchatType() {
                return ((QuickchatMatched) ((GeneratedMessageLite.b) this).instance).getQuickchatType();
            }

            @Override // com.p1.mobile.longlink.msg.LongLinkmediaquickchatmeassage.QuickchatMatchedOrBuilder
            public int getQuickchatTypeValue() {
                return ((QuickchatMatched) ((GeneratedMessageLite.b) this).instance).getQuickchatTypeValue();
            }

            @Override // com.p1.mobile.longlink.msg.LongLinkmediaquickchatmeassage.QuickchatMatchedOrBuilder
            public String getRtcChannel() {
                return ((QuickchatMatched) ((GeneratedMessageLite.b) this).instance).getRtcChannel();
            }

            @Override // com.p1.mobile.longlink.msg.LongLinkmediaquickchatmeassage.QuickchatMatchedOrBuilder
            public ByteString getRtcChannelBytes() {
                return ((QuickchatMatched) ((GeneratedMessageLite.b) this).instance).getRtcChannelBytes();
            }

            @Override // com.p1.mobile.longlink.msg.LongLinkmediaquickchatmeassage.QuickchatMatchedOrBuilder
            public long getRtcChannelWaittingTime() {
                return ((QuickchatMatched) ((GeneratedMessageLite.b) this).instance).getRtcChannelWaittingTime();
            }

            @Override // com.p1.mobile.longlink.msg.LongLinkmediaquickchatmeassage.QuickchatMatchedOrBuilder
            public String getRtcToken() {
                return ((QuickchatMatched) ((GeneratedMessageLite.b) this).instance).getRtcToken();
            }

            @Override // com.p1.mobile.longlink.msg.LongLinkmediaquickchatmeassage.QuickchatMatchedOrBuilder
            public ByteString getRtcTokenBytes() {
                return ((QuickchatMatched) ((GeneratedMessageLite.b) this).instance).getRtcTokenBytes();
            }

            public Builder setOtherUserID(String str) {
                copyOnWrite();
                ((QuickchatMatched) ((GeneratedMessageLite.b) this).instance).setOtherUserID(str);
                return this;
            }

            public Builder setOtherUserIDBytes(ByteString byteString) {
                copyOnWrite();
                ((QuickchatMatched) ((GeneratedMessageLite.b) this).instance).setOtherUserIDBytes(byteString);
                return this;
            }

            public Builder setQueryOtherUserToken(String str) {
                copyOnWrite();
                ((QuickchatMatched) ((GeneratedMessageLite.b) this).instance).setQueryOtherUserToken(str);
                return this;
            }

            public Builder setQueryOtherUserTokenBytes(ByteString byteString) {
                copyOnWrite();
                ((QuickchatMatched) ((GeneratedMessageLite.b) this).instance).setQueryOtherUserTokenBytes(byteString);
                return this;
            }

            public Builder setQuickchatType(QuickchatType quickchatType) {
                copyOnWrite();
                ((QuickchatMatched) ((GeneratedMessageLite.b) this).instance).setQuickchatType(quickchatType);
                return this;
            }

            public Builder setQuickchatTypeValue(int i) {
                copyOnWrite();
                ((QuickchatMatched) ((GeneratedMessageLite.b) this).instance).setQuickchatTypeValue(i);
                return this;
            }

            public Builder setRtcChannel(String str) {
                copyOnWrite();
                ((QuickchatMatched) ((GeneratedMessageLite.b) this).instance).setRtcChannel(str);
                return this;
            }

            public Builder setRtcChannelBytes(ByteString byteString) {
                copyOnWrite();
                ((QuickchatMatched) ((GeneratedMessageLite.b) this).instance).setRtcChannelBytes(byteString);
                return this;
            }

            public Builder setRtcChannelWaittingTime(long j) {
                copyOnWrite();
                ((QuickchatMatched) ((GeneratedMessageLite.b) this).instance).setRtcChannelWaittingTime(j);
                return this;
            }

            public Builder setRtcToken(String str) {
                copyOnWrite();
                ((QuickchatMatched) ((GeneratedMessageLite.b) this).instance).setRtcToken(str);
                return this;
            }

            public Builder setRtcTokenBytes(ByteString byteString) {
                copyOnWrite();
                ((QuickchatMatched) ((GeneratedMessageLite.b) this).instance).setRtcTokenBytes(byteString);
                return this;
            }
        }

        static {
            QuickchatMatched quickchatMatched = new QuickchatMatched();
            DEFAULT_INSTANCE = quickchatMatched;
            quickchatMatched.makeImmutable();
        }

        private QuickchatMatched() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearOtherUserID() {
            this.otherUserID_ = getDefaultInstance().getOtherUserID();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearQueryOtherUserToken() {
            this.queryOtherUserToken_ = getDefaultInstance().getQueryOtherUserToken();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearQuickchatType() {
            this.quickchatType_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearRtcChannel() {
            this.rtcChannel_ = getDefaultInstance().getRtcChannel();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearRtcChannelWaittingTime() {
            this.rtcChannelWaittingTime_ = 0L;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearRtcToken() {
            this.rtcToken_ = getDefaultInstance().getRtcToken();
        }

        public static QuickchatMatched getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder(QuickchatMatched quickchatMatched) {
            return (Builder) ((Builder) DEFAULT_INSTANCE.toBuilder()).mergeFrom(quickchatMatched);
        }

        public static QuickchatMatched parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (QuickchatMatched) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static QuickchatMatched parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (QuickchatMatched) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static i860<QuickchatMatched> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setOtherUserID(String str) {
            str.getClass();
            this.otherUserID_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setOtherUserIDBytes(ByteString byteString) {
            byteString.getClass();
            a.checkByteStringIsUtf8(byteString);
            this.otherUserID_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setQueryOtherUserToken(String str) {
            str.getClass();
            this.queryOtherUserToken_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setQueryOtherUserTokenBytes(ByteString byteString) {
            byteString.getClass();
            a.checkByteStringIsUtf8(byteString);
            this.queryOtherUserToken_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setQuickchatType(QuickchatType quickchatType) {
            quickchatType.getClass();
            this.quickchatType_ = quickchatType.getNumber();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setQuickchatTypeValue(int i) {
            this.quickchatType_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setRtcChannel(String str) {
            str.getClass();
            this.rtcChannel_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setRtcChannelBytes(ByteString byteString) {
            byteString.getClass();
            a.checkByteStringIsUtf8(byteString);
            this.rtcChannel_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setRtcChannelWaittingTime(long j) {
            this.rtcChannelWaittingTime_ = j;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setRtcToken(String str) {
            str.getClass();
            this.rtcToken_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setRtcTokenBytes(ByteString byteString) {
            byteString.getClass();
            a.checkByteStringIsUtf8(byteString);
            this.rtcToken_ = byteString.toStringUtf8();
        }

        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            boolean z = false;
            switch (C03001.f1624xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new QuickchatMatched();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                    return null;
                case 4:
                    return new Builder();
                case 5:
                    GeneratedMessageLite.h hVar = (GeneratedMessageLite.h) obj;
                    QuickchatMatched quickchatMatched = (QuickchatMatched) obj2;
                    this.otherUserID_ = hVar.f(!this.otherUserID_.isEmpty(), this.otherUserID_, !quickchatMatched.otherUserID_.isEmpty(), quickchatMatched.otherUserID_);
                    int i = this.quickchatType_;
                    boolean z2 = i != 0;
                    int i2 = quickchatMatched.quickchatType_;
                    this.quickchatType_ = hVar.e(z2, i, i2 != 0, i2);
                    this.rtcToken_ = hVar.f(!this.rtcToken_.isEmpty(), this.rtcToken_, !quickchatMatched.rtcToken_.isEmpty(), quickchatMatched.rtcToken_);
                    this.rtcChannel_ = hVar.f(!this.rtcChannel_.isEmpty(), this.rtcChannel_, !quickchatMatched.rtcChannel_.isEmpty(), quickchatMatched.rtcChannel_);
                    long j = this.rtcChannelWaittingTime_;
                    boolean z3 = j != 0;
                    long j2 = quickchatMatched.rtcChannelWaittingTime_;
                    this.rtcChannelWaittingTime_ = hVar.i(z3, j, j2 != 0, j2);
                    this.queryOtherUserToken_ = hVar.f(!this.queryOtherUserToken_.isEmpty(), this.queryOtherUserToken_, !quickchatMatched.queryOtherUserToken_.isEmpty(), quickchatMatched.queryOtherUserToken_);
                    GeneratedMessageLite.g gVar = GeneratedMessageLite.g.INSTANCE;
                    return this;
                case 6:
                    e eVar = (e) obj;
                    while (!z) {
                        try {
                            int iM = eVar.M();
                            if (iM != 0) {
                                if (iM == 10) {
                                    this.otherUserID_ = eVar.L();
                                } else if (iM == 16) {
                                    this.quickchatType_ = eVar.p();
                                } else if (iM == 26) {
                                    this.rtcToken_ = eVar.L();
                                } else if (iM == 34) {
                                    this.rtcChannel_ = eVar.L();
                                } else if (iM == 40) {
                                    this.rtcChannelWaittingTime_ = eVar.v();
                                } else if (iM == 50) {
                                    this.queryOtherUserToken_ = eVar.L();
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
                        synchronized (QuickchatMatched.class) {
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

        @Override // com.p1.mobile.longlink.msg.LongLinkmediaquickchatmeassage.QuickchatMatchedOrBuilder
        public String getOtherUserID() {
            return this.otherUserID_;
        }

        @Override // com.p1.mobile.longlink.msg.LongLinkmediaquickchatmeassage.QuickchatMatchedOrBuilder
        public ByteString getOtherUserIDBytes() {
            return ByteString.copyFromUtf8(this.otherUserID_);
        }

        @Override // com.p1.mobile.longlink.msg.LongLinkmediaquickchatmeassage.QuickchatMatchedOrBuilder
        public String getQueryOtherUserToken() {
            return this.queryOtherUserToken_;
        }

        @Override // com.p1.mobile.longlink.msg.LongLinkmediaquickchatmeassage.QuickchatMatchedOrBuilder
        public ByteString getQueryOtherUserTokenBytes() {
            return ByteString.copyFromUtf8(this.queryOtherUserToken_);
        }

        @Override // com.p1.mobile.longlink.msg.LongLinkmediaquickchatmeassage.QuickchatMatchedOrBuilder
        public QuickchatType getQuickchatType() {
            QuickchatType quickchatTypeForNumber = QuickchatType.forNumber(this.quickchatType_);
            return quickchatTypeForNumber == null ? QuickchatType.UNRECOGNIZED : quickchatTypeForNumber;
        }

        @Override // com.p1.mobile.longlink.msg.LongLinkmediaquickchatmeassage.QuickchatMatchedOrBuilder
        public int getQuickchatTypeValue() {
            return this.quickchatType_;
        }

        @Override // com.p1.mobile.longlink.msg.LongLinkmediaquickchatmeassage.QuickchatMatchedOrBuilder
        public String getRtcChannel() {
            return this.rtcChannel_;
        }

        @Override // com.p1.mobile.longlink.msg.LongLinkmediaquickchatmeassage.QuickchatMatchedOrBuilder
        public ByteString getRtcChannelBytes() {
            return ByteString.copyFromUtf8(this.rtcChannel_);
        }

        @Override // com.p1.mobile.longlink.msg.LongLinkmediaquickchatmeassage.QuickchatMatchedOrBuilder
        public long getRtcChannelWaittingTime() {
            return this.rtcChannelWaittingTime_;
        }

        @Override // com.p1.mobile.longlink.msg.LongLinkmediaquickchatmeassage.QuickchatMatchedOrBuilder
        public String getRtcToken() {
            return this.rtcToken_;
        }

        @Override // com.p1.mobile.longlink.msg.LongLinkmediaquickchatmeassage.QuickchatMatchedOrBuilder
        public ByteString getRtcTokenBytes() {
            return ByteString.copyFromUtf8(this.rtcToken_);
        }

        public int getSerializedSize() {
            int i = ((GeneratedMessageLite) this).memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int iK = !this.otherUserID_.isEmpty() ? CodedOutputStream.K(1, getOtherUserID()) : 0;
            if (this.quickchatType_ != QuickchatType.Unknown.getNumber()) {
                iK += CodedOutputStream.m(2, this.quickchatType_);
            }
            if (!this.rtcToken_.isEmpty()) {
                iK += CodedOutputStream.K(3, getRtcToken());
            }
            if (!this.rtcChannel_.isEmpty()) {
                iK += CodedOutputStream.K(4, getRtcChannel());
            }
            long j = this.rtcChannelWaittingTime_;
            if (j != 0) {
                iK += CodedOutputStream.v(5, j);
            }
            if (!this.queryOtherUserToken_.isEmpty()) {
                iK += CodedOutputStream.K(6, getQueryOtherUserToken());
            }
            ((GeneratedMessageLite) this).memoizedSerializedSize = iK;
            return iK;
        }

        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (!this.otherUserID_.isEmpty()) {
                codedOutputStream.D0(1, getOtherUserID());
            }
            if (this.quickchatType_ != QuickchatType.Unknown.getNumber()) {
                codedOutputStream.i0(2, this.quickchatType_);
            }
            if (!this.rtcToken_.isEmpty()) {
                codedOutputStream.D0(3, getRtcToken());
            }
            if (!this.rtcChannel_.isEmpty()) {
                codedOutputStream.D0(4, getRtcChannel());
            }
            long j = this.rtcChannelWaittingTime_;
            if (j != 0) {
                codedOutputStream.u0(5, j);
            }
            if (this.queryOtherUserToken_.isEmpty()) {
                return;
            }
            codedOutputStream.D0(6, getQueryOtherUserToken());
        }

        public static QuickchatMatched parseDelimitedFrom(InputStream inputStream, h hVar) throws IOException {
            return (QuickchatMatched) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, hVar);
        }

        public static QuickchatMatched parseFrom(ByteString byteString, h hVar) throws InvalidProtocolBufferException {
            return (QuickchatMatched) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, hVar);
        }

        public static QuickchatMatched parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (QuickchatMatched) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static QuickchatMatched parseFrom(byte[] bArr, h hVar) throws InvalidProtocolBufferException {
            return (QuickchatMatched) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, hVar);
        }

        public static QuickchatMatched parseFrom(InputStream inputStream) throws IOException {
            return (QuickchatMatched) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static QuickchatMatched parseFrom(InputStream inputStream, h hVar) throws IOException {
            return (QuickchatMatched) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, hVar);
        }

        public static QuickchatMatched parseFrom(e eVar) throws IOException {
            return (QuickchatMatched) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, eVar);
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.toBuilder();
        }

        public static QuickchatMatched parseFrom(e eVar, h hVar) throws IOException {
            return (QuickchatMatched) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, eVar, hVar);
        }
    }

    public enum QuickchatType implements l.c {
        Unknown(0),
        Audio(1),
        Video(2),
        UNRECOGNIZED(-1);

        public static final int Audio_VALUE = 1;
        public static final int Unknown_VALUE = 0;
        public static final int Video_VALUE = 2;
        private static final l.d<QuickchatType> internalValueMap = new l.d<QuickchatType>() { // from class: com.p1.mobile.longlink.msg.LongLinkmediaquickchatmeassage.QuickchatType.1
            public QuickchatType findValueByNumber(int i) {
                return QuickchatType.forNumber(i);
            }
        };
        private final int value;

        QuickchatType(int i) {
            this.value = i;
        }

        public static QuickchatType forNumber(int i) {
            if (i == 0) {
                return Unknown;
            }
            if (i == 1) {
                return Audio;
            }
            if (i != 2) {
                return null;
            }
            return Video;
        }

        public static l.d<QuickchatType> internalGetValueMap() {
            return internalValueMap;
        }

        public final int getNumber() {
            return this.value;
        }

        @Deprecated
        public static QuickchatType valueOf(int i) {
            return forNumber(i);
        }
    }
}
