package com.p046p1.mobile.longlink.msg.voicelivemessage;

import com.alibaba.fastjson.asm.Opcodes;
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
import org.spongycastle.asn1.eac.EACTags;
import p149l.aag0;
import p149l.bz00;
import p149l.i860;
import p149l.o6z;

/* JADX INFO: loaded from: classes8.dex */
public final class VoiceLiveBullet {

    /* JADX INFO: renamed from: com.p1.mobile.longlink.msg.voicelivemessage.VoiceLiveBullet$1 */
    public static /* synthetic */ class C45611 {

        /* JADX INFO: renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f16004xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f16004xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f16004xa1df5c61[GeneratedMessageLite.MethodToInvoke.IS_INITIALIZED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f16004xa1df5c61[GeneratedMessageLite.MethodToInvoke.MAKE_IMMUTABLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f16004xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f16004xa1df5c61[GeneratedMessageLite.MethodToInvoke.VISIT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f16004xa1df5c61[GeneratedMessageLite.MethodToInvoke.MERGE_FROM_STREAM.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f16004xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f16004xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    public interface SystemVoiceLiveCommentBackgroundOrBuilder extends o6z {
        String getBottomImgUrl();

        ByteString getBottomImgUrlBytes();

        String getCoverImgUrl();

        ByteString getCoverImgUrlBytes();

        @Override // p149l.o6z
        /* synthetic */ InterfaceC3419q getDefaultInstanceForType();

        String getHeaderImgUrl();

        ByteString getHeaderImgUrlBytes();

        String getMiddleImgUrl();

        ByteString getMiddleImgUrlBytes();

        @Override // p149l.o6z
        /* synthetic */ boolean isInitialized();
    }

    public interface SystemVoiceLiveCommentsMsgOrBuilder extends o6z {
        Alignment getAlignment();

        int getAlignmentValue();

        SystemVoiceLiveCommentBackground getBackground();

        @Override // p149l.o6z
        /* synthetic */ InterfaceC3419q getDefaultInstanceForType();

        long getDisplayDuration();

        String getEndColor();

        ByteString getEndColorBytes();

        String getGotoSchema();

        ByteString getGotoSchemaBytes();

        String getIconUrl();

        ByteString getIconUrlBytes();

        String getId();

        ByteString getIdBytes();

        String getLiveID();

        ByteString getLiveIDBytes();

        long getPriority();

        String getRoomID();

        ByteString getRoomIDBytes();

        String getStartColor();

        ByteString getStartColorBytes();

        TemplateData getTemplateData();

        String getType();

        ByteString getTypeBytes();

        boolean hasBackground();

        boolean hasTemplateData();

        @Override // p149l.o6z
        /* synthetic */ boolean isInitialized();
    }

    public interface TemplateDataOrBuilder extends o6z {
        @Override // p149l.o6z
        /* synthetic */ InterfaceC3419q getDefaultInstanceForType();

        String getFields(int i);

        ByteString getFieldsBytes(int i);

        int getFieldsCount();

        List<String> getFieldsList();

        int getId();

        @Override // p149l.o6z
        /* synthetic */ boolean isInitialized();
    }

    private VoiceLiveBullet() {
    }

    public static void registerAllExtensions(C3410h c3410h) {
    }

    public enum Alignment implements C3414l.c {
        Center(0),
        Left(1),
        UNRECOGNIZED(-1);

        public static final int Center_VALUE = 0;
        public static final int Left_VALUE = 1;
        private static final C3414l.d<Alignment> internalValueMap = new C3414l.d<Alignment>() { // from class: com.p1.mobile.longlink.msg.voicelivemessage.VoiceLiveBullet.Alignment.1
            @Override // com.google.protobuf.C3414l.d
            public Alignment findValueByNumber(int i) {
                return Alignment.forNumber(i);
            }
        };
        private final int value;

        Alignment(int i) {
            this.value = i;
        }

        public static Alignment forNumber(int i) {
            if (i == 0) {
                return Center;
            }
            if (i != 1) {
                return null;
            }
            return Left;
        }

        public static C3414l.d<Alignment> internalGetValueMap() {
            return internalValueMap;
        }

        @Override // com.google.protobuf.C3414l.c
        public final int getNumber() {
            return this.value;
        }

        @Deprecated
        public static Alignment valueOf(int i) {
            return forNumber(i);
        }
    }

    public static final class SystemVoiceLiveCommentBackground extends GeneratedMessageLite<SystemVoiceLiveCommentBackground, Builder> implements SystemVoiceLiveCommentBackgroundOrBuilder {
        public static final int BOTTOMIMGURL_FIELD_NUMBER = 3;
        public static final int COVERIMGURL_FIELD_NUMBER = 4;
        private static final SystemVoiceLiveCommentBackground DEFAULT_INSTANCE;
        public static final int HEADERIMGURL_FIELD_NUMBER = 1;
        public static final int MIDDLEIMGURL_FIELD_NUMBER = 2;
        private static volatile i860<SystemVoiceLiveCommentBackground> PARSER;
        private String headerImgUrl_ = "";
        private String middleImgUrl_ = "";
        private String bottomImgUrl_ = "";
        private String coverImgUrl_ = "";

        public static final class Builder extends GeneratedMessageLite.AbstractC3380b<SystemVoiceLiveCommentBackground, Builder> implements SystemVoiceLiveCommentBackgroundOrBuilder {
            private Builder() {
                super(SystemVoiceLiveCommentBackground.DEFAULT_INSTANCE);
            }

            public Builder clearBottomImgUrl() {
                copyOnWrite();
                ((SystemVoiceLiveCommentBackground) this.instance).clearBottomImgUrl();
                return this;
            }

            public Builder clearCoverImgUrl() {
                copyOnWrite();
                ((SystemVoiceLiveCommentBackground) this.instance).clearCoverImgUrl();
                return this;
            }

            public Builder clearHeaderImgUrl() {
                copyOnWrite();
                ((SystemVoiceLiveCommentBackground) this.instance).clearHeaderImgUrl();
                return this;
            }

            public Builder clearMiddleImgUrl() {
                copyOnWrite();
                ((SystemVoiceLiveCommentBackground) this.instance).clearMiddleImgUrl();
                return this;
            }

            @Override // com.p1.mobile.longlink.msg.voicelivemessage.VoiceLiveBullet.SystemVoiceLiveCommentBackgroundOrBuilder
            public String getBottomImgUrl() {
                return ((SystemVoiceLiveCommentBackground) this.instance).getBottomImgUrl();
            }

            @Override // com.p1.mobile.longlink.msg.voicelivemessage.VoiceLiveBullet.SystemVoiceLiveCommentBackgroundOrBuilder
            public ByteString getBottomImgUrlBytes() {
                return ((SystemVoiceLiveCommentBackground) this.instance).getBottomImgUrlBytes();
            }

            @Override // com.p1.mobile.longlink.msg.voicelivemessage.VoiceLiveBullet.SystemVoiceLiveCommentBackgroundOrBuilder
            public String getCoverImgUrl() {
                return ((SystemVoiceLiveCommentBackground) this.instance).getCoverImgUrl();
            }

            @Override // com.p1.mobile.longlink.msg.voicelivemessage.VoiceLiveBullet.SystemVoiceLiveCommentBackgroundOrBuilder
            public ByteString getCoverImgUrlBytes() {
                return ((SystemVoiceLiveCommentBackground) this.instance).getCoverImgUrlBytes();
            }

            @Override // com.p1.mobile.longlink.msg.voicelivemessage.VoiceLiveBullet.SystemVoiceLiveCommentBackgroundOrBuilder
            public String getHeaderImgUrl() {
                return ((SystemVoiceLiveCommentBackground) this.instance).getHeaderImgUrl();
            }

            @Override // com.p1.mobile.longlink.msg.voicelivemessage.VoiceLiveBullet.SystemVoiceLiveCommentBackgroundOrBuilder
            public ByteString getHeaderImgUrlBytes() {
                return ((SystemVoiceLiveCommentBackground) this.instance).getHeaderImgUrlBytes();
            }

            @Override // com.p1.mobile.longlink.msg.voicelivemessage.VoiceLiveBullet.SystemVoiceLiveCommentBackgroundOrBuilder
            public String getMiddleImgUrl() {
                return ((SystemVoiceLiveCommentBackground) this.instance).getMiddleImgUrl();
            }

