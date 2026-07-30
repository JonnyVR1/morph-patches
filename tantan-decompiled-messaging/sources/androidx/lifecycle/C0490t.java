package androidx.lifecycle;

import android.app.Application;
import androidx.annotation.MainThread;
import androidx.annotation.RestrictTo;
import com.clevertap.android.sdk.Constants;
import com.cosmos.photon.push.service.PushService;
import com.google.android.libraries.places.api.model.PlaceTypes;
import com.p046p1.mobile.putong.data.Owner;
import java.lang.reflect.InvocationTargetException;
import kotlin.Metadata;
import kotlin.jvm.JvmClassMappingKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KClass;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p149l.ig3;
import p149l.j6f;
import p149l.jcl0;
import p149l.lcl0;
import p149l.ncl0;
import p149l.ocl0;
import p149l.otb;
import p149l.pcl0;
import p149l.ptc0;
import p149l.qq3;
import p149l.xtq;

/* JADX INFO: renamed from: androidx.lifecycle.t */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m87231d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0016\u0018\u0000 \u001f2\u00020\u0001:\u0005\u0015 !\u0018\u001cB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B#\b\u0017\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u0004\u0010\fB\u0011\b\u0016\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u0004\u0010\u000fB\u0019\b\u0016\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0004\u0010\u0010J(\u0010\u0015\u001a\u00028\u0000\"\b\b\u0000\u0010\u0012*\u00020\u00112\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\u0013H\u0087\u0002¢\u0006\u0004\b\u0015\u0010\u0016J(\u0010\u0018\u001a\u00028\u0000\"\b\b\u0000\u0010\u0012*\u00020\u00112\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\u0017H\u0096\u0002¢\u0006\u0004\b\u0018\u0010\u0019J0\u0010\u001c\u001a\u00028\u0000\"\b\b\u0000\u0010\u0012*\u00020\u00112\u0006\u0010\u001b\u001a\u00020\u001a2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\u0013H\u0087\u0002¢\u0006\u0004\b\u001c\u0010\u001dR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u001e¨\u0006\""}, m87232d2 = {"Landroidx/lifecycle/t;", "", "Ll/lcl0;", "impl", "<init>", "(Ll/lcl0;)V", "Ll/ocl0;", PlaceTypes.STORE, "Landroidx/lifecycle/t$c;", "factory", "Ll/otb;", "defaultCreationExtras", "(Ll/ocl0;Landroidx/lifecycle/t$c;Ll/otb;)V", "Ll/pcl0;", Owner.TYPE, "(Ll/pcl0;)V", "(Ll/pcl0;Landroidx/lifecycle/t$c;)V", "Ll/jcl0;", j6f.GPS_DIRECTION_TRUE, "Lkotlin/reflect/KClass;", "modelClass", "c", "(Lkotlin/reflect/KClass;)Ll/jcl0;", "Ljava/lang/Class;", "a", "(Ljava/lang/Class;)Ll/jcl0;", "", Constants.KEY_KEY, "b", "(Ljava/lang/String;Lkotlin/reflect/KClass;)Ll/jcl0;", "Ll/lcl0;", "Companion", "e", Constants.INAPP_DATA_TAG, "lifecycle-viewmodel_release"}, m87233k = 1, m87234mv = {2, 0, 0}, m87236xi = 48)
@SourceDebugExtension
public class C0490t {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: b */
    @JvmField
    @NotNull
    public static final otb.InterfaceC19034c<String> f2341b;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final lcl0 impl;

