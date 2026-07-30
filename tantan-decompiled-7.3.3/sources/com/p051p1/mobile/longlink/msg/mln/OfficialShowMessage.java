package com.p051p1.mobile.longlink.msg.mln;

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
import p153l.iig0;
import p153l.l710;
import p153l.lfz;
import p153l.ng60;

/* JADX INFO: loaded from: classes8.dex */
public final class OfficialShowMessage {

    /* JADX INFO: renamed from: com.p1.mobile.longlink.msg.mln.OfficialShowMessage$1 */
    public static /* synthetic */ class C46951 {

        /* JADX INFO: renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f16714xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f16714xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f16714xa1df5c61[GeneratedMessageLite.MethodToInvoke.IS_INITIALIZED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f16714xa1df5c61[GeneratedMessageLite.MethodToInvoke.MAKE_IMMUTABLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f16714xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f16714xa1df5c61[GeneratedMessageLite.MethodToInvoke.VISIT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f16714xa1df5c61[GeneratedMessageLite.MethodToInvoke.MERGE_FROM_STREAM.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f16714xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f16714xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    public interface OfficialShowJumpOrBuilder extends lfz {
        @Override // p153l.lfz
        /* synthetic */ InterfaceC3442q getDefaultInstanceForType();

        String getOfficialShowLiveId();

        ByteString getOfficialShowLiveIdBytes();

        String getOfficialShowRoomId();

        ByteString getOfficialShowRoomIdBytes();

        @Override // p153l.lfz
        /* synthetic */ boolean isInitialized();
    }

    public interface OfficialShowUpdateStatusOrBuilder extends lfz {
        OfficialShowUpdateStatus.ActionType getAction();

        int getActionValue();

        String getCurrentAnchorId();

        ByteString getCurrentAnchorIdBytes();

        @Override // p153l.lfz
        /* synthetic */ InterfaceC3442q getDefaultInstanceForType();

        @Override // p153l.lfz
        /* synthetic */ boolean isInitialized();
    }

    private OfficialShowMessage() {
    }

    public static void registerAllExtensions(C3433h c3433h) {
    }

    public static final class OfficialShowUpdateStatus extends GeneratedMessageLite<OfficialShowUpdateStatus, Builder> implements OfficialShowUpdateStatusOrBuilder {
        public static final int ACTION_FIELD_NUMBER = 1;
        public static final int CURRENTANCHORID_FIELD_NUMBER = 2;
        private static final OfficialShowUpdateStatus DEFAULT_INSTANCE;
        private static volatile ng60<OfficialShowUpdateStatus> PARSER;
        private int action_;
        private String currentAnchorId_ = "";

        public static final class Builder extends GeneratedMessageLite.AbstractC3403b<OfficialShowUpdateStatus, Builder> implements OfficialShowUpdateStatusOrBuilder {
            private Builder() {
                super(OfficialShowUpdateStatus.DEFAULT_INSTANCE);
            }

            public Builder clearAction() {
                copyOnWrite();
                ((OfficialShowUpdateStatus) this.instance).clearAction();
                return this;
            }

            public Builder clearCurrentAnchorId() {
                copyOnWrite();
                ((OfficialShowUpdateStatus) this.instance).clearCurrentAnchorId();
                return this;
            }

            @Override // com.p1.mobile.longlink.msg.mln.OfficialShowMessage.OfficialShowUpdateStatusOrBuilder
            public ActionType getAction() {
                return ((OfficialShowUpdateStatus) this.instance).getAction();
            }

            @Override // com.p1.mobile.longlink.msg.mln.OfficialShowMessage.OfficialShowUpdateStatusOrBuilder
            public int getActionValue() {
                return ((OfficialShowUpdateStatus) this.instance).getActionValue();
            }

            @Override // com.p1.mobile.longlink.msg.mln.OfficialShowMessage.OfficialShowUpdateStatusOrBuilder
            public String getCurrentAnchorId() {
                return ((OfficialShowUpdateStatus) this.instance).getCurrentAnchorId();
            }

            @Override // com.p1.mobile.longlink.msg.mln.OfficialShowMessage.OfficialShowUpdateStatusOrBuilder
            public ByteString getCurrentAnchorIdBytes() {
                return ((OfficialShowUpdateStatus) this.instance).getCurrentAnchorIdBytes();
            }

