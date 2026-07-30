package com.p051p1.mobile.longlink.msg.liveroom;

import com.google.protobuf.AbstractC3426a;
import com.google.protobuf.ByteString;
import com.google.protobuf.C3430e;
import com.google.protobuf.C3433h;
import com.google.protobuf.C3437l;
import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InterfaceC3442q;
import com.google.protobuf.InvalidProtocolBufferException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Collections;
import java.util.List;
import p153l.iig0;
import p153l.l710;
import p153l.lfz;
import p153l.ng60;

/* JADX INFO: loaded from: classes8.dex */
public final class LongLinkAnchorGrowthMsg {

    /* JADX INFO: renamed from: com.p1.mobile.longlink.msg.liveroom.LongLinkAnchorGrowthMsg$1 */
    public static /* synthetic */ class C46221 {

        /* JADX INFO: renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f16686xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f16686xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f16686xa1df5c61[GeneratedMessageLite.MethodToInvoke.IS_INITIALIZED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f16686xa1df5c61[GeneratedMessageLite.MethodToInvoke.MAKE_IMMUTABLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f16686xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f16686xa1df5c61[GeneratedMessageLite.MethodToInvoke.VISIT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f16686xa1df5c61[GeneratedMessageLite.MethodToInvoke.MERGE_FROM_STREAM.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f16686xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f16686xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    public interface AnchorGiftOrBuilder extends lfz {
        String getDay();

        ByteString getDayBytes();

        @Override // p153l.lfz
        /* synthetic */ InterfaceC3442q getDefaultInstanceForType();

        String getImage();

        ByteString getImageBytes();

        @Override // p153l.lfz
        /* synthetic */ boolean isInitialized();
    }

    public interface VoiceAnchorGrowthMessageOrBuilder extends lfz {
        @Override // p153l.lfz
        /* synthetic */ InterfaceC3442q getDefaultInstanceForType();

        AnchorGift getGifts(int i);

        int getGiftsCount();

        List<AnchorGift> getGiftsList();

        String getScheme();

        ByteString getSchemeBytes();

        String getSubTitle();

        ByteString getSubTitleBytes();

        String getTitle();

        ByteString getTitleBytes();

        @Override // p153l.lfz
        /* synthetic */ boolean isInitialized();
    }

    private LongLinkAnchorGrowthMsg() {
    }

    public static void registerAllExtensions(C3433h c3433h) {
    }

    public static final class AnchorGift extends GeneratedMessageLite<AnchorGift, Builder> implements AnchorGiftOrBuilder {
        public static final int DAY_FIELD_NUMBER = 2;
        private static final AnchorGift DEFAULT_INSTANCE;
        public static final int IMAGE_FIELD_NUMBER = 1;
        private static volatile ng60<AnchorGift> PARSER;
        private String image_ = "";
        private String day_ = "";

        public static final class Builder extends GeneratedMessageLite.AbstractC3403b<AnchorGift, Builder> implements AnchorGiftOrBuilder {
            private Builder() {
                super(AnchorGift.DEFAULT_INSTANCE);
            }

            public Builder clearDay() {
                copyOnWrite();
                ((AnchorGift) this.instance).clearDay();
                return this;
            }

