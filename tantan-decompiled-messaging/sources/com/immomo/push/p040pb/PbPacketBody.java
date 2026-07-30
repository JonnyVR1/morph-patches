package com.immomo.push.p040pb;

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
import org.spongycastle.asn1.eac.EACTags;
import p149l.aag0;
import p149l.bz00;
import p149l.i860;
import p149l.o6z;

/* JADX INFO: loaded from: classes7.dex */
public final class PbPacketBody extends GeneratedMessageLite<PbPacketBody, C3958b> implements o6z {
    private static final PbPacketBody DEFAULT_INSTANCE;
    public static final int DISCONN_FIELD_NUMBER = 9;
    public static final int MSGACK_FIELD_NUMBER = 7;
    public static final int MSGFIN_FIELD_NUMBER = 8;
    public static final int MSGPSH_FIELD_NUMBER = 5;
    public static final int MSGSYN_FIELD_NUMBER = 6;
    public static final int MSGV2_FIELD_NUMBER = 12;
    public static final int MSG_FIELD_NUMBER = 10;
    public static final int NOTIFYV2_FIELD_NUMBER = 13;
    public static final int NOTIFY_FIELD_NUMBER = 11;
    private static volatile i860<PbPacketBody> PARSER = null;
    public static final int RET_FIELD_NUMBER = 2;
    public static final int SAUTHRET_FIELD_NUMBER = 4;
    public static final int SAUTH_FIELD_NUMBER = 3;
    public static final int TYPE_FIELD_NUMBER = 1;
    private int dataCase_ = 0;
    private Object data_;
    private int type_;

