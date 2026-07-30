package com.p046p1.mobile.longlink.msg.intlluckygift;

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
public final class LongLinkIntlLuckyGiftMessage {

    /* JADX INFO: renamed from: com.p1.mobile.longlink.msg.intlluckygift.LongLinkIntlLuckyGiftMessage$1 */
    public static /* synthetic */ class C44211 {

        /* JADX INFO: renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f15944xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f15944xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f15944xa1df5c61[GeneratedMessageLite.MethodToInvoke.IS_INITIALIZED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f15944xa1df5c61[GeneratedMessageLite.MethodToInvoke.MAKE_IMMUTABLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f15944xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f15944xa1df5c61[GeneratedMessageLite.MethodToInvoke.VISIT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f15944xa1df5c61[GeneratedMessageLite.MethodToInvoke.MERGE_FROM_STREAM.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f15944xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f15944xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    public interface IntlLuckyGiftTrayOrBuilder extends o6z {
        String getComboId();

        ByteString getComboIdBytes();

        @Override // p149l.o6z
        /* synthetic */ InterfaceC3419q getDefaultInstanceForType();

        String getDiamond();

        ByteString getDiamondBytes();

        String getReward();

        ByteString getRewardBytes();

        @Override // p149l.o6z
        /* synthetic */ boolean isInitialized();
    }

    private LongLinkIntlLuckyGiftMessage() {
    }

    public static void registerAllExtensions(C3410h c3410h) {
    }

    public static final class IntlLuckyGiftTray extends GeneratedMessageLite<IntlLuckyGiftTray, Builder> implements IntlLuckyGiftTrayOrBuilder {
        public static final int COMBOID_FIELD_NUMBER = 1;
        private static final IntlLuckyGiftTray DEFAULT_INSTANCE;
        public static final int DIAMOND_FIELD_NUMBER = 2;
        private static volatile i860<IntlLuckyGiftTray> PARSER = null;
        public static final int REWARD_FIELD_NUMBER = 3;
        private String comboId_ = "";
        private String diamond_ = "";
        private String reward_ = "";

        public static final class Builder extends GeneratedMessageLite.AbstractC3380b<IntlLuckyGiftTray, Builder> implements IntlLuckyGiftTrayOrBuilder {
            private Builder() {
                super(IntlLuckyGiftTray.DEFAULT_INSTANCE);
            }

            public Builder clearComboId() {
                copyOnWrite();
                ((IntlLuckyGiftTray) this.instance).clearComboId();
                return this;
            }

            public Builder clearDiamond() {
                copyOnWrite();
                ((IntlLuckyGiftTray) this.instance).clearDiamond();
                return this;
            }

            public Builder clearReward() {
                copyOnWrite();
                ((IntlLuckyGiftTray) this.instance).clearReward();
                return this;
            }

            @Override // com.p1.mobile.longlink.msg.intlluckygift.LongLinkIntlLuckyGiftMessage.IntlLuckyGiftTrayOrBuilder
            public String getComboId() {
                return ((IntlLuckyGiftTray) this.instance).getComboId();
            }

            @Override // com.p1.mobile.longlink.msg.intlluckygift.LongLinkIntlLuckyGiftMessage.IntlLuckyGiftTrayOrBuilder
            public ByteString getComboIdBytes() {
                return ((IntlLuckyGiftTray) this.instance).getComboIdBytes();
            }

            @Override // com.p1.mobile.longlink.msg.intlluckygift.LongLinkIntlLuckyGiftMessage.IntlLuckyGiftTrayOrBuilder
            public String getDiamond() {
                return ((IntlLuckyGiftTray) this.instance).getDiamond();
            }

            @Override // com.p1.mobile.longlink.msg.intlluckygift.LongLinkIntlLuckyGiftMessage.IntlLuckyGiftTrayOrBuilder
            public ByteString getDiamondBytes() {
                return ((IntlLuckyGiftTray) this.instance).getDiamondBytes();
            }

            @Override // com.p1.mobile.longlink.msg.intlluckygift.LongLinkIntlLuckyGiftMessage.IntlLuckyGiftTrayOrBuilder
            public String getReward() {
                return ((IntlLuckyGiftTray) this.instance).getReward();
            }

