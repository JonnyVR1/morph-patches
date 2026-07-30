package com.p046p1.mobile.longlink.msg.livepkitem;

import com.google.protobuf.AbstractC3403a;
import com.google.protobuf.ByteString;
import com.google.protobuf.C3407e;
import com.google.protobuf.C3410h;
import com.google.protobuf.C3414l;
import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InterfaceC3419q;
import com.google.protobuf.InvalidProtocolBufferException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Collections;
import java.util.List;
import p149l.aag0;
import p149l.bz00;
import p149l.i860;
import p149l.o6z;

/* JADX INFO: loaded from: classes8.dex */
public final class LongLinkLiveMessage {

    /* JADX INFO: renamed from: com.p1.mobile.longlink.msg.livepkitem.LongLinkLiveMessage$1 */
    public static /* synthetic */ class C44551 {

        /* JADX INFO: renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f15963xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f15963xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f15963xa1df5c61[GeneratedMessageLite.MethodToInvoke.IS_INITIALIZED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f15963xa1df5c61[GeneratedMessageLite.MethodToInvoke.MAKE_IMMUTABLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f15963xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f15963xa1df5c61[GeneratedMessageLite.MethodToInvoke.VISIT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f15963xa1df5c61[GeneratedMessageLite.MethodToInvoke.MERGE_FROM_STREAM.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f15963xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f15963xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    public interface PkItemCardOrBuilder extends o6z {
        @Override // p149l.o6z
        /* synthetic */ InterfaceC3419q getDefaultInstanceForType();

        int getDuration();

        String getIcon();

        ByteString getIconBytes();

        boolean getIsResult();

        String getName();

        ByteString getNameBytes();

        long getStartTs();

        String getText();

        ByteString getTextBytes();

        String getType();

        ByteString getTypeBytes();

        @Override // p149l.o6z
        /* synthetic */ boolean isInitialized();
    }

    public interface PkItemCardsDetailOrBuilder extends o6z {
        @Override // p149l.o6z
        /* synthetic */ InterfaceC3419q getDefaultInstanceForType();

        PkItemCard getOtherUserItemCards(int i);

        int getOtherUserItemCardsCount();

        List<PkItemCard> getOtherUserItemCardsList();

        PkItemCard getUserItemCards(int i);

        int getUserItemCardsCount();

        List<PkItemCard> getUserItemCardsList();

        @Override // p149l.o6z
        /* synthetic */ boolean isInitialized();
    }

    private LongLinkLiveMessage() {
    }

    public static void registerAllExtensions(C3410h c3410h) {
    }

    public static final class PkItemCard extends GeneratedMessageLite<PkItemCard, Builder> implements PkItemCardOrBuilder {
        private static final PkItemCard DEFAULT_INSTANCE;
        public static final int DURATION_FIELD_NUMBER = 4;
        public static final int ICON_FIELD_NUMBER = 7;
        public static final int ISRESULT_FIELD_NUMBER = 5;
        public static final int NAME_FIELD_NUMBER = 6;
        private static volatile i860<PkItemCard> PARSER = null;
        public static final int STARTTS_FIELD_NUMBER = 3;
        public static final int TEXT_FIELD_NUMBER = 2;
        public static final int TYPE_FIELD_NUMBER = 1;
        private int duration_;
        private boolean isResult_;
        private long startTs_;
        private String type_ = "";
        private String text_ = "";
        private String name_ = "";
        private String icon_ = "";

        public static final class Builder extends GeneratedMessageLite.AbstractC3380b<PkItemCard, Builder> implements PkItemCardOrBuilder {
            private Builder() {
                super(PkItemCard.DEFAULT_INSTANCE);
            }

            public Builder clearDuration() {
                copyOnWrite();
                ((PkItemCard) this.instance).clearDuration();
                return this;
            }

            public Builder clearIcon() {
                copyOnWrite();
                ((PkItemCard) this.instance).clearIcon();
                return this;
            }

            public Builder clearIsResult() {
                copyOnWrite();
                ((PkItemCard) this.instance).clearIsResult();
                return this;
            }

            public Builder clearName() {
                copyOnWrite();
                ((PkItemCard) this.instance).clearName();
                return this;
            }

            public Builder clearStartTs() {
                copyOnWrite();
                ((PkItemCard) this.instance).clearStartTs();
                return this;
            }

            public Builder clearText() {
                copyOnWrite();
                ((PkItemCard) this.instance).clearText();
                return this;
            }

