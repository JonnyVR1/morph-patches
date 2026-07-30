package com.p003p1.mobile.longlink.msg.voicelivemessage;

import com.google.protobuf.ByteString;
import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.a;
import com.google.protobuf.e;
import com.google.protobuf.h;
import com.google.protobuf.l;
import com.google.protobuf.q;
import com.p003p1.mobile.longlink.msg.template.Template;
import com.p003p1.mobile.longlink.msg.userMask.userMaskConfig;
import java.io.IOException;
import java.io.InputStream;
import java.util.Collections;
import java.util.List;
import l.aag0;
import l.bz00;
import l.i860;
import l.o6z;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes8.dex */
public final class VoiceMicEmoji {

    /* JADX INFO: renamed from: com.p1.mobile.longlink.msg.voicelivemessage.VoiceMicEmoji$1 */
    public static /* synthetic */ class C04821 {

        /* JADX INFO: renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f1707xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f1707xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f1707xa1df5c61[GeneratedMessageLite.MethodToInvoke.IS_INITIALIZED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f1707xa1df5c61[GeneratedMessageLite.MethodToInvoke.MAKE_IMMUTABLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f1707xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f1707xa1df5c61[GeneratedMessageLite.MethodToInvoke.VISIT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f1707xa1df5c61[GeneratedMessageLite.MethodToInvoke.MERGE_FROM_STREAM.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f1707xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f1707xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    public interface EmojiPlayResultOrBuilder extends o6z {
        String getContentPic();

        ByteString getContentPicBytes();

        /* synthetic */ q getDefaultInstanceForType();

        long getLoadingDurationS();

        String getLoadingSvg();

        ByteString getLoadingSvgBytes();

        long getResultShowDurationS();

        /* synthetic */ boolean isInitialized();
    }

    public interface VoiceEmojiPlayMessageOrBuilder extends o6z {
        /* synthetic */ q getDefaultInstanceForType();

        String getEmojiType();

        ByteString getEmojiTypeBytes();

        String getMid();

        ByteString getMidBytes();

        EmojiPlayResult getResult(int i);

        int getResultCount();

        List<EmojiPlayResult> getResultList();

        Template.TemplateData getTempdata();

        String getUserId();

        ByteString getUserIdBytes();

        userMaskConfig.UserMask getUserMask();

        boolean hasTempdata();

        boolean hasUserMask();

        /* synthetic */ boolean isInitialized();
    }

    private VoiceMicEmoji() {
    }

    public static void registerAllExtensions(h hVar) {
    }

    public static final class EmojiPlayResult extends GeneratedMessageLite<EmojiPlayResult, Builder> implements EmojiPlayResultOrBuilder {
        public static final int CONTENTPIC_FIELD_NUMBER = 1;
        private static final EmojiPlayResult DEFAULT_INSTANCE;
        public static final int LOADINGDURATIONS_FIELD_NUMBER = 3;
        public static final int LOADINGSVG_FIELD_NUMBER = 2;
        private static volatile i860<EmojiPlayResult> PARSER = null;
        public static final int RESULTSHOWDURATIONS_FIELD_NUMBER = 4;
        private long loadingDurationS_;
        private long resultShowDurationS_;
        private String contentPic_ = "";
        private String loadingSvg_ = "";

        public static final class Builder extends GeneratedMessageLite.b<EmojiPlayResult, Builder> implements EmojiPlayResultOrBuilder {
            private Builder() {
                super(EmojiPlayResult.DEFAULT_INSTANCE);
            }

            public Builder clearContentPic() {
                copyOnWrite();
                ((EmojiPlayResult) ((GeneratedMessageLite.b) this).instance).clearContentPic();
                return this;
            }

            public Builder clearLoadingDurationS() {
                copyOnWrite();
                ((EmojiPlayResult) ((GeneratedMessageLite.b) this).instance).clearLoadingDurationS();
                return this;
            }

            public Builder clearLoadingSvg() {
                copyOnWrite();
                ((EmojiPlayResult) ((GeneratedMessageLite.b) this).instance).clearLoadingSvg();
                return this;
            }

            public Builder clearResultShowDurationS() {
                copyOnWrite();
                ((EmojiPlayResult) ((GeneratedMessageLite.b) this).instance).clearResultShowDurationS();
                return this;
            }

            @Override // com.p1.mobile.longlink.msg.voicelivemessage.VoiceMicEmoji.EmojiPlayResultOrBuilder
            public String getContentPic() {
                return ((EmojiPlayResult) ((GeneratedMessageLite.b) this).instance).getContentPic();
            }

            @Override // com.p1.mobile.longlink.msg.voicelivemessage.VoiceMicEmoji.EmojiPlayResultOrBuilder
            public ByteString getContentPicBytes() {
                return ((EmojiPlayResult) ((GeneratedMessageLite.b) this).instance).getContentPicBytes();
            }

            @Override // com.p1.mobile.longlink.msg.voicelivemessage.VoiceMicEmoji.EmojiPlayResultOrBuilder
            public long getLoadingDurationS() {
                return ((EmojiPlayResult) ((GeneratedMessageLite.b) this).instance).getLoadingDurationS();
            }

