package p153l;

import com.google.protobuf.InterfaceC3442q;
import com.p051p1.mobile.longlink.msg.connector.LongLinkMessage;
import okio.ByteString;

/* JADX INFO: loaded from: classes9.dex */
public class pq60 {

    /* JADX INFO: renamed from: a */
    public LongLinkMessage.Msg f153643a;

    /* JADX INFO: renamed from: b */
    public InterfaceC3442q f153644b;

    public pq60(LongLinkMessage.MsgTypeEnum msgTypeEnum, String str, InterfaceC3442q interfaceC3442q) {
        this.f153644b = interfaceC3442q;
        this.f153643a = LongLinkMessage.Msg.newBuilder().setMsgId(str).setType(msgTypeEnum).setData(qq60.m177480a(interfaceC3442q)).build();
    }

    /* JADX INFO: renamed from: a */
    public ByteString m173324a() {
        return ByteString.m222317of(this.f153643a.toByteArray());
    }

    public pq60(LongLinkMessage.Msg msg, InterfaceC3442q interfaceC3442q) {
        this.f153643a = msg;
        this.f153644b = interfaceC3442q;
    }
}
