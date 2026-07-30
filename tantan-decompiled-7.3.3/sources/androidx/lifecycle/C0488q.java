package androidx.lifecycle;

import android.os.Bundle;
import androidx.annotation.MainThread;
import com.clevertap.android.sdk.Constants;
import com.cosmos.photon.push.service.PushService;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KClass;
import org.jetbrains.annotations.NotNull;
import p153l.cvb;
import p153l.jyd0;
import p153l.nll0;
import p153l.p7f;
import p153l.ryd0;
import p153l.tll0;
import p153l.wg3;
import p153l.wtq0;

/* JADX INFO: renamed from: androidx.lifecycle.q */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m88120d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a7\u0010\n\u001a\u00020\t2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u000e\u0010\b\u001a\n\u0018\u00010\u0006j\u0004\u0018\u0001`\u0007H\u0002¢\u0006\u0004\b\n\u0010\u000b\u001a\u0013\u0010\r\u001a\u00020\t*\u00020\fH\u0007¢\u0006\u0004\b\r\u0010\u000e\"\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00000\u000f8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0010\"\u001a\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00020\u000f8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0010\"\u001e\u0010\u0014\u001a\f\u0012\b\u0012\u00060\u0006j\u0002`\u00070\u000f8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0010\"\u0018\u0010\u0018\u001a\u00020\u0015*\u00020\u00028@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017\"\u0018\u0010\u001b\u001a\u00020\u0019*\u00020\u00008@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u001a¨\u0006\u001c"}, m88121d2 = {"Ll/ryd0;", "savedStateRegistryOwner", "Ll/tll0;", "viewModelStoreOwner", "", Constants.KEY_KEY, "Landroid/os/Bundle;", "Landroidx/savedstate/SavedState;", "defaultArgs", "Landroidx/lifecycle/p;", "b", "(Ll/ryd0;Ll/tll0;Ljava/lang/String;Landroid/os/Bundle;)Landroidx/lifecycle/p;", "Ll/cvb;", "a", "(Ll/cvb;)Landroidx/lifecycle/p;", "Ll/cvb$c;", "Ll/cvb$c;", "SAVED_STATE_REGISTRY_OWNER_KEY", "VIEW_MODEL_STORE_OWNER_KEY", "c", "DEFAULT_ARGS_KEY", "Landroidx/lifecycle/SavedStateHandlesVM;", Constants.INAPP_DATA_TAG, "(Ll/tll0;)Landroidx/lifecycle/SavedStateHandlesVM;", "savedStateHandlesVM", "Ll/jyd0;", "(Ll/ryd0;)Ll/jyd0;", "savedStateHandlesProvider", "lifecycle-viewmodel-savedstate_release"}, m88122k = 2, m88123mv = {2, 0, 0}, m88125xi = 48)
@JvmName
@SourceDebugExtension
public final class C0488q {

    /* JADX INFO: renamed from: a */
    @JvmField
    @NotNull
    public static final cvb.InterfaceC16370c<ryd0> f2327a;

    /* JADX INFO: renamed from: b */
    @JvmField
    @NotNull
    public static final cvb.InterfaceC16370c<tll0> f2328b;

    /* JADX INFO: renamed from: c */
    @JvmField
    @NotNull
    public static final cvb.InterfaceC16370c<Bundle> f2329c;

