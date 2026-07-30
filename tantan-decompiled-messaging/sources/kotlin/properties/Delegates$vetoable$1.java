package kotlin.properties;

import com.clevertap.android.sdk.Constants;
import kotlin.Metadata;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KProperty;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m87231d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J+\u0010\u0007\u001a\u00020\u00062\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u00022\u0006\u0010\u0004\u001a\u00028\u00002\u0006\u0010\u0005\u001a\u00028\u0000H\u0014¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, m87232d2 = {"kotlin/properties/Delegates$vetoable$1", "Lkotlin/properties/ObservableProperty;", "Lkotlin/reflect/KProperty;", "property", Constants.KEY_OLD_VALUE, Constants.KEY_NEW_VALUE, "", Constants.INAPP_DATA_TAG, "(Lkotlin/reflect/KProperty;Ljava/lang/Object;Ljava/lang/Object;)Z", "kotlin-stdlib"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 176)
@SourceDebugExtension
public final class Delegates$vetoable$1 extends ObservableProperty<Object> {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Function3<KProperty<?>, Object, Object, Boolean> f63531b;

    @Override // kotlin.properties.ObservableProperty
    /* JADX INFO: renamed from: d */
    public boolean mo87563d(KProperty<?> property, Object oldValue, Object newValue) {
        property.getClass();
        return this.f63531b.invoke(property, oldValue, newValue).booleanValue();
    }
}
