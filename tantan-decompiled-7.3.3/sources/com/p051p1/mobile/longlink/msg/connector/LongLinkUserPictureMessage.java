package com.p051p1.mobile.longlink.msg.connector;

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
public final class LongLinkUserPictureMessage {

    /* JADX INFO: renamed from: com.p1.mobile.longlink.msg.connector.LongLinkUserPictureMessage$1 */
    public static /* synthetic */ class C45581 {

        /* JADX INFO: renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f16657xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f16657xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f16657xa1df5c61[GeneratedMessageLite.MethodToInvoke.IS_INITIALIZED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f16657xa1df5c61[GeneratedMessageLite.MethodToInvoke.MAKE_IMMUTABLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f16657xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f16657xa1df5c61[GeneratedMessageLite.MethodToInvoke.VISIT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f16657xa1df5c61[GeneratedMessageLite.MethodToInvoke.MERGE_FROM_STREAM.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f16657xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f16657xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    public interface UserPictureOrBuilder extends lfz {
        @Override // p153l.lfz
        /* synthetic */ InterfaceC3442q getDefaultInstanceForType();

        String getMediaType();

        ByteString getMediaTypeBytes();

        long getSize(int i);

        int getSizeCount();

        List<Long> getSizeList();

        String getUrl();

        ByteString getUrlBytes();

        @Override // p153l.lfz
        /* synthetic */ boolean isInitialized();
    }

    private LongLinkUserPictureMessage() {
    }

    public static void registerAllExtensions(C3433h c3433h) {
    }

    public static final class UserPicture extends GeneratedMessageLite<UserPicture, Builder> implements UserPictureOrBuilder {
        private static final UserPicture DEFAULT_INSTANCE;
        public static final int MEDIATYPE_FIELD_NUMBER = 2;
        private static volatile ng60<UserPicture> PARSER = null;
        public static final int SIZE_FIELD_NUMBER = 3;
        public static final int URL_FIELD_NUMBER = 1;
        private int bitField0_;
        private String url_ = "";
        private String mediaType_ = "";
        private C3437l.g size_ = GeneratedMessageLite.emptyLongList();

        public static final class Builder extends GeneratedMessageLite.AbstractC3403b<UserPicture, Builder> implements UserPictureOrBuilder {
            private Builder() {
                super(UserPicture.DEFAULT_INSTANCE);
            }

            public Builder addAllSize(Iterable<? extends Long> iterable) {
                copyOnWrite();
                ((UserPicture) this.instance).addAllSize(iterable);
                return this;
            }

            public Builder addSize(long j) {
                copyOnWrite();
                ((UserPicture) this.instance).addSize(j);
                return this;
            }

            public Builder clearMediaType() {
                copyOnWrite();
                ((UserPicture) this.instance).clearMediaType();
                return this;
            }

            public Builder clearSize() {
                copyOnWrite();
                ((UserPicture) this.instance).clearSize();
                return this;
            }

            public Builder clearUrl() {
                copyOnWrite();
                ((UserPicture) this.instance).clearUrl();
                return this;
            }

            @Override // com.p1.mobile.longlink.msg.connector.LongLinkUserPictureMessage.UserPictureOrBuilder
            public String getMediaType() {
                return ((UserPicture) this.instance).getMediaType();
            }

            @Override // com.p1.mobile.longlink.msg.connector.LongLinkUserPictureMessage.UserPictureOrBuilder
            public ByteString getMediaTypeBytes() {
                return ((UserPicture) this.instance).getMediaTypeBytes();
            }

            @Override // com.p1.mobile.longlink.msg.connector.LongLinkUserPictureMessage.UserPictureOrBuilder
            public long getSize(int i) {
                return ((UserPicture) this.instance).getSize(i);
            }

            @Override // com.p1.mobile.longlink.msg.connector.LongLinkUserPictureMessage.UserPictureOrBuilder
            public int getSizeCount() {
                return ((UserPicture) this.instance).getSizeCount();
            }

            @Override // com.p1.mobile.longlink.msg.connector.LongLinkUserPictureMessage.UserPictureOrBuilder
            public List<Long> getSizeList() {
                return Collections.unmodifiableList(((UserPicture) this.instance).getSizeList());
            }

