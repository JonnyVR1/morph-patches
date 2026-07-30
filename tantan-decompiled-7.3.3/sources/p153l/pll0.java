package p153l;

import androidx.lifecycle.C0491t;
import com.clevertap.android.sdk.Constants;
import com.google.android.libraries.places.api.model.PlaceTypes;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KClass;
import org.aspectj.lang.JoinPoint;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m88120d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ1\u0010\u0010\u001a\u00028\u0000\"\b\b\u0000\u0010\u000b*\u00020\n2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000eH\u0000¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u001a\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0019¨\u0006\u001b"}, m88121d2 = {"Ll/pll0;", "", "Ll/sll0;", PlaceTypes.STORE, "Landroidx/lifecycle/t$c;", "factory", "Ll/cvb;", "defaultExtras", "<init>", "(Ll/sll0;Landroidx/lifecycle/t$c;Ll/cvb;)V", "Ll/nll0;", p7f.GPS_DIRECTION_TRUE, "Lkotlin/reflect/KClass;", "modelClass", "", Constants.KEY_KEY, Constants.INAPP_DATA_TAG, "(Lkotlin/reflect/KClass;Ljava/lang/String;)Ll/nll0;", "a", "Ll/sll0;", "b", "Landroidx/lifecycle/t$c;", "c", "Ll/cvb;", "Ll/ooh0;", "Ll/ooh0;", JoinPoint.SYNCHRONIZATION_LOCK, "lifecycle-viewmodel_release"}, m88122k = 1, m88123mv = {2, 0, 0}, m88125xi = 48)
@SourceDebugExtension
public final class pll0 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final sll0 store;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final C0491t.c factory;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public final cvb defaultExtras;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public final ooh0 lock;

    public pll0(@NotNull sll0 sll0Var, @NotNull C0491t.c cVar, @NotNull cvb cvbVar) {
        sll0Var.getClass();
        cVar.getClass();
        cvbVar.getClass();
        this.store = sll0Var;
        this.factory = cVar;
        this.defaultExtras = cvbVar;
        this.lock = new ooh0();
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ nll0 m172836e(pll0 pll0Var, KClass kClass, String str, int i, Object obj) {
        if ((i & 2) != 0) {
            str = rll0.INSTANCE.m182017c(kClass);
        }
        return pll0Var.m172837d(kClass, str);
    }

    @NotNull
    /* JADX INFO: renamed from: d */
    public final <T extends nll0> T m172837d(@NotNull KClass<T> modelClass, @NotNull String key) {
        T t;
        modelClass.getClass();
        key.getClass();
        synchronized (this.lock) {
            try {
                t = (T) this.store.m186597b(key);
                if (modelClass.isInstance(t)) {
                    if (this.factory instanceof C0491t.e) {
                        C0491t.e eVar = (C0491t.e) this.factory;
                        t.getClass();
                        eVar.mo3066a(t);
                    }
                    t.getClass();
                } else {
                    r120 r120Var = new r120(this.defaultExtras);
                    r120Var.m179322c(C0491t.f2341b, key);
                    t = (T) qll0.m177005a(this.factory, modelClass, r120Var);
                    this.store.m186599d(key, t);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return t;
    }
}
