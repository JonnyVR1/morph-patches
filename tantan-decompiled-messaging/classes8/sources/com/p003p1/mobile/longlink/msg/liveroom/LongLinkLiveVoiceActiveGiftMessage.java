package com.p003p1.mobile.longlink.msg.liveroom;

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
public final class LongLinkLiveVoiceActiveGiftMessage {

    /* JADX INFO: renamed from: com.p1.mobile.longlink.msg.liveroom.LongLinkLiveVoiceActiveGiftMessage$1 */
    public static /* synthetic */ class C04131 {

        /* JADX INFO: renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f1676xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f1676xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f1676xa1df5c61[GeneratedMessageLite.MethodToInvoke.IS_INITIALIZED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f1676xa1df5c61[GeneratedMessageLite.MethodToInvoke.MAKE_IMMUTABLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f1676xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f1676xa1df5c61[GeneratedMessageLite.MethodToInvoke.VISIT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f1676xa1df5c61[GeneratedMessageLite.MethodToInvoke.MERGE_FROM_STREAM.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f1676xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f1676xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    public interface VoiceGiftItemOrBuilder extends o6z {
        long getCount();

        /* synthetic */ q getDefaultInstanceForType();

        String getId();

        ByteString getIdBytes();

        String getName();

        ByteString getNameBytes();

        long getTantanCoins();

        String getUrl();

        ByteString getUrlBytes();

        /* synthetic */ boolean isInitialized();
    }

    private LongLinkLiveVoiceActiveGiftMessage() {
    }

    public static void registerAllExtensions(h hVar) {
    }

    public static final class VoiceGiftItem extends GeneratedMessageLite<VoiceGiftItem, Builder> implements VoiceGiftItemOrBuilder {
        public static final int COUNT_FIELD_NUMBER = 4;
        private static final VoiceGiftItem DEFAULT_INSTANCE;
        public static final int ID_FIELD_NUMBER = 1;
        public static final int NAME_FIELD_NUMBER = 2;
        private static volatile i860<VoiceGiftItem> PARSER = null;
        public static final int TANTANCOINS_FIELD_NUMBER = 5;
        public static final int URL_FIELD_NUMBER = 3;
        private long count_;
        private long tantanCoins_;
        private String id_ = "";
        private String name_ = "";
        private String url_ = "";

        public static final class Builder extends GeneratedMessageLite.b<VoiceGiftItem, Builder> implements VoiceGiftItemOrBuilder {
            private Builder() {
                super(VoiceGiftItem.DEFAULT_INSTANCE);
            }

            public Builder clearCount() {
                copyOnWrite();
                ((VoiceGiftItem) ((GeneratedMessageLite.b) this).instance).clearCount();
                return this;
            }

            public Builder clearId() {
                copyOnWrite();
                ((VoiceGiftItem) ((GeneratedMessageLite.b) this).instance).clearId();
                return this;
            }

            public Builder clearName() {
                copyOnWrite();
                ((VoiceGiftItem) ((GeneratedMessageLite.b) this).instance).clearName();
                return this;
            }

            public Builder clearTantanCoins() {
                copyOnWrite();
                ((VoiceGiftItem) ((GeneratedMessageLite.b) this).instance).clearTantanCoins();
                return this;
            }

