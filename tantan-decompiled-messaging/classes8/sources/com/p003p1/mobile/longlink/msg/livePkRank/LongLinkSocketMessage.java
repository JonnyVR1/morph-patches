package com.p003p1.mobile.longlink.msg.livePkRank;

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
public final class LongLinkSocketMessage {

    /* JADX INFO: renamed from: com.p1.mobile.longlink.msg.livePkRank.LongLinkSocketMessage$1 */
    public static /* synthetic */ class C03441 {

        /* JADX INFO: renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f1650xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f1650xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f1650xa1df5c61[GeneratedMessageLite.MethodToInvoke.IS_INITIALIZED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f1650xa1df5c61[GeneratedMessageLite.MethodToInvoke.MAKE_IMMUTABLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f1650xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f1650xa1df5c61[GeneratedMessageLite.MethodToInvoke.VISIT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f1650xa1df5c61[GeneratedMessageLite.MethodToInvoke.MERGE_FROM_STREAM.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f1650xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f1650xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    public interface PkRankUpgradeOrBuilder extends o6z {
        String getAnchorId();

        ByteString getAnchorIdBytes();

        String getAnchorName();

        ByteString getAnchorNameBytes();

        /* synthetic */ q getDefaultInstanceForType();

        String getRankName();

        ByteString getRankNameBytes();

        String getRankSvga();

        ByteString getRankSvgaBytes();

        long getStarCount();

        /* synthetic */ boolean isInitialized();
    }

    private LongLinkSocketMessage() {
    }

    public static void registerAllExtensions(h hVar) {
    }

    public static final class PkRankUpgrade extends GeneratedMessageLite<PkRankUpgrade, Builder> implements PkRankUpgradeOrBuilder {
        public static final int ANCHORID_FIELD_NUMBER = 1;
        public static final int ANCHORNAME_FIELD_NUMBER = 2;
        private static final PkRankUpgrade DEFAULT_INSTANCE;
        private static volatile i860<PkRankUpgrade> PARSER = null;
        public static final int RANKNAME_FIELD_NUMBER = 3;
        public static final int RANKSVGA_FIELD_NUMBER = 5;
        public static final int STARCOUNT_FIELD_NUMBER = 4;
        private String anchorId_ = "";
        private String anchorName_ = "";
        private String rankName_ = "";
        private String rankSvga_ = "";
        private long starCount_;

        public static final class Builder extends GeneratedMessageLite.b<PkRankUpgrade, Builder> implements PkRankUpgradeOrBuilder {
            private Builder() {
                super(PkRankUpgrade.DEFAULT_INSTANCE);
            }

            public Builder clearAnchorId() {
                copyOnWrite();
                ((PkRankUpgrade) ((GeneratedMessageLite.b) this).instance).clearAnchorId();
                return this;
            }

            public Builder clearAnchorName() {
                copyOnWrite();
                ((PkRankUpgrade) ((GeneratedMessageLite.b) this).instance).clearAnchorName();
                return this;
            }

            public Builder clearRankName() {
                copyOnWrite();
                ((PkRankUpgrade) ((GeneratedMessageLite.b) this).instance).clearRankName();
                return this;
            }

            public Builder clearRankSvga() {
                copyOnWrite();
                ((PkRankUpgrade) ((GeneratedMessageLite.b) this).instance).clearRankSvga();
                return this;
            }

            public Builder clearStarCount() {
                copyOnWrite();
                ((PkRankUpgrade) ((GeneratedMessageLite.b) this).instance).clearStarCount();
                return this;
            }

            @Override // com.p1.mobile.longlink.msg.livePkRank.LongLinkSocketMessage.PkRankUpgradeOrBuilder
            public String getAnchorId() {
                return ((PkRankUpgrade) ((GeneratedMessageLite.b) this).instance).getAnchorId();
            }

            @Override // com.p1.mobile.longlink.msg.livePkRank.LongLinkSocketMessage.PkRankUpgradeOrBuilder
            public ByteString getAnchorIdBytes() {
                return ((PkRankUpgrade) ((GeneratedMessageLite.b) this).instance).getAnchorIdBytes();
            }

