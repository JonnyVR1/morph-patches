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
import java.io.IOException;
import java.io.InputStream;
import java.util.Collections;
import java.util.List;
import l.aag0;
import l.bz00;
import l.i860;
import l.o6z;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes8.dex */
public final class VoiceLiveBullet {

    /* JADX INFO: renamed from: com.p1.mobile.longlink.msg.voicelivemessage.VoiceLiveBullet$1 */
    public static /* synthetic */ class C04731 {

        /* JADX INFO: renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f1703xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f1703xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f1703xa1df5c61[GeneratedMessageLite.MethodToInvoke.IS_INITIALIZED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f1703xa1df5c61[GeneratedMessageLite.MethodToInvoke.MAKE_IMMUTABLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f1703xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f1703xa1df5c61[GeneratedMessageLite.MethodToInvoke.VISIT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f1703xa1df5c61[GeneratedMessageLite.MethodToInvoke.MERGE_FROM_STREAM.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f1703xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f1703xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    public interface SystemVoiceLiveCommentBackgroundOrBuilder extends o6z {
        String getBottomImgUrl();

        ByteString getBottomImgUrlBytes();

        String getCoverImgUrl();

        ByteString getCoverImgUrlBytes();

        /* synthetic */ q getDefaultInstanceForType();

        String getHeaderImgUrl();

        ByteString getHeaderImgUrlBytes();

        String getMiddleImgUrl();

        ByteString getMiddleImgUrlBytes();

        /* synthetic */ boolean isInitialized();
    }

    public interface SystemVoiceLiveCommentsMsgOrBuilder extends o6z {
        Alignment getAlignment();

        int getAlignmentValue();

        SystemVoiceLiveCommentBackground getBackground();

        /* synthetic */ q getDefaultInstanceForType();

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

        /* synthetic */ boolean isInitialized();
    }

    public interface TemplateDataOrBuilder extends o6z {
        /* synthetic */ q getDefaultInstanceForType();

        String getFields(int i);

        ByteString getFieldsBytes(int i);

        int getFieldsCount();

        List<String> getFieldsList();

        int getId();

        /* synthetic */ boolean isInitialized();
    }

    private VoiceLiveBullet() {
    }

    public static void registerAllExtensions(h hVar) {
    }

    public enum Alignment implements l.c {
        Center(0),
        Left(1),
        UNRECOGNIZED(-1);

