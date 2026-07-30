package com.p003p1.mobile.longlink.msg.connector;

import com.google.protobuf.ByteString;
import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.a;
import com.google.protobuf.e;
import com.google.protobuf.h;
import com.google.protobuf.l;
import com.google.protobuf.q;
import java.io.IOException;
import java.io.InputStream;
import java.util.Collections;
import java.util.List;
import l.aag0;
import l.bz00;
import l.i860;
import l.o6z;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes8.dex */
public final class LongLinkUserPictureMessage {

    /* JADX INFO: renamed from: com.p1.mobile.longlink.msg.connector.LongLinkUserPictureMessage$1 */
    public static /* synthetic */ class C03191 {

        /* JADX INFO: renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f1637xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f1637xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f1637xa1df5c61[GeneratedMessageLite.MethodToInvoke.IS_INITIALIZED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f1637xa1df5c61[GeneratedMessageLite.MethodToInvoke.MAKE_IMMUTABLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f1637xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f1637xa1df5c61[GeneratedMessageLite.MethodToInvoke.VISIT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f1637xa1df5c61[GeneratedMessageLite.MethodToInvoke.MERGE_FROM_STREAM.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f1637xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f1637xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    public interface UserPictureOrBuilder extends o6z {
        /* synthetic */ q getDefaultInstanceForType();

        String getMediaType();

        ByteString getMediaTypeBytes();

        long getSize(int i);

        int getSizeCount();

        List<Long> getSizeList();

        String getUrl();

        ByteString getUrlBytes();

        /* synthetic */ boolean isInitialized();
    }

    private LongLinkUserPictureMessage() {
    }