            @Override // com.p1.mobile.longlink.msg.livePkRank.LongLinkSocketMessage.PkRankUpgradeOrBuilder
            public String getAnchorName() {
                return ((PkRankUpgrade) ((GeneratedMessageLite.b) this).instance).getAnchorName();
            }

            @Override // com.p1.mobile.longlink.msg.livePkRank.LongLinkSocketMessage.PkRankUpgradeOrBuilder
            public ByteString getAnchorNameBytes() {
                return ((PkRankUpgrade) ((GeneratedMessageLite.b) this).instance).getAnchorNameBytes();
            }

            @Override // com.p1.mobile.longlink.msg.livePkRank.LongLinkSocketMessage.PkRankUpgradeOrBuilder
            public String getRankName() {
                return ((PkRankUpgrade) ((GeneratedMessageLite.b) this).instance).getRankName();
            }

            @Override // com.p1.mobile.longlink.msg.livePkRank.LongLinkSocketMessage.PkRankUpgradeOrBuilder
            public ByteString getRankNameBytes() {
                return ((PkRankUpgrade) ((GeneratedMessageLite.b) this).instance).getRankNameBytes();
            }

            @Override // com.p1.mobile.longlink.msg.livePkRank.LongLinkSocketMessage.PkRankUpgradeOrBuilder
            public String getRankSvga() {
                return ((PkRankUpgrade) ((GeneratedMessageLite.b) this).instance).getRankSvga();
            }

            @Override // com.p1.mobile.longlink.msg.livePkRank.LongLinkSocketMessage.PkRankUpgradeOrBuilder
            public ByteString getRankSvgaBytes() {
                return ((PkRankUpgrade) ((GeneratedMessageLite.b) this).instance).getRankSvgaBytes();
            }

            @Override // com.p1.mobile.longlink.msg.livePkRank.LongLinkSocketMessage.PkRankUpgradeOrBuilder
            public long getStarCount() {
                return ((PkRankUpgrade) ((GeneratedMessageLite.b) this).instance).getStarCount();
            }

            public Builder setAnchorId(String str) {
                copyOnWrite();
                ((PkRankUpgrade) ((GeneratedMessageLite.b) this).instance).setAnchorId(str);
                return this;
            }

            public Builder setAnchorIdBytes(ByteString byteString) {
                copyOnWrite();
                ((PkRankUpgrade) ((GeneratedMessageLite.b) this).instance).setAnchorIdBytes(byteString);
                return this;
            }

            public Builder setAnchorName(String str) {
                copyOnWrite();
                ((PkRankUpgrade) ((GeneratedMessageLite.b) this).instance).setAnchorName(str);
                return this;
            }

            public Builder setAnchorNameBytes(ByteString byteString) {
                copyOnWrite();
                ((PkRankUpgrade) ((GeneratedMessageLite.b) this).instance).setAnchorNameBytes(byteString);
                return this;
            }

            public Builder setRankName(String str) {
                copyOnWrite();
                ((PkRankUpgrade) ((GeneratedMessageLite.b) this).instance).setRankName(str);
                return this;
            }

            public Builder setRankNameBytes(ByteString byteString) {
                copyOnWrite();
                ((PkRankUpgrade) ((GeneratedMessageLite.b) this).instance).setRankNameBytes(byteString);
                return this;
            }

            public Builder setRankSvga(String str) {
                copyOnWrite();
                ((PkRankUpgrade) ((GeneratedMessageLite.b) this).instance).setRankSvga(str);
                return this;
            }

            public Builder setRankSvgaBytes(ByteString byteString) {
                copyOnWrite();
                ((PkRankUpgrade) ((GeneratedMessageLite.b) this).instance).setRankSvgaBytes(byteString);
                return this;
            }

            public Builder setStarCount(long j) {
                copyOnWrite();
                ((PkRankUpgrade) ((GeneratedMessageLite.b) this).instance).setStarCount(j);
                return this;
            }
        }

        static {
            PkRankUpgrade pkRankUpgrade = new PkRankUpgrade();
            DEFAULT_INSTANCE = pkRankUpgrade;
            pkRankUpgrade.makeImmutable();
        }

