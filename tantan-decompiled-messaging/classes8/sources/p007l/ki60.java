package p007l;

import com.google.protobuf.q;
import com.p003p1.mobile.longlink.msg.connector.LongLinkMessage;
import okio.ByteString;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes8.dex */
public class ki60 {

    /* JADX INFO: renamed from: a */
    public LongLinkMessage.Msg f3072a;

    /* JADX INFO: renamed from: b */
    public q f3073b;

    public ki60(LongLinkMessage.MsgTypeEnum msgTypeEnum, String str, q qVar) {
        this.f3073b = qVar;
        this.f3072a = (LongLinkMessage.Msg) LongLinkMessage.Msg.newBuilder().setMsgId(str).setType(msgTypeEnum).setData(li60.m9813a(qVar)).build();
    }

    /* JADX INFO: renamed from: a */
    public ByteString m9609a() {
        return ByteString.of(this.f3072a.toByteArray());
    }

    public ki60(LongLinkMessage.Msg msg, q qVar) {
        this.f3072a = msg;
        this.f3073b = qVar;
    }
}