            @Override // com.p1.mobile.longlink.msg.voicelivemessage.VoiceLiveBullet.SystemVoiceLiveCommentBackgroundOrBuilder
            public ByteString getMiddleImgUrlBytes() {
                return ((SystemVoiceLiveCommentBackground) this.instance).getMiddleImgUrlBytes();
            }

            public Builder setBottomImgUrl(String str) {
                copyOnWrite();
                ((SystemVoiceLiveCommentBackground) this.instance).setBottomImgUrl(str);
                return this;
            }

            public Builder setBottomImgUrlBytes(ByteString byteString) {
                copyOnWrite();
                ((SystemVoiceLiveCommentBackground) this.instance).setBottomImgUrlBytes(byteString);
                return this;
            }

            public Builder setCoverImgUrl(String str) {
                copyOnWrite();
                ((SystemVoiceLiveCommentBackground) this.instance).setCoverImgUrl(str);
                return this;
            }

            public Builder setCoverImgUrlBytes(ByteString byteString) {
                copyOnWrite();
                ((SystemVoiceLiveCommentBackground) this.instance).setCoverImgUrlBytes(byteString);
                return this;
            }

            public Builder setHeaderImgUrl(String str) {
                copyOnWrite();
                ((SystemVoiceLiveCommentBackground) this.instance).setHeaderImgUrl(str);
                return this;
            }

            public Builder setHeaderImgUrlBytes(ByteString byteString) {
                copyOnWrite();
                ((SystemVoiceLiveCommentBackground) this.instance).setHeaderImgUrlBytes(byteString);
                return this;
            }

            public Builder setMiddleImgUrl(String str) {
                copyOnWrite();
                ((SystemVoiceLiveCommentBackground) this.instance).setMiddleImgUrl(str);
                return this;
            }

            public Builder setMiddleImgUrlBytes(ByteString byteString) {
                copyOnWrite();
                ((SystemVoiceLiveCommentBackground) this.instance).setMiddleImgUrlBytes(byteString);
                return this;
            }
        }

        static {
            SystemVoiceLiveCommentBackground systemVoiceLiveCommentBackground = new SystemVoiceLiveCommentBackground();
            DEFAULT_INSTANCE = systemVoiceLiveCommentBackground;
            systemVoiceLiveCommentBackground.makeImmutable();
        }

