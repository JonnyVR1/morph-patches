package p149l;

import com.google.protobuf.InterfaceC3419q;
import com.p046p1.mobile.longlink.msg.connector.LongLinkMessage;
import okio.ByteString;

/* JADX INFO: loaded from: classes8.dex */
public class ki60 {

    /* JADX INFO: renamed from: a */
    public LongLinkMessage.Msg f123271a;

    /* JADX INFO: renamed from: b */
    public InterfaceC3419q f123272b;

    public ki60(LongLinkMessage.MsgTypeEnum msgTypeEnum, String str, InterfaceC3419q interfaceC3419q) {
        this.f123272b = interfaceC3419q;
        this.f123271a = LongLinkMessage.Msg.newBuilder().setMsgId(str).setType(msgTypeEnum).setData(li60.m149878a(interfaceC3419q)).build();
    }

    /* JADX INFO: renamed from: a */
    public ByteString m146053a() {
        return ByteString.m221050of(this.f123271a.toByteArray());
    }

    public ki60(LongLinkMessage.Msg msg, InterfaceC3419q interfaceC3419q) {
        this.f123271a = msg;
        this.f123272b = interfaceC3419q;
    }
}