            @Override // com.p1.mobile.longlink.msg.voicelivemessage.VoiceMicEmoji.EmojiPlayResultOrBuilder
            public String getLoadingSvg() {
                return ((EmojiPlayResult) ((GeneratedMessageLite.b) this).instance).getLoadingSvg();
            }

            @Override // com.p1.mobile.longlink.msg.voicelivemessage.VoiceMicEmoji.EmojiPlayResultOrBuilder
            public ByteString getLoadingSvgBytes() {
                return ((EmojiPlayResult) ((GeneratedMessageLite.b) this).instance).getLoadingSvgBytes();
            }

            @Override // com.p1.mobile.longlink.msg.voicelivemessage.VoiceMicEmoji.EmojiPlayResultOrBuilder
            public long getResultShowDurationS() {
                return ((EmojiPlayResult) ((GeneratedMessageLite.b) this).instance).getResultShowDurationS();
            }

            public Builder setContentPic(String str) {
                copyOnWrite();
                ((EmojiPlayResult) ((GeneratedMessageLite.b) this).instance).setContentPic(str);
                return this;
            }

            public Builder setContentPicBytes(ByteString byteString) {
                copyOnWrite();
                ((EmojiPlayResult) ((GeneratedMessageLite.b) this).instance).setContentPicBytes(byteString);
                return this;
            }

            public Builder setLoadingDurationS(long j) {
                copyOnWrite();
                ((EmojiPlayResult) ((GeneratedMessageLite.b) this).instance).setLoadingDurationS(j);
                return this;
            }

            public Builder setLoadingSvg(String str) {
                copyOnWrite();
                ((EmojiPlayResult) ((GeneratedMessageLite.b) this).instance).setLoadingSvg(str);
                return this;
            }

            public Builder setLoadingSvgBytes(ByteString byteString) {
                copyOnWrite();
                ((EmojiPlayResult) ((GeneratedMessageLite.b) this).instance).setLoadingSvgBytes(byteString);
                return this;
            }

            public Builder setResultShowDurationS(long j) {
                copyOnWrite();
                ((EmojiPlayResult) ((GeneratedMessageLite.b) this).instance).setResultShowDurationS(j);
                return this;
            }
        }

        static {
            EmojiPlayResult emojiPlayResult = new EmojiPlayResult();
            DEFAULT_INSTANCE = emojiPlayResult;
            emojiPlayResult.makeImmutable();
        }

