package androidx.lifecycle;

import android.app.Application;
import androidx.annotation.MainThread;
import androidx.annotation.RestrictTo;
import com.clevertap.android.sdk.Constants;
import com.cosmos.photon.push.service.PushService;
import com.google.android.libraries.places.api.model.PlaceTypes;
import com.p051p1.mobile.putong.data.Owner;
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
import p153l.cvb;
import p153l.nll0;
import p153l.p7f;
import p153l.pll0;
import p153l.pr3;
import p153l.rll0;
import p153l.sll0;
import p153l.tll0;
import p153l.u1d0;
import p153l.wg3;
import p153l.yvq;

/* JADX INFO: renamed from: androidx.lifecycle.t */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m88120d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0016\u0018\u0000 \u001f2\u00020\u0001:\u0005\u0015 !\u0018\u001cB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B#\b\u0017\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u0004\u0010\fB\u0011\b\u0016\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u0004\u0010\u000fB\u0019\b\u0016\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0004\u0010\u0010J(\u0010\u0015\u001a\u00028\u0000\"\b\b\u0000\u0010\u0012*\u00020\u00112\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\u0013H\u0087\u0002¢\u0006\u0004\b\u0015\u0010\u0016J(\u0010\u0018\u001a\u00028\u0000\"\b\b\u0000\u0010\u0012*\u00020\u00112\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\u0017H\u0096\u0002¢\u0006\u0004\b\u0018\u0010\u0019J0\u0010\u001c\u001a\u00028\u0000\"\b\b\u0000\u0010\u0012*\u00020\u00112\u0006\u0010\u001b\u001a\u00020\u001a2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\u0013H\u0087\u0002¢\u0006\u0004\b\u001c\u0010\u001dR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u001e¨\u0006\""}, m88121d2 = {"Landroidx/lifecycle/t;", "", "Ll/pll0;", "impl", "<init>", "(Ll/pll0;)V", "Ll/sll0;", PlaceTypes.STORE, "Landroidx/lifecycle/t$c;", "factory", "Ll/cvb;", "defaultCreationExtras", "(Ll/sll0;Landroidx/lifecycle/t$c;Ll/cvb;)V", "Ll/tll0;", Owner.TYPE, "(Ll/tll0;)V", "(Ll/tll0;Landroidx/lifecycle/t$c;)V", "Ll/nll0;", p7f.GPS_DIRECTION_TRUE, "Lkotlin/reflect/KClass;", "modelClass", "c", "(Lkotlin/reflect/KClass;)Ll/nll0;", "Ljava/lang/Class;", "a", "(Ljava/lang/Class;)Ll/nll0;", "", Constants.KEY_KEY, "b", "(Ljava/lang/String;Lkotlin/reflect/KClass;)Ll/nll0;", "Ll/pll0;", "Companion", "e", Constants.INAPP_DATA_TAG, "lifecycle-viewmodel_release"}, m88122k = 1, m88123mv = {2, 0, 0}, m88125xi = 48)
@SourceDebugExtension
public class C0491t {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: b */
    @JvmField
    @NotNull
    public static final cvb.InterfaceC16370c<String> f2341b;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final pll0 impl;

