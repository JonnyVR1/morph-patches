package com.p051p1.mobile.longlink.msg.connector;

import com.google.protobuf.ByteString;
import com.google.protobuf.C3430e;
import com.google.protobuf.C3433h;
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
public final class LongLinkLiveMutiDeviceMessage {

    /* JADX INFO: renamed from: com.p1.mobile.longlink.msg.connector.LongLinkLiveMutiDeviceMessage$1 */
    public static /* synthetic */ class C45531 {

        /* JADX INFO: renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f16653xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f16653xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f16653xa1df5c61[GeneratedMessageLite.MethodToInvoke.IS_INITIALIZED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f16653xa1df5c61[GeneratedMessageLite.MethodToInvoke.MAKE_IMMUTABLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f16653xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f16653xa1df5c61[GeneratedMessageLite.MethodToInvoke.VISIT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f16653xa1df5c61[GeneratedMessageLite.MethodToInvoke.MERGE_FROM_STREAM.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f16653xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f16653xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    public interface MultiDeviceOrBuilder extends lfz {
        @Override // p153l.lfz
        /* synthetic */ InterfaceC3442q getDefaultInstanceForType();

        ByteString getMsg();

        @Override // p153l.lfz
        /* synthetic */ boolean isInitialized();
    }

    private LongLinkLiveMutiDeviceMessage() {
    }

    public static void registerAllExtensions(C3433h c3433h) {
    }

    public static final class MultiDevice extends GeneratedMessageLite<MultiDevice, Builder> implements MultiDeviceOrBuilder {
        private static final MultiDevice DEFAULT_INSTANCE;
        public static final int MSG_FIELD_NUMBER = 1;
        private static volatile ng60<MultiDevice> PARSER;
        private ByteString msg_ = ByteString.EMPTY;

        public static final class Builder extends GeneratedMessageLite.AbstractC3403b<MultiDevice, Builder> implements MultiDeviceOrBuilder {
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

        public static ng60<MultiDevice> parser() {
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
            switch (C45531.f16653xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new MultiDevice();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                    return null;
                case 4:
                    return new Builder();
                case 5:
                    GeneratedMessageLite.InterfaceC3409h interfaceC3409h = (GeneratedMessageLite.InterfaceC3409h) obj;
                    MultiDevice multiDevice = (MultiDevice) obj2;
                    ByteString byteString = this.msg_;
                    ByteString byteString2 = ByteString.EMPTY;
                    boolean z2 = byteString != byteString2;
                    ByteString byteString3 = multiDevice.msg_;
                    this.msg_ = interfaceC3409h.mo17054h(z2, byteString, byteString3 != byteString2, byteString3);
                    GeneratedMessageLite.C3408g c3408g = GeneratedMessageLite.C3408g.INSTANCE;
                    return this;
                case 6:
                    C3430e c3430e = (C3430e) obj;
                    while (!z) {
                        try {
                            int iM17171M = c3430e.m17171M();
                            if (iM17171M != 0) {
                                if (iM17171M == 10) {
                                    this.msg_ = c3430e.m17189n();
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
                        synchronized (MultiDevice.class) {
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

        @Override // com.p1.mobile.longlink.msg.connector.LongLinkLiveMutiDeviceMessage.MultiDeviceOrBuilder
        public ByteString getMsg() {
            return this.msg_;
        }

        @Override // com.google.protobuf.InterfaceC3442q
        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int iM16973i = !this.msg_.isEmpty() ? CodedOutputStream.m16973i(1, this.msg_) : 0;
            this.memoizedSerializedSize = iM16973i;
            return iM16973i;
        }

        @Override // com.google.protobuf.InterfaceC3442q
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (this.msg_.isEmpty()) {
                return;
            }
            codedOutputStream.mo17011e0(1, this.msg_);
        }

        public static MultiDevice parseDelimitedFrom(InputStream inputStream, C3433h c3433h) throws IOException {
            return (MultiDevice) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, c3433h);
        }

        public static MultiDevice parseFrom(ByteString byteString, C3433h c3433h) throws InvalidProtocolBufferException {
            return (MultiDevice) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, c3433h);
        }

        public static MultiDevice parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (MultiDevice) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static MultiDevice parseFrom(byte[] bArr, C3433h c3433h) throws InvalidProtocolBufferException {
            return (MultiDevice) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, c3433h);
        }

        public static MultiDevice parseFrom(InputStream inputStream) throws IOException {
            return (MultiDevice) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static MultiDevice parseFrom(InputStream inputStream, C3433h c3433h) throws IOException {
            return (MultiDevice) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, c3433h);
        }

        public static MultiDevice parseFrom(C3430e c3430e) throws IOException {
            return (MultiDevice) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, c3430e);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static MultiDevice parseFrom(C3430e c3430e, C3433h c3433h) throws IOException {
            return (MultiDevice) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, c3430e, c3433h);
        }
    }
}