        private EmojiPlayResult() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearContentPic() {
            this.contentPic_ = getDefaultInstance().getContentPic();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearLoadingDurationS() {
            this.loadingDurationS_ = 0L;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearLoadingSvg() {
            this.loadingSvg_ = getDefaultInstance().getLoadingSvg();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearResultShowDurationS() {
            this.resultShowDurationS_ = 0L;
        }

        public static EmojiPlayResult getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder(EmojiPlayResult emojiPlayResult) {
            return (Builder) ((Builder) DEFAULT_INSTANCE.toBuilder()).mergeFrom(emojiPlayResult);
        }

        public static EmojiPlayResult parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (EmojiPlayResult) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static EmojiPlayResult parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (EmojiPlayResult) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static i860<EmojiPlayResult> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setContentPic(String str) {
            str.getClass();
            this.contentPic_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setContentPicBytes(ByteString byteString) {
            byteString.getClass();
            a.checkByteStringIsUtf8(byteString);
            this.contentPic_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setLoadingDurationS(long j) {
            this.loadingDurationS_ = j;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setLoadingSvg(String str) {
            str.getClass();
            this.loadingSvg_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setLoadingSvgBytes(ByteString byteString) {
            byteString.getClass();
            a.checkByteStringIsUtf8(byteString);
            this.loadingSvg_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setResultShowDurationS(long j) {
            this.resultShowDurationS_ = j;
        }

        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            boolean z = false;
            switch (C04821.f1707xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new EmojiPlayResult();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                    return null;
                case 4:
                    return new Builder();
                case 5:
                    GeneratedMessageLite.h hVar = (GeneratedMessageLite.h) obj;
                    EmojiPlayResult emojiPlayResult = (EmojiPlayResult) obj2;
                    this.contentPic_ = hVar.f(!this.contentPic_.isEmpty(), this.contentPic_, !emojiPlayResult.contentPic_.isEmpty(), emojiPlayResult.contentPic_);
                    this.loadingSvg_ = hVar.f(!this.loadingSvg_.isEmpty(), this.loadingSvg_, !emojiPlayResult.loadingSvg_.isEmpty(), emojiPlayResult.loadingSvg_);
                    long j = this.loadingDurationS_;
                    boolean z2 = j != 0;
                    long j2 = emojiPlayResult.loadingDurationS_;
                    this.loadingDurationS_ = hVar.i(z2, j, j2 != 0, j2);
                    boolean z3 = false;
                    long j3 = this.resultShowDurationS_;
                    if (j3 != 0) {
                        z3 = true;
                    }
                    long j4 = emojiPlayResult.resultShowDurationS_;
                    this.resultShowDurationS_ = hVar.i(z3, j3, j4 != 0, j4);
                    GeneratedMessageLite.g gVar = GeneratedMessageLite.g.INSTANCE;
                    return this;
                case 6:
                    e eVar = (e) obj;
                    while (!z) {
                        try {
                            int iM = eVar.M();
                            if (iM != 0) {
                                if (iM == 10) {
                                    this.contentPic_ = eVar.L();
                                } else if (iM == 18) {
                                    this.loadingSvg_ = eVar.L();
                                } else if (iM == 24) {
                                    this.loadingDurationS_ = eVar.v();
                                } else if (iM == 32) {
                                    this.resultShowDurationS_ = eVar.v();
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
                        synchronized (EmojiPlayResult.class) {
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

        @Override // com.p1.mobile.longlink.msg.voicelivemessage.VoiceMicEmoji.EmojiPlayResultOrBuilder
        public String getContentPic() {
            return this.contentPic_;
        }

        @Override // com.p1.mobile.longlink.msg.voicelivemessage.VoiceMicEmoji.EmojiPlayResultOrBuilder
        public ByteString getContentPicBytes() {
            return ByteString.copyFromUtf8(this.contentPic_);
        }

        @Override // com.p1.mobile.longlink.msg.voicelivemessage.VoiceMicEmoji.EmojiPlayResultOrBuilder
        public long getLoadingDurationS() {
            return this.loadingDurationS_;
        }

        @Override // com.p1.mobile.longlink.msg.voicelivemessage.VoiceMicEmoji.EmojiPlayResultOrBuilder
        public String getLoadingSvg() {
            return this.loadingSvg_;
        }

        @Override // com.p1.mobile.longlink.msg.voicelivemessage.VoiceMicEmoji.EmojiPlayResultOrBuilder
        public ByteString getLoadingSvgBytes() {
            return ByteString.copyFromUtf8(this.loadingSvg_);
        }

        @Override // com.p1.mobile.longlink.msg.voicelivemessage.VoiceMicEmoji.EmojiPlayResultOrBuilder
        public long getResultShowDurationS() {
            return this.resultShowDurationS_;
        }

        public int getSerializedSize() {
            int i = ((GeneratedMessageLite) this).memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int iK = !this.contentPic_.isEmpty() ? CodedOutputStream.K(1, getContentPic()) : 0;
            if (!this.loadingSvg_.isEmpty()) {
                iK += CodedOutputStream.K(2, getLoadingSvg());
            }
            long j = this.loadingDurationS_;
            if (j != 0) {
                iK += CodedOutputStream.v(3, j);
            }
            long j2 = this.resultShowDurationS_;
            if (j2 != 0) {
                iK += CodedOutputStream.v(4, j2);
            }
            ((GeneratedMessageLite) this).memoizedSerializedSize = iK;
            return iK;
        }

        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (!this.contentPic_.isEmpty()) {
                codedOutputStream.D0(1, getContentPic());
            }
            if (!this.loadingSvg_.isEmpty()) {
                codedOutputStream.D0(2, getLoadingSvg());
            }
            long j = this.loadingDurationS_;
            if (j != 0) {
                codedOutputStream.u0(3, j);
            }
            long j2 = this.resultShowDurationS_;
            if (j2 != 0) {
                codedOutputStream.u0(4, j2);
            }
        }

        public static EmojiPlayResult parseDelimitedFrom(InputStream inputStream, h hVar) throws IOException {
            return (EmojiPlayResult) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, hVar);
        }

        public static EmojiPlayResult parseFrom(ByteString byteString, h hVar) throws InvalidProtocolBufferException {
            return (EmojiPlayResult) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, hVar);
        }

        public static EmojiPlayResult parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (EmojiPlayResult) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static EmojiPlayResult parseFrom(byte[] bArr, h hVar) throws InvalidProtocolBufferException {
            return (EmojiPlayResult) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, hVar);
        }

        public static EmojiPlayResult parseFrom(InputStream inputStream) throws IOException {
            return (EmojiPlayResult) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static EmojiPlayResult parseFrom(InputStream inputStream, h hVar) throws IOException {
            return (EmojiPlayResult) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, hVar);
        }

        public static EmojiPlayResult parseFrom(e eVar) throws IOException {
            return (EmojiPlayResult) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, eVar);
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.toBuilder();
        }

        public static EmojiPlayResult parseFrom(e eVar, h hVar) throws IOException {
            return (EmojiPlayResult) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, eVar, hVar);
        }
    }

    public static final class VoiceEmojiPlayMessage extends GeneratedMessageLite<VoiceEmojiPlayMessage, Builder> implements VoiceEmojiPlayMessageOrBuilder {
        private static final VoiceEmojiPlayMessage DEFAULT_INSTANCE;
        public static final int EMOJITYPE_FIELD_NUMBER = 4;
        public static final int MID_FIELD_NUMBER = 1;
        private static volatile i860<VoiceEmojiPlayMessage> PARSER = null;
        public static final int RESULT_FIELD_NUMBER = 5;
        public static final int TEMPDATA_FIELD_NUMBER = 6;
        public static final int USERID_FIELD_NUMBER = 2;
        public static final int USERMASK_FIELD_NUMBER = 3;
        private int bitField0_;
        private Template.TemplateData tempdata_;
        private userMaskConfig.UserMask userMask_;
        private String mid_ = "";
        private String userId_ = "";
        private String emojiType_ = "";
        private l.h<EmojiPlayResult> result_ = GeneratedMessageLite.emptyProtobufList();

        static {
            VoiceEmojiPlayMessage voiceEmojiPlayMessage = new VoiceEmojiPlayMessage();
            DEFAULT_INSTANCE = voiceEmojiPlayMessage;
            voiceEmojiPlayMessage.makeImmutable();
        }

        private VoiceEmojiPlayMessage() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllResult(Iterable<? extends EmojiPlayResult> iterable) {
            ensureResultIsMutable();
            a.addAll(iterable, this.result_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addResult(EmojiPlayResult.Builder builder) {
            ensureResultIsMutable();
            this.result_.add((EmojiPlayResult) builder.build());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearEmojiType() {
            this.emojiType_ = getDefaultInstance().getEmojiType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearMid() {
            this.mid_ = getDefaultInstance().getMid();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearResult() {
            this.result_ = GeneratedMessageLite.emptyProtobufList();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearTempdata() {
            this.tempdata_ = null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearUserId() {
            this.userId_ = getDefaultInstance().getUserId();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearUserMask() {
            this.userMask_ = null;
        }

        private void ensureResultIsMutable() {
            if (this.result_.q()) {
                return;
            }
            this.result_ = GeneratedMessageLite.mutableCopy(this.result_);
        }

        public static VoiceEmojiPlayMessage getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeTempdata(Template.TemplateData templateData) {
            Template.TemplateData templateData2 = this.tempdata_;
            if (templateData2 == null || templateData2 == Template.TemplateData.getDefaultInstance()) {
                this.tempdata_ = templateData;
            } else {
                this.tempdata_ = (Template.TemplateData) ((Template.TemplateData.Builder) Template.TemplateData.newBuilder(this.tempdata_).mergeFrom(templateData)).buildPartial();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeUserMask(userMaskConfig.UserMask userMask) {
            userMaskConfig.UserMask userMask2 = this.userMask_;
            if (userMask2 == null || userMask2 == userMaskConfig.UserMask.getDefaultInstance()) {
                this.userMask_ = userMask;
            } else {
                this.userMask_ = (userMaskConfig.UserMask) ((userMaskConfig.UserMask.Builder) userMaskConfig.UserMask.newBuilder(this.userMask_).mergeFrom(userMask)).buildPartial();
            }
        }

        public static Builder newBuilder(VoiceEmojiPlayMessage voiceEmojiPlayMessage) {
            return (Builder) ((Builder) DEFAULT_INSTANCE.toBuilder()).mergeFrom(voiceEmojiPlayMessage);
        }

        public static VoiceEmojiPlayMessage parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (VoiceEmojiPlayMessage) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static VoiceEmojiPlayMessage parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (VoiceEmojiPlayMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static i860<VoiceEmojiPlayMessage> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void removeResult(int i) {
            ensureResultIsMutable();
            this.result_.remove(i);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setEmojiType(String str) {
            str.getClass();
            this.emojiType_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setEmojiTypeBytes(ByteString byteString) {
            byteString.getClass();
            a.checkByteStringIsUtf8(byteString);
            this.emojiType_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setMid(String str) {
            str.getClass();
            this.mid_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setMidBytes(ByteString byteString) {
            byteString.getClass();
            a.checkByteStringIsUtf8(byteString);
            this.mid_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setResult(int i, EmojiPlayResult.Builder builder) {
            ensureResultIsMutable();
            this.result_.set(i, (EmojiPlayResult) builder.build());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTempdata(Template.TemplateData.Builder builder) {
            this.tempdata_ = (Template.TemplateData) builder.build();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setUserId(String str) {
            str.getClass();
            this.userId_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setUserIdBytes(ByteString byteString) {
            byteString.getClass();
            a.checkByteStringIsUtf8(byteString);
            this.userId_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setUserMask(userMaskConfig.UserMask.Builder builder) {
            this.userMask_ = (userMaskConfig.UserMask) builder.build();
        }

        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (C04821.f1707xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new VoiceEmojiPlayMessage();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                    this.result_.n();
                    return null;
                case 4:
                    return new Builder();
                case 5:
                    GeneratedMessageLite.g gVar = (GeneratedMessageLite.h) obj;
                    VoiceEmojiPlayMessage voiceEmojiPlayMessage = (VoiceEmojiPlayMessage) obj2;
                    this.mid_ = gVar.f(!this.mid_.isEmpty(), this.mid_, !voiceEmojiPlayMessage.mid_.isEmpty(), voiceEmojiPlayMessage.mid_);
                    this.userId_ = gVar.f(!this.userId_.isEmpty(), this.userId_, !voiceEmojiPlayMessage.userId_.isEmpty(), voiceEmojiPlayMessage.userId_);
                    this.userMask_ = gVar.o(this.userMask_, voiceEmojiPlayMessage.userMask_);
                    this.emojiType_ = gVar.f(!this.emojiType_.isEmpty(), this.emojiType_, true ^ voiceEmojiPlayMessage.emojiType_.isEmpty(), voiceEmojiPlayMessage.emojiType_);
                    this.result_ = gVar.g(this.result_, voiceEmojiPlayMessage.result_);
                    this.tempdata_ = gVar.o(this.tempdata_, voiceEmojiPlayMessage.tempdata_);
                    if (gVar == GeneratedMessageLite.g.INSTANCE) {
                        this.bitField0_ |= voiceEmojiPlayMessage.bitField0_;
                    }
                    return this;
                case 6:
                    e eVar = (e) obj;
                    h hVar = (h) obj2;
                    boolean z = false;
                    while (!z) {
                        try {
                            int iM = eVar.M();
                            if (iM != 0) {
                                if (iM == 10) {
                                    this.mid_ = eVar.L();
                                } else if (iM == 18) {
                                    this.userId_ = eVar.L();
                                } else if (iM == 26) {
                                    userMaskConfig.UserMask userMask = this.userMask_;
                                    userMaskConfig.UserMask.Builder builder = userMask != null ? (userMaskConfig.UserMask.Builder) userMask.toBuilder() : null;
                                    userMaskConfig.UserMask userMaskW = eVar.w(userMaskConfig.UserMask.parser(), hVar);
                                    this.userMask_ = userMaskW;
                                    if (builder != null) {
                                        builder.mergeFrom(userMaskW);
                                        this.userMask_ = (userMaskConfig.UserMask) builder.buildPartial();
                                    }
                                } else if (iM == 34) {
                                    this.emojiType_ = eVar.L();
                                } else if (iM == 42) {
                                    if (!this.result_.q()) {
                                        this.result_ = GeneratedMessageLite.mutableCopy(this.result_);
                                    }
                                    this.result_.add(eVar.w(EmojiPlayResult.parser(), hVar));
                                } else if (iM == 50) {
                                    Template.TemplateData templateData = this.tempdata_;
                                    Template.TemplateData.Builder builder2 = templateData != null ? (Template.TemplateData.Builder) templateData.toBuilder() : null;
                                    Template.TemplateData templateDataW = eVar.w(Template.TemplateData.parser(), hVar);
                                    this.tempdata_ = templateDataW;
                                    if (builder2 != null) {
                                        builder2.mergeFrom(templateDataW);
                                        this.tempdata_ = (Template.TemplateData) builder2.buildPartial();
                                    }
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
                        synchronized (VoiceEmojiPlayMessage.class) {
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

        @Override // com.p1.mobile.longlink.msg.voicelivemessage.VoiceMicEmoji.VoiceEmojiPlayMessageOrBuilder
        public String getEmojiType() {
            return this.emojiType_;
        }

        @Override // com.p1.mobile.longlink.msg.voicelivemessage.VoiceMicEmoji.VoiceEmojiPlayMessageOrBuilder
        public ByteString getEmojiTypeBytes() {
            return ByteString.copyFromUtf8(this.emojiType_);
        }

        @Override // com.p1.mobile.longlink.msg.voicelivemessage.VoiceMicEmoji.VoiceEmojiPlayMessageOrBuilder
        public String getMid() {
            return this.mid_;
        }

        @Override // com.p1.mobile.longlink.msg.voicelivemessage.VoiceMicEmoji.VoiceEmojiPlayMessageOrBuilder
        public ByteString getMidBytes() {
            return ByteString.copyFromUtf8(this.mid_);
        }

        @Override // com.p1.mobile.longlink.msg.voicelivemessage.VoiceMicEmoji.VoiceEmojiPlayMessageOrBuilder
        public EmojiPlayResult getResult(int i) {
            return (EmojiPlayResult) this.result_.get(i);
        }

        @Override // com.p1.mobile.longlink.msg.voicelivemessage.VoiceMicEmoji.VoiceEmojiPlayMessageOrBuilder
        public int getResultCount() {
            return this.result_.size();
        }

        @Override // com.p1.mobile.longlink.msg.voicelivemessage.VoiceMicEmoji.VoiceEmojiPlayMessageOrBuilder
        public List<EmojiPlayResult> getResultList() {
            return this.result_;
        }

        public EmojiPlayResultOrBuilder getResultOrBuilder(int i) {
            return (EmojiPlayResultOrBuilder) this.result_.get(i);
        }

        public List<? extends EmojiPlayResultOrBuilder> getResultOrBuilderList() {
            return this.result_;
        }

        public int getSerializedSize() {
            int i = ((GeneratedMessageLite) this).memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int iK = !this.mid_.isEmpty() ? CodedOutputStream.K(1, getMid()) : 0;
            if (!this.userId_.isEmpty()) {
                iK += CodedOutputStream.K(2, getUserId());
            }
            if (this.userMask_ != null) {
                iK += CodedOutputStream.C(3, getUserMask());
            }
            if (!this.emojiType_.isEmpty()) {
                iK += CodedOutputStream.K(4, getEmojiType());
            }
            for (int i2 = 0; i2 < this.result_.size(); i2++) {
                iK += CodedOutputStream.C(5, (q) this.result_.get(i2));
            }
            if (this.tempdata_ != null) {
                iK += CodedOutputStream.C(6, getTempdata());
            }
            ((GeneratedMessageLite) this).memoizedSerializedSize = iK;
            return iK;
        }

        @Override // com.p1.mobile.longlink.msg.voicelivemessage.VoiceMicEmoji.VoiceEmojiPlayMessageOrBuilder
        public Template.TemplateData getTempdata() {
            Template.TemplateData templateData = this.tempdata_;
            return templateData == null ? Template.TemplateData.getDefaultInstance() : templateData;
        }

        @Override // com.p1.mobile.longlink.msg.voicelivemessage.VoiceMicEmoji.VoiceEmojiPlayMessageOrBuilder
        public String getUserId() {
            return this.userId_;
        }

        @Override // com.p1.mobile.longlink.msg.voicelivemessage.VoiceMicEmoji.VoiceEmojiPlayMessageOrBuilder
        public ByteString getUserIdBytes() {
            return ByteString.copyFromUtf8(this.userId_);
        }

        @Override // com.p1.mobile.longlink.msg.voicelivemessage.VoiceMicEmoji.VoiceEmojiPlayMessageOrBuilder
        public userMaskConfig.UserMask getUserMask() {
            userMaskConfig.UserMask userMask = this.userMask_;
            return userMask == null ? userMaskConfig.UserMask.getDefaultInstance() : userMask;
        }

        @Override // com.p1.mobile.longlink.msg.voicelivemessage.VoiceMicEmoji.VoiceEmojiPlayMessageOrBuilder
        public boolean hasTempdata() {
            return this.tempdata_ != null;
        }

        @Override // com.p1.mobile.longlink.msg.voicelivemessage.VoiceMicEmoji.VoiceEmojiPlayMessageOrBuilder
        public boolean hasUserMask() {
            return this.userMask_ != null;
        }

        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (!this.mid_.isEmpty()) {
                codedOutputStream.D0(1, getMid());
            }
            if (!this.userId_.isEmpty()) {
                codedOutputStream.D0(2, getUserId());
            }
            if (this.userMask_ != null) {
                codedOutputStream.w0(3, getUserMask());
            }
            if (!this.emojiType_.isEmpty()) {
                codedOutputStream.D0(4, getEmojiType());
            }
            for (int i = 0; i < this.result_.size(); i++) {
                codedOutputStream.w0(5, (q) this.result_.get(i));
            }
            if (this.tempdata_ != null) {
                codedOutputStream.w0(6, getTempdata());
            }
        }

        public static VoiceEmojiPlayMessage parseDelimitedFrom(InputStream inputStream, h hVar) throws IOException {
            return (VoiceEmojiPlayMessage) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, hVar);
        }

        public static VoiceEmojiPlayMessage parseFrom(ByteString byteString, h hVar) throws InvalidProtocolBufferException {
            return (VoiceEmojiPlayMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, hVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTempdata(Template.TemplateData templateData) {
            templateData.getClass();
            this.tempdata_ = templateData;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setUserMask(userMaskConfig.UserMask userMask) {
            userMask.getClass();
            this.userMask_ = userMask;
        }

        public static final class Builder extends GeneratedMessageLite.b<VoiceEmojiPlayMessage, Builder> implements VoiceEmojiPlayMessageOrBuilder {
            private Builder() {
                super(VoiceEmojiPlayMessage.DEFAULT_INSTANCE);
            }

            public Builder addAllResult(Iterable<? extends EmojiPlayResult> iterable) {
                copyOnWrite();
                ((VoiceEmojiPlayMessage) ((GeneratedMessageLite.b) this).instance).addAllResult(iterable);
                return this;
            }

            public Builder addResult(EmojiPlayResult emojiPlayResult) {
                copyOnWrite();
                ((VoiceEmojiPlayMessage) ((GeneratedMessageLite.b) this).instance).addResult(emojiPlayResult);
                return this;
            }

            public Builder clearEmojiType() {
                copyOnWrite();
                ((VoiceEmojiPlayMessage) ((GeneratedMessageLite.b) this).instance).clearEmojiType();
                return this;
            }

            public Builder clearMid() {
                copyOnWrite();
                ((VoiceEmojiPlayMessage) ((GeneratedMessageLite.b) this).instance).clearMid();
                return this;
            }

            public Builder clearResult() {
                copyOnWrite();
                ((VoiceEmojiPlayMessage) ((GeneratedMessageLite.b) this).instance).clearResult();
                return this;
            }

            public Builder clearTempdata() {
                copyOnWrite();
                ((VoiceEmojiPlayMessage) ((GeneratedMessageLite.b) this).instance).clearTempdata();
                return this;
            }

            public Builder clearUserId() {
                copyOnWrite();
                ((VoiceEmojiPlayMessage) ((GeneratedMessageLite.b) this).instance).clearUserId();
                return this;
            }

            public Builder clearUserMask() {
                copyOnWrite();
                ((VoiceEmojiPlayMessage) ((GeneratedMessageLite.b) this).instance).clearUserMask();
                return this;
            }

            @Override // com.p1.mobile.longlink.msg.voicelivemessage.VoiceMicEmoji.VoiceEmojiPlayMessageOrBuilder
            public String getEmojiType() {
                return ((VoiceEmojiPlayMessage) ((GeneratedMessageLite.b) this).instance).getEmojiType();
            }

            @Override // com.p1.mobile.longlink.msg.voicelivemessage.VoiceMicEmoji.VoiceEmojiPlayMessageOrBuilder
            public ByteString getEmojiTypeBytes() {
                return ((VoiceEmojiPlayMessage) ((GeneratedMessageLite.b) this).instance).getEmojiTypeBytes();
            }

            @Override // com.p1.mobile.longlink.msg.voicelivemessage.VoiceMicEmoji.VoiceEmojiPlayMessageOrBuilder
            public String getMid() {
                return ((VoiceEmojiPlayMessage) ((GeneratedMessageLite.b) this).instance).getMid();
            }

            @Override // com.p1.mobile.longlink.msg.voicelivemessage.VoiceMicEmoji.VoiceEmojiPlayMessageOrBuilder
            public ByteString getMidBytes() {
                return ((VoiceEmojiPlayMessage) ((GeneratedMessageLite.b) this).instance).getMidBytes();
            }

            @Override // com.p1.mobile.longlink.msg.voicelivemessage.VoiceMicEmoji.VoiceEmojiPlayMessageOrBuilder
            public EmojiPlayResult getResult(int i) {
                return ((VoiceEmojiPlayMessage) ((GeneratedMessageLite.b) this).instance).getResult(i);
            }

            @Override // com.p1.mobile.longlink.msg.voicelivemessage.VoiceMicEmoji.VoiceEmojiPlayMessageOrBuilder
            public int getResultCount() {
                return ((VoiceEmojiPlayMessage) ((GeneratedMessageLite.b) this).instance).getResultCount();
            }

            @Override // com.p1.mobile.longlink.msg.voicelivemessage.VoiceMicEmoji.VoiceEmojiPlayMessageOrBuilder
            public List<EmojiPlayResult> getResultList() {
                return Collections.unmodifiableList(((VoiceEmojiPlayMessage) ((GeneratedMessageLite.b) this).instance).getResultList());
            }

            @Override // com.p1.mobile.longlink.msg.voicelivemessage.VoiceMicEmoji.VoiceEmojiPlayMessageOrBuilder
            public Template.TemplateData getTempdata() {
                return ((VoiceEmojiPlayMessage) ((GeneratedMessageLite.b) this).instance).getTempdata();
            }

            @Override // com.p1.mobile.longlink.msg.voicelivemessage.VoiceMicEmoji.VoiceEmojiPlayMessageOrBuilder
            public String getUserId() {
                return ((VoiceEmojiPlayMessage) ((GeneratedMessageLite.b) this).instance).getUserId();
            }

            @Override // com.p1.mobile.longlink.msg.voicelivemessage.VoiceMicEmoji.VoiceEmojiPlayMessageOrBuilder
            public ByteString getUserIdBytes() {
                return ((VoiceEmojiPlayMessage) ((GeneratedMessageLite.b) this).instance).getUserIdBytes();
            }

            @Override // com.p1.mobile.longlink.msg.voicelivemessage.VoiceMicEmoji.VoiceEmojiPlayMessageOrBuilder
            public userMaskConfig.UserMask getUserMask() {
                return ((VoiceEmojiPlayMessage) ((GeneratedMessageLite.b) this).instance).getUserMask();
            }

            @Override // com.p1.mobile.longlink.msg.voicelivemessage.VoiceMicEmoji.VoiceEmojiPlayMessageOrBuilder
            public boolean hasTempdata() {
                return ((VoiceEmojiPlayMessage) ((GeneratedMessageLite.b) this).instance).hasTempdata();
            }

            @Override // com.p1.mobile.longlink.msg.voicelivemessage.VoiceMicEmoji.VoiceEmojiPlayMessageOrBuilder
            public boolean hasUserMask() {
                return ((VoiceEmojiPlayMessage) ((GeneratedMessageLite.b) this).instance).hasUserMask();
            }

            public Builder mergeTempdata(Template.TemplateData templateData) {
                copyOnWrite();
                ((VoiceEmojiPlayMessage) ((GeneratedMessageLite.b) this).instance).mergeTempdata(templateData);
                return this;
            }

            public Builder mergeUserMask(userMaskConfig.UserMask userMask) {
                copyOnWrite();
                ((VoiceEmojiPlayMessage) ((GeneratedMessageLite.b) this).instance).mergeUserMask(userMask);
                return this;
            }

            public Builder removeResult(int i) {
                copyOnWrite();
                ((VoiceEmojiPlayMessage) ((GeneratedMessageLite.b) this).instance).removeResult(i);
                return this;
            }

            public Builder setEmojiType(String str) {
                copyOnWrite();
                ((VoiceEmojiPlayMessage) ((GeneratedMessageLite.b) this).instance).setEmojiType(str);
                return this;
            }

            public Builder setEmojiTypeBytes(ByteString byteString) {
                copyOnWrite();
                ((VoiceEmojiPlayMessage) ((GeneratedMessageLite.b) this).instance).setEmojiTypeBytes(byteString);
                return this;
            }

            public Builder setMid(String str) {
                copyOnWrite();
                ((VoiceEmojiPlayMessage) ((GeneratedMessageLite.b) this).instance).setMid(str);
                return this;
            }

            public Builder setMidBytes(ByteString byteString) {
                copyOnWrite();
                ((VoiceEmojiPlayMessage) ((GeneratedMessageLite.b) this).instance).setMidBytes(byteString);
                return this;
            }

            public Builder setResult(int i, EmojiPlayResult emojiPlayResult) {
                copyOnWrite();
                ((VoiceEmojiPlayMessage) ((GeneratedMessageLite.b) this).instance).setResult(i, emojiPlayResult);
                return this;
            }

            public Builder setTempdata(Template.TemplateData templateData) {
                copyOnWrite();
                ((VoiceEmojiPlayMessage) ((GeneratedMessageLite.b) this).instance).setTempdata(templateData);
                return this;
            }

            public Builder setUserId(String str) {
                copyOnWrite();
                ((VoiceEmojiPlayMessage) ((GeneratedMessageLite.b) this).instance).setUserId(str);
                return this;
            }

            public Builder setUserIdBytes(ByteString byteString) {
                copyOnWrite();
                ((VoiceEmojiPlayMessage) ((GeneratedMessageLite.b) this).instance).setUserIdBytes(byteString);
                return this;
            }

            public Builder setUserMask(userMaskConfig.UserMask userMask) {
                copyOnWrite();
                ((VoiceEmojiPlayMessage) ((GeneratedMessageLite.b) this).instance).setUserMask(userMask);
                return this;
            }

            public Builder addResult(int i, EmojiPlayResult emojiPlayResult) {
                copyOnWrite();
                ((VoiceEmojiPlayMessage) ((GeneratedMessageLite.b) this).instance).addResult(i, emojiPlayResult);
                return this;
            }

            public Builder setResult(int i, EmojiPlayResult.Builder builder) {
                copyOnWrite();
                ((VoiceEmojiPlayMessage) ((GeneratedMessageLite.b) this).instance).setResult(i, builder);
                return this;
            }

            public Builder setTempdata(Template.TemplateData.Builder builder) {
                copyOnWrite();
                ((VoiceEmojiPlayMessage) ((GeneratedMessageLite.b) this).instance).setTempdata(builder);
                return this;
            }

            public Builder setUserMask(userMaskConfig.UserMask.Builder builder) {
                copyOnWrite();
                ((VoiceEmojiPlayMessage) ((GeneratedMessageLite.b) this).instance).setUserMask(builder);
                return this;
            }

            public Builder addResult(EmojiPlayResult.Builder builder) {
                copyOnWrite();
                ((VoiceEmojiPlayMessage) ((GeneratedMessageLite.b) this).instance).addResult(builder);
                return this;
            }

            public Builder addResult(int i, EmojiPlayResult.Builder builder) {
                copyOnWrite();
                ((VoiceEmojiPlayMessage) ((GeneratedMessageLite.b) this).instance).addResult(i, builder);
                return this;
            }
        }

        public static VoiceEmojiPlayMessage parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (VoiceEmojiPlayMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static VoiceEmojiPlayMessage parseFrom(byte[] bArr, h hVar) throws InvalidProtocolBufferException {
            return (VoiceEmojiPlayMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, hVar);
        }

        public static VoiceEmojiPlayMessage parseFrom(InputStream inputStream) throws IOException {
            return (VoiceEmojiPlayMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static VoiceEmojiPlayMessage parseFrom(InputStream inputStream, h hVar) throws IOException {
            return (VoiceEmojiPlayMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, hVar);
        }

        public static VoiceEmojiPlayMessage parseFrom(e eVar) throws IOException {
            return (VoiceEmojiPlayMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addResult(int i, EmojiPlayResult emojiPlayResult) {
            emojiPlayResult.getClass();
            ensureResultIsMutable();
            this.result_.add(i, emojiPlayResult);
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.toBuilder();
        }

        public static VoiceEmojiPlayMessage parseFrom(e eVar, h hVar) throws IOException {
            return (VoiceEmojiPlayMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, eVar, hVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setResult(int i, EmojiPlayResult emojiPlayResult) {
            emojiPlayResult.getClass();
            ensureResultIsMutable();
            this.result_.set(i, emojiPlayResult);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addResult(EmojiPlayResult emojiPlayResult) {
            emojiPlayResult.getClass();
            ensureResultIsMutable();
            this.result_.add(emojiPlayResult);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addResult(int i, EmojiPlayResult.Builder builder) {
            ensureResultIsMutable();
            this.result_.add(i, (EmojiPlayResult) builder.build());
        }
    }
}
