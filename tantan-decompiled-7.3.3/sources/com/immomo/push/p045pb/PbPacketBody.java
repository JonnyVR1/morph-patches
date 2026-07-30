package com.immomo.push.p045pb;

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
import org.spongycastle.asn1.eac.EACTags;
import p153l.iig0;
import p153l.l710;
import p153l.lfz;
import p153l.ng60;

/* JADX INFO: loaded from: classes7.dex */
public final class PbPacketBody extends GeneratedMessageLite<PbPacketBody, C4109b> implements lfz {
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
    private static volatile ng60<PbPacketBody> PARSER = null;
    public static final int RET_FIELD_NUMBER = 2;
    public static final int SAUTHRET_FIELD_NUMBER = 4;
    public static final int SAUTH_FIELD_NUMBER = 3;
    public static final int TYPE_FIELD_NUMBER = 1;
    private int dataCase_ = 0;
    private Object data_;
    private int type_;

    /* JADX INFO: renamed from: com.immomo.push.pb.PbPacketBody$a */
    public static /* synthetic */ class C4108a {

        /* JADX INFO: renamed from: a */
        static final /* synthetic */ int[] f14768a;

        /* JADX INFO: renamed from: b */
        static final /* synthetic */ int[] f14769b;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f14769b = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f14769b[GeneratedMessageLite.MethodToInvoke.IS_INITIALIZED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f14769b[GeneratedMessageLite.MethodToInvoke.MAKE_IMMUTABLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f14769b[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f14769b[GeneratedMessageLite.MethodToInvoke.VISIT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f14769b[GeneratedMessageLite.MethodToInvoke.MERGE_FROM_STREAM.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f14769b[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f14769b[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            int[] iArr2 = new int[DataCase.values().length];
            f14768a = iArr2;
            try {
                iArr2[DataCase.RET.ordinal()] = 1;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f14768a[DataCase.SAUTH.ordinal()] = 2;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f14768a[DataCase.SAUTHRET.ordinal()] = 3;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f14768a[DataCase.MSGPSH.ordinal()] = 4;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f14768a[DataCase.MSGSYN.ordinal()] = 5;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f14768a[DataCase.MSGACK.ordinal()] = 6;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f14768a[DataCase.MSGFIN.ordinal()] = 7;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f14768a[DataCase.DISCONN.ordinal()] = 8;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f14768a[DataCase.MSG.ordinal()] = 9;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                f14768a[DataCase.NOTIFY.ordinal()] = 10;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                f14768a[DataCase.MSGV2.ordinal()] = 11;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                f14768a[DataCase.NOTIFYV2.ordinal()] = 12;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                f14768a[DataCase.DATA_NOT_SET.ordinal()] = 13;
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

    public static C4109b newBuilder(PbPacketBody pbPacketBody) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(pbPacketBody);
    }

    public static PbPacketBody parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (PbPacketBody) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static PbPacketBody parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (PbPacketBody) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static ng60<PbPacketBody> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDisconn(Disconnect.C4083b c4083b) {
        this.data_ = c4083b.build();
        this.dataCase_ = 9;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMsg(Msg.C4085b c4085b) {
        this.data_ = c4085b.build();
        this.dataCase_ = 10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMsgAck(MsgAck.C4088b c4088b) {
        this.data_ = c4088b.build();
        this.dataCase_ = 7;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMsgFin(MsgFin.C4091b c4091b) {
        this.data_ = c4091b.build();
        this.dataCase_ = 8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMsgPsh(MsgPsh.C4094b c4094b) {
        this.data_ = c4094b.build();
        this.dataCase_ = 5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMsgSyn(MsgSyn.C4096b c4096b) {
        this.data_ = c4096b.build();
        this.dataCase_ = 6;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMsgV2(MsgV2.C4099b c4099b) {
        this.data_ = c4099b.build();
        this.dataCase_ = 12;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNotify(Notify.C4102b c4102b) {
        this.data_ = c4102b.build();
        this.dataCase_ = 11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNotifyV2(NotifyV2.C4107b c4107b) {
        this.data_ = c4107b.build();
        this.dataCase_ = 13;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRet(Ret.C4111b c4111b) {
        this.data_ = c4111b.build();
        this.dataCase_ = 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSauth(SAuth.C4113b c4113b) {
        this.data_ = c4113b.build();
        this.dataCase_ = 3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSauthRet(SAuthRet.C4115b c4115b) {
        this.data_ = c4115b.build();
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
        C4108a c4108a = null;
        switch (C4108a.f14769b[methodToInvoke.ordinal()]) {
            case 1:
                return new PbPacketBody();
            case 2:
                return DEFAULT_INSTANCE;
            case 3:
                return null;
            case 4:
                return new C4109b(c4108a);
            case 5:
                GeneratedMessageLite.InterfaceC3409h interfaceC3409h = (GeneratedMessageLite.InterfaceC3409h) obj;
                PbPacketBody pbPacketBody = (PbPacketBody) obj2;
                int i2 = this.type_;
                boolean z = i2 != 0;
                int i3 = pbPacketBody.type_;
                this.type_ = interfaceC3409h.mo17051e(z, i2, i3 != 0, i3);
                switch (C4108a.f14768a[pbPacketBody.getDataCase().ordinal()]) {
                    case 1:
                        this.data_ = interfaceC3409h.mo17057k(this.dataCase_ == 2, this.data_, pbPacketBody.data_);
                        break;
                    case 2:
                        this.data_ = interfaceC3409h.mo17057k(this.dataCase_ == 3, this.data_, pbPacketBody.data_);
                        break;
                    case 3:
                        this.data_ = interfaceC3409h.mo17057k(this.dataCase_ == 4, this.data_, pbPacketBody.data_);
                        break;
                    case 4:
                        this.data_ = interfaceC3409h.mo17057k(this.dataCase_ == 5, this.data_, pbPacketBody.data_);
                        break;
                    case 5:
                        this.data_ = interfaceC3409h.mo17057k(this.dataCase_ == 6, this.data_, pbPacketBody.data_);
                        break;
                    case 6:
                        this.data_ = interfaceC3409h.mo17057k(this.dataCase_ == 7, this.data_, pbPacketBody.data_);
                        break;
                    case 7:
                        this.data_ = interfaceC3409h.mo17057k(this.dataCase_ == 8, this.data_, pbPacketBody.data_);
                        break;
                    case 8:
                        this.data_ = interfaceC3409h.mo17057k(this.dataCase_ == 9, this.data_, pbPacketBody.data_);
                        break;
                    case 9:
                        this.data_ = interfaceC3409h.mo17057k(this.dataCase_ == 10, this.data_, pbPacketBody.data_);
                        break;
                    case 10:
                        this.data_ = interfaceC3409h.mo17057k(this.dataCase_ == 11, this.data_, pbPacketBody.data_);
                        break;
                    case 11:
                        this.data_ = interfaceC3409h.mo17057k(this.dataCase_ == 12, this.data_, pbPacketBody.data_);
                        break;
                    case 12:
                        this.data_ = interfaceC3409h.mo17057k(this.dataCase_ == 13, this.data_, pbPacketBody.data_);
                        break;
                    case 13:
                        interfaceC3409h.mo17049c(this.dataCase_ != 0);
                        break;
                }
                if (interfaceC3409h == GeneratedMessageLite.C3408g.INSTANCE && (i = pbPacketBody.dataCase_) != 0) {
                    this.dataCase_ = i;
                }
                return this;
            case 6:
                C3430e c3430e = (C3430e) obj;
                C3433h c3433h = (C3433h) obj2;
                boolean z2 = false;
                while (!z2) {
                    C4108a c4108a2 = c4108a;
                    try {
                        int iM17171M = c3430e.m17171M();
                        switch (iM17171M) {
                            case 0:
                                break;
                            case 8:
                                this.type_ = c3430e.m17191p();
                                continue;
                                c4108a = c4108a2;
                                break;
                            case 18:
                                ?? builder = this.dataCase_ == 2 ? ((Ret) this.data_).toBuilder() : c4108a2;
                                InterfaceC3442q interfaceC3442qM17198w = c3430e.m17198w(Ret.parser(), c3433h);
                                this.data_ = interfaceC3442qM17198w;
                                if (builder != 0) {
                                    builder.mergeFrom((Ret) interfaceC3442qM17198w);
                                    this.data_ = builder.buildPartial();
                                }
                                this.dataCase_ = 2;
                                continue;
                                c4108a = c4108a2;
                                break;
                            case 26:
                                ?? builder2 = this.dataCase_ == 3 ? ((SAuth) this.data_).toBuilder() : c4108a2;
                                InterfaceC3442q interfaceC3442qM17198w2 = c3430e.m17198w(SAuth.parser(), c3433h);
                                this.data_ = interfaceC3442qM17198w2;
                                if (builder2 != 0) {
                                    builder2.mergeFrom((SAuth) interfaceC3442qM17198w2);
                                    this.data_ = builder2.buildPartial();
                                }
                                this.dataCase_ = 3;
                                continue;
                                c4108a = c4108a2;
                                break;
                            case 34:
                                ?? builder3 = this.dataCase_ == 4 ? ((SAuthRet) this.data_).toBuilder() : c4108a2;
                                InterfaceC3442q interfaceC3442qM17198w3 = c3430e.m17198w(SAuthRet.parser(), c3433h);
                                this.data_ = interfaceC3442qM17198w3;
                                if (builder3 != 0) {
                                    builder3.mergeFrom((SAuthRet) interfaceC3442qM17198w3);
                                    this.data_ = builder3.buildPartial();
                                }
                                this.dataCase_ = 4;
                                continue;
                                c4108a = c4108a2;
                                break;
                            case 42:
                                ?? builder4 = this.dataCase_ == 5 ? ((MsgPsh) this.data_).toBuilder() : c4108a2;
                                InterfaceC3442q interfaceC3442qM17198w4 = c3430e.m17198w(MsgPsh.parser(), c3433h);
                                this.data_ = interfaceC3442qM17198w4;
                                if (builder4 != 0) {
                                    builder4.mergeFrom((MsgPsh) interfaceC3442qM17198w4);
                                    this.data_ = builder4.buildPartial();
                                }
                                this.dataCase_ = 5;
                                continue;
                                c4108a = c4108a2;
                                break;
                            case 50:
                                ?? builder5 = this.dataCase_ == 6 ? ((MsgSyn) this.data_).toBuilder() : c4108a2;
                                InterfaceC3442q interfaceC3442qM17198w5 = c3430e.m17198w(MsgSyn.parser(), c3433h);
                                this.data_ = interfaceC3442qM17198w5;
                                if (builder5 != 0) {
                                    builder5.mergeFrom((MsgSyn) interfaceC3442qM17198w5);
                                    this.data_ = builder5.buildPartial();
                                }
                                this.dataCase_ = 6;
                                continue;
                                c4108a = c4108a2;
                                break;
                            case 58:
                                ?? builder6 = this.dataCase_ == 7 ? ((MsgAck) this.data_).toBuilder() : c4108a2;
                                InterfaceC3442q interfaceC3442qM17198w6 = c3430e.m17198w(MsgAck.parser(), c3433h);
                                this.data_ = interfaceC3442qM17198w6;
                                if (builder6 != 0) {
                                    builder6.mergeFrom((MsgAck) interfaceC3442qM17198w6);
                                    this.data_ = builder6.buildPartial();
                                }
                                this.dataCase_ = 7;
                                continue;
                                c4108a = c4108a2;
                                break;
                            case 66:
                                ?? builder7 = this.dataCase_ == 8 ? ((MsgFin) this.data_).toBuilder() : c4108a2;
                                InterfaceC3442q interfaceC3442qM17198w7 = c3430e.m17198w(MsgFin.parser(), c3433h);
                                this.data_ = interfaceC3442qM17198w7;
                                if (builder7 != 0) {
                                    builder7.mergeFrom((MsgFin) interfaceC3442qM17198w7);
                                    this.data_ = builder7.buildPartial();
                                }
                                this.dataCase_ = 8;
                                continue;
                                c4108a = c4108a2;
                                break;
                            case 74:
                                ?? builder8 = this.dataCase_ == 9 ? ((Disconnect) this.data_).toBuilder() : c4108a2;
                                InterfaceC3442q interfaceC3442qM17198w8 = c3430e.m17198w(Disconnect.parser(), c3433h);
                                this.data_ = interfaceC3442qM17198w8;
                                if (builder8 != 0) {
                                    builder8.mergeFrom((Disconnect) interfaceC3442qM17198w8);
                                    this.data_ = builder8.buildPartial();
                                }
                                this.dataCase_ = 9;
                                continue;
                                c4108a = c4108a2;
                                break;
                            case EACTags.COMMAND_TO_PERFORM /* 82 */:
                                ?? builder9 = this.dataCase_ == 10 ? ((Msg) this.data_).toBuilder() : c4108a2;
                                InterfaceC3442q interfaceC3442qM17198w9 = c3430e.m17198w(Msg.parser(), c3433h);
                                this.data_ = interfaceC3442qM17198w9;
                                if (builder9 != 0) {
                                    builder9.mergeFrom((Msg) interfaceC3442qM17198w9);
                                    this.data_ = builder9.buildPartial();
                                }
                                this.dataCase_ = 10;
                                continue;
                                c4108a = c4108a2;
                                break;
                            case 90:
                                ?? builder10 = this.dataCase_ == 11 ? ((Notify) this.data_).toBuilder() : c4108a2;
                                InterfaceC3442q interfaceC3442qM17198w10 = c3430e.m17198w(Notify.parser(), c3433h);
                                this.data_ = interfaceC3442qM17198w10;
                                if (builder10 != 0) {
                                    builder10.mergeFrom((Notify) interfaceC3442qM17198w10);
                                    this.data_ = builder10.buildPartial();
                                }
                                this.dataCase_ = 11;
                                continue;
                                c4108a = c4108a2;
                                break;
                            case EACTags.FCP_TEMPLATE /* 98 */:
                                ?? builder11 = this.dataCase_ == 12 ? ((MsgV2) this.data_).toBuilder() : c4108a2;
                                InterfaceC3442q interfaceC3442qM17198w11 = c3430e.m17198w(MsgV2.parser(), c3433h);
                                this.data_ = interfaceC3442qM17198w11;
                                if (builder11 != 0) {
                                    builder11.mergeFrom((MsgV2) interfaceC3442qM17198w11);
                                    this.data_ = builder11.buildPartial();
                                }
                                this.dataCase_ = 12;
                                continue;
                                c4108a = c4108a2;
                                break;
                            case 106:
                                ?? builder12 = this.dataCase_ == 13 ? ((NotifyV2) this.data_).toBuilder() : c4108a2;
                                InterfaceC3442q interfaceC3442qM17198w12 = c3430e.m17198w(NotifyV2.parser(), c3433h);
                                this.data_ = interfaceC3442qM17198w12;
                                if (builder12 != 0) {
                                    builder12.mergeFrom((NotifyV2) interfaceC3442qM17198w12);
                                    this.data_ = builder12.buildPartial();
                                }
                                this.dataCase_ = 13;
                                continue;
                                c4108a = c4108a2;
                                break;
                            default:
                                if (!c3430e.m17176R(iM17171M)) {
                                }
                                c4108a = c4108a2;
                                break;
                        }
                        z2 = true;
                        c4108a = c4108a2;
                    } catch (InvalidProtocolBufferException e) {
                        iig0.m140070a(e.setUnfinishedMessage(this));
                        return c4108a2;
                    } catch (IOException e2) {
                        iig0.m140070a(new InvalidProtocolBufferException(e2.getMessage()).setUnfinishedMessage(this));
                        return c4108a2;
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

    @Override // com.google.protobuf.InterfaceC3442q
    public int getSerializedSize() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int iM16977m = this.type_ != BodyType.RET.getNumber() ? CodedOutputStream.m16977m(1, this.type_) : 0;
        if (this.dataCase_ == 2) {
            iM16977m += CodedOutputStream.m16948C(2, (Ret) this.data_);
        }
        if (this.dataCase_ == 3) {
            iM16977m += CodedOutputStream.m16948C(3, (SAuth) this.data_);
        }
        if (this.dataCase_ == 4) {
            iM16977m += CodedOutputStream.m16948C(4, (SAuthRet) this.data_);
        }
        if (this.dataCase_ == 5) {
            iM16977m += CodedOutputStream.m16948C(5, (MsgPsh) this.data_);
        }
        if (this.dataCase_ == 6) {
            iM16977m += CodedOutputStream.m16948C(6, (MsgSyn) this.data_);
        }
        if (this.dataCase_ == 7) {
            iM16977m += CodedOutputStream.m16948C(7, (MsgAck) this.data_);
        }
        if (this.dataCase_ == 8) {
            iM16977m += CodedOutputStream.m16948C(8, (MsgFin) this.data_);
        }
        if (this.dataCase_ == 9) {
            iM16977m += CodedOutputStream.m16948C(9, (Disconnect) this.data_);
        }
        if (this.dataCase_ == 10) {
            iM16977m += CodedOutputStream.m16948C(10, (Msg) this.data_);
        }
        if (this.dataCase_ == 11) {
            iM16977m += CodedOutputStream.m16948C(11, (Notify) this.data_);
        }
        if (this.dataCase_ == 12) {
            iM16977m += CodedOutputStream.m16948C(12, (MsgV2) this.data_);
        }
        if (this.dataCase_ == 13) {
            iM16977m += CodedOutputStream.m16948C(13, (NotifyV2) this.data_);
        }
        this.memoizedSerializedSize = iM16977m;
        return iM16977m;
    }

    public BodyType getType() {
        BodyType bodyTypeForNumber = BodyType.forNumber(this.type_);
        return bodyTypeForNumber == null ? BodyType.UNRECOGNIZED : bodyTypeForNumber;
    }

    public int getTypeValue() {
        return this.type_;
    }

    @Override // com.google.protobuf.InterfaceC3442q
    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        if (this.type_ != BodyType.RET.getNumber()) {
            codedOutputStream.m17015i0(1, this.type_);
        }
        if (this.dataCase_ == 2) {
            codedOutputStream.mo17029w0(2, (Ret) this.data_);
        }
        if (this.dataCase_ == 3) {
            codedOutputStream.mo17029w0(3, (SAuth) this.data_);
        }
        if (this.dataCase_ == 4) {
            codedOutputStream.mo17029w0(4, (SAuthRet) this.data_);
        }
        if (this.dataCase_ == 5) {
            codedOutputStream.mo17029w0(5, (MsgPsh) this.data_);
        }
        if (this.dataCase_ == 6) {
            codedOutputStream.mo17029w0(6, (MsgSyn) this.data_);
        }
        if (this.dataCase_ == 7) {
            codedOutputStream.mo17029w0(7, (MsgAck) this.data_);
        }
        if (this.dataCase_ == 8) {
            codedOutputStream.mo17029w0(8, (MsgFin) this.data_);
        }
        if (this.dataCase_ == 9) {
            codedOutputStream.mo17029w0(9, (Disconnect) this.data_);
        }
        if (this.dataCase_ == 10) {
            codedOutputStream.mo17029w0(10, (Msg) this.data_);
        }
        if (this.dataCase_ == 11) {
            codedOutputStream.mo17029w0(11, (Notify) this.data_);
        }
        if (this.dataCase_ == 12) {
            codedOutputStream.mo17029w0(12, (MsgV2) this.data_);
        }
        if (this.dataCase_ == 13) {
            codedOutputStream.mo17029w0(13, (NotifyV2) this.data_);
        }
    }

    /* JADX INFO: renamed from: com.immomo.push.pb.PbPacketBody$b */
    public static final class C4109b extends GeneratedMessageLite.AbstractC3403b<PbPacketBody, C4109b> implements lfz {
        private C4109b() {
            super(PbPacketBody.DEFAULT_INSTANCE);
        }

        public /* synthetic */ C4109b(C4108a c4108a) {
            this();
        }
    }

    public enum DataCase implements C3437l.c {
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

        @Override // com.google.protobuf.C3437l.c
        public int getNumber() {
            return this.value;
        }

        @Deprecated
        public static DataCase valueOf(int i) {
            return forNumber(i);
        }
    }

    public static PbPacketBody parseDelimitedFrom(InputStream inputStream, C3433h c3433h) throws IOException {
        return (PbPacketBody) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, c3433h);
    }

    public static PbPacketBody parseFrom(ByteString byteString, C3433h c3433h) throws InvalidProtocolBufferException {
        return (PbPacketBody) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, c3433h);
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

    public static PbPacketBody parseFrom(byte[] bArr, C3433h c3433h) throws InvalidProtocolBufferException {
        return (PbPacketBody) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, c3433h);
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

    public static PbPacketBody parseFrom(InputStream inputStream, C3433h c3433h) throws IOException {
        return (PbPacketBody) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, c3433h);
    }

    public static PbPacketBody parseFrom(C3430e c3430e) throws IOException {
        return (PbPacketBody) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, c3430e);
    }

    public static C4109b newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static PbPacketBody parseFrom(C3430e c3430e, C3433h c3433h) throws IOException {
        return (PbPacketBody) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, c3430e, c3433h);
    }
}
