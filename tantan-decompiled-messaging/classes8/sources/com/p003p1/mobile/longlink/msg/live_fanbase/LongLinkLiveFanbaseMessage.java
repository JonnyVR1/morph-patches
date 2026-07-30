package com.p003p1.mobile.longlink.msg.live_fanbase;

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
public final class LongLinkLiveFanbaseMessage {

    /* JADX INFO: renamed from: com.p1.mobile.longlink.msg.live_fanbase.LongLinkLiveFanbaseMessage$1 */
    public static /* synthetic */ class C03451 {

        /* JADX INFO: renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f1651xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f1651xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f1651xa1df5c61[GeneratedMessageLite.MethodToInvoke.IS_INITIALIZED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f1651xa1df5c61[GeneratedMessageLite.MethodToInvoke.MAKE_IMMUTABLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f1651xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f1651xa1df5c61[GeneratedMessageLite.MethodToInvoke.VISIT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f1651xa1df5c61[GeneratedMessageLite.MethodToInvoke.MERGE_FROM_STREAM.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f1651xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f1651xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    public interface RedPacketEventOrBuilder extends o6z {
        /* synthetic */ q getDefaultInstanceForType();

        String getFanbaseId();

        ByteString getFanbaseIdBytes();

        /* synthetic */ boolean isInitialized();
    }

    private LongLinkLiveFanbaseMessage() {
    }

    public static void registerAllExtensions(h hVar) {
    }

    public static final class RedPacketEvent extends GeneratedMessageLite<RedPacketEvent, Builder> implements RedPacketEventOrBuilder {
        private static final RedPacketEvent DEFAULT_INSTANCE;
        public static final int FANBASEID_FIELD_NUMBER = 1;
        private static volatile i860<RedPacketEvent> PARSER;
        private String fanbaseId_ = "";

        public static final class Builder extends GeneratedMessageLite.b<RedPacketEvent, Builder> implements RedPacketEventOrBuilder {
            private Builder() {
                super(RedPacketEvent.DEFAULT_INSTANCE);
            }

            public Builder clearFanbaseId() {
                copyOnWrite();
                ((RedPacketEvent) ((GeneratedMessageLite.b) this).instance).clearFanbaseId();
                return this;
            }

            @Override // com.p1.mobile.longlink.msg.live_fanbase.LongLinkLiveFanbaseMessage.RedPacketEventOrBuilder
            public String getFanbaseId() {
                return ((RedPacketEvent) ((GeneratedMessageLite.b) this).instance).getFanbaseId();
            }

            @Override // com.p1.mobile.longlink.msg.live_fanbase.LongLinkLiveFanbaseMessage.RedPacketEventOrBuilder
            public ByteString getFanbaseIdBytes() {
                return ((RedPacketEvent) ((GeneratedMessageLite.b) this).instance).getFanbaseIdBytes();
            }

            public Builder setFanbaseId(String str) {
                copyOnWrite();
                ((RedPacketEvent) ((GeneratedMessageLite.b) this).instance).setFanbaseId(str);
                return this;
            }

            public Builder setFanbaseIdBytes(ByteString byteString) {
                copyOnWrite();
                ((RedPacketEvent) ((GeneratedMessageLite.b) this).instance).setFanbaseIdBytes(byteString);
                return this;
            }
        }

        static {
            RedPacketEvent redPacketEvent = new RedPacketEvent();
            DEFAULT_INSTANCE = redPacketEvent;
            redPacketEvent.makeImmutable();
        }

        private RedPacketEvent() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearFanbaseId() {
            this.fanbaseId_ = getDefaultInstance().getFanbaseId();
        }

        public static RedPacketEvent getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder(RedPacketEvent redPacketEvent) {
            return (Builder) ((Builder) DEFAULT_INSTANCE.toBuilder()).mergeFrom(redPacketEvent);
        }

        public static RedPacketEvent parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (RedPacketEvent) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static RedPacketEvent parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (RedPacketEvent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static i860<RedPacketEvent> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setFanbaseId(String str) {
            str.getClass();
            this.fanbaseId_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setFanbaseIdBytes(ByteString byteString) {
            byteString.getClass();
            a.checkByteStringIsUtf8(byteString);
            this.fanbaseId_ = byteString.toStringUtf8();
        }

        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (C03451.f1651xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new RedPacketEvent();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                    return null;
                case 4:
                    return new Builder();
                case 5:
                    RedPacketEvent redPacketEvent = (RedPacketEvent) obj2;
                    this.fanbaseId_ = ((GeneratedMessageLite.h) obj).f(!this.fanbaseId_.isEmpty(), this.fanbaseId_, true ^ redPacketEvent.fanbaseId_.isEmpty(), redPacketEvent.fanbaseId_);
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
                                    this.fanbaseId_ = eVar.L();
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
                        synchronized (RedPacketEvent.class) {
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

        @Override // com.p1.mobile.longlink.msg.live_fanbase.LongLinkLiveFanbaseMessage.RedPacketEventOrBuilder
        public String getFanbaseId() {
            return this.fanbaseId_;
        }

        @Override // com.p1.mobile.longlink.msg.live_fanbase.LongLinkLiveFanbaseMessage.RedPacketEventOrBuilder
        public ByteString getFanbaseIdBytes() {
            return ByteString.copyFromUtf8(this.fanbaseId_);
        }

        public int getSerializedSize() {
            int i = ((GeneratedMessageLite) this).memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int iK = !this.fanbaseId_.isEmpty() ? CodedOutputStream.K(1, getFanbaseId()) : 0;
            ((GeneratedMessageLite) this).memoizedSerializedSize = iK;
            return iK;
        }

        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (this.fanbaseId_.isEmpty()) {
                return;
            }
            codedOutputStream.D0(1, getFanbaseId());
        }

        public static RedPacketEvent parseDelimitedFrom(InputStream inputStream, h hVar) throws IOException {
            return (RedPacketEvent) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, hVar);
        }

        public static RedPacketEvent parseFrom(ByteString byteString, h hVar) throws InvalidProtocolBufferException {
            return (RedPacketEvent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, hVar);
        }

        public static RedPacketEvent parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (RedPacketEvent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static RedPacketEvent parseFrom(byte[] bArr, h hVar) throws InvalidProtocolBufferException {
            return (RedPacketEvent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, hVar);
        }

        public static RedPacketEvent parseFrom(InputStream inputStream) throws IOException {
            return (RedPacketEvent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static RedPacketEvent parseFrom(InputStream inputStream, h hVar) throws IOException {
            return (RedPacketEvent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, hVar);
        }

        public static RedPacketEvent parseFrom(e eVar) throws IOException {
            return (RedPacketEvent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, eVar);
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.toBuilder();
        }

        public static RedPacketEvent parseFrom(e eVar, h hVar) throws IOException {
            return (RedPacketEvent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, eVar, hVar);
        }
    }
}
