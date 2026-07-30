package kotlin.jvm.internal;

import kotlin.SinceKotlin;
import kotlin.reflect.KMutableProperty;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public abstract class MutablePropertyReference extends PropertyReference implements KMutableProperty {
    public MutablePropertyReference() {
    }

    @Override // kotlin.jvm.internal.PropertyReference, kotlin.reflect.KProperty
    @NotNull
    /* JADX INFO: renamed from: getGetter */
    public abstract /* synthetic */ KProperty.Getter mo88810h0();

    @Override // kotlin.reflect.KMutableProperty
    @NotNull
    public abstract /* synthetic */ KMutableProperty.Setter getSetter();

    @SinceKotlin
    public MutablePropertyReference(Object obj) {
        super(obj);
    }

    @SinceKotlin
    public MutablePropertyReference(Object obj, Class cls, String str, String str2, int i) {
        super(obj, cls, str, str2, i);
    }
}
