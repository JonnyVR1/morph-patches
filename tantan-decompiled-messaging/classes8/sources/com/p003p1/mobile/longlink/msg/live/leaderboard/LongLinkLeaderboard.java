package com.p003p1.mobile.longlink.msg.live.leaderboard;

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
public final class LongLinkLeaderboard {

    /* JADX INFO: renamed from: com.p1.mobile.longlink.msg.live.leaderboard.LongLinkLeaderboard$1 */
    public static /* synthetic */ class C03361 {

        /* JADX INFO: renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f1646xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f1646xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f1646xa1df5c61[GeneratedMessageLite.MethodToInvoke.IS_INITIALIZED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f1646xa1df5c61[GeneratedMessageLite.MethodToInvoke.MAKE_IMMUTABLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f1646xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f1646xa1df5c61[GeneratedMessageLite.MethodToInvoke.VISIT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f1646xa1df5c61[GeneratedMessageLite.MethodToInvoke.MERGE_FROM_STREAM.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f1646xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f1646xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    public interface GiftStarLeaderboardChangeMessageOrBuilder extends o6z {
        /* synthetic */ q getDefaultInstanceForType();

        /* synthetic */ boolean isInitialized();
    }

    private LongLinkLeaderboard() {
    }

    public static void registerAllExtensions(h hVar) {
    }

    public static final class GiftStarLeaderboardChangeMessage extends GeneratedMessageLite<GiftStarLeaderboardChangeMessage, Builder> implements GiftStarLeaderboardChangeMessageOrBuilder {
        private static final GiftStarLeaderboardChangeMessage DEFAULT_INSTANCE;
        private static volatile i860<GiftStarLeaderboardChangeMessage> PARSER;

        public static final class Builder extends GeneratedMessageLite.b<GiftStarLeaderboardChangeMessage, Builder> implements GiftStarLeaderboardChangeMessageOrBuilder {
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
            return (Builder) ((Builder) DEFAULT_INSTANCE.toBuilder()).mergeFrom(giftStarLeaderboardChangeMessage);
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

        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (C03361.f1646xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new GiftStarLeaderboardChangeMessage();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                    return null;
                case 4:
                    return new Builder();
                case 5:
                    GeneratedMessageLite.g gVar = GeneratedMessageLite.g.INSTANCE;
                    return this;
                case 6:
                    e eVar = (e) obj;
                    boolean z = false;
                    while (!z) {
                        try {
                            int iM = eVar.M();
                            if (iM == 0 || !eVar.R(iM)) {
                                z = true;
                            }
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
                        synchronized (GiftStarLeaderboardChangeMessage.class) {
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

        public int getSerializedSize() {
            int i = ((GeneratedMessageLite) this).memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            ((GeneratedMessageLite) this).memoizedSerializedSize = 0;
            return 0;
        }

        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        }

        public static GiftStarLeaderboardChangeMessage parseDelimitedFrom(InputStream inputStream, h hVar) throws IOException {
            return (GiftStarLeaderboardChangeMessage) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, hVar);
        }

        public static GiftStarLeaderboardChangeMessage parseFrom(ByteString byteString, h hVar) throws InvalidProtocolBufferException {
            return (GiftStarLeaderboardChangeMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, hVar);
        }

        public static GiftStarLeaderboardChangeMessage parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (GiftStarLeaderboardChangeMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static GiftStarLeaderboardChangeMessage parseFrom(byte[] bArr, h hVar) throws InvalidProtocolBufferException {
            return (GiftStarLeaderboardChangeMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, hVar);
        }

        public static GiftStarLeaderboardChangeMessage parseFrom(InputStream inputStream) throws IOException {
            return (GiftStarLeaderboardChangeMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static GiftStarLeaderboardChangeMessage parseFrom(InputStream inputStream, h hVar) throws IOException {
            return (GiftStarLeaderboardChangeMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, hVar);
        }

        public static GiftStarLeaderboardChangeMessage parseFrom(e eVar) throws IOException {
            return (GiftStarLeaderboardChangeMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, eVar);
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.toBuilder();
        }

        public static GiftStarLeaderboardChangeMessage parseFrom(e eVar, h hVar) throws IOException {
            return (GiftStarLeaderboardChangeMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, eVar, hVar);
        }
    }
}
