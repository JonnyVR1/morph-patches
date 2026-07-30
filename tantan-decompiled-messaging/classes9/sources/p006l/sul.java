package p006l;

import androidx.annotation.Nullable;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.q;
import com.p1.mobile.longlink.msg.connector.LongLinkMessage;
import l.ki60;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public interface sul<T> {
    /* JADX INFO: renamed from: a */
    boolean mo16452a(q qVar, ki60 ki60Var);

    /* JADX INFO: renamed from: b */
    Class<T> mo11743b();

    @Nullable
    /* JADX INFO: renamed from: c */
    String mo11744c();

    /* JADX INFO: renamed from: d */
    q mo19642d(LongLinkMessage.Msg msg) throws InvalidProtocolBufferException;

    /* JADX INFO: renamed from: f */
    LongLinkMessage.MsgTypeEnum mo11746f();
}
