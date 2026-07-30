package kotlin.jvm.internal;

import kotlin.SinceKotlin;
import kotlin.reflect.KCallable;
import kotlin.reflect.KMutableProperty2;
import kotlin.reflect.KProperty2;

/* JADX INFO: loaded from: classes2.dex */
public abstract class MutablePropertyReference2 extends MutablePropertyReference implements KMutableProperty2 {
    @SinceKotlin
    public MutablePropertyReference2(Class cls, String str, String str2, int i) {
        super(CallableReference.NO_RECEIVER, cls, str, str2, i);
    }

    @Override // kotlin.jvm.internal.CallableReference
    public KCallable computeReflected() {
        return Reflection.m88400f(this);
    }

    public abstract /* synthetic */ Object get(Object obj, Object obj2);

    @Override // kotlin.reflect.KProperty2
    @SinceKotlin
    public Object getDelegate(Object obj, Object obj2) {
        return ((KMutableProperty2) getReflected()).getDelegate(obj, obj2);
    }

    @Override // kotlin.jvm.internal.MutablePropertyReference, kotlin.jvm.internal.PropertyReference, kotlin.reflect.KProperty
    /* JADX INFO: renamed from: getGetter */
    public KProperty2.Getter mo88810h0() {
        return ((KMutableProperty2) getReflected()).mo88810h0();
    }

    @Override // kotlin.jvm.internal.MutablePropertyReference, kotlin.reflect.KMutableProperty
    public KMutableProperty2.Setter getSetter() {
        return ((KMutableProperty2) getReflected()).getSetter();
    }

    @Override // kotlin.jvm.functions.Function2
    public Object invoke(Object obj, Object obj2) {
        return get(obj, obj2);
    }

    public abstract /* synthetic */ void set(Object obj, Object obj2, Object obj3);

    public MutablePropertyReference2() {
    }
}
