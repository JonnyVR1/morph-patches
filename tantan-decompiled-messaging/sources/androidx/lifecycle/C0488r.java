package androidx.lifecycle;

import android.annotation.SuppressLint;
import android.app.Application;
import android.os.Bundle;
import androidx.annotation.RestrictTo;
import androidx.savedstate.C0677a;
import com.alibaba.sdk.android.oss.common.RequestParameters;
import com.clevertap.android.sdk.Constants;
import com.cosmos.photon.push.service.PushService;
import com.p046p1.mobile.putong.data.Owner;
import java.lang.reflect.Constructor;
import kotlin.Metadata;
import kotlin.jvm.JvmClassMappingKt;
import kotlin.reflect.KClass;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p149l.ig3;
import p149l.j6f;
import p149l.jcl0;
import p149l.otb;
import p149l.pqd0;
import p149l.qkq0;
import p149l.qq3;
import p149l.qqd0;

/* JADX INFO: renamed from: androidx.lifecycle.r */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m87231d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0016¢\u0006\u0004\b\u0003\u0010\u0004B%\b\u0017\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0003\u0010\u000bJ/\u0010\u0012\u001a\u00028\u0000\"\b\b\u0000\u0010\r*\u00020\f2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J/\u0010\u0012\u001a\u00028\u0000\"\b\b\u0000\u0010\r*\u00020\f2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u00142\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0012\u0010\u0015J-\u0010\u0018\u001a\u00028\u0000\"\b\b\u0000\u0010\r*\u00020\f2\u0006\u0010\u0017\u001a\u00020\u00162\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0014¢\u0006\u0004\b\u0018\u0010\u0019J'\u0010\u0012\u001a\u00028\u0000\"\b\b\u0000\u0010\r*\u00020\f2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0014H\u0016¢\u0006\u0004\b\u0012\u0010\u001aJ\u0017\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001b\u001a\u00020\fH\u0017¢\u0006\u0004\b\u001d\u0010\u001eR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001fR\u0014\u0010!\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010 R\u0018\u0010\n\u001a\u0004\u0018\u00010\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010#R\u0018\u0010'\u001a\u0004\u0018\u00010$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010&R\u0018\u0010+\u001a\u0004\u0018\u00010(8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010*¨\u0006,"}, m87232d2 = {"Landroidx/lifecycle/r;", "Landroidx/lifecycle/t$e;", "Landroidx/lifecycle/t$c;", "<init>", "()V", "Landroid/app/Application;", "application", "Ll/pqd0;", Owner.TYPE, "Landroid/os/Bundle;", "defaultArgs", "(Landroid/app/Application;Ll/pqd0;Landroid/os/Bundle;)V", "Ll/jcl0;", j6f.GPS_DIRECTION_TRUE, "Lkotlin/reflect/KClass;", "modelClass", "Ll/otb;", "extras", PushService.COMMAND_CREATE, "(Lkotlin/reflect/KClass;Ll/otb;)Ll/jcl0;", "Ljava/lang/Class;", "(Ljava/lang/Class;Ll/otb;)Ll/jcl0;", "", Constants.KEY_KEY, "b", "(Ljava/lang/String;Ljava/lang/Class;)Ll/jcl0;", "(Ljava/lang/Class;)Ll/jcl0;", "viewModel", "", "a", "(Ll/jcl0;)V", "Landroid/app/Application;", "Landroidx/lifecycle/t$c;", "factory", "c", "Landroid/os/Bundle;", "Landroidx/lifecycle/Lifecycle;", Constants.INAPP_DATA_TAG, "Landroidx/lifecycle/Lifecycle;", RequestParameters.SUBRESOURCE_LIFECYCLE, "Landroidx/savedstate/a;", "e", "Landroidx/savedstate/a;", "savedStateRegistry", "lifecycle-viewmodel-savedstate_release"}, m87233k = 1, m87234mv = {2, 0, 0}, m87236xi = 48)
public final class C0488r extends C0490t.e implements C0490t.c {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @Nullable
    public Application application;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final C0490t.c factory;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @Nullable
    public Bundle defaultArgs;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @Nullable
    public Lifecycle lifecycle;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @Nullable
    public C0677a savedStateRegistry;

    @SuppressLint({"LambdaLast"})
    public C0488r(@Nullable Application application, @NotNull pqd0 pqd0Var, @Nullable Bundle bundle) {
        pqd0Var.getClass();
        this.savedStateRegistry = pqd0Var.getSavedStateRegistry();
        this.lifecycle = pqd0Var.getLifecycle();
        this.defaultArgs = bundle;
        this.application = application;
        this.factory = application != null ? C0490t.a.INSTANCE.m3079a(application) : new C0490t.a();
    }

