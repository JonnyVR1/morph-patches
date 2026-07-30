package com.p046p1.mobile.longlink.msg.liveroom;

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
import java.util.Collections;
import java.util.List;
import org.spongycastle.asn1.eac.EACTags;
import org.spongycastle.crypto.tls.CipherSuite;
import p149l.aag0;
import p149l.bz00;
import p149l.i860;
import p149l.o6z;

/* JADX INFO: loaded from: classes8.dex */
public final class LongLinkMultiCallMessage {

    /* JADX INFO: renamed from: com.p1.mobile.longlink.msg.liveroom.LongLinkMultiCallMessage$1 */
    public static /* synthetic */ class C45021 {

        /* JADX INFO: renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f15978xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f15978xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f15978xa1df5c61[GeneratedMessageLite.MethodToInvoke.IS_INITIALIZED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f15978xa1df5c61[GeneratedMessageLite.MethodToInvoke.MAKE_IMMUTABLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f15978xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f15978xa1df5c61[GeneratedMessageLite.MethodToInvoke.VISIT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f15978xa1df5c61[GeneratedMessageLite.MethodToInvoke.MERGE_FROM_STREAM.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f15978xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f15978xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    public interface MultiCallActionMessageOrBuilder extends o6z {
        @Override // p149l.o6z
        /* synthetic */ InterfaceC3419q getDefaultInstanceForType();

        String getMultiCallOrder();

        ByteString getMultiCallOrderBytes();

        MultiCallActionMessage.Type getType();

        int getTypeValue();

        String getUserId();

        ByteString getUserIdBytes();

        @Override // p149l.o6z
        /* synthetic */ boolean isInitialized();
    }

    public interface MultiCallInviteMessageOrBuilder extends o6z {
        @Override // p149l.o6z
        /* synthetic */ InterfaceC3419q getDefaultInstanceForType();

        MultiCallInvite getMultiCallInvite();

        MultiCallInviteMessage.Type getType();

        int getTypeValue();

        boolean hasMultiCallInvite();

        @Override // p149l.o6z
        /* synthetic */ boolean isInitialized();
    }

    public interface MultiCallInviteOrBuilder extends o6z {
        @Override // p149l.o6z
        /* synthetic */ InterfaceC3419q getDefaultInstanceForType();

        String getId();

        ByteString getIdBytes();

        String getOwnerLiveId();

        ByteString getOwnerLiveIdBytes();

        String getOwnerMultiCallOrder();

        ByteString getOwnerMultiCallOrderBytes();

        String getOwnerUserAvatar();

        ByteString getOwnerUserAvatarBytes();

        String getOwnerUserId();

        ByteString getOwnerUserIdBytes();

        String getOwnerUserName();

        ByteString getOwnerUserNameBytes();

        int getShowSeconds();

        String getToLiveId();

        ByteString getToLiveIdBytes();

        String getToUserAvatar();

        ByteString getToUserAvatarBytes();

        String getToUserId();

        ByteString getToUserIdBytes();

        String getToUserName();

        ByteString getToUserNameBytes();

        @Override // p149l.o6z
        /* synthetic */ boolean isInitialized();
    }

    public interface MultiCallMessageOrBuilder extends o6z {
        @Override // p149l.o6z
        /* synthetic */ InterfaceC3419q getDefaultInstanceForType();

        MultiCall getMultiCall();

        Template.TemplateData getTemplate();

        String getToast();

        ByteString getToastBytes();

        MultiCallMessage.Type getType();

        int getTypeValue();

        boolean hasMultiCall();

        boolean hasTemplate();

        @Override // p149l.o6z
        /* synthetic */ boolean isInitialized();
    }

    public interface MultiCallOrBuilder extends o6z {
        String getCategory();

        ByteString getCategoryBytes();

        @Override // p149l.o6z
        /* synthetic */ InterfaceC3419q getDefaultInstanceForType();

        String getId();

        ByteString getIdBytes();

        boolean getIsAway();

        boolean getIsLeadRole();

        String getLiveId();

        ByteString getLiveIdBytes();

        String getMutedByUserIds(int i);

        ByteString getMutedByUserIdsBytes(int i);

        int getMutedByUserIdsCount();

        List<String> getMutedByUserIdsList();

        String getOwnerLiveId();

        ByteString getOwnerLiveIdBytes();

        String getOwnerMultiCallOrder();

        ByteString getOwnerMultiCallOrderBytes();

        String getOwnerRoomId();

        ByteString getOwnerRoomIdBytes();

        String getOwnerUserId();

        ByteString getOwnerUserIdBytes();

        int getPosition();

        long getPushRemainCount();

        long getReceivedRewardPoint();

        String getRefreshPushStreamUrl();

        ByteString getRefreshPushStreamUrlBytes();

        String getRole();

        ByteString getRoleBytes();

        String getRoomId();

        ByteString getRoomIdBytes();

        long getShowSeconds();

        String getSource();

        ByteString getSourceBytes();

        String getState();

        ByteString getStateBytes();

        String getUserAvatar();

        ByteString getUserAvatarBytes();

        String getUserId();

        ByteString getUserIdBytes();

        String getUserName();

        ByteString getUserNameBytes();

        @Override // p149l.o6z
        /* synthetic */ boolean isInitialized();
    }

    public interface MultiCallSwitchToLeadRoleInviteMessageOrBuilder extends o6z {
        @Override // p149l.o6z
        /* synthetic */ InterfaceC3419q getDefaultInstanceForType();

        MultiCallSwitchToLeadRoleInvite getInvite();

        MultiCallSwitchToLeadRoleInviteMessage.Type getType();

        int getTypeValue();

        boolean hasInvite();

        @Override // p149l.o6z
        /* synthetic */ boolean isInitialized();
    }

    public interface MultiCallSwitchToLeadRoleInviteOrBuilder extends o6z {
        @Override // p149l.o6z
        /* synthetic */ InterfaceC3419q getDefaultInstanceForType();

        String getId();

        ByteString getIdBytes();

        String getOwnerUserAvatar();

        ByteString getOwnerUserAvatarBytes();

        String getOwnerUserId();

        ByteString getOwnerUserIdBytes();

        String getOwnerUserName();

        ByteString getOwnerUserNameBytes();

        long getShowSeconds();

        InviteState getState();

        int getStateValue();

        String getToUserAvatar();

        ByteString getToUserAvatarBytes();

        String getToUserId();

        ByteString getToUserIdBytes();

        String getToUserName();

        ByteString getToUserNameBytes();

        @Override // p149l.o6z
        /* synthetic */ boolean isInitialized();
    }

    public interface MultiCallTurnOnGuideOrBuilder extends o6z {
        String getAvatars(int i);

        ByteString getAvatarsBytes(int i);

        int getAvatarsCount();

        List<String> getAvatarsList();

        String getContent();

        ByteString getContentBytes();

        @Override // p149l.o6z
        /* synthetic */ InterfaceC3419q getDefaultInstanceForType();

        String getReason();

        ByteString getReasonBytes();

        String getSchema();

        ByteString getSchemaBytes();

        String getTitle();

        ByteString getTitleBytes();

        @Override // p149l.o6z
        /* synthetic */ boolean isInitialized();
    }

    private LongLinkMultiCallMessage() {
    }

    public static void registerAllExtensions(C3410h c3410h) {
    }

    public static final class MultiCallActionMessage extends GeneratedMessageLite<MultiCallActionMessage, Builder> implements MultiCallActionMessageOrBuilder {
        private static final MultiCallActionMessage DEFAULT_INSTANCE;
        public static final int MULTICALLORDER_FIELD_NUMBER = 3;
        private static volatile i860<MultiCallActionMessage> PARSER = null;
        public static final int TYPE_FIELD_NUMBER = 1;
        public static final int USERID_FIELD_NUMBER = 2;
        private int type_;
        private String userId_ = "";
        private String multiCallOrder_ = "";

        public static final class Builder extends GeneratedMessageLite.AbstractC3380b<MultiCallActionMessage, Builder> implements MultiCallActionMessageOrBuilder {
            private Builder() {
                super(MultiCallActionMessage.DEFAULT_INSTANCE);
            }

            public Builder clearMultiCallOrder() {
                copyOnWrite();
                ((MultiCallActionMessage) this.instance).clearMultiCallOrder();
                return this;
            }

            public Builder clearType() {
                copyOnWrite();
                ((MultiCallActionMessage) this.instance).clearType();
                return this;
            }

