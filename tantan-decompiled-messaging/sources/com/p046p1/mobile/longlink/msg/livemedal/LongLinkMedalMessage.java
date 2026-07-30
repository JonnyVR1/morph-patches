package com.p046p1.mobile.longlink.msg.livemedal;

import com.google.protobuf.AbstractC3403a;
import com.google.protobuf.ByteString;
import com.google.protobuf.C3407e;
import com.google.protobuf.C3410h;
import com.google.protobuf.C3414l;
import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InterfaceC3419q;
import com.google.protobuf.InvalidProtocolBufferException;
import com.p046p1.mobile.longlink.msg.template.Template;
import java.io.IOException;
import java.io.InputStream;
import p149l.aag0;
import p149l.bz00;
import p149l.i860;
import p149l.o6z;

/* JADX INFO: loaded from: classes8.dex */
public final class LongLinkMedalMessage {

    /* JADX INFO: renamed from: com.p1.mobile.longlink.msg.livemedal.LongLinkMedalMessage$1 */
    public static /* synthetic */ class C44521 {

        /* JADX INFO: renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f15961xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f15961xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f15961xa1df5c61[GeneratedMessageLite.MethodToInvoke.IS_INITIALIZED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f15961xa1df5c61[GeneratedMessageLite.MethodToInvoke.MAKE_IMMUTABLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f15961xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f15961xa1df5c61[GeneratedMessageLite.MethodToInvoke.VISIT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f15961xa1df5c61[GeneratedMessageLite.MethodToInvoke.MERGE_FROM_STREAM.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f15961xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f15961xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    public interface LiveMedalChangedMsgOrBuilder extends o6z {
        @Override // p149l.o6z
        /* synthetic */ InterfaceC3419q getDefaultInstanceForType();

        String getLiveID();

        ByteString getLiveIDBytes();

        String getMedalID();

        ByteString getMedalIDBytes();

        String getRoomID();

        ByteString getRoomIDBytes();

        Template.TemplateData getTemplate();

        String getUserID();

        ByteString getUserIDBytes();

        String getUserName();

        ByteString getUserNameBytes();

        boolean hasTemplate();

        @Override // p149l.o6z
        /* synthetic */ boolean isInitialized();
    }

    public interface TurboCardReceiveEventOrBuilder extends o6z {
        @Override // p149l.o6z
        /* synthetic */ InterfaceC3419q getDefaultInstanceForType();

        String getIcon();

        ByteString getIconBytes();

        String getName();

        ByteString getNameBytes();

        long getNums();

        CardTypeEnum getType();

        int getTypeValue();

        String getUrl();

        ByteString getUrlBytes();

        @Override // p149l.o6z
        /* synthetic */ boolean isInitialized();
    }

    public interface TurboCardResultNoticeOrBuilder extends o6z {
        @Override // p149l.o6z
        /* synthetic */ InterfaceC3419q getDefaultInstanceForType();

        String getRoomId();

        ByteString getRoomIdBytes();

        long getTotalAudience();

        CardTypeEnum getType();

        int getTypeValue();

        @Override // p149l.o6z
        /* synthetic */ boolean isInitialized();
    }

    private LongLinkMedalMessage() {
    }

    public static void registerAllExtensions(C3410h c3410h) {
    }

    public enum CardTypeEnum implements C3414l.c {
        SENIOR(0),
        SUPER(1),
        UNRECOGNIZED(-1);

        public static final int SENIOR_VALUE = 0;
        public static final int SUPER_VALUE = 1;
        private static final C3414l.d<CardTypeEnum> internalValueMap = new C3414l.d<CardTypeEnum>() { // from class: com.p1.mobile.longlink.msg.livemedal.LongLinkMedalMessage.CardTypeEnum.1
            @Override // com.google.protobuf.C3414l.d
            public CardTypeEnum findValueByNumber(int i) {
                return CardTypeEnum.forNumber(i);
            }
        };
        private final int value;

        CardTypeEnum(int i) {
            this.value = i;
        }

        public static CardTypeEnum forNumber(int i) {
            if (i == 0) {
                return SENIOR;
            }
            if (i != 1) {
                return null;
            }
            return SUPER;
        }

        public static C3414l.d<CardTypeEnum> internalGetValueMap() {
            return internalValueMap;
        }

        @Override // com.google.protobuf.C3414l.c
        public final int getNumber() {
            return this.value;
        }

        @Deprecated
        public static CardTypeEnum valueOf(int i) {
            return forNumber(i);
        }
    }

    public static final class LiveMedalChangedMsg extends GeneratedMessageLite<LiveMedalChangedMsg, Builder> implements LiveMedalChangedMsgOrBuilder {
        private static final LiveMedalChangedMsg DEFAULT_INSTANCE;
        public static final int LIVEID_FIELD_NUMBER = 3;
        public static final int MEDALID_FIELD_NUMBER = 4;
        private static volatile i860<LiveMedalChangedMsg> PARSER = null;
        public static final int ROOMID_FIELD_NUMBER = 2;
        public static final int TEMPLATE_FIELD_NUMBER = 6;
        public static final int USERID_FIELD_NUMBER = 1;
        public static final int USERNAME_FIELD_NUMBER = 5;
        private Template.TemplateData template_;
        private String userID_ = "";
        private String roomID_ = "";
        private String liveID_ = "";
        private String medalID_ = "";
        private String userName_ = "";

        static {
            LiveMedalChangedMsg liveMedalChangedMsg = new LiveMedalChangedMsg();
            DEFAULT_INSTANCE = liveMedalChangedMsg;
            liveMedalChangedMsg.makeImmutable();
        }

