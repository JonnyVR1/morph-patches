package com.p046p1.mobile.longlink.msg.connector;

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
public final class LongLinkLiveMutiDeviceMessage {

    /* JADX INFO: renamed from: com.p1.mobile.longlink.msg.connector.LongLinkLiveMutiDeviceMessage$1 */
    public static /* synthetic */ class C44021 {

        /* JADX INFO: renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f15934xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f15934xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f15934xa1df5c61[GeneratedMessageLite.MethodToInvoke.IS_INITIALIZED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f15934xa1df5c61[GeneratedMessageLite.MethodToInvoke.MAKE_IMMUTABLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f15934xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f15934xa1df5c61[GeneratedMessageLite.MethodToInvoke.VISIT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f15934xa1df5c61[GeneratedMessageLite.MethodToInvoke.MERGE_FROM_STREAM.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f15934xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f15934xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    public interface MultiDeviceOrBuilder extends o6z {
        @Override // p149l.o6z
        /* synthetic */ InterfaceC3419q getDefaultInstanceForType();

        ByteString getMsg();

        @Override // p149l.o6z
        /* synthetic */ boolean isInitialized();
    }

    private LongLinkLiveMutiDeviceMessage() {
    }

    public static void registerAllExtensions(C3410h c3410h) {
    }

    public static final class MultiDevice extends GeneratedMessageLite<MultiDevice, Builder> implements MultiDeviceOrBuilder {
        private static final MultiDevice DEFAULT_INSTANCE;
        public static final int MSG_FIELD_NUMBER = 1;
        private static volatile i860<MultiDevice> PARSER;
        private ByteString msg_ = ByteString.EMPTY;

        public static final class Builder extends GeneratedMessageLite.AbstractC3380b<MultiDevice, Builder> implements MultiDeviceOrBuilder {
            private Builder() {
                super(MultiDevice.DEFAULT_INSTANCE);
            }

            public Builder clearMsg() {
                copyOnWrite();
                ((MultiDevice) this.instance).clearMsg();
                return this;
            }

            @Override // com.p1.mobile.longlink.msg.connector.LongLinkLiveMutiDeviceMessage.MultiDeviceOrBuilder
            public ByteString getMsg() {
                return ((MultiDevice) this.instance).getMsg();
            }

            public Builder setMsg(ByteString byteString) {
                copyOnWrite();
                ((MultiDevice) this.instance).setMsg(byteString);
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
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(multiDevice);
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

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            boolean z = false;
            switch (C44021.f15934xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new MultiDevice();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                    return null;
                case 4:
                    return new Builder();
                case 5:
                    GeneratedMessageLite.InterfaceC3386h interfaceC3386h = (GeneratedMessageLite.InterfaceC3386h) obj;
                    MultiDevice multiDevice = (MultiDevice) obj2;
                    ByteString byteString = this.msg_;
                    ByteString byteString2 = ByteString.EMPTY;
                    boolean z2 = byteString != byteString2;
                    ByteString byteString3 = multiDevice.msg_;
                    this.msg_ = interfaceC3386h.mo16999h(z2, byteString, byteString3 != byteString2, byteString3);
                    GeneratedMessageLite.C3385g c3385g = GeneratedMessageLite.C3385g.INSTANCE;
                    return this;
                case 6:
                    C3407e c3407e = (C3407e) obj;
                    while (!z) {
                        try {
                            int iM17116M = c3407e.m17116M();
                            if (iM17116M != 0) {
                                if (iM17116M == 10) {
                                    this.msg_ = c3407e.m17134n();
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
                        synchronized (MultiDevice.class) {
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

        @Override // com.p1.mobile.longlink.msg.connector.LongLinkLiveMutiDeviceMessage.MultiDeviceOrBuilder
        public ByteString getMsg() {
            return this.msg_;
        }

        @Override // com.google.protobuf.InterfaceC3419q
        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int iM16918i = !this.msg_.isEmpty() ? CodedOutputStream.m16918i(1, this.msg_) : 0;
            this.memoizedSerializedSize = iM16918i;
            return iM16918i;
        }

        @Override // com.google.protobuf.InterfaceC3419q
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (this.msg_.isEmpty()) {
                return;
            }
            codedOutputStream.mo16956e0(1, this.msg_);
        }

        public static MultiDevice parseDelimitedFrom(InputStream inputStream, C3410h c3410h) throws IOException {
            return (MultiDevice) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, c3410h);
        }

        public static MultiDevice parseFrom(ByteString byteString, C3410h c3410h) throws InvalidProtocolBufferException {
            return (MultiDevice) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, c3410h);
        }

        public static MultiDevice parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (MultiDevice) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static MultiDevice parseFrom(byte[] bArr, C3410h c3410h) throws InvalidProtocolBufferException {
            return (MultiDevice) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, c3410h);
        }

        public static MultiDevice parseFrom(InputStream inputStream) throws IOException {
            return (MultiDevice) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static MultiDevice parseFrom(InputStream inputStream, C3410h c3410h) throws IOException {
            return (MultiDevice) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, c3410h);
        }

        public static MultiDevice parseFrom(C3407e c3407e) throws IOException {
            return (MultiDevice) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, c3407e);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static MultiDevice parseFrom(C3407e c3407e, C3410h c3410h) throws IOException {
            return (MultiDevice) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, c3407e, c3410h);
        }
    }
}