            public Builder clearType() {
                copyOnWrite();
                ((PkItemCard) this.instance).clearType();
                return this;
            }

            @Override // com.p1.mobile.longlink.msg.livepkitem.LongLinkLiveMessage.PkItemCardOrBuilder
            public int getDuration() {
                return ((PkItemCard) this.instance).getDuration();
            }

            @Override // com.p1.mobile.longlink.msg.livepkitem.LongLinkLiveMessage.PkItemCardOrBuilder
            public String getIcon() {
                return ((PkItemCard) this.instance).getIcon();
            }

            @Override // com.p1.mobile.longlink.msg.livepkitem.LongLinkLiveMessage.PkItemCardOrBuilder
            public ByteString getIconBytes() {
                return ((PkItemCard) this.instance).getIconBytes();
            }

            @Override // com.p1.mobile.longlink.msg.livepkitem.LongLinkLiveMessage.PkItemCardOrBuilder
            public boolean getIsResult() {
                return ((PkItemCard) this.instance).getIsResult();
            }

            @Override // com.p1.mobile.longlink.msg.livepkitem.LongLinkLiveMessage.PkItemCardOrBuilder
            public String getName() {
                return ((PkItemCard) this.instance).getName();
            }

            @Override // com.p1.mobile.longlink.msg.livepkitem.LongLinkLiveMessage.PkItemCardOrBuilder
            public ByteString getNameBytes() {
                return ((PkItemCard) this.instance).getNameBytes();
            }

            @Override // com.p1.mobile.longlink.msg.livepkitem.LongLinkLiveMessage.PkItemCardOrBuilder
            public long getStartTs() {
                return ((PkItemCard) this.instance).getStartTs();
            }

            @Override // com.p1.mobile.longlink.msg.livepkitem.LongLinkLiveMessage.PkItemCardOrBuilder
            public String getText() {
                return ((PkItemCard) this.instance).getText();
            }

            @Override // com.p1.mobile.longlink.msg.livepkitem.LongLinkLiveMessage.PkItemCardOrBuilder
            public ByteString getTextBytes() {
                return ((PkItemCard) this.instance).getTextBytes();
            }

            @Override // com.p1.mobile.longlink.msg.livepkitem.LongLinkLiveMessage.PkItemCardOrBuilder
            public String getType() {
                return ((PkItemCard) this.instance).getType();
            }

            @Override // com.p1.mobile.longlink.msg.livepkitem.LongLinkLiveMessage.PkItemCardOrBuilder
            public ByteString getTypeBytes() {
                return ((PkItemCard) this.instance).getTypeBytes();
            }

            public Builder setDuration(int i) {
                copyOnWrite();
                ((PkItemCard) this.instance).setDuration(i);
                return this;
            }

            public Builder setIcon(String str) {
                copyOnWrite();
                ((PkItemCard) this.instance).setIcon(str);
                return this;
            }

            public Builder setIconBytes(ByteString byteString) {
                copyOnWrite();
                ((PkItemCard) this.instance).setIconBytes(byteString);
                return this;
            }

            public Builder setIsResult(boolean z) {
                copyOnWrite();
                ((PkItemCard) this.instance).setIsResult(z);
                return this;
            }

            public Builder setName(String str) {
                copyOnWrite();
                ((PkItemCard) this.instance).setName(str);
                return this;
            }

            public Builder setNameBytes(ByteString byteString) {
                copyOnWrite();
                ((PkItemCard) this.instance).setNameBytes(byteString);
                return this;
            }

            public Builder setStartTs(long j) {
                copyOnWrite();
                ((PkItemCard) this.instance).setStartTs(j);
                return this;
            }

            public Builder setText(String str) {
                copyOnWrite();
                ((PkItemCard) this.instance).setText(str);
                return this;
            }

            public Builder setTextBytes(ByteString byteString) {
                copyOnWrite();
                ((PkItemCard) this.instance).setTextBytes(byteString);
                return this;
            }

            public Builder setType(String str) {
                copyOnWrite();
                ((PkItemCard) this.instance).setType(str);
                return this;
            }

            public Builder setTypeBytes(ByteString byteString) {
                copyOnWrite();
                ((PkItemCard) this.instance).setTypeBytes(byteString);
                return this;
            }
        }

        static {
            PkItemCard pkItemCard = new PkItemCard();
            DEFAULT_INSTANCE = pkItemCard;
            pkItemCard.makeImmutable();
        }