    /* JADX INFO: renamed from: androidx.lifecycle.t$b, reason: from kotlin metadata */
    @Metadata(m87231d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J+\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\bH\u0007¢\u0006\u0004\b\u000b\u0010\fR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m87232d2 = {"Landroidx/lifecycle/t$b;", "", "<init>", "()V", "Ll/pcl0;", Owner.TYPE, "Landroidx/lifecycle/t$c;", "factory", "Ll/otb;", "extras", "Landroidx/lifecycle/t;", "a", "(Ll/pcl0;Landroidx/lifecycle/t$c;Ll/otb;)Landroidx/lifecycle/t;", "Ll/otb$c;", "", "VIEW_MODEL_KEY", "Ll/otb$c;", "lifecycle-viewmodel_release"}, m87233k = 1, m87234mv = {2, 0, 0}, m87236xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: b */
        public static /* synthetic */ C0490t m3080b(Companion companion, pcl0 pcl0Var, c cVar, otb otbVar, int i, Object obj) {
            if ((i & 2) != 0) {
                cVar = ncl0.INSTANCE.m158955b(pcl0Var);
            }
            if ((i & 4) != 0) {
                otbVar = ncl0.INSTANCE.m158954a(pcl0Var);
            }
            return companion.m3081a(pcl0Var, cVar, otbVar);
        }

        @JvmStatic
        @NotNull
        /* JADX INFO: renamed from: a */
        public final C0490t m3081a(@NotNull pcl0 owner, @NotNull c factory, @NotNull otb extras) {
            owner.getClass();
            factory.getClass();
            extras.getClass();
            return new C0490t(owner.getViewModelStore(), factory, extras);
        }

        public Companion() {
        }
    }

    /* JADX INFO: renamed from: androidx.lifecycle.t$e */
    @Metadata(m87231d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0017\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, m87232d2 = {"Landroidx/lifecycle/t$e;", "", "<init>", "()V", "Ll/jcl0;", "viewModel", "", "a", "(Ll/jcl0;)V", "lifecycle-viewmodel_release"}, m87233k = 1, m87234mv = {2, 0, 0}, m87236xi = 48)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static class e {
        /* JADX INFO: renamed from: a */
        public void mo3065a(@NotNull jcl0 viewModel) {
            viewModel.getClass();
        }
    }