    /* JADX INFO: renamed from: androidx.lifecycle.t$b, reason: from kotlin metadata */
    @Metadata(m88120d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J+\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\bH\u0007¢\u0006\u0004\b\u000b\u0010\fR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m88121d2 = {"Landroidx/lifecycle/t$b;", "", "<init>", "()V", "Ll/tll0;", Owner.TYPE, "Landroidx/lifecycle/t$c;", "factory", "Ll/cvb;", "extras", "Landroidx/lifecycle/t;", "a", "(Ll/tll0;Landroidx/lifecycle/t$c;Ll/cvb;)Landroidx/lifecycle/t;", "Ll/cvb$c;", "", "VIEW_MODEL_KEY", "Ll/cvb$c;", "lifecycle-viewmodel_release"}, m88122k = 1, m88123mv = {2, 0, 0}, m88125xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: b */
        public static /* synthetic */ C0491t m3081b(Companion companion, tll0 tll0Var, c cVar, cvb cvbVar, int i, Object obj) {
            if ((i & 2) != 0) {
                cVar = rll0.INSTANCE.m182016b(tll0Var);
            }
            if ((i & 4) != 0) {
                cvbVar = rll0.INSTANCE.m182015a(tll0Var);
            }
            return companion.m3082a(tll0Var, cVar, cvbVar);
        }

        @JvmStatic
        @NotNull
        /* JADX INFO: renamed from: a */
        public final C0491t m3082a(@NotNull tll0 owner, @NotNull c factory, @NotNull cvb extras) {
            owner.getClass();
            factory.getClass();
            extras.getClass();
            return new C0491t(owner.getViewModelStore(), factory, extras);
        }

        public Companion() {
        }
    }

    /* JADX INFO: renamed from: androidx.lifecycle.t$e */
    @Metadata(m88120d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0017\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, m88121d2 = {"Landroidx/lifecycle/t$e;", "", "<init>", "()V", "Ll/nll0;", "viewModel", "", "a", "(Ll/nll0;)V", "lifecycle-viewmodel_release"}, m88122k = 1, m88123mv = {2, 0, 0}, m88125xi = 48)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static class e {
        /* JADX INFO: renamed from: a */
        public void mo3066a(@NotNull nll0 viewModel) {
            viewModel.getClass();
        }
    }