        private PkItemCard() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearDuration() {
            this.duration_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearIcon() {
            this.icon_ = getDefaultInstance().getIcon();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearIsResult() {
            this.isResult_ = false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearName() {
            this.name_ = getDefaultInstance().getName();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearStartTs() {
            this.startTs_ = 0L;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearText() {
            this.text_ = getDefaultInstance().getText();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearType() {
            this.type_ = getDefaultInstance().getType();
        }

        public static PkItemCard getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder(PkItemCard pkItemCard) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(pkItemCard);
        }

        public static PkItemCard parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (PkItemCard) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static PkItemCard parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (PkItemCard) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static i860<PkItemCard> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setDuration(int i) {
            this.duration_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setIcon(String str) {
            str.getClass();
            this.icon_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setIconBytes(ByteString byteString) {
            byteString.getClass();
            AbstractC3403a.checkByteStringIsUtf8(byteString);
            this.icon_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setIsResult(boolean z) {
            this.isResult_ = z;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setName(String str) {
            str.getClass();
            this.name_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setNameBytes(ByteString byteString) {
            byteString.getClass();
            AbstractC3403a.checkByteStringIsUtf8(byteString);
            this.name_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setStartTs(long j) {
            this.startTs_ = j;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setText(String str) {
            str.getClass();
            this.text_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTextBytes(ByteString byteString) {
            byteString.getClass();
            AbstractC3403a.checkByteStringIsUtf8(byteString);
            this.text_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setType(String str) {
            str.getClass();
            this.type_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTypeBytes(ByteString byteString) {
            byteString.getClass();
            AbstractC3403a.checkByteStringIsUtf8(byteString);
            this.type_ = byteString.toStringUtf8();
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            boolean z = false;
            switch (C44551.f15963xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new PkItemCard();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                    return null;
                case 4:
                    return new Builder();
                case 5:
                    GeneratedMessageLite.InterfaceC3386h interfaceC3386h = (GeneratedMessageLite.InterfaceC3386h) obj;
                    PkItemCard pkItemCard = (PkItemCard) obj2;
                    this.type_ = interfaceC3386h.mo16997f(!this.type_.isEmpty(), this.type_, !pkItemCard.type_.isEmpty(), pkItemCard.type_);
                    this.text_ = interfaceC3386h.mo16997f(!this.text_.isEmpty(), this.text_, !pkItemCard.text_.isEmpty(), pkItemCard.text_);
                    long j = this.startTs_;
                    boolean z2 = j != 0;
                    long j2 = pkItemCard.startTs_;
                    this.startTs_ = interfaceC3386h.mo17000i(z2, j, j2 != 0, j2);
                    int i = this.duration_;
                    boolean z3 = i != 0;
                    int i2 = pkItemCard.duration_;
                    this.duration_ = interfaceC3386h.mo16996e(z3, i, i2 != 0, i2);
                    boolean z4 = this.isResult_;
                    boolean z5 = pkItemCard.isResult_;
                    this.isResult_ = interfaceC3386h.mo16995d(z4, z4, z5, z5);
                    this.name_ = interfaceC3386h.mo16997f(!this.name_.isEmpty(), this.name_, !pkItemCard.name_.isEmpty(), pkItemCard.name_);
                    this.icon_ = interfaceC3386h.mo16997f(!this.icon_.isEmpty(), this.icon_, !pkItemCard.icon_.isEmpty(), pkItemCard.icon_);
                    GeneratedMessageLite.C3385g c3385g = GeneratedMessageLite.C3385g.INSTANCE;
                    return this;
                case 6:
                    C3407e c3407e = (C3407e) obj;
                    while (!z) {
                        try {
                            int iM17116M = c3407e.m17116M();
                            if (iM17116M != 0) {
                                if (iM17116M == 10) {
                                    this.type_ = c3407e.m17115L();
                                } else if (iM17116M == 18) {
                                    this.text_ = c3407e.m17115L();
                                } else if (iM17116M == 24) {
                                    this.startTs_ = c3407e.m17142v();
                                } else if (iM17116M == 32) {
                                    this.duration_ = c3407e.m17141u();
                                } else if (iM17116M == 40) {
                                    this.isResult_ = c3407e.m17133m();
                                } else if (iM17116M == 50) {
                                    this.name_ = c3407e.m17115L();
                                } else if (iM17116M == 58) {
                                    this.icon_ = c3407e.m17115L();
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
                        synchronized (PkItemCard.class) {
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

        @Override // com.p1.mobile.longlink.msg.livepkitem.LongLinkLiveMessage.PkItemCardOrBuilder
        public int getDuration() {
            return this.duration_;
        }

        @Override // com.p1.mobile.longlink.msg.livepkitem.LongLinkLiveMessage.PkItemCardOrBuilder
        public String getIcon() {
            return this.icon_;
        }

        @Override // com.p1.mobile.longlink.msg.livepkitem.LongLinkLiveMessage.PkItemCardOrBuilder
        public ByteString getIconBytes() {
            return ByteString.copyFromUtf8(this.icon_);
        }

        @Override // com.p1.mobile.longlink.msg.livepkitem.LongLinkLiveMessage.PkItemCardOrBuilder
        public boolean getIsResult() {
            return this.isResult_;
        }

        @Override // com.p1.mobile.longlink.msg.livepkitem.LongLinkLiveMessage.PkItemCardOrBuilder
        public String getName() {
            return this.name_;
        }

        @Override // com.p1.mobile.longlink.msg.livepkitem.LongLinkLiveMessage.PkItemCardOrBuilder
        public ByteString getNameBytes() {
            return ByteString.copyFromUtf8(this.name_);
        }

        @Override // com.google.protobuf.InterfaceC3419q
        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int iM16901K = !this.type_.isEmpty() ? CodedOutputStream.m16901K(1, getType()) : 0;
            if (!this.text_.isEmpty()) {
                iM16901K += CodedOutputStream.m16901K(2, getText());
            }
            long j = this.startTs_;
            if (j != 0) {
                iM16901K += CodedOutputStream.m16931v(3, j);
            }
            int i2 = this.duration_;
            if (i2 != 0) {
                iM16901K += CodedOutputStream.m16929t(4, i2);
            }
            boolean z = this.isResult_;
            if (z) {
                iM16901K += CodedOutputStream.m16915f(5, z);
            }
            if (!this.name_.isEmpty()) {
                iM16901K += CodedOutputStream.m16901K(6, getName());
            }
            if (!this.icon_.isEmpty()) {
                iM16901K += CodedOutputStream.m16901K(7, getIcon());
            }
            this.memoizedSerializedSize = iM16901K;
            return iM16901K;
        }

        @Override // com.p1.mobile.longlink.msg.livepkitem.LongLinkLiveMessage.PkItemCardOrBuilder
        public long getStartTs() {
            return this.startTs_;
        }

        @Override // com.p1.mobile.longlink.msg.livepkitem.LongLinkLiveMessage.PkItemCardOrBuilder
        public String getText() {
            return this.text_;
        }

        @Override // com.p1.mobile.longlink.msg.livepkitem.LongLinkLiveMessage.PkItemCardOrBuilder
        public ByteString getTextBytes() {
            return ByteString.copyFromUtf8(this.text_);
        }

        @Override // com.p1.mobile.longlink.msg.livepkitem.LongLinkLiveMessage.PkItemCardOrBuilder
        public String getType() {
            return this.type_;
        }

        @Override // com.p1.mobile.longlink.msg.livepkitem.LongLinkLiveMessage.PkItemCardOrBuilder
        public ByteString getTypeBytes() {
            return ByteString.copyFromUtf8(this.type_);
        }

        @Override // com.google.protobuf.InterfaceC3419q
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (!this.type_.isEmpty()) {
                codedOutputStream.mo16939D0(1, getType());
            }
            if (!this.text_.isEmpty()) {
                codedOutputStream.mo16939D0(2, getText());
            }
            long j = this.startTs_;
            if (j != 0) {
                codedOutputStream.m16972u0(3, j);
            }
            int i = this.duration_;
            if (i != 0) {
                codedOutputStream.mo16970s0(4, i);
            }
            boolean z = this.isResult_;
            if (z) {
                codedOutputStream.mo16950a0(5, z);
            }
            if (!this.name_.isEmpty()) {
                codedOutputStream.mo16939D0(6, getName());
            }
            if (this.icon_.isEmpty()) {
                return;
            }
            codedOutputStream.mo16939D0(7, getIcon());
        }

        public static PkItemCard parseDelimitedFrom(InputStream inputStream, C3410h c3410h) throws IOException {
            return (PkItemCard) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, c3410h);
        }

        public static PkItemCard parseFrom(ByteString byteString, C3410h c3410h) throws InvalidProtocolBufferException {
            return (PkItemCard) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, c3410h);
        }

        public static PkItemCard parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (PkItemCard) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static PkItemCard parseFrom(byte[] bArr, C3410h c3410h) throws InvalidProtocolBufferException {
            return (PkItemCard) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, c3410h);
        }

        public static PkItemCard parseFrom(InputStream inputStream) throws IOException {
            return (PkItemCard) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static PkItemCard parseFrom(InputStream inputStream, C3410h c3410h) throws IOException {
            return (PkItemCard) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, c3410h);
        }

        public static PkItemCard parseFrom(C3407e c3407e) throws IOException {
            return (PkItemCard) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, c3407e);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static PkItemCard parseFrom(C3407e c3407e, C3410h c3410h) throws IOException {
            return (PkItemCard) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, c3407e, c3410h);
        }
    }

    public static final class PkItemCardsDetail extends GeneratedMessageLite<PkItemCardsDetail, Builder> implements PkItemCardsDetailOrBuilder {
        private static final PkItemCardsDetail DEFAULT_INSTANCE;
        public static final int OTHERUSERITEMCARDS_FIELD_NUMBER = 2;
        private static volatile i860<PkItemCardsDetail> PARSER = null;
        public static final int USERITEMCARDS_FIELD_NUMBER = 1;
        private C3414l.h<PkItemCard> userItemCards_ = GeneratedMessageLite.emptyProtobufList();
        private C3414l.h<PkItemCard> otherUserItemCards_ = GeneratedMessageLite.emptyProtobufList();

        static {
            PkItemCardsDetail pkItemCardsDetail = new PkItemCardsDetail();
            DEFAULT_INSTANCE = pkItemCardsDetail;
            pkItemCardsDetail.makeImmutable();
        }

        private PkItemCardsDetail() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllOtherUserItemCards(Iterable<? extends PkItemCard> iterable) {
            ensureOtherUserItemCardsIsMutable();
            AbstractC3403a.addAll(iterable, this.otherUserItemCards_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllUserItemCards(Iterable<? extends PkItemCard> iterable) {
            ensureUserItemCardsIsMutable();
            AbstractC3403a.addAll(iterable, this.userItemCards_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addOtherUserItemCards(PkItemCard.Builder builder) {
            ensureOtherUserItemCardsIsMutable();
            this.otherUserItemCards_.add(builder.build());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addUserItemCards(PkItemCard.Builder builder) {
            ensureUserItemCardsIsMutable();
            this.userItemCards_.add(builder.build());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearOtherUserItemCards() {
            this.otherUserItemCards_ = GeneratedMessageLite.emptyProtobufList();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearUserItemCards() {
            this.userItemCards_ = GeneratedMessageLite.emptyProtobufList();
        }

        private void ensureOtherUserItemCardsIsMutable() {
            if (this.otherUserItemCards_.mo17085q()) {
                return;
            }
            this.otherUserItemCards_ = GeneratedMessageLite.mutableCopy(this.otherUserItemCards_);
        }

        private void ensureUserItemCardsIsMutable() {
            if (this.userItemCards_.mo17085q()) {
                return;
            }
            this.userItemCards_ = GeneratedMessageLite.mutableCopy(this.userItemCards_);
        }

        public static PkItemCardsDetail getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder(PkItemCardsDetail pkItemCardsDetail) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(pkItemCardsDetail);
        }

        public static PkItemCardsDetail parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (PkItemCardsDetail) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static PkItemCardsDetail parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (PkItemCardsDetail) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static i860<PkItemCardsDetail> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void removeOtherUserItemCards(int i) {
            ensureOtherUserItemCardsIsMutable();
            this.otherUserItemCards_.remove(i);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void removeUserItemCards(int i) {
            ensureUserItemCardsIsMutable();
            this.userItemCards_.remove(i);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setOtherUserItemCards(int i, PkItemCard.Builder builder) {
            ensureOtherUserItemCardsIsMutable();
            this.otherUserItemCards_.set(i, builder.build());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setUserItemCards(int i, PkItemCard.Builder builder) {
            ensureUserItemCardsIsMutable();
            this.userItemCards_.set(i, builder.build());
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (C44551.f15963xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new PkItemCardsDetail();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                    this.userItemCards_.mo17084n();
                    this.otherUserItemCards_.mo17084n();
                    return null;
                case 4:
                    return new Builder();
                case 5:
                    GeneratedMessageLite.InterfaceC3386h interfaceC3386h = (GeneratedMessageLite.InterfaceC3386h) obj;
                    PkItemCardsDetail pkItemCardsDetail = (PkItemCardsDetail) obj2;
                    this.userItemCards_ = interfaceC3386h.mo16998g(this.userItemCards_, pkItemCardsDetail.userItemCards_);
                    this.otherUserItemCards_ = interfaceC3386h.mo16998g(this.otherUserItemCards_, pkItemCardsDetail.otherUserItemCards_);
                    GeneratedMessageLite.C3385g c3385g = GeneratedMessageLite.C3385g.INSTANCE;
                    return this;
                case 6:
                    C3407e c3407e = (C3407e) obj;
                    C3410h c3410h = (C3410h) obj2;
                    boolean z = false;
                    while (!z) {
                        try {
                            int iM17116M = c3407e.m17116M();
                            if (iM17116M != 0) {
                                if (iM17116M == 10) {
                                    if (!this.userItemCards_.mo17085q()) {
                                        this.userItemCards_ = GeneratedMessageLite.mutableCopy(this.userItemCards_);
                                    }
                                    this.userItemCards_.add((PkItemCard) c3407e.m17143w(PkItemCard.parser(), c3410h));
                                } else if (iM17116M == 18) {
                                    if (!this.otherUserItemCards_.mo17085q()) {
                                        this.otherUserItemCards_ = GeneratedMessageLite.mutableCopy(this.otherUserItemCards_);
                                    }
                                    this.otherUserItemCards_.add((PkItemCard) c3407e.m17143w(PkItemCard.parser(), c3410h));
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
                        synchronized (PkItemCardsDetail.class) {
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

        @Override // com.p1.mobile.longlink.msg.livepkitem.LongLinkLiveMessage.PkItemCardsDetailOrBuilder
        public PkItemCard getOtherUserItemCards(int i) {
            return this.otherUserItemCards_.get(i);
        }

        @Override // com.p1.mobile.longlink.msg.livepkitem.LongLinkLiveMessage.PkItemCardsDetailOrBuilder
        public int getOtherUserItemCardsCount() {
            return this.otherUserItemCards_.size();
        }

        @Override // com.p1.mobile.longlink.msg.livepkitem.LongLinkLiveMessage.PkItemCardsDetailOrBuilder
        public List<PkItemCard> getOtherUserItemCardsList() {
            return this.otherUserItemCards_;
        }

        public PkItemCardOrBuilder getOtherUserItemCardsOrBuilder(int i) {
            return this.otherUserItemCards_.get(i);
        }

        public List<? extends PkItemCardOrBuilder> getOtherUserItemCardsOrBuilderList() {
            return this.otherUserItemCards_;
        }

        @Override // com.google.protobuf.InterfaceC3419q
        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int iM16893C = 0;
            for (int i2 = 0; i2 < this.userItemCards_.size(); i2++) {
                iM16893C += CodedOutputStream.m16893C(1, this.userItemCards_.get(i2));
            }
            for (int i3 = 0; i3 < this.otherUserItemCards_.size(); i3++) {
                iM16893C += CodedOutputStream.m16893C(2, this.otherUserItemCards_.get(i3));
            }
            this.memoizedSerializedSize = iM16893C;
            return iM16893C;
        }

        @Override // com.p1.mobile.longlink.msg.livepkitem.LongLinkLiveMessage.PkItemCardsDetailOrBuilder
        public PkItemCard getUserItemCards(int i) {
            return this.userItemCards_.get(i);
        }

        @Override // com.p1.mobile.longlink.msg.livepkitem.LongLinkLiveMessage.PkItemCardsDetailOrBuilder
        public int getUserItemCardsCount() {
            return this.userItemCards_.size();
        }

        @Override // com.p1.mobile.longlink.msg.livepkitem.LongLinkLiveMessage.PkItemCardsDetailOrBuilder
        public List<PkItemCard> getUserItemCardsList() {
            return this.userItemCards_;
        }

        public PkItemCardOrBuilder getUserItemCardsOrBuilder(int i) {
            return this.userItemCards_.get(i);
        }

        public List<? extends PkItemCardOrBuilder> getUserItemCardsOrBuilderList() {
            return this.userItemCards_;
        }

        @Override // com.google.protobuf.InterfaceC3419q
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            for (int i = 0; i < this.userItemCards_.size(); i++) {
                codedOutputStream.mo16974w0(1, this.userItemCards_.get(i));
            }
            for (int i2 = 0; i2 < this.otherUserItemCards_.size(); i2++) {
                codedOutputStream.mo16974w0(2, this.otherUserItemCards_.get(i2));
            }
        }

        public static PkItemCardsDetail parseDelimitedFrom(InputStream inputStream, C3410h c3410h) throws IOException {
            return (PkItemCardsDetail) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, c3410h);
        }

        public static PkItemCardsDetail parseFrom(ByteString byteString, C3410h c3410h) throws InvalidProtocolBufferException {
            return (PkItemCardsDetail) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, c3410h);
        }

        public static final class Builder extends GeneratedMessageLite.AbstractC3380b<PkItemCardsDetail, Builder> implements PkItemCardsDetailOrBuilder {
            private Builder() {
                super(PkItemCardsDetail.DEFAULT_INSTANCE);
            }

            public Builder addAllOtherUserItemCards(Iterable<? extends PkItemCard> iterable) {
                copyOnWrite();
                ((PkItemCardsDetail) this.instance).addAllOtherUserItemCards(iterable);
                return this;
            }

            public Builder addAllUserItemCards(Iterable<? extends PkItemCard> iterable) {
                copyOnWrite();
                ((PkItemCardsDetail) this.instance).addAllUserItemCards(iterable);
                return this;
            }

            public Builder addOtherUserItemCards(PkItemCard pkItemCard) {
                copyOnWrite();
                ((PkItemCardsDetail) this.instance).addOtherUserItemCards(pkItemCard);
                return this;
            }

            public Builder addUserItemCards(PkItemCard pkItemCard) {
                copyOnWrite();
                ((PkItemCardsDetail) this.instance).addUserItemCards(pkItemCard);
                return this;
            }

            public Builder clearOtherUserItemCards() {
                copyOnWrite();
                ((PkItemCardsDetail) this.instance).clearOtherUserItemCards();
                return this;
            }

            public Builder clearUserItemCards() {
                copyOnWrite();
                ((PkItemCardsDetail) this.instance).clearUserItemCards();
                return this;
            }

            @Override // com.p1.mobile.longlink.msg.livepkitem.LongLinkLiveMessage.PkItemCardsDetailOrBuilder
            public PkItemCard getOtherUserItemCards(int i) {
                return ((PkItemCardsDetail) this.instance).getOtherUserItemCards(i);
            }

            @Override // com.p1.mobile.longlink.msg.livepkitem.LongLinkLiveMessage.PkItemCardsDetailOrBuilder
            public int getOtherUserItemCardsCount() {
                return ((PkItemCardsDetail) this.instance).getOtherUserItemCardsCount();
            }

            @Override // com.p1.mobile.longlink.msg.livepkitem.LongLinkLiveMessage.PkItemCardsDetailOrBuilder
            public List<PkItemCard> getOtherUserItemCardsList() {
                return Collections.unmodifiableList(((PkItemCardsDetail) this.instance).getOtherUserItemCardsList());
            }

            @Override // com.p1.mobile.longlink.msg.livepkitem.LongLinkLiveMessage.PkItemCardsDetailOrBuilder
            public PkItemCard getUserItemCards(int i) {
                return ((PkItemCardsDetail) this.instance).getUserItemCards(i);
            }

            @Override // com.p1.mobile.longlink.msg.livepkitem.LongLinkLiveMessage.PkItemCardsDetailOrBuilder
            public int getUserItemCardsCount() {
                return ((PkItemCardsDetail) this.instance).getUserItemCardsCount();
            }

            @Override // com.p1.mobile.longlink.msg.livepkitem.LongLinkLiveMessage.PkItemCardsDetailOrBuilder
            public List<PkItemCard> getUserItemCardsList() {
                return Collections.unmodifiableList(((PkItemCardsDetail) this.instance).getUserItemCardsList());
            }

            public Builder removeOtherUserItemCards(int i) {
                copyOnWrite();
                ((PkItemCardsDetail) this.instance).removeOtherUserItemCards(i);
                return this;
            }

            public Builder removeUserItemCards(int i) {
                copyOnWrite();
                ((PkItemCardsDetail) this.instance).removeUserItemCards(i);
                return this;
            }

            public Builder setOtherUserItemCards(int i, PkItemCard pkItemCard) {
                copyOnWrite();
                ((PkItemCardsDetail) this.instance).setOtherUserItemCards(i, pkItemCard);
                return this;
            }

            public Builder setUserItemCards(int i, PkItemCard pkItemCard) {
                copyOnWrite();
                ((PkItemCardsDetail) this.instance).setUserItemCards(i, pkItemCard);
                return this;
            }

            public Builder addOtherUserItemCards(int i, PkItemCard pkItemCard) {
                copyOnWrite();
                ((PkItemCardsDetail) this.instance).addOtherUserItemCards(i, pkItemCard);
                return this;
            }

            public Builder addUserItemCards(int i, PkItemCard pkItemCard) {
                copyOnWrite();
                ((PkItemCardsDetail) this.instance).addUserItemCards(i, pkItemCard);
                return this;
            }

            public Builder setOtherUserItemCards(int i, PkItemCard.Builder builder) {
                copyOnWrite();
                ((PkItemCardsDetail) this.instance).setOtherUserItemCards(i, builder);
                return this;
            }

            public Builder setUserItemCards(int i, PkItemCard.Builder builder) {
                copyOnWrite();
                ((PkItemCardsDetail) this.instance).setUserItemCards(i, builder);
                return this;
            }

            public Builder addOtherUserItemCards(PkItemCard.Builder builder) {
                copyOnWrite();
                ((PkItemCardsDetail) this.instance).addOtherUserItemCards(builder);
                return this;
            }

            public Builder addUserItemCards(PkItemCard.Builder builder) {
                copyOnWrite();
                ((PkItemCardsDetail) this.instance).addUserItemCards(builder);
                return this;
            }

            public Builder addOtherUserItemCards(int i, PkItemCard.Builder builder) {
                copyOnWrite();
                ((PkItemCardsDetail) this.instance).addOtherUserItemCards(i, builder);
                return this;
            }

            public Builder addUserItemCards(int i, PkItemCard.Builder builder) {
                copyOnWrite();
                ((PkItemCardsDetail) this.instance).addUserItemCards(i, builder);
                return this;
            }
        }

        public static PkItemCardsDetail parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (PkItemCardsDetail) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static PkItemCardsDetail parseFrom(byte[] bArr, C3410h c3410h) throws InvalidProtocolBufferException {
            return (PkItemCardsDetail) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, c3410h);
        }

        public static PkItemCardsDetail parseFrom(InputStream inputStream) throws IOException {
            return (PkItemCardsDetail) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static PkItemCardsDetail parseFrom(InputStream inputStream, C3410h c3410h) throws IOException {
            return (PkItemCardsDetail) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, c3410h);
        }

        public static PkItemCardsDetail parseFrom(C3407e c3407e) throws IOException {
            return (PkItemCardsDetail) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, c3407e);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addOtherUserItemCards(int i, PkItemCard pkItemCard) {
            pkItemCard.getClass();
            ensureOtherUserItemCardsIsMutable();
            this.otherUserItemCards_.add(i, pkItemCard);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addUserItemCards(int i, PkItemCard pkItemCard) {
            pkItemCard.getClass();
            ensureUserItemCardsIsMutable();
            this.userItemCards_.add(i, pkItemCard);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static PkItemCardsDetail parseFrom(C3407e c3407e, C3410h c3410h) throws IOException {
            return (PkItemCardsDetail) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, c3407e, c3410h);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setOtherUserItemCards(int i, PkItemCard pkItemCard) {
            pkItemCard.getClass();
            ensureOtherUserItemCardsIsMutable();
            this.otherUserItemCards_.set(i, pkItemCard);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setUserItemCards(int i, PkItemCard pkItemCard) {
            pkItemCard.getClass();
            ensureUserItemCardsIsMutable();
            this.userItemCards_.set(i, pkItemCard);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addOtherUserItemCards(PkItemCard pkItemCard) {
            pkItemCard.getClass();
            ensureOtherUserItemCardsIsMutable();
            this.otherUserItemCards_.add(pkItemCard);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addUserItemCards(PkItemCard pkItemCard) {
            pkItemCard.getClass();
            ensureUserItemCardsIsMutable();
            this.userItemCards_.add(pkItemCard);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addOtherUserItemCards(int i, PkItemCard.Builder builder) {
            ensureOtherUserItemCardsIsMutable();
            this.otherUserItemCards_.add(i, builder.build());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addUserItemCards(int i, PkItemCard.Builder builder) {
            ensureUserItemCardsIsMutable();
            this.userItemCards_.add(i, builder.build());
        }
    }
}
