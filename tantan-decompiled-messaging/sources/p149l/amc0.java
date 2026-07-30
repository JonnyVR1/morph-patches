package p149l;

import com.facebook.common.references.SharedReference;

/* JADX INFO: loaded from: classes.dex */
public class amc0<T> extends fa5<T> {
    public amc0(T t, twc0<T> twc0Var, fa5.InterfaceC16786c interfaceC16786c, Throwable th) {
        super(t, twc0Var, interfaceC16786c, th, false);
    }

    @Override // p149l.fa5
    /* JADX INFO: renamed from: m */
    public fa5<T> clone() {
        rf80.m179118i(mo120157N());
        return new amc0(this.f96566b, this.f96567c, this.f96568d);
    }

    public amc0(SharedReference<T> sharedReference, fa5.InterfaceC16786c interfaceC16786c, Throwable th) {
        super(sharedReference, interfaceC16786c, th);
    }
}