    /* JADX INFO: renamed from: androidx.lifecycle.t$f */
    @Metadata(m87231d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002"}, m87232d2 = {"androidx/lifecycle/t$f", "Ll/otb$c;", "lifecycle-viewmodel_release"}, m87233k = 1, m87234mv = {2, 0, 0}, m87236xi = 48)
    public static final class f implements otb.InterfaceC19034c<String> {
    }

    static {
        otb.Companion companion = otb.INSTANCE;
        f2341b = new f();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C0490t(@NotNull pcl0 pcl0Var) {
        pcl0Var.getClass();
        ocl0 viewModelStore = pcl0Var.getViewModelStore();
        ncl0 ncl0Var = ncl0.INSTANCE;
        this(viewModelStore, ncl0Var.m158955b(pcl0Var), ncl0Var.m158954a(pcl0Var));
    }

    @NotNull
    /* JADX INFO: renamed from: a */
    public <T extends jcl0> T m3073a(@NotNull Class<T> modelClass) {
        modelClass.getClass();
        return (T) m3075c(JvmClassMappingKt.m87455e(modelClass));
    }

    @MainThread
    @NotNull
    /* JADX INFO: renamed from: b */
    public final <T extends jcl0> T m3074b(@NotNull String key, @NotNull KClass<T> modelClass) {
        key.getClass();
        modelClass.getClass();
        return (T) this.impl.m149334d(modelClass, key);
    }

    @MainThread
    @NotNull
    /* JADX INFO: renamed from: c */
    public final <T extends jcl0> T m3075c(@NotNull KClass<T> modelClass) {
        modelClass.getClass();
        return (T) lcl0.m149333e(this.impl, modelClass, null, 2, null);
    }

    /* JADX INFO: renamed from: androidx.lifecycle.t$a */
    @Metadata(m87231d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\b\u0016\u0018\u0000 \u00182\u00020\u0001:\u0001\u0019B\u001b\b\u0002\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\t\b\u0016¢\u0006\u0004\b\u0006\u0010\bB\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\tJ/\u0010\u0010\u001a\u00028\u0000\"\b\b\u0000\u0010\u000b*\u00020\n2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J'\u0010\u0010\u001a\u00028\u0000\"\b\b\u0000\u0010\u000b*\u00020\n2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\fH\u0016¢\u0006\u0004\b\u0010\u0010\u0012J/\u0010\u0014\u001a\u00028\u0000\"\b\b\u0000\u0010\u000b*\u00020\n2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\f2\u0006\u0010\u0013\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u001a"}, m87232d2 = {"Landroidx/lifecycle/t$a;", "Landroidx/lifecycle/t$d;", "Landroid/app/Application;", "application", "", "unused", "<init>", "(Landroid/app/Application;I)V", "()V", "(Landroid/app/Application;)V", "Ll/jcl0;", j6f.GPS_DIRECTION_TRUE, "Ljava/lang/Class;", "modelClass", "Ll/otb;", "extras", PushService.COMMAND_CREATE, "(Ljava/lang/Class;Ll/otb;)Ll/jcl0;", "(Ljava/lang/Class;)Ll/jcl0;", "app", "e", "(Ljava/lang/Class;Landroid/app/Application;)Ll/jcl0;", "c", "Landroid/app/Application;", "Companion", "a", "lifecycle-viewmodel_release"}, m87233k = 1, m87234mv = {2, 0, 0}, m87236xi = 48)
    @SourceDebugExtension
    public static class a extends d {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion(null);

        /* JADX INFO: renamed from: d */
        @Nullable
        public static a f2343d;

        /* JADX INFO: renamed from: e */
        @JvmField
        @NotNull
        public static final otb.InterfaceC19034c<Application> f2344e;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        @Nullable
        public final Application application;

        /* JADX INFO: renamed from: androidx.lifecycle.t$a$a, reason: collision with other inner class name and from kotlin metadata */
        @Metadata(m87231d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bR\u0018\u0010\t\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u000e"}, m87232d2 = {"Landroidx/lifecycle/t$a$a;", "", "<init>", "()V", "Landroid/app/Application;", "application", "Landroidx/lifecycle/t$a;", "a", "(Landroid/app/Application;)Landroidx/lifecycle/t$a;", "_instance", "Landroidx/lifecycle/t$a;", "Ll/otb$c;", "APPLICATION_KEY", "Ll/otb$c;", "lifecycle-viewmodel_release"}, m87233k = 1, m87234mv = {2, 0, 0}, m87236xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @JvmStatic
            @NotNull
            /* JADX INFO: renamed from: a */
            public final a m3079a(@NotNull Application application) {
                application.getClass();
                if (a.f2343d == null) {
                    a.f2343d = new a(application);
                }
                a aVar = a.f2343d;
                aVar.getClass();
                return aVar;
            }

            public Companion() {
            }
        }

        /* JADX INFO: renamed from: androidx.lifecycle.t$a$b */
        @Metadata(m87231d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002"}, m87232d2 = {"androidx/lifecycle/t$a$b", "Ll/otb$c;", "lifecycle-viewmodel_release"}, m87233k = 1, m87234mv = {2, 0, 0}, m87236xi = 48)
        public static final class b implements otb.InterfaceC19034c<Application> {
        }

        static {
            otb.Companion companion = otb.INSTANCE;
            f2344e = new b();
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public a(@NotNull Application application) {
            this(application, 0);
            application.getClass();
        }

        @Override // androidx.lifecycle.C0490t.d, androidx.lifecycle.C0490t.c
        @NotNull
        public <T extends jcl0> T create(@NotNull Class<T> modelClass, @NotNull otb extras) {
            modelClass.getClass();
            extras.getClass();
            if (this.application != null) {
                return (T) create(modelClass);
            }
            Application application = (Application) extras.mo143070a(f2344e);
            if (application != null) {
                return (T) m3078e(modelClass, application);
            }
            if (!AndroidViewModel.class.isAssignableFrom(modelClass)) {
                return (T) super.create(modelClass);
            }
            ig3.m135964a("CreationExtras must have an application by `APPLICATION_KEY`");
            return null;
        }

        /* JADX INFO: renamed from: e */
        public final <T extends jcl0> T m3078e(Class<T> modelClass, Application app) {
            if (!AndroidViewModel.class.isAssignableFrom(modelClass)) {
                return (T) super.create(modelClass);
            }
            try {
                T tNewInstance = modelClass.getConstructor(Application.class).newInstance(app);
                tNewInstance.getClass();
                return tNewInstance;
            } catch (IllegalAccessException e) {
                ptc0.m171306a("Cannot create an instance of ", modelClass, e);
                return null;
            } catch (InstantiationException e2) {
                ptc0.m171306a("Cannot create an instance of ", modelClass, e2);
                return null;
            } catch (NoSuchMethodException e3) {
                ptc0.m171306a("Cannot create an instance of ", modelClass, e3);
                return null;
            } catch (InvocationTargetException e4) {
                ptc0.m171306a("Cannot create an instance of ", modelClass, e4);
                return null;
            }
        }

        public a() {
            this(null, 0);
        }

        public a(Application application, int i) {
            this.application = application;
        }

        @Override // androidx.lifecycle.C0490t.d, androidx.lifecycle.C0490t.c
        @NotNull
        public <T extends jcl0> T create(@NotNull Class<T> modelClass) {
            modelClass.getClass();
            Application application = this.application;
            if (application != null) {
                return (T) m3078e(modelClass, application);
            }
            qq3.m175877a("AndroidViewModelFactory constructed with empty constructor works only with create(modelClass: Class<T>, extras: CreationExtras).");
            return null;
        }
    }

    /* JADX INFO: renamed from: androidx.lifecycle.t$c */
    @Metadata(m87231d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u0000 \r2\u00020\u0001:\u0001\u000eJ'\u0010\u0006\u001a\u00028\u0000\"\b\b\u0000\u0010\u0003*\u00020\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J/\u0010\u0006\u001a\u00028\u0000\"\b\b\u0000\u0010\u0003*\u00020\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u00042\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0006\u0010\nJ/\u0010\u0006\u001a\u00028\u0000\"\b\b\u0000\u0010\u0003*\u00020\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u000b2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0006\u0010\fø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u000fÀ\u0006\u0001"}, m87232d2 = {"Landroidx/lifecycle/t$c;", "", "Ll/jcl0;", j6f.GPS_DIRECTION_TRUE, "Ljava/lang/Class;", "modelClass", PushService.COMMAND_CREATE, "(Ljava/lang/Class;)Ll/jcl0;", "Ll/otb;", "extras", "(Ljava/lang/Class;Ll/otb;)Ll/jcl0;", "Lkotlin/reflect/KClass;", "(Lkotlin/reflect/KClass;Ll/otb;)Ll/jcl0;", "Companion", "a", "lifecycle-viewmodel_release"}, m87233k = 1, m87234mv = {2, 0, 0}, m87236xi = 48)
    public interface c {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = Companion.f2346a;

        /* JADX INFO: renamed from: androidx.lifecycle.t$c$a, reason: from kotlin metadata */
        @Metadata(m87231d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m87232d2 = {"Landroidx/lifecycle/t$c$a;", "", "<init>", "()V", "lifecycle-viewmodel_release"}, m87233k = 1, m87234mv = {2, 0, 0}, m87236xi = 48)
        public static final class Companion {

            /* JADX INFO: renamed from: a */
            public static final /* synthetic */ Companion f2346a = new Companion();
        }

        @NotNull
        default <T extends jcl0> T create(@NotNull KClass<T> modelClass, @NotNull otb extras) {
            modelClass.getClass();
            extras.getClass();
            return (T) create(JvmClassMappingKt.m87452b(modelClass), extras);
        }

        @NotNull
        default <T extends jcl0> T create(@NotNull Class<T> modelClass, @NotNull otb extras) {
            modelClass.getClass();
            extras.getClass();
            return (T) create(modelClass);
        }

        @NotNull
        default <T extends jcl0> T create(@NotNull Class<T> modelClass) {
            modelClass.getClass();
            return (T) ncl0.INSTANCE.m158957d();
        }
    }

    /* JADX INFO: renamed from: androidx.lifecycle.t$d */
    @Metadata(m87231d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0016\u0018\u0000 \u000f2\u00020\u0001:\u0001\u0010B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\b\u001a\u00028\u0000\"\b\b\u0000\u0010\u0005*\u00020\u00042\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006H\u0016¢\u0006\u0004\b\b\u0010\tJ/\u0010\b\u001a\u00028\u0000\"\b\b\u0000\u0010\u0005*\u00020\u00042\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u00062\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\b\u0010\fJ/\u0010\b\u001a\u00028\u0000\"\b\b\u0000\u0010\u0005*\u00020\u00042\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\r2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\b\u0010\u000e¨\u0006\u0011"}, m87232d2 = {"Landroidx/lifecycle/t$d;", "Landroidx/lifecycle/t$c;", "<init>", "()V", "Ll/jcl0;", j6f.GPS_DIRECTION_TRUE, "Ljava/lang/Class;", "modelClass", PushService.COMMAND_CREATE, "(Ljava/lang/Class;)Ll/jcl0;", "Ll/otb;", "extras", "(Ljava/lang/Class;Ll/otb;)Ll/jcl0;", "Lkotlin/reflect/KClass;", "(Lkotlin/reflect/KClass;Ll/otb;)Ll/jcl0;", "Companion", "a", "lifecycle-viewmodel_release"}, m87233k = 1, m87234mv = {2, 0, 0}, m87236xi = 48)
    public static class d implements c {

        /* JADX INFO: renamed from: a */
        @Nullable
        public static d f2347a;

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion(null);

        /* JADX INFO: renamed from: b */
        @JvmField
        @NotNull
        public static final otb.InterfaceC19034c<String> f2348b = C0490t.f2341b;

        /* JADX INFO: renamed from: androidx.lifecycle.t$d$a, reason: from kotlin metadata */
        @Metadata(m87231d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\b\u001a\u00020\u00048GX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0007\u0010\u0003\u001a\u0004\b\u0005\u0010\u0006R\u0018\u0010\t\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010\nR\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u000f"}, m87232d2 = {"Landroidx/lifecycle/t$d$a;", "", "<init>", "()V", "Landroidx/lifecycle/t$d;", "a", "()Landroidx/lifecycle/t$d;", "getInstance$annotations", "instance", "_instance", "Landroidx/lifecycle/t$d;", "Ll/otb$c;", "", "VIEW_MODEL_KEY", "Ll/otb$c;", "lifecycle-viewmodel_release"}, m87233k = 1, m87234mv = {2, 0, 0}, m87236xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
            @NotNull
            /* JADX INFO: renamed from: a */
            public final d m3084a() {
                if (d.f2347a == null) {
                    d.f2347a = new d();
                }
                d dVar = d.f2347a;
                dVar.getClass();
                return dVar;
            }

            public Companion() {
            }
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
        public <T extends jcl0> T create(@NotNull Class<T> modelClass, @NotNull otb extras) {
            modelClass.getClass();
            extras.getClass();
            return (T) create(modelClass);
        }

        @Override // androidx.lifecycle.C0490t.c
        @NotNull
        public <T extends jcl0> T create(@NotNull Class<T> modelClass) {
            modelClass.getClass();
            return (T) xtq.INSTANCE.m211015a(modelClass);
        }
    }

    public C0490t(lcl0 lcl0Var) {
        this.impl = lcl0Var;
    }

    public /* synthetic */ C0490t(ocl0 ocl0Var, c cVar, otb otbVar, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(ocl0Var, cVar, (i & 4) != 0 ? otb.C19033b.INSTANCE : otbVar);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public C0490t(@NotNull ocl0 ocl0Var, @NotNull c cVar, @NotNull otb otbVar) {
        this(new lcl0(ocl0Var, cVar, otbVar));
        ocl0Var.getClass();
        cVar.getClass();
        otbVar.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public C0490t(@NotNull ocl0 ocl0Var, @NotNull c cVar) {
        this(ocl0Var, cVar, null, 4, null);
        ocl0Var.getClass();
        cVar.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C0490t(@NotNull pcl0 pcl0Var, @NotNull c cVar) {
        this(pcl0Var.getViewModelStore(), cVar, ncl0.INSTANCE.m158954a(pcl0Var));
        pcl0Var.getClass();
        cVar.getClass();
    }
}