        private SystemVoiceLiveCommentBackground() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearBottomImgUrl() {
            this.bottomImgUrl_ = getDefaultInstance().getBottomImgUrl();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearCoverImgUrl() {
            this.coverImgUrl_ = getDefaultInstance().getCoverImgUrl();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearHeaderImgUrl() {
            this.headerImgUrl_ = getDefaultInstance().getHeaderImgUrl();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearMiddleImgUrl() {
            this.middleImgUrl_ = getDefaultInstance().getMiddleImgUrl();
        }

        public static SystemVoiceLiveCommentBackground getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder(SystemVoiceLiveCommentBackground systemVoiceLiveCommentBackground) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(systemVoiceLiveCommentBackground);
        }

        public static SystemVoiceLiveCommentBackground parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (SystemVoiceLiveCommentBackground) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static SystemVoiceLiveCommentBackground parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (SystemVoiceLiveCommentBackground) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static i860<SystemVoiceLiveCommentBackground> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setBottomImgUrl(String str) {
            str.getClass();
            this.bottomImgUrl_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setBottomImgUrlBytes(ByteString byteString) {
            byteString.getClass();
            AbstractC3403a.checkByteStringIsUtf8(byteString);
            this.bottomImgUrl_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setCoverImgUrl(String str) {
            str.getClass();
            this.coverImgUrl_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setCoverImgUrlBytes(ByteString byteString) {
            byteString.getClass();
            AbstractC3403a.checkByteStringIsUtf8(byteString);
            this.coverImgUrl_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setHeaderImgUrl(String str) {
            str.getClass();
            this.headerImgUrl_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setHeaderImgUrlBytes(ByteString byteString) {
            byteString.getClass();
            AbstractC3403a.checkByteStringIsUtf8(byteString);
            this.headerImgUrl_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setMiddleImgUrl(String str) {
            str.getClass();
            this.middleImgUrl_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setMiddleImgUrlBytes(ByteString byteString) {
            byteString.getClass();
            AbstractC3403a.checkByteStringIsUtf8(byteString);
            this.middleImgUrl_ = byteString.toStringUtf8();
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (C45611.f16004xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new SystemVoiceLiveCommentBackground();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                    return null;
                case 4:
                    return new Builder();
                case 5:
                    GeneratedMessageLite.InterfaceC3386h interfaceC3386h = (GeneratedMessageLite.InterfaceC3386h) obj;
                    SystemVoiceLiveCommentBackground systemVoiceLiveCommentBackground = (SystemVoiceLiveCommentBackground) obj2;
                    this.headerImgUrl_ = interfaceC3386h.mo16997f(!this.headerImgUrl_.isEmpty(), this.headerImgUrl_, !systemVoiceLiveCommentBackground.headerImgUrl_.isEmpty(), systemVoiceLiveCommentBackground.headerImgUrl_);
                    this.middleImgUrl_ = interfaceC3386h.mo16997f(!this.middleImgUrl_.isEmpty(), this.middleImgUrl_, !systemVoiceLiveCommentBackground.middleImgUrl_.isEmpty(), systemVoiceLiveCommentBackground.middleImgUrl_);
                    this.bottomImgUrl_ = interfaceC3386h.mo16997f(!this.bottomImgUrl_.isEmpty(), this.bottomImgUrl_, !systemVoiceLiveCommentBackground.bottomImgUrl_.isEmpty(), systemVoiceLiveCommentBackground.bottomImgUrl_);
                    this.coverImgUrl_ = interfaceC3386h.mo16997f(!this.coverImgUrl_.isEmpty(), this.coverImgUrl_, true ^ systemVoiceLiveCommentBackground.coverImgUrl_.isEmpty(), systemVoiceLiveCommentBackground.coverImgUrl_);
                    GeneratedMessageLite.C3385g c3385g = GeneratedMessageLite.C3385g.INSTANCE;
                    return this;
                case 6:
                    C3407e c3407e = (C3407e) obj;
                    boolean z = false;
                    while (!z) {
                        try {
                            int iM17116M = c3407e.m17116M();
                            if (iM17116M != 0) {
                                if (iM17116M == 10) {
                                    this.headerImgUrl_ = c3407e.m17115L();
                                } else if (iM17116M == 18) {
                                    this.middleImgUrl_ = c3407e.m17115L();
                                } else if (iM17116M == 26) {
                                    this.bottomImgUrl_ = c3407e.m17115L();
                                } else if (iM17116M == 34) {
                                    this.coverImgUrl_ = c3407e.m17115L();
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
                        synchronized (SystemVoiceLiveCommentBackground.class) {
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

        @Override // com.p1.mobile.longlink.msg.voicelivemessage.VoiceLiveBullet.SystemVoiceLiveCommentBackgroundOrBuilder
        public String getBottomImgUrl() {
            return this.bottomImgUrl_;
        }

        @Override // com.p1.mobile.longlink.msg.voicelivemessage.VoiceLiveBullet.SystemVoiceLiveCommentBackgroundOrBuilder
        public ByteString getBottomImgUrlBytes() {
            return ByteString.copyFromUtf8(this.bottomImgUrl_);
        }

        @Override // com.p1.mobile.longlink.msg.voicelivemessage.VoiceLiveBullet.SystemVoiceLiveCommentBackgroundOrBuilder
        public String getCoverImgUrl() {
            return this.coverImgUrl_;
        }

        @Override // com.p1.mobile.longlink.msg.voicelivemessage.VoiceLiveBullet.SystemVoiceLiveCommentBackgroundOrBuilder
        public ByteString getCoverImgUrlBytes() {
            return ByteString.copyFromUtf8(this.coverImgUrl_);
        }

        @Override // com.p1.mobile.longlink.msg.voicelivemessage.VoiceLiveBullet.SystemVoiceLiveCommentBackgroundOrBuilder
        public String getHeaderImgUrl() {
            return this.headerImgUrl_;
        }

        @Override // com.p1.mobile.longlink.msg.voicelivemessage.VoiceLiveBullet.SystemVoiceLiveCommentBackgroundOrBuilder
        public ByteString getHeaderImgUrlBytes() {
            return ByteString.copyFromUtf8(this.headerImgUrl_);
        }

        @Override // com.p1.mobile.longlink.msg.voicelivemessage.VoiceLiveBullet.SystemVoiceLiveCommentBackgroundOrBuilder
        public String getMiddleImgUrl() {
            return this.middleImgUrl_;
        }

        @Override // com.p1.mobile.longlink.msg.voicelivemessage.VoiceLiveBullet.SystemVoiceLiveCommentBackgroundOrBuilder
        public ByteString getMiddleImgUrlBytes() {
            return ByteString.copyFromUtf8(this.middleImgUrl_);
        }

        @Override // com.google.protobuf.InterfaceC3419q
        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int iM16901K = !this.headerImgUrl_.isEmpty() ? CodedOutputStream.m16901K(1, getHeaderImgUrl()) : 0;
            if (!this.middleImgUrl_.isEmpty()) {
                iM16901K += CodedOutputStream.m16901K(2, getMiddleImgUrl());
            }
            if (!this.bottomImgUrl_.isEmpty()) {
                iM16901K += CodedOutputStream.m16901K(3, getBottomImgUrl());
            }
            if (!this.coverImgUrl_.isEmpty()) {
                iM16901K += CodedOutputStream.m16901K(4, getCoverImgUrl());
            }
            this.memoizedSerializedSize = iM16901K;
            return iM16901K;
        }

        @Override // com.google.protobuf.InterfaceC3419q
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (!this.headerImgUrl_.isEmpty()) {
                codedOutputStream.mo16939D0(1, getHeaderImgUrl());
            }
            if (!this.middleImgUrl_.isEmpty()) {
                codedOutputStream.mo16939D0(2, getMiddleImgUrl());
            }
            if (!this.bottomImgUrl_.isEmpty()) {
                codedOutputStream.mo16939D0(3, getBottomImgUrl());
            }
            if (this.coverImgUrl_.isEmpty()) {
                return;
            }
            codedOutputStream.mo16939D0(4, getCoverImgUrl());
        }

        public static SystemVoiceLiveCommentBackground parseDelimitedFrom(InputStream inputStream, C3410h c3410h) throws IOException {
            return (SystemVoiceLiveCommentBackground) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, c3410h);
        }

        public static SystemVoiceLiveCommentBackground parseFrom(ByteString byteString, C3410h c3410h) throws InvalidProtocolBufferException {
            return (SystemVoiceLiveCommentBackground) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, c3410h);
        }

        public static SystemVoiceLiveCommentBackground parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (SystemVoiceLiveCommentBackground) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static SystemVoiceLiveCommentBackground parseFrom(byte[] bArr, C3410h c3410h) throws InvalidProtocolBufferException {
            return (SystemVoiceLiveCommentBackground) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, c3410h);
        }

        public static SystemVoiceLiveCommentBackground parseFrom(InputStream inputStream) throws IOException {
            return (SystemVoiceLiveCommentBackground) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static SystemVoiceLiveCommentBackground parseFrom(InputStream inputStream, C3410h c3410h) throws IOException {
            return (SystemVoiceLiveCommentBackground) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, c3410h);
        }

        public static SystemVoiceLiveCommentBackground parseFrom(C3407e c3407e) throws IOException {
            return (SystemVoiceLiveCommentBackground) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, c3407e);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static SystemVoiceLiveCommentBackground parseFrom(C3407e c3407e, C3410h c3410h) throws IOException {
            return (SystemVoiceLiveCommentBackground) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, c3407e, c3410h);
        }
    }

    public static final class SystemVoiceLiveCommentsMsg extends GeneratedMessageLite<SystemVoiceLiveCommentsMsg, Builder> implements SystemVoiceLiveCommentsMsgOrBuilder {
        public static final int ALIGNMENT_FIELD_NUMBER = 13;
        public static final int BACKGROUND_FIELD_NUMBER = 11;
        private static final SystemVoiceLiveCommentsMsg DEFAULT_INSTANCE;
        public static final int DISPLAYDURATION_FIELD_NUMBER = 6;
        public static final int ENDCOLOR_FIELD_NUMBER = 5;
        public static final int GOTOSCHEMA_FIELD_NUMBER = 7;
        public static final int ICONURL_FIELD_NUMBER = 3;
        public static final int ID_FIELD_NUMBER = 9;
        public static final int LIVEID_FIELD_NUMBER = 2;
        private static volatile i860<SystemVoiceLiveCommentsMsg> PARSER = null;
        public static final int PRIORITY_FIELD_NUMBER = 12;
        public static final int ROOMID_FIELD_NUMBER = 1;
        public static final int STARTCOLOR_FIELD_NUMBER = 4;
        public static final int TEMPLATEDATA_FIELD_NUMBER = 8;
        public static final int TYPE_FIELD_NUMBER = 10;
        private int alignment_;
        private SystemVoiceLiveCommentBackground background_;
        private long displayDuration_;
        private long priority_;
        private TemplateData templateData_;
        private String roomID_ = "";
        private String liveID_ = "";
        private String iconUrl_ = "";
        private String startColor_ = "";
        private String endColor_ = "";
        private String gotoSchema_ = "";
        private String id_ = "";
        private String type_ = "";

        static {
            SystemVoiceLiveCommentsMsg systemVoiceLiveCommentsMsg = new SystemVoiceLiveCommentsMsg();
            DEFAULT_INSTANCE = systemVoiceLiveCommentsMsg;
            systemVoiceLiveCommentsMsg.makeImmutable();
        }

        private SystemVoiceLiveCommentsMsg() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAlignment() {
            this.alignment_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearBackground() {
            this.background_ = null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearDisplayDuration() {
            this.displayDuration_ = 0L;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearEndColor() {
            this.endColor_ = getDefaultInstance().getEndColor();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearGotoSchema() {
            this.gotoSchema_ = getDefaultInstance().getGotoSchema();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearIconUrl() {
            this.iconUrl_ = getDefaultInstance().getIconUrl();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearId() {
            this.id_ = getDefaultInstance().getId();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearLiveID() {
            this.liveID_ = getDefaultInstance().getLiveID();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearPriority() {
            this.priority_ = 0L;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearRoomID() {
            this.roomID_ = getDefaultInstance().getRoomID();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearStartColor() {
            this.startColor_ = getDefaultInstance().getStartColor();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearTemplateData() {
            this.templateData_ = null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearType() {
            this.type_ = getDefaultInstance().getType();
        }

        public static SystemVoiceLiveCommentsMsg getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeBackground(SystemVoiceLiveCommentBackground systemVoiceLiveCommentBackground) {
            SystemVoiceLiveCommentBackground systemVoiceLiveCommentBackground2 = this.background_;
            if (systemVoiceLiveCommentBackground2 == null || systemVoiceLiveCommentBackground2 == SystemVoiceLiveCommentBackground.getDefaultInstance()) {
                this.background_ = systemVoiceLiveCommentBackground;
            } else {
                this.background_ = SystemVoiceLiveCommentBackground.newBuilder(this.background_).mergeFrom(systemVoiceLiveCommentBackground).buildPartial();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeTemplateData(TemplateData templateData) {
            TemplateData templateData2 = this.templateData_;
            if (templateData2 == null || templateData2 == TemplateData.getDefaultInstance()) {
                this.templateData_ = templateData;
            } else {
                this.templateData_ = TemplateData.newBuilder(this.templateData_).mergeFrom(templateData).buildPartial();
            }
        }

        public static Builder newBuilder(SystemVoiceLiveCommentsMsg systemVoiceLiveCommentsMsg) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(systemVoiceLiveCommentsMsg);
        }

        public static SystemVoiceLiveCommentsMsg parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (SystemVoiceLiveCommentsMsg) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static SystemVoiceLiveCommentsMsg parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (SystemVoiceLiveCommentsMsg) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static i860<SystemVoiceLiveCommentsMsg> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAlignment(Alignment alignment) {
            alignment.getClass();
            this.alignment_ = alignment.getNumber();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAlignmentValue(int i) {
            this.alignment_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setBackground(SystemVoiceLiveCommentBackground.Builder builder) {
            this.background_ = builder.build();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setDisplayDuration(long j) {
            this.displayDuration_ = j;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setEndColor(String str) {
            str.getClass();
            this.endColor_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setEndColorBytes(ByteString byteString) {
            byteString.getClass();
            AbstractC3403a.checkByteStringIsUtf8(byteString);
            this.endColor_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setGotoSchema(String str) {
            str.getClass();
            this.gotoSchema_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setGotoSchemaBytes(ByteString byteString) {
            byteString.getClass();
            AbstractC3403a.checkByteStringIsUtf8(byteString);
            this.gotoSchema_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setIconUrl(String str) {
            str.getClass();
            this.iconUrl_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setIconUrlBytes(ByteString byteString) {
            byteString.getClass();
            AbstractC3403a.checkByteStringIsUtf8(byteString);
            this.iconUrl_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setId(String str) {
            str.getClass();
            this.id_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setIdBytes(ByteString byteString) {
            byteString.getClass();
            AbstractC3403a.checkByteStringIsUtf8(byteString);
            this.id_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setLiveID(String str) {
            str.getClass();
            this.liveID_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setLiveIDBytes(ByteString byteString) {
            byteString.getClass();
            AbstractC3403a.checkByteStringIsUtf8(byteString);
            this.liveID_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setPriority(long j) {
            this.priority_ = j;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setRoomID(String str) {
            str.getClass();
            this.roomID_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setRoomIDBytes(ByteString byteString) {
            byteString.getClass();
            AbstractC3403a.checkByteStringIsUtf8(byteString);
            this.roomID_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setStartColor(String str) {
            str.getClass();
            this.startColor_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setStartColorBytes(ByteString byteString) {
            byteString.getClass();
            AbstractC3403a.checkByteStringIsUtf8(byteString);
            this.startColor_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTemplateData(TemplateData.Builder builder) {
            this.templateData_ = builder.build();
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
            switch (C45611.f16004xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new SystemVoiceLiveCommentsMsg();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                    return null;
                case 4:
                    return new Builder();
                case 5:
                    GeneratedMessageLite.InterfaceC3386h interfaceC3386h = (GeneratedMessageLite.InterfaceC3386h) obj;
                    SystemVoiceLiveCommentsMsg systemVoiceLiveCommentsMsg = (SystemVoiceLiveCommentsMsg) obj2;
                    this.roomID_ = interfaceC3386h.mo16997f(!this.roomID_.isEmpty(), this.roomID_, !systemVoiceLiveCommentsMsg.roomID_.isEmpty(), systemVoiceLiveCommentsMsg.roomID_);
                    this.liveID_ = interfaceC3386h.mo16997f(!this.liveID_.isEmpty(), this.liveID_, !systemVoiceLiveCommentsMsg.liveID_.isEmpty(), systemVoiceLiveCommentsMsg.liveID_);
                    this.iconUrl_ = interfaceC3386h.mo16997f(!this.iconUrl_.isEmpty(), this.iconUrl_, !systemVoiceLiveCommentsMsg.iconUrl_.isEmpty(), systemVoiceLiveCommentsMsg.iconUrl_);
                    this.startColor_ = interfaceC3386h.mo16997f(!this.startColor_.isEmpty(), this.startColor_, !systemVoiceLiveCommentsMsg.startColor_.isEmpty(), systemVoiceLiveCommentsMsg.startColor_);
                    this.endColor_ = interfaceC3386h.mo16997f(!this.endColor_.isEmpty(), this.endColor_, !systemVoiceLiveCommentsMsg.endColor_.isEmpty(), systemVoiceLiveCommentsMsg.endColor_);
                    long j = this.displayDuration_;
                    boolean z2 = j != 0;
                    long j2 = systemVoiceLiveCommentsMsg.displayDuration_;
                    this.displayDuration_ = interfaceC3386h.mo17000i(z2, j, j2 != 0, j2);
                    this.gotoSchema_ = interfaceC3386h.mo16997f(!this.gotoSchema_.isEmpty(), this.gotoSchema_, !systemVoiceLiveCommentsMsg.gotoSchema_.isEmpty(), systemVoiceLiveCommentsMsg.gotoSchema_);
                    this.templateData_ = (TemplateData) interfaceC3386h.mo17006o(this.templateData_, systemVoiceLiveCommentsMsg.templateData_);
                    this.id_ = interfaceC3386h.mo16997f(!this.id_.isEmpty(), this.id_, !systemVoiceLiveCommentsMsg.id_.isEmpty(), systemVoiceLiveCommentsMsg.id_);
                    this.type_ = interfaceC3386h.mo16997f(!this.type_.isEmpty(), this.type_, !systemVoiceLiveCommentsMsg.type_.isEmpty(), systemVoiceLiveCommentsMsg.type_);
                    this.background_ = (SystemVoiceLiveCommentBackground) interfaceC3386h.mo17006o(this.background_, systemVoiceLiveCommentsMsg.background_);
                    long j3 = this.priority_;
                    boolean z3 = j3 != 0;
                    long j4 = systemVoiceLiveCommentsMsg.priority_;
                    this.priority_ = interfaceC3386h.mo17000i(z3, j3, j4 != 0, j4);
                    int i = this.alignment_;
                    boolean z4 = i != 0;
                    int i2 = systemVoiceLiveCommentsMsg.alignment_;
                    this.alignment_ = interfaceC3386h.mo16996e(z4, i, i2 != 0, i2);
                    GeneratedMessageLite.C3385g c3385g = GeneratedMessageLite.C3385g.INSTANCE;
                    return this;
                case 6:
                    C3407e c3407e = (C3407e) obj;
                    C3410h c3410h = (C3410h) obj2;
                    while (!z) {
                        try {
                            int iM17116M = c3407e.m17116M();
                            switch (iM17116M) {
                                case 0:
                                    break;
                                case 10:
                                    this.roomID_ = c3407e.m17115L();
                                    continue;
                                case 18:
                                    this.liveID_ = c3407e.m17115L();
                                    continue;
                                case 26:
                                    this.iconUrl_ = c3407e.m17115L();
                                    continue;
                                case 34:
                                    this.startColor_ = c3407e.m17115L();
                                    continue;
                                case 42:
                                    this.endColor_ = c3407e.m17115L();
                                    continue;
                                case 48:
                                    this.displayDuration_ = c3407e.m17142v();
                                    continue;
                                case 58:
                                    this.gotoSchema_ = c3407e.m17115L();
                                    continue;
                                case 66:
                                    TemplateData templateData = this.templateData_;
                                    TemplateData.Builder builder = templateData != null ? templateData.toBuilder() : null;
                                    TemplateData templateData2 = (TemplateData) c3407e.m17143w(TemplateData.parser(), c3410h);
                                    this.templateData_ = templateData2;
                                    if (builder != null) {
                                        builder.mergeFrom(templateData2);
                                        this.templateData_ = builder.buildPartial();
                                    } else {
                                        continue;
                                    }
                                    break;
                                case 74:
                                    this.id_ = c3407e.m17115L();
                                    continue;
                                case EACTags.COMMAND_TO_PERFORM /* 82 */:
                                    this.type_ = c3407e.m17115L();
                                    continue;
                                case 90:
                                    SystemVoiceLiveCommentBackground systemVoiceLiveCommentBackground = this.background_;
                                    SystemVoiceLiveCommentBackground.Builder builder2 = systemVoiceLiveCommentBackground != null ? systemVoiceLiveCommentBackground.toBuilder() : null;
                                    SystemVoiceLiveCommentBackground systemVoiceLiveCommentBackground2 = (SystemVoiceLiveCommentBackground) c3407e.m17143w(SystemVoiceLiveCommentBackground.parser(), c3410h);
                                    this.background_ = systemVoiceLiveCommentBackground2;
                                    if (builder2 != null) {
                                        builder2.mergeFrom(systemVoiceLiveCommentBackground2);
                                        this.background_ = builder2.buildPartial();
                                    } else {
                                        continue;
                                    }
                                    break;
                                case Opcodes.IADD /* 96 */:
                                    this.priority_ = c3407e.m17142v();
                                    continue;
                                case 104:
                                    this.alignment_ = c3407e.m17136p();
                                    continue;
                                default:
                                    if (!c3407e.m17121R(iM17116M)) {
                                        break;
                                    }
                                    break;
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
                        synchronized (SystemVoiceLiveCommentsMsg.class) {
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

        @Override // com.p1.mobile.longlink.msg.voicelivemessage.VoiceLiveBullet.SystemVoiceLiveCommentsMsgOrBuilder
        public Alignment getAlignment() {
            Alignment alignmentForNumber = Alignment.forNumber(this.alignment_);
            return alignmentForNumber == null ? Alignment.UNRECOGNIZED : alignmentForNumber;
        }

        @Override // com.p1.mobile.longlink.msg.voicelivemessage.VoiceLiveBullet.SystemVoiceLiveCommentsMsgOrBuilder
        public int getAlignmentValue() {
            return this.alignment_;
        }

        @Override // com.p1.mobile.longlink.msg.voicelivemessage.VoiceLiveBullet.SystemVoiceLiveCommentsMsgOrBuilder
        public SystemVoiceLiveCommentBackground getBackground() {
            SystemVoiceLiveCommentBackground systemVoiceLiveCommentBackground = this.background_;
            return systemVoiceLiveCommentBackground == null ? SystemVoiceLiveCommentBackground.getDefaultInstance() : systemVoiceLiveCommentBackground;
        }

        @Override // com.p1.mobile.longlink.msg.voicelivemessage.VoiceLiveBullet.SystemVoiceLiveCommentsMsgOrBuilder
        public long getDisplayDuration() {
            return this.displayDuration_;
        }

        @Override // com.p1.mobile.longlink.msg.voicelivemessage.VoiceLiveBullet.SystemVoiceLiveCommentsMsgOrBuilder
        public String getEndColor() {
            return this.endColor_;
        }

        @Override // com.p1.mobile.longlink.msg.voicelivemessage.VoiceLiveBullet.SystemVoiceLiveCommentsMsgOrBuilder
        public ByteString getEndColorBytes() {
            return ByteString.copyFromUtf8(this.endColor_);
        }

        @Override // com.p1.mobile.longlink.msg.voicelivemessage.VoiceLiveBullet.SystemVoiceLiveCommentsMsgOrBuilder
        public String getGotoSchema() {
            return this.gotoSchema_;
        }

        @Override // com.p1.mobile.longlink.msg.voicelivemessage.VoiceLiveBullet.SystemVoiceLiveCommentsMsgOrBuilder
        public ByteString getGotoSchemaBytes() {
            return ByteString.copyFromUtf8(this.gotoSchema_);
        }

        @Override // com.p1.mobile.longlink.msg.voicelivemessage.VoiceLiveBullet.SystemVoiceLiveCommentsMsgOrBuilder
        public String getIconUrl() {
            return this.iconUrl_;
        }

        @Override // com.p1.mobile.longlink.msg.voicelivemessage.VoiceLiveBullet.SystemVoiceLiveCommentsMsgOrBuilder
        public ByteString getIconUrlBytes() {
            return ByteString.copyFromUtf8(this.iconUrl_);
        }

        @Override // com.p1.mobile.longlink.msg.voicelivemessage.VoiceLiveBullet.SystemVoiceLiveCommentsMsgOrBuilder
        public String getId() {
            return this.id_;
        }

        @Override // com.p1.mobile.longlink.msg.voicelivemessage.VoiceLiveBullet.SystemVoiceLiveCommentsMsgOrBuilder
        public ByteString getIdBytes() {
            return ByteString.copyFromUtf8(this.id_);
        }

        @Override // com.p1.mobile.longlink.msg.voicelivemessage.VoiceLiveBullet.SystemVoiceLiveCommentsMsgOrBuilder
        public String getLiveID() {
            return this.liveID_;
        }

        @Override // com.p1.mobile.longlink.msg.voicelivemessage.VoiceLiveBullet.SystemVoiceLiveCommentsMsgOrBuilder
        public ByteString getLiveIDBytes() {
            return ByteString.copyFromUtf8(this.liveID_);
        }

        @Override // com.p1.mobile.longlink.msg.voicelivemessage.VoiceLiveBullet.SystemVoiceLiveCommentsMsgOrBuilder
        public long getPriority() {
            return this.priority_;
        }

        @Override // com.p1.mobile.longlink.msg.voicelivemessage.VoiceLiveBullet.SystemVoiceLiveCommentsMsgOrBuilder
        public String getRoomID() {
            return this.roomID_;
        }

        @Override // com.p1.mobile.longlink.msg.voicelivemessage.VoiceLiveBullet.SystemVoiceLiveCommentsMsgOrBuilder
        public ByteString getRoomIDBytes() {
            return ByteString.copyFromUtf8(this.roomID_);
        }

        @Override // com.google.protobuf.InterfaceC3419q
        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int iM16901K = !this.roomID_.isEmpty() ? CodedOutputStream.m16901K(1, getRoomID()) : 0;
            if (!this.liveID_.isEmpty()) {
                iM16901K += CodedOutputStream.m16901K(2, getLiveID());
            }
            if (!this.iconUrl_.isEmpty()) {
                iM16901K += CodedOutputStream.m16901K(3, getIconUrl());
            }
            if (!this.startColor_.isEmpty()) {
                iM16901K += CodedOutputStream.m16901K(4, getStartColor());
            }
            if (!this.endColor_.isEmpty()) {
                iM16901K += CodedOutputStream.m16901K(5, getEndColor());
            }
            long j = this.displayDuration_;
            if (j != 0) {
                iM16901K += CodedOutputStream.m16931v(6, j);
            }
            if (!this.gotoSchema_.isEmpty()) {
                iM16901K += CodedOutputStream.m16901K(7, getGotoSchema());
            }
            if (this.templateData_ != null) {
                iM16901K += CodedOutputStream.m16893C(8, getTemplateData());
            }
            if (!this.id_.isEmpty()) {
                iM16901K += CodedOutputStream.m16901K(9, getId());
            }
            if (!this.type_.isEmpty()) {
                iM16901K += CodedOutputStream.m16901K(10, getType());
            }
            if (this.background_ != null) {
                iM16901K += CodedOutputStream.m16893C(11, getBackground());
            }
            long j2 = this.priority_;
            if (j2 != 0) {
                iM16901K += CodedOutputStream.m16931v(12, j2);
            }
            if (this.alignment_ != Alignment.Center.getNumber()) {
                iM16901K += CodedOutputStream.m16922m(13, this.alignment_);
            }
            this.memoizedSerializedSize = iM16901K;
            return iM16901K;
        }

        @Override // com.p1.mobile.longlink.msg.voicelivemessage.VoiceLiveBullet.SystemVoiceLiveCommentsMsgOrBuilder
        public String getStartColor() {
            return this.startColor_;
        }

        @Override // com.p1.mobile.longlink.msg.voicelivemessage.VoiceLiveBullet.SystemVoiceLiveCommentsMsgOrBuilder
        public ByteString getStartColorBytes() {
            return ByteString.copyFromUtf8(this.startColor_);
        }

        @Override // com.p1.mobile.longlink.msg.voicelivemessage.VoiceLiveBullet.SystemVoiceLiveCommentsMsgOrBuilder
        public TemplateData getTemplateData() {
            TemplateData templateData = this.templateData_;
            return templateData == null ? TemplateData.getDefaultInstance() : templateData;
        }

        @Override // com.p1.mobile.longlink.msg.voicelivemessage.VoiceLiveBullet.SystemVoiceLiveCommentsMsgOrBuilder
        public String getType() {
            return this.type_;
        }

        @Override // com.p1.mobile.longlink.msg.voicelivemessage.VoiceLiveBullet.SystemVoiceLiveCommentsMsgOrBuilder
        public ByteString getTypeBytes() {
            return ByteString.copyFromUtf8(this.type_);
        }

        @Override // com.p1.mobile.longlink.msg.voicelivemessage.VoiceLiveBullet.SystemVoiceLiveCommentsMsgOrBuilder
        public boolean hasBackground() {
            return this.background_ != null;
        }

        @Override // com.p1.mobile.longlink.msg.voicelivemessage.VoiceLiveBullet.SystemVoiceLiveCommentsMsgOrBuilder
        public boolean hasTemplateData() {
            return this.templateData_ != null;
        }

        @Override // com.google.protobuf.InterfaceC3419q
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (!this.roomID_.isEmpty()) {
                codedOutputStream.mo16939D0(1, getRoomID());
            }
            if (!this.liveID_.isEmpty()) {
                codedOutputStream.mo16939D0(2, getLiveID());
            }
            if (!this.iconUrl_.isEmpty()) {
                codedOutputStream.mo16939D0(3, getIconUrl());
            }
            if (!this.startColor_.isEmpty()) {
                codedOutputStream.mo16939D0(4, getStartColor());
            }
            if (!this.endColor_.isEmpty()) {
                codedOutputStream.mo16939D0(5, getEndColor());
            }
            long j = this.displayDuration_;
            if (j != 0) {
                codedOutputStream.m16972u0(6, j);
            }
            if (!this.gotoSchema_.isEmpty()) {
                codedOutputStream.mo16939D0(7, getGotoSchema());
            }
            if (this.templateData_ != null) {
                codedOutputStream.mo16974w0(8, getTemplateData());
            }
            if (!this.id_.isEmpty()) {
                codedOutputStream.mo16939D0(9, getId());
            }
            if (!this.type_.isEmpty()) {
                codedOutputStream.mo16939D0(10, getType());
            }
            if (this.background_ != null) {
                codedOutputStream.mo16974w0(11, getBackground());
            }
            long j2 = this.priority_;
            if (j2 != 0) {
                codedOutputStream.m16972u0(12, j2);
            }
            if (this.alignment_ != Alignment.Center.getNumber()) {
                codedOutputStream.m16960i0(13, this.alignment_);
            }
        }

        public static SystemVoiceLiveCommentsMsg parseDelimitedFrom(InputStream inputStream, C3410h c3410h) throws IOException {
            return (SystemVoiceLiveCommentsMsg) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, c3410h);
        }

        public static SystemVoiceLiveCommentsMsg parseFrom(ByteString byteString, C3410h c3410h) throws InvalidProtocolBufferException {
            return (SystemVoiceLiveCommentsMsg) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, c3410h);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setBackground(SystemVoiceLiveCommentBackground systemVoiceLiveCommentBackground) {
            systemVoiceLiveCommentBackground.getClass();
            this.background_ = systemVoiceLiveCommentBackground;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTemplateData(TemplateData templateData) {
            templateData.getClass();
            this.templateData_ = templateData;
        }

        public static final class Builder extends GeneratedMessageLite.AbstractC3380b<SystemVoiceLiveCommentsMsg, Builder> implements SystemVoiceLiveCommentsMsgOrBuilder {
            private Builder() {
                super(SystemVoiceLiveCommentsMsg.DEFAULT_INSTANCE);
            }

            public Builder clearAlignment() {
                copyOnWrite();
                ((SystemVoiceLiveCommentsMsg) this.instance).clearAlignment();
                return this;
            }

            public Builder clearBackground() {
                copyOnWrite();
                ((SystemVoiceLiveCommentsMsg) this.instance).clearBackground();
                return this;
            }

            public Builder clearDisplayDuration() {
                copyOnWrite();
                ((SystemVoiceLiveCommentsMsg) this.instance).clearDisplayDuration();
                return this;
            }

            public Builder clearEndColor() {
                copyOnWrite();
                ((SystemVoiceLiveCommentsMsg) this.instance).clearEndColor();
                return this;
            }

            public Builder clearGotoSchema() {
                copyOnWrite();
                ((SystemVoiceLiveCommentsMsg) this.instance).clearGotoSchema();
                return this;
            }

            public Builder clearIconUrl() {
                copyOnWrite();
                ((SystemVoiceLiveCommentsMsg) this.instance).clearIconUrl();
                return this;
            }

            public Builder clearId() {
                copyOnWrite();
                ((SystemVoiceLiveCommentsMsg) this.instance).clearId();
                return this;
            }

            public Builder clearLiveID() {
                copyOnWrite();
                ((SystemVoiceLiveCommentsMsg) this.instance).clearLiveID();
                return this;
            }

            public Builder clearPriority() {
                copyOnWrite();
                ((SystemVoiceLiveCommentsMsg) this.instance).clearPriority();
                return this;
            }

            public Builder clearRoomID() {
                copyOnWrite();
                ((SystemVoiceLiveCommentsMsg) this.instance).clearRoomID();
                return this;
            }

            public Builder clearStartColor() {
                copyOnWrite();
                ((SystemVoiceLiveCommentsMsg) this.instance).clearStartColor();
                return this;
            }

            public Builder clearTemplateData() {
                copyOnWrite();
                ((SystemVoiceLiveCommentsMsg) this.instance).clearTemplateData();
                return this;
            }

            public Builder clearType() {
                copyOnWrite();
                ((SystemVoiceLiveCommentsMsg) this.instance).clearType();
                return this;
            }

            @Override // com.p1.mobile.longlink.msg.voicelivemessage.VoiceLiveBullet.SystemVoiceLiveCommentsMsgOrBuilder
            public Alignment getAlignment() {
                return ((SystemVoiceLiveCommentsMsg) this.instance).getAlignment();
            }

            @Override // com.p1.mobile.longlink.msg.voicelivemessage.VoiceLiveBullet.SystemVoiceLiveCommentsMsgOrBuilder
            public int getAlignmentValue() {
                return ((SystemVoiceLiveCommentsMsg) this.instance).getAlignmentValue();
            }

            @Override // com.p1.mobile.longlink.msg.voicelivemessage.VoiceLiveBullet.SystemVoiceLiveCommentsMsgOrBuilder
            public SystemVoiceLiveCommentBackground getBackground() {
                return ((SystemVoiceLiveCommentsMsg) this.instance).getBackground();
            }

            @Override // com.p1.mobile.longlink.msg.voicelivemessage.VoiceLiveBullet.SystemVoiceLiveCommentsMsgOrBuilder
            public long getDisplayDuration() {
                return ((SystemVoiceLiveCommentsMsg) this.instance).getDisplayDuration();
            }

            @Override // com.p1.mobile.longlink.msg.voicelivemessage.VoiceLiveBullet.SystemVoiceLiveCommentsMsgOrBuilder
            public String getEndColor() {
                return ((SystemVoiceLiveCommentsMsg) this.instance).getEndColor();
            }

            @Override // com.p1.mobile.longlink.msg.voicelivemessage.VoiceLiveBullet.SystemVoiceLiveCommentsMsgOrBuilder
            public ByteString getEndColorBytes() {
                return ((SystemVoiceLiveCommentsMsg) this.instance).getEndColorBytes();
            }

            @Override // com.p1.mobile.longlink.msg.voicelivemessage.VoiceLiveBullet.SystemVoiceLiveCommentsMsgOrBuilder
            public String getGotoSchema() {
                return ((SystemVoiceLiveCommentsMsg) this.instance).getGotoSchema();
            }

            @Override // com.p1.mobile.longlink.msg.voicelivemessage.VoiceLiveBullet.SystemVoiceLiveCommentsMsgOrBuilder
            public ByteString getGotoSchemaBytes() {
                return ((SystemVoiceLiveCommentsMsg) this.instance).getGotoSchemaBytes();
            }

            @Override // com.p1.mobile.longlink.msg.voicelivemessage.VoiceLiveBullet.SystemVoiceLiveCommentsMsgOrBuilder
            public String getIconUrl() {
                return ((SystemVoiceLiveCommentsMsg) this.instance).getIconUrl();
            }

            @Override // com.p1.mobile.longlink.msg.voicelivemessage.VoiceLiveBullet.SystemVoiceLiveCommentsMsgOrBuilder
            public ByteString getIconUrlBytes() {
                return ((SystemVoiceLiveCommentsMsg) this.instance).getIconUrlBytes();
            }

            @Override // com.p1.mobile.longlink.msg.voicelivemessage.VoiceLiveBullet.SystemVoiceLiveCommentsMsgOrBuilder
            public String getId() {
                return ((SystemVoiceLiveCommentsMsg) this.instance).getId();
            }

            @Override // com.p1.mobile.longlink.msg.voicelivemessage.VoiceLiveBullet.SystemVoiceLiveCommentsMsgOrBuilder
            public ByteString getIdBytes() {
                return ((SystemVoiceLiveCommentsMsg) this.instance).getIdBytes();
            }

            @Override // com.p1.mobile.longlink.msg.voicelivemessage.VoiceLiveBullet.SystemVoiceLiveCommentsMsgOrBuilder
            public String getLiveID() {
                return ((SystemVoiceLiveCommentsMsg) this.instance).getLiveID();
            }

            @Override // com.p1.mobile.longlink.msg.voicelivemessage.VoiceLiveBullet.SystemVoiceLiveCommentsMsgOrBuilder
            public ByteString getLiveIDBytes() {
                return ((SystemVoiceLiveCommentsMsg) this.instance).getLiveIDBytes();
            }

            @Override // com.p1.mobile.longlink.msg.voicelivemessage.VoiceLiveBullet.SystemVoiceLiveCommentsMsgOrBuilder
            public long getPriority() {
                return ((SystemVoiceLiveCommentsMsg) this.instance).getPriority();
            }

            @Override // com.p1.mobile.longlink.msg.voicelivemessage.VoiceLiveBullet.SystemVoiceLiveCommentsMsgOrBuilder
            public String getRoomID() {
                return ((SystemVoiceLiveCommentsMsg) this.instance).getRoomID();
            }

            @Override // com.p1.mobile.longlink.msg.voicelivemessage.VoiceLiveBullet.SystemVoiceLiveCommentsMsgOrBuilder
            public ByteString getRoomIDBytes() {
                return ((SystemVoiceLiveCommentsMsg) this.instance).getRoomIDBytes();
            }

            @Override // com.p1.mobile.longlink.msg.voicelivemessage.VoiceLiveBullet.SystemVoiceLiveCommentsMsgOrBuilder
            public String getStartColor() {
                return ((SystemVoiceLiveCommentsMsg) this.instance).getStartColor();
            }

            @Override // com.p1.mobile.longlink.msg.voicelivemessage.VoiceLiveBullet.SystemVoiceLiveCommentsMsgOrBuilder
            public ByteString getStartColorBytes() {
                return ((SystemVoiceLiveCommentsMsg) this.instance).getStartColorBytes();
            }

            @Override // com.p1.mobile.longlink.msg.voicelivemessage.VoiceLiveBullet.SystemVoiceLiveCommentsMsgOrBuilder
            public TemplateData getTemplateData() {
                return ((SystemVoiceLiveCommentsMsg) this.instance).getTemplateData();
            }

            @Override // com.p1.mobile.longlink.msg.voicelivemessage.VoiceLiveBullet.SystemVoiceLiveCommentsMsgOrBuilder
            public String getType() {
                return ((SystemVoiceLiveCommentsMsg) this.instance).getType();
            }

            @Override // com.p1.mobile.longlink.msg.voicelivemessage.VoiceLiveBullet.SystemVoiceLiveCommentsMsgOrBuilder
            public ByteString getTypeBytes() {
                return ((SystemVoiceLiveCommentsMsg) this.instance).getTypeBytes();
            }

            @Override // com.p1.mobile.longlink.msg.voicelivemessage.VoiceLiveBullet.SystemVoiceLiveCommentsMsgOrBuilder
            public boolean hasBackground() {
                return ((SystemVoiceLiveCommentsMsg) this.instance).hasBackground();
            }

            @Override // com.p1.mobile.longlink.msg.voicelivemessage.VoiceLiveBullet.SystemVoiceLiveCommentsMsgOrBuilder
            public boolean hasTemplateData() {
                return ((SystemVoiceLiveCommentsMsg) this.instance).hasTemplateData();
            }

            public Builder mergeBackground(SystemVoiceLiveCommentBackground systemVoiceLiveCommentBackground) {
                copyOnWrite();
                ((SystemVoiceLiveCommentsMsg) this.instance).mergeBackground(systemVoiceLiveCommentBackground);
                return this;
            }

            public Builder mergeTemplateData(TemplateData templateData) {
                copyOnWrite();
                ((SystemVoiceLiveCommentsMsg) this.instance).mergeTemplateData(templateData);
                return this;
            }

            public Builder setAlignment(Alignment alignment) {
                copyOnWrite();
                ((SystemVoiceLiveCommentsMsg) this.instance).setAlignment(alignment);
                return this;
            }

            public Builder setAlignmentValue(int i) {
                copyOnWrite();
                ((SystemVoiceLiveCommentsMsg) this.instance).setAlignmentValue(i);
                return this;
            }

            public Builder setBackground(SystemVoiceLiveCommentBackground systemVoiceLiveCommentBackground) {
                copyOnWrite();
                ((SystemVoiceLiveCommentsMsg) this.instance).setBackground(systemVoiceLiveCommentBackground);
                return this;
            }

            public Builder setDisplayDuration(long j) {
                copyOnWrite();
                ((SystemVoiceLiveCommentsMsg) this.instance).setDisplayDuration(j);
                return this;
            }

            public Builder setEndColor(String str) {
                copyOnWrite();
                ((SystemVoiceLiveCommentsMsg) this.instance).setEndColor(str);
                return this;
            }

            public Builder setEndColorBytes(ByteString byteString) {
                copyOnWrite();
                ((SystemVoiceLiveCommentsMsg) this.instance).setEndColorBytes(byteString);
                return this;
            }

            public Builder setGotoSchema(String str) {
                copyOnWrite();
                ((SystemVoiceLiveCommentsMsg) this.instance).setGotoSchema(str);
                return this;
            }

            public Builder setGotoSchemaBytes(ByteString byteString) {
                copyOnWrite();
                ((SystemVoiceLiveCommentsMsg) this.instance).setGotoSchemaBytes(byteString);
                return this;
            }

            public Builder setIconUrl(String str) {
                copyOnWrite();
                ((SystemVoiceLiveCommentsMsg) this.instance).setIconUrl(str);
                return this;
            }

            public Builder setIconUrlBytes(ByteString byteString) {
                copyOnWrite();
                ((SystemVoiceLiveCommentsMsg) this.instance).setIconUrlBytes(byteString);
                return this;
            }

            public Builder setId(String str) {
                copyOnWrite();
                ((SystemVoiceLiveCommentsMsg) this.instance).setId(str);
                return this;
            }

            public Builder setIdBytes(ByteString byteString) {
                copyOnWrite();
                ((SystemVoiceLiveCommentsMsg) this.instance).setIdBytes(byteString);
                return this;
            }

            public Builder setLiveID(String str) {
                copyOnWrite();
                ((SystemVoiceLiveCommentsMsg) this.instance).setLiveID(str);
                return this;
            }

            public Builder setLiveIDBytes(ByteString byteString) {
                copyOnWrite();
                ((SystemVoiceLiveCommentsMsg) this.instance).setLiveIDBytes(byteString);
                return this;
            }

            public Builder setPriority(long j) {
                copyOnWrite();
                ((SystemVoiceLiveCommentsMsg) this.instance).setPriority(j);
                return this;
            }

            public Builder setRoomID(String str) {
                copyOnWrite();
                ((SystemVoiceLiveCommentsMsg) this.instance).setRoomID(str);
                return this;
            }

            public Builder setRoomIDBytes(ByteString byteString) {
                copyOnWrite();
                ((SystemVoiceLiveCommentsMsg) this.instance).setRoomIDBytes(byteString);
                return this;
            }

            public Builder setStartColor(String str) {
                copyOnWrite();
                ((SystemVoiceLiveCommentsMsg) this.instance).setStartColor(str);
                return this;
            }

            public Builder setStartColorBytes(ByteString byteString) {
                copyOnWrite();
                ((SystemVoiceLiveCommentsMsg) this.instance).setStartColorBytes(byteString);
                return this;
            }

            public Builder setTemplateData(TemplateData templateData) {
                copyOnWrite();
                ((SystemVoiceLiveCommentsMsg) this.instance).setTemplateData(templateData);
                return this;
            }

            public Builder setType(String str) {
                copyOnWrite();
                ((SystemVoiceLiveCommentsMsg) this.instance).setType(str);
                return this;
            }

            public Builder setTypeBytes(ByteString byteString) {
                copyOnWrite();
                ((SystemVoiceLiveCommentsMsg) this.instance).setTypeBytes(byteString);
                return this;
            }

            public Builder setBackground(SystemVoiceLiveCommentBackground.Builder builder) {
                copyOnWrite();
                ((SystemVoiceLiveCommentsMsg) this.instance).setBackground(builder);
                return this;
            }

            public Builder setTemplateData(TemplateData.Builder builder) {
                copyOnWrite();
                ((SystemVoiceLiveCommentsMsg) this.instance).setTemplateData(builder);
                return this;
            }
        }

        public static SystemVoiceLiveCommentsMsg parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (SystemVoiceLiveCommentsMsg) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static SystemVoiceLiveCommentsMsg parseFrom(byte[] bArr, C3410h c3410h) throws InvalidProtocolBufferException {
            return (SystemVoiceLiveCommentsMsg) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, c3410h);
        }

        public static SystemVoiceLiveCommentsMsg parseFrom(InputStream inputStream) throws IOException {
            return (SystemVoiceLiveCommentsMsg) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static SystemVoiceLiveCommentsMsg parseFrom(InputStream inputStream, C3410h c3410h) throws IOException {
            return (SystemVoiceLiveCommentsMsg) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, c3410h);
        }

        public static SystemVoiceLiveCommentsMsg parseFrom(C3407e c3407e) throws IOException {
            return (SystemVoiceLiveCommentsMsg) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, c3407e);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static SystemVoiceLiveCommentsMsg parseFrom(C3407e c3407e, C3410h c3410h) throws IOException {
            return (SystemVoiceLiveCommentsMsg) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, c3407e, c3410h);
        }
    }

    public static final class TemplateData extends GeneratedMessageLite<TemplateData, Builder> implements TemplateDataOrBuilder {
        private static final TemplateData DEFAULT_INSTANCE;
        public static final int FIELDS_FIELD_NUMBER = 2;
        public static final int ID_FIELD_NUMBER = 1;
        private static volatile i860<TemplateData> PARSER;
        private int bitField0_;
        private C3414l.h<String> fields_ = GeneratedMessageLite.emptyProtobufList();
        private int id_;

        public static final class Builder extends GeneratedMessageLite.AbstractC3380b<TemplateData, Builder> implements TemplateDataOrBuilder {
            private Builder() {
                super(TemplateData.DEFAULT_INSTANCE);
            }

            public Builder addAllFields(Iterable<String> iterable) {
                copyOnWrite();
                ((TemplateData) this.instance).addAllFields(iterable);
                return this;
            }

            public Builder addFields(String str) {
                copyOnWrite();
                ((TemplateData) this.instance).addFields(str);
                return this;
            }

            public Builder addFieldsBytes(ByteString byteString) {
                copyOnWrite();
                ((TemplateData) this.instance).addFieldsBytes(byteString);
                return this;
            }

            public Builder clearFields() {
                copyOnWrite();
                ((TemplateData) this.instance).clearFields();
                return this;
            }

            public Builder clearId() {
                copyOnWrite();
                ((TemplateData) this.instance).clearId();
                return this;
            }

            @Override // com.p1.mobile.longlink.msg.voicelivemessage.VoiceLiveBullet.TemplateDataOrBuilder
            public String getFields(int i) {
                return ((TemplateData) this.instance).getFields(i);
            }

            @Override // com.p1.mobile.longlink.msg.voicelivemessage.VoiceLiveBullet.TemplateDataOrBuilder
            public ByteString getFieldsBytes(int i) {
                return ((TemplateData) this.instance).getFieldsBytes(i);
            }

            @Override // com.p1.mobile.longlink.msg.voicelivemessage.VoiceLiveBullet.TemplateDataOrBuilder
            public int getFieldsCount() {
                return ((TemplateData) this.instance).getFieldsCount();
            }

            @Override // com.p1.mobile.longlink.msg.voicelivemessage.VoiceLiveBullet.TemplateDataOrBuilder
            public List<String> getFieldsList() {
                return Collections.unmodifiableList(((TemplateData) this.instance).getFieldsList());
            }

            @Override // com.p1.mobile.longlink.msg.voicelivemessage.VoiceLiveBullet.TemplateDataOrBuilder
            public int getId() {
                return ((TemplateData) this.instance).getId();
            }

            public Builder setFields(int i, String str) {
                copyOnWrite();
                ((TemplateData) this.instance).setFields(i, str);
                return this;
            }

            public Builder setId(int i) {
                copyOnWrite();
                ((TemplateData) this.instance).setId(i);
                return this;
            }
        }

        static {
            TemplateData templateData = new TemplateData();
            DEFAULT_INSTANCE = templateData;
            templateData.makeImmutable();
        }

        private TemplateData() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllFields(Iterable<String> iterable) {
            ensureFieldsIsMutable();
            AbstractC3403a.addAll(iterable, this.fields_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addFields(String str) {
            str.getClass();
            ensureFieldsIsMutable();
            this.fields_.add(str);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addFieldsBytes(ByteString byteString) {
            byteString.getClass();
            AbstractC3403a.checkByteStringIsUtf8(byteString);
            ensureFieldsIsMutable();
            this.fields_.add(byteString.toStringUtf8());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearFields() {
            this.fields_ = GeneratedMessageLite.emptyProtobufList();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearId() {
            this.id_ = 0;
        }

        private void ensureFieldsIsMutable() {
            if (this.fields_.mo17085q()) {
                return;
            }
            this.fields_ = GeneratedMessageLite.mutableCopy(this.fields_);
        }

        public static TemplateData getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder(TemplateData templateData) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(templateData);
        }

        public static TemplateData parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (TemplateData) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static TemplateData parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (TemplateData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static i860<TemplateData> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setFields(int i, String str) {
            str.getClass();
            ensureFieldsIsMutable();
            this.fields_.set(i, str);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setId(int i) {
            this.id_ = i;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            boolean z = false;
            switch (C45611.f16004xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new TemplateData();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                    this.fields_.mo17084n();
                    return null;
                case 4:
                    return new Builder();
                case 5:
                    GeneratedMessageLite.InterfaceC3386h interfaceC3386h = (GeneratedMessageLite.InterfaceC3386h) obj;
                    TemplateData templateData = (TemplateData) obj2;
                    int i = this.id_;
                    boolean z2 = i != 0;
                    int i2 = templateData.id_;
                    this.id_ = interfaceC3386h.mo16996e(z2, i, i2 != 0, i2);
                    this.fields_ = interfaceC3386h.mo16998g(this.fields_, templateData.fields_);
                    if (interfaceC3386h == GeneratedMessageLite.C3385g.INSTANCE) {
                        this.bitField0_ |= templateData.bitField0_;
                    }
                    return this;
                case 6:
                    C3407e c3407e = (C3407e) obj;
                    while (!z) {
                        try {
                            int iM17116M = c3407e.m17116M();
                            if (iM17116M != 0) {
                                if (iM17116M == 8) {
                                    this.id_ = c3407e.m17117N();
                                } else if (iM17116M == 18) {
                                    String strM17115L = c3407e.m17115L();
                                    if (!this.fields_.mo17085q()) {
                                        this.fields_ = GeneratedMessageLite.mutableCopy(this.fields_);
                                    }
                                    this.fields_.add(strM17115L);
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
                        synchronized (TemplateData.class) {
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

        @Override // com.p1.mobile.longlink.msg.voicelivemessage.VoiceLiveBullet.TemplateDataOrBuilder
        public String getFields(int i) {
            return this.fields_.get(i);
        }

        @Override // com.p1.mobile.longlink.msg.voicelivemessage.VoiceLiveBullet.TemplateDataOrBuilder
        public ByteString getFieldsBytes(int i) {
            return ByteString.copyFromUtf8(this.fields_.get(i));
        }

        @Override // com.p1.mobile.longlink.msg.voicelivemessage.VoiceLiveBullet.TemplateDataOrBuilder
        public int getFieldsCount() {
            return this.fields_.size();
        }

        @Override // com.p1.mobile.longlink.msg.voicelivemessage.VoiceLiveBullet.TemplateDataOrBuilder
        public List<String> getFieldsList() {
            return this.fields_;
        }

        @Override // com.p1.mobile.longlink.msg.voicelivemessage.VoiceLiveBullet.TemplateDataOrBuilder
        public int getId() {
            return this.id_;
        }

        @Override // com.google.protobuf.InterfaceC3419q
        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int i2 = this.id_;
            int iM16904N = i2 != 0 ? CodedOutputStream.m16904N(1, i2) : 0;
            int iM16902L = 0;
            for (int i3 = 0; i3 < this.fields_.size(); i3++) {
                iM16902L += CodedOutputStream.m16902L(this.fields_.get(i3));
            }
            int size = iM16904N + iM16902L + getFieldsList().size();
            this.memoizedSerializedSize = size;
            return size;
        }

        @Override // com.google.protobuf.InterfaceC3419q
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            int i = this.id_;
            if (i != 0) {
                codedOutputStream.mo16942G0(1, i);
            }
            for (int i2 = 0; i2 < this.fields_.size(); i2++) {
                codedOutputStream.mo16939D0(2, this.fields_.get(i2));
            }
        }

        public static TemplateData parseDelimitedFrom(InputStream inputStream, C3410h c3410h) throws IOException {
            return (TemplateData) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, c3410h);
        }

        public static TemplateData parseFrom(ByteString byteString, C3410h c3410h) throws InvalidProtocolBufferException {
            return (TemplateData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, c3410h);
        }

        public static TemplateData parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (TemplateData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static TemplateData parseFrom(byte[] bArr, C3410h c3410h) throws InvalidProtocolBufferException {
            return (TemplateData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, c3410h);
        }

        public static TemplateData parseFrom(InputStream inputStream) throws IOException {
            return (TemplateData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static TemplateData parseFrom(InputStream inputStream, C3410h c3410h) throws IOException {
            return (TemplateData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, c3410h);
        }

        public static TemplateData parseFrom(C3407e c3407e) throws IOException {
            return (TemplateData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, c3407e);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static TemplateData parseFrom(C3407e c3407e, C3410h c3410h) throws IOException {
            return (TemplateData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, c3407e, c3410h);
        }
    }
}