            @Override // com.p1.mobile.longlink.msg.intlluckygift.LongLinkIntlLuckyGiftMessage.IntlLuckyGiftTrayOrBuilder
            public ByteString getRewardBytes() {
                return ((IntlLuckyGiftTray) this.instance).getRewardBytes();
            }

            public Builder setComboId(String str) {
                copyOnWrite();
                ((IntlLuckyGiftTray) this.instance).setComboId(str);
                return this;
            }

            public Builder setComboIdBytes(ByteString byteString) {
                copyOnWrite();
                ((IntlLuckyGiftTray) this.instance).setComboIdBytes(byteString);
                return this;
            }

            public Builder setDiamond(String str) {
                copyOnWrite();
                ((IntlLuckyGiftTray) this.instance).setDiamond(str);
                return this;
            }

            public Builder setDiamondBytes(ByteString byteString) {
                copyOnWrite();
                ((IntlLuckyGiftTray) this.instance).setDiamondBytes(byteString);
                return this;
            }

            public Builder setReward(String str) {
                copyOnWrite();
                ((IntlLuckyGiftTray) this.instance).setReward(str);
                return this;
            }

            public Builder setRewardBytes(ByteString byteString) {
                copyOnWrite();
                ((IntlLuckyGiftTray) this.instance).setRewardBytes(byteString);
                return this;
            }
        }

        static {
            IntlLuckyGiftTray intlLuckyGiftTray = new IntlLuckyGiftTray();
            DEFAULT_INSTANCE = intlLuckyGiftTray;
            intlLuckyGiftTray.makeImmutable();
        }

