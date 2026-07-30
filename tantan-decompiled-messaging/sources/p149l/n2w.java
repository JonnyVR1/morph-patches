package p149l;

import androidx.annotation.Nullable;
import com.google.protobuf.InterfaceC3419q;
import com.google.protobuf.InvalidProtocolBufferException;
import com.p046p1.mobile.longlink.msg.connector.LongLinkMessage;

/* JADX INFO: loaded from: classes9.dex */
@Deprecated
public abstract class n2w<T extends InterfaceC3419q> implements sul<T> {
    @Override // p149l.sul
    @Nullable
    /* JADX INFO: renamed from: c */
    public String mo94754c() {
        return null;
    }

    @Override // p149l.sul
    /* JADX INFO: renamed from: d */
    public InterfaceC3419q mo157683d(LongLinkMessage.Msg msg) throws InvalidProtocolBufferException {
        return li60.m149879b(mo94398b(), msg.getData());
    }
}