    /* JADX INFO: renamed from: com.immomo.push.pb.PbPacketBody$a */
    public static /* synthetic */ class C3957a {

        /* JADX INFO: renamed from: a */
        static final /* synthetic */ int[] f14049a;

        /* JADX INFO: renamed from: b */
        static final /* synthetic */ int[] f14050b;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f14050b = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f14050b[GeneratedMessageLite.MethodToInvoke.IS_INITIALIZED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f14050b[GeneratedMessageLite.MethodToInvoke.MAKE_IMMUTABLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f14050b[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f14050b[GeneratedMessageLite.MethodToInvoke.VISIT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f14050b[GeneratedMessageLite.MethodToInvoke.MERGE_FROM_STREAM.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f14050b[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f14050b[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            int[] iArr2 = new int[DataCase.values().length];
            f14049a = iArr2;
            try {
                iArr2[DataCase.RET.ordinal()] = 1;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f14049a[DataCase.SAUTH.ordinal()] = 2;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f14049a[DataCase.SAUTHRET.ordinal()] = 3;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f14049a[DataCase.MSGPSH.ordinal()] = 4;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f14049a[DataCase.MSGSYN.ordinal()] = 5;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f14049a[DataCase.MSGACK.ordinal()] = 6;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f14049a[DataCase.MSGFIN.ordinal()] = 7;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f14049a[DataCase.DISCONN.ordinal()] = 8;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f14049a[DataCase.MSG.ordinal()] = 9;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                f14049a[DataCase.NOTIFY.ordinal()] = 10;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                f14049a[DataCase.MSGV2.ordinal()] = 11;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                f14049a[DataCase.NOTIFYV2.ordinal()] = 12;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                f14049a[DataCase.DATA_NOT_SET.ordinal()] = 13;
            } catch (NoSuchFieldError unused21) {
            }
        }
    }

    static {
        PbPacketBody pbPacketBody = new PbPacketBody();
        DEFAULT_INSTANCE = pbPacketBody;
        pbPacketBody.makeImmutable();
    }

    private PbPacketBody() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearData() {
        this.dataCase_ = 0;
        this.data_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDisconn() {
        if (this.dataCase_ == 9) {
            this.dataCase_ = 0;
            this.data_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMsg() {
        if (this.dataCase_ == 10) {
            this.dataCase_ = 0;
            this.data_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMsgAck() {
        if (this.dataCase_ == 7) {
            this.dataCase_ = 0;
            this.data_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMsgFin() {
        if (this.dataCase_ == 8) {
            this.dataCase_ = 0;
            this.data_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMsgPsh() {
        if (this.dataCase_ == 5) {
            this.dataCase_ = 0;
            this.data_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMsgSyn() {
        if (this.dataCase_ == 6) {
            this.dataCase_ = 0;
            this.data_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMsgV2() {
        if (this.dataCase_ == 12) {
            this.dataCase_ = 0;
            this.data_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearNotify() {
        if (this.dataCase_ == 11) {
            this.dataCase_ = 0;
            this.data_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearNotifyV2() {
        if (this.dataCase_ == 13) {
            this.dataCase_ = 0;
            this.data_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRet() {
        if (this.dataCase_ == 2) {
            this.dataCase_ = 0;
            this.data_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSauth() {
        if (this.dataCase_ == 3) {
            this.dataCase_ = 0;
            this.data_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSauthRet() {
        if (this.dataCase_ == 4) {
            this.dataCase_ = 0;
            this.data_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearType() {
        this.type_ = 0;
    }

    public static PbPacketBody getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeDisconn(Disconnect disconnect) {
        if (this.dataCase_ != 9 || this.data_ == Disconnect.getDefaultInstance()) {
            this.data_ = disconnect;
        } else {
            this.data_ = Disconnect.newBuilder((Disconnect) this.data_).mergeFrom(disconnect).buildPartial();
        }
        this.dataCase_ = 9;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeMsg(Msg msg) {
        if (this.dataCase_ != 10 || this.data_ == Msg.getDefaultInstance()) {
            this.data_ = msg;
        } else {
            this.data_ = Msg.newBuilder((Msg) this.data_).mergeFrom(msg).buildPartial();
        }
        this.dataCase_ = 10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeMsgAck(MsgAck msgAck) {
        if (this.dataCase_ != 7 || this.data_ == MsgAck.getDefaultInstance()) {
            this.data_ = msgAck;
        } else {
            this.data_ = MsgAck.newBuilder((MsgAck) this.data_).mergeFrom(msgAck).buildPartial();
        }
        this.dataCase_ = 7;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeMsgFin(MsgFin msgFin) {
        if (this.dataCase_ != 8 || this.data_ == MsgFin.getDefaultInstance()) {
            this.data_ = msgFin;
        } else {
            this.data_ = MsgFin.newBuilder((MsgFin) this.data_).mergeFrom(msgFin).buildPartial();
        }
        this.dataCase_ = 8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeMsgPsh(MsgPsh msgPsh) {
        if (this.dataCase_ != 5 || this.data_ == MsgPsh.getDefaultInstance()) {
            this.data_ = msgPsh;
        } else {
            this.data_ = MsgPsh.newBuilder((MsgPsh) this.data_).mergeFrom(msgPsh).buildPartial();
        }
        this.dataCase_ = 5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeMsgSyn(MsgSyn msgSyn) {
        if (this.dataCase_ != 6 || this.data_ == MsgSyn.getDefaultInstance()) {
            this.data_ = msgSyn;
        } else {
            this.data_ = MsgSyn.newBuilder((MsgSyn) this.data_).mergeFrom(msgSyn).buildPartial();
        }
        this.dataCase_ = 6;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeMsgV2(MsgV2 msgV2) {
        if (this.dataCase_ != 12 || this.data_ == MsgV2.getDefaultInstance()) {
            this.data_ = msgV2;
        } else {
            this.data_ = MsgV2.newBuilder((MsgV2) this.data_).mergeFrom(msgV2).buildPartial();
        }
        this.dataCase_ = 12;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeNotify(Notify notify) {
        if (this.dataCase_ != 11 || this.data_ == Notify.getDefaultInstance()) {
            this.data_ = notify;
        } else {
            this.data_ = Notify.newBuilder((Notify) this.data_).mergeFrom(notify).buildPartial();
        }
        this.dataCase_ = 11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeNotifyV2(NotifyV2 notifyV2) {
        if (this.dataCase_ != 13 || this.data_ == NotifyV2.getDefaultInstance()) {
            this.data_ = notifyV2;
        } else {
            this.data_ = NotifyV2.newBuilder((NotifyV2) this.data_).mergeFrom(notifyV2).buildPartial();
        }
        this.dataCase_ = 13;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeRet(Ret ret) {
        if (this.dataCase_ != 2 || this.data_ == Ret.getDefaultInstance()) {
            this.data_ = ret;
        } else {
            this.data_ = Ret.newBuilder((Ret) this.data_).mergeFrom(ret).buildPartial();
        }
        this.dataCase_ = 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeSauth(SAuth sAuth) {
        if (this.dataCase_ != 3 || this.data_ == SAuth.getDefaultInstance()) {
            this.data_ = sAuth;
        } else {
            this.data_ = SAuth.newBuilder((SAuth) this.data_).mergeFrom(sAuth).buildPartial();
        }
        this.dataCase_ = 3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeSauthRet(SAuthRet sAuthRet) {
        if (this.dataCase_ != 4 || this.data_ == SAuthRet.getDefaultInstance()) {
            this.data_ = sAuthRet;
        } else {
            this.data_ = SAuthRet.newBuilder((SAuthRet) this.data_).mergeFrom(sAuthRet).buildPartial();
        }
        this.dataCase_ = 4;
    }

    public static C3958b newBuilder(PbPacketBody pbPacketBody) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(pbPacketBody);
    }

    public static PbPacketBody parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (PbPacketBody) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static PbPacketBody parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (PbPacketBody) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static i860<PbPacketBody> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDisconn(Disconnect.C3932b c3932b) {
        this.data_ = c3932b.build();
        this.dataCase_ = 9;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMsg(Msg.C3934b c3934b) {
        this.data_ = c3934b.build();
        this.dataCase_ = 10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMsgAck(MsgAck.C3937b c3937b) {
        this.data_ = c3937b.build();
        this.dataCase_ = 7;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMsgFin(MsgFin.C3940b c3940b) {
        this.data_ = c3940b.build();
        this.dataCase_ = 8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMsgPsh(MsgPsh.C3943b c3943b) {
        this.data_ = c3943b.build();
        this.dataCase_ = 5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMsgSyn(MsgSyn.C3945b c3945b) {
        this.data_ = c3945b.build();
        this.dataCase_ = 6;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMsgV2(MsgV2.C3948b c3948b) {
        this.data_ = c3948b.build();
        this.dataCase_ = 12;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNotify(Notify.C3951b c3951b) {
        this.data_ = c3951b.build();
        this.dataCase_ = 11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNotifyV2(NotifyV2.C3956b c3956b) {
        this.data_ = c3956b.build();
        this.dataCase_ = 13;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRet(Ret.C3960b c3960b) {
        this.data_ = c3960b.build();
        this.dataCase_ = 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSauth(SAuth.C3962b c3962b) {
        this.data_ = c3962b.build();
        this.dataCase_ = 3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSauthRet(SAuthRet.C3964b c3964b) {
        this.data_ = c3964b.build();
        this.dataCase_ = 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setType(BodyType bodyType) {
        bodyType.getClass();
        this.type_ = bodyType.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTypeValue(int i) {
        this.type_ = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v41 */
    /* JADX WARN: Type inference failed for: r14v42, types: [com.google.protobuf.GeneratedMessageLite$b] */
    /* JADX WARN: Type inference failed for: r14v49 */
    /* JADX WARN: Type inference failed for: r2v100 */
    /* JADX WARN: Type inference failed for: r2v101 */
    /* JADX WARN: Type inference failed for: r2v102 */
    /* JADX WARN: Type inference failed for: r2v103 */
    /* JADX WARN: Type inference failed for: r2v104 */
    /* JADX WARN: Type inference failed for: r2v105 */
    /* JADX WARN: Type inference failed for: r2v106 */
    /* JADX WARN: Type inference failed for: r2v107 */
    /* JADX WARN: Type inference failed for: r2v108 */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v15, types: [com.google.protobuf.GeneratedMessageLite$b] */
    /* JADX WARN: Type inference failed for: r2v22 */
    /* JADX WARN: Type inference failed for: r2v23, types: [com.google.protobuf.GeneratedMessageLite$b] */
    /* JADX WARN: Type inference failed for: r2v30 */
    /* JADX WARN: Type inference failed for: r2v31, types: [com.google.protobuf.GeneratedMessageLite$b] */
    /* JADX WARN: Type inference failed for: r2v38 */
    /* JADX WARN: Type inference failed for: r2v39, types: [com.google.protobuf.GeneratedMessageLite$b] */
    /* JADX WARN: Type inference failed for: r2v46 */
    /* JADX WARN: Type inference failed for: r2v47, types: [com.google.protobuf.GeneratedMessageLite$b] */
    /* JADX WARN: Type inference failed for: r2v54 */
    /* JADX WARN: Type inference failed for: r2v55, types: [com.google.protobuf.GeneratedMessageLite$b] */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v62 */
    /* JADX WARN: Type inference failed for: r2v63, types: [com.google.protobuf.GeneratedMessageLite$b] */
    /* JADX WARN: Type inference failed for: r2v7, types: [com.google.protobuf.GeneratedMessageLite$b] */
    /* JADX WARN: Type inference failed for: r2v70 */
    /* JADX WARN: Type inference failed for: r2v71, types: [com.google.protobuf.GeneratedMessageLite$b] */
    /* JADX WARN: Type inference failed for: r2v78 */
    /* JADX WARN: Type inference failed for: r2v79, types: [com.google.protobuf.GeneratedMessageLite$b] */
    /* JADX WARN: Type inference failed for: r2v86 */
    /* JADX WARN: Type inference failed for: r2v87, types: [com.google.protobuf.GeneratedMessageLite$b] */
    /* JADX WARN: Type inference failed for: r2v98 */
    /* JADX WARN: Type inference failed for: r2v99 */
    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        int i;
        C3957a c3957a = null;
        switch (C3957a.f14050b[methodToInvoke.ordinal()]) {
            case 1:
                return new PbPacketBody();
            case 2:
                return DEFAULT_INSTANCE;
            case 3:
                return null;
            case 4:
                return new C3958b(c3957a);
            case 5:
                GeneratedMessageLite.InterfaceC3386h interfaceC3386h = (GeneratedMessageLite.InterfaceC3386h) obj;
                PbPacketBody pbPacketBody = (PbPacketBody) obj2;
                int i2 = this.type_;
                boolean z = i2 != 0;
                int i3 = pbPacketBody.type_;
                this.type_ = interfaceC3386h.mo16996e(z, i2, i3 != 0, i3);
                switch (C3957a.f14049a[pbPacketBody.getDataCase().ordinal()]) {
                    case 1:
                        this.data_ = interfaceC3386h.mo17002k(this.dataCase_ == 2, this.data_, pbPacketBody.data_);
                        break;
                    case 2:
                        this.data_ = interfaceC3386h.mo17002k(this.dataCase_ == 3, this.data_, pbPacketBody.data_);
                        break;
                    case 3:
                        this.data_ = interfaceC3386h.mo17002k(this.dataCase_ == 4, this.data_, pbPacketBody.data_);
                        break;
                    case 4:
                        this.data_ = interfaceC3386h.mo17002k(this.dataCase_ == 5, this.data_, pbPacketBody.data_);
                        break;
                    case 5:
                        this.data_ = interfaceC3386h.mo17002k(this.dataCase_ == 6, this.data_, pbPacketBody.data_);
                        break;
                    case 6:
                        this.data_ = interfaceC3386h.mo17002k(this.dataCase_ == 7, this.data_, pbPacketBody.data_);
                        break;
                    case 7:
                        this.data_ = interfaceC3386h.mo17002k(this.dataCase_ == 8, this.data_, pbPacketBody.data_);
                        break;
                    case 8:
                        this.data_ = interfaceC3386h.mo17002k(this.dataCase_ == 9, this.data_, pbPacketBody.data_);
                        break;
                    case 9:
                        this.data_ = interfaceC3386h.mo17002k(this.dataCase_ == 10, this.data_, pbPacketBody.data_);
                        break;
                    case 10:
                        this.data_ = interfaceC3386h.mo17002k(this.dataCase_ == 11, this.data_, pbPacketBody.data_);
                        break;
                    case 11:
                        this.data_ = interfaceC3386h.mo17002k(this.dataCase_ == 12, this.data_, pbPacketBody.data_);
                        break;
                    case 12:
                        this.data_ = interfaceC3386h.mo17002k(this.dataCase_ == 13, this.data_, pbPacketBody.data_);
                        break;
                    case 13:
                        interfaceC3386h.mo16994c(this.dataCase_ != 0);
                        break;
                }
                if (interfaceC3386h == GeneratedMessageLite.C3385g.INSTANCE && (i = pbPacketBody.dataCase_) != 0) {
                    this.dataCase_ = i;
                }
                return this;
            case 6:
                C3407e c3407e = (C3407e) obj;
                C3410h c3410h = (C3410h) obj2;
                boolean z2 = false;
                while (!z2) {
                    C3957a c3957a2 = c3957a;
                    try {
                        int iM17116M = c3407e.m17116M();
                        switch (iM17116M) {
                            case 0:
                                break;
                            case 8:
                                this.type_ = c3407e.m17136p();
                                continue;
                                c3957a = c3957a2;
                                break;
                            case 18:
                                ?? builder = this.dataCase_ == 2 ? ((Ret) this.data_).toBuilder() : c3957a2;
                                InterfaceC3419q interfaceC3419qM17143w = c3407e.m17143w(Ret.parser(), c3410h);
                                this.data_ = interfaceC3419qM17143w;
                                if (builder != 0) {
                                    builder.mergeFrom((Ret) interfaceC3419qM17143w);
                                    this.data_ = builder.buildPartial();
                                }
                                this.dataCase_ = 2;
                                continue;
                                c3957a = c3957a2;
                                break;
                            case 26:
                                ?? builder2 = this.dataCase_ == 3 ? ((SAuth) this.data_).toBuilder() : c3957a2;
                                InterfaceC3419q interfaceC3419qM17143w2 = c3407e.m17143w(SAuth.parser(), c3410h);
                                this.data_ = interfaceC3419qM17143w2;
                                if (builder2 != 0) {
                                    builder2.mergeFrom((SAuth) interfaceC3419qM17143w2);
                                    this.data_ = builder2.buildPartial();
                                }
                                this.dataCase_ = 3;
                                continue;
                                c3957a = c3957a2;
                                break;
                            case 34:
                                ?? builder3 = this.dataCase_ == 4 ? ((SAuthRet) this.data_).toBuilder() : c3957a2;
                                InterfaceC3419q interfaceC3419qM17143w3 = c3407e.m17143w(SAuthRet.parser(), c3410h);
                                this.data_ = interfaceC3419qM17143w3;
                                if (builder3 != 0) {
                                    builder3.mergeFrom((SAuthRet) interfaceC3419qM17143w3);
                                    this.data_ = builder3.buildPartial();
                                }
                                this.dataCase_ = 4;
                                continue;
                                c3957a = c3957a2;
                                break;
                            case 42:
                                ?? builder4 = this.dataCase_ == 5 ? ((MsgPsh) this.data_).toBuilder() : c3957a2;
                                InterfaceC3419q interfaceC3419qM17143w4 = c3407e.m17143w(MsgPsh.parser(), c3410h);
                                this.data_ = interfaceC3419qM17143w4;
                                if (builder4 != 0) {
                                    builder4.mergeFrom((MsgPsh) interfaceC3419qM17143w4);
                                    this.data_ = builder4.buildPartial();
                                }
                                this.dataCase_ = 5;
                                continue;
                                c3957a = c3957a2;
                                break;
                            case 50:
                                ?? builder5 = this.dataCase_ == 6 ? ((MsgSyn) this.data_).toBuilder() : c3957a2;
                                InterfaceC3419q interfaceC3419qM17143w5 = c3407e.m17143w(MsgSyn.parser(), c3410h);
                                this.data_ = interfaceC3419qM17143w5;
                                if (builder5 != 0) {
                                    builder5.mergeFrom((MsgSyn) interfaceC3419qM17143w5);
                                    this.data_ = builder5.buildPartial();
                                }
                                this.dataCase_ = 6;
                                continue;
                                c3957a = c3957a2;
                                break;
                            case 58:
                                ?? builder6 = this.dataCase_ == 7 ? ((MsgAck) this.data_).toBuilder() : c3957a2;
                                InterfaceC3419q interfaceC3419qM17143w6 = c3407e.m17143w(MsgAck.parser(), c3410h);
                                this.data_ = interfaceC3419qM17143w6;
                                if (builder6 != 0) {
                                    builder6.mergeFrom((MsgAck) interfaceC3419qM17143w6);
                                    this.data_ = builder6.buildPartial();
                                }
                                this.dataCase_ = 7;
                                continue;
                                c3957a = c3957a2;
                                break;
                            case 66:
                                ?? builder7 = this.dataCase_ == 8 ? ((MsgFin) this.data_).toBuilder() : c3957a2;
                                InterfaceC3419q interfaceC3419qM17143w7 = c3407e.m17143w(MsgFin.parser(), c3410h);
                                this.data_ = interfaceC3419qM17143w7;
                                if (builder7 != 0) {
                                    builder7.mergeFrom((MsgFin) interfaceC3419qM17143w7);
                                    this.data_ = builder7.buildPartial();
                                }
                                this.dataCase_ = 8;
                                continue;
                                c3957a = c3957a2;
                                break;
                            case 74:
                                ?? builder8 = this.dataCase_ == 9 ? ((Disconnect) this.data_).toBuilder() : c3957a2;
                                InterfaceC3419q interfaceC3419qM17143w8 = c3407e.m17143w(Disconnect.parser(), c3410h);
                                this.data_ = interfaceC3419qM17143w8;
                                if (builder8 != 0) {
                                    builder8.mergeFrom((Disconnect) interfaceC3419qM17143w8);
                                    this.data_ = builder8.buildPartial();
                                }
                                this.dataCase_ = 9;
                                continue;
                                c3957a = c3957a2;
                                break;
                            case EACTags.COMMAND_TO_PERFORM /* 82 */:
                                ?? builder9 = this.dataCase_ == 10 ? ((Msg) this.data_).toBuilder() : c3957a2;
                                InterfaceC3419q interfaceC3419qM17143w9 = c3407e.m17143w(Msg.parser(), c3410h);
                                this.data_ = interfaceC3419qM17143w9;
                                if (builder9 != 0) {
                                    builder9.mergeFrom((Msg) interfaceC3419qM17143w9);
                                    this.data_ = builder9.buildPartial();
                                }
                                this.dataCase_ = 10;
                                continue;
                                c3957a = c3957a2;
                                break;
                            case 90:
                                ?? builder10 = this.dataCase_ == 11 ? ((Notify) this.data_).toBuilder() : c3957a2;
                                InterfaceC3419q interfaceC3419qM17143w10 = c3407e.m17143w(Notify.parser(), c3410h);
                                this.data_ = interfaceC3419qM17143w10;
                                if (builder10 != 0) {
                                    builder10.mergeFrom((Notify) interfaceC3419qM17143w10);
                                    this.data_ = builder10.buildPartial();
                                }
                                this.dataCase_ = 11;
                                continue;
                                c3957a = c3957a2;
                                break;
                            case EACTags.FCP_TEMPLATE /* 98 */:
                                ?? builder11 = this.dataCase_ == 12 ? ((MsgV2) this.data_).toBuilder() : c3957a2;
                                InterfaceC3419q interfaceC3419qM17143w11 = c3407e.m17143w(MsgV2.parser(), c3410h);
                                this.data_ = interfaceC3419qM17143w11;
                                if (builder11 != 0) {
                                    builder11.mergeFrom((MsgV2) interfaceC3419qM17143w11);
                                    this.data_ = builder11.buildPartial();
                                }
                                this.dataCase_ = 12;
                                continue;
                                c3957a = c3957a2;
                                break;
                            case 106:
                                ?? builder12 = this.dataCase_ == 13 ? ((NotifyV2) this.data_).toBuilder() : c3957a2;
                                InterfaceC3419q interfaceC3419qM17143w12 = c3407e.m17143w(NotifyV2.parser(), c3410h);
                                this.data_ = interfaceC3419qM17143w12;
                                if (builder12 != 0) {
                                    builder12.mergeFrom((NotifyV2) interfaceC3419qM17143w12);
                                    this.data_ = builder12.buildPartial();
                                }
                                this.dataCase_ = 13;
                                continue;
                                c3957a = c3957a2;
                                break;
                            default:
                                if (!c3407e.m17121R(iM17116M)) {
                                }
                                c3957a = c3957a2;
                                break;
                        }
                        z2 = true;
                        c3957a = c3957a2;
                    } catch (InvalidProtocolBufferException e) {
                        aag0.m95543a(e.setUnfinishedMessage(this));
                        return c3957a2;
                    } catch (IOException e2) {
                        aag0.m95543a(new InvalidProtocolBufferException(e2.getMessage()).setUnfinishedMessage(this));
                        return c3957a2;
                    }
                }
                break;
            case 7:
                break;
            case 8:
                if (PARSER == null) {
                    synchronized (PbPacketBody.class) {
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

    public DataCase getDataCase() {
        return DataCase.forNumber(this.dataCase_);
    }

    public Disconnect getDisconn() {
        return this.dataCase_ == 9 ? (Disconnect) this.data_ : Disconnect.getDefaultInstance();
    }

    public Msg getMsg() {
        return this.dataCase_ == 10 ? (Msg) this.data_ : Msg.getDefaultInstance();
    }

    public MsgAck getMsgAck() {
        return this.dataCase_ == 7 ? (MsgAck) this.data_ : MsgAck.getDefaultInstance();
    }

    public MsgFin getMsgFin() {
        return this.dataCase_ == 8 ? (MsgFin) this.data_ : MsgFin.getDefaultInstance();
    }

    public MsgPsh getMsgPsh() {
        return this.dataCase_ == 5 ? (MsgPsh) this.data_ : MsgPsh.getDefaultInstance();
    }

    public MsgSyn getMsgSyn() {
        return this.dataCase_ == 6 ? (MsgSyn) this.data_ : MsgSyn.getDefaultInstance();
    }

    public MsgV2 getMsgV2() {
        return this.dataCase_ == 12 ? (MsgV2) this.data_ : MsgV2.getDefaultInstance();
    }

    public Notify getNotify() {
        return this.dataCase_ == 11 ? (Notify) this.data_ : Notify.getDefaultInstance();
    }

    public NotifyV2 getNotifyV2() {
        return this.dataCase_ == 13 ? (NotifyV2) this.data_ : NotifyV2.getDefaultInstance();
    }

    public Ret getRet() {
        return this.dataCase_ == 2 ? (Ret) this.data_ : Ret.getDefaultInstance();
    }

    public SAuth getSauth() {
        return this.dataCase_ == 3 ? (SAuth) this.data_ : SAuth.getDefaultInstance();
    }

    public SAuthRet getSauthRet() {
        return this.dataCase_ == 4 ? (SAuthRet) this.data_ : SAuthRet.getDefaultInstance();
    }

    @Override // com.google.protobuf.InterfaceC3419q
    public int getSerializedSize() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int iM16922m = this.type_ != BodyType.RET.getNumber() ? CodedOutputStream.m16922m(1, this.type_) : 0;
        if (this.dataCase_ == 2) {
            iM16922m += CodedOutputStream.m16893C(2, (Ret) this.data_);
        }
        if (this.dataCase_ == 3) {
            iM16922m += CodedOutputStream.m16893C(3, (SAuth) this.data_);
        }
        if (this.dataCase_ == 4) {
            iM16922m += CodedOutputStream.m16893C(4, (SAuthRet) this.data_);
        }
        if (this.dataCase_ == 5) {
            iM16922m += CodedOutputStream.m16893C(5, (MsgPsh) this.data_);
        }
        if (this.dataCase_ == 6) {
            iM16922m += CodedOutputStream.m16893C(6, (MsgSyn) this.data_);
        }
        if (this.dataCase_ == 7) {
            iM16922m += CodedOutputStream.m16893C(7, (MsgAck) this.data_);
        }
        if (this.dataCase_ == 8) {
            iM16922m += CodedOutputStream.m16893C(8, (MsgFin) this.data_);
        }
        if (this.dataCase_ == 9) {
            iM16922m += CodedOutputStream.m16893C(9, (Disconnect) this.data_);
        }
        if (this.dataCase_ == 10) {
            iM16922m += CodedOutputStream.m16893C(10, (Msg) this.data_);
        }
        if (this.dataCase_ == 11) {
            iM16922m += CodedOutputStream.m16893C(11, (Notify) this.data_);
        }
        if (this.dataCase_ == 12) {
            iM16922m += CodedOutputStream.m16893C(12, (MsgV2) this.data_);
        }
        if (this.dataCase_ == 13) {
            iM16922m += CodedOutputStream.m16893C(13, (NotifyV2) this.data_);
        }
        this.memoizedSerializedSize = iM16922m;
        return iM16922m;
    }

    public BodyType getType() {
        BodyType bodyTypeForNumber = BodyType.forNumber(this.type_);
        return bodyTypeForNumber == null ? BodyType.UNRECOGNIZED : bodyTypeForNumber;
    }

    public int getTypeValue() {
        return this.type_;
    }

    @Override // com.google.protobuf.InterfaceC3419q
    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        if (this.type_ != BodyType.RET.getNumber()) {
            codedOutputStream.m16960i0(1, this.type_);
        }
        if (this.dataCase_ == 2) {
            codedOutputStream.mo16974w0(2, (Ret) this.data_);
        }
        if (this.dataCase_ == 3) {
            codedOutputStream.mo16974w0(3, (SAuth) this.data_);
        }
        if (this.dataCase_ == 4) {
            codedOutputStream.mo16974w0(4, (SAuthRet) this.data_);
        }
        if (this.dataCase_ == 5) {
            codedOutputStream.mo16974w0(5, (MsgPsh) this.data_);
        }
        if (this.dataCase_ == 6) {
            codedOutputStream.mo16974w0(6, (MsgSyn) this.data_);
        }
        if (this.dataCase_ == 7) {
            codedOutputStream.mo16974w0(7, (MsgAck) this.data_);
        }
        if (this.dataCase_ == 8) {
            codedOutputStream.mo16974w0(8, (MsgFin) this.data_);
        }
        if (this.dataCase_ == 9) {
            codedOutputStream.mo16974w0(9, (Disconnect) this.data_);
        }
        if (this.dataCase_ == 10) {
            codedOutputStream.mo16974w0(10, (Msg) this.data_);
        }
        if (this.dataCase_ == 11) {
            codedOutputStream.mo16974w0(11, (Notify) this.data_);
        }
        if (this.dataCase_ == 12) {
            codedOutputStream.mo16974w0(12, (MsgV2) this.data_);
        }
        if (this.dataCase_ == 13) {
            codedOutputStream.mo16974w0(13, (NotifyV2) this.data_);
        }
    }

    /* JADX INFO: renamed from: com.immomo.push.pb.PbPacketBody$b */
    public static final class C3958b extends GeneratedMessageLite.AbstractC3380b<PbPacketBody, C3958b> implements o6z {
        private C3958b() {
            super(PbPacketBody.DEFAULT_INSTANCE);
        }

        public /* synthetic */ C3958b(C3957a c3957a) {
            this();
        }
    }

    public enum DataCase implements C3414l.c {
        RET(2),
        SAUTH(3),
        SAUTHRET(4),
        MSGPSH(5),
        MSGSYN(6),
        MSGACK(7),
        MSGFIN(8),
        DISCONN(9),
        MSG(10),
        NOTIFY(11),
        MSGV2(12),
        NOTIFYV2(13),
        DATA_NOT_SET(0);

        private final int value;

        DataCase(int i) {
            this.value = i;
        }

        public static DataCase forNumber(int i) {
            if (i == 0) {
                return DATA_NOT_SET;
            }
            switch (i) {
                case 2:
                    return RET;
                case 3:
                    return SAUTH;
                case 4:
                    return SAUTHRET;
                case 5:
                    return MSGPSH;
                case 6:
                    return MSGSYN;
                case 7:
                    return MSGACK;
                case 8:
                    return MSGFIN;
                case 9:
                    return DISCONN;
                case 10:
                    return MSG;
                case 11:
                    return NOTIFY;
                case 12:
                    return MSGV2;
                case 13:
                    return NOTIFYV2;
                default:
                    return null;
            }
        }

        @Override // com.google.protobuf.C3414l.c
        public int getNumber() {
            return this.value;
        }

        @Deprecated
        public static DataCase valueOf(int i) {
            return forNumber(i);
        }
    }

    public static PbPacketBody parseDelimitedFrom(InputStream inputStream, C3410h c3410h) throws IOException {
        return (PbPacketBody) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, c3410h);
    }

    public static PbPacketBody parseFrom(ByteString byteString, C3410h c3410h) throws InvalidProtocolBufferException {
        return (PbPacketBody) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, c3410h);
    }

    public static PbPacketBody parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (PbPacketBody) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMsgAck(MsgAck msgAck) {
        msgAck.getClass();
        this.data_ = msgAck;
        this.dataCase_ = 7;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMsgPsh(MsgPsh msgPsh) {
        msgPsh.getClass();
        this.data_ = msgPsh;
        this.dataCase_ = 5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMsgSyn(MsgSyn msgSyn) {
        msgSyn.getClass();
        this.data_ = msgSyn;
        this.dataCase_ = 6;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRet(Ret ret) {
        ret.getClass();
        this.data_ = ret;
        this.dataCase_ = 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSauth(SAuth sAuth) {
        sAuth.getClass();
        this.data_ = sAuth;
        this.dataCase_ = 3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSauthRet(SAuthRet sAuthRet) {
        sAuthRet.getClass();
        this.data_ = sAuthRet;
        this.dataCase_ = 4;
    }

    public static PbPacketBody parseFrom(byte[] bArr, C3410h c3410h) throws InvalidProtocolBufferException {
        return (PbPacketBody) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, c3410h);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDisconn(Disconnect disconnect) {
        disconnect.getClass();
        this.data_ = disconnect;
        this.dataCase_ = 9;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMsg(Msg msg) {
        msg.getClass();
        this.data_ = msg;
        this.dataCase_ = 10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMsgFin(MsgFin msgFin) {
        msgFin.getClass();
        this.data_ = msgFin;
        this.dataCase_ = 8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMsgV2(MsgV2 msgV2) {
        msgV2.getClass();
        this.data_ = msgV2;
        this.dataCase_ = 12;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNotify(Notify notify) {
        notify.getClass();
        this.data_ = notify;
        this.dataCase_ = 11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNotifyV2(NotifyV2 notifyV2) {
        notifyV2.getClass();
        this.data_ = notifyV2;
        this.dataCase_ = 13;
    }

    public static PbPacketBody parseFrom(InputStream inputStream) throws IOException {
        return (PbPacketBody) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static PbPacketBody parseFrom(InputStream inputStream, C3410h c3410h) throws IOException {
        return (PbPacketBody) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, c3410h);
    }

    public static PbPacketBody parseFrom(C3407e c3407e) throws IOException {
        return (PbPacketBody) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, c3407e);
    }

    public static C3958b newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static PbPacketBody parseFrom(C3407e c3407e, C3410h c3410h) throws IOException {
        return (PbPacketBody) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, c3407e, c3410h);
    }
}