        private IntlLuckyGiftTray() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearComboId() {
            this.comboId_ = getDefaultInstance().getComboId();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearDiamond() {
            this.diamond_ = getDefaultInstance().getDiamond();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearReward() {
            this.reward_ = getDefaultInstance().getReward();
        }

        public static IntlLuckyGiftTray getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder(IntlLuckyGiftTray intlLuckyGiftTray) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(intlLuckyGiftTray);
        }

        public static IntlLuckyGiftTray parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (IntlLuckyGiftTray) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static IntlLuckyGiftTray parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (IntlLuckyGiftTray) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static i860<IntlLuckyGiftTray> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setComboId(String str) {
            str.getClass();
            this.comboId_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setComboIdBytes(ByteString byteString) {
            byteString.getClass();
            AbstractC3403a.checkByteStringIsUtf8(byteString);
            this.comboId_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setDiamond(String str) {
            str.getClass();
            this.diamond_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setDiamondBytes(ByteString byteString) {
            byteString.getClass();
            AbstractC3403a.checkByteStringIsUtf8(byteString);
            this.diamond_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setReward(String str) {
            str.getClass();
            this.reward_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setRewardBytes(ByteString byteString) {
            byteString.getClass();
            AbstractC3403a.checkByteStringIsUtf8(byteString);
            this.reward_ = byteString.toStringUtf8();
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (C44211.f15944xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new IntlLuckyGiftTray();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                    return null;
                case 4:
                    return new Builder();
                case 5:
                    GeneratedMessageLite.InterfaceC3386h interfaceC3386h = (GeneratedMessageLite.InterfaceC3386h) obj;
                    IntlLuckyGiftTray intlLuckyGiftTray = (IntlLuckyGiftTray) obj2;
                    this.comboId_ = interfaceC3386h.mo16997f(!this.comboId_.isEmpty(), this.comboId_, !intlLuckyGiftTray.comboId_.isEmpty(), intlLuckyGiftTray.comboId_);
                    this.diamond_ = interfaceC3386h.mo16997f(!this.diamond_.isEmpty(), this.diamond_, !intlLuckyGiftTray.diamond_.isEmpty(), intlLuckyGiftTray.diamond_);
                    this.reward_ = interfaceC3386h.mo16997f(!this.reward_.isEmpty(), this.reward_, true ^ intlLuckyGiftTray.reward_.isEmpty(), intlLuckyGiftTray.reward_);
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
                                    this.comboId_ = c3407e.m17115L();
                                } else if (iM17116M == 18) {
                                    this.diamond_ = c3407e.m17115L();
                                } else if (iM17116M == 26) {
                                    this.reward_ = c3407e.m17115L();
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
                        synchronized (IntlLuckyGiftTray.class) {
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

        @Override // com.p1.mobile.longlink.msg.intlluckygift.LongLinkIntlLuckyGiftMessage.IntlLuckyGiftTrayOrBuilder
        public String getComboId() {
            return this.comboId_;
        }

        @Override // com.p1.mobile.longlink.msg.intlluckygift.LongLinkIntlLuckyGiftMessage.IntlLuckyGiftTrayOrBuilder
        public ByteString getComboIdBytes() {
            return ByteString.copyFromUtf8(this.comboId_);
        }

        @Override // com.p1.mobile.longlink.msg.intlluckygift.LongLinkIntlLuckyGiftMessage.IntlLuckyGiftTrayOrBuilder
        public String getDiamond() {
            return this.diamond_;
        }

        @Override // com.p1.mobile.longlink.msg.intlluckygift.LongLinkIntlLuckyGiftMessage.IntlLuckyGiftTrayOrBuilder
        public ByteString getDiamondBytes() {
            return ByteString.copyFromUtf8(this.diamond_);
        }

        @Override // com.p1.mobile.longlink.msg.intlluckygift.LongLinkIntlLuckyGiftMessage.IntlLuckyGiftTrayOrBuilder
        public String getReward() {
            return this.reward_;
        }

        @Override // com.p1.mobile.longlink.msg.intlluckygift.LongLinkIntlLuckyGiftMessage.IntlLuckyGiftTrayOrBuilder
        public ByteString getRewardBytes() {
            return ByteString.copyFromUtf8(this.reward_);
        }

        @Override // com.google.protobuf.InterfaceC3419q
        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int iM16901K = !this.comboId_.isEmpty() ? CodedOutputStream.m16901K(1, getComboId()) : 0;
            if (!this.diamond_.isEmpty()) {
                iM16901K += CodedOutputStream.m16901K(2, getDiamond());
            }
            if (!this.reward_.isEmpty()) {
                iM16901K += CodedOutputStream.m16901K(3, getReward());
            }
            this.memoizedSerializedSize = iM16901K;
            return iM16901K;
        }

        @Override // com.google.protobuf.InterfaceC3419q
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (!this.comboId_.isEmpty()) {
                codedOutputStream.mo16939D0(1, getComboId());
            }
            if (!this.diamond_.isEmpty()) {
                codedOutputStream.mo16939D0(2, getDiamond());
            }
            if (this.reward_.isEmpty()) {
                return;
            }
            codedOutputStream.mo16939D0(3, getReward());
        }

        public static IntlLuckyGiftTray parseDelimitedFrom(InputStream inputStream, C3410h c3410h) throws IOException {
            return (IntlLuckyGiftTray) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, c3410h);
        }

        public static IntlLuckyGiftTray parseFrom(ByteString byteString, C3410h c3410h) throws InvalidProtocolBufferException {
            return (IntlLuckyGiftTray) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, c3410h);
        }

        public static IntlLuckyGiftTray parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (IntlLuckyGiftTray) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static IntlLuckyGiftTray parseFrom(byte[] bArr, C3410h c3410h) throws InvalidProtocolBufferException {
            return (IntlLuckyGiftTray) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, c3410h);
        }

        public static IntlLuckyGiftTray parseFrom(InputStream inputStream) throws IOException {
            return (IntlLuckyGiftTray) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static IntlLuckyGiftTray parseFrom(InputStream inputStream, C3410h c3410h) throws IOException {
            return (IntlLuckyGiftTray) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, c3410h);
        }

        public static IntlLuckyGiftTray parseFrom(C3407e c3407e) throws IOException {
            return (IntlLuckyGiftTray) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, c3407e);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static IntlLuckyGiftTray parseFrom(C3407e c3407e, C3410h c3410h) throws IOException {
            return (IntlLuckyGiftTray) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, c3407e, c3410h);
        }
    }
}