            public Builder clearImage() {
                copyOnWrite();
                ((AnchorGift) this.instance).clearImage();
                return this;
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkAnchorGrowthMsg.AnchorGiftOrBuilder
            public String getDay() {
                return ((AnchorGift) this.instance).getDay();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkAnchorGrowthMsg.AnchorGiftOrBuilder
            public ByteString getDayBytes() {
                return ((AnchorGift) this.instance).getDayBytes();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkAnchorGrowthMsg.AnchorGiftOrBuilder
            public String getImage() {
                return ((AnchorGift) this.instance).getImage();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkAnchorGrowthMsg.AnchorGiftOrBuilder
            public ByteString getImageBytes() {
                return ((AnchorGift) this.instance).getImageBytes();
            }

            public Builder setDay(String str) {
                copyOnWrite();
                ((AnchorGift) this.instance).setDay(str);
                return this;
            }

            public Builder setDayBytes(ByteString byteString) {
                copyOnWrite();
                ((AnchorGift) this.instance).setDayBytes(byteString);
                return this;
            }

            public Builder setImage(String str) {
                copyOnWrite();
                ((AnchorGift) this.instance).setImage(str);
                return this;
            }

            public Builder setImageBytes(ByteString byteString) {
                copyOnWrite();
                ((AnchorGift) this.instance).setImageBytes(byteString);
                return this;
            }
        }

        static {
            AnchorGift anchorGift = new AnchorGift();
            DEFAULT_INSTANCE = anchorGift;
            anchorGift.makeImmutable();
        }

        private AnchorGift() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearDay() {
            this.day_ = getDefaultInstance().getDay();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearImage() {
            this.image_ = getDefaultInstance().getImage();
        }

        public static AnchorGift getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder(AnchorGift anchorGift) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(anchorGift);
        }

        public static AnchorGift parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (AnchorGift) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static AnchorGift parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (AnchorGift) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static ng60<AnchorGift> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setDay(String str) {
            str.getClass();
            this.day_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setDayBytes(ByteString byteString) {
            byteString.getClass();
            AbstractC3426a.checkByteStringIsUtf8(byteString);
            this.day_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setImage(String str) {
            str.getClass();
            this.image_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setImageBytes(ByteString byteString) {
            byteString.getClass();
            AbstractC3426a.checkByteStringIsUtf8(byteString);
            this.image_ = byteString.toStringUtf8();
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (C46221.f16686xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new AnchorGift();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                    return null;
                case 4:
                    return new Builder();
                case 5:
                    GeneratedMessageLite.InterfaceC3409h interfaceC3409h = (GeneratedMessageLite.InterfaceC3409h) obj;
                    AnchorGift anchorGift = (AnchorGift) obj2;
                    this.image_ = interfaceC3409h.mo17052f(!this.image_.isEmpty(), this.image_, !anchorGift.image_.isEmpty(), anchorGift.image_);
                    this.day_ = interfaceC3409h.mo17052f(!this.day_.isEmpty(), this.day_, true ^ anchorGift.day_.isEmpty(), anchorGift.day_);
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
                                    this.image_ = c3430e.m17170L();
                                } else if (iM17171M == 18) {
                                    this.day_ = c3430e.m17170L();
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
                        synchronized (AnchorGift.class) {
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

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkAnchorGrowthMsg.AnchorGiftOrBuilder
        public String getDay() {
            return this.day_;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkAnchorGrowthMsg.AnchorGiftOrBuilder
        public ByteString getDayBytes() {
            return ByteString.copyFromUtf8(this.day_);
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkAnchorGrowthMsg.AnchorGiftOrBuilder
        public String getImage() {
            return this.image_;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkAnchorGrowthMsg.AnchorGiftOrBuilder
        public ByteString getImageBytes() {
            return ByteString.copyFromUtf8(this.image_);
        }

        @Override // com.google.protobuf.InterfaceC3442q
        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int iM16956K = !this.image_.isEmpty() ? CodedOutputStream.m16956K(1, getImage()) : 0;
            if (!this.day_.isEmpty()) {
                iM16956K += CodedOutputStream.m16956K(2, getDay());
            }
            this.memoizedSerializedSize = iM16956K;
            return iM16956K;
        }

        @Override // com.google.protobuf.InterfaceC3442q
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (!this.image_.isEmpty()) {
                codedOutputStream.mo16994D0(1, getImage());
            }
            if (this.day_.isEmpty()) {
                return;
            }
            codedOutputStream.mo16994D0(2, getDay());
        }

        public static AnchorGift parseDelimitedFrom(InputStream inputStream, C3433h c3433h) throws IOException {
            return (AnchorGift) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, c3433h);
        }

        public static AnchorGift parseFrom(ByteString byteString, C3433h c3433h) throws InvalidProtocolBufferException {
            return (AnchorGift) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, c3433h);
        }

        public static AnchorGift parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (AnchorGift) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static AnchorGift parseFrom(byte[] bArr, C3433h c3433h) throws InvalidProtocolBufferException {
            return (AnchorGift) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, c3433h);
        }

        public static AnchorGift parseFrom(InputStream inputStream) throws IOException {
            return (AnchorGift) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static AnchorGift parseFrom(InputStream inputStream, C3433h c3433h) throws IOException {
            return (AnchorGift) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, c3433h);
        }

        public static AnchorGift parseFrom(C3430e c3430e) throws IOException {
            return (AnchorGift) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, c3430e);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static AnchorGift parseFrom(C3430e c3430e, C3433h c3433h) throws IOException {
            return (AnchorGift) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, c3430e, c3433h);
        }
    }

    public static final class VoiceAnchorGrowthMessage extends GeneratedMessageLite<VoiceAnchorGrowthMessage, Builder> implements VoiceAnchorGrowthMessageOrBuilder {
        private static final VoiceAnchorGrowthMessage DEFAULT_INSTANCE;
        public static final int GIFTS_FIELD_NUMBER = 4;
        private static volatile ng60<VoiceAnchorGrowthMessage> PARSER = null;
        public static final int SCHEME_FIELD_NUMBER = 3;
        public static final int SUBTITLE_FIELD_NUMBER = 2;
        public static final int TITLE_FIELD_NUMBER = 1;
        private int bitField0_;
        private String title_ = "";
        private String subTitle_ = "";
        private String scheme_ = "";
        private C3437l.h<AnchorGift> gifts_ = GeneratedMessageLite.emptyProtobufList();

        static {
            VoiceAnchorGrowthMessage voiceAnchorGrowthMessage = new VoiceAnchorGrowthMessage();
            DEFAULT_INSTANCE = voiceAnchorGrowthMessage;
            voiceAnchorGrowthMessage.makeImmutable();
        }

        private VoiceAnchorGrowthMessage() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllGifts(Iterable<? extends AnchorGift> iterable) {
            ensureGiftsIsMutable();
            AbstractC3426a.addAll(iterable, this.gifts_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addGifts(AnchorGift.Builder builder) {
            ensureGiftsIsMutable();
            this.gifts_.add(builder.build());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearGifts() {
            this.gifts_ = GeneratedMessageLite.emptyProtobufList();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearScheme() {
            this.scheme_ = getDefaultInstance().getScheme();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearSubTitle() {
            this.subTitle_ = getDefaultInstance().getSubTitle();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearTitle() {
            this.title_ = getDefaultInstance().getTitle();
        }

        private void ensureGiftsIsMutable() {
            if (this.gifts_.mo17140q()) {
                return;
            }
            this.gifts_ = GeneratedMessageLite.mutableCopy(this.gifts_);
        }

        public static VoiceAnchorGrowthMessage getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder(VoiceAnchorGrowthMessage voiceAnchorGrowthMessage) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(voiceAnchorGrowthMessage);
        }

        public static VoiceAnchorGrowthMessage parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (VoiceAnchorGrowthMessage) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static VoiceAnchorGrowthMessage parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (VoiceAnchorGrowthMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static ng60<VoiceAnchorGrowthMessage> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void removeGifts(int i) {
            ensureGiftsIsMutable();
            this.gifts_.remove(i);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setGifts(int i, AnchorGift.Builder builder) {
            ensureGiftsIsMutable();
            this.gifts_.set(i, builder.build());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setScheme(String str) {
            str.getClass();
            this.scheme_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSchemeBytes(ByteString byteString) {
            byteString.getClass();
            AbstractC3426a.checkByteStringIsUtf8(byteString);
            this.scheme_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSubTitle(String str) {
            str.getClass();
            this.subTitle_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSubTitleBytes(ByteString byteString) {
            byteString.getClass();
            AbstractC3426a.checkByteStringIsUtf8(byteString);
            this.subTitle_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTitle(String str) {
            str.getClass();
            this.title_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTitleBytes(ByteString byteString) {
            byteString.getClass();
            AbstractC3426a.checkByteStringIsUtf8(byteString);
            this.title_ = byteString.toStringUtf8();
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (C46221.f16686xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new VoiceAnchorGrowthMessage();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                    this.gifts_.mo17139n();
                    return null;
                case 4:
                    return new Builder();
                case 5:
                    GeneratedMessageLite.InterfaceC3409h interfaceC3409h = (GeneratedMessageLite.InterfaceC3409h) obj;
                    VoiceAnchorGrowthMessage voiceAnchorGrowthMessage = (VoiceAnchorGrowthMessage) obj2;
                    this.title_ = interfaceC3409h.mo17052f(!this.title_.isEmpty(), this.title_, !voiceAnchorGrowthMessage.title_.isEmpty(), voiceAnchorGrowthMessage.title_);
                    this.subTitle_ = interfaceC3409h.mo17052f(!this.subTitle_.isEmpty(), this.subTitle_, !voiceAnchorGrowthMessage.subTitle_.isEmpty(), voiceAnchorGrowthMessage.subTitle_);
                    this.scheme_ = interfaceC3409h.mo17052f(!this.scheme_.isEmpty(), this.scheme_, true ^ voiceAnchorGrowthMessage.scheme_.isEmpty(), voiceAnchorGrowthMessage.scheme_);
                    this.gifts_ = interfaceC3409h.mo17053g(this.gifts_, voiceAnchorGrowthMessage.gifts_);
                    if (interfaceC3409h == GeneratedMessageLite.C3408g.INSTANCE) {
                        this.bitField0_ |= voiceAnchorGrowthMessage.bitField0_;
                    }
                    return this;
                case 6:
                    C3430e c3430e = (C3430e) obj;
                    C3433h c3433h = (C3433h) obj2;
                    boolean z = false;
                    while (!z) {
                        try {
                            int iM17171M = c3430e.m17171M();
                            if (iM17171M != 0) {
                                if (iM17171M == 10) {
                                    this.title_ = c3430e.m17170L();
                                } else if (iM17171M == 18) {
                                    this.subTitle_ = c3430e.m17170L();
                                } else if (iM17171M == 26) {
                                    this.scheme_ = c3430e.m17170L();
                                } else if (iM17171M == 34) {
                                    if (!this.gifts_.mo17140q()) {
                                        this.gifts_ = GeneratedMessageLite.mutableCopy(this.gifts_);
                                    }
                                    this.gifts_.add((AnchorGift) c3430e.m17198w(AnchorGift.parser(), c3433h));
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
                        synchronized (VoiceAnchorGrowthMessage.class) {
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

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkAnchorGrowthMsg.VoiceAnchorGrowthMessageOrBuilder
        public AnchorGift getGifts(int i) {
            return this.gifts_.get(i);
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkAnchorGrowthMsg.VoiceAnchorGrowthMessageOrBuilder
        public int getGiftsCount() {
            return this.gifts_.size();
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkAnchorGrowthMsg.VoiceAnchorGrowthMessageOrBuilder
        public List<AnchorGift> getGiftsList() {
            return this.gifts_;
        }

        public AnchorGiftOrBuilder getGiftsOrBuilder(int i) {
            return this.gifts_.get(i);
        }

        public List<? extends AnchorGiftOrBuilder> getGiftsOrBuilderList() {
            return this.gifts_;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkAnchorGrowthMsg.VoiceAnchorGrowthMessageOrBuilder
        public String getScheme() {
            return this.scheme_;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkAnchorGrowthMsg.VoiceAnchorGrowthMessageOrBuilder
        public ByteString getSchemeBytes() {
            return ByteString.copyFromUtf8(this.scheme_);
        }

        @Override // com.google.protobuf.InterfaceC3442q
        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int iM16956K = !this.title_.isEmpty() ? CodedOutputStream.m16956K(1, getTitle()) : 0;
            if (!this.subTitle_.isEmpty()) {
                iM16956K += CodedOutputStream.m16956K(2, getSubTitle());
            }
            if (!this.scheme_.isEmpty()) {
                iM16956K += CodedOutputStream.m16956K(3, getScheme());
            }
            for (int i2 = 0; i2 < this.gifts_.size(); i2++) {
                iM16956K += CodedOutputStream.m16948C(4, this.gifts_.get(i2));
            }
            this.memoizedSerializedSize = iM16956K;
            return iM16956K;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkAnchorGrowthMsg.VoiceAnchorGrowthMessageOrBuilder
        public String getSubTitle() {
            return this.subTitle_;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkAnchorGrowthMsg.VoiceAnchorGrowthMessageOrBuilder
        public ByteString getSubTitleBytes() {
            return ByteString.copyFromUtf8(this.subTitle_);
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkAnchorGrowthMsg.VoiceAnchorGrowthMessageOrBuilder
        public String getTitle() {
            return this.title_;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkAnchorGrowthMsg.VoiceAnchorGrowthMessageOrBuilder
        public ByteString getTitleBytes() {
            return ByteString.copyFromUtf8(this.title_);
        }

        @Override // com.google.protobuf.InterfaceC3442q
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (!this.title_.isEmpty()) {
                codedOutputStream.mo16994D0(1, getTitle());
            }
            if (!this.subTitle_.isEmpty()) {
                codedOutputStream.mo16994D0(2, getSubTitle());
            }
            if (!this.scheme_.isEmpty()) {
                codedOutputStream.mo16994D0(3, getScheme());
            }
            for (int i = 0; i < this.gifts_.size(); i++) {
                codedOutputStream.mo17029w0(4, this.gifts_.get(i));
            }
        }

        public static VoiceAnchorGrowthMessage parseDelimitedFrom(InputStream inputStream, C3433h c3433h) throws IOException {
            return (VoiceAnchorGrowthMessage) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, c3433h);
        }

        public static VoiceAnchorGrowthMessage parseFrom(ByteString byteString, C3433h c3433h) throws InvalidProtocolBufferException {
            return (VoiceAnchorGrowthMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, c3433h);
        }

        public static final class Builder extends GeneratedMessageLite.AbstractC3403b<VoiceAnchorGrowthMessage, Builder> implements VoiceAnchorGrowthMessageOrBuilder {
            private Builder() {
                super(VoiceAnchorGrowthMessage.DEFAULT_INSTANCE);
            }

            public Builder addAllGifts(Iterable<? extends AnchorGift> iterable) {
                copyOnWrite();
                ((VoiceAnchorGrowthMessage) this.instance).addAllGifts(iterable);
                return this;
            }

            public Builder addGifts(AnchorGift anchorGift) {
                copyOnWrite();
                ((VoiceAnchorGrowthMessage) this.instance).addGifts(anchorGift);
                return this;
            }

            public Builder clearGifts() {
                copyOnWrite();
                ((VoiceAnchorGrowthMessage) this.instance).clearGifts();
                return this;
            }

            public Builder clearScheme() {
                copyOnWrite();
                ((VoiceAnchorGrowthMessage) this.instance).clearScheme();
                return this;
            }

            public Builder clearSubTitle() {
                copyOnWrite();
                ((VoiceAnchorGrowthMessage) this.instance).clearSubTitle();
                return this;
            }

            public Builder clearTitle() {
                copyOnWrite();
                ((VoiceAnchorGrowthMessage) this.instance).clearTitle();
                return this;
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkAnchorGrowthMsg.VoiceAnchorGrowthMessageOrBuilder
            public AnchorGift getGifts(int i) {
                return ((VoiceAnchorGrowthMessage) this.instance).getGifts(i);
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkAnchorGrowthMsg.VoiceAnchorGrowthMessageOrBuilder
            public int getGiftsCount() {
                return ((VoiceAnchorGrowthMessage) this.instance).getGiftsCount();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkAnchorGrowthMsg.VoiceAnchorGrowthMessageOrBuilder
            public List<AnchorGift> getGiftsList() {
                return Collections.unmodifiableList(((VoiceAnchorGrowthMessage) this.instance).getGiftsList());
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkAnchorGrowthMsg.VoiceAnchorGrowthMessageOrBuilder
            public String getScheme() {
                return ((VoiceAnchorGrowthMessage) this.instance).getScheme();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkAnchorGrowthMsg.VoiceAnchorGrowthMessageOrBuilder
            public ByteString getSchemeBytes() {
                return ((VoiceAnchorGrowthMessage) this.instance).getSchemeBytes();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkAnchorGrowthMsg.VoiceAnchorGrowthMessageOrBuilder
            public String getSubTitle() {
                return ((VoiceAnchorGrowthMessage) this.instance).getSubTitle();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkAnchorGrowthMsg.VoiceAnchorGrowthMessageOrBuilder
            public ByteString getSubTitleBytes() {
                return ((VoiceAnchorGrowthMessage) this.instance).getSubTitleBytes();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkAnchorGrowthMsg.VoiceAnchorGrowthMessageOrBuilder
            public String getTitle() {
                return ((VoiceAnchorGrowthMessage) this.instance).getTitle();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkAnchorGrowthMsg.VoiceAnchorGrowthMessageOrBuilder
            public ByteString getTitleBytes() {
                return ((VoiceAnchorGrowthMessage) this.instance).getTitleBytes();
            }

            public Builder removeGifts(int i) {
                copyOnWrite();
                ((VoiceAnchorGrowthMessage) this.instance).removeGifts(i);
                return this;
            }

            public Builder setGifts(int i, AnchorGift anchorGift) {
                copyOnWrite();
                ((VoiceAnchorGrowthMessage) this.instance).setGifts(i, anchorGift);
                return this;
            }

            public Builder setScheme(String str) {
                copyOnWrite();
                ((VoiceAnchorGrowthMessage) this.instance).setScheme(str);
                return this;
            }

            public Builder setSchemeBytes(ByteString byteString) {
                copyOnWrite();
                ((VoiceAnchorGrowthMessage) this.instance).setSchemeBytes(byteString);
                return this;
            }

            public Builder setSubTitle(String str) {
                copyOnWrite();
                ((VoiceAnchorGrowthMessage) this.instance).setSubTitle(str);
                return this;
            }

            public Builder setSubTitleBytes(ByteString byteString) {
                copyOnWrite();
                ((VoiceAnchorGrowthMessage) this.instance).setSubTitleBytes(byteString);
                return this;
            }

            public Builder setTitle(String str) {
                copyOnWrite();
                ((VoiceAnchorGrowthMessage) this.instance).setTitle(str);
                return this;
            }

            public Builder setTitleBytes(ByteString byteString) {
                copyOnWrite();
                ((VoiceAnchorGrowthMessage) this.instance).setTitleBytes(byteString);
                return this;
            }

            public Builder addGifts(int i, AnchorGift anchorGift) {
                copyOnWrite();
                ((VoiceAnchorGrowthMessage) this.instance).addGifts(i, anchorGift);
                return this;
            }

            public Builder setGifts(int i, AnchorGift.Builder builder) {
                copyOnWrite();
                ((VoiceAnchorGrowthMessage) this.instance).setGifts(i, builder);
                return this;
            }

            public Builder addGifts(AnchorGift.Builder builder) {
                copyOnWrite();
                ((VoiceAnchorGrowthMessage) this.instance).addGifts(builder);
                return this;
            }

            public Builder addGifts(int i, AnchorGift.Builder builder) {
                copyOnWrite();
                ((VoiceAnchorGrowthMessage) this.instance).addGifts(i, builder);
                return this;
            }
        }

        public static VoiceAnchorGrowthMessage parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (VoiceAnchorGrowthMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static VoiceAnchorGrowthMessage parseFrom(byte[] bArr, C3433h c3433h) throws InvalidProtocolBufferException {
            return (VoiceAnchorGrowthMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, c3433h);
        }

        public static VoiceAnchorGrowthMessage parseFrom(InputStream inputStream) throws IOException {
            return (VoiceAnchorGrowthMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static VoiceAnchorGrowthMessage parseFrom(InputStream inputStream, C3433h c3433h) throws IOException {
            return (VoiceAnchorGrowthMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, c3433h);
        }

        public static VoiceAnchorGrowthMessage parseFrom(C3430e c3430e) throws IOException {
            return (VoiceAnchorGrowthMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, c3430e);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addGifts(int i, AnchorGift anchorGift) {
            anchorGift.getClass();
            ensureGiftsIsMutable();
            this.gifts_.add(i, anchorGift);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static VoiceAnchorGrowthMessage parseFrom(C3430e c3430e, C3433h c3433h) throws IOException {
            return (VoiceAnchorGrowthMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, c3430e, c3433h);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setGifts(int i, AnchorGift anchorGift) {
            anchorGift.getClass();
            ensureGiftsIsMutable();
            this.gifts_.set(i, anchorGift);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addGifts(AnchorGift anchorGift) {
            anchorGift.getClass();
            ensureGiftsIsMutable();
            this.gifts_.add(anchorGift);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addGifts(int i, AnchorGift.Builder builder) {
            ensureGiftsIsMutable();
            this.gifts_.add(i, builder.build());
        }
    }
}