            public Builder clearUserId() {
                copyOnWrite();
                ((MultiCallActionMessage) this.instance).clearUserId();
                return this;
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkMultiCallMessage.MultiCallActionMessageOrBuilder
            public String getMultiCallOrder() {
                return ((MultiCallActionMessage) this.instance).getMultiCallOrder();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkMultiCallMessage.MultiCallActionMessageOrBuilder
            public ByteString getMultiCallOrderBytes() {
                return ((MultiCallActionMessage) this.instance).getMultiCallOrderBytes();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkMultiCallMessage.MultiCallActionMessageOrBuilder
            public Type getType() {
                return ((MultiCallActionMessage) this.instance).getType();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkMultiCallMessage.MultiCallActionMessageOrBuilder
            public int getTypeValue() {
                return ((MultiCallActionMessage) this.instance).getTypeValue();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkMultiCallMessage.MultiCallActionMessageOrBuilder
            public String getUserId() {
                return ((MultiCallActionMessage) this.instance).getUserId();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkMultiCallMessage.MultiCallActionMessageOrBuilder
            public ByteString getUserIdBytes() {
                return ((MultiCallActionMessage) this.instance).getUserIdBytes();
            }

            public Builder setMultiCallOrder(String str) {
                copyOnWrite();
                ((MultiCallActionMessage) this.instance).setMultiCallOrder(str);
                return this;
            }

            public Builder setMultiCallOrderBytes(ByteString byteString) {
                copyOnWrite();
                ((MultiCallActionMessage) this.instance).setMultiCallOrderBytes(byteString);
                return this;
            }

            public Builder setType(Type type) {
                copyOnWrite();
                ((MultiCallActionMessage) this.instance).setType(type);
                return this;
            }

            public Builder setTypeValue(int i) {
                copyOnWrite();
                ((MultiCallActionMessage) this.instance).setTypeValue(i);
                return this;
            }

            public Builder setUserId(String str) {
                copyOnWrite();
                ((MultiCallActionMessage) this.instance).setUserId(str);
                return this;
            }

            public Builder setUserIdBytes(ByteString byteString) {
                copyOnWrite();
                ((MultiCallActionMessage) this.instance).setUserIdBytes(byteString);
                return this;
            }
        }

        static {
            MultiCallActionMessage multiCallActionMessage = new MultiCallActionMessage();
            DEFAULT_INSTANCE = multiCallActionMessage;
            multiCallActionMessage.makeImmutable();
        }

        private MultiCallActionMessage() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearMultiCallOrder() {
            this.multiCallOrder_ = getDefaultInstance().getMultiCallOrder();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearType() {
            this.type_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearUserId() {
            this.userId_ = getDefaultInstance().getUserId();
        }

        public static MultiCallActionMessage getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder(MultiCallActionMessage multiCallActionMessage) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(multiCallActionMessage);
        }

        public static MultiCallActionMessage parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (MultiCallActionMessage) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static MultiCallActionMessage parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (MultiCallActionMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static i860<MultiCallActionMessage> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setMultiCallOrder(String str) {
            str.getClass();
            this.multiCallOrder_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setMultiCallOrderBytes(ByteString byteString) {
            byteString.getClass();
            AbstractC3403a.checkByteStringIsUtf8(byteString);
            this.multiCallOrder_ = byteString.toStringUtf8();
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
            AbstractC3403a.checkByteStringIsUtf8(byteString);
            this.userId_ = byteString.toStringUtf8();
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            boolean z = false;
            switch (C45021.f15978xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new MultiCallActionMessage();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                    return null;
                case 4:
                    return new Builder();
                case 5:
                    GeneratedMessageLite.InterfaceC3386h interfaceC3386h = (GeneratedMessageLite.InterfaceC3386h) obj;
                    MultiCallActionMessage multiCallActionMessage = (MultiCallActionMessage) obj2;
                    int i = this.type_;
                    boolean z2 = i != 0;
                    int i2 = multiCallActionMessage.type_;
                    this.type_ = interfaceC3386h.mo16996e(z2, i, i2 != 0, i2);
                    this.userId_ = interfaceC3386h.mo16997f(!this.userId_.isEmpty(), this.userId_, !multiCallActionMessage.userId_.isEmpty(), multiCallActionMessage.userId_);
                    this.multiCallOrder_ = interfaceC3386h.mo16997f(!this.multiCallOrder_.isEmpty(), this.multiCallOrder_, !multiCallActionMessage.multiCallOrder_.isEmpty(), multiCallActionMessage.multiCallOrder_);
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
                                    this.userId_ = c3407e.m17115L();
                                } else if (iM17116M == 26) {
                                    this.multiCallOrder_ = c3407e.m17115L();
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
                        synchronized (MultiCallActionMessage.class) {
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

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkMultiCallMessage.MultiCallActionMessageOrBuilder
        public String getMultiCallOrder() {
            return this.multiCallOrder_;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkMultiCallMessage.MultiCallActionMessageOrBuilder
        public ByteString getMultiCallOrderBytes() {
            return ByteString.copyFromUtf8(this.multiCallOrder_);
        }

        @Override // com.google.protobuf.InterfaceC3419q
        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int iM16922m = this.type_ != Type.turnOnMultiCall.getNumber() ? CodedOutputStream.m16922m(1, this.type_) : 0;
            if (!this.userId_.isEmpty()) {
                iM16922m += CodedOutputStream.m16901K(2, getUserId());
            }
            if (!this.multiCallOrder_.isEmpty()) {
                iM16922m += CodedOutputStream.m16901K(3, getMultiCallOrder());
            }
            this.memoizedSerializedSize = iM16922m;
            return iM16922m;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkMultiCallMessage.MultiCallActionMessageOrBuilder
        public Type getType() {
            Type typeForNumber = Type.forNumber(this.type_);
            return typeForNumber == null ? Type.UNRECOGNIZED : typeForNumber;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkMultiCallMessage.MultiCallActionMessageOrBuilder
        public int getTypeValue() {
            return this.type_;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkMultiCallMessage.MultiCallActionMessageOrBuilder
        public String getUserId() {
            return this.userId_;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkMultiCallMessage.MultiCallActionMessageOrBuilder
        public ByteString getUserIdBytes() {
            return ByteString.copyFromUtf8(this.userId_);
        }

        @Override // com.google.protobuf.InterfaceC3419q
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (this.type_ != Type.turnOnMultiCall.getNumber()) {
                codedOutputStream.m16960i0(1, this.type_);
            }
            if (!this.userId_.isEmpty()) {
                codedOutputStream.mo16939D0(2, getUserId());
            }
            if (this.multiCallOrder_.isEmpty()) {
                return;
            }
            codedOutputStream.mo16939D0(3, getMultiCallOrder());
        }

        public enum Type implements C3414l.c {
            turnOnMultiCall(0),
            turnOffMultiCall(1),
            turnOnFreeCall(2),
            turnOffFreeCall(3),
            switch6MaxCallNum(4),
            switch9MaxCallNum(5),
            UNRECOGNIZED(-1);

            private static final C3414l.d<Type> internalValueMap = new C3414l.d<Type>() { // from class: com.p1.mobile.longlink.msg.liveroom.LongLinkMultiCallMessage.MultiCallActionMessage.Type.1
                @Override // com.google.protobuf.C3414l.d
                public Type findValueByNumber(int i) {
                    return Type.forNumber(i);
                }
            };
            public static final int switch6MaxCallNum_VALUE = 4;
            public static final int switch9MaxCallNum_VALUE = 5;
            public static final int turnOffFreeCall_VALUE = 3;
            public static final int turnOffMultiCall_VALUE = 1;
            public static final int turnOnFreeCall_VALUE = 2;
            public static final int turnOnMultiCall_VALUE = 0;
            private final int value;

            Type(int i) {
                this.value = i;
            }

            public static Type forNumber(int i) {
                if (i == 0) {
                    return turnOnMultiCall;
                }
                if (i == 1) {
                    return turnOffMultiCall;
                }
                if (i == 2) {
                    return turnOnFreeCall;
                }
                if (i == 3) {
                    return turnOffFreeCall;
                }
                if (i == 4) {
                    return switch6MaxCallNum;
                }
                if (i != 5) {
                    return null;
                }
                return switch9MaxCallNum;
            }

            public static C3414l.d<Type> internalGetValueMap() {
                return internalValueMap;
            }

            @Override // com.google.protobuf.C3414l.c
            public final int getNumber() {
                return this.value;
            }

            @Deprecated
            public static Type valueOf(int i) {
                return forNumber(i);
            }
        }

        public static MultiCallActionMessage parseDelimitedFrom(InputStream inputStream, C3410h c3410h) throws IOException {
            return (MultiCallActionMessage) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, c3410h);
        }

        public static MultiCallActionMessage parseFrom(ByteString byteString, C3410h c3410h) throws InvalidProtocolBufferException {
            return (MultiCallActionMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, c3410h);
        }

        public static MultiCallActionMessage parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (MultiCallActionMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static MultiCallActionMessage parseFrom(byte[] bArr, C3410h c3410h) throws InvalidProtocolBufferException {
            return (MultiCallActionMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, c3410h);
        }

        public static MultiCallActionMessage parseFrom(InputStream inputStream) throws IOException {
            return (MultiCallActionMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static MultiCallActionMessage parseFrom(InputStream inputStream, C3410h c3410h) throws IOException {
            return (MultiCallActionMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, c3410h);
        }

        public static MultiCallActionMessage parseFrom(C3407e c3407e) throws IOException {
            return (MultiCallActionMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, c3407e);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static MultiCallActionMessage parseFrom(C3407e c3407e, C3410h c3410h) throws IOException {
            return (MultiCallActionMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, c3407e, c3410h);
        }
    }

    public static final class MultiCallInviteMessage extends GeneratedMessageLite<MultiCallInviteMessage, Builder> implements MultiCallInviteMessageOrBuilder {
        private static final MultiCallInviteMessage DEFAULT_INSTANCE;
        public static final int MULTICALLINVITE_FIELD_NUMBER = 2;
        private static volatile i860<MultiCallInviteMessage> PARSER = null;
        public static final int TYPE_FIELD_NUMBER = 1;
        private MultiCallInvite multiCallInvite_;
        private int type_;

        static {
            MultiCallInviteMessage multiCallInviteMessage = new MultiCallInviteMessage();
            DEFAULT_INSTANCE = multiCallInviteMessage;
            multiCallInviteMessage.makeImmutable();
        }

        private MultiCallInviteMessage() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearMultiCallInvite() {
            this.multiCallInvite_ = null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearType() {
            this.type_ = 0;
        }

        public static MultiCallInviteMessage getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeMultiCallInvite(MultiCallInvite multiCallInvite) {
            MultiCallInvite multiCallInvite2 = this.multiCallInvite_;
            if (multiCallInvite2 == null || multiCallInvite2 == MultiCallInvite.getDefaultInstance()) {
                this.multiCallInvite_ = multiCallInvite;
            } else {
                this.multiCallInvite_ = MultiCallInvite.newBuilder(this.multiCallInvite_).mergeFrom(multiCallInvite).buildPartial();
            }
        }

        public static Builder newBuilder(MultiCallInviteMessage multiCallInviteMessage) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(multiCallInviteMessage);
        }

        public static MultiCallInviteMessage parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (MultiCallInviteMessage) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static MultiCallInviteMessage parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (MultiCallInviteMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static i860<MultiCallInviteMessage> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setMultiCallInvite(MultiCallInvite.Builder builder) {
            this.multiCallInvite_ = builder.build();
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

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            boolean z = false;
            switch (C45021.f15978xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new MultiCallInviteMessage();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                    return null;
                case 4:
                    return new Builder();
                case 5:
                    GeneratedMessageLite.InterfaceC3386h interfaceC3386h = (GeneratedMessageLite.InterfaceC3386h) obj;
                    MultiCallInviteMessage multiCallInviteMessage = (MultiCallInviteMessage) obj2;
                    int i = this.type_;
                    boolean z2 = i != 0;
                    int i2 = multiCallInviteMessage.type_;
                    this.type_ = interfaceC3386h.mo16996e(z2, i, i2 != 0, i2);
                    this.multiCallInvite_ = (MultiCallInvite) interfaceC3386h.mo17006o(this.multiCallInvite_, multiCallInviteMessage.multiCallInvite_);
                    GeneratedMessageLite.C3385g c3385g = GeneratedMessageLite.C3385g.INSTANCE;
                    return this;
                case 6:
                    C3407e c3407e = (C3407e) obj;
                    C3410h c3410h = (C3410h) obj2;
                    while (!z) {
                        try {
                            int iM17116M = c3407e.m17116M();
                            if (iM17116M != 0) {
                                if (iM17116M == 8) {
                                    this.type_ = c3407e.m17136p();
                                } else if (iM17116M == 18) {
                                    MultiCallInvite multiCallInvite = this.multiCallInvite_;
                                    MultiCallInvite.Builder builder = multiCallInvite != null ? multiCallInvite.toBuilder() : null;
                                    MultiCallInvite multiCallInvite2 = (MultiCallInvite) c3407e.m17143w(MultiCallInvite.parser(), c3410h);
                                    this.multiCallInvite_ = multiCallInvite2;
                                    if (builder != null) {
                                        builder.mergeFrom(multiCallInvite2);
                                        this.multiCallInvite_ = builder.buildPartial();
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
                        synchronized (MultiCallInviteMessage.class) {
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

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkMultiCallMessage.MultiCallInviteMessageOrBuilder
        public MultiCallInvite getMultiCallInvite() {
            MultiCallInvite multiCallInvite = this.multiCallInvite_;
            return multiCallInvite == null ? MultiCallInvite.getDefaultInstance() : multiCallInvite;
        }

        @Override // com.google.protobuf.InterfaceC3419q
        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int iM16922m = this.type_ != Type.invite.getNumber() ? CodedOutputStream.m16922m(1, this.type_) : 0;
            if (this.multiCallInvite_ != null) {
                iM16922m += CodedOutputStream.m16893C(2, getMultiCallInvite());
            }
            this.memoizedSerializedSize = iM16922m;
            return iM16922m;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkMultiCallMessage.MultiCallInviteMessageOrBuilder
        public Type getType() {
            Type typeForNumber = Type.forNumber(this.type_);
            return typeForNumber == null ? Type.UNRECOGNIZED : typeForNumber;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkMultiCallMessage.MultiCallInviteMessageOrBuilder
        public int getTypeValue() {
            return this.type_;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkMultiCallMessage.MultiCallInviteMessageOrBuilder
        public boolean hasMultiCallInvite() {
            return this.multiCallInvite_ != null;
        }

        @Override // com.google.protobuf.InterfaceC3419q
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (this.type_ != Type.invite.getNumber()) {
                codedOutputStream.m16960i0(1, this.type_);
            }
            if (this.multiCallInvite_ != null) {
                codedOutputStream.mo16974w0(2, getMultiCallInvite());
            }
        }

        public enum Type implements C3414l.c {
            invite(0),
            reject(1),
            accept(2),
            timeout(3),
            UNRECOGNIZED(-1);

            public static final int accept_VALUE = 2;
            private static final C3414l.d<Type> internalValueMap = new C3414l.d<Type>() { // from class: com.p1.mobile.longlink.msg.liveroom.LongLinkMultiCallMessage.MultiCallInviteMessage.Type.1
                @Override // com.google.protobuf.C3414l.d
                public Type findValueByNumber(int i) {
                    return Type.forNumber(i);
                }
            };
            public static final int invite_VALUE = 0;
            public static final int reject_VALUE = 1;
            public static final int timeout_VALUE = 3;
            private final int value;

            Type(int i) {
                this.value = i;
            }

            public static Type forNumber(int i) {
                if (i == 0) {
                    return invite;
                }
                if (i == 1) {
                    return reject;
                }
                if (i == 2) {
                    return accept;
                }
                if (i != 3) {
                    return null;
                }
                return timeout;
            }

            public static C3414l.d<Type> internalGetValueMap() {
                return internalValueMap;
            }

            @Override // com.google.protobuf.C3414l.c
            public final int getNumber() {
                return this.value;
            }

            @Deprecated
            public static Type valueOf(int i) {
                return forNumber(i);
            }
        }

        public static MultiCallInviteMessage parseDelimitedFrom(InputStream inputStream, C3410h c3410h) throws IOException {
            return (MultiCallInviteMessage) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, c3410h);
        }

        public static MultiCallInviteMessage parseFrom(ByteString byteString, C3410h c3410h) throws InvalidProtocolBufferException {
            return (MultiCallInviteMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, c3410h);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setMultiCallInvite(MultiCallInvite multiCallInvite) {
            multiCallInvite.getClass();
            this.multiCallInvite_ = multiCallInvite;
        }

        public static final class Builder extends GeneratedMessageLite.AbstractC3380b<MultiCallInviteMessage, Builder> implements MultiCallInviteMessageOrBuilder {
            private Builder() {
                super(MultiCallInviteMessage.DEFAULT_INSTANCE);
            }

            public Builder clearMultiCallInvite() {
                copyOnWrite();
                ((MultiCallInviteMessage) this.instance).clearMultiCallInvite();
                return this;
            }

            public Builder clearType() {
                copyOnWrite();
                ((MultiCallInviteMessage) this.instance).clearType();
                return this;
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkMultiCallMessage.MultiCallInviteMessageOrBuilder
            public MultiCallInvite getMultiCallInvite() {
                return ((MultiCallInviteMessage) this.instance).getMultiCallInvite();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkMultiCallMessage.MultiCallInviteMessageOrBuilder
            public Type getType() {
                return ((MultiCallInviteMessage) this.instance).getType();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkMultiCallMessage.MultiCallInviteMessageOrBuilder
            public int getTypeValue() {
                return ((MultiCallInviteMessage) this.instance).getTypeValue();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkMultiCallMessage.MultiCallInviteMessageOrBuilder
            public boolean hasMultiCallInvite() {
                return ((MultiCallInviteMessage) this.instance).hasMultiCallInvite();
            }

            public Builder mergeMultiCallInvite(MultiCallInvite multiCallInvite) {
                copyOnWrite();
                ((MultiCallInviteMessage) this.instance).mergeMultiCallInvite(multiCallInvite);
                return this;
            }

            public Builder setMultiCallInvite(MultiCallInvite multiCallInvite) {
                copyOnWrite();
                ((MultiCallInviteMessage) this.instance).setMultiCallInvite(multiCallInvite);
                return this;
            }

            public Builder setType(Type type) {
                copyOnWrite();
                ((MultiCallInviteMessage) this.instance).setType(type);
                return this;
            }

            public Builder setTypeValue(int i) {
                copyOnWrite();
                ((MultiCallInviteMessage) this.instance).setTypeValue(i);
                return this;
            }

            public Builder setMultiCallInvite(MultiCallInvite.Builder builder) {
                copyOnWrite();
                ((MultiCallInviteMessage) this.instance).setMultiCallInvite(builder);
                return this;
            }
        }

        public static MultiCallInviteMessage parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (MultiCallInviteMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static MultiCallInviteMessage parseFrom(byte[] bArr, C3410h c3410h) throws InvalidProtocolBufferException {
            return (MultiCallInviteMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, c3410h);
        }

        public static MultiCallInviteMessage parseFrom(InputStream inputStream) throws IOException {
            return (MultiCallInviteMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static MultiCallInviteMessage parseFrom(InputStream inputStream, C3410h c3410h) throws IOException {
            return (MultiCallInviteMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, c3410h);
        }

        public static MultiCallInviteMessage parseFrom(C3407e c3407e) throws IOException {
            return (MultiCallInviteMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, c3407e);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static MultiCallInviteMessage parseFrom(C3407e c3407e, C3410h c3410h) throws IOException {
            return (MultiCallInviteMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, c3407e, c3410h);
        }
    }

    public static final class MultiCallMessage extends GeneratedMessageLite<MultiCallMessage, Builder> implements MultiCallMessageOrBuilder {
        private static final MultiCallMessage DEFAULT_INSTANCE;
        public static final int MULTICALL_FIELD_NUMBER = 2;
        private static volatile i860<MultiCallMessage> PARSER = null;
        public static final int TEMPLATE_FIELD_NUMBER = 4;
        public static final int TOAST_FIELD_NUMBER = 3;
        public static final int TYPE_FIELD_NUMBER = 1;
        private MultiCall multiCall_;
        private Template.TemplateData template_;
        private String toast_ = "";
        private int type_;

        static {
            MultiCallMessage multiCallMessage = new MultiCallMessage();
            DEFAULT_INSTANCE = multiCallMessage;
            multiCallMessage.makeImmutable();
        }

        private MultiCallMessage() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearMultiCall() {
            this.multiCall_ = null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearTemplate() {
            this.template_ = null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearToast() {
            this.toast_ = getDefaultInstance().getToast();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearType() {
            this.type_ = 0;
        }

        public static MultiCallMessage getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeMultiCall(MultiCall multiCall) {
            MultiCall multiCall2 = this.multiCall_;
            if (multiCall2 == null || multiCall2 == MultiCall.getDefaultInstance()) {
                this.multiCall_ = multiCall;
            } else {
                this.multiCall_ = MultiCall.newBuilder(this.multiCall_).mergeFrom(multiCall).buildPartial();
            }
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

        public static Builder newBuilder(MultiCallMessage multiCallMessage) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(multiCallMessage);
        }

        public static MultiCallMessage parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (MultiCallMessage) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static MultiCallMessage parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (MultiCallMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static i860<MultiCallMessage> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setMultiCall(MultiCall.Builder builder) {
            this.multiCall_ = builder.build();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTemplate(Template.TemplateData.Builder builder) {
            this.template_ = builder.build();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setToast(String str) {
            str.getClass();
            this.toast_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setToastBytes(ByteString byteString) {
            byteString.getClass();
            AbstractC3403a.checkByteStringIsUtf8(byteString);
            this.toast_ = byteString.toStringUtf8();
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

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            boolean z = false;
            switch (C45021.f15978xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new MultiCallMessage();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                    return null;
                case 4:
                    return new Builder();
                case 5:
                    GeneratedMessageLite.InterfaceC3386h interfaceC3386h = (GeneratedMessageLite.InterfaceC3386h) obj;
                    MultiCallMessage multiCallMessage = (MultiCallMessage) obj2;
                    int i = this.type_;
                    boolean z2 = i != 0;
                    int i2 = multiCallMessage.type_;
                    this.type_ = interfaceC3386h.mo16996e(z2, i, i2 != 0, i2);
                    this.multiCall_ = (MultiCall) interfaceC3386h.mo17006o(this.multiCall_, multiCallMessage.multiCall_);
                    this.toast_ = interfaceC3386h.mo16997f(!this.toast_.isEmpty(), this.toast_, !multiCallMessage.toast_.isEmpty(), multiCallMessage.toast_);
                    this.template_ = (Template.TemplateData) interfaceC3386h.mo17006o(this.template_, multiCallMessage.template_);
                    GeneratedMessageLite.C3385g c3385g = GeneratedMessageLite.C3385g.INSTANCE;
                    return this;
                case 6:
                    C3407e c3407e = (C3407e) obj;
                    C3410h c3410h = (C3410h) obj2;
                    while (!z) {
                        try {
                            int iM17116M = c3407e.m17116M();
                            if (iM17116M != 0) {
                                if (iM17116M == 8) {
                                    this.type_ = c3407e.m17136p();
                                } else if (iM17116M == 18) {
                                    MultiCall multiCall = this.multiCall_;
                                    MultiCall.Builder builder = multiCall != null ? multiCall.toBuilder() : null;
                                    MultiCall multiCall2 = (MultiCall) c3407e.m17143w(MultiCall.parser(), c3410h);
                                    this.multiCall_ = multiCall2;
                                    if (builder != null) {
                                        builder.mergeFrom(multiCall2);
                                        this.multiCall_ = builder.buildPartial();
                                    }
                                } else if (iM17116M == 26) {
                                    this.toast_ = c3407e.m17115L();
                                } else if (iM17116M == 34) {
                                    Template.TemplateData templateData = this.template_;
                                    Template.TemplateData.Builder builder2 = templateData != null ? templateData.toBuilder() : null;
                                    Template.TemplateData templateData2 = (Template.TemplateData) c3407e.m17143w(Template.TemplateData.parser(), c3410h);
                                    this.template_ = templateData2;
                                    if (builder2 != null) {
                                        builder2.mergeFrom(templateData2);
                                        this.template_ = builder2.buildPartial();
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
                        synchronized (MultiCallMessage.class) {
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

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkMultiCallMessage.MultiCallMessageOrBuilder
        public MultiCall getMultiCall() {
            MultiCall multiCall = this.multiCall_;
            return multiCall == null ? MultiCall.getDefaultInstance() : multiCall;
        }

        @Override // com.google.protobuf.InterfaceC3419q
        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int iM16922m = this.type_ != Type.apply.getNumber() ? CodedOutputStream.m16922m(1, this.type_) : 0;
            if (this.multiCall_ != null) {
                iM16922m += CodedOutputStream.m16893C(2, getMultiCall());
            }
            if (!this.toast_.isEmpty()) {
                iM16922m += CodedOutputStream.m16901K(3, getToast());
            }
            if (this.template_ != null) {
                iM16922m += CodedOutputStream.m16893C(4, getTemplate());
            }
            this.memoizedSerializedSize = iM16922m;
            return iM16922m;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkMultiCallMessage.MultiCallMessageOrBuilder
        public Template.TemplateData getTemplate() {
            Template.TemplateData templateData = this.template_;
            return templateData == null ? Template.TemplateData.getDefaultInstance() : templateData;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkMultiCallMessage.MultiCallMessageOrBuilder
        public String getToast() {
            return this.toast_;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkMultiCallMessage.MultiCallMessageOrBuilder
        public ByteString getToastBytes() {
            return ByteString.copyFromUtf8(this.toast_);
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkMultiCallMessage.MultiCallMessageOrBuilder
        public Type getType() {
            Type typeForNumber = Type.forNumber(this.type_);
            return typeForNumber == null ? Type.UNRECOGNIZED : typeForNumber;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkMultiCallMessage.MultiCallMessageOrBuilder
        public int getTypeValue() {
            return this.type_;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkMultiCallMessage.MultiCallMessageOrBuilder
        public boolean hasMultiCall() {
            return this.multiCall_ != null;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkMultiCallMessage.MultiCallMessageOrBuilder
        public boolean hasTemplate() {
            return this.template_ != null;
        }

        @Override // com.google.protobuf.InterfaceC3419q
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (this.type_ != Type.apply.getNumber()) {
                codedOutputStream.m16960i0(1, this.type_);
            }
            if (this.multiCall_ != null) {
                codedOutputStream.mo16974w0(2, getMultiCall());
            }
            if (!this.toast_.isEmpty()) {
                codedOutputStream.mo16939D0(3, getToast());
            }
            if (this.template_ != null) {
                codedOutputStream.mo16974w0(4, getTemplate());
            }
        }

        public enum Type implements C3414l.c {
            apply(0),
            cancel(1),
            approve(2),
            success(3),
            hangUp(4),
            goAway(5),
            comeBack(6),
            mute(7),
            unMute(8),
            switchToVideo(9),
            inviteSwitchToVideo(10),
            rejectSwitchToVideo(11),
            pushSuccess(12),
            switchToLeadRole(13),
            cancelLeadRole(14),
            updatePosition(15),
            cdnFail(16),
            UNRECOGNIZED(-1);

            public static final int apply_VALUE = 0;
            public static final int approve_VALUE = 2;
            public static final int cancelLeadRole_VALUE = 14;
            public static final int cancel_VALUE = 1;
            public static final int cdnFail_VALUE = 16;
            public static final int comeBack_VALUE = 6;
            public static final int goAway_VALUE = 5;
            public static final int hangUp_VALUE = 4;
            private static final C3414l.d<Type> internalValueMap = new C3414l.d<Type>() { // from class: com.p1.mobile.longlink.msg.liveroom.LongLinkMultiCallMessage.MultiCallMessage.Type.1
                @Override // com.google.protobuf.C3414l.d
                public Type findValueByNumber(int i) {
                    return Type.forNumber(i);
                }
            };
            public static final int inviteSwitchToVideo_VALUE = 10;
            public static final int mute_VALUE = 7;
            public static final int pushSuccess_VALUE = 12;
            public static final int rejectSwitchToVideo_VALUE = 11;
            public static final int success_VALUE = 3;
            public static final int switchToLeadRole_VALUE = 13;
            public static final int switchToVideo_VALUE = 9;
            public static final int unMute_VALUE = 8;
            public static final int updatePosition_VALUE = 15;
            private final int value;

            Type(int i) {
                this.value = i;
            }

            public static Type forNumber(int i) {
                switch (i) {
                    case 0:
                        return apply;
                    case 1:
                        return cancel;
                    case 2:
                        return approve;
                    case 3:
                        return success;
                    case 4:
                        return hangUp;
                    case 5:
                        return goAway;
                    case 6:
                        return comeBack;
                    case 7:
                        return mute;
                    case 8:
                        return unMute;
                    case 9:
                        return switchToVideo;
                    case 10:
                        return inviteSwitchToVideo;
                    case 11:
                        return rejectSwitchToVideo;
                    case 12:
                        return pushSuccess;
                    case 13:
                        return switchToLeadRole;
                    case 14:
                        return cancelLeadRole;
                    case 15:
                        return updatePosition;
                    case 16:
                        return cdnFail;
                    default:
                        return null;
                }
            }

            public static C3414l.d<Type> internalGetValueMap() {
                return internalValueMap;
            }

            @Override // com.google.protobuf.C3414l.c
            public final int getNumber() {
                return this.value;
            }

            @Deprecated
            public static Type valueOf(int i) {
                return forNumber(i);
            }
        }

        public static MultiCallMessage parseDelimitedFrom(InputStream inputStream, C3410h c3410h) throws IOException {
            return (MultiCallMessage) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, c3410h);
        }

        public static MultiCallMessage parseFrom(ByteString byteString, C3410h c3410h) throws InvalidProtocolBufferException {
            return (MultiCallMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, c3410h);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setMultiCall(MultiCall multiCall) {
            multiCall.getClass();
            this.multiCall_ = multiCall;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTemplate(Template.TemplateData templateData) {
            templateData.getClass();
            this.template_ = templateData;
        }

        public static final class Builder extends GeneratedMessageLite.AbstractC3380b<MultiCallMessage, Builder> implements MultiCallMessageOrBuilder {
            private Builder() {
                super(MultiCallMessage.DEFAULT_INSTANCE);
            }

            public Builder clearMultiCall() {
                copyOnWrite();
                ((MultiCallMessage) this.instance).clearMultiCall();
                return this;
            }

            public Builder clearTemplate() {
                copyOnWrite();
                ((MultiCallMessage) this.instance).clearTemplate();
                return this;
            }

            public Builder clearToast() {
                copyOnWrite();
                ((MultiCallMessage) this.instance).clearToast();
                return this;
            }

            public Builder clearType() {
                copyOnWrite();
                ((MultiCallMessage) this.instance).clearType();
                return this;
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkMultiCallMessage.MultiCallMessageOrBuilder
            public MultiCall getMultiCall() {
                return ((MultiCallMessage) this.instance).getMultiCall();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkMultiCallMessage.MultiCallMessageOrBuilder
            public Template.TemplateData getTemplate() {
                return ((MultiCallMessage) this.instance).getTemplate();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkMultiCallMessage.MultiCallMessageOrBuilder
            public String getToast() {
                return ((MultiCallMessage) this.instance).getToast();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkMultiCallMessage.MultiCallMessageOrBuilder
            public ByteString getToastBytes() {
                return ((MultiCallMessage) this.instance).getToastBytes();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkMultiCallMessage.MultiCallMessageOrBuilder
            public Type getType() {
                return ((MultiCallMessage) this.instance).getType();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkMultiCallMessage.MultiCallMessageOrBuilder
            public int getTypeValue() {
                return ((MultiCallMessage) this.instance).getTypeValue();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkMultiCallMessage.MultiCallMessageOrBuilder
            public boolean hasMultiCall() {
                return ((MultiCallMessage) this.instance).hasMultiCall();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkMultiCallMessage.MultiCallMessageOrBuilder
            public boolean hasTemplate() {
                return ((MultiCallMessage) this.instance).hasTemplate();
            }

            public Builder mergeMultiCall(MultiCall multiCall) {
                copyOnWrite();
                ((MultiCallMessage) this.instance).mergeMultiCall(multiCall);
                return this;
            }

            public Builder mergeTemplate(Template.TemplateData templateData) {
                copyOnWrite();
                ((MultiCallMessage) this.instance).mergeTemplate(templateData);
                return this;
            }

            public Builder setMultiCall(MultiCall multiCall) {
                copyOnWrite();
                ((MultiCallMessage) this.instance).setMultiCall(multiCall);
                return this;
            }

            public Builder setTemplate(Template.TemplateData templateData) {
                copyOnWrite();
                ((MultiCallMessage) this.instance).setTemplate(templateData);
                return this;
            }

            public Builder setToast(String str) {
                copyOnWrite();
                ((MultiCallMessage) this.instance).setToast(str);
                return this;
            }

            public Builder setToastBytes(ByteString byteString) {
                copyOnWrite();
                ((MultiCallMessage) this.instance).setToastBytes(byteString);
                return this;
            }

            public Builder setType(Type type) {
                copyOnWrite();
                ((MultiCallMessage) this.instance).setType(type);
                return this;
            }

            public Builder setTypeValue(int i) {
                copyOnWrite();
                ((MultiCallMessage) this.instance).setTypeValue(i);
                return this;
            }

            public Builder setMultiCall(MultiCall.Builder builder) {
                copyOnWrite();
                ((MultiCallMessage) this.instance).setMultiCall(builder);
                return this;
            }

            public Builder setTemplate(Template.TemplateData.Builder builder) {
                copyOnWrite();
                ((MultiCallMessage) this.instance).setTemplate(builder);
                return this;
            }
        }

        public static MultiCallMessage parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (MultiCallMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static MultiCallMessage parseFrom(byte[] bArr, C3410h c3410h) throws InvalidProtocolBufferException {
            return (MultiCallMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, c3410h);
        }

        public static MultiCallMessage parseFrom(InputStream inputStream) throws IOException {
            return (MultiCallMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static MultiCallMessage parseFrom(InputStream inputStream, C3410h c3410h) throws IOException {
            return (MultiCallMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, c3410h);
        }

        public static MultiCallMessage parseFrom(C3407e c3407e) throws IOException {
            return (MultiCallMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, c3407e);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static MultiCallMessage parseFrom(C3407e c3407e, C3410h c3410h) throws IOException {
            return (MultiCallMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, c3407e, c3410h);
        }
    }

    public static final class MultiCallSwitchToLeadRoleInviteMessage extends GeneratedMessageLite<MultiCallSwitchToLeadRoleInviteMessage, Builder> implements MultiCallSwitchToLeadRoleInviteMessageOrBuilder {
        private static final MultiCallSwitchToLeadRoleInviteMessage DEFAULT_INSTANCE;
        public static final int INVITE_FIELD_NUMBER = 2;
        private static volatile i860<MultiCallSwitchToLeadRoleInviteMessage> PARSER = null;
        public static final int TYPE_FIELD_NUMBER = 1;
        private MultiCallSwitchToLeadRoleInvite invite_;
        private int type_;

        static {
            MultiCallSwitchToLeadRoleInviteMessage multiCallSwitchToLeadRoleInviteMessage = new MultiCallSwitchToLeadRoleInviteMessage();
            DEFAULT_INSTANCE = multiCallSwitchToLeadRoleInviteMessage;
            multiCallSwitchToLeadRoleInviteMessage.makeImmutable();
        }

        private MultiCallSwitchToLeadRoleInviteMessage() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearInvite() {
            this.invite_ = null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearType() {
            this.type_ = 0;
        }

        public static MultiCallSwitchToLeadRoleInviteMessage getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeInvite(MultiCallSwitchToLeadRoleInvite multiCallSwitchToLeadRoleInvite) {
            MultiCallSwitchToLeadRoleInvite multiCallSwitchToLeadRoleInvite2 = this.invite_;
            if (multiCallSwitchToLeadRoleInvite2 == null || multiCallSwitchToLeadRoleInvite2 == MultiCallSwitchToLeadRoleInvite.getDefaultInstance()) {
                this.invite_ = multiCallSwitchToLeadRoleInvite;
            } else {
                this.invite_ = MultiCallSwitchToLeadRoleInvite.newBuilder(this.invite_).mergeFrom(multiCallSwitchToLeadRoleInvite).buildPartial();
            }
        }

        public static Builder newBuilder(MultiCallSwitchToLeadRoleInviteMessage multiCallSwitchToLeadRoleInviteMessage) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(multiCallSwitchToLeadRoleInviteMessage);
        }

        public static MultiCallSwitchToLeadRoleInviteMessage parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (MultiCallSwitchToLeadRoleInviteMessage) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static MultiCallSwitchToLeadRoleInviteMessage parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (MultiCallSwitchToLeadRoleInviteMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static i860<MultiCallSwitchToLeadRoleInviteMessage> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setInvite(MultiCallSwitchToLeadRoleInvite.Builder builder) {
            this.invite_ = builder.build();
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

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            boolean z = false;
            switch (C45021.f15978xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new MultiCallSwitchToLeadRoleInviteMessage();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                    return null;
                case 4:
                    return new Builder();
                case 5:
                    GeneratedMessageLite.InterfaceC3386h interfaceC3386h = (GeneratedMessageLite.InterfaceC3386h) obj;
                    MultiCallSwitchToLeadRoleInviteMessage multiCallSwitchToLeadRoleInviteMessage = (MultiCallSwitchToLeadRoleInviteMessage) obj2;
                    int i = this.type_;
                    boolean z2 = i != 0;
                    int i2 = multiCallSwitchToLeadRoleInviteMessage.type_;
                    this.type_ = interfaceC3386h.mo16996e(z2, i, i2 != 0, i2);
                    this.invite_ = (MultiCallSwitchToLeadRoleInvite) interfaceC3386h.mo17006o(this.invite_, multiCallSwitchToLeadRoleInviteMessage.invite_);
                    GeneratedMessageLite.C3385g c3385g = GeneratedMessageLite.C3385g.INSTANCE;
                    return this;
                case 6:
                    C3407e c3407e = (C3407e) obj;
                    C3410h c3410h = (C3410h) obj2;
                    while (!z) {
                        try {
                            int iM17116M = c3407e.m17116M();
                            if (iM17116M != 0) {
                                if (iM17116M == 8) {
                                    this.type_ = c3407e.m17136p();
                                } else if (iM17116M == 18) {
                                    MultiCallSwitchToLeadRoleInvite multiCallSwitchToLeadRoleInvite = this.invite_;
                                    MultiCallSwitchToLeadRoleInvite.Builder builder = multiCallSwitchToLeadRoleInvite != null ? multiCallSwitchToLeadRoleInvite.toBuilder() : null;
                                    MultiCallSwitchToLeadRoleInvite multiCallSwitchToLeadRoleInvite2 = (MultiCallSwitchToLeadRoleInvite) c3407e.m17143w(MultiCallSwitchToLeadRoleInvite.parser(), c3410h);
                                    this.invite_ = multiCallSwitchToLeadRoleInvite2;
                                    if (builder != null) {
                                        builder.mergeFrom(multiCallSwitchToLeadRoleInvite2);
                                        this.invite_ = builder.buildPartial();
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
                        synchronized (MultiCallSwitchToLeadRoleInviteMessage.class) {
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

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkMultiCallMessage.MultiCallSwitchToLeadRoleInviteMessageOrBuilder
        public MultiCallSwitchToLeadRoleInvite getInvite() {
            MultiCallSwitchToLeadRoleInvite multiCallSwitchToLeadRoleInvite = this.invite_;
            return multiCallSwitchToLeadRoleInvite == null ? MultiCallSwitchToLeadRoleInvite.getDefaultInstance() : multiCallSwitchToLeadRoleInvite;
        }

        @Override // com.google.protobuf.InterfaceC3419q
        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int iM16922m = this.type_ != Type.switchToLeadRoleInvite.getNumber() ? CodedOutputStream.m16922m(1, this.type_) : 0;
            if (this.invite_ != null) {
                iM16922m += CodedOutputStream.m16893C(2, getInvite());
            }
            this.memoizedSerializedSize = iM16922m;
            return iM16922m;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkMultiCallMessage.MultiCallSwitchToLeadRoleInviteMessageOrBuilder
        public Type getType() {
            Type typeForNumber = Type.forNumber(this.type_);
            return typeForNumber == null ? Type.UNRECOGNIZED : typeForNumber;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkMultiCallMessage.MultiCallSwitchToLeadRoleInviteMessageOrBuilder
        public int getTypeValue() {
            return this.type_;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkMultiCallMessage.MultiCallSwitchToLeadRoleInviteMessageOrBuilder
        public boolean hasInvite() {
            return this.invite_ != null;
        }

        @Override // com.google.protobuf.InterfaceC3419q
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (this.type_ != Type.switchToLeadRoleInvite.getNumber()) {
                codedOutputStream.m16960i0(1, this.type_);
            }
            if (this.invite_ != null) {
                codedOutputStream.mo16974w0(2, getInvite());
            }
        }

        public enum Type implements C3414l.c {
            switchToLeadRoleInvite(0),
            switchToLeadRoleReject(1),
            switchToLeadRoleAccept(2),
            switchToLeadRoleTimeout(3),
            UNRECOGNIZED(-1);

            private static final C3414l.d<Type> internalValueMap = new C3414l.d<Type>() { // from class: com.p1.mobile.longlink.msg.liveroom.LongLinkMultiCallMessage.MultiCallSwitchToLeadRoleInviteMessage.Type.1
                @Override // com.google.protobuf.C3414l.d
                public Type findValueByNumber(int i) {
                    return Type.forNumber(i);
                }
            };
            public static final int switchToLeadRoleAccept_VALUE = 2;
            public static final int switchToLeadRoleInvite_VALUE = 0;
            public static final int switchToLeadRoleReject_VALUE = 1;
            public static final int switchToLeadRoleTimeout_VALUE = 3;
            private final int value;

            Type(int i) {
                this.value = i;
            }

            public static Type forNumber(int i) {
                if (i == 0) {
                    return switchToLeadRoleInvite;
                }
                if (i == 1) {
                    return switchToLeadRoleReject;
                }
                if (i == 2) {
                    return switchToLeadRoleAccept;
                }
                if (i != 3) {
                    return null;
                }
                return switchToLeadRoleTimeout;
            }

            public static C3414l.d<Type> internalGetValueMap() {
                return internalValueMap;
            }

            @Override // com.google.protobuf.C3414l.c
            public final int getNumber() {
                return this.value;
            }

            @Deprecated
            public static Type valueOf(int i) {
                return forNumber(i);
            }
        }

        public static MultiCallSwitchToLeadRoleInviteMessage parseDelimitedFrom(InputStream inputStream, C3410h c3410h) throws IOException {
            return (MultiCallSwitchToLeadRoleInviteMessage) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, c3410h);
        }

        public static MultiCallSwitchToLeadRoleInviteMessage parseFrom(ByteString byteString, C3410h c3410h) throws InvalidProtocolBufferException {
            return (MultiCallSwitchToLeadRoleInviteMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, c3410h);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setInvite(MultiCallSwitchToLeadRoleInvite multiCallSwitchToLeadRoleInvite) {
            multiCallSwitchToLeadRoleInvite.getClass();
            this.invite_ = multiCallSwitchToLeadRoleInvite;
        }

        public static final class Builder extends GeneratedMessageLite.AbstractC3380b<MultiCallSwitchToLeadRoleInviteMessage, Builder> implements MultiCallSwitchToLeadRoleInviteMessageOrBuilder {
            private Builder() {
                super(MultiCallSwitchToLeadRoleInviteMessage.DEFAULT_INSTANCE);
            }

            public Builder clearInvite() {
                copyOnWrite();
                ((MultiCallSwitchToLeadRoleInviteMessage) this.instance).clearInvite();
                return this;
            }

            public Builder clearType() {
                copyOnWrite();
                ((MultiCallSwitchToLeadRoleInviteMessage) this.instance).clearType();
                return this;
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkMultiCallMessage.MultiCallSwitchToLeadRoleInviteMessageOrBuilder
            public MultiCallSwitchToLeadRoleInvite getInvite() {
                return ((MultiCallSwitchToLeadRoleInviteMessage) this.instance).getInvite();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkMultiCallMessage.MultiCallSwitchToLeadRoleInviteMessageOrBuilder
            public Type getType() {
                return ((MultiCallSwitchToLeadRoleInviteMessage) this.instance).getType();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkMultiCallMessage.MultiCallSwitchToLeadRoleInviteMessageOrBuilder
            public int getTypeValue() {
                return ((MultiCallSwitchToLeadRoleInviteMessage) this.instance).getTypeValue();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkMultiCallMessage.MultiCallSwitchToLeadRoleInviteMessageOrBuilder
            public boolean hasInvite() {
                return ((MultiCallSwitchToLeadRoleInviteMessage) this.instance).hasInvite();
            }

            public Builder mergeInvite(MultiCallSwitchToLeadRoleInvite multiCallSwitchToLeadRoleInvite) {
                copyOnWrite();
                ((MultiCallSwitchToLeadRoleInviteMessage) this.instance).mergeInvite(multiCallSwitchToLeadRoleInvite);
                return this;
            }

            public Builder setInvite(MultiCallSwitchToLeadRoleInvite multiCallSwitchToLeadRoleInvite) {
                copyOnWrite();
                ((MultiCallSwitchToLeadRoleInviteMessage) this.instance).setInvite(multiCallSwitchToLeadRoleInvite);
                return this;
            }

            public Builder setType(Type type) {
                copyOnWrite();
                ((MultiCallSwitchToLeadRoleInviteMessage) this.instance).setType(type);
                return this;
            }

            public Builder setTypeValue(int i) {
                copyOnWrite();
                ((MultiCallSwitchToLeadRoleInviteMessage) this.instance).setTypeValue(i);
                return this;
            }

            public Builder setInvite(MultiCallSwitchToLeadRoleInvite.Builder builder) {
                copyOnWrite();
                ((MultiCallSwitchToLeadRoleInviteMessage) this.instance).setInvite(builder);
                return this;
            }
        }

        public static MultiCallSwitchToLeadRoleInviteMessage parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (MultiCallSwitchToLeadRoleInviteMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static MultiCallSwitchToLeadRoleInviteMessage parseFrom(byte[] bArr, C3410h c3410h) throws InvalidProtocolBufferException {
            return (MultiCallSwitchToLeadRoleInviteMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, c3410h);
        }

        public static MultiCallSwitchToLeadRoleInviteMessage parseFrom(InputStream inputStream) throws IOException {
            return (MultiCallSwitchToLeadRoleInviteMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static MultiCallSwitchToLeadRoleInviteMessage parseFrom(InputStream inputStream, C3410h c3410h) throws IOException {
            return (MultiCallSwitchToLeadRoleInviteMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, c3410h);
        }

        public static MultiCallSwitchToLeadRoleInviteMessage parseFrom(C3407e c3407e) throws IOException {
            return (MultiCallSwitchToLeadRoleInviteMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, c3407e);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static MultiCallSwitchToLeadRoleInviteMessage parseFrom(C3407e c3407e, C3410h c3410h) throws IOException {
            return (MultiCallSwitchToLeadRoleInviteMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, c3407e, c3410h);
        }
    }

    public enum InviteState implements C3414l.c {
        invited(0),
        rejected(1),
        accepted(2),
        timeout(3),
        UNRECOGNIZED(-1);

        public static final int accepted_VALUE = 2;
        private static final C3414l.d<InviteState> internalValueMap = new C3414l.d<InviteState>() { // from class: com.p1.mobile.longlink.msg.liveroom.LongLinkMultiCallMessage.InviteState.1
            @Override // com.google.protobuf.C3414l.d
            public InviteState findValueByNumber(int i) {
                return InviteState.forNumber(i);
            }
        };
        public static final int invited_VALUE = 0;
        public static final int rejected_VALUE = 1;
        public static final int timeout_VALUE = 3;
        private final int value;

        InviteState(int i) {
            this.value = i;
        }

        public static InviteState forNumber(int i) {
            if (i == 0) {
                return invited;
            }
            if (i == 1) {
                return rejected;
            }
            if (i == 2) {
                return accepted;
            }
            if (i != 3) {
                return null;
            }
            return timeout;
        }

        public static C3414l.d<InviteState> internalGetValueMap() {
            return internalValueMap;
        }

        @Override // com.google.protobuf.C3414l.c
        public final int getNumber() {
            return this.value;
        }

        @Deprecated
        public static InviteState valueOf(int i) {
            return forNumber(i);
        }
    }

    public static final class MultiCall extends GeneratedMessageLite<MultiCall, Builder> implements MultiCallOrBuilder {
        public static final int CATEGORY_FIELD_NUMBER = 11;
        private static final MultiCall DEFAULT_INSTANCE;
        public static final int ID_FIELD_NUMBER = 1;
        public static final int ISAWAY_FIELD_NUMBER = 15;
        public static final int ISLEADROLE_FIELD_NUMBER = 21;
        public static final int LIVEID_FIELD_NUMBER = 9;
        public static final int MUTEDBYUSERIDS_FIELD_NUMBER = 17;
        public static final int OWNERLIVEID_FIELD_NUMBER = 3;
        public static final int OWNERMULTICALLORDER_FIELD_NUMBER = 18;
        public static final int OWNERROOMID_FIELD_NUMBER = 4;
        public static final int OWNERUSERID_FIELD_NUMBER = 2;
        private static volatile i860<MultiCall> PARSER = null;
        public static final int POSITION_FIELD_NUMBER = 13;
        public static final int PUSHREMAINCOUNT_FIELD_NUMBER = 20;
        public static final int RECEIVEDREWARDPOINT_FIELD_NUMBER = 16;
        public static final int REFRESHPUSHSTREAMURL_FIELD_NUMBER = 22;
        public static final int ROLE_FIELD_NUMBER = 8;
        public static final int ROOMID_FIELD_NUMBER = 10;
        public static final int SHOWSECONDS_FIELD_NUMBER = 19;
        public static final int SOURCE_FIELD_NUMBER = 12;
        public static final int STATE_FIELD_NUMBER = 14;
        public static final int USERAVATAR_FIELD_NUMBER = 7;
        public static final int USERID_FIELD_NUMBER = 5;
        public static final int USERNAME_FIELD_NUMBER = 6;
        private int bitField0_;
        private boolean isAway_;
        private boolean isLeadRole_;
        private int position_;
        private long pushRemainCount_;
        private long receivedRewardPoint_;
        private long showSeconds_;
        private String id_ = "";
        private String ownerUserId_ = "";
        private String ownerLiveId_ = "";
        private String ownerRoomId_ = "";
        private String userId_ = "";
        private String userName_ = "";
        private String userAvatar_ = "";
        private String role_ = "";
        private String liveId_ = "";
        private String roomId_ = "";
        private String category_ = "";
        private String source_ = "";
        private String state_ = "";
        private C3414l.h<String> mutedByUserIds_ = GeneratedMessageLite.emptyProtobufList();
        private String ownerMultiCallOrder_ = "";
        private String refreshPushStreamUrl_ = "";

        public static final class Builder extends GeneratedMessageLite.AbstractC3380b<MultiCall, Builder> implements MultiCallOrBuilder {
            private Builder() {
                super(MultiCall.DEFAULT_INSTANCE);
            }

            public Builder addAllMutedByUserIds(Iterable<String> iterable) {
                copyOnWrite();
                ((MultiCall) this.instance).addAllMutedByUserIds(iterable);
                return this;
            }

            public Builder addMutedByUserIds(String str) {
                copyOnWrite();
                ((MultiCall) this.instance).addMutedByUserIds(str);
                return this;
            }

            public Builder addMutedByUserIdsBytes(ByteString byteString) {
                copyOnWrite();
                ((MultiCall) this.instance).addMutedByUserIdsBytes(byteString);
                return this;
            }

            public Builder clearCategory() {
                copyOnWrite();
                ((MultiCall) this.instance).clearCategory();
                return this;
            }

            public Builder clearId() {
                copyOnWrite();
                ((MultiCall) this.instance).clearId();
                return this;
            }

            public Builder clearIsAway() {
                copyOnWrite();
                ((MultiCall) this.instance).clearIsAway();
                return this;
            }

            public Builder clearIsLeadRole() {
                copyOnWrite();
                ((MultiCall) this.instance).clearIsLeadRole();
                return this;
            }

            public Builder clearLiveId() {
                copyOnWrite();
                ((MultiCall) this.instance).clearLiveId();
                return this;
            }

            public Builder clearMutedByUserIds() {
                copyOnWrite();
                ((MultiCall) this.instance).clearMutedByUserIds();
                return this;
            }

            public Builder clearOwnerLiveId() {
                copyOnWrite();
                ((MultiCall) this.instance).clearOwnerLiveId();
                return this;
            }

            public Builder clearOwnerMultiCallOrder() {
                copyOnWrite();
                ((MultiCall) this.instance).clearOwnerMultiCallOrder();
                return this;
            }

            public Builder clearOwnerRoomId() {
                copyOnWrite();
                ((MultiCall) this.instance).clearOwnerRoomId();
                return this;
            }

            public Builder clearOwnerUserId() {
                copyOnWrite();
                ((MultiCall) this.instance).clearOwnerUserId();
                return this;
            }

            public Builder clearPosition() {
                copyOnWrite();
                ((MultiCall) this.instance).clearPosition();
                return this;
            }

            public Builder clearPushRemainCount() {
                copyOnWrite();
                ((MultiCall) this.instance).clearPushRemainCount();
                return this;
            }

            public Builder clearReceivedRewardPoint() {
                copyOnWrite();
                ((MultiCall) this.instance).clearReceivedRewardPoint();
                return this;
            }

            public Builder clearRefreshPushStreamUrl() {
                copyOnWrite();
                ((MultiCall) this.instance).clearRefreshPushStreamUrl();
                return this;
            }

            public Builder clearRole() {
                copyOnWrite();
                ((MultiCall) this.instance).clearRole();
                return this;
            }

            public Builder clearRoomId() {
                copyOnWrite();
                ((MultiCall) this.instance).clearRoomId();
                return this;
            }

            public Builder clearShowSeconds() {
                copyOnWrite();
                ((MultiCall) this.instance).clearShowSeconds();
                return this;
            }

            public Builder clearSource() {
                copyOnWrite();
                ((MultiCall) this.instance).clearSource();
                return this;
            }

            public Builder clearState() {
                copyOnWrite();
                ((MultiCall) this.instance).clearState();
                return this;
            }

            public Builder clearUserAvatar() {
                copyOnWrite();
                ((MultiCall) this.instance).clearUserAvatar();
                return this;
            }

            public Builder clearUserId() {
                copyOnWrite();
                ((MultiCall) this.instance).clearUserId();
                return this;
            }

            public Builder clearUserName() {
                copyOnWrite();
                ((MultiCall) this.instance).clearUserName();
                return this;
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkMultiCallMessage.MultiCallOrBuilder
            public String getCategory() {
                return ((MultiCall) this.instance).getCategory();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkMultiCallMessage.MultiCallOrBuilder
            public ByteString getCategoryBytes() {
                return ((MultiCall) this.instance).getCategoryBytes();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkMultiCallMessage.MultiCallOrBuilder
            public String getId() {
                return ((MultiCall) this.instance).getId();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkMultiCallMessage.MultiCallOrBuilder
            public ByteString getIdBytes() {
                return ((MultiCall) this.instance).getIdBytes();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkMultiCallMessage.MultiCallOrBuilder
            public boolean getIsAway() {
                return ((MultiCall) this.instance).getIsAway();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkMultiCallMessage.MultiCallOrBuilder
            public boolean getIsLeadRole() {
                return ((MultiCall) this.instance).getIsLeadRole();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkMultiCallMessage.MultiCallOrBuilder
            public String getLiveId() {
                return ((MultiCall) this.instance).getLiveId();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkMultiCallMessage.MultiCallOrBuilder
            public ByteString getLiveIdBytes() {
                return ((MultiCall) this.instance).getLiveIdBytes();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkMultiCallMessage.MultiCallOrBuilder
            public String getMutedByUserIds(int i) {
                return ((MultiCall) this.instance).getMutedByUserIds(i);
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkMultiCallMessage.MultiCallOrBuilder
            public ByteString getMutedByUserIdsBytes(int i) {
                return ((MultiCall) this.instance).getMutedByUserIdsBytes(i);
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkMultiCallMessage.MultiCallOrBuilder
            public int getMutedByUserIdsCount() {
                return ((MultiCall) this.instance).getMutedByUserIdsCount();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkMultiCallMessage.MultiCallOrBuilder
            public List<String> getMutedByUserIdsList() {
                return Collections.unmodifiableList(((MultiCall) this.instance).getMutedByUserIdsList());
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkMultiCallMessage.MultiCallOrBuilder
            public String getOwnerLiveId() {
                return ((MultiCall) this.instance).getOwnerLiveId();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkMultiCallMessage.MultiCallOrBuilder
            public ByteString getOwnerLiveIdBytes() {
                return ((MultiCall) this.instance).getOwnerLiveIdBytes();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkMultiCallMessage.MultiCallOrBuilder
            public String getOwnerMultiCallOrder() {
                return ((MultiCall) this.instance).getOwnerMultiCallOrder();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkMultiCallMessage.MultiCallOrBuilder
            public ByteString getOwnerMultiCallOrderBytes() {
                return ((MultiCall) this.instance).getOwnerMultiCallOrderBytes();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkMultiCallMessage.MultiCallOrBuilder
            public String getOwnerRoomId() {
                return ((MultiCall) this.instance).getOwnerRoomId();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkMultiCallMessage.MultiCallOrBuilder
            public ByteString getOwnerRoomIdBytes() {
                return ((MultiCall) this.instance).getOwnerRoomIdBytes();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkMultiCallMessage.MultiCallOrBuilder
            public String getOwnerUserId() {
                return ((MultiCall) this.instance).getOwnerUserId();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkMultiCallMessage.MultiCallOrBuilder
            public ByteString getOwnerUserIdBytes() {
                return ((MultiCall) this.instance).getOwnerUserIdBytes();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkMultiCallMessage.MultiCallOrBuilder
            public int getPosition() {
                return ((MultiCall) this.instance).getPosition();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkMultiCallMessage.MultiCallOrBuilder
            public long getPushRemainCount() {
                return ((MultiCall) this.instance).getPushRemainCount();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkMultiCallMessage.MultiCallOrBuilder
            public long getReceivedRewardPoint() {
                return ((MultiCall) this.instance).getReceivedRewardPoint();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkMultiCallMessage.MultiCallOrBuilder
            public String getRefreshPushStreamUrl() {
                return ((MultiCall) this.instance).getRefreshPushStreamUrl();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkMultiCallMessage.MultiCallOrBuilder
            public ByteString getRefreshPushStreamUrlBytes() {
                return ((MultiCall) this.instance).getRefreshPushStreamUrlBytes();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkMultiCallMessage.MultiCallOrBuilder
            public String getRole() {
                return ((MultiCall) this.instance).getRole();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkMultiCallMessage.MultiCallOrBuilder
            public ByteString getRoleBytes() {
                return ((MultiCall) this.instance).getRoleBytes();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkMultiCallMessage.MultiCallOrBuilder
            public String getRoomId() {
                return ((MultiCall) this.instance).getRoomId();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkMultiCallMessage.MultiCallOrBuilder
            public ByteString getRoomIdBytes() {
                return ((MultiCall) this.instance).getRoomIdBytes();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkMultiCallMessage.MultiCallOrBuilder
            public long getShowSeconds() {
                return ((MultiCall) this.instance).getShowSeconds();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkMultiCallMessage.MultiCallOrBuilder
            public String getSource() {
                return ((MultiCall) this.instance).getSource();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkMultiCallMessage.MultiCallOrBuilder
            public ByteString getSourceBytes() {
                return ((MultiCall) this.instance).getSourceBytes();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkMultiCallMessage.MultiCallOrBuilder
            public String getState() {
                return ((MultiCall) this.instance).getState();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkMultiCallMessage.MultiCallOrBuilder
            public ByteString getStateBytes() {
                return ((MultiCall) this.instance).getStateBytes();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkMultiCallMessage.MultiCallOrBuilder
            public String getUserAvatar() {
                return ((MultiCall) this.instance).getUserAvatar();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkMultiCallMessage.MultiCallOrBuilder
            public ByteString getUserAvatarBytes() {
                return ((MultiCall) this.instance).getUserAvatarBytes();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkMultiCallMessage.MultiCallOrBuilder
            public String getUserId() {
                return ((MultiCall) this.instance).getUserId();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkMultiCallMessage.MultiCallOrBuilder
            public ByteString getUserIdBytes() {
                return ((MultiCall) this.instance).getUserIdBytes();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkMultiCallMessage.MultiCallOrBuilder
            public String getUserName() {
                return ((MultiCall) this.instance).getUserName();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkMultiCallMessage.MultiCallOrBuilder
            public ByteString getUserNameBytes() {
                return ((MultiCall) this.instance).getUserNameBytes();
            }

            public Builder setCategory(String str) {
                copyOnWrite();
                ((MultiCall) this.instance).setCategory(str);
                return this;
            }

            public Builder setCategoryBytes(ByteString byteString) {
                copyOnWrite();
                ((MultiCall) this.instance).setCategoryBytes(byteString);
                return this;
            }

            public Builder setId(String str) {
                copyOnWrite();
                ((MultiCall) this.instance).setId(str);
                return this;
            }

            public Builder setIdBytes(ByteString byteString) {
                copyOnWrite();
                ((MultiCall) this.instance).setIdBytes(byteString);
                return this;
            }

            public Builder setIsAway(boolean z) {
                copyOnWrite();
                ((MultiCall) this.instance).setIsAway(z);
                return this;
            }

            public Builder setIsLeadRole(boolean z) {
                copyOnWrite();
                ((MultiCall) this.instance).setIsLeadRole(z);
                return this;
            }

            public Builder setLiveId(String str) {
                copyOnWrite();
                ((MultiCall) this.instance).setLiveId(str);
                return this;
            }

            public Builder setLiveIdBytes(ByteString byteString) {
                copyOnWrite();
                ((MultiCall) this.instance).setLiveIdBytes(byteString);
                return this;
            }

            public Builder setMutedByUserIds(int i, String str) {
                copyOnWrite();
                ((MultiCall) this.instance).setMutedByUserIds(i, str);
                return this;
            }

            public Builder setOwnerLiveId(String str) {
                copyOnWrite();
                ((MultiCall) this.instance).setOwnerLiveId(str);
                return this;
            }

            public Builder setOwnerLiveIdBytes(ByteString byteString) {
                copyOnWrite();
                ((MultiCall) this.instance).setOwnerLiveIdBytes(byteString);
                return this;
            }

            public Builder setOwnerMultiCallOrder(String str) {
                copyOnWrite();
                ((MultiCall) this.instance).setOwnerMultiCallOrder(str);
                return this;
            }

            public Builder setOwnerMultiCallOrderBytes(ByteString byteString) {
                copyOnWrite();
                ((MultiCall) this.instance).setOwnerMultiCallOrderBytes(byteString);
                return this;
            }

            public Builder setOwnerRoomId(String str) {
                copyOnWrite();
                ((MultiCall) this.instance).setOwnerRoomId(str);
                return this;
            }

            public Builder setOwnerRoomIdBytes(ByteString byteString) {
                copyOnWrite();
                ((MultiCall) this.instance).setOwnerRoomIdBytes(byteString);
                return this;
            }

            public Builder setOwnerUserId(String str) {
                copyOnWrite();
                ((MultiCall) this.instance).setOwnerUserId(str);
                return this;
            }

            public Builder setOwnerUserIdBytes(ByteString byteString) {
                copyOnWrite();
                ((MultiCall) this.instance).setOwnerUserIdBytes(byteString);
                return this;
            }

            public Builder setPosition(int i) {
                copyOnWrite();
                ((MultiCall) this.instance).setPosition(i);
                return this;
            }

            public Builder setPushRemainCount(long j) {
                copyOnWrite();
                ((MultiCall) this.instance).setPushRemainCount(j);
                return this;
            }

            public Builder setReceivedRewardPoint(long j) {
                copyOnWrite();
                ((MultiCall) this.instance).setReceivedRewardPoint(j);
                return this;
            }

            public Builder setRefreshPushStreamUrl(String str) {
                copyOnWrite();
                ((MultiCall) this.instance).setRefreshPushStreamUrl(str);
                return this;
            }

            public Builder setRefreshPushStreamUrlBytes(ByteString byteString) {
                copyOnWrite();
                ((MultiCall) this.instance).setRefreshPushStreamUrlBytes(byteString);
                return this;
            }

            public Builder setRole(String str) {
                copyOnWrite();
                ((MultiCall) this.instance).setRole(str);
                return this;
            }

            public Builder setRoleBytes(ByteString byteString) {
                copyOnWrite();
                ((MultiCall) this.instance).setRoleBytes(byteString);
                return this;
            }

            public Builder setRoomId(String str) {
                copyOnWrite();
                ((MultiCall) this.instance).setRoomId(str);
                return this;
            }

            public Builder setRoomIdBytes(ByteString byteString) {
                copyOnWrite();
                ((MultiCall) this.instance).setRoomIdBytes(byteString);
                return this;
            }

            public Builder setShowSeconds(long j) {
                copyOnWrite();
                ((MultiCall) this.instance).setShowSeconds(j);
                return this;
            }

            public Builder setSource(String str) {
                copyOnWrite();
                ((MultiCall) this.instance).setSource(str);
                return this;
            }

            public Builder setSourceBytes(ByteString byteString) {
                copyOnWrite();
                ((MultiCall) this.instance).setSourceBytes(byteString);
                return this;
            }

            public Builder setState(String str) {
                copyOnWrite();
                ((MultiCall) this.instance).setState(str);
                return this;
            }

            public Builder setStateBytes(ByteString byteString) {
                copyOnWrite();
                ((MultiCall) this.instance).setStateBytes(byteString);
                return this;
            }

            public Builder setUserAvatar(String str) {
                copyOnWrite();
                ((MultiCall) this.instance).setUserAvatar(str);
                return this;
            }

            public Builder setUserAvatarBytes(ByteString byteString) {
                copyOnWrite();
                ((MultiCall) this.instance).setUserAvatarBytes(byteString);
                return this;
            }

            public Builder setUserId(String str) {
                copyOnWrite();
                ((MultiCall) this.instance).setUserId(str);
                return this;
            }

            public Builder setUserIdBytes(ByteString byteString) {
                copyOnWrite();
                ((MultiCall) this.instance).setUserIdBytes(byteString);
                return this;
            }

            public Builder setUserName(String str) {
                copyOnWrite();
                ((MultiCall) this.instance).setUserName(str);
                return this;
            }

            public Builder setUserNameBytes(ByteString byteString) {
                copyOnWrite();
                ((MultiCall) this.instance).setUserNameBytes(byteString);
                return this;
            }
        }

        static {
            MultiCall multiCall = new MultiCall();
            DEFAULT_INSTANCE = multiCall;
            multiCall.makeImmutable();
        }

        private MultiCall() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllMutedByUserIds(Iterable<String> iterable) {
            ensureMutedByUserIdsIsMutable();
            AbstractC3403a.addAll(iterable, this.mutedByUserIds_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addMutedByUserIds(String str) {
            str.getClass();
            ensureMutedByUserIdsIsMutable();
            this.mutedByUserIds_.add(str);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addMutedByUserIdsBytes(ByteString byteString) {
            byteString.getClass();
            AbstractC3403a.checkByteStringIsUtf8(byteString);
            ensureMutedByUserIdsIsMutable();
            this.mutedByUserIds_.add(byteString.toStringUtf8());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearCategory() {
            this.category_ = getDefaultInstance().getCategory();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearId() {
            this.id_ = getDefaultInstance().getId();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearIsAway() {
            this.isAway_ = false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearIsLeadRole() {
            this.isLeadRole_ = false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearLiveId() {
            this.liveId_ = getDefaultInstance().getLiveId();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearMutedByUserIds() {
            this.mutedByUserIds_ = GeneratedMessageLite.emptyProtobufList();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearOwnerLiveId() {
            this.ownerLiveId_ = getDefaultInstance().getOwnerLiveId();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearOwnerMultiCallOrder() {
            this.ownerMultiCallOrder_ = getDefaultInstance().getOwnerMultiCallOrder();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearOwnerRoomId() {
            this.ownerRoomId_ = getDefaultInstance().getOwnerRoomId();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearOwnerUserId() {
            this.ownerUserId_ = getDefaultInstance().getOwnerUserId();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearPosition() {
            this.position_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearPushRemainCount() {
            this.pushRemainCount_ = 0L;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearReceivedRewardPoint() {
            this.receivedRewardPoint_ = 0L;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearRefreshPushStreamUrl() {
            this.refreshPushStreamUrl_ = getDefaultInstance().getRefreshPushStreamUrl();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearRole() {
            this.role_ = getDefaultInstance().getRole();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearRoomId() {
            this.roomId_ = getDefaultInstance().getRoomId();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearShowSeconds() {
            this.showSeconds_ = 0L;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearSource() {
            this.source_ = getDefaultInstance().getSource();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearState() {
            this.state_ = getDefaultInstance().getState();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearUserAvatar() {
            this.userAvatar_ = getDefaultInstance().getUserAvatar();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearUserId() {
            this.userId_ = getDefaultInstance().getUserId();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearUserName() {
            this.userName_ = getDefaultInstance().getUserName();
        }

        private void ensureMutedByUserIdsIsMutable() {
            if (this.mutedByUserIds_.mo17085q()) {
                return;
            }
            this.mutedByUserIds_ = GeneratedMessageLite.mutableCopy(this.mutedByUserIds_);
        }

        public static MultiCall getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder(MultiCall multiCall) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(multiCall);
        }

        public static MultiCall parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (MultiCall) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static MultiCall parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (MultiCall) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static i860<MultiCall> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setCategory(String str) {
            str.getClass();
            this.category_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setCategoryBytes(ByteString byteString) {
            byteString.getClass();
            AbstractC3403a.checkByteStringIsUtf8(byteString);
            this.category_ = byteString.toStringUtf8();
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
        public void setIsAway(boolean z) {
            this.isAway_ = z;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setIsLeadRole(boolean z) {
            this.isLeadRole_ = z;
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
        public void setMutedByUserIds(int i, String str) {
            str.getClass();
            ensureMutedByUserIdsIsMutable();
            this.mutedByUserIds_.set(i, str);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setOwnerLiveId(String str) {
            str.getClass();
            this.ownerLiveId_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setOwnerLiveIdBytes(ByteString byteString) {
            byteString.getClass();
            AbstractC3403a.checkByteStringIsUtf8(byteString);
            this.ownerLiveId_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setOwnerMultiCallOrder(String str) {
            str.getClass();
            this.ownerMultiCallOrder_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setOwnerMultiCallOrderBytes(ByteString byteString) {
            byteString.getClass();
            AbstractC3403a.checkByteStringIsUtf8(byteString);
            this.ownerMultiCallOrder_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setOwnerRoomId(String str) {
            str.getClass();
            this.ownerRoomId_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setOwnerRoomIdBytes(ByteString byteString) {
            byteString.getClass();
            AbstractC3403a.checkByteStringIsUtf8(byteString);
            this.ownerRoomId_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setOwnerUserId(String str) {
            str.getClass();
            this.ownerUserId_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setOwnerUserIdBytes(ByteString byteString) {
            byteString.getClass();
            AbstractC3403a.checkByteStringIsUtf8(byteString);
            this.ownerUserId_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setPosition(int i) {
            this.position_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setPushRemainCount(long j) {
            this.pushRemainCount_ = j;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setReceivedRewardPoint(long j) {
            this.receivedRewardPoint_ = j;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setRefreshPushStreamUrl(String str) {
            str.getClass();
            this.refreshPushStreamUrl_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setRefreshPushStreamUrlBytes(ByteString byteString) {
            byteString.getClass();
            AbstractC3403a.checkByteStringIsUtf8(byteString);
            this.refreshPushStreamUrl_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setRole(String str) {
            str.getClass();
            this.role_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setRoleBytes(ByteString byteString) {
            byteString.getClass();
            AbstractC3403a.checkByteStringIsUtf8(byteString);
            this.role_ = byteString.toStringUtf8();
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
        public void setShowSeconds(long j) {
            this.showSeconds_ = j;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSource(String str) {
            str.getClass();
            this.source_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSourceBytes(ByteString byteString) {
            byteString.getClass();
            AbstractC3403a.checkByteStringIsUtf8(byteString);
            this.source_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setState(String str) {
            str.getClass();
            this.state_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setStateBytes(ByteString byteString) {
            byteString.getClass();
            AbstractC3403a.checkByteStringIsUtf8(byteString);
            this.state_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setUserAvatar(String str) {
            str.getClass();
            this.userAvatar_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setUserAvatarBytes(ByteString byteString) {
            byteString.getClass();
            AbstractC3403a.checkByteStringIsUtf8(byteString);
            this.userAvatar_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setUserId(String str) {
            str.getClass();
            this.userId_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setUserIdBytes(ByteString byteString) {
            byteString.getClass();
            AbstractC3403a.checkByteStringIsUtf8(byteString);
            this.userId_ = byteString.toStringUtf8();
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
            boolean z = false;
            switch (C45021.f15978xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new MultiCall();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                    this.mutedByUserIds_.mo17084n();
                    return null;
                case 4:
                    return new Builder();
                case 5:
                    GeneratedMessageLite.InterfaceC3386h interfaceC3386h = (GeneratedMessageLite.InterfaceC3386h) obj;
                    MultiCall multiCall = (MultiCall) obj2;
                    this.id_ = interfaceC3386h.mo16997f(!this.id_.isEmpty(), this.id_, !multiCall.id_.isEmpty(), multiCall.id_);
                    this.ownerUserId_ = interfaceC3386h.mo16997f(!this.ownerUserId_.isEmpty(), this.ownerUserId_, !multiCall.ownerUserId_.isEmpty(), multiCall.ownerUserId_);
                    this.ownerLiveId_ = interfaceC3386h.mo16997f(!this.ownerLiveId_.isEmpty(), this.ownerLiveId_, !multiCall.ownerLiveId_.isEmpty(), multiCall.ownerLiveId_);
                    this.ownerRoomId_ = interfaceC3386h.mo16997f(!this.ownerRoomId_.isEmpty(), this.ownerRoomId_, !multiCall.ownerRoomId_.isEmpty(), multiCall.ownerRoomId_);
                    this.userId_ = interfaceC3386h.mo16997f(!this.userId_.isEmpty(), this.userId_, !multiCall.userId_.isEmpty(), multiCall.userId_);
                    this.userName_ = interfaceC3386h.mo16997f(!this.userName_.isEmpty(), this.userName_, !multiCall.userName_.isEmpty(), multiCall.userName_);
                    this.userAvatar_ = interfaceC3386h.mo16997f(!this.userAvatar_.isEmpty(), this.userAvatar_, !multiCall.userAvatar_.isEmpty(), multiCall.userAvatar_);
                    this.role_ = interfaceC3386h.mo16997f(!this.role_.isEmpty(), this.role_, !multiCall.role_.isEmpty(), multiCall.role_);
                    this.liveId_ = interfaceC3386h.mo16997f(!this.liveId_.isEmpty(), this.liveId_, !multiCall.liveId_.isEmpty(), multiCall.liveId_);
                    this.roomId_ = interfaceC3386h.mo16997f(!this.roomId_.isEmpty(), this.roomId_, !multiCall.roomId_.isEmpty(), multiCall.roomId_);
                    this.category_ = interfaceC3386h.mo16997f(!this.category_.isEmpty(), this.category_, !multiCall.category_.isEmpty(), multiCall.category_);
                    this.source_ = interfaceC3386h.mo16997f(!this.source_.isEmpty(), this.source_, !multiCall.source_.isEmpty(), multiCall.source_);
                    int i = this.position_;
                    boolean z2 = i != 0;
                    int i2 = multiCall.position_;
                    this.position_ = interfaceC3386h.mo16996e(z2, i, i2 != 0, i2);
                    this.state_ = interfaceC3386h.mo16997f(!this.state_.isEmpty(), this.state_, !multiCall.state_.isEmpty(), multiCall.state_);
                    boolean z3 = this.isAway_;
                    boolean z4 = multiCall.isAway_;
                    this.isAway_ = interfaceC3386h.mo16995d(z3, z3, z4, z4);
                    long j = this.receivedRewardPoint_;
                    boolean z5 = j != 0;
                    long j2 = multiCall.receivedRewardPoint_;
                    this.receivedRewardPoint_ = interfaceC3386h.mo17000i(z5, j, j2 != 0, j2);
                    this.mutedByUserIds_ = interfaceC3386h.mo16998g(this.mutedByUserIds_, multiCall.mutedByUserIds_);
                    this.ownerMultiCallOrder_ = interfaceC3386h.mo16997f(!this.ownerMultiCallOrder_.isEmpty(), this.ownerMultiCallOrder_, !multiCall.ownerMultiCallOrder_.isEmpty(), multiCall.ownerMultiCallOrder_);
                    long j3 = this.showSeconds_;
                    boolean z6 = j3 != 0;
                    long j4 = multiCall.showSeconds_;
                    this.showSeconds_ = interfaceC3386h.mo17000i(z6, j3, j4 != 0, j4);
                    long j5 = this.pushRemainCount_;
                    boolean z7 = j5 != 0;
                    long j6 = multiCall.pushRemainCount_;
                    this.pushRemainCount_ = interfaceC3386h.mo17000i(z7, j5, j6 != 0, j6);
                    boolean z8 = this.isLeadRole_;
                    boolean z9 = multiCall.isLeadRole_;
                    this.isLeadRole_ = interfaceC3386h.mo16995d(z8, z8, z9, z9);
                    this.refreshPushStreamUrl_ = interfaceC3386h.mo16997f(!this.refreshPushStreamUrl_.isEmpty(), this.refreshPushStreamUrl_, !multiCall.refreshPushStreamUrl_.isEmpty(), multiCall.refreshPushStreamUrl_);
                    if (interfaceC3386h == GeneratedMessageLite.C3385g.INSTANCE) {
                        this.bitField0_ |= multiCall.bitField0_;
                    }
                    return this;
                case 6:
                    C3407e c3407e = (C3407e) obj;
                    while (!z) {
                        try {
                            int iM17116M = c3407e.m17116M();
                            switch (iM17116M) {
                                case 0:
                                    break;
                                case 10:
                                    this.id_ = c3407e.m17115L();
                                    continue;
                                case 18:
                                    this.ownerUserId_ = c3407e.m17115L();
                                    continue;
                                case 26:
                                    this.ownerLiveId_ = c3407e.m17115L();
                                    continue;
                                case 34:
                                    this.ownerRoomId_ = c3407e.m17115L();
                                    continue;
                                case 42:
                                    this.userId_ = c3407e.m17115L();
                                    continue;
                                case 50:
                                    this.userName_ = c3407e.m17115L();
                                    continue;
                                case 58:
                                    this.userAvatar_ = c3407e.m17115L();
                                    continue;
                                case 66:
                                    this.role_ = c3407e.m17115L();
                                    continue;
                                case 74:
                                    this.liveId_ = c3407e.m17115L();
                                    continue;
                                case EACTags.COMMAND_TO_PERFORM /* 82 */:
                                    this.roomId_ = c3407e.m17115L();
                                    continue;
                                case 90:
                                    this.category_ = c3407e.m17115L();
                                    continue;
                                case EACTags.FCP_TEMPLATE /* 98 */:
                                    this.source_ = c3407e.m17115L();
                                    continue;
                                case 104:
                                    this.position_ = c3407e.m17141u();
                                    continue;
                                case 114:
                                    this.state_ = c3407e.m17115L();
                                    continue;
                                case 120:
                                    this.isAway_ = c3407e.m17133m();
                                    continue;
                                case 128:
                                    this.receivedRewardPoint_ = c3407e.m17142v();
                                    continue;
                                case CipherSuite.TLS_PSK_WITH_RC4_128_SHA /* 138 */:
                                    String strM17115L = c3407e.m17115L();
                                    if (!this.mutedByUserIds_.mo17085q()) {
                                        this.mutedByUserIds_ = GeneratedMessageLite.mutableCopy(this.mutedByUserIds_);
                                    }
                                    this.mutedByUserIds_.add(strM17115L);
                                    continue;
                                case CipherSuite.TLS_RSA_PSK_WITH_RC4_128_SHA /* 146 */:
                                    this.ownerMultiCallOrder_ = c3407e.m17115L();
                                    continue;
                                case CipherSuite.TLS_DH_RSA_WITH_SEED_CBC_SHA /* 152 */:
                                    this.showSeconds_ = c3407e.m17142v();
                                    continue;
                                case 160:
                                    this.pushRemainCount_ = c3407e.m17142v();
                                    continue;
                                case CipherSuite.TLS_PSK_WITH_AES_128_GCM_SHA256 /* 168 */:
                                    this.isLeadRole_ = c3407e.m17133m();
                                    continue;
                                case 178:
                                    this.refreshPushStreamUrl_ = c3407e.m17115L();
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
                        synchronized (MultiCall.class) {
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

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkMultiCallMessage.MultiCallOrBuilder
        public String getCategory() {
            return this.category_;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkMultiCallMessage.MultiCallOrBuilder
        public ByteString getCategoryBytes() {
            return ByteString.copyFromUtf8(this.category_);
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkMultiCallMessage.MultiCallOrBuilder
        public String getId() {
            return this.id_;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkMultiCallMessage.MultiCallOrBuilder
        public ByteString getIdBytes() {
            return ByteString.copyFromUtf8(this.id_);
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkMultiCallMessage.MultiCallOrBuilder
        public boolean getIsAway() {
            return this.isAway_;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkMultiCallMessage.MultiCallOrBuilder
        public boolean getIsLeadRole() {
            return this.isLeadRole_;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkMultiCallMessage.MultiCallOrBuilder
        public String getLiveId() {
            return this.liveId_;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkMultiCallMessage.MultiCallOrBuilder
        public ByteString getLiveIdBytes() {
            return ByteString.copyFromUtf8(this.liveId_);
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkMultiCallMessage.MultiCallOrBuilder
        public String getMutedByUserIds(int i) {
            return this.mutedByUserIds_.get(i);
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkMultiCallMessage.MultiCallOrBuilder
        public ByteString getMutedByUserIdsBytes(int i) {
            return ByteString.copyFromUtf8(this.mutedByUserIds_.get(i));
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkMultiCallMessage.MultiCallOrBuilder
        public int getMutedByUserIdsCount() {
            return this.mutedByUserIds_.size();
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkMultiCallMessage.MultiCallOrBuilder
        public List<String> getMutedByUserIdsList() {
            return this.mutedByUserIds_;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkMultiCallMessage.MultiCallOrBuilder
        public String getOwnerLiveId() {
            return this.ownerLiveId_;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkMultiCallMessage.MultiCallOrBuilder
        public ByteString getOwnerLiveIdBytes() {
            return ByteString.copyFromUtf8(this.ownerLiveId_);
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkMultiCallMessage.MultiCallOrBuilder
        public String getOwnerMultiCallOrder() {
            return this.ownerMultiCallOrder_;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkMultiCallMessage.MultiCallOrBuilder
        public ByteString getOwnerMultiCallOrderBytes() {
            return ByteString.copyFromUtf8(this.ownerMultiCallOrder_);
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkMultiCallMessage.MultiCallOrBuilder
        public String getOwnerRoomId() {
            return this.ownerRoomId_;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkMultiCallMessage.MultiCallOrBuilder
        public ByteString getOwnerRoomIdBytes() {
            return ByteString.copyFromUtf8(this.ownerRoomId_);
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkMultiCallMessage.MultiCallOrBuilder
        public String getOwnerUserId() {
            return this.ownerUserId_;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkMultiCallMessage.MultiCallOrBuilder
        public ByteString getOwnerUserIdBytes() {
            return ByteString.copyFromUtf8(this.ownerUserId_);
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkMultiCallMessage.MultiCallOrBuilder
        public int getPosition() {
            return this.position_;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkMultiCallMessage.MultiCallOrBuilder
        public long getPushRemainCount() {
            return this.pushRemainCount_;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkMultiCallMessage.MultiCallOrBuilder
        public long getReceivedRewardPoint() {
            return this.receivedRewardPoint_;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkMultiCallMessage.MultiCallOrBuilder
        public String getRefreshPushStreamUrl() {
            return this.refreshPushStreamUrl_;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkMultiCallMessage.MultiCallOrBuilder
        public ByteString getRefreshPushStreamUrlBytes() {
            return ByteString.copyFromUtf8(this.refreshPushStreamUrl_);
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkMultiCallMessage.MultiCallOrBuilder
        public String getRole() {
            return this.role_;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkMultiCallMessage.MultiCallOrBuilder
        public ByteString getRoleBytes() {
            return ByteString.copyFromUtf8(this.role_);
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkMultiCallMessage.MultiCallOrBuilder
        public String getRoomId() {
            return this.roomId_;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkMultiCallMessage.MultiCallOrBuilder
        public ByteString getRoomIdBytes() {
            return ByteString.copyFromUtf8(this.roomId_);
        }

        @Override // com.google.protobuf.InterfaceC3419q
        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int iM16901K = !this.id_.isEmpty() ? CodedOutputStream.m16901K(1, getId()) : 0;
            if (!this.ownerUserId_.isEmpty()) {
                iM16901K += CodedOutputStream.m16901K(2, getOwnerUserId());
            }
            if (!this.ownerLiveId_.isEmpty()) {
                iM16901K += CodedOutputStream.m16901K(3, getOwnerLiveId());
            }
            if (!this.ownerRoomId_.isEmpty()) {
                iM16901K += CodedOutputStream.m16901K(4, getOwnerRoomId());
            }
            if (!this.userId_.isEmpty()) {
                iM16901K += CodedOutputStream.m16901K(5, getUserId());
            }
            if (!this.userName_.isEmpty()) {
                iM16901K += CodedOutputStream.m16901K(6, getUserName());
            }
            if (!this.userAvatar_.isEmpty()) {
                iM16901K += CodedOutputStream.m16901K(7, getUserAvatar());
            }
            if (!this.role_.isEmpty()) {
                iM16901K += CodedOutputStream.m16901K(8, getRole());
            }
            if (!this.liveId_.isEmpty()) {
                iM16901K += CodedOutputStream.m16901K(9, getLiveId());
            }
            if (!this.roomId_.isEmpty()) {
                iM16901K += CodedOutputStream.m16901K(10, getRoomId());
            }
            if (!this.category_.isEmpty()) {
                iM16901K += CodedOutputStream.m16901K(11, getCategory());
            }
            if (!this.source_.isEmpty()) {
                iM16901K += CodedOutputStream.m16901K(12, getSource());
            }
            int i2 = this.position_;
            if (i2 != 0) {
                iM16901K += CodedOutputStream.m16929t(13, i2);
            }
            if (!this.state_.isEmpty()) {
                iM16901K += CodedOutputStream.m16901K(14, getState());
            }
            boolean z = this.isAway_;
            if (z) {
                iM16901K += CodedOutputStream.m16915f(15, z);
            }
            long j = this.receivedRewardPoint_;
            if (j != 0) {
                iM16901K += CodedOutputStream.m16931v(16, j);
            }
            int iM16902L = 0;
            for (int i3 = 0; i3 < this.mutedByUserIds_.size(); i3++) {
                iM16902L += CodedOutputStream.m16902L(this.mutedByUserIds_.get(i3));
            }
            int size = iM16901K + iM16902L + (getMutedByUserIdsList().size() * 2);
            if (!this.ownerMultiCallOrder_.isEmpty()) {
                size += CodedOutputStream.m16901K(18, getOwnerMultiCallOrder());
            }
            long j2 = this.showSeconds_;
            if (j2 != 0) {
                size += CodedOutputStream.m16931v(19, j2);
            }
            long j3 = this.pushRemainCount_;
            if (j3 != 0) {
                size += CodedOutputStream.m16931v(20, j3);
            }
            boolean z2 = this.isLeadRole_;
            if (z2) {
                size += CodedOutputStream.m16915f(21, z2);
            }
            if (!this.refreshPushStreamUrl_.isEmpty()) {
                size += CodedOutputStream.m16901K(22, getRefreshPushStreamUrl());
            }
            this.memoizedSerializedSize = size;
            return size;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkMultiCallMessage.MultiCallOrBuilder
        public long getShowSeconds() {
            return this.showSeconds_;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkMultiCallMessage.MultiCallOrBuilder
        public String getSource() {
            return this.source_;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkMultiCallMessage.MultiCallOrBuilder
        public ByteString getSourceBytes() {
            return ByteString.copyFromUtf8(this.source_);
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkMultiCallMessage.MultiCallOrBuilder
        public String getState() {
            return this.state_;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkMultiCallMessage.MultiCallOrBuilder
        public ByteString getStateBytes() {
            return ByteString.copyFromUtf8(this.state_);
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkMultiCallMessage.MultiCallOrBuilder
        public String getUserAvatar() {
            return this.userAvatar_;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkMultiCallMessage.MultiCallOrBuilder
        public ByteString getUserAvatarBytes() {
            return ByteString.copyFromUtf8(this.userAvatar_);
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkMultiCallMessage.MultiCallOrBuilder
        public String getUserId() {
            return this.userId_;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkMultiCallMessage.MultiCallOrBuilder
        public ByteString getUserIdBytes() {
            return ByteString.copyFromUtf8(this.userId_);
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkMultiCallMessage.MultiCallOrBuilder
        public String getUserName() {
            return this.userName_;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkMultiCallMessage.MultiCallOrBuilder
        public ByteString getUserNameBytes() {
            return ByteString.copyFromUtf8(this.userName_);
        }

        @Override // com.google.protobuf.InterfaceC3419q
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (!this.id_.isEmpty()) {
                codedOutputStream.mo16939D0(1, getId());
            }
            if (!this.ownerUserId_.isEmpty()) {
                codedOutputStream.mo16939D0(2, getOwnerUserId());
            }
            if (!this.ownerLiveId_.isEmpty()) {
                codedOutputStream.mo16939D0(3, getOwnerLiveId());
            }
            if (!this.ownerRoomId_.isEmpty()) {
                codedOutputStream.mo16939D0(4, getOwnerRoomId());
            }
            if (!this.userId_.isEmpty()) {
                codedOutputStream.mo16939D0(5, getUserId());
            }
            if (!this.userName_.isEmpty()) {
                codedOutputStream.mo16939D0(6, getUserName());
            }
            if (!this.userAvatar_.isEmpty()) {
                codedOutputStream.mo16939D0(7, getUserAvatar());
            }
            if (!this.role_.isEmpty()) {
                codedOutputStream.mo16939D0(8, getRole());
            }
            if (!this.liveId_.isEmpty()) {
                codedOutputStream.mo16939D0(9, getLiveId());
            }
            if (!this.roomId_.isEmpty()) {
                codedOutputStream.mo16939D0(10, getRoomId());
            }
            if (!this.category_.isEmpty()) {
                codedOutputStream.mo16939D0(11, getCategory());
            }
            if (!this.source_.isEmpty()) {
                codedOutputStream.mo16939D0(12, getSource());
            }
            int i = this.position_;
            if (i != 0) {
                codedOutputStream.mo16970s0(13, i);
            }
            if (!this.state_.isEmpty()) {
                codedOutputStream.mo16939D0(14, getState());
            }
            boolean z = this.isAway_;
            if (z) {
                codedOutputStream.mo16950a0(15, z);
            }
            long j = this.receivedRewardPoint_;
            if (j != 0) {
                codedOutputStream.m16972u0(16, j);
            }
            for (int i2 = 0; i2 < this.mutedByUserIds_.size(); i2++) {
                codedOutputStream.mo16939D0(17, this.mutedByUserIds_.get(i2));
            }
            if (!this.ownerMultiCallOrder_.isEmpty()) {
                codedOutputStream.mo16939D0(18, getOwnerMultiCallOrder());
            }
            long j2 = this.showSeconds_;
            if (j2 != 0) {
                codedOutputStream.m16972u0(19, j2);
            }
            long j3 = this.pushRemainCount_;
            if (j3 != 0) {
                codedOutputStream.m16972u0(20, j3);
            }
            boolean z2 = this.isLeadRole_;
            if (z2) {
                codedOutputStream.mo16950a0(21, z2);
            }
            if (this.refreshPushStreamUrl_.isEmpty()) {
                return;
            }
            codedOutputStream.mo16939D0(22, getRefreshPushStreamUrl());
        }

        public static MultiCall parseDelimitedFrom(InputStream inputStream, C3410h c3410h) throws IOException {
            return (MultiCall) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, c3410h);
        }

        public static MultiCall parseFrom(ByteString byteString, C3410h c3410h) throws InvalidProtocolBufferException {
            return (MultiCall) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, c3410h);
        }

        public static MultiCall parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (MultiCall) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static MultiCall parseFrom(byte[] bArr, C3410h c3410h) throws InvalidProtocolBufferException {
            return (MultiCall) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, c3410h);
        }

        public static MultiCall parseFrom(InputStream inputStream) throws IOException {
            return (MultiCall) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static MultiCall parseFrom(InputStream inputStream, C3410h c3410h) throws IOException {
            return (MultiCall) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, c3410h);
        }

        public static MultiCall parseFrom(C3407e c3407e) throws IOException {
            return (MultiCall) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, c3407e);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static MultiCall parseFrom(C3407e c3407e, C3410h c3410h) throws IOException {
            return (MultiCall) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, c3407e, c3410h);
        }
    }

    public static final class MultiCallInvite extends GeneratedMessageLite<MultiCallInvite, Builder> implements MultiCallInviteOrBuilder {
        private static final MultiCallInvite DEFAULT_INSTANCE;
        public static final int ID_FIELD_NUMBER = 1;
        public static final int OWNERLIVEID_FIELD_NUMBER = 5;
        public static final int OWNERMULTICALLORDER_FIELD_NUMBER = 11;
        public static final int OWNERUSERAVATAR_FIELD_NUMBER = 4;
        public static final int OWNERUSERID_FIELD_NUMBER = 2;
        public static final int OWNERUSERNAME_FIELD_NUMBER = 3;
        private static volatile i860<MultiCallInvite> PARSER = null;
        public static final int SHOWSECONDS_FIELD_NUMBER = 10;
        public static final int TOLIVEID_FIELD_NUMBER = 7;
        public static final int TOUSERAVATAR_FIELD_NUMBER = 9;
        public static final int TOUSERID_FIELD_NUMBER = 6;
        public static final int TOUSERNAME_FIELD_NUMBER = 8;
        private int showSeconds_;
        private String id_ = "";
        private String ownerUserId_ = "";
        private String ownerUserName_ = "";
        private String ownerUserAvatar_ = "";
        private String ownerLiveId_ = "";
        private String toUserId_ = "";
        private String toLiveId_ = "";
        private String toUserName_ = "";
        private String toUserAvatar_ = "";
        private String ownerMultiCallOrder_ = "";

        public static final class Builder extends GeneratedMessageLite.AbstractC3380b<MultiCallInvite, Builder> implements MultiCallInviteOrBuilder {
            private Builder() {
                super(MultiCallInvite.DEFAULT_INSTANCE);
            }

            public Builder clearId() {
                copyOnWrite();
                ((MultiCallInvite) this.instance).clearId();
                return this;
            }

            public Builder clearOwnerLiveId() {
                copyOnWrite();
                ((MultiCallInvite) this.instance).clearOwnerLiveId();
                return this;
            }

            public Builder clearOwnerMultiCallOrder() {
                copyOnWrite();
                ((MultiCallInvite) this.instance).clearOwnerMultiCallOrder();
                return this;
            }

            public Builder clearOwnerUserAvatar() {
                copyOnWrite();
                ((MultiCallInvite) this.instance).clearOwnerUserAvatar();
                return this;
            }

            public Builder clearOwnerUserId() {
                copyOnWrite();
                ((MultiCallInvite) this.instance).clearOwnerUserId();
                return this;
            }

            public Builder clearOwnerUserName() {
                copyOnWrite();
                ((MultiCallInvite) this.instance).clearOwnerUserName();
                return this;
            }

            public Builder clearShowSeconds() {
                copyOnWrite();
                ((MultiCallInvite) this.instance).clearShowSeconds();
                return this;
            }

            public Builder clearToLiveId() {
                copyOnWrite();
                ((MultiCallInvite) this.instance).clearToLiveId();
                return this;
            }

            public Builder clearToUserAvatar() {
                copyOnWrite();
                ((MultiCallInvite) this.instance).clearToUserAvatar();
                return this;
            }

            public Builder clearToUserId() {
                copyOnWrite();
                ((MultiCallInvite) this.instance).clearToUserId();
                return this;
            }

            public Builder clearToUserName() {
                copyOnWrite();
                ((MultiCallInvite) this.instance).clearToUserName();
                return this;
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkMultiCallMessage.MultiCallInviteOrBuilder
            public String getId() {
                return ((MultiCallInvite) this.instance).getId();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkMultiCallMessage.MultiCallInviteOrBuilder
            public ByteString getIdBytes() {
                return ((MultiCallInvite) this.instance).getIdBytes();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkMultiCallMessage.MultiCallInviteOrBuilder
            public String getOwnerLiveId() {
                return ((MultiCallInvite) this.instance).getOwnerLiveId();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkMultiCallMessage.MultiCallInviteOrBuilder
            public ByteString getOwnerLiveIdBytes() {
                return ((MultiCallInvite) this.instance).getOwnerLiveIdBytes();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkMultiCallMessage.MultiCallInviteOrBuilder
            public String getOwnerMultiCallOrder() {
                return ((MultiCallInvite) this.instance).getOwnerMultiCallOrder();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkMultiCallMessage.MultiCallInviteOrBuilder
            public ByteString getOwnerMultiCallOrderBytes() {
                return ((MultiCallInvite) this.instance).getOwnerMultiCallOrderBytes();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkMultiCallMessage.MultiCallInviteOrBuilder
            public String getOwnerUserAvatar() {
                return ((MultiCallInvite) this.instance).getOwnerUserAvatar();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkMultiCallMessage.MultiCallInviteOrBuilder
            public ByteString getOwnerUserAvatarBytes() {
                return ((MultiCallInvite) this.instance).getOwnerUserAvatarBytes();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkMultiCallMessage.MultiCallInviteOrBuilder
            public String getOwnerUserId() {
                return ((MultiCallInvite) this.instance).getOwnerUserId();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkMultiCallMessage.MultiCallInviteOrBuilder
            public ByteString getOwnerUserIdBytes() {
                return ((MultiCallInvite) this.instance).getOwnerUserIdBytes();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkMultiCallMessage.MultiCallInviteOrBuilder
            public String getOwnerUserName() {
                return ((MultiCallInvite) this.instance).getOwnerUserName();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkMultiCallMessage.MultiCallInviteOrBuilder
            public ByteString getOwnerUserNameBytes() {
                return ((MultiCallInvite) this.instance).getOwnerUserNameBytes();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkMultiCallMessage.MultiCallInviteOrBuilder
            public int getShowSeconds() {
                return ((MultiCallInvite) this.instance).getShowSeconds();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkMultiCallMessage.MultiCallInviteOrBuilder
            public String getToLiveId() {
                return ((MultiCallInvite) this.instance).getToLiveId();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkMultiCallMessage.MultiCallInviteOrBuilder
            public ByteString getToLiveIdBytes() {
                return ((MultiCallInvite) this.instance).getToLiveIdBytes();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkMultiCallMessage.MultiCallInviteOrBuilder
            public String getToUserAvatar() {
                return ((MultiCallInvite) this.instance).getToUserAvatar();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkMultiCallMessage.MultiCallInviteOrBuilder
            public ByteString getToUserAvatarBytes() {
                return ((MultiCallInvite) this.instance).getToUserAvatarBytes();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkMultiCallMessage.MultiCallInviteOrBuilder
            public String getToUserId() {
                return ((MultiCallInvite) this.instance).getToUserId();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkMultiCallMessage.MultiCallInviteOrBuilder
            public ByteString getToUserIdBytes() {
                return ((MultiCallInvite) this.instance).getToUserIdBytes();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkMultiCallMessage.MultiCallInviteOrBuilder
            public String getToUserName() {
                return ((MultiCallInvite) this.instance).getToUserName();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkMultiCallMessage.MultiCallInviteOrBuilder
            public ByteString getToUserNameBytes() {
                return ((MultiCallInvite) this.instance).getToUserNameBytes();
            }

            public Builder setId(String str) {
                copyOnWrite();
                ((MultiCallInvite) this.instance).setId(str);
                return this;
            }

            public Builder setIdBytes(ByteString byteString) {
                copyOnWrite();
                ((MultiCallInvite) this.instance).setIdBytes(byteString);
                return this;
            }

            public Builder setOwnerLiveId(String str) {
                copyOnWrite();
                ((MultiCallInvite) this.instance).setOwnerLiveId(str);
                return this;
            }

            public Builder setOwnerLiveIdBytes(ByteString byteString) {
                copyOnWrite();
                ((MultiCallInvite) this.instance).setOwnerLiveIdBytes(byteString);
                return this;
            }

            public Builder setOwnerMultiCallOrder(String str) {
                copyOnWrite();
                ((MultiCallInvite) this.instance).setOwnerMultiCallOrder(str);
                return this;
            }

            public Builder setOwnerMultiCallOrderBytes(ByteString byteString) {
                copyOnWrite();
                ((MultiCallInvite) this.instance).setOwnerMultiCallOrderBytes(byteString);
                return this;
            }

            public Builder setOwnerUserAvatar(String str) {
                copyOnWrite();
                ((MultiCallInvite) this.instance).setOwnerUserAvatar(str);
                return this;
            }

            public Builder setOwnerUserAvatarBytes(ByteString byteString) {
                copyOnWrite();
                ((MultiCallInvite) this.instance).setOwnerUserAvatarBytes(byteString);
                return this;
            }

            public Builder setOwnerUserId(String str) {
                copyOnWrite();
                ((MultiCallInvite) this.instance).setOwnerUserId(str);
                return this;
            }

            public Builder setOwnerUserIdBytes(ByteString byteString) {
                copyOnWrite();
                ((MultiCallInvite) this.instance).setOwnerUserIdBytes(byteString);
                return this;
            }

            public Builder setOwnerUserName(String str) {
                copyOnWrite();
                ((MultiCallInvite) this.instance).setOwnerUserName(str);
                return this;
            }

            public Builder setOwnerUserNameBytes(ByteString byteString) {
                copyOnWrite();
                ((MultiCallInvite) this.instance).setOwnerUserNameBytes(byteString);
                return this;
            }

            public Builder setShowSeconds(int i) {
                copyOnWrite();
                ((MultiCallInvite) this.instance).setShowSeconds(i);
                return this;
            }

            public Builder setToLiveId(String str) {
                copyOnWrite();
                ((MultiCallInvite) this.instance).setToLiveId(str);
                return this;
            }

            public Builder setToLiveIdBytes(ByteString byteString) {
                copyOnWrite();
                ((MultiCallInvite) this.instance).setToLiveIdBytes(byteString);
                return this;
            }

            public Builder setToUserAvatar(String str) {
                copyOnWrite();
                ((MultiCallInvite) this.instance).setToUserAvatar(str);
                return this;
            }

            public Builder setToUserAvatarBytes(ByteString byteString) {
                copyOnWrite();
                ((MultiCallInvite) this.instance).setToUserAvatarBytes(byteString);
                return this;
            }

            public Builder setToUserId(String str) {
                copyOnWrite();
                ((MultiCallInvite) this.instance).setToUserId(str);
                return this;
            }

            public Builder setToUserIdBytes(ByteString byteString) {
                copyOnWrite();
                ((MultiCallInvite) this.instance).setToUserIdBytes(byteString);
                return this;
            }

            public Builder setToUserName(String str) {
                copyOnWrite();
                ((MultiCallInvite) this.instance).setToUserName(str);
                return this;
            }

            public Builder setToUserNameBytes(ByteString byteString) {
                copyOnWrite();
                ((MultiCallInvite) this.instance).setToUserNameBytes(byteString);
                return this;
            }
        }

        static {
            MultiCallInvite multiCallInvite = new MultiCallInvite();
            DEFAULT_INSTANCE = multiCallInvite;
            multiCallInvite.makeImmutable();
        }

        private MultiCallInvite() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearId() {
            this.id_ = getDefaultInstance().getId();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearOwnerLiveId() {
            this.ownerLiveId_ = getDefaultInstance().getOwnerLiveId();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearOwnerMultiCallOrder() {
            this.ownerMultiCallOrder_ = getDefaultInstance().getOwnerMultiCallOrder();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearOwnerUserAvatar() {
            this.ownerUserAvatar_ = getDefaultInstance().getOwnerUserAvatar();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearOwnerUserId() {
            this.ownerUserId_ = getDefaultInstance().getOwnerUserId();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearOwnerUserName() {
            this.ownerUserName_ = getDefaultInstance().getOwnerUserName();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearShowSeconds() {
            this.showSeconds_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearToLiveId() {
            this.toLiveId_ = getDefaultInstance().getToLiveId();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearToUserAvatar() {
            this.toUserAvatar_ = getDefaultInstance().getToUserAvatar();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearToUserId() {
            this.toUserId_ = getDefaultInstance().getToUserId();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearToUserName() {
            this.toUserName_ = getDefaultInstance().getToUserName();
        }

        public static MultiCallInvite getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder(MultiCallInvite multiCallInvite) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(multiCallInvite);
        }

        public static MultiCallInvite parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (MultiCallInvite) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static MultiCallInvite parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (MultiCallInvite) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static i860<MultiCallInvite> parser() {
            return DEFAULT_INSTANCE.getParserForType();
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
        public void setOwnerLiveId(String str) {
            str.getClass();
            this.ownerLiveId_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setOwnerLiveIdBytes(ByteString byteString) {
            byteString.getClass();
            AbstractC3403a.checkByteStringIsUtf8(byteString);
            this.ownerLiveId_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setOwnerMultiCallOrder(String str) {
            str.getClass();
            this.ownerMultiCallOrder_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setOwnerMultiCallOrderBytes(ByteString byteString) {
            byteString.getClass();
            AbstractC3403a.checkByteStringIsUtf8(byteString);
            this.ownerMultiCallOrder_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setOwnerUserAvatar(String str) {
            str.getClass();
            this.ownerUserAvatar_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setOwnerUserAvatarBytes(ByteString byteString) {
            byteString.getClass();
            AbstractC3403a.checkByteStringIsUtf8(byteString);
            this.ownerUserAvatar_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setOwnerUserId(String str) {
            str.getClass();
            this.ownerUserId_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setOwnerUserIdBytes(ByteString byteString) {
            byteString.getClass();
            AbstractC3403a.checkByteStringIsUtf8(byteString);
            this.ownerUserId_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setOwnerUserName(String str) {
            str.getClass();
            this.ownerUserName_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setOwnerUserNameBytes(ByteString byteString) {
            byteString.getClass();
            AbstractC3403a.checkByteStringIsUtf8(byteString);
            this.ownerUserName_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setShowSeconds(int i) {
            this.showSeconds_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setToLiveId(String str) {
            str.getClass();
            this.toLiveId_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setToLiveIdBytes(ByteString byteString) {
            byteString.getClass();
            AbstractC3403a.checkByteStringIsUtf8(byteString);
            this.toLiveId_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setToUserAvatar(String str) {
            str.getClass();
            this.toUserAvatar_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setToUserAvatarBytes(ByteString byteString) {
            byteString.getClass();
            AbstractC3403a.checkByteStringIsUtf8(byteString);
            this.toUserAvatar_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setToUserId(String str) {
            str.getClass();
            this.toUserId_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setToUserIdBytes(ByteString byteString) {
            byteString.getClass();
            AbstractC3403a.checkByteStringIsUtf8(byteString);
            this.toUserId_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setToUserName(String str) {
            str.getClass();
            this.toUserName_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setToUserNameBytes(ByteString byteString) {
            byteString.getClass();
            AbstractC3403a.checkByteStringIsUtf8(byteString);
            this.toUserName_ = byteString.toStringUtf8();
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            boolean z = false;
            switch (C45021.f15978xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new MultiCallInvite();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                    return null;
                case 4:
                    return new Builder();
                case 5:
                    GeneratedMessageLite.InterfaceC3386h interfaceC3386h = (GeneratedMessageLite.InterfaceC3386h) obj;
                    MultiCallInvite multiCallInvite = (MultiCallInvite) obj2;
                    this.id_ = interfaceC3386h.mo16997f(!this.id_.isEmpty(), this.id_, !multiCallInvite.id_.isEmpty(), multiCallInvite.id_);
                    this.ownerUserId_ = interfaceC3386h.mo16997f(!this.ownerUserId_.isEmpty(), this.ownerUserId_, !multiCallInvite.ownerUserId_.isEmpty(), multiCallInvite.ownerUserId_);
                    this.ownerUserName_ = interfaceC3386h.mo16997f(!this.ownerUserName_.isEmpty(), this.ownerUserName_, !multiCallInvite.ownerUserName_.isEmpty(), multiCallInvite.ownerUserName_);
                    this.ownerUserAvatar_ = interfaceC3386h.mo16997f(!this.ownerUserAvatar_.isEmpty(), this.ownerUserAvatar_, !multiCallInvite.ownerUserAvatar_.isEmpty(), multiCallInvite.ownerUserAvatar_);
                    this.ownerLiveId_ = interfaceC3386h.mo16997f(!this.ownerLiveId_.isEmpty(), this.ownerLiveId_, !multiCallInvite.ownerLiveId_.isEmpty(), multiCallInvite.ownerLiveId_);
                    this.toUserId_ = interfaceC3386h.mo16997f(!this.toUserId_.isEmpty(), this.toUserId_, !multiCallInvite.toUserId_.isEmpty(), multiCallInvite.toUserId_);
                    this.toLiveId_ = interfaceC3386h.mo16997f(!this.toLiveId_.isEmpty(), this.toLiveId_, !multiCallInvite.toLiveId_.isEmpty(), multiCallInvite.toLiveId_);
                    this.toUserName_ = interfaceC3386h.mo16997f(!this.toUserName_.isEmpty(), this.toUserName_, !multiCallInvite.toUserName_.isEmpty(), multiCallInvite.toUserName_);
                    this.toUserAvatar_ = interfaceC3386h.mo16997f(!this.toUserAvatar_.isEmpty(), this.toUserAvatar_, !multiCallInvite.toUserAvatar_.isEmpty(), multiCallInvite.toUserAvatar_);
                    int i = this.showSeconds_;
                    boolean z2 = i != 0;
                    int i2 = multiCallInvite.showSeconds_;
                    this.showSeconds_ = interfaceC3386h.mo16996e(z2, i, i2 != 0, i2);
                    this.ownerMultiCallOrder_ = interfaceC3386h.mo16997f(!this.ownerMultiCallOrder_.isEmpty(), this.ownerMultiCallOrder_, !multiCallInvite.ownerMultiCallOrder_.isEmpty(), multiCallInvite.ownerMultiCallOrder_);
                    GeneratedMessageLite.C3385g c3385g = GeneratedMessageLite.C3385g.INSTANCE;
                    return this;
                case 6:
                    C3407e c3407e = (C3407e) obj;
                    while (!z) {
                        try {
                            int iM17116M = c3407e.m17116M();
                            switch (iM17116M) {
                                case 0:
                                    break;
                                case 10:
                                    this.id_ = c3407e.m17115L();
                                    continue;
                                case 18:
                                    this.ownerUserId_ = c3407e.m17115L();
                                    continue;
                                case 26:
                                    this.ownerUserName_ = c3407e.m17115L();
                                    continue;
                                case 34:
                                    this.ownerUserAvatar_ = c3407e.m17115L();
                                    continue;
                                case 42:
                                    this.ownerLiveId_ = c3407e.m17115L();
                                    continue;
                                case 50:
                                    this.toUserId_ = c3407e.m17115L();
                                    continue;
                                case 58:
                                    this.toLiveId_ = c3407e.m17115L();
                                    continue;
                                case 66:
                                    this.toUserName_ = c3407e.m17115L();
                                    continue;
                                case 74:
                                    this.toUserAvatar_ = c3407e.m17115L();
                                    continue;
                                case 80:
                                    this.showSeconds_ = c3407e.m17141u();
                                    continue;
                                case 90:
                                    this.ownerMultiCallOrder_ = c3407e.m17115L();
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
                        synchronized (MultiCallInvite.class) {
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

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkMultiCallMessage.MultiCallInviteOrBuilder
        public String getId() {
            return this.id_;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkMultiCallMessage.MultiCallInviteOrBuilder
        public ByteString getIdBytes() {
            return ByteString.copyFromUtf8(this.id_);
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkMultiCallMessage.MultiCallInviteOrBuilder
        public String getOwnerLiveId() {
            return this.ownerLiveId_;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkMultiCallMessage.MultiCallInviteOrBuilder
        public ByteString getOwnerLiveIdBytes() {
            return ByteString.copyFromUtf8(this.ownerLiveId_);
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkMultiCallMessage.MultiCallInviteOrBuilder
        public String getOwnerMultiCallOrder() {
            return this.ownerMultiCallOrder_;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkMultiCallMessage.MultiCallInviteOrBuilder
        public ByteString getOwnerMultiCallOrderBytes() {
            return ByteString.copyFromUtf8(this.ownerMultiCallOrder_);
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkMultiCallMessage.MultiCallInviteOrBuilder
        public String getOwnerUserAvatar() {
            return this.ownerUserAvatar_;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkMultiCallMessage.MultiCallInviteOrBuilder
        public ByteString getOwnerUserAvatarBytes() {
            return ByteString.copyFromUtf8(this.ownerUserAvatar_);
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkMultiCallMessage.MultiCallInviteOrBuilder
        public String getOwnerUserId() {
            return this.ownerUserId_;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkMultiCallMessage.MultiCallInviteOrBuilder
        public ByteString getOwnerUserIdBytes() {
            return ByteString.copyFromUtf8(this.ownerUserId_);
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkMultiCallMessage.MultiCallInviteOrBuilder
        public String getOwnerUserName() {
            return this.ownerUserName_;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkMultiCallMessage.MultiCallInviteOrBuilder
        public ByteString getOwnerUserNameBytes() {
            return ByteString.copyFromUtf8(this.ownerUserName_);
        }

        @Override // com.google.protobuf.InterfaceC3419q
        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int iM16901K = !this.id_.isEmpty() ? CodedOutputStream.m16901K(1, getId()) : 0;
            if (!this.ownerUserId_.isEmpty()) {
                iM16901K += CodedOutputStream.m16901K(2, getOwnerUserId());
            }
            if (!this.ownerUserName_.isEmpty()) {
                iM16901K += CodedOutputStream.m16901K(3, getOwnerUserName());
            }
            if (!this.ownerUserAvatar_.isEmpty()) {
                iM16901K += CodedOutputStream.m16901K(4, getOwnerUserAvatar());
            }
            if (!this.ownerLiveId_.isEmpty()) {
                iM16901K += CodedOutputStream.m16901K(5, getOwnerLiveId());
            }
            if (!this.toUserId_.isEmpty()) {
                iM16901K += CodedOutputStream.m16901K(6, getToUserId());
            }
            if (!this.toLiveId_.isEmpty()) {
                iM16901K += CodedOutputStream.m16901K(7, getToLiveId());
            }
            if (!this.toUserName_.isEmpty()) {
                iM16901K += CodedOutputStream.m16901K(8, getToUserName());
            }
            if (!this.toUserAvatar_.isEmpty()) {
                iM16901K += CodedOutputStream.m16901K(9, getToUserAvatar());
            }
            int i2 = this.showSeconds_;
            if (i2 != 0) {
                iM16901K += CodedOutputStream.m16929t(10, i2);
            }
            if (!this.ownerMultiCallOrder_.isEmpty()) {
                iM16901K += CodedOutputStream.m16901K(11, getOwnerMultiCallOrder());
            }
            this.memoizedSerializedSize = iM16901K;
            return iM16901K;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkMultiCallMessage.MultiCallInviteOrBuilder
        public int getShowSeconds() {
            return this.showSeconds_;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkMultiCallMessage.MultiCallInviteOrBuilder
        public String getToLiveId() {
            return this.toLiveId_;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkMultiCallMessage.MultiCallInviteOrBuilder
        public ByteString getToLiveIdBytes() {
            return ByteString.copyFromUtf8(this.toLiveId_);
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkMultiCallMessage.MultiCallInviteOrBuilder
        public String getToUserAvatar() {
            return this.toUserAvatar_;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkMultiCallMessage.MultiCallInviteOrBuilder
        public ByteString getToUserAvatarBytes() {
            return ByteString.copyFromUtf8(this.toUserAvatar_);
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkMultiCallMessage.MultiCallInviteOrBuilder
        public String getToUserId() {
            return this.toUserId_;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkMultiCallMessage.MultiCallInviteOrBuilder
        public ByteString getToUserIdBytes() {
            return ByteString.copyFromUtf8(this.toUserId_);
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkMultiCallMessage.MultiCallInviteOrBuilder
        public String getToUserName() {
            return this.toUserName_;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkMultiCallMessage.MultiCallInviteOrBuilder
        public ByteString getToUserNameBytes() {
            return ByteString.copyFromUtf8(this.toUserName_);
        }

        @Override // com.google.protobuf.InterfaceC3419q
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (!this.id_.isEmpty()) {
                codedOutputStream.mo16939D0(1, getId());
            }
            if (!this.ownerUserId_.isEmpty()) {
                codedOutputStream.mo16939D0(2, getOwnerUserId());
            }
            if (!this.ownerUserName_.isEmpty()) {
                codedOutputStream.mo16939D0(3, getOwnerUserName());
            }
            if (!this.ownerUserAvatar_.isEmpty()) {
                codedOutputStream.mo16939D0(4, getOwnerUserAvatar());
            }
            if (!this.ownerLiveId_.isEmpty()) {
                codedOutputStream.mo16939D0(5, getOwnerLiveId());
            }
            if (!this.toUserId_.isEmpty()) {
                codedOutputStream.mo16939D0(6, getToUserId());
            }
            if (!this.toLiveId_.isEmpty()) {
                codedOutputStream.mo16939D0(7, getToLiveId());
            }
            if (!this.toUserName_.isEmpty()) {
                codedOutputStream.mo16939D0(8, getToUserName());
            }
            if (!this.toUserAvatar_.isEmpty()) {
                codedOutputStream.mo16939D0(9, getToUserAvatar());
            }
            int i = this.showSeconds_;
            if (i != 0) {
                codedOutputStream.mo16970s0(10, i);
            }
            if (this.ownerMultiCallOrder_.isEmpty()) {
                return;
            }
            codedOutputStream.mo16939D0(11, getOwnerMultiCallOrder());
        }

        public static MultiCallInvite parseDelimitedFrom(InputStream inputStream, C3410h c3410h) throws IOException {
            return (MultiCallInvite) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, c3410h);
        }

        public static MultiCallInvite parseFrom(ByteString byteString, C3410h c3410h) throws InvalidProtocolBufferException {
            return (MultiCallInvite) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, c3410h);
        }

        public static MultiCallInvite parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (MultiCallInvite) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static MultiCallInvite parseFrom(byte[] bArr, C3410h c3410h) throws InvalidProtocolBufferException {
            return (MultiCallInvite) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, c3410h);
        }

        public static MultiCallInvite parseFrom(InputStream inputStream) throws IOException {
            return (MultiCallInvite) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static MultiCallInvite parseFrom(InputStream inputStream, C3410h c3410h) throws IOException {
            return (MultiCallInvite) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, c3410h);
        }

        public static MultiCallInvite parseFrom(C3407e c3407e) throws IOException {
            return (MultiCallInvite) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, c3407e);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static MultiCallInvite parseFrom(C3407e c3407e, C3410h c3410h) throws IOException {
            return (MultiCallInvite) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, c3407e, c3410h);
        }
    }

    public static final class MultiCallSwitchToLeadRoleInvite extends GeneratedMessageLite<MultiCallSwitchToLeadRoleInvite, Builder> implements MultiCallSwitchToLeadRoleInviteOrBuilder {
        private static final MultiCallSwitchToLeadRoleInvite DEFAULT_INSTANCE;
        public static final int ID_FIELD_NUMBER = 1;
        public static final int OWNERUSERAVATAR_FIELD_NUMBER = 4;
        public static final int OWNERUSERID_FIELD_NUMBER = 2;
        public static final int OWNERUSERNAME_FIELD_NUMBER = 3;
        private static volatile i860<MultiCallSwitchToLeadRoleInvite> PARSER = null;
        public static final int SHOWSECONDS_FIELD_NUMBER = 8;
        public static final int STATE_FIELD_NUMBER = 9;
        public static final int TOUSERAVATAR_FIELD_NUMBER = 7;
        public static final int TOUSERID_FIELD_NUMBER = 5;
        public static final int TOUSERNAME_FIELD_NUMBER = 6;
        private long showSeconds_;
        private int state_;
        private String id_ = "";
        private String ownerUserId_ = "";
        private String ownerUserName_ = "";
        private String ownerUserAvatar_ = "";
        private String toUserId_ = "";
        private String toUserName_ = "";
        private String toUserAvatar_ = "";

        public static final class Builder extends GeneratedMessageLite.AbstractC3380b<MultiCallSwitchToLeadRoleInvite, Builder> implements MultiCallSwitchToLeadRoleInviteOrBuilder {
            private Builder() {
                super(MultiCallSwitchToLeadRoleInvite.DEFAULT_INSTANCE);
            }

            public Builder clearId() {
                copyOnWrite();
                ((MultiCallSwitchToLeadRoleInvite) this.instance).clearId();
                return this;
            }

            public Builder clearOwnerUserAvatar() {
                copyOnWrite();
                ((MultiCallSwitchToLeadRoleInvite) this.instance).clearOwnerUserAvatar();
                return this;
            }

            public Builder clearOwnerUserId() {
                copyOnWrite();
                ((MultiCallSwitchToLeadRoleInvite) this.instance).clearOwnerUserId();
                return this;
            }

            public Builder clearOwnerUserName() {
                copyOnWrite();
                ((MultiCallSwitchToLeadRoleInvite) this.instance).clearOwnerUserName();
                return this;
            }

            public Builder clearShowSeconds() {
                copyOnWrite();
                ((MultiCallSwitchToLeadRoleInvite) this.instance).clearShowSeconds();
                return this;
            }

            public Builder clearState() {
                copyOnWrite();
                ((MultiCallSwitchToLeadRoleInvite) this.instance).clearState();
                return this;
            }

            public Builder clearToUserAvatar() {
                copyOnWrite();
                ((MultiCallSwitchToLeadRoleInvite) this.instance).clearToUserAvatar();
                return this;
            }

            public Builder clearToUserId() {
                copyOnWrite();
                ((MultiCallSwitchToLeadRoleInvite) this.instance).clearToUserId();
                return this;
            }

            public Builder clearToUserName() {
                copyOnWrite();
                ((MultiCallSwitchToLeadRoleInvite) this.instance).clearToUserName();
                return this;
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkMultiCallMessage.MultiCallSwitchToLeadRoleInviteOrBuilder
            public String getId() {
                return ((MultiCallSwitchToLeadRoleInvite) this.instance).getId();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkMultiCallMessage.MultiCallSwitchToLeadRoleInviteOrBuilder
            public ByteString getIdBytes() {
                return ((MultiCallSwitchToLeadRoleInvite) this.instance).getIdBytes();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkMultiCallMessage.MultiCallSwitchToLeadRoleInviteOrBuilder
            public String getOwnerUserAvatar() {
                return ((MultiCallSwitchToLeadRoleInvite) this.instance).getOwnerUserAvatar();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkMultiCallMessage.MultiCallSwitchToLeadRoleInviteOrBuilder
            public ByteString getOwnerUserAvatarBytes() {
                return ((MultiCallSwitchToLeadRoleInvite) this.instance).getOwnerUserAvatarBytes();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkMultiCallMessage.MultiCallSwitchToLeadRoleInviteOrBuilder
            public String getOwnerUserId() {
                return ((MultiCallSwitchToLeadRoleInvite) this.instance).getOwnerUserId();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkMultiCallMessage.MultiCallSwitchToLeadRoleInviteOrBuilder
            public ByteString getOwnerUserIdBytes() {
                return ((MultiCallSwitchToLeadRoleInvite) this.instance).getOwnerUserIdBytes();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkMultiCallMessage.MultiCallSwitchToLeadRoleInviteOrBuilder
            public String getOwnerUserName() {
                return ((MultiCallSwitchToLeadRoleInvite) this.instance).getOwnerUserName();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkMultiCallMessage.MultiCallSwitchToLeadRoleInviteOrBuilder
            public ByteString getOwnerUserNameBytes() {
                return ((MultiCallSwitchToLeadRoleInvite) this.instance).getOwnerUserNameBytes();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkMultiCallMessage.MultiCallSwitchToLeadRoleInviteOrBuilder
            public long getShowSeconds() {
                return ((MultiCallSwitchToLeadRoleInvite) this.instance).getShowSeconds();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkMultiCallMessage.MultiCallSwitchToLeadRoleInviteOrBuilder
            public InviteState getState() {
                return ((MultiCallSwitchToLeadRoleInvite) this.instance).getState();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkMultiCallMessage.MultiCallSwitchToLeadRoleInviteOrBuilder
            public int getStateValue() {
                return ((MultiCallSwitchToLeadRoleInvite) this.instance).getStateValue();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkMultiCallMessage.MultiCallSwitchToLeadRoleInviteOrBuilder
            public String getToUserAvatar() {
                return ((MultiCallSwitchToLeadRoleInvite) this.instance).getToUserAvatar();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkMultiCallMessage.MultiCallSwitchToLeadRoleInviteOrBuilder
            public ByteString getToUserAvatarBytes() {
                return ((MultiCallSwitchToLeadRoleInvite) this.instance).getToUserAvatarBytes();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkMultiCallMessage.MultiCallSwitchToLeadRoleInviteOrBuilder
            public String getToUserId() {
                return ((MultiCallSwitchToLeadRoleInvite) this.instance).getToUserId();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkMultiCallMessage.MultiCallSwitchToLeadRoleInviteOrBuilder
            public ByteString getToUserIdBytes() {
                return ((MultiCallSwitchToLeadRoleInvite) this.instance).getToUserIdBytes();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkMultiCallMessage.MultiCallSwitchToLeadRoleInviteOrBuilder
            public String getToUserName() {
                return ((MultiCallSwitchToLeadRoleInvite) this.instance).getToUserName();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkMultiCallMessage.MultiCallSwitchToLeadRoleInviteOrBuilder
            public ByteString getToUserNameBytes() {
                return ((MultiCallSwitchToLeadRoleInvite) this.instance).getToUserNameBytes();
            }

            public Builder setId(String str) {
                copyOnWrite();
                ((MultiCallSwitchToLeadRoleInvite) this.instance).setId(str);
                return this;
            }

            public Builder setIdBytes(ByteString byteString) {
                copyOnWrite();
                ((MultiCallSwitchToLeadRoleInvite) this.instance).setIdBytes(byteString);
                return this;
            }

            public Builder setOwnerUserAvatar(String str) {
                copyOnWrite();
                ((MultiCallSwitchToLeadRoleInvite) this.instance).setOwnerUserAvatar(str);
                return this;
            }

            public Builder setOwnerUserAvatarBytes(ByteString byteString) {
                copyOnWrite();
                ((MultiCallSwitchToLeadRoleInvite) this.instance).setOwnerUserAvatarBytes(byteString);
                return this;
            }

            public Builder setOwnerUserId(String str) {
                copyOnWrite();
                ((MultiCallSwitchToLeadRoleInvite) this.instance).setOwnerUserId(str);
                return this;
            }

            public Builder setOwnerUserIdBytes(ByteString byteString) {
                copyOnWrite();
                ((MultiCallSwitchToLeadRoleInvite) this.instance).setOwnerUserIdBytes(byteString);
                return this;
            }

            public Builder setOwnerUserName(String str) {
                copyOnWrite();
                ((MultiCallSwitchToLeadRoleInvite) this.instance).setOwnerUserName(str);
                return this;
            }

            public Builder setOwnerUserNameBytes(ByteString byteString) {
                copyOnWrite();
                ((MultiCallSwitchToLeadRoleInvite) this.instance).setOwnerUserNameBytes(byteString);
                return this;
            }

            public Builder setShowSeconds(long j) {
                copyOnWrite();
                ((MultiCallSwitchToLeadRoleInvite) this.instance).setShowSeconds(j);
                return this;
            }

            public Builder setState(InviteState inviteState) {
                copyOnWrite();
                ((MultiCallSwitchToLeadRoleInvite) this.instance).setState(inviteState);
                return this;
            }

            public Builder setStateValue(int i) {
                copyOnWrite();
                ((MultiCallSwitchToLeadRoleInvite) this.instance).setStateValue(i);
                return this;
            }

            public Builder setToUserAvatar(String str) {
                copyOnWrite();
                ((MultiCallSwitchToLeadRoleInvite) this.instance).setToUserAvatar(str);
                return this;
            }

            public Builder setToUserAvatarBytes(ByteString byteString) {
                copyOnWrite();
                ((MultiCallSwitchToLeadRoleInvite) this.instance).setToUserAvatarBytes(byteString);
                return this;
            }

            public Builder setToUserId(String str) {
                copyOnWrite();
                ((MultiCallSwitchToLeadRoleInvite) this.instance).setToUserId(str);
                return this;
            }

            public Builder setToUserIdBytes(ByteString byteString) {
                copyOnWrite();
                ((MultiCallSwitchToLeadRoleInvite) this.instance).setToUserIdBytes(byteString);
                return this;
            }

            public Builder setToUserName(String str) {
                copyOnWrite();
                ((MultiCallSwitchToLeadRoleInvite) this.instance).setToUserName(str);
                return this;
            }

            public Builder setToUserNameBytes(ByteString byteString) {
                copyOnWrite();
                ((MultiCallSwitchToLeadRoleInvite) this.instance).setToUserNameBytes(byteString);
                return this;
            }
        }

        static {
            MultiCallSwitchToLeadRoleInvite multiCallSwitchToLeadRoleInvite = new MultiCallSwitchToLeadRoleInvite();
            DEFAULT_INSTANCE = multiCallSwitchToLeadRoleInvite;
            multiCallSwitchToLeadRoleInvite.makeImmutable();
        }

        private MultiCallSwitchToLeadRoleInvite() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearId() {
            this.id_ = getDefaultInstance().getId();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearOwnerUserAvatar() {
            this.ownerUserAvatar_ = getDefaultInstance().getOwnerUserAvatar();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearOwnerUserId() {
            this.ownerUserId_ = getDefaultInstance().getOwnerUserId();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearOwnerUserName() {
            this.ownerUserName_ = getDefaultInstance().getOwnerUserName();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearShowSeconds() {
            this.showSeconds_ = 0L;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearState() {
            this.state_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearToUserAvatar() {
            this.toUserAvatar_ = getDefaultInstance().getToUserAvatar();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearToUserId() {
            this.toUserId_ = getDefaultInstance().getToUserId();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearToUserName() {
            this.toUserName_ = getDefaultInstance().getToUserName();
        }

        public static MultiCallSwitchToLeadRoleInvite getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder(MultiCallSwitchToLeadRoleInvite multiCallSwitchToLeadRoleInvite) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(multiCallSwitchToLeadRoleInvite);
        }

        public static MultiCallSwitchToLeadRoleInvite parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (MultiCallSwitchToLeadRoleInvite) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static MultiCallSwitchToLeadRoleInvite parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (MultiCallSwitchToLeadRoleInvite) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static i860<MultiCallSwitchToLeadRoleInvite> parser() {
            return DEFAULT_INSTANCE.getParserForType();
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
        public void setOwnerUserAvatar(String str) {
            str.getClass();
            this.ownerUserAvatar_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setOwnerUserAvatarBytes(ByteString byteString) {
            byteString.getClass();
            AbstractC3403a.checkByteStringIsUtf8(byteString);
            this.ownerUserAvatar_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setOwnerUserId(String str) {
            str.getClass();
            this.ownerUserId_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setOwnerUserIdBytes(ByteString byteString) {
            byteString.getClass();
            AbstractC3403a.checkByteStringIsUtf8(byteString);
            this.ownerUserId_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setOwnerUserName(String str) {
            str.getClass();
            this.ownerUserName_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setOwnerUserNameBytes(ByteString byteString) {
            byteString.getClass();
            AbstractC3403a.checkByteStringIsUtf8(byteString);
            this.ownerUserName_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setShowSeconds(long j) {
            this.showSeconds_ = j;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setState(InviteState inviteState) {
            inviteState.getClass();
            this.state_ = inviteState.getNumber();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setStateValue(int i) {
            this.state_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setToUserAvatar(String str) {
            str.getClass();
            this.toUserAvatar_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setToUserAvatarBytes(ByteString byteString) {
            byteString.getClass();
            AbstractC3403a.checkByteStringIsUtf8(byteString);
            this.toUserAvatar_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setToUserId(String str) {
            str.getClass();
            this.toUserId_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setToUserIdBytes(ByteString byteString) {
            byteString.getClass();
            AbstractC3403a.checkByteStringIsUtf8(byteString);
            this.toUserId_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setToUserName(String str) {
            str.getClass();
            this.toUserName_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setToUserNameBytes(ByteString byteString) {
            byteString.getClass();
            AbstractC3403a.checkByteStringIsUtf8(byteString);
            this.toUserName_ = byteString.toStringUtf8();
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            boolean z = false;
            switch (C45021.f15978xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new MultiCallSwitchToLeadRoleInvite();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                    return null;
                case 4:
                    return new Builder();
                case 5:
                    GeneratedMessageLite.InterfaceC3386h interfaceC3386h = (GeneratedMessageLite.InterfaceC3386h) obj;
                    MultiCallSwitchToLeadRoleInvite multiCallSwitchToLeadRoleInvite = (MultiCallSwitchToLeadRoleInvite) obj2;
                    this.id_ = interfaceC3386h.mo16997f(!this.id_.isEmpty(), this.id_, !multiCallSwitchToLeadRoleInvite.id_.isEmpty(), multiCallSwitchToLeadRoleInvite.id_);
                    this.ownerUserId_ = interfaceC3386h.mo16997f(!this.ownerUserId_.isEmpty(), this.ownerUserId_, !multiCallSwitchToLeadRoleInvite.ownerUserId_.isEmpty(), multiCallSwitchToLeadRoleInvite.ownerUserId_);
                    this.ownerUserName_ = interfaceC3386h.mo16997f(!this.ownerUserName_.isEmpty(), this.ownerUserName_, !multiCallSwitchToLeadRoleInvite.ownerUserName_.isEmpty(), multiCallSwitchToLeadRoleInvite.ownerUserName_);
                    this.ownerUserAvatar_ = interfaceC3386h.mo16997f(!this.ownerUserAvatar_.isEmpty(), this.ownerUserAvatar_, !multiCallSwitchToLeadRoleInvite.ownerUserAvatar_.isEmpty(), multiCallSwitchToLeadRoleInvite.ownerUserAvatar_);
                    this.toUserId_ = interfaceC3386h.mo16997f(!this.toUserId_.isEmpty(), this.toUserId_, !multiCallSwitchToLeadRoleInvite.toUserId_.isEmpty(), multiCallSwitchToLeadRoleInvite.toUserId_);
                    this.toUserName_ = interfaceC3386h.mo16997f(!this.toUserName_.isEmpty(), this.toUserName_, !multiCallSwitchToLeadRoleInvite.toUserName_.isEmpty(), multiCallSwitchToLeadRoleInvite.toUserName_);
                    this.toUserAvatar_ = interfaceC3386h.mo16997f(!this.toUserAvatar_.isEmpty(), this.toUserAvatar_, !multiCallSwitchToLeadRoleInvite.toUserAvatar_.isEmpty(), multiCallSwitchToLeadRoleInvite.toUserAvatar_);
                    long j = this.showSeconds_;
                    boolean z2 = j != 0;
                    long j2 = multiCallSwitchToLeadRoleInvite.showSeconds_;
                    this.showSeconds_ = interfaceC3386h.mo17000i(z2, j, j2 != 0, j2);
                    int i = this.state_;
                    boolean z3 = i != 0;
                    int i2 = multiCallSwitchToLeadRoleInvite.state_;
                    this.state_ = interfaceC3386h.mo16996e(z3, i, i2 != 0, i2);
                    GeneratedMessageLite.C3385g c3385g = GeneratedMessageLite.C3385g.INSTANCE;
                    return this;
                case 6:
                    C3407e c3407e = (C3407e) obj;
                    while (!z) {
                        try {
                            int iM17116M = c3407e.m17116M();
                            if (iM17116M != 0) {
                                if (iM17116M == 10) {
                                    this.id_ = c3407e.m17115L();
                                } else if (iM17116M == 18) {
                                    this.ownerUserId_ = c3407e.m17115L();
                                } else if (iM17116M == 26) {
                                    this.ownerUserName_ = c3407e.m17115L();
                                } else if (iM17116M == 34) {
                                    this.ownerUserAvatar_ = c3407e.m17115L();
                                } else if (iM17116M == 42) {
                                    this.toUserId_ = c3407e.m17115L();
                                } else if (iM17116M == 50) {
                                    this.toUserName_ = c3407e.m17115L();
                                } else if (iM17116M == 58) {
                                    this.toUserAvatar_ = c3407e.m17115L();
                                } else if (iM17116M == 64) {
                                    this.showSeconds_ = c3407e.m17142v();
                                } else if (iM17116M == 72) {
                                    this.state_ = c3407e.m17136p();
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
                        synchronized (MultiCallSwitchToLeadRoleInvite.class) {
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

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkMultiCallMessage.MultiCallSwitchToLeadRoleInviteOrBuilder
        public String getId() {
            return this.id_;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkMultiCallMessage.MultiCallSwitchToLeadRoleInviteOrBuilder
        public ByteString getIdBytes() {
            return ByteString.copyFromUtf8(this.id_);
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkMultiCallMessage.MultiCallSwitchToLeadRoleInviteOrBuilder
        public String getOwnerUserAvatar() {
            return this.ownerUserAvatar_;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkMultiCallMessage.MultiCallSwitchToLeadRoleInviteOrBuilder
        public ByteString getOwnerUserAvatarBytes() {
            return ByteString.copyFromUtf8(this.ownerUserAvatar_);
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkMultiCallMessage.MultiCallSwitchToLeadRoleInviteOrBuilder
        public String getOwnerUserId() {
            return this.ownerUserId_;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkMultiCallMessage.MultiCallSwitchToLeadRoleInviteOrBuilder
        public ByteString getOwnerUserIdBytes() {
            return ByteString.copyFromUtf8(this.ownerUserId_);
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkMultiCallMessage.MultiCallSwitchToLeadRoleInviteOrBuilder
        public String getOwnerUserName() {
            return this.ownerUserName_;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkMultiCallMessage.MultiCallSwitchToLeadRoleInviteOrBuilder
        public ByteString getOwnerUserNameBytes() {
            return ByteString.copyFromUtf8(this.ownerUserName_);
        }

        @Override // com.google.protobuf.InterfaceC3419q
        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int iM16901K = !this.id_.isEmpty() ? CodedOutputStream.m16901K(1, getId()) : 0;
            if (!this.ownerUserId_.isEmpty()) {
                iM16901K += CodedOutputStream.m16901K(2, getOwnerUserId());
            }
            if (!this.ownerUserName_.isEmpty()) {
                iM16901K += CodedOutputStream.m16901K(3, getOwnerUserName());
            }
            if (!this.ownerUserAvatar_.isEmpty()) {
                iM16901K += CodedOutputStream.m16901K(4, getOwnerUserAvatar());
            }
            if (!this.toUserId_.isEmpty()) {
                iM16901K += CodedOutputStream.m16901K(5, getToUserId());
            }
            if (!this.toUserName_.isEmpty()) {
                iM16901K += CodedOutputStream.m16901K(6, getToUserName());
            }
            if (!this.toUserAvatar_.isEmpty()) {
                iM16901K += CodedOutputStream.m16901K(7, getToUserAvatar());
            }
            long j = this.showSeconds_;
            if (j != 0) {
                iM16901K += CodedOutputStream.m16931v(8, j);
            }
            if (this.state_ != InviteState.invited.getNumber()) {
                iM16901K += CodedOutputStream.m16922m(9, this.state_);
            }
            this.memoizedSerializedSize = iM16901K;
            return iM16901K;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkMultiCallMessage.MultiCallSwitchToLeadRoleInviteOrBuilder
        public long getShowSeconds() {
            return this.showSeconds_;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkMultiCallMessage.MultiCallSwitchToLeadRoleInviteOrBuilder
        public InviteState getState() {
            InviteState inviteStateForNumber = InviteState.forNumber(this.state_);
            return inviteStateForNumber == null ? InviteState.UNRECOGNIZED : inviteStateForNumber;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkMultiCallMessage.MultiCallSwitchToLeadRoleInviteOrBuilder
        public int getStateValue() {
            return this.state_;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkMultiCallMessage.MultiCallSwitchToLeadRoleInviteOrBuilder
        public String getToUserAvatar() {
            return this.toUserAvatar_;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkMultiCallMessage.MultiCallSwitchToLeadRoleInviteOrBuilder
        public ByteString getToUserAvatarBytes() {
            return ByteString.copyFromUtf8(this.toUserAvatar_);
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkMultiCallMessage.MultiCallSwitchToLeadRoleInviteOrBuilder
        public String getToUserId() {
            return this.toUserId_;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkMultiCallMessage.MultiCallSwitchToLeadRoleInviteOrBuilder
        public ByteString getToUserIdBytes() {
            return ByteString.copyFromUtf8(this.toUserId_);
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkMultiCallMessage.MultiCallSwitchToLeadRoleInviteOrBuilder
        public String getToUserName() {
            return this.toUserName_;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkMultiCallMessage.MultiCallSwitchToLeadRoleInviteOrBuilder
        public ByteString getToUserNameBytes() {
            return ByteString.copyFromUtf8(this.toUserName_);
        }

        @Override // com.google.protobuf.InterfaceC3419q
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (!this.id_.isEmpty()) {
                codedOutputStream.mo16939D0(1, getId());
            }
            if (!this.ownerUserId_.isEmpty()) {
                codedOutputStream.mo16939D0(2, getOwnerUserId());
            }
            if (!this.ownerUserName_.isEmpty()) {
                codedOutputStream.mo16939D0(3, getOwnerUserName());
            }
            if (!this.ownerUserAvatar_.isEmpty()) {
                codedOutputStream.mo16939D0(4, getOwnerUserAvatar());
            }
            if (!this.toUserId_.isEmpty()) {
                codedOutputStream.mo16939D0(5, getToUserId());
            }
            if (!this.toUserName_.isEmpty()) {
                codedOutputStream.mo16939D0(6, getToUserName());
            }
            if (!this.toUserAvatar_.isEmpty()) {
                codedOutputStream.mo16939D0(7, getToUserAvatar());
            }
            long j = this.showSeconds_;
            if (j != 0) {
                codedOutputStream.m16972u0(8, j);
            }
            if (this.state_ != InviteState.invited.getNumber()) {
                codedOutputStream.m16960i0(9, this.state_);
            }
        }

        public static MultiCallSwitchToLeadRoleInvite parseDelimitedFrom(InputStream inputStream, C3410h c3410h) throws IOException {
            return (MultiCallSwitchToLeadRoleInvite) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, c3410h);
        }

        public static MultiCallSwitchToLeadRoleInvite parseFrom(ByteString byteString, C3410h c3410h) throws InvalidProtocolBufferException {
            return (MultiCallSwitchToLeadRoleInvite) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, c3410h);
        }

        public static MultiCallSwitchToLeadRoleInvite parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (MultiCallSwitchToLeadRoleInvite) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static MultiCallSwitchToLeadRoleInvite parseFrom(byte[] bArr, C3410h c3410h) throws InvalidProtocolBufferException {
            return (MultiCallSwitchToLeadRoleInvite) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, c3410h);
        }

        public static MultiCallSwitchToLeadRoleInvite parseFrom(InputStream inputStream) throws IOException {
            return (MultiCallSwitchToLeadRoleInvite) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static MultiCallSwitchToLeadRoleInvite parseFrom(InputStream inputStream, C3410h c3410h) throws IOException {
            return (MultiCallSwitchToLeadRoleInvite) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, c3410h);
        }

        public static MultiCallSwitchToLeadRoleInvite parseFrom(C3407e c3407e) throws IOException {
            return (MultiCallSwitchToLeadRoleInvite) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, c3407e);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static MultiCallSwitchToLeadRoleInvite parseFrom(C3407e c3407e, C3410h c3410h) throws IOException {
            return (MultiCallSwitchToLeadRoleInvite) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, c3407e, c3410h);
        }
    }

    public static final class MultiCallTurnOnGuide extends GeneratedMessageLite<MultiCallTurnOnGuide, Builder> implements MultiCallTurnOnGuideOrBuilder {
        public static final int AVATARS_FIELD_NUMBER = 1;
        public static final int CONTENT_FIELD_NUMBER = 3;
        private static final MultiCallTurnOnGuide DEFAULT_INSTANCE;
        private static volatile i860<MultiCallTurnOnGuide> PARSER = null;
        public static final int REASON_FIELD_NUMBER = 5;
        public static final int SCHEMA_FIELD_NUMBER = 4;
        public static final int TITLE_FIELD_NUMBER = 2;
        private int bitField0_;
        private C3414l.h<String> avatars_ = GeneratedMessageLite.emptyProtobufList();
        private String title_ = "";
        private String content_ = "";
        private String schema_ = "";
        private String reason_ = "";

        public static final class Builder extends GeneratedMessageLite.AbstractC3380b<MultiCallTurnOnGuide, Builder> implements MultiCallTurnOnGuideOrBuilder {
            private Builder() {
                super(MultiCallTurnOnGuide.DEFAULT_INSTANCE);
            }

            public Builder addAllAvatars(Iterable<String> iterable) {
                copyOnWrite();
                ((MultiCallTurnOnGuide) this.instance).addAllAvatars(iterable);
                return this;
            }

            public Builder addAvatars(String str) {
                copyOnWrite();
                ((MultiCallTurnOnGuide) this.instance).addAvatars(str);
                return this;
            }

            public Builder addAvatarsBytes(ByteString byteString) {
                copyOnWrite();
                ((MultiCallTurnOnGuide) this.instance).addAvatarsBytes(byteString);
                return this;
            }

            public Builder clearAvatars() {
                copyOnWrite();
                ((MultiCallTurnOnGuide) this.instance).clearAvatars();
                return this;
            }

            public Builder clearContent() {
                copyOnWrite();
                ((MultiCallTurnOnGuide) this.instance).clearContent();
                return this;
            }

            public Builder clearReason() {
                copyOnWrite();
                ((MultiCallTurnOnGuide) this.instance).clearReason();
                return this;
            }

            public Builder clearSchema() {
                copyOnWrite();
                ((MultiCallTurnOnGuide) this.instance).clearSchema();
                return this;
            }

            public Builder clearTitle() {
                copyOnWrite();
                ((MultiCallTurnOnGuide) this.instance).clearTitle();
                return this;
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkMultiCallMessage.MultiCallTurnOnGuideOrBuilder
            public String getAvatars(int i) {
                return ((MultiCallTurnOnGuide) this.instance).getAvatars(i);
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkMultiCallMessage.MultiCallTurnOnGuideOrBuilder
            public ByteString getAvatarsBytes(int i) {
                return ((MultiCallTurnOnGuide) this.instance).getAvatarsBytes(i);
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkMultiCallMessage.MultiCallTurnOnGuideOrBuilder
            public int getAvatarsCount() {
                return ((MultiCallTurnOnGuide) this.instance).getAvatarsCount();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkMultiCallMessage.MultiCallTurnOnGuideOrBuilder
            public List<String> getAvatarsList() {
                return Collections.unmodifiableList(((MultiCallTurnOnGuide) this.instance).getAvatarsList());
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkMultiCallMessage.MultiCallTurnOnGuideOrBuilder
            public String getContent() {
                return ((MultiCallTurnOnGuide) this.instance).getContent();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkMultiCallMessage.MultiCallTurnOnGuideOrBuilder
            public ByteString getContentBytes() {
                return ((MultiCallTurnOnGuide) this.instance).getContentBytes();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkMultiCallMessage.MultiCallTurnOnGuideOrBuilder
            public String getReason() {
                return ((MultiCallTurnOnGuide) this.instance).getReason();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkMultiCallMessage.MultiCallTurnOnGuideOrBuilder
            public ByteString getReasonBytes() {
                return ((MultiCallTurnOnGuide) this.instance).getReasonBytes();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkMultiCallMessage.MultiCallTurnOnGuideOrBuilder
            public String getSchema() {
                return ((MultiCallTurnOnGuide) this.instance).getSchema();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkMultiCallMessage.MultiCallTurnOnGuideOrBuilder
            public ByteString getSchemaBytes() {
                return ((MultiCallTurnOnGuide) this.instance).getSchemaBytes();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkMultiCallMessage.MultiCallTurnOnGuideOrBuilder
            public String getTitle() {
                return ((MultiCallTurnOnGuide) this.instance).getTitle();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkMultiCallMessage.MultiCallTurnOnGuideOrBuilder
            public ByteString getTitleBytes() {
                return ((MultiCallTurnOnGuide) this.instance).getTitleBytes();
            }

            public Builder setAvatars(int i, String str) {
                copyOnWrite();
                ((MultiCallTurnOnGuide) this.instance).setAvatars(i, str);
                return this;
            }

            public Builder setContent(String str) {
                copyOnWrite();
                ((MultiCallTurnOnGuide) this.instance).setContent(str);
                return this;
            }

            public Builder setContentBytes(ByteString byteString) {
                copyOnWrite();
                ((MultiCallTurnOnGuide) this.instance).setContentBytes(byteString);
                return this;
            }

            public Builder setReason(String str) {
                copyOnWrite();
                ((MultiCallTurnOnGuide) this.instance).setReason(str);
                return this;
            }

            public Builder setReasonBytes(ByteString byteString) {
                copyOnWrite();
                ((MultiCallTurnOnGuide) this.instance).setReasonBytes(byteString);
                return this;
            }

            public Builder setSchema(String str) {
                copyOnWrite();
                ((MultiCallTurnOnGuide) this.instance).setSchema(str);
                return this;
            }

            public Builder setSchemaBytes(ByteString byteString) {
                copyOnWrite();
                ((MultiCallTurnOnGuide) this.instance).setSchemaBytes(byteString);
                return this;
            }

            public Builder setTitle(String str) {
                copyOnWrite();
                ((MultiCallTurnOnGuide) this.instance).setTitle(str);
                return this;
            }

            public Builder setTitleBytes(ByteString byteString) {
                copyOnWrite();
                ((MultiCallTurnOnGuide) this.instance).setTitleBytes(byteString);
                return this;
            }
        }

        static {
            MultiCallTurnOnGuide multiCallTurnOnGuide = new MultiCallTurnOnGuide();
            DEFAULT_INSTANCE = multiCallTurnOnGuide;
            multiCallTurnOnGuide.makeImmutable();
        }

        private MultiCallTurnOnGuide() {
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
        public void clearContent() {
            this.content_ = getDefaultInstance().getContent();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearReason() {
            this.reason_ = getDefaultInstance().getReason();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearSchema() {
            this.schema_ = getDefaultInstance().getSchema();
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

        public static MultiCallTurnOnGuide getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder(MultiCallTurnOnGuide multiCallTurnOnGuide) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(multiCallTurnOnGuide);
        }

        public static MultiCallTurnOnGuide parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (MultiCallTurnOnGuide) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static MultiCallTurnOnGuide parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (MultiCallTurnOnGuide) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static i860<MultiCallTurnOnGuide> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAvatars(int i, String str) {
            str.getClass();
            ensureAvatarsIsMutable();
            this.avatars_.set(i, str);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setContent(String str) {
            str.getClass();
            this.content_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setContentBytes(ByteString byteString) {
            byteString.getClass();
            AbstractC3403a.checkByteStringIsUtf8(byteString);
            this.content_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setReason(String str) {
            str.getClass();
            this.reason_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setReasonBytes(ByteString byteString) {
            byteString.getClass();
            AbstractC3403a.checkByteStringIsUtf8(byteString);
            this.reason_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSchema(String str) {
            str.getClass();
            this.schema_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSchemaBytes(ByteString byteString) {
            byteString.getClass();
            AbstractC3403a.checkByteStringIsUtf8(byteString);
            this.schema_ = byteString.toStringUtf8();
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
            switch (C45021.f15978xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new MultiCallTurnOnGuide();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                    this.avatars_.mo17084n();
                    return null;
                case 4:
                    return new Builder();
                case 5:
                    GeneratedMessageLite.InterfaceC3386h interfaceC3386h = (GeneratedMessageLite.InterfaceC3386h) obj;
                    MultiCallTurnOnGuide multiCallTurnOnGuide = (MultiCallTurnOnGuide) obj2;
                    this.avatars_ = interfaceC3386h.mo16998g(this.avatars_, multiCallTurnOnGuide.avatars_);
                    this.title_ = interfaceC3386h.mo16997f(!this.title_.isEmpty(), this.title_, !multiCallTurnOnGuide.title_.isEmpty(), multiCallTurnOnGuide.title_);
                    this.content_ = interfaceC3386h.mo16997f(!this.content_.isEmpty(), this.content_, !multiCallTurnOnGuide.content_.isEmpty(), multiCallTurnOnGuide.content_);
                    this.schema_ = interfaceC3386h.mo16997f(!this.schema_.isEmpty(), this.schema_, !multiCallTurnOnGuide.schema_.isEmpty(), multiCallTurnOnGuide.schema_);
                    this.reason_ = interfaceC3386h.mo16997f(!this.reason_.isEmpty(), this.reason_, true ^ multiCallTurnOnGuide.reason_.isEmpty(), multiCallTurnOnGuide.reason_);
                    if (interfaceC3386h == GeneratedMessageLite.C3385g.INSTANCE) {
                        this.bitField0_ |= multiCallTurnOnGuide.bitField0_;
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
                                    String strM17115L = c3407e.m17115L();
                                    if (!this.avatars_.mo17085q()) {
                                        this.avatars_ = GeneratedMessageLite.mutableCopy(this.avatars_);
                                    }
                                    this.avatars_.add(strM17115L);
                                } else if (iM17116M == 18) {
                                    this.title_ = c3407e.m17115L();
                                } else if (iM17116M == 26) {
                                    this.content_ = c3407e.m17115L();
                                } else if (iM17116M == 34) {
                                    this.schema_ = c3407e.m17115L();
                                } else if (iM17116M == 42) {
                                    this.reason_ = c3407e.m17115L();
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
                        synchronized (MultiCallTurnOnGuide.class) {
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

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkMultiCallMessage.MultiCallTurnOnGuideOrBuilder
        public String getAvatars(int i) {
            return this.avatars_.get(i);
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkMultiCallMessage.MultiCallTurnOnGuideOrBuilder
        public ByteString getAvatarsBytes(int i) {
            return ByteString.copyFromUtf8(this.avatars_.get(i));
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkMultiCallMessage.MultiCallTurnOnGuideOrBuilder
        public int getAvatarsCount() {
            return this.avatars_.size();
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkMultiCallMessage.MultiCallTurnOnGuideOrBuilder
        public List<String> getAvatarsList() {
            return this.avatars_;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkMultiCallMessage.MultiCallTurnOnGuideOrBuilder
        public String getContent() {
            return this.content_;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkMultiCallMessage.MultiCallTurnOnGuideOrBuilder
        public ByteString getContentBytes() {
            return ByteString.copyFromUtf8(this.content_);
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkMultiCallMessage.MultiCallTurnOnGuideOrBuilder
        public String getReason() {
            return this.reason_;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkMultiCallMessage.MultiCallTurnOnGuideOrBuilder
        public ByteString getReasonBytes() {
            return ByteString.copyFromUtf8(this.reason_);
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkMultiCallMessage.MultiCallTurnOnGuideOrBuilder
        public String getSchema() {
            return this.schema_;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkMultiCallMessage.MultiCallTurnOnGuideOrBuilder
        public ByteString getSchemaBytes() {
            return ByteString.copyFromUtf8(this.schema_);
        }

        @Override // com.google.protobuf.InterfaceC3419q
        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int iM16902L = 0;
            for (int i2 = 0; i2 < this.avatars_.size(); i2++) {
                iM16902L += CodedOutputStream.m16902L(this.avatars_.get(i2));
            }
            int size = iM16902L + getAvatarsList().size();
            if (!this.title_.isEmpty()) {
                size += CodedOutputStream.m16901K(2, getTitle());
            }
            if (!this.content_.isEmpty()) {
                size += CodedOutputStream.m16901K(3, getContent());
            }
            if (!this.schema_.isEmpty()) {
                size += CodedOutputStream.m16901K(4, getSchema());
            }
            if (!this.reason_.isEmpty()) {
                size += CodedOutputStream.m16901K(5, getReason());
            }
            this.memoizedSerializedSize = size;
            return size;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkMultiCallMessage.MultiCallTurnOnGuideOrBuilder
        public String getTitle() {
            return this.title_;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkMultiCallMessage.MultiCallTurnOnGuideOrBuilder
        public ByteString getTitleBytes() {
            return ByteString.copyFromUtf8(this.title_);
        }

        @Override // com.google.protobuf.InterfaceC3419q
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            for (int i = 0; i < this.avatars_.size(); i++) {
                codedOutputStream.mo16939D0(1, this.avatars_.get(i));
            }
            if (!this.title_.isEmpty()) {
                codedOutputStream.mo16939D0(2, getTitle());
            }
            if (!this.content_.isEmpty()) {
                codedOutputStream.mo16939D0(3, getContent());
            }
            if (!this.schema_.isEmpty()) {
                codedOutputStream.mo16939D0(4, getSchema());
            }
            if (this.reason_.isEmpty()) {
                return;
            }
            codedOutputStream.mo16939D0(5, getReason());
        }

        public static MultiCallTurnOnGuide parseDelimitedFrom(InputStream inputStream, C3410h c3410h) throws IOException {
            return (MultiCallTurnOnGuide) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, c3410h);
        }

        public static MultiCallTurnOnGuide parseFrom(ByteString byteString, C3410h c3410h) throws InvalidProtocolBufferException {
            return (MultiCallTurnOnGuide) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, c3410h);
        }

        public static MultiCallTurnOnGuide parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (MultiCallTurnOnGuide) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static MultiCallTurnOnGuide parseFrom(byte[] bArr, C3410h c3410h) throws InvalidProtocolBufferException {
            return (MultiCallTurnOnGuide) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, c3410h);
        }

        public static MultiCallTurnOnGuide parseFrom(InputStream inputStream) throws IOException {
            return (MultiCallTurnOnGuide) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static MultiCallTurnOnGuide parseFrom(InputStream inputStream, C3410h c3410h) throws IOException {
            return (MultiCallTurnOnGuide) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, c3410h);
        }

        public static MultiCallTurnOnGuide parseFrom(C3407e c3407e) throws IOException {
            return (MultiCallTurnOnGuide) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, c3407e);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static MultiCallTurnOnGuide parseFrom(C3407e c3407e, C3410h c3410h) throws IOException {
            return (MultiCallTurnOnGuide) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, c3407e, c3410h);
        }
    }
}
