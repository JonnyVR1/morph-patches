package p149l;

import androidx.annotation.Nullable;
import com.google.protobuf.InterfaceC3419q;
import com.google.protobuf.InvalidProtocolBufferException;
import com.p046p1.mobile.longlink.msg.connector.LongLinkMessage;

/* JADX INFO: loaded from: classes9.dex */
public interface sul<T> {
    /* JADX INFO: renamed from: a */
    boolean mo133933a(InterfaceC3419q interfaceC3419q, ki60 ki60Var);

    /* JADX INFO: renamed from: b */
    Class<T> mo94398b();

    @Nullable
    /* JADX INFO: renamed from: c */
    String mo94754c();

    /* JADX INFO: renamed from: d */
    InterfaceC3419q mo157683d(LongLinkMessage.Msg msg) throws InvalidProtocolBufferException;

    /* JADX INFO: renamed from: f */
    LongLinkMessage.MsgTypeEnum mo94756f();
}