            @Override // com.p1.mobile.longlink.msg.connector.LongLinkUserPictureMessage.UserPictureOrBuilder
            public String getUrl() {
                return ((UserPicture) this.instance).getUrl();
            }

            @Override // com.p1.mobile.longlink.msg.connector.LongLinkUserPictureMessage.UserPictureOrBuilder
            public ByteString getUrlBytes() {
                return ((UserPicture) this.instance).getUrlBytes();
            }

            public Builder setMediaType(String str) {
                copyOnWrite();
                ((UserPicture) this.instance).setMediaType(str);
                return this;
            }

            public Builder setMediaTypeBytes(ByteString byteString) {
                copyOnWrite();
                ((UserPicture) this.instance).setMediaTypeBytes(byteString);
                return this;
            }

            public Builder setSize(int i, long j) {
                copyOnWrite();
                ((UserPicture) this.instance).setSize(i, j);
                return this;
            }

            public Builder setUrl(String str) {
                copyOnWrite();
                ((UserPicture) this.instance).setUrl(str);
                return this;
            }

            public Builder setUrlBytes(ByteString byteString) {
                copyOnWrite();
                ((UserPicture) this.instance).setUrlBytes(byteString);
                return this;
            }
        }

        static {
            UserPicture userPicture = new UserPicture();
            DEFAULT_INSTANCE = userPicture;
            userPicture.makeImmutable();
        }

