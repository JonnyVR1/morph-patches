package kotlin.jvm.internal;

import kotlin.SinceKotlin;
import kotlin.reflect.KCallable;
import kotlin.reflect.KProperty0;

/* JADX INFO: loaded from: classes2.dex */
public abstract class PropertyReference0 extends PropertyReference implements KProperty0 {
    public PropertyReference0() {
    }

    @Override // kotlin.jvm.internal.CallableReference
    public KCallable computeReflected() {
        return Reflection.m88402h(this);
    }

    public abstract /* synthetic */ Object get();

    @Override // kotlin.reflect.KProperty0
    @SinceKotlin
    public Object getDelegate() {
        return ((KProperty0) getReflected()).getDelegate();
    }

    @Override // kotlin.jvm.internal.PropertyReference, kotlin.reflect.KProperty
    /* JADX INFO: renamed from: getGetter */
    public KProperty0.Getter mo88810h0() {
        return ((KProperty0) getReflected()).mo88810h0();
    }

    @Override // kotlin.jvm.functions.Function0
    public Object invoke() {
        return get();
    }

    @SinceKotlin
    public PropertyReference0(Object obj) {
        super(obj);
    }

    @SinceKotlin
    public PropertyReference0(Object obj, Class cls, String str, String str2, int i) {
        super(obj, cls, str, str2, i);
    }
}
