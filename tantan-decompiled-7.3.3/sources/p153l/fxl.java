package p153l;

import androidx.annotation.Nullable;
import com.google.protobuf.InterfaceC3442q;
import com.google.protobuf.InvalidProtocolBufferException;
import com.p051p1.mobile.longlink.msg.connector.LongLinkMessage;

/* JADX INFO: loaded from: classes9.dex */
public interface fxl<T> {
    /* JADX INFO: renamed from: a */
    boolean mo123068a(InterfaceC3442q interfaceC3442q, pq60 pq60Var);

    /* JADX INFO: renamed from: b */
    Class<T> mo95510b();

    @Nullable
    /* JADX INFO: renamed from: c */
    String mo96253c();

    /* JADX INFO: renamed from: d */
    InterfaceC3442q mo127983d(LongLinkMessage.Msg msg) throws InvalidProtocolBufferException;

    /* JADX INFO: renamed from: f */
    LongLinkMessage.MsgTypeEnum mo102648f();
}