    /* JADX INFO: renamed from: androidx.lifecycle.t$f */
    @Metadata(m88120d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002"}, m88121d2 = {"androidx/lifecycle/t$f", "Ll/cvb$c;", "lifecycle-viewmodel_release"}, m88122k = 1, m88123mv = {2, 0, 0}, m88125xi = 48)
    public static final class f implements cvb.InterfaceC16370c<String> {
    }

    static {
        cvb.Companion companion = cvb.INSTANCE;
        f2341b = new f();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C0491t(@NotNull tll0 tll0Var) {
        tll0Var.getClass();
        sll0 viewModelStore = tll0Var.getViewModelStore();
        rll0 rll0Var = rll0.INSTANCE;
        this(viewModelStore, rll0Var.m182016b(tll0Var), rll0Var.m182015a(tll0Var));
    }

    @NotNull
    /* JADX INFO: renamed from: a */
    public <T extends nll0> T m3074a(@NotNull Class<T> modelClass) {
        modelClass.getClass();
        return (T) m3076c(JvmClassMappingKt.m88344e(modelClass));
    }

    @MainThread
    @NotNull
    /* JADX INFO: renamed from: b */
    public final <T extends nll0> T m3075b(@NotNull String key, @NotNull KClass<T> modelClass) {
        key.getClass();
        modelClass.getClass();
        return (T) this.impl.m172837d(modelClass, key);
    }

    @MainThread
    @NotNull
    /* JADX INFO: renamed from: c */
    public final <T extends nll0> T m3076c(@NotNull KClass<T> modelClass) {
        modelClass.getClass();
        return (T) pll0.m172836e(this.impl, modelClass, null, 2, null);
    }

    /* JADX INFO: renamed from: androidx.lifecycle.t$a */
    @Metadata(m88120d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\b\u0016\u0018\u0000 \u00182\u00020\u0001:\u0001\u0019B\u001b\b\u0002\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\t\b\u0016¢\u0006\u0004\b\u0006\u0010\bB\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\tJ/\u0010\u0010\u001a\u00028\u0000\"\b\b\u0000\u0010\u000b*\u00020\n2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J'\u0010\u0010\u001a\u00028\u0000\"\b\b\u0000\u0010\u000b*\u00020\n2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\fH\u0016¢\u0006\u0004\b\u0010\u0010\u0012J/\u0010\u0014\u001a\u00028\u0000\"\b\b\u0000\u0010\u000b*\u00020\n2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\f2\u0006\u0010\u0013\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u001a"}, m88121d2 = {"Landroidx/lifecycle/t$a;", "Landroidx/lifecycle/t$d;", "Landroid/app/Application;", "application", "", "unused", "<init>", "(Landroid/app/Application;I)V", "()V", "(Landroid/app/Application;)V", "Ll/nll0;", p7f.GPS_DIRECTION_TRUE, "Ljava/lang/Class;", "modelClass", "Ll/cvb;", "extras", PushService.COMMAND_CREATE, "(Ljava/lang/Class;Ll/cvb;)Ll/nll0;", "(Ljava/lang/Class;)Ll/nll0;", "app", "e", "(Ljava/lang/Class;Landroid/app/Application;)Ll/nll0;", "c", "Landroid/app/Application;", "Companion", "a", "lifecycle-viewmodel_release"}, m88122k = 1, m88123mv = {2, 0, 0}, m88125xi = 48)
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
        public static final cvb.InterfaceC16370c<Application> f2344e;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        @Nullable
        public final Application application;

        /* JADX INFO: renamed from: androidx.lifecycle.t$a$a, reason: collision with other inner class name and from kotlin metadata */
        @Metadata(m88120d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bR\u0018\u0010\t\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u000e"}, m88121d2 = {"Landroidx/lifecycle/t$a$a;", "", "<init>", "()V", "Landroid/app/Application;", "application", "Landroidx/lifecycle/t$a;", "a", "(Landroid/app/Application;)Landroidx/lifecycle/t$a;", "_instance", "Landroidx/lifecycle/t$a;", "Ll/cvb$c;", "APPLICATION_KEY", "Ll/cvb$c;", "lifecycle-viewmodel_release"}, m88122k = 1, m88123mv = {2, 0, 0}, m88125xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @JvmStatic
            @NotNull
            /* JADX INFO: renamed from: a */
            public final a m3080a(@NotNull Application application) {
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
        @Metadata(m88120d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002"}, m88121d2 = {"androidx/lifecycle/t$a$b", "Ll/cvb$c;", "lifecycle-viewmodel_release"}, m88122k = 1, m88123mv = {2, 0, 0}, m88125xi = 48)
        public static final class b implements cvb.InterfaceC16370c<Application> {
        }

        static {
            cvb.Companion companion = cvb.INSTANCE;
            f2344e = new b();
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public a(@NotNull Application application) {
            this(application, 0);
            application.getClass();
        }

        @Override // androidx.lifecycle.C0491t.d, androidx.lifecycle.C0491t.c
        @NotNull
        public <T extends nll0> T create(@NotNull Class<T> modelClass, @NotNull cvb extras) {
            modelClass.getClass();
            extras.getClass();
            if (this.application != null) {
                return (T) create(modelClass);
            }
            Application application = (Application) extras.mo112786a(f2344e);
            if (application != null) {
                return (T) m3079e(modelClass, application);
            }
            if (!AndroidViewModel.class.isAssignableFrom(modelClass)) {
                return (T) super.create(modelClass);
            }
            wg3.m206174a("CreationExtras must have an application by `APPLICATION_KEY`");
            return null;
        }

        /* JADX INFO: renamed from: e */
        public final <T extends nll0> T m3079e(Class<T> modelClass, Application app) {
            if (!AndroidViewModel.class.isAssignableFrom(modelClass)) {
                return (T) super.create(modelClass);
            }
            try {
                T tNewInstance = modelClass.getConstructor(Application.class).newInstance(app);
                tNewInstance.getClass();
                return tNewInstance;
            } catch (IllegalAccessException e) {
                u1d0.m193953a("Cannot create an instance of ", modelClass, e);
                return null;
            } catch (InstantiationException e2) {
                u1d0.m193953a("Cannot create an instance of ", modelClass, e2);
                return null;
            } catch (NoSuchMethodException e3) {
                u1d0.m193953a("Cannot create an instance of ", modelClass, e3);
                return null;
            } catch (InvocationTargetException e4) {
                u1d0.m193953a("Cannot create an instance of ", modelClass, e4);
                return null;
            }
        }

        public a() {
            this(null, 0);
        }

        public a(Application application, int i) {
            this.application = application;
        }

        @Override // androidx.lifecycle.C0491t.d, androidx.lifecycle.C0491t.c
        @NotNull
        public <T extends nll0> T create(@NotNull Class<T> modelClass) {
            modelClass.getClass();
            Application application = this.application;
            if (application != null) {
                return (T) m3079e(modelClass, application);
            }
            pr3.m173429a("AndroidViewModelFactory constructed with empty constructor works only with create(modelClass: Class<T>, extras: CreationExtras).");
            return null;
        }
    }

    /* JADX INFO: renamed from: androidx.lifecycle.t$c */
    @Metadata(m88120d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u0000 \r2\u00020\u0001:\u0001\u000eJ'\u0010\u0006\u001a\u00028\u0000\"\b\b\u0000\u0010\u0003*\u00020\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J/\u0010\u0006\u001a\u00028\u0000\"\b\b\u0000\u0010\u0003*\u00020\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u00042\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0006\u0010\nJ/\u0010\u0006\u001a\u00028\u0000\"\b\b\u0000\u0010\u0003*\u00020\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u000b2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0006\u0010\fø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u000fÀ\u0006\u0001"}, m88121d2 = {"Landroidx/lifecycle/t$c;", "", "Ll/nll0;", p7f.GPS_DIRECTION_TRUE, "Ljava/lang/Class;", "modelClass", PushService.COMMAND_CREATE, "(Ljava/lang/Class;)Ll/nll0;", "Ll/cvb;", "extras", "(Ljava/lang/Class;Ll/cvb;)Ll/nll0;", "Lkotlin/reflect/KClass;", "(Lkotlin/reflect/KClass;Ll/cvb;)Ll/nll0;", "Companion", "a", "lifecycle-viewmodel_release"}, m88122k = 1, m88123mv = {2, 0, 0}, m88125xi = 48)
    public interface c {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = Companion.f2346a;

        /* JADX INFO: renamed from: androidx.lifecycle.t$c$a, reason: from kotlin metadata */
        @Metadata(m88120d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m88121d2 = {"Landroidx/lifecycle/t$c$a;", "", "<init>", "()V", "lifecycle-viewmodel_release"}, m88122k = 1, m88123mv = {2, 0, 0}, m88125xi = 48)
        public static final class Companion {

            /* JADX INFO: renamed from: a */
            public static final /* synthetic */ Companion f2346a = new Companion();
        }

        @NotNull
        default <T extends nll0> T create(@NotNull KClass<T> modelClass, @NotNull cvb extras) {
            modelClass.getClass();
            extras.getClass();
            return (T) create(JvmClassMappingKt.m88341b(modelClass), extras);
        }

        @NotNull
        default <T extends nll0> T create(@NotNull Class<T> modelClass, @NotNull cvb extras) {
            modelClass.getClass();
            extras.getClass();
            return (T) create(modelClass);
        }

        @NotNull
        default <T extends nll0> T create(@NotNull Class<T> modelClass) {
            modelClass.getClass();
            return (T) rll0.INSTANCE.m182018d();
        }
    }

    /* JADX INFO: renamed from: androidx.lifecycle.t$d */
    @Metadata(m88120d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0016\u0018\u0000 \u000f2\u00020\u0001:\u0001\u0010B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\b\u001a\u00028\u0000\"\b\b\u0000\u0010\u0005*\u00020\u00042\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006H\u0016¢\u0006\u0004\b\b\u0010\tJ/\u0010\b\u001a\u00028\u0000\"\b\b\u0000\u0010\u0005*\u00020\u00042\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u00062\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\b\u0010\fJ/\u0010\b\u001a\u00028\u0000\"\b\b\u0000\u0010\u0005*\u00020\u00042\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\r2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\b\u0010\u000e¨\u0006\u0011"}, m88121d2 = {"Landroidx/lifecycle/t$d;", "Landroidx/lifecycle/t$c;", "<init>", "()V", "Ll/nll0;", p7f.GPS_DIRECTION_TRUE, "Ljava/lang/Class;", "modelClass", PushService.COMMAND_CREATE, "(Ljava/lang/Class;)Ll/nll0;", "Ll/cvb;", "extras", "(Ljava/lang/Class;Ll/cvb;)Ll/nll0;", "Lkotlin/reflect/KClass;", "(Lkotlin/reflect/KClass;Ll/cvb;)Ll/nll0;", "Companion", "a", "lifecycle-viewmodel_release"}, m88122k = 1, m88123mv = {2, 0, 0}, m88125xi = 48)
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
        public static final cvb.InterfaceC16370c<String> f2348b = C0491t.f2341b;

        /* JADX INFO: renamed from: androidx.lifecycle.t$d$a, reason: from kotlin metadata */
        @Metadata(m88120d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\b\u001a\u00020\u00048GX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0007\u0010\u0003\u001a\u0004\b\u0005\u0010\u0006R\u0018\u0010\t\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010\nR\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u000f"}, m88121d2 = {"Landroidx/lifecycle/t$d$a;", "", "<init>", "()V", "Landroidx/lifecycle/t$d;", "a", "()Landroidx/lifecycle/t$d;", "getInstance$annotations", "instance", "_instance", "Landroidx/lifecycle/t$d;", "Ll/cvb$c;", "", "VIEW_MODEL_KEY", "Ll/cvb$c;", "lifecycle-viewmodel_release"}, m88122k = 1, m88123mv = {2, 0, 0}, m88125xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
            @NotNull
            /* JADX INFO: renamed from: a */
            public final d m3085a() {
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

        @Override // androidx.lifecycle.C0491t.c
        @NotNull
        public <T extends nll0> T create(@NotNull KClass<T> modelClass, @NotNull cvb extras) {
            modelClass.getClass();
            extras.getClass();
            return (T) create(JvmClassMappingKt.m88341b(modelClass), extras);
        }

        @Override // androidx.lifecycle.C0491t.c
        @NotNull
        public <T extends nll0> T create(@NotNull Class<T> modelClass, @NotNull cvb extras) {
            modelClass.getClass();
            extras.getClass();
            return (T) create(modelClass);
        }

        @Override // androidx.lifecycle.C0491t.c
        @NotNull
        public <T extends nll0> T create(@NotNull Class<T> modelClass) {
            modelClass.getClass();
            return (T) yvq.INSTANCE.m217554a(modelClass);
        }
    }

    public C0491t(pll0 pll0Var) {
        this.impl = pll0Var;
    }

    public /* synthetic */ C0491t(sll0 sll0Var, c cVar, cvb cvbVar, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(sll0Var, cVar, (i & 4) != 0 ? cvb.C16369b.INSTANCE : cvbVar);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public C0491t(@NotNull sll0 sll0Var, @NotNull c cVar, @NotNull cvb cvbVar) {
        this(new pll0(sll0Var, cVar, cvbVar));
        sll0Var.getClass();
        cVar.getClass();
        cvbVar.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public C0491t(@NotNull sll0 sll0Var, @NotNull c cVar) {
        this(sll0Var, cVar, null, 4, null);
        sll0Var.getClass();
        cVar.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C0491t(@NotNull tll0 tll0Var, @NotNull c cVar) {
        this(tll0Var.getViewModelStore(), cVar, rll0.INSTANCE.m182015a(tll0Var));
        tll0Var.getClass();
        cVar.getClass();
    }
}
