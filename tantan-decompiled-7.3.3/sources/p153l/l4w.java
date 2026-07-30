package p153l;

import androidx.annotation.Nullable;
import com.google.protobuf.InterfaceC3442q;
import com.google.protobuf.InvalidProtocolBufferException;
import com.p051p1.mobile.longlink.msg.connector.LongLinkMessage;

/* JADX INFO: loaded from: classes9.dex */
@Deprecated
public abstract class l4w<T extends InterfaceC3442q> implements fxl<T> {
    @Override // p153l.fxl
    @Nullable
    /* JADX INFO: renamed from: c */
    public String mo96253c() {
        return null;
    }

    @Override // p153l.fxl
    /* JADX INFO: renamed from: d */
    public InterfaceC3442q mo127983d(LongLinkMessage.Msg msg) throws InvalidProtocolBufferException {
        return qq60.m177481b(mo95510b(), msg.getData());
    }
}
