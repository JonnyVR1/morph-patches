package com.p051p1.mobile.longlink.msg.liveroom;

import com.google.protobuf.AbstractC3426a;
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
public final class LongLinkVoicePublicLive {

    /* JADX INFO: renamed from: com.p1.mobile.longlink.msg.liveroom.LongLinkVoicePublicLive$1 */
    public static /* synthetic */ class C46801 {

        /* JADX INFO: renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f16704xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f16704xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f16704xa1df5c61[GeneratedMessageLite.MethodToInvoke.IS_INITIALIZED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f16704xa1df5c61[GeneratedMessageLite.MethodToInvoke.MAKE_IMMUTABLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f16704xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f16704xa1df5c61[GeneratedMessageLite.MethodToInvoke.VISIT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f16704xa1df5c61[GeneratedMessageLite.MethodToInvoke.MERGE_FROM_STREAM.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f16704xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f16704xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    public interface VoicePublicLiveOrBuilder extends lfz {
        @Override // p153l.lfz
        /* synthetic */ InterfaceC3442q getDefaultInstanceForType();

        String getLiveId();

        ByteString getLiveIdBytes();

        @Override // p153l.lfz
        /* synthetic */ boolean isInitialized();
    }

    private LongLinkVoicePublicLive() {
    }

    public static void registerAllExtensions(C3433h c3433h) {
    }

    public static final class VoicePublicLive extends GeneratedMessageLite<VoicePublicLive, Builder> implements VoicePublicLiveOrBuilder {
        private static final VoicePublicLive DEFAULT_INSTANCE;
        public static final int LIVEID_FIELD_NUMBER = 1;
        private static volatile ng60<VoicePublicLive> PARSER;
        private String liveId_ = "";

        public static final class Builder extends GeneratedMessageLite.AbstractC3403b<VoicePublicLive, Builder> implements VoicePublicLiveOrBuilder {
            private Builder() {
                super(VoicePublicLive.DEFAULT_INSTANCE);
            }

            public Builder clearLiveId() {
                copyOnWrite();
                ((VoicePublicLive) this.instance).clearLiveId();
                return this;
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVoicePublicLive.VoicePublicLiveOrBuilder
            public String getLiveId() {
                return ((VoicePublicLive) this.instance).getLiveId();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVoicePublicLive.VoicePublicLiveOrBuilder
            public ByteString getLiveIdBytes() {
                return ((VoicePublicLive) this.instance).getLiveIdBytes();
            }

            public Builder setLiveId(String str) {
                copyOnWrite();
                ((VoicePublicLive) this.instance).setLiveId(str);
                return this;
            }

            public Builder setLiveIdBytes(ByteString byteString) {
                copyOnWrite();
                ((VoicePublicLive) this.instance).setLiveIdBytes(byteString);
                return this;
            }
        }

        static {
            VoicePublicLive voicePublicLive = new VoicePublicLive();
            DEFAULT_INSTANCE = voicePublicLive;
            voicePublicLive.makeImmutable();
        }

        private VoicePublicLive() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearLiveId() {
            this.liveId_ = getDefaultInstance().getLiveId();
        }

        public static VoicePublicLive getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder(VoicePublicLive voicePublicLive) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(voicePublicLive);
        }

        public static VoicePublicLive parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (VoicePublicLive) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static VoicePublicLive parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (VoicePublicLive) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static ng60<VoicePublicLive> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setLiveId(String str) {
            str.getClass();
            this.liveId_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setLiveIdBytes(ByteString byteString) {
            byteString.getClass();
            AbstractC3426a.checkByteStringIsUtf8(byteString);
            this.liveId_ = byteString.toStringUtf8();
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (C46801.f16704xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new VoicePublicLive();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                    return null;
                case 4:
                    return new Builder();
                case 5:
                    VoicePublicLive voicePublicLive = (VoicePublicLive) obj2;
                    this.liveId_ = ((GeneratedMessageLite.InterfaceC3409h) obj).mo17052f(!this.liveId_.isEmpty(), this.liveId_, true ^ voicePublicLive.liveId_.isEmpty(), voicePublicLive.liveId_);
                    GeneratedMessageLite.C3408g c3408g = GeneratedMessageLite.C3408g.INSTANCE;
                    return this;
                case 6:
                    C3430e c3430e = (C3430e) obj;
                    boolean z = false;
                    while (!z) {
                        try {
                            int iM17171M = c3430e.m17171M();
                            if (iM17171M != 0) {
                                if (iM17171M == 10) {
                                    this.liveId_ = c3430e.m17170L();
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
                        synchronized (VoicePublicLive.class) {
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

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVoicePublicLive.VoicePublicLiveOrBuilder
        public String getLiveId() {
            return this.liveId_;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVoicePublicLive.VoicePublicLiveOrBuilder
        public ByteString getLiveIdBytes() {
            return ByteString.copyFromUtf8(this.liveId_);
        }

        @Override // com.google.protobuf.InterfaceC3442q
        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int iM16956K = !this.liveId_.isEmpty() ? CodedOutputStream.m16956K(1, getLiveId()) : 0;
            this.memoizedSerializedSize = iM16956K;
            return iM16956K;
        }

        @Override // com.google.protobuf.InterfaceC3442q
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (this.liveId_.isEmpty()) {
                return;
            }
            codedOutputStream.mo16994D0(1, getLiveId());
        }

        public static VoicePublicLive parseDelimitedFrom(InputStream inputStream, C3433h c3433h) throws IOException {
            return (VoicePublicLive) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, c3433h);
        }

        public static VoicePublicLive parseFrom(ByteString byteString, C3433h c3433h) throws InvalidProtocolBufferException {
            return (VoicePublicLive) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, c3433h);
        }

        public static VoicePublicLive parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (VoicePublicLive) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static VoicePublicLive parseFrom(byte[] bArr, C3433h c3433h) throws InvalidProtocolBufferException {
            return (VoicePublicLive) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, c3433h);
        }

        public static VoicePublicLive parseFrom(InputStream inputStream) throws IOException {
            return (VoicePublicLive) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static VoicePublicLive parseFrom(InputStream inputStream, C3433h c3433h) throws IOException {
            return (VoicePublicLive) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, c3433h);
        }

        public static VoicePublicLive parseFrom(C3430e c3430e) throws IOException {
            return (VoicePublicLive) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, c3430e);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static VoicePublicLive parseFrom(C3430e c3430e, C3433h c3433h) throws IOException {
            return (VoicePublicLive) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, c3430e, c3433h);
        }
    }
}