            public Builder setAction(ActionType actionType) {
                copyOnWrite();
                ((OfficialShowUpdateStatus) this.instance).setAction(actionType);
                return this;
            }

            public Builder setActionValue(int i) {
                copyOnWrite();
                ((OfficialShowUpdateStatus) this.instance).setActionValue(i);
                return this;
            }

            public Builder setCurrentAnchorId(String str) {
                copyOnWrite();
                ((OfficialShowUpdateStatus) this.instance).setCurrentAnchorId(str);
                return this;
            }

            public Builder setCurrentAnchorIdBytes(ByteString byteString) {
                copyOnWrite();
                ((OfficialShowUpdateStatus) this.instance).setCurrentAnchorIdBytes(byteString);
                return this;
            }
        }

        static {
            OfficialShowUpdateStatus officialShowUpdateStatus = new OfficialShowUpdateStatus();
            DEFAULT_INSTANCE = officialShowUpdateStatus;
            officialShowUpdateStatus.makeImmutable();
        }

        private OfficialShowUpdateStatus() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAction() {
            this.action_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearCurrentAnchorId() {
            this.currentAnchorId_ = getDefaultInstance().getCurrentAnchorId();
        }

        public static OfficialShowUpdateStatus getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder(OfficialShowUpdateStatus officialShowUpdateStatus) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(officialShowUpdateStatus);
        }