        private PkRankUpgrade() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAnchorId() {
            this.anchorId_ = getDefaultInstance().getAnchorId();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAnchorName() {
            this.anchorName_ = getDefaultInstance().getAnchorName();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearRankName() {
            this.rankName_ = getDefaultInstance().getRankName();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearRankSvga() {
            this.rankSvga_ = getDefaultInstance().getRankSvga();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearStarCount() {
            this.starCount_ = 0L;
        }

        public static PkRankUpgrade getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder(PkRankUpgrade pkRankUpgrade) {
            return (Builder) ((Builder) DEFAULT_INSTANCE.toBuilder()).mergeFrom(pkRankUpgrade);
        }

        public static PkRankUpgrade parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (PkRankUpgrade) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static PkRankUpgrade parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (PkRankUpgrade) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static i860<PkRankUpgrade> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAnchorId(String str) {
            str.getClass();
            this.anchorId_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAnchorIdBytes(ByteString byteString) {
            byteString.getClass();
            a.checkByteStringIsUtf8(byteString);
            this.anchorId_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAnchorName(String str) {
            str.getClass();
            this.anchorName_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAnchorNameBytes(ByteString byteString) {
            byteString.getClass();
            a.checkByteStringIsUtf8(byteString);
            this.anchorName_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setRankName(String str) {
            str.getClass();
            this.rankName_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setRankNameBytes(ByteString byteString) {
            byteString.getClass();
            a.checkByteStringIsUtf8(byteString);
            this.rankName_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setRankSvga(String str) {
            str.getClass();
            this.rankSvga_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setRankSvgaBytes(ByteString byteString) {
            byteString.getClass();
            a.checkByteStringIsUtf8(byteString);
            this.rankSvga_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setStarCount(long j) {
            this.starCount_ = j;
        }

        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            boolean z = false;
            switch (C03441.f1650xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new PkRankUpgrade();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                    return null;
                case 4:
                    return new Builder();
                case 5:
                    GeneratedMessageLite.h hVar = (GeneratedMessageLite.h) obj;
                    PkRankUpgrade pkRankUpgrade = (PkRankUpgrade) obj2;
                    this.anchorId_ = hVar.f(!this.anchorId_.isEmpty(), this.anchorId_, !pkRankUpgrade.anchorId_.isEmpty(), pkRankUpgrade.anchorId_);
                    this.anchorName_ = hVar.f(!this.anchorName_.isEmpty(), this.anchorName_, !pkRankUpgrade.anchorName_.isEmpty(), pkRankUpgrade.anchorName_);
                    this.rankName_ = hVar.f(!this.rankName_.isEmpty(), this.rankName_, !pkRankUpgrade.rankName_.isEmpty(), pkRankUpgrade.rankName_);
                    long j = this.starCount_;
                    boolean z2 = j != 0;
                    long j2 = pkRankUpgrade.starCount_;
                    this.starCount_ = hVar.i(z2, j, j2 != 0, j2);
                    this.rankSvga_ = hVar.f(!this.rankSvga_.isEmpty(), this.rankSvga_, !pkRankUpgrade.rankSvga_.isEmpty(), pkRankUpgrade.rankSvga_);
                    GeneratedMessageLite.g gVar = GeneratedMessageLite.g.INSTANCE;
                    return this;
                case 6:
                    e eVar = (e) obj;
                    while (!z) {
                        try {
                            int iM = eVar.M();
                            if (iM != 0) {
                                if (iM == 10) {
                                    this.anchorId_ = eVar.L();
                                } else if (iM == 18) {
                                    this.anchorName_ = eVar.L();
                                } else if (iM == 26) {
                                    this.rankName_ = eVar.L();
                                } else if (iM == 32) {
                                    this.starCount_ = eVar.v();
                                } else if (iM == 42) {
                                    this.rankSvga_ = eVar.L();
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
                        synchronized (PkRankUpgrade.class) {
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

        @Override // com.p1.mobile.longlink.msg.livePkRank.LongLinkSocketMessage.PkRankUpgradeOrBuilder
        public String getAnchorId() {
            return this.anchorId_;
        }

        @Override // com.p1.mobile.longlink.msg.livePkRank.LongLinkSocketMessage.PkRankUpgradeOrBuilder
        public ByteString getAnchorIdBytes() {
            return ByteString.copyFromUtf8(this.anchorId_);
        }

        @Override // com.p1.mobile.longlink.msg.livePkRank.LongLinkSocketMessage.PkRankUpgradeOrBuilder
        public String getAnchorName() {
            return this.anchorName_;
        }

        @Override // com.p1.mobile.longlink.msg.livePkRank.LongLinkSocketMessage.PkRankUpgradeOrBuilder
        public ByteString getAnchorNameBytes() {
            return ByteString.copyFromUtf8(this.anchorName_);
        }

        @Override // com.p1.mobile.longlink.msg.livePkRank.LongLinkSocketMessage.PkRankUpgradeOrBuilder
        public String getRankName() {
            return this.rankName_;
        }

        @Override // com.p1.mobile.longlink.msg.livePkRank.LongLinkSocketMessage.PkRankUpgradeOrBuilder
        public ByteString getRankNameBytes() {
            return ByteString.copyFromUtf8(this.rankName_);
        }

        @Override // com.p1.mobile.longlink.msg.livePkRank.LongLinkSocketMessage.PkRankUpgradeOrBuilder
        public String getRankSvga() {
            return this.rankSvga_;
        }

        @Override // com.p1.mobile.longlink.msg.livePkRank.LongLinkSocketMessage.PkRankUpgradeOrBuilder
        public ByteString getRankSvgaBytes() {
            return ByteString.copyFromUtf8(this.rankSvga_);
        }

        public int getSerializedSize() {
            int i = ((GeneratedMessageLite) this).memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int iK = !this.anchorId_.isEmpty() ? CodedOutputStream.K(1, getAnchorId()) : 0;
            if (!this.anchorName_.isEmpty()) {
                iK += CodedOutputStream.K(2, getAnchorName());
            }
            if (!this.rankName_.isEmpty()) {
                iK += CodedOutputStream.K(3, getRankName());
            }
            long j = this.starCount_;
            if (j != 0) {
                iK += CodedOutputStream.v(4, j);
            }
            if (!this.rankSvga_.isEmpty()) {
                iK += CodedOutputStream.K(5, getRankSvga());
            }
            ((GeneratedMessageLite) this).memoizedSerializedSize = iK;
            return iK;
        }

        @Override // com.p1.mobile.longlink.msg.livePkRank.LongLinkSocketMessage.PkRankUpgradeOrBuilder
        public long getStarCount() {
            return this.starCount_;
        }

        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (!this.anchorId_.isEmpty()) {
                codedOutputStream.D0(1, getAnchorId());
            }
            if (!this.anchorName_.isEmpty()) {
                codedOutputStream.D0(2, getAnchorName());
            }
            if (!this.rankName_.isEmpty()) {
                codedOutputStream.D0(3, getRankName());
            }
            long j = this.starCount_;
            if (j != 0) {
                codedOutputStream.u0(4, j);
            }
            if (this.rankSvga_.isEmpty()) {
                return;
            }
            codedOutputStream.D0(5, getRankSvga());
        }

        public static PkRankUpgrade parseDelimitedFrom(InputStream inputStream, h hVar) throws IOException {
            return (PkRankUpgrade) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, hVar);
        }

        public static PkRankUpgrade parseFrom(ByteString byteString, h hVar) throws InvalidProtocolBufferException {
            return (PkRankUpgrade) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, hVar);
        }

        public static PkRankUpgrade parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (PkRankUpgrade) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static PkRankUpgrade parseFrom(byte[] bArr, h hVar) throws InvalidProtocolBufferException {
            return (PkRankUpgrade) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, hVar);
        }

        public static PkRankUpgrade parseFrom(InputStream inputStream) throws IOException {
            return (PkRankUpgrade) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static PkRankUpgrade parseFrom(InputStream inputStream, h hVar) throws IOException {
            return (PkRankUpgrade) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, hVar);
        }

        public static PkRankUpgrade parseFrom(e eVar) throws IOException {
            return (PkRankUpgrade) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, eVar);
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.toBuilder();
        }

        public static PkRankUpgrade parseFrom(e eVar, h hVar) throws IOException {
            return (PkRankUpgrade) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, eVar, hVar);
        }
    }
}