        private UserPicture() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllSize(Iterable<? extends Long> iterable) {
            ensureSizeIsMutable();
            AbstractC3426a.addAll(iterable, this.size_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addSize(long j) {
            ensureSizeIsMutable();
            this.size_.mo17267u(j);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearMediaType() {
            this.mediaType_ = getDefaultInstance().getMediaType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearSize() {
            this.size_ = GeneratedMessageLite.emptyLongList();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearUrl() {
            this.url_ = getDefaultInstance().getUrl();
        }

        private void ensureSizeIsMutable() {
            if (this.size_.mo17140q()) {
                return;
            }
            this.size_ = GeneratedMessageLite.mutableCopy(this.size_);
        }

        public static UserPicture getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder(UserPicture userPicture) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(userPicture);
        }

        public static UserPicture parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (UserPicture) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static UserPicture parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (UserPicture) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static ng60<UserPicture> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setMediaType(String str) {
            str.getClass();
            this.mediaType_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setMediaTypeBytes(ByteString byteString) {
            byteString.getClass();
            AbstractC3426a.checkByteStringIsUtf8(byteString);
            this.mediaType_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSize(int i, long j) {
            ensureSizeIsMutable();
            this.size_.setLong(i, j);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setUrl(String str) {
            str.getClass();
            this.url_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setUrlBytes(ByteString byteString) {
            byteString.getClass();
            AbstractC3426a.checkByteStringIsUtf8(byteString);
            this.url_ = byteString.toStringUtf8();
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (C45581.f16657xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new UserPicture();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                    this.size_.mo17139n();
                    return null;
                case 4:
                    return new Builder();
                case 5:
                    GeneratedMessageLite.InterfaceC3409h interfaceC3409h = (GeneratedMessageLite.InterfaceC3409h) obj;
                    UserPicture userPicture = (UserPicture) obj2;
                    this.url_ = interfaceC3409h.mo17052f(!this.url_.isEmpty(), this.url_, !userPicture.url_.isEmpty(), userPicture.url_);
                    this.mediaType_ = interfaceC3409h.mo17052f(!this.mediaType_.isEmpty(), this.mediaType_, true ^ userPicture.mediaType_.isEmpty(), userPicture.mediaType_);
                    this.size_ = interfaceC3409h.mo17063q(this.size_, userPicture.size_);
                    if (interfaceC3409h == GeneratedMessageLite.C3408g.INSTANCE) {
                        this.bitField0_ |= userPicture.bitField0_;
                    }
                    return this;
                case 6:
                    C3430e c3430e = (C3430e) obj;
                    boolean z = false;
                    while (!z) {
                        try {
                            int iM17171M = c3430e.m17171M();
                            if (iM17171M != 0) {
                                if (iM17171M == 10) {
                                    this.url_ = c3430e.m17170L();
                                } else if (iM17171M == 18) {
                                    this.mediaType_ = c3430e.m17170L();
                                } else if (iM17171M == 24) {
                                    if (!this.size_.mo17140q()) {
                                        this.size_ = GeneratedMessageLite.mutableCopy(this.size_);
                                    }
                                    this.size_.mo17267u(c3430e.m17197v());
                                } else if (iM17171M == 26) {
                                    int iM17187l = c3430e.m17187l(c3430e.m17162C());
                                    if (!this.size_.mo17140q() && c3430e.m17184d() > 0) {
                                        this.size_ = GeneratedMessageLite.mutableCopy(this.size_);
                                    }
                                    while (c3430e.m17184d() > 0) {
                                        this.size_.mo17267u(c3430e.m17197v());
                                    }
                                    c3430e.m17186k(iM17187l);
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
                        synchronized (UserPicture.class) {
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

        @Override // com.p1.mobile.longlink.msg.connector.LongLinkUserPictureMessage.UserPictureOrBuilder
        public String getMediaType() {
            return this.mediaType_;
        }

        @Override // com.p1.mobile.longlink.msg.connector.LongLinkUserPictureMessage.UserPictureOrBuilder
        public ByteString getMediaTypeBytes() {
            return ByteString.copyFromUtf8(this.mediaType_);
        }

        @Override // com.google.protobuf.InterfaceC3442q
        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int iM16956K = !this.url_.isEmpty() ? CodedOutputStream.m16956K(1, getUrl()) : 0;
            if (!this.mediaType_.isEmpty()) {
                iM16956K += CodedOutputStream.m16956K(2, getMediaType());
            }
            int iM16987w = 0;
            for (int i2 = 0; i2 < this.size_.size(); i2++) {
                iM16987w += CodedOutputStream.m16987w(this.size_.getLong(i2));
            }
            int size = iM16956K + iM16987w + getSizeList().size();
            this.memoizedSerializedSize = size;
            return size;
        }

        @Override // com.p1.mobile.longlink.msg.connector.LongLinkUserPictureMessage.UserPictureOrBuilder
        public long getSize(int i) {
            return this.size_.getLong(i);
        }

        @Override // com.p1.mobile.longlink.msg.connector.LongLinkUserPictureMessage.UserPictureOrBuilder
        public int getSizeCount() {
            return this.size_.size();
        }

        @Override // com.p1.mobile.longlink.msg.connector.LongLinkUserPictureMessage.UserPictureOrBuilder
        public List<Long> getSizeList() {
            return this.size_;
        }

        @Override // com.p1.mobile.longlink.msg.connector.LongLinkUserPictureMessage.UserPictureOrBuilder
        public String getUrl() {
            return this.url_;
        }

        @Override // com.p1.mobile.longlink.msg.connector.LongLinkUserPictureMessage.UserPictureOrBuilder
        public ByteString getUrlBytes() {
            return ByteString.copyFromUtf8(this.url_);
        }

        @Override // com.google.protobuf.InterfaceC3442q
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            getSerializedSize();
            if (!this.url_.isEmpty()) {
                codedOutputStream.mo16994D0(1, getUrl());
            }
            if (!this.mediaType_.isEmpty()) {
                codedOutputStream.mo16994D0(2, getMediaType());
            }
            for (int i = 0; i < this.size_.size(); i++) {
                codedOutputStream.m17027u0(3, this.size_.getLong(i));
            }
        }

        public static UserPicture parseDelimitedFrom(InputStream inputStream, C3433h c3433h) throws IOException {
            return (UserPicture) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, c3433h);
        }

        public static UserPicture parseFrom(ByteString byteString, C3433h c3433h) throws InvalidProtocolBufferException {
            return (UserPicture) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, c3433h);
        }

        public static UserPicture parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (UserPicture) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static UserPicture parseFrom(byte[] bArr, C3433h c3433h) throws InvalidProtocolBufferException {
            return (UserPicture) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, c3433h);
        }

        public static UserPicture parseFrom(InputStream inputStream) throws IOException {
            return (UserPicture) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static UserPicture parseFrom(InputStream inputStream, C3433h c3433h) throws IOException {
            return (UserPicture) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, c3433h);
        }

        public static UserPicture parseFrom(C3430e c3430e) throws IOException {
            return (UserPicture) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, c3430e);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static UserPicture parseFrom(C3430e c3430e, C3433h c3433h) throws IOException {
            return (UserPicture) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, c3430e, c3433h);
        }
    }
}
