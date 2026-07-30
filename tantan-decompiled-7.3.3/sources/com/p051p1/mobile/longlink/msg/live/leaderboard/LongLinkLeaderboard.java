package com.p051p1.mobile.longlink.msg.live.leaderboard;

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
public final class LongLinkLeaderboard {

    /* JADX INFO: renamed from: com.p1.mobile.longlink.msg.live.leaderboard.LongLinkLeaderboard$1 */
    public static /* synthetic */ class C45751 {

        /* JADX INFO: renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f16666xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f16666xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f16666xa1df5c61[GeneratedMessageLite.MethodToInvoke.IS_INITIALIZED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f16666xa1df5c61[GeneratedMessageLite.MethodToInvoke.MAKE_IMMUTABLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f16666xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f16666xa1df5c61[GeneratedMessageLite.MethodToInvoke.VISIT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f16666xa1df5c61[GeneratedMessageLite.MethodToInvoke.MERGE_FROM_STREAM.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f16666xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f16666xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    public interface GiftStarLeaderboardChangeMessageOrBuilder extends lfz {
        @Override // p153l.lfz
        /* synthetic */ InterfaceC3442q getDefaultInstanceForType();

        @Override // p153l.lfz
        /* synthetic */ boolean isInitialized();
    }

    private LongLinkLeaderboard() {
    }

    public static void registerAllExtensions(C3433h c3433h) {
    }

    public static final class GiftStarLeaderboardChangeMessage extends GeneratedMessageLite<GiftStarLeaderboardChangeMessage, Builder> implements GiftStarLeaderboardChangeMessageOrBuilder {
        private static final GiftStarLeaderboardChangeMessage DEFAULT_INSTANCE;
        private static volatile ng60<GiftStarLeaderboardChangeMessage> PARSER;

        public static final class Builder extends GeneratedMessageLite.AbstractC3403b<GiftStarLeaderboardChangeMessage, Builder> implements GiftStarLeaderboardChangeMessageOrBuilder {
            private Builder() {
                super(GiftStarLeaderboardChangeMessage.DEFAULT_INSTANCE);
            }
        }

        static {
            GiftStarLeaderboardChangeMessage giftStarLeaderboardChangeMessage = new GiftStarLeaderboardChangeMessage();
            DEFAULT_INSTANCE = giftStarLeaderboardChangeMessage;
            giftStarLeaderboardChangeMessage.makeImmutable();
        }

        private GiftStarLeaderboardChangeMessage() {
        }

        public static GiftStarLeaderboardChangeMessage getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder(GiftStarLeaderboardChangeMessage giftStarLeaderboardChangeMessage) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(giftStarLeaderboardChangeMessage);
        }

        public static GiftStarLeaderboardChangeMessage parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (GiftStarLeaderboardChangeMessage) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static GiftStarLeaderboardChangeMessage parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (GiftStarLeaderboardChangeMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static ng60<GiftStarLeaderboardChangeMessage> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (C45751.f16666xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new GiftStarLeaderboardChangeMessage();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                    return null;
                case 4:
                    return new Builder();
                case 5:
                    GeneratedMessageLite.C3408g c3408g = GeneratedMessageLite.C3408g.INSTANCE;
                    return this;
                case 6:
                    C3430e c3430e = (C3430e) obj;
                    boolean z = false;
                    while (!z) {
                        try {
                            int iM17171M = c3430e.m17171M();
                            if (iM17171M == 0 || !c3430e.m17176R(iM17171M)) {
                                z = true;
                            }
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
                        synchronized (GiftStarLeaderboardChangeMessage.class) {
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

        @Override // com.google.protobuf.InterfaceC3442q
        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            this.memoizedSerializedSize = 0;
            return 0;
        }

        @Override // com.google.protobuf.InterfaceC3442q
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        }

        public static GiftStarLeaderboardChangeMessage parseDelimitedFrom(InputStream inputStream, C3433h c3433h) throws IOException {
            return (GiftStarLeaderboardChangeMessage) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, c3433h);
        }

        public static GiftStarLeaderboardChangeMessage parseFrom(ByteString byteString, C3433h c3433h) throws InvalidProtocolBufferException {
            return (GiftStarLeaderboardChangeMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, c3433h);
        }

        public static GiftStarLeaderboardChangeMessage parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (GiftStarLeaderboardChangeMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static GiftStarLeaderboardChangeMessage parseFrom(byte[] bArr, C3433h c3433h) throws InvalidProtocolBufferException {
            return (GiftStarLeaderboardChangeMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, c3433h);
        }

        public static GiftStarLeaderboardChangeMessage parseFrom(InputStream inputStream) throws IOException {
            return (GiftStarLeaderboardChangeMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static GiftStarLeaderboardChangeMessage parseFrom(InputStream inputStream, C3433h c3433h) throws IOException {
            return (GiftStarLeaderboardChangeMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, c3433h);
        }

        public static GiftStarLeaderboardChangeMessage parseFrom(C3430e c3430e) throws IOException {
            return (GiftStarLeaderboardChangeMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, c3430e);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static GiftStarLeaderboardChangeMessage parseFrom(C3430e c3430e, C3433h c3433h) throws IOException {
            return (GiftStarLeaderboardChangeMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, c3430e, c3433h);
        }
    }
}
