package com.tantanapp.sharedlibrary.loader;

import android.content.Context;
import com.clevertap.android.sdk.Constants;
import com.immomo.momomediaext.sei.BaseSei;
import com.p046p1.mobile.putong.data.ResourceDirection;
import com.p046p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.tantanapp.common.utils.ThreadUtil;
import com.tantanapp.sharedlibrary.loader.SharedLibraryLoader;
import com.tantanapp.sharedlibrary.loader.internal.MigrateHelper;
import com.tantanapp.sharedlibrary.loader.internal.ModuleLoader;
import com.tantanapp.sharedlibrary.loader.internal.NoReportException;
import com.tantanapp.sharedlibrary.loader.internal.UtilKt;
import java.io.File;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p133rx.C22306c;
import p133rx.schedulers.Schedulers;
import p133rx.subjects.C22392a;
import p149l.bii;
import p149l.e30;
import p149l.ibe;
import p149l.ig3;
import p149l.jo0;
import p149l.lri0;
import p149l.qkq0;
import p149l.rh80;
import p149l.w9j;
import p149l.z3g0;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(m87231d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u0000 82\u00020\u0001:\u0002 $B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\bJ\u0017\u0010\f\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\f\u0010\rJ+\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\n2\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00060\u000fH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J'\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\n2\u0006\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0015\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u0019\u0010\u001aJ'\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00060\u001c2\u0006\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\u001b\u001a\u00020\u0018H\u0007¢\u0006\u0004\b\u001d\u0010\u001eJ'\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00100\u001c2\u0006\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\u001b\u001a\u00020\u0018H\u0007¢\u0006\u0004\b\u001f\u0010\u001eR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u0018\u0010&\u001a\u0004\u0018\u00010\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010%R\u001b\u0010+\u001a\u00020\u00068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*R \u00100\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020-0,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\"\u00107\u001a\u00020\u00188\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b1\u00102\u001a\u0004\b3\u00104\"\u0004\b5\u00106¨\u00069"}, m87232d2 = {"Lcom/tantanapp/sharedlibrary/loader/SharedLibraryLoader;", "", "Lcom/tantanapp/sharedlibrary/loader/a;", Constants.KEY_CONFIG, "<init>", "(Lcom/tantanapp/sharedlibrary/loader/a;)V", "", "n", "()V", "o", "", "business", "j", "(Ljava/lang/String;)Ljava/lang/String;", "module", "Lkotlin/Function1;", "Lcom/tantanapp/sharedlibrary/loader/LoadEvent;", "callback", "p", "(Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V", "", "throwable", BaseSei.f13930X, "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V", "", "q", "(Ljava/lang/String;)Z", "failureAsError", "Lrx/c;", BLiveStormDanmakuGiftResourceType.f44446s, "(Ljava/lang/String;Z)Lrx/c;", ResourceDirection.f38808v, "a", "Lcom/tantanapp/sharedlibrary/loader/a;", BLiveStormDanmakuGiftResourceType.f44444l, "()Lcom/tantanapp/sharedlibrary/loader/a;", "b", "Ljava/lang/Throwable;", "initThrowable", "c", "Lkotlin/Lazy;", "m", "()Lkotlin/Unit;", "lazyInit", "", "Lcom/tantanapp/sharedlibrary/loader/SharedLibraryLoader$b;", Constants.INAPP_DATA_TAG, "Ljava/util/Map;", "loadStateMap", "e", "Z", "getTestFakeAllLoaded", "()Z", "setTestFakeAllLoaded", "(Z)V", "testFakeAllLoaded", "Companion", "loader_release"}, m87233k = 1, m87234mv = {1, 8, 0}, m87236xi = 48)
@SourceDebugExtension
public final class SharedLibraryLoader {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: f */
    @Nullable
    public static volatile SharedLibraryLoader f56181f;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final C13683a config;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    public Throwable initThrowable;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public final Lazy lazyInit;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public final Map<String, C13680b> loadStateMap;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public boolean testFakeAllLoaded;

    /* JADX INFO: renamed from: com.tantanapp.sharedlibrary.loader.SharedLibraryLoader$a, reason: from kotlin metadata */
    @Metadata(m87231d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\n\u0010\u000bR\u0018\u0010\f\u001a\u0004\u0018\u00010\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u000e"}, m87232d2 = {"Lcom/tantanapp/sharedlibrary/loader/SharedLibraryLoader$a;", "", "<init>", "()V", "Lcom/tantanapp/sharedlibrary/loader/a;", Constants.KEY_CONFIG, "", "b", "(Lcom/tantanapp/sharedlibrary/loader/a;)V", "Lcom/tantanapp/sharedlibrary/loader/SharedLibraryLoader;", "a", "()Lcom/tantanapp/sharedlibrary/loader/SharedLibraryLoader;", "instance", "Lcom/tantanapp/sharedlibrary/loader/SharedLibraryLoader;", "loader_release"}, m87233k = 1, m87234mv = {1, 8, 0}, m87236xi = 48)
    @SourceDebugExtension
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        @NotNull
        /* JADX INFO: renamed from: a */
        public final SharedLibraryLoader m81469a() {
            SharedLibraryLoader sharedLibraryLoader = SharedLibraryLoader.f56181f;
            if (sharedLibraryLoader != null) {
                return sharedLibraryLoader;
            }
            ig3.m135964a("Required value was null.");
            return null;
        }

        @JvmStatic
        /* JADX INFO: renamed from: b */
        public final void m81470b(@NotNull C13683a config) {
            config.getClass();
            if (SharedLibraryLoader.f56181f != null) {
                return;
            }
            synchronized (this) {
                if (SharedLibraryLoader.f56181f != null) {
                    return;
                }
                SharedLibraryLoader sharedLibraryLoader = new SharedLibraryLoader(config, null);
                SharedLibraryLoader.f56181f = sharedLibraryLoader;
                sharedLibraryLoader.m81460n();
                Unit unit = Unit.INSTANCE;
            }
        }

        public Companion() {
        }
    }

    public SharedLibraryLoader(C13683a c13683a) {
        this.config = c13683a;
        this.lazyInit = LazyKt__LazyJVMKt.m87229b(new Function0<Unit>() { // from class: com.tantanapp.sharedlibrary.loader.SharedLibraryLoader$lazyInit$2
            {
                super(0);
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                UtilKt.m81522c("start lazyInit");
                SharedLibraryLoader sharedLibraryLoader = this.this$0;
                try {
                    Result.Companion companion = Result.INSTANCE;
                    UtilKt.m81522c("config=" + sharedLibraryLoader.getConfig());
                    Result.m223820constructorimpl(Unit.INSTANCE);
                } catch (Throwable th) {
                    Result.Companion companion2 = Result.INSTANCE;
                    Result.m223820constructorimpl(ResultKt.m87238a(th));
                }
                rh80 rh80Var = rh80.INSTANCE;
                rh80Var.m179339a();
                Context context = this.this$0.getConfig().getContext();
                final SharedLibraryLoader sharedLibraryLoader2 = this.this$0;
                Function2<Integer, Integer, Unit> function2 = new Function2<Integer, Integer, Unit>() { // from class: com.tantanapp.sharedlibrary.loader.SharedLibraryLoader$lazyInit$2.2
                    {
                        super(2);
                    }

                    public final void invoke(int i, int i2) {
                        SharedLibraryLoader sharedLibraryLoader3 = sharedLibraryLoader2;
                        try {
                            Result.Companion companion3 = Result.INSTANCE;
                            UtilKt.m81522c("delete old files");
                            if (i <= 0) {
                                UtilKt.m81524e(new File(sharedLibraryLoader3.getConfig().getContext().getApplicationInfo().dataDir, BLiveStormDanmakuGiftResourceType.f44446s));
                            } else if (i == 1) {
                                File[] fileArrListFiles = sharedLibraryLoader3.getConfig().m81485k().listFiles();
                                if (fileArrListFiles == null) {
                                    fileArrListFiles = new File[0];
                                }
                                ArrayList<File> arrayList = new ArrayList();
                                for (File file : fileArrListFiles) {
                                    if (file.isFile() && Intrinsics.m87488d(bii.m102043s(file), "zip")) {
                                        arrayList.add(file);
                                    }
                                }
                                for (File file2 : arrayList) {
                                    file2.getClass();
                                    UtilKt.m81524e(file2);
                                }
                            }
                            Result.m223820constructorimpl(Unit.INSTANCE);
                        } catch (Throwable th2) {
                            Result.Companion companion4 = Result.INSTANCE;
                            Result.m223820constructorimpl(ResultKt.m87238a(th2));
                        }
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Integer num, Integer num2) {
                        invoke(num.intValue(), num2.intValue());
                        return Unit.INSTANCE;
                    }
                };
                final SharedLibraryLoader sharedLibraryLoader3 = this.this$0;
                rh80Var.m179340b(context, function2, new Function0<Unit>() { // from class: com.tantanapp.sharedlibrary.loader.SharedLibraryLoader$lazyInit$2.3
                    {
                        super(0);
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2() {
                        SharedLibraryLoader sharedLibraryLoader4 = sharedLibraryLoader3;
                        try {
                            Result.Companion companion3 = Result.INSTANCE;
                            UtilKt.m81522c("delete unused zip and so");
                            MigrateHelper.INSTANCE.m81497a(sharedLibraryLoader4.getConfig());
                            Result.m223820constructorimpl(Unit.INSTANCE);
                        } catch (Throwable th2) {
                            Result.Companion companion4 = Result.INSTANCE;
                            Result.m223820constructorimpl(ResultKt.m87238a(th2));
                        }
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public /* bridge */ /* synthetic */ Unit invoke() {
                        invoke2();
                        return Unit.INSTANCE;
                    }
                });
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }
        });
        this.loadStateMap = new LinkedHashMap();
    }

    /* JADX INFO: renamed from: a */
    public static void m81445a(SharedLibraryLoader sharedLibraryLoader, final String str, final String str2, final boolean z, final z3g0 z3g0Var) {
        sharedLibraryLoader.getClass();
        str.getClass();
        str2.getClass();
        sharedLibraryLoader.m81462p(str, new Function1<LoadEvent, Unit>() { // from class: com.tantanapp.sharedlibrary.loader.SharedLibraryLoader$loadEvent$1$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull LoadEvent loadEvent) {
                loadEvent.getClass();
                UtilKt.m81522c("business=" + str2 + ", module=" + str + ": " + loadEvent);
                if (z && loadEvent.m81439d()) {
                    z3g0Var.onError(loadEvent.m81440e());
                } else {
                    z3g0Var.onNext(loadEvent);
                }
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(LoadEvent loadEvent) {
                invoke2(loadEvent);
                return Unit.INSTANCE;
            }
        });
    }

    /* JADX INFO: renamed from: b */
    public static Boolean m81446b(Function1 function1, Object obj) {
        function1.getClass();
        return (Boolean) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: c */
    public static void m81447c(Function1 function1, Object obj) {
        function1.getClass();
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: d */
    public static void m81448d(SharedLibraryLoader sharedLibraryLoader, String str, String str2, C13680b c13680b, Throwable th) {
        sharedLibraryLoader.getClass();
        str.getClass();
        str2.getClass();
        c13680b.getClass();
        th.getClass();
        sharedLibraryLoader.m81468x(str, str2, th);
        C22392a<LoadEvent> c22392aM81471a = c13680b.m81471a();
        if (c22392aM81471a != null) {
            c22392aM81471a.onError(th);
        }
        c13680b.m81473c(null);
    }

    /* JADX INFO: renamed from: e */
    public static C22306c m81449e(Function1 function1, Object obj) {
        function1.getClass();
        return (C22306c) function1.invoke(obj);
    }

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: k */
    public static final SharedLibraryLoader m81454k() {
        return INSTANCE.m81469a();
    }

    /* JADX INFO: renamed from: t */
    public static /* synthetic */ C22306c m81455t(SharedLibraryLoader sharedLibraryLoader, String str, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = true;
        }
        return sharedLibraryLoader.m81465s(str, z);
    }

    /* JADX INFO: renamed from: w */
    public static /* synthetic */ C22306c m81456w(SharedLibraryLoader sharedLibraryLoader, String str, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = true;
        }
        return sharedLibraryLoader.m81467v(str, z);
    }

    /* JADX INFO: renamed from: j */
    public final String m81457j(String business) {
        return this.config.getUseObb() ? "global" : business;
    }

    @NotNull
    /* JADX INFO: renamed from: l, reason: from getter */
    public final C13683a getConfig() {
        return this.config;
    }

    /* JADX INFO: renamed from: m */
    public final Unit m81459m() {
        this.lazyInit.getValue();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: n */
    public final void m81460n() {
        Object objM223820constructorimpl;
        try {
            Result.Companion companion = Result.INSTANCE;
            m81461o();
            objM223820constructorimpl = Result.m223820constructorimpl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            objM223820constructorimpl = Result.m223820constructorimpl(ResultKt.m87238a(th));
        }
        this.initThrowable = Result.m223823exceptionOrNullimpl(objM223820constructorimpl);
    }

    /* JADX INFO: renamed from: o */
    public final void m81461o() {
        File fileM81525f = UtilKt.m81525f(this.config.m81486l());
        if (lri0.m151377c(this.config, fileM81525f)) {
            return;
        }
        ibe.m135253a("initSoPath failed: ", fileM81525f);
    }

    /* JADX INFO: renamed from: p */
    public final void m81462p(String module, Function1<? super LoadEvent, Unit> callback) {
        LoadEvent.Companion companion = LoadEvent.INSTANCE;
        LoadEvent.Step step = LoadEvent.Step.Init;
        callback.invoke(companion.m81443b(step));
        Throwable th = this.initThrowable;
        if (th != null) {
            callback.invoke(companion.m81442a(step, th));
            return;
        }
        m81459m();
        callback.invoke(LoadEvent.Companion.m81441d(companion, step, null, 2, null));
        ModuleLoader.INSTANCE.m81511m(this.config, module, callback);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: q */
    public final boolean m81463q(@NotNull String business) {
        business.getClass();
        if (this.testFakeAllLoaded) {
            return true;
        }
        String strM81457j = m81457j(business);
        Map<String, C13680b> map = this.loadStateMap;
        C13680b c13680b = map.get(strM81457j);
        if (c13680b == null) {
            c13680b = new C13680b(null, false, 3, 0 == true ? 1 : 0);
            map.put(strM81457j, c13680b);
        }
        return c13680b.getIsLoaded();
    }

    @JvmOverloads
    @NotNull
    /* JADX INFO: renamed from: r */
    public final C22306c<Unit> m81464r(@NotNull String str) {
        str.getClass();
        return m81455t(this, str, false, 2, null);
    }

    @JvmOverloads
    @NotNull
    /* JADX INFO: renamed from: s */
    public final C22306c<Unit> m81465s(@NotNull String business, boolean failureAsError) {
        business.getClass();
        C22306c<LoadEvent> c22306cM81467v = m81467v(business, failureAsError);
        final SharedLibraryLoader$load$1 sharedLibraryLoader$load$1 = new Function1<LoadEvent, Boolean>() { // from class: com.tantanapp.sharedlibrary.loader.SharedLibraryLoader$load$1
            @Override // kotlin.jvm.functions.Function1
            public final Boolean invoke(LoadEvent loadEvent) {
                return Boolean.valueOf(loadEvent.m81438c());
            }
        };
        C22306c<LoadEvent> c22306cFilter = c22306cM81467v.filter(new w9j() { // from class: l.ove0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return SharedLibraryLoader.m81446b(sharedLibraryLoader$load$1, obj);
            }
        });
        final SharedLibraryLoader$load$2 sharedLibraryLoader$load$2 = new Function1<LoadEvent, C22306c<? extends Unit>>() { // from class: com.tantanapp.sharedlibrary.loader.SharedLibraryLoader$load$2
            @Override // kotlin.jvm.functions.Function1
            public final C22306c<? extends Unit> invoke(LoadEvent loadEvent) {
                return C22306c.just(Unit.INSTANCE);
            }
        };
        C22306c c22306cFlatMap = c22306cFilter.flatMap(new w9j() { // from class: l.pve0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return SharedLibraryLoader.m81449e(sharedLibraryLoader$load$2, obj);
            }
        });
        c22306cFlatMap.getClass();
        return c22306cFlatMap;
    }

    @JvmOverloads
    @NotNull
    /* JADX INFO: renamed from: u */
    public final C22306c<LoadEvent> m81466u(@NotNull String str) {
        str.getClass();
        return m81456w(this, str, false, 2, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @JvmOverloads
    @NotNull
    /* JADX INFO: renamed from: v */
    public final C22306c<LoadEvent> m81467v(@NotNull final String business, final boolean failureAsError) {
        business.getClass();
        C22392a c22392a = null;
        Object[] objArr = 0;
        if (!ThreadUtil.m81311f()) {
            qkq0.m175383a("Load can only be called in main thread!");
            return null;
        }
        if (this.testFakeAllLoaded) {
            C22306c<LoadEvent> c22306cJust = C22306c.just(LoadEvent.Companion.m81441d(LoadEvent.INSTANCE, (LoadEvent.Step) ArraysKt.last(LoadEvent.Step.values()), null, 2, null));
            c22306cJust.getClass();
            return c22306cJust;
        }
        final String strM81457j = m81457j(business);
        Map<String, C13680b> map = this.loadStateMap;
        C13680b c13680b = map.get(strM81457j);
        if (c13680b == null) {
            c13680b = new C13680b(c22392a, false, 3, objArr == true ? 1 : 0);
            map.put(strM81457j, c13680b);
        }
        final C13680b c13680b2 = c13680b;
        C22392a<LoadEvent> c22392aM81471a = c13680b2.m81471a();
        if (c22392aM81471a != null) {
            return c22392aM81471a;
        }
        C22392a<LoadEvent> c22392aM221512b = C22392a.m221512b();
        C22306c c22306cObserveOn = C22306c.create(new C22306c.a() { // from class: l.lve0
            @Override // p149l.e30
            public final void call(Object obj) {
                SharedLibraryLoader.m81445a(this.f130155a, strM81457j, business, failureAsError, (z3g0) obj);
            }
        }).subscribeOn(Schedulers.m221493io()).observeOn(jo0.m142408a());
        final Function1<LoadEvent, Unit> function1 = new Function1<LoadEvent, Unit>() { // from class: com.tantanapp.sharedlibrary.loader.SharedLibraryLoader$loadEvent$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(LoadEvent loadEvent) {
                if (loadEvent.m81439d()) {
                    this.this$0.m81468x(business, strM81457j, loadEvent.m81440e());
                }
                if (loadEvent.m81438c()) {
                    c13680b2.m81474d(true);
                }
                C22392a<LoadEvent> c22392aM81471a2 = c13680b2.m81471a();
                if (c22392aM81471a2 != null) {
                    c22392aM81471a2.onNext(loadEvent);
                }
                if (loadEvent.m81439d() || loadEvent.m81438c()) {
                    C22392a<LoadEvent> c22392aM81471a3 = c13680b2.m81471a();
                    if (c22392aM81471a3 != null) {
                        c22392aM81471a3.onCompleted();
                    }
                    c13680b2.m81473c(null);
                }
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(LoadEvent loadEvent) {
                invoke2(loadEvent);
                return Unit.INSTANCE;
            }
        };
        c22306cObserveOn.subscribe(new e30() { // from class: l.mve0
            @Override // p149l.e30
            public final void call(Object obj) {
                SharedLibraryLoader.m81447c(function1, obj);
            }
        }, new e30() { // from class: l.nve0
            @Override // p149l.e30
            public final void call(Object obj) {
                SharedLibraryLoader.m81448d(this.f140711a, business, strM81457j, c13680b2, (Throwable) obj);
            }
        });
        c13680b2.m81473c(c22392aM221512b);
        return c22392aM221512b;
    }

    /* JADX INFO: renamed from: x */
    public final void m81468x(String business, String module, Throwable throwable) {
        C13683a.b errorReporter;
        UtilKt.m81521b("business=" + business + ", module=" + module + ", throwable=" + throwable);
        if ((throwable instanceof NoReportException) || (errorReporter = this.config.getErrorReporter()) == null) {
            return;
        }
        errorReporter.mo81489a(business, module, throwable);
    }

    /* JADX INFO: renamed from: com.tantanapp.sharedlibrary.loader.SharedLibraryLoader$b */
    @Metadata(m87231d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0002\u0018\u00002\u00020\u0001B#\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bR*\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010\n\u001a\u0004\b\t\u0010\u000b\"\u0004\b\f\u0010\rR\"\u0010\u0006\u001a\u00020\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u000e\u0010\u0010\"\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, m87232d2 = {"Lcom/tantanapp/sharedlibrary/loader/SharedLibraryLoader$b;", "", "Lrx/subjects/a;", "Lcom/tantanapp/sharedlibrary/loader/LoadEvent;", "loadEventBs", "", "isLoaded", "<init>", "(Lrx/subjects/a;Z)V", "a", "Lrx/subjects/a;", "()Lrx/subjects/a;", "c", "(Lrx/subjects/a;)V", "b", "Z", "()Z", Constants.INAPP_DATA_TAG, "(Z)V", "loader_release"}, m87233k = 1, m87234mv = {1, 8, 0}, m87236xi = 48)
    public static final class C13680b {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @Nullable
        public C22392a<LoadEvent> loadEventBs;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        public boolean isLoaded;

        public /* synthetic */ C13680b(C22392a c22392a, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : c22392a, (i & 2) != 0 ? false : z);
        }

        @Nullable
        /* JADX INFO: renamed from: a */
        public final C22392a<LoadEvent> m81471a() {
            return this.loadEventBs;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final boolean getIsLoaded() {
            return this.isLoaded;
        }

        /* JADX INFO: renamed from: c */
        public final void m81473c(@Nullable C22392a<LoadEvent> c22392a) {
            this.loadEventBs = c22392a;
        }

        /* JADX INFO: renamed from: d */
        public final void m81474d(boolean z) {
            this.isLoaded = z;
        }

        public C13680b(@Nullable C22392a<LoadEvent> c22392a, boolean z) {
            this.loadEventBs = c22392a;
            this.isLoaded = z;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public C13680b() {
            this(null, false, 3, 0 == true ? 1 : 0);
        }
    }

    public /* synthetic */ SharedLibraryLoader(C13683a c13683a, DefaultConstructorMarker defaultConstructorMarker) {
        this(c13683a);
    }
}
