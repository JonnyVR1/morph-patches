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
import p149l.hqd0;
import p149l.ig3;
import p149l.j6f;
import p149l.jcl0;
import p149l.otb;
import p149l.pcl0;
import p149l.pqd0;
import p149l.qkq0;

/* JADX INFO: renamed from: androidx.lifecycle.q */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m87231d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a7\u0010\n\u001a\u00020\t2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u000e\u0010\b\u001a\n\u0018\u00010\u0006j\u0004\u0018\u0001`\u0007H\u0002¢\u0006\u0004\b\n\u0010\u000b\u001a\u0013\u0010\r\u001a\u00020\t*\u00020\fH\u0007¢\u0006\u0004\b\r\u0010\u000e\"\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00000\u000f8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0010\"\u001a\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00020\u000f8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0010\"\u001e\u0010\u0014\u001a\f\u0012\b\u0012\u00060\u0006j\u0002`\u00070\u000f8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0010\"\u0018\u0010\u0018\u001a\u00020\u0015*\u00020\u00028@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017\"\u0018\u0010\u001b\u001a\u00020\u0019*\u00020\u00008@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u001a¨\u0006\u001c"}, m87232d2 = {"Ll/pqd0;", "savedStateRegistryOwner", "Ll/pcl0;", "viewModelStoreOwner", "", Constants.KEY_KEY, "Landroid/os/Bundle;", "Landroidx/savedstate/SavedState;", "defaultArgs", "Landroidx/lifecycle/p;", "b", "(Ll/pqd0;Ll/pcl0;Ljava/lang/String;Landroid/os/Bundle;)Landroidx/lifecycle/p;", "Ll/otb;", "a", "(Ll/otb;)Landroidx/lifecycle/p;", "Ll/otb$c;", "Ll/otb$c;", "SAVED_STATE_REGISTRY_OWNER_KEY", "VIEW_MODEL_STORE_OWNER_KEY", "c", "DEFAULT_ARGS_KEY", "Landroidx/lifecycle/SavedStateHandlesVM;", Constants.INAPP_DATA_TAG, "(Ll/pcl0;)Landroidx/lifecycle/SavedStateHandlesVM;", "savedStateHandlesVM", "Ll/hqd0;", "(Ll/pqd0;)Ll/hqd0;", "savedStateHandlesProvider", "lifecycle-viewmodel-savedstate_release"}, m87233k = 2, m87234mv = {2, 0, 0}, m87236xi = 48)
@JvmName
@SourceDebugExtension
public final class C0487q {

    /* JADX INFO: renamed from: a */
    @JvmField
    @NotNull
    public static final otb.InterfaceC19034c<pqd0> f2327a;

    /* JADX INFO: renamed from: b */
    @JvmField
    @NotNull
    public static final otb.InterfaceC19034c<pcl0> f2328b;

    /* JADX INFO: renamed from: c */
    @JvmField
    @NotNull
    public static final otb.InterfaceC19034c<Bundle> f2329c;

