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
public final class LongLinkFixedRoomMessage {

    /* JADX INFO: renamed from: com.p1.mobile.longlink.msg.connector.LongLinkFixedRoomMessage$1 */
    public static /* synthetic */ class C43981 {

        /* JADX INFO: renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f15931xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f15931xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f15931xa1df5c61[GeneratedMessageLite.MethodToInvoke.IS_INITIALIZED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f15931xa1df5c61[GeneratedMessageLite.MethodToInvoke.MAKE_IMMUTABLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f15931xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f15931xa1df5c61[GeneratedMessageLite.MethodToInvoke.VISIT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f15931xa1df5c61[GeneratedMessageLite.MethodToInvoke.MERGE_FROM_STREAM.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f15931xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f15931xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    public interface LiveFixedRoomChatCellChatInfoOrBuilder extends o6z {
        String getCurrentMsg();

        ByteString getCurrentMsgBytes();

        String getCurrentSenderName();

        ByteString getCurrentSenderNameBytes();

        long getCurrentSeq();

        long getCurrentTime();

        @Override // p149l.o6z
        /* synthetic */ InterfaceC3419q getDefaultInstanceForType();

        long getUnreadedCount();

        @Override // p149l.o6z
        /* synthetic */ boolean isInitialized();
    }

    public interface LiveFixedRoomChatCellInfoOrBuilder extends o6z {
        @Override // p149l.o6z
        /* synthetic */ InterfaceC3419q getDefaultInstanceForType();

        String getDissolveReason();

        ByteString getDissolveReasonBytes();

        boolean getIsDissolved();

        boolean getIsOnTop();

        boolean getIsRemind();

        boolean getIsRemoved();

        boolean getIsShow();

        @Override // p149l.o6z
        /* synthetic */ boolean isInitialized();
    }

    public interface LiveFixedRoomChatCellOrBuilder extends o6z {
        LiveFixedRoomChatCellInfo getCellInfo();

        LiveFixedRoomChatCellChatInfo getChatInfo();

        @Override // p149l.o6z
        /* synthetic */ InterfaceC3419q getDefaultInstanceForType();

        LiveFixedRoomChatCellRoomInfo getRoomInfo();

        boolean hasCellInfo();

        boolean hasChatInfo();

        boolean hasRoomInfo();

        @Override // p149l.o6z
        /* synthetic */ boolean isInitialized();
    }

    public interface LiveFixedRoomChatCellRoomInfoOrBuilder extends o6z {
        String getAvatars(int i);

        ByteString getAvatarsBytes(int i);

        int getAvatarsCount();

        List<String> getAvatarsList();

        @Override // p149l.o6z
        /* synthetic */ InterfaceC3419q getDefaultInstanceForType();

        String getLiveId();

        ByteString getLiveIdBytes();

        long getMemberCount();

        String getRoomId();

        ByteString getRoomIdBytes();

        String getTitle();

        ByteString getTitleBytes();

        @Override // p149l.o6z
        /* synthetic */ boolean isInitialized();
    }

    private LongLinkFixedRoomMessage() {
    }

    public static void registerAllExtensions(C3410h c3410h) {
    }

    public static final class LiveFixedRoomChatCell extends GeneratedMessageLite<LiveFixedRoomChatCell, Builder> implements LiveFixedRoomChatCellOrBuilder {
        public static final int CELLINFO_FIELD_NUMBER = 1;
        public static final int CHATINFO_FIELD_NUMBER = 3;
        private static final LiveFixedRoomChatCell DEFAULT_INSTANCE;
        private static volatile i860<LiveFixedRoomChatCell> PARSER = null;
        public static final int ROOMINFO_FIELD_NUMBER = 2;
        private LiveFixedRoomChatCellInfo cellInfo_;
        private LiveFixedRoomChatCellChatInfo chatInfo_;
        private LiveFixedRoomChatCellRoomInfo roomInfo_;

        static {
            LiveFixedRoomChatCell liveFixedRoomChatCell = new LiveFixedRoomChatCell();
            DEFAULT_INSTANCE = liveFixedRoomChatCell;
            liveFixedRoomChatCell.makeImmutable();
        }

