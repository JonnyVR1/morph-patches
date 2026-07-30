package kotlin.jvm.internal;

import kotlin.SinceKotlin;
import kotlin.reflect.KCallable;
import kotlin.reflect.KProperty2;

/* JADX INFO: loaded from: classes2.dex */
public abstract class PropertyReference2 extends PropertyReference implements KProperty2 {
    @SinceKotlin
    public PropertyReference2(Class cls, String str, String str2, int i) {
        super(CallableReference.NO_RECEIVER, cls, str, str2, i);
    }

    @Override // kotlin.jvm.internal.CallableReference
    public KCallable computeReflected() {
        return Reflection.m87515j(this);
    }

    public abstract /* synthetic */ Object get(Object obj, Object obj2);

    @Override // kotlin.reflect.KProperty2
    @SinceKotlin
    public Object getDelegate(Object obj, Object obj2) {
        return ((KProperty2) getReflected()).getDelegate(obj, obj2);
    }

    @Override // kotlin.jvm.internal.PropertyReference, kotlin.reflect.KProperty
    /* JADX INFO: renamed from: getGetter */
    public KProperty2.Getter mo87919h0() {
        return ((KProperty2) getReflected()).mo87919h0();
    }

    @Override // kotlin.jvm.functions.Function2
    public Object invoke(Object obj, Object obj2) {
        return get(obj, obj2);
    }

    public PropertyReference2() {
    }
}
