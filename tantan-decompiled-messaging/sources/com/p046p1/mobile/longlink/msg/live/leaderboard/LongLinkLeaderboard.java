package com.p046p1.mobile.longlink.msg.live.leaderboard;

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
public final class LongLinkLeaderboard {

    /* JADX INFO: renamed from: com.p1.mobile.longlink.msg.live.leaderboard.LongLinkLeaderboard$1 */
    public static /* synthetic */ class C44241 {

        /* JADX INFO: renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f15947xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f15947xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f15947xa1df5c61[GeneratedMessageLite.MethodToInvoke.IS_INITIALIZED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f15947xa1df5c61[GeneratedMessageLite.MethodToInvoke.MAKE_IMMUTABLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f15947xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f15947xa1df5c61[GeneratedMessageLite.MethodToInvoke.VISIT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f15947xa1df5c61[GeneratedMessageLite.MethodToInvoke.MERGE_FROM_STREAM.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f15947xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f15947xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    public interface GiftStarLeaderboardChangeMessageOrBuilder extends o6z {
        @Override // p149l.o6z
        /* synthetic */ InterfaceC3419q getDefaultInstanceForType();

        @Override // p149l.o6z
        /* synthetic */ boolean isInitialized();
    }

    private LongLinkLeaderboard() {
    }

    public static void registerAllExtensions(C3410h c3410h) {
    }

    public static final class GiftStarLeaderboardChangeMessage extends GeneratedMessageLite<GiftStarLeaderboardChangeMessage, Builder> implements GiftStarLeaderboardChangeMessageOrBuilder {
        private static final GiftStarLeaderboardChangeMessage DEFAULT_INSTANCE;
        private static volatile i860<GiftStarLeaderboardChangeMessage> PARSER;

        public static final class Builder extends GeneratedMessageLite.AbstractC3380b<GiftStarLeaderboardChangeMessage, Builder> implements GiftStarLeaderboardChangeMessageOrBuilder {
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

        public static i860<GiftStarLeaderboardChangeMessage> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (C44241.f15947xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new GiftStarLeaderboardChangeMessage();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                    return null;
                case 4:
                    return new Builder();
                case 5:
                    GeneratedMessageLite.C3385g c3385g = GeneratedMessageLite.C3385g.INSTANCE;
                    return this;
                case 6:
                    C3407e c3407e = (C3407e) obj;
                    boolean z = false;
                    while (!z) {
                        try {
                            int iM17116M = c3407e.m17116M();
                            if (iM17116M == 0 || !c3407e.m17121R(iM17116M)) {
                                z = true;
                            }
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
                        synchronized (GiftStarLeaderboardChangeMessage.class) {
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

        @Override // com.google.protobuf.InterfaceC3419q
        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            this.memoizedSerializedSize = 0;
            return 0;
        }

        @Override // com.google.protobuf.InterfaceC3419q
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        }

        public static GiftStarLeaderboardChangeMessage parseDelimitedFrom(InputStream inputStream, C3410h c3410h) throws IOException {
            return (GiftStarLeaderboardChangeMessage) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, c3410h);
        }

        public static GiftStarLeaderboardChangeMessage parseFrom(ByteString byteString, C3410h c3410h) throws InvalidProtocolBufferException {
            return (GiftStarLeaderboardChangeMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, c3410h);
        }

        public static GiftStarLeaderboardChangeMessage parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (GiftStarLeaderboardChangeMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static GiftStarLeaderboardChangeMessage parseFrom(byte[] bArr, C3410h c3410h) throws InvalidProtocolBufferException {
            return (GiftStarLeaderboardChangeMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, c3410h);
        }

        public static GiftStarLeaderboardChangeMessage parseFrom(InputStream inputStream) throws IOException {
            return (GiftStarLeaderboardChangeMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static GiftStarLeaderboardChangeMessage parseFrom(InputStream inputStream, C3410h c3410h) throws IOException {
            return (GiftStarLeaderboardChangeMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, c3410h);
        }

        public static GiftStarLeaderboardChangeMessage parseFrom(C3407e c3407e) throws IOException {
            return (GiftStarLeaderboardChangeMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, c3407e);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static GiftStarLeaderboardChangeMessage parseFrom(C3407e c3407e, C3410h c3410h) throws IOException {
            return (GiftStarLeaderboardChangeMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, c3407e, c3410h);
        }
    }
}
