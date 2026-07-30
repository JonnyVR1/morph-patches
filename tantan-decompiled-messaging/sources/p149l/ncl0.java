package p149l;

import androidx.lifecycle.C0490t;
import androidx.lifecycle.InterfaceC0475e;
import com.clevertap.android.sdk.Constants;
import com.p046p1.mobile.putong.data.Owner;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KClass;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m87231d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b\"\b\b\u0000\u0010\u0005*\u00020\u00042\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006H\u0000¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\f\u001a\u00028\u0000\"\b\b\u0000\u0010\u000b*\u00020\u0004H\u0000¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000eH\u0000¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u000f\u001a\u00020\u000eH\u0000¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, m87232d2 = {"Ll/ncl0;", "", "<init>", "()V", "Ll/jcl0;", j6f.GPS_DIRECTION_TRUE, "Lkotlin/reflect/KClass;", "modelClass", "", "c", "(Lkotlin/reflect/KClass;)Ljava/lang/String;", "VM", Constants.INAPP_DATA_TAG, "()Ll/jcl0;", "Ll/pcl0;", Owner.TYPE, "Landroidx/lifecycle/t$c;", "b", "(Ll/pcl0;)Landroidx/lifecycle/t$c;", "Ll/otb;", "a", "(Ll/pcl0;)Ll/otb;", "lifecycle-viewmodel_release"}, m87233k = 1, m87234mv = {2, 0, 0}, m87236xi = 48)
@SourceDebugExtension
public final class ncl0 {

    @NotNull
    public static final ncl0 INSTANCE = new ncl0();

    @NotNull
    /* JADX INFO: renamed from: a */
    public final otb m158954a(@NotNull pcl0 owner) {
        owner.getClass();
        return owner instanceof InterfaceC0475e ? ((InterfaceC0475e) owner).getDefaultViewModelCreationExtras() : otb.C19033b.INSTANCE;
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public final C0490t.c m158955b(@NotNull pcl0 owner) {
        owner.getClass();
        return owner instanceof InterfaceC0475e ? ((InterfaceC0475e) owner).getDefaultViewModelProviderFactory() : esd.INSTANCE;
    }

    @NotNull
    /* JADX INFO: renamed from: c */
    public final <T extends jcl0> String m158956c(@NotNull KClass<T> modelClass) {
        modelClass.getClass();
        String strM149629a = lf4.m149629a(modelClass);
        if (strM149629a != null) {
            return "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strM149629a);
        }
        ig3.m135964a("Local and anonymous classes can not be ViewModels");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: d */
    public final <VM extends jcl0> VM m158957d() {
        throw new UnsupportedOperationException("`Factory.create(String, CreationExtras)` is not implemented. You may need to override the method and provide a custom implementation. Note that using `Factory.create(String)` is not supported and considered an error.");
    }
}