        private LiveFixedRoomChatCell() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearCellInfo() {
            this.cellInfo_ = null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearChatInfo() {
            this.chatInfo_ = null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearRoomInfo() {
            this.roomInfo_ = null;
        }

        public static LiveFixedRoomChatCell getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeCellInfo(LiveFixedRoomChatCellInfo liveFixedRoomChatCellInfo) {
            LiveFixedRoomChatCellInfo liveFixedRoomChatCellInfo2 = this.cellInfo_;
            if (liveFixedRoomChatCellInfo2 == null || liveFixedRoomChatCellInfo2 == LiveFixedRoomChatCellInfo.getDefaultInstance()) {
                this.cellInfo_ = liveFixedRoomChatCellInfo;
            } else {
                this.cellInfo_ = LiveFixedRoomChatCellInfo.newBuilder(this.cellInfo_).mergeFrom(liveFixedRoomChatCellInfo).buildPartial();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeChatInfo(LiveFixedRoomChatCellChatInfo liveFixedRoomChatCellChatInfo) {
            LiveFixedRoomChatCellChatInfo liveFixedRoomChatCellChatInfo2 = this.chatInfo_;
            if (liveFixedRoomChatCellChatInfo2 == null || liveFixedRoomChatCellChatInfo2 == LiveFixedRoomChatCellChatInfo.getDefaultInstance()) {
                this.chatInfo_ = liveFixedRoomChatCellChatInfo;
            } else {
                this.chatInfo_ = LiveFixedRoomChatCellChatInfo.newBuilder(this.chatInfo_).mergeFrom(liveFixedRoomChatCellChatInfo).buildPartial();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeRoomInfo(LiveFixedRoomChatCellRoomInfo liveFixedRoomChatCellRoomInfo) {
            LiveFixedRoomChatCellRoomInfo liveFixedRoomChatCellRoomInfo2 = this.roomInfo_;
            if (liveFixedRoomChatCellRoomInfo2 == null || liveFixedRoomChatCellRoomInfo2 == LiveFixedRoomChatCellRoomInfo.getDefaultInstance()) {
                this.roomInfo_ = liveFixedRoomChatCellRoomInfo;
            } else {
                this.roomInfo_ = LiveFixedRoomChatCellRoomInfo.newBuilder(this.roomInfo_).mergeFrom(liveFixedRoomChatCellRoomInfo).buildPartial();
            }
        }

        public static Builder newBuilder(LiveFixedRoomChatCell liveFixedRoomChatCell) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(liveFixedRoomChatCell);
        }

        public static LiveFixedRoomChatCell parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (LiveFixedRoomChatCell) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static LiveFixedRoomChatCell parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (LiveFixedRoomChatCell) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static i860<LiveFixedRoomChatCell> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setCellInfo(LiveFixedRoomChatCellInfo.Builder builder) {
            this.cellInfo_ = builder.build();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setChatInfo(LiveFixedRoomChatCellChatInfo.Builder builder) {
            this.chatInfo_ = builder.build();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setRoomInfo(LiveFixedRoomChatCellRoomInfo.Builder builder) {
            this.roomInfo_ = builder.build();
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (C43981.f15931xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new LiveFixedRoomChatCell();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                    return null;
                case 4:
                    return new Builder();
                case 5:
                    GeneratedMessageLite.InterfaceC3386h interfaceC3386h = (GeneratedMessageLite.InterfaceC3386h) obj;
                    LiveFixedRoomChatCell liveFixedRoomChatCell = (LiveFixedRoomChatCell) obj2;
                    this.cellInfo_ = (LiveFixedRoomChatCellInfo) interfaceC3386h.mo17006o(this.cellInfo_, liveFixedRoomChatCell.cellInfo_);
                    this.roomInfo_ = (LiveFixedRoomChatCellRoomInfo) interfaceC3386h.mo17006o(this.roomInfo_, liveFixedRoomChatCell.roomInfo_);
                    this.chatInfo_ = (LiveFixedRoomChatCellChatInfo) interfaceC3386h.mo17006o(this.chatInfo_, liveFixedRoomChatCell.chatInfo_);
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
                                    LiveFixedRoomChatCellInfo liveFixedRoomChatCellInfo = this.cellInfo_;
                                    LiveFixedRoomChatCellInfo.Builder builder = liveFixedRoomChatCellInfo != null ? liveFixedRoomChatCellInfo.toBuilder() : null;
                                    LiveFixedRoomChatCellInfo liveFixedRoomChatCellInfo2 = (LiveFixedRoomChatCellInfo) c3407e.m17143w(LiveFixedRoomChatCellInfo.parser(), c3410h);
                                    this.cellInfo_ = liveFixedRoomChatCellInfo2;
                                    if (builder != null) {
                                        builder.mergeFrom(liveFixedRoomChatCellInfo2);
                                        this.cellInfo_ = builder.buildPartial();
                                    }
                                } else if (iM17116M == 18) {
                                    LiveFixedRoomChatCellRoomInfo liveFixedRoomChatCellRoomInfo = this.roomInfo_;
                                    LiveFixedRoomChatCellRoomInfo.Builder builder2 = liveFixedRoomChatCellRoomInfo != null ? liveFixedRoomChatCellRoomInfo.toBuilder() : null;
                                    LiveFixedRoomChatCellRoomInfo liveFixedRoomChatCellRoomInfo2 = (LiveFixedRoomChatCellRoomInfo) c3407e.m17143w(LiveFixedRoomChatCellRoomInfo.parser(), c3410h);
                                    this.roomInfo_ = liveFixedRoomChatCellRoomInfo2;
                                    if (builder2 != null) {
                                        builder2.mergeFrom(liveFixedRoomChatCellRoomInfo2);
                                        this.roomInfo_ = builder2.buildPartial();
                                    }
                                } else if (iM17116M == 26) {
                                    LiveFixedRoomChatCellChatInfo liveFixedRoomChatCellChatInfo = this.chatInfo_;
                                    LiveFixedRoomChatCellChatInfo.Builder builder3 = liveFixedRoomChatCellChatInfo != null ? liveFixedRoomChatCellChatInfo.toBuilder() : null;
                                    LiveFixedRoomChatCellChatInfo liveFixedRoomChatCellChatInfo2 = (LiveFixedRoomChatCellChatInfo) c3407e.m17143w(LiveFixedRoomChatCellChatInfo.parser(), c3410h);
                                    this.chatInfo_ = liveFixedRoomChatCellChatInfo2;
                                    if (builder3 != null) {
                                        builder3.mergeFrom(liveFixedRoomChatCellChatInfo2);
                                        this.chatInfo_ = builder3.buildPartial();
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
                        synchronized (LiveFixedRoomChatCell.class) {
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

        @Override // com.p1.mobile.longlink.msg.connector.LongLinkFixedRoomMessage.LiveFixedRoomChatCellOrBuilder
        public LiveFixedRoomChatCellInfo getCellInfo() {
            LiveFixedRoomChatCellInfo liveFixedRoomChatCellInfo = this.cellInfo_;
            return liveFixedRoomChatCellInfo == null ? LiveFixedRoomChatCellInfo.getDefaultInstance() : liveFixedRoomChatCellInfo;
        }

        @Override // com.p1.mobile.longlink.msg.connector.LongLinkFixedRoomMessage.LiveFixedRoomChatCellOrBuilder
        public LiveFixedRoomChatCellChatInfo getChatInfo() {
            LiveFixedRoomChatCellChatInfo liveFixedRoomChatCellChatInfo = this.chatInfo_;
            return liveFixedRoomChatCellChatInfo == null ? LiveFixedRoomChatCellChatInfo.getDefaultInstance() : liveFixedRoomChatCellChatInfo;
        }

        @Override // com.p1.mobile.longlink.msg.connector.LongLinkFixedRoomMessage.LiveFixedRoomChatCellOrBuilder
        public LiveFixedRoomChatCellRoomInfo getRoomInfo() {
            LiveFixedRoomChatCellRoomInfo liveFixedRoomChatCellRoomInfo = this.roomInfo_;
            return liveFixedRoomChatCellRoomInfo == null ? LiveFixedRoomChatCellRoomInfo.getDefaultInstance() : liveFixedRoomChatCellRoomInfo;
        }

        @Override // com.google.protobuf.InterfaceC3419q
        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int iM16893C = this.cellInfo_ != null ? CodedOutputStream.m16893C(1, getCellInfo()) : 0;
            if (this.roomInfo_ != null) {
                iM16893C += CodedOutputStream.m16893C(2, getRoomInfo());
            }
            if (this.chatInfo_ != null) {
                iM16893C += CodedOutputStream.m16893C(3, getChatInfo());
            }
            this.memoizedSerializedSize = iM16893C;
            return iM16893C;
        }

        @Override // com.p1.mobile.longlink.msg.connector.LongLinkFixedRoomMessage.LiveFixedRoomChatCellOrBuilder
        public boolean hasCellInfo() {
            return this.cellInfo_ != null;
        }

        @Override // com.p1.mobile.longlink.msg.connector.LongLinkFixedRoomMessage.LiveFixedRoomChatCellOrBuilder
        public boolean hasChatInfo() {
            return this.chatInfo_ != null;
        }

        @Override // com.p1.mobile.longlink.msg.connector.LongLinkFixedRoomMessage.LiveFixedRoomChatCellOrBuilder
        public boolean hasRoomInfo() {
            return this.roomInfo_ != null;
        }

        @Override // com.google.protobuf.InterfaceC3419q
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (this.cellInfo_ != null) {
                codedOutputStream.mo16974w0(1, getCellInfo());
            }
            if (this.roomInfo_ != null) {
                codedOutputStream.mo16974w0(2, getRoomInfo());
            }
            if (this.chatInfo_ != null) {
                codedOutputStream.mo16974w0(3, getChatInfo());
            }
        }

        public static LiveFixedRoomChatCell parseDelimitedFrom(InputStream inputStream, C3410h c3410h) throws IOException {
            return (LiveFixedRoomChatCell) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, c3410h);
        }

        public static LiveFixedRoomChatCell parseFrom(ByteString byteString, C3410h c3410h) throws InvalidProtocolBufferException {
            return (LiveFixedRoomChatCell) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, c3410h);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setCellInfo(LiveFixedRoomChatCellInfo liveFixedRoomChatCellInfo) {
            liveFixedRoomChatCellInfo.getClass();
            this.cellInfo_ = liveFixedRoomChatCellInfo;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setChatInfo(LiveFixedRoomChatCellChatInfo liveFixedRoomChatCellChatInfo) {
            liveFixedRoomChatCellChatInfo.getClass();
            this.chatInfo_ = liveFixedRoomChatCellChatInfo;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setRoomInfo(LiveFixedRoomChatCellRoomInfo liveFixedRoomChatCellRoomInfo) {
            liveFixedRoomChatCellRoomInfo.getClass();
            this.roomInfo_ = liveFixedRoomChatCellRoomInfo;
        }

        public static final class Builder extends GeneratedMessageLite.AbstractC3380b<LiveFixedRoomChatCell, Builder> implements LiveFixedRoomChatCellOrBuilder {
            private Builder() {
                super(LiveFixedRoomChatCell.DEFAULT_INSTANCE);
            }

            public Builder clearCellInfo() {
                copyOnWrite();
                ((LiveFixedRoomChatCell) this.instance).clearCellInfo();
                return this;
            }

            public Builder clearChatInfo() {
                copyOnWrite();
                ((LiveFixedRoomChatCell) this.instance).clearChatInfo();
                return this;
            }

            public Builder clearRoomInfo() {
                copyOnWrite();
                ((LiveFixedRoomChatCell) this.instance).clearRoomInfo();
                return this;
            }

            @Override // com.p1.mobile.longlink.msg.connector.LongLinkFixedRoomMessage.LiveFixedRoomChatCellOrBuilder
            public LiveFixedRoomChatCellInfo getCellInfo() {
                return ((LiveFixedRoomChatCell) this.instance).getCellInfo();
            }

            @Override // com.p1.mobile.longlink.msg.connector.LongLinkFixedRoomMessage.LiveFixedRoomChatCellOrBuilder
            public LiveFixedRoomChatCellChatInfo getChatInfo() {
                return ((LiveFixedRoomChatCell) this.instance).getChatInfo();
            }

            @Override // com.p1.mobile.longlink.msg.connector.LongLinkFixedRoomMessage.LiveFixedRoomChatCellOrBuilder
            public LiveFixedRoomChatCellRoomInfo getRoomInfo() {
                return ((LiveFixedRoomChatCell) this.instance).getRoomInfo();
            }

            @Override // com.p1.mobile.longlink.msg.connector.LongLinkFixedRoomMessage.LiveFixedRoomChatCellOrBuilder
            public boolean hasCellInfo() {
                return ((LiveFixedRoomChatCell) this.instance).hasCellInfo();
            }

            @Override // com.p1.mobile.longlink.msg.connector.LongLinkFixedRoomMessage.LiveFixedRoomChatCellOrBuilder
            public boolean hasChatInfo() {
                return ((LiveFixedRoomChatCell) this.instance).hasChatInfo();
            }

            @Override // com.p1.mobile.longlink.msg.connector.LongLinkFixedRoomMessage.LiveFixedRoomChatCellOrBuilder
            public boolean hasRoomInfo() {
                return ((LiveFixedRoomChatCell) this.instance).hasRoomInfo();
            }

            public Builder mergeCellInfo(LiveFixedRoomChatCellInfo liveFixedRoomChatCellInfo) {
                copyOnWrite();
                ((LiveFixedRoomChatCell) this.instance).mergeCellInfo(liveFixedRoomChatCellInfo);
                return this;
            }

            public Builder mergeChatInfo(LiveFixedRoomChatCellChatInfo liveFixedRoomChatCellChatInfo) {
                copyOnWrite();
                ((LiveFixedRoomChatCell) this.instance).mergeChatInfo(liveFixedRoomChatCellChatInfo);
                return this;
            }

            public Builder mergeRoomInfo(LiveFixedRoomChatCellRoomInfo liveFixedRoomChatCellRoomInfo) {
                copyOnWrite();
                ((LiveFixedRoomChatCell) this.instance).mergeRoomInfo(liveFixedRoomChatCellRoomInfo);
                return this;
            }

            public Builder setCellInfo(LiveFixedRoomChatCellInfo liveFixedRoomChatCellInfo) {
                copyOnWrite();
                ((LiveFixedRoomChatCell) this.instance).setCellInfo(liveFixedRoomChatCellInfo);
                return this;
            }

            public Builder setChatInfo(LiveFixedRoomChatCellChatInfo liveFixedRoomChatCellChatInfo) {
                copyOnWrite();
                ((LiveFixedRoomChatCell) this.instance).setChatInfo(liveFixedRoomChatCellChatInfo);
                return this;
            }

            public Builder setRoomInfo(LiveFixedRoomChatCellRoomInfo liveFixedRoomChatCellRoomInfo) {
                copyOnWrite();
                ((LiveFixedRoomChatCell) this.instance).setRoomInfo(liveFixedRoomChatCellRoomInfo);
                return this;
            }

            public Builder setCellInfo(LiveFixedRoomChatCellInfo.Builder builder) {
                copyOnWrite();
                ((LiveFixedRoomChatCell) this.instance).setCellInfo(builder);
                return this;
            }

            public Builder setChatInfo(LiveFixedRoomChatCellChatInfo.Builder builder) {
                copyOnWrite();
                ((LiveFixedRoomChatCell) this.instance).setChatInfo(builder);
                return this;
            }

            public Builder setRoomInfo(LiveFixedRoomChatCellRoomInfo.Builder builder) {
                copyOnWrite();
                ((LiveFixedRoomChatCell) this.instance).setRoomInfo(builder);
                return this;
            }
        }

        public static LiveFixedRoomChatCell parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (LiveFixedRoomChatCell) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static LiveFixedRoomChatCell parseFrom(byte[] bArr, C3410h c3410h) throws InvalidProtocolBufferException {
            return (LiveFixedRoomChatCell) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, c3410h);
        }

        public static LiveFixedRoomChatCell parseFrom(InputStream inputStream) throws IOException {
            return (LiveFixedRoomChatCell) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static LiveFixedRoomChatCell parseFrom(InputStream inputStream, C3410h c3410h) throws IOException {
            return (LiveFixedRoomChatCell) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, c3410h);
        }

        public static LiveFixedRoomChatCell parseFrom(C3407e c3407e) throws IOException {
            return (LiveFixedRoomChatCell) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, c3407e);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static LiveFixedRoomChatCell parseFrom(C3407e c3407e, C3410h c3410h) throws IOException {
            return (LiveFixedRoomChatCell) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, c3407e, c3410h);
        }
    }

    public static final class LiveFixedRoomChatCellChatInfo extends GeneratedMessageLite<LiveFixedRoomChatCellChatInfo, Builder> implements LiveFixedRoomChatCellChatInfoOrBuilder {
        public static final int CURRENTMSG_FIELD_NUMBER = 4;
        public static final int CURRENTSENDERNAME_FIELD_NUMBER = 3;
        public static final int CURRENTSEQ_FIELD_NUMBER = 2;
        public static final int CURRENTTIME_FIELD_NUMBER = 5;
        private static final LiveFixedRoomChatCellChatInfo DEFAULT_INSTANCE;
        private static volatile i860<LiveFixedRoomChatCellChatInfo> PARSER = null;
        public static final int UNREADEDCOUNT_FIELD_NUMBER = 1;
        private long currentSeq_;
        private long currentTime_;
        private long unreadedCount_;
        private String currentSenderName_ = "";
        private String currentMsg_ = "";

        public static final class Builder extends GeneratedMessageLite.AbstractC3380b<LiveFixedRoomChatCellChatInfo, Builder> implements LiveFixedRoomChatCellChatInfoOrBuilder {
            private Builder() {
                super(LiveFixedRoomChatCellChatInfo.DEFAULT_INSTANCE);
            }

            public Builder clearCurrentMsg() {
                copyOnWrite();
                ((LiveFixedRoomChatCellChatInfo) this.instance).clearCurrentMsg();
                return this;
            }

            public Builder clearCurrentSenderName() {
                copyOnWrite();
                ((LiveFixedRoomChatCellChatInfo) this.instance).clearCurrentSenderName();
                return this;
            }

            public Builder clearCurrentSeq() {
                copyOnWrite();
                ((LiveFixedRoomChatCellChatInfo) this.instance).clearCurrentSeq();
                return this;
            }

            public Builder clearCurrentTime() {
                copyOnWrite();
                ((LiveFixedRoomChatCellChatInfo) this.instance).clearCurrentTime();
                return this;
            }

            public Builder clearUnreadedCount() {
                copyOnWrite();
                ((LiveFixedRoomChatCellChatInfo) this.instance).clearUnreadedCount();
                return this;
            }

            @Override // com.p1.mobile.longlink.msg.connector.LongLinkFixedRoomMessage.LiveFixedRoomChatCellChatInfoOrBuilder
            public String getCurrentMsg() {
                return ((LiveFixedRoomChatCellChatInfo) this.instance).getCurrentMsg();
            }

            @Override // com.p1.mobile.longlink.msg.connector.LongLinkFixedRoomMessage.LiveFixedRoomChatCellChatInfoOrBuilder
            public ByteString getCurrentMsgBytes() {
                return ((LiveFixedRoomChatCellChatInfo) this.instance).getCurrentMsgBytes();
            }

            @Override // com.p1.mobile.longlink.msg.connector.LongLinkFixedRoomMessage.LiveFixedRoomChatCellChatInfoOrBuilder
            public String getCurrentSenderName() {
                return ((LiveFixedRoomChatCellChatInfo) this.instance).getCurrentSenderName();
            }

            @Override // com.p1.mobile.longlink.msg.connector.LongLinkFixedRoomMessage.LiveFixedRoomChatCellChatInfoOrBuilder
            public ByteString getCurrentSenderNameBytes() {
                return ((LiveFixedRoomChatCellChatInfo) this.instance).getCurrentSenderNameBytes();
            }

            @Override // com.p1.mobile.longlink.msg.connector.LongLinkFixedRoomMessage.LiveFixedRoomChatCellChatInfoOrBuilder
            public long getCurrentSeq() {
                return ((LiveFixedRoomChatCellChatInfo) this.instance).getCurrentSeq();
            }

            @Override // com.p1.mobile.longlink.msg.connector.LongLinkFixedRoomMessage.LiveFixedRoomChatCellChatInfoOrBuilder
            public long getCurrentTime() {
                return ((LiveFixedRoomChatCellChatInfo) this.instance).getCurrentTime();
            }

            @Override // com.p1.mobile.longlink.msg.connector.LongLinkFixedRoomMessage.LiveFixedRoomChatCellChatInfoOrBuilder
            public long getUnreadedCount() {
                return ((LiveFixedRoomChatCellChatInfo) this.instance).getUnreadedCount();
            }

            public Builder setCurrentMsg(String str) {
                copyOnWrite();
                ((LiveFixedRoomChatCellChatInfo) this.instance).setCurrentMsg(str);
                return this;
            }

            public Builder setCurrentMsgBytes(ByteString byteString) {
                copyOnWrite();
                ((LiveFixedRoomChatCellChatInfo) this.instance).setCurrentMsgBytes(byteString);
                return this;
            }

            public Builder setCurrentSenderName(String str) {
                copyOnWrite();
                ((LiveFixedRoomChatCellChatInfo) this.instance).setCurrentSenderName(str);
                return this;
            }

            public Builder setCurrentSenderNameBytes(ByteString byteString) {
                copyOnWrite();
                ((LiveFixedRoomChatCellChatInfo) this.instance).setCurrentSenderNameBytes(byteString);
                return this;
            }

            public Builder setCurrentSeq(long j) {
                copyOnWrite();
                ((LiveFixedRoomChatCellChatInfo) this.instance).setCurrentSeq(j);
                return this;
            }

            public Builder setCurrentTime(long j) {
                copyOnWrite();
                ((LiveFixedRoomChatCellChatInfo) this.instance).setCurrentTime(j);
                return this;
            }

            public Builder setUnreadedCount(long j) {
                copyOnWrite();
                ((LiveFixedRoomChatCellChatInfo) this.instance).setUnreadedCount(j);
                return this;
            }
        }

        static {
            LiveFixedRoomChatCellChatInfo liveFixedRoomChatCellChatInfo = new LiveFixedRoomChatCellChatInfo();
            DEFAULT_INSTANCE = liveFixedRoomChatCellChatInfo;
            liveFixedRoomChatCellChatInfo.makeImmutable();
        }

        private LiveFixedRoomChatCellChatInfo() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearCurrentMsg() {
            this.currentMsg_ = getDefaultInstance().getCurrentMsg();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearCurrentSenderName() {
            this.currentSenderName_ = getDefaultInstance().getCurrentSenderName();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearCurrentSeq() {
            this.currentSeq_ = 0L;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearCurrentTime() {
            this.currentTime_ = 0L;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearUnreadedCount() {
            this.unreadedCount_ = 0L;
        }

        public static LiveFixedRoomChatCellChatInfo getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder(LiveFixedRoomChatCellChatInfo liveFixedRoomChatCellChatInfo) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(liveFixedRoomChatCellChatInfo);
        }

        public static LiveFixedRoomChatCellChatInfo parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (LiveFixedRoomChatCellChatInfo) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static LiveFixedRoomChatCellChatInfo parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (LiveFixedRoomChatCellChatInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static i860<LiveFixedRoomChatCellChatInfo> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setCurrentMsg(String str) {
            str.getClass();
            this.currentMsg_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setCurrentMsgBytes(ByteString byteString) {
            byteString.getClass();
            AbstractC3403a.checkByteStringIsUtf8(byteString);
            this.currentMsg_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setCurrentSenderName(String str) {
            str.getClass();
            this.currentSenderName_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setCurrentSenderNameBytes(ByteString byteString) {
            byteString.getClass();
            AbstractC3403a.checkByteStringIsUtf8(byteString);
            this.currentSenderName_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setCurrentSeq(long j) {
            this.currentSeq_ = j;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setCurrentTime(long j) {
            this.currentTime_ = j;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setUnreadedCount(long j) {
            this.unreadedCount_ = j;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            boolean z = false;
            switch (C43981.f15931xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new LiveFixedRoomChatCellChatInfo();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                    return null;
                case 4:
                    return new Builder();
                case 5:
                    GeneratedMessageLite.InterfaceC3386h interfaceC3386h = (GeneratedMessageLite.InterfaceC3386h) obj;
                    LiveFixedRoomChatCellChatInfo liveFixedRoomChatCellChatInfo = (LiveFixedRoomChatCellChatInfo) obj2;
                    long j = this.unreadedCount_;
                    boolean z2 = j != 0;
                    long j2 = liveFixedRoomChatCellChatInfo.unreadedCount_;
                    this.unreadedCount_ = interfaceC3386h.mo17000i(z2, j, j2 != 0, j2);
                    long j3 = this.currentSeq_;
                    boolean z3 = j3 != 0;
                    long j4 = liveFixedRoomChatCellChatInfo.currentSeq_;
                    this.currentSeq_ = interfaceC3386h.mo17000i(z3, j3, j4 != 0, j4);
                    this.currentSenderName_ = interfaceC3386h.mo16997f(!this.currentSenderName_.isEmpty(), this.currentSenderName_, !liveFixedRoomChatCellChatInfo.currentSenderName_.isEmpty(), liveFixedRoomChatCellChatInfo.currentSenderName_);
                    this.currentMsg_ = interfaceC3386h.mo16997f(!this.currentMsg_.isEmpty(), this.currentMsg_, !liveFixedRoomChatCellChatInfo.currentMsg_.isEmpty(), liveFixedRoomChatCellChatInfo.currentMsg_);
                    boolean z4 = false;
                    long j5 = this.currentTime_;
                    if (j5 != 0) {
                        z4 = true;
                    }
                    long j6 = liveFixedRoomChatCellChatInfo.currentTime_;
                    this.currentTime_ = interfaceC3386h.mo17000i(z4, j5, j6 != 0, j6);
                    GeneratedMessageLite.C3385g c3385g = GeneratedMessageLite.C3385g.INSTANCE;
                    return this;
                case 6:
                    C3407e c3407e = (C3407e) obj;
                    while (!z) {
                        try {
                            int iM17116M = c3407e.m17116M();
                            if (iM17116M != 0) {
                                if (iM17116M == 8) {
                                    this.unreadedCount_ = c3407e.m17142v();
                                } else if (iM17116M == 16) {
                                    this.currentSeq_ = c3407e.m17118O();
                                } else if (iM17116M == 26) {
                                    this.currentSenderName_ = c3407e.m17115L();
                                } else if (iM17116M == 34) {
                                    this.currentMsg_ = c3407e.m17115L();
                                } else if (iM17116M == 40) {
                                    this.currentTime_ = c3407e.m17142v();
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
                        synchronized (LiveFixedRoomChatCellChatInfo.class) {
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

        @Override // com.p1.mobile.longlink.msg.connector.LongLinkFixedRoomMessage.LiveFixedRoomChatCellChatInfoOrBuilder
        public String getCurrentMsg() {
            return this.currentMsg_;
        }

        @Override // com.p1.mobile.longlink.msg.connector.LongLinkFixedRoomMessage.LiveFixedRoomChatCellChatInfoOrBuilder
        public ByteString getCurrentMsgBytes() {
            return ByteString.copyFromUtf8(this.currentMsg_);
        }

        @Override // com.p1.mobile.longlink.msg.connector.LongLinkFixedRoomMessage.LiveFixedRoomChatCellChatInfoOrBuilder
        public String getCurrentSenderName() {
            return this.currentSenderName_;
        }

        @Override // com.p1.mobile.longlink.msg.connector.LongLinkFixedRoomMessage.LiveFixedRoomChatCellChatInfoOrBuilder
        public ByteString getCurrentSenderNameBytes() {
            return ByteString.copyFromUtf8(this.currentSenderName_);
        }

        @Override // com.p1.mobile.longlink.msg.connector.LongLinkFixedRoomMessage.LiveFixedRoomChatCellChatInfoOrBuilder
        public long getCurrentSeq() {
            return this.currentSeq_;
        }

        @Override // com.p1.mobile.longlink.msg.connector.LongLinkFixedRoomMessage.LiveFixedRoomChatCellChatInfoOrBuilder
        public long getCurrentTime() {
            return this.currentTime_;
        }

        @Override // com.google.protobuf.InterfaceC3419q
        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            long j = this.unreadedCount_;
            int iM16931v = j != 0 ? CodedOutputStream.m16931v(1, j) : 0;
            long j2 = this.currentSeq_;
            if (j2 != 0) {
                iM16931v += CodedOutputStream.m16906P(2, j2);
            }
            if (!this.currentSenderName_.isEmpty()) {
                iM16931v += CodedOutputStream.m16901K(3, getCurrentSenderName());
            }
            if (!this.currentMsg_.isEmpty()) {
                iM16931v += CodedOutputStream.m16901K(4, getCurrentMsg());
            }
            long j3 = this.currentTime_;
            if (j3 != 0) {
                iM16931v += CodedOutputStream.m16931v(5, j3);
            }
            this.memoizedSerializedSize = iM16931v;
            return iM16931v;
        }

        @Override // com.p1.mobile.longlink.msg.connector.LongLinkFixedRoomMessage.LiveFixedRoomChatCellChatInfoOrBuilder
        public long getUnreadedCount() {
            return this.unreadedCount_;
        }

        @Override // com.google.protobuf.InterfaceC3419q
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            long j = this.unreadedCount_;
            if (j != 0) {
                codedOutputStream.m16972u0(1, j);
            }
            long j2 = this.currentSeq_;
            if (j2 != 0) {
                codedOutputStream.mo16944I0(2, j2);
            }
            if (!this.currentSenderName_.isEmpty()) {
                codedOutputStream.mo16939D0(3, getCurrentSenderName());
            }
            if (!this.currentMsg_.isEmpty()) {
                codedOutputStream.mo16939D0(4, getCurrentMsg());
            }
            long j3 = this.currentTime_;
            if (j3 != 0) {
                codedOutputStream.m16972u0(5, j3);
            }
        }

        public static LiveFixedRoomChatCellChatInfo parseDelimitedFrom(InputStream inputStream, C3410h c3410h) throws IOException {
            return (LiveFixedRoomChatCellChatInfo) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, c3410h);
        }

        public static LiveFixedRoomChatCellChatInfo parseFrom(ByteString byteString, C3410h c3410h) throws InvalidProtocolBufferException {
            return (LiveFixedRoomChatCellChatInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, c3410h);
        }

        public static LiveFixedRoomChatCellChatInfo parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (LiveFixedRoomChatCellChatInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static LiveFixedRoomChatCellChatInfo parseFrom(byte[] bArr, C3410h c3410h) throws InvalidProtocolBufferException {
            return (LiveFixedRoomChatCellChatInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, c3410h);
        }

        public static LiveFixedRoomChatCellChatInfo parseFrom(InputStream inputStream) throws IOException {
            return (LiveFixedRoomChatCellChatInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static LiveFixedRoomChatCellChatInfo parseFrom(InputStream inputStream, C3410h c3410h) throws IOException {
            return (LiveFixedRoomChatCellChatInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, c3410h);
        }

        public static LiveFixedRoomChatCellChatInfo parseFrom(C3407e c3407e) throws IOException {
            return (LiveFixedRoomChatCellChatInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, c3407e);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static LiveFixedRoomChatCellChatInfo parseFrom(C3407e c3407e, C3410h c3410h) throws IOException {
            return (LiveFixedRoomChatCellChatInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, c3407e, c3410h);
        }
    }

    public static final class LiveFixedRoomChatCellInfo extends GeneratedMessageLite<LiveFixedRoomChatCellInfo, Builder> implements LiveFixedRoomChatCellInfoOrBuilder {
        private static final LiveFixedRoomChatCellInfo DEFAULT_INSTANCE;
        public static final int DISSOLVEREASON_FIELD_NUMBER = 5;
        public static final int ISDISSOLVED_FIELD_NUMBER = 4;
        public static final int ISONTOP_FIELD_NUMBER = 1;
        public static final int ISREMIND_FIELD_NUMBER = 6;
        public static final int ISREMOVED_FIELD_NUMBER = 3;
        public static final int ISSHOW_FIELD_NUMBER = 2;
        private static volatile i860<LiveFixedRoomChatCellInfo> PARSER;
        private String dissolveReason_ = "";
        private boolean isDissolved_;
        private boolean isOnTop_;
        private boolean isRemind_;
        private boolean isRemoved_;
        private boolean isShow_;

        public static final class Builder extends GeneratedMessageLite.AbstractC3380b<LiveFixedRoomChatCellInfo, Builder> implements LiveFixedRoomChatCellInfoOrBuilder {
            private Builder() {
                super(LiveFixedRoomChatCellInfo.DEFAULT_INSTANCE);
            }

            public Builder clearDissolveReason() {
                copyOnWrite();
                ((LiveFixedRoomChatCellInfo) this.instance).clearDissolveReason();
                return this;
            }

            public Builder clearIsDissolved() {
                copyOnWrite();
                ((LiveFixedRoomChatCellInfo) this.instance).clearIsDissolved();
                return this;
            }

            public Builder clearIsOnTop() {
                copyOnWrite();
                ((LiveFixedRoomChatCellInfo) this.instance).clearIsOnTop();
                return this;
            }

            public Builder clearIsRemind() {
                copyOnWrite();
                ((LiveFixedRoomChatCellInfo) this.instance).clearIsRemind();
                return this;
            }

            public Builder clearIsRemoved() {
                copyOnWrite();
                ((LiveFixedRoomChatCellInfo) this.instance).clearIsRemoved();
                return this;
            }

            public Builder clearIsShow() {
                copyOnWrite();
                ((LiveFixedRoomChatCellInfo) this.instance).clearIsShow();
                return this;
            }

            @Override // com.p1.mobile.longlink.msg.connector.LongLinkFixedRoomMessage.LiveFixedRoomChatCellInfoOrBuilder
            public String getDissolveReason() {
                return ((LiveFixedRoomChatCellInfo) this.instance).getDissolveReason();
            }

            @Override // com.p1.mobile.longlink.msg.connector.LongLinkFixedRoomMessage.LiveFixedRoomChatCellInfoOrBuilder
            public ByteString getDissolveReasonBytes() {
                return ((LiveFixedRoomChatCellInfo) this.instance).getDissolveReasonBytes();
            }

            @Override // com.p1.mobile.longlink.msg.connector.LongLinkFixedRoomMessage.LiveFixedRoomChatCellInfoOrBuilder
            public boolean getIsDissolved() {
                return ((LiveFixedRoomChatCellInfo) this.instance).getIsDissolved();
            }

            @Override // com.p1.mobile.longlink.msg.connector.LongLinkFixedRoomMessage.LiveFixedRoomChatCellInfoOrBuilder
            public boolean getIsOnTop() {
                return ((LiveFixedRoomChatCellInfo) this.instance).getIsOnTop();
            }

            @Override // com.p1.mobile.longlink.msg.connector.LongLinkFixedRoomMessage.LiveFixedRoomChatCellInfoOrBuilder
            public boolean getIsRemind() {
                return ((LiveFixedRoomChatCellInfo) this.instance).getIsRemind();
            }

            @Override // com.p1.mobile.longlink.msg.connector.LongLinkFixedRoomMessage.LiveFixedRoomChatCellInfoOrBuilder
            public boolean getIsRemoved() {
                return ((LiveFixedRoomChatCellInfo) this.instance).getIsRemoved();
            }

            @Override // com.p1.mobile.longlink.msg.connector.LongLinkFixedRoomMessage.LiveFixedRoomChatCellInfoOrBuilder
            public boolean getIsShow() {
                return ((LiveFixedRoomChatCellInfo) this.instance).getIsShow();
            }

            public Builder setDissolveReason(String str) {
                copyOnWrite();
                ((LiveFixedRoomChatCellInfo) this.instance).setDissolveReason(str);
                return this;
            }

            public Builder setDissolveReasonBytes(ByteString byteString) {
                copyOnWrite();
                ((LiveFixedRoomChatCellInfo) this.instance).setDissolveReasonBytes(byteString);
                return this;
            }

            public Builder setIsDissolved(boolean z) {
                copyOnWrite();
                ((LiveFixedRoomChatCellInfo) this.instance).setIsDissolved(z);
                return this;
            }

            public Builder setIsOnTop(boolean z) {
                copyOnWrite();
                ((LiveFixedRoomChatCellInfo) this.instance).setIsOnTop(z);
                return this;
            }

            public Builder setIsRemind(boolean z) {
                copyOnWrite();
                ((LiveFixedRoomChatCellInfo) this.instance).setIsRemind(z);
                return this;
            }

            public Builder setIsRemoved(boolean z) {
                copyOnWrite();
                ((LiveFixedRoomChatCellInfo) this.instance).setIsRemoved(z);
                return this;
            }

            public Builder setIsShow(boolean z) {
                copyOnWrite();
                ((LiveFixedRoomChatCellInfo) this.instance).setIsShow(z);
                return this;
            }
        }

        static {
            LiveFixedRoomChatCellInfo liveFixedRoomChatCellInfo = new LiveFixedRoomChatCellInfo();
            DEFAULT_INSTANCE = liveFixedRoomChatCellInfo;
            liveFixedRoomChatCellInfo.makeImmutable();
        }

        private LiveFixedRoomChatCellInfo() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearDissolveReason() {
            this.dissolveReason_ = getDefaultInstance().getDissolveReason();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearIsDissolved() {
            this.isDissolved_ = false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearIsOnTop() {
            this.isOnTop_ = false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearIsRemind() {
            this.isRemind_ = false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearIsRemoved() {
            this.isRemoved_ = false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearIsShow() {
            this.isShow_ = false;
        }

        public static LiveFixedRoomChatCellInfo getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder(LiveFixedRoomChatCellInfo liveFixedRoomChatCellInfo) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(liveFixedRoomChatCellInfo);
        }

        public static LiveFixedRoomChatCellInfo parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (LiveFixedRoomChatCellInfo) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static LiveFixedRoomChatCellInfo parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (LiveFixedRoomChatCellInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static i860<LiveFixedRoomChatCellInfo> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setDissolveReason(String str) {
            str.getClass();
            this.dissolveReason_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setDissolveReasonBytes(ByteString byteString) {
            byteString.getClass();
            AbstractC3403a.checkByteStringIsUtf8(byteString);
            this.dissolveReason_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setIsDissolved(boolean z) {
            this.isDissolved_ = z;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setIsOnTop(boolean z) {
            this.isOnTop_ = z;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setIsRemind(boolean z) {
            this.isRemind_ = z;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setIsRemoved(boolean z) {
            this.isRemoved_ = z;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setIsShow(boolean z) {
            this.isShow_ = z;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (C43981.f15931xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new LiveFixedRoomChatCellInfo();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                    return null;
                case 4:
                    return new Builder();
                case 5:
                    GeneratedMessageLite.InterfaceC3386h interfaceC3386h = (GeneratedMessageLite.InterfaceC3386h) obj;
                    LiveFixedRoomChatCellInfo liveFixedRoomChatCellInfo = (LiveFixedRoomChatCellInfo) obj2;
                    boolean z = this.isOnTop_;
                    boolean z2 = liveFixedRoomChatCellInfo.isOnTop_;
                    this.isOnTop_ = interfaceC3386h.mo16995d(z, z, z2, z2);
                    boolean z3 = this.isShow_;
                    boolean z4 = liveFixedRoomChatCellInfo.isShow_;
                    this.isShow_ = interfaceC3386h.mo16995d(z3, z3, z4, z4);
                    boolean z5 = this.isRemoved_;
                    boolean z6 = liveFixedRoomChatCellInfo.isRemoved_;
                    this.isRemoved_ = interfaceC3386h.mo16995d(z5, z5, z6, z6);
                    boolean z7 = this.isDissolved_;
                    boolean z8 = liveFixedRoomChatCellInfo.isDissolved_;
                    this.isDissolved_ = interfaceC3386h.mo16995d(z7, z7, z8, z8);
                    this.dissolveReason_ = interfaceC3386h.mo16997f(!this.dissolveReason_.isEmpty(), this.dissolveReason_, true ^ liveFixedRoomChatCellInfo.dissolveReason_.isEmpty(), liveFixedRoomChatCellInfo.dissolveReason_);
                    boolean z9 = this.isRemind_;
                    boolean z10 = liveFixedRoomChatCellInfo.isRemind_;
                    this.isRemind_ = interfaceC3386h.mo16995d(z9, z9, z10, z10);
                    GeneratedMessageLite.C3385g c3385g = GeneratedMessageLite.C3385g.INSTANCE;
                    return this;
                case 6:
                    C3407e c3407e = (C3407e) obj;
                    boolean z11 = false;
                    while (!z11) {
                        try {
                            int iM17116M = c3407e.m17116M();
                            if (iM17116M != 0) {
                                if (iM17116M == 8) {
                                    this.isOnTop_ = c3407e.m17133m();
                                } else if (iM17116M == 16) {
                                    this.isShow_ = c3407e.m17133m();
                                } else if (iM17116M == 24) {
                                    this.isRemoved_ = c3407e.m17133m();
                                } else if (iM17116M == 32) {
                                    this.isDissolved_ = c3407e.m17133m();
                                } else if (iM17116M == 42) {
                                    this.dissolveReason_ = c3407e.m17115L();
                                } else if (iM17116M == 48) {
                                    this.isRemind_ = c3407e.m17133m();
                                } else if (!c3407e.m17121R(iM17116M)) {
                                }
                            }
                            z11 = true;
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
                        synchronized (LiveFixedRoomChatCellInfo.class) {
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

        @Override // com.p1.mobile.longlink.msg.connector.LongLinkFixedRoomMessage.LiveFixedRoomChatCellInfoOrBuilder
        public String getDissolveReason() {
            return this.dissolveReason_;
        }

        @Override // com.p1.mobile.longlink.msg.connector.LongLinkFixedRoomMessage.LiveFixedRoomChatCellInfoOrBuilder
        public ByteString getDissolveReasonBytes() {
            return ByteString.copyFromUtf8(this.dissolveReason_);
        }

        @Override // com.p1.mobile.longlink.msg.connector.LongLinkFixedRoomMessage.LiveFixedRoomChatCellInfoOrBuilder
        public boolean getIsDissolved() {
            return this.isDissolved_;
        }

        @Override // com.p1.mobile.longlink.msg.connector.LongLinkFixedRoomMessage.LiveFixedRoomChatCellInfoOrBuilder
        public boolean getIsOnTop() {
            return this.isOnTop_;
        }

        @Override // com.p1.mobile.longlink.msg.connector.LongLinkFixedRoomMessage.LiveFixedRoomChatCellInfoOrBuilder
        public boolean getIsRemind() {
            return this.isRemind_;
        }

        @Override // com.p1.mobile.longlink.msg.connector.LongLinkFixedRoomMessage.LiveFixedRoomChatCellInfoOrBuilder
        public boolean getIsRemoved() {
            return this.isRemoved_;
        }

        @Override // com.p1.mobile.longlink.msg.connector.LongLinkFixedRoomMessage.LiveFixedRoomChatCellInfoOrBuilder
        public boolean getIsShow() {
            return this.isShow_;
        }

        @Override // com.google.protobuf.InterfaceC3419q
        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            boolean z = this.isOnTop_;
            int iM16915f = z ? CodedOutputStream.m16915f(1, z) : 0;
            boolean z2 = this.isShow_;
            if (z2) {
                iM16915f += CodedOutputStream.m16915f(2, z2);
            }
            boolean z3 = this.isRemoved_;
            if (z3) {
                iM16915f += CodedOutputStream.m16915f(3, z3);
            }
            boolean z4 = this.isDissolved_;
            if (z4) {
                iM16915f += CodedOutputStream.m16915f(4, z4);
            }
            if (!this.dissolveReason_.isEmpty()) {
                iM16915f += CodedOutputStream.m16901K(5, getDissolveReason());
            }
            boolean z5 = this.isRemind_;
            if (z5) {
                iM16915f += CodedOutputStream.m16915f(6, z5);
            }
            this.memoizedSerializedSize = iM16915f;
            return iM16915f;
        }

        @Override // com.google.protobuf.InterfaceC3419q
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            boolean z = this.isOnTop_;
            if (z) {
                codedOutputStream.mo16950a0(1, z);
            }
            boolean z2 = this.isShow_;
            if (z2) {
                codedOutputStream.mo16950a0(2, z2);
            }
            boolean z3 = this.isRemoved_;
            if (z3) {
                codedOutputStream.mo16950a0(3, z3);
            }
            boolean z4 = this.isDissolved_;
            if (z4) {
                codedOutputStream.mo16950a0(4, z4);
            }
            if (!this.dissolveReason_.isEmpty()) {
                codedOutputStream.mo16939D0(5, getDissolveReason());
            }
            boolean z5 = this.isRemind_;
            if (z5) {
                codedOutputStream.mo16950a0(6, z5);
            }
        }

        public static LiveFixedRoomChatCellInfo parseDelimitedFrom(InputStream inputStream, C3410h c3410h) throws IOException {
            return (LiveFixedRoomChatCellInfo) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, c3410h);
        }

        public static LiveFixedRoomChatCellInfo parseFrom(ByteString byteString, C3410h c3410h) throws InvalidProtocolBufferException {
            return (LiveFixedRoomChatCellInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, c3410h);
        }

        public static LiveFixedRoomChatCellInfo parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (LiveFixedRoomChatCellInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static LiveFixedRoomChatCellInfo parseFrom(byte[] bArr, C3410h c3410h) throws InvalidProtocolBufferException {
            return (LiveFixedRoomChatCellInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, c3410h);
        }

        public static LiveFixedRoomChatCellInfo parseFrom(InputStream inputStream) throws IOException {
            return (LiveFixedRoomChatCellInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static LiveFixedRoomChatCellInfo parseFrom(InputStream inputStream, C3410h c3410h) throws IOException {
            return (LiveFixedRoomChatCellInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, c3410h);
        }

        public static LiveFixedRoomChatCellInfo parseFrom(C3407e c3407e) throws IOException {
            return (LiveFixedRoomChatCellInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, c3407e);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static LiveFixedRoomChatCellInfo parseFrom(C3407e c3407e, C3410h c3410h) throws IOException {
            return (LiveFixedRoomChatCellInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, c3407e, c3410h);
        }
    }

    public static final class LiveFixedRoomChatCellRoomInfo extends GeneratedMessageLite<LiveFixedRoomChatCellRoomInfo, Builder> implements LiveFixedRoomChatCellRoomInfoOrBuilder {
        public static final int AVATARS_FIELD_NUMBER = 3;
        private static final LiveFixedRoomChatCellRoomInfo DEFAULT_INSTANCE;
        public static final int LIVEID_FIELD_NUMBER = 5;
        public static final int MEMBERCOUNT_FIELD_NUMBER = 4;
        private static volatile i860<LiveFixedRoomChatCellRoomInfo> PARSER = null;
        public static final int ROOMID_FIELD_NUMBER = 1;
        public static final int TITLE_FIELD_NUMBER = 2;
        private int bitField0_;
        private long memberCount_;
        private String roomId_ = "";
        private String title_ = "";
        private C3414l.h<String> avatars_ = GeneratedMessageLite.emptyProtobufList();
        private String liveId_ = "";

        public static final class Builder extends GeneratedMessageLite.AbstractC3380b<LiveFixedRoomChatCellRoomInfo, Builder> implements LiveFixedRoomChatCellRoomInfoOrBuilder {
            private Builder() {
                super(LiveFixedRoomChatCellRoomInfo.DEFAULT_INSTANCE);
            }

            public Builder addAllAvatars(Iterable<String> iterable) {
                copyOnWrite();
                ((LiveFixedRoomChatCellRoomInfo) this.instance).addAllAvatars(iterable);
                return this;
            }

            public Builder addAvatars(String str) {
                copyOnWrite();
                ((LiveFixedRoomChatCellRoomInfo) this.instance).addAvatars(str);
                return this;
            }

            public Builder addAvatarsBytes(ByteString byteString) {
                copyOnWrite();
                ((LiveFixedRoomChatCellRoomInfo) this.instance).addAvatarsBytes(byteString);
                return this;
            }

            public Builder clearAvatars() {
                copyOnWrite();
                ((LiveFixedRoomChatCellRoomInfo) this.instance).clearAvatars();
                return this;
            }

            public Builder clearLiveId() {
                copyOnWrite();
                ((LiveFixedRoomChatCellRoomInfo) this.instance).clearLiveId();
                return this;
            }

            public Builder clearMemberCount() {
                copyOnWrite();
                ((LiveFixedRoomChatCellRoomInfo) this.instance).clearMemberCount();
                return this;
            }

            public Builder clearRoomId() {
                copyOnWrite();
                ((LiveFixedRoomChatCellRoomInfo) this.instance).clearRoomId();
                return this;
            }

            public Builder clearTitle() {
                copyOnWrite();
                ((LiveFixedRoomChatCellRoomInfo) this.instance).clearTitle();
                return this;
            }

            @Override // com.p1.mobile.longlink.msg.connector.LongLinkFixedRoomMessage.LiveFixedRoomChatCellRoomInfoOrBuilder
            public String getAvatars(int i) {
                return ((LiveFixedRoomChatCellRoomInfo) this.instance).getAvatars(i);
            }

            @Override // com.p1.mobile.longlink.msg.connector.LongLinkFixedRoomMessage.LiveFixedRoomChatCellRoomInfoOrBuilder
            public ByteString getAvatarsBytes(int i) {
                return ((LiveFixedRoomChatCellRoomInfo) this.instance).getAvatarsBytes(i);
            }

            @Override // com.p1.mobile.longlink.msg.connector.LongLinkFixedRoomMessage.LiveFixedRoomChatCellRoomInfoOrBuilder
            public int getAvatarsCount() {
                return ((LiveFixedRoomChatCellRoomInfo) this.instance).getAvatarsCount();
            }

            @Override // com.p1.mobile.longlink.msg.connector.LongLinkFixedRoomMessage.LiveFixedRoomChatCellRoomInfoOrBuilder
            public List<String> getAvatarsList() {
                return Collections.unmodifiableList(((LiveFixedRoomChatCellRoomInfo) this.instance).getAvatarsList());
            }

            @Override // com.p1.mobile.longlink.msg.connector.LongLinkFixedRoomMessage.LiveFixedRoomChatCellRoomInfoOrBuilder
            public String getLiveId() {
                return ((LiveFixedRoomChatCellRoomInfo) this.instance).getLiveId();
            }

            @Override // com.p1.mobile.longlink.msg.connector.LongLinkFixedRoomMessage.LiveFixedRoomChatCellRoomInfoOrBuilder
            public ByteString getLiveIdBytes() {
                return ((LiveFixedRoomChatCellRoomInfo) this.instance).getLiveIdBytes();
            }

            @Override // com.p1.mobile.longlink.msg.connector.LongLinkFixedRoomMessage.LiveFixedRoomChatCellRoomInfoOrBuilder
            public long getMemberCount() {
                return ((LiveFixedRoomChatCellRoomInfo) this.instance).getMemberCount();
            }

            @Override // com.p1.mobile.longlink.msg.connector.LongLinkFixedRoomMessage.LiveFixedRoomChatCellRoomInfoOrBuilder
            public String getRoomId() {
                return ((LiveFixedRoomChatCellRoomInfo) this.instance).getRoomId();
            }

            @Override // com.p1.mobile.longlink.msg.connector.LongLinkFixedRoomMessage.LiveFixedRoomChatCellRoomInfoOrBuilder
            public ByteString getRoomIdBytes() {
                return ((LiveFixedRoomChatCellRoomInfo) this.instance).getRoomIdBytes();
            }

            @Override // com.p1.mobile.longlink.msg.connector.LongLinkFixedRoomMessage.LiveFixedRoomChatCellRoomInfoOrBuilder
            public String getTitle() {
                return ((LiveFixedRoomChatCellRoomInfo) this.instance).getTitle();
            }

            @Override // com.p1.mobile.longlink.msg.connector.LongLinkFixedRoomMessage.LiveFixedRoomChatCellRoomInfoOrBuilder
            public ByteString getTitleBytes() {
                return ((LiveFixedRoomChatCellRoomInfo) this.instance).getTitleBytes();
            }

            public Builder setAvatars(int i, String str) {
                copyOnWrite();
                ((LiveFixedRoomChatCellRoomInfo) this.instance).setAvatars(i, str);
                return this;
            }

            public Builder setLiveId(String str) {
                copyOnWrite();
                ((LiveFixedRoomChatCellRoomInfo) this.instance).setLiveId(str);
                return this;
            }

            public Builder setLiveIdBytes(ByteString byteString) {
                copyOnWrite();
                ((LiveFixedRoomChatCellRoomInfo) this.instance).setLiveIdBytes(byteString);
                return this;
            }

            public Builder setMemberCount(long j) {
                copyOnWrite();
                ((LiveFixedRoomChatCellRoomInfo) this.instance).setMemberCount(j);
                return this;
            }

            public Builder setRoomId(String str) {
                copyOnWrite();
                ((LiveFixedRoomChatCellRoomInfo) this.instance).setRoomId(str);
                return this;
            }

            public Builder setRoomIdBytes(ByteString byteString) {
                copyOnWrite();
                ((LiveFixedRoomChatCellRoomInfo) this.instance).setRoomIdBytes(byteString);
                return this;
            }

            public Builder setTitle(String str) {
                copyOnWrite();
                ((LiveFixedRoomChatCellRoomInfo) this.instance).setTitle(str);
                return this;
            }

            public Builder setTitleBytes(ByteString byteString) {
                copyOnWrite();
                ((LiveFixedRoomChatCellRoomInfo) this.instance).setTitleBytes(byteString);
                return this;
            }
        }

        static {
            LiveFixedRoomChatCellRoomInfo liveFixedRoomChatCellRoomInfo = new LiveFixedRoomChatCellRoomInfo();
            DEFAULT_INSTANCE = liveFixedRoomChatCellRoomInfo;
            liveFixedRoomChatCellRoomInfo.makeImmutable();
        }

        private LiveFixedRoomChatCellRoomInfo() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllAvatars(Iterable<String> iterable) {
            ensureAvatarsIsMutable();
            AbstractC3403a.addAll(iterable, this.avatars_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAvatars(String str) {
            str.getClass();
            ensureAvatarsIsMutable();
            this.avatars_.add(str);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAvatarsBytes(ByteString byteString) {
            byteString.getClass();
            AbstractC3403a.checkByteStringIsUtf8(byteString);
            ensureAvatarsIsMutable();
            this.avatars_.add(byteString.toStringUtf8());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAvatars() {
            this.avatars_ = GeneratedMessageLite.emptyProtobufList();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearLiveId() {
            this.liveId_ = getDefaultInstance().getLiveId();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearMemberCount() {
            this.memberCount_ = 0L;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearRoomId() {
            this.roomId_ = getDefaultInstance().getRoomId();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearTitle() {
            this.title_ = getDefaultInstance().getTitle();
        }

        private void ensureAvatarsIsMutable() {
            if (this.avatars_.mo17085q()) {
                return;
            }
            this.avatars_ = GeneratedMessageLite.mutableCopy(this.avatars_);
        }

        public static LiveFixedRoomChatCellRoomInfo getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder(LiveFixedRoomChatCellRoomInfo liveFixedRoomChatCellRoomInfo) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(liveFixedRoomChatCellRoomInfo);
        }

        public static LiveFixedRoomChatCellRoomInfo parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (LiveFixedRoomChatCellRoomInfo) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static LiveFixedRoomChatCellRoomInfo parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (LiveFixedRoomChatCellRoomInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static i860<LiveFixedRoomChatCellRoomInfo> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAvatars(int i, String str) {
            str.getClass();
            ensureAvatarsIsMutable();
            this.avatars_.set(i, str);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setLiveId(String str) {
            str.getClass();
            this.liveId_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setLiveIdBytes(ByteString byteString) {
            byteString.getClass();
            AbstractC3403a.checkByteStringIsUtf8(byteString);
            this.liveId_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setMemberCount(long j) {
            this.memberCount_ = j;
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
        public void setTitle(String str) {
            str.getClass();
            this.title_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTitleBytes(ByteString byteString) {
            byteString.getClass();
            AbstractC3403a.checkByteStringIsUtf8(byteString);
            this.title_ = byteString.toStringUtf8();
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            boolean z = false;
            switch (C43981.f15931xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new LiveFixedRoomChatCellRoomInfo();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                    this.avatars_.mo17084n();
                    return null;
                case 4:
                    return new Builder();
                case 5:
                    GeneratedMessageLite.InterfaceC3386h interfaceC3386h = (GeneratedMessageLite.InterfaceC3386h) obj;
                    LiveFixedRoomChatCellRoomInfo liveFixedRoomChatCellRoomInfo = (LiveFixedRoomChatCellRoomInfo) obj2;
                    this.roomId_ = interfaceC3386h.mo16997f(!this.roomId_.isEmpty(), this.roomId_, !liveFixedRoomChatCellRoomInfo.roomId_.isEmpty(), liveFixedRoomChatCellRoomInfo.roomId_);
                    this.title_ = interfaceC3386h.mo16997f(!this.title_.isEmpty(), this.title_, !liveFixedRoomChatCellRoomInfo.title_.isEmpty(), liveFixedRoomChatCellRoomInfo.title_);
                    this.avatars_ = interfaceC3386h.mo16998g(this.avatars_, liveFixedRoomChatCellRoomInfo.avatars_);
                    long j = this.memberCount_;
                    boolean z2 = j != 0;
                    long j2 = liveFixedRoomChatCellRoomInfo.memberCount_;
                    this.memberCount_ = interfaceC3386h.mo17000i(z2, j, j2 != 0, j2);
                    this.liveId_ = interfaceC3386h.mo16997f(!this.liveId_.isEmpty(), this.liveId_, !liveFixedRoomChatCellRoomInfo.liveId_.isEmpty(), liveFixedRoomChatCellRoomInfo.liveId_);
                    if (interfaceC3386h == GeneratedMessageLite.C3385g.INSTANCE) {
                        this.bitField0_ |= liveFixedRoomChatCellRoomInfo.bitField0_;
                    }
                    return this;
                case 6:
                    C3407e c3407e = (C3407e) obj;
                    while (!z) {
                        try {
                            int iM17116M = c3407e.m17116M();
                            if (iM17116M != 0) {
                                if (iM17116M == 10) {
                                    this.roomId_ = c3407e.m17115L();
                                } else if (iM17116M == 18) {
                                    this.title_ = c3407e.m17115L();
                                } else if (iM17116M == 26) {
                                    String strM17115L = c3407e.m17115L();
                                    if (!this.avatars_.mo17085q()) {
                                        this.avatars_ = GeneratedMessageLite.mutableCopy(this.avatars_);
                                    }
                                    this.avatars_.add(strM17115L);
                                } else if (iM17116M == 32) {
                                    this.memberCount_ = c3407e.m17142v();
                                } else if (iM17116M == 42) {
                                    this.liveId_ = c3407e.m17115L();
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
                        synchronized (LiveFixedRoomChatCellRoomInfo.class) {
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

        @Override // com.p1.mobile.longlink.msg.connector.LongLinkFixedRoomMessage.LiveFixedRoomChatCellRoomInfoOrBuilder
        public String getAvatars(int i) {
            return this.avatars_.get(i);
        }

        @Override // com.p1.mobile.longlink.msg.connector.LongLinkFixedRoomMessage.LiveFixedRoomChatCellRoomInfoOrBuilder
        public ByteString getAvatarsBytes(int i) {
            return ByteString.copyFromUtf8(this.avatars_.get(i));
        }

        @Override // com.p1.mobile.longlink.msg.connector.LongLinkFixedRoomMessage.LiveFixedRoomChatCellRoomInfoOrBuilder
        public int getAvatarsCount() {
            return this.avatars_.size();
        }

        @Override // com.p1.mobile.longlink.msg.connector.LongLinkFixedRoomMessage.LiveFixedRoomChatCellRoomInfoOrBuilder
        public List<String> getAvatarsList() {
            return this.avatars_;
        }

        @Override // com.p1.mobile.longlink.msg.connector.LongLinkFixedRoomMessage.LiveFixedRoomChatCellRoomInfoOrBuilder
        public String getLiveId() {
            return this.liveId_;
        }

        @Override // com.p1.mobile.longlink.msg.connector.LongLinkFixedRoomMessage.LiveFixedRoomChatCellRoomInfoOrBuilder
        public ByteString getLiveIdBytes() {
            return ByteString.copyFromUtf8(this.liveId_);
        }

        @Override // com.p1.mobile.longlink.msg.connector.LongLinkFixedRoomMessage.LiveFixedRoomChatCellRoomInfoOrBuilder
        public long getMemberCount() {
            return this.memberCount_;
        }

        @Override // com.p1.mobile.longlink.msg.connector.LongLinkFixedRoomMessage.LiveFixedRoomChatCellRoomInfoOrBuilder
        public String getRoomId() {
            return this.roomId_;
        }

        @Override // com.p1.mobile.longlink.msg.connector.LongLinkFixedRoomMessage.LiveFixedRoomChatCellRoomInfoOrBuilder
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
            if (!this.title_.isEmpty()) {
                iM16901K += CodedOutputStream.m16901K(2, getTitle());
            }
            int iM16902L = 0;
            for (int i2 = 0; i2 < this.avatars_.size(); i2++) {
                iM16902L += CodedOutputStream.m16902L(this.avatars_.get(i2));
            }
            int size = iM16901K + iM16902L + getAvatarsList().size();
            long j = this.memberCount_;
            if (j != 0) {
                size += CodedOutputStream.m16931v(4, j);
            }
            if (!this.liveId_.isEmpty()) {
                size += CodedOutputStream.m16901K(5, getLiveId());
            }
            this.memoizedSerializedSize = size;
            return size;
        }

        @Override // com.p1.mobile.longlink.msg.connector.LongLinkFixedRoomMessage.LiveFixedRoomChatCellRoomInfoOrBuilder
        public String getTitle() {
            return this.title_;
        }

        @Override // com.p1.mobile.longlink.msg.connector.LongLinkFixedRoomMessage.LiveFixedRoomChatCellRoomInfoOrBuilder
        public ByteString getTitleBytes() {
            return ByteString.copyFromUtf8(this.title_);
        }

        @Override // com.google.protobuf.InterfaceC3419q
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (!this.roomId_.isEmpty()) {
                codedOutputStream.mo16939D0(1, getRoomId());
            }
            if (!this.title_.isEmpty()) {
                codedOutputStream.mo16939D0(2, getTitle());
            }
            for (int i = 0; i < this.avatars_.size(); i++) {
                codedOutputStream.mo16939D0(3, this.avatars_.get(i));
            }
            long j = this.memberCount_;
            if (j != 0) {
                codedOutputStream.m16972u0(4, j);
            }
            if (this.liveId_.isEmpty()) {
                return;
            }
            codedOutputStream.mo16939D0(5, getLiveId());
        }

        public static LiveFixedRoomChatCellRoomInfo parseDelimitedFrom(InputStream inputStream, C3410h c3410h) throws IOException {
            return (LiveFixedRoomChatCellRoomInfo) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, c3410h);
        }

        public static LiveFixedRoomChatCellRoomInfo parseFrom(ByteString byteString, C3410h c3410h) throws InvalidProtocolBufferException {
            return (LiveFixedRoomChatCellRoomInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, c3410h);
        }

        public static LiveFixedRoomChatCellRoomInfo parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (LiveFixedRoomChatCellRoomInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static LiveFixedRoomChatCellRoomInfo parseFrom(byte[] bArr, C3410h c3410h) throws InvalidProtocolBufferException {
            return (LiveFixedRoomChatCellRoomInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, c3410h);
        }

        public static LiveFixedRoomChatCellRoomInfo parseFrom(InputStream inputStream) throws IOException {
            return (LiveFixedRoomChatCellRoomInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static LiveFixedRoomChatCellRoomInfo parseFrom(InputStream inputStream, C3410h c3410h) throws IOException {
            return (LiveFixedRoomChatCellRoomInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, c3410h);
        }

        public static LiveFixedRoomChatCellRoomInfo parseFrom(C3407e c3407e) throws IOException {
            return (LiveFixedRoomChatCellRoomInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, c3407e);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static LiveFixedRoomChatCellRoomInfo parseFrom(C3407e c3407e, C3410h c3410h) throws IOException {
            return (LiveFixedRoomChatCellRoomInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, c3407e, c3410h);
        }
    }
}