    public static void registerAllExtensions(h hVar) {
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
        private l.g size_ = GeneratedMessageLite.emptyLongList();

        public static final class Builder extends GeneratedMessageLite.b<UserPicture, Builder> implements UserPictureOrBuilder {
            private Builder() {
                super(UserPicture.DEFAULT_INSTANCE);
            }

            public Builder addAllSize(Iterable<? extends Long> iterable) {
                copyOnWrite();
                ((UserPicture) ((GeneratedMessageLite.b) this).instance).addAllSize(iterable);
                return this;
            }

            public Builder addSize(long j) {
                copyOnWrite();
                ((UserPicture) ((GeneratedMessageLite.b) this).instance).addSize(j);
                return this;
            }

            public Builder clearMediaType() {
                copyOnWrite();
                ((UserPicture) ((GeneratedMessageLite.b) this).instance).clearMediaType();
                return this;
            }

            public Builder clearSize() {
                copyOnWrite();
                ((UserPicture) ((GeneratedMessageLite.b) this).instance).clearSize();
                return this;
            }

            public Builder clearUrl() {
                copyOnWrite();
                ((UserPicture) ((GeneratedMessageLite.b) this).instance).clearUrl();
                return this;
            }

            @Override // com.p1.mobile.longlink.msg.connector.LongLinkUserPictureMessage.UserPictureOrBuilder
            public String getMediaType() {
                return ((UserPicture) ((GeneratedMessageLite.b) this).instance).getMediaType();
            }

            @Override // com.p1.mobile.longlink.msg.connector.LongLinkUserPictureMessage.UserPictureOrBuilder
            public ByteString getMediaTypeBytes() {
                return ((UserPicture) ((GeneratedMessageLite.b) this).instance).getMediaTypeBytes();
            }

            @Override // com.p1.mobile.longlink.msg.connector.LongLinkUserPictureMessage.UserPictureOrBuilder
            public long getSize(int i) {
                return ((UserPicture) ((GeneratedMessageLite.b) this).instance).getSize(i);
            }

            @Override // com.p1.mobile.longlink.msg.connector.LongLinkUserPictureMessage.UserPictureOrBuilder
            public int getSizeCount() {
                return ((UserPicture) ((GeneratedMessageLite.b) this).instance).getSizeCount();
            }

            @Override // com.p1.mobile.longlink.msg.connector.LongLinkUserPictureMessage.UserPictureOrBuilder
            public List<Long> getSizeList() {
                return Collections.unmodifiableList(((UserPicture) ((GeneratedMessageLite.b) this).instance).getSizeList());
            }

            @Override // com.p1.mobile.longlink.msg.connector.LongLinkUserPictureMessage.UserPictureOrBuilder
            public String getUrl() {
                return ((UserPicture) ((GeneratedMessageLite.b) this).instance).getUrl();
            }

            @Override // com.p1.mobile.longlink.msg.connector.LongLinkUserPictureMessage.UserPictureOrBuilder
            public ByteString getUrlBytes() {
                return ((UserPicture) ((GeneratedMessageLite.b) this).instance).getUrlBytes();
            }

            public Builder setMediaType(String str) {
                copyOnWrite();
                ((UserPicture) ((GeneratedMessageLite.b) this).instance).setMediaType(str);
                return this;
            }

            public Builder setMediaTypeBytes(ByteString byteString) {
                copyOnWrite();
                ((UserPicture) ((GeneratedMessageLite.b) this).instance).setMediaTypeBytes(byteString);
                return this;
            }

            public Builder setSize(int i, long j) {
                copyOnWrite();
                ((UserPicture) ((GeneratedMessageLite.b) this).instance).setSize(i, j);
                return this;
            }

            public Builder setUrl(String str) {
                copyOnWrite();
                ((UserPicture) ((GeneratedMessageLite.b) this).instance).setUrl(str);
                return this;
            }

            public Builder setUrlBytes(ByteString byteString) {
                copyOnWrite();
                ((UserPicture) ((GeneratedMessageLite.b) this).instance).setUrlBytes(byteString);
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
            a.addAll(iterable, this.size_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addSize(long j) {
            ensureSizeIsMutable();
            this.size_.u(j);
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
            if (this.size_.q()) {
                return;
            }
            this.size_ = GeneratedMessageLite.mutableCopy(this.size_);
        }

        public static UserPicture getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder(UserPicture userPicture) {
            return (Builder) ((Builder) DEFAULT_INSTANCE.toBuilder()).mergeFrom(userPicture);
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
            a.checkByteStringIsUtf8(byteString);
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
            a.checkByteStringIsUtf8(byteString);
            this.url_ = byteString.toStringUtf8();
        }

        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (C03191.f1637xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new UserPicture();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                    this.size_.n();
                    return null;
                case 4:
                    return new Builder();
                case 5:
                    GeneratedMessageLite.g gVar = (GeneratedMessageLite.h) obj;
                    UserPicture userPicture = (UserPicture) obj2;
                    this.url_ = gVar.f(!this.url_.isEmpty(), this.url_, !userPicture.url_.isEmpty(), userPicture.url_);
                    this.mediaType_ = gVar.f(!this.mediaType_.isEmpty(), this.mediaType_, true ^ userPicture.mediaType_.isEmpty(), userPicture.mediaType_);
                    this.size_ = gVar.q(this.size_, userPicture.size_);
                    if (gVar == GeneratedMessageLite.g.INSTANCE) {
                        this.bitField0_ |= userPicture.bitField0_;
                    }
                    return this;
                case 6:
                    e eVar = (e) obj;
                    boolean z = false;
                    while (!z) {
                        try {
                            int iM = eVar.M();
                            if (iM != 0) {
                                if (iM == 10) {
                                    this.url_ = eVar.L();
                                } else if (iM == 18) {
                                    this.mediaType_ = eVar.L();
                                } else if (iM == 24) {
                                    if (!this.size_.q()) {
                                        this.size_ = GeneratedMessageLite.mutableCopy(this.size_);
                                    }
                                    this.size_.u(eVar.v());
                                } else if (iM == 26) {
                                    int iL = eVar.l(eVar.C());
                                    if (!this.size_.q() && eVar.d() > 0) {
                                        this.size_ = GeneratedMessageLite.mutableCopy(this.size_);
                                    }
                                    while (eVar.d() > 0) {
                                        this.size_.u(eVar.v());
                                    }
                                    eVar.k(iL);
                                } else if (!eVar.R(iM)) {
                                }
                            }
                            z = true;
                        } catch (IOException e) {
                            aag0.a(new InvalidProtocolBufferException(e.getMessage()).setUnfinishedMessage(this));
                            return null;
                        } catch (InvalidProtocolBufferException e2) {
                            aag0.a(e2.setUnfinishedMessage(this));
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

        @Override // com.p1.mobile.longlink.msg.connector.LongLinkUserPictureMessage.UserPictureOrBuilder
        public String getMediaType() {
            return this.mediaType_;
        }

        @Override // com.p1.mobile.longlink.msg.connector.LongLinkUserPictureMessage.UserPictureOrBuilder
        public ByteString getMediaTypeBytes() {
            return ByteString.copyFromUtf8(this.mediaType_);
        }

        public int getSerializedSize() {
            int i = ((GeneratedMessageLite) this).memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int iK = !this.url_.isEmpty() ? CodedOutputStream.K(1, getUrl()) : 0;
            if (!this.mediaType_.isEmpty()) {
                iK += CodedOutputStream.K(2, getMediaType());
            }
            int iW = 0;
            for (int i2 = 0; i2 < this.size_.size(); i2++) {
                iW += CodedOutputStream.w(this.size_.getLong(i2));
            }
            int size = iK + iW + getSizeList().size();
            ((GeneratedMessageLite) this).memoizedSerializedSize = size;
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

        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            getSerializedSize();
            if (!this.url_.isEmpty()) {
                codedOutputStream.D0(1, getUrl());
            }
            if (!this.mediaType_.isEmpty()) {
                codedOutputStream.D0(2, getMediaType());
            }
            for (int i = 0; i < this.size_.size(); i++) {
                codedOutputStream.u0(3, this.size_.getLong(i));
            }
        }

        public static UserPicture parseDelimitedFrom(InputStream inputStream, h hVar) throws IOException {
            return (UserPicture) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, hVar);
        }

        public static UserPicture parseFrom(ByteString byteString, h hVar) throws InvalidProtocolBufferException {
            return (UserPicture) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, hVar);
        }

        public static UserPicture parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (UserPicture) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static UserPicture parseFrom(byte[] bArr, h hVar) throws InvalidProtocolBufferException {
            return (UserPicture) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, hVar);
        }

        public static UserPicture parseFrom(InputStream inputStream) throws IOException {
            return (UserPicture) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static UserPicture parseFrom(InputStream inputStream, h hVar) throws IOException {
            return (UserPicture) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, hVar);
        }

        public static UserPicture parseFrom(e eVar) throws IOException {
            return (UserPicture) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, eVar);
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.toBuilder();
        }

        public static UserPicture parseFrom(e eVar, h hVar) throws IOException {
            return (UserPicture) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, eVar, hVar);
        }
    }
}