        public static OfficialShowUpdateStatus parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (OfficialShowUpdateStatus) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static OfficialShowUpdateStatus parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (OfficialShowUpdateStatus) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static ng60<OfficialShowUpdateStatus> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAction(ActionType actionType) {
            actionType.getClass();
            this.action_ = actionType.getNumber();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setActionValue(int i) {
            this.action_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setCurrentAnchorId(String str) {
            str.getClass();
            this.currentAnchorId_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setCurrentAnchorIdBytes(ByteString byteString) {
            byteString.getClass();
            AbstractC3426a.checkByteStringIsUtf8(byteString);
            this.currentAnchorId_ = byteString.toStringUtf8();
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            boolean z = false;
            switch (C46951.f16714xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new OfficialShowUpdateStatus();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                    return null;
                case 4:
                    return new Builder();
                case 5:
                    GeneratedMessageLite.InterfaceC3409h interfaceC3409h = (GeneratedMessageLite.InterfaceC3409h) obj;
                    OfficialShowUpdateStatus officialShowUpdateStatus = (OfficialShowUpdateStatus) obj2;
                    int i = this.action_;
                    boolean z2 = i != 0;
                    int i2 = officialShowUpdateStatus.action_;
                    this.action_ = interfaceC3409h.mo17051e(z2, i, i2 != 0, i2);
                    this.currentAnchorId_ = interfaceC3409h.mo17052f(!this.currentAnchorId_.isEmpty(), this.currentAnchorId_, !officialShowUpdateStatus.currentAnchorId_.isEmpty(), officialShowUpdateStatus.currentAnchorId_);
                    GeneratedMessageLite.C3408g c3408g = GeneratedMessageLite.C3408g.INSTANCE;
                    return this;
                case 6:
                    C3430e c3430e = (C3430e) obj;
                    while (!z) {
                        try {
                            int iM17171M = c3430e.m17171M();
                            if (iM17171M != 0) {
                                if (iM17171M == 8) {
                                    this.action_ = c3430e.m17191p();
                                } else if (iM17171M == 18) {
                                    this.currentAnchorId_ = c3430e.m17170L();
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
                        synchronized (OfficialShowUpdateStatus.class) {
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

        @Override // com.p1.mobile.longlink.msg.mln.OfficialShowMessage.OfficialShowUpdateStatusOrBuilder
        public ActionType getAction() {
            ActionType actionTypeForNumber = ActionType.forNumber(this.action_);
            return actionTypeForNumber == null ? ActionType.UNRECOGNIZED : actionTypeForNumber;
        }

        @Override // com.p1.mobile.longlink.msg.mln.OfficialShowMessage.OfficialShowUpdateStatusOrBuilder
        public int getActionValue() {
            return this.action_;
        }

        @Override // com.p1.mobile.longlink.msg.mln.OfficialShowMessage.OfficialShowUpdateStatusOrBuilder
        public String getCurrentAnchorId() {
            return this.currentAnchorId_;
        }

        @Override // com.p1.mobile.longlink.msg.mln.OfficialShowMessage.OfficialShowUpdateStatusOrBuilder
        public ByteString getCurrentAnchorIdBytes() {
            return ByteString.copyFromUtf8(this.currentAnchorId_);
        }

        @Override // com.google.protobuf.InterfaceC3442q
        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int iM16977m = this.action_ != ActionType.unknown.getNumber() ? CodedOutputStream.m16977m(1, this.action_) : 0;
            if (!this.currentAnchorId_.isEmpty()) {
                iM16977m += CodedOutputStream.m16956K(2, getCurrentAnchorId());
            }
            this.memoizedSerializedSize = iM16977m;
            return iM16977m;
        }

        @Override // com.google.protobuf.InterfaceC3442q
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (this.action_ != ActionType.unknown.getNumber()) {
                codedOutputStream.m17015i0(1, this.action_);
            }
            if (this.currentAnchorId_.isEmpty()) {
                return;
            }
            codedOutputStream.mo16994D0(2, getCurrentAnchorId());
        }

        public enum ActionType implements C3437l.c {
            unknown(0),
            updateAnchor(1),
            updateShowList(2),
            livePause(3),
            liveRecover(4),
            UNRECOGNIZED(-1);

            private static final C3437l.d<ActionType> internalValueMap = new C3437l.d<ActionType>() { // from class: com.p1.mobile.longlink.msg.mln.OfficialShowMessage.OfficialShowUpdateStatus.ActionType.1
                @Override // com.google.protobuf.C3437l.d
                public ActionType findValueByNumber(int i) {
                    return ActionType.forNumber(i);
                }
            };
            public static final int livePause_VALUE = 3;
            public static final int liveRecover_VALUE = 4;
            public static final int unknown_VALUE = 0;
            public static final int updateAnchor_VALUE = 1;
            public static final int updateShowList_VALUE = 2;
            private final int value;

            ActionType(int i) {
                this.value = i;
            }

            public static ActionType forNumber(int i) {
                if (i == 0) {
                    return unknown;
                }
                if (i == 1) {
                    return updateAnchor;
                }
                if (i == 2) {
                    return updateShowList;
                }
                if (i == 3) {
                    return livePause;
                }
                if (i != 4) {
                    return null;
                }
                return liveRecover;
            }

            public static C3437l.d<ActionType> internalGetValueMap() {
                return internalValueMap;
            }

            @Override // com.google.protobuf.C3437l.c
            public final int getNumber() {
                return this.value;
            }

            @Deprecated
            public static ActionType valueOf(int i) {
                return forNumber(i);
            }
        }

        public static OfficialShowUpdateStatus parseDelimitedFrom(InputStream inputStream, C3433h c3433h) throws IOException {
            return (OfficialShowUpdateStatus) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, c3433h);
        }

        public static OfficialShowUpdateStatus parseFrom(ByteString byteString, C3433h c3433h) throws InvalidProtocolBufferException {
            return (OfficialShowUpdateStatus) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, c3433h);
        }

        public static OfficialShowUpdateStatus parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (OfficialShowUpdateStatus) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static OfficialShowUpdateStatus parseFrom(byte[] bArr, C3433h c3433h) throws InvalidProtocolBufferException {
            return (OfficialShowUpdateStatus) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, c3433h);
        }

        public static OfficialShowUpdateStatus parseFrom(InputStream inputStream) throws IOException {
            return (OfficialShowUpdateStatus) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static OfficialShowUpdateStatus parseFrom(InputStream inputStream, C3433h c3433h) throws IOException {
            return (OfficialShowUpdateStatus) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, c3433h);
        }

        public static OfficialShowUpdateStatus parseFrom(C3430e c3430e) throws IOException {
            return (OfficialShowUpdateStatus) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, c3430e);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static OfficialShowUpdateStatus parseFrom(C3430e c3430e, C3433h c3433h) throws IOException {
            return (OfficialShowUpdateStatus) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, c3430e, c3433h);
        }
    }

    public static final class OfficialShowJump extends GeneratedMessageLite<OfficialShowJump, Builder> implements OfficialShowJumpOrBuilder {
        private static final OfficialShowJump DEFAULT_INSTANCE;
        public static final int OFFICIALSHOWLIVEID_FIELD_NUMBER = 1;
        public static final int OFFICIALSHOWROOMID_FIELD_NUMBER = 2;
        private static volatile ng60<OfficialShowJump> PARSER;
        private String officialShowLiveId_ = "";
        private String officialShowRoomId_ = "";

        public static final class Builder extends GeneratedMessageLite.AbstractC3403b<OfficialShowJump, Builder> implements OfficialShowJumpOrBuilder {
            private Builder() {
                super(OfficialShowJump.DEFAULT_INSTANCE);
            }

            public Builder clearOfficialShowLiveId() {
                copyOnWrite();
                ((OfficialShowJump) this.instance).clearOfficialShowLiveId();
                return this;
            }

            public Builder clearOfficialShowRoomId() {
                copyOnWrite();
                ((OfficialShowJump) this.instance).clearOfficialShowRoomId();
                return this;
            }

            @Override // com.p1.mobile.longlink.msg.mln.OfficialShowMessage.OfficialShowJumpOrBuilder
            public String getOfficialShowLiveId() {
                return ((OfficialShowJump) this.instance).getOfficialShowLiveId();
            }

            @Override // com.p1.mobile.longlink.msg.mln.OfficialShowMessage.OfficialShowJumpOrBuilder
            public ByteString getOfficialShowLiveIdBytes() {
                return ((OfficialShowJump) this.instance).getOfficialShowLiveIdBytes();
            }

            @Override // com.p1.mobile.longlink.msg.mln.OfficialShowMessage.OfficialShowJumpOrBuilder
            public String getOfficialShowRoomId() {
                return ((OfficialShowJump) this.instance).getOfficialShowRoomId();
            }

            @Override // com.p1.mobile.longlink.msg.mln.OfficialShowMessage.OfficialShowJumpOrBuilder
            public ByteString getOfficialShowRoomIdBytes() {
                return ((OfficialShowJump) this.instance).getOfficialShowRoomIdBytes();
            }

            public Builder setOfficialShowLiveId(String str) {
                copyOnWrite();
                ((OfficialShowJump) this.instance).setOfficialShowLiveId(str);
                return this;
            }

            public Builder setOfficialShowLiveIdBytes(ByteString byteString) {
                copyOnWrite();
                ((OfficialShowJump) this.instance).setOfficialShowLiveIdBytes(byteString);
                return this;
            }

            public Builder setOfficialShowRoomId(String str) {
                copyOnWrite();
                ((OfficialShowJump) this.instance).setOfficialShowRoomId(str);
                return this;
            }

            public Builder setOfficialShowRoomIdBytes(ByteString byteString) {
                copyOnWrite();
                ((OfficialShowJump) this.instance).setOfficialShowRoomIdBytes(byteString);
                return this;
            }
        }

        static {
            OfficialShowJump officialShowJump = new OfficialShowJump();
            DEFAULT_INSTANCE = officialShowJump;
            officialShowJump.makeImmutable();
        }

        private OfficialShowJump() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearOfficialShowLiveId() {
            this.officialShowLiveId_ = getDefaultInstance().getOfficialShowLiveId();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearOfficialShowRoomId() {
            this.officialShowRoomId_ = getDefaultInstance().getOfficialShowRoomId();
        }

        public static OfficialShowJump getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder(OfficialShowJump officialShowJump) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(officialShowJump);
        }

        public static OfficialShowJump parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (OfficialShowJump) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static OfficialShowJump parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (OfficialShowJump) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static ng60<OfficialShowJump> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setOfficialShowLiveId(String str) {
            str.getClass();
            this.officialShowLiveId_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setOfficialShowLiveIdBytes(ByteString byteString) {
            byteString.getClass();
            AbstractC3426a.checkByteStringIsUtf8(byteString);
            this.officialShowLiveId_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setOfficialShowRoomId(String str) {
            str.getClass();
            this.officialShowRoomId_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setOfficialShowRoomIdBytes(ByteString byteString) {
            byteString.getClass();
            AbstractC3426a.checkByteStringIsUtf8(byteString);
            this.officialShowRoomId_ = byteString.toStringUtf8();
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (C46951.f16714xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new OfficialShowJump();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                    return null;
                case 4:
                    return new Builder();
                case 5:
                    GeneratedMessageLite.InterfaceC3409h interfaceC3409h = (GeneratedMessageLite.InterfaceC3409h) obj;
                    OfficialShowJump officialShowJump = (OfficialShowJump) obj2;
                    this.officialShowLiveId_ = interfaceC3409h.mo17052f(!this.officialShowLiveId_.isEmpty(), this.officialShowLiveId_, !officialShowJump.officialShowLiveId_.isEmpty(), officialShowJump.officialShowLiveId_);
                    this.officialShowRoomId_ = interfaceC3409h.mo17052f(!this.officialShowRoomId_.isEmpty(), this.officialShowRoomId_, true ^ officialShowJump.officialShowRoomId_.isEmpty(), officialShowJump.officialShowRoomId_);
                    GeneratedMessageLite.C3408g c3408g = GeneratedMessageLite.C3408g.INSTANCE;
                    return this;
                case 6:
                    C3430e c3430e = (C3430e) obj;
                    boolean z = false;
                    while (!z) {
                        try {
                            int iM17171M = c3430e.m17171M();
                            if (iM17171M != 0) {
                                if (iM17171M == 10) {
                                    this.officialShowLiveId_ = c3430e.m17170L();
                                } else if (iM17171M == 18) {
                                    this.officialShowRoomId_ = c3430e.m17170L();
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
                        synchronized (OfficialShowJump.class) {
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

        @Override // com.p1.mobile.longlink.msg.mln.OfficialShowMessage.OfficialShowJumpOrBuilder
        public String getOfficialShowLiveId() {
            return this.officialShowLiveId_;
        }

        @Override // com.p1.mobile.longlink.msg.mln.OfficialShowMessage.OfficialShowJumpOrBuilder
        public ByteString getOfficialShowLiveIdBytes() {
            return ByteString.copyFromUtf8(this.officialShowLiveId_);
        }

        @Override // com.p1.mobile.longlink.msg.mln.OfficialShowMessage.OfficialShowJumpOrBuilder
        public String getOfficialShowRoomId() {
            return this.officialShowRoomId_;
        }

        @Override // com.p1.mobile.longlink.msg.mln.OfficialShowMessage.OfficialShowJumpOrBuilder
        public ByteString getOfficialShowRoomIdBytes() {
            return ByteString.copyFromUtf8(this.officialShowRoomId_);
        }

        @Override // com.google.protobuf.InterfaceC3442q
        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int iM16956K = !this.officialShowLiveId_.isEmpty() ? CodedOutputStream.m16956K(1, getOfficialShowLiveId()) : 0;
            if (!this.officialShowRoomId_.isEmpty()) {
                iM16956K += CodedOutputStream.m16956K(2, getOfficialShowRoomId());
            }
            this.memoizedSerializedSize = iM16956K;
            return iM16956K;
        }

        @Override // com.google.protobuf.InterfaceC3442q
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (!this.officialShowLiveId_.isEmpty()) {
                codedOutputStream.mo16994D0(1, getOfficialShowLiveId());
            }
            if (this.officialShowRoomId_.isEmpty()) {
                return;
            }
            codedOutputStream.mo16994D0(2, getOfficialShowRoomId());
        }

        public static OfficialShowJump parseDelimitedFrom(InputStream inputStream, C3433h c3433h) throws IOException {
            return (OfficialShowJump) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, c3433h);
        }

        public static OfficialShowJump parseFrom(ByteString byteString, C3433h c3433h) throws InvalidProtocolBufferException {
            return (OfficialShowJump) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, c3433h);
        }

        public static OfficialShowJump parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (OfficialShowJump) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static OfficialShowJump parseFrom(byte[] bArr, C3433h c3433h) throws InvalidProtocolBufferException {
            return (OfficialShowJump) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, c3433h);
        }

        public static OfficialShowJump parseFrom(InputStream inputStream) throws IOException {
            return (OfficialShowJump) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static OfficialShowJump parseFrom(InputStream inputStream, C3433h c3433h) throws IOException {
            return (OfficialShowJump) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, c3433h);
        }

        public static OfficialShowJump parseFrom(C3430e c3430e) throws IOException {
            return (OfficialShowJump) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, c3430e);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static OfficialShowJump parseFrom(C3430e c3430e, C3433h c3433h) throws IOException {
            return (OfficialShowJump) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, c3430e, c3433h);
        }
    }
}
