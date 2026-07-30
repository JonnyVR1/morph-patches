package kotlin.jvm.internal;

import kotlin.SinceKotlin;
import kotlin.reflect.KCallable;
import kotlin.reflect.KMutableProperty1;
import kotlin.reflect.KProperty1;

/* JADX INFO: loaded from: classes2.dex */
public abstract class MutablePropertyReference1 extends MutablePropertyReference implements KMutableProperty1 {
    public MutablePropertyReference1() {
    }

    @Override // kotlin.jvm.internal.CallableReference
    public KCallable computeReflected() {
        return Reflection.m88399e(this);
    }

    public abstract /* synthetic */ Object get(Object obj);

    @Override // kotlin.reflect.KProperty1
    @SinceKotlin
    public Object getDelegate(Object obj) {
        return ((KMutableProperty1) getReflected()).getDelegate(obj);
    }

    @Override // kotlin.jvm.internal.MutablePropertyReference, kotlin.jvm.internal.PropertyReference, kotlin.reflect.KProperty
    /* JADX INFO: renamed from: getGetter */
    public KProperty1.Getter mo88810h0() {
        return ((KMutableProperty1) getReflected()).mo88810h0();
    }

    @Override // kotlin.jvm.internal.MutablePropertyReference, kotlin.reflect.KMutableProperty
    public KMutableProperty1.Setter getSetter() {
        return ((KMutableProperty1) getReflected()).getSetter();
    }

    @Override // kotlin.jvm.functions.Function1
    public Object invoke(Object obj) {
        return get(obj);
    }

    public abstract /* synthetic */ void set(Object obj, Object obj2);

    @SinceKotlin
    public MutablePropertyReference1(Object obj) {
        super(obj);
    }

    @SinceKotlin
    public MutablePropertyReference1(Object obj, Class cls, String str, String str2, int i) {
        super(obj, cls, str, str2, i);
    }
}