        private LiveMedalChangedMsg() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearLiveID() {
            this.liveID_ = getDefaultInstance().getLiveID();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearMedalID() {
            this.medalID_ = getDefaultInstance().getMedalID();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearRoomID() {
            this.roomID_ = getDefaultInstance().getRoomID();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearTemplate() {
            this.template_ = null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearUserID() {
            this.userID_ = getDefaultInstance().getUserID();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearUserName() {
            this.userName_ = getDefaultInstance().getUserName();
        }

        public static LiveMedalChangedMsg getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeTemplate(Template.TemplateData templateData) {
            Template.TemplateData templateData2 = this.template_;
            if (templateData2 == null || templateData2 == Template.TemplateData.getDefaultInstance()) {
                this.template_ = templateData;
            } else {
                this.template_ = Template.TemplateData.newBuilder(this.template_).mergeFrom(templateData).buildPartial();
            }
        }

        public static Builder newBuilder(LiveMedalChangedMsg liveMedalChangedMsg) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(liveMedalChangedMsg);
        }

        public static LiveMedalChangedMsg parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (LiveMedalChangedMsg) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static LiveMedalChangedMsg parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (LiveMedalChangedMsg) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static i860<LiveMedalChangedMsg> parser() {
            return DEFAULT_INSTANCE.getParserForType();
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
        public void setMedalID(String str) {
            str.getClass();
            this.medalID_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setMedalIDBytes(ByteString byteString) {
            byteString.getClass();
            AbstractC3403a.checkByteStringIsUtf8(byteString);
            this.medalID_ = byteString.toStringUtf8();
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
        public void setTemplate(Template.TemplateData.Builder builder) {
            this.template_ = builder.build();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setUserID(String str) {
            str.getClass();
            this.userID_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setUserIDBytes(ByteString byteString) {
            byteString.getClass();
            AbstractC3403a.checkByteStringIsUtf8(byteString);
            this.userID_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setUserName(String str) {
            str.getClass();
            this.userName_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setUserNameBytes(ByteString byteString) {
            byteString.getClass();
            AbstractC3403a.checkByteStringIsUtf8(byteString);
            this.userName_ = byteString.toStringUtf8();
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (C44521.f15961xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new LiveMedalChangedMsg();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                    return null;
                case 4:
                    return new Builder();
                case 5:
                    GeneratedMessageLite.InterfaceC3386h interfaceC3386h = (GeneratedMessageLite.InterfaceC3386h) obj;
                    LiveMedalChangedMsg liveMedalChangedMsg = (LiveMedalChangedMsg) obj2;
                    this.userID_ = interfaceC3386h.mo16997f(!this.userID_.isEmpty(), this.userID_, !liveMedalChangedMsg.userID_.isEmpty(), liveMedalChangedMsg.userID_);
                    this.roomID_ = interfaceC3386h.mo16997f(!this.roomID_.isEmpty(), this.roomID_, !liveMedalChangedMsg.roomID_.isEmpty(), liveMedalChangedMsg.roomID_);
                    this.liveID_ = interfaceC3386h.mo16997f(!this.liveID_.isEmpty(), this.liveID_, !liveMedalChangedMsg.liveID_.isEmpty(), liveMedalChangedMsg.liveID_);
                    this.medalID_ = interfaceC3386h.mo16997f(!this.medalID_.isEmpty(), this.medalID_, !liveMedalChangedMsg.medalID_.isEmpty(), liveMedalChangedMsg.medalID_);
                    this.userName_ = interfaceC3386h.mo16997f(!this.userName_.isEmpty(), this.userName_, true ^ liveMedalChangedMsg.userName_.isEmpty(), liveMedalChangedMsg.userName_);
                    this.template_ = (Template.TemplateData) interfaceC3386h.mo17006o(this.template_, liveMedalChangedMsg.template_);
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
                                    this.userID_ = c3407e.m17115L();
                                } else if (iM17116M == 18) {
                                    this.roomID_ = c3407e.m17115L();
                                } else if (iM17116M == 26) {
                                    this.liveID_ = c3407e.m17115L();
                                } else if (iM17116M == 34) {
                                    this.medalID_ = c3407e.m17115L();
                                } else if (iM17116M == 42) {
                                    this.userName_ = c3407e.m17115L();
                                } else if (iM17116M == 50) {
                                    Template.TemplateData templateData = this.template_;
                                    Template.TemplateData.Builder builder = templateData != null ? templateData.toBuilder() : null;
                                    Template.TemplateData templateData2 = (Template.TemplateData) c3407e.m17143w(Template.TemplateData.parser(), c3410h);
                                    this.template_ = templateData2;
                                    if (builder != null) {
                                        builder.mergeFrom(templateData2);
                                        this.template_ = builder.buildPartial();
                                    }
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
                        synchronized (LiveMedalChangedMsg.class) {
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

        @Override // com.p1.mobile.longlink.msg.livemedal.LongLinkMedalMessage.LiveMedalChangedMsgOrBuilder
        public String getLiveID() {
            return this.liveID_;
        }

        @Override // com.p1.mobile.longlink.msg.livemedal.LongLinkMedalMessage.LiveMedalChangedMsgOrBuilder
        public ByteString getLiveIDBytes() {
            return ByteString.copyFromUtf8(this.liveID_);
        }

        @Override // com.p1.mobile.longlink.msg.livemedal.LongLinkMedalMessage.LiveMedalChangedMsgOrBuilder
        public String getMedalID() {
            return this.medalID_;
        }

        @Override // com.p1.mobile.longlink.msg.livemedal.LongLinkMedalMessage.LiveMedalChangedMsgOrBuilder
        public ByteString getMedalIDBytes() {
            return ByteString.copyFromUtf8(this.medalID_);
        }

        @Override // com.p1.mobile.longlink.msg.livemedal.LongLinkMedalMessage.LiveMedalChangedMsgOrBuilder
        public String getRoomID() {
            return this.roomID_;
        }

        @Override // com.p1.mobile.longlink.msg.livemedal.LongLinkMedalMessage.LiveMedalChangedMsgOrBuilder
        public ByteString getRoomIDBytes() {
            return ByteString.copyFromUtf8(this.roomID_);
        }

        @Override // com.google.protobuf.InterfaceC3419q
        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int iM16901K = !this.userID_.isEmpty() ? CodedOutputStream.m16901K(1, getUserID()) : 0;
            if (!this.roomID_.isEmpty()) {
                iM16901K += CodedOutputStream.m16901K(2, getRoomID());
            }
            if (!this.liveID_.isEmpty()) {
                iM16901K += CodedOutputStream.m16901K(3, getLiveID());
            }
            if (!this.medalID_.isEmpty()) {
                iM16901K += CodedOutputStream.m16901K(4, getMedalID());
            }
            if (!this.userName_.isEmpty()) {
                iM16901K += CodedOutputStream.m16901K(5, getUserName());
            }
            if (this.template_ != null) {
                iM16901K += CodedOutputStream.m16893C(6, getTemplate());
            }
            this.memoizedSerializedSize = iM16901K;
            return iM16901K;
        }

        @Override // com.p1.mobile.longlink.msg.livemedal.LongLinkMedalMessage.LiveMedalChangedMsgOrBuilder
        public Template.TemplateData getTemplate() {
            Template.TemplateData templateData = this.template_;
            return templateData == null ? Template.TemplateData.getDefaultInstance() : templateData;
        }

        @Override // com.p1.mobile.longlink.msg.livemedal.LongLinkMedalMessage.LiveMedalChangedMsgOrBuilder
        public String getUserID() {
            return this.userID_;
        }

        @Override // com.p1.mobile.longlink.msg.livemedal.LongLinkMedalMessage.LiveMedalChangedMsgOrBuilder
        public ByteString getUserIDBytes() {
            return ByteString.copyFromUtf8(this.userID_);
        }

        @Override // com.p1.mobile.longlink.msg.livemedal.LongLinkMedalMessage.LiveMedalChangedMsgOrBuilder
        public String getUserName() {
            return this.userName_;
        }

        @Override // com.p1.mobile.longlink.msg.livemedal.LongLinkMedalMessage.LiveMedalChangedMsgOrBuilder
        public ByteString getUserNameBytes() {
            return ByteString.copyFromUtf8(this.userName_);
        }

        @Override // com.p1.mobile.longlink.msg.livemedal.LongLinkMedalMessage.LiveMedalChangedMsgOrBuilder
        public boolean hasTemplate() {
            return this.template_ != null;
        }

        @Override // com.google.protobuf.InterfaceC3419q
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (!this.userID_.isEmpty()) {
                codedOutputStream.mo16939D0(1, getUserID());
            }
            if (!this.roomID_.isEmpty()) {
                codedOutputStream.mo16939D0(2, getRoomID());
            }
            if (!this.liveID_.isEmpty()) {
                codedOutputStream.mo16939D0(3, getLiveID());
            }
            if (!this.medalID_.isEmpty()) {
                codedOutputStream.mo16939D0(4, getMedalID());
            }
            if (!this.userName_.isEmpty()) {
                codedOutputStream.mo16939D0(5, getUserName());
            }
            if (this.template_ != null) {
                codedOutputStream.mo16974w0(6, getTemplate());
            }
        }

        public static LiveMedalChangedMsg parseDelimitedFrom(InputStream inputStream, C3410h c3410h) throws IOException {
            return (LiveMedalChangedMsg) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, c3410h);
        }

        public static LiveMedalChangedMsg parseFrom(ByteString byteString, C3410h c3410h) throws InvalidProtocolBufferException {
            return (LiveMedalChangedMsg) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, c3410h);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTemplate(Template.TemplateData templateData) {
            templateData.getClass();
            this.template_ = templateData;
        }

        public static final class Builder extends GeneratedMessageLite.AbstractC3380b<LiveMedalChangedMsg, Builder> implements LiveMedalChangedMsgOrBuilder {
            private Builder() {
                super(LiveMedalChangedMsg.DEFAULT_INSTANCE);
            }

            public Builder clearLiveID() {
                copyOnWrite();
                ((LiveMedalChangedMsg) this.instance).clearLiveID();
                return this;
            }

            public Builder clearMedalID() {
                copyOnWrite();
                ((LiveMedalChangedMsg) this.instance).clearMedalID();
                return this;
            }

            public Builder clearRoomID() {
                copyOnWrite();
                ((LiveMedalChangedMsg) this.instance).clearRoomID();
                return this;
            }

            public Builder clearTemplate() {
                copyOnWrite();
                ((LiveMedalChangedMsg) this.instance).clearTemplate();
                return this;
            }

            public Builder clearUserID() {
                copyOnWrite();
                ((LiveMedalChangedMsg) this.instance).clearUserID();
                return this;
            }

            public Builder clearUserName() {
                copyOnWrite();
                ((LiveMedalChangedMsg) this.instance).clearUserName();
                return this;
            }

            @Override // com.p1.mobile.longlink.msg.livemedal.LongLinkMedalMessage.LiveMedalChangedMsgOrBuilder
            public String getLiveID() {
                return ((LiveMedalChangedMsg) this.instance).getLiveID();
            }

            @Override // com.p1.mobile.longlink.msg.livemedal.LongLinkMedalMessage.LiveMedalChangedMsgOrBuilder
            public ByteString getLiveIDBytes() {
                return ((LiveMedalChangedMsg) this.instance).getLiveIDBytes();
            }

            @Override // com.p1.mobile.longlink.msg.livemedal.LongLinkMedalMessage.LiveMedalChangedMsgOrBuilder
            public String getMedalID() {
                return ((LiveMedalChangedMsg) this.instance).getMedalID();
            }

            @Override // com.p1.mobile.longlink.msg.livemedal.LongLinkMedalMessage.LiveMedalChangedMsgOrBuilder
            public ByteString getMedalIDBytes() {
                return ((LiveMedalChangedMsg) this.instance).getMedalIDBytes();
            }

            @Override // com.p1.mobile.longlink.msg.livemedal.LongLinkMedalMessage.LiveMedalChangedMsgOrBuilder
            public String getRoomID() {
                return ((LiveMedalChangedMsg) this.instance).getRoomID();
            }

            @Override // com.p1.mobile.longlink.msg.livemedal.LongLinkMedalMessage.LiveMedalChangedMsgOrBuilder
            public ByteString getRoomIDBytes() {
                return ((LiveMedalChangedMsg) this.instance).getRoomIDBytes();
            }

            @Override // com.p1.mobile.longlink.msg.livemedal.LongLinkMedalMessage.LiveMedalChangedMsgOrBuilder
            public Template.TemplateData getTemplate() {
                return ((LiveMedalChangedMsg) this.instance).getTemplate();
            }

            @Override // com.p1.mobile.longlink.msg.livemedal.LongLinkMedalMessage.LiveMedalChangedMsgOrBuilder
            public String getUserID() {
                return ((LiveMedalChangedMsg) this.instance).getUserID();
            }

            @Override // com.p1.mobile.longlink.msg.livemedal.LongLinkMedalMessage.LiveMedalChangedMsgOrBuilder
            public ByteString getUserIDBytes() {
                return ((LiveMedalChangedMsg) this.instance).getUserIDBytes();
            }

            @Override // com.p1.mobile.longlink.msg.livemedal.LongLinkMedalMessage.LiveMedalChangedMsgOrBuilder
            public String getUserName() {
                return ((LiveMedalChangedMsg) this.instance).getUserName();
            }

            @Override // com.p1.mobile.longlink.msg.livemedal.LongLinkMedalMessage.LiveMedalChangedMsgOrBuilder
            public ByteString getUserNameBytes() {
                return ((LiveMedalChangedMsg) this.instance).getUserNameBytes();
            }

            @Override // com.p1.mobile.longlink.msg.livemedal.LongLinkMedalMessage.LiveMedalChangedMsgOrBuilder
            public boolean hasTemplate() {
                return ((LiveMedalChangedMsg) this.instance).hasTemplate();
            }

            public Builder mergeTemplate(Template.TemplateData templateData) {
                copyOnWrite();
                ((LiveMedalChangedMsg) this.instance).mergeTemplate(templateData);
                return this;
            }

            public Builder setLiveID(String str) {
                copyOnWrite();
                ((LiveMedalChangedMsg) this.instance).setLiveID(str);
                return this;
            }

            public Builder setLiveIDBytes(ByteString byteString) {
                copyOnWrite();
                ((LiveMedalChangedMsg) this.instance).setLiveIDBytes(byteString);
                return this;
            }

            public Builder setMedalID(String str) {
                copyOnWrite();
                ((LiveMedalChangedMsg) this.instance).setMedalID(str);
                return this;
            }

            public Builder setMedalIDBytes(ByteString byteString) {
                copyOnWrite();
                ((LiveMedalChangedMsg) this.instance).setMedalIDBytes(byteString);
                return this;
            }

            public Builder setRoomID(String str) {
                copyOnWrite();
                ((LiveMedalChangedMsg) this.instance).setRoomID(str);
                return this;
            }

            public Builder setRoomIDBytes(ByteString byteString) {
                copyOnWrite();
                ((LiveMedalChangedMsg) this.instance).setRoomIDBytes(byteString);
                return this;
            }

            public Builder setTemplate(Template.TemplateData templateData) {
                copyOnWrite();
                ((LiveMedalChangedMsg) this.instance).setTemplate(templateData);
                return this;
            }

            public Builder setUserID(String str) {
                copyOnWrite();
                ((LiveMedalChangedMsg) this.instance).setUserID(str);
                return this;
            }

            public Builder setUserIDBytes(ByteString byteString) {
                copyOnWrite();
                ((LiveMedalChangedMsg) this.instance).setUserIDBytes(byteString);
                return this;
            }

            public Builder setUserName(String str) {
                copyOnWrite();
                ((LiveMedalChangedMsg) this.instance).setUserName(str);
                return this;
            }

            public Builder setUserNameBytes(ByteString byteString) {
                copyOnWrite();
                ((LiveMedalChangedMsg) this.instance).setUserNameBytes(byteString);
                return this;
            }

            public Builder setTemplate(Template.TemplateData.Builder builder) {
                copyOnWrite();
                ((LiveMedalChangedMsg) this.instance).setTemplate(builder);
                return this;
            }
        }

        public static LiveMedalChangedMsg parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (LiveMedalChangedMsg) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static LiveMedalChangedMsg parseFrom(byte[] bArr, C3410h c3410h) throws InvalidProtocolBufferException {
            return (LiveMedalChangedMsg) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, c3410h);
        }

        public static LiveMedalChangedMsg parseFrom(InputStream inputStream) throws IOException {
            return (LiveMedalChangedMsg) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static LiveMedalChangedMsg parseFrom(InputStream inputStream, C3410h c3410h) throws IOException {
            return (LiveMedalChangedMsg) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, c3410h);
        }

        public static LiveMedalChangedMsg parseFrom(C3407e c3407e) throws IOException {
            return (LiveMedalChangedMsg) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, c3407e);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static LiveMedalChangedMsg parseFrom(C3407e c3407e, C3410h c3410h) throws IOException {
            return (LiveMedalChangedMsg) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, c3407e, c3410h);
        }
    }

    public static final class TurboCardReceiveEvent extends GeneratedMessageLite<TurboCardReceiveEvent, Builder> implements TurboCardReceiveEventOrBuilder {
        private static final TurboCardReceiveEvent DEFAULT_INSTANCE;
        public static final int ICON_FIELD_NUMBER = 4;
        public static final int NAME_FIELD_NUMBER = 2;
        public static final int NUMS_FIELD_NUMBER = 3;
        private static volatile i860<TurboCardReceiveEvent> PARSER = null;
        public static final int TYPE_FIELD_NUMBER = 1;
        public static final int URL_FIELD_NUMBER = 5;
        private long nums_;
        private int type_;
        private String name_ = "";
        private String icon_ = "";
        private String url_ = "";

        public static final class Builder extends GeneratedMessageLite.AbstractC3380b<TurboCardReceiveEvent, Builder> implements TurboCardReceiveEventOrBuilder {
            private Builder() {
                super(TurboCardReceiveEvent.DEFAULT_INSTANCE);
            }

            public Builder clearIcon() {
                copyOnWrite();
                ((TurboCardReceiveEvent) this.instance).clearIcon();
                return this;
            }

            public Builder clearName() {
                copyOnWrite();
                ((TurboCardReceiveEvent) this.instance).clearName();
                return this;
            }

            public Builder clearNums() {
                copyOnWrite();
                ((TurboCardReceiveEvent) this.instance).clearNums();
                return this;
            }

            public Builder clearType() {
                copyOnWrite();
                ((TurboCardReceiveEvent) this.instance).clearType();
                return this;
            }

            public Builder clearUrl() {
                copyOnWrite();
                ((TurboCardReceiveEvent) this.instance).clearUrl();
                return this;
            }

            @Override // com.p1.mobile.longlink.msg.livemedal.LongLinkMedalMessage.TurboCardReceiveEventOrBuilder
            public String getIcon() {
                return ((TurboCardReceiveEvent) this.instance).getIcon();
            }

            @Override // com.p1.mobile.longlink.msg.livemedal.LongLinkMedalMessage.TurboCardReceiveEventOrBuilder
            public ByteString getIconBytes() {
                return ((TurboCardReceiveEvent) this.instance).getIconBytes();
            }

            @Override // com.p1.mobile.longlink.msg.livemedal.LongLinkMedalMessage.TurboCardReceiveEventOrBuilder
            public String getName() {
                return ((TurboCardReceiveEvent) this.instance).getName();
            }

            @Override // com.p1.mobile.longlink.msg.livemedal.LongLinkMedalMessage.TurboCardReceiveEventOrBuilder
            public ByteString getNameBytes() {
                return ((TurboCardReceiveEvent) this.instance).getNameBytes();
            }

            @Override // com.p1.mobile.longlink.msg.livemedal.LongLinkMedalMessage.TurboCardReceiveEventOrBuilder
            public long getNums() {
                return ((TurboCardReceiveEvent) this.instance).getNums();
            }

            @Override // com.p1.mobile.longlink.msg.livemedal.LongLinkMedalMessage.TurboCardReceiveEventOrBuilder
            public CardTypeEnum getType() {
                return ((TurboCardReceiveEvent) this.instance).getType();
            }

            @Override // com.p1.mobile.longlink.msg.livemedal.LongLinkMedalMessage.TurboCardReceiveEventOrBuilder
            public int getTypeValue() {
                return ((TurboCardReceiveEvent) this.instance).getTypeValue();
            }

            @Override // com.p1.mobile.longlink.msg.livemedal.LongLinkMedalMessage.TurboCardReceiveEventOrBuilder
            public String getUrl() {
                return ((TurboCardReceiveEvent) this.instance).getUrl();
            }

            @Override // com.p1.mobile.longlink.msg.livemedal.LongLinkMedalMessage.TurboCardReceiveEventOrBuilder
            public ByteString getUrlBytes() {
                return ((TurboCardReceiveEvent) this.instance).getUrlBytes();
            }

            public Builder setIcon(String str) {
                copyOnWrite();
                ((TurboCardReceiveEvent) this.instance).setIcon(str);
                return this;
            }

            public Builder setIconBytes(ByteString byteString) {
                copyOnWrite();
                ((TurboCardReceiveEvent) this.instance).setIconBytes(byteString);
                return this;
            }

            public Builder setName(String str) {
                copyOnWrite();
                ((TurboCardReceiveEvent) this.instance).setName(str);
                return this;
            }

            public Builder setNameBytes(ByteString byteString) {
                copyOnWrite();
                ((TurboCardReceiveEvent) this.instance).setNameBytes(byteString);
                return this;
            }

            public Builder setNums(long j) {
                copyOnWrite();
                ((TurboCardReceiveEvent) this.instance).setNums(j);
                return this;
            }

            public Builder setType(CardTypeEnum cardTypeEnum) {
                copyOnWrite();
                ((TurboCardReceiveEvent) this.instance).setType(cardTypeEnum);
                return this;
            }

            public Builder setTypeValue(int i) {
                copyOnWrite();
                ((TurboCardReceiveEvent) this.instance).setTypeValue(i);
                return this;
            }

            public Builder setUrl(String str) {
                copyOnWrite();
                ((TurboCardReceiveEvent) this.instance).setUrl(str);
                return this;
            }

            public Builder setUrlBytes(ByteString byteString) {
                copyOnWrite();
                ((TurboCardReceiveEvent) this.instance).setUrlBytes(byteString);
                return this;
            }
        }

        static {
            TurboCardReceiveEvent turboCardReceiveEvent = new TurboCardReceiveEvent();
            DEFAULT_INSTANCE = turboCardReceiveEvent;
            turboCardReceiveEvent.makeImmutable();
        }

        private TurboCardReceiveEvent() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearIcon() {
            this.icon_ = getDefaultInstance().getIcon();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearName() {
            this.name_ = getDefaultInstance().getName();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearNums() {
            this.nums_ = 0L;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearType() {
            this.type_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearUrl() {
            this.url_ = getDefaultInstance().getUrl();
        }

        public static TurboCardReceiveEvent getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder(TurboCardReceiveEvent turboCardReceiveEvent) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(turboCardReceiveEvent);
        }

        public static TurboCardReceiveEvent parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (TurboCardReceiveEvent) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static TurboCardReceiveEvent parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (TurboCardReceiveEvent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static i860<TurboCardReceiveEvent> parser() {
            return DEFAULT_INSTANCE.getParserForType();
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
        public void setNums(long j) {
            this.nums_ = j;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setType(CardTypeEnum cardTypeEnum) {
            cardTypeEnum.getClass();
            this.type_ = cardTypeEnum.getNumber();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTypeValue(int i) {
            this.type_ = i;
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
            boolean z = false;
            switch (C44521.f15961xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new TurboCardReceiveEvent();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                    return null;
                case 4:
                    return new Builder();
                case 5:
                    GeneratedMessageLite.InterfaceC3386h interfaceC3386h = (GeneratedMessageLite.InterfaceC3386h) obj;
                    TurboCardReceiveEvent turboCardReceiveEvent = (TurboCardReceiveEvent) obj2;
                    int i = this.type_;
                    boolean z2 = i != 0;
                    int i2 = turboCardReceiveEvent.type_;
                    this.type_ = interfaceC3386h.mo16996e(z2, i, i2 != 0, i2);
                    this.name_ = interfaceC3386h.mo16997f(!this.name_.isEmpty(), this.name_, !turboCardReceiveEvent.name_.isEmpty(), turboCardReceiveEvent.name_);
                    long j = this.nums_;
                    boolean z3 = j != 0;
                    long j2 = turboCardReceiveEvent.nums_;
                    this.nums_ = interfaceC3386h.mo17000i(z3, j, j2 != 0, j2);
                    this.icon_ = interfaceC3386h.mo16997f(!this.icon_.isEmpty(), this.icon_, !turboCardReceiveEvent.icon_.isEmpty(), turboCardReceiveEvent.icon_);
                    this.url_ = interfaceC3386h.mo16997f(!this.url_.isEmpty(), this.url_, !turboCardReceiveEvent.url_.isEmpty(), turboCardReceiveEvent.url_);
                    GeneratedMessageLite.C3385g c3385g = GeneratedMessageLite.C3385g.INSTANCE;
                    return this;
                case 6:
                    C3407e c3407e = (C3407e) obj;
                    while (!z) {
                        try {
                            int iM17116M = c3407e.m17116M();
                            if (iM17116M != 0) {
                                if (iM17116M == 8) {
                                    this.type_ = c3407e.m17136p();
                                } else if (iM17116M == 18) {
                                    this.name_ = c3407e.m17115L();
                                } else if (iM17116M == 24) {
                                    this.nums_ = c3407e.m17142v();
                                } else if (iM17116M == 34) {
                                    this.icon_ = c3407e.m17115L();
                                } else if (iM17116M == 42) {
                                    this.url_ = c3407e.m17115L();
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
                        synchronized (TurboCardReceiveEvent.class) {
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

        @Override // com.p1.mobile.longlink.msg.livemedal.LongLinkMedalMessage.TurboCardReceiveEventOrBuilder
        public String getIcon() {
            return this.icon_;
        }

        @Override // com.p1.mobile.longlink.msg.livemedal.LongLinkMedalMessage.TurboCardReceiveEventOrBuilder
        public ByteString getIconBytes() {
            return ByteString.copyFromUtf8(this.icon_);
        }

        @Override // com.p1.mobile.longlink.msg.livemedal.LongLinkMedalMessage.TurboCardReceiveEventOrBuilder
        public String getName() {
            return this.name_;
        }

        @Override // com.p1.mobile.longlink.msg.livemedal.LongLinkMedalMessage.TurboCardReceiveEventOrBuilder
        public ByteString getNameBytes() {
            return ByteString.copyFromUtf8(this.name_);
        }

        @Override // com.p1.mobile.longlink.msg.livemedal.LongLinkMedalMessage.TurboCardReceiveEventOrBuilder
        public long getNums() {
            return this.nums_;
        }

        @Override // com.google.protobuf.InterfaceC3419q
        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int iM16922m = this.type_ != CardTypeEnum.SENIOR.getNumber() ? CodedOutputStream.m16922m(1, this.type_) : 0;
            if (!this.name_.isEmpty()) {
                iM16922m += CodedOutputStream.m16901K(2, getName());
            }
            long j = this.nums_;
            if (j != 0) {
                iM16922m += CodedOutputStream.m16931v(3, j);
            }
            if (!this.icon_.isEmpty()) {
                iM16922m += CodedOutputStream.m16901K(4, getIcon());
            }
            if (!this.url_.isEmpty()) {
                iM16922m += CodedOutputStream.m16901K(5, getUrl());
            }
            this.memoizedSerializedSize = iM16922m;
            return iM16922m;
        }

        @Override // com.p1.mobile.longlink.msg.livemedal.LongLinkMedalMessage.TurboCardReceiveEventOrBuilder
        public CardTypeEnum getType() {
            CardTypeEnum cardTypeEnumForNumber = CardTypeEnum.forNumber(this.type_);
            return cardTypeEnumForNumber == null ? CardTypeEnum.UNRECOGNIZED : cardTypeEnumForNumber;
        }

        @Override // com.p1.mobile.longlink.msg.livemedal.LongLinkMedalMessage.TurboCardReceiveEventOrBuilder
        public int getTypeValue() {
            return this.type_;
        }

        @Override // com.p1.mobile.longlink.msg.livemedal.LongLinkMedalMessage.TurboCardReceiveEventOrBuilder
        public String getUrl() {
            return this.url_;
        }

        @Override // com.p1.mobile.longlink.msg.livemedal.LongLinkMedalMessage.TurboCardReceiveEventOrBuilder
        public ByteString getUrlBytes() {
            return ByteString.copyFromUtf8(this.url_);
        }

        @Override // com.google.protobuf.InterfaceC3419q
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (this.type_ != CardTypeEnum.SENIOR.getNumber()) {
                codedOutputStream.m16960i0(1, this.type_);
            }
            if (!this.name_.isEmpty()) {
                codedOutputStream.mo16939D0(2, getName());
            }
            long j = this.nums_;
            if (j != 0) {
                codedOutputStream.m16972u0(3, j);
            }
            if (!this.icon_.isEmpty()) {
                codedOutputStream.mo16939D0(4, getIcon());
            }
            if (this.url_.isEmpty()) {
                return;
            }
            codedOutputStream.mo16939D0(5, getUrl());
        }

        public static TurboCardReceiveEvent parseDelimitedFrom(InputStream inputStream, C3410h c3410h) throws IOException {
            return (TurboCardReceiveEvent) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, c3410h);
        }

        public static TurboCardReceiveEvent parseFrom(ByteString byteString, C3410h c3410h) throws InvalidProtocolBufferException {
            return (TurboCardReceiveEvent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, c3410h);
        }

        public static TurboCardReceiveEvent parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (TurboCardReceiveEvent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static TurboCardReceiveEvent parseFrom(byte[] bArr, C3410h c3410h) throws InvalidProtocolBufferException {
            return (TurboCardReceiveEvent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, c3410h);
        }

        public static TurboCardReceiveEvent parseFrom(InputStream inputStream) throws IOException {
            return (TurboCardReceiveEvent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static TurboCardReceiveEvent parseFrom(InputStream inputStream, C3410h c3410h) throws IOException {
            return (TurboCardReceiveEvent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, c3410h);
        }

        public static TurboCardReceiveEvent parseFrom(C3407e c3407e) throws IOException {
            return (TurboCardReceiveEvent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, c3407e);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static TurboCardReceiveEvent parseFrom(C3407e c3407e, C3410h c3410h) throws IOException {
            return (TurboCardReceiveEvent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, c3407e, c3410h);
        }
    }

    public static final class TurboCardResultNotice extends GeneratedMessageLite<TurboCardResultNotice, Builder> implements TurboCardResultNoticeOrBuilder {
        private static final TurboCardResultNotice DEFAULT_INSTANCE;
        private static volatile i860<TurboCardResultNotice> PARSER = null;
        public static final int ROOMID_FIELD_NUMBER = 1;
        public static final int TOTALAUDIENCE_FIELD_NUMBER = 2;
        public static final int TYPE_FIELD_NUMBER = 3;
        private String roomId_ = "";
        private long totalAudience_;
        private int type_;

        public static final class Builder extends GeneratedMessageLite.AbstractC3380b<TurboCardResultNotice, Builder> implements TurboCardResultNoticeOrBuilder {
            private Builder() {
                super(TurboCardResultNotice.DEFAULT_INSTANCE);
            }

            public Builder clearRoomId() {
                copyOnWrite();
                ((TurboCardResultNotice) this.instance).clearRoomId();
                return this;
            }

            public Builder clearTotalAudience() {
                copyOnWrite();
                ((TurboCardResultNotice) this.instance).clearTotalAudience();
                return this;
            }

            public Builder clearType() {
                copyOnWrite();
                ((TurboCardResultNotice) this.instance).clearType();
                return this;
            }

            @Override // com.p1.mobile.longlink.msg.livemedal.LongLinkMedalMessage.TurboCardResultNoticeOrBuilder
            public String getRoomId() {
                return ((TurboCardResultNotice) this.instance).getRoomId();
            }

            @Override // com.p1.mobile.longlink.msg.livemedal.LongLinkMedalMessage.TurboCardResultNoticeOrBuilder
            public ByteString getRoomIdBytes() {
                return ((TurboCardResultNotice) this.instance).getRoomIdBytes();
            }

            @Override // com.p1.mobile.longlink.msg.livemedal.LongLinkMedalMessage.TurboCardResultNoticeOrBuilder
            public long getTotalAudience() {
                return ((TurboCardResultNotice) this.instance).getTotalAudience();
            }

            @Override // com.p1.mobile.longlink.msg.livemedal.LongLinkMedalMessage.TurboCardResultNoticeOrBuilder
            public CardTypeEnum getType() {
                return ((TurboCardResultNotice) this.instance).getType();
            }

            @Override // com.p1.mobile.longlink.msg.livemedal.LongLinkMedalMessage.TurboCardResultNoticeOrBuilder
            public int getTypeValue() {
                return ((TurboCardResultNotice) this.instance).getTypeValue();
            }

            public Builder setRoomId(String str) {
                copyOnWrite();
                ((TurboCardResultNotice) this.instance).setRoomId(str);
                return this;
            }

            public Builder setRoomIdBytes(ByteString byteString) {
                copyOnWrite();
                ((TurboCardResultNotice) this.instance).setRoomIdBytes(byteString);
                return this;
            }

            public Builder setTotalAudience(long j) {
                copyOnWrite();
                ((TurboCardResultNotice) this.instance).setTotalAudience(j);
                return this;
            }

            public Builder setType(CardTypeEnum cardTypeEnum) {
                copyOnWrite();
                ((TurboCardResultNotice) this.instance).setType(cardTypeEnum);
                return this;
            }

            public Builder setTypeValue(int i) {
                copyOnWrite();
                ((TurboCardResultNotice) this.instance).setTypeValue(i);
                return this;
            }
        }

        static {
            TurboCardResultNotice turboCardResultNotice = new TurboCardResultNotice();
            DEFAULT_INSTANCE = turboCardResultNotice;
            turboCardResultNotice.makeImmutable();
        }

        private TurboCardResultNotice() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearRoomId() {
            this.roomId_ = getDefaultInstance().getRoomId();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearTotalAudience() {
            this.totalAudience_ = 0L;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearType() {
            this.type_ = 0;
        }

        public static TurboCardResultNotice getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder(TurboCardResultNotice turboCardResultNotice) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(turboCardResultNotice);
        }

        public static TurboCardResultNotice parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (TurboCardResultNotice) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static TurboCardResultNotice parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (TurboCardResultNotice) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static i860<TurboCardResultNotice> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setRoomId(String str) {
            str.getClass();
            this.roomId_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setRoomIdBytes(ByteString byteString) {
            byteString.getClass();
            AbstractC3403a.checkByteStringIsUtf8(byteString);
            this.roomId_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTotalAudience(long j) {
            this.totalAudience_ = j;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setType(CardTypeEnum cardTypeEnum) {
            cardTypeEnum.getClass();
            this.type_ = cardTypeEnum.getNumber();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTypeValue(int i) {
            this.type_ = i;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            boolean z = false;
            switch (C44521.f15961xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new TurboCardResultNotice();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                    return null;
                case 4:
                    return new Builder();
                case 5:
                    GeneratedMessageLite.InterfaceC3386h interfaceC3386h = (GeneratedMessageLite.InterfaceC3386h) obj;
                    TurboCardResultNotice turboCardResultNotice = (TurboCardResultNotice) obj2;
                    this.roomId_ = interfaceC3386h.mo16997f(!this.roomId_.isEmpty(), this.roomId_, !turboCardResultNotice.roomId_.isEmpty(), turboCardResultNotice.roomId_);
                    long j = this.totalAudience_;
                    boolean z2 = j != 0;
                    long j2 = turboCardResultNotice.totalAudience_;
                    this.totalAudience_ = interfaceC3386h.mo17000i(z2, j, j2 != 0, j2);
                    int i = this.type_;
                    boolean z3 = i != 0;
                    int i2 = turboCardResultNotice.type_;
                    this.type_ = interfaceC3386h.mo16996e(z3, i, i2 != 0, i2);
                    GeneratedMessageLite.C3385g c3385g = GeneratedMessageLite.C3385g.INSTANCE;
                    return this;
                case 6:
                    C3407e c3407e = (C3407e) obj;
                    while (!z) {
                        try {
                            int iM17116M = c3407e.m17116M();
                            if (iM17116M != 0) {
                                if (iM17116M == 10) {
                                    this.roomId_ = c3407e.m17115L();
                                } else if (iM17116M == 16) {
                                    this.totalAudience_ = c3407e.m17142v();
                                } else if (iM17116M == 24) {
                                    this.type_ = c3407e.m17136p();
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
                        synchronized (TurboCardResultNotice.class) {
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

        @Override // com.p1.mobile.longlink.msg.livemedal.LongLinkMedalMessage.TurboCardResultNoticeOrBuilder
        public String getRoomId() {
            return this.roomId_;
        }

        @Override // com.p1.mobile.longlink.msg.livemedal.LongLinkMedalMessage.TurboCardResultNoticeOrBuilder
        public ByteString getRoomIdBytes() {
            return ByteString.copyFromUtf8(this.roomId_);
        }

        @Override // com.google.protobuf.InterfaceC3419q
        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int iM16901K = !this.roomId_.isEmpty() ? CodedOutputStream.m16901K(1, getRoomId()) : 0;
            long j = this.totalAudience_;
            if (j != 0) {
                iM16901K += CodedOutputStream.m16931v(2, j);
            }
            if (this.type_ != CardTypeEnum.SENIOR.getNumber()) {
                iM16901K += CodedOutputStream.m16922m(3, this.type_);
            }
            this.memoizedSerializedSize = iM16901K;
            return iM16901K;
        }

        @Override // com.p1.mobile.longlink.msg.livemedal.LongLinkMedalMessage.TurboCardResultNoticeOrBuilder
        public long getTotalAudience() {
            return this.totalAudience_;
        }

        @Override // com.p1.mobile.longlink.msg.livemedal.LongLinkMedalMessage.TurboCardResultNoticeOrBuilder
        public CardTypeEnum getType() {
            CardTypeEnum cardTypeEnumForNumber = CardTypeEnum.forNumber(this.type_);
            return cardTypeEnumForNumber == null ? CardTypeEnum.UNRECOGNIZED : cardTypeEnumForNumber;
        }

        @Override // com.p1.mobile.longlink.msg.livemedal.LongLinkMedalMessage.TurboCardResultNoticeOrBuilder
        public int getTypeValue() {
            return this.type_;
        }

        @Override // com.google.protobuf.InterfaceC3419q
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (!this.roomId_.isEmpty()) {
                codedOutputStream.mo16939D0(1, getRoomId());
            }
            long j = this.totalAudience_;
            if (j != 0) {
                codedOutputStream.m16972u0(2, j);
            }
            if (this.type_ != CardTypeEnum.SENIOR.getNumber()) {
                codedOutputStream.m16960i0(3, this.type_);
            }
        }

        public static TurboCardResultNotice parseDelimitedFrom(InputStream inputStream, C3410h c3410h) throws IOException {
            return (TurboCardResultNotice) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, c3410h);
        }

        public static TurboCardResultNotice parseFrom(ByteString byteString, C3410h c3410h) throws InvalidProtocolBufferException {
            return (TurboCardResultNotice) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, c3410h);
        }

        public static TurboCardResultNotice parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (TurboCardResultNotice) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static TurboCardResultNotice parseFrom(byte[] bArr, C3410h c3410h) throws InvalidProtocolBufferException {
            return (TurboCardResultNotice) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, c3410h);
        }

        public static TurboCardResultNotice parseFrom(InputStream inputStream) throws IOException {
            return (TurboCardResultNotice) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static TurboCardResultNotice parseFrom(InputStream inputStream, C3410h c3410h) throws IOException {
            return (TurboCardResultNotice) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, c3410h);
        }

        public static TurboCardResultNotice parseFrom(C3407e c3407e) throws IOException {
            return (TurboCardResultNotice) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, c3407e);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static TurboCardResultNotice parseFrom(C3407e c3407e, C3410h c3410h) throws IOException {
            return (TurboCardResultNotice) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, c3407e, c3410h);
        }
    }
}