    /* JADX INFO: renamed from: androidx.lifecycle.q$a */
    @Metadata(m88120d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J/\u0010\b\u001a\u00028\u0000\"\b\b\u0000\u0010\u0003*\u00020\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, m88121d2 = {"androidx/lifecycle/q$a", "Landroidx/lifecycle/t$c;", "Ll/nll0;", p7f.GPS_DIRECTION_TRUE, "Lkotlin/reflect/KClass;", "modelClass", "Ll/cvb;", "extras", PushService.COMMAND_CREATE, "(Lkotlin/reflect/KClass;Ll/cvb;)Ll/nll0;", "lifecycle-viewmodel-savedstate_release"}, m88122k = 1, m88123mv = {2, 0, 0}, m88125xi = 48)
    public static final class a implements C0491t.c {
        @Override // androidx.lifecycle.C0491t.c
        public <T extends nll0> T create(KClass<T> modelClass, cvb extras) {
            modelClass.getClass();
            extras.getClass();
            return new SavedStateHandlesVM();
        }
    }

    /* JADX INFO: renamed from: androidx.lifecycle.q$b */
    @Metadata(m88120d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002"}, m88121d2 = {"androidx/lifecycle/q$b", "Ll/cvb$c;", "lifecycle-viewmodel_release"}, m88122k = 1, m88123mv = {2, 0, 0}, m88125xi = 48)
    public static final class b implements cvb.InterfaceC16370c<ryd0> {
    }

    /* JADX INFO: renamed from: androidx.lifecycle.q$c */
    @Metadata(m88120d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002"}, m88121d2 = {"androidx/lifecycle/q$c", "Ll/cvb$c;", "lifecycle-viewmodel_release"}, m88122k = 1, m88123mv = {2, 0, 0}, m88125xi = 48)
    public static final class c implements cvb.InterfaceC16370c<tll0> {
    }

    /* JADX INFO: renamed from: androidx.lifecycle.q$d */
    @Metadata(m88120d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002"}, m88121d2 = {"androidx/lifecycle/q$d", "Ll/cvb$c;", "lifecycle-viewmodel_release"}, m88122k = 1, m88123mv = {2, 0, 0}, m88125xi = 48)
    public static final class d implements cvb.InterfaceC16370c<Bundle> {
    }

    static {
        cvb.Companion companion = cvb.INSTANCE;
        f2327a = new b();
        f2328b = new c();
        f2329c = new d();
    }

    @MainThread
    @NotNull
    /* JADX INFO: renamed from: a */
    public static final C0487p m3062a(@NotNull cvb cvbVar) {
        cvbVar.getClass();
        ryd0 ryd0Var = (ryd0) cvbVar.mo112786a(f2327a);
        if (ryd0Var == null) {
            wg3.m206174a("CreationExtras must have a value by `SAVED_STATE_REGISTRY_OWNER_KEY`");
            return null;
        }
        tll0 tll0Var = (tll0) cvbVar.mo112786a(f2328b);
        if (tll0Var == null) {
            wg3.m206174a("CreationExtras must have a value by `VIEW_MODEL_STORE_OWNER_KEY`");
            return null;
        }
        Bundle bundle = (Bundle) cvbVar.mo112786a(f2329c);
        String str = (String) cvbVar.mo112786a(C0491t.f2341b);
        if (str != null) {
            return m3063b(ryd0Var, tll0Var, str, bundle);
        }
        wg3.m206174a("CreationExtras must have a value by `VIEW_MODEL_KEY`");
        return null;
    }

    /* JADX INFO: renamed from: b */
    public static final C0487p m3063b(ryd0 ryd0Var, tll0 tll0Var, String str, Bundle bundle) {
        jyd0 jyd0VarM3064c = m3064c(ryd0Var);
        SavedStateHandlesVM savedStateHandlesVMM3065d = m3065d(tll0Var);
        C0487p c0487p = savedStateHandlesVMM3065d.m3011a().get(str);
        if (c0487p != null) {
            return c0487p;
        }
        C0487p c0487pM3061a = C0487p.INSTANCE.m3061a(jyd0VarM3064c.m147538b(str), bundle);
        savedStateHandlesVMM3065d.m3011a().put(str, c0487pM3061a);
        return c0487pM3061a;
    }

    @NotNull
    /* JADX INFO: renamed from: c */
    public static final jyd0 m3064c(@NotNull ryd0 ryd0Var) {
        ryd0Var.getClass();
        ryd0Var.getSavedStateRegistry().m4024b("androidx.lifecycle.internal.SavedStateHandlesProvider");
        wtq0.m207906a("enableSavedStateHandles() wasn't called prior to createSavedStateHandle() call");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: d */
    public static final SavedStateHandlesVM m3065d(@NotNull tll0 tll0Var) {
        tll0Var.getClass();
        return (SavedStateHandlesVM) C0491t.Companion.m3081b(C0491t.INSTANCE, tll0Var, new a(), null, 4, null).m3075b("androidx.lifecycle.internal.SavedStateHandlesVM", Reflection.m88396b(SavedStateHandlesVM.class));
    }
}