    /* JADX INFO: renamed from: androidx.lifecycle.q$a */
    @Metadata(m87231d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J/\u0010\b\u001a\u00028\u0000\"\b\b\u0000\u0010\u0003*\u00020\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, m87232d2 = {"androidx/lifecycle/q$a", "Landroidx/lifecycle/t$c;", "Ll/jcl0;", j6f.GPS_DIRECTION_TRUE, "Lkotlin/reflect/KClass;", "modelClass", "Ll/otb;", "extras", PushService.COMMAND_CREATE, "(Lkotlin/reflect/KClass;Ll/otb;)Ll/jcl0;", "lifecycle-viewmodel-savedstate_release"}, m87233k = 1, m87234mv = {2, 0, 0}, m87236xi = 48)
    public static final class a implements C0490t.c {
        @Override // androidx.lifecycle.C0490t.c
        public <T extends jcl0> T create(KClass<T> modelClass, otb extras) {
            modelClass.getClass();
            extras.getClass();
            return new SavedStateHandlesVM();
        }
    }

    /* JADX INFO: renamed from: androidx.lifecycle.q$b */
    @Metadata(m87231d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002"}, m87232d2 = {"androidx/lifecycle/q$b", "Ll/otb$c;", "lifecycle-viewmodel_release"}, m87233k = 1, m87234mv = {2, 0, 0}, m87236xi = 48)
    public static final class b implements otb.InterfaceC19034c<pqd0> {
    }

    /* JADX INFO: renamed from: androidx.lifecycle.q$c */
    @Metadata(m87231d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002"}, m87232d2 = {"androidx/lifecycle/q$c", "Ll/otb$c;", "lifecycle-viewmodel_release"}, m87233k = 1, m87234mv = {2, 0, 0}, m87236xi = 48)
    public static final class c implements otb.InterfaceC19034c<pcl0> {
    }

    /* JADX INFO: renamed from: androidx.lifecycle.q$d */
    @Metadata(m87231d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002"}, m87232d2 = {"androidx/lifecycle/q$d", "Ll/otb$c;", "lifecycle-viewmodel_release"}, m87233k = 1, m87234mv = {2, 0, 0}, m87236xi = 48)
    public static final class d implements otb.InterfaceC19034c<Bundle> {
    }

    static {
        otb.Companion companion = otb.INSTANCE;
        f2327a = new b();
        f2328b = new c();
        f2329c = new d();
    }

    @MainThread
    @NotNull
    /* JADX INFO: renamed from: a */
    public static final C0486p m3061a(@NotNull otb otbVar) {
        otbVar.getClass();
        pqd0 pqd0Var = (pqd0) otbVar.mo143070a(f2327a);
        if (pqd0Var == null) {
            ig3.m135964a("CreationExtras must have a value by `SAVED_STATE_REGISTRY_OWNER_KEY`");
            return null;
        }
        pcl0 pcl0Var = (pcl0) otbVar.mo143070a(f2328b);
        if (pcl0Var == null) {
            ig3.m135964a("CreationExtras must have a value by `VIEW_MODEL_STORE_OWNER_KEY`");
            return null;
        }
        Bundle bundle = (Bundle) otbVar.mo143070a(f2329c);
        String str = (String) otbVar.mo143070a(C0490t.f2341b);
        if (str != null) {
            return m3062b(pqd0Var, pcl0Var, str, bundle);
        }
        ig3.m135964a("CreationExtras must have a value by `VIEW_MODEL_KEY`");
        return null;
    }

    /* JADX INFO: renamed from: b */
    public static final C0486p m3062b(pqd0 pqd0Var, pcl0 pcl0Var, String str, Bundle bundle) {
        hqd0 hqd0VarM3063c = m3063c(pqd0Var);
        SavedStateHandlesVM savedStateHandlesVMM3064d = m3064d(pcl0Var);
        C0486p c0486p = savedStateHandlesVMM3064d.m3010a().get(str);
        if (c0486p != null) {
            return c0486p;
        }
        C0486p c0486pM3060a = C0486p.INSTANCE.m3060a(hqd0VarM3063c.m132445b(str), bundle);
        savedStateHandlesVMM3064d.m3010a().put(str, c0486pM3060a);
        return c0486pM3060a;
    }

    @NotNull
    /* JADX INFO: renamed from: c */
    public static final hqd0 m3063c(@NotNull pqd0 pqd0Var) {
        pqd0Var.getClass();
        pqd0Var.getSavedStateRegistry().m4022b("androidx.lifecycle.internal.SavedStateHandlesProvider");
        qkq0.m175383a("enableSavedStateHandles() wasn't called prior to createSavedStateHandle() call");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: d */
    public static final SavedStateHandlesVM m3064d(@NotNull pcl0 pcl0Var) {
        pcl0Var.getClass();
        return (SavedStateHandlesVM) C0490t.Companion.m3080b(C0490t.INSTANCE, pcl0Var, new a(), null, 4, null).m3074b("androidx.lifecycle.internal.SavedStateHandlesVM", Reflection.m87507b(SavedStateHandlesVM.class));
    }
}
