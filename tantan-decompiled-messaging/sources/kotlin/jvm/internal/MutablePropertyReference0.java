package kotlin.jvm.internal;

import kotlin.SinceKotlin;
import kotlin.reflect.KCallable;
import kotlin.reflect.KMutableProperty0;
import kotlin.reflect.KProperty0;

/* JADX INFO: loaded from: classes2.dex */
public abstract class MutablePropertyReference0 extends MutablePropertyReference implements KMutableProperty0 {
    public MutablePropertyReference0() {
    }

    @Override // kotlin.jvm.internal.CallableReference
    public KCallable computeReflected() {
        return Reflection.m87509d(this);
    }

    public abstract /* synthetic */ Object get();

    @Override // kotlin.reflect.KProperty0
    @SinceKotlin
    public Object getDelegate() {
        return ((KMutableProperty0) getReflected()).getDelegate();
    }

    @Override // kotlin.jvm.internal.MutablePropertyReference, kotlin.jvm.internal.PropertyReference, kotlin.reflect.KProperty
    /* JADX INFO: renamed from: getGetter */
    public KProperty0.Getter mo87919h0() {
        return ((KMutableProperty0) getReflected()).mo87919h0();
    }

    @Override // kotlin.jvm.internal.MutablePropertyReference, kotlin.reflect.KMutableProperty
    public KMutableProperty0.Setter getSetter() {
        return ((KMutableProperty0) getReflected()).getSetter();
    }

    @Override // kotlin.jvm.functions.Function0
    public Object invoke() {
        return get();
    }

    public abstract /* synthetic */ void set(Object obj);

    @SinceKotlin
    public MutablePropertyReference0(Object obj) {
        super(obj);
    }

    @SinceKotlin
    public MutablePropertyReference0(Object obj, Class cls, String str, String str2, int i) {
        super(obj, cls, str, str2, i);
    }
}