    @Override // androidx.lifecycle.C0490t.e
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* JADX INFO: renamed from: a */
    public void mo3065a(@NotNull jcl0 viewModel) {
        viewModel.getClass();
        if (this.lifecycle != null) {
            C0677a c0677a = this.savedStateRegistry;
            c0677a.getClass();
            Lifecycle lifecycle = this.lifecycle;
            lifecycle.getClass();
            LegacySavedStateHandleController.m2962a(viewModel, c0677a, lifecycle);
        }
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public final <T extends jcl0> T m3066b(@NotNull String key, @NotNull Class<T> modelClass) {
        T t;
        Application application;
        key.getClass();
        modelClass.getClass();
        Lifecycle lifecycle = this.lifecycle;
        if (lifecycle == null) {
            qq3.m175877a("SavedStateViewModelFactory constructed with empty constructor supports only calls to create(modelClass: Class<T>, extras: CreationExtras).");
            return null;
        }
        boolean zIsAssignableFrom = AndroidViewModel.class.isAssignableFrom(modelClass);
        Constructor constructorM175905c = (!zIsAssignableFrom || this.application == null) ? qqd0.m175905c(modelClass, qqd0.f155883b) : qqd0.m175905c(modelClass, qqd0.f155882a);
        if (constructorM175905c == null) {
            return this.application != null ? (T) this.factory.create(modelClass) : (T) C0490t.d.INSTANCE.m3084a().create(modelClass);
        }
        C0677a c0677a = this.savedStateRegistry;
        c0677a.getClass();
        SavedStateHandleController savedStateHandleControllerM2963b = LegacySavedStateHandleController.m2963b(c0677a, lifecycle, key, this.defaultArgs);
        if (!zIsAssignableFrom || (application = this.application) == null) {
            t = (T) qqd0.m175906d(modelClass, constructorM175905c, savedStateHandleControllerM2963b.getHandle());
        } else {
            application.getClass();
            t = (T) qqd0.m175906d(modelClass, constructorM175905c, application, savedStateHandleControllerM2963b.getHandle());
        }
        t.addCloseable("androidx.lifecycle.savedstate.vm.tag", savedStateHandleControllerM2963b);
        return t;
    }

    @Override // androidx.lifecycle.C0490t.c
    @NotNull
    public <T extends jcl0> T create(@NotNull Class<T> modelClass, @NotNull otb extras) {
        modelClass.getClass();
        extras.getClass();
        String str = (String) extras.mo143070a(C0490t.f2341b);
        if (str == null) {
            qkq0.m175383a("VIEW_MODEL_KEY must always be provided by ViewModelProvider");
            return null;
        }
        if (extras.mo143070a(C0487q.f2327a) == null || extras.mo143070a(C0487q.f2328b) == null) {
            if (this.lifecycle != null) {
                return (T) m3066b(str, modelClass);
            }
            qkq0.m175383a("SAVED_STATE_REGISTRY_OWNER_KEY andVIEW_MODEL_STORE_OWNER_KEY must be provided in the creation extras tosuccessfully create a ViewModel.");
            return null;
        }
        Application application = (Application) extras.mo143070a(C0490t.a.f2344e);
        boolean zIsAssignableFrom = AndroidViewModel.class.isAssignableFrom(modelClass);
        Constructor constructorM175905c = (!zIsAssignableFrom || application == null) ? qqd0.m175905c(modelClass, qqd0.f155883b) : qqd0.m175905c(modelClass, qqd0.f155882a);
        if (constructorM175905c == null) {
            return (T) this.factory.create(modelClass, extras);
        }
        return (!zIsAssignableFrom || application == null) ? (T) qqd0.m175906d(modelClass, constructorM175905c, C0487q.m3061a(extras)) : (T) qqd0.m175906d(modelClass, constructorM175905c, application, C0487q.m3061a(extras));
    }

    public C0488r() {
        this.factory = new C0490t.a();
    }

    @Override // androidx.lifecycle.C0490t.c
    @NotNull
    public <T extends jcl0> T create(@NotNull KClass<T> modelClass, @NotNull otb extras) {
        modelClass.getClass();
        extras.getClass();
        return (T) create(JvmClassMappingKt.m87452b(modelClass), extras);
    }

    @Override // androidx.lifecycle.C0490t.c
    @NotNull
    public <T extends jcl0> T create(@NotNull Class<T> modelClass) {
        modelClass.getClass();
        String canonicalName = modelClass.getCanonicalName();
        if (canonicalName != null) {
            return (T) m3066b(canonicalName, modelClass);
        }
        ig3.m135964a("Local and anonymous classes can not be ViewModels");
        return null;
    }
}