        public static final int Center_VALUE = 0;
        public static final int Left_VALUE = 1;
        private static final l.d<Alignment> internalValueMap = new l.d<Alignment>() { // from class: com.p1.mobile.longlink.msg.voicelivemessage.VoiceLiveBullet.Alignment.1
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

        public static l.d<Alignment> internalGetValueMap() {
            return internalValueMap;
        }

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

        public static final class Builder extends GeneratedMessageLite.b<SystemVoiceLiveCommentBackground, Builder> implements SystemVoiceLiveCommentBackgroundOrBuilder {
            private Builder() {
                super(SystemVoiceLiveCommentBackground.DEFAULT_INSTANCE);
            }

            public Builder clearBottomImgUrl() {
                copyOnWrite();
                ((SystemVoiceLiveCommentBackground) ((GeneratedMessageLite.b) this).instance).clearBottomImgUrl();
                return this;
            }

            public Builder clearCoverImgUrl() {
                copyOnWrite();
                ((SystemVoiceLiveCommentBackground) ((GeneratedMessageLite.b) this).instance).clearCoverImgUrl();
                return this;
            }

            public Builder clearHeaderImgUrl() {
                copyOnWrite();
                ((SystemVoiceLiveCommentBackground) ((GeneratedMessageLite.b) this).instance).clearHeaderImgUrl();
                return this;
            }

            public Builder clearMiddleImgUrl() {
                copyOnWrite();
                ((SystemVoiceLiveCommentBackground) ((GeneratedMessageLite.b) this).instance).clearMiddleImgUrl();
                return this;
            }

            @Override // com.p1.mobile.longlink.msg.voicelivemessage.VoiceLiveBullet.SystemVoiceLiveCommentBackgroundOrBuilder
            public String getBottomImgUrl() {
                return ((SystemVoiceLiveCommentBackground) ((GeneratedMessageLite.b) this).instance).getBottomImgUrl();
            }

            @Override // com.p1.mobile.longlink.msg.voicelivemessage.VoiceLiveBullet.SystemVoiceLiveCommentBackgroundOrBuilder
            public ByteString getBottomImgUrlBytes() {
                return ((SystemVoiceLiveCommentBackground) ((GeneratedMessageLite.b) this).instance).getBottomImgUrlBytes();
            }

            @Override // com.p1.mobile.longlink.msg.voicelivemessage.VoiceLiveBullet.SystemVoiceLiveCommentBackgroundOrBuilder
            public String getCoverImgUrl() {
                return ((SystemVoiceLiveCommentBackground) ((GeneratedMessageLite.b) this).instance).getCoverImgUrl();
            }

            @Override // com.p1.mobile.longlink.msg.voicelivemessage.VoiceLiveBullet.SystemVoiceLiveCommentBackgroundOrBuilder
            public ByteString getCoverImgUrlBytes() {
                return ((SystemVoiceLiveCommentBackground) ((GeneratedMessageLite.b) this).instance).getCoverImgUrlBytes();
            }

            @Override // com.p1.mobile.longlink.msg.voicelivemessage.VoiceLiveBullet.SystemVoiceLiveCommentBackgroundOrBuilder
            public String getHeaderImgUrl() {
                return ((SystemVoiceLiveCommentBackground) ((GeneratedMessageLite.b) this).instance).getHeaderImgUrl();
            }

            @Override // com.p1.mobile.longlink.msg.voicelivemessage.VoiceLiveBullet.SystemVoiceLiveCommentBackgroundOrBuilder
            public ByteString getHeaderImgUrlBytes() {
                return ((SystemVoiceLiveCommentBackground) ((GeneratedMessageLite.b) this).instance).getHeaderImgUrlBytes();
            }

            @Override // com.p1.mobile.longlink.msg.voicelivemessage.VoiceLiveBullet.SystemVoiceLiveCommentBackgroundOrBuilder
            public String getMiddleImgUrl() {
                return ((SystemVoiceLiveCommentBackground) ((GeneratedMessageLite.b) this).instance).getMiddleImgUrl();
            }

            @Override // com.p1.mobile.longlink.msg.voicelivemessage.VoiceLiveBullet.SystemVoiceLiveCommentBackgroundOrBuilder
            public ByteString getMiddleImgUrlBytes() {
                return ((SystemVoiceLiveCommentBackground) ((GeneratedMessageLite.b) this).instance).getMiddleImgUrlBytes();
            }

            public Builder setBottomImgUrl(String str) {
                copyOnWrite();
                ((SystemVoiceLiveCommentBackground) ((GeneratedMessageLite.b) this).instance).setBottomImgUrl(str);
                return this;
            }

            public Builder setBottomImgUrlBytes(ByteString byteString) {
                copyOnWrite();
                ((SystemVoiceLiveCommentBackground) ((GeneratedMessageLite.b) this).instance).setBottomImgUrlBytes(byteString);
                return this;
            }

            public Builder setCoverImgUrl(String str) {
                copyOnWrite();
                ((SystemVoiceLiveCommentBackground) ((GeneratedMessageLite.b) this).instance).setCoverImgUrl(str);
                return this;
            }

            public Builder setCoverImgUrlBytes(ByteString byteString) {
                copyOnWrite();
                ((SystemVoiceLiveCommentBackground) ((GeneratedMessageLite.b) this).instance).setCoverImgUrlBytes(byteString);
                return this;
            }

            public Builder setHeaderImgUrl(String str) {
                copyOnWrite();
                ((SystemVoiceLiveCommentBackground) ((GeneratedMessageLite.b) this).instance).setHeaderImgUrl(str);
                return this;
            }

            public Builder setHeaderImgUrlBytes(ByteString byteString) {
                copyOnWrite();
                ((SystemVoiceLiveCommentBackground) ((GeneratedMessageLite.b) this).instance).setHeaderImgUrlBytes(byteString);
                return this;
            }

            public Builder setMiddleImgUrl(String str) {
                copyOnWrite();
                ((SystemVoiceLiveCommentBackground) ((GeneratedMessageLite.b) this).instance).setMiddleImgUrl(str);
                return this;
            }

            public Builder setMiddleImgUrlBytes(ByteString byteString) {
                copyOnWrite();
                ((SystemVoiceLiveCommentBackground) ((GeneratedMessageLite.b) this).instance).setMiddleImgUrlBytes(byteString);
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
            return (Builder) ((Builder) DEFAULT_INSTANCE.toBuilder()).mergeFrom(systemVoiceLiveCommentBackground);
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
            a.checkByteStringIsUtf8(byteString);
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
            a.checkByteStringIsUtf8(byteString);
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
            a.checkByteStringIsUtf8(byteString);
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
            a.checkByteStringIsUtf8(byteString);
            this.middleImgUrl_ = byteString.toStringUtf8();
        }

        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (C04731.f1703xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new SystemVoiceLiveCommentBackground();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                    return null;
                case 4:
                    return new Builder();
                case 5:
                    GeneratedMessageLite.h hVar = (GeneratedMessageLite.h) obj;
                    SystemVoiceLiveCommentBackground systemVoiceLiveCommentBackground = (SystemVoiceLiveCommentBackground) obj2;
                    this.headerImgUrl_ = hVar.f(!this.headerImgUrl_.isEmpty(), this.headerImgUrl_, !systemVoiceLiveCommentBackground.headerImgUrl_.isEmpty(), systemVoiceLiveCommentBackground.headerImgUrl_);
                    this.middleImgUrl_ = hVar.f(!this.middleImgUrl_.isEmpty(), this.middleImgUrl_, !systemVoiceLiveCommentBackground.middleImgUrl_.isEmpty(), systemVoiceLiveCommentBackground.middleImgUrl_);
                    this.bottomImgUrl_ = hVar.f(!this.bottomImgUrl_.isEmpty(), this.bottomImgUrl_, !systemVoiceLiveCommentBackground.bottomImgUrl_.isEmpty(), systemVoiceLiveCommentBackground.bottomImgUrl_);
                    this.coverImgUrl_ = hVar.f(!this.coverImgUrl_.isEmpty(), this.coverImgUrl_, true ^ systemVoiceLiveCommentBackground.coverImgUrl_.isEmpty(), systemVoiceLiveCommentBackground.coverImgUrl_);
                    GeneratedMessageLite.g gVar = GeneratedMessageLite.g.INSTANCE;
                    return this;
                case 6:
                    e eVar = (e) obj;
                    boolean z = false;
                    while (!z) {
                        try {
                            int iM = eVar.M();
                            if (iM != 0) {
                                if (iM == 10) {
                                    this.headerImgUrl_ = eVar.L();
                                } else if (iM == 18) {
                                    this.middleImgUrl_ = eVar.L();
                                } else if (iM == 26) {
                                    this.bottomImgUrl_ = eVar.L();
                                } else if (iM == 34) {
                                    this.coverImgUrl_ = eVar.L();
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
                        synchronized (SystemVoiceLiveCommentBackground.class) {
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

        public int getSerializedSize() {
            int i = ((GeneratedMessageLite) this).memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int iK = !this.headerImgUrl_.isEmpty() ? CodedOutputStream.K(1, getHeaderImgUrl()) : 0;
            if (!this.middleImgUrl_.isEmpty()) {
                iK += CodedOutputStream.K(2, getMiddleImgUrl());
            }
            if (!this.bottomImgUrl_.isEmpty()) {
                iK += CodedOutputStream.K(3, getBottomImgUrl());
            }
            if (!this.coverImgUrl_.isEmpty()) {
                iK += CodedOutputStream.K(4, getCoverImgUrl());
            }
            ((GeneratedMessageLite) this).memoizedSerializedSize = iK;
            return iK;
        }

        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (!this.headerImgUrl_.isEmpty()) {
                codedOutputStream.D0(1, getHeaderImgUrl());
            }
            if (!this.middleImgUrl_.isEmpty()) {
                codedOutputStream.D0(2, getMiddleImgUrl());
            }
            if (!this.bottomImgUrl_.isEmpty()) {
                codedOutputStream.D0(3, getBottomImgUrl());
            }
            if (this.coverImgUrl_.isEmpty()) {
                return;
            }
            codedOutputStream.D0(4, getCoverImgUrl());
        }

        public static SystemVoiceLiveCommentBackground parseDelimitedFrom(InputStream inputStream, h hVar) throws IOException {
            return (SystemVoiceLiveCommentBackground) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, hVar);
        }

        public static SystemVoiceLiveCommentBackground parseFrom(ByteString byteString, h hVar) throws InvalidProtocolBufferException {
            return (SystemVoiceLiveCommentBackground) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, hVar);
        }

        public static SystemVoiceLiveCommentBackground parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (SystemVoiceLiveCommentBackground) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static SystemVoiceLiveCommentBackground parseFrom(byte[] bArr, h hVar) throws InvalidProtocolBufferException {
            return (SystemVoiceLiveCommentBackground) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, hVar);
        }

        public static SystemVoiceLiveCommentBackground parseFrom(InputStream inputStream) throws IOException {
            return (SystemVoiceLiveCommentBackground) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static SystemVoiceLiveCommentBackground parseFrom(InputStream inputStream, h hVar) throws IOException {
            return (SystemVoiceLiveCommentBackground) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, hVar);
        }

        public static SystemVoiceLiveCommentBackground parseFrom(e eVar) throws IOException {
            return (SystemVoiceLiveCommentBackground) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, eVar);
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.toBuilder();
        }

        public static SystemVoiceLiveCommentBackground parseFrom(e eVar, h hVar) throws IOException {
            return (SystemVoiceLiveCommentBackground) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, eVar, hVar);
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
                this.background_ = (SystemVoiceLiveCommentBackground) ((SystemVoiceLiveCommentBackground.Builder) SystemVoiceLiveCommentBackground.newBuilder(this.background_).mergeFrom(systemVoiceLiveCommentBackground)).buildPartial();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeTemplateData(TemplateData templateData) {
            TemplateData templateData2 = this.templateData_;
            if (templateData2 == null || templateData2 == TemplateData.getDefaultInstance()) {
                this.templateData_ = templateData;
            } else {
                this.templateData_ = (TemplateData) ((TemplateData.Builder) TemplateData.newBuilder(this.templateData_).mergeFrom(templateData)).buildPartial();
            }
        }

        public static Builder newBuilder(SystemVoiceLiveCommentsMsg systemVoiceLiveCommentsMsg) {
            return (Builder) ((Builder) DEFAULT_INSTANCE.toBuilder()).mergeFrom(systemVoiceLiveCommentsMsg);
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
            this.background_ = (SystemVoiceLiveCommentBackground) builder.build();
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
            a.checkByteStringIsUtf8(byteString);
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
            a.checkByteStringIsUtf8(byteString);
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
            a.checkByteStringIsUtf8(byteString);
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
            a.checkByteStringIsUtf8(byteString);
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
            a.checkByteStringIsUtf8(byteString);
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
            a.checkByteStringIsUtf8(byteString);
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
            a.checkByteStringIsUtf8(byteString);
            this.startColor_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTemplateData(TemplateData.Builder builder) {
            this.templateData_ = (TemplateData) builder.build();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setType(String str) {
            str.getClass();
            this.type_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTypeBytes(ByteString byteString) {
            byteString.getClass();
            a.checkByteStringIsUtf8(byteString);
            this.type_ = byteString.toStringUtf8();
        }

        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            boolean z = false;
            switch (C04731.f1703xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new SystemVoiceLiveCommentsMsg();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                    return null;
                case 4:
                    return new Builder();
                case 5:
                    GeneratedMessageLite.h hVar = (GeneratedMessageLite.h) obj;
                    SystemVoiceLiveCommentsMsg systemVoiceLiveCommentsMsg = (SystemVoiceLiveCommentsMsg) obj2;
                    this.roomID_ = hVar.f(!this.roomID_.isEmpty(), this.roomID_, !systemVoiceLiveCommentsMsg.roomID_.isEmpty(), systemVoiceLiveCommentsMsg.roomID_);
                    this.liveID_ = hVar.f(!this.liveID_.isEmpty(), this.liveID_, !systemVoiceLiveCommentsMsg.liveID_.isEmpty(), systemVoiceLiveCommentsMsg.liveID_);
                    this.iconUrl_ = hVar.f(!this.iconUrl_.isEmpty(), this.iconUrl_, !systemVoiceLiveCommentsMsg.iconUrl_.isEmpty(), systemVoiceLiveCommentsMsg.iconUrl_);
                    this.startColor_ = hVar.f(!this.startColor_.isEmpty(), this.startColor_, !systemVoiceLiveCommentsMsg.startColor_.isEmpty(), systemVoiceLiveCommentsMsg.startColor_);
                    this.endColor_ = hVar.f(!this.endColor_.isEmpty(), this.endColor_, !systemVoiceLiveCommentsMsg.endColor_.isEmpty(), systemVoiceLiveCommentsMsg.endColor_);
                    long j = this.displayDuration_;
                    boolean z2 = j != 0;
                    long j2 = systemVoiceLiveCommentsMsg.displayDuration_;
                    this.displayDuration_ = hVar.i(z2, j, j2 != 0, j2);
                    this.gotoSchema_ = hVar.f(!this.gotoSchema_.isEmpty(), this.gotoSchema_, !systemVoiceLiveCommentsMsg.gotoSchema_.isEmpty(), systemVoiceLiveCommentsMsg.gotoSchema_);
                    this.templateData_ = hVar.o(this.templateData_, systemVoiceLiveCommentsMsg.templateData_);
                    this.id_ = hVar.f(!this.id_.isEmpty(), this.id_, !systemVoiceLiveCommentsMsg.id_.isEmpty(), systemVoiceLiveCommentsMsg.id_);
                    this.type_ = hVar.f(!this.type_.isEmpty(), this.type_, !systemVoiceLiveCommentsMsg.type_.isEmpty(), systemVoiceLiveCommentsMsg.type_);
                    this.background_ = hVar.o(this.background_, systemVoiceLiveCommentsMsg.background_);
                    long j3 = this.priority_;
                    boolean z3 = j3 != 0;
                    long j4 = systemVoiceLiveCommentsMsg.priority_;
                    this.priority_ = hVar.i(z3, j3, j4 != 0, j4);
                    int i = this.alignment_;
                    boolean z4 = i != 0;
                    int i2 = systemVoiceLiveCommentsMsg.alignment_;
                    this.alignment_ = hVar.e(z4, i, i2 != 0, i2);
                    GeneratedMessageLite.g gVar = GeneratedMessageLite.g.INSTANCE;
                    return this;
                case 6:
                    e eVar = (e) obj;
                    h hVar2 = (h) obj2;
                    while (!z) {
                        try {
                            int iM = eVar.M();
                            switch (iM) {
                                case 0:
                                    break;
                                case 10:
                                    this.roomID_ = eVar.L();
                                    continue;
                                case 18:
                                    this.liveID_ = eVar.L();
                                    continue;
                                case 26:
                                    this.iconUrl_ = eVar.L();
                                    continue;
                                case 34:
                                    this.startColor_ = eVar.L();
                                    continue;
                                case 42:
                                    this.endColor_ = eVar.L();
                                    continue;
                                case 48:
                                    this.displayDuration_ = eVar.v();
                                    continue;
                                case 58:
                                    this.gotoSchema_ = eVar.L();
                                    continue;
                                case 66:
                                    TemplateData templateData = this.templateData_;
                                    TemplateData.Builder builder = templateData != null ? (TemplateData.Builder) templateData.toBuilder() : null;
                                    TemplateData templateDataW = eVar.w(TemplateData.parser(), hVar2);
                                    this.templateData_ = templateDataW;
                                    if (builder != null) {
                                        builder.mergeFrom(templateDataW);
                                        this.templateData_ = (TemplateData) builder.buildPartial();
                                    } else {
                                        continue;
                                    }
                                    break;
                                case 74:
                                    this.id_ = eVar.L();
                                    continue;
                                case 82:
                                    this.type_ = eVar.L();
                                    continue;
                                case 90:
                                    SystemVoiceLiveCommentBackground systemVoiceLiveCommentBackground = this.background_;
                                    SystemVoiceLiveCommentBackground.Builder builder2 = systemVoiceLiveCommentBackground != null ? (SystemVoiceLiveCommentBackground.Builder) systemVoiceLiveCommentBackground.toBuilder() : null;
                                    SystemVoiceLiveCommentBackground systemVoiceLiveCommentBackgroundW = eVar.w(SystemVoiceLiveCommentBackground.parser(), hVar2);
                                    this.background_ = systemVoiceLiveCommentBackgroundW;
                                    if (builder2 != null) {
                                        builder2.mergeFrom(systemVoiceLiveCommentBackgroundW);
                                        this.background_ = (SystemVoiceLiveCommentBackground) builder2.buildPartial();
                                    } else {
                                        continue;
                                    }
                                    break;
                                case 96:
                                    this.priority_ = eVar.v();
                                    continue;
                                case 104:
                                    this.alignment_ = eVar.p();
                                    continue;
                                default:
                                    if (!eVar.R(iM)) {
                                        break;
                                    }
                                    break;
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
                        synchronized (SystemVoiceLiveCommentsMsg.class) {
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

        public int getSerializedSize() {
            int i = ((GeneratedMessageLite) this).memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int iK = !this.roomID_.isEmpty() ? CodedOutputStream.K(1, getRoomID()) : 0;
            if (!this.liveID_.isEmpty()) {
                iK += CodedOutputStream.K(2, getLiveID());
            }
            if (!this.iconUrl_.isEmpty()) {
                iK += CodedOutputStream.K(3, getIconUrl());
            }
            if (!this.startColor_.isEmpty()) {
                iK += CodedOutputStream.K(4, getStartColor());
            }
            if (!this.endColor_.isEmpty()) {
                iK += CodedOutputStream.K(5, getEndColor());
            }
            long j = this.displayDuration_;
            if (j != 0) {
                iK += CodedOutputStream.v(6, j);
            }
            if (!this.gotoSchema_.isEmpty()) {
                iK += CodedOutputStream.K(7, getGotoSchema());
            }
            if (this.templateData_ != null) {
                iK += CodedOutputStream.C(8, getTemplateData());
            }
            if (!this.id_.isEmpty()) {
                iK += CodedOutputStream.K(9, getId());
            }
            if (!this.type_.isEmpty()) {
                iK += CodedOutputStream.K(10, getType());
            }
            if (this.background_ != null) {
                iK += CodedOutputStream.C(11, getBackground());
            }
            long j2 = this.priority_;
            if (j2 != 0) {
                iK += CodedOutputStream.v(12, j2);
            }
            if (this.alignment_ != Alignment.Center.getNumber()) {
                iK += CodedOutputStream.m(13, this.alignment_);
            }
            ((GeneratedMessageLite) this).memoizedSerializedSize = iK;
            return iK;
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

        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (!this.roomID_.isEmpty()) {
                codedOutputStream.D0(1, getRoomID());
            }
            if (!this.liveID_.isEmpty()) {
                codedOutputStream.D0(2, getLiveID());
            }
            if (!this.iconUrl_.isEmpty()) {
                codedOutputStream.D0(3, getIconUrl());
            }
            if (!this.startColor_.isEmpty()) {
                codedOutputStream.D0(4, getStartColor());
            }
            if (!this.endColor_.isEmpty()) {
                codedOutputStream.D0(5, getEndColor());
            }
            long j = this.displayDuration_;
            if (j != 0) {
                codedOutputStream.u0(6, j);
            }
            if (!this.gotoSchema_.isEmpty()) {
                codedOutputStream.D0(7, getGotoSchema());
            }
            if (this.templateData_ != null) {
                codedOutputStream.w0(8, getTemplateData());
            }
            if (!this.id_.isEmpty()) {
                codedOutputStream.D0(9, getId());
            }
            if (!this.type_.isEmpty()) {
                codedOutputStream.D0(10, getType());
            }
            if (this.background_ != null) {
                codedOutputStream.w0(11, getBackground());
            }
            long j2 = this.priority_;
            if (j2 != 0) {
                codedOutputStream.u0(12, j2);
            }
            if (this.alignment_ != Alignment.Center.getNumber()) {
                codedOutputStream.i0(13, this.alignment_);
            }
        }

        public static SystemVoiceLiveCommentsMsg parseDelimitedFrom(InputStream inputStream, h hVar) throws IOException {
            return (SystemVoiceLiveCommentsMsg) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, hVar);
        }

        public static SystemVoiceLiveCommentsMsg parseFrom(ByteString byteString, h hVar) throws InvalidProtocolBufferException {
            return (SystemVoiceLiveCommentsMsg) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, hVar);
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

        public static final class Builder extends GeneratedMessageLite.b<SystemVoiceLiveCommentsMsg, Builder> implements SystemVoiceLiveCommentsMsgOrBuilder {
            private Builder() {
                super(SystemVoiceLiveCommentsMsg.DEFAULT_INSTANCE);
            }

            public Builder clearAlignment() {
                copyOnWrite();
                ((SystemVoiceLiveCommentsMsg) ((GeneratedMessageLite.b) this).instance).clearAlignment();
                return this;
            }

            public Builder clearBackground() {
                copyOnWrite();
                ((SystemVoiceLiveCommentsMsg) ((GeneratedMessageLite.b) this).instance).clearBackground();
                return this;
            }

            public Builder clearDisplayDuration() {
                copyOnWrite();
                ((SystemVoiceLiveCommentsMsg) ((GeneratedMessageLite.b) this).instance).clearDisplayDuration();
                return this;
            }

            public Builder clearEndColor() {
                copyOnWrite();
                ((SystemVoiceLiveCommentsMsg) ((GeneratedMessageLite.b) this).instance).clearEndColor();
                return this;
            }

            public Builder clearGotoSchema() {
                copyOnWrite();
                ((SystemVoiceLiveCommentsMsg) ((GeneratedMessageLite.b) this).instance).clearGotoSchema();
                return this;
            }

            public Builder clearIconUrl() {
                copyOnWrite();
                ((SystemVoiceLiveCommentsMsg) ((GeneratedMessageLite.b) this).instance).clearIconUrl();
                return this;
            }

            public Builder clearId() {
                copyOnWrite();
                ((SystemVoiceLiveCommentsMsg) ((GeneratedMessageLite.b) this).instance).clearId();
                return this;
            }

            public Builder clearLiveID() {
                copyOnWrite();
                ((SystemVoiceLiveCommentsMsg) ((GeneratedMessageLite.b) this).instance).clearLiveID();
                return this;
            }

            public Builder clearPriority() {
                copyOnWrite();
                ((SystemVoiceLiveCommentsMsg) ((GeneratedMessageLite.b) this).instance).clearPriority();
                return this;
            }

            public Builder clearRoomID() {
                copyOnWrite();
                ((SystemVoiceLiveCommentsMsg) ((GeneratedMessageLite.b) this).instance).clearRoomID();
                return this;
            }

            public Builder clearStartColor() {
                copyOnWrite();
                ((SystemVoiceLiveCommentsMsg) ((GeneratedMessageLite.b) this).instance).clearStartColor();
                return this;
            }

            public Builder clearTemplateData() {
                copyOnWrite();
                ((SystemVoiceLiveCommentsMsg) ((GeneratedMessageLite.b) this).instance).clearTemplateData();
                return this;
            }

            public Builder clearType() {
                copyOnWrite();
                ((SystemVoiceLiveCommentsMsg) ((GeneratedMessageLite.b) this).instance).clearType();
                return this;
            }

            @Override // com.p1.mobile.longlink.msg.voicelivemessage.VoiceLiveBullet.SystemVoiceLiveCommentsMsgOrBuilder
            public Alignment getAlignment() {
                return ((SystemVoiceLiveCommentsMsg) ((GeneratedMessageLite.b) this).instance).getAlignment();
            }

            @Override // com.p1.mobile.longlink.msg.voicelivemessage.VoiceLiveBullet.SystemVoiceLiveCommentsMsgOrBuilder
            public int getAlignmentValue() {
                return ((SystemVoiceLiveCommentsMsg) ((GeneratedMessageLite.b) this).instance).getAlignmentValue();
            }

            @Override // com.p1.mobile.longlink.msg.voicelivemessage.VoiceLiveBullet.SystemVoiceLiveCommentsMsgOrBuilder
            public SystemVoiceLiveCommentBackground getBackground() {
                return ((SystemVoiceLiveCommentsMsg) ((GeneratedMessageLite.b) this).instance).getBackground();
            }

            @Override // com.p1.mobile.longlink.msg.voicelivemessage.VoiceLiveBullet.SystemVoiceLiveCommentsMsgOrBuilder
            public long getDisplayDuration() {
                return ((SystemVoiceLiveCommentsMsg) ((GeneratedMessageLite.b) this).instance).getDisplayDuration();
            }

            @Override // com.p1.mobile.longlink.msg.voicelivemessage.VoiceLiveBullet.SystemVoiceLiveCommentsMsgOrBuilder
            public String getEndColor() {
                return ((SystemVoiceLiveCommentsMsg) ((GeneratedMessageLite.b) this).instance).getEndColor();
            }

            @Override // com.p1.mobile.longlink.msg.voicelivemessage.VoiceLiveBullet.SystemVoiceLiveCommentsMsgOrBuilder
            public ByteString getEndColorBytes() {
                return ((SystemVoiceLiveCommentsMsg) ((GeneratedMessageLite.b) this).instance).getEndColorBytes();
            }

            @Override // com.p1.mobile.longlink.msg.voicelivemessage.VoiceLiveBullet.SystemVoiceLiveCommentsMsgOrBuilder
            public String getGotoSchema() {
                return ((SystemVoiceLiveCommentsMsg) ((GeneratedMessageLite.b) this).instance).getGotoSchema();
            }

            @Override // com.p1.mobile.longlink.msg.voicelivemessage.VoiceLiveBullet.SystemVoiceLiveCommentsMsgOrBuilder
            public ByteString getGotoSchemaBytes() {
                return ((SystemVoiceLiveCommentsMsg) ((GeneratedMessageLite.b) this).instance).getGotoSchemaBytes();
            }

            @Override // com.p1.mobile.longlink.msg.voicelivemessage.VoiceLiveBullet.SystemVoiceLiveCommentsMsgOrBuilder
            public String getIconUrl() {
                return ((SystemVoiceLiveCommentsMsg) ((GeneratedMessageLite.b) this).instance).getIconUrl();
            }

            @Override // com.p1.mobile.longlink.msg.voicelivemessage.VoiceLiveBullet.SystemVoiceLiveCommentsMsgOrBuilder
            public ByteString getIconUrlBytes() {
                return ((SystemVoiceLiveCommentsMsg) ((GeneratedMessageLite.b) this).instance).getIconUrlBytes();
            }

            @Override // com.p1.mobile.longlink.msg.voicelivemessage.VoiceLiveBullet.SystemVoiceLiveCommentsMsgOrBuilder
            public String getId() {
                return ((SystemVoiceLiveCommentsMsg) ((GeneratedMessageLite.b) this).instance).getId();
            }

            @Override // com.p1.mobile.longlink.msg.voicelivemessage.VoiceLiveBullet.SystemVoiceLiveCommentsMsgOrBuilder
            public ByteString getIdBytes() {
                return ((SystemVoiceLiveCommentsMsg) ((GeneratedMessageLite.b) this).instance).getIdBytes();
            }

            @Override // com.p1.mobile.longlink.msg.voicelivemessage.VoiceLiveBullet.SystemVoiceLiveCommentsMsgOrBuilder
            public String getLiveID() {
                return ((SystemVoiceLiveCommentsMsg) ((GeneratedMessageLite.b) this).instance).getLiveID();
            }

            @Override // com.p1.mobile.longlink.msg.voicelivemessage.VoiceLiveBullet.SystemVoiceLiveCommentsMsgOrBuilder
            public ByteString getLiveIDBytes() {
                return ((SystemVoiceLiveCommentsMsg) ((GeneratedMessageLite.b) this).instance).getLiveIDBytes();
            }

            @Override // com.p1.mobile.longlink.msg.voicelivemessage.VoiceLiveBullet.SystemVoiceLiveCommentsMsgOrBuilder
            public long getPriority() {
                return ((SystemVoiceLiveCommentsMsg) ((GeneratedMessageLite.b) this).instance).getPriority();
            }

            @Override // com.p1.mobile.longlink.msg.voicelivemessage.VoiceLiveBullet.SystemVoiceLiveCommentsMsgOrBuilder
            public String getRoomID() {
                return ((SystemVoiceLiveCommentsMsg) ((GeneratedMessageLite.b) this).instance).getRoomID();
            }

            @Override // com.p1.mobile.longlink.msg.voicelivemessage.VoiceLiveBullet.SystemVoiceLiveCommentsMsgOrBuilder
            public ByteString getRoomIDBytes() {
                return ((SystemVoiceLiveCommentsMsg) ((GeneratedMessageLite.b) this).instance).getRoomIDBytes();
            }

            @Override // com.p1.mobile.longlink.msg.voicelivemessage.VoiceLiveBullet.SystemVoiceLiveCommentsMsgOrBuilder
            public String getStartColor() {
                return ((SystemVoiceLiveCommentsMsg) ((GeneratedMessageLite.b) this).instance).getStartColor();
            }

            @Override // com.p1.mobile.longlink.msg.voicelivemessage.VoiceLiveBullet.SystemVoiceLiveCommentsMsgOrBuilder
            public ByteString getStartColorBytes() {
                return ((SystemVoiceLiveCommentsMsg) ((GeneratedMessageLite.b) this).instance).getStartColorBytes();
            }

            @Override // com.p1.mobile.longlink.msg.voicelivemessage.VoiceLiveBullet.SystemVoiceLiveCommentsMsgOrBuilder
            public TemplateData getTemplateData() {
                return ((SystemVoiceLiveCommentsMsg) ((GeneratedMessageLite.b) this).instance).getTemplateData();
            }

            @Override // com.p1.mobile.longlink.msg.voicelivemessage.VoiceLiveBullet.SystemVoiceLiveCommentsMsgOrBuilder
            public String getType() {
                return ((SystemVoiceLiveCommentsMsg) ((GeneratedMessageLite.b) this).instance).getType();
            }

            @Override // com.p1.mobile.longlink.msg.voicelivemessage.VoiceLiveBullet.SystemVoiceLiveCommentsMsgOrBuilder
            public ByteString getTypeBytes() {
                return ((SystemVoiceLiveCommentsMsg) ((GeneratedMessageLite.b) this).instance).getTypeBytes();
            }

            @Override // com.p1.mobile.longlink.msg.voicelivemessage.VoiceLiveBullet.SystemVoiceLiveCommentsMsgOrBuilder
            public boolean hasBackground() {
                return ((SystemVoiceLiveCommentsMsg) ((GeneratedMessageLite.b) this).instance).hasBackground();
            }

            @Override // com.p1.mobile.longlink.msg.voicelivemessage.VoiceLiveBullet.SystemVoiceLiveCommentsMsgOrBuilder
            public boolean hasTemplateData() {
                return ((SystemVoiceLiveCommentsMsg) ((GeneratedMessageLite.b) this).instance).hasTemplateData();
            }

            public Builder mergeBackground(SystemVoiceLiveCommentBackground systemVoiceLiveCommentBackground) {
                copyOnWrite();
                ((SystemVoiceLiveCommentsMsg) ((GeneratedMessageLite.b) this).instance).mergeBackground(systemVoiceLiveCommentBackground);
                return this;
            }

            public Builder mergeTemplateData(TemplateData templateData) {
                copyOnWrite();
                ((SystemVoiceLiveCommentsMsg) ((GeneratedMessageLite.b) this).instance).mergeTemplateData(templateData);
                return this;
            }

            public Builder setAlignment(Alignment alignment) {
                copyOnWrite();
                ((SystemVoiceLiveCommentsMsg) ((GeneratedMessageLite.b) this).instance).setAlignment(alignment);
                return this;
            }

            public Builder setAlignmentValue(int i) {
                copyOnWrite();
                ((SystemVoiceLiveCommentsMsg) ((GeneratedMessageLite.b) this).instance).setAlignmentValue(i);
                return this;
            }

            public Builder setBackground(SystemVoiceLiveCommentBackground systemVoiceLiveCommentBackground) {
                copyOnWrite();
                ((SystemVoiceLiveCommentsMsg) ((GeneratedMessageLite.b) this).instance).setBackground(systemVoiceLiveCommentBackground);
                return this;
            }

            public Builder setDisplayDuration(long j) {
                copyOnWrite();
                ((SystemVoiceLiveCommentsMsg) ((GeneratedMessageLite.b) this).instance).setDisplayDuration(j);
                return this;
            }

            public Builder setEndColor(String str) {
                copyOnWrite();
                ((SystemVoiceLiveCommentsMsg) ((GeneratedMessageLite.b) this).instance).setEndColor(str);
                return this;
            }

            public Builder setEndColorBytes(ByteString byteString) {
                copyOnWrite();
                ((SystemVoiceLiveCommentsMsg) ((GeneratedMessageLite.b) this).instance).setEndColorBytes(byteString);
                return this;
            }

            public Builder setGotoSchema(String str) {
                copyOnWrite();
                ((SystemVoiceLiveCommentsMsg) ((GeneratedMessageLite.b) this).instance).setGotoSchema(str);
                return this;
            }

            public Builder setGotoSchemaBytes(ByteString byteString) {
                copyOnWrite();
                ((SystemVoiceLiveCommentsMsg) ((GeneratedMessageLite.b) this).instance).setGotoSchemaBytes(byteString);
                return this;
            }

            public Builder setIconUrl(String str) {
                copyOnWrite();
                ((SystemVoiceLiveCommentsMsg) ((GeneratedMessageLite.b) this).instance).setIconUrl(str);
                return this;
            }

            public Builder setIconUrlBytes(ByteString byteString) {
                copyOnWrite();
                ((SystemVoiceLiveCommentsMsg) ((GeneratedMessageLite.b) this).instance).setIconUrlBytes(byteString);
                return this;
            }

            public Builder setId(String str) {
                copyOnWrite();
                ((SystemVoiceLiveCommentsMsg) ((GeneratedMessageLite.b) this).instance).setId(str);
                return this;
            }

            public Builder setIdBytes(ByteString byteString) {
                copyOnWrite();
                ((SystemVoiceLiveCommentsMsg) ((GeneratedMessageLite.b) this).instance).setIdBytes(byteString);
                return this;
            }

            public Builder setLiveID(String str) {
                copyOnWrite();
                ((SystemVoiceLiveCommentsMsg) ((GeneratedMessageLite.b) this).instance).setLiveID(str);
                return this;
            }

            public Builder setLiveIDBytes(ByteString byteString) {
                copyOnWrite();
                ((SystemVoiceLiveCommentsMsg) ((GeneratedMessageLite.b) this).instance).setLiveIDBytes(byteString);
                return this;
            }

            public Builder setPriority(long j) {
                copyOnWrite();
                ((SystemVoiceLiveCommentsMsg) ((GeneratedMessageLite.b) this).instance).setPriority(j);
                return this;
            }

            public Builder setRoomID(String str) {
                copyOnWrite();
                ((SystemVoiceLiveCommentsMsg) ((GeneratedMessageLite.b) this).instance).setRoomID(str);
                return this;
            }

            public Builder setRoomIDBytes(ByteString byteString) {
                copyOnWrite();
                ((SystemVoiceLiveCommentsMsg) ((GeneratedMessageLite.b) this).instance).setRoomIDBytes(byteString);
                return this;
            }

            public Builder setStartColor(String str) {
                copyOnWrite();
                ((SystemVoiceLiveCommentsMsg) ((GeneratedMessageLite.b) this).instance).setStartColor(str);
                return this;
            }

            public Builder setStartColorBytes(ByteString byteString) {
                copyOnWrite();
                ((SystemVoiceLiveCommentsMsg) ((GeneratedMessageLite.b) this).instance).setStartColorBytes(byteString);
                return this;
            }

            public Builder setTemplateData(TemplateData templateData) {
                copyOnWrite();
                ((SystemVoiceLiveCommentsMsg) ((GeneratedMessageLite.b) this).instance).setTemplateData(templateData);
                return this;
            }

            public Builder setType(String str) {
                copyOnWrite();
                ((SystemVoiceLiveCommentsMsg) ((GeneratedMessageLite.b) this).instance).setType(str);
                return this;
            }

            public Builder setTypeBytes(ByteString byteString) {
                copyOnWrite();
                ((SystemVoiceLiveCommentsMsg) ((GeneratedMessageLite.b) this).instance).setTypeBytes(byteString);
                return this;
            }

            public Builder setBackground(SystemVoiceLiveCommentBackground.Builder builder) {
                copyOnWrite();
                ((SystemVoiceLiveCommentsMsg) ((GeneratedMessageLite.b) this).instance).setBackground(builder);
                return this;
            }

            public Builder setTemplateData(TemplateData.Builder builder) {
                copyOnWrite();
                ((SystemVoiceLiveCommentsMsg) ((GeneratedMessageLite.b) this).instance).setTemplateData(builder);
                return this;
            }
        }

        public static SystemVoiceLiveCommentsMsg parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (SystemVoiceLiveCommentsMsg) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static SystemVoiceLiveCommentsMsg parseFrom(byte[] bArr, h hVar) throws InvalidProtocolBufferException {
            return (SystemVoiceLiveCommentsMsg) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, hVar);
        }

        public static SystemVoiceLiveCommentsMsg parseFrom(InputStream inputStream) throws IOException {
            return (SystemVoiceLiveCommentsMsg) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static SystemVoiceLiveCommentsMsg parseFrom(InputStream inputStream, h hVar) throws IOException {
            return (SystemVoiceLiveCommentsMsg) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, hVar);
        }

        public static SystemVoiceLiveCommentsMsg parseFrom(e eVar) throws IOException {
            return (SystemVoiceLiveCommentsMsg) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, eVar);
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.toBuilder();
        }

        public static SystemVoiceLiveCommentsMsg parseFrom(e eVar, h hVar) throws IOException {
            return (SystemVoiceLiveCommentsMsg) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, eVar, hVar);
        }
    }

    public static final class TemplateData extends GeneratedMessageLite<TemplateData, Builder> implements TemplateDataOrBuilder {
        private static final TemplateData DEFAULT_INSTANCE;
        public static final int FIELDS_FIELD_NUMBER = 2;
        public static final int ID_FIELD_NUMBER = 1;
        private static volatile i860<TemplateData> PARSER;
        private int bitField0_;
        private l.h<String> fields_ = GeneratedMessageLite.emptyProtobufList();
        private int id_;

        public static final class Builder extends GeneratedMessageLite.b<TemplateData, Builder> implements TemplateDataOrBuilder {
            private Builder() {
                super(TemplateData.DEFAULT_INSTANCE);
            }

            public Builder addAllFields(Iterable<String> iterable) {
                copyOnWrite();
                ((TemplateData) ((GeneratedMessageLite.b) this).instance).addAllFields(iterable);
                return this;
            }

            public Builder addFields(String str) {
                copyOnWrite();
                ((TemplateData) ((GeneratedMessageLite.b) this).instance).addFields(str);
                return this;
            }

            public Builder addFieldsBytes(ByteString byteString) {
                copyOnWrite();
                ((TemplateData) ((GeneratedMessageLite.b) this).instance).addFieldsBytes(byteString);
                return this;
            }

            public Builder clearFields() {
                copyOnWrite();
                ((TemplateData) ((GeneratedMessageLite.b) this).instance).clearFields();
                return this;
            }

            public Builder clearId() {
                copyOnWrite();
                ((TemplateData) ((GeneratedMessageLite.b) this).instance).clearId();
                return this;
            }

            @Override // com.p1.mobile.longlink.msg.voicelivemessage.VoiceLiveBullet.TemplateDataOrBuilder
            public String getFields(int i) {
                return ((TemplateData) ((GeneratedMessageLite.b) this).instance).getFields(i);
            }

            @Override // com.p1.mobile.longlink.msg.voicelivemessage.VoiceLiveBullet.TemplateDataOrBuilder
            public ByteString getFieldsBytes(int i) {
                return ((TemplateData) ((GeneratedMessageLite.b) this).instance).getFieldsBytes(i);
            }

            @Override // com.p1.mobile.longlink.msg.voicelivemessage.VoiceLiveBullet.TemplateDataOrBuilder
            public int getFieldsCount() {
                return ((TemplateData) ((GeneratedMessageLite.b) this).instance).getFieldsCount();
            }

            @Override // com.p1.mobile.longlink.msg.voicelivemessage.VoiceLiveBullet.TemplateDataOrBuilder
            public List<String> getFieldsList() {
                return Collections.unmodifiableList(((TemplateData) ((GeneratedMessageLite.b) this).instance).getFieldsList());
            }

            @Override // com.p1.mobile.longlink.msg.voicelivemessage.VoiceLiveBullet.TemplateDataOrBuilder
            public int getId() {
                return ((TemplateData) ((GeneratedMessageLite.b) this).instance).getId();
            }

            public Builder setFields(int i, String str) {
                copyOnWrite();
                ((TemplateData) ((GeneratedMessageLite.b) this).instance).setFields(i, str);
                return this;
            }

            public Builder setId(int i) {
                copyOnWrite();
                ((TemplateData) ((GeneratedMessageLite.b) this).instance).setId(i);
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
            a.addAll(iterable, this.fields_);
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
            a.checkByteStringIsUtf8(byteString);
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
            if (this.fields_.q()) {
                return;
            }
            this.fields_ = GeneratedMessageLite.mutableCopy(this.fields_);
        }

        public static TemplateData getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder(TemplateData templateData) {
            return (Builder) ((Builder) DEFAULT_INSTANCE.toBuilder()).mergeFrom(templateData);
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

        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            boolean z = false;
            switch (C04731.f1703xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new TemplateData();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                    this.fields_.n();
                    return null;
                case 4:
                    return new Builder();
                case 5:
                    GeneratedMessageLite.g gVar = (GeneratedMessageLite.h) obj;
                    TemplateData templateData = (TemplateData) obj2;
                    int i = this.id_;
                    boolean z2 = i != 0;
                    int i2 = templateData.id_;
                    this.id_ = gVar.e(z2, i, i2 != 0, i2);
                    this.fields_ = gVar.g(this.fields_, templateData.fields_);
                    if (gVar == GeneratedMessageLite.g.INSTANCE) {
                        this.bitField0_ |= templateData.bitField0_;
                    }
                    return this;
                case 6:
                    e eVar = (e) obj;
                    while (!z) {
                        try {
                            int iM = eVar.M();
                            if (iM != 0) {
                                if (iM == 8) {
                                    this.id_ = eVar.N();
                                } else if (iM == 18) {
                                    String strL = eVar.L();
                                    if (!this.fields_.q()) {
                                        this.fields_ = GeneratedMessageLite.mutableCopy(this.fields_);
                                    }
                                    this.fields_.add(strL);
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
                        synchronized (TemplateData.class) {
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

        @Override // com.p1.mobile.longlink.msg.voicelivemessage.VoiceLiveBullet.TemplateDataOrBuilder
        public String getFields(int i) {
            return (String) this.fields_.get(i);
        }

        @Override // com.p1.mobile.longlink.msg.voicelivemessage.VoiceLiveBullet.TemplateDataOrBuilder
        public ByteString getFieldsBytes(int i) {
            return ByteString.copyFromUtf8((String) this.fields_.get(i));
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

        public int getSerializedSize() {
            int i = ((GeneratedMessageLite) this).memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int i2 = this.id_;
            int iN = i2 != 0 ? CodedOutputStream.N(1, i2) : 0;
            int iL = 0;
            for (int i3 = 0; i3 < this.fields_.size(); i3++) {
                iL += CodedOutputStream.L((String) this.fields_.get(i3));
            }
            int size = iN + iL + getFieldsList().size();
            ((GeneratedMessageLite) this).memoizedSerializedSize = size;
            return size;
        }

        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            int i = this.id_;
            if (i != 0) {
                codedOutputStream.G0(1, i);
            }
            for (int i2 = 0; i2 < this.fields_.size(); i2++) {
                codedOutputStream.D0(2, (String) this.fields_.get(i2));
            }
        }

        public static TemplateData parseDelimitedFrom(InputStream inputStream, h hVar) throws IOException {
            return (TemplateData) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, hVar);
        }

        public static TemplateData parseFrom(ByteString byteString, h hVar) throws InvalidProtocolBufferException {
            return (TemplateData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, hVar);
        }

        public static TemplateData parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (TemplateData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static TemplateData parseFrom(byte[] bArr, h hVar) throws InvalidProtocolBufferException {
            return (TemplateData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, hVar);
        }

        public static TemplateData parseFrom(InputStream inputStream) throws IOException {
            return (TemplateData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static TemplateData parseFrom(InputStream inputStream, h hVar) throws IOException {
            return (TemplateData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, hVar);
        }

        public static TemplateData parseFrom(e eVar) throws IOException {
            return (TemplateData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, eVar);
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.toBuilder();
        }

        public static TemplateData parseFrom(e eVar, h hVar) throws IOException {
            return (TemplateData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, eVar, hVar);
        }
    }
}