            public Builder clearUrl() {
                copyOnWrite();
                ((VoiceGiftItem) ((GeneratedMessageLite.b) this).instance).clearUrl();
                return this;
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkLiveVoiceActiveGiftMessage.VoiceGiftItemOrBuilder
            public long getCount() {
                return ((VoiceGiftItem) ((GeneratedMessageLite.b) this).instance).getCount();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkLiveVoiceActiveGiftMessage.VoiceGiftItemOrBuilder
            public String getId() {
                return ((VoiceGiftItem) ((GeneratedMessageLite.b) this).instance).getId();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkLiveVoiceActiveGiftMessage.VoiceGiftItemOrBuilder
            public ByteString getIdBytes() {
                return ((VoiceGiftItem) ((GeneratedMessageLite.b) this).instance).getIdBytes();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkLiveVoiceActiveGiftMessage.VoiceGiftItemOrBuilder
            public String getName() {
                return ((VoiceGiftItem) ((GeneratedMessageLite.b) this).instance).getName();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkLiveVoiceActiveGiftMessage.VoiceGiftItemOrBuilder
            public ByteString getNameBytes() {
                return ((VoiceGiftItem) ((GeneratedMessageLite.b) this).instance).getNameBytes();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkLiveVoiceActiveGiftMessage.VoiceGiftItemOrBuilder
            public long getTantanCoins() {
                return ((VoiceGiftItem) ((GeneratedMessageLite.b) this).instance).getTantanCoins();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkLiveVoiceActiveGiftMessage.VoiceGiftItemOrBuilder
            public String getUrl() {
                return ((VoiceGiftItem) ((GeneratedMessageLite.b) this).instance).getUrl();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkLiveVoiceActiveGiftMessage.VoiceGiftItemOrBuilder
            public ByteString getUrlBytes() {
                return ((VoiceGiftItem) ((GeneratedMessageLite.b) this).instance).getUrlBytes();
            }

            public Builder setCount(long j) {
                copyOnWrite();
                ((VoiceGiftItem) ((GeneratedMessageLite.b) this).instance).setCount(j);
                return this;
            }

            public Builder setId(String str) {
                copyOnWrite();
                ((VoiceGiftItem) ((GeneratedMessageLite.b) this).instance).setId(str);
                return this;
            }

            public Builder setIdBytes(ByteString byteString) {
                copyOnWrite();
                ((VoiceGiftItem) ((GeneratedMessageLite.b) this).instance).setIdBytes(byteString);
                return this;
            }

            public Builder setName(String str) {
                copyOnWrite();
                ((VoiceGiftItem) ((GeneratedMessageLite.b) this).instance).setName(str);
                return this;
            }

            public Builder setNameBytes(ByteString byteString) {
                copyOnWrite();
                ((VoiceGiftItem) ((GeneratedMessageLite.b) this).instance).setNameBytes(byteString);
                return this;
            }

            public Builder setTantanCoins(long j) {
                copyOnWrite();
                ((VoiceGiftItem) ((GeneratedMessageLite.b) this).instance).setTantanCoins(j);
                return this;
            }

            public Builder setUrl(String str) {
                copyOnWrite();
                ((VoiceGiftItem) ((GeneratedMessageLite.b) this).instance).setUrl(str);
                return this;
            }

            public Builder setUrlBytes(ByteString byteString) {
                copyOnWrite();
                ((VoiceGiftItem) ((GeneratedMessageLite.b) this).instance).setUrlBytes(byteString);
                return this;
            }
        }

        static {
            VoiceGiftItem voiceGiftItem = new VoiceGiftItem();
            DEFAULT_INSTANCE = voiceGiftItem;
            voiceGiftItem.makeImmutable();
        }

        private VoiceGiftItem() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearCount() {
            this.count_ = 0L;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearId() {
            this.id_ = getDefaultInstance().getId();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearName() {
            this.name_ = getDefaultInstance().getName();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearTantanCoins() {
            this.tantanCoins_ = 0L;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearUrl() {
            this.url_ = getDefaultInstance().getUrl();
        }

        public static VoiceGiftItem getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder(VoiceGiftItem voiceGiftItem) {
            return (Builder) ((Builder) DEFAULT_INSTANCE.toBuilder()).mergeFrom(voiceGiftItem);
        }

        public static VoiceGiftItem parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (VoiceGiftItem) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static VoiceGiftItem parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (VoiceGiftItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static i860<VoiceGiftItem> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setCount(long j) {
            this.count_ = j;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setId(String str) {
            str.getClass();
            this.id_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setIdBytes(ByteString byteString) {
            byteString.getClass();
            a.checkByteStringIsUtf8(byteString);
            this.id_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setName(String str) {
            str.getClass();
            this.name_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setNameBytes(ByteString byteString) {
            byteString.getClass();
            a.checkByteStringIsUtf8(byteString);
            this.name_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTantanCoins(long j) {
            this.tantanCoins_ = j;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setUrl(String str) {
            str.getClass();
            this.url_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setUrlBytes(ByteString byteString) {
            byteString.getClass();
            a.checkByteStringIsUtf8(byteString);
            this.url_ = byteString.toStringUtf8();
        }

        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            boolean z = false;
            switch (C04131.f1676xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new VoiceGiftItem();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                    return null;
                case 4:
                    return new Builder();
                case 5:
                    GeneratedMessageLite.h hVar = (GeneratedMessageLite.h) obj;
                    VoiceGiftItem voiceGiftItem = (VoiceGiftItem) obj2;
                    this.id_ = hVar.f(!this.id_.isEmpty(), this.id_, !voiceGiftItem.id_.isEmpty(), voiceGiftItem.id_);
                    this.name_ = hVar.f(!this.name_.isEmpty(), this.name_, !voiceGiftItem.name_.isEmpty(), voiceGiftItem.name_);
                    this.url_ = hVar.f(!this.url_.isEmpty(), this.url_, !voiceGiftItem.url_.isEmpty(), voiceGiftItem.url_);
                    long j = this.count_;
                    boolean z2 = j != 0;
                    long j2 = voiceGiftItem.count_;
                    this.count_ = hVar.i(z2, j, j2 != 0, j2);
                    boolean z3 = false;
                    long j3 = this.tantanCoins_;
                    if (j3 != 0) {
                        z3 = true;
                    }
                    long j4 = voiceGiftItem.tantanCoins_;
                    this.tantanCoins_ = hVar.i(z3, j3, j4 != 0, j4);
                    GeneratedMessageLite.g gVar = GeneratedMessageLite.g.INSTANCE;
                    return this;
                case 6:
                    e eVar = (e) obj;
                    while (!z) {
                        try {
                            int iM = eVar.M();
                            if (iM != 0) {
                                if (iM == 10) {
                                    this.id_ = eVar.L();
                                } else if (iM == 18) {
                                    this.name_ = eVar.L();
                                } else if (iM == 26) {
                                    this.url_ = eVar.L();
                                } else if (iM == 32) {
                                    this.count_ = eVar.v();
                                } else if (iM == 40) {
                                    this.tantanCoins_ = eVar.v();
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
                        synchronized (VoiceGiftItem.class) {
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

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkLiveVoiceActiveGiftMessage.VoiceGiftItemOrBuilder
        public long getCount() {
            return this.count_;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkLiveVoiceActiveGiftMessage.VoiceGiftItemOrBuilder
        public String getId() {
            return this.id_;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkLiveVoiceActiveGiftMessage.VoiceGiftItemOrBuilder
        public ByteString getIdBytes() {
            return ByteString.copyFromUtf8(this.id_);
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkLiveVoiceActiveGiftMessage.VoiceGiftItemOrBuilder
        public String getName() {
            return this.name_;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkLiveVoiceActiveGiftMessage.VoiceGiftItemOrBuilder
        public ByteString getNameBytes() {
            return ByteString.copyFromUtf8(this.name_);
        }

        public int getSerializedSize() {
            int i = ((GeneratedMessageLite) this).memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int iK = !this.id_.isEmpty() ? CodedOutputStream.K(1, getId()) : 0;
            if (!this.name_.isEmpty()) {
                iK += CodedOutputStream.K(2, getName());
            }
            if (!this.url_.isEmpty()) {
                iK += CodedOutputStream.K(3, getUrl());
            }
            long j = this.count_;
            if (j != 0) {
                iK += CodedOutputStream.v(4, j);
            }
            long j2 = this.tantanCoins_;
            if (j2 != 0) {
                iK += CodedOutputStream.v(5, j2);
            }
            ((GeneratedMessageLite) this).memoizedSerializedSize = iK;
            return iK;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkLiveVoiceActiveGiftMessage.VoiceGiftItemOrBuilder
        public long getTantanCoins() {
            return this.tantanCoins_;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkLiveVoiceActiveGiftMessage.VoiceGiftItemOrBuilder
        public String getUrl() {
            return this.url_;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkLiveVoiceActiveGiftMessage.VoiceGiftItemOrBuilder
        public ByteString getUrlBytes() {
            return ByteString.copyFromUtf8(this.url_);
        }

        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (!this.id_.isEmpty()) {
                codedOutputStream.D0(1, getId());
            }
            if (!this.name_.isEmpty()) {
                codedOutputStream.D0(2, getName());
            }
            if (!this.url_.isEmpty()) {
                codedOutputStream.D0(3, getUrl());
            }
            long j = this.count_;
            if (j != 0) {
                codedOutputStream.u0(4, j);
            }
            long j2 = this.tantanCoins_;
            if (j2 != 0) {
                codedOutputStream.u0(5, j2);
            }
        }

        public static VoiceGiftItem parseDelimitedFrom(InputStream inputStream, h hVar) throws IOException {
            return (VoiceGiftItem) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, hVar);
        }

        public static VoiceGiftItem parseFrom(ByteString byteString, h hVar) throws InvalidProtocolBufferException {
            return (VoiceGiftItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, hVar);
        }

        public static VoiceGiftItem parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (VoiceGiftItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static VoiceGiftItem parseFrom(byte[] bArr, h hVar) throws InvalidProtocolBufferException {
            return (VoiceGiftItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, hVar);
        }

        public static VoiceGiftItem parseFrom(InputStream inputStream) throws IOException {
            return (VoiceGiftItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static VoiceGiftItem parseFrom(InputStream inputStream, h hVar) throws IOException {
            return (VoiceGiftItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, hVar);
        }

        public static VoiceGiftItem parseFrom(e eVar) throws IOException {
            return (VoiceGiftItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, eVar);
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.toBuilder();
        }

        public static VoiceGiftItem parseFrom(e eVar, h hVar) throws IOException {
            return (VoiceGiftItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, eVar, hVar);
        }
    }
}
