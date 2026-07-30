package com.p003p1.mobile.longlink.msg.liveroom;

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
import l.aag0;
import l.bz00;
import l.i860;
import l.o6z;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes8.dex */
public final class LongLinkVideoFindPeople {

    /* JADX INFO: renamed from: com.p1.mobile.longlink.msg.liveroom.LongLinkVideoFindPeople$1 */
    public static /* synthetic */ class C04201 {

        /* JADX INFO: renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f1678xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f1678xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f1678xa1df5c61[GeneratedMessageLite.MethodToInvoke.IS_INITIALIZED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f1678xa1df5c61[GeneratedMessageLite.MethodToInvoke.MAKE_IMMUTABLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f1678xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f1678xa1df5c61[GeneratedMessageLite.MethodToInvoke.VISIT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f1678xa1df5c61[GeneratedMessageLite.MethodToInvoke.MERGE_FROM_STREAM.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f1678xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f1678xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    public interface LiveAnchorAvatarCommentOrBuilder extends o6z {
        String getContent();

        ByteString getContentBytes();

        /* synthetic */ q getDefaultInstanceForType();

        String getGotoSchema();

        ByteString getGotoSchemaBytes();

        String getIconUrl();

        ByteString getIconUrlBytes();

        int getShowSeconds();

        String getTitle();

        ByteString getTitleBytes();

        /* synthetic */ boolean isInitialized();
    }

    public interface LiveMultiCallPartyFinderMessageOrBuilder extends o6z {
        /* synthetic */ q getDefaultInstanceForType();

        String getFinderId();

        ByteString getFinderIdBytes();

        int getInvitedUserCnt();

        Type getType();

        int getTypeValue();

        String getUserId();

        ByteString getUserIdBytes();

        /* synthetic */ boolean isInitialized();
    }

    private LongLinkVideoFindPeople() {
    }

    public static void registerAllExtensions(h hVar) {
    }

    public static final class LiveAnchorAvatarComment extends GeneratedMessageLite<LiveAnchorAvatarComment, Builder> implements LiveAnchorAvatarCommentOrBuilder {
        public static final int CONTENT_FIELD_NUMBER = 3;
        private static final LiveAnchorAvatarComment DEFAULT_INSTANCE;
        public static final int GOTOSCHEMA_FIELD_NUMBER = 4;
        public static final int ICONURL_FIELD_NUMBER = 1;
        private static volatile i860<LiveAnchorAvatarComment> PARSER = null;
        public static final int SHOWSECONDS_FIELD_NUMBER = 5;
        public static final int TITLE_FIELD_NUMBER = 2;
        private int showSeconds_;
        private String iconUrl_ = "";
        private String title_ = "";
        private String content_ = "";
        private String gotoSchema_ = "";

        public static final class Builder extends GeneratedMessageLite.b<LiveAnchorAvatarComment, Builder> implements LiveAnchorAvatarCommentOrBuilder {
            private Builder() {
                super(LiveAnchorAvatarComment.DEFAULT_INSTANCE);
            }

            public Builder clearContent() {
                copyOnWrite();
                ((LiveAnchorAvatarComment) ((GeneratedMessageLite.b) this).instance).clearContent();
                return this;
            }

            public Builder clearGotoSchema() {
                copyOnWrite();
                ((LiveAnchorAvatarComment) ((GeneratedMessageLite.b) this).instance).clearGotoSchema();
                return this;
            }

            public Builder clearIconUrl() {
                copyOnWrite();
                ((LiveAnchorAvatarComment) ((GeneratedMessageLite.b) this).instance).clearIconUrl();
                return this;
            }

            public Builder clearShowSeconds() {
                copyOnWrite();
                ((LiveAnchorAvatarComment) ((GeneratedMessageLite.b) this).instance).clearShowSeconds();
                return this;
            }

