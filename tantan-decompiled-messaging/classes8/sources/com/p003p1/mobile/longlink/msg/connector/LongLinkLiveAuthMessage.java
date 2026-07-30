package com.p003p1.mobile.longlink.msg.connector;

import com.google.protobuf.ByteString;
import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
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
public final class LongLinkLiveAuthMessage {

    /* JADX INFO: renamed from: com.p1.mobile.longlink.msg.connector.LongLinkLiveAuthMessage$1 */
    public static /* synthetic */ class C03111 {

        /* JADX INFO: renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f1631xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f1631xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f1631xa1df5c61[GeneratedMessageLite.MethodToInvoke.IS_INITIALIZED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f1631xa1df5c61[GeneratedMessageLite.MethodToInvoke.MAKE_IMMUTABLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f1631xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f1631xa1df5c61[GeneratedMessageLite.MethodToInvoke.VISIT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f1631xa1df5c61[GeneratedMessageLite.MethodToInvoke.MERGE_FROM_STREAM.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f1631xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f1631xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    public interface AckOrBuilder extends o6z {
        AckCode getCode();

        int getCodeValue();

        /* synthetic */ q getDefaultInstanceForType();

        /* synthetic */ boolean isInitialized();
    }

    private LongLinkLiveAuthMessage() {
    }

    public static void registerAllExtensions(h hVar) {
    }

    public static final class Ack extends GeneratedMessageLite<Ack, Builder> implements AckOrBuilder {
        public static final int CODE_FIELD_NUMBER = 1;
        private static final Ack DEFAULT_INSTANCE;
        private static volatile i860<Ack> PARSER;
        private int code_;

        public static final class Builder extends GeneratedMessageLite.b<Ack, Builder> implements AckOrBuilder {
            private Builder() {
                super(Ack.DEFAULT_INSTANCE);
            }

            public Builder clearCode() {
                copyOnWrite();
                ((Ack) ((GeneratedMessageLite.b) this).instance).clearCode();
                return this;
            }

            @Override // com.p1.mobile.longlink.msg.connector.LongLinkLiveAuthMessage.AckOrBuilder
            public AckCode getCode() {
                return ((Ack) ((GeneratedMessageLite.b) this).instance).getCode();
            }

            @Override // com.p1.mobile.longlink.msg.connector.LongLinkLiveAuthMessage.AckOrBuilder
            public int getCodeValue() {
                return ((Ack) ((GeneratedMessageLite.b) this).instance).getCodeValue();
            }

            public Builder setCode(AckCode ackCode) {
                copyOnWrite();
                ((Ack) ((GeneratedMessageLite.b) this).instance).setCode(ackCode);
                return this;
            }

            public Builder setCodeValue(int i) {
                copyOnWrite();
                ((Ack) ((GeneratedMessageLite.b) this).instance).setCodeValue(i);
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
            return (Builder) ((Builder) DEFAULT_INSTANCE.toBuilder()).mergeFrom(ack);
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
        public void setCode(AckCode ackCode) {
            ackCode.getClass();
            this.code_ = ackCode.getNumber();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setCodeValue(int i) {
            this.code_ = i;
        }

        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            boolean z = false;
            switch (C03111.f1631xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new Ack();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                    return null;
                case 4:
                    return new Builder();
                case 5:
                    GeneratedMessageLite.h hVar = (GeneratedMessageLite.h) obj;
                    Ack ack = (Ack) obj2;
                    int i = this.code_;
                    boolean z2 = i != 0;
                    int i2 = ack.code_;
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
                        synchronized (Ack.class) {
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

        @Override // com.p1.mobile.longlink.msg.connector.LongLinkLiveAuthMessage.AckOrBuilder
        public AckCode getCode() {
            AckCode ackCodeForNumber = AckCode.forNumber(this.code_);
            return ackCodeForNumber == null ? AckCode.UNRECOGNIZED : ackCodeForNumber;
        }

        @Override // com.p1.mobile.longlink.msg.connector.LongLinkLiveAuthMessage.AckOrBuilder
        public int getCodeValue() {
            return this.code_;
        }

        public int getSerializedSize() {
            int i = ((GeneratedMessageLite) this).memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int iM = this.code_ != AckCode.LIVE_ROOM_MSG_FAIL.getNumber() ? CodedOutputStream.m(1, this.code_) : 0;
            ((GeneratedMessageLite) this).memoizedSerializedSize = iM;
            return iM;
        }

        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (this.code_ != AckCode.LIVE_ROOM_MSG_FAIL.getNumber()) {
                codedOutputStream.i0(1, this.code_);
            }
        }

        public static Ack parseDelimitedFrom(InputStream inputStream, h hVar) throws IOException {
            return (Ack) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, hVar);
        }

        public static Ack parseFrom(ByteString byteString, h hVar) throws InvalidProtocolBufferException {
            return (Ack) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, hVar);
        }

        public static Ack parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (Ack) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static Ack parseFrom(byte[] bArr, h hVar) throws InvalidProtocolBufferException {
            return (Ack) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, hVar);
        }

        public static Ack parseFrom(InputStream inputStream) throws IOException {
            return (Ack) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Ack parseFrom(InputStream inputStream, h hVar) throws IOException {
            return (Ack) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, hVar);
        }

        public static Ack parseFrom(e eVar) throws IOException {
            return (Ack) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, eVar);
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.toBuilder();
        }

        public static Ack parseFrom(e eVar, h hVar) throws IOException {
            return (Ack) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, eVar, hVar);
        }
    }

    public enum AckCode implements l.c {
        LIVE_ROOM_MSG_FAIL(0),
        LIVE_ROOM_NOT_EXIST(1),
        UNRECOGNIZED(-1);

        public static final int LIVE_ROOM_MSG_FAIL_VALUE = 0;
        public static final int LIVE_ROOM_NOT_EXIST_VALUE = 1;
        private static final l.d<AckCode> internalValueMap = new l.d<AckCode>() { // from class: com.p1.mobile.longlink.msg.connector.LongLinkLiveAuthMessage.AckCode.1
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

        public static l.d<AckCode> internalGetValueMap() {
            return internalValueMap;
        }

        public final int getNumber() {
            return this.value;
        }

        @Deprecated
        public static AckCode valueOf(int i) {
            return forNumber(i);
        }
    }
}
