package com.p003p1.mobile.longlink.msg.intlluckygift;

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
public final class LongLinkIntlLuckyGiftMessage {

    /* JADX INFO: renamed from: com.p1.mobile.longlink.msg.intlluckygift.LongLinkIntlLuckyGiftMessage$1 */
    public static /* synthetic */ class C03331 {

        /* JADX INFO: renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f1643xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f1643xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f1643xa1df5c61[GeneratedMessageLite.MethodToInvoke.IS_INITIALIZED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f1643xa1df5c61[GeneratedMessageLite.MethodToInvoke.MAKE_IMMUTABLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f1643xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f1643xa1df5c61[GeneratedMessageLite.MethodToInvoke.VISIT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f1643xa1df5c61[GeneratedMessageLite.MethodToInvoke.MERGE_FROM_STREAM.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f1643xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f1643xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    public interface IntlLuckyGiftTrayOrBuilder extends o6z {
        String getComboId();

        ByteString getComboIdBytes();

        /* synthetic */ q getDefaultInstanceForType();

        String getDiamond();

        ByteString getDiamondBytes();

        String getReward();

        ByteString getRewardBytes();

        /* synthetic */ boolean isInitialized();
    }

    private LongLinkIntlLuckyGiftMessage() {
    }

    public static void registerAllExtensions(h hVar) {
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

        public static final class Builder extends GeneratedMessageLite.b<IntlLuckyGiftTray, Builder> implements IntlLuckyGiftTrayOrBuilder {
            private Builder() {
                super(IntlLuckyGiftTray.DEFAULT_INSTANCE);
            }

            public Builder clearComboId() {
                copyOnWrite();
                ((IntlLuckyGiftTray) ((GeneratedMessageLite.b) this).instance).clearComboId();
                return this;
            }

            public Builder clearDiamond() {
                copyOnWrite();
                ((IntlLuckyGiftTray) ((GeneratedMessageLite.b) this).instance).clearDiamond();
                return this;
            }

            public Builder clearReward() {
                copyOnWrite();
                ((IntlLuckyGiftTray) ((GeneratedMessageLite.b) this).instance).clearReward();
                return this;
            }

            @Override // com.p1.mobile.longlink.msg.intlluckygift.LongLinkIntlLuckyGiftMessage.IntlLuckyGiftTrayOrBuilder
            public String getComboId() {
                return ((IntlLuckyGiftTray) ((GeneratedMessageLite.b) this).instance).getComboId();
            }

            @Override // com.p1.mobile.longlink.msg.intlluckygift.LongLinkIntlLuckyGiftMessage.IntlLuckyGiftTrayOrBuilder
            public ByteString getComboIdBytes() {
                return ((IntlLuckyGiftTray) ((GeneratedMessageLite.b) this).instance).getComboIdBytes();
            }

            @Override // com.p1.mobile.longlink.msg.intlluckygift.LongLinkIntlLuckyGiftMessage.IntlLuckyGiftTrayOrBuilder
            public String getDiamond() {
                return ((IntlLuckyGiftTray) ((GeneratedMessageLite.b) this).instance).getDiamond();
            }

            @Override // com.p1.mobile.longlink.msg.intlluckygift.LongLinkIntlLuckyGiftMessage.IntlLuckyGiftTrayOrBuilder
            public ByteString getDiamondBytes() {
                return ((IntlLuckyGiftTray) ((GeneratedMessageLite.b) this).instance).getDiamondBytes();
            }

            @Override // com.p1.mobile.longlink.msg.intlluckygift.LongLinkIntlLuckyGiftMessage.IntlLuckyGiftTrayOrBuilder
            public String getReward() {
                return ((IntlLuckyGiftTray) ((GeneratedMessageLite.b) this).instance).getReward();
            }

            @Override // com.p1.mobile.longlink.msg.intlluckygift.LongLinkIntlLuckyGiftMessage.IntlLuckyGiftTrayOrBuilder
            public ByteString getRewardBytes() {
                return ((IntlLuckyGiftTray) ((GeneratedMessageLite.b) this).instance).getRewardBytes();
            }

            public Builder setComboId(String str) {
                copyOnWrite();
                ((IntlLuckyGiftTray) ((GeneratedMessageLite.b) this).instance).setComboId(str);
                return this;
            }

            public Builder setComboIdBytes(ByteString byteString) {
                copyOnWrite();
                ((IntlLuckyGiftTray) ((GeneratedMessageLite.b) this).instance).setComboIdBytes(byteString);
                return this;
            }

            public Builder setDiamond(String str) {
                copyOnWrite();
                ((IntlLuckyGiftTray) ((GeneratedMessageLite.b) this).instance).setDiamond(str);
                return this;
            }

            public Builder setDiamondBytes(ByteString byteString) {
                copyOnWrite();
                ((IntlLuckyGiftTray) ((GeneratedMessageLite.b) this).instance).setDiamondBytes(byteString);
                return this;
            }

            public Builder setReward(String str) {
                copyOnWrite();
                ((IntlLuckyGiftTray) ((GeneratedMessageLite.b) this).instance).setReward(str);
                return this;
            }

            public Builder setRewardBytes(ByteString byteString) {
                copyOnWrite();
                ((IntlLuckyGiftTray) ((GeneratedMessageLite.b) this).instance).setRewardBytes(byteString);
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
            return (Builder) ((Builder) DEFAULT_INSTANCE.toBuilder()).mergeFrom(intlLuckyGiftTray);
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
            a.checkByteStringIsUtf8(byteString);
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
            a.checkByteStringIsUtf8(byteString);
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
            a.checkByteStringIsUtf8(byteString);
            this.reward_ = byteString.toStringUtf8();
        }

        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (C03331.f1643xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new IntlLuckyGiftTray();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                    return null;
                case 4:
                    return new Builder();
                case 5:
                    GeneratedMessageLite.h hVar = (GeneratedMessageLite.h) obj;
                    IntlLuckyGiftTray intlLuckyGiftTray = (IntlLuckyGiftTray) obj2;
                    this.comboId_ = hVar.f(!this.comboId_.isEmpty(), this.comboId_, !intlLuckyGiftTray.comboId_.isEmpty(), intlLuckyGiftTray.comboId_);
                    this.diamond_ = hVar.f(!this.diamond_.isEmpty(), this.diamond_, !intlLuckyGiftTray.diamond_.isEmpty(), intlLuckyGiftTray.diamond_);
                    this.reward_ = hVar.f(!this.reward_.isEmpty(), this.reward_, true ^ intlLuckyGiftTray.reward_.isEmpty(), intlLuckyGiftTray.reward_);
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
                                    this.comboId_ = eVar.L();
                                } else if (iM == 18) {
                                    this.diamond_ = eVar.L();
                                } else if (iM == 26) {
                                    this.reward_ = eVar.L();
                                } else if (!eVar.R(iM)) {
                                }
                            }
                            z = true;
                        } catch (IOException e) {
                            aag0.a(new InvalidProtocolBufferException(e.getMessage()).setUnfinishedMessage(this));
                            return null;
                        } catch (InvalidProtocolBufferException e2) {
                            aag0.a(e2.setUnfinishedMessage(this));
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

        public int getSerializedSize() {
            int i = ((GeneratedMessageLite) this).memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int iK = !this.comboId_.isEmpty() ? CodedOutputStream.K(1, getComboId()) : 0;
            if (!this.diamond_.isEmpty()) {
                iK += CodedOutputStream.K(2, getDiamond());
            }
            if (!this.reward_.isEmpty()) {
                iK += CodedOutputStream.K(3, getReward());
            }
            ((GeneratedMessageLite) this).memoizedSerializedSize = iK;
            return iK;
        }

        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (!this.comboId_.isEmpty()) {
                codedOutputStream.D0(1, getComboId());
            }
            if (!this.diamond_.isEmpty()) {
                codedOutputStream.D0(2, getDiamond());
            }
            if (this.reward_.isEmpty()) {
                return;
            }
            codedOutputStream.D0(3, getReward());
        }

