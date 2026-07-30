package p006l;

import androidx.annotation.Nullable;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.q;
import com.p1.mobile.longlink.msg.connector.LongLinkMessage;
import l.li60;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
@Deprecated
public abstract class n2w<T extends q> implements sul<T> {
    @Override // p006l.sul
    @Nullable
    /* JADX INFO: renamed from: c */
    public String mo11744c() {
        return null;
    }

    @Override // p006l.sul
    /* JADX INFO: renamed from: d */
    public q mo19642d(LongLinkMessage.Msg msg) throws InvalidProtocolBufferException {
        return li60.b(mo11743b(), msg.getData());
    }
}
