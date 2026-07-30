package kotlin.jvm.internal;

import kotlin.SinceKotlin;
import kotlin.reflect.KCallable;
import kotlin.reflect.KProperty1;

/* JADX INFO: loaded from: classes2.dex */
public abstract class PropertyReference1 extends PropertyReference implements KProperty1 {
    public PropertyReference1() {
    }

    @Override // kotlin.jvm.internal.CallableReference
    public KCallable computeReflected() {
        return Reflection.m88403i(this);
    }

    public abstract /* synthetic */ Object get(Object obj);

    @Override // kotlin.reflect.KProperty1
    @SinceKotlin
    public Object getDelegate(Object obj) {
        return ((KProperty1) getReflected()).getDelegate(obj);
    }

    @Override // kotlin.jvm.internal.PropertyReference, kotlin.reflect.KProperty
    /* JADX INFO: renamed from: getGetter */
    public KProperty1.Getter mo88810h0() {
        return ((KProperty1) getReflected()).mo88810h0();
    }

    @Override // kotlin.jvm.functions.Function1
    public Object invoke(Object obj) {
        return get(obj);
    }

    @SinceKotlin
    public PropertyReference1(Object obj) {
        super(obj);
    }

    @SinceKotlin
    public PropertyReference1(Object obj, Class cls, String str, String str2, int i) {
        super(obj, cls, str, str2, i);
    }
}
