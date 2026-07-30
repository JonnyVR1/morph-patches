package androidx.lifecycle;

import android.annotation.SuppressLint;
import android.app.Application;
import android.os.Bundle;
import androidx.annotation.RestrictTo;
import androidx.savedstate.C0679a;
import com.alibaba.sdk.android.oss.common.RequestParameters;
import com.clevertap.android.sdk.Constants;
import com.cosmos.photon.push.service.PushService;
import com.p051p1.mobile.putong.data.Owner;
import java.lang.reflect.Constructor;
import kotlin.Metadata;
import kotlin.jvm.JvmClassMappingKt;
import kotlin.reflect.KClass;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p153l.cvb;
import p153l.nll0;
import p153l.p7f;
import p153l.pr3;
import p153l.ryd0;
import p153l.syd0;
import p153l.wg3;
import p153l.wtq0;

/* JADX INFO: renamed from: androidx.lifecycle.r */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m88120d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0016¢\u0006\u0004\b\u0003\u0010\u0004B%\b\u0017\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0003\u0010\u000bJ/\u0010\u0012\u001a\u00028\u0000\"\b\b\u0000\u0010\r*\u00020\f2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J/\u0010\u0012\u001a\u00028\u0000\"\b\b\u0000\u0010\r*\u00020\f2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u00142\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0012\u0010\u0015J-\u0010\u0018\u001a\u00028\u0000\"\b\b\u0000\u0010\r*\u00020\f2\u0006\u0010\u0017\u001a\u00020\u00162\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0014¢\u0006\u0004\b\u0018\u0010\u0019J'\u0010\u0012\u001a\u00028\u0000\"\b\b\u0000\u0010\r*\u00020\f2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0014H\u0016¢\u0006\u0004\b\u0012\u0010\u001aJ\u0017\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001b\u001a\u00020\fH\u0017¢\u0006\u0004\b\u001d\u0010\u001eR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001fR\u0014\u0010!\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010 R\u0018\u0010\n\u001a\u0004\u0018\u00010\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010#R\u0018\u0010'\u001a\u0004\u0018\u00010$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010&R\u0018\u0010+\u001a\u0004\u0018\u00010(8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010*¨\u0006,"}, m88121d2 = {"Landroidx/lifecycle/r;", "Landroidx/lifecycle/t$e;", "Landroidx/lifecycle/t$c;", "<init>", "()V", "Landroid/app/Application;", "application", "Ll/ryd0;", Owner.TYPE, "Landroid/os/Bundle;", "defaultArgs", "(Landroid/app/Application;Ll/ryd0;Landroid/os/Bundle;)V", "Ll/nll0;", p7f.GPS_DIRECTION_TRUE, "Lkotlin/reflect/KClass;", "modelClass", "Ll/cvb;", "extras", PushService.COMMAND_CREATE, "(Lkotlin/reflect/KClass;Ll/cvb;)Ll/nll0;", "Ljava/lang/Class;", "(Ljava/lang/Class;Ll/cvb;)Ll/nll0;", "", Constants.KEY_KEY, "b", "(Ljava/lang/String;Ljava/lang/Class;)Ll/nll0;", "(Ljava/lang/Class;)Ll/nll0;", "viewModel", "", "a", "(Ll/nll0;)V", "Landroid/app/Application;", "Landroidx/lifecycle/t$c;", "factory", "c", "Landroid/os/Bundle;", "Landroidx/lifecycle/Lifecycle;", Constants.INAPP_DATA_TAG, "Landroidx/lifecycle/Lifecycle;", RequestParameters.SUBRESOURCE_LIFECYCLE, "Landroidx/savedstate/a;", "e", "Landroidx/savedstate/a;", "savedStateRegistry", "lifecycle-viewmodel-savedstate_release"}, m88122k = 1, m88123mv = {2, 0, 0}, m88125xi = 48)
public final class C0489r extends C0491t.e implements C0491t.c {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @Nullable
    public Application application;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final C0491t.c factory;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @Nullable
    public Bundle defaultArgs;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @Nullable
    public Lifecycle lifecycle;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @Nullable
    public C0679a savedStateRegistry;

    @SuppressLint({"LambdaLast"})
    public C0489r(@Nullable Application application, @NotNull ryd0 ryd0Var, @Nullable Bundle bundle) {
        ryd0Var.getClass();
        this.savedStateRegistry = ryd0Var.getSavedStateRegistry();
        this.lifecycle = ryd0Var.getLifecycle();
        this.defaultArgs = bundle;
        this.application = application;
        this.factory = application != null ? C0491t.a.INSTANCE.m3080a(application) : new C0491t.a();
    }

