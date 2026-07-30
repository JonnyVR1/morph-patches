package com.p046p1.mobile.longlink.msg.connector;

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
public final class LongLinkUserPictureMessage {

    /* JADX INFO: renamed from: com.p1.mobile.longlink.msg.connector.LongLinkUserPictureMessage$1 */
    public static /* synthetic */ class C44071 {

        /* JADX INFO: renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f15938xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f15938xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f15938xa1df5c61[GeneratedMessageLite.MethodToInvoke.IS_INITIALIZED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f15938xa1df5c61[GeneratedMessageLite.MethodToInvoke.MAKE_IMMUTABLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f15938xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f15938xa1df5c61[GeneratedMessageLite.MethodToInvoke.VISIT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f15938xa1df5c61[GeneratedMessageLite.MethodToInvoke.MERGE_FROM_STREAM.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f15938xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f15938xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    public interface UserPictureOrBuilder extends o6z {
        @Override // p149l.o6z
        /* synthetic */ InterfaceC3419q getDefaultInstanceForType();

        String getMediaType();

        ByteString getMediaTypeBytes();

        long getSize(int i);

        int getSizeCount();

        List<Long> getSizeList();

        String getUrl();

        ByteString getUrlBytes();

        @Override // p149l.o6z
        /* synthetic */ boolean isInitialized();
    }

    private LongLinkUserPictureMessage() {
    }

    public static void registerAllExtensions(C3410h c3410h) {
    }

    public static final class UserPicture extends GeneratedMessageLite<UserPicture, Builder> implements UserPictureOrBuilder {
        private static final UserPicture DEFAULT_INSTANCE;
        public static final int MEDIATYPE_FIELD_NUMBER = 2;
        private static volatile i860<UserPicture> PARSER = null;
        public static final int SIZE_FIELD_NUMBER = 3;
        public static final int URL_FIELD_NUMBER = 1;
        private int bitField0_;
        private String url_ = "";
        private String mediaType_ = "";
        private C3414l.g size_ = GeneratedMessageLite.emptyLongList();

        public static final class Builder extends GeneratedMessageLite.AbstractC3380b<UserPicture, Builder> implements UserPictureOrBuilder {
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
            AbstractC3403a.addAll(iterable, this.size_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addSize(long j) {
            ensureSizeIsMutable();
            this.size_.mo17212u(j);
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
            if (this.size_.mo17085q()) {
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

        public static i860<UserPicture> parser() {
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
            AbstractC3403a.checkByteStringIsUtf8(byteString);
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
            AbstractC3403a.checkByteStringIsUtf8(byteString);
            this.url_ = byteString.toStringUtf8();
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (C44071.f15938xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new UserPicture();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                    this.size_.mo17084n();
                    return null;
                case 4:
                    return new Builder();
                case 5:
                    GeneratedMessageLite.InterfaceC3386h interfaceC3386h = (GeneratedMessageLite.InterfaceC3386h) obj;
                    UserPicture userPicture = (UserPicture) obj2;
                    this.url_ = interfaceC3386h.mo16997f(!this.url_.isEmpty(), this.url_, !userPicture.url_.isEmpty(), userPicture.url_);
                    this.mediaType_ = interfaceC3386h.mo16997f(!this.mediaType_.isEmpty(), this.mediaType_, true ^ userPicture.mediaType_.isEmpty(), userPicture.mediaType_);
                    this.size_ = interfaceC3386h.mo17008q(this.size_, userPicture.size_);
                    if (interfaceC3386h == GeneratedMessageLite.C3385g.INSTANCE) {
                        this.bitField0_ |= userPicture.bitField0_;
                    }
                    return this;
                case 6:
                    C3407e c3407e = (C3407e) obj;
                    boolean z = false;
                    while (!z) {
                        try {
                            int iM17116M = c3407e.m17116M();
                            if (iM17116M != 0) {
                                if (iM17116M == 10) {
                                    this.url_ = c3407e.m17115L();
                                } else if (iM17116M == 18) {
                                    this.mediaType_ = c3407e.m17115L();
                                } else if (iM17116M == 24) {
                                    if (!this.size_.mo17085q()) {
                                        this.size_ = GeneratedMessageLite.mutableCopy(this.size_);
                                    }
                                    this.size_.mo17212u(c3407e.m17142v());
                                } else if (iM17116M == 26) {
                                    int iM17132l = c3407e.m17132l(c3407e.m17107C());
                                    if (!this.size_.mo17085q() && c3407e.m17129d() > 0) {
                                        this.size_ = GeneratedMessageLite.mutableCopy(this.size_);
                                    }
                                    while (c3407e.m17129d() > 0) {
                                        this.size_.mo17212u(c3407e.m17142v());
                                    }
                                    c3407e.m17131k(iM17132l);
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
                        synchronized (UserPicture.class) {
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

        @Override // com.p1.mobile.longlink.msg.connector.LongLinkUserPictureMessage.UserPictureOrBuilder
        public String getMediaType() {
            return this.mediaType_;
        }

        @Override // com.p1.mobile.longlink.msg.connector.LongLinkUserPictureMessage.UserPictureOrBuilder
        public ByteString getMediaTypeBytes() {
            return ByteString.copyFromUtf8(this.mediaType_);
        }

        @Override // com.google.protobuf.InterfaceC3419q
        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int iM16901K = !this.url_.isEmpty() ? CodedOutputStream.m16901K(1, getUrl()) : 0;
            if (!this.mediaType_.isEmpty()) {
                iM16901K += CodedOutputStream.m16901K(2, getMediaType());
            }
            int iM16932w = 0;
            for (int i2 = 0; i2 < this.size_.size(); i2++) {
                iM16932w += CodedOutputStream.m16932w(this.size_.getLong(i2));
            }
            int size = iM16901K + iM16932w + getSizeList().size();
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

        @Override // com.google.protobuf.InterfaceC3419q
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            getSerializedSize();
            if (!this.url_.isEmpty()) {
                codedOutputStream.mo16939D0(1, getUrl());
            }
            if (!this.mediaType_.isEmpty()) {
                codedOutputStream.mo16939D0(2, getMediaType());
            }
            for (int i = 0; i < this.size_.size(); i++) {
                codedOutputStream.m16972u0(3, this.size_.getLong(i));
            }
        }

        public static UserPicture parseDelimitedFrom(InputStream inputStream, C3410h c3410h) throws IOException {
            return (UserPicture) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, c3410h);
        }

        public static UserPicture parseFrom(ByteString byteString, C3410h c3410h) throws InvalidProtocolBufferException {
            return (UserPicture) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, c3410h);
        }

        public static UserPicture parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (UserPicture) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static UserPicture parseFrom(byte[] bArr, C3410h c3410h) throws InvalidProtocolBufferException {
            return (UserPicture) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, c3410h);
        }

        public static UserPicture parseFrom(InputStream inputStream) throws IOException {
            return (UserPicture) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static UserPicture parseFrom(InputStream inputStream, C3410h c3410h) throws IOException {
            return (UserPicture) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, c3410h);
        }

        public static UserPicture parseFrom(C3407e c3407e) throws IOException {
            return (UserPicture) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, c3407e);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static UserPicture parseFrom(C3407e c3407e, C3410h c3410h) throws IOException {
            return (UserPicture) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, c3407e, c3410h);
        }
    }
}