        public static IntlLuckyGiftTray parseDelimitedFrom(InputStream inputStream, h hVar) throws IOException {
            return (IntlLuckyGiftTray) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, hVar);
        }

        public static IntlLuckyGiftTray parseFrom(ByteString byteString, h hVar) throws InvalidProtocolBufferException {
            return (IntlLuckyGiftTray) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, hVar);
        }

        public static IntlLuckyGiftTray parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (IntlLuckyGiftTray) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static IntlLuckyGiftTray parseFrom(byte[] bArr, h hVar) throws InvalidProtocolBufferException {
            return (IntlLuckyGiftTray) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, hVar);
        }

        public static IntlLuckyGiftTray parseFrom(InputStream inputStream) throws IOException {
            return (IntlLuckyGiftTray) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static IntlLuckyGiftTray parseFrom(InputStream inputStream, h hVar) throws IOException {
            return (IntlLuckyGiftTray) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, hVar);
        }

        public static IntlLuckyGiftTray parseFrom(e eVar) throws IOException {
            return (IntlLuckyGiftTray) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, eVar);
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.toBuilder();
        }

        public static IntlLuckyGiftTray parseFrom(e eVar, h hVar) throws IOException {
            return (IntlLuckyGiftTray) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, eVar, hVar);
        }
    }
}