    @Override // androidx.lifecycle.C0491t.e
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* JADX INFO: renamed from: a */
    public void mo3066a(@NotNull nll0 viewModel) {
        viewModel.getClass();
        if (this.lifecycle != null) {
            C0679a c0679a = this.savedStateRegistry;
            c0679a.getClass();
            Lifecycle lifecycle = this.lifecycle;
            lifecycle.getClass();
            LegacySavedStateHandleController.m2963a(viewModel, c0679a, lifecycle);
        }
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public final <T extends nll0> T m3067b(@NotNull String key, @NotNull Class<T> modelClass) {
        T t;
        Application application;
        key.getClass();
        modelClass.getClass();
        Lifecycle lifecycle = this.lifecycle;
        if (lifecycle == null) {
            pr3.m173429a("SavedStateViewModelFactory constructed with empty constructor supports only calls to create(modelClass: Class<T>, extras: CreationExtras).");
            return null;
        }
        boolean zIsAssignableFrom = AndroidViewModel.class.isAssignableFrom(modelClass);
        Constructor constructorM188539c = (!zIsAssignableFrom || this.application == null) ? syd0.m188539c(modelClass, syd0.f171230b) : syd0.m188539c(modelClass, syd0.f171229a);
        if (constructorM188539c == null) {
            return this.application != null ? (T) this.factory.create(modelClass) : (T) C0491t.d.INSTANCE.m3085a().create(modelClass);
        }
        C0679a c0679a = this.savedStateRegistry;
        c0679a.getClass();
        SavedStateHandleController savedStateHandleControllerM2964b = LegacySavedStateHandleController.m2964b(c0679a, lifecycle, key, this.defaultArgs);
        if (!zIsAssignableFrom || (application = this.application) == null) {
            t = (T) syd0.m188540d(modelClass, constructorM188539c, savedStateHandleControllerM2964b.getHandle());
        } else {
            application.getClass();
            t = (T) syd0.m188540d(modelClass, constructorM188539c, application, savedStateHandleControllerM2964b.getHandle());
        }
        t.addCloseable("androidx.lifecycle.savedstate.vm.tag", savedStateHandleControllerM2964b);
        return t;
    }

    @Override // androidx.lifecycle.C0491t.c
    @NotNull
    public <T extends nll0> T create(@NotNull Class<T> modelClass, @NotNull cvb extras) {
        modelClass.getClass();
        extras.getClass();
        String str = (String) extras.mo112786a(C0491t.f2341b);
        if (str == null) {
            wtq0.m207906a("VIEW_MODEL_KEY must always be provided by ViewModelProvider");
            return null;
        }
        if (extras.mo112786a(C0488q.f2327a) == null || extras.mo112786a(C0488q.f2328b) == null) {
            if (this.lifecycle != null) {
                return (T) m3067b(str, modelClass);
            }
            wtq0.m207906a("SAVED_STATE_REGISTRY_OWNER_KEY andVIEW_MODEL_STORE_OWNER_KEY must be provided in the creation extras tosuccessfully create a ViewModel.");
            return null;
        }
        Application application = (Application) extras.mo112786a(C0491t.a.f2344e);
        boolean zIsAssignableFrom = AndroidViewModel.class.isAssignableFrom(modelClass);
        Constructor constructorM188539c = (!zIsAssignableFrom || application == null) ? syd0.m188539c(modelClass, syd0.f171230b) : syd0.m188539c(modelClass, syd0.f171229a);
        if (constructorM188539c == null) {
            return (T) this.factory.create(modelClass, extras);
        }
        return (!zIsAssignableFrom || application == null) ? (T) syd0.m188540d(modelClass, constructorM188539c, C0488q.m3062a(extras)) : (T) syd0.m188540d(modelClass, constructorM188539c, application, C0488q.m3062a(extras));
    }

    public C0489r() {
        this.factory = new C0491t.a();
    }

    @Override // androidx.lifecycle.C0491t.c
    @NotNull
    public <T extends nll0> T create(@NotNull KClass<T> modelClass, @NotNull cvb extras) {
        modelClass.getClass();
        extras.getClass();
        return (T) create(JvmClassMappingKt.m88341b(modelClass), extras);
    }

    @Override // androidx.lifecycle.C0491t.c
    @NotNull
    public <T extends nll0> T create(@NotNull Class<T> modelClass) {
        modelClass.getClass();
        String canonicalName = modelClass.getCanonicalName();
        if (canonicalName != null) {
            return (T) m3067b(canonicalName, modelClass);
        }
        wg3.m206174a("Local and anonymous classes can not be ViewModels");
        return null;
    }
}
