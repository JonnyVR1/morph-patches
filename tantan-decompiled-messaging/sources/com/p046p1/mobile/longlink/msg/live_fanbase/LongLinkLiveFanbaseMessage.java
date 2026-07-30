package com.p046p1.mobile.longlink.msg.live_fanbase;

import com.google.protobuf.AbstractC3403a;
import com.google.protobuf.ByteString;
import com.google.protobuf.C3407e;
import com.google.protobuf.C3410h;
import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InterfaceC3419q;
import com.google.protobuf.InvalidProtocolBufferException;
import java.io.IOException;
import java.io.InputStream;
import p149l.aag0;
import p149l.bz00;
import p149l.i860;
import p149l.o6z;

/* JADX INFO: loaded from: classes8.dex */
public final class LongLinkLiveFanbaseMessage {

    /* JADX INFO: renamed from: com.p1.mobile.longlink.msg.live_fanbase.LongLinkLiveFanbaseMessage$1 */
    public static /* synthetic */ class C44331 {

        /* JADX INFO: renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f15952xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f15952xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f15952xa1df5c61[GeneratedMessageLite.MethodToInvoke.IS_INITIALIZED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f15952xa1df5c61[GeneratedMessageLite.MethodToInvoke.MAKE_IMMUTABLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f15952xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f15952xa1df5c61[GeneratedMessageLite.MethodToInvoke.VISIT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f15952xa1df5c61[GeneratedMessageLite.MethodToInvoke.MERGE_FROM_STREAM.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f15952xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f15952xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    public interface RedPacketEventOrBuilder extends o6z {
        @Override // p149l.o6z
        /* synthetic */ InterfaceC3419q getDefaultInstanceForType();

        String getFanbaseId();

        ByteString getFanbaseIdBytes();

        @Override // p149l.o6z
        /* synthetic */ boolean isInitialized();
    }

    private LongLinkLiveFanbaseMessage() {
    }

    public static void registerAllExtensions(C3410h c3410h) {
    }

    public static final class RedPacketEvent extends GeneratedMessageLite<RedPacketEvent, Builder> implements RedPacketEventOrBuilder {
        private static final RedPacketEvent DEFAULT_INSTANCE;
        public static final int FANBASEID_FIELD_NUMBER = 1;
        private static volatile i860<RedPacketEvent> PARSER;
        private String fanbaseId_ = "";

        public static final class Builder extends GeneratedMessageLite.AbstractC3380b<RedPacketEvent, Builder> implements RedPacketEventOrBuilder {
            private Builder() {
                super(RedPacketEvent.DEFAULT_INSTANCE);
            }

            public Builder clearFanbaseId() {
                copyOnWrite();
                ((RedPacketEvent) this.instance).clearFanbaseId();
                return this;
            }

            @Override // com.p1.mobile.longlink.msg.live_fanbase.LongLinkLiveFanbaseMessage.RedPacketEventOrBuilder
            public String getFanbaseId() {
                return ((RedPacketEvent) this.instance).getFanbaseId();
            }

            @Override // com.p1.mobile.longlink.msg.live_fanbase.LongLinkLiveFanbaseMessage.RedPacketEventOrBuilder
            public ByteString getFanbaseIdBytes() {
                return ((RedPacketEvent) this.instance).getFanbaseIdBytes();
            }

            public Builder setFanbaseId(String str) {
                copyOnWrite();
                ((RedPacketEvent) this.instance).setFanbaseId(str);
                return this;
            }

            public Builder setFanbaseIdBytes(ByteString byteString) {
                copyOnWrite();
                ((RedPacketEvent) this.instance).setFanbaseIdBytes(byteString);
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
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(redPacketEvent);
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
            AbstractC3403a.checkByteStringIsUtf8(byteString);
            this.fanbaseId_ = byteString.toStringUtf8();
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (C44331.f15952xa1df5c61[methodToInvoke.ordinal()]) {
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
                    this.fanbaseId_ = ((GeneratedMessageLite.InterfaceC3386h) obj).mo16997f(!this.fanbaseId_.isEmpty(), this.fanbaseId_, true ^ redPacketEvent.fanbaseId_.isEmpty(), redPacketEvent.fanbaseId_);
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
                                    this.fanbaseId_ = c3407e.m17115L();
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
                        synchronized (RedPacketEvent.class) {
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

        @Override // com.p1.mobile.longlink.msg.live_fanbase.LongLinkLiveFanbaseMessage.RedPacketEventOrBuilder
        public String getFanbaseId() {
            return this.fanbaseId_;
        }

        @Override // com.p1.mobile.longlink.msg.live_fanbase.LongLinkLiveFanbaseMessage.RedPacketEventOrBuilder
        public ByteString getFanbaseIdBytes() {
            return ByteString.copyFromUtf8(this.fanbaseId_);
        }

        @Override // com.google.protobuf.InterfaceC3419q
        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int iM16901K = !this.fanbaseId_.isEmpty() ? CodedOutputStream.m16901K(1, getFanbaseId()) : 0;
            this.memoizedSerializedSize = iM16901K;
            return iM16901K;
        }

        @Override // com.google.protobuf.InterfaceC3419q
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (this.fanbaseId_.isEmpty()) {
                return;
            }
            codedOutputStream.mo16939D0(1, getFanbaseId());
        }

        public static RedPacketEvent parseDelimitedFrom(InputStream inputStream, C3410h c3410h) throws IOException {
            return (RedPacketEvent) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, c3410h);
        }

        public static RedPacketEvent parseFrom(ByteString byteString, C3410h c3410h) throws InvalidProtocolBufferException {
            return (RedPacketEvent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, c3410h);
        }

        public static RedPacketEvent parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (RedPacketEvent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static RedPacketEvent parseFrom(byte[] bArr, C3410h c3410h) throws InvalidProtocolBufferException {
            return (RedPacketEvent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, c3410h);
        }

        public static RedPacketEvent parseFrom(InputStream inputStream) throws IOException {
            return (RedPacketEvent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static RedPacketEvent parseFrom(InputStream inputStream, C3410h c3410h) throws IOException {
            return (RedPacketEvent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, c3410h);
        }

        public static RedPacketEvent parseFrom(C3407e c3407e) throws IOException {
            return (RedPacketEvent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, c3407e);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static RedPacketEvent parseFrom(C3407e c3407e, C3410h c3410h) throws IOException {
            return (RedPacketEvent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, c3407e, c3410h);
        }
    }
}
