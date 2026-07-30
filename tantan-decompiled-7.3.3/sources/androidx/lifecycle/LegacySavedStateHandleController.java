package androidx.lifecycle;

import android.os.Bundle;
import androidx.savedstate.C0679a;
import com.alibaba.sdk.android.oss.common.RequestParameters;
import com.clevertap.android.sdk.Constants;
import com.p051p1.mobile.putong.data.Owner;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p153l.jmk0;
import p153l.ker;
import p153l.nll0;
import p153l.ryd0;
import p153l.sll0;
import p153l.tll0;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m88120d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\bÀ\u0002\u0018\u00002\u00020\u0001:\u0001\u0012B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J3\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0007¢\u0006\u0004\b\r\u0010\u000eJ'\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u0012\u0010\u0013J\u001f\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, m88121d2 = {"Landroidx/lifecycle/LegacySavedStateHandleController;", "", "<init>", "()V", "Landroidx/savedstate/a;", "registry", "Landroidx/lifecycle/Lifecycle;", RequestParameters.SUBRESOURCE_LIFECYCLE, "", Constants.KEY_KEY, "Landroid/os/Bundle;", "defaultArgs", "Landroidx/lifecycle/SavedStateHandleController;", "b", "(Landroidx/savedstate/a;Landroidx/lifecycle/Lifecycle;Ljava/lang/String;Landroid/os/Bundle;)Landroidx/lifecycle/SavedStateHandleController;", "Ll/nll0;", "viewModel", "", "a", "(Ll/nll0;Landroidx/savedstate/a;Landroidx/lifecycle/Lifecycle;)V", "c", "(Landroidx/savedstate/a;Landroidx/lifecycle/Lifecycle;)V", "lifecycle-viewmodel-savedstate_release"}, m88122k = 1, m88123mv = {2, 0, 0}, m88125xi = 48)
public final class LegacySavedStateHandleController {

    @NotNull
    public static final LegacySavedStateHandleController INSTANCE = new LegacySavedStateHandleController();

    /* JADX INFO: renamed from: androidx.lifecycle.LegacySavedStateHandleController$a */
    @Metadata(m88120d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, m88121d2 = {"Landroidx/lifecycle/LegacySavedStateHandleController$a;", "Landroidx/savedstate/a$a;", "<init>", "()V", "Ll/ryd0;", Owner.TYPE, "", "a", "(Ll/ryd0;)V", "lifecycle-viewmodel-savedstate_release"}, m88122k = 1, m88123mv = {2, 0, 0}, m88125xi = 48)
    public static final class C0455a implements C0679a.a {
        @Override // androidx.savedstate.C0679a.a
        /* JADX INFO: renamed from: a */
        public void mo2966a(@NotNull ryd0 owner) {
            owner.getClass();
            if (!(owner instanceof tll0)) {
                jmk0.m146166a("Internal error: OnRecreation should be registered only on components that implement ViewModelStoreOwner. Received owner: ", owner);
                return;
            }
            sll0 viewModelStore = ((tll0) owner).getViewModelStore();
            C0679a savedStateRegistry = owner.getSavedStateRegistry();
            Iterator<String> it = viewModelStore.m186598c().iterator();
            while (it.hasNext()) {
                nll0 nll0VarM186597b = viewModelStore.m186597b(it.next());
                if (nll0VarM186597b != null) {
                    LegacySavedStateHandleController.m2963a(nll0VarM186597b, savedStateRegistry, owner.getLifecycle());
                }
            }
            if (viewModelStore.m186598c().isEmpty()) {
                return;
            }
            savedStateRegistry.m4026d(C0455a.class);
        }
    }

    @JvmStatic
    /* JADX INFO: renamed from: a */
    public static final void m2963a(@NotNull nll0 viewModel, @NotNull C0679a registry, @NotNull Lifecycle lifecycle) {
        viewModel.getClass();
        registry.getClass();
        lifecycle.getClass();
        SavedStateHandleController savedStateHandleController = (SavedStateHandleController) viewModel.getCloseable("androidx.lifecycle.savedstate.vm.tag");
        if (savedStateHandleController == null || savedStateHandleController.getIsAttached()) {
            return;
        }
        savedStateHandleController.attachToLifecycle(registry, lifecycle);
        INSTANCE.m2965c(registry, lifecycle);
    }

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: b */
    public static final SavedStateHandleController m2964b(@NotNull C0679a registry, @NotNull Lifecycle lifecycle, @Nullable String key, @Nullable Bundle defaultArgs) {
        registry.getClass();
        lifecycle.getClass();
        key.getClass();
        SavedStateHandleController savedStateHandleController = new SavedStateHandleController(key, C0487p.INSTANCE.m3061a(registry.m4023a(key), defaultArgs));
        savedStateHandleController.attachToLifecycle(registry, lifecycle);
        INSTANCE.m2965c(registry, lifecycle);
        return savedStateHandleController;
    }

    /* JADX INFO: renamed from: c */
    public final void m2965c(final C0679a registry, final Lifecycle lifecycle) {
        Lifecycle.State state = lifecycle.getState();
        if (state == Lifecycle.State.INITIALIZED || state.isAtLeast(Lifecycle.State.STARTED)) {
            registry.m4026d(C0455a.class);
        } else {
            lifecycle.mo2967a(new LifecycleEventObserver() { // from class: androidx.lifecycle.LegacySavedStateHandleController$tryToAddRecreator$1
                @Override // androidx.lifecycle.LifecycleEventObserver
                public void onStateChanged(ker source, Lifecycle.Event event) {
                    source.getClass();
                    event.getClass();
                    if (event == Lifecycle.Event.ON_START) {
                        lifecycle.mo2970d(this);
                        registry.m4026d(LegacySavedStateHandleController.C0455a.class);
                    }
                }
            });
        }
    }
}
