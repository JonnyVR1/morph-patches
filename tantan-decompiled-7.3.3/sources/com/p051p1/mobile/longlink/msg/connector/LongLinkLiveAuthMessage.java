package com.p051p1.mobile.longlink.msg.connector;

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
public final class LongLinkLiveAuthMessage {

    /* JADX INFO: renamed from: com.p1.mobile.longlink.msg.connector.LongLinkLiveAuthMessage$1 */
    public static /* synthetic */ class C45501 {

        /* JADX INFO: renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f16651xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f16651xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f16651xa1df5c61[GeneratedMessageLite.MethodToInvoke.IS_INITIALIZED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f16651xa1df5c61[GeneratedMessageLite.MethodToInvoke.MAKE_IMMUTABLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f16651xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f16651xa1df5c61[GeneratedMessageLite.MethodToInvoke.VISIT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f16651xa1df5c61[GeneratedMessageLite.MethodToInvoke.MERGE_FROM_STREAM.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f16651xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f16651xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    public interface AckOrBuilder extends lfz {
        AckCode getCode();

        int getCodeValue();

        @Override // p153l.lfz
        /* synthetic */ InterfaceC3442q getDefaultInstanceForType();

        @Override // p153l.lfz
        /* synthetic */ boolean isInitialized();
    }

    private LongLinkLiveAuthMessage() {
    }

    public static void registerAllExtensions(C3433h c3433h) {
    }

    public static final class Ack extends GeneratedMessageLite<Ack, Builder> implements AckOrBuilder {
        public static final int CODE_FIELD_NUMBER = 1;
        private static final Ack DEFAULT_INSTANCE;
        private static volatile ng60<Ack> PARSER;
        private int code_;

        public static final class Builder extends GeneratedMessageLite.AbstractC3403b<Ack, Builder> implements AckOrBuilder {
            private Builder() {
                super(Ack.DEFAULT_INSTANCE);
            }

            public Builder clearCode() {
                copyOnWrite();
                ((Ack) this.instance).clearCode();
                return this;
            }

            @Override // com.p1.mobile.longlink.msg.connector.LongLinkLiveAuthMessage.AckOrBuilder
            public AckCode getCode() {
                return ((Ack) this.instance).getCode();
            }

            @Override // com.p1.mobile.longlink.msg.connector.LongLinkLiveAuthMessage.AckOrBuilder
            public int getCodeValue() {
                return ((Ack) this.instance).getCodeValue();
            }

            public Builder setCode(AckCode ackCode) {
                copyOnWrite();
                ((Ack) this.instance).setCode(ackCode);
                return this;
            }

            public Builder setCodeValue(int i) {
                copyOnWrite();
                ((Ack) this.instance).setCodeValue(i);
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
        public void clearCode() {
            this.code_ = 0;
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

        public static ng60<Ack> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setCode(AckCode ackCode) {
            ackCode.getClass();
            this.code_ = ackCode.getNumber();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setCodeValue(int i) {
            this.code_ = i;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            boolean z = false;
            switch (C45501.f16651xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new Ack();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                    return null;
                case 4:
                    return new Builder();
                case 5:
                    GeneratedMessageLite.InterfaceC3409h interfaceC3409h = (GeneratedMessageLite.InterfaceC3409h) obj;
                    Ack ack = (Ack) obj2;
                    int i = this.code_;
                    boolean z2 = i != 0;
                    int i2 = ack.code_;
                    this.code_ = interfaceC3409h.mo17051e(z2, i, i2 != 0, i2);
                    GeneratedMessageLite.C3408g c3408g = GeneratedMessageLite.C3408g.INSTANCE;
                    return this;
                case 6:
                    C3430e c3430e = (C3430e) obj;
                    while (!z) {
                        try {
                            int iM17171M = c3430e.m17171M();
                            if (iM17171M != 0) {
                                if (iM17171M == 8) {
                                    this.code_ = c3430e.m17191p();
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
                        synchronized (Ack.class) {
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

        @Override // com.p1.mobile.longlink.msg.connector.LongLinkLiveAuthMessage.AckOrBuilder
        public AckCode getCode() {
            AckCode ackCodeForNumber = AckCode.forNumber(this.code_);
            return ackCodeForNumber == null ? AckCode.UNRECOGNIZED : ackCodeForNumber;
        }

        @Override // com.p1.mobile.longlink.msg.connector.LongLinkLiveAuthMessage.AckOrBuilder
        public int getCodeValue() {
            return this.code_;
        }

        @Override // com.google.protobuf.InterfaceC3442q
        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int iM16977m = this.code_ != AckCode.LIVE_ROOM_MSG_FAIL.getNumber() ? CodedOutputStream.m16977m(1, this.code_) : 0;
            this.memoizedSerializedSize = iM16977m;
            return iM16977m;
        }

        @Override // com.google.protobuf.InterfaceC3442q
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (this.code_ != AckCode.LIVE_ROOM_MSG_FAIL.getNumber()) {
                codedOutputStream.m17015i0(1, this.code_);
            }
        }

        public static Ack parseDelimitedFrom(InputStream inputStream, C3433h c3433h) throws IOException {
            return (Ack) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, c3433h);
        }

        public static Ack parseFrom(ByteString byteString, C3433h c3433h) throws InvalidProtocolBufferException {
            return (Ack) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, c3433h);
        }

        public static Ack parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (Ack) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static Ack parseFrom(byte[] bArr, C3433h c3433h) throws InvalidProtocolBufferException {
            return (Ack) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, c3433h);
        }

        public static Ack parseFrom(InputStream inputStream) throws IOException {
            return (Ack) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Ack parseFrom(InputStream inputStream, C3433h c3433h) throws IOException {
            return (Ack) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, c3433h);
        }

        public static Ack parseFrom(C3430e c3430e) throws IOException {
            return (Ack) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, c3430e);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static Ack parseFrom(C3430e c3430e, C3433h c3433h) throws IOException {
            return (Ack) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, c3430e, c3433h);
        }
    }

    public enum AckCode implements C3437l.c {
        LIVE_ROOM_MSG_FAIL(0),
        LIVE_ROOM_NOT_EXIST(1),
        UNRECOGNIZED(-1);

        public static final int LIVE_ROOM_MSG_FAIL_VALUE = 0;
        public static final int LIVE_ROOM_NOT_EXIST_VALUE = 1;
        private static final C3437l.d<AckCode> internalValueMap = new C3437l.d<AckCode>() { // from class: com.p1.mobile.longlink.msg.connector.LongLinkLiveAuthMessage.AckCode.1
            @Override // com.google.protobuf.C3437l.d
            public AckCode findValueByNumber(int i) {
                return AckCode.forNumber(i);
            }
        };
        private final int value;

        AckCode(int i) {
            this.value = i;
        }

        public static AckCode forNumber(int i) {
            if (i == 0) {
                return LIVE_ROOM_MSG_FAIL;
            }
            if (i != 1) {
                return null;
            }
            return LIVE_ROOM_NOT_EXIST;
        }

        public static C3437l.d<AckCode> internalGetValueMap() {
            return internalValueMap;
        }

        @Override // com.google.protobuf.C3437l.c
        public final int getNumber() {
            return this.value;
        }

        @Deprecated
        public static AckCode valueOf(int i) {
            return forNumber(i);
        }
    }
}
