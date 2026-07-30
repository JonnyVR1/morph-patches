package p149l;

import androidx.lifecycle.C0490t;
import com.clevertap.android.sdk.Constants;
import com.google.android.libraries.places.api.model.PlaceTypes;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KClass;
import org.aspectj.lang.JoinPoint;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m87231d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ1\u0010\u0010\u001a\u00028\u0000\"\b\b\u0000\u0010\u000b*\u00020\n2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000eH\u0000¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u001a\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0019¨\u0006\u001b"}, m87232d2 = {"Ll/lcl0;", "", "Ll/ocl0;", PlaceTypes.STORE, "Landroidx/lifecycle/t$c;", "factory", "Ll/otb;", "defaultExtras", "<init>", "(Ll/ocl0;Landroidx/lifecycle/t$c;Ll/otb;)V", "Ll/jcl0;", j6f.GPS_DIRECTION_TRUE, "Lkotlin/reflect/KClass;", "modelClass", "", Constants.KEY_KEY, Constants.INAPP_DATA_TAG, "(Lkotlin/reflect/KClass;Ljava/lang/String;)Ll/jcl0;", "a", "Ll/ocl0;", "b", "Landroidx/lifecycle/t$c;", "c", "Ll/otb;", "Ll/hgh0;", "Ll/hgh0;", JoinPoint.SYNCHRONIZATION_LOCK, "lifecycle-viewmodel_release"}, m87233k = 1, m87234mv = {2, 0, 0}, m87236xi = 48)
@SourceDebugExtension
public final class lcl0 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final ocl0 store;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final C0490t.c factory;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public final otb defaultExtras;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public final hgh0 lock;

    public lcl0(@NotNull ocl0 ocl0Var, @NotNull C0490t.c cVar, @NotNull otb otbVar) {
        ocl0Var.getClass();
        cVar.getClass();
        otbVar.getClass();
        this.store = ocl0Var;
        this.factory = cVar;
        this.defaultExtras = otbVar;
        this.lock = new hgh0();
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ jcl0 m149333e(lcl0 lcl0Var, KClass kClass, String str, int i, Object obj) {
        if ((i & 2) != 0) {
            str = ncl0.INSTANCE.m158956c(kClass);
        }
        return lcl0Var.m149334d(kClass, str);
    }

    @NotNull
    /* JADX INFO: renamed from: d */
    public final <T extends jcl0> T m149334d(@NotNull KClass<T> modelClass, @NotNull String key) {
        T t;
        modelClass.getClass();
        key.getClass();
        synchronized (this.lock) {
            try {
                t = (T) this.store.m163535b(key);
                if (modelClass.isInstance(t)) {
                    if (this.factory instanceof C0490t.e) {
                        C0490t.e eVar = (C0490t.e) this.factory;
                        t.getClass();
                        eVar.mo3065a(t);
                    }
                    t.getClass();
                } else {
                    jt10 jt10Var = new jt10(this.defaultExtras);
                    jt10Var.m143071c(C0490t.f2341b, key);
                    t = (T) mcl0.m154019a(this.factory, modelClass, jt10Var);
                    this.store.m163537d(key, t);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return t;
    }
}