            public Builder clearTitle() {
                copyOnWrite();
                ((LiveAnchorAvatarComment) ((GeneratedMessageLite.b) this).instance).clearTitle();
                return this;
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVideoFindPeople.LiveAnchorAvatarCommentOrBuilder
            public String getContent() {
                return ((LiveAnchorAvatarComment) ((GeneratedMessageLite.b) this).instance).getContent();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVideoFindPeople.LiveAnchorAvatarCommentOrBuilder
            public ByteString getContentBytes() {
                return ((LiveAnchorAvatarComment) ((GeneratedMessageLite.b) this).instance).getContentBytes();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVideoFindPeople.LiveAnchorAvatarCommentOrBuilder
            public String getGotoSchema() {
                return ((LiveAnchorAvatarComment) ((GeneratedMessageLite.b) this).instance).getGotoSchema();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVideoFindPeople.LiveAnchorAvatarCommentOrBuilder
            public ByteString getGotoSchemaBytes() {
                return ((LiveAnchorAvatarComment) ((GeneratedMessageLite.b) this).instance).getGotoSchemaBytes();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVideoFindPeople.LiveAnchorAvatarCommentOrBuilder
            public String getIconUrl() {
                return ((LiveAnchorAvatarComment) ((GeneratedMessageLite.b) this).instance).getIconUrl();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVideoFindPeople.LiveAnchorAvatarCommentOrBuilder
            public ByteString getIconUrlBytes() {
                return ((LiveAnchorAvatarComment) ((GeneratedMessageLite.b) this).instance).getIconUrlBytes();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVideoFindPeople.LiveAnchorAvatarCommentOrBuilder
            public int getShowSeconds() {
                return ((LiveAnchorAvatarComment) ((GeneratedMessageLite.b) this).instance).getShowSeconds();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVideoFindPeople.LiveAnchorAvatarCommentOrBuilder
            public String getTitle() {
                return ((LiveAnchorAvatarComment) ((GeneratedMessageLite.b) this).instance).getTitle();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVideoFindPeople.LiveAnchorAvatarCommentOrBuilder
            public ByteString getTitleBytes() {
                return ((LiveAnchorAvatarComment) ((GeneratedMessageLite.b) this).instance).getTitleBytes();
            }

            public Builder setContent(String str) {
                copyOnWrite();
                ((LiveAnchorAvatarComment) ((GeneratedMessageLite.b) this).instance).setContent(str);
                return this;
            }

            public Builder setContentBytes(ByteString byteString) {
                copyOnWrite();
                ((LiveAnchorAvatarComment) ((GeneratedMessageLite.b) this).instance).setContentBytes(byteString);
                return this;
            }

            public Builder setGotoSchema(String str) {
                copyOnWrite();
                ((LiveAnchorAvatarComment) ((GeneratedMessageLite.b) this).instance).setGotoSchema(str);
                return this;
            }

            public Builder setGotoSchemaBytes(ByteString byteString) {
                copyOnWrite();
                ((LiveAnchorAvatarComment) ((GeneratedMessageLite.b) this).instance).setGotoSchemaBytes(byteString);
                return this;
            }

            public Builder setIconUrl(String str) {
                copyOnWrite();
                ((LiveAnchorAvatarComment) ((GeneratedMessageLite.b) this).instance).setIconUrl(str);
                return this;
            }

            public Builder setIconUrlBytes(ByteString byteString) {
                copyOnWrite();
                ((LiveAnchorAvatarComment) ((GeneratedMessageLite.b) this).instance).setIconUrlBytes(byteString);
                return this;
            }

            public Builder setShowSeconds(int i) {
                copyOnWrite();
                ((LiveAnchorAvatarComment) ((GeneratedMessageLite.b) this).instance).setShowSeconds(i);
                return this;
            }

            public Builder setTitle(String str) {
                copyOnWrite();
                ((LiveAnchorAvatarComment) ((GeneratedMessageLite.b) this).instance).setTitle(str);
                return this;
            }

            public Builder setTitleBytes(ByteString byteString) {
                copyOnWrite();
                ((LiveAnchorAvatarComment) ((GeneratedMessageLite.b) this).instance).setTitleBytes(byteString);
                return this;
            }
        }

        static {
            LiveAnchorAvatarComment liveAnchorAvatarComment = new LiveAnchorAvatarComment();
            DEFAULT_INSTANCE = liveAnchorAvatarComment;
            liveAnchorAvatarComment.makeImmutable();
        }

        private LiveAnchorAvatarComment() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearContent() {
            this.content_ = getDefaultInstance().getContent();
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
        public void clearShowSeconds() {
            this.showSeconds_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearTitle() {
            this.title_ = getDefaultInstance().getTitle();
        }

        public static LiveAnchorAvatarComment getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder(LiveAnchorAvatarComment liveAnchorAvatarComment) {
            return (Builder) ((Builder) DEFAULT_INSTANCE.toBuilder()).mergeFrom(liveAnchorAvatarComment);
        }

        public static LiveAnchorAvatarComment parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (LiveAnchorAvatarComment) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static LiveAnchorAvatarComment parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (LiveAnchorAvatarComment) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static i860<LiveAnchorAvatarComment> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setContent(String str) {
            str.getClass();
            this.content_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setContentBytes(ByteString byteString) {
            byteString.getClass();
            a.checkByteStringIsUtf8(byteString);
            this.content_ = byteString.toStringUtf8();
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
        public void setShowSeconds(int i) {
            this.showSeconds_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTitle(String str) {
            str.getClass();
            this.title_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTitleBytes(ByteString byteString) {
            byteString.getClass();
            a.checkByteStringIsUtf8(byteString);
            this.title_ = byteString.toStringUtf8();
        }

        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            boolean z = false;
            switch (C04201.f1678xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new LiveAnchorAvatarComment();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                    return null;
                case 4:
                    return new Builder();
                case 5:
                    GeneratedMessageLite.h hVar = (GeneratedMessageLite.h) obj;
                    LiveAnchorAvatarComment liveAnchorAvatarComment = (LiveAnchorAvatarComment) obj2;
                    this.iconUrl_ = hVar.f(!this.iconUrl_.isEmpty(), this.iconUrl_, !liveAnchorAvatarComment.iconUrl_.isEmpty(), liveAnchorAvatarComment.iconUrl_);
                    this.title_ = hVar.f(!this.title_.isEmpty(), this.title_, !liveAnchorAvatarComment.title_.isEmpty(), liveAnchorAvatarComment.title_);
                    this.content_ = hVar.f(!this.content_.isEmpty(), this.content_, !liveAnchorAvatarComment.content_.isEmpty(), liveAnchorAvatarComment.content_);
                    this.gotoSchema_ = hVar.f(!this.gotoSchema_.isEmpty(), this.gotoSchema_, !liveAnchorAvatarComment.gotoSchema_.isEmpty(), liveAnchorAvatarComment.gotoSchema_);
                    int i = this.showSeconds_;
                    boolean z2 = i != 0;
                    int i2 = liveAnchorAvatarComment.showSeconds_;
                    this.showSeconds_ = hVar.e(z2, i, i2 != 0, i2);
                    GeneratedMessageLite.g gVar = GeneratedMessageLite.g.INSTANCE;
                    return this;
                case 6:
                    e eVar = (e) obj;
                    while (!z) {
                        try {
                            int iM = eVar.M();
                            if (iM != 0) {
                                if (iM == 10) {
                                    this.iconUrl_ = eVar.L();
                                } else if (iM == 18) {
                                    this.title_ = eVar.L();
                                } else if (iM == 26) {
                                    this.content_ = eVar.L();
                                } else if (iM == 34) {
                                    this.gotoSchema_ = eVar.L();
                                } else if (iM == 40) {
                                    this.showSeconds_ = eVar.u();
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
                        synchronized (LiveAnchorAvatarComment.class) {
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

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVideoFindPeople.LiveAnchorAvatarCommentOrBuilder
        public String getContent() {
            return this.content_;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVideoFindPeople.LiveAnchorAvatarCommentOrBuilder
        public ByteString getContentBytes() {
            return ByteString.copyFromUtf8(this.content_);
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVideoFindPeople.LiveAnchorAvatarCommentOrBuilder
        public String getGotoSchema() {
            return this.gotoSchema_;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVideoFindPeople.LiveAnchorAvatarCommentOrBuilder
        public ByteString getGotoSchemaBytes() {
            return ByteString.copyFromUtf8(this.gotoSchema_);
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVideoFindPeople.LiveAnchorAvatarCommentOrBuilder
        public String getIconUrl() {
            return this.iconUrl_;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVideoFindPeople.LiveAnchorAvatarCommentOrBuilder
        public ByteString getIconUrlBytes() {
            return ByteString.copyFromUtf8(this.iconUrl_);
        }

        public int getSerializedSize() {
            int i = ((GeneratedMessageLite) this).memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int iK = !this.iconUrl_.isEmpty() ? CodedOutputStream.K(1, getIconUrl()) : 0;
            if (!this.title_.isEmpty()) {
                iK += CodedOutputStream.K(2, getTitle());
            }
            if (!this.content_.isEmpty()) {
                iK += CodedOutputStream.K(3, getContent());
            }
            if (!this.gotoSchema_.isEmpty()) {
                iK += CodedOutputStream.K(4, getGotoSchema());
            }
            int i2 = this.showSeconds_;
            if (i2 != 0) {
                iK += CodedOutputStream.t(5, i2);
            }
            ((GeneratedMessageLite) this).memoizedSerializedSize = iK;
            return iK;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVideoFindPeople.LiveAnchorAvatarCommentOrBuilder
        public int getShowSeconds() {
            return this.showSeconds_;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVideoFindPeople.LiveAnchorAvatarCommentOrBuilder
        public String getTitle() {
            return this.title_;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVideoFindPeople.LiveAnchorAvatarCommentOrBuilder
        public ByteString getTitleBytes() {
            return ByteString.copyFromUtf8(this.title_);
        }

        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (!this.iconUrl_.isEmpty()) {
                codedOutputStream.D0(1, getIconUrl());
            }
            if (!this.title_.isEmpty()) {
                codedOutputStream.D0(2, getTitle());
            }
            if (!this.content_.isEmpty()) {
                codedOutputStream.D0(3, getContent());
            }
            if (!this.gotoSchema_.isEmpty()) {
                codedOutputStream.D0(4, getGotoSchema());
            }
            int i = this.showSeconds_;
            if (i != 0) {
                codedOutputStream.s0(5, i);
            }
        }

        public static LiveAnchorAvatarComment parseDelimitedFrom(InputStream inputStream, h hVar) throws IOException {
            return (LiveAnchorAvatarComment) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, hVar);
        }

        public static LiveAnchorAvatarComment parseFrom(ByteString byteString, h hVar) throws InvalidProtocolBufferException {
            return (LiveAnchorAvatarComment) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, hVar);
        }

        public static LiveAnchorAvatarComment parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (LiveAnchorAvatarComment) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static LiveAnchorAvatarComment parseFrom(byte[] bArr, h hVar) throws InvalidProtocolBufferException {
            return (LiveAnchorAvatarComment) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, hVar);
        }

        public static LiveAnchorAvatarComment parseFrom(InputStream inputStream) throws IOException {
            return (LiveAnchorAvatarComment) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static LiveAnchorAvatarComment parseFrom(InputStream inputStream, h hVar) throws IOException {
            return (LiveAnchorAvatarComment) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, hVar);
        }

        public static LiveAnchorAvatarComment parseFrom(e eVar) throws IOException {
            return (LiveAnchorAvatarComment) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, eVar);
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.toBuilder();
        }

        public static LiveAnchorAvatarComment parseFrom(e eVar, h hVar) throws IOException {
            return (LiveAnchorAvatarComment) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, eVar, hVar);
        }
    }

    public static final class LiveMultiCallPartyFinderMessage extends GeneratedMessageLite<LiveMultiCallPartyFinderMessage, Builder> implements LiveMultiCallPartyFinderMessageOrBuilder {
        private static final LiveMultiCallPartyFinderMessage DEFAULT_INSTANCE;
        public static final int FINDERID_FIELD_NUMBER = 3;
        public static final int INVITEDUSERCNT_FIELD_NUMBER = 4;
        private static volatile i860<LiveMultiCallPartyFinderMessage> PARSER = null;
        public static final int TYPE_FIELD_NUMBER = 1;
        public static final int USERID_FIELD_NUMBER = 2;
        private int invitedUserCnt_;
        private int type_;
        private String userId_ = "";
        private String finderId_ = "";

        public static final class Builder extends GeneratedMessageLite.b<LiveMultiCallPartyFinderMessage, Builder> implements LiveMultiCallPartyFinderMessageOrBuilder {
            private Builder() {
                super(LiveMultiCallPartyFinderMessage.DEFAULT_INSTANCE);
            }

            public Builder clearFinderId() {
                copyOnWrite();
                ((LiveMultiCallPartyFinderMessage) ((GeneratedMessageLite.b) this).instance).clearFinderId();
                return this;
            }

            public Builder clearInvitedUserCnt() {
                copyOnWrite();
                ((LiveMultiCallPartyFinderMessage) ((GeneratedMessageLite.b) this).instance).clearInvitedUserCnt();
                return this;
            }

            public Builder clearType() {
                copyOnWrite();
                ((LiveMultiCallPartyFinderMessage) ((GeneratedMessageLite.b) this).instance).clearType();
                return this;
            }

            public Builder clearUserId() {
                copyOnWrite();
                ((LiveMultiCallPartyFinderMessage) ((GeneratedMessageLite.b) this).instance).clearUserId();
                return this;
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVideoFindPeople.LiveMultiCallPartyFinderMessageOrBuilder
            public String getFinderId() {
                return ((LiveMultiCallPartyFinderMessage) ((GeneratedMessageLite.b) this).instance).getFinderId();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVideoFindPeople.LiveMultiCallPartyFinderMessageOrBuilder
            public ByteString getFinderIdBytes() {
                return ((LiveMultiCallPartyFinderMessage) ((GeneratedMessageLite.b) this).instance).getFinderIdBytes();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVideoFindPeople.LiveMultiCallPartyFinderMessageOrBuilder
            public int getInvitedUserCnt() {
                return ((LiveMultiCallPartyFinderMessage) ((GeneratedMessageLite.b) this).instance).getInvitedUserCnt();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVideoFindPeople.LiveMultiCallPartyFinderMessageOrBuilder
            public Type getType() {
                return ((LiveMultiCallPartyFinderMessage) ((GeneratedMessageLite.b) this).instance).getType();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVideoFindPeople.LiveMultiCallPartyFinderMessageOrBuilder
            public int getTypeValue() {
                return ((LiveMultiCallPartyFinderMessage) ((GeneratedMessageLite.b) this).instance).getTypeValue();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVideoFindPeople.LiveMultiCallPartyFinderMessageOrBuilder
            public String getUserId() {
                return ((LiveMultiCallPartyFinderMessage) ((GeneratedMessageLite.b) this).instance).getUserId();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVideoFindPeople.LiveMultiCallPartyFinderMessageOrBuilder
            public ByteString getUserIdBytes() {
                return ((LiveMultiCallPartyFinderMessage) ((GeneratedMessageLite.b) this).instance).getUserIdBytes();
            }

            public Builder setFinderId(String str) {
                copyOnWrite();
                ((LiveMultiCallPartyFinderMessage) ((GeneratedMessageLite.b) this).instance).setFinderId(str);
                return this;
            }

            public Builder setFinderIdBytes(ByteString byteString) {
                copyOnWrite();
                ((LiveMultiCallPartyFinderMessage) ((GeneratedMessageLite.b) this).instance).setFinderIdBytes(byteString);
                return this;
            }

            public Builder setInvitedUserCnt(int i) {
                copyOnWrite();
                ((LiveMultiCallPartyFinderMessage) ((GeneratedMessageLite.b) this).instance).setInvitedUserCnt(i);
                return this;
            }

            public Builder setType(Type type) {
                copyOnWrite();
                ((LiveMultiCallPartyFinderMessage) ((GeneratedMessageLite.b) this).instance).setType(type);
                return this;
            }

            public Builder setTypeValue(int i) {
                copyOnWrite();
                ((LiveMultiCallPartyFinderMessage) ((GeneratedMessageLite.b) this).instance).setTypeValue(i);
                return this;
            }

            public Builder setUserId(String str) {
                copyOnWrite();
                ((LiveMultiCallPartyFinderMessage) ((GeneratedMessageLite.b) this).instance).setUserId(str);
                return this;
            }

            public Builder setUserIdBytes(ByteString byteString) {
                copyOnWrite();
                ((LiveMultiCallPartyFinderMessage) ((GeneratedMessageLite.b) this).instance).setUserIdBytes(byteString);
                return this;
            }
        }

        static {
            LiveMultiCallPartyFinderMessage liveMultiCallPartyFinderMessage = new LiveMultiCallPartyFinderMessage();
            DEFAULT_INSTANCE = liveMultiCallPartyFinderMessage;
            liveMultiCallPartyFinderMessage.makeImmutable();
        }

        private LiveMultiCallPartyFinderMessage() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearFinderId() {
            this.finderId_ = getDefaultInstance().getFinderId();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearInvitedUserCnt() {
            this.invitedUserCnt_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearType() {
            this.type_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearUserId() {
            this.userId_ = getDefaultInstance().getUserId();
        }

        public static LiveMultiCallPartyFinderMessage getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder(LiveMultiCallPartyFinderMessage liveMultiCallPartyFinderMessage) {
            return (Builder) ((Builder) DEFAULT_INSTANCE.toBuilder()).mergeFrom(liveMultiCallPartyFinderMessage);
        }

        public static LiveMultiCallPartyFinderMessage parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (LiveMultiCallPartyFinderMessage) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static LiveMultiCallPartyFinderMessage parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (LiveMultiCallPartyFinderMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static i860<LiveMultiCallPartyFinderMessage> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setFinderId(String str) {
            str.getClass();
            this.finderId_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setFinderIdBytes(ByteString byteString) {
            byteString.getClass();
            a.checkByteStringIsUtf8(byteString);
            this.finderId_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setInvitedUserCnt(int i) {
            this.invitedUserCnt_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setType(Type type) {
            type.getClass();
            this.type_ = type.getNumber();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTypeValue(int i) {
            this.type_ = i;
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

        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            boolean z = false;
            switch (C04201.f1678xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new LiveMultiCallPartyFinderMessage();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                    return null;
                case 4:
                    return new Builder();
                case 5:
                    GeneratedMessageLite.h hVar = (GeneratedMessageLite.h) obj;
                    LiveMultiCallPartyFinderMessage liveMultiCallPartyFinderMessage = (LiveMultiCallPartyFinderMessage) obj2;
                    int i = this.type_;
                    boolean z2 = i != 0;
                    int i2 = liveMultiCallPartyFinderMessage.type_;
                    this.type_ = hVar.e(z2, i, i2 != 0, i2);
                    this.userId_ = hVar.f(!this.userId_.isEmpty(), this.userId_, !liveMultiCallPartyFinderMessage.userId_.isEmpty(), liveMultiCallPartyFinderMessage.userId_);
                    this.finderId_ = hVar.f(!this.finderId_.isEmpty(), this.finderId_, !liveMultiCallPartyFinderMessage.finderId_.isEmpty(), liveMultiCallPartyFinderMessage.finderId_);
                    int i3 = this.invitedUserCnt_;
                    boolean z3 = i3 != 0;
                    int i4 = liveMultiCallPartyFinderMessage.invitedUserCnt_;
                    this.invitedUserCnt_ = hVar.e(z3, i3, i4 != 0, i4);
                    GeneratedMessageLite.g gVar = GeneratedMessageLite.g.INSTANCE;
                    return this;
                case 6:
                    e eVar = (e) obj;
                    while (!z) {
                        try {
                            int iM = eVar.M();
                            if (iM != 0) {
                                if (iM == 8) {
                                    this.type_ = eVar.p();
                                } else if (iM == 18) {
                                    this.userId_ = eVar.L();
                                } else if (iM == 26) {
                                    this.finderId_ = eVar.L();
                                } else if (iM == 32) {
                                    this.invitedUserCnt_ = eVar.u();
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
                        synchronized (LiveMultiCallPartyFinderMessage.class) {
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

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVideoFindPeople.LiveMultiCallPartyFinderMessageOrBuilder
        public String getFinderId() {
            return this.finderId_;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVideoFindPeople.LiveMultiCallPartyFinderMessageOrBuilder
        public ByteString getFinderIdBytes() {
            return ByteString.copyFromUtf8(this.finderId_);
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVideoFindPeople.LiveMultiCallPartyFinderMessageOrBuilder
        public int getInvitedUserCnt() {
            return this.invitedUserCnt_;
        }

        public int getSerializedSize() {
            int i = ((GeneratedMessageLite) this).memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int iM = this.type_ != Type.startFinder.getNumber() ? CodedOutputStream.m(1, this.type_) : 0;
            if (!this.userId_.isEmpty()) {
                iM += CodedOutputStream.K(2, getUserId());
            }
            if (!this.finderId_.isEmpty()) {
                iM += CodedOutputStream.K(3, getFinderId());
            }
            int i2 = this.invitedUserCnt_;
            if (i2 != 0) {
                iM += CodedOutputStream.t(4, i2);
            }
            ((GeneratedMessageLite) this).memoizedSerializedSize = iM;
            return iM;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVideoFindPeople.LiveMultiCallPartyFinderMessageOrBuilder
        public Type getType() {
            Type typeForNumber = Type.forNumber(this.type_);
            return typeForNumber == null ? Type.UNRECOGNIZED : typeForNumber;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVideoFindPeople.LiveMultiCallPartyFinderMessageOrBuilder
        public int getTypeValue() {
            return this.type_;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVideoFindPeople.LiveMultiCallPartyFinderMessageOrBuilder
        public String getUserId() {
            return this.userId_;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVideoFindPeople.LiveMultiCallPartyFinderMessageOrBuilder
        public ByteString getUserIdBytes() {
            return ByteString.copyFromUtf8(this.userId_);
        }

        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (this.type_ != Type.startFinder.getNumber()) {
                codedOutputStream.i0(1, this.type_);
            }
            if (!this.userId_.isEmpty()) {
                codedOutputStream.D0(2, getUserId());
            }
            if (!this.finderId_.isEmpty()) {
                codedOutputStream.D0(3, getFinderId());
            }
            int i = this.invitedUserCnt_;
            if (i != 0) {
                codedOutputStream.s0(4, i);
            }
        }

        public static LiveMultiCallPartyFinderMessage parseDelimitedFrom(InputStream inputStream, h hVar) throws IOException {
            return (LiveMultiCallPartyFinderMessage) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, hVar);
        }

        public static LiveMultiCallPartyFinderMessage parseFrom(ByteString byteString, h hVar) throws InvalidProtocolBufferException {
            return (LiveMultiCallPartyFinderMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, hVar);
        }

        public static LiveMultiCallPartyFinderMessage parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (LiveMultiCallPartyFinderMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static LiveMultiCallPartyFinderMessage parseFrom(byte[] bArr, h hVar) throws InvalidProtocolBufferException {
            return (LiveMultiCallPartyFinderMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, hVar);
        }

        public static LiveMultiCallPartyFinderMessage parseFrom(InputStream inputStream) throws IOException {
            return (LiveMultiCallPartyFinderMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static LiveMultiCallPartyFinderMessage parseFrom(InputStream inputStream, h hVar) throws IOException {
            return (LiveMultiCallPartyFinderMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, hVar);
        }

        public static LiveMultiCallPartyFinderMessage parseFrom(e eVar) throws IOException {
            return (LiveMultiCallPartyFinderMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, eVar);
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.toBuilder();
        }

        public static LiveMultiCallPartyFinderMessage parseFrom(e eVar, h hVar) throws IOException {
            return (LiveMultiCallPartyFinderMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, eVar, hVar);
        }
    }

    public enum Type implements l.c {
        startFinder(0),
        stopFinder(1),
        UNRECOGNIZED(-1);

        private static final l.d<Type> internalValueMap = new l.d<Type>() { // from class: com.p1.mobile.longlink.msg.liveroom.LongLinkVideoFindPeople.Type.1
            public Type findValueByNumber(int i) {
                return Type.forNumber(i);
            }
        };
        public static final int startFinder_VALUE = 0;
        public static final int stopFinder_VALUE = 1;
        private final int value;

        Type(int i) {
            this.value = i;
        }

        public static Type forNumber(int i) {
            if (i == 0) {
                return startFinder;
            }
            if (i != 1) {
                return null;
            }
            return stopFinder;
        }

        public static l.d<Type> internalGetValueMap() {
            return internalValueMap;
        }

        public final int getNumber() {
            return this.value;
        }

        @Deprecated
        public static Type valueOf(int i) {
            return forNumber(i);
        }
    }
}
