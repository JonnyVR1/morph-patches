package p153l;

import com.facebook.common.references.SharedReference;

/* JADX INFO: loaded from: classes.dex */
public class huc0<T> extends fb5<T> {
    public huc0(T t, w4d0<T> w4d0Var, fb5.InterfaceC16935c interfaceC16935c, Throwable th) {
        super(t, w4d0Var, interfaceC16935c, th, false);
    }

    @Override // p153l.fb5
    /* JADX INFO: renamed from: m */
    public fb5<T> clone() {
        wn80.m207184i(mo124877N());
        return new huc0(this.f98046b, this.f98047c, this.f98048d);
    }

    public huc0(SharedReference<T> sharedReference, fb5.InterfaceC16935c interfaceC16935c, Throwable th) {
        super(sharedReference, interfaceC16935c, th);
    }
}
