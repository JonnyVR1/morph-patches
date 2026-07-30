package com.p003p1.mobile.longlink.msg.connector;

import com.google.protobuf.ByteString;
import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
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
public final class LongLinkLiveMutiDeviceMessage {

    /* JADX INFO: renamed from: com.p1.mobile.longlink.msg.connector.LongLinkLiveMutiDeviceMessage$1 */
    public static /* synthetic */ class C03141 {

        /* JADX INFO: renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f1633xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f1633xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f1633xa1df5c61[GeneratedMessageLite.MethodToInvoke.IS_INITIALIZED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f1633xa1df5c61[GeneratedMessageLite.MethodToInvoke.MAKE_IMMUTABLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f1633xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f1633xa1df5c61[GeneratedMessageLite.MethodToInvoke.VISIT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f1633xa1df5c61[GeneratedMessageLite.MethodToInvoke.MERGE_FROM_STREAM.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f1633xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f1633xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    public interface MultiDeviceOrBuilder extends o6z {
        /* synthetic */ q getDefaultInstanceForType();

        ByteString getMsg();

        /* synthetic */ boolean isInitialized();
    }

    private LongLinkLiveMutiDeviceMessage() {
    }

    public static void registerAllExtensions(h hVar) {
    }

    public static final class MultiDevice extends GeneratedMessageLite<MultiDevice, Builder> implements MultiDeviceOrBuilder {
        private static final MultiDevice DEFAULT_INSTANCE;
        public static final int MSG_FIELD_NUMBER = 1;
        private static volatile i860<MultiDevice> PARSER;
        private ByteString msg_ = ByteString.EMPTY;

        public static final class Builder extends GeneratedMessageLite.b<MultiDevice, Builder> implements MultiDeviceOrBuilder {
            private Builder() {
                super(MultiDevice.DEFAULT_INSTANCE);
            }

            public Builder clearMsg() {
                copyOnWrite();
                ((MultiDevice) ((GeneratedMessageLite.b) this).instance).clearMsg();
                return this;
            }

            @Override // com.p1.mobile.longlink.msg.connector.LongLinkLiveMutiDeviceMessage.MultiDeviceOrBuilder
            public ByteString getMsg() {
                return ((MultiDevice) ((GeneratedMessageLite.b) this).instance).getMsg();
            }

            public Builder setMsg(ByteString byteString) {
                copyOnWrite();
                ((MultiDevice) ((GeneratedMessageLite.b) this).instance).setMsg(byteString);
                return this;
            }
        }

        static {
            MultiDevice multiDevice = new MultiDevice();
            DEFAULT_INSTANCE = multiDevice;
            multiDevice.makeImmutable();
        }

        private MultiDevice() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearMsg() {
            this.msg_ = getDefaultInstance().getMsg();
        }

        public static MultiDevice getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder(MultiDevice multiDevice) {
            return (Builder) ((Builder) DEFAULT_INSTANCE.toBuilder()).mergeFrom(multiDevice);
        }

        public static MultiDevice parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (MultiDevice) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static MultiDevice parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (MultiDevice) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static i860<MultiDevice> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setMsg(ByteString byteString) {
            byteString.getClass();
            this.msg_ = byteString;
        }

        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            boolean z = false;
            switch (C03141.f1633xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new MultiDevice();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                    return null;
                case 4:
                    return new Builder();
                case 5:
                    GeneratedMessageLite.h hVar = (GeneratedMessageLite.h) obj;
                    MultiDevice multiDevice = (MultiDevice) obj2;
                    ByteString byteString = this.msg_;
                    ByteString byteString2 = ByteString.EMPTY;
                    boolean z2 = byteString != byteString2;
                    ByteString byteString3 = multiDevice.msg_;
                    this.msg_ = hVar.h(z2, byteString, byteString3 != byteString2, byteString3);
                    GeneratedMessageLite.g gVar = GeneratedMessageLite.g.INSTANCE;
                    return this;
                case 6:
                    e eVar = (e) obj;
                    while (!z) {
                        try {
                            int iM = eVar.M();
                            if (iM != 0) {
                                if (iM == 10) {
                                    this.msg_ = eVar.n();
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
                        synchronized (MultiDevice.class) {
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

        @Override // com.p1.mobile.longlink.msg.connector.LongLinkLiveMutiDeviceMessage.MultiDeviceOrBuilder
        public ByteString getMsg() {
            return this.msg_;
        }

        public int getSerializedSize() {
            int i = ((GeneratedMessageLite) this).memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int i2 = !this.msg_.isEmpty() ? CodedOutputStream.i(1, this.msg_) : 0;
            ((GeneratedMessageLite) this).memoizedSerializedSize = i2;
            return i2;
        }

        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (this.msg_.isEmpty()) {
                return;
            }
            codedOutputStream.e0(1, this.msg_);
        }

        public static MultiDevice parseDelimitedFrom(InputStream inputStream, h hVar) throws IOException {
            return (MultiDevice) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, hVar);
        }

        public static MultiDevice parseFrom(ByteString byteString, h hVar) throws InvalidProtocolBufferException {
            return (MultiDevice) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, hVar);
        }

        public static MultiDevice parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (MultiDevice) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static MultiDevice parseFrom(byte[] bArr, h hVar) throws InvalidProtocolBufferException {
            return (MultiDevice) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, hVar);
        }

        public static MultiDevice parseFrom(InputStream inputStream) throws IOException {
            return (MultiDevice) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static MultiDevice parseFrom(InputStream inputStream, h hVar) throws IOException {
            return (MultiDevice) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, hVar);
        }

        public static MultiDevice parseFrom(e eVar) throws IOException {
            return (MultiDevice) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, eVar);
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.toBuilder();
        }

        public static MultiDevice parseFrom(e eVar, h hVar) throws IOException {
            return (MultiDevice) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, eVar, hVar);
        }
    }
}
